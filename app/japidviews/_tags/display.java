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
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
// NOTE: This file was generated from: japidviews/_tags/display.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class display extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/_tags/display.html";
static private final String static_0 = ""
;
static private final String static_1 = "\n" + 
"";
static private final String static_2 = "<div class='post "
;
static private final String static_3 = "'>\n" + 
"    <h2 class=\"post-title\">\n" + 
"        <a href=\""
;
static private final String static_4 = "\">"
;
static private final String static_5 = "</a>\n" + 
"    </h2>\n" + 
"    <div class=\"post-metadata\">\n" + 
"        <span class=\"post-author\">by "
;
static private final String static_6 = " </span>,\n" + 
"        <span class=\"post-date\">"
;
static private final String static_7 = "</span>\n" + 
"        "
;
static private final String static_8 = "            <span class=\"post-comments\">\n" + 
"                &nbsp;|&nbsp; "
;
static private final String static_9 = " comment"
;
static private final String static_10 = ".\n" + 
"                "
;
static private final String static_11 = "                    , latest by "
;
static private final String static_12 = "                "
;
static private final String static_13 = "            </span>\n" + 
"		"
;
static private final String static_14 = "            <span class=\"post-tags\">\n" + 
"                - Tagged \n" + 
"                "
;
static private final String static_15 = "                    <a href=\""
;
static private final String static_16 = "\">"
;
static private final String static_17 = "</a>"
;
static private final String static_18 = "                "
;
static private final String static_19 = "            </span>\n" + 
"        "
;
static private final String static_20 = "    </div> \n" + 
"    "
;
static private final String static_21 = "        <div class=\"post-content\">\n" + 
"            <div class=\"about\">Detail: </div>\n" + 
"            "
;
static private final String static_22 = "        </div>\n" + 
"    "
;
static private final String static_23 = "</div>\n" + 
" \n" + 
"";
static private final String static_24 = "    <div class=\"comments\">\n" + 
"        <h3>"
;
static private final String static_25 = " comment"
;
static private final String static_26 = "</h3>\n" + 
"        \n" + 
"        "
;
static private final String static_27 = "            <div class=\"comment\">\n" + 
"                <div class=\"comment-metadata\">\n" + 
"                    <span class=\"comment-author\">by "
;
static private final String static_28 = "</span>\n" + 
"                    <span class=\"comment-date\">"
;
static private final String static_29 = "</span>\n" + 
"                </div>\n" + 
"                <div class=\"comment-content\">\n" + 
"                    <div class=\"about\">Detail: </div>\n" + 
"                    "
;
static private final String static_30 = "                </div>\n" + 
"            </div>\n" + 
"        "
;
static private final String static_31 = "    </div>\n" + 
"";
static private final String static_32 = ""
;
	public display() {
		super(null);
	}
	public display(StringBuilder out) {
		super(out);
	}
	models.Post _p;
	String _as;
	public cn.bran.japid.template.RenderResult render(models.Post _p, String _as) {
		this._p = _p;
		this._as = _as;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
p(static_0);// line 1
p(static_1);// line 1
p(static_2);// line 3
p(_as.equals("teaser")?"teaser":"");// line 5
p(static_3);// line 5
p(lookup("Application.show", _p.id));// line 7
p(static_4);// line 7
p(_p.title);// line 7
p(static_5);// line 7
p(_p.author.fullname);// line 10
p(static_6);// line 10
p(format(_p.postedAt, "dd MMM yy"));// line 11
p(static_7);// line 11
if (!"full".equals(_as)) { // line 12
p(static_8);// line 12
p(numOf(_p.comments));// line 14
p(static_9);// line 14
p(pluralize(_p.comments));// line 14
p(static_10);// line 14
if (asBoolean(_p.comments)){ // line 15
p(static_11);// line 15
p(lastOf(_p.comments).author);// line 16
p(static_12);// line 16
}// line 17
p(static_13);// line 17
} else if (asBoolean(_p.tags)) {// line 19
p(static_14);// line 19
_Each0.setActionRunners(getActionRunners());
_Each0.render(_p.tags, _Each0DoBody);
// line 22
p(static_19);// line 24
}// line 26
p(static_20);// line 26
if (!"teaser".equals(_as)){// line 28
p(static_21);// line 28
p(nl2br(_p.content));// line 31
p(static_22);// line 31
}// line 33
p(static_23);// line 33
if ("full".equals(_as)){// line 36
p(static_24);// line 36
p(numOf(_p.comments));// line 38
p(static_25);// line 38
p(pluralize(_p.comments));// line 38
p(static_26);// line 38
_Each1.setActionRunners(getActionRunners());
_Each1.render(_p.comments, _Each1DoBody);
// line 40
p(static_31);// line 51
}// line 53
p(static_32);// line 53

	}
	private Each _Each0 = new Each(getOut());
class Each0DoBody implements Each.DoBody< Tag>{
	public void render(Tag _, int _index, boolean _isOdd, String _parity, boolean _isFirst, boolean _isLast) {
		// line 22
p(static_15);// line 22
p(lookup("Application.listTagged", _.name));// line 23
p(static_16);// line 23
p(_);// line 23
p(static_17);// line 23
p(_isLast?"":", ");// line 23
p(static_18);// line 23

	}
}
	private Each0DoBody _Each0DoBody = new Each0DoBody();

	private Each _Each1 = new Each(getOut());
class Each1DoBody implements Each.DoBody< Comment>{
	public void render(Comment _, int _index, boolean _isOdd, String _parity, boolean _isFirst, boolean _isLast) {
		// line 40
p(static_27);// line 40
p(_.author);// line 43
p(static_28);// line 43
p(format(_.postedAt, "dd MMM yy"));// line 44
p(static_29);// line 44
p(nl2br(escape(_.content)));// line 48
p(static_30);// line 48

	}
}
	private Each1DoBody _Each1DoBody = new Each1DoBody();

}
