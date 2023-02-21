/* Class609 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class609 implements Interface76
{
    static Class609 aClass609_8001;
    static Class609 aClass609_8002;
    static Class609 aClass609_8003;
    static Class609 aClass609_8004;
    int anInt8005;
    static Class609 aClass609_8006;
    static Class609 aClass609_8007 = new Class609(0);
    static Class259 aClass259_8008;
    
    public int method75() {
	return -1160700959 * anInt8005;
    }
    
    public int method80() {
	return -1160700959 * anInt8005;
    }
    
    public static Class609[] method10007() {
	return (new Class609[]
		{ aClass609_8001, aClass609_8007, aClass609_8006,
		  aClass609_8003, aClass609_8004, aClass609_8002 });
    }
    
    public int method57() {
	return -1160700959 * anInt8005;
    }
    
    static {
	aClass609_8001 = new Class609(1);
	aClass609_8003 = new Class609(2);
	aClass609_8002 = new Class609(3);
	aClass609_8004 = new Class609(4);
	aClass609_8006 = new Class609(5);
    }
    
    public static Class609[] method10008() {
	return (new Class609[]
		{ aClass609_8001, aClass609_8007, aClass609_8006,
		  aClass609_8003, aClass609_8004, aClass609_8002 });
    }
    
    public static Class609[] method10009() {
	return (new Class609[]
		{ aClass609_8001, aClass609_8007, aClass609_8006,
		  aClass609_8003, aClass609_8004, aClass609_8002 });
    }
    
    public static Class609[] method10010() {
	return (new Class609[]
		{ aClass609_8001, aClass609_8007, aClass609_8006,
		  aClass609_8003, aClass609_8004, aClass609_8002 });
    }
    
    Class609(int i) {
	anInt8005 = i * -1363646431;
    }
    
    public static Class609[] method10011() {
	return (new Class609[]
		{ aClass609_8001, aClass609_8007, aClass609_8006,
		  aClass609_8003, aClass609_8004, aClass609_8002 });
    }
    
    static final void method10012(Class259 class259, Class245 class245,
				  Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	Class656_Sub1_Sub5_Sub1.method18727(string, class683, -2051518594);
    }
    
    static final void method10013(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class691.method14111(string, i_0_ == 1, 459727647);
    }
    
    static final void method10014(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aClass637_12246
		!= null)
	       && (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aClass637_12246
		   .aBool8291)) ? 1 : 0;
    }
    
    static final void method10015(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	client.anInt11332
	    = (class683.anIntArray8661[class683.anInt8662 * 501271953]
	       * -1624165049);
	Class28.aClass702_283
	    = Class510.method8504((class683.anIntArray8661
				   [class683.anInt8662 * 501271953 + 1]),
				  -1299515933);
	if (null == Class28.aClass702_283)
	    Class28.aClass702_283 = Class702.aClass702_8785;
	client.anInt11200
	    = (class683.anIntArray8661[2 + class683.anInt8662 * 501271953]
	       * -1582263689);
	Class96 class96 = Class111.method1979(465663506);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4339, class96.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16735(client.anInt11332 * -664017801, -1492830968);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16735
	    (108507919 * Class28.aClass702_283.anInt8786, -185180326);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16735(client.anInt11200 * 345171783, -1483950634);
	class96.method1794(class525_sub15, (short) 27451);
    }
}
