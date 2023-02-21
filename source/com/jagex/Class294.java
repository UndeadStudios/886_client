/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class294
{
    public static Class294 aClass294_3240;
    public int anInt3241;
    static Class294 aClass294_3242 = new Class294(0);
    
    static {
	aClass294_3240 = new Class294(1);
    }
    
    static Class294 method5309(int i) {
	if (i == aClass294_3242.anInt3241 * 2119762053)
	    return aClass294_3242;
	if (2119762053 * aClass294_3240.anInt3241 == i)
	    return aClass294_3240;
	return null;
    }
    
    Class294(int i) {
	anInt3241 = -168626099 * i;
    }
    
    static final void method5310(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2638 * 1943498005;
    }
    
    static final void method5311(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (client.aString11337 != null
	    && i_0_ < Class110.anInt1371 * -218000115)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= Class699.aClass99Array8774[i_0_].aString1208;
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
    }
    
    public static int method5312(int i, byte i_1_) {
	return Class93.anIntArray910[i];
    }
    
    static final void method5313(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2720
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -608400399);
	class259.aBool2695 = true;
    }
    
    static final void method5314(Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4370,
				client.aClass96_11361.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16735(Class161.method2628(string, -999909605), -1143980802);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
							      1894329399);
	client.aClass96_11361.method1794(class525_sub15, (short) 22694);
    }
}
