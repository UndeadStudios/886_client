/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class163 implements Interface14
{
    public Class495 aClass495_1765;
    public int anInt1766;
    public Class453 aClass453_1767;
    public Class450 aClass450_1768 = Class450.aClass450_4922;
    public boolean aBool1769 = true;
    
    Class163(Class453 class453, int i) {
	aClass453_1767 = class453;
	anInt1766 = 1571050705 * i;
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(620384226);
	    if (0 == i_0_)
		break;
	    Class147 class147
		= ((Class147)
		   Class539.method8888(Class312_Sub1.method15701(846836289),
				       i_0_, -1261113994));
	    if (class147 != null) {
		switch (773792899 * class147.anInt1689) {
		case 5:
		    break;
		case 0:
		    Class539.method8888(Class376.method6366((byte) 84),
					class525_sub38.readUnsignedByte(116368912),
					311420627);
		    break;
		case 1:
		    aBool1769 = false;
		    break;
		case 4: {
		    int i_1_ = class525_sub38.readUnsignedByte(1228577196);
		    aClass495_1765
			= ((Class495)
			   Class539.method8888(Class495.method8143((byte) 1),
					       i_1_, -944405582));
		    if (aClass495_1765 == null)
			throw new IllegalStateException("");
		    break;
		}
		case 2:
		    class525_sub38.method16637(77503958);
		    break;
		default:
		    throw new IllegalStateException("");
		case 6:
		    aClass450_1768
			= ((Class450)
			   Class539.method8888(Class40_Sub1
						   .method17376(1128306081),
					       class525_sub38
						   .readUnsignedByte(1692533401),
					       561008609));
		}
	    } else
		method2644(class525_sub38, i_0_, (byte) 30);
	}
    }
    
    abstract void method2644(RSBuffer class525_sub38, int i, byte i_2_);
    
    boolean method2645() {
	if (null == aClass453_1767 || aClass495_1765 == null)
	    return false;
	return true;
    }
    
    public Object method2646(int i) {
	return aClass453_1767.method7345(this, 1943996568);
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1655428658);
	    if (0 == i)
		break;
	    Class147 class147
		= ((Class147)
		   Class539.method8888(Class312_Sub1.method15701(846836289), i,
				       -903116299));
	    if (class147 != null) {
		switch (773792899 * class147.anInt1689) {
		case 5:
		    break;
		case 0:
		    Class539.method8888(Class376.method6366((byte) 114),
					class525_sub38.readUnsignedByte(2130215009),
					151870446);
		    break;
		case 1:
		    aBool1769 = false;
		    break;
		case 4: {
		    int i_3_ = class525_sub38.readUnsignedByte(1096999144);
		    aClass495_1765
			= ((Class495)
			   Class539.method8888(Class495.method8143((byte) 1),
					       i_3_, -1287732696));
		    if (aClass495_1765 == null)
			throw new IllegalStateException("");
		    break;
		}
		case 2:
		    class525_sub38.method16637(1053598210);
		    break;
		default:
		    throw new IllegalStateException("");
		case 6:
		    aClass450_1768
			= ((Class450)
			   Class539.method8888(Class40_Sub1
						   .method17376(-2097597768),
					       class525_sub38
						   .readUnsignedByte(880483510),
					       1021219883));
		}
	    } else
		method2644(class525_sub38, i, (byte) 98);
	}
    }
    
    boolean method2647() {
	if (null == aClass453_1767 || aClass495_1765 == null)
	    return false;
	return true;
    }
    
    boolean method2648(short i) {
	if (null == aClass453_1767 || aClass495_1765 == null)
	    return false;
	return true;
    }
    
    boolean method2649() {
	if (null == aClass453_1767 || aClass495_1765 == null)
	    return false;
	return true;
    }
    
    abstract void method2650(RSBuffer class525_sub38, int i);
    
    public Object method2651() {
	return aClass453_1767.method7345(this, -1364912266);
    }
    
    public Object method2652() {
	return aClass453_1767.method7345(this, 1721964715);
    }
    
    public static void method2653(int i) {
	Class589.aClass157_7807 = null;
    }
    
    static final void method2654(Class683 class683, int i) {
	/* empty */
    }
    
    public static int method2655(CharSequence charsequence,
				 CharSequence charsequence_4_, int i) {
	int i_5_ = charsequence.length();
	int i_6_ = charsequence_4_.length();
	if (i_5_ == 0)
	    return i_6_;
	if (i_6_ == 0)
	    return i_5_;
	int[] is = new int[1 + i_5_];
	int[] is_7_ = new int[i_5_ + 1];
	for (int i_8_ = 0; i_8_ <= i_5_; i_8_++)
	    is[i_8_] = i_8_;
	for (int i_9_ = 1; i_9_ <= i_6_; i_9_++) {
	    is_7_[0] = i_9_;
	    char c = charsequence_4_.charAt(i_9_ - 1);
	    for (int i_10_ = 1; i_10_ <= i_5_; i_10_++)
		is_7_[i_10_]
		    = Math.min(Math.min(1 + is_7_[i_10_ - 1], 1 + is[i_10_]),
			       (is[i_10_ - 1]
				+ (charsequence.charAt(i_10_ - 1) == c ? 0
				   : 1)));
	    int[] is_11_ = is;
	    is = is_7_;
	    is_7_ = is_11_;
	}
	return is[i_5_];
    }
    
    static final void method2656(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class585_Sub1.method16484(class259, class245, class683, 425570522);
    }
    
    static final void method2657(Class683 class683, int i) {
	if (Class28.aClass702_283 == null)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 108507919 * Class28.aClass702_283.anInt8786;
    }
    
    public static Class517[] method2658(byte i) {
	return (new Class517[]
		{ Class517.aClass517_6562, Class517.aClass517_6051,
		  Class517.aClass517_6680, Class517.aClass517_5759,
		  Class517.aClass517_6164, Class517.aClass517_6061,
		  Class517.aClass517_6581, Class517.aClass517_6047,
		  Class517.aClass517_6806, Class517.aClass517_6132,
		  Class517.aClass517_6878, Class517.aClass517_6557,
		  Class517.aClass517_6522, Class517.aClass517_6119,
		  Class517.aClass517_6989, Class517.aClass517_6542,
		  Class517.aClass517_6617, Class517.aClass517_5856,
		  Class517.aClass517_6369, Class517.aClass517_6909,
		  Class517.aClass517_6915, Class517.aClass517_5761,
		  Class517.aClass517_6073, Class517.aClass517_6050,
		  Class517.aClass517_7049, Class517.aClass517_5814,
		  Class517.aClass517_6644, Class517.aClass517_6758,
		  Class517.aClass517_6591, Class517.aClass517_6560,
		  Class517.aClass517_6565, Class517.aClass517_6901,
		  Class517.aClass517_6872, Class517.aClass517_6105,
		  Class517.aClass517_6959, Class517.aClass517_5989,
		  Class517.aClass517_6070, Class517.aClass517_6507,
		  Class517.aClass517_5797, Class517.aClass517_5779,
		  Class517.aClass517_6411, Class517.aClass517_6810,
		  Class517.aClass517_6091, Class517.aClass517_5837,
		  Class517.aClass517_6858, Class517.aClass517_6467,
		  Class517.aClass517_6826, Class517.aClass517_6305,
		  Class517.aClass517_6807, Class517.aClass517_6726,
		  Class517.aClass517_6295, Class517.aClass517_6384,
		  Class517.aClass517_7030, Class517.aClass517_7003,
		  Class517.aClass517_6875, Class517.aClass517_6632,
		  Class517.aClass517_6908, Class517.aClass517_5937,
		  Class517.aClass517_6534, Class517.aClass517_5883,
		  Class517.aClass517_6425, Class517.aClass517_6124,
		  Class517.aClass517_6750, Class517.aClass517_6767,
		  Class517.aClass517_5864, Class517.aClass517_6142,
		  Class517.aClass517_6222, Class517.aClass517_6163,
		  Class517.aClass517_5773, Class517.aClass517_6186,
		  Class517.aClass517_5765, Class517.aClass517_5880,
		  Class517.aClass517_6816, Class517.aClass517_6290,
		  Class517.aClass517_5893, Class517.aClass517_6252,
		  Class517.aClass517_5781, Class517.aClass517_6183,
		  Class517.aClass517_6946, Class517.aClass517_6894,
		  Class517.aClass517_5942, Class517.aClass517_6372,
		  Class517.aClass517_6274, Class517.aClass517_6442,
		  Class517.aClass517_6246, Class517.aClass517_6755,
		  Class517.aClass517_6351, Class517.aClass517_6496,
		  Class517.aClass517_6443, Class517.aClass517_6667,
		  Class517.aClass517_6841, Class517.aClass517_6710,
		  Class517.aClass517_6582, Class517.aClass517_6407,
		  Class517.aClass517_5857, Class517.aClass517_6663,
		  Class517.aClass517_7023, Class517.aClass517_6707,
		  Class517.aClass517_6570, Class517.aClass517_6655,
		  Class517.aClass517_6852, Class517.aClass517_7013,
		  Class517.aClass517_6402, Class517.aClass517_6958,
		  Class517.aClass517_6626, Class517.aClass517_6313,
		  Class517.aClass517_5992, Class517.aClass517_6857,
		  Class517.aClass517_5981, Class517.aClass517_6913,
		  Class517.aClass517_6326, Class517.aClass517_5858,
		  Class517.aClass517_6569, Class517.aClass517_5978,
		  Class517.aClass517_6579, Class517.aClass517_5902,
		  Class517.aClass517_6034, Class517.aClass517_6566,
		  Class517.aClass517_6921, Class517.aClass517_7050,
		  Class517.aClass517_5904, Class517.aClass517_6450,
		  Class517.aClass517_7033, Class517.aClass517_6447,
		  Class517.aClass517_6161, Class517.aClass517_6615,
		  Class517.aClass517_6960, Class517.aClass517_6690,
		  Class517.aClass517_5895, Class517.aClass517_6991,
		  Class517.aClass517_6095, Class517.aClass517_6243,
		  Class517.aClass517_6689, Class517.aClass517_6656,
		  Class517.aClass517_6925, Class517.aClass517_6642,
		  Class517.aClass517_5805, Class517.aClass517_6160,
		  Class517.aClass517_6093, Class517.aClass517_6264,
		  Class517.aClass517_6320, Class517.aClass517_5961,
		  Class517.aClass517_6997, Class517.aClass517_6283,
		  Class517.aClass517_6694, Class517.aClass517_5876,
		  Class517.aClass517_6527, Class517.aClass517_5829,
		  Class517.aClass517_6422, Class517.aClass517_7020,
		  Class517.aClass517_5875, Class517.aClass517_6572,
		  Class517.aClass517_6032, Class517.aClass517_6180,
		  Class517.aClass517_6101, Class517.aClass517_6346,
		  Class517.aClass517_6121, Class517.aClass517_6386,
		  Class517.aClass517_6365, Class517.aClass517_6859,
		  Class517.aClass517_7011, Class517.aClass517_6963,
		  Class517.aClass517_6267, Class517.aClass517_6741,
		  Class517.aClass517_6349, Class517.aClass517_5910,
		  Class517.aClass517_6431, Class517.aClass517_6364,
		  Class517.aClass517_6168, Class517.aClass517_6208,
		  Class517.aClass517_6853, Class517.aClass517_7014,
		  Class517.aClass517_6804, Class517.aClass517_6516,
		  Class517.aClass517_6126, Class517.aClass517_6855,
		  Class517.aClass517_6539, Class517.aClass517_6478,
		  Class517.aClass517_6309, Class517.aClass517_6102,
		  Class517.aClass517_6388, Class517.aClass517_5912,
		  Class517.aClass517_6687, Class517.aClass517_6233,
		  Class517.aClass517_6605, Class517.aClass517_6063,
		  Class517.aClass517_6598, Class517.aClass517_6481,
		  Class517.aClass517_6104, Class517.aClass517_6953,
		  Class517.aClass517_6406, Class517.aClass517_6004,
		  Class517.aClass517_6861, Class517.aClass517_6289,
		  Class517.aClass517_6818, Class517.aClass517_5915,
		  Class517.aClass517_6513, Class517.aClass517_6505,
		  Class517.aClass517_7039, Class517.aClass517_6434,
		  Class517.aClass517_7001, Class517.aClass517_7035,
		  Class517.aClass517_6239, Class517.aClass517_6439,
		  Class517.aClass517_6906, Class517.aClass517_6685,
		  Class517.aClass517_5884, Class517.aClass517_6675,
		  Class517.aClass517_6519, Class517.aClass517_6457,
		  Class517.aClass517_6815, Class517.aClass517_5914,
		  Class517.aClass517_6639, Class517.aClass517_5804,
		  Class517.aClass517_6421, Class517.aClass517_5800,
		  Class517.aClass517_5969, Class517.aClass517_6223,
		  Class517.aClass517_6473, Class517.aClass517_6752,
		  Class517.aClass517_6590, Class517.aClass517_6198,
		  Class517.aClass517_6097, Class517.aClass517_6962,
		  Class517.aClass517_6167, Class517.aClass517_6071,
		  Class517.aClass517_6830, Class517.aClass517_6487,
		  Class517.aClass517_6109, Class517.aClass517_6812,
		  Class517.aClass517_6427, Class517.aClass517_6036,
		  Class517.aClass517_6011, Class517.aClass517_5963,
		  Class517.aClass517_6072, Class517.aClass517_5947,
		  Class517.aClass517_6503, Class517.aClass517_6990,
		  Class517.aClass517_6996, Class517.aClass517_6242,
		  Class517.aClass517_5940, Class517.aClass517_6602,
		  Class517.aClass517_6149, Class517.aClass517_6475,
		  Class517.aClass517_6966, Class517.aClass517_6048,
		  Class517.aClass517_6893, Class517.aClass517_6724,
		  Class517.aClass517_6148, Class517.aClass517_6977,
		  Class517.aClass517_6769, Class517.aClass517_6308,
		  Class517.aClass517_5808, Class517.aClass517_6803,
		  Class517.aClass517_6999, Class517.aClass517_6902,
		  Class517.aClass517_5941, Class517.aClass517_6709,
		  Class517.aClass517_6319, Class517.aClass517_5871,
		  Class517.aClass517_7012, Class517.aClass517_6461,
		  Class517.aClass517_6455, Class517.aClass517_6405,
		  Class517.aClass517_6636, Class517.aClass517_5908,
		  Class517.aClass517_6819, Class517.aClass517_6618,
		  Class517.aClass517_6601, Class517.aClass517_6770,
		  Class517.aClass517_6708, Class517.aClass517_5830,
		  Class517.aClass517_6316, Class517.aClass517_5987,
		  Class517.aClass517_6937, Class517.aClass517_6732,
		  Class517.aClass517_6788, Class517.aClass517_5920,
		  Class517.aClass517_5931, Class517.aClass517_5831,
		  Class517.aClass517_5827, Class517.aClass517_6042,
		  Class517.aClass517_6871, Class517.aClass517_6780,
		  Class517.aClass517_6062, Class517.aClass517_5906,
		  Class517.aClass517_5872, Class517.aClass517_5917,
		  Class517.aClass517_6363, Class517.aClass517_6360,
		  Class517.aClass517_6187, Class517.aClass517_5809,
		  Class517.aClass517_6641, Class517.aClass517_6174,
		  Class517.aClass517_6151, Class517.aClass517_6330,
		  Class517.aClass517_6138, Class517.aClass517_6939,
		  Class517.aClass517_6010, Class517.aClass517_6358,
		  Class517.aClass517_6374, Class517.aClass517_6495,
		  Class517.aClass517_6849, Class517.aClass517_6699,
		  Class517.aClass517_6523, Class517.aClass517_6949,
		  Class517.aClass517_6944, Class517.aClass517_7045,
		  Class517.aClass517_6255, Class517.aClass517_5821,
		  Class517.aClass517_6337, Class517.aClass517_6851,
		  Class517.aClass517_6821, Class517.aClass517_6027,
		  Class517.aClass517_6897, Class517.aClass517_5928,
		  Class517.aClass517_5770, Class517.aClass517_6000,
		  Class517.aClass517_6548, Class517.aClass517_7028,
		  Class517.aClass517_6133, Class517.aClass517_6578,
		  Class517.aClass517_6454, Class517.aClass517_6107,
		  Class517.aClass517_6697, Class517.aClass517_5849,
		  Class517.aClass517_5977, Class517.aClass517_6356,
		  Class517.aClass517_6502, Class517.aClass517_5998,
		  Class517.aClass517_6079, Class517.aClass517_6159,
		  Class517.aClass517_6854, Class517.aClass517_6500,
		  Class517.aClass517_6948, Class517.aClass517_6314,
		  Class517.aClass517_7036, Class517.aClass517_6749,
		  Class517.aClass517_6896, Class517.aClass517_6698,
		  Class517.aClass517_6489, Class517.aClass517_6747,
		  Class517.aClass517_6718, Class517.aClass517_5949,
		  Class517.aClass517_6296, Class517.aClass517_6175,
		  Class517.aClass517_5892, Class517.aClass517_5944,
		  Class517.aClass517_6286, Class517.aClass517_6334,
		  Class517.aClass517_6951, Class517.aClass517_6782,
		  Class517.aClass517_5952, Class517.aClass517_6629,
		  Class517.aClass517_5996, Class517.aClass517_6291,
		  Class517.aClass517_6069, Class517.aClass517_5853,
		  Class517.aClass517_6387, Class517.aClass517_5995,
		  Class517.aClass517_6790, Class517.aClass517_5922,
		  Class517.aClass517_6033, Class517.aClass517_6465,
		  Class517.aClass517_6115, Class517.aClass517_6221,
		  Class517.aClass517_5775, Class517.aClass517_6205,
		  Class517.aClass517_6322, Class517.aClass517_6961,
		  Class517.aClass517_6988, Class517.aClass517_7044,
		  Class517.aClass517_6116, Class517.aClass517_6490,
		  Class517.aClass517_6957, Class517.aClass517_6763,
		  Class517.aClass517_6378, Class517.aClass517_5932,
		  Class517.aClass517_6231, Class517.aClass517_6336,
		  Class517.aClass517_6466, Class517.aClass517_5900,
		  Class517.aClass517_6835, Class517.aClass517_6785,
		  Class517.aClass517_6220, Class517.aClass517_6950,
		  Class517.aClass517_5776, Class517.aClass517_5845,
		  Class517.aClass517_5784, Class517.aClass517_6193,
		  Class517.aClass517_6742, Class517.aClass517_5780,
		  Class517.aClass517_6477, Class517.aClass517_6412,
		  Class517.aClass517_6052, Class517.aClass517_6795,
		  Class517.aClass517_6681, Class517.aClass517_6053,
		  Class517.aClass517_6194, Class517.aClass517_6377,
		  Class517.aClass517_6268, Class517.aClass517_6428,
		  Class517.aClass517_5916, Class517.aClass517_6204,
		  Class517.aClass517_6006, Class517.aClass517_6679,
		  Class517.aClass517_6432, Class517.aClass517_6436,
		  Class517.aClass517_6441, Class517.aClass517_6001,
		  Class517.aClass517_6899, Class517.aClass517_6067,
		  Class517.aClass517_6118, Class517.aClass517_6827,
		  Class517.aClass517_5956, Class517.aClass517_6672,
		  Class517.aClass517_6106, Class517.aClass517_6887,
		  Class517.aClass517_6533, Class517.aClass517_6248,
		  Class517.aClass517_6900, Class517.aClass517_6673,
		  Class517.aClass517_5980, Class517.aClass517_5795,
		  Class517.aClass517_6688, Class517.aClass517_5870,
		  Class517.aClass517_5785, Class517.aClass517_6936,
		  Class517.aClass517_5847, Class517.aClass517_5891,
		  Class517.aClass517_5960, Class517.aClass517_6886,
		  Class517.aClass517_5945, Class517.aClass517_6037,
		  Class517.aClass517_6270, Class517.aClass517_6594,
		  Class517.aClass517_6192, Class517.aClass517_6811,
		  Class517.aClass517_6088, Class517.aClass517_6429,
		  Class517.aClass517_6577, Class517.aClass517_6271,
		  Class517.aClass517_6087, Class517.aClass517_6840,
		  Class517.aClass517_5791, Class517.aClass517_5879,
		  Class517.aClass517_6625, Class517.aClass517_6845,
		  Class517.aClass517_6619, Class517.aClass517_6892,
		  Class517.aClass517_5859, Class517.aClass517_6860,
		  Class517.aClass517_6791, Class517.aClass517_5833,
		  Class517.aClass517_6098, Class517.aClass517_6376,
		  Class517.aClass517_6856, Class517.aClass517_6678,
		  Class517.aClass517_6622, Class517.aClass517_6920,
		  Class517.aClass517_6112, Class517.aClass517_6415,
		  Class517.aClass517_6942, Class517.aClass517_6217,
		  Class517.aClass517_6676, Class517.aClass517_6323,
		  Class517.aClass517_6026, Class517.aClass517_6472,
		  Class517.aClass517_5841, Class517.aClass517_6292,
		  Class517.aClass517_7051, Class517.aClass517_6940,
		  Class517.aClass517_6945, Class517.aClass517_6580,
		  Class517.aClass517_6140, Class517.aClass517_6586,
		  Class517.aClass517_5877, Class517.aClass517_6188,
		  Class517.aClass517_6515, Class517.aClass517_6837,
		  Class517.aClass517_6130, Class517.aClass517_6038,
		  Class517.aClass517_6385, Class517.aClass517_6717,
		  Class517.aClass517_6934, Class517.aClass517_5887,
		  Class517.aClass517_6825, Class517.aClass517_6885,
		  Class517.aClass517_5918, Class517.aClass517_6499,
		  Class517.aClass517_6510, Class517.aClass517_6918,
		  Class517.aClass517_6298, Class517.aClass517_6449,
		  Class517.aClass517_5758, Class517.aClass517_6720,
		  Class517.aClass517_6978, Class517.aClass517_6839,
		  Class517.aClass517_7042, Class517.aClass517_6974,
		  Class517.aClass517_6796, Class517.aClass517_5938,
		  Class517.aClass517_5774, Class517.aClass517_6701,
		  Class517.aClass517_6881, Class517.aClass517_6556,
		  Class517.aClass517_6366, Class517.aClass517_6189,
		  Class517.aClass517_6328, Class517.aClass517_6828,
		  Class517.aClass517_6280, Class517.aClass517_7041,
		  Class517.aClass517_5768, Class517.aClass517_6260,
		  Class517.aClass517_6444, Class517.aClass517_5979,
		  Class517.aClass517_6483, Class517.aClass517_6929,
		  Class517.aClass517_5846, Class517.aClass517_6992,
		  Class517.aClass517_6417, Class517.aClass517_6646,
		  Class517.aClass517_5851, Class517.aClass517_6367,
		  Class517.aClass517_6576, Class517.aClass517_7006,
		  Class517.aClass517_6938, Class517.aClass517_6693,
		  Class517.aClass517_6035, Class517.aClass517_6423,
		  Class517.aClass517_6511, Class517.aClass517_6730,
		  Class517.aClass517_6162, Class517.aClass517_6721,
		  Class517.aClass517_6400, Class517.aClass517_6638,
		  Class517.aClass517_6003, Class517.aClass517_5873,
		  Class517.aClass517_6083, Class517.aClass517_6789,
		  Class517.aClass517_6645, Class517.aClass517_6524,
		  Class517.aClass517_6802, Class517.aClass517_6399,
		  Class517.aClass517_6571, Class517.aClass517_6311,
		  Class517.aClass517_6111, Class517.aClass517_6409,
		  Class517.aClass517_5756, Class517.aClass517_6074,
		  Class517.aClass517_6008, Class517.aClass517_6199,
		  Class517.aClass517_6312, Class517.aClass517_7007,
		  Class517.aClass517_6536, Class517.aClass517_6588,
		  Class517.aClass517_6744, Class517.aClass517_5888,
		  Class517.aClass517_6353, Class517.aClass517_6327,
		  Class517.aClass517_6607, Class517.aClass517_6743,
		  Class517.aClass517_6331, Class517.aClass517_6084,
		  Class517.aClass517_6543, Class517.aClass517_6460,
		  Class517.aClass517_6753, Class517.aClass517_6567,
		  Class517.aClass517_5927, Class517.aClass517_6874,
		  Class517.aClass517_6333, Class517.aClass517_6009,
		  Class517.aClass517_6994, Class517.aClass517_5967,
		  Class517.aClass517_6476, Class517.aClass517_5984,
		  Class517.aClass517_5778, Class517.aClass517_6973,
		  Class517.aClass517_5818, Class517.aClass517_6210,
		  Class517.aClass517_6923, Class517.aClass517_6776,
		  Class517.aClass517_6021, Class517.aClass517_6922,
		  Class517.aClass517_6987, Class517.aClass517_6060,
		  Class517.aClass517_6046, Class517.aClass517_6269,
		  Class517.aClass517_5929, Class517.aClass517_6474,
		  Class517.aClass517_6561, Class517.aClass517_6482,
		  Class517.aClass517_6234, Class517.aClass517_6127,
		  Class517.aClass517_6867, Class517.aClass517_6554,
		  Class517.aClass517_6889, Class517.aClass517_6446,
		  Class517.aClass517_5962, Class517.aClass517_6943,
		  Class517.aClass517_6451, Class517.aClass517_6528,
		  Class517.aClass517_6379, Class517.aClass517_6530,
		  Class517.aClass517_6714, Class517.aClass517_6342,
		  Class517.aClass517_6927, Class517.aClass517_6227,
		  Class517.aClass517_6783, Class517.aClass517_5854,
		  Class517.aClass517_6108, Class517.aClass517_6190,
		  Class517.aClass517_6152, Class517.aClass517_6028,
		  Class517.aClass517_6637, Class517.aClass517_6293,
		  Class517.aClass517_6086, Class517.aClass517_6904,
		  Class517.aClass517_6965, Class517.aClass517_5767,
		  Class517.aClass517_6219, Class517.aClass517_6056,
		  Class517.aClass517_6954, Class517.aClass517_5755,
		  Class517.aClass517_6398, Class517.aClass517_5905,
		  Class517.aClass517_6786, Class517.aClass517_6498,
		  Class517.aClass517_6430, Class517.aClass517_6013,
		  Class517.aClass517_6347, Class517.aClass517_5939,
		  Class517.aClass517_6573, Class517.aClass517_5986,
		  Class517.aClass517_6433, Class517.aClass517_6435,
		  Class517.aClass517_5812, Class517.aClass517_5828,
		  Class517.aClass517_6684, Class517.aClass517_6891,
		  Class517.aClass517_6301, Class517.aClass517_5763,
		  Class517.aClass517_6914, Class517.aClass517_6078,
		  Class517.aClass517_6746, Class517.aClass517_6288,
		  Class517.aClass517_7040, Class517.aClass517_5919,
		  Class517.aClass517_6890, Class517.aClass517_6983,
		  Class517.aClass517_5936, Class517.aClass517_6613,
		  Class517.aClass517_6771, Class517.aClass517_5760,
		  Class517.aClass517_5792, Class517.aClass517_6805,
		  Class517.aClass517_5813, Class517.aClass517_6550,
		  Class517.aClass517_6381, Class517.aClass517_6956,
		  Class517.aClass517_6520, Class517.aClass517_6873,
		  Class517.aClass517_6202, Class517.aClass517_6040,
		  Class517.aClass517_5970, Class517.aClass517_6110,
		  Class517.aClass517_6545, Class517.aClass517_5882,
		  Class517.aClass517_6518, Class517.aClass517_6395,
		  Class517.aClass517_6179, Class517.aClass517_6526,
		  Class517.aClass517_5881, Class517.aClass517_6869,
		  Class517.aClass517_6236, Class517.aClass517_5823,
		  Class517.aClass517_6324, Class517.aClass517_6470,
		  Class517.aClass517_5783, Class517.aClass517_6486,
		  Class517.aClass517_6700, Class517.aClass517_5788,
		  Class517.aClass517_6624, Class517.aClass517_5862,
		  Class517.aClass517_6599, Class517.aClass517_5867,
		  Class517.aClass517_6043, Class517.aClass517_6735,
		  Class517.aClass517_5953, Class517.aClass517_6354,
		  Class517.aClass517_5817, Class517.aClass517_6668,
		  Class517.aClass517_6670, Class517.aClass517_6147,
		  Class517.aClass517_6462, Class517.aClass517_6608,
		  Class517.aClass517_6589, Class517.aClass517_6350,
		  Class517.aClass517_6373, Class517.aClass517_7026,
		  Class517.aClass517_6541, Class517.aClass517_6657,
		  Class517.aClass517_6375, Class517.aClass517_6905,
		  Class517.aClass517_5894, Class517.aClass517_5993,
		  Class517.aClass517_6382, Class517.aClass517_6762,
		  Class517.aClass517_6649, Class517.aClass517_6397,
		  Class517.aClass517_6982, Class517.aClass517_6484,
		  Class517.aClass517_5921, Class517.aClass517_6332,
		  Class517.aClass517_6734, Class517.aClass517_6544,
		  Class517.aClass517_6014, Class517.aClass517_6704,
		  Class517.aClass517_6165, Class517.aClass517_5824,
		  Class517.aClass517_6092, Class517.aClass517_6621,
		  Class517.aClass517_6847, Class517.aClass517_6797,
		  Class517.aClass517_6100, Class517.aClass517_6880,
		  Class517.aClass517_5974, Class517.aClass517_6784,
		  Class517.aClass517_6575, Class517.aClass517_5999,
		  Class517.aClass517_6898, Class517.aClass517_6731,
		  Class517.aClass517_6307, Class517.aClass517_5798,
		  Class517.aClass517_6952, Class517.aClass517_6281,
		  Class517.aClass517_6864, Class517.aClass517_7037,
		  Class517.aClass517_5832, Class517.aClass517_6716,
		  Class517.aClass517_6616, Class517.aClass517_6279,
		  Class517.aClass517_6976, Class517.aClass517_6509,
		  Class517.aClass517_6338, Class517.aClass517_6029,
		  Class517.aClass517_6114, Class517.aClass517_6538,
		  Class517.aClass517_5787, Class517.aClass517_6705,
		  Class517.aClass517_5959, Class517.aClass517_7056,
		  Class517.aClass517_6631, Class517.aClass517_6128,
		  Class517.aClass517_6310, Class517.aClass517_6440,
		  Class517.aClass517_6650, Class517.aClass517_5757,
		  Class517.aClass517_6002, Class517.aClass517_6137,
		  Class517.aClass517_6030, Class517.aClass517_6832,
		  Class517.aClass517_7029, Class517.aClass517_6012,
		  Class517.aClass517_6798, Class517.aClass517_6584,
		  Class517.aClass517_6414, Class517.aClass517_6209,
		  Class517.aClass517_6917, Class517.aClass517_6658,
		  Class517.aClass517_6574, Class517.aClass517_6501,
		  Class517.aClass517_6081, Class517.aClass517_6082,
		  Class517.aClass517_6715, Class517.aClass517_6166,
		  Class517.aClass517_7008, Class517.aClass517_5822,
		  Class517.aClass517_6736, Class517.aClass517_6321,
		  Class517.aClass517_6907, Class517.aClass517_6706,
		  Class517.aClass517_6865, Class517.aClass517_7009,
		  Class517.aClass517_6200, Class517.aClass517_6024,
		  Class517.aClass517_6390, Class517.aClass517_6131,
		  Class517.aClass517_6141, Class517.aClass517_6713,
		  Class517.aClass517_6094, Class517.aClass517_6508,
		  Class517.aClass517_5793, Class517.aClass517_5954,
		  Class517.aClass517_6456, Class517.aClass517_6404,
		  Class517.aClass517_6760, Class517.aClass517_6464,
		  Class517.aClass517_6182, Class517.aClass517_6380,
		  Class517.aClass517_6285, Class517.aClass517_6593,
		  Class517.aClass517_6068, Class517.aClass517_5982,
		  Class517.aClass517_6971, Class517.aClass517_6055,
		  Class517.aClass517_5794, Class517.aClass517_6235,
		  Class517.aClass517_5983, Class517.aClass517_6751,
		  Class517.aClass517_6066, Class517.aClass517_5842,
		  Class517.aClass517_6947, Class517.aClass517_5838,
		  Class517.aClass517_6596, Class517.aClass517_6228,
		  Class517.aClass517_6623, Class517.aClass517_6972,
		  Class517.aClass517_5848, Class517.aClass517_6146,
		  Class517.aClass517_6294, Class517.aClass517_5913,
		  Class517.aClass517_6230, Class517.aClass517_6765,
		  Class517.aClass517_6808, Class517.aClass517_5769,
		  Class517.aClass517_6359, Class517.aClass517_5764,
		  Class517.aClass517_6113, Class517.aClass517_7043,
		  Class517.aClass517_6879, Class517.aClass517_6273,
		  Class517.aClass517_5911, Class517.aClass517_6318,
		  Class517.aClass517_5811, Class517.aClass517_6170,
		  Class517.aClass517_6654, Class517.aClass517_6117,
		  Class517.aClass517_7024, Class517.aClass517_6824,
		  Class517.aClass517_6229, Class517.aClass517_5964,
		  Class517.aClass517_6998, Class517.aClass517_6207,
		  Class517.aClass517_7032, Class517.aClass517_6156,
		  Class517.aClass517_6739, Class517.aClass517_6245,
		  Class517.aClass517_7004, Class517.aClass517_6597,
		  Class517.aClass517_6122, Class517.aClass517_6728,
		  Class517.aClass517_6652, Class517.aClass517_6759,
		  Class517.aClass517_6039, Class517.aClass517_6018,
		  Class517.aClass517_5972, Class517.aClass517_6136,
		  Class517.aClass517_6410, Class517.aClass517_5874,
		  Class517.aClass517_6299, Class517.aClass517_6150,
		  Class517.aClass517_6772, Class517.aClass517_7021,
		  Class517.aClass517_6968, Class517.aClass517_6017,
		  Class517.aClass517_6850, Class517.aClass517_6250,
		  Class517.aClass517_7010, Class517.aClass517_7027,
		  Class517.aClass517_6866, Class517.aClass517_6773,
		  Class517.aClass517_6468, Class517.aClass517_7022,
		  Class517.aClass517_6178, Class517.aClass517_6766,
		  Class517.aClass517_6521, Class517.aClass517_6262,
		  Class517.aClass517_6123, Class517.aClass517_6817,
		  Class517.aClass517_6836, Class517.aClass517_6203,
		  Class517.aClass517_6007, Class517.aClass517_5777,
		  Class517.aClass517_6019, Class517.aClass517_7025,
		  Class517.aClass517_5855, Class517.aClass517_6158,
		  Class517.aClass517_5991, Class517.aClass517_6662,
		  Class517.aClass517_6912, Class517.aClass517_6418,
		  Class517.aClass517_5866, Class517.aClass517_6620,
		  Class517.aClass517_6877, Class517.aClass517_6357,
		  Class517.aClass517_7052, Class517.aClass517_6738,
		  Class517.aClass517_6546, Class517.aClass517_6408,
		  Class517.aClass517_7016, Class517.aClass517_6226,
		  Class517.aClass517_5771, Class517.aClass517_5782,
		  Class517.aClass517_6362, Class517.aClass517_6185,
		  Class517.aClass517_6551, Class517.aClass517_6737,
		  Class517.aClass517_6843, Class517.aClass517_6139,
		  Class517.aClass517_6265, Class517.aClass517_6120,
		  Class517.aClass517_6254, Class517.aClass517_5816,
		  Class517.aClass517_6389, Class517.aClass517_5799,
		  Class517.aClass517_6842, Class517.aClass517_6416,
		  Class517.aClass517_5835, Class517.aClass517_6096,
		  Class517.aClass517_6224, Class517.aClass517_6846,
		  Class517.aClass517_5863, Class517.aClass517_6448,
		  Class517.aClass517_6748, Class517.aClass517_5796,
		  Class517.aClass517_6609, Class517.aClass517_6537,
		  Class517.aClass517_6903, Class517.aClass517_5958,
		  Class517.aClass517_7046, Class517.aClass517_6555,
		  Class517.aClass517_6394, Class517.aClass517_6103,
		  Class517.aClass517_6634, Class517.aClass517_5897,
		  Class517.aClass517_5976, Class517.aClass517_5975,
		  Class517.aClass517_5946, Class517.aClass517_5807,
		  Class517.aClass517_6711, Class517.aClass517_5766,
		  Class517.aClass517_6249, Class517.aClass517_5909,
		  Class517.aClass517_6540, Class517.aClass517_6585,
		  Class517.aClass517_6928, Class517.aClass517_6005,
		  Class517.aClass517_6671, Class517.aClass517_6568,
		  Class517.aClass517_5786, Class517.aClass517_6278,
		  Class517.aClass517_6838, Class517.aClass517_6775,
		  Class517.aClass517_5840, Class517.aClass517_6257,
		  Class517.aClass517_6633, Class517.aClass517_6876,
		  Class517.aClass517_6302, Class517.aClass517_6215,
		  Class517.aClass517_6080, Class517.aClass517_6287,
		  Class517.aClass517_5907, Class517.aClass517_6985,
		  Class517.aClass517_6761, Class517.aClass517_5973,
		  Class517.aClass517_6553, Class517.aClass517_6214,
		  Class517.aClass517_6491, Class517.aClass517_6916,
		  Class517.aClass517_6955, Class517.aClass517_5899,
		  Class517.aClass517_7047, Class517.aClass517_6674,
		  Class517.aClass517_6144, Class517.aClass517_5935,
		  Class517.aClass517_6304, Class517.aClass517_6241,
		  Class517.aClass517_5966, Class517.aClass517_6090,
		  Class517.aClass517_6559, Class517.aClass517_6719,
		  Class517.aClass517_6393, Class517.aClass517_6777,
		  Class517.aClass517_6980, Class517.aClass517_6458,
		  Class517.aClass517_5834, Class517.aClass517_6329,
		  Class517.aClass517_6176, Class517.aClass517_6525,
		  Class517.aClass517_6064, Class517.aClass517_6155,
		  Class517.aClass517_6216, Class517.aClass517_6022,
		  Class517.aClass517_5868, Class517.aClass517_6635,
		  Class517.aClass517_5820, Class517.aClass517_5843,
		  Class517.aClass517_6445, Class517.aClass517_6339,
		  Class517.aClass517_6768, Class517.aClass517_6833,
		  Class517.aClass517_6604, Class517.aClass517_6303,
		  Class517.aClass517_6493, Class517.aClass517_5924,
		  Class517.aClass517_6910, Class517.aClass517_6919,
		  Class517.aClass517_6781, Class517.aClass517_6660,
		  Class517.aClass517_6352, Class517.aClass517_6015,
		  Class517.aClass517_5825, Class517.aClass517_6025,
		  Class517.aClass517_6547, Class517.aClass517_6993,
		  Class517.aClass517_6799, Class517.aClass517_6419,
		  Class517.aClass517_6206, Class517.aClass517_7038,
		  Class517.aClass517_6612, Class517.aClass517_6792,
		  Class517.aClass517_6191, Class517.aClass517_6177,
		  Class517.aClass517_6933, Class517.aClass517_6531,
		  Class517.aClass517_6722, Class517.aClass517_5803,
		  Class517.aClass517_6778, Class517.aClass517_6883,
		  Class517.aClass517_6325, Class517.aClass517_6941,
		  Class517.aClass517_6212, Class517.aClass517_6172,
		  Class517.aClass517_6284, Class517.aClass517_6834,
		  Class517.aClass517_5836, Class517.aClass517_6514,
		  Class517.aClass517_6740, Class517.aClass517_6683,
		  Class517.aClass517_6197, Class517.aClass517_6392,
		  Class517.aClass517_6774, Class517.aClass517_6401,
		  Class517.aClass517_6258, Class517.aClass517_5852,
		  Class517.aClass517_6868, Class517.aClass517_6653,
		  Class517.aClass517_6822, Class517.aClass517_6870,
		  Class517.aClass517_6504, Class517.aClass517_6970,
		  Class517.aClass517_6041, Class517.aClass517_6247,
		  Class517.aClass517_6344, Class517.aClass517_5806,
		  Class517.aClass517_6143, Class517.aClass517_6089,
		  Class517.aClass517_6413, Class517.aClass517_6757,
		  Class517.aClass517_6647, Class517.aClass517_5878,
		  Class517.aClass517_6661, Class517.aClass517_7055,
		  Class517.aClass517_5802, Class517.aClass517_6628,
		  Class517.aClass517_5903, Class517.aClass517_6677,
		  Class517.aClass517_6691, Class517.aClass517_5934,
		  Class517.aClass517_6259, Class517.aClass517_5860,
		  Class517.aClass517_6583, Class517.aClass517_5810,
		  Class517.aClass517_6317, Class517.aClass517_6426,
		  Class517.aClass517_6603, Class517.aClass517_6884,
		  Class517.aClass517_5997, Class517.aClass517_6703,
		  Class517.aClass517_5933, Class517.aClass517_7048,
		  Class517.aClass517_6225, Class517.aClass517_5896,
		  Class517.aClass517_6911, Class517.aClass517_6600,
		  Class517.aClass517_6238, Class517.aClass517_6420,
		  Class517.aClass517_5890, Class517.aClass517_6630,
		  Class517.aClass517_5850, Class517.aClass517_6535,
		  Class517.aClass517_6173, Class517.aClass517_6932,
		  Class517.aClass517_6659, Class517.aClass517_6882,
		  Class517.aClass517_6485, Class517.aClass517_7017,
		  Class517.aClass517_5923, Class517.aClass517_6611,
		  Class517.aClass517_6745, Class517.aClass517_5869,
		  Class517.aClass517_6391, Class517.aClass517_7005,
		  Class517.aClass517_5985, Class517.aClass517_6306,
		  Class517.aClass517_6733, Class517.aClass517_6800,
		  Class517.aClass517_6727, Class517.aClass517_6297,
		  Class517.aClass517_6975, Class517.aClass517_5901,
		  Class517.aClass517_6054, Class517.aClass517_6723,
		  Class517.aClass517_6981, Class517.aClass517_6532,
		  Class517.aClass517_6863, Class517.aClass517_6820,
		  Class517.aClass517_6764, Class517.aClass517_6044,
		  Class517.aClass517_6145, Class517.aClass517_6253,
		  Class517.aClass517_6665, Class517.aClass517_6059,
		  Class517.aClass517_6438, Class517.aClass517_6343,
		  Class517.aClass517_6348, Class517.aClass517_6201,
		  Class517.aClass517_5968, Class517.aClass517_6794,
		  Class517.aClass517_5865, Class517.aClass517_6517,
		  Class517.aClass517_6058, Class517.aClass517_6471,
		  Class517.aClass517_5965, Class517.aClass517_6469,
		  Class517.aClass517_6479, Class517.aClass517_6506,
		  Class517.aClass517_5948, Class517.aClass517_6023,
		  Class517.aClass517_6610, Class517.aClass517_6276,
		  Class517.aClass517_6452, Class517.aClass517_7019,
		  Class517.aClass517_6829, Class517.aClass517_6967,
		  Class517.aClass517_5801, Class517.aClass517_7031,
		  Class517.aClass517_6232, Class517.aClass517_7034,
		  Class517.aClass517_6031, Class517.aClass517_6195,
		  Class517.aClass517_6213, Class517.aClass517_6488,
		  Class517.aClass517_6848, Class517.aClass517_7018,
		  Class517.aClass517_6282, Class517.aClass517_6926,
		  Class517.aClass517_6702, Class517.aClass517_6552,
		  Class517.aClass517_6756, Class517.aClass517_6355,
		  Class517.aClass517_6370, Class517.aClass517_6814,
		  Class517.aClass517_6793, Class517.aClass517_6564,
		  Class517.aClass517_6651, Class517.aClass517_6979,
		  Class517.aClass517_5885, Class517.aClass517_6664,
		  Class517.aClass517_6984, Class517.aClass517_6057,
		  Class517.aClass517_5839, Class517.aClass517_6862,
		  Class517.aClass517_6754, Class517.aClass517_6341,
		  Class517.aClass517_6494, Class517.aClass517_6424,
		  Class517.aClass517_6049, Class517.aClass517_6244,
		  Class517.aClass517_6361, Class517.aClass517_6696,
		  Class517.aClass517_6813, Class517.aClass517_5988,
		  Class517.aClass517_6076, Class517.aClass517_6045,
		  Class517.aClass517_6263, Class517.aClass517_6181,
		  Class517.aClass517_7002, Class517.aClass517_6345,
		  Class517.aClass517_6315, Class517.aClass517_6924,
		  Class517.aClass517_5861, Class517.aClass517_6261,
		  Class517.aClass517_6196, Class517.aClass517_5762,
		  Class517.aClass517_5819, Class517.aClass517_6729,
		  Class517.aClass517_6184, Class517.aClass517_5957,
		  Class517.aClass517_6787, Class517.aClass517_6153,
		  Class517.aClass517_6016, Class517.aClass517_6077,
		  Class517.aClass517_6643, Class517.aClass517_6801,
		  Class517.aClass517_6986, Class517.aClass517_6692,
		  Class517.aClass517_6888, Class517.aClass517_6335,
		  Class517.aClass517_6277, Class517.aClass517_7053,
		  Class517.aClass517_6157, Class517.aClass517_6614,
		  Class517.aClass517_6129, Class517.aClass517_5990,
		  Class517.aClass517_6218, Class517.aClass517_6809,
		  Class517.aClass517_7000, Class517.aClass517_6844,
		  Class517.aClass517_6627, Class517.aClass517_6587,
		  Class517.aClass517_6823, Class517.aClass517_7054,
		  Class517.aClass517_6134, Class517.aClass517_6480,
		  Class517.aClass517_7015, Class517.aClass517_6935,
		  Class517.aClass517_6563, Class517.aClass517_6725,
		  Class517.aClass517_6995, Class517.aClass517_6085,
		  Class517.aClass517_5790, Class517.aClass517_6712,
		  Class517.aClass517_6251, Class517.aClass517_6779,
		  Class517.aClass517_6300, Class517.aClass517_5826,
		  Class517.aClass517_6895, Class517.aClass517_5886,
		  Class517.aClass517_6459, Class517.aClass517_6669,
		  Class517.aClass517_6666, Class517.aClass517_6463,
		  Class517.aClass517_6695, Class517.aClass517_6340,
		  Class517.aClass517_5950, Class517.aClass517_6383,
		  Class517.aClass517_6549, Class517.aClass517_5971,
		  Class517.aClass517_6371, Class517.aClass517_5926,
		  Class517.aClass517_5951, Class517.aClass517_6154,
		  Class517.aClass517_6512, Class517.aClass517_6065,
		  Class517.aClass517_6930, Class517.aClass517_6969,
		  Class517.aClass517_6240, Class517.aClass517_6211,
		  Class517.aClass517_6075, Class517.aClass517_5930,
		  Class517.aClass517_6831, Class517.aClass517_6099,
		  Class517.aClass517_6396, Class517.aClass517_5943,
		  Class517.aClass517_5898, Class517.aClass517_6020,
		  Class517.aClass517_6272, Class517.aClass517_6135,
		  Class517.aClass517_6595, Class517.aClass517_6640,
		  Class517.aClass517_6964, Class517.aClass517_5925,
		  Class517.aClass517_6558, Class517.aClass517_6682,
		  Class517.aClass517_6275, Class517.aClass517_6125,
		  Class517.aClass517_6931, Class517.aClass517_5772,
		  Class517.aClass517_5994, Class517.aClass517_5815,
		  Class517.aClass517_6497, Class517.aClass517_5789,
		  Class517.aClass517_6686, Class517.aClass517_6492,
		  Class517.aClass517_6437, Class517.aClass517_6237,
		  Class517.aClass517_6266, Class517.aClass517_6529,
		  Class517.aClass517_6606, Class517.aClass517_5889,
		  Class517.aClass517_5955, Class517.aClass517_6592,
		  Class517.aClass517_6403, Class517.aClass517_6648,
		  Class517.aClass517_6171, Class517.aClass517_6453,
		  Class517.aClass517_6169, Class517.aClass517_6256,
		  Class517.aClass517_6368, Class517.aClass517_5844 });
    }
    
    public static void method2659(int i) {
	if (9 == client.anInt11075 * 1777895575) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4341,
				    client.aClass96_11361.aClass6_1169,
				    1977859884);
	    client.aClass96_11361.method1794(class525_sub15, (short) 26131);
	    Class25.aClass690_243 = Class690.aClass690_8742;
	    Class587.aString7773 = null;
	}
    }
}
