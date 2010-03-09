package bran.ant;

import java.io.File;
import java.util.Set;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.Target;
import org.apache.tools.ant.taskdefs.Delete;
import org.apache.tools.ant.types.FileSet;
import org.junit.Test;

import play.data.validation.Validation;
import play.templates.JavaExtensions;
import cn.bran.japid.ant.TranslateTemplateTask;
import cn.bran.play.DirUtil;
import cn.bran.play.JapidPlayAdapter;
import cn.bran.play.JapidPlugin;

/**
 * used to manually re-transform the templates
 * 
 */
public class TemplateTransformTests {

	private static final String TEMP_ROOT = "app";

	@Test
	public void updateJavaFilesFromTemps() {
		TranslateTemplateTask t = new TranslateTemplateTask();

		Project proj = new Project();
		t.setProject(proj);
		proj.init();
		
//		t.setUseStreaming(true); // use the streaming interfacem, 5%-10% slower than plain stringbuilder
		
		t.setSrcdir(new File(TEMP_ROOT));
		t.setIncludes(JapidPlugin.JAPIDVIEWS_ROOT + "/**/*.html");
		t.importStatic(JapidPlayAdapter.class);
		t.importStatic(Validation.class);
		t.importStatic(JavaExtensions.class);
//		t.addAnnotation(NoEnhance.class);
		t.addImport(JapidPlugin.JAPIDVIEWS_ROOT + "._layouts.*");
		t.addImport(JapidPlugin.JAPIDVIEWS_ROOT + "._tags.*");
		t.addImport(JapidPlugin.JAPIDVIEWS_ROOT + "._javatags.*");
		t.addImport("models.*");
		t.addImport("controllers.*");
		
		//		t.add(new ModifiedSelector());
		t.setOwningTarget(new Target());
		t.execute();
//		System.out.println("1");
	}

	@Test
	public void delAllGeneratedJava() {
		Delete t = new Delete();
		FileSet fs = new FileSet();
		fs.setDir(new File(TEMP_ROOT));
		fs.setIncludes(JapidPlugin.JAPIDVIEWS_ROOT + "/**/*.java");
		fs.setExcludes(JapidPlugin.JAPIDVIEWS_ROOT + "/" + JapidPlugin.JAVATAGS + "/**");
		t.addFileset(fs);
		Project proj = new Project();
		t.setProject(proj);
		proj.init();
		t.setTaskType("deljava");
		t.setTaskName("deljava");
		t.setOwningTarget(new Target());
		t.execute();
	}
	
	@Test
	public void regenerateAll() {
		delAllGeneratedJava();
		updateJavaFilesFromTemps();
	}
	
	@Test public void testOrphans() {
		try {
			Set<File> oj = DirUtil.findOrphanJava(new File("app/" +  JapidPlugin.JAPIDVIEWS_ROOT), null);
			System.out.println(oj);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
