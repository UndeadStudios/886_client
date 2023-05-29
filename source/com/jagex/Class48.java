/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class48
{
    int anInt364;
    int anInt365;
    int anInt366;
    int anInt367;
    int anInt368;
    
    public int method1108() {
	return 2111711273 * anInt367;
    }
    
    public int hashCode() {
	return 2111711273 * anInt367;
    }
    
    public int method1109() {
	return 2111711273 * anInt367;
    }
    
    public int method1110() {
	return 2111711273 * anInt367;
    }
    
    Class48(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	anInt367 = -877661159 * i;
	anInt365 = 552269673 * i_0_;
	anInt366 = -742605801 * i_1_;
	anInt364 = -622673467 * i_2_;
	anInt368 = i_3_ * 646311557;
    }
    
    public static String method1111(CharSequence charsequence, Class76 class76,
				    int i) {
	if (charsequence == null)
	    return null;
	int i_4_ = 0;
	int i_5_;
	for (i_5_ = charsequence.length();
	     (i_4_ < i_5_
	      && Class208.method3912(charsequence.charAt(i_4_), -812092499));
	     i_4_++) {
	    /* empty */
	}
	for (/**/;
	     i_5_ > i_4_ && Class208.method3912(charsequence.charAt(i_5_ - 1),
						1093867199);
	     i_5_--) {
	    /* empty */
	}
	int i_6_ = i_5_ - i_4_;
	if (i_6_ < 1 || i_6_ > Class13.method735(class76, -1419080982))
	    return null;
	StringBuilder stringbuilder = new StringBuilder(i_6_);
	for (int i_7_ = i_4_; i_7_ < i_5_; i_7_++) {
	    char c = charsequence.charAt(i_7_);
	    if (Class57.method1215(c, 1819856143)) {
		char c_8_ = Class409.method6654(c, 2129360892);
		if (c_8_ != 0)
		    stringbuilder.append(c_8_);
	    }
	}
	if (stringbuilder.length() == 0)
	    return null;
	return stringbuilder.toString();
    }
    
    static final void method1112(Class182 class182, int i, int i_9_, int i_10_,
				 int i_11_, int i_12_) {
	class182.method3184(i, i_9_, i + i_10_, i_11_ + i_9_);
	class182.method3190(i, i_9_, i_10_, i_11_, -16777216, (byte) -1);
	if (294186987 * Class556_Sub1.anInt10625 >= 100) {
	    float f = ((float) Class556_Sub1.anInt7521
		       / (float) Class556_Sub1.anInt7502);
	    int i_13_ = i_10_;
	    int i_14_ = i_11_;
	    if (f < 1.0F)
		i_14_ = (int) (f * (float) i_10_);
	    else
		i_13_ = (int) ((float) i_11_ / f);
	    i += (i_10_ - i_13_) / 2;
	    i_9_ += (i_11_ - i_14_) / 2;
	    if (Class604.aClass157_7958 == null
		|| Class604.aClass157_7958.method2503() != i_13_
		|| Class604.aClass157_7958.method2471() != i_14_) {
		Class556_Sub1.aClass200_7496 = Class556_Sub1.aClass200_7508;
		Class556_Sub1.method9260(Class556_Sub1.anInt7483,
					 (Class556_Sub1.anInt7484
					  + Class556_Sub1.anInt7521),
					 (Class556_Sub1.anInt7502
					  + Class556_Sub1.anInt7483),
					 Class556_Sub1.anInt7484, i, i_9_,
					 i_13_ + i, i_14_ + i_9_);
		Class556_Sub1.method9261(class182, false, false,
					 client.aBool11230, true);
		class182.method3218();
		Class604.aClass157_7958
		    = class182.method3217(i, i_9_, i_13_, i_14_, true);
	    }
	    Class604.aClass157_7958.method2518(i, i_9_);
	    int i_15_ = (i_13_ * (Class463.anInt5119 * 56690511)
			 / Class556_Sub1.anInt7502);
	    int i_16_ = (1960864551 * Class696_Sub5.anInt10890 * i_14_
			 / Class556_Sub1.anInt7521);
	    int i_17_ = i + (client.anInt11396 * -525773749 * i_13_
			     / Class556_Sub1.anInt7502);
	    int i_18_ = i_9_ + i_14_ - (i_14_ * (-655115223 * Class63.anInt692)
					/ Class556_Sub1.anInt7521) - i_16_;
	    int i_19_ = -1996554240;
	    if (Class668.aClass668_8577 == client.gametype)
		i_19_ = -1996488705;
	    class182.method3151(i_17_, i_18_, i_15_, i_16_, i_19_, 1);
	    class182.method3195(i_17_, i_18_, i_15_, i_16_, i_19_, 0);
	    for (Class525_Sub37 class525_sub37
		     = (Class525_Sub37) Class556_Sub1.aClass709_7473
					    .method14372((short) -26149);
		 class525_sub37 != null;
		 class525_sub37
		     = (Class525_Sub37) Class556_Sub1.aClass709_7473
					    .method14353(-1325418632)) {
		Class287 class287
		    = ((Class287)
		       (Class556_Sub1.aClass40_Sub2_7464.method76
			(-480723851 * class525_sub37.anInt10825, 1655016411)));
		if (Class525_Sub42.method16881(class287, 1057864254)) {
		    Class34 class34
			= (Class34) (Class556_Sub1.aHashMap10646.get
				     (Integer.valueOf(class525_sub37.anInt10825
						      * -480723851)));
		    if (null == class34)
			class34
			    = (Class34) (Class556_Sub1.aHashMap10641.get
					 (Integer.valueOf(class287.anInt3192
							  * 433521613)));
		    if (class34 != null) {
			int i_20_;
			if (class34.anInt309 * -392080105
			    > -1987988059 * Class556_Sub1.anInt10648 / 2)
			    i_20_
				= ((-130814117 * Class556_Sub1.anInt10648
				    - -1196178967 * class34.anInt309)
				   / (-1987988059 * Class556_Sub1.anInt10648));
			else
			    i_20_
				= (class34.anInt309 * -1196178967
				   / (Class556_Sub1.anInt10648 * -1987988059));
			int i_21_
			    = (i_13_ * (1273194629 * class525_sub37.anInt10826)
			       / Class556_Sub1.anInt7502) + i;
			int i_22_
			    = (i_9_
			       + ((Class556_Sub1.anInt7521
				   - -1383897689 * class525_sub37.anInt10824)
				  * i_14_ / Class556_Sub1.anInt7521));
			class182.method3190(i_21_ - 2, i_22_ - 2, 4, 4,
					    i_20_ << 24 | 0xffff00, (byte) -1);
		    }
		}
	    }
	    Class556_Sub1.aClass200_7508.method3805(5, 1849800496);
	}
    }
    
    static final void method1113(Class259 class259, int i, Class683 class683,
				 int i_23_) {
	if (class259.aByteArrayArray2676 == null)
	    throw new RuntimeException();
	if (null == class259.anIntArray2703)
	    class259.anIntArray2703
		= new int[class259.aByteArrayArray2676.length];
	class259.anIntArray2703[i] = 2147483647;
    }
}
