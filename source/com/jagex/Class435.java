/* Class435 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;

public final class Class435
{
    public static Class435 aClass435_4829 = new Class435();
    public float[] aFloatArray4830;
    
    public boolean method6945(Object object) {
	if (!(object instanceof Class435))
	    return false;
	Class435 class435_0_ = (Class435) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4830[i] != class435_0_.aFloatArray4830[i])
		return false;
	}
	return true;
    }
    
    public Class435(Class435 class435_1_) {
	aFloatArray4830 = new float[16];
	method6947(class435_1_);
    }
    
    public void method6946(float f, float f_2_, float f_3_, float[] fs) {
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_2_
		 + aFloatArray4830[8] * f_3_ + aFloatArray4830[12]);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_2_
		 + aFloatArray4830[9] * f_3_ + aFloatArray4830[13]);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_2_
		 + aFloatArray4830[10] * f_3_ + aFloatArray4830[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4830[3] * f + aFloatArray4830[7] * f_2_
		     + aFloatArray4830[11] * f_3_ + aFloatArray4830[15]);
    }
    
    public void method6947(Class435 class435_4_) {
	System.arraycopy(class435_4_.aFloatArray4830, 0, aFloatArray4830, 0,
			 16);
    }
    
    public void method6948(float f, float f_5_, float f_6_, float f_7_,
			   float f_8_, float f_9_, float f_10_, float f_11_,
			   float f_12_) {
	method6959(-(f * f_12_) / f_6_, f_12_ * (f_10_ - f) / f_6_,
		   -(f_5_ * f_12_) / f_7_, f_12_ * (f_11_ - f_5_) / f_7_, f_8_,
		   f_9_);
    }
    
    public void method6949(Class435 class435_13_, Class435 class435_14_) {
	float f = ((class435_13_.aFloatArray4830[0]
		    * class435_14_.aFloatArray4830[0])
		   + (class435_13_.aFloatArray4830[1]
		      * class435_14_.aFloatArray4830[4])
		   + (class435_13_.aFloatArray4830[2]
		      * class435_14_.aFloatArray4830[8])
		   + (class435_13_.aFloatArray4830[3]
		      * class435_14_.aFloatArray4830[12]));
	float f_15_ = ((class435_13_.aFloatArray4830[0]
			* class435_14_.aFloatArray4830[1])
		       + (class435_13_.aFloatArray4830[1]
			  * class435_14_.aFloatArray4830[5])
		       + (class435_13_.aFloatArray4830[2]
			  * class435_14_.aFloatArray4830[9])
		       + (class435_13_.aFloatArray4830[3]
			  * class435_14_.aFloatArray4830[13]));
	float f_16_ = ((class435_13_.aFloatArray4830[0]
			* class435_14_.aFloatArray4830[2])
		       + (class435_13_.aFloatArray4830[1]
			  * class435_14_.aFloatArray4830[6])
		       + (class435_13_.aFloatArray4830[2]
			  * class435_14_.aFloatArray4830[10])
		       + (class435_13_.aFloatArray4830[3]
			  * class435_14_.aFloatArray4830[14]));
	float f_17_ = ((class435_13_.aFloatArray4830[0]
			* class435_14_.aFloatArray4830[3])
		       + (class435_13_.aFloatArray4830[1]
			  * class435_14_.aFloatArray4830[7])
		       + (class435_13_.aFloatArray4830[2]
			  * class435_14_.aFloatArray4830[11])
		       + (class435_13_.aFloatArray4830[3]
			  * class435_14_.aFloatArray4830[15]));
	float f_18_ = ((class435_13_.aFloatArray4830[4]
			* class435_14_.aFloatArray4830[0])
		       + (class435_13_.aFloatArray4830[5]
			  * class435_14_.aFloatArray4830[4])
		       + (class435_13_.aFloatArray4830[6]
			  * class435_14_.aFloatArray4830[8])
		       + (class435_13_.aFloatArray4830[7]
			  * class435_14_.aFloatArray4830[12]));
	float f_19_ = ((class435_13_.aFloatArray4830[4]
			* class435_14_.aFloatArray4830[1])
		       + (class435_13_.aFloatArray4830[5]
			  * class435_14_.aFloatArray4830[5])
		       + (class435_13_.aFloatArray4830[6]
			  * class435_14_.aFloatArray4830[9])
		       + (class435_13_.aFloatArray4830[7]
			  * class435_14_.aFloatArray4830[13]));
	float f_20_ = ((class435_13_.aFloatArray4830[4]
			* class435_14_.aFloatArray4830[2])
		       + (class435_13_.aFloatArray4830[5]
			  * class435_14_.aFloatArray4830[6])
		       + (class435_13_.aFloatArray4830[6]
			  * class435_14_.aFloatArray4830[10])
		       + (class435_13_.aFloatArray4830[7]
			  * class435_14_.aFloatArray4830[14]));
	float f_21_ = ((class435_13_.aFloatArray4830[4]
			* class435_14_.aFloatArray4830[3])
		       + (class435_13_.aFloatArray4830[5]
			  * class435_14_.aFloatArray4830[7])
		       + (class435_13_.aFloatArray4830[6]
			  * class435_14_.aFloatArray4830[11])
		       + (class435_13_.aFloatArray4830[7]
			  * class435_14_.aFloatArray4830[15]));
	float f_22_ = ((class435_13_.aFloatArray4830[8]
			* class435_14_.aFloatArray4830[0])
		       + (class435_13_.aFloatArray4830[9]
			  * class435_14_.aFloatArray4830[4])
		       + (class435_13_.aFloatArray4830[10]
			  * class435_14_.aFloatArray4830[8])
		       + (class435_13_.aFloatArray4830[11]
			  * class435_14_.aFloatArray4830[12]));
	float f_23_ = ((class435_13_.aFloatArray4830[8]
			* class435_14_.aFloatArray4830[1])
		       + (class435_13_.aFloatArray4830[9]
			  * class435_14_.aFloatArray4830[5])
		       + (class435_13_.aFloatArray4830[10]
			  * class435_14_.aFloatArray4830[9])
		       + (class435_13_.aFloatArray4830[11]
			  * class435_14_.aFloatArray4830[13]));
	float f_24_ = ((class435_13_.aFloatArray4830[8]
			* class435_14_.aFloatArray4830[2])
		       + (class435_13_.aFloatArray4830[9]
			  * class435_14_.aFloatArray4830[6])
		       + (class435_13_.aFloatArray4830[10]
			  * class435_14_.aFloatArray4830[10])
		       + (class435_13_.aFloatArray4830[11]
			  * class435_14_.aFloatArray4830[14]));
	float f_25_ = ((class435_13_.aFloatArray4830[8]
			* class435_14_.aFloatArray4830[3])
		       + (class435_13_.aFloatArray4830[9]
			  * class435_14_.aFloatArray4830[7])
		       + (class435_13_.aFloatArray4830[10]
			  * class435_14_.aFloatArray4830[11])
		       + (class435_13_.aFloatArray4830[11]
			  * class435_14_.aFloatArray4830[15]));
	float f_26_ = ((class435_13_.aFloatArray4830[12]
			* class435_14_.aFloatArray4830[0])
		       + (class435_13_.aFloatArray4830[13]
			  * class435_14_.aFloatArray4830[4])
		       + (class435_13_.aFloatArray4830[14]
			  * class435_14_.aFloatArray4830[8])
		       + (class435_13_.aFloatArray4830[15]
			  * class435_14_.aFloatArray4830[12]));
	float f_27_ = ((class435_13_.aFloatArray4830[12]
			* class435_14_.aFloatArray4830[1])
		       + (class435_13_.aFloatArray4830[13]
			  * class435_14_.aFloatArray4830[5])
		       + (class435_13_.aFloatArray4830[14]
			  * class435_14_.aFloatArray4830[9])
		       + (class435_13_.aFloatArray4830[15]
			  * class435_14_.aFloatArray4830[13]));
	float f_28_ = ((class435_13_.aFloatArray4830[12]
			* class435_14_.aFloatArray4830[2])
		       + (class435_13_.aFloatArray4830[13]
			  * class435_14_.aFloatArray4830[6])
		       + (class435_13_.aFloatArray4830[14]
			  * class435_14_.aFloatArray4830[10])
		       + (class435_13_.aFloatArray4830[15]
			  * class435_14_.aFloatArray4830[14]));
	float f_29_ = ((class435_13_.aFloatArray4830[12]
			* class435_14_.aFloatArray4830[3])
		       + (class435_13_.aFloatArray4830[13]
			  * class435_14_.aFloatArray4830[7])
		       + (class435_13_.aFloatArray4830[14]
			  * class435_14_.aFloatArray4830[11])
		       + (class435_13_.aFloatArray4830[15]
			  * class435_14_.aFloatArray4830[15]));
	aFloatArray4830[0] = f;
	aFloatArray4830[1] = f_15_;
	aFloatArray4830[2] = f_16_;
	aFloatArray4830[3] = f_17_;
	aFloatArray4830[4] = f_18_;
	aFloatArray4830[5] = f_19_;
	aFloatArray4830[6] = f_20_;
	aFloatArray4830[7] = f_21_;
	aFloatArray4830[8] = f_22_;
	aFloatArray4830[9] = f_23_;
	aFloatArray4830[10] = f_24_;
	aFloatArray4830[11] = f_25_;
	aFloatArray4830[12] = f_26_;
	aFloatArray4830[13] = f_27_;
	aFloatArray4830[14] = f_28_;
	aFloatArray4830[15] = f_29_;
    }
    
    public void method6950(Class435 class435_30_) {
	float f = (aFloatArray4830[0] * class435_30_.aFloatArray4830[0]
		   + aFloatArray4830[1] * class435_30_.aFloatArray4830[4]
		   + aFloatArray4830[2] * class435_30_.aFloatArray4830[8]
		   + aFloatArray4830[3] * class435_30_.aFloatArray4830[12]);
	float f_31_
	    = (aFloatArray4830[0] * class435_30_.aFloatArray4830[1]
	       + aFloatArray4830[1] * class435_30_.aFloatArray4830[5]
	       + aFloatArray4830[2] * class435_30_.aFloatArray4830[9]
	       + aFloatArray4830[3] * class435_30_.aFloatArray4830[13]);
	float f_32_
	    = (aFloatArray4830[0] * class435_30_.aFloatArray4830[2]
	       + aFloatArray4830[1] * class435_30_.aFloatArray4830[6]
	       + aFloatArray4830[2] * class435_30_.aFloatArray4830[10]
	       + aFloatArray4830[3] * class435_30_.aFloatArray4830[14]);
	float f_33_
	    = (aFloatArray4830[0] * class435_30_.aFloatArray4830[3]
	       + aFloatArray4830[1] * class435_30_.aFloatArray4830[7]
	       + aFloatArray4830[2] * class435_30_.aFloatArray4830[11]
	       + aFloatArray4830[3] * class435_30_.aFloatArray4830[15]);
	float f_34_
	    = (aFloatArray4830[4] * class435_30_.aFloatArray4830[0]
	       + aFloatArray4830[5] * class435_30_.aFloatArray4830[4]
	       + aFloatArray4830[6] * class435_30_.aFloatArray4830[8]
	       + aFloatArray4830[7] * class435_30_.aFloatArray4830[12]);
	float f_35_
	    = (aFloatArray4830[4] * class435_30_.aFloatArray4830[1]
	       + aFloatArray4830[5] * class435_30_.aFloatArray4830[5]
	       + aFloatArray4830[6] * class435_30_.aFloatArray4830[9]
	       + aFloatArray4830[7] * class435_30_.aFloatArray4830[13]);
	float f_36_
	    = (aFloatArray4830[4] * class435_30_.aFloatArray4830[2]
	       + aFloatArray4830[5] * class435_30_.aFloatArray4830[6]
	       + aFloatArray4830[6] * class435_30_.aFloatArray4830[10]
	       + aFloatArray4830[7] * class435_30_.aFloatArray4830[14]);
	float f_37_
	    = (aFloatArray4830[4] * class435_30_.aFloatArray4830[3]
	       + aFloatArray4830[5] * class435_30_.aFloatArray4830[7]
	       + aFloatArray4830[6] * class435_30_.aFloatArray4830[11]
	       + aFloatArray4830[7] * class435_30_.aFloatArray4830[15]);
	float f_38_
	    = (aFloatArray4830[8] * class435_30_.aFloatArray4830[0]
	       + aFloatArray4830[9] * class435_30_.aFloatArray4830[4]
	       + aFloatArray4830[10] * class435_30_.aFloatArray4830[8]
	       + aFloatArray4830[11] * class435_30_.aFloatArray4830[12]);
	float f_39_
	    = (aFloatArray4830[8] * class435_30_.aFloatArray4830[1]
	       + aFloatArray4830[9] * class435_30_.aFloatArray4830[5]
	       + aFloatArray4830[10] * class435_30_.aFloatArray4830[9]
	       + aFloatArray4830[11] * class435_30_.aFloatArray4830[13]);
	float f_40_
	    = (aFloatArray4830[8] * class435_30_.aFloatArray4830[2]
	       + aFloatArray4830[9] * class435_30_.aFloatArray4830[6]
	       + aFloatArray4830[10] * class435_30_.aFloatArray4830[10]
	       + aFloatArray4830[11] * class435_30_.aFloatArray4830[14]);
	float f_41_
	    = (aFloatArray4830[8] * class435_30_.aFloatArray4830[3]
	       + aFloatArray4830[9] * class435_30_.aFloatArray4830[7]
	       + aFloatArray4830[10] * class435_30_.aFloatArray4830[11]
	       + aFloatArray4830[11] * class435_30_.aFloatArray4830[15]);
	float f_42_
	    = (aFloatArray4830[12] * class435_30_.aFloatArray4830[0]
	       + aFloatArray4830[13] * class435_30_.aFloatArray4830[4]
	       + aFloatArray4830[14] * class435_30_.aFloatArray4830[8]
	       + aFloatArray4830[15] * class435_30_.aFloatArray4830[12]);
	float f_43_
	    = (aFloatArray4830[12] * class435_30_.aFloatArray4830[1]
	       + aFloatArray4830[13] * class435_30_.aFloatArray4830[5]
	       + aFloatArray4830[14] * class435_30_.aFloatArray4830[9]
	       + aFloatArray4830[15] * class435_30_.aFloatArray4830[13]);
	float f_44_
	    = (aFloatArray4830[12] * class435_30_.aFloatArray4830[2]
	       + aFloatArray4830[13] * class435_30_.aFloatArray4830[6]
	       + aFloatArray4830[14] * class435_30_.aFloatArray4830[10]
	       + aFloatArray4830[15] * class435_30_.aFloatArray4830[14]);
	float f_45_
	    = (aFloatArray4830[12] * class435_30_.aFloatArray4830[3]
	       + aFloatArray4830[13] * class435_30_.aFloatArray4830[7]
	       + aFloatArray4830[14] * class435_30_.aFloatArray4830[11]
	       + aFloatArray4830[15] * class435_30_.aFloatArray4830[15]);
	aFloatArray4830[0] = f;
	aFloatArray4830[1] = f_31_;
	aFloatArray4830[2] = f_32_;
	aFloatArray4830[3] = f_33_;
	aFloatArray4830[4] = f_34_;
	aFloatArray4830[5] = f_35_;
	aFloatArray4830[6] = f_36_;
	aFloatArray4830[7] = f_37_;
	aFloatArray4830[8] = f_38_;
	aFloatArray4830[9] = f_39_;
	aFloatArray4830[10] = f_40_;
	aFloatArray4830[11] = f_41_;
	aFloatArray4830[12] = f_42_;
	aFloatArray4830[13] = f_43_;
	aFloatArray4830[14] = f_44_;
	aFloatArray4830[15] = f_45_;
    }
    
    public void method6951(float f, float f_46_, float f_47_, float[] fs) {
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_46_
		 + aFloatArray4830[8] * f_47_ + aFloatArray4830[12]);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_46_
		 + aFloatArray4830[9] * f_47_ + aFloatArray4830[13]);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_46_
		 + aFloatArray4830[10] * f_47_ + aFloatArray4830[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4830[3] * f + aFloatArray4830[7] * f_46_
		     + aFloatArray4830[11] * f_47_ + aFloatArray4830[15]);
    }
    
    float method6952() {
	return ((aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[10]
		 * aFloatArray4830[15])
		- (aFloatArray4830[0] * aFloatArray4830[5]
		   * aFloatArray4830[11] * aFloatArray4830[14])
		- (aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[9]
		   * aFloatArray4830[15])
		+ (aFloatArray4830[0] * aFloatArray4830[6]
		   * aFloatArray4830[11] * aFloatArray4830[13])
		+ (aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[9]
		   * aFloatArray4830[14])
		- (aFloatArray4830[0] * aFloatArray4830[7]
		   * aFloatArray4830[10] * aFloatArray4830[13])
		- (aFloatArray4830[1] * aFloatArray4830[4]
		   * aFloatArray4830[10] * aFloatArray4830[15])
		+ (aFloatArray4830[1] * aFloatArray4830[4]
		   * aFloatArray4830[11] * aFloatArray4830[14])
		+ (aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[8]
		   * aFloatArray4830[15])
		- (aFloatArray4830[1] * aFloatArray4830[6]
		   * aFloatArray4830[11] * aFloatArray4830[12])
		- (aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[8]
		   * aFloatArray4830[14])
		+ (aFloatArray4830[1] * aFloatArray4830[7]
		   * aFloatArray4830[10] * aFloatArray4830[12])
		+ (aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[9]
		   * aFloatArray4830[15])
		- (aFloatArray4830[2] * aFloatArray4830[4]
		   * aFloatArray4830[11] * aFloatArray4830[13])
		- (aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[8]
		   * aFloatArray4830[15])
		+ (aFloatArray4830[2] * aFloatArray4830[5]
		   * aFloatArray4830[11] * aFloatArray4830[12])
		+ (aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[8]
		   * aFloatArray4830[13])
		- (aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[9]
		   * aFloatArray4830[12])
		- (aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[9]
		   * aFloatArray4830[14])
		+ (aFloatArray4830[3] * aFloatArray4830[4]
		   * aFloatArray4830[10] * aFloatArray4830[13])
		+ (aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[8]
		   * aFloatArray4830[14])
		- (aFloatArray4830[3] * aFloatArray4830[5]
		   * aFloatArray4830[10] * aFloatArray4830[12])
		- (aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[8]
		   * aFloatArray4830[13])
		+ (aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[9]
		   * aFloatArray4830[12]));
    }
    
    public void method6953() {
	float f = 1.0F / method6952();
	float f_48_
	    = (aFloatArray4830[5] * aFloatArray4830[10] * aFloatArray4830[15]
	       - aFloatArray4830[5] * aFloatArray4830[11] * aFloatArray4830[14]
	       - aFloatArray4830[6] * aFloatArray4830[9] * aFloatArray4830[15]
	       + aFloatArray4830[6] * aFloatArray4830[11] * aFloatArray4830[13]
	       + aFloatArray4830[7] * aFloatArray4830[9] * aFloatArray4830[14]
	       - (aFloatArray4830[7] * aFloatArray4830[10]
		  * aFloatArray4830[13])) * f;
	float f_49_
	    = (-aFloatArray4830[1] * aFloatArray4830[10] * aFloatArray4830[15]
	       + aFloatArray4830[1] * aFloatArray4830[11] * aFloatArray4830[14]
	       + aFloatArray4830[2] * aFloatArray4830[9] * aFloatArray4830[15]
	       - aFloatArray4830[2] * aFloatArray4830[11] * aFloatArray4830[13]
	       - aFloatArray4830[3] * aFloatArray4830[9] * aFloatArray4830[14]
	       + (aFloatArray4830[3] * aFloatArray4830[10]
		  * aFloatArray4830[13])) * f;
	float f_50_
	    = ((aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[15]
		- aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[14]
		- aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[15]
		+ aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[13]
		+ aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[14]
		- (aFloatArray4830[3] * aFloatArray4830[6]
		   * aFloatArray4830[13]))
	       * f);
	float f_51_
	    = ((-aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[11]
		+ aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[10]
		+ aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[11]
		- aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[9]
		- aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[10]
		+ aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[9])
	       * f);
	float f_52_
	    = (-aFloatArray4830[4] * aFloatArray4830[10] * aFloatArray4830[15]
	       + aFloatArray4830[4] * aFloatArray4830[11] * aFloatArray4830[14]
	       + aFloatArray4830[6] * aFloatArray4830[8] * aFloatArray4830[15]
	       - aFloatArray4830[6] * aFloatArray4830[11] * aFloatArray4830[12]
	       - aFloatArray4830[7] * aFloatArray4830[8] * aFloatArray4830[14]
	       + (aFloatArray4830[7] * aFloatArray4830[10]
		  * aFloatArray4830[12])) * f;
	float f_53_
	    = (aFloatArray4830[0] * aFloatArray4830[10] * aFloatArray4830[15]
	       - aFloatArray4830[0] * aFloatArray4830[11] * aFloatArray4830[14]
	       - aFloatArray4830[2] * aFloatArray4830[8] * aFloatArray4830[15]
	       + aFloatArray4830[2] * aFloatArray4830[11] * aFloatArray4830[12]
	       + aFloatArray4830[3] * aFloatArray4830[8] * aFloatArray4830[14]
	       - (aFloatArray4830[3] * aFloatArray4830[10]
		  * aFloatArray4830[12])) * f;
	float f_54_
	    = ((-aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[15]
		+ aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[14]
		+ aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[15]
		- aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[12]
		- aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[14]
		+ (aFloatArray4830[3] * aFloatArray4830[6]
		   * aFloatArray4830[12]))
	       * f);
	float f_55_
	    = ((aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[11]
		- aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[10]
		- aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[11]
		+ aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[8]
		+ aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[10]
		- aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[8])
	       * f);
	float f_56_
	    = (aFloatArray4830[4] * aFloatArray4830[9] * aFloatArray4830[15]
	       - aFloatArray4830[4] * aFloatArray4830[11] * aFloatArray4830[13]
	       - aFloatArray4830[5] * aFloatArray4830[8] * aFloatArray4830[15]
	       + aFloatArray4830[5] * aFloatArray4830[11] * aFloatArray4830[12]
	       + aFloatArray4830[7] * aFloatArray4830[8] * aFloatArray4830[13]
	       - (aFloatArray4830[7] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_57_
	    = (-aFloatArray4830[0] * aFloatArray4830[9] * aFloatArray4830[15]
	       + aFloatArray4830[0] * aFloatArray4830[11] * aFloatArray4830[13]
	       + aFloatArray4830[1] * aFloatArray4830[8] * aFloatArray4830[15]
	       - aFloatArray4830[1] * aFloatArray4830[11] * aFloatArray4830[12]
	       - aFloatArray4830[3] * aFloatArray4830[8] * aFloatArray4830[13]
	       + (aFloatArray4830[3] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_58_
	    = ((aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[15]
		- aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[13]
		- aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[15]
		+ aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[12]
		+ aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[13]
		- (aFloatArray4830[3] * aFloatArray4830[5]
		   * aFloatArray4830[12]))
	       * f);
	float f_59_
	    = ((-aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[11]
		+ aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[9]
		+ aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[11]
		- aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[8]
		- aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[9]
		+ aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[8])
	       * f);
	float f_60_
	    = (-aFloatArray4830[4] * aFloatArray4830[9] * aFloatArray4830[14]
	       + aFloatArray4830[4] * aFloatArray4830[10] * aFloatArray4830[13]
	       + aFloatArray4830[5] * aFloatArray4830[8] * aFloatArray4830[14]
	       - aFloatArray4830[5] * aFloatArray4830[10] * aFloatArray4830[12]
	       - aFloatArray4830[6] * aFloatArray4830[8] * aFloatArray4830[13]
	       + (aFloatArray4830[6] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_61_
	    = (aFloatArray4830[0] * aFloatArray4830[9] * aFloatArray4830[14]
	       - aFloatArray4830[0] * aFloatArray4830[10] * aFloatArray4830[13]
	       - aFloatArray4830[1] * aFloatArray4830[8] * aFloatArray4830[14]
	       + aFloatArray4830[1] * aFloatArray4830[10] * aFloatArray4830[12]
	       + aFloatArray4830[2] * aFloatArray4830[8] * aFloatArray4830[13]
	       - (aFloatArray4830[2] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_62_
	    = ((-aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[14]
		+ aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[13]
		+ aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[14]
		- aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[12]
		- aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[13]
		+ (aFloatArray4830[2] * aFloatArray4830[5]
		   * aFloatArray4830[12]))
	       * f);
	float f_63_
	    = ((aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[10]
		- aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[9]
		- aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[10]
		+ aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[8]
		+ aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[9]
		- aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[8])
	       * f);
	aFloatArray4830[0] = f_48_;
	aFloatArray4830[1] = f_49_;
	aFloatArray4830[2] = f_50_;
	aFloatArray4830[3] = f_51_;
	aFloatArray4830[4] = f_52_;
	aFloatArray4830[5] = f_53_;
	aFloatArray4830[6] = f_54_;
	aFloatArray4830[7] = f_55_;
	aFloatArray4830[8] = f_56_;
	aFloatArray4830[9] = f_57_;
	aFloatArray4830[10] = f_58_;
	aFloatArray4830[11] = f_59_;
	aFloatArray4830[12] = f_60_;
	aFloatArray4830[13] = f_61_;
	aFloatArray4830[14] = f_62_;
	aFloatArray4830[15] = f_63_;
    }
    
    public void method6954(float f, float f_64_, float f_65_, float f_66_) {
	aFloatArray4830[0] = f;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = f_64_;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 0.0F;
	aFloatArray4830[9] = 0.0F;
	aFloatArray4830[10] = f_65_;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 0.0F;
	aFloatArray4830[15] = f_66_;
    }
    
    public boolean method6955() {
	return (aFloatArray4830[0] == 1.0F && aFloatArray4830[1] == 0.0F
		&& aFloatArray4830[2] == 0.0F && aFloatArray4830[3] == 0.0F
		&& aFloatArray4830[4] == 0.0F && aFloatArray4830[5] == 1.0F
		&& aFloatArray4830[6] == 0.0F && aFloatArray4830[7] == 0.0F
		&& aFloatArray4830[8] == 0.0F && aFloatArray4830[9] == 0.0F
		&& aFloatArray4830[10] == 1.0F && aFloatArray4830[11] == 0.0F
		&& aFloatArray4830[12] == 0.0F && aFloatArray4830[13] == 0.0F
		&& aFloatArray4830[14] == 0.0F && aFloatArray4830[15] == 1.0F);
    }
    
    public void method6956(float f, float f_67_, float f_68_, float[] fs) {
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_67_
		 + aFloatArray4830[8] * f_68_ + aFloatArray4830[12]);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_67_
		 + aFloatArray4830[9] * f_68_ + aFloatArray4830[13]);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_67_
		 + aFloatArray4830[10] * f_68_ + aFloatArray4830[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4830[3] * f + aFloatArray4830[7] * f_67_
		     + aFloatArray4830[11] * f_68_ + aFloatArray4830[15]);
    }
    
    public void method6957(float[] fs) {
	float f = fs[0];
	float f_69_ = fs[1];
	float f_70_ = fs[2];
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_69_
		 + aFloatArray4830[8] * f_70_ + aFloatArray4830[12]);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_69_
		 + aFloatArray4830[9] * f_70_ + aFloatArray4830[13]);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_69_
		 + aFloatArray4830[10] * f_70_ + aFloatArray4830[14]);
    }
    
    public void method6958(float f, float f_71_, float f_72_, float[] fs) {
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_71_
		 + aFloatArray4830[8] * f_72_);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_71_
		 + aFloatArray4830[9] * f_72_);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_71_
		 + aFloatArray4830[10] * f_72_);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4830[3] * f + aFloatArray4830[7] * f_71_
		     + aFloatArray4830[11] * f_72_);
    }
    
    public void method6959(float f, float f_73_, float f_74_, float f_75_,
			   float f_76_, float f_77_) {
	aFloatArray4830[0] = 2.0F / (f_73_ - f);
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = 2.0F / (f_75_ - f_74_);
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 0.0F;
	aFloatArray4830[9] = 0.0F;
	aFloatArray4830[10] = 2.0F / (f_77_ - f_76_);
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = -(f_73_ + f) / (f_73_ - f);
	aFloatArray4830[13] = -(f_75_ + f_74_) / (f_75_ - f_74_);
	aFloatArray4830[14] = -(f_77_ + f_76_) / (f_77_ - f_76_);
	aFloatArray4830[15] = 1.0F;
    }
    
    public boolean method6960(Object object) {
	if (!(object instanceof Class435))
	    return false;
	Class435 class435_78_ = (Class435) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4830[i] != class435_78_.aFloatArray4830[i])
		return false;
	}
	return true;
    }
    
    public void method6961(float f, float f_79_, float f_80_) {
	method6959(-10000.0F / f_80_, 10000.0F / f_80_, -10000.0F / f_80_,
		   10000.0F / f_80_, f, f_79_);
    }
    
    void method6962(float f, float f_81_, float f_82_, float f_83_,
		    float f_84_, float f_85_) {
	aFloatArray4830[0] = 2.0F * f_84_ / (f_81_ - f);
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = 2.0F * f_84_ / (f_83_ - f_82_);
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = (f_81_ + f) / (f_81_ - f);
	aFloatArray4830[9] = (f_83_ + f_82_) / (f_83_ - f_82_);
	aFloatArray4830[10] = (f_85_ + f_84_) / (f_85_ - f_84_);
	aFloatArray4830[11] = 1.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = -(2.0F * f_85_ * f_84_) / (f_85_ - f_84_);
	aFloatArray4830[15] = 0.0F;
    }
    
    public void method6963(float f, float f_86_, float f_87_, float f_88_,
			   float f_89_, float f_90_, float f_91_,
			   float f_92_) {
	aFloatArray4830[0] = f_87_ * 2.0F / f_91_;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = f_88_ * 2.0F / f_92_;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 2.0F * f / f_91_ - 1.0F;
	aFloatArray4830[9] = 2.0F * f_86_ / f_92_ - 1.0F;
	aFloatArray4830[10] = (f_90_ + f_89_) / (f_90_ - f_89_);
	aFloatArray4830[11] = 1.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 2.0F * f_90_ * f_89_ / (f_89_ - f_90_);
	aFloatArray4830[15] = 0.0F;
    }
    
    public void method6964(float f, float f_93_, float f_94_, float f_95_) {
	float f_96_ = (float) (Math.tan((double) (f_94_ / 2.0F)) * (double) f);
	float f_97_ = (float) (Math.tan((double) (f_95_ / 2.0F)) * (double) f);
	method6962(-f_96_, f_96_, -f_97_, f_97_, f, f_93_);
    }
    
    public float method6965() {
	return (-(aFloatArray4830[15] + aFloatArray4830[14])
		/ (aFloatArray4830[11] + aFloatArray4830[10]));
    }
    
    public float[] method6966(float[] fs) {
	float f = aFloatArray4830[3] + aFloatArray4830[2];
	float f_98_ = aFloatArray4830[7] + aFloatArray4830[6];
	float f_99_ = aFloatArray4830[11] + aFloatArray4830[10];
	double d = Math.sqrt((double) (f * f + f_98_ * f_98_ + f_99_ * f_99_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_98_ / d);
	fs[2] = (float) ((double) f_99_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] + aFloatArray4830[14])
			 / d);
	return fs;
    }
    
    public float[] method6967(float[] fs) {
	float f = aFloatArray4830[3] + aFloatArray4830[0];
	float f_100_ = aFloatArray4830[7] + aFloatArray4830[4];
	float f_101_ = aFloatArray4830[11] + aFloatArray4830[8];
	double d
	    = Math.sqrt((double) (f * f + f_100_ * f_100_ + f_101_ * f_101_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_100_ / d);
	fs[2] = (float) ((double) f_101_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] + aFloatArray4830[12])
			 / d);
	return fs;
    }
    
    public float[] method6968(float[] fs) {
	float f = aFloatArray4830[3] - aFloatArray4830[0];
	float f_102_ = aFloatArray4830[7] - aFloatArray4830[4];
	float f_103_ = aFloatArray4830[11] - aFloatArray4830[8];
	double d
	    = Math.sqrt((double) (f * f + f_102_ * f_102_ + f_103_ * f_103_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_102_ / d);
	fs[2] = (float) ((double) f_103_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] - aFloatArray4830[12])
			 / d);
	return fs;
    }
    
    public float[] method6969(float[] fs) {
	float f = aFloatArray4830[3] + aFloatArray4830[1];
	float f_104_ = aFloatArray4830[7] + aFloatArray4830[5];
	float f_105_ = aFloatArray4830[11] + aFloatArray4830[9];
	double d
	    = Math.sqrt((double) (f * f + f_104_ * f_104_ + f_105_ * f_105_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_104_ / d);
	fs[2] = (float) ((double) f_105_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] + aFloatArray4830[13])
			 / d);
	return fs;
    }
    
    public float[] method6970(float[] fs) {
	float f = aFloatArray4830[3] - aFloatArray4830[1];
	float f_106_ = aFloatArray4830[7] - aFloatArray4830[5];
	float f_107_ = aFloatArray4830[11] - aFloatArray4830[9];
	double d
	    = Math.sqrt((double) (f * f + f_106_ * f_106_ + f_107_ * f_107_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_106_ / d);
	fs[2] = (float) ((double) f_107_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] - aFloatArray4830[13])
			 / d);
	return fs;
    }
    
    public void method6971(float f, float f_108_, float f_109_, float f_110_,
			   float f_111_, float f_112_, float f_113_,
			   float f_114_) {
	aFloatArray4830[0] = f_109_ * 2.0F / f_113_;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = f_110_ * 2.0F / f_114_;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 2.0F * f / f_113_ - 1.0F;
	aFloatArray4830[9] = 2.0F * f_108_ / f_114_ - 1.0F;
	aFloatArray4830[10] = (f_112_ + f_111_) / (f_112_ - f_111_);
	aFloatArray4830[11] = 1.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 2.0F * f_112_ * f_111_ / (f_111_ - f_112_);
	aFloatArray4830[15] = 0.0F;
    }
    
    public float[] method6972(float[] fs) {
	float f = aFloatArray4830[3] - aFloatArray4830[2];
	float f_115_ = aFloatArray4830[7] - aFloatArray4830[6];
	float f_116_ = aFloatArray4830[11] - aFloatArray4830[10];
	double d
	    = Math.sqrt((double) (f * f + f_115_ * f_115_ + f_116_ * f_116_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_115_ / d);
	fs[2] = (float) ((double) f_116_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] - aFloatArray4830[14])
			 / d);
	return fs;
    }
    
    public void method6973() {
	float f = aFloatArray4830[0];
	float f_117_ = aFloatArray4830[4];
	float f_118_ = aFloatArray4830[8];
	float f_119_ = aFloatArray4830[12];
	float f_120_ = aFloatArray4830[1];
	float f_121_ = aFloatArray4830[5];
	float f_122_ = aFloatArray4830[9];
	float f_123_ = aFloatArray4830[13];
	float f_124_ = aFloatArray4830[2];
	float f_125_ = aFloatArray4830[6];
	float f_126_ = aFloatArray4830[10];
	float f_127_ = aFloatArray4830[14];
	float f_128_ = aFloatArray4830[3];
	float f_129_ = aFloatArray4830[7];
	float f_130_ = aFloatArray4830[11];
	float f_131_ = aFloatArray4830[15];
	aFloatArray4830[0] = f;
	aFloatArray4830[1] = f_117_;
	aFloatArray4830[2] = f_118_;
	aFloatArray4830[3] = f_119_;
	aFloatArray4830[4] = f_120_;
	aFloatArray4830[5] = f_121_;
	aFloatArray4830[6] = f_122_;
	aFloatArray4830[7] = f_123_;
	aFloatArray4830[8] = f_124_;
	aFloatArray4830[9] = f_125_;
	aFloatArray4830[10] = f_126_;
	aFloatArray4830[11] = f_127_;
	aFloatArray4830[12] = f_128_;
	aFloatArray4830[13] = f_129_;
	aFloatArray4830[14] = f_130_;
	aFloatArray4830[15] = f_131_;
    }
    
    public float[] method6974(float[] fs) {
	System.arraycopy(aFloatArray4830, 0, fs, 0, 16);
	return fs;
    }
    
    public void method6975(float f, float f_132_, float f_133_, float f_134_) {
	float f_135_
	    = (float) (Math.tan((double) (f_133_ / 2.0F)) * (double) f);
	float f_136_
	    = (float) (Math.tan((double) (f_134_ / 2.0F)) * (double) f);
	method6962(-f_135_, f_135_, -f_136_, f_136_, f, f_132_);
    }
    
    public float[] method6976(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[1];
	fs[2] = aFloatArray4830[2];
	fs[3] = aFloatArray4830[4];
	fs[4] = aFloatArray4830[5];
	fs[5] = aFloatArray4830[6];
	fs[6] = aFloatArray4830[8];
	fs[7] = aFloatArray4830[9];
	fs[8] = aFloatArray4830[10];
	return fs;
    }
    
    public float[] method6977(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[4];
	fs[2] = aFloatArray4830[8];
	fs[3] = aFloatArray4830[12];
	fs[4] = aFloatArray4830[1];
	fs[5] = aFloatArray4830[5];
	fs[6] = aFloatArray4830[9];
	fs[7] = aFloatArray4830[13];
	fs[8] = aFloatArray4830[2];
	fs[9] = aFloatArray4830[6];
	fs[10] = aFloatArray4830[10];
	fs[11] = aFloatArray4830[14];
	fs[12] = aFloatArray4830[3];
	fs[13] = aFloatArray4830[7];
	fs[14] = aFloatArray4830[11];
	fs[15] = aFloatArray4830[15];
	return fs;
    }
    
    public void method6978(float f, float f_137_, float f_138_, float[] fs) {
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_137_
		 + aFloatArray4830[8] * f_138_);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_137_
		 + aFloatArray4830[9] * f_138_);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_137_
		 + aFloatArray4830[10] * f_138_);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4830[3] * f + aFloatArray4830[7] * f_137_
		     + aFloatArray4830[11] * f_138_);
    }
    
    public float[] method6979(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[4];
	fs[2] = aFloatArray4830[8];
	fs[3] = aFloatArray4830[12];
	fs[4] = aFloatArray4830[1];
	fs[5] = aFloatArray4830[5];
	fs[6] = aFloatArray4830[9];
	fs[7] = aFloatArray4830[13];
	return fs;
    }
    
    public float[] method6980(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[1];
	fs[2] = 0.0F;
	fs[3] = 0.0F;
	fs[4] = aFloatArray4830[4];
	fs[5] = aFloatArray4830[5];
	fs[6] = 0.0F;
	fs[7] = 0.0F;
	fs[8] = aFloatArray4830[12];
	fs[9] = aFloatArray4830[13];
	fs[10] = aFloatArray4830[14];
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public float method6981() {
	return (-(aFloatArray4830[15] + aFloatArray4830[14])
		/ (aFloatArray4830[11] + aFloatArray4830[10]));
    }
    
    public String toString() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_139_ = 0; i_139_ < 4; i_139_++) {
		if (i_139_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4830[i * 4 + i_139_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public int hashCode() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4830);
	return i;
    }
    
    public float[] method6982(float[] fs) {
	System.arraycopy(aFloatArray4830, 0, fs, 0, 16);
	fs[3] = 0.0F;
	fs[7] = 0.0F;
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public void method6983() {
	float f = 1.0F / method6952();
	float f_140_
	    = (aFloatArray4830[5] * aFloatArray4830[10] * aFloatArray4830[15]
	       - aFloatArray4830[5] * aFloatArray4830[11] * aFloatArray4830[14]
	       - aFloatArray4830[6] * aFloatArray4830[9] * aFloatArray4830[15]
	       + aFloatArray4830[6] * aFloatArray4830[11] * aFloatArray4830[13]
	       + aFloatArray4830[7] * aFloatArray4830[9] * aFloatArray4830[14]
	       - (aFloatArray4830[7] * aFloatArray4830[10]
		  * aFloatArray4830[13])) * f;
	float f_141_
	    = (-aFloatArray4830[1] * aFloatArray4830[10] * aFloatArray4830[15]
	       + aFloatArray4830[1] * aFloatArray4830[11] * aFloatArray4830[14]
	       + aFloatArray4830[2] * aFloatArray4830[9] * aFloatArray4830[15]
	       - aFloatArray4830[2] * aFloatArray4830[11] * aFloatArray4830[13]
	       - aFloatArray4830[3] * aFloatArray4830[9] * aFloatArray4830[14]
	       + (aFloatArray4830[3] * aFloatArray4830[10]
		  * aFloatArray4830[13])) * f;
	float f_142_
	    = ((aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[15]
		- aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[14]
		- aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[15]
		+ aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[13]
		+ aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[14]
		- (aFloatArray4830[3] * aFloatArray4830[6]
		   * aFloatArray4830[13]))
	       * f);
	float f_143_
	    = ((-aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[11]
		+ aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[10]
		+ aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[11]
		- aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[9]
		- aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[10]
		+ aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[9])
	       * f);
	float f_144_
	    = (-aFloatArray4830[4] * aFloatArray4830[10] * aFloatArray4830[15]
	       + aFloatArray4830[4] * aFloatArray4830[11] * aFloatArray4830[14]
	       + aFloatArray4830[6] * aFloatArray4830[8] * aFloatArray4830[15]
	       - aFloatArray4830[6] * aFloatArray4830[11] * aFloatArray4830[12]
	       - aFloatArray4830[7] * aFloatArray4830[8] * aFloatArray4830[14]
	       + (aFloatArray4830[7] * aFloatArray4830[10]
		  * aFloatArray4830[12])) * f;
	float f_145_
	    = (aFloatArray4830[0] * aFloatArray4830[10] * aFloatArray4830[15]
	       - aFloatArray4830[0] * aFloatArray4830[11] * aFloatArray4830[14]
	       - aFloatArray4830[2] * aFloatArray4830[8] * aFloatArray4830[15]
	       + aFloatArray4830[2] * aFloatArray4830[11] * aFloatArray4830[12]
	       + aFloatArray4830[3] * aFloatArray4830[8] * aFloatArray4830[14]
	       - (aFloatArray4830[3] * aFloatArray4830[10]
		  * aFloatArray4830[12])) * f;
	float f_146_
	    = ((-aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[15]
		+ aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[14]
		+ aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[15]
		- aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[12]
		- aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[14]
		+ (aFloatArray4830[3] * aFloatArray4830[6]
		   * aFloatArray4830[12]))
	       * f);
	float f_147_
	    = ((aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[11]
		- aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[10]
		- aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[11]
		+ aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[8]
		+ aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[10]
		- aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[8])
	       * f);
	float f_148_
	    = (aFloatArray4830[4] * aFloatArray4830[9] * aFloatArray4830[15]
	       - aFloatArray4830[4] * aFloatArray4830[11] * aFloatArray4830[13]
	       - aFloatArray4830[5] * aFloatArray4830[8] * aFloatArray4830[15]
	       + aFloatArray4830[5] * aFloatArray4830[11] * aFloatArray4830[12]
	       + aFloatArray4830[7] * aFloatArray4830[8] * aFloatArray4830[13]
	       - (aFloatArray4830[7] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_149_
	    = (-aFloatArray4830[0] * aFloatArray4830[9] * aFloatArray4830[15]
	       + aFloatArray4830[0] * aFloatArray4830[11] * aFloatArray4830[13]
	       + aFloatArray4830[1] * aFloatArray4830[8] * aFloatArray4830[15]
	       - aFloatArray4830[1] * aFloatArray4830[11] * aFloatArray4830[12]
	       - aFloatArray4830[3] * aFloatArray4830[8] * aFloatArray4830[13]
	       + (aFloatArray4830[3] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_150_
	    = ((aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[15]
		- aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[13]
		- aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[15]
		+ aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[12]
		+ aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[13]
		- (aFloatArray4830[3] * aFloatArray4830[5]
		   * aFloatArray4830[12]))
	       * f);
	float f_151_
	    = ((-aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[11]
		+ aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[9]
		+ aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[11]
		- aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[8]
		- aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[9]
		+ aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[8])
	       * f);
	float f_152_
	    = (-aFloatArray4830[4] * aFloatArray4830[9] * aFloatArray4830[14]
	       + aFloatArray4830[4] * aFloatArray4830[10] * aFloatArray4830[13]
	       + aFloatArray4830[5] * aFloatArray4830[8] * aFloatArray4830[14]
	       - aFloatArray4830[5] * aFloatArray4830[10] * aFloatArray4830[12]
	       - aFloatArray4830[6] * aFloatArray4830[8] * aFloatArray4830[13]
	       + (aFloatArray4830[6] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_153_
	    = (aFloatArray4830[0] * aFloatArray4830[9] * aFloatArray4830[14]
	       - aFloatArray4830[0] * aFloatArray4830[10] * aFloatArray4830[13]
	       - aFloatArray4830[1] * aFloatArray4830[8] * aFloatArray4830[14]
	       + aFloatArray4830[1] * aFloatArray4830[10] * aFloatArray4830[12]
	       + aFloatArray4830[2] * aFloatArray4830[8] * aFloatArray4830[13]
	       - (aFloatArray4830[2] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_154_
	    = ((-aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[14]
		+ aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[13]
		+ aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[14]
		- aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[12]
		- aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[13]
		+ (aFloatArray4830[2] * aFloatArray4830[5]
		   * aFloatArray4830[12]))
	       * f);
	float f_155_
	    = ((aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[10]
		- aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[9]
		- aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[10]
		+ aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[8]
		+ aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[9]
		- aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[8])
	       * f);
	aFloatArray4830[0] = f_140_;
	aFloatArray4830[1] = f_141_;
	aFloatArray4830[2] = f_142_;
	aFloatArray4830[3] = f_143_;
	aFloatArray4830[4] = f_144_;
	aFloatArray4830[5] = f_145_;
	aFloatArray4830[6] = f_146_;
	aFloatArray4830[7] = f_147_;
	aFloatArray4830[8] = f_148_;
	aFloatArray4830[9] = f_149_;
	aFloatArray4830[10] = f_150_;
	aFloatArray4830[11] = f_151_;
	aFloatArray4830[12] = f_152_;
	aFloatArray4830[13] = f_153_;
	aFloatArray4830[14] = f_154_;
	aFloatArray4830[15] = f_155_;
    }
    
    public void method6984() {
	float f = 1.0F / method6952();
	float f_156_
	    = (aFloatArray4830[5] * aFloatArray4830[10] * aFloatArray4830[15]
	       - aFloatArray4830[5] * aFloatArray4830[11] * aFloatArray4830[14]
	       - aFloatArray4830[6] * aFloatArray4830[9] * aFloatArray4830[15]
	       + aFloatArray4830[6] * aFloatArray4830[11] * aFloatArray4830[13]
	       + aFloatArray4830[7] * aFloatArray4830[9] * aFloatArray4830[14]
	       - (aFloatArray4830[7] * aFloatArray4830[10]
		  * aFloatArray4830[13])) * f;
	float f_157_
	    = (-aFloatArray4830[1] * aFloatArray4830[10] * aFloatArray4830[15]
	       + aFloatArray4830[1] * aFloatArray4830[11] * aFloatArray4830[14]
	       + aFloatArray4830[2] * aFloatArray4830[9] * aFloatArray4830[15]
	       - aFloatArray4830[2] * aFloatArray4830[11] * aFloatArray4830[13]
	       - aFloatArray4830[3] * aFloatArray4830[9] * aFloatArray4830[14]
	       + (aFloatArray4830[3] * aFloatArray4830[10]
		  * aFloatArray4830[13])) * f;
	float f_158_
	    = ((aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[15]
		- aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[14]
		- aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[15]
		+ aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[13]
		+ aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[14]
		- (aFloatArray4830[3] * aFloatArray4830[6]
		   * aFloatArray4830[13]))
	       * f);
	float f_159_
	    = ((-aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[11]
		+ aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[10]
		+ aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[11]
		- aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[9]
		- aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[10]
		+ aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[9])
	       * f);
	float f_160_
	    = (-aFloatArray4830[4] * aFloatArray4830[10] * aFloatArray4830[15]
	       + aFloatArray4830[4] * aFloatArray4830[11] * aFloatArray4830[14]
	       + aFloatArray4830[6] * aFloatArray4830[8] * aFloatArray4830[15]
	       - aFloatArray4830[6] * aFloatArray4830[11] * aFloatArray4830[12]
	       - aFloatArray4830[7] * aFloatArray4830[8] * aFloatArray4830[14]
	       + (aFloatArray4830[7] * aFloatArray4830[10]
		  * aFloatArray4830[12])) * f;
	float f_161_
	    = (aFloatArray4830[0] * aFloatArray4830[10] * aFloatArray4830[15]
	       - aFloatArray4830[0] * aFloatArray4830[11] * aFloatArray4830[14]
	       - aFloatArray4830[2] * aFloatArray4830[8] * aFloatArray4830[15]
	       + aFloatArray4830[2] * aFloatArray4830[11] * aFloatArray4830[12]
	       + aFloatArray4830[3] * aFloatArray4830[8] * aFloatArray4830[14]
	       - (aFloatArray4830[3] * aFloatArray4830[10]
		  * aFloatArray4830[12])) * f;
	float f_162_
	    = ((-aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[15]
		+ aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[14]
		+ aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[15]
		- aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[12]
		- aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[14]
		+ (aFloatArray4830[3] * aFloatArray4830[6]
		   * aFloatArray4830[12]))
	       * f);
	float f_163_
	    = ((aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[11]
		- aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[10]
		- aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[11]
		+ aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[8]
		+ aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[10]
		- aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[8])
	       * f);
	float f_164_
	    = (aFloatArray4830[4] * aFloatArray4830[9] * aFloatArray4830[15]
	       - aFloatArray4830[4] * aFloatArray4830[11] * aFloatArray4830[13]
	       - aFloatArray4830[5] * aFloatArray4830[8] * aFloatArray4830[15]
	       + aFloatArray4830[5] * aFloatArray4830[11] * aFloatArray4830[12]
	       + aFloatArray4830[7] * aFloatArray4830[8] * aFloatArray4830[13]
	       - (aFloatArray4830[7] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_165_
	    = (-aFloatArray4830[0] * aFloatArray4830[9] * aFloatArray4830[15]
	       + aFloatArray4830[0] * aFloatArray4830[11] * aFloatArray4830[13]
	       + aFloatArray4830[1] * aFloatArray4830[8] * aFloatArray4830[15]
	       - aFloatArray4830[1] * aFloatArray4830[11] * aFloatArray4830[12]
	       - aFloatArray4830[3] * aFloatArray4830[8] * aFloatArray4830[13]
	       + (aFloatArray4830[3] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_166_
	    = ((aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[15]
		- aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[13]
		- aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[15]
		+ aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[12]
		+ aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[13]
		- (aFloatArray4830[3] * aFloatArray4830[5]
		   * aFloatArray4830[12]))
	       * f);
	float f_167_
	    = ((-aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[11]
		+ aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[9]
		+ aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[11]
		- aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[8]
		- aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[9]
		+ aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[8])
	       * f);
	float f_168_
	    = (-aFloatArray4830[4] * aFloatArray4830[9] * aFloatArray4830[14]
	       + aFloatArray4830[4] * aFloatArray4830[10] * aFloatArray4830[13]
	       + aFloatArray4830[5] * aFloatArray4830[8] * aFloatArray4830[14]
	       - aFloatArray4830[5] * aFloatArray4830[10] * aFloatArray4830[12]
	       - aFloatArray4830[6] * aFloatArray4830[8] * aFloatArray4830[13]
	       + (aFloatArray4830[6] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_169_
	    = (aFloatArray4830[0] * aFloatArray4830[9] * aFloatArray4830[14]
	       - aFloatArray4830[0] * aFloatArray4830[10] * aFloatArray4830[13]
	       - aFloatArray4830[1] * aFloatArray4830[8] * aFloatArray4830[14]
	       + aFloatArray4830[1] * aFloatArray4830[10] * aFloatArray4830[12]
	       + aFloatArray4830[2] * aFloatArray4830[8] * aFloatArray4830[13]
	       - (aFloatArray4830[2] * aFloatArray4830[9]
		  * aFloatArray4830[12])) * f;
	float f_170_
	    = ((-aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[14]
		+ aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[13]
		+ aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[14]
		- aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[12]
		- aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[13]
		+ (aFloatArray4830[2] * aFloatArray4830[5]
		   * aFloatArray4830[12]))
	       * f);
	float f_171_
	    = ((aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[10]
		- aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[9]
		- aFloatArray4830[1] * aFloatArray4830[4] * aFloatArray4830[10]
		+ aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[8]
		+ aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[9]
		- aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[8])
	       * f);
	aFloatArray4830[0] = f_156_;
	aFloatArray4830[1] = f_157_;
	aFloatArray4830[2] = f_158_;
	aFloatArray4830[3] = f_159_;
	aFloatArray4830[4] = f_160_;
	aFloatArray4830[5] = f_161_;
	aFloatArray4830[6] = f_162_;
	aFloatArray4830[7] = f_163_;
	aFloatArray4830[8] = f_164_;
	aFloatArray4830[9] = f_165_;
	aFloatArray4830[10] = f_166_;
	aFloatArray4830[11] = f_167_;
	aFloatArray4830[12] = f_168_;
	aFloatArray4830[13] = f_169_;
	aFloatArray4830[14] = f_170_;
	aFloatArray4830[15] = f_171_;
    }
    
    public boolean method6985(Object object) {
	if (!(object instanceof Class435))
	    return false;
	Class435 class435_172_ = (Class435) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4830[i] != class435_172_.aFloatArray4830[i])
		return false;
	}
	return true;
    }
    
    public float method6986() {
	return (-(aFloatArray4830[15] + aFloatArray4830[14])
		/ (aFloatArray4830[11] + aFloatArray4830[10]));
    }
    
    public boolean method6987(Object object) {
	if (!(object instanceof Class435))
	    return false;
	Class435 class435_173_ = (Class435) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4830[i] != class435_173_.aFloatArray4830[i])
		return false;
	}
	return true;
    }
    
    public boolean equals(Object object) {
	if (!(object instanceof Class435))
	    return false;
	Class435 class435_174_ = (Class435) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4830[i] != class435_174_.aFloatArray4830[i])
		return false;
	}
	return true;
    }
    
    public void method6988(float f, float f_175_, float f_176_, float f_177_,
			   float f_178_, float f_179_, float f_180_,
			   float f_181_) {
	aFloatArray4830[0] = f_176_ * 2.0F / f_180_;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = f_177_ * 2.0F / f_181_;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 2.0F * f / f_180_ - 1.0F;
	aFloatArray4830[9] = 2.0F * f_175_ / f_181_ - 1.0F;
	aFloatArray4830[10] = (f_179_ + f_178_) / (f_179_ - f_178_);
	aFloatArray4830[11] = 1.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 2.0F * f_179_ * f_178_ / (f_178_ - f_179_);
	aFloatArray4830[15] = 0.0F;
    }
    
    public int method6989() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4830);
	return i;
    }
    
    public int method6990() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4830);
	return i;
    }
    
    public String method6991() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_182_ = 0; i_182_ < 4; i_182_++) {
		if (i_182_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4830[i * 4 + i_182_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public void method6992(Class444 class444) {
	aFloatArray4830[0] = class444.aFloat4879;
	aFloatArray4830[1] = class444.aFloat4878;
	aFloatArray4830[2] = class444.aFloat4881;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = class444.aFloat4882;
	aFloatArray4830[5] = class444.aFloat4883;
	aFloatArray4830[6] = class444.aFloat4890;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = class444.aFloat4885;
	aFloatArray4830[9] = class444.aFloat4884;
	aFloatArray4830[10] = class444.aFloat4887;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = class444.aFloat4888;
	aFloatArray4830[13] = class444.aFloat4886;
	aFloatArray4830[14] = class444.aFloat4880;
	aFloatArray4830[15] = 1.0F;
    }
    
    public void method6993(int i, int i_183_, int i_184_, float f,
			   float f_185_, float f_186_) {
	if (i != 0) {
	    float f_187_ = Class431.aFloatArray4819[i & 0x3fff];
	    float f_188_ = Class431.aFloatArray4818[i & 0x3fff];
	    aFloatArray4830[0] = f_187_ * (float) i_183_;
	    aFloatArray4830[5] = f_187_ * (float) i_184_;
	    aFloatArray4830[1] = f_188_ * (float) i_183_;
	    aFloatArray4830[4] = -f_188_ * (float) i_184_;
	    aFloatArray4830[10] = 1.0F;
	    float[] fs = aFloatArray4830;
	    float[] fs_189_ = aFloatArray4830;
	    float[] fs_190_ = aFloatArray4830;
	    aFloatArray4830[9] = 0.0F;
	    fs_190_[8] = 0.0F;
	    fs_189_[6] = 0.0F;
	    fs[2] = 0.0F;
	} else {
	    aFloatArray4830[0] = (float) i_183_;
	    aFloatArray4830[5] = (float) i_184_;
	    aFloatArray4830[10] = 1.0F;
	    float[] fs = aFloatArray4830;
	    float[] fs_191_ = aFloatArray4830;
	    float[] fs_192_ = aFloatArray4830;
	    float[] fs_193_ = aFloatArray4830;
	    float[] fs_194_ = aFloatArray4830;
	    aFloatArray4830[9] = 0.0F;
	    fs_194_[8] = 0.0F;
	    fs_193_[6] = 0.0F;
	    fs_192_[4] = 0.0F;
	    fs_191_[2] = 0.0F;
	    fs[1] = 0.0F;
	}
	float[] fs = aFloatArray4830;
	float[] fs_195_ = aFloatArray4830;
	aFloatArray4830[11] = 0.0F;
	fs_195_[7] = 0.0F;
	fs[3] = 0.0F;
	aFloatArray4830[15] = 1.0F;
	aFloatArray4830[12] = f;
	aFloatArray4830[13] = f_185_;
	aFloatArray4830[14] = f_186_;
    }
    
    public void method6994() {
	aFloatArray4830[0] = 1.0F;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = 1.0F;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 0.0F;
	aFloatArray4830[9] = 0.0F;
	aFloatArray4830[10] = 1.0F;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 0.0F;
	aFloatArray4830[15] = 1.0F;
    }
    
    public boolean method6995(Object object) {
	if (!(object instanceof Class435))
	    return false;
	Class435 class435_196_ = (Class435) object;
	for (int i = 0; i < 16; i++) {
	    if (aFloatArray4830[i] != class435_196_.aFloatArray4830[i])
		return false;
	}
	return true;
    }
    
    public void method6996(Class435 class435_197_) {
	System.arraycopy(class435_197_.aFloatArray4830, 0, aFloatArray4830, 0,
			 16);
    }
    
    public void method6997(Class435 class435_198_) {
	System.arraycopy(class435_198_.aFloatArray4830, 0, aFloatArray4830, 0,
			 16);
    }
    
    public void method6998(Class435 class435_199_) {
	System.arraycopy(class435_199_.aFloatArray4830, 0, aFloatArray4830, 0,
			 11);
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 0.0F;
	aFloatArray4830[15] = 1.0F;
    }
    
    public void method6999(Class435 class435_200_) {
	System.arraycopy(class435_200_.aFloatArray4830, 0, aFloatArray4830, 0,
			 11);
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 0.0F;
	aFloatArray4830[15] = 1.0F;
    }
    
    public void method7000(Class435 class435_201_) {
	System.arraycopy(class435_201_.aFloatArray4830, 0, aFloatArray4830, 0,
			 11);
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 0.0F;
	aFloatArray4830[15] = 1.0F;
    }
    
    public void method7001(float f, float f_202_, float f_203_, float f_204_,
			   float f_205_, float f_206_, float f_207_,
			   float f_208_, float f_209_) {
	method6959(-(f * f_209_) / f_203_, f_209_ * (f_207_ - f) / f_203_,
		   -(f_202_ * f_209_) / f_204_,
		   f_209_ * (f_208_ - f_202_) / f_204_, f_205_, f_206_);
    }
    
    public void method7002(Class435 class435_210_) {
	float f = (aFloatArray4830[0] * class435_210_.aFloatArray4830[0]
		   + aFloatArray4830[1] * class435_210_.aFloatArray4830[4]
		   + aFloatArray4830[2] * class435_210_.aFloatArray4830[8]
		   + aFloatArray4830[3] * class435_210_.aFloatArray4830[12]);
	float f_211_
	    = (aFloatArray4830[0] * class435_210_.aFloatArray4830[1]
	       + aFloatArray4830[1] * class435_210_.aFloatArray4830[5]
	       + aFloatArray4830[2] * class435_210_.aFloatArray4830[9]
	       + aFloatArray4830[3] * class435_210_.aFloatArray4830[13]);
	float f_212_
	    = (aFloatArray4830[0] * class435_210_.aFloatArray4830[2]
	       + aFloatArray4830[1] * class435_210_.aFloatArray4830[6]
	       + aFloatArray4830[2] * class435_210_.aFloatArray4830[10]
	       + aFloatArray4830[3] * class435_210_.aFloatArray4830[14]);
	float f_213_
	    = (aFloatArray4830[0] * class435_210_.aFloatArray4830[3]
	       + aFloatArray4830[1] * class435_210_.aFloatArray4830[7]
	       + aFloatArray4830[2] * class435_210_.aFloatArray4830[11]
	       + aFloatArray4830[3] * class435_210_.aFloatArray4830[15]);
	float f_214_
	    = (aFloatArray4830[4] * class435_210_.aFloatArray4830[0]
	       + aFloatArray4830[5] * class435_210_.aFloatArray4830[4]
	       + aFloatArray4830[6] * class435_210_.aFloatArray4830[8]
	       + aFloatArray4830[7] * class435_210_.aFloatArray4830[12]);
	float f_215_
	    = (aFloatArray4830[4] * class435_210_.aFloatArray4830[1]
	       + aFloatArray4830[5] * class435_210_.aFloatArray4830[5]
	       + aFloatArray4830[6] * class435_210_.aFloatArray4830[9]
	       + aFloatArray4830[7] * class435_210_.aFloatArray4830[13]);
	float f_216_
	    = (aFloatArray4830[4] * class435_210_.aFloatArray4830[2]
	       + aFloatArray4830[5] * class435_210_.aFloatArray4830[6]
	       + aFloatArray4830[6] * class435_210_.aFloatArray4830[10]
	       + aFloatArray4830[7] * class435_210_.aFloatArray4830[14]);
	float f_217_
	    = (aFloatArray4830[4] * class435_210_.aFloatArray4830[3]
	       + aFloatArray4830[5] * class435_210_.aFloatArray4830[7]
	       + aFloatArray4830[6] * class435_210_.aFloatArray4830[11]
	       + aFloatArray4830[7] * class435_210_.aFloatArray4830[15]);
	float f_218_
	    = (aFloatArray4830[8] * class435_210_.aFloatArray4830[0]
	       + aFloatArray4830[9] * class435_210_.aFloatArray4830[4]
	       + aFloatArray4830[10] * class435_210_.aFloatArray4830[8]
	       + aFloatArray4830[11] * class435_210_.aFloatArray4830[12]);
	float f_219_
	    = (aFloatArray4830[8] * class435_210_.aFloatArray4830[1]
	       + aFloatArray4830[9] * class435_210_.aFloatArray4830[5]
	       + aFloatArray4830[10] * class435_210_.aFloatArray4830[9]
	       + aFloatArray4830[11] * class435_210_.aFloatArray4830[13]);
	float f_220_
	    = (aFloatArray4830[8] * class435_210_.aFloatArray4830[2]
	       + aFloatArray4830[9] * class435_210_.aFloatArray4830[6]
	       + aFloatArray4830[10] * class435_210_.aFloatArray4830[10]
	       + aFloatArray4830[11] * class435_210_.aFloatArray4830[14]);
	float f_221_
	    = (aFloatArray4830[8] * class435_210_.aFloatArray4830[3]
	       + aFloatArray4830[9] * class435_210_.aFloatArray4830[7]
	       + aFloatArray4830[10] * class435_210_.aFloatArray4830[11]
	       + aFloatArray4830[11] * class435_210_.aFloatArray4830[15]);
	float f_222_
	    = (aFloatArray4830[12] * class435_210_.aFloatArray4830[0]
	       + aFloatArray4830[13] * class435_210_.aFloatArray4830[4]
	       + aFloatArray4830[14] * class435_210_.aFloatArray4830[8]
	       + aFloatArray4830[15] * class435_210_.aFloatArray4830[12]);
	float f_223_
	    = (aFloatArray4830[12] * class435_210_.aFloatArray4830[1]
	       + aFloatArray4830[13] * class435_210_.aFloatArray4830[5]
	       + aFloatArray4830[14] * class435_210_.aFloatArray4830[9]
	       + aFloatArray4830[15] * class435_210_.aFloatArray4830[13]);
	float f_224_
	    = (aFloatArray4830[12] * class435_210_.aFloatArray4830[2]
	       + aFloatArray4830[13] * class435_210_.aFloatArray4830[6]
	       + aFloatArray4830[14] * class435_210_.aFloatArray4830[10]
	       + aFloatArray4830[15] * class435_210_.aFloatArray4830[14]);
	float f_225_
	    = (aFloatArray4830[12] * class435_210_.aFloatArray4830[3]
	       + aFloatArray4830[13] * class435_210_.aFloatArray4830[7]
	       + aFloatArray4830[14] * class435_210_.aFloatArray4830[11]
	       + aFloatArray4830[15] * class435_210_.aFloatArray4830[15]);
	aFloatArray4830[0] = f;
	aFloatArray4830[1] = f_211_;
	aFloatArray4830[2] = f_212_;
	aFloatArray4830[3] = f_213_;
	aFloatArray4830[4] = f_214_;
	aFloatArray4830[5] = f_215_;
	aFloatArray4830[6] = f_216_;
	aFloatArray4830[7] = f_217_;
	aFloatArray4830[8] = f_218_;
	aFloatArray4830[9] = f_219_;
	aFloatArray4830[10] = f_220_;
	aFloatArray4830[11] = f_221_;
	aFloatArray4830[12] = f_222_;
	aFloatArray4830[13] = f_223_;
	aFloatArray4830[14] = f_224_;
	aFloatArray4830[15] = f_225_;
    }
    
    public void method7003(Class444 class444) {
	aFloatArray4830[0] = class444.aFloat4879;
	aFloatArray4830[1] = class444.aFloat4878;
	aFloatArray4830[2] = class444.aFloat4881;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = class444.aFloat4882;
	aFloatArray4830[5] = class444.aFloat4883;
	aFloatArray4830[6] = class444.aFloat4890;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = class444.aFloat4885;
	aFloatArray4830[9] = class444.aFloat4884;
	aFloatArray4830[10] = class444.aFloat4887;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = class444.aFloat4888;
	aFloatArray4830[13] = class444.aFloat4886;
	aFloatArray4830[14] = class444.aFloat4880;
	aFloatArray4830[15] = 1.0F;
    }
    
    public void method7004() {
	aFloatArray4830[0] = 1.0F;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = 1.0F;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 0.0F;
	aFloatArray4830[9] = 0.0F;
	aFloatArray4830[10] = 1.0F;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 0.0F;
	aFloatArray4830[15] = 1.0F;
    }
    
    float method7005() {
	return ((aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[10]
		 * aFloatArray4830[15])
		- (aFloatArray4830[0] * aFloatArray4830[5]
		   * aFloatArray4830[11] * aFloatArray4830[14])
		- (aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[9]
		   * aFloatArray4830[15])
		+ (aFloatArray4830[0] * aFloatArray4830[6]
		   * aFloatArray4830[11] * aFloatArray4830[13])
		+ (aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[9]
		   * aFloatArray4830[14])
		- (aFloatArray4830[0] * aFloatArray4830[7]
		   * aFloatArray4830[10] * aFloatArray4830[13])
		- (aFloatArray4830[1] * aFloatArray4830[4]
		   * aFloatArray4830[10] * aFloatArray4830[15])
		+ (aFloatArray4830[1] * aFloatArray4830[4]
		   * aFloatArray4830[11] * aFloatArray4830[14])
		+ (aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[8]
		   * aFloatArray4830[15])
		- (aFloatArray4830[1] * aFloatArray4830[6]
		   * aFloatArray4830[11] * aFloatArray4830[12])
		- (aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[8]
		   * aFloatArray4830[14])
		+ (aFloatArray4830[1] * aFloatArray4830[7]
		   * aFloatArray4830[10] * aFloatArray4830[12])
		+ (aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[9]
		   * aFloatArray4830[15])
		- (aFloatArray4830[2] * aFloatArray4830[4]
		   * aFloatArray4830[11] * aFloatArray4830[13])
		- (aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[8]
		   * aFloatArray4830[15])
		+ (aFloatArray4830[2] * aFloatArray4830[5]
		   * aFloatArray4830[11] * aFloatArray4830[12])
		+ (aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[8]
		   * aFloatArray4830[13])
		- (aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[9]
		   * aFloatArray4830[12])
		- (aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[9]
		   * aFloatArray4830[14])
		+ (aFloatArray4830[3] * aFloatArray4830[4]
		   * aFloatArray4830[10] * aFloatArray4830[13])
		+ (aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[8]
		   * aFloatArray4830[14])
		- (aFloatArray4830[3] * aFloatArray4830[5]
		   * aFloatArray4830[10] * aFloatArray4830[12])
		- (aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[8]
		   * aFloatArray4830[13])
		+ (aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[9]
		   * aFloatArray4830[12]));
    }
    
    void method7006(float f, float f_226_, float f_227_, float f_228_,
		    float f_229_, float f_230_) {
	aFloatArray4830[0] = 2.0F * f_229_ / (f_226_ - f);
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = 2.0F * f_229_ / (f_228_ - f_227_);
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = (f_226_ + f) / (f_226_ - f);
	aFloatArray4830[9] = (f_228_ + f_227_) / (f_228_ - f_227_);
	aFloatArray4830[10] = (f_230_ + f_229_) / (f_230_ - f_229_);
	aFloatArray4830[11] = 1.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = -(2.0F * f_230_ * f_229_) / (f_230_ - f_229_);
	aFloatArray4830[15] = 0.0F;
    }
    
    float method7007() {
	return ((aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[10]
		 * aFloatArray4830[15])
		- (aFloatArray4830[0] * aFloatArray4830[5]
		   * aFloatArray4830[11] * aFloatArray4830[14])
		- (aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[9]
		   * aFloatArray4830[15])
		+ (aFloatArray4830[0] * aFloatArray4830[6]
		   * aFloatArray4830[11] * aFloatArray4830[13])
		+ (aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[9]
		   * aFloatArray4830[14])
		- (aFloatArray4830[0] * aFloatArray4830[7]
		   * aFloatArray4830[10] * aFloatArray4830[13])
		- (aFloatArray4830[1] * aFloatArray4830[4]
		   * aFloatArray4830[10] * aFloatArray4830[15])
		+ (aFloatArray4830[1] * aFloatArray4830[4]
		   * aFloatArray4830[11] * aFloatArray4830[14])
		+ (aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[8]
		   * aFloatArray4830[15])
		- (aFloatArray4830[1] * aFloatArray4830[6]
		   * aFloatArray4830[11] * aFloatArray4830[12])
		- (aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[8]
		   * aFloatArray4830[14])
		+ (aFloatArray4830[1] * aFloatArray4830[7]
		   * aFloatArray4830[10] * aFloatArray4830[12])
		+ (aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[9]
		   * aFloatArray4830[15])
		- (aFloatArray4830[2] * aFloatArray4830[4]
		   * aFloatArray4830[11] * aFloatArray4830[13])
		- (aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[8]
		   * aFloatArray4830[15])
		+ (aFloatArray4830[2] * aFloatArray4830[5]
		   * aFloatArray4830[11] * aFloatArray4830[12])
		+ (aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[8]
		   * aFloatArray4830[13])
		- (aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[9]
		   * aFloatArray4830[12])
		- (aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[9]
		   * aFloatArray4830[14])
		+ (aFloatArray4830[3] * aFloatArray4830[4]
		   * aFloatArray4830[10] * aFloatArray4830[13])
		+ (aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[8]
		   * aFloatArray4830[14])
		- (aFloatArray4830[3] * aFloatArray4830[5]
		   * aFloatArray4830[10] * aFloatArray4830[12])
		- (aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[8]
		   * aFloatArray4830[13])
		+ (aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[9]
		   * aFloatArray4830[12]));
    }
    
    public float[] method7008(float[] fs) {
	System.arraycopy(aFloatArray4830, 0, fs, 0, 16);
	return fs;
    }
    
    public void method7009(float f, float f_231_, float f_232_, float f_233_,
			   float f_234_, float f_235_) {
	aFloatArray4830[0] = 2.0F / (f_231_ - f);
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = 2.0F / (f_233_ - f_232_);
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 0.0F;
	aFloatArray4830[9] = 0.0F;
	aFloatArray4830[10] = 2.0F / (f_235_ - f_234_);
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = -(f_231_ + f) / (f_231_ - f);
	aFloatArray4830[13] = -(f_233_ + f_232_) / (f_233_ - f_232_);
	aFloatArray4830[14] = -(f_235_ + f_234_) / (f_235_ - f_234_);
	aFloatArray4830[15] = 1.0F;
    }
    
    public void method7010(float f, float f_236_, float f_237_, float f_238_) {
	aFloatArray4830[0] = f;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = f_236_;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 0.0F;
	aFloatArray4830[9] = 0.0F;
	aFloatArray4830[10] = f_237_;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 0.0F;
	aFloatArray4830[15] = f_238_;
    }
    
    public float[] method7011(float[] fs) {
	float f = aFloatArray4830[3] - aFloatArray4830[0];
	float f_239_ = aFloatArray4830[7] - aFloatArray4830[4];
	float f_240_ = aFloatArray4830[11] - aFloatArray4830[8];
	double d
	    = Math.sqrt((double) (f * f + f_239_ * f_239_ + f_240_ * f_240_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_239_ / d);
	fs[2] = (float) ((double) f_240_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] - aFloatArray4830[12])
			 / d);
	return fs;
    }
    
    public void method7012(Class435 class435_241_, Class435 class435_242_) {
	float f = ((class435_241_.aFloatArray4830[0]
		    * class435_242_.aFloatArray4830[0])
		   + (class435_241_.aFloatArray4830[1]
		      * class435_242_.aFloatArray4830[4])
		   + (class435_241_.aFloatArray4830[2]
		      * class435_242_.aFloatArray4830[8])
		   + (class435_241_.aFloatArray4830[3]
		      * class435_242_.aFloatArray4830[12]));
	float f_243_ = ((class435_241_.aFloatArray4830[0]
			 * class435_242_.aFloatArray4830[1])
			+ (class435_241_.aFloatArray4830[1]
			   * class435_242_.aFloatArray4830[5])
			+ (class435_241_.aFloatArray4830[2]
			   * class435_242_.aFloatArray4830[9])
			+ (class435_241_.aFloatArray4830[3]
			   * class435_242_.aFloatArray4830[13]));
	float f_244_ = ((class435_241_.aFloatArray4830[0]
			 * class435_242_.aFloatArray4830[2])
			+ (class435_241_.aFloatArray4830[1]
			   * class435_242_.aFloatArray4830[6])
			+ (class435_241_.aFloatArray4830[2]
			   * class435_242_.aFloatArray4830[10])
			+ (class435_241_.aFloatArray4830[3]
			   * class435_242_.aFloatArray4830[14]));
	float f_245_ = ((class435_241_.aFloatArray4830[0]
			 * class435_242_.aFloatArray4830[3])
			+ (class435_241_.aFloatArray4830[1]
			   * class435_242_.aFloatArray4830[7])
			+ (class435_241_.aFloatArray4830[2]
			   * class435_242_.aFloatArray4830[11])
			+ (class435_241_.aFloatArray4830[3]
			   * class435_242_.aFloatArray4830[15]));
	float f_246_ = ((class435_241_.aFloatArray4830[4]
			 * class435_242_.aFloatArray4830[0])
			+ (class435_241_.aFloatArray4830[5]
			   * class435_242_.aFloatArray4830[4])
			+ (class435_241_.aFloatArray4830[6]
			   * class435_242_.aFloatArray4830[8])
			+ (class435_241_.aFloatArray4830[7]
			   * class435_242_.aFloatArray4830[12]));
	float f_247_ = ((class435_241_.aFloatArray4830[4]
			 * class435_242_.aFloatArray4830[1])
			+ (class435_241_.aFloatArray4830[5]
			   * class435_242_.aFloatArray4830[5])
			+ (class435_241_.aFloatArray4830[6]
			   * class435_242_.aFloatArray4830[9])
			+ (class435_241_.aFloatArray4830[7]
			   * class435_242_.aFloatArray4830[13]));
	float f_248_ = ((class435_241_.aFloatArray4830[4]
			 * class435_242_.aFloatArray4830[2])
			+ (class435_241_.aFloatArray4830[5]
			   * class435_242_.aFloatArray4830[6])
			+ (class435_241_.aFloatArray4830[6]
			   * class435_242_.aFloatArray4830[10])
			+ (class435_241_.aFloatArray4830[7]
			   * class435_242_.aFloatArray4830[14]));
	float f_249_ = ((class435_241_.aFloatArray4830[4]
			 * class435_242_.aFloatArray4830[3])
			+ (class435_241_.aFloatArray4830[5]
			   * class435_242_.aFloatArray4830[7])
			+ (class435_241_.aFloatArray4830[6]
			   * class435_242_.aFloatArray4830[11])
			+ (class435_241_.aFloatArray4830[7]
			   * class435_242_.aFloatArray4830[15]));
	float f_250_ = ((class435_241_.aFloatArray4830[8]
			 * class435_242_.aFloatArray4830[0])
			+ (class435_241_.aFloatArray4830[9]
			   * class435_242_.aFloatArray4830[4])
			+ (class435_241_.aFloatArray4830[10]
			   * class435_242_.aFloatArray4830[8])
			+ (class435_241_.aFloatArray4830[11]
			   * class435_242_.aFloatArray4830[12]));
	float f_251_ = ((class435_241_.aFloatArray4830[8]
			 * class435_242_.aFloatArray4830[1])
			+ (class435_241_.aFloatArray4830[9]
			   * class435_242_.aFloatArray4830[5])
			+ (class435_241_.aFloatArray4830[10]
			   * class435_242_.aFloatArray4830[9])
			+ (class435_241_.aFloatArray4830[11]
			   * class435_242_.aFloatArray4830[13]));
	float f_252_ = ((class435_241_.aFloatArray4830[8]
			 * class435_242_.aFloatArray4830[2])
			+ (class435_241_.aFloatArray4830[9]
			   * class435_242_.aFloatArray4830[6])
			+ (class435_241_.aFloatArray4830[10]
			   * class435_242_.aFloatArray4830[10])
			+ (class435_241_.aFloatArray4830[11]
			   * class435_242_.aFloatArray4830[14]));
	float f_253_ = ((class435_241_.aFloatArray4830[8]
			 * class435_242_.aFloatArray4830[3])
			+ (class435_241_.aFloatArray4830[9]
			   * class435_242_.aFloatArray4830[7])
			+ (class435_241_.aFloatArray4830[10]
			   * class435_242_.aFloatArray4830[11])
			+ (class435_241_.aFloatArray4830[11]
			   * class435_242_.aFloatArray4830[15]));
	float f_254_ = ((class435_241_.aFloatArray4830[12]
			 * class435_242_.aFloatArray4830[0])
			+ (class435_241_.aFloatArray4830[13]
			   * class435_242_.aFloatArray4830[4])
			+ (class435_241_.aFloatArray4830[14]
			   * class435_242_.aFloatArray4830[8])
			+ (class435_241_.aFloatArray4830[15]
			   * class435_242_.aFloatArray4830[12]));
	float f_255_ = ((class435_241_.aFloatArray4830[12]
			 * class435_242_.aFloatArray4830[1])
			+ (class435_241_.aFloatArray4830[13]
			   * class435_242_.aFloatArray4830[5])
			+ (class435_241_.aFloatArray4830[14]
			   * class435_242_.aFloatArray4830[9])
			+ (class435_241_.aFloatArray4830[15]
			   * class435_242_.aFloatArray4830[13]));
	float f_256_ = ((class435_241_.aFloatArray4830[12]
			 * class435_242_.aFloatArray4830[2])
			+ (class435_241_.aFloatArray4830[13]
			   * class435_242_.aFloatArray4830[6])
			+ (class435_241_.aFloatArray4830[14]
			   * class435_242_.aFloatArray4830[10])
			+ (class435_241_.aFloatArray4830[15]
			   * class435_242_.aFloatArray4830[14]));
	float f_257_ = ((class435_241_.aFloatArray4830[12]
			 * class435_242_.aFloatArray4830[3])
			+ (class435_241_.aFloatArray4830[13]
			   * class435_242_.aFloatArray4830[7])
			+ (class435_241_.aFloatArray4830[14]
			   * class435_242_.aFloatArray4830[11])
			+ (class435_241_.aFloatArray4830[15]
			   * class435_242_.aFloatArray4830[15]));
	aFloatArray4830[0] = f;
	aFloatArray4830[1] = f_243_;
	aFloatArray4830[2] = f_244_;
	aFloatArray4830[3] = f_245_;
	aFloatArray4830[4] = f_246_;
	aFloatArray4830[5] = f_247_;
	aFloatArray4830[6] = f_248_;
	aFloatArray4830[7] = f_249_;
	aFloatArray4830[8] = f_250_;
	aFloatArray4830[9] = f_251_;
	aFloatArray4830[10] = f_252_;
	aFloatArray4830[11] = f_253_;
	aFloatArray4830[12] = f_254_;
	aFloatArray4830[13] = f_255_;
	aFloatArray4830[14] = f_256_;
	aFloatArray4830[15] = f_257_;
    }
    
    public float[] method7013(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[4];
	fs[2] = aFloatArray4830[8];
	fs[3] = aFloatArray4830[12];
	fs[4] = aFloatArray4830[1];
	fs[5] = aFloatArray4830[5];
	fs[6] = aFloatArray4830[9];
	fs[7] = aFloatArray4830[13];
	return fs;
    }
    
    public void method7014(float f, float f_258_, float f_259_, float[] fs) {
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_258_
		 + aFloatArray4830[8] * f_259_ + aFloatArray4830[12]);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_258_
		 + aFloatArray4830[9] * f_259_ + aFloatArray4830[13]);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_258_
		 + aFloatArray4830[10] * f_259_ + aFloatArray4830[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4830[3] * f + aFloatArray4830[7] * f_258_
		     + aFloatArray4830[11] * f_259_ + aFloatArray4830[15]);
    }
    
    public void method7015(float f, float f_260_, float f_261_, float[] fs) {
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_260_
		 + aFloatArray4830[8] * f_261_ + aFloatArray4830[12]);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_260_
		 + aFloatArray4830[9] * f_261_ + aFloatArray4830[13]);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_260_
		 + aFloatArray4830[10] * f_261_ + aFloatArray4830[14]);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4830[3] * f + aFloatArray4830[7] * f_260_
		     + aFloatArray4830[11] * f_261_ + aFloatArray4830[15]);
    }
    
    public String method7016() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_262_ = 0; i_262_ < 4; i_262_++) {
		if (i_262_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4830[i * 4 + i_262_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public String method7017() {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i = 0; i < 4; i++) {
	    for (int i_263_ = 0; i_263_ < 4; i_263_++) {
		if (i_263_ > 0)
		    stringbuilder.append("\t");
		stringbuilder.append(aFloatArray4830[i * 4 + i_263_]);
	    }
	    stringbuilder.append("\n");
	}
	return stringbuilder.toString();
    }
    
    public void method7018(float[] fs) {
	float f = fs[0];
	float f_264_ = fs[1];
	float f_265_ = fs[2];
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_264_
		 + aFloatArray4830[8] * f_265_ + aFloatArray4830[12]);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_264_
		 + aFloatArray4830[9] * f_265_ + aFloatArray4830[13]);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_264_
		 + aFloatArray4830[10] * f_265_ + aFloatArray4830[14]);
    }
    
    public void method7019(float[] fs) {
	float f = fs[0];
	float f_266_ = fs[1];
	float f_267_ = fs[2];
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_266_
		 + aFloatArray4830[8] * f_267_ + aFloatArray4830[12]);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_266_
		 + aFloatArray4830[9] * f_267_ + aFloatArray4830[13]);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_266_
		 + aFloatArray4830[10] * f_267_ + aFloatArray4830[14]);
    }
    
    public void method7020(float f, float f_268_, float f_269_, float[] fs) {
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_268_
		 + aFloatArray4830[8] * f_269_);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_268_
		 + aFloatArray4830[9] * f_269_);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_268_
		 + aFloatArray4830[10] * f_269_);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4830[3] * f + aFloatArray4830[7] * f_268_
		     + aFloatArray4830[11] * f_269_);
    }
    
    public float[] method7021(float[] fs) {
	float f = aFloatArray4830[3] - aFloatArray4830[0];
	float f_270_ = aFloatArray4830[7] - aFloatArray4830[4];
	float f_271_ = aFloatArray4830[11] - aFloatArray4830[8];
	double d
	    = Math.sqrt((double) (f * f + f_270_ * f_270_ + f_271_ * f_271_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_270_ / d);
	fs[2] = (float) ((double) f_271_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] - aFloatArray4830[12])
			 / d);
	return fs;
    }
    
    public void method7022(float f, float f_272_, float f_273_, float[] fs) {
	fs[0] = (aFloatArray4830[0] * f + aFloatArray4830[4] * f_272_
		 + aFloatArray4830[8] * f_273_);
	fs[1] = (aFloatArray4830[1] * f + aFloatArray4830[5] * f_272_
		 + aFloatArray4830[9] * f_273_);
	fs[2] = (aFloatArray4830[2] * f + aFloatArray4830[6] * f_272_
		 + aFloatArray4830[10] * f_273_);
	if (fs.length > 3)
	    fs[3] = (aFloatArray4830[3] * f + aFloatArray4830[7] * f_272_
		     + aFloatArray4830[11] * f_273_);
    }
    
    public void method7023() {
	aFloatArray4830[0] = 1.0F;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = 1.0F;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 0.0F;
	aFloatArray4830[9] = 0.0F;
	aFloatArray4830[10] = 1.0F;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 0.0F;
	aFloatArray4830[15] = 1.0F;
    }
    
    public void method7024(float f, float f_274_, float f_275_, float f_276_,
			   float f_277_, float f_278_) {
	aFloatArray4830[0] = 2.0F / (f_274_ - f);
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = 2.0F / (f_276_ - f_275_);
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 0.0F;
	aFloatArray4830[9] = 0.0F;
	aFloatArray4830[10] = 2.0F / (f_278_ - f_277_);
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = -(f_274_ + f) / (f_274_ - f);
	aFloatArray4830[13] = -(f_276_ + f_275_) / (f_276_ - f_275_);
	aFloatArray4830[14] = -(f_278_ + f_277_) / (f_278_ - f_277_);
	aFloatArray4830[15] = 1.0F;
    }
    
    public void method7025(float f, float f_279_, float f_280_, float f_281_) {
	float f_282_
	    = (float) (Math.tan((double) (f_280_ / 2.0F)) * (double) f);
	float f_283_
	    = (float) (Math.tan((double) (f_281_ / 2.0F)) * (double) f);
	method6962(-f_282_, f_282_, -f_283_, f_283_, f, f_279_);
    }
    
    public boolean method7026() {
	return (aFloatArray4830[0] == 1.0F && aFloatArray4830[1] == 0.0F
		&& aFloatArray4830[2] == 0.0F && aFloatArray4830[3] == 0.0F
		&& aFloatArray4830[4] == 0.0F && aFloatArray4830[5] == 1.0F
		&& aFloatArray4830[6] == 0.0F && aFloatArray4830[7] == 0.0F
		&& aFloatArray4830[8] == 0.0F && aFloatArray4830[9] == 0.0F
		&& aFloatArray4830[10] == 1.0F && aFloatArray4830[11] == 0.0F
		&& aFloatArray4830[12] == 0.0F && aFloatArray4830[13] == 0.0F
		&& aFloatArray4830[14] == 0.0F && aFloatArray4830[15] == 1.0F);
    }
    
    float method7027() {
	return ((aFloatArray4830[0] * aFloatArray4830[5] * aFloatArray4830[10]
		 * aFloatArray4830[15])
		- (aFloatArray4830[0] * aFloatArray4830[5]
		   * aFloatArray4830[11] * aFloatArray4830[14])
		- (aFloatArray4830[0] * aFloatArray4830[6] * aFloatArray4830[9]
		   * aFloatArray4830[15])
		+ (aFloatArray4830[0] * aFloatArray4830[6]
		   * aFloatArray4830[11] * aFloatArray4830[13])
		+ (aFloatArray4830[0] * aFloatArray4830[7] * aFloatArray4830[9]
		   * aFloatArray4830[14])
		- (aFloatArray4830[0] * aFloatArray4830[7]
		   * aFloatArray4830[10] * aFloatArray4830[13])
		- (aFloatArray4830[1] * aFloatArray4830[4]
		   * aFloatArray4830[10] * aFloatArray4830[15])
		+ (aFloatArray4830[1] * aFloatArray4830[4]
		   * aFloatArray4830[11] * aFloatArray4830[14])
		+ (aFloatArray4830[1] * aFloatArray4830[6] * aFloatArray4830[8]
		   * aFloatArray4830[15])
		- (aFloatArray4830[1] * aFloatArray4830[6]
		   * aFloatArray4830[11] * aFloatArray4830[12])
		- (aFloatArray4830[1] * aFloatArray4830[7] * aFloatArray4830[8]
		   * aFloatArray4830[14])
		+ (aFloatArray4830[1] * aFloatArray4830[7]
		   * aFloatArray4830[10] * aFloatArray4830[12])
		+ (aFloatArray4830[2] * aFloatArray4830[4] * aFloatArray4830[9]
		   * aFloatArray4830[15])
		- (aFloatArray4830[2] * aFloatArray4830[4]
		   * aFloatArray4830[11] * aFloatArray4830[13])
		- (aFloatArray4830[2] * aFloatArray4830[5] * aFloatArray4830[8]
		   * aFloatArray4830[15])
		+ (aFloatArray4830[2] * aFloatArray4830[5]
		   * aFloatArray4830[11] * aFloatArray4830[12])
		+ (aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[8]
		   * aFloatArray4830[13])
		- (aFloatArray4830[2] * aFloatArray4830[7] * aFloatArray4830[9]
		   * aFloatArray4830[12])
		- (aFloatArray4830[3] * aFloatArray4830[4] * aFloatArray4830[9]
		   * aFloatArray4830[14])
		+ (aFloatArray4830[3] * aFloatArray4830[4]
		   * aFloatArray4830[10] * aFloatArray4830[13])
		+ (aFloatArray4830[3] * aFloatArray4830[5] * aFloatArray4830[8]
		   * aFloatArray4830[14])
		- (aFloatArray4830[3] * aFloatArray4830[5]
		   * aFloatArray4830[10] * aFloatArray4830[12])
		- (aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[8]
		   * aFloatArray4830[13])
		+ (aFloatArray4830[3] * aFloatArray4830[6] * aFloatArray4830[9]
		   * aFloatArray4830[12]));
    }
    
    public void method7028(float f, float f_284_, float f_285_) {
	method6959(-10000.0F / f_285_, 10000.0F / f_285_, -10000.0F / f_285_,
		   10000.0F / f_285_, f, f_284_);
    }
    
    public void method7029(float f, float f_286_, float f_287_) {
	method6959(-10000.0F / f_287_, 10000.0F / f_287_, -10000.0F / f_287_,
		   10000.0F / f_287_, f, f_286_);
    }
    
    public float[] method7030(float[] fs) {
	float f = aFloatArray4830[3] - aFloatArray4830[1];
	float f_288_ = aFloatArray4830[7] - aFloatArray4830[5];
	float f_289_ = aFloatArray4830[11] - aFloatArray4830[9];
	double d
	    = Math.sqrt((double) (f * f + f_288_ * f_288_ + f_289_ * f_289_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_288_ / d);
	fs[2] = (float) ((double) f_289_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] - aFloatArray4830[13])
			 / d);
	return fs;
    }
    
    void method7031(float f, float f_290_, float f_291_, float f_292_,
		    float f_293_, float f_294_) {
	aFloatArray4830[0] = 2.0F * f_293_ / (f_290_ - f);
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = 2.0F * f_293_ / (f_292_ - f_291_);
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = (f_290_ + f) / (f_290_ - f);
	aFloatArray4830[9] = (f_292_ + f_291_) / (f_292_ - f_291_);
	aFloatArray4830[10] = (f_294_ + f_293_) / (f_294_ - f_293_);
	aFloatArray4830[11] = 1.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = -(2.0F * f_294_ * f_293_) / (f_294_ - f_293_);
	aFloatArray4830[15] = 0.0F;
    }
    
    public float[] method7032(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[1];
	fs[2] = aFloatArray4830[4];
	fs[3] = aFloatArray4830[5];
	fs[4] = aFloatArray4830[8];
	fs[5] = aFloatArray4830[9];
	fs[6] = aFloatArray4830[12];
	fs[7] = aFloatArray4830[13];
	return fs;
    }
    
    public boolean method7033() {
	return (aFloatArray4830[0] == 1.0F && aFloatArray4830[1] == 0.0F
		&& aFloatArray4830[2] == 0.0F && aFloatArray4830[3] == 0.0F
		&& aFloatArray4830[4] == 0.0F && aFloatArray4830[5] == 1.0F
		&& aFloatArray4830[6] == 0.0F && aFloatArray4830[7] == 0.0F
		&& aFloatArray4830[8] == 0.0F && aFloatArray4830[9] == 0.0F
		&& aFloatArray4830[10] == 1.0F && aFloatArray4830[11] == 0.0F
		&& aFloatArray4830[12] == 0.0F && aFloatArray4830[13] == 0.0F
		&& aFloatArray4830[14] == 0.0F && aFloatArray4830[15] == 1.0F);
    }
    
    public void method7034(float f, float f_295_, float f_296_, float f_297_,
			   float f_298_, float f_299_, float f_300_,
			   float f_301_) {
	aFloatArray4830[0] = f_296_ * 2.0F / f_300_;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = f_297_ * 2.0F / f_301_;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 2.0F * f / f_300_ - 1.0F;
	aFloatArray4830[9] = 2.0F * f_295_ / f_301_ - 1.0F;
	aFloatArray4830[10] = (f_299_ + f_298_) / (f_299_ - f_298_);
	aFloatArray4830[11] = 1.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 2.0F * f_299_ * f_298_ / (f_298_ - f_299_);
	aFloatArray4830[15] = 0.0F;
    }
    
    public void method7035(Class435 class435_302_) {
	System.arraycopy(class435_302_.aFloatArray4830, 0, aFloatArray4830, 0,
			 11);
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 0.0F;
	aFloatArray4830[15] = 1.0F;
    }
    
    public void method7036(float f, float f_303_, float f_304_, float f_305_,
			   float f_306_, float f_307_, float f_308_,
			   float f_309_) {
	aFloatArray4830[0] = f_304_ * 2.0F / f_308_;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = f_305_ * 2.0F / f_309_;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 2.0F * f / f_308_ - 1.0F;
	aFloatArray4830[9] = 2.0F * f_303_ / f_309_ - 1.0F;
	aFloatArray4830[10] = (f_307_ + f_306_) / (f_307_ - f_306_);
	aFloatArray4830[11] = 1.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 2.0F * f_307_ * f_306_ / (f_306_ - f_307_);
	aFloatArray4830[15] = 0.0F;
    }
    
    public void method7037(float f, float f_310_, float f_311_, float f_312_,
			   float f_313_, float f_314_, float f_315_,
			   float f_316_) {
	aFloatArray4830[0] = f_311_ * 2.0F / f_315_;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = f_312_ * 2.0F / f_316_;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 2.0F * f / f_315_ - 1.0F;
	aFloatArray4830[9] = 2.0F * f_310_ / f_316_ - 1.0F;
	aFloatArray4830[10] = (f_314_ + f_313_) / (f_314_ - f_313_);
	aFloatArray4830[11] = 1.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 2.0F * f_314_ * f_313_ / (f_313_ - f_314_);
	aFloatArray4830[15] = 0.0F;
    }
    
    public void method7038(float f, float f_317_, float f_318_, float f_319_,
			   float f_320_, float f_321_, float f_322_,
			   float f_323_, float f_324_) {
	method6959(-(f * f_324_) / f_318_, f_324_ * (f_322_ - f) / f_318_,
		   -(f_317_ * f_324_) / f_319_,
		   f_324_ * (f_323_ - f_317_) / f_319_, f_320_, f_321_);
    }
    
    public void method7039(float f, float f_325_, float f_326_) {
	method6959(-10000.0F / f_326_, 10000.0F / f_326_, -10000.0F / f_326_,
		   10000.0F / f_326_, f, f_325_);
    }
    
    public void method7040(Class444 class444) {
	aFloatArray4830[0] = class444.aFloat4879;
	aFloatArray4830[1] = class444.aFloat4878;
	aFloatArray4830[2] = class444.aFloat4881;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = class444.aFloat4882;
	aFloatArray4830[5] = class444.aFloat4883;
	aFloatArray4830[6] = class444.aFloat4890;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = class444.aFloat4885;
	aFloatArray4830[9] = class444.aFloat4884;
	aFloatArray4830[10] = class444.aFloat4887;
	aFloatArray4830[11] = 0.0F;
	aFloatArray4830[12] = class444.aFloat4888;
	aFloatArray4830[13] = class444.aFloat4886;
	aFloatArray4830[14] = class444.aFloat4880;
	aFloatArray4830[15] = 1.0F;
    }
    
    public float method7041() {
	return ((aFloatArray4830[14] - aFloatArray4830[15])
		/ (aFloatArray4830[11] - aFloatArray4830[10]));
    }
    
    public float method7042() {
	return (-(aFloatArray4830[15] + aFloatArray4830[14])
		/ (aFloatArray4830[11] + aFloatArray4830[10]));
    }
    
    public float method7043() {
	return ((aFloatArray4830[14] - aFloatArray4830[15])
		/ (aFloatArray4830[11] - aFloatArray4830[10]));
    }
    
    public float method7044() {
	return ((aFloatArray4830[14] - aFloatArray4830[15])
		/ (aFloatArray4830[11] - aFloatArray4830[10]));
    }
    
    public float[] method7045(float[] fs) {
	float f = aFloatArray4830[3] + aFloatArray4830[0];
	float f_327_ = aFloatArray4830[7] + aFloatArray4830[4];
	float f_328_ = aFloatArray4830[11] + aFloatArray4830[8];
	double d
	    = Math.sqrt((double) (f * f + f_327_ * f_327_ + f_328_ * f_328_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_327_ / d);
	fs[2] = (float) ((double) f_328_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] + aFloatArray4830[12])
			 / d);
	return fs;
    }
    
    public float[] method7046(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[1];
	fs[2] = aFloatArray4830[4];
	fs[3] = aFloatArray4830[5];
	fs[4] = aFloatArray4830[8];
	fs[5] = aFloatArray4830[9];
	fs[6] = aFloatArray4830[12];
	fs[7] = aFloatArray4830[13];
	return fs;
    }
    
    public boolean method7047() {
	return (aFloatArray4830[0] == 1.0F && aFloatArray4830[1] == 0.0F
		&& aFloatArray4830[2] == 0.0F && aFloatArray4830[3] == 0.0F
		&& aFloatArray4830[4] == 0.0F && aFloatArray4830[5] == 1.0F
		&& aFloatArray4830[6] == 0.0F && aFloatArray4830[7] == 0.0F
		&& aFloatArray4830[8] == 0.0F && aFloatArray4830[9] == 0.0F
		&& aFloatArray4830[10] == 1.0F && aFloatArray4830[11] == 0.0F
		&& aFloatArray4830[12] == 0.0F && aFloatArray4830[13] == 0.0F
		&& aFloatArray4830[14] == 0.0F && aFloatArray4830[15] == 1.0F);
    }
    
    public Class435() {
	aFloatArray4830 = new float[16];
	method7023();
    }
    
    public float[] method7048(float[] fs) {
	float f = aFloatArray4830[3] + aFloatArray4830[1];
	float f_329_ = aFloatArray4830[7] + aFloatArray4830[5];
	float f_330_ = aFloatArray4830[11] + aFloatArray4830[9];
	double d
	    = Math.sqrt((double) (f * f + f_329_ * f_329_ + f_330_ * f_330_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_329_ / d);
	fs[2] = (float) ((double) f_330_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] + aFloatArray4830[13])
			 / d);
	return fs;
    }
    
    public float[] method7049(float[] fs) {
	float f = aFloatArray4830[3] + aFloatArray4830[1];
	float f_331_ = aFloatArray4830[7] + aFloatArray4830[5];
	float f_332_ = aFloatArray4830[11] + aFloatArray4830[9];
	double d
	    = Math.sqrt((double) (f * f + f_331_ * f_331_ + f_332_ * f_332_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_331_ / d);
	fs[2] = (float) ((double) f_332_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] + aFloatArray4830[13])
			 / d);
	return fs;
    }
    
    public void method7050(int i, int i_333_, int i_334_, float f,
			   float f_335_, float f_336_) {
	if (i != 0) {
	    float f_337_ = Class431.aFloatArray4819[i & 0x3fff];
	    float f_338_ = Class431.aFloatArray4818[i & 0x3fff];
	    aFloatArray4830[0] = f_337_ * (float) i_333_;
	    aFloatArray4830[5] = f_337_ * (float) i_334_;
	    aFloatArray4830[1] = f_338_ * (float) i_333_;
	    aFloatArray4830[4] = -f_338_ * (float) i_334_;
	    aFloatArray4830[10] = 1.0F;
	    float[] fs = aFloatArray4830;
	    float[] fs_339_ = aFloatArray4830;
	    float[] fs_340_ = aFloatArray4830;
	    aFloatArray4830[9] = 0.0F;
	    fs_340_[8] = 0.0F;
	    fs_339_[6] = 0.0F;
	    fs[2] = 0.0F;
	} else {
	    aFloatArray4830[0] = (float) i_333_;
	    aFloatArray4830[5] = (float) i_334_;
	    aFloatArray4830[10] = 1.0F;
	    float[] fs = aFloatArray4830;
	    float[] fs_341_ = aFloatArray4830;
	    float[] fs_342_ = aFloatArray4830;
	    float[] fs_343_ = aFloatArray4830;
	    float[] fs_344_ = aFloatArray4830;
	    aFloatArray4830[9] = 0.0F;
	    fs_344_[8] = 0.0F;
	    fs_343_[6] = 0.0F;
	    fs_342_[4] = 0.0F;
	    fs_341_[2] = 0.0F;
	    fs[1] = 0.0F;
	}
	float[] fs = aFloatArray4830;
	float[] fs_345_ = aFloatArray4830;
	aFloatArray4830[11] = 0.0F;
	fs_345_[7] = 0.0F;
	fs[3] = 0.0F;
	aFloatArray4830[15] = 1.0F;
	aFloatArray4830[12] = f;
	aFloatArray4830[13] = f_335_;
	aFloatArray4830[14] = f_336_;
    }
    
    public float[] method7051(float[] fs) {
	float f = aFloatArray4830[3] - aFloatArray4830[1];
	float f_346_ = aFloatArray4830[7] - aFloatArray4830[5];
	float f_347_ = aFloatArray4830[11] - aFloatArray4830[9];
	double d
	    = Math.sqrt((double) (f * f + f_346_ * f_346_ + f_347_ * f_347_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_346_ / d);
	fs[2] = (float) ((double) f_347_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] - aFloatArray4830[13])
			 / d);
	return fs;
    }
    
    public float[] method7052(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[1];
	fs[2] = aFloatArray4830[4];
	fs[3] = aFloatArray4830[5];
	fs[4] = aFloatArray4830[8];
	fs[5] = aFloatArray4830[9];
	fs[6] = aFloatArray4830[12];
	fs[7] = aFloatArray4830[13];
	return fs;
    }
    
    public float[] method7053(float[] fs) {
	float f = aFloatArray4830[3] - aFloatArray4830[2];
	float f_348_ = aFloatArray4830[7] - aFloatArray4830[6];
	float f_349_ = aFloatArray4830[11] - aFloatArray4830[10];
	double d
	    = Math.sqrt((double) (f * f + f_348_ * f_348_ + f_349_ * f_349_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_348_ / d);
	fs[2] = (float) ((double) f_349_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] - aFloatArray4830[14])
			 / d);
	return fs;
    }
    
    public float[] method7054(float[] fs) {
	float f = aFloatArray4830[3] - aFloatArray4830[2];
	float f_350_ = aFloatArray4830[7] - aFloatArray4830[6];
	float f_351_ = aFloatArray4830[11] - aFloatArray4830[10];
	double d
	    = Math.sqrt((double) (f * f + f_350_ * f_350_ + f_351_ * f_351_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_350_ / d);
	fs[2] = (float) ((double) f_351_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] - aFloatArray4830[14])
			 / d);
	return fs;
    }
    
    public int method7055() {
	int i = 1;
	i = 31 * i + Arrays.hashCode(aFloatArray4830);
	return i;
    }
    
    public float[] method7056(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[1];
	fs[2] = aFloatArray4830[2];
	fs[3] = aFloatArray4830[4];
	fs[4] = aFloatArray4830[5];
	fs[5] = aFloatArray4830[6];
	fs[6] = aFloatArray4830[8];
	fs[7] = aFloatArray4830[9];
	fs[8] = aFloatArray4830[10];
	return fs;
    }
    
    public void method7057(float f, float f_352_, float f_353_, float f_354_,
			   float f_355_, float f_356_, float f_357_,
			   float f_358_) {
	aFloatArray4830[0] = f_353_ * 2.0F / f_357_;
	aFloatArray4830[1] = 0.0F;
	aFloatArray4830[2] = 0.0F;
	aFloatArray4830[3] = 0.0F;
	aFloatArray4830[4] = 0.0F;
	aFloatArray4830[5] = f_354_ * 2.0F / f_358_;
	aFloatArray4830[6] = 0.0F;
	aFloatArray4830[7] = 0.0F;
	aFloatArray4830[8] = 2.0F * f / f_357_ - 1.0F;
	aFloatArray4830[9] = 2.0F * f_352_ / f_358_ - 1.0F;
	aFloatArray4830[10] = (f_356_ + f_355_) / (f_356_ - f_355_);
	aFloatArray4830[11] = 1.0F;
	aFloatArray4830[12] = 0.0F;
	aFloatArray4830[13] = 0.0F;
	aFloatArray4830[14] = 2.0F * f_356_ * f_355_ / (f_355_ - f_356_);
	aFloatArray4830[15] = 0.0F;
    }
    
    public float[] method7058(float[] fs) {
	System.arraycopy(aFloatArray4830, 0, fs, 0, 16);
	return fs;
    }
    
    public float[] method7059(float[] fs) {
	System.arraycopy(aFloatArray4830, 0, fs, 0, 16);
	fs[3] = 0.0F;
	fs[7] = 0.0F;
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public float[] method7060(float[] fs) {
	System.arraycopy(aFloatArray4830, 0, fs, 0, 16);
	fs[3] = 0.0F;
	fs[7] = 0.0F;
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public float[] method7061(float[] fs) {
	float f = aFloatArray4830[3] + aFloatArray4830[2];
	float f_359_ = aFloatArray4830[7] + aFloatArray4830[6];
	float f_360_ = aFloatArray4830[11] + aFloatArray4830[10];
	double d
	    = Math.sqrt((double) (f * f + f_359_ * f_359_ + f_360_ * f_360_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_359_ / d);
	fs[2] = (float) ((double) f_360_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] + aFloatArray4830[14])
			 / d);
	return fs;
    }
    
    public float[] method7062(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[4];
	fs[2] = aFloatArray4830[8];
	fs[3] = aFloatArray4830[12];
	fs[4] = aFloatArray4830[1];
	fs[5] = aFloatArray4830[5];
	fs[6] = aFloatArray4830[9];
	fs[7] = aFloatArray4830[13];
	fs[8] = aFloatArray4830[2];
	fs[9] = aFloatArray4830[6];
	fs[10] = aFloatArray4830[10];
	fs[11] = aFloatArray4830[14];
	fs[12] = aFloatArray4830[3];
	fs[13] = aFloatArray4830[7];
	fs[14] = aFloatArray4830[11];
	fs[15] = aFloatArray4830[15];
	return fs;
    }
    
    public float[] method7063(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[4];
	fs[2] = aFloatArray4830[8];
	fs[3] = aFloatArray4830[12];
	fs[4] = aFloatArray4830[1];
	fs[5] = aFloatArray4830[5];
	fs[6] = aFloatArray4830[9];
	fs[7] = aFloatArray4830[13];
	fs[8] = aFloatArray4830[2];
	fs[9] = aFloatArray4830[6];
	fs[10] = aFloatArray4830[10];
	fs[11] = aFloatArray4830[14];
	fs[12] = aFloatArray4830[3];
	fs[13] = aFloatArray4830[7];
	fs[14] = aFloatArray4830[11];
	fs[15] = aFloatArray4830[15];
	return fs;
    }
    
    public float[] method7064(float[] fs) {
	float f = aFloatArray4830[3] - aFloatArray4830[0];
	float f_361_ = aFloatArray4830[7] - aFloatArray4830[4];
	float f_362_ = aFloatArray4830[11] - aFloatArray4830[8];
	double d
	    = Math.sqrt((double) (f * f + f_361_ * f_361_ + f_362_ * f_362_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_361_ / d);
	fs[2] = (float) ((double) f_362_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] - aFloatArray4830[12])
			 / d);
	return fs;
    }
    
    public float[] method7065(float[] fs) {
	float f = aFloatArray4830[3] - aFloatArray4830[2];
	float f_363_ = aFloatArray4830[7] - aFloatArray4830[6];
	float f_364_ = aFloatArray4830[11] - aFloatArray4830[10];
	double d
	    = Math.sqrt((double) (f * f + f_363_ * f_363_ + f_364_ * f_364_));
	fs[0] = (float) ((double) f / d);
	fs[1] = (float) ((double) f_363_ / d);
	fs[2] = (float) ((double) f_364_ / d);
	fs[3] = (float) ((double) (aFloatArray4830[15] - aFloatArray4830[14])
			 / d);
	return fs;
    }
    
    public float[] method7066(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[4];
	fs[2] = aFloatArray4830[8];
	fs[3] = aFloatArray4830[12];
	fs[4] = aFloatArray4830[1];
	fs[5] = aFloatArray4830[5];
	fs[6] = aFloatArray4830[9];
	fs[7] = aFloatArray4830[13];
	return fs;
    }
    
    public float[] method7067(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[1];
	fs[2] = 0.0F;
	fs[3] = 0.0F;
	fs[4] = aFloatArray4830[4];
	fs[5] = aFloatArray4830[5];
	fs[6] = 0.0F;
	fs[7] = 0.0F;
	fs[8] = aFloatArray4830[12];
	fs[9] = aFloatArray4830[13];
	fs[10] = aFloatArray4830[14];
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public float[] method7068(float[] fs) {
	fs[0] = aFloatArray4830[0];
	fs[1] = aFloatArray4830[1];
	fs[2] = 0.0F;
	fs[3] = 0.0F;
	fs[4] = aFloatArray4830[4];
	fs[5] = aFloatArray4830[5];
	fs[6] = 0.0F;
	fs[7] = 0.0F;
	fs[8] = aFloatArray4830[12];
	fs[9] = aFloatArray4830[13];
	fs[10] = aFloatArray4830[14];
	fs[11] = 0.0F;
	fs[12] = 0.0F;
	fs[13] = 0.0F;
	fs[14] = 0.0F;
	fs[15] = 1.0F;
	return fs;
    }
    
    public void method7069() {
	float f = aFloatArray4830[0];
	float f_365_ = aFloatArray4830[4];
	float f_366_ = aFloatArray4830[8];
	float f_367_ = aFloatArray4830[12];
	float f_368_ = aFloatArray4830[1];
	float f_369_ = aFloatArray4830[5];
	float f_370_ = aFloatArray4830[9];
	float f_371_ = aFloatArray4830[13];
	float f_372_ = aFloatArray4830[2];
	float f_373_ = aFloatArray4830[6];
	float f_374_ = aFloatArray4830[10];
	float f_375_ = aFloatArray4830[14];
	float f_376_ = aFloatArray4830[3];
	float f_377_ = aFloatArray4830[7];
	float f_378_ = aFloatArray4830[11];
	float f_379_ = aFloatArray4830[15];
	aFloatArray4830[0] = f;
	aFloatArray4830[1] = f_365_;
	aFloatArray4830[2] = f_366_;
	aFloatArray4830[3] = f_367_;
	aFloatArray4830[4] = f_368_;
	aFloatArray4830[5] = f_369_;
	aFloatArray4830[6] = f_370_;
	aFloatArray4830[7] = f_371_;
	aFloatArray4830[8] = f_372_;
	aFloatArray4830[9] = f_373_;
	aFloatArray4830[10] = f_374_;
	aFloatArray4830[11] = f_375_;
	aFloatArray4830[12] = f_376_;
	aFloatArray4830[13] = f_377_;
	aFloatArray4830[14] = f_378_;
	aFloatArray4830[15] = f_379_;
    }
    
    public void method7070(int i, int i_380_, int i_381_, float f,
			   float f_382_, float f_383_) {
	if (i != 0) {
	    float f_384_ = Class431.aFloatArray4819[i & 0x3fff];
	    float f_385_ = Class431.aFloatArray4818[i & 0x3fff];
	    aFloatArray4830[0] = f_384_ * (float) i_380_;
	    aFloatArray4830[5] = f_384_ * (float) i_381_;
	    aFloatArray4830[1] = f_385_ * (float) i_380_;
	    aFloatArray4830[4] = -f_385_ * (float) i_381_;
	    aFloatArray4830[10] = 1.0F;
	    float[] fs = aFloatArray4830;
	    float[] fs_386_ = aFloatArray4830;
	    float[] fs_387_ = aFloatArray4830;
	    aFloatArray4830[9] = 0.0F;
	    fs_387_[8] = 0.0F;
	    fs_386_[6] = 0.0F;
	    fs[2] = 0.0F;
	} else {
	    aFloatArray4830[0] = (float) i_380_;
	    aFloatArray4830[5] = (float) i_381_;
	    aFloatArray4830[10] = 1.0F;
	    float[] fs = aFloatArray4830;
	    float[] fs_388_ = aFloatArray4830;
	    float[] fs_389_ = aFloatArray4830;
	    float[] fs_390_ = aFloatArray4830;
	    float[] fs_391_ = aFloatArray4830;
	    aFloatArray4830[9] = 0.0F;
	    fs_391_[8] = 0.0F;
	    fs_390_[6] = 0.0F;
	    fs_389_[4] = 0.0F;
	    fs_388_[2] = 0.0F;
	    fs[1] = 0.0F;
	}
	float[] fs = aFloatArray4830;
	float[] fs_392_ = aFloatArray4830;
	aFloatArray4830[11] = 0.0F;
	fs_392_[7] = 0.0F;
	fs[3] = 0.0F;
	aFloatArray4830[15] = 1.0F;
	aFloatArray4830[12] = f;
	aFloatArray4830[13] = f_382_;
	aFloatArray4830[14] = f_383_;
    }
}
