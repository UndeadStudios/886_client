/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class443
{
    public float aFloat4869;
    static float[] aFloatArray4870 = new float[8];
    public float aFloat4871;
    static float[] aFloatArray4872;
    public float aFloat4873;
    public float aFloat4874;
    public float aFloat4875;
    static float[] aFloatArray4876 = new float[8];
    public float aFloat4877;
    
    public boolean method7127(int i, int i_0_, int i_1_, int i_2_,
			      Class435 class435, float f, float f_3_,
			      float f_4_, float f_5_) {
	boolean bool = false;
	float f_6_ = 3.4028235E38F;
	float f_7_ = -3.4028235E38F;
	float f_8_ = 3.4028235E38F;
	float f_9_ = -3.4028235E38F;
	aFloatArray4870[0] = aFloat4877;
	aFloatArray4876[0] = aFloat4873;
	aFloatArray4872[0] = aFloat4871;
	aFloatArray4870[1] = aFloat4875;
	aFloatArray4876[1] = aFloat4873;
	aFloatArray4872[1] = aFloat4871;
	aFloatArray4870[2] = aFloat4877;
	aFloatArray4876[2] = aFloat4869;
	aFloatArray4872[2] = aFloat4871;
	aFloatArray4870[3] = aFloat4875;
	aFloatArray4876[3] = aFloat4869;
	aFloatArray4872[3] = aFloat4871;
	aFloatArray4870[4] = aFloat4877;
	aFloatArray4876[4] = aFloat4873;
	aFloatArray4872[4] = aFloat4874;
	aFloatArray4870[5] = aFloat4875;
	aFloatArray4876[5] = aFloat4873;
	aFloatArray4872[5] = aFloat4874;
	aFloatArray4870[6] = aFloat4877;
	aFloatArray4876[6] = aFloat4869;
	aFloatArray4872[6] = aFloat4874;
	aFloatArray4870[7] = aFloat4875;
	aFloatArray4876[7] = aFloat4869;
	aFloatArray4872[7] = aFloat4874;
	for (int i_10_ = 0; i_10_ < 8; i_10_++) {
	    float f_11_ = aFloatArray4870[i_10_];
	    float f_12_ = aFloatArray4876[i_10_];
	    float f_13_ = aFloatArray4872[i_10_];
	    float f_14_ = (class435.aFloatArray4830[2] * f_11_
			   + class435.aFloatArray4830[6] * f_12_
			   + class435.aFloatArray4830[10] * f_13_
			   + class435.aFloatArray4830[14]);
	    float f_15_ = (class435.aFloatArray4830[3] * f_11_
			   + class435.aFloatArray4830[7] * f_12_
			   + class435.aFloatArray4830[11] * f_13_
			   + class435.aFloatArray4830[15]);
	    if (f_14_ >= -f_15_) {
		float f_16_ = (class435.aFloatArray4830[0] * f_11_
			       + class435.aFloatArray4830[4] * f_12_
			       + class435.aFloatArray4830[8] * f_13_
			       + class435.aFloatArray4830[12]);
		float f_17_ = (class435.aFloatArray4830[1] * f_11_
			       + class435.aFloatArray4830[5] * f_12_
			       + class435.aFloatArray4830[9] * f_13_
			       + class435.aFloatArray4830[13]);
		float f_18_ = f + f_4_ * f_16_ / f_15_;
		float f_19_ = f_3_ + f_5_ * f_17_ / f_15_;
		if (f_18_ < f_6_)
		    f_6_ = f_18_;
		if (f_18_ > f_7_)
		    f_7_ = f_18_;
		if (f_19_ < f_8_)
		    f_8_ = f_19_;
		if (f_19_ > f_9_)
		    f_9_ = f_19_;
		bool = true;
	    }
	}
	int i_20_ = i + i_1_;
	int i_21_ = i_0_ + i_2_;
	if (bool && (float) i_20_ > f_6_ && (float) i < f_7_
	    && (float) i_21_ > f_8_ && (float) i_0_ < f_9_)
	    return true;
	return false;
    }
    
    public boolean method7128(int i, int i_22_, int i_23_, int i_24_,
			      Class435 class435, float f, float f_25_,
			      float f_26_, float f_27_) {
	boolean bool = false;
	float f_28_ = 3.4028235E38F;
	float f_29_ = -3.4028235E38F;
	float f_30_ = 3.4028235E38F;
	float f_31_ = -3.4028235E38F;
	aFloatArray4870[0] = aFloat4877;
	aFloatArray4876[0] = aFloat4873;
	aFloatArray4872[0] = aFloat4871;
	aFloatArray4870[1] = aFloat4875;
	aFloatArray4876[1] = aFloat4873;
	aFloatArray4872[1] = aFloat4871;
	aFloatArray4870[2] = aFloat4877;
	aFloatArray4876[2] = aFloat4869;
	aFloatArray4872[2] = aFloat4871;
	aFloatArray4870[3] = aFloat4875;
	aFloatArray4876[3] = aFloat4869;
	aFloatArray4872[3] = aFloat4871;
	aFloatArray4870[4] = aFloat4877;
	aFloatArray4876[4] = aFloat4873;
	aFloatArray4872[4] = aFloat4874;
	aFloatArray4870[5] = aFloat4875;
	aFloatArray4876[5] = aFloat4873;
	aFloatArray4872[5] = aFloat4874;
	aFloatArray4870[6] = aFloat4877;
	aFloatArray4876[6] = aFloat4869;
	aFloatArray4872[6] = aFloat4874;
	aFloatArray4870[7] = aFloat4875;
	aFloatArray4876[7] = aFloat4869;
	aFloatArray4872[7] = aFloat4874;
	for (int i_32_ = 0; i_32_ < 8; i_32_++) {
	    float f_33_ = aFloatArray4870[i_32_];
	    float f_34_ = aFloatArray4876[i_32_];
	    float f_35_ = aFloatArray4872[i_32_];
	    float f_36_ = (class435.aFloatArray4830[2] * f_33_
			   + class435.aFloatArray4830[6] * f_34_
			   + class435.aFloatArray4830[10] * f_35_
			   + class435.aFloatArray4830[14]);
	    float f_37_ = (class435.aFloatArray4830[3] * f_33_
			   + class435.aFloatArray4830[7] * f_34_
			   + class435.aFloatArray4830[11] * f_35_
			   + class435.aFloatArray4830[15]);
	    if (f_36_ >= -f_37_) {
		float f_38_ = (class435.aFloatArray4830[0] * f_33_
			       + class435.aFloatArray4830[4] * f_34_
			       + class435.aFloatArray4830[8] * f_35_
			       + class435.aFloatArray4830[12]);
		float f_39_ = (class435.aFloatArray4830[1] * f_33_
			       + class435.aFloatArray4830[5] * f_34_
			       + class435.aFloatArray4830[9] * f_35_
			       + class435.aFloatArray4830[13]);
		float f_40_ = f + f_26_ * f_38_ / f_37_;
		float f_41_ = f_25_ + f_27_ * f_39_ / f_37_;
		if (f_40_ < f_28_)
		    f_28_ = f_40_;
		if (f_40_ > f_29_)
		    f_29_ = f_40_;
		if (f_41_ < f_30_)
		    f_30_ = f_41_;
		if (f_41_ > f_31_)
		    f_31_ = f_41_;
		bool = true;
	    }
	}
	int i_42_ = i + i_23_;
	int i_43_ = i_22_ + i_24_;
	if (bool && (float) i_42_ > f_28_ && (float) i < f_29_
	    && (float) i_43_ > f_30_ && (float) i_22_ < f_31_)
	    return true;
	return false;
    }
    
    public boolean method7129(int i, int i_44_, int i_45_, int i_46_,
			      Class435 class435, float f, float f_47_,
			      float f_48_, float f_49_) {
	boolean bool = false;
	float f_50_ = 3.4028235E38F;
	float f_51_ = -3.4028235E38F;
	float f_52_ = 3.4028235E38F;
	float f_53_ = -3.4028235E38F;
	aFloatArray4870[0] = aFloat4877;
	aFloatArray4876[0] = aFloat4873;
	aFloatArray4872[0] = aFloat4871;
	aFloatArray4870[1] = aFloat4875;
	aFloatArray4876[1] = aFloat4873;
	aFloatArray4872[1] = aFloat4871;
	aFloatArray4870[2] = aFloat4877;
	aFloatArray4876[2] = aFloat4869;
	aFloatArray4872[2] = aFloat4871;
	aFloatArray4870[3] = aFloat4875;
	aFloatArray4876[3] = aFloat4869;
	aFloatArray4872[3] = aFloat4871;
	aFloatArray4870[4] = aFloat4877;
	aFloatArray4876[4] = aFloat4873;
	aFloatArray4872[4] = aFloat4874;
	aFloatArray4870[5] = aFloat4875;
	aFloatArray4876[5] = aFloat4873;
	aFloatArray4872[5] = aFloat4874;
	aFloatArray4870[6] = aFloat4877;
	aFloatArray4876[6] = aFloat4869;
	aFloatArray4872[6] = aFloat4874;
	aFloatArray4870[7] = aFloat4875;
	aFloatArray4876[7] = aFloat4869;
	aFloatArray4872[7] = aFloat4874;
	for (int i_54_ = 0; i_54_ < 8; i_54_++) {
	    float f_55_ = aFloatArray4870[i_54_];
	    float f_56_ = aFloatArray4876[i_54_];
	    float f_57_ = aFloatArray4872[i_54_];
	    float f_58_ = (class435.aFloatArray4830[2] * f_55_
			   + class435.aFloatArray4830[6] * f_56_
			   + class435.aFloatArray4830[10] * f_57_
			   + class435.aFloatArray4830[14]);
	    float f_59_ = (class435.aFloatArray4830[3] * f_55_
			   + class435.aFloatArray4830[7] * f_56_
			   + class435.aFloatArray4830[11] * f_57_
			   + class435.aFloatArray4830[15]);
	    if (f_58_ >= -f_59_) {
		float f_60_ = (class435.aFloatArray4830[0] * f_55_
			       + class435.aFloatArray4830[4] * f_56_
			       + class435.aFloatArray4830[8] * f_57_
			       + class435.aFloatArray4830[12]);
		float f_61_ = (class435.aFloatArray4830[1] * f_55_
			       + class435.aFloatArray4830[5] * f_56_
			       + class435.aFloatArray4830[9] * f_57_
			       + class435.aFloatArray4830[13]);
		float f_62_ = f + f_48_ * f_60_ / f_59_;
		float f_63_ = f_47_ + f_49_ * f_61_ / f_59_;
		if (f_62_ < f_50_)
		    f_50_ = f_62_;
		if (f_62_ > f_51_)
		    f_51_ = f_62_;
		if (f_63_ < f_52_)
		    f_52_ = f_63_;
		if (f_63_ > f_53_)
		    f_53_ = f_63_;
		bool = true;
	    }
	}
	int i_64_ = i + i_45_;
	int i_65_ = i_44_ + i_46_;
	if (bool && (float) i_64_ > f_50_ && (float) i < f_51_
	    && (float) i_65_ > f_52_ && (float) i_44_ < f_53_)
	    return true;
	return false;
    }
    
    static {
	aFloatArray4872 = new float[8];
    }
}
