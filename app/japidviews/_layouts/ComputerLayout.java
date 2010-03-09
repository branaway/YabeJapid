package japidviews._layouts;
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
// NOTE: This file was generated from: japidviews/_layouts/ComputerLayout.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public abstract class ComputerLayout extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/_layouts/ComputerLayout.html";
static private final String static_0 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" + 
"<html>\n" + 
"<head>\n" + 
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" + 
"<title>"
;
static private final String static_1 = "</title>\n" + 
"</head>\n" + 
"<body>\n" + 
"	"
;
static private final String static_2 = "\n" + 
"</body>\n" + 
"</html>"
;
	public ComputerLayout() {
		super(null);
	}
	public ComputerLayout(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {		p(static_0);// line 1
	title();// line 5
p(static_1);// line 5
	doLayout();// line 8
p(static_2);// line 8
	}	protected abstract void title();
	protected abstract void doLayout();
}