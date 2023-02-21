/* Class161_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;
import java.util.Iterator;

public class Class161_Sub3 extends Class161
{
    Class525[] aClass525Array9842;
    Class352 aClass352_9843;
    Class182_Sub1 aClass182_Sub1_9844;
    int anInt9845;
    int anInt9846;
    int anInt9847;
    int[][][] anIntArrayArrayArray9848;
    int anInt9849;
    int anInt9850;
    short[][] aShortArrayArray9851;
    float aFloat9852 = 3.4028235E38F;
    Class709 aClass709_9853;
    Class525_Sub1[][][] aClass525_Sub1ArrayArrayArray9854;
    int[][][] anIntArrayArrayArray9855;
    int anInt9856;
    int[][][] anIntArrayArrayArray9857;
    int[][][] anIntArrayArrayArray9858;
    int[][][] anIntArrayArrayArray9859;
    int[][][] anIntArrayArrayArray9860;
    byte[][] aByteArrayArray9861;
    byte[][] aByteArrayArray9862;
    int anInt9863;
    int anInt9864;
    Interface35 anInterface35_9865;
    Interface35 anInterface35_9866;
    Class337 aClass337_9867;
    int[] anIntArray9868;
    int anInt9869;
    int anInt9870;
    float[][] aFloatArrayArray9871;
    float[][] aFloatArrayArray9872;
    float[][] aFloatArrayArray9873;
    Class10 aClass10_9874;
    Class525[] aClass525Array9875;
    static final int anInt9876 = 74;
    ByteBuffer aByteBuffer9877;
    ByteBuffer aByteBuffer9878;
    int anInt9879;
    int[] anIntArray9880;
    static final int anInt9881 = 1;
    float aFloat9882 = -3.4028235E38F;
    int[] anIntArray9883;
    
    public void method2584(Class525_Sub21 class525_sub21, int[] is) {
	aClass709_9853.method14345(new Class525_Sub3(aClass182_Sub1_9844, this,
						     class525_sub21, is),
				   (byte) 0);
    }
    
    public void method2609(int i, int i_0_, int i_1_) {
	i = Math.min(aByteArrayArray9862.length - 1, Math.max(0, i));
	i_0_ = Math.min(aByteArrayArray9862[i].length - 1, Math.max(0, i_0_));
	if ((aByteArrayArray9862[i][i_0_] & 0xff) < i_1_)
	    aByteArrayArray9862[i][i_0_] = (byte) i_1_;
    }
    
    public void method2576(int i, int i_2_, int[] is, int[] is_3_, int[] is_4_,
			   int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_,
			   int[] is_9_, Class176 class176, boolean bool) {
	Class180 class180 = aClass182_Sub1_9844.aClass180_1944;
	if (is_5_ != null && anIntArrayArrayArray9860 == null)
	    anIntArrayArrayArray9860
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	if (is_3_ != null && anIntArrayArrayArray9859 == null)
	    anIntArrayArrayArray9859
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	anIntArrayArrayArray9848[i][i_2_] = is;
	anIntArrayArrayArray9858[i][i_2_] = is_4_;
	anIntArrayArrayArray9855[i][i_2_] = is_6_;
	anIntArrayArrayArray9857[i][i_2_] = is_7_;
	if (anIntArrayArrayArray9860 != null)
	    anIntArrayArrayArray9860[i][i_2_] = is_5_;
	if (anIntArrayArrayArray9859 != null)
	    anIntArrayArrayArray9859[i][i_2_] = is_3_;
	Class525_Sub1[] class525_sub1s
	    = (aClass525_Sub1ArrayArrayArray9854[i][i_2_]
	       = new Class525_Sub1[is_6_.length]);
	for (int i_10_ = 0; i_10_ < is_6_.length; i_10_++) {
	    int i_11_ = is_8_[i_10_];
	    int i_12_ = is_9_[i_10_];
	    if ((anInt9856 & 0x20) != 0 && i_11_ != -1
		&& class180.method3116(i_11_, -1431554601).aBool1819) {
		i_12_ = 128;
		i_11_ = -1;
	    }
	    long l = ((long) (class176.anInt1883 * -2134548585) << 48
		      | (long) (class176.anInt1879 * -734182087) << 42
		      | (long) (class176.anInt1877 * 2141545647) << 28
		      | (long) (i_12_ << 14) | (long) i_11_);
	    Class525 class525;
	    for (class525 = aClass10_9874.method684(l); class525 != null;
		 class525 = aClass10_9874.method696(-2057538770)) {
		Class525_Sub1 class525_sub1 = (Class525_Sub1) class525;
		if (class525_sub1.anInt10398 == i_11_
		    && class525_sub1.aFloat10408 == (float) i_12_
		    && class525_sub1.aClass176_10400.method2902(class176,
								(short) 1023))
		    break;
	    }
	    if (class525 == null) {
		class525_sub1s[i_10_]
		    = new Class525_Sub1(this, i_11_, i_12_, class176);
		aClass10_9874.method695(class525_sub1s[i_10_], l);
	    } else
		class525_sub1s[i_10_] = (Class525_Sub1) class525;
	}
	if (bool)
	    aByteArrayArray9861[i][i_2_] |= 0x1;
	if (is_6_.length > anInt9869)
	    anInt9869 = is_6_.length;
	anInt9864 += is_6_.length;
    }
    
    public void method2590
	(int i, int i_13_, int[] is, int[] is_14_, int[] is_15_, int[] is_16_,
	 int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_,
	 int[] is_22_, int[] is_23_, Class176 class176, boolean bool) {
	int i_24_ = is_20_.length;
	int[] is_25_ = new int[i_24_ * 3];
	int[] is_26_ = new int[i_24_ * 3];
	int[] is_27_ = new int[i_24_ * 3];
	int[] is_28_ = new int[i_24_ * 3];
	int[] is_29_ = new int[i_24_ * 3];
	int[] is_30_ = new int[i_24_ * 3];
	int[] is_31_ = is_14_ != null ? new int[i_24_ * 3] : null;
	int[] is_32_ = is_16_ != null ? new int[i_24_ * 3] : null;
	int i_33_ = 0;
	for (int i_34_ = 0; i_34_ < i_24_; i_34_++) {
	    int i_35_ = is_17_[i_34_];
	    int i_36_ = is_18_[i_34_];
	    int i_37_ = is_19_[i_34_];
	    is_25_[i_33_] = is[i_35_];
	    is_26_[i_33_] = is_15_[i_35_];
	    is_27_[i_33_] = is_20_[i_34_];
	    is_29_[i_33_] = is_22_[i_34_];
	    is_30_[i_33_] = is_23_[i_34_];
	    is_28_[i_33_] = is_21_ != null ? is_21_[i_34_] : is_20_[i_34_];
	    if (is_14_ != null)
		is_31_[i_33_] = is_14_[i_35_];
	    if (is_16_ != null)
		is_32_[i_33_] = is_16_[i_35_];
	    i_33_++;
	    is_25_[i_33_] = is[i_36_];
	    is_26_[i_33_] = is_15_[i_36_];
	    is_27_[i_33_] = is_20_[i_34_];
	    is_29_[i_33_] = is_22_[i_34_];
	    is_30_[i_33_] = is_23_[i_34_];
	    is_28_[i_33_] = is_21_ != null ? is_21_[i_34_] : is_20_[i_34_];
	    if (is_14_ != null)
		is_31_[i_33_] = is_14_[i_36_];
	    if (is_16_ != null)
		is_32_[i_33_] = is_16_[i_36_];
	    i_33_++;
	    is_25_[i_33_] = is[i_37_];
	    is_26_[i_33_] = is_15_[i_37_];
	    is_27_[i_33_] = is_20_[i_34_];
	    is_29_[i_33_] = is_22_[i_34_];
	    is_30_[i_33_] = is_23_[i_34_];
	    is_28_[i_33_] = is_21_ != null ? is_21_[i_34_] : is_20_[i_34_];
	    if (is_14_ != null)
		is_31_[i_33_] = is_14_[i_37_];
	    if (is_16_ != null)
		is_32_[i_33_] = is_16_[i_37_];
	    i_33_++;
	}
	method2576(i, i_13_, is_25_, is_31_, is_26_, is_32_, is_27_, is_28_,
		   is_29_, is_30_, class176, bool);
    }
    
    public void method2594() {
	if (anInt9864 <= 0) {
	    aClass352_9843 = null;
	    method15574();
	} else {
	    byte[][] is = (new byte[anInt1759 * 363736815 + 1]
			   [anInt1760 * -1152334393 + 1]);
	    for (int i = 1; i < anInt1759 * 363736815; i++) {
		for (int i_38_ = 1; i_38_ < anInt1760 * -1152334393; i_38_++)
		    is[i][i_38_]
			= (byte) ((aByteArrayArray9862[i - 1][i_38_] >> 2)
				  + (aByteArrayArray9862[i + 1][i_38_] >> 3)
				  + (aByteArrayArray9862[i][i_38_ - 1] >> 2)
				  + (aByteArrayArray9862[i][i_38_ + 1] >> 3)
				  + (aByteArrayArray9862[i][i_38_] >> 1));
	    }
	    aClass525Array9875
		= new Class525[aClass10_9874.method687(-1502059575)];
	    aClass10_9874.method686(aClass525Array9875, -219248882);
	    for (int i = 0; i < aClass525Array9875.length; i++)
		((Class525_Sub1) aClass525Array9875[i]).method16069(anInt9864);
	    anInt9879 = 20;
	    if (anIntArrayArrayArray9860 != null)
		anInt9879 += 4;
	    if ((anInt9856 & 0x7) != 0)
		anInt9879 += 12;
	    aByteBuffer9877 = aClass182_Sub1_9844.method14871(anInt9864 * 4);
	    aByteBuffer9878
		= aClass182_Sub1_9844.method14871(anInt9864 * anInt9879);
	    Class525_Sub1[] class525_sub1s = new Class525_Sub1[anInt9864];
	    int i = Class696_Sub18.method17142(anInt9864 / 4, (byte) 113);
	    if (i < 1)
		i = 1;
	    Class10 class10 = new Class10(i);
	    Class525_Sub1[] class525_sub1s_39_ = new Class525_Sub1[anInt9869];
	    for (int i_40_ = 0; i_40_ < anInt1759 * 363736815; i_40_++) {
		for (int i_41_ = 0; i_41_ < anInt1760 * -1152334393; i_41_++)
		    method15573(i_40_, i_41_, is, class525_sub1s_39_, class10,
				class525_sub1s);
	    }
	    for (int i_42_ = 0; i_42_ < anInt9849; i_42_++) {
		Class525_Sub1 class525_sub1 = class525_sub1s[i_42_];
		if (class525_sub1 != null)
		    class525_sub1.method16058(i_42_);
	    }
	    for (int i_43_ = 0; i_43_ < anInt1759 * 363736815; i_43_++) {
		for (int i_44_ = 0; i_44_ < anInt1760 * -1152334393; i_44_++) {
		    short[] is_45_
			= (aShortArrayArray9851
			   [i_44_ * (anInt1759 * 363736815) + i_43_]);
		    if (is_45_ != null) {
			int i_46_ = 0;
			int i_47_ = 0;
			while (i_47_ < is_45_.length) {
			    int i_48_ = is_45_[i_47_++] & 0xffff;
			    int i_49_ = is_45_[i_47_++] & 0xffff;
			    int i_50_ = is_45_[i_47_++] & 0xffff;
			    Class525_Sub1 class525_sub1
				= class525_sub1s[i_48_];
			    Class525_Sub1 class525_sub1_51_
				= class525_sub1s[i_49_];
			    Class525_Sub1 class525_sub1_52_
				= class525_sub1s[i_50_];
			    Class525_Sub1 class525_sub1_53_ = null;
			    if (class525_sub1 != null) {
				class525_sub1.method16057(i_43_, i_44_, i_46_);
				class525_sub1_53_ = class525_sub1;
			    }
			    if (class525_sub1_51_ != null) {
				class525_sub1_51_.method16057(i_43_, i_44_,
							      i_46_);
				if (class525_sub1_53_ == null
				    || ((class525_sub1_51_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub1_53_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub1_53_ = class525_sub1_51_;
			    }
			    if (class525_sub1_52_ != null) {
				class525_sub1_52_.method16057(i_43_, i_44_,
							      i_46_);
				if (class525_sub1_53_ == null
				    || ((class525_sub1_52_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub1_53_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub1_53_ = class525_sub1_52_;
			    }
			    if (class525_sub1_53_ != null) {
				if (class525_sub1 != null)
				    class525_sub1_53_.method16058(i_48_);
				if (class525_sub1_51_ != null)
				    class525_sub1_53_.method16058(i_49_);
				if (class525_sub1_52_ != null)
				    class525_sub1_53_.method16058(i_50_);
				class525_sub1_53_.method16057(i_43_, i_44_,
							      i_46_);
			    }
			    i_46_++;
			}
		    }
		}
	    }
	    anInt9863 = 0;
	    for (int i_54_ = 0; i_54_ < aClass525Array9875.length; i_54_++) {
		Class525_Sub1 class525_sub1
		    = (Class525_Sub1) aClass525Array9875[i_54_];
		if (class525_sub1.anInt10399 > 0)
		    aClass525Array9875[anInt9863++] = class525_sub1;
	    }
	    aClass525Array9842 = new Class525[anInt9863];
	    long[] ls = new long[anInt9863];
	    for (int i_55_ = 0; i_55_ < anInt9863; i_55_++) {
		Class525_Sub1 class525_sub1
		    = (Class525_Sub1) aClass525Array9875[i_55_];
		ls[i_55_] = class525_sub1.aLong7113 * -5126207504388691097L;
		aClass525Array9842[i_55_] = class525_sub1;
	    }
	    Class305.method5424(ls, aClass525Array9842, -1172138846);
	    method15576();
	}
    }
    
    public void method2608(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_56_, int i_57_, int i_58_, boolean bool) {
	if (aClass352_9843 != null && class525_sub16_sub17 != null) {
	    int i_59_ = (i - (i_56_ * aClass182_Sub1_9844.anInt9244 >> 8)
			 >> aClass182_Sub1_9844.anInt9243);
	    int i_60_ = (i_57_ - (i_56_ * aClass182_Sub1_9844.anInt9245 >> 8)
			 >> aClass182_Sub1_9844.anInt9243);
	    aClass352_9843.method6177(class525_sub16_sub17, i_59_, i_60_);
	}
    }
    
    void method15572(Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2,
		     int i, int i_61_) {
	int[] is = anIntArrayArrayArray9848[i][i_61_];
	int[] is_62_ = anIntArrayArrayArray9858[i][i_61_];
	int i_63_ = is.length;
	if (anIntArray9880.length < i_63_) {
	    anIntArray9880 = new int[i_63_];
	    anIntArray9883 = new int[i_63_];
	}
	for (int i_64_ = 0; i_64_ < i_63_; i_64_++) {
	    anIntArray9880[i_64_] = is[i_64_] >> aClass182_Sub1_9844.anInt9243;
	    anIntArray9883[i_64_]
		= is_62_[i_64_] >> aClass182_Sub1_9844.anInt9243;
	}
	int i_65_ = 0;
	while (i_65_ < i_63_) {
	    int i_66_ = anIntArray9880[i_65_];
	    int i_67_ = anIntArray9883[i_65_++];
	    int i_68_ = anIntArray9880[i_65_];
	    int i_69_ = anIntArray9883[i_65_++];
	    int i_70_ = anIntArray9880[i_65_];
	    int i_71_ = anIntArray9883[i_65_++];
	    if ((i_66_ - i_68_) * (i_69_ - i_71_) - (i_69_ - i_67_) * (i_70_
								       - i_68_)
		> 0)
		class525_sub16_sub17_sub2.method18890(i_67_, i_69_, i_71_,
						      i_66_, i_68_, i_70_);
	}
    }
    
    void method15573(int i, int i_72_, byte[][] is,
		     Class525_Sub1[] class525_sub1s, Class10 class10,
		     Class525_Sub1[] class525_sub1s_73_) {
	if (anIntArrayArrayArray9855[i][i_72_] != null) {
	    Class525_Sub1[] class525_sub1s_74_
		= aClass525_Sub1ArrayArrayArray9854[i][i_72_];
	    int[] is_75_ = anIntArrayArrayArray9848[i][i_72_];
	    int[] is_76_ = anIntArrayArrayArray9858[i][i_72_];
	    int[] is_77_ = anIntArrayArrayArray9857[i][i_72_];
	    int[] is_78_ = anIntArrayArrayArray9855[i][i_72_];
	    int[] is_79_ = (anIntArrayArrayArray9859 != null
			    ? anIntArrayArrayArray9859[i][i_72_] : null);
	    int[] is_80_ = (anIntArrayArrayArray9860 != null
			    ? anIntArrayArrayArray9860[i][i_72_] : null);
	    if (is_77_ == null)
		is_77_ = is_78_;
	    float f = aFloatArrayArray9871[i][i_72_];
	    float f_81_ = aFloatArrayArray9872[i][i_72_];
	    float f_82_ = aFloatArrayArray9873[i][i_72_];
	    float f_83_ = aFloatArrayArray9871[i][i_72_ + 1];
	    float f_84_ = aFloatArrayArray9872[i][i_72_ + 1];
	    float f_85_ = aFloatArrayArray9873[i][i_72_ + 1];
	    float f_86_ = aFloatArrayArray9871[i + 1][i_72_ + 1];
	    float f_87_ = aFloatArrayArray9872[i + 1][i_72_ + 1];
	    float f_88_ = aFloatArrayArray9873[i + 1][i_72_ + 1];
	    float f_89_ = aFloatArrayArray9871[i + 1][i_72_];
	    float f_90_ = aFloatArrayArray9872[i + 1][i_72_];
	    float f_91_ = aFloatArrayArray9873[i + 1][i_72_];
	    int i_92_ = is[i][i_72_] & 0xff;
	    int i_93_ = is[i][i_72_ + 1] & 0xff;
	    int i_94_ = is[i + 1][i_72_ + 1] & 0xff;
	    int i_95_ = is[i + 1][i_72_] & 0xff;
	    int i_96_ = 0;
	while_44_:
	    for (int i_97_ = 0; i_97_ < is_78_.length; i_97_++) {
		Class525_Sub1 class525_sub1 = class525_sub1s_74_[i_97_];
		for (int i_98_ = 0; i_98_ < i_96_; i_98_++) {
		    if (class525_sub1s[i_98_] == class525_sub1)
			continue while_44_;
		}
		class525_sub1s[i_96_++] = class525_sub1;
	    }
	    short[] is_99_
		= (aShortArrayArray9851[i_72_ * (anInt1759 * 363736815) + i]
		   = new short[is_78_.length]);
	    for (int i_100_ = 0; i_100_ < is_78_.length; i_100_++) {
		int i_101_ = (i << anInt1763 * -2063427645) + is_75_[i_100_];
		int i_102_
		    = (i_72_ << anInt1763 * -2063427645) + is_76_[i_100_];
		int i_103_ = i_101_ >> anInt9845;
		int i_104_ = i_102_ >> anInt9845;
		int i_105_ = is_78_[i_100_];
		int i_106_ = is_77_[i_100_];
		int i_107_ = is_79_ != null ? is_79_[i_100_] : 0;
		long l = ((long) i_106_ << 48 | (long) i_105_ << 32
			  | (long) (i_103_ << 16) | (long) i_104_);
		int i_108_ = is_75_[i_100_];
		int i_109_ = is_76_[i_100_];
		int i_110_ = 74;
		int i_111_ = 0;
		float f_112_ = 1.0F;
		float f_113_;
		float f_114_;
		float f_115_;
		if (i_108_ == 0 && i_109_ == 0) {
		    f_113_ = f;
		    f_114_ = f_81_;
		    f_115_ = f_82_;
		    i_110_ -= i_92_;
		} else if (i_108_ == 0 && i_109_ == anInt1761 * 435863595) {
		    f_113_ = f_83_;
		    f_114_ = f_84_;
		    f_115_ = f_85_;
		    i_110_ -= i_93_;
		} else if (i_108_ == anInt1761 * 435863595
			   && i_109_ == anInt1761 * 435863595) {
		    f_113_ = f_86_;
		    f_114_ = f_87_;
		    f_115_ = f_88_;
		    i_110_ -= i_94_;
		} else if (i_108_ == anInt1761 * 435863595 && i_109_ == 0) {
		    f_113_ = f_89_;
		    f_114_ = f_90_;
		    f_115_ = f_91_;
		    i_110_ -= i_95_;
		} else {
		    float f_116_
			= (float) i_108_ / (float) (anInt1761 * 435863595);
		    float f_117_
			= (float) i_109_ / (float) (anInt1761 * 435863595);
		    float f_118_ = f + (f_89_ - f) * f_116_;
		    float f_119_ = f_81_ + (f_90_ - f_81_) * f_116_;
		    float f_120_ = f_82_ + (f_91_ - f_82_) * f_116_;
		    float f_121_ = f_83_ + (f_86_ - f_83_) * f_116_;
		    float f_122_ = f_84_ + (f_87_ - f_84_) * f_116_;
		    float f_123_ = f_85_ + (f_88_ - f_85_) * f_116_;
		    f_113_ = f_118_ + (f_121_ - f_118_) * f_117_;
		    f_114_ = f_119_ + (f_122_ - f_119_) * f_117_;
		    f_115_ = f_120_ + (f_123_ - f_120_) * f_117_;
		    int i_124_ = i_92_ + ((i_95_ - i_92_) * i_108_
					  >> anInt1763 * -2063427645);
		    int i_125_ = i_93_ + ((i_94_ - i_93_) * i_108_
					  >> anInt1763 * -2063427645);
		    i_110_ -= i_124_ + ((i_125_ - i_124_) * i_109_
					>> anInt1763 * -2063427645);
		}
		if (i_105_ != -1) {
		    int i_126_ = (i_105_ & 0x7f) * i_110_ >> 7;
		    if (i_126_ < 2)
			i_126_ = 2;
		    else if (i_126_ > 126)
			i_126_ = 126;
		    i_111_ = Class639.anIntArray8319[i_105_ & 0xff80 | i_126_];
		    if ((anInt9856 & 0x7) == 0) {
			f_112_
			    = (aClass182_Sub1_9844.aFloatArray9228[0] * f_113_
			       + (aClass182_Sub1_9844.aFloatArray9228[1]
				  * f_114_)
			       + (aClass182_Sub1_9844.aFloatArray9228[2]
				  * f_115_));
			f_112_
			    = (aClass182_Sub1_9844.aFloat9169
			       + f_112_ * (f_112_ > 0.0F
					   ? aClass182_Sub1_9844.aFloat9152
					   : aClass182_Sub1_9844.aFloat9238));
		    }
		}
		Class525 class525 = null;
		if ((i_101_ & anInt9846 - 1) == 0
		    && (i_102_ & anInt9846 - 1) == 0)
		    class525 = class10.method684(l);
		int i_127_;
		if (class525 == null) {
		    int i_128_;
		    if (i_106_ != i_105_) {
			int i_129_ = (i_106_ & 0x7f) * i_110_ >> 7;
			if (i_129_ < 2)
			    i_129_ = 2;
			else if (i_129_ > 126)
			    i_129_ = 126;
			i_128_ = (Class639.anIntArray8319
				  [i_106_ & 0xff80 | i_129_]);
			if ((anInt9856 & 0x7) == 0) {
			    float f_130_
				= ((aClass182_Sub1_9844.aFloatArray9228[0]
				    * f_113_)
				   + (aClass182_Sub1_9844.aFloatArray9228[1]
				      * f_114_)
				   + (aClass182_Sub1_9844.aFloatArray9228[2]
				      * f_115_));
			    f_130_
				= (aClass182_Sub1_9844.aFloat9169
				   + (f_112_
				      * (f_112_ > 0.0F
					 ? aClass182_Sub1_9844.aFloat9152
					 : aClass182_Sub1_9844.aFloat9238)));
			    int i_131_ = i_128_ >> 16 & 0xff;
			    int i_132_ = i_128_ >> 8 & 0xff;
			    int i_133_ = i_128_ & 0xff;
			    i_131_ *= f_130_;
			    if (i_131_ < 0)
				i_131_ = 0;
			    else if (i_131_ > 255)
				i_131_ = 255;
			    i_132_ *= f_130_;
			    if (i_132_ < 0)
				i_132_ = 0;
			    else if (i_132_ > 255)
				i_132_ = 255;
			    i_133_ *= f_130_;
			    if (i_133_ < 0)
				i_133_ = 0;
			    else if (i_133_ > 255)
				i_133_ = 255;
			    i_128_ = i_131_ << 16 | i_132_ << 8 | i_133_;
			}
		    } else
			i_128_ = i_111_;
		    aByteBuffer9878.putFloat((float) i_101_);
		    aByteBuffer9878.putFloat((float) (method2619(i_101_,
								 i_102_,
								 -2112476196)
						      + i_107_));
		    aByteBuffer9878.putFloat((float) i_102_);
		    aByteBuffer9878.putFloat((float) i_101_);
		    aByteBuffer9878.putFloat((float) i_102_);
		    if (anIntArrayArrayArray9860 != null)
			aByteBuffer9878.putFloat(is_80_ != null
						 ? (float) (is_80_[i_100_] - 1)
						 : 0.0F);
		    if ((anInt9856 & 0x7) != 0) {
			aByteBuffer9878.putFloat(f_113_);
			aByteBuffer9878.putFloat(f_114_);
			aByteBuffer9878.putFloat(f_115_);
		    }
		    if (aClass182_Sub1_9844.anInt9212 == 0) {
			int i_134_ = i_128_ & ~0xff00ff;
			i_134_ |= (i_128_ & 0xff0000) >> 16;
			i_134_ |= (i_128_ & 0xff) << 16;
			i_128_ = i_134_;
		    }
		    aByteBuffer9877.putInt(~0xffffff | i_128_);
		    i_127_ = anInt9849++;
		    is_99_[i_100_] = (short) i_127_;
		    if (i_105_ != -1)
			class525_sub1s_73_[i_127_]
			    = class525_sub1s_74_[i_100_];
		    class10.method695(new Class525_Sub20(is_99_[i_100_]), l);
		} else {
		    is_99_[i_100_] = ((Class525_Sub20) class525).aShort10573;
		    i_127_ = is_99_[i_100_] & 0xffff;
		    if (i_105_ != -1
			&& ((class525_sub1s_74_[i_100_].aLong7113
			     * -5126207504388691097L)
			    < (class525_sub1s_73_[i_127_].aLong7113
			       * -5126207504388691097L)))
			class525_sub1s_73_[i_127_]
			    = class525_sub1s_74_[i_100_];
		}
		for (int i_135_ = 0; i_135_ < i_96_; i_135_++)
		    class525_sub1s[i_135_].method16059(i_127_, i_111_, i_110_,
						       f_112_);
		anInt9850++;
	    }
	}
    }
    
    public void method2579(int i, int i_136_, int i_137_, boolean[][] bools,
			   boolean bool, int i_138_) {
	if (aClass525Array9842 != null) {
	    int i_139_ = i_137_ + i_137_ + 1;
	    i_139_ *= i_139_;
	    if (anIntArray9868.length < i_139_)
		anIntArray9868 = new int[i_139_];
	    int i_140_ = i - i_137_;
	    int i_141_ = i_140_;
	    if (i_140_ < 0)
		i_140_ = 0;
	    int i_142_ = i_136_ - i_137_;
	    int i_143_ = i_142_;
	    if (i_142_ < 0)
		i_142_ = 0;
	    int i_144_ = i + i_137_;
	    if (i_144_ > anInt1759 * 363736815 - 1)
		i_144_ = anInt1759 * 363736815 - 1;
	    int i_145_ = i_136_ + i_137_;
	    if (i_145_ > anInt1760 * -1152334393 - 1)
		i_145_ = anInt1760 * -1152334393 - 1;
	    anInt9870 = 0;
	    for (int i_146_ = i_140_; i_146_ <= i_144_; i_146_++) {
		boolean[] bools_147_ = bools[i_146_ - i_141_];
		for (int i_148_ = i_142_; i_148_ <= i_145_; i_148_++) {
		    if (bools_147_[i_148_ - i_143_])
			anIntArray9868[anInt9870++]
			    = i_148_ * (anInt1759 * 363736815) + i_146_;
		}
	    }
	    ByteBuffer bytebuffer = aClass182_Sub1_9844.aByteBuffer9271;
	    bytebuffer.clear();
	    for (int i_149_ = 0; i_149_ < aClass525Array9842.length;
		 i_149_++) {
		Class525_Sub1 class525_sub1
		    = (Class525_Sub1) aClass525Array9842[i_149_];
		class525_sub1.method16061(anIntArray9868, anInt9870);
	    }
	    int i_150_ = bytebuffer.position();
	    Class319 class319 = aClass182_Sub1_9844.aClass319_9196;
	    aClass182_Sub1_9844.method14775();
	    if (aClass182_Sub1_9844.anInt9283 > 0) {
		class319.aClass446_3508.method7265
		    (((float) (aClass182_Sub1_9844.anInt9282 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9844.anInt9282 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9844.anInt9282 >> 0 & 0xff)
		      / 255.0F));
		class319.aClass437_3520.method7073(0.0F, 0.0F, 1.0F,
						   -(aClass182_Sub1_9844
						     .aFloat9207));
		class319.aClass437_3520
		    .method7079(aClass182_Sub1_9844.aClass435_9240);
		class319.aClass437_3520.method7078
		    (1.0F / (aClass182_Sub1_9844.aFloat9218
			     - aClass182_Sub1_9844.aFloat9207));
	    } else {
		class319.aClass437_3520.method7073(0.0F, 0.0F, 0.0F, 0.0F);
		class319.aClass446_3508.method7265(0.0F, 0.0F, 0.0F);
	    }
	    if (i_150_ != 0) {
		Interface44 interface44
		    = aClass182_Sub1_9844.method14682(i_150_ / 2);
		interface44.method215(0, i_150_,
				      aClass182_Sub1_9844.aLong9160);
		aClass182_Sub1_9844.method14764(0, anInterface35_9865);
		aClass182_Sub1_9844.method14765(interface44);
		class319.method5677(Class435.aClass435_4829);
		if ((anInt9856 & 0x7) == 0) {
		    int i_151_ = 0;
		    for (int i_152_ = 0; i_152_ < aClass525Array9842.length;
			 i_152_++) {
			Class525_Sub1 class525_sub1
			    = (Class525_Sub1) aClass525Array9842[i_152_];
			if (class525_sub1.anInt10397 != 0) {
			    if (aClass182_Sub1_9844.aBool9158) {
				aClass182_Sub1_9844.method3262
				    (0, class525_sub1.aClass176_10400);
				class319.aClass437_3518.method7073
				    (0.0F, 1.0F, 0.0F,
				     ((float) aClass182_Sub1_9844.anInt9278
				      + ((float) ((class525_sub1
						   .aClass176_10400.anInt1883)
						  * -2134548585)
					 / 255.0F
					 * (float) ((class525_sub1
						     .aClass176_10400
						     .anInt1879)
						    * -734182087))));
				class319.aClass437_3518.method7078
				    (1.0F / (float) ((class525_sub1
						      .aClass176_10400
						      .anInt1879)
						     * -734182087));
				class319.aClass446_3519.method7265
				    ((float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class319.aClass437_3518.method7073(0.0F, 0.0F,
								   0.0F, 0.0F);
				class319.aClass446_3519.method7265(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_153_ = false;
			    if (class525_sub1.anInt10398 != -1) {
				Class166 class166
				    = (aClass182_Sub1_9844.aClass180_1944
					   .method3116
				       (class525_sub1.anInt10398,
					-1431554601));
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.aClass351_9253
					  .method6159(class166);
				bool_153_
				    = !Class679.method11200(class166.aByte1825,
							    (byte) -12);
			    } else
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.anInterface38_9168;
			    aClass182_Sub1_9844.method14764
				(1, class525_sub1.anInterface35_10401);
			    aClass182_Sub1_9844.method14763(aClass337_9867);
			    class319.aClass435_3529.method6954
				(1.0F / class525_sub1.aFloat10408,
				 1.0F / class525_sub1.aFloat10408, 1.0F, 1.0F);
			    class319.anInt3527 = class525_sub1.anInt10405;
			    class319.anInt3528
				= (class525_sub1.anInt10406
				   - class525_sub1.anInt10405 + 1);
			    class319.anInt3526 = i_151_;
			    class319.anInt3530 = class525_sub1.anInt10397 / 3;
			    class319.method5696(bool_153_);
			    i_151_ += class525_sub1.anInt10397;
			}
		    }
		} else {
		    class319.aClass446_3521.method7265
			(aClass182_Sub1_9844.aFloatArray9228[0],
			 aClass182_Sub1_9844.aFloatArray9228[1],
			 aClass182_Sub1_9844.aFloatArray9228[2]);
		    class319.aClass446_3523.method7265
			((aClass182_Sub1_9844.aFloat9152
			  * aClass182_Sub1_9844.aFloat9233),
			 (aClass182_Sub1_9844.aFloat9152
			  * aClass182_Sub1_9844.aFloat9299),
			 (aClass182_Sub1_9844.aFloat9152
			  * aClass182_Sub1_9844.aFloat9235));
		    class319.aClass446_3524.method7265
			((-aClass182_Sub1_9844.aFloat9238
			  * aClass182_Sub1_9844.aFloat9233),
			 (-aClass182_Sub1_9844.aFloat9238
			  * aClass182_Sub1_9844.aFloat9299),
			 (-aClass182_Sub1_9844.aFloat9238
			  * aClass182_Sub1_9844.aFloat9235));
		    class319.aClass446_3517.method7265
			((aClass182_Sub1_9844.aFloat9169
			  * aClass182_Sub1_9844.aFloat9233),
			 (aClass182_Sub1_9844.aFloat9169
			  * aClass182_Sub1_9844.aFloat9299),
			 (aClass182_Sub1_9844.aFloat9169
			  * aClass182_Sub1_9844.aFloat9235));
		    int i_154_ = 0;
		    for (int i_155_ = 0; i_155_ < aClass525Array9842.length;
			 i_155_++) {
			Class525_Sub1 class525_sub1
			    = (Class525_Sub1) aClass525Array9842[i_155_];
			if (class525_sub1.anInt10397 > 0) {
			    if (aClass182_Sub1_9844.aBool9158) {
				aClass182_Sub1_9844.method3262
				    (0, class525_sub1.aClass176_10400);
				float f = 0.15F;
				class319.aClass437_3518.method7073
				    (0.0F,
				     1.0F / ((float) ((class525_sub1
						       .aClass176_10400
						       .anInt1879)
						      * -734182087)
					     * f),
				     0.0F,
				     256.0F / ((float) ((class525_sub1
							 .aClass176_10400
							 .anInt1879)
							* -734182087)
					       * f));
				class319.aClass446_3519.method7265
				    ((float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class319.aClass437_3518.method7073(0.0F, 0.0F,
								   0.0F, 0.0F);
				class319.aClass446_3519.method7265(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_156_ = 11;
			    if (class525_sub1.anInt10398 != -1) {
				Class166 class166
				    = (aClass182_Sub1_9844.aClass180_1944
					   .method3116
				       (class525_sub1.anInt10398,
					-1431554601));
				i_156_ = class166.aByte1825;
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.aClass351_9253
					  .method6159(class166);
				class319.method5676(class166.aByte1826);
			    } else
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.anInterface38_9168;
			    aClass182_Sub1_9844.method14764
				(1, class525_sub1.anInterface35_10401);
			    aClass182_Sub1_9844.method14763(aClass337_9867);
			    class319.aClass435_3529.method6954
				(1.0F / class525_sub1.aFloat10408,
				 1.0F / class525_sub1.aFloat10408, 1.0F, 1.0F);
			    class319.anInt3527 = class525_sub1.anInt10405;
			    class319.anInt3528
				= (class525_sub1.anInt10406
				   - class525_sub1.anInt10405 + 1);
			    class319.anInt3526 = i_154_;
			    class319.anInt3530 = class525_sub1.anInt10397 / 3;
			    switch (i_156_) {
			    case 6:
				class319.method5696
				    (!Class679.method11200(i_156_,
							   (byte) -91));
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!aClass182_Sub1_9844.aBool9156
				    && (anInt9856 & 0x8) != 0
				    && aClass182_Sub1_9844
					   .aClass346_Sub1_Sub2_9267
					   .method18186(231481007)) {
				    Class346_Sub1_Sub2 class346_sub1_sub2
					= (aClass182_Sub1_9844
					   .aClass346_Sub1_Sub2_9267);
				    if (i_156_ == 2)
					class346_sub1_sub2
					    = (aClass182_Sub1_9844
					       .aClass346_Sub1_Sub2_9266);
				    class346_sub1_sub2.aClass435_11587
					.method6947
					(aClass182_Sub1_9844.aClass435_9195);
				    class346_sub1_sub2.aClass435_11590
					.method6954
					(1.0F / (class525_sub1.aFloat10408
						 * (float) ((class525_sub1
							     .aClass176_10400
							     .anInt1881)
							    * 493658157)),
					 1.0F / (class525_sub1.aFloat10408
						 * (float) ((class525_sub1
							     .aClass176_10400
							     .anInt1881)
							    * 493658157)),
					 1.0F, 1.0F);
				    class346_sub1_sub2.aClass446_11608
					.method7265
					((aClass182_Sub1_9844.aClass435_9216
					  .aFloatArray4830[12]),
					 (aClass182_Sub1_9844.aClass435_9216
					  .aFloatArray4830[13]),
					 (aClass182_Sub1_9844.aClass435_9216
					  .aFloatArray4830[14]));
				    Class166 class166
					= (aClass182_Sub1_9844
					       .aClass180_1944.method3116
					   (class525_sub1.anInt10398,
					    -1431554601));
				    class346_sub1_sub2.anInt11598
					= class166.aByte1826 * 608833997;
				    class346_sub1_sub2.anInt11607
					= class525_sub1.anInt10405 * 156523609;
				    class346_sub1_sub2.anInt11609
					= ((class525_sub1.anInt10406
					    - class525_sub1.anInt10405 + 1)
					   * 724533963);
				    class346_sub1_sub2.anInt11597
					= i_154_ * -46052045;
				    class346_sub1_sub2.anInt11610
					= (class525_sub1.anInt10397 / 3
					   * -1860961719);
				    class346_sub1_sub2.aClass437_11586
					.method7074(class319.aClass437_3518);
				    class346_sub1_sub2.aClass446_11582
					.method7216(class319.aClass446_3519);
				    class346_sub1_sub2.aClass437_11600
					.method7074(class319.aClass437_3520);
				    class346_sub1_sub2.aClass446_11606
					.method7216(class319.aClass446_3508);
				    class346_sub1_sub2.method18187(2013418636);
				} else
				    class319.method5679(0);
				break;
			    case 1:
				class319.aClass446_3515.method7265
				    ((aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[12]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[13]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[14]));
				if (aClass182_Sub1_9844.aBool9158)
				    class319.method5683();
				else
				    class319.method5680(0);
				break;
			    default:
				if (aClass182_Sub1_9844.aBool9158)
				    class319.method5682();
				else
				    class319.method5679(0);
				break;
			    case 7:
				class319.aClass446_3515.method7265
				    ((aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[12]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[13]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[14]));
				class319.aClass435_3525.method7023();
				class319.anInterface40_3513
				    = aClass182_Sub1_9844.method14777();
				class319.method5681(0);
			    }
			    i_154_ += class525_sub1.anInt10397;
			}
		    }
		}
	    }
	    if (!aClass709_9853.method14363(916264001)) {
		aClass182_Sub1_9844.method14779(128);
		aClass182_Sub1_9844.method14710(false);
		Class446 class446 = new Class446(class319.aClass446_3508);
		class319.aClass446_3508.method7265(0.0F, 0.0F, 0.0F);
		Iterator iterator = aClass709_9853.iterator();
		while (iterator.hasNext()) {
		    Class525_Sub3 class525_sub3
			= (Class525_Sub3) iterator.next();
		    class525_sub3.method16094(class319, i, i_136_, i_137_,
					      bools, bool);
		}
		class319.aClass446_3508.method7216(class446);
	    }
	    if (aClass352_9843 != null) {
		aClass182_Sub1_9844.method14779(1);
		aClass182_Sub1_9844.method14764(0, anInterface35_9865);
		aClass182_Sub1_9844.method14764(1, anInterface35_9866);
		aClass182_Sub1_9844.method14763(aClass337_9867);
		Class435 class435 = aClass182_Sub1_9844.aClass435_9180;
		class435.method7023();
		class435.aFloatArray4830[13] = -1.0F;
		class319.method5677(class435);
		aClass352_9843.method6175(class319, i, i_136_, i_137_, bools,
					  bool);
	    }
	}
    }
    
    public void method2625(Class525_Sub21 class525_sub21, int[] is) {
	aClass709_9853.method14345(new Class525_Sub3(aClass182_Sub1_9844, this,
						     class525_sub21, is),
				   (byte) 0);
    }
    
    public void method2616(int i, int i_157_, int[] is, int[] is_158_,
			   int[] is_159_, int[] is_160_, int[] is_161_,
			   int[] is_162_, int[] is_163_, int[] is_164_,
			   Class176 class176, boolean bool) {
	Class180 class180 = aClass182_Sub1_9844.aClass180_1944;
	if (is_160_ != null && anIntArrayArrayArray9860 == null)
	    anIntArrayArrayArray9860
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	if (is_158_ != null && anIntArrayArrayArray9859 == null)
	    anIntArrayArrayArray9859
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	anIntArrayArrayArray9848[i][i_157_] = is;
	anIntArrayArrayArray9858[i][i_157_] = is_159_;
	anIntArrayArrayArray9855[i][i_157_] = is_161_;
	anIntArrayArrayArray9857[i][i_157_] = is_162_;
	if (anIntArrayArrayArray9860 != null)
	    anIntArrayArrayArray9860[i][i_157_] = is_160_;
	if (anIntArrayArrayArray9859 != null)
	    anIntArrayArrayArray9859[i][i_157_] = is_158_;
	Class525_Sub1[] class525_sub1s
	    = (aClass525_Sub1ArrayArrayArray9854[i][i_157_]
	       = new Class525_Sub1[is_161_.length]);
	for (int i_165_ = 0; i_165_ < is_161_.length; i_165_++) {
	    int i_166_ = is_163_[i_165_];
	    int i_167_ = is_164_[i_165_];
	    if ((anInt9856 & 0x20) != 0 && i_166_ != -1
		&& class180.method3116(i_166_, -1431554601).aBool1819) {
		i_167_ = 128;
		i_166_ = -1;
	    }
	    long l = ((long) (class176.anInt1883 * -2134548585) << 48
		      | (long) (class176.anInt1879 * -734182087) << 42
		      | (long) (class176.anInt1877 * 2141545647) << 28
		      | (long) (i_167_ << 14) | (long) i_166_);
	    Class525 class525;
	    for (class525 = aClass10_9874.method684(l); class525 != null;
		 class525 = aClass10_9874.method696(-2057538770)) {
		Class525_Sub1 class525_sub1 = (Class525_Sub1) class525;
		if (class525_sub1.anInt10398 == i_166_
		    && class525_sub1.aFloat10408 == (float) i_167_
		    && class525_sub1.aClass176_10400.method2902(class176,
								(short) 1023))
		    break;
	    }
	    if (class525 == null) {
		class525_sub1s[i_165_]
		    = new Class525_Sub1(this, i_166_, i_167_, class176);
		aClass10_9874.method695(class525_sub1s[i_165_], l);
	    } else
		class525_sub1s[i_165_] = (Class525_Sub1) class525;
	}
	if (bool)
	    aByteArrayArray9861[i][i_157_] |= 0x1;
	if (is_161_.length > anInt9869)
	    anInt9869 = is_161_.length;
	anInt9864 += is_161_.length;
    }
    
    public void method2578() {
	if (anInt9864 <= 0) {
	    aClass352_9843 = null;
	    method15574();
	} else {
	    byte[][] is = (new byte[anInt1759 * 363736815 + 1]
			   [anInt1760 * -1152334393 + 1]);
	    for (int i = 1; i < anInt1759 * 363736815; i++) {
		for (int i_168_ = 1; i_168_ < anInt1760 * -1152334393;
		     i_168_++)
		    is[i][i_168_]
			= (byte) ((aByteArrayArray9862[i - 1][i_168_] >> 2)
				  + (aByteArrayArray9862[i + 1][i_168_] >> 3)
				  + (aByteArrayArray9862[i][i_168_ - 1] >> 2)
				  + (aByteArrayArray9862[i][i_168_ + 1] >> 3)
				  + (aByteArrayArray9862[i][i_168_] >> 1));
	    }
	    aClass525Array9875
		= new Class525[aClass10_9874.method687(1472893803)];
	    aClass10_9874.method686(aClass525Array9875, -700264621);
	    for (int i = 0; i < aClass525Array9875.length; i++)
		((Class525_Sub1) aClass525Array9875[i]).method16069(anInt9864);
	    anInt9879 = 20;
	    if (anIntArrayArrayArray9860 != null)
		anInt9879 += 4;
	    if ((anInt9856 & 0x7) != 0)
		anInt9879 += 12;
	    aByteBuffer9877 = aClass182_Sub1_9844.method14871(anInt9864 * 4);
	    aByteBuffer9878
		= aClass182_Sub1_9844.method14871(anInt9864 * anInt9879);
	    Class525_Sub1[] class525_sub1s = new Class525_Sub1[anInt9864];
	    int i = Class696_Sub18.method17142(anInt9864 / 4, (byte) 82);
	    if (i < 1)
		i = 1;
	    Class10 class10 = new Class10(i);
	    Class525_Sub1[] class525_sub1s_169_ = new Class525_Sub1[anInt9869];
	    for (int i_170_ = 0; i_170_ < anInt1759 * 363736815; i_170_++) {
		for (int i_171_ = 0; i_171_ < anInt1760 * -1152334393;
		     i_171_++)
		    method15573(i_170_, i_171_, is, class525_sub1s_169_,
				class10, class525_sub1s);
	    }
	    for (int i_172_ = 0; i_172_ < anInt9849; i_172_++) {
		Class525_Sub1 class525_sub1 = class525_sub1s[i_172_];
		if (class525_sub1 != null)
		    class525_sub1.method16058(i_172_);
	    }
	    for (int i_173_ = 0; i_173_ < anInt1759 * 363736815; i_173_++) {
		for (int i_174_ = 0; i_174_ < anInt1760 * -1152334393;
		     i_174_++) {
		    short[] is_175_
			= (aShortArrayArray9851
			   [i_174_ * (anInt1759 * 363736815) + i_173_]);
		    if (is_175_ != null) {
			int i_176_ = 0;
			int i_177_ = 0;
			while (i_177_ < is_175_.length) {
			    int i_178_ = is_175_[i_177_++] & 0xffff;
			    int i_179_ = is_175_[i_177_++] & 0xffff;
			    int i_180_ = is_175_[i_177_++] & 0xffff;
			    Class525_Sub1 class525_sub1
				= class525_sub1s[i_178_];
			    Class525_Sub1 class525_sub1_181_
				= class525_sub1s[i_179_];
			    Class525_Sub1 class525_sub1_182_
				= class525_sub1s[i_180_];
			    Class525_Sub1 class525_sub1_183_ = null;
			    if (class525_sub1 != null) {
				class525_sub1.method16057(i_173_, i_174_,
							  i_176_);
				class525_sub1_183_ = class525_sub1;
			    }
			    if (class525_sub1_181_ != null) {
				class525_sub1_181_.method16057(i_173_, i_174_,
							       i_176_);
				if (class525_sub1_183_ == null
				    || ((class525_sub1_181_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub1_183_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub1_183_ = class525_sub1_181_;
			    }
			    if (class525_sub1_182_ != null) {
				class525_sub1_182_.method16057(i_173_, i_174_,
							       i_176_);
				if (class525_sub1_183_ == null
				    || ((class525_sub1_182_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub1_183_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub1_183_ = class525_sub1_182_;
			    }
			    if (class525_sub1_183_ != null) {
				if (class525_sub1 != null)
				    class525_sub1_183_.method16058(i_178_);
				if (class525_sub1_181_ != null)
				    class525_sub1_183_.method16058(i_179_);
				if (class525_sub1_182_ != null)
				    class525_sub1_183_.method16058(i_180_);
				class525_sub1_183_.method16057(i_173_, i_174_,
							       i_176_);
			    }
			    i_176_++;
			}
		    }
		}
	    }
	    anInt9863 = 0;
	    for (int i_184_ = 0; i_184_ < aClass525Array9875.length;
		 i_184_++) {
		Class525_Sub1 class525_sub1
		    = (Class525_Sub1) aClass525Array9875[i_184_];
		if (class525_sub1.anInt10399 > 0)
		    aClass525Array9875[anInt9863++] = class525_sub1;
	    }
	    aClass525Array9842 = new Class525[anInt9863];
	    long[] ls = new long[anInt9863];
	    for (int i_185_ = 0; i_185_ < anInt9863; i_185_++) {
		Class525_Sub1 class525_sub1
		    = (Class525_Sub1) aClass525Array9875[i_185_];
		ls[i_185_] = class525_sub1.aLong7113 * -5126207504388691097L;
		aClass525Array9842[i_185_] = class525_sub1;
	    }
	    Class305.method5424(ls, aClass525Array9842, -1653311932);
	    method15576();
	}
    }
    
    public boolean method2615(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_186_, int i_187_, int i_188_,
			      boolean bool) {
	if (aClass352_9843 == null || class525_sub16_sub17 == null)
	    return false;
	int i_189_ = (i - (i_186_ * aClass182_Sub1_9844.anInt9244 >> 8)
		      >> aClass182_Sub1_9844.anInt9243);
	int i_190_ = (i_187_ - (i_186_ * aClass182_Sub1_9844.anInt9245 >> 8)
		      >> aClass182_Sub1_9844.anInt9243);
	return aClass352_9843.method6178(class525_sub16_sub17, i_189_, i_190_);
    }
    
    public void method2586(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_191_, int i_192_, int i_193_, boolean bool) {
	if (aClass352_9843 != null && class525_sub16_sub17 != null) {
	    int i_194_ = (i - (i_191_ * aClass182_Sub1_9844.anInt9244 >> 8)
			  >> aClass182_Sub1_9844.anInt9243);
	    int i_195_
		= (i_192_ - (i_191_ * aClass182_Sub1_9844.anInt9245 >> 8)
		   >> aClass182_Sub1_9844.anInt9243);
	    aClass352_9843.method6176(class525_sub16_sub17, i_194_, i_195_);
	}
    }
    
    public void method2575(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_196_, int i_197_, int i_198_, boolean bool) {
	if (aClass352_9843 != null && class525_sub16_sub17 != null) {
	    int i_199_ = (i - (i_196_ * aClass182_Sub1_9844.anInt9244 >> 8)
			  >> aClass182_Sub1_9844.anInt9243);
	    int i_200_
		= (i_197_ - (i_196_ * aClass182_Sub1_9844.anInt9245 >> 8)
		   >> aClass182_Sub1_9844.anInt9243);
	    aClass352_9843.method6177(class525_sub16_sub17, i_199_, i_200_);
	}
    }
    
    public void method2589(Class525_Sub21 class525_sub21, int[] is) {
	aClass709_9853.method14345(new Class525_Sub3(aClass182_Sub1_9844, this,
						     class525_sub21, is),
				   (byte) 0);
    }
    
    public void method2602(int i, int i_201_, int i_202_) {
	i = Math.min(aByteArrayArray9862.length - 1, Math.max(0, i));
	i_201_
	    = Math.min(aByteArrayArray9862[i].length - 1, Math.max(0, i_201_));
	if ((aByteArrayArray9862[i][i_201_] & 0xff) < i_202_)
	    aByteArrayArray9862[i][i_201_] = (byte) i_202_;
    }
    
    public Class525_Sub16_Sub17 method2581
	(int i, int i_203_, Class525_Sub16_Sub17 class525_sub16_sub17) {
	if ((aByteArrayArray9861[i][i_203_] & 0x1) == 0)
	    return null;
	int i_204_ = anInt1761 * 435863595 >> aClass182_Sub1_9844.anInt9243;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2_205_;
	if (class525_sub16_sub17_sub2 != null
	    && class525_sub16_sub17_sub2.method18886(i_204_, i_204_)) {
	    class525_sub16_sub17_sub2_205_ = class525_sub16_sub17_sub2;
	    class525_sub16_sub17_sub2_205_.method18881();
	} else
	    class525_sub16_sub17_sub2_205_
		= new Class525_Sub16_Sub17_Sub2(aClass182_Sub1_9844, i_204_,
						i_204_);
	class525_sub16_sub17_sub2_205_.method18882(0, 0, i_204_, i_204_);
	method15572(class525_sub16_sub17_sub2_205_, i, i_203_);
	return class525_sub16_sub17_sub2_205_;
    }
    
    public void method2574(int i, int i_206_, int i_207_, int i_208_,
			   int i_209_, int i_210_, int i_211_,
			   boolean[][] bools) {
	if (anInt9864 > 0) {
	    Interface44 interface44
		= aClass182_Sub1_9844.method14682(anInt9850);
	    int i_212_ = 0;
	    int i_213_ = 32767;
	    int i_214_ = -32768;
	    ByteBuffer bytebuffer = aClass182_Sub1_9844.aByteBuffer9271;
	    bytebuffer.clear();
	    for (int i_215_ = i_209_; i_215_ < i_211_; i_215_++) {
		int i_216_ = i_215_ * (anInt1759 * 363736815) + i_208_;
		for (int i_217_ = i_208_; i_217_ < i_210_; i_217_++) {
		    if (bools[i_217_ - i_208_][i_215_ - i_209_]) {
			short[] is = aShortArrayArray9851[i_216_];
			if (is != null) {
			    for (int i_218_ = 0; i_218_ < is.length;
				 i_218_++) {
				int i_219_ = is[i_218_] & 0xffff;
				if (i_219_ > i_214_)
				    i_214_ = i_219_;
				if (i_219_ < i_213_)
				    i_213_ = i_219_;
				bytebuffer.putShort((short) i_219_);
				i_212_++;
			    }
			}
		    }
		    i_216_++;
		}
	    }
	    interface44.method215(0, bytebuffer.position(),
				  aClass182_Sub1_9844.aLong9160);
	    if (i_212_ > 0) {
		aClass182_Sub1_9844.method14775();
		Class319 class319 = aClass182_Sub1_9844.aClass319_9196;
		aClass182_Sub1_9844.method14764(0, anInterface35_9865);
		aClass182_Sub1_9844.method14764(1, anInterface35_9866);
		aClass182_Sub1_9844.method14763(aClass337_9867);
		aClass182_Sub1_9844.method14765(interface44);
		aClass182_Sub1_9844.method3233(Class444.aClass444_4889);
		float f = (float) aClass182_Sub1_9844.method3566
				      (-1275131150).method2710();
		float f_220_ = (float) aClass182_Sub1_9844.method3566
					   (-1529866398).method2711();
		Class444 class444 = new Class444();
		Class444 class444_221_ = new Class444();
		class444.method7136(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
				    1.0F, 0.0F);
		class444_221_.method7143(((float) i_207_
					  / (256.0F * (float) (anInt1761
							       * 435863595))),
					 ((float) -i_207_
					  / (256.0F * (float) (anInt1761
							       * 435863595))),
					 1.0F / (aFloat9882 - aFloat9852));
		class444_221_.method7147
		    ((float) i - (float) (i_208_ * i_207_) / 256.0F,
		     (float) i_206_ + (float) (i_211_ * i_207_) / 256.0F,
		     -aFloat9852 / (aFloat9882 - aFloat9852));
		class444_221_.method7144(2.0F / f, 2.0F / f_220_, 1.0F);
		class444_221_.method7147(-1.0F, -1.0F, 0.0F);
		aClass182_Sub1_9844.aClass444_9179.method7179(class444,
							      class444_221_);
		aClass182_Sub1_9844.aClass435_9180
		    .method7040(aClass182_Sub1_9844.aClass444_9179);
		aClass182_Sub1_9844
		    .method3252(aClass182_Sub1_9844.aClass435_9180);
		class319.method5677(Class435.aClass435_4829);
		class319.aClass437_3520.method7073(0.0F, 0.0F, 0.0F, 0.0F);
		class319.aClass446_3508.method7265(0.0F, 0.0F, 0.0F);
		class319.aClass437_3518.method7073(0.0F, 0.0F, 0.0F, 0.0F);
		class319.aClass446_3519.method7265(0.0F, 0.0F, 0.0F);
		class319.anInterface38_3512
		    = aClass182_Sub1_9844.anInterface38_9168;
		class319.aClass435_3529.method7023();
		class319.anInt3527 = i_213_;
		class319.anInt3528 = i_214_ - i_213_ + 1;
		class319.anInt3526 = 0;
		class319.anInt3530 = i_212_ / 3;
		if (aClass182_Sub1_9844.aBool9221) {
		    aClass182_Sub1_9844.method3235(false);
		    class319.method5696(false);
		    aClass182_Sub1_9844.method3235(true);
		} else
		    class319.method5696(false);
	    }
	}
    }
    
    void method15574() {
	if ((anInt9847 & 0x2) == 0) {
	    anIntArrayArrayArray9858 = null;
	    anIntArrayArrayArray9848 = null;
	    anIntArrayArrayArray9855 = null;
	}
	anIntArrayArrayArray9860 = null;
	anIntArrayArrayArray9857 = null;
	anIntArrayArrayArray9859 = null;
	aClass525_Sub1ArrayArrayArray9854 = null;
	aByteArrayArray9862 = null;
	aClass10_9874 = null;
	aClass525Array9875 = null;
	aFloatArrayArray9873 = null;
	aFloatArrayArray9872 = null;
	aFloatArrayArray9871 = null;
    }
    
    public void method2613(int i, int i_222_, int[] is, int[] is_223_,
			   int[] is_224_, int[] is_225_, int[] is_226_,
			   int[] is_227_, int[] is_228_, int[] is_229_,
			   int[] is_230_, int[] is_231_, int[] is_232_,
			   Class176 class176, boolean bool) {
	int i_233_ = is_229_.length;
	int[] is_234_ = new int[i_233_ * 3];
	int[] is_235_ = new int[i_233_ * 3];
	int[] is_236_ = new int[i_233_ * 3];
	int[] is_237_ = new int[i_233_ * 3];
	int[] is_238_ = new int[i_233_ * 3];
	int[] is_239_ = new int[i_233_ * 3];
	int[] is_240_ = is_223_ != null ? new int[i_233_ * 3] : null;
	int[] is_241_ = is_225_ != null ? new int[i_233_ * 3] : null;
	int i_242_ = 0;
	for (int i_243_ = 0; i_243_ < i_233_; i_243_++) {
	    int i_244_ = is_226_[i_243_];
	    int i_245_ = is_227_[i_243_];
	    int i_246_ = is_228_[i_243_];
	    is_234_[i_242_] = is[i_244_];
	    is_235_[i_242_] = is_224_[i_244_];
	    is_236_[i_242_] = is_229_[i_243_];
	    is_238_[i_242_] = is_231_[i_243_];
	    is_239_[i_242_] = is_232_[i_243_];
	    is_237_[i_242_]
		= is_230_ != null ? is_230_[i_243_] : is_229_[i_243_];
	    if (is_223_ != null)
		is_240_[i_242_] = is_223_[i_244_];
	    if (is_225_ != null)
		is_241_[i_242_] = is_225_[i_244_];
	    i_242_++;
	    is_234_[i_242_] = is[i_245_];
	    is_235_[i_242_] = is_224_[i_245_];
	    is_236_[i_242_] = is_229_[i_243_];
	    is_238_[i_242_] = is_231_[i_243_];
	    is_239_[i_242_] = is_232_[i_243_];
	    is_237_[i_242_]
		= is_230_ != null ? is_230_[i_243_] : is_229_[i_243_];
	    if (is_223_ != null)
		is_240_[i_242_] = is_223_[i_245_];
	    if (is_225_ != null)
		is_241_[i_242_] = is_225_[i_245_];
	    i_242_++;
	    is_234_[i_242_] = is[i_246_];
	    is_235_[i_242_] = is_224_[i_246_];
	    is_236_[i_242_] = is_229_[i_243_];
	    is_238_[i_242_] = is_231_[i_243_];
	    is_239_[i_242_] = is_232_[i_243_];
	    is_237_[i_242_]
		= is_230_ != null ? is_230_[i_243_] : is_229_[i_243_];
	    if (is_223_ != null)
		is_240_[i_242_] = is_223_[i_246_];
	    if (is_225_ != null)
		is_241_[i_242_] = is_225_[i_246_];
	    i_242_++;
	}
	method2576(i, i_222_, is_234_, is_240_, is_235_, is_241_, is_236_,
		   is_237_, is_238_, is_239_, class176, bool);
    }
    
    void method15575() {
	if ((anInt9847 & 0x2) == 0) {
	    anIntArrayArrayArray9858 = null;
	    anIntArrayArrayArray9848 = null;
	    anIntArrayArrayArray9855 = null;
	}
	anIntArrayArrayArray9860 = null;
	anIntArrayArrayArray9857 = null;
	anIntArrayArrayArray9859 = null;
	aClass525_Sub1ArrayArrayArray9854 = null;
	aByteArrayArray9862 = null;
	aClass10_9874 = null;
	aClass525Array9875 = null;
	aFloatArrayArray9873 = null;
	aFloatArrayArray9872 = null;
	aFloatArrayArray9871 = null;
    }
    
    void method15576() {
	anInterface35_9866 = aClass182_Sub1_9844.method14761(false);
	anInterface35_9866.method225(anInt9849 * 4, 4);
	anInterface35_9866.method215(0, anInt9849 * 4,
				     aClass182_Sub1_9844
					 .method14659(aByteBuffer9877));
	anInterface35_9865 = aClass182_Sub1_9844.method14761(false);
	anInterface35_9865.method225(anInt9849 * anInt9879, anInt9879);
	anInterface35_9865.method215(0, anInt9849 * anInt9879,
				     aClass182_Sub1_9844
					 .method14659(aByteBuffer9878));
	aByteBuffer9877.clear();
	aByteBuffer9877 = null;
	aByteBuffer9878.clear();
	aByteBuffer9878 = null;
	if ((anInt9856 & 0x7) != 0) {
	    if (anIntArrayArrayArray9860 != null)
		aClass337_9867 = (aClass182_Sub1_9844.method14762
				  (new Class378[]
				   { new Class378(new Class342[]
						  { Class342.aClass342_3673,
						    Class342.aClass342_3659,
						    Class342.aClass342_3658,
						    Class342.aClass342_3655 }),
				     new Class378(Class342.aClass342_3657) }));
	    else
		aClass337_9867 = (aClass182_Sub1_9844.method14762
				  (new Class378[]
				   { new Class378(new Class342[]
						  { Class342.aClass342_3673,
						    Class342.aClass342_3659,
						    Class342.aClass342_3655 }),
				     new Class378(Class342.aClass342_3657) }));
	} else if (anIntArrayArrayArray9860 != null)
	    aClass337_9867
		= (aClass182_Sub1_9844.method14762
		   (new Class378[]
		    { new Class378(new Class342[] { Class342.aClass342_3673,
						    Class342.aClass342_3659,
						    Class342.aClass342_3658 }),
		      new Class378(Class342.aClass342_3657) }));
	else
	    aClass337_9867
		= (aClass182_Sub1_9844.method14762
		   (new Class378[]
		    { new Class378(new Class342[] { Class342.aClass342_3673,
						    Class342.aClass342_3659 }),
		      new Class378(Class342.aClass342_3657) }));
	for (int i = 0; i < anInt9863; i++) {
	    Class525_Sub1 class525_sub1
		= (Class525_Sub1) aClass525Array9875[i];
	    class525_sub1.method16060(anInt9849);
	}
	if (aClass352_9843 != null)
	    aClass352_9843.method6174();
	method15574();
    }
    
    public void method2583() {
	if (anInt9864 <= 0) {
	    aClass352_9843 = null;
	    method15574();
	} else {
	    byte[][] is = (new byte[anInt1759 * 363736815 + 1]
			   [anInt1760 * -1152334393 + 1]);
	    for (int i = 1; i < anInt1759 * 363736815; i++) {
		for (int i_247_ = 1; i_247_ < anInt1760 * -1152334393;
		     i_247_++)
		    is[i][i_247_]
			= (byte) ((aByteArrayArray9862[i - 1][i_247_] >> 2)
				  + (aByteArrayArray9862[i + 1][i_247_] >> 3)
				  + (aByteArrayArray9862[i][i_247_ - 1] >> 2)
				  + (aByteArrayArray9862[i][i_247_ + 1] >> 3)
				  + (aByteArrayArray9862[i][i_247_] >> 1));
	    }
	    aClass525Array9875
		= new Class525[aClass10_9874.method687(-1942201332)];
	    aClass10_9874.method686(aClass525Array9875, -517642479);
	    for (int i = 0; i < aClass525Array9875.length; i++)
		((Class525_Sub1) aClass525Array9875[i]).method16069(anInt9864);
	    anInt9879 = 20;
	    if (anIntArrayArrayArray9860 != null)
		anInt9879 += 4;
	    if ((anInt9856 & 0x7) != 0)
		anInt9879 += 12;
	    aByteBuffer9877 = aClass182_Sub1_9844.method14871(anInt9864 * 4);
	    aByteBuffer9878
		= aClass182_Sub1_9844.method14871(anInt9864 * anInt9879);
	    Class525_Sub1[] class525_sub1s = new Class525_Sub1[anInt9864];
	    int i = Class696_Sub18.method17142(anInt9864 / 4, (byte) 47);
	    if (i < 1)
		i = 1;
	    Class10 class10 = new Class10(i);
	    Class525_Sub1[] class525_sub1s_248_ = new Class525_Sub1[anInt9869];
	    for (int i_249_ = 0; i_249_ < anInt1759 * 363736815; i_249_++) {
		for (int i_250_ = 0; i_250_ < anInt1760 * -1152334393;
		     i_250_++)
		    method15573(i_249_, i_250_, is, class525_sub1s_248_,
				class10, class525_sub1s);
	    }
	    for (int i_251_ = 0; i_251_ < anInt9849; i_251_++) {
		Class525_Sub1 class525_sub1 = class525_sub1s[i_251_];
		if (class525_sub1 != null)
		    class525_sub1.method16058(i_251_);
	    }
	    for (int i_252_ = 0; i_252_ < anInt1759 * 363736815; i_252_++) {
		for (int i_253_ = 0; i_253_ < anInt1760 * -1152334393;
		     i_253_++) {
		    short[] is_254_
			= (aShortArrayArray9851
			   [i_253_ * (anInt1759 * 363736815) + i_252_]);
		    if (is_254_ != null) {
			int i_255_ = 0;
			int i_256_ = 0;
			while (i_256_ < is_254_.length) {
			    int i_257_ = is_254_[i_256_++] & 0xffff;
			    int i_258_ = is_254_[i_256_++] & 0xffff;
			    int i_259_ = is_254_[i_256_++] & 0xffff;
			    Class525_Sub1 class525_sub1
				= class525_sub1s[i_257_];
			    Class525_Sub1 class525_sub1_260_
				= class525_sub1s[i_258_];
			    Class525_Sub1 class525_sub1_261_
				= class525_sub1s[i_259_];
			    Class525_Sub1 class525_sub1_262_ = null;
			    if (class525_sub1 != null) {
				class525_sub1.method16057(i_252_, i_253_,
							  i_255_);
				class525_sub1_262_ = class525_sub1;
			    }
			    if (class525_sub1_260_ != null) {
				class525_sub1_260_.method16057(i_252_, i_253_,
							       i_255_);
				if (class525_sub1_262_ == null
				    || ((class525_sub1_260_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub1_262_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub1_262_ = class525_sub1_260_;
			    }
			    if (class525_sub1_261_ != null) {
				class525_sub1_261_.method16057(i_252_, i_253_,
							       i_255_);
				if (class525_sub1_262_ == null
				    || ((class525_sub1_261_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub1_262_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub1_262_ = class525_sub1_261_;
			    }
			    if (class525_sub1_262_ != null) {
				if (class525_sub1 != null)
				    class525_sub1_262_.method16058(i_257_);
				if (class525_sub1_260_ != null)
				    class525_sub1_262_.method16058(i_258_);
				if (class525_sub1_261_ != null)
				    class525_sub1_262_.method16058(i_259_);
				class525_sub1_262_.method16057(i_252_, i_253_,
							       i_255_);
			    }
			    i_255_++;
			}
		    }
		}
	    }
	    anInt9863 = 0;
	    for (int i_263_ = 0; i_263_ < aClass525Array9875.length;
		 i_263_++) {
		Class525_Sub1 class525_sub1
		    = (Class525_Sub1) aClass525Array9875[i_263_];
		if (class525_sub1.anInt10399 > 0)
		    aClass525Array9875[anInt9863++] = class525_sub1;
	    }
	    aClass525Array9842 = new Class525[anInt9863];
	    long[] ls = new long[anInt9863];
	    for (int i_264_ = 0; i_264_ < anInt9863; i_264_++) {
		Class525_Sub1 class525_sub1
		    = (Class525_Sub1) aClass525Array9875[i_264_];
		ls[i_264_] = class525_sub1.aLong7113 * -5126207504388691097L;
		aClass525Array9842[i_264_] = class525_sub1;
	    }
	    Class305.method5424(ls, aClass525Array9842, -1596468140);
	    method15576();
	}
    }
    
    public void method2612(int i, int i_265_, int i_266_, boolean[][] bools,
			   boolean bool, int i_267_) {
	if (aClass525Array9842 != null) {
	    int i_268_ = i_266_ + i_266_ + 1;
	    i_268_ *= i_268_;
	    if (anIntArray9868.length < i_268_)
		anIntArray9868 = new int[i_268_];
	    int i_269_ = i - i_266_;
	    int i_270_ = i_269_;
	    if (i_269_ < 0)
		i_269_ = 0;
	    int i_271_ = i_265_ - i_266_;
	    int i_272_ = i_271_;
	    if (i_271_ < 0)
		i_271_ = 0;
	    int i_273_ = i + i_266_;
	    if (i_273_ > anInt1759 * 363736815 - 1)
		i_273_ = anInt1759 * 363736815 - 1;
	    int i_274_ = i_265_ + i_266_;
	    if (i_274_ > anInt1760 * -1152334393 - 1)
		i_274_ = anInt1760 * -1152334393 - 1;
	    anInt9870 = 0;
	    for (int i_275_ = i_269_; i_275_ <= i_273_; i_275_++) {
		boolean[] bools_276_ = bools[i_275_ - i_270_];
		for (int i_277_ = i_271_; i_277_ <= i_274_; i_277_++) {
		    if (bools_276_[i_277_ - i_272_])
			anIntArray9868[anInt9870++]
			    = i_277_ * (anInt1759 * 363736815) + i_275_;
		}
	    }
	    ByteBuffer bytebuffer = aClass182_Sub1_9844.aByteBuffer9271;
	    bytebuffer.clear();
	    for (int i_278_ = 0; i_278_ < aClass525Array9842.length;
		 i_278_++) {
		Class525_Sub1 class525_sub1
		    = (Class525_Sub1) aClass525Array9842[i_278_];
		class525_sub1.method16061(anIntArray9868, anInt9870);
	    }
	    int i_279_ = bytebuffer.position();
	    Class319 class319 = aClass182_Sub1_9844.aClass319_9196;
	    aClass182_Sub1_9844.method14775();
	    if (aClass182_Sub1_9844.anInt9283 > 0) {
		class319.aClass446_3508.method7265
		    (((float) (aClass182_Sub1_9844.anInt9282 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9844.anInt9282 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9844.anInt9282 >> 0 & 0xff)
		      / 255.0F));
		class319.aClass437_3520.method7073(0.0F, 0.0F, 1.0F,
						   -(aClass182_Sub1_9844
						     .aFloat9207));
		class319.aClass437_3520
		    .method7079(aClass182_Sub1_9844.aClass435_9240);
		class319.aClass437_3520.method7078
		    (1.0F / (aClass182_Sub1_9844.aFloat9218
			     - aClass182_Sub1_9844.aFloat9207));
	    } else {
		class319.aClass437_3520.method7073(0.0F, 0.0F, 0.0F, 0.0F);
		class319.aClass446_3508.method7265(0.0F, 0.0F, 0.0F);
	    }
	    if (i_279_ != 0) {
		Interface44 interface44
		    = aClass182_Sub1_9844.method14682(i_279_ / 2);
		interface44.method215(0, i_279_,
				      aClass182_Sub1_9844.aLong9160);
		aClass182_Sub1_9844.method14764(0, anInterface35_9865);
		aClass182_Sub1_9844.method14765(interface44);
		class319.method5677(Class435.aClass435_4829);
		if ((anInt9856 & 0x7) == 0) {
		    int i_280_ = 0;
		    for (int i_281_ = 0; i_281_ < aClass525Array9842.length;
			 i_281_++) {
			Class525_Sub1 class525_sub1
			    = (Class525_Sub1) aClass525Array9842[i_281_];
			if (class525_sub1.anInt10397 != 0) {
			    if (aClass182_Sub1_9844.aBool9158) {
				aClass182_Sub1_9844.method3262
				    (0, class525_sub1.aClass176_10400);
				class319.aClass437_3518.method7073
				    (0.0F, 1.0F, 0.0F,
				     ((float) aClass182_Sub1_9844.anInt9278
				      + ((float) ((class525_sub1
						   .aClass176_10400.anInt1883)
						  * -2134548585)
					 / 255.0F
					 * (float) ((class525_sub1
						     .aClass176_10400
						     .anInt1879)
						    * -734182087))));
				class319.aClass437_3518.method7078
				    (1.0F / (float) ((class525_sub1
						      .aClass176_10400
						      .anInt1879)
						     * -734182087));
				class319.aClass446_3519.method7265
				    ((float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class319.aClass437_3518.method7073(0.0F, 0.0F,
								   0.0F, 0.0F);
				class319.aClass446_3519.method7265(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_282_ = false;
			    if (class525_sub1.anInt10398 != -1) {
				Class166 class166
				    = (aClass182_Sub1_9844.aClass180_1944
					   .method3116
				       (class525_sub1.anInt10398,
					-1431554601));
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.aClass351_9253
					  .method6159(class166);
				bool_282_
				    = !Class679.method11200(class166.aByte1825,
							    (byte) -62);
			    } else
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.anInterface38_9168;
			    aClass182_Sub1_9844.method14764
				(1, class525_sub1.anInterface35_10401);
			    aClass182_Sub1_9844.method14763(aClass337_9867);
			    class319.aClass435_3529.method6954
				(1.0F / class525_sub1.aFloat10408,
				 1.0F / class525_sub1.aFloat10408, 1.0F, 1.0F);
			    class319.anInt3527 = class525_sub1.anInt10405;
			    class319.anInt3528
				= (class525_sub1.anInt10406
				   - class525_sub1.anInt10405 + 1);
			    class319.anInt3526 = i_280_;
			    class319.anInt3530 = class525_sub1.anInt10397 / 3;
			    class319.method5696(bool_282_);
			    i_280_ += class525_sub1.anInt10397;
			}
		    }
		} else {
		    class319.aClass446_3521.method7265
			(aClass182_Sub1_9844.aFloatArray9228[0],
			 aClass182_Sub1_9844.aFloatArray9228[1],
			 aClass182_Sub1_9844.aFloatArray9228[2]);
		    class319.aClass446_3523.method7265
			((aClass182_Sub1_9844.aFloat9152
			  * aClass182_Sub1_9844.aFloat9233),
			 (aClass182_Sub1_9844.aFloat9152
			  * aClass182_Sub1_9844.aFloat9299),
			 (aClass182_Sub1_9844.aFloat9152
			  * aClass182_Sub1_9844.aFloat9235));
		    class319.aClass446_3524.method7265
			((-aClass182_Sub1_9844.aFloat9238
			  * aClass182_Sub1_9844.aFloat9233),
			 (-aClass182_Sub1_9844.aFloat9238
			  * aClass182_Sub1_9844.aFloat9299),
			 (-aClass182_Sub1_9844.aFloat9238
			  * aClass182_Sub1_9844.aFloat9235));
		    class319.aClass446_3517.method7265
			((aClass182_Sub1_9844.aFloat9169
			  * aClass182_Sub1_9844.aFloat9233),
			 (aClass182_Sub1_9844.aFloat9169
			  * aClass182_Sub1_9844.aFloat9299),
			 (aClass182_Sub1_9844.aFloat9169
			  * aClass182_Sub1_9844.aFloat9235));
		    int i_283_ = 0;
		    for (int i_284_ = 0; i_284_ < aClass525Array9842.length;
			 i_284_++) {
			Class525_Sub1 class525_sub1
			    = (Class525_Sub1) aClass525Array9842[i_284_];
			if (class525_sub1.anInt10397 > 0) {
			    if (aClass182_Sub1_9844.aBool9158) {
				aClass182_Sub1_9844.method3262
				    (0, class525_sub1.aClass176_10400);
				float f = 0.15F;
				class319.aClass437_3518.method7073
				    (0.0F,
				     1.0F / ((float) ((class525_sub1
						       .aClass176_10400
						       .anInt1879)
						      * -734182087)
					     * f),
				     0.0F,
				     256.0F / ((float) ((class525_sub1
							 .aClass176_10400
							 .anInt1879)
							* -734182087)
					       * f));
				class319.aClass446_3519.method7265
				    ((float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class319.aClass437_3518.method7073(0.0F, 0.0F,
								   0.0F, 0.0F);
				class319.aClass446_3519.method7265(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_285_ = 11;
			    if (class525_sub1.anInt10398 != -1) {
				Class166 class166
				    = (aClass182_Sub1_9844.aClass180_1944
					   .method3116
				       (class525_sub1.anInt10398,
					-1431554601));
				i_285_ = class166.aByte1825;
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.aClass351_9253
					  .method6159(class166);
				class319.method5676(class166.aByte1826);
			    } else
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.anInterface38_9168;
			    aClass182_Sub1_9844.method14764
				(1, class525_sub1.anInterface35_10401);
			    aClass182_Sub1_9844.method14763(aClass337_9867);
			    class319.aClass435_3529.method6954
				(1.0F / class525_sub1.aFloat10408,
				 1.0F / class525_sub1.aFloat10408, 1.0F, 1.0F);
			    class319.anInt3527 = class525_sub1.anInt10405;
			    class319.anInt3528
				= (class525_sub1.anInt10406
				   - class525_sub1.anInt10405 + 1);
			    class319.anInt3526 = i_283_;
			    class319.anInt3530 = class525_sub1.anInt10397 / 3;
			    switch (i_285_) {
			    case 6:
				class319.method5696
				    (!Class679.method11200(i_285_,
							   (byte) -73));
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!aClass182_Sub1_9844.aBool9156
				    && (anInt9856 & 0x8) != 0
				    && aClass182_Sub1_9844
					   .aClass346_Sub1_Sub2_9267
					   .method18186(183967645)) {
				    Class346_Sub1_Sub2 class346_sub1_sub2
					= (aClass182_Sub1_9844
					   .aClass346_Sub1_Sub2_9267);
				    if (i_285_ == 2)
					class346_sub1_sub2
					    = (aClass182_Sub1_9844
					       .aClass346_Sub1_Sub2_9266);
				    class346_sub1_sub2.aClass435_11587
					.method6947
					(aClass182_Sub1_9844.aClass435_9195);
				    class346_sub1_sub2.aClass435_11590
					.method6954
					(1.0F / (class525_sub1.aFloat10408
						 * (float) ((class525_sub1
							     .aClass176_10400
							     .anInt1881)
							    * 493658157)),
					 1.0F / (class525_sub1.aFloat10408
						 * (float) ((class525_sub1
							     .aClass176_10400
							     .anInt1881)
							    * 493658157)),
					 1.0F, 1.0F);
				    class346_sub1_sub2.aClass446_11608
					.method7265
					((aClass182_Sub1_9844.aClass435_9216
					  .aFloatArray4830[12]),
					 (aClass182_Sub1_9844.aClass435_9216
					  .aFloatArray4830[13]),
					 (aClass182_Sub1_9844.aClass435_9216
					  .aFloatArray4830[14]));
				    Class166 class166
					= (aClass182_Sub1_9844
					       .aClass180_1944.method3116
					   (class525_sub1.anInt10398,
					    -1431554601));
				    class346_sub1_sub2.anInt11598
					= class166.aByte1826 * 608833997;
				    class346_sub1_sub2.anInt11607
					= class525_sub1.anInt10405 * 156523609;
				    class346_sub1_sub2.anInt11609
					= ((class525_sub1.anInt10406
					    - class525_sub1.anInt10405 + 1)
					   * 724533963);
				    class346_sub1_sub2.anInt11597
					= i_283_ * -46052045;
				    class346_sub1_sub2.anInt11610
					= (class525_sub1.anInt10397 / 3
					   * -1860961719);
				    class346_sub1_sub2.aClass437_11586
					.method7074(class319.aClass437_3518);
				    class346_sub1_sub2.aClass446_11582
					.method7216(class319.aClass446_3519);
				    class346_sub1_sub2.aClass437_11600
					.method7074(class319.aClass437_3520);
				    class346_sub1_sub2.aClass446_11606
					.method7216(class319.aClass446_3508);
				    class346_sub1_sub2.method18187(2081038940);
				} else
				    class319.method5679(0);
				break;
			    case 1:
				class319.aClass446_3515.method7265
				    ((aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[12]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[13]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[14]));
				if (aClass182_Sub1_9844.aBool9158)
				    class319.method5683();
				else
				    class319.method5680(0);
				break;
			    default:
				if (aClass182_Sub1_9844.aBool9158)
				    class319.method5682();
				else
				    class319.method5679(0);
				break;
			    case 7:
				class319.aClass446_3515.method7265
				    ((aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[12]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[13]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[14]));
				class319.aClass435_3525.method7023();
				class319.anInterface40_3513
				    = aClass182_Sub1_9844.method14777();
				class319.method5681(0);
			    }
			    i_283_ += class525_sub1.anInt10397;
			}
		    }
		}
	    }
	    if (!aClass709_9853.method14363(999503190)) {
		aClass182_Sub1_9844.method14779(128);
		aClass182_Sub1_9844.method14710(false);
		Class446 class446 = new Class446(class319.aClass446_3508);
		class319.aClass446_3508.method7265(0.0F, 0.0F, 0.0F);
		Iterator iterator = aClass709_9853.iterator();
		while (iterator.hasNext()) {
		    Class525_Sub3 class525_sub3
			= (Class525_Sub3) iterator.next();
		    class525_sub3.method16094(class319, i, i_265_, i_266_,
					      bools, bool);
		}
		class319.aClass446_3508.method7216(class446);
	    }
	    if (aClass352_9843 != null) {
		aClass182_Sub1_9844.method14779(1);
		aClass182_Sub1_9844.method14764(0, anInterface35_9865);
		aClass182_Sub1_9844.method14764(1, anInterface35_9866);
		aClass182_Sub1_9844.method14763(aClass337_9867);
		Class435 class435 = aClass182_Sub1_9844.aClass435_9180;
		class435.method7023();
		class435.aFloatArray4830[13] = -1.0F;
		class319.method5677(class435);
		aClass352_9843.method6175(class319, i, i_265_, i_266_, bools,
					  bool);
	    }
	}
    }
    
    public void method2598(int i, int i_286_, int i_287_, boolean[][] bools,
			   boolean bool, int i_288_) {
	if (aClass525Array9842 != null) {
	    int i_289_ = i_287_ + i_287_ + 1;
	    i_289_ *= i_289_;
	    if (anIntArray9868.length < i_289_)
		anIntArray9868 = new int[i_289_];
	    int i_290_ = i - i_287_;
	    int i_291_ = i_290_;
	    if (i_290_ < 0)
		i_290_ = 0;
	    int i_292_ = i_286_ - i_287_;
	    int i_293_ = i_292_;
	    if (i_292_ < 0)
		i_292_ = 0;
	    int i_294_ = i + i_287_;
	    if (i_294_ > anInt1759 * 363736815 - 1)
		i_294_ = anInt1759 * 363736815 - 1;
	    int i_295_ = i_286_ + i_287_;
	    if (i_295_ > anInt1760 * -1152334393 - 1)
		i_295_ = anInt1760 * -1152334393 - 1;
	    anInt9870 = 0;
	    for (int i_296_ = i_290_; i_296_ <= i_294_; i_296_++) {
		boolean[] bools_297_ = bools[i_296_ - i_291_];
		for (int i_298_ = i_292_; i_298_ <= i_295_; i_298_++) {
		    if (bools_297_[i_298_ - i_293_])
			anIntArray9868[anInt9870++]
			    = i_298_ * (anInt1759 * 363736815) + i_296_;
		}
	    }
	    ByteBuffer bytebuffer = aClass182_Sub1_9844.aByteBuffer9271;
	    bytebuffer.clear();
	    for (int i_299_ = 0; i_299_ < aClass525Array9842.length;
		 i_299_++) {
		Class525_Sub1 class525_sub1
		    = (Class525_Sub1) aClass525Array9842[i_299_];
		class525_sub1.method16061(anIntArray9868, anInt9870);
	    }
	    int i_300_ = bytebuffer.position();
	    Class319 class319 = aClass182_Sub1_9844.aClass319_9196;
	    aClass182_Sub1_9844.method14775();
	    if (aClass182_Sub1_9844.anInt9283 > 0) {
		class319.aClass446_3508.method7265
		    (((float) (aClass182_Sub1_9844.anInt9282 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9844.anInt9282 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9844.anInt9282 >> 0 & 0xff)
		      / 255.0F));
		class319.aClass437_3520.method7073(0.0F, 0.0F, 1.0F,
						   -(aClass182_Sub1_9844
						     .aFloat9207));
		class319.aClass437_3520
		    .method7079(aClass182_Sub1_9844.aClass435_9240);
		class319.aClass437_3520.method7078
		    (1.0F / (aClass182_Sub1_9844.aFloat9218
			     - aClass182_Sub1_9844.aFloat9207));
	    } else {
		class319.aClass437_3520.method7073(0.0F, 0.0F, 0.0F, 0.0F);
		class319.aClass446_3508.method7265(0.0F, 0.0F, 0.0F);
	    }
	    if (i_300_ != 0) {
		Interface44 interface44
		    = aClass182_Sub1_9844.method14682(i_300_ / 2);
		interface44.method215(0, i_300_,
				      aClass182_Sub1_9844.aLong9160);
		aClass182_Sub1_9844.method14764(0, anInterface35_9865);
		aClass182_Sub1_9844.method14765(interface44);
		class319.method5677(Class435.aClass435_4829);
		if ((anInt9856 & 0x7) == 0) {
		    int i_301_ = 0;
		    for (int i_302_ = 0; i_302_ < aClass525Array9842.length;
			 i_302_++) {
			Class525_Sub1 class525_sub1
			    = (Class525_Sub1) aClass525Array9842[i_302_];
			if (class525_sub1.anInt10397 != 0) {
			    if (aClass182_Sub1_9844.aBool9158) {
				aClass182_Sub1_9844.method3262
				    (0, class525_sub1.aClass176_10400);
				class319.aClass437_3518.method7073
				    (0.0F, 1.0F, 0.0F,
				     ((float) aClass182_Sub1_9844.anInt9278
				      + ((float) ((class525_sub1
						   .aClass176_10400.anInt1883)
						  * -2134548585)
					 / 255.0F
					 * (float) ((class525_sub1
						     .aClass176_10400
						     .anInt1879)
						    * -734182087))));
				class319.aClass437_3518.method7078
				    (1.0F / (float) ((class525_sub1
						      .aClass176_10400
						      .anInt1879)
						     * -734182087));
				class319.aClass446_3519.method7265
				    ((float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class319.aClass437_3518.method7073(0.0F, 0.0F,
								   0.0F, 0.0F);
				class319.aClass446_3519.method7265(0.0F, 0.0F,
								   0.0F);
			    }
			    boolean bool_303_ = false;
			    if (class525_sub1.anInt10398 != -1) {
				Class166 class166
				    = (aClass182_Sub1_9844.aClass180_1944
					   .method3116
				       (class525_sub1.anInt10398,
					-1431554601));
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.aClass351_9253
					  .method6159(class166);
				bool_303_
				    = !Class679.method11200(class166.aByte1825,
							    (byte) -37);
			    } else
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.anInterface38_9168;
			    aClass182_Sub1_9844.method14764
				(1, class525_sub1.anInterface35_10401);
			    aClass182_Sub1_9844.method14763(aClass337_9867);
			    class319.aClass435_3529.method6954
				(1.0F / class525_sub1.aFloat10408,
				 1.0F / class525_sub1.aFloat10408, 1.0F, 1.0F);
			    class319.anInt3527 = class525_sub1.anInt10405;
			    class319.anInt3528
				= (class525_sub1.anInt10406
				   - class525_sub1.anInt10405 + 1);
			    class319.anInt3526 = i_301_;
			    class319.anInt3530 = class525_sub1.anInt10397 / 3;
			    class319.method5696(bool_303_);
			    i_301_ += class525_sub1.anInt10397;
			}
		    }
		} else {
		    class319.aClass446_3521.method7265
			(aClass182_Sub1_9844.aFloatArray9228[0],
			 aClass182_Sub1_9844.aFloatArray9228[1],
			 aClass182_Sub1_9844.aFloatArray9228[2]);
		    class319.aClass446_3523.method7265
			((aClass182_Sub1_9844.aFloat9152
			  * aClass182_Sub1_9844.aFloat9233),
			 (aClass182_Sub1_9844.aFloat9152
			  * aClass182_Sub1_9844.aFloat9299),
			 (aClass182_Sub1_9844.aFloat9152
			  * aClass182_Sub1_9844.aFloat9235));
		    class319.aClass446_3524.method7265
			((-aClass182_Sub1_9844.aFloat9238
			  * aClass182_Sub1_9844.aFloat9233),
			 (-aClass182_Sub1_9844.aFloat9238
			  * aClass182_Sub1_9844.aFloat9299),
			 (-aClass182_Sub1_9844.aFloat9238
			  * aClass182_Sub1_9844.aFloat9235));
		    class319.aClass446_3517.method7265
			((aClass182_Sub1_9844.aFloat9169
			  * aClass182_Sub1_9844.aFloat9233),
			 (aClass182_Sub1_9844.aFloat9169
			  * aClass182_Sub1_9844.aFloat9299),
			 (aClass182_Sub1_9844.aFloat9169
			  * aClass182_Sub1_9844.aFloat9235));
		    int i_304_ = 0;
		    for (int i_305_ = 0; i_305_ < aClass525Array9842.length;
			 i_305_++) {
			Class525_Sub1 class525_sub1
			    = (Class525_Sub1) aClass525Array9842[i_305_];
			if (class525_sub1.anInt10397 > 0) {
			    if (aClass182_Sub1_9844.aBool9158) {
				aClass182_Sub1_9844.method3262
				    (0, class525_sub1.aClass176_10400);
				float f = 0.15F;
				class319.aClass437_3518.method7073
				    (0.0F,
				     1.0F / ((float) ((class525_sub1
						       .aClass176_10400
						       .anInt1879)
						      * -734182087)
					     * f),
				     0.0F,
				     256.0F / ((float) ((class525_sub1
							 .aClass176_10400
							 .anInt1879)
							* -734182087)
					       * f));
				class319.aClass446_3519.method7265
				    ((float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 16
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 8
					      & 0xff) / 255.0F,
				     (float) ((class525_sub1.aClass176_10400
					       .anInt1877) * 2141545647 >> 0
					      & 0xff) / 255.0F);
			    } else {
				class319.aClass437_3518.method7073(0.0F, 0.0F,
								   0.0F, 0.0F);
				class319.aClass446_3519.method7265(0.0F, 0.0F,
								   0.0F);
			    }
			    byte i_306_ = 11;
			    if (class525_sub1.anInt10398 != -1) {
				Class166 class166
				    = (aClass182_Sub1_9844.aClass180_1944
					   .method3116
				       (class525_sub1.anInt10398,
					-1431554601));
				i_306_ = class166.aByte1825;
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.aClass351_9253
					  .method6159(class166);
				class319.method5676(class166.aByte1826);
			    } else
				class319.anInterface38_3512
				    = aClass182_Sub1_9844.anInterface38_9168;
			    aClass182_Sub1_9844.method14764
				(1, class525_sub1.anInterface35_10401);
			    aClass182_Sub1_9844.method14763(aClass337_9867);
			    class319.aClass435_3529.method6954
				(1.0F / class525_sub1.aFloat10408,
				 1.0F / class525_sub1.aFloat10408, 1.0F, 1.0F);
			    class319.anInt3527 = class525_sub1.anInt10405;
			    class319.anInt3528
				= (class525_sub1.anInt10406
				   - class525_sub1.anInt10405 + 1);
			    class319.anInt3526 = i_304_;
			    class319.anInt3530 = class525_sub1.anInt10397 / 3;
			    switch (i_306_) {
			    case 6:
				class319.method5696
				    (!Class679.method11200(i_306_,
							   (byte) -121));
				break;
			    case 2:
			    case 4:
			    case 8:
			    case 9:
				if (!aClass182_Sub1_9844.aBool9156
				    && (anInt9856 & 0x8) != 0
				    && aClass182_Sub1_9844
					   .aClass346_Sub1_Sub2_9267
					   .method18186(2102931357)) {
				    Class346_Sub1_Sub2 class346_sub1_sub2
					= (aClass182_Sub1_9844
					   .aClass346_Sub1_Sub2_9267);
				    if (i_306_ == 2)
					class346_sub1_sub2
					    = (aClass182_Sub1_9844
					       .aClass346_Sub1_Sub2_9266);
				    class346_sub1_sub2.aClass435_11587
					.method6947
					(aClass182_Sub1_9844.aClass435_9195);
				    class346_sub1_sub2.aClass435_11590
					.method6954
					(1.0F / (class525_sub1.aFloat10408
						 * (float) ((class525_sub1
							     .aClass176_10400
							     .anInt1881)
							    * 493658157)),
					 1.0F / (class525_sub1.aFloat10408
						 * (float) ((class525_sub1
							     .aClass176_10400
							     .anInt1881)
							    * 493658157)),
					 1.0F, 1.0F);
				    class346_sub1_sub2.aClass446_11608
					.method7265
					((aClass182_Sub1_9844.aClass435_9216
					  .aFloatArray4830[12]),
					 (aClass182_Sub1_9844.aClass435_9216
					  .aFloatArray4830[13]),
					 (aClass182_Sub1_9844.aClass435_9216
					  .aFloatArray4830[14]));
				    Class166 class166
					= (aClass182_Sub1_9844
					       .aClass180_1944.method3116
					   (class525_sub1.anInt10398,
					    -1431554601));
				    class346_sub1_sub2.anInt11598
					= class166.aByte1826 * 608833997;
				    class346_sub1_sub2.anInt11607
					= class525_sub1.anInt10405 * 156523609;
				    class346_sub1_sub2.anInt11609
					= ((class525_sub1.anInt10406
					    - class525_sub1.anInt10405 + 1)
					   * 724533963);
				    class346_sub1_sub2.anInt11597
					= i_304_ * -46052045;
				    class346_sub1_sub2.anInt11610
					= (class525_sub1.anInt10397 / 3
					   * -1860961719);
				    class346_sub1_sub2.aClass437_11586
					.method7074(class319.aClass437_3518);
				    class346_sub1_sub2.aClass446_11582
					.method7216(class319.aClass446_3519);
				    class346_sub1_sub2.aClass437_11600
					.method7074(class319.aClass437_3520);
				    class346_sub1_sub2.aClass446_11606
					.method7216(class319.aClass446_3508);
				    class346_sub1_sub2.method18187(1341531256);
				} else
				    class319.method5679(0);
				break;
			    case 1:
				class319.aClass446_3515.method7265
				    ((aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[12]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[13]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[14]));
				if (aClass182_Sub1_9844.aBool9158)
				    class319.method5683();
				else
				    class319.method5680(0);
				break;
			    default:
				if (aClass182_Sub1_9844.aBool9158)
				    class319.method5682();
				else
				    class319.method5679(0);
				break;
			    case 7:
				class319.aClass446_3515.method7265
				    ((aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[12]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[13]),
				     (aClass182_Sub1_9844.aClass435_9216
				      .aFloatArray4830[14]));
				class319.aClass435_3525.method7023();
				class319.anInterface40_3513
				    = aClass182_Sub1_9844.method14777();
				class319.method5681(0);
			    }
			    i_304_ += class525_sub1.anInt10397;
			}
		    }
		}
	    }
	    if (!aClass709_9853.method14363(-333945770)) {
		aClass182_Sub1_9844.method14779(128);
		aClass182_Sub1_9844.method14710(false);
		Class446 class446 = new Class446(class319.aClass446_3508);
		class319.aClass446_3508.method7265(0.0F, 0.0F, 0.0F);
		Iterator iterator = aClass709_9853.iterator();
		while (iterator.hasNext()) {
		    Class525_Sub3 class525_sub3
			= (Class525_Sub3) iterator.next();
		    class525_sub3.method16094(class319, i, i_286_, i_287_,
					      bools, bool);
		}
		class319.aClass446_3508.method7216(class446);
	    }
	    if (aClass352_9843 != null) {
		aClass182_Sub1_9844.method14779(1);
		aClass182_Sub1_9844.method14764(0, anInterface35_9865);
		aClass182_Sub1_9844.method14764(1, anInterface35_9866);
		aClass182_Sub1_9844.method14763(aClass337_9867);
		Class435 class435 = aClass182_Sub1_9844.aClass435_9180;
		class435.method7023();
		class435.aFloatArray4830[13] = -1.0F;
		class319.method5677(class435);
		aClass352_9843.method6175(class319, i, i_286_, i_287_, bools,
					  bool);
	    }
	}
    }
    
    public void method2599(int i, int i_307_, int i_308_, int i_309_,
			   int i_310_, int i_311_, int i_312_,
			   boolean[][] bools) {
	if (anInt9864 > 0) {
	    Interface44 interface44
		= aClass182_Sub1_9844.method14682(anInt9850);
	    int i_313_ = 0;
	    int i_314_ = 32767;
	    int i_315_ = -32768;
	    ByteBuffer bytebuffer = aClass182_Sub1_9844.aByteBuffer9271;
	    bytebuffer.clear();
	    for (int i_316_ = i_310_; i_316_ < i_312_; i_316_++) {
		int i_317_ = i_316_ * (anInt1759 * 363736815) + i_309_;
		for (int i_318_ = i_309_; i_318_ < i_311_; i_318_++) {
		    if (bools[i_318_ - i_309_][i_316_ - i_310_]) {
			short[] is = aShortArrayArray9851[i_317_];
			if (is != null) {
			    for (int i_319_ = 0; i_319_ < is.length;
				 i_319_++) {
				int i_320_ = is[i_319_] & 0xffff;
				if (i_320_ > i_315_)
				    i_315_ = i_320_;
				if (i_320_ < i_314_)
				    i_314_ = i_320_;
				bytebuffer.putShort((short) i_320_);
				i_313_++;
			    }
			}
		    }
		    i_317_++;
		}
	    }
	    interface44.method215(0, bytebuffer.position(),
				  aClass182_Sub1_9844.aLong9160);
	    if (i_313_ > 0) {
		aClass182_Sub1_9844.method14775();
		Class319 class319 = aClass182_Sub1_9844.aClass319_9196;
		aClass182_Sub1_9844.method14764(0, anInterface35_9865);
		aClass182_Sub1_9844.method14764(1, anInterface35_9866);
		aClass182_Sub1_9844.method14763(aClass337_9867);
		aClass182_Sub1_9844.method14765(interface44);
		aClass182_Sub1_9844.method3233(Class444.aClass444_4889);
		float f = (float) aClass182_Sub1_9844.method3566
				      (-1947752630).method2710();
		float f_321_ = (float) aClass182_Sub1_9844.method3566
					   (-1723267690).method2711();
		Class444 class444 = new Class444();
		Class444 class444_322_ = new Class444();
		class444.method7136(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F,
				    1.0F, 0.0F);
		class444_322_.method7143(((float) i_308_
					  / (256.0F * (float) (anInt1761
							       * 435863595))),
					 ((float) -i_308_
					  / (256.0F * (float) (anInt1761
							       * 435863595))),
					 1.0F / (aFloat9882 - aFloat9852));
		class444_322_.method7147
		    ((float) i - (float) (i_309_ * i_308_) / 256.0F,
		     (float) i_307_ + (float) (i_312_ * i_308_) / 256.0F,
		     -aFloat9852 / (aFloat9882 - aFloat9852));
		class444_322_.method7144(2.0F / f, 2.0F / f_321_, 1.0F);
		class444_322_.method7147(-1.0F, -1.0F, 0.0F);
		aClass182_Sub1_9844.aClass444_9179.method7179(class444,
							      class444_322_);
		aClass182_Sub1_9844.aClass435_9180
		    .method7040(aClass182_Sub1_9844.aClass444_9179);
		aClass182_Sub1_9844
		    .method3252(aClass182_Sub1_9844.aClass435_9180);
		class319.method5677(Class435.aClass435_4829);
		class319.aClass437_3520.method7073(0.0F, 0.0F, 0.0F, 0.0F);
		class319.aClass446_3508.method7265(0.0F, 0.0F, 0.0F);
		class319.aClass437_3518.method7073(0.0F, 0.0F, 0.0F, 0.0F);
		class319.aClass446_3519.method7265(0.0F, 0.0F, 0.0F);
		class319.anInterface38_3512
		    = aClass182_Sub1_9844.anInterface38_9168;
		class319.aClass435_3529.method7023();
		class319.anInt3527 = i_314_;
		class319.anInt3528 = i_315_ - i_314_ + 1;
		class319.anInt3526 = 0;
		class319.anInt3530 = i_313_ / 3;
		if (aClass182_Sub1_9844.aBool9221) {
		    aClass182_Sub1_9844.method3235(false);
		    class319.method5696(false);
		    aClass182_Sub1_9844.method3235(true);
		} else
		    class319.method5696(false);
	    }
	}
    }
    
    public void method2600() {
	if (anInt9864 <= 0) {
	    aClass352_9843 = null;
	    method15574();
	} else {
	    byte[][] is = (new byte[anInt1759 * 363736815 + 1]
			   [anInt1760 * -1152334393 + 1]);
	    for (int i = 1; i < anInt1759 * 363736815; i++) {
		for (int i_323_ = 1; i_323_ < anInt1760 * -1152334393;
		     i_323_++)
		    is[i][i_323_]
			= (byte) ((aByteArrayArray9862[i - 1][i_323_] >> 2)
				  + (aByteArrayArray9862[i + 1][i_323_] >> 3)
				  + (aByteArrayArray9862[i][i_323_ - 1] >> 2)
				  + (aByteArrayArray9862[i][i_323_ + 1] >> 3)
				  + (aByteArrayArray9862[i][i_323_] >> 1));
	    }
	    aClass525Array9875
		= new Class525[aClass10_9874.method687(133349469)];
	    aClass10_9874.method686(aClass525Array9875, -1488755901);
	    for (int i = 0; i < aClass525Array9875.length; i++)
		((Class525_Sub1) aClass525Array9875[i]).method16069(anInt9864);
	    anInt9879 = 20;
	    if (anIntArrayArrayArray9860 != null)
		anInt9879 += 4;
	    if ((anInt9856 & 0x7) != 0)
		anInt9879 += 12;
	    aByteBuffer9877 = aClass182_Sub1_9844.method14871(anInt9864 * 4);
	    aByteBuffer9878
		= aClass182_Sub1_9844.method14871(anInt9864 * anInt9879);
	    Class525_Sub1[] class525_sub1s = new Class525_Sub1[anInt9864];
	    int i = Class696_Sub18.method17142(anInt9864 / 4, (byte) 83);
	    if (i < 1)
		i = 1;
	    Class10 class10 = new Class10(i);
	    Class525_Sub1[] class525_sub1s_324_ = new Class525_Sub1[anInt9869];
	    for (int i_325_ = 0; i_325_ < anInt1759 * 363736815; i_325_++) {
		for (int i_326_ = 0; i_326_ < anInt1760 * -1152334393;
		     i_326_++)
		    method15573(i_325_, i_326_, is, class525_sub1s_324_,
				class10, class525_sub1s);
	    }
	    for (int i_327_ = 0; i_327_ < anInt9849; i_327_++) {
		Class525_Sub1 class525_sub1 = class525_sub1s[i_327_];
		if (class525_sub1 != null)
		    class525_sub1.method16058(i_327_);
	    }
	    for (int i_328_ = 0; i_328_ < anInt1759 * 363736815; i_328_++) {
		for (int i_329_ = 0; i_329_ < anInt1760 * -1152334393;
		     i_329_++) {
		    short[] is_330_
			= (aShortArrayArray9851
			   [i_329_ * (anInt1759 * 363736815) + i_328_]);
		    if (is_330_ != null) {
			int i_331_ = 0;
			int i_332_ = 0;
			while (i_332_ < is_330_.length) {
			    int i_333_ = is_330_[i_332_++] & 0xffff;
			    int i_334_ = is_330_[i_332_++] & 0xffff;
			    int i_335_ = is_330_[i_332_++] & 0xffff;
			    Class525_Sub1 class525_sub1
				= class525_sub1s[i_333_];
			    Class525_Sub1 class525_sub1_336_
				= class525_sub1s[i_334_];
			    Class525_Sub1 class525_sub1_337_
				= class525_sub1s[i_335_];
			    Class525_Sub1 class525_sub1_338_ = null;
			    if (class525_sub1 != null) {
				class525_sub1.method16057(i_328_, i_329_,
							  i_331_);
				class525_sub1_338_ = class525_sub1;
			    }
			    if (class525_sub1_336_ != null) {
				class525_sub1_336_.method16057(i_328_, i_329_,
							       i_331_);
				if (class525_sub1_338_ == null
				    || ((class525_sub1_336_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub1_338_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub1_338_ = class525_sub1_336_;
			    }
			    if (class525_sub1_337_ != null) {
				class525_sub1_337_.method16057(i_328_, i_329_,
							       i_331_);
				if (class525_sub1_338_ == null
				    || ((class525_sub1_337_.aLong7113
					 * -5126207504388691097L)
					< (class525_sub1_338_.aLong7113
					   * -5126207504388691097L)))
				    class525_sub1_338_ = class525_sub1_337_;
			    }
			    if (class525_sub1_338_ != null) {
				if (class525_sub1 != null)
				    class525_sub1_338_.method16058(i_333_);
				if (class525_sub1_336_ != null)
				    class525_sub1_338_.method16058(i_334_);
				if (class525_sub1_337_ != null)
				    class525_sub1_338_.method16058(i_335_);
				class525_sub1_338_.method16057(i_328_, i_329_,
							       i_331_);
			    }
			    i_331_++;
			}
		    }
		}
	    }
	    anInt9863 = 0;
	    for (int i_339_ = 0; i_339_ < aClass525Array9875.length;
		 i_339_++) {
		Class525_Sub1 class525_sub1
		    = (Class525_Sub1) aClass525Array9875[i_339_];
		if (class525_sub1.anInt10399 > 0)
		    aClass525Array9875[anInt9863++] = class525_sub1;
	    }
	    aClass525Array9842 = new Class525[anInt9863];
	    long[] ls = new long[anInt9863];
	    for (int i_340_ = 0; i_340_ < anInt9863; i_340_++) {
		Class525_Sub1 class525_sub1
		    = (Class525_Sub1) aClass525Array9875[i_340_];
		ls[i_340_] = class525_sub1.aLong7113 * -5126207504388691097L;
		aClass525Array9842[i_340_] = class525_sub1;
	    }
	    Class305.method5424(ls, aClass525Array9842, -1552142612);
	    method15576();
	}
    }
    
    public Class525_Sub16_Sub17 method2601
	(int i, int i_341_, Class525_Sub16_Sub17 class525_sub16_sub17) {
	if ((aByteArrayArray9861[i][i_341_] & 0x1) == 0)
	    return null;
	int i_342_ = anInt1761 * 435863595 >> aClass182_Sub1_9844.anInt9243;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2_343_;
	if (class525_sub16_sub17_sub2 != null
	    && class525_sub16_sub17_sub2.method18886(i_342_, i_342_)) {
	    class525_sub16_sub17_sub2_343_ = class525_sub16_sub17_sub2;
	    class525_sub16_sub17_sub2_343_.method18881();
	} else
	    class525_sub16_sub17_sub2_343_
		= new Class525_Sub16_Sub17_Sub2(aClass182_Sub1_9844, i_342_,
						i_342_);
	class525_sub16_sub17_sub2_343_.method18882(0, 0, i_342_, i_342_);
	method15572(class525_sub16_sub17_sub2_343_, i, i_341_);
	return class525_sub16_sub17_sub2_343_;
    }
    
    public void method2595(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_344_, int i_345_, int i_346_, boolean bool) {
	if (aClass352_9843 != null && class525_sub16_sub17 != null) {
	    int i_347_ = (i - (i_344_ * aClass182_Sub1_9844.anInt9244 >> 8)
			  >> aClass182_Sub1_9844.anInt9243);
	    int i_348_
		= (i_345_ - (i_344_ * aClass182_Sub1_9844.anInt9245 >> 8)
		   >> aClass182_Sub1_9844.anInt9243);
	    aClass352_9843.method6176(class525_sub16_sub17, i_347_, i_348_);
	}
    }
    
    public void method2603(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_349_, int i_350_, int i_351_, boolean bool) {
	if (aClass352_9843 != null && class525_sub16_sub17 != null) {
	    int i_352_ = (i - (i_349_ * aClass182_Sub1_9844.anInt9244 >> 8)
			  >> aClass182_Sub1_9844.anInt9243);
	    int i_353_
		= (i_350_ - (i_349_ * aClass182_Sub1_9844.anInt9245 >> 8)
		   >> aClass182_Sub1_9844.anInt9243);
	    aClass352_9843.method6176(class525_sub16_sub17, i_352_, i_353_);
	}
    }
    
    public void method2604(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_354_, int i_355_, int i_356_, boolean bool) {
	if (aClass352_9843 != null && class525_sub16_sub17 != null) {
	    int i_357_ = (i - (i_354_ * aClass182_Sub1_9844.anInt9244 >> 8)
			  >> aClass182_Sub1_9844.anInt9243);
	    int i_358_
		= (i_355_ - (i_354_ * aClass182_Sub1_9844.anInt9245 >> 8)
		   >> aClass182_Sub1_9844.anInt9243);
	    aClass352_9843.method6176(class525_sub16_sub17, i_357_, i_358_);
	}
    }
    
    public void method2585(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_359_, int i_360_, int i_361_, boolean bool) {
	if (aClass352_9843 != null && class525_sub16_sub17 != null) {
	    int i_362_ = (i - (i_359_ * aClass182_Sub1_9844.anInt9244 >> 8)
			  >> aClass182_Sub1_9844.anInt9243);
	    int i_363_
		= (i_360_ - (i_359_ * aClass182_Sub1_9844.anInt9245 >> 8)
		   >> aClass182_Sub1_9844.anInt9243);
	    aClass352_9843.method6177(class525_sub16_sub17, i_362_, i_363_);
	}
    }
    
    public void method2593(int i, int i_364_, int[] is, int[] is_365_,
			   int[] is_366_, int[] is_367_, int[] is_368_,
			   int[] is_369_, int[] is_370_, int[] is_371_,
			   Class176 class176, boolean bool) {
	Class180 class180 = aClass182_Sub1_9844.aClass180_1944;
	if (is_367_ != null && anIntArrayArrayArray9860 == null)
	    anIntArrayArrayArray9860
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	if (is_365_ != null && anIntArrayArrayArray9859 == null)
	    anIntArrayArrayArray9859
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	anIntArrayArrayArray9848[i][i_364_] = is;
	anIntArrayArrayArray9858[i][i_364_] = is_366_;
	anIntArrayArrayArray9855[i][i_364_] = is_368_;
	anIntArrayArrayArray9857[i][i_364_] = is_369_;
	if (anIntArrayArrayArray9860 != null)
	    anIntArrayArrayArray9860[i][i_364_] = is_367_;
	if (anIntArrayArrayArray9859 != null)
	    anIntArrayArrayArray9859[i][i_364_] = is_365_;
	Class525_Sub1[] class525_sub1s
	    = (aClass525_Sub1ArrayArrayArray9854[i][i_364_]
	       = new Class525_Sub1[is_368_.length]);
	for (int i_372_ = 0; i_372_ < is_368_.length; i_372_++) {
	    int i_373_ = is_370_[i_372_];
	    int i_374_ = is_371_[i_372_];
	    if ((anInt9856 & 0x20) != 0 && i_373_ != -1
		&& class180.method3116(i_373_, -1431554601).aBool1819) {
		i_374_ = 128;
		i_373_ = -1;
	    }
	    long l = ((long) (class176.anInt1883 * -2134548585) << 48
		      | (long) (class176.anInt1879 * -734182087) << 42
		      | (long) (class176.anInt1877 * 2141545647) << 28
		      | (long) (i_374_ << 14) | (long) i_373_);
	    Class525 class525;
	    for (class525 = aClass10_9874.method684(l); class525 != null;
		 class525 = aClass10_9874.method696(-2057538770)) {
		Class525_Sub1 class525_sub1 = (Class525_Sub1) class525;
		if (class525_sub1.anInt10398 == i_373_
		    && class525_sub1.aFloat10408 == (float) i_374_
		    && class525_sub1.aClass176_10400.method2902(class176,
								(short) 1023))
		    break;
	    }
	    if (class525 == null) {
		class525_sub1s[i_372_]
		    = new Class525_Sub1(this, i_373_, i_374_, class176);
		aClass10_9874.method695(class525_sub1s[i_372_], l);
	    } else
		class525_sub1s[i_372_] = (Class525_Sub1) class525;
	}
	if (bool)
	    aByteArrayArray9861[i][i_364_] |= 0x1;
	if (is_368_.length > anInt9869)
	    anInt9869 = is_368_.length;
	anInt9864 += is_368_.length;
    }
    
    public void method2607(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_375_, int i_376_, int i_377_, boolean bool) {
	if (aClass352_9843 != null && class525_sub16_sub17 != null) {
	    int i_378_ = (i - (i_375_ * aClass182_Sub1_9844.anInt9244 >> 8)
			  >> aClass182_Sub1_9844.anInt9243);
	    int i_379_
		= (i_376_ - (i_375_ * aClass182_Sub1_9844.anInt9245 >> 8)
		   >> aClass182_Sub1_9844.anInt9243);
	    aClass352_9843.method6177(class525_sub16_sub17, i_378_, i_379_);
	}
    }
    
    public Class525_Sub16_Sub17 method2597
	(int i, int i_380_, Class525_Sub16_Sub17 class525_sub16_sub17) {
	if ((aByteArrayArray9861[i][i_380_] & 0x1) == 0)
	    return null;
	int i_381_ = anInt1761 * 435863595 >> aClass182_Sub1_9844.anInt9243;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2_382_;
	if (class525_sub16_sub17_sub2 != null
	    && class525_sub16_sub17_sub2.method18886(i_381_, i_381_)) {
	    class525_sub16_sub17_sub2_382_ = class525_sub16_sub17_sub2;
	    class525_sub16_sub17_sub2_382_.method18881();
	} else
	    class525_sub16_sub17_sub2_382_
		= new Class525_Sub16_Sub17_Sub2(aClass182_Sub1_9844, i_381_,
						i_381_);
	class525_sub16_sub17_sub2_382_.method18882(0, 0, i_381_, i_381_);
	method15572(class525_sub16_sub17_sub2_382_, i, i_380_);
	return class525_sub16_sub17_sub2_382_;
    }
    
    public boolean method2606(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_383_, int i_384_, int i_385_,
			      boolean bool) {
	if (aClass352_9843 == null || class525_sub16_sub17 == null)
	    return false;
	int i_386_ = (i - (i_383_ * aClass182_Sub1_9844.anInt9244 >> 8)
		      >> aClass182_Sub1_9844.anInt9243);
	int i_387_ = (i_384_ - (i_383_ * aClass182_Sub1_9844.anInt9245 >> 8)
		      >> aClass182_Sub1_9844.anInt9243);
	return aClass352_9843.method6178(class525_sub16_sub17, i_386_, i_387_);
    }
    
    public void method2610(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			   int i_388_, int i_389_, int i_390_, boolean bool) {
	if (aClass352_9843 != null && class525_sub16_sub17 != null) {
	    int i_391_ = (i - (i_388_ * aClass182_Sub1_9844.anInt9244 >> 8)
			  >> aClass182_Sub1_9844.anInt9243);
	    int i_392_
		= (i_389_ - (i_388_ * aClass182_Sub1_9844.anInt9245 >> 8)
		   >> aClass182_Sub1_9844.anInt9243);
	    aClass352_9843.method6177(class525_sub16_sub17, i_391_, i_392_);
	}
    }
    
    public void method2611(Class525_Sub21 class525_sub21, int[] is) {
	aClass709_9853.method14345(new Class525_Sub3(aClass182_Sub1_9844, this,
						     class525_sub21, is),
				   (byte) 0);
    }
    
    public void method2587(int i, int i_393_, int i_394_) {
	i = Math.min(aByteArrayArray9862.length - 1, Math.max(0, i));
	i_393_
	    = Math.min(aByteArrayArray9862[i].length - 1, Math.max(0, i_393_));
	if ((aByteArrayArray9862[i][i_393_] & 0xff) < i_394_)
	    aByteArrayArray9862[i][i_393_] = (byte) i_394_;
    }
    
    public boolean method2605(Class525_Sub16_Sub17 class525_sub16_sub17, int i,
			      int i_395_, int i_396_, int i_397_,
			      boolean bool) {
	if (aClass352_9843 == null || class525_sub16_sub17 == null)
	    return false;
	int i_398_ = (i - (i_395_ * aClass182_Sub1_9844.anInt9244 >> 8)
		      >> aClass182_Sub1_9844.anInt9243);
	int i_399_ = (i_396_ - (i_395_ * aClass182_Sub1_9844.anInt9245 >> 8)
		      >> aClass182_Sub1_9844.anInt9243);
	return aClass352_9843.method6178(class525_sub16_sub17, i_398_, i_399_);
    }
    
    public void method2614(Class525_Sub21 class525_sub21, int[] is) {
	aClass709_9853.method14345(new Class525_Sub3(aClass182_Sub1_9844, this,
						     class525_sub21, is),
				   (byte) 0);
    }
    
    Class161_Sub3(Class182_Sub1 class182_sub1, int i, int i_400_, int i_401_,
		  int i_402_, int[][] is, int[][] is_403_, int i_404_) {
	super(i_401_, i_402_, i_404_, is);
	aClass709_9853 = new Class709();
	anIntArray9880 = new int[1];
	anIntArray9883 = new int[1];
	anIntArray9868 = new int[1];
	aClass182_Sub1_9844 = class182_sub1;
	anInt9845 = anInt1763 * -2063427645 - 2;
	anInt9846 = 1 << anInt9845;
	anInt9847 = i;
	anInt9856 = i_400_;
	anIntArrayArrayArray9859 = new int[i_401_][i_402_][];
	aClass525_Sub1ArrayArrayArray9854
	    = new Class525_Sub1[i_401_][i_402_][];
	anIntArrayArrayArray9848 = new int[i_401_][i_402_][];
	anIntArrayArrayArray9858 = new int[i_401_][i_402_][];
	anIntArrayArrayArray9855 = new int[i_401_][i_402_][];
	anIntArrayArrayArray9857 = new int[i_401_][i_402_][];
	aShortArrayArray9851 = new short[i_401_ * i_402_][];
	aByteArrayArray9861 = new byte[i_401_][i_402_];
	aByteArrayArray9862 = new byte[i_401_ + 1][i_402_ + 1];
	aFloatArrayArray9871 = (new float[anInt1759 * 363736815 + 1]
				[anInt1760 * -1152334393 + 1]);
	aFloatArrayArray9872 = (new float[anInt1759 * 363736815 + 1]
				[anInt1760 * -1152334393 + 1]);
	aFloatArrayArray9873 = (new float[anInt1759 * 363736815 + 1]
				[anInt1760 * -1152334393 + 1]);
	for (int i_405_ = 0; i_405_ <= anInt1760 * -1152334393; i_405_++) {
	    for (int i_406_ = 0; i_406_ <= anInt1759 * 363736815; i_406_++) {
		int i_407_ = anIntArrayArray1762[i_406_][i_405_];
		if ((float) i_407_ < aFloat9852)
		    aFloat9852 = (float) i_407_;
		if ((float) i_407_ > aFloat9882)
		    aFloat9882 = (float) i_407_;
		if (i_406_ > 0 && i_405_ > 0 && i_406_ < anInt1759 * 363736815
		    && i_405_ < anInt1760 * -1152334393) {
		    int i_408_ = (is_403_[i_406_ + 1][i_405_]
				  - is_403_[i_406_ - 1][i_405_]);
		    int i_409_ = (is_403_[i_406_][i_405_ + 1]
				  - is_403_[i_406_][i_405_ - 1]);
		    float f
			= (float) (1.0
				   / Math.sqrt((double) (i_408_ * i_408_
							 + 4 * i_404_ * i_404_
							 + i_409_ * i_409_)));
		    aFloatArrayArray9871[i_406_][i_405_] = (float) i_408_ * f;
		    aFloatArrayArray9872[i_406_][i_405_]
			= (float) (-i_404_ * 2) * f;
		    aFloatArrayArray9873[i_406_][i_405_] = (float) i_409_ * f;
		}
	    }
	}
	aFloat9852--;
	aFloat9882++;
	aClass10_9874 = new Class10(128);
	if ((anInt9856 & 0x10) != 0)
	    aClass352_9843 = new Class352(aClass182_Sub1_9844, this);
    }
    
    void method15577(int i, int i_410_, byte[][] is,
		     Class525_Sub1[] class525_sub1s, Class10 class10,
		     Class525_Sub1[] class525_sub1s_411_) {
	if (anIntArrayArrayArray9855[i][i_410_] != null) {
	    Class525_Sub1[] class525_sub1s_412_
		= aClass525_Sub1ArrayArrayArray9854[i][i_410_];
	    int[] is_413_ = anIntArrayArrayArray9848[i][i_410_];
	    int[] is_414_ = anIntArrayArrayArray9858[i][i_410_];
	    int[] is_415_ = anIntArrayArrayArray9857[i][i_410_];
	    int[] is_416_ = anIntArrayArrayArray9855[i][i_410_];
	    int[] is_417_ = (anIntArrayArrayArray9859 != null
			     ? anIntArrayArrayArray9859[i][i_410_] : null);
	    int[] is_418_ = (anIntArrayArrayArray9860 != null
			     ? anIntArrayArrayArray9860[i][i_410_] : null);
	    if (is_415_ == null)
		is_415_ = is_416_;
	    float f = aFloatArrayArray9871[i][i_410_];
	    float f_419_ = aFloatArrayArray9872[i][i_410_];
	    float f_420_ = aFloatArrayArray9873[i][i_410_];
	    float f_421_ = aFloatArrayArray9871[i][i_410_ + 1];
	    float f_422_ = aFloatArrayArray9872[i][i_410_ + 1];
	    float f_423_ = aFloatArrayArray9873[i][i_410_ + 1];
	    float f_424_ = aFloatArrayArray9871[i + 1][i_410_ + 1];
	    float f_425_ = aFloatArrayArray9872[i + 1][i_410_ + 1];
	    float f_426_ = aFloatArrayArray9873[i + 1][i_410_ + 1];
	    float f_427_ = aFloatArrayArray9871[i + 1][i_410_];
	    float f_428_ = aFloatArrayArray9872[i + 1][i_410_];
	    float f_429_ = aFloatArrayArray9873[i + 1][i_410_];
	    int i_430_ = is[i][i_410_] & 0xff;
	    int i_431_ = is[i][i_410_ + 1] & 0xff;
	    int i_432_ = is[i + 1][i_410_ + 1] & 0xff;
	    int i_433_ = is[i + 1][i_410_] & 0xff;
	    int i_434_ = 0;
	while_46_:
	    for (int i_435_ = 0; i_435_ < is_416_.length; i_435_++) {
		Class525_Sub1 class525_sub1 = class525_sub1s_412_[i_435_];
		for (int i_436_ = 0; i_436_ < i_434_; i_436_++) {
		    if (class525_sub1s[i_436_] == class525_sub1)
			continue while_46_;
		}
		class525_sub1s[i_434_++] = class525_sub1;
	    }
	    short[] is_437_
		= (aShortArrayArray9851[i_410_ * (anInt1759 * 363736815) + i]
		   = new short[is_416_.length]);
	    for (int i_438_ = 0; i_438_ < is_416_.length; i_438_++) {
		int i_439_ = (i << anInt1763 * -2063427645) + is_413_[i_438_];
		int i_440_
		    = (i_410_ << anInt1763 * -2063427645) + is_414_[i_438_];
		int i_441_ = i_439_ >> anInt9845;
		int i_442_ = i_440_ >> anInt9845;
		int i_443_ = is_416_[i_438_];
		int i_444_ = is_415_[i_438_];
		int i_445_ = is_417_ != null ? is_417_[i_438_] : 0;
		long l = ((long) i_444_ << 48 | (long) i_443_ << 32
			  | (long) (i_441_ << 16) | (long) i_442_);
		int i_446_ = is_413_[i_438_];
		int i_447_ = is_414_[i_438_];
		int i_448_ = 74;
		int i_449_ = 0;
		float f_450_ = 1.0F;
		float f_451_;
		float f_452_;
		float f_453_;
		if (i_446_ == 0 && i_447_ == 0) {
		    f_451_ = f;
		    f_452_ = f_419_;
		    f_453_ = f_420_;
		    i_448_ -= i_430_;
		} else if (i_446_ == 0 && i_447_ == anInt1761 * 435863595) {
		    f_451_ = f_421_;
		    f_452_ = f_422_;
		    f_453_ = f_423_;
		    i_448_ -= i_431_;
		} else if (i_446_ == anInt1761 * 435863595
			   && i_447_ == anInt1761 * 435863595) {
		    f_451_ = f_424_;
		    f_452_ = f_425_;
		    f_453_ = f_426_;
		    i_448_ -= i_432_;
		} else if (i_446_ == anInt1761 * 435863595 && i_447_ == 0) {
		    f_451_ = f_427_;
		    f_452_ = f_428_;
		    f_453_ = f_429_;
		    i_448_ -= i_433_;
		} else {
		    float f_454_
			= (float) i_446_ / (float) (anInt1761 * 435863595);
		    float f_455_
			= (float) i_447_ / (float) (anInt1761 * 435863595);
		    float f_456_ = f + (f_427_ - f) * f_454_;
		    float f_457_ = f_419_ + (f_428_ - f_419_) * f_454_;
		    float f_458_ = f_420_ + (f_429_ - f_420_) * f_454_;
		    float f_459_ = f_421_ + (f_424_ - f_421_) * f_454_;
		    float f_460_ = f_422_ + (f_425_ - f_422_) * f_454_;
		    float f_461_ = f_423_ + (f_426_ - f_423_) * f_454_;
		    f_451_ = f_456_ + (f_459_ - f_456_) * f_455_;
		    f_452_ = f_457_ + (f_460_ - f_457_) * f_455_;
		    f_453_ = f_458_ + (f_461_ - f_458_) * f_455_;
		    int i_462_ = i_430_ + ((i_433_ - i_430_) * i_446_
					   >> anInt1763 * -2063427645);
		    int i_463_ = i_431_ + ((i_432_ - i_431_) * i_446_
					   >> anInt1763 * -2063427645);
		    i_448_ -= i_462_ + ((i_463_ - i_462_) * i_447_
					>> anInt1763 * -2063427645);
		}
		if (i_443_ != -1) {
		    int i_464_ = (i_443_ & 0x7f) * i_448_ >> 7;
		    if (i_464_ < 2)
			i_464_ = 2;
		    else if (i_464_ > 126)
			i_464_ = 126;
		    i_449_ = Class639.anIntArray8319[i_443_ & 0xff80 | i_464_];
		    if ((anInt9856 & 0x7) == 0) {
			f_450_
			    = (aClass182_Sub1_9844.aFloatArray9228[0] * f_451_
			       + (aClass182_Sub1_9844.aFloatArray9228[1]
				  * f_452_)
			       + (aClass182_Sub1_9844.aFloatArray9228[2]
				  * f_453_));
			f_450_
			    = (aClass182_Sub1_9844.aFloat9169
			       + f_450_ * (f_450_ > 0.0F
					   ? aClass182_Sub1_9844.aFloat9152
					   : aClass182_Sub1_9844.aFloat9238));
		    }
		}
		Class525 class525 = null;
		if ((i_439_ & anInt9846 - 1) == 0
		    && (i_440_ & anInt9846 - 1) == 0)
		    class525 = class10.method684(l);
		int i_465_;
		if (class525 == null) {
		    int i_466_;
		    if (i_444_ != i_443_) {
			int i_467_ = (i_444_ & 0x7f) * i_448_ >> 7;
			if (i_467_ < 2)
			    i_467_ = 2;
			else if (i_467_ > 126)
			    i_467_ = 126;
			i_466_ = (Class639.anIntArray8319
				  [i_444_ & 0xff80 | i_467_]);
			if ((anInt9856 & 0x7) == 0) {
			    float f_468_
				= ((aClass182_Sub1_9844.aFloatArray9228[0]
				    * f_451_)
				   + (aClass182_Sub1_9844.aFloatArray9228[1]
				      * f_452_)
				   + (aClass182_Sub1_9844.aFloatArray9228[2]
				      * f_453_));
			    f_468_
				= (aClass182_Sub1_9844.aFloat9169
				   + (f_450_
				      * (f_450_ > 0.0F
					 ? aClass182_Sub1_9844.aFloat9152
					 : aClass182_Sub1_9844.aFloat9238)));
			    int i_469_ = i_466_ >> 16 & 0xff;
			    int i_470_ = i_466_ >> 8 & 0xff;
			    int i_471_ = i_466_ & 0xff;
			    i_469_ *= f_468_;
			    if (i_469_ < 0)
				i_469_ = 0;
			    else if (i_469_ > 255)
				i_469_ = 255;
			    i_470_ *= f_468_;
			    if (i_470_ < 0)
				i_470_ = 0;
			    else if (i_470_ > 255)
				i_470_ = 255;
			    i_471_ *= f_468_;
			    if (i_471_ < 0)
				i_471_ = 0;
			    else if (i_471_ > 255)
				i_471_ = 255;
			    i_466_ = i_469_ << 16 | i_470_ << 8 | i_471_;
			}
		    } else
			i_466_ = i_449_;
		    aByteBuffer9878.putFloat((float) i_439_);
		    aByteBuffer9878.putFloat((float) (method2619(i_439_,
								 i_440_,
								 -608190368)
						      + i_445_));
		    aByteBuffer9878.putFloat((float) i_440_);
		    aByteBuffer9878.putFloat((float) i_439_);
		    aByteBuffer9878.putFloat((float) i_440_);
		    if (anIntArrayArrayArray9860 != null)
			aByteBuffer9878.putFloat(is_418_ != null
						 ? (float) (is_418_[i_438_]
							    - 1)
						 : 0.0F);
		    if ((anInt9856 & 0x7) != 0) {
			aByteBuffer9878.putFloat(f_451_);
			aByteBuffer9878.putFloat(f_452_);
			aByteBuffer9878.putFloat(f_453_);
		    }
		    if (aClass182_Sub1_9844.anInt9212 == 0) {
			int i_472_ = i_466_ & ~0xff00ff;
			i_472_ |= (i_466_ & 0xff0000) >> 16;
			i_472_ |= (i_466_ & 0xff) << 16;
			i_466_ = i_472_;
		    }
		    aByteBuffer9877.putInt(~0xffffff | i_466_);
		    i_465_ = anInt9849++;
		    is_437_[i_438_] = (short) i_465_;
		    if (i_443_ != -1)
			class525_sub1s_411_[i_465_]
			    = class525_sub1s_412_[i_438_];
		    class10.method695(new Class525_Sub20(is_437_[i_438_]), l);
		} else {
		    is_437_[i_438_] = ((Class525_Sub20) class525).aShort10573;
		    i_465_ = is_437_[i_438_] & 0xffff;
		    if (i_443_ != -1
			&& ((class525_sub1s_412_[i_438_].aLong7113
			     * -5126207504388691097L)
			    < (class525_sub1s_411_[i_465_].aLong7113
			       * -5126207504388691097L)))
			class525_sub1s_411_[i_465_]
			    = class525_sub1s_412_[i_438_];
		}
		for (int i_473_ = 0; i_473_ < i_434_; i_473_++)
		    class525_sub1s[i_473_].method16059(i_465_, i_449_, i_448_,
						       f_450_);
		anInt9850++;
	    }
	}
    }
    
    public void method2582(int i, int i_474_, int[] is, int[] is_475_,
			   int[] is_476_, int[] is_477_, int[] is_478_,
			   int[] is_479_, int[] is_480_, int[] is_481_,
			   Class176 class176, boolean bool) {
	Class180 class180 = aClass182_Sub1_9844.aClass180_1944;
	if (is_477_ != null && anIntArrayArrayArray9860 == null)
	    anIntArrayArrayArray9860
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	if (is_475_ != null && anIntArrayArrayArray9859 == null)
	    anIntArrayArrayArray9859
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	anIntArrayArrayArray9848[i][i_474_] = is;
	anIntArrayArrayArray9858[i][i_474_] = is_476_;
	anIntArrayArrayArray9855[i][i_474_] = is_478_;
	anIntArrayArrayArray9857[i][i_474_] = is_479_;
	if (anIntArrayArrayArray9860 != null)
	    anIntArrayArrayArray9860[i][i_474_] = is_477_;
	if (anIntArrayArrayArray9859 != null)
	    anIntArrayArrayArray9859[i][i_474_] = is_475_;
	Class525_Sub1[] class525_sub1s
	    = (aClass525_Sub1ArrayArrayArray9854[i][i_474_]
	       = new Class525_Sub1[is_478_.length]);
	for (int i_482_ = 0; i_482_ < is_478_.length; i_482_++) {
	    int i_483_ = is_480_[i_482_];
	    int i_484_ = is_481_[i_482_];
	    if ((anInt9856 & 0x20) != 0 && i_483_ != -1
		&& class180.method3116(i_483_, -1431554601).aBool1819) {
		i_484_ = 128;
		i_483_ = -1;
	    }
	    long l = ((long) (class176.anInt1883 * -2134548585) << 48
		      | (long) (class176.anInt1879 * -734182087) << 42
		      | (long) (class176.anInt1877 * 2141545647) << 28
		      | (long) (i_484_ << 14) | (long) i_483_);
	    Class525 class525;
	    for (class525 = aClass10_9874.method684(l); class525 != null;
		 class525 = aClass10_9874.method696(-2057538770)) {
		Class525_Sub1 class525_sub1 = (Class525_Sub1) class525;
		if (class525_sub1.anInt10398 == i_483_
		    && class525_sub1.aFloat10408 == (float) i_484_
		    && class525_sub1.aClass176_10400.method2902(class176,
								(short) 1023))
		    break;
	    }
	    if (class525 == null) {
		class525_sub1s[i_482_]
		    = new Class525_Sub1(this, i_483_, i_484_, class176);
		aClass10_9874.method695(class525_sub1s[i_482_], l);
	    } else
		class525_sub1s[i_482_] = (Class525_Sub1) class525;
	}
	if (bool)
	    aByteArrayArray9861[i][i_474_] |= 0x1;
	if (is_478_.length > anInt9869)
	    anInt9869 = is_478_.length;
	anInt9864 += is_478_.length;
    }
    
    public void method2618(int i, int i_485_, int[] is, int[] is_486_,
			   int[] is_487_, int[] is_488_, int[] is_489_,
			   int[] is_490_, int[] is_491_, int[] is_492_,
			   Class176 class176, boolean bool) {
	Class180 class180 = aClass182_Sub1_9844.aClass180_1944;
	if (is_488_ != null && anIntArrayArrayArray9860 == null)
	    anIntArrayArrayArray9860
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	if (is_486_ != null && anIntArrayArrayArray9859 == null)
	    anIntArrayArrayArray9859
		= new int[anInt1759 * 363736815][anInt1760 * -1152334393][];
	anIntArrayArrayArray9848[i][i_485_] = is;
	anIntArrayArrayArray9858[i][i_485_] = is_487_;
	anIntArrayArrayArray9855[i][i_485_] = is_489_;
	anIntArrayArrayArray9857[i][i_485_] = is_490_;
	if (anIntArrayArrayArray9860 != null)
	    anIntArrayArrayArray9860[i][i_485_] = is_488_;
	if (anIntArrayArrayArray9859 != null)
	    anIntArrayArrayArray9859[i][i_485_] = is_486_;
	Class525_Sub1[] class525_sub1s
	    = (aClass525_Sub1ArrayArrayArray9854[i][i_485_]
	       = new Class525_Sub1[is_489_.length]);
	for (int i_493_ = 0; i_493_ < is_489_.length; i_493_++) {
	    int i_494_ = is_491_[i_493_];
	    int i_495_ = is_492_[i_493_];
	    if ((anInt9856 & 0x20) != 0 && i_494_ != -1
		&& class180.method3116(i_494_, -1431554601).aBool1819) {
		i_495_ = 128;
		i_494_ = -1;
	    }
	    long l = ((long) (class176.anInt1883 * -2134548585) << 48
		      | (long) (class176.anInt1879 * -734182087) << 42
		      | (long) (class176.anInt1877 * 2141545647) << 28
		      | (long) (i_495_ << 14) | (long) i_494_);
	    Class525 class525;
	    for (class525 = aClass10_9874.method684(l); class525 != null;
		 class525 = aClass10_9874.method696(-2057538770)) {
		Class525_Sub1 class525_sub1 = (Class525_Sub1) class525;
		if (class525_sub1.anInt10398 == i_494_
		    && class525_sub1.aFloat10408 == (float) i_495_
		    && class525_sub1.aClass176_10400.method2902(class176,
								(short) 1023))
		    break;
	    }
	    if (class525 == null) {
		class525_sub1s[i_493_]
		    = new Class525_Sub1(this, i_494_, i_495_, class176);
		aClass10_9874.method695(class525_sub1s[i_493_], l);
	    } else
		class525_sub1s[i_493_] = (Class525_Sub1) class525;
	}
	if (bool)
	    aByteArrayArray9861[i][i_485_] |= 0x1;
	if (is_489_.length > anInt9869)
	    anInt9869 = is_489_.length;
	anInt9864 += is_489_.length;
    }
    
    void method15578() {
	if ((anInt9847 & 0x2) == 0) {
	    anIntArrayArrayArray9858 = null;
	    anIntArrayArrayArray9848 = null;
	    anIntArrayArrayArray9855 = null;
	}
	anIntArrayArrayArray9860 = null;
	anIntArrayArrayArray9857 = null;
	anIntArrayArrayArray9859 = null;
	aClass525_Sub1ArrayArrayArray9854 = null;
	aByteArrayArray9862 = null;
	aClass10_9874 = null;
	aClass525Array9875 = null;
	aFloatArrayArray9873 = null;
	aFloatArrayArray9872 = null;
	aFloatArrayArray9871 = null;
    }
    
    public void method2591(int i, int i_496_, int[] is, int[] is_497_,
			   int[] is_498_, int[] is_499_, int[] is_500_,
			   int[] is_501_, int[] is_502_, int[] is_503_,
			   int[] is_504_, int[] is_505_, int[] is_506_,
			   Class176 class176, boolean bool) {
	int i_507_ = is_503_.length;
	int[] is_508_ = new int[i_507_ * 3];
	int[] is_509_ = new int[i_507_ * 3];
	int[] is_510_ = new int[i_507_ * 3];
	int[] is_511_ = new int[i_507_ * 3];
	int[] is_512_ = new int[i_507_ * 3];
	int[] is_513_ = new int[i_507_ * 3];
	int[] is_514_ = is_497_ != null ? new int[i_507_ * 3] : null;
	int[] is_515_ = is_499_ != null ? new int[i_507_ * 3] : null;
	int i_516_ = 0;
	for (int i_517_ = 0; i_517_ < i_507_; i_517_++) {
	    int i_518_ = is_500_[i_517_];
	    int i_519_ = is_501_[i_517_];
	    int i_520_ = is_502_[i_517_];
	    is_508_[i_516_] = is[i_518_];
	    is_509_[i_516_] = is_498_[i_518_];
	    is_510_[i_516_] = is_503_[i_517_];
	    is_512_[i_516_] = is_505_[i_517_];
	    is_513_[i_516_] = is_506_[i_517_];
	    is_511_[i_516_]
		= is_504_ != null ? is_504_[i_517_] : is_503_[i_517_];
	    if (is_497_ != null)
		is_514_[i_516_] = is_497_[i_518_];
	    if (is_499_ != null)
		is_515_[i_516_] = is_499_[i_518_];
	    i_516_++;
	    is_508_[i_516_] = is[i_519_];
	    is_509_[i_516_] = is_498_[i_519_];
	    is_510_[i_516_] = is_503_[i_517_];
	    is_512_[i_516_] = is_505_[i_517_];
	    is_513_[i_516_] = is_506_[i_517_];
	    is_511_[i_516_]
		= is_504_ != null ? is_504_[i_517_] : is_503_[i_517_];
	    if (is_497_ != null)
		is_514_[i_516_] = is_497_[i_519_];
	    if (is_499_ != null)
		is_515_[i_516_] = is_499_[i_519_];
	    i_516_++;
	    is_508_[i_516_] = is[i_520_];
	    is_509_[i_516_] = is_498_[i_520_];
	    is_510_[i_516_] = is_503_[i_517_];
	    is_512_[i_516_] = is_505_[i_517_];
	    is_513_[i_516_] = is_506_[i_517_];
	    is_511_[i_516_]
		= is_504_ != null ? is_504_[i_517_] : is_503_[i_517_];
	    if (is_497_ != null)
		is_514_[i_516_] = is_497_[i_520_];
	    if (is_499_ != null)
		is_515_[i_516_] = is_499_[i_520_];
	    i_516_++;
	}
	method2576(i, i_496_, is_508_, is_514_, is_509_, is_515_, is_510_,
		   is_511_, is_512_, is_513_, class176, bool);
    }
    
    public void method2592(int i, int i_521_, int[] is, int[] is_522_,
			   int[] is_523_, int[] is_524_, int[] is_525_,
			   int[] is_526_, int[] is_527_, int[] is_528_,
			   int[] is_529_, int[] is_530_, int[] is_531_,
			   Class176 class176, boolean bool) {
	int i_532_ = is_528_.length;
	int[] is_533_ = new int[i_532_ * 3];
	int[] is_534_ = new int[i_532_ * 3];
	int[] is_535_ = new int[i_532_ * 3];
	int[] is_536_ = new int[i_532_ * 3];
	int[] is_537_ = new int[i_532_ * 3];
	int[] is_538_ = new int[i_532_ * 3];
	int[] is_539_ = is_522_ != null ? new int[i_532_ * 3] : null;
	int[] is_540_ = is_524_ != null ? new int[i_532_ * 3] : null;
	int i_541_ = 0;
	for (int i_542_ = 0; i_542_ < i_532_; i_542_++) {
	    int i_543_ = is_525_[i_542_];
	    int i_544_ = is_526_[i_542_];
	    int i_545_ = is_527_[i_542_];
	    is_533_[i_541_] = is[i_543_];
	    is_534_[i_541_] = is_523_[i_543_];
	    is_535_[i_541_] = is_528_[i_542_];
	    is_537_[i_541_] = is_530_[i_542_];
	    is_538_[i_541_] = is_531_[i_542_];
	    is_536_[i_541_]
		= is_529_ != null ? is_529_[i_542_] : is_528_[i_542_];
	    if (is_522_ != null)
		is_539_[i_541_] = is_522_[i_543_];
	    if (is_524_ != null)
		is_540_[i_541_] = is_524_[i_543_];
	    i_541_++;
	    is_533_[i_541_] = is[i_544_];
	    is_534_[i_541_] = is_523_[i_544_];
	    is_535_[i_541_] = is_528_[i_542_];
	    is_537_[i_541_] = is_530_[i_542_];
	    is_538_[i_541_] = is_531_[i_542_];
	    is_536_[i_541_]
		= is_529_ != null ? is_529_[i_542_] : is_528_[i_542_];
	    if (is_522_ != null)
		is_539_[i_541_] = is_522_[i_544_];
	    if (is_524_ != null)
		is_540_[i_541_] = is_524_[i_544_];
	    i_541_++;
	    is_533_[i_541_] = is[i_545_];
	    is_534_[i_541_] = is_523_[i_545_];
	    is_535_[i_541_] = is_528_[i_542_];
	    is_537_[i_541_] = is_530_[i_542_];
	    is_538_[i_541_] = is_531_[i_542_];
	    is_536_[i_541_]
		= is_529_ != null ? is_529_[i_542_] : is_528_[i_542_];
	    if (is_522_ != null)
		is_539_[i_541_] = is_522_[i_545_];
	    if (is_524_ != null)
		is_540_[i_541_] = is_524_[i_545_];
	    i_541_++;
	}
	method2576(i, i_521_, is_533_, is_539_, is_534_, is_540_, is_535_,
		   is_536_, is_537_, is_538_, class176, bool);
    }
    
    void method15579(Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2,
		     int i, int i_546_) {
	int[] is = anIntArrayArrayArray9848[i][i_546_];
	int[] is_547_ = anIntArrayArrayArray9858[i][i_546_];
	int i_548_ = is.length;
	if (anIntArray9880.length < i_548_) {
	    anIntArray9880 = new int[i_548_];
	    anIntArray9883 = new int[i_548_];
	}
	for (int i_549_ = 0; i_549_ < i_548_; i_549_++) {
	    anIntArray9880[i_549_]
		= is[i_549_] >> aClass182_Sub1_9844.anInt9243;
	    anIntArray9883[i_549_]
		= is_547_[i_549_] >> aClass182_Sub1_9844.anInt9243;
	}
	int i_550_ = 0;
	while (i_550_ < i_548_) {
	    int i_551_ = anIntArray9880[i_550_];
	    int i_552_ = anIntArray9883[i_550_++];
	    int i_553_ = anIntArray9880[i_550_];
	    int i_554_ = anIntArray9883[i_550_++];
	    int i_555_ = anIntArray9880[i_550_];
	    int i_556_ = anIntArray9883[i_550_++];
	    if (((i_551_ - i_553_) * (i_554_ - i_556_)
		 - (i_554_ - i_552_) * (i_555_ - i_553_))
		> 0)
		class525_sub16_sub17_sub2.method18890(i_552_, i_554_, i_556_,
						      i_551_, i_553_, i_555_);
	}
    }
}
