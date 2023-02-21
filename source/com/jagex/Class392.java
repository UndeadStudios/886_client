/* Class392 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class392
{
    public static Class392 aClass392_4072;
    public static Class392 aClass392_4073;
    public static Class392 aClass392_4074;
    public static Class392 aClass392_4075;
    public static Class392 aClass392_4076;
    public static Class392 aClass392_4077;
    public static Class392 aClass392_4078 = new Class392(1);
    public static Class392 aClass392_4079;
    public static Class392 aClass392_4080;
    public static Class392 aClass392_4081;
    public static Class392 aClass392_4082;
    public int anInt4083;
    
    public static Class392[] method6480() {
	return new Class392[] { aClass392_4078, aClass392_4073, aClass392_4075,
				aClass392_4077, aClass392_4076, aClass392_4072,
				aClass392_4080, aClass392_4079, aClass392_4074,
				aClass392_4081, aClass392_4082 };
    }
    
    static {
	aClass392_4073 = new Class392(2);
	aClass392_4075 = new Class392(2);
	aClass392_4077 = new Class392(2);
	aClass392_4076 = new Class392(1);
	aClass392_4072 = new Class392(1);
	aClass392_4080 = new Class392(1);
	aClass392_4079 = new Class392(2);
	aClass392_4074 = new Class392(1);
	aClass392_4081 = new Class392(2);
	aClass392_4082 = new Class392(1);
    }
    
    Class392(int i) {
	anInt4083 = i * 1270013697;
    }
    
    public static void method6481(int i) {
	Class438.anInt4854 = 0;
	Class438.anInt4855 = 0;
    }
    
    public static String method6482(byte[] is, int i, int i_0_, int i_1_) {
	char[] cs = new char[i_0_];
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
	    int i_4_ = is[i_3_ + i] & 0xff;
	    if (i_4_ != 0) {
		if (i_4_ >= 128 && i_4_ < 160) {
		    int i_5_ = Class664.aCharArray8555[i_4_ - 128];
		    if (0 == i_5_)
			i_5_ = 63;
		    i_4_ = i_5_;
		}
		cs[i_2_++] = (char) i_4_;
	    }
	}
	return new String(cs, 0, i_2_);
    }
}
