/* Class350_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class350_Sub3 extends Class350
{
    Class446 aClass446_10306;
    Class446 aClass446_10307 = new Class446(Float.NaN, Float.NaN, Float.NaN);
    boolean aBool10308;
    Class446 aClass446_10309;
    int anInt10310;
    
    public void method6137(float f, int[][][] is, Class475 class475, int i,
			   int i_0_) {
	if (aBool10308)
	    method15906(is, class475, i, i_0_, -2074887852);
	aClass309_3741.method5454(true, f, aClass446_10307,
				  aClass309_3741.method5493(-156118299),
				  aClass446_10306, aClass446_10309,
				  (byte) -115);
    }
    
    public double[] method6142() {
	double[] ds = new double[3];
	Class446 class446 = method6131(-851578979);
	ds[0] = (double) class446.aFloat4895;
	ds[1] = (double) class446.aFloat4896;
	ds[2] = (double) class446.aFloat4897;
	return ds;
    }
    
    public void method15905(boolean bool) {
	aBool10308 = bool;
    }
    
    public double[] method6143() {
	double[] ds = new double[3];
	Class446 class446 = method6131(-1831004225);
	ds[0] = (double) class446.aFloat4895;
	ds[1] = (double) class446.aFloat4896;
	ds[2] = (double) class446.aFloat4897;
	return ds;
    }
    
    public Class446 method6131(int i) {
	return Class446.method7209(aClass446_10307);
    }
    
    public double[] method6132(int i) {
	double[] ds = new double[3];
	Class446 class446 = method6131(-815379999);
	ds[0] = (double) class446.aFloat4895;
	ds[1] = (double) class446.aFloat4896;
	ds[2] = (double) class446.aFloat4897;
	return ds;
    }
    
    public Class525_Sub28 method6133(byte i) {
	return new Class525_Sub28(anInt10310 * 1983574243,
				  (int) aClass446_10307.aFloat4895,
				  (int) aClass446_10307.aFloat4896,
				  (int) aClass446_10307.aFloat4897);
    }
    
    public Class525_Sub28 method6144() {
	return new Class525_Sub28(anInt10310 * 1983574243,
				  (int) aClass446_10307.aFloat4895,
				  (int) aClass446_10307.aFloat4896,
				  (int) aClass446_10307.aFloat4897);
    }
    
    public void method6135(Class291 class291, int i, int i_1_, int i_2_) {
	class291.anInt3219
	    = 505543655 * ((int) aClass446_10307.aFloat4895 - i);
	class291.anInt3220 = -416553419 * (int) -aClass446_10307.aFloat4896;
	class291.anInt3218
	    = ((int) aClass446_10307.aFloat4897 - i_1_) * 981552359;
    }
    
    public void method6145(RSBuffer class525_sub38, int i) {
	aClass446_10306.method7215(class525_sub38);
    }
    
    public float method6134(int i) {
	return 0.0F;
    }
    
    void method15906(int[][][] is, Class475 class475, int i, int i_3_,
		     int i_4_) {
	if (method6130(-204444103)
	    && (aClass309_3741.method5502(-1133521593)
		|| aClass309_3741.method5520(89796397))
	    && aClass309_3741.method5520(-1672513372) && is != null) {
	    int i_5_ = (int) aClass446_10306.aFloat4895 - i >> 9;
	    int i_6_ = (int) aClass446_10306.aFloat4897 - i_3_ >> 9;
	    if (i_5_ >= 0 && i_6_ >= 0 && i_5_ + 1 < is[0].length
		&& 1 + i_6_ < is[0][0].length) {
		int i_7_ = 1983574243 * anInt10310;
		if (class475.method7774(i_5_, i_6_, 869189926))
		    i_7_ = 1983574243 * anInt10310 + 1;
		long l = (long) aClass446_10306.aFloat4895 % 512L;
		long l_8_ = (long) aClass446_10306.aFloat4897 % 512L;
		long l_9_
		    = (long) is[i_7_][i_5_][i_6_] * (512L - l) * (512L - l_8_);
		l_9_ += l * (long) is[i_7_][1 + i_5_][i_6_] * (512L - l_8_);
		l_9_ += (long) is[i_7_][i_5_][1 + i_6_] * (512L - l) * l_8_;
		l_9_ += (long) is[i_7_][i_5_ + 1][i_6_ + 1] * l * l_8_;
		l_9_ /= 262144L;
		l_9_ -= 512L;
		float f = (float) -l_9_ - aClass446_10306.aFloat4896;
		if (f > 0.0F)
		    aClass446_10306.aFloat4896 = (float) -l_9_;
	    }
	}
    }
    
    public void method15907(Class525_Sub28 class525_sub28) {
	aClass446_10306.aFloat4895
	    = (float) (class525_sub28.anInt10614 * -794397083);
	aClass446_10306.aFloat4896
	    = (float) (class525_sub28.anInt10617 * -1069747287);
	aClass446_10306.aFloat4897
	    = (float) (class525_sub28.anInt10618 * 602488327);
	if (Float.isNaN(aClass446_10307.aFloat4895)) {
	    aClass446_10307.method7216(aClass446_10306);
	    aClass446_10309.method7217();
	}
	anInt10310 = 39871483 * class525_sub28.anInt10615;
    }
    
    void method15908(int[][][] is, Class475 class475, int i, int i_10_) {
	if (method6130(-1565824357)
	    && (aClass309_3741.method5502(-1133521593)
		|| aClass309_3741.method5520(-820942361))
	    && aClass309_3741.method5520(-1556664535) && is != null) {
	    int i_11_ = (int) aClass446_10306.aFloat4895 - i >> 9;
	    int i_12_ = (int) aClass446_10306.aFloat4897 - i_10_ >> 9;
	    if (i_11_ >= 0 && i_12_ >= 0 && i_11_ + 1 < is[0].length
		&& 1 + i_12_ < is[0][0].length) {
		int i_13_ = 1983574243 * anInt10310;
		if (class475.method7774(i_11_, i_12_, 815693142))
		    i_13_ = 1983574243 * anInt10310 + 1;
		long l = (long) aClass446_10306.aFloat4895 % 512L;
		long l_14_ = (long) aClass446_10306.aFloat4897 % 512L;
		long l_15_ = ((long) is[i_13_][i_11_][i_12_] * (512L - l)
			      * (512L - l_14_));
		l_15_
		    += l * (long) is[i_13_][1 + i_11_][i_12_] * (512L - l_14_);
		l_15_
		    += (long) is[i_13_][i_11_][1 + i_12_] * (512L - l) * l_14_;
		l_15_ += (long) is[i_13_][i_11_ + 1][i_12_ + 1] * l * l_14_;
		l_15_ /= 262144L;
		l_15_ -= 512L;
		float f = (float) -l_15_ - aClass446_10306.aFloat4896;
		if (f > 0.0F)
		    aClass446_10306.aFloat4896 = (float) -l_15_;
	    }
	}
    }
    
    public void method6136(float f, int[][][] is, Class475 class475, int i,
			   int i_16_) {
	if (aBool10308)
	    method15906(is, class475, i, i_16_, -2069512563);
	aClass309_3741.method5454(true, f, aClass446_10307,
				  aClass309_3741.method5493(272531794),
				  aClass446_10306, aClass446_10309,
				  (byte) -31);
    }
    
    public Class446 method6128() {
	return Class446.method7209(aClass446_10307);
    }
    
    public boolean method6148() {
	return !Float.isNaN(aClass446_10307.aFloat4895);
    }
    
    public Class446 method6140() {
	return Class446.method7209(aClass446_10307);
    }
    
    public Class350_Sub3(Class309 class309) {
	super(class309);
	aClass446_10306 = new Class446(Float.NaN, Float.NaN, Float.NaN);
	aClass446_10309 = new Class446();
	aBool10308 = false;
    }
    
    public Class525_Sub28 method6141() {
	return new Class525_Sub28(anInt10310 * 1983574243,
				  (int) aClass446_10307.aFloat4895,
				  (int) aClass446_10307.aFloat4896,
				  (int) aClass446_10307.aFloat4897);
    }
    
    void method15909(int[][][] is, Class475 class475, int i, int i_17_) {
	if (method6130(956039985)
	    && (aClass309_3741.method5502(-1133521593)
		|| aClass309_3741.method5520(-391299678))
	    && aClass309_3741.method5520(-159893550) && is != null) {
	    int i_18_ = (int) aClass446_10306.aFloat4895 - i >> 9;
	    int i_19_ = (int) aClass446_10306.aFloat4897 - i_17_ >> 9;
	    if (i_18_ >= 0 && i_19_ >= 0 && i_18_ + 1 < is[0].length
		&& 1 + i_19_ < is[0][0].length) {
		int i_20_ = 1983574243 * anInt10310;
		if (class475.method7774(i_18_, i_19_, 953764924))
		    i_20_ = 1983574243 * anInt10310 + 1;
		long l = (long) aClass446_10306.aFloat4895 % 512L;
		long l_21_ = (long) aClass446_10306.aFloat4897 % 512L;
		long l_22_ = ((long) is[i_20_][i_18_][i_19_] * (512L - l)
			      * (512L - l_21_));
		l_22_
		    += l * (long) is[i_20_][1 + i_18_][i_19_] * (512L - l_21_);
		l_22_
		    += (long) is[i_20_][i_18_][1 + i_19_] * (512L - l) * l_21_;
		l_22_ += (long) is[i_20_][i_18_ + 1][i_19_ + 1] * l * l_21_;
		l_22_ /= 262144L;
		l_22_ -= 512L;
		float f = (float) -l_22_ - aClass446_10306.aFloat4896;
		if (f > 0.0F)
		    aClass446_10306.aFloat4896 = (float) -l_22_;
	    }
	}
    }
    
    public void method15910(boolean bool, int i) {
	aBool10308 = bool;
    }
    
    public void method15911(Class525_Sub28 class525_sub28, byte i) {
	aClass446_10306.aFloat4895
	    = (float) (class525_sub28.anInt10614 * -794397083);
	aClass446_10306.aFloat4896
	    = (float) (class525_sub28.anInt10617 * -1069747287);
	aClass446_10306.aFloat4897
	    = (float) (class525_sub28.anInt10618 * 602488327);
	if (Float.isNaN(aClass446_10307.aFloat4895)) {
	    aClass446_10307.method7216(aClass446_10306);
	    aClass446_10309.method7217();
	}
	anInt10310 = 39871483 * class525_sub28.anInt10615;
    }
    
    public Class525_Sub28 method6146() {
	return new Class525_Sub28(anInt10310 * 1983574243,
				  (int) aClass446_10307.aFloat4895,
				  (int) aClass446_10307.aFloat4896,
				  (int) aClass446_10307.aFloat4897);
    }
    
    public float method6147() {
	return 0.0F;
    }
    
    public float method6153() {
	return 0.0F;
    }
    
    public float method6149() {
	return 0.0F;
    }
    
    public void method6138(Class291 class291, int i, int i_23_) {
	class291.anInt3219
	    = 505543655 * ((int) aClass446_10307.aFloat4895 - i);
	class291.anInt3220 = -416553419 * (int) -aClass446_10307.aFloat4896;
	class291.anInt3218
	    = ((int) aClass446_10307.aFloat4897 - i_23_) * 981552359;
    }
    
    public void method6151(Class291 class291, int i, int i_24_) {
	class291.anInt3219
	    = 505543655 * ((int) aClass446_10307.aFloat4895 - i);
	class291.anInt3220 = -416553419 * (int) -aClass446_10307.aFloat4896;
	class291.anInt3218
	    = ((int) aClass446_10307.aFloat4897 - i_24_) * 981552359;
    }
    
    public boolean method6152() {
	return !Float.isNaN(aClass446_10307.aFloat4895);
    }
    
    public void method6150(RSBuffer class525_sub38) {
	aClass446_10306.method7215(class525_sub38);
    }
    
    public void method6139(Class291 class291, int i, int i_25_) {
	class291.anInt3219
	    = 505543655 * ((int) aClass446_10307.aFloat4895 - i);
	class291.anInt3220 = -416553419 * (int) -aClass446_10307.aFloat4896;
	class291.anInt3218
	    = ((int) aClass446_10307.aFloat4897 - i_25_) * 981552359;
    }
    
    public void method15912(boolean bool) {
	aBool10308 = bool;
    }
    
    public boolean method6130(int i) {
	return !Float.isNaN(aClass446_10307.aFloat4895);
    }
    
    void method15913(int[][][] is, Class475 class475, int i, int i_26_) {
	if (method6130(491760010)
	    && (aClass309_3741.method5502(-1133521593)
		|| aClass309_3741.method5520(1220535049))
	    && aClass309_3741.method5520(-1215219285) && is != null) {
	    int i_27_ = (int) aClass446_10306.aFloat4895 - i >> 9;
	    int i_28_ = (int) aClass446_10306.aFloat4897 - i_26_ >> 9;
	    if (i_27_ >= 0 && i_28_ >= 0 && i_27_ + 1 < is[0].length
		&& 1 + i_28_ < is[0][0].length) {
		int i_29_ = 1983574243 * anInt10310;
		if (class475.method7774(i_27_, i_28_, 576546838))
		    i_29_ = 1983574243 * anInt10310 + 1;
		long l = (long) aClass446_10306.aFloat4895 % 512L;
		long l_30_ = (long) aClass446_10306.aFloat4897 % 512L;
		long l_31_ = ((long) is[i_29_][i_27_][i_28_] * (512L - l)
			      * (512L - l_30_));
		l_31_
		    += l * (long) is[i_29_][1 + i_27_][i_28_] * (512L - l_30_);
		l_31_
		    += (long) is[i_29_][i_27_][1 + i_28_] * (512L - l) * l_30_;
		l_31_ += (long) is[i_29_][i_27_ + 1][i_28_ + 1] * l * l_30_;
		l_31_ /= 262144L;
		l_31_ -= 512L;
		float f = (float) -l_31_ - aClass446_10306.aFloat4896;
		if (f > 0.0F)
		    aClass446_10306.aFloat4896 = (float) -l_31_;
	    }
	}
    }
    
    public void method6129(float f, int[][][] is, Class475 class475, int i,
			   int i_32_, int i_33_) {
	if (aBool10308)
	    method15906(is, class475, i, i_32_, -2124702689);
	aClass309_3741.method5454(true, f, aClass446_10307,
				  aClass309_3741.method5493(-1501041089),
				  aClass446_10306, aClass446_10309,
				  (byte) -69);
    }
    
    public static final void method15914(String string, String string_34_,
					 byte i) {
	Class96 class96 = Class111.method1979(-1827471886);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4338, class96.aClass6_1169,
				1977859884);
	if (string_34_.length() > 30)
	    string_34_ = string_34_.substring(0, 30);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16735
	    ((Class161.method2628(string, -936704105)
	      + Class161.method2628(string_34_, 879144737)),
	     -1571729953);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
							      157617557);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string_34_,
							      310281631);
	class96.method1794(class525_sub15, (short) 18824);
    }
}
