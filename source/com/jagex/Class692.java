/* Class692 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class692
{
    static void method14113(boolean[] bools, int i, boolean[] bools_0_,
			    int i_1_, int i_2_) {
	if (bools == bools_0_) {
	    if (i == i_1_)
		return;
	    if (i_1_ > i && i_1_ < i + i_2_) {
		i_2_--;
		i += i_2_;
		i_1_ += i_2_;
		i_2_ = i - i_2_;
		i_2_ += 7;
		while (i >= i_2_) {
		    bools_0_[i_1_--] = bools[i--];
		    bools_0_[i_1_--] = bools[i--];
		    bools_0_[i_1_--] = bools[i--];
		    bools_0_[i_1_--] = bools[i--];
		    bools_0_[i_1_--] = bools[i--];
		    bools_0_[i_1_--] = bools[i--];
		    bools_0_[i_1_--] = bools[i--];
		    bools_0_[i_1_--] = bools[i--];
		}
		i_2_ -= 7;
		while (i >= i_2_)
		    bools_0_[i_1_--] = bools[i--];
		return;
	    }
	}
	i_2_ += i;
	i_2_ -= 7;
	while (i < i_2_) {
	    bools_0_[i_1_++] = bools[i++];
	    bools_0_[i_1_++] = bools[i++];
	    bools_0_[i_1_++] = bools[i++];
	    bools_0_[i_1_++] = bools[i++];
	    bools_0_[i_1_++] = bools[i++];
	    bools_0_[i_1_++] = bools[i++];
	    bools_0_[i_1_++] = bools[i++];
	    bools_0_[i_1_++] = bools[i++];
	}
	i_2_ += 7;
	while (i < i_2_)
	    bools_0_[i_1_++] = bools[i++];
    }
    
    static void method14114(double[] ds, int i, double[] ds_3_, int i_4_,
			    int i_5_) {
	if (ds == ds_3_) {
	    if (i == i_4_)
		return;
	    if (i_4_ > i && i_4_ < i + i_5_) {
		i_5_--;
		i += i_5_;
		i_4_ += i_5_;
		i_5_ = i - i_5_;
		i_5_ += 3;
		while (i >= i_5_) {
		    ds_3_[i_4_--] = ds[i--];
		    ds_3_[i_4_--] = ds[i--];
		    ds_3_[i_4_--] = ds[i--];
		    ds_3_[i_4_--] = ds[i--];
		}
		i_5_ -= 3;
		while (i >= i_5_)
		    ds_3_[i_4_--] = ds[i--];
		return;
	    }
	}
	i_5_ += i;
	i_5_ -= 3;
	while (i < i_5_) {
	    ds_3_[i_4_++] = ds[i++];
	    ds_3_[i_4_++] = ds[i++];
	    ds_3_[i_4_++] = ds[i++];
	    ds_3_[i_4_++] = ds[i++];
	}
	i_5_ += 3;
	while (i < i_5_)
	    ds_3_[i_4_++] = ds[i++];
    }
    
    static void method14115(short[] is, int i, short[] is_6_, int i_7_,
			    int i_8_) {
	if (is == is_6_) {
	    if (i == i_7_)
		return;
	    if (i_7_ > i && i_7_ < i + i_8_) {
		i_8_--;
		i += i_8_;
		i_7_ += i_8_;
		i_8_ = i - i_8_;
		i_8_ += 7;
		while (i >= i_8_) {
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		}
		i_8_ -= 7;
		while (i >= i_8_)
		    is_6_[i_7_--] = is[i--];
		return;
	    }
	}
	i_8_ += i;
	i_8_ -= 7;
	while (i < i_8_) {
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	}
	i_8_ += 7;
	while (i < i_8_)
	    is_6_[i_7_++] = is[i++];
    }
    
    public static void method14116(Object[] objects, int i,
				   Object[] objects_9_, int i_10_, int i_11_) {
	if (objects == objects_9_) {
	    if (i == i_10_)
		return;
	    if (i_10_ > i && i_10_ < i + i_11_) {
		i_11_--;
		i += i_11_;
		i_10_ += i_11_;
		i_11_ = i - i_11_;
		i_11_ += 7;
		while (i >= i_11_) {
		    objects_9_[i_10_--] = objects[i--];
		    objects_9_[i_10_--] = objects[i--];
		    objects_9_[i_10_--] = objects[i--];
		    objects_9_[i_10_--] = objects[i--];
		    objects_9_[i_10_--] = objects[i--];
		    objects_9_[i_10_--] = objects[i--];
		    objects_9_[i_10_--] = objects[i--];
		    objects_9_[i_10_--] = objects[i--];
		}
		i_11_ -= 7;
		while (i >= i_11_)
		    objects_9_[i_10_--] = objects[i--];
		return;
	    }
	}
	i_11_ += i;
	i_11_ -= 7;
	while (i < i_11_) {
	    objects_9_[i_10_++] = objects[i++];
	    objects_9_[i_10_++] = objects[i++];
	    objects_9_[i_10_++] = objects[i++];
	    objects_9_[i_10_++] = objects[i++];
	    objects_9_[i_10_++] = objects[i++];
	    objects_9_[i_10_++] = objects[i++];
	    objects_9_[i_10_++] = objects[i++];
	    objects_9_[i_10_++] = objects[i++];
	}
	i_11_ += 7;
	while (i < i_11_)
	    objects_9_[i_10_++] = objects[i++];
    }
    
    public static void method14117(int[] is, int i, int[] is_12_, int i_13_,
				   int i_14_) {
	if (is == is_12_) {
	    if (i == i_13_)
		return;
	    if (i_13_ > i && i_13_ < i + i_14_) {
		i_14_--;
		i += i_14_;
		i_13_ += i_14_;
		i_14_ = i - i_14_;
		i_14_ += 7;
		while (i >= i_14_) {
		    is_12_[i_13_--] = is[i--];
		    is_12_[i_13_--] = is[i--];
		    is_12_[i_13_--] = is[i--];
		    is_12_[i_13_--] = is[i--];
		    is_12_[i_13_--] = is[i--];
		    is_12_[i_13_--] = is[i--];
		    is_12_[i_13_--] = is[i--];
		    is_12_[i_13_--] = is[i--];
		}
		i_14_ -= 7;
		while (i >= i_14_)
		    is_12_[i_13_--] = is[i--];
		return;
	    }
	}
	i_14_ += i;
	i_14_ -= 7;
	while (i < i_14_) {
	    is_12_[i_13_++] = is[i++];
	    is_12_[i_13_++] = is[i++];
	    is_12_[i_13_++] = is[i++];
	    is_12_[i_13_++] = is[i++];
	    is_12_[i_13_++] = is[i++];
	    is_12_[i_13_++] = is[i++];
	    is_12_[i_13_++] = is[i++];
	    is_12_[i_13_++] = is[i++];
	}
	i_14_ += 7;
	while (i < i_14_)
	    is_12_[i_13_++] = is[i++];
    }
    
    static void method14118(long[] ls, int i, long[] ls_15_, int i_16_,
			    int i_17_) {
	if (ls == ls_15_) {
	    if (i == i_16_)
		return;
	    if (i_16_ > i && i_16_ < i + i_17_) {
		i_17_--;
		i += i_17_;
		i_16_ += i_17_;
		i_17_ = i - i_17_;
		i_17_ += 3;
		while (i >= i_17_) {
		    ls_15_[i_16_--] = ls[i--];
		    ls_15_[i_16_--] = ls[i--];
		    ls_15_[i_16_--] = ls[i--];
		    ls_15_[i_16_--] = ls[i--];
		}
		i_17_ -= 3;
		while (i >= i_17_)
		    ls_15_[i_16_--] = ls[i--];
		return;
	    }
	}
	i_17_ += i;
	i_17_ -= 3;
	while (i < i_17_) {
	    ls_15_[i_16_++] = ls[i++];
	    ls_15_[i_16_++] = ls[i++];
	    ls_15_[i_16_++] = ls[i++];
	    ls_15_[i_16_++] = ls[i++];
	}
	i_17_ += 3;
	while (i < i_17_)
	    ls_15_[i_16_++] = ls[i++];
    }
    
    public static void method14119
	(Object[] objects, int i, Object[] objects_18_, int i_19_, int i_20_) {
	if (objects == objects_18_) {
	    if (i == i_19_)
		return;
	    if (i_19_ > i && i_19_ < i + i_20_) {
		i_20_--;
		i += i_20_;
		i_19_ += i_20_;
		i_20_ = i - i_20_;
		i_20_ += 7;
		while (i >= i_20_) {
		    objects_18_[i_19_--] = objects[i--];
		    objects_18_[i_19_--] = objects[i--];
		    objects_18_[i_19_--] = objects[i--];
		    objects_18_[i_19_--] = objects[i--];
		    objects_18_[i_19_--] = objects[i--];
		    objects_18_[i_19_--] = objects[i--];
		    objects_18_[i_19_--] = objects[i--];
		    objects_18_[i_19_--] = objects[i--];
		}
		i_20_ -= 7;
		while (i >= i_20_)
		    objects_18_[i_19_--] = objects[i--];
		return;
	    }
	}
	i_20_ += i;
	i_20_ -= 7;
	while (i < i_20_) {
	    objects_18_[i_19_++] = objects[i++];
	    objects_18_[i_19_++] = objects[i++];
	    objects_18_[i_19_++] = objects[i++];
	    objects_18_[i_19_++] = objects[i++];
	    objects_18_[i_19_++] = objects[i++];
	    objects_18_[i_19_++] = objects[i++];
	    objects_18_[i_19_++] = objects[i++];
	    objects_18_[i_19_++] = objects[i++];
	}
	i_20_ += 7;
	while (i < i_20_)
	    objects_18_[i_19_++] = objects[i++];
    }
    
    static void method14120(double[] ds, int i, double[] ds_21_, int i_22_,
			    int i_23_) {
	if (ds == ds_21_) {
	    if (i == i_22_)
		return;
	    if (i_22_ > i && i_22_ < i + i_23_) {
		i_23_--;
		i += i_23_;
		i_22_ += i_23_;
		i_23_ = i - i_23_;
		i_23_ += 3;
		while (i >= i_23_) {
		    ds_21_[i_22_--] = ds[i--];
		    ds_21_[i_22_--] = ds[i--];
		    ds_21_[i_22_--] = ds[i--];
		    ds_21_[i_22_--] = ds[i--];
		}
		i_23_ -= 3;
		while (i >= i_23_)
		    ds_21_[i_22_--] = ds[i--];
		return;
	    }
	}
	i_23_ += i;
	i_23_ -= 3;
	while (i < i_23_) {
	    ds_21_[i_22_++] = ds[i++];
	    ds_21_[i_22_++] = ds[i++];
	    ds_21_[i_22_++] = ds[i++];
	    ds_21_[i_22_++] = ds[i++];
	}
	i_23_ += 3;
	while (i < i_23_)
	    ds_21_[i_22_++] = ds[i++];
    }
    
    static void method14121(double[] ds, int i, double[] ds_24_, int i_25_,
			    int i_26_) {
	if (ds == ds_24_) {
	    if (i == i_25_)
		return;
	    if (i_25_ > i && i_25_ < i + i_26_) {
		i_26_--;
		i += i_26_;
		i_25_ += i_26_;
		i_26_ = i - i_26_;
		i_26_ += 3;
		while (i >= i_26_) {
		    ds_24_[i_25_--] = ds[i--];
		    ds_24_[i_25_--] = ds[i--];
		    ds_24_[i_25_--] = ds[i--];
		    ds_24_[i_25_--] = ds[i--];
		}
		i_26_ -= 3;
		while (i >= i_26_)
		    ds_24_[i_25_--] = ds[i--];
		return;
	    }
	}
	i_26_ += i;
	i_26_ -= 3;
	while (i < i_26_) {
	    ds_24_[i_25_++] = ds[i++];
	    ds_24_[i_25_++] = ds[i++];
	    ds_24_[i_25_++] = ds[i++];
	    ds_24_[i_25_++] = ds[i++];
	}
	i_26_ += 3;
	while (i < i_26_)
	    ds_24_[i_25_++] = ds[i++];
    }
    
    static void method14122(char[] cs, int i, char[] cs_27_, int i_28_,
			    int i_29_) {
	if (cs == cs_27_) {
	    if (i == i_28_)
		return;
	    if (i_28_ > i && i_28_ < i + i_29_) {
		i_29_--;
		i += i_29_;
		i_28_ += i_29_;
		i_29_ = i - i_29_;
		i_29_ += 7;
		while (i >= i_29_) {
		    cs_27_[i_28_--] = cs[i--];
		    cs_27_[i_28_--] = cs[i--];
		    cs_27_[i_28_--] = cs[i--];
		    cs_27_[i_28_--] = cs[i--];
		    cs_27_[i_28_--] = cs[i--];
		    cs_27_[i_28_--] = cs[i--];
		    cs_27_[i_28_--] = cs[i--];
		    cs_27_[i_28_--] = cs[i--];
		}
		i_29_ -= 7;
		while (i >= i_29_)
		    cs_27_[i_28_--] = cs[i--];
		return;
	    }
	}
	i_29_ += i;
	i_29_ -= 7;
	while (i < i_29_) {
	    cs_27_[i_28_++] = cs[i++];
	    cs_27_[i_28_++] = cs[i++];
	    cs_27_[i_28_++] = cs[i++];
	    cs_27_[i_28_++] = cs[i++];
	    cs_27_[i_28_++] = cs[i++];
	    cs_27_[i_28_++] = cs[i++];
	    cs_27_[i_28_++] = cs[i++];
	    cs_27_[i_28_++] = cs[i++];
	}
	i_29_ += 7;
	while (i < i_29_)
	    cs_27_[i_28_++] = cs[i++];
    }
    
    public static void method14123(int[] is, int i, int i_30_, int i_31_) {
	i_30_ = i + i_30_ - 7;
	while (i < i_30_) {
	    is[i++] = i_31_;
	    is[i++] = i_31_;
	    is[i++] = i_31_;
	    is[i++] = i_31_;
	    is[i++] = i_31_;
	    is[i++] = i_31_;
	    is[i++] = i_31_;
	    is[i++] = i_31_;
	}
	i_30_ += 7;
	while (i < i_30_)
	    is[i++] = i_31_;
    }
    
    static void method14124(byte[] is, int i, byte[] is_32_, int i_33_,
			    int i_34_) {
	if (is == is_32_) {
	    if (i == i_33_)
		return;
	    if (i_33_ > i && i_33_ < i + i_34_) {
		i_34_--;
		i += i_34_;
		i_33_ += i_34_;
		i_34_ = i - i_34_;
		i_34_ += 7;
		while (i >= i_34_) {
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		    is_32_[i_33_--] = is[i--];
		}
		i_34_ -= 7;
		while (i >= i_34_)
		    is_32_[i_33_--] = is[i--];
		return;
	    }
	}
	i_34_ += i;
	i_34_ -= 7;
	while (i < i_34_) {
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	    is_32_[i_33_++] = is[i++];
	}
	i_34_ += 7;
	while (i < i_34_)
	    is_32_[i_33_++] = is[i++];
    }
    
    static void method14125(byte[] is, int i, byte[] is_35_, int i_36_,
			    int i_37_) {
	if (is == is_35_) {
	    if (i == i_36_)
		return;
	    if (i_36_ > i && i_36_ < i + i_37_) {
		i_37_--;
		i += i_37_;
		i_36_ += i_37_;
		i_37_ = i - i_37_;
		i_37_ += 7;
		while (i >= i_37_) {
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		}
		i_37_ -= 7;
		while (i >= i_37_)
		    is_35_[i_36_--] = is[i--];
		return;
	    }
	}
	i_37_ += i;
	i_37_ -= 7;
	while (i < i_37_) {
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	}
	i_37_ += 7;
	while (i < i_37_)
	    is_35_[i_36_++] = is[i++];
    }
    
    static void method14126(short[] is, int i, short[] is_38_, int i_39_,
			    int i_40_) {
	if (is == is_38_) {
	    if (i == i_39_)
		return;
	    if (i_39_ > i && i_39_ < i + i_40_) {
		i_40_--;
		i += i_40_;
		i_39_ += i_40_;
		i_40_ = i - i_40_;
		i_40_ += 7;
		while (i >= i_40_) {
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		}
		i_40_ -= 7;
		while (i >= i_40_)
		    is_38_[i_39_--] = is[i--];
		return;
	    }
	}
	i_40_ += i;
	i_40_ -= 7;
	while (i < i_40_) {
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	}
	i_40_ += 7;
	while (i < i_40_)
	    is_38_[i_39_++] = is[i++];
    }
    
    static void method14127(short[] is, int i, short[] is_41_, int i_42_,
			    int i_43_) {
	if (is == is_41_) {
	    if (i == i_42_)
		return;
	    if (i_42_ > i && i_42_ < i + i_43_) {
		i_43_--;
		i += i_43_;
		i_42_ += i_43_;
		i_43_ = i - i_43_;
		i_43_ += 7;
		while (i >= i_43_) {
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		}
		i_43_ -= 7;
		while (i >= i_43_)
		    is_41_[i_42_--] = is[i--];
		return;
	    }
	}
	i_43_ += i;
	i_43_ -= 7;
	while (i < i_43_) {
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	}
	i_43_ += 7;
	while (i < i_43_)
	    is_41_[i_42_++] = is[i++];
    }
    
    static void method14128(byte[] is, int i, byte[] is_44_, int i_45_,
			    int i_46_) {
	if (is == is_44_) {
	    if (i == i_45_)
		return;
	    if (i_45_ > i && i_45_ < i + i_46_) {
		i_46_--;
		i += i_46_;
		i_45_ += i_46_;
		i_46_ = i - i_46_;
		i_46_ += 7;
		while (i >= i_46_) {
		    is_44_[i_45_--] = is[i--];
		    is_44_[i_45_--] = is[i--];
		    is_44_[i_45_--] = is[i--];
		    is_44_[i_45_--] = is[i--];
		    is_44_[i_45_--] = is[i--];
		    is_44_[i_45_--] = is[i--];
		    is_44_[i_45_--] = is[i--];
		    is_44_[i_45_--] = is[i--];
		}
		i_46_ -= 7;
		while (i >= i_46_)
		    is_44_[i_45_--] = is[i--];
		return;
	    }
	}
	i_46_ += i;
	i_46_ -= 7;
	while (i < i_46_) {
	    is_44_[i_45_++] = is[i++];
	    is_44_[i_45_++] = is[i++];
	    is_44_[i_45_++] = is[i++];
	    is_44_[i_45_++] = is[i++];
	    is_44_[i_45_++] = is[i++];
	    is_44_[i_45_++] = is[i++];
	    is_44_[i_45_++] = is[i++];
	    is_44_[i_45_++] = is[i++];
	}
	i_46_ += 7;
	while (i < i_46_)
	    is_44_[i_45_++] = is[i++];
    }
    
    static void method14129(short[] is, int i, short[] is_47_, int i_48_,
			    int i_49_) {
	if (is == is_47_) {
	    if (i == i_48_)
		return;
	    if (i_48_ > i && i_48_ < i + i_49_) {
		i_49_--;
		i += i_49_;
		i_48_ += i_49_;
		i_49_ = i - i_49_;
		i_49_ += 7;
		while (i >= i_49_) {
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		    is_47_[i_48_--] = is[i--];
		}
		i_49_ -= 7;
		while (i >= i_49_)
		    is_47_[i_48_--] = is[i--];
		return;
	    }
	}
	i_49_ += i;
	i_49_ -= 7;
	while (i < i_49_) {
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	    is_47_[i_48_++] = is[i++];
	}
	i_49_ += 7;
	while (i < i_49_)
	    is_47_[i_48_++] = is[i++];
    }
    
    static void method14130(double[] ds, int i, double[] ds_50_, int i_51_,
			    int i_52_) {
	if (ds == ds_50_) {
	    if (i == i_51_)
		return;
	    if (i_51_ > i && i_51_ < i + i_52_) {
		i_52_--;
		i += i_52_;
		i_51_ += i_52_;
		i_52_ = i - i_52_;
		i_52_ += 3;
		while (i >= i_52_) {
		    ds_50_[i_51_--] = ds[i--];
		    ds_50_[i_51_--] = ds[i--];
		    ds_50_[i_51_--] = ds[i--];
		    ds_50_[i_51_--] = ds[i--];
		}
		i_52_ -= 3;
		while (i >= i_52_)
		    ds_50_[i_51_--] = ds[i--];
		return;
	    }
	}
	i_52_ += i;
	i_52_ -= 3;
	while (i < i_52_) {
	    ds_50_[i_51_++] = ds[i++];
	    ds_50_[i_51_++] = ds[i++];
	    ds_50_[i_51_++] = ds[i++];
	    ds_50_[i_51_++] = ds[i++];
	}
	i_52_ += 3;
	while (i < i_52_)
	    ds_50_[i_51_++] = ds[i++];
    }
    
    Class692() throws Throwable {
	throw new Error();
    }
    
    static void method14131(long[] ls, int i, long[] ls_53_, int i_54_,
			    int i_55_) {
	if (ls == ls_53_) {
	    if (i == i_54_)
		return;
	    if (i_54_ > i && i_54_ < i + i_55_) {
		i_55_--;
		i += i_55_;
		i_54_ += i_55_;
		i_55_ = i - i_55_;
		i_55_ += 3;
		while (i >= i_55_) {
		    ls_53_[i_54_--] = ls[i--];
		    ls_53_[i_54_--] = ls[i--];
		    ls_53_[i_54_--] = ls[i--];
		    ls_53_[i_54_--] = ls[i--];
		}
		i_55_ -= 3;
		while (i >= i_55_)
		    ls_53_[i_54_--] = ls[i--];
		return;
	    }
	}
	i_55_ += i;
	i_55_ -= 3;
	while (i < i_55_) {
	    ls_53_[i_54_++] = ls[i++];
	    ls_53_[i_54_++] = ls[i++];
	    ls_53_[i_54_++] = ls[i++];
	    ls_53_[i_54_++] = ls[i++];
	}
	i_55_ += 3;
	while (i < i_55_)
	    ls_53_[i_54_++] = ls[i++];
    }
    
    static void method14132(long[] ls, int i, long[] ls_56_, int i_57_,
			    int i_58_) {
	if (ls == ls_56_) {
	    if (i == i_57_)
		return;
	    if (i_57_ > i && i_57_ < i + i_58_) {
		i_58_--;
		i += i_58_;
		i_57_ += i_58_;
		i_58_ = i - i_58_;
		i_58_ += 3;
		while (i >= i_58_) {
		    ls_56_[i_57_--] = ls[i--];
		    ls_56_[i_57_--] = ls[i--];
		    ls_56_[i_57_--] = ls[i--];
		    ls_56_[i_57_--] = ls[i--];
		}
		i_58_ -= 3;
		while (i >= i_58_)
		    ls_56_[i_57_--] = ls[i--];
		return;
	    }
	}
	i_58_ += i;
	i_58_ -= 3;
	while (i < i_58_) {
	    ls_56_[i_57_++] = ls[i++];
	    ls_56_[i_57_++] = ls[i++];
	    ls_56_[i_57_++] = ls[i++];
	    ls_56_[i_57_++] = ls[i++];
	}
	i_58_ += 3;
	while (i < i_58_)
	    ls_56_[i_57_++] = ls[i++];
    }
    
    public static void method14133(float[] fs, int i, float[] fs_59_,
				   int i_60_, int i_61_) {
	if (fs == fs_59_) {
	    if (i == i_60_)
		return;
	    if (i_60_ > i && i_60_ < i + i_61_) {
		i_61_--;
		i += i_61_;
		i_60_ += i_61_;
		i_61_ = i - i_61_;
		i_61_ += 7;
		while (i >= i_61_) {
		    fs_59_[i_60_--] = fs[i--];
		    fs_59_[i_60_--] = fs[i--];
		    fs_59_[i_60_--] = fs[i--];
		    fs_59_[i_60_--] = fs[i--];
		    fs_59_[i_60_--] = fs[i--];
		    fs_59_[i_60_--] = fs[i--];
		    fs_59_[i_60_--] = fs[i--];
		    fs_59_[i_60_--] = fs[i--];
		}
		i_61_ -= 7;
		while (i >= i_61_)
		    fs_59_[i_60_--] = fs[i--];
		return;
	    }
	}
	i_61_ += i;
	i_61_ -= 7;
	while (i < i_61_) {
	    fs_59_[i_60_++] = fs[i++];
	    fs_59_[i_60_++] = fs[i++];
	    fs_59_[i_60_++] = fs[i++];
	    fs_59_[i_60_++] = fs[i++];
	    fs_59_[i_60_++] = fs[i++];
	    fs_59_[i_60_++] = fs[i++];
	    fs_59_[i_60_++] = fs[i++];
	    fs_59_[i_60_++] = fs[i++];
	}
	i_61_ += 7;
	while (i < i_61_)
	    fs_59_[i_60_++] = fs[i++];
    }
    
    static void method14134(char[] cs, int i, char[] cs_62_, int i_63_,
			    int i_64_) {
	if (cs == cs_62_) {
	    if (i == i_63_)
		return;
	    if (i_63_ > i && i_63_ < i + i_64_) {
		i_64_--;
		i += i_64_;
		i_63_ += i_64_;
		i_64_ = i - i_64_;
		i_64_ += 7;
		while (i >= i_64_) {
		    cs_62_[i_63_--] = cs[i--];
		    cs_62_[i_63_--] = cs[i--];
		    cs_62_[i_63_--] = cs[i--];
		    cs_62_[i_63_--] = cs[i--];
		    cs_62_[i_63_--] = cs[i--];
		    cs_62_[i_63_--] = cs[i--];
		    cs_62_[i_63_--] = cs[i--];
		    cs_62_[i_63_--] = cs[i--];
		}
		i_64_ -= 7;
		while (i >= i_64_)
		    cs_62_[i_63_--] = cs[i--];
		return;
	    }
	}
	i_64_ += i;
	i_64_ -= 7;
	while (i < i_64_) {
	    cs_62_[i_63_++] = cs[i++];
	    cs_62_[i_63_++] = cs[i++];
	    cs_62_[i_63_++] = cs[i++];
	    cs_62_[i_63_++] = cs[i++];
	    cs_62_[i_63_++] = cs[i++];
	    cs_62_[i_63_++] = cs[i++];
	    cs_62_[i_63_++] = cs[i++];
	    cs_62_[i_63_++] = cs[i++];
	}
	i_64_ += 7;
	while (i < i_64_)
	    cs_62_[i_63_++] = cs[i++];
    }
    
    static void method14135(boolean[] bools, int i, boolean[] bools_65_,
			    int i_66_, int i_67_) {
	if (bools == bools_65_) {
	    if (i == i_66_)
		return;
	    if (i_66_ > i && i_66_ < i + i_67_) {
		i_67_--;
		i += i_67_;
		i_66_ += i_67_;
		i_67_ = i - i_67_;
		i_67_ += 7;
		while (i >= i_67_) {
		    bools_65_[i_66_--] = bools[i--];
		    bools_65_[i_66_--] = bools[i--];
		    bools_65_[i_66_--] = bools[i--];
		    bools_65_[i_66_--] = bools[i--];
		    bools_65_[i_66_--] = bools[i--];
		    bools_65_[i_66_--] = bools[i--];
		    bools_65_[i_66_--] = bools[i--];
		    bools_65_[i_66_--] = bools[i--];
		}
		i_67_ -= 7;
		while (i >= i_67_)
		    bools_65_[i_66_--] = bools[i--];
		return;
	    }
	}
	i_67_ += i;
	i_67_ -= 7;
	while (i < i_67_) {
	    bools_65_[i_66_++] = bools[i++];
	    bools_65_[i_66_++] = bools[i++];
	    bools_65_[i_66_++] = bools[i++];
	    bools_65_[i_66_++] = bools[i++];
	    bools_65_[i_66_++] = bools[i++];
	    bools_65_[i_66_++] = bools[i++];
	    bools_65_[i_66_++] = bools[i++];
	    bools_65_[i_66_++] = bools[i++];
	}
	i_67_ += 7;
	while (i < i_67_)
	    bools_65_[i_66_++] = bools[i++];
    }
    
    public static void method14136(float[] fs, int i, float[] fs_68_,
				   int i_69_, int i_70_) {
	if (fs == fs_68_) {
	    if (i == i_69_)
		return;
	    if (i_69_ > i && i_69_ < i + i_70_) {
		i_70_--;
		i += i_70_;
		i_69_ += i_70_;
		i_70_ = i - i_70_;
		i_70_ += 7;
		while (i >= i_70_) {
		    fs_68_[i_69_--] = fs[i--];
		    fs_68_[i_69_--] = fs[i--];
		    fs_68_[i_69_--] = fs[i--];
		    fs_68_[i_69_--] = fs[i--];
		    fs_68_[i_69_--] = fs[i--];
		    fs_68_[i_69_--] = fs[i--];
		    fs_68_[i_69_--] = fs[i--];
		    fs_68_[i_69_--] = fs[i--];
		}
		i_70_ -= 7;
		while (i >= i_70_)
		    fs_68_[i_69_--] = fs[i--];
		return;
	    }
	}
	i_70_ += i;
	i_70_ -= 7;
	while (i < i_70_) {
	    fs_68_[i_69_++] = fs[i++];
	    fs_68_[i_69_++] = fs[i++];
	    fs_68_[i_69_++] = fs[i++];
	    fs_68_[i_69_++] = fs[i++];
	    fs_68_[i_69_++] = fs[i++];
	    fs_68_[i_69_++] = fs[i++];
	    fs_68_[i_69_++] = fs[i++];
	    fs_68_[i_69_++] = fs[i++];
	}
	i_70_ += 7;
	while (i < i_70_)
	    fs_68_[i_69_++] = fs[i++];
    }
    
    public static void method14137(float[] fs, int i, float[] fs_71_,
				   int i_72_, int i_73_) {
	if (fs == fs_71_) {
	    if (i == i_72_)
		return;
	    if (i_72_ > i && i_72_ < i + i_73_) {
		i_73_--;
		i += i_73_;
		i_72_ += i_73_;
		i_73_ = i - i_73_;
		i_73_ += 7;
		while (i >= i_73_) {
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		    fs_71_[i_72_--] = fs[i--];
		}
		i_73_ -= 7;
		while (i >= i_73_)
		    fs_71_[i_72_--] = fs[i--];
		return;
	    }
	}
	i_73_ += i;
	i_73_ -= 7;
	while (i < i_73_) {
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	    fs_71_[i_72_++] = fs[i++];
	}
	i_73_ += 7;
	while (i < i_73_)
	    fs_71_[i_72_++] = fs[i++];
    }
    
    static void method14138(short[] is, int i, short[] is_74_, int i_75_,
			    int i_76_) {
	if (is == is_74_) {
	    if (i == i_75_)
		return;
	    if (i_75_ > i && i_75_ < i + i_76_) {
		i_76_--;
		i += i_76_;
		i_75_ += i_76_;
		i_76_ = i - i_76_;
		i_76_ += 7;
		while (i >= i_76_) {
		    is_74_[i_75_--] = is[i--];
		    is_74_[i_75_--] = is[i--];
		    is_74_[i_75_--] = is[i--];
		    is_74_[i_75_--] = is[i--];
		    is_74_[i_75_--] = is[i--];
		    is_74_[i_75_--] = is[i--];
		    is_74_[i_75_--] = is[i--];
		    is_74_[i_75_--] = is[i--];
		}
		i_76_ -= 7;
		while (i >= i_76_)
		    is_74_[i_75_--] = is[i--];
		return;
	    }
	}
	i_76_ += i;
	i_76_ -= 7;
	while (i < i_76_) {
	    is_74_[i_75_++] = is[i++];
	    is_74_[i_75_++] = is[i++];
	    is_74_[i_75_++] = is[i++];
	    is_74_[i_75_++] = is[i++];
	    is_74_[i_75_++] = is[i++];
	    is_74_[i_75_++] = is[i++];
	    is_74_[i_75_++] = is[i++];
	    is_74_[i_75_++] = is[i++];
	}
	i_76_ += 7;
	while (i < i_76_)
	    is_74_[i_75_++] = is[i++];
    }
    
    public static void method14139
	(Object[] objects, int i, Object[] objects_77_, int i_78_, int i_79_) {
	if (objects == objects_77_) {
	    if (i == i_78_)
		return;
	    if (i_78_ > i && i_78_ < i + i_79_) {
		i_79_--;
		i += i_79_;
		i_78_ += i_79_;
		i_79_ = i - i_79_;
		i_79_ += 7;
		while (i >= i_79_) {
		    objects_77_[i_78_--] = objects[i--];
		    objects_77_[i_78_--] = objects[i--];
		    objects_77_[i_78_--] = objects[i--];
		    objects_77_[i_78_--] = objects[i--];
		    objects_77_[i_78_--] = objects[i--];
		    objects_77_[i_78_--] = objects[i--];
		    objects_77_[i_78_--] = objects[i--];
		    objects_77_[i_78_--] = objects[i--];
		}
		i_79_ -= 7;
		while (i >= i_79_)
		    objects_77_[i_78_--] = objects[i--];
		return;
	    }
	}
	i_79_ += i;
	i_79_ -= 7;
	while (i < i_79_) {
	    objects_77_[i_78_++] = objects[i++];
	    objects_77_[i_78_++] = objects[i++];
	    objects_77_[i_78_++] = objects[i++];
	    objects_77_[i_78_++] = objects[i++];
	    objects_77_[i_78_++] = objects[i++];
	    objects_77_[i_78_++] = objects[i++];
	    objects_77_[i_78_++] = objects[i++];
	    objects_77_[i_78_++] = objects[i++];
	}
	i_79_ += 7;
	while (i < i_79_)
	    objects_77_[i_78_++] = objects[i++];
    }
    
    public static void method14140
	(Object[] objects, int i, Object[] objects_80_, int i_81_, int i_82_) {
	if (objects == objects_80_) {
	    if (i == i_81_)
		return;
	    if (i_81_ > i && i_81_ < i + i_82_) {
		i_82_--;
		i += i_82_;
		i_81_ += i_82_;
		i_82_ = i - i_82_;
		i_82_ += 7;
		while (i >= i_82_) {
		    objects_80_[i_81_--] = objects[i--];
		    objects_80_[i_81_--] = objects[i--];
		    objects_80_[i_81_--] = objects[i--];
		    objects_80_[i_81_--] = objects[i--];
		    objects_80_[i_81_--] = objects[i--];
		    objects_80_[i_81_--] = objects[i--];
		    objects_80_[i_81_--] = objects[i--];
		    objects_80_[i_81_--] = objects[i--];
		}
		i_82_ -= 7;
		while (i >= i_82_)
		    objects_80_[i_81_--] = objects[i--];
		return;
	    }
	}
	i_82_ += i;
	i_82_ -= 7;
	while (i < i_82_) {
	    objects_80_[i_81_++] = objects[i++];
	    objects_80_[i_81_++] = objects[i++];
	    objects_80_[i_81_++] = objects[i++];
	    objects_80_[i_81_++] = objects[i++];
	    objects_80_[i_81_++] = objects[i++];
	    objects_80_[i_81_++] = objects[i++];
	    objects_80_[i_81_++] = objects[i++];
	    objects_80_[i_81_++] = objects[i++];
	}
	i_82_ += 7;
	while (i < i_82_)
	    objects_80_[i_81_++] = objects[i++];
    }
    
    static void method14141(char[] cs, int i, char[] cs_83_, int i_84_,
			    int i_85_) {
	if (cs == cs_83_) {
	    if (i == i_84_)
		return;
	    if (i_84_ > i && i_84_ < i + i_85_) {
		i_85_--;
		i += i_85_;
		i_84_ += i_85_;
		i_85_ = i - i_85_;
		i_85_ += 7;
		while (i >= i_85_) {
		    cs_83_[i_84_--] = cs[i--];
		    cs_83_[i_84_--] = cs[i--];
		    cs_83_[i_84_--] = cs[i--];
		    cs_83_[i_84_--] = cs[i--];
		    cs_83_[i_84_--] = cs[i--];
		    cs_83_[i_84_--] = cs[i--];
		    cs_83_[i_84_--] = cs[i--];
		    cs_83_[i_84_--] = cs[i--];
		}
		i_85_ -= 7;
		while (i >= i_85_)
		    cs_83_[i_84_--] = cs[i--];
		return;
	    }
	}
	i_85_ += i;
	i_85_ -= 7;
	while (i < i_85_) {
	    cs_83_[i_84_++] = cs[i++];
	    cs_83_[i_84_++] = cs[i++];
	    cs_83_[i_84_++] = cs[i++];
	    cs_83_[i_84_++] = cs[i++];
	    cs_83_[i_84_++] = cs[i++];
	    cs_83_[i_84_++] = cs[i++];
	    cs_83_[i_84_++] = cs[i++];
	    cs_83_[i_84_++] = cs[i++];
	}
	i_85_ += 7;
	while (i < i_85_)
	    cs_83_[i_84_++] = cs[i++];
    }
    
    public static void method14142(int[] is, int i, int i_86_, int i_87_) {
	i_86_ = i + i_86_ - 7;
	while (i < i_86_) {
	    is[i++] = i_87_;
	    is[i++] = i_87_;
	    is[i++] = i_87_;
	    is[i++] = i_87_;
	    is[i++] = i_87_;
	    is[i++] = i_87_;
	    is[i++] = i_87_;
	    is[i++] = i_87_;
	}
	i_86_ += 7;
	while (i < i_86_)
	    is[i++] = i_87_;
    }
    
    public static void method14143(int[] is, int i, int i_88_, int i_89_) {
	i_88_ = i + i_88_ - 7;
	while (i < i_88_) {
	    is[i++] = i_89_;
	    is[i++] = i_89_;
	    is[i++] = i_89_;
	    is[i++] = i_89_;
	    is[i++] = i_89_;
	    is[i++] = i_89_;
	    is[i++] = i_89_;
	    is[i++] = i_89_;
	}
	i_88_ += 7;
	while (i < i_88_)
	    is[i++] = i_89_;
    }
}
