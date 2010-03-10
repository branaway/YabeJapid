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
import static cn.bran.play.WebUtils.*;
// NOTE: This file was generated from: japidviews/Application/listTagged.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class listTagged extends main{
	public static final String sourceTemplate = "japidviews/Application/listTagged.html";
static private final String static_0 = ""
;
static private final String static_1 = "\n" + 
"";
static private final String static_2 = " \n" + 
"";
static private final String static_3 = " \n" + 
"";
static private final String static_4 = "   <h3>There are "
;
static private final String static_5 = " posts tagged '"
;
static private final String static_6 = "'..</h3>  \n" + 
"";
static private final String static_7 = "    <h3>There is 1 post tagged '"
;
static private final String static_8 = "'.</h3>  \n" + 
"";
static private final String static_9 = "    <h3>No post tagged '"
;
static private final String static_10 = "'</h3>\n" + 
"";
static private final String static_11 = " \n" + 
"";
static private final String static_12 = " \n" + 
"  \n" + 
"<div class=\"older-posts\">    \n" + 
"    "
;
static private final String static_13 = "        "
;
static private final String static_14 = "    "
;
static private final String static_15 = "</div> "
;
	public listTagged() {
		super(null);
	}
	public listTagged(StringBuilder out) {
		super(out);
	}
	ArrayList<Post> posts;
	String tag;
	public cn.bran.japid.template.RenderResult render(ArrayList<Post> posts, String tag) {
		this.posts = posts;
		this.tag = tag;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
p(static_0);// line 1
// line 1
p(static_1);// line 4
// line 6
p(static_2);// line 6
p(static_3);// line 8
if(posts.size() > 1){// line 10
p(static_4);// line 10
p(posts.size());// line 11
p(static_5);// line 11
p(tag);// line 11
p(static_6);// line 11
}else if (asBoolean(posts)) {// line 12
p(static_7);// line 12
p(tag);// line 13
p(static_8);// line 13
}else{// line 14
p(static_9);// line 14
p(tag);// line 15
p(static_10);// line 15
}// line 16
p(static_11);// line 16
p(static_12);// line 18
_Each1.setActionRunners(getActionRunners());
_Each1.render(posts, _Each1DoBody);
// line 21
p(static_15);// line 23

	}
	@Override protected void title() {
		p("Posts tagged with " + tag);;
	}
	private display _display2 = new display(getOut());
	private Each _Each1 = new Each(getOut());
class Each1DoBody implements Each.DoBody< Post>{
	public void render(Post post, int _index, boolean _isOdd, String _parity, boolean _isFirst, boolean _isLast) {
		// line 21
p(static_13);// line 21
_display2.setActionRunners(getActionRunners());
_display2.render(post, "teaser");
// line 22
p(static_14);// line 22

	}
}
	private Each1DoBody _Each1DoBody = new Each1DoBody();

}
