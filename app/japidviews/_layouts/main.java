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
import static cn.bran.play.WebUtils.*;
// NOTE: This file was generated from: japidviews/_layouts/main.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public abstract class main extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/_layouts/main.html";
static private final String static_0 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" + 
" \n" + 
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n" + 
"    <head>\n" + 
"        <title>"
;
static private final String static_1 = "</title>		\n" + 
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n" + 
"        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\""
;
static private final String static_2 = "\" />\n" + 
"        <link rel=\"shortcut icon\" type=\"image/png\" href=\""
;
static private final String static_3 = "\" />\n" + 
"        <script src=\""
;
static private final String static_4 = "\"></script>\n" + 
"        <script src=\""
;
static private final String static_5 = "\"></script>\n" + 
"    </head>\n" + 
"    <body>\n" + 
"        <div id=\"header\">\n" + 
"            <div id=\"logo\">\n" + 
"                yabe with Japid, the Power Server\n" + 
"            </div>\n" + 
"            <ul id=\"tools\">\n" + 
"                <li>\n" + 
"                    <a href=\""
;
static private final String static_6 = "\">Log in to write something</a>\n" + 
"                </li>\n" + 
"            </ul>\n" + 
"            <div id=\"title\">\n" + 
"                <span class=\"about\">About this blog</span>\n" + 
"                <h1><a href=\""
;
static private final String static_7 = "\">"
;
static private final String static_8 = "</a></h1>\n" + 
"                <h2>"
;
static private final String static_9 = "</h2>\n" + 
"            </div>\n" + 
"        </div>\n" + 
"        \n" + 
"        <div id=\"main\">\n" + 
"            "
;
static private final String static_10 = " \n" + 
"        </div>\n" + 
"        \n" + 
"        <p id=\"footer\">\n" + 
"            Yabe3 is a (not so) powerful blog engine built with the \n" + 
"            <a href=\"http://www.playframework.org\">play framework</a>\n" + 
"            as a tutorial application. \n" + 
"            \n" + 
"            The template engine is using the \n" + 
"            <a href=\"http://github.com/branaway/Japid\">Japid system</a> \n" + 
"            which provides near raw Java performance. \n" + 
"        </p>\n" + 
"        \n" + 
"    </body>\n" + 
"</html>"
;
	public main() {
		super(null);
	}
	public main(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {		p(static_0);// line 1
	title();// line 5
p(static_1);// line 5
p(lookupStatic("/public/stylesheets/main.css"));// line 7
p(static_2);// line 7
p(lookupStatic("/public/images/favicon.png"));// line 8
p(static_3);// line 8
p(lookupStatic("/public/javascripts/jquery-1.3.2.min.js"));// line 9
p(static_4);// line 9
p(lookupStatic("/public/javascripts/jquery.tools.min.js"));// line 10
p(static_5);// line 10
p(lookup("Admin.index", new Object[]{}));// line 19
p(static_6);// line 19
p(lookup("Application.index", new Object[]{}));// line 24
p(static_7);// line 24
p(renderArg("blogTitle"));// line 24
p(static_8);// line 24
p(renderArg("blogBaseline"));// line 25
p(static_9);// line 25
	doLayout();// line 30
p(static_10);// line 30
	}	protected abstract void title();
	protected abstract void doLayout();
}