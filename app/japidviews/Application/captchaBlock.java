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
// NOTE: This file was generated from: japidviews/Application/captchaBlock.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class captchaBlock extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/Application/captchaBlock.html";
static private final String static_0 = ""
;
static private final String static_1 = "        <label for=\"code\">Please type the code below: </label>\n" + 
"        <img src=\""
;
static private final String static_2 = "\" />\n" + 
"        <br />\n" + 
"        <input type=\"text\" name=\"code\" id=\"code\" size=\"18\" value=\"\" />\n" + 
"        <input type=\"hidden\" name=\"randomID\" value=\""
;
static private final String static_3 = "\" />\n" + 
"";
	public captchaBlock() {
		super(null);
	}
	public captchaBlock(StringBuilder out) {
		super(out);
	}
	String randomID;
	public cn.bran.japid.template.RenderResult render(String randomID) {
		this.randomID = randomID;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
p(static_0);// line 1
p(static_1);// line 1
p(lookup("Application.captcha", randomID));// line 4
p(static_2);// line 4
p(randomID);// line 7
p(static_3);// line 7

	}
}
