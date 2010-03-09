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
// NOTE: This file was generated from: japidviews/Application/headers.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class headers extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/Application/headers.html";
static private final String static_0 = ""
;
static private final String static_1 = "\n" + 
"\n" + 
"Hello, "
;
static private final String static_2 = "!\n" + 
"";
	public headers() {
		super(null);
	}
	public headers(StringBuilder out) {
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
// line 1
p(static_1);// line 3
p(who);// line 5
p(static_2);// line 5

	}
}
