import org.junit.*;
import play.templates.Template.ExecutableTemplate.RawData;
import play.test.*;
import play.templates.JavaExtensions;

/**
 *
 * @author bran
 */
public class MiscTest extends UnitTest {

    @Test
    public void apcheHtmlEscapeChineseIssue() {
        String s = "汉字 English";
        RawData r = JavaExtensions.escape(s);
        assertEquals(s, r.data);
    }

    @Test
    public void chineseInternalCode() {
    	char zi = '汉';
    	
    	int code = Integer.parseInt("9875", 16);
    	
    	char z2 = (char) code;
    	System.out.println(code);
    	assertEquals('页', z2);
    }
    
    @Test
    public void arrayTypes() {
    	String[] ss = new String[] {"a", "b"};
    	assertTrue(ss instanceof Object[]);

    	char[] ca = new char[] {'a', 'v'};
    	System.out.println(ca.getClass().getName());
    	
    	int[] ina = new int[] {1, 2};
    	
    	Integer[] ia = new Integer[]{1, 2};
    	assertTrue(ia instanceof Object[]);
  
    	// cannot use system copy to coelercion
//    	Character[] oa = new Character[ca.length];
//    	System.arraycopy(ca, 0, oa, 0, ca.length);
//    	assertEquals(new Character('a'), oa[0]);
//    	assertTrue(ca instanceof Object[]);
    }
    
    
  
}