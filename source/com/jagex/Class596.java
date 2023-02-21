/* Class596 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class596
{
    String aString7839;
    int anInt7840;
    
    Class596() {
	/* empty */
    }
    
    static final void method9835(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class324.method5736(class259, class245, class683, -1002941375);
    }
    
    public static void method9836(Class531 class531, Class531 class531_1_,
				  int i) {
	if (null != class531.aClass531_7148)
	    class531.method8794(934024609);
	class531.aClass531_7148 = class531_1_;
	class531.aClass531_7147 = class531_1_.aClass531_7147;
	class531.aClass531_7148.aClass531_7147 = class531;
	class531.aClass531_7147.aClass531_7148 = class531;
    }
    
    static final void method9837(Class683 class683, short i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static final void method9838(int i, int i_2_, int i_3_, int i_4_,
					boolean bool, int i_5_) {
	if (i_3_ < 1)
	    i_3_ = 1;
	if (i_4_ < 1)
	    i_4_ = 1;
	int i_6_ = i_4_ - 334;
	if (i_6_ < 0)
	    i_6_ = 0;
	else if (i_6_ > 100)
	    i_6_ = 100;
	int i_7_ = (client.aShort11348
		    + i_6_ * (client.aShort11349 - client.aShort11348) / 100);
	int i_8_ = i_7_ * i_4_ * 512 / (i_3_ * 334);
	if (i_8_ < client.aShort11175) {
	    i_8_ = client.aShort11175;
	    i_7_ = 334 * (i_3_ * i_8_) / (i_4_ * 512);
	    if (i_7_ > client.aShort11353) {
		i_7_ = client.aShort11353;
		int i_9_ = 512 * (i_4_ * i_7_) / (i_8_ * 334);
		int i_10_ = (i_3_ - i_9_) / 2;
		if (bool) {
		    Class501.aClass182_5564.method3480();
		    Class501.aClass182_5564.method3190(i, i_2_, i_10_, i_4_,
						       -16777216, (byte) -1);
		    Class501.aClass182_5564.method3190(i + i_3_ - i_10_, i_2_,
						       i_10_, i_4_, -16777216,
						       (byte) -1);
		}
		i += i_10_;
		i_3_ -= i_10_ * 2;
	    }
	} else if (i_8_ > client.aShort11355) {
	    i_8_ = client.aShort11355;
	    i_7_ = i_3_ * i_8_ * 334 / (512 * i_4_);
	    if (i_7_ < client.aShort11352) {
		i_7_ = client.aShort11352;
		int i_11_ = 334 * (i_8_ * i_3_) / (512 * i_7_);
		int i_12_ = (i_4_ - i_11_) / 2;
		if (bool) {
		    Class501.aClass182_5564.method3480();
		    Class501.aClass182_5564.method3190(i, i_2_, i_3_, i_12_,
						       -16777216, (byte) -1);
		    Class501.aClass182_5564.method3190(i, i_4_ + i_2_ - i_12_,
						       i_3_, i_12_, -16777216,
						       (byte) -1);
		}
		i_2_ += i_12_;
		i_4_ -= i_12_ * 2;
	    }
	}
	client.anInt11360 = -2079531213 * (i_4_ * i_7_ / 334);
	client.anInt11292 = 450767939 * i;
	client.anInt11357 = 1298049481 * i_2_;
	client.anInt11067 = -1976210209 * (short) i_3_;
	client.anInt11359 = -1548923185 * (short) i_4_;
    }
}
