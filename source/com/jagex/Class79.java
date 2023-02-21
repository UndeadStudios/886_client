/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class79 implements Interface12
{
    public boolean aBool837 = false;
    public int anInt838;
    int[] anIntArray839;
    public int anInt840;
    Class90 aClass90_841;
    
    public Class157 method1574(Class182 class182, int i, boolean bool,
			       int i_0_) {
	long l = (long) (1911611899 * anInt838 | i << 16 | (bool ? 262144 : 0)
			 | -2117565327 * class182.anInt1942 << 19);
	Class157 class157
	    = (Class157) aClass90_841.aClass200_898.method3785(l);
	if (null != class157)
	    return class157;
	method1577(class182, i, bool, l);
	return (Class157) aClass90_841.aClass200_898.method3785(l);
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_1_ = class525_sub38.readUnsignedByte(441528836);
	    if (0 == i_1_)
		break;
	    method1575(class525_sub38, i_1_, -615772517);
	}
    }
    
    void method1575(RSBuffer class525_sub38, int i, int i_2_) {
	do {
	    if (i == 1)
		anInt838
		    = class525_sub38.readBigSmart(-2043778683) * 2073231667;
	    else if (2 == i)
		anInt840
		    = class525_sub38.method16834(-1994884458) * -1045117465;
	    else if (3 == i)
		aBool837 = true;
	    else if (i == 4)
		anInt838 = -2073231667;
	    else if (i == 5)
		break;
	} while (false);
    }
    
    Class79(int i, Class90 class90) {
	aClass90_841 = class90;
    }
    
    public Class157 method1576(Class182 class182, int i, boolean bool) {
	long l = (long) (1911611899 * anInt838 | i << 16 | (bool ? 262144 : 0)
			 | -2117565327 * class182.anInt1942 << 19);
	Class157 class157
	    = (Class157) aClass90_841.aClass200_898.method3785(l);
	if (null != class157)
	    return class157;
	method1577(class182, i, bool, l);
	return (Class157) aClass90_841.aClass200_898.method3785(l);
    }
    
    void method1577(Class182 class182, int i, boolean bool, long l) {
	if (aClass90_841.aClass458_897.method7506(anInt838 * 1911611899,
						  589553454)) {
	    Class173 class173 = Class187.method3667(aClass90_841.aClass458_897,
						    anInt838 * 1911611899, 0);
	    if (class173 != null) {
		class173.method2770();
		if (bool)
		    class173.method2776();
		for (int i_3_ = 0; i_3_ < i; i_3_++)
		    class173.method2777();
		anIntArray839 = class173.method2778(false);
		if (0 != -443253289 * anInt840) {
		    int i_4_ = (-443253289 * anInt840 & 0xff0000) >> 16;
		    int i_5_ = (anInt840 * -443253289 & 0xff00) >> 8;
		    int i_6_ = anInt840 * -443253289 & 0xff;
		    for (int i_7_ = 0; i_7_ < anIntArray839.length; i_7_++) {
			int i_8_ = anIntArray839[i_7_] >> 24 & 0xff;
			int i_9_ = 256 - i_8_;
			if (0 != i_8_) {
			    int i_10_
				= -16777216 * ((anIntArray839[i_7_] & 0xff0000)
					       * i_4_);
			    int i_11_
				= (16711680
				   * ((anIntArray839[i_7_] & 0xff00) * i_5_));
			    int i_12_
				= (anIntArray839[i_7_] & 0xff) * i_6_ * 65280;
			    int i_13_ = (i_10_ | i_11_ | i_12_) >>> 8;
			    if (255 == i_8_)
				anIntArray839[i_7_] = i_13_;
			    else {
				int i_14_ = anIntArray839[i_7_];
				anIntArray839[i_7_]
				    = (i_8_ << 24
				       | (((i_9_ * (i_13_ & 0xff00ff)
					    + (i_14_ & 0xff00ff) * i_8_)
					   & ~0xff00ff)
					  + ((i_9_ * (i_13_ & 0xff00)
					      + i_8_ * (i_14_ & 0xff00))
					     & 0xff0000)) >> 8);
			    }
			}
		    }
		}
	    }
	    Class157 class157 = class182.method3216(class173, true);
	    if (class157 != null)
		aClass90_841.aClass200_898.method3788(class157, l);
	}
    }
    
    public void method70() {
	/* empty */
    }
    
    public int[] method1578(Class182 class182, int i, boolean bool,
			    byte i_15_) {
	if (anIntArray839 != null)
	    return anIntArray839;
	long l = (long) (1911611899 * anInt838 | i << 16 | (bool ? 262144 : 0)
			 | class182.anInt1942 * -2117565327 << 19);
	method1577(class182, i, bool, l);
	return anIntArray839;
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1466762545);
	    if (0 == i)
		break;
	    method1575(class525_sub38, i, 1377504552);
	}
    }
    
    public boolean method1579() {
	return aClass90_841.aClass458_897.method7506(1911611899 * anInt838,
						     -1400679431);
    }
    
    public void method69() {
	/* empty */
    }
    
    void method1580(RSBuffer class525_sub38, int i) {
	do {
	    if (i == 1)
		anInt838
		    = class525_sub38.readBigSmart(-2043778683) * 2073231667;
	    else if (2 == i)
		anInt840
		    = class525_sub38.method16834(-1994884458) * -1045117465;
	    else if (3 == i)
		aBool837 = true;
	    else if (i == 4)
		anInt838 = -2073231667;
	    else if (i == 5)
		break;
	} while (false);
    }
    
    void method1581(Class182 class182, int i, boolean bool, long l) {
	if (aClass90_841.aClass458_897.method7506(anInt838 * 1911611899,
						  1200305585)) {
	    Class173 class173 = Class187.method3667(aClass90_841.aClass458_897,
						    anInt838 * 1911611899, 0);
	    if (class173 != null) {
		class173.method2770();
		if (bool)
		    class173.method2776();
		for (int i_16_ = 0; i_16_ < i; i_16_++)
		    class173.method2777();
		anIntArray839 = class173.method2778(false);
		if (0 != -443253289 * anInt840) {
		    int i_17_ = (-443253289 * anInt840 & 0xff0000) >> 16;
		    int i_18_ = (anInt840 * -443253289 & 0xff00) >> 8;
		    int i_19_ = anInt840 * -443253289 & 0xff;
		    for (int i_20_ = 0; i_20_ < anIntArray839.length;
			 i_20_++) {
			int i_21_ = anIntArray839[i_20_] >> 24 & 0xff;
			int i_22_ = 256 - i_21_;
			if (0 != i_21_) {
			    int i_23_ = (-16777216
					 * ((anIntArray839[i_20_] & 0xff0000)
					    * i_17_));
			    int i_24_
				= 16711680 * ((anIntArray839[i_20_] & 0xff00)
					      * i_18_);
			    int i_25_ = ((anIntArray839[i_20_] & 0xff) * i_19_
					 * 65280);
			    int i_26_ = (i_23_ | i_24_ | i_25_) >>> 8;
			    if (255 == i_21_)
				anIntArray839[i_20_] = i_26_;
			    else {
				int i_27_ = anIntArray839[i_20_];
				anIntArray839[i_20_]
				    = (i_21_ << 24
				       | (((i_22_ * (i_26_ & 0xff00ff)
					    + (i_27_ & 0xff00ff) * i_21_)
					   & ~0xff00ff)
					  + ((i_22_ * (i_26_ & 0xff00)
					      + i_21_ * (i_27_ & 0xff00))
					     & 0xff0000)) >> 8);
			    }
			}
		    }
		}
	    }
	    Class157 class157 = class182.method3216(class173, true);
	    if (class157 != null)
		aClass90_841.aClass200_898.method3788(class157, l);
	}
    }
    
    public int[] method1582(Class182 class182, int i, boolean bool) {
	if (anIntArray839 != null)
	    return anIntArray839;
	long l = (long) (1911611899 * anInt838 | i << 16 | (bool ? 262144 : 0)
			 | class182.anInt1942 * -2117565327 << 19);
	method1577(class182, i, bool, l);
	return anIntArray839;
    }
    
    public int[] method1583(Class182 class182, int i, boolean bool) {
	if (anIntArray839 != null)
	    return anIntArray839;
	long l = (long) (1911611899 * anInt838 | i << 16 | (bool ? 262144 : 0)
			 | class182.anInt1942 * -2117565327 << 19);
	method1577(class182, i, bool, l);
	return anIntArray839;
    }
    
    public int[] method1584(Class182 class182, int i, boolean bool) {
	if (anIntArray839 != null)
	    return anIntArray839;
	long l = (long) (1911611899 * anInt838 | i << 16 | (bool ? 262144 : 0)
			 | class182.anInt1942 * -2117565327 << 19);
	method1577(class182, i, bool, l);
	return anIntArray839;
    }
    
    public boolean method1585(int i) {
	return aClass90_841.aClass458_897.method7506(1911611899 * anInt838,
						     1376930235);
    }
    
    public void method67(int i) {
	/* empty */
    }
}
