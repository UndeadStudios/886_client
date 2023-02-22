/* Class172_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class172_Sub1 extends Class172
{
    JS5 aClass458_9506;
    JS5 aClass458_9507;
    
    byte[] method2741(Class593 class593, int i, int i_0_) {
	if ((class593 == Class593.aClass593_7830
	     || Class593.aClass593_7831 == class593)
	    && aClass458_9507.method7502(i, 1457353420))
	    return aClass458_9507.getTextureData(i, 1829005021);
	if (class593 == Class593.aClass593_7829
	    && aClass458_9506.method7502(i, 533568034))
	    return aClass458_9506.getTextureData(i, 1371964077);
	return null;
    }
    
    public boolean method130(Class593 class593, int i, Class594 class594,
			     float f, int i_1_, int i_2_, boolean bool,
			     byte i_3_) {
	boolean bool_4_ = true;
	if (Class593.aClass593_7831 == class593) {
	    if (aClass458_9506.method7502(i, 1825968531))
		bool_4_ = aClass458_9506.method7506(i, 1237121049);
	    return bool_4_ & aClass458_9507.method7506(i, 1440376643);
	}
	if (Class593.aClass593_7830 == class593)
	    return aClass458_9507.method7506(i, -1599684232);
	if (class593 == Class593.aClass593_7829)
	    return aClass458_9506.method7506(i, 1934157017);
	return false;
    }
    
    byte[] method2747(Class593 class593, int i) {
	if ((class593 == Class593.aClass593_7830
	     || Class593.aClass593_7831 == class593)
	    && aClass458_9507.method7502(i, 278638732))
	    return aClass458_9507.getTextureData(i, 1811696540);
	if (class593 == Class593.aClass593_7829
	    && aClass458_9506.method7502(i, 1970364726))
	    return aClass458_9506.getTextureData(i, 1435179794);
	return null;
    }
    
    public boolean method140(Class593 class593, int i, Class594 class594,
			     float f, int i_5_, int i_6_, boolean bool) {
	boolean bool_7_ = true;
	if (Class593.aClass593_7831 == class593) {
	    if (aClass458_9506.method7502(i, 731576505))
		bool_7_ = aClass458_9506.method7506(i, 733214800);
	    return bool_7_ & aClass458_9507.method7506(i, -596975696);
	}
	if (Class593.aClass593_7830 == class593)
	    return aClass458_9507.method7506(i, 182712414);
	if (class593 == Class593.aClass593_7829)
	    return aClass458_9506.method7506(i, -2013240639);
	return false;
    }
    
    byte[] method2746(Class593 class593, int i) {
	if ((class593 == Class593.aClass593_7830
	     || Class593.aClass593_7831 == class593)
	    && aClass458_9507.method7502(i, -456242442))
	    return aClass458_9507.getTextureData(i, 1407981591);
	if (class593 == Class593.aClass593_7829
	    && aClass458_9506.method7502(i, 594117462))
	    return aClass458_9506.getTextureData(i, 1343768850);
	return null;
    }
    
    public Class172_Sub1(JS5 class458, JS5 class458_8_) {
	aClass458_9507 = class458;
	aClass458_9506 = class458_8_;
    }
    
    byte[] method2750(Class593 class593, int i) {
	if ((class593 == Class593.aClass593_7830
	     || Class593.aClass593_7831 == class593)
	    && aClass458_9507.method7502(i, 942334332))
	    return aClass458_9507.getTextureData(i, 1793232636);
	if (class593 == Class593.aClass593_7829
	    && aClass458_9506.method7502(i, 1467524007))
	    return aClass458_9506.getTextureData(i, 1264104375);
	return null;
    }
    
    static void method15239(byte i) {
	int i_9_ = -1;
	if (null != Class556_Sub1.aClass525_Sub16_Sub6_7469)
	    i_9_ = (2044380983
		    * Class556_Sub1.aClass525_Sub16_Sub6_7469.anInt11777);
	Class2.method528(1313042778);
	for (int i_10_ = 0; i_10_ < 3; i_10_++) {
	    for (int i_11_ = 0; i_11_ < 5; i_11_++) {
		Class556_Sub1.aClass175ArrayArray10637[i_10_][i_11_] = null;
		Class556_Sub1.aClass7ArrayArray10633[i_10_][i_11_] = null;
	    }
	}
	Class556_Sub1.aClass525_Sub16_Sub6_7469 = null;
	if (i_9_ != -1)
	    Class372_Sub1.method15803(i_9_, -1, -1, false, 65280);
    }
    
    public static void method15240(int i) {
	Class231.method4391(true, -231575653);
    }
}
