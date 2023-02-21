/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class338
{
    static final boolean method5863(int i, int i_0_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5864(int i, int i_1_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method5865(int i, int i_2_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method5866(int i, int i_3_) {
	return (i & 0x34) != 0;
    }
    
    static final boolean method5867(int i, int i_4_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method5868(int i, int i_5_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method5869(int i, int i_6_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method5870(int i, int i_7_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method5871(int i, int i_8_) {
	return false;
    }
    
    static final boolean method5872(int i, int i_9_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method5873(int i, int i_10_) {
	return ((method5864(i, i_10_) | method5865(i, i_10_)
		 | method5866(i, i_10_))
		& method5876(i, i_10_));
    }
    
    static final boolean method5874(int i, int i_11_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method5875(int i, int i_12_) {
	return false;
    }
    
    static final boolean method5876(int i, int i_13_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5877(int i, int i_14_) {
	return method5869(i, i_14_) || method5883(i, i_14_);
    }
    
    static final boolean method5878(int i, int i_15_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5879(int i, int i_16_) {
	return method5871(i, i_16_) || method5934(i, i_16_);
    }
    
    static final boolean method5880(int i, int i_17_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5881(int i, int i_18_) {
	return ((method5864(i, i_18_) | method5865(i, i_18_)
		 | method5866(i, i_18_))
		& method5876(i, i_18_));
    }
    
    static final boolean method5882(int i, int i_19_) {
	return method5903(i, i_19_) & ((i & 0x2000) != 0 | method5868(i, i_19_)
				       | method5974(i, i_19_));
    }
    
    static final boolean method5883(int i, int i_20_) {
	if (!method5878(i, i_20_))
	    return false;
	if ((i & 0x9000) != 0 | method5869(i, i_20_) | method5957(i, i_20_))
	    return true;
	return (i_20_ & 0x37) == 0 & ((i & 0x2000) != 0 | method5868(i, i_20_)
				      | method5974(i, i_20_));
    }
    
    static final boolean method5884(int i, int i_21_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5885(int i, int i_22_) {
	return method5872(i, i_22_) & method5880(i, i_22_);
    }
    
    static final boolean method5886(int i, int i_23_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method5887(int i, int i_24_) {
	return ((i & 0x70000) != 0 || method5866(i, i_24_)
		|| method5881(i, i_24_));
    }
    
    static final boolean method5888(int i, int i_25_) {
	return ((i & 0x70000) != 0 || method5866(i, i_25_)
		|| method5881(i, i_25_));
    }
    
    static final boolean method5889(int i, int i_26_) {
	boolean bool = ((i_26_ & 0x37) != 0 ? method5882(i, i_26_)
			: method5883(i, i_26_));
	return (i & 0x10000) != 0 | method5868(i, i_26_) | bool;
    }
    
    static final boolean method5890(int i, int i_27_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method5891(int i, int i_28_) {
	return ((i & 0x40000) != 0 | method5957(i, i_28_)
		|| method5883(i, i_28_));
    }
    
    static final boolean method5892(int i, int i_29_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method5893(int i, int i_30_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method5894(int i, int i_31_) {
	return method5871(i, i_31_) || method5934(i, i_31_);
    }
    
    static final boolean method5895(int i, int i_32_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method5896(int i, int i_33_) {
	return ((i & 0x60000) != 0 | method5872(i, i_33_)
		|| method5885(i, i_33_));
    }
    
    static final boolean method5897(int i, int i_34_) {
	return (i & 0x800) != 0 | method5948(i, i_34_) || method5883(i, i_34_);
    }
    
    static final boolean method5898(int i, int i_35_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5899(int i, int i_36_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method5900(int i, int i_37_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method5901(int i, int i_38_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method5902(int i, int i_39_) {
	return (i & 0x34) != 0;
    }
    
    static final boolean method5903(int i, int i_40_) {
	return (i & 0x800) != 0 && (i_40_ & 0x37) != 0;
    }
    
    static final boolean method5904(int i, int i_41_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method5905(int i, int i_42_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method5906(int i, int i_43_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method5907(int i, int i_44_) {
	return ((i & 0x60000) != 0 | method5872(i, i_44_)
		|| method5885(i, i_44_));
    }
    
    static final boolean method5908(int i, int i_45_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method5909(int i, int i_46_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method5910(int i, int i_47_) {
	return ((i & 0x70000) != 0 || method5865(i, i_47_)
		|| method5881(i, i_47_));
    }
    
    static final boolean method5911(int i, int i_48_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method5912(int i, int i_49_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method5913(int i, int i_50_) {
	return (i & 0x100) != 0;
    }
    
    static final boolean method5914(int i, int i_51_) {
	return (i & 0x100) != 0;
    }
    
    static final boolean method5915(int i, int i_52_) {
	return (i & 0x100) != 0;
    }
    
    static final boolean method5916(int i, int i_53_) {
	return false;
    }
    
    static final boolean method5917(int i, int i_54_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method5918(int i, int i_55_) {
	return false;
    }
    
    static final boolean method5919(int i, int i_56_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method5920(int i, int i_57_) {
	return ((i & 0x70000) != 0 || method5864(i, i_57_)
		|| method5881(i, i_57_));
    }
    
    static final boolean method5921(int i, int i_58_) {
	return (i & 0x800) != 0 | method5948(i, i_58_) || method5883(i, i_58_);
    }
    
    static final boolean method5922(int i, int i_59_) {
	return (i & 0x8000) != 0;
    }
    
    Class338() throws Throwable {
	throw new Error();
    }
    
    static final boolean method5923(int i, int i_60_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5924(int i, int i_61_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method5925(int i, int i_62_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method5926(int i, int i_63_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method5927(int i, int i_64_) {
	return ((i & 0x40000) != 0 | method5957(i, i_64_)
		|| method5883(i, i_64_));
    }
    
    static final boolean method5928(int i, int i_65_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5929(int i, int i_66_) {
	return method5872(i, i_66_) & method5880(i, i_66_);
    }
    
    static final boolean method5930(int i, int i_67_) {
	return (i & 0x800) != 0 && (i_67_ & 0x37) != 0;
    }
    
    static final boolean method5931(int i, int i_68_) {
	return (i & 0x800) != 0 && (i_68_ & 0x37) != 0;
    }
    
    static final boolean method5932(int i, int i_69_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5933(int i, int i_70_) {
	return ((i & 0x40000) != 0 | method5957(i, i_70_)
		|| method5883(i, i_70_));
    }
    
    static final boolean method5934(int i, int i_71_) {
	return method5871(i, i_71_) & method5898(i, i_71_);
    }
    
    static final boolean method5935(int i, int i_72_) {
	return ((i & 0x70000) != 0 || method5865(i, i_72_)
		|| method5881(i, i_72_));
    }
    
    static final boolean method5936(int i, int i_73_) {
	return ((method5864(i, i_73_) | method5865(i, i_73_)
		 | method5866(i, i_73_))
		& method5876(i, i_73_));
    }
    
    static final boolean method5937(int i, int i_74_) {
	return method5903(i, i_74_) & ((i & 0x2000) != 0 | method5868(i, i_74_)
				       | method5974(i, i_74_));
    }
    
    static final boolean method5938(int i, int i_75_) {
	return method5903(i, i_75_) & ((i & 0x2000) != 0 | method5868(i, i_75_)
				       | method5974(i, i_75_));
    }
    
    static final boolean method5939(int i, int i_76_) {
	if (!method5878(i, i_76_))
	    return false;
	if ((i & 0x9000) != 0 | method5869(i, i_76_) | method5957(i, i_76_))
	    return true;
	return (i_76_ & 0x37) == 0 & ((i & 0x2000) != 0 | method5868(i, i_76_)
				      | method5974(i, i_76_));
    }
    
    static final boolean method5940(int i, int i_77_) {
	if (!method5878(i, i_77_))
	    return false;
	if ((i & 0x9000) != 0 | method5869(i, i_77_) | method5957(i, i_77_))
	    return true;
	return (i_77_ & 0x37) == 0 & ((i & 0x2000) != 0 | method5868(i, i_77_)
				      | method5974(i, i_77_));
    }
    
    static final boolean method5941(int i, int i_78_) {
	return method5871(i, i_78_) & method5898(i, i_78_);
    }
    
    static final boolean method5942(int i, int i_79_) {
	return method5869(i, i_79_) || method5883(i, i_79_);
    }
    
    static final boolean method5943(int i, int i_80_) {
	return method5872(i, i_80_) & method5880(i, i_80_);
    }
    
    static final boolean method5944(int i, int i_81_) {
	return ((i & 0x70000) != 0 || method5866(i, i_81_)
		|| method5881(i, i_81_));
    }
    
    static final boolean method5945(int i, int i_82_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method5946(int i, int i_83_) {
	return ((i & 0x70000) != 0 || method5865(i, i_83_)
		|| method5881(i, i_83_));
    }
    
    static final boolean method5947(int i, int i_84_) {
	return ((i & 0x70000) != 0 || method5866(i, i_84_)
		|| method5881(i, i_84_));
    }
    
    static final boolean method5948(int i, int i_85_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method5949(int i, int i_86_) {
	return ((i & 0x70000) != 0 || method5866(i, i_86_)
		|| method5881(i, i_86_));
    }
    
    static final boolean method5950(int i, int i_87_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method5951(int i, int i_88_) {
	return method5869(i, i_88_) || method5883(i, i_88_);
    }
    
    static final boolean method5952(int i, int i_89_) {
	return ((i & 0x70000) != 0 || method5866(i, i_89_)
		|| method5881(i, i_89_));
    }
    
    static final boolean method5953(int i, int i_90_) {
	boolean bool = ((i_90_ & 0x37) != 0 ? method5882(i, i_90_)
			: method5883(i, i_90_));
	return (i & 0x10000) != 0 | method5868(i, i_90_) | bool;
    }
    
    static final boolean method5954(int i, int i_91_) {
	boolean bool = ((i_91_ & 0x37) != 0 ? method5882(i, i_91_)
			: method5883(i, i_91_));
	return (i & 0x10000) != 0 | method5868(i, i_91_) | bool;
    }
    
    static final boolean method5955(int i, int i_92_) {
	return method5869(i, i_92_) || method5883(i, i_92_);
    }
    
    static final boolean method5956(int i, int i_93_) {
	return ((method5864(i, i_93_) | method5865(i, i_93_)
		 | method5866(i, i_93_))
		& method5876(i, i_93_));
    }
    
    static final boolean method5957(int i, int i_94_) {
	return (i & 0x100) != 0;
    }
    
    static final boolean method5958(int i, int i_95_) {
	return method5869(i, i_95_) || method5883(i, i_95_);
    }
    
    static final boolean method5959(int i, int i_96_) {
	return ((i & 0x40000) != 0 | method5957(i, i_96_)
		|| method5883(i, i_96_));
    }
    
    static final boolean method5960(int i, int i_97_) {
	boolean bool = ((i_97_ & 0x37) != 0 ? method5882(i, i_97_)
			: method5883(i, i_97_));
	return (i & 0x10000) != 0 | method5868(i, i_97_) | bool;
    }
    
    static final boolean method5961(int i, int i_98_) {
	return method5872(i, i_98_) & method5880(i, i_98_);
    }
    
    static final boolean method5962(int i, int i_99_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method5963(int i, int i_100_) {
	return method5871(i, i_100_) || method5934(i, i_100_);
    }
    
    static final boolean method5964(int i, int i_101_) {
	return method5871(i, i_101_) || method5934(i, i_101_);
    }
    
    static final boolean method5965(int i, int i_102_) {
	return method5871(i, i_102_) || method5934(i, i_102_);
    }
    
    static final boolean method5966(int i, int i_103_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method5967(int i, int i_104_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method5968(int i, int i_105_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method5969(int i, int i_106_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method5970(int i, int i_107_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method5971(int i, int i_108_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method5972(int i, int i_109_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method5973(int i, int i_110_) {
	return ((i & 0x800) != 0 | method5948(i, i_110_)
		|| method5883(i, i_110_));
    }
    
    static final boolean method5974(int i, int i_111_) {
	return (i & 0x10000) != 0;
    }
}
