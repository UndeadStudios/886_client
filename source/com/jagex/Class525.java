/* Class525 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525
{
    public Class525 aClass525_7111;
    public Class525 aClass525_7112;
    public long aLong7113;
    
    public boolean method8754() {
	if (aClass525_7111 == null)
	    return false;
	return true;
    }
    
    public void method8755(int i) {
	if (null != aClass525_7111) {
	    aClass525_7111.aClass525_7112 = aClass525_7112;
	    aClass525_7112.aClass525_7111 = aClass525_7111;
	    aClass525_7112 = null;
	    aClass525_7111 = null;
	}
    }
    
    public boolean method8756(int i) {
	if (aClass525_7111 == null)
	    return false;
	return true;
    }
    
    public void method8757() {
	if (null != aClass525_7111) {
	    aClass525_7111.aClass525_7112 = aClass525_7112;
	    aClass525_7112.aClass525_7111 = aClass525_7111;
	    aClass525_7112 = null;
	    aClass525_7111 = null;
	}
    }
    
    public void method8758() {
	if (null != aClass525_7111) {
	    aClass525_7111.aClass525_7112 = aClass525_7112;
	    aClass525_7112.aClass525_7111 = aClass525_7111;
	    aClass525_7112 = null;
	    aClass525_7111 = null;
	}
    }
    
    public void method8759() {
	if (null != aClass525_7111) {
	    aClass525_7111.aClass525_7112 = aClass525_7112;
	    aClass525_7112.aClass525_7111 = aClass525_7111;
	    aClass525_7112 = null;
	    aClass525_7111 = null;
	}
    }
    
    static final void method8760(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2767
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1087993381);
	class259.aBool2695 = true;
    }
    
    static final void method8761(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.method17531(class259).method16132(145955113);
    }
}
