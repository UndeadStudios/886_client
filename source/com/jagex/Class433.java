/* Class433 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class433
{
    Class446[] aClass446Array4821 = new Class446[4];
    float aFloat4822;
    float[] aFloatArray4823;
    
    void method6909(int i, Class446 class446) {
	aClass446Array4821[i].method7216(class446);
	method6910();
    }
    
    void method6910() {
	aFloat4822 = -1.0F;
	aFloatArray4823 = null;
    }
    
    float method6911(float f) {
	if (aFloat4822 == -1.0F)
	    method6925();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= aFloat4822)
	    return 1.0F;
	float f_0_ = 0.0F;
	float f_1_ = aFloatArray4823[0];
	for (int i = 1; i < aFloatArray4823.length; i++) {
	    if (f < f_1_) {
		float f_2_ = (f - f_0_) / (f_1_ - f_0_);
		float f_3_ = (float) (i - 1) / (float) aFloatArray4823.length;
		float f_4_ = (float) i / (float) aFloatArray4823.length;
		return f_3_ + (f_4_ - f_3_) * f_2_;
	    }
	    f_0_ = f_1_;
	    f_1_ += aFloatArray4823[i];
	}
	float f_5_ = (f - f_0_) / (f_1_ - f_0_);
	float f_6_ = ((float) (aFloatArray4823.length - 1)
		      / (float) aFloatArray4823.length);
	return f_6_ + (1.0F - f_6_) * f_5_;
    }
    
    void method6912(int i, Class446 class446) {
	aClass446Array4821[i].method7216(class446);
	method6910();
    }
    
    float method6913(float f) {
	if (aFloat4822 == -1.0F)
	    method6925();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= aFloat4822)
	    return 1.0F;
	float f_7_ = 0.0F;
	float f_8_ = aFloatArray4823[0];
	for (int i = 1; i < aFloatArray4823.length; i++) {
	    if (f < f_8_) {
		float f_9_ = (f - f_7_) / (f_8_ - f_7_);
		float f_10_ = (float) (i - 1) / (float) aFloatArray4823.length;
		float f_11_ = (float) i / (float) aFloatArray4823.length;
		return f_10_ + (f_11_ - f_10_) * f_9_;
	    }
	    f_7_ = f_8_;
	    f_8_ += aFloatArray4823[i];
	}
	float f_12_ = (f - f_7_) / (f_8_ - f_7_);
	float f_13_ = ((float) (aFloatArray4823.length - 1)
		       / (float) aFloatArray4823.length);
	return f_13_ + (1.0F - f_13_) * f_12_;
    }
    
    float method6914() {
	if (aFloat4822 == -1.0F)
	    method6925();
	return aFloat4822;
    }
    
    float method6915(float f) {
	if (aFloat4822 == -1.0F)
	    method6925();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= aFloat4822)
	    return 1.0F;
	float f_14_ = 0.0F;
	float f_15_ = aFloatArray4823[0];
	for (int i = 1; i < aFloatArray4823.length; i++) {
	    if (f < f_15_) {
		float f_16_ = (f - f_14_) / (f_15_ - f_14_);
		float f_17_ = (float) (i - 1) / (float) aFloatArray4823.length;
		float f_18_ = (float) i / (float) aFloatArray4823.length;
		return f_17_ + (f_18_ - f_17_) * f_16_;
	    }
	    f_14_ = f_15_;
	    f_15_ += aFloatArray4823[i];
	}
	float f_19_ = (f - f_14_) / (f_15_ - f_14_);
	float f_20_ = ((float) (aFloatArray4823.length - 1)
		       / (float) aFloatArray4823.length);
	return f_20_ + (1.0F - f_20_) * f_19_;
    }
    
    float method6916(float f) {
	if (aFloat4822 == -1.0F)
	    method6925();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= aFloat4822)
	    return 1.0F;
	float f_21_ = 0.0F;
	float f_22_ = aFloatArray4823[0];
	for (int i = 1; i < aFloatArray4823.length; i++) {
	    if (f < f_22_) {
		float f_23_ = (f - f_21_) / (f_22_ - f_21_);
		float f_24_ = (float) (i - 1) / (float) aFloatArray4823.length;
		float f_25_ = (float) i / (float) aFloatArray4823.length;
		return f_24_ + (f_25_ - f_24_) * f_23_;
	    }
	    f_21_ = f_22_;
	    f_22_ += aFloatArray4823[i];
	}
	float f_26_ = (f - f_21_) / (f_22_ - f_21_);
	float f_27_ = ((float) (aFloatArray4823.length - 1)
		       / (float) aFloatArray4823.length);
	return f_27_ + (1.0F - f_27_) * f_26_;
    }
    
    void method6917() {
	aFloat4822 = -1.0F;
	aFloatArray4823 = null;
    }
    
    double[] method6918(float f) {
	double[] ds = new double[3];
	float f_28_ = f * f;
	float f_29_ = f_28_ * f;
	double d = (double) (3.0F * (aClass446Array4821[1].aFloat4895
				     - aClass446Array4821[0].aFloat4895));
	double d_30_ = ((double) (3.0F * (aClass446Array4821[2].aFloat4895
					  - aClass446Array4821[1].aFloat4895))
			- d);
	double d_31_ = ((double) (aClass446Array4821[3].aFloat4895
				  - aClass446Array4821[0].aFloat4895)
			- d - d_30_);
	ds[0] = (d_31_ * (double) f_29_ + d_30_ * (double) f_28_
		 + d * (double) f + (double) aClass446Array4821[0].aFloat4895);
	d = (double) (3.0F * (aClass446Array4821[1].aFloat4896
			      - aClass446Array4821[0].aFloat4896));
	d_30_ = (double) (3.0F * (aClass446Array4821[2].aFloat4896
				  - aClass446Array4821[1].aFloat4896)) - d;
	d_31_ = (double) (aClass446Array4821[3].aFloat4896
			  - aClass446Array4821[0].aFloat4896) - d - d_30_;
	ds[1] = (d_31_ * (double) f_29_ + d_30_ * (double) f_28_
		 + d * (double) f + (double) aClass446Array4821[0].aFloat4896);
	d = (double) (3.0F * (aClass446Array4821[1].aFloat4897
			      - aClass446Array4821[0].aFloat4897));
	d_30_ = (double) (3.0F * (aClass446Array4821[2].aFloat4897
				  - aClass446Array4821[1].aFloat4897)) - d;
	d_31_ = (double) (aClass446Array4821[3].aFloat4897
			  - aClass446Array4821[0].aFloat4897) - d - d_30_;
	ds[2] = (d_31_ * (double) f_29_ + d_30_ * (double) f_28_
		 + d * (double) f + (double) aClass446Array4821[0].aFloat4897);
	return ds;
    }
    
    void method6919() {
	aFloat4822 = -1.0F;
	aFloatArray4823 = null;
    }
    
    float method6920() {
	if (aFloat4822 == -1.0F)
	    method6925();
	return aFloat4822;
    }
    
    void method6921(int i, Class446 class446) {
	aClass446Array4821[i].method7216(class446);
	method6910();
    }
    
    Class446 method6922(int i) {
	return aClass446Array4821[i];
    }
    
    Class433() {
	for (int i = 0; i < 4; i++)
	    aClass446Array4821[i] = new Class446();
	method6910();
    }
    
    double[] method6923(float f) {
	double[] ds = new double[3];
	float f_32_ = f * f;
	float f_33_ = f_32_ * f;
	double d = (double) (3.0F * (aClass446Array4821[1].aFloat4895
				     - aClass446Array4821[0].aFloat4895));
	double d_34_ = ((double) (3.0F * (aClass446Array4821[2].aFloat4895
					  - aClass446Array4821[1].aFloat4895))
			- d);
	double d_35_ = ((double) (aClass446Array4821[3].aFloat4895
				  - aClass446Array4821[0].aFloat4895)
			- d - d_34_);
	ds[0] = (d_35_ * (double) f_33_ + d_34_ * (double) f_32_
		 + d * (double) f + (double) aClass446Array4821[0].aFloat4895);
	d = (double) (3.0F * (aClass446Array4821[1].aFloat4896
			      - aClass446Array4821[0].aFloat4896));
	d_34_ = (double) (3.0F * (aClass446Array4821[2].aFloat4896
				  - aClass446Array4821[1].aFloat4896)) - d;
	d_35_ = (double) (aClass446Array4821[3].aFloat4896
			  - aClass446Array4821[0].aFloat4896) - d - d_34_;
	ds[1] = (d_35_ * (double) f_33_ + d_34_ * (double) f_32_
		 + d * (double) f + (double) aClass446Array4821[0].aFloat4896);
	d = (double) (3.0F * (aClass446Array4821[1].aFloat4897
			      - aClass446Array4821[0].aFloat4897));
	d_34_ = (double) (3.0F * (aClass446Array4821[2].aFloat4897
				  - aClass446Array4821[1].aFloat4897)) - d;
	d_35_ = (double) (aClass446Array4821[3].aFloat4897
			  - aClass446Array4821[0].aFloat4897) - d - d_34_;
	ds[2] = (d_35_ * (double) f_33_ + d_34_ * (double) f_32_
		 + d * (double) f + (double) aClass446Array4821[0].aFloat4897);
	return ds;
    }
    
    double[] method6924(float f) {
	double[] ds = new double[3];
	float f_36_ = f * f;
	float f_37_ = f_36_ * f;
	double d = (double) (3.0F * (aClass446Array4821[1].aFloat4895
				     - aClass446Array4821[0].aFloat4895));
	double d_38_ = ((double) (3.0F * (aClass446Array4821[2].aFloat4895
					  - aClass446Array4821[1].aFloat4895))
			- d);
	double d_39_ = ((double) (aClass446Array4821[3].aFloat4895
				  - aClass446Array4821[0].aFloat4895)
			- d - d_38_);
	ds[0] = (d_39_ * (double) f_37_ + d_38_ * (double) f_36_
		 + d * (double) f + (double) aClass446Array4821[0].aFloat4895);
	d = (double) (3.0F * (aClass446Array4821[1].aFloat4896
			      - aClass446Array4821[0].aFloat4896));
	d_38_ = (double) (3.0F * (aClass446Array4821[2].aFloat4896
				  - aClass446Array4821[1].aFloat4896)) - d;
	d_39_ = (double) (aClass446Array4821[3].aFloat4896
			  - aClass446Array4821[0].aFloat4896) - d - d_38_;
	ds[1] = (d_39_ * (double) f_37_ + d_38_ * (double) f_36_
		 + d * (double) f + (double) aClass446Array4821[0].aFloat4896);
	d = (double) (3.0F * (aClass446Array4821[1].aFloat4897
			      - aClass446Array4821[0].aFloat4897));
	d_38_ = (double) (3.0F * (aClass446Array4821[2].aFloat4897
				  - aClass446Array4821[1].aFloat4897)) - d;
	d_39_ = (double) (aClass446Array4821[3].aFloat4897
			  - aClass446Array4821[0].aFloat4897) - d - d_38_;
	ds[2] = (d_39_ * (double) f_37_ + d_38_ * (double) f_36_
		 + d * (double) f + (double) aClass446Array4821[0].aFloat4897);
	return ds;
    }
    
    void method6925() {
	int i = 20;
	double[] ds = method6918(0.0F);
	float f = 0.0F;
	Class446 class446 = Class446.method7207();
	for (int i_40_ = 1; i_40_ <= i; i_40_++) {
	    double[] ds_41_ = method6918((float) i_40_ / (float) i);
	    class446.aFloat4895 = (float) (ds_41_[0] - ds[0]);
	    class446.aFloat4896 = (float) (ds_41_[1] - ds[1]);
	    class446.aFloat4897 = (float) (ds_41_[2] - ds[2]);
	    f += class446.method7230();
	    ds = ds_41_;
	}
	int i_42_ = (int) (f / 20.0F);
	if (i_42_ < i)
	    i_42_ = i;
	aFloatArray4823 = new float[i_42_];
	ds = method6918(0.0F);
	float f_43_ = 0.0F;
	for (int i_44_ = 1; i_44_ <= i_42_; i_44_++) {
	    double[] ds_45_ = method6918((float) i_44_ / (float) i_42_);
	    class446.aFloat4895 = (float) (ds_45_[0] - ds[0]);
	    class446.aFloat4896 = (float) (ds_45_[1] - ds[1]);
	    class446.aFloat4897 = (float) (ds_45_[2] - ds[2]);
	    float f_46_ = class446.method7230();
	    f_43_ += f_46_;
	    aFloatArray4823[i_44_ - 1] = f_46_;
	    ds = ds_45_;
	}
	aFloat4822 = f_43_;
    }
    
    float method6926() {
	if (aFloat4822 == -1.0F)
	    method6925();
	return aFloat4822;
    }
    
    float method6927() {
	if (aFloat4822 == -1.0F)
	    method6925();
	return aFloat4822;
    }
    
    Class446 method6928(int i) {
	return aClass446Array4821[i];
    }
    
    float method6929(float f) {
	if (aFloat4822 == -1.0F)
	    method6925();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= aFloat4822)
	    return 1.0F;
	float f_47_ = 0.0F;
	float f_48_ = aFloatArray4823[0];
	for (int i = 1; i < aFloatArray4823.length; i++) {
	    if (f < f_48_) {
		float f_49_ = (f - f_47_) / (f_48_ - f_47_);
		float f_50_ = (float) (i - 1) / (float) aFloatArray4823.length;
		float f_51_ = (float) i / (float) aFloatArray4823.length;
		return f_50_ + (f_51_ - f_50_) * f_49_;
	    }
	    f_47_ = f_48_;
	    f_48_ += aFloatArray4823[i];
	}
	float f_52_ = (f - f_47_) / (f_48_ - f_47_);
	float f_53_ = ((float) (aFloatArray4823.length - 1)
		       / (float) aFloatArray4823.length);
	return f_53_ + (1.0F - f_53_) * f_52_;
    }
    
    Class446 method6930(int i) {
	return aClass446Array4821[i];
    }
    
    void method6931() {
	aFloat4822 = -1.0F;
	aFloatArray4823 = null;
    }
    
    float method6932(float f) {
	if (aFloat4822 == -1.0F)
	    method6925();
	if (f <= 0.0F)
	    return 0.0F;
	if (f >= aFloat4822)
	    return 1.0F;
	float f_54_ = 0.0F;
	float f_55_ = aFloatArray4823[0];
	for (int i = 1; i < aFloatArray4823.length; i++) {
	    if (f < f_55_) {
		float f_56_ = (f - f_54_) / (f_55_ - f_54_);
		float f_57_ = (float) (i - 1) / (float) aFloatArray4823.length;
		float f_58_ = (float) i / (float) aFloatArray4823.length;
		return f_57_ + (f_58_ - f_57_) * f_56_;
	    }
	    f_54_ = f_55_;
	    f_55_ += aFloatArray4823[i];
	}
	float f_59_ = (f - f_54_) / (f_55_ - f_54_);
	float f_60_ = ((float) (aFloatArray4823.length - 1)
		       / (float) aFloatArray4823.length);
	return f_60_ + (1.0F - f_60_) * f_59_;
    }
    
    float method6933() {
	if (aFloat4822 == -1.0F)
	    method6925();
	return aFloat4822;
    }
    
    void method6934() {
	int i = 20;
	double[] ds = method6918(0.0F);
	float f = 0.0F;
	Class446 class446 = Class446.method7207();
	for (int i_61_ = 1; i_61_ <= i; i_61_++) {
	    double[] ds_62_ = method6918((float) i_61_ / (float) i);
	    class446.aFloat4895 = (float) (ds_62_[0] - ds[0]);
	    class446.aFloat4896 = (float) (ds_62_[1] - ds[1]);
	    class446.aFloat4897 = (float) (ds_62_[2] - ds[2]);
	    f += class446.method7230();
	    ds = ds_62_;
	}
	int i_63_ = (int) (f / 20.0F);
	if (i_63_ < i)
	    i_63_ = i;
	aFloatArray4823 = new float[i_63_];
	ds = method6918(0.0F);
	float f_64_ = 0.0F;
	for (int i_65_ = 1; i_65_ <= i_63_; i_65_++) {
	    double[] ds_66_ = method6918((float) i_65_ / (float) i_63_);
	    class446.aFloat4895 = (float) (ds_66_[0] - ds[0]);
	    class446.aFloat4896 = (float) (ds_66_[1] - ds[1]);
	    class446.aFloat4897 = (float) (ds_66_[2] - ds[2]);
	    float f_67_ = class446.method7230();
	    f_64_ += f_67_;
	    aFloatArray4823[i_65_ - 1] = f_67_;
	    ds = ds_66_;
	}
	aFloat4822 = f_64_;
    }
    
    void method6935() {
	int i = 20;
	double[] ds = method6918(0.0F);
	float f = 0.0F;
	Class446 class446 = Class446.method7207();
	for (int i_68_ = 1; i_68_ <= i; i_68_++) {
	    double[] ds_69_ = method6918((float) i_68_ / (float) i);
	    class446.aFloat4895 = (float) (ds_69_[0] - ds[0]);
	    class446.aFloat4896 = (float) (ds_69_[1] - ds[1]);
	    class446.aFloat4897 = (float) (ds_69_[2] - ds[2]);
	    f += class446.method7230();
	    ds = ds_69_;
	}
	int i_70_ = (int) (f / 20.0F);
	if (i_70_ < i)
	    i_70_ = i;
	aFloatArray4823 = new float[i_70_];
	ds = method6918(0.0F);
	float f_71_ = 0.0F;
	for (int i_72_ = 1; i_72_ <= i_70_; i_72_++) {
	    double[] ds_73_ = method6918((float) i_72_ / (float) i_70_);
	    class446.aFloat4895 = (float) (ds_73_[0] - ds[0]);
	    class446.aFloat4896 = (float) (ds_73_[1] - ds[1]);
	    class446.aFloat4897 = (float) (ds_73_[2] - ds[2]);
	    float f_74_ = class446.method7230();
	    f_71_ += f_74_;
	    aFloatArray4823[i_72_ - 1] = f_74_;
	    ds = ds_73_;
	}
	aFloat4822 = f_71_;
    }
}
