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
// NOTE: This file was generated from: japidviews/Application/anew.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class anew extends main{
	public static final String sourceTemplate = "japidviews/Application/anew.html";
{
	headers.put("Content-Type", "text/html");
}
static private final String static_0 = ""
;
static private final String static_1 = "\n" + 
"";
static private final String static_2 = "<p>this is a new template</p>\n" + 
"<p>Oyeme--lo!</p>\n" + 
"";
	public anew() {
		super(null);
	}
	public anew(StringBuilder out) {
		super(out);
	}
	public cn.bran.japid.template.RenderResult render() {
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
p(static_0);// line 1
// line 1
p(static_1);// line 5
// line 7
p(static_2);// line 7

	}
	@Override protected void title() {
		p("崭新");;
	}
}
