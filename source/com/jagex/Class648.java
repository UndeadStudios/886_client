/* Class648 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class648 implements Interface12
{
    Class640 aClass640_8359;
    int anInt8360;
    public int anInt8361;
    public int anInt8362;
    public static int anInt8363;
    
    Class648(int i, Class640 class640) {
	aClass640_8359 = class640;
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(606767836);
	    if (i_0_ == 0)
		break;
	    method10696(class525_sub38, i_0_, 1909423298);
	}
    }
    
    void method10696(RSBuffer class525_sub38, int i, int i_1_) {
	if (1 == i)
	    anInt8360 = class525_sub38.readBigSmart(-2043778683) * -463211659;
	else if (2 == i) {
	    anInt8362 = class525_sub38.readUnsignedByte(178322323) * 1516101425;
	    anInt8361 = class525_sub38.readUnsignedByte(1730438568) * 873115129;
	}
    }
    
    public synchronized Class173 method10697(int i) {
	Class173 class173
	    = ((Class173)
	       aClass640_8359.aClass200_8320.method3785((long) (-31128355
								* anInt8360)));
	if (class173 != null)
	    return class173;
	class173 = Class187.method3667(aClass640_8359.aClass458_8321,
				       anInt8360 * -31128355, 0);
	if (class173 != null)
	    aClass640_8359.aClass200_8320
		.method3788(class173, (long) (-31128355 * anInt8360));
	return class173;
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(116367351);
	    if (i == 0)
		break;
	    method10696(class525_sub38, i, -315013427);
	}
    }
    
    public synchronized Class173 method10698() {
	Class173 class173
	    = ((Class173)
	       aClass640_8359.aClass200_8320.method3785((long) (-31128355
								* anInt8360)));
	if (class173 != null)
	    return class173;
	class173 = Class187.method3667(aClass640_8359.aClass458_8321,
				       anInt8360 * -31128355, 0);
	if (class173 != null)
	    aClass640_8359.aClass200_8320
		.method3788(class173, (long) (-31128355 * anInt8360));
	return class173;
    }
    
    public void method70() {
	/* empty */
    }
    
    void method10699(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    anInt8360 = class525_sub38.readBigSmart(-2043778683) * -463211659;
	else if (2 == i) {
	    anInt8362 = class525_sub38.readUnsignedByte(569641638) * 1516101425;
	    anInt8361 = class525_sub38.readUnsignedByte(595360845) * 873115129;
	}
    }
    
    public synchronized Class173 method10700() {
	Class173 class173
	    = ((Class173)
	       aClass640_8359.aClass200_8320.method3785((long) (-31128355
								* anInt8360)));
	if (class173 != null)
	    return class173;
	class173 = Class187.method3667(aClass640_8359.aClass458_8321,
				       anInt8360 * -31128355, 0);
	if (class173 != null)
	    aClass640_8359.aClass200_8320
		.method3788(class173, (long) (-31128355 * anInt8360));
	return class173;
    }
    
    public synchronized Class173 method10701() {
	Class173 class173
	    = ((Class173)
	       aClass640_8359.aClass200_8320.method3785((long) (-31128355
								* anInt8360)));
	if (class173 != null)
	    return class173;
	class173 = Class187.method3667(aClass640_8359.aClass458_8321,
				       anInt8360 * -31128355, 0);
	if (class173 != null)
	    aClass640_8359.aClass200_8320
		.method3788(class173, (long) (-31128355 * anInt8360));
	return class173;
    }
    
    public void method69() {
	/* empty */
    }
    
    public static Interface69 method10702
	(Class458 class458, int i, Interface70 interface70, boolean bool,
	 Class200 class200, int i_2_) {
	if (Class661.aClass372_8473 != null) {
	    if (bool)
		return new Class601(class458, i, Class661.aClass372_8473,
				    interface70);
	    return new Class599(class458, i, Class661.aClass372_8473,
				interface70, class200);
	}
	return null;
    }
    
    static final void method10703(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static void method10704(Class458 class458, Class458 class458_3_,
				   Class458 class458_4_, Class458 class458_5_,
				   int i) {
	Class172.aClass458_1861 = class458;
	Class98.aClass458_1206 = class458_3_;
	Class203.aClass458_2223 = class458_4_;
	Class162.aClass245Array1764
	    = new Class245[Class172.aClass458_1861.method7505(512290779)];
	Class593.aBoolArray7832
	    = new boolean[Class172.aClass458_1861.method7505(763514308)];
    }
    
    public static String method10705(long l, int i, int i_6_) {
	Class677.method11134(l);
	int i_7_ = Class86.aCalendar890.get(5);
	int i_8_ = Class86.aCalendar890.get(2);
	int i_9_ = Class86.aCalendar890.get(1);
	if (3 == i)
	    return Class540.method8892(l, i, (short) -27900);
	return new StringBuilder().append(Integer.toString(i_7_ / 10)).append
		   (i_7_ % 10).append
		   ("-").append
		   (Class86.aStringArrayArray889[i][i_8_]).append
		   ("-").append
		   (i_9_).toString();
    }
    
    static final void method10706(Class683 class683, byte i) {
	class683.anInt8662 -= 1915637188;
	int i_10_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_11_
	    = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	int i_12_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	int i_13_
	    = class683.anIntArray8661[3 + class683.anInt8662 * 501271953];
	int i_14_ = 256;
	Class40_Sub20.aClass217_11050.method4047
	    (Class204.aClass204_2233, i_10_, i_11_, i_13_,
	     Class208.aClass208_2250.method3907((short) -5838),
	     Class195.aClass195_2177, 0.0F, 0.0F, null, 0, i_14_, i_12_,
	     2139520928);
    }
}
