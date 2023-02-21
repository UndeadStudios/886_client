/* Class437 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class437
{
    public float aFloat4849;
    public float aFloat4850;
    public float aFloat4851;
    public float aFloat4852;
    
    public Class437() {
	method7098();
    }
    
    public Class437(float f, float f_0_, float f_1_, float f_2_) {
	method7073(f, f_0_, f_1_, f_2_);
    }
    
    public void method7073(float f, float f_3_, float f_4_, float f_5_) {
	aFloat4851 = f;
	aFloat4850 = f_3_;
	aFloat4849 = f_4_;
	aFloat4852 = f_5_;
    }
    
    public void method7074(Class437 class437_6_) {
	method7073(class437_6_.aFloat4851, class437_6_.aFloat4850,
		   class437_6_.aFloat4849, class437_6_.aFloat4852);
    }
    
    public void method7075(int i) {
	method7073((float) (i >> 16 & 0xff) * 0.003921569F,
		   (float) (i >> 8 & 0xff) * 0.003921569F,
		   (float) (i >> 0 & 0xff) * 0.003921569F,
		   (float) (i >> 24 & 0xff) * 0.003921569F);
    }
    
    public void method7076(float f, float f_7_, float f_8_, float f_9_) {
	aFloat4851 = f;
	aFloat4850 = f_7_;
	aFloat4849 = f_8_;
	aFloat4852 = f_9_;
    }
    
    public final void method7077() {
	aFloat4851 = -aFloat4851;
	aFloat4850 = -aFloat4850;
	aFloat4849 = -aFloat4849;
	aFloat4852 = -aFloat4852;
    }
    
    public final void method7078(float f) {
	aFloat4851 *= f;
	aFloat4850 *= f;
	aFloat4849 *= f;
	aFloat4852 *= f;
    }
    
    public final void method7079(Class435 class435) {
	float f = aFloat4851;
	float f_10_ = aFloat4850;
	float f_11_ = aFloat4849;
	float f_12_ = aFloat4852;
	aFloat4851 = (class435.aFloatArray4830[0] * f
		      + class435.aFloatArray4830[4] * f_10_
		      + class435.aFloatArray4830[8] * f_11_
		      + class435.aFloatArray4830[12] * f_12_);
	aFloat4850 = (class435.aFloatArray4830[1] * f
		      + class435.aFloatArray4830[5] * f_10_
		      + class435.aFloatArray4830[9] * f_11_
		      + class435.aFloatArray4830[13] * f_12_);
	aFloat4849 = (class435.aFloatArray4830[2] * f
		      + class435.aFloatArray4830[6] * f_10_
		      + class435.aFloatArray4830[10] * f_11_
		      + class435.aFloatArray4830[14] * f_12_);
	aFloat4852 = (class435.aFloatArray4830[3] * f
		      + class435.aFloatArray4830[7] * f_10_
		      + class435.aFloatArray4830[11] * f_11_
		      + class435.aFloatArray4830[15] * f_12_);
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4851).append(",").append
		   (aFloat4850).append
		   (",").append
		   (aFloat4849).append
		   (",").append
		   (aFloat4852).toString();
    }
    
    public String method7080() {
	return new StringBuilder().append(aFloat4851).append(",").append
		   (aFloat4850).append
		   (",").append
		   (aFloat4849).append
		   (",").append
		   (aFloat4852).toString();
    }
    
    public String method7081() {
	return new StringBuilder().append(aFloat4851).append(",").append
		   (aFloat4850).append
		   (",").append
		   (aFloat4849).append
		   (",").append
		   (aFloat4852).toString();
    }
    
    public final void method7082(float f) {
	aFloat4851 *= f;
	aFloat4850 *= f;
	aFloat4849 *= f;
	aFloat4852 *= f;
    }
    
    public final void method7083(Class435 class435) {
	float f = aFloat4851;
	float f_13_ = aFloat4850;
	float f_14_ = aFloat4849;
	float f_15_ = aFloat4852;
	aFloat4851 = (class435.aFloatArray4830[0] * f
		      + class435.aFloatArray4830[4] * f_13_
		      + class435.aFloatArray4830[8] * f_14_
		      + class435.aFloatArray4830[12] * f_15_);
	aFloat4850 = (class435.aFloatArray4830[1] * f
		      + class435.aFloatArray4830[5] * f_13_
		      + class435.aFloatArray4830[9] * f_14_
		      + class435.aFloatArray4830[13] * f_15_);
	aFloat4849 = (class435.aFloatArray4830[2] * f
		      + class435.aFloatArray4830[6] * f_13_
		      + class435.aFloatArray4830[10] * f_14_
		      + class435.aFloatArray4830[14] * f_15_);
	aFloat4852 = (class435.aFloatArray4830[3] * f
		      + class435.aFloatArray4830[7] * f_13_
		      + class435.aFloatArray4830[11] * f_14_
		      + class435.aFloatArray4830[15] * f_15_);
    }
    
    public final void method7084() {
	aFloat4851 = -aFloat4851;
	aFloat4850 = -aFloat4850;
	aFloat4849 = -aFloat4849;
	aFloat4852 = -aFloat4852;
    }
    
    public void method7085(Class437 class437_16_) {
	method7073(class437_16_.aFloat4851, class437_16_.aFloat4850,
		   class437_16_.aFloat4849, class437_16_.aFloat4852);
    }
    
    public void method7086(Class437 class437_17_) {
	method7073(class437_17_.aFloat4851, class437_17_.aFloat4850,
		   class437_17_.aFloat4849, class437_17_.aFloat4852);
    }
    
    public void method7087(int i) {
	method7073((float) (i >> 16 & 0xff) * 0.003921569F,
		   (float) (i >> 8 & 0xff) * 0.003921569F,
		   (float) (i >> 0 & 0xff) * 0.003921569F,
		   (float) (i >> 24 & 0xff) * 0.003921569F);
    }
    
    public final void method7088(Class435 class435) {
	float f = aFloat4851;
	float f_18_ = aFloat4850;
	float f_19_ = aFloat4849;
	float f_20_ = aFloat4852;
	aFloat4851 = (class435.aFloatArray4830[0] * f
		      + class435.aFloatArray4830[4] * f_18_
		      + class435.aFloatArray4830[8] * f_19_
		      + class435.aFloatArray4830[12] * f_20_);
	aFloat4850 = (class435.aFloatArray4830[1] * f
		      + class435.aFloatArray4830[5] * f_18_
		      + class435.aFloatArray4830[9] * f_19_
		      + class435.aFloatArray4830[13] * f_20_);
	aFloat4849 = (class435.aFloatArray4830[2] * f
		      + class435.aFloatArray4830[6] * f_18_
		      + class435.aFloatArray4830[10] * f_19_
		      + class435.aFloatArray4830[14] * f_20_);
	aFloat4852 = (class435.aFloatArray4830[3] * f
		      + class435.aFloatArray4830[7] * f_18_
		      + class435.aFloatArray4830[11] * f_19_
		      + class435.aFloatArray4830[15] * f_20_);
    }
    
    public final void method7089() {
	aFloat4851 = -aFloat4851;
	aFloat4850 = -aFloat4850;
	aFloat4849 = -aFloat4849;
	aFloat4852 = -aFloat4852;
    }
    
    final void method7090() {
	aFloat4852 = 0.0F;
	aFloat4849 = 0.0F;
	aFloat4850 = 0.0F;
	aFloat4851 = 0.0F;
    }
    
    public final void method7091() {
	aFloat4851 = -aFloat4851;
	aFloat4850 = -aFloat4850;
	aFloat4849 = -aFloat4849;
	aFloat4852 = -aFloat4852;
    }
    
    public final void method7092(float f) {
	aFloat4851 *= f;
	aFloat4850 *= f;
	aFloat4849 *= f;
	aFloat4852 *= f;
    }
    
    public final void method7093(float f) {
	aFloat4851 *= f;
	aFloat4850 *= f;
	aFloat4849 *= f;
	aFloat4852 *= f;
    }
    
    public String method7094() {
	return new StringBuilder().append(aFloat4851).append(",").append
		   (aFloat4850).append
		   (",").append
		   (aFloat4849).append
		   (",").append
		   (aFloat4852).toString();
    }
    
    public final void method7095(float f) {
	aFloat4851 *= f;
	aFloat4850 *= f;
	aFloat4849 *= f;
	aFloat4852 *= f;
    }
    
    public final void method7096(Class435 class435) {
	float f = aFloat4851;
	float f_21_ = aFloat4850;
	float f_22_ = aFloat4849;
	float f_23_ = aFloat4852;
	aFloat4851 = (class435.aFloatArray4830[0] * f
		      + class435.aFloatArray4830[4] * f_21_
		      + class435.aFloatArray4830[8] * f_22_
		      + class435.aFloatArray4830[12] * f_23_);
	aFloat4850 = (class435.aFloatArray4830[1] * f
		      + class435.aFloatArray4830[5] * f_21_
		      + class435.aFloatArray4830[9] * f_22_
		      + class435.aFloatArray4830[13] * f_23_);
	aFloat4849 = (class435.aFloatArray4830[2] * f
		      + class435.aFloatArray4830[6] * f_21_
		      + class435.aFloatArray4830[10] * f_22_
		      + class435.aFloatArray4830[14] * f_23_);
	aFloat4852 = (class435.aFloatArray4830[3] * f
		      + class435.aFloatArray4830[7] * f_21_
		      + class435.aFloatArray4830[11] * f_22_
		      + class435.aFloatArray4830[15] * f_23_);
    }
    
    public final void method7097(Class435 class435) {
	float f = aFloat4851;
	float f_24_ = aFloat4850;
	float f_25_ = aFloat4849;
	float f_26_ = aFloat4852;
	aFloat4851 = (class435.aFloatArray4830[0] * f
		      + class435.aFloatArray4830[4] * f_24_
		      + class435.aFloatArray4830[8] * f_25_
		      + class435.aFloatArray4830[12] * f_26_);
	aFloat4850 = (class435.aFloatArray4830[1] * f
		      + class435.aFloatArray4830[5] * f_24_
		      + class435.aFloatArray4830[9] * f_25_
		      + class435.aFloatArray4830[13] * f_26_);
	aFloat4849 = (class435.aFloatArray4830[2] * f
		      + class435.aFloatArray4830[6] * f_24_
		      + class435.aFloatArray4830[10] * f_25_
		      + class435.aFloatArray4830[14] * f_26_);
	aFloat4852 = (class435.aFloatArray4830[3] * f
		      + class435.aFloatArray4830[7] * f_24_
		      + class435.aFloatArray4830[11] * f_25_
		      + class435.aFloatArray4830[15] * f_26_);
    }
    
    final void method7098() {
	aFloat4852 = 0.0F;
	aFloat4849 = 0.0F;
	aFloat4850 = 0.0F;
	aFloat4851 = 0.0F;
    }
    
    public void method7099(float f, float f_27_, float f_28_, float f_29_) {
	aFloat4851 = f;
	aFloat4850 = f_27_;
	aFloat4849 = f_28_;
	aFloat4852 = f_29_;
    }
}
