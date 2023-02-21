/* Class451 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class451
{
    static final int anInt4927 = 3;
    static final int anInt4928 = 1;
    static final int anInt4929 = 2;
    static final int anInt4930 = 0;
    static final int anInt4931 = 4;
    static final int anInt4932 = 6;
    static final int anInt4933 = 7;
    static int anInt4934;
    
    Class451() throws Throwable {
	throw new Error();
    }
    
    static void method7333(Class182 class182, int i, int i_0_,
			   Class259 class259, Class152 class152, int i_1_,
			   int i_2_, int i_3_) {
	for (int i_4_ = 0; i_4_ < 1111866889 * client.anInt11216; i_4_++) {
	    Class525_Sub19 class525_sub19
		= ((Class525_Sub19)
		   client.aClass10_11121
		       .method684((long) client.anIntArray11125[i_4_]));
	    if (class525_sub19 != null) {
		Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		    = ((Class656_Sub1_Sub3_Sub1_Sub2)
		       class525_sub19.anObject10571);
		if (class656_sub1_sub3_sub1_sub2.method18954(90581083)
		    && (class656_sub1_sub3_sub1_sub2.aByte10867
			== (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			    .aByte10867))) {
		    Class299 class299
			= class656_sub1_sub3_sub1_sub2.aClass299_12255;
		    if (class299 != null && null != class299.anIntArray3323)
			class299 = class299.method5386(Class532.aClass111_7170,
						       Class532.aClass111_7170,
						       2140444961);
		    if (class299 != null && class299.aBool3310
			&& class299.aBool3326) {
			Class446 class446
			    = (class656_sub1_sub3_sub1_sub2.method10818()
			       .aClass446_4807);
			int i_5_ = (int) class446.aFloat4895 / 128 - i / 128;
			int i_6_
			    = (int) class446.aFloat4897 / 128 - i_0_ / 128;
			if (-1 != class299.anInt3348 * 1552956859)
			    Class413.method6689(class182, class152, class259,
						i_1_, i_2_, i_5_, i_6_,
						(1552956859
						 * class299.anInt3348),
						491212854);
			else
			    Class182.method3593(class259, class152, i_1_, i_2_,
						i_5_, i_6_,
						Class66.aClass157Array716[1],
						-1796527445);
		    }
		}
	    }
	}
    }
    
    static final void method7334(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class509.aClass569_5662.method9499(501271953);
    }
    
    static final void method7335(Class683 class683, byte i) {
	Class202.method3853(Class152_Sub1.method14533(-634213688), (byte) -71);
    }
    
    static final void method7336(Class683 class683, short i) {
	class683.anInt8662 -= 1552651121;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final int method7337(int i, int i_7_, int i_8_, int i_9_,
				byte i_10_) {
	int i_11_ = 65536 - Class436.anIntArray4838[8192 * i_8_ / i_9_] >> 1;
	return ((65536 - i_11_) * i >> 16) + (i_11_ * i_7_ >> 16);
    }
    
    static final void method7338(Class683 class683, byte i) {
	int i_12_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_12_, -695254952);
	Class50.method1129(class259, class683, 1441151524);
    }
    
    public static int method7339(Class458 class458, int i) {
	int i_13_ = 0;
	if (class458.method7506(741597445 * Class29.anInt288, -966251025))
	    i_13_++;
	if (class458.method7506(Class702.anInt8789 * 53628611, -1788676536))
	    i_13_++;
	if (class458.method7506(1469205153 * Class29.anInt289, -1554084186))
	    i_13_++;
	if (class458.method7506(Class509.anInt5661 * -14186507, -1898636132))
	    i_13_++;
	if (class458.method7506(Class285.anInt3138 * -1273442049, -2042588684))
	    i_13_++;
	if (class458.method7506(Class29.anInt290 * -488679847, 2081272383))
	    i_13_++;
	if (class458.method7506(Class138.anInt1639 * -1991446261, 1966156226))
	    i_13_++;
	if (class458.method7506(Class29.anInt291 * -918576593, -1469904947))
	    i_13_++;
	if (class458.method7506(-1204402367 * Class696_Sub35.anInt10976,
				-1929671757))
	    i_13_++;
	if (class458.method7506(-1223256679 * Class29.anInt292, -2018207638))
	    i_13_++;
	return i_13_;
    }
}
