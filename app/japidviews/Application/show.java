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
// NOTE: This file was generated from: japidviews/Application/show.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class show extends main{
	public static final String sourceTemplate = "japidviews/Application/show.html";
static private final String static_0 = ""
;
static private final String static_1 = ""
;
static private final String static_2 = ""
;
static private final String static_3 = ""
;
static private final String static_4 = "\n" + 
"<ul id=\"pagination\">\n" + 
"    "
;
static private final String static_5 = "        <li id=\"previous\">\n" + 
"            <a href=\""
;
static private final String static_6 = "\">"
;
static private final String static_7 = "</a>\n" + 
"        </li>\n" + 
"    "
;
static private final String static_8 = "    "
;
static private final String static_9 = "        <li id=\"next\">\n" + 
"            <a href=\""
;
static private final String static_10 = "\">"
;
static private final String static_11 = "</a>\n" + 
"        </li>\n" + 
"    "
;
static private final String static_12 = "</ul>\n" + 
"\n" + 
"";
static private final String static_13 = "    <p class=\"success\">"
;
static private final String static_14 = "</p>\n" + 
"";
static private final String static_15 = " \n" + 
"";
static private final String static_16 = "\n" + 
"<h3>Post your comment 1:</h3>\n" + 
" \n" + 
"<form action='"
;
static private final String static_17 = "' method=\"POST\"> \n" + 
"    "
;
static private final String static_18 = "        <p class=\"error\">\n" + 
"            "
;
static private final String static_19 = "        </p>\n" + 
"    "
;
static private final String static_20 = " \n" + 
"    <p>\n" + 
"        <label for=\"author\">Your name: </label>\n" + 
"        <input type=\"text\" name=\"author\" id=\"author\" value='"
;
static private final String static_21 = "' />\n" + 
"    </p>\n" + 
"    <p>\n" + 
"        <label for=\"content\">Your message: </label>\n" + 
"        <textarea name=\"content\" id=\"content\">"
;
static private final String static_22 = "</textarea>\n" + 
"    </p>\n" + 
"    <p>\n" + 
" 		"
;
static private final String static_23 = "    </p>\n" + 
"    <p>\n" + 
"        <input type=\"submit\" value=\"Submit your comment\" />\n" + 
"    </p>\n" + 
"</form>\n" + 
"\n" + 
"<script type=\"text/javascript\" charset=\"utf-8\">\n" + 
"    $(function() {         \n" + 
"        // Expose the form \n" + 
"        $('form').click(function() { \n" + 
"            $('form').expose({api: true}).load(); \n" + 
"        }); \n" + 
"        \n" + 
"        // If there is an error, focus to form\n" + 
"        if($('form .error').size()) {\n" + 
"            $('form').expose({api: true, loadSpeed: 0}).load(); \n" + 
"            $('form input').get(0).focus();\n" + 
"        }\n" + 
"    });\n" + 
"    // depends on JQuery\n" + 
"</script>"
;
	public show() {
		super(null);
	}
	public show(StringBuilder out) {
		super(out);
	}
	Post post;
	public cn.bran.japid.template.RenderResult render(Post post) {
		this.post = post;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
p(static_0);// line 1
p(static_1);// line 1
p(static_2);// line 2
p(static_3);// line 3
// line 5
p(static_4);// line 5
if (post.previous() != null) { // line 8
p(static_5);// line 8
p(lookup("Application.show", post.previous().id));// line 10
p(static_6);// line 10
p(post.previous().title);// line 10
p(static_7);// line 10
}// line 12
p(static_8);// line 12
if (post.next() != null) {// line 13
p(static_9);// line 13
p(lookup("Application.show", post.next().id));// line 15
p(static_10);// line 15
p(post.next().title);// line 15
p(static_11);// line 15
}// line 17
p(static_12);// line 17
if(flash.hasSuccess()){// line 20
p(static_13);// line 20
p(flash.success());// line 21
p(static_14);// line 21
}// line 22
p(static_15);// line 22
_display1.setActionRunners(getActionRunners());
_display1.render(post, "full");
// line 24
p(static_16);// line 24
p(lookup("Application.postComment", post.id));// line 28
p(static_17);// line 28
if(hasErrors()){// line 29
p(static_18);// line 29
p(errors().get(0));// line 31
p(static_19);// line 31
}// line 33
p(static_20);// line 33
p(params.get("author"));// line 37
p(static_21);// line 37
p(params.get("content"));// line 41
p(static_22);// line 41
		actionRunners.put(getOut().length(), new cn.bran.japid.template.ActionRunner() {
			@Override
			public cn.bran.japid.template.RenderResult run() {
				try {
					play.classloading.enhancers.ControllersEnhancer.ControllerInstrumentation.initActionCall();
					Application.captchaBlock();
				} catch (cn.bran.play.JapidResult jr) {
					return jr.getRenderResult();
				}
				throw new RuntimeException("No render result from running: Application.captchaBlock()");
			}
		});
// line 44
p(static_23);// line 44

	}
	@Override protected void title() {
		p(post.title);;
	}
	private display _display1 = new display(getOut());
}
