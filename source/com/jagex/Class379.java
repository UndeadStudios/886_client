/* Class379 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

public class Class379
{
    int[] anIntArray3907;
    Interface35 anInterface35_3908;
    Class337 aClass337_3909;
    Interface44 anInterface44_3910;
    int anInt3911 = 64;
    Interface35 anInterface35_3912;
    int anInt3913 = 1600;
    int anInt3914;
    int anInt3915 = 64;
    int[] anIntArray3916;
    int anInt3917 = 768;
    int[] anIntArray3918;
    int anInt3919;
    Class531_Sub5_Sub1[][] aClass531_Sub5_Sub1ArrayArray3920;
    Class531_Sub5_Sub1[][] aClass531_Sub5_Sub1ArrayArray3921;
    static float aFloat3922;
    
    void method6379(Class182_Sub1 class182_sub1) {
	anInterface35_3912.method225(786336, 24);
    }
    
    void method6380(Class182_Sub1 class182_sub1) {
	anInterface35_3912.method225(786336, 24);
    }
    
    void method6381() {
	anInterface35_3912.method127();
    }
    
    void method6382(Class182_Sub1 class182_sub1, Class185 class185) {
	class182_sub1.method3235(false);
	aFloat3922 = class182_sub1.aFloat9169;
	float f = class182_sub1.aClass435_9173.aFloatArray4830[2];
	float f_0_ = class182_sub1.aClass435_9173.aFloatArray4830[6];
	float f_1_ = class182_sub1.aClass435_9173.aFloatArray4830[10];
	float f_2_ = class182_sub1.aClass435_9173.aFloatArray4830[14];
	int i = 0;
	int i_3_ = 2147483647;
	int i_4_ = 0;
	Class531_Sub5 class531_sub5
	    = class185.aClass698_2081.aClass531_Sub5_8768;
	for (Class531_Sub5 class531_sub5_5_
		 = class531_sub5.aClass531_Sub5_10342;
	     class531_sub5_5_ != class531_sub5;
	     class531_sub5_5_ = class531_sub5_5_.aClass531_Sub5_10342) {
	    Class531_Sub5_Sub1 class531_sub5_sub1
		= (Class531_Sub5_Sub1) class531_sub5_5_;
	    int i_6_
		= (int) (f * (float) (class531_sub5_sub1.anInt11731 >> 12)
			 + f_0_ * (float) (class531_sub5_sub1.anInt11729 >> 12)
			 + f_1_ * (float) (class531_sub5_sub1.anInt11730 >> 12)
			 + f_2_);
	    if (i_6_ > i_4_)
		i_4_ = i_6_;
	    if (i_6_ < i_3_)
		i_3_ = i_6_;
	    anIntArray3916[i++] = i_6_;
	}
	int i_7_ = i_4_ - i_3_;
	int i_8_;
	if (i_7_ + 2 > 1600) {
	    i_8_ = 1 + Class180.method3120(i_7_, (byte) 47) - anInt3914;
	    i_7_ = (i_7_ >> i_8_) + 2;
	} else {
	    i_8_ = 0;
	    i_7_ += 2;
	}
	class182_sub1.method14765(anInterface44_3910);
	Class317 class317 = class182_sub1.aClass317_9194;
	class317.method5666(Class435.aClass435_4829);
	class317.aClass435_3500.method7023();
	class317.anInt3504 = -1;
	boolean bool = class182_sub1.anInt9283 > 0;
	if (bool) {
	    class317.aClass437_3502.method7073(0.0F, 0.0F, 1.0F,
					       -class182_sub1.aFloat9207);
	    class317.aClass446_3501.method7265
		((float) (class182_sub1.anInt9282 >> 16 & 0xff) / 255.0F,
		 (float) (class182_sub1.anInt9282 >> 8 & 0xff) / 255.0F,
		 (float) (class182_sub1.anInt9282 >> 0 & 0xff) / 255.0F);
	    class317.aClass437_3502.method7079(class182_sub1.aClass435_9240);
	    class317.aClass437_3502.method7078(1.0F
					       / (class182_sub1.aFloat9218
						  - class182_sub1.aFloat9207));
	} else {
	    class317.aClass437_3502.method7073(0.0F, 0.0F, 0.0F, 0.0F);
	    class317.aClass446_3501.method7265(0.0F, 0.0F, 0.0F);
	}
	method6383(class182_sub1, class531_sub5, i_7_, i_3_, i_8_, class317,
		   bool);
	if (class182_sub1.aFloat9169 != aFloat3922)
	    class182_sub1.method3351(aFloat3922);
	class182_sub1.method3235(true);
    }
    
    void method6383(Class182_Sub1 class182_sub1, Class531_Sub5 class531_sub5,
		    int i, int i_9_, int i_10_, Class317 class317,
		    boolean bool) {
	Class531_Sub5 class531_sub5_11_ = class531_sub5.aClass531_Sub5_10342;
	int i_12_ = 0;
	int i_13_ = -2;
	boolean bool_14_ = true;
	boolean bool_15_ = true;
	while (class531_sub5_11_ != class531_sub5) {
	    anInt3919 = 0;
	    for (int i_16_ = 0; i_16_ < i; i_16_++)
		anIntArray3907[i_16_] = 0;
	    for (int i_17_ = 0; i_17_ < 64; i_17_++)
		anIntArray3918[i_17_] = 0;
	    for (/**/; class531_sub5_11_ != class531_sub5;
		 class531_sub5_11_ = class531_sub5_11_.aClass531_Sub5_10342) {
		Class531_Sub5_Sub1 class531_sub5_sub1
		    = (Class531_Sub5_Sub1) class531_sub5_11_;
		if (bool_15_) {
		    i_13_ = class531_sub5_sub1.anInt11735;
		    bool_14_ = class531_sub5_sub1.aBool11728;
		    bool_15_ = false;
		}
		if (i_12_ > 0
		    && (i_13_ != class531_sub5_sub1.anInt11735
			|| bool_14_ != class531_sub5_sub1.aBool11728)) {
		    bool_15_ = true;
		    break;
		}
		method6390(anIntArray3916[i_12_++] - i_9_ >> i_10_,
			   class531_sub5_sub1);
	    }
	    class317.anInterface38_3499 = null;
	    if (i_13_ >= 0) {
		Class166 class166
		    = class182_sub1.aClass180_1944.method3116(i_13_,
							      -1431554601);
		if (class166.aBool1801)
		    class317.anInterface38_3499
			= class182_sub1.aClass351_9253.method6159(class166);
		byte i_18_ = 0;
		if (class166.aClass597_1807 == Class597.aClass597_7843)
		    i_18_ = class166.aByte1830;
		class182_sub1.method14948(i_18_);
	    }
	    if (bool_14_ && class182_sub1.aFloat9169 != aFloat3922)
		class182_sub1.method3351(aFloat3922);
	    else if (class182_sub1.aFloat9169 != 1.0F)
		class182_sub1.method3351(1.0F);
	    method6387(class182_sub1, i, bool);
	}
    }
    
    void method6384(Class182_Sub1 class182_sub1, int i, boolean bool) {
	int i_19_ = 0;
	Class435 class435 = class182_sub1.aClass435_9173;
	float f = class435.aFloatArray4830[0];
	float f_20_ = class435.aFloatArray4830[4];
	float f_21_ = class435.aFloatArray4830[8];
	float f_22_ = class435.aFloatArray4830[1];
	float f_23_ = class435.aFloatArray4830[5];
	float f_24_ = class435.aFloatArray4830[9];
	float f_25_ = f + f_22_;
	float f_26_ = f_20_ + f_23_;
	float f_27_ = f_21_ + f_24_;
	float f_28_ = f - f_22_;
	float f_29_ = f_20_ - f_23_;
	float f_30_ = f_21_ - f_24_;
	float f_31_ = f_22_ - f;
	float f_32_ = f_23_ - f_20_;
	float f_33_ = f_24_ - f_21_;
	float[] fs = new float[3];
	float[] fs_34_ = new float[3];
	class182_sub1.aClass435_9180.method7035(class182_sub1.aClass435_9216);
	ByteBuffer bytebuffer = class182_sub1.aByteBuffer9271;
	bytebuffer.clear();
	for (int i_35_ = i - 1; i_35_ >= 0; i_35_--) {
	    int i_36_
		= anIntArray3907[i_35_] > 64 ? 64 : anIntArray3907[i_35_];
	    if (i_36_ > 0) {
		for (int i_37_ = i_36_ - 1; i_37_ >= 0; i_37_--) {
		    Class531_Sub5_Sub1 class531_sub5_sub1
			= aClass531_Sub5_Sub1ArrayArray3921[i_35_][i_37_];
		    int i_38_ = class531_sub5_sub1.anInt11737;
		    byte i_39_ = (byte) (i_38_ >> 16);
		    byte i_40_ = (byte) (i_38_ >> 8);
		    byte i_41_ = (byte) i_38_;
		    byte i_42_ = (byte) (i_38_ >>> 24);
		    if (class182_sub1.anInt9212 == 0) {
			byte i_43_ = i_39_;
			i_39_ = i_41_;
			i_41_ = i_43_;
		    }
		    float f_44_
			= (float) (class531_sub5_sub1.anInt11731 >> 12);
		    float f_45_
			= (float) (class531_sub5_sub1.anInt11729 >> 12);
		    float f_46_
			= (float) (class531_sub5_sub1.anInt11730 >> 12);
		    int i_47_ = class531_sub5_sub1.anInt11734 >> 12;
		    if (class531_sub5_sub1.aShort11736 != 0) {
			class182_sub1.aClass435_9181.method7050
			    (class531_sub5_sub1.aShort11736, i_47_, i_47_,
			     0.0F, 0.0F, 0.0F);
			class182_sub1.aClass435_9181
			    .method6950(class182_sub1.aClass435_9180);
			class182_sub1.aClass435_9181.method6956(1.0F, 0.0F,
								0.0F, fs);
			class182_sub1.aClass435_9181.method6956(0.0F, 1.0F,
								0.0F, fs_34_);
			bytebuffer.putFloat(f_44_ - fs[0] - fs_34_[0]);
			bytebuffer.putFloat(f_45_ - fs[1] - fs_34_[1]);
			bytebuffer.putFloat(f_46_ - fs[2] - fs_34_[2]);
			bytebuffer.put(i_39_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_44_ - fs[0] + fs_34_[0]);
			bytebuffer.putFloat(f_45_ - fs[1] + fs_34_[1]);
			bytebuffer.putFloat(f_46_ - fs[2] + fs_34_[2]);
			bytebuffer.put(i_39_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_44_ + fs[0] + fs_34_[0]);
			bytebuffer.putFloat(f_45_ + fs[1] + fs_34_[1]);
			bytebuffer.putFloat(f_46_ + fs[2] + fs_34_[2]);
			bytebuffer.put(i_39_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_44_ + fs[0] - fs_34_[0]);
			bytebuffer.putFloat(f_45_ + fs[1] - fs_34_[1]);
			bytebuffer.putFloat(f_46_ + fs[2] - fs_34_[2]);
			bytebuffer.put(i_39_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    } else {
			bytebuffer.putFloat(f_44_ + f_25_ * (float) -i_47_);
			bytebuffer.putFloat(f_45_ + f_26_ * (float) -i_47_);
			bytebuffer.putFloat(f_46_ + f_27_ * (float) -i_47_);
			bytebuffer.put(i_39_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_44_ + f_31_ * (float) i_47_);
			bytebuffer.putFloat(f_45_ + f_32_ * (float) i_47_);
			bytebuffer.putFloat(f_46_ + f_33_ * (float) i_47_);
			bytebuffer.put(i_39_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_44_ + f_25_ * (float) i_47_);
			bytebuffer.putFloat(f_45_ + f_26_ * (float) i_47_);
			bytebuffer.putFloat(f_46_ + f_27_ * (float) i_47_);
			bytebuffer.put(i_39_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_44_ + f_28_ * (float) i_47_);
			bytebuffer.putFloat(f_45_ + f_29_ * (float) i_47_);
			bytebuffer.putFloat(f_46_ + f_30_ * (float) i_47_);
			bytebuffer.put(i_39_);
			bytebuffer.put(i_40_);
			bytebuffer.put(i_41_);
			bytebuffer.put(i_42_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    }
		    i_19_++;
		}
		if (anIntArray3907[i_35_] > 64) {
		    int i_48_ = anIntArray3907[i_35_] - 64 - 1;
		    for (int i_49_ = anIntArray3918[i_48_] - 1; i_49_ >= 0;
			 i_49_--) {
			Class531_Sub5_Sub1 class531_sub5_sub1
			    = aClass531_Sub5_Sub1ArrayArray3920[i_48_][i_49_];
			int i_50_ = class531_sub5_sub1.anInt11737;
			byte i_51_ = (byte) (i_50_ >> 16);
			byte i_52_ = (byte) (i_50_ >> 8);
			byte i_53_ = (byte) i_50_;
			byte i_54_ = (byte) (i_50_ >>> 24);
			float f_55_
			    = (float) (class531_sub5_sub1.anInt11731 >> 12);
			float f_56_
			    = (float) (class531_sub5_sub1.anInt11729 >> 12);
			float f_57_
			    = (float) (class531_sub5_sub1.anInt11730 >> 12);
			int i_58_ = class531_sub5_sub1.anInt11734 >> 12;
			if (class182_sub1.anInt9212 == 0) {
			    byte i_59_ = i_51_;
			    i_51_ = i_53_;
			    i_53_ = i_59_;
			}
			if (class531_sub5_sub1.aShort11736 != 0) {
			    class182_sub1.aClass435_9181.method7050
				(class531_sub5_sub1.aShort11736, i_58_, i_58_,
				 0.0F, 0.0F, 0.0F);
			    class182_sub1.aClass435_9181
				.method6950(class182_sub1.aClass435_9180);
			    class182_sub1.aClass435_9181.method6956(1.0F, 0.0F,
								    0.0F, fs);
			    class182_sub1.aClass435_9181
				.method6956(0.0F, 1.0F, 0.0F, fs_34_);
			    bytebuffer.putFloat(f_55_ - fs[0] - fs_34_[0]);
			    bytebuffer.putFloat(f_56_ - fs[1] - fs_34_[1]);
			    bytebuffer.putFloat(f_57_ - fs[2] - fs_34_[2]);
			    bytebuffer.put(i_51_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_55_ - fs[0] + fs_34_[0]);
			    bytebuffer.putFloat(f_56_ - fs[1] + fs_34_[1]);
			    bytebuffer.putFloat(f_57_ - fs[2] + fs_34_[2]);
			    bytebuffer.put(i_51_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_55_ + fs[0] + fs_34_[0]);
			    bytebuffer.putFloat(f_56_ + fs[1] + fs_34_[1]);
			    bytebuffer.putFloat(f_57_ + fs[2] + fs_34_[2]);
			    bytebuffer.put(i_51_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_55_ + fs[0] - fs_34_[0]);
			    bytebuffer.putFloat(f_56_ + fs[1] - fs_34_[1]);
			    bytebuffer.putFloat(f_57_ + fs[2] - fs_34_[2]);
			    bytebuffer.put(i_51_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			} else {
			    bytebuffer
				.putFloat(f_55_ + f_25_ * (float) -i_58_);
			    bytebuffer
				.putFloat(f_56_ + f_26_ * (float) -i_58_);
			    bytebuffer
				.putFloat(f_57_ + f_27_ * (float) -i_58_);
			    bytebuffer.put(i_51_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_55_ + f_31_ * (float) i_58_);
			    bytebuffer.putFloat(f_56_ + f_32_ * (float) i_58_);
			    bytebuffer.putFloat(f_57_ + f_33_ * (float) i_58_);
			    bytebuffer.put(i_51_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_55_ + f_25_ * (float) i_58_);
			    bytebuffer.putFloat(f_56_ + f_26_ * (float) i_58_);
			    bytebuffer.putFloat(f_57_ + f_27_ * (float) i_58_);
			    bytebuffer.put(i_51_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_55_ + f_28_ * (float) i_58_);
			    bytebuffer.putFloat(f_56_ + f_29_ * (float) i_58_);
			    bytebuffer.putFloat(f_57_ + f_30_ * (float) i_58_);
			    bytebuffer.put(i_51_);
			    bytebuffer.put(i_52_);
			    bytebuffer.put(i_53_);
			    bytebuffer.put(i_54_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			}
			i_19_++;
		    }
		}
	    }
	}
	anInterface35_3912.method215(0, bytebuffer.position(),
				     class182_sub1.aLong9160);
	class182_sub1.method14764(0, anInterface35_3912);
	class182_sub1.method14764(1, anInterface35_3908);
	class182_sub1.method14763(aClass337_3909);
	Class317 class317 = class182_sub1.aClass317_9194;
	class317.method5667(i_19_, bool);
    }
    
    void method6385(Class182_Sub1 class182_sub1) {
	anInterface35_3912.method225(786336, 24);
    }
    
    void method6386(Class182_Sub1 class182_sub1, Class185 class185) {
	class182_sub1.method3235(false);
	aFloat3922 = class182_sub1.aFloat9169;
	float f = class182_sub1.aClass435_9173.aFloatArray4830[2];
	float f_60_ = class182_sub1.aClass435_9173.aFloatArray4830[6];
	float f_61_ = class182_sub1.aClass435_9173.aFloatArray4830[10];
	float f_62_ = class182_sub1.aClass435_9173.aFloatArray4830[14];
	int i = 0;
	int i_63_ = 2147483647;
	int i_64_ = 0;
	Class531_Sub5 class531_sub5
	    = class185.aClass698_2081.aClass531_Sub5_8768;
	for (Class531_Sub5 class531_sub5_65_
		 = class531_sub5.aClass531_Sub5_10342;
	     class531_sub5_65_ != class531_sub5;
	     class531_sub5_65_ = class531_sub5_65_.aClass531_Sub5_10342) {
	    Class531_Sub5_Sub1 class531_sub5_sub1
		= (Class531_Sub5_Sub1) class531_sub5_65_;
	    int i_66_
		= (int) (f * (float) (class531_sub5_sub1.anInt11731 >> 12)
			 + f_60_ * (float) (class531_sub5_sub1.anInt11729
					    >> 12)
			 + f_61_ * (float) (class531_sub5_sub1.anInt11730
					    >> 12)
			 + f_62_);
	    if (i_66_ > i_64_)
		i_64_ = i_66_;
	    if (i_66_ < i_63_)
		i_63_ = i_66_;
	    anIntArray3916[i++] = i_66_;
	}
	int i_67_ = i_64_ - i_63_;
	int i_68_;
	if (i_67_ + 2 > 1600) {
	    i_68_ = 1 + Class180.method3120(i_67_, (byte) 66) - anInt3914;
	    i_67_ = (i_67_ >> i_68_) + 2;
	} else {
	    i_68_ = 0;
	    i_67_ += 2;
	}
	class182_sub1.method14765(anInterface44_3910);
	Class317 class317 = class182_sub1.aClass317_9194;
	class317.method5666(Class435.aClass435_4829);
	class317.aClass435_3500.method7023();
	class317.anInt3504 = -1;
	boolean bool = class182_sub1.anInt9283 > 0;
	if (bool) {
	    class317.aClass437_3502.method7073(0.0F, 0.0F, 1.0F,
					       -class182_sub1.aFloat9207);
	    class317.aClass446_3501.method7265
		((float) (class182_sub1.anInt9282 >> 16 & 0xff) / 255.0F,
		 (float) (class182_sub1.anInt9282 >> 8 & 0xff) / 255.0F,
		 (float) (class182_sub1.anInt9282 >> 0 & 0xff) / 255.0F);
	    class317.aClass437_3502.method7079(class182_sub1.aClass435_9240);
	    class317.aClass437_3502.method7078(1.0F
					       / (class182_sub1.aFloat9218
						  - class182_sub1.aFloat9207));
	} else {
	    class317.aClass437_3502.method7073(0.0F, 0.0F, 0.0F, 0.0F);
	    class317.aClass446_3501.method7265(0.0F, 0.0F, 0.0F);
	}
	method6383(class182_sub1, class531_sub5, i_67_, i_63_, i_68_, class317,
		   bool);
	if (class182_sub1.aFloat9169 != aFloat3922)
	    class182_sub1.method3351(aFloat3922);
	class182_sub1.method3235(true);
    }
    
    void method6387(Class182_Sub1 class182_sub1, int i, boolean bool) {
	int i_69_ = 0;
	Class435 class435 = class182_sub1.aClass435_9173;
	float f = class435.aFloatArray4830[0];
	float f_70_ = class435.aFloatArray4830[4];
	float f_71_ = class435.aFloatArray4830[8];
	float f_72_ = class435.aFloatArray4830[1];
	float f_73_ = class435.aFloatArray4830[5];
	float f_74_ = class435.aFloatArray4830[9];
	float f_75_ = f + f_72_;
	float f_76_ = f_70_ + f_73_;
	float f_77_ = f_71_ + f_74_;
	float f_78_ = f - f_72_;
	float f_79_ = f_70_ - f_73_;
	float f_80_ = f_71_ - f_74_;
	float f_81_ = f_72_ - f;
	float f_82_ = f_73_ - f_70_;
	float f_83_ = f_74_ - f_71_;
	float[] fs = new float[3];
	float[] fs_84_ = new float[3];
	class182_sub1.aClass435_9180.method7035(class182_sub1.aClass435_9216);
	ByteBuffer bytebuffer = class182_sub1.aByteBuffer9271;
	bytebuffer.clear();
	for (int i_85_ = i - 1; i_85_ >= 0; i_85_--) {
	    int i_86_
		= anIntArray3907[i_85_] > 64 ? 64 : anIntArray3907[i_85_];
	    if (i_86_ > 0) {
		for (int i_87_ = i_86_ - 1; i_87_ >= 0; i_87_--) {
		    Class531_Sub5_Sub1 class531_sub5_sub1
			= aClass531_Sub5_Sub1ArrayArray3921[i_85_][i_87_];
		    int i_88_ = class531_sub5_sub1.anInt11737;
		    byte i_89_ = (byte) (i_88_ >> 16);
		    byte i_90_ = (byte) (i_88_ >> 8);
		    byte i_91_ = (byte) i_88_;
		    byte i_92_ = (byte) (i_88_ >>> 24);
		    if (class182_sub1.anInt9212 == 0) {
			byte i_93_ = i_89_;
			i_89_ = i_91_;
			i_91_ = i_93_;
		    }
		    float f_94_
			= (float) (class531_sub5_sub1.anInt11731 >> 12);
		    float f_95_
			= (float) (class531_sub5_sub1.anInt11729 >> 12);
		    float f_96_
			= (float) (class531_sub5_sub1.anInt11730 >> 12);
		    int i_97_ = class531_sub5_sub1.anInt11734 >> 12;
		    if (class531_sub5_sub1.aShort11736 != 0) {
			class182_sub1.aClass435_9181.method7050
			    (class531_sub5_sub1.aShort11736, i_97_, i_97_,
			     0.0F, 0.0F, 0.0F);
			class182_sub1.aClass435_9181
			    .method6950(class182_sub1.aClass435_9180);
			class182_sub1.aClass435_9181.method6956(1.0F, 0.0F,
								0.0F, fs);
			class182_sub1.aClass435_9181.method6956(0.0F, 1.0F,
								0.0F, fs_84_);
			bytebuffer.putFloat(f_94_ - fs[0] - fs_84_[0]);
			bytebuffer.putFloat(f_95_ - fs[1] - fs_84_[1]);
			bytebuffer.putFloat(f_96_ - fs[2] - fs_84_[2]);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_94_ - fs[0] + fs_84_[0]);
			bytebuffer.putFloat(f_95_ - fs[1] + fs_84_[1]);
			bytebuffer.putFloat(f_96_ - fs[2] + fs_84_[2]);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_94_ + fs[0] + fs_84_[0]);
			bytebuffer.putFloat(f_95_ + fs[1] + fs_84_[1]);
			bytebuffer.putFloat(f_96_ + fs[2] + fs_84_[2]);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_94_ + fs[0] - fs_84_[0]);
			bytebuffer.putFloat(f_95_ + fs[1] - fs_84_[1]);
			bytebuffer.putFloat(f_96_ + fs[2] - fs_84_[2]);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    } else {
			bytebuffer.putFloat(f_94_ + f_75_ * (float) -i_97_);
			bytebuffer.putFloat(f_95_ + f_76_ * (float) -i_97_);
			bytebuffer.putFloat(f_96_ + f_77_ * (float) -i_97_);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_94_ + f_81_ * (float) i_97_);
			bytebuffer.putFloat(f_95_ + f_82_ * (float) i_97_);
			bytebuffer.putFloat(f_96_ + f_83_ * (float) i_97_);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_94_ + f_75_ * (float) i_97_);
			bytebuffer.putFloat(f_95_ + f_76_ * (float) i_97_);
			bytebuffer.putFloat(f_96_ + f_77_ * (float) i_97_);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_94_ + f_78_ * (float) i_97_);
			bytebuffer.putFloat(f_95_ + f_79_ * (float) i_97_);
			bytebuffer.putFloat(f_96_ + f_80_ * (float) i_97_);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    }
		    i_69_++;
		}
		if (anIntArray3907[i_85_] > 64) {
		    int i_98_ = anIntArray3907[i_85_] - 64 - 1;
		    for (int i_99_ = anIntArray3918[i_98_] - 1; i_99_ >= 0;
			 i_99_--) {
			Class531_Sub5_Sub1 class531_sub5_sub1
			    = aClass531_Sub5_Sub1ArrayArray3920[i_98_][i_99_];
			int i_100_ = class531_sub5_sub1.anInt11737;
			byte i_101_ = (byte) (i_100_ >> 16);
			byte i_102_ = (byte) (i_100_ >> 8);
			byte i_103_ = (byte) i_100_;
			byte i_104_ = (byte) (i_100_ >>> 24);
			float f_105_
			    = (float) (class531_sub5_sub1.anInt11731 >> 12);
			float f_106_
			    = (float) (class531_sub5_sub1.anInt11729 >> 12);
			float f_107_
			    = (float) (class531_sub5_sub1.anInt11730 >> 12);
			int i_108_ = class531_sub5_sub1.anInt11734 >> 12;
			if (class182_sub1.anInt9212 == 0) {
			    byte i_109_ = i_101_;
			    i_101_ = i_103_;
			    i_103_ = i_109_;
			}
			if (class531_sub5_sub1.aShort11736 != 0) {
			    class182_sub1.aClass435_9181.method7050
				(class531_sub5_sub1.aShort11736, i_108_,
				 i_108_, 0.0F, 0.0F, 0.0F);
			    class182_sub1.aClass435_9181
				.method6950(class182_sub1.aClass435_9180);
			    class182_sub1.aClass435_9181.method6956(1.0F, 0.0F,
								    0.0F, fs);
			    class182_sub1.aClass435_9181
				.method6956(0.0F, 1.0F, 0.0F, fs_84_);
			    bytebuffer.putFloat(f_105_ - fs[0] - fs_84_[0]);
			    bytebuffer.putFloat(f_106_ - fs[1] - fs_84_[1]);
			    bytebuffer.putFloat(f_107_ - fs[2] - fs_84_[2]);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_105_ - fs[0] + fs_84_[0]);
			    bytebuffer.putFloat(f_106_ - fs[1] + fs_84_[1]);
			    bytebuffer.putFloat(f_107_ - fs[2] + fs_84_[2]);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_105_ + fs[0] + fs_84_[0]);
			    bytebuffer.putFloat(f_106_ + fs[1] + fs_84_[1]);
			    bytebuffer.putFloat(f_107_ + fs[2] + fs_84_[2]);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_105_ + fs[0] - fs_84_[0]);
			    bytebuffer.putFloat(f_106_ + fs[1] - fs_84_[1]);
			    bytebuffer.putFloat(f_107_ + fs[2] - fs_84_[2]);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			} else {
			    bytebuffer
				.putFloat(f_105_ + f_75_ * (float) -i_108_);
			    bytebuffer
				.putFloat(f_106_ + f_76_ * (float) -i_108_);
			    bytebuffer
				.putFloat(f_107_ + f_77_ * (float) -i_108_);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer
				.putFloat(f_105_ + f_81_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_106_ + f_82_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_107_ + f_83_ * (float) i_108_);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer
				.putFloat(f_105_ + f_75_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_106_ + f_76_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_107_ + f_77_ * (float) i_108_);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer
				.putFloat(f_105_ + f_78_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_106_ + f_79_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_107_ + f_80_ * (float) i_108_);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			}
			i_69_++;
		    }
		}
	    }
	}
	anInterface35_3912.method215(0, bytebuffer.position(),
				     class182_sub1.aLong9160);
	class182_sub1.method14764(0, anInterface35_3912);
	class182_sub1.method14764(1, anInterface35_3908);
	class182_sub1.method14763(aClass337_3909);
	Class317 class317 = class182_sub1.aClass317_9194;
	class317.method5667(i_69_, bool);
    }
    
    void method6388(Class182_Sub1 class182_sub1) {
	anInterface35_3912.method225(786336, 24);
    }
    
    void method6389(Class182_Sub1 class182_sub1, Class531_Sub5 class531_sub5,
		    int i, int i_110_, int i_111_, Class317 class317,
		    boolean bool) {
	Class531_Sub5 class531_sub5_112_ = class531_sub5.aClass531_Sub5_10342;
	int i_113_ = 0;
	int i_114_ = -2;
	boolean bool_115_ = true;
	boolean bool_116_ = true;
	while (class531_sub5_112_ != class531_sub5) {
	    anInt3919 = 0;
	    for (int i_117_ = 0; i_117_ < i; i_117_++)
		anIntArray3907[i_117_] = 0;
	    for (int i_118_ = 0; i_118_ < 64; i_118_++)
		anIntArray3918[i_118_] = 0;
	    for (/**/; class531_sub5_112_ != class531_sub5;
		 class531_sub5_112_
		     = class531_sub5_112_.aClass531_Sub5_10342) {
		Class531_Sub5_Sub1 class531_sub5_sub1
		    = (Class531_Sub5_Sub1) class531_sub5_112_;
		if (bool_116_) {
		    i_114_ = class531_sub5_sub1.anInt11735;
		    bool_115_ = class531_sub5_sub1.aBool11728;
		    bool_116_ = false;
		}
		if (i_113_ > 0
		    && (i_114_ != class531_sub5_sub1.anInt11735
			|| bool_115_ != class531_sub5_sub1.aBool11728)) {
		    bool_116_ = true;
		    break;
		}
		method6390(anIntArray3916[i_113_++] - i_110_ >> i_111_,
			   class531_sub5_sub1);
	    }
	    class317.anInterface38_3499 = null;
	    if (i_114_ >= 0) {
		Class166 class166
		    = class182_sub1.aClass180_1944.method3116(i_114_,
							      -1431554601);
		if (class166.aBool1801)
		    class317.anInterface38_3499
			= class182_sub1.aClass351_9253.method6159(class166);
		byte i_119_ = 0;
		if (class166.aClass597_1807 == Class597.aClass597_7843)
		    i_119_ = class166.aByte1830;
		class182_sub1.method14948(i_119_);
	    }
	    if (bool_115_ && class182_sub1.aFloat9169 != aFloat3922)
		class182_sub1.method3351(aFloat3922);
	    else if (class182_sub1.aFloat9169 != 1.0F)
		class182_sub1.method3351(1.0F);
	    method6387(class182_sub1, i, bool);
	}
    }
    
    void method6390(int i, Class531_Sub5_Sub1 class531_sub5_sub1) {
	if (i < 1600) {
	    if (anIntArray3907[i] < 64)
		aClass531_Sub5_Sub1ArrayArray3921[i][anIntArray3907[i]++]
		    = class531_sub5_sub1;
	    else {
		if (anIntArray3907[i] == 64) {
		    if (anInt3919 == 64)
			return;
		    anIntArray3907[i] += 1 + anInt3919++;
		}
		aClass531_Sub5_Sub1ArrayArray3920
		    [anIntArray3907[i] - 64 - 1]
		    [anIntArray3918[anIntArray3907[i] - 64 - 1]++]
		    = class531_sub5_sub1;
	    }
	}
    }
    
    Class379(Class182_Sub1 class182_sub1) {
	anInt3913 = 1600;
	anInt3914 = Class180.method3120(1600, (byte) -60);
	anInt3915 = 64;
	anIntArray3916 = new int[8191];
	anIntArray3907 = new int[1600];
	anIntArray3918 = new int[64];
	aClass531_Sub5_Sub1ArrayArray3921 = new Class531_Sub5_Sub1[1600][64];
	aClass531_Sub5_Sub1ArrayArray3920 = new Class531_Sub5_Sub1[64][768];
	anInt3919 = 0;
	aClass337_3909
	    = (class182_sub1.method14762
	       (new Class378[]
		{ new Class378(new Class342[] { Class342.aClass342_3673,
						Class342.aClass342_3657,
						Class342.aClass342_3659 }),
		  new Class378(Class342.aClass342_3655) }));
	anInterface35_3912 = class182_sub1.method14761(true);
	anInterface35_3908 = class182_sub1.method14761(false);
	anInterface35_3908.method225(393168, 12);
	anInterface44_3910 = class182_sub1.method14701(false);
	anInterface44_3910.method29(49146);
	ByteBuffer bytebuffer = class182_sub1.aByteBuffer9271;
	bytebuffer.clear();
	for (int i = 0; i < 8191; i++) {
	    int i_120_ = i * 4;
	    bytebuffer.putShort((short) i_120_);
	    bytebuffer.putShort((short) (i_120_ + 1));
	    bytebuffer.putShort((short) (i_120_ + 2));
	    bytebuffer.putShort((short) (i_120_ + 2));
	    bytebuffer.putShort((short) (i_120_ + 3));
	    bytebuffer.putShort((short) i_120_);
	}
	anInterface44_3910.method215(0, bytebuffer.position(),
				     class182_sub1.aLong9160);
	bytebuffer.clear();
	for (int i = 0; i < 8191; i++) {
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	}
	anInterface35_3908.method215(0, bytebuffer.position(),
				     class182_sub1.aLong9160);
    }
    
    void method6391(Class182_Sub1 class182_sub1, int i, boolean bool) {
	int i_121_ = 0;
	Class435 class435 = class182_sub1.aClass435_9173;
	float f = class435.aFloatArray4830[0];
	float f_122_ = class435.aFloatArray4830[4];
	float f_123_ = class435.aFloatArray4830[8];
	float f_124_ = class435.aFloatArray4830[1];
	float f_125_ = class435.aFloatArray4830[5];
	float f_126_ = class435.aFloatArray4830[9];
	float f_127_ = f + f_124_;
	float f_128_ = f_122_ + f_125_;
	float f_129_ = f_123_ + f_126_;
	float f_130_ = f - f_124_;
	float f_131_ = f_122_ - f_125_;
	float f_132_ = f_123_ - f_126_;
	float f_133_ = f_124_ - f;
	float f_134_ = f_125_ - f_122_;
	float f_135_ = f_126_ - f_123_;
	float[] fs = new float[3];
	float[] fs_136_ = new float[3];
	class182_sub1.aClass435_9180.method7035(class182_sub1.aClass435_9216);
	ByteBuffer bytebuffer = class182_sub1.aByteBuffer9271;
	bytebuffer.clear();
	for (int i_137_ = i - 1; i_137_ >= 0; i_137_--) {
	    int i_138_
		= anIntArray3907[i_137_] > 64 ? 64 : anIntArray3907[i_137_];
	    if (i_138_ > 0) {
		for (int i_139_ = i_138_ - 1; i_139_ >= 0; i_139_--) {
		    Class531_Sub5_Sub1 class531_sub5_sub1
			= aClass531_Sub5_Sub1ArrayArray3921[i_137_][i_139_];
		    int i_140_ = class531_sub5_sub1.anInt11737;
		    byte i_141_ = (byte) (i_140_ >> 16);
		    byte i_142_ = (byte) (i_140_ >> 8);
		    byte i_143_ = (byte) i_140_;
		    byte i_144_ = (byte) (i_140_ >>> 24);
		    if (class182_sub1.anInt9212 == 0) {
			byte i_145_ = i_141_;
			i_141_ = i_143_;
			i_143_ = i_145_;
		    }
		    float f_146_
			= (float) (class531_sub5_sub1.anInt11731 >> 12);
		    float f_147_
			= (float) (class531_sub5_sub1.anInt11729 >> 12);
		    float f_148_
			= (float) (class531_sub5_sub1.anInt11730 >> 12);
		    int i_149_ = class531_sub5_sub1.anInt11734 >> 12;
		    if (class531_sub5_sub1.aShort11736 != 0) {
			class182_sub1.aClass435_9181.method7050
			    (class531_sub5_sub1.aShort11736, i_149_, i_149_,
			     0.0F, 0.0F, 0.0F);
			class182_sub1.aClass435_9181
			    .method6950(class182_sub1.aClass435_9180);
			class182_sub1.aClass435_9181.method6956(1.0F, 0.0F,
								0.0F, fs);
			class182_sub1.aClass435_9181.method6956(0.0F, 1.0F,
								0.0F, fs_136_);
			bytebuffer.putFloat(f_146_ - fs[0] - fs_136_[0]);
			bytebuffer.putFloat(f_147_ - fs[1] - fs_136_[1]);
			bytebuffer.putFloat(f_148_ - fs[2] - fs_136_[2]);
			bytebuffer.put(i_141_);
			bytebuffer.put(i_142_);
			bytebuffer.put(i_143_);
			bytebuffer.put(i_144_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_146_ - fs[0] + fs_136_[0]);
			bytebuffer.putFloat(f_147_ - fs[1] + fs_136_[1]);
			bytebuffer.putFloat(f_148_ - fs[2] + fs_136_[2]);
			bytebuffer.put(i_141_);
			bytebuffer.put(i_142_);
			bytebuffer.put(i_143_);
			bytebuffer.put(i_144_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_146_ + fs[0] + fs_136_[0]);
			bytebuffer.putFloat(f_147_ + fs[1] + fs_136_[1]);
			bytebuffer.putFloat(f_148_ + fs[2] + fs_136_[2]);
			bytebuffer.put(i_141_);
			bytebuffer.put(i_142_);
			bytebuffer.put(i_143_);
			bytebuffer.put(i_144_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_146_ + fs[0] - fs_136_[0]);
			bytebuffer.putFloat(f_147_ + fs[1] - fs_136_[1]);
			bytebuffer.putFloat(f_148_ + fs[2] - fs_136_[2]);
			bytebuffer.put(i_141_);
			bytebuffer.put(i_142_);
			bytebuffer.put(i_143_);
			bytebuffer.put(i_144_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    } else {
			bytebuffer.putFloat(f_146_ + f_127_ * (float) -i_149_);
			bytebuffer.putFloat(f_147_ + f_128_ * (float) -i_149_);
			bytebuffer.putFloat(f_148_ + f_129_ * (float) -i_149_);
			bytebuffer.put(i_141_);
			bytebuffer.put(i_142_);
			bytebuffer.put(i_143_);
			bytebuffer.put(i_144_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_146_ + f_133_ * (float) i_149_);
			bytebuffer.putFloat(f_147_ + f_134_ * (float) i_149_);
			bytebuffer.putFloat(f_148_ + f_135_ * (float) i_149_);
			bytebuffer.put(i_141_);
			bytebuffer.put(i_142_);
			bytebuffer.put(i_143_);
			bytebuffer.put(i_144_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_146_ + f_127_ * (float) i_149_);
			bytebuffer.putFloat(f_147_ + f_128_ * (float) i_149_);
			bytebuffer.putFloat(f_148_ + f_129_ * (float) i_149_);
			bytebuffer.put(i_141_);
			bytebuffer.put(i_142_);
			bytebuffer.put(i_143_);
			bytebuffer.put(i_144_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_146_ + f_130_ * (float) i_149_);
			bytebuffer.putFloat(f_147_ + f_131_ * (float) i_149_);
			bytebuffer.putFloat(f_148_ + f_132_ * (float) i_149_);
			bytebuffer.put(i_141_);
			bytebuffer.put(i_142_);
			bytebuffer.put(i_143_);
			bytebuffer.put(i_144_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    }
		    i_121_++;
		}
		if (anIntArray3907[i_137_] > 64) {
		    int i_150_ = anIntArray3907[i_137_] - 64 - 1;
		    for (int i_151_ = anIntArray3918[i_150_] - 1; i_151_ >= 0;
			 i_151_--) {
			Class531_Sub5_Sub1 class531_sub5_sub1
			    = (aClass531_Sub5_Sub1ArrayArray3920[i_150_]
			       [i_151_]);
			int i_152_ = class531_sub5_sub1.anInt11737;
			byte i_153_ = (byte) (i_152_ >> 16);
			byte i_154_ = (byte) (i_152_ >> 8);
			byte i_155_ = (byte) i_152_;
			byte i_156_ = (byte) (i_152_ >>> 24);
			float f_157_
			    = (float) (class531_sub5_sub1.anInt11731 >> 12);
			float f_158_
			    = (float) (class531_sub5_sub1.anInt11729 >> 12);
			float f_159_
			    = (float) (class531_sub5_sub1.anInt11730 >> 12);
			int i_160_ = class531_sub5_sub1.anInt11734 >> 12;
			if (class182_sub1.anInt9212 == 0) {
			    byte i_161_ = i_153_;
			    i_153_ = i_155_;
			    i_155_ = i_161_;
			}
			if (class531_sub5_sub1.aShort11736 != 0) {
			    class182_sub1.aClass435_9181.method7050
				(class531_sub5_sub1.aShort11736, i_160_,
				 i_160_, 0.0F, 0.0F, 0.0F);
			    class182_sub1.aClass435_9181
				.method6950(class182_sub1.aClass435_9180);
			    class182_sub1.aClass435_9181.method6956(1.0F, 0.0F,
								    0.0F, fs);
			    class182_sub1.aClass435_9181
				.method6956(0.0F, 1.0F, 0.0F, fs_136_);
			    bytebuffer.putFloat(f_157_ - fs[0] - fs_136_[0]);
			    bytebuffer.putFloat(f_158_ - fs[1] - fs_136_[1]);
			    bytebuffer.putFloat(f_159_ - fs[2] - fs_136_[2]);
			    bytebuffer.put(i_153_);
			    bytebuffer.put(i_154_);
			    bytebuffer.put(i_155_);
			    bytebuffer.put(i_156_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_157_ - fs[0] + fs_136_[0]);
			    bytebuffer.putFloat(f_158_ - fs[1] + fs_136_[1]);
			    bytebuffer.putFloat(f_159_ - fs[2] + fs_136_[2]);
			    bytebuffer.put(i_153_);
			    bytebuffer.put(i_154_);
			    bytebuffer.put(i_155_);
			    bytebuffer.put(i_156_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_157_ + fs[0] + fs_136_[0]);
			    bytebuffer.putFloat(f_158_ + fs[1] + fs_136_[1]);
			    bytebuffer.putFloat(f_159_ + fs[2] + fs_136_[2]);
			    bytebuffer.put(i_153_);
			    bytebuffer.put(i_154_);
			    bytebuffer.put(i_155_);
			    bytebuffer.put(i_156_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_157_ + fs[0] - fs_136_[0]);
			    bytebuffer.putFloat(f_158_ + fs[1] - fs_136_[1]);
			    bytebuffer.putFloat(f_159_ + fs[2] - fs_136_[2]);
			    bytebuffer.put(i_153_);
			    bytebuffer.put(i_154_);
			    bytebuffer.put(i_155_);
			    bytebuffer.put(i_156_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			} else {
			    bytebuffer
				.putFloat(f_157_ + f_127_ * (float) -i_160_);
			    bytebuffer
				.putFloat(f_158_ + f_128_ * (float) -i_160_);
			    bytebuffer
				.putFloat(f_159_ + f_129_ * (float) -i_160_);
			    bytebuffer.put(i_153_);
			    bytebuffer.put(i_154_);
			    bytebuffer.put(i_155_);
			    bytebuffer.put(i_156_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer
				.putFloat(f_157_ + f_133_ * (float) i_160_);
			    bytebuffer
				.putFloat(f_158_ + f_134_ * (float) i_160_);
			    bytebuffer
				.putFloat(f_159_ + f_135_ * (float) i_160_);
			    bytebuffer.put(i_153_);
			    bytebuffer.put(i_154_);
			    bytebuffer.put(i_155_);
			    bytebuffer.put(i_156_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer
				.putFloat(f_157_ + f_127_ * (float) i_160_);
			    bytebuffer
				.putFloat(f_158_ + f_128_ * (float) i_160_);
			    bytebuffer
				.putFloat(f_159_ + f_129_ * (float) i_160_);
			    bytebuffer.put(i_153_);
			    bytebuffer.put(i_154_);
			    bytebuffer.put(i_155_);
			    bytebuffer.put(i_156_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer
				.putFloat(f_157_ + f_130_ * (float) i_160_);
			    bytebuffer
				.putFloat(f_158_ + f_131_ * (float) i_160_);
			    bytebuffer
				.putFloat(f_159_ + f_132_ * (float) i_160_);
			    bytebuffer.put(i_153_);
			    bytebuffer.put(i_154_);
			    bytebuffer.put(i_155_);
			    bytebuffer.put(i_156_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			}
			i_121_++;
		    }
		}
	    }
	}
	anInterface35_3912.method215(0, bytebuffer.position(),
				     class182_sub1.aLong9160);
	class182_sub1.method14764(0, anInterface35_3912);
	class182_sub1.method14764(1, anInterface35_3908);
	class182_sub1.method14763(aClass337_3909);
	Class317 class317 = class182_sub1.aClass317_9194;
	class317.method5667(i_121_, bool);
    }
}
