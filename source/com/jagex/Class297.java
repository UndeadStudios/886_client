/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class297
{
    static Class297 aClass297_3258;
    static Class297 aClass297_3259;
    static Class297 aClass297_3260;
    static Class297 aClass297_3261;
    static Class297 aClass297_3262;
    static Class297 aClass297_3263;
    static Class297 aClass297_3264 = new Class297(0);
    static Class297 aClass297_3265;
    static Class297 aClass297_3266;
    static Class297 aClass297_3267;
    static Class297 aClass297_3268;
    static Class297 aClass297_3269;
    static Class297 aClass297_3270;
    static Class297 aClass297_3271;
    static Class297 aClass297_3272;
    int anInt3273;
    public static JS5 idx_20;
    
    static {
	aClass297_3260 = new Class297(1);
	aClass297_3258 = new Class297(2);
	aClass297_3261 = new Class297(3);
	aClass297_3268 = new Class297(4);
	aClass297_3263 = new Class297(5);
	aClass297_3272 = new Class297(6);
	aClass297_3265 = new Class297(7);
	aClass297_3266 = new Class297(8);
	aClass297_3267 = new Class297(9);
	aClass297_3259 = new Class297(10);
	aClass297_3269 = new Class297(11);
	aClass297_3270 = new Class297(12);
	aClass297_3271 = new Class297(13);
	aClass297_3262 = new Class297(14);
    }
    
    Class297(int i) {
	anInt3273 = 1842189493 * i;
    }
    
    static final void method5355
	(Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1, int i) {
	if (class656_sub1_sub3_sub1.anIntArray11984 != null
	    || class656_sub1_sub3_sub1.anIntArray12008 != null) {
	    boolean bool = true;
	    Class600 class600 = client.aClass507_11137.method8350(1029148900);
	    for (int i_0_ = 0;
		 i_0_ < class656_sub1_sub3_sub1.anIntArray11984.length;
		 i_0_++) {
		int i_1_ = -1;
		if (null != class656_sub1_sub3_sub1.anIntArray11984)
		    i_1_ = class656_sub1_sub3_sub1.anIntArray11984[i_0_];
		if (i_1_ == -1) {
		    if (!class656_sub1_sub3_sub1.method18653(i_0_, -1,
							     (byte) 102))
			bool = false;
		} else {
		    bool = false;
		    boolean bool_2_ = false;
		    boolean bool_3_ = false;
		    Class446 class446
			= class656_sub1_sub3_sub1.method10818().aClass446_4807;
		    int i_4_;
		    int i_5_;
		    if ((i_1_ & ~0x3fffffff) == -1073741824) {
			int i_6_ = i_1_ & 0xfffffff;
			int i_7_ = i_6_ >> 14;
			int i_8_ = i_6_ & 0x3fff;
			i_4_ = ((int) class446.aFloat4895
				- (((i_7_ - -1227002079 * class600.anInt7858)
				    * 512)
				   + 256));
			i_5_ = ((int) class446.aFloat4897
				- (512 * (i_8_
					  - class600.anInt7860 * 1429253007)
				   + 256));
		    } else if (0 != (i_1_ & 0x8000)) {
			int i_9_ = i_1_ & 0x7fff;
			Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
			    = (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
			       [i_9_]);
			if (null != class656_sub1_sub3_sub1_sub1) {
			    Class446 class446_10_
				= (class656_sub1_sub3_sub1_sub1.method10818()
				   .aClass446_4807);
			    i_4_ = ((int) class446.aFloat4895
				    - (int) class446_10_.aFloat4895);
			    i_5_ = ((int) class446.aFloat4897
				    - (int) class446_10_.aFloat4897);
			} else {
			    class656_sub1_sub3_sub1.method18653(i_0_, -1,
								(byte) 36);
			    continue;
			}
		    } else {
			Class525_Sub19 class525_sub19
			    = ((Class525_Sub19)
			       client.aClass10_11121.method684((long) i_1_));
			if (null != class525_sub19) {
			    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
				= ((Class656_Sub1_Sub3_Sub1_Sub2)
				   class525_sub19.anObject10571);
			    Class446 class446_11_
				= (class656_sub1_sub3_sub1_sub2.method10818()
				   .aClass446_4807);
			    i_4_ = ((int) class446.aFloat4895
				    - (int) class446_11_.aFloat4895);
			    i_5_ = ((int) class446.aFloat4897
				    - (int) class446_11_.aFloat4897);
			} else {
			    class656_sub1_sub3_sub1.method18653(i_0_, -1,
								(byte) 57);
			    continue;
			}
		    }
		    if (0 != i_4_ || 0 != i_5_)
			class656_sub1_sub3_sub1.method18653
			    (i_0_,
			     (int) (Math.atan2((double) i_4_, (double) i_5_)
				    * 2607.5945876176133) & 0x3fff,
			     (byte) 97);
		}
	    }
	    if (bool) {
		class656_sub1_sub3_sub1.anIntArray11984 = null;
		class656_sub1_sub3_sub1.anIntArray12008 = null;
	    }
	}
    }
    
    static final void method5356(Class683 class683, byte i) {
	int i_12_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class531_Sub4.method15957(i_12_, (byte) -108);
    }
}
