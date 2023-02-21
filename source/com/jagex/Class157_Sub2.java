/* Class157_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class157_Sub2 extends Class157
{
    int anInt9114;
    Class182_Sub3 aClass182_Sub3_9115;
    Class136_Sub2_Sub1 aClass136_Sub2_Sub1_9116;
    boolean aBool9117;
    Class136_Sub2_Sub1 aClass136_Sub2_Sub1_9118;
    int anInt9119;
    int anInt9120;
    int anInt9121 = 0;
    int anInt9122;
    
    public int method2503() {
	return aClass136_Sub2_Sub1_9118.anInt11435;
    }
    
    void method2493(float f, float f_0_, float f_1_, float f_2_, float f_3_,
		    float f_4_, int i, int i_5_, int i_6_, int i_7_) {
	if (aBool9117) {
	    float f_8_ = (float) method12();
	    float f_9_ = (float) method2472();
	    float f_10_ = (f_1_ - f) / f_8_;
	    float f_11_ = (f_2_ - f_0_) / f_8_;
	    float f_12_ = (f_3_ - f) / f_9_;
	    float f_13_ = (f_4_ - f_0_) / f_9_;
	    float f_14_ = f_12_ * (float) anInt9119;
	    float f_15_ = f_13_ * (float) anInt9119;
	    float f_16_ = f_10_ * (float) anInt9120;
	    float f_17_ = f_11_ * (float) anInt9120;
	    float f_18_ = -f_10_ * (float) anInt9122;
	    float f_19_ = -f_11_ * (float) anInt9122;
	    float f_20_ = -f_12_ * (float) anInt9114;
	    float f_21_ = -f_13_ * (float) anInt9114;
	    f = f + f_16_ + f_14_;
	    f_0_ = f_0_ + f_17_ + f_15_;
	    f_1_ = f_1_ + f_18_ + f_14_;
	    f_2_ = f_2_ + f_19_ + f_15_;
	    f_3_ = f_3_ + f_16_ + f_20_;
	    f_4_ = f_4_ + f_17_ + f_21_;
	}
	float f_22_ = f_3_ + (f_1_ - f);
	float f_23_ = f_2_ + (f_4_ - f_0_);
	aClass136_Sub2_Sub1_9118.method2304((i_7_ & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15409(i_6_);
	aClass182_Sub3_9115.method15396(i);
	OpenGL.glColor4ub((byte) (i_5_ >> 16), (byte) (i_5_ >> 8), (byte) i_5_,
			  (byte) (i_5_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glVertex2f(f, f_0_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_3_, f_4_);
	OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	OpenGL.glVertex2f(f_22_, f_23_);
	OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
			    aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glVertex2f(f_1_, f_2_);
	OpenGL.glEnd();
    }
    
    Class157_Sub2(Class182_Sub3 class182_sub3, int i, int i_24_, int[] is,
		  int i_25_, int i_26_) {
	aBool9117 = false;
	anInt9119 = 0;
	anInt9120 = 0;
	anInt9114 = 0;
	anInt9122 = 0;
	aClass182_Sub3_9115 = class182_sub3;
	aClass136_Sub2_Sub1_9118
	    = Class136_Sub2_Sub1.method18036(class182_sub3, i, i_24_, false,
					     is, i_26_, i_25_);
    }
    
    public Interface21 method2501() {
	return aClass136_Sub2_Sub1_9118.method14472(0);
    }
    
    public void method2469(int[] is) {
	is[0] = anInt9120;
	is[1] = anInt9119;
	is[2] = anInt9122;
	is[3] = anInt9114;
    }
    
    public void method2545(int i, int i_27_, int i_28_, int i_29_, int i_30_) {
	aClass136_Sub2_Sub1_9118.method2304(false);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15409(i_30_);
	OpenGL.glColor4ub((byte) (i_29_ >> 16), (byte) (i_29_ >> 8),
			  (byte) i_29_, (byte) (i_29_ >> 24));
	i += anInt9120;
	i_27_ += anInt9119;
	if (aClass136_Sub2_Sub1_9116 == null) {
	    aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	    aClass182_Sub3_9115.method15396(i_28_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_27_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_27_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435,
			      i_27_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435, i_27_);
	    OpenGL.glEnd();
	} else {
	    method14618(i_28_);
	    aClass136_Sub2_Sub1_9116.method2304(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_27_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_27_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435,
			      i_27_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435, i_27_);
	    OpenGL.glEnd();
	    method14616();
	}
    }
    
    public void method2500(int i, int i_31_, int i_32_, int i_33_, int[] is,
			   int[] is_34_, int i_35_, int i_36_) {
	aClass136_Sub2_Sub1_9118.method14476(i, i_31_, i_32_, i_33_, is,
					     is_34_, i_35_);
    }
    
    public void method2515(int i, int i_37_, int i_38_, int i_39_) {
	anInt9120 = i;
	anInt9119 = i_37_;
	anInt9122 = i_38_;
	anInt9114 = i_39_;
	aBool9117 = (anInt9120 != 0 || anInt9119 != 0 || anInt9122 != 0
		     || anInt9114 != 0);
    }
    
    public void method2517(int i, int i_40_, int i_41_, int i_42_) {
	anInt9120 = i;
	anInt9119 = i_40_;
	anInt9122 = i_41_;
	anInt9114 = i_42_;
	aBool9117 = (anInt9120 != 0 || anInt9119 != 0 || anInt9122 != 0
		     || anInt9114 != 0);
    }
    
    public Interface21 method2521() {
	return aClass136_Sub2_Sub1_9118.method14472(0);
    }
    
    public void method2480(int i, int i_43_, Class152 class152, int i_44_,
			   int i_45_) {
	Class152_Sub2 class152_sub2 = (Class152_Sub2) class152;
	Class136_Sub2_Sub1 class136_sub2_sub1
	    = class152_sub2.aClass136_Sub2_Sub1_9505;
	aClass136_Sub2_Sub1_9118.method2304(false);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15396(1);
	aClass182_Sub3_9115.method15394(1);
	aClass182_Sub3_9115.method15395(class136_sub2_sub1);
	aClass182_Sub3_9115.method15398(7681, 8448);
	aClass182_Sub3_9115.method15431(0, 34168, 768);
	aClass182_Sub3_9115.method15409(1);
	i += anInt9120;
	i_43_ += anInt9119;
	int i_46_ = i + aClass136_Sub2_Sub1_9118.anInt11435;
	int i_47_ = i_43_ + aClass136_Sub2_Sub1_9118.anInt11433;
	float f = (class136_sub2_sub1.aFloat11432
		   / (float) class136_sub2_sub1.anInt11435);
	float f_48_ = (class136_sub2_sub1.aFloat11434
		       / (float) class136_sub2_sub1.anInt11433);
	float f_49_ = (float) (i - i_44_) * f;
	float f_50_ = (float) (i_46_ - i_44_) * f;
	float f_51_
	    = class136_sub2_sub1.aFloat11434 - (float) (i_43_ - i_45_) * f_48_;
	float f_52_
	    = class136_sub2_sub1.aFloat11434 - (float) (i_47_ - i_45_) * f_48_;
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_49_, f_51_);
	OpenGL.glVertex2i(i, i_43_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_49_, f_52_);
	OpenGL.glVertex2i(i, i_43_ + aClass136_Sub2_Sub1_9118.anInt11433);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_50_, f_52_);
	OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435,
			  i_43_ + aClass136_Sub2_Sub1_9118.anInt11433);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_50_, f_51_);
	OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435, i_43_);
	OpenGL.glEnd();
	aClass182_Sub3_9115.method15431(0, 5890, 768);
	aClass182_Sub3_9115.method15396(0);
	aClass182_Sub3_9115.method15395(null);
	aClass182_Sub3_9115.method15394(0);
    }
    
    void method14615(int i, int i_53_, int i_54_, int i_55_, int i_56_,
		     int i_57_, boolean bool) {
	if (aClass182_Sub3_9115.aBool9793 && !bool) {
	    int[] is
		= aClass182_Sub3_9115.method3165(i_56_, i_57_, i_54_, i_55_);
	    if (is != null) {
		for (int i_58_ = 0; i_58_ < is.length; i_58_++)
		    is[i_58_] |= ~0xffffff;
		method2474(i, i_53_, i_54_, i_55_, is, 0, i_54_);
	    }
	} else
	    aClass136_Sub2_Sub1_9118.method14492(i, i_53_, i_54_, i_55_, i_56_,
						 i_57_);
    }
    
    public void method2477(int i, int i_59_, int i_60_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	aClass136_Sub2_Sub1_9116
	    = Class136_Sub2_Sub1.method18032(aClass182_Sub3_9115, i, i_59_,
					     (aClass136_Sub2_Sub1_9118
					      .anInt11435),
					     (aClass136_Sub2_Sub1_9118
					      .anInt11433));
	anInt9121 = i_60_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    public void method2474(int i, int i_61_, int i_62_, int i_63_, int[] is,
			   int i_64_, int i_65_) {
	aClass136_Sub2_Sub1_9118.method14485(i, i_61_, i_62_, i_63_, is, i_64_,
					     i_65_, true);
    }
    
    public void method2499(int i, int i_66_, int i_67_, int i_68_, int i_69_,
			   int i_70_) {
	method14615(i, i_66_, i_67_, i_68_, i_69_, i_70_, false);
    }
    
    public void method2479(int i, int i_71_, int i_72_, int i_73_, int i_74_) {
	aClass136_Sub2_Sub1_9118.method2304(false);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15409(i_74_);
	OpenGL.glColor4ub((byte) (i_73_ >> 16), (byte) (i_73_ >> 8),
			  (byte) i_73_, (byte) (i_73_ >> 24));
	i += anInt9120;
	i_71_ += anInt9119;
	if (aClass136_Sub2_Sub1_9116 == null) {
	    aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	    aClass182_Sub3_9115.method15396(i_72_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_71_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_71_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435,
			      i_71_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435, i_71_);
	    OpenGL.glEnd();
	} else {
	    method14618(i_72_);
	    aClass136_Sub2_Sub1_9116.method2304(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_71_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_71_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435,
			      i_71_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435, i_71_);
	    OpenGL.glEnd();
	    method14616();
	}
    }
    
    void method14616() {
	aClass182_Sub3_9115.method15394(1);
	aClass182_Sub3_9115.method15395(null);
	aClass182_Sub3_9115.method15398(8448, 8448);
	aClass182_Sub3_9115.method15431(1, 34168, 768);
	aClass182_Sub3_9115.method15399(0, 5890, 770);
	aClass182_Sub3_9115.method15394(0);
	aClass182_Sub3_9115.method15431(1, 34168, 768);
    }
    
    public Interface21 method2502() {
	return aClass136_Sub2_Sub1_9118.method14472(0);
    }
    
    void method2508(int i, int i_75_, int i_76_, int i_77_, int i_78_,
		    int i_79_, int i_80_, int i_81_) {
	aClass136_Sub2_Sub1_9118.method2304((i_81_ & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15409(i_80_);
	OpenGL.glColor4ub((byte) (i_79_ >> 16), (byte) (i_79_ >> 8),
			  (byte) i_79_, (byte) (i_79_ >> 24));
	if (aBool9117) {
	    float f = (float) i_76_ / (float) method12();
	    float f_82_ = (float) i_77_ / (float) method2472();
	    float f_83_ = (float) i + (float) anInt9120 * f;
	    float f_84_ = (float) i_75_ + (float) anInt9119 * f_82_;
	    float f_85_
		= f_83_ + (float) aClass136_Sub2_Sub1_9118.anInt11435 * f;
	    float f_86_
		= f_84_ + (float) aClass136_Sub2_Sub1_9118.anInt11433 * f_82_;
	    if (aClass136_Sub2_Sub1_9116 == null) {
		aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
		aClass182_Sub3_9115.method15396(i_78_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_83_, f_84_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_83_, f_86_);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    0.0F);
		OpenGL.glVertex2f(f_85_, f_86_);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_85_, f_84_);
		OpenGL.glEnd();
	    } else {
		method14618(i_78_);
		aClass136_Sub2_Sub1_9116.method2304(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glTexCoord2f(0.0F,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_83_, f_84_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_83_, f_86_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass136_Sub2_Sub1_9118.aFloat11432,
					 0.0F);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    0.0F);
		OpenGL.glVertex2f(f_85_, f_86_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass136_Sub2_Sub1_9118.aFloat11432,
					 aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_85_, f_84_);
		OpenGL.glEnd();
		method14616();
	    }
	} else if (aClass136_Sub2_Sub1_9116 == null) {
	    aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	    aClass182_Sub3_9115.method15396(i_78_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_75_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_75_ + i_77_);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + i_76_, i_75_ + i_77_);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + i_76_, i_75_);
	    OpenGL.glEnd();
	} else {
	    method14618(i_78_);
	    aClass136_Sub2_Sub1_9116.method2304(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_75_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_75_ + i_77_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + i_76_, i_75_ + i_77_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + i_76_, i_75_);
	    OpenGL.glEnd();
	    method14616();
	}
    }
    
    void method2483(int i, int i_87_, int i_88_, int i_89_, int i_90_,
		    int i_91_, int i_92_, int i_93_) {
	aClass136_Sub2_Sub1_9118.method2304((i_93_ & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15409(i_92_);
	OpenGL.glColor4ub((byte) (i_91_ >> 16), (byte) (i_91_ >> 8),
			  (byte) i_91_, (byte) (i_91_ >> 24));
	if (aBool9117) {
	    float f = (float) i_88_ / (float) method12();
	    float f_94_ = (float) i_89_ / (float) method2472();
	    float f_95_ = (float) i + (float) anInt9120 * f;
	    float f_96_ = (float) i_87_ + (float) anInt9119 * f_94_;
	    float f_97_
		= f_95_ + (float) aClass136_Sub2_Sub1_9118.anInt11435 * f;
	    float f_98_
		= f_96_ + (float) aClass136_Sub2_Sub1_9118.anInt11433 * f_94_;
	    if (aClass136_Sub2_Sub1_9116 == null) {
		aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
		aClass182_Sub3_9115.method15396(i_90_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_95_, f_96_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_95_, f_98_);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    0.0F);
		OpenGL.glVertex2f(f_97_, f_98_);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_97_, f_96_);
		OpenGL.glEnd();
	    } else {
		method14618(i_90_);
		aClass136_Sub2_Sub1_9116.method2304(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glTexCoord2f(0.0F,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_95_, f_96_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_95_, f_98_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass136_Sub2_Sub1_9118.aFloat11432,
					 0.0F);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    0.0F);
		OpenGL.glVertex2f(f_97_, f_98_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass136_Sub2_Sub1_9118.aFloat11432,
					 aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_97_, f_96_);
		OpenGL.glEnd();
		method14616();
	    }
	} else if (aClass136_Sub2_Sub1_9116 == null) {
	    aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	    aClass182_Sub3_9115.method15396(i_90_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_87_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_87_ + i_89_);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + i_88_, i_87_ + i_89_);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + i_88_, i_87_);
	    OpenGL.glEnd();
	} else {
	    method14618(i_90_);
	    aClass136_Sub2_Sub1_9116.method2304(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_87_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_87_ + i_89_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + i_88_, i_87_ + i_89_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + i_88_, i_87_);
	    OpenGL.glEnd();
	    method14616();
	}
    }
    
    public void method2485(int i, int i_99_, int i_100_, int i_101_,
			   int i_102_, int i_103_, int i_104_) {
	int i_105_ = i + i_100_;
	int i_106_ = i_99_ + i_101_;
	aClass136_Sub2_Sub1_9118.method2304(false);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15409(i_104_);
	aClass182_Sub3_9115.method15396(i_102_);
	OpenGL.glColor4ub((byte) (i_103_ >> 16), (byte) (i_103_ >> 8),
			  (byte) i_103_, (byte) (i_103_ >> 24));
	if (aClass136_Sub2_Sub1_9118.aBool11436 && !aBool9117
	    && i_101_ >= aClass136_Sub2_Sub1_9118.anInt11433
	    && i_100_ >= aClass136_Sub2_Sub1_9118.anInt11435) {
	    float f = (aClass136_Sub2_Sub1_9118.aFloat11434 * (float) i_101_
		       / (float) aClass136_Sub2_Sub1_9118.anInt11433);
	    float f_107_
		= (aClass136_Sub2_Sub1_9118.aFloat11432 * (float) i_100_
		   / (float) aClass136_Sub2_Sub1_9118.anInt11435);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_99_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_106_);
	    OpenGL.glTexCoord2f(f_107_, 0.0F);
	    OpenGL.glVertex2i(i_105_, i_106_);
	    OpenGL.glTexCoord2f(f_107_, f);
	    OpenGL.glVertex2i(i_105_, i_99_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) anInt9120, (float) anInt9119, 0.0F);
	    int i_108_ = method12();
	    int i_109_ = method2472();
	    int i_110_ = i_99_ + aClass136_Sub2_Sub1_9118.anInt11433;
	    OpenGL.glBegin(7);
	    int i_111_ = i_99_;
	    for (/**/; i_110_ <= i_106_; i_110_ += i_109_) {
		int i_112_ = i + aClass136_Sub2_Sub1_9118.anInt11435;
		int i_113_ = i;
		while (i_112_ <= i_105_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_113_, i_111_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_113_, i_110_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					0.0F);
		    OpenGL.glVertex2i(i_112_, i_110_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_112_, i_111_);
		    i_112_ += i_108_;
		    i_113_ += i_108_;
		}
		if (i_113_ < i_105_) {
		    float f = (aClass136_Sub2_Sub1_9118.aFloat11432
			       * (float) (i_105_ - i_113_)
			       / (float) aClass136_Sub2_Sub1_9118.anInt11435);
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_113_, i_111_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_113_, i_110_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_105_, i_110_);
		    OpenGL.glTexCoord2f(f,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_105_, i_111_);
		}
		i_111_ += i_109_;
	    }
	    if (i_111_ < i_106_) {
		float f = (aClass136_Sub2_Sub1_9118.aFloat11434
			   * (float) (aClass136_Sub2_Sub1_9118.anInt11433
				      - (i_106_ - i_111_))
			   / (float) aClass136_Sub2_Sub1_9118.anInt11433);
		int i_114_ = i + aClass136_Sub2_Sub1_9118.anInt11435;
		int i_115_ = i;
		while (i_114_ <= i_105_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_115_, i_111_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_115_, i_106_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					f);
		    OpenGL.glVertex2i(i_114_, i_106_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_114_, i_111_);
		    i_114_ += i_108_;
		    i_115_ += i_108_;
		}
		if (i_115_ < i_105_) {
		    float f_116_
			= (aClass136_Sub2_Sub1_9118.aFloat11432
			   * (float) (i_105_ - i_115_)
			   / (float) aClass136_Sub2_Sub1_9118.anInt11435);
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_115_, i_111_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_115_, i_106_);
		    OpenGL.glTexCoord2f(f_116_, f);
		    OpenGL.glVertex2i(i_105_, i_106_);
		    OpenGL.glTexCoord2f(f_116_,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_105_, i_111_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    public void method2544(int i, int i_117_, int i_118_, int i_119_,
			   int i_120_, int i_121_, int i_122_) {
	int i_123_ = i + i_118_;
	int i_124_ = i_117_ + i_119_;
	aClass136_Sub2_Sub1_9118.method2304(false);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15409(i_122_);
	aClass182_Sub3_9115.method15396(i_120_);
	OpenGL.glColor4ub((byte) (i_121_ >> 16), (byte) (i_121_ >> 8),
			  (byte) i_121_, (byte) (i_121_ >> 24));
	if (aClass136_Sub2_Sub1_9118.aBool11436 && !aBool9117
	    && i_119_ >= aClass136_Sub2_Sub1_9118.anInt11433
	    && i_118_ >= aClass136_Sub2_Sub1_9118.anInt11435) {
	    float f = (aClass136_Sub2_Sub1_9118.aFloat11434 * (float) i_119_
		       / (float) aClass136_Sub2_Sub1_9118.anInt11433);
	    float f_125_
		= (aClass136_Sub2_Sub1_9118.aFloat11432 * (float) i_118_
		   / (float) aClass136_Sub2_Sub1_9118.anInt11435);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_117_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_124_);
	    OpenGL.glTexCoord2f(f_125_, 0.0F);
	    OpenGL.glVertex2i(i_123_, i_124_);
	    OpenGL.glTexCoord2f(f_125_, f);
	    OpenGL.glVertex2i(i_123_, i_117_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) anInt9120, (float) anInt9119, 0.0F);
	    int i_126_ = method12();
	    int i_127_ = method2472();
	    int i_128_ = i_117_ + aClass136_Sub2_Sub1_9118.anInt11433;
	    OpenGL.glBegin(7);
	    int i_129_ = i_117_;
	    for (/**/; i_128_ <= i_124_; i_128_ += i_127_) {
		int i_130_ = i + aClass136_Sub2_Sub1_9118.anInt11435;
		int i_131_ = i;
		while (i_130_ <= i_123_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_131_, i_129_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_131_, i_128_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					0.0F);
		    OpenGL.glVertex2i(i_130_, i_128_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_130_, i_129_);
		    i_130_ += i_126_;
		    i_131_ += i_126_;
		}
		if (i_131_ < i_123_) {
		    float f = (aClass136_Sub2_Sub1_9118.aFloat11432
			       * (float) (i_123_ - i_131_)
			       / (float) aClass136_Sub2_Sub1_9118.anInt11435);
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_131_, i_129_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_131_, i_128_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_123_, i_128_);
		    OpenGL.glTexCoord2f(f,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_123_, i_129_);
		}
		i_129_ += i_127_;
	    }
	    if (i_129_ < i_124_) {
		float f = (aClass136_Sub2_Sub1_9118.aFloat11434
			   * (float) (aClass136_Sub2_Sub1_9118.anInt11433
				      - (i_124_ - i_129_))
			   / (float) aClass136_Sub2_Sub1_9118.anInt11433);
		int i_132_ = i + aClass136_Sub2_Sub1_9118.anInt11435;
		int i_133_ = i;
		while (i_132_ <= i_123_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_133_, i_129_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_133_, i_124_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					f);
		    OpenGL.glVertex2i(i_132_, i_124_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_132_, i_129_);
		    i_132_ += i_126_;
		    i_133_ += i_126_;
		}
		if (i_133_ < i_123_) {
		    float f_134_
			= (aClass136_Sub2_Sub1_9118.aFloat11432
			   * (float) (i_123_ - i_133_)
			   / (float) aClass136_Sub2_Sub1_9118.anInt11435);
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_133_, i_129_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_133_, i_124_);
		    OpenGL.glTexCoord2f(f_134_, f);
		    OpenGL.glVertex2i(i_123_, i_124_);
		    OpenGL.glTexCoord2f(f_134_,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_123_, i_129_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    void method2495(float f, float f_135_, float f_136_, float f_137_,
		    float f_138_, float f_139_, int i, Class152 class152,
		    int i_140_, int i_141_) {
	Class136_Sub2_Sub1 class136_sub2_sub1
	    = ((Class152_Sub2) class152).aClass136_Sub2_Sub1_9505;
	if (aBool9117) {
	    float f_142_ = (float) method12();
	    float f_143_ = (float) method2472();
	    float f_144_ = (f_136_ - f) / f_142_;
	    float f_145_ = (f_137_ - f_135_) / f_142_;
	    float f_146_ = (f_138_ - f) / f_143_;
	    float f_147_ = (f_139_ - f_135_) / f_143_;
	    float f_148_ = f_146_ * (float) anInt9119;
	    float f_149_ = f_147_ * (float) anInt9119;
	    float f_150_ = f_144_ * (float) anInt9120;
	    float f_151_ = f_145_ * (float) anInt9120;
	    float f_152_ = -f_144_ * (float) anInt9122;
	    float f_153_ = -f_145_ * (float) anInt9122;
	    float f_154_ = -f_146_ * (float) anInt9114;
	    float f_155_ = -f_147_ * (float) anInt9114;
	    f = f + f_150_ + f_148_;
	    f_135_ = f_135_ + f_151_ + f_149_;
	    f_136_ = f_136_ + f_152_ + f_148_;
	    f_137_ = f_137_ + f_153_ + f_149_;
	    f_138_ = f_138_ + f_150_ + f_154_;
	    f_139_ = f_139_ + f_151_ + f_155_;
	}
	float f_156_ = f_138_ + (f_136_ - f);
	float f_157_ = f_137_ + (f_139_ - f_135_);
	aClass136_Sub2_Sub1_9118.method2304((i & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15396(1);
	aClass182_Sub3_9115.method15394(1);
	aClass182_Sub3_9115.method15395(class136_sub2_sub1);
	aClass182_Sub3_9115.method15398(7681, 8448);
	aClass182_Sub3_9115.method15431(0, 34168, 768);
	aClass182_Sub3_9115.method15409(1);
	float f_158_ = (class136_sub2_sub1.aFloat11432
			/ (float) class136_sub2_sub1.anInt11435);
	float f_159_ = (class136_sub2_sub1.aFloat11434
			/ (float) class136_sub2_sub1.anInt11433);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_158_ * (f - (float) i_140_),
				 (class136_sub2_sub1.aFloat11434
				  - f_159_ * (f_135_ - (float) i_141_)));
	OpenGL.glVertex2f(f, f_135_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_158_ * (f_138_ - (float) i_140_),
				 (class136_sub2_sub1.aFloat11434
				  - f_159_ * (f_139_ - (float) i_141_)));
	OpenGL.glVertex2f(f_138_, f_139_);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_158_ * (f_156_ - (float) i_140_),
				 (class136_sub2_sub1.aFloat11434
				  - f_159_ * (f_157_ - (float) i_141_)));
	OpenGL.glVertex2f(f_156_, f_157_);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_158_ * (f_136_ - (float) i_140_),
				 (class136_sub2_sub1.aFloat11434
				  - f_159_ * (f_137_ - (float) i_141_)));
	OpenGL.glVertex2f(f_136_, f_137_);
	OpenGL.glEnd();
	aClass182_Sub3_9115.method15431(0, 5890, 768);
	aClass182_Sub3_9115.method15396(0);
	aClass182_Sub3_9115.method15395(null);
	aClass182_Sub3_9115.method15394(0);
    }
    
    public void method2527(int i, int i_160_, int i_161_, int i_162_, int[] is,
			   int i_163_, int i_164_) {
	aClass136_Sub2_Sub1_9118.method14485(i, i_160_, i_161_, i_162_, is,
					     i_163_, i_164_, true);
    }
    
    public void method2497(int i, int i_165_, int i_166_, int i_167_,
			   int i_168_, int i_169_) {
	method14615(i, i_165_, i_166_, i_167_, i_168_, i_169_, false);
    }
    
    public void method2498(int i, int i_170_, int i_171_, int i_172_,
			   int i_173_, int i_174_) {
	method14615(i, i_170_, i_171_, i_172_, i_173_, i_174_, false);
    }
    
    void method2509(int i, int i_175_, int i_176_, int i_177_, int i_178_,
		    int i_179_, int i_180_, int i_181_) {
	aClass136_Sub2_Sub1_9118.method2304((i_181_ & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15409(i_180_);
	OpenGL.glColor4ub((byte) (i_179_ >> 16), (byte) (i_179_ >> 8),
			  (byte) i_179_, (byte) (i_179_ >> 24));
	if (aBool9117) {
	    float f = (float) i_176_ / (float) method12();
	    float f_182_ = (float) i_177_ / (float) method2472();
	    float f_183_ = (float) i + (float) anInt9120 * f;
	    float f_184_ = (float) i_175_ + (float) anInt9119 * f_182_;
	    float f_185_
		= f_183_ + (float) aClass136_Sub2_Sub1_9118.anInt11435 * f;
	    float f_186_
		= (f_184_
		   + (float) aClass136_Sub2_Sub1_9118.anInt11433 * f_182_);
	    if (aClass136_Sub2_Sub1_9116 == null) {
		aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
		aClass182_Sub3_9115.method15396(i_178_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_183_, f_184_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_183_, f_186_);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    0.0F);
		OpenGL.glVertex2f(f_185_, f_186_);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_185_, f_184_);
		OpenGL.glEnd();
	    } else {
		method14618(i_178_);
		aClass136_Sub2_Sub1_9116.method2304(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glTexCoord2f(0.0F,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_183_, f_184_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_183_, f_186_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass136_Sub2_Sub1_9118.aFloat11432,
					 0.0F);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    0.0F);
		OpenGL.glVertex2f(f_185_, f_186_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass136_Sub2_Sub1_9118.aFloat11432,
					 aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_185_, f_184_);
		OpenGL.glEnd();
		method14616();
	    }
	} else if (aClass136_Sub2_Sub1_9116 == null) {
	    aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	    aClass182_Sub3_9115.method15396(i_178_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_175_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_175_ + i_177_);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + i_176_, i_175_ + i_177_);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + i_176_, i_175_);
	    OpenGL.glEnd();
	} else {
	    method14618(i_178_);
	    aClass136_Sub2_Sub1_9116.method2304(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_175_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_175_ + i_177_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + i_176_, i_175_ + i_177_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + i_176_, i_175_);
	    OpenGL.glEnd();
	    method14616();
	}
    }
    
    public void method2486(int i, int i_187_, int i_188_) {
	OpenGL.glPixelTransferf(3348, 0.5F);
	OpenGL.glPixelTransferf(3349, 0.499F);
	OpenGL.glPixelTransferf(3352, 0.5F);
	OpenGL.glPixelTransferf(3353, 0.499F);
	OpenGL.glPixelTransferf(3354, 0.5F);
	OpenGL.glPixelTransferf(3355, 0.499F);
	aClass136_Sub2_Sub1_9116
	    = Class136_Sub2_Sub1.method18032(aClass182_Sub3_9115, i, i_187_,
					     (aClass136_Sub2_Sub1_9118
					      .anInt11435),
					     (aClass136_Sub2_Sub1_9118
					      .anInt11433));
	anInt9121 = i_188_;
	OpenGL.glPixelTransferf(3348, 1.0F);
	OpenGL.glPixelTransferf(3349, 0.0F);
	OpenGL.glPixelTransferf(3352, 1.0F);
	OpenGL.glPixelTransferf(3353, 0.0F);
	OpenGL.glPixelTransferf(3354, 1.0F);
	OpenGL.glPixelTransferf(3355, 0.0F);
    }
    
    void method2504(float f, float f_189_, float f_190_, float f_191_,
		    float f_192_, float f_193_, int i, int i_194_, int i_195_,
		    int i_196_) {
	if (aBool9117) {
	    float f_197_ = (float) method12();
	    float f_198_ = (float) method2472();
	    float f_199_ = (f_190_ - f) / f_197_;
	    float f_200_ = (f_191_ - f_189_) / f_197_;
	    float f_201_ = (f_192_ - f) / f_198_;
	    float f_202_ = (f_193_ - f_189_) / f_198_;
	    float f_203_ = f_201_ * (float) anInt9119;
	    float f_204_ = f_202_ * (float) anInt9119;
	    float f_205_ = f_199_ * (float) anInt9120;
	    float f_206_ = f_200_ * (float) anInt9120;
	    float f_207_ = -f_199_ * (float) anInt9122;
	    float f_208_ = -f_200_ * (float) anInt9122;
	    float f_209_ = -f_201_ * (float) anInt9114;
	    float f_210_ = -f_202_ * (float) anInt9114;
	    f = f + f_205_ + f_203_;
	    f_189_ = f_189_ + f_206_ + f_204_;
	    f_190_ = f_190_ + f_207_ + f_203_;
	    f_191_ = f_191_ + f_208_ + f_204_;
	    f_192_ = f_192_ + f_205_ + f_209_;
	    f_193_ = f_193_ + f_206_ + f_210_;
	}
	float f_211_ = f_192_ + (f_190_ - f);
	float f_212_ = f_191_ + (f_193_ - f_189_);
	aClass136_Sub2_Sub1_9118.method2304((i_196_ & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15409(i_195_);
	aClass182_Sub3_9115.method15396(i);
	OpenGL.glColor4ub((byte) (i_194_ >> 16), (byte) (i_194_ >> 8),
			  (byte) i_194_, (byte) (i_194_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glVertex2f(f, f_189_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_192_, f_193_);
	OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	OpenGL.glVertex2f(f_211_, f_212_);
	OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
			    aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glVertex2f(f_190_, f_191_);
	OpenGL.glEnd();
    }
    
    public void method2468(int i, int i_213_, int i_214_, int i_215_) {
	anInt9120 = i;
	anInt9119 = i_213_;
	anInt9122 = i_214_;
	anInt9114 = i_215_;
	aBool9117 = (anInt9120 != 0 || anInt9119 != 0 || anInt9122 != 0
		     || anInt9114 != 0);
    }
    
    public Interface21 method2507() {
	return aClass136_Sub2_Sub1_9118.method14472(0);
    }
    
    public void method2467(int i, int i_216_, int i_217_, int i_218_,
			   int i_219_) {
	aClass136_Sub2_Sub1_9118.method2304(false);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15409(i_219_);
	OpenGL.glColor4ub((byte) (i_218_ >> 16), (byte) (i_218_ >> 8),
			  (byte) i_218_, (byte) (i_218_ >> 24));
	i += anInt9120;
	i_216_ += anInt9119;
	if (aClass136_Sub2_Sub1_9116 == null) {
	    aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	    aClass182_Sub3_9115.method15396(i_217_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_216_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_216_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435,
			      i_216_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435, i_216_);
	    OpenGL.glEnd();
	} else {
	    method14618(i_217_);
	    aClass136_Sub2_Sub1_9116.method2304(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_216_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_216_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435,
			      i_216_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435, i_216_);
	    OpenGL.glEnd();
	    method14616();
	}
    }
    
    public void method2505(int i, int i_220_, int i_221_, int i_222_,
			   int i_223_) {
	aClass136_Sub2_Sub1_9118.method2304(false);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15409(i_223_);
	OpenGL.glColor4ub((byte) (i_222_ >> 16), (byte) (i_222_ >> 8),
			  (byte) i_222_, (byte) (i_222_ >> 24));
	i += anInt9120;
	i_220_ += anInt9119;
	if (aClass136_Sub2_Sub1_9116 == null) {
	    aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	    aClass182_Sub3_9115.method15396(i_221_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_220_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_220_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435,
			      i_220_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435, i_220_);
	    OpenGL.glEnd();
	} else {
	    method14618(i_221_);
	    aClass136_Sub2_Sub1_9116.method2304(false);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_220_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_220_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435,
			      i_220_ + aClass136_Sub2_Sub1_9118.anInt11433);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435, i_220_);
	    OpenGL.glEnd();
	    method14616();
	}
    }
    
    void method14617(int i, int i_224_, int i_225_, int i_226_, int i_227_,
		     int i_228_, boolean bool) {
	if (aClass182_Sub3_9115.aBool9793 && !bool) {
	    int[] is = aClass182_Sub3_9115.method3165(i_227_, i_228_, i_225_,
						      i_226_);
	    if (is != null) {
		for (int i_229_ = 0; i_229_ < is.length; i_229_++)
		    is[i_229_] |= ~0xffffff;
		method2474(i, i_224_, i_225_, i_226_, is, 0, i_225_);
	    }
	} else
	    aClass136_Sub2_Sub1_9118.method14492(i, i_224_, i_225_, i_226_,
						 i_227_, i_228_);
    }
    
    void method2470(int i, int i_230_, int i_231_, int i_232_, int i_233_,
		    int i_234_, int i_235_, int i_236_) {
	aClass136_Sub2_Sub1_9118.method2304((i_236_ & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15409(i_235_);
	OpenGL.glColor4ub((byte) (i_234_ >> 16), (byte) (i_234_ >> 8),
			  (byte) i_234_, (byte) (i_234_ >> 24));
	if (aBool9117) {
	    float f = (float) i_231_ / (float) method12();
	    float f_237_ = (float) i_232_ / (float) method2472();
	    float f_238_ = (float) i + (float) anInt9120 * f;
	    float f_239_ = (float) i_230_ + (float) anInt9119 * f_237_;
	    float f_240_
		= f_238_ + (float) aClass136_Sub2_Sub1_9118.anInt11435 * f;
	    float f_241_
		= (f_239_
		   + (float) aClass136_Sub2_Sub1_9118.anInt11433 * f_237_);
	    if (aClass136_Sub2_Sub1_9116 == null) {
		aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
		aClass182_Sub3_9115.method15396(i_233_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_238_, f_239_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_238_, f_241_);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    0.0F);
		OpenGL.glVertex2f(f_240_, f_241_);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_240_, f_239_);
		OpenGL.glEnd();
	    } else {
		method14618(i_233_);
		aClass136_Sub2_Sub1_9116.method2304(true);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F,
					 aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glTexCoord2f(0.0F,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_238_, f_239_);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_238_, f_241_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass136_Sub2_Sub1_9118.aFloat11432,
					 0.0F);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    0.0F);
		OpenGL.glVertex2f(f_240_, f_241_);
		OpenGL.glMultiTexCoord2f(33985,
					 aClass136_Sub2_Sub1_9118.aFloat11432,
					 aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				    aClass136_Sub2_Sub1_9118.aFloat11434);
		OpenGL.glVertex2f(f_240_, f_239_);
		OpenGL.glEnd();
		method14616();
	    }
	} else if (aClass136_Sub2_Sub1_9116 == null) {
	    aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	    aClass182_Sub3_9115.method15396(i_233_);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_230_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_230_ + i_232_);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + i_231_, i_230_ + i_232_);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + i_231_, i_230_);
	    OpenGL.glEnd();
	} else {
	    method14618(i_233_);
	    aClass136_Sub2_Sub1_9116.method2304(true);
	    OpenGL.glBegin(7);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i, i_230_);
	    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_230_ + i_232_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     0.0F);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	    OpenGL.glVertex2i(i + i_231_, i_230_ + i_232_);
	    OpenGL.glMultiTexCoord2f(33985,
				     aClass136_Sub2_Sub1_9118.aFloat11432,
				     aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
				aClass136_Sub2_Sub1_9118.aFloat11434);
	    OpenGL.glVertex2i(i + i_231_, i_230_);
	    OpenGL.glEnd();
	    method14616();
	}
    }
    
    public int method2472() {
	return aClass136_Sub2_Sub1_9118.anInt11433 + anInt9119 + anInt9114;
    }
    
    void method2528(float f, float f_242_, float f_243_, float f_244_,
		    float f_245_, float f_246_, int i, Class152 class152,
		    int i_247_, int i_248_) {
	Class136_Sub2_Sub1 class136_sub2_sub1
	    = ((Class152_Sub2) class152).aClass136_Sub2_Sub1_9505;
	if (aBool9117) {
	    float f_249_ = (float) method12();
	    float f_250_ = (float) method2472();
	    float f_251_ = (f_243_ - f) / f_249_;
	    float f_252_ = (f_244_ - f_242_) / f_249_;
	    float f_253_ = (f_245_ - f) / f_250_;
	    float f_254_ = (f_246_ - f_242_) / f_250_;
	    float f_255_ = f_253_ * (float) anInt9119;
	    float f_256_ = f_254_ * (float) anInt9119;
	    float f_257_ = f_251_ * (float) anInt9120;
	    float f_258_ = f_252_ * (float) anInt9120;
	    float f_259_ = -f_251_ * (float) anInt9122;
	    float f_260_ = -f_252_ * (float) anInt9122;
	    float f_261_ = -f_253_ * (float) anInt9114;
	    float f_262_ = -f_254_ * (float) anInt9114;
	    f = f + f_257_ + f_255_;
	    f_242_ = f_242_ + f_258_ + f_256_;
	    f_243_ = f_243_ + f_259_ + f_255_;
	    f_244_ = f_244_ + f_260_ + f_256_;
	    f_245_ = f_245_ + f_257_ + f_261_;
	    f_246_ = f_246_ + f_258_ + f_262_;
	}
	float f_263_ = f_245_ + (f_243_ - f);
	float f_264_ = f_244_ + (f_246_ - f_242_);
	aClass136_Sub2_Sub1_9118.method2304((i & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15396(1);
	aClass182_Sub3_9115.method15394(1);
	aClass182_Sub3_9115.method15395(class136_sub2_sub1);
	aClass182_Sub3_9115.method15398(7681, 8448);
	aClass182_Sub3_9115.method15431(0, 34168, 768);
	aClass182_Sub3_9115.method15409(1);
	float f_265_ = (class136_sub2_sub1.aFloat11432
			/ (float) class136_sub2_sub1.anInt11435);
	float f_266_ = (class136_sub2_sub1.aFloat11434
			/ (float) class136_sub2_sub1.anInt11433);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_265_ * (f - (float) i_247_),
				 (class136_sub2_sub1.aFloat11434
				  - f_266_ * (f_242_ - (float) i_248_)));
	OpenGL.glVertex2f(f, f_242_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_265_ * (f_245_ - (float) i_247_),
				 (class136_sub2_sub1.aFloat11434
				  - f_266_ * (f_246_ - (float) i_248_)));
	OpenGL.glVertex2f(f_245_, f_246_);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_265_ * (f_263_ - (float) i_247_),
				 (class136_sub2_sub1.aFloat11434
				  - f_266_ * (f_264_ - (float) i_248_)));
	OpenGL.glVertex2f(f_263_, f_264_);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_265_ * (f_243_ - (float) i_247_),
				 (class136_sub2_sub1.aFloat11434
				  - f_266_ * (f_244_ - (float) i_248_)));
	OpenGL.glVertex2f(f_243_, f_244_);
	OpenGL.glEnd();
	aClass182_Sub3_9115.method15431(0, 5890, 768);
	aClass182_Sub3_9115.method15396(0);
	aClass182_Sub3_9115.method15395(null);
	aClass182_Sub3_9115.method15394(0);
    }
    
    public void method2510(int i, int i_267_, int i_268_, int i_269_, int[] is,
			   int[] is_270_, int i_271_, int i_272_) {
	aClass136_Sub2_Sub1_9118.method14476(i, i_267_, i_268_, i_269_, is,
					     is_270_, i_271_);
    }
    
    public int method2471() {
	return aClass136_Sub2_Sub1_9118.anInt11433;
    }
    
    void method2484(float f, float f_273_, float f_274_, float f_275_,
		    float f_276_, float f_277_, int i, Class152 class152,
		    int i_278_, int i_279_) {
	Class136_Sub2_Sub1 class136_sub2_sub1
	    = ((Class152_Sub2) class152).aClass136_Sub2_Sub1_9505;
	if (aBool9117) {
	    float f_280_ = (float) method12();
	    float f_281_ = (float) method2472();
	    float f_282_ = (f_274_ - f) / f_280_;
	    float f_283_ = (f_275_ - f_273_) / f_280_;
	    float f_284_ = (f_276_ - f) / f_281_;
	    float f_285_ = (f_277_ - f_273_) / f_281_;
	    float f_286_ = f_284_ * (float) anInt9119;
	    float f_287_ = f_285_ * (float) anInt9119;
	    float f_288_ = f_282_ * (float) anInt9120;
	    float f_289_ = f_283_ * (float) anInt9120;
	    float f_290_ = -f_282_ * (float) anInt9122;
	    float f_291_ = -f_283_ * (float) anInt9122;
	    float f_292_ = -f_284_ * (float) anInt9114;
	    float f_293_ = -f_285_ * (float) anInt9114;
	    f = f + f_288_ + f_286_;
	    f_273_ = f_273_ + f_289_ + f_287_;
	    f_274_ = f_274_ + f_290_ + f_286_;
	    f_275_ = f_275_ + f_291_ + f_287_;
	    f_276_ = f_276_ + f_288_ + f_292_;
	    f_277_ = f_277_ + f_289_ + f_293_;
	}
	float f_294_ = f_276_ + (f_274_ - f);
	float f_295_ = f_275_ + (f_277_ - f_273_);
	aClass136_Sub2_Sub1_9118.method2304((i & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15396(1);
	aClass182_Sub3_9115.method15394(1);
	aClass182_Sub3_9115.method15395(class136_sub2_sub1);
	aClass182_Sub3_9115.method15398(7681, 8448);
	aClass182_Sub3_9115.method15431(0, 34168, 768);
	aClass182_Sub3_9115.method15409(1);
	float f_296_ = (class136_sub2_sub1.aFloat11432
			/ (float) class136_sub2_sub1.anInt11435);
	float f_297_ = (class136_sub2_sub1.aFloat11434
			/ (float) class136_sub2_sub1.anInt11433);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_296_ * (f - (float) i_278_),
				 (class136_sub2_sub1.aFloat11434
				  - f_297_ * (f_273_ - (float) i_279_)));
	OpenGL.glVertex2f(f, f_273_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_296_ * (f_276_ - (float) i_278_),
				 (class136_sub2_sub1.aFloat11434
				  - f_297_ * (f_277_ - (float) i_279_)));
	OpenGL.glVertex2f(f_276_, f_277_);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_296_ * (f_294_ - (float) i_278_),
				 (class136_sub2_sub1.aFloat11434
				  - f_297_ * (f_295_ - (float) i_279_)));
	OpenGL.glVertex2f(f_294_, f_295_);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_296_ * (f_274_ - (float) i_278_),
				 (class136_sub2_sub1.aFloat11434
				  - f_297_ * (f_275_ - (float) i_279_)));
	OpenGL.glVertex2f(f_274_, f_275_);
	OpenGL.glEnd();
	aClass182_Sub3_9115.method15431(0, 5890, 768);
	aClass182_Sub3_9115.method15396(0);
	aClass182_Sub3_9115.method15395(null);
	aClass182_Sub3_9115.method15394(0);
    }
    
    public void method2513(int i, int i_298_, Class152 class152, int i_299_,
			   int i_300_) {
	Class152_Sub2 class152_sub2 = (Class152_Sub2) class152;
	Class136_Sub2_Sub1 class136_sub2_sub1
	    = class152_sub2.aClass136_Sub2_Sub1_9505;
	aClass136_Sub2_Sub1_9118.method2304(false);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15396(1);
	aClass182_Sub3_9115.method15394(1);
	aClass182_Sub3_9115.method15395(class136_sub2_sub1);
	aClass182_Sub3_9115.method15398(7681, 8448);
	aClass182_Sub3_9115.method15431(0, 34168, 768);
	aClass182_Sub3_9115.method15409(1);
	i += anInt9120;
	i_298_ += anInt9119;
	int i_301_ = i + aClass136_Sub2_Sub1_9118.anInt11435;
	int i_302_ = i_298_ + aClass136_Sub2_Sub1_9118.anInt11433;
	float f = (class136_sub2_sub1.aFloat11432
		   / (float) class136_sub2_sub1.anInt11435);
	float f_303_ = (class136_sub2_sub1.aFloat11434
			/ (float) class136_sub2_sub1.anInt11433);
	float f_304_ = (float) (i - i_299_) * f;
	float f_305_ = (float) (i_301_ - i_299_) * f;
	float f_306_ = (class136_sub2_sub1.aFloat11434
			- (float) (i_298_ - i_300_) * f_303_);
	float f_307_ = (class136_sub2_sub1.aFloat11434
			- (float) (i_302_ - i_300_) * f_303_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_304_, f_306_);
	OpenGL.glVertex2i(i, i_298_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_304_, f_307_);
	OpenGL.glVertex2i(i, i_298_ + aClass136_Sub2_Sub1_9118.anInt11433);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_305_, f_307_);
	OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435,
			  i_298_ + aClass136_Sub2_Sub1_9118.anInt11433);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_305_, f_306_);
	OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435, i_298_);
	OpenGL.glEnd();
	aClass182_Sub3_9115.method15431(0, 5890, 768);
	aClass182_Sub3_9115.method15396(0);
	aClass182_Sub3_9115.method15395(null);
	aClass182_Sub3_9115.method15394(0);
    }
    
    void method14618(int i) {
	aClass182_Sub3_9115.method15394(1);
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15398(aClass182_Sub3_9115.method15454(i),
					7681);
	aClass182_Sub3_9115.method15431(1, 34167, 768);
	aClass182_Sub3_9115.method15399(0, 34168, 770);
	aClass182_Sub3_9115.method15394(0);
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9116);
	aClass182_Sub3_9115.method15398(34479, 7681);
	aClass182_Sub3_9115.method15431(1, 34166, 768);
	if (anInt9121 == 0)
	    aClass182_Sub3_9115.method15482(1.0F, 0.5F, 0.5F, 0.0F);
	else if (anInt9121 == 1)
	    aClass182_Sub3_9115.method15482(0.5F, 1.0F, 0.5F, 0.0F);
	else if (anInt9121 == 2)
	    aClass182_Sub3_9115.method15482(0.5F, 0.5F, 1.0F, 0.0F);
	else if (anInt9121 == 3)
	    aClass182_Sub3_9115.method15482(128.5F, 128.5F, 128.5F, 0.0F);
    }
    
    public void method2475(int i, int i_308_, int i_309_, int i_310_, int[] is,
			   int[] is_311_, int i_312_, int i_313_) {
	aClass136_Sub2_Sub1_9118.method14476(i, i_308_, i_309_, i_310_, is,
					     is_311_, i_312_);
    }
    
    public void method2516(int i, int i_314_, int i_315_, int i_316_) {
	anInt9120 = i;
	anInt9119 = i_314_;
	anInt9122 = i_315_;
	anInt9114 = i_316_;
	aBool9117 = (anInt9120 != 0 || anInt9119 != 0 || anInt9122 != 0
		     || anInt9114 != 0);
    }
    
    public int method2529() {
	return aClass136_Sub2_Sub1_9118.anInt11433;
    }
    
    public void method2541(int[] is) {
	is[0] = anInt9120;
	is[1] = anInt9119;
	is[2] = anInt9122;
	is[3] = anInt9114;
    }
    
    public int method2519() {
	return aClass136_Sub2_Sub1_9118.anInt11435;
    }
    
    public int method2520() {
	return aClass136_Sub2_Sub1_9118.anInt11435;
    }
    
    public int method11() {
	return aClass136_Sub2_Sub1_9118.anInt11435 + anInt9120 + anInt9122;
    }
    
    public int method12() {
	return aClass136_Sub2_Sub1_9118.anInt11435 + anInt9120 + anInt9122;
    }
    
    public void method2511(int i, int i_317_, int i_318_, int i_319_,
			   int i_320_, int i_321_, int i_322_) {
	int i_323_ = i + i_318_;
	int i_324_ = i_317_ + i_319_;
	aClass136_Sub2_Sub1_9118.method2304(false);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15409(i_322_);
	aClass182_Sub3_9115.method15396(i_320_);
	OpenGL.glColor4ub((byte) (i_321_ >> 16), (byte) (i_321_ >> 8),
			  (byte) i_321_, (byte) (i_321_ >> 24));
	if (aClass136_Sub2_Sub1_9118.aBool11436 && !aBool9117
	    && i_319_ >= aClass136_Sub2_Sub1_9118.anInt11433
	    && i_318_ >= aClass136_Sub2_Sub1_9118.anInt11435) {
	    float f = (aClass136_Sub2_Sub1_9118.aFloat11434 * (float) i_319_
		       / (float) aClass136_Sub2_Sub1_9118.anInt11433);
	    float f_325_
		= (aClass136_Sub2_Sub1_9118.aFloat11432 * (float) i_318_
		   / (float) aClass136_Sub2_Sub1_9118.anInt11435);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, f);
	    OpenGL.glVertex2i(i, i_317_);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(i, i_324_);
	    OpenGL.glTexCoord2f(f_325_, 0.0F);
	    OpenGL.glVertex2i(i_323_, i_324_);
	    OpenGL.glTexCoord2f(f_325_, f);
	    OpenGL.glVertex2i(i_323_, i_317_);
	    OpenGL.glEnd();
	} else {
	    OpenGL.glPushMatrix();
	    OpenGL.glTranslatef((float) anInt9120, (float) anInt9119, 0.0F);
	    int i_326_ = method12();
	    int i_327_ = method2472();
	    int i_328_ = i_317_ + aClass136_Sub2_Sub1_9118.anInt11433;
	    OpenGL.glBegin(7);
	    int i_329_ = i_317_;
	    for (/**/; i_328_ <= i_324_; i_328_ += i_327_) {
		int i_330_ = i + aClass136_Sub2_Sub1_9118.anInt11435;
		int i_331_ = i;
		while (i_330_ <= i_323_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_331_, i_329_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_331_, i_328_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					0.0F);
		    OpenGL.glVertex2i(i_330_, i_328_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_330_, i_329_);
		    i_330_ += i_326_;
		    i_331_ += i_326_;
		}
		if (i_331_ < i_323_) {
		    float f = (aClass136_Sub2_Sub1_9118.aFloat11432
			       * (float) (i_323_ - i_331_)
			       / (float) aClass136_Sub2_Sub1_9118.anInt11435);
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_331_, i_329_);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(i_331_, i_328_);
		    OpenGL.glTexCoord2f(f, 0.0F);
		    OpenGL.glVertex2i(i_323_, i_328_);
		    OpenGL.glTexCoord2f(f,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_323_, i_329_);
		}
		i_329_ += i_327_;
	    }
	    if (i_329_ < i_324_) {
		float f = (aClass136_Sub2_Sub1_9118.aFloat11434
			   * (float) (aClass136_Sub2_Sub1_9118.anInt11433
				      - (i_324_ - i_329_))
			   / (float) aClass136_Sub2_Sub1_9118.anInt11433);
		int i_332_ = i + aClass136_Sub2_Sub1_9118.anInt11435;
		int i_333_ = i;
		while (i_332_ <= i_323_) {
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_333_, i_329_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_333_, i_324_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					f);
		    OpenGL.glVertex2i(i_332_, i_324_);
		    OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_332_, i_329_);
		    i_332_ += i_326_;
		    i_333_ += i_326_;
		}
		if (i_333_ < i_323_) {
		    float f_334_
			= (aClass136_Sub2_Sub1_9118.aFloat11432
			   * (float) (i_323_ - i_333_)
			   / (float) aClass136_Sub2_Sub1_9118.anInt11435);
		    OpenGL.glTexCoord2f(0.0F,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_333_, i_329_);
		    OpenGL.glTexCoord2f(0.0F, f);
		    OpenGL.glVertex2i(i_333_, i_324_);
		    OpenGL.glTexCoord2f(f_334_, f);
		    OpenGL.glVertex2i(i_323_, i_324_);
		    OpenGL.glTexCoord2f(f_334_,
					aClass136_Sub2_Sub1_9118.aFloat11434);
		    OpenGL.glVertex2i(i_323_, i_329_);
		}
	    }
	    OpenGL.glEnd();
	    OpenGL.glPopMatrix();
	}
    }
    
    Class157_Sub2(Class182_Sub3 class182_sub3, int i, int i_335_,
		  boolean bool) {
	aBool9117 = false;
	anInt9119 = 0;
	anInt9120 = 0;
	anInt9114 = 0;
	anInt9122 = 0;
	aClass182_Sub3_9115 = class182_sub3;
	aClass136_Sub2_Sub1_9118
	    = Class136_Sub2_Sub1.method18040(class182_sub3,
					     (bool ? Class165.aClass165_1771
					      : Class165.aClass165_1775),
					     Class178.aClass178_1905, i,
					     i_335_);
    }
    
    void method2524(float f, float f_336_, float f_337_, float f_338_,
		    float f_339_, float f_340_, int i, int i_341_, int i_342_,
		    int i_343_) {
	if (aBool9117) {
	    float f_344_ = (float) method12();
	    float f_345_ = (float) method2472();
	    float f_346_ = (f_337_ - f) / f_344_;
	    float f_347_ = (f_338_ - f_336_) / f_344_;
	    float f_348_ = (f_339_ - f) / f_345_;
	    float f_349_ = (f_340_ - f_336_) / f_345_;
	    float f_350_ = f_348_ * (float) anInt9119;
	    float f_351_ = f_349_ * (float) anInt9119;
	    float f_352_ = f_346_ * (float) anInt9120;
	    float f_353_ = f_347_ * (float) anInt9120;
	    float f_354_ = -f_346_ * (float) anInt9122;
	    float f_355_ = -f_347_ * (float) anInt9122;
	    float f_356_ = -f_348_ * (float) anInt9114;
	    float f_357_ = -f_349_ * (float) anInt9114;
	    f = f + f_352_ + f_350_;
	    f_336_ = f_336_ + f_353_ + f_351_;
	    f_337_ = f_337_ + f_354_ + f_350_;
	    f_338_ = f_338_ + f_355_ + f_351_;
	    f_339_ = f_339_ + f_352_ + f_356_;
	    f_340_ = f_340_ + f_353_ + f_357_;
	}
	float f_358_ = f_339_ + (f_337_ - f);
	float f_359_ = f_338_ + (f_340_ - f_336_);
	aClass136_Sub2_Sub1_9118.method2304((i_343_ & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15409(i_342_);
	aClass182_Sub3_9115.method15396(i);
	OpenGL.glColor4ub((byte) (i_341_ >> 16), (byte) (i_341_ >> 8),
			  (byte) i_341_, (byte) (i_341_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glVertex2f(f, f_336_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_339_, f_340_);
	OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	OpenGL.glVertex2f(f_358_, f_359_);
	OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
			    aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glVertex2f(f_337_, f_338_);
	OpenGL.glEnd();
    }
    
    void method2550(float f, float f_360_, float f_361_, float f_362_,
		    float f_363_, float f_364_, int i, int i_365_, int i_366_,
		    int i_367_) {
	if (aBool9117) {
	    float f_368_ = (float) method12();
	    float f_369_ = (float) method2472();
	    float f_370_ = (f_361_ - f) / f_368_;
	    float f_371_ = (f_362_ - f_360_) / f_368_;
	    float f_372_ = (f_363_ - f) / f_369_;
	    float f_373_ = (f_364_ - f_360_) / f_369_;
	    float f_374_ = f_372_ * (float) anInt9119;
	    float f_375_ = f_373_ * (float) anInt9119;
	    float f_376_ = f_370_ * (float) anInt9120;
	    float f_377_ = f_371_ * (float) anInt9120;
	    float f_378_ = -f_370_ * (float) anInt9122;
	    float f_379_ = -f_371_ * (float) anInt9122;
	    float f_380_ = -f_372_ * (float) anInt9114;
	    float f_381_ = -f_373_ * (float) anInt9114;
	    f = f + f_376_ + f_374_;
	    f_360_ = f_360_ + f_377_ + f_375_;
	    f_361_ = f_361_ + f_378_ + f_374_;
	    f_362_ = f_362_ + f_379_ + f_375_;
	    f_363_ = f_363_ + f_376_ + f_380_;
	    f_364_ = f_364_ + f_377_ + f_381_;
	}
	float f_382_ = f_363_ + (f_361_ - f);
	float f_383_ = f_362_ + (f_364_ - f_360_);
	aClass136_Sub2_Sub1_9118.method2304((i_367_ & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15409(i_366_);
	aClass182_Sub3_9115.method15396(i);
	OpenGL.glColor4ub((byte) (i_365_ >> 16), (byte) (i_365_ >> 8),
			  (byte) i_365_, (byte) (i_365_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glVertex2f(f, f_360_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_363_, f_364_);
	OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	OpenGL.glVertex2f(f_382_, f_383_);
	OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
			    aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glVertex2f(f_361_, f_362_);
	OpenGL.glEnd();
    }
    
    void method2476(float f, float f_384_, float f_385_, float f_386_,
		    float f_387_, float f_388_, int i, int i_389_, int i_390_,
		    int i_391_) {
	if (aBool9117) {
	    float f_392_ = (float) method12();
	    float f_393_ = (float) method2472();
	    float f_394_ = (f_385_ - f) / f_392_;
	    float f_395_ = (f_386_ - f_384_) / f_392_;
	    float f_396_ = (f_387_ - f) / f_393_;
	    float f_397_ = (f_388_ - f_384_) / f_393_;
	    float f_398_ = f_396_ * (float) anInt9119;
	    float f_399_ = f_397_ * (float) anInt9119;
	    float f_400_ = f_394_ * (float) anInt9120;
	    float f_401_ = f_395_ * (float) anInt9120;
	    float f_402_ = -f_394_ * (float) anInt9122;
	    float f_403_ = -f_395_ * (float) anInt9122;
	    float f_404_ = -f_396_ * (float) anInt9114;
	    float f_405_ = -f_397_ * (float) anInt9114;
	    f = f + f_400_ + f_398_;
	    f_384_ = f_384_ + f_401_ + f_399_;
	    f_385_ = f_385_ + f_402_ + f_398_;
	    f_386_ = f_386_ + f_403_ + f_399_;
	    f_387_ = f_387_ + f_400_ + f_404_;
	    f_388_ = f_388_ + f_401_ + f_405_;
	}
	float f_406_ = f_387_ + (f_385_ - f);
	float f_407_ = f_386_ + (f_388_ - f_384_);
	aClass136_Sub2_Sub1_9118.method2304((i_391_ & 0x1) != 0);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15409(i_390_);
	aClass182_Sub3_9115.method15396(i);
	OpenGL.glColor4ub((byte) (i_389_ >> 16), (byte) (i_389_ >> 8),
			  (byte) i_389_, (byte) (i_389_ >> 24));
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glVertex2f(f, f_384_);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2f(f_387_, f_388_);
	OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432, 0.0F);
	OpenGL.glVertex2f(f_406_, f_407_);
	OpenGL.glTexCoord2f(aClass136_Sub2_Sub1_9118.aFloat11432,
			    aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glVertex2f(f_385_, f_386_);
	OpenGL.glEnd();
    }
    
    public void method2549(int i, int i_408_, Class152 class152, int i_409_,
			   int i_410_) {
	Class152_Sub2 class152_sub2 = (Class152_Sub2) class152;
	Class136_Sub2_Sub1 class136_sub2_sub1
	    = class152_sub2.aClass136_Sub2_Sub1_9505;
	aClass136_Sub2_Sub1_9118.method2304(false);
	aClass182_Sub3_9115.method15388();
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15396(1);
	aClass182_Sub3_9115.method15394(1);
	aClass182_Sub3_9115.method15395(class136_sub2_sub1);
	aClass182_Sub3_9115.method15398(7681, 8448);
	aClass182_Sub3_9115.method15431(0, 34168, 768);
	aClass182_Sub3_9115.method15409(1);
	i += anInt9120;
	i_408_ += anInt9119;
	int i_411_ = i + aClass136_Sub2_Sub1_9118.anInt11435;
	int i_412_ = i_408_ + aClass136_Sub2_Sub1_9118.anInt11433;
	float f = (class136_sub2_sub1.aFloat11432
		   / (float) class136_sub2_sub1.anInt11435);
	float f_413_ = (class136_sub2_sub1.aFloat11434
			/ (float) class136_sub2_sub1.anInt11433);
	float f_414_ = (float) (i - i_409_) * f;
	float f_415_ = (float) (i_411_ - i_409_) * f;
	float f_416_ = (class136_sub2_sub1.aFloat11434
			- (float) (i_408_ - i_410_) * f_413_);
	float f_417_ = (class136_sub2_sub1.aFloat11434
			- (float) (i_412_ - i_410_) * f_413_);
	OpenGL.glBegin(7);
	OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
	OpenGL.glMultiTexCoord2f(33984, 0.0F,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_414_, f_416_);
	OpenGL.glVertex2i(i, i_408_);
	OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_414_, f_417_);
	OpenGL.glVertex2i(i, i_408_ + aClass136_Sub2_Sub1_9118.anInt11433);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 0.0F);
	OpenGL.glMultiTexCoord2f(33985, f_415_, f_417_);
	OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435,
			  i_408_ + aClass136_Sub2_Sub1_9118.anInt11433);
	OpenGL.glMultiTexCoord2f(33984, aClass136_Sub2_Sub1_9118.aFloat11432,
				 aClass136_Sub2_Sub1_9118.aFloat11434);
	OpenGL.glMultiTexCoord2f(33985, f_415_, f_416_);
	OpenGL.glVertex2i(i + aClass136_Sub2_Sub1_9118.anInt11435, i_408_);
	OpenGL.glEnd();
	aClass182_Sub3_9115.method15431(0, 5890, 768);
	aClass182_Sub3_9115.method15396(0);
	aClass182_Sub3_9115.method15395(null);
	aClass182_Sub3_9115.method15394(0);
    }
    
    public void method2540(int i, int i_418_, int i_419_, int i_420_,
			   int i_421_, int i_422_) {
	method14615(i, i_418_, i_419_, i_420_, i_421_, i_422_, false);
    }
    
    public void method2514(int i, int i_423_, int i_424_, int i_425_, int[] is,
			   int[] is_426_, int i_427_, int i_428_) {
	aClass136_Sub2_Sub1_9118.method14476(i, i_423_, i_424_, i_425_, is,
					     is_426_, i_427_);
    }
    
    public int method2530() {
	return aClass136_Sub2_Sub1_9118.anInt11433 + anInt9119 + anInt9114;
    }
    
    public int method2531() {
	return aClass136_Sub2_Sub1_9118.anInt11433 + anInt9119 + anInt9114;
    }
    
    Class157_Sub2(Class182_Sub3 class182_sub3, int i, int i_429_, int i_430_,
		  int i_431_) {
	aBool9117 = false;
	anInt9119 = 0;
	anInt9120 = 0;
	anInt9114 = 0;
	anInt9122 = 0;
	aClass182_Sub3_9115 = class182_sub3;
	aClass136_Sub2_Sub1_9118
	    = Class136_Sub2_Sub1.method18032(class182_sub3, i, i_429_, i_430_,
					     i_431_);
    }
    
    void method14619(int i, int i_432_, int i_433_, int i_434_, int i_435_,
		     int i_436_, boolean bool) {
	if (aClass182_Sub3_9115.aBool9793 && !bool) {
	    int[] is = aClass182_Sub3_9115.method3165(i_435_, i_436_, i_433_,
						      i_434_);
	    if (is != null) {
		for (int i_437_ = 0; i_437_ < is.length; i_437_++)
		    is[i_437_] |= ~0xffffff;
		method2474(i, i_432_, i_433_, i_434_, is, 0, i_433_);
	    }
	} else
	    aClass136_Sub2_Sub1_9118.method14492(i, i_432_, i_433_, i_434_,
						 i_435_, i_436_);
    }
    
    void method14620(int i) {
	aClass182_Sub3_9115.method15394(1);
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9118);
	aClass182_Sub3_9115.method15398(aClass182_Sub3_9115.method15454(i),
					7681);
	aClass182_Sub3_9115.method15431(1, 34167, 768);
	aClass182_Sub3_9115.method15399(0, 34168, 770);
	aClass182_Sub3_9115.method15394(0);
	aClass182_Sub3_9115.method15395(aClass136_Sub2_Sub1_9116);
	aClass182_Sub3_9115.method15398(34479, 7681);
	aClass182_Sub3_9115.method15431(1, 34166, 768);
	if (anInt9121 == 0)
	    aClass182_Sub3_9115.method15482(1.0F, 0.5F, 0.5F, 0.0F);
	else if (anInt9121 == 1)
	    aClass182_Sub3_9115.method15482(0.5F, 1.0F, 0.5F, 0.0F);
	else if (anInt9121 == 2)
	    aClass182_Sub3_9115.method15482(0.5F, 0.5F, 1.0F, 0.0F);
	else if (anInt9121 == 3)
	    aClass182_Sub3_9115.method15482(128.5F, 128.5F, 128.5F, 0.0F);
    }
    
    void method14621() {
	aClass182_Sub3_9115.method15394(1);
	aClass182_Sub3_9115.method15395(null);
	aClass182_Sub3_9115.method15398(8448, 8448);
	aClass182_Sub3_9115.method15431(1, 34168, 768);
	aClass182_Sub3_9115.method15399(0, 5890, 770);
	aClass182_Sub3_9115.method15394(0);
	aClass182_Sub3_9115.method15431(1, 34168, 768);
    }
    
    void method14622() {
	aClass182_Sub3_9115.method15394(1);
	aClass182_Sub3_9115.method15395(null);
	aClass182_Sub3_9115.method15398(8448, 8448);
	aClass182_Sub3_9115.method15431(1, 34168, 768);
	aClass182_Sub3_9115.method15399(0, 5890, 770);
	aClass182_Sub3_9115.method15394(0);
	aClass182_Sub3_9115.method15431(1, 34168, 768);
    }
}
