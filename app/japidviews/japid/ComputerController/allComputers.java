package japidviews.japid.ComputerController;
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
import static cn.bran.play.WebUtils.*;
// NOTE: This file was generated from: japidviews/japid/ComputerController/allComputers.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class allComputers extends ComputerLayout{
	public static final String sourceTemplate = "japidviews/japid/ComputerController/allComputers.html";
static private final String static_0 = ""
;
static private final String static_1 = "\n" + 
"\n" + 
"";
static private final String static_2 = "\n" + 
"\n" + 
"";
static private final String static_3 = "\n" + 
"	<p>The computer list is empty</p>\n" + 
"";
static private final String static_4 = "\n" + 
"	"
;
static private final String static_5 = "\n" + 
"		<div class=\"computer "
;
static private final String static_6 = "\">\n" + 
"			"
;
static private final String static_7 = "\n" + 
"		</div>\n" + 
"	"
;
static private final String static_8 = "\n" + 
"";
static private final String static_9 = "\n" + 
"\n" + 
"";
	public allComputers() {
		super(null);
	}
	public allComputers(StringBuilder out) {
		super(out);
	}
	ArrayList<Computer> computers;
	public cn.bran.japid.template.RenderResult render(ArrayList<Computer> computers) {
		this.computers = computers;
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
if (computers.size() == 0) {// line 9
p(static_3);// line 9
} else {// line 11
p(static_4);// line 11
_Each1.setActionRunners(getActionRunners());
_Each1.render(computers, _Each1DoBody);
// line 12
p(static_8);// line 16
}// line 17
p(static_9);// line 17

	}
	@Override protected void title() {
		p("列表of computer ");;
	}
	private ComputerDetail _ComputerDetail2 = new ComputerDetail(getOut());
	private Each _Each1 = new Each(getOut());
class Each1DoBody implements Each.DoBody< Computer>{
	public void render(Computer c, int _index, boolean _isOdd, String _parity, boolean _isFirst, boolean _isLast) {
		// line 12
p(static_5);// line 12
p(_parity);// line 13
p(static_6);// line 13
_ComputerDetail2.setActionRunners(getActionRunners());
_ComputerDetail2.render(c);
// line 14
p(static_7);// line 14

	}
}
	private Each1DoBody _Each1DoBody = new Each1DoBody();

}
