package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import cn.bran.japid.template.ActionRunner;
import japidviews._layouts.*;
import play.mvc.Scope.*;
import models.*;
import japidviews._tags.*;
import controllers.*;
import japidviews._javatags.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static cn.bran.play.WebUtils.*;
// NOTE: This file was generated from: japidviews/Application/superpanel.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class superpanel extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/Application/superpanel.html";
static private final String static_0 = ""
;
static private final String static_1 = "\n" + 
"This is superpanel @ "
;
static private final String static_2 = "\n" + 
"\n" + 
"";
static private final String static_3 = "\n" + 
"\n" + 
"";
static private final String static_4 = "\n" + 
"";
	public superpanel() {
		super(null);
	}
	public superpanel(StringBuilder out) {
		super(out);
	}
	String who;
	public cn.bran.japid.template.RenderResult render(String who) {
		this.who = who;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
p(static_0);// line 1
p(static_1);// line 1
p(new Date());// line 3
p(static_2);// line 3
		actionRunners.put(getOut().length(), new cn.bran.play.CacheablePlayActionRunner("10s", "Application.panel1", who.hashCode(),who.toUpperCase()) {
			@Override
			public void runPlayAction() throws cn.bran.play.JapidResult {
				Application.panel1(who); //
			}
		});

// line 5
p(static_3);// line 5
		actionRunners.put(getOut().length(), new cn.bran.japid.template.ActionRunner() {
			@Override
			public cn.bran.japid.template.RenderResult run() {
				try {
					play.classloading.enhancers.ControllersEnhancer.ControllerInstrumentation.initActionCall();
					Application.panel2(who);
				} catch (cn.bran.play.JapidResult jr) {
					return jr.getRenderResult();
				}
				throw new RuntimeException("No render result from running: Application.panel2(who)");
			}
		});
// line 7
p(static_4);// line 7

	}
}
