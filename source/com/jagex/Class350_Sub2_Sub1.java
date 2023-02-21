/* Class350_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class350_Sub2_Sub1 extends Class350_Sub2
{
    float[] aFloatArray11570;
    float[] aFloatArray11571;
    float[] aFloatArray11572;
    int anInt11573 = 0;
    
    public Class350_Sub2_Sub1(Class309 class309) {
	super(class309);
    }
    
    float method15857(float f, float f_0_, float f_1_) {
	float f_2_ = aFloat10221 / f;
	if (f_2_ < 0.0F)
	    f_2_ = 0.0F;
	if (f_2_ > 1.0F)
	    f_2_ = 1.0F;
	return (((aFloatArray11570[181682605 * anInt11573]
		  - aFloatArray11571[anInt11573 * 181682605]) * f_2_
		 + aFloatArray11571[anInt11573 * 181682605])
		* (f / aFloatArray11572[181682605 * anInt11573]));
    }
    
    float method15862(float f, float f_3_, float f_4_, int i) {
	float f_5_ = aFloat10221 / f;
	if (f_5_ < 0.0F)
	    f_5_ = 0.0F;
	if (f_5_ > 1.0F)
	    f_5_ = 1.0F;
	return (((aFloatArray11570[181682605 * anInt11573]
		  - aFloatArray11571[anInt11573 * 181682605]) * f_5_
		 + aFloatArray11571[anInt11573 * 181682605])
		* (f / aFloatArray11572[181682605 * anInt11573]));
    }
    
    void method15852(RSBuffer class525_sub38, int i, int i_6_) {
	aFloatArray11571 = new float[i];
	aFloatArray11570 = new float[i];
	aFloatArray11572 = new float[i];
	anInt11573 = 0;
	for (int i_7_ = 0; i_7_ < i; i_7_++) {
	    aFloatArray11571[i_7_] = class525_sub38.method16634(-915709030);
	    aFloatArray11570[i_7_] = class525_sub38.method16634(-1505417763);
	    aFloatArray11572[i_7_] = class525_sub38.method16634(286456559);
	}
    }
    
    void method15859() {
	anInt11573 += 830523941;
    }
    
    float method15856(float f, float f_8_, float f_9_) {
	float f_10_ = aFloat10221 / f;
	if (f_10_ < 0.0F)
	    f_10_ = 0.0F;
	if (f_10_ > 1.0F)
	    f_10_ = 1.0F;
	return (((aFloatArray11570[181682605 * anInt11573]
		  - aFloatArray11571[anInt11573 * 181682605]) * f_10_
		 + aFloatArray11571[anInt11573 * 181682605])
		* (f / aFloatArray11572[181682605 * anInt11573]));
    }
    
    void method15861(RSBuffer class525_sub38, int i) {
	aFloatArray11571 = new float[i];
	aFloatArray11570 = new float[i];
	aFloatArray11572 = new float[i];
	anInt11573 = 0;
	for (int i_11_ = 0; i_11_ < i; i_11_++) {
	    aFloatArray11571[i_11_] = class525_sub38.method16634(-2028798643);
	    aFloatArray11570[i_11_] = class525_sub38.method16634(-2060222754);
	    aFloatArray11572[i_11_] = class525_sub38.method16634(393825343);
	}
    }
    
    void method15858() {
	anInt11573 += 830523941;
    }
    
    void method15854(int i) {
	anInt11573 += 830523941;
    }
    
    void method15853() {
	anInt11573 += 830523941;
    }
    
    void method15860() {
	anInt11573 += 830523941;
    }
    
    float method15863(float f, float f_12_, float f_13_) {
	float f_14_ = aFloat10221 / f;
	if (f_14_ < 0.0F)
	    f_14_ = 0.0F;
	if (f_14_ > 1.0F)
	    f_14_ = 1.0F;
	return (((aFloatArray11570[181682605 * anInt11573]
		  - aFloatArray11571[anInt11573 * 181682605]) * f_14_
		 + aFloatArray11571[anInt11573 * 181682605])
		* (f / aFloatArray11572[181682605 * anInt11573]));
    }
    
    static void method18173(int i, int i_15_) {
	Class98.anInt1195 = 0;
	int i_16_ = client.aClass507_11137.method8412(211283330);
	int i_17_ = client.aClass507_11137.method8352((byte) -43);
	Class475 class475 = client.aClass507_11137.method8360(2070528546);
	Class546 class546 = client.aClass507_11137.method8358((byte) 13);
	Class40_Sub11 class40_sub11
	    = client.aClass507_11137.method8362((byte) -1);
	int i_18_ = i;
	if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null) {
	    int i_19_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			  .anIntArray12014[0])
			 >> 3);
	    int i_20_ = ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			  .anIntArray12017[0])
			 >> 3);
	    if (i_19_ >= 0 && i_19_ < Class617.aBoolArrayArray8064.length
		&& i_20_ >= 0
		&& i_20_ < Class617.aBoolArrayArray8064[i_19_].length
		&& Class617.aBoolArrayArray8064[i_19_][i_20_])
		i_18_ = 0;
	}
	for (int i_21_ = 0; i_21_ < i_16_; i_21_++) {
	    for (int i_22_ = 0; i_22_ < i_17_; i_22_++) {
		for (int i_23_ = i_18_; i_23_ <= i + 1 && i_23_ <= 3;
		     i_23_++) {
		    if ((i_23_ < i || class475.method7765(i, i_23_, i_21_,
							  i_22_, 1684672385))
			&& !(Class673.method11091
			     ((Interface62) class546.method8974(i_23_, i_21_,
								i_22_,
								(byte) 18),
			      class40_sub11, i_21_, i_22_, (byte) 1))
			&& !(Class673.method11091
			     (((Interface62)
			       class546.method8972(i_23_, i_21_, i_22_,
						   client.anInterface63_11091,
						   332483378)),
			      class40_sub11, i_21_, i_22_, (byte) 1))
			&& !(Class673.method11091
			     ((Interface62) class546.method8968(i_23_, i_21_,
								i_22_,
								(byte) 2),
			      class40_sub11, i_21_, i_22_, (byte) 1))
			&& !(Class673.method11091
			     ((Interface62) class546.method8970(i_23_, i_21_,
								i_22_,
								(byte) 1),
			      class40_sub11, i_21_, i_22_, (byte) 1))) {
			/* empty */
		    }
		}
	    }
	}
    }
}
