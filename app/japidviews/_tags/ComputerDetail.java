package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import japidviews._layouts.*;
import play.mvc.Scope.*;
import models.*;
import japidviews._tags.*;
import controllers.*;
import japidviews._javatags.*;
import models.japidsample.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
// NOTE: This file was generated from: japidviews/_tags/ComputerDetail.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class ComputerDetail extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/_tags/ComputerDetail.html";
static private final String static_0 = ""
;
static private final String static_1 = "\n" + 
"\n" + 
"<p>Name: "
;
static private final String static_2 = "</p>\n" + 
"<p>Release Date: "
;
static private final String static_3 = "</p>\n" + 
"<p>Name: "
;
static private final String static_4 = "</p>\n" + 
"";
	public ComputerDetail() {
		super(null);
	}
	public ComputerDetail(StringBuilder out) {
		super(out);
	}
	Computer c;
	public cn.bran.japid.template.RenderResult render(Computer c) {
		this.c = c;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
p(static_0);// line 1
// line 1
p(static_1);// line 4
p(c.getName());// line 6
p(static_2);// line 6
p(c.getReleaseDate());// line 7
p(static_3);// line 7
p(c.getManufacturor());// line 8
p(static_4);// line 8

	}
}
