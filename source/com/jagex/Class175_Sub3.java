/* Class175_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class175_Sub3 extends Class175
{
    Class182_Sub3 aClass182_Sub3_9896;
    Class126 aClass126_9897;
    Class136_Sub2_Sub1 aClass136_Sub2_Sub1_9898;
    boolean aBool9899;
    
    void method2854(char c, int i, int i_0_, int i_1_, boolean bool) {
	aClass182_Sub3_9896.method15389();
	aClass182_Sub3_9896.method15395(aClass136_Sub2_Sub1_9898);
	if (aBool9899 || bool) {
	    aClass182_Sub3_9896.method15398(7681, 8448);
	    aClass182_Sub3_9896.method15431(0, 34168, 768);
	} else
	    aClass182_Sub3_9896.method15398(7681, 7681);
	OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_,
			  (byte) (i_1_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
	aClass126_9897.method2234(c);
	OpenGL.glLoadIdentity();
	if (aBool9899 || bool)
	    aClass182_Sub3_9896.method15431(0, 5890, 768);
    }
    
    void method2874(char c, int i, int i_2_, int i_3_, boolean bool) {
	aClass182_Sub3_9896.method15389();
	aClass182_Sub3_9896.method15395(aClass136_Sub2_Sub1_9898);
	if (aBool9899 || bool) {
	    aClass182_Sub3_9896.method15398(7681, 8448);
	    aClass182_Sub3_9896.method15431(0, 34168, 768);
	} else
	    aClass182_Sub3_9896.method15398(7681, 7681);
	OpenGL.glColor4ub((byte) (i_3_ >> 16), (byte) (i_3_ >> 8), (byte) i_3_,
			  (byte) (i_3_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_2_, 0.0F);
	aClass126_9897.method2234(c);
	OpenGL.glLoadIdentity();
	if (aBool9899 || bool)
	    aClass182_Sub3_9896.method15431(0, 5890, 768);
    }
    
    Class175_Sub3(Class182_Sub3 class182_sub3, Class7 class7,
		  Class173[] class173s, boolean bool) {
	super(class182_sub3, class7);
	aClass182_Sub3_9896 = class182_sub3;
	int i = 0;
	for (int i_4_ = 0; i_4_ < 256; i_4_++) {
	    Class173 class173 = class173s[i_4_];
	    if (class173.method2765() > i)
		i = class173.method2765();
	    if (class173.method2772() > i)
		i = class173.method2772();
	}
	int i_5_ = i * 16;
	if (bool) {
	    byte[] is = new byte[i_5_ * i_5_];
	    for (int i_6_ = 0; i_6_ < 256; i_6_++) {
		Class173 class173 = class173s[i_6_];
		int i_7_ = class173.method2765();
		int i_8_ = class173.method2772();
		int i_9_ = i_6_ % 16 * i;
		int i_10_ = i_6_ / 16 * i;
		int i_11_ = i_10_ * i_5_ + i_9_;
		int i_12_ = 0;
		if (class173.method2762()) {
		    Class173_Sub2 class173_sub2
			= (Class173_Sub2) class173s[i_6_];
		    if (!class173_sub2.method2763()) {
			byte[] is_13_ = class173_sub2.aByteArray9622;
			for (int i_14_ = 0; i_14_ < i_7_; i_14_++) {
			    for (int i_15_ = 0; i_15_ < i_8_; i_15_++)
				is[i_11_++]
				    = (byte) (is_13_[i_12_++] == 0 ? 0 : -1);
			    i_11_ += i_5_ - i_8_;
			}
		    } else {
			byte[] is_16_ = class173_sub2.aByteArray9626;
			for (int i_17_ = 0; i_17_ < i_7_; i_17_++) {
			    for (int i_18_ = 0; i_18_ < i_8_; i_18_++)
				is[i_11_++] = is_16_[i_12_++];
			    i_11_ += i_5_ - i_8_;
			}
		    }
		} else {
		    Class173_Sub1 class173_sub1
			= (Class173_Sub1) class173s[i_6_];
		    int[] is_19_ = class173_sub1.method2778(false);
		    if (!class173_sub1.method2763()) {
			for (int i_20_ = 0; i_20_ < i_7_; i_20_++) {
			    for (int i_21_ = 0; i_21_ < i_8_; i_21_++) {
				int i_22_ = is_19_[i_12_++];
				byte i_23_ = (byte) (((i_22_ >> 16 & 0xff) * 3
						      + (i_22_ >> 8 & 0xff) * 4
						      + (i_22_ & 0xff))
						     >> 3);
				is[i_11_++] = i_23_;
			    }
			    i_11_ += i_5_ - i_8_;
			}
		    } else {
			for (int i_24_ = 0; i_24_ < i_7_; i_24_++) {
			    for (int i_25_ = 0; i_25_ < i_8_; i_25_++)
				is[i_11_++]
				    = (byte) (is_19_[i_12_++] >> 24 & 0xff);
			    i_11_ += i_5_ - i_8_;
			}
		    }
		}
	    }
	    aClass136_Sub2_Sub1_9898
		= Class136_Sub2_Sub1.method18033(class182_sub3,
						 Class165.aClass165_1772,
						 Class178.aClass178_1905, i_5_,
						 i_5_, false, is,
						 Class165.aClass165_1772);
	    aBool9899 = true;
	} else {
	    int[] is = new int[i_5_ * i_5_];
	    for (int i_26_ = 0; i_26_ < 256; i_26_++) {
		Class173 class173 = class173s[i_26_];
		int i_27_ = class173.method2765();
		int i_28_ = class173.method2772();
		int i_29_ = i_26_ % 16 * i;
		int i_30_ = i_26_ / 16 * i;
		int i_31_ = i_30_ * i_5_ + i_29_;
		int i_32_ = 0;
		if (class173.method2762()) {
		    Class173_Sub2 class173_sub2
			= (Class173_Sub2) class173s[i_26_];
		    int[] is_33_ = class173_sub2.anIntArray9624;
		    byte[] is_34_ = class173_sub2.aByteArray9626;
		    byte[] is_35_ = class173_sub2.aByteArray9622;
		    if (is_34_ != null) {
			for (int i_36_ = 0; i_36_ < i_27_; i_36_++) {
			    for (int i_37_ = 0; i_37_ < i_28_; i_37_++) {
				is[i_31_++] = (is_34_[i_32_] << 24
					       | is_33_[is_35_[i_32_] & 0xff]);
				i_32_++;
			    }
			    i_31_ += i_5_ - i_28_;
			}
		    } else {
			for (int i_38_ = 0; i_38_ < i_27_; i_38_++) {
			    for (int i_39_ = 0; i_39_ < i_28_; i_39_++) {
				int i_40_;
				if ((i_40_ = is_35_[i_32_++]) != 0)
				    is[i_31_++]
					= ~0xffffff | is_33_[i_40_ & 0xff];
				else
				    i_31_++;
			    }
			    i_31_ += i_5_ - i_28_;
			}
		    }
		} else {
		    Class173_Sub1 class173_sub1
			= (Class173_Sub1) class173s[i_26_];
		    int[] is_41_ = class173_sub1.method2778(false);
		    if (!class173_sub1.method2763()) {
			for (int i_42_ = 0; i_42_ < i_27_; i_42_++) {
			    for (int i_43_ = 0; i_43_ < i_28_; i_43_++) {
				int i_44_ = is_41_[i_32_] & 0xffffff;
				is[i_31_++]
				    = (i_44_ == 0 ? 0 : 255) << 24 | i_44_;
				i_32_++;
			    }
			    i_31_ += i_5_ - i_28_;
			}
		    } else {
			for (int i_45_ = 0; i_45_ < i_27_; i_45_++) {
			    for (int i_46_ = 0; i_46_ < i_28_; i_46_++)
				is[i_31_++] = is_41_[i_32_++];
			    i_31_ += i_5_ - i_28_;
			}
		    }
		}
	    }
	    aClass136_Sub2_Sub1_9898
		= Class136_Sub2_Sub1.method18036(class182_sub3, i_5_, i_5_,
						 false, is, 0, 0);
	    aBool9899 = false;
	}
	aClass136_Sub2_Sub1_9898.method2304(false);
	aClass126_9897 = new Class126(class182_sub3, 256);
	float f = (aClass136_Sub2_Sub1_9898.aFloat11432
		   / (float) aClass136_Sub2_Sub1_9898.anInt11435);
	float f_47_ = (aClass136_Sub2_Sub1_9898.aFloat11434
		       / (float) aClass136_Sub2_Sub1_9898.anInt11433);
	for (int i_48_ = 0; i_48_ < 256; i_48_++) {
	    Class173 class173 = class173s[i_48_];
	    int i_49_ = class173.method2765();
	    int i_50_ = class173.method2772();
	    int i_51_ = class173.method2768();
	    int i_52_ = class173.method2766();
	    float f_53_ = (float) (i_48_ % 16 * i);
	    float f_54_ = (float) (i_48_ / 16 * i);
	    float f_55_ = f_53_ * f;
	    float f_56_ = f_54_ * f_47_;
	    float f_57_ = (f_53_ + (float) i_50_) * f;
	    float f_58_ = (f_54_ + (float) i_49_) * f_47_;
	    aClass126_9897.method2233(i_48_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(f_55_,
				aClass136_Sub2_Sub1_9898.aFloat11434 - f_56_);
	    OpenGL.glVertex2i(i_52_, i_51_);
	    OpenGL.glTexCoord2f(f_55_,
				aClass136_Sub2_Sub1_9898.aFloat11434 - f_58_);
	    OpenGL.glVertex2i(i_52_, i_51_ + i_49_);
	    OpenGL.glTexCoord2f(f_57_,
				aClass136_Sub2_Sub1_9898.aFloat11434 - f_58_);
	    OpenGL.glVertex2i(i_52_ + i_50_, i_51_ + i_49_);
	    OpenGL.glTexCoord2f(f_57_,
				aClass136_Sub2_Sub1_9898.aFloat11434 - f_56_);
	    OpenGL.glVertex2i(i_52_ + i_50_, i_51_);
	    OpenGL.glEnd();
	    aClass126_9897.method2238();
	}
    }
    
    void method2868(char c, int i, int i_59_, int i_60_, boolean bool,
		    Class152 class152, int i_61_, int i_62_) {
	Class152_Sub2 class152_sub2 = (Class152_Sub2) class152;
	Class136_Sub2_Sub1 class136_sub2_sub1
	    = class152_sub2.aClass136_Sub2_Sub1_9505;
	aClass182_Sub3_9896.method15389();
	aClass182_Sub3_9896.method15395(aClass136_Sub2_Sub1_9898);
	if (aBool9899 || bool) {
	    aClass182_Sub3_9896.method15398(7681, 8448);
	    aClass182_Sub3_9896.method15431(0, 34168, 768);
	} else
	    aClass182_Sub3_9896.method15398(7681, 7681);
	aClass182_Sub3_9896.method15394(1);
	aClass182_Sub3_9896.method15395(class136_sub2_sub1);
	aClass182_Sub3_9896.method15398(7681, 8448);
	aClass182_Sub3_9896.method15431(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f = (class136_sub2_sub1.aFloat11432
		   / (float) class136_sub2_sub1.anInt11435);
	float f_63_ = (class136_sub2_sub1.aFloat11434
		       / (float) class136_sub2_sub1.anInt11433);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_61_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_63_, 0.0F,
					(float) -i_62_ * f_63_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_60_ >> 16), (byte) (i_60_ >> 8),
			  (byte) i_60_, (byte) (i_60_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_59_, 0.0F);
	aClass126_9897.method2234(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	aClass182_Sub3_9896.method15431(0, 5890, 768);
	aClass182_Sub3_9896.method15398(8448, 8448);
	aClass182_Sub3_9896.method15395(null);
	aClass182_Sub3_9896.method15394(0);
	if (aBool9899 || bool)
	    aClass182_Sub3_9896.method15431(0, 5890, 768);
    }
    
    void method2853(char c, int i, int i_64_, int i_65_, boolean bool) {
	aClass182_Sub3_9896.method15389();
	aClass182_Sub3_9896.method15395(aClass136_Sub2_Sub1_9898);
	if (aBool9899 || bool) {
	    aClass182_Sub3_9896.method15398(7681, 8448);
	    aClass182_Sub3_9896.method15431(0, 34168, 768);
	} else
	    aClass182_Sub3_9896.method15398(7681, 7681);
	OpenGL.glColor4ub((byte) (i_65_ >> 16), (byte) (i_65_ >> 8),
			  (byte) i_65_, (byte) (i_65_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_64_, 0.0F);
	aClass126_9897.method2234(c);
	OpenGL.glLoadIdentity();
	if (aBool9899 || bool)
	    aClass182_Sub3_9896.method15431(0, 5890, 768);
    }
    
    void method2856(char c, int i, int i_66_, int i_67_, boolean bool) {
	aClass182_Sub3_9896.method15389();
	aClass182_Sub3_9896.method15395(aClass136_Sub2_Sub1_9898);
	if (aBool9899 || bool) {
	    aClass182_Sub3_9896.method15398(7681, 8448);
	    aClass182_Sub3_9896.method15431(0, 34168, 768);
	} else
	    aClass182_Sub3_9896.method15398(7681, 7681);
	OpenGL.glColor4ub((byte) (i_67_ >> 16), (byte) (i_67_ >> 8),
			  (byte) i_67_, (byte) (i_67_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_66_, 0.0F);
	aClass126_9897.method2234(c);
	OpenGL.glLoadIdentity();
	if (aBool9899 || bool)
	    aClass182_Sub3_9896.method15431(0, 5890, 768);
    }
    
    void method2857(char c, int i, int i_68_, int i_69_, boolean bool,
		    Class152 class152, int i_70_, int i_71_) {
	Class152_Sub2 class152_sub2 = (Class152_Sub2) class152;
	Class136_Sub2_Sub1 class136_sub2_sub1
	    = class152_sub2.aClass136_Sub2_Sub1_9505;
	aClass182_Sub3_9896.method15389();
	aClass182_Sub3_9896.method15395(aClass136_Sub2_Sub1_9898);
	if (aBool9899 || bool) {
	    aClass182_Sub3_9896.method15398(7681, 8448);
	    aClass182_Sub3_9896.method15431(0, 34168, 768);
	} else
	    aClass182_Sub3_9896.method15398(7681, 7681);
	aClass182_Sub3_9896.method15394(1);
	aClass182_Sub3_9896.method15395(class136_sub2_sub1);
	aClass182_Sub3_9896.method15398(7681, 8448);
	aClass182_Sub3_9896.method15431(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f = (class136_sub2_sub1.aFloat11432
		   / (float) class136_sub2_sub1.anInt11435);
	float f_72_ = (class136_sub2_sub1.aFloat11434
		       / (float) class136_sub2_sub1.anInt11433);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_70_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_72_, 0.0F,
					(float) -i_71_ * f_72_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_69_ >> 16), (byte) (i_69_ >> 8),
			  (byte) i_69_, (byte) (i_69_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_68_, 0.0F);
	aClass126_9897.method2234(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	aClass182_Sub3_9896.method15431(0, 5890, 768);
	aClass182_Sub3_9896.method15398(8448, 8448);
	aClass182_Sub3_9896.method15395(null);
	aClass182_Sub3_9896.method15394(0);
	if (aBool9899 || bool)
	    aClass182_Sub3_9896.method15431(0, 5890, 768);
    }
    
    void method2858(char c, int i, int i_73_, int i_74_, boolean bool,
		    Class152 class152, int i_75_, int i_76_) {
	Class152_Sub2 class152_sub2 = (Class152_Sub2) class152;
	Class136_Sub2_Sub1 class136_sub2_sub1
	    = class152_sub2.aClass136_Sub2_Sub1_9505;
	aClass182_Sub3_9896.method15389();
	aClass182_Sub3_9896.method15395(aClass136_Sub2_Sub1_9898);
	if (aBool9899 || bool) {
	    aClass182_Sub3_9896.method15398(7681, 8448);
	    aClass182_Sub3_9896.method15431(0, 34168, 768);
	} else
	    aClass182_Sub3_9896.method15398(7681, 7681);
	aClass182_Sub3_9896.method15394(1);
	aClass182_Sub3_9896.method15395(class136_sub2_sub1);
	aClass182_Sub3_9896.method15398(7681, 8448);
	aClass182_Sub3_9896.method15431(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f = (class136_sub2_sub1.aFloat11432
		   / (float) class136_sub2_sub1.anInt11435);
	float f_77_ = (class136_sub2_sub1.aFloat11434
		       / (float) class136_sub2_sub1.anInt11433);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_75_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_77_, 0.0F,
					(float) -i_76_ * f_77_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_74_ >> 16), (byte) (i_74_ >> 8),
			  (byte) i_74_, (byte) (i_74_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_73_, 0.0F);
	aClass126_9897.method2234(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	aClass182_Sub3_9896.method15431(0, 5890, 768);
	aClass182_Sub3_9896.method15398(8448, 8448);
	aClass182_Sub3_9896.method15395(null);
	aClass182_Sub3_9896.method15394(0);
	if (aBool9899 || bool)
	    aClass182_Sub3_9896.method15431(0, 5890, 768);
    }
    
    void method2835(char c, int i, int i_78_, int i_79_, boolean bool,
		    Class152 class152, int i_80_, int i_81_) {
	Class152_Sub2 class152_sub2 = (Class152_Sub2) class152;
	Class136_Sub2_Sub1 class136_sub2_sub1
	    = class152_sub2.aClass136_Sub2_Sub1_9505;
	aClass182_Sub3_9896.method15389();
	aClass182_Sub3_9896.method15395(aClass136_Sub2_Sub1_9898);
	if (aBool9899 || bool) {
	    aClass182_Sub3_9896.method15398(7681, 8448);
	    aClass182_Sub3_9896.method15431(0, 34168, 768);
	} else
	    aClass182_Sub3_9896.method15398(7681, 7681);
	aClass182_Sub3_9896.method15394(1);
	aClass182_Sub3_9896.method15395(class136_sub2_sub1);
	aClass182_Sub3_9896.method15398(7681, 8448);
	aClass182_Sub3_9896.method15431(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f = (class136_sub2_sub1.aFloat11432
		   / (float) class136_sub2_sub1.anInt11435);
	float f_82_ = (class136_sub2_sub1.aFloat11434
		       / (float) class136_sub2_sub1.anInt11433);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_80_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_82_, 0.0F,
					(float) -i_81_ * f_82_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_79_ >> 16), (byte) (i_79_ >> 8),
			  (byte) i_79_, (byte) (i_79_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_78_, 0.0F);
	aClass126_9897.method2234(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	aClass182_Sub3_9896.method15431(0, 5890, 768);
	aClass182_Sub3_9896.method15398(8448, 8448);
	aClass182_Sub3_9896.method15395(null);
	aClass182_Sub3_9896.method15394(0);
	if (aBool9899 || bool)
	    aClass182_Sub3_9896.method15431(0, 5890, 768);
    }
    
    void method2860(char c, int i, int i_83_, int i_84_, boolean bool,
		    Class152 class152, int i_85_, int i_86_) {
	Class152_Sub2 class152_sub2 = (Class152_Sub2) class152;
	Class136_Sub2_Sub1 class136_sub2_sub1
	    = class152_sub2.aClass136_Sub2_Sub1_9505;
	aClass182_Sub3_9896.method15389();
	aClass182_Sub3_9896.method15395(aClass136_Sub2_Sub1_9898);
	if (aBool9899 || bool) {
	    aClass182_Sub3_9896.method15398(7681, 8448);
	    aClass182_Sub3_9896.method15431(0, 34168, 768);
	} else
	    aClass182_Sub3_9896.method15398(7681, 7681);
	aClass182_Sub3_9896.method15394(1);
	aClass182_Sub3_9896.method15395(class136_sub2_sub1);
	aClass182_Sub3_9896.method15398(7681, 8448);
	aClass182_Sub3_9896.method15431(0, 34168, 768);
	OpenGL.glTexGeni(8192, 9472, 9216);
	OpenGL.glTexGeni(8193, 9472, 9216);
	float f = (class136_sub2_sub1.aFloat11432
		   / (float) class136_sub2_sub1.anInt11435);
	float f_87_ = (class136_sub2_sub1.aFloat11434
		       / (float) class136_sub2_sub1.anInt11433);
	OpenGL.glTexGenfv(8192, 9474,
			  new float[] { f, 0.0F, 0.0F, (float) -i_85_ * f },
			  0);
	OpenGL.glTexGenfv(8193, 9474,
			  new float[] { 0.0F, f_87_, 0.0F,
					(float) -i_86_ * f_87_ },
			  0);
	OpenGL.glEnable(3168);
	OpenGL.glEnable(3169);
	OpenGL.glColor4ub((byte) (i_84_ >> 16), (byte) (i_84_ >> 8),
			  (byte) i_84_, (byte) (i_84_ >> 24));
	OpenGL.glTranslatef((float) i, (float) i_83_, 0.0F);
	aClass126_9897.method2234(c);
	OpenGL.glLoadIdentity();
	OpenGL.glDisable(3168);
	OpenGL.glDisable(3169);
	aClass182_Sub3_9896.method15431(0, 5890, 768);
	aClass182_Sub3_9896.method15398(8448, 8448);
	aClass182_Sub3_9896.method15395(null);
	aClass182_Sub3_9896.method15394(0);
	if (aBool9899 || bool)
	    aClass182_Sub3_9896.method15431(0, 5890, 768);
    }
}
