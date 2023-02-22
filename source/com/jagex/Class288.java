/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class288
{
    public long aLong3195;
    public short[] aShortArray3196;
    public int[] anIntArray3197;
    int[][] anIntArrayArray3198;
    int[][] anIntArrayArray3199;
    public short[] aShortArray3200;
    float[] aFloatArray3201;
    
    public Class288(long l, int[] is, float[] fs, int[][] is_0_, int[][] is_1_,
		    short[] is_2_, short[] is_3_) {
	aLong3195 = -6636968143718260973L * l;
	anIntArray3197 = is;
	aFloatArray3201 = fs;
	anIntArrayArray3198 = is_0_;
	anIntArrayArray3199 = is_1_;
	aShortArray3200 = is_2_;
	aShortArray3196 = is_3_;
    }
    
    public Class288(NPCDefinitions class299, boolean bool) {
	if (bool) {
	    anIntArray3197 = new int[class299.anIntArray3324.length];
	    aFloatArray3201 = new float[class299.anIntArray3324.length];
	    anIntArrayArray3198 = new int[class299.anIntArray3324.length][3];
	    anIntArrayArray3199 = new int[class299.anIntArray3324.length][3];
	    System.arraycopy(class299.anIntArray3324, 0, anIntArray3197, 0,
			     anIntArray3197.length);
	} else {
	    anIntArray3197 = new int[class299.anIntArray3293.length];
	    aFloatArray3201 = new float[class299.anIntArray3293.length];
	    anIntArrayArray3198 = new int[class299.anIntArray3293.length][3];
	    anIntArrayArray3199 = new int[class299.anIntArray3293.length][3];
	    System.arraycopy(class299.anIntArray3293, 0, anIntArray3197, 0,
			     anIntArray3197.length);
	}
	if (class299.aShortArray3347 != null) {
	    aShortArray3200 = new short[class299.aShortArray3347.length];
	    System.arraycopy(class299.aShortArray3347, 0, aShortArray3200, 0,
			     aShortArray3200.length);
	}
	if (null != class299.aShortArray3300) {
	    aShortArray3196 = new short[class299.aShortArray3300.length];
	    System.arraycopy(class299.aShortArray3300, 0, aShortArray3196, 0,
			     aShortArray3196.length);
	}
    }
    
    public static void method5260(int[] is, Object[] objects, int i, int i_4_,
				  byte i_5_) {
	if (i < i_4_) {
	    int i_6_ = (i_4_ + i) / 2;
	    int i_7_ = i;
	    int i_8_ = is[i_6_];
	    is[i_6_] = is[i_4_];
	    is[i_4_] = i_8_;
	    Object object = objects[i_6_];
	    objects[i_6_] = objects[i_4_];
	    objects[i_4_] = object;
	    int i_9_ = i_8_ == 2147483647 ? 0 : 1;
	    for (int i_10_ = i; i_10_ < i_4_; i_10_++) {
		if (is[i_10_] < (i_10_ & i_9_) + i_8_) {
		    int i_11_ = is[i_10_];
		    is[i_10_] = is[i_7_];
		    is[i_7_] = i_11_;
		    Object object_12_ = objects[i_10_];
		    objects[i_10_] = objects[i_7_];
		    objects[i_7_++] = object_12_;
		}
	    }
	    is[i_4_] = is[i_7_];
	    is[i_7_] = i_8_;
	    objects[i_4_] = objects[i_7_];
	    objects[i_7_] = object;
	    method5260(is, objects, i, i_7_ - 1, (byte) 59);
	    method5260(is, objects, i_7_ + 1, i_4_, (byte) 32);
	}
    }
    
    static final void method5261(Class683 class683, int i) {
	Class61.anInt681
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -513843857;
    }
    
    static void method5262(int i) {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub25_10723
		.method17208(424135869)
	    == 1)
	    Class45.aClass500_349.method8170(new Class514((Class499
							   .aClass499_5554),
							  null),
					     1427606407);
	else {
	    client.aClass507_11137.method8375((byte) 8);
	    Class587.method9690(240569677);
	}
    }
    
    static void method5263
	(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_,
	 int i_18_, Class525_Sub16_Sub16 class525_sub16_sub16,
	 Class175 class175, Class7 class7, int i_19_, int i_20_, int i_21_) {
	if (i > i_14_ && i < i_14_ + i_16_
	    && i_13_ > i_18_ - 385749773 * class7.anInt49 - 1
	    && i_13_ < i_18_ + class7.anInt51 * 1921008003
	    && class525_sub16_sub16.aBool11864)
	    i_19_ = i_20_;
	int[] is = Class220.method4207(class525_sub16_sub16, -1771731212);
	String string = Class335.method5851(class525_sub16_sub16, 2015739011);
	if (null != is)
	    string = new StringBuilder().append(string).append
			 (Class91.method1699(is, -1517274269)).toString();
	class175.method2844(string, i_14_ + 3, i_18_, i_19_, 0,
			    client.aRandom11303, Class413.anInt4407,
			    Class229.aClass157Array2364, null, 2080636942);
	if (class525_sub16_sub16.aBool11865)
	    Class321.aClass157_3539.method2518
		(5 + i_14_ + class7.method562(string,
					      Class229.aClass157Array2364,
					      -1838390533),
		 i_18_ - 385749773 * class7.anInt49);
    }
}
