/* Class621 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class621 implements Interface76
{
    public static Class621 aClass621_8087;
    public static Class621 aClass621_8088;
    public static Class621 aClass621_8089;
    static Class621 aClass621_8090 = new Class621(2, 0);
    public int anInt8091;
    int anInt8092;
    static int[] anIntArray8093;
    public static int anInt8094;
    
    public int method57() {
	return -658831591 * anInt8092;
    }
    
    public int method75() {
	return -658831591 * anInt8092;
    }
    
    Class621(int i, int i_0_) {
	anInt8091 = i * -1749996143;
	anInt8092 = i_0_ * 1696032041;
    }
    
    static {
	aClass621_8087 = new Class621(0, 1);
	aClass621_8089 = new Class621(3, 2);
	aClass621_8088 = new Class621(1, 3);
    }
    
    public int method80() {
	return -658831591 * anInt8092;
    }
    
    public static Class621[] method10185(int i) {
	return new Class621[] { aClass621_8087, aClass621_8088, aClass621_8090,
				aClass621_8089 };
    }
    
    static void method10186(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	class683.anIntArray8661[class683.anInt8662 * 501271953]
	    = Class193.method3714((class683.anIntArray8661
				   [class683.anInt8662 * 501271953]),
				  (class683.anIntArray8661
				   [501271953 * class683.anInt8662 + 1]),
				  1007376166);
	class683.anInt8662 += 1552651121;
    }
    
    public static void method10187(String string, byte i) {
	if (client.aBool11358 && 0 != (Class30.anInt299 * 1136155797 & 0x18)) {
	    boolean bool = false;
	    int i_1_ = Class104.anInt1284 * 692634081;
	    int[] is = Class104.anIntArray1285;
	    for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
		Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		    = client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[is[i_2_]];
		if (null != class656_sub1_sub3_sub1_sub1.aString12231
		    && class656_sub1_sub3_sub1_sub1.aString12231
			   .equalsIgnoreCase(string)
		    && (((class656_sub1_sub3_sub1_sub1
			  == Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705)
			 && 0 != (Class30.anInt299 * 1136155797 & 0x10))
			|| 0 != (Class30.anInt299 * 1136155797 & 0x8))) {
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4325,
					    client.aClass96_11085.aClass6_1169,
					    1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16666
			(-974815545 * client.anInt11256, -1314024251);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16665(is[i_2_], (short) 1274);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16696(0, (short) -20629);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16674
			(Class462.anInt5096 * 1477024315, (byte) 0);
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16666
			(441068731 * client.anInt11298, -837349125);
		    client.aClass96_11085.method1794(class525_sub15,
						     (short) 26536);
		    Class301.method5404((class656_sub1_sub3_sub1_sub1
					 .anIntArray12014[0]),
					(class656_sub1_sub3_sub1_sub1
					 .anIntArray12017[0]),
					-1988297728);
		    bool = true;
		    break;
		}
	    }
	    if (!bool)
		Class202.method3852(4,
				    new StringBuilder().append
					(Class53.aClass53_516.method1169
					 (Class21.aClass666_213, 1552651121))
					.append
					(string).toString(),
				    (byte) -15);
	    if (client.aBool11358)
		Class382.method6429(1771493886);
	}
    }
    
    static final void method10188(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class233.anInt2370 * 1929833649;
    }
}
