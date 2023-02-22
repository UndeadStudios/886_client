/* Class384 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class384 implements Interface45
{
    public int anInt4011;
    public static final int anInt4012 = 1;
    public static final int anInt4013 = 2;
    public Class395 aClass395_4014;
    public int anInt4015;
    public Class396 aClass396_4016;
    public int anInt4017;
    public int anInt4018;
    public static final int anInt4019 = 0;
    public int anInt4020;
    
    public static Class384 method6432(RSBuffer class525_sub38) {
	Class395 class395 = (Class96.method1813(-2063234458)
			     [class525_sub38.readUnsignedByte(332516933)]);
	Class396 class396 = (Class643.method10595((byte) 121)
			     [class525_sub38.readUnsignedByte(949041185)]);
	int i = class525_sub38.readSmart((byte) 1);
	int i_0_ = class525_sub38.readSmart((byte) -91);
	int i_1_ = class525_sub38.readBigSmart(-2043778683);
	int i_2_ = class525_sub38.readInt(1434840080);
	int i_3_ = class525_sub38.readUnsignedByte(1570473198);
	return new Class384(class395, class396, i, i_0_, i_1_, i_2_, i_3_);
    }
    
    Class384(Class395 class395, Class396 class396, int i, int i_4_, int i_5_,
	     int i_6_, int i_7_) {
	aClass395_4014 = class395;
	aClass396_4016 = class396;
	anInt4011 = 428808767 * i;
	anInt4017 = 1257628669 * i_4_;
	anInt4018 = -1469022235 * i_5_;
	anInt4015 = -898204955 * i_6_;
	anInt4020 = i_7_ * 1478782093;
    }
    
    public Class392 method335() {
	return Class392.aClass392_4082;
    }
    
    public Class392 method334(int i) {
	return Class392.aClass392_4082;
    }
    
    public Class392 method336() {
	return Class392.aClass392_4082;
    }
    
    static final void method6433(Class683 class683, byte i) {
	class683.anInt8662 -= -826678987;
	int i_8_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_9_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	int i_10_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	int i_11_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 3];
	int i_12_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 4];
	Class40_Sub20.aClass217_11050.method4047
	    (Class204.aClass204_2233, i_8_, i_9_, i_11_,
	     Class208.aClass208_2250.method3907((short) -19410),
	     Class195.aClass195_2177, 0.0F, 0.0F, null, 0, i_12_, i_10_,
	     2120512931);
    }
    
    static final void method6434(Class683 class683, byte i) {
	int i_13_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (Class556_Sub1.aClass10_10634 != null) {
	    Class525 class525
		= Class556_Sub1.aClass10_10634.method684((long) i_13_);
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class525 != null ? 1 : 0;
	} else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method6435(Class683 class683, int i) {
	int i_14_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub30_10696
		  .method14167(i_14_, (byte) -18);
    }
    
    static final void method6436(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class618.method10160(class259, class245, class683, (byte) 9);
    }
    
    public static void method6437(boolean bool, int i) {
	for (Class525_Sub2 class525_sub2
		 = ((Class525_Sub2)
		    Class525_Sub2.aClass709_10429.method14372((short) -31368));
	     null != class525_sub2;
	     class525_sub2 = (Class525_Sub2) Class525_Sub2.aClass709_10429
						 .method14353(-1831245720)) {
	    if (null != class525_sub2.aClass488_10435) {
		class525_sub2.aClass488_10435.method7916(150, (byte) -93);
		Class40_Sub20.aClass217_11050
		    .method4026(class525_sub2.aClass488_10435, 1609628712);
		class525_sub2.aClass488_10435 = null;
	    }
	    if (class525_sub2.aClass488_10436 != null) {
		class525_sub2.aClass488_10436.method7916(150, (byte) -57);
		Class40_Sub20.aClass217_11050
		    .method4026(class525_sub2.aClass488_10436, -908014964);
		class525_sub2.aClass488_10436 = null;
	    }
	    class525_sub2.method8755(-1933461091);
	}
	if (bool) {
	    for (Class525_Sub2 class525_sub2
		     = (Class525_Sub2) Class525_Sub2.aClass709_10411
					   .method14372((short) -4594);
		 class525_sub2 != null;
		 class525_sub2
		     = (Class525_Sub2) Class525_Sub2.aClass709_10411
					   .method14353(-1146314980)) {
		if (null != class525_sub2.aClass488_10435) {
		    class525_sub2.aClass488_10435.method7916(150, (byte) -33);
		    Class40_Sub20.aClass217_11050
			.method4026(class525_sub2.aClass488_10435, 2104446737);
		    class525_sub2.aClass488_10435 = null;
		}
		class525_sub2.method8755(-1933461091);
	    }
	    for (Class525_Sub2 class525_sub2
		     = ((Class525_Sub2)
			Class525_Sub2.aClass10_10412.method689(1178189418));
		 class525_sub2 != null;
		 class525_sub2 = (Class525_Sub2) Class525_Sub2
						     .aClass10_10412
						     .method690((byte) -34)) {
		if (null != class525_sub2.aClass488_10435) {
		    class525_sub2.aClass488_10435.method7916(150, (byte) -52);
		    Class40_Sub20.aClass217_11050
			.method4026(class525_sub2.aClass488_10435, 450709338);
		    class525_sub2.aClass488_10435 = null;
		}
		class525_sub2.method8755(-1933461091);
	    }
	}
    }
}
