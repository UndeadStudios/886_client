/* Class161_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class161_Sub2 extends Class161
{
    float aFloat9508;
    static final int anInt9509 = -1694498816;
    float aFloat9510;
    static final int anInt9511 = 2;
    static final int anInt9512 = 4;
    Class182_Sub2 aClass182_Sub2_9513;
    int anInt9514;
    Class129[][] aClass129ArrayArray9515;
    static final int anInt9516 = 64;
    Class123[][] aClass123ArrayArray9517;
    float aFloat9518;
    Class134[][] aClass134ArrayArray9519;
    float aFloat9520;
    float aFloat9521;
    float aFloat9522;
    float aFloat9523;
    Class127[][] aClass127ArrayArray9524;
    byte[][] aByteArrayArray9525;
    float aFloat9526;
    float aFloat9527;
    float aFloat9528;
    float aFloat9529;
    float aFloat9530;
    float aFloat9531;
    float aFloat9532;
    static final int anInt9533 = 1;
    float aFloat9534;
    Class114[][] aClass114ArrayArray9535;
    byte[][] aByteArrayArray9536;
    float aFloat9537;
    static final boolean aBool9538 = true;
    static final boolean aBool9539 = true;
    static final boolean aBool9540 = false;
    
    static int method15241(int i, int i_0_) {
	int i_1_ = (i & 0xff0000) * i_0_ >> 23;
	if (i_1_ < 2)
	    i_1_ = 2;
	else if (i_1_ > 253)
	    i_1_ = 253;
	int i_2_ = (i & 0xff00) * i_0_ >> 15;
	if (i_2_ < 2)
	    i_2_ = 2;
	else if (i_2_ > 253)
	    i_2_ = 253;
	int i_3_ = (i & 0xff) * i_0_ >> 7;
	if (i_3_ < 2)
	    i_3_ = 2;
	else if (i_3_ > 253)
	    i_3_ = 253;
	return i_1_ << 16 | i_2_ << 8 | i_3_;
    }
    
    public void method2599(int i, int i_4_, int i_5_, int i_6_, int i_7_,
			   int i_8_, int i_9_, boolean[][] bools) {
	Class110 class110
	    = aClass182_Sub2_9513.method15223(Thread.currentThread());
	Class128 class128 = class110.aClass128_1338;
	class128.anInt1486 = 0;
	class128.aBool1485 = true;
	aClass182_Sub2_9513.method15172();
	if (aClass123ArrayArray9517 != null || aClass134ArrayArray9519 != null)
	    method15267(i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, bools, class110,
			class128, class110.aFloatArray1364,
			class110.aFloatArray1365);
	else if (aClass129ArrayArray9515 != null)
	    method15245(i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, bools, class110,
			class128, class110.aFloatArray1364,
			class110.aFloatArray1365);
    }
    
    public void method2590
	(int i, int i_10_, int[] is, int[] is_11_, int[] is_12_, int[] is_13_,
	 int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_,
	 int[] is_19_, int[] is_20_, Class176 class176, boolean bool) {
	if (aClass129ArrayArray9515 == null) {
	    aClass129ArrayArray9515
		= new Class129[anInt1759 * 363736815][anInt1760 * -1152334393];
	    aClass114ArrayArray9535
		= new Class114[anInt1759 * 363736815][anInt1760 * -1152334393];
	} else if (aClass123ArrayArray9517 != null
		   || aClass134ArrayArray9519 != null)
	    throw new IllegalStateException();
	boolean bool_21_ = false;
	if (is_17_.length == 2 && is_14_.length == 2
	    && (is_17_[0] == is_17_[1]
		|| is_19_[0] != -1 && is_19_[0] == is_19_[1])) {
	    bool_21_ = true;
	    for (int i_22_ = 1; i_22_ < 2; i_22_++) {
		int i_23_ = is[is_14_[i_22_]];
		int i_24_ = is_12_[is_14_[i_22_]];
		if (i_23_ != 0 && i_23_ != anInt1761 * 435863595
		    || i_24_ != 0 && i_24_ != anInt1761 * 435863595) {
		    bool_21_ = false;
		    break;
		}
	    }
	}
	if (!bool_21_) {
	    Class114 class114 = new Class114();
	    short i_25_ = (short) is.length;
	    int i_26_ = (short) is_17_.length;
	    class114.aShort1393 = i_25_;
	    class114.aShortArray1403 = new short[i_25_];
	    class114.aShortArray1395 = new short[i_25_];
	    class114.aShortArray1397 = new short[i_25_];
	    class114.aShortArray1398 = new short[i_25_];
	    for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
		int i_28_ = is[i_27_];
		int i_29_ = is_12_[i_27_];
		if (i_28_ == 0 && i_29_ == 0)
		    class114.aShortArray1403[i_27_]
			= (short) (aByteArrayArray9536[i][i_10_]
				   - aByteArrayArray9525[i][i_10_]);
		else if (i_28_ == 0 && i_29_ == anInt1761 * 435863595)
		    class114.aShortArray1403[i_27_]
			= (short) (aByteArrayArray9536[i][i_10_ + 1]
				   - aByteArrayArray9525[i][i_10_ + 1]);
		else if (i_28_ == anInt1761 * 435863595
			 && i_29_ == anInt1761 * 435863595)
		    class114.aShortArray1403[i_27_]
			= (short) (aByteArrayArray9536[i + 1][i_10_ + 1]
				   - aByteArrayArray9525[i + 1][i_10_ + 1]);
		else if (i_28_ == anInt1761 * 435863595 && i_29_ == 0)
		    class114.aShortArray1403[i_27_]
			= (short) (aByteArrayArray9536[i + 1][i_10_]
				   - aByteArrayArray9525[i + 1][i_10_]);
		else {
		    int i_30_
			= (((aByteArrayArray9536[i][i_10_]
			     - aByteArrayArray9525[i][i_10_])
			    * (anInt1761 * 435863595 - i_28_))
			   + (aByteArrayArray9536[i + 1][i_10_]
			      - aByteArrayArray9525[i + 1][i_10_]) * i_28_);
		    int i_31_ = (((aByteArrayArray9536[i][i_10_ + 1]
				   - aByteArrayArray9525[i][i_10_ + 1])
				  * (anInt1761 * 435863595 - i_28_))
				 + ((aByteArrayArray9536[i + 1][i_10_ + 1]
				     - aByteArrayArray9525[i + 1][i_10_ + 1])
				    * i_28_));
		    class114.aShortArray1403[i_27_]
			= (short) ((i_30_ * (anInt1761 * 435863595 - i_29_)
				    + i_31_ * i_29_)
				   >> anInt1763 * 168112006);
		}
		int i_32_ = (i << anInt1763 * -2063427645) + i_28_;
		int i_33_ = (i_10_ << anInt1763 * -2063427645) + i_29_;
		class114.aShortArray1395[i_27_] = (short) i_28_;
		class114.aShortArray1398[i_27_] = (short) i_29_;
		class114.aShortArray1397[i_27_]
		    = (short) (method2619(i_32_, i_33_, -569988375)
			       + (is_11_ != null ? is_11_[i_27_] : 0));
		if (class114.aShortArray1403[i_27_] < 2)
		    class114.aShortArray1403[i_27_] = (short) 2;
	    }
	    boolean bool_34_ = false;
	    int i_35_ = 0;
	    for (int i_36_ = 0; i_36_ < i_26_; i_36_++) {
		if (is_17_[i_36_] >= 0 || is_18_ != null && is_18_[i_36_] >= 0)
		    i_35_++;
		int i_37_ = is_19_[i_36_];
		if (i_37_ != -1) {
		    TextureMetrics class166 = aClass182_Sub2_9513.aClass180_1944
					    .method3116(i_37_, -1431554601);
		    if (!class166.aBool1819) {
			bool_34_ = true;
			if (method15244(class166.aByte1825)
			    || class166.aByte1805 != 0
			    || class166.aByte1806 != 0)
			    class114.aByte1394 |= 0x4;
		    }
		}
	    }
	    class114.anIntArray1392 = new int[i_35_];
	    if (is_18_ != null)
		class114.anIntArray1405 = new int[i_35_];
	    class114.aShortArray1399 = new short[i_35_];
	    class114.aShortArray1400 = new short[i_35_];
	    class114.aShortArray1401 = new short[i_35_];
	    if (bool_34_) {
		class114.aShortArray1402 = new short[i_35_];
		class114.aShortArray1404 = new short[i_35_];
	    }
	    for (int i_38_ = 0; i_38_ < i_26_; i_38_++) {
		if (is_17_[i_38_] >= 0
		    || is_18_ != null && is_18_[i_38_] >= 0) {
		    if (is_17_[i_38_] >= 0)
			class114.anIntArray1392[class114.aShort1396]
			    = Class504.method8313(is_17_[i_38_], 1684546227);
		    else
			class114.anIntArray1392[class114.aShort1396] = -1;
		    if (is_18_ != null) {
			if (is_18_[i_38_] != -1)
			    class114.anIntArray1405[class114.aShort1396]
				= Class504.method8313(is_18_[i_38_],
						      720856189);
			else
			    class114.anIntArray1405[class114.aShort1396] = -1;
		    }
		    class114.aShortArray1399[class114.aShort1396]
			= (short) is_14_[i_38_];
		    class114.aShortArray1400[class114.aShort1396]
			= (short) is_15_[i_38_];
		    class114.aShortArray1401[class114.aShort1396]
			= (short) is_16_[i_38_];
		    if (bool_34_) {
			if (is_19_[i_38_] != -1
			    && !(aClass182_Sub2_9513.aClass180_1944.method3116
				 (is_19_[i_38_], -1431554601).aBool1819)) {
			    class114.aShortArray1402[class114.aShort1396]
				= (short) is_19_[i_38_];
			    class114.aShortArray1404[class114.aShort1396]
				= (short) is_20_[i_38_];
			} else
			    class114.aShortArray1402[class114.aShort1396]
				= (short) -1;
		    }
		    class114.aShort1396++;
		}
	    }
	    aClass114ArrayArray9535[i][i_10_] = class114;
	} else if (is_17_[0] >= 0 || is_18_ != null && is_18_[0] >= 0) {
	    Class129 class129 = new Class129();
	    int i_39_ = is_17_[0];
	    int i_40_ = is_19_[0];
	    if (is_18_ != null) {
		class129.anInt1520
		    = Class159.method2568(Class504.method8313(is_18_[0],
							      1829983393),
					  (aByteArrayArray9536[i][i_10_]
					   - aByteArrayArray9525[i][i_10_]),
					  -208077376);
		if (i_39_ == -1)
		    class129.aByte1524 |= 0x2;
	    }
	    if ((anIntArrayArray1762[i][i_10_]
		 == anIntArrayArray1762[i + 1][i_10_])
		&& (anIntArrayArray1762[i][i_10_]
		    == anIntArrayArray1762[i + 1][i_10_ + 1])
		&& (anIntArrayArray1762[i][i_10_]
		    == anIntArrayArray1762[i][i_10_ + 1]))
		class129.aByte1524 |= 0x1;
	    TextureMetrics class166 = null;
	    if (i_40_ != -1)
		class166 = aClass182_Sub2_9513.aClass180_1944
			       .method3116(i_40_, -1431554601);
	    if (class166 != null && (class129.aByte1524 & 0x2) == 0
		&& !class166.aBool1819) {
		class129.aShort1521
		    = (short) (aByteArrayArray9536[i][i_10_]
			       - aByteArrayArray9525[i][i_10_]);
		class129.aShort1522
		    = (short) (aByteArrayArray9536[i + 1][i_10_]
			       - aByteArrayArray9525[i + 1][i_10_]);
		class129.aShort1525
		    = (short) (aByteArrayArray9536[i + 1][i_10_ + 1]
			       - aByteArrayArray9525[i + 1][i_10_ + 1]);
		class129.aShort1523
		    = (short) (aByteArrayArray9536[i][i_10_ + 1]
			       - aByteArrayArray9525[i][i_10_ + 1]);
		class129.aShort1526 = (short) i_40_;
		if (method15244(class166.aByte1825) || class166.aByte1805 != 0
		    || class166.aByte1806 != 0)
		    class129.aByte1524 |= 0x4;
	    } else {
		short i_41_ = Class504.method8313(i_39_, 1688343378);
		class129.aShort1521
		    = (short) Class159.method2568(i_41_,
						  ((aByteArrayArray9536[i]
						    [i_10_])
						   - (aByteArrayArray9525[i]
						      [i_10_])),
						  -1589650699);
		class129.aShort1522
		    = (short) Class159.method2568(i_41_,
						  ((aByteArrayArray9536[i + 1]
						    [i_10_])
						   - (aByteArrayArray9525
						      [i + 1][i_10_])),
						  -421358374);
		class129.aShort1525
		    = (short) Class159.method2568(i_41_,
						  ((aByteArrayArray9536[i + 1]
						    [i_10_ + 1])
						   - (aByteArrayArray9525
						      [i + 1][i_10_ + 1])),
						  -1776449927);
		class129.aShort1523
		    = (short) Class159.method2568(i_41_,
						  ((aByteArrayArray9536[i]
						    [i_10_ + 1])
						   - (aByteArrayArray9525[i]
						      [i_10_ + 1])),
						  534784518);
		class129.aShort1526 = (short) -1;
	    }
	    aClass129ArrayArray9515[i][i_10_] = class129;
	}
    }
    
    public void method2576(int i, int i_42_, int[] is, int[] is_43_,
			   int[] is_44_, int[] is_45_, int[] is_46_,
			   int[] is_47_, int[] is_48_, int[] is_49_,
			   Class176 class176, boolean bool) {
	boolean bool_50_ = (anInt9514 & 0x20) == 0;
	if (aClass123ArrayArray9517 == null && !bool_50_) {
	    aClass123ArrayArray9517
		= new Class123[anInt1759 * 363736815][anInt1760 * -1152334393];
	    aClass127ArrayArray9524
		= new Class127[anInt1759 * 363736815][anInt1760 * -1152334393];
	} else if (aClass134ArrayArray9519 == null && bool_50_)
	    aClass134ArrayArray9519
		= new Class134[anInt1759 * 363736815][anInt1760 * -1152334393];
	else if (aClass129ArrayArray9515 != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_51_ = 0; i_51_ < is_46_.length; i_51_++) {
		if (is_46_[i_51_] == -1)
		    is_46_[i_51_] = 0;
		else
		    is_46_[i_51_]
			= (Class381.anIntArray3929
			   [(Class504.method8313(is_46_[i_51_], 279873228)
			     & 0xffff)]) << 8 | 0xff;
	    }
	    if (is_47_ != null) {
		for (int i_52_ = 0; i_52_ < is_47_.length; i_52_++) {
		    if (is_47_[i_52_] == -1)
			is_47_[i_52_] = 0;
		    else
			is_47_[i_52_]
			    = (Class381.anIntArray3929
			       [(Class504.method8313(is_47_[i_52_], 293060536)
				 & 0xffff)]) << 8 | 0xff;
		}
	    }
	    if (bool_50_) {
		Class134 class134 = new Class134();
		class134.aShort1600 = (short) is.length;
		class134.aShort1605 = (short) (is.length / 3);
		class134.aShortArray1601 = new short[class134.aShort1600];
		class134.aShortArray1607 = new short[class134.aShort1600];
		class134.aShortArray1603 = new short[class134.aShort1600];
		class134.anIntArray1599 = new int[class134.aShort1600];
		class134.aShortArray1602 = new short[class134.aShort1600];
		class134.aShortArray1606 = new short[class134.aShort1600];
		class134.aByteArray1608 = new byte[class134.aShort1600];
		if (is_45_ != null)
		    class134.aShortArray1604 = new short[class134.aShort1600];
		for (int i_53_ = 0; i_53_ < class134.aShort1600; i_53_++) {
		    int i_54_ = is[i_53_];
		    int i_55_ = is_44_[i_53_];
		    boolean bool_56_ = false;
		    int i_57_;
		    if (i_54_ == 0 && i_55_ == 0)
			i_57_ = (aByteArrayArray9536[i][i_42_]
				 - aByteArrayArray9525[i][i_42_]);
		    else if (i_54_ == 0 && i_55_ == anInt1761 * 435863595)
			i_57_ = (aByteArrayArray9536[i][i_42_ + 1]
				 - aByteArrayArray9525[i][i_42_ + 1]);
		    else if (i_54_ == anInt1761 * 435863595
			     && i_55_ == anInt1761 * 435863595)
			i_57_ = (aByteArrayArray9536[i + 1][i_42_ + 1]
				 - aByteArrayArray9525[i + 1][i_42_ + 1]);
		    else if (i_54_ == anInt1761 * 435863595 && i_55_ == 0)
			i_57_ = (aByteArrayArray9536[i + 1][i_42_]
				 - aByteArrayArray9525[i + 1][i_42_]);
		    else {
			int i_58_ = (((aByteArrayArray9536[i][i_42_]
				       - aByteArrayArray9525[i][i_42_])
				      * (anInt1761 * 435863595 - i_54_))
				     + ((aByteArrayArray9536[i + 1][i_42_]
					 - aByteArrayArray9525[i + 1][i_42_])
					* i_54_));
			int i_59_
			    = (((aByteArrayArray9536[i][i_42_ + 1]
				 - aByteArrayArray9525[i][i_42_ + 1])
				* (anInt1761 * 435863595 - i_54_))
			       + ((aByteArrayArray9536[i + 1][i_42_ + 1]
				   - aByteArrayArray9525[i + 1][i_42_ + 1])
				  * i_54_));
			i_57_ = (i_58_ * (anInt1761 * 435863595 - i_55_)
				 + i_59_ * i_55_) >> anInt1763 * 168112006;
		    }
		    int i_60_ = (i << anInt1763 * -2063427645) + i_54_;
		    int i_61_ = (i_42_ << anInt1763 * -2063427645) + i_55_;
		    class134.aShortArray1601[i_53_] = (short) i_54_;
		    class134.aShortArray1603[i_53_] = (short) i_55_;
		    class134.aShortArray1607[i_53_]
			= (short) (method2619(i_60_, i_61_, -947241591)
				   + (is_43_ != null ? is_43_[i_53_] : 0));
		    if (i_57_ < 0)
			i_57_ = 0;
		    if (is_46_[i_53_] == 0) {
			class134.anIntArray1599[i_53_] = 0;
			if (is_47_ != null)
			    class134.aByteArray1608[i_53_] = (byte) i_57_;
		    } else {
			int i_62_ = 0;
			if (is_45_ != null) {
			    int i_63_ = (class134.aShortArray1604[i_53_]
					 = (short) is_45_[i_53_]);
			    if (class176.anInt1879 * -734182087 != 0) {
				i_62_ = 255 * i_63_ / (class176.anInt1879
						       * -734182087);
				if (i_62_ < 0)
				    i_62_ = 0;
				else if (i_62_ > 255)
				    i_62_ = 255;
			    }
			}
			int i_64_ = -16777216;
			if (is_48_[i_53_] != -1) {
			    TextureMetrics class166
				= aClass182_Sub2_9513.aClass180_1944
				      .method3116(is_48_[i_53_], -1431554601);
			    if (class166.aBool1801
				&& method15244(class166.aByte1825))
				i_64_ = -1694498816;
			}
			class134.anIntArray1599[i_53_]
			    = i_64_ | (Class525_Sub31.method16523
				       (method15241(is_46_[i_53_] >> 8, i_57_),
					class176.anInt1877 * 2141545647, i_62_,
					-1425027090));
			if (is_47_ != null)
			    class134.aByteArray1608[i_53_] = (byte) i_57_;
		    }
		    class134.aShortArray1602[i_53_] = (short) is_48_[i_53_];
		    class134.aShortArray1606[i_53_] = (short) is_49_[i_53_];
		}
		if (is_47_ != null) {
		    class134.anIntArray1609 = new int[class134.aShort1605];
		    for (int i_65_ = 0; i_65_ < class134.aShort1605; i_65_++) {
			int i_66_ = i_65_ * 3;
			if (is_47_[i_66_] != 0)
			    class134.anIntArray1609[i_65_]
				= ~0xffffff | is_47_[i_66_] >> 8;
		    }
		}
		aClass134ArrayArray9519[i][i_42_] = class134;
	    } else {
		boolean bool_67_ = true;
		int i_68_ = -1;
		int i_69_ = -1;
		int i_70_ = -1;
		int i_71_ = -1;
		if (is.length == 6) {
		    for (int i_72_ = 0; i_72_ < 6; i_72_++) {
			if (is[i_72_] == 0 && is_44_[i_72_] == 0) {
			    if (i_68_ != -1
				&& is_46_[i_68_] != is_46_[i_72_]) {
				bool_67_ = false;
				break;
			    }
			    i_68_ = i_72_;
			} else if (is[i_72_] == anInt1761 * 435863595
				   && is_44_[i_72_] == 0) {
			    if (i_69_ != -1
				&& is_46_[i_69_] != is_46_[i_72_]) {
				bool_67_ = false;
				break;
			    }
			    i_69_ = i_72_;
			} else if (is[i_72_] == anInt1761 * 435863595
				   && is_44_[i_72_] == anInt1761 * 435863595) {
			    if (i_70_ != -1
				&& is_46_[i_70_] != is_46_[i_72_]) {
				bool_67_ = false;
				break;
			    }
			    i_70_ = i_72_;
			} else if (is[i_72_] == 0
				   && is_44_[i_72_] == anInt1761 * 435863595) {
			    if (i_71_ != -1
				&& is_46_[i_71_] != is_46_[i_72_]) {
				bool_67_ = false;
				break;
			    }
			    i_71_ = i_72_;
			}
		    }
		    if (i_68_ == -1 || i_69_ == -1 || i_70_ == -1
			|| i_71_ == -1)
			bool_67_ = false;
		    if (bool_67_) {
			if (is_43_ != null) {
			    for (int i_73_ = 0; i_73_ < 4; i_73_++) {
				if (is_43_[i_73_] != 0) {
				    bool_67_ = false;
				    break;
				}
			    }
			}
			if (bool_67_) {
			    for (int i_74_ = 1; i_74_ < 4; i_74_++) {
				if (is[i_74_] != is[0]
				    && (is[i_74_]
					!= is[0] + anInt1761 * 435863595)
				    && (is[i_74_]
					!= is[0] - anInt1761 * 435863595)) {
				    bool_67_ = false;
				    break;
				}
				if (is_44_[i_74_] != is_44_[0]
				    && (is_44_[i_74_]
					!= is_44_[0] + anInt1761 * 435863595)
				    && (is_44_[i_74_]
					!= (is_44_[0]
					    - anInt1761 * 435863595))) {
				    bool_67_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    bool_67_ = false;
		if (bool_67_) {
		    Class123 class123 = new Class123();
		    int i_75_ = is_46_[0];
		    int i_76_ = is_48_[0];
		    if (is_47_ != null) {
			class123.anInt1455 = is_47_[0] >> 8;
			if (i_75_ == 0)
			    class123.aByte1451 |= 0x2;
		    } else if (i_75_ == 0)
			return;
		    if ((anIntArrayArray1762[i][i_42_]
			 == anIntArrayArray1762[i + 1][i_42_])
			&& (anIntArrayArray1762[i][i_42_]
			    == anIntArrayArray1762[i + 1][i_42_ + 1])
			&& (anIntArrayArray1762[i][i_42_]
			    == anIntArrayArray1762[i][i_42_ + 1]))
			class123.aByte1451 |= 0x1;
		    if (i_76_ != -1 && (class123.aByte1451 & 0x2) == 0
			&& !(aClass182_Sub2_9513.aClass180_1944.method3116
			     (i_76_, -1431554601).aBool1819)) {
			int i_77_;
			if (is_45_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_77_ = 255 * is_45_[i_68_] / (class176.anInt1879
							   * -734182087);
			    if (i_77_ < 0)
				i_77_ = 0;
			    else if (i_77_ > 255)
				i_77_ = 255;
			} else
			    i_77_ = 0;
			class123.anInt1453
			    = (Class525_Sub31.method16523
			       (method15241(is_46_[i_68_] >> 8,
					    (aByteArrayArray9536[i][i_42_]
					     - aByteArrayArray9525[i][i_42_])),
				class176.anInt1877 * 2141545647, i_77_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1453
				|= (255 - (aByteArrayArray9536[i][i_42_]
					   - aByteArrayArray9525[i][i_42_])
				    << 25);
			if (is_45_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_77_ = 255 * is_45_[i_69_] / (class176.anInt1879
							   * -734182087);
			    if (i_77_ < 0)
				i_77_ = 0;
			    else if (i_77_ > 255)
				i_77_ = 255;
			} else
			    i_77_ = 0;
			class123.anInt1446
			    = (Class525_Sub31.method16523
			       (method15241(is_46_[i_69_] >> 8,
					    (aByteArrayArray9536[i + 1][i_42_]
					     - (aByteArrayArray9525[i + 1]
						[i_42_]))),
				class176.anInt1877 * 2141545647, i_77_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1446
				|= (255 - (aByteArrayArray9536[i + 1][i_42_]
					   - aByteArrayArray9525[i + 1][i_42_])
				    << 25);
			if (is_45_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_77_ = 255 * is_45_[i_70_] / (class176.anInt1879
							   * -734182087);
			    if (i_77_ < 0)
				i_77_ = 0;
			    else if (i_77_ > 255)
				i_77_ = 255;
			} else
			    i_77_ = 0;
			class123.anInt1447
			    = (Class525_Sub31.method16523
			       (method15241(is_46_[i_70_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_42_ + 1])
					     - (aByteArrayArray9525[i + 1]
						[i_42_ + 1]))),
				class176.anInt1877 * 2141545647, i_77_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1447
				|= 255 - (aByteArrayArray9536[i + 1][i_42_ + 1]
					  - (aByteArrayArray9525[i + 1]
					     [i_42_ + 1])) << 25;
			if (is_45_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_77_ = 255 * is_45_[i_71_] / (class176.anInt1879
							   * -734182087);
			    if (i_77_ < 0)
				i_77_ = 0;
			    else if (i_77_ > 255)
				i_77_ = 255;
			} else
			    i_77_ = 0;
			class123.anInt1450
			    = (Class525_Sub31.method16523
			       (method15241(is_46_[i_71_] >> 8,
					    (aByteArrayArray9536[i][i_42_ + 1]
					     - (aByteArrayArray9525[i]
						[i_42_ + 1]))),
				class176.anInt1877 * 2141545647, i_77_,
				-1425027090));
			class123.aShort1456 = (short) i_76_;
		    } else {
			int i_78_;
			if (is_45_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_78_ = 255 * is_45_[i_68_] / (class176.anInt1879
							   * -734182087);
			    if (i_78_ < 0)
				i_78_ = 0;
			    else if (i_78_ > 255)
				i_78_ = 255;
			} else
			    i_78_ = 0;
			class123.anInt1453
			    = (Class525_Sub31.method16523
			       (method15241(is_46_[i_68_] >> 8,
					    (aByteArrayArray9536[i][i_42_]
					     - aByteArrayArray9525[i][i_42_])),
				class176.anInt1877 * 2141545647, i_78_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1453
				|= (255 - (aByteArrayArray9536[i][i_42_]
					   - aByteArrayArray9525[i][i_42_])
				    << 25);
			if (is_45_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_78_ = 255 * is_45_[i_69_] / (class176.anInt1879
							   * -734182087);
			    if (i_78_ < 0)
				i_78_ = 0;
			    else if (i_78_ > 255)
				i_78_ = 255;
			} else
			    i_78_ = 0;
			class123.anInt1446
			    = (Class525_Sub31.method16523
			       (method15241(is_46_[i_69_] >> 8,
					    (aByteArrayArray9536[i + 1][i_42_]
					     - (aByteArrayArray9525[i + 1]
						[i_42_]))),
				class176.anInt1877 * 2141545647, i_78_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1446
				|= (255 - (aByteArrayArray9536[i + 1][i_42_]
					   - aByteArrayArray9525[i + 1][i_42_])
				    << 25);
			if (is_45_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_78_ = 255 * is_45_[i_70_] / (class176.anInt1879
							   * -734182087);
			    if (i_78_ < 0)
				i_78_ = 0;
			    else if (i_78_ > 255)
				i_78_ = 255;
			} else
			    i_78_ = 0;
			class123.anInt1447
			    = (Class525_Sub31.method16523
			       (method15241(is_46_[i_70_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_42_ + 1])
					     - (aByteArrayArray9525[i + 1]
						[i_42_ + 1]))),
				class176.anInt1877 * 2141545647, i_78_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1447
				|= 255 - (aByteArrayArray9536[i + 1][i_42_ + 1]
					  - (aByteArrayArray9525[i + 1]
					     [i_42_ + 1])) << 25;
			if (is_45_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_78_ = 255 * is_45_[i_71_] / (class176.anInt1879
							   * -734182087);
			    if (i_78_ < 0)
				i_78_ = 0;
			    else if (i_78_ > 255)
				i_78_ = 255;
			} else
			    i_78_ = 0;
			class123.anInt1450
			    = (Class525_Sub31.method16523
			       (method15241(is_46_[i_71_] >> 8,
					    (aByteArrayArray9536[i][i_42_ + 1]
					     - (aByteArrayArray9525[i]
						[i_42_ + 1]))),
				class176.anInt1877 * 2141545647, i_78_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1450
				|= (255 - (aByteArrayArray9536[i][i_42_ + 1]
					   - aByteArrayArray9525[i][i_42_ + 1])
				    << 25);
			class123.aShort1456 = (short) -1;
		    }
		    if (is_45_ != null) {
			class123.aShort1448 = (short) is_45_[i_70_];
			class123.aShort1454 = (short) is_45_[i_71_];
			class123.aShort1452 = (short) is_45_[i_69_];
			class123.aShort1449 = (short) is_45_[i_68_];
		    }
		    aClass123ArrayArray9517[i][i_42_] = class123;
		} else {
		    Class127 class127 = new Class127();
		    class127.aShort1471 = (short) is.length;
		    class127.aShort1474 = (short) (is.length / 3);
		    class127.aShortArray1473 = new short[class127.aShort1471];
		    class127.aShortArray1477 = new short[class127.aShort1471];
		    class127.aShortArray1470 = new short[class127.aShort1471];
		    class127.anIntArray1475 = new int[class127.aShort1471];
		    if (is_45_ != null)
			class127.aShortArray1476
			    = new short[class127.aShort1471];
		    for (int i_79_ = 0; i_79_ < class127.aShort1471; i_79_++) {
			int i_80_ = is[i_79_];
			int i_81_ = is_44_[i_79_];
			boolean bool_82_ = false;
			int i_83_;
			if (i_80_ == 0 && i_81_ == 0)
			    i_83_ = (aByteArrayArray9536[i][i_42_]
				     - aByteArrayArray9525[i][i_42_]);
			else if (i_80_ == 0 && i_81_ == anInt1761 * 435863595)
			    i_83_ = (aByteArrayArray9536[i][i_42_ + 1]
				     - aByteArrayArray9525[i][i_42_ + 1]);
			else if (i_80_ == anInt1761 * 435863595
				 && i_81_ == anInt1761 * 435863595)
			    i_83_ = (aByteArrayArray9536[i + 1][i_42_ + 1]
				     - aByteArrayArray9525[i + 1][i_42_ + 1]);
			else if (i_80_ == anInt1761 * 435863595 && i_81_ == 0)
			    i_83_ = (aByteArrayArray9536[i + 1][i_42_]
				     - aByteArrayArray9525[i + 1][i_42_]);
			else {
			    int i_84_
				= (((aByteArrayArray9536[i][i_42_]
				     - aByteArrayArray9525[i][i_42_])
				    * (anInt1761 * 435863595 - i_80_))
				   + ((aByteArrayArray9536[i + 1][i_42_]
				       - aByteArrayArray9525[i + 1][i_42_])
				      * i_80_));
			    int i_85_
				= (((aByteArrayArray9536[i][i_42_ + 1]
				     - aByteArrayArray9525[i][i_42_ + 1])
				    * (anInt1761 * 435863595 - i_80_))
				   + ((aByteArrayArray9536[i + 1][i_42_ + 1]
				       - aByteArrayArray9525[i + 1][i_42_ + 1])
				      * i_80_));
			    i_83_ = (i_84_ * (anInt1761 * 435863595 - i_81_)
				     + i_85_ * i_81_) >> anInt1763 * 168112006;
			}
			int i_86_ = (i << anInt1763 * -2063427645) + i_80_;
			int i_87_ = (i_42_ << anInt1763 * -2063427645) + i_81_;
			class127.aShortArray1473[i_79_] = (short) i_80_;
			class127.aShortArray1470[i_79_] = (short) i_81_;
			class127.aShortArray1477[i_79_]
			    = (short) (method2619(i_86_, i_87_, -1917036348)
				       + (is_43_ != null ? is_43_[i_79_] : 0));
			if (i_83_ < 0)
			    i_83_ = 0;
			if (is_46_[i_79_] == 0) {
			    if (is_47_ != null)
				class127.anIntArray1475[i_79_] = i_83_ << 25;
			    else
				class127.anIntArray1475[i_79_] = 0;
			} else {
			    int i_88_ = 0;
			    if (is_45_ != null) {
				int i_89_ = (class127.aShortArray1476[i_79_]
					     = (short) is_45_[i_79_]);
				if (class176.anInt1879 * -734182087 != 0) {
				    i_88_ = 255 * i_89_ / (class176.anInt1879
							   * -734182087);
				    if (i_88_ < 0)
					i_88_ = 0;
				    else if (i_88_ > 255)
					i_88_ = 255;
				}
			    }
			    class127.anIntArray1475[i_79_]
				= (Class525_Sub31.method16523
				   (method15241(is_46_[i_79_] >> 8, i_83_),
				    class176.anInt1877 * 2141545647, i_88_,
				    -1425027090));
			    if (is_47_ != null)
				class127.anIntArray1475[i_79_] |= i_83_ << 25;
			}
		    }
		    boolean bool_90_ = false;
		    for (int i_91_ = 0; i_91_ < class127.aShort1474; i_91_++) {
			if (is_48_[i_91_ * 3] != -1
			    && !(aClass182_Sub2_9513.aClass180_1944.method3116
				 (is_48_[i_91_ * 3], -1431554601).aBool1819))
			    bool_90_ = true;
		    }
		    if (is_47_ != null)
			class127.anIntArray1480 = new int[class127.aShort1474];
		    if (bool_90_) {
			class127.aShortArray1478
			    = new short[class127.aShort1474];
			class127.aShortArray1479
			    = new short[class127.aShort1474];
		    }
		    for (int i_92_ = 0; i_92_ < class127.aShort1474; i_92_++) {
			int i_93_ = i_92_ * 3;
			if (is_47_ != null && is_47_[i_93_] != 0)
			    class127.anIntArray1480[i_92_]
				= is_47_[i_93_] >> 8;
			if (bool_90_) {
			    int i_94_ = i_93_ + 1;
			    int i_95_ = i_94_ + 1;
			    boolean bool_96_ = false;
			    boolean bool_97_ = true;
			    int i_98_ = is_48_[i_93_];
			    if (i_98_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_98_, -1431554601).aBool1819))
				bool_97_ = false;
			    else
				bool_96_ = true;
			    i_98_ = is_48_[i_94_];
			    if (i_98_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_98_, -1431554601).aBool1819))
				bool_97_ = false;
			    else
				bool_96_ = true;
			    i_98_ = is_48_[i_95_];
			    if (i_98_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_98_, -1431554601).aBool1819))
				bool_97_ = false;
			    else
				bool_96_ = true;
			    if (bool_97_) {
				class127.aShortArray1478[i_92_]
				    = (short) i_98_;
				class127.aShortArray1479[i_92_]
				    = (short) is_49_[i_93_];
			    } else {
				if (bool_96_) {
				    i_98_ = is_48_[i_93_];
				    if (i_98_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_98_, -1431554601).aBool1819))
					class127.anIntArray1475[i_93_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_98_, -1431554601)
						   .aShort1834) & 0xffff,
						  965198381)) & 0xffff]);
				    i_98_ = is_48_[i_94_];
				    if (i_98_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_98_, -1431554601).aBool1819))
					class127.anIntArray1475[i_94_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_98_, -1431554601)
						   .aShort1834) & 0xffff,
						  1122428878)) & 0xffff]);
				    i_98_ = is_48_[i_95_];
				    if (i_98_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_98_, -1431554601).aBool1819))
					class127.anIntArray1475[i_95_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_98_, -1431554601)
						   .aShort1834) & 0xffff,
						  578470549)) & 0xffff]);
				}
				class127.aShortArray1478[i_92_] = (short) -1;
			    }
			}
		    }
		    aClass127ArrayArray9524[i][i_42_] = class127;
		}
	    }
	}
    }
    
    public void method2579(int i, int i_99_, int i_100_, boolean[][] bools,
			   boolean bool, int i_101_) {
	if (aClass182_Sub2_9513.anIntArray9466 == null
	    || aClass182_Sub2_9513.aFloatArray9469 == null)
	    throw new IllegalStateException("");
	Class435 class435 = aClass182_Sub2_9513.aClass435_9483;
	aFloat9520 = class435.aFloatArray4830[0];
	aFloat9521 = class435.aFloatArray4830[1];
	aFloat9531 = class435.aFloatArray4830[2];
	aFloat9523 = class435.aFloatArray4830[3];
	aFloat9537 = class435.aFloatArray4830[4];
	aFloat9508 = class435.aFloatArray4830[5];
	aFloat9530 = class435.aFloatArray4830[6];
	aFloat9526 = class435.aFloatArray4830[7];
	aFloat9522 = class435.aFloatArray4830[8];
	aFloat9510 = class435.aFloatArray4830[9];
	aFloat9518 = class435.aFloatArray4830[10];
	aFloat9528 = class435.aFloatArray4830[11];
	aFloat9532 = class435.aFloatArray4830[12];
	aFloat9529 = class435.aFloatArray4830[13];
	aFloat9534 = class435.aFloatArray4830[14];
	aFloat9527 = class435.aFloatArray4830[15];
	for (int i_102_ = 0; i_102_ < i_100_ + i_100_; i_102_++) {
	    for (int i_103_ = 0; i_103_ < i_100_ + i_100_; i_103_++) {
		if (bools[i_102_][i_103_]) {
		    int i_104_ = i - i_100_ + i_102_;
		    int i_105_ = i_99_ - i_100_ + i_103_;
		    if (i_104_ >= 0 && i_104_ < anInt1759 * 363736815
			&& i_105_ >= 0 && i_105_ < anInt1760 * -1152334393)
			method15242(i_104_, i_105_, i_101_);
		}
	    }
	}
    }
    
    public void method2578() {
	aByteArrayArray9536 = null;
	aByteArrayArray9525 = null;
    }
    
    public void method2598(int i, int i_106_, int i_107_, boolean[][] bools,
			   boolean bool, int i_108_) {
	if (aClass182_Sub2_9513.anIntArray9466 == null
	    || aClass182_Sub2_9513.aFloatArray9469 == null)
	    throw new IllegalStateException("");
	Class435 class435 = aClass182_Sub2_9513.aClass435_9483;
	aFloat9520 = class435.aFloatArray4830[0];
	aFloat9521 = class435.aFloatArray4830[1];
	aFloat9531 = class435.aFloatArray4830[2];
	aFloat9523 = class435.aFloatArray4830[3];
	aFloat9537 = class435.aFloatArray4830[4];
	aFloat9508 = class435.aFloatArray4830[5];
	aFloat9530 = class435.aFloatArray4830[6];
	aFloat9526 = class435.aFloatArray4830[7];
	aFloat9522 = class435.aFloatArray4830[8];
	aFloat9510 = class435.aFloatArray4830[9];
	aFloat9518 = class435.aFloatArray4830[10];
	aFloat9528 = class435.aFloatArray4830[11];
	aFloat9532 = class435.aFloatArray4830[12];
	aFloat9529 = class435.aFloatArray4830[13];
	aFloat9534 = class435.aFloatArray4830[14];
	aFloat9527 = class435.aFloatArray4830[15];
	for (int i_109_ = 0; i_109_ < i_107_ + i_107_; i_109_++) {
	    for (int i_110_ = 0; i_110_ < i_107_ + i_107_; i_110_++) {
		if (bools[i_109_][i_110_]) {
		    int i_111_ = i - i_107_ + i_109_;
		    int i_112_ = i_106_ - i_107_ + i_110_;
		    if (i_111_ >= 0 && i_111_ < anInt1759 * 363736815
			&& i_112_ >= 0 && i_112_ < anInt1760 * -1152334393)
			method15242(i_111_, i_112_, i_108_);
		}
	    }
	}
    }
    
    void method15242(int i, int i_113_, int i_114_) {
	Class110 class110
	    = aClass182_Sub2_9513.method15223(Thread.currentThread());
	class110.aClass128_1338.anInt1486 = 0;
	if (aClass123ArrayArray9517 != null)
	    method15263(i, i_113_, class110.aBool1332, class110,
			class110.aClass128_1338, class110.aFloatArray1364,
			class110.aFloatArray1365, class110.aFloatArray1366,
			class110.aFloatArray1367, class110.aFloatArray1339,
			i_114_);
	else if (aClass129ArrayArray9515 != null)
	    method15243(i, i_113_, class110.aClass128_1338,
			class110.aFloatArray1364, class110.aFloatArray1365,
			class110.aFloatArray1366, class110.aFloatArray1367,
			class110.aFloatArray1339, i_114_);
	else if (aClass134ArrayArray9519 != null)
	    method15268(i, i_113_, class110.aBool1332, class110,
			class110.aClass128_1338, class110.aFloatArray1364,
			class110.aFloatArray1365, class110.aFloatArray1366,
			class110.aFloatArray1367, class110.aFloatArray1339,
			i_114_);
    }
    
    void method15243(int i, int i_115_, Class128 class128, float[] fs,
		     float[] fs_116_, float[] fs_117_, float[] fs_118_,
		     float[] fs_119_, int i_120_) {
	Class129 class129 = aClass129ArrayArray9515[i][i_115_];
	if (class129 != null) {
	    if ((class129.aByte1524 & 0x2) == 0) {
		if (i_120_ != 0) {
		    if ((class129.aByte1524 & 0x4) != 0) {
			if ((i_120_ & 0x1) != 0)
			    return;
		    } else if ((i_120_ & 0x2) != 0)
			return;
		}
		int i_121_ = i * (anInt1761 * 435863595);
		int i_122_ = i_121_ + anInt1761 * 435863595;
		int i_123_ = i_115_ * (anInt1761 * 435863595);
		int i_124_ = i_123_ + anInt1761 * 435863595;
		float f;
		float f_125_;
		float f_126_;
		float f_127_;
		float f_128_;
		float f_129_;
		float f_130_;
		float f_131_;
		float f_132_;
		float f_133_;
		float f_134_;
		float f_135_;
		float f_136_;
		float f_137_;
		float f_138_;
		float f_139_;
		if ((class129.aByte1524 & 0x1) != 0) {
		    int i_140_ = anIntArrayArray1762[i][i_115_];
		    float f_141_ = aFloat9530 * (float) i_140_;
		    float f_142_ = aFloat9526 * (float) i_140_;
		    float f_143_
			= aFloat9534 + (aFloat9531 * (float) i_121_ + f_141_
					+ aFloat9518 * (float) i_123_);
		    f = aFloat9527 + (aFloat9523 * (float) i_121_ + f_142_
				      + aFloat9528 * (float) i_123_);
		    if (f_143_ < -f)
			return;
		    float f_144_
			= aFloat9534 + (aFloat9531 * (float) i_122_ + f_141_
					+ aFloat9518 * (float) i_123_);
		    f_125_ = aFloat9527 + (aFloat9523 * (float) i_122_ + f_142_
					   + aFloat9528 * (float) i_123_);
		    if (f_144_ < -f_125_)
			return;
		    float f_145_
			= aFloat9534 + (aFloat9531 * (float) i_122_ + f_141_
					+ aFloat9518 * (float) i_124_);
		    f_126_ = aFloat9527 + (aFloat9523 * (float) i_122_ + f_142_
					   + aFloat9528 * (float) i_124_);
		    if (f_145_ < -f_126_)
			return;
		    float f_146_
			= aFloat9534 + (aFloat9531 * (float) i_121_ + f_141_
					+ aFloat9518 * (float) i_124_);
		    f_127_ = aFloat9527 + (aFloat9523 * (float) i_121_ + f_142_
					   + aFloat9528 * (float) i_124_);
		    if (f_146_ < -f_127_)
			return;
		    float f_147_ = aFloat9537 * (float) i_140_;
		    float f_148_ = aFloat9508 * (float) i_140_;
		    float f_149_
			= aFloat9532 + (aFloat9520 * (float) i_121_ + f_147_
					+ aFloat9522 * (float) i_123_);
		    f_128_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_149_ / f);
		    float f_150_
			= aFloat9529 + (aFloat9521 * (float) i_121_ + f_148_
					+ aFloat9510 * (float) i_123_);
		    f_129_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_150_ / f);
		    f_130_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_143_ / f);
		    float f_151_
			= aFloat9532 + (aFloat9520 * (float) i_122_ + f_147_
					+ aFloat9522 * (float) i_123_);
		    f_131_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_151_ / f_125_);
		    float f_152_
			= aFloat9529 + (aFloat9521 * (float) i_122_ + f_148_
					+ aFloat9510 * (float) i_123_);
		    f_132_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_152_ / f_125_);
		    f_133_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_144_ / f_125_);
		    float f_153_
			= aFloat9532 + (aFloat9520 * (float) i_122_ + f_147_
					+ aFloat9522 * (float) i_124_);
		    f_134_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_153_ / f_126_);
		    float f_154_
			= aFloat9529 + (aFloat9521 * (float) i_122_ + f_148_
					+ aFloat9510 * (float) i_124_);
		    f_135_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_154_ / f_126_);
		    f_136_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_145_ / f_126_);
		    float f_155_
			= aFloat9532 + (aFloat9520 * (float) i_121_ + f_147_
					+ aFloat9522 * (float) i_124_);
		    f_137_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_155_ / f_127_);
		    float f_156_
			= aFloat9529 + (aFloat9521 * (float) i_121_ + f_148_
					+ aFloat9510 * (float) i_124_);
		    f_138_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_156_ / f_127_);
		    f_139_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_146_ / f_127_);
		} else {
		    int i_157_ = anIntArrayArray1762[i][i_115_];
		    int i_158_ = anIntArrayArray1762[i + 1][i_115_];
		    int i_159_ = anIntArrayArray1762[i + 1][i_115_ + 1];
		    int i_160_ = anIntArrayArray1762[i][i_115_ + 1];
		    float f_161_
			= aFloat9534 + (aFloat9531 * (float) i_121_
					+ aFloat9530 * (float) i_157_
					+ aFloat9518 * (float) i_123_);
		    f = aFloat9527 + (aFloat9523 * (float) i_121_
				      + aFloat9526 * (float) i_157_
				      + aFloat9528 * (float) i_123_);
		    if (f_161_ < -f)
			return;
		    float f_162_
			= aFloat9534 + (aFloat9531 * (float) i_122_
					+ aFloat9530 * (float) i_158_
					+ aFloat9518 * (float) i_123_);
		    f_125_ = aFloat9527 + (aFloat9523 * (float) i_122_
					   + aFloat9526 * (float) i_158_
					   + aFloat9528 * (float) i_123_);
		    if (f_162_ < -f_125_)
			return;
		    float f_163_
			= aFloat9534 + (aFloat9531 * (float) i_122_
					+ aFloat9530 * (float) i_159_
					+ aFloat9518 * (float) i_124_);
		    f_126_ = aFloat9527 + (aFloat9523 * (float) i_122_
					   + aFloat9526 * (float) i_159_
					   + aFloat9528 * (float) i_124_);
		    if (f_163_ < -f_126_)
			return;
		    float f_164_
			= aFloat9534 + (aFloat9531 * (float) i_121_
					+ aFloat9530 * (float) i_160_
					+ aFloat9518 * (float) i_124_);
		    f_127_ = aFloat9527 + (aFloat9523 * (float) i_121_
					   + aFloat9526 * (float) i_160_
					   + aFloat9528 * (float) i_124_);
		    if (f_164_ < -f_127_)
			return;
		    float f_165_
			= aFloat9532 + (aFloat9520 * (float) i_121_
					+ aFloat9537 * (float) i_157_
					+ aFloat9522 * (float) i_123_);
		    f_128_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_165_ / f);
		    float f_166_
			= aFloat9529 + (aFloat9521 * (float) i_121_
					+ aFloat9508 * (float) i_157_
					+ aFloat9510 * (float) i_123_);
		    f_129_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_166_ / f);
		    f_130_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_161_ / f);
		    float f_167_
			= aFloat9532 + (aFloat9520 * (float) i_122_
					+ aFloat9537 * (float) i_158_
					+ aFloat9522 * (float) i_123_);
		    f_131_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_167_ / f_125_);
		    float f_168_
			= aFloat9529 + (aFloat9521 * (float) i_122_
					+ aFloat9508 * (float) i_158_
					+ aFloat9510 * (float) i_123_);
		    f_132_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_168_ / f_125_);
		    f_133_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_162_ / f_125_);
		    float f_169_
			= aFloat9532 + (aFloat9520 * (float) i_122_
					+ aFloat9537 * (float) i_159_
					+ aFloat9522 * (float) i_124_);
		    f_134_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_169_ / f_126_);
		    float f_170_
			= aFloat9529 + (aFloat9521 * (float) i_122_
					+ aFloat9508 * (float) i_159_
					+ aFloat9510 * (float) i_124_);
		    f_135_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_170_ / f_126_);
		    f_136_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_163_ / f_126_);
		    float f_171_
			= aFloat9532 + (aFloat9520 * (float) i_121_
					+ aFloat9537 * (float) i_160_
					+ aFloat9522 * (float) i_124_);
		    f_137_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_171_ / f_127_);
		    float f_172_
			= aFloat9529 + (aFloat9521 * (float) i_121_
					+ aFloat9508 * (float) i_160_
					+ aFloat9510 * (float) i_124_);
		    f_138_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_172_ / f_127_);
		    f_139_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_164_ / f_127_);
		}
		boolean bool = false;
		if (class129.aShort1526 != -1) {
		    TextureMetrics class166
			= (aClass182_Sub2_9513.aClass180_1944.method3116
			   (class129.aShort1526 & 0xffff, -1431554601));
		    bool = class166.aBool1801;
		}
		if (((f_134_ - f_137_) * (f_132_ - f_138_)
		     - (f_135_ - f_138_) * (f_131_ - f_137_))
		    > 0.0F) {
		    class128.aBool1485
			= (f_134_ < 0.0F || f_137_ < 0.0F || f_131_ < 0.0F
			   || f_134_ > (float) class128.anInt1494
			   || f_137_ > (float) class128.anInt1494
			   || f_131_ > (float) class128.anInt1494);
		    if (bool)
			class128.method2248
			    (true, true, false, f_135_, f_138_, f_132_, f_134_,
			     f_137_, f_131_, f_136_, f_139_, f_133_, f_126_,
			     f_127_, f_125_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
			     0.0F,
			     ~0xffffff | ((Class381.anIntArray3929
					   [class129.aShort1525 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class381.anIntArray3929
					   [class129.aShort1523 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class381.anIntArray3929
					   [class129.aShort1522 & 0xffff])
					  & 0xffffff),
			     0, 0.0F, 0.0F, 0.0F,
			     class129.aShort1526 & 0xffff);
		    else
			class128.method2266(true, true, false, f_135_, f_138_,
					    f_132_, f_134_, f_137_, f_131_,
					    f_136_, f_139_, f_133_,
					    (float) (class129.aShort1525
						     & 0xffff),
					    (float) (class129.aShort1523
						     & 0xffff),
					    (float) (class129.aShort1522
						     & 0xffff));
		}
		if (((f_128_ - f_131_) * (f_138_ - f_132_)
		     - (f_129_ - f_132_) * (f_137_ - f_131_))
		    > 0.0F) {
		    class128.aBool1485
			= (f_128_ < 0.0F || f_131_ < 0.0F || f_137_ < 0.0F
			   || f_128_ > (float) class128.anInt1494
			   || f_131_ > (float) class128.anInt1494
			   || f_137_ > (float) class128.anInt1494);
		    if (bool)
			class128.method2248
			    (true, true, false, f_129_, f_132_, f_138_, f_128_,
			     f_131_, f_137_, f_130_, f_133_, f_139_, f, f_125_,
			     f_127_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
			     ~0xffffff | ((Class381.anIntArray3929
					   [class129.aShort1521 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class381.anIntArray3929
					   [class129.aShort1522 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class381.anIntArray3929
					   [class129.aShort1523 & 0xffff])
					  & 0xffffff),
			     0, 0.0F, 0.0F, 0.0F,
			     class129.aShort1526 & 0xffff);
		    else
			class128.method2266(true, true, false, f_129_, f_132_,
					    f_138_, f_128_, f_131_, f_137_,
					    f_130_, f_133_, f_139_,
					    (float) (class129.aShort1521
						     & 0xffff),
					    (float) (class129.aShort1522
						     & 0xffff),
					    (float) (class129.aShort1523
						     & 0xffff));
		}
	    }
	} else {
	    Class114 class114 = aClass114ArrayArray9535[i][i_115_];
	    if (class114 != null) {
		if (i_120_ != 0) {
		    if ((class114.aByte1394 & 0x4) != 0) {
			if ((i_120_ & 0x1) != 0)
			    return;
		    } else if ((i_120_ & 0x2) != 0)
			return;
		}
		for (int i_173_ = 0; i_173_ < class114.aShort1393; i_173_++) {
		    int i_174_ = (class114.aShortArray1395[i_173_]
				  + (i << anInt1763 * -2063427645));
		    short i_175_ = class114.aShortArray1397[i_173_];
		    int i_176_ = (class114.aShortArray1398[i_173_]
				  + (i_115_ << anInt1763 * -2063427645));
		    float f = aFloat9534 + (aFloat9531 * (float) i_174_
					    + aFloat9530 * (float) i_175_
					    + aFloat9518 * (float) i_176_);
		    float f_177_
			= aFloat9527 + (aFloat9523 * (float) i_174_
					+ aFloat9526 * (float) i_175_
					+ aFloat9528 * (float) i_176_);
		    if (f < -f_177_)
			return;
		    float f_178_
			= aFloat9532 + (aFloat9520 * (float) i_174_
					+ aFloat9537 * (float) i_175_
					+ aFloat9522 * (float) i_176_);
		    float f_179_
			= aFloat9529 + (aFloat9521 * (float) i_174_
					+ aFloat9508 * (float) i_175_
					+ aFloat9510 * (float) i_176_);
		    fs[i_173_] = (class128.aFloat1503
				  + class128.aFloat1489 * f_178_ / f_177_);
		    fs_116_[i_173_]
			= (class128.aFloat1490
			   + class128.aFloat1491 * f_179_ / f_177_);
		    fs_117_[i_173_] = (class128.aFloat1492
				       + class128.aFloat1493 * f / f_177_);
		    fs_118_[i_173_] = f_177_;
		}
		if (class114.aShortArray1402 != null) {
		    for (int i_180_ = 0; i_180_ < class114.aShort1396;
			 i_180_++) {
			short i_181_ = class114.aShortArray1399[i_180_];
			short i_182_ = class114.aShortArray1400[i_180_];
			short i_183_ = class114.aShortArray1401[i_180_];
			float f = fs[i_181_];
			float f_184_ = fs[i_182_];
			float f_185_ = fs[i_183_];
			float f_186_ = fs_116_[i_181_];
			float f_187_ = fs_116_[i_182_];
			float f_188_ = fs_116_[i_183_];
			if (((f - f_184_) * (f_188_ - f_187_)
			     - (f_186_ - f_187_) * (f_185_ - f_184_))
			    > 0.0F) {
			    class128.aBool1485
				= (f < 0.0F || f_184_ < 0.0F || f_185_ < 0.0F
				   || f > (float) class128.anInt1494
				   || f_184_ > (float) class128.anInt1494
				   || f_185_ > (float) class128.anInt1494);
			    boolean bool = false;
			    if (class114.aShortArray1402[i_180_] != -1) {
				TextureMetrics class166
				    = (aClass182_Sub2_9513.aClass180_1944
					   .method3116
				       ((class114.aShortArray1402[i_180_]
					 & 0xffff),
					-1431554601));
				bool = class166.aBool1801;
			    }
			    if (bool)
				class128.method2248
				    (true, true, false, f_186_, f_187_, f_188_,
				     f, f_184_, f_185_, fs_117_[i_181_],
				     fs_117_[i_182_], fs_117_[i_183_],
				     fs_118_[i_181_], fs_118_[i_182_],
				     fs_118_[i_183_],
				     ((float) class114.aShortArray1395[i_181_]
				      / (float) (anInt1761 * 435863595)),
				     ((float) class114.aShortArray1395[i_182_]
				      / (float) (anInt1761 * 435863595)),
				     ((float) class114.aShortArray1395[i_183_]
				      / (float) (anInt1761 * 435863595)),
				     ((float) class114.aShortArray1398[i_181_]
				      / (float) (anInt1761 * 435863595)),
				     ((float) class114.aShortArray1398[i_182_]
				      / (float) (anInt1761 * 435863595)),
				     ((float) class114.aShortArray1398[i_183_]
				      / (float) (anInt1761 * 435863595)),
				     (~0xffffff
				      | (Class381.anIntArray3929
					 [(class114.aShortArray1403[i_181_]
					   & 0xffff)]) & 0xffffff),
				     (~0xffffff
				      | (Class381.anIntArray3929
					 [(class114.aShortArray1403[i_182_]
					   & 0xffff)]) & 0xffffff),
				     (~0xffffff
				      | (Class381.anIntArray3929
					 [(class114.aShortArray1403[i_183_]
					   & 0xffff)]) & 0xffffff),
				     0, 0.0F, 0.0F, 0.0F,
				     (class114.aShortArray1402[i_180_]
				      & 0xffff));
			    else {
				int i_189_ = class114.anIntArray1392[i_180_];
				if (i_189_ != -1)
				    class128.method2266
					(true, true, false, f_186_, f_187_,
					 f_188_, f, f_184_, f_185_,
					 fs_117_[i_181_], fs_117_[i_182_],
					 fs_117_[i_183_],
					 (float) (Class159.method2568
						  (i_189_,
						   (class114.aShortArray1403
						    [i_181_]),
						   -2066779904)),
					 (float) (Class159.method2568
						  (i_189_,
						   (class114.aShortArray1403
						    [i_182_]),
						   1115494834)),
					 (float) (Class159.method2568
						  (i_189_,
						   (class114.aShortArray1403
						    [i_183_]),
						   -1688151367)));
			    }
			}
		    }
		} else {
		    for (int i_190_ = 0; i_190_ < class114.aShort1396;
			 i_190_++) {
			short i_191_ = class114.aShortArray1399[i_190_];
			short i_192_ = class114.aShortArray1400[i_190_];
			short i_193_ = class114.aShortArray1401[i_190_];
			float f = fs[i_191_];
			float f_194_ = fs[i_192_];
			float f_195_ = fs[i_193_];
			float f_196_ = fs_116_[i_191_];
			float f_197_ = fs_116_[i_192_];
			float f_198_ = fs_116_[i_193_];
			if (((f - f_194_) * (f_198_ - f_197_)
			     - (f_196_ - f_197_) * (f_195_ - f_194_))
			    > 0.0F) {
			    int i_199_ = class114.anIntArray1392[i_190_];
			    if (i_199_ != -1) {
				class128.aBool1485
				    = (f < 0.0F || f_194_ < 0.0F
				       || f_195_ < 0.0F
				       || f > (float) class128.anInt1494
				       || f_194_ > (float) class128.anInt1494
				       || f_195_ > (float) class128.anInt1494);
				class128.method2266
				    (true, true, false, f_196_, f_197_, f_198_,
				     f, f_194_, f_195_, fs_117_[i_191_],
				     fs_117_[i_192_], fs_117_[i_193_],
				     (float) (Class159.method2568
					      (i_199_,
					       (class114.aShortArray1403
						[i_191_]),
					       -1137803730)),
				     (float) (Class159.method2568
					      (i_199_,
					       (class114.aShortArray1403
						[i_192_]),
					       2066132760)),
				     (float) (Class159.method2568
					      (i_199_,
					       (class114.aShortArray1403
						[i_193_]),
					       -1280209733)));
			    }
			}
		    }
		}
	    }
	}
    }
    
    public Class525_Sub16_Sub17 method2597
	(int i, int i_200_, Class525_Sub16_Sub17 class525_sub16_sub17) {
	return null;
    }
    
    public void method2608(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_201_, int i_202_, int i_203_, boolean bool) {
	/* empty */
    }
    
    boolean method15244(int i) {
	if ((anInt9514 & 0x8) == 0)
	    return false;
	if (i == 4)
	    return true;
	if (i == 8)
	    return true;
	if (i == 9)
	    return true;
	return false;
    }
    
    public void method2574(int i, int i_204_, int i_205_, int i_206_,
			   int i_207_, int i_208_, int i_209_,
			   boolean[][] bools) {
	Class110 class110
	    = aClass182_Sub2_9513.method15223(Thread.currentThread());
	Class128 class128 = class110.aClass128_1338;
	class128.anInt1486 = 0;
	class128.aBool1485 = true;
	aClass182_Sub2_9513.method15172();
	if (aClass123ArrayArray9517 != null || aClass134ArrayArray9519 != null)
	    method15267(i, i_204_, i_205_, i_206_, i_207_, i_208_, i_209_,
			bools, class110, class128, class110.aFloatArray1364,
			class110.aFloatArray1365);
	else if (aClass129ArrayArray9515 != null)
	    method15245(i, i_204_, i_205_, i_206_, i_207_, i_208_, i_209_,
			bools, class110, class128, class110.aFloatArray1364,
			class110.aFloatArray1365);
    }
    
    void method15245(int i, int i_210_, int i_211_, int i_212_, int i_213_,
		     int i_214_, int i_215_, boolean[][] bools,
		     Class110 class110, Class128 class128, float[] fs,
		     float[] fs_216_) {
	int i_217_ = (i_215_ - i_213_) * i_211_ / 256;
	int i_218_ = i_211_ >> 8;
	boolean bool = class110.aBool1335;
	aClass182_Sub2_9513.method3235(false);
	class128.aBool1482 = false;
	class128.aBool1483 = false;
	int i_219_ = i;
	int i_220_ = i_210_ + i_217_;
	for (int i_221_ = i_212_; i_221_ < i_214_; i_221_++) {
	    for (int i_222_ = i_213_; i_222_ < i_215_; i_222_++) {
		if (bools[i_221_ - i_212_][i_222_ - i_213_]) {
		    if (aClass129ArrayArray9515[i_221_][i_222_] != null) {
			Class129 class129
			    = aClass129ArrayArray9515[i_221_][i_222_];
			if (class129.aShort1526 != -1
			    && (class129.aByte1524 & 0x2) == 0
			    && class129.anInt1520 == -1) {
			    int i_223_
				= aClass182_Sub2_9513.method15168((class129
								   .aShort1526)
								  & 0xffff);
			    class128.method2266
				(true, true, false, (float) (i_220_ - i_218_),
				 (float) (i_220_ - i_218_), (float) i_220_,
				 (float) (i_219_ + i_218_), (float) i_219_,
				 (float) (i_219_ + i_218_), 100.0F, 100.0F,
				 100.0F,
				 (float) Class159.method2568(i_223_,
							     ((class129
							       .aShort1525)
							      & 0xffff),
							     594956399),
				 (float) Class159.method2568(i_223_,
							     ((class129
							       .aShort1523)
							      & 0xffff),
							     133739419),
				 (float) Class159.method2568(i_223_,
							     ((class129
							       .aShort1522)
							      & 0xffff),
							     1242795126));
			    class128.method2266
				(true, true, false, (float) i_220_,
				 (float) i_220_, (float) (i_220_ - i_218_),
				 (float) i_219_, (float) (i_219_ + i_218_),
				 (float) i_219_, 100.0F, 100.0F, 100.0F,
				 (float) Class159.method2568(i_223_,
							     ((class129
							       .aShort1521)
							      & 0xffff),
							     -690845405),
				 (float) Class159.method2568(i_223_,
							     ((class129
							       .aShort1522)
							      & 0xffff),
							     16730589),
				 (float) Class159.method2568(i_223_,
							     ((class129
							       .aShort1523)
							      & 0xffff),
							     -411657277));
			} else if (class129.anInt1520 == -1) {
			    class128.method2266
				(true, true, false, (float) (i_220_ - i_218_),
				 (float) (i_220_ - i_218_), (float) i_220_,
				 (float) (i_219_ + i_218_), (float) i_219_,
				 (float) (i_219_ + i_218_), 100.0F, 100.0F,
				 100.0F,
				 (float) (class129.aShort1525 & 0xffff),
				 (float) (class129.aShort1523 & 0xffff),
				 (float) (class129.aShort1522 & 0xffff));
			    class128.method2266
				(true, true, false, (float) i_220_,
				 (float) i_220_, (float) (i_220_ - i_218_),
				 (float) i_219_, (float) (i_219_ + i_218_),
				 (float) i_219_, 100.0F, 100.0F, 100.0F,
				 (float) (class129.aShort1521 & 0xffff),
				 (float) (class129.aShort1522 & 0xffff),
				 (float) (class129.aShort1523 & 0xffff));
			} else {
			    int i_224_ = class129.anInt1520;
			    class128.method2266(true, true, false,
						(float) (i_220_ - i_218_),
						(float) (i_220_ - i_218_),
						(float) i_220_,
						(float) (i_219_ + i_218_),
						(float) i_219_,
						(float) (i_219_ + i_218_),
						100.0F, 100.0F, 100.0F,
						(float) i_224_, (float) i_224_,
						(float) i_224_);
			    class128.method2266(true, true, false,
						(float) i_220_, (float) i_220_,
						(float) (i_220_ - i_218_),
						(float) i_219_,
						(float) (i_219_ + i_218_),
						(float) i_219_, 100.0F, 100.0F,
						100.0F, (float) i_224_,
						(float) i_224_,
						(float) i_224_);
			}
		    } else if (aClass114ArrayArray9535[i_221_][i_222_]
			       != null) {
			Class114 class114
			    = aClass114ArrayArray9535[i_221_][i_222_];
			for (int i_225_ = 0; i_225_ < class114.aShort1393;
			     i_225_++) {
			    fs[i_225_]
				= (float) (i_219_
					   + (class114.aShortArray1395[i_225_]
					      * i_218_
					      / (anInt1761 * 435863595)));
			    fs_216_[i_225_]
				= (float) (i_220_
					   - (class114.aShortArray1398[i_225_]
					      * i_218_
					      / (anInt1761 * 435863595)));
			}
			for (int i_226_ = 0; i_226_ < class114.aShort1396;
			     i_226_++) {
			    short i_227_ = class114.aShortArray1399[i_226_];
			    short i_228_ = class114.aShortArray1400[i_226_];
			    short i_229_ = class114.aShortArray1401[i_226_];
			    float f = fs[i_227_];
			    float f_230_ = fs[i_228_];
			    float f_231_ = fs[i_229_];
			    float f_232_ = fs_216_[i_227_];
			    float f_233_ = fs_216_[i_228_];
			    float f_234_ = fs_216_[i_229_];
			    if (class114.anIntArray1405 != null
				&& class114.anIntArray1405[i_226_] != -1) {
				int i_235_ = class114.anIntArray1405[i_226_];
				class128.method2266
				    (true, true, false, f_232_, f_233_, f_234_,
				     f, f_230_, f_231_, 100.0F, 100.0F, 100.0F,
				     (float) (Class159.method2568
					      (i_235_,
					       (class114.aShortArray1403
						[i_227_]),
					       811171553)),
				     (float) (Class159.method2568
					      (i_235_,
					       (class114.aShortArray1403
						[i_228_]),
					       836055844)),
				     (float) (Class159.method2568
					      (i_235_,
					       (class114.aShortArray1403
						[i_229_]),
					       -643694380)));
			    } else if (class114.aShortArray1402 != null
				       && (class114.aShortArray1402[i_226_]
					   != -1)) {
				int i_236_ = (aClass182_Sub2_9513.method15168
					      (class114.aShortArray1402[i_226_]
					       & 0xffff));
				class128.method2266
				    (true, true, false, f_232_, f_233_, f_234_,
				     f, f_230_, f_231_, 100.0F, 100.0F, 100.0F,
				     (float) (Class159.method2568
					      (i_236_,
					       (class114.aShortArray1403
						[i_227_]),
					       306713130)),
				     (float) (Class159.method2568
					      (i_236_,
					       (class114.aShortArray1403
						[i_228_]),
					       952941746)),
				     (float) (Class159.method2568
					      (i_236_,
					       (class114.aShortArray1403
						[i_229_]),
					       454248973)));
			    } else {
				int i_237_ = class114.anIntArray1392[i_226_];
				class128.method2266
				    (true, true, false, f_232_, f_233_, f_234_,
				     f, f_230_, f_231_, 100.0F, 100.0F, 100.0F,
				     (float) (Class159.method2568
					      (i_237_,
					       (class114.aShortArray1403
						[i_227_]),
					       542566578)),
				     (float) (Class159.method2568
					      (i_237_,
					       (class114.aShortArray1403
						[i_228_]),
					       -2096746908)),
				     (float) (Class159.method2568
					      (i_237_,
					       (class114.aShortArray1403
						[i_229_]),
					       1758707411)));
			    }
			}
		    }
		}
		i_220_ -= i_218_;
	    }
	    i_220_ = i_210_ + i_217_;
	    i_219_ += i_218_;
	}
	class128.aBool1482 = true;
	aClass182_Sub2_9513.method3235(bool);
    }
    
    public void method2607(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_238_, int i_239_, int i_240_, boolean bool) {
	/* empty */
    }
    
    public void method2610(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_241_, int i_242_, int i_243_, boolean bool) {
	/* empty */
    }
    
    public void method2586(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_244_, int i_245_, int i_246_, boolean bool) {
	/* empty */
    }
    
    public boolean method2615(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_247_, int i_248_, int i_249_,
			      boolean bool) {
	return false;
    }
    
    public void method2575(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_250_, int i_251_, int i_252_, boolean bool) {
	/* empty */
    }
    
    public Class525_Sub16_Sub17 method2601
	(int i, int i_253_, Class525_Sub16_Sub17 class525_sub16_sub17) {
	return null;
    }
    
    public void method2604(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_254_, int i_255_, int i_256_, boolean bool) {
	/* empty */
    }
    
    public void method2587(int i, int i_257_, int i_258_) {
	i = Math.min(aByteArrayArray9525.length - 1, Math.max(0, i));
	i_257_
	    = Math.min(aByteArrayArray9525[i].length - 1, Math.max(0, i_257_));
	if (aByteArrayArray9525[i][i_257_] < i_258_)
	    aByteArrayArray9525[i][i_257_] = (byte) i_258_;
    }
    
    public void method2591(int i, int i_259_, int[] is, int[] is_260_,
			   int[] is_261_, int[] is_262_, int[] is_263_,
			   int[] is_264_, int[] is_265_, int[] is_266_,
			   int[] is_267_, int[] is_268_, int[] is_269_,
			   Class176 class176, boolean bool) {
	if (aClass129ArrayArray9515 == null) {
	    aClass129ArrayArray9515
		= new Class129[anInt1759 * 363736815][anInt1760 * -1152334393];
	    aClass114ArrayArray9535
		= new Class114[anInt1759 * 363736815][anInt1760 * -1152334393];
	} else if (aClass123ArrayArray9517 != null
		   || aClass134ArrayArray9519 != null)
	    throw new IllegalStateException();
	boolean bool_270_ = false;
	if (is_266_.length == 2 && is_263_.length == 2
	    && (is_266_[0] == is_266_[1]
		|| is_268_[0] != -1 && is_268_[0] == is_268_[1])) {
	    bool_270_ = true;
	    for (int i_271_ = 1; i_271_ < 2; i_271_++) {
		int i_272_ = is[is_263_[i_271_]];
		int i_273_ = is_261_[is_263_[i_271_]];
		if (i_272_ != 0 && i_272_ != anInt1761 * 435863595
		    || i_273_ != 0 && i_273_ != anInt1761 * 435863595) {
		    bool_270_ = false;
		    break;
		}
	    }
	}
	if (!bool_270_) {
	    Class114 class114 = new Class114();
	    short i_274_ = (short) is.length;
	    int i_275_ = (short) is_266_.length;
	    class114.aShort1393 = i_274_;
	    class114.aShortArray1403 = new short[i_274_];
	    class114.aShortArray1395 = new short[i_274_];
	    class114.aShortArray1397 = new short[i_274_];
	    class114.aShortArray1398 = new short[i_274_];
	    for (int i_276_ = 0; i_276_ < i_274_; i_276_++) {
		int i_277_ = is[i_276_];
		int i_278_ = is_261_[i_276_];
		if (i_277_ == 0 && i_278_ == 0)
		    class114.aShortArray1403[i_276_]
			= (short) (aByteArrayArray9536[i][i_259_]
				   - aByteArrayArray9525[i][i_259_]);
		else if (i_277_ == 0 && i_278_ == anInt1761 * 435863595)
		    class114.aShortArray1403[i_276_]
			= (short) (aByteArrayArray9536[i][i_259_ + 1]
				   - aByteArrayArray9525[i][i_259_ + 1]);
		else if (i_277_ == anInt1761 * 435863595
			 && i_278_ == anInt1761 * 435863595)
		    class114.aShortArray1403[i_276_]
			= (short) (aByteArrayArray9536[i + 1][i_259_ + 1]
				   - aByteArrayArray9525[i + 1][i_259_ + 1]);
		else if (i_277_ == anInt1761 * 435863595 && i_278_ == 0)
		    class114.aShortArray1403[i_276_]
			= (short) (aByteArrayArray9536[i + 1][i_259_]
				   - aByteArrayArray9525[i + 1][i_259_]);
		else {
		    int i_279_
			= (((aByteArrayArray9536[i][i_259_]
			     - aByteArrayArray9525[i][i_259_])
			    * (anInt1761 * 435863595 - i_277_))
			   + (aByteArrayArray9536[i + 1][i_259_]
			      - aByteArrayArray9525[i + 1][i_259_]) * i_277_);
		    int i_280_ = (((aByteArrayArray9536[i][i_259_ + 1]
				    - aByteArrayArray9525[i][i_259_ + 1])
				   * (anInt1761 * 435863595 - i_277_))
				  + ((aByteArrayArray9536[i + 1][i_259_ + 1]
				      - aByteArrayArray9525[i + 1][i_259_ + 1])
				     * i_277_));
		    class114.aShortArray1403[i_276_]
			= (short) ((i_279_ * (anInt1761 * 435863595 - i_278_)
				    + i_280_ * i_278_)
				   >> anInt1763 * 168112006);
		}
		int i_281_ = (i << anInt1763 * -2063427645) + i_277_;
		int i_282_ = (i_259_ << anInt1763 * -2063427645) + i_278_;
		class114.aShortArray1395[i_276_] = (short) i_277_;
		class114.aShortArray1398[i_276_] = (short) i_278_;
		class114.aShortArray1397[i_276_]
		    = (short) (method2619(i_281_, i_282_, 2085282509)
			       + (is_260_ != null ? is_260_[i_276_] : 0));
		if (class114.aShortArray1403[i_276_] < 2)
		    class114.aShortArray1403[i_276_] = (short) 2;
	    }
	    boolean bool_283_ = false;
	    int i_284_ = 0;
	    for (int i_285_ = 0; i_285_ < i_275_; i_285_++) {
		if (is_266_[i_285_] >= 0
		    || is_267_ != null && is_267_[i_285_] >= 0)
		    i_284_++;
		int i_286_ = is_268_[i_285_];
		if (i_286_ != -1) {
		    TextureMetrics class166 = aClass182_Sub2_9513.aClass180_1944
					    .method3116(i_286_, -1431554601);
		    if (!class166.aBool1819) {
			bool_283_ = true;
			if (method15244(class166.aByte1825)
			    || class166.aByte1805 != 0
			    || class166.aByte1806 != 0)
			    class114.aByte1394 |= 0x4;
		    }
		}
	    }
	    class114.anIntArray1392 = new int[i_284_];
	    if (is_267_ != null)
		class114.anIntArray1405 = new int[i_284_];
	    class114.aShortArray1399 = new short[i_284_];
	    class114.aShortArray1400 = new short[i_284_];
	    class114.aShortArray1401 = new short[i_284_];
	    if (bool_283_) {
		class114.aShortArray1402 = new short[i_284_];
		class114.aShortArray1404 = new short[i_284_];
	    }
	    for (int i_287_ = 0; i_287_ < i_275_; i_287_++) {
		if (is_266_[i_287_] >= 0
		    || is_267_ != null && is_267_[i_287_] >= 0) {
		    if (is_266_[i_287_] >= 0)
			class114.anIntArray1392[class114.aShort1396]
			    = Class504.method8313(is_266_[i_287_], 695693765);
		    else
			class114.anIntArray1392[class114.aShort1396] = -1;
		    if (is_267_ != null) {
			if (is_267_[i_287_] != -1)
			    class114.anIntArray1405[class114.aShort1396]
				= Class504.method8313(is_267_[i_287_],
						      2057441471);
			else
			    class114.anIntArray1405[class114.aShort1396] = -1;
		    }
		    class114.aShortArray1399[class114.aShort1396]
			= (short) is_263_[i_287_];
		    class114.aShortArray1400[class114.aShort1396]
			= (short) is_264_[i_287_];
		    class114.aShortArray1401[class114.aShort1396]
			= (short) is_265_[i_287_];
		    if (bool_283_) {
			if (is_268_[i_287_] != -1
			    && !(aClass182_Sub2_9513.aClass180_1944.method3116
				 (is_268_[i_287_], -1431554601).aBool1819)) {
			    class114.aShortArray1402[class114.aShort1396]
				= (short) is_268_[i_287_];
			    class114.aShortArray1404[class114.aShort1396]
				= (short) is_269_[i_287_];
			} else
			    class114.aShortArray1402[class114.aShort1396]
				= (short) -1;
		    }
		    class114.aShort1396++;
		}
	    }
	    aClass114ArrayArray9535[i][i_259_] = class114;
	} else if (is_266_[0] >= 0 || is_267_ != null && is_267_[0] >= 0) {
	    Class129 class129 = new Class129();
	    int i_288_ = is_266_[0];
	    int i_289_ = is_268_[0];
	    if (is_267_ != null) {
		class129.anInt1520
		    = Class159.method2568(Class504.method8313(is_267_[0],
							      1532376929),
					  (aByteArrayArray9536[i][i_259_]
					   - aByteArrayArray9525[i][i_259_]),
					  2124926707);
		if (i_288_ == -1)
		    class129.aByte1524 |= 0x2;
	    }
	    if ((anIntArrayArray1762[i][i_259_]
		 == anIntArrayArray1762[i + 1][i_259_])
		&& (anIntArrayArray1762[i][i_259_]
		    == anIntArrayArray1762[i + 1][i_259_ + 1])
		&& (anIntArrayArray1762[i][i_259_]
		    == anIntArrayArray1762[i][i_259_ + 1]))
		class129.aByte1524 |= 0x1;
	    TextureMetrics class166 = null;
	    if (i_289_ != -1)
		class166 = aClass182_Sub2_9513.aClass180_1944
			       .method3116(i_289_, -1431554601);
	    if (class166 != null && (class129.aByte1524 & 0x2) == 0
		&& !class166.aBool1819) {
		class129.aShort1521
		    = (short) (aByteArrayArray9536[i][i_259_]
			       - aByteArrayArray9525[i][i_259_]);
		class129.aShort1522
		    = (short) (aByteArrayArray9536[i + 1][i_259_]
			       - aByteArrayArray9525[i + 1][i_259_]);
		class129.aShort1525
		    = (short) (aByteArrayArray9536[i + 1][i_259_ + 1]
			       - aByteArrayArray9525[i + 1][i_259_ + 1]);
		class129.aShort1523
		    = (short) (aByteArrayArray9536[i][i_259_ + 1]
			       - aByteArrayArray9525[i][i_259_ + 1]);
		class129.aShort1526 = (short) i_289_;
		if (method15244(class166.aByte1825) || class166.aByte1805 != 0
		    || class166.aByte1806 != 0)
		    class129.aByte1524 |= 0x4;
	    } else {
		short i_290_ = Class504.method8313(i_288_, 1266564162);
		class129.aShort1521
		    = (short) Class159.method2568(i_290_,
						  ((aByteArrayArray9536[i]
						    [i_259_])
						   - (aByteArrayArray9525[i]
						      [i_259_])),
						  237440114);
		class129.aShort1522
		    = (short) Class159.method2568(i_290_,
						  ((aByteArrayArray9536[i + 1]
						    [i_259_])
						   - (aByteArrayArray9525
						      [i + 1][i_259_])),
						  1326130462);
		class129.aShort1525
		    = (short) Class159.method2568(i_290_,
						  ((aByteArrayArray9536[i + 1]
						    [i_259_ + 1])
						   - (aByteArrayArray9525
						      [i + 1][i_259_ + 1])),
						  1260433657);
		class129.aShort1523
		    = (short) Class159.method2568(i_290_,
						  ((aByteArrayArray9536[i]
						    [i_259_ + 1])
						   - (aByteArrayArray9525[i]
						      [i_259_ + 1])),
						  121761986);
		class129.aShort1526 = (short) -1;
	    }
	    aClass129ArrayArray9515[i][i_259_] = class129;
	}
    }
    
    public void method2592(int i, int i_291_, int[] is, int[] is_292_,
			   int[] is_293_, int[] is_294_, int[] is_295_,
			   int[] is_296_, int[] is_297_, int[] is_298_,
			   int[] is_299_, int[] is_300_, int[] is_301_,
			   Class176 class176, boolean bool) {
	if (aClass129ArrayArray9515 == null) {
	    aClass129ArrayArray9515
		= new Class129[anInt1759 * 363736815][anInt1760 * -1152334393];
	    aClass114ArrayArray9535
		= new Class114[anInt1759 * 363736815][anInt1760 * -1152334393];
	} else if (aClass123ArrayArray9517 != null
		   || aClass134ArrayArray9519 != null)
	    throw new IllegalStateException();
	boolean bool_302_ = false;
	if (is_298_.length == 2 && is_295_.length == 2
	    && (is_298_[0] == is_298_[1]
		|| is_300_[0] != -1 && is_300_[0] == is_300_[1])) {
	    bool_302_ = true;
	    for (int i_303_ = 1; i_303_ < 2; i_303_++) {
		int i_304_ = is[is_295_[i_303_]];
		int i_305_ = is_293_[is_295_[i_303_]];
		if (i_304_ != 0 && i_304_ != anInt1761 * 435863595
		    || i_305_ != 0 && i_305_ != anInt1761 * 435863595) {
		    bool_302_ = false;
		    break;
		}
	    }
	}
	if (!bool_302_) {
	    Class114 class114 = new Class114();
	    short i_306_ = (short) is.length;
	    int i_307_ = (short) is_298_.length;
	    class114.aShort1393 = i_306_;
	    class114.aShortArray1403 = new short[i_306_];
	    class114.aShortArray1395 = new short[i_306_];
	    class114.aShortArray1397 = new short[i_306_];
	    class114.aShortArray1398 = new short[i_306_];
	    for (int i_308_ = 0; i_308_ < i_306_; i_308_++) {
		int i_309_ = is[i_308_];
		int i_310_ = is_293_[i_308_];
		if (i_309_ == 0 && i_310_ == 0)
		    class114.aShortArray1403[i_308_]
			= (short) (aByteArrayArray9536[i][i_291_]
				   - aByteArrayArray9525[i][i_291_]);
		else if (i_309_ == 0 && i_310_ == anInt1761 * 435863595)
		    class114.aShortArray1403[i_308_]
			= (short) (aByteArrayArray9536[i][i_291_ + 1]
				   - aByteArrayArray9525[i][i_291_ + 1]);
		else if (i_309_ == anInt1761 * 435863595
			 && i_310_ == anInt1761 * 435863595)
		    class114.aShortArray1403[i_308_]
			= (short) (aByteArrayArray9536[i + 1][i_291_ + 1]
				   - aByteArrayArray9525[i + 1][i_291_ + 1]);
		else if (i_309_ == anInt1761 * 435863595 && i_310_ == 0)
		    class114.aShortArray1403[i_308_]
			= (short) (aByteArrayArray9536[i + 1][i_291_]
				   - aByteArrayArray9525[i + 1][i_291_]);
		else {
		    int i_311_
			= (((aByteArrayArray9536[i][i_291_]
			     - aByteArrayArray9525[i][i_291_])
			    * (anInt1761 * 435863595 - i_309_))
			   + (aByteArrayArray9536[i + 1][i_291_]
			      - aByteArrayArray9525[i + 1][i_291_]) * i_309_);
		    int i_312_ = (((aByteArrayArray9536[i][i_291_ + 1]
				    - aByteArrayArray9525[i][i_291_ + 1])
				   * (anInt1761 * 435863595 - i_309_))
				  + ((aByteArrayArray9536[i + 1][i_291_ + 1]
				      - aByteArrayArray9525[i + 1][i_291_ + 1])
				     * i_309_));
		    class114.aShortArray1403[i_308_]
			= (short) ((i_311_ * (anInt1761 * 435863595 - i_310_)
				    + i_312_ * i_310_)
				   >> anInt1763 * 168112006);
		}
		int i_313_ = (i << anInt1763 * -2063427645) + i_309_;
		int i_314_ = (i_291_ << anInt1763 * -2063427645) + i_310_;
		class114.aShortArray1395[i_308_] = (short) i_309_;
		class114.aShortArray1398[i_308_] = (short) i_310_;
		class114.aShortArray1397[i_308_]
		    = (short) (method2619(i_313_, i_314_, -1315241379)
			       + (is_292_ != null ? is_292_[i_308_] : 0));
		if (class114.aShortArray1403[i_308_] < 2)
		    class114.aShortArray1403[i_308_] = (short) 2;
	    }
	    boolean bool_315_ = false;
	    int i_316_ = 0;
	    for (int i_317_ = 0; i_317_ < i_307_; i_317_++) {
		if (is_298_[i_317_] >= 0
		    || is_299_ != null && is_299_[i_317_] >= 0)
		    i_316_++;
		int i_318_ = is_300_[i_317_];
		if (i_318_ != -1) {
		    TextureMetrics class166 = aClass182_Sub2_9513.aClass180_1944
					    .method3116(i_318_, -1431554601);
		    if (!class166.aBool1819) {
			bool_315_ = true;
			if (method15244(class166.aByte1825)
			    || class166.aByte1805 != 0
			    || class166.aByte1806 != 0)
			    class114.aByte1394 |= 0x4;
		    }
		}
	    }
	    class114.anIntArray1392 = new int[i_316_];
	    if (is_299_ != null)
		class114.anIntArray1405 = new int[i_316_];
	    class114.aShortArray1399 = new short[i_316_];
	    class114.aShortArray1400 = new short[i_316_];
	    class114.aShortArray1401 = new short[i_316_];
	    if (bool_315_) {
		class114.aShortArray1402 = new short[i_316_];
		class114.aShortArray1404 = new short[i_316_];
	    }
	    for (int i_319_ = 0; i_319_ < i_307_; i_319_++) {
		if (is_298_[i_319_] >= 0
		    || is_299_ != null && is_299_[i_319_] >= 0) {
		    if (is_298_[i_319_] >= 0)
			class114.anIntArray1392[class114.aShort1396]
			    = Class504.method8313(is_298_[i_319_], 1181649496);
		    else
			class114.anIntArray1392[class114.aShort1396] = -1;
		    if (is_299_ != null) {
			if (is_299_[i_319_] != -1)
			    class114.anIntArray1405[class114.aShort1396]
				= Class504.method8313(is_299_[i_319_],
						      984418554);
			else
			    class114.anIntArray1405[class114.aShort1396] = -1;
		    }
		    class114.aShortArray1399[class114.aShort1396]
			= (short) is_295_[i_319_];
		    class114.aShortArray1400[class114.aShort1396]
			= (short) is_296_[i_319_];
		    class114.aShortArray1401[class114.aShort1396]
			= (short) is_297_[i_319_];
		    if (bool_315_) {
			if (is_300_[i_319_] != -1
			    && !(aClass182_Sub2_9513.aClass180_1944.method3116
				 (is_300_[i_319_], -1431554601).aBool1819)) {
			    class114.aShortArray1402[class114.aShort1396]
				= (short) is_300_[i_319_];
			    class114.aShortArray1404[class114.aShort1396]
				= (short) is_301_[i_319_];
			} else
			    class114.aShortArray1402[class114.aShort1396]
				= (short) -1;
		    }
		    class114.aShort1396++;
		}
	    }
	    aClass114ArrayArray9535[i][i_291_] = class114;
	} else if (is_298_[0] >= 0 || is_299_ != null && is_299_[0] >= 0) {
	    Class129 class129 = new Class129();
	    int i_320_ = is_298_[0];
	    int i_321_ = is_300_[0];
	    if (is_299_ != null) {
		class129.anInt1520
		    = Class159.method2568(Class504.method8313(is_299_[0],
							      569121638),
					  (aByteArrayArray9536[i][i_291_]
					   - aByteArrayArray9525[i][i_291_]),
					  -689919854);
		if (i_320_ == -1)
		    class129.aByte1524 |= 0x2;
	    }
	    if ((anIntArrayArray1762[i][i_291_]
		 == anIntArrayArray1762[i + 1][i_291_])
		&& (anIntArrayArray1762[i][i_291_]
		    == anIntArrayArray1762[i + 1][i_291_ + 1])
		&& (anIntArrayArray1762[i][i_291_]
		    == anIntArrayArray1762[i][i_291_ + 1]))
		class129.aByte1524 |= 0x1;
	    TextureMetrics class166 = null;
	    if (i_321_ != -1)
		class166 = aClass182_Sub2_9513.aClass180_1944
			       .method3116(i_321_, -1431554601);
	    if (class166 != null && (class129.aByte1524 & 0x2) == 0
		&& !class166.aBool1819) {
		class129.aShort1521
		    = (short) (aByteArrayArray9536[i][i_291_]
			       - aByteArrayArray9525[i][i_291_]);
		class129.aShort1522
		    = (short) (aByteArrayArray9536[i + 1][i_291_]
			       - aByteArrayArray9525[i + 1][i_291_]);
		class129.aShort1525
		    = (short) (aByteArrayArray9536[i + 1][i_291_ + 1]
			       - aByteArrayArray9525[i + 1][i_291_ + 1]);
		class129.aShort1523
		    = (short) (aByteArrayArray9536[i][i_291_ + 1]
			       - aByteArrayArray9525[i][i_291_ + 1]);
		class129.aShort1526 = (short) i_321_;
		if (method15244(class166.aByte1825) || class166.aByte1805 != 0
		    || class166.aByte1806 != 0)
		    class129.aByte1524 |= 0x4;
	    } else {
		short i_322_ = Class504.method8313(i_320_, 1629657359);
		class129.aShort1521
		    = (short) Class159.method2568(i_322_,
						  ((aByteArrayArray9536[i]
						    [i_291_])
						   - (aByteArrayArray9525[i]
						      [i_291_])),
						  1871379424);
		class129.aShort1522
		    = (short) Class159.method2568(i_322_,
						  ((aByteArrayArray9536[i + 1]
						    [i_291_])
						   - (aByteArrayArray9525
						      [i + 1][i_291_])),
						  1576125311);
		class129.aShort1525
		    = (short) Class159.method2568(i_322_,
						  ((aByteArrayArray9536[i + 1]
						    [i_291_ + 1])
						   - (aByteArrayArray9525
						      [i + 1][i_291_ + 1])),
						  424548182);
		class129.aShort1523
		    = (short) Class159.method2568(i_322_,
						  ((aByteArrayArray9536[i]
						    [i_291_ + 1])
						   - (aByteArrayArray9525[i]
						      [i_291_ + 1])),
						  1901555268);
		class129.aShort1526 = (short) -1;
	    }
	    aClass129ArrayArray9515[i][i_291_] = class129;
	}
    }
    
    public void method2613(int i, int i_323_, int[] is, int[] is_324_,
			   int[] is_325_, int[] is_326_, int[] is_327_,
			   int[] is_328_, int[] is_329_, int[] is_330_,
			   int[] is_331_, int[] is_332_, int[] is_333_,
			   Class176 class176, boolean bool) {
	if (aClass129ArrayArray9515 == null) {
	    aClass129ArrayArray9515
		= new Class129[anInt1759 * 363736815][anInt1760 * -1152334393];
	    aClass114ArrayArray9535
		= new Class114[anInt1759 * 363736815][anInt1760 * -1152334393];
	} else if (aClass123ArrayArray9517 != null
		   || aClass134ArrayArray9519 != null)
	    throw new IllegalStateException();
	boolean bool_334_ = false;
	if (is_330_.length == 2 && is_327_.length == 2
	    && (is_330_[0] == is_330_[1]
		|| is_332_[0] != -1 && is_332_[0] == is_332_[1])) {
	    bool_334_ = true;
	    for (int i_335_ = 1; i_335_ < 2; i_335_++) {
		int i_336_ = is[is_327_[i_335_]];
		int i_337_ = is_325_[is_327_[i_335_]];
		if (i_336_ != 0 && i_336_ != anInt1761 * 435863595
		    || i_337_ != 0 && i_337_ != anInt1761 * 435863595) {
		    bool_334_ = false;
		    break;
		}
	    }
	}
	if (!bool_334_) {
	    Class114 class114 = new Class114();
	    short i_338_ = (short) is.length;
	    int i_339_ = (short) is_330_.length;
	    class114.aShort1393 = i_338_;
	    class114.aShortArray1403 = new short[i_338_];
	    class114.aShortArray1395 = new short[i_338_];
	    class114.aShortArray1397 = new short[i_338_];
	    class114.aShortArray1398 = new short[i_338_];
	    for (int i_340_ = 0; i_340_ < i_338_; i_340_++) {
		int i_341_ = is[i_340_];
		int i_342_ = is_325_[i_340_];
		if (i_341_ == 0 && i_342_ == 0)
		    class114.aShortArray1403[i_340_]
			= (short) (aByteArrayArray9536[i][i_323_]
				   - aByteArrayArray9525[i][i_323_]);
		else if (i_341_ == 0 && i_342_ == anInt1761 * 435863595)
		    class114.aShortArray1403[i_340_]
			= (short) (aByteArrayArray9536[i][i_323_ + 1]
				   - aByteArrayArray9525[i][i_323_ + 1]);
		else if (i_341_ == anInt1761 * 435863595
			 && i_342_ == anInt1761 * 435863595)
		    class114.aShortArray1403[i_340_]
			= (short) (aByteArrayArray9536[i + 1][i_323_ + 1]
				   - aByteArrayArray9525[i + 1][i_323_ + 1]);
		else if (i_341_ == anInt1761 * 435863595 && i_342_ == 0)
		    class114.aShortArray1403[i_340_]
			= (short) (aByteArrayArray9536[i + 1][i_323_]
				   - aByteArrayArray9525[i + 1][i_323_]);
		else {
		    int i_343_
			= (((aByteArrayArray9536[i][i_323_]
			     - aByteArrayArray9525[i][i_323_])
			    * (anInt1761 * 435863595 - i_341_))
			   + (aByteArrayArray9536[i + 1][i_323_]
			      - aByteArrayArray9525[i + 1][i_323_]) * i_341_);
		    int i_344_ = (((aByteArrayArray9536[i][i_323_ + 1]
				    - aByteArrayArray9525[i][i_323_ + 1])
				   * (anInt1761 * 435863595 - i_341_))
				  + ((aByteArrayArray9536[i + 1][i_323_ + 1]
				      - aByteArrayArray9525[i + 1][i_323_ + 1])
				     * i_341_));
		    class114.aShortArray1403[i_340_]
			= (short) ((i_343_ * (anInt1761 * 435863595 - i_342_)
				    + i_344_ * i_342_)
				   >> anInt1763 * 168112006);
		}
		int i_345_ = (i << anInt1763 * -2063427645) + i_341_;
		int i_346_ = (i_323_ << anInt1763 * -2063427645) + i_342_;
		class114.aShortArray1395[i_340_] = (short) i_341_;
		class114.aShortArray1398[i_340_] = (short) i_342_;
		class114.aShortArray1397[i_340_]
		    = (short) (method2619(i_345_, i_346_, 1464242633)
			       + (is_324_ != null ? is_324_[i_340_] : 0));
		if (class114.aShortArray1403[i_340_] < 2)
		    class114.aShortArray1403[i_340_] = (short) 2;
	    }
	    boolean bool_347_ = false;
	    int i_348_ = 0;
	    for (int i_349_ = 0; i_349_ < i_339_; i_349_++) {
		if (is_330_[i_349_] >= 0
		    || is_331_ != null && is_331_[i_349_] >= 0)
		    i_348_++;
		int i_350_ = is_332_[i_349_];
		if (i_350_ != -1) {
		    TextureMetrics class166 = aClass182_Sub2_9513.aClass180_1944
					    .method3116(i_350_, -1431554601);
		    if (!class166.aBool1819) {
			bool_347_ = true;
			if (method15244(class166.aByte1825)
			    || class166.aByte1805 != 0
			    || class166.aByte1806 != 0)
			    class114.aByte1394 |= 0x4;
		    }
		}
	    }
	    class114.anIntArray1392 = new int[i_348_];
	    if (is_331_ != null)
		class114.anIntArray1405 = new int[i_348_];
	    class114.aShortArray1399 = new short[i_348_];
	    class114.aShortArray1400 = new short[i_348_];
	    class114.aShortArray1401 = new short[i_348_];
	    if (bool_347_) {
		class114.aShortArray1402 = new short[i_348_];
		class114.aShortArray1404 = new short[i_348_];
	    }
	    for (int i_351_ = 0; i_351_ < i_339_; i_351_++) {
		if (is_330_[i_351_] >= 0
		    || is_331_ != null && is_331_[i_351_] >= 0) {
		    if (is_330_[i_351_] >= 0)
			class114.anIntArray1392[class114.aShort1396]
			    = Class504.method8313(is_330_[i_351_], 836861447);
		    else
			class114.anIntArray1392[class114.aShort1396] = -1;
		    if (is_331_ != null) {
			if (is_331_[i_351_] != -1)
			    class114.anIntArray1405[class114.aShort1396]
				= Class504.method8313(is_331_[i_351_],
						      1100611563);
			else
			    class114.anIntArray1405[class114.aShort1396] = -1;
		    }
		    class114.aShortArray1399[class114.aShort1396]
			= (short) is_327_[i_351_];
		    class114.aShortArray1400[class114.aShort1396]
			= (short) is_328_[i_351_];
		    class114.aShortArray1401[class114.aShort1396]
			= (short) is_329_[i_351_];
		    if (bool_347_) {
			if (is_332_[i_351_] != -1
			    && !(aClass182_Sub2_9513.aClass180_1944.method3116
				 (is_332_[i_351_], -1431554601).aBool1819)) {
			    class114.aShortArray1402[class114.aShort1396]
				= (short) is_332_[i_351_];
			    class114.aShortArray1404[class114.aShort1396]
				= (short) is_333_[i_351_];
			} else
			    class114.aShortArray1402[class114.aShort1396]
				= (short) -1;
		    }
		    class114.aShort1396++;
		}
	    }
	    aClass114ArrayArray9535[i][i_323_] = class114;
	} else if (is_330_[0] >= 0 || is_331_ != null && is_331_[0] >= 0) {
	    Class129 class129 = new Class129();
	    int i_352_ = is_330_[0];
	    int i_353_ = is_332_[0];
	    if (is_331_ != null) {
		class129.anInt1520
		    = Class159.method2568(Class504.method8313(is_331_[0],
							      1573292457),
					  (aByteArrayArray9536[i][i_323_]
					   - aByteArrayArray9525[i][i_323_]),
					  -253360138);
		if (i_352_ == -1)
		    class129.aByte1524 |= 0x2;
	    }
	    if ((anIntArrayArray1762[i][i_323_]
		 == anIntArrayArray1762[i + 1][i_323_])
		&& (anIntArrayArray1762[i][i_323_]
		    == anIntArrayArray1762[i + 1][i_323_ + 1])
		&& (anIntArrayArray1762[i][i_323_]
		    == anIntArrayArray1762[i][i_323_ + 1]))
		class129.aByte1524 |= 0x1;
	    TextureMetrics class166 = null;
	    if (i_353_ != -1)
		class166 = aClass182_Sub2_9513.aClass180_1944
			       .method3116(i_353_, -1431554601);
	    if (class166 != null && (class129.aByte1524 & 0x2) == 0
		&& !class166.aBool1819) {
		class129.aShort1521
		    = (short) (aByteArrayArray9536[i][i_323_]
			       - aByteArrayArray9525[i][i_323_]);
		class129.aShort1522
		    = (short) (aByteArrayArray9536[i + 1][i_323_]
			       - aByteArrayArray9525[i + 1][i_323_]);
		class129.aShort1525
		    = (short) (aByteArrayArray9536[i + 1][i_323_ + 1]
			       - aByteArrayArray9525[i + 1][i_323_ + 1]);
		class129.aShort1523
		    = (short) (aByteArrayArray9536[i][i_323_ + 1]
			       - aByteArrayArray9525[i][i_323_ + 1]);
		class129.aShort1526 = (short) i_353_;
		if (method15244(class166.aByte1825) || class166.aByte1805 != 0
		    || class166.aByte1806 != 0)
		    class129.aByte1524 |= 0x4;
	    } else {
		short i_354_ = Class504.method8313(i_352_, 2099559301);
		class129.aShort1521
		    = (short) Class159.method2568(i_354_,
						  ((aByteArrayArray9536[i]
						    [i_323_])
						   - (aByteArrayArray9525[i]
						      [i_323_])),
						  1537379648);
		class129.aShort1522
		    = (short) Class159.method2568(i_354_,
						  ((aByteArrayArray9536[i + 1]
						    [i_323_])
						   - (aByteArrayArray9525
						      [i + 1][i_323_])),
						  163722388);
		class129.aShort1525
		    = (short) Class159.method2568(i_354_,
						  ((aByteArrayArray9536[i + 1]
						    [i_323_ + 1])
						   - (aByteArrayArray9525
						      [i + 1][i_323_ + 1])),
						  -1316060866);
		class129.aShort1523
		    = (short) Class159.method2568(i_354_,
						  ((aByteArrayArray9536[i]
						    [i_323_ + 1])
						   - (aByteArrayArray9525[i]
						      [i_323_ + 1])),
						  117122319);
		class129.aShort1526 = (short) -1;
	    }
	    aClass129ArrayArray9515[i][i_323_] = class129;
	}
    }
    
    static int method15246(int i, int i_355_) {
	int i_356_ = (i & 0xff0000) * i_355_ >> 23;
	if (i_356_ < 2)
	    i_356_ = 2;
	else if (i_356_ > 253)
	    i_356_ = 253;
	int i_357_ = (i & 0xff00) * i_355_ >> 15;
	if (i_357_ < 2)
	    i_357_ = 2;
	else if (i_357_ > 253)
	    i_357_ = 253;
	int i_358_ = (i & 0xff) * i_355_ >> 7;
	if (i_358_ < 2)
	    i_358_ = 2;
	else if (i_358_ > 253)
	    i_358_ = 253;
	return i_356_ << 16 | i_357_ << 8 | i_358_;
    }
    
    static int method15247(int i, int i_359_) {
	int i_360_ = (i & 0xff0000) * i_359_ >> 23;
	if (i_360_ < 2)
	    i_360_ = 2;
	else if (i_360_ > 253)
	    i_360_ = 253;
	int i_361_ = (i & 0xff00) * i_359_ >> 15;
	if (i_361_ < 2)
	    i_361_ = 2;
	else if (i_361_ > 253)
	    i_361_ = 253;
	int i_362_ = (i & 0xff) * i_359_ >> 7;
	if (i_362_ < 2)
	    i_362_ = 2;
	else if (i_362_ > 253)
	    i_362_ = 253;
	return i_360_ << 16 | i_361_ << 8 | i_362_;
    }
    
    static int method15248(int i, int i_363_) {
	int i_364_ = (i & 0xff0000) * i_363_ >> 23;
	if (i_364_ < 2)
	    i_364_ = 2;
	else if (i_364_ > 253)
	    i_364_ = 253;
	int i_365_ = (i & 0xff00) * i_363_ >> 15;
	if (i_365_ < 2)
	    i_365_ = 2;
	else if (i_365_ > 253)
	    i_365_ = 253;
	int i_366_ = (i & 0xff) * i_363_ >> 7;
	if (i_366_ < 2)
	    i_366_ = 2;
	else if (i_366_ > 253)
	    i_366_ = 253;
	return i_364_ << 16 | i_365_ << 8 | i_366_;
    }
    
    public void method2594() {
	aByteArrayArray9536 = null;
	aByteArrayArray9525 = null;
    }
    
    public void method2600() {
	aByteArrayArray9536 = null;
	aByteArrayArray9525 = null;
    }
    
    public void method2583() {
	aByteArrayArray9536 = null;
	aByteArrayArray9525 = null;
    }
    
    public void method2614(Class525_Sub21 class525_sub21, int[] is) {
	/* empty */
    }
    
    public void method2589(Class525_Sub21 class525_sub21, int[] is) {
	/* empty */
    }
    
    boolean method15249(int i) {
	if ((anInt9514 & 0x8) == 0)
	    return false;
	if (i == 4)
	    return true;
	if (i == 8)
	    return true;
	if (i == 9)
	    return true;
	return false;
    }
    
    void method15250(int i, int i_367_, int i_368_) {
	Class110 class110
	    = aClass182_Sub2_9513.method15223(Thread.currentThread());
	class110.aClass128_1338.anInt1486 = 0;
	if (aClass123ArrayArray9517 != null)
	    method15263(i, i_367_, class110.aBool1332, class110,
			class110.aClass128_1338, class110.aFloatArray1364,
			class110.aFloatArray1365, class110.aFloatArray1366,
			class110.aFloatArray1367, class110.aFloatArray1339,
			i_368_);
	else if (aClass129ArrayArray9515 != null)
	    method15243(i, i_367_, class110.aClass128_1338,
			class110.aFloatArray1364, class110.aFloatArray1365,
			class110.aFloatArray1366, class110.aFloatArray1367,
			class110.aFloatArray1339, i_368_);
	else if (aClass134ArrayArray9519 != null)
	    method15268(i, i_367_, class110.aBool1332, class110,
			class110.aClass128_1338, class110.aFloatArray1364,
			class110.aFloatArray1365, class110.aFloatArray1366,
			class110.aFloatArray1367, class110.aFloatArray1339,
			i_368_);
    }
    
    Class161_Sub2(Class182_Sub2 class182_sub2, int i, int i_369_, int i_370_,
		  int i_371_, int[][] is, int[][] is_372_, int i_373_) {
	super(i_370_, i_371_, i_373_, is);
	aClass182_Sub2_9513 = class182_sub2;
	anInt9514 = i_369_;
	aByteArrayArray9536 = new byte[i_370_ + 1][i_371_ + 1];
	int i_374_ = aClass182_Sub2_9513.anInt9479 * -722712849 >> 9;
	for (int i_375_ = 1; i_375_ < i_371_; i_375_++) {
	    for (int i_376_ = 1; i_376_ < i_370_; i_376_++) {
		int i_377_ = i_374_;
		int i_378_ = (is_372_[i_376_ + 1][i_375_]
			      - is_372_[i_376_ - 1][i_375_]);
		int i_379_ = (is_372_[i_376_][i_375_ + 1]
			      - is_372_[i_376_][i_375_ - 1]);
		int i_380_
		    = (int) Math.sqrt((double) (i_378_ * i_378_ + 512 * i_373_
						+ i_379_ * i_379_));
		int i_381_ = (i_378_ << 8) / i_380_;
		int i_382_ = -512 * i_373_ / i_380_;
		int i_383_ = (i_379_ << 8) / i_380_;
		i_377_
		    += (aClass182_Sub2_9513.anInt9474 * -1893445829 * i_381_
			+ aClass182_Sub2_9513.anInt9475 * -1615993337 * i_382_
			+ (aClass182_Sub2_9513.anInt9468 * -1138625233
			   * i_383_)) >> 17;
		i_377_ >>= 1;
		if (i_377_ < 2)
		    i_377_ = 2;
		else if (i_377_ > 126)
		    i_377_ = 126;
		aByteArrayArray9536[i_376_][i_375_] = (byte) i_377_;
	    }
	}
	aByteArrayArray9525 = new byte[i_370_ + 1][i_371_ + 1];
    }
    
    void method15251(int i, int i_384_, int i_385_) {
	Class110 class110
	    = aClass182_Sub2_9513.method15223(Thread.currentThread());
	class110.aClass128_1338.anInt1486 = 0;
	if (aClass123ArrayArray9517 != null)
	    method15263(i, i_384_, class110.aBool1332, class110,
			class110.aClass128_1338, class110.aFloatArray1364,
			class110.aFloatArray1365, class110.aFloatArray1366,
			class110.aFloatArray1367, class110.aFloatArray1339,
			i_385_);
	else if (aClass129ArrayArray9515 != null)
	    method15243(i, i_384_, class110.aClass128_1338,
			class110.aFloatArray1364, class110.aFloatArray1365,
			class110.aFloatArray1366, class110.aFloatArray1367,
			class110.aFloatArray1339, i_385_);
	else if (aClass134ArrayArray9519 != null)
	    method15268(i, i_384_, class110.aBool1332, class110,
			class110.aClass128_1338, class110.aFloatArray1364,
			class110.aFloatArray1365, class110.aFloatArray1366,
			class110.aFloatArray1367, class110.aFloatArray1339,
			i_385_);
    }
    
    void method15252(int i, int i_386_, boolean bool, Class110 class110,
		     Class128 class128, float[] fs, float[] fs_387_,
		     float[] fs_388_, float[] fs_389_, float[] fs_390_,
		     int i_391_) {
	Class123 class123 = aClass123ArrayArray9517[i][i_386_];
	if (class123 != null) {
	    if ((class123.aByte1451 & 0x2) == 0) {
		if (i_391_ != 0) {
		    if ((class123.aByte1451 & 0x4) != 0) {
			if ((i_391_ & 0x1) != 0)
			    return;
		    } else if ((i_391_ & 0x2) != 0)
			return;
		}
		int i_392_ = i * (anInt1761 * 435863595);
		int i_393_ = i_392_ + anInt1761 * 435863595;
		int i_394_ = i_386_ * (anInt1761 * 435863595);
		int i_395_ = i_394_ + anInt1761 * 435863595;
		float f = 0.0F;
		float f_396_ = 0.0F;
		float f_397_ = 0.0F;
		float f_398_ = 0.0F;
		float f_399_;
		float f_400_;
		float f_401_;
		float f_402_;
		float f_403_;
		float f_404_;
		float f_405_;
		float f_406_;
		float f_407_;
		float f_408_;
		float f_409_;
		float f_410_;
		float f_411_;
		float f_412_;
		float f_413_;
		float f_414_;
		if ((class123.aByte1451 & 0x1) != 0 && !bool) {
		    int i_415_ = anIntArrayArray1762[i][i_386_];
		    float f_416_ = aFloat9530 * (float) i_415_;
		    float f_417_ = aFloat9526 * (float) i_415_;
		    float f_418_
			= aFloat9534 + (aFloat9531 * (float) i_392_ + f_416_
					+ aFloat9518 * (float) i_394_);
		    f_399_ = aFloat9527 + (aFloat9523 * (float) i_392_ + f_417_
					   + aFloat9528 * (float) i_394_);
		    if (f_418_ < -f_399_)
			return;
		    float f_419_
			= aFloat9534 + (aFloat9531 * (float) i_393_ + f_416_
					+ aFloat9518 * (float) i_394_);
		    f_400_ = aFloat9527 + (aFloat9523 * (float) i_393_ + f_417_
					   + aFloat9528 * (float) i_394_);
		    if (f_419_ < -f_400_)
			return;
		    float f_420_
			= aFloat9534 + (aFloat9531 * (float) i_393_ + f_416_
					+ aFloat9518 * (float) i_395_);
		    f_401_ = aFloat9527 + (aFloat9523 * (float) i_393_ + f_417_
					   + aFloat9528 * (float) i_395_);
		    if (f_420_ < -f_401_)
			return;
		    float f_421_
			= aFloat9534 + (aFloat9531 * (float) i_392_ + f_416_
					+ aFloat9518 * (float) i_395_);
		    f_402_ = aFloat9527 + (aFloat9523 * (float) i_392_ + f_417_
					   + aFloat9528 * (float) i_395_);
		    if (f_421_ < -f_402_)
			return;
		    f_403_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_418_ / f_399_);
		    f_404_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_419_ / f_400_);
		    f_405_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_420_ / f_401_);
		    f_406_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_421_ / f_402_);
		    if (class110.aBool1369) {
			float f_422_ = f_418_ - class110.aFloat1328;
			if (f_422_ > 0.0F) {
			    f = f_422_ / class110.aFloat1329;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_422_ = f_419_ - class110.aFloat1328;
			if (f_422_ > 0.0F) {
			    f_396_ = f_422_ / class110.aFloat1329;
			    if (f_396_ > 1.0F)
				f_396_ = 1.0F;
			}
			f_422_ = f_420_ - class110.aFloat1328;
			if (f_422_ > 0.0F) {
			    f_397_ = f_422_ / class110.aFloat1329;
			    if (f_397_ > 1.0F)
				f_397_ = 1.0F;
			}
			f_422_ = f_421_ - class110.aFloat1328;
			if (f_422_ > 0.0F) {
			    f_398_ = f_422_ / class110.aFloat1329;
			    if (f_398_ > 1.0F)
				f_398_ = 1.0F;
			}
		    }
		    float f_423_ = aFloat9537 * (float) i_415_;
		    float f_424_ = aFloat9508 * (float) i_415_;
		    float f_425_
			= aFloat9532 + (aFloat9520 * (float) i_392_ + f_423_
					+ aFloat9522 * (float) i_394_);
		    f_407_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_425_ / f_399_);
		    float f_426_
			= aFloat9529 + (aFloat9521 * (float) i_392_ + f_424_
					+ aFloat9510 * (float) i_394_);
		    f_408_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_426_ / f_399_);
		    float f_427_
			= aFloat9532 + (aFloat9520 * (float) i_393_ + f_423_
					+ aFloat9522 * (float) i_394_);
		    f_409_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_427_ / f_400_);
		    float f_428_
			= aFloat9529 + (aFloat9521 * (float) i_393_ + f_424_
					+ aFloat9510 * (float) i_394_);
		    f_410_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_428_ / f_400_);
		    float f_429_
			= aFloat9532 + (aFloat9520 * (float) i_393_ + f_423_
					+ aFloat9522 * (float) i_395_);
		    f_411_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_429_ / f_401_);
		    float f_430_
			= aFloat9529 + (aFloat9521 * (float) i_393_ + f_424_
					+ aFloat9510 * (float) i_395_);
		    f_412_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_430_ / f_401_);
		    float f_431_
			= aFloat9532 + (aFloat9520 * (float) i_392_ + f_423_
					+ aFloat9522 * (float) i_395_);
		    f_413_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_431_ / f_402_);
		    float f_432_
			= aFloat9529 + (aFloat9521 * (float) i_392_ + f_424_
					+ aFloat9510 * (float) i_395_);
		    f_414_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_432_ / f_402_);
		} else {
		    int i_433_ = anIntArrayArray1762[i][i_386_];
		    int i_434_ = anIntArrayArray1762[i + 1][i_386_];
		    int i_435_ = anIntArrayArray1762[i + 1][i_386_ + 1];
		    int i_436_ = anIntArrayArray1762[i][i_386_ + 1];
		    float f_437_
			= aFloat9534 + (aFloat9531 * (float) i_392_
					+ aFloat9530 * (float) i_433_
					+ aFloat9518 * (float) i_394_);
		    f_399_ = aFloat9527 + (aFloat9523 * (float) i_392_
					   + aFloat9526 * (float) i_433_
					   + aFloat9528 * (float) i_394_);
		    if (f_437_ < -f_399_)
			return;
		    float f_438_
			= aFloat9534 + (aFloat9531 * (float) i_393_
					+ aFloat9530 * (float) i_434_
					+ aFloat9518 * (float) i_394_);
		    f_400_ = aFloat9527 + (aFloat9523 * (float) i_393_
					   + aFloat9526 * (float) i_434_
					   + aFloat9528 * (float) i_394_);
		    if (f_438_ < -f_400_)
			return;
		    float f_439_
			= aFloat9534 + (aFloat9531 * (float) i_393_
					+ aFloat9530 * (float) i_435_
					+ aFloat9518 * (float) i_395_);
		    f_401_ = aFloat9527 + (aFloat9523 * (float) i_393_
					   + aFloat9526 * (float) i_435_
					   + aFloat9528 * (float) i_395_);
		    if (f_439_ < -f_401_)
			return;
		    float f_440_
			= aFloat9534 + (aFloat9531 * (float) i_392_
					+ aFloat9530 * (float) i_436_
					+ aFloat9518 * (float) i_395_);
		    f_402_ = aFloat9527 + (aFloat9523 * (float) i_392_
					   + aFloat9526 * (float) i_436_
					   + aFloat9528 * (float) i_395_);
		    if (f_440_ < -f_402_)
			return;
		    f_403_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_437_ / f_399_);
		    f_404_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_438_ / f_400_);
		    f_405_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_439_ / f_401_);
		    f_406_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_440_ / f_402_);
		    if (bool) {
			float f_441_ = f_437_ - class110.aFloat1328;
			if (f_441_ > 0.0F) {
			    f_441_ /= class110.aFloat1329;
			    if (f_441_ > 1.0F)
				f_441_ = 1.0F;
			    f = f_441_;
			    int i_442_
				= (int) ((float) class123.aShort1449 * f_441_);
			    if (i_442_ > 0)
				i_433_ -= i_442_;
			}
			f_441_ = f_438_ - class110.aFloat1328;
			if (f_441_ > 0.0F) {
			    f_441_ /= class110.aFloat1329;
			    if (f_441_ > 1.0F)
				f_441_ = 1.0F;
			    f_396_ = f_441_;
			    int i_443_
				= (int) ((float) class123.aShort1452 * f_441_);
			    if (i_443_ > 0)
				i_434_ -= i_443_;
			}
			f_441_ = f_439_ - class110.aFloat1328;
			if (f_441_ > 0.0F) {
			    f_441_ /= class110.aFloat1329;
			    if (f_441_ > 1.0F)
				f_441_ = 1.0F;
			    f_397_ = f_441_;
			    int i_444_
				= (int) ((float) class123.aShort1448 * f_441_);
			    if (i_444_ > 0)
				i_435_ -= i_444_;
			}
			f_441_ = f_440_ - class110.aFloat1328;
			if (f_441_ > 0.0F) {
			    f_441_ /= class110.aFloat1329;
			    if (f_441_ > 1.0F)
				f_441_ = 1.0F;
			    f_398_ = f_441_;
			    int i_445_
				= (int) ((float) class123.aShort1454 * f_441_);
			    if (i_445_ > 0)
				i_436_ -= i_445_;
			}
		    } else if (class110.aBool1369) {
			float f_446_ = f_437_ - class110.aFloat1328;
			if (f_446_ > 0.0F) {
			    f = f_446_ / class110.aFloat1329;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_446_ = f_438_ - class110.aFloat1328;
			if (f_446_ > 0.0F) {
			    f_396_ = f_446_ / class110.aFloat1329;
			    if (f_396_ > 1.0F)
				f_396_ = 1.0F;
			}
			f_446_ = f_439_ - class110.aFloat1328;
			if (f_446_ > 0.0F) {
			    f_397_ = f_446_ / class110.aFloat1329;
			    if (f_397_ > 1.0F)
				f_397_ = 1.0F;
			}
			f_446_ = f_440_ - class110.aFloat1328;
			if (f_446_ > 0.0F) {
			    f_398_ = f_446_ / class110.aFloat1329;
			    if (f_398_ > 1.0F)
				f_398_ = 1.0F;
			}
		    }
		    float f_447_
			= aFloat9532 + (aFloat9520 * (float) i_392_
					+ aFloat9537 * (float) i_433_
					+ aFloat9522 * (float) i_394_);
		    f_407_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_447_ / f_399_);
		    float f_448_
			= aFloat9529 + (aFloat9521 * (float) i_392_
					+ aFloat9508 * (float) i_433_
					+ aFloat9510 * (float) i_394_);
		    f_408_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_448_ / f_399_);
		    float f_449_
			= aFloat9532 + (aFloat9520 * (float) i_393_
					+ aFloat9537 * (float) i_434_
					+ aFloat9522 * (float) i_394_);
		    f_409_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_449_ / f_400_);
		    float f_450_
			= aFloat9529 + (aFloat9521 * (float) i_393_
					+ aFloat9508 * (float) i_434_
					+ aFloat9510 * (float) i_394_);
		    f_410_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_450_ / f_400_);
		    float f_451_
			= aFloat9532 + (aFloat9520 * (float) i_393_
					+ aFloat9537 * (float) i_435_
					+ aFloat9522 * (float) i_395_);
		    f_411_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_451_ / f_401_);
		    float f_452_
			= aFloat9529 + (aFloat9521 * (float) i_393_
					+ aFloat9508 * (float) i_435_
					+ aFloat9510 * (float) i_395_);
		    f_412_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_452_ / f_401_);
		    float f_453_
			= aFloat9532 + (aFloat9520 * (float) i_392_
					+ aFloat9537 * (float) i_436_
					+ aFloat9522 * (float) i_395_);
		    f_413_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_453_ / f_402_);
		    float f_454_
			= aFloat9529 + (aFloat9521 * (float) i_392_
					+ aFloat9508 * (float) i_436_
					+ aFloat9510 * (float) i_395_);
		    f_414_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_454_ / f_402_);
		}
		TextureMetrics class166 = null;
		boolean bool_455_ = false;
		if (class123.aShort1456 != -1) {
		    class166 = (aClass182_Sub2_9513.aClass180_1944.method3116
				(class123.aShort1456 & 0xffff, -1431554601));
		    bool_455_ = class166.aBool1801;
		}
		boolean bool_456_
		    = class166 != null && method15244(class166.aByte1825);
		float f_457_ = f_396_ + f_397_ + f_398_;
		if (((f_411_ - f_413_) * (f_410_ - f_414_)
		     - (f_412_ - f_414_) * (f_409_ - f_413_))
		    > 0.0F) {
		    class128.aBool1485
			= (f_411_ < 0.0F || f_413_ < 0.0F || f_409_ < 0.0F
			   || f_411_ > (float) class128.anInt1494
			   || f_413_ > (float) class128.anInt1494
			   || f_409_ > (float) class128.anInt1494);
		    if (f_457_ < 3.0F) {
			if (f_457_ > 0.0F) {
			    if (bool_455_) {
				int i_458_ = -16777216;
				if (bool_456_)
				    i_458_ = -1694498816;
				class128.method2248
				    (true, true, false, f_412_, f_414_, f_410_,
				     f_411_, f_413_, f_409_, f_405_, f_406_,
				     f_404_, f_401_, f_402_, f_400_, 1.0F,
				     0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				     i_458_ | class123.anInt1447 & 0xffffff,
				     i_458_ | class123.anInt1450 & 0xffffff,
				     i_458_ | class123.anInt1446 & 0xffffff,
				     class110.anInt1330 * 296717011,
				     f_397_ * 255.0F, f_398_ * 255.0F,
				     f_396_ * 255.0F,
				     class123.aShort1456 & 0xffff);
			    } else {
				if (bool_456_)
				    class128.anInt1486 = 100;
				class128.method2243
				    (true, true, false, f_412_, f_414_, f_410_,
				     f_411_, f_413_, f_409_, f_405_, f_406_,
				     f_404_,
				     (Class619.method10166
				      (class123.anInt1447,
				       ((int) (f_397_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -90171210)),
				     (Class619.method10166
				      (class123.anInt1450,
				       ((int) (f_398_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -920804029)),
				     (Class619.method10166
				      (class123.anInt1446,
				       ((int) (f_396_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -47153710)));
				class128.anInt1486 = 0;
			    }
			} else if (bool_455_) {
			    int i_459_ = -16777216;
			    if (bool_456_)
				i_459_ = -1694498816;
			    class128.method2248
				(true, true, false, f_412_, f_414_, f_410_,
				 f_411_, f_413_, f_409_, f_405_, f_406_,
				 f_404_, f_401_, f_402_, f_400_, 1.0F, 0.0F,
				 1.0F, 1.0F, 1.0F, 0.0F,
				 i_459_ | class123.anInt1447 & 0xffffff,
				 i_459_ | class123.anInt1450 & 0xffffff,
				 i_459_ | class123.anInt1446 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class123.aShort1456 & 0xffff);
			} else {
			    if (bool_456_)
				class128.anInt1486 = 100;
			    class128.method2243(true, true, false, f_412_,
						f_414_, f_410_, f_411_, f_413_,
						f_409_, f_405_, f_406_, f_404_,
						class123.anInt1447,
						class123.anInt1450,
						class123.anInt1446);
			    class128.anInt1486 = 0;
			}
		    } else
			class128.method2256(true, true, false, f_412_, f_414_,
					    f_410_, f_411_, f_413_, f_409_,
					    f_405_, f_406_, f_404_,
					    class110.anInt1330 * 296717011);
		}
		f_457_ = f + f_396_ + f_398_;
		if (((f_407_ - f_409_) * (f_414_ - f_410_)
		     - (f_408_ - f_410_) * (f_413_ - f_409_))
		    > 0.0F) {
		    class128.aBool1485
			= (f_407_ < 0.0F || f_409_ < 0.0F || f_413_ < 0.0F
			   || f_407_ > (float) class128.anInt1494
			   || f_409_ > (float) class128.anInt1494
			   || f_413_ > (float) class128.anInt1494);
		    if (f_457_ < 3.0F) {
			if (bool_456_)
			    class128.anInt1486 = -1694498816;
			if (f_457_ > 0.0F) {
			    if (bool_455_) {
				int i_460_ = -16777216;
				if (bool_456_)
				    i_460_ = -1694498816;
				class128.method2248
				    (true, true, false, f_408_, f_410_, f_414_,
				     f_407_, f_409_, f_413_, f_403_, f_404_,
				     f_406_, f_399_, f_400_, f_402_, 0.0F,
				     1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				     i_460_ | class123.anInt1453 & 0xffffff,
				     i_460_ | class123.anInt1446 & 0xffffff,
				     i_460_ | class123.anInt1450 & 0xffffff,
				     class110.anInt1330 * 296717011,
				     f * 255.0F, f_396_ * 255.0F,
				     f_398_ * 255.0F,
				     class123.aShort1456 & 0xffff);
			    } else {
				if (bool_456_)
				    class128.anInt1486 = 100;
				class128.method2243
				    (true, true, false, f_408_, f_410_, f_414_,
				     f_407_, f_409_, f_413_, f_403_, f_404_,
				     f_406_,
				     Class619.method10166(class123.anInt1453,
							  (((int) (f * 255.0F)
							    << 24)
							   | ((class110
							       .anInt1330)
							      * 296717011)),
							  -1682862624),
				     (Class619.method10166
				      (class123.anInt1446,
				       ((int) (f_396_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -1737627839)),
				     (Class619.method10166
				      (class123.anInt1450,
				       ((int) (f_398_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -1939654356)));
				class128.anInt1486 = 0;
			    }
			} else if (bool_455_) {
			    int i_461_ = -16777216;
			    if (bool_456_)
				i_461_ = -1694498816;
			    class128.method2248
				(true, true, false, f_408_, f_410_, f_414_,
				 f_407_, f_409_, f_413_, f_403_, f_404_,
				 f_406_, f_399_, f_400_, f_402_, 0.0F, 1.0F,
				 1.0F, 0.0F, 0.0F, 1.0F,
				 i_461_ | class123.anInt1453 & 0xffffff,
				 i_461_ | class123.anInt1446 & 0xffffff,
				 i_461_ | class123.anInt1450 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class123.aShort1456 & 0xffff);
			} else {
			    if (bool_456_)
				class128.anInt1486 = 100;
			    class128.method2243(true, true, false, f_408_,
						f_410_, f_414_, f_407_, f_409_,
						f_413_, f_403_, f_404_, f_406_,
						class123.anInt1453,
						class123.anInt1446,
						class123.anInt1450);
			    class128.anInt1486 = 0;
			}
		    } else
			class128.method2256(true, true, false, f_408_, f_410_,
					    f_414_, f_407_, f_409_, f_413_,
					    f_403_, f_404_, f_406_,
					    class110.anInt1330 * 296717011);
		}
	    }
	} else {
	    Class127 class127 = aClass127ArrayArray9524[i][i_386_];
	    if (class127 != null) {
		if (i_391_ != 0) {
		    if ((class127.aByte1472 & 0x4) != 0) {
			if ((i_391_ & 0x1) != 0)
			    return;
		    } else if ((i_391_ & 0x2) != 0)
			return;
		}
		for (int i_462_ = 0; i_462_ < class127.aShort1471; i_462_++) {
		    int i_463_ = (class127.aShortArray1473[i_462_]
				  + (i << anInt1763 * -2063427645));
		    int i_464_ = class127.aShortArray1477[i_462_];
		    int i_465_ = (class127.aShortArray1470[i_462_]
				  + (i_386_ << anInt1763 * -2063427645));
		    float f = aFloat9534 + (aFloat9531 * (float) i_463_
					    + aFloat9530 * (float) i_464_
					    + aFloat9518 * (float) i_465_);
		    float f_466_
			= aFloat9527 + (aFloat9523 * (float) i_463_
					+ aFloat9526 * (float) i_464_
					+ aFloat9528 * (float) i_465_);
		    if (f < -f_466_)
			return;
		    float f_467_ = (class128.aFloat1492
				    + class128.aFloat1493 * f / f_466_);
		    fs_390_[i_462_] = 0.0F;
		    if (bool) {
			float f_468_ = f - class110.aFloat1328;
			if (f_468_ > 0.0F) {
			    f_468_ /= class110.aFloat1329;
			    if (f_468_ > 1.0F)
				f_468_ = 1.0F;
			    fs_390_[i_462_] = f_468_;
			    int i_469_
				= (int) ((float) (class127.aShortArray1476
						  [i_462_])
					 * f_468_);
			    if (i_469_ > 0)
				i_464_ -= i_469_;
			}
		    } else if (class110.aBool1369) {
			float f_470_ = f - class110.aFloat1328;
			if (f_470_ > 0.0F) {
			    fs_390_[i_462_] = f_470_ / class110.aFloat1329;
			    if (fs_390_[i_462_] > 1.0F)
				fs_390_[i_462_] = 1.0F;
			}
		    }
		    float f_471_
			= aFloat9532 + (aFloat9520 * (float) i_463_
					+ aFloat9537 * (float) i_464_
					+ aFloat9522 * (float) i_465_);
		    float f_472_
			= aFloat9529 + (aFloat9521 * (float) i_463_
					+ aFloat9508 * (float) i_464_
					+ aFloat9510 * (float) i_465_);
		    fs[i_462_] = (class128.aFloat1503
				  + class128.aFloat1489 * f_471_ / f_466_);
		    fs_387_[i_462_]
			= (class128.aFloat1490
			   + class128.aFloat1491 * f_472_ / f_466_);
		    fs_388_[i_462_] = f_467_;
		    fs_389_[i_462_] = f_466_;
		}
		if (class127.aShortArray1478 != null) {
		    for (int i_473_ = 0; i_473_ < class127.aShort1474;
			 i_473_++) {
			int i_474_ = i_473_ * 3;
			int i_475_ = i_474_ + 1;
			int i_476_ = i_475_ + 1;
			float f = fs[i_474_];
			float f_477_ = fs[i_475_];
			float f_478_ = fs[i_476_];
			float f_479_ = fs_387_[i_474_];
			float f_480_ = fs_387_[i_475_];
			float f_481_ = fs_387_[i_476_];
			float f_482_ = (fs_390_[i_474_] + fs_390_[i_475_]
					+ fs_390_[i_476_]);
			if (((f - f_477_) * (f_481_ - f_480_)
			     - (f_479_ - f_480_) * (f_478_ - f_477_))
			    > 0.0F) {
			    class128.aBool1485
				= (f < 0.0F || f_477_ < 0.0F || f_478_ < 0.0F
				   || f > (float) class128.anInt1494
				   || f_477_ > (float) class128.anInt1494
				   || f_478_ > (float) class128.anInt1494);
			    TextureMetrics class166 = null;
			    boolean bool_483_ = false;
			    if (class127.aShortArray1478[i_473_] != -1) {
				class166 = (aClass182_Sub2_9513
						.aClass180_1944.method3116
					    ((class127.aShortArray1478[i_473_]
					      & 0xffff),
					     -1431554601));
				bool_483_ = class166.aBool1801;
			    }
			    if (f_482_ < 3.0F) {
				if (f_482_ > 0.0F) {
				    if (bool_483_) {
					int i_484_ = -16777216;
					if (method15244(class166.aByte1825))
					    i_484_ = -1694498816;
					class128.method2248
					    (true, true, false, f_479_, f_480_,
					     f_481_, f, f_477_, f_478_,
					     fs_388_[i_474_], fs_388_[i_475_],
					     fs_388_[i_476_], fs_389_[i_474_],
					     fs_389_[i_475_], fs_389_[i_476_],
					     ((float) (class127.aShortArray1473
						       [i_474_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1473
						       [i_475_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1473
						       [i_476_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1470
						       [i_474_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1470
						       [i_475_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1470
						       [i_476_])
					      / (float) (anInt1761
							 * 435863595)),
					     i_484_ | (class127.anIntArray1475
						       [i_474_]) & 0xffffff,
					     i_484_ | (class127.anIntArray1475
						       [i_475_]) & 0xffffff,
					     i_484_ | (class127.anIntArray1475
						       [i_476_]) & 0xffffff,
					     class110.anInt1330 * 296717011,
					     fs_390_[i_474_] * 255.0F,
					     fs_390_[i_475_] * 255.0F,
					     fs_390_[i_476_] * 255.0F,
					     (class127.aShortArray1478[i_473_]
					      & 0xffff));
				    } else if ((class127.anIntArray1475[i_474_]
						& 0xffffff)
					       != 0) {
					class128.method2243
					    (true, true, false, f_479_, f_480_,
					     f_481_, f, f_477_, f_478_,
					     fs_388_[i_474_], fs_388_[i_475_],
					     fs_388_[i_476_],
					     (Class619.method10166
					      (class127.anIntArray1475[i_474_],
					       ((int) (fs_390_[i_474_]
						       * 255.0F) << 24
						| (class110.anInt1330
						   * 296717011)),
					       -1824668457)),
					     (Class619.method10166
					      (class127.anIntArray1475[i_475_],
					       ((int) (fs_390_[i_475_]
						       * 255.0F) << 24
						| (class110.anInt1330
						   * 296717011)),
					       -963048469)),
					     (Class619.method10166
					      (class127.anIntArray1475[i_476_],
					       ((int) (fs_390_[i_476_]
						       * 255.0F) << 24
						| (class110.anInt1330
						   * 296717011)),
					       -823633521)));
					class128.anInt1486 = 0;
				    }
				} else if (bool_483_) {
				    int i_485_ = -16777216;
				    if (method15244(class166.aByte1825))
					i_485_ = -1694498816;
				    class128.method2248
					(true, true, false, f_479_, f_480_,
					 f_481_, f, f_477_, f_478_,
					 fs_388_[i_474_], fs_388_[i_475_],
					 fs_388_[i_476_], fs_389_[i_474_],
					 fs_389_[i_475_], fs_389_[i_476_],
					 ((float) (class127.aShortArray1473
						   [i_474_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1473
						   [i_475_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1473
						   [i_476_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1470
						   [i_474_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1470
						   [i_475_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1470
						   [i_476_])
					  / (float) (anInt1761 * 435863595)),
					 i_485_ | (class127.anIntArray1475
						   [i_474_]) & 0xffffff,
					 i_485_ | (class127.anIntArray1475
						   [i_475_]) & 0xffffff,
					 i_485_ | (class127.anIntArray1475
						   [i_476_]) & 0xffffff,
					 0, 0.0F, 0.0F, 0.0F,
					 (class127.aShortArray1478[i_473_]
					  & 0xffff));
				} else if ((class127.anIntArray1475[i_474_]
					    & 0xffffff)
					   != 0) {
				    class128.method2243
					(true, true, false, f_479_, f_480_,
					 f_481_, f, f_477_, f_478_,
					 fs_388_[i_474_], fs_388_[i_475_],
					 fs_388_[i_476_],
					 class127.anIntArray1475[i_474_],
					 class127.anIntArray1475[i_475_],
					 class127.anIntArray1475[i_476_]);
				    class128.anInt1486 = 0;
				}
			    } else
				class128.method2256(true, true, false, f_479_,
						    f_480_, f_481_, f, f_477_,
						    f_478_, fs_388_[i_474_],
						    fs_388_[i_475_],
						    fs_388_[i_476_],
						    (class110.anInt1330
						     * 296717011));
			}
		    }
		} else {
		    for (int i_486_ = 0; i_486_ < class127.aShort1474;
			 i_486_++) {
			int i_487_ = i_486_ * 3;
			int i_488_ = i_487_ + 1;
			int i_489_ = i_488_ + 1;
			float f = fs[i_487_];
			float f_490_ = fs[i_488_];
			float f_491_ = fs[i_489_];
			float f_492_ = fs_387_[i_487_];
			float f_493_ = fs_387_[i_488_];
			float f_494_ = fs_387_[i_489_];
			float f_495_ = (fs_390_[i_487_] + fs_390_[i_488_]
					+ fs_390_[i_489_]);
			if (((f - f_490_) * (f_494_ - f_493_)
			     - (f_492_ - f_493_) * (f_491_ - f_490_))
			    > 0.0F) {
			    class128.aBool1485
				= (f < 0.0F || f_490_ < 0.0F || f_491_ < 0.0F
				   || f > (float) class128.anInt1494
				   || f_490_ > (float) class128.anInt1494
				   || f_491_ > (float) class128.anInt1494);
			    if (f_495_ < 3.0F) {
				if (f_495_ > 0.0F) {
				    if ((class127.anIntArray1475[i_487_]
					 & 0xffffff)
					!= 0)
					class128.method2243
					    (true, true, false, f_492_, f_493_,
					     f_494_, f, f_490_, f_491_,
					     fs_388_[i_487_], fs_388_[i_488_],
					     fs_388_[i_489_],
					     (Class637.method10513
					      (class127.anIntArray1475[i_487_],
					       class110.anInt1330 * 296717011,
					       fs_390_[i_487_] * 255.0F,
					       678986322)),
					     (Class637.method10513
					      (class127.anIntArray1475[i_488_],
					       class110.anInt1330 * 296717011,
					       fs_390_[i_488_] * 255.0F,
					       1846732955)),
					     (Class637.method10513
					      (class127.anIntArray1475[i_489_],
					       class110.anInt1330 * 296717011,
					       fs_390_[i_489_] * 255.0F,
					       1179356076)));
				} else if ((class127.anIntArray1475[i_487_]
					    & 0xffffff)
					   != 0)
				    class128.method2243
					(true, true, false, f_492_, f_493_,
					 f_494_, f, f_490_, f_491_,
					 fs_388_[i_487_], fs_388_[i_488_],
					 fs_388_[i_489_],
					 class127.anIntArray1475[i_487_],
					 class127.anIntArray1475[i_488_],
					 class127.anIntArray1475[i_489_]);
			    } else
				class128.method2256(true, true, false, f_492_,
						    f_493_, f_494_, f, f_490_,
						    f_491_, fs_388_[i_487_],
						    fs_388_[i_488_],
						    fs_388_[i_489_],
						    (class110.anInt1330
						     * 296717011));
			}
		    }
		}
	    }
	}
    }
    
    void method15253(int i, int i_496_, boolean bool, Class110 class110,
		     Class128 class128, float[] fs, float[] fs_497_,
		     float[] fs_498_, float[] fs_499_, float[] fs_500_,
		     int i_501_) {
	Class123 class123 = aClass123ArrayArray9517[i][i_496_];
	if (class123 != null) {
	    if ((class123.aByte1451 & 0x2) == 0) {
		if (i_501_ != 0) {
		    if ((class123.aByte1451 & 0x4) != 0) {
			if ((i_501_ & 0x1) != 0)
			    return;
		    } else if ((i_501_ & 0x2) != 0)
			return;
		}
		int i_502_ = i * (anInt1761 * 435863595);
		int i_503_ = i_502_ + anInt1761 * 435863595;
		int i_504_ = i_496_ * (anInt1761 * 435863595);
		int i_505_ = i_504_ + anInt1761 * 435863595;
		float f = 0.0F;
		float f_506_ = 0.0F;
		float f_507_ = 0.0F;
		float f_508_ = 0.0F;
		float f_509_;
		float f_510_;
		float f_511_;
		float f_512_;
		float f_513_;
		float f_514_;
		float f_515_;
		float f_516_;
		float f_517_;
		float f_518_;
		float f_519_;
		float f_520_;
		float f_521_;
		float f_522_;
		float f_523_;
		float f_524_;
		if ((class123.aByte1451 & 0x1) != 0 && !bool) {
		    int i_525_ = anIntArrayArray1762[i][i_496_];
		    float f_526_ = aFloat9530 * (float) i_525_;
		    float f_527_ = aFloat9526 * (float) i_525_;
		    float f_528_
			= aFloat9534 + (aFloat9531 * (float) i_502_ + f_526_
					+ aFloat9518 * (float) i_504_);
		    f_509_ = aFloat9527 + (aFloat9523 * (float) i_502_ + f_527_
					   + aFloat9528 * (float) i_504_);
		    if (f_528_ < -f_509_)
			return;
		    float f_529_
			= aFloat9534 + (aFloat9531 * (float) i_503_ + f_526_
					+ aFloat9518 * (float) i_504_);
		    f_510_ = aFloat9527 + (aFloat9523 * (float) i_503_ + f_527_
					   + aFloat9528 * (float) i_504_);
		    if (f_529_ < -f_510_)
			return;
		    float f_530_
			= aFloat9534 + (aFloat9531 * (float) i_503_ + f_526_
					+ aFloat9518 * (float) i_505_);
		    f_511_ = aFloat9527 + (aFloat9523 * (float) i_503_ + f_527_
					   + aFloat9528 * (float) i_505_);
		    if (f_530_ < -f_511_)
			return;
		    float f_531_
			= aFloat9534 + (aFloat9531 * (float) i_502_ + f_526_
					+ aFloat9518 * (float) i_505_);
		    f_512_ = aFloat9527 + (aFloat9523 * (float) i_502_ + f_527_
					   + aFloat9528 * (float) i_505_);
		    if (f_531_ < -f_512_)
			return;
		    f_513_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_528_ / f_509_);
		    f_514_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_529_ / f_510_);
		    f_515_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_530_ / f_511_);
		    f_516_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_531_ / f_512_);
		    if (class110.aBool1369) {
			float f_532_ = f_528_ - class110.aFloat1328;
			if (f_532_ > 0.0F) {
			    f = f_532_ / class110.aFloat1329;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_532_ = f_529_ - class110.aFloat1328;
			if (f_532_ > 0.0F) {
			    f_506_ = f_532_ / class110.aFloat1329;
			    if (f_506_ > 1.0F)
				f_506_ = 1.0F;
			}
			f_532_ = f_530_ - class110.aFloat1328;
			if (f_532_ > 0.0F) {
			    f_507_ = f_532_ / class110.aFloat1329;
			    if (f_507_ > 1.0F)
				f_507_ = 1.0F;
			}
			f_532_ = f_531_ - class110.aFloat1328;
			if (f_532_ > 0.0F) {
			    f_508_ = f_532_ / class110.aFloat1329;
			    if (f_508_ > 1.0F)
				f_508_ = 1.0F;
			}
		    }
		    float f_533_ = aFloat9537 * (float) i_525_;
		    float f_534_ = aFloat9508 * (float) i_525_;
		    float f_535_
			= aFloat9532 + (aFloat9520 * (float) i_502_ + f_533_
					+ aFloat9522 * (float) i_504_);
		    f_517_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_535_ / f_509_);
		    float f_536_
			= aFloat9529 + (aFloat9521 * (float) i_502_ + f_534_
					+ aFloat9510 * (float) i_504_);
		    f_518_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_536_ / f_509_);
		    float f_537_
			= aFloat9532 + (aFloat9520 * (float) i_503_ + f_533_
					+ aFloat9522 * (float) i_504_);
		    f_519_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_537_ / f_510_);
		    float f_538_
			= aFloat9529 + (aFloat9521 * (float) i_503_ + f_534_
					+ aFloat9510 * (float) i_504_);
		    f_520_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_538_ / f_510_);
		    float f_539_
			= aFloat9532 + (aFloat9520 * (float) i_503_ + f_533_
					+ aFloat9522 * (float) i_505_);
		    f_521_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_539_ / f_511_);
		    float f_540_
			= aFloat9529 + (aFloat9521 * (float) i_503_ + f_534_
					+ aFloat9510 * (float) i_505_);
		    f_522_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_540_ / f_511_);
		    float f_541_
			= aFloat9532 + (aFloat9520 * (float) i_502_ + f_533_
					+ aFloat9522 * (float) i_505_);
		    f_523_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_541_ / f_512_);
		    float f_542_
			= aFloat9529 + (aFloat9521 * (float) i_502_ + f_534_
					+ aFloat9510 * (float) i_505_);
		    f_524_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_542_ / f_512_);
		} else {
		    int i_543_ = anIntArrayArray1762[i][i_496_];
		    int i_544_ = anIntArrayArray1762[i + 1][i_496_];
		    int i_545_ = anIntArrayArray1762[i + 1][i_496_ + 1];
		    int i_546_ = anIntArrayArray1762[i][i_496_ + 1];
		    float f_547_
			= aFloat9534 + (aFloat9531 * (float) i_502_
					+ aFloat9530 * (float) i_543_
					+ aFloat9518 * (float) i_504_);
		    f_509_ = aFloat9527 + (aFloat9523 * (float) i_502_
					   + aFloat9526 * (float) i_543_
					   + aFloat9528 * (float) i_504_);
		    if (f_547_ < -f_509_)
			return;
		    float f_548_
			= aFloat9534 + (aFloat9531 * (float) i_503_
					+ aFloat9530 * (float) i_544_
					+ aFloat9518 * (float) i_504_);
		    f_510_ = aFloat9527 + (aFloat9523 * (float) i_503_
					   + aFloat9526 * (float) i_544_
					   + aFloat9528 * (float) i_504_);
		    if (f_548_ < -f_510_)
			return;
		    float f_549_
			= aFloat9534 + (aFloat9531 * (float) i_503_
					+ aFloat9530 * (float) i_545_
					+ aFloat9518 * (float) i_505_);
		    f_511_ = aFloat9527 + (aFloat9523 * (float) i_503_
					   + aFloat9526 * (float) i_545_
					   + aFloat9528 * (float) i_505_);
		    if (f_549_ < -f_511_)
			return;
		    float f_550_
			= aFloat9534 + (aFloat9531 * (float) i_502_
					+ aFloat9530 * (float) i_546_
					+ aFloat9518 * (float) i_505_);
		    f_512_ = aFloat9527 + (aFloat9523 * (float) i_502_
					   + aFloat9526 * (float) i_546_
					   + aFloat9528 * (float) i_505_);
		    if (f_550_ < -f_512_)
			return;
		    f_513_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_547_ / f_509_);
		    f_514_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_548_ / f_510_);
		    f_515_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_549_ / f_511_);
		    f_516_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_550_ / f_512_);
		    if (bool) {
			float f_551_ = f_547_ - class110.aFloat1328;
			if (f_551_ > 0.0F) {
			    f_551_ /= class110.aFloat1329;
			    if (f_551_ > 1.0F)
				f_551_ = 1.0F;
			    f = f_551_;
			    int i_552_
				= (int) ((float) class123.aShort1449 * f_551_);
			    if (i_552_ > 0)
				i_543_ -= i_552_;
			}
			f_551_ = f_548_ - class110.aFloat1328;
			if (f_551_ > 0.0F) {
			    f_551_ /= class110.aFloat1329;
			    if (f_551_ > 1.0F)
				f_551_ = 1.0F;
			    f_506_ = f_551_;
			    int i_553_
				= (int) ((float) class123.aShort1452 * f_551_);
			    if (i_553_ > 0)
				i_544_ -= i_553_;
			}
			f_551_ = f_549_ - class110.aFloat1328;
			if (f_551_ > 0.0F) {
			    f_551_ /= class110.aFloat1329;
			    if (f_551_ > 1.0F)
				f_551_ = 1.0F;
			    f_507_ = f_551_;
			    int i_554_
				= (int) ((float) class123.aShort1448 * f_551_);
			    if (i_554_ > 0)
				i_545_ -= i_554_;
			}
			f_551_ = f_550_ - class110.aFloat1328;
			if (f_551_ > 0.0F) {
			    f_551_ /= class110.aFloat1329;
			    if (f_551_ > 1.0F)
				f_551_ = 1.0F;
			    f_508_ = f_551_;
			    int i_555_
				= (int) ((float) class123.aShort1454 * f_551_);
			    if (i_555_ > 0)
				i_546_ -= i_555_;
			}
		    } else if (class110.aBool1369) {
			float f_556_ = f_547_ - class110.aFloat1328;
			if (f_556_ > 0.0F) {
			    f = f_556_ / class110.aFloat1329;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_556_ = f_548_ - class110.aFloat1328;
			if (f_556_ > 0.0F) {
			    f_506_ = f_556_ / class110.aFloat1329;
			    if (f_506_ > 1.0F)
				f_506_ = 1.0F;
			}
			f_556_ = f_549_ - class110.aFloat1328;
			if (f_556_ > 0.0F) {
			    f_507_ = f_556_ / class110.aFloat1329;
			    if (f_507_ > 1.0F)
				f_507_ = 1.0F;
			}
			f_556_ = f_550_ - class110.aFloat1328;
			if (f_556_ > 0.0F) {
			    f_508_ = f_556_ / class110.aFloat1329;
			    if (f_508_ > 1.0F)
				f_508_ = 1.0F;
			}
		    }
		    float f_557_
			= aFloat9532 + (aFloat9520 * (float) i_502_
					+ aFloat9537 * (float) i_543_
					+ aFloat9522 * (float) i_504_);
		    f_517_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_557_ / f_509_);
		    float f_558_
			= aFloat9529 + (aFloat9521 * (float) i_502_
					+ aFloat9508 * (float) i_543_
					+ aFloat9510 * (float) i_504_);
		    f_518_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_558_ / f_509_);
		    float f_559_
			= aFloat9532 + (aFloat9520 * (float) i_503_
					+ aFloat9537 * (float) i_544_
					+ aFloat9522 * (float) i_504_);
		    f_519_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_559_ / f_510_);
		    float f_560_
			= aFloat9529 + (aFloat9521 * (float) i_503_
					+ aFloat9508 * (float) i_544_
					+ aFloat9510 * (float) i_504_);
		    f_520_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_560_ / f_510_);
		    float f_561_
			= aFloat9532 + (aFloat9520 * (float) i_503_
					+ aFloat9537 * (float) i_545_
					+ aFloat9522 * (float) i_505_);
		    f_521_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_561_ / f_511_);
		    float f_562_
			= aFloat9529 + (aFloat9521 * (float) i_503_
					+ aFloat9508 * (float) i_545_
					+ aFloat9510 * (float) i_505_);
		    f_522_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_562_ / f_511_);
		    float f_563_
			= aFloat9532 + (aFloat9520 * (float) i_502_
					+ aFloat9537 * (float) i_546_
					+ aFloat9522 * (float) i_505_);
		    f_523_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_563_ / f_512_);
		    float f_564_
			= aFloat9529 + (aFloat9521 * (float) i_502_
					+ aFloat9508 * (float) i_546_
					+ aFloat9510 * (float) i_505_);
		    f_524_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_564_ / f_512_);
		}
		TextureMetrics class166 = null;
		boolean bool_565_ = false;
		if (class123.aShort1456 != -1) {
		    class166 = (aClass182_Sub2_9513.aClass180_1944.method3116
				(class123.aShort1456 & 0xffff, -1431554601));
		    bool_565_ = class166.aBool1801;
		}
		boolean bool_566_
		    = class166 != null && method15244(class166.aByte1825);
		float f_567_ = f_506_ + f_507_ + f_508_;
		if (((f_521_ - f_523_) * (f_520_ - f_524_)
		     - (f_522_ - f_524_) * (f_519_ - f_523_))
		    > 0.0F) {
		    class128.aBool1485
			= (f_521_ < 0.0F || f_523_ < 0.0F || f_519_ < 0.0F
			   || f_521_ > (float) class128.anInt1494
			   || f_523_ > (float) class128.anInt1494
			   || f_519_ > (float) class128.anInt1494);
		    if (f_567_ < 3.0F) {
			if (f_567_ > 0.0F) {
			    if (bool_565_) {
				int i_568_ = -16777216;
				if (bool_566_)
				    i_568_ = -1694498816;
				class128.method2248
				    (true, true, false, f_522_, f_524_, f_520_,
				     f_521_, f_523_, f_519_, f_515_, f_516_,
				     f_514_, f_511_, f_512_, f_510_, 1.0F,
				     0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				     i_568_ | class123.anInt1447 & 0xffffff,
				     i_568_ | class123.anInt1450 & 0xffffff,
				     i_568_ | class123.anInt1446 & 0xffffff,
				     class110.anInt1330 * 296717011,
				     f_507_ * 255.0F, f_508_ * 255.0F,
				     f_506_ * 255.0F,
				     class123.aShort1456 & 0xffff);
			    } else {
				if (bool_566_)
				    class128.anInt1486 = 100;
				class128.method2243
				    (true, true, false, f_522_, f_524_, f_520_,
				     f_521_, f_523_, f_519_, f_515_, f_516_,
				     f_514_,
				     (Class619.method10166
				      (class123.anInt1447,
				       ((int) (f_507_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -1358347423)),
				     (Class619.method10166
				      (class123.anInt1450,
				       ((int) (f_508_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -423001874)),
				     (Class619.method10166
				      (class123.anInt1446,
				       ((int) (f_506_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -1289627359)));
				class128.anInt1486 = 0;
			    }
			} else if (bool_565_) {
			    int i_569_ = -16777216;
			    if (bool_566_)
				i_569_ = -1694498816;
			    class128.method2248
				(true, true, false, f_522_, f_524_, f_520_,
				 f_521_, f_523_, f_519_, f_515_, f_516_,
				 f_514_, f_511_, f_512_, f_510_, 1.0F, 0.0F,
				 1.0F, 1.0F, 1.0F, 0.0F,
				 i_569_ | class123.anInt1447 & 0xffffff,
				 i_569_ | class123.anInt1450 & 0xffffff,
				 i_569_ | class123.anInt1446 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class123.aShort1456 & 0xffff);
			} else {
			    if (bool_566_)
				class128.anInt1486 = 100;
			    class128.method2243(true, true, false, f_522_,
						f_524_, f_520_, f_521_, f_523_,
						f_519_, f_515_, f_516_, f_514_,
						class123.anInt1447,
						class123.anInt1450,
						class123.anInt1446);
			    class128.anInt1486 = 0;
			}
		    } else
			class128.method2256(true, true, false, f_522_, f_524_,
					    f_520_, f_521_, f_523_, f_519_,
					    f_515_, f_516_, f_514_,
					    class110.anInt1330 * 296717011);
		}
		f_567_ = f + f_506_ + f_508_;
		if (((f_517_ - f_519_) * (f_524_ - f_520_)
		     - (f_518_ - f_520_) * (f_523_ - f_519_))
		    > 0.0F) {
		    class128.aBool1485
			= (f_517_ < 0.0F || f_519_ < 0.0F || f_523_ < 0.0F
			   || f_517_ > (float) class128.anInt1494
			   || f_519_ > (float) class128.anInt1494
			   || f_523_ > (float) class128.anInt1494);
		    if (f_567_ < 3.0F) {
			if (bool_566_)
			    class128.anInt1486 = -1694498816;
			if (f_567_ > 0.0F) {
			    if (bool_565_) {
				int i_570_ = -16777216;
				if (bool_566_)
				    i_570_ = -1694498816;
				class128.method2248
				    (true, true, false, f_518_, f_520_, f_524_,
				     f_517_, f_519_, f_523_, f_513_, f_514_,
				     f_516_, f_509_, f_510_, f_512_, 0.0F,
				     1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				     i_570_ | class123.anInt1453 & 0xffffff,
				     i_570_ | class123.anInt1446 & 0xffffff,
				     i_570_ | class123.anInt1450 & 0xffffff,
				     class110.anInt1330 * 296717011,
				     f * 255.0F, f_506_ * 255.0F,
				     f_508_ * 255.0F,
				     class123.aShort1456 & 0xffff);
			    } else {
				if (bool_566_)
				    class128.anInt1486 = 100;
				class128.method2243
				    (true, true, false, f_518_, f_520_, f_524_,
				     f_517_, f_519_, f_523_, f_513_, f_514_,
				     f_516_,
				     Class619.method10166(class123.anInt1453,
							  (((int) (f * 255.0F)
							    << 24)
							   | ((class110
							       .anInt1330)
							      * 296717011)),
							  737399586),
				     (Class619.method10166
				      (class123.anInt1446,
				       ((int) (f_506_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -1850270375)),
				     (Class619.method10166
				      (class123.anInt1450,
				       ((int) (f_508_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -1560729121)));
				class128.anInt1486 = 0;
			    }
			} else if (bool_565_) {
			    int i_571_ = -16777216;
			    if (bool_566_)
				i_571_ = -1694498816;
			    class128.method2248
				(true, true, false, f_518_, f_520_, f_524_,
				 f_517_, f_519_, f_523_, f_513_, f_514_,
				 f_516_, f_509_, f_510_, f_512_, 0.0F, 1.0F,
				 1.0F, 0.0F, 0.0F, 1.0F,
				 i_571_ | class123.anInt1453 & 0xffffff,
				 i_571_ | class123.anInt1446 & 0xffffff,
				 i_571_ | class123.anInt1450 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class123.aShort1456 & 0xffff);
			} else {
			    if (bool_566_)
				class128.anInt1486 = 100;
			    class128.method2243(true, true, false, f_518_,
						f_520_, f_524_, f_517_, f_519_,
						f_523_, f_513_, f_514_, f_516_,
						class123.anInt1453,
						class123.anInt1446,
						class123.anInt1450);
			    class128.anInt1486 = 0;
			}
		    } else
			class128.method2256(true, true, false, f_518_, f_520_,
					    f_524_, f_517_, f_519_, f_523_,
					    f_513_, f_514_, f_516_,
					    class110.anInt1330 * 296717011);
		}
	    }
	} else {
	    Class127 class127 = aClass127ArrayArray9524[i][i_496_];
	    if (class127 != null) {
		if (i_501_ != 0) {
		    if ((class127.aByte1472 & 0x4) != 0) {
			if ((i_501_ & 0x1) != 0)
			    return;
		    } else if ((i_501_ & 0x2) != 0)
			return;
		}
		for (int i_572_ = 0; i_572_ < class127.aShort1471; i_572_++) {
		    int i_573_ = (class127.aShortArray1473[i_572_]
				  + (i << anInt1763 * -2063427645));
		    int i_574_ = class127.aShortArray1477[i_572_];
		    int i_575_ = (class127.aShortArray1470[i_572_]
				  + (i_496_ << anInt1763 * -2063427645));
		    float f = aFloat9534 + (aFloat9531 * (float) i_573_
					    + aFloat9530 * (float) i_574_
					    + aFloat9518 * (float) i_575_);
		    float f_576_
			= aFloat9527 + (aFloat9523 * (float) i_573_
					+ aFloat9526 * (float) i_574_
					+ aFloat9528 * (float) i_575_);
		    if (f < -f_576_)
			return;
		    float f_577_ = (class128.aFloat1492
				    + class128.aFloat1493 * f / f_576_);
		    fs_500_[i_572_] = 0.0F;
		    if (bool) {
			float f_578_ = f - class110.aFloat1328;
			if (f_578_ > 0.0F) {
			    f_578_ /= class110.aFloat1329;
			    if (f_578_ > 1.0F)
				f_578_ = 1.0F;
			    fs_500_[i_572_] = f_578_;
			    int i_579_
				= (int) ((float) (class127.aShortArray1476
						  [i_572_])
					 * f_578_);
			    if (i_579_ > 0)
				i_574_ -= i_579_;
			}
		    } else if (class110.aBool1369) {
			float f_580_ = f - class110.aFloat1328;
			if (f_580_ > 0.0F) {
			    fs_500_[i_572_] = f_580_ / class110.aFloat1329;
			    if (fs_500_[i_572_] > 1.0F)
				fs_500_[i_572_] = 1.0F;
			}
		    }
		    float f_581_
			= aFloat9532 + (aFloat9520 * (float) i_573_
					+ aFloat9537 * (float) i_574_
					+ aFloat9522 * (float) i_575_);
		    float f_582_
			= aFloat9529 + (aFloat9521 * (float) i_573_
					+ aFloat9508 * (float) i_574_
					+ aFloat9510 * (float) i_575_);
		    fs[i_572_] = (class128.aFloat1503
				  + class128.aFloat1489 * f_581_ / f_576_);
		    fs_497_[i_572_]
			= (class128.aFloat1490
			   + class128.aFloat1491 * f_582_ / f_576_);
		    fs_498_[i_572_] = f_577_;
		    fs_499_[i_572_] = f_576_;
		}
		if (class127.aShortArray1478 != null) {
		    for (int i_583_ = 0; i_583_ < class127.aShort1474;
			 i_583_++) {
			int i_584_ = i_583_ * 3;
			int i_585_ = i_584_ + 1;
			int i_586_ = i_585_ + 1;
			float f = fs[i_584_];
			float f_587_ = fs[i_585_];
			float f_588_ = fs[i_586_];
			float f_589_ = fs_497_[i_584_];
			float f_590_ = fs_497_[i_585_];
			float f_591_ = fs_497_[i_586_];
			float f_592_ = (fs_500_[i_584_] + fs_500_[i_585_]
					+ fs_500_[i_586_]);
			if (((f - f_587_) * (f_591_ - f_590_)
			     - (f_589_ - f_590_) * (f_588_ - f_587_))
			    > 0.0F) {
			    class128.aBool1485
				= (f < 0.0F || f_587_ < 0.0F || f_588_ < 0.0F
				   || f > (float) class128.anInt1494
				   || f_587_ > (float) class128.anInt1494
				   || f_588_ > (float) class128.anInt1494);
			    TextureMetrics class166 = null;
			    boolean bool_593_ = false;
			    if (class127.aShortArray1478[i_583_] != -1) {
				class166 = (aClass182_Sub2_9513
						.aClass180_1944.method3116
					    ((class127.aShortArray1478[i_583_]
					      & 0xffff),
					     -1431554601));
				bool_593_ = class166.aBool1801;
			    }
			    if (f_592_ < 3.0F) {
				if (f_592_ > 0.0F) {
				    if (bool_593_) {
					int i_594_ = -16777216;
					if (method15244(class166.aByte1825))
					    i_594_ = -1694498816;
					class128.method2248
					    (true, true, false, f_589_, f_590_,
					     f_591_, f, f_587_, f_588_,
					     fs_498_[i_584_], fs_498_[i_585_],
					     fs_498_[i_586_], fs_499_[i_584_],
					     fs_499_[i_585_], fs_499_[i_586_],
					     ((float) (class127.aShortArray1473
						       [i_584_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1473
						       [i_585_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1473
						       [i_586_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1470
						       [i_584_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1470
						       [i_585_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1470
						       [i_586_])
					      / (float) (anInt1761
							 * 435863595)),
					     i_594_ | (class127.anIntArray1475
						       [i_584_]) & 0xffffff,
					     i_594_ | (class127.anIntArray1475
						       [i_585_]) & 0xffffff,
					     i_594_ | (class127.anIntArray1475
						       [i_586_]) & 0xffffff,
					     class110.anInt1330 * 296717011,
					     fs_500_[i_584_] * 255.0F,
					     fs_500_[i_585_] * 255.0F,
					     fs_500_[i_586_] * 255.0F,
					     (class127.aShortArray1478[i_583_]
					      & 0xffff));
				    } else if ((class127.anIntArray1475[i_584_]
						& 0xffffff)
					       != 0) {
					class128.method2243
					    (true, true, false, f_589_, f_590_,
					     f_591_, f, f_587_, f_588_,
					     fs_498_[i_584_], fs_498_[i_585_],
					     fs_498_[i_586_],
					     (Class619.method10166
					      (class127.anIntArray1475[i_584_],
					       ((int) (fs_500_[i_584_]
						       * 255.0F) << 24
						| (class110.anInt1330
						   * 296717011)),
					       328372352)),
					     (Class619.method10166
					      (class127.anIntArray1475[i_585_],
					       ((int) (fs_500_[i_585_]
						       * 255.0F) << 24
						| (class110.anInt1330
						   * 296717011)),
					       -1263157566)),
					     (Class619.method10166
					      (class127.anIntArray1475[i_586_],
					       ((int) (fs_500_[i_586_]
						       * 255.0F) << 24
						| (class110.anInt1330
						   * 296717011)),
					       -2134473162)));
					class128.anInt1486 = 0;
				    }
				} else if (bool_593_) {
				    int i_595_ = -16777216;
				    if (method15244(class166.aByte1825))
					i_595_ = -1694498816;
				    class128.method2248
					(true, true, false, f_589_, f_590_,
					 f_591_, f, f_587_, f_588_,
					 fs_498_[i_584_], fs_498_[i_585_],
					 fs_498_[i_586_], fs_499_[i_584_],
					 fs_499_[i_585_], fs_499_[i_586_],
					 ((float) (class127.aShortArray1473
						   [i_584_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1473
						   [i_585_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1473
						   [i_586_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1470
						   [i_584_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1470
						   [i_585_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1470
						   [i_586_])
					  / (float) (anInt1761 * 435863595)),
					 i_595_ | (class127.anIntArray1475
						   [i_584_]) & 0xffffff,
					 i_595_ | (class127.anIntArray1475
						   [i_585_]) & 0xffffff,
					 i_595_ | (class127.anIntArray1475
						   [i_586_]) & 0xffffff,
					 0, 0.0F, 0.0F, 0.0F,
					 (class127.aShortArray1478[i_583_]
					  & 0xffff));
				} else if ((class127.anIntArray1475[i_584_]
					    & 0xffffff)
					   != 0) {
				    class128.method2243
					(true, true, false, f_589_, f_590_,
					 f_591_, f, f_587_, f_588_,
					 fs_498_[i_584_], fs_498_[i_585_],
					 fs_498_[i_586_],
					 class127.anIntArray1475[i_584_],
					 class127.anIntArray1475[i_585_],
					 class127.anIntArray1475[i_586_]);
				    class128.anInt1486 = 0;
				}
			    } else
				class128.method2256(true, true, false, f_589_,
						    f_590_, f_591_, f, f_587_,
						    f_588_, fs_498_[i_584_],
						    fs_498_[i_585_],
						    fs_498_[i_586_],
						    (class110.anInt1330
						     * 296717011));
			}
		    }
		} else {
		    for (int i_596_ = 0; i_596_ < class127.aShort1474;
			 i_596_++) {
			int i_597_ = i_596_ * 3;
			int i_598_ = i_597_ + 1;
			int i_599_ = i_598_ + 1;
			float f = fs[i_597_];
			float f_600_ = fs[i_598_];
			float f_601_ = fs[i_599_];
			float f_602_ = fs_497_[i_597_];
			float f_603_ = fs_497_[i_598_];
			float f_604_ = fs_497_[i_599_];
			float f_605_ = (fs_500_[i_597_] + fs_500_[i_598_]
					+ fs_500_[i_599_]);
			if (((f - f_600_) * (f_604_ - f_603_)
			     - (f_602_ - f_603_) * (f_601_ - f_600_))
			    > 0.0F) {
			    class128.aBool1485
				= (f < 0.0F || f_600_ < 0.0F || f_601_ < 0.0F
				   || f > (float) class128.anInt1494
				   || f_600_ > (float) class128.anInt1494
				   || f_601_ > (float) class128.anInt1494);
			    if (f_605_ < 3.0F) {
				if (f_605_ > 0.0F) {
				    if ((class127.anIntArray1475[i_597_]
					 & 0xffffff)
					!= 0)
					class128.method2243
					    (true, true, false, f_602_, f_603_,
					     f_604_, f, f_600_, f_601_,
					     fs_498_[i_597_], fs_498_[i_598_],
					     fs_498_[i_599_],
					     (Class637.method10513
					      (class127.anIntArray1475[i_597_],
					       class110.anInt1330 * 296717011,
					       fs_500_[i_597_] * 255.0F,
					       -1617934265)),
					     (Class637.method10513
					      (class127.anIntArray1475[i_598_],
					       class110.anInt1330 * 296717011,
					       fs_500_[i_598_] * 255.0F,
					       -1389627086)),
					     (Class637.method10513
					      (class127.anIntArray1475[i_599_],
					       class110.anInt1330 * 296717011,
					       fs_500_[i_599_] * 255.0F,
					       -1614818948)));
				} else if ((class127.anIntArray1475[i_597_]
					    & 0xffffff)
					   != 0)
				    class128.method2243
					(true, true, false, f_602_, f_603_,
					 f_604_, f, f_600_, f_601_,
					 fs_498_[i_597_], fs_498_[i_598_],
					 fs_498_[i_599_],
					 class127.anIntArray1475[i_597_],
					 class127.anIntArray1475[i_598_],
					 class127.anIntArray1475[i_599_]);
			    } else
				class128.method2256(true, true, false, f_602_,
						    f_603_, f_604_, f, f_600_,
						    f_601_, fs_498_[i_597_],
						    fs_498_[i_598_],
						    fs_498_[i_599_],
						    (class110.anInt1330
						     * 296717011));
			}
		    }
		}
	    }
	}
    }
    
    void method15254(int i, int i_606_, boolean bool, Class110 class110,
		     Class128 class128, float[] fs, float[] fs_607_,
		     float[] fs_608_, float[] fs_609_, float[] fs_610_,
		     int i_611_) {
	Class134 class134 = aClass134ArrayArray9519[i][i_606_];
	if (i_611_ == 0 || (i_611_ & 0x2) == 0) {
	    if (class134 != null) {
		for (int i_612_ = 0; i_612_ < class134.aShort1600; i_612_++) {
		    int i_613_ = (class134.aShortArray1601[i_612_]
				  + (i << anInt1763 * -2063427645));
		    int i_614_ = class134.aShortArray1607[i_612_];
		    int i_615_ = (class134.aShortArray1603[i_612_]
				  + (i_606_ << anInt1763 * -2063427645));
		    float f = aFloat9534 + (aFloat9531 * (float) i_613_
					    + aFloat9530 * (float) i_614_
					    + aFloat9518 * (float) i_615_);
		    float f_616_
			= aFloat9527 + (aFloat9523 * (float) i_613_
					+ aFloat9526 * (float) i_614_
					+ aFloat9528 * (float) i_615_);
		    if (f < -f_616_)
			return;
		    fs_610_[i_612_] = 0.0F;
		    if (bool) {
			float f_617_ = f - class110.aFloat1328;
			if (f_617_ > 0.0F) {
			    f_617_ /= class110.aFloat1329;
			    if (f_617_ > 1.0F)
				f_617_ = 1.0F;
			    fs_610_[i_612_] = f_617_;
			    int i_618_
				= (int) ((float) (class134.aShortArray1604
						  [i_612_])
					 * f_617_);
			    if (i_618_ > 0)
				i_614_ -= i_618_;
			}
		    } else if (class110.aBool1369) {
			float f_619_ = f - class110.aFloat1328;
			if (f_619_ > 0.0F) {
			    fs_610_[i_612_] = f_619_ / class110.aFloat1329;
			    if (fs_610_[i_612_] > 1.0F)
				fs_610_[i_612_] = 1.0F;
			}
		    }
		    float f_620_
			= aFloat9532 + (aFloat9520 * (float) i_613_
					+ aFloat9537 * (float) i_614_
					+ aFloat9522 * (float) i_615_);
		    float f_621_
			= aFloat9529 + (aFloat9521 * (float) i_613_
					+ aFloat9508 * (float) i_614_
					+ aFloat9510 * (float) i_615_);
		    fs[i_612_] = (class128.aFloat1503
				  + class128.aFloat1489 * f_620_ / f_616_);
		    fs_607_[i_612_]
			= (class128.aFloat1490
			   + class128.aFloat1491 * f_621_ / f_616_);
		    fs_608_[i_612_] = (class128.aFloat1492
				       + class128.aFloat1493 * f / f_616_);
		    fs_609_[i_612_] = f_616_;
		}
		float f = (float) (anInt1761 * 435863595);
		for (int i_622_ = 0; i_622_ < class134.aShort1605; i_622_++) {
		    int i_623_ = i_622_ * 3;
		    int i_624_ = i_623_ + 1;
		    int i_625_ = i_624_ + 1;
		    float f_626_ = fs[i_623_];
		    float f_627_ = fs[i_624_];
		    float f_628_ = fs[i_625_];
		    float f_629_ = fs_607_[i_623_];
		    float f_630_ = fs_607_[i_624_];
		    float f_631_ = fs_607_[i_625_];
		    if (((f_626_ - f_627_) * (f_631_ - f_630_)
			 - (f_629_ - f_630_) * (f_628_ - f_627_))
			> 0.0F) {
			class128.aBool1485
			    = (f_626_ < 0.0F || f_627_ < 0.0F || f_628_ < 0.0F
			       || f_626_ > (float) class128.anInt1494
			       || f_627_ > (float) class128.anInt1494
			       || f_628_ > (float) class128.anInt1494);
			if (fs_610_[i_623_] + fs_610_[i_624_] + fs_610_[i_625_]
			    < 3.0F) {
			    int i_632_ = i << anInt1763 * -2063427645;
			    int i_633_ = i_606_ << anInt1763 * -2063427645;
			    if ((class134.anIntArray1599[i_623_] & 0xffffff)
				!= 0) {
				if (class134.aShortArray1602[i_623_] != -1
				    && class134.aShortArray1602[i_624_] != -1
				    && (class134.aShortArray1602[i_625_]
					!= -1)) {
				    if ((class134.aShortArray1602[i_623_]
					 == class134.aShortArray1602[i_624_])
					&& (class134.aShortArray1602[i_623_]
					    == (class134.aShortArray1602
						[i_625_]))
					&& (class134.aShortArray1606[i_623_]
					    == (class134.aShortArray1606
						[i_624_]))
					&& (class134.aShortArray1606[i_623_]
					    == (class134.aShortArray1606
						[i_625_])))
					class128.method2248
					    (true, true, false, f_629_, f_630_,
					     f_631_, f_626_, f_627_, f_628_,
					     fs_608_[i_623_], fs_608_[i_624_],
					     fs_608_[i_625_], fs_609_[i_623_],
					     fs_609_[i_624_], fs_609_[i_625_],
					     ((float) (i_632_
						       + (class134
							  .aShortArray1601
							  [i_623_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_623_])),
					     ((float) (i_632_
						       + (class134
							  .aShortArray1601
							  [i_624_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_624_])),
					     ((float) (i_632_
						       + (class134
							  .aShortArray1601
							  [i_625_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_625_])),
					     ((float) (i_633_
						       + (class134
							  .aShortArray1603
							  [i_623_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_623_])),
					     ((float) (i_633_
						       + (class134
							  .aShortArray1603
							  [i_624_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_624_])),
					     ((float) (i_633_
						       + (class134
							  .aShortArray1603
							  [i_625_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_625_])),
					     class134.anIntArray1599[i_623_],
					     class134.anIntArray1599[i_624_],
					     class134.anIntArray1599[i_625_],
					     class110.anInt1330 * 296717011,
					     fs_610_[i_623_] * 255.0F,
					     fs_610_[i_624_] * 255.0F,
					     fs_610_[i_625_] * 255.0F,
					     (class134.aShortArray1602[i_623_]
					      & 0xffff));
				    else
					class128.method2250
					    (true, true, false, f_629_, f_630_,
					     f_631_, f_626_, f_627_, f_628_,
					     fs_608_[i_623_], fs_608_[i_624_],
					     fs_608_[i_625_], fs_609_[i_623_],
					     fs_609_[i_624_], fs_609_[i_625_],
					     (float) (i_632_
						      + (class134
							 .aShortArray1601
							 [i_623_])) / f,
					     (float) (i_632_
						      + (class134
							 .aShortArray1601
							 [i_624_])) / f,
					     (float) (i_632_
						      + (class134
							 .aShortArray1601
							 [i_625_])) / f,
					     (float) (i_633_
						      + (class134
							 .aShortArray1603
							 [i_623_])) / f,
					     (float) (i_633_
						      + (class134
							 .aShortArray1603
							 [i_624_])) / f,
					     (float) (i_633_
						      + (class134
							 .aShortArray1603
							 [i_625_])) / f,
					     class134.anIntArray1599[i_623_],
					     class134.anIntArray1599[i_624_],
					     class134.anIntArray1599[i_625_],
					     class110.anInt1330 * 296717011,
					     fs_610_[i_623_] * 255.0F,
					     fs_610_[i_624_] * 255.0F,
					     fs_610_[i_625_] * 255.0F,
					     (class134.aShortArray1602[i_623_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_623_]),
					     (class134.aShortArray1602[i_624_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_624_]),
					     (class134.aShortArray1602[i_625_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_625_]));
				} else if ((fs_610_[i_623_] + fs_610_[i_624_]
					    + fs_610_[i_625_])
					   > 0.0F)
				    class128.method2243
					(true, true, false, f_629_, f_630_,
					 f_631_, f_626_, f_627_, f_628_,
					 fs_608_[i_623_], fs_608_[i_624_],
					 fs_608_[i_625_],
					 (Class637.method10513
					  (class134.anIntArray1599[i_623_],
					   class110.anInt1330 * 296717011,
					   fs_610_[i_623_] * 255.0F,
					   2030052459)),
					 (Class637.method10513
					  (class134.anIntArray1599[i_624_],
					   class110.anInt1330 * 296717011,
					   fs_610_[i_624_] * 255.0F,
					   501321127)),
					 (Class637.method10513
					  (class134.anIntArray1599[i_625_],
					   class110.anInt1330 * 296717011,
					   fs_610_[i_625_] * 255.0F,
					   1377844560)));
				else
				    class128.method2243
					(true, true, false, f_629_, f_630_,
					 f_631_, f_626_, f_627_, f_628_,
					 fs_608_[i_623_], fs_608_[i_624_],
					 fs_608_[i_625_],
					 class134.anIntArray1599[i_623_],
					 class134.anIntArray1599[i_624_],
					 class134.anIntArray1599[i_625_]);
			    }
			} else
			    class128.method2256(true, true, false, f_629_,
						f_630_, f_631_, f_626_, f_627_,
						f_628_, fs_608_[i_623_],
						fs_608_[i_624_],
						fs_608_[i_625_],
						(class110.anInt1330
						 * 296717011));
		    }
		}
	    }
	}
    }
    
    void method15255(int i, int i_634_, int i_635_) {
	Class110 class110
	    = aClass182_Sub2_9513.method15223(Thread.currentThread());
	class110.aClass128_1338.anInt1486 = 0;
	if (aClass123ArrayArray9517 != null)
	    method15263(i, i_634_, class110.aBool1332, class110,
			class110.aClass128_1338, class110.aFloatArray1364,
			class110.aFloatArray1365, class110.aFloatArray1366,
			class110.aFloatArray1367, class110.aFloatArray1339,
			i_635_);
	else if (aClass129ArrayArray9515 != null)
	    method15243(i, i_634_, class110.aClass128_1338,
			class110.aFloatArray1364, class110.aFloatArray1365,
			class110.aFloatArray1366, class110.aFloatArray1367,
			class110.aFloatArray1339, i_635_);
	else if (aClass134ArrayArray9519 != null)
	    method15268(i, i_634_, class110.aBool1332, class110,
			class110.aClass128_1338, class110.aFloatArray1364,
			class110.aFloatArray1365, class110.aFloatArray1366,
			class110.aFloatArray1367, class110.aFloatArray1339,
			i_635_);
    }
    
    void method15256(int i, int i_636_, boolean bool, Class110 class110,
		     Class128 class128, float[] fs, float[] fs_637_,
		     float[] fs_638_, float[] fs_639_, float[] fs_640_,
		     int i_641_) {
	Class134 class134 = aClass134ArrayArray9519[i][i_636_];
	if (i_641_ == 0 || (i_641_ & 0x2) == 0) {
	    if (class134 != null) {
		for (int i_642_ = 0; i_642_ < class134.aShort1600; i_642_++) {
		    int i_643_ = (class134.aShortArray1601[i_642_]
				  + (i << anInt1763 * -2063427645));
		    int i_644_ = class134.aShortArray1607[i_642_];
		    int i_645_ = (class134.aShortArray1603[i_642_]
				  + (i_636_ << anInt1763 * -2063427645));
		    float f = aFloat9534 + (aFloat9531 * (float) i_643_
					    + aFloat9530 * (float) i_644_
					    + aFloat9518 * (float) i_645_);
		    float f_646_
			= aFloat9527 + (aFloat9523 * (float) i_643_
					+ aFloat9526 * (float) i_644_
					+ aFloat9528 * (float) i_645_);
		    if (f < -f_646_)
			return;
		    fs_640_[i_642_] = 0.0F;
		    if (bool) {
			float f_647_ = f - class110.aFloat1328;
			if (f_647_ > 0.0F) {
			    f_647_ /= class110.aFloat1329;
			    if (f_647_ > 1.0F)
				f_647_ = 1.0F;
			    fs_640_[i_642_] = f_647_;
			    int i_648_
				= (int) ((float) (class134.aShortArray1604
						  [i_642_])
					 * f_647_);
			    if (i_648_ > 0)
				i_644_ -= i_648_;
			}
		    } else if (class110.aBool1369) {
			float f_649_ = f - class110.aFloat1328;
			if (f_649_ > 0.0F) {
			    fs_640_[i_642_] = f_649_ / class110.aFloat1329;
			    if (fs_640_[i_642_] > 1.0F)
				fs_640_[i_642_] = 1.0F;
			}
		    }
		    float f_650_
			= aFloat9532 + (aFloat9520 * (float) i_643_
					+ aFloat9537 * (float) i_644_
					+ aFloat9522 * (float) i_645_);
		    float f_651_
			= aFloat9529 + (aFloat9521 * (float) i_643_
					+ aFloat9508 * (float) i_644_
					+ aFloat9510 * (float) i_645_);
		    fs[i_642_] = (class128.aFloat1503
				  + class128.aFloat1489 * f_650_ / f_646_);
		    fs_637_[i_642_]
			= (class128.aFloat1490
			   + class128.aFloat1491 * f_651_ / f_646_);
		    fs_638_[i_642_] = (class128.aFloat1492
				       + class128.aFloat1493 * f / f_646_);
		    fs_639_[i_642_] = f_646_;
		}
		float f = (float) (anInt1761 * 435863595);
		for (int i_652_ = 0; i_652_ < class134.aShort1605; i_652_++) {
		    int i_653_ = i_652_ * 3;
		    int i_654_ = i_653_ + 1;
		    int i_655_ = i_654_ + 1;
		    float f_656_ = fs[i_653_];
		    float f_657_ = fs[i_654_];
		    float f_658_ = fs[i_655_];
		    float f_659_ = fs_637_[i_653_];
		    float f_660_ = fs_637_[i_654_];
		    float f_661_ = fs_637_[i_655_];
		    if (((f_656_ - f_657_) * (f_661_ - f_660_)
			 - (f_659_ - f_660_) * (f_658_ - f_657_))
			> 0.0F) {
			class128.aBool1485
			    = (f_656_ < 0.0F || f_657_ < 0.0F || f_658_ < 0.0F
			       || f_656_ > (float) class128.anInt1494
			       || f_657_ > (float) class128.anInt1494
			       || f_658_ > (float) class128.anInt1494);
			if (fs_640_[i_653_] + fs_640_[i_654_] + fs_640_[i_655_]
			    < 3.0F) {
			    int i_662_ = i << anInt1763 * -2063427645;
			    int i_663_ = i_636_ << anInt1763 * -2063427645;
			    if ((class134.anIntArray1599[i_653_] & 0xffffff)
				!= 0) {
				if (class134.aShortArray1602[i_653_] != -1
				    && class134.aShortArray1602[i_654_] != -1
				    && (class134.aShortArray1602[i_655_]
					!= -1)) {
				    if ((class134.aShortArray1602[i_653_]
					 == class134.aShortArray1602[i_654_])
					&& (class134.aShortArray1602[i_653_]
					    == (class134.aShortArray1602
						[i_655_]))
					&& (class134.aShortArray1606[i_653_]
					    == (class134.aShortArray1606
						[i_654_]))
					&& (class134.aShortArray1606[i_653_]
					    == (class134.aShortArray1606
						[i_655_])))
					class128.method2248
					    (true, true, false, f_659_, f_660_,
					     f_661_, f_656_, f_657_, f_658_,
					     fs_638_[i_653_], fs_638_[i_654_],
					     fs_638_[i_655_], fs_639_[i_653_],
					     fs_639_[i_654_], fs_639_[i_655_],
					     ((float) (i_662_
						       + (class134
							  .aShortArray1601
							  [i_653_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_653_])),
					     ((float) (i_662_
						       + (class134
							  .aShortArray1601
							  [i_654_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_654_])),
					     ((float) (i_662_
						       + (class134
							  .aShortArray1601
							  [i_655_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_655_])),
					     ((float) (i_663_
						       + (class134
							  .aShortArray1603
							  [i_653_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_653_])),
					     ((float) (i_663_
						       + (class134
							  .aShortArray1603
							  [i_654_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_654_])),
					     ((float) (i_663_
						       + (class134
							  .aShortArray1603
							  [i_655_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_655_])),
					     class134.anIntArray1599[i_653_],
					     class134.anIntArray1599[i_654_],
					     class134.anIntArray1599[i_655_],
					     class110.anInt1330 * 296717011,
					     fs_640_[i_653_] * 255.0F,
					     fs_640_[i_654_] * 255.0F,
					     fs_640_[i_655_] * 255.0F,
					     (class134.aShortArray1602[i_653_]
					      & 0xffff));
				    else
					class128.method2250
					    (true, true, false, f_659_, f_660_,
					     f_661_, f_656_, f_657_, f_658_,
					     fs_638_[i_653_], fs_638_[i_654_],
					     fs_638_[i_655_], fs_639_[i_653_],
					     fs_639_[i_654_], fs_639_[i_655_],
					     (float) (i_662_
						      + (class134
							 .aShortArray1601
							 [i_653_])) / f,
					     (float) (i_662_
						      + (class134
							 .aShortArray1601
							 [i_654_])) / f,
					     (float) (i_662_
						      + (class134
							 .aShortArray1601
							 [i_655_])) / f,
					     (float) (i_663_
						      + (class134
							 .aShortArray1603
							 [i_653_])) / f,
					     (float) (i_663_
						      + (class134
							 .aShortArray1603
							 [i_654_])) / f,
					     (float) (i_663_
						      + (class134
							 .aShortArray1603
							 [i_655_])) / f,
					     class134.anIntArray1599[i_653_],
					     class134.anIntArray1599[i_654_],
					     class134.anIntArray1599[i_655_],
					     class110.anInt1330 * 296717011,
					     fs_640_[i_653_] * 255.0F,
					     fs_640_[i_654_] * 255.0F,
					     fs_640_[i_655_] * 255.0F,
					     (class134.aShortArray1602[i_653_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_653_]),
					     (class134.aShortArray1602[i_654_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_654_]),
					     (class134.aShortArray1602[i_655_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_655_]));
				} else if ((fs_640_[i_653_] + fs_640_[i_654_]
					    + fs_640_[i_655_])
					   > 0.0F)
				    class128.method2243
					(true, true, false, f_659_, f_660_,
					 f_661_, f_656_, f_657_, f_658_,
					 fs_638_[i_653_], fs_638_[i_654_],
					 fs_638_[i_655_],
					 (Class637.method10513
					  (class134.anIntArray1599[i_653_],
					   class110.anInt1330 * 296717011,
					   fs_640_[i_653_] * 255.0F,
					   -1676444260)),
					 (Class637.method10513
					  (class134.anIntArray1599[i_654_],
					   class110.anInt1330 * 296717011,
					   fs_640_[i_654_] * 255.0F,
					   1867423197)),
					 (Class637.method10513
					  (class134.anIntArray1599[i_655_],
					   class110.anInt1330 * 296717011,
					   fs_640_[i_655_] * 255.0F,
					   1071046840)));
				else
				    class128.method2243
					(true, true, false, f_659_, f_660_,
					 f_661_, f_656_, f_657_, f_658_,
					 fs_638_[i_653_], fs_638_[i_654_],
					 fs_638_[i_655_],
					 class134.anIntArray1599[i_653_],
					 class134.anIntArray1599[i_654_],
					 class134.anIntArray1599[i_655_]);
			    }
			} else
			    class128.method2256(true, true, false, f_659_,
						f_660_, f_661_, f_656_, f_657_,
						f_658_, fs_638_[i_653_],
						fs_638_[i_654_],
						fs_638_[i_655_],
						(class110.anInt1330
						 * 296717011));
		    }
		}
	    }
	}
    }
    
    void method15257(int i, int i_664_, boolean bool, Class110 class110,
		     Class128 class128, float[] fs, float[] fs_665_,
		     float[] fs_666_, float[] fs_667_, float[] fs_668_,
		     int i_669_) {
	Class134 class134 = aClass134ArrayArray9519[i][i_664_];
	if (i_669_ == 0 || (i_669_ & 0x2) == 0) {
	    if (class134 != null) {
		for (int i_670_ = 0; i_670_ < class134.aShort1600; i_670_++) {
		    int i_671_ = (class134.aShortArray1601[i_670_]
				  + (i << anInt1763 * -2063427645));
		    int i_672_ = class134.aShortArray1607[i_670_];
		    int i_673_ = (class134.aShortArray1603[i_670_]
				  + (i_664_ << anInt1763 * -2063427645));
		    float f = aFloat9534 + (aFloat9531 * (float) i_671_
					    + aFloat9530 * (float) i_672_
					    + aFloat9518 * (float) i_673_);
		    float f_674_
			= aFloat9527 + (aFloat9523 * (float) i_671_
					+ aFloat9526 * (float) i_672_
					+ aFloat9528 * (float) i_673_);
		    if (f < -f_674_)
			return;
		    fs_668_[i_670_] = 0.0F;
		    if (bool) {
			float f_675_ = f - class110.aFloat1328;
			if (f_675_ > 0.0F) {
			    f_675_ /= class110.aFloat1329;
			    if (f_675_ > 1.0F)
				f_675_ = 1.0F;
			    fs_668_[i_670_] = f_675_;
			    int i_676_
				= (int) ((float) (class134.aShortArray1604
						  [i_670_])
					 * f_675_);
			    if (i_676_ > 0)
				i_672_ -= i_676_;
			}
		    } else if (class110.aBool1369) {
			float f_677_ = f - class110.aFloat1328;
			if (f_677_ > 0.0F) {
			    fs_668_[i_670_] = f_677_ / class110.aFloat1329;
			    if (fs_668_[i_670_] > 1.0F)
				fs_668_[i_670_] = 1.0F;
			}
		    }
		    float f_678_
			= aFloat9532 + (aFloat9520 * (float) i_671_
					+ aFloat9537 * (float) i_672_
					+ aFloat9522 * (float) i_673_);
		    float f_679_
			= aFloat9529 + (aFloat9521 * (float) i_671_
					+ aFloat9508 * (float) i_672_
					+ aFloat9510 * (float) i_673_);
		    fs[i_670_] = (class128.aFloat1503
				  + class128.aFloat1489 * f_678_ / f_674_);
		    fs_665_[i_670_]
			= (class128.aFloat1490
			   + class128.aFloat1491 * f_679_ / f_674_);
		    fs_666_[i_670_] = (class128.aFloat1492
				       + class128.aFloat1493 * f / f_674_);
		    fs_667_[i_670_] = f_674_;
		}
		float f = (float) (anInt1761 * 435863595);
		for (int i_680_ = 0; i_680_ < class134.aShort1605; i_680_++) {
		    int i_681_ = i_680_ * 3;
		    int i_682_ = i_681_ + 1;
		    int i_683_ = i_682_ + 1;
		    float f_684_ = fs[i_681_];
		    float f_685_ = fs[i_682_];
		    float f_686_ = fs[i_683_];
		    float f_687_ = fs_665_[i_681_];
		    float f_688_ = fs_665_[i_682_];
		    float f_689_ = fs_665_[i_683_];
		    if (((f_684_ - f_685_) * (f_689_ - f_688_)
			 - (f_687_ - f_688_) * (f_686_ - f_685_))
			> 0.0F) {
			class128.aBool1485
			    = (f_684_ < 0.0F || f_685_ < 0.0F || f_686_ < 0.0F
			       || f_684_ > (float) class128.anInt1494
			       || f_685_ > (float) class128.anInt1494
			       || f_686_ > (float) class128.anInt1494);
			if (fs_668_[i_681_] + fs_668_[i_682_] + fs_668_[i_683_]
			    < 3.0F) {
			    int i_690_ = i << anInt1763 * -2063427645;
			    int i_691_ = i_664_ << anInt1763 * -2063427645;
			    if ((class134.anIntArray1599[i_681_] & 0xffffff)
				!= 0) {
				if (class134.aShortArray1602[i_681_] != -1
				    && class134.aShortArray1602[i_682_] != -1
				    && (class134.aShortArray1602[i_683_]
					!= -1)) {
				    if ((class134.aShortArray1602[i_681_]
					 == class134.aShortArray1602[i_682_])
					&& (class134.aShortArray1602[i_681_]
					    == (class134.aShortArray1602
						[i_683_]))
					&& (class134.aShortArray1606[i_681_]
					    == (class134.aShortArray1606
						[i_682_]))
					&& (class134.aShortArray1606[i_681_]
					    == (class134.aShortArray1606
						[i_683_])))
					class128.method2248
					    (true, true, false, f_687_, f_688_,
					     f_689_, f_684_, f_685_, f_686_,
					     fs_666_[i_681_], fs_666_[i_682_],
					     fs_666_[i_683_], fs_667_[i_681_],
					     fs_667_[i_682_], fs_667_[i_683_],
					     ((float) (i_690_
						       + (class134
							  .aShortArray1601
							  [i_681_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_681_])),
					     ((float) (i_690_
						       + (class134
							  .aShortArray1601
							  [i_682_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_682_])),
					     ((float) (i_690_
						       + (class134
							  .aShortArray1601
							  [i_683_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_683_])),
					     ((float) (i_691_
						       + (class134
							  .aShortArray1603
							  [i_681_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_681_])),
					     ((float) (i_691_
						       + (class134
							  .aShortArray1603
							  [i_682_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_682_])),
					     ((float) (i_691_
						       + (class134
							  .aShortArray1603
							  [i_683_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_683_])),
					     class134.anIntArray1599[i_681_],
					     class134.anIntArray1599[i_682_],
					     class134.anIntArray1599[i_683_],
					     class110.anInt1330 * 296717011,
					     fs_668_[i_681_] * 255.0F,
					     fs_668_[i_682_] * 255.0F,
					     fs_668_[i_683_] * 255.0F,
					     (class134.aShortArray1602[i_681_]
					      & 0xffff));
				    else
					class128.method2250
					    (true, true, false, f_687_, f_688_,
					     f_689_, f_684_, f_685_, f_686_,
					     fs_666_[i_681_], fs_666_[i_682_],
					     fs_666_[i_683_], fs_667_[i_681_],
					     fs_667_[i_682_], fs_667_[i_683_],
					     (float) (i_690_
						      + (class134
							 .aShortArray1601
							 [i_681_])) / f,
					     (float) (i_690_
						      + (class134
							 .aShortArray1601
							 [i_682_])) / f,
					     (float) (i_690_
						      + (class134
							 .aShortArray1601
							 [i_683_])) / f,
					     (float) (i_691_
						      + (class134
							 .aShortArray1603
							 [i_681_])) / f,
					     (float) (i_691_
						      + (class134
							 .aShortArray1603
							 [i_682_])) / f,
					     (float) (i_691_
						      + (class134
							 .aShortArray1603
							 [i_683_])) / f,
					     class134.anIntArray1599[i_681_],
					     class134.anIntArray1599[i_682_],
					     class134.anIntArray1599[i_683_],
					     class110.anInt1330 * 296717011,
					     fs_668_[i_681_] * 255.0F,
					     fs_668_[i_682_] * 255.0F,
					     fs_668_[i_683_] * 255.0F,
					     (class134.aShortArray1602[i_681_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_681_]),
					     (class134.aShortArray1602[i_682_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_682_]),
					     (class134.aShortArray1602[i_683_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_683_]));
				} else if ((fs_668_[i_681_] + fs_668_[i_682_]
					    + fs_668_[i_683_])
					   > 0.0F)
				    class128.method2243
					(true, true, false, f_687_, f_688_,
					 f_689_, f_684_, f_685_, f_686_,
					 fs_666_[i_681_], fs_666_[i_682_],
					 fs_666_[i_683_],
					 (Class637.method10513
					  (class134.anIntArray1599[i_681_],
					   class110.anInt1330 * 296717011,
					   fs_668_[i_681_] * 255.0F,
					   20620699)),
					 (Class637.method10513
					  (class134.anIntArray1599[i_682_],
					   class110.anInt1330 * 296717011,
					   fs_668_[i_682_] * 255.0F,
					   1918708239)),
					 (Class637.method10513
					  (class134.anIntArray1599[i_683_],
					   class110.anInt1330 * 296717011,
					   fs_668_[i_683_] * 255.0F,
					   -1515992848)));
				else
				    class128.method2243
					(true, true, false, f_687_, f_688_,
					 f_689_, f_684_, f_685_, f_686_,
					 fs_666_[i_681_], fs_666_[i_682_],
					 fs_666_[i_683_],
					 class134.anIntArray1599[i_681_],
					 class134.anIntArray1599[i_682_],
					 class134.anIntArray1599[i_683_]);
			    }
			} else
			    class128.method2256(true, true, false, f_687_,
						f_688_, f_689_, f_684_, f_685_,
						f_686_, fs_666_[i_681_],
						fs_666_[i_682_],
						fs_666_[i_683_],
						(class110.anInt1330
						 * 296717011));
		    }
		}
	    }
	}
    }
    
    boolean method15258(int i) {
	if ((anInt9514 & 0x8) == 0)
	    return false;
	if (i == 4)
	    return true;
	if (i == 8)
	    return true;
	if (i == 9)
	    return true;
	return false;
    }
    
    void method15259(int i, int i_692_, boolean bool, Class110 class110,
		     Class128 class128, float[] fs, float[] fs_693_,
		     float[] fs_694_, float[] fs_695_, float[] fs_696_,
		     int i_697_) {
	Class134 class134 = aClass134ArrayArray9519[i][i_692_];
	if (i_697_ == 0 || (i_697_ & 0x2) == 0) {
	    if (class134 != null) {
		for (int i_698_ = 0; i_698_ < class134.aShort1600; i_698_++) {
		    int i_699_ = (class134.aShortArray1601[i_698_]
				  + (i << anInt1763 * -2063427645));
		    int i_700_ = class134.aShortArray1607[i_698_];
		    int i_701_ = (class134.aShortArray1603[i_698_]
				  + (i_692_ << anInt1763 * -2063427645));
		    float f = aFloat9534 + (aFloat9531 * (float) i_699_
					    + aFloat9530 * (float) i_700_
					    + aFloat9518 * (float) i_701_);
		    float f_702_
			= aFloat9527 + (aFloat9523 * (float) i_699_
					+ aFloat9526 * (float) i_700_
					+ aFloat9528 * (float) i_701_);
		    if (f < -f_702_)
			return;
		    fs_696_[i_698_] = 0.0F;
		    if (bool) {
			float f_703_ = f - class110.aFloat1328;
			if (f_703_ > 0.0F) {
			    f_703_ /= class110.aFloat1329;
			    if (f_703_ > 1.0F)
				f_703_ = 1.0F;
			    fs_696_[i_698_] = f_703_;
			    int i_704_
				= (int) ((float) (class134.aShortArray1604
						  [i_698_])
					 * f_703_);
			    if (i_704_ > 0)
				i_700_ -= i_704_;
			}
		    } else if (class110.aBool1369) {
			float f_705_ = f - class110.aFloat1328;
			if (f_705_ > 0.0F) {
			    fs_696_[i_698_] = f_705_ / class110.aFloat1329;
			    if (fs_696_[i_698_] > 1.0F)
				fs_696_[i_698_] = 1.0F;
			}
		    }
		    float f_706_
			= aFloat9532 + (aFloat9520 * (float) i_699_
					+ aFloat9537 * (float) i_700_
					+ aFloat9522 * (float) i_701_);
		    float f_707_
			= aFloat9529 + (aFloat9521 * (float) i_699_
					+ aFloat9508 * (float) i_700_
					+ aFloat9510 * (float) i_701_);
		    fs[i_698_] = (class128.aFloat1503
				  + class128.aFloat1489 * f_706_ / f_702_);
		    fs_693_[i_698_]
			= (class128.aFloat1490
			   + class128.aFloat1491 * f_707_ / f_702_);
		    fs_694_[i_698_] = (class128.aFloat1492
				       + class128.aFloat1493 * f / f_702_);
		    fs_695_[i_698_] = f_702_;
		}
		float f = (float) (anInt1761 * 435863595);
		for (int i_708_ = 0; i_708_ < class134.aShort1605; i_708_++) {
		    int i_709_ = i_708_ * 3;
		    int i_710_ = i_709_ + 1;
		    int i_711_ = i_710_ + 1;
		    float f_712_ = fs[i_709_];
		    float f_713_ = fs[i_710_];
		    float f_714_ = fs[i_711_];
		    float f_715_ = fs_693_[i_709_];
		    float f_716_ = fs_693_[i_710_];
		    float f_717_ = fs_693_[i_711_];
		    if (((f_712_ - f_713_) * (f_717_ - f_716_)
			 - (f_715_ - f_716_) * (f_714_ - f_713_))
			> 0.0F) {
			class128.aBool1485
			    = (f_712_ < 0.0F || f_713_ < 0.0F || f_714_ < 0.0F
			       || f_712_ > (float) class128.anInt1494
			       || f_713_ > (float) class128.anInt1494
			       || f_714_ > (float) class128.anInt1494);
			if (fs_696_[i_709_] + fs_696_[i_710_] + fs_696_[i_711_]
			    < 3.0F) {
			    int i_718_ = i << anInt1763 * -2063427645;
			    int i_719_ = i_692_ << anInt1763 * -2063427645;
			    if ((class134.anIntArray1599[i_709_] & 0xffffff)
				!= 0) {
				if (class134.aShortArray1602[i_709_] != -1
				    && class134.aShortArray1602[i_710_] != -1
				    && (class134.aShortArray1602[i_711_]
					!= -1)) {
				    if ((class134.aShortArray1602[i_709_]
					 == class134.aShortArray1602[i_710_])
					&& (class134.aShortArray1602[i_709_]
					    == (class134.aShortArray1602
						[i_711_]))
					&& (class134.aShortArray1606[i_709_]
					    == (class134.aShortArray1606
						[i_710_]))
					&& (class134.aShortArray1606[i_709_]
					    == (class134.aShortArray1606
						[i_711_])))
					class128.method2248
					    (true, true, false, f_715_, f_716_,
					     f_717_, f_712_, f_713_, f_714_,
					     fs_694_[i_709_], fs_694_[i_710_],
					     fs_694_[i_711_], fs_695_[i_709_],
					     fs_695_[i_710_], fs_695_[i_711_],
					     ((float) (i_718_
						       + (class134
							  .aShortArray1601
							  [i_709_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_709_])),
					     ((float) (i_718_
						       + (class134
							  .aShortArray1601
							  [i_710_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_710_])),
					     ((float) (i_718_
						       + (class134
							  .aShortArray1601
							  [i_711_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_711_])),
					     ((float) (i_719_
						       + (class134
							  .aShortArray1603
							  [i_709_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_709_])),
					     ((float) (i_719_
						       + (class134
							  .aShortArray1603
							  [i_710_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_710_])),
					     ((float) (i_719_
						       + (class134
							  .aShortArray1603
							  [i_711_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_711_])),
					     class134.anIntArray1599[i_709_],
					     class134.anIntArray1599[i_710_],
					     class134.anIntArray1599[i_711_],
					     class110.anInt1330 * 296717011,
					     fs_696_[i_709_] * 255.0F,
					     fs_696_[i_710_] * 255.0F,
					     fs_696_[i_711_] * 255.0F,
					     (class134.aShortArray1602[i_709_]
					      & 0xffff));
				    else
					class128.method2250
					    (true, true, false, f_715_, f_716_,
					     f_717_, f_712_, f_713_, f_714_,
					     fs_694_[i_709_], fs_694_[i_710_],
					     fs_694_[i_711_], fs_695_[i_709_],
					     fs_695_[i_710_], fs_695_[i_711_],
					     (float) (i_718_
						      + (class134
							 .aShortArray1601
							 [i_709_])) / f,
					     (float) (i_718_
						      + (class134
							 .aShortArray1601
							 [i_710_])) / f,
					     (float) (i_718_
						      + (class134
							 .aShortArray1601
							 [i_711_])) / f,
					     (float) (i_719_
						      + (class134
							 .aShortArray1603
							 [i_709_])) / f,
					     (float) (i_719_
						      + (class134
							 .aShortArray1603
							 [i_710_])) / f,
					     (float) (i_719_
						      + (class134
							 .aShortArray1603
							 [i_711_])) / f,
					     class134.anIntArray1599[i_709_],
					     class134.anIntArray1599[i_710_],
					     class134.anIntArray1599[i_711_],
					     class110.anInt1330 * 296717011,
					     fs_696_[i_709_] * 255.0F,
					     fs_696_[i_710_] * 255.0F,
					     fs_696_[i_711_] * 255.0F,
					     (class134.aShortArray1602[i_709_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_709_]),
					     (class134.aShortArray1602[i_710_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_710_]),
					     (class134.aShortArray1602[i_711_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_711_]));
				} else if ((fs_696_[i_709_] + fs_696_[i_710_]
					    + fs_696_[i_711_])
					   > 0.0F)
				    class128.method2243
					(true, true, false, f_715_, f_716_,
					 f_717_, f_712_, f_713_, f_714_,
					 fs_694_[i_709_], fs_694_[i_710_],
					 fs_694_[i_711_],
					 (Class637.method10513
					  (class134.anIntArray1599[i_709_],
					   class110.anInt1330 * 296717011,
					   fs_696_[i_709_] * 255.0F,
					   -1264130926)),
					 (Class637.method10513
					  (class134.anIntArray1599[i_710_],
					   class110.anInt1330 * 296717011,
					   fs_696_[i_710_] * 255.0F,
					   -713842595)),
					 (Class637.method10513
					  (class134.anIntArray1599[i_711_],
					   class110.anInt1330 * 296717011,
					   fs_696_[i_711_] * 255.0F,
					   1234667755)));
				else
				    class128.method2243
					(true, true, false, f_715_, f_716_,
					 f_717_, f_712_, f_713_, f_714_,
					 fs_694_[i_709_], fs_694_[i_710_],
					 fs_694_[i_711_],
					 class134.anIntArray1599[i_709_],
					 class134.anIntArray1599[i_710_],
					 class134.anIntArray1599[i_711_]);
			    }
			} else
			    class128.method2256(true, true, false, f_715_,
						f_716_, f_717_, f_712_, f_713_,
						f_714_, fs_694_[i_709_],
						fs_694_[i_710_],
						fs_694_[i_711_],
						(class110.anInt1330
						 * 296717011));
		    }
		}
	    }
	}
    }
    
    public void method2602(int i, int i_720_, int i_721_) {
	i = Math.min(aByteArrayArray9525.length - 1, Math.max(0, i));
	i_720_
	    = Math.min(aByteArrayArray9525[i].length - 1, Math.max(0, i_720_));
	if (aByteArrayArray9525[i][i_720_] < i_721_)
	    aByteArrayArray9525[i][i_720_] = (byte) i_721_;
    }
    
    void method15260(int i, int i_722_, int i_723_, int i_724_, int i_725_,
		     int i_726_, int i_727_, boolean[][] bools,
		     Class110 class110, Class128 class128, float[] fs,
		     float[] fs_728_) {
	int i_729_ = (i_727_ - i_725_) * i_723_ / 256;
	int i_730_ = i_723_ >> 8;
	boolean bool = class110.aBool1335;
	aClass182_Sub2_9513.method3235(false);
	class128.aBool1482 = false;
	class128.aBool1483 = false;
	int i_731_ = i;
	int i_732_ = i_722_ + i_729_;
	for (int i_733_ = i_724_; i_733_ < i_726_; i_733_++) {
	    for (int i_734_ = i_725_; i_734_ < i_727_; i_734_++) {
		if (bools[i_733_ - i_724_][i_734_ - i_725_]) {
		    if (aClass129ArrayArray9515[i_733_][i_734_] != null) {
			Class129 class129
			    = aClass129ArrayArray9515[i_733_][i_734_];
			if (class129.aShort1526 != -1
			    && (class129.aByte1524 & 0x2) == 0
			    && class129.anInt1520 == -1) {
			    int i_735_
				= aClass182_Sub2_9513.method15168((class129
								   .aShort1526)
								  & 0xffff);
			    class128.method2266
				(true, true, false, (float) (i_732_ - i_730_),
				 (float) (i_732_ - i_730_), (float) i_732_,
				 (float) (i_731_ + i_730_), (float) i_731_,
				 (float) (i_731_ + i_730_), 100.0F, 100.0F,
				 100.0F,
				 (float) Class159.method2568(i_735_,
							     ((class129
							       .aShort1525)
							      & 0xffff),
							     -371202818),
				 (float) Class159.method2568(i_735_,
							     ((class129
							       .aShort1523)
							      & 0xffff),
							     1863705199),
				 (float) Class159.method2568(i_735_,
							     ((class129
							       .aShort1522)
							      & 0xffff),
							     -1605921845));
			    class128.method2266
				(true, true, false, (float) i_732_,
				 (float) i_732_, (float) (i_732_ - i_730_),
				 (float) i_731_, (float) (i_731_ + i_730_),
				 (float) i_731_, 100.0F, 100.0F, 100.0F,
				 (float) Class159.method2568(i_735_,
							     ((class129
							       .aShort1521)
							      & 0xffff),
							     -1352448025),
				 (float) Class159.method2568(i_735_,
							     ((class129
							       .aShort1522)
							      & 0xffff),
							     1453689096),
				 (float) Class159.method2568(i_735_,
							     ((class129
							       .aShort1523)
							      & 0xffff),
							     321475822));
			} else if (class129.anInt1520 == -1) {
			    class128.method2266
				(true, true, false, (float) (i_732_ - i_730_),
				 (float) (i_732_ - i_730_), (float) i_732_,
				 (float) (i_731_ + i_730_), (float) i_731_,
				 (float) (i_731_ + i_730_), 100.0F, 100.0F,
				 100.0F,
				 (float) (class129.aShort1525 & 0xffff),
				 (float) (class129.aShort1523 & 0xffff),
				 (float) (class129.aShort1522 & 0xffff));
			    class128.method2266
				(true, true, false, (float) i_732_,
				 (float) i_732_, (float) (i_732_ - i_730_),
				 (float) i_731_, (float) (i_731_ + i_730_),
				 (float) i_731_, 100.0F, 100.0F, 100.0F,
				 (float) (class129.aShort1521 & 0xffff),
				 (float) (class129.aShort1522 & 0xffff),
				 (float) (class129.aShort1523 & 0xffff));
			} else {
			    int i_736_ = class129.anInt1520;
			    class128.method2266(true, true, false,
						(float) (i_732_ - i_730_),
						(float) (i_732_ - i_730_),
						(float) i_732_,
						(float) (i_731_ + i_730_),
						(float) i_731_,
						(float) (i_731_ + i_730_),
						100.0F, 100.0F, 100.0F,
						(float) i_736_, (float) i_736_,
						(float) i_736_);
			    class128.method2266(true, true, false,
						(float) i_732_, (float) i_732_,
						(float) (i_732_ - i_730_),
						(float) i_731_,
						(float) (i_731_ + i_730_),
						(float) i_731_, 100.0F, 100.0F,
						100.0F, (float) i_736_,
						(float) i_736_,
						(float) i_736_);
			}
		    } else if (aClass114ArrayArray9535[i_733_][i_734_]
			       != null) {
			Class114 class114
			    = aClass114ArrayArray9535[i_733_][i_734_];
			for (int i_737_ = 0; i_737_ < class114.aShort1393;
			     i_737_++) {
			    fs[i_737_]
				= (float) (i_731_
					   + (class114.aShortArray1395[i_737_]
					      * i_730_
					      / (anInt1761 * 435863595)));
			    fs_728_[i_737_]
				= (float) (i_732_
					   - (class114.aShortArray1398[i_737_]
					      * i_730_
					      / (anInt1761 * 435863595)));
			}
			for (int i_738_ = 0; i_738_ < class114.aShort1396;
			     i_738_++) {
			    short i_739_ = class114.aShortArray1399[i_738_];
			    short i_740_ = class114.aShortArray1400[i_738_];
			    short i_741_ = class114.aShortArray1401[i_738_];
			    float f = fs[i_739_];
			    float f_742_ = fs[i_740_];
			    float f_743_ = fs[i_741_];
			    float f_744_ = fs_728_[i_739_];
			    float f_745_ = fs_728_[i_740_];
			    float f_746_ = fs_728_[i_741_];
			    if (class114.anIntArray1405 != null
				&& class114.anIntArray1405[i_738_] != -1) {
				int i_747_ = class114.anIntArray1405[i_738_];
				class128.method2266
				    (true, true, false, f_744_, f_745_, f_746_,
				     f, f_742_, f_743_, 100.0F, 100.0F, 100.0F,
				     (float) (Class159.method2568
					      (i_747_,
					       (class114.aShortArray1403
						[i_739_]),
					       2016422082)),
				     (float) (Class159.method2568
					      (i_747_,
					       (class114.aShortArray1403
						[i_740_]),
					       227905610)),
				     (float) (Class159.method2568
					      (i_747_,
					       (class114.aShortArray1403
						[i_741_]),
					       -1950514883)));
			    } else if (class114.aShortArray1402 != null
				       && (class114.aShortArray1402[i_738_]
					   != -1)) {
				int i_748_ = (aClass182_Sub2_9513.method15168
					      (class114.aShortArray1402[i_738_]
					       & 0xffff));
				class128.method2266
				    (true, true, false, f_744_, f_745_, f_746_,
				     f, f_742_, f_743_, 100.0F, 100.0F, 100.0F,
				     (float) (Class159.method2568
					      (i_748_,
					       (class114.aShortArray1403
						[i_739_]),
					       -1940354012)),
				     (float) (Class159.method2568
					      (i_748_,
					       (class114.aShortArray1403
						[i_740_]),
					       -290122358)),
				     (float) (Class159.method2568
					      (i_748_,
					       (class114.aShortArray1403
						[i_741_]),
					       1287363348)));
			    } else {
				int i_749_ = class114.anIntArray1392[i_738_];
				class128.method2266
				    (true, true, false, f_744_, f_745_, f_746_,
				     f, f_742_, f_743_, 100.0F, 100.0F, 100.0F,
				     (float) (Class159.method2568
					      (i_749_,
					       (class114.aShortArray1403
						[i_739_]),
					       -1173765871)),
				     (float) (Class159.method2568
					      (i_749_,
					       (class114.aShortArray1403
						[i_740_]),
					       520275510)),
				     (float) (Class159.method2568
					      (i_749_,
					       (class114.aShortArray1403
						[i_741_]),
					       -1090239457)));
			    }
			}
		    }
		}
		i_732_ -= i_730_;
	    }
	    i_732_ = i_722_ + i_729_;
	    i_731_ += i_730_;
	}
	class128.aBool1482 = true;
	aClass182_Sub2_9513.method3235(bool);
    }
    
    void method15261(int i, int i_750_, int i_751_, int i_752_, int i_753_,
		     int i_754_, int i_755_, boolean[][] bools,
		     Class110 class110, Class128 class128, float[] fs,
		     float[] fs_756_) {
	int i_757_ = (i_755_ - i_753_) * i_751_ / 256;
	int i_758_ = i_751_ >> 8;
	boolean bool = class110.aBool1335;
	aClass182_Sub2_9513.method3235(false);
	class128.aBool1482 = false;
	class128.aBool1483 = false;
	int i_759_ = i;
	int i_760_ = i_750_ + i_757_;
	for (int i_761_ = i_752_; i_761_ < i_754_; i_761_++) {
	    for (int i_762_ = i_753_; i_762_ < i_755_; i_762_++) {
		if (bools[i_761_ - i_752_][i_762_ - i_753_]) {
		    if (aClass129ArrayArray9515[i_761_][i_762_] != null) {
			Class129 class129
			    = aClass129ArrayArray9515[i_761_][i_762_];
			if (class129.aShort1526 != -1
			    && (class129.aByte1524 & 0x2) == 0
			    && class129.anInt1520 == -1) {
			    int i_763_
				= aClass182_Sub2_9513.method15168((class129
								   .aShort1526)
								  & 0xffff);
			    class128.method2266
				(true, true, false, (float) (i_760_ - i_758_),
				 (float) (i_760_ - i_758_), (float) i_760_,
				 (float) (i_759_ + i_758_), (float) i_759_,
				 (float) (i_759_ + i_758_), 100.0F, 100.0F,
				 100.0F,
				 (float) Class159.method2568(i_763_,
							     ((class129
							       .aShort1525)
							      & 0xffff),
							     1962808371),
				 (float) Class159.method2568(i_763_,
							     ((class129
							       .aShort1523)
							      & 0xffff),
							     -1818228350),
				 (float) Class159.method2568(i_763_,
							     ((class129
							       .aShort1522)
							      & 0xffff),
							     1775120728));
			    class128.method2266
				(true, true, false, (float) i_760_,
				 (float) i_760_, (float) (i_760_ - i_758_),
				 (float) i_759_, (float) (i_759_ + i_758_),
				 (float) i_759_, 100.0F, 100.0F, 100.0F,
				 (float) Class159.method2568(i_763_,
							     ((class129
							       .aShort1521)
							      & 0xffff),
							     -1228622584),
				 (float) Class159.method2568(i_763_,
							     ((class129
							       .aShort1522)
							      & 0xffff),
							     -1827567454),
				 (float) Class159.method2568(i_763_,
							     ((class129
							       .aShort1523)
							      & 0xffff),
							     -994047200));
			} else if (class129.anInt1520 == -1) {
			    class128.method2266
				(true, true, false, (float) (i_760_ - i_758_),
				 (float) (i_760_ - i_758_), (float) i_760_,
				 (float) (i_759_ + i_758_), (float) i_759_,
				 (float) (i_759_ + i_758_), 100.0F, 100.0F,
				 100.0F,
				 (float) (class129.aShort1525 & 0xffff),
				 (float) (class129.aShort1523 & 0xffff),
				 (float) (class129.aShort1522 & 0xffff));
			    class128.method2266
				(true, true, false, (float) i_760_,
				 (float) i_760_, (float) (i_760_ - i_758_),
				 (float) i_759_, (float) (i_759_ + i_758_),
				 (float) i_759_, 100.0F, 100.0F, 100.0F,
				 (float) (class129.aShort1521 & 0xffff),
				 (float) (class129.aShort1522 & 0xffff),
				 (float) (class129.aShort1523 & 0xffff));
			} else {
			    int i_764_ = class129.anInt1520;
			    class128.method2266(true, true, false,
						(float) (i_760_ - i_758_),
						(float) (i_760_ - i_758_),
						(float) i_760_,
						(float) (i_759_ + i_758_),
						(float) i_759_,
						(float) (i_759_ + i_758_),
						100.0F, 100.0F, 100.0F,
						(float) i_764_, (float) i_764_,
						(float) i_764_);
			    class128.method2266(true, true, false,
						(float) i_760_, (float) i_760_,
						(float) (i_760_ - i_758_),
						(float) i_759_,
						(float) (i_759_ + i_758_),
						(float) i_759_, 100.0F, 100.0F,
						100.0F, (float) i_764_,
						(float) i_764_,
						(float) i_764_);
			}
		    } else if (aClass114ArrayArray9535[i_761_][i_762_]
			       != null) {
			Class114 class114
			    = aClass114ArrayArray9535[i_761_][i_762_];
			for (int i_765_ = 0; i_765_ < class114.aShort1393;
			     i_765_++) {
			    fs[i_765_]
				= (float) (i_759_
					   + (class114.aShortArray1395[i_765_]
					      * i_758_
					      / (anInt1761 * 435863595)));
			    fs_756_[i_765_]
				= (float) (i_760_
					   - (class114.aShortArray1398[i_765_]
					      * i_758_
					      / (anInt1761 * 435863595)));
			}
			for (int i_766_ = 0; i_766_ < class114.aShort1396;
			     i_766_++) {
			    short i_767_ = class114.aShortArray1399[i_766_];
			    short i_768_ = class114.aShortArray1400[i_766_];
			    short i_769_ = class114.aShortArray1401[i_766_];
			    float f = fs[i_767_];
			    float f_770_ = fs[i_768_];
			    float f_771_ = fs[i_769_];
			    float f_772_ = fs_756_[i_767_];
			    float f_773_ = fs_756_[i_768_];
			    float f_774_ = fs_756_[i_769_];
			    if (class114.anIntArray1405 != null
				&& class114.anIntArray1405[i_766_] != -1) {
				int i_775_ = class114.anIntArray1405[i_766_];
				class128.method2266
				    (true, true, false, f_772_, f_773_, f_774_,
				     f, f_770_, f_771_, 100.0F, 100.0F, 100.0F,
				     (float) (Class159.method2568
					      (i_775_,
					       (class114.aShortArray1403
						[i_767_]),
					       1609555406)),
				     (float) (Class159.method2568
					      (i_775_,
					       (class114.aShortArray1403
						[i_768_]),
					       -317931170)),
				     (float) (Class159.method2568
					      (i_775_,
					       (class114.aShortArray1403
						[i_769_]),
					       -1580500883)));
			    } else if (class114.aShortArray1402 != null
				       && (class114.aShortArray1402[i_766_]
					   != -1)) {
				int i_776_ = (aClass182_Sub2_9513.method15168
					      (class114.aShortArray1402[i_766_]
					       & 0xffff));
				class128.method2266
				    (true, true, false, f_772_, f_773_, f_774_,
				     f, f_770_, f_771_, 100.0F, 100.0F, 100.0F,
				     (float) (Class159.method2568
					      (i_776_,
					       (class114.aShortArray1403
						[i_767_]),
					       1420544014)),
				     (float) (Class159.method2568
					      (i_776_,
					       (class114.aShortArray1403
						[i_768_]),
					       901771246)),
				     (float) (Class159.method2568
					      (i_776_,
					       (class114.aShortArray1403
						[i_769_]),
					       1428069576)));
			    } else {
				int i_777_ = class114.anIntArray1392[i_766_];
				class128.method2266
				    (true, true, false, f_772_, f_773_, f_774_,
				     f, f_770_, f_771_, 100.0F, 100.0F, 100.0F,
				     (float) (Class159.method2568
					      (i_777_,
					       (class114.aShortArray1403
						[i_767_]),
					       -695752526)),
				     (float) (Class159.method2568
					      (i_777_,
					       (class114.aShortArray1403
						[i_768_]),
					       -1335216645)),
				     (float) (Class159.method2568
					      (i_777_,
					       (class114.aShortArray1403
						[i_769_]),
					       618795548)));
			    }
			}
		    }
		}
		i_760_ -= i_758_;
	    }
	    i_760_ = i_750_ + i_757_;
	    i_759_ += i_758_;
	}
	class128.aBool1482 = true;
	aClass182_Sub2_9513.method3235(bool);
    }
    
    void method15262(int i, int i_778_, int i_779_, int i_780_, int i_781_,
		     int i_782_, int i_783_, boolean[][] bools,
		     Class110 class110, Class128 class128, float[] fs,
		     float[] fs_784_) {
	int i_785_ = (i_783_ - i_781_) * i_779_ / 256;
	int i_786_ = i_779_ >> 8;
	boolean bool = class110.aBool1335;
	aClass182_Sub2_9513.method3235(false);
	class128.aBool1482 = false;
	class128.aBool1483 = false;
	int i_787_ = i;
	int i_788_ = i_778_ + i_785_;
	for (int i_789_ = i_780_; i_789_ < i_782_; i_789_++) {
	    for (int i_790_ = i_781_; i_790_ < i_783_; i_790_++) {
		if (bools[i_789_ - i_780_][i_790_ - i_781_]) {
		    if (aClass123ArrayArray9517 != null) {
			if (aClass123ArrayArray9517[i_789_][i_790_] != null) {
			    Class123 class123
				= aClass123ArrayArray9517[i_789_][i_790_];
			    if (class123.aShort1456 != -1
				&& (class123.aByte1451 & 0x2) == 0
				&& class123.anInt1455 == 0) {
				int i_791_ = (aClass182_Sub2_9513.method15168
					      (class123.aShort1456 & 0xffff));
				class128.method2266
				    (true, true, false,
				     (float) (i_788_ - i_786_),
				     (float) (i_788_ - i_786_), (float) i_788_,
				     (float) (i_787_ + i_786_), (float) i_787_,
				     (float) (i_787_ + i_786_), 100.0F, 100.0F,
				     100.0F,
				     (float) Class159.method2568(i_791_,
								 (class123
								  .anInt1447),
								 -2022500481),
				     (float) Class159.method2568(i_791_,
								 (class123
								  .anInt1450),
								 1109767583),
				     (float) Class159.method2568(i_791_,
								 (class123
								  .anInt1446),
								 1518084136));
				class128.method2266
				    (true, true, false, (float) i_788_,
				     (float) i_788_, (float) (i_788_ - i_786_),
				     (float) i_787_, (float) (i_787_ + i_786_),
				     (float) i_787_, 100.0F, 100.0F, 100.0F,
				     (float) Class159.method2568(i_791_,
								 (class123
								  .anInt1453),
								 1313482444),
				     (float) Class159.method2568(i_791_,
								 (class123
								  .anInt1446),
								 1687855181),
				     (float) Class159.method2568(i_791_,
								 (class123
								  .anInt1450),
								 694609004));
			    } else if (class123.anInt1455 == 0) {
				class128.method2243(true, true, false,
						    (float) (i_788_ - i_786_),
						    (float) (i_788_ - i_786_),
						    (float) i_788_,
						    (float) (i_787_ + i_786_),
						    (float) i_787_,
						    (float) (i_787_ + i_786_),
						    100.0F, 100.0F, 100.0F,
						    class123.anInt1447,
						    class123.anInt1450,
						    class123.anInt1446);
				class128.method2243(true, true, false,
						    (float) i_788_,
						    (float) i_788_,
						    (float) (i_788_ - i_786_),
						    (float) i_787_,
						    (float) (i_787_ + i_786_),
						    (float) i_787_, 100.0F,
						    100.0F, 100.0F,
						    class123.anInt1453,
						    class123.anInt1446,
						    class123.anInt1450);
			    } else {
				int i_792_ = class123.anInt1455;
				class128.method2243
				    (true, true, false,
				     (float) (i_788_ - i_786_),
				     (float) (i_788_ - i_786_), (float) i_788_,
				     (float) (i_787_ + i_786_), (float) i_787_,
				     (float) (i_787_ + i_786_), 100.0F, 100.0F,
				     100.0F,
				     Class619.method10166(i_792_,
							  (class123.anInt1447
							   & ~0xffffff),
							  -1696564426),
				     Class619.method10166(i_792_,
							  (class123.anInt1450
							   & ~0xffffff),
							  -1416066510),
				     Class619.method10166(i_792_,
							  (class123.anInt1446
							   & ~0xffffff),
							  544285408));
				class128.method2243
				    (true, true, false, (float) i_788_,
				     (float) i_788_, (float) (i_788_ - i_786_),
				     (float) i_787_, (float) (i_787_ + i_786_),
				     (float) i_787_, 100.0F, 100.0F, 100.0F,
				     Class619.method10166(i_792_,
							  (class123.anInt1453
							   & ~0xffffff),
							  -186608595),
				     Class619.method10166(i_792_,
							  (class123.anInt1446
							   & ~0xffffff),
							  -1684583688),
				     Class619.method10166(i_792_,
							  (class123.anInt1450
							   & ~0xffffff),
							  -725659427));
			    }
			} else if (aClass127ArrayArray9524[i_789_][i_790_]
				   != null) {
			    Class127 class127
				= aClass127ArrayArray9524[i_789_][i_790_];
			    for (int i_793_ = 0; i_793_ < class127.aShort1471;
				 i_793_++) {
				fs[i_793_]
				    = (float) (i_787_
					       + ((class127.aShortArray1473
						   [i_793_])
						  * i_786_
						  / (anInt1761 * 435863595)));
				fs_784_[i_793_]
				    = (float) (i_788_
					       - ((class127.aShortArray1470
						   [i_793_])
						  * i_786_
						  / (anInt1761 * 435863595)));
			    }
			    for (int i_794_ = 0; i_794_ < class127.aShort1474;
				 i_794_++) {
				int i_795_ = i_794_ * 3;
				int i_796_ = i_795_ + 1;
				int i_797_ = i_796_ + 1;
				float f = fs[i_795_];
				float f_798_ = fs[i_796_];
				float f_799_ = fs[i_797_];
				float f_800_ = fs_784_[i_795_];
				float f_801_ = fs_784_[i_796_];
				float f_802_ = fs_784_[i_797_];
				if (class127.anIntArray1480 != null
				    && class127.anIntArray1480[i_794_] != 0
				    && (class127.aShortArray1478 == null
					|| (class127.aShortArray1478 != null
					    && (class127.aShortArray1478
						[i_794_]) == -1))) {
				    int i_803_
					= class127.anIntArray1480[i_794_];
				    class128.method2243
					(true, true, false, f_800_, f_801_,
					 f_802_, f, f_798_, f_799_, 100.0F,
					 100.0F, 100.0F,
					 (Class619.method10166
					  (i_803_,
					   (-16777216
					    - (class127.anIntArray1475[i_795_]
					       & ~0xffffff)),
					   -1123629615)),
					 (Class619.method10166
					  (i_803_,
					   (-16777216
					    - (class127.anIntArray1475[i_796_]
					       & ~0xffffff)),
					   32836215)),
					 (Class619.method10166
					  (i_803_,
					   (-16777216
					    - (class127.anIntArray1475[i_797_]
					       & ~0xffffff)),
					   506257734)));
				} else if (class127.aShortArray1478 != null
					   && (class127.aShortArray1478[i_794_]
					       != -1)) {
				    int i_804_
					= (aClass182_Sub2_9513.method15168
					   (class127.aShortArray1478[i_794_]
					    & 0xffff));
				    class128.method2266(true, true, false,
							f_800_, f_801_, f_802_,
							f, f_798_, f_799_,
							100.0F, 100.0F, 100.0F,
							(float) i_804_,
							(float) i_804_,
							(float) i_804_);
				} else
				    class128.method2243
					(true, true, false, f_800_, f_801_,
					 f_802_, f, f_798_, f_799_, 100.0F,
					 100.0F, 100.0F,
					 class127.anIntArray1475[i_795_],
					 class127.anIntArray1475[i_796_],
					 class127.anIntArray1475[i_797_]);
			    }
			}
		    } else if (aClass134ArrayArray9519[i_789_][i_790_]
			       != null) {
			Class134 class134
			    = aClass134ArrayArray9519[i_789_][i_790_];
			for (int i_805_ = 0; i_805_ < class134.aShort1600;
			     i_805_++) {
			    fs[i_805_]
				= (float) (i_787_
					   + (class134.aShortArray1601[i_805_]
					      * i_786_
					      / (anInt1761 * 435863595)));
			    fs_784_[i_805_]
				= (float) (i_788_
					   - (class134.aShortArray1603[i_805_]
					      * i_786_
					      / (anInt1761 * 435863595)));
			}
			for (int i_806_ = 0; i_806_ < class134.aShort1605;
			     i_806_++) {
			    int i_807_ = i_806_ * 3;
			    int i_808_ = i_807_ + 1;
			    int i_809_ = i_808_ + 1;
			    float f = fs[i_807_];
			    float f_810_ = fs[i_808_];
			    float f_811_ = fs[i_809_];
			    float f_812_ = fs_784_[i_807_];
			    float f_813_ = fs_784_[i_808_];
			    float f_814_ = fs_784_[i_809_];
			    if (class134.anIntArray1609 != null
				&& class134.anIntArray1609[i_806_] != 0) {
				int i_815_ = class134.anIntArray1609[i_806_];
				class128.method2243(true, true, false, f_812_,
						    f_813_, f_814_, f, f_810_,
						    f_811_, 100.0F, 100.0F,
						    100.0F, i_815_, i_815_,
						    i_815_);
			    } else
				class128.method2243
				    (true, true, false, f_812_, f_813_, f_814_,
				     f, f_810_, f_811_, 100.0F, 100.0F, 100.0F,
				     class134.anIntArray1599[i_807_],
				     class134.anIntArray1599[i_808_],
				     class134.anIntArray1599[i_809_]);
			}
		    }
		}
		i_788_ -= i_786_;
	    }
	    i_788_ = i_778_ + i_785_;
	    i_787_ += i_786_;
	}
	class128.aBool1482 = true;
	aClass182_Sub2_9513.method3235(bool);
    }
    
    void method15263(int i, int i_816_, boolean bool, Class110 class110,
		     Class128 class128, float[] fs, float[] fs_817_,
		     float[] fs_818_, float[] fs_819_, float[] fs_820_,
		     int i_821_) {
	Class123 class123 = aClass123ArrayArray9517[i][i_816_];
	if (class123 != null) {
	    if ((class123.aByte1451 & 0x2) == 0) {
		if (i_821_ != 0) {
		    if ((class123.aByte1451 & 0x4) != 0) {
			if ((i_821_ & 0x1) != 0)
			    return;
		    } else if ((i_821_ & 0x2) != 0)
			return;
		}
		int i_822_ = i * (anInt1761 * 435863595);
		int i_823_ = i_822_ + anInt1761 * 435863595;
		int i_824_ = i_816_ * (anInt1761 * 435863595);
		int i_825_ = i_824_ + anInt1761 * 435863595;
		float f = 0.0F;
		float f_826_ = 0.0F;
		float f_827_ = 0.0F;
		float f_828_ = 0.0F;
		float f_829_;
		float f_830_;
		float f_831_;
		float f_832_;
		float f_833_;
		float f_834_;
		float f_835_;
		float f_836_;
		float f_837_;
		float f_838_;
		float f_839_;
		float f_840_;
		float f_841_;
		float f_842_;
		float f_843_;
		float f_844_;
		if ((class123.aByte1451 & 0x1) != 0 && !bool) {
		    int i_845_ = anIntArrayArray1762[i][i_816_];
		    float f_846_ = aFloat9530 * (float) i_845_;
		    float f_847_ = aFloat9526 * (float) i_845_;
		    float f_848_
			= aFloat9534 + (aFloat9531 * (float) i_822_ + f_846_
					+ aFloat9518 * (float) i_824_);
		    f_829_ = aFloat9527 + (aFloat9523 * (float) i_822_ + f_847_
					   + aFloat9528 * (float) i_824_);
		    if (f_848_ < -f_829_)
			return;
		    float f_849_
			= aFloat9534 + (aFloat9531 * (float) i_823_ + f_846_
					+ aFloat9518 * (float) i_824_);
		    f_830_ = aFloat9527 + (aFloat9523 * (float) i_823_ + f_847_
					   + aFloat9528 * (float) i_824_);
		    if (f_849_ < -f_830_)
			return;
		    float f_850_
			= aFloat9534 + (aFloat9531 * (float) i_823_ + f_846_
					+ aFloat9518 * (float) i_825_);
		    f_831_ = aFloat9527 + (aFloat9523 * (float) i_823_ + f_847_
					   + aFloat9528 * (float) i_825_);
		    if (f_850_ < -f_831_)
			return;
		    float f_851_
			= aFloat9534 + (aFloat9531 * (float) i_822_ + f_846_
					+ aFloat9518 * (float) i_825_);
		    f_832_ = aFloat9527 + (aFloat9523 * (float) i_822_ + f_847_
					   + aFloat9528 * (float) i_825_);
		    if (f_851_ < -f_832_)
			return;
		    f_833_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_848_ / f_829_);
		    f_834_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_849_ / f_830_);
		    f_835_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_850_ / f_831_);
		    f_836_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_851_ / f_832_);
		    if (class110.aBool1369) {
			float f_852_ = f_848_ - class110.aFloat1328;
			if (f_852_ > 0.0F) {
			    f = f_852_ / class110.aFloat1329;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_852_ = f_849_ - class110.aFloat1328;
			if (f_852_ > 0.0F) {
			    f_826_ = f_852_ / class110.aFloat1329;
			    if (f_826_ > 1.0F)
				f_826_ = 1.0F;
			}
			f_852_ = f_850_ - class110.aFloat1328;
			if (f_852_ > 0.0F) {
			    f_827_ = f_852_ / class110.aFloat1329;
			    if (f_827_ > 1.0F)
				f_827_ = 1.0F;
			}
			f_852_ = f_851_ - class110.aFloat1328;
			if (f_852_ > 0.0F) {
			    f_828_ = f_852_ / class110.aFloat1329;
			    if (f_828_ > 1.0F)
				f_828_ = 1.0F;
			}
		    }
		    float f_853_ = aFloat9537 * (float) i_845_;
		    float f_854_ = aFloat9508 * (float) i_845_;
		    float f_855_
			= aFloat9532 + (aFloat9520 * (float) i_822_ + f_853_
					+ aFloat9522 * (float) i_824_);
		    f_837_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_855_ / f_829_);
		    float f_856_
			= aFloat9529 + (aFloat9521 * (float) i_822_ + f_854_
					+ aFloat9510 * (float) i_824_);
		    f_838_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_856_ / f_829_);
		    float f_857_
			= aFloat9532 + (aFloat9520 * (float) i_823_ + f_853_
					+ aFloat9522 * (float) i_824_);
		    f_839_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_857_ / f_830_);
		    float f_858_
			= aFloat9529 + (aFloat9521 * (float) i_823_ + f_854_
					+ aFloat9510 * (float) i_824_);
		    f_840_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_858_ / f_830_);
		    float f_859_
			= aFloat9532 + (aFloat9520 * (float) i_823_ + f_853_
					+ aFloat9522 * (float) i_825_);
		    f_841_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_859_ / f_831_);
		    float f_860_
			= aFloat9529 + (aFloat9521 * (float) i_823_ + f_854_
					+ aFloat9510 * (float) i_825_);
		    f_842_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_860_ / f_831_);
		    float f_861_
			= aFloat9532 + (aFloat9520 * (float) i_822_ + f_853_
					+ aFloat9522 * (float) i_825_);
		    f_843_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_861_ / f_832_);
		    float f_862_
			= aFloat9529 + (aFloat9521 * (float) i_822_ + f_854_
					+ aFloat9510 * (float) i_825_);
		    f_844_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_862_ / f_832_);
		} else {
		    int i_863_ = anIntArrayArray1762[i][i_816_];
		    int i_864_ = anIntArrayArray1762[i + 1][i_816_];
		    int i_865_ = anIntArrayArray1762[i + 1][i_816_ + 1];
		    int i_866_ = anIntArrayArray1762[i][i_816_ + 1];
		    float f_867_
			= aFloat9534 + (aFloat9531 * (float) i_822_
					+ aFloat9530 * (float) i_863_
					+ aFloat9518 * (float) i_824_);
		    f_829_ = aFloat9527 + (aFloat9523 * (float) i_822_
					   + aFloat9526 * (float) i_863_
					   + aFloat9528 * (float) i_824_);
		    if (f_867_ < -f_829_)
			return;
		    float f_868_
			= aFloat9534 + (aFloat9531 * (float) i_823_
					+ aFloat9530 * (float) i_864_
					+ aFloat9518 * (float) i_824_);
		    f_830_ = aFloat9527 + (aFloat9523 * (float) i_823_
					   + aFloat9526 * (float) i_864_
					   + aFloat9528 * (float) i_824_);
		    if (f_868_ < -f_830_)
			return;
		    float f_869_
			= aFloat9534 + (aFloat9531 * (float) i_823_
					+ aFloat9530 * (float) i_865_
					+ aFloat9518 * (float) i_825_);
		    f_831_ = aFloat9527 + (aFloat9523 * (float) i_823_
					   + aFloat9526 * (float) i_865_
					   + aFloat9528 * (float) i_825_);
		    if (f_869_ < -f_831_)
			return;
		    float f_870_
			= aFloat9534 + (aFloat9531 * (float) i_822_
					+ aFloat9530 * (float) i_866_
					+ aFloat9518 * (float) i_825_);
		    f_832_ = aFloat9527 + (aFloat9523 * (float) i_822_
					   + aFloat9526 * (float) i_866_
					   + aFloat9528 * (float) i_825_);
		    if (f_870_ < -f_832_)
			return;
		    f_833_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_867_ / f_829_);
		    f_834_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_868_ / f_830_);
		    f_835_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_869_ / f_831_);
		    f_836_ = (class128.aFloat1492
			      + class128.aFloat1493 * f_870_ / f_832_);
		    if (bool) {
			float f_871_ = f_867_ - class110.aFloat1328;
			if (f_871_ > 0.0F) {
			    f_871_ /= class110.aFloat1329;
			    if (f_871_ > 1.0F)
				f_871_ = 1.0F;
			    f = f_871_;
			    int i_872_
				= (int) ((float) class123.aShort1449 * f_871_);
			    if (i_872_ > 0)
				i_863_ -= i_872_;
			}
			f_871_ = f_868_ - class110.aFloat1328;
			if (f_871_ > 0.0F) {
			    f_871_ /= class110.aFloat1329;
			    if (f_871_ > 1.0F)
				f_871_ = 1.0F;
			    f_826_ = f_871_;
			    int i_873_
				= (int) ((float) class123.aShort1452 * f_871_);
			    if (i_873_ > 0)
				i_864_ -= i_873_;
			}
			f_871_ = f_869_ - class110.aFloat1328;
			if (f_871_ > 0.0F) {
			    f_871_ /= class110.aFloat1329;
			    if (f_871_ > 1.0F)
				f_871_ = 1.0F;
			    f_827_ = f_871_;
			    int i_874_
				= (int) ((float) class123.aShort1448 * f_871_);
			    if (i_874_ > 0)
				i_865_ -= i_874_;
			}
			f_871_ = f_870_ - class110.aFloat1328;
			if (f_871_ > 0.0F) {
			    f_871_ /= class110.aFloat1329;
			    if (f_871_ > 1.0F)
				f_871_ = 1.0F;
			    f_828_ = f_871_;
			    int i_875_
				= (int) ((float) class123.aShort1454 * f_871_);
			    if (i_875_ > 0)
				i_866_ -= i_875_;
			}
		    } else if (class110.aBool1369) {
			float f_876_ = f_867_ - class110.aFloat1328;
			if (f_876_ > 0.0F) {
			    f = f_876_ / class110.aFloat1329;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_876_ = f_868_ - class110.aFloat1328;
			if (f_876_ > 0.0F) {
			    f_826_ = f_876_ / class110.aFloat1329;
			    if (f_826_ > 1.0F)
				f_826_ = 1.0F;
			}
			f_876_ = f_869_ - class110.aFloat1328;
			if (f_876_ > 0.0F) {
			    f_827_ = f_876_ / class110.aFloat1329;
			    if (f_827_ > 1.0F)
				f_827_ = 1.0F;
			}
			f_876_ = f_870_ - class110.aFloat1328;
			if (f_876_ > 0.0F) {
			    f_828_ = f_876_ / class110.aFloat1329;
			    if (f_828_ > 1.0F)
				f_828_ = 1.0F;
			}
		    }
		    float f_877_
			= aFloat9532 + (aFloat9520 * (float) i_822_
					+ aFloat9537 * (float) i_863_
					+ aFloat9522 * (float) i_824_);
		    f_837_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_877_ / f_829_);
		    float f_878_
			= aFloat9529 + (aFloat9521 * (float) i_822_
					+ aFloat9508 * (float) i_863_
					+ aFloat9510 * (float) i_824_);
		    f_838_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_878_ / f_829_);
		    float f_879_
			= aFloat9532 + (aFloat9520 * (float) i_823_
					+ aFloat9537 * (float) i_864_
					+ aFloat9522 * (float) i_824_);
		    f_839_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_879_ / f_830_);
		    float f_880_
			= aFloat9529 + (aFloat9521 * (float) i_823_
					+ aFloat9508 * (float) i_864_
					+ aFloat9510 * (float) i_824_);
		    f_840_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_880_ / f_830_);
		    float f_881_
			= aFloat9532 + (aFloat9520 * (float) i_823_
					+ aFloat9537 * (float) i_865_
					+ aFloat9522 * (float) i_825_);
		    f_841_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_881_ / f_831_);
		    float f_882_
			= aFloat9529 + (aFloat9521 * (float) i_823_
					+ aFloat9508 * (float) i_865_
					+ aFloat9510 * (float) i_825_);
		    f_842_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_882_ / f_831_);
		    float f_883_
			= aFloat9532 + (aFloat9520 * (float) i_822_
					+ aFloat9537 * (float) i_866_
					+ aFloat9522 * (float) i_825_);
		    f_843_ = (class128.aFloat1503
			      + class128.aFloat1489 * f_883_ / f_832_);
		    float f_884_
			= aFloat9529 + (aFloat9521 * (float) i_822_
					+ aFloat9508 * (float) i_866_
					+ aFloat9510 * (float) i_825_);
		    f_844_ = (class128.aFloat1490
			      + class128.aFloat1491 * f_884_ / f_832_);
		}
		TextureMetrics class166 = null;
		boolean bool_885_ = false;
		if (class123.aShort1456 != -1) {
		    class166 = (aClass182_Sub2_9513.aClass180_1944.method3116
				(class123.aShort1456 & 0xffff, -1431554601));
		    bool_885_ = class166.aBool1801;
		}
		boolean bool_886_
		    = class166 != null && method15244(class166.aByte1825);
		float f_887_ = f_826_ + f_827_ + f_828_;
		if (((f_841_ - f_843_) * (f_840_ - f_844_)
		     - (f_842_ - f_844_) * (f_839_ - f_843_))
		    > 0.0F) {
		    class128.aBool1485
			= (f_841_ < 0.0F || f_843_ < 0.0F || f_839_ < 0.0F
			   || f_841_ > (float) class128.anInt1494
			   || f_843_ > (float) class128.anInt1494
			   || f_839_ > (float) class128.anInt1494);
		    if (f_887_ < 3.0F) {
			if (f_887_ > 0.0F) {
			    if (bool_885_) {
				int i_888_ = -16777216;
				if (bool_886_)
				    i_888_ = -1694498816;
				class128.method2248
				    (true, true, false, f_842_, f_844_, f_840_,
				     f_841_, f_843_, f_839_, f_835_, f_836_,
				     f_834_, f_831_, f_832_, f_830_, 1.0F,
				     0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				     i_888_ | class123.anInt1447 & 0xffffff,
				     i_888_ | class123.anInt1450 & 0xffffff,
				     i_888_ | class123.anInt1446 & 0xffffff,
				     class110.anInt1330 * 296717011,
				     f_827_ * 255.0F, f_828_ * 255.0F,
				     f_826_ * 255.0F,
				     class123.aShort1456 & 0xffff);
			    } else {
				if (bool_886_)
				    class128.anInt1486 = 100;
				class128.method2243
				    (true, true, false, f_842_, f_844_, f_840_,
				     f_841_, f_843_, f_839_, f_835_, f_836_,
				     f_834_,
				     (Class619.method10166
				      (class123.anInt1447,
				       ((int) (f_827_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -366525078)),
				     (Class619.method10166
				      (class123.anInt1450,
				       ((int) (f_828_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -448863657)),
				     (Class619.method10166
				      (class123.anInt1446,
				       ((int) (f_826_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       442392220)));
				class128.anInt1486 = 0;
			    }
			} else if (bool_885_) {
			    int i_889_ = -16777216;
			    if (bool_886_)
				i_889_ = -1694498816;
			    class128.method2248
				(true, true, false, f_842_, f_844_, f_840_,
				 f_841_, f_843_, f_839_, f_835_, f_836_,
				 f_834_, f_831_, f_832_, f_830_, 1.0F, 0.0F,
				 1.0F, 1.0F, 1.0F, 0.0F,
				 i_889_ | class123.anInt1447 & 0xffffff,
				 i_889_ | class123.anInt1450 & 0xffffff,
				 i_889_ | class123.anInt1446 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class123.aShort1456 & 0xffff);
			} else {
			    if (bool_886_)
				class128.anInt1486 = 100;
			    class128.method2243(true, true, false, f_842_,
						f_844_, f_840_, f_841_, f_843_,
						f_839_, f_835_, f_836_, f_834_,
						class123.anInt1447,
						class123.anInt1450,
						class123.anInt1446);
			    class128.anInt1486 = 0;
			}
		    } else
			class128.method2256(true, true, false, f_842_, f_844_,
					    f_840_, f_841_, f_843_, f_839_,
					    f_835_, f_836_, f_834_,
					    class110.anInt1330 * 296717011);
		}
		f_887_ = f + f_826_ + f_828_;
		if (((f_837_ - f_839_) * (f_844_ - f_840_)
		     - (f_838_ - f_840_) * (f_843_ - f_839_))
		    > 0.0F) {
		    class128.aBool1485
			= (f_837_ < 0.0F || f_839_ < 0.0F || f_843_ < 0.0F
			   || f_837_ > (float) class128.anInt1494
			   || f_839_ > (float) class128.anInt1494
			   || f_843_ > (float) class128.anInt1494);
		    if (f_887_ < 3.0F) {
			if (bool_886_)
			    class128.anInt1486 = -1694498816;
			if (f_887_ > 0.0F) {
			    if (bool_885_) {
				int i_890_ = -16777216;
				if (bool_886_)
				    i_890_ = -1694498816;
				class128.method2248
				    (true, true, false, f_838_, f_840_, f_844_,
				     f_837_, f_839_, f_843_, f_833_, f_834_,
				     f_836_, f_829_, f_830_, f_832_, 0.0F,
				     1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				     i_890_ | class123.anInt1453 & 0xffffff,
				     i_890_ | class123.anInt1446 & 0xffffff,
				     i_890_ | class123.anInt1450 & 0xffffff,
				     class110.anInt1330 * 296717011,
				     f * 255.0F, f_826_ * 255.0F,
				     f_828_ * 255.0F,
				     class123.aShort1456 & 0xffff);
			    } else {
				if (bool_886_)
				    class128.anInt1486 = 100;
				class128.method2243
				    (true, true, false, f_838_, f_840_, f_844_,
				     f_837_, f_839_, f_843_, f_833_, f_834_,
				     f_836_,
				     Class619.method10166(class123.anInt1453,
							  (((int) (f * 255.0F)
							    << 24)
							   | ((class110
							       .anInt1330)
							      * 296717011)),
							  -427908140),
				     (Class619.method10166
				      (class123.anInt1446,
				       ((int) (f_826_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       -1058549254)),
				     (Class619.method10166
				      (class123.anInt1450,
				       ((int) (f_828_ * 255.0F) << 24
					| class110.anInt1330 * 296717011),
				       120857261)));
				class128.anInt1486 = 0;
			    }
			} else if (bool_885_) {
			    int i_891_ = -16777216;
			    if (bool_886_)
				i_891_ = -1694498816;
			    class128.method2248
				(true, true, false, f_838_, f_840_, f_844_,
				 f_837_, f_839_, f_843_, f_833_, f_834_,
				 f_836_, f_829_, f_830_, f_832_, 0.0F, 1.0F,
				 1.0F, 0.0F, 0.0F, 1.0F,
				 i_891_ | class123.anInt1453 & 0xffffff,
				 i_891_ | class123.anInt1446 & 0xffffff,
				 i_891_ | class123.anInt1450 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class123.aShort1456 & 0xffff);
			} else {
			    if (bool_886_)
				class128.anInt1486 = 100;
			    class128.method2243(true, true, false, f_838_,
						f_840_, f_844_, f_837_, f_839_,
						f_843_, f_833_, f_834_, f_836_,
						class123.anInt1453,
						class123.anInt1446,
						class123.anInt1450);
			    class128.anInt1486 = 0;
			}
		    } else
			class128.method2256(true, true, false, f_838_, f_840_,
					    f_844_, f_837_, f_839_, f_843_,
					    f_833_, f_834_, f_836_,
					    class110.anInt1330 * 296717011);
		}
	    }
	} else {
	    Class127 class127 = aClass127ArrayArray9524[i][i_816_];
	    if (class127 != null) {
		if (i_821_ != 0) {
		    if ((class127.aByte1472 & 0x4) != 0) {
			if ((i_821_ & 0x1) != 0)
			    return;
		    } else if ((i_821_ & 0x2) != 0)
			return;
		}
		for (int i_892_ = 0; i_892_ < class127.aShort1471; i_892_++) {
		    int i_893_ = (class127.aShortArray1473[i_892_]
				  + (i << anInt1763 * -2063427645));
		    int i_894_ = class127.aShortArray1477[i_892_];
		    int i_895_ = (class127.aShortArray1470[i_892_]
				  + (i_816_ << anInt1763 * -2063427645));
		    float f = aFloat9534 + (aFloat9531 * (float) i_893_
					    + aFloat9530 * (float) i_894_
					    + aFloat9518 * (float) i_895_);
		    float f_896_
			= aFloat9527 + (aFloat9523 * (float) i_893_
					+ aFloat9526 * (float) i_894_
					+ aFloat9528 * (float) i_895_);
		    if (f < -f_896_)
			return;
		    float f_897_ = (class128.aFloat1492
				    + class128.aFloat1493 * f / f_896_);
		    fs_820_[i_892_] = 0.0F;
		    if (bool) {
			float f_898_ = f - class110.aFloat1328;
			if (f_898_ > 0.0F) {
			    f_898_ /= class110.aFloat1329;
			    if (f_898_ > 1.0F)
				f_898_ = 1.0F;
			    fs_820_[i_892_] = f_898_;
			    int i_899_
				= (int) ((float) (class127.aShortArray1476
						  [i_892_])
					 * f_898_);
			    if (i_899_ > 0)
				i_894_ -= i_899_;
			}
		    } else if (class110.aBool1369) {
			float f_900_ = f - class110.aFloat1328;
			if (f_900_ > 0.0F) {
			    fs_820_[i_892_] = f_900_ / class110.aFloat1329;
			    if (fs_820_[i_892_] > 1.0F)
				fs_820_[i_892_] = 1.0F;
			}
		    }
		    float f_901_
			= aFloat9532 + (aFloat9520 * (float) i_893_
					+ aFloat9537 * (float) i_894_
					+ aFloat9522 * (float) i_895_);
		    float f_902_
			= aFloat9529 + (aFloat9521 * (float) i_893_
					+ aFloat9508 * (float) i_894_
					+ aFloat9510 * (float) i_895_);
		    fs[i_892_] = (class128.aFloat1503
				  + class128.aFloat1489 * f_901_ / f_896_);
		    fs_817_[i_892_]
			= (class128.aFloat1490
			   + class128.aFloat1491 * f_902_ / f_896_);
		    fs_818_[i_892_] = f_897_;
		    fs_819_[i_892_] = f_896_;
		}
		if (class127.aShortArray1478 != null) {
		    for (int i_903_ = 0; i_903_ < class127.aShort1474;
			 i_903_++) {
			int i_904_ = i_903_ * 3;
			int i_905_ = i_904_ + 1;
			int i_906_ = i_905_ + 1;
			float f = fs[i_904_];
			float f_907_ = fs[i_905_];
			float f_908_ = fs[i_906_];
			float f_909_ = fs_817_[i_904_];
			float f_910_ = fs_817_[i_905_];
			float f_911_ = fs_817_[i_906_];
			float f_912_ = (fs_820_[i_904_] + fs_820_[i_905_]
					+ fs_820_[i_906_]);
			if (((f - f_907_) * (f_911_ - f_910_)
			     - (f_909_ - f_910_) * (f_908_ - f_907_))
			    > 0.0F) {
			    class128.aBool1485
				= (f < 0.0F || f_907_ < 0.0F || f_908_ < 0.0F
				   || f > (float) class128.anInt1494
				   || f_907_ > (float) class128.anInt1494
				   || f_908_ > (float) class128.anInt1494);
			    TextureMetrics class166 = null;
			    boolean bool_913_ = false;
			    if (class127.aShortArray1478[i_903_] != -1) {
				class166 = (aClass182_Sub2_9513
						.aClass180_1944.method3116
					    ((class127.aShortArray1478[i_903_]
					      & 0xffff),
					     -1431554601));
				bool_913_ = class166.aBool1801;
			    }
			    if (f_912_ < 3.0F) {
				if (f_912_ > 0.0F) {
				    if (bool_913_) {
					int i_914_ = -16777216;
					if (method15244(class166.aByte1825))
					    i_914_ = -1694498816;
					class128.method2248
					    (true, true, false, f_909_, f_910_,
					     f_911_, f, f_907_, f_908_,
					     fs_818_[i_904_], fs_818_[i_905_],
					     fs_818_[i_906_], fs_819_[i_904_],
					     fs_819_[i_905_], fs_819_[i_906_],
					     ((float) (class127.aShortArray1473
						       [i_904_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1473
						       [i_905_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1473
						       [i_906_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1470
						       [i_904_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1470
						       [i_905_])
					      / (float) (anInt1761
							 * 435863595)),
					     ((float) (class127.aShortArray1470
						       [i_906_])
					      / (float) (anInt1761
							 * 435863595)),
					     i_914_ | (class127.anIntArray1475
						       [i_904_]) & 0xffffff,
					     i_914_ | (class127.anIntArray1475
						       [i_905_]) & 0xffffff,
					     i_914_ | (class127.anIntArray1475
						       [i_906_]) & 0xffffff,
					     class110.anInt1330 * 296717011,
					     fs_820_[i_904_] * 255.0F,
					     fs_820_[i_905_] * 255.0F,
					     fs_820_[i_906_] * 255.0F,
					     (class127.aShortArray1478[i_903_]
					      & 0xffff));
				    } else if ((class127.anIntArray1475[i_904_]
						& 0xffffff)
					       != 0) {
					class128.method2243
					    (true, true, false, f_909_, f_910_,
					     f_911_, f, f_907_, f_908_,
					     fs_818_[i_904_], fs_818_[i_905_],
					     fs_818_[i_906_],
					     (Class619.method10166
					      (class127.anIntArray1475[i_904_],
					       ((int) (fs_820_[i_904_]
						       * 255.0F) << 24
						| (class110.anInt1330
						   * 296717011)),
					       783768273)),
					     (Class619.method10166
					      (class127.anIntArray1475[i_905_],
					       ((int) (fs_820_[i_905_]
						       * 255.0F) << 24
						| (class110.anInt1330
						   * 296717011)),
					       309613173)),
					     (Class619.method10166
					      (class127.anIntArray1475[i_906_],
					       ((int) (fs_820_[i_906_]
						       * 255.0F) << 24
						| (class110.anInt1330
						   * 296717011)),
					       -270432645)));
					class128.anInt1486 = 0;
				    }
				} else if (bool_913_) {
				    int i_915_ = -16777216;
				    if (method15244(class166.aByte1825))
					i_915_ = -1694498816;
				    class128.method2248
					(true, true, false, f_909_, f_910_,
					 f_911_, f, f_907_, f_908_,
					 fs_818_[i_904_], fs_818_[i_905_],
					 fs_818_[i_906_], fs_819_[i_904_],
					 fs_819_[i_905_], fs_819_[i_906_],
					 ((float) (class127.aShortArray1473
						   [i_904_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1473
						   [i_905_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1473
						   [i_906_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1470
						   [i_904_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1470
						   [i_905_])
					  / (float) (anInt1761 * 435863595)),
					 ((float) (class127.aShortArray1470
						   [i_906_])
					  / (float) (anInt1761 * 435863595)),
					 i_915_ | (class127.anIntArray1475
						   [i_904_]) & 0xffffff,
					 i_915_ | (class127.anIntArray1475
						   [i_905_]) & 0xffffff,
					 i_915_ | (class127.anIntArray1475
						   [i_906_]) & 0xffffff,
					 0, 0.0F, 0.0F, 0.0F,
					 (class127.aShortArray1478[i_903_]
					  & 0xffff));
				} else if ((class127.anIntArray1475[i_904_]
					    & 0xffffff)
					   != 0) {
				    class128.method2243
					(true, true, false, f_909_, f_910_,
					 f_911_, f, f_907_, f_908_,
					 fs_818_[i_904_], fs_818_[i_905_],
					 fs_818_[i_906_],
					 class127.anIntArray1475[i_904_],
					 class127.anIntArray1475[i_905_],
					 class127.anIntArray1475[i_906_]);
				    class128.anInt1486 = 0;
				}
			    } else
				class128.method2256(true, true, false, f_909_,
						    f_910_, f_911_, f, f_907_,
						    f_908_, fs_818_[i_904_],
						    fs_818_[i_905_],
						    fs_818_[i_906_],
						    (class110.anInt1330
						     * 296717011));
			}
		    }
		} else {
		    for (int i_916_ = 0; i_916_ < class127.aShort1474;
			 i_916_++) {
			int i_917_ = i_916_ * 3;
			int i_918_ = i_917_ + 1;
			int i_919_ = i_918_ + 1;
			float f = fs[i_917_];
			float f_920_ = fs[i_918_];
			float f_921_ = fs[i_919_];
			float f_922_ = fs_817_[i_917_];
			float f_923_ = fs_817_[i_918_];
			float f_924_ = fs_817_[i_919_];
			float f_925_ = (fs_820_[i_917_] + fs_820_[i_918_]
					+ fs_820_[i_919_]);
			if (((f - f_920_) * (f_924_ - f_923_)
			     - (f_922_ - f_923_) * (f_921_ - f_920_))
			    > 0.0F) {
			    class128.aBool1485
				= (f < 0.0F || f_920_ < 0.0F || f_921_ < 0.0F
				   || f > (float) class128.anInt1494
				   || f_920_ > (float) class128.anInt1494
				   || f_921_ > (float) class128.anInt1494);
			    if (f_925_ < 3.0F) {
				if (f_925_ > 0.0F) {
				    if ((class127.anIntArray1475[i_917_]
					 & 0xffffff)
					!= 0)
					class128.method2243
					    (true, true, false, f_922_, f_923_,
					     f_924_, f, f_920_, f_921_,
					     fs_818_[i_917_], fs_818_[i_918_],
					     fs_818_[i_919_],
					     (Class637.method10513
					      (class127.anIntArray1475[i_917_],
					       class110.anInt1330 * 296717011,
					       fs_820_[i_917_] * 255.0F,
					       272850248)),
					     (Class637.method10513
					      (class127.anIntArray1475[i_918_],
					       class110.anInt1330 * 296717011,
					       fs_820_[i_918_] * 255.0F,
					       1321435102)),
					     (Class637.method10513
					      (class127.anIntArray1475[i_919_],
					       class110.anInt1330 * 296717011,
					       fs_820_[i_919_] * 255.0F,
					       -1752688426)));
				} else if ((class127.anIntArray1475[i_917_]
					    & 0xffffff)
					   != 0)
				    class128.method2243
					(true, true, false, f_922_, f_923_,
					 f_924_, f, f_920_, f_921_,
					 fs_818_[i_917_], fs_818_[i_918_],
					 fs_818_[i_919_],
					 class127.anIntArray1475[i_917_],
					 class127.anIntArray1475[i_918_],
					 class127.anIntArray1475[i_919_]);
			    } else
				class128.method2256(true, true, false, f_922_,
						    f_923_, f_924_, f, f_920_,
						    f_921_, fs_818_[i_917_],
						    fs_818_[i_918_],
						    fs_818_[i_919_],
						    (class110.anInt1330
						     * 296717011));
			}
		    }
		}
	    }
	}
    }
    
    void method15264(int i, int i_926_, int i_927_, int i_928_, int i_929_,
		     int i_930_, int i_931_, boolean[][] bools,
		     Class110 class110, Class128 class128, float[] fs,
		     float[] fs_932_) {
	int i_933_ = (i_931_ - i_929_) * i_927_ / 256;
	int i_934_ = i_927_ >> 8;
	boolean bool = class110.aBool1335;
	aClass182_Sub2_9513.method3235(false);
	class128.aBool1482 = false;
	class128.aBool1483 = false;
	int i_935_ = i;
	int i_936_ = i_926_ + i_933_;
	for (int i_937_ = i_928_; i_937_ < i_930_; i_937_++) {
	    for (int i_938_ = i_929_; i_938_ < i_931_; i_938_++) {
		if (bools[i_937_ - i_928_][i_938_ - i_929_]) {
		    if (aClass123ArrayArray9517 != null) {
			if (aClass123ArrayArray9517[i_937_][i_938_] != null) {
			    Class123 class123
				= aClass123ArrayArray9517[i_937_][i_938_];
			    if (class123.aShort1456 != -1
				&& (class123.aByte1451 & 0x2) == 0
				&& class123.anInt1455 == 0) {
				int i_939_ = (aClass182_Sub2_9513.method15168
					      (class123.aShort1456 & 0xffff));
				class128.method2266
				    (true, true, false,
				     (float) (i_936_ - i_934_),
				     (float) (i_936_ - i_934_), (float) i_936_,
				     (float) (i_935_ + i_934_), (float) i_935_,
				     (float) (i_935_ + i_934_), 100.0F, 100.0F,
				     100.0F,
				     (float) Class159.method2568(i_939_,
								 (class123
								  .anInt1447),
								 1031568412),
				     (float) Class159.method2568(i_939_,
								 (class123
								  .anInt1450),
								 -430656015),
				     (float) Class159.method2568(i_939_,
								 (class123
								  .anInt1446),
								 810010144));
				class128.method2266
				    (true, true, false, (float) i_936_,
				     (float) i_936_, (float) (i_936_ - i_934_),
				     (float) i_935_, (float) (i_935_ + i_934_),
				     (float) i_935_, 100.0F, 100.0F, 100.0F,
				     (float) Class159.method2568(i_939_,
								 (class123
								  .anInt1453),
								 -1661350041),
				     (float) Class159.method2568(i_939_,
								 (class123
								  .anInt1446),
								 1611552637),
				     (float) Class159.method2568(i_939_,
								 (class123
								  .anInt1450),
								 1847333489));
			    } else if (class123.anInt1455 == 0) {
				class128.method2243(true, true, false,
						    (float) (i_936_ - i_934_),
						    (float) (i_936_ - i_934_),
						    (float) i_936_,
						    (float) (i_935_ + i_934_),
						    (float) i_935_,
						    (float) (i_935_ + i_934_),
						    100.0F, 100.0F, 100.0F,
						    class123.anInt1447,
						    class123.anInt1450,
						    class123.anInt1446);
				class128.method2243(true, true, false,
						    (float) i_936_,
						    (float) i_936_,
						    (float) (i_936_ - i_934_),
						    (float) i_935_,
						    (float) (i_935_ + i_934_),
						    (float) i_935_, 100.0F,
						    100.0F, 100.0F,
						    class123.anInt1453,
						    class123.anInt1446,
						    class123.anInt1450);
			    } else {
				int i_940_ = class123.anInt1455;
				class128.method2243
				    (true, true, false,
				     (float) (i_936_ - i_934_),
				     (float) (i_936_ - i_934_), (float) i_936_,
				     (float) (i_935_ + i_934_), (float) i_935_,
				     (float) (i_935_ + i_934_), 100.0F, 100.0F,
				     100.0F,
				     Class619.method10166(i_940_,
							  (class123.anInt1447
							   & ~0xffffff),
							  333234644),
				     Class619.method10166(i_940_,
							  (class123.anInt1450
							   & ~0xffffff),
							  -1634858480),
				     Class619.method10166(i_940_,
							  (class123.anInt1446
							   & ~0xffffff),
							  -504633234));
				class128.method2243
				    (true, true, false, (float) i_936_,
				     (float) i_936_, (float) (i_936_ - i_934_),
				     (float) i_935_, (float) (i_935_ + i_934_),
				     (float) i_935_, 100.0F, 100.0F, 100.0F,
				     Class619.method10166(i_940_,
							  (class123.anInt1453
							   & ~0xffffff),
							  -2010016970),
				     Class619.method10166(i_940_,
							  (class123.anInt1446
							   & ~0xffffff),
							  -829723738),
				     Class619.method10166(i_940_,
							  (class123.anInt1450
							   & ~0xffffff),
							  -339419326));
			    }
			} else if (aClass127ArrayArray9524[i_937_][i_938_]
				   != null) {
			    Class127 class127
				= aClass127ArrayArray9524[i_937_][i_938_];
			    for (int i_941_ = 0; i_941_ < class127.aShort1471;
				 i_941_++) {
				fs[i_941_]
				    = (float) (i_935_
					       + ((class127.aShortArray1473
						   [i_941_])
						  * i_934_
						  / (anInt1761 * 435863595)));
				fs_932_[i_941_]
				    = (float) (i_936_
					       - ((class127.aShortArray1470
						   [i_941_])
						  * i_934_
						  / (anInt1761 * 435863595)));
			    }
			    for (int i_942_ = 0; i_942_ < class127.aShort1474;
				 i_942_++) {
				int i_943_ = i_942_ * 3;
				int i_944_ = i_943_ + 1;
				int i_945_ = i_944_ + 1;
				float f = fs[i_943_];
				float f_946_ = fs[i_944_];
				float f_947_ = fs[i_945_];
				float f_948_ = fs_932_[i_943_];
				float f_949_ = fs_932_[i_944_];
				float f_950_ = fs_932_[i_945_];
				if (class127.anIntArray1480 != null
				    && class127.anIntArray1480[i_942_] != 0
				    && (class127.aShortArray1478 == null
					|| (class127.aShortArray1478 != null
					    && (class127.aShortArray1478
						[i_942_]) == -1))) {
				    int i_951_
					= class127.anIntArray1480[i_942_];
				    class128.method2243
					(true, true, false, f_948_, f_949_,
					 f_950_, f, f_946_, f_947_, 100.0F,
					 100.0F, 100.0F,
					 (Class619.method10166
					  (i_951_,
					   (-16777216
					    - (class127.anIntArray1475[i_943_]
					       & ~0xffffff)),
					   -1207547474)),
					 (Class619.method10166
					  (i_951_,
					   (-16777216
					    - (class127.anIntArray1475[i_944_]
					       & ~0xffffff)),
					   -293131928)),
					 (Class619.method10166
					  (i_951_,
					   (-16777216
					    - (class127.anIntArray1475[i_945_]
					       & ~0xffffff)),
					   -1159922100)));
				} else if (class127.aShortArray1478 != null
					   && (class127.aShortArray1478[i_942_]
					       != -1)) {
				    int i_952_
					= (aClass182_Sub2_9513.method15168
					   (class127.aShortArray1478[i_942_]
					    & 0xffff));
				    class128.method2266(true, true, false,
							f_948_, f_949_, f_950_,
							f, f_946_, f_947_,
							100.0F, 100.0F, 100.0F,
							(float) i_952_,
							(float) i_952_,
							(float) i_952_);
				} else
				    class128.method2243
					(true, true, false, f_948_, f_949_,
					 f_950_, f, f_946_, f_947_, 100.0F,
					 100.0F, 100.0F,
					 class127.anIntArray1475[i_943_],
					 class127.anIntArray1475[i_944_],
					 class127.anIntArray1475[i_945_]);
			    }
			}
		    } else if (aClass134ArrayArray9519[i_937_][i_938_]
			       != null) {
			Class134 class134
			    = aClass134ArrayArray9519[i_937_][i_938_];
			for (int i_953_ = 0; i_953_ < class134.aShort1600;
			     i_953_++) {
			    fs[i_953_]
				= (float) (i_935_
					   + (class134.aShortArray1601[i_953_]
					      * i_934_
					      / (anInt1761 * 435863595)));
			    fs_932_[i_953_]
				= (float) (i_936_
					   - (class134.aShortArray1603[i_953_]
					      * i_934_
					      / (anInt1761 * 435863595)));
			}
			for (int i_954_ = 0; i_954_ < class134.aShort1605;
			     i_954_++) {
			    int i_955_ = i_954_ * 3;
			    int i_956_ = i_955_ + 1;
			    int i_957_ = i_956_ + 1;
			    float f = fs[i_955_];
			    float f_958_ = fs[i_956_];
			    float f_959_ = fs[i_957_];
			    float f_960_ = fs_932_[i_955_];
			    float f_961_ = fs_932_[i_956_];
			    float f_962_ = fs_932_[i_957_];
			    if (class134.anIntArray1609 != null
				&& class134.anIntArray1609[i_954_] != 0) {
				int i_963_ = class134.anIntArray1609[i_954_];
				class128.method2243(true, true, false, f_960_,
						    f_961_, f_962_, f, f_958_,
						    f_959_, 100.0F, 100.0F,
						    100.0F, i_963_, i_963_,
						    i_963_);
			    } else
				class128.method2243
				    (true, true, false, f_960_, f_961_, f_962_,
				     f, f_958_, f_959_, 100.0F, 100.0F, 100.0F,
				     class134.anIntArray1599[i_955_],
				     class134.anIntArray1599[i_956_],
				     class134.anIntArray1599[i_957_]);
			}
		    }
		}
		i_936_ -= i_934_;
	    }
	    i_936_ = i_926_ + i_933_;
	    i_935_ += i_934_;
	}
	class128.aBool1482 = true;
	aClass182_Sub2_9513.method3235(bool);
    }
    
    public Class525_Sub16_Sub17 method2581
	(int i, int i_964_, Class525_Sub16_Sub17 class525_sub16_sub17) {
	return null;
    }
    
    public void method2612(int i, int i_965_, int i_966_, boolean[][] bools,
			   boolean bool, int i_967_) {
	if (aClass182_Sub2_9513.anIntArray9466 == null
	    || aClass182_Sub2_9513.aFloatArray9469 == null)
	    throw new IllegalStateException("");
	Class435 class435 = aClass182_Sub2_9513.aClass435_9483;
	aFloat9520 = class435.aFloatArray4830[0];
	aFloat9521 = class435.aFloatArray4830[1];
	aFloat9531 = class435.aFloatArray4830[2];
	aFloat9523 = class435.aFloatArray4830[3];
	aFloat9537 = class435.aFloatArray4830[4];
	aFloat9508 = class435.aFloatArray4830[5];
	aFloat9530 = class435.aFloatArray4830[6];
	aFloat9526 = class435.aFloatArray4830[7];
	aFloat9522 = class435.aFloatArray4830[8];
	aFloat9510 = class435.aFloatArray4830[9];
	aFloat9518 = class435.aFloatArray4830[10];
	aFloat9528 = class435.aFloatArray4830[11];
	aFloat9532 = class435.aFloatArray4830[12];
	aFloat9529 = class435.aFloatArray4830[13];
	aFloat9534 = class435.aFloatArray4830[14];
	aFloat9527 = class435.aFloatArray4830[15];
	for (int i_968_ = 0; i_968_ < i_966_ + i_966_; i_968_++) {
	    for (int i_969_ = 0; i_969_ < i_966_ + i_966_; i_969_++) {
		if (bools[i_968_][i_969_]) {
		    int i_970_ = i - i_966_ + i_968_;
		    int i_971_ = i_965_ - i_966_ + i_969_;
		    if (i_970_ >= 0 && i_970_ < anInt1759 * 363736815
			&& i_971_ >= 0 && i_971_ < anInt1760 * -1152334393)
			method15242(i_970_, i_971_, i_967_);
		}
	    }
	}
    }
    
    public void method2595(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_972_, int i_973_, int i_974_, boolean bool) {
	/* empty */
    }
    
    public void method2603(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_975_, int i_976_, int i_977_, boolean bool) {
	/* empty */
    }
    
    void method15265(int i, int i_978_, int i_979_) {
	Class110 class110
	    = aClass182_Sub2_9513.method15223(Thread.currentThread());
	class110.aClass128_1338.anInt1486 = 0;
	if (aClass123ArrayArray9517 != null)
	    method15263(i, i_978_, class110.aBool1332, class110,
			class110.aClass128_1338, class110.aFloatArray1364,
			class110.aFloatArray1365, class110.aFloatArray1366,
			class110.aFloatArray1367, class110.aFloatArray1339,
			i_979_);
	else if (aClass129ArrayArray9515 != null)
	    method15243(i, i_978_, class110.aClass128_1338,
			class110.aFloatArray1364, class110.aFloatArray1365,
			class110.aFloatArray1366, class110.aFloatArray1367,
			class110.aFloatArray1339, i_979_);
	else if (aClass134ArrayArray9519 != null)
	    method15268(i, i_978_, class110.aBool1332, class110,
			class110.aClass128_1338, class110.aFloatArray1364,
			class110.aFloatArray1365, class110.aFloatArray1366,
			class110.aFloatArray1367, class110.aFloatArray1339,
			i_979_);
    }
    
    public boolean method2605(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_980_, int i_981_, int i_982_,
			      boolean bool) {
	return false;
    }
    
    void method15266(int i, int i_983_, int i_984_, int i_985_, int i_986_,
		     int i_987_, int i_988_, boolean[][] bools,
		     Class110 class110, Class128 class128, float[] fs,
		     float[] fs_989_) {
	int i_990_ = (i_988_ - i_986_) * i_984_ / 256;
	int i_991_ = i_984_ >> 8;
	boolean bool = class110.aBool1335;
	aClass182_Sub2_9513.method3235(false);
	class128.aBool1482 = false;
	class128.aBool1483 = false;
	int i_992_ = i;
	int i_993_ = i_983_ + i_990_;
	for (int i_994_ = i_985_; i_994_ < i_987_; i_994_++) {
	    for (int i_995_ = i_986_; i_995_ < i_988_; i_995_++) {
		if (bools[i_994_ - i_985_][i_995_ - i_986_]) {
		    if (aClass123ArrayArray9517 != null) {
			if (aClass123ArrayArray9517[i_994_][i_995_] != null) {
			    Class123 class123
				= aClass123ArrayArray9517[i_994_][i_995_];
			    if (class123.aShort1456 != -1
				&& (class123.aByte1451 & 0x2) == 0
				&& class123.anInt1455 == 0) {
				int i_996_ = (aClass182_Sub2_9513.method15168
					      (class123.aShort1456 & 0xffff));
				class128.method2266
				    (true, true, false,
				     (float) (i_993_ - i_991_),
				     (float) (i_993_ - i_991_), (float) i_993_,
				     (float) (i_992_ + i_991_), (float) i_992_,
				     (float) (i_992_ + i_991_), 100.0F, 100.0F,
				     100.0F,
				     (float) Class159.method2568(i_996_,
								 (class123
								  .anInt1447),
								 -1819588252),
				     (float) Class159.method2568(i_996_,
								 (class123
								  .anInt1450),
								 -2124072317),
				     (float) Class159.method2568(i_996_,
								 (class123
								  .anInt1446),
								 511477385));
				class128.method2266
				    (true, true, false, (float) i_993_,
				     (float) i_993_, (float) (i_993_ - i_991_),
				     (float) i_992_, (float) (i_992_ + i_991_),
				     (float) i_992_, 100.0F, 100.0F, 100.0F,
				     (float) Class159.method2568(i_996_,
								 (class123
								  .anInt1453),
								 141833577),
				     (float) Class159.method2568(i_996_,
								 (class123
								  .anInt1446),
								 -920924655),
				     (float) Class159.method2568(i_996_,
								 (class123
								  .anInt1450),
								 1353627093));
			    } else if (class123.anInt1455 == 0) {
				class128.method2243(true, true, false,
						    (float) (i_993_ - i_991_),
						    (float) (i_993_ - i_991_),
						    (float) i_993_,
						    (float) (i_992_ + i_991_),
						    (float) i_992_,
						    (float) (i_992_ + i_991_),
						    100.0F, 100.0F, 100.0F,
						    class123.anInt1447,
						    class123.anInt1450,
						    class123.anInt1446);
				class128.method2243(true, true, false,
						    (float) i_993_,
						    (float) i_993_,
						    (float) (i_993_ - i_991_),
						    (float) i_992_,
						    (float) (i_992_ + i_991_),
						    (float) i_992_, 100.0F,
						    100.0F, 100.0F,
						    class123.anInt1453,
						    class123.anInt1446,
						    class123.anInt1450);
			    } else {
				int i_997_ = class123.anInt1455;
				class128.method2243
				    (true, true, false,
				     (float) (i_993_ - i_991_),
				     (float) (i_993_ - i_991_), (float) i_993_,
				     (float) (i_992_ + i_991_), (float) i_992_,
				     (float) (i_992_ + i_991_), 100.0F, 100.0F,
				     100.0F,
				     Class619.method10166(i_997_,
							  (class123.anInt1447
							   & ~0xffffff),
							  -1882898148),
				     Class619.method10166(i_997_,
							  (class123.anInt1450
							   & ~0xffffff),
							  -2022948013),
				     Class619.method10166(i_997_,
							  (class123.anInt1446
							   & ~0xffffff),
							  587911292));
				class128.method2243
				    (true, true, false, (float) i_993_,
				     (float) i_993_, (float) (i_993_ - i_991_),
				     (float) i_992_, (float) (i_992_ + i_991_),
				     (float) i_992_, 100.0F, 100.0F, 100.0F,
				     Class619.method10166(i_997_,
							  (class123.anInt1453
							   & ~0xffffff),
							  796065038),
				     Class619.method10166(i_997_,
							  (class123.anInt1446
							   & ~0xffffff),
							  -1257098189),
				     Class619.method10166(i_997_,
							  (class123.anInt1450
							   & ~0xffffff),
							  -93529322));
			    }
			} else if (aClass127ArrayArray9524[i_994_][i_995_]
				   != null) {
			    Class127 class127
				= aClass127ArrayArray9524[i_994_][i_995_];
			    for (int i_998_ = 0; i_998_ < class127.aShort1471;
				 i_998_++) {
				fs[i_998_]
				    = (float) (i_992_
					       + ((class127.aShortArray1473
						   [i_998_])
						  * i_991_
						  / (anInt1761 * 435863595)));
				fs_989_[i_998_]
				    = (float) (i_993_
					       - ((class127.aShortArray1470
						   [i_998_])
						  * i_991_
						  / (anInt1761 * 435863595)));
			    }
			    for (int i_999_ = 0; i_999_ < class127.aShort1474;
				 i_999_++) {
				int i_1000_ = i_999_ * 3;
				int i_1001_ = i_1000_ + 1;
				int i_1002_ = i_1001_ + 1;
				float f = fs[i_1000_];
				float f_1003_ = fs[i_1001_];
				float f_1004_ = fs[i_1002_];
				float f_1005_ = fs_989_[i_1000_];
				float f_1006_ = fs_989_[i_1001_];
				float f_1007_ = fs_989_[i_1002_];
				if (class127.anIntArray1480 != null
				    && class127.anIntArray1480[i_999_] != 0
				    && (class127.aShortArray1478 == null
					|| (class127.aShortArray1478 != null
					    && (class127.aShortArray1478
						[i_999_]) == -1))) {
				    int i_1008_
					= class127.anIntArray1480[i_999_];
				    class128.method2243
					(true, true, false, f_1005_, f_1006_,
					 f_1007_, f, f_1003_, f_1004_, 100.0F,
					 100.0F, 100.0F,
					 (Class619.method10166
					  (i_1008_,
					   (-16777216
					    - (class127.anIntArray1475[i_1000_]
					       & ~0xffffff)),
					   689035376)),
					 (Class619.method10166
					  (i_1008_,
					   (-16777216
					    - (class127.anIntArray1475[i_1001_]
					       & ~0xffffff)),
					   -1208815257)),
					 (Class619.method10166
					  (i_1008_,
					   (-16777216
					    - (class127.anIntArray1475[i_1002_]
					       & ~0xffffff)),
					   760952152)));
				} else if (class127.aShortArray1478 != null
					   && (class127.aShortArray1478[i_999_]
					       != -1)) {
				    int i_1009_
					= (aClass182_Sub2_9513.method15168
					   (class127.aShortArray1478[i_999_]
					    & 0xffff));
				    class128.method2266(true, true, false,
							f_1005_, f_1006_,
							f_1007_, f, f_1003_,
							f_1004_, 100.0F,
							100.0F, 100.0F,
							(float) i_1009_,
							(float) i_1009_,
							(float) i_1009_);
				} else
				    class128.method2243
					(true, true, false, f_1005_, f_1006_,
					 f_1007_, f, f_1003_, f_1004_, 100.0F,
					 100.0F, 100.0F,
					 class127.anIntArray1475[i_1000_],
					 class127.anIntArray1475[i_1001_],
					 class127.anIntArray1475[i_1002_]);
			    }
			}
		    } else if (aClass134ArrayArray9519[i_994_][i_995_]
			       != null) {
			Class134 class134
			    = aClass134ArrayArray9519[i_994_][i_995_];
			for (int i_1010_ = 0; i_1010_ < class134.aShort1600;
			     i_1010_++) {
			    fs[i_1010_]
				= (float) (i_992_
					   + (class134.aShortArray1601[i_1010_]
					      * i_991_
					      / (anInt1761 * 435863595)));
			    fs_989_[i_1010_]
				= (float) (i_993_
					   - (class134.aShortArray1603[i_1010_]
					      * i_991_
					      / (anInt1761 * 435863595)));
			}
			for (int i_1011_ = 0; i_1011_ < class134.aShort1605;
			     i_1011_++) {
			    int i_1012_ = i_1011_ * 3;
			    int i_1013_ = i_1012_ + 1;
			    int i_1014_ = i_1013_ + 1;
			    float f = fs[i_1012_];
			    float f_1015_ = fs[i_1013_];
			    float f_1016_ = fs[i_1014_];
			    float f_1017_ = fs_989_[i_1012_];
			    float f_1018_ = fs_989_[i_1013_];
			    float f_1019_ = fs_989_[i_1014_];
			    if (class134.anIntArray1609 != null
				&& class134.anIntArray1609[i_1011_] != 0) {
				int i_1020_ = class134.anIntArray1609[i_1011_];
				class128.method2243(true, true, false, f_1017_,
						    f_1018_, f_1019_, f,
						    f_1015_, f_1016_, 100.0F,
						    100.0F, 100.0F, i_1020_,
						    i_1020_, i_1020_);
			    } else
				class128.method2243
				    (true, true, false, f_1017_, f_1018_,
				     f_1019_, f, f_1015_, f_1016_, 100.0F,
				     100.0F, 100.0F,
				     class134.anIntArray1599[i_1012_],
				     class134.anIntArray1599[i_1013_],
				     class134.anIntArray1599[i_1014_]);
			}
		    }
		}
		i_993_ -= i_991_;
	    }
	    i_993_ = i_983_ + i_990_;
	    i_992_ += i_991_;
	}
	class128.aBool1482 = true;
	aClass182_Sub2_9513.method3235(bool);
    }
    
    public boolean method2606(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_1021_, int i_1022_, int i_1023_,
			      boolean bool) {
	return false;
    }
    
    public void method2609(int i, int i_1024_, int i_1025_) {
	i = Math.min(aByteArrayArray9525.length - 1, Math.max(0, i));
	i_1024_ = Math.min(aByteArrayArray9525[i].length - 1,
			   Math.max(0, i_1024_));
	if (aByteArrayArray9525[i][i_1024_] < i_1025_)
	    aByteArrayArray9525[i][i_1024_] = (byte) i_1025_;
    }
    
    public void method2585(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_1026_, int i_1027_, int i_1028_,
			   boolean bool) {
	/* empty */
    }
    
    void method15267(int i, int i_1029_, int i_1030_, int i_1031_, int i_1032_,
		     int i_1033_, int i_1034_, boolean[][] bools,
		     Class110 class110, Class128 class128, float[] fs,
		     float[] fs_1035_) {
	int i_1036_ = (i_1034_ - i_1032_) * i_1030_ / 256;
	int i_1037_ = i_1030_ >> 8;
	boolean bool = class110.aBool1335;
	aClass182_Sub2_9513.method3235(false);
	class128.aBool1482 = false;
	class128.aBool1483 = false;
	int i_1038_ = i;
	int i_1039_ = i_1029_ + i_1036_;
	for (int i_1040_ = i_1031_; i_1040_ < i_1033_; i_1040_++) {
	    for (int i_1041_ = i_1032_; i_1041_ < i_1034_; i_1041_++) {
		if (bools[i_1040_ - i_1031_][i_1041_ - i_1032_]) {
		    if (aClass123ArrayArray9517 != null) {
			if (aClass123ArrayArray9517[i_1040_][i_1041_]
			    != null) {
			    Class123 class123
				= aClass123ArrayArray9517[i_1040_][i_1041_];
			    if (class123.aShort1456 != -1
				&& (class123.aByte1451 & 0x2) == 0
				&& class123.anInt1455 == 0) {
				int i_1042_ = (aClass182_Sub2_9513.method15168
					       (class123.aShort1456 & 0xffff));
				class128.method2266
				    (true, true, false,
				     (float) (i_1039_ - i_1037_),
				     (float) (i_1039_ - i_1037_),
				     (float) i_1039_,
				     (float) (i_1038_ + i_1037_),
				     (float) i_1038_,
				     (float) (i_1038_ + i_1037_), 100.0F,
				     100.0F, 100.0F,
				     (float) Class159.method2568(i_1042_,
								 (class123
								  .anInt1447),
								 -1686275527),
				     (float) Class159.method2568(i_1042_,
								 (class123
								  .anInt1450),
								 -1824501653),
				     (float) Class159.method2568(i_1042_,
								 (class123
								  .anInt1446),
								 1091089942));
				class128.method2266
				    (true, true, false, (float) i_1039_,
				     (float) i_1039_,
				     (float) (i_1039_ - i_1037_),
				     (float) i_1038_,
				     (float) (i_1038_ + i_1037_),
				     (float) i_1038_, 100.0F, 100.0F, 100.0F,
				     (float) Class159.method2568(i_1042_,
								 (class123
								  .anInt1453),
								 -120126789),
				     (float) Class159.method2568(i_1042_,
								 (class123
								  .anInt1446),
								 -1308233963),
				     (float) Class159.method2568(i_1042_,
								 (class123
								  .anInt1450),
								 -871086980));
			    } else if (class123.anInt1455 == 0) {
				class128.method2243
				    (true, true, false,
				     (float) (i_1039_ - i_1037_),
				     (float) (i_1039_ - i_1037_),
				     (float) i_1039_,
				     (float) (i_1038_ + i_1037_),
				     (float) i_1038_,
				     (float) (i_1038_ + i_1037_), 100.0F,
				     100.0F, 100.0F, class123.anInt1447,
				     class123.anInt1450, class123.anInt1446);
				class128.method2243(true, true, false,
						    (float) i_1039_,
						    (float) i_1039_,
						    (float) (i_1039_
							     - i_1037_),
						    (float) i_1038_,
						    (float) (i_1038_
							     + i_1037_),
						    (float) i_1038_, 100.0F,
						    100.0F, 100.0F,
						    class123.anInt1453,
						    class123.anInt1446,
						    class123.anInt1450);
			    } else {
				int i_1043_ = class123.anInt1455;
				class128.method2243
				    (true, true, false,
				     (float) (i_1039_ - i_1037_),
				     (float) (i_1039_ - i_1037_),
				     (float) i_1039_,
				     (float) (i_1038_ + i_1037_),
				     (float) i_1038_,
				     (float) (i_1038_ + i_1037_), 100.0F,
				     100.0F, 100.0F,
				     Class619.method10166(i_1043_,
							  (class123.anInt1447
							   & ~0xffffff),
							  -464358294),
				     Class619.method10166(i_1043_,
							  (class123.anInt1450
							   & ~0xffffff),
							  -1958039635),
				     Class619.method10166(i_1043_,
							  (class123.anInt1446
							   & ~0xffffff),
							  -1956275557));
				class128.method2243
				    (true, true, false, (float) i_1039_,
				     (float) i_1039_,
				     (float) (i_1039_ - i_1037_),
				     (float) i_1038_,
				     (float) (i_1038_ + i_1037_),
				     (float) i_1038_, 100.0F, 100.0F, 100.0F,
				     Class619.method10166(i_1043_,
							  (class123.anInt1453
							   & ~0xffffff),
							  -1308324470),
				     Class619.method10166(i_1043_,
							  (class123.anInt1446
							   & ~0xffffff),
							  -2121562388),
				     Class619.method10166(i_1043_,
							  (class123.anInt1450
							   & ~0xffffff),
							  -502514315));
			    }
			} else if (aClass127ArrayArray9524[i_1040_][i_1041_]
				   != null) {
			    Class127 class127
				= aClass127ArrayArray9524[i_1040_][i_1041_];
			    for (int i_1044_ = 0;
				 i_1044_ < class127.aShort1471; i_1044_++) {
				fs[i_1044_]
				    = (float) (i_1038_
					       + ((class127.aShortArray1473
						   [i_1044_])
						  * i_1037_
						  / (anInt1761 * 435863595)));
				fs_1035_[i_1044_]
				    = (float) (i_1039_
					       - ((class127.aShortArray1470
						   [i_1044_])
						  * i_1037_
						  / (anInt1761 * 435863595)));
			    }
			    for (int i_1045_ = 0;
				 i_1045_ < class127.aShort1474; i_1045_++) {
				int i_1046_ = i_1045_ * 3;
				int i_1047_ = i_1046_ + 1;
				int i_1048_ = i_1047_ + 1;
				float f = fs[i_1046_];
				float f_1049_ = fs[i_1047_];
				float f_1050_ = fs[i_1048_];
				float f_1051_ = fs_1035_[i_1046_];
				float f_1052_ = fs_1035_[i_1047_];
				float f_1053_ = fs_1035_[i_1048_];
				if (class127.anIntArray1480 != null
				    && class127.anIntArray1480[i_1045_] != 0
				    && (class127.aShortArray1478 == null
					|| (class127.aShortArray1478 != null
					    && (class127.aShortArray1478
						[i_1045_]) == -1))) {
				    int i_1054_
					= class127.anIntArray1480[i_1045_];
				    class128.method2243
					(true, true, false, f_1051_, f_1052_,
					 f_1053_, f, f_1049_, f_1050_, 100.0F,
					 100.0F, 100.0F,
					 (Class619.method10166
					  (i_1054_,
					   (-16777216
					    - (class127.anIntArray1475[i_1046_]
					       & ~0xffffff)),
					   -29620150)),
					 (Class619.method10166
					  (i_1054_,
					   (-16777216
					    - (class127.anIntArray1475[i_1047_]
					       & ~0xffffff)),
					   -2090620809)),
					 (Class619.method10166
					  (i_1054_,
					   (-16777216
					    - (class127.anIntArray1475[i_1048_]
					       & ~0xffffff)),
					   -2051225981)));
				} else if (class127.aShortArray1478 != null
					   && (class127.aShortArray1478
					       [i_1045_]) != -1) {
				    int i_1055_
					= (aClass182_Sub2_9513.method15168
					   (class127.aShortArray1478[i_1045_]
					    & 0xffff));
				    class128.method2266(true, true, false,
							f_1051_, f_1052_,
							f_1053_, f, f_1049_,
							f_1050_, 100.0F,
							100.0F, 100.0F,
							(float) i_1055_,
							(float) i_1055_,
							(float) i_1055_);
				} else
				    class128.method2243
					(true, true, false, f_1051_, f_1052_,
					 f_1053_, f, f_1049_, f_1050_, 100.0F,
					 100.0F, 100.0F,
					 class127.anIntArray1475[i_1046_],
					 class127.anIntArray1475[i_1047_],
					 class127.anIntArray1475[i_1048_]);
			    }
			}
		    } else if (aClass134ArrayArray9519[i_1040_][i_1041_]
			       != null) {
			Class134 class134
			    = aClass134ArrayArray9519[i_1040_][i_1041_];
			for (int i_1056_ = 0; i_1056_ < class134.aShort1600;
			     i_1056_++) {
			    fs[i_1056_]
				= (float) (i_1038_
					   + (class134.aShortArray1601[i_1056_]
					      * i_1037_
					      / (anInt1761 * 435863595)));
			    fs_1035_[i_1056_]
				= (float) (i_1039_
					   - (class134.aShortArray1603[i_1056_]
					      * i_1037_
					      / (anInt1761 * 435863595)));
			}
			for (int i_1057_ = 0; i_1057_ < class134.aShort1605;
			     i_1057_++) {
			    int i_1058_ = i_1057_ * 3;
			    int i_1059_ = i_1058_ + 1;
			    int i_1060_ = i_1059_ + 1;
			    float f = fs[i_1058_];
			    float f_1061_ = fs[i_1059_];
			    float f_1062_ = fs[i_1060_];
			    float f_1063_ = fs_1035_[i_1058_];
			    float f_1064_ = fs_1035_[i_1059_];
			    float f_1065_ = fs_1035_[i_1060_];
			    if (class134.anIntArray1609 != null
				&& class134.anIntArray1609[i_1057_] != 0) {
				int i_1066_ = class134.anIntArray1609[i_1057_];
				class128.method2243(true, true, false, f_1063_,
						    f_1064_, f_1065_, f,
						    f_1061_, f_1062_, 100.0F,
						    100.0F, 100.0F, i_1066_,
						    i_1066_, i_1066_);
			    } else
				class128.method2243
				    (true, true, false, f_1063_, f_1064_,
				     f_1065_, f, f_1061_, f_1062_, 100.0F,
				     100.0F, 100.0F,
				     class134.anIntArray1599[i_1058_],
				     class134.anIntArray1599[i_1059_],
				     class134.anIntArray1599[i_1060_]);
			}
		    }
		}
		i_1039_ -= i_1037_;
	    }
	    i_1039_ = i_1029_ + i_1036_;
	    i_1038_ += i_1037_;
	}
	class128.aBool1482 = true;
	aClass182_Sub2_9513.method3235(bool);
    }
    
    public void method2611(Class525_Sub21 class525_sub21, int[] is) {
	/* empty */
    }
    
    public void method2584(Class525_Sub21 class525_sub21, int[] is) {
	/* empty */
    }
    
    public void method2625(Class525_Sub21 class525_sub21, int[] is) {
	/* empty */
    }
    
    void method15268(int i, int i_1067_, boolean bool, Class110 class110,
		     Class128 class128, float[] fs, float[] fs_1068_,
		     float[] fs_1069_, float[] fs_1070_, float[] fs_1071_,
		     int i_1072_) {
	Class134 class134 = aClass134ArrayArray9519[i][i_1067_];
	if (i_1072_ == 0 || (i_1072_ & 0x2) == 0) {
	    if (class134 != null) {
		for (int i_1073_ = 0; i_1073_ < class134.aShort1600;
		     i_1073_++) {
		    int i_1074_ = (class134.aShortArray1601[i_1073_]
				   + (i << anInt1763 * -2063427645));
		    int i_1075_ = class134.aShortArray1607[i_1073_];
		    int i_1076_ = (class134.aShortArray1603[i_1073_]
				   + (i_1067_ << anInt1763 * -2063427645));
		    float f = aFloat9534 + (aFloat9531 * (float) i_1074_
					    + aFloat9530 * (float) i_1075_
					    + aFloat9518 * (float) i_1076_);
		    float f_1077_
			= aFloat9527 + (aFloat9523 * (float) i_1074_
					+ aFloat9526 * (float) i_1075_
					+ aFloat9528 * (float) i_1076_);
		    if (f < -f_1077_)
			return;
		    fs_1071_[i_1073_] = 0.0F;
		    if (bool) {
			float f_1078_ = f - class110.aFloat1328;
			if (f_1078_ > 0.0F) {
			    f_1078_ /= class110.aFloat1329;
			    if (f_1078_ > 1.0F)
				f_1078_ = 1.0F;
			    fs_1071_[i_1073_] = f_1078_;
			    int i_1079_
				= (int) ((float) (class134.aShortArray1604
						  [i_1073_])
					 * f_1078_);
			    if (i_1079_ > 0)
				i_1075_ -= i_1079_;
			}
		    } else if (class110.aBool1369) {
			float f_1080_ = f - class110.aFloat1328;
			if (f_1080_ > 0.0F) {
			    fs_1071_[i_1073_] = f_1080_ / class110.aFloat1329;
			    if (fs_1071_[i_1073_] > 1.0F)
				fs_1071_[i_1073_] = 1.0F;
			}
		    }
		    float f_1081_
			= aFloat9532 + (aFloat9520 * (float) i_1074_
					+ aFloat9537 * (float) i_1075_
					+ aFloat9522 * (float) i_1076_);
		    float f_1082_
			= aFloat9529 + (aFloat9521 * (float) i_1074_
					+ aFloat9508 * (float) i_1075_
					+ aFloat9510 * (float) i_1076_);
		    fs[i_1073_] = (class128.aFloat1503
				   + class128.aFloat1489 * f_1081_ / f_1077_);
		    fs_1068_[i_1073_]
			= (class128.aFloat1490
			   + class128.aFloat1491 * f_1082_ / f_1077_);
		    fs_1069_[i_1073_] = (class128.aFloat1492
					 + class128.aFloat1493 * f / f_1077_);
		    fs_1070_[i_1073_] = f_1077_;
		}
		float f = (float) (anInt1761 * 435863595);
		for (int i_1083_ = 0; i_1083_ < class134.aShort1605;
		     i_1083_++) {
		    int i_1084_ = i_1083_ * 3;
		    int i_1085_ = i_1084_ + 1;
		    int i_1086_ = i_1085_ + 1;
		    float f_1087_ = fs[i_1084_];
		    float f_1088_ = fs[i_1085_];
		    float f_1089_ = fs[i_1086_];
		    float f_1090_ = fs_1068_[i_1084_];
		    float f_1091_ = fs_1068_[i_1085_];
		    float f_1092_ = fs_1068_[i_1086_];
		    if (((f_1087_ - f_1088_) * (f_1092_ - f_1091_)
			 - (f_1090_ - f_1091_) * (f_1089_ - f_1088_))
			> 0.0F) {
			class128.aBool1485
			    = (f_1087_ < 0.0F || f_1088_ < 0.0F
			       || f_1089_ < 0.0F
			       || f_1087_ > (float) class128.anInt1494
			       || f_1088_ > (float) class128.anInt1494
			       || f_1089_ > (float) class128.anInt1494);
			if ((fs_1071_[i_1084_] + fs_1071_[i_1085_]
			     + fs_1071_[i_1086_])
			    < 3.0F) {
			    int i_1093_ = i << anInt1763 * -2063427645;
			    int i_1094_ = i_1067_ << anInt1763 * -2063427645;
			    if ((class134.anIntArray1599[i_1084_] & 0xffffff)
				!= 0) {
				if (class134.aShortArray1602[i_1084_] != -1
				    && class134.aShortArray1602[i_1085_] != -1
				    && (class134.aShortArray1602[i_1086_]
					!= -1)) {
				    if ((class134.aShortArray1602[i_1084_]
					 == class134.aShortArray1602[i_1085_])
					&& (class134.aShortArray1602[i_1084_]
					    == (class134.aShortArray1602
						[i_1086_]))
					&& (class134.aShortArray1606[i_1084_]
					    == (class134.aShortArray1606
						[i_1085_]))
					&& (class134.aShortArray1606[i_1084_]
					    == (class134.aShortArray1606
						[i_1086_])))
					class128.method2248
					    (true, true, false, f_1090_,
					     f_1091_, f_1092_, f_1087_,
					     f_1088_, f_1089_,
					     fs_1069_[i_1084_],
					     fs_1069_[i_1085_],
					     fs_1069_[i_1086_],
					     fs_1070_[i_1084_],
					     fs_1070_[i_1085_],
					     fs_1070_[i_1086_],
					     ((float) (i_1093_
						       + (class134
							  .aShortArray1601
							  [i_1084_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_1084_])),
					     ((float) (i_1093_
						       + (class134
							  .aShortArray1601
							  [i_1085_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_1085_])),
					     ((float) (i_1093_
						       + (class134
							  .aShortArray1601
							  [i_1086_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_1086_])),
					     ((float) (i_1094_
						       + (class134
							  .aShortArray1603
							  [i_1084_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_1084_])),
					     ((float) (i_1094_
						       + (class134
							  .aShortArray1603
							  [i_1085_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_1085_])),
					     ((float) (i_1094_
						       + (class134
							  .aShortArray1603
							  [i_1086_]))
					      / (float) (class134
							 .aShortArray1606
							 [i_1086_])),
					     class134.anIntArray1599[i_1084_],
					     class134.anIntArray1599[i_1085_],
					     class134.anIntArray1599[i_1086_],
					     class110.anInt1330 * 296717011,
					     fs_1071_[i_1084_] * 255.0F,
					     fs_1071_[i_1085_] * 255.0F,
					     fs_1071_[i_1086_] * 255.0F,
					     (class134.aShortArray1602[i_1084_]
					      & 0xffff));
				    else
					class128.method2250
					    (true, true, false, f_1090_,
					     f_1091_, f_1092_, f_1087_,
					     f_1088_, f_1089_,
					     fs_1069_[i_1084_],
					     fs_1069_[i_1085_],
					     fs_1069_[i_1086_],
					     fs_1070_[i_1084_],
					     fs_1070_[i_1085_],
					     fs_1070_[i_1086_],
					     (float) (i_1093_
						      + (class134
							 .aShortArray1601
							 [i_1084_])) / f,
					     (float) (i_1093_
						      + (class134
							 .aShortArray1601
							 [i_1085_])) / f,
					     (float) (i_1093_
						      + (class134
							 .aShortArray1601
							 [i_1086_])) / f,
					     (float) (i_1094_
						      + (class134
							 .aShortArray1603
							 [i_1084_])) / f,
					     (float) (i_1094_
						      + (class134
							 .aShortArray1603
							 [i_1085_])) / f,
					     (float) (i_1094_
						      + (class134
							 .aShortArray1603
							 [i_1086_])) / f,
					     class134.anIntArray1599[i_1084_],
					     class134.anIntArray1599[i_1085_],
					     class134.anIntArray1599[i_1086_],
					     class110.anInt1330 * 296717011,
					     fs_1071_[i_1084_] * 255.0F,
					     fs_1071_[i_1085_] * 255.0F,
					     fs_1071_[i_1086_] * 255.0F,
					     (class134.aShortArray1602[i_1084_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_1084_]),
					     (class134.aShortArray1602[i_1085_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_1085_]),
					     (class134.aShortArray1602[i_1086_]
					      & 0xffff),
					     f / (float) (class134
							  .aShortArray1606
							  [i_1086_]));
				} else if ((fs_1071_[i_1084_]
					    + fs_1071_[i_1085_]
					    + fs_1071_[i_1086_])
					   > 0.0F)
				    class128.method2243
					(true, true, false, f_1090_, f_1091_,
					 f_1092_, f_1087_, f_1088_, f_1089_,
					 fs_1069_[i_1084_], fs_1069_[i_1085_],
					 fs_1069_[i_1086_],
					 (Class637.method10513
					  (class134.anIntArray1599[i_1084_],
					   class110.anInt1330 * 296717011,
					   fs_1071_[i_1084_] * 255.0F,
					   -102900866)),
					 (Class637.method10513
					  (class134.anIntArray1599[i_1085_],
					   class110.anInt1330 * 296717011,
					   fs_1071_[i_1085_] * 255.0F,
					   -1520220931)),
					 (Class637.method10513
					  (class134.anIntArray1599[i_1086_],
					   class110.anInt1330 * 296717011,
					   fs_1071_[i_1086_] * 255.0F,
					   -355810350)));
				else
				    class128.method2243
					(true, true, false, f_1090_, f_1091_,
					 f_1092_, f_1087_, f_1088_, f_1089_,
					 fs_1069_[i_1084_], fs_1069_[i_1085_],
					 fs_1069_[i_1086_],
					 class134.anIntArray1599[i_1084_],
					 class134.anIntArray1599[i_1085_],
					 class134.anIntArray1599[i_1086_]);
			    }
			} else
			    class128.method2256(true, true, false, f_1090_,
						f_1091_, f_1092_, f_1087_,
						f_1088_, f_1089_,
						fs_1069_[i_1084_],
						fs_1069_[i_1085_],
						fs_1069_[i_1086_],
						(class110.anInt1330
						 * 296717011));
		    }
		}
	    }
	}
    }
    
    public void method2593(int i, int i_1095_, int[] is, int[] is_1096_,
			   int[] is_1097_, int[] is_1098_, int[] is_1099_,
			   int[] is_1100_, int[] is_1101_, int[] is_1102_,
			   Class176 class176, boolean bool) {
	boolean bool_1103_ = (anInt9514 & 0x20) == 0;
	if (aClass123ArrayArray9517 == null && !bool_1103_) {
	    aClass123ArrayArray9517
		= new Class123[anInt1759 * 363736815][anInt1760 * -1152334393];
	    aClass127ArrayArray9524
		= new Class127[anInt1759 * 363736815][anInt1760 * -1152334393];
	} else if (aClass134ArrayArray9519 == null && bool_1103_)
	    aClass134ArrayArray9519
		= new Class134[anInt1759 * 363736815][anInt1760 * -1152334393];
	else if (aClass129ArrayArray9515 != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_1104_ = 0; i_1104_ < is_1099_.length; i_1104_++) {
		if (is_1099_[i_1104_] == -1)
		    is_1099_[i_1104_] = 0;
		else
		    is_1099_[i_1104_]
			= (Class381.anIntArray3929
			   [(Class504.method8313(is_1099_[i_1104_], 1440874996)
			     & 0xffff)]) << 8 | 0xff;
	    }
	    if (is_1100_ != null) {
		for (int i_1105_ = 0; i_1105_ < is_1100_.length; i_1105_++) {
		    if (is_1100_[i_1105_] == -1)
			is_1100_[i_1105_] = 0;
		    else
			is_1100_[i_1105_]
			    = ((Class381.anIntArray3929
				[Class504.method8313(is_1100_[i_1105_],
						     1186745277) & 0xffff])
			       << 8) | 0xff;
		}
	    }
	    if (bool_1103_) {
		Class134 class134 = new Class134();
		class134.aShort1600 = (short) is.length;
		class134.aShort1605 = (short) (is.length / 3);
		class134.aShortArray1601 = new short[class134.aShort1600];
		class134.aShortArray1607 = new short[class134.aShort1600];
		class134.aShortArray1603 = new short[class134.aShort1600];
		class134.anIntArray1599 = new int[class134.aShort1600];
		class134.aShortArray1602 = new short[class134.aShort1600];
		class134.aShortArray1606 = new short[class134.aShort1600];
		class134.aByteArray1608 = new byte[class134.aShort1600];
		if (is_1098_ != null)
		    class134.aShortArray1604 = new short[class134.aShort1600];
		for (int i_1106_ = 0; i_1106_ < class134.aShort1600;
		     i_1106_++) {
		    int i_1107_ = is[i_1106_];
		    int i_1108_ = is_1097_[i_1106_];
		    boolean bool_1109_ = false;
		    int i_1110_;
		    if (i_1107_ == 0 && i_1108_ == 0)
			i_1110_ = (aByteArrayArray9536[i][i_1095_]
				   - aByteArrayArray9525[i][i_1095_]);
		    else if (i_1107_ == 0 && i_1108_ == anInt1761 * 435863595)
			i_1110_ = (aByteArrayArray9536[i][i_1095_ + 1]
				   - aByteArrayArray9525[i][i_1095_ + 1]);
		    else if (i_1107_ == anInt1761 * 435863595
			     && i_1108_ == anInt1761 * 435863595)
			i_1110_ = (aByteArrayArray9536[i + 1][i_1095_ + 1]
				   - aByteArrayArray9525[i + 1][i_1095_ + 1]);
		    else if (i_1107_ == anInt1761 * 435863595 && i_1108_ == 0)
			i_1110_ = (aByteArrayArray9536[i + 1][i_1095_]
				   - aByteArrayArray9525[i + 1][i_1095_]);
		    else {
			int i_1111_
			    = (((aByteArrayArray9536[i][i_1095_]
				 - aByteArrayArray9525[i][i_1095_])
				* (anInt1761 * 435863595 - i_1107_))
			       + ((aByteArrayArray9536[i + 1][i_1095_]
				   - aByteArrayArray9525[i + 1][i_1095_])
				  * i_1107_));
			int i_1112_
			    = (((aByteArrayArray9536[i][i_1095_ + 1]
				 - aByteArrayArray9525[i][i_1095_ + 1])
				* (anInt1761 * 435863595 - i_1107_))
			       + ((aByteArrayArray9536[i + 1][i_1095_ + 1]
				   - aByteArrayArray9525[i + 1][i_1095_ + 1])
				  * i_1107_));
			i_1110_
			    = (i_1111_ * (anInt1761 * 435863595 - i_1108_)
			       + i_1112_ * i_1108_) >> anInt1763 * 168112006;
		    }
		    int i_1113_ = (i << anInt1763 * -2063427645) + i_1107_;
		    int i_1114_
			= (i_1095_ << anInt1763 * -2063427645) + i_1108_;
		    class134.aShortArray1601[i_1106_] = (short) i_1107_;
		    class134.aShortArray1603[i_1106_] = (short) i_1108_;
		    class134.aShortArray1607[i_1106_]
			= (short) (method2619(i_1113_, i_1114_, -1367395267)
				   + (is_1096_ != null ? is_1096_[i_1106_]
				      : 0));
		    if (i_1110_ < 0)
			i_1110_ = 0;
		    if (is_1099_[i_1106_] == 0) {
			class134.anIntArray1599[i_1106_] = 0;
			if (is_1100_ != null)
			    class134.aByteArray1608[i_1106_] = (byte) i_1110_;
		    } else {
			int i_1115_ = 0;
			if (is_1098_ != null) {
			    int i_1116_ = (class134.aShortArray1604[i_1106_]
					   = (short) is_1098_[i_1106_]);
			    if (class176.anInt1879 * -734182087 != 0) {
				i_1115_ = 255 * i_1116_ / (class176.anInt1879
							   * -734182087);
				if (i_1115_ < 0)
				    i_1115_ = 0;
				else if (i_1115_ > 255)
				    i_1115_ = 255;
			    }
			}
			int i_1117_ = -16777216;
			if (is_1101_[i_1106_] != -1) {
			    TextureMetrics class166
				= (aClass182_Sub2_9513.aClass180_1944
				       .method3116
				   (is_1101_[i_1106_], -1431554601));
			    if (class166.aBool1801
				&& method15244(class166.aByte1825))
				i_1117_ = -1694498816;
			}
			class134.anIntArray1599[i_1106_]
			    = i_1117_ | (Class525_Sub31.method16523
					 (method15241(is_1099_[i_1106_] >> 8,
						      i_1110_),
					  class176.anInt1877 * 2141545647,
					  i_1115_, -1425027090));
			if (is_1100_ != null)
			    class134.aByteArray1608[i_1106_] = (byte) i_1110_;
		    }
		    class134.aShortArray1602[i_1106_]
			= (short) is_1101_[i_1106_];
		    class134.aShortArray1606[i_1106_]
			= (short) is_1102_[i_1106_];
		}
		if (is_1100_ != null) {
		    class134.anIntArray1609 = new int[class134.aShort1605];
		    for (int i_1118_ = 0; i_1118_ < class134.aShort1605;
			 i_1118_++) {
			int i_1119_ = i_1118_ * 3;
			if (is_1100_[i_1119_] != 0)
			    class134.anIntArray1609[i_1118_]
				= ~0xffffff | is_1100_[i_1119_] >> 8;
		    }
		}
		aClass134ArrayArray9519[i][i_1095_] = class134;
	    } else {
		boolean bool_1120_ = true;
		int i_1121_ = -1;
		int i_1122_ = -1;
		int i_1123_ = -1;
		int i_1124_ = -1;
		if (is.length == 6) {
		    for (int i_1125_ = 0; i_1125_ < 6; i_1125_++) {
			if (is[i_1125_] == 0 && is_1097_[i_1125_] == 0) {
			    if (i_1121_ != -1
				&& is_1099_[i_1121_] != is_1099_[i_1125_]) {
				bool_1120_ = false;
				break;
			    }
			    i_1121_ = i_1125_;
			} else if (is[i_1125_] == anInt1761 * 435863595
				   && is_1097_[i_1125_] == 0) {
			    if (i_1122_ != -1
				&& is_1099_[i_1122_] != is_1099_[i_1125_]) {
				bool_1120_ = false;
				break;
			    }
			    i_1122_ = i_1125_;
			} else if (is[i_1125_] == anInt1761 * 435863595
				   && (is_1097_[i_1125_]
				       == anInt1761 * 435863595)) {
			    if (i_1123_ != -1
				&& is_1099_[i_1123_] != is_1099_[i_1125_]) {
				bool_1120_ = false;
				break;
			    }
			    i_1123_ = i_1125_;
			} else if (is[i_1125_] == 0
				   && (is_1097_[i_1125_]
				       == anInt1761 * 435863595)) {
			    if (i_1124_ != -1
				&& is_1099_[i_1124_] != is_1099_[i_1125_]) {
				bool_1120_ = false;
				break;
			    }
			    i_1124_ = i_1125_;
			}
		    }
		    if (i_1121_ == -1 || i_1122_ == -1 || i_1123_ == -1
			|| i_1124_ == -1)
			bool_1120_ = false;
		    if (bool_1120_) {
			if (is_1096_ != null) {
			    for (int i_1126_ = 0; i_1126_ < 4; i_1126_++) {
				if (is_1096_[i_1126_] != 0) {
				    bool_1120_ = false;
				    break;
				}
			    }
			}
			if (bool_1120_) {
			    for (int i_1127_ = 1; i_1127_ < 4; i_1127_++) {
				if (is[i_1127_] != is[0]
				    && (is[i_1127_]
					!= is[0] + anInt1761 * 435863595)
				    && (is[i_1127_]
					!= is[0] - anInt1761 * 435863595)) {
				    bool_1120_ = false;
				    break;
				}
				if (is_1097_[i_1127_] != is_1097_[0]
				    && (is_1097_[i_1127_]
					!= is_1097_[0] + anInt1761 * 435863595)
				    && (is_1097_[i_1127_]
					!= (is_1097_[0]
					    - anInt1761 * 435863595))) {
				    bool_1120_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    bool_1120_ = false;
		if (bool_1120_) {
		    Class123 class123 = new Class123();
		    int i_1128_ = is_1099_[0];
		    int i_1129_ = is_1101_[0];
		    if (is_1100_ != null) {
			class123.anInt1455 = is_1100_[0] >> 8;
			if (i_1128_ == 0)
			    class123.aByte1451 |= 0x2;
		    } else if (i_1128_ == 0)
			return;
		    if ((anIntArrayArray1762[i][i_1095_]
			 == anIntArrayArray1762[i + 1][i_1095_])
			&& (anIntArrayArray1762[i][i_1095_]
			    == anIntArrayArray1762[i + 1][i_1095_ + 1])
			&& (anIntArrayArray1762[i][i_1095_]
			    == anIntArrayArray1762[i][i_1095_ + 1]))
			class123.aByte1451 |= 0x1;
		    if (i_1129_ != -1 && (class123.aByte1451 & 0x2) == 0
			&& !(aClass182_Sub2_9513.aClass180_1944.method3116
			     (i_1129_, -1431554601).aBool1819)) {
			int i_1130_;
			if (is_1098_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1130_
				= 255 * is_1098_[i_1121_] / (class176.anInt1879
							     * -734182087);
			    if (i_1130_ < 0)
				i_1130_ = 0;
			    else if (i_1130_ > 255)
				i_1130_ = 255;
			} else
			    i_1130_ = 0;
			class123.anInt1453
			    = (Class525_Sub31.method16523
			       (method15241(is_1099_[i_1121_] >> 8,
					    (aByteArrayArray9536[i][i_1095_]
					     - (aByteArrayArray9525[i]
						[i_1095_]))),
				class176.anInt1877 * 2141545647, i_1130_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1453
				|= (255 - (aByteArrayArray9536[i][i_1095_]
					   - aByteArrayArray9525[i][i_1095_])
				    << 25);
			if (is_1098_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1130_
				= 255 * is_1098_[i_1122_] / (class176.anInt1879
							     * -734182087);
			    if (i_1130_ < 0)
				i_1130_ = 0;
			    else if (i_1130_ > 255)
				i_1130_ = 255;
			} else
			    i_1130_ = 0;
			class123.anInt1446
			    = (Class525_Sub31.method16523
			       (method15241(is_1099_[i_1122_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1095_])
					     - (aByteArrayArray9525[i + 1]
						[i_1095_]))),
				class176.anInt1877 * 2141545647, i_1130_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1446
				|= 255 - (aByteArrayArray9536[i + 1][i_1095_]
					  - (aByteArrayArray9525[i + 1]
					     [i_1095_])) << 25;
			if (is_1098_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1130_
				= 255 * is_1098_[i_1123_] / (class176.anInt1879
							     * -734182087);
			    if (i_1130_ < 0)
				i_1130_ = 0;
			    else if (i_1130_ > 255)
				i_1130_ = 255;
			} else
			    i_1130_ = 0;
			class123.anInt1447
			    = (Class525_Sub31.method16523
			       (method15241(is_1099_[i_1123_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1095_ + 1])
					     - (aByteArrayArray9525[i + 1]
						[i_1095_ + 1]))),
				class176.anInt1877 * 2141545647, i_1130_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1447
				|= (255
				    - (aByteArrayArray9536[i + 1][i_1095_ + 1]
				       - (aByteArrayArray9525[i + 1]
					  [i_1095_ + 1]))) << 25;
			if (is_1098_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1130_
				= 255 * is_1098_[i_1124_] / (class176.anInt1879
							     * -734182087);
			    if (i_1130_ < 0)
				i_1130_ = 0;
			    else if (i_1130_ > 255)
				i_1130_ = 255;
			} else
			    i_1130_ = 0;
			class123.anInt1450
			    = (Class525_Sub31.method16523
			       (method15241(is_1099_[i_1124_] >> 8,
					    ((aByteArrayArray9536[i]
					      [i_1095_ + 1])
					     - (aByteArrayArray9525[i]
						[i_1095_ + 1]))),
				class176.anInt1877 * 2141545647, i_1130_,
				-1425027090));
			class123.aShort1456 = (short) i_1129_;
		    } else {
			int i_1131_;
			if (is_1098_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1131_
				= 255 * is_1098_[i_1121_] / (class176.anInt1879
							     * -734182087);
			    if (i_1131_ < 0)
				i_1131_ = 0;
			    else if (i_1131_ > 255)
				i_1131_ = 255;
			} else
			    i_1131_ = 0;
			class123.anInt1453
			    = (Class525_Sub31.method16523
			       (method15241(is_1099_[i_1121_] >> 8,
					    (aByteArrayArray9536[i][i_1095_]
					     - (aByteArrayArray9525[i]
						[i_1095_]))),
				class176.anInt1877 * 2141545647, i_1131_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1453
				|= (255 - (aByteArrayArray9536[i][i_1095_]
					   - aByteArrayArray9525[i][i_1095_])
				    << 25);
			if (is_1098_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1131_
				= 255 * is_1098_[i_1122_] / (class176.anInt1879
							     * -734182087);
			    if (i_1131_ < 0)
				i_1131_ = 0;
			    else if (i_1131_ > 255)
				i_1131_ = 255;
			} else
			    i_1131_ = 0;
			class123.anInt1446
			    = (Class525_Sub31.method16523
			       (method15241(is_1099_[i_1122_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1095_])
					     - (aByteArrayArray9525[i + 1]
						[i_1095_]))),
				class176.anInt1877 * 2141545647, i_1131_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1446
				|= 255 - (aByteArrayArray9536[i + 1][i_1095_]
					  - (aByteArrayArray9525[i + 1]
					     [i_1095_])) << 25;
			if (is_1098_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1131_
				= 255 * is_1098_[i_1123_] / (class176.anInt1879
							     * -734182087);
			    if (i_1131_ < 0)
				i_1131_ = 0;
			    else if (i_1131_ > 255)
				i_1131_ = 255;
			} else
			    i_1131_ = 0;
			class123.anInt1447
			    = (Class525_Sub31.method16523
			       (method15241(is_1099_[i_1123_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1095_ + 1])
					     - (aByteArrayArray9525[i + 1]
						[i_1095_ + 1]))),
				class176.anInt1877 * 2141545647, i_1131_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1447
				|= (255
				    - (aByteArrayArray9536[i + 1][i_1095_ + 1]
				       - (aByteArrayArray9525[i + 1]
					  [i_1095_ + 1]))) << 25;
			if (is_1098_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1131_
				= 255 * is_1098_[i_1124_] / (class176.anInt1879
							     * -734182087);
			    if (i_1131_ < 0)
				i_1131_ = 0;
			    else if (i_1131_ > 255)
				i_1131_ = 255;
			} else
			    i_1131_ = 0;
			class123.anInt1450
			    = (Class525_Sub31.method16523
			       (method15241(is_1099_[i_1124_] >> 8,
					    ((aByteArrayArray9536[i]
					      [i_1095_ + 1])
					     - (aByteArrayArray9525[i]
						[i_1095_ + 1]))),
				class176.anInt1877 * 2141545647, i_1131_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1450
				|= 255 - (aByteArrayArray9536[i][i_1095_ + 1]
					  - (aByteArrayArray9525[i]
					     [i_1095_ + 1])) << 25;
			class123.aShort1456 = (short) -1;
		    }
		    if (is_1098_ != null) {
			class123.aShort1448 = (short) is_1098_[i_1123_];
			class123.aShort1454 = (short) is_1098_[i_1124_];
			class123.aShort1452 = (short) is_1098_[i_1122_];
			class123.aShort1449 = (short) is_1098_[i_1121_];
		    }
		    aClass123ArrayArray9517[i][i_1095_] = class123;
		} else {
		    Class127 class127 = new Class127();
		    class127.aShort1471 = (short) is.length;
		    class127.aShort1474 = (short) (is.length / 3);
		    class127.aShortArray1473 = new short[class127.aShort1471];
		    class127.aShortArray1477 = new short[class127.aShort1471];
		    class127.aShortArray1470 = new short[class127.aShort1471];
		    class127.anIntArray1475 = new int[class127.aShort1471];
		    if (is_1098_ != null)
			class127.aShortArray1476
			    = new short[class127.aShort1471];
		    for (int i_1132_ = 0; i_1132_ < class127.aShort1471;
			 i_1132_++) {
			int i_1133_ = is[i_1132_];
			int i_1134_ = is_1097_[i_1132_];
			boolean bool_1135_ = false;
			int i_1136_;
			if (i_1133_ == 0 && i_1134_ == 0)
			    i_1136_ = (aByteArrayArray9536[i][i_1095_]
				       - aByteArrayArray9525[i][i_1095_]);
			else if (i_1133_ == 0
				 && i_1134_ == anInt1761 * 435863595)
			    i_1136_ = (aByteArrayArray9536[i][i_1095_ + 1]
				       - aByteArrayArray9525[i][i_1095_ + 1]);
			else if (i_1133_ == anInt1761 * 435863595
				 && i_1134_ == anInt1761 * 435863595)
			    i_1136_
				= (aByteArrayArray9536[i + 1][i_1095_ + 1]
				   - aByteArrayArray9525[i + 1][i_1095_ + 1]);
			else if (i_1133_ == anInt1761 * 435863595
				 && i_1134_ == 0)
			    i_1136_ = (aByteArrayArray9536[i + 1][i_1095_]
				       - aByteArrayArray9525[i + 1][i_1095_]);
			else {
			    int i_1137_
				= (((aByteArrayArray9536[i][i_1095_]
				     - aByteArrayArray9525[i][i_1095_])
				    * (anInt1761 * 435863595 - i_1133_))
				   + ((aByteArrayArray9536[i + 1][i_1095_]
				       - aByteArrayArray9525[i + 1][i_1095_])
				      * i_1133_));
			    int i_1138_
				= (((aByteArrayArray9536[i][i_1095_ + 1]
				     - aByteArrayArray9525[i][i_1095_ + 1])
				    * (anInt1761 * 435863595 - i_1133_))
				   + (aByteArrayArray9536[i + 1][i_1095_ + 1]
				      - (aByteArrayArray9525[i + 1]
					 [i_1095_ + 1])) * i_1133_);
			    i_1136_
				= ((i_1137_ * (anInt1761 * 435863595 - i_1134_)
				    + i_1138_ * i_1134_)
				   >> anInt1763 * 168112006);
			}
			int i_1139_ = (i << anInt1763 * -2063427645) + i_1133_;
			int i_1140_
			    = (i_1095_ << anInt1763 * -2063427645) + i_1134_;
			class127.aShortArray1473[i_1132_] = (short) i_1133_;
			class127.aShortArray1470[i_1132_] = (short) i_1134_;
			class127.aShortArray1477[i_1132_]
			    = (short) (method2619(i_1139_, i_1140_, 460739517)
				       + (is_1096_ != null ? is_1096_[i_1132_]
					  : 0));
			if (i_1136_ < 0)
			    i_1136_ = 0;
			if (is_1099_[i_1132_] == 0) {
			    if (is_1100_ != null)
				class127.anIntArray1475[i_1132_]
				    = i_1136_ << 25;
			    else
				class127.anIntArray1475[i_1132_] = 0;
			} else {
			    int i_1141_ = 0;
			    if (is_1098_ != null) {
				int i_1142_
				    = (class127.aShortArray1476[i_1132_]
				       = (short) is_1098_[i_1132_]);
				if (class176.anInt1879 * -734182087 != 0) {
				    i_1141_
					= 255 * i_1142_ / (class176.anInt1879
							   * -734182087);
				    if (i_1141_ < 0)
					i_1141_ = 0;
				    else if (i_1141_ > 255)
					i_1141_ = 255;
				}
			    }
			    class127.anIntArray1475[i_1132_]
				= (Class525_Sub31.method16523
				   (method15241(is_1099_[i_1132_] >> 8,
						i_1136_),
				    class176.anInt1877 * 2141545647, i_1141_,
				    -1425027090));
			    if (is_1100_ != null)
				class127.anIntArray1475[i_1132_]
				    |= i_1136_ << 25;
			}
		    }
		    boolean bool_1143_ = false;
		    for (int i_1144_ = 0; i_1144_ < class127.aShort1474;
			 i_1144_++) {
			if (is_1101_[i_1144_ * 3] != -1
			    && !(aClass182_Sub2_9513.aClass180_1944.method3116
				 (is_1101_[i_1144_ * 3], -1431554601)
				 .aBool1819))
			    bool_1143_ = true;
		    }
		    if (is_1100_ != null)
			class127.anIntArray1480 = new int[class127.aShort1474];
		    if (bool_1143_) {
			class127.aShortArray1478
			    = new short[class127.aShort1474];
			class127.aShortArray1479
			    = new short[class127.aShort1474];
		    }
		    for (int i_1145_ = 0; i_1145_ < class127.aShort1474;
			 i_1145_++) {
			int i_1146_ = i_1145_ * 3;
			if (is_1100_ != null && is_1100_[i_1146_] != 0)
			    class127.anIntArray1480[i_1145_]
				= is_1100_[i_1146_] >> 8;
			if (bool_1143_) {
			    int i_1147_ = i_1146_ + 1;
			    int i_1148_ = i_1147_ + 1;
			    boolean bool_1149_ = false;
			    boolean bool_1150_ = true;
			    int i_1151_ = is_1101_[i_1146_];
			    if (i_1151_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1151_, -1431554601).aBool1819))
				bool_1150_ = false;
			    else
				bool_1149_ = true;
			    i_1151_ = is_1101_[i_1147_];
			    if (i_1151_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1151_, -1431554601).aBool1819))
				bool_1150_ = false;
			    else
				bool_1149_ = true;
			    i_1151_ = is_1101_[i_1148_];
			    if (i_1151_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1151_, -1431554601).aBool1819))
				bool_1150_ = false;
			    else
				bool_1149_ = true;
			    if (bool_1150_) {
				class127.aShortArray1478[i_1145_]
				    = (short) i_1151_;
				class127.aShortArray1479[i_1145_]
				    = (short) is_1102_[i_1146_];
			    } else {
				if (bool_1149_) {
				    i_1151_ = is_1101_[i_1146_];
				    if (i_1151_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1151_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1146_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1151_, -1431554601)
						   .aShort1834) & 0xffff,
						  891692660)) & 0xffff]);
				    i_1151_ = is_1101_[i_1147_];
				    if (i_1151_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1151_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1147_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1151_, -1431554601)
						   .aShort1834) & 0xffff,
						  1401714161)) & 0xffff]);
				    i_1151_ = is_1101_[i_1148_];
				    if (i_1151_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1151_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1148_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1151_, -1431554601)
						   .aShort1834) & 0xffff,
						  751207241)) & 0xffff]);
				}
				class127.aShortArray1478[i_1145_] = (short) -1;
			    }
			}
		    }
		    aClass127ArrayArray9524[i][i_1095_] = class127;
		}
	    }
	}
    }
    
    public void method2616(int i, int i_1152_, int[] is, int[] is_1153_,
			   int[] is_1154_, int[] is_1155_, int[] is_1156_,
			   int[] is_1157_, int[] is_1158_, int[] is_1159_,
			   Class176 class176, boolean bool) {
	boolean bool_1160_ = (anInt9514 & 0x20) == 0;
	if (aClass123ArrayArray9517 == null && !bool_1160_) {
	    aClass123ArrayArray9517
		= new Class123[anInt1759 * 363736815][anInt1760 * -1152334393];
	    aClass127ArrayArray9524
		= new Class127[anInt1759 * 363736815][anInt1760 * -1152334393];
	} else if (aClass134ArrayArray9519 == null && bool_1160_)
	    aClass134ArrayArray9519
		= new Class134[anInt1759 * 363736815][anInt1760 * -1152334393];
	else if (aClass129ArrayArray9515 != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_1161_ = 0; i_1161_ < is_1156_.length; i_1161_++) {
		if (is_1156_[i_1161_] == -1)
		    is_1156_[i_1161_] = 0;
		else
		    is_1156_[i_1161_]
			= (Class381.anIntArray3929
			   [(Class504.method8313(is_1156_[i_1161_], 2016125082)
			     & 0xffff)]) << 8 | 0xff;
	    }
	    if (is_1157_ != null) {
		for (int i_1162_ = 0; i_1162_ < is_1157_.length; i_1162_++) {
		    if (is_1157_[i_1162_] == -1)
			is_1157_[i_1162_] = 0;
		    else
			is_1157_[i_1162_]
			    = ((Class381.anIntArray3929
				[Class504.method8313(is_1157_[i_1162_],
						     680536925) & 0xffff]) << 8
			       | 0xff);
		}
	    }
	    if (bool_1160_) {
		Class134 class134 = new Class134();
		class134.aShort1600 = (short) is.length;
		class134.aShort1605 = (short) (is.length / 3);
		class134.aShortArray1601 = new short[class134.aShort1600];
		class134.aShortArray1607 = new short[class134.aShort1600];
		class134.aShortArray1603 = new short[class134.aShort1600];
		class134.anIntArray1599 = new int[class134.aShort1600];
		class134.aShortArray1602 = new short[class134.aShort1600];
		class134.aShortArray1606 = new short[class134.aShort1600];
		class134.aByteArray1608 = new byte[class134.aShort1600];
		if (is_1155_ != null)
		    class134.aShortArray1604 = new short[class134.aShort1600];
		for (int i_1163_ = 0; i_1163_ < class134.aShort1600;
		     i_1163_++) {
		    int i_1164_ = is[i_1163_];
		    int i_1165_ = is_1154_[i_1163_];
		    boolean bool_1166_ = false;
		    int i_1167_;
		    if (i_1164_ == 0 && i_1165_ == 0)
			i_1167_ = (aByteArrayArray9536[i][i_1152_]
				   - aByteArrayArray9525[i][i_1152_]);
		    else if (i_1164_ == 0 && i_1165_ == anInt1761 * 435863595)
			i_1167_ = (aByteArrayArray9536[i][i_1152_ + 1]
				   - aByteArrayArray9525[i][i_1152_ + 1]);
		    else if (i_1164_ == anInt1761 * 435863595
			     && i_1165_ == anInt1761 * 435863595)
			i_1167_ = (aByteArrayArray9536[i + 1][i_1152_ + 1]
				   - aByteArrayArray9525[i + 1][i_1152_ + 1]);
		    else if (i_1164_ == anInt1761 * 435863595 && i_1165_ == 0)
			i_1167_ = (aByteArrayArray9536[i + 1][i_1152_]
				   - aByteArrayArray9525[i + 1][i_1152_]);
		    else {
			int i_1168_
			    = (((aByteArrayArray9536[i][i_1152_]
				 - aByteArrayArray9525[i][i_1152_])
				* (anInt1761 * 435863595 - i_1164_))
			       + ((aByteArrayArray9536[i + 1][i_1152_]
				   - aByteArrayArray9525[i + 1][i_1152_])
				  * i_1164_));
			int i_1169_
			    = (((aByteArrayArray9536[i][i_1152_ + 1]
				 - aByteArrayArray9525[i][i_1152_ + 1])
				* (anInt1761 * 435863595 - i_1164_))
			       + ((aByteArrayArray9536[i + 1][i_1152_ + 1]
				   - aByteArrayArray9525[i + 1][i_1152_ + 1])
				  * i_1164_));
			i_1167_
			    = (i_1168_ * (anInt1761 * 435863595 - i_1165_)
			       + i_1169_ * i_1165_) >> anInt1763 * 168112006;
		    }
		    int i_1170_ = (i << anInt1763 * -2063427645) + i_1164_;
		    int i_1171_
			= (i_1152_ << anInt1763 * -2063427645) + i_1165_;
		    class134.aShortArray1601[i_1163_] = (short) i_1164_;
		    class134.aShortArray1603[i_1163_] = (short) i_1165_;
		    class134.aShortArray1607[i_1163_]
			= (short) (method2619(i_1170_, i_1171_, 341852033)
				   + (is_1153_ != null ? is_1153_[i_1163_]
				      : 0));
		    if (i_1167_ < 0)
			i_1167_ = 0;
		    if (is_1156_[i_1163_] == 0) {
			class134.anIntArray1599[i_1163_] = 0;
			if (is_1157_ != null)
			    class134.aByteArray1608[i_1163_] = (byte) i_1167_;
		    } else {
			int i_1172_ = 0;
			if (is_1155_ != null) {
			    int i_1173_ = (class134.aShortArray1604[i_1163_]
					   = (short) is_1155_[i_1163_]);
			    if (class176.anInt1879 * -734182087 != 0) {
				i_1172_ = 255 * i_1173_ / (class176.anInt1879
							   * -734182087);
				if (i_1172_ < 0)
				    i_1172_ = 0;
				else if (i_1172_ > 255)
				    i_1172_ = 255;
			    }
			}
			int i_1174_ = -16777216;
			if (is_1158_[i_1163_] != -1) {
			    TextureMetrics class166
				= (aClass182_Sub2_9513.aClass180_1944
				       .method3116
				   (is_1158_[i_1163_], -1431554601));
			    if (class166.aBool1801
				&& method15244(class166.aByte1825))
				i_1174_ = -1694498816;
			}
			class134.anIntArray1599[i_1163_]
			    = i_1174_ | (Class525_Sub31.method16523
					 (method15241(is_1156_[i_1163_] >> 8,
						      i_1167_),
					  class176.anInt1877 * 2141545647,
					  i_1172_, -1425027090));
			if (is_1157_ != null)
			    class134.aByteArray1608[i_1163_] = (byte) i_1167_;
		    }
		    class134.aShortArray1602[i_1163_]
			= (short) is_1158_[i_1163_];
		    class134.aShortArray1606[i_1163_]
			= (short) is_1159_[i_1163_];
		}
		if (is_1157_ != null) {
		    class134.anIntArray1609 = new int[class134.aShort1605];
		    for (int i_1175_ = 0; i_1175_ < class134.aShort1605;
			 i_1175_++) {
			int i_1176_ = i_1175_ * 3;
			if (is_1157_[i_1176_] != 0)
			    class134.anIntArray1609[i_1175_]
				= ~0xffffff | is_1157_[i_1176_] >> 8;
		    }
		}
		aClass134ArrayArray9519[i][i_1152_] = class134;
	    } else {
		boolean bool_1177_ = true;
		int i_1178_ = -1;
		int i_1179_ = -1;
		int i_1180_ = -1;
		int i_1181_ = -1;
		if (is.length == 6) {
		    for (int i_1182_ = 0; i_1182_ < 6; i_1182_++) {
			if (is[i_1182_] == 0 && is_1154_[i_1182_] == 0) {
			    if (i_1178_ != -1
				&& is_1156_[i_1178_] != is_1156_[i_1182_]) {
				bool_1177_ = false;
				break;
			    }
			    i_1178_ = i_1182_;
			} else if (is[i_1182_] == anInt1761 * 435863595
				   && is_1154_[i_1182_] == 0) {
			    if (i_1179_ != -1
				&& is_1156_[i_1179_] != is_1156_[i_1182_]) {
				bool_1177_ = false;
				break;
			    }
			    i_1179_ = i_1182_;
			} else if (is[i_1182_] == anInt1761 * 435863595
				   && (is_1154_[i_1182_]
				       == anInt1761 * 435863595)) {
			    if (i_1180_ != -1
				&& is_1156_[i_1180_] != is_1156_[i_1182_]) {
				bool_1177_ = false;
				break;
			    }
			    i_1180_ = i_1182_;
			} else if (is[i_1182_] == 0
				   && (is_1154_[i_1182_]
				       == anInt1761 * 435863595)) {
			    if (i_1181_ != -1
				&& is_1156_[i_1181_] != is_1156_[i_1182_]) {
				bool_1177_ = false;
				break;
			    }
			    i_1181_ = i_1182_;
			}
		    }
		    if (i_1178_ == -1 || i_1179_ == -1 || i_1180_ == -1
			|| i_1181_ == -1)
			bool_1177_ = false;
		    if (bool_1177_) {
			if (is_1153_ != null) {
			    for (int i_1183_ = 0; i_1183_ < 4; i_1183_++) {
				if (is_1153_[i_1183_] != 0) {
				    bool_1177_ = false;
				    break;
				}
			    }
			}
			if (bool_1177_) {
			    for (int i_1184_ = 1; i_1184_ < 4; i_1184_++) {
				if (is[i_1184_] != is[0]
				    && (is[i_1184_]
					!= is[0] + anInt1761 * 435863595)
				    && (is[i_1184_]
					!= is[0] - anInt1761 * 435863595)) {
				    bool_1177_ = false;
				    break;
				}
				if (is_1154_[i_1184_] != is_1154_[0]
				    && (is_1154_[i_1184_]
					!= is_1154_[0] + anInt1761 * 435863595)
				    && (is_1154_[i_1184_]
					!= (is_1154_[0]
					    - anInt1761 * 435863595))) {
				    bool_1177_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    bool_1177_ = false;
		if (bool_1177_) {
		    Class123 class123 = new Class123();
		    int i_1185_ = is_1156_[0];
		    int i_1186_ = is_1158_[0];
		    if (is_1157_ != null) {
			class123.anInt1455 = is_1157_[0] >> 8;
			if (i_1185_ == 0)
			    class123.aByte1451 |= 0x2;
		    } else if (i_1185_ == 0)
			return;
		    if ((anIntArrayArray1762[i][i_1152_]
			 == anIntArrayArray1762[i + 1][i_1152_])
			&& (anIntArrayArray1762[i][i_1152_]
			    == anIntArrayArray1762[i + 1][i_1152_ + 1])
			&& (anIntArrayArray1762[i][i_1152_]
			    == anIntArrayArray1762[i][i_1152_ + 1]))
			class123.aByte1451 |= 0x1;
		    if (i_1186_ != -1 && (class123.aByte1451 & 0x2) == 0
			&& !(aClass182_Sub2_9513.aClass180_1944.method3116
			     (i_1186_, -1431554601).aBool1819)) {
			int i_1187_;
			if (is_1155_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1187_
				= 255 * is_1155_[i_1178_] / (class176.anInt1879
							     * -734182087);
			    if (i_1187_ < 0)
				i_1187_ = 0;
			    else if (i_1187_ > 255)
				i_1187_ = 255;
			} else
			    i_1187_ = 0;
			class123.anInt1453
			    = (Class525_Sub31.method16523
			       (method15241(is_1156_[i_1178_] >> 8,
					    (aByteArrayArray9536[i][i_1152_]
					     - (aByteArrayArray9525[i]
						[i_1152_]))),
				class176.anInt1877 * 2141545647, i_1187_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1453
				|= (255 - (aByteArrayArray9536[i][i_1152_]
					   - aByteArrayArray9525[i][i_1152_])
				    << 25);
			if (is_1155_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1187_
				= 255 * is_1155_[i_1179_] / (class176.anInt1879
							     * -734182087);
			    if (i_1187_ < 0)
				i_1187_ = 0;
			    else if (i_1187_ > 255)
				i_1187_ = 255;
			} else
			    i_1187_ = 0;
			class123.anInt1446
			    = (Class525_Sub31.method16523
			       (method15241(is_1156_[i_1179_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1152_])
					     - (aByteArrayArray9525[i + 1]
						[i_1152_]))),
				class176.anInt1877 * 2141545647, i_1187_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1446
				|= 255 - (aByteArrayArray9536[i + 1][i_1152_]
					  - (aByteArrayArray9525[i + 1]
					     [i_1152_])) << 25;
			if (is_1155_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1187_
				= 255 * is_1155_[i_1180_] / (class176.anInt1879
							     * -734182087);
			    if (i_1187_ < 0)
				i_1187_ = 0;
			    else if (i_1187_ > 255)
				i_1187_ = 255;
			} else
			    i_1187_ = 0;
			class123.anInt1447
			    = (Class525_Sub31.method16523
			       (method15241(is_1156_[i_1180_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1152_ + 1])
					     - (aByteArrayArray9525[i + 1]
						[i_1152_ + 1]))),
				class176.anInt1877 * 2141545647, i_1187_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1447
				|= (255
				    - (aByteArrayArray9536[i + 1][i_1152_ + 1]
				       - (aByteArrayArray9525[i + 1]
					  [i_1152_ + 1]))) << 25;
			if (is_1155_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1187_
				= 255 * is_1155_[i_1181_] / (class176.anInt1879
							     * -734182087);
			    if (i_1187_ < 0)
				i_1187_ = 0;
			    else if (i_1187_ > 255)
				i_1187_ = 255;
			} else
			    i_1187_ = 0;
			class123.anInt1450
			    = (Class525_Sub31.method16523
			       (method15241(is_1156_[i_1181_] >> 8,
					    ((aByteArrayArray9536[i]
					      [i_1152_ + 1])
					     - (aByteArrayArray9525[i]
						[i_1152_ + 1]))),
				class176.anInt1877 * 2141545647, i_1187_,
				-1425027090));
			class123.aShort1456 = (short) i_1186_;
		    } else {
			int i_1188_;
			if (is_1155_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1188_
				= 255 * is_1155_[i_1178_] / (class176.anInt1879
							     * -734182087);
			    if (i_1188_ < 0)
				i_1188_ = 0;
			    else if (i_1188_ > 255)
				i_1188_ = 255;
			} else
			    i_1188_ = 0;
			class123.anInt1453
			    = (Class525_Sub31.method16523
			       (method15241(is_1156_[i_1178_] >> 8,
					    (aByteArrayArray9536[i][i_1152_]
					     - (aByteArrayArray9525[i]
						[i_1152_]))),
				class176.anInt1877 * 2141545647, i_1188_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1453
				|= (255 - (aByteArrayArray9536[i][i_1152_]
					   - aByteArrayArray9525[i][i_1152_])
				    << 25);
			if (is_1155_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1188_
				= 255 * is_1155_[i_1179_] / (class176.anInt1879
							     * -734182087);
			    if (i_1188_ < 0)
				i_1188_ = 0;
			    else if (i_1188_ > 255)
				i_1188_ = 255;
			} else
			    i_1188_ = 0;
			class123.anInt1446
			    = (Class525_Sub31.method16523
			       (method15241(is_1156_[i_1179_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1152_])
					     - (aByteArrayArray9525[i + 1]
						[i_1152_]))),
				class176.anInt1877 * 2141545647, i_1188_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1446
				|= 255 - (aByteArrayArray9536[i + 1][i_1152_]
					  - (aByteArrayArray9525[i + 1]
					     [i_1152_])) << 25;
			if (is_1155_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1188_
				= 255 * is_1155_[i_1180_] / (class176.anInt1879
							     * -734182087);
			    if (i_1188_ < 0)
				i_1188_ = 0;
			    else if (i_1188_ > 255)
				i_1188_ = 255;
			} else
			    i_1188_ = 0;
			class123.anInt1447
			    = (Class525_Sub31.method16523
			       (method15241(is_1156_[i_1180_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1152_ + 1])
					     - (aByteArrayArray9525[i + 1]
						[i_1152_ + 1]))),
				class176.anInt1877 * 2141545647, i_1188_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1447
				|= (255
				    - (aByteArrayArray9536[i + 1][i_1152_ + 1]
				       - (aByteArrayArray9525[i + 1]
					  [i_1152_ + 1]))) << 25;
			if (is_1155_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1188_
				= 255 * is_1155_[i_1181_] / (class176.anInt1879
							     * -734182087);
			    if (i_1188_ < 0)
				i_1188_ = 0;
			    else if (i_1188_ > 255)
				i_1188_ = 255;
			} else
			    i_1188_ = 0;
			class123.anInt1450
			    = (Class525_Sub31.method16523
			       (method15241(is_1156_[i_1181_] >> 8,
					    ((aByteArrayArray9536[i]
					      [i_1152_ + 1])
					     - (aByteArrayArray9525[i]
						[i_1152_ + 1]))),
				class176.anInt1877 * 2141545647, i_1188_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1450
				|= 255 - (aByteArrayArray9536[i][i_1152_ + 1]
					  - (aByteArrayArray9525[i]
					     [i_1152_ + 1])) << 25;
			class123.aShort1456 = (short) -1;
		    }
		    if (is_1155_ != null) {
			class123.aShort1448 = (short) is_1155_[i_1180_];
			class123.aShort1454 = (short) is_1155_[i_1181_];
			class123.aShort1452 = (short) is_1155_[i_1179_];
			class123.aShort1449 = (short) is_1155_[i_1178_];
		    }
		    aClass123ArrayArray9517[i][i_1152_] = class123;
		} else {
		    Class127 class127 = new Class127();
		    class127.aShort1471 = (short) is.length;
		    class127.aShort1474 = (short) (is.length / 3);
		    class127.aShortArray1473 = new short[class127.aShort1471];
		    class127.aShortArray1477 = new short[class127.aShort1471];
		    class127.aShortArray1470 = new short[class127.aShort1471];
		    class127.anIntArray1475 = new int[class127.aShort1471];
		    if (is_1155_ != null)
			class127.aShortArray1476
			    = new short[class127.aShort1471];
		    for (int i_1189_ = 0; i_1189_ < class127.aShort1471;
			 i_1189_++) {
			int i_1190_ = is[i_1189_];
			int i_1191_ = is_1154_[i_1189_];
			boolean bool_1192_ = false;
			int i_1193_;
			if (i_1190_ == 0 && i_1191_ == 0)
			    i_1193_ = (aByteArrayArray9536[i][i_1152_]
				       - aByteArrayArray9525[i][i_1152_]);
			else if (i_1190_ == 0
				 && i_1191_ == anInt1761 * 435863595)
			    i_1193_ = (aByteArrayArray9536[i][i_1152_ + 1]
				       - aByteArrayArray9525[i][i_1152_ + 1]);
			else if (i_1190_ == anInt1761 * 435863595
				 && i_1191_ == anInt1761 * 435863595)
			    i_1193_
				= (aByteArrayArray9536[i + 1][i_1152_ + 1]
				   - aByteArrayArray9525[i + 1][i_1152_ + 1]);
			else if (i_1190_ == anInt1761 * 435863595
				 && i_1191_ == 0)
			    i_1193_ = (aByteArrayArray9536[i + 1][i_1152_]
				       - aByteArrayArray9525[i + 1][i_1152_]);
			else {
			    int i_1194_
				= (((aByteArrayArray9536[i][i_1152_]
				     - aByteArrayArray9525[i][i_1152_])
				    * (anInt1761 * 435863595 - i_1190_))
				   + ((aByteArrayArray9536[i + 1][i_1152_]
				       - aByteArrayArray9525[i + 1][i_1152_])
				      * i_1190_));
			    int i_1195_
				= (((aByteArrayArray9536[i][i_1152_ + 1]
				     - aByteArrayArray9525[i][i_1152_ + 1])
				    * (anInt1761 * 435863595 - i_1190_))
				   + (aByteArrayArray9536[i + 1][i_1152_ + 1]
				      - (aByteArrayArray9525[i + 1]
					 [i_1152_ + 1])) * i_1190_);
			    i_1193_
				= ((i_1194_ * (anInt1761 * 435863595 - i_1191_)
				    + i_1195_ * i_1191_)
				   >> anInt1763 * 168112006);
			}
			int i_1196_ = (i << anInt1763 * -2063427645) + i_1190_;
			int i_1197_
			    = (i_1152_ << anInt1763 * -2063427645) + i_1191_;
			class127.aShortArray1473[i_1189_] = (short) i_1190_;
			class127.aShortArray1470[i_1189_] = (short) i_1191_;
			class127.aShortArray1477[i_1189_]
			    = (short) (method2619(i_1196_, i_1197_, -270828702)
				       + (is_1153_ != null ? is_1153_[i_1189_]
					  : 0));
			if (i_1193_ < 0)
			    i_1193_ = 0;
			if (is_1156_[i_1189_] == 0) {
			    if (is_1157_ != null)
				class127.anIntArray1475[i_1189_]
				    = i_1193_ << 25;
			    else
				class127.anIntArray1475[i_1189_] = 0;
			} else {
			    int i_1198_ = 0;
			    if (is_1155_ != null) {
				int i_1199_
				    = (class127.aShortArray1476[i_1189_]
				       = (short) is_1155_[i_1189_]);
				if (class176.anInt1879 * -734182087 != 0) {
				    i_1198_
					= 255 * i_1199_ / (class176.anInt1879
							   * -734182087);
				    if (i_1198_ < 0)
					i_1198_ = 0;
				    else if (i_1198_ > 255)
					i_1198_ = 255;
				}
			    }
			    class127.anIntArray1475[i_1189_]
				= (Class525_Sub31.method16523
				   (method15241(is_1156_[i_1189_] >> 8,
						i_1193_),
				    class176.anInt1877 * 2141545647, i_1198_,
				    -1425027090));
			    if (is_1157_ != null)
				class127.anIntArray1475[i_1189_]
				    |= i_1193_ << 25;
			}
		    }
		    boolean bool_1200_ = false;
		    for (int i_1201_ = 0; i_1201_ < class127.aShort1474;
			 i_1201_++) {
			if (is_1158_[i_1201_ * 3] != -1
			    && !(aClass182_Sub2_9513.aClass180_1944.method3116
				 (is_1158_[i_1201_ * 3], -1431554601)
				 .aBool1819))
			    bool_1200_ = true;
		    }
		    if (is_1157_ != null)
			class127.anIntArray1480 = new int[class127.aShort1474];
		    if (bool_1200_) {
			class127.aShortArray1478
			    = new short[class127.aShort1474];
			class127.aShortArray1479
			    = new short[class127.aShort1474];
		    }
		    for (int i_1202_ = 0; i_1202_ < class127.aShort1474;
			 i_1202_++) {
			int i_1203_ = i_1202_ * 3;
			if (is_1157_ != null && is_1157_[i_1203_] != 0)
			    class127.anIntArray1480[i_1202_]
				= is_1157_[i_1203_] >> 8;
			if (bool_1200_) {
			    int i_1204_ = i_1203_ + 1;
			    int i_1205_ = i_1204_ + 1;
			    boolean bool_1206_ = false;
			    boolean bool_1207_ = true;
			    int i_1208_ = is_1158_[i_1203_];
			    if (i_1208_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1208_, -1431554601).aBool1819))
				bool_1207_ = false;
			    else
				bool_1206_ = true;
			    i_1208_ = is_1158_[i_1204_];
			    if (i_1208_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1208_, -1431554601).aBool1819))
				bool_1207_ = false;
			    else
				bool_1206_ = true;
			    i_1208_ = is_1158_[i_1205_];
			    if (i_1208_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1208_, -1431554601).aBool1819))
				bool_1207_ = false;
			    else
				bool_1206_ = true;
			    if (bool_1207_) {
				class127.aShortArray1478[i_1202_]
				    = (short) i_1208_;
				class127.aShortArray1479[i_1202_]
				    = (short) is_1159_[i_1203_];
			    } else {
				if (bool_1206_) {
				    i_1208_ = is_1158_[i_1203_];
				    if (i_1208_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1208_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1203_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1208_, -1431554601)
						   .aShort1834) & 0xffff,
						  621075480)) & 0xffff]);
				    i_1208_ = is_1158_[i_1204_];
				    if (i_1208_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1208_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1204_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1208_, -1431554601)
						   .aShort1834) & 0xffff,
						  1913541257)) & 0xffff]);
				    i_1208_ = is_1158_[i_1205_];
				    if (i_1208_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1208_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1205_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1208_, -1431554601)
						   .aShort1834) & 0xffff,
						  775617574)) & 0xffff]);
				}
				class127.aShortArray1478[i_1202_] = (short) -1;
			    }
			}
		    }
		    aClass127ArrayArray9524[i][i_1152_] = class127;
		}
	    }
	}
    }
    
    public void method2582(int i, int i_1209_, int[] is, int[] is_1210_,
			   int[] is_1211_, int[] is_1212_, int[] is_1213_,
			   int[] is_1214_, int[] is_1215_, int[] is_1216_,
			   Class176 class176, boolean bool) {
	boolean bool_1217_ = (anInt9514 & 0x20) == 0;
	if (aClass123ArrayArray9517 == null && !bool_1217_) {
	    aClass123ArrayArray9517
		= new Class123[anInt1759 * 363736815][anInt1760 * -1152334393];
	    aClass127ArrayArray9524
		= new Class127[anInt1759 * 363736815][anInt1760 * -1152334393];
	} else if (aClass134ArrayArray9519 == null && bool_1217_)
	    aClass134ArrayArray9519
		= new Class134[anInt1759 * 363736815][anInt1760 * -1152334393];
	else if (aClass129ArrayArray9515 != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_1218_ = 0; i_1218_ < is_1213_.length; i_1218_++) {
		if (is_1213_[i_1218_] == -1)
		    is_1213_[i_1218_] = 0;
		else
		    is_1213_[i_1218_]
			= (Class381.anIntArray3929
			   [(Class504.method8313(is_1213_[i_1218_], 319963229)
			     & 0xffff)]) << 8 | 0xff;
	    }
	    if (is_1214_ != null) {
		for (int i_1219_ = 0; i_1219_ < is_1214_.length; i_1219_++) {
		    if (is_1214_[i_1219_] == -1)
			is_1214_[i_1219_] = 0;
		    else
			is_1214_[i_1219_]
			    = ((Class381.anIntArray3929
				[Class504.method8313(is_1214_[i_1219_],
						     1102264751) & 0xffff])
			       << 8) | 0xff;
		}
	    }
	    if (bool_1217_) {
		Class134 class134 = new Class134();
		class134.aShort1600 = (short) is.length;
		class134.aShort1605 = (short) (is.length / 3);
		class134.aShortArray1601 = new short[class134.aShort1600];
		class134.aShortArray1607 = new short[class134.aShort1600];
		class134.aShortArray1603 = new short[class134.aShort1600];
		class134.anIntArray1599 = new int[class134.aShort1600];
		class134.aShortArray1602 = new short[class134.aShort1600];
		class134.aShortArray1606 = new short[class134.aShort1600];
		class134.aByteArray1608 = new byte[class134.aShort1600];
		if (is_1212_ != null)
		    class134.aShortArray1604 = new short[class134.aShort1600];
		for (int i_1220_ = 0; i_1220_ < class134.aShort1600;
		     i_1220_++) {
		    int i_1221_ = is[i_1220_];
		    int i_1222_ = is_1211_[i_1220_];
		    boolean bool_1223_ = false;
		    int i_1224_;
		    if (i_1221_ == 0 && i_1222_ == 0)
			i_1224_ = (aByteArrayArray9536[i][i_1209_]
				   - aByteArrayArray9525[i][i_1209_]);
		    else if (i_1221_ == 0 && i_1222_ == anInt1761 * 435863595)
			i_1224_ = (aByteArrayArray9536[i][i_1209_ + 1]
				   - aByteArrayArray9525[i][i_1209_ + 1]);
		    else if (i_1221_ == anInt1761 * 435863595
			     && i_1222_ == anInt1761 * 435863595)
			i_1224_ = (aByteArrayArray9536[i + 1][i_1209_ + 1]
				   - aByteArrayArray9525[i + 1][i_1209_ + 1]);
		    else if (i_1221_ == anInt1761 * 435863595 && i_1222_ == 0)
			i_1224_ = (aByteArrayArray9536[i + 1][i_1209_]
				   - aByteArrayArray9525[i + 1][i_1209_]);
		    else {
			int i_1225_
			    = (((aByteArrayArray9536[i][i_1209_]
				 - aByteArrayArray9525[i][i_1209_])
				* (anInt1761 * 435863595 - i_1221_))
			       + ((aByteArrayArray9536[i + 1][i_1209_]
				   - aByteArrayArray9525[i + 1][i_1209_])
				  * i_1221_));
			int i_1226_
			    = (((aByteArrayArray9536[i][i_1209_ + 1]
				 - aByteArrayArray9525[i][i_1209_ + 1])
				* (anInt1761 * 435863595 - i_1221_))
			       + ((aByteArrayArray9536[i + 1][i_1209_ + 1]
				   - aByteArrayArray9525[i + 1][i_1209_ + 1])
				  * i_1221_));
			i_1224_
			    = (i_1225_ * (anInt1761 * 435863595 - i_1222_)
			       + i_1226_ * i_1222_) >> anInt1763 * 168112006;
		    }
		    int i_1227_ = (i << anInt1763 * -2063427645) + i_1221_;
		    int i_1228_
			= (i_1209_ << anInt1763 * -2063427645) + i_1222_;
		    class134.aShortArray1601[i_1220_] = (short) i_1221_;
		    class134.aShortArray1603[i_1220_] = (short) i_1222_;
		    class134.aShortArray1607[i_1220_]
			= (short) (method2619(i_1227_, i_1228_, 1859801572)
				   + (is_1210_ != null ? is_1210_[i_1220_]
				      : 0));
		    if (i_1224_ < 0)
			i_1224_ = 0;
		    if (is_1213_[i_1220_] == 0) {
			class134.anIntArray1599[i_1220_] = 0;
			if (is_1214_ != null)
			    class134.aByteArray1608[i_1220_] = (byte) i_1224_;
		    } else {
			int i_1229_ = 0;
			if (is_1212_ != null) {
			    int i_1230_ = (class134.aShortArray1604[i_1220_]
					   = (short) is_1212_[i_1220_]);
			    if (class176.anInt1879 * -734182087 != 0) {
				i_1229_ = 255 * i_1230_ / (class176.anInt1879
							   * -734182087);
				if (i_1229_ < 0)
				    i_1229_ = 0;
				else if (i_1229_ > 255)
				    i_1229_ = 255;
			    }
			}
			int i_1231_ = -16777216;
			if (is_1215_[i_1220_] != -1) {
			    TextureMetrics class166
				= (aClass182_Sub2_9513.aClass180_1944
				       .method3116
				   (is_1215_[i_1220_], -1431554601));
			    if (class166.aBool1801
				&& method15244(class166.aByte1825))
				i_1231_ = -1694498816;
			}
			class134.anIntArray1599[i_1220_]
			    = i_1231_ | (Class525_Sub31.method16523
					 (method15241(is_1213_[i_1220_] >> 8,
						      i_1224_),
					  class176.anInt1877 * 2141545647,
					  i_1229_, -1425027090));
			if (is_1214_ != null)
			    class134.aByteArray1608[i_1220_] = (byte) i_1224_;
		    }
		    class134.aShortArray1602[i_1220_]
			= (short) is_1215_[i_1220_];
		    class134.aShortArray1606[i_1220_]
			= (short) is_1216_[i_1220_];
		}
		if (is_1214_ != null) {
		    class134.anIntArray1609 = new int[class134.aShort1605];
		    for (int i_1232_ = 0; i_1232_ < class134.aShort1605;
			 i_1232_++) {
			int i_1233_ = i_1232_ * 3;
			if (is_1214_[i_1233_] != 0)
			    class134.anIntArray1609[i_1232_]
				= ~0xffffff | is_1214_[i_1233_] >> 8;
		    }
		}
		aClass134ArrayArray9519[i][i_1209_] = class134;
	    } else {
		boolean bool_1234_ = true;
		int i_1235_ = -1;
		int i_1236_ = -1;
		int i_1237_ = -1;
		int i_1238_ = -1;
		if (is.length == 6) {
		    for (int i_1239_ = 0; i_1239_ < 6; i_1239_++) {
			if (is[i_1239_] == 0 && is_1211_[i_1239_] == 0) {
			    if (i_1235_ != -1
				&& is_1213_[i_1235_] != is_1213_[i_1239_]) {
				bool_1234_ = false;
				break;
			    }
			    i_1235_ = i_1239_;
			} else if (is[i_1239_] == anInt1761 * 435863595
				   && is_1211_[i_1239_] == 0) {
			    if (i_1236_ != -1
				&& is_1213_[i_1236_] != is_1213_[i_1239_]) {
				bool_1234_ = false;
				break;
			    }
			    i_1236_ = i_1239_;
			} else if (is[i_1239_] == anInt1761 * 435863595
				   && (is_1211_[i_1239_]
				       == anInt1761 * 435863595)) {
			    if (i_1237_ != -1
				&& is_1213_[i_1237_] != is_1213_[i_1239_]) {
				bool_1234_ = false;
				break;
			    }
			    i_1237_ = i_1239_;
			} else if (is[i_1239_] == 0
				   && (is_1211_[i_1239_]
				       == anInt1761 * 435863595)) {
			    if (i_1238_ != -1
				&& is_1213_[i_1238_] != is_1213_[i_1239_]) {
				bool_1234_ = false;
				break;
			    }
			    i_1238_ = i_1239_;
			}
		    }
		    if (i_1235_ == -1 || i_1236_ == -1 || i_1237_ == -1
			|| i_1238_ == -1)
			bool_1234_ = false;
		    if (bool_1234_) {
			if (is_1210_ != null) {
			    for (int i_1240_ = 0; i_1240_ < 4; i_1240_++) {
				if (is_1210_[i_1240_] != 0) {
				    bool_1234_ = false;
				    break;
				}
			    }
			}
			if (bool_1234_) {
			    for (int i_1241_ = 1; i_1241_ < 4; i_1241_++) {
				if (is[i_1241_] != is[0]
				    && (is[i_1241_]
					!= is[0] + anInt1761 * 435863595)
				    && (is[i_1241_]
					!= is[0] - anInt1761 * 435863595)) {
				    bool_1234_ = false;
				    break;
				}
				if (is_1211_[i_1241_] != is_1211_[0]
				    && (is_1211_[i_1241_]
					!= is_1211_[0] + anInt1761 * 435863595)
				    && (is_1211_[i_1241_]
					!= (is_1211_[0]
					    - anInt1761 * 435863595))) {
				    bool_1234_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    bool_1234_ = false;
		if (bool_1234_) {
		    Class123 class123 = new Class123();
		    int i_1242_ = is_1213_[0];
		    int i_1243_ = is_1215_[0];
		    if (is_1214_ != null) {
			class123.anInt1455 = is_1214_[0] >> 8;
			if (i_1242_ == 0)
			    class123.aByte1451 |= 0x2;
		    } else if (i_1242_ == 0)
			return;
		    if ((anIntArrayArray1762[i][i_1209_]
			 == anIntArrayArray1762[i + 1][i_1209_])
			&& (anIntArrayArray1762[i][i_1209_]
			    == anIntArrayArray1762[i + 1][i_1209_ + 1])
			&& (anIntArrayArray1762[i][i_1209_]
			    == anIntArrayArray1762[i][i_1209_ + 1]))
			class123.aByte1451 |= 0x1;
		    if (i_1243_ != -1 && (class123.aByte1451 & 0x2) == 0
			&& !(aClass182_Sub2_9513.aClass180_1944.method3116
			     (i_1243_, -1431554601).aBool1819)) {
			int i_1244_;
			if (is_1212_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1244_
				= 255 * is_1212_[i_1235_] / (class176.anInt1879
							     * -734182087);
			    if (i_1244_ < 0)
				i_1244_ = 0;
			    else if (i_1244_ > 255)
				i_1244_ = 255;
			} else
			    i_1244_ = 0;
			class123.anInt1453
			    = (Class525_Sub31.method16523
			       (method15241(is_1213_[i_1235_] >> 8,
					    (aByteArrayArray9536[i][i_1209_]
					     - (aByteArrayArray9525[i]
						[i_1209_]))),
				class176.anInt1877 * 2141545647, i_1244_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1453
				|= (255 - (aByteArrayArray9536[i][i_1209_]
					   - aByteArrayArray9525[i][i_1209_])
				    << 25);
			if (is_1212_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1244_
				= 255 * is_1212_[i_1236_] / (class176.anInt1879
							     * -734182087);
			    if (i_1244_ < 0)
				i_1244_ = 0;
			    else if (i_1244_ > 255)
				i_1244_ = 255;
			} else
			    i_1244_ = 0;
			class123.anInt1446
			    = (Class525_Sub31.method16523
			       (method15241(is_1213_[i_1236_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1209_])
					     - (aByteArrayArray9525[i + 1]
						[i_1209_]))),
				class176.anInt1877 * 2141545647, i_1244_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1446
				|= 255 - (aByteArrayArray9536[i + 1][i_1209_]
					  - (aByteArrayArray9525[i + 1]
					     [i_1209_])) << 25;
			if (is_1212_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1244_
				= 255 * is_1212_[i_1237_] / (class176.anInt1879
							     * -734182087);
			    if (i_1244_ < 0)
				i_1244_ = 0;
			    else if (i_1244_ > 255)
				i_1244_ = 255;
			} else
			    i_1244_ = 0;
			class123.anInt1447
			    = (Class525_Sub31.method16523
			       (method15241(is_1213_[i_1237_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1209_ + 1])
					     - (aByteArrayArray9525[i + 1]
						[i_1209_ + 1]))),
				class176.anInt1877 * 2141545647, i_1244_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1447
				|= (255
				    - (aByteArrayArray9536[i + 1][i_1209_ + 1]
				       - (aByteArrayArray9525[i + 1]
					  [i_1209_ + 1]))) << 25;
			if (is_1212_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1244_
				= 255 * is_1212_[i_1238_] / (class176.anInt1879
							     * -734182087);
			    if (i_1244_ < 0)
				i_1244_ = 0;
			    else if (i_1244_ > 255)
				i_1244_ = 255;
			} else
			    i_1244_ = 0;
			class123.anInt1450
			    = (Class525_Sub31.method16523
			       (method15241(is_1213_[i_1238_] >> 8,
					    ((aByteArrayArray9536[i]
					      [i_1209_ + 1])
					     - (aByteArrayArray9525[i]
						[i_1209_ + 1]))),
				class176.anInt1877 * 2141545647, i_1244_,
				-1425027090));
			class123.aShort1456 = (short) i_1243_;
		    } else {
			int i_1245_;
			if (is_1212_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1245_
				= 255 * is_1212_[i_1235_] / (class176.anInt1879
							     * -734182087);
			    if (i_1245_ < 0)
				i_1245_ = 0;
			    else if (i_1245_ > 255)
				i_1245_ = 255;
			} else
			    i_1245_ = 0;
			class123.anInt1453
			    = (Class525_Sub31.method16523
			       (method15241(is_1213_[i_1235_] >> 8,
					    (aByteArrayArray9536[i][i_1209_]
					     - (aByteArrayArray9525[i]
						[i_1209_]))),
				class176.anInt1877 * 2141545647, i_1245_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1453
				|= (255 - (aByteArrayArray9536[i][i_1209_]
					   - aByteArrayArray9525[i][i_1209_])
				    << 25);
			if (is_1212_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1245_
				= 255 * is_1212_[i_1236_] / (class176.anInt1879
							     * -734182087);
			    if (i_1245_ < 0)
				i_1245_ = 0;
			    else if (i_1245_ > 255)
				i_1245_ = 255;
			} else
			    i_1245_ = 0;
			class123.anInt1446
			    = (Class525_Sub31.method16523
			       (method15241(is_1213_[i_1236_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1209_])
					     - (aByteArrayArray9525[i + 1]
						[i_1209_]))),
				class176.anInt1877 * 2141545647, i_1245_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1446
				|= 255 - (aByteArrayArray9536[i + 1][i_1209_]
					  - (aByteArrayArray9525[i + 1]
					     [i_1209_])) << 25;
			if (is_1212_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1245_
				= 255 * is_1212_[i_1237_] / (class176.anInt1879
							     * -734182087);
			    if (i_1245_ < 0)
				i_1245_ = 0;
			    else if (i_1245_ > 255)
				i_1245_ = 255;
			} else
			    i_1245_ = 0;
			class123.anInt1447
			    = (Class525_Sub31.method16523
			       (method15241(is_1213_[i_1237_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1209_ + 1])
					     - (aByteArrayArray9525[i + 1]
						[i_1209_ + 1]))),
				class176.anInt1877 * 2141545647, i_1245_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1447
				|= (255
				    - (aByteArrayArray9536[i + 1][i_1209_ + 1]
				       - (aByteArrayArray9525[i + 1]
					  [i_1209_ + 1]))) << 25;
			if (is_1212_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1245_
				= 255 * is_1212_[i_1238_] / (class176.anInt1879
							     * -734182087);
			    if (i_1245_ < 0)
				i_1245_ = 0;
			    else if (i_1245_ > 255)
				i_1245_ = 255;
			} else
			    i_1245_ = 0;
			class123.anInt1450
			    = (Class525_Sub31.method16523
			       (method15241(is_1213_[i_1238_] >> 8,
					    ((aByteArrayArray9536[i]
					      [i_1209_ + 1])
					     - (aByteArrayArray9525[i]
						[i_1209_ + 1]))),
				class176.anInt1877 * 2141545647, i_1245_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1450
				|= 255 - (aByteArrayArray9536[i][i_1209_ + 1]
					  - (aByteArrayArray9525[i]
					     [i_1209_ + 1])) << 25;
			class123.aShort1456 = (short) -1;
		    }
		    if (is_1212_ != null) {
			class123.aShort1448 = (short) is_1212_[i_1237_];
			class123.aShort1454 = (short) is_1212_[i_1238_];
			class123.aShort1452 = (short) is_1212_[i_1236_];
			class123.aShort1449 = (short) is_1212_[i_1235_];
		    }
		    aClass123ArrayArray9517[i][i_1209_] = class123;
		} else {
		    Class127 class127 = new Class127();
		    class127.aShort1471 = (short) is.length;
		    class127.aShort1474 = (short) (is.length / 3);
		    class127.aShortArray1473 = new short[class127.aShort1471];
		    class127.aShortArray1477 = new short[class127.aShort1471];
		    class127.aShortArray1470 = new short[class127.aShort1471];
		    class127.anIntArray1475 = new int[class127.aShort1471];
		    if (is_1212_ != null)
			class127.aShortArray1476
			    = new short[class127.aShort1471];
		    for (int i_1246_ = 0; i_1246_ < class127.aShort1471;
			 i_1246_++) {
			int i_1247_ = is[i_1246_];
			int i_1248_ = is_1211_[i_1246_];
			boolean bool_1249_ = false;
			int i_1250_;
			if (i_1247_ == 0 && i_1248_ == 0)
			    i_1250_ = (aByteArrayArray9536[i][i_1209_]
				       - aByteArrayArray9525[i][i_1209_]);
			else if (i_1247_ == 0
				 && i_1248_ == anInt1761 * 435863595)
			    i_1250_ = (aByteArrayArray9536[i][i_1209_ + 1]
				       - aByteArrayArray9525[i][i_1209_ + 1]);
			else if (i_1247_ == anInt1761 * 435863595
				 && i_1248_ == anInt1761 * 435863595)
			    i_1250_
				= (aByteArrayArray9536[i + 1][i_1209_ + 1]
				   - aByteArrayArray9525[i + 1][i_1209_ + 1]);
			else if (i_1247_ == anInt1761 * 435863595
				 && i_1248_ == 0)
			    i_1250_ = (aByteArrayArray9536[i + 1][i_1209_]
				       - aByteArrayArray9525[i + 1][i_1209_]);
			else {
			    int i_1251_
				= (((aByteArrayArray9536[i][i_1209_]
				     - aByteArrayArray9525[i][i_1209_])
				    * (anInt1761 * 435863595 - i_1247_))
				   + ((aByteArrayArray9536[i + 1][i_1209_]
				       - aByteArrayArray9525[i + 1][i_1209_])
				      * i_1247_));
			    int i_1252_
				= (((aByteArrayArray9536[i][i_1209_ + 1]
				     - aByteArrayArray9525[i][i_1209_ + 1])
				    * (anInt1761 * 435863595 - i_1247_))
				   + (aByteArrayArray9536[i + 1][i_1209_ + 1]
				      - (aByteArrayArray9525[i + 1]
					 [i_1209_ + 1])) * i_1247_);
			    i_1250_
				= ((i_1251_ * (anInt1761 * 435863595 - i_1248_)
				    + i_1252_ * i_1248_)
				   >> anInt1763 * 168112006);
			}
			int i_1253_ = (i << anInt1763 * -2063427645) + i_1247_;
			int i_1254_
			    = (i_1209_ << anInt1763 * -2063427645) + i_1248_;
			class127.aShortArray1473[i_1246_] = (short) i_1247_;
			class127.aShortArray1470[i_1246_] = (short) i_1248_;
			class127.aShortArray1477[i_1246_]
			    = (short) (method2619(i_1253_, i_1254_,
						  -1827396740)
				       + (is_1210_ != null ? is_1210_[i_1246_]
					  : 0));
			if (i_1250_ < 0)
			    i_1250_ = 0;
			if (is_1213_[i_1246_] == 0) {
			    if (is_1214_ != null)
				class127.anIntArray1475[i_1246_]
				    = i_1250_ << 25;
			    else
				class127.anIntArray1475[i_1246_] = 0;
			} else {
			    int i_1255_ = 0;
			    if (is_1212_ != null) {
				int i_1256_
				    = (class127.aShortArray1476[i_1246_]
				       = (short) is_1212_[i_1246_]);
				if (class176.anInt1879 * -734182087 != 0) {
				    i_1255_
					= 255 * i_1256_ / (class176.anInt1879
							   * -734182087);
				    if (i_1255_ < 0)
					i_1255_ = 0;
				    else if (i_1255_ > 255)
					i_1255_ = 255;
				}
			    }
			    class127.anIntArray1475[i_1246_]
				= (Class525_Sub31.method16523
				   (method15241(is_1213_[i_1246_] >> 8,
						i_1250_),
				    class176.anInt1877 * 2141545647, i_1255_,
				    -1425027090));
			    if (is_1214_ != null)
				class127.anIntArray1475[i_1246_]
				    |= i_1250_ << 25;
			}
		    }
		    boolean bool_1257_ = false;
		    for (int i_1258_ = 0; i_1258_ < class127.aShort1474;
			 i_1258_++) {
			if (is_1215_[i_1258_ * 3] != -1
			    && !(aClass182_Sub2_9513.aClass180_1944.method3116
				 (is_1215_[i_1258_ * 3], -1431554601)
				 .aBool1819))
			    bool_1257_ = true;
		    }
		    if (is_1214_ != null)
			class127.anIntArray1480 = new int[class127.aShort1474];
		    if (bool_1257_) {
			class127.aShortArray1478
			    = new short[class127.aShort1474];
			class127.aShortArray1479
			    = new short[class127.aShort1474];
		    }
		    for (int i_1259_ = 0; i_1259_ < class127.aShort1474;
			 i_1259_++) {
			int i_1260_ = i_1259_ * 3;
			if (is_1214_ != null && is_1214_[i_1260_] != 0)
			    class127.anIntArray1480[i_1259_]
				= is_1214_[i_1260_] >> 8;
			if (bool_1257_) {
			    int i_1261_ = i_1260_ + 1;
			    int i_1262_ = i_1261_ + 1;
			    boolean bool_1263_ = false;
			    boolean bool_1264_ = true;
			    int i_1265_ = is_1215_[i_1260_];
			    if (i_1265_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1265_, -1431554601).aBool1819))
				bool_1264_ = false;
			    else
				bool_1263_ = true;
			    i_1265_ = is_1215_[i_1261_];
			    if (i_1265_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1265_, -1431554601).aBool1819))
				bool_1264_ = false;
			    else
				bool_1263_ = true;
			    i_1265_ = is_1215_[i_1262_];
			    if (i_1265_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1265_, -1431554601).aBool1819))
				bool_1264_ = false;
			    else
				bool_1263_ = true;
			    if (bool_1264_) {
				class127.aShortArray1478[i_1259_]
				    = (short) i_1265_;
				class127.aShortArray1479[i_1259_]
				    = (short) is_1216_[i_1260_];
			    } else {
				if (bool_1263_) {
				    i_1265_ = is_1215_[i_1260_];
				    if (i_1265_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1265_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1260_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1265_, -1431554601)
						   .aShort1834) & 0xffff,
						  687344419)) & 0xffff]);
				    i_1265_ = is_1215_[i_1261_];
				    if (i_1265_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1265_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1261_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1265_, -1431554601)
						   .aShort1834) & 0xffff,
						  1323959542)) & 0xffff]);
				    i_1265_ = is_1215_[i_1262_];
				    if (i_1265_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1265_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1262_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1265_, -1431554601)
						   .aShort1834) & 0xffff,
						  276028489)) & 0xffff]);
				}
				class127.aShortArray1478[i_1259_] = (short) -1;
			    }
			}
		    }
		    aClass127ArrayArray9524[i][i_1209_] = class127;
		}
	    }
	}
    }
    
    public void method2618(int i, int i_1266_, int[] is, int[] is_1267_,
			   int[] is_1268_, int[] is_1269_, int[] is_1270_,
			   int[] is_1271_, int[] is_1272_, int[] is_1273_,
			   Class176 class176, boolean bool) {
	boolean bool_1274_ = (anInt9514 & 0x20) == 0;
	if (aClass123ArrayArray9517 == null && !bool_1274_) {
	    aClass123ArrayArray9517
		= new Class123[anInt1759 * 363736815][anInt1760 * -1152334393];
	    aClass127ArrayArray9524
		= new Class127[anInt1759 * 363736815][anInt1760 * -1152334393];
	} else if (aClass134ArrayArray9519 == null && bool_1274_)
	    aClass134ArrayArray9519
		= new Class134[anInt1759 * 363736815][anInt1760 * -1152334393];
	else if (aClass129ArrayArray9515 != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_1275_ = 0; i_1275_ < is_1270_.length; i_1275_++) {
		if (is_1270_[i_1275_] == -1)
		    is_1270_[i_1275_] = 0;
		else
		    is_1270_[i_1275_]
			= (Class381.anIntArray3929
			   [(Class504.method8313(is_1270_[i_1275_], 1806684841)
			     & 0xffff)]) << 8 | 0xff;
	    }
	    if (is_1271_ != null) {
		for (int i_1276_ = 0; i_1276_ < is_1271_.length; i_1276_++) {
		    if (is_1271_[i_1276_] == -1)
			is_1271_[i_1276_] = 0;
		    else
			is_1271_[i_1276_]
			    = ((Class381.anIntArray3929
				[Class504.method8313(is_1271_[i_1276_],
						     1575972478) & 0xffff])
			       << 8) | 0xff;
		}
	    }
	    if (bool_1274_) {
		Class134 class134 = new Class134();
		class134.aShort1600 = (short) is.length;
		class134.aShort1605 = (short) (is.length / 3);
		class134.aShortArray1601 = new short[class134.aShort1600];
		class134.aShortArray1607 = new short[class134.aShort1600];
		class134.aShortArray1603 = new short[class134.aShort1600];
		class134.anIntArray1599 = new int[class134.aShort1600];
		class134.aShortArray1602 = new short[class134.aShort1600];
		class134.aShortArray1606 = new short[class134.aShort1600];
		class134.aByteArray1608 = new byte[class134.aShort1600];
		if (is_1269_ != null)
		    class134.aShortArray1604 = new short[class134.aShort1600];
		for (int i_1277_ = 0; i_1277_ < class134.aShort1600;
		     i_1277_++) {
		    int i_1278_ = is[i_1277_];
		    int i_1279_ = is_1268_[i_1277_];
		    boolean bool_1280_ = false;
		    int i_1281_;
		    if (i_1278_ == 0 && i_1279_ == 0)
			i_1281_ = (aByteArrayArray9536[i][i_1266_]
				   - aByteArrayArray9525[i][i_1266_]);
		    else if (i_1278_ == 0 && i_1279_ == anInt1761 * 435863595)
			i_1281_ = (aByteArrayArray9536[i][i_1266_ + 1]
				   - aByteArrayArray9525[i][i_1266_ + 1]);
		    else if (i_1278_ == anInt1761 * 435863595
			     && i_1279_ == anInt1761 * 435863595)
			i_1281_ = (aByteArrayArray9536[i + 1][i_1266_ + 1]
				   - aByteArrayArray9525[i + 1][i_1266_ + 1]);
		    else if (i_1278_ == anInt1761 * 435863595 && i_1279_ == 0)
			i_1281_ = (aByteArrayArray9536[i + 1][i_1266_]
				   - aByteArrayArray9525[i + 1][i_1266_]);
		    else {
			int i_1282_
			    = (((aByteArrayArray9536[i][i_1266_]
				 - aByteArrayArray9525[i][i_1266_])
				* (anInt1761 * 435863595 - i_1278_))
			       + ((aByteArrayArray9536[i + 1][i_1266_]
				   - aByteArrayArray9525[i + 1][i_1266_])
				  * i_1278_));
			int i_1283_
			    = (((aByteArrayArray9536[i][i_1266_ + 1]
				 - aByteArrayArray9525[i][i_1266_ + 1])
				* (anInt1761 * 435863595 - i_1278_))
			       + ((aByteArrayArray9536[i + 1][i_1266_ + 1]
				   - aByteArrayArray9525[i + 1][i_1266_ + 1])
				  * i_1278_));
			i_1281_
			    = (i_1282_ * (anInt1761 * 435863595 - i_1279_)
			       + i_1283_ * i_1279_) >> anInt1763 * 168112006;
		    }
		    int i_1284_ = (i << anInt1763 * -2063427645) + i_1278_;
		    int i_1285_
			= (i_1266_ << anInt1763 * -2063427645) + i_1279_;
		    class134.aShortArray1601[i_1277_] = (short) i_1278_;
		    class134.aShortArray1603[i_1277_] = (short) i_1279_;
		    class134.aShortArray1607[i_1277_]
			= (short) (method2619(i_1284_, i_1285_, -267911471)
				   + (is_1267_ != null ? is_1267_[i_1277_]
				      : 0));
		    if (i_1281_ < 0)
			i_1281_ = 0;
		    if (is_1270_[i_1277_] == 0) {
			class134.anIntArray1599[i_1277_] = 0;
			if (is_1271_ != null)
			    class134.aByteArray1608[i_1277_] = (byte) i_1281_;
		    } else {
			int i_1286_ = 0;
			if (is_1269_ != null) {
			    int i_1287_ = (class134.aShortArray1604[i_1277_]
					   = (short) is_1269_[i_1277_]);
			    if (class176.anInt1879 * -734182087 != 0) {
				i_1286_ = 255 * i_1287_ / (class176.anInt1879
							   * -734182087);
				if (i_1286_ < 0)
				    i_1286_ = 0;
				else if (i_1286_ > 255)
				    i_1286_ = 255;
			    }
			}
			int i_1288_ = -16777216;
			if (is_1272_[i_1277_] != -1) {
			    TextureMetrics class166
				= (aClass182_Sub2_9513.aClass180_1944
				       .method3116
				   (is_1272_[i_1277_], -1431554601));
			    if (class166.aBool1801
				&& method15244(class166.aByte1825))
				i_1288_ = -1694498816;
			}
			class134.anIntArray1599[i_1277_]
			    = i_1288_ | (Class525_Sub31.method16523
					 (method15241(is_1270_[i_1277_] >> 8,
						      i_1281_),
					  class176.anInt1877 * 2141545647,
					  i_1286_, -1425027090));
			if (is_1271_ != null)
			    class134.aByteArray1608[i_1277_] = (byte) i_1281_;
		    }
		    class134.aShortArray1602[i_1277_]
			= (short) is_1272_[i_1277_];
		    class134.aShortArray1606[i_1277_]
			= (short) is_1273_[i_1277_];
		}
		if (is_1271_ != null) {
		    class134.anIntArray1609 = new int[class134.aShort1605];
		    for (int i_1289_ = 0; i_1289_ < class134.aShort1605;
			 i_1289_++) {
			int i_1290_ = i_1289_ * 3;
			if (is_1271_[i_1290_] != 0)
			    class134.anIntArray1609[i_1289_]
				= ~0xffffff | is_1271_[i_1290_] >> 8;
		    }
		}
		aClass134ArrayArray9519[i][i_1266_] = class134;
	    } else {
		boolean bool_1291_ = true;
		int i_1292_ = -1;
		int i_1293_ = -1;
		int i_1294_ = -1;
		int i_1295_ = -1;
		if (is.length == 6) {
		    for (int i_1296_ = 0; i_1296_ < 6; i_1296_++) {
			if (is[i_1296_] == 0 && is_1268_[i_1296_] == 0) {
			    if (i_1292_ != -1
				&& is_1270_[i_1292_] != is_1270_[i_1296_]) {
				bool_1291_ = false;
				break;
			    }
			    i_1292_ = i_1296_;
			} else if (is[i_1296_] == anInt1761 * 435863595
				   && is_1268_[i_1296_] == 0) {
			    if (i_1293_ != -1
				&& is_1270_[i_1293_] != is_1270_[i_1296_]) {
				bool_1291_ = false;
				break;
			    }
			    i_1293_ = i_1296_;
			} else if (is[i_1296_] == anInt1761 * 435863595
				   && (is_1268_[i_1296_]
				       == anInt1761 * 435863595)) {
			    if (i_1294_ != -1
				&& is_1270_[i_1294_] != is_1270_[i_1296_]) {
				bool_1291_ = false;
				break;
			    }
			    i_1294_ = i_1296_;
			} else if (is[i_1296_] == 0
				   && (is_1268_[i_1296_]
				       == anInt1761 * 435863595)) {
			    if (i_1295_ != -1
				&& is_1270_[i_1295_] != is_1270_[i_1296_]) {
				bool_1291_ = false;
				break;
			    }
			    i_1295_ = i_1296_;
			}
		    }
		    if (i_1292_ == -1 || i_1293_ == -1 || i_1294_ == -1
			|| i_1295_ == -1)
			bool_1291_ = false;
		    if (bool_1291_) {
			if (is_1267_ != null) {
			    for (int i_1297_ = 0; i_1297_ < 4; i_1297_++) {
				if (is_1267_[i_1297_] != 0) {
				    bool_1291_ = false;
				    break;
				}
			    }
			}
			if (bool_1291_) {
			    for (int i_1298_ = 1; i_1298_ < 4; i_1298_++) {
				if (is[i_1298_] != is[0]
				    && (is[i_1298_]
					!= is[0] + anInt1761 * 435863595)
				    && (is[i_1298_]
					!= is[0] - anInt1761 * 435863595)) {
				    bool_1291_ = false;
				    break;
				}
				if (is_1268_[i_1298_] != is_1268_[0]
				    && (is_1268_[i_1298_]
					!= is_1268_[0] + anInt1761 * 435863595)
				    && (is_1268_[i_1298_]
					!= (is_1268_[0]
					    - anInt1761 * 435863595))) {
				    bool_1291_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    bool_1291_ = false;
		if (bool_1291_) {
		    Class123 class123 = new Class123();
		    int i_1299_ = is_1270_[0];
		    int i_1300_ = is_1272_[0];
		    if (is_1271_ != null) {
			class123.anInt1455 = is_1271_[0] >> 8;
			if (i_1299_ == 0)
			    class123.aByte1451 |= 0x2;
		    } else if (i_1299_ == 0)
			return;
		    if ((anIntArrayArray1762[i][i_1266_]
			 == anIntArrayArray1762[i + 1][i_1266_])
			&& (anIntArrayArray1762[i][i_1266_]
			    == anIntArrayArray1762[i + 1][i_1266_ + 1])
			&& (anIntArrayArray1762[i][i_1266_]
			    == anIntArrayArray1762[i][i_1266_ + 1]))
			class123.aByte1451 |= 0x1;
		    if (i_1300_ != -1 && (class123.aByte1451 & 0x2) == 0
			&& !(aClass182_Sub2_9513.aClass180_1944.method3116
			     (i_1300_, -1431554601).aBool1819)) {
			int i_1301_;
			if (is_1269_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1301_
				= 255 * is_1269_[i_1292_] / (class176.anInt1879
							     * -734182087);
			    if (i_1301_ < 0)
				i_1301_ = 0;
			    else if (i_1301_ > 255)
				i_1301_ = 255;
			} else
			    i_1301_ = 0;
			class123.anInt1453
			    = (Class525_Sub31.method16523
			       (method15241(is_1270_[i_1292_] >> 8,
					    (aByteArrayArray9536[i][i_1266_]
					     - (aByteArrayArray9525[i]
						[i_1266_]))),
				class176.anInt1877 * 2141545647, i_1301_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1453
				|= (255 - (aByteArrayArray9536[i][i_1266_]
					   - aByteArrayArray9525[i][i_1266_])
				    << 25);
			if (is_1269_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1301_
				= 255 * is_1269_[i_1293_] / (class176.anInt1879
							     * -734182087);
			    if (i_1301_ < 0)
				i_1301_ = 0;
			    else if (i_1301_ > 255)
				i_1301_ = 255;
			} else
			    i_1301_ = 0;
			class123.anInt1446
			    = (Class525_Sub31.method16523
			       (method15241(is_1270_[i_1293_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1266_])
					     - (aByteArrayArray9525[i + 1]
						[i_1266_]))),
				class176.anInt1877 * 2141545647, i_1301_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1446
				|= 255 - (aByteArrayArray9536[i + 1][i_1266_]
					  - (aByteArrayArray9525[i + 1]
					     [i_1266_])) << 25;
			if (is_1269_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1301_
				= 255 * is_1269_[i_1294_] / (class176.anInt1879
							     * -734182087);
			    if (i_1301_ < 0)
				i_1301_ = 0;
			    else if (i_1301_ > 255)
				i_1301_ = 255;
			} else
			    i_1301_ = 0;
			class123.anInt1447
			    = (Class525_Sub31.method16523
			       (method15241(is_1270_[i_1294_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1266_ + 1])
					     - (aByteArrayArray9525[i + 1]
						[i_1266_ + 1]))),
				class176.anInt1877 * 2141545647, i_1301_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1447
				|= (255
				    - (aByteArrayArray9536[i + 1][i_1266_ + 1]
				       - (aByteArrayArray9525[i + 1]
					  [i_1266_ + 1]))) << 25;
			if (is_1269_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1301_
				= 255 * is_1269_[i_1295_] / (class176.anInt1879
							     * -734182087);
			    if (i_1301_ < 0)
				i_1301_ = 0;
			    else if (i_1301_ > 255)
				i_1301_ = 255;
			} else
			    i_1301_ = 0;
			class123.anInt1450
			    = (Class525_Sub31.method16523
			       (method15241(is_1270_[i_1295_] >> 8,
					    ((aByteArrayArray9536[i]
					      [i_1266_ + 1])
					     - (aByteArrayArray9525[i]
						[i_1266_ + 1]))),
				class176.anInt1877 * 2141545647, i_1301_,
				-1425027090));
			class123.aShort1456 = (short) i_1300_;
		    } else {
			int i_1302_;
			if (is_1269_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1302_
				= 255 * is_1269_[i_1292_] / (class176.anInt1879
							     * -734182087);
			    if (i_1302_ < 0)
				i_1302_ = 0;
			    else if (i_1302_ > 255)
				i_1302_ = 255;
			} else
			    i_1302_ = 0;
			class123.anInt1453
			    = (Class525_Sub31.method16523
			       (method15241(is_1270_[i_1292_] >> 8,
					    (aByteArrayArray9536[i][i_1266_]
					     - (aByteArrayArray9525[i]
						[i_1266_]))),
				class176.anInt1877 * 2141545647, i_1302_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1453
				|= (255 - (aByteArrayArray9536[i][i_1266_]
					   - aByteArrayArray9525[i][i_1266_])
				    << 25);
			if (is_1269_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1302_
				= 255 * is_1269_[i_1293_] / (class176.anInt1879
							     * -734182087);
			    if (i_1302_ < 0)
				i_1302_ = 0;
			    else if (i_1302_ > 255)
				i_1302_ = 255;
			} else
			    i_1302_ = 0;
			class123.anInt1446
			    = (Class525_Sub31.method16523
			       (method15241(is_1270_[i_1293_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1266_])
					     - (aByteArrayArray9525[i + 1]
						[i_1266_]))),
				class176.anInt1877 * 2141545647, i_1302_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1446
				|= 255 - (aByteArrayArray9536[i + 1][i_1266_]
					  - (aByteArrayArray9525[i + 1]
					     [i_1266_])) << 25;
			if (is_1269_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1302_
				= 255 * is_1269_[i_1294_] / (class176.anInt1879
							     * -734182087);
			    if (i_1302_ < 0)
				i_1302_ = 0;
			    else if (i_1302_ > 255)
				i_1302_ = 255;
			} else
			    i_1302_ = 0;
			class123.anInt1447
			    = (Class525_Sub31.method16523
			       (method15241(is_1270_[i_1294_] >> 8,
					    ((aByteArrayArray9536[i + 1]
					      [i_1266_ + 1])
					     - (aByteArrayArray9525[i + 1]
						[i_1266_ + 1]))),
				class176.anInt1877 * 2141545647, i_1302_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1447
				|= (255
				    - (aByteArrayArray9536[i + 1][i_1266_ + 1]
				       - (aByteArrayArray9525[i + 1]
					  [i_1266_ + 1]))) << 25;
			if (is_1269_ != null
			    && class176.anInt1879 * -734182087 != 0) {
			    i_1302_
				= 255 * is_1269_[i_1295_] / (class176.anInt1879
							     * -734182087);
			    if (i_1302_ < 0)
				i_1302_ = 0;
			    else if (i_1302_ > 255)
				i_1302_ = 255;
			} else
			    i_1302_ = 0;
			class123.anInt1450
			    = (Class525_Sub31.method16523
			       (method15241(is_1270_[i_1295_] >> 8,
					    ((aByteArrayArray9536[i]
					      [i_1266_ + 1])
					     - (aByteArrayArray9525[i]
						[i_1266_ + 1]))),
				class176.anInt1877 * 2141545647, i_1302_,
				-1425027090));
			if (class123.anInt1455 != 0)
			    class123.anInt1450
				|= 255 - (aByteArrayArray9536[i][i_1266_ + 1]
					  - (aByteArrayArray9525[i]
					     [i_1266_ + 1])) << 25;
			class123.aShort1456 = (short) -1;
		    }
		    if (is_1269_ != null) {
			class123.aShort1448 = (short) is_1269_[i_1294_];
			class123.aShort1454 = (short) is_1269_[i_1295_];
			class123.aShort1452 = (short) is_1269_[i_1293_];
			class123.aShort1449 = (short) is_1269_[i_1292_];
		    }
		    aClass123ArrayArray9517[i][i_1266_] = class123;
		} else {
		    Class127 class127 = new Class127();
		    class127.aShort1471 = (short) is.length;
		    class127.aShort1474 = (short) (is.length / 3);
		    class127.aShortArray1473 = new short[class127.aShort1471];
		    class127.aShortArray1477 = new short[class127.aShort1471];
		    class127.aShortArray1470 = new short[class127.aShort1471];
		    class127.anIntArray1475 = new int[class127.aShort1471];
		    if (is_1269_ != null)
			class127.aShortArray1476
			    = new short[class127.aShort1471];
		    for (int i_1303_ = 0; i_1303_ < class127.aShort1471;
			 i_1303_++) {
			int i_1304_ = is[i_1303_];
			int i_1305_ = is_1268_[i_1303_];
			boolean bool_1306_ = false;
			int i_1307_;
			if (i_1304_ == 0 && i_1305_ == 0)
			    i_1307_ = (aByteArrayArray9536[i][i_1266_]
				       - aByteArrayArray9525[i][i_1266_]);
			else if (i_1304_ == 0
				 && i_1305_ == anInt1761 * 435863595)
			    i_1307_ = (aByteArrayArray9536[i][i_1266_ + 1]
				       - aByteArrayArray9525[i][i_1266_ + 1]);
			else if (i_1304_ == anInt1761 * 435863595
				 && i_1305_ == anInt1761 * 435863595)
			    i_1307_
				= (aByteArrayArray9536[i + 1][i_1266_ + 1]
				   - aByteArrayArray9525[i + 1][i_1266_ + 1]);
			else if (i_1304_ == anInt1761 * 435863595
				 && i_1305_ == 0)
			    i_1307_ = (aByteArrayArray9536[i + 1][i_1266_]
				       - aByteArrayArray9525[i + 1][i_1266_]);
			else {
			    int i_1308_
				= (((aByteArrayArray9536[i][i_1266_]
				     - aByteArrayArray9525[i][i_1266_])
				    * (anInt1761 * 435863595 - i_1304_))
				   + ((aByteArrayArray9536[i + 1][i_1266_]
				       - aByteArrayArray9525[i + 1][i_1266_])
				      * i_1304_));
			    int i_1309_
				= (((aByteArrayArray9536[i][i_1266_ + 1]
				     - aByteArrayArray9525[i][i_1266_ + 1])
				    * (anInt1761 * 435863595 - i_1304_))
				   + (aByteArrayArray9536[i + 1][i_1266_ + 1]
				      - (aByteArrayArray9525[i + 1]
					 [i_1266_ + 1])) * i_1304_);
			    i_1307_
				= ((i_1308_ * (anInt1761 * 435863595 - i_1305_)
				    + i_1309_ * i_1305_)
				   >> anInt1763 * 168112006);
			}
			int i_1310_ = (i << anInt1763 * -2063427645) + i_1304_;
			int i_1311_
			    = (i_1266_ << anInt1763 * -2063427645) + i_1305_;
			class127.aShortArray1473[i_1303_] = (short) i_1304_;
			class127.aShortArray1470[i_1303_] = (short) i_1305_;
			class127.aShortArray1477[i_1303_]
			    = (short) (method2619(i_1310_, i_1311_,
						  -1813051801)
				       + (is_1267_ != null ? is_1267_[i_1303_]
					  : 0));
			if (i_1307_ < 0)
			    i_1307_ = 0;
			if (is_1270_[i_1303_] == 0) {
			    if (is_1271_ != null)
				class127.anIntArray1475[i_1303_]
				    = i_1307_ << 25;
			    else
				class127.anIntArray1475[i_1303_] = 0;
			} else {
			    int i_1312_ = 0;
			    if (is_1269_ != null) {
				int i_1313_
				    = (class127.aShortArray1476[i_1303_]
				       = (short) is_1269_[i_1303_]);
				if (class176.anInt1879 * -734182087 != 0) {
				    i_1312_
					= 255 * i_1313_ / (class176.anInt1879
							   * -734182087);
				    if (i_1312_ < 0)
					i_1312_ = 0;
				    else if (i_1312_ > 255)
					i_1312_ = 255;
				}
			    }
			    class127.anIntArray1475[i_1303_]
				= (Class525_Sub31.method16523
				   (method15241(is_1270_[i_1303_] >> 8,
						i_1307_),
				    class176.anInt1877 * 2141545647, i_1312_,
				    -1425027090));
			    if (is_1271_ != null)
				class127.anIntArray1475[i_1303_]
				    |= i_1307_ << 25;
			}
		    }
		    boolean bool_1314_ = false;
		    for (int i_1315_ = 0; i_1315_ < class127.aShort1474;
			 i_1315_++) {
			if (is_1272_[i_1315_ * 3] != -1
			    && !(aClass182_Sub2_9513.aClass180_1944.method3116
				 (is_1272_[i_1315_ * 3], -1431554601)
				 .aBool1819))
			    bool_1314_ = true;
		    }
		    if (is_1271_ != null)
			class127.anIntArray1480 = new int[class127.aShort1474];
		    if (bool_1314_) {
			class127.aShortArray1478
			    = new short[class127.aShort1474];
			class127.aShortArray1479
			    = new short[class127.aShort1474];
		    }
		    for (int i_1316_ = 0; i_1316_ < class127.aShort1474;
			 i_1316_++) {
			int i_1317_ = i_1316_ * 3;
			if (is_1271_ != null && is_1271_[i_1317_] != 0)
			    class127.anIntArray1480[i_1316_]
				= is_1271_[i_1317_] >> 8;
			if (bool_1314_) {
			    int i_1318_ = i_1317_ + 1;
			    int i_1319_ = i_1318_ + 1;
			    boolean bool_1320_ = false;
			    boolean bool_1321_ = true;
			    int i_1322_ = is_1272_[i_1317_];
			    if (i_1322_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1322_, -1431554601).aBool1819))
				bool_1321_ = false;
			    else
				bool_1320_ = true;
			    i_1322_ = is_1272_[i_1318_];
			    if (i_1322_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1322_, -1431554601).aBool1819))
				bool_1321_ = false;
			    else
				bool_1320_ = true;
			    i_1322_ = is_1272_[i_1319_];
			    if (i_1322_ == -1
				|| (aClass182_Sub2_9513.aClass180_1944
					.method3116
				    (i_1322_, -1431554601).aBool1819))
				bool_1321_ = false;
			    else
				bool_1320_ = true;
			    if (bool_1321_) {
				class127.aShortArray1478[i_1316_]
				    = (short) i_1322_;
				class127.aShortArray1479[i_1316_]
				    = (short) is_1273_[i_1317_];
			    } else {
				if (bool_1320_) {
				    i_1322_ = is_1272_[i_1317_];
				    if (i_1322_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1322_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1317_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1322_, -1431554601)
						   .aShort1834) & 0xffff,
						  1923361575)) & 0xffff]);
				    i_1322_ = is_1272_[i_1318_];
				    if (i_1322_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1322_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1318_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1322_, -1431554601)
						   .aShort1834) & 0xffff,
						  446297928)) & 0xffff]);
				    i_1322_ = is_1272_[i_1319_];
				    if (i_1322_ != -1
					&& !(aClass182_Sub2_9513
						 .aClass180_1944.method3116
					     (i_1322_, -1431554601).aBool1819))
					class127.anIntArray1475[i_1319_]
					    = (Class381.anIntArray3929
					       [(Class504.method8313
						 ((aClass182_Sub2_9513
						       .aClass180_1944
						       .method3116
						   (i_1322_, -1431554601)
						   .aShort1834) & 0xffff,
						  1225598164)) & 0xffff]);
				}
				class127.aShortArray1478[i_1316_] = (short) -1;
			    }
			}
		    }
		    aClass127ArrayArray9524[i][i_1266_] = class127;
		}
	    }
	}
    }
}
