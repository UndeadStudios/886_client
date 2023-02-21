/* Class571 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class571 implements Interface66
{
    int anInt7635;
    int anInt7636;
    int[] anIntArray7637;
    
    public boolean method432(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551) {
	if (null == class525_sub41) {
	    if (1814421945 * anInt7636 != -1)
		return false;
	} else {
	    if (anInt7636 * 1814421945
		!= class525_sub41.method16857(2093012038))
		return false;
	    if (anInt7635 * 147072533 > class525_sub41.method16859(-538019630))
		return false;
	    int[] is = anIntArray7637;
	    for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
		int i_1_ = is[i_0_];
		if (!class551.method9149(i_1_, 1048208436))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method430(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551, int i_2_) {
	if (null == class525_sub41) {
	    if (1814421945 * anInt7636 != -1)
		return false;
	} else {
	    if (anInt7636 * 1814421945
		!= class525_sub41.method16857(2137728885))
		return false;
	    if (anInt7635 * 147072533 > class525_sub41.method16859(-538019630))
		return false;
	    int[] is = anIntArray7637;
	    for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
		int i_4_ = is[i_3_];
		if (!class551.method9149(i_4_, 1964926572))
		    return false;
	    }
	}
	return true;
    }
    
    static Class571 method9529(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(2056766084);
	int i_5_ = class525_sub38.readUnsignedByte(1789889632);
	int i_6_ = class525_sub38.readUnsignedByte(372222071);
	int[] is = new int[i_6_];
	for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
	    is[i_7_] = class525_sub38.readUnsignedByte(797981458);
	return new Class571(i, i_5_, is);
    }
    
    public boolean method431(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551) {
	if (null == class525_sub41) {
	    if (1814421945 * anInt7636 != -1)
		return false;
	} else {
	    if (anInt7636 * 1814421945
		!= class525_sub41.method16857(2092780695))
		return false;
	    if (anInt7635 * 147072533 > class525_sub41.method16859(-538019630))
		return false;
	    int[] is = anIntArray7637;
	    for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
		int i_9_ = is[i_8_];
		if (!class551.method9149(i_9_, 649834666))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method429(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551) {
	if (null == class525_sub41) {
	    if (1814421945 * anInt7636 != -1)
		return false;
	} else {
	    if (anInt7636 * 1814421945
		!= class525_sub41.method16857(2141320568))
		return false;
	    if (anInt7635 * 147072533 > class525_sub41.method16859(-538019630))
		return false;
	    int[] is = anIntArray7637;
	    for (int i_10_ = 0; i_10_ < is.length; i_10_++) {
		int i_11_ = is[i_10_];
		if (!class551.method9149(i_11_, 1310046116))
		    return false;
	    }
	}
	return true;
    }
    
    static Class571 method9530(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(1446320570);
	int i_12_ = class525_sub38.readUnsignedByte(1131285108);
	int i_13_ = class525_sub38.readUnsignedByte(194375131);
	int[] is = new int[i_13_];
	for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
	    is[i_14_] = class525_sub38.readUnsignedByte(1042578451);
	return new Class571(i, i_12_, is);
    }
    
    Class571(int i, int i_15_, int[] is) {
	anInt7636 = i * -239741815;
	anInt7635 = -503875267 * i_15_;
	anIntArray7637 = is;
    }
    
    public static Class598 method9531(RSBuffer class525_sub38, int i) {
	int i_16_ = class525_sub38.readUnsignedByte(1573352519);
	int[] is = new int[i_16_];
	for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
	    is[i_17_] = class525_sub38.readUnsignedByte(1744613054);
	return new Class598(is);
    }
    
    static boolean method9532(Class259 class259, int i) {
	Class525_Sub8 class525_sub8 = client.method17531(class259);
	if (class525_sub8.method16143((byte) -55) > 0)
	    return true;
	if (class525_sub8.method16136(-1012945162))
	    return true;
	if (class259.aClass259_2685 != null)
	    return true;
	return false;
    }
    
    static final void method9533(Class683 class683, byte i) {
	class683.anInt8662 -= 1552651121;
	int i_18_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class513.method8549(i_18_, (byte) 11);
    }
}
