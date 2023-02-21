/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class305
{
    static Class305 aClass305_3409 = new Class305(0, 4);
    static Class305 aClass305_3410 = new Class305(1, 5);
    static Class305 aClass305_3411 = new Class305(2, 6);
    public int anInt3412;
    int anInt3413;
    
    public static Class305 method5418(int i) {
	Class305[] class305s = Class711.method14448((byte) 0);
	for (int i_0_ = 0; i_0_ < class305s.length; i_0_++) {
	    Class305 class305 = class305s[i_0_];
	    if (-1555827231 * class305.anInt3413 == i)
		return class305;
	}
	return null;
    }
    
    static Class305[] method5419() {
	return (new Class305[]
		{ aClass305_3411, aClass305_3410, aClass305_3409 });
    }
    
    static Class305[] method5420() {
	return (new Class305[]
		{ aClass305_3411, aClass305_3410, aClass305_3409 });
    }
    
    public static Class305 method5421(int i) {
	Class305[] class305s = Class711.method14448((byte) 0);
	for (int i_1_ = 0; i_1_ < class305s.length; i_1_++) {
	    Class305 class305 = class305s[i_1_];
	    if (-1555827231 * class305.anInt3413 == i)
		return class305;
	}
	return null;
    }
    
    Class305(int i, int i_2_) {
	anInt3413 = -265613791 * i;
	anInt3412 = i_2_ * -1047153633;
    }
    
    public static Class305 method5422(int i) {
	Class305[] class305s = Class711.method14448((byte) 0);
	for (int i_3_ = 0; i_3_ < class305s.length; i_3_++) {
	    Class305 class305 = class305s[i_3_];
	    if (-1555827231 * class305.anInt3413 == i)
		return class305;
	}
	return null;
    }
    
    public static Interface66 method5423(RSBuffer class525_sub38,
                                         int i) {
	Class610 class610
	    = Class172.method2760(class525_sub38.readUnsignedByte(1666130007),
				  1371226720);
	if (Class610.aClass610_8011 == class610)
	    return Class685.method11249(class525_sub38, -351382911);
	if (Class610.aClass610_8009 == class610)
	    return Class341.method5992(class525_sub38, -473062206);
	if (Class610.aClass610_8012 == class610)
	    return Class571.method9531(class525_sub38, 1521105840);
	return null;
    }
    
    public static void method5424(long[] ls, Object[] objects, int i) {
	Class229.method4378(ls, objects, 0, ls.length - 1, 2132094271);
    }
    
    static void method5425(RSBuffer class525_sub38, int i) {
	int i_4_ = class525_sub38.method16740((byte) -81);
	Class622.aClass596Array8102 = new Class596[i_4_];
	for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
	    Class622.aClass596Array8102[i_5_] = new Class596();
	    Class622.aClass596Array8102[i_5_].anInt7840
		= class525_sub38.method16740((byte) -63) * -1140507373;
	    Class622.aClass596Array8102[i_5_].aString7839
		= class525_sub38.method16637(372108257);
	}
	Class478.anInt5201
	    = class525_sub38.method16740((byte) -95) * -1237211863;
	Class617.anInt8063
	    = class525_sub38.method16740((byte) -95) * 1188608401;
	Class617.anInt8062
	    = class525_sub38.method16740((byte) -99) * 1419578983;
	Class617.aClass603_Sub1Array8056
	    = new Class603_Sub1[(Class617.anInt8063 * -192862351
				 - Class478.anInt5201 * -1122711783 + 1)];
	for (int i_6_ = 0; i_6_ < Class617.anInt8062 * -1524093609; i_6_++) {
	    int i_7_ = class525_sub38.method16740((byte) -5);
	    Class603_Sub1 class603_sub1
		= Class617.aClass603_Sub1Array8056[i_7_] = new Class603_Sub1();
	    class603_sub1.anInt7952
		= class525_sub38.readUnsignedByte(1813416598) * 683324199;
	    class603_sub1.anInt7951
		= class525_sub38.readInt(865650061) * -357131117;
	    class603_sub1.anInt10879
		= class525_sub38.method16740((byte) -116) * 174902103;
	    if (-664186777 * class603_sub1.anInt10879 != 0)
		class603_sub1.aString10884
		    = class525_sub38.method16637(2072538543);
	    class603_sub1.anInt10883
		= -1527038723 * (i_7_ + -1122711783 * Class478.anInt5201);
	    class603_sub1.aString10881
		= class525_sub38.method16637(-1152825227);
	    class603_sub1.aString10880
		= class525_sub38.method16637(-1525876548);
	}
	Class617.anInt8060
	    = class525_sub38.readInt(2017151740) * -669045223;
	Class617.aBool8059 = true;
    }
    
    static int method5426(Class525_Sub16_Sub16 class525_sub16_sub16,
			  Class7 class7, int i) {
	String string = Class335.method5851(class525_sub16_sub16, 2025358928);
	int[] is = Class220.method4207(class525_sub16_sub16, -2008393208);
	if (null != is)
	    string = new StringBuilder().append(string).append
			 (Class91.method1699(is, -1517274269)).toString();
	int i_8_ = class7.method562(string, Class229.aClass157Array2364,
				    -2098703350);
	if (class525_sub16_sub16.aBool11865)
	    i_8_ += Class321.aClass157_3539.method2503() + 4;
	return i_8_;
    }
}
