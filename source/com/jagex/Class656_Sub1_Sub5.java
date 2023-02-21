/* Class656_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class656_Sub1_Sub5 extends Class656_Sub1
{
    static int[] anIntArray11947 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    public static final int anInt11948 = 2;
    public static final int anInt11949 = 4;
    public static final int anInt11950 = 8;
    public static final int anInt11951 = 16;
    public short aShort11952;
    public static final int anInt11953 = 64;
    public static final int anInt11954 = 128;
    public static final int anInt11955 = 32;
    public static final int anInt11956 = 1;
    int anInt11957 = 0;
    Class525_Sub21[] aClass525_Sub21Array11958 = new Class525_Sub21[4];
    
    boolean method16937(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	return (aClass546_10872.aClass554_7208.method9182
		(this, aByte10870,
		 ((int) class446.aFloat4895
		  >> 1819515263 * aClass546_10872.anInt7200),
		 ((int) class446.aFloat4897
		  >> aClass546_10872.anInt7200 * 1819515263)));
    }
    
    int method16920(Class525_Sub21[] class525_sub21s, int i) {
	if (aBool8434) {
	    Class446 class446 = method10818().aClass446_4807;
	    int i_0_ = ((int) class446.aFloat4895
			>> 1819515263 * aClass546_10872.anInt7200);
	    int i_1_ = ((int) class446.aFloat4897
			>> 1819515263 * aClass546_10872.anInt7200);
	    int i_2_ = 0;
	    if (i_0_ == 1874840879 * aClass546_10872.anInt7214)
		i_2_++;
	    else if (1874840879 * aClass546_10872.anInt7214 < i_0_)
		i_2_ += 2;
	    if (1049621335 * aClass546_10872.anInt7202 == i_1_)
		i_2_ += 3;
	    else if (1049621335 * aClass546_10872.anInt7202 > i_1_)
		i_2_ += 6;
	    int i_3_ = anIntArray11947[i_2_];
	    if (0 == (aShort11952 & i_3_)) {
		if (1 == aShort11952 && i_0_ > 0)
		    i_0_--;
		else if (4 == aShort11952
			 && i_0_ <= 1761949661 * aClass546_10872.anInt7210)
		    i_0_++;
		else if (aShort11952 == 8 && i_1_ > 0)
		    i_1_--;
		else if (aShort11952 == 2
			 && i_1_ <= 947301287 * aClass546_10872.anInt7211)
		    i_1_++;
		else if (16 == aShort11952 && i_0_ > 0
			 && i_1_ <= 947301287 * aClass546_10872.anInt7211) {
		    i_0_--;
		    i_1_++;
		} else if (32 == aShort11952
			   && i_0_ <= 1761949661 * aClass546_10872.anInt7210
			   && i_1_ <= aClass546_10872.anInt7211 * 947301287) {
		    i_0_++;
		    i_1_++;
		} else if (128 == aShort11952 && i_0_ > 0 && i_1_ > 0) {
		    i_0_--;
		    i_1_--;
		} else if (64 == aShort11952
			   && i_0_ <= 1761949661 * aClass546_10872.anInt7210
			   && i_1_ > 0) {
		    i_0_++;
		    i_1_--;
		} else
		    throw new RuntimeException("");
	    }
	    anInt11957 = method16925(i_0_, i_1_, aClass525_Sub21Array11958,
				     1314675988) * -1864310161;
	    aBool8434 = false;
	}
	for (int i_4_ = 0; i_4_ < -2123842417 * anInt11957; i_4_++)
	    class525_sub21s[i_4_] = aClass525_Sub21Array11958[i_4_];
	return anInt11957 * -2123842417;
    }
    
    boolean method16952() {
	Class446 class446 = method10818().aClass446_4807;
	return (aClass546_10872.aBoolArrayArray7262
		[(((int) class446.aFloat4895
		   >> 1819515263 * aClass546_10872.anInt7200)
		  - aClass546_10872.anInt7214 * 1874840879
		  + -699511149 * aClass546_10872.anInt7242)]
		[(-699511149 * aClass546_10872.anInt7242
		  + (((int) class446.aFloat4897
		      >> aClass546_10872.anInt7200 * 1819515263)
		     - aClass546_10872.anInt7202 * 1049621335))]);
    }
    
    boolean method16922(int i) {
	Class446 class446 = method10818().aClass446_4807;
	return (aClass546_10872.aBoolArrayArray7262
		[(((int) class446.aFloat4895
		   >> 1819515263 * aClass546_10872.anInt7200)
		  - aClass546_10872.anInt7214 * 1874840879
		  + -699511149 * aClass546_10872.anInt7242)]
		[(-699511149 * aClass546_10872.anInt7242
		  + (((int) class446.aFloat4897
		      >> aClass546_10872.anInt7200 * 1819515263)
		     - aClass546_10872.anInt7202 * 1049621335))]);
    }
    
    boolean method16942(Class182 class182, int i) {
	Class446 class446 = method10818().aClass446_4807;
	return (aClass546_10872.aClass554_7208.method9182
		(this, aByte10870,
		 ((int) class446.aFloat4895
		  >> 1819515263 * aClass546_10872.anInt7200),
		 ((int) class446.aFloat4897
		  >> aClass546_10872.anInt7200 * 1819515263)));
    }
    
    Class656_Sub1_Sub5(Class546 class546, int i, int i_5_, int i_6_, int i_7_,
		       int i_8_, int i_9_) {
	super(class546);
	aByte10867 = (byte) i_7_;
	aByte10870 = (byte) i_8_;
	aShort11952 = (short) i_9_;
	method10823(new Class446((float) i, (float) i_5_, (float) i_6_));
	for (int i_10_ = 0; i_10_ < 4; i_10_++)
	    aClass525_Sub21Array11958[i_10_] = null;
    }
    
    int method16959(Class525_Sub21[] class525_sub21s) {
	if (aBool8434) {
	    Class446 class446 = method10818().aClass446_4807;
	    int i = ((int) class446.aFloat4895
		     >> 1819515263 * aClass546_10872.anInt7200);
	    int i_11_ = ((int) class446.aFloat4897
			 >> 1819515263 * aClass546_10872.anInt7200);
	    int i_12_ = 0;
	    if (i == 1874840879 * aClass546_10872.anInt7214)
		i_12_++;
	    else if (1874840879 * aClass546_10872.anInt7214 < i)
		i_12_ += 2;
	    if (1049621335 * aClass546_10872.anInt7202 == i_11_)
		i_12_ += 3;
	    else if (1049621335 * aClass546_10872.anInt7202 > i_11_)
		i_12_ += 6;
	    int i_13_ = anIntArray11947[i_12_];
	    if (0 == (aShort11952 & i_13_)) {
		if (1 == aShort11952 && i > 0)
		    i--;
		else if (4 == aShort11952
			 && i <= 1761949661 * aClass546_10872.anInt7210)
		    i++;
		else if (aShort11952 == 8 && i_11_ > 0)
		    i_11_--;
		else if (aShort11952 == 2
			 && i_11_ <= 947301287 * aClass546_10872.anInt7211)
		    i_11_++;
		else if (16 == aShort11952 && i > 0
			 && i_11_ <= 947301287 * aClass546_10872.anInt7211) {
		    i--;
		    i_11_++;
		} else if (32 == aShort11952
			   && i <= 1761949661 * aClass546_10872.anInt7210
			   && i_11_ <= aClass546_10872.anInt7211 * 947301287) {
		    i++;
		    i_11_++;
		} else if (128 == aShort11952 && i > 0 && i_11_ > 0) {
		    i--;
		    i_11_--;
		} else if (64 == aShort11952
			   && i <= 1761949661 * aClass546_10872.anInt7210
			   && i_11_ > 0) {
		    i++;
		    i_11_--;
		} else
		    throw new RuntimeException("");
	    }
	    anInt11957 = method16925(i, i_11_, aClass525_Sub21Array11958,
				     1314675988) * -1864310161;
	    aBool8434 = false;
	}
	for (int i = 0; i < -2123842417 * anInt11957; i++)
	    class525_sub21s[i] = aClass525_Sub21Array11958[i];
	return anInt11957 * -2123842417;
    }
    
    int method16958(Class525_Sub21[] class525_sub21s) {
	if (aBool8434) {
	    Class446 class446 = method10818().aClass446_4807;
	    int i = ((int) class446.aFloat4895
		     >> 1819515263 * aClass546_10872.anInt7200);
	    int i_14_ = ((int) class446.aFloat4897
			 >> 1819515263 * aClass546_10872.anInt7200);
	    int i_15_ = 0;
	    if (i == 1874840879 * aClass546_10872.anInt7214)
		i_15_++;
	    else if (1874840879 * aClass546_10872.anInt7214 < i)
		i_15_ += 2;
	    if (1049621335 * aClass546_10872.anInt7202 == i_14_)
		i_15_ += 3;
	    else if (1049621335 * aClass546_10872.anInt7202 > i_14_)
		i_15_ += 6;
	    int i_16_ = anIntArray11947[i_15_];
	    if (0 == (aShort11952 & i_16_)) {
		if (1 == aShort11952 && i > 0)
		    i--;
		else if (4 == aShort11952
			 && i <= 1761949661 * aClass546_10872.anInt7210)
		    i++;
		else if (aShort11952 == 8 && i_14_ > 0)
		    i_14_--;
		else if (aShort11952 == 2
			 && i_14_ <= 947301287 * aClass546_10872.anInt7211)
		    i_14_++;
		else if (16 == aShort11952 && i > 0
			 && i_14_ <= 947301287 * aClass546_10872.anInt7211) {
		    i--;
		    i_14_++;
		} else if (32 == aShort11952
			   && i <= 1761949661 * aClass546_10872.anInt7210
			   && i_14_ <= aClass546_10872.anInt7211 * 947301287) {
		    i++;
		    i_14_++;
		} else if (128 == aShort11952 && i > 0 && i_14_ > 0) {
		    i--;
		    i_14_--;
		} else if (64 == aShort11952
			   && i <= 1761949661 * aClass546_10872.anInt7210
			   && i_14_ > 0) {
		    i++;
		    i_14_--;
		} else
		    throw new RuntimeException("");
	    }
	    anInt11957 = method16925(i, i_14_, aClass525_Sub21Array11958,
				     1314675988) * -1864310161;
	    aBool8434 = false;
	}
	for (int i = 0; i < -2123842417 * anInt11957; i++)
	    class525_sub21s[i] = aClass525_Sub21Array11958[i];
	return anInt11957 * -2123842417;
    }
    
    boolean method16956(Class182 class182) {
	Class446 class446 = method10818().aClass446_4807;
	return (aClass546_10872.aClass554_7208.method9182
		(this, aByte10870,
		 ((int) class446.aFloat4895
		  >> 1819515263 * aClass546_10872.anInt7200),
		 ((int) class446.aFloat4897
		  >> aClass546_10872.anInt7200 * 1819515263)));
    }
    
    boolean method16962() {
	Class446 class446 = method10818().aClass446_4807;
	return (aClass546_10872.aBoolArrayArray7262
		[(((int) class446.aFloat4895
		   >> 1819515263 * aClass546_10872.anInt7200)
		  - aClass546_10872.anInt7214 * 1874840879
		  + -699511149 * aClass546_10872.anInt7242)]
		[(-699511149 * aClass546_10872.anInt7242
		  + (((int) class446.aFloat4897
		      >> aClass546_10872.anInt7200 * 1819515263)
		     - aClass546_10872.anInt7202 * 1049621335))]);
    }
    
    boolean method16924() {
	Class446 class446 = method10818().aClass446_4807;
	return (aClass546_10872.aBoolArrayArray7262
		[(((int) class446.aFloat4895
		   >> 1819515263 * aClass546_10872.anInt7200)
		  - aClass546_10872.anInt7214 * 1874840879
		  + -699511149 * aClass546_10872.anInt7242)]
		[(-699511149 * aClass546_10872.anInt7242
		  + (((int) class446.aFloat4897
		      >> aClass546_10872.anInt7200 * 1819515263)
		     - aClass546_10872.anInt7202 * 1049621335))]);
    }
}
