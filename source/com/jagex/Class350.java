/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class350
{
    Class309 aClass309_3741;
    
    public abstract Class446 method6128();
    
    public abstract void method6129(float f, int[][][] is, Class475 class475,
				    int i, int i_0_, int i_1_);
    
    public abstract boolean method6130(int i);
    
    public abstract Class446 method6131(int i);
    
    public abstract double[] method6132(int i);
    
    public abstract Class525_Sub28 method6133(byte i);
    
    public abstract float method6134(int i);
    
    public abstract void method6135(Class291 class291, int i, int i_2_,
				    int i_3_);
    
    public abstract void method6136(float f, int[][][] is, Class475 class475,
				    int i, int i_4_);
    
    public abstract void method6137(float f, int[][][] is, Class475 class475,
				    int i, int i_5_);
    
    public abstract void method6138(Class291 class291, int i, int i_6_);
    
    Class350(Class309 class309) {
	aClass309_3741 = class309;
    }
    
    public abstract void method6139(Class291 class291, int i, int i_7_);
    
    public abstract Class446 method6140();
    
    public abstract Class525_Sub28 method6141();
    
    public abstract double[] method6142();
    
    public abstract double[] method6143();
    
    public abstract Class525_Sub28 method6144();
    
    public abstract void method6145(RSBuffer class525_sub38, int i);
    
    public abstract Class525_Sub28 method6146();
    
    public abstract float method6147();
    
    public abstract boolean method6148();
    
    public abstract float method6149();
    
    public abstract void method6150(RSBuffer class525_sub38);
    
    public abstract void method6151(Class291 class291, int i, int i_8_);
    
    public abstract boolean method6152();
    
    public abstract float method6153();
    
    public static void method6154(String string, String string_9_,
				  String string_10_, boolean bool, byte i) {
	if (string.length() <= 320 && Class265.method4802(-1507972944)) {
	    Class274.method5088((byte) 13);
	    Class70.aString777 = string;
	    Class70.aString789 = string_9_;
	    Class70.aString779 = string_10_;
	    Class70.aBool780 = bool;
	    Class441.method7119(0, 1063126291);
	}
    }
    
    static final void method6155(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method6156(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_11_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_12_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	if (-1 == i_12_)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= Class562.aClass471_7557.method7736(i_11_, -192176728)
		      .method18543((char) i_12_, (byte) 97);
    }
    
    public static float method6157(Class429 class429, byte i) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d
	    = 1.5707963267948966 - Math.acos((double) class446.aFloat4896);
	class446.method7260();
	return (float) d;
    }
    
    static Class525_Sub41_Sub1 method6158(int i, int i_13_, int i_14_, long l,
					  int i_15_, byte i_16_) {
	synchronized (Class525_Sub41_Sub1.aClass525_Sub41_Sub1Array11760) {
	    Class525_Sub41_Sub1 class525_sub41_sub1;
	    if (0 == Class2.anInt26 * -466702181)
		class525_sub41_sub1 = new Class525_Sub41_Sub1();
	    else
		class525_sub41_sub1
		    = (Class525_Sub41_Sub1.aClass525_Sub41_Sub1Array11760
		       [(Class2.anInt26 -= 547992979) * -466702181]);
	    class525_sub41_sub1.anInt11761 = i * -1598031861;
	    class525_sub41_sub1.anInt11762 = -2113159243 * i_13_;
	    class525_sub41_sub1.anInt11763 = i_14_ * 1457060033;
	    class525_sub41_sub1.aLong11765 = l * -8347735112187190675L;
	    class525_sub41_sub1.anInt11764 = i_15_ * 1880475637;
	    Class525_Sub41_Sub1 class525_sub41_sub1_17_ = class525_sub41_sub1;
	    return class525_sub41_sub1_17_;
	}
    }
}
