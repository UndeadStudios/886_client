/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class72
{
    static int anInt815;
    static Class200 aClass200_816 = new Class200(32);
    
    public static void method1525() {
	synchronized (aClass200_816) {
	    aClass200_816.method3791((byte) -48);
	}
    }
    
    public static Class179 method1526(Class182 class182, int i, int i_0_,
				      int i_1_, int i_2_, int i_3_,
				      Class179 class179, int i_4_, int i_5_,
				      int i_6_, int i_7_, Class689 class689) {
	if (class179 == null)
	    return null;
	int i_8_ = 2055;
	if (null != class689) {
	    i_8_ |= class689.method14033(41159990);
	    i_8_ &= ~0x200;
	}
	long l = (((long) i_5_ << 48)
		  + (((long) i_4_ << 32)
		     + (long) ((i_6_ << 16) + i_3_ + (i_7_ << 24))));
	Class179 class179_9_;
	synchronized (aClass200_816) {
	    class179_9_ = (Class179) aClass200_816.method3785(l);
	}
	if (class179_9_ == null
	    || class182.method3321(class179_9_.method2928(), i_8_) != 0) {
	    if (null != class179_9_)
		i_8_ = class182.method3229(i_8_, class179_9_.method2928());
	    int i_10_ = 3 * i_3_ + 6;
	    int i_11_ = 3;
	    int[] is = { 64, 96, 128 };
	    Class186 class186 = new Class186(i_11_ * i_10_ + 1,
					     i_10_ * i_11_ * 2 - i_10_, 0);
	    int i_12_ = class186.method3625(0, 0, 0);
	    int[][] is_13_ = new int[i_11_][i_10_];
	    for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
		int i_15_ = is[i_14_];
		int i_16_ = is[i_14_];
		for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
		    int i_18_ = (i_17_ << 14) / i_10_;
		    int i_19_ = Class436.anIntArray4831[i_18_] * i_15_ >> 14;
		    int i_20_ = i_16_ * Class436.anIntArray4838[i_18_] >> 14;
		    is_13_[i_14_][i_17_]
			= class186.method3625(i_19_, 0, i_20_);
		}
	    }
	    for (int i_21_ = 0; i_21_ < i_11_; i_21_++) {
		int i_22_ = (128 + 256 * i_21_) / i_11_;
		int i_23_ = 256 - i_22_;
		byte i_24_ = (byte) (i_22_ * i_7_ + i_23_ * i_6_ >> 8);
		short i_25_
		    = (short) ((((i_4_ & 0x7f) * i_23_ + (i_5_ & 0x7f) * i_22_
				 & 0x7f00)
				+ (((i_23_ * (i_4_ & 0x380)
				     + (i_5_ & 0x380) * i_22_)
				    & 0x38000)
				   + (((i_5_ & 0xfc00) * i_22_
				       + i_23_ * (i_4_ & 0xfc00))
				      & 0xfc0000)))
			       >> 8);
		for (int i_26_ = 0; i_26_ < i_10_; i_26_++) {
		    if (0 == i_21_)
			class186.method3626(i_12_,
					    is_13_[0][(1 + i_26_) % i_10_],
					    is_13_[0][i_26_], (byte) 1,
					    (byte) -1, i_25_, i_24_,
					    (short) -1);
		    else {
			class186.method3626(is_13_[i_21_ - 1][i_26_],
					    (is_13_[i_21_ - 1]
					     [(1 + i_26_) % i_10_]),
					    is_13_[i_21_][(i_26_ + 1) % i_10_],
					    (byte) 1, (byte) -1, i_25_, i_24_,
					    (short) -1);
			class186.method3626(is_13_[i_21_ - 1][i_26_],
					    is_13_[i_21_][(1 + i_26_) % i_10_],
					    is_13_[i_21_][i_26_], (byte) 1,
					    (byte) -1, i_25_, i_24_,
					    (short) -1);
		    }
		}
	    }
	    class179_9_ = class182.method3556(class186, i_8_,
					      -1099674713 * anInt815, 64, 768);
	    synchronized (aClass200_816) {
		aClass200_816.method3788(class179_9_, l);
	    }
	}
	int i_27_ = class179.method3001();
	int i_28_ = class179.method2959();
	int i_29_ = class179.method2962();
	int i_30_ = class179.method2963();
	if (class689 != null) {
	    class179_9_ = class179_9_.method2926((byte) 3, i_8_, true);
	    class179_9_.method2936(i_28_ - i_27_ >> 1, 128,
				   i_30_ - i_29_ >> 1);
	    class179_9_.method2934(i_27_ + i_28_ >> 1, 0, i_30_ + i_29_ >> 1);
	    class689.method14036(class179_9_, (byte) 95);
	} else {
	    class179_9_ = class179_9_.method2926((byte) 3, i_8_, true);
	    class179_9_.method2936(i_28_ - i_27_ >> 1, 128,
				   i_30_ - i_29_ >> 1);
	    class179_9_.method2934(i_28_ + i_27_ >> 1, 0, i_30_ + i_29_ >> 1);
	}
	if (i_0_ != 0)
	    class179_9_.method2932(i_0_);
	if (i_1_ != 0)
	    class179_9_.method2933(i_1_);
	if (i_2_ != 0)
	    class179_9_.method2934(0, i_2_, 0);
	return class179_9_;
    }
    
    Class72() throws Throwable {
	throw new Error();
    }
    
    public static Class179 method1527
	(Class182 class182, int i, int i_31_, int i_32_, int i_33_,
	 Class179 class179, short i_34_, byte i_35_, Class689 class689) {
	if (null == class179)
	    return null;
	int i_36_ = 2055;
	if (class689 != null) {
	    i_36_ |= class689.method14033(-769335429);
	    i_36_ &= ~0x200;
	}
	long l = (long) ((i_34_ & 0xffff) << 8 | i_35_);
	Class179 class179_37_;
	synchronized (aClass200_816) {
	    class179_37_ = (Class179) aClass200_816.method3785(l);
	}
	if (null == class179_37_
	    || class182.method3321(class179_37_.method2928(), i_36_) != 0) {
	    if (null != class179_37_)
		i_36_ = class182.method3229(i_36_, class179_37_.method2928());
	    Class186 class186 = new Class186(4, 2, 2);
	    int i_38_ = 128;
	    int[] is = new int[4];
	    is[0] = class186.method3625(-i_38_, 0, -i_38_);
	    is[1] = class186.method3625(i_38_, 0, -i_38_);
	    is[2] = class186.method3625(i_38_, 0, i_38_);
	    is[3] = class186.method3625(-i_38_, 0, i_38_);
	    class186.method3626(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_35_,
				i_34_);
	    class186.method3626(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_35_,
				i_34_);
	    class186.method3627((short) 1, (short) 2, (short) 0);
	    class186.method3627((short) 2, (short) 3, (short) 0);
	    class179_37_
		= class182.method3556(class186, i_36_, anInt815 * -1099674713,
				      64, 768);
	    synchronized (aClass200_816) {
		aClass200_816.method3788(class179_37_, l);
	    }
	}
	int i_39_ = class179.method3001();
	int i_40_ = class179.method2959();
	int i_41_ = class179.method2962();
	int i_42_ = class179.method2963();
	if (class689 != null) {
	    class179_37_ = class179_37_.method2926((byte) 3, i_36_, true);
	    class179_37_.method2936(i_40_ - i_39_ >> 1, 128,
				    i_42_ - i_41_ >> 1);
	    class179_37_.method2934(i_40_ + i_39_ >> 1, 0, i_41_ + i_42_ >> 1);
	    class689.method14036(class179_37_, (byte) 81);
	} else {
	    class179_37_ = class179_37_.method2926((byte) 3, i_36_, true);
	    class179_37_.method2936(i_40_ - i_39_ >> 1, 128,
				    i_42_ - i_41_ >> 1);
	    class179_37_.method2934(i_39_ + i_40_ >> 1, 0, i_41_ + i_42_ >> 1);
	}
	if (i_31_ != 0)
	    class179_37_.method2932(i_31_);
	if (0 != i_32_)
	    class179_37_.method2933(i_32_);
	if (i_33_ != 0)
	    class179_37_.method2934(0, i_33_, 0);
	return class179_37_;
    }
    
    static void method1528(int i) {
	synchronized (aClass200_816) {
	    aClass200_816.method3805(i, 1925206801);
	}
    }
    
    public static Class179 method1529
	(Class182 class182, int i, int i_43_, int i_44_, int i_45_,
	 Class179 class179, short i_46_, byte i_47_, Class689 class689) {
	if (null == class179)
	    return null;
	int i_48_ = 2055;
	if (class689 != null) {
	    i_48_ |= class689.method14033(720489808);
	    i_48_ &= ~0x200;
	}
	long l = (long) ((i_46_ & 0xffff) << 8 | i_47_);
	Class179 class179_49_;
	synchronized (aClass200_816) {
	    class179_49_ = (Class179) aClass200_816.method3785(l);
	}
	if (null == class179_49_
	    || class182.method3321(class179_49_.method2928(), i_48_) != 0) {
	    if (null != class179_49_)
		i_48_ = class182.method3229(i_48_, class179_49_.method2928());
	    Class186 class186 = new Class186(4, 2, 2);
	    int i_50_ = 128;
	    int[] is = new int[4];
	    is[0] = class186.method3625(-i_50_, 0, -i_50_);
	    is[1] = class186.method3625(i_50_, 0, -i_50_);
	    is[2] = class186.method3625(i_50_, 0, i_50_);
	    is[3] = class186.method3625(-i_50_, 0, i_50_);
	    class186.method3626(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_47_,
				i_46_);
	    class186.method3626(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_47_,
				i_46_);
	    class186.method3627((short) 1, (short) 2, (short) 0);
	    class186.method3627((short) 2, (short) 3, (short) 0);
	    class179_49_
		= class182.method3556(class186, i_48_, anInt815 * -1099674713,
				      64, 768);
	    synchronized (aClass200_816) {
		aClass200_816.method3788(class179_49_, l);
	    }
	}
	int i_51_ = class179.method3001();
	int i_52_ = class179.method2959();
	int i_53_ = class179.method2962();
	int i_54_ = class179.method2963();
	if (class689 != null) {
	    class179_49_ = class179_49_.method2926((byte) 3, i_48_, true);
	    class179_49_.method2936(i_52_ - i_51_ >> 1, 128,
				    i_54_ - i_53_ >> 1);
	    class179_49_.method2934(i_52_ + i_51_ >> 1, 0, i_53_ + i_54_ >> 1);
	    class689.method14036(class179_49_, (byte) 71);
	} else {
	    class179_49_ = class179_49_.method2926((byte) 3, i_48_, true);
	    class179_49_.method2936(i_52_ - i_51_ >> 1, 128,
				    i_54_ - i_53_ >> 1);
	    class179_49_.method2934(i_51_ + i_52_ >> 1, 0, i_53_ + i_54_ >> 1);
	}
	if (i_43_ != 0)
	    class179_49_.method2932(i_43_);
	if (0 != i_44_)
	    class179_49_.method2933(i_44_);
	if (i_45_ != 0)
	    class179_49_.method2934(0, i_45_, 0);
	return class179_49_;
    }
    
    static void method1530(int i) {
	anInt815 = -1667257321 * i;
	synchronized (aClass200_816) {
	    aClass200_816.method3791((byte) -64);
	}
    }
    
    public static void method1531() {
	synchronized (aClass200_816) {
	    aClass200_816.method3791((byte) 15);
	}
    }
    
    public static Class179 method1532
	(Class182 class182, int i, int i_55_, int i_56_, int i_57_, int i_58_,
	 Class179 class179, int i_59_, int i_60_, int i_61_, int i_62_,
	 Class689 class689) {
	if (class179 == null)
	    return null;
	int i_63_ = 2055;
	if (null != class689) {
	    i_63_ |= class689.method14033(-84628216);
	    i_63_ &= ~0x200;
	}
	long l = (((long) i_60_ << 48)
		  + (((long) i_59_ << 32)
		     + (long) ((i_61_ << 16) + i_58_ + (i_62_ << 24))));
	Class179 class179_64_;
	synchronized (aClass200_816) {
	    class179_64_ = (Class179) aClass200_816.method3785(l);
	}
	if (class179_64_ == null
	    || class182.method3321(class179_64_.method2928(), i_63_) != 0) {
	    if (null != class179_64_)
		i_63_ = class182.method3229(i_63_, class179_64_.method2928());
	    int i_65_ = 3 * i_58_ + 6;
	    int i_66_ = 3;
	    int[] is = { 64, 96, 128 };
	    Class186 class186 = new Class186(i_66_ * i_65_ + 1,
					     i_65_ * i_66_ * 2 - i_65_, 0);
	    int i_67_ = class186.method3625(0, 0, 0);
	    int[][] is_68_ = new int[i_66_][i_65_];
	    for (int i_69_ = 0; i_69_ < i_66_; i_69_++) {
		int i_70_ = is[i_69_];
		int i_71_ = is[i_69_];
		for (int i_72_ = 0; i_72_ < i_65_; i_72_++) {
		    int i_73_ = (i_72_ << 14) / i_65_;
		    int i_74_ = Class436.anIntArray4831[i_73_] * i_70_ >> 14;
		    int i_75_ = i_71_ * Class436.anIntArray4838[i_73_] >> 14;
		    is_68_[i_69_][i_72_]
			= class186.method3625(i_74_, 0, i_75_);
		}
	    }
	    for (int i_76_ = 0; i_76_ < i_66_; i_76_++) {
		int i_77_ = (128 + 256 * i_76_) / i_66_;
		int i_78_ = 256 - i_77_;
		byte i_79_ = (byte) (i_77_ * i_62_ + i_78_ * i_61_ >> 8);
		short i_80_ = (short) (((((i_59_ & 0x7f) * i_78_
					  + (i_60_ & 0x7f) * i_77_)
					 & 0x7f00)
					+ (((i_78_ * (i_59_ & 0x380)
					     + (i_60_ & 0x380) * i_77_)
					    & 0x38000)
					   + (((i_60_ & 0xfc00) * i_77_
					       + i_78_ * (i_59_ & 0xfc00))
					      & 0xfc0000)))
				       >> 8);
		for (int i_81_ = 0; i_81_ < i_65_; i_81_++) {
		    if (0 == i_76_)
			class186.method3626(i_67_,
					    is_68_[0][(1 + i_81_) % i_65_],
					    is_68_[0][i_81_], (byte) 1,
					    (byte) -1, i_80_, i_79_,
					    (short) -1);
		    else {
			class186.method3626(is_68_[i_76_ - 1][i_81_],
					    (is_68_[i_76_ - 1]
					     [(1 + i_81_) % i_65_]),
					    is_68_[i_76_][(i_81_ + 1) % i_65_],
					    (byte) 1, (byte) -1, i_80_, i_79_,
					    (short) -1);
			class186.method3626(is_68_[i_76_ - 1][i_81_],
					    is_68_[i_76_][(1 + i_81_) % i_65_],
					    is_68_[i_76_][i_81_], (byte) 1,
					    (byte) -1, i_80_, i_79_,
					    (short) -1);
		    }
		}
	    }
	    class179_64_
		= class182.method3556(class186, i_63_, -1099674713 * anInt815,
				      64, 768);
	    synchronized (aClass200_816) {
		aClass200_816.method3788(class179_64_, l);
	    }
	}
	int i_82_ = class179.method3001();
	int i_83_ = class179.method2959();
	int i_84_ = class179.method2962();
	int i_85_ = class179.method2963();
	if (class689 != null) {
	    class179_64_ = class179_64_.method2926((byte) 3, i_63_, true);
	    class179_64_.method2936(i_83_ - i_82_ >> 1, 128,
				    i_85_ - i_84_ >> 1);
	    class179_64_.method2934(i_82_ + i_83_ >> 1, 0, i_85_ + i_84_ >> 1);
	    class689.method14036(class179_64_, (byte) 82);
	} else {
	    class179_64_ = class179_64_.method2926((byte) 3, i_63_, true);
	    class179_64_.method2936(i_83_ - i_82_ >> 1, 128,
				    i_85_ - i_84_ >> 1);
	    class179_64_.method2934(i_83_ + i_82_ >> 1, 0, i_85_ + i_84_ >> 1);
	}
	if (i_55_ != 0)
	    class179_64_.method2932(i_55_);
	if (i_56_ != 0)
	    class179_64_.method2933(i_56_);
	if (i_57_ != 0)
	    class179_64_.method2934(0, i_57_, 0);
	return class179_64_;
    }
    
    public static Class179 method1533
	(Class182 class182, int i, int i_86_, int i_87_, int i_88_,
	 Class179 class179, short i_89_, byte i_90_, Class689 class689) {
	if (null == class179)
	    return null;
	int i_91_ = 2055;
	if (class689 != null) {
	    i_91_ |= class689.method14033(1438720292);
	    i_91_ &= ~0x200;
	}
	long l = (long) ((i_89_ & 0xffff) << 8 | i_90_);
	Class179 class179_92_;
	synchronized (aClass200_816) {
	    class179_92_ = (Class179) aClass200_816.method3785(l);
	}
	if (null == class179_92_
	    || class182.method3321(class179_92_.method2928(), i_91_) != 0) {
	    if (null != class179_92_)
		i_91_ = class182.method3229(i_91_, class179_92_.method2928());
	    Class186 class186 = new Class186(4, 2, 2);
	    int i_93_ = 128;
	    int[] is = new int[4];
	    is[0] = class186.method3625(-i_93_, 0, -i_93_);
	    is[1] = class186.method3625(i_93_, 0, -i_93_);
	    is[2] = class186.method3625(i_93_, 0, i_93_);
	    is[3] = class186.method3625(-i_93_, 0, i_93_);
	    class186.method3626(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_90_,
				i_89_);
	    class186.method3626(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_90_,
				i_89_);
	    class186.method3627((short) 1, (short) 2, (short) 0);
	    class186.method3627((short) 2, (short) 3, (short) 0);
	    class179_92_
		= class182.method3556(class186, i_91_, anInt815 * -1099674713,
				      64, 768);
	    synchronized (aClass200_816) {
		aClass200_816.method3788(class179_92_, l);
	    }
	}
	int i_94_ = class179.method3001();
	int i_95_ = class179.method2959();
	int i_96_ = class179.method2962();
	int i_97_ = class179.method2963();
	if (class689 != null) {
	    class179_92_ = class179_92_.method2926((byte) 3, i_91_, true);
	    class179_92_.method2936(i_95_ - i_94_ >> 1, 128,
				    i_97_ - i_96_ >> 1);
	    class179_92_.method2934(i_95_ + i_94_ >> 1, 0, i_96_ + i_97_ >> 1);
	    class689.method14036(class179_92_, (byte) 89);
	} else {
	    class179_92_ = class179_92_.method2926((byte) 3, i_91_, true);
	    class179_92_.method2936(i_95_ - i_94_ >> 1, 128,
				    i_97_ - i_96_ >> 1);
	    class179_92_.method2934(i_94_ + i_95_ >> 1, 0, i_96_ + i_97_ >> 1);
	}
	if (i_86_ != 0)
	    class179_92_.method2932(i_86_);
	if (0 != i_87_)
	    class179_92_.method2933(i_87_);
	if (i_88_ != 0)
	    class179_92_.method2934(0, i_88_, 0);
	return class179_92_;
    }
    
    static void method1534(int i) {
	synchronized (aClass200_816) {
	    aClass200_816.method3805(i, 1858208442);
	}
    }
    
    static void method1535() {
	synchronized (aClass200_816) {
	    aClass200_816.method3809((byte) 89);
	}
    }
    
    static final void method1536(Class683 class683, byte i) {
	int i_98_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class8 class8
	    = ((Class8)
	       Class313_Sub2.aClass40_Sub22_10106.method76(i_98_, 2084796149));
	int i_99_;
	if (class8.aBool90)
	    i_99_ = class8.anInt133 * 1829718155;
	else if (class8.aBool83)
	    i_99_ = Class525_Sub22_Sub1.aClass632_11646.anInt8218 * -444032243;
	else
	    i_99_
		= Class525_Sub22_Sub1.aClass632_11646.anInt8219 * -1672716229;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_99_;
    }
    
    public static boolean method1537(int i, byte i_100_) {
	return i == (i & -i);
    }
    
    static final void method1538(byte i) {
	Class232.aClass40_Sub18_2368.method1021((byte) 91);
	Class198_Sub17.aClass40_Sub14_9981.method1021((byte) 51);
	Class38.aClass40_Sub9_328.method1021((byte) 23);
	client.aClass507_11137.method8362((byte) -1).method1021((byte) -88);
	Class168_Sub1.aClass40_Sub7_9112.method1021((byte) 56);
	Class313_Sub2.aClass40_Sub22_10106.method1021((byte) 89);
	Class685.aClass40_Sub8_8691.method1021((byte) 72);
	Class574.aClass40_Sub20_7645.method1021((byte) -33);
	Class575.aClass40_Sub10_7647.method1021((byte) 60);
	Class109.aClass106_Sub1_Sub1_1323.method17965(-862143861);
	Class293.aClass106_Sub1_Sub2_3239.method17981(-1098631826);
	Class711.aClass106_Sub1_Sub2_8869.method17981(-1098631826);
	Class535.aClass106_Sub1_Sub2_7176.method17981(-1098631826);
	Class198_Sub20.aClass106_Sub1_Sub2_9998.method17981(-1098631826);
	Class234.aClass106_Sub1_Sub2_2373.method17981(-1098631826);
	Class227.aClass40_Sub1_2345.method1021((byte) 38);
	Class568.aClass40_Sub17_7627.method1021((byte) -30);
	Class698.aClass40_Sub2_8770.method1021((byte) 67);
	client.aClass40_Sub16_11201.method1021((byte) -58);
	Class658.aClass40_Sub3_8457.method1021((byte) -104);
	Class539.aClass40_Sub4_7181.method1021((byte) 38);
	client.aClass40_Sub21_11118.method1021((byte) -122);
	Class635.aClass40_Sub6_8274.method1021((byte) 77);
	Class83.aClass40_Sub12_852.method1021((byte) 115);
	Class566.aClass40_Sub5_7605.method1021((byte) -60);
	Class15.method765(149628505);
	Class697.method14207(1551893481);
	Class7.aClass404_53.method6584((byte) 10);
	Class521.method8697((byte) -122);
	Class274.method5090(-626325357);
	client.aClass200_11113.method3809((byte) 81);
	client.aClass200_11259.method3809((byte) 45);
	Class686.aClass200_8697.method3809((byte) 52);
	client.aClass200_11301.method3809((byte) 122);
	Class486.aClass40_5240.method1021((byte) -91);
	Class685.aClass40_8690.method1021((byte) 25);
	client.aClass200_11206.method3809((byte) 59);
    }
    
    static void method1539(int i, boolean bool, int i_101_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(23, (long) i);
	class525_sub16_sub10.method18361((byte) 80);
	class525_sub16_sub10.anInt11817 = (bool ? 1 : 0) * -1179952119;
    }
}
