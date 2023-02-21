/* Class399_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class399_Sub1 extends Class399
{
    public int anInt10230;
    
    public static Class399 method15870(RSBuffer class525_sub38) {
	Class399 class399
	    = Class40_Sub2.method17401(class525_sub38, -1795510650);
	int i = class525_sub38.method16699(-2070719328);
	return new Class399_Sub1(class399.anInt4127 * -1638978771,
				 class399.aClass395_4126,
				 class399.aClass396_4129,
				 class399.anInt4128 * -2069204943,
				 class399.anInt4125 * 1167061423, i);
    }
    
    public Class392 method334(int i) {
	return Class392.aClass392_4080;
    }
    
    public Class392 method336() {
	return Class392.aClass392_4080;
    }
    
    public Class392 method335() {
	return Class392.aClass392_4080;
    }
    
    Class399_Sub1(int i, Class395 class395, Class396 class396, int i_0_,
		  int i_1_, int i_2_) {
	super(i, class395, class396, i_0_, i_1_);
	anInt10230 = i_2_ * -1332748329;
    }
    
    public static Class399 method15871(RSBuffer class525_sub38) {
	Class399 class399
	    = Class40_Sub2.method17401(class525_sub38, -559939089);
	int i = class525_sub38.method16699(-2021308210);
	return new Class399_Sub1(class399.anInt4127 * -1638978771,
				 class399.aClass395_4126,
				 class399.aClass396_4129,
				 class399.anInt4128 * -2069204943,
				 class399.anInt4125 * 1167061423, i);
    }
    
    static final void method15872(Class683 class683, int i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub46_10718,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]) != 0 ? 1 : 0,
	     (byte) -86);
	Class650.method10715(-1758466106);
    }
    
    static final int method15873(int i, int i_3_, int i_4_) {
	int i_5_ = i_3_ * 57 + i;
	i_5_ = i_5_ << 13 ^ i_5_;
	int i_6_
	    = 1376312589 + i_5_ * (789221 + i_5_ * i_5_ * 15731) & 0x7fffffff;
	return i_6_ >> 19 & 0xff;
    }
    
    public static boolean method15874(int i, int i_7_) {
	return 0 == i || i == 2;
    }
    
    static void method15875(Class182 class182, int i, int i_8_, int i_9_,
			    int i_10_, int i_11_, Class175 class175,
			    Class7 class7, String string, int i_12_) {
	int i_13_ = (255 - -320078313 * Class706.anInt8809
		     - Class61.anInt680 * -218665147);
	if (i_13_ < 0)
	    i_13_ = 0;
	if (null == Class525_Sub16_Sub3.aClass157_11415
	    || Class238.aClass157_2403 == null) {
	    if (Class462.aClass458_5095
		    .method7506(Class709.anInt8822 * -1623325039, 1343964889)
		&& Class462.aClass458_5095.method7506((Class442.anInt4867
						       * -88227043),
						      475842427)) {
		Class525_Sub16_Sub3.aClass157_11415
		    = (class182.method3216
		       (Class187.method3667(Class462.aClass458_5095,
					    Class709.anInt8822 * -1623325039,
					    0),
			true));
		Class173 class173
		    = Class187.method3667(Class462.aClass458_5095,
					  -88227043 * Class442.anInt4867, 0);
		Class238.aClass157_2403 = class182.method3216(class173, true);
		class173.method2773();
		Class267_Sub1.aClass157_10011
		    = class182.method3216(class173, true);
	    } else
		class182.method3151(i, i_8_, i_9_, i_11_,
				    (i_13_ << 24
				     | -731012971 * Class530.anInt7146),
				    1);
	}
	if (null != Class525_Sub16_Sub3.aClass157_11415
	    && Class238.aClass157_2403 != null) {
	    int i_14_ = ((i_9_ - Class238.aClass157_2403.method2503() * 2)
			 / Class525_Sub16_Sub3.aClass157_11415.method2503());
	    for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
		Class525_Sub16_Sub3.aClass157_11415.method2518
		    ((i + Class238.aClass157_2403.method2503()
		      + (i_15_
			 * Class525_Sub16_Sub3.aClass157_11415.method2503())),
		     i_8_);
	    Class238.aClass157_2403.method2518(i, i_8_);
	    Class267_Sub1.aClass157_10011.method2518
		(i + i_9_ - Class267_Sub1.aClass157_10011.method2503(), i_8_);
	}
	class175.method2851(string, i + 3,
			    ((20 - 385749773 * class7.anInt49) / 2
			     + (class7.anInt49 * 385749773 + i_8_)),
			    Class629.anInt8160 * -476126693 | ~0xffffff, -1,
			    -1143380950);
	class182.method3151(i, i_8_ + i_11_, i_9_, i_10_ - i_11_,
			    i_13_ << 24 | -731012971 * Class530.anInt7146, 1);
    }
}
