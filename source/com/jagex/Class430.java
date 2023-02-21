/* Class430 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class430
{
    float[] aFloatArray4816;
    Class433[] aClass433Array4817 = new Class433[1];
    
    public float method6884(float f) {
	return method6891(method6888(f));
    }
    
    public int method6885() {
	return aClass433Array4817.length;
    }
    
    public float method6886() {
	float f = 0.0F;
	for (int i = 0; i < aClass433Array4817.length; i++)
	    f += aClass433Array4817[i].method6914();
	return f;
    }
    
    public double[] method6887(float f) {
	float f_0_ = 0.0F;
	float f_1_ = 0.0F;
	for (int i = 0; i < aClass433Array4817.length; i++) {
	    f_1_ += aClass433Array4817[i].method6914();
	    if (f < f_1_) {
		float f_2_ = aClass433Array4817[i].method6915(f - f_0_);
		return aClass433Array4817[i].method6918(f_2_);
	    }
	    f_0_ = f_1_;
	}
	return aClass433Array4817[aClass433Array4817.length - 1]
		   .method6918(1.0F);
    }
    
    public float method6888(float f) {
	float f_3_ = 0.0F;
	float f_4_ = 0.0F;
	for (int i = 0; i < aClass433Array4817.length; i++) {
	    f_4_ += aClass433Array4817[i].method6914();
	    if (f < f_4_)
		return aClass433Array4817[i].method6915(f - f_3_) + (float) i;
	    f_3_ = f_4_;
	}
	return (float) aClass433Array4817.length;
    }
    
    public float method6889(float f) {
	int i = (int) f;
	if (i + 1 < aFloatArray4816.length) {
	    float f_5_ = aFloatArray4816[i];
	    float f_6_ = aFloatArray4816[i + 1];
	    float f_7_ = f - (float) i;
	    return (1.0F - f_7_) * f_5_ + f_7_ * f_6_;
	}
	return aFloatArray4816[aFloatArray4816.length - 1];
    }
    
    public double[] method6890(float f) {
	int i = (int) f;
	if (i < aClass433Array4817.length)
	    return aClass433Array4817[i].method6918(f - (float) i);
	return aClass433Array4817[aClass433Array4817.length - 1]
		   .method6918(1.0F);
    }
    
    public float method6891(float f) {
	int i = (int) f;
	if (i + 1 < aFloatArray4816.length) {
	    float f_8_ = aFloatArray4816[i];
	    float f_9_ = aFloatArray4816[i + 1];
	    float f_10_ = f - (float) i;
	    return (1.0F - f_10_) * f_8_ + f_10_ * f_9_;
	}
	return aFloatArray4816[aFloatArray4816.length - 1];
    }
    
    public Class430(RSBuffer class525_sub38) {
	aFloatArray4816 = new float[2];
	int i = class525_sub38.method16740((byte) -33);
	aClass433Array4817[0] = new Class433();
	aClass433Array4817[0].method6912(0,
					 Class446.method7210(class525_sub38));
	aClass433Array4817[0].method6912(1,
					 Class446.method7210(class525_sub38));
	aFloatArray4816[0] = class525_sub38.method16634(-332409125);
	Class446 class446 = Class446.method7210(class525_sub38);
	Class446 class446_11_ = Class446.method7210(class525_sub38);
	Class446 class446_12_ = Class446.method7225(class446, class446_11_);
	class446_11_.method7260();
	class446_11_ = class446_12_;
	class446_11_.method7221(class446);
	aClass433Array4817[0].method6912(3, class446);
	aClass433Array4817[0].method6912(2, class446_11_);
	aFloatArray4816[1] = class525_sub38.method16634(733584056);
	for (int i_13_ = 2; i_13_ < i; i_13_++) {
	    Class446 class446_14_ = Class446.method7210(class525_sub38);
	    Class446 class446_15_ = Class446.method7210(class525_sub38);
	    Class446 class446_16_
		= Class446.method7225(class446_14_, class446_15_);
	    class446_15_.method7260();
	    class446_15_ = class446_16_;
	    class446_15_.method7221(class446_14_);
	    method6902(class446_14_, class446_15_,
		       class525_sub38.method16634(-303325549));
	}
    }
    
    void method6892(Class446 class446, Class446 class446_17_, float f) {
	Class433[] class433s = new Class433[aClass433Array4817.length + 1];
	System.arraycopy(aClass433Array4817, 0, class433s, 0,
			 aClass433Array4817.length);
	Class433 class433 = new Class433();
	Class433 class433_18_
	    = aClass433Array4817[aClass433Array4817.length - 1];
	class433.method6912(0, class433_18_.method6930(3));
	Class446 class446_19_
	    = Class446.method7225(class433_18_.method6930(3),
				  class433_18_.method6930(2));
	class433.method6912(1, Class446.method7223(class433_18_.method6930(3),
						   class446_19_));
	class433.method6912(3, class446);
	class433.method6912(2, class446_17_);
	class433s[class433s.length - 1] = class433;
	aClass433Array4817 = class433s;
	float[] fs = new float[aFloatArray4816.length + 1];
	System.arraycopy(aFloatArray4816, 0, fs, 0, aFloatArray4816.length);
	fs[fs.length - 1] = f;
	aFloatArray4816 = fs;
    }
    
    void method6893(Class446 class446, Class446 class446_20_, float f) {
	Class433[] class433s = new Class433[aClass433Array4817.length + 1];
	System.arraycopy(aClass433Array4817, 0, class433s, 0,
			 aClass433Array4817.length);
	Class433 class433 = new Class433();
	Class433 class433_21_
	    = aClass433Array4817[aClass433Array4817.length - 1];
	class433.method6912(0, class433_21_.method6930(3));
	Class446 class446_22_
	    = Class446.method7225(class433_21_.method6930(3),
				  class433_21_.method6930(2));
	class433.method6912(1, Class446.method7223(class433_21_.method6930(3),
						   class446_22_));
	class433.method6912(3, class446);
	class433.method6912(2, class446_20_);
	class433s[class433s.length - 1] = class433;
	aClass433Array4817 = class433s;
	float[] fs = new float[aFloatArray4816.length + 1];
	System.arraycopy(aFloatArray4816, 0, fs, 0, aFloatArray4816.length);
	fs[fs.length - 1] = f;
	aFloatArray4816 = fs;
    }
    
    void method6894(Class446 class446, Class446 class446_23_, float f) {
	Class433[] class433s = new Class433[aClass433Array4817.length + 1];
	System.arraycopy(aClass433Array4817, 0, class433s, 0,
			 aClass433Array4817.length);
	Class433 class433 = new Class433();
	Class433 class433_24_
	    = aClass433Array4817[aClass433Array4817.length - 1];
	class433.method6912(0, class433_24_.method6930(3));
	Class446 class446_25_
	    = Class446.method7225(class433_24_.method6930(3),
				  class433_24_.method6930(2));
	class433.method6912(1, Class446.method7223(class433_24_.method6930(3),
						   class446_25_));
	class433.method6912(3, class446);
	class433.method6912(2, class446_23_);
	class433s[class433s.length - 1] = class433;
	aClass433Array4817 = class433s;
	float[] fs = new float[aFloatArray4816.length + 1];
	System.arraycopy(aFloatArray4816, 0, fs, 0, aFloatArray4816.length);
	fs[fs.length - 1] = f;
	aFloatArray4816 = fs;
    }
    
    public double[] method6895(float f) {
	float f_26_ = 0.0F;
	float f_27_ = 0.0F;
	for (int i = 0; i < aClass433Array4817.length; i++) {
	    f_27_ += aClass433Array4817[i].method6914();
	    if (f < f_27_) {
		float f_28_ = aClass433Array4817[i].method6915(f - f_26_);
		return aClass433Array4817[i].method6918(f_28_);
	    }
	    f_26_ = f_27_;
	}
	return aClass433Array4817[aClass433Array4817.length - 1]
		   .method6918(1.0F);
    }
    
    public double[] method6896(float f) {
	float f_29_ = 0.0F;
	float f_30_ = 0.0F;
	for (int i = 0; i < aClass433Array4817.length; i++) {
	    f_30_ += aClass433Array4817[i].method6914();
	    if (f < f_30_) {
		float f_31_ = aClass433Array4817[i].method6915(f - f_29_);
		return aClass433Array4817[i].method6918(f_31_);
	    }
	    f_29_ = f_30_;
	}
	return aClass433Array4817[aClass433Array4817.length - 1]
		   .method6918(1.0F);
    }
    
    public double[] method6897(float f) {
	float f_32_ = 0.0F;
	float f_33_ = 0.0F;
	for (int i = 0; i < aClass433Array4817.length; i++) {
	    f_33_ += aClass433Array4817[i].method6914();
	    if (f < f_33_) {
		float f_34_ = aClass433Array4817[i].method6915(f - f_32_);
		return aClass433Array4817[i].method6918(f_34_);
	    }
	    f_32_ = f_33_;
	}
	return aClass433Array4817[aClass433Array4817.length - 1]
		   .method6918(1.0F);
    }
    
    public double[] method6898(float f) {
	float f_35_ = 0.0F;
	float f_36_ = 0.0F;
	for (int i = 0; i < aClass433Array4817.length; i++) {
	    f_36_ += aClass433Array4817[i].method6914();
	    if (f < f_36_) {
		float f_37_ = aClass433Array4817[i].method6915(f - f_35_);
		return aClass433Array4817[i].method6918(f_37_);
	    }
	    f_35_ = f_36_;
	}
	return aClass433Array4817[aClass433Array4817.length - 1]
		   .method6918(1.0F);
    }
    
    public float method6899(float f) {
	float f_38_ = 0.0F;
	float f_39_ = 0.0F;
	for (int i = 0; i < aClass433Array4817.length; i++) {
	    f_39_ += aClass433Array4817[i].method6914();
	    if (f < f_39_)
		return aClass433Array4817[i].method6915(f - f_38_) + (float) i;
	    f_38_ = f_39_;
	}
	return (float) aClass433Array4817.length;
    }
    
    public double[] method6900(float f) {
	int i = (int) f;
	if (i < aClass433Array4817.length)
	    return aClass433Array4817[i].method6918(f - (float) i);
	return aClass433Array4817[aClass433Array4817.length - 1]
		   .method6918(1.0F);
    }
    
    public float method6901(float f) {
	return method6891(method6888(f));
    }
    
    void method6902(Class446 class446, Class446 class446_40_, float f) {
	Class433[] class433s = new Class433[aClass433Array4817.length + 1];
	System.arraycopy(aClass433Array4817, 0, class433s, 0,
			 aClass433Array4817.length);
	Class433 class433 = new Class433();
	Class433 class433_41_
	    = aClass433Array4817[aClass433Array4817.length - 1];
	class433.method6912(0, class433_41_.method6930(3));
	Class446 class446_42_
	    = Class446.method7225(class433_41_.method6930(3),
				  class433_41_.method6930(2));
	class433.method6912(1, Class446.method7223(class433_41_.method6930(3),
						   class446_42_));
	class433.method6912(3, class446);
	class433.method6912(2, class446_40_);
	class433s[class433s.length - 1] = class433;
	aClass433Array4817 = class433s;
	float[] fs = new float[aFloatArray4816.length + 1];
	System.arraycopy(aFloatArray4816, 0, fs, 0, aFloatArray4816.length);
	fs[fs.length - 1] = f;
	aFloatArray4816 = fs;
    }
    
    public float method6903(float f) {
	int i = (int) f;
	if (i + 1 < aFloatArray4816.length) {
	    float f_43_ = aFloatArray4816[i];
	    float f_44_ = aFloatArray4816[i + 1];
	    float f_45_ = f - (float) i;
	    return (1.0F - f_45_) * f_43_ + f_45_ * f_44_;
	}
	return aFloatArray4816[aFloatArray4816.length - 1];
    }
    
    public float method6904(float f) {
	int i = (int) f;
	if (i + 1 < aFloatArray4816.length) {
	    float f_46_ = aFloatArray4816[i];
	    float f_47_ = aFloatArray4816[i + 1];
	    float f_48_ = f - (float) i;
	    return (1.0F - f_48_) * f_46_ + f_48_ * f_47_;
	}
	return aFloatArray4816[aFloatArray4816.length - 1];
    }
    
    public float method6905(float f) {
	int i = (int) f;
	if (i + 1 < aFloatArray4816.length) {
	    float f_49_ = aFloatArray4816[i];
	    float f_50_ = aFloatArray4816[i + 1];
	    float f_51_ = f - (float) i;
	    return (1.0F - f_51_) * f_49_ + f_51_ * f_50_;
	}
	return aFloatArray4816[aFloatArray4816.length - 1];
    }
}
