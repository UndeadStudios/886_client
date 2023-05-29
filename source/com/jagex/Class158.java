/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class158
{
    static float aFloat1737;
    int anInt1738 = 768;
    Interface15 anInterface15_1739;
    Class137 aClass137_1740;
    Class137 aClass137_1741;
    Class137 aClass137_1742;
    int anInt1743 = 64;
    int anInt1744 = 64;
    int anInt1745 = 1600;
    int anInt1746;
    Class531_Sub5_Sub1[][] aClass531_Sub5_Sub1ArrayArray1747;
    int[] anIntArray1748;
    int[] anIntArray1749;
    int[] anIntArray1750;
    int anInt1751;
    float[] aFloatArray1752 = new float[16];
    Class525_Sub38_Sub1 aClass525_Sub38_Sub1_1753
	= new Class525_Sub38_Sub1(786336);
    Class531_Sub5_Sub1[][] aClass531_Sub5_Sub1ArrayArray1754;
    
    void method2554(Class182_Sub3 class182_sub3) {
	anInterface15_1739 = class182_sub3.method15533(24, null, 196584, true);
	aClass137_1742 = new Class137(anInterface15_1739, 5126, 2, 0);
	aClass137_1740 = new Class137(anInterface15_1739, 5126, 3, 8);
	aClass137_1741 = new Class137(anInterface15_1739, 5121, 4, 20);
    }
    
    void method2555(Class182_Sub3 class182_sub3, Class185 class185) {
	if (class182_sub3.aClass435_9715 != null) {
	    method2558(class182_sub3);
	    float f = class182_sub3.aClass435_9715.aFloatArray4830[2];
	    float f_0_ = class182_sub3.aClass435_9715.aFloatArray4830[6];
	    float f_1_ = class182_sub3.aClass435_9715.aFloatArray4830[10];
	    float f_2_ = class182_sub3.aClass435_9715.aFloatArray4830[14];
	    try {
		int i = 0;
		int i_3_ = 2147483647;
		int i_4_ = 0;
		Class531_Sub5 class531_sub5
		    = class185.aClass698_2081.aClass531_Sub5_8768;
		for (Class531_Sub5 class531_sub5_5_
			 = class531_sub5.aClass531_Sub5_10342;
		     class531_sub5_5_ != class531_sub5;
		     class531_sub5_5_
			 = class531_sub5_5_.aClass531_Sub5_10342) {
		    Class531_Sub5_Sub1 class531_sub5_sub1
			= (Class531_Sub5_Sub1) class531_sub5_5_;
		    int i_6_
			= (int) (f * (float) (class531_sub5_sub1.anInt11731
					      >> 12)
				 + (f_0_
				    * (float) (class531_sub5_sub1.anInt11729
					       >> 12))
				 + (f_1_
				    * (float) (class531_sub5_sub1.anInt11730
					       >> 12))
				 + f_2_);
		    if (i_6_ > i_4_)
			i_4_ = i_6_;
		    if (i_6_ < i_3_)
			i_3_ = i_6_;
		    anIntArray1748[i++] = i_6_;
		}
		int i_7_ = i_4_ - i_3_;
		int i_8_;
		if (i_7_ + 2 > 1600) {
		    i_8_
			= 1 + Textures.method3120(i_7_, (byte) 18) - anInt1746;
		    i_7_ = (i_7_ >> i_8_) + 2;
		} else {
		    i_8_ = 0;
		    i_7_ += 2;
		}
		Class531_Sub5 class531_sub5_9_
		    = class531_sub5.aClass531_Sub5_10342;
		i = 0;
		int i_10_ = -2;
		boolean bool = true;
		boolean bool_11_ = true;
		while (class531_sub5_9_ != class531_sub5) {
		    anInt1751 = 0;
		    for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
			anIntArray1749[i_12_] = 0;
		    for (int i_13_ = 0; i_13_ < 64; i_13_++)
			anIntArray1750[i_13_] = 0;
		    for (/**/; class531_sub5_9_ != class531_sub5;
			 class531_sub5_9_
			     = class531_sub5_9_.aClass531_Sub5_10342) {
			Class531_Sub5_Sub1 class531_sub5_sub1
			    = (Class531_Sub5_Sub1) class531_sub5_9_;
			if (bool_11_) {
			    i_10_ = class531_sub5_sub1.anInt11735;
			    bool = class531_sub5_sub1.aBool11728;
			    bool_11_ = false;
			}
			if (i > 0
			    && (i_10_ != class531_sub5_sub1.anInt11735
				|| bool != class531_sub5_sub1.aBool11728)) {
			    bool_11_ = true;
			    break;
			}
			int i_14_ = anIntArray1748[i++] - i_3_ >> i_8_;
			if (i_14_ < 1600) {
			    if (anIntArray1749[i_14_] < 64)
				aClass531_Sub5_Sub1ArrayArray1747[i_14_]
				    [anIntArray1749[i_14_]++]
				    = class531_sub5_sub1;
			    else {
				if (anIntArray1749[i_14_] == 64) {
				    if (anInt1751 == 64)
					continue;
				    anIntArray1749[i_14_] += 1 + anInt1751++;
				}
				aClass531_Sub5_Sub1ArrayArray1754
				    [anIntArray1749[i_14_] - 64 - 1]
				    [anIntArray1750[(anIntArray1749[i_14_] - 64
						     - 1)]++]
				    = class531_sub5_sub1;
			    }
			}
		    }
		    if (i_10_ >= 0)
			class182_sub3.method15455(i_10_);
		    else
			class182_sub3.method15455(-1);
		    if (bool && class182_sub3.aFloat9834 != aFloat1737)
			class182_sub3.method3351(aFloat1737);
		    else if (class182_sub3.aFloat9834 != 1.0F)
			class182_sub3.method3351(1.0F);
		    method2557(class182_sub3, i_7_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method2559(class182_sub3);
	}
    }
    
    void method2556(Class182_Sub3 class182_sub3) {
	class182_sub3.method15512(true);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (class182_sub3.aFloat9834 != aFloat1737)
	    class182_sub3.method3351(aFloat1737);
    }
    
    void method2557(Class182_Sub3 class182_sub3, int i) {
	OpenGL.glGetFloatv(2982, aFloatArray1752, 0);
	float f = aFloatArray1752[0];
	float f_15_ = aFloatArray1752[4];
	float f_16_ = aFloatArray1752[8];
	float f_17_ = aFloatArray1752[1];
	float f_18_ = aFloatArray1752[5];
	float f_19_ = aFloatArray1752[9];
	float f_20_ = f + f_17_;
	float f_21_ = f_15_ + f_18_;
	float f_22_ = f_16_ + f_19_;
	float f_23_ = f - f_17_;
	float f_24_ = f_15_ - f_18_;
	float f_25_ = f_16_ - f_19_;
	float f_26_ = f_17_ - f;
	float f_27_ = f_18_ - f_15_;
	float f_28_ = f_19_ - f_16_;
	float[] fs = new float[3];
	float[] fs_29_ = new float[3];
	class182_sub3.aClass435_9731.method7035(class182_sub3.aClass435_9716);
	aClass525_Sub38_Sub1_1753.index = 0;
	if (class182_sub3.aBool9792) {
	    for (int i_30_ = i - 1; i_30_ >= 0; i_30_--) {
		int i_31_
		    = anIntArray1749[i_30_] > 64 ? 64 : anIntArray1749[i_30_];
		if (i_31_ > 0) {
		    for (int i_32_ = i_31_ - 1; i_32_ >= 0; i_32_--) {
			Class531_Sub5_Sub1 class531_sub5_sub1
			    = aClass531_Sub5_Sub1ArrayArray1747[i_30_][i_32_];
			int i_33_ = class531_sub5_sub1.anInt11737;
			byte i_34_ = (byte) (i_33_ >> 16);
			byte i_35_ = (byte) (i_33_ >> 8);
			byte i_36_ = (byte) i_33_;
			byte i_37_ = (byte) (i_33_ >>> 24);
			float f_38_
			    = (float) (class531_sub5_sub1.anInt11731 >> 12);
			float f_39_
			    = (float) (class531_sub5_sub1.anInt11729 >> 12);
			float f_40_
			    = (float) (class531_sub5_sub1.anInt11730 >> 12);
			int i_41_ = class531_sub5_sub1.anInt11734 >> 12;
			if (class531_sub5_sub1.aShort11736 != 0) {
			    class182_sub3.aClass435_9646.method7050
				(class531_sub5_sub1.aShort11736, i_41_, i_41_,
				 0.0F, 0.0F, 0.0F);
			    class182_sub3.aClass435_9646
				.method6950(class182_sub3.aClass435_9731);
			    class182_sub3.aClass435_9646.method6956(1.0F, 0.0F,
								    0.0F, fs);
			    class182_sub3.aClass435_9646
				.method6956(0.0F, 1.0F, 0.0F, fs_29_);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_38_ - fs[0] - fs_29_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_39_ - fs[1] - fs_29_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_40_ - fs[2] - fs_29_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_34_,
								  -275428058);
			    aClass525_Sub38_Sub1_1753.method16735(i_35_,
								  -509615199);
			    aClass525_Sub38_Sub1_1753.method16735(i_36_,
								  -291670467);
			    aClass525_Sub38_Sub1_1753.method16735(i_37_,
								  -659553915);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_38_ - fs[0] + fs_29_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_39_ - fs[1] + fs_29_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_40_ - fs[2] + fs_29_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_34_,
								  -1352202084);
			    aClass525_Sub38_Sub1_1753.method16735(i_35_,
								  -956638078);
			    aClass525_Sub38_Sub1_1753.method16735(i_36_,
								  -760081153);
			    aClass525_Sub38_Sub1_1753.method16735(i_37_,
								  -1852153948);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_38_ + fs[0] + fs_29_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_39_ + fs[1] + fs_29_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_40_ + fs[2] + fs_29_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_34_,
								  -121405929);
			    aClass525_Sub38_Sub1_1753.method16735(i_35_,
								  -1136519082);
			    aClass525_Sub38_Sub1_1753.method16735(i_36_,
								  -690806904);
			    aClass525_Sub38_Sub1_1753.method16735(i_37_,
								  -1401182613);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_38_ + fs[0] - fs_29_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_39_ + fs[1] - fs_29_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_40_ + fs[2] - fs_29_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_34_,
								  -415549215);
			    aClass525_Sub38_Sub1_1753.method16735(i_35_,
								  -2072511800);
			    aClass525_Sub38_Sub1_1753.method16735(i_36_,
								  -1207426978);
			    aClass525_Sub38_Sub1_1753.method16735(i_37_,
								  -1189683122);
			} else {
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_38_ + f_20_ * (float) -i_41_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_39_ + f_21_ * (float) -i_41_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_40_ + f_22_ * (float) -i_41_);
			    aClass525_Sub38_Sub1_1753.method16735(i_34_,
								  -1887121519);
			    aClass525_Sub38_Sub1_1753.method16735(i_35_,
								  -832244993);
			    aClass525_Sub38_Sub1_1753.method16735(i_36_,
								  -1394444485);
			    aClass525_Sub38_Sub1_1753.method16735(i_37_,
								  -174232210);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_38_ + f_26_ * (float) i_41_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_39_ + f_27_ * (float) i_41_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_40_ + f_28_ * (float) i_41_);
			    aClass525_Sub38_Sub1_1753.method16735(i_34_,
								  -1914579093);
			    aClass525_Sub38_Sub1_1753.method16735(i_35_,
								  -1617825160);
			    aClass525_Sub38_Sub1_1753.method16735(i_36_,
								  -435181235);
			    aClass525_Sub38_Sub1_1753.method16735(i_37_,
								  -1285558542);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_38_ + f_20_ * (float) i_41_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_39_ + f_21_ * (float) i_41_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_40_ + f_22_ * (float) i_41_);
			    aClass525_Sub38_Sub1_1753.method16735(i_34_,
								  -370655443);
			    aClass525_Sub38_Sub1_1753.method16735(i_35_,
								  -1794545489);
			    aClass525_Sub38_Sub1_1753.method16735(i_36_,
								  -1928121724);
			    aClass525_Sub38_Sub1_1753.method16735(i_37_,
								  -933263059);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_38_ + f_23_ * (float) i_41_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_39_ + f_24_ * (float) i_41_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_40_ + f_25_ * (float) i_41_);
			    aClass525_Sub38_Sub1_1753.method16735(i_34_,
								  -1031543385);
			    aClass525_Sub38_Sub1_1753.method16735(i_35_,
								  -462930493);
			    aClass525_Sub38_Sub1_1753.method16735(i_36_,
								  -1911445594);
			    aClass525_Sub38_Sub1_1753.method16735(i_37_,
								  -991249455);
			}
		    }
		    if (anIntArray1749[i_30_] > 64) {
			int i_42_ = anIntArray1749[i_30_] - 64 - 1;
			for (int i_43_ = anIntArray1750[i_42_] - 1; i_43_ >= 0;
			     i_43_--) {
			    Class531_Sub5_Sub1 class531_sub5_sub1
				= (aClass531_Sub5_Sub1ArrayArray1754[i_42_]
				   [i_43_]);
			    int i_44_ = class531_sub5_sub1.anInt11737;
			    byte i_45_ = (byte) (i_44_ >> 16);
			    byte i_46_ = (byte) (i_44_ >> 8);
			    byte i_47_ = (byte) i_44_;
			    byte i_48_ = (byte) (i_44_ >>> 24);
			    float f_49_
				= (float) (class531_sub5_sub1.anInt11731
					   >> 12);
			    float f_50_
				= (float) (class531_sub5_sub1.anInt11729
					   >> 12);
			    float f_51_
				= (float) (class531_sub5_sub1.anInt11730
					   >> 12);
			    int i_52_ = class531_sub5_sub1.anInt11734 >> 12;
			    if (class531_sub5_sub1.aShort11736 != 0) {
				class182_sub3.aClass435_9646.method7050
				    (class531_sub5_sub1.aShort11736, i_52_,
				     i_52_, 0.0F, 0.0F, 0.0F);
				class182_sub3.aClass435_9646
				    .method6950(class182_sub3.aClass435_9731);
				class182_sub3.aClass435_9646
				    .method6956(1.0F, 0.0F, 0.0F, fs);
				class182_sub3.aClass435_9646
				    .method6956(0.0F, 1.0F, 0.0F, fs_29_);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_49_ - fs[0] - fs_29_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_50_ - fs[1] - fs_29_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_51_ - fs[2] - fs_29_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_45_, -2073438402);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_46_, -1156460131);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_47_, -1058718657);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_48_, -1259400539);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_49_ - fs[0] + fs_29_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_50_ - fs[1] + fs_29_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_51_ - fs[2] + fs_29_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_45_, -1669638129);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_46_, -1447445292);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_47_, -2050288913);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_48_, -1475167785);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_49_ + fs[0] + fs_29_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_50_ + fs[1] + fs_29_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_51_ + fs[2] + fs_29_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_45_, -1693494540);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_46_, -1621417610);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_47_, -784153745);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_48_, -476765188);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_49_ + fs[0] - fs_29_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_50_ + fs[1] - fs_29_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_51_ + fs[2] - fs_29_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_45_, -637689694);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_46_, -528730132);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_47_, -830999915);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_48_, -401401332);
			    } else {
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_49_ + f_20_ * (float) -i_52_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_50_ + f_21_ * (float) -i_52_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_51_ + f_22_ * (float) -i_52_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_45_, -1757093024);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_46_, -160801052);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_47_, -1396378569);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_48_, -444432312);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_49_ + f_26_ * (float) i_52_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_50_ + f_27_ * (float) i_52_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_51_ + f_28_ * (float) i_52_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_45_, -496752727);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_46_, -641556540);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_47_, -1618232873);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_48_, -1074692052);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_49_ + f_20_ * (float) i_52_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_50_ + f_21_ * (float) i_52_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_51_ + f_22_ * (float) i_52_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_45_, -1719793964);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_46_, -368802286);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_47_, -1987284199);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_48_, -1929513128);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_49_ + f_23_ * (float) i_52_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_50_ + f_24_ * (float) i_52_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_51_ + f_25_ * (float) i_52_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_45_, -1467721718);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_46_, -378168068);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_47_, -2138581632);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_48_, -694919894);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_53_ = i - 1; i_53_ >= 0; i_53_--) {
		int i_54_
		    = anIntArray1749[i_53_] > 64 ? 64 : anIntArray1749[i_53_];
		if (i_54_ > 0) {
		    for (int i_55_ = i_54_ - 1; i_55_ >= 0; i_55_--) {
			Class531_Sub5_Sub1 class531_sub5_sub1
			    = aClass531_Sub5_Sub1ArrayArray1747[i_53_][i_55_];
			int i_56_ = class531_sub5_sub1.anInt11737;
			byte i_57_ = (byte) (i_56_ >> 16);
			byte i_58_ = (byte) (i_56_ >> 8);
			byte i_59_ = (byte) i_56_;
			byte i_60_ = (byte) (i_56_ >>> 24);
			float f_61_
			    = (float) (class531_sub5_sub1.anInt11731 >> 12);
			float f_62_
			    = (float) (class531_sub5_sub1.anInt11729 >> 12);
			float f_63_
			    = (float) (class531_sub5_sub1.anInt11730 >> 12);
			int i_64_ = class531_sub5_sub1.anInt11734 >> 12;
			if (class531_sub5_sub1.aShort11736 != 0) {
			    class182_sub3.aClass435_9646.method7050
				(class531_sub5_sub1.aShort11736, i_64_, i_64_,
				 0.0F, 0.0F, 0.0F);
			    class182_sub3.aClass435_9646
				.method6950(class182_sub3.aClass435_9731);
			    class182_sub3.aClass435_9646.method6956(1.0F, 0.0F,
								    0.0F, fs);
			    class182_sub3.aClass435_9646
				.method6956(0.0F, 1.0F, 0.0F, fs_29_);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_61_ - fs[0] - fs_29_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_62_ - fs[1] - fs_29_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_63_ - fs[2] - fs_29_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_57_,
								  -1941702521);
			    aClass525_Sub38_Sub1_1753.method16735(i_58_,
								  -330418807);
			    aClass525_Sub38_Sub1_1753.method16735(i_59_,
								  -2019340054);
			    aClass525_Sub38_Sub1_1753.method16735(i_60_,
								  -987038754);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_61_ - fs[0] + fs_29_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_62_ - fs[1] + fs_29_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_63_ - fs[2] + fs_29_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_57_,
								  -1337111735);
			    aClass525_Sub38_Sub1_1753.method16735(i_58_,
								  -296725819);
			    aClass525_Sub38_Sub1_1753.method16735(i_59_,
								  -357092101);
			    aClass525_Sub38_Sub1_1753.method16735(i_60_,
								  -402408811);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_61_ + fs[0] + fs_29_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_62_ + fs[1] + fs_29_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_63_ + fs[2] + fs_29_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_57_,
								  -551026058);
			    aClass525_Sub38_Sub1_1753.method16735(i_58_,
								  -584025709);
			    aClass525_Sub38_Sub1_1753.method16735(i_59_,
								  -1102875670);
			    aClass525_Sub38_Sub1_1753.method16735(i_60_,
								  -1426365892);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_61_ + fs[0] - fs_29_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_62_ + fs[1] - fs_29_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_63_ + fs[2] - fs_29_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_57_,
								  -1389640607);
			    aClass525_Sub38_Sub1_1753.method16735(i_58_,
								  -248621310);
			    aClass525_Sub38_Sub1_1753.method16735(i_59_,
								  -2008334447);
			    aClass525_Sub38_Sub1_1753.method16735(i_60_,
								  -243920780);
			} else {
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_61_ + f_20_ * (float) -i_64_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_62_ + f_21_ * (float) -i_64_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_63_ + f_22_ * (float) -i_64_);
			    aClass525_Sub38_Sub1_1753.method16735(i_57_,
								  -1239102280);
			    aClass525_Sub38_Sub1_1753.method16735(i_58_,
								  -1262079019);
			    aClass525_Sub38_Sub1_1753.method16735(i_59_,
								  -1722374983);
			    aClass525_Sub38_Sub1_1753.method16735(i_60_,
								  -160254688);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_61_ + f_26_ * (float) i_64_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_62_ + f_27_ * (float) i_64_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_63_ + f_28_ * (float) i_64_);
			    aClass525_Sub38_Sub1_1753.method16735(i_57_,
								  -1702026972);
			    aClass525_Sub38_Sub1_1753.method16735(i_58_,
								  -1144213800);
			    aClass525_Sub38_Sub1_1753.method16735(i_59_,
								  -1842436835);
			    aClass525_Sub38_Sub1_1753.method16735(i_60_,
								  -459375221);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_61_ + f_20_ * (float) i_64_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_62_ + f_21_ * (float) i_64_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_63_ + f_22_ * (float) i_64_);
			    aClass525_Sub38_Sub1_1753.method16735(i_57_,
								  -880444602);
			    aClass525_Sub38_Sub1_1753.method16735(i_58_,
								  -1576159213);
			    aClass525_Sub38_Sub1_1753.method16735(i_59_,
								  -906356513);
			    aClass525_Sub38_Sub1_1753.method16735(i_60_,
								  -1038713026);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_61_ + f_23_ * (float) i_64_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_62_ + f_24_ * (float) i_64_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_63_ + f_25_ * (float) i_64_);
			    aClass525_Sub38_Sub1_1753.method16735(i_57_,
								  -1054337963);
			    aClass525_Sub38_Sub1_1753.method16735(i_58_,
								  -1775178226);
			    aClass525_Sub38_Sub1_1753.method16735(i_59_,
								  -1345273134);
			    aClass525_Sub38_Sub1_1753.method16735(i_60_,
								  -1607593563);
			}
		    }
		    if (anIntArray1749[i_53_] > 64) {
			int i_65_ = anIntArray1749[i_53_] - 64 - 1;
			for (int i_66_ = anIntArray1750[i_65_] - 1; i_66_ >= 0;
			     i_66_--) {
			    Class531_Sub5_Sub1 class531_sub5_sub1
				= (aClass531_Sub5_Sub1ArrayArray1754[i_65_]
				   [i_66_]);
			    int i_67_ = class531_sub5_sub1.anInt11737;
			    byte i_68_ = (byte) (i_67_ >> 16);
			    byte i_69_ = (byte) (i_67_ >> 8);
			    byte i_70_ = (byte) i_67_;
			    byte i_71_ = (byte) (i_67_ >>> 24);
			    float f_72_
				= (float) (class531_sub5_sub1.anInt11731
					   >> 12);
			    float f_73_
				= (float) (class531_sub5_sub1.anInt11729
					   >> 12);
			    float f_74_
				= (float) (class531_sub5_sub1.anInt11730
					   >> 12);
			    int i_75_ = class531_sub5_sub1.anInt11734 >> 12;
			    if (class531_sub5_sub1.aShort11736 != 0) {
				class182_sub3.aClass435_9646.method7050
				    (class531_sub5_sub1.aShort11736, i_75_,
				     i_75_, 0.0F, 0.0F, 0.0F);
				class182_sub3.aClass435_9646
				    .method6950(class182_sub3.aClass435_9731);
				class182_sub3.aClass435_9646
				    .method6956(1.0F, 0.0F, 0.0F, fs);
				class182_sub3.aClass435_9646
				    .method6956(0.0F, 1.0F, 0.0F, fs_29_);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_72_ - fs[0] - fs_29_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_73_ - fs[1] - fs_29_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_74_ - fs[2] - fs_29_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_68_, -355830062);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_69_, -2145135019);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_70_, -918065766);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_71_, -789633466);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_72_ - fs[0] + fs_29_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_73_ - fs[1] + fs_29_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_74_ - fs[2] + fs_29_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_68_, -2021003746);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_69_, -1072836983);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_70_, -1551194907);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_71_, -1623037624);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_72_ + fs[0] + fs_29_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_73_ + fs[1] + fs_29_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_74_ + fs[2] + fs_29_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_68_, -378215872);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_69_, -2051376102);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_70_, -1653485244);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_71_, -1654922307);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_72_ + fs[0] - fs_29_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_73_ + fs[1] - fs_29_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_74_ + fs[2] - fs_29_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_68_, -1029033820);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_69_, -1487633903);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_70_, -265488863);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_71_, -1576333035);
			    } else {
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_72_ + f_20_ * (float) -i_75_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_73_ + f_21_ * (float) -i_75_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_74_ + f_22_ * (float) -i_75_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_68_, -364652774);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_69_, -244343137);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_70_, -1783705258);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_71_, -1437906989);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_72_ + f_26_ * (float) i_75_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_73_ + f_27_ * (float) i_75_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_74_ + f_28_ * (float) i_75_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_68_, -1441139785);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_69_, -561055413);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_70_, -212367067);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_71_, -1002844015);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_72_ + f_20_ * (float) i_75_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_73_ + f_21_ * (float) i_75_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_74_ + f_22_ * (float) i_75_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_68_, -1676358482);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_69_, -270243375);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_70_, -716594909);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_71_, -349806986);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_72_ + f_23_ * (float) i_75_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_73_ + f_24_ * (float) i_75_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_74_ + f_25_ * (float) i_75_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_68_, -2089654114);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_69_, -1843956142);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_70_, -1688985673);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_71_, -1665850035);
			    }
			}
		    }
		}
	    }
	}
	if (aClass525_Sub38_Sub1_1753.index * -1133521593 != 0) {
	    anInterface15_1739.method78(24,
					(aClass525_Sub38_Sub1_1753
					 .buffer),
					(aClass525_Sub38_Sub1_1753.index
					 * -1133521593));
	    class182_sub3.method15384(aClass137_1740, null, aClass137_1741,
				      aClass137_1742);
	    class182_sub3.method15385(7, 0,
				      (aClass525_Sub38_Sub1_1753.index
				       * -1133521593 / 24));
	}
    }
    
    void method2558(Class182_Sub3 class182_sub3) {
	aFloat1737 = class182_sub3.aFloat9834;
	class182_sub3.method15390();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	class182_sub3.method15512(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    void method2559(Class182_Sub3 class182_sub3) {
	class182_sub3.method15512(true);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (class182_sub3.aFloat9834 != aFloat1737)
	    class182_sub3.method3351(aFloat1737);
    }
    
    void method2560(Class182_Sub3 class182_sub3, Class185 class185) {
	if (class182_sub3.aClass435_9715 != null) {
	    method2558(class182_sub3);
	    float f = class182_sub3.aClass435_9715.aFloatArray4830[2];
	    float f_76_ = class182_sub3.aClass435_9715.aFloatArray4830[6];
	    float f_77_ = class182_sub3.aClass435_9715.aFloatArray4830[10];
	    float f_78_ = class182_sub3.aClass435_9715.aFloatArray4830[14];
	    try {
		int i = 0;
		int i_79_ = 2147483647;
		int i_80_ = 0;
		Class531_Sub5 class531_sub5
		    = class185.aClass698_2081.aClass531_Sub5_8768;
		for (Class531_Sub5 class531_sub5_81_
			 = class531_sub5.aClass531_Sub5_10342;
		     class531_sub5_81_ != class531_sub5;
		     class531_sub5_81_
			 = class531_sub5_81_.aClass531_Sub5_10342) {
		    Class531_Sub5_Sub1 class531_sub5_sub1
			= (Class531_Sub5_Sub1) class531_sub5_81_;
		    int i_82_
			= (int) (f * (float) (class531_sub5_sub1.anInt11731
					      >> 12)
				 + (f_76_
				    * (float) (class531_sub5_sub1.anInt11729
					       >> 12))
				 + (f_77_
				    * (float) (class531_sub5_sub1.anInt11730
					       >> 12))
				 + f_78_);
		    if (i_82_ > i_80_)
			i_80_ = i_82_;
		    if (i_82_ < i_79_)
			i_79_ = i_82_;
		    anIntArray1748[i++] = i_82_;
		}
		int i_83_ = i_80_ - i_79_;
		int i_84_;
		if (i_83_ + 2 > 1600) {
		    i_84_ = (1 + Textures.method3120(i_83_, (byte) -11)
			     - anInt1746);
		    i_83_ = (i_83_ >> i_84_) + 2;
		} else {
		    i_84_ = 0;
		    i_83_ += 2;
		}
		Class531_Sub5 class531_sub5_85_
		    = class531_sub5.aClass531_Sub5_10342;
		i = 0;
		int i_86_ = -2;
		boolean bool = true;
		boolean bool_87_ = true;
		while (class531_sub5_85_ != class531_sub5) {
		    anInt1751 = 0;
		    for (int i_88_ = 0; i_88_ < i_83_; i_88_++)
			anIntArray1749[i_88_] = 0;
		    for (int i_89_ = 0; i_89_ < 64; i_89_++)
			anIntArray1750[i_89_] = 0;
		    for (/**/; class531_sub5_85_ != class531_sub5;
			 class531_sub5_85_
			     = class531_sub5_85_.aClass531_Sub5_10342) {
			Class531_Sub5_Sub1 class531_sub5_sub1
			    = (Class531_Sub5_Sub1) class531_sub5_85_;
			if (bool_87_) {
			    i_86_ = class531_sub5_sub1.anInt11735;
			    bool = class531_sub5_sub1.aBool11728;
			    bool_87_ = false;
			}
			if (i > 0
			    && (i_86_ != class531_sub5_sub1.anInt11735
				|| bool != class531_sub5_sub1.aBool11728)) {
			    bool_87_ = true;
			    break;
			}
			int i_90_ = anIntArray1748[i++] - i_79_ >> i_84_;
			if (i_90_ < 1600) {
			    if (anIntArray1749[i_90_] < 64)
				aClass531_Sub5_Sub1ArrayArray1747[i_90_]
				    [anIntArray1749[i_90_]++]
				    = class531_sub5_sub1;
			    else {
				if (anIntArray1749[i_90_] == 64) {
				    if (anInt1751 == 64)
					continue;
				    anIntArray1749[i_90_] += 1 + anInt1751++;
				}
				aClass531_Sub5_Sub1ArrayArray1754
				    [anIntArray1749[i_90_] - 64 - 1]
				    [anIntArray1750[(anIntArray1749[i_90_] - 64
						     - 1)]++]
				    = class531_sub5_sub1;
			    }
			}
		    }
		    if (i_86_ >= 0)
			class182_sub3.method15455(i_86_);
		    else
			class182_sub3.method15455(-1);
		    if (bool && class182_sub3.aFloat9834 != aFloat1737)
			class182_sub3.method3351(aFloat1737);
		    else if (class182_sub3.aFloat9834 != 1.0F)
			class182_sub3.method3351(1.0F);
		    method2557(class182_sub3, i_83_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method2559(class182_sub3);
	}
    }
    
    Class158() {
	anInt1743 = 64;
	anInt1738 = 768;
	anInt1745 = 1600;
	anInt1746 = Textures.method3120(1600, (byte) -2);
	anInt1744 = 64;
	anIntArray1748 = new int[8191];
	anIntArray1749 = new int[1600];
	anIntArray1750 = new int[64];
	aClass531_Sub5_Sub1ArrayArray1747 = new Class531_Sub5_Sub1[1600][64];
	aClass531_Sub5_Sub1ArrayArray1754 = new Class531_Sub5_Sub1[64][768];
	anInt1751 = 0;
    }
    
    void method2561(Class182_Sub3 class182_sub3, Class185 class185) {
	if (class182_sub3.aClass435_9715 != null) {
	    method2558(class182_sub3);
	    float f = class182_sub3.aClass435_9715.aFloatArray4830[2];
	    float f_91_ = class182_sub3.aClass435_9715.aFloatArray4830[6];
	    float f_92_ = class182_sub3.aClass435_9715.aFloatArray4830[10];
	    float f_93_ = class182_sub3.aClass435_9715.aFloatArray4830[14];
	    try {
		int i = 0;
		int i_94_ = 2147483647;
		int i_95_ = 0;
		Class531_Sub5 class531_sub5
		    = class185.aClass698_2081.aClass531_Sub5_8768;
		for (Class531_Sub5 class531_sub5_96_
			 = class531_sub5.aClass531_Sub5_10342;
		     class531_sub5_96_ != class531_sub5;
		     class531_sub5_96_
			 = class531_sub5_96_.aClass531_Sub5_10342) {
		    Class531_Sub5_Sub1 class531_sub5_sub1
			= (Class531_Sub5_Sub1) class531_sub5_96_;
		    int i_97_
			= (int) (f * (float) (class531_sub5_sub1.anInt11731
					      >> 12)
				 + (f_91_
				    * (float) (class531_sub5_sub1.anInt11729
					       >> 12))
				 + (f_92_
				    * (float) (class531_sub5_sub1.anInt11730
					       >> 12))
				 + f_93_);
		    if (i_97_ > i_95_)
			i_95_ = i_97_;
		    if (i_97_ < i_94_)
			i_94_ = i_97_;
		    anIntArray1748[i++] = i_97_;
		}
		int i_98_ = i_95_ - i_94_;
		int i_99_;
		if (i_98_ + 2 > 1600) {
		    i_99_ = (1 + Textures.method3120(i_98_, (byte) -12)
			     - anInt1746);
		    i_98_ = (i_98_ >> i_99_) + 2;
		} else {
		    i_99_ = 0;
		    i_98_ += 2;
		}
		Class531_Sub5 class531_sub5_100_
		    = class531_sub5.aClass531_Sub5_10342;
		i = 0;
		int i_101_ = -2;
		boolean bool = true;
		boolean bool_102_ = true;
		while (class531_sub5_100_ != class531_sub5) {
		    anInt1751 = 0;
		    for (int i_103_ = 0; i_103_ < i_98_; i_103_++)
			anIntArray1749[i_103_] = 0;
		    for (int i_104_ = 0; i_104_ < 64; i_104_++)
			anIntArray1750[i_104_] = 0;
		    for (/**/; class531_sub5_100_ != class531_sub5;
			 class531_sub5_100_
			     = class531_sub5_100_.aClass531_Sub5_10342) {
			Class531_Sub5_Sub1 class531_sub5_sub1
			    = (Class531_Sub5_Sub1) class531_sub5_100_;
			if (bool_102_) {
			    i_101_ = class531_sub5_sub1.anInt11735;
			    bool = class531_sub5_sub1.aBool11728;
			    bool_102_ = false;
			}
			if (i > 0
			    && (i_101_ != class531_sub5_sub1.anInt11735
				|| bool != class531_sub5_sub1.aBool11728)) {
			    bool_102_ = true;
			    break;
			}
			int i_105_ = anIntArray1748[i++] - i_94_ >> i_99_;
			if (i_105_ < 1600) {
			    if (anIntArray1749[i_105_] < 64)
				aClass531_Sub5_Sub1ArrayArray1747[i_105_]
				    [anIntArray1749[i_105_]++]
				    = class531_sub5_sub1;
			    else {
				if (anIntArray1749[i_105_] == 64) {
				    if (anInt1751 == 64)
					continue;
				    anIntArray1749[i_105_] += 1 + anInt1751++;
				}
				aClass531_Sub5_Sub1ArrayArray1754
				    [anIntArray1749[i_105_] - 64 - 1]
				    [anIntArray1750[(anIntArray1749[i_105_]
						     - 64 - 1)]++]
				    = class531_sub5_sub1;
			    }
			}
		    }
		    if (i_101_ >= 0)
			class182_sub3.method15455(i_101_);
		    else
			class182_sub3.method15455(-1);
		    if (bool && class182_sub3.aFloat9834 != aFloat1737)
			class182_sub3.method3351(aFloat1737);
		    else if (class182_sub3.aFloat9834 != 1.0F)
			class182_sub3.method3351(1.0F);
		    method2557(class182_sub3, i_98_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method2559(class182_sub3);
	}
    }
    
    void method2562(Class182_Sub3 class182_sub3) {
	aFloat1737 = class182_sub3.aFloat9834;
	class182_sub3.method15390();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	class182_sub3.method15512(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    void method2563(Class182_Sub3 class182_sub3) {
	aFloat1737 = class182_sub3.aFloat9834;
	class182_sub3.method15390();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	class182_sub3.method15512(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    void method2564(Class182_Sub3 class182_sub3, int i) {
	OpenGL.glGetFloatv(2982, aFloatArray1752, 0);
	float f = aFloatArray1752[0];
	float f_106_ = aFloatArray1752[4];
	float f_107_ = aFloatArray1752[8];
	float f_108_ = aFloatArray1752[1];
	float f_109_ = aFloatArray1752[5];
	float f_110_ = aFloatArray1752[9];
	float f_111_ = f + f_108_;
	float f_112_ = f_106_ + f_109_;
	float f_113_ = f_107_ + f_110_;
	float f_114_ = f - f_108_;
	float f_115_ = f_106_ - f_109_;
	float f_116_ = f_107_ - f_110_;
	float f_117_ = f_108_ - f;
	float f_118_ = f_109_ - f_106_;
	float f_119_ = f_110_ - f_107_;
	float[] fs = new float[3];
	float[] fs_120_ = new float[3];
	class182_sub3.aClass435_9731.method7035(class182_sub3.aClass435_9716);
	aClass525_Sub38_Sub1_1753.index = 0;
	if (class182_sub3.aBool9792) {
	    for (int i_121_ = i - 1; i_121_ >= 0; i_121_--) {
		int i_122_ = (anIntArray1749[i_121_] > 64 ? 64
			      : anIntArray1749[i_121_]);
		if (i_122_ > 0) {
		    for (int i_123_ = i_122_ - 1; i_123_ >= 0; i_123_--) {
			Class531_Sub5_Sub1 class531_sub5_sub1
			    = (aClass531_Sub5_Sub1ArrayArray1747[i_121_]
			       [i_123_]);
			int i_124_ = class531_sub5_sub1.anInt11737;
			byte i_125_ = (byte) (i_124_ >> 16);
			byte i_126_ = (byte) (i_124_ >> 8);
			byte i_127_ = (byte) i_124_;
			byte i_128_ = (byte) (i_124_ >>> 24);
			float f_129_
			    = (float) (class531_sub5_sub1.anInt11731 >> 12);
			float f_130_
			    = (float) (class531_sub5_sub1.anInt11729 >> 12);
			float f_131_
			    = (float) (class531_sub5_sub1.anInt11730 >> 12);
			int i_132_ = class531_sub5_sub1.anInt11734 >> 12;
			if (class531_sub5_sub1.aShort11736 != 0) {
			    class182_sub3.aClass435_9646.method7050
				(class531_sub5_sub1.aShort11736, i_132_,
				 i_132_, 0.0F, 0.0F, 0.0F);
			    class182_sub3.aClass435_9646
				.method6950(class182_sub3.aClass435_9731);
			    class182_sub3.aClass435_9646.method6956(1.0F, 0.0F,
								    0.0F, fs);
			    class182_sub3.aClass435_9646
				.method6956(0.0F, 1.0F, 0.0F, fs_120_);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_129_ - fs[0] - fs_120_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_130_ - fs[1] - fs_120_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_131_ - fs[2] - fs_120_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_125_,
								  -1854896425);
			    aClass525_Sub38_Sub1_1753.method16735(i_126_,
								  -585435730);
			    aClass525_Sub38_Sub1_1753.method16735(i_127_,
								  -1053171308);
			    aClass525_Sub38_Sub1_1753.method16735(i_128_,
								  -705911754);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_129_ - fs[0] + fs_120_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_130_ - fs[1] + fs_120_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_131_ - fs[2] + fs_120_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_125_,
								  -332344347);
			    aClass525_Sub38_Sub1_1753.method16735(i_126_,
								  -817371959);
			    aClass525_Sub38_Sub1_1753.method16735(i_127_,
								  -1442213383);
			    aClass525_Sub38_Sub1_1753.method16735(i_128_,
								  -1631985119);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_129_ + fs[0] + fs_120_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_130_ + fs[1] + fs_120_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_131_ + fs[2] + fs_120_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_125_,
								  -431114596);
			    aClass525_Sub38_Sub1_1753.method16735(i_126_,
								  -847495522);
			    aClass525_Sub38_Sub1_1753.method16735(i_127_,
								  -573423196);
			    aClass525_Sub38_Sub1_1753.method16735(i_128_,
								  -1363661930);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_129_ + fs[0] - fs_120_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_130_ + fs[1] - fs_120_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_131_ + fs[2] - fs_120_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_125_,
								  -1578388343);
			    aClass525_Sub38_Sub1_1753.method16735(i_126_,
								  -277846206);
			    aClass525_Sub38_Sub1_1753.method16735(i_127_,
								  -737079880);
			    aClass525_Sub38_Sub1_1753.method16735(i_128_,
								  -1565673837);
			} else {
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753.method18263
				(f_129_ + f_111_ * (float) -i_132_);
			    aClass525_Sub38_Sub1_1753.method18263
				(f_130_ + f_112_ * (float) -i_132_);
			    aClass525_Sub38_Sub1_1753.method18263
				(f_131_ + f_113_ * (float) -i_132_);
			    aClass525_Sub38_Sub1_1753.method16735(i_125_,
								  -1921395660);
			    aClass525_Sub38_Sub1_1753.method16735(i_126_,
								  -1374651098);
			    aClass525_Sub38_Sub1_1753.method16735(i_127_,
								  -788632567);
			    aClass525_Sub38_Sub1_1753.method16735(i_128_,
								  -448866387);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_129_ + f_117_ * (float) i_132_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_130_ + f_118_ * (float) i_132_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_131_ + f_119_ * (float) i_132_);
			    aClass525_Sub38_Sub1_1753.method16735(i_125_,
								  -377828616);
			    aClass525_Sub38_Sub1_1753.method16735(i_126_,
								  -1722802954);
			    aClass525_Sub38_Sub1_1753.method16735(i_127_,
								  -757671260);
			    aClass525_Sub38_Sub1_1753.method16735(i_128_,
								  -2080040926);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_129_ + f_111_ * (float) i_132_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_130_ + f_112_ * (float) i_132_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_131_ + f_113_ * (float) i_132_);
			    aClass525_Sub38_Sub1_1753.method16735(i_125_,
								  -1119072471);
			    aClass525_Sub38_Sub1_1753.method16735(i_126_,
								  -832646278);
			    aClass525_Sub38_Sub1_1753.method16735(i_127_,
								  -1840459661);
			    aClass525_Sub38_Sub1_1753.method16735(i_128_,
								  -1168491011);
			    aClass525_Sub38_Sub1_1753.method18263(1.0F);
			    aClass525_Sub38_Sub1_1753.method18263(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_129_ + f_114_ * (float) i_132_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_130_ + f_115_ * (float) i_132_);
			    aClass525_Sub38_Sub1_1753
				.method18263(f_131_ + f_116_ * (float) i_132_);
			    aClass525_Sub38_Sub1_1753.method16735(i_125_,
								  -1027341396);
			    aClass525_Sub38_Sub1_1753.method16735(i_126_,
								  -1863136686);
			    aClass525_Sub38_Sub1_1753.method16735(i_127_,
								  -1483528034);
			    aClass525_Sub38_Sub1_1753.method16735(i_128_,
								  -876903360);
			}
		    }
		    if (anIntArray1749[i_121_] > 64) {
			int i_133_ = anIntArray1749[i_121_] - 64 - 1;
			for (int i_134_ = anIntArray1750[i_133_] - 1;
			     i_134_ >= 0; i_134_--) {
			    Class531_Sub5_Sub1 class531_sub5_sub1
				= (aClass531_Sub5_Sub1ArrayArray1754[i_133_]
				   [i_134_]);
			    int i_135_ = class531_sub5_sub1.anInt11737;
			    byte i_136_ = (byte) (i_135_ >> 16);
			    byte i_137_ = (byte) (i_135_ >> 8);
			    byte i_138_ = (byte) i_135_;
			    byte i_139_ = (byte) (i_135_ >>> 24);
			    float f_140_
				= (float) (class531_sub5_sub1.anInt11731
					   >> 12);
			    float f_141_
				= (float) (class531_sub5_sub1.anInt11729
					   >> 12);
			    float f_142_
				= (float) (class531_sub5_sub1.anInt11730
					   >> 12);
			    int i_143_ = class531_sub5_sub1.anInt11734 >> 12;
			    if (class531_sub5_sub1.aShort11736 != 0) {
				class182_sub3.aClass435_9646.method7050
				    (class531_sub5_sub1.aShort11736, i_143_,
				     i_143_, 0.0F, 0.0F, 0.0F);
				class182_sub3.aClass435_9646
				    .method6950(class182_sub3.aClass435_9731);
				class182_sub3.aClass435_9646
				    .method6956(1.0F, 0.0F, 0.0F, fs);
				class182_sub3.aClass435_9646
				    .method6956(0.0F, 1.0F, 0.0F, fs_120_);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_140_ - fs[0] - fs_120_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_141_ - fs[1] - fs_120_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_142_ - fs[2] - fs_120_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_136_, -139400810);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_137_, -754963257);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_138_, -1663285690);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_139_, -814240428);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_140_ - fs[0] + fs_120_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_141_ - fs[1] + fs_120_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_142_ - fs[2] + fs_120_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_136_, -1236473402);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_137_, -588814595);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_138_, -1436804771);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_139_, -1955333318);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_140_ + fs[0] + fs_120_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_141_ + fs[1] + fs_120_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_142_ + fs[2] + fs_120_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_136_, -776777640);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_137_, -674179726);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_138_, -605301683);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_139_, -1331323049);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_140_ + fs[0] - fs_120_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_141_ + fs[1] - fs_120_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18263(f_142_ + fs[2] - fs_120_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_136_, -1740211097);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_137_, -1885129345);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_138_, -1269120536);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_139_, -2045446477);
			    } else {
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_140_ + f_111_ * (float) -i_143_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_141_ + f_112_ * (float) -i_143_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_142_ + f_113_ * (float) -i_143_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_136_, -351316156);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_137_, -1590943524);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_138_, -2063192602);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_139_, -275340293);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_140_ + f_117_ * (float) i_143_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_141_ + f_118_ * (float) i_143_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_142_ + f_119_ * (float) i_143_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_136_, -870833935);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_137_, -851273476);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_138_, -1489599869);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_139_, -2015704005);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_140_ + f_111_ * (float) i_143_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_141_ + f_112_ * (float) i_143_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_142_ + f_113_ * (float) i_143_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_136_, -474095491);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_137_, -544944650);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_138_, -1205355829);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_139_, -1545085038);
				aClass525_Sub38_Sub1_1753.method18263(1.0F);
				aClass525_Sub38_Sub1_1753.method18263(0.0F);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_140_ + f_114_ * (float) i_143_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_141_ + f_115_ * (float) i_143_);
				aClass525_Sub38_Sub1_1753.method18263
				    (f_142_ + f_116_ * (float) i_143_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_136_, -1506117598);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_137_, -135924093);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_138_, -343215563);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_139_, -1316622637);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_144_ = i - 1; i_144_ >= 0; i_144_--) {
		int i_145_ = (anIntArray1749[i_144_] > 64 ? 64
			      : anIntArray1749[i_144_]);
		if (i_145_ > 0) {
		    for (int i_146_ = i_145_ - 1; i_146_ >= 0; i_146_--) {
			Class531_Sub5_Sub1 class531_sub5_sub1
			    = (aClass531_Sub5_Sub1ArrayArray1747[i_144_]
			       [i_146_]);
			int i_147_ = class531_sub5_sub1.anInt11737;
			byte i_148_ = (byte) (i_147_ >> 16);
			byte i_149_ = (byte) (i_147_ >> 8);
			byte i_150_ = (byte) i_147_;
			byte i_151_ = (byte) (i_147_ >>> 24);
			float f_152_
			    = (float) (class531_sub5_sub1.anInt11731 >> 12);
			float f_153_
			    = (float) (class531_sub5_sub1.anInt11729 >> 12);
			float f_154_
			    = (float) (class531_sub5_sub1.anInt11730 >> 12);
			int i_155_ = class531_sub5_sub1.anInt11734 >> 12;
			if (class531_sub5_sub1.aShort11736 != 0) {
			    class182_sub3.aClass435_9646.method7050
				(class531_sub5_sub1.aShort11736, i_155_,
				 i_155_, 0.0F, 0.0F, 0.0F);
			    class182_sub3.aClass435_9646
				.method6950(class182_sub3.aClass435_9731);
			    class182_sub3.aClass435_9646.method6956(1.0F, 0.0F,
								    0.0F, fs);
			    class182_sub3.aClass435_9646
				.method6956(0.0F, 1.0F, 0.0F, fs_120_);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_152_ - fs[0] - fs_120_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_153_ - fs[1] - fs_120_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_154_ - fs[2] - fs_120_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_148_,
								  -1171509657);
			    aClass525_Sub38_Sub1_1753.method16735(i_149_,
								  -1108127393);
			    aClass525_Sub38_Sub1_1753.method16735(i_150_,
								  -1994823560);
			    aClass525_Sub38_Sub1_1753.method16735(i_151_,
								  -1674006849);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_152_ - fs[0] + fs_120_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_153_ - fs[1] + fs_120_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_154_ - fs[2] + fs_120_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_148_,
								  -554175820);
			    aClass525_Sub38_Sub1_1753.method16735(i_149_,
								  -1311977416);
			    aClass525_Sub38_Sub1_1753.method16735(i_150_,
								  -1395425215);
			    aClass525_Sub38_Sub1_1753.method16735(i_151_,
								  -1927901493);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_152_ + fs[0] + fs_120_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_153_ + fs[1] + fs_120_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_154_ + fs[2] + fs_120_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_148_,
								  -945371197);
			    aClass525_Sub38_Sub1_1753.method16735(i_149_,
								  -1283242885);
			    aClass525_Sub38_Sub1_1753.method16735(i_150_,
								  -876931007);
			    aClass525_Sub38_Sub1_1753.method16735(i_151_,
								  -188678147);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_152_ + fs[0] - fs_120_[0]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_153_ + fs[1] - fs_120_[1]);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_154_ + fs[2] - fs_120_[2]);
			    aClass525_Sub38_Sub1_1753.method16735(i_148_,
								  -1566131916);
			    aClass525_Sub38_Sub1_1753.method16735(i_149_,
								  -1330996998);
			    aClass525_Sub38_Sub1_1753.method16735(i_150_,
								  -1363412402);
			    aClass525_Sub38_Sub1_1753.method16735(i_151_,
								  -1153139621);
			} else {
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753.method18262
				(f_152_ + f_111_ * (float) -i_155_);
			    aClass525_Sub38_Sub1_1753.method18262
				(f_153_ + f_112_ * (float) -i_155_);
			    aClass525_Sub38_Sub1_1753.method18262
				(f_154_ + f_113_ * (float) -i_155_);
			    aClass525_Sub38_Sub1_1753.method16735(i_148_,
								  -544051359);
			    aClass525_Sub38_Sub1_1753.method16735(i_149_,
								  -855687418);
			    aClass525_Sub38_Sub1_1753.method16735(i_150_,
								  -650968578);
			    aClass525_Sub38_Sub1_1753.method16735(i_151_,
								  -964355553);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_152_ + f_117_ * (float) i_155_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_153_ + f_118_ * (float) i_155_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_154_ + f_119_ * (float) i_155_);
			    aClass525_Sub38_Sub1_1753.method16735(i_148_,
								  -1382417228);
			    aClass525_Sub38_Sub1_1753.method16735(i_149_,
								  -1396565864);
			    aClass525_Sub38_Sub1_1753.method16735(i_150_,
								  -1191935735);
			    aClass525_Sub38_Sub1_1753.method16735(i_151_,
								  -742547606);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_152_ + f_111_ * (float) i_155_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_153_ + f_112_ * (float) i_155_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_154_ + f_113_ * (float) i_155_);
			    aClass525_Sub38_Sub1_1753.method16735(i_148_,
								  -1632877774);
			    aClass525_Sub38_Sub1_1753.method16735(i_149_,
								  -829063845);
			    aClass525_Sub38_Sub1_1753.method16735(i_150_,
								  -2011408394);
			    aClass525_Sub38_Sub1_1753.method16735(i_151_,
								  -1402862215);
			    aClass525_Sub38_Sub1_1753.method18262(1.0F);
			    aClass525_Sub38_Sub1_1753.method18262(0.0F);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_152_ + f_114_ * (float) i_155_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_153_ + f_115_ * (float) i_155_);
			    aClass525_Sub38_Sub1_1753
				.method18262(f_154_ + f_116_ * (float) i_155_);
			    aClass525_Sub38_Sub1_1753.method16735(i_148_,
								  -524436807);
			    aClass525_Sub38_Sub1_1753.method16735(i_149_,
								  -633632284);
			    aClass525_Sub38_Sub1_1753.method16735(i_150_,
								  -1793548301);
			    aClass525_Sub38_Sub1_1753.method16735(i_151_,
								  -540490025);
			}
		    }
		    if (anIntArray1749[i_144_] > 64) {
			int i_156_ = anIntArray1749[i_144_] - 64 - 1;
			for (int i_157_ = anIntArray1750[i_156_] - 1;
			     i_157_ >= 0; i_157_--) {
			    Class531_Sub5_Sub1 class531_sub5_sub1
				= (aClass531_Sub5_Sub1ArrayArray1754[i_156_]
				   [i_157_]);
			    int i_158_ = class531_sub5_sub1.anInt11737;
			    byte i_159_ = (byte) (i_158_ >> 16);
			    byte i_160_ = (byte) (i_158_ >> 8);
			    byte i_161_ = (byte) i_158_;
			    byte i_162_ = (byte) (i_158_ >>> 24);
			    float f_163_
				= (float) (class531_sub5_sub1.anInt11731
					   >> 12);
			    float f_164_
				= (float) (class531_sub5_sub1.anInt11729
					   >> 12);
			    float f_165_
				= (float) (class531_sub5_sub1.anInt11730
					   >> 12);
			    int i_166_ = class531_sub5_sub1.anInt11734 >> 12;
			    if (class531_sub5_sub1.aShort11736 != 0) {
				class182_sub3.aClass435_9646.method7050
				    (class531_sub5_sub1.aShort11736, i_166_,
				     i_166_, 0.0F, 0.0F, 0.0F);
				class182_sub3.aClass435_9646
				    .method6950(class182_sub3.aClass435_9731);
				class182_sub3.aClass435_9646
				    .method6956(1.0F, 0.0F, 0.0F, fs);
				class182_sub3.aClass435_9646
				    .method6956(0.0F, 1.0F, 0.0F, fs_120_);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_163_ - fs[0] - fs_120_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_164_ - fs[1] - fs_120_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_165_ - fs[2] - fs_120_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_159_, -1179254488);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_160_, -1523611761);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_161_, -809143296);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_162_, -206725396);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_163_ - fs[0] + fs_120_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_164_ - fs[1] + fs_120_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_165_ - fs[2] + fs_120_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_159_, -1411524784);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_160_, -1147530863);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_161_, -2116333573);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_162_, -1098078604);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_163_ + fs[0] + fs_120_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_164_ + fs[1] + fs_120_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_165_ + fs[2] + fs_120_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_159_, -2129159013);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_160_, -1356378264);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_161_, -335380260);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_162_, -1320303330);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_163_ + fs[0] - fs_120_[0]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_164_ + fs[1] - fs_120_[1]);
				aClass525_Sub38_Sub1_1753
				    .method18262(f_165_ + fs[2] - fs_120_[2]);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_159_, -538975555);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_160_, -1916740137);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_161_, -481297619);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_162_, -675356769);
			    } else {
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_163_ + f_111_ * (float) -i_166_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_164_ + f_112_ * (float) -i_166_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_165_ + f_113_ * (float) -i_166_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_159_, -1668105252);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_160_, -1868879739);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_161_, -807997637);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_162_, -1235882049);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_163_ + f_117_ * (float) i_166_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_164_ + f_118_ * (float) i_166_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_165_ + f_119_ * (float) i_166_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_159_, -514124412);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_160_, -1019298765);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_161_, -1651648868);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_162_, -1952746078);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_163_ + f_111_ * (float) i_166_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_164_ + f_112_ * (float) i_166_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_165_ + f_113_ * (float) i_166_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_159_, -951294636);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_160_, -1766635834);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_161_, -697865624);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_162_, -1079315428);
				aClass525_Sub38_Sub1_1753.method18262(1.0F);
				aClass525_Sub38_Sub1_1753.method18262(0.0F);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_163_ + f_114_ * (float) i_166_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_164_ + f_115_ * (float) i_166_);
				aClass525_Sub38_Sub1_1753.method18262
				    (f_165_ + f_116_ * (float) i_166_);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_159_, -456732676);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_160_, -864643082);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_161_, -1187671418);
				aClass525_Sub38_Sub1_1753
				    .method16735(i_162_, -702169744);
			    }
			}
		    }
		}
	    }
	}
	if (aClass525_Sub38_Sub1_1753.index * -1133521593 != 0) {
	    anInterface15_1739.method78(24,
					(aClass525_Sub38_Sub1_1753
					 .buffer),
					(aClass525_Sub38_Sub1_1753.index
					 * -1133521593));
	    class182_sub3.method15384(aClass137_1740, null, aClass137_1741,
				      aClass137_1742);
	    class182_sub3.method15385(7, 0,
				      (aClass525_Sub38_Sub1_1753.index
				       * -1133521593 / 24));
	}
    }
    
    void method2565(Class182_Sub3 class182_sub3) {
	class182_sub3.method15512(true);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (class182_sub3.aFloat9834 != aFloat1737)
	    class182_sub3.method3351(aFloat1737);
    }
}
