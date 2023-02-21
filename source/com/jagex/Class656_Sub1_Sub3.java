/* Class656_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class656_Sub1_Sub3 extends Class656_Sub1
{
    public short aShort11923;
    public short aShort11924;
    public short aShort11925;
    int anInt11926 = 0;
    public boolean aBool11927;
    byte aByte11928;
    Class525_Sub21[] aClass525_Sub21Array11929 = new Class525_Sub21[4];
    public short aShort11930;
    
    boolean method16924() {
	for (int i = aShort11923; i <= aShort11924; i++) {
	    for (int i_0_ = aShort11925; i_0_ <= aShort11930; i_0_++) {
		int i_1_ = (i - 1874840879 * aClass546_10872.anInt7214
			    + -699511149 * aClass546_10872.anInt7242);
		if (i_1_ >= 0
		    && i_1_ < aClass546_10872.aBoolArrayArray7262.length) {
		    int i_2_
			= (aClass546_10872.anInt7242 * -699511149
			   + (i_0_ - 1049621335 * aClass546_10872.anInt7202));
		    if (i_2_ >= 0
			&& i_2_ < aClass546_10872.aBoolArrayArray7262.length
			&& aClass546_10872.aBoolArrayArray7262[i_1_][i_2_])
			return true;
		}
	    }
	}
	return false;
    }
    
    boolean method16956(Class182 class182) {
	return (aClass546_10872.aClass554_7208.method9184
		(aByte10870, aShort11923, aShort11924, aShort11925,
		 aShort11930, method16919(class182, (short) 128)));
    }
    
    boolean method16962() {
	for (int i = aShort11923; i <= aShort11924; i++) {
	    for (int i_3_ = aShort11925; i_3_ <= aShort11930; i_3_++) {
		int i_4_ = (i - 1874840879 * aClass546_10872.anInt7214
			    + -699511149 * aClass546_10872.anInt7242);
		if (i_4_ >= 0
		    && i_4_ < aClass546_10872.aBoolArrayArray7262.length) {
		    int i_5_
			= (aClass546_10872.anInt7242 * -699511149
			   + (i_3_ - 1049621335 * aClass546_10872.anInt7202));
		    if (i_5_ >= 0
			&& i_5_ < aClass546_10872.aBoolArrayArray7262.length
			&& aClass546_10872.aBoolArrayArray7262[i_4_][i_5_])
			return true;
		}
	    }
	}
	return false;
    }
    
    void method18557(int i) {
	/* empty */
    }
    
    boolean method16922(int i) {
	for (int i_6_ = aShort11923; i_6_ <= aShort11924; i_6_++) {
	    for (int i_7_ = aShort11925; i_7_ <= aShort11930; i_7_++) {
		int i_8_ = (i_6_ - 1874840879 * aClass546_10872.anInt7214
			    + -699511149 * aClass546_10872.anInt7242);
		if (i_8_ >= 0
		    && i_8_ < aClass546_10872.aBoolArrayArray7262.length) {
		    int i_9_
			= (aClass546_10872.anInt7242 * -699511149
			   + (i_7_ - 1049621335 * aClass546_10872.anInt7202));
		    if (i_9_ >= 0
			&& i_9_ < aClass546_10872.aBoolArrayArray7262.length
			&& aClass546_10872.aBoolArrayArray7262[i_8_][i_9_])
			return true;
		}
	    }
	}
	return false;
    }
    
    void method18558() {
	/* empty */
    }
    
    int method16958(Class525_Sub21[] class525_sub21s) {
	if (aBool8434) {
	    anInt11926 = 0;
	    int i = Math.max(0, aShort11923);
	    int i_10_ = Math.min((aClass546_10872.aLongArrayArrayArray7254
				  [aByte10867]).length - 1,
				 aShort11924);
	    int i_11_ = Math.max(0, aShort11925);
	    int i_12_ = Math.min((aClass546_10872.aLongArrayArrayArray7254
				  [aByte10867][i]).length - 1,
				 aShort11930);
	while_98_:
	    for (/**/; i <= i_10_; i++) {
		for (/**/; i_11_ <= i_12_; i_11_++) {
		    long l = (aClass546_10872.aLongArrayArrayArray7254
			      [aByte10867][i][i_11_]);
		    long l_13_ = 0L;
		while_97_:
		    while (l_13_ <= 48L) {
			int i_14_ = (int) (l >>> (int) l_13_ & 0xffffL);
			if (i_14_ <= 0)
			    break;
			Class564 class564
			    = aClass546_10872.aClass564Array7255[i_14_ - 1];
			for (int i_15_ = 0; i_15_ < anInt11926 * 534310225;
			     i_15_++) {
			    if (class564.aClass525_Sub21_7595
				== aClass525_Sub21Array11929[i_15_]) {
				l_13_ += 16L;
				continue while_97_;
			    }
			}
			aClass525_Sub21Array11929
			    [(anInt11926 += 2040429489) * 534310225 - 1]
			    = class564.aClass525_Sub21_7595;
			if (534310225 * anInt11926 == 4)
			    break while_98_;
			l_13_ += 16L;
		    }
		}
	    }
	    for (int i_16_ = 534310225 * anInt11926; i_16_ < 4; i_16_++)
		aClass525_Sub21Array11929[i_16_] = null;
	    if (aByte11928 != 0) {
		int i_17_
		    = aShort11923 - 1874840879 * aClass546_10872.anInt7214;
		int i_18_
		    = aShort11925 - 1049621335 * aClass546_10872.anInt7202;
		short i_19_;
		int i_20_;
		int i_21_;
		short i_22_;
		if (1 == aByte11928) {
		    if (i_18_ > i_17_) {
			i_19_ = aShort11923;
			i_20_ = aShort11925 - 1;
			i_21_ = aShort11923 + 1;
			i_22_ = aShort11925;
		    } else {
			i_19_ = aShort11923;
			i_20_ = 1 + aShort11925;
			i_21_ = aShort11923 - 1;
			i_22_ = aShort11925;
		    }
		} else if (i_18_ > -i_17_) {
		    i_19_ = aShort11923;
		    i_20_ = aShort11925 - 1;
		    i_21_ = aShort11923 - 1;
		    i_22_ = aShort11925;
		} else {
		    i_19_ = aShort11923;
		    i_20_ = 1 + aShort11925;
		    i_21_ = 1 + aShort11923;
		    i_22_ = aShort11925;
		}
		int i_23_ = 0;
	    while_100_:
		for (/**/; i_23_ < 534310225 * anInt11926; i_23_++) {
		    long l = (aClass546_10872.aLongArrayArrayArray7254
			      [aByte10867][i_19_][i_20_]);
		    while (0L != l) {
			Class564 class564 = (aClass546_10872.aClass564Array7255
					     [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (aClass525_Sub21Array11929[i_23_]
			    == class564.aClass525_Sub21_7595)
			    continue while_100_;
		    }
		    l = (aClass546_10872.aLongArrayArrayArray7254[aByte10867]
			 [i_21_][i_22_]);
		    while (0L != l) {
			Class564 class564 = (aClass546_10872.aClass564Array7255
					     [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (class564.aClass525_Sub21_7595
			    == aClass525_Sub21Array11929[i_23_])
			    continue while_100_;
		    }
		    for (int i_24_ = i_23_; i_24_ < anInt11926 * 534310225 - 1;
			 i_24_++)
			aClass525_Sub21Array11929[i_24_]
			    = aClass525_Sub21Array11929[1 + i_24_];
		    anInt11926 -= 2040429489;
		}
	    }
	    aBool8434 = false;
	}
	for (int i = 0; i < 534310225 * anInt11926; i++)
	    class525_sub21s[i] = aClass525_Sub21Array11929[i];
	return 534310225 * anInt11926;
    }
    
    int method16959(Class525_Sub21[] class525_sub21s) {
	if (aBool8434) {
	    anInt11926 = 0;
	    int i = Math.max(0, aShort11923);
	    int i_25_ = Math.min((aClass546_10872.aLongArrayArrayArray7254
				  [aByte10867]).length - 1,
				 aShort11924);
	    int i_26_ = Math.max(0, aShort11925);
	    int i_27_ = Math.min((aClass546_10872.aLongArrayArrayArray7254
				  [aByte10867][i]).length - 1,
				 aShort11930);
	while_102_:
	    for (/**/; i <= i_25_; i++) {
		for (/**/; i_26_ <= i_27_; i_26_++) {
		    long l = (aClass546_10872.aLongArrayArrayArray7254
			      [aByte10867][i][i_26_]);
		    long l_28_ = 0L;
		while_101_:
		    while (l_28_ <= 48L) {
			int i_29_ = (int) (l >>> (int) l_28_ & 0xffffL);
			if (i_29_ <= 0)
			    break;
			Class564 class564
			    = aClass546_10872.aClass564Array7255[i_29_ - 1];
			for (int i_30_ = 0; i_30_ < anInt11926 * 534310225;
			     i_30_++) {
			    if (class564.aClass525_Sub21_7595
				== aClass525_Sub21Array11929[i_30_]) {
				l_28_ += 16L;
				continue while_101_;
			    }
			}
			aClass525_Sub21Array11929
			    [(anInt11926 += 2040429489) * 534310225 - 1]
			    = class564.aClass525_Sub21_7595;
			if (534310225 * anInt11926 == 4)
			    break while_102_;
			l_28_ += 16L;
		    }
		}
	    }
	    for (int i_31_ = 534310225 * anInt11926; i_31_ < 4; i_31_++)
		aClass525_Sub21Array11929[i_31_] = null;
	    if (aByte11928 != 0) {
		int i_32_
		    = aShort11923 - 1874840879 * aClass546_10872.anInt7214;
		int i_33_
		    = aShort11925 - 1049621335 * aClass546_10872.anInt7202;
		short i_34_;
		int i_35_;
		int i_36_;
		short i_37_;
		if (1 == aByte11928) {
		    if (i_33_ > i_32_) {
			i_34_ = aShort11923;
			i_35_ = aShort11925 - 1;
			i_36_ = aShort11923 + 1;
			i_37_ = aShort11925;
		    } else {
			i_34_ = aShort11923;
			i_35_ = 1 + aShort11925;
			i_36_ = aShort11923 - 1;
			i_37_ = aShort11925;
		    }
		} else if (i_33_ > -i_32_) {
		    i_34_ = aShort11923;
		    i_35_ = aShort11925 - 1;
		    i_36_ = aShort11923 - 1;
		    i_37_ = aShort11925;
		} else {
		    i_34_ = aShort11923;
		    i_35_ = 1 + aShort11925;
		    i_36_ = 1 + aShort11923;
		    i_37_ = aShort11925;
		}
		int i_38_ = 0;
	    while_104_:
		for (/**/; i_38_ < 534310225 * anInt11926; i_38_++) {
		    long l = (aClass546_10872.aLongArrayArrayArray7254
			      [aByte10867][i_34_][i_35_]);
		    while (0L != l) {
			Class564 class564 = (aClass546_10872.aClass564Array7255
					     [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (aClass525_Sub21Array11929[i_38_]
			    == class564.aClass525_Sub21_7595)
			    continue while_104_;
		    }
		    l = (aClass546_10872.aLongArrayArrayArray7254[aByte10867]
			 [i_36_][i_37_]);
		    while (0L != l) {
			Class564 class564 = (aClass546_10872.aClass564Array7255
					     [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (class564.aClass525_Sub21_7595
			    == aClass525_Sub21Array11929[i_38_])
			    continue while_104_;
		    }
		    for (int i_39_ = i_38_; i_39_ < anInt11926 * 534310225 - 1;
			 i_39_++)
			aClass525_Sub21Array11929[i_39_]
			    = aClass525_Sub21Array11929[1 + i_39_];
		    anInt11926 -= 2040429489;
		}
	    }
	    aBool8434 = false;
	}
	for (int i = 0; i < 534310225 * anInt11926; i++)
	    class525_sub21s[i] = aClass525_Sub21Array11929[i];
	return 534310225 * anInt11926;
    }
    
    boolean method16937(Class182 class182) {
	return (aClass546_10872.aClass554_7208.method9184
		(aByte10870, aShort11923, aShort11924, aShort11925,
		 aShort11930, method16919(class182, (short) 128)));
    }
    
    int method16920(Class525_Sub21[] class525_sub21s, int i) {
	if (aBool8434) {
	    anInt11926 = 0;
	    int i_40_ = Math.max(0, aShort11923);
	    int i_41_ = Math.min((aClass546_10872.aLongArrayArrayArray7254
				  [aByte10867]).length - 1,
				 aShort11924);
	    int i_42_ = Math.max(0, aShort11925);
	    int i_43_ = Math.min((aClass546_10872.aLongArrayArrayArray7254
				  [aByte10867][i_40_]).length - 1,
				 aShort11930);
	while_106_:
	    for (/**/; i_40_ <= i_41_; i_40_++) {
		for (/**/; i_42_ <= i_43_; i_42_++) {
		    long l = (aClass546_10872.aLongArrayArrayArray7254
			      [aByte10867][i_40_][i_42_]);
		    long l_44_ = 0L;
		while_105_:
		    while (l_44_ <= 48L) {
			int i_45_ = (int) (l >>> (int) l_44_ & 0xffffL);
			if (i_45_ <= 0)
			    break;
			Class564 class564
			    = aClass546_10872.aClass564Array7255[i_45_ - 1];
			for (int i_46_ = 0; i_46_ < anInt11926 * 534310225;
			     i_46_++) {
			    if (class564.aClass525_Sub21_7595
				== aClass525_Sub21Array11929[i_46_]) {
				l_44_ += 16L;
				continue while_105_;
			    }
			}
			aClass525_Sub21Array11929
			    [(anInt11926 += 2040429489) * 534310225 - 1]
			    = class564.aClass525_Sub21_7595;
			if (534310225 * anInt11926 == 4)
			    break while_106_;
			l_44_ += 16L;
		    }
		}
	    }
	    for (int i_47_ = 534310225 * anInt11926; i_47_ < 4; i_47_++)
		aClass525_Sub21Array11929[i_47_] = null;
	    if (aByte11928 != 0) {
		int i_48_
		    = aShort11923 - 1874840879 * aClass546_10872.anInt7214;
		int i_49_
		    = aShort11925 - 1049621335 * aClass546_10872.anInt7202;
		short i_50_;
		int i_51_;
		int i_52_;
		short i_53_;
		if (1 == aByte11928) {
		    if (i_49_ > i_48_) {
			i_50_ = aShort11923;
			i_51_ = aShort11925 - 1;
			i_52_ = aShort11923 + 1;
			i_53_ = aShort11925;
		    } else {
			i_50_ = aShort11923;
			i_51_ = 1 + aShort11925;
			i_52_ = aShort11923 - 1;
			i_53_ = aShort11925;
		    }
		} else if (i_49_ > -i_48_) {
		    i_50_ = aShort11923;
		    i_51_ = aShort11925 - 1;
		    i_52_ = aShort11923 - 1;
		    i_53_ = aShort11925;
		} else {
		    i_50_ = aShort11923;
		    i_51_ = 1 + aShort11925;
		    i_52_ = 1 + aShort11923;
		    i_53_ = aShort11925;
		}
		int i_54_ = 0;
	    while_108_:
		for (/**/; i_54_ < 534310225 * anInt11926; i_54_++) {
		    long l = (aClass546_10872.aLongArrayArrayArray7254
			      [aByte10867][i_50_][i_51_]);
		    while (0L != l) {
			Class564 class564 = (aClass546_10872.aClass564Array7255
					     [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (aClass525_Sub21Array11929[i_54_]
			    == class564.aClass525_Sub21_7595)
			    continue while_108_;
		    }
		    l = (aClass546_10872.aLongArrayArrayArray7254[aByte10867]
			 [i_52_][i_53_]);
		    while (0L != l) {
			Class564 class564 = (aClass546_10872.aClass564Array7255
					     [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (class564.aClass525_Sub21_7595
			    == aClass525_Sub21Array11929[i_54_])
			    continue while_108_;
		    }
		    for (int i_55_ = i_54_; i_55_ < anInt11926 * 534310225 - 1;
			 i_55_++)
			aClass525_Sub21Array11929[i_55_]
			    = aClass525_Sub21Array11929[1 + i_55_];
		    anInt11926 -= 2040429489;
		}
	    }
	    aBool8434 = false;
	}
	for (int i_56_ = 0; i_56_ < 534310225 * anInt11926; i_56_++)
	    class525_sub21s[i_56_] = aClass525_Sub21Array11929[i_56_];
	return 534310225 * anInt11926;
    }
    
    boolean method16942(Class182 class182, int i) {
	return (aClass546_10872.aClass554_7208.method9184
		(aByte10870, aShort11923, aShort11924, aShort11925,
		 aShort11930, method16919(class182, (short) 128)));
    }
    
    boolean method16952() {
	for (int i = aShort11923; i <= aShort11924; i++) {
	    for (int i_57_ = aShort11925; i_57_ <= aShort11930; i_57_++) {
		int i_58_ = (i - 1874840879 * aClass546_10872.anInt7214
			     + -699511149 * aClass546_10872.anInt7242);
		if (i_58_ >= 0
		    && i_58_ < aClass546_10872.aBoolArrayArray7262.length) {
		    int i_59_
			= (aClass546_10872.anInt7242 * -699511149
			   + (i_57_ - 1049621335 * aClass546_10872.anInt7202));
		    if (i_59_ >= 0
			&& i_59_ < aClass546_10872.aBoolArrayArray7262.length
			&& aClass546_10872.aBoolArrayArray7262[i_58_][i_59_])
			return true;
		}
	    }
	}
	return false;
    }
    
    Class656_Sub1_Sub3(Class546 class546, int i, int i_60_, int i_61_,
		       int i_62_, int i_63_, int i_64_, int i_65_, int i_66_,
		       int i_67_, boolean bool, byte i_68_) {
	super(class546);
	aByte10867 = (byte) i;
	aByte10870 = (byte) i_60_;
	method10823(new Class446((float) i_61_, (float) i_62_, (float) i_63_));
	aShort11923 = (short) i_64_;
	aShort11924 = (short) i_65_;
	aShort11925 = (short) i_66_;
	aShort11930 = (short) i_67_;
	aBool11927 = bool;
	aByte11928 = i_68_;
	for (int i_69_ = 0; i_69_ < 4; i_69_++)
	    aClass525_Sub21Array11929[i_69_] = null;
    }
}
