/* Class515 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class515
{
    Class516[] aClass516Array5697;
    Class179 aClass179_5698;
    int anInt5699;
    Class516 aClass516_5700;
    Class516[] aClass516Array5701;
    static Textures aClass180_5702;
    int anInt5703;
    int anInt5704 = -1073271397;
    int anInt5705;
    int anInt5706;
    int anInt5707;
    Class157 aClass157_5708;
    Class590 aClass590_5709;
    int anInt5710;
    static final int anInt5711 = 512;
    boolean aBool5712 = true;
    int anInt5713;
    int anInt5714;
    int anInt5715;
    byte[] aByteArray5716;
    boolean aBool5717;
    Class515 aClass515_5718;
    int anInt5719;
    int anInt5720;
    int anInt5721;
    static int anInt5722;
    static int anInt5723;
    
    public static void method8555(JS5 class458, Textures class180,
                                  Interface24 interface24) {
	Class326.aClass458_3563 = class458;
	aClass180_5702 = class180;
	Class406.anInterface24_4168 = interface24;
    }
    
    public boolean method8556() {
	return aBool5717;
    }
    
    public void method8557(Class182 class182, int i, int i_0_, int i_1_,
			   int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
			   int i_7_, boolean bool, boolean bool_8_,
			   byte i_9_) {
	int i_10_ = 0;
	if (aBool5717)
	    i_10_ = -176742223 * anInt5719;
	if (null != aClass515_5718) {
	    Class515 class515_11_ = this;
	    Class515 class515_12_ = aClass515_5718;
	    if (class515_11_.hashCode() > class515_12_.hashCode()) {
		class515_11_ = aClass515_5718;
		class515_12_ = this;
		i_10_ = 255 - i_10_;
	    }
	    class515_11_.method8565(class182, i, i_0_, i_1_, i_2_, i_3_, i_4_,
				    i_5_, i_6_, i_7_, bool, bool_8_, i_10_,
				    -1519110761);
	    class515_12_.method8565(class182, i, i_0_, i_1_, i_2_, i_3_, i_4_,
				    i_5_, i_6_, i_7_, false, bool_8_,
				    255 - i_10_, -326563149);
	} else {
	    if (-1 == -982591737 * anInt5721)
		class182.method3151(i_0_, i_1_, i_2_, i_3_, ~0xffffff | i_7_,
				    0);
	    method8565(class182, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_,
		       i_7_, bool, bool_8_, i_10_, -2004472288);
	}
    }
    
    public void method8558(byte i) {
	aBool5717 = false;
	aClass515_5718 = null;
	anInt5719 = 0;
    }
    
    public boolean method8559(byte i) {
	return aBool5717;
    }
    
    public Class515 method8560(int i) {
	return aClass515_5718;
    }
    
    public boolean method8561(Class182 class182, int i, int i_13_, int i_14_) {
	if (317230957 * anInt5704 != i) {
	    anInt5704 = 1073271397 * i;
	    int i_15_ = Class696_Sub18.method17142(i, (byte) 88);
	    if (i_15_ > 512)
		i_15_ = 512;
	    if (i_15_ <= 0)
		i_15_ = 1;
	    if (i_15_ != anInt5699 * -674437475) {
		anInt5699 = i_15_ * -272052299;
		aClass157_5708 = null;
	    }
	    if (aClass516Array5701 != null) {
		anInt5703 = 0;
		int[] is = new int[aClass516Array5701.length];
		for (int i_16_ = 0; i_16_ < aClass516Array5701.length;
		     i_16_++) {
		    Class516 class516 = aClass516Array5701[i_16_];
		    if (class516.method8604(anInt5715 * 2128523837,
					    1530158221 * anInt5706,
					    -1030225505 * anInt5707,
					    317230957 * anInt5704)) {
			is[-101298837 * anInt5703] = class516.anInt5738;
			aClass516Array5697
			    [(anInt5703 += 1910994755) * -101298837 - 1]
			    = class516;
		    }
		}
		Class288.method5260(is, aClass516Array5697, 0,
				    -101298837 * anInt5703 - 1, (byte) 64);
	    }
	    aBool5712 = true;
	}
	boolean bool = false;
	if (aBool5712) {
	    aBool5712 = false;
	    for (int i_17_ = -101298837 * anInt5703 - 1; i_17_ >= 0; i_17_--) {
		boolean bool_18_
		    = aClass516Array5697[i_17_].method8605(class182,
							   aClass516_5700);
		Class515 class515_19_ = this;
		class515_19_.aBool5712 = class515_19_.aBool5712 | !bool_18_;
		bool |= bool_18_;
	    }
	}
	if (0 == i_13_ || !class182.method3143())
	    aClass179_5698 = null;
	else if (null == aClass179_5698 && anInt5705 * -1246538147 >= 0)
	    method8562(class182, -1646614517);
	if (aClass515_5718 != null && aClass515_5718 != this) {
	    aClass515_5718.method8558((byte) 57);
	    bool |= aClass515_5718.method8561(class182, i, i_13_, -1157953081);
	}
	return bool;
    }
    
    void method8562(Class182 class182, int i) {
	try {
	    boolean bool
		= Class326.aClass458_3563.method7558(-1246538147 * anInt5705,
						     (byte) 73);
	    if (bool) {
		class182.method3307(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		ModelDecoder class186
		    = ModelDecoder.method3644(Class326.aClass458_3563,
					  anInt5705 * -1246538147, 0);
		aClass179_5698
		    = class182.method3556(class186, 1099776, 0, 255, 1);
		byte[] is = aClass179_5698.method2970();
		if (null == is)
		    aByteArray5716 = null;
		else {
		    aByteArray5716 = new byte[is.length];
		    System.arraycopy(is, 0, aByteArray5716, 0, is.length);
		}
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method8563(Class182 class182, int i, int i_20_, int i_21_,
			   int i_22_, int i_23_, int i_24_, int i_25_,
			   int i_26_, int i_27_, int i_28_) {
	method8557(class182, i, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, 0,
		   i_27_, true, false, (byte) -10);
    }
    
    void method8564(Class182 class182, int i, int i_29_, int i_30_, int i_31_,
		    byte i_32_) {
	Class444 class444 = class182.method3491();
	Class444 class444_33_ = new Class444();
	class444_33_.method7137(0.0F, 0.0F, 0.0F);
	class444_33_.method7142(0.0F, -1.0F, 0.0F,
				Class436.method7071(-i_29_ & 0x3fff));
	class444_33_.method7142(-1.0F, 0.0F, 0.0F,
				Class436.method7071(-i & 0x3fff));
	class444_33_.method7142(0.0F, 0.0F, -1.0F,
				Class436.method7071(-i_30_ & 0x3fff));
	class182.method3233(class444_33_);
	Class444 class444_34_ = new Class444();
	if (anInt5720 * -766844989 != i_31_) {
	    aClass179_5698.method2972((byte) i_31_, aByteArray5716);
	    anInt5720 = 1052215531 * i_31_;
	}
	aClass179_5698.method2953(class444_34_, null, 0);
	class182.method3233(class444);
    }
    
    void method8565(Class182 class182, int i, int i_35_, int i_36_, int i_37_,
		    int i_38_, int i_39_, int i_40_, int i_41_, int i_42_,
		    boolean bool, boolean bool_43_, int i_44_, int i_45_) {
	int i_46_ = 255 - i_44_;
	class182.method3218();
	class182.method3219();
	if (null == aClass179_5698) {
	    class182.method3188(2, 0);
	    i_40_ = i_40_ + i & 0x3fff;
	    if (-982591737 * anInt5721 != -1 && 0 != anInt5699 * -674437475) {
		TextureMetrics class166
		    = aClass180_5702.method3116(-982591737 * anInt5721,
						-1431554601);
		if (null == aClass157_5708
		    && (Class406.anInterface24_4168.method130
			(Class593.aClass593_7831,
			 class166.anInt1800 * 261926313,
			 (class166.aClass597_1807 == Class597.aClass597_7841
			  ? Class594.aClass594_7833 : Class594.aClass594_7834),
			 0.7F, anInt5699 * -674437475, anInt5699 * -674437475,
			 false, (byte) 85))) {
		    int[] is
			= (class166.aClass597_1807 == Class597.aClass597_7841
			   ? (Class406.anInterface24_4168.method132
			      (Class593.aClass593_7831,
			       class166.anInt1800 * 261926313, 0.7F,
			       anInt5699 * -674437475, -674437475 * anInt5699,
			       false, -251888325))
			   : (Class406.anInterface24_4168.method129
			      (Class593.aClass593_7831,
			       class166.anInt1800 * 261926313, 0.7F,
			       -674437475 * anInt5699, -674437475 * anInt5699,
			       false, -1318130143)));
		    anInt5710 = -719838545 * is[0];
		    anInt5714 = is[is.length - 1] * 1699023457;
		    aClass157_5708
			= class182.method3215(is, 0,
					      2082667437 * class166.bitLoad,
					      2082667437 * class166.bitLoad,
					      class166.bitLoad * 2082667437,
					      (byte) 1);
		}
		int i_47_
		    = (i_46_ == 255
		       ? (Class597.aClass597_7841 == class166.aClass597_1807
			  ? 1 : 0)
		       : 1);
		if (i_47_ == 1 && bool)
		    class182.method3151(i_35_, i_36_, i_37_, i_38_, i_42_, 0);
		if (aClass157_5708 != null) {
		    int i_48_ = i_39_ * i_38_ / -4096;
		    int i_49_;
		    for (i_49_ = (i_37_ - i_38_) / 2 + i_40_ * i_38_ / 4096;
			 i_49_ > i_38_; i_49_ -= i_38_) {
			/* empty */
		    }
		    for (/**/; i_49_ < 0; i_49_ += i_38_) {
			/* empty */
		    }
		    if (aClass590_5709 == Class590.aClass590_7812) {
			for (int i_50_ = i_49_ - i_38_; i_50_ < i_37_;
			     i_50_ += i_38_)
			    aClass157_5708.method2482(i_35_ + i_50_,
						      i_48_ + i_36_, i_38_,
						      i_38_, 0,
						      i_46_ << 24 | 0xffffff,
						      i_47_);
			if ((anInt5710 * -49646513 & ~0xffffff) != 0)
			    class182.method3190(0, 0, i_37_,
						1 + (i_36_ + i_48_),
						-49646513 * anInt5710,
						(byte) -1);
			if ((anInt5714 * -1255073375 & ~0xffffff) != 0)
			    class182.method3190(0, i_48_ + i_36_ + i_38_,
						i_37_,
						i_38_ - (i_38_
							 + (i_36_ + i_48_)),
						-1255073375 * anInt5714,
						(byte) -1);
		    } else {
			for (/**/; i_48_ > i_38_; i_48_ -= i_38_) {
			    /* empty */
			}
			for (/**/; i_48_ < 0; i_48_ += i_38_) {
			    /* empty */
			}
			for (int i_51_ = i_49_ - i_38_; i_51_ < i_37_;
			     i_51_ += i_38_) {
			    for (int i_52_ = i_48_ - i_38_; i_52_ < i_38_;
				 i_52_ += i_38_)
				aClass157_5708.method2482(i_35_ + i_51_,
							  i_36_ + i_52_, i_38_,
							  i_38_, 0,
							  (i_46_ << 24
							   | 0xffffff),
							  i_47_);
			}
		    }
		}
	    } else
		class182.method3151(i_35_, i_36_, i_37_, i_38_,
				    i_46_ << 24 | i_42_, bool ? 0 : 1);
	} else if (bool_43_) {
	    Class435 class435 = class182.method3237();
	    Class435 class435_53_ = class182.method3237();
	    class435.aFloatArray4830[2] = class435.aFloatArray4830[3];
	    class435.aFloatArray4830[6] = class435.aFloatArray4830[7];
	    class435.aFloatArray4830[10] = class435.aFloatArray4830[11];
	    class435.aFloatArray4830[14] = class435.aFloatArray4830[15];
	    class182.method3252(class435);
	    method8564(class182, i_39_, i_40_, i_41_, i_44_, (byte) -38);
	    class182.method3252(class435_53_);
	} else {
	    if (bool)
		class182.method3188(3, i_42_);
	    method8564(class182, i_39_, i_40_, i_41_, i_44_, (byte) -111);
	}
	for (int i_54_ = anInt5703 * -101298837 - 1; i_54_ >= 0; i_54_--)
	    aClass516Array5697[i_54_].method8606(class182, i_35_, i_36_, i_37_,
						 i_38_, i_39_, i_40_,
						 anInt5715 * 2128523837,
						 1530158221 * anInt5706,
						 anInt5707 * -1030225505,
						 i_46_);
	class182.method3188(2, 0);
	class182.method3161();
    }
    
    void method8566(Class182 class182, int i, int i_55_, int i_56_,
		    int i_57_) {
	Class444 class444 = class182.method3491();
	Class444 class444_58_ = new Class444();
	class444_58_.method7137(0.0F, 0.0F, 0.0F);
	class444_58_.method7142(0.0F, -1.0F, 0.0F,
				Class436.method7071(-i_55_ & 0x3fff));
	class444_58_.method7142(-1.0F, 0.0F, 0.0F,
				Class436.method7071(-i & 0x3fff));
	class444_58_.method7142(0.0F, 0.0F, -1.0F,
				Class436.method7071(-i_56_ & 0x3fff));
	class182.method3233(class444_58_);
	Class444 class444_59_ = new Class444();
	if (anInt5720 * -766844989 != i_57_) {
	    aClass179_5698.method2972((byte) i_57_, aByteArray5716);
	    anInt5720 = 1052215531 * i_57_;
	}
	aClass179_5698.method2953(class444_59_, null, 0);
	class182.method3233(class444);
    }
    
    public static void method8567(JS5 class458, Textures class180,
                                  Interface24 interface24) {
	Class326.aClass458_3563 = class458;
	aClass180_5702 = class180;
	Class406.anInterface24_4168 = interface24;
    }
    
    public static void method8568(JS5 class458, Textures class180,
                                  Interface24 interface24) {
	Class326.aClass458_3563 = class458;
	aClass180_5702 = class180;
	Class406.anInterface24_4168 = interface24;
    }
    
    public void method8569(int i, int i_60_, int i_61_) {
	if (aBool5717) {
	    /* empty */
	}
	anInt5719 = (i * (i_60_ - anInt5713 * 1487683661) / 255
		     + anInt5713 * 1487683661) * 1076045905;
    }
    
    public static void method8570(JS5 class458, Textures class180,
                                  Interface24 interface24) {
	Class326.aClass458_3563 = class458;
	aClass180_5702 = class180;
	Class406.anInterface24_4168 = interface24;
    }
    
    public static void method8571() {
	Class516.method8603();
    }
    
    public void method8572(int i, int i_62_) {
	if (aBool5717) {
	    /* empty */
	}
	anInt5719 = (i * (i_62_ - anInt5713 * 1487683661) / 255
		     + anInt5713 * 1487683661) * 1076045905;
    }
    
    public void method8573() {
	aBool5717 = false;
	aClass515_5718 = null;
	anInt5719 = 0;
    }
    
    void method8574(Class182 class182, int i, int i_63_, int i_64_,
		    int i_65_) {
	Class444 class444 = class182.method3491();
	Class444 class444_66_ = new Class444();
	class444_66_.method7137(0.0F, 0.0F, 0.0F);
	class444_66_.method7142(0.0F, -1.0F, 0.0F,
				Class436.method7071(-i_63_ & 0x3fff));
	class444_66_.method7142(-1.0F, 0.0F, 0.0F,
				Class436.method7071(-i & 0x3fff));
	class444_66_.method7142(0.0F, 0.0F, -1.0F,
				Class436.method7071(-i_64_ & 0x3fff));
	class182.method3233(class444_66_);
	Class444 class444_67_ = new Class444();
	if (anInt5720 * -766844989 != i_65_) {
	    aClass179_5698.method2972((byte) i_65_, aByteArray5716);
	    anInt5720 = 1052215531 * i_65_;
	}
	aClass179_5698.method2953(class444_67_, null, 0);
	class182.method3233(class444);
    }
    
    void method8575(Class182 class182) {
	try {
	    boolean bool
		= Class326.aClass458_3563.method7558(-1246538147 * anInt5705,
						     (byte) 120);
	    if (bool) {
		class182.method3307(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		ModelDecoder class186
		    = ModelDecoder.method3644(Class326.aClass458_3563,
					  anInt5705 * -1246538147, 0);
		aClass179_5698
		    = class182.method3556(class186, 1099776, 0, 255, 1);
		byte[] is = aClass179_5698.method2970();
		if (null == is)
		    aByteArray5716 = null;
		else {
		    aByteArray5716 = new byte[is.length];
		    System.arraycopy(is, 0, aByteArray5716, 0, is.length);
		}
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method8576(Class182 class182, int i, int i_68_, int i_69_,
			   int i_70_, int i_71_, int i_72_, int i_73_,
			   int i_74_, int i_75_, boolean bool,
			   boolean bool_76_) {
	int i_77_ = 0;
	if (aBool5717)
	    i_77_ = -176742223 * anInt5719;
	if (null != aClass515_5718) {
	    Class515 class515_78_ = this;
	    Class515 class515_79_ = aClass515_5718;
	    if (class515_78_.hashCode() > class515_79_.hashCode()) {
		class515_78_ = aClass515_5718;
		class515_79_ = this;
		i_77_ = 255 - i_77_;
	    }
	    class515_78_.method8565(class182, i, i_68_, i_69_, i_70_, i_71_,
				    i_72_, i_73_, i_74_, i_75_, bool, bool_76_,
				    i_77_, -229676873);
	    class515_79_.method8565(class182, i, i_68_, i_69_, i_70_, i_71_,
				    i_72_, i_73_, i_74_, i_75_, false,
				    bool_76_, 255 - i_77_, -38038882);
	} else {
	    if (-1 == -982591737 * anInt5721)
		class182.method3151(i_68_, i_69_, i_70_, i_71_,
				    ~0xffffff | i_75_, 0);
	    method8565(class182, i, i_68_, i_69_, i_70_, i_71_, i_72_, i_73_,
		       i_74_, i_75_, bool, bool_76_, i_77_, -1918402020);
	}
    }
    
    public void method8577(Class182 class182, int i, int i_80_, int i_81_,
			   int i_82_, int i_83_, int i_84_, int i_85_,
			   int i_86_, int i_87_) {
	method8557(class182, i, i_80_, i_81_, i_82_, i_83_, i_84_, i_85_, 0,
		   i_87_, true, false, (byte) 16);
    }
    
    public Class515 method8578() {
	return aClass515_5718;
    }
    
    public Class515 method8579() {
	return aClass515_5718;
    }
    
    public boolean method8580(Class182 class182, int i, int i_88_) {
	if (317230957 * anInt5704 != i) {
	    anInt5704 = 1073271397 * i;
	    int i_89_ = Class696_Sub18.method17142(i, (byte) 67);
	    if (i_89_ > 512)
		i_89_ = 512;
	    if (i_89_ <= 0)
		i_89_ = 1;
	    if (i_89_ != anInt5699 * -674437475) {
		anInt5699 = i_89_ * -272052299;
		aClass157_5708 = null;
	    }
	    if (aClass516Array5701 != null) {
		anInt5703 = 0;
		int[] is = new int[aClass516Array5701.length];
		for (int i_90_ = 0; i_90_ < aClass516Array5701.length;
		     i_90_++) {
		    Class516 class516 = aClass516Array5701[i_90_];
		    if (class516.method8604(anInt5715 * 2128523837,
					    1530158221 * anInt5706,
					    -1030225505 * anInt5707,
					    317230957 * anInt5704)) {
			is[-101298837 * anInt5703] = class516.anInt5738;
			aClass516Array5697
			    [(anInt5703 += 1910994755) * -101298837 - 1]
			    = class516;
		    }
		}
		Class288.method5260(is, aClass516Array5697, 0,
				    -101298837 * anInt5703 - 1, (byte) 9);
	    }
	    aBool5712 = true;
	}
	boolean bool = false;
	if (aBool5712) {
	    aBool5712 = false;
	    for (int i_91_ = -101298837 * anInt5703 - 1; i_91_ >= 0; i_91_--) {
		boolean bool_92_
		    = aClass516Array5697[i_91_].method8605(class182,
							   aClass516_5700);
		Class515 class515_93_ = this;
		class515_93_.aBool5712 = class515_93_.aBool5712 | !bool_92_;
		bool |= bool_92_;
	    }
	}
	if (0 == i_88_ || !class182.method3143())
	    aClass179_5698 = null;
	else if (null == aClass179_5698 && anInt5705 * -1246538147 >= 0)
	    method8562(class182, -1646614517);
	if (aClass515_5718 != null && aClass515_5718 != this) {
	    aClass515_5718.method8558((byte) 46);
	    bool |= aClass515_5718.method8561(class182, i, i_88_, 220098227);
	}
	return bool;
    }
    
    public boolean method8581(Class182 class182, int i, int i_94_) {
	if (317230957 * anInt5704 != i) {
	    anInt5704 = 1073271397 * i;
	    int i_95_ = Class696_Sub18.method17142(i, (byte) 114);
	    if (i_95_ > 512)
		i_95_ = 512;
	    if (i_95_ <= 0)
		i_95_ = 1;
	    if (i_95_ != anInt5699 * -674437475) {
		anInt5699 = i_95_ * -272052299;
		aClass157_5708 = null;
	    }
	    if (aClass516Array5701 != null) {
		anInt5703 = 0;
		int[] is = new int[aClass516Array5701.length];
		for (int i_96_ = 0; i_96_ < aClass516Array5701.length;
		     i_96_++) {
		    Class516 class516 = aClass516Array5701[i_96_];
		    if (class516.method8604(anInt5715 * 2128523837,
					    1530158221 * anInt5706,
					    -1030225505 * anInt5707,
					    317230957 * anInt5704)) {
			is[-101298837 * anInt5703] = class516.anInt5738;
			aClass516Array5697
			    [(anInt5703 += 1910994755) * -101298837 - 1]
			    = class516;
		    }
		}
		Class288.method5260(is, aClass516Array5697, 0,
				    -101298837 * anInt5703 - 1, (byte) 55);
	    }
	    aBool5712 = true;
	}
	boolean bool = false;
	if (aBool5712) {
	    aBool5712 = false;
	    for (int i_97_ = -101298837 * anInt5703 - 1; i_97_ >= 0; i_97_--) {
		boolean bool_98_
		    = aClass516Array5697[i_97_].method8605(class182,
							   aClass516_5700);
		Class515 class515_99_ = this;
		class515_99_.aBool5712 = class515_99_.aBool5712 | !bool_98_;
		bool |= bool_98_;
	    }
	}
	if (0 == i_94_ || !class182.method3143())
	    aClass179_5698 = null;
	else if (null == aClass179_5698 && anInt5705 * -1246538147 >= 0)
	    method8562(class182, -1646614517);
	if (aClass515_5718 != null && aClass515_5718 != this) {
	    aClass515_5718.method8558((byte) 70);
	    bool |= aClass515_5718.method8561(class182, i, i_94_, -630745982);
	}
	return bool;
    }
    
    public void method8582() {
	aBool5717 = false;
	aClass515_5718 = null;
	anInt5719 = 0;
    }
    
    void method8583(Class182 class182) {
	try {
	    boolean bool
		= Class326.aClass458_3563.method7558(-1246538147 * anInt5705,
						     (byte) 98);
	    if (bool) {
		class182.method3307(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		ModelDecoder class186
		    = ModelDecoder.method3644(Class326.aClass458_3563,
					  anInt5705 * -1246538147, 0);
		aClass179_5698
		    = class182.method3556(class186, 1099776, 0, 255, 1);
		byte[] is = aClass179_5698.method2970();
		if (null == is)
		    aByteArray5716 = null;
		else {
		    aByteArray5716 = new byte[is.length];
		    System.arraycopy(is, 0, aByteArray5716, 0, is.length);
		}
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method8584(Class182 class182, int i, int i_100_, int i_101_,
			   int i_102_, int i_103_, int i_104_, int i_105_,
			   int i_106_, int i_107_) {
	method8557(class182, i, i_100_, i_101_, i_102_, i_103_, i_104_, i_105_,
		   0, i_107_, true, false, (byte) 10);
    }
    
    public void method8585(Class182 class182, int i, int i_108_, int i_109_,
			   int i_110_, int i_111_, int i_112_, int i_113_,
			   int i_114_, int i_115_) {
	method8557(class182, i, i_108_, i_109_, i_110_, i_111_, i_112_, i_113_,
		   0, i_115_, true, false, (byte) 39);
    }
    
    public Class515(int i, Class516[] class516s, int i_116_, int i_117_,
		    int i_118_, int i_119_, Class590 class590, int i_120_) {
	anInt5715 = 422835477 * i_117_;
	anInt5706 = i_118_ * -1073297851;
	anInt5707 = -1207248289 * i_119_;
	anInt5721 = i * -640883017;
	aClass516Array5701 = class516s;
	aClass590_5709 = class590;
	if (null != class516s) {
	    aClass516Array5697 = new Class516[class516s.length];
	    aClass516_5700 = i_116_ >= 0 ? class516s[i_116_] : null;
	} else {
	    aClass516Array5697 = null;
	    aClass516_5700 = null;
	}
	anInt5705 = 921710069 * i_120_;
    }
    
    public void method8586(Class182 class182, int i, int i_121_, int i_122_,
			   int i_123_, int i_124_, int i_125_, int i_126_,
			   int i_127_, int i_128_, boolean bool,
			   boolean bool_129_) {
	int i_130_ = 0;
	if (aBool5717)
	    i_130_ = -176742223 * anInt5719;
	if (null != aClass515_5718) {
	    Class515 class515_131_ = this;
	    Class515 class515_132_ = aClass515_5718;
	    if (class515_131_.hashCode() > class515_132_.hashCode()) {
		class515_131_ = aClass515_5718;
		class515_132_ = this;
		i_130_ = 255 - i_130_;
	    }
	    class515_131_.method8565(class182, i, i_121_, i_122_, i_123_,
				     i_124_, i_125_, i_126_, i_127_, i_128_,
				     bool, bool_129_, i_130_, -346395161);
	    class515_132_.method8565(class182, i, i_121_, i_122_, i_123_,
				     i_124_, i_125_, i_126_, i_127_, i_128_,
				     false, bool_129_, 255 - i_130_,
				     -2051513111);
	} else {
	    if (-1 == -982591737 * anInt5721)
		class182.method3151(i_121_, i_122_, i_123_, i_124_,
				    ~0xffffff | i_128_, 0);
	    method8565(class182, i, i_121_, i_122_, i_123_, i_124_, i_125_,
		       i_126_, i_127_, i_128_, bool, bool_129_, i_130_,
		       -9316891);
	}
    }
    
    public void method8587(Class182 class182, int i, int i_133_, int i_134_,
			   int i_135_, int i_136_, int i_137_, int i_138_,
			   int i_139_, int i_140_, boolean bool,
			   boolean bool_141_) {
	int i_142_ = 0;
	if (aBool5717)
	    i_142_ = -176742223 * anInt5719;
	if (null != aClass515_5718) {
	    Class515 class515_143_ = this;
	    Class515 class515_144_ = aClass515_5718;
	    if (class515_143_.hashCode() > class515_144_.hashCode()) {
		class515_143_ = aClass515_5718;
		class515_144_ = this;
		i_142_ = 255 - i_142_;
	    }
	    class515_143_.method8565(class182, i, i_133_, i_134_, i_135_,
				     i_136_, i_137_, i_138_, i_139_, i_140_,
				     bool, bool_141_, i_142_, -2020813707);
	    class515_144_.method8565(class182, i, i_133_, i_134_, i_135_,
				     i_136_, i_137_, i_138_, i_139_, i_140_,
				     false, bool_141_, 255 - i_142_,
				     -1756235895);
	} else {
	    if (-1 == -982591737 * anInt5721)
		class182.method3151(i_133_, i_134_, i_135_, i_136_,
				    ~0xffffff | i_140_, 0);
	    method8565(class182, i, i_133_, i_134_, i_135_, i_136_, i_137_,
		       i_138_, i_139_, i_140_, bool, bool_141_, i_142_,
		       -364362525);
	}
    }
    
    public void method8588(int i, int i_145_) {
	if (aBool5717) {
	    /* empty */
	}
	anInt5719 = (i * (i_145_ - anInt5713 * 1487683661) / 255
		     + anInt5713 * 1487683661) * 1076045905;
    }
    
    void method8589(Class182 class182, int i, int i_146_, int i_147_,
		    int i_148_, int i_149_, int i_150_, int i_151_, int i_152_,
		    int i_153_, boolean bool, boolean bool_154_, int i_155_) {
	int i_156_ = 255 - i_155_;
	class182.method3218();
	class182.method3219();
	if (null == aClass179_5698) {
	    class182.method3188(2, 0);
	    i_151_ = i_151_ + i & 0x3fff;
	    if (-982591737 * anInt5721 != -1 && 0 != anInt5699 * -674437475) {
		TextureMetrics class166
		    = aClass180_5702.method3116(-982591737 * anInt5721,
						-1431554601);
		if (null == aClass157_5708
		    && (Class406.anInterface24_4168.method130
			(Class593.aClass593_7831,
			 class166.anInt1800 * 261926313,
			 (class166.aClass597_1807 == Class597.aClass597_7841
			  ? Class594.aClass594_7833 : Class594.aClass594_7834),
			 0.7F, anInt5699 * -674437475, anInt5699 * -674437475,
			 false, (byte) 110))) {
		    int[] is
			= (class166.aClass597_1807 == Class597.aClass597_7841
			   ? (Class406.anInterface24_4168.method132
			      (Class593.aClass593_7831,
			       class166.anInt1800 * 261926313, 0.7F,
			       anInt5699 * -674437475, -674437475 * anInt5699,
			       false, -2116280887))
			   : (Class406.anInterface24_4168.method129
			      (Class593.aClass593_7831,
			       class166.anInt1800 * 261926313, 0.7F,
			       -674437475 * anInt5699, -674437475 * anInt5699,
			       false, -1770748185)));
		    anInt5710 = -719838545 * is[0];
		    anInt5714 = is[is.length - 1] * 1699023457;
		    aClass157_5708
			= class182.method3215(is, 0,
					      2082667437 * class166.bitLoad,
					      2082667437 * class166.bitLoad,
					      class166.bitLoad * 2082667437,
					      (byte) 77);
		}
		int i_157_
		    = (i_156_ == 255
		       ? (Class597.aClass597_7841 == class166.aClass597_1807
			  ? 1 : 0)
		       : 1);
		if (i_157_ == 1 && bool)
		    class182.method3151(i_146_, i_147_, i_148_, i_149_, i_153_,
					0);
		if (aClass157_5708 != null) {
		    int i_158_ = i_150_ * i_149_ / -4096;
		    int i_159_;
		    for (i_159_
			     = (i_148_ - i_149_) / 2 + i_151_ * i_149_ / 4096;
			 i_159_ > i_149_; i_159_ -= i_149_) {
			/* empty */
		    }
		    for (/**/; i_159_ < 0; i_159_ += i_149_) {
			/* empty */
		    }
		    if (aClass590_5709 == Class590.aClass590_7812) {
			for (int i_160_ = i_159_ - i_149_; i_160_ < i_148_;
			     i_160_ += i_149_)
			    aClass157_5708.method2482(i_146_ + i_160_,
						      i_158_ + i_147_, i_149_,
						      i_149_, 0,
						      i_156_ << 24 | 0xffffff,
						      i_157_);
			if ((anInt5710 * -49646513 & ~0xffffff) != 0)
			    class182.method3190(0, 0, i_148_,
						1 + (i_147_ + i_158_),
						-49646513 * anInt5710,
						(byte) -1);
			if ((anInt5714 * -1255073375 & ~0xffffff) != 0)
			    class182.method3190(0, i_158_ + i_147_ + i_149_,
						i_148_,
						i_149_ - (i_149_
							  + (i_147_ + i_158_)),
						-1255073375 * anInt5714,
						(byte) -1);
		    } else {
			for (/**/; i_158_ > i_149_; i_158_ -= i_149_) {
			    /* empty */
			}
			for (/**/; i_158_ < 0; i_158_ += i_149_) {
			    /* empty */
			}
			for (int i_161_ = i_159_ - i_149_; i_161_ < i_148_;
			     i_161_ += i_149_) {
			    for (int i_162_ = i_158_ - i_149_; i_162_ < i_149_;
				 i_162_ += i_149_)
				aClass157_5708.method2482(i_146_ + i_161_,
							  i_147_ + i_162_,
							  i_149_, i_149_, 0,
							  (i_156_ << 24
							   | 0xffffff),
							  i_157_);
			}
		    }
		}
	    } else
		class182.method3151(i_146_, i_147_, i_148_, i_149_,
				    i_156_ << 24 | i_153_, bool ? 0 : 1);
	} else if (bool_154_) {
	    Class435 class435 = class182.method3237();
	    Class435 class435_163_ = class182.method3237();
	    class435.aFloatArray4830[2] = class435.aFloatArray4830[3];
	    class435.aFloatArray4830[6] = class435.aFloatArray4830[7];
	    class435.aFloatArray4830[10] = class435.aFloatArray4830[11];
	    class435.aFloatArray4830[14] = class435.aFloatArray4830[15];
	    class182.method3252(class435);
	    method8564(class182, i_150_, i_151_, i_152_, i_155_, (byte) -6);
	    class182.method3252(class435_163_);
	} else {
	    if (bool)
		class182.method3188(3, i_153_);
	    method8564(class182, i_150_, i_151_, i_152_, i_155_, (byte) -54);
	}
	for (int i_164_ = anInt5703 * -101298837 - 1; i_164_ >= 0; i_164_--)
	    aClass516Array5697[i_164_].method8606(class182, i_146_, i_147_,
						  i_148_, i_149_, i_150_,
						  i_151_,
						  anInt5715 * 2128523837,
						  1530158221 * anInt5706,
						  anInt5707 * -1030225505,
						  i_156_);
	class182.method3188(2, 0);
	class182.method3161();
    }
    
    void method8590(Class182 class182, int i, int i_165_, int i_166_,
		    int i_167_, int i_168_, int i_169_, int i_170_, int i_171_,
		    int i_172_, boolean bool, boolean bool_173_, int i_174_) {
	int i_175_ = 255 - i_174_;
	class182.method3218();
	class182.method3219();
	if (null == aClass179_5698) {
	    class182.method3188(2, 0);
	    i_170_ = i_170_ + i & 0x3fff;
	    if (-982591737 * anInt5721 != -1 && 0 != anInt5699 * -674437475) {
		TextureMetrics class166
		    = aClass180_5702.method3116(-982591737 * anInt5721,
						-1431554601);
		if (null == aClass157_5708
		    && (Class406.anInterface24_4168.method130
			(Class593.aClass593_7831,
			 class166.anInt1800 * 261926313,
			 (class166.aClass597_1807 == Class597.aClass597_7841
			  ? Class594.aClass594_7833 : Class594.aClass594_7834),
			 0.7F, anInt5699 * -674437475, anInt5699 * -674437475,
			 false, (byte) 68))) {
		    int[] is
			= (class166.aClass597_1807 == Class597.aClass597_7841
			   ? (Class406.anInterface24_4168.method132
			      (Class593.aClass593_7831,
			       class166.anInt1800 * 261926313, 0.7F,
			       anInt5699 * -674437475, -674437475 * anInt5699,
			       false, -1871085826))
			   : (Class406.anInterface24_4168.method129
			      (Class593.aClass593_7831,
			       class166.anInt1800 * 261926313, 0.7F,
			       -674437475 * anInt5699, -674437475 * anInt5699,
			       false, -1561708575)));
		    anInt5710 = -719838545 * is[0];
		    anInt5714 = is[is.length - 1] * 1699023457;
		    aClass157_5708
			= class182.method3215(is, 0,
					      2082667437 * class166.bitLoad,
					      2082667437 * class166.bitLoad,
					      class166.bitLoad * 2082667437,
					      (byte) 21);
		}
		int i_176_
		    = (i_175_ == 255
		       ? (Class597.aClass597_7841 == class166.aClass597_1807
			  ? 1 : 0)
		       : 1);
		if (i_176_ == 1 && bool)
		    class182.method3151(i_165_, i_166_, i_167_, i_168_, i_172_,
					0);
		if (aClass157_5708 != null) {
		    int i_177_ = i_169_ * i_168_ / -4096;
		    int i_178_;
		    for (i_178_
			     = (i_167_ - i_168_) / 2 + i_170_ * i_168_ / 4096;
			 i_178_ > i_168_; i_178_ -= i_168_) {
			/* empty */
		    }
		    for (/**/; i_178_ < 0; i_178_ += i_168_) {
			/* empty */
		    }
		    if (aClass590_5709 == Class590.aClass590_7812) {
			for (int i_179_ = i_178_ - i_168_; i_179_ < i_167_;
			     i_179_ += i_168_)
			    aClass157_5708.method2482(i_165_ + i_179_,
						      i_177_ + i_166_, i_168_,
						      i_168_, 0,
						      i_175_ << 24 | 0xffffff,
						      i_176_);
			if ((anInt5710 * -49646513 & ~0xffffff) != 0)
			    class182.method3190(0, 0, i_167_,
						1 + (i_166_ + i_177_),
						-49646513 * anInt5710,
						(byte) -1);
			if ((anInt5714 * -1255073375 & ~0xffffff) != 0)
			    class182.method3190(0, i_177_ + i_166_ + i_168_,
						i_167_,
						i_168_ - (i_168_
							  + (i_166_ + i_177_)),
						-1255073375 * anInt5714,
						(byte) -1);
		    } else {
			for (/**/; i_177_ > i_168_; i_177_ -= i_168_) {
			    /* empty */
			}
			for (/**/; i_177_ < 0; i_177_ += i_168_) {
			    /* empty */
			}
			for (int i_180_ = i_178_ - i_168_; i_180_ < i_167_;
			     i_180_ += i_168_) {
			    for (int i_181_ = i_177_ - i_168_; i_181_ < i_168_;
				 i_181_ += i_168_)
				aClass157_5708.method2482(i_165_ + i_180_,
							  i_166_ + i_181_,
							  i_168_, i_168_, 0,
							  (i_175_ << 24
							   | 0xffffff),
							  i_176_);
			}
		    }
		}
	    } else
		class182.method3151(i_165_, i_166_, i_167_, i_168_,
				    i_175_ << 24 | i_172_, bool ? 0 : 1);
	} else if (bool_173_) {
	    Class435 class435 = class182.method3237();
	    Class435 class435_182_ = class182.method3237();
	    class435.aFloatArray4830[2] = class435.aFloatArray4830[3];
	    class435.aFloatArray4830[6] = class435.aFloatArray4830[7];
	    class435.aFloatArray4830[10] = class435.aFloatArray4830[11];
	    class435.aFloatArray4830[14] = class435.aFloatArray4830[15];
	    class182.method3252(class435);
	    method8564(class182, i_169_, i_170_, i_171_, i_174_, (byte) -92);
	    class182.method3252(class435_182_);
	} else {
	    if (bool)
		class182.method3188(3, i_172_);
	    method8564(class182, i_169_, i_170_, i_171_, i_174_, (byte) -121);
	}
	for (int i_183_ = anInt5703 * -101298837 - 1; i_183_ >= 0; i_183_--)
	    aClass516Array5697[i_183_].method8606(class182, i_165_, i_166_,
						  i_167_, i_168_, i_169_,
						  i_170_,
						  anInt5715 * 2128523837,
						  1530158221 * anInt5706,
						  anInt5707 * -1030225505,
						  i_175_);
	class182.method3188(2, 0);
	class182.method3161();
    }
    
    public Class515 method8591() {
	return aClass515_5718;
    }
    
    void method8592(Class182 class182, int i, int i_184_, int i_185_,
		    int i_186_) {
	Class444 class444 = class182.method3491();
	Class444 class444_187_ = new Class444();
	class444_187_.method7137(0.0F, 0.0F, 0.0F);
	class444_187_.method7142(0.0F, -1.0F, 0.0F,
				 Class436.method7071(-i_184_ & 0x3fff));
	class444_187_.method7142(-1.0F, 0.0F, 0.0F,
				 Class436.method7071(-i & 0x3fff));
	class444_187_.method7142(0.0F, 0.0F, -1.0F,
				 Class436.method7071(-i_185_ & 0x3fff));
	class182.method3233(class444_187_);
	Class444 class444_188_ = new Class444();
	if (anInt5720 * -766844989 != i_186_) {
	    aClass179_5698.method2972((byte) i_186_, aByteArray5716);
	    anInt5720 = 1052215531 * i_186_;
	}
	aClass179_5698.method2953(class444_188_, null, 0);
	class182.method3233(class444);
    }
    
    public void method8593(Class515 class515_189_, byte i) {
	if (aBool5717)
	    anInt5713 = -1675136011 * anInt5719;
	else if (class515_189_ != null && class515_189_.aBool5717)
	    anInt5713 = 1809812603 - class515_189_.anInt5719 * -1675136011;
	else
	    anInt5713 = 0;
	aBool5717 = true;
	aClass515_5718 = class515_189_;
	anInt5719 = 0;
    }
    
    static void method8594(int i) {
	try {
	    File file = new File(Class199.aString2194, "random.dat");
	    if (file.exists())
		Class503.aClass37_5568
		    = new Class37(new Class42(file, "rw", 25L), 24, 0);
	    else {
	    while_0_:
		for (int i_190_ = 0;
		     i_190_ < Class696_Sub29.aStringArray10958.length;
		     i_190_++) {
		    for (int i_191_ = 0;
			 i_191_ < Class168_Sub1.aStringArray9113.length;
			 i_191_++) {
			File file_192_
			    = new File(new StringBuilder().append
					   (Class168_Sub1.aStringArray9113
					    [i_191_])
					   .append
					   (Class696_Sub29.aStringArray10958
					    [i_190_])
					   .append
					   (File.separatorChar).append
					   ("random.dat").toString());
			if (file_192_.exists()) {
			    Class503.aClass37_5568
				= new Class37(new Class42(file_192_, "rw",
							  25L),
					      24, 0);
			    break while_0_;
			}
		    }
		}
	    }
	    if (null == Class503.aClass37_5568) {
		RandomAccessFile randomaccessfile
		    = new RandomAccessFile(file, "rw");
		int i_193_ = randomaccessfile.read();
		randomaccessfile.seek(0L);
		randomaccessfile.write(i_193_);
		randomaccessfile.seek(0L);
		randomaccessfile.close();
		Class503.aClass37_5568
		    = new Class37(new Class42(file, "rw", 25L), 24, 0);
	    }
	} catch (IOException ioexception) {
	    /* empty */
	}
    }
    
    static final void method8595(Class259 class259, int i, byte[] is,
				 byte[] is_194_, Class683 class683,
				 short i_195_) {
	if (null == class259.aByteArrayArray2676) {
	    if (is != null) {
		class259.aByteArrayArray2676 = new byte[11][];
		class259.aByteArrayArray2579 = new byte[11][];
		class259.anIntArray2678 = new int[11];
		class259.anIntArray2679 = new int[11];
		class259.anIntArray2680 = new int[11];
	    } else
		return;
	}
	class259.aByteArrayArray2676[i] = is;
	if (is != null)
	    class259.aBool2754 = true;
	else {
	    class259.aBool2754 = false;
	    for (int i_196_ = 0; i_196_ < class259.aByteArrayArray2676.length;
		 i_196_++) {
		if (class259.aByteArrayArray2676[i_196_] != null
		    || class259.anIntArray2680[i_196_] > 0) {
		    class259.aBool2754 = true;
		    break;
		}
	    }
	}
	class259.aByteArrayArray2579[i] = is_194_;
    }
    
    static final void method8596(Class683 class683, short i) {
	System.out.println(class683.anObjectArray8636
			   [(class683.anInt8644 -= 1285561025) * 1373599041]);
    }
    
    static final void method8597(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class70.anInt793 * 2136894173;
    }
    
    static final void method8598(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_197_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	boolean bool
	    = 1 == class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	Class610.method10026(i_197_, string, bool, -121767963);
    }
    
    static final void method8599(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.anInt11260 * -750203937;
    }
    
    static final void method8600
	(Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1,
	 Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1_198_, int i,
	 int i_199_, int i_200_, int i_201_, int i_202_, int i_203_,
	 int i_204_, int i_205_) {
	int i_206_ = class656_sub1_sub3_sub1_198_.method18613(1606090852);
	if (-1 != i_206_) {
	    Object object = null;
	    Class157 class157
		= (Class157) client.aClass200_11113.method3785((long) i_206_);
	    if (null == class157) {
		Class173[] class173s
		    = Class187.method3674(Class462.idx_8, i_206_, 0);
		if (null == class173s)
		    return;
		class157
		    = Class501.aClass182_5564.method3216(class173s[0], true);
		client.aClass200_11113.method3788(class157, (long) i_206_);
	    }
	    Class446 class446
		= class656_sub1_sub3_sub1.method10818().aClass446_4807;
	    Class585.method9663(class656_sub1_sub3_sub1.aByte10867,
				(int) class446.aFloat4895,
				(int) class446.aFloat4897,
				class656_sub1_sub3_sub1
				    .method18608((byte) 109) * 256,
				0, false, false, 59335484);
	    int i_207_
		= (int) (client.aFloatArray11375[0] + (float) i_199_ - 18.0F);
	    int i_208_ = (int) (client.aFloatArray11375[1] + (float) i_200_
				- 16.0F - 54.0F);
	    i_207_ += i / 4 * 18;
	    i_208_ += i % 4 * 18;
	    class157.method2518(i_207_, i_208_);
	    if (class656_sub1_sub3_sub1_198_ == class656_sub1_sub3_sub1)
		Class501.aClass182_5564.method3189(i_207_ - 1, i_208_ - 1, 18,
						   18, -256, 33116158);
	    Class531_Sub4 class531_sub4 = Class278.method5148(-326294579);
	    class531_sub4.aClass656_Sub1_Sub3_Sub1_10326
		= class656_sub1_sub3_sub1_198_;
	    class531_sub4.anInt10325 = -1672331851 * i_207_;
	    class531_sub4.anInt10324 = i_208_ * -317798539;
	    class531_sub4.anInt10327 = (i_207_ + 16) * 193130343;
	    class531_sub4.anInt10328 = 1370141797 * (i_208_ + 16);
	    client.aClass708_11202.method14331(class531_sub4, (short) -25180);
	}
    }
    
    static final void method8601(Class683 class683, byte i) {
	int i_209_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_209_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -1854178829 * class259.anInt2628;
    }
}
