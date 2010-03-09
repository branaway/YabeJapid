package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import japidviews._layouts.*;
import play.mvc.Scope.*;
import models.*;
import japidviews._tags.*;
import controllers.*;
import japidviews._javatags.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
// NOTE: This file was generated from: japidviews/Application/index.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class index extends main{
	public static final String sourceTemplate = "japidviews/Application/index.html";
{
	headers.put("Content-Type", "text/html");
}
static private final String static_0 = ""
;
static private final String static_1 = ""
;
static private final String static_2 = ""
;
static private final String static_3 = "\n" + 
"";
static private final String static_4 = "HOME "
;
static private final String static_5 = "\n" + 
"";
static private final String static_6 = "    "
;
static private final String static_7 = "    "
;
static private final String static_8 = "        <div class=\"older-posts\">    \n" + 
"            <h3>Older posts <span class=\"from\">from the blog</span></h3>\n" + 
"			"
;
static private final String static_9 = "				"
;
static private final String static_10 = "            "
;
static private final String static_11 = "        </div>\n" + 
"    "
;
static private final String static_12 = ""
;
static private final String static_13 = "    <div class=\"empty\">\n" + 
"        There is currently nothing to read here.\n" + 
"    </div>\n" + 
"";
	public index() {
		super(null);
	}
	public index(StringBuilder out) {
		super(out);
	}
	Post frontPost;
	List<Post> olderPosts;
	public cn.bran.japid.template.RenderResult render(Post frontPost, List<Post> olderPosts) {
		this.frontPost = frontPost;
		this.olderPosts = olderPosts;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
p(static_0);// line 1
p(static_1);// line 1
p(static_2);// line 2
p(static_3);// line 3
// line 6
p(static_5);// line 6
if(frontPost != null) {// line 8
p(static_6);// line 8
_display1.setActionRunners(getActionRunners());
_display1.render(frontPost, "home");
// line 9
p(static_7);// line 9
if (olderPosts.size() > 0) {// line 10
p(static_8);// line 10
for (Post p : olderPosts) {// line 13
p(static_9);// line 13
_display2.setActionRunners(getActionRunners());
_display2.render(p, "home");
// line 14
p(static_10);// line 14
}// line 15
p(static_11);// line 15
}// line 17
p(static_12);// line 17
} else {// line 18
p(static_13);// line 18
}// line 22

	}
	@Override protected void title() {
		// line 6
p(static_4);// line 6
;
	}
	private display _display1 = new display(getOut());
	private display _display2 = new display(getOut());
}
