/* Class179_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class179_Sub3 extends Class179
{
    int[] anIntArray9541;
    static final int anInt9542 = 7;
    int[][] anIntArrayArray9543;
    int anInt9544;
    short[] aShortArray9545;
    short aShort9546;
    static Class356 aClass356_9547;
    short[] aShortArray9548;
    int anInt9549;
    int[] anIntArray9550;
    int[] anIntArray9551;
    short[] aShortArray9552;
    int[][] anIntArrayArray9553;
    boolean aBool9554;
    int anInt9555;
    short[] aShortArray9556;
    byte[] aByteArray9557;
    int anInt9558;
    short[] aShortArray9559;
    short[] aShortArray9560;
    short[] aShortArray9561;
    float[] aFloatArray9562;
    float[] aFloatArray9563;
    Class366 aClass366_9564;
    static final int anInt9565 = 4;
    int anInt9566;
    int[] anIntArray9567;
    byte[] aByteArray9568;
    float[] aFloatArray9569;
    short[] aShortArray9570;
    short[] aShortArray9571;
    short aShort9572;
    int[][] anIntArrayArray9573;
    Class349[] aClass349Array9574;
    Class354 aClass354_9575;
    int anInt9576;
    Class363 aClass363_9577;
    Class363 aClass363_9578;
    Class363 aClass363_9579;
    boolean aBool9580;
    boolean aBool9581;
    boolean aBool9582;
    int anInt9583 = 0;
    int anInt9584;
    Class182_Sub1 aClass182_Sub1_9585;
    boolean aBool9586;
    int anInt9587;
    int anInt9588;
    int anInt9589;
    int anInt9590;
    int anInt9591;
    int anInt9592;
    boolean aBool9593;
    int anInt9594;
    int anInt9595;
    int[] anIntArray9596;
    int[] anIntArray9597;
    int[] anIntArray9598;
    short[] aShortArray9599;
    Class184[] aClass184Array9600;
    Class154[] aClass154Array9601;
    int anInt9602;
    int anInt9603;
    Class359[] aClass359Array9604;
    short[] aShortArray9605;
    boolean aBool9606;
    long[] aLongArray9607;
    int[] anIntArray9608;
    int[] anIntArray9609;
    int[] anIntArray9610;
    int[] anIntArray9611;
    int[] anIntArray9612;
    int anInt9613;
    int anInt9614;
    short[] aShortArray9615;
    Class363 aClass363_9616;
    short[] aShortArray9617;
    
    public void method2952(int i) {
	aShort9572 = (short) i;
	method15326();
	method15273();
    }
    
    Class179_Sub3(Class182_Sub1 class182_sub1, Class186 class186, int i,
		  int i_0_, int i_1_, int i_2_) {
	this(class182_sub1, i, i_2_, true, false);
	Class180 class180 = class182_sub1.aClass180_1944;
	Interface47 interface47 = class182_sub1.anInterface47_1945;
	int[] is = new int[class186.anInt2098];
	anIntArray9598 = new int[class186.anInt2087 + 1];
	for (int i_3_ = 0; i_3_ < class186.anInt2098; i_3_++) {
	    if (class186.aByteArray2107 == null
		|| class186.aByteArray2107[i_3_] != 2) {
		if (class186.aShortArray2110 != null
		    && class186.aShortArray2110[i_3_] != -1) {
		    Class166 class166
			= class180.method3116((class186.aShortArray2110[i_3_]
					       & 0xffff),
					      -1431554601);
		    if (((anInt9558 & 0x40) == 0 || !class166.aBool1819)
			&& class166.aBool1829)
			continue;
		}
		is[anInt9595++] = i_3_;
		anIntArray9598[class186.aShortArray2111[i_3_]]++;
		anIntArray9598[class186.aShortArray2100[i_3_]]++;
		anIntArray9598[class186.aShortArray2101[i_3_]]++;
	    }
	}
	anInt9566 = anInt9595;
	long[] ls = new long[anInt9595];
	boolean bool = (anInt9544 & 0x100) != 0;
	for (int i_4_ = 0; i_4_ < anInt9595; i_4_++) {
	    int i_5_ = is[i_4_];
	    Class166 class166 = null;
	    int i_6_ = 0;
	    int i_7_ = 0;
	    int i_8_ = 0;
	    int i_9_ = 0;
	    if (class186.aClass171Array2088 != null) {
		boolean bool_10_ = false;
		for (int i_11_ = 0; i_11_ < class186.aClass171Array2088.length;
		     i_11_++) {
		    Class171 class171 = class186.aClass171Array2088[i_11_];
		    if (i_5_ == class171.anInt1856 * 553052305) {
			Class394 class394
			    = interface47.method338((class171.anInt1855
						     * -145881707),
						    (short) 800);
			if (class394.aBool4099)
			    bool_10_ = true;
			if (class394.anInt4094 * 836405987 != -1) {
			    Class166 class166_12_
				= class180.method3116((class394.anInt4094
						       * 836405987),
						      -1431554601);
			    if (class166_12_.aClass597_1807
				== Class597.aClass597_7841)
				aBool9582 = true;
			}
		    }
		}
		if (bool_10_) {
		    ls[i_4_] = 9223372036854775807L;
		    anInt9566--;
		    continue;
		}
	    }
	    if (class186.aClass184Array2129 != null) {
		boolean bool_13_ = false;
		for (int i_14_ = 0; i_14_ < class186.aClass184Array2129.length;
		     i_14_++) {
		    Class184 class184 = class186.aClass184Array2129[i_14_];
		    if (i_5_ == class184.anInt2065 * -1426233023) {
			Class382 class382
			    = (aClass182_Sub1_9585.anInterface48_1946.method340
			       (class184.anInt2064 * -1912121795, 2116345368));
			if (class382.aBool3983)
			    bool_13_ = true;
		    }
		}
		if (bool_13_) {
		    ls[i_4_] = 9223372036854775807L;
		    anInt9566--;
		    continue;
		}
	    }
	    int i_15_ = -1;
	    if (class186.aShortArray2110 != null) {
		i_15_ = class186.aShortArray2110[i_5_];
		if (i_15_ != -1) {
		    class166
			= class180.method3116(i_15_ & 0xffff, -1431554601);
		    if ((anInt9558 & 0x40) == 0 || !class166.aBool1819) {
			i_8_ = class166.aByte1825;
			i_9_ = class166.aByte1826;
		    } else {
			i_15_ = -1;
			class166 = null;
		    }
		}
	    }
	    boolean bool_16_
		= ((class186.aByteArray2099 != null
		    && class186.aByteArray2099[i_5_] != 0)
		   || (class166 != null
		       && class166.aClass597_1807 != Class597.aClass597_7842));
	    if ((bool || bool_16_) && class186.aByteArray2106 != null)
		i_6_ += class186.aByteArray2106[i_5_] << 17;
	    if (bool_16_)
		i_6_ += 65536;
	    i_6_ += (i_8_ & 0xff) << 8;
	    i_6_ += i_9_ & 0xff;
	    i_7_ += (i_15_ & 0xffff) << 16;
	    i_7_ += i_4_ & 0xffff;
	    ls[i_4_] = ((long) i_6_ << 32) + (long) i_7_;
	    aBool9582 |= bool_16_;
	    Class179_Sub3 class179_sub3_17_ = this;
	    class179_sub3_17_.aBool9606
		= (class179_sub3_17_.aBool9606
		   | (class166 != null && (class166.aByte1805 != 0
					   || class166.aByte1806 != 0)));
	}
	Class28.method912(ls, is, (byte) 1);
	anInt9583 = class186.anInt2084;
	anInt9549 = class186.anInt2087;
	anIntArray9550 = class186.anIntArray2089;
	anIntArray9551 = class186.anIntArray2090;
	anIntArray9541 = class186.anIntArray2108;
	aShortArray9548 = class186.aShortArray2094;
	Class375[] class375s = new Class375[anInt9549];
	aClass184Array9600 = class186.aClass184Array2129;
	aClass154Array9601 = class186.aClass154Array2093;
	if (class186.aClass171Array2088 != null) {
	    anInt9603 = class186.aClass171Array2088.length;
	    aClass359Array9604 = new Class359[anInt9603];
	    aClass349Array9574 = new Class349[anInt9603];
	    for (int i_18_ = 0; i_18_ < anInt9603; i_18_++) {
		Class171 class171 = class186.aClass171Array2088[i_18_];
		Class394 class394
		    = interface47.method338(class171.anInt1855 * -145881707,
					    (short) 800);
		int i_19_ = -1;
		for (int i_20_ = 0; i_20_ < anInt9595; i_20_++) {
		    if (is[i_20_] == class171.anInt1856 * 553052305) {
			i_19_ = i_20_;
			break;
		    }
		}
		if (i_19_ == -1)
		    throw new RuntimeException();
		int i_21_ = ((Class642.anIntArray8324
			      [(class186.aShortArray2109
				[class171.anInt1856 * 553052305]) & 0xffff])
			     & 0xffffff);
		i_21_ = i_21_ | 255 - (class186.aByteArray2099 != null
				       ? (class186.aByteArray2099
					  [class171.anInt1856 * 553052305])
				       : 0) << 24;
		aClass359Array9604[i_18_]
		    = new Class359(i_19_,
				   (class186.aShortArray2111
				    [class171.anInt1856 * 553052305]),
				   (class186.aShortArray2100
				    [class171.anInt1856 * 553052305]),
				   (class186.aShortArray2101
				    [class171.anInt1856 * 553052305]),
				   class394.anInt4092 * 1011185193,
				   class394.anInt4095 * -1869723579,
				   class394.anInt4094 * 836405987,
				   class394.anInt4097 * 208895961,
				   class394.anInt4093 * -101232969,
				   class394.aBool4099, class394.aBool4098,
				   class171.anInt1858 * -998013967);
		aClass349Array9574[i_18_] = new Class349(i_21_);
	    }
	}
	int i_22_ = anInt9595 * 3;
	aShortArray9556 = new short[i_22_];
	aShortArray9545 = new short[i_22_];
	aShortArray9617 = new short[i_22_];
	aShortArray9559 = new short[i_22_];
	aShortArray9560 = new short[i_22_];
	aByteArray9557 = new byte[i_22_];
	aFloatArray9562 = new float[i_22_];
	aFloatArray9563 = new float[i_22_];
	aShortArray9552 = new short[anInt9595];
	aByteArray9568 = new byte[anInt9595];
	aShortArray9561 = new short[anInt9595];
	aShortArray9570 = new short[anInt9595];
	aShortArray9571 = new short[anInt9595];
	aShortArray9605 = new short[anInt9595];
	if (class186.aShortArray2113 != null)
	    aShortArray9615 = new short[anInt9595];
	aShort9546 = (short) i_0_;
	aShort9572 = (short) i_1_;
	aShortArray9599 = new short[i_22_];
	aLongArray9607 = new long[i_22_];
	int i_23_ = 0;
	for (int i_24_ = 0; i_24_ < class186.anInt2087; i_24_++) {
	    int i_25_ = anIntArray9598[i_24_];
	    anIntArray9598[i_24_] = i_23_;
	    i_23_ += i_25_;
	    class375s[i_24_] = new Class375();
	}
	anIntArray9598[class186.anInt2087] = i_23_;
	Class207 class207 = method2976(class186, is, anInt9595);
	Class369[] class369s = new Class369[class186.anInt2098];
	for (int i_26_ = 0; i_26_ < class186.anInt2098; i_26_++) {
	    short i_27_ = class186.aShortArray2111[i_26_];
	    short i_28_ = class186.aShortArray2100[i_26_];
	    short i_29_ = class186.aShortArray2101[i_26_];
	    int i_30_ = anIntArray9550[i_28_] - anIntArray9550[i_27_];
	    int i_31_ = anIntArray9551[i_28_] - anIntArray9551[i_27_];
	    int i_32_ = anIntArray9541[i_28_] - anIntArray9541[i_27_];
	    int i_33_ = anIntArray9550[i_29_] - anIntArray9550[i_27_];
	    int i_34_ = anIntArray9551[i_29_] - anIntArray9551[i_27_];
	    int i_35_ = anIntArray9541[i_29_] - anIntArray9541[i_27_];
	    int i_36_ = i_31_ * i_35_ - i_34_ * i_32_;
	    int i_37_ = i_32_ * i_33_ - i_35_ * i_30_;
	    int i_38_;
	    for (i_38_ = i_30_ * i_34_ - i_33_ * i_31_;
		 (i_36_ > 8192 || i_37_ > 8192 || i_38_ > 8192 || i_36_ < -8192
		  || i_37_ < -8192 || i_38_ < -8192);
		 i_38_ >>= 1) {
		i_36_ >>= 1;
		i_37_ >>= 1;
	    }
	    int i_39_ = (int) Math.sqrt((double) (i_36_ * i_36_ + i_37_ * i_37_
						  + i_38_ * i_38_));
	    if (i_39_ <= 0)
		i_39_ = 1;
	    i_36_ = i_36_ * 256 / i_39_;
	    i_37_ = i_37_ * 256 / i_39_;
	    i_38_ = i_38_ * 256 / i_39_;
	    byte i_40_ = (class186.aByteArray2107 == null ? (byte) 0
			  : class186.aByteArray2107[i_26_]);
	    if (i_40_ == 0) {
		Class375 class375 = class375s[i_27_];
		class375.anInt3893 += i_36_;
		class375.anInt3895 += i_37_;
		class375.anInt3892 += i_38_;
		class375.anInt3894++;
		class375 = class375s[i_28_];
		class375.anInt3893 += i_36_;
		class375.anInt3895 += i_37_;
		class375.anInt3892 += i_38_;
		class375.anInt3894++;
		class375 = class375s[i_29_];
		class375.anInt3893 += i_36_;
		class375.anInt3895 += i_37_;
		class375.anInt3892 += i_38_;
		class375.anInt3894++;
	    } else if (i_40_ == 1) {
		Class369 class369 = class369s[i_26_] = new Class369();
		class369.anInt3873 = i_36_;
		class369.anInt3872 = i_37_;
		class369.anInt3871 = i_38_;
	    }
	}
	for (int i_41_ = 0; i_41_ < anInt9595; i_41_++) {
	    int i_42_ = is[i_41_];
	    int i_43_ = class186.aShortArray2109[i_42_] & 0xffff;
	    int i_44_ = (class186.aByteArray2099 != null
			 ? class186.aByteArray2099[i_42_] & 0xff : 0);
	    short i_45_ = (class186.aShortArray2110 == null ? (short) -1
			   : class186.aShortArray2110[i_42_]);
	    if (i_45_ != -1 && (anInt9558 & 0x40) != 0
		&& class180.method3116(i_45_, -1431554601).aBool1819)
		i_45_ = (short) -1;
	    float f = 0.0F;
	    float f_46_ = 0.0F;
	    float f_47_ = 0.0F;
	    float f_48_ = 0.0F;
	    float f_49_ = 0.0F;
	    float f_50_ = 0.0F;
	    long l;
	    long l_51_;
	    long l_52_;
	    if (i_45_ != -1) {
		int i_53_ = (class186.aShortArray2122 != null
			     ? class186.aShortArray2122[i_42_] : -1);
		if (i_53_ == 32766) {
		    int i_54_ = class186.aByteArray2102[i_42_] & 0xff;
		    int i_55_ = class186.aByteArray2092[i_42_] & 0xff;
		    int i_56_ = class186.aByteArray2104[i_42_] & 0xff;
		    i_54_ += (class186.anIntArray2103
			      [class186.aShortArray2111[i_42_]]);
		    l_52_ = (long) i_54_;
		    i_55_ += (class186.anIntArray2103
			      [class186.aShortArray2100[i_42_]]);
		    l_51_ = (long) i_54_;
		    i_56_ += (class186.anIntArray2103
			      [class186.aShortArray2101[i_42_]]);
		    l = (long) i_54_;
		    f = class186.aFloatArray2096[i_54_];
		    f_46_ = class186.aFloatArray2097[i_54_];
		    f_47_ = class186.aFloatArray2096[i_55_];
		    f_48_ = class186.aFloatArray2097[i_55_];
		    f_49_ = class186.aFloatArray2096[i_56_];
		    f_50_ = class186.aFloatArray2097[i_56_];
		} else if (i_53_ == -1) {
		    f = 0.0F;
		    f_46_ = 1.0F;
		    l_52_ = 65535L;
		    f_47_ = 1.0F;
		    f_48_ = 1.0F;
		    l_51_ = 131071L;
		    f_49_ = 0.0F;
		    f_50_ = 0.0F;
		    l = 196607L;
		} else {
		    i_53_ &= 0xffff;
		    int i_57_ = 0;
		    int i_58_ = 0;
		    int i_59_ = 0;
		    byte i_60_ = class186.aByteArray2117[i_53_];
		    if (i_60_ == 0) {
			short i_61_ = class186.aShortArray2111[i_42_];
			short i_62_ = class186.aShortArray2100[i_42_];
			short i_63_ = class186.aShortArray2101[i_42_];
			short i_64_ = class186.aShortArray2118[i_53_];
			short i_65_ = class186.aShortArray2119[i_53_];
			short i_66_ = class186.aShortArray2120[i_53_];
			float f_67_ = (float) class186.anIntArray2089[i_64_];
			float f_68_ = (float) class186.anIntArray2090[i_64_];
			float f_69_ = (float) class186.anIntArray2108[i_64_];
			float f_70_
			    = (float) class186.anIntArray2089[i_65_] - f_67_;
			float f_71_
			    = (float) class186.anIntArray2090[i_65_] - f_68_;
			float f_72_
			    = (float) class186.anIntArray2108[i_65_] - f_69_;
			float f_73_
			    = (float) class186.anIntArray2089[i_66_] - f_67_;
			float f_74_
			    = (float) class186.anIntArray2090[i_66_] - f_68_;
			float f_75_
			    = (float) class186.anIntArray2108[i_66_] - f_69_;
			float f_76_
			    = (float) class186.anIntArray2089[i_61_] - f_67_;
			float f_77_
			    = (float) class186.anIntArray2090[i_61_] - f_68_;
			float f_78_
			    = (float) class186.anIntArray2108[i_61_] - f_69_;
			float f_79_
			    = (float) class186.anIntArray2089[i_62_] - f_67_;
			float f_80_
			    = (float) class186.anIntArray2090[i_62_] - f_68_;
			float f_81_
			    = (float) class186.anIntArray2108[i_62_] - f_69_;
			float f_82_
			    = (float) class186.anIntArray2089[i_63_] - f_67_;
			float f_83_
			    = (float) class186.anIntArray2090[i_63_] - f_68_;
			float f_84_
			    = (float) class186.anIntArray2108[i_63_] - f_69_;
			float f_85_ = f_71_ * f_75_ - f_72_ * f_74_;
			float f_86_ = f_72_ * f_73_ - f_70_ * f_75_;
			float f_87_ = f_70_ * f_74_ - f_71_ * f_73_;
			float f_88_ = f_74_ * f_87_ - f_75_ * f_86_;
			float f_89_ = f_75_ * f_85_ - f_73_ * f_87_;
			float f_90_ = f_73_ * f_86_ - f_74_ * f_85_;
			float f_91_ = 1.0F / (f_88_ * f_70_ + f_89_ * f_71_
					      + f_90_ * f_72_);
			f = ((f_88_ * f_76_ + f_89_ * f_77_ + f_90_ * f_78_)
			     * f_91_);
			f_47_ = (f_88_ * f_79_ + f_89_ * f_80_
				 + f_90_ * f_81_) * f_91_;
			f_49_ = (f_88_ * f_82_ + f_89_ * f_83_
				 + f_90_ * f_84_) * f_91_;
			f_88_ = f_71_ * f_87_ - f_72_ * f_86_;
			f_89_ = f_72_ * f_85_ - f_70_ * f_87_;
			f_90_ = f_70_ * f_86_ - f_71_ * f_85_;
			f_91_ = 1.0F / (f_88_ * f_73_ + f_89_ * f_74_
					+ f_90_ * f_75_);
			f_46_ = (f_88_ * f_76_ + f_89_ * f_77_
				 + f_90_ * f_78_) * f_91_;
			f_48_ = (f_88_ * f_79_ + f_89_ * f_80_
				 + f_90_ * f_81_) * f_91_;
			f_50_ = (f_88_ * f_82_ + f_89_ * f_83_
				 + f_90_ * f_84_) * f_91_;
		    } else {
			short i_92_ = class186.aShortArray2111[i_42_];
			short i_93_ = class186.aShortArray2100[i_42_];
			short i_94_ = class186.aShortArray2101[i_42_];
			int i_95_ = class207.anIntArray2249[i_53_];
			int i_96_ = class207.anIntArray2248[i_53_];
			int i_97_ = class207.anIntArray2246[i_53_];
			float[] fs = class207.aFloatArrayArray2247[i_53_];
			byte i_98_ = class186.aByteArray2091[i_53_];
			float f_99_
			    = (float) class186.anIntArray2124[i_53_] / 256.0F;
			if (i_60_ == 1) {
			    float f_100_
				= ((float) class186.anIntArray2123[i_53_]
				   / 1024.0F);
			    method2921(class186.anIntArray2089[i_92_],
				       class186.anIntArray2090[i_92_],
				       class186.anIntArray2108[i_92_], i_95_,
				       i_96_, i_97_, fs, f_100_, i_98_, f_99_,
				       aFloatArray9569);
			    f = aFloatArray9569[0];
			    f_46_ = aFloatArray9569[1];
			    method2921(class186.anIntArray2089[i_93_],
				       class186.anIntArray2090[i_93_],
				       class186.anIntArray2108[i_93_], i_95_,
				       i_96_, i_97_, fs, f_100_, i_98_, f_99_,
				       aFloatArray9569);
			    f_47_ = aFloatArray9569[0];
			    f_48_ = aFloatArray9569[1];
			    method2921(class186.anIntArray2089[i_94_],
				       class186.anIntArray2090[i_94_],
				       class186.anIntArray2108[i_94_], i_95_,
				       i_96_, i_97_, fs, f_100_, i_98_, f_99_,
				       aFloatArray9569);
			    f_49_ = aFloatArray9569[0];
			    f_50_ = aFloatArray9569[1];
			    float f_101_ = f_100_ / 2.0F;
			    if ((i_98_ & 0x1) == 0) {
				if (f_47_ - f > f_101_) {
				    f_47_ -= f_100_;
				    i_58_ = 1;
				} else if (f - f_47_ > f_101_) {
				    f_47_ += f_100_;
				    i_58_ = 2;
				}
				if (f_49_ - f > f_101_) {
				    f_49_ -= f_100_;
				    i_59_ = 1;
				} else if (f - f_49_ > f_101_) {
				    f_49_ += f_100_;
				    i_59_ = 2;
				}
			    } else {
				if (f_48_ - f_46_ > f_101_) {
				    f_48_ -= f_100_;
				    i_58_ = 1;
				} else if (f_46_ - f_48_ > f_101_) {
				    f_48_ += f_100_;
				    i_58_ = 2;
				}
				if (f_50_ - f_46_ > f_101_) {
				    f_50_ -= f_100_;
				    i_59_ = 1;
				} else if (f_46_ - f_50_ > f_101_) {
				    f_50_ += f_100_;
				    i_59_ = 2;
				}
			    }
			} else if (i_60_ == 2) {
			    float f_102_
				= ((float) class186.anIntArray2125[i_53_]
				   / 256.0F);
			    float f_103_
				= ((float) class186.anIntArray2130[i_53_]
				   / 256.0F);
			    int i_104_ = (class186.anIntArray2089[i_93_]
					  - class186.anIntArray2089[i_92_]);
			    int i_105_ = (class186.anIntArray2090[i_93_]
					  - class186.anIntArray2090[i_92_]);
			    int i_106_ = (class186.anIntArray2108[i_93_]
					  - class186.anIntArray2108[i_92_]);
			    int i_107_ = (class186.anIntArray2089[i_94_]
					  - class186.anIntArray2089[i_92_]);
			    int i_108_ = (class186.anIntArray2090[i_94_]
					  - class186.anIntArray2090[i_92_]);
			    int i_109_ = (class186.anIntArray2108[i_94_]
					  - class186.anIntArray2108[i_92_]);
			    int i_110_ = i_105_ * i_109_ - i_108_ * i_106_;
			    int i_111_ = i_106_ * i_107_ - i_109_ * i_104_;
			    int i_112_ = i_104_ * i_108_ - i_107_ * i_105_;
			    float f_113_
				= (64.0F
				   / (float) class186.anIntArray2121[i_53_]);
			    float f_114_
				= (64.0F
				   / (float) class186.anIntArray2114[i_53_]);
			    float f_115_
				= (64.0F
				   / (float) class186.anIntArray2123[i_53_]);
			    float f_116_ = (((float) i_110_ * fs[0]
					     + (float) i_111_ * fs[1]
					     + (float) i_112_ * fs[2])
					    / f_113_);
			    float f_117_ = (((float) i_110_ * fs[3]
					     + (float) i_111_ * fs[4]
					     + (float) i_112_ * fs[5])
					    / f_114_);
			    float f_118_ = (((float) i_110_ * fs[6]
					     + (float) i_111_ * fs[7]
					     + (float) i_112_ * fs[8])
					    / f_115_);
			    i_57_ = method2922(f_116_, f_117_, f_118_);
			    method3009(class186.anIntArray2089[i_92_],
				       class186.anIntArray2090[i_92_],
				       class186.anIntArray2108[i_92_], i_95_,
				       i_96_, i_97_, i_57_, fs, i_98_, f_99_,
				       f_102_, f_103_, aFloatArray9569);
			    f = aFloatArray9569[0];
			    f_46_ = aFloatArray9569[1];
			    method3009(class186.anIntArray2089[i_93_],
				       class186.anIntArray2090[i_93_],
				       class186.anIntArray2108[i_93_], i_95_,
				       i_96_, i_97_, i_57_, fs, i_98_, f_99_,
				       f_102_, f_103_, aFloatArray9569);
			    f_47_ = aFloatArray9569[0];
			    f_48_ = aFloatArray9569[1];
			    method3009(class186.anIntArray2089[i_94_],
				       class186.anIntArray2090[i_94_],
				       class186.anIntArray2108[i_94_], i_95_,
				       i_96_, i_97_, i_57_, fs, i_98_, f_99_,
				       f_102_, f_103_, aFloatArray9569);
			    f_49_ = aFloatArray9569[0];
			    f_50_ = aFloatArray9569[1];
			} else if (i_60_ == 3) {
			    method3033(class186.anIntArray2089[i_92_],
				       class186.anIntArray2090[i_92_],
				       class186.anIntArray2108[i_92_], i_95_,
				       i_96_, i_97_, fs, i_98_, f_99_,
				       aFloatArray9569);
			    f = aFloatArray9569[0];
			    f_46_ = aFloatArray9569[1];
			    method3033(class186.anIntArray2089[i_93_],
				       class186.anIntArray2090[i_93_],
				       class186.anIntArray2108[i_93_], i_95_,
				       i_96_, i_97_, fs, i_98_, f_99_,
				       aFloatArray9569);
			    f_47_ = aFloatArray9569[0];
			    f_48_ = aFloatArray9569[1];
			    method3033(class186.anIntArray2089[i_94_],
				       class186.anIntArray2090[i_94_],
				       class186.anIntArray2108[i_94_], i_95_,
				       i_96_, i_97_, fs, i_98_, f_99_,
				       aFloatArray9569);
			    f_49_ = aFloatArray9569[0];
			    f_50_ = aFloatArray9569[1];
			    if ((i_98_ & 0x1) == 0) {
				if (f_47_ - f > 0.5F) {
				    f_47_--;
				    i_58_ = 1;
				} else if (f - f_47_ > 0.5F) {
				    f_47_++;
				    i_58_ = 2;
				}
				if (f_49_ - f > 0.5F) {
				    f_49_--;
				    i_59_ = 1;
				} else if (f - f_49_ > 0.5F) {
				    f_49_++;
				    i_59_ = 2;
				}
			    } else {
				if (f_48_ - f_46_ > 0.5F) {
				    f_48_--;
				    i_58_ = 1;
				} else if (f_46_ - f_48_ > 0.5F) {
				    f_48_++;
				    i_58_ = 2;
				}
				if (f_50_ - f_46_ > 0.5F) {
				    f_50_--;
				    i_59_ = 1;
				} else if (f_46_ - f_50_ > 0.5F) {
				    f_50_++;
				    i_59_ = 2;
				}
			    }
			}
		    }
		    l_52_ = (long) (i_57_ << 16 | i_53_);
		    l_51_ = (long) (i_58_ << 19) | l_52_;
		    l = (long) (i_59_ << 19) | l_52_;
		}
	    } else {
		l = 0L;
		l_51_ = 0L;
		l_52_ = 0L;
	    }
	    byte i_119_ = (class186.aByteArray2107 != null
			   ? class186.aByteArray2107[i_42_] : (byte) 0);
	    if (i_119_ == 0) {
		long l_120_ = (long) ((i_43_ << 8) + i_44_);
		short i_121_ = class186.aShortArray2111[i_42_];
		short i_122_ = class186.aShortArray2100[i_42_];
		short i_123_ = class186.aShortArray2101[i_42_];
		Class375 class375 = class375s[i_121_];
		aShortArray9561[i_41_]
		    = method15292(class186, i_121_, i_41_,
				  l_120_ | l_52_ << 24, class375.anInt3893,
				  class375.anInt3895, class375.anInt3892,
				  class375.anInt3894, f, f_46_);
		class375 = class375s[i_122_];
		aShortArray9570[i_41_]
		    = method15292(class186, i_122_, i_41_,
				  l_120_ | l_51_ << 24, class375.anInt3893,
				  class375.anInt3895, class375.anInt3892,
				  class375.anInt3894, f_47_, f_48_);
		class375 = class375s[i_123_];
		aShortArray9571[i_41_]
		    = method15292(class186, i_123_, i_41_, l_120_ | l << 24,
				  class375.anInt3893, class375.anInt3895,
				  class375.anInt3892, class375.anInt3894,
				  f_49_, f_50_);
	    } else if (i_119_ == 1) {
		Class369 class369 = class369s[i_42_];
		long l_124_ = (((long) (class369.anInt3873 & ~0x7fffffff) << 9)
			       + ((long) (class369.anInt3872 + 256) << 32)
			       + ((long) (class369.anInt3871 + 256) << 24)
			       + (long) (i_43_ << 8) + (long) i_44_);
		aShortArray9561[i_41_]
		    = method15292(class186, class186.aShortArray2111[i_42_],
				  i_41_, l_124_ | l_52_ << 41,
				  class369.anInt3873, class369.anInt3872,
				  class369.anInt3871, 0, f, f_46_);
		aShortArray9570[i_41_]
		    = method15292(class186, class186.aShortArray2100[i_42_],
				  i_41_, l_124_ | l_52_ << 41,
				  class369.anInt3873, class369.anInt3872,
				  class369.anInt3871, 0, f_47_, f_48_);
		aShortArray9571[i_41_]
		    = method15292(class186, class186.aShortArray2101[i_42_],
				  i_41_, l_124_ | l_52_ << 41,
				  class369.anInt3873, class369.anInt3872,
				  class369.anInt3871, 0, f_49_, f_50_);
	    }
	    if (class186.aByteArray2099 != null)
		aByteArray9568[i_41_] = class186.aByteArray2099[i_42_];
	    if (class186.aShortArray2113 != null)
		aShortArray9615[i_41_] = class186.aShortArray2113[i_42_];
	    aShortArray9552[i_41_] = class186.aShortArray2109[i_42_];
	    aShortArray9605[i_41_] = i_45_;
	}
	if (anInt9566 > 0) {
	    int i_125_ = 1;
	    short i_126_ = aShortArray9605[0];
	    for (int i_127_ = 0; i_127_ < anInt9566; i_127_++) {
		short i_128_ = aShortArray9605[i_127_];
		if (i_128_ != i_126_) {
		    i_125_++;
		    i_126_ = i_128_;
		}
	    }
	    anIntArray9596 = new int[i_125_];
	    anIntArray9597 = new int[i_125_];
	    anIntArray9567 = new int[i_125_ + 1];
	    anIntArray9567[0] = 0;
	    int i_129_ = anInt9555;
	    int i_130_ = 0;
	    i_125_ = 0;
	    i_126_ = aShortArray9605[0];
	    for (int i_131_ = 0; i_131_ < anInt9566; i_131_++) {
		short i_132_ = aShortArray9605[i_131_];
		if (i_132_ != i_126_) {
		    anIntArray9596[i_125_] = i_129_;
		    anIntArray9597[i_125_] = i_130_ - i_129_ + 1;
		    anIntArray9567[++i_125_] = i_131_;
		    i_129_ = anInt9555;
		    i_130_ = 0;
		    i_126_ = i_132_;
		}
		int i_133_ = aShortArray9561[i_131_] & 0xffff;
		if (i_133_ < i_129_)
		    i_129_ = i_133_;
		if (i_133_ > i_130_)
		    i_130_ = i_133_;
		i_133_ = aShortArray9570[i_131_] & 0xffff;
		if (i_133_ < i_129_)
		    i_129_ = i_133_;
		if (i_133_ > i_130_)
		    i_130_ = i_133_;
		i_133_ = aShortArray9571[i_131_] & 0xffff;
		if (i_133_ < i_129_)
		    i_129_ = i_133_;
		if (i_133_ > i_130_)
		    i_130_ = i_133_;
	    }
	    anIntArray9596[i_125_] = i_129_;
	    anIntArray9597[i_125_] = i_130_ - i_129_ + 1;
	    anIntArray9567[++i_125_] = anInt9566;
	}
	aLongArray9607 = null;
	aShortArray9556 = method15270(aShortArray9556, anInt9555);
	aShortArray9545 = method15270(aShortArray9545, anInt9555);
	aShortArray9617 = method15270(aShortArray9617, anInt9555);
	aShortArray9559 = method15270(aShortArray9559, anInt9555);
	aShortArray9560 = method15270(aShortArray9560, anInt9555);
	aByteArray9557 = method15269(aByteArray9557, anInt9555);
	aFloatArray9562 = method15271(aFloatArray9562, anInt9555);
	aFloatArray9563 = method15271(aFloatArray9563, anInt9555);
	if (class186.anIntArray2083 != null
	    && Class338.method5971(i, anInt9558))
	    anIntArrayArray9553 = class186.method3636(false);
	if (class186.aClass171Array2088 != null
	    && Class338.method5912(i, anInt9558))
	    anIntArrayArray9543 = class186.method3630();
	if (class186.anIntArray2126 != null
	    && Class338.method5895(i, anInt9558)) {
	    int i_134_ = 0;
	    int[] is_135_ = new int[256];
	    for (int i_136_ = 0; i_136_ < anInt9595; i_136_++) {
		int i_137_ = class186.anIntArray2126[is[i_136_]];
		if (i_137_ >= 0) {
		    is_135_[i_137_]++;
		    if (i_137_ > i_134_)
			i_134_ = i_137_;
		}
	    }
	    anIntArrayArray9573 = new int[i_134_ + 1][];
	    for (int i_138_ = 0; i_138_ <= i_134_; i_138_++) {
		anIntArrayArray9573[i_138_] = new int[is_135_[i_138_]];
		is_135_[i_138_] = 0;
	    }
	    for (int i_139_ = 0; i_139_ < anInt9595; i_139_++) {
		int i_140_ = class186.anIntArray2126[is[i_139_]];
		if (i_140_ >= 0)
		    anIntArrayArray9573[i_140_][is_135_[i_140_]++] = i_139_;
	    }
	}
    }
    
    public void method3004(int i) {
	int i_141_ = Class436.anIntArray4831[i];
	int i_142_ = Class436.anIntArray4838[i];
	for (int i_143_ = 0; i_143_ < anInt9549; i_143_++) {
	    int i_144_ = ((anIntArray9551[i_143_] * i_141_
			   + anIntArray9550[i_143_] * i_142_)
			  >> 14);
	    anIntArray9551[i_143_] = (anIntArray9551[i_143_] * i_142_
				      - anIntArray9550[i_143_] * i_141_) >> 14;
	    anIntArray9550[i_143_] = i_144_;
	}
	method15326();
	aBool9586 = false;
    }
    
    static byte[] method15269(byte[] is, int i) {
	byte[] is_145_ = new byte[i];
	System.arraycopy(is, 0, is_145_, 0, i);
	return is_145_;
    }
    
    static short[] method15270(short[] is, int i) {
	short[] is_146_ = new short[i];
	System.arraycopy(is, 0, is_146_, 0, i);
	return is_146_;
    }
    
    static float[] method15271(float[] fs, int i) {
	float[] fs_147_ = new float[i];
	System.arraycopy(fs, 0, fs_147_, 0, i);
	return fs_147_;
    }
    
    public int method2928() {
	return anInt9544;
    }
    
    public void method3010(int i) {
	if (aClass363_9616 != null)
	    aClass363_9616.aBool3836 = Class338.method5881(i, anInt9558);
	if (aClass363_9579 != null)
	    aClass363_9579.aBool3836 = Class338.method5934(i, anInt9558);
	if (aClass363_9577 != null)
	    aClass363_9577.aBool3836 = Class338.method5883(i, anInt9558);
	if (aClass363_9578 != null)
	    aClass363_9578.aBool3836 = Class338.method5882(i, anInt9558);
	anInt9544 = i;
	if (aClass366_9564 != null && (anInt9544 & 0x10000) == 0) {
	    aShortArray9617 = aClass366_9564.aShortArray3857;
	    aShortArray9559 = aClass366_9564.aShortArray3856;
	    aShortArray9560 = aClass366_9564.aShortArray3858;
	    aByteArray9557 = aClass366_9564.aByteArray3855;
	    aClass366_9564 = null;
	}
	aBool9581 = true;
	method15298();
    }
    
    public void method2929() {
	if (anInt9555 > 0 && anInt9566 > 0) {
	    method15286();
	    method15295();
	    method15298();
	}
    }
    
    public Class179 method2926(byte i, int i_148_, boolean bool) {
	boolean bool_149_ = false;
	Class179_Sub3 class179_sub3_150_;
	Class179_Sub3 class179_sub3_151_;
	if (i > 0 && i <= 8) {
	    class179_sub3_151_
		= aClass182_Sub1_9585.aClass179_Sub3Array9269[i - 1];
	    class179_sub3_150_
		= aClass182_Sub1_9585.aClass179_Sub3Array9320[i - 1];
	    bool_149_ = true;
	} else
	    class179_sub3_150_ = class179_sub3_151_
		= new Class179_Sub3(aClass182_Sub1_9585, 0, 0, true, false);
	return method15272(class179_sub3_150_, class179_sub3_151_, i_148_,
			   bool_149_, bool);
    }
    
    Class179 method15272(Class179_Sub3 class179_sub3_152_,
			 Class179_Sub3 class179_sub3_153_, int i, boolean bool,
			 boolean bool_154_) {
	class179_sub3_152_.anInt9544 = i;
	class179_sub3_152_.anInt9558 = anInt9558;
	class179_sub3_152_.aShort9546 = aShort9546;
	class179_sub3_152_.aShort9572 = aShort9572;
	class179_sub3_152_.anInt9583 = anInt9583;
	class179_sub3_152_.anInt9549 = anInt9549;
	class179_sub3_152_.anInt9555 = anInt9555;
	class179_sub3_152_.anInt9595 = anInt9595;
	class179_sub3_152_.anInt9566 = anInt9566;
	class179_sub3_152_.anInt9603 = anInt9603;
	if ((i & 0x100) != 0)
	    class179_sub3_152_.aBool9582 = true;
	else
	    class179_sub3_152_.aBool9582 = aBool9582;
	class179_sub3_152_.aBool9606 = aBool9606;
	boolean bool_155_ = Class338.method5864(i, anInt9558);
	boolean bool_156_ = Class338.method5865(i, anInt9558);
	boolean bool_157_ = Class338.method5866(i, anInt9558);
	boolean bool_158_ = bool_155_ | bool_156_ | bool_157_;
	if (bool_158_) {
	    if (bool_155_) {
		if (class179_sub3_153_.anIntArray9550 == null
		    || class179_sub3_153_.anIntArray9550.length < anInt9583)
		    class179_sub3_152_.anIntArray9550
			= class179_sub3_153_.anIntArray9550
			= new int[anInt9583];
		else
		    class179_sub3_152_.anIntArray9550
			= class179_sub3_153_.anIntArray9550;
	    } else
		class179_sub3_152_.anIntArray9550 = anIntArray9550;
	    if (bool_156_) {
		if (class179_sub3_153_.anIntArray9551 == null
		    || class179_sub3_153_.anIntArray9551.length < anInt9583)
		    class179_sub3_152_.anIntArray9551
			= class179_sub3_153_.anIntArray9551
			= new int[anInt9583];
		else
		    class179_sub3_152_.anIntArray9551
			= class179_sub3_153_.anIntArray9551;
	    } else
		class179_sub3_152_.anIntArray9551 = anIntArray9551;
	    if (bool_157_) {
		if (class179_sub3_153_.anIntArray9541 == null
		    || class179_sub3_153_.anIntArray9541.length < anInt9583)
		    class179_sub3_152_.anIntArray9541
			= class179_sub3_153_.anIntArray9541
			= new int[anInt9583];
		else
		    class179_sub3_152_.anIntArray9541
			= class179_sub3_153_.anIntArray9541;
	    } else
		class179_sub3_152_.anIntArray9541 = anIntArray9541;
	    for (int i_159_ = 0; i_159_ < anInt9583; i_159_++) {
		if (bool_155_)
		    class179_sub3_152_.anIntArray9550[i_159_]
			= anIntArray9550[i_159_];
		if (bool_156_)
		    class179_sub3_152_.anIntArray9551[i_159_]
			= anIntArray9551[i_159_];
		if (bool_157_)
		    class179_sub3_152_.anIntArray9541[i_159_]
			= anIntArray9541[i_159_];
	    }
	} else {
	    class179_sub3_152_.anIntArray9550 = anIntArray9550;
	    class179_sub3_152_.anIntArray9551 = anIntArray9551;
	    class179_sub3_152_.anIntArray9541 = anIntArray9541;
	}
	if (Class338.method5881(i, anInt9558)) {
	    class179_sub3_152_.aClass363_9616
		= class179_sub3_153_.aClass363_9616;
	    class179_sub3_152_.aClass363_9616.anInterface35_3834
		= aClass363_9616.anInterface35_3834;
	    class179_sub3_152_.aClass363_9616.aBool3835
		= aClass363_9616.aBool3835;
	    class179_sub3_152_.aClass363_9616.aBool3836 = true;
	} else if (Class338.method5876(i, anInt9558))
	    class179_sub3_152_.aClass363_9616 = aClass363_9616;
	else
	    class179_sub3_152_.aClass363_9616 = null;
	if (Class338.method5869(i, anInt9558)) {
	    if (class179_sub3_153_.aShortArray9552 == null
		|| class179_sub3_153_.aShortArray9552.length < anInt9595)
		class179_sub3_152_.aShortArray9552
		    = class179_sub3_153_.aShortArray9552
		    = new short[anInt9595];
	    else
		class179_sub3_152_.aShortArray9552
		    = class179_sub3_153_.aShortArray9552;
	    for (int i_160_ = 0; i_160_ < anInt9595; i_160_++)
		class179_sub3_152_.aShortArray9552[i_160_]
		    = aShortArray9552[i_160_];
	} else
	    class179_sub3_152_.aShortArray9552 = aShortArray9552;
	if (Class338.method5957(i, anInt9558)) {
	    if (class179_sub3_153_.aByteArray9568 == null
		|| class179_sub3_153_.aByteArray9568.length < anInt9595)
		class179_sub3_152_.aByteArray9568
		    = class179_sub3_153_.aByteArray9568 = new byte[anInt9595];
	    else
		class179_sub3_152_.aByteArray9568
		    = class179_sub3_153_.aByteArray9568;
	    for (int i_161_ = 0; i_161_ < anInt9595; i_161_++)
		class179_sub3_152_.aByteArray9568[i_161_]
		    = aByteArray9568[i_161_];
	} else
	    class179_sub3_152_.aByteArray9568 = aByteArray9568;
	if (Class338.method5883(i, anInt9558)) {
	    class179_sub3_152_.aClass363_9577
		= class179_sub3_153_.aClass363_9577;
	    class179_sub3_152_.aClass363_9577.anInterface35_3834
		= aClass363_9577.anInterface35_3834;
	    class179_sub3_152_.aClass363_9577.aBool3835
		= aClass363_9577.aBool3835;
	    class179_sub3_152_.aClass363_9577.aBool3836 = true;
	} else if (Class338.method5878(i, anInt9558))
	    class179_sub3_152_.aClass363_9577 = aClass363_9577;
	else
	    class179_sub3_152_.aClass363_9577 = null;
	if (Class338.method5868(i, anInt9558)) {
	    if (class179_sub3_153_.aShortArray9617 == null
		|| class179_sub3_153_.aShortArray9617.length < anInt9555) {
		int i_162_ = anInt9555;
		class179_sub3_152_.aShortArray9617
		    = class179_sub3_153_.aShortArray9617 = new short[i_162_];
		class179_sub3_152_.aShortArray9559
		    = class179_sub3_153_.aShortArray9559 = new short[i_162_];
		class179_sub3_152_.aShortArray9560
		    = class179_sub3_153_.aShortArray9560 = new short[i_162_];
	    } else {
		class179_sub3_152_.aShortArray9617
		    = class179_sub3_153_.aShortArray9617;
		class179_sub3_152_.aShortArray9559
		    = class179_sub3_153_.aShortArray9559;
		class179_sub3_152_.aShortArray9560
		    = class179_sub3_153_.aShortArray9560;
	    }
	    if (aClass366_9564 != null) {
		if (class179_sub3_153_.aClass366_9564 == null)
		    class179_sub3_153_.aClass366_9564 = new Class366();
		Class366 class366 = (class179_sub3_152_.aClass366_9564
				     = class179_sub3_153_.aClass366_9564);
		if (class366.aShortArray3857 == null
		    || class366.aShortArray3857.length < anInt9555) {
		    int i_163_ = anInt9555;
		    class366.aShortArray3857 = new short[i_163_];
		    class366.aShortArray3856 = new short[i_163_];
		    class366.aShortArray3858 = new short[i_163_];
		    class366.aByteArray3855 = new byte[i_163_];
		}
		for (int i_164_ = 0; i_164_ < anInt9555; i_164_++) {
		    class179_sub3_152_.aShortArray9617[i_164_]
			= aShortArray9617[i_164_];
		    class179_sub3_152_.aShortArray9559[i_164_]
			= aShortArray9559[i_164_];
		    class179_sub3_152_.aShortArray9560[i_164_]
			= aShortArray9560[i_164_];
		    class366.aShortArray3857[i_164_]
			= aClass366_9564.aShortArray3857[i_164_];
		    class366.aShortArray3856[i_164_]
			= aClass366_9564.aShortArray3856[i_164_];
		    class366.aShortArray3858[i_164_]
			= aClass366_9564.aShortArray3858[i_164_];
		    class366.aByteArray3855[i_164_]
			= aClass366_9564.aByteArray3855[i_164_];
		}
	    } else {
		class179_sub3_152_.aClass366_9564 = null;
		for (int i_165_ = 0; i_165_ < anInt9555; i_165_++) {
		    class179_sub3_152_.aShortArray9617[i_165_]
			= aShortArray9617[i_165_];
		    class179_sub3_152_.aShortArray9559[i_165_]
			= aShortArray9559[i_165_];
		    class179_sub3_152_.aShortArray9560[i_165_]
			= aShortArray9560[i_165_];
		}
	    }
	    class179_sub3_152_.aByteArray9557 = aByteArray9557;
	} else {
	    class179_sub3_152_.aClass366_9564 = aClass366_9564;
	    class179_sub3_152_.aShortArray9617 = aShortArray9617;
	    class179_sub3_152_.aShortArray9559 = aShortArray9559;
	    class179_sub3_152_.aShortArray9560 = aShortArray9560;
	    class179_sub3_152_.aByteArray9557 = aByteArray9557;
	}
	if (Class338.method5882(i, anInt9558)) {
	    class179_sub3_152_.aClass363_9578
		= class179_sub3_153_.aClass363_9578;
	    class179_sub3_152_.aClass363_9578.anInterface35_3834
		= aClass363_9578.anInterface35_3834;
	    class179_sub3_152_.aClass363_9578.aBool3835
		= aClass363_9578.aBool3835;
	    class179_sub3_152_.aClass363_9578.aBool3836 = true;
	} else if (Class338.method5903(i, anInt9558))
	    class179_sub3_152_.aClass363_9578 = aClass363_9578;
	else
	    class179_sub3_152_.aClass363_9578 = null;
	if (Class338.method5871(i, anInt9558)) {
	    if (class179_sub3_153_.aFloatArray9562 == null
		|| class179_sub3_153_.aFloatArray9562.length < anInt9595) {
		int i_166_ = anInt9555;
		class179_sub3_152_.aFloatArray9562
		    = class179_sub3_153_.aFloatArray9562 = new float[i_166_];
		class179_sub3_152_.aFloatArray9563
		    = class179_sub3_153_.aFloatArray9563 = new float[i_166_];
	    } else {
		class179_sub3_152_.aFloatArray9562
		    = class179_sub3_153_.aFloatArray9562;
		class179_sub3_152_.aFloatArray9563
		    = class179_sub3_153_.aFloatArray9563;
	    }
	    for (int i_167_ = 0; i_167_ < anInt9555; i_167_++) {
		class179_sub3_152_.aFloatArray9562[i_167_]
		    = aFloatArray9562[i_167_];
		class179_sub3_152_.aFloatArray9563[i_167_]
		    = aFloatArray9563[i_167_];
	    }
	} else {
	    class179_sub3_152_.aFloatArray9562 = aFloatArray9562;
	    class179_sub3_152_.aFloatArray9563 = aFloatArray9563;
	}
	if (Class338.method5934(i, anInt9558)) {
	    class179_sub3_152_.aClass363_9579
		= class179_sub3_153_.aClass363_9579;
	    class179_sub3_152_.aClass363_9579.anInterface35_3834
		= aClass363_9579.anInterface35_3834;
	    class179_sub3_152_.aClass363_9579.aBool3835
		= aClass363_9579.aBool3835;
	    class179_sub3_152_.aClass363_9579.aBool3836 = true;
	} else if (Class338.method5898(i, anInt9558))
	    class179_sub3_152_.aClass363_9579 = aClass363_9579;
	else
	    class179_sub3_152_.aClass363_9579 = null;
	if (Class338.method5872(i, anInt9558)) {
	    if (class179_sub3_153_.aShortArray9561 == null
		|| class179_sub3_153_.aShortArray9561.length < anInt9595) {
		int i_168_ = anInt9595;
		class179_sub3_152_.aShortArray9561
		    = class179_sub3_153_.aShortArray9561 = new short[i_168_];
		class179_sub3_152_.aShortArray9570
		    = class179_sub3_153_.aShortArray9570 = new short[i_168_];
		class179_sub3_152_.aShortArray9571
		    = class179_sub3_153_.aShortArray9571 = new short[i_168_];
	    } else {
		class179_sub3_152_.aShortArray9561
		    = class179_sub3_153_.aShortArray9561;
		class179_sub3_152_.aShortArray9570
		    = class179_sub3_153_.aShortArray9570;
		class179_sub3_152_.aShortArray9571
		    = class179_sub3_153_.aShortArray9571;
	    }
	    for (int i_169_ = 0; i_169_ < anInt9595; i_169_++) {
		class179_sub3_152_.aShortArray9561[i_169_]
		    = aShortArray9561[i_169_];
		class179_sub3_152_.aShortArray9570[i_169_]
		    = aShortArray9570[i_169_];
		class179_sub3_152_.aShortArray9571[i_169_]
		    = aShortArray9571[i_169_];
	    }
	} else {
	    class179_sub3_152_.aShortArray9561 = aShortArray9561;
	    class179_sub3_152_.aShortArray9570 = aShortArray9570;
	    class179_sub3_152_.aShortArray9571 = aShortArray9571;
	}
	if (Class338.method5885(i, anInt9558)) {
	    class179_sub3_152_.aClass354_9575
		= class179_sub3_153_.aClass354_9575;
	    class179_sub3_152_.aClass354_9575.anInterface44_3786
		= aClass354_9575.anInterface44_3786;
	    class179_sub3_152_.aClass354_9575.aBool3787
		= aClass354_9575.aBool3787;
	    class179_sub3_152_.aClass354_9575.aBool3788 = true;
	} else if (Class338.method5880(i, anInt9558))
	    class179_sub3_152_.aClass354_9575 = aClass354_9575;
	else
	    class179_sub3_152_.aClass354_9575 = null;
	if (Class338.method5948(i, anInt9558)) {
	    if (class179_sub3_153_.aShortArray9605 == null
		|| class179_sub3_153_.aShortArray9605.length < anInt9595) {
		int i_170_ = anInt9595;
		class179_sub3_152_.aShortArray9605
		    = class179_sub3_153_.aShortArray9605 = new short[i_170_];
	    } else
		class179_sub3_152_.aShortArray9605
		    = class179_sub3_153_.aShortArray9605;
	    for (int i_171_ = 0; i_171_ < anInt9595; i_171_++)
		class179_sub3_152_.aShortArray9605[i_171_]
		    = aShortArray9605[i_171_];
	} else
	    class179_sub3_152_.aShortArray9605 = aShortArray9605;
	if (Class338.method5874(i, anInt9558)) {
	    if (class179_sub3_153_.aClass349Array9574 == null
		|| class179_sub3_153_.aClass349Array9574.length < anInt9603) {
		int i_172_ = anInt9603;
		class179_sub3_152_.aClass349Array9574
		    = class179_sub3_153_.aClass349Array9574
		    = new Class349[i_172_];
		for (int i_173_ = 0; i_173_ < anInt9603; i_173_++)
		    class179_sub3_152_.aClass349Array9574[i_173_]
			= aClass349Array9574[i_173_].method6120();
	    } else {
		class179_sub3_152_.aClass349Array9574
		    = class179_sub3_153_.aClass349Array9574;
		for (int i_174_ = 0; i_174_ < anInt9603; i_174_++)
		    class179_sub3_152_.aClass349Array9574[i_174_]
			.method6121(aClass349Array9574[i_174_]);
	    }
	} else
	    class179_sub3_152_.aClass349Array9574 = aClass349Array9574;
	class179_sub3_152_.aClass359Array9604 = aClass359Array9604;
	if (aBool9586) {
	    class179_sub3_152_.anInt9584 = anInt9584;
	    class179_sub3_152_.anInt9602 = anInt9602;
	    class179_sub3_152_.anInt9589 = anInt9589;
	    class179_sub3_152_.anInt9590 = anInt9590;
	    class179_sub3_152_.anInt9587 = anInt9587;
	    class179_sub3_152_.anInt9588 = anInt9588;
	    class179_sub3_152_.anInt9591 = anInt9591;
	    class179_sub3_152_.anInt9592 = anInt9592;
	    class179_sub3_152_.aBool9586 = true;
	} else
	    class179_sub3_152_.aBool9586 = false;
	if (aBool9593) {
	    class179_sub3_152_.anInt9594 = anInt9594;
	    class179_sub3_152_.aBool9593 = true;
	} else
	    class179_sub3_152_.aBool9593 = false;
	class179_sub3_152_.anIntArrayArray9553 = anIntArrayArray9553;
	class179_sub3_152_.anIntArrayArray9573 = anIntArrayArray9573;
	class179_sub3_152_.anIntArrayArray9543 = anIntArrayArray9543;
	class179_sub3_152_.aShortArray9599 = aShortArray9599;
	class179_sub3_152_.anIntArray9598 = anIntArray9598;
	class179_sub3_152_.aShortArray9556 = aShortArray9556;
	class179_sub3_152_.aShortArray9545 = aShortArray9545;
	class179_sub3_152_.aShortArray9548 = aShortArray9548;
	class179_sub3_152_.aShortArray9615 = aShortArray9615;
	class179_sub3_152_.anIntArray9567 = anIntArray9567;
	class179_sub3_152_.anIntArray9597 = anIntArray9597;
	class179_sub3_152_.anIntArray9596 = anIntArray9596;
	class179_sub3_152_.aClass184Array9600 = aClass184Array9600;
	class179_sub3_152_.aClass154Array9601 = aClass154Array9601;
	return class179_sub3_152_;
    }
    
    public Class525_Sub16_Sub17 method3023
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	if (anInt9555 == 0)
	    return null;
	if (!aBool9586)
	    method15278();
	int i;
	int i_175_;
	if (aClass182_Sub1_9585.anInt9244 > 0) {
	    i = (anInt9589 - (anInt9588 * aClass182_Sub1_9585.anInt9244 >> 8)
		 >> aClass182_Sub1_9585.anInt9243);
	    i_175_ = anInt9590 - (anInt9587 * aClass182_Sub1_9585.anInt9244
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	} else {
	    i = (anInt9589 - (anInt9587 * aClass182_Sub1_9585.anInt9244 >> 8)
		 >> aClass182_Sub1_9585.anInt9243);
	    i_175_ = anInt9590 - (anInt9588 * aClass182_Sub1_9585.anInt9244
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	}
	int i_176_;
	int i_177_;
	if (aClass182_Sub1_9585.anInt9245 > 0) {
	    i_176_ = anInt9591 - (anInt9588 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	    i_177_ = anInt9592 - (anInt9587 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	} else {
	    i_176_ = anInt9591 - (anInt9587 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	    i_177_ = anInt9592 - (anInt9588 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	}
	int i_178_ = i_175_ - i + 1;
	int i_179_ = i_177_ - i_176_ + 1;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2_180_;
	if (class525_sub16_sub17_sub2 != null
	    && class525_sub16_sub17_sub2.method18886(i_178_, i_179_)) {
	    class525_sub16_sub17_sub2_180_ = class525_sub16_sub17_sub2;
	    class525_sub16_sub17_sub2_180_.method18881();
	} else
	    class525_sub16_sub17_sub2_180_
		= new Class525_Sub16_Sub17_Sub2(aClass182_Sub1_9585, i_178_,
						i_179_);
	class525_sub16_sub17_sub2_180_.method18882(i, i_176_, i_175_, i_177_);
	method15282(class525_sub16_sub17_sub2_180_);
	return class525_sub16_sub17_sub2_180_;
    }
    
    public void method3072() {
	for (int i = 0; i < anInt9549; i++)
	    anIntArray9541[i] = -anIntArray9541[i];
	for (int i = 0; i < anInt9555; i++)
	    aShortArray9560[i] = (short) -aShortArray9560[i];
	for (int i = 0; i < anInt9595; i++) {
	    short i_181_ = aShortArray9561[i];
	    aShortArray9561[i] = aShortArray9571[i];
	    aShortArray9571[i] = i_181_;
	}
	method15326();
	method15273();
	method15274();
	aBool9586 = false;
    }
    
    public void method2966(int i) {
	aShort9546 = (short) i;
	method15290();
    }
    
    void method15273() {
	if ((anInt9558 & 0x37) != 0) {
	    if (aClass363_9578 != null)
		aClass363_9578.aBool3835 = false;
	} else if (aClass363_9577 != null)
	    aClass363_9577.aBool3835 = false;
    }
    
    void method15274() {
	if (aClass354_9575 != null)
	    aClass354_9575.aBool3787 = false;
    }
    
    public void method2930(int i) {
	int i_182_ = Class436.anIntArray4831[i];
	int i_183_ = Class436.anIntArray4838[i];
	for (int i_184_ = 0; i_184_ < anInt9549; i_184_++) {
	    int i_185_ = ((anIntArray9541[i_184_] * i_182_
			   + anIntArray9550[i_184_] * i_183_)
			  >> 14);
	    anIntArray9541[i_184_] = (anIntArray9541[i_184_] * i_183_
				      - anIntArray9550[i_184_] * i_182_) >> 14;
	    anIntArray9550[i_184_] = i_185_;
	}
	method15326();
	aBool9586 = false;
    }
    
    boolean method15275(int i, int i_186_, int i_187_, int i_188_, int i_189_,
			int i_190_, int i_191_, int i_192_, int i_193_,
			int i_194_) {
	if (i_188_ < i_189_ && i_188_ < i_190_ && i_188_ < i_191_)
	    return false;
	if (i_186_ > i_189_ && i_186_ > i_190_ && i_186_ > i_191_)
	    return false;
	if (i_187_ < i_192_ && i_187_ < i_193_ && i_187_ < i_194_)
	    return false;
	if (i > i_192_ && i > i_193_ && i > i_194_)
	    return false;
	return true;
    }
    
    void method15276() {
	if ((anInt9558 & 0x37) != 0) {
	    if (aClass363_9578 != null)
		aClass363_9578.aBool3835 = false;
	} else if (aClass363_9577 != null)
	    aClass363_9577.aBool3835 = false;
    }
    
    void method2950(int i, int i_195_, int i_196_, int i_197_) {
	if (i == 0) {
	    int i_198_ = 0;
	    anInt9613 = 0;
	    anInt9614 = 0;
	    anInt9576 = 0;
	    for (int i_199_ = 0; i_199_ < anInt9549; i_199_++) {
		anInt9613 += anIntArray9550[i_199_];
		anInt9614 += anIntArray9551[i_199_];
		anInt9576 += anIntArray9541[i_199_];
		i_198_++;
	    }
	    if (i_198_ > 0) {
		anInt9613 = anInt9613 / i_198_ + i_195_;
		anInt9614 = anInt9614 / i_198_ + i_196_;
		anInt9576 = anInt9576 / i_198_ + i_197_;
	    } else {
		anInt9613 = i_195_;
		anInt9614 = i_196_;
		anInt9576 = i_197_;
	    }
	} else if (i == 1) {
	    for (int i_200_ = 0; i_200_ < anInt9549; i_200_++) {
		anIntArray9550[i_200_] += i_195_;
		anIntArray9551[i_200_] += i_196_;
		anIntArray9541[i_200_] += i_197_;
	    }
	} else if (i == 2) {
	    for (int i_201_ = 0; i_201_ < anInt9549; i_201_++) {
		anIntArray9550[i_201_] -= anInt9613;
		anIntArray9551[i_201_] -= anInt9614;
		anIntArray9541[i_201_] -= anInt9576;
		if (i_197_ != 0) {
		    int i_202_ = Class436.anIntArray4831[i_197_];
		    int i_203_ = Class436.anIntArray4838[i_197_];
		    int i_204_ = ((anIntArray9551[i_201_] * i_202_
				   + anIntArray9550[i_201_] * i_203_ + 16383)
				  >> 14);
		    anIntArray9551[i_201_]
			= (anIntArray9551[i_201_] * i_203_
			   - anIntArray9550[i_201_] * i_202_ + 16383) >> 14;
		    anIntArray9550[i_201_] = i_204_;
		}
		if (i_195_ != 0) {
		    int i_205_ = Class436.anIntArray4831[i_195_];
		    int i_206_ = Class436.anIntArray4838[i_195_];
		    int i_207_ = ((anIntArray9551[i_201_] * i_206_
				   - anIntArray9541[i_201_] * i_205_ + 16383)
				  >> 14);
		    anIntArray9541[i_201_]
			= (anIntArray9551[i_201_] * i_205_
			   + anIntArray9541[i_201_] * i_206_ + 16383) >> 14;
		    anIntArray9551[i_201_] = i_207_;
		}
		if (i_196_ != 0) {
		    int i_208_ = Class436.anIntArray4831[i_196_];
		    int i_209_ = Class436.anIntArray4838[i_196_];
		    int i_210_ = ((anIntArray9541[i_201_] * i_208_
				   + anIntArray9550[i_201_] * i_209_ + 16383)
				  >> 14);
		    anIntArray9541[i_201_]
			= (anIntArray9541[i_201_] * i_209_
			   - anIntArray9550[i_201_] * i_208_ + 16383) >> 14;
		    anIntArray9550[i_201_] = i_210_;
		}
		anIntArray9550[i_201_] += anInt9613;
		anIntArray9551[i_201_] += anInt9614;
		anIntArray9541[i_201_] += anInt9576;
	    }
	} else if (i == 3) {
	    for (int i_211_ = 0; i_211_ < anInt9549; i_211_++) {
		anIntArray9550[i_211_] -= anInt9613;
		anIntArray9551[i_211_] -= anInt9614;
		anIntArray9541[i_211_] -= anInt9576;
		anIntArray9550[i_211_] = anIntArray9550[i_211_] * i_195_ / 128;
		anIntArray9551[i_211_] = anIntArray9551[i_211_] * i_196_ / 128;
		anIntArray9541[i_211_] = anIntArray9541[i_211_] * i_197_ / 128;
		anIntArray9550[i_211_] += anInt9613;
		anIntArray9551[i_211_] += anInt9614;
		anIntArray9541[i_211_] += anInt9576;
	    }
	} else if (i == 5) {
	    for (int i_212_ = 0; i_212_ < anInt9595; i_212_++) {
		int i_213_ = (aByteArray9568[i_212_] & 0xff) + i_195_ * 8;
		if (i_213_ < 0)
		    i_213_ = 0;
		else if (i_213_ > 255)
		    i_213_ = 255;
		aByteArray9568[i_212_] = (byte) i_213_;
	    }
	    if (aClass359Array9604 != null) {
		for (int i_214_ = 0; i_214_ < anInt9603; i_214_++) {
		    Class359 class359 = aClass359Array9604[i_214_];
		    Class349 class349 = aClass349Array9574[i_214_];
		    class349.anInt3739
			= (class349.anInt3739 & 0xffffff
			   | (255 - (aByteArray9568[class359.anInt3805] & 0xff)
			      << 24));
		}
	    }
	    method15290();
	} else if (i == 7) {
	    for (int i_215_ = 0; i_215_ < anInt9595; i_215_++) {
		int i_216_ = aShortArray9552[i_215_] & 0xffff;
		int i_217_ = i_216_ >> 10 & 0x3f;
		int i_218_ = i_216_ >> 7 & 0x7;
		int i_219_ = i_216_ & 0x7f;
		i_217_ = i_217_ + i_195_ & 0x3f;
		i_218_ += i_196_ / 4;
		if (i_218_ < 0)
		    i_218_ = 0;
		else if (i_218_ > 7)
		    i_218_ = 7;
		i_219_ += i_197_;
		if (i_219_ < 0)
		    i_219_ = 0;
		else if (i_219_ > 127)
		    i_219_ = 127;
		aShortArray9552[i_215_]
		    = (short) (i_217_ << 10 | i_218_ << 7 | i_219_);
	    }
	    if (aClass359Array9604 != null) {
		for (int i_220_ = 0; i_220_ < anInt9603; i_220_++) {
		    Class359 class359 = aClass359Array9604[i_220_];
		    Class349 class349 = aClass349Array9574[i_220_];
		    class349.anInt3739
			= (class349.anInt3739 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9552[class359.anInt3805] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15290();
	} else if (i == 8) {
	    for (int i_221_ = 0; i_221_ < anInt9603; i_221_++) {
		Class349 class349 = aClass349Array9574[i_221_];
		class349.anInt3738 += i_195_;
		class349.anInt3735 += i_196_;
	    }
	} else if (i == 10) {
	    for (int i_222_ = 0; i_222_ < anInt9603; i_222_++) {
		Class349 class349 = aClass349Array9574[i_222_];
		class349.anInt3740 = class349.anInt3740 * i_195_ >> 7;
		class349.anInt3737 = class349.anInt3737 * i_196_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_223_ = 0; i_223_ < anInt9603; i_223_++) {
		Class349 class349 = aClass349Array9574[i_223_];
		class349.anInt3736 = class349.anInt3736 + i_195_ & 0x3fff;
	    }
	}
    }
    
    public void method2934(int i, int i_224_, int i_225_) {
	for (int i_226_ = 0; i_226_ < anInt9549; i_226_++) {
	    if (i != 0)
		anIntArray9550[i_226_] += i;
	    if (i_224_ != 0)
		anIntArray9551[i_226_] += i_224_;
	    if (i_225_ != 0)
		anIntArray9541[i_226_] += i_225_;
	}
	method15326();
	aBool9586 = false;
    }
    
    public Class525_Sub16_Sub17 method3022
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	if (anInt9555 == 0)
	    return null;
	if (!aBool9586)
	    method15278();
	int i;
	int i_227_;
	if (aClass182_Sub1_9585.anInt9244 > 0) {
	    i = (anInt9589 - (anInt9588 * aClass182_Sub1_9585.anInt9244 >> 8)
		 >> aClass182_Sub1_9585.anInt9243);
	    i_227_ = anInt9590 - (anInt9587 * aClass182_Sub1_9585.anInt9244
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	} else {
	    i = (anInt9589 - (anInt9587 * aClass182_Sub1_9585.anInt9244 >> 8)
		 >> aClass182_Sub1_9585.anInt9243);
	    i_227_ = anInt9590 - (anInt9588 * aClass182_Sub1_9585.anInt9244
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	}
	int i_228_;
	int i_229_;
	if (aClass182_Sub1_9585.anInt9245 > 0) {
	    i_228_ = anInt9591 - (anInt9588 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	    i_229_ = anInt9592 - (anInt9587 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	} else {
	    i_228_ = anInt9591 - (anInt9587 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	    i_229_ = anInt9592 - (anInt9588 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	}
	int i_230_ = i_227_ - i + 1;
	int i_231_ = i_229_ - i_228_ + 1;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2_232_;
	if (class525_sub16_sub17_sub2 != null
	    && class525_sub16_sub17_sub2.method18886(i_230_, i_231_)) {
	    class525_sub16_sub17_sub2_232_ = class525_sub16_sub17_sub2;
	    class525_sub16_sub17_sub2_232_.method18881();
	} else
	    class525_sub16_sub17_sub2_232_
		= new Class525_Sub16_Sub17_Sub2(aClass182_Sub1_9585, i_230_,
						i_231_);
	class525_sub16_sub17_sub2_232_.method18882(i, i_228_, i_227_, i_229_);
	method15282(class525_sub16_sub17_sub2_232_);
	return class525_sub16_sub17_sub2_232_;
    }
    
    public void method2936(int i, int i_233_, int i_234_) {
	for (int i_235_ = 0; i_235_ < anInt9549; i_235_++) {
	    if (i != 128)
		anIntArray9550[i_235_] = anIntArray9550[i_235_] * i >> 7;
	    if (i_233_ != 128)
		anIntArray9551[i_235_] = anIntArray9551[i_235_] * i_233_ >> 7;
	    if (i_234_ != 128)
		anIntArray9541[i_235_] = anIntArray9541[i_235_] * i_234_ >> 7;
	}
	method15326();
	aBool9586 = false;
    }
    
    public void method2937(int i, int i_236_, Class161 class161,
			   Class161 class161_237_, int i_238_, int i_239_,
			   int i_240_) {
	if (!aBool9586)
	    method15278();
	int i_241_ = i_238_ + anInt9589;
	int i_242_ = i_238_ + anInt9590;
	int i_243_ = i_240_ + anInt9591;
	int i_244_ = i_240_ + anInt9592;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_241_ >= 0
		&& ((i_242_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1759 * 363736815)
		&& i_243_ >= 0
		&& ((i_244_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1760 * -1152334393))) {
	    if (i == 4 || i == 5) {
		if (class161_237_ == null
		    || (i_241_ < 0
			|| ((i_242_ + class161_237_.anInt1761 * 435863595
			     >> class161_237_.anInt1763 * -2063427645)
			    >= class161_237_.anInt1759 * 363736815)
			|| i_243_ < 0
			|| ((i_244_ + class161_237_.anInt1761 * 435863595
			     >> class161_237_.anInt1763 * -2063427645)
			    >= class161_237_.anInt1760 * -1152334393)))
		    return;
	    } else {
		i_241_ >>= class161.anInt1763 * -2063427645;
		i_242_ = (i_242_ + (class161.anInt1761 * 435863595 - 1)
			  >> class161.anInt1763 * -2063427645);
		i_243_ >>= class161.anInt1763 * -2063427645;
		i_244_ = (i_244_ + (class161.anInt1761 * 435863595 - 1)
			  >> class161.anInt1763 * -2063427645);
		if (class161.method2577(i_241_, i_243_, (byte) -100) == i_239_
		    && (class161.method2577(i_242_, i_243_, (byte) -28)
			== i_239_)
		    && (class161.method2577(i_241_, i_244_, (byte) -46)
			== i_239_)
		    && (class161.method2577(i_242_, i_244_, (byte) 59)
			== i_239_))
		    return;
	    }
	    if (i == 1) {
		for (int i_245_ = 0; i_245_ < anInt9549; i_245_++)
		    anIntArray9551[i_245_]
			= (anIntArray9551[i_245_]
			   + class161.method2588((anIntArray9550[i_245_]
						  + i_238_),
						 (anIntArray9541[i_245_]
						  + i_240_),
						 -569433317)
			   - i_239_);
	    } else if (i == 2) {
		int i_246_ = anInt9587;
		if (i_246_ == 0)
		    return;
		for (int i_247_ = 0; i_247_ < anInt9549; i_247_++) {
		    int i_248_ = (anIntArray9551[i_247_] << 16) / i_246_;
		    if (i_248_ < i_236_)
			anIntArray9551[i_247_]
			    = (anIntArray9551[i_247_]
			       + (class161.method2588((anIntArray9550[i_247_]
						       + i_238_),
						      (anIntArray9541[i_247_]
						       + i_240_),
						      -1156654504)
				  - i_239_) * (i_236_ - i_248_) / i_236_);
		}
	    } else if (i == 3) {
		int i_249_ = (i_236_ & 0xff) * 16;
		int i_250_ = (i_236_ >> 8 & 0xff) * 16;
		int i_251_ = (i_236_ >> 16 & 0xff) << 6;
		int i_252_ = (i_236_ >> 24 & 0xff) << 6;
		if (i_238_ - (i_249_ >> 1) < 0
		    || (i_238_ + (i_249_ >> 1) + class161.anInt1761 * 435863595
			>= (class161.anInt1759 * 363736815
			    << class161.anInt1763 * -2063427645))
		    || i_240_ - (i_250_ >> 1) < 0
		    || (i_240_ + (i_250_ >> 1) + class161.anInt1761 * 435863595
			>= (class161.anInt1760 * -1152334393
			    << class161.anInt1763 * -2063427645)))
		    return;
		method2938(class161, i_238_, i_239_, i_240_, i_249_, i_250_,
			   i_251_, i_252_);
	    } else if (i == 4) {
		int i_253_ = anInt9588 - anInt9587;
		for (int i_254_ = 0; i_254_ < anInt9549; i_254_++)
		    anIntArray9551[i_254_]
			= (anIntArray9551[i_254_]
			   + (class161_237_.method2588((anIntArray9550[i_254_]
							+ i_238_),
						       (anIntArray9541[i_254_]
							+ i_240_),
						       334816511)
			      - i_239_)
			   + i_253_);
	    } else if (i == 5) {
		int i_255_ = anInt9588 - anInt9587;
		for (int i_256_ = 0; i_256_ < anInt9549; i_256_++) {
		    int i_257_ = anIntArray9550[i_256_] + i_238_;
		    int i_258_ = anIntArray9541[i_256_] + i_240_;
		    int i_259_
			= class161.method2588(i_257_, i_258_, -1006635958);
		    int i_260_
			= class161_237_.method2588(i_257_, i_258_, -751471297);
		    int i_261_ = i_259_ - i_260_ - i_236_;
		    anIntArray9551[i_256_]
			= ((anIntArray9551[i_256_] << 8) / i_255_ * i_261_
			   >> 8) - (i_239_ - i_259_);
		}
	    }
	    method15326();
	    aBool9586 = false;
	}
    }
    
    Class179 method15277(Class179_Sub3 class179_sub3_262_,
			 Class179_Sub3 class179_sub3_263_, int i, boolean bool,
			 boolean bool_264_) {
	class179_sub3_262_.anInt9544 = i;
	class179_sub3_262_.anInt9558 = anInt9558;
	class179_sub3_262_.aShort9546 = aShort9546;
	class179_sub3_262_.aShort9572 = aShort9572;
	class179_sub3_262_.anInt9583 = anInt9583;
	class179_sub3_262_.anInt9549 = anInt9549;
	class179_sub3_262_.anInt9555 = anInt9555;
	class179_sub3_262_.anInt9595 = anInt9595;
	class179_sub3_262_.anInt9566 = anInt9566;
	class179_sub3_262_.anInt9603 = anInt9603;
	if ((i & 0x100) != 0)
	    class179_sub3_262_.aBool9582 = true;
	else
	    class179_sub3_262_.aBool9582 = aBool9582;
	class179_sub3_262_.aBool9606 = aBool9606;
	boolean bool_265_ = Class338.method5864(i, anInt9558);
	boolean bool_266_ = Class338.method5865(i, anInt9558);
	boolean bool_267_ = Class338.method5866(i, anInt9558);
	boolean bool_268_ = bool_265_ | bool_266_ | bool_267_;
	if (bool_268_) {
	    if (bool_265_) {
		if (class179_sub3_263_.anIntArray9550 == null
		    || class179_sub3_263_.anIntArray9550.length < anInt9583)
		    class179_sub3_262_.anIntArray9550
			= class179_sub3_263_.anIntArray9550
			= new int[anInt9583];
		else
		    class179_sub3_262_.anIntArray9550
			= class179_sub3_263_.anIntArray9550;
	    } else
		class179_sub3_262_.anIntArray9550 = anIntArray9550;
	    if (bool_266_) {
		if (class179_sub3_263_.anIntArray9551 == null
		    || class179_sub3_263_.anIntArray9551.length < anInt9583)
		    class179_sub3_262_.anIntArray9551
			= class179_sub3_263_.anIntArray9551
			= new int[anInt9583];
		else
		    class179_sub3_262_.anIntArray9551
			= class179_sub3_263_.anIntArray9551;
	    } else
		class179_sub3_262_.anIntArray9551 = anIntArray9551;
	    if (bool_267_) {
		if (class179_sub3_263_.anIntArray9541 == null
		    || class179_sub3_263_.anIntArray9541.length < anInt9583)
		    class179_sub3_262_.anIntArray9541
			= class179_sub3_263_.anIntArray9541
			= new int[anInt9583];
		else
		    class179_sub3_262_.anIntArray9541
			= class179_sub3_263_.anIntArray9541;
	    } else
		class179_sub3_262_.anIntArray9541 = anIntArray9541;
	    for (int i_269_ = 0; i_269_ < anInt9583; i_269_++) {
		if (bool_265_)
		    class179_sub3_262_.anIntArray9550[i_269_]
			= anIntArray9550[i_269_];
		if (bool_266_)
		    class179_sub3_262_.anIntArray9551[i_269_]
			= anIntArray9551[i_269_];
		if (bool_267_)
		    class179_sub3_262_.anIntArray9541[i_269_]
			= anIntArray9541[i_269_];
	    }
	} else {
	    class179_sub3_262_.anIntArray9550 = anIntArray9550;
	    class179_sub3_262_.anIntArray9551 = anIntArray9551;
	    class179_sub3_262_.anIntArray9541 = anIntArray9541;
	}
	if (Class338.method5881(i, anInt9558)) {
	    class179_sub3_262_.aClass363_9616
		= class179_sub3_263_.aClass363_9616;
	    class179_sub3_262_.aClass363_9616.anInterface35_3834
		= aClass363_9616.anInterface35_3834;
	    class179_sub3_262_.aClass363_9616.aBool3835
		= aClass363_9616.aBool3835;
	    class179_sub3_262_.aClass363_9616.aBool3836 = true;
	} else if (Class338.method5876(i, anInt9558))
	    class179_sub3_262_.aClass363_9616 = aClass363_9616;
	else
	    class179_sub3_262_.aClass363_9616 = null;
	if (Class338.method5869(i, anInt9558)) {
	    if (class179_sub3_263_.aShortArray9552 == null
		|| class179_sub3_263_.aShortArray9552.length < anInt9595)
		class179_sub3_262_.aShortArray9552
		    = class179_sub3_263_.aShortArray9552
		    = new short[anInt9595];
	    else
		class179_sub3_262_.aShortArray9552
		    = class179_sub3_263_.aShortArray9552;
	    for (int i_270_ = 0; i_270_ < anInt9595; i_270_++)
		class179_sub3_262_.aShortArray9552[i_270_]
		    = aShortArray9552[i_270_];
	} else
	    class179_sub3_262_.aShortArray9552 = aShortArray9552;
	if (Class338.method5957(i, anInt9558)) {
	    if (class179_sub3_263_.aByteArray9568 == null
		|| class179_sub3_263_.aByteArray9568.length < anInt9595)
		class179_sub3_262_.aByteArray9568
		    = class179_sub3_263_.aByteArray9568 = new byte[anInt9595];
	    else
		class179_sub3_262_.aByteArray9568
		    = class179_sub3_263_.aByteArray9568;
	    for (int i_271_ = 0; i_271_ < anInt9595; i_271_++)
		class179_sub3_262_.aByteArray9568[i_271_]
		    = aByteArray9568[i_271_];
	} else
	    class179_sub3_262_.aByteArray9568 = aByteArray9568;
	if (Class338.method5883(i, anInt9558)) {
	    class179_sub3_262_.aClass363_9577
		= class179_sub3_263_.aClass363_9577;
	    class179_sub3_262_.aClass363_9577.anInterface35_3834
		= aClass363_9577.anInterface35_3834;
	    class179_sub3_262_.aClass363_9577.aBool3835
		= aClass363_9577.aBool3835;
	    class179_sub3_262_.aClass363_9577.aBool3836 = true;
	} else if (Class338.method5878(i, anInt9558))
	    class179_sub3_262_.aClass363_9577 = aClass363_9577;
	else
	    class179_sub3_262_.aClass363_9577 = null;
	if (Class338.method5868(i, anInt9558)) {
	    if (class179_sub3_263_.aShortArray9617 == null
		|| class179_sub3_263_.aShortArray9617.length < anInt9555) {
		int i_272_ = anInt9555;
		class179_sub3_262_.aShortArray9617
		    = class179_sub3_263_.aShortArray9617 = new short[i_272_];
		class179_sub3_262_.aShortArray9559
		    = class179_sub3_263_.aShortArray9559 = new short[i_272_];
		class179_sub3_262_.aShortArray9560
		    = class179_sub3_263_.aShortArray9560 = new short[i_272_];
	    } else {
		class179_sub3_262_.aShortArray9617
		    = class179_sub3_263_.aShortArray9617;
		class179_sub3_262_.aShortArray9559
		    = class179_sub3_263_.aShortArray9559;
		class179_sub3_262_.aShortArray9560
		    = class179_sub3_263_.aShortArray9560;
	    }
	    if (aClass366_9564 != null) {
		if (class179_sub3_263_.aClass366_9564 == null)
		    class179_sub3_263_.aClass366_9564 = new Class366();
		Class366 class366 = (class179_sub3_262_.aClass366_9564
				     = class179_sub3_263_.aClass366_9564);
		if (class366.aShortArray3857 == null
		    || class366.aShortArray3857.length < anInt9555) {
		    int i_273_ = anInt9555;
		    class366.aShortArray3857 = new short[i_273_];
		    class366.aShortArray3856 = new short[i_273_];
		    class366.aShortArray3858 = new short[i_273_];
		    class366.aByteArray3855 = new byte[i_273_];
		}
		for (int i_274_ = 0; i_274_ < anInt9555; i_274_++) {
		    class179_sub3_262_.aShortArray9617[i_274_]
			= aShortArray9617[i_274_];
		    class179_sub3_262_.aShortArray9559[i_274_]
			= aShortArray9559[i_274_];
		    class179_sub3_262_.aShortArray9560[i_274_]
			= aShortArray9560[i_274_];
		    class366.aShortArray3857[i_274_]
			= aClass366_9564.aShortArray3857[i_274_];
		    class366.aShortArray3856[i_274_]
			= aClass366_9564.aShortArray3856[i_274_];
		    class366.aShortArray3858[i_274_]
			= aClass366_9564.aShortArray3858[i_274_];
		    class366.aByteArray3855[i_274_]
			= aClass366_9564.aByteArray3855[i_274_];
		}
	    } else {
		class179_sub3_262_.aClass366_9564 = null;
		for (int i_275_ = 0; i_275_ < anInt9555; i_275_++) {
		    class179_sub3_262_.aShortArray9617[i_275_]
			= aShortArray9617[i_275_];
		    class179_sub3_262_.aShortArray9559[i_275_]
			= aShortArray9559[i_275_];
		    class179_sub3_262_.aShortArray9560[i_275_]
			= aShortArray9560[i_275_];
		}
	    }
	    class179_sub3_262_.aByteArray9557 = aByteArray9557;
	} else {
	    class179_sub3_262_.aClass366_9564 = aClass366_9564;
	    class179_sub3_262_.aShortArray9617 = aShortArray9617;
	    class179_sub3_262_.aShortArray9559 = aShortArray9559;
	    class179_sub3_262_.aShortArray9560 = aShortArray9560;
	    class179_sub3_262_.aByteArray9557 = aByteArray9557;
	}
	if (Class338.method5882(i, anInt9558)) {
	    class179_sub3_262_.aClass363_9578
		= class179_sub3_263_.aClass363_9578;
	    class179_sub3_262_.aClass363_9578.anInterface35_3834
		= aClass363_9578.anInterface35_3834;
	    class179_sub3_262_.aClass363_9578.aBool3835
		= aClass363_9578.aBool3835;
	    class179_sub3_262_.aClass363_9578.aBool3836 = true;
	} else if (Class338.method5903(i, anInt9558))
	    class179_sub3_262_.aClass363_9578 = aClass363_9578;
	else
	    class179_sub3_262_.aClass363_9578 = null;
	if (Class338.method5871(i, anInt9558)) {
	    if (class179_sub3_263_.aFloatArray9562 == null
		|| class179_sub3_263_.aFloatArray9562.length < anInt9595) {
		int i_276_ = anInt9555;
		class179_sub3_262_.aFloatArray9562
		    = class179_sub3_263_.aFloatArray9562 = new float[i_276_];
		class179_sub3_262_.aFloatArray9563
		    = class179_sub3_263_.aFloatArray9563 = new float[i_276_];
	    } else {
		class179_sub3_262_.aFloatArray9562
		    = class179_sub3_263_.aFloatArray9562;
		class179_sub3_262_.aFloatArray9563
		    = class179_sub3_263_.aFloatArray9563;
	    }
	    for (int i_277_ = 0; i_277_ < anInt9555; i_277_++) {
		class179_sub3_262_.aFloatArray9562[i_277_]
		    = aFloatArray9562[i_277_];
		class179_sub3_262_.aFloatArray9563[i_277_]
		    = aFloatArray9563[i_277_];
	    }
	} else {
	    class179_sub3_262_.aFloatArray9562 = aFloatArray9562;
	    class179_sub3_262_.aFloatArray9563 = aFloatArray9563;
	}
	if (Class338.method5934(i, anInt9558)) {
	    class179_sub3_262_.aClass363_9579
		= class179_sub3_263_.aClass363_9579;
	    class179_sub3_262_.aClass363_9579.anInterface35_3834
		= aClass363_9579.anInterface35_3834;
	    class179_sub3_262_.aClass363_9579.aBool3835
		= aClass363_9579.aBool3835;
	    class179_sub3_262_.aClass363_9579.aBool3836 = true;
	} else if (Class338.method5898(i, anInt9558))
	    class179_sub3_262_.aClass363_9579 = aClass363_9579;
	else
	    class179_sub3_262_.aClass363_9579 = null;
	if (Class338.method5872(i, anInt9558)) {
	    if (class179_sub3_263_.aShortArray9561 == null
		|| class179_sub3_263_.aShortArray9561.length < anInt9595) {
		int i_278_ = anInt9595;
		class179_sub3_262_.aShortArray9561
		    = class179_sub3_263_.aShortArray9561 = new short[i_278_];
		class179_sub3_262_.aShortArray9570
		    = class179_sub3_263_.aShortArray9570 = new short[i_278_];
		class179_sub3_262_.aShortArray9571
		    = class179_sub3_263_.aShortArray9571 = new short[i_278_];
	    } else {
		class179_sub3_262_.aShortArray9561
		    = class179_sub3_263_.aShortArray9561;
		class179_sub3_262_.aShortArray9570
		    = class179_sub3_263_.aShortArray9570;
		class179_sub3_262_.aShortArray9571
		    = class179_sub3_263_.aShortArray9571;
	    }
	    for (int i_279_ = 0; i_279_ < anInt9595; i_279_++) {
		class179_sub3_262_.aShortArray9561[i_279_]
		    = aShortArray9561[i_279_];
		class179_sub3_262_.aShortArray9570[i_279_]
		    = aShortArray9570[i_279_];
		class179_sub3_262_.aShortArray9571[i_279_]
		    = aShortArray9571[i_279_];
	    }
	} else {
	    class179_sub3_262_.aShortArray9561 = aShortArray9561;
	    class179_sub3_262_.aShortArray9570 = aShortArray9570;
	    class179_sub3_262_.aShortArray9571 = aShortArray9571;
	}
	if (Class338.method5885(i, anInt9558)) {
	    class179_sub3_262_.aClass354_9575
		= class179_sub3_263_.aClass354_9575;
	    class179_sub3_262_.aClass354_9575.anInterface44_3786
		= aClass354_9575.anInterface44_3786;
	    class179_sub3_262_.aClass354_9575.aBool3787
		= aClass354_9575.aBool3787;
	    class179_sub3_262_.aClass354_9575.aBool3788 = true;
	} else if (Class338.method5880(i, anInt9558))
	    class179_sub3_262_.aClass354_9575 = aClass354_9575;
	else
	    class179_sub3_262_.aClass354_9575 = null;
	if (Class338.method5948(i, anInt9558)) {
	    if (class179_sub3_263_.aShortArray9605 == null
		|| class179_sub3_263_.aShortArray9605.length < anInt9595) {
		int i_280_ = anInt9595;
		class179_sub3_262_.aShortArray9605
		    = class179_sub3_263_.aShortArray9605 = new short[i_280_];
	    } else
		class179_sub3_262_.aShortArray9605
		    = class179_sub3_263_.aShortArray9605;
	    for (int i_281_ = 0; i_281_ < anInt9595; i_281_++)
		class179_sub3_262_.aShortArray9605[i_281_]
		    = aShortArray9605[i_281_];
	} else
	    class179_sub3_262_.aShortArray9605 = aShortArray9605;
	if (Class338.method5874(i, anInt9558)) {
	    if (class179_sub3_263_.aClass349Array9574 == null
		|| class179_sub3_263_.aClass349Array9574.length < anInt9603) {
		int i_282_ = anInt9603;
		class179_sub3_262_.aClass349Array9574
		    = class179_sub3_263_.aClass349Array9574
		    = new Class349[i_282_];
		for (int i_283_ = 0; i_283_ < anInt9603; i_283_++)
		    class179_sub3_262_.aClass349Array9574[i_283_]
			= aClass349Array9574[i_283_].method6120();
	    } else {
		class179_sub3_262_.aClass349Array9574
		    = class179_sub3_263_.aClass349Array9574;
		for (int i_284_ = 0; i_284_ < anInt9603; i_284_++)
		    class179_sub3_262_.aClass349Array9574[i_284_]
			.method6121(aClass349Array9574[i_284_]);
	    }
	} else
	    class179_sub3_262_.aClass349Array9574 = aClass349Array9574;
	class179_sub3_262_.aClass359Array9604 = aClass359Array9604;
	if (aBool9586) {
	    class179_sub3_262_.anInt9584 = anInt9584;
	    class179_sub3_262_.anInt9602 = anInt9602;
	    class179_sub3_262_.anInt9589 = anInt9589;
	    class179_sub3_262_.anInt9590 = anInt9590;
	    class179_sub3_262_.anInt9587 = anInt9587;
	    class179_sub3_262_.anInt9588 = anInt9588;
	    class179_sub3_262_.anInt9591 = anInt9591;
	    class179_sub3_262_.anInt9592 = anInt9592;
	    class179_sub3_262_.aBool9586 = true;
	} else
	    class179_sub3_262_.aBool9586 = false;
	if (aBool9593) {
	    class179_sub3_262_.anInt9594 = anInt9594;
	    class179_sub3_262_.aBool9593 = true;
	} else
	    class179_sub3_262_.aBool9593 = false;
	class179_sub3_262_.anIntArrayArray9553 = anIntArrayArray9553;
	class179_sub3_262_.anIntArrayArray9573 = anIntArrayArray9573;
	class179_sub3_262_.anIntArrayArray9543 = anIntArrayArray9543;
	class179_sub3_262_.aShortArray9599 = aShortArray9599;
	class179_sub3_262_.anIntArray9598 = anIntArray9598;
	class179_sub3_262_.aShortArray9556 = aShortArray9556;
	class179_sub3_262_.aShortArray9545 = aShortArray9545;
	class179_sub3_262_.aShortArray9548 = aShortArray9548;
	class179_sub3_262_.aShortArray9615 = aShortArray9615;
	class179_sub3_262_.anIntArray9567 = anIntArray9567;
	class179_sub3_262_.anIntArray9597 = anIntArray9597;
	class179_sub3_262_.anIntArray9596 = anIntArray9596;
	class179_sub3_262_.aClass184Array9600 = aClass184Array9600;
	class179_sub3_262_.aClass154Array9601 = aClass154Array9601;
	return class179_sub3_262_;
    }
    
    public void method3003() {
	if (!aBool9593) {
	    if (!aBool9586)
		method15278();
	    anInt9594 = anInt9587;
	    aBool9593 = true;
	}
    }
    
    public int method2956() {
	if (!aBool9586)
	    method15278();
	return anInt9602;
    }
    
    public int method2957() {
	if (!aBool9586)
	    method15278();
	return anInt9584;
    }
    
    public Class525_Sub16_Sub17 method2955
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	if (anInt9555 == 0)
	    return null;
	if (!aBool9586)
	    method15278();
	int i;
	int i_285_;
	if (aClass182_Sub1_9585.anInt9244 > 0) {
	    i = (anInt9589 - (anInt9588 * aClass182_Sub1_9585.anInt9244 >> 8)
		 >> aClass182_Sub1_9585.anInt9243);
	    i_285_ = anInt9590 - (anInt9587 * aClass182_Sub1_9585.anInt9244
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	} else {
	    i = (anInt9589 - (anInt9587 * aClass182_Sub1_9585.anInt9244 >> 8)
		 >> aClass182_Sub1_9585.anInt9243);
	    i_285_ = anInt9590 - (anInt9588 * aClass182_Sub1_9585.anInt9244
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	}
	int i_286_;
	int i_287_;
	if (aClass182_Sub1_9585.anInt9245 > 0) {
	    i_286_ = anInt9591 - (anInt9588 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	    i_287_ = anInt9592 - (anInt9587 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	} else {
	    i_286_ = anInt9591 - (anInt9587 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	    i_287_ = anInt9592 - (anInt9588 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	}
	int i_288_ = i_285_ - i + 1;
	int i_289_ = i_287_ - i_286_ + 1;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2_290_;
	if (class525_sub16_sub17_sub2 != null
	    && class525_sub16_sub17_sub2.method18886(i_288_, i_289_)) {
	    class525_sub16_sub17_sub2_290_ = class525_sub16_sub17_sub2;
	    class525_sub16_sub17_sub2_290_.method18881();
	} else
	    class525_sub16_sub17_sub2_290_
		= new Class525_Sub16_Sub17_Sub2(aClass182_Sub1_9585, i_288_,
						i_289_);
	class525_sub16_sub17_sub2_290_.method18882(i, i_286_, i_285_, i_287_);
	method15282(class525_sub16_sub17_sub2_290_);
	return class525_sub16_sub17_sub2_290_;
    }
    
    public int method2959() {
	if (!aBool9586)
	    method15278();
	return anInt9590;
    }
    
    public int method2960() {
	if (!aBool9586)
	    method15278();
	return anInt9587;
    }
    
    public int method3039() {
	if (!aBool9586)
	    method15278();
	return anInt9592;
    }
    
    public Class154[] method3064() {
	return aClass154Array9601;
    }
    
    public void method3062(int i) {
	int i_291_ = Class436.anIntArray4831[i];
	int i_292_ = Class436.anIntArray4838[i];
	for (int i_293_ = 0; i_293_ < anInt9549; i_293_++) {
	    int i_294_ = ((anIntArray9551[i_293_] * i_291_
			   + anIntArray9550[i_293_] * i_292_)
			  >> 14);
	    anIntArray9551[i_293_] = (anIntArray9551[i_293_] * i_292_
				      - anIntArray9550[i_293_] * i_291_) >> 14;
	    anIntArray9550[i_293_] = i_294_;
	}
	method15326();
	aBool9586 = false;
    }
    
    public int method2964() {
	if (!aBool9593)
	    method3003();
	return anInt9594;
    }
    
    public void method3070(int i, int i_295_, int i_296_) {
	for (int i_297_ = 0; i_297_ < anInt9549; i_297_++) {
	    if (i != 0)
		anIntArray9550[i_297_] += i;
	    if (i_295_ != 0)
		anIntArray9551[i_297_] += i_295_;
	    if (i_296_ != 0)
		anIntArray9541[i_297_] += i_296_;
	}
	method15326();
	aBool9586 = false;
    }
    
    public void method3097(byte i, byte[] is) {
	if (is == null) {
	    for (int i_298_ = 0; i_298_ < anInt9595; i_298_++)
		aByteArray9568[i_298_] = i;
	} else {
	    for (int i_299_ = 0; i_299_ < anInt9595; i_299_++) {
		int i_300_ = 255 - ((255 - (is[i_299_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		aByteArray9568[i_299_] = (byte) i_300_;
	    }
	}
	method15290();
    }
    
    public void method2978(Class444 class444) {
	Class435 class435 = aClass182_Sub1_9585.aClass435_9180;
	class435.method7040(class444);
	if (aClass184Array9600 != null) {
	    for (int i = 0; i < aClass184Array9600.length; i++) {
		Class184 class184 = aClass184Array9600[i];
		Class184 class184_301_ = class184;
		if (class184.aClass184_2070 != null)
		    class184_301_ = class184.aClass184_2070;
		class184_301_.anInt2077
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 908167867);
		class184_301_.anInt2063
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * -289521417);
		class184_301_.anInt2072
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 1741678221);
		class184_301_.anInt2073
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -1237556839);
		class184_301_.anInt2074
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * 995078737);
		class184_301_.anInt2075
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -285158923);
		class184_301_.anInt2071
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -970783049);
		class184_301_.anInt2067
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -779882021);
		class184_301_.anInt2078
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -1530339371);
	    }
	}
	if (aClass154Array9601 != null) {
	    for (int i = 0; i < aClass154Array9601.length; i++) {
		Class154 class154 = aClass154Array9601[i];
		Class154 class154_302_ = class154;
		if (class154.aClass154_1728 != null)
		    class154_302_ = class154.aClass154_1728;
		if (class154.aClass435_1727 != null)
		    class154.aClass435_1727.method6947(class435);
		else
		    class154.aClass435_1727 = new Class435(class435);
		class154_302_.anInt1730
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -1389867987);
		class154_302_.anInt1731
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -182905551);
		class154_302_.anInt1732
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * 1917380171);
	    }
	}
    }
    
    public int method3065() {
	return aShort9546;
    }
    
    public void method2972(byte i, byte[] is) {
	if (is == null) {
	    for (int i_303_ = 0; i_303_ < anInt9595; i_303_++)
		aByteArray9568[i_303_] = i;
	} else {
	    for (int i_304_ = 0; i_304_ < anInt9595; i_304_++) {
		int i_305_ = 255 - ((255 - (is[i_304_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		aByteArray9568[i_304_] = (byte) i_305_;
	    }
	}
	method15290();
    }
    
    public byte[] method2970() {
	return aByteArray9568;
    }
    
    public void method2971(short i, short i_306_) {
	for (int i_307_ = 0; i_307_ < anInt9595; i_307_++) {
	    if (aShortArray9552[i_307_] == i)
		aShortArray9552[i_307_] = i_306_;
	}
	if (aClass359Array9604 != null) {
	    for (int i_308_ = 0; i_308_ < anInt9603; i_308_++) {
		Class359 class359 = aClass359Array9604[i_308_];
		Class349 class349 = aClass349Array9574[i_308_];
		class349.anInt3739
		    = (class349.anInt3739 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9552[class359.anInt3805] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15290();
    }
    
    public void method2974(int i, int i_309_, int i_310_, int i_311_) {
	for (int i_312_ = 0; i_312_ < anInt9595; i_312_++) {
	    int i_313_ = aShortArray9552[i_312_] & 0xffff;
	    int i_314_ = i_313_ >> 10 & 0x3f;
	    int i_315_ = i_313_ >> 7 & 0x7;
	    int i_316_ = i_313_ & 0x7f;
	    if (i != -1)
		i_314_ += (i - i_314_) * i_311_ >> 7;
	    if (i_309_ != -1)
		i_315_ += (i_309_ - i_315_) * i_311_ >> 7;
	    if (i_310_ != -1)
		i_316_ += (i_310_ - i_316_) * i_311_ >> 7;
	    aShortArray9552[i_312_]
		= (short) (i_314_ << 10 | i_315_ << 7 | i_316_);
	}
	if (aClass359Array9604 != null) {
	    for (int i_317_ = 0; i_317_ < anInt9603; i_317_++) {
		Class359 class359 = aClass359Array9604[i_317_];
		Class349 class349 = aClass349Array9574[i_317_];
		class349.anInt3739
		    = (class349.anInt3739 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9552[class359.anInt3805] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15290();
    }
    
    public void method2973(short i, short i_318_) {
	Class180 class180 = aClass182_Sub1_9585.aClass180_1944;
	for (int i_319_ = 0; i_319_ < anInt9595; i_319_++) {
	    if (aShortArray9605[i_319_] == i)
		aShortArray9605[i_319_] = i_318_;
	}
	byte i_320_ = 0;
	byte i_321_ = 0;
	if (i != -1) {
	    Class166 class166 = class180.method3116(i & 0xffff, -1431554601);
	    i_320_ = class166.aByte1785;
	    i_321_ = class166.aByte1831;
	}
	byte i_322_ = 0;
	byte i_323_ = 0;
	if (i_318_ != -1) {
	    Class166 class166
		= class180.method3116(i_318_ & 0xffff, -1431554601);
	    i_322_ = class166.aByte1785;
	    i_323_ = class166.aByte1831;
	    if (class166.aByte1805 != 0 || class166.aByte1806 != 0)
		aBool9606 = true;
	}
	if (i_320_ != i_322_ | i_321_ != i_323_) {
	    if (aClass359Array9604 != null) {
		for (int i_324_ = 0; i_324_ < anInt9603; i_324_++) {
		    Class359 class359 = aClass359Array9604[i_324_];
		    Class349 class349 = aClass349Array9574[i_324_];
		    class349.anInt3739
			= (class349.anInt3739 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9552[class359.anInt3805] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15290();
	}
    }
    
    void method2942() {
	for (int i = 0; i < anInt9583; i++) {
	    anIntArray9550[i] = anIntArray9550[i] + 7 >> 4;
	    anIntArray9551[i] = anIntArray9551[i] + 7 >> 4;
	    anIntArray9541[i] = anIntArray9541[i] + 7 >> 4;
	}
	method15326();
	aBool9586 = false;
    }
    
    public boolean method2924() {
	if (aShortArray9605 == null)
	    return true;
	for (int i = 0; i < aShortArray9605.length; i++) {
	    if (aShortArray9605[i] != -1
		&& !(aClass182_Sub1_9585.aClass351_9253.method6162
		     (aClass182_Sub1_9585.aClass180_1944
			  .method3116(aShortArray9605[i], -1431554601),
		      -1)))
		return false;
	}
	return true;
    }
    
    void method15278() {
	int i = 32767;
	int i_325_ = 32767;
	int i_326_ = 32767;
	int i_327_ = -32768;
	int i_328_ = -32768;
	int i_329_ = -32768;
	int i_330_ = 0;
	int i_331_ = 0;
	for (int i_332_ = 0; i_332_ < anInt9549; i_332_++) {
	    int i_333_ = anIntArray9550[i_332_];
	    int i_334_ = anIntArray9551[i_332_];
	    int i_335_ = anIntArray9541[i_332_];
	    if (i_333_ < i)
		i = i_333_;
	    if (i_333_ > i_327_)
		i_327_ = i_333_;
	    if (i_334_ < i_325_)
		i_325_ = i_334_;
	    if (i_334_ > i_328_)
		i_328_ = i_334_;
	    if (i_335_ < i_326_)
		i_326_ = i_335_;
	    if (i_335_ > i_329_)
		i_329_ = i_335_;
	    int i_336_ = i_333_ * i_333_ + i_335_ * i_335_;
	    if (i_336_ > i_330_)
		i_330_ = i_336_;
	    i_336_ = i_333_ * i_333_ + i_335_ * i_335_ + i_334_ * i_334_;
	    if (i_336_ > i_331_)
		i_331_ = i_336_;
	}
	anInt9589 = i;
	anInt9590 = i_327_;
	anInt9587 = i_325_;
	anInt9588 = i_328_;
	anInt9591 = i_326_;
	anInt9592 = i_329_;
	anInt9602 = (int) (Math.sqrt((double) i_330_) + 0.99);
	anInt9584 = (int) (Math.sqrt((double) i_331_) + 0.99);
	aBool9586 = true;
    }
    
    public boolean method2977() {
	return aBool9606;
    }
    
    void method2939() {
	/* empty */
    }
    
    public int method2923() {
	return anInt9544;
    }
    
    boolean method2947() {
	if (anIntArrayArray9553 == null)
	    return false;
	for (int i = 0; i < anInt9583; i++) {
	    anIntArray9550[i] <<= 4;
	    anIntArray9551[i] <<= 4;
	    anIntArray9541[i] <<= 4;
	}
	anInt9613 = 0;
	anInt9614 = 0;
	anInt9576 = 0;
	return true;
    }
    
    public void method3043(int i) {
	aShort9546 = (short) i;
	method15290();
    }
    
    int method15279(int i, int i_337_) {
	i_337_ = i_337_ * (i & 0x7f) >> 7;
	if (i_337_ < 2)
	    i_337_ = 2;
	else if (i_337_ > 126)
	    i_337_ = 126;
	return (i & 0xff80) + i_337_;
    }
    
    public void method3084(int i) {
	int i_338_ = Class436.anIntArray4831[i];
	int i_339_ = Class436.anIntArray4838[i];
	for (int i_340_ = 0; i_340_ < anInt9549; i_340_++) {
	    int i_341_ = ((anIntArray9551[i_340_] * i_339_
			   - anIntArray9541[i_340_] * i_338_)
			  >> 14);
	    anIntArray9541[i_340_] = (anIntArray9551[i_340_] * i_338_
				      + anIntArray9541[i_340_] * i_339_) >> 14;
	    anIntArray9551[i_340_] = i_341_;
	}
	method15326();
	aBool9586 = false;
    }
    
    public int method3038() {
	if (!aBool9586)
	    method15278();
	return anInt9592;
    }
    
    public void method2943(Class444 class444, int i, boolean bool) {
	if (aShortArray9548 != null) {
	    Class444 class444_342_ = class444;
	    if (bool) {
		class444_342_ = aClass182_Sub1_9585.aClass444_9179;
		class444_342_.method7163(class444);
	    }
	    float[] fs = new float[3];
	    for (int i_343_ = 0; i_343_ < anInt9549; i_343_++) {
		if ((i & aShortArray9548[i_343_]) != 0) {
		    class444_342_.method7168((float) anIntArray9550[i_343_],
					     (float) anIntArray9551[i_343_],
					     (float) anIntArray9541[i_343_],
					     fs);
		    anIntArray9550[i_343_] = (int) fs[0];
		    anIntArray9551[i_343_] = (int) fs[1];
		    anIntArray9541[i_343_] = (int) fs[2];
		}
	    }
	}
    }
    
    public Class154[] method2980() {
	return aClass154Array9601;
    }
    
    public Class184[] method2979() {
	return aClass184Array9600;
    }
    
    public void method3021(Class444 class444) {
	Class435 class435 = aClass182_Sub1_9585.aClass435_9180;
	class435.method7040(class444);
	if (aClass184Array9600 != null) {
	    for (int i = 0; i < aClass184Array9600.length; i++) {
		Class184 class184 = aClass184Array9600[i];
		Class184 class184_344_ = class184;
		if (class184.aClass184_2070 != null)
		    class184_344_ = class184.aClass184_2070;
		class184_344_.anInt2077
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 908167867);
		class184_344_.anInt2063
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * -289521417);
		class184_344_.anInt2072
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 1741678221);
		class184_344_.anInt2073
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -1237556839);
		class184_344_.anInt2074
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * 995078737);
		class184_344_.anInt2075
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -285158923);
		class184_344_.anInt2071
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -970783049);
		class184_344_.anInt2067
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -779882021);
		class184_344_.anInt2078
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -1530339371);
	    }
	}
	if (aClass154Array9601 != null) {
	    for (int i = 0; i < aClass154Array9601.length; i++) {
		Class154 class154 = aClass154Array9601[i];
		Class154 class154_345_ = class154;
		if (class154.aClass154_1728 != null)
		    class154_345_ = class154.aClass154_1728;
		if (class154.aClass435_1727 != null)
		    class154.aClass435_1727.method6947(class435);
		else
		    class154.aClass435_1727 = new Class435(class435);
		class154_345_.anInt1730
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -1389867987);
		class154_345_.anInt1731
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -182905551);
		class154_345_.anInt1732
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * 1917380171);
	    }
	}
    }
    
    public Class525_Sub16_Sub17 method3024
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	if (anInt9555 == 0)
	    return null;
	if (!aBool9586)
	    method15278();
	int i;
	int i_346_;
	if (aClass182_Sub1_9585.anInt9244 > 0) {
	    i = (anInt9589 - (anInt9588 * aClass182_Sub1_9585.anInt9244 >> 8)
		 >> aClass182_Sub1_9585.anInt9243);
	    i_346_ = anInt9590 - (anInt9587 * aClass182_Sub1_9585.anInt9244
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	} else {
	    i = (anInt9589 - (anInt9587 * aClass182_Sub1_9585.anInt9244 >> 8)
		 >> aClass182_Sub1_9585.anInt9243);
	    i_346_ = anInt9590 - (anInt9588 * aClass182_Sub1_9585.anInt9244
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	}
	int i_347_;
	int i_348_;
	if (aClass182_Sub1_9585.anInt9245 > 0) {
	    i_347_ = anInt9591 - (anInt9588 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	    i_348_ = anInt9592 - (anInt9587 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	} else {
	    i_347_ = anInt9591 - (anInt9587 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	    i_348_ = anInt9592 - (anInt9588 * aClass182_Sub1_9585.anInt9245
				  >> 8) >> aClass182_Sub1_9585.anInt9243;
	}
	int i_349_ = i_346_ - i + 1;
	int i_350_ = i_348_ - i_347_ + 1;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2
	    = (Class525_Sub16_Sub17_Sub2) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2_351_;
	if (class525_sub16_sub17_sub2 != null
	    && class525_sub16_sub17_sub2.method18886(i_349_, i_350_)) {
	    class525_sub16_sub17_sub2_351_ = class525_sub16_sub17_sub2;
	    class525_sub16_sub17_sub2_351_.method18881();
	} else
	    class525_sub16_sub17_sub2_351_
		= new Class525_Sub16_Sub17_Sub2(aClass182_Sub1_9585, i_349_,
						i_350_);
	class525_sub16_sub17_sub2_351_.method18882(i, i_347_, i_346_, i_348_);
	method15282(class525_sub16_sub17_sub2_351_);
	return class525_sub16_sub17_sub2_351_;
    }
    
    boolean method15280(int i, int i_352_, int i_353_, int i_354_,
			Class444 class444, boolean bool, int i_355_) {
	Class435 class435 = aClass182_Sub1_9585.aClass435_9180;
	class435.method7040(class444);
	class435.method6950(aClass182_Sub1_9585.aClass435_9150);
	boolean bool_356_ = false;
	float f = 3.4028235E38F;
	float f_357_ = -3.4028235E38F;
	float f_358_ = 3.4028235E38F;
	float f_359_ = -3.4028235E38F;
	if (!aBool9586)
	    method15278();
	int i_360_ = anInt9590 - anInt9589 >> 1;
	int i_361_ = anInt9588 - anInt9587 >> 1;
	int i_362_ = anInt9592 - anInt9591 >> 1;
	int i_363_ = anInt9589 + i_360_;
	int i_364_ = anInt9587 + i_361_;
	int i_365_ = anInt9591 + i_362_;
	int i_366_ = i_363_ - (i_360_ << i_355_);
	int i_367_ = i_364_ - (i_361_ << i_355_);
	int i_368_ = i_365_ - (i_362_ << i_355_);
	int i_369_ = i_363_ + (i_360_ << i_355_);
	int i_370_ = i_364_ + (i_361_ << i_355_);
	int i_371_ = i_365_ + (i_362_ << i_355_);
	anIntArray9610[0] = i_366_;
	anIntArray9611[0] = i_367_;
	anIntArray9612[0] = i_368_;
	anIntArray9610[1] = i_369_;
	anIntArray9611[1] = i_367_;
	anIntArray9612[1] = i_368_;
	anIntArray9610[2] = i_366_;
	anIntArray9611[2] = i_370_;
	anIntArray9612[2] = i_368_;
	anIntArray9610[3] = i_369_;
	anIntArray9611[3] = i_370_;
	anIntArray9612[3] = i_368_;
	anIntArray9610[4] = i_366_;
	anIntArray9611[4] = i_367_;
	anIntArray9612[4] = i_371_;
	anIntArray9610[5] = i_369_;
	anIntArray9611[5] = i_367_;
	anIntArray9612[5] = i_371_;
	anIntArray9610[6] = i_366_;
	anIntArray9611[6] = i_370_;
	anIntArray9612[6] = i_371_;
	anIntArray9610[7] = i_369_;
	anIntArray9611[7] = i_370_;
	anIntArray9612[7] = i_371_;
	for (int i_372_ = 0; i_372_ < 8; i_372_++) {
	    float f_373_ = (float) anIntArray9610[i_372_];
	    float f_374_ = (float) anIntArray9611[i_372_];
	    float f_375_ = (float) anIntArray9612[i_372_];
	    float f_376_ = (class435.aFloatArray4830[2] * f_373_
			    + class435.aFloatArray4830[6] * f_374_
			    + class435.aFloatArray4830[10] * f_375_
			    + class435.aFloatArray4830[14]);
	    float f_377_ = (class435.aFloatArray4830[3] * f_373_
			    + class435.aFloatArray4830[7] * f_374_
			    + class435.aFloatArray4830[11] * f_375_
			    + class435.aFloatArray4830[15]);
	    if (f_376_ >= -f_377_) {
		float f_378_ = (class435.aFloatArray4830[0] * f_373_
				+ class435.aFloatArray4830[4] * f_374_
				+ class435.aFloatArray4830[8] * f_375_
				+ class435.aFloatArray4830[12]);
		float f_379_ = (class435.aFloatArray4830[1] * f_373_
				+ class435.aFloatArray4830[5] * f_374_
				+ class435.aFloatArray4830[9] * f_375_
				+ class435.aFloatArray4830[13]);
		float f_380_
		    = (aClass182_Sub1_9585.aFloat9314
		       + aClass182_Sub1_9585.aFloat9198 * f_378_ / f_377_);
		float f_381_
		    = (aClass182_Sub1_9585.aFloat9199
		       + aClass182_Sub1_9585.aFloat9200 * f_379_ / f_377_);
		if (f_380_ < f)
		    f = f_380_;
		if (f_380_ > f_357_)
		    f_357_ = f_380_;
		if (f_381_ < f_358_)
		    f_358_ = f_381_;
		if (f_381_ > f_359_)
		    f_359_ = f_381_;
		bool_356_ = true;
	    }
	}
	int i_382_ = i + i_353_;
	int i_383_ = i_352_ + i_354_;
	if (bool_356_ && (float) i_382_ > f && (float) i < f_357_
	    && (float) i_383_ > f_358_ && (float) i_352_ < f_359_) {
	    if (bool)
		return true;
	    if (anIntArray9608.length < anInt9555) {
		anIntArray9608 = new int[anInt9555];
		anIntArray9609 = new int[anInt9555];
	    }
	    for (int i_384_ = 0; i_384_ < anInt9549; i_384_++) {
		float f_385_ = (float) anIntArray9550[i_384_];
		float f_386_ = (float) anIntArray9551[i_384_];
		float f_387_ = (float) anIntArray9541[i_384_];
		float f_388_ = (class435.aFloatArray4830[2] * f_385_
				+ class435.aFloatArray4830[6] * f_386_
				+ class435.aFloatArray4830[10] * f_387_
				+ class435.aFloatArray4830[14]);
		float f_389_ = (class435.aFloatArray4830[3] * f_385_
				+ class435.aFloatArray4830[7] * f_386_
				+ class435.aFloatArray4830[11] * f_387_
				+ class435.aFloatArray4830[15]);
		if (f_388_ >= -f_389_) {
		    float f_390_ = (class435.aFloatArray4830[0] * f_385_
				    + class435.aFloatArray4830[4] * f_386_
				    + class435.aFloatArray4830[8] * f_387_
				    + class435.aFloatArray4830[12]);
		    float f_391_ = (class435.aFloatArray4830[1] * f_385_
				    + class435.aFloatArray4830[5] * f_386_
				    + class435.aFloatArray4830[9] * f_387_
				    + class435.aFloatArray4830[13]);
		    int i_392_ = anIntArray9598[i_384_];
		    int i_393_ = anIntArray9598[i_384_ + 1];
		    for (int i_394_ = i_392_;
			 i_394_ < i_393_ && aShortArray9599[i_394_] != 0;
			 i_394_++) {
			int i_395_ = (aShortArray9599[i_394_] & 0xffff) - 1;
			anIntArray9608[i_395_]
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     + (aClass182_Sub1_9585.aFloat9198 * f_390_
					/ f_389_));
			anIntArray9609[i_395_]
			    = (int) (aClass182_Sub1_9585.aFloat9199
				     + (aClass182_Sub1_9585.aFloat9200 * f_391_
					/ f_389_));
		    }
		} else {
		    int i_396_ = anIntArray9598[i_384_];
		    int i_397_ = anIntArray9598[i_384_ + 1];
		    for (int i_398_ = i_396_;
			 i_398_ < i_397_ && aShortArray9599[i_398_] != 0;
			 i_398_++) {
			int i_399_ = (aShortArray9599[i_398_] & 0xffff) - 1;
			anIntArray9608[i_399_] = -999999;
		    }
		}
	    }
	    for (int i_400_ = 0; i_400_ < anInt9595; i_400_++) {
		if (anIntArray9608[aShortArray9561[i_400_] & 0xffff] != -999999
		    && (anIntArray9608[aShortArray9570[i_400_] & 0xffff]
			!= -999999)
		    && (anIntArray9608[aShortArray9571[i_400_] & 0xffff]
			!= -999999)
		    && (method15275
			(i, i_352_, i_382_, i_383_,
			 anIntArray9609[aShortArray9561[i_400_] & 0xffff],
			 anIntArray9609[aShortArray9570[i_400_] & 0xffff],
			 anIntArray9609[aShortArray9571[i_400_] & 0xffff],
			 anIntArray9608[aShortArray9561[i_400_] & 0xffff],
			 anIntArray9608[aShortArray9570[i_400_] & 0xffff],
			 anIntArray9608[aShortArray9571[i_400_] & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    Class179_Sub3(Class182_Sub1 class182_sub1, int i, int i_401_, boolean bool,
		  boolean bool_402_) {
	anInt9549 = 0;
	anInt9555 = 0;
	anInt9595 = 0;
	anInt9566 = 0;
	aBool9580 = false;
	aBool9581 = true;
	aBool9582 = false;
	aBool9606 = false;
	aBool9586 = false;
	aBool9593 = false;
	aFloatArray9569 = new float[2];
	anIntArray9608 = new int[1];
	anIntArray9609 = new int[1];
	anIntArray9610 = new int[8];
	anIntArray9611 = new int[8];
	anIntArray9612 = new int[8];
	aClass182_Sub1_9585 = class182_sub1;
	anInt9544 = i;
	anInt9558 = i_401_;
	aBool9580 = bool_402_;
	if (bool || Class338.method5876(anInt9544, anInt9558))
	    aClass363_9616
		= new Class363(Class338.method5881(anInt9544, anInt9558));
	if (bool || Class338.method5898(anInt9544, anInt9558))
	    aClass363_9579
		= new Class363(Class338.method5934(anInt9544, anInt9558));
	if (bool || Class338.method5878(anInt9544, anInt9558))
	    aClass363_9577
		= new Class363(Class338.method5883(anInt9544, anInt9558));
	if (bool || Class338.method5903(anInt9544, anInt9558))
	    aClass363_9578
		= new Class363(Class338.method5882(anInt9544, anInt9558));
	if (bool || Class338.method5880(anInt9544, anInt9558))
	    aClass354_9575
		= new Class354(Class338.method5885(anInt9544, anInt9558));
	if (bool && bool_402_) {
	    aClass363_9616.anInterface35_3837
		= aClass363_9616.anInterface35_3834
		= aClass182_Sub1_9585.method14761(aBool9580);
	    aClass363_9579.anInterface35_3837
		= aClass363_9579.anInterface35_3834
		= aClass182_Sub1_9585.method14761(aBool9580);
	    aClass363_9577.anInterface35_3837
		= aClass363_9577.anInterface35_3834
		= aClass182_Sub1_9585.method14761(aBool9580);
	    aClass363_9578.anInterface35_3837
		= aClass363_9578.anInterface35_3834
		= aClass182_Sub1_9585.method14761(aBool9580);
	}
    }
    
    void method15281(Class435 class435) {
	if (aClass359Array9604 != null) {
	    aClass182_Sub1_9585.method3235(!aBool9582);
	    Class444 class444 = aClass182_Sub1_9585.aClass444_9179;
	    Class317 class317 = aClass182_Sub1_9585.aClass317_9194;
	    boolean bool = aClass182_Sub1_9585.anInt9283 > 0;
	    if (bool)
		class317.aClass446_3501.method7265
		    (((float) (aClass182_Sub1_9585.anInt9282 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 0 & 0xff)
		      / 255.0F));
	    else
		class317.aClass446_3501.method7265(0.0F, 0.0F, 0.0F);
	    for (int i = 0; i < anInt9603; i++) {
		Class359 class359 = aClass359Array9604[i];
		Class349 class349 = aClass349Array9574[i];
		if (!class359.aBool3807 || !aClass182_Sub1_9585.method3284()) {
		    float f = ((float) (anIntArray9550[class359.anInt3806]
					+ anIntArray9550[class359.anInt3803]
					+ anIntArray9550[class359.anInt3809])
			       * 0.3333333F);
		    float f_403_
			= ((float) (anIntArray9551[class359.anInt3806]
				    + anIntArray9551[class359.anInt3803]
				    + anIntArray9551[class359.anInt3809])
			   * 0.3333333F);
		    float f_404_
			= ((float) (anIntArray9541[class359.anInt3806]
				    + anIntArray9541[class359.anInt3803]
				    + anIntArray9541[class359.anInt3809])
			   * 0.3333333F);
		    float f_405_ = (class435.aFloatArray4830[0] * f
				    + class435.aFloatArray4830[4] * f_403_
				    + class435.aFloatArray4830[8] * f_404_
				    + class435.aFloatArray4830[12]);
		    float f_406_ = (class435.aFloatArray4830[1] * f
				    + class435.aFloatArray4830[5] * f_403_
				    + class435.aFloatArray4830[9] * f_404_
				    + class435.aFloatArray4830[13]);
		    float f_407_ = (class435.aFloatArray4830[2] * f
				    + class435.aFloatArray4830[6] * f_403_
				    + class435.aFloatArray4830[10] * f_404_
				    + class435.aFloatArray4830[14]);
		    float f_408_
			= ((float) (1.0
				    / Math.sqrt((double) (f_405_ * f_405_
							  + f_406_ * f_406_
							  + f_407_ * f_407_)))
			   * (float) class359.anInt3810);
		    class444.method7135
			(class349.anInt3736,
			 class349.anInt3740 * class359.aShort3804 >> 7,
			 class349.anInt3737 * class359.aShort3802 >> 7,
			 f_405_ + (float) class349.anInt3738 - f_405_ * f_408_,
			 f_406_ + (float) class349.anInt3735 - f_406_ * f_408_,
			 f_407_ - f_407_ * f_408_);
		    class444.method7148(aClass182_Sub1_9585.aClass444_9172);
		    aClass182_Sub1_9585.aClass435_9181.method7040(class444);
		    class317.method5666(aClass182_Sub1_9585.aClass435_9181);
		    class317.aClass435_3500.method7023();
		    class317.anInt3504 = class349.anInt3739;
		    if (bool)
			class317.aFloat3498
			    = 1.0F - ((aClass182_Sub1_9585.aFloat9218 - f_407_)
				      / (aClass182_Sub1_9585.aFloat9218
					 - aClass182_Sub1_9585.aFloat9207));
		    class317.anInterface38_3499 = null;
		    if (class359.aShort3808 != -1)
			class317.anInterface38_3499
			    = (aClass182_Sub1_9585.aClass351_9253.method6159
			       (aClass182_Sub1_9585.aClass180_1944.method3116
				(class359.aShort3808 & 0xffff, -1431554601)));
		    class317.method5664(bool);
		}
	    }
	    aClass182_Sub1_9585.method3235(true);
	}
    }
    
    void method15282(Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2) {
	if (anIntArray9608.length < anInt9555) {
	    anIntArray9608 = new int[anInt9555];
	    anIntArray9609 = new int[anInt9555];
	}
	for (int i = 0; i < anInt9549; i++) {
	    int i_409_
		= (((anIntArray9550[i]
		     - (anIntArray9551[i] * aClass182_Sub1_9585.anInt9244
			>> 8))
		    >> aClass182_Sub1_9585.anInt9243)
		   - class525_sub16_sub17_sub2.anInt12203);
	    int i_410_
		= (((anIntArray9541[i]
		     - (anIntArray9551[i] * aClass182_Sub1_9585.anInt9245
			>> 8))
		    >> aClass182_Sub1_9585.anInt9243)
		   - class525_sub16_sub17_sub2.anInt12201);
	    int i_411_ = anIntArray9598[i];
	    int i_412_ = anIntArray9598[i + 1];
	    for (int i_413_ = i_411_;
		 i_413_ < i_412_ && aShortArray9599[i_413_] != 0; i_413_++) {
		int i_414_ = (aShortArray9599[i_413_] & 0xffff) - 1;
		anIntArray9608[i_414_] = i_409_;
		anIntArray9609[i_414_] = i_410_;
	    }
	}
	for (int i = 0; i < anInt9566; i++) {
	    if (aByteArray9568 == null || aByteArray9568[i] <= 128) {
		int i_415_ = aShortArray9561[i] & 0xffff;
		int i_416_ = aShortArray9570[i] & 0xffff;
		int i_417_ = aShortArray9571[i] & 0xffff;
		int i_418_ = anIntArray9608[i_415_];
		int i_419_ = anIntArray9608[i_416_];
		int i_420_ = anIntArray9608[i_417_];
		int i_421_ = anIntArray9609[i_415_];
		int i_422_ = anIntArray9609[i_416_];
		int i_423_ = anIntArray9609[i_417_];
		if (((i_418_ - i_419_) * (i_422_ - i_423_)
		     - (i_422_ - i_421_) * (i_420_ - i_419_))
		    > 0)
		    class525_sub16_sub17_sub2.method18890(i_421_, i_422_,
							  i_423_, i_418_,
							  i_419_, i_420_);
	    }
	}
    }
    
    public void method2990(int i) {
	if (aClass363_9616 != null)
	    aClass363_9616.aBool3836 = Class338.method5881(i, anInt9558);
	if (aClass363_9579 != null)
	    aClass363_9579.aBool3836 = Class338.method5934(i, anInt9558);
	if (aClass363_9577 != null)
	    aClass363_9577.aBool3836 = Class338.method5883(i, anInt9558);
	if (aClass363_9578 != null)
	    aClass363_9578.aBool3836 = Class338.method5882(i, anInt9558);
	anInt9544 = i;
	if (aClass366_9564 != null && (anInt9544 & 0x10000) == 0) {
	    aShortArray9617 = aClass366_9564.aShortArray3857;
	    aShortArray9559 = aClass366_9564.aShortArray3856;
	    aShortArray9560 = aClass366_9564.aShortArray3858;
	    aByteArray9557 = aClass366_9564.aByteArray3855;
	    aClass366_9564 = null;
	}
	aBool9581 = true;
	method15298();
    }
    
    void method15283(Class444 class444) {
	if (anInt9566 != 0 && (method15286() && method15295())) {
	    if (aClass356_9547 == null) {
		/* empty */
	    }
	    aClass182_Sub1_9585.method14775();
	    aClass182_Sub1_9585.method14720();
	    Class319 class319 = aClass182_Sub1_9585.aClass319_9196;
	    aClass182_Sub1_9585.method14764(0,
					    aClass363_9616.anInterface35_3834);
	    aClass182_Sub1_9585.method14764(1,
					    aClass363_9577.anInterface35_3834);
	    aClass182_Sub1_9585.method14764(2,
					    aClass363_9579.anInterface35_3834);
	    aClass182_Sub1_9585.method14765(aClass354_9575.anInterface44_3786);
	    aClass182_Sub1_9585.aClass435_9180.method7040(class444);
	    class319.method5677(aClass182_Sub1_9585.aClass435_9180);
	    class319.aClass435_3529.method7023();
	    if (aClass182_Sub1_9585.aBool9158) {
		Class176 class176 = aClass182_Sub1_9585.method14748();
		class319.aClass437_3518.method7073
		    (0.0F, 1.0F, 0.0F, (float) -aClass182_Sub1_9585.anInt9278);
		class319.aClass437_3518.method7078(3.0F
						   / (float) ((class176
							       .anInt1879)
							      * -734182087));
		class319.aClass446_3519.method7265
		    (((float) (class176.anInt1877 * 2141545647 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (class176.anInt1877 * 2141545647 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (class176.anInt1877 * 2141545647 >> 0 & 0xff)
		      / 255.0F));
	    } else {
		class319.aClass437_3518.method7073(0.0F, 0.0F, 0.0F, 0.0F);
		class319.aClass446_3519.method7265(0.0F, 0.0F, 0.0F);
	    }
	    if (aClass182_Sub1_9585.anInt9283 > 0) {
		class319.aClass437_3520.method7073(0.0F, 0.0F, 1.0F,
						   -(aClass182_Sub1_9585
						     .aFloat9207));
		class319.aClass446_3508.method7265
		    (((float) (aClass182_Sub1_9585.anInt9282 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 0 & 0xff)
		      / 255.0F));
		aClass182_Sub1_9585.aClass435_9180.method7040(class444);
		aClass182_Sub1_9585.aClass435_9180.method6973();
		class319.aClass437_3518
		    .method7079(aClass182_Sub1_9585.aClass435_9180);
		aClass182_Sub1_9585.aClass435_9180.method7040(class444);
		aClass182_Sub1_9585.aClass435_9180
		    .method6950(aClass182_Sub1_9585.aClass435_9173);
		aClass182_Sub1_9585.aClass435_9180.method6973();
		class319.aClass437_3520
		    .method7079(aClass182_Sub1_9585.aClass435_9180);
		class319.aClass437_3520.method7078
		    (1.0F / (aClass182_Sub1_9585.aFloat9218
			     - aClass182_Sub1_9585.aFloat9207));
	    } else {
		class319.aClass437_3520.method7073(0.0F, 0.0F, 0.0F, 0.0F);
		class319.aClass446_3508.method7265(0.0F, 0.0F, 0.0F);
	    }
	    if ((anInt9558 & 0x37) == 0) {
		aClass182_Sub1_9585
		    .method14763(aClass182_Sub1_9585.aClass337_9276);
		if (aClass182_Sub1_9585.aBool9156)
		    aClass182_Sub1_9585.method14713(false);
		for (int i = 0; i < anIntArray9596.length; i++) {
		    int i_424_ = anIntArray9567[i];
		    int i_425_ = anIntArray9567[i + 1];
		    int i_426_ = aShortArray9605[i_424_];
		    boolean bool = false;
		    byte i_427_ = 0;
		    if (i_426_ != -1) {
			Class166 class166
			    = aClass182_Sub1_9585.aClass180_1944
				  .method3116(i_426_ & 0xffff, -1431554601);
			class319.anInterface38_3512
			    = aClass182_Sub1_9585.aClass351_9253
				  .method6159(class166);
			bool = !Class679.method11200(class166.aByte1825,
						     (byte) -40);
			class319.aClass435_3529.aFloatArray4830[12]
			    = ((float) (aClass182_Sub1_9585.anInt9295 % 128000)
			       / 1000.0F * (float) class166.aByte1805 / 64.0F
			       % 1.0F);
			class319.aClass435_3529.aFloatArray4830[13]
			    = ((float) (aClass182_Sub1_9585.anInt9295 % 128000)
			       / 1000.0F * (float) class166.aByte1806 / 64.0F
			       % 1.0F);
			if (class166.aClass597_1807 == Class597.aClass597_7843)
			    i_427_ = class166.aByte1830;
		    } else {
			class319.anInterface38_3512
			    = aClass182_Sub1_9585.anInterface38_9168;
			float[] fs = class319.aClass435_3529.aFloatArray4830;
			class319.aClass435_3529.aFloatArray4830[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    aClass182_Sub1_9585.method14948(i_427_);
		    class319.anInt3527 = anIntArray9596[i];
		    class319.anInt3528 = anIntArray9597[i];
		    class319.anInt3526 = i_424_ * 3;
		    class319.anInt3530 = i_425_ - i_424_;
		    class319.method5696(bool);
		}
	    } else {
		aClass182_Sub1_9585
		    .method14764(3, aClass363_9578.anInterface35_3834);
		aClass182_Sub1_9585
		    .method14763(aClass182_Sub1_9585.aClass337_9323);
		Class444 class444_428_ = aClass182_Sub1_9585.aClass444_9179;
		class444_428_.method7154(class444);
		class444_428_.method7138();
		int i = 0;
		if (aClass182_Sub1_9585.aBool9156)
		    aClass182_Sub1_9585.method14713(true);
		else {
		    class319.aClass446_3521.method7265
			(aClass182_Sub1_9585.aFloatArray9228[0],
			 aClass182_Sub1_9585.aFloatArray9228[1],
			 aClass182_Sub1_9585.aFloatArray9228[2]);
		    class319.aClass446_3521.method7241(class444_428_);
		    class319.aClass446_3523.method7265
			((aClass182_Sub1_9585.aFloat9152
			  * aClass182_Sub1_9585.aFloat9233),
			 (aClass182_Sub1_9585.aFloat9152
			  * aClass182_Sub1_9585.aFloat9299),
			 (aClass182_Sub1_9585.aFloat9152
			  * aClass182_Sub1_9585.aFloat9235));
		    class319.aClass446_3524.method7265
			((-aClass182_Sub1_9585.aFloat9238
			  * aClass182_Sub1_9585.aFloat9233),
			 (-aClass182_Sub1_9585.aFloat9238
			  * aClass182_Sub1_9585.aFloat9299),
			 (-aClass182_Sub1_9585.aFloat9238
			  * aClass182_Sub1_9585.aFloat9235));
		    class319.aClass446_3517.method7265
			((aClass182_Sub1_9585.aFloat9169
			  * aClass182_Sub1_9585.aFloat9233),
			 (aClass182_Sub1_9585.aFloat9169
			  * aClass182_Sub1_9585.aFloat9299),
			 (aClass182_Sub1_9585.aFloat9169
			  * aClass182_Sub1_9585.aFloat9235));
		    if (aClass182_Sub1_9585.anInt9241 > 0) {
			i = aClass182_Sub1_9585.anInt9241;
			Class446 class446 = aClass182_Sub1_9585.aClass446_9182;
			for (int i_429_ = 0; i_429_ < i; i_429_++) {
			    Class525_Sub21 class525_sub21
				= (aClass182_Sub1_9585.aClass525_Sub21Array9239
				   [i_429_]);
			    int i_430_
				= class525_sub21.method16298(-1045129869);
			    class446
				.method7216(class525_sub21.aClass446_10579);
			    class446.method7240(class444_428_);
			    class319.aFloatArray3511[i_429_ * 4 + 0]
				= class446.aFloat4895;
			    class319.aFloatArray3511[i_429_ * 4 + 1]
				= class446.aFloat4896;
			    class319.aFloatArray3511[i_429_ * 4 + 2]
				= class446.aFloat4897;
			    class319.aFloatArray3511[i_429_ * 4 + 3]
				= (1.0F
				   / (float) (class525_sub21
						  .method16332(2001219275)
					      * class525_sub21
						    .method16332(1661705449)));
			    float f = (class525_sub21.method16306(-2024100845)
				       / 255.0F);
			    class319.aFloatArray3510[i_429_ * 4 + 0]
				= (float) (i_430_ >> 16 & 0xff) * f;
			    class319.aFloatArray3510[i_429_ * 4 + 1]
				= (float) (i_430_ >> 8 & 0xff) * f;
			    class319.aFloatArray3510[i_429_ * 4 + 2]
				= (float) (i_430_ & 0xff) * f;
			    class319.aFloatArray3510[i_429_ * 4 + 3] = 1.0F;
			}
		    }
		}
		for (int i_431_ = 0; i_431_ < anIntArray9596.length;
		     i_431_++) {
		    int i_432_ = anIntArray9567[i_431_];
		    int i_433_ = anIntArray9567[i_431_ + 1];
		    int i_434_ = aShortArray9605[i_432_];
		    byte i_435_ = 11;
		    Class166 class166 = null;
		    byte i_436_ = 0;
		    if (i_434_ != -1) {
			class166
			    = aClass182_Sub1_9585.aClass180_1944
				  .method3116(i_434_ & 0xffff, -1431554601);
			class319.anInterface38_3512
			    = aClass182_Sub1_9585.aClass351_9253
				  .method6159(class166);
			i_435_ = class166.aByte1825;
			class319.method5676(class166.aByte1826);
			class319.aClass435_3529.aFloatArray4830[12]
			    = ((float) (aClass182_Sub1_9585.anInt9295 % 128000)
			       / 1000.0F * (float) class166.aByte1805 / 64.0F
			       % 1.0F);
			class319.aClass435_3529.aFloatArray4830[13]
			    = ((float) (aClass182_Sub1_9585.anInt9295 % 128000)
			       / 1000.0F * (float) class166.aByte1806 / 64.0F
			       % 1.0F);
			if (class166.aClass597_1807 == Class597.aClass597_7843)
			    i_436_ = class166.aByte1830;
		    } else {
			class319.anInterface38_3512
			    = aClass182_Sub1_9585.anInterface38_9168;
			float[] fs = class319.aClass435_3529.aFloatArray4830;
			class319.aClass435_3529.aFloatArray4830[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    aClass182_Sub1_9585.method14948(i_436_);
		    class319.anInt3527 = anIntArray9596[i_431_];
		    class319.anInt3528 = anIntArray9597[i_431_];
		    class319.anInt3526 = i_432_ * 3;
		    class319.anInt3530 = i_433_ - i_432_;
		    switch (i_435_) {
		    case 1:
			class319.aClass446_3515.method7265
			    ((aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[12]),
			     (aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[13]),
			     (aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[14]));
			class319.aClass446_3515.method7240(class444_428_);
			class319.method5680(i);
			break;
		    default:
			class319.method5679(i);
			break;
		    case 5:
			if (!aClass182_Sub1_9585.aBool9156) {
			    Class346_Sub1_Sub1 class346_sub1_sub1
				= aClass182_Sub1_9585.aClass346_Sub1_Sub1_9286;
			    class346_sub1_sub1.method18144(class166.aByte1826,
							   (class166.anInt1793
							    * 2110803401),
							   -712123924);
			    class346_sub1_sub1.aClass435_11534
				.method7040(class444);
			    class346_sub1_sub1.aClass435_11532
				.method7040(class444);
			    class346_sub1_sub1.aClass435_11532.method6950
				(aClass182_Sub1_9585.aClass435_9195);
			    class346_sub1_sub1.anInt11531
				= anIntArray9596[i_431_] * 1072055977;
			    class346_sub1_sub1.anInt11541
				= anIntArray9597[i_431_] * 973286163;
			    class346_sub1_sub1.anInt11526
				= i_432_ * -1852102561;
			    class346_sub1_sub1.anInt11543
				= (i_433_ - i_432_) * -691828989;
			    class346_sub1_sub1.method18145(-1301907083);
			} else
			    class319.method5679(i);
			break;
		    case 7:
			class319.aClass446_3515.method7265
			    ((aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[12]),
			     (aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[13]),
			     (aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[14]));
			class319.aClass446_3515.method7240(class444_428_);
			class319.aClass435_3525.method7040(class444);
			class319.anInterface40_3513
			    = aClass182_Sub1_9585.method14777();
			class319.method5681(i);
			break;
		    case 6:
			class319.method5696(!Class679.method11200(i_435_,
								  (byte) -31));
		    }
		}
	    }
	    method15298();
	}
    }
    
    void method15284(Class435 class435) {
	if (aClass359Array9604 != null) {
	    aClass182_Sub1_9585.method3235(!aBool9582);
	    Class444 class444 = aClass182_Sub1_9585.aClass444_9179;
	    Class317 class317 = aClass182_Sub1_9585.aClass317_9194;
	    boolean bool = aClass182_Sub1_9585.anInt9283 > 0;
	    if (bool)
		class317.aClass446_3501.method7265
		    (((float) (aClass182_Sub1_9585.anInt9282 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 0 & 0xff)
		      / 255.0F));
	    else
		class317.aClass446_3501.method7265(0.0F, 0.0F, 0.0F);
	    for (int i = 0; i < anInt9603; i++) {
		Class359 class359 = aClass359Array9604[i];
		Class349 class349 = aClass349Array9574[i];
		if (!class359.aBool3807 || !aClass182_Sub1_9585.method3284()) {
		    float f = ((float) (anIntArray9550[class359.anInt3806]
					+ anIntArray9550[class359.anInt3803]
					+ anIntArray9550[class359.anInt3809])
			       * 0.3333333F);
		    float f_437_
			= ((float) (anIntArray9551[class359.anInt3806]
				    + anIntArray9551[class359.anInt3803]
				    + anIntArray9551[class359.anInt3809])
			   * 0.3333333F);
		    float f_438_
			= ((float) (anIntArray9541[class359.anInt3806]
				    + anIntArray9541[class359.anInt3803]
				    + anIntArray9541[class359.anInt3809])
			   * 0.3333333F);
		    float f_439_ = (class435.aFloatArray4830[0] * f
				    + class435.aFloatArray4830[4] * f_437_
				    + class435.aFloatArray4830[8] * f_438_
				    + class435.aFloatArray4830[12]);
		    float f_440_ = (class435.aFloatArray4830[1] * f
				    + class435.aFloatArray4830[5] * f_437_
				    + class435.aFloatArray4830[9] * f_438_
				    + class435.aFloatArray4830[13]);
		    float f_441_ = (class435.aFloatArray4830[2] * f
				    + class435.aFloatArray4830[6] * f_437_
				    + class435.aFloatArray4830[10] * f_438_
				    + class435.aFloatArray4830[14]);
		    float f_442_
			= ((float) (1.0
				    / Math.sqrt((double) (f_439_ * f_439_
							  + f_440_ * f_440_
							  + f_441_ * f_441_)))
			   * (float) class359.anInt3810);
		    class444.method7135
			(class349.anInt3736,
			 class349.anInt3740 * class359.aShort3804 >> 7,
			 class349.anInt3737 * class359.aShort3802 >> 7,
			 f_439_ + (float) class349.anInt3738 - f_439_ * f_442_,
			 f_440_ + (float) class349.anInt3735 - f_440_ * f_442_,
			 f_441_ - f_441_ * f_442_);
		    class444.method7148(aClass182_Sub1_9585.aClass444_9172);
		    aClass182_Sub1_9585.aClass435_9181.method7040(class444);
		    class317.method5666(aClass182_Sub1_9585.aClass435_9181);
		    class317.aClass435_3500.method7023();
		    class317.anInt3504 = class349.anInt3739;
		    if (bool)
			class317.aFloat3498
			    = 1.0F - ((aClass182_Sub1_9585.aFloat9218 - f_441_)
				      / (aClass182_Sub1_9585.aFloat9218
					 - aClass182_Sub1_9585.aFloat9207));
		    class317.anInterface38_3499 = null;
		    if (class359.aShort3808 != -1)
			class317.anInterface38_3499
			    = (aClass182_Sub1_9585.aClass351_9253.method6159
			       (aClass182_Sub1_9585.aClass180_1944.method3116
				(class359.aShort3808 & 0xffff, -1431554601)));
		    class317.method5664(bool);
		}
	    }
	    aClass182_Sub1_9585.method3235(true);
	}
    }
    
    int method15285(int i, int i_443_) {
	i_443_ = i_443_ * (i & 0x7f) >> 7;
	if (i_443_ < 2)
	    i_443_ = 2;
	else if (i_443_ > 126)
	    i_443_ = 126;
	return (i & 0xff80) + i_443_;
    }
    
    boolean method15286() {
	boolean bool = !aClass363_9577.aBool3835;
	boolean bool_444_
	    = (anInt9558 & 0x37) != 0 && !aClass363_9578.aBool3835;
	boolean bool_445_ = !aClass363_9616.aBool3835;
	boolean bool_446_ = !aClass363_9579.aBool3835;
	if (!bool_445_ && !bool && !bool_444_ && !bool_446_)
	    return true;
	boolean bool_447_ = true;
	if (bool_445_ && aShortArray9556 != null) {
	    if (aClass363_9616.anInterface35_3837 == null)
		aClass363_9616.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9616.anInterface35_3837;
	    interface35.method225(anInt9555 * 12, 12);
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 12;
		long l = interface35.method219(0, i);
		for (int i_448_ = 0; i_448_ < anInt9555; i_448_++) {
		    short i_449_ = aShortArray9556[i_448_];
		    unsafe.putFloat(l, (float) anIntArray9550[i_449_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9551[i_449_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9541[i_449_]);
		    l += 4L;
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		for (int i = 0; i < anInt9555; i++) {
		    bytebuffer
			.putFloat((float) anIntArray9550[aShortArray9556[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9551[aShortArray9556[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9541[aShortArray9556[i]]);
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9616.anInterface35_3834 = interface35;
	    aClass363_9616.aBool3835 = true;
	}
	if (bool) {
	    if (aClass363_9577.anInterface35_3837 == null)
		aClass363_9577.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9577.anInterface35_3837;
	    interface35.method225(anInt9555 * 4, 4);
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 4;
		long l = interface35.method219(0, i);
		if ((anInt9558 & 0x37) == 0) {
		    short[] is;
		    short[] is_450_;
		    short[] is_451_;
		    byte[] is_452_;
		    if (aClass366_9564 != null) {
			is = aClass366_9564.aShortArray3857;
			is_450_ = aClass366_9564.aShortArray3856;
			is_451_ = aClass366_9564.aShortArray3858;
			is_452_ = aClass366_9564.aByteArray3855;
		    } else {
			is = aShortArray9617;
			is_450_ = aShortArray9559;
			is_451_ = aShortArray9560;
			is_452_ = aByteArray9557;
		    }
		    float f = (aClass182_Sub1_9585.aFloat9152 * 768.0F
			       / (float) aShort9572);
		    float f_453_ = (aClass182_Sub1_9585.aFloat9238 * 768.0F
				    / (float) aShort9572);
		    for (int i_454_ = 0; i_454_ < anInt9555; i_454_++) {
			short i_455_ = aShortArray9545[i_454_];
			int i_456_
			    = method15288(aShortArray9552[i_455_] & 0xffff,
					  aShortArray9605[i_455_], aShort9546);
			float f_457_ = ((float) (i_456_ >> 16 & 0xff)
					* aClass182_Sub1_9585.aFloat9233);
			float f_458_ = ((float) (i_456_ >> 8 & 0xff)
					* aClass182_Sub1_9585.aFloat9299);
			float f_459_ = ((float) (i_456_ & 0xff)
					* aClass182_Sub1_9585.aFloat9235);
			byte i_460_ = is_452_[i_454_];
			float f_461_;
			if (i_460_ == 0)
			    f_461_
				= (((aClass182_Sub1_9585.aFloatArray9228[0]
				     * (float) is[i_454_])
				    + (aClass182_Sub1_9585.aFloatArray9228[1]
				       * (float) is_450_[i_454_])
				    + (aClass182_Sub1_9585.aFloatArray9228[2]
				       * (float) is_451_[i_454_]))
				   * 0.0026041667F);
			else
			    f_461_
				= (((aClass182_Sub1_9585.aFloatArray9228[0]
				     * (float) is[i_454_])
				    + (aClass182_Sub1_9585.aFloatArray9228[1]
				       * (float) is_450_[i_454_])
				    + (aClass182_Sub1_9585.aFloatArray9228[2]
				       * (float) is_451_[i_454_]))
				   / ((float) i_460_ * 256.0F));
			float f_462_
			    = (aClass182_Sub1_9585.aFloat9169
			       + f_461_ * (f_461_ < 0.0F ? f_453_ : f));
			int i_463_ = (int) (f_457_ * f_462_);
			if (i_463_ < 0)
			    i_463_ = 0;
			else if (i_463_ > 255)
			    i_463_ = 255;
			int i_464_ = (int) (f_458_ * f_462_);
			if (i_464_ < 0)
			    i_464_ = 0;
			else if (i_464_ > 255)
			    i_464_ = 255;
			int i_465_ = (int) (f_459_ * f_462_);
			if (i_465_ < 0)
			    i_465_ = 0;
			else if (i_465_ > 255)
			    i_465_ = 255;
			unsafe.putInt(l,
				      (255 - aByteArray9568[i_455_] << 24
				       | i_463_ << 16 | i_464_ << 8 | i_465_));
			l += 4L;
		    }
		} else {
		    for (int i_466_ = 0; i_466_ < anInt9555; i_466_++) {
			short i_467_ = aShortArray9545[i_466_];
			int i_468_
			    = (255 - aByteArray9568[i_467_] << 24
			       | method15288(aShortArray9552[i_467_] & 0xffff,
					     aShortArray9605[i_467_],
					     aShort9546));
			unsafe.putInt(l, i_468_);
			l += 4L;
		    }
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		if ((anInt9558 & 0x37) == 0) {
		    short[] is;
		    short[] is_469_;
		    short[] is_470_;
		    byte[] is_471_;
		    if (aClass366_9564 != null) {
			is = aClass366_9564.aShortArray3857;
			is_469_ = aClass366_9564.aShortArray3856;
			is_470_ = aClass366_9564.aShortArray3858;
			is_471_ = aClass366_9564.aByteArray3855;
		    } else {
			is = aShortArray9617;
			is_469_ = aShortArray9559;
			is_470_ = aShortArray9560;
			is_471_ = aByteArray9557;
		    }
		    float f = (aClass182_Sub1_9585.aFloat9152 * 768.0F
			       / (float) aShort9572);
		    float f_472_ = (aClass182_Sub1_9585.aFloat9238 * 768.0F
				    / (float) aShort9572);
		    for (int i = 0; i < anInt9555; i++) {
			short i_473_ = aShortArray9545[i];
			int i_474_
			    = method15288(aShortArray9552[i_473_] & 0xffff,
					  aShortArray9605[i_473_], aShort9546);
			float f_475_ = ((float) (i_474_ >> 16 & 0xff)
					* aClass182_Sub1_9585.aFloat9233);
			float f_476_ = ((float) (i_474_ >> 8 & 0xff)
					* aClass182_Sub1_9585.aFloat9299);
			float f_477_ = ((float) (i_474_ & 0xff)
					* aClass182_Sub1_9585.aFloat9235);
			byte i_478_ = is_471_[i];
			float f_479_;
			if (i_478_ == 0)
			    f_479_
				= ((aClass182_Sub1_9585.aFloatArray9228[0]
				    * (float) is[i])
				   + (aClass182_Sub1_9585.aFloatArray9228[1]
				      * (float) is_469_[i])
				   + (aClass182_Sub1_9585.aFloatArray9228[2]
				      * (float) is_470_[i])) * 0.0026041667F;
			else
			    f_479_
				= (((aClass182_Sub1_9585.aFloatArray9228[0]
				     * (float) is[i])
				    + (aClass182_Sub1_9585.aFloatArray9228[1]
				       * (float) is_469_[i])
				    + (aClass182_Sub1_9585.aFloatArray9228[2]
				       * (float) is_470_[i]))
				   / ((float) i_478_ * 256.0F));
			float f_480_
			    = (aClass182_Sub1_9585.aFloat9169
			       + f_479_ * (f_479_ < 0.0F ? f_472_ : f));
			int i_481_ = (int) (f_475_ * f_480_);
			if (i_481_ < 0)
			    i_481_ = 0;
			else if (i_481_ > 255)
			    i_481_ = 255;
			int i_482_ = (int) (f_476_ * f_480_);
			if (i_482_ < 0)
			    i_482_ = 0;
			else if (i_482_ > 255)
			    i_482_ = 255;
			int i_483_ = (int) (f_477_ * f_480_);
			if (i_483_ < 0)
			    i_483_ = 0;
			else if (i_483_ > 255)
			    i_483_ = 255;
			bytebuffer.putInt(255 - aByteArray9568[i_473_] << 24
					  | i_481_ << 16 | i_482_ << 8
					  | i_483_);
		    }
		} else {
		    for (int i = 0; i < anInt9555; i++) {
			short i_484_ = aShortArray9545[i];
			int i_485_
			    = (255 - aByteArray9568[i_484_] << 24
			       | method15288(aShortArray9552[i_484_] & 0xffff,
					     aShortArray9605[i_484_],
					     aShort9546));
			bytebuffer.putInt(i_485_);
		    }
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9577.anInterface35_3834 = interface35;
	    aClass363_9577.aBool3835 = true;
	}
	if (bool_444_) {
	    if (aClass363_9578.anInterface35_3837 == null)
		aClass363_9578.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9578.anInterface35_3837;
	    interface35.method225(anInt9555 * 12, 12);
	    short[] is;
	    short[] is_486_;
	    short[] is_487_;
	    byte[] is_488_;
	    if (aClass366_9564 != null) {
		is = aClass366_9564.aShortArray3857;
		is_486_ = aClass366_9564.aShortArray3856;
		is_487_ = aClass366_9564.aShortArray3858;
		is_488_ = aClass366_9564.aByteArray3855;
	    } else {
		is = aShortArray9617;
		is_486_ = aShortArray9559;
		is_487_ = aShortArray9560;
		is_488_ = aByteArray9557;
	    }
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 12;
		long l = interface35.method219(0, i);
		for (int i_489_ = 0; i_489_ < anInt9555; i_489_++) {
		    Class446 class446 = new Class446((float) is[i_489_],
						     (float) is_486_[i_489_],
						     (float) is_487_[i_489_]);
		    if (class446.method7230() != 0.0F) {
			if (is_488_[i_489_] > 1)
			    class446.method7237((float) is_488_[i_489_]);
			class446.method7220();
		    }
		    unsafe.putFloat(l, class446.aFloat4895);
		    l += 4L;
		    unsafe.putFloat(l, class446.aFloat4896);
		    l += 4L;
		    unsafe.putFloat(l, class446.aFloat4897);
		    l += 4L;
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		for (int i = 0; i < anInt9555; i++) {
		    Class446 class446
			= new Class446((float) is[i], (float) is_486_[i],
				       (float) is_487_[i]);
		    if (class446.method7230() != 0.0F) {
			if (is_488_[i] > 1)
			    class446.method7237((float) is_488_[i]);
			class446.method7220();
		    }
		    bytebuffer.putFloat(class446.aFloat4895);
		    bytebuffer.putFloat(class446.aFloat4896);
		    bytebuffer.putFloat(class446.aFloat4897);
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9578.anInterface35_3834 = interface35;
	    aClass363_9578.aBool3835 = true;
	}
	if (bool_446_) {
	    if (aClass363_9579.anInterface35_3837 == null)
		aClass363_9579.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9579.anInterface35_3837;
	    interface35.method225(anInt9555 * 8, 8);
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 8;
		long l = interface35.method219(0, i);
		for (int i_490_ = 0; i_490_ < anInt9555; i_490_++) {
		    unsafe.putFloat(l, aFloatArray9562[i_490_]);
		    l += 4L;
		    unsafe.putFloat(l, aFloatArray9563[i_490_]);
		    l += 4L;
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		for (int i = 0; i < anInt9555; i++) {
		    bytebuffer.putFloat(aFloatArray9562[i]);
		    bytebuffer.putFloat(aFloatArray9563[i]);
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9579.anInterface35_3834 = interface35;
	    aClass363_9579.aBool3835 = true;
	}
	return bool_447_;
    }
    
    public void method2933(int i) {
	int i_491_ = Class436.anIntArray4831[i];
	int i_492_ = Class436.anIntArray4838[i];
	for (int i_493_ = 0; i_493_ < anInt9549; i_493_++) {
	    int i_494_ = ((anIntArray9551[i_493_] * i_491_
			   + anIntArray9550[i_493_] * i_492_)
			  >> 14);
	    anIntArray9551[i_493_] = (anIntArray9551[i_493_] * i_492_
				      - anIntArray9550[i_493_] * i_491_) >> 14;
	    anIntArray9550[i_493_] = i_494_;
	}
	method15326();
	aBool9586 = false;
    }
    
    void method15287() {
	if (aClass363_9616 != null)
	    aClass363_9616.method6316();
	if (aClass363_9579 != null)
	    aClass363_9579.method6316();
	if (aClass363_9577 != null)
	    aClass363_9577.method6316();
	if (aClass363_9578 != null)
	    aClass363_9578.method6316();
	if (aClass354_9575 != null)
	    aClass354_9575.method6261();
    }
    
    int method15288(int i, short i_495_, int i_496_) {
	int i_497_
	    = aClass182_Sub1_9585.anIntArray9157[method15279(i, i_496_)];
	if (i_495_ != -1) {
	    Class166 class166 = aClass182_Sub1_9585.aClass180_1944
				    .method3116(i_495_ & 0xffff, -1431554601);
	    int i_498_ = class166.aByte1785 & 0xff;
	    if (i_498_ != 0) {
		int i_499_ = 131586 * i_496_;
		if (i_496_ < 0)
		    i_499_ = 0;
		else if (i_496_ > 127)
		    i_499_ = 16777215;
		else
		    i_499_ = 131586 * i_496_;
		if (i_498_ == 256)
		    i_497_ = i_499_;
		else {
		    int i_500_ = i_498_;
		    int i_501_ = 256 - i_498_;
		    i_497_ = ((((i_499_ & 0xff00ff) * i_500_
				+ (i_497_ & 0xff00ff) * i_501_)
			       & ~0xff00ff)
			      + (((i_499_ & 0xff00) * i_500_
				  + (i_497_ & 0xff00) * i_501_)
				 & 0xff0000)) >> 8;
		}
	    }
	    int i_502_ = class166.aByte1831 & 0xff;
	    if (i_502_ != 0) {
		i_502_ += 256;
		int i_503_ = ((i_497_ & 0xff0000) >> 16) * i_502_;
		if (i_503_ > 65535)
		    i_503_ = 65535;
		int i_504_ = ((i_497_ & 0xff00) >> 8) * i_502_;
		if (i_504_ > 65535)
		    i_504_ = 65535;
		int i_505_ = (i_497_ & 0xff) * i_502_;
		if (i_505_ > 65535)
		    i_505_ = 65535;
		i_497_ = (i_503_ << 8 & 0xff0000) + (i_504_ & 0xff00) + (i_505_
									 >> 8);
	    }
	}
	return i_497_ & 0xffffff;
    }
    
    public void method3068(Class179 class179, int i, int i_506_, int i_507_,
			   boolean bool) {
	Class179_Sub3 class179_sub3_508_ = (Class179_Sub3) class179;
	if (anInt9595 != 0 && class179_sub3_508_.anInt9595 != 0) {
	    int i_509_ = class179_sub3_508_.anInt9549;
	    int[] is = class179_sub3_508_.anIntArray9550;
	    int[] is_510_ = class179_sub3_508_.anIntArray9551;
	    int[] is_511_ = class179_sub3_508_.anIntArray9541;
	    short[] is_512_ = class179_sub3_508_.aShortArray9617;
	    short[] is_513_ = class179_sub3_508_.aShortArray9559;
	    short[] is_514_ = class179_sub3_508_.aShortArray9560;
	    byte[] is_515_ = class179_sub3_508_.aByteArray9557;
	    short[] is_516_;
	    short[] is_517_;
	    short[] is_518_;
	    byte[] is_519_;
	    if (aClass366_9564 != null) {
		is_516_ = aClass366_9564.aShortArray3857;
		is_517_ = aClass366_9564.aShortArray3856;
		is_518_ = aClass366_9564.aShortArray3858;
		is_519_ = aClass366_9564.aByteArray3855;
	    } else {
		is_516_ = null;
		is_517_ = null;
		is_518_ = null;
		is_519_ = null;
	    }
	    short[] is_520_;
	    short[] is_521_;
	    short[] is_522_;
	    byte[] is_523_;
	    if (class179_sub3_508_.aClass366_9564 != null) {
		is_520_ = class179_sub3_508_.aClass366_9564.aShortArray3857;
		is_521_ = class179_sub3_508_.aClass366_9564.aShortArray3856;
		is_522_ = class179_sub3_508_.aClass366_9564.aShortArray3858;
		is_523_ = class179_sub3_508_.aClass366_9564.aByteArray3855;
	    } else {
		is_520_ = null;
		is_521_ = null;
		is_522_ = null;
		is_523_ = null;
	    }
	    int[] is_524_ = class179_sub3_508_.anIntArray9598;
	    short[] is_525_ = class179_sub3_508_.aShortArray9599;
	    if (!class179_sub3_508_.aBool9586)
		class179_sub3_508_.method15278();
	    int i_526_ = class179_sub3_508_.anInt9587;
	    int i_527_ = class179_sub3_508_.anInt9588;
	    int i_528_ = class179_sub3_508_.anInt9589;
	    int i_529_ = class179_sub3_508_.anInt9590;
	    int i_530_ = class179_sub3_508_.anInt9591;
	    int i_531_ = class179_sub3_508_.anInt9592;
	    for (int i_532_ = 0; i_532_ < anInt9549; i_532_++) {
		int i_533_ = anIntArray9551[i_532_] - i_506_;
		if (i_533_ >= i_526_ && i_533_ <= i_527_) {
		    int i_534_ = anIntArray9550[i_532_] - i;
		    if (i_534_ >= i_528_ && i_534_ <= i_529_) {
			int i_535_ = anIntArray9541[i_532_] - i_507_;
			if (i_535_ >= i_530_ && i_535_ <= i_531_) {
			    int i_536_ = -1;
			    int i_537_ = anIntArray9598[i_532_];
			    int i_538_ = anIntArray9598[i_532_ + 1];
			    for (int i_539_ = i_537_;
				 (i_539_ < i_538_
				  && aShortArray9599[i_539_] != 0);
				 i_539_++) {
				i_536_
				    = (aShortArray9599[i_539_] & 0xffff) - 1;
				if (aByteArray9557[i_536_] != 0)
				    break;
			    }
			    if (i_536_ != -1) {
				for (int i_540_ = 0; i_540_ < i_509_;
				     i_540_++) {
				    if (i_534_ == is[i_540_]
					&& i_535_ == is_511_[i_540_]
					&& i_533_ == is_510_[i_540_]) {
					int i_541_ = -1;
					i_537_ = is_524_[i_540_];
					i_538_ = is_524_[i_540_ + 1];
					for (int i_542_ = i_537_;
					     (i_542_ < i_538_
					      && is_525_[i_542_] != 0);
					     i_542_++) {
					    i_541_
						= is_525_[i_542_] - 1 & 0xffff;
					    if (is_515_[i_541_] != 0)
						break;
					}
					if (i_541_ != -1) {
					    if (is_516_ == null) {
						aClass366_9564
						    = new Class366();
						is_516_
						    = aClass366_9564
							  .aShortArray3857
						    = (Class457.method7467
						       (aShortArray9617,
							276490836));
						is_517_
						    = aClass366_9564
							  .aShortArray3856
						    = (Class457.method7467
						       (aShortArray9559,
							1061433784));
						is_518_
						    = aClass366_9564
							  .aShortArray3858
						    = (Class457.method7467
						       (aShortArray9560,
							-1396134917));
						is_519_
						    = aClass366_9564
							  .aByteArray3855
						    = (Class509.method8501
						       (aByteArray9557,
							-1024531176));
					    }
					    if (is_520_ == null) {
						Class366 class366
						    = (class179_sub3_508_
							   .aClass366_9564
						       = new Class366());
						is_520_
						    = class366.aShortArray3857
						    = (Class457.method7467
						       (is_512_, -1842881253));
						is_521_
						    = class366.aShortArray3856
						    = (Class457.method7467
						       (is_513_, -966753507));
						is_522_
						    = class366.aShortArray3858
						    = (Class457.method7467
						       (is_514_, 1639612200));
						is_523_
						    = class366.aByteArray3855
						    = (Class509.method8501
						       (is_515_, 1480197326));
					    }
					    short i_543_
						= aShortArray9617[i_536_];
					    short i_544_
						= aShortArray9559[i_536_];
					    short i_545_
						= aShortArray9560[i_536_];
					    byte i_546_
						= aByteArray9557[i_536_];
					    i_537_ = is_524_[i_540_];
					    i_538_ = is_524_[i_540_ + 1];
					    for (int i_547_ = i_537_;
						 i_547_ < i_538_; i_547_++) {
						int i_548_
						    = is_525_[i_547_] - 1;
						if (i_548_ == -1)
						    break;
						if (is_523_[i_548_] != 0) {
						    is_520_[i_548_] += i_543_;
						    is_521_[i_548_] += i_544_;
						    is_522_[i_548_] += i_545_;
						    is_523_[i_548_] += i_546_;
						}
					    }
					    i_543_ = is_512_[i_541_];
					    i_544_ = is_513_[i_541_];
					    i_545_ = is_514_[i_541_];
					    i_546_ = is_515_[i_541_];
					    i_537_ = anIntArray9598[i_532_];
					    i_538_
						= anIntArray9598[i_532_ + 1];
					    for (int i_549_ = i_537_;
						 (i_549_ < i_538_
						  && (aShortArray9599[i_549_]
						      != 0));
						 i_549_++) {
						int i_550_
						    = ((aShortArray9599[i_549_]
							& 0xffff)
						       - 1);
						if (is_519_[i_550_] != 0) {
						    is_516_[i_550_] += i_543_;
						    is_517_[i_550_] += i_544_;
						    is_518_[i_550_] += i_545_;
						    is_519_[i_550_] += i_546_;
						}
					    }
					    class179_sub3_508_.method15273();
					    method15273();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method2983(Class179 class179, int i, int i_551_, int i_552_,
			   boolean bool) {
	Class179_Sub3 class179_sub3_553_ = (Class179_Sub3) class179;
	if (anInt9595 != 0 && class179_sub3_553_.anInt9595 != 0) {
	    int i_554_ = class179_sub3_553_.anInt9549;
	    int[] is = class179_sub3_553_.anIntArray9550;
	    int[] is_555_ = class179_sub3_553_.anIntArray9551;
	    int[] is_556_ = class179_sub3_553_.anIntArray9541;
	    short[] is_557_ = class179_sub3_553_.aShortArray9617;
	    short[] is_558_ = class179_sub3_553_.aShortArray9559;
	    short[] is_559_ = class179_sub3_553_.aShortArray9560;
	    byte[] is_560_ = class179_sub3_553_.aByteArray9557;
	    short[] is_561_;
	    short[] is_562_;
	    short[] is_563_;
	    byte[] is_564_;
	    if (aClass366_9564 != null) {
		is_561_ = aClass366_9564.aShortArray3857;
		is_562_ = aClass366_9564.aShortArray3856;
		is_563_ = aClass366_9564.aShortArray3858;
		is_564_ = aClass366_9564.aByteArray3855;
	    } else {
		is_561_ = null;
		is_562_ = null;
		is_563_ = null;
		is_564_ = null;
	    }
	    short[] is_565_;
	    short[] is_566_;
	    short[] is_567_;
	    byte[] is_568_;
	    if (class179_sub3_553_.aClass366_9564 != null) {
		is_565_ = class179_sub3_553_.aClass366_9564.aShortArray3857;
		is_566_ = class179_sub3_553_.aClass366_9564.aShortArray3856;
		is_567_ = class179_sub3_553_.aClass366_9564.aShortArray3858;
		is_568_ = class179_sub3_553_.aClass366_9564.aByteArray3855;
	    } else {
		is_565_ = null;
		is_566_ = null;
		is_567_ = null;
		is_568_ = null;
	    }
	    int[] is_569_ = class179_sub3_553_.anIntArray9598;
	    short[] is_570_ = class179_sub3_553_.aShortArray9599;
	    if (!class179_sub3_553_.aBool9586)
		class179_sub3_553_.method15278();
	    int i_571_ = class179_sub3_553_.anInt9587;
	    int i_572_ = class179_sub3_553_.anInt9588;
	    int i_573_ = class179_sub3_553_.anInt9589;
	    int i_574_ = class179_sub3_553_.anInt9590;
	    int i_575_ = class179_sub3_553_.anInt9591;
	    int i_576_ = class179_sub3_553_.anInt9592;
	    for (int i_577_ = 0; i_577_ < anInt9549; i_577_++) {
		int i_578_ = anIntArray9551[i_577_] - i_551_;
		if (i_578_ >= i_571_ && i_578_ <= i_572_) {
		    int i_579_ = anIntArray9550[i_577_] - i;
		    if (i_579_ >= i_573_ && i_579_ <= i_574_) {
			int i_580_ = anIntArray9541[i_577_] - i_552_;
			if (i_580_ >= i_575_ && i_580_ <= i_576_) {
			    int i_581_ = -1;
			    int i_582_ = anIntArray9598[i_577_];
			    int i_583_ = anIntArray9598[i_577_ + 1];
			    for (int i_584_ = i_582_;
				 (i_584_ < i_583_
				  && aShortArray9599[i_584_] != 0);
				 i_584_++) {
				i_581_
				    = (aShortArray9599[i_584_] & 0xffff) - 1;
				if (aByteArray9557[i_581_] != 0)
				    break;
			    }
			    if (i_581_ != -1) {
				for (int i_585_ = 0; i_585_ < i_554_;
				     i_585_++) {
				    if (i_579_ == is[i_585_]
					&& i_580_ == is_556_[i_585_]
					&& i_578_ == is_555_[i_585_]) {
					int i_586_ = -1;
					i_582_ = is_569_[i_585_];
					i_583_ = is_569_[i_585_ + 1];
					for (int i_587_ = i_582_;
					     (i_587_ < i_583_
					      && is_570_[i_587_] != 0);
					     i_587_++) {
					    i_586_
						= is_570_[i_587_] - 1 & 0xffff;
					    if (is_560_[i_586_] != 0)
						break;
					}
					if (i_586_ != -1) {
					    if (is_561_ == null) {
						aClass366_9564
						    = new Class366();
						is_561_
						    = aClass366_9564
							  .aShortArray3857
						    = (Class457.method7467
						       (aShortArray9617,
							-213747098));
						is_562_
						    = aClass366_9564
							  .aShortArray3856
						    = (Class457.method7467
						       (aShortArray9559,
							-1973340605));
						is_563_
						    = aClass366_9564
							  .aShortArray3858
						    = (Class457.method7467
						       (aShortArray9560,
							1778258106));
						is_564_
						    = aClass366_9564
							  .aByteArray3855
						    = (Class509.method8501
						       (aByteArray9557,
							-323853489));
					    }
					    if (is_565_ == null) {
						Class366 class366
						    = (class179_sub3_553_
							   .aClass366_9564
						       = new Class366());
						is_565_
						    = class366.aShortArray3857
						    = (Class457.method7467
						       (is_557_, 121767479));
						is_566_
						    = class366.aShortArray3856
						    = (Class457.method7467
						       (is_558_, -1080646710));
						is_567_
						    = class366.aShortArray3858
						    = (Class457.method7467
						       (is_559_, -149082821));
						is_568_
						    = class366.aByteArray3855
						    = (Class509.method8501
						       (is_560_, -1825240519));
					    }
					    short i_588_
						= aShortArray9617[i_581_];
					    short i_589_
						= aShortArray9559[i_581_];
					    short i_590_
						= aShortArray9560[i_581_];
					    byte i_591_
						= aByteArray9557[i_581_];
					    i_582_ = is_569_[i_585_];
					    i_583_ = is_569_[i_585_ + 1];
					    for (int i_592_ = i_582_;
						 i_592_ < i_583_; i_592_++) {
						int i_593_
						    = is_570_[i_592_] - 1;
						if (i_593_ == -1)
						    break;
						if (is_568_[i_593_] != 0) {
						    is_565_[i_593_] += i_588_;
						    is_566_[i_593_] += i_589_;
						    is_567_[i_593_] += i_590_;
						    is_568_[i_593_] += i_591_;
						}
					    }
					    i_588_ = is_557_[i_586_];
					    i_589_ = is_558_[i_586_];
					    i_590_ = is_559_[i_586_];
					    i_591_ = is_560_[i_586_];
					    i_582_ = anIntArray9598[i_577_];
					    i_583_
						= anIntArray9598[i_577_ + 1];
					    for (int i_594_ = i_582_;
						 (i_594_ < i_583_
						  && (aShortArray9599[i_594_]
						      != 0));
						 i_594_++) {
						int i_595_
						    = ((aShortArray9599[i_594_]
							& 0xffff)
						       - 1);
						if (is_564_[i_595_] != 0) {
						    is_561_[i_595_] += i_588_;
						    is_562_[i_595_] += i_589_;
						    is_563_[i_595_] += i_590_;
						    is_564_[i_595_] += i_591_;
						}
					    }
					    class179_sub3_553_.method15273();
					    method15273();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public Class179 method2984(byte i, int i_596_, boolean bool) {
	boolean bool_597_ = false;
	Class179_Sub3 class179_sub3_598_;
	Class179_Sub3 class179_sub3_599_;
	if (i > 0 && i <= 8) {
	    class179_sub3_599_
		= aClass182_Sub1_9585.aClass179_Sub3Array9269[i - 1];
	    class179_sub3_598_
		= aClass182_Sub1_9585.aClass179_Sub3Array9320[i - 1];
	    bool_597_ = true;
	} else
	    class179_sub3_598_ = class179_sub3_599_
		= new Class179_Sub3(aClass182_Sub1_9585, 0, 0, true, false);
	return method15272(class179_sub3_598_, class179_sub3_599_, i_596_,
			   bool_597_, bool);
    }
    
    public Class179 method2985(byte i, int i_600_, boolean bool) {
	boolean bool_601_ = false;
	Class179_Sub3 class179_sub3_602_;
	Class179_Sub3 class179_sub3_603_;
	if (i > 0 && i <= 8) {
	    class179_sub3_603_
		= aClass182_Sub1_9585.aClass179_Sub3Array9269[i - 1];
	    class179_sub3_602_
		= aClass182_Sub1_9585.aClass179_Sub3Array9320[i - 1];
	    bool_601_ = true;
	} else
	    class179_sub3_602_ = class179_sub3_603_
		= new Class179_Sub3(aClass182_Sub1_9585, 0, 0, true, false);
	return method15272(class179_sub3_602_, class179_sub3_603_, i_600_,
			   bool_601_, bool);
    }
    
    public void method2935(int i) {
	int i_604_ = Class436.anIntArray4831[i];
	int i_605_ = Class436.anIntArray4838[i];
	for (int i_606_ = 0; i_606_ < anInt9549; i_606_++) {
	    int i_607_ = ((anIntArray9541[i_606_] * i_604_
			   + anIntArray9550[i_606_] * i_605_)
			  >> 14);
	    anIntArray9541[i_606_] = (anIntArray9541[i_606_] * i_605_
				      - anIntArray9550[i_606_] * i_604_) >> 14;
	    anIntArray9550[i_606_] = i_607_;
	}
	for (int i_608_ = 0; i_608_ < anInt9555; i_608_++) {
	    int i_609_ = ((aShortArray9560[i_608_] * i_604_
			   + aShortArray9617[i_608_] * i_605_)
			  >> 14);
	    aShortArray9560[i_608_]
		= (short) ((aShortArray9560[i_608_] * i_605_
			    - aShortArray9617[i_608_] * i_604_)
			   >> 14);
	    aShortArray9617[i_608_] = (short) i_609_;
	}
	method15326();
	method15273();
	aBool9586 = false;
    }
    
    public int method2986() {
	return anInt9544;
    }
    
    public int method2988() {
	return anInt9544;
    }
    
    public int method3078() {
	return anInt9544;
    }
    
    public void method3044(int i) {
	aShort9546 = (short) i;
	method15290();
    }
    
    public void method2991() {
	if (anInt9555 > 0 && anInt9566 > 0) {
	    method15286();
	    method15295();
	    method15298();
	}
    }
    
    public int method2963() {
	if (!aBool9586)
	    method15278();
	return anInt9592;
    }
    
    public void method2993(int i) {
	int i_610_ = Class436.anIntArray4831[i];
	int i_611_ = Class436.anIntArray4838[i];
	for (int i_612_ = 0; i_612_ < anInt9549; i_612_++) {
	    int i_613_ = ((anIntArray9541[i_612_] * i_610_
			   + anIntArray9550[i_612_] * i_611_)
			  >> 14);
	    anIntArray9541[i_612_] = (anIntArray9541[i_612_] * i_611_
				      - anIntArray9550[i_612_] * i_610_) >> 14;
	    anIntArray9550[i_612_] = i_613_;
	}
	method15326();
	aBool9586 = false;
    }
    
    public void method3025() {
	if (!aBool9593) {
	    if (!aBool9586)
		method15278();
	    anInt9594 = anInt9587;
	    aBool9593 = true;
	}
    }
    
    public void method2932(int i) {
	int i_614_ = Class436.anIntArray4831[i];
	int i_615_ = Class436.anIntArray4838[i];
	for (int i_616_ = 0; i_616_ < anInt9549; i_616_++) {
	    int i_617_ = ((anIntArray9551[i_616_] * i_615_
			   - anIntArray9541[i_616_] * i_614_)
			  >> 14);
	    anIntArray9541[i_616_] = (anIntArray9551[i_616_] * i_614_
				      + anIntArray9541[i_616_] * i_615_) >> 14;
	    anIntArray9551[i_616_] = i_617_;
	}
	method15326();
	aBool9586 = false;
    }
    
    void method15289() {
	if ((anInt9558 & 0x37) != 0) {
	    if (aClass363_9578 != null)
		aClass363_9578.aBool3835 = false;
	} else if (aClass363_9577 != null)
	    aClass363_9577.aBool3835 = false;
    }
    
    public void method3074() {
	for (int i = 0; i < anInt9549; i++)
	    anIntArray9541[i] = -anIntArray9541[i];
	for (int i = 0; i < anInt9555; i++)
	    aShortArray9560[i] = (short) -aShortArray9560[i];
	for (int i = 0; i < anInt9595; i++) {
	    short i_618_ = aShortArray9561[i];
	    aShortArray9561[i] = aShortArray9571[i];
	    aShortArray9571[i] = i_618_;
	}
	method15326();
	method15273();
	method15274();
	aBool9586 = false;
    }
    
    public void method2998(int i) {
	int i_619_ = Class436.anIntArray4831[i];
	int i_620_ = Class436.anIntArray4838[i];
	for (int i_621_ = 0; i_621_ < anInt9549; i_621_++) {
	    int i_622_ = ((anIntArray9551[i_621_] * i_620_
			   - anIntArray9541[i_621_] * i_619_)
			  >> 14);
	    anIntArray9541[i_621_] = (anIntArray9551[i_621_] * i_619_
				      + anIntArray9541[i_621_] * i_620_) >> 14;
	    anIntArray9551[i_621_] = i_622_;
	}
	method15326();
	aBool9586 = false;
    }
    
    public boolean method3017() {
	return aBool9582;
    }
    
    public void method3036(int i) {
	int i_623_ = Class436.anIntArray4831[i];
	int i_624_ = Class436.anIntArray4838[i];
	for (int i_625_ = 0; i_625_ < anInt9549; i_625_++) {
	    int i_626_ = ((anIntArray9551[i_625_] * i_624_
			   - anIntArray9541[i_625_] * i_623_)
			  >> 14);
	    anIntArray9541[i_625_] = (anIntArray9551[i_625_] * i_623_
				      + anIntArray9541[i_625_] * i_624_) >> 14;
	    anIntArray9551[i_625_] = i_626_;
	}
	method15326();
	aBool9586 = false;
    }
    
    public boolean method2954(int i, int i_627_, Class444 class444,
			      boolean bool, int i_628_) {
	return method15280(i, i_627_, 0, 0, class444, bool, i_628_);
    }
    
    public void method3011(int i) {
	int i_629_ = Class436.anIntArray4831[i];
	int i_630_ = Class436.anIntArray4838[i];
	for (int i_631_ = 0; i_631_ < anInt9549; i_631_++) {
	    int i_632_ = ((anIntArray9551[i_631_] * i_629_
			   + anIntArray9550[i_631_] * i_630_)
			  >> 14);
	    anIntArray9551[i_631_] = (anIntArray9551[i_631_] * i_630_
				      - anIntArray9550[i_631_] * i_629_) >> 14;
	    anIntArray9550[i_631_] = i_632_;
	}
	method15326();
	aBool9586 = false;
    }
    
    public void method2999(int i) {
	int i_633_ = Class436.anIntArray4831[i];
	int i_634_ = Class436.anIntArray4838[i];
	for (int i_635_ = 0; i_635_ < anInt9549; i_635_++) {
	    int i_636_ = ((anIntArray9551[i_635_] * i_634_
			   - anIntArray9541[i_635_] * i_633_)
			  >> 14);
	    anIntArray9541[i_635_] = (anIntArray9551[i_635_] * i_633_
				      + anIntArray9541[i_635_] * i_634_) >> 14;
	    anIntArray9551[i_635_] = i_636_;
	}
	method15326();
	aBool9586 = false;
    }
    
    public void method2965(int i, int i_637_, int i_638_) {
	for (int i_639_ = 0; i_639_ < anInt9549; i_639_++) {
	    if (i != 128)
		anIntArray9550[i_639_] = anIntArray9550[i_639_] * i >> 7;
	    if (i_637_ != 128)
		anIntArray9551[i_639_] = anIntArray9551[i_639_] * i_637_ >> 7;
	    if (i_638_ != 128)
		anIntArray9541[i_639_] = anIntArray9541[i_639_] * i_638_ >> 7;
	}
	method15326();
	aBool9586 = false;
    }
    
    public void method3005(int i, int i_640_, int i_641_) {
	for (int i_642_ = 0; i_642_ < anInt9549; i_642_++) {
	    if (i != 128)
		anIntArray9550[i_642_] = anIntArray9550[i_642_] * i >> 7;
	    if (i_640_ != 128)
		anIntArray9551[i_642_] = anIntArray9551[i_642_] * i_640_ >> 7;
	    if (i_641_ != 128)
		anIntArray9541[i_642_] = anIntArray9541[i_642_] * i_641_ >> 7;
	}
	method15326();
	aBool9586 = false;
    }
    
    void method3006() {
	/* empty */
    }
    
    void method15290() {
	if (aClass363_9577 != null)
	    aClass363_9577.aBool3835 = false;
    }
    
    void method3008() {
	/* empty */
    }
    
    boolean method2919() {
	if (anIntArrayArray9553 == null)
	    return false;
	for (int i = 0; i < anInt9583; i++) {
	    anIntArray9550[i] <<= 4;
	    anIntArray9551[i] <<= 4;
	    anIntArray9541[i] <<= 4;
	}
	anInt9613 = 0;
	anInt9614 = 0;
	anInt9576 = 0;
	return true;
    }
    
    void method3027() {
	for (int i = 0; i < anInt9583; i++) {
	    anIntArray9550[i] = anIntArray9550[i] + 7 >> 4;
	    anIntArray9551[i] = anIntArray9551[i] + 7 >> 4;
	    anIntArray9541[i] = anIntArray9541[i] + 7 >> 4;
	}
	method15326();
	aBool9586 = false;
    }
    
    void method3108() {
	for (int i = 0; i < anInt9583; i++) {
	    anIntArray9550[i] = anIntArray9550[i] + 7 >> 4;
	    anIntArray9551[i] = anIntArray9551[i] + 7 >> 4;
	    anIntArray9541[i] = anIntArray9541[i] + 7 >> 4;
	}
	method15326();
	aBool9586 = false;
    }
    
    void method3012(int i, int[] is, int i_643_, int i_644_, int i_645_,
		    int i_646_, boolean bool) {
	int i_647_ = is.length;
	if (i == 0) {
	    i_643_ <<= 4;
	    i_644_ <<= 4;
	    i_645_ <<= 4;
	    int i_648_ = 0;
	    anInt9613 = 0;
	    anInt9614 = 0;
	    anInt9576 = 0;
	    for (int i_649_ = 0; i_649_ < i_647_; i_649_++) {
		int i_650_ = is[i_649_];
		if (i_650_ < anIntArrayArray9553.length) {
		    int[] is_651_ = anIntArrayArray9553[i_650_];
		    for (int i_652_ = 0; i_652_ < is_651_.length; i_652_++) {
			int i_653_ = is_651_[i_652_];
			anInt9613 += anIntArray9550[i_653_];
			anInt9614 += anIntArray9551[i_653_];
			anInt9576 += anIntArray9541[i_653_];
			i_648_++;
		    }
		}
	    }
	    if (i_648_ > 0) {
		anInt9613 = anInt9613 / i_648_ + i_643_;
		anInt9614 = anInt9614 / i_648_ + i_644_;
		anInt9576 = anInt9576 / i_648_ + i_645_;
	    } else {
		anInt9613 = i_643_;
		anInt9614 = i_644_;
		anInt9576 = i_645_;
	    }
	} else if (i == 1) {
	    i_643_ <<= 4;
	    i_644_ <<= 4;
	    i_645_ <<= 4;
	    for (int i_654_ = 0; i_654_ < i_647_; i_654_++) {
		int i_655_ = is[i_654_];
		if (i_655_ < anIntArrayArray9553.length) {
		    int[] is_656_ = anIntArrayArray9553[i_655_];
		    for (int i_657_ = 0; i_657_ < is_656_.length; i_657_++) {
			int i_658_ = is_656_[i_657_];
			anIntArray9550[i_658_] += i_643_;
			anIntArray9551[i_658_] += i_644_;
			anIntArray9541[i_658_] += i_645_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_659_ = 0; i_659_ < i_647_; i_659_++) {
		int i_660_ = is[i_659_];
		if (i_660_ < anIntArrayArray9553.length) {
		    int[] is_661_ = anIntArrayArray9553[i_660_];
		    if ((i_646_ & 0x1) == 0) {
			for (int i_662_ = 0; i_662_ < is_661_.length;
			     i_662_++) {
			    int i_663_ = is_661_[i_662_];
			    anIntArray9550[i_663_] -= anInt9613;
			    anIntArray9551[i_663_] -= anInt9614;
			    anIntArray9541[i_663_] -= anInt9576;
			    if (i_645_ != 0) {
				int i_664_ = Class436.anIntArray4831[i_645_];
				int i_665_ = Class436.anIntArray4838[i_645_];
				int i_666_ = (anIntArray9551[i_663_] * i_664_
					      + anIntArray9550[i_663_] * i_665_
					      + 16383) >> 14;
				anIntArray9551[i_663_]
				    = (anIntArray9551[i_663_] * i_665_
				       - anIntArray9550[i_663_] * i_664_
				       + 16383) >> 14;
				anIntArray9550[i_663_] = i_666_;
			    }
			    if (i_643_ != 0) {
				int i_667_ = Class436.anIntArray4831[i_643_];
				int i_668_ = Class436.anIntArray4838[i_643_];
				int i_669_ = (anIntArray9551[i_663_] * i_668_
					      - anIntArray9541[i_663_] * i_667_
					      + 16383) >> 14;
				anIntArray9541[i_663_]
				    = (anIntArray9551[i_663_] * i_667_
				       + anIntArray9541[i_663_] * i_668_
				       + 16383) >> 14;
				anIntArray9551[i_663_] = i_669_;
			    }
			    if (i_644_ != 0) {
				int i_670_ = Class436.anIntArray4831[i_644_];
				int i_671_ = Class436.anIntArray4838[i_644_];
				int i_672_ = (anIntArray9541[i_663_] * i_670_
					      + anIntArray9550[i_663_] * i_671_
					      + 16383) >> 14;
				anIntArray9541[i_663_]
				    = (anIntArray9541[i_663_] * i_671_
				       - anIntArray9550[i_663_] * i_670_
				       + 16383) >> 14;
				anIntArray9550[i_663_] = i_672_;
			    }
			    anIntArray9550[i_663_] += anInt9613;
			    anIntArray9551[i_663_] += anInt9614;
			    anIntArray9541[i_663_] += anInt9576;
			}
		    } else {
			for (int i_673_ = 0; i_673_ < is_661_.length;
			     i_673_++) {
			    int i_674_ = is_661_[i_673_];
			    anIntArray9550[i_674_] -= anInt9613;
			    anIntArray9551[i_674_] -= anInt9614;
			    anIntArray9541[i_674_] -= anInt9576;
			    if (i_643_ != 0) {
				int i_675_ = Class436.anIntArray4831[i_643_];
				int i_676_ = Class436.anIntArray4838[i_643_];
				int i_677_ = (anIntArray9551[i_674_] * i_676_
					      - anIntArray9541[i_674_] * i_675_
					      + 16383) >> 14;
				anIntArray9541[i_674_]
				    = (anIntArray9551[i_674_] * i_675_
				       + anIntArray9541[i_674_] * i_676_
				       + 16383) >> 14;
				anIntArray9551[i_674_] = i_677_;
			    }
			    if (i_645_ != 0) {
				int i_678_ = Class436.anIntArray4831[i_645_];
				int i_679_ = Class436.anIntArray4838[i_645_];
				int i_680_ = (anIntArray9551[i_674_] * i_678_
					      + anIntArray9550[i_674_] * i_679_
					      + 16383) >> 14;
				anIntArray9551[i_674_]
				    = (anIntArray9551[i_674_] * i_679_
				       - anIntArray9550[i_674_] * i_678_
				       + 16383) >> 14;
				anIntArray9550[i_674_] = i_680_;
			    }
			    if (i_644_ != 0) {
				int i_681_ = Class436.anIntArray4831[i_644_];
				int i_682_ = Class436.anIntArray4838[i_644_];
				int i_683_ = (anIntArray9541[i_674_] * i_681_
					      + anIntArray9550[i_674_] * i_682_
					      + 16383) >> 14;
				anIntArray9541[i_674_]
				    = (anIntArray9541[i_674_] * i_682_
				       - anIntArray9550[i_674_] * i_681_
				       + 16383) >> 14;
				anIntArray9550[i_674_] = i_683_;
			    }
			    anIntArray9550[i_674_] += anInt9613;
			    anIntArray9551[i_674_] += anInt9614;
			    anIntArray9541[i_674_] += anInt9576;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_684_ = 0; i_684_ < i_647_; i_684_++) {
		    int i_685_ = is[i_684_];
		    if (i_685_ < anIntArrayArray9553.length) {
			int[] is_686_ = anIntArrayArray9553[i_685_];
			for (int i_687_ = 0; i_687_ < is_686_.length;
			     i_687_++) {
			    int i_688_ = is_686_[i_687_];
			    int i_689_ = anIntArray9598[i_688_];
			    int i_690_ = anIntArray9598[i_688_ + 1];
			    for (int i_691_ = i_689_;
				 (i_691_ < i_690_
				  && aShortArray9599[i_691_] != 0);
				 i_691_++) {
				int i_692_
				    = (aShortArray9599[i_691_] & 0xffff) - 1;
				if (i_645_ != 0) {
				    int i_693_
					= Class436.anIntArray4831[i_645_];
				    int i_694_
					= Class436.anIntArray4838[i_645_];
				    int i_695_
					= ((aShortArray9559[i_692_] * i_693_
					    + aShortArray9617[i_692_] * i_694_
					    + 16383)
					   >> 14);
				    aShortArray9559[i_692_]
					= (short) (((aShortArray9559[i_692_]
						     * i_694_)
						    - (aShortArray9617[i_692_]
						       * i_693_)
						    + 16383)
						   >> 14);
				    aShortArray9617[i_692_] = (short) i_695_;
				}
				if (i_643_ != 0) {
				    int i_696_
					= Class436.anIntArray4831[i_643_];
				    int i_697_
					= Class436.anIntArray4838[i_643_];
				    int i_698_
					= ((aShortArray9559[i_692_] * i_697_
					    - aShortArray9560[i_692_] * i_696_
					    + 16383)
					   >> 14);
				    aShortArray9560[i_692_]
					= (short) (((aShortArray9559[i_692_]
						     * i_696_)
						    + (aShortArray9560[i_692_]
						       * i_697_)
						    + 16383)
						   >> 14);
				    aShortArray9559[i_692_] = (short) i_698_;
				}
				if (i_644_ != 0) {
				    int i_699_
					= Class436.anIntArray4831[i_644_];
				    int i_700_
					= Class436.anIntArray4838[i_644_];
				    int i_701_
					= ((aShortArray9560[i_692_] * i_699_
					    + aShortArray9617[i_692_] * i_700_
					    + 16383)
					   >> 14);
				    aShortArray9560[i_692_]
					= (short) (((aShortArray9560[i_692_]
						     * i_700_)
						    - (aShortArray9617[i_692_]
						       * i_699_)
						    + 16383)
						   >> 14);
				    aShortArray9617[i_692_] = (short) i_701_;
				}
			    }
			}
		    }
		}
		method15273();
	    }
	} else if (i == 3) {
	    for (int i_702_ = 0; i_702_ < i_647_; i_702_++) {
		int i_703_ = is[i_702_];
		if (i_703_ < anIntArrayArray9553.length) {
		    int[] is_704_ = anIntArrayArray9553[i_703_];
		    for (int i_705_ = 0; i_705_ < is_704_.length; i_705_++) {
			int i_706_ = is_704_[i_705_];
			anIntArray9550[i_706_] -= anInt9613;
			anIntArray9551[i_706_] -= anInt9614;
			anIntArray9541[i_706_] -= anInt9576;
			anIntArray9550[i_706_]
			    = anIntArray9550[i_706_] * i_643_ >> 7;
			anIntArray9551[i_706_]
			    = anIntArray9551[i_706_] * i_644_ >> 7;
			anIntArray9541[i_706_]
			    = anIntArray9541[i_706_] * i_645_ >> 7;
			anIntArray9550[i_706_] += anInt9613;
			anIntArray9551[i_706_] += anInt9614;
			anIntArray9541[i_706_] += anInt9576;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9573 != null) {
		boolean bool_707_ = false;
		for (int i_708_ = 0; i_708_ < i_647_; i_708_++) {
		    int i_709_ = is[i_708_];
		    if (i_709_ < anIntArrayArray9573.length) {
			int[] is_710_ = anIntArrayArray9573[i_709_];
			for (int i_711_ = 0; i_711_ < is_710_.length;
			     i_711_++) {
			    int i_712_ = is_710_[i_711_];
			    int i_713_
				= (aByteArray9568[i_712_] & 0xff) + i_643_ * 8;
			    if (i_713_ < 0)
				i_713_ = 0;
			    else if (i_713_ > 255)
				i_713_ = 255;
			    aByteArray9568[i_712_] = (byte) i_713_;
			}
			bool_707_ = bool_707_ | is_710_.length > 0;
		    }
		}
		if (bool_707_) {
		    if (aClass359Array9604 != null) {
			for (int i_714_ = 0; i_714_ < anInt9603; i_714_++) {
			    Class359 class359 = aClass359Array9604[i_714_];
			    Class349 class349 = aClass349Array9574[i_714_];
			    class349.anInt3739
				= (class349.anInt3739 & 0xffffff
				   | 255 - (aByteArray9568[class359.anInt3805]
					    & 0xff) << 24);
			}
		    }
		    method15290();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9573 != null) {
		boolean bool_715_ = false;
		for (int i_716_ = 0; i_716_ < i_647_; i_716_++) {
		    int i_717_ = is[i_716_];
		    if (i_717_ < anIntArrayArray9573.length) {
			int[] is_718_ = anIntArrayArray9573[i_717_];
			for (int i_719_ = 0; i_719_ < is_718_.length;
			     i_719_++) {
			    int i_720_ = is_718_[i_719_];
			    int i_721_ = aShortArray9552[i_720_] & 0xffff;
			    int i_722_ = i_721_ >> 10 & 0x3f;
			    int i_723_ = i_721_ >> 7 & 0x7;
			    int i_724_ = i_721_ & 0x7f;
			    i_722_ = i_722_ + i_643_ & 0x3f;
			    i_723_ += i_644_ / 4;
			    if (i_723_ < 0)
				i_723_ = 0;
			    else if (i_723_ > 7)
				i_723_ = 7;
			    i_724_ += i_645_;
			    if (i_724_ < 0)
				i_724_ = 0;
			    else if (i_724_ > 127)
				i_724_ = 127;
			    aShortArray9552[i_720_]
				= (short) (i_722_ << 10 | i_723_ << 7
					   | i_724_);
			}
			bool_715_ = bool_715_ | is_718_.length > 0;
		    }
		}
		if (bool_715_) {
		    if (aClass359Array9604 != null) {
			for (int i_725_ = 0; i_725_ < anInt9603; i_725_++) {
			    Class359 class359 = aClass359Array9604[i_725_];
			    Class349 class349 = aClass349Array9574[i_725_];
			    class349.anInt3739
				= (class349.anInt3739 & ~0xffffff
				   | (Class642.anIntArray8324
				      [(aShortArray9552[class359.anInt3805]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15290();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9543 != null) {
		for (int i_726_ = 0; i_726_ < i_647_; i_726_++) {
		    int i_727_ = is[i_726_];
		    if (i_727_ < anIntArrayArray9543.length) {
			int[] is_728_ = anIntArrayArray9543[i_727_];
			for (int i_729_ = 0; i_729_ < is_728_.length;
			     i_729_++) {
			    Class349 class349
				= aClass349Array9574[is_728_[i_729_]];
			    class349.anInt3738 += i_643_;
			    class349.anInt3735 += i_644_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9543 != null) {
		for (int i_730_ = 0; i_730_ < i_647_; i_730_++) {
		    int i_731_ = is[i_730_];
		    if (i_731_ < anIntArrayArray9543.length) {
			int[] is_732_ = anIntArrayArray9543[i_731_];
			for (int i_733_ = 0; i_733_ < is_732_.length;
			     i_733_++) {
			    Class349 class349
				= aClass349Array9574[is_732_[i_733_]];
			    class349.anInt3740
				= class349.anInt3740 * i_643_ >> 7;
			    class349.anInt3737
				= class349.anInt3737 * i_644_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9543 != null) {
		for (int i_734_ = 0; i_734_ < i_647_; i_734_++) {
		    int i_735_ = is[i_734_];
		    if (i_735_ < anIntArrayArray9543.length) {
			int[] is_736_ = anIntArrayArray9543[i_735_];
			for (int i_737_ = 0; i_737_ < is_736_.length;
			     i_737_++) {
			    Class349 class349
				= aClass349Array9574[is_736_[i_737_]];
			    class349.anInt3736
				= class349.anInt3736 + i_643_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    public void method3083(Class444 class444, int i, boolean bool) {
	if (aShortArray9548 != null) {
	    Class444 class444_738_ = class444;
	    if (bool) {
		class444_738_ = aClass182_Sub1_9585.aClass444_9179;
		class444_738_.method7163(class444);
	    }
	    float[] fs = new float[3];
	    for (int i_739_ = 0; i_739_ < anInt9549; i_739_++) {
		if ((i & aShortArray9548[i_739_]) != 0) {
		    class444_738_.method7168((float) anIntArray9550[i_739_],
					     (float) anIntArray9551[i_739_],
					     (float) anIntArray9541[i_739_],
					     fs);
		    anIntArray9550[i_739_] = (int) fs[0];
		    anIntArray9551[i_739_] = (int) fs[1];
		    anIntArray9541[i_739_] = (int) fs[2];
		}
	    }
	}
    }
    
    void method3000(int i, int i_740_, int i_741_, int i_742_) {
	if (i == 0) {
	    int i_743_ = 0;
	    anInt9613 = 0;
	    anInt9614 = 0;
	    anInt9576 = 0;
	    for (int i_744_ = 0; i_744_ < anInt9549; i_744_++) {
		anInt9613 += anIntArray9550[i_744_];
		anInt9614 += anIntArray9551[i_744_];
		anInt9576 += anIntArray9541[i_744_];
		i_743_++;
	    }
	    if (i_743_ > 0) {
		anInt9613 = anInt9613 / i_743_ + i_740_;
		anInt9614 = anInt9614 / i_743_ + i_741_;
		anInt9576 = anInt9576 / i_743_ + i_742_;
	    } else {
		anInt9613 = i_740_;
		anInt9614 = i_741_;
		anInt9576 = i_742_;
	    }
	} else if (i == 1) {
	    for (int i_745_ = 0; i_745_ < anInt9549; i_745_++) {
		anIntArray9550[i_745_] += i_740_;
		anIntArray9551[i_745_] += i_741_;
		anIntArray9541[i_745_] += i_742_;
	    }
	} else if (i == 2) {
	    for (int i_746_ = 0; i_746_ < anInt9549; i_746_++) {
		anIntArray9550[i_746_] -= anInt9613;
		anIntArray9551[i_746_] -= anInt9614;
		anIntArray9541[i_746_] -= anInt9576;
		if (i_742_ != 0) {
		    int i_747_ = Class436.anIntArray4831[i_742_];
		    int i_748_ = Class436.anIntArray4838[i_742_];
		    int i_749_ = ((anIntArray9551[i_746_] * i_747_
				   + anIntArray9550[i_746_] * i_748_ + 16383)
				  >> 14);
		    anIntArray9551[i_746_]
			= (anIntArray9551[i_746_] * i_748_
			   - anIntArray9550[i_746_] * i_747_ + 16383) >> 14;
		    anIntArray9550[i_746_] = i_749_;
		}
		if (i_740_ != 0) {
		    int i_750_ = Class436.anIntArray4831[i_740_];
		    int i_751_ = Class436.anIntArray4838[i_740_];
		    int i_752_ = ((anIntArray9551[i_746_] * i_751_
				   - anIntArray9541[i_746_] * i_750_ + 16383)
				  >> 14);
		    anIntArray9541[i_746_]
			= (anIntArray9551[i_746_] * i_750_
			   + anIntArray9541[i_746_] * i_751_ + 16383) >> 14;
		    anIntArray9551[i_746_] = i_752_;
		}
		if (i_741_ != 0) {
		    int i_753_ = Class436.anIntArray4831[i_741_];
		    int i_754_ = Class436.anIntArray4838[i_741_];
		    int i_755_ = ((anIntArray9541[i_746_] * i_753_
				   + anIntArray9550[i_746_] * i_754_ + 16383)
				  >> 14);
		    anIntArray9541[i_746_]
			= (anIntArray9541[i_746_] * i_754_
			   - anIntArray9550[i_746_] * i_753_ + 16383) >> 14;
		    anIntArray9550[i_746_] = i_755_;
		}
		anIntArray9550[i_746_] += anInt9613;
		anIntArray9551[i_746_] += anInt9614;
		anIntArray9541[i_746_] += anInt9576;
	    }
	} else if (i == 3) {
	    for (int i_756_ = 0; i_756_ < anInt9549; i_756_++) {
		anIntArray9550[i_756_] -= anInt9613;
		anIntArray9551[i_756_] -= anInt9614;
		anIntArray9541[i_756_] -= anInt9576;
		anIntArray9550[i_756_] = anIntArray9550[i_756_] * i_740_ / 128;
		anIntArray9551[i_756_] = anIntArray9551[i_756_] * i_741_ / 128;
		anIntArray9541[i_756_] = anIntArray9541[i_756_] * i_742_ / 128;
		anIntArray9550[i_756_] += anInt9613;
		anIntArray9551[i_756_] += anInt9614;
		anIntArray9541[i_756_] += anInt9576;
	    }
	} else if (i == 5) {
	    for (int i_757_ = 0; i_757_ < anInt9595; i_757_++) {
		int i_758_ = (aByteArray9568[i_757_] & 0xff) + i_740_ * 8;
		if (i_758_ < 0)
		    i_758_ = 0;
		else if (i_758_ > 255)
		    i_758_ = 255;
		aByteArray9568[i_757_] = (byte) i_758_;
	    }
	    if (aClass359Array9604 != null) {
		for (int i_759_ = 0; i_759_ < anInt9603; i_759_++) {
		    Class359 class359 = aClass359Array9604[i_759_];
		    Class349 class349 = aClass349Array9574[i_759_];
		    class349.anInt3739
			= (class349.anInt3739 & 0xffffff
			   | (255 - (aByteArray9568[class359.anInt3805] & 0xff)
			      << 24));
		}
	    }
	    method15290();
	} else if (i == 7) {
	    for (int i_760_ = 0; i_760_ < anInt9595; i_760_++) {
		int i_761_ = aShortArray9552[i_760_] & 0xffff;
		int i_762_ = i_761_ >> 10 & 0x3f;
		int i_763_ = i_761_ >> 7 & 0x7;
		int i_764_ = i_761_ & 0x7f;
		i_762_ = i_762_ + i_740_ & 0x3f;
		i_763_ += i_741_ / 4;
		if (i_763_ < 0)
		    i_763_ = 0;
		else if (i_763_ > 7)
		    i_763_ = 7;
		i_764_ += i_742_;
		if (i_764_ < 0)
		    i_764_ = 0;
		else if (i_764_ > 127)
		    i_764_ = 127;
		aShortArray9552[i_760_]
		    = (short) (i_762_ << 10 | i_763_ << 7 | i_764_);
	    }
	    if (aClass359Array9604 != null) {
		for (int i_765_ = 0; i_765_ < anInt9603; i_765_++) {
		    Class359 class359 = aClass359Array9604[i_765_];
		    Class349 class349 = aClass349Array9574[i_765_];
		    class349.anInt3739
			= (class349.anInt3739 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9552[class359.anInt3805] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15290();
	} else if (i == 8) {
	    for (int i_766_ = 0; i_766_ < anInt9603; i_766_++) {
		Class349 class349 = aClass349Array9574[i_766_];
		class349.anInt3738 += i_740_;
		class349.anInt3735 += i_741_;
	    }
	} else if (i == 10) {
	    for (int i_767_ = 0; i_767_ < anInt9603; i_767_++) {
		Class349 class349 = aClass349Array9574[i_767_];
		class349.anInt3740 = class349.anInt3740 * i_740_ >> 7;
		class349.anInt3737 = class349.anInt3737 * i_741_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_768_ = 0; i_768_ < anInt9603; i_768_++) {
		Class349 class349 = aClass349Array9574[i_768_];
		class349.anInt3736 = class349.anInt3736 + i_740_ & 0x3fff;
	    }
	}
    }
    
    void method3015(int i, int i_769_, int i_770_, int i_771_) {
	if (i == 0) {
	    int i_772_ = 0;
	    anInt9613 = 0;
	    anInt9614 = 0;
	    anInt9576 = 0;
	    for (int i_773_ = 0; i_773_ < anInt9549; i_773_++) {
		anInt9613 += anIntArray9550[i_773_];
		anInt9614 += anIntArray9551[i_773_];
		anInt9576 += anIntArray9541[i_773_];
		i_772_++;
	    }
	    if (i_772_ > 0) {
		anInt9613 = anInt9613 / i_772_ + i_769_;
		anInt9614 = anInt9614 / i_772_ + i_770_;
		anInt9576 = anInt9576 / i_772_ + i_771_;
	    } else {
		anInt9613 = i_769_;
		anInt9614 = i_770_;
		anInt9576 = i_771_;
	    }
	} else if (i == 1) {
	    for (int i_774_ = 0; i_774_ < anInt9549; i_774_++) {
		anIntArray9550[i_774_] += i_769_;
		anIntArray9551[i_774_] += i_770_;
		anIntArray9541[i_774_] += i_771_;
	    }
	} else if (i == 2) {
	    for (int i_775_ = 0; i_775_ < anInt9549; i_775_++) {
		anIntArray9550[i_775_] -= anInt9613;
		anIntArray9551[i_775_] -= anInt9614;
		anIntArray9541[i_775_] -= anInt9576;
		if (i_771_ != 0) {
		    int i_776_ = Class436.anIntArray4831[i_771_];
		    int i_777_ = Class436.anIntArray4838[i_771_];
		    int i_778_ = ((anIntArray9551[i_775_] * i_776_
				   + anIntArray9550[i_775_] * i_777_ + 16383)
				  >> 14);
		    anIntArray9551[i_775_]
			= (anIntArray9551[i_775_] * i_777_
			   - anIntArray9550[i_775_] * i_776_ + 16383) >> 14;
		    anIntArray9550[i_775_] = i_778_;
		}
		if (i_769_ != 0) {
		    int i_779_ = Class436.anIntArray4831[i_769_];
		    int i_780_ = Class436.anIntArray4838[i_769_];
		    int i_781_ = ((anIntArray9551[i_775_] * i_780_
				   - anIntArray9541[i_775_] * i_779_ + 16383)
				  >> 14);
		    anIntArray9541[i_775_]
			= (anIntArray9551[i_775_] * i_779_
			   + anIntArray9541[i_775_] * i_780_ + 16383) >> 14;
		    anIntArray9551[i_775_] = i_781_;
		}
		if (i_770_ != 0) {
		    int i_782_ = Class436.anIntArray4831[i_770_];
		    int i_783_ = Class436.anIntArray4838[i_770_];
		    int i_784_ = ((anIntArray9541[i_775_] * i_782_
				   + anIntArray9550[i_775_] * i_783_ + 16383)
				  >> 14);
		    anIntArray9541[i_775_]
			= (anIntArray9541[i_775_] * i_783_
			   - anIntArray9550[i_775_] * i_782_ + 16383) >> 14;
		    anIntArray9550[i_775_] = i_784_;
		}
		anIntArray9550[i_775_] += anInt9613;
		anIntArray9551[i_775_] += anInt9614;
		anIntArray9541[i_775_] += anInt9576;
	    }
	} else if (i == 3) {
	    for (int i_785_ = 0; i_785_ < anInt9549; i_785_++) {
		anIntArray9550[i_785_] -= anInt9613;
		anIntArray9551[i_785_] -= anInt9614;
		anIntArray9541[i_785_] -= anInt9576;
		anIntArray9550[i_785_] = anIntArray9550[i_785_] * i_769_ / 128;
		anIntArray9551[i_785_] = anIntArray9551[i_785_] * i_770_ / 128;
		anIntArray9541[i_785_] = anIntArray9541[i_785_] * i_771_ / 128;
		anIntArray9550[i_785_] += anInt9613;
		anIntArray9551[i_785_] += anInt9614;
		anIntArray9541[i_785_] += anInt9576;
	    }
	} else if (i == 5) {
	    for (int i_786_ = 0; i_786_ < anInt9595; i_786_++) {
		int i_787_ = (aByteArray9568[i_786_] & 0xff) + i_769_ * 8;
		if (i_787_ < 0)
		    i_787_ = 0;
		else if (i_787_ > 255)
		    i_787_ = 255;
		aByteArray9568[i_786_] = (byte) i_787_;
	    }
	    if (aClass359Array9604 != null) {
		for (int i_788_ = 0; i_788_ < anInt9603; i_788_++) {
		    Class359 class359 = aClass359Array9604[i_788_];
		    Class349 class349 = aClass349Array9574[i_788_];
		    class349.anInt3739
			= (class349.anInt3739 & 0xffffff
			   | (255 - (aByteArray9568[class359.anInt3805] & 0xff)
			      << 24));
		}
	    }
	    method15290();
	} else if (i == 7) {
	    for (int i_789_ = 0; i_789_ < anInt9595; i_789_++) {
		int i_790_ = aShortArray9552[i_789_] & 0xffff;
		int i_791_ = i_790_ >> 10 & 0x3f;
		int i_792_ = i_790_ >> 7 & 0x7;
		int i_793_ = i_790_ & 0x7f;
		i_791_ = i_791_ + i_769_ & 0x3f;
		i_792_ += i_770_ / 4;
		if (i_792_ < 0)
		    i_792_ = 0;
		else if (i_792_ > 7)
		    i_792_ = 7;
		i_793_ += i_771_;
		if (i_793_ < 0)
		    i_793_ = 0;
		else if (i_793_ > 127)
		    i_793_ = 127;
		aShortArray9552[i_789_]
		    = (short) (i_791_ << 10 | i_792_ << 7 | i_793_);
	    }
	    if (aClass359Array9604 != null) {
		for (int i_794_ = 0; i_794_ < anInt9603; i_794_++) {
		    Class359 class359 = aClass359Array9604[i_794_];
		    Class349 class349 = aClass349Array9574[i_794_];
		    class349.anInt3739
			= (class349.anInt3739 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9552[class359.anInt3805] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15290();
	} else if (i == 8) {
	    for (int i_795_ = 0; i_795_ < anInt9603; i_795_++) {
		Class349 class349 = aClass349Array9574[i_795_];
		class349.anInt3738 += i_769_;
		class349.anInt3735 += i_770_;
	    }
	} else if (i == 10) {
	    for (int i_796_ = 0; i_796_ < anInt9603; i_796_++) {
		Class349 class349 = aClass349Array9574[i_796_];
		class349.anInt3740 = class349.anInt3740 * i_769_ >> 7;
		class349.anInt3737 = class349.anInt3737 * i_770_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_797_ = 0; i_797_ < anInt9603; i_797_++) {
		Class349 class349 = aClass349Array9574[i_797_];
		class349.anInt3736 = class349.anInt3736 + i_769_ & 0x3fff;
	    }
	}
    }
    
    public void method3016(Class444 class444, Class211 class211, int i) {
	if (aClass356_9547 != null)
	    aClass356_9547.method6267();
	if (class211 != null)
	    class211.aBool2265 = false;
	if (anInt9555 != 0) {
	    Class435 class435 = aClass182_Sub1_9585.aClass435_9165;
	    Class435 class435_798_ = aClass182_Sub1_9585.aClass435_9180;
	    Class435 class435_799_ = aClass182_Sub1_9585.aClass435_9181;
	    class435_798_.method7040(class444);
	    class435_799_.method6947(class435_798_);
	    class435_799_.method6950(aClass182_Sub1_9585.aClass435_9150);
	    if (!aBool9586)
		method15278();
	    float[] fs = aClass182_Sub1_9585.aFloatArray9262;
	    class435_798_.method6956(0.0F, (float) anInt9587, 0.0F, fs);
	    float f = fs[0];
	    float f_800_ = fs[1];
	    float f_801_ = fs[2];
	    class435_798_.method6956(0.0F, (float) anInt9588, 0.0F, fs);
	    float f_802_ = fs[0];
	    float f_803_ = fs[1];
	    float f_804_ = fs[2];
	    for (int i_805_ = 0; i_805_ < 6; i_805_++) {
		float[] fs_806_
		    = aClass182_Sub1_9585.aFloatArrayArray9298[i_805_];
		float f_807_
		    = (fs_806_[0] * f + fs_806_[1] * f_800_
		       + fs_806_[2] * f_801_ + fs_806_[3] + (float) anInt9602);
		float f_808_
		    = (fs_806_[0] * f_802_ + fs_806_[1] * f_803_
		       + fs_806_[2] * f_804_ + fs_806_[3] + (float) anInt9602);
		if (f_807_ < 0.0F && f_808_ < 0.0F)
		    return;
	    }
	    if (class211 != null) {
		boolean bool = false;
		boolean bool_809_ = true;
		int i_810_ = anInt9589 + anInt9590 >> 1;
		int i_811_ = anInt9591 + anInt9592 >> 1;
		int i_812_ = i_810_;
		int i_813_ = anInt9587;
		int i_814_ = i_811_;
		float f_815_
		    = (class435_799_.aFloatArray4830[0] * (float) i_812_
		       + class435_799_.aFloatArray4830[4] * (float) i_813_
		       + class435_799_.aFloatArray4830[8] * (float) i_814_
		       + class435_799_.aFloatArray4830[12]);
		float f_816_
		    = (class435_799_.aFloatArray4830[1] * (float) i_812_
		       + class435_799_.aFloatArray4830[5] * (float) i_813_
		       + class435_799_.aFloatArray4830[9] * (float) i_814_
		       + class435_799_.aFloatArray4830[13]);
		float f_817_
		    = (class435_799_.aFloatArray4830[2] * (float) i_812_
		       + class435_799_.aFloatArray4830[6] * (float) i_813_
		       + class435_799_.aFloatArray4830[10] * (float) i_814_
		       + class435_799_.aFloatArray4830[14]);
		float f_818_
		    = (class435_799_.aFloatArray4830[3] * (float) i_812_
		       + class435_799_.aFloatArray4830[7] * (float) i_813_
		       + class435_799_.aFloatArray4830[11] * (float) i_814_
		       + class435_799_.aFloatArray4830[15]);
		if (f_817_ >= -f_818_) {
		    class211.anInt2264
			= (int) (aClass182_Sub1_9585.aFloat9314
				 + (aClass182_Sub1_9585.aFloat9198 * f_815_
				    / f_818_));
		    class211.anInt2266
			= (int) (aClass182_Sub1_9585.aFloat9199
				 + (aClass182_Sub1_9585.aFloat9200 * f_816_
				    / f_818_));
		} else
		    bool = true;
		i_812_ = i_810_;
		i_813_ = anInt9588;
		i_814_ = i_811_;
		float f_819_
		    = (class435_799_.aFloatArray4830[0] * (float) i_812_
		       + class435_799_.aFloatArray4830[4] * (float) i_813_
		       + class435_799_.aFloatArray4830[8] * (float) i_814_
		       + class435_799_.aFloatArray4830[12]);
		float f_820_
		    = (class435_799_.aFloatArray4830[1] * (float) i_812_
		       + class435_799_.aFloatArray4830[5] * (float) i_813_
		       + class435_799_.aFloatArray4830[9] * (float) i_814_
		       + class435_799_.aFloatArray4830[13]);
		float f_821_
		    = (class435_799_.aFloatArray4830[2] * (float) i_812_
		       + class435_799_.aFloatArray4830[6] * (float) i_813_
		       + class435_799_.aFloatArray4830[10] * (float) i_814_
		       + class435_799_.aFloatArray4830[14]);
		float f_822_
		    = (class435_799_.aFloatArray4830[3] * (float) i_812_
		       + class435_799_.aFloatArray4830[7] * (float) i_813_
		       + class435_799_.aFloatArray4830[11] * (float) i_814_
		       + class435_799_.aFloatArray4830[15]);
		if (f_821_ >= -f_822_) {
		    class211.anInt2263
			= (int) (aClass182_Sub1_9585.aFloat9314
				 + (aClass182_Sub1_9585.aFloat9198 * f_819_
				    / f_822_));
		    class211.anInt2267
			= (int) (aClass182_Sub1_9585.aFloat9199
				 + (aClass182_Sub1_9585.aFloat9200 * f_820_
				    / f_822_));
		} else
		    bool = true;
		if (bool) {
		    if (f_817_ < -f_818_ && f_821_ < -f_822_)
			bool_809_ = false;
		    else if (f_817_ < -f_818_) {
			float f_823_
			    = (f_817_ + f_818_) / (f_821_ + f_822_) - 1.0F;
			float f_824_ = f_815_ + f_823_ * (f_819_ - f_815_);
			float f_825_ = f_816_ + f_823_ * (f_820_ - f_816_);
			float f_826_ = f_818_ + f_823_ * (f_822_ - f_818_);
			class211.anInt2264
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     + (aClass182_Sub1_9585.aFloat9198 * f_824_
					/ f_826_));
			class211.anInt2266
			    = (int) (aClass182_Sub1_9585.aFloat9199
				     + (aClass182_Sub1_9585.aFloat9200 * f_825_
					/ f_826_));
		    } else if (f_821_ < -f_822_) {
			float f_827_
			    = (f_821_ + f_822_) / (f_817_ + f_818_) - 1.0F;
			float f_828_ = f_819_ + f_827_ * (f_815_ - f_819_);
			float f_829_ = f_820_ + f_827_ * (f_816_ - f_820_);
			float f_830_ = f_822_ + f_827_ * (f_818_ - f_822_);
			class211.anInt2263
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     + (aClass182_Sub1_9585.aFloat9198 * f_828_
					/ f_830_));
			class211.anInt2267
			    = (int) (aClass182_Sub1_9585.aFloat9199
				     + (aClass182_Sub1_9585.aFloat9200 * f_829_
					/ f_830_));
		    }
		}
		if (bool_809_) {
		    if (f_817_ / f_818_ > f_821_ / f_822_) {
			float f_831_ = (f_815_
					+ (class435.aFloatArray4830[0]
					   * (float) anInt9602)
					+ class435.aFloatArray4830[12]);
			float f_832_ = (f_818_
					+ (class435.aFloatArray4830[3]
					   * (float) anInt9602)
					+ class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     - (float) class211.anInt2264
				     + (aClass182_Sub1_9585.aFloat9198 * f_831_
					/ f_832_));
		    } else {
			float f_833_ = (f_819_
					+ (class435.aFloatArray4830[0]
					   * (float) anInt9602)
					+ class435.aFloatArray4830[12]);
			float f_834_ = (f_822_
					+ (class435.aFloatArray4830[3]
					   * (float) anInt9602)
					+ class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     - (float) class211.anInt2263
				     + (aClass182_Sub1_9585.aFloat9198 * f_833_
					/ f_834_));
		    }
		    class211.aBool2265 = true;
		}
	    }
	    aClass182_Sub1_9585.method14872(i);
	    method15283(class444);
	    aClass182_Sub1_9585.method14872(0);
	    class435_798_.method7040(class444);
	    class435_798_.method6950(aClass182_Sub1_9585.aClass435_9173);
	    method15284(class435_798_);
	}
    }
    
    public void method3095(int i) {
	aShort9572 = (short) i;
	method15326();
	method15273();
    }
    
    public boolean method2920(int i, int i_835_, Class444 class444,
			      boolean bool, int i_836_) {
	return method15280(i, i_835_, 0, 0, class444, bool, i_836_);
    }
    
    public boolean method3069(int i, int i_837_, Class444 class444,
			      boolean bool, int i_838_) {
	return method15280(i, i_837_, 0, 0, class444, bool, i_838_);
    }
    
    public void method3020(Class444 class444) {
	Class435 class435 = aClass182_Sub1_9585.aClass435_9180;
	class435.method7040(class444);
	if (aClass184Array9600 != null) {
	    for (int i = 0; i < aClass184Array9600.length; i++) {
		Class184 class184 = aClass184Array9600[i];
		Class184 class184_839_ = class184;
		if (class184.aClass184_2070 != null)
		    class184_839_ = class184.aClass184_2070;
		class184_839_.anInt2077
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 908167867);
		class184_839_.anInt2063
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * -289521417);
		class184_839_.anInt2072
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 1741678221);
		class184_839_.anInt2073
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -1237556839);
		class184_839_.anInt2074
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * 995078737);
		class184_839_.anInt2075
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -285158923);
		class184_839_.anInt2071
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -970783049);
		class184_839_.anInt2067
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -779882021);
		class184_839_.anInt2078
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -1530339371);
	    }
	}
	if (aClass154Array9601 != null) {
	    for (int i = 0; i < aClass154Array9601.length; i++) {
		Class154 class154 = aClass154Array9601[i];
		Class154 class154_840_ = class154;
		if (class154.aClass154_1728 != null)
		    class154_840_ = class154.aClass154_1728;
		if (class154.aClass435_1727 != null)
		    class154.aClass435_1727.method6947(class435);
		else
		    class154.aClass435_1727 = new Class435(class435);
		class154_840_.anInt1730
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9550[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9551
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9541
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -1389867987);
		class154_840_.anInt1731
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9550[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9551
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9541
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -182905551);
		class154_840_.anInt1732
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9550[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9551
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9541
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * 1917380171);
	    }
	}
    }
    
    public int method2961() {
	if (!aBool9586)
	    method15278();
	return anInt9588;
    }
    
    public void method3047() {
	if (!aBool9593) {
	    if (!aBool9586)
		method15278();
	    anInt9594 = anInt9587;
	    aBool9593 = true;
	}
    }
    
    public void method3061(Class444 class444, Class211 class211, int i) {
	if (aClass356_9547 != null)
	    aClass356_9547.method6267();
	if (class211 != null)
	    class211.aBool2265 = false;
	if (anInt9555 != 0) {
	    Class435 class435 = aClass182_Sub1_9585.aClass435_9165;
	    Class435 class435_841_ = aClass182_Sub1_9585.aClass435_9180;
	    Class435 class435_842_ = aClass182_Sub1_9585.aClass435_9181;
	    class435_841_.method7040(class444);
	    class435_842_.method6947(class435_841_);
	    class435_842_.method6950(aClass182_Sub1_9585.aClass435_9150);
	    if (!aBool9586)
		method15278();
	    float[] fs = aClass182_Sub1_9585.aFloatArray9262;
	    class435_841_.method6956(0.0F, (float) anInt9587, 0.0F, fs);
	    float f = fs[0];
	    float f_843_ = fs[1];
	    float f_844_ = fs[2];
	    class435_841_.method6956(0.0F, (float) anInt9588, 0.0F, fs);
	    float f_845_ = fs[0];
	    float f_846_ = fs[1];
	    float f_847_ = fs[2];
	    for (int i_848_ = 0; i_848_ < 6; i_848_++) {
		float[] fs_849_
		    = aClass182_Sub1_9585.aFloatArrayArray9298[i_848_];
		float f_850_
		    = (fs_849_[0] * f + fs_849_[1] * f_843_
		       + fs_849_[2] * f_844_ + fs_849_[3] + (float) anInt9602);
		float f_851_
		    = (fs_849_[0] * f_845_ + fs_849_[1] * f_846_
		       + fs_849_[2] * f_847_ + fs_849_[3] + (float) anInt9602);
		if (f_850_ < 0.0F && f_851_ < 0.0F)
		    return;
	    }
	    if (class211 != null) {
		boolean bool = false;
		boolean bool_852_ = true;
		int i_853_ = anInt9589 + anInt9590 >> 1;
		int i_854_ = anInt9591 + anInt9592 >> 1;
		int i_855_ = i_853_;
		int i_856_ = anInt9587;
		int i_857_ = i_854_;
		float f_858_
		    = (class435_842_.aFloatArray4830[0] * (float) i_855_
		       + class435_842_.aFloatArray4830[4] * (float) i_856_
		       + class435_842_.aFloatArray4830[8] * (float) i_857_
		       + class435_842_.aFloatArray4830[12]);
		float f_859_
		    = (class435_842_.aFloatArray4830[1] * (float) i_855_
		       + class435_842_.aFloatArray4830[5] * (float) i_856_
		       + class435_842_.aFloatArray4830[9] * (float) i_857_
		       + class435_842_.aFloatArray4830[13]);
		float f_860_
		    = (class435_842_.aFloatArray4830[2] * (float) i_855_
		       + class435_842_.aFloatArray4830[6] * (float) i_856_
		       + class435_842_.aFloatArray4830[10] * (float) i_857_
		       + class435_842_.aFloatArray4830[14]);
		float f_861_
		    = (class435_842_.aFloatArray4830[3] * (float) i_855_
		       + class435_842_.aFloatArray4830[7] * (float) i_856_
		       + class435_842_.aFloatArray4830[11] * (float) i_857_
		       + class435_842_.aFloatArray4830[15]);
		if (f_860_ >= -f_861_) {
		    class211.anInt2264
			= (int) (aClass182_Sub1_9585.aFloat9314
				 + (aClass182_Sub1_9585.aFloat9198 * f_858_
				    / f_861_));
		    class211.anInt2266
			= (int) (aClass182_Sub1_9585.aFloat9199
				 + (aClass182_Sub1_9585.aFloat9200 * f_859_
				    / f_861_));
		} else
		    bool = true;
		i_855_ = i_853_;
		i_856_ = anInt9588;
		i_857_ = i_854_;
		float f_862_
		    = (class435_842_.aFloatArray4830[0] * (float) i_855_
		       + class435_842_.aFloatArray4830[4] * (float) i_856_
		       + class435_842_.aFloatArray4830[8] * (float) i_857_
		       + class435_842_.aFloatArray4830[12]);
		float f_863_
		    = (class435_842_.aFloatArray4830[1] * (float) i_855_
		       + class435_842_.aFloatArray4830[5] * (float) i_856_
		       + class435_842_.aFloatArray4830[9] * (float) i_857_
		       + class435_842_.aFloatArray4830[13]);
		float f_864_
		    = (class435_842_.aFloatArray4830[2] * (float) i_855_
		       + class435_842_.aFloatArray4830[6] * (float) i_856_
		       + class435_842_.aFloatArray4830[10] * (float) i_857_
		       + class435_842_.aFloatArray4830[14]);
		float f_865_
		    = (class435_842_.aFloatArray4830[3] * (float) i_855_
		       + class435_842_.aFloatArray4830[7] * (float) i_856_
		       + class435_842_.aFloatArray4830[11] * (float) i_857_
		       + class435_842_.aFloatArray4830[15]);
		if (f_864_ >= -f_865_) {
		    class211.anInt2263
			= (int) (aClass182_Sub1_9585.aFloat9314
				 + (aClass182_Sub1_9585.aFloat9198 * f_862_
				    / f_865_));
		    class211.anInt2267
			= (int) (aClass182_Sub1_9585.aFloat9199
				 + (aClass182_Sub1_9585.aFloat9200 * f_863_
				    / f_865_));
		} else
		    bool = true;
		if (bool) {
		    if (f_860_ < -f_861_ && f_864_ < -f_865_)
			bool_852_ = false;
		    else if (f_860_ < -f_861_) {
			float f_866_
			    = (f_860_ + f_861_) / (f_864_ + f_865_) - 1.0F;
			float f_867_ = f_858_ + f_866_ * (f_862_ - f_858_);
			float f_868_ = f_859_ + f_866_ * (f_863_ - f_859_);
			float f_869_ = f_861_ + f_866_ * (f_865_ - f_861_);
			class211.anInt2264
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     + (aClass182_Sub1_9585.aFloat9198 * f_867_
					/ f_869_));
			class211.anInt2266
			    = (int) (aClass182_Sub1_9585.aFloat9199
				     + (aClass182_Sub1_9585.aFloat9200 * f_868_
					/ f_869_));
		    } else if (f_864_ < -f_865_) {
			float f_870_
			    = (f_864_ + f_865_) / (f_860_ + f_861_) - 1.0F;
			float f_871_ = f_862_ + f_870_ * (f_858_ - f_862_);
			float f_872_ = f_863_ + f_870_ * (f_859_ - f_863_);
			float f_873_ = f_865_ + f_870_ * (f_861_ - f_865_);
			class211.anInt2263
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     + (aClass182_Sub1_9585.aFloat9198 * f_871_
					/ f_873_));
			class211.anInt2267
			    = (int) (aClass182_Sub1_9585.aFloat9199
				     + (aClass182_Sub1_9585.aFloat9200 * f_872_
					/ f_873_));
		    }
		}
		if (bool_852_) {
		    if (f_860_ / f_861_ > f_864_ / f_865_) {
			float f_874_ = (f_858_
					+ (class435.aFloatArray4830[0]
					   * (float) anInt9602)
					+ class435.aFloatArray4830[12]);
			float f_875_ = (f_861_
					+ (class435.aFloatArray4830[3]
					   * (float) anInt9602)
					+ class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     - (float) class211.anInt2264
				     + (aClass182_Sub1_9585.aFloat9198 * f_874_
					/ f_875_));
		    } else {
			float f_876_ = (f_862_
					+ (class435.aFloatArray4830[0]
					   * (float) anInt9602)
					+ class435.aFloatArray4830[12]);
			float f_877_ = (f_865_
					+ (class435.aFloatArray4830[3]
					   * (float) anInt9602)
					+ class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     - (float) class211.anInt2263
				     + (aClass182_Sub1_9585.aFloat9198 * f_876_
					/ f_877_));
		    }
		    class211.aBool2265 = true;
		}
	    }
	    aClass182_Sub1_9585.method14872(i);
	    method15283(class444);
	    aClass182_Sub1_9585.method14872(0);
	    class435_841_.method7040(class444);
	    class435_841_.method6950(aClass182_Sub1_9585.aClass435_9173);
	    method15284(class435_841_);
	}
    }
    
    void method15291(Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2) {
	if (anIntArray9608.length < anInt9555) {
	    anIntArray9608 = new int[anInt9555];
	    anIntArray9609 = new int[anInt9555];
	}
	for (int i = 0; i < anInt9549; i++) {
	    int i_878_
		= (((anIntArray9550[i]
		     - (anIntArray9551[i] * aClass182_Sub1_9585.anInt9244
			>> 8))
		    >> aClass182_Sub1_9585.anInt9243)
		   - class525_sub16_sub17_sub2.anInt12203);
	    int i_879_
		= (((anIntArray9541[i]
		     - (anIntArray9551[i] * aClass182_Sub1_9585.anInt9245
			>> 8))
		    >> aClass182_Sub1_9585.anInt9243)
		   - class525_sub16_sub17_sub2.anInt12201);
	    int i_880_ = anIntArray9598[i];
	    int i_881_ = anIntArray9598[i + 1];
	    for (int i_882_ = i_880_;
		 i_882_ < i_881_ && aShortArray9599[i_882_] != 0; i_882_++) {
		int i_883_ = (aShortArray9599[i_882_] & 0xffff) - 1;
		anIntArray9608[i_883_] = i_878_;
		anIntArray9609[i_883_] = i_879_;
	    }
	}
	for (int i = 0; i < anInt9566; i++) {
	    if (aByteArray9568 == null || aByteArray9568[i] <= 128) {
		int i_884_ = aShortArray9561[i] & 0xffff;
		int i_885_ = aShortArray9570[i] & 0xffff;
		int i_886_ = aShortArray9571[i] & 0xffff;
		int i_887_ = anIntArray9608[i_884_];
		int i_888_ = anIntArray9608[i_885_];
		int i_889_ = anIntArray9608[i_886_];
		int i_890_ = anIntArray9609[i_884_];
		int i_891_ = anIntArray9609[i_885_];
		int i_892_ = anIntArray9609[i_886_];
		if (((i_887_ - i_888_) * (i_891_ - i_892_)
		     - (i_891_ - i_890_) * (i_889_ - i_888_))
		    > 0)
		    class525_sub16_sub17_sub2.method18890(i_890_, i_891_,
							  i_892_, i_887_,
							  i_888_, i_889_);
	    }
	}
    }
    
    public int method3106() {
	if (!aBool9586)
	    method15278();
	return anInt9589;
    }
    
    short method15292(Class186 class186, int i, int i_893_, long l, int i_894_,
		      int i_895_, int i_896_, int i_897_, float f,
		      float f_898_) {
	int i_899_ = anIntArray9598[i];
	int i_900_ = anIntArray9598[i + 1];
	int i_901_ = 0;
	for (int i_902_ = i_899_; i_902_ < i_900_; i_902_++) {
	    if (aShortArray9599[i_902_] == 0) {
		i_901_ = i_902_;
		break;
	    }
	    int i_903_ = (aShortArray9599[i_902_] & 0xffff) - 1;
	    if (aLongArray9607[i_902_] == l)
		return (short) i_903_;
	}
	aShortArray9599[i_901_] = (short) (anInt9555 + 1);
	aLongArray9607[i_901_] = l;
	aShortArray9545[anInt9555] = (short) i_893_;
	aShortArray9556[anInt9555] = (short) i;
	aShortArray9617[anInt9555] = (short) i_894_;
	aShortArray9559[anInt9555] = (short) i_895_;
	aShortArray9560[anInt9555] = (short) i_896_;
	aByteArray9557[anInt9555] = (byte) i_897_;
	aFloatArray9562[anInt9555] = f;
	aFloatArray9563[anInt9555] = f_898_;
	return (short) anInt9555++;
    }
    
    void method15293() {
	int i = 32767;
	int i_904_ = 32767;
	int i_905_ = 32767;
	int i_906_ = -32768;
	int i_907_ = -32768;
	int i_908_ = -32768;
	int i_909_ = 0;
	int i_910_ = 0;
	for (int i_911_ = 0; i_911_ < anInt9549; i_911_++) {
	    int i_912_ = anIntArray9550[i_911_];
	    int i_913_ = anIntArray9551[i_911_];
	    int i_914_ = anIntArray9541[i_911_];
	    if (i_912_ < i)
		i = i_912_;
	    if (i_912_ > i_906_)
		i_906_ = i_912_;
	    if (i_913_ < i_904_)
		i_904_ = i_913_;
	    if (i_913_ > i_907_)
		i_907_ = i_913_;
	    if (i_914_ < i_905_)
		i_905_ = i_914_;
	    if (i_914_ > i_908_)
		i_908_ = i_914_;
	    int i_915_ = i_912_ * i_912_ + i_914_ * i_914_;
	    if (i_915_ > i_909_)
		i_909_ = i_915_;
	    i_915_ = i_912_ * i_912_ + i_914_ * i_914_ + i_913_ * i_913_;
	    if (i_915_ > i_910_)
		i_910_ = i_915_;
	}
	anInt9589 = i;
	anInt9590 = i_906_;
	anInt9587 = i_904_;
	anInt9588 = i_907_;
	anInt9591 = i_905_;
	anInt9592 = i_908_;
	anInt9602 = (int) (Math.sqrt((double) i_909_) + 0.99);
	anInt9584 = (int) (Math.sqrt((double) i_910_) + 0.99);
	aBool9586 = true;
    }
    
    public int method3028() {
	if (!aBool9586)
	    method15278();
	return anInt9602;
    }
    
    public int method3040() {
	if (!aBool9586)
	    method15278();
	return anInt9602;
    }
    
    public int method3030() {
	if (!aBool9586)
	    method15278();
	return anInt9584;
    }
    
    public void method2931(int i) {
	int i_916_ = Class436.anIntArray4831[i];
	int i_917_ = Class436.anIntArray4838[i];
	for (int i_918_ = 0; i_918_ < anInt9549; i_918_++) {
	    int i_919_ = ((anIntArray9541[i_918_] * i_916_
			   + anIntArray9550[i_918_] * i_917_)
			  >> 14);
	    anIntArray9541[i_918_] = (anIntArray9541[i_918_] * i_917_
				      - anIntArray9550[i_918_] * i_916_) >> 14;
	    anIntArray9550[i_918_] = i_919_;
	}
	for (int i_920_ = 0; i_920_ < anInt9555; i_920_++) {
	    int i_921_ = ((aShortArray9560[i_920_] * i_916_
			   + aShortArray9617[i_920_] * i_917_)
			  >> 14);
	    aShortArray9560[i_920_]
		= (short) ((aShortArray9560[i_920_] * i_917_
			    - aShortArray9617[i_920_] * i_916_)
			   >> 14);
	    aShortArray9617[i_920_] = (short) i_921_;
	}
	method15326();
	method15273();
	aBool9586 = false;
    }
    
    public int method3051() {
	if (!aBool9586)
	    method15278();
	return anInt9590;
    }
    
    int method15294(int i, int i_922_) {
	i_922_ = i_922_ * (i & 0x7f) >> 7;
	if (i_922_ < 2)
	    i_922_ = 2;
	else if (i_922_ > 126)
	    i_922_ = 126;
	return (i & 0xff80) + i_922_;
    }
    
    public int method3093() {
	if (!aBool9586)
	    method15278();
	return anInt9588;
    }
    
    public int method3035() {
	if (!aBool9586)
	    method15278();
	return anInt9591;
    }
    
    public int method3002() {
	if (!aBool9586)
	    method15278();
	return anInt9591;
    }
    
    boolean method15295() {
	if (aClass354_9575.aBool3787)
	    return true;
	if (aClass354_9575.anInterface44_3785 == null)
	    aClass354_9575.anInterface44_3785
		= aClass182_Sub1_9585.method14701(false);
	Interface44 interface44 = aClass354_9575.anInterface44_3785;
	interface44.method29(anInt9566 * 6);
	Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	if (unsafe != null) {
	    int i = anInt9566 * 6;
	    long l = interface44.method219(0, i);
	    if (l == 0L)
		return false;
	    for (int i_923_ = 0; i_923_ < anInt9566; i_923_++) {
		unsafe.putShort(l, aShortArray9561[i_923_]);
		l += 2L;
		unsafe.putShort(l, aShortArray9570[i_923_]);
		l += 2L;
		unsafe.putShort(l, aShortArray9571[i_923_]);
		l += 2L;
	    }
	    interface44.method220();
	    aClass354_9575.anInterface44_3786 = interface44;
	    aClass354_9575.aBool3787 = true;
	    aBool9581 = true;
	    return true;
	}
	ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
	bytebuffer.clear();
	for (int i = 0; i < anInt9566; i++) {
	    bytebuffer.putShort(aShortArray9561[i]);
	    bytebuffer.putShort(aShortArray9570[i]);
	    bytebuffer.putShort(aShortArray9571[i]);
	}
	if (interface44.method215(0, bytebuffer.position(),
				  aClass182_Sub1_9585.aLong9160)) {
	    aClass354_9575.anInterface44_3786 = interface44;
	    aClass354_9575.aBool3787 = true;
	    aBool9581 = true;
	    return true;
	}
	return false;
    }
    
    public int method3026() {
	return aShort9572;
    }
    
    public void method2994(int i) {
	int i_924_ = Class436.anIntArray4831[i];
	int i_925_ = Class436.anIntArray4838[i];
	for (int i_926_ = 0; i_926_ < anInt9549; i_926_++) {
	    int i_927_ = ((anIntArray9541[i_926_] * i_924_
			   + anIntArray9550[i_926_] * i_925_)
			  >> 14);
	    anIntArray9541[i_926_] = (anIntArray9541[i_926_] * i_925_
				      - anIntArray9550[i_926_] * i_924_) >> 14;
	    anIntArray9550[i_926_] = i_927_;
	}
	for (int i_928_ = 0; i_928_ < anInt9555; i_928_++) {
	    int i_929_ = ((aShortArray9560[i_928_] * i_924_
			   + aShortArray9617[i_928_] * i_925_)
			  >> 14);
	    aShortArray9560[i_928_]
		= (short) ((aShortArray9560[i_928_] * i_925_
			    - aShortArray9617[i_928_] * i_924_)
			   >> 14);
	    aShortArray9617[i_928_] = (short) i_929_;
	}
	method15326();
	method15273();
	aBool9586 = false;
    }
    
    public int method3091() {
	if (!aBool9586)
	    method15278();
	return anInt9592;
    }
    
    public int method3018() {
	if (!aBool9593)
	    method3003();
	return anInt9594;
    }
    
    public void method3042(int i) {
	aShort9546 = (short) i;
	method15290();
    }
    
    void method2949(int i, int[] is, int i_930_, int i_931_, int i_932_,
		    boolean bool, int i_933_, int[] is_934_) {
	int i_935_ = is.length;
	if (i == 0) {
	    i_930_ <<= 4;
	    i_931_ <<= 4;
	    i_932_ <<= 4;
	    int i_936_ = 0;
	    anInt9613 = 0;
	    anInt9614 = 0;
	    anInt9576 = 0;
	    for (int i_937_ = 0; i_937_ < i_935_; i_937_++) {
		int i_938_ = is[i_937_];
		if (i_938_ < anIntArrayArray9553.length) {
		    int[] is_939_ = anIntArrayArray9553[i_938_];
		    for (int i_940_ = 0; i_940_ < is_939_.length; i_940_++) {
			int i_941_ = is_939_[i_940_];
			if (aShortArray9548 == null
			    || (i_933_ & aShortArray9548[i_941_]) != 0) {
			    anInt9613 += anIntArray9550[i_941_];
			    anInt9614 += anIntArray9551[i_941_];
			    anInt9576 += anIntArray9541[i_941_];
			    i_936_++;
			}
		    }
		}
	    }
	    if (i_936_ > 0) {
		anInt9613 = anInt9613 / i_936_ + i_930_;
		anInt9614 = anInt9614 / i_936_ + i_931_;
		anInt9576 = anInt9576 / i_936_ + i_932_;
		aBool9554 = true;
	    } else {
		anInt9613 = i_930_;
		anInt9614 = i_931_;
		anInt9576 = i_932_;
	    }
	} else if (i == 1) {
	    if (is_934_ != null) {
		int i_942_ = ((is_934_[0] * i_930_ + is_934_[1] * i_931_
			       + is_934_[2] * i_932_ + 8192)
			      >> 14);
		int i_943_ = ((is_934_[3] * i_930_ + is_934_[4] * i_931_
			       + is_934_[5] * i_932_ + 8192)
			      >> 14);
		int i_944_ = ((is_934_[6] * i_930_ + is_934_[7] * i_931_
			       + is_934_[8] * i_932_ + 8192)
			      >> 14);
		i_930_ = i_942_;
		i_931_ = i_943_;
		i_932_ = i_944_;
	    }
	    i_930_ <<= 4;
	    i_931_ <<= 4;
	    i_932_ <<= 4;
	    for (int i_945_ = 0; i_945_ < i_935_; i_945_++) {
		int i_946_ = is[i_945_];
		if (i_946_ < anIntArrayArray9553.length) {
		    int[] is_947_ = anIntArrayArray9553[i_946_];
		    for (int i_948_ = 0; i_948_ < is_947_.length; i_948_++) {
			int i_949_ = is_947_[i_948_];
			if (aShortArray9548 == null
			    || (i_933_ & aShortArray9548[i_949_]) != 0) {
			    anIntArray9550[i_949_] += i_930_;
			    anIntArray9551[i_949_] += i_931_;
			    anIntArray9541[i_949_] += i_932_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_934_ != null) {
		int i_950_ = is_934_[9] << 4;
		int i_951_ = is_934_[10] << 4;
		int i_952_ = is_934_[11] << 4;
		int i_953_ = is_934_[12] << 4;
		int i_954_ = is_934_[13] << 4;
		int i_955_ = is_934_[14] << 4;
		if (aBool9554) {
		    int i_956_
			= ((is_934_[0] * anInt9613 + is_934_[3] * anInt9614
			    + is_934_[6] * anInt9576 + 8192)
			   >> 14);
		    int i_957_
			= ((is_934_[1] * anInt9613 + is_934_[4] * anInt9614
			    + is_934_[7] * anInt9576 + 8192)
			   >> 14);
		    int i_958_
			= ((is_934_[2] * anInt9613 + is_934_[5] * anInt9614
			    + is_934_[8] * anInt9576 + 8192)
			   >> 14);
		    i_956_ += i_953_;
		    i_957_ += i_954_;
		    i_958_ += i_955_;
		    anInt9613 = i_956_;
		    anInt9614 = i_957_;
		    anInt9576 = i_958_;
		    aBool9554 = false;
		}
		int[] is_959_ = new int[9];
		int i_960_ = Class436.anIntArray4838[i_930_];
		int i_961_ = Class436.anIntArray4831[i_930_];
		int i_962_ = Class436.anIntArray4838[i_931_];
		int i_963_ = Class436.anIntArray4831[i_931_];
		int i_964_ = Class436.anIntArray4838[i_932_];
		int i_965_ = Class436.anIntArray4831[i_932_];
		int i_966_ = i_961_ * i_964_ + 8192 >> 14;
		int i_967_ = i_961_ * i_965_ + 8192 >> 14;
		is_959_[0] = i_962_ * i_964_ + i_963_ * i_967_ + 8192 >> 14;
		is_959_[1] = -i_962_ * i_965_ + i_963_ * i_966_ + 8192 >> 14;
		is_959_[2] = i_963_ * i_960_ + 8192 >> 14;
		is_959_[3] = i_960_ * i_965_ + 8192 >> 14;
		is_959_[4] = i_960_ * i_964_ + 8192 >> 14;
		is_959_[5] = -i_961_;
		is_959_[6] = -i_963_ * i_964_ + i_962_ * i_967_ + 8192 >> 14;
		is_959_[7] = i_963_ * i_965_ + i_962_ * i_966_ + 8192 >> 14;
		is_959_[8] = i_962_ * i_960_ + 8192 >> 14;
		int i_968_ = (is_959_[0] * -anInt9613 + is_959_[1] * -anInt9614
			      + is_959_[2] * -anInt9576 + 8192) >> 14;
		int i_969_ = (is_959_[3] * -anInt9613 + is_959_[4] * -anInt9614
			      + is_959_[5] * -anInt9576 + 8192) >> 14;
		int i_970_ = (is_959_[6] * -anInt9613 + is_959_[7] * -anInt9614
			      + is_959_[8] * -anInt9576 + 8192) >> 14;
		int i_971_ = i_968_ + anInt9613;
		int i_972_ = i_969_ + anInt9614;
		int i_973_ = i_970_ + anInt9576;
		int[] is_974_ = new int[9];
		for (int i_975_ = 0; i_975_ < 3; i_975_++) {
		    for (int i_976_ = 0; i_976_ < 3; i_976_++) {
			int i_977_ = 0;
			for (int i_978_ = 0; i_978_ < 3; i_978_++)
			    i_977_ += (is_959_[i_975_ * 3 + i_978_]
				       * is_934_[i_976_ * 3 + i_978_]);
			is_974_[i_975_ * 3 + i_976_] = i_977_ + 8192 >> 14;
		    }
		}
		int i_979_ = ((is_959_[0] * i_953_ + is_959_[1] * i_954_
			       + is_959_[2] * i_955_ + 8192)
			      >> 14);
		int i_980_ = ((is_959_[3] * i_953_ + is_959_[4] * i_954_
			       + is_959_[5] * i_955_ + 8192)
			      >> 14);
		int i_981_ = ((is_959_[6] * i_953_ + is_959_[7] * i_954_
			       + is_959_[8] * i_955_ + 8192)
			      >> 14);
		i_979_ += i_971_;
		i_980_ += i_972_;
		i_981_ += i_973_;
		int[] is_982_ = new int[9];
		for (int i_983_ = 0; i_983_ < 3; i_983_++) {
		    for (int i_984_ = 0; i_984_ < 3; i_984_++) {
			int i_985_ = 0;
			for (int i_986_ = 0; i_986_ < 3; i_986_++)
			    i_985_ += (is_934_[i_983_ * 3 + i_986_]
				       * is_974_[i_984_ + i_986_ * 3]);
			is_982_[i_983_ * 3 + i_984_] = i_985_ + 8192 >> 14;
		    }
		}
		int i_987_ = ((is_934_[0] * i_979_ + is_934_[1] * i_980_
			       + is_934_[2] * i_981_ + 8192)
			      >> 14);
		int i_988_ = ((is_934_[3] * i_979_ + is_934_[4] * i_980_
			       + is_934_[5] * i_981_ + 8192)
			      >> 14);
		int i_989_ = ((is_934_[6] * i_979_ + is_934_[7] * i_980_
			       + is_934_[8] * i_981_ + 8192)
			      >> 14);
		i_987_ += i_950_;
		i_988_ += i_951_;
		i_989_ += i_952_;
		for (int i_990_ = 0; i_990_ < i_935_; i_990_++) {
		    int i_991_ = is[i_990_];
		    if (i_991_ < anIntArrayArray9553.length) {
			int[] is_992_ = anIntArrayArray9553[i_991_];
			for (int i_993_ = 0; i_993_ < is_992_.length;
			     i_993_++) {
			    int i_994_ = is_992_[i_993_];
			    if (aShortArray9548 == null
				|| (i_933_ & aShortArray9548[i_994_]) != 0) {
				int i_995_
				    = ((is_982_[0] * anIntArray9550[i_994_]
					+ is_982_[1] * anIntArray9551[i_994_]
					+ is_982_[2] * anIntArray9541[i_994_]
					+ 8192)
				       >> 14);
				int i_996_
				    = ((is_982_[3] * anIntArray9550[i_994_]
					+ is_982_[4] * anIntArray9551[i_994_]
					+ is_982_[5] * anIntArray9541[i_994_]
					+ 8192)
				       >> 14);
				int i_997_
				    = ((is_982_[6] * anIntArray9550[i_994_]
					+ is_982_[7] * anIntArray9551[i_994_]
					+ is_982_[8] * anIntArray9541[i_994_]
					+ 8192)
				       >> 14);
				i_995_ += i_987_;
				i_996_ += i_988_;
				i_997_ += i_989_;
				anIntArray9550[i_994_] = i_995_;
				anIntArray9551[i_994_] = i_996_;
				anIntArray9541[i_994_] = i_997_;
			    }
			}
		    }
		}
	    } else {
		for (int i_998_ = 0; i_998_ < i_935_; i_998_++) {
		    int i_999_ = is[i_998_];
		    if (i_999_ < anIntArrayArray9553.length) {
			int[] is_1000_ = anIntArrayArray9553[i_999_];
			for (int i_1001_ = 0; i_1001_ < is_1000_.length;
			     i_1001_++) {
			    int i_1002_ = is_1000_[i_1001_];
			    if (aShortArray9548 == null
				|| (i_933_ & aShortArray9548[i_1002_]) != 0) {
				anIntArray9550[i_1002_] -= anInt9613;
				anIntArray9551[i_1002_] -= anInt9614;
				anIntArray9541[i_1002_] -= anInt9576;
				if (i_932_ != 0) {
				    int i_1003_
					= Class436.anIntArray4831[i_932_];
				    int i_1004_
					= Class436.anIntArray4838[i_932_];
				    int i_1005_
					= ((anIntArray9551[i_1002_] * i_1003_
					    + anIntArray9550[i_1002_] * i_1004_
					    + 16383)
					   >> 14);
				    anIntArray9551[i_1002_]
					= (anIntArray9551[i_1002_] * i_1004_
					   - anIntArray9550[i_1002_] * i_1003_
					   + 16383) >> 14;
				    anIntArray9550[i_1002_] = i_1005_;
				}
				if (i_930_ != 0) {
				    int i_1006_
					= Class436.anIntArray4831[i_930_];
				    int i_1007_
					= Class436.anIntArray4838[i_930_];
				    int i_1008_
					= ((anIntArray9551[i_1002_] * i_1007_
					    - anIntArray9541[i_1002_] * i_1006_
					    + 16383)
					   >> 14);
				    anIntArray9541[i_1002_]
					= (anIntArray9551[i_1002_] * i_1006_
					   + anIntArray9541[i_1002_] * i_1007_
					   + 16383) >> 14;
				    anIntArray9551[i_1002_] = i_1008_;
				}
				if (i_931_ != 0) {
				    int i_1009_
					= Class436.anIntArray4831[i_931_];
				    int i_1010_
					= Class436.anIntArray4838[i_931_];
				    int i_1011_
					= ((anIntArray9541[i_1002_] * i_1009_
					    + anIntArray9550[i_1002_] * i_1010_
					    + 16383)
					   >> 14);
				    anIntArray9541[i_1002_]
					= (anIntArray9541[i_1002_] * i_1010_
					   - anIntArray9550[i_1002_] * i_1009_
					   + 16383) >> 14;
				    anIntArray9550[i_1002_] = i_1011_;
				}
				anIntArray9550[i_1002_] += anInt9613;
				anIntArray9551[i_1002_] += anInt9614;
				anIntArray9541[i_1002_] += anInt9576;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1012_ = 0; i_1012_ < i_935_; i_1012_++) {
			int i_1013_ = is[i_1012_];
			if (i_1013_ < anIntArrayArray9553.length) {
			    int[] is_1014_ = anIntArrayArray9553[i_1013_];
			    for (int i_1015_ = 0; i_1015_ < is_1014_.length;
				 i_1015_++) {
				int i_1016_ = is_1014_[i_1015_];
				if (aShortArray9548 == null
				    || ((i_933_ & aShortArray9548[i_1016_])
					!= 0)) {
				    int i_1017_ = anIntArray9598[i_1016_];
				    int i_1018_ = anIntArray9598[i_1016_ + 1];
				    for (int i_1019_ = i_1017_;
					 (i_1019_ < i_1018_
					  && aShortArray9599[i_1019_] != 0);
					 i_1019_++) {
					int i_1020_ = (aShortArray9599[i_1019_]
						       & 0xffff) - 1;
					if (i_932_ != 0) {
					    int i_1021_
						= (Class436.anIntArray4831
						   [i_932_]);
					    int i_1022_
						= (Class436.anIntArray4838
						   [i_932_]);
					    int i_1023_
						= (((aShortArray9559[i_1020_]
						     * i_1021_)
						    + (aShortArray9617[i_1020_]
						       * i_1022_)
						    + 16383)
						   >> 14);
					    aShortArray9559[i_1020_]
						= (short) ((((aShortArray9559
							      [i_1020_])
							     * i_1022_)
							    - ((aShortArray9617
								[i_1020_])
							       * i_1021_)
							    + 16383)
							   >> 14);
					    aShortArray9617[i_1020_]
						= (short) i_1023_;
					}
					if (i_930_ != 0) {
					    int i_1024_
						= (Class436.anIntArray4831
						   [i_930_]);
					    int i_1025_
						= (Class436.anIntArray4838
						   [i_930_]);
					    int i_1026_
						= (((aShortArray9559[i_1020_]
						     * i_1025_)
						    - (aShortArray9560[i_1020_]
						       * i_1024_)
						    + 16383)
						   >> 14);
					    aShortArray9560[i_1020_]
						= (short) ((((aShortArray9559
							      [i_1020_])
							     * i_1024_)
							    + ((aShortArray9560
								[i_1020_])
							       * i_1025_)
							    + 16383)
							   >> 14);
					    aShortArray9559[i_1020_]
						= (short) i_1026_;
					}
					if (i_931_ != 0) {
					    int i_1027_
						= (Class436.anIntArray4831
						   [i_931_]);
					    int i_1028_
						= (Class436.anIntArray4838
						   [i_931_]);
					    int i_1029_
						= (((aShortArray9560[i_1020_]
						     * i_1027_)
						    + (aShortArray9617[i_1020_]
						       * i_1028_)
						    + 16383)
						   >> 14);
					    aShortArray9560[i_1020_]
						= (short) ((((aShortArray9560
							      [i_1020_])
							     * i_1028_)
							    - ((aShortArray9617
								[i_1020_])
							       * i_1027_)
							    + 16383)
							   >> 14);
					    aShortArray9617[i_1020_]
						= (short) i_1029_;
					}
				    }
				}
			    }
			}
		    }
		    method15273();
		}
	    }
	} else if (i == 3) {
	    if (is_934_ != null) {
		int i_1030_ = is_934_[9] << 4;
		int i_1031_ = is_934_[10] << 4;
		int i_1032_ = is_934_[11] << 4;
		int i_1033_ = is_934_[12] << 4;
		int i_1034_ = is_934_[13] << 4;
		int i_1035_ = is_934_[14] << 4;
		if (aBool9554) {
		    int i_1036_
			= ((is_934_[0] * anInt9613 + is_934_[3] * anInt9614
			    + is_934_[6] * anInt9576 + 8192)
			   >> 14);
		    int i_1037_
			= ((is_934_[1] * anInt9613 + is_934_[4] * anInt9614
			    + is_934_[7] * anInt9576 + 8192)
			   >> 14);
		    int i_1038_
			= ((is_934_[2] * anInt9613 + is_934_[5] * anInt9614
			    + is_934_[8] * anInt9576 + 8192)
			   >> 14);
		    i_1036_ += i_1033_;
		    i_1037_ += i_1034_;
		    i_1038_ += i_1035_;
		    anInt9613 = i_1036_;
		    anInt9614 = i_1037_;
		    anInt9576 = i_1038_;
		    aBool9554 = false;
		}
		int i_1039_ = i_930_ << 15 >> 7;
		int i_1040_ = i_931_ << 15 >> 7;
		int i_1041_ = i_932_ << 15 >> 7;
		int i_1042_ = i_1039_ * -anInt9613 + 8192 >> 14;
		int i_1043_ = i_1040_ * -anInt9614 + 8192 >> 14;
		int i_1044_ = i_1041_ * -anInt9576 + 8192 >> 14;
		int i_1045_ = i_1042_ + anInt9613;
		int i_1046_ = i_1043_ + anInt9614;
		int i_1047_ = i_1044_ + anInt9576;
		int[] is_1048_ = new int[9];
		is_1048_[0] = i_1039_ * is_934_[0] + 8192 >> 14;
		is_1048_[1] = i_1039_ * is_934_[3] + 8192 >> 14;
		is_1048_[2] = i_1039_ * is_934_[6] + 8192 >> 14;
		is_1048_[3] = i_1040_ * is_934_[1] + 8192 >> 14;
		is_1048_[4] = i_1040_ * is_934_[4] + 8192 >> 14;
		is_1048_[5] = i_1040_ * is_934_[7] + 8192 >> 14;
		is_1048_[6] = i_1041_ * is_934_[2] + 8192 >> 14;
		is_1048_[7] = i_1041_ * is_934_[5] + 8192 >> 14;
		is_1048_[8] = i_1041_ * is_934_[8] + 8192 >> 14;
		int i_1049_ = i_1039_ * i_1033_ + 8192 >> 14;
		int i_1050_ = i_1040_ * i_1034_ + 8192 >> 14;
		int i_1051_ = i_1041_ * i_1035_ + 8192 >> 14;
		i_1049_ += i_1045_;
		i_1050_ += i_1046_;
		i_1051_ += i_1047_;
		int[] is_1052_ = new int[9];
		for (int i_1053_ = 0; i_1053_ < 3; i_1053_++) {
		    for (int i_1054_ = 0; i_1054_ < 3; i_1054_++) {
			int i_1055_ = 0;
			for (int i_1056_ = 0; i_1056_ < 3; i_1056_++)
			    i_1055_ += (is_934_[i_1053_ * 3 + i_1056_]
					* is_1048_[i_1054_ + i_1056_ * 3]);
			is_1052_[i_1053_ * 3 + i_1054_] = i_1055_ + 8192 >> 14;
		    }
		}
		int i_1057_ = ((is_934_[0] * i_1049_ + is_934_[1] * i_1050_
				+ is_934_[2] * i_1051_ + 8192)
			       >> 14);
		int i_1058_ = ((is_934_[3] * i_1049_ + is_934_[4] * i_1050_
				+ is_934_[5] * i_1051_ + 8192)
			       >> 14);
		int i_1059_ = ((is_934_[6] * i_1049_ + is_934_[7] * i_1050_
				+ is_934_[8] * i_1051_ + 8192)
			       >> 14);
		i_1057_ += i_1030_;
		i_1058_ += i_1031_;
		i_1059_ += i_1032_;
		for (int i_1060_ = 0; i_1060_ < i_935_; i_1060_++) {
		    int i_1061_ = is[i_1060_];
		    if (i_1061_ < anIntArrayArray9553.length) {
			int[] is_1062_ = anIntArrayArray9553[i_1061_];
			for (int i_1063_ = 0; i_1063_ < is_1062_.length;
			     i_1063_++) {
			    int i_1064_ = is_1062_[i_1063_];
			    if (aShortArray9548 == null
				|| (i_933_ & aShortArray9548[i_1064_]) != 0) {
				int i_1065_
				    = ((is_1052_[0] * anIntArray9550[i_1064_]
					+ is_1052_[1] * anIntArray9551[i_1064_]
					+ is_1052_[2] * anIntArray9541[i_1064_]
					+ 8192)
				       >> 14);
				int i_1066_
				    = ((is_1052_[3] * anIntArray9550[i_1064_]
					+ is_1052_[4] * anIntArray9551[i_1064_]
					+ is_1052_[5] * anIntArray9541[i_1064_]
					+ 8192)
				       >> 14);
				int i_1067_
				    = ((is_1052_[6] * anIntArray9550[i_1064_]
					+ is_1052_[7] * anIntArray9551[i_1064_]
					+ is_1052_[8] * anIntArray9541[i_1064_]
					+ 8192)
				       >> 14);
				i_1065_ += i_1057_;
				i_1066_ += i_1058_;
				i_1067_ += i_1059_;
				anIntArray9550[i_1064_] = i_1065_;
				anIntArray9551[i_1064_] = i_1066_;
				anIntArray9541[i_1064_] = i_1067_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1068_ = 0; i_1068_ < i_935_; i_1068_++) {
		    int i_1069_ = is[i_1068_];
		    if (i_1069_ < anIntArrayArray9553.length) {
			int[] is_1070_ = anIntArrayArray9553[i_1069_];
			for (int i_1071_ = 0; i_1071_ < is_1070_.length;
			     i_1071_++) {
			    int i_1072_ = is_1070_[i_1071_];
			    if (aShortArray9548 == null
				|| (i_933_ & aShortArray9548[i_1072_]) != 0) {
				anIntArray9550[i_1072_] -= anInt9613;
				anIntArray9551[i_1072_] -= anInt9614;
				anIntArray9541[i_1072_] -= anInt9576;
				anIntArray9550[i_1072_]
				    = anIntArray9550[i_1072_] * i_930_ >> 7;
				anIntArray9551[i_1072_]
				    = anIntArray9551[i_1072_] * i_931_ >> 7;
				anIntArray9541[i_1072_]
				    = anIntArray9541[i_1072_] * i_932_ >> 7;
				anIntArray9550[i_1072_] += anInt9613;
				anIntArray9551[i_1072_] += anInt9614;
				anIntArray9541[i_1072_] += anInt9576;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9573 != null) {
		boolean bool_1073_ = false;
		for (int i_1074_ = 0; i_1074_ < i_935_; i_1074_++) {
		    int i_1075_ = is[i_1074_];
		    if (i_1075_ < anIntArrayArray9573.length) {
			int[] is_1076_ = anIntArrayArray9573[i_1075_];
			for (int i_1077_ = 0; i_1077_ < is_1076_.length;
			     i_1077_++) {
			    int i_1078_ = is_1076_[i_1077_];
			    if (aShortArray9615 == null
				|| (i_933_ & aShortArray9615[i_1078_]) != 0) {
				int i_1079_ = ((aByteArray9568[i_1078_] & 0xff)
					       + i_930_ * 8);
				if (i_1079_ < 0)
				    i_1079_ = 0;
				else if (i_1079_ > 255)
				    i_1079_ = 255;
				aByteArray9568[i_1078_] = (byte) i_1079_;
			    }
			}
			bool_1073_ = bool_1073_ | is_1076_.length > 0;
		    }
		}
		if (bool_1073_) {
		    if (aClass359Array9604 != null) {
			for (int i_1080_ = 0; i_1080_ < anInt9603; i_1080_++) {
			    Class359 class359 = aClass359Array9604[i_1080_];
			    Class349 class349 = aClass349Array9574[i_1080_];
			    class349.anInt3739
				= (class349.anInt3739 & 0xffffff
				   | 255 - (aByteArray9568[class359.anInt3805]
					    & 0xff) << 24);
			}
		    }
		    method15290();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9573 != null) {
		boolean bool_1081_ = false;
		for (int i_1082_ = 0; i_1082_ < i_935_; i_1082_++) {
		    int i_1083_ = is[i_1082_];
		    if (i_1083_ < anIntArrayArray9573.length) {
			int[] is_1084_ = anIntArrayArray9573[i_1083_];
			for (int i_1085_ = 0; i_1085_ < is_1084_.length;
			     i_1085_++) {
			    int i_1086_ = is_1084_[i_1085_];
			    if (aShortArray9615 == null
				|| (i_933_ & aShortArray9615[i_1086_]) != 0) {
				int i_1087_
				    = aShortArray9552[i_1086_] & 0xffff;
				int i_1088_ = i_1087_ >> 10 & 0x3f;
				int i_1089_ = i_1087_ >> 7 & 0x7;
				int i_1090_ = i_1087_ & 0x7f;
				i_1088_ = i_1088_ + i_930_ & 0x3f;
				i_1089_ += i_931_ / 4;
				if (i_1089_ < 0)
				    i_1089_ = 0;
				else if (i_1089_ > 7)
				    i_1089_ = 7;
				i_1090_ += i_932_;
				if (i_1090_ < 0)
				    i_1090_ = 0;
				else if (i_1090_ > 127)
				    i_1090_ = 127;
				aShortArray9552[i_1086_]
				    = (short) (i_1088_ << 10 | i_1089_ << 7
					       | i_1090_);
			    }
			}
			bool_1081_ = bool_1081_ | is_1084_.length > 0;
		    }
		}
		if (bool_1081_) {
		    if (aClass359Array9604 != null) {
			for (int i_1091_ = 0; i_1091_ < anInt9603; i_1091_++) {
			    Class359 class359 = aClass359Array9604[i_1091_];
			    Class349 class349 = aClass349Array9574[i_1091_];
			    class349.anInt3739
				= (class349.anInt3739 & ~0xffffff
				   | (Class642.anIntArray8324
				      [(aShortArray9552[class359.anInt3805]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15290();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9543 != null) {
		for (int i_1092_ = 0; i_1092_ < i_935_; i_1092_++) {
		    int i_1093_ = is[i_1092_];
		    if (i_1093_ < anIntArrayArray9543.length) {
			int[] is_1094_ = anIntArrayArray9543[i_1093_];
			for (int i_1095_ = 0; i_1095_ < is_1094_.length;
			     i_1095_++) {
			    Class349 class349
				= aClass349Array9574[is_1094_[i_1095_]];
			    class349.anInt3738 += i_930_;
			    class349.anInt3735 += i_931_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9543 != null) {
		for (int i_1096_ = 0; i_1096_ < i_935_; i_1096_++) {
		    int i_1097_ = is[i_1096_];
		    if (i_1097_ < anIntArrayArray9543.length) {
			int[] is_1098_ = anIntArrayArray9543[i_1097_];
			for (int i_1099_ = 0; i_1099_ < is_1098_.length;
			     i_1099_++) {
			    Class349 class349
				= aClass349Array9574[is_1098_[i_1099_]];
			    class349.anInt3740
				= class349.anInt3740 * i_930_ >> 7;
			    class349.anInt3737
				= class349.anInt3737 * i_931_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9543 != null) {
		for (int i_1100_ = 0; i_1100_ < i_935_; i_1100_++) {
		    int i_1101_ = is[i_1100_];
		    if (i_1101_ < anIntArrayArray9543.length) {
			int[] is_1102_ = anIntArrayArray9543[i_1101_];
			for (int i_1103_ = 0; i_1103_ < is_1102_.length;
			     i_1103_++) {
			    Class349 class349
				= aClass349Array9574[is_1102_[i_1103_]];
			    class349.anInt3736
				= class349.anInt3736 + i_930_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    public int method3037() {
	if (!aBool9586)
	    method15278();
	return anInt9591;
    }
    
    public int method3045() {
	return aShort9546;
    }
    
    public int method3046() {
	return aShort9546;
    }
    
    public int method3034() {
	return aShort9546;
    }
    
    public int method2989() {
	return aShort9546;
    }
    
    public void method2969(short i, short i_1104_) {
	for (int i_1105_ = 0; i_1105_ < anInt9595; i_1105_++) {
	    if (aShortArray9552[i_1105_] == i)
		aShortArray9552[i_1105_] = i_1104_;
	}
	if (aClass359Array9604 != null) {
	    for (int i_1106_ = 0; i_1106_ < anInt9603; i_1106_++) {
		Class359 class359 = aClass359Array9604[i_1106_];
		Class349 class349 = aClass349Array9574[i_1106_];
		class349.anInt3739
		    = (class349.anInt3739 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9552[class359.anInt3805] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15290();
    }
    
    public byte[] method3050() {
	return aByteArray9568;
    }
    
    public byte[] method2958() {
	return aByteArray9568;
    }
    
    public void method3052(short i, short i_1107_) {
	for (int i_1108_ = 0; i_1108_ < anInt9595; i_1108_++) {
	    if (aShortArray9552[i_1108_] == i)
		aShortArray9552[i_1108_] = i_1107_;
	}
	if (aClass359Array9604 != null) {
	    for (int i_1109_ = 0; i_1109_ < anInt9603; i_1109_++) {
		Class359 class359 = aClass359Array9604[i_1109_];
		Class349 class349 = aClass349Array9574[i_1109_];
		class349.anInt3739
		    = (class349.anInt3739 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9552[class359.anInt3805] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15290();
    }
    
    public boolean method3067() {
	return aBool9582;
    }
    
    public void method3054(short i, short i_1110_) {
	for (int i_1111_ = 0; i_1111_ < anInt9595; i_1111_++) {
	    if (aShortArray9552[i_1111_] == i)
		aShortArray9552[i_1111_] = i_1110_;
	}
	if (aClass359Array9604 != null) {
	    for (int i_1112_ = 0; i_1112_ < anInt9603; i_1112_++) {
		Class359 class359 = aClass359Array9604[i_1112_];
		Class349 class349 = aClass349Array9574[i_1112_];
		class349.anInt3739
		    = (class349.anInt3739 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9552[class359.anInt3805] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15290();
    }
    
    public void method3055(byte i, byte[] is) {
	if (is == null) {
	    for (int i_1113_ = 0; i_1113_ < anInt9595; i_1113_++)
		aByteArray9568[i_1113_] = i;
	} else {
	    for (int i_1114_ = 0; i_1114_ < anInt9595; i_1114_++) {
		int i_1115_ = 255 - ((255 - (is[i_1114_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9568[i_1114_] = (byte) i_1115_;
	    }
	}
	method15290();
    }
    
    public void method3056(byte i, byte[] is) {
	if (is == null) {
	    for (int i_1116_ = 0; i_1116_ < anInt9595; i_1116_++)
		aByteArray9568[i_1116_] = i;
	} else {
	    for (int i_1117_ = 0; i_1117_ < anInt9595; i_1117_++) {
		int i_1118_ = 255 - ((255 - (is[i_1117_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9568[i_1117_] = (byte) i_1118_;
	    }
	}
	method15290();
    }
    
    public void method2953(Class444 class444, Class211 class211, int i) {
	if (aClass356_9547 != null)
	    aClass356_9547.method6267();
	if (class211 != null)
	    class211.aBool2265 = false;
	if (anInt9555 != 0) {
	    Class435 class435 = aClass182_Sub1_9585.aClass435_9165;
	    Class435 class435_1119_ = aClass182_Sub1_9585.aClass435_9180;
	    Class435 class435_1120_ = aClass182_Sub1_9585.aClass435_9181;
	    class435_1119_.method7040(class444);
	    class435_1120_.method6947(class435_1119_);
	    class435_1120_.method6950(aClass182_Sub1_9585.aClass435_9150);
	    if (!aBool9586)
		method15278();
	    float[] fs = aClass182_Sub1_9585.aFloatArray9262;
	    class435_1119_.method6956(0.0F, (float) anInt9587, 0.0F, fs);
	    float f = fs[0];
	    float f_1121_ = fs[1];
	    float f_1122_ = fs[2];
	    class435_1119_.method6956(0.0F, (float) anInt9588, 0.0F, fs);
	    float f_1123_ = fs[0];
	    float f_1124_ = fs[1];
	    float f_1125_ = fs[2];
	    for (int i_1126_ = 0; i_1126_ < 6; i_1126_++) {
		float[] fs_1127_
		    = aClass182_Sub1_9585.aFloatArrayArray9298[i_1126_];
		float f_1128_ = (fs_1127_[0] * f + fs_1127_[1] * f_1121_
				 + fs_1127_[2] * f_1122_ + fs_1127_[3]
				 + (float) anInt9602);
		float f_1129_ = (fs_1127_[0] * f_1123_ + fs_1127_[1] * f_1124_
				 + fs_1127_[2] * f_1125_ + fs_1127_[3]
				 + (float) anInt9602);
		if (f_1128_ < 0.0F && f_1129_ < 0.0F)
		    return;
	    }
	    if (class211 != null) {
		boolean bool = false;
		boolean bool_1130_ = true;
		int i_1131_ = anInt9589 + anInt9590 >> 1;
		int i_1132_ = anInt9591 + anInt9592 >> 1;
		int i_1133_ = i_1131_;
		int i_1134_ = anInt9587;
		int i_1135_ = i_1132_;
		float f_1136_
		    = (class435_1120_.aFloatArray4830[0] * (float) i_1133_
		       + class435_1120_.aFloatArray4830[4] * (float) i_1134_
		       + class435_1120_.aFloatArray4830[8] * (float) i_1135_
		       + class435_1120_.aFloatArray4830[12]);
		float f_1137_
		    = (class435_1120_.aFloatArray4830[1] * (float) i_1133_
		       + class435_1120_.aFloatArray4830[5] * (float) i_1134_
		       + class435_1120_.aFloatArray4830[9] * (float) i_1135_
		       + class435_1120_.aFloatArray4830[13]);
		float f_1138_
		    = (class435_1120_.aFloatArray4830[2] * (float) i_1133_
		       + class435_1120_.aFloatArray4830[6] * (float) i_1134_
		       + class435_1120_.aFloatArray4830[10] * (float) i_1135_
		       + class435_1120_.aFloatArray4830[14]);
		float f_1139_
		    = (class435_1120_.aFloatArray4830[3] * (float) i_1133_
		       + class435_1120_.aFloatArray4830[7] * (float) i_1134_
		       + class435_1120_.aFloatArray4830[11] * (float) i_1135_
		       + class435_1120_.aFloatArray4830[15]);
		if (f_1138_ >= -f_1139_) {
		    class211.anInt2264
			= (int) (aClass182_Sub1_9585.aFloat9314
				 + (aClass182_Sub1_9585.aFloat9198 * f_1136_
				    / f_1139_));
		    class211.anInt2266
			= (int) (aClass182_Sub1_9585.aFloat9199
				 + (aClass182_Sub1_9585.aFloat9200 * f_1137_
				    / f_1139_));
		} else
		    bool = true;
		i_1133_ = i_1131_;
		i_1134_ = anInt9588;
		i_1135_ = i_1132_;
		float f_1140_
		    = (class435_1120_.aFloatArray4830[0] * (float) i_1133_
		       + class435_1120_.aFloatArray4830[4] * (float) i_1134_
		       + class435_1120_.aFloatArray4830[8] * (float) i_1135_
		       + class435_1120_.aFloatArray4830[12]);
		float f_1141_
		    = (class435_1120_.aFloatArray4830[1] * (float) i_1133_
		       + class435_1120_.aFloatArray4830[5] * (float) i_1134_
		       + class435_1120_.aFloatArray4830[9] * (float) i_1135_
		       + class435_1120_.aFloatArray4830[13]);
		float f_1142_
		    = (class435_1120_.aFloatArray4830[2] * (float) i_1133_
		       + class435_1120_.aFloatArray4830[6] * (float) i_1134_
		       + class435_1120_.aFloatArray4830[10] * (float) i_1135_
		       + class435_1120_.aFloatArray4830[14]);
		float f_1143_
		    = (class435_1120_.aFloatArray4830[3] * (float) i_1133_
		       + class435_1120_.aFloatArray4830[7] * (float) i_1134_
		       + class435_1120_.aFloatArray4830[11] * (float) i_1135_
		       + class435_1120_.aFloatArray4830[15]);
		if (f_1142_ >= -f_1143_) {
		    class211.anInt2263
			= (int) (aClass182_Sub1_9585.aFloat9314
				 + (aClass182_Sub1_9585.aFloat9198 * f_1140_
				    / f_1143_));
		    class211.anInt2267
			= (int) (aClass182_Sub1_9585.aFloat9199
				 + (aClass182_Sub1_9585.aFloat9200 * f_1141_
				    / f_1143_));
		} else
		    bool = true;
		if (bool) {
		    if (f_1138_ < -f_1139_ && f_1142_ < -f_1143_)
			bool_1130_ = false;
		    else if (f_1138_ < -f_1139_) {
			float f_1144_
			    = (f_1138_ + f_1139_) / (f_1142_ + f_1143_) - 1.0F;
			float f_1145_
			    = f_1136_ + f_1144_ * (f_1140_ - f_1136_);
			float f_1146_
			    = f_1137_ + f_1144_ * (f_1141_ - f_1137_);
			float f_1147_
			    = f_1139_ + f_1144_ * (f_1143_ - f_1139_);
			class211.anInt2264
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     + (aClass182_Sub1_9585.aFloat9198
					* f_1145_ / f_1147_));
			class211.anInt2266
			    = (int) (aClass182_Sub1_9585.aFloat9199
				     + (aClass182_Sub1_9585.aFloat9200
					* f_1146_ / f_1147_));
		    } else if (f_1142_ < -f_1143_) {
			float f_1148_
			    = (f_1142_ + f_1143_) / (f_1138_ + f_1139_) - 1.0F;
			float f_1149_
			    = f_1140_ + f_1148_ * (f_1136_ - f_1140_);
			float f_1150_
			    = f_1141_ + f_1148_ * (f_1137_ - f_1141_);
			float f_1151_
			    = f_1143_ + f_1148_ * (f_1139_ - f_1143_);
			class211.anInt2263
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     + (aClass182_Sub1_9585.aFloat9198
					* f_1149_ / f_1151_));
			class211.anInt2267
			    = (int) (aClass182_Sub1_9585.aFloat9199
				     + (aClass182_Sub1_9585.aFloat9200
					* f_1150_ / f_1151_));
		    }
		}
		if (bool_1130_) {
		    if (f_1138_ / f_1139_ > f_1142_ / f_1143_) {
			float f_1152_ = (f_1136_
					 + (class435.aFloatArray4830[0]
					    * (float) anInt9602)
					 + class435.aFloatArray4830[12]);
			float f_1153_ = (f_1139_
					 + (class435.aFloatArray4830[3]
					    * (float) anInt9602)
					 + class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     - (float) class211.anInt2264
				     + (aClass182_Sub1_9585.aFloat9198
					* f_1152_ / f_1153_));
		    } else {
			float f_1154_ = (f_1140_
					 + (class435.aFloatArray4830[0]
					    * (float) anInt9602)
					 + class435.aFloatArray4830[12]);
			float f_1155_ = (f_1143_
					 + (class435.aFloatArray4830[3]
					    * (float) anInt9602)
					 + class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     - (float) class211.anInt2263
				     + (aClass182_Sub1_9585.aFloat9198
					* f_1154_ / f_1155_));
		    }
		    class211.aBool2265 = true;
		}
	    }
	    aClass182_Sub1_9585.method14872(i);
	    method15283(class444);
	    aClass182_Sub1_9585.method14872(0);
	    class435_1119_.method7040(class444);
	    class435_1119_.method6950(aClass182_Sub1_9585.aClass435_9173);
	    method15284(class435_1119_);
	}
    }
    
    public void method3058(short i, short i_1156_) {
	Class180 class180 = aClass182_Sub1_9585.aClass180_1944;
	for (int i_1157_ = 0; i_1157_ < anInt9595; i_1157_++) {
	    if (aShortArray9605[i_1157_] == i)
		aShortArray9605[i_1157_] = i_1156_;
	}
	byte i_1158_ = 0;
	byte i_1159_ = 0;
	if (i != -1) {
	    Class166 class166 = class180.method3116(i & 0xffff, -1431554601);
	    i_1158_ = class166.aByte1785;
	    i_1159_ = class166.aByte1831;
	}
	byte i_1160_ = 0;
	byte i_1161_ = 0;
	if (i_1156_ != -1) {
	    Class166 class166
		= class180.method3116(i_1156_ & 0xffff, -1431554601);
	    i_1160_ = class166.aByte1785;
	    i_1161_ = class166.aByte1831;
	    if (class166.aByte1805 != 0 || class166.aByte1806 != 0)
		aBool9606 = true;
	}
	if (i_1158_ != i_1160_ | i_1159_ != i_1161_) {
	    if (aClass359Array9604 != null) {
		for (int i_1162_ = 0; i_1162_ < anInt9603; i_1162_++) {
		    Class359 class359 = aClass359Array9604[i_1162_];
		    Class349 class349 = aClass349Array9574[i_1162_];
		    class349.anInt3739
			= (class349.anInt3739 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9552[class359.anInt3805] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15290();
	}
    }
    
    public void method3059(short i, short i_1163_) {
	Class180 class180 = aClass182_Sub1_9585.aClass180_1944;
	for (int i_1164_ = 0; i_1164_ < anInt9595; i_1164_++) {
	    if (aShortArray9605[i_1164_] == i)
		aShortArray9605[i_1164_] = i_1163_;
	}
	byte i_1165_ = 0;
	byte i_1166_ = 0;
	if (i != -1) {
	    Class166 class166 = class180.method3116(i & 0xffff, -1431554601);
	    i_1165_ = class166.aByte1785;
	    i_1166_ = class166.aByte1831;
	}
	byte i_1167_ = 0;
	byte i_1168_ = 0;
	if (i_1163_ != -1) {
	    Class166 class166
		= class180.method3116(i_1163_ & 0xffff, -1431554601);
	    i_1167_ = class166.aByte1785;
	    i_1168_ = class166.aByte1831;
	    if (class166.aByte1805 != 0 || class166.aByte1806 != 0)
		aBool9606 = true;
	}
	if (i_1165_ != i_1167_ | i_1166_ != i_1168_) {
	    if (aClass359Array9604 != null) {
		for (int i_1169_ = 0; i_1169_ < anInt9603; i_1169_++) {
		    Class359 class359 = aClass359Array9604[i_1169_];
		    Class349 class349 = aClass349Array9574[i_1169_];
		    class349.anInt3739
			= (class349.anInt3739 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9552[class359.anInt3805] & 0xffff])
			      & 0xffffff));
		}
	    }
	    method15290();
	}
    }
    
    public Class184[] method3060() {
	return aClass184Array9600;
    }
    
    public Class154[] method2946() {
	return aClass154Array9601;
    }
    
    public Class154[] method3085() {
	return aClass154Array9601;
    }
    
    public Class154[] method3063() {
	return aClass154Array9601;
    }
    
    public void method3019(Class179 class179, int i, int i_1170_, int i_1171_,
			   boolean bool) {
	Class179_Sub3 class179_sub3_1172_ = (Class179_Sub3) class179;
	if (anInt9595 != 0 && class179_sub3_1172_.anInt9595 != 0) {
	    int i_1173_ = class179_sub3_1172_.anInt9549;
	    int[] is = class179_sub3_1172_.anIntArray9550;
	    int[] is_1174_ = class179_sub3_1172_.anIntArray9551;
	    int[] is_1175_ = class179_sub3_1172_.anIntArray9541;
	    short[] is_1176_ = class179_sub3_1172_.aShortArray9617;
	    short[] is_1177_ = class179_sub3_1172_.aShortArray9559;
	    short[] is_1178_ = class179_sub3_1172_.aShortArray9560;
	    byte[] is_1179_ = class179_sub3_1172_.aByteArray9557;
	    short[] is_1180_;
	    short[] is_1181_;
	    short[] is_1182_;
	    byte[] is_1183_;
	    if (aClass366_9564 != null) {
		is_1180_ = aClass366_9564.aShortArray3857;
		is_1181_ = aClass366_9564.aShortArray3856;
		is_1182_ = aClass366_9564.aShortArray3858;
		is_1183_ = aClass366_9564.aByteArray3855;
	    } else {
		is_1180_ = null;
		is_1181_ = null;
		is_1182_ = null;
		is_1183_ = null;
	    }
	    short[] is_1184_;
	    short[] is_1185_;
	    short[] is_1186_;
	    byte[] is_1187_;
	    if (class179_sub3_1172_.aClass366_9564 != null) {
		is_1184_ = class179_sub3_1172_.aClass366_9564.aShortArray3857;
		is_1185_ = class179_sub3_1172_.aClass366_9564.aShortArray3856;
		is_1186_ = class179_sub3_1172_.aClass366_9564.aShortArray3858;
		is_1187_ = class179_sub3_1172_.aClass366_9564.aByteArray3855;
	    } else {
		is_1184_ = null;
		is_1185_ = null;
		is_1186_ = null;
		is_1187_ = null;
	    }
	    int[] is_1188_ = class179_sub3_1172_.anIntArray9598;
	    short[] is_1189_ = class179_sub3_1172_.aShortArray9599;
	    if (!class179_sub3_1172_.aBool9586)
		class179_sub3_1172_.method15278();
	    int i_1190_ = class179_sub3_1172_.anInt9587;
	    int i_1191_ = class179_sub3_1172_.anInt9588;
	    int i_1192_ = class179_sub3_1172_.anInt9589;
	    int i_1193_ = class179_sub3_1172_.anInt9590;
	    int i_1194_ = class179_sub3_1172_.anInt9591;
	    int i_1195_ = class179_sub3_1172_.anInt9592;
	    for (int i_1196_ = 0; i_1196_ < anInt9549; i_1196_++) {
		int i_1197_ = anIntArray9551[i_1196_] - i_1170_;
		if (i_1197_ >= i_1190_ && i_1197_ <= i_1191_) {
		    int i_1198_ = anIntArray9550[i_1196_] - i;
		    if (i_1198_ >= i_1192_ && i_1198_ <= i_1193_) {
			int i_1199_ = anIntArray9541[i_1196_] - i_1171_;
			if (i_1199_ >= i_1194_ && i_1199_ <= i_1195_) {
			    int i_1200_ = -1;
			    int i_1201_ = anIntArray9598[i_1196_];
			    int i_1202_ = anIntArray9598[i_1196_ + 1];
			    for (int i_1203_ = i_1201_;
				 (i_1203_ < i_1202_
				  && aShortArray9599[i_1203_] != 0);
				 i_1203_++) {
				i_1200_
				    = (aShortArray9599[i_1203_] & 0xffff) - 1;
				if (aByteArray9557[i_1200_] != 0)
				    break;
			    }
			    if (i_1200_ != -1) {
				for (int i_1204_ = 0; i_1204_ < i_1173_;
				     i_1204_++) {
				    if (i_1198_ == is[i_1204_]
					&& i_1199_ == is_1175_[i_1204_]
					&& i_1197_ == is_1174_[i_1204_]) {
					int i_1205_ = -1;
					i_1201_ = is_1188_[i_1204_];
					i_1202_ = is_1188_[i_1204_ + 1];
					for (int i_1206_ = i_1201_;
					     (i_1206_ < i_1202_
					      && is_1189_[i_1206_] != 0);
					     i_1206_++) {
					    i_1205_ = (is_1189_[i_1206_] - 1
						       & 0xffff);
					    if (is_1179_[i_1205_] != 0)
						break;
					}
					if (i_1205_ != -1) {
					    if (is_1180_ == null) {
						aClass366_9564
						    = new Class366();
						is_1180_
						    = aClass366_9564
							  .aShortArray3857
						    = (Class457.method7467
						       (aShortArray9617,
							-1189852922));
						is_1181_
						    = aClass366_9564
							  .aShortArray3856
						    = (Class457.method7467
						       (aShortArray9559,
							-1185474088));
						is_1182_
						    = aClass366_9564
							  .aShortArray3858
						    = (Class457.method7467
						       (aShortArray9560,
							2064347520));
						is_1183_
						    = aClass366_9564
							  .aByteArray3855
						    = (Class509.method8501
						       (aByteArray9557,
							490760409));
					    }
					    if (is_1184_ == null) {
						Class366 class366
						    = (class179_sub3_1172_
							   .aClass366_9564
						       = new Class366());
						is_1184_
						    = class366.aShortArray3857
						    = (Class457.method7467
						       (is_1176_, 794691795));
						is_1185_
						    = class366.aShortArray3856
						    = (Class457.method7467
						       (is_1177_, 1790232100));
						is_1186_
						    = class366.aShortArray3858
						    = (Class457.method7467
						       (is_1178_, 134619110));
						is_1187_
						    = class366.aByteArray3855
						    = (Class509.method8501
						       (is_1179_, 1275456546));
					    }
					    short i_1207_
						= aShortArray9617[i_1200_];
					    short i_1208_
						= aShortArray9559[i_1200_];
					    short i_1209_
						= aShortArray9560[i_1200_];
					    byte i_1210_
						= aByteArray9557[i_1200_];
					    i_1201_ = is_1188_[i_1204_];
					    i_1202_ = is_1188_[i_1204_ + 1];
					    for (int i_1211_ = i_1201_;
						 i_1211_ < i_1202_;
						 i_1211_++) {
						int i_1212_
						    = is_1189_[i_1211_] - 1;
						if (i_1212_ == -1)
						    break;
						if (is_1187_[i_1212_] != 0) {
						    is_1184_[i_1212_]
							+= i_1207_;
						    is_1185_[i_1212_]
							+= i_1208_;
						    is_1186_[i_1212_]
							+= i_1209_;
						    is_1187_[i_1212_]
							+= i_1210_;
						}
					    }
					    i_1207_ = is_1176_[i_1205_];
					    i_1208_ = is_1177_[i_1205_];
					    i_1209_ = is_1178_[i_1205_];
					    i_1210_ = is_1179_[i_1205_];
					    i_1201_ = anIntArray9598[i_1196_];
					    i_1202_
						= anIntArray9598[i_1196_ + 1];
					    for (int i_1213_ = i_1201_;
						 (i_1213_ < i_1202_
						  && (aShortArray9599[i_1213_]
						      != 0));
						 i_1213_++) {
						int i_1214_
						    = (aShortArray9599[i_1213_]
						       & 0xffff) - 1;
						if (is_1183_[i_1214_] != 0) {
						    is_1180_[i_1214_]
							+= i_1207_;
						    is_1181_[i_1214_]
							+= i_1208_;
						    is_1182_[i_1214_]
							+= i_1209_;
						    is_1183_[i_1214_]
							+= i_1210_;
						}
					    }
					    class179_sub3_1172_.method15273();
					    method15273();
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public boolean method2981() {
	if (aShortArray9605 == null)
	    return true;
	for (int i = 0; i < aShortArray9605.length; i++) {
	    if (aShortArray9605[i] != -1
		&& !(aClass182_Sub1_9585.aClass351_9253.method6162
		     (aClass182_Sub1_9585.aClass180_1944
			  .method3116(aShortArray9605[i], -1431554601),
		      -1)))
		return false;
	}
	return true;
    }
    
    public boolean method3066() {
	if (aShortArray9605 == null)
	    return true;
	for (int i = 0; i < aShortArray9605.length; i++) {
	    if (aShortArray9605[i] != -1
		&& !(aClass182_Sub1_9585.aClass351_9253.method6162
		     (aClass182_Sub1_9585.aClass180_1944
			  .method3116(aShortArray9605[i], -1431554601),
		      -1)))
		return false;
	}
	return true;
    }
    
    void method2948(int i, int[] is, int i_1215_, int i_1216_, int i_1217_,
		    int i_1218_, boolean bool) {
	int i_1219_ = is.length;
	if (i == 0) {
	    i_1215_ <<= 4;
	    i_1216_ <<= 4;
	    i_1217_ <<= 4;
	    int i_1220_ = 0;
	    anInt9613 = 0;
	    anInt9614 = 0;
	    anInt9576 = 0;
	    for (int i_1221_ = 0; i_1221_ < i_1219_; i_1221_++) {
		int i_1222_ = is[i_1221_];
		if (i_1222_ < anIntArrayArray9553.length) {
		    int[] is_1223_ = anIntArrayArray9553[i_1222_];
		    for (int i_1224_ = 0; i_1224_ < is_1223_.length;
			 i_1224_++) {
			int i_1225_ = is_1223_[i_1224_];
			anInt9613 += anIntArray9550[i_1225_];
			anInt9614 += anIntArray9551[i_1225_];
			anInt9576 += anIntArray9541[i_1225_];
			i_1220_++;
		    }
		}
	    }
	    if (i_1220_ > 0) {
		anInt9613 = anInt9613 / i_1220_ + i_1215_;
		anInt9614 = anInt9614 / i_1220_ + i_1216_;
		anInt9576 = anInt9576 / i_1220_ + i_1217_;
	    } else {
		anInt9613 = i_1215_;
		anInt9614 = i_1216_;
		anInt9576 = i_1217_;
	    }
	} else if (i == 1) {
	    i_1215_ <<= 4;
	    i_1216_ <<= 4;
	    i_1217_ <<= 4;
	    for (int i_1226_ = 0; i_1226_ < i_1219_; i_1226_++) {
		int i_1227_ = is[i_1226_];
		if (i_1227_ < anIntArrayArray9553.length) {
		    int[] is_1228_ = anIntArrayArray9553[i_1227_];
		    for (int i_1229_ = 0; i_1229_ < is_1228_.length;
			 i_1229_++) {
			int i_1230_ = is_1228_[i_1229_];
			anIntArray9550[i_1230_] += i_1215_;
			anIntArray9551[i_1230_] += i_1216_;
			anIntArray9541[i_1230_] += i_1217_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1231_ = 0; i_1231_ < i_1219_; i_1231_++) {
		int i_1232_ = is[i_1231_];
		if (i_1232_ < anIntArrayArray9553.length) {
		    int[] is_1233_ = anIntArrayArray9553[i_1232_];
		    if ((i_1218_ & 0x1) == 0) {
			for (int i_1234_ = 0; i_1234_ < is_1233_.length;
			     i_1234_++) {
			    int i_1235_ = is_1233_[i_1234_];
			    anIntArray9550[i_1235_] -= anInt9613;
			    anIntArray9551[i_1235_] -= anInt9614;
			    anIntArray9541[i_1235_] -= anInt9576;
			    if (i_1217_ != 0) {
				int i_1236_ = Class436.anIntArray4831[i_1217_];
				int i_1237_ = Class436.anIntArray4838[i_1217_];
				int i_1238_
				    = ((anIntArray9551[i_1235_] * i_1236_
					+ anIntArray9550[i_1235_] * i_1237_
					+ 16383)
				       >> 14);
				anIntArray9551[i_1235_]
				    = (anIntArray9551[i_1235_] * i_1237_
				       - anIntArray9550[i_1235_] * i_1236_
				       + 16383) >> 14;
				anIntArray9550[i_1235_] = i_1238_;
			    }
			    if (i_1215_ != 0) {
				int i_1239_ = Class436.anIntArray4831[i_1215_];
				int i_1240_ = Class436.anIntArray4838[i_1215_];
				int i_1241_
				    = ((anIntArray9551[i_1235_] * i_1240_
					- anIntArray9541[i_1235_] * i_1239_
					+ 16383)
				       >> 14);
				anIntArray9541[i_1235_]
				    = (anIntArray9551[i_1235_] * i_1239_
				       + anIntArray9541[i_1235_] * i_1240_
				       + 16383) >> 14;
				anIntArray9551[i_1235_] = i_1241_;
			    }
			    if (i_1216_ != 0) {
				int i_1242_ = Class436.anIntArray4831[i_1216_];
				int i_1243_ = Class436.anIntArray4838[i_1216_];
				int i_1244_
				    = ((anIntArray9541[i_1235_] * i_1242_
					+ anIntArray9550[i_1235_] * i_1243_
					+ 16383)
				       >> 14);
				anIntArray9541[i_1235_]
				    = (anIntArray9541[i_1235_] * i_1243_
				       - anIntArray9550[i_1235_] * i_1242_
				       + 16383) >> 14;
				anIntArray9550[i_1235_] = i_1244_;
			    }
			    anIntArray9550[i_1235_] += anInt9613;
			    anIntArray9551[i_1235_] += anInt9614;
			    anIntArray9541[i_1235_] += anInt9576;
			}
		    } else {
			for (int i_1245_ = 0; i_1245_ < is_1233_.length;
			     i_1245_++) {
			    int i_1246_ = is_1233_[i_1245_];
			    anIntArray9550[i_1246_] -= anInt9613;
			    anIntArray9551[i_1246_] -= anInt9614;
			    anIntArray9541[i_1246_] -= anInt9576;
			    if (i_1215_ != 0) {
				int i_1247_ = Class436.anIntArray4831[i_1215_];
				int i_1248_ = Class436.anIntArray4838[i_1215_];
				int i_1249_
				    = ((anIntArray9551[i_1246_] * i_1248_
					- anIntArray9541[i_1246_] * i_1247_
					+ 16383)
				       >> 14);
				anIntArray9541[i_1246_]
				    = (anIntArray9551[i_1246_] * i_1247_
				       + anIntArray9541[i_1246_] * i_1248_
				       + 16383) >> 14;
				anIntArray9551[i_1246_] = i_1249_;
			    }
			    if (i_1217_ != 0) {
				int i_1250_ = Class436.anIntArray4831[i_1217_];
				int i_1251_ = Class436.anIntArray4838[i_1217_];
				int i_1252_
				    = ((anIntArray9551[i_1246_] * i_1250_
					+ anIntArray9550[i_1246_] * i_1251_
					+ 16383)
				       >> 14);
				anIntArray9551[i_1246_]
				    = (anIntArray9551[i_1246_] * i_1251_
				       - anIntArray9550[i_1246_] * i_1250_
				       + 16383) >> 14;
				anIntArray9550[i_1246_] = i_1252_;
			    }
			    if (i_1216_ != 0) {
				int i_1253_ = Class436.anIntArray4831[i_1216_];
				int i_1254_ = Class436.anIntArray4838[i_1216_];
				int i_1255_
				    = ((anIntArray9541[i_1246_] * i_1253_
					+ anIntArray9550[i_1246_] * i_1254_
					+ 16383)
				       >> 14);
				anIntArray9541[i_1246_]
				    = (anIntArray9541[i_1246_] * i_1254_
				       - anIntArray9550[i_1246_] * i_1253_
				       + 16383) >> 14;
				anIntArray9550[i_1246_] = i_1255_;
			    }
			    anIntArray9550[i_1246_] += anInt9613;
			    anIntArray9551[i_1246_] += anInt9614;
			    anIntArray9541[i_1246_] += anInt9576;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_1256_ = 0; i_1256_ < i_1219_; i_1256_++) {
		    int i_1257_ = is[i_1256_];
		    if (i_1257_ < anIntArrayArray9553.length) {
			int[] is_1258_ = anIntArrayArray9553[i_1257_];
			for (int i_1259_ = 0; i_1259_ < is_1258_.length;
			     i_1259_++) {
			    int i_1260_ = is_1258_[i_1259_];
			    int i_1261_ = anIntArray9598[i_1260_];
			    int i_1262_ = anIntArray9598[i_1260_ + 1];
			    for (int i_1263_ = i_1261_;
				 (i_1263_ < i_1262_
				  && aShortArray9599[i_1263_] != 0);
				 i_1263_++) {
				int i_1264_
				    = (aShortArray9599[i_1263_] & 0xffff) - 1;
				if (i_1217_ != 0) {
				    int i_1265_
					= Class436.anIntArray4831[i_1217_];
				    int i_1266_
					= Class436.anIntArray4838[i_1217_];
				    int i_1267_
					= (aShortArray9559[i_1264_] * i_1265_
					   + aShortArray9617[i_1264_] * i_1266_
					   + 16383) >> 14;
				    aShortArray9559[i_1264_]
					= (short) (((aShortArray9559[i_1264_]
						     * i_1266_)
						    - (aShortArray9617[i_1264_]
						       * i_1265_)
						    + 16383)
						   >> 14);
				    aShortArray9617[i_1264_] = (short) i_1267_;
				}
				if (i_1215_ != 0) {
				    int i_1268_
					= Class436.anIntArray4831[i_1215_];
				    int i_1269_
					= Class436.anIntArray4838[i_1215_];
				    int i_1270_
					= (aShortArray9559[i_1264_] * i_1269_
					   - aShortArray9560[i_1264_] * i_1268_
					   + 16383) >> 14;
				    aShortArray9560[i_1264_]
					= (short) (((aShortArray9559[i_1264_]
						     * i_1268_)
						    + (aShortArray9560[i_1264_]
						       * i_1269_)
						    + 16383)
						   >> 14);
				    aShortArray9559[i_1264_] = (short) i_1270_;
				}
				if (i_1216_ != 0) {
				    int i_1271_
					= Class436.anIntArray4831[i_1216_];
				    int i_1272_
					= Class436.anIntArray4838[i_1216_];
				    int i_1273_
					= (aShortArray9560[i_1264_] * i_1271_
					   + aShortArray9617[i_1264_] * i_1272_
					   + 16383) >> 14;
				    aShortArray9560[i_1264_]
					= (short) (((aShortArray9560[i_1264_]
						     * i_1272_)
						    - (aShortArray9617[i_1264_]
						       * i_1271_)
						    + 16383)
						   >> 14);
				    aShortArray9617[i_1264_] = (short) i_1273_;
				}
			    }
			}
		    }
		}
		method15273();
	    }
	} else if (i == 3) {
	    for (int i_1274_ = 0; i_1274_ < i_1219_; i_1274_++) {
		int i_1275_ = is[i_1274_];
		if (i_1275_ < anIntArrayArray9553.length) {
		    int[] is_1276_ = anIntArrayArray9553[i_1275_];
		    for (int i_1277_ = 0; i_1277_ < is_1276_.length;
			 i_1277_++) {
			int i_1278_ = is_1276_[i_1277_];
			anIntArray9550[i_1278_] -= anInt9613;
			anIntArray9551[i_1278_] -= anInt9614;
			anIntArray9541[i_1278_] -= anInt9576;
			anIntArray9550[i_1278_]
			    = anIntArray9550[i_1278_] * i_1215_ >> 7;
			anIntArray9551[i_1278_]
			    = anIntArray9551[i_1278_] * i_1216_ >> 7;
			anIntArray9541[i_1278_]
			    = anIntArray9541[i_1278_] * i_1217_ >> 7;
			anIntArray9550[i_1278_] += anInt9613;
			anIntArray9551[i_1278_] += anInt9614;
			anIntArray9541[i_1278_] += anInt9576;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9573 != null) {
		boolean bool_1279_ = false;
		for (int i_1280_ = 0; i_1280_ < i_1219_; i_1280_++) {
		    int i_1281_ = is[i_1280_];
		    if (i_1281_ < anIntArrayArray9573.length) {
			int[] is_1282_ = anIntArrayArray9573[i_1281_];
			for (int i_1283_ = 0; i_1283_ < is_1282_.length;
			     i_1283_++) {
			    int i_1284_ = is_1282_[i_1283_];
			    int i_1285_ = ((aByteArray9568[i_1284_] & 0xff)
					   + i_1215_ * 8);
			    if (i_1285_ < 0)
				i_1285_ = 0;
			    else if (i_1285_ > 255)
				i_1285_ = 255;
			    aByteArray9568[i_1284_] = (byte) i_1285_;
			}
			bool_1279_ = bool_1279_ | is_1282_.length > 0;
		    }
		}
		if (bool_1279_) {
		    if (aClass359Array9604 != null) {
			for (int i_1286_ = 0; i_1286_ < anInt9603; i_1286_++) {
			    Class359 class359 = aClass359Array9604[i_1286_];
			    Class349 class349 = aClass349Array9574[i_1286_];
			    class349.anInt3739
				= (class349.anInt3739 & 0xffffff
				   | 255 - (aByteArray9568[class359.anInt3805]
					    & 0xff) << 24);
			}
		    }
		    method15290();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9573 != null) {
		boolean bool_1287_ = false;
		for (int i_1288_ = 0; i_1288_ < i_1219_; i_1288_++) {
		    int i_1289_ = is[i_1288_];
		    if (i_1289_ < anIntArrayArray9573.length) {
			int[] is_1290_ = anIntArrayArray9573[i_1289_];
			for (int i_1291_ = 0; i_1291_ < is_1290_.length;
			     i_1291_++) {
			    int i_1292_ = is_1290_[i_1291_];
			    int i_1293_ = aShortArray9552[i_1292_] & 0xffff;
			    int i_1294_ = i_1293_ >> 10 & 0x3f;
			    int i_1295_ = i_1293_ >> 7 & 0x7;
			    int i_1296_ = i_1293_ & 0x7f;
			    i_1294_ = i_1294_ + i_1215_ & 0x3f;
			    i_1295_ += i_1216_ / 4;
			    if (i_1295_ < 0)
				i_1295_ = 0;
			    else if (i_1295_ > 7)
				i_1295_ = 7;
			    i_1296_ += i_1217_;
			    if (i_1296_ < 0)
				i_1296_ = 0;
			    else if (i_1296_ > 127)
				i_1296_ = 127;
			    aShortArray9552[i_1292_]
				= (short) (i_1294_ << 10 | i_1295_ << 7
					   | i_1296_);
			}
			bool_1287_ = bool_1287_ | is_1290_.length > 0;
		    }
		}
		if (bool_1287_) {
		    if (aClass359Array9604 != null) {
			for (int i_1297_ = 0; i_1297_ < anInt9603; i_1297_++) {
			    Class359 class359 = aClass359Array9604[i_1297_];
			    Class349 class349 = aClass349Array9574[i_1297_];
			    class349.anInt3739
				= (class349.anInt3739 & ~0xffffff
				   | (Class642.anIntArray8324
				      [(aShortArray9552[class359.anInt3805]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15290();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9543 != null) {
		for (int i_1298_ = 0; i_1298_ < i_1219_; i_1298_++) {
		    int i_1299_ = is[i_1298_];
		    if (i_1299_ < anIntArrayArray9543.length) {
			int[] is_1300_ = anIntArrayArray9543[i_1299_];
			for (int i_1301_ = 0; i_1301_ < is_1300_.length;
			     i_1301_++) {
			    Class349 class349
				= aClass349Array9574[is_1300_[i_1301_]];
			    class349.anInt3738 += i_1215_;
			    class349.anInt3735 += i_1216_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9543 != null) {
		for (int i_1302_ = 0; i_1302_ < i_1219_; i_1302_++) {
		    int i_1303_ = is[i_1302_];
		    if (i_1303_ < anIntArrayArray9543.length) {
			int[] is_1304_ = anIntArrayArray9543[i_1303_];
			for (int i_1305_ = 0; i_1305_ < is_1304_.length;
			     i_1305_++) {
			    Class349 class349
				= aClass349Array9574[is_1304_[i_1305_]];
			    class349.anInt3740
				= class349.anInt3740 * i_1215_ >> 7;
			    class349.anInt3737
				= class349.anInt3737 * i_1216_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9543 != null) {
		for (int i_1306_ = 0; i_1306_ < i_1219_; i_1306_++) {
		    int i_1307_ = is[i_1306_];
		    if (i_1307_ < anIntArrayArray9543.length) {
			int[] is_1308_ = anIntArrayArray9543[i_1307_];
			for (int i_1309_ = 0; i_1309_ < is_1308_.length;
			     i_1309_++) {
			    Class349 class349
				= aClass349Array9574[is_1308_[i_1309_]];
			    class349.anInt3736
				= class349.anInt3736 + i_1215_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method15296() {
	if (aClass354_9575 != null)
	    aClass354_9575.aBool3787 = false;
    }
    
    public boolean method3079() {
	return aBool9606;
    }
    
    Class179 method15297(Class179_Sub3 class179_sub3_1310_,
			 Class179_Sub3 class179_sub3_1311_, int i,
			 boolean bool, boolean bool_1312_) {
	class179_sub3_1310_.anInt9544 = i;
	class179_sub3_1310_.anInt9558 = anInt9558;
	class179_sub3_1310_.aShort9546 = aShort9546;
	class179_sub3_1310_.aShort9572 = aShort9572;
	class179_sub3_1310_.anInt9583 = anInt9583;
	class179_sub3_1310_.anInt9549 = anInt9549;
	class179_sub3_1310_.anInt9555 = anInt9555;
	class179_sub3_1310_.anInt9595 = anInt9595;
	class179_sub3_1310_.anInt9566 = anInt9566;
	class179_sub3_1310_.anInt9603 = anInt9603;
	if ((i & 0x100) != 0)
	    class179_sub3_1310_.aBool9582 = true;
	else
	    class179_sub3_1310_.aBool9582 = aBool9582;
	class179_sub3_1310_.aBool9606 = aBool9606;
	boolean bool_1313_ = Class338.method5864(i, anInt9558);
	boolean bool_1314_ = Class338.method5865(i, anInt9558);
	boolean bool_1315_ = Class338.method5866(i, anInt9558);
	boolean bool_1316_ = bool_1313_ | bool_1314_ | bool_1315_;
	if (bool_1316_) {
	    if (bool_1313_) {
		if (class179_sub3_1311_.anIntArray9550 == null
		    || class179_sub3_1311_.anIntArray9550.length < anInt9583)
		    class179_sub3_1310_.anIntArray9550
			= class179_sub3_1311_.anIntArray9550
			= new int[anInt9583];
		else
		    class179_sub3_1310_.anIntArray9550
			= class179_sub3_1311_.anIntArray9550;
	    } else
		class179_sub3_1310_.anIntArray9550 = anIntArray9550;
	    if (bool_1314_) {
		if (class179_sub3_1311_.anIntArray9551 == null
		    || class179_sub3_1311_.anIntArray9551.length < anInt9583)
		    class179_sub3_1310_.anIntArray9551
			= class179_sub3_1311_.anIntArray9551
			= new int[anInt9583];
		else
		    class179_sub3_1310_.anIntArray9551
			= class179_sub3_1311_.anIntArray9551;
	    } else
		class179_sub3_1310_.anIntArray9551 = anIntArray9551;
	    if (bool_1315_) {
		if (class179_sub3_1311_.anIntArray9541 == null
		    || class179_sub3_1311_.anIntArray9541.length < anInt9583)
		    class179_sub3_1310_.anIntArray9541
			= class179_sub3_1311_.anIntArray9541
			= new int[anInt9583];
		else
		    class179_sub3_1310_.anIntArray9541
			= class179_sub3_1311_.anIntArray9541;
	    } else
		class179_sub3_1310_.anIntArray9541 = anIntArray9541;
	    for (int i_1317_ = 0; i_1317_ < anInt9583; i_1317_++) {
		if (bool_1313_)
		    class179_sub3_1310_.anIntArray9550[i_1317_]
			= anIntArray9550[i_1317_];
		if (bool_1314_)
		    class179_sub3_1310_.anIntArray9551[i_1317_]
			= anIntArray9551[i_1317_];
		if (bool_1315_)
		    class179_sub3_1310_.anIntArray9541[i_1317_]
			= anIntArray9541[i_1317_];
	    }
	} else {
	    class179_sub3_1310_.anIntArray9550 = anIntArray9550;
	    class179_sub3_1310_.anIntArray9551 = anIntArray9551;
	    class179_sub3_1310_.anIntArray9541 = anIntArray9541;
	}
	if (Class338.method5881(i, anInt9558)) {
	    class179_sub3_1310_.aClass363_9616
		= class179_sub3_1311_.aClass363_9616;
	    class179_sub3_1310_.aClass363_9616.anInterface35_3834
		= aClass363_9616.anInterface35_3834;
	    class179_sub3_1310_.aClass363_9616.aBool3835
		= aClass363_9616.aBool3835;
	    class179_sub3_1310_.aClass363_9616.aBool3836 = true;
	} else if (Class338.method5876(i, anInt9558))
	    class179_sub3_1310_.aClass363_9616 = aClass363_9616;
	else
	    class179_sub3_1310_.aClass363_9616 = null;
	if (Class338.method5869(i, anInt9558)) {
	    if (class179_sub3_1311_.aShortArray9552 == null
		|| class179_sub3_1311_.aShortArray9552.length < anInt9595)
		class179_sub3_1310_.aShortArray9552
		    = class179_sub3_1311_.aShortArray9552
		    = new short[anInt9595];
	    else
		class179_sub3_1310_.aShortArray9552
		    = class179_sub3_1311_.aShortArray9552;
	    for (int i_1318_ = 0; i_1318_ < anInt9595; i_1318_++)
		class179_sub3_1310_.aShortArray9552[i_1318_]
		    = aShortArray9552[i_1318_];
	} else
	    class179_sub3_1310_.aShortArray9552 = aShortArray9552;
	if (Class338.method5957(i, anInt9558)) {
	    if (class179_sub3_1311_.aByteArray9568 == null
		|| class179_sub3_1311_.aByteArray9568.length < anInt9595)
		class179_sub3_1310_.aByteArray9568
		    = class179_sub3_1311_.aByteArray9568 = new byte[anInt9595];
	    else
		class179_sub3_1310_.aByteArray9568
		    = class179_sub3_1311_.aByteArray9568;
	    for (int i_1319_ = 0; i_1319_ < anInt9595; i_1319_++)
		class179_sub3_1310_.aByteArray9568[i_1319_]
		    = aByteArray9568[i_1319_];
	} else
	    class179_sub3_1310_.aByteArray9568 = aByteArray9568;
	if (Class338.method5883(i, anInt9558)) {
	    class179_sub3_1310_.aClass363_9577
		= class179_sub3_1311_.aClass363_9577;
	    class179_sub3_1310_.aClass363_9577.anInterface35_3834
		= aClass363_9577.anInterface35_3834;
	    class179_sub3_1310_.aClass363_9577.aBool3835
		= aClass363_9577.aBool3835;
	    class179_sub3_1310_.aClass363_9577.aBool3836 = true;
	} else if (Class338.method5878(i, anInt9558))
	    class179_sub3_1310_.aClass363_9577 = aClass363_9577;
	else
	    class179_sub3_1310_.aClass363_9577 = null;
	if (Class338.method5868(i, anInt9558)) {
	    if (class179_sub3_1311_.aShortArray9617 == null
		|| class179_sub3_1311_.aShortArray9617.length < anInt9555) {
		int i_1320_ = anInt9555;
		class179_sub3_1310_.aShortArray9617
		    = class179_sub3_1311_.aShortArray9617 = new short[i_1320_];
		class179_sub3_1310_.aShortArray9559
		    = class179_sub3_1311_.aShortArray9559 = new short[i_1320_];
		class179_sub3_1310_.aShortArray9560
		    = class179_sub3_1311_.aShortArray9560 = new short[i_1320_];
	    } else {
		class179_sub3_1310_.aShortArray9617
		    = class179_sub3_1311_.aShortArray9617;
		class179_sub3_1310_.aShortArray9559
		    = class179_sub3_1311_.aShortArray9559;
		class179_sub3_1310_.aShortArray9560
		    = class179_sub3_1311_.aShortArray9560;
	    }
	    if (aClass366_9564 != null) {
		if (class179_sub3_1311_.aClass366_9564 == null)
		    class179_sub3_1311_.aClass366_9564 = new Class366();
		Class366 class366 = (class179_sub3_1310_.aClass366_9564
				     = class179_sub3_1311_.aClass366_9564);
		if (class366.aShortArray3857 == null
		    || class366.aShortArray3857.length < anInt9555) {
		    int i_1321_ = anInt9555;
		    class366.aShortArray3857 = new short[i_1321_];
		    class366.aShortArray3856 = new short[i_1321_];
		    class366.aShortArray3858 = new short[i_1321_];
		    class366.aByteArray3855 = new byte[i_1321_];
		}
		for (int i_1322_ = 0; i_1322_ < anInt9555; i_1322_++) {
		    class179_sub3_1310_.aShortArray9617[i_1322_]
			= aShortArray9617[i_1322_];
		    class179_sub3_1310_.aShortArray9559[i_1322_]
			= aShortArray9559[i_1322_];
		    class179_sub3_1310_.aShortArray9560[i_1322_]
			= aShortArray9560[i_1322_];
		    class366.aShortArray3857[i_1322_]
			= aClass366_9564.aShortArray3857[i_1322_];
		    class366.aShortArray3856[i_1322_]
			= aClass366_9564.aShortArray3856[i_1322_];
		    class366.aShortArray3858[i_1322_]
			= aClass366_9564.aShortArray3858[i_1322_];
		    class366.aByteArray3855[i_1322_]
			= aClass366_9564.aByteArray3855[i_1322_];
		}
	    } else {
		class179_sub3_1310_.aClass366_9564 = null;
		for (int i_1323_ = 0; i_1323_ < anInt9555; i_1323_++) {
		    class179_sub3_1310_.aShortArray9617[i_1323_]
			= aShortArray9617[i_1323_];
		    class179_sub3_1310_.aShortArray9559[i_1323_]
			= aShortArray9559[i_1323_];
		    class179_sub3_1310_.aShortArray9560[i_1323_]
			= aShortArray9560[i_1323_];
		}
	    }
	    class179_sub3_1310_.aByteArray9557 = aByteArray9557;
	} else {
	    class179_sub3_1310_.aClass366_9564 = aClass366_9564;
	    class179_sub3_1310_.aShortArray9617 = aShortArray9617;
	    class179_sub3_1310_.aShortArray9559 = aShortArray9559;
	    class179_sub3_1310_.aShortArray9560 = aShortArray9560;
	    class179_sub3_1310_.aByteArray9557 = aByteArray9557;
	}
	if (Class338.method5882(i, anInt9558)) {
	    class179_sub3_1310_.aClass363_9578
		= class179_sub3_1311_.aClass363_9578;
	    class179_sub3_1310_.aClass363_9578.anInterface35_3834
		= aClass363_9578.anInterface35_3834;
	    class179_sub3_1310_.aClass363_9578.aBool3835
		= aClass363_9578.aBool3835;
	    class179_sub3_1310_.aClass363_9578.aBool3836 = true;
	} else if (Class338.method5903(i, anInt9558))
	    class179_sub3_1310_.aClass363_9578 = aClass363_9578;
	else
	    class179_sub3_1310_.aClass363_9578 = null;
	if (Class338.method5871(i, anInt9558)) {
	    if (class179_sub3_1311_.aFloatArray9562 == null
		|| class179_sub3_1311_.aFloatArray9562.length < anInt9595) {
		int i_1324_ = anInt9555;
		class179_sub3_1310_.aFloatArray9562
		    = class179_sub3_1311_.aFloatArray9562 = new float[i_1324_];
		class179_sub3_1310_.aFloatArray9563
		    = class179_sub3_1311_.aFloatArray9563 = new float[i_1324_];
	    } else {
		class179_sub3_1310_.aFloatArray9562
		    = class179_sub3_1311_.aFloatArray9562;
		class179_sub3_1310_.aFloatArray9563
		    = class179_sub3_1311_.aFloatArray9563;
	    }
	    for (int i_1325_ = 0; i_1325_ < anInt9555; i_1325_++) {
		class179_sub3_1310_.aFloatArray9562[i_1325_]
		    = aFloatArray9562[i_1325_];
		class179_sub3_1310_.aFloatArray9563[i_1325_]
		    = aFloatArray9563[i_1325_];
	    }
	} else {
	    class179_sub3_1310_.aFloatArray9562 = aFloatArray9562;
	    class179_sub3_1310_.aFloatArray9563 = aFloatArray9563;
	}
	if (Class338.method5934(i, anInt9558)) {
	    class179_sub3_1310_.aClass363_9579
		= class179_sub3_1311_.aClass363_9579;
	    class179_sub3_1310_.aClass363_9579.anInterface35_3834
		= aClass363_9579.anInterface35_3834;
	    class179_sub3_1310_.aClass363_9579.aBool3835
		= aClass363_9579.aBool3835;
	    class179_sub3_1310_.aClass363_9579.aBool3836 = true;
	} else if (Class338.method5898(i, anInt9558))
	    class179_sub3_1310_.aClass363_9579 = aClass363_9579;
	else
	    class179_sub3_1310_.aClass363_9579 = null;
	if (Class338.method5872(i, anInt9558)) {
	    if (class179_sub3_1311_.aShortArray9561 == null
		|| class179_sub3_1311_.aShortArray9561.length < anInt9595) {
		int i_1326_ = anInt9595;
		class179_sub3_1310_.aShortArray9561
		    = class179_sub3_1311_.aShortArray9561 = new short[i_1326_];
		class179_sub3_1310_.aShortArray9570
		    = class179_sub3_1311_.aShortArray9570 = new short[i_1326_];
		class179_sub3_1310_.aShortArray9571
		    = class179_sub3_1311_.aShortArray9571 = new short[i_1326_];
	    } else {
		class179_sub3_1310_.aShortArray9561
		    = class179_sub3_1311_.aShortArray9561;
		class179_sub3_1310_.aShortArray9570
		    = class179_sub3_1311_.aShortArray9570;
		class179_sub3_1310_.aShortArray9571
		    = class179_sub3_1311_.aShortArray9571;
	    }
	    for (int i_1327_ = 0; i_1327_ < anInt9595; i_1327_++) {
		class179_sub3_1310_.aShortArray9561[i_1327_]
		    = aShortArray9561[i_1327_];
		class179_sub3_1310_.aShortArray9570[i_1327_]
		    = aShortArray9570[i_1327_];
		class179_sub3_1310_.aShortArray9571[i_1327_]
		    = aShortArray9571[i_1327_];
	    }
	} else {
	    class179_sub3_1310_.aShortArray9561 = aShortArray9561;
	    class179_sub3_1310_.aShortArray9570 = aShortArray9570;
	    class179_sub3_1310_.aShortArray9571 = aShortArray9571;
	}
	if (Class338.method5885(i, anInt9558)) {
	    class179_sub3_1310_.aClass354_9575
		= class179_sub3_1311_.aClass354_9575;
	    class179_sub3_1310_.aClass354_9575.anInterface44_3786
		= aClass354_9575.anInterface44_3786;
	    class179_sub3_1310_.aClass354_9575.aBool3787
		= aClass354_9575.aBool3787;
	    class179_sub3_1310_.aClass354_9575.aBool3788 = true;
	} else if (Class338.method5880(i, anInt9558))
	    class179_sub3_1310_.aClass354_9575 = aClass354_9575;
	else
	    class179_sub3_1310_.aClass354_9575 = null;
	if (Class338.method5948(i, anInt9558)) {
	    if (class179_sub3_1311_.aShortArray9605 == null
		|| class179_sub3_1311_.aShortArray9605.length < anInt9595) {
		int i_1328_ = anInt9595;
		class179_sub3_1310_.aShortArray9605
		    = class179_sub3_1311_.aShortArray9605 = new short[i_1328_];
	    } else
		class179_sub3_1310_.aShortArray9605
		    = class179_sub3_1311_.aShortArray9605;
	    for (int i_1329_ = 0; i_1329_ < anInt9595; i_1329_++)
		class179_sub3_1310_.aShortArray9605[i_1329_]
		    = aShortArray9605[i_1329_];
	} else
	    class179_sub3_1310_.aShortArray9605 = aShortArray9605;
	if (Class338.method5874(i, anInt9558)) {
	    if (class179_sub3_1311_.aClass349Array9574 == null
		|| class179_sub3_1311_.aClass349Array9574.length < anInt9603) {
		int i_1330_ = anInt9603;
		class179_sub3_1310_.aClass349Array9574
		    = class179_sub3_1311_.aClass349Array9574
		    = new Class349[i_1330_];
		for (int i_1331_ = 0; i_1331_ < anInt9603; i_1331_++)
		    class179_sub3_1310_.aClass349Array9574[i_1331_]
			= aClass349Array9574[i_1331_].method6120();
	    } else {
		class179_sub3_1310_.aClass349Array9574
		    = class179_sub3_1311_.aClass349Array9574;
		for (int i_1332_ = 0; i_1332_ < anInt9603; i_1332_++)
		    class179_sub3_1310_.aClass349Array9574[i_1332_]
			.method6121(aClass349Array9574[i_1332_]);
	    }
	} else
	    class179_sub3_1310_.aClass349Array9574 = aClass349Array9574;
	class179_sub3_1310_.aClass359Array9604 = aClass359Array9604;
	if (aBool9586) {
	    class179_sub3_1310_.anInt9584 = anInt9584;
	    class179_sub3_1310_.anInt9602 = anInt9602;
	    class179_sub3_1310_.anInt9589 = anInt9589;
	    class179_sub3_1310_.anInt9590 = anInt9590;
	    class179_sub3_1310_.anInt9587 = anInt9587;
	    class179_sub3_1310_.anInt9588 = anInt9588;
	    class179_sub3_1310_.anInt9591 = anInt9591;
	    class179_sub3_1310_.anInt9592 = anInt9592;
	    class179_sub3_1310_.aBool9586 = true;
	} else
	    class179_sub3_1310_.aBool9586 = false;
	if (aBool9593) {
	    class179_sub3_1310_.anInt9594 = anInt9594;
	    class179_sub3_1310_.aBool9593 = true;
	} else
	    class179_sub3_1310_.aBool9593 = false;
	class179_sub3_1310_.anIntArrayArray9553 = anIntArrayArray9553;
	class179_sub3_1310_.anIntArrayArray9573 = anIntArrayArray9573;
	class179_sub3_1310_.anIntArrayArray9543 = anIntArrayArray9543;
	class179_sub3_1310_.aShortArray9599 = aShortArray9599;
	class179_sub3_1310_.anIntArray9598 = anIntArray9598;
	class179_sub3_1310_.aShortArray9556 = aShortArray9556;
	class179_sub3_1310_.aShortArray9545 = aShortArray9545;
	class179_sub3_1310_.aShortArray9548 = aShortArray9548;
	class179_sub3_1310_.aShortArray9615 = aShortArray9615;
	class179_sub3_1310_.anIntArray9567 = anIntArray9567;
	class179_sub3_1310_.anIntArray9597 = anIntArray9597;
	class179_sub3_1310_.anIntArray9596 = anIntArray9596;
	class179_sub3_1310_.aClass184Array9600 = aClass184Array9600;
	class179_sub3_1310_.aClass154Array9601 = aClass154Array9601;
	return class179_sub3_1310_;
    }
    
    public void method3102(int i, int i_1333_, int i_1334_) {
	for (int i_1335_ = 0; i_1335_ < anInt9549; i_1335_++) {
	    if (i != 0)
		anIntArray9550[i_1335_] += i;
	    if (i_1333_ != 0)
		anIntArray9551[i_1335_] += i_1333_;
	    if (i_1334_ != 0)
		anIntArray9541[i_1335_] += i_1334_;
	}
	method15326();
	aBool9586 = false;
    }
    
    void method15298() {
	if (aBool9581) {
	    aBool9581 = false;
	    if (aClass184Array9600 == null && aClass154Array9601 == null
		&& aClass359Array9604 == null
		&& !Class338.method5867(anInt9544, anInt9558)) {
		boolean bool = false;
		boolean bool_1336_ = false;
		boolean bool_1337_ = false;
		if (anIntArray9550 != null
		    && !Class338.method5920(anInt9544, anInt9558)) {
		    if (aClass363_9616 == null
			|| aClass363_9616.method6313()) {
			if (!aBool9586)
			    method15278();
			bool = true;
		    } else
			aBool9581 = true;
		}
		if (anIntArray9551 != null
		    && !Class338.method5935(anInt9544, anInt9558)) {
		    if (aClass363_9616 == null
			|| aClass363_9616.method6313()) {
			if (!aBool9586)
			    method15278();
			bool_1336_ = true;
		    } else
			aBool9581 = true;
		}
		if (anIntArray9541 != null
		    && !Class338.method5888(anInt9544, anInt9558)) {
		    if (aClass363_9616 == null
			|| aClass363_9616.method6313()) {
			if (!aBool9586)
			    method15278();
			bool_1337_ = true;
		    } else
			aBool9581 = true;
		}
		if (bool)
		    anIntArray9550 = null;
		if (bool_1336_)
		    anIntArray9551 = null;
		if (bool_1337_)
		    anIntArray9541 = null;
	    }
	    if (aShortArray9599 != null && anIntArray9550 == null
		&& anIntArray9551 == null && anIntArray9541 == null) {
		aShortArray9599 = null;
		anIntArray9598 = null;
	    }
	while_140_:
	    do {
		if (aByteArray9557 != null
		    && !Class338.method5889(anInt9544, anInt9558)) {
		    do {
			if ((anInt9558 & 0x37) != 0) {
			    if (aClass363_9578 != null
				&& !aClass363_9578.method6313())
				break;
			} else if (aClass363_9577 != null
				   && !aClass363_9577.method6313())
			    break;
			aShortArray9560 = null;
			aShortArray9559 = null;
			aShortArray9617 = null;
			aByteArray9557 = null;
			break while_140_;
		    } while (false);
		    aBool9581 = true;
		}
	    } while (false);
	    if (aShortArray9552 != null
		&& !Class338.method5877(anInt9544, anInt9558)) {
		if (aClass363_9577 == null || aClass363_9577.method6313())
		    aShortArray9552 = null;
		else
		    aBool9581 = true;
	    }
	    if (aByteArray9568 != null
		&& !Class338.method5891(anInt9544, anInt9558)) {
		if (aClass363_9577 == null || aClass363_9577.method6313())
		    aByteArray9568 = null;
		else
		    aBool9581 = true;
	    }
	    if (aFloatArray9562 != null
		&& !Class338.method5894(anInt9544, anInt9558)) {
		if (aClass363_9579 == null || aClass363_9579.method6313()) {
		    aFloatArray9563 = null;
		    aFloatArray9562 = null;
		} else
		    aBool9581 = true;
	    }
	    if (aShortArray9605 != null
		&& !Class338.method5897(anInt9544, anInt9558)) {
		if (aClass363_9577 == null || aClass363_9577.method6313())
		    aShortArray9605 = null;
		else
		    aBool9581 = true;
	    }
	    if (aShortArray9561 != null
		&& !Class338.method5896(anInt9544, anInt9558)) {
		if ((aClass354_9575 == null || aClass354_9575.method6260())
		    && (aClass363_9577 == null
			|| aClass363_9577.method6313())) {
		    aShortArray9571 = null;
		    aShortArray9570 = null;
		    aShortArray9561 = null;
		} else
		    aBool9581 = true;
	    }
	    if (aShortArray9556 != null) {
		if (aClass363_9616 == null || aClass363_9616.method6313())
		    aShortArray9556 = null;
		else
		    aBool9581 = true;
	    }
	    if (aShortArray9545 != null) {
		if (aClass363_9577 == null || aClass363_9577.method6313())
		    aShortArray9545 = null;
		else
		    aBool9581 = true;
	    }
	    if (anIntArrayArray9573 != null
		&& !Class338.method5895(anInt9544, anInt9558)) {
		anIntArrayArray9573 = null;
		aShortArray9615 = null;
	    }
	    if (anIntArrayArray9553 != null
		&& !Class338.method5971(anInt9544, anInt9558)) {
		anIntArrayArray9553 = null;
		aShortArray9548 = null;
	    }
	    if (anIntArrayArray9543 != null
		&& !Class338.method5912(anInt9544, anInt9558))
		anIntArrayArray9543 = null;
	    if (anIntArray9567 != null && (anInt9544 & 0x800) == 0
		&& (anInt9544 & 0x40000) == 0) {
		anIntArray9567 = null;
		anIntArray9597 = null;
		anIntArray9596 = null;
	    }
	}
    }
    
    public void method3073(int i, int i_1338_, Class161 class161,
			   Class161 class161_1339_, int i_1340_, int i_1341_,
			   int i_1342_) {
	if (!aBool9586)
	    method15278();
	int i_1343_ = i_1340_ + anInt9589;
	int i_1344_ = i_1340_ + anInt9590;
	int i_1345_ = i_1342_ + anInt9591;
	int i_1346_ = i_1342_ + anInt9592;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1343_ >= 0
		&& ((i_1344_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1759 * 363736815)
		&& i_1345_ >= 0
		&& ((i_1346_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1760 * -1152334393))) {
	    if (i == 4 || i == 5) {
		if (class161_1339_ == null
		    || (i_1343_ < 0
			|| ((i_1344_ + class161_1339_.anInt1761 * 435863595
			     >> class161_1339_.anInt1763 * -2063427645)
			    >= class161_1339_.anInt1759 * 363736815)
			|| i_1345_ < 0
			|| ((i_1346_ + class161_1339_.anInt1761 * 435863595
			     >> class161_1339_.anInt1763 * -2063427645)
			    >= class161_1339_.anInt1760 * -1152334393)))
		    return;
	    } else {
		i_1343_ >>= class161.anInt1763 * -2063427645;
		i_1344_ = (i_1344_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		i_1345_ >>= class161.anInt1763 * -2063427645;
		i_1346_ = (i_1346_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		if (class161.method2577(i_1343_, i_1345_, (byte) 44) == i_1341_
		    && (class161.method2577(i_1344_, i_1345_, (byte) 50)
			== i_1341_)
		    && (class161.method2577(i_1343_, i_1346_, (byte) -19)
			== i_1341_)
		    && (class161.method2577(i_1344_, i_1346_, (byte) -125)
			== i_1341_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1347_ = 0; i_1347_ < anInt9549; i_1347_++)
		    anIntArray9551[i_1347_]
			= (anIntArray9551[i_1347_]
			   + class161.method2588((anIntArray9550[i_1347_]
						  + i_1340_),
						 (anIntArray9541[i_1347_]
						  + i_1342_),
						 985233666)
			   - i_1341_);
	    } else if (i == 2) {
		int i_1348_ = anInt9587;
		if (i_1348_ == 0)
		    return;
		for (int i_1349_ = 0; i_1349_ < anInt9549; i_1349_++) {
		    int i_1350_ = (anIntArray9551[i_1349_] << 16) / i_1348_;
		    if (i_1350_ < i_1338_)
			anIntArray9551[i_1349_]
			    = (anIntArray9551[i_1349_]
			       + (class161.method2588((anIntArray9550[i_1349_]
						       + i_1340_),
						      (anIntArray9541[i_1349_]
						       + i_1342_),
						      -840007161)
				  - i_1341_) * (i_1338_ - i_1350_) / i_1338_);
		}
	    } else if (i == 3) {
		int i_1351_ = (i_1338_ & 0xff) * 16;
		int i_1352_ = (i_1338_ >> 8 & 0xff) * 16;
		int i_1353_ = (i_1338_ >> 16 & 0xff) << 6;
		int i_1354_ = (i_1338_ >> 24 & 0xff) << 6;
		if (i_1340_ - (i_1351_ >> 1) < 0
		    || ((i_1340_ + (i_1351_ >> 1)
			 + class161.anInt1761 * 435863595)
			>= (class161.anInt1759 * 363736815
			    << class161.anInt1763 * -2063427645))
		    || i_1342_ - (i_1352_ >> 1) < 0
		    || ((i_1342_ + (i_1352_ >> 1)
			 + class161.anInt1761 * 435863595)
			>= (class161.anInt1760 * -1152334393
			    << class161.anInt1763 * -2063427645)))
		    return;
		method2938(class161, i_1340_, i_1341_, i_1342_, i_1351_,
			   i_1352_, i_1353_, i_1354_);
	    } else if (i == 4) {
		int i_1355_ = anInt9588 - anInt9587;
		for (int i_1356_ = 0; i_1356_ < anInt9549; i_1356_++)
		    anIntArray9551[i_1356_]
			= (anIntArray9551[i_1356_]
			   + (class161_1339_.method2588((anIntArray9550
							 [i_1356_]) + i_1340_,
							(anIntArray9541
							 [i_1356_]) + i_1342_,
							-1364616599)
			      - i_1341_)
			   + i_1355_);
	    } else if (i == 5) {
		int i_1357_ = anInt9588 - anInt9587;
		for (int i_1358_ = 0; i_1358_ < anInt9549; i_1358_++) {
		    int i_1359_ = anIntArray9550[i_1358_] + i_1340_;
		    int i_1360_ = anIntArray9541[i_1358_] + i_1342_;
		    int i_1361_
			= class161.method2588(i_1359_, i_1360_, -1689123534);
		    int i_1362_ = class161_1339_.method2588(i_1359_, i_1360_,
							    153368440);
		    int i_1363_ = i_1361_ - i_1362_ - i_1338_;
		    anIntArray9551[i_1358_]
			= ((anIntArray9551[i_1358_] << 8) / i_1357_ * i_1363_
			   >> 8) - (i_1341_ - i_1361_);
		}
	    }
	    method15326();
	    aBool9586 = false;
	}
    }
    
    public void method3029(int i, int i_1364_, Class161 class161,
			   Class161 class161_1365_, int i_1366_, int i_1367_,
			   int i_1368_) {
	if (!aBool9586)
	    method15278();
	int i_1369_ = i_1366_ + anInt9589;
	int i_1370_ = i_1366_ + anInt9590;
	int i_1371_ = i_1368_ + anInt9591;
	int i_1372_ = i_1368_ + anInt9592;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1369_ >= 0
		&& ((i_1370_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1759 * 363736815)
		&& i_1371_ >= 0
		&& ((i_1372_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1760 * -1152334393))) {
	    if (i == 4 || i == 5) {
		if (class161_1365_ == null
		    || (i_1369_ < 0
			|| ((i_1370_ + class161_1365_.anInt1761 * 435863595
			     >> class161_1365_.anInt1763 * -2063427645)
			    >= class161_1365_.anInt1759 * 363736815)
			|| i_1371_ < 0
			|| ((i_1372_ + class161_1365_.anInt1761 * 435863595
			     >> class161_1365_.anInt1763 * -2063427645)
			    >= class161_1365_.anInt1760 * -1152334393)))
		    return;
	    } else {
		i_1369_ >>= class161.anInt1763 * -2063427645;
		i_1370_ = (i_1370_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		i_1371_ >>= class161.anInt1763 * -2063427645;
		i_1372_ = (i_1372_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		if (class161.method2577(i_1369_, i_1371_, (byte) 28) == i_1367_
		    && (class161.method2577(i_1370_, i_1371_, (byte) -42)
			== i_1367_)
		    && (class161.method2577(i_1369_, i_1372_, (byte) -10)
			== i_1367_)
		    && (class161.method2577(i_1370_, i_1372_, (byte) -60)
			== i_1367_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1373_ = 0; i_1373_ < anInt9549; i_1373_++)
		    anIntArray9551[i_1373_]
			= (anIntArray9551[i_1373_]
			   + class161.method2588((anIntArray9550[i_1373_]
						  + i_1366_),
						 (anIntArray9541[i_1373_]
						  + i_1368_),
						 -1688545076)
			   - i_1367_);
	    } else if (i == 2) {
		int i_1374_ = anInt9587;
		if (i_1374_ == 0)
		    return;
		for (int i_1375_ = 0; i_1375_ < anInt9549; i_1375_++) {
		    int i_1376_ = (anIntArray9551[i_1375_] << 16) / i_1374_;
		    if (i_1376_ < i_1364_)
			anIntArray9551[i_1375_]
			    = (anIntArray9551[i_1375_]
			       + (class161.method2588((anIntArray9550[i_1375_]
						       + i_1366_),
						      (anIntArray9541[i_1375_]
						       + i_1368_),
						      355153124)
				  - i_1367_) * (i_1364_ - i_1376_) / i_1364_);
		}
	    } else if (i == 3) {
		int i_1377_ = (i_1364_ & 0xff) * 16;
		int i_1378_ = (i_1364_ >> 8 & 0xff) * 16;
		int i_1379_ = (i_1364_ >> 16 & 0xff) << 6;
		int i_1380_ = (i_1364_ >> 24 & 0xff) << 6;
		if (i_1366_ - (i_1377_ >> 1) < 0
		    || ((i_1366_ + (i_1377_ >> 1)
			 + class161.anInt1761 * 435863595)
			>= (class161.anInt1759 * 363736815
			    << class161.anInt1763 * -2063427645))
		    || i_1368_ - (i_1378_ >> 1) < 0
		    || ((i_1368_ + (i_1378_ >> 1)
			 + class161.anInt1761 * 435863595)
			>= (class161.anInt1760 * -1152334393
			    << class161.anInt1763 * -2063427645)))
		    return;
		method2938(class161, i_1366_, i_1367_, i_1368_, i_1377_,
			   i_1378_, i_1379_, i_1380_);
	    } else if (i == 4) {
		int i_1381_ = anInt9588 - anInt9587;
		for (int i_1382_ = 0; i_1382_ < anInt9549; i_1382_++)
		    anIntArray9551[i_1382_]
			= (anIntArray9551[i_1382_]
			   + (class161_1365_.method2588((anIntArray9550
							 [i_1382_]) + i_1366_,
							(anIntArray9541
							 [i_1382_]) + i_1368_,
							-1547869021)
			      - i_1367_)
			   + i_1381_);
	    } else if (i == 5) {
		int i_1383_ = anInt9588 - anInt9587;
		for (int i_1384_ = 0; i_1384_ < anInt9549; i_1384_++) {
		    int i_1385_ = anIntArray9550[i_1384_] + i_1366_;
		    int i_1386_ = anIntArray9541[i_1384_] + i_1368_;
		    int i_1387_
			= class161.method2588(i_1385_, i_1386_, -554670489);
		    int i_1388_ = class161_1365_.method2588(i_1385_, i_1386_,
							    -2006646987);
		    int i_1389_ = i_1387_ - i_1388_ - i_1364_;
		    anIntArray9551[i_1384_]
			= ((anIntArray9551[i_1384_] << 8) / i_1383_ * i_1389_
			   >> 8) - (i_1367_ - i_1387_);
		}
	    }
	    method15326();
	    aBool9586 = false;
	}
    }
    
    public int method3075() {
	if (!aBool9586)
	    method15278();
	return anInt9587;
    }
    
    public int method3076() {
	if (!aBool9586)
	    method15278();
	return anInt9587;
    }
    
    public int method3077() {
	if (!aBool9586)
	    method15278();
	return anInt9587;
    }
    
    void method3007() {
	/* empty */
    }
    
    public void method3101(int i) {
	aShort9572 = (short) i;
	method15326();
	method15273();
    }
    
    public int method3080() {
	return aShort9572;
    }
    
    public int method3081() {
	return aShort9572;
    }
    
    public int method3082() {
	return aShort9572;
    }
    
    public void method2992() {
	if (anInt9555 > 0 && anInt9566 > 0) {
	    method15286();
	    method15295();
	    method15298();
	}
    }
    
    public void method2997(Class444 class444, int i, boolean bool) {
	if (aShortArray9548 != null) {
	    Class444 class444_1390_ = class444;
	    if (bool) {
		class444_1390_ = aClass182_Sub1_9585.aClass444_9179;
		class444_1390_.method7163(class444);
	    }
	    float[] fs = new float[3];
	    for (int i_1391_ = 0; i_1391_ < anInt9549; i_1391_++) {
		if ((i & aShortArray9548[i_1391_]) != 0) {
		    class444_1390_.method7168((float) anIntArray9550[i_1391_],
					      (float) anIntArray9551[i_1391_],
					      (float) anIntArray9541[i_1391_],
					      fs);
		    anIntArray9550[i_1391_] = (int) fs[0];
		    anIntArray9551[i_1391_] = (int) fs[1];
		    anIntArray9541[i_1391_] = (int) fs[2];
		}
	    }
	}
    }
    
    public void method2968(Class444 class444, int i, boolean bool) {
	if (aShortArray9548 != null) {
	    Class444 class444_1392_ = class444;
	    if (bool) {
		class444_1392_ = aClass182_Sub1_9585.aClass444_9179;
		class444_1392_.method7163(class444);
	    }
	    float[] fs = new float[3];
	    for (int i_1393_ = 0; i_1393_ < anInt9549; i_1393_++) {
		if ((i & aShortArray9548[i_1393_]) != 0) {
		    class444_1392_.method7168((float) anIntArray9550[i_1393_],
					      (float) anIntArray9551[i_1393_],
					      (float) anIntArray9541[i_1393_],
					      fs);
		    anIntArray9550[i_1393_] = (int) fs[0];
		    anIntArray9551[i_1393_] = (int) fs[1];
		    anIntArray9541[i_1393_] = (int) fs[2];
		}
	    }
	}
    }
    
    public void method3114(int i, int i_1394_, int i_1395_, int i_1396_) {
	for (int i_1397_ = 0; i_1397_ < anInt9595; i_1397_++) {
	    int i_1398_ = aShortArray9552[i_1397_] & 0xffff;
	    int i_1399_ = i_1398_ >> 10 & 0x3f;
	    int i_1400_ = i_1398_ >> 7 & 0x7;
	    int i_1401_ = i_1398_ & 0x7f;
	    if (i != -1)
		i_1399_ += (i - i_1399_) * i_1396_ >> 7;
	    if (i_1394_ != -1)
		i_1400_ += (i_1394_ - i_1400_) * i_1396_ >> 7;
	    if (i_1395_ != -1)
		i_1401_ += (i_1395_ - i_1401_) * i_1396_ >> 7;
	    aShortArray9552[i_1397_]
		= (short) (i_1399_ << 10 | i_1400_ << 7 | i_1401_);
	}
	if (aClass359Array9604 != null) {
	    for (int i_1402_ = 0; i_1402_ < anInt9603; i_1402_++) {
		Class359 class359 = aClass359Array9604[i_1402_];
		Class349 class349 = aClass349Array9574[i_1402_];
		class349.anInt3739
		    = (class349.anInt3739 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9552[class359.anInt3805] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15290();
    }
    
    public void method3014(int i, int i_1403_, int i_1404_, int i_1405_) {
	for (int i_1406_ = 0; i_1406_ < anInt9595; i_1406_++) {
	    int i_1407_ = aShortArray9552[i_1406_] & 0xffff;
	    int i_1408_ = i_1407_ >> 10 & 0x3f;
	    int i_1409_ = i_1407_ >> 7 & 0x7;
	    int i_1410_ = i_1407_ & 0x7f;
	    if (i != -1)
		i_1408_ += (i - i_1408_) * i_1405_ >> 7;
	    if (i_1403_ != -1)
		i_1409_ += (i_1403_ - i_1409_) * i_1405_ >> 7;
	    if (i_1404_ != -1)
		i_1410_ += (i_1404_ - i_1410_) * i_1405_ >> 7;
	    aShortArray9552[i_1406_]
		= (short) (i_1408_ << 10 | i_1409_ << 7 | i_1410_);
	}
	if (aClass359Array9604 != null) {
	    for (int i_1411_ = 0; i_1411_ < anInt9603; i_1411_++) {
		Class359 class359 = aClass359Array9604[i_1411_];
		Class349 class349 = aClass349Array9574[i_1411_];
		class349.anInt3739
		    = (class349.anInt3739 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9552[class359.anInt3805] & 0xffff])
			  & 0xffffff));
	    }
	}
	method15290();
    }
    
    short method15299(Class186 class186, int i, int i_1412_, long l,
		      int i_1413_, int i_1414_, int i_1415_, int i_1416_,
		      float f, float f_1417_) {
	int i_1418_ = anIntArray9598[i];
	int i_1419_ = anIntArray9598[i + 1];
	int i_1420_ = 0;
	for (int i_1421_ = i_1418_; i_1421_ < i_1419_; i_1421_++) {
	    if (aShortArray9599[i_1421_] == 0) {
		i_1420_ = i_1421_;
		break;
	    }
	    int i_1422_ = (aShortArray9599[i_1421_] & 0xffff) - 1;
	    if (aLongArray9607[i_1421_] == l)
		return (short) i_1422_;
	}
	aShortArray9599[i_1420_] = (short) (anInt9555 + 1);
	aLongArray9607[i_1420_] = l;
	aShortArray9545[anInt9555] = (short) i_1412_;
	aShortArray9556[anInt9555] = (short) i;
	aShortArray9617[anInt9555] = (short) i_1413_;
	aShortArray9559[anInt9555] = (short) i_1414_;
	aShortArray9560[anInt9555] = (short) i_1415_;
	aByteArray9557[anInt9555] = (byte) i_1416_;
	aFloatArray9562[anInt9555] = f;
	aFloatArray9563[anInt9555] = f_1417_;
	return (short) anInt9555++;
    }
    
    short method15300(Class186 class186, int i, int i_1423_, long l,
		      int i_1424_, int i_1425_, int i_1426_, int i_1427_,
		      float f, float f_1428_) {
	int i_1429_ = anIntArray9598[i];
	int i_1430_ = anIntArray9598[i + 1];
	int i_1431_ = 0;
	for (int i_1432_ = i_1429_; i_1432_ < i_1430_; i_1432_++) {
	    if (aShortArray9599[i_1432_] == 0) {
		i_1431_ = i_1432_;
		break;
	    }
	    int i_1433_ = (aShortArray9599[i_1432_] & 0xffff) - 1;
	    if (aLongArray9607[i_1432_] == l)
		return (short) i_1433_;
	}
	aShortArray9599[i_1431_] = (short) (anInt9555 + 1);
	aLongArray9607[i_1431_] = l;
	aShortArray9545[anInt9555] = (short) i_1423_;
	aShortArray9556[anInt9555] = (short) i;
	aShortArray9617[anInt9555] = (short) i_1424_;
	aShortArray9559[anInt9555] = (short) i_1425_;
	aShortArray9560[anInt9555] = (short) i_1426_;
	aByteArray9557[anInt9555] = (byte) i_1427_;
	aFloatArray9562[anInt9555] = f;
	aFloatArray9563[anInt9555] = f_1428_;
	return (short) anInt9555++;
    }
    
    static float[] method15301(float[] fs, int i) {
	float[] fs_1434_ = new float[i];
	System.arraycopy(fs, 0, fs_1434_, 0, i);
	return fs_1434_;
    }
    
    short method15302(Class186 class186, int i, int i_1435_, long l,
		      int i_1436_, int i_1437_, int i_1438_, int i_1439_,
		      float f, float f_1440_) {
	int i_1441_ = anIntArray9598[i];
	int i_1442_ = anIntArray9598[i + 1];
	int i_1443_ = 0;
	for (int i_1444_ = i_1441_; i_1444_ < i_1442_; i_1444_++) {
	    if (aShortArray9599[i_1444_] == 0) {
		i_1443_ = i_1444_;
		break;
	    }
	    int i_1445_ = (aShortArray9599[i_1444_] & 0xffff) - 1;
	    if (aLongArray9607[i_1444_] == l)
		return (short) i_1445_;
	}
	aShortArray9599[i_1443_] = (short) (anInt9555 + 1);
	aLongArray9607[i_1443_] = l;
	aShortArray9545[anInt9555] = (short) i_1435_;
	aShortArray9556[anInt9555] = (short) i;
	aShortArray9617[anInt9555] = (short) i_1436_;
	aShortArray9559[anInt9555] = (short) i_1437_;
	aShortArray9560[anInt9555] = (short) i_1438_;
	aByteArray9557[anInt9555] = (byte) i_1439_;
	aFloatArray9562[anInt9555] = f;
	aFloatArray9563[anInt9555] = f_1440_;
	return (short) anInt9555++;
    }
    
    static byte[] method15303(byte[] is, int i) {
	byte[] is_1446_ = new byte[i];
	System.arraycopy(is, 0, is_1446_, 0, i);
	return is_1446_;
    }
    
    static short[] method15304(short[] is, int i) {
	short[] is_1447_ = new short[i];
	System.arraycopy(is, 0, is_1447_, 0, i);
	return is_1447_;
    }
    
    static short[] method15305(short[] is, int i) {
	short[] is_1448_ = new short[i];
	System.arraycopy(is, 0, is_1448_, 0, i);
	return is_1448_;
    }
    
    void method15306(Class525_Sub16_Sub17_Sub2 class525_sub16_sub17_sub2) {
	if (anIntArray9608.length < anInt9555) {
	    anIntArray9608 = new int[anInt9555];
	    anIntArray9609 = new int[anInt9555];
	}
	for (int i = 0; i < anInt9549; i++) {
	    int i_1449_
		= (((anIntArray9550[i]
		     - (anIntArray9551[i] * aClass182_Sub1_9585.anInt9244
			>> 8))
		    >> aClass182_Sub1_9585.anInt9243)
		   - class525_sub16_sub17_sub2.anInt12203);
	    int i_1450_
		= (((anIntArray9541[i]
		     - (anIntArray9551[i] * aClass182_Sub1_9585.anInt9245
			>> 8))
		    >> aClass182_Sub1_9585.anInt9243)
		   - class525_sub16_sub17_sub2.anInt12201);
	    int i_1451_ = anIntArray9598[i];
	    int i_1452_ = anIntArray9598[i + 1];
	    for (int i_1453_ = i_1451_;
		 i_1453_ < i_1452_ && aShortArray9599[i_1453_] != 0;
		 i_1453_++) {
		int i_1454_ = (aShortArray9599[i_1453_] & 0xffff) - 1;
		anIntArray9608[i_1454_] = i_1449_;
		anIntArray9609[i_1454_] = i_1450_;
	    }
	}
	for (int i = 0; i < anInt9566; i++) {
	    if (aByteArray9568 == null || aByteArray9568[i] <= 128) {
		int i_1455_ = aShortArray9561[i] & 0xffff;
		int i_1456_ = aShortArray9570[i] & 0xffff;
		int i_1457_ = aShortArray9571[i] & 0xffff;
		int i_1458_ = anIntArray9608[i_1455_];
		int i_1459_ = anIntArray9608[i_1456_];
		int i_1460_ = anIntArray9608[i_1457_];
		int i_1461_ = anIntArray9609[i_1455_];
		int i_1462_ = anIntArray9609[i_1456_];
		int i_1463_ = anIntArray9609[i_1457_];
		if (((i_1458_ - i_1459_) * (i_1462_ - i_1463_)
		     - (i_1462_ - i_1461_) * (i_1460_ - i_1459_))
		    > 0)
		    class525_sub16_sub17_sub2.method18890(i_1461_, i_1462_,
							  i_1463_, i_1458_,
							  i_1459_, i_1460_);
	    }
	}
    }
    
    static float[] method15307(float[] fs, int i) {
	float[] fs_1464_ = new float[i];
	System.arraycopy(fs, 0, fs_1464_, 0, i);
	return fs_1464_;
    }
    
    public boolean method3032() {
	return aBool9606;
    }
    
    public int method2962() {
	if (!aBool9586)
	    method15278();
	return anInt9591;
    }
    
    public int method3049() {
	return aShort9546;
    }
    
    Class179 method15308(Class179_Sub3 class179_sub3_1465_,
			 Class179_Sub3 class179_sub3_1466_, int i,
			 boolean bool, boolean bool_1467_) {
	class179_sub3_1465_.anInt9544 = i;
	class179_sub3_1465_.anInt9558 = anInt9558;
	class179_sub3_1465_.aShort9546 = aShort9546;
	class179_sub3_1465_.aShort9572 = aShort9572;
	class179_sub3_1465_.anInt9583 = anInt9583;
	class179_sub3_1465_.anInt9549 = anInt9549;
	class179_sub3_1465_.anInt9555 = anInt9555;
	class179_sub3_1465_.anInt9595 = anInt9595;
	class179_sub3_1465_.anInt9566 = anInt9566;
	class179_sub3_1465_.anInt9603 = anInt9603;
	if ((i & 0x100) != 0)
	    class179_sub3_1465_.aBool9582 = true;
	else
	    class179_sub3_1465_.aBool9582 = aBool9582;
	class179_sub3_1465_.aBool9606 = aBool9606;
	boolean bool_1468_ = Class338.method5864(i, anInt9558);
	boolean bool_1469_ = Class338.method5865(i, anInt9558);
	boolean bool_1470_ = Class338.method5866(i, anInt9558);
	boolean bool_1471_ = bool_1468_ | bool_1469_ | bool_1470_;
	if (bool_1471_) {
	    if (bool_1468_) {
		if (class179_sub3_1466_.anIntArray9550 == null
		    || class179_sub3_1466_.anIntArray9550.length < anInt9583)
		    class179_sub3_1465_.anIntArray9550
			= class179_sub3_1466_.anIntArray9550
			= new int[anInt9583];
		else
		    class179_sub3_1465_.anIntArray9550
			= class179_sub3_1466_.anIntArray9550;
	    } else
		class179_sub3_1465_.anIntArray9550 = anIntArray9550;
	    if (bool_1469_) {
		if (class179_sub3_1466_.anIntArray9551 == null
		    || class179_sub3_1466_.anIntArray9551.length < anInt9583)
		    class179_sub3_1465_.anIntArray9551
			= class179_sub3_1466_.anIntArray9551
			= new int[anInt9583];
		else
		    class179_sub3_1465_.anIntArray9551
			= class179_sub3_1466_.anIntArray9551;
	    } else
		class179_sub3_1465_.anIntArray9551 = anIntArray9551;
	    if (bool_1470_) {
		if (class179_sub3_1466_.anIntArray9541 == null
		    || class179_sub3_1466_.anIntArray9541.length < anInt9583)
		    class179_sub3_1465_.anIntArray9541
			= class179_sub3_1466_.anIntArray9541
			= new int[anInt9583];
		else
		    class179_sub3_1465_.anIntArray9541
			= class179_sub3_1466_.anIntArray9541;
	    } else
		class179_sub3_1465_.anIntArray9541 = anIntArray9541;
	    for (int i_1472_ = 0; i_1472_ < anInt9583; i_1472_++) {
		if (bool_1468_)
		    class179_sub3_1465_.anIntArray9550[i_1472_]
			= anIntArray9550[i_1472_];
		if (bool_1469_)
		    class179_sub3_1465_.anIntArray9551[i_1472_]
			= anIntArray9551[i_1472_];
		if (bool_1470_)
		    class179_sub3_1465_.anIntArray9541[i_1472_]
			= anIntArray9541[i_1472_];
	    }
	} else {
	    class179_sub3_1465_.anIntArray9550 = anIntArray9550;
	    class179_sub3_1465_.anIntArray9551 = anIntArray9551;
	    class179_sub3_1465_.anIntArray9541 = anIntArray9541;
	}
	if (Class338.method5881(i, anInt9558)) {
	    class179_sub3_1465_.aClass363_9616
		= class179_sub3_1466_.aClass363_9616;
	    class179_sub3_1465_.aClass363_9616.anInterface35_3834
		= aClass363_9616.anInterface35_3834;
	    class179_sub3_1465_.aClass363_9616.aBool3835
		= aClass363_9616.aBool3835;
	    class179_sub3_1465_.aClass363_9616.aBool3836 = true;
	} else if (Class338.method5876(i, anInt9558))
	    class179_sub3_1465_.aClass363_9616 = aClass363_9616;
	else
	    class179_sub3_1465_.aClass363_9616 = null;
	if (Class338.method5869(i, anInt9558)) {
	    if (class179_sub3_1466_.aShortArray9552 == null
		|| class179_sub3_1466_.aShortArray9552.length < anInt9595)
		class179_sub3_1465_.aShortArray9552
		    = class179_sub3_1466_.aShortArray9552
		    = new short[anInt9595];
	    else
		class179_sub3_1465_.aShortArray9552
		    = class179_sub3_1466_.aShortArray9552;
	    for (int i_1473_ = 0; i_1473_ < anInt9595; i_1473_++)
		class179_sub3_1465_.aShortArray9552[i_1473_]
		    = aShortArray9552[i_1473_];
	} else
	    class179_sub3_1465_.aShortArray9552 = aShortArray9552;
	if (Class338.method5957(i, anInt9558)) {
	    if (class179_sub3_1466_.aByteArray9568 == null
		|| class179_sub3_1466_.aByteArray9568.length < anInt9595)
		class179_sub3_1465_.aByteArray9568
		    = class179_sub3_1466_.aByteArray9568 = new byte[anInt9595];
	    else
		class179_sub3_1465_.aByteArray9568
		    = class179_sub3_1466_.aByteArray9568;
	    for (int i_1474_ = 0; i_1474_ < anInt9595; i_1474_++)
		class179_sub3_1465_.aByteArray9568[i_1474_]
		    = aByteArray9568[i_1474_];
	} else
	    class179_sub3_1465_.aByteArray9568 = aByteArray9568;
	if (Class338.method5883(i, anInt9558)) {
	    class179_sub3_1465_.aClass363_9577
		= class179_sub3_1466_.aClass363_9577;
	    class179_sub3_1465_.aClass363_9577.anInterface35_3834
		= aClass363_9577.anInterface35_3834;
	    class179_sub3_1465_.aClass363_9577.aBool3835
		= aClass363_9577.aBool3835;
	    class179_sub3_1465_.aClass363_9577.aBool3836 = true;
	} else if (Class338.method5878(i, anInt9558))
	    class179_sub3_1465_.aClass363_9577 = aClass363_9577;
	else
	    class179_sub3_1465_.aClass363_9577 = null;
	if (Class338.method5868(i, anInt9558)) {
	    if (class179_sub3_1466_.aShortArray9617 == null
		|| class179_sub3_1466_.aShortArray9617.length < anInt9555) {
		int i_1475_ = anInt9555;
		class179_sub3_1465_.aShortArray9617
		    = class179_sub3_1466_.aShortArray9617 = new short[i_1475_];
		class179_sub3_1465_.aShortArray9559
		    = class179_sub3_1466_.aShortArray9559 = new short[i_1475_];
		class179_sub3_1465_.aShortArray9560
		    = class179_sub3_1466_.aShortArray9560 = new short[i_1475_];
	    } else {
		class179_sub3_1465_.aShortArray9617
		    = class179_sub3_1466_.aShortArray9617;
		class179_sub3_1465_.aShortArray9559
		    = class179_sub3_1466_.aShortArray9559;
		class179_sub3_1465_.aShortArray9560
		    = class179_sub3_1466_.aShortArray9560;
	    }
	    if (aClass366_9564 != null) {
		if (class179_sub3_1466_.aClass366_9564 == null)
		    class179_sub3_1466_.aClass366_9564 = new Class366();
		Class366 class366 = (class179_sub3_1465_.aClass366_9564
				     = class179_sub3_1466_.aClass366_9564);
		if (class366.aShortArray3857 == null
		    || class366.aShortArray3857.length < anInt9555) {
		    int i_1476_ = anInt9555;
		    class366.aShortArray3857 = new short[i_1476_];
		    class366.aShortArray3856 = new short[i_1476_];
		    class366.aShortArray3858 = new short[i_1476_];
		    class366.aByteArray3855 = new byte[i_1476_];
		}
		for (int i_1477_ = 0; i_1477_ < anInt9555; i_1477_++) {
		    class179_sub3_1465_.aShortArray9617[i_1477_]
			= aShortArray9617[i_1477_];
		    class179_sub3_1465_.aShortArray9559[i_1477_]
			= aShortArray9559[i_1477_];
		    class179_sub3_1465_.aShortArray9560[i_1477_]
			= aShortArray9560[i_1477_];
		    class366.aShortArray3857[i_1477_]
			= aClass366_9564.aShortArray3857[i_1477_];
		    class366.aShortArray3856[i_1477_]
			= aClass366_9564.aShortArray3856[i_1477_];
		    class366.aShortArray3858[i_1477_]
			= aClass366_9564.aShortArray3858[i_1477_];
		    class366.aByteArray3855[i_1477_]
			= aClass366_9564.aByteArray3855[i_1477_];
		}
	    } else {
		class179_sub3_1465_.aClass366_9564 = null;
		for (int i_1478_ = 0; i_1478_ < anInt9555; i_1478_++) {
		    class179_sub3_1465_.aShortArray9617[i_1478_]
			= aShortArray9617[i_1478_];
		    class179_sub3_1465_.aShortArray9559[i_1478_]
			= aShortArray9559[i_1478_];
		    class179_sub3_1465_.aShortArray9560[i_1478_]
			= aShortArray9560[i_1478_];
		}
	    }
	    class179_sub3_1465_.aByteArray9557 = aByteArray9557;
	} else {
	    class179_sub3_1465_.aClass366_9564 = aClass366_9564;
	    class179_sub3_1465_.aShortArray9617 = aShortArray9617;
	    class179_sub3_1465_.aShortArray9559 = aShortArray9559;
	    class179_sub3_1465_.aShortArray9560 = aShortArray9560;
	    class179_sub3_1465_.aByteArray9557 = aByteArray9557;
	}
	if (Class338.method5882(i, anInt9558)) {
	    class179_sub3_1465_.aClass363_9578
		= class179_sub3_1466_.aClass363_9578;
	    class179_sub3_1465_.aClass363_9578.anInterface35_3834
		= aClass363_9578.anInterface35_3834;
	    class179_sub3_1465_.aClass363_9578.aBool3835
		= aClass363_9578.aBool3835;
	    class179_sub3_1465_.aClass363_9578.aBool3836 = true;
	} else if (Class338.method5903(i, anInt9558))
	    class179_sub3_1465_.aClass363_9578 = aClass363_9578;
	else
	    class179_sub3_1465_.aClass363_9578 = null;
	if (Class338.method5871(i, anInt9558)) {
	    if (class179_sub3_1466_.aFloatArray9562 == null
		|| class179_sub3_1466_.aFloatArray9562.length < anInt9595) {
		int i_1479_ = anInt9555;
		class179_sub3_1465_.aFloatArray9562
		    = class179_sub3_1466_.aFloatArray9562 = new float[i_1479_];
		class179_sub3_1465_.aFloatArray9563
		    = class179_sub3_1466_.aFloatArray9563 = new float[i_1479_];
	    } else {
		class179_sub3_1465_.aFloatArray9562
		    = class179_sub3_1466_.aFloatArray9562;
		class179_sub3_1465_.aFloatArray9563
		    = class179_sub3_1466_.aFloatArray9563;
	    }
	    for (int i_1480_ = 0; i_1480_ < anInt9555; i_1480_++) {
		class179_sub3_1465_.aFloatArray9562[i_1480_]
		    = aFloatArray9562[i_1480_];
		class179_sub3_1465_.aFloatArray9563[i_1480_]
		    = aFloatArray9563[i_1480_];
	    }
	} else {
	    class179_sub3_1465_.aFloatArray9562 = aFloatArray9562;
	    class179_sub3_1465_.aFloatArray9563 = aFloatArray9563;
	}
	if (Class338.method5934(i, anInt9558)) {
	    class179_sub3_1465_.aClass363_9579
		= class179_sub3_1466_.aClass363_9579;
	    class179_sub3_1465_.aClass363_9579.anInterface35_3834
		= aClass363_9579.anInterface35_3834;
	    class179_sub3_1465_.aClass363_9579.aBool3835
		= aClass363_9579.aBool3835;
	    class179_sub3_1465_.aClass363_9579.aBool3836 = true;
	} else if (Class338.method5898(i, anInt9558))
	    class179_sub3_1465_.aClass363_9579 = aClass363_9579;
	else
	    class179_sub3_1465_.aClass363_9579 = null;
	if (Class338.method5872(i, anInt9558)) {
	    if (class179_sub3_1466_.aShortArray9561 == null
		|| class179_sub3_1466_.aShortArray9561.length < anInt9595) {
		int i_1481_ = anInt9595;
		class179_sub3_1465_.aShortArray9561
		    = class179_sub3_1466_.aShortArray9561 = new short[i_1481_];
		class179_sub3_1465_.aShortArray9570
		    = class179_sub3_1466_.aShortArray9570 = new short[i_1481_];
		class179_sub3_1465_.aShortArray9571
		    = class179_sub3_1466_.aShortArray9571 = new short[i_1481_];
	    } else {
		class179_sub3_1465_.aShortArray9561
		    = class179_sub3_1466_.aShortArray9561;
		class179_sub3_1465_.aShortArray9570
		    = class179_sub3_1466_.aShortArray9570;
		class179_sub3_1465_.aShortArray9571
		    = class179_sub3_1466_.aShortArray9571;
	    }
	    for (int i_1482_ = 0; i_1482_ < anInt9595; i_1482_++) {
		class179_sub3_1465_.aShortArray9561[i_1482_]
		    = aShortArray9561[i_1482_];
		class179_sub3_1465_.aShortArray9570[i_1482_]
		    = aShortArray9570[i_1482_];
		class179_sub3_1465_.aShortArray9571[i_1482_]
		    = aShortArray9571[i_1482_];
	    }
	} else {
	    class179_sub3_1465_.aShortArray9561 = aShortArray9561;
	    class179_sub3_1465_.aShortArray9570 = aShortArray9570;
	    class179_sub3_1465_.aShortArray9571 = aShortArray9571;
	}
	if (Class338.method5885(i, anInt9558)) {
	    class179_sub3_1465_.aClass354_9575
		= class179_sub3_1466_.aClass354_9575;
	    class179_sub3_1465_.aClass354_9575.anInterface44_3786
		= aClass354_9575.anInterface44_3786;
	    class179_sub3_1465_.aClass354_9575.aBool3787
		= aClass354_9575.aBool3787;
	    class179_sub3_1465_.aClass354_9575.aBool3788 = true;
	} else if (Class338.method5880(i, anInt9558))
	    class179_sub3_1465_.aClass354_9575 = aClass354_9575;
	else
	    class179_sub3_1465_.aClass354_9575 = null;
	if (Class338.method5948(i, anInt9558)) {
	    if (class179_sub3_1466_.aShortArray9605 == null
		|| class179_sub3_1466_.aShortArray9605.length < anInt9595) {
		int i_1483_ = anInt9595;
		class179_sub3_1465_.aShortArray9605
		    = class179_sub3_1466_.aShortArray9605 = new short[i_1483_];
	    } else
		class179_sub3_1465_.aShortArray9605
		    = class179_sub3_1466_.aShortArray9605;
	    for (int i_1484_ = 0; i_1484_ < anInt9595; i_1484_++)
		class179_sub3_1465_.aShortArray9605[i_1484_]
		    = aShortArray9605[i_1484_];
	} else
	    class179_sub3_1465_.aShortArray9605 = aShortArray9605;
	if (Class338.method5874(i, anInt9558)) {
	    if (class179_sub3_1466_.aClass349Array9574 == null
		|| class179_sub3_1466_.aClass349Array9574.length < anInt9603) {
		int i_1485_ = anInt9603;
		class179_sub3_1465_.aClass349Array9574
		    = class179_sub3_1466_.aClass349Array9574
		    = new Class349[i_1485_];
		for (int i_1486_ = 0; i_1486_ < anInt9603; i_1486_++)
		    class179_sub3_1465_.aClass349Array9574[i_1486_]
			= aClass349Array9574[i_1486_].method6120();
	    } else {
		class179_sub3_1465_.aClass349Array9574
		    = class179_sub3_1466_.aClass349Array9574;
		for (int i_1487_ = 0; i_1487_ < anInt9603; i_1487_++)
		    class179_sub3_1465_.aClass349Array9574[i_1487_]
			.method6121(aClass349Array9574[i_1487_]);
	    }
	} else
	    class179_sub3_1465_.aClass349Array9574 = aClass349Array9574;
	class179_sub3_1465_.aClass359Array9604 = aClass359Array9604;
	if (aBool9586) {
	    class179_sub3_1465_.anInt9584 = anInt9584;
	    class179_sub3_1465_.anInt9602 = anInt9602;
	    class179_sub3_1465_.anInt9589 = anInt9589;
	    class179_sub3_1465_.anInt9590 = anInt9590;
	    class179_sub3_1465_.anInt9587 = anInt9587;
	    class179_sub3_1465_.anInt9588 = anInt9588;
	    class179_sub3_1465_.anInt9591 = anInt9591;
	    class179_sub3_1465_.anInt9592 = anInt9592;
	    class179_sub3_1465_.aBool9586 = true;
	} else
	    class179_sub3_1465_.aBool9586 = false;
	if (aBool9593) {
	    class179_sub3_1465_.anInt9594 = anInt9594;
	    class179_sub3_1465_.aBool9593 = true;
	} else
	    class179_sub3_1465_.aBool9593 = false;
	class179_sub3_1465_.anIntArrayArray9553 = anIntArrayArray9553;
	class179_sub3_1465_.anIntArrayArray9573 = anIntArrayArray9573;
	class179_sub3_1465_.anIntArrayArray9543 = anIntArrayArray9543;
	class179_sub3_1465_.aShortArray9599 = aShortArray9599;
	class179_sub3_1465_.anIntArray9598 = anIntArray9598;
	class179_sub3_1465_.aShortArray9556 = aShortArray9556;
	class179_sub3_1465_.aShortArray9545 = aShortArray9545;
	class179_sub3_1465_.aShortArray9548 = aShortArray9548;
	class179_sub3_1465_.aShortArray9615 = aShortArray9615;
	class179_sub3_1465_.anIntArray9567 = anIntArray9567;
	class179_sub3_1465_.anIntArray9597 = anIntArray9597;
	class179_sub3_1465_.anIntArray9596 = anIntArray9596;
	class179_sub3_1465_.aClass184Array9600 = aClass184Array9600;
	class179_sub3_1465_.aClass154Array9601 = aClass154Array9601;
	return class179_sub3_1465_;
    }
    
    void method15309() {
	if (aBool9581) {
	    aBool9581 = false;
	    if (aClass184Array9600 == null && aClass154Array9601 == null
		&& aClass359Array9604 == null
		&& !Class338.method5867(anInt9544, anInt9558)) {
		boolean bool = false;
		boolean bool_1488_ = false;
		boolean bool_1489_ = false;
		if (anIntArray9550 != null
		    && !Class338.method5920(anInt9544, anInt9558)) {
		    if (aClass363_9616 == null
			|| aClass363_9616.method6313()) {
			if (!aBool9586)
			    method15278();
			bool = true;
		    } else
			aBool9581 = true;
		}
		if (anIntArray9551 != null
		    && !Class338.method5935(anInt9544, anInt9558)) {
		    if (aClass363_9616 == null
			|| aClass363_9616.method6313()) {
			if (!aBool9586)
			    method15278();
			bool_1488_ = true;
		    } else
			aBool9581 = true;
		}
		if (anIntArray9541 != null
		    && !Class338.method5888(anInt9544, anInt9558)) {
		    if (aClass363_9616 == null
			|| aClass363_9616.method6313()) {
			if (!aBool9586)
			    method15278();
			bool_1489_ = true;
		    } else
			aBool9581 = true;
		}
		if (bool)
		    anIntArray9550 = null;
		if (bool_1488_)
		    anIntArray9551 = null;
		if (bool_1489_)
		    anIntArray9541 = null;
	    }
	    if (aShortArray9599 != null && anIntArray9550 == null
		&& anIntArray9551 == null && anIntArray9541 == null) {
		aShortArray9599 = null;
		anIntArray9598 = null;
	    }
	while_141_:
	    do {
		if (aByteArray9557 != null
		    && !Class338.method5889(anInt9544, anInt9558)) {
		    do {
			if ((anInt9558 & 0x37) != 0) {
			    if (aClass363_9578 != null
				&& !aClass363_9578.method6313())
				break;
			} else if (aClass363_9577 != null
				   && !aClass363_9577.method6313())
			    break;
			aShortArray9560 = null;
			aShortArray9559 = null;
			aShortArray9617 = null;
			aByteArray9557 = null;
			break while_141_;
		    } while (false);
		    aBool9581 = true;
		}
	    } while (false);
	    if (aShortArray9552 != null
		&& !Class338.method5877(anInt9544, anInt9558)) {
		if (aClass363_9577 == null || aClass363_9577.method6313())
		    aShortArray9552 = null;
		else
		    aBool9581 = true;
	    }
	    if (aByteArray9568 != null
		&& !Class338.method5891(anInt9544, anInt9558)) {
		if (aClass363_9577 == null || aClass363_9577.method6313())
		    aByteArray9568 = null;
		else
		    aBool9581 = true;
	    }
	    if (aFloatArray9562 != null
		&& !Class338.method5894(anInt9544, anInt9558)) {
		if (aClass363_9579 == null || aClass363_9579.method6313()) {
		    aFloatArray9563 = null;
		    aFloatArray9562 = null;
		} else
		    aBool9581 = true;
	    }
	    if (aShortArray9605 != null
		&& !Class338.method5897(anInt9544, anInt9558)) {
		if (aClass363_9577 == null || aClass363_9577.method6313())
		    aShortArray9605 = null;
		else
		    aBool9581 = true;
	    }
	    if (aShortArray9561 != null
		&& !Class338.method5896(anInt9544, anInt9558)) {
		if ((aClass354_9575 == null || aClass354_9575.method6260())
		    && (aClass363_9577 == null
			|| aClass363_9577.method6313())) {
		    aShortArray9571 = null;
		    aShortArray9570 = null;
		    aShortArray9561 = null;
		} else
		    aBool9581 = true;
	    }
	    if (aShortArray9556 != null) {
		if (aClass363_9616 == null || aClass363_9616.method6313())
		    aShortArray9556 = null;
		else
		    aBool9581 = true;
	    }
	    if (aShortArray9545 != null) {
		if (aClass363_9577 == null || aClass363_9577.method6313())
		    aShortArray9545 = null;
		else
		    aBool9581 = true;
	    }
	    if (anIntArrayArray9573 != null
		&& !Class338.method5895(anInt9544, anInt9558)) {
		anIntArrayArray9573 = null;
		aShortArray9615 = null;
	    }
	    if (anIntArrayArray9553 != null
		&& !Class338.method5971(anInt9544, anInt9558)) {
		anIntArrayArray9553 = null;
		aShortArray9548 = null;
	    }
	    if (anIntArrayArray9543 != null
		&& !Class338.method5912(anInt9544, anInt9558))
		anIntArrayArray9543 = null;
	    if (anIntArray9567 != null && (anInt9544 & 0x800) == 0
		&& (anInt9544 & 0x40000) == 0) {
		anIntArray9567 = null;
		anIntArray9597 = null;
		anIntArray9596 = null;
	    }
	}
    }
    
    void method15310() {
	if (aClass363_9616 != null)
	    aClass363_9616.aBool3835 = false;
    }
    
    void method15311() {
	if (aClass363_9616 != null)
	    aClass363_9616.aBool3835 = false;
    }
    
    void method15312() {
	if ((anInt9558 & 0x37) != 0) {
	    if (aClass363_9578 != null)
		aClass363_9578.aBool3835 = false;
	} else if (aClass363_9577 != null)
	    aClass363_9577.aBool3835 = false;
    }
    
    public int method3001() {
	if (!aBool9586)
	    method15278();
	return anInt9589;
    }
    
    boolean method15313() {
	if (aClass354_9575.aBool3787)
	    return true;
	if (aClass354_9575.anInterface44_3785 == null)
	    aClass354_9575.anInterface44_3785
		= aClass182_Sub1_9585.method14701(false);
	Interface44 interface44 = aClass354_9575.anInterface44_3785;
	interface44.method29(anInt9566 * 6);
	Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	if (unsafe != null) {
	    int i = anInt9566 * 6;
	    long l = interface44.method219(0, i);
	    if (l == 0L)
		return false;
	    for (int i_1490_ = 0; i_1490_ < anInt9566; i_1490_++) {
		unsafe.putShort(l, aShortArray9561[i_1490_]);
		l += 2L;
		unsafe.putShort(l, aShortArray9570[i_1490_]);
		l += 2L;
		unsafe.putShort(l, aShortArray9571[i_1490_]);
		l += 2L;
	    }
	    interface44.method220();
	    aClass354_9575.anInterface44_3786 = interface44;
	    aClass354_9575.aBool3787 = true;
	    aBool9581 = true;
	    return true;
	}
	ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
	bytebuffer.clear();
	for (int i = 0; i < anInt9566; i++) {
	    bytebuffer.putShort(aShortArray9561[i]);
	    bytebuffer.putShort(aShortArray9570[i]);
	    bytebuffer.putShort(aShortArray9571[i]);
	}
	if (interface44.method215(0, bytebuffer.position(),
				  aClass182_Sub1_9585.aLong9160)) {
	    aClass354_9575.anInterface44_3786 = interface44;
	    aClass354_9575.aBool3787 = true;
	    aBool9581 = true;
	    return true;
	}
	return false;
    }
    
    void method15314() {
	if (aClass354_9575 != null)
	    aClass354_9575.aBool3787 = false;
    }
    
    void method2940() {
	/* empty */
    }
    
    public int method3053() {
	if (!aBool9586)
	    method15278();
	return anInt9590;
    }
    
    boolean method15315(int i, int i_1491_, int i_1492_, int i_1493_,
			Class444 class444, boolean bool, int i_1494_) {
	Class435 class435 = aClass182_Sub1_9585.aClass435_9180;
	class435.method7040(class444);
	class435.method6950(aClass182_Sub1_9585.aClass435_9150);
	boolean bool_1495_ = false;
	float f = 3.4028235E38F;
	float f_1496_ = -3.4028235E38F;
	float f_1497_ = 3.4028235E38F;
	float f_1498_ = -3.4028235E38F;
	if (!aBool9586)
	    method15278();
	int i_1499_ = anInt9590 - anInt9589 >> 1;
	int i_1500_ = anInt9588 - anInt9587 >> 1;
	int i_1501_ = anInt9592 - anInt9591 >> 1;
	int i_1502_ = anInt9589 + i_1499_;
	int i_1503_ = anInt9587 + i_1500_;
	int i_1504_ = anInt9591 + i_1501_;
	int i_1505_ = i_1502_ - (i_1499_ << i_1494_);
	int i_1506_ = i_1503_ - (i_1500_ << i_1494_);
	int i_1507_ = i_1504_ - (i_1501_ << i_1494_);
	int i_1508_ = i_1502_ + (i_1499_ << i_1494_);
	int i_1509_ = i_1503_ + (i_1500_ << i_1494_);
	int i_1510_ = i_1504_ + (i_1501_ << i_1494_);
	anIntArray9610[0] = i_1505_;
	anIntArray9611[0] = i_1506_;
	anIntArray9612[0] = i_1507_;
	anIntArray9610[1] = i_1508_;
	anIntArray9611[1] = i_1506_;
	anIntArray9612[1] = i_1507_;
	anIntArray9610[2] = i_1505_;
	anIntArray9611[2] = i_1509_;
	anIntArray9612[2] = i_1507_;
	anIntArray9610[3] = i_1508_;
	anIntArray9611[3] = i_1509_;
	anIntArray9612[3] = i_1507_;
	anIntArray9610[4] = i_1505_;
	anIntArray9611[4] = i_1506_;
	anIntArray9612[4] = i_1510_;
	anIntArray9610[5] = i_1508_;
	anIntArray9611[5] = i_1506_;
	anIntArray9612[5] = i_1510_;
	anIntArray9610[6] = i_1505_;
	anIntArray9611[6] = i_1509_;
	anIntArray9612[6] = i_1510_;
	anIntArray9610[7] = i_1508_;
	anIntArray9611[7] = i_1509_;
	anIntArray9612[7] = i_1510_;
	for (int i_1511_ = 0; i_1511_ < 8; i_1511_++) {
	    float f_1512_ = (float) anIntArray9610[i_1511_];
	    float f_1513_ = (float) anIntArray9611[i_1511_];
	    float f_1514_ = (float) anIntArray9612[i_1511_];
	    float f_1515_ = (class435.aFloatArray4830[2] * f_1512_
			     + class435.aFloatArray4830[6] * f_1513_
			     + class435.aFloatArray4830[10] * f_1514_
			     + class435.aFloatArray4830[14]);
	    float f_1516_ = (class435.aFloatArray4830[3] * f_1512_
			     + class435.aFloatArray4830[7] * f_1513_
			     + class435.aFloatArray4830[11] * f_1514_
			     + class435.aFloatArray4830[15]);
	    if (f_1515_ >= -f_1516_) {
		float f_1517_ = (class435.aFloatArray4830[0] * f_1512_
				 + class435.aFloatArray4830[4] * f_1513_
				 + class435.aFloatArray4830[8] * f_1514_
				 + class435.aFloatArray4830[12]);
		float f_1518_ = (class435.aFloatArray4830[1] * f_1512_
				 + class435.aFloatArray4830[5] * f_1513_
				 + class435.aFloatArray4830[9] * f_1514_
				 + class435.aFloatArray4830[13]);
		float f_1519_
		    = (aClass182_Sub1_9585.aFloat9314
		       + aClass182_Sub1_9585.aFloat9198 * f_1517_ / f_1516_);
		float f_1520_
		    = (aClass182_Sub1_9585.aFloat9199
		       + aClass182_Sub1_9585.aFloat9200 * f_1518_ / f_1516_);
		if (f_1519_ < f)
		    f = f_1519_;
		if (f_1519_ > f_1496_)
		    f_1496_ = f_1519_;
		if (f_1520_ < f_1497_)
		    f_1497_ = f_1520_;
		if (f_1520_ > f_1498_)
		    f_1498_ = f_1520_;
		bool_1495_ = true;
	    }
	}
	int i_1521_ = i + i_1492_;
	int i_1522_ = i_1491_ + i_1493_;
	if (bool_1495_ && (float) i_1521_ > f && (float) i < f_1496_
	    && (float) i_1522_ > f_1497_ && (float) i_1491_ < f_1498_) {
	    if (bool)
		return true;
	    if (anIntArray9608.length < anInt9555) {
		anIntArray9608 = new int[anInt9555];
		anIntArray9609 = new int[anInt9555];
	    }
	    for (int i_1523_ = 0; i_1523_ < anInt9549; i_1523_++) {
		float f_1524_ = (float) anIntArray9550[i_1523_];
		float f_1525_ = (float) anIntArray9551[i_1523_];
		float f_1526_ = (float) anIntArray9541[i_1523_];
		float f_1527_ = (class435.aFloatArray4830[2] * f_1524_
				 + class435.aFloatArray4830[6] * f_1525_
				 + class435.aFloatArray4830[10] * f_1526_
				 + class435.aFloatArray4830[14]);
		float f_1528_ = (class435.aFloatArray4830[3] * f_1524_
				 + class435.aFloatArray4830[7] * f_1525_
				 + class435.aFloatArray4830[11] * f_1526_
				 + class435.aFloatArray4830[15]);
		if (f_1527_ >= -f_1528_) {
		    float f_1529_ = (class435.aFloatArray4830[0] * f_1524_
				     + class435.aFloatArray4830[4] * f_1525_
				     + class435.aFloatArray4830[8] * f_1526_
				     + class435.aFloatArray4830[12]);
		    float f_1530_ = (class435.aFloatArray4830[1] * f_1524_
				     + class435.aFloatArray4830[5] * f_1525_
				     + class435.aFloatArray4830[9] * f_1526_
				     + class435.aFloatArray4830[13]);
		    int i_1531_ = anIntArray9598[i_1523_];
		    int i_1532_ = anIntArray9598[i_1523_ + 1];
		    for (int i_1533_ = i_1531_;
			 i_1533_ < i_1532_ && aShortArray9599[i_1533_] != 0;
			 i_1533_++) {
			int i_1534_ = (aShortArray9599[i_1533_] & 0xffff) - 1;
			anIntArray9608[i_1534_]
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     + (aClass182_Sub1_9585.aFloat9198
					* f_1529_ / f_1528_));
			anIntArray9609[i_1534_]
			    = (int) (aClass182_Sub1_9585.aFloat9199
				     + (aClass182_Sub1_9585.aFloat9200
					* f_1530_ / f_1528_));
		    }
		} else {
		    int i_1535_ = anIntArray9598[i_1523_];
		    int i_1536_ = anIntArray9598[i_1523_ + 1];
		    for (int i_1537_ = i_1535_;
			 i_1537_ < i_1536_ && aShortArray9599[i_1537_] != 0;
			 i_1537_++) {
			int i_1538_ = (aShortArray9599[i_1537_] & 0xffff) - 1;
			anIntArray9608[i_1538_] = -999999;
		    }
		}
	    }
	    for (int i_1539_ = 0; i_1539_ < anInt9595; i_1539_++) {
		if ((anIntArray9608[aShortArray9561[i_1539_] & 0xffff]
		     != -999999)
		    && (anIntArray9608[aShortArray9570[i_1539_] & 0xffff]
			!= -999999)
		    && (anIntArray9608[aShortArray9571[i_1539_] & 0xffff]
			!= -999999)
		    && (method15275
			(i, i_1491_, i_1521_, i_1522_,
			 anIntArray9609[aShortArray9561[i_1539_] & 0xffff],
			 anIntArray9609[aShortArray9570[i_1539_] & 0xffff],
			 anIntArray9609[aShortArray9571[i_1539_] & 0xffff],
			 anIntArray9608[aShortArray9561[i_1539_] & 0xffff],
			 anIntArray9608[aShortArray9570[i_1539_] & 0xffff],
			 anIntArray9608[aShortArray9571[i_1539_] & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    boolean method15316(int i, int i_1540_, int i_1541_, int i_1542_,
			Class444 class444, boolean bool, int i_1543_) {
	Class435 class435 = aClass182_Sub1_9585.aClass435_9180;
	class435.method7040(class444);
	class435.method6950(aClass182_Sub1_9585.aClass435_9150);
	boolean bool_1544_ = false;
	float f = 3.4028235E38F;
	float f_1545_ = -3.4028235E38F;
	float f_1546_ = 3.4028235E38F;
	float f_1547_ = -3.4028235E38F;
	if (!aBool9586)
	    method15278();
	int i_1548_ = anInt9590 - anInt9589 >> 1;
	int i_1549_ = anInt9588 - anInt9587 >> 1;
	int i_1550_ = anInt9592 - anInt9591 >> 1;
	int i_1551_ = anInt9589 + i_1548_;
	int i_1552_ = anInt9587 + i_1549_;
	int i_1553_ = anInt9591 + i_1550_;
	int i_1554_ = i_1551_ - (i_1548_ << i_1543_);
	int i_1555_ = i_1552_ - (i_1549_ << i_1543_);
	int i_1556_ = i_1553_ - (i_1550_ << i_1543_);
	int i_1557_ = i_1551_ + (i_1548_ << i_1543_);
	int i_1558_ = i_1552_ + (i_1549_ << i_1543_);
	int i_1559_ = i_1553_ + (i_1550_ << i_1543_);
	anIntArray9610[0] = i_1554_;
	anIntArray9611[0] = i_1555_;
	anIntArray9612[0] = i_1556_;
	anIntArray9610[1] = i_1557_;
	anIntArray9611[1] = i_1555_;
	anIntArray9612[1] = i_1556_;
	anIntArray9610[2] = i_1554_;
	anIntArray9611[2] = i_1558_;
	anIntArray9612[2] = i_1556_;
	anIntArray9610[3] = i_1557_;
	anIntArray9611[3] = i_1558_;
	anIntArray9612[3] = i_1556_;
	anIntArray9610[4] = i_1554_;
	anIntArray9611[4] = i_1555_;
	anIntArray9612[4] = i_1559_;
	anIntArray9610[5] = i_1557_;
	anIntArray9611[5] = i_1555_;
	anIntArray9612[5] = i_1559_;
	anIntArray9610[6] = i_1554_;
	anIntArray9611[6] = i_1558_;
	anIntArray9612[6] = i_1559_;
	anIntArray9610[7] = i_1557_;
	anIntArray9611[7] = i_1558_;
	anIntArray9612[7] = i_1559_;
	for (int i_1560_ = 0; i_1560_ < 8; i_1560_++) {
	    float f_1561_ = (float) anIntArray9610[i_1560_];
	    float f_1562_ = (float) anIntArray9611[i_1560_];
	    float f_1563_ = (float) anIntArray9612[i_1560_];
	    float f_1564_ = (class435.aFloatArray4830[2] * f_1561_
			     + class435.aFloatArray4830[6] * f_1562_
			     + class435.aFloatArray4830[10] * f_1563_
			     + class435.aFloatArray4830[14]);
	    float f_1565_ = (class435.aFloatArray4830[3] * f_1561_
			     + class435.aFloatArray4830[7] * f_1562_
			     + class435.aFloatArray4830[11] * f_1563_
			     + class435.aFloatArray4830[15]);
	    if (f_1564_ >= -f_1565_) {
		float f_1566_ = (class435.aFloatArray4830[0] * f_1561_
				 + class435.aFloatArray4830[4] * f_1562_
				 + class435.aFloatArray4830[8] * f_1563_
				 + class435.aFloatArray4830[12]);
		float f_1567_ = (class435.aFloatArray4830[1] * f_1561_
				 + class435.aFloatArray4830[5] * f_1562_
				 + class435.aFloatArray4830[9] * f_1563_
				 + class435.aFloatArray4830[13]);
		float f_1568_
		    = (aClass182_Sub1_9585.aFloat9314
		       + aClass182_Sub1_9585.aFloat9198 * f_1566_ / f_1565_);
		float f_1569_
		    = (aClass182_Sub1_9585.aFloat9199
		       + aClass182_Sub1_9585.aFloat9200 * f_1567_ / f_1565_);
		if (f_1568_ < f)
		    f = f_1568_;
		if (f_1568_ > f_1545_)
		    f_1545_ = f_1568_;
		if (f_1569_ < f_1546_)
		    f_1546_ = f_1569_;
		if (f_1569_ > f_1547_)
		    f_1547_ = f_1569_;
		bool_1544_ = true;
	    }
	}
	int i_1570_ = i + i_1541_;
	int i_1571_ = i_1540_ + i_1542_;
	if (bool_1544_ && (float) i_1570_ > f && (float) i < f_1545_
	    && (float) i_1571_ > f_1546_ && (float) i_1540_ < f_1547_) {
	    if (bool)
		return true;
	    if (anIntArray9608.length < anInt9555) {
		anIntArray9608 = new int[anInt9555];
		anIntArray9609 = new int[anInt9555];
	    }
	    for (int i_1572_ = 0; i_1572_ < anInt9549; i_1572_++) {
		float f_1573_ = (float) anIntArray9550[i_1572_];
		float f_1574_ = (float) anIntArray9551[i_1572_];
		float f_1575_ = (float) anIntArray9541[i_1572_];
		float f_1576_ = (class435.aFloatArray4830[2] * f_1573_
				 + class435.aFloatArray4830[6] * f_1574_
				 + class435.aFloatArray4830[10] * f_1575_
				 + class435.aFloatArray4830[14]);
		float f_1577_ = (class435.aFloatArray4830[3] * f_1573_
				 + class435.aFloatArray4830[7] * f_1574_
				 + class435.aFloatArray4830[11] * f_1575_
				 + class435.aFloatArray4830[15]);
		if (f_1576_ >= -f_1577_) {
		    float f_1578_ = (class435.aFloatArray4830[0] * f_1573_
				     + class435.aFloatArray4830[4] * f_1574_
				     + class435.aFloatArray4830[8] * f_1575_
				     + class435.aFloatArray4830[12]);
		    float f_1579_ = (class435.aFloatArray4830[1] * f_1573_
				     + class435.aFloatArray4830[5] * f_1574_
				     + class435.aFloatArray4830[9] * f_1575_
				     + class435.aFloatArray4830[13]);
		    int i_1580_ = anIntArray9598[i_1572_];
		    int i_1581_ = anIntArray9598[i_1572_ + 1];
		    for (int i_1582_ = i_1580_;
			 i_1582_ < i_1581_ && aShortArray9599[i_1582_] != 0;
			 i_1582_++) {
			int i_1583_ = (aShortArray9599[i_1582_] & 0xffff) - 1;
			anIntArray9608[i_1583_]
			    = (int) (aClass182_Sub1_9585.aFloat9314
				     + (aClass182_Sub1_9585.aFloat9198
					* f_1578_ / f_1577_));
			anIntArray9609[i_1583_]
			    = (int) (aClass182_Sub1_9585.aFloat9199
				     + (aClass182_Sub1_9585.aFloat9200
					* f_1579_ / f_1577_));
		    }
		} else {
		    int i_1584_ = anIntArray9598[i_1572_];
		    int i_1585_ = anIntArray9598[i_1572_ + 1];
		    for (int i_1586_ = i_1584_;
			 i_1586_ < i_1585_ && aShortArray9599[i_1586_] != 0;
			 i_1586_++) {
			int i_1587_ = (aShortArray9599[i_1586_] & 0xffff) - 1;
			anIntArray9608[i_1587_] = -999999;
		    }
		}
	    }
	    for (int i_1588_ = 0; i_1588_ < anInt9595; i_1588_++) {
		if ((anIntArray9608[aShortArray9561[i_1588_] & 0xffff]
		     != -999999)
		    && (anIntArray9608[aShortArray9570[i_1588_] & 0xffff]
			!= -999999)
		    && (anIntArray9608[aShortArray9571[i_1588_] & 0xffff]
			!= -999999)
		    && (method15275
			(i, i_1540_, i_1570_, i_1571_,
			 anIntArray9609[aShortArray9561[i_1588_] & 0xffff],
			 anIntArray9609[aShortArray9570[i_1588_] & 0xffff],
			 anIntArray9609[aShortArray9571[i_1588_] & 0xffff],
			 anIntArray9608[aShortArray9561[i_1588_] & 0xffff],
			 anIntArray9608[aShortArray9570[i_1588_] & 0xffff],
			 anIntArray9608[aShortArray9571[i_1588_] & 0xffff])))
		    return true;
	    }
	}
	return false;
    }
    
    boolean method15317(int i, int i_1589_, int i_1590_, int i_1591_,
			int i_1592_, int i_1593_, int i_1594_, int i_1595_,
			int i_1596_, int i_1597_) {
	if (i_1591_ < i_1592_ && i_1591_ < i_1593_ && i_1591_ < i_1594_)
	    return false;
	if (i_1589_ > i_1592_ && i_1589_ > i_1593_ && i_1589_ > i_1594_)
	    return false;
	if (i_1590_ < i_1595_ && i_1590_ < i_1596_ && i_1590_ < i_1597_)
	    return false;
	if (i > i_1595_ && i > i_1596_ && i > i_1597_)
	    return false;
	return true;
    }
    
    boolean method15318(int i, int i_1598_, int i_1599_, int i_1600_,
			int i_1601_, int i_1602_, int i_1603_, int i_1604_,
			int i_1605_, int i_1606_) {
	if (i_1600_ < i_1601_ && i_1600_ < i_1602_ && i_1600_ < i_1603_)
	    return false;
	if (i_1598_ > i_1601_ && i_1598_ > i_1602_ && i_1598_ > i_1603_)
	    return false;
	if (i_1599_ < i_1604_ && i_1599_ < i_1605_ && i_1599_ < i_1606_)
	    return false;
	if (i > i_1604_ && i > i_1605_ && i > i_1606_)
	    return false;
	return true;
    }
    
    void method15319() {
	if (aClass363_9616 != null)
	    aClass363_9616.method6316();
	if (aClass363_9579 != null)
	    aClass363_9579.method6316();
	if (aClass363_9577 != null)
	    aClass363_9577.method6316();
	if (aClass363_9578 != null)
	    aClass363_9578.method6316();
	if (aClass354_9575 != null)
	    aClass354_9575.method6261();
    }
    
    short method15320(Class186 class186, int i, int i_1607_, long l,
		      int i_1608_, int i_1609_, int i_1610_, int i_1611_,
		      float f, float f_1612_) {
	int i_1613_ = anIntArray9598[i];
	int i_1614_ = anIntArray9598[i + 1];
	int i_1615_ = 0;
	for (int i_1616_ = i_1613_; i_1616_ < i_1614_; i_1616_++) {
	    if (aShortArray9599[i_1616_] == 0) {
		i_1615_ = i_1616_;
		break;
	    }
	    int i_1617_ = (aShortArray9599[i_1616_] & 0xffff) - 1;
	    if (aLongArray9607[i_1616_] == l)
		return (short) i_1617_;
	}
	aShortArray9599[i_1615_] = (short) (anInt9555 + 1);
	aLongArray9607[i_1615_] = l;
	aShortArray9545[anInt9555] = (short) i_1607_;
	aShortArray9556[anInt9555] = (short) i;
	aShortArray9617[anInt9555] = (short) i_1608_;
	aShortArray9559[anInt9555] = (short) i_1609_;
	aShortArray9560[anInt9555] = (short) i_1610_;
	aByteArray9557[anInt9555] = (byte) i_1611_;
	aFloatArray9562[anInt9555] = f;
	aFloatArray9563[anInt9555] = f_1612_;
	return (short) anInt9555++;
    }
    
    void method15321(Class444 class444) {
	if (anInt9566 != 0 && (method15286() && method15295())) {
	    if (aClass356_9547 == null) {
		/* empty */
	    }
	    aClass182_Sub1_9585.method14775();
	    aClass182_Sub1_9585.method14720();
	    Class319 class319 = aClass182_Sub1_9585.aClass319_9196;
	    aClass182_Sub1_9585.method14764(0,
					    aClass363_9616.anInterface35_3834);
	    aClass182_Sub1_9585.method14764(1,
					    aClass363_9577.anInterface35_3834);
	    aClass182_Sub1_9585.method14764(2,
					    aClass363_9579.anInterface35_3834);
	    aClass182_Sub1_9585.method14765(aClass354_9575.anInterface44_3786);
	    aClass182_Sub1_9585.aClass435_9180.method7040(class444);
	    class319.method5677(aClass182_Sub1_9585.aClass435_9180);
	    class319.aClass435_3529.method7023();
	    if (aClass182_Sub1_9585.aBool9158) {
		Class176 class176 = aClass182_Sub1_9585.method14748();
		class319.aClass437_3518.method7073
		    (0.0F, 1.0F, 0.0F, (float) -aClass182_Sub1_9585.anInt9278);
		class319.aClass437_3518.method7078(3.0F
						   / (float) ((class176
							       .anInt1879)
							      * -734182087));
		class319.aClass446_3519.method7265
		    (((float) (class176.anInt1877 * 2141545647 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (class176.anInt1877 * 2141545647 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (class176.anInt1877 * 2141545647 >> 0 & 0xff)
		      / 255.0F));
	    } else {
		class319.aClass437_3518.method7073(0.0F, 0.0F, 0.0F, 0.0F);
		class319.aClass446_3519.method7265(0.0F, 0.0F, 0.0F);
	    }
	    if (aClass182_Sub1_9585.anInt9283 > 0) {
		class319.aClass437_3520.method7073(0.0F, 0.0F, 1.0F,
						   -(aClass182_Sub1_9585
						     .aFloat9207));
		class319.aClass446_3508.method7265
		    (((float) (aClass182_Sub1_9585.anInt9282 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 0 & 0xff)
		      / 255.0F));
		aClass182_Sub1_9585.aClass435_9180.method7040(class444);
		aClass182_Sub1_9585.aClass435_9180.method6973();
		class319.aClass437_3518
		    .method7079(aClass182_Sub1_9585.aClass435_9180);
		aClass182_Sub1_9585.aClass435_9180.method7040(class444);
		aClass182_Sub1_9585.aClass435_9180
		    .method6950(aClass182_Sub1_9585.aClass435_9173);
		aClass182_Sub1_9585.aClass435_9180.method6973();
		class319.aClass437_3520
		    .method7079(aClass182_Sub1_9585.aClass435_9180);
		class319.aClass437_3520.method7078
		    (1.0F / (aClass182_Sub1_9585.aFloat9218
			     - aClass182_Sub1_9585.aFloat9207));
	    } else {
		class319.aClass437_3520.method7073(0.0F, 0.0F, 0.0F, 0.0F);
		class319.aClass446_3508.method7265(0.0F, 0.0F, 0.0F);
	    }
	    if ((anInt9558 & 0x37) == 0) {
		aClass182_Sub1_9585
		    .method14763(aClass182_Sub1_9585.aClass337_9276);
		if (aClass182_Sub1_9585.aBool9156)
		    aClass182_Sub1_9585.method14713(false);
		for (int i = 0; i < anIntArray9596.length; i++) {
		    int i_1618_ = anIntArray9567[i];
		    int i_1619_ = anIntArray9567[i + 1];
		    int i_1620_ = aShortArray9605[i_1618_];
		    boolean bool = false;
		    byte i_1621_ = 0;
		    if (i_1620_ != -1) {
			Class166 class166
			    = aClass182_Sub1_9585.aClass180_1944
				  .method3116(i_1620_ & 0xffff, -1431554601);
			class319.anInterface38_3512
			    = aClass182_Sub1_9585.aClass351_9253
				  .method6159(class166);
			bool = !Class679.method11200(class166.aByte1825,
						     (byte) -53);
			class319.aClass435_3529.aFloatArray4830[12]
			    = ((float) (aClass182_Sub1_9585.anInt9295 % 128000)
			       / 1000.0F * (float) class166.aByte1805 / 64.0F
			       % 1.0F);
			class319.aClass435_3529.aFloatArray4830[13]
			    = ((float) (aClass182_Sub1_9585.anInt9295 % 128000)
			       / 1000.0F * (float) class166.aByte1806 / 64.0F
			       % 1.0F);
			if (class166.aClass597_1807 == Class597.aClass597_7843)
			    i_1621_ = class166.aByte1830;
		    } else {
			class319.anInterface38_3512
			    = aClass182_Sub1_9585.anInterface38_9168;
			float[] fs = class319.aClass435_3529.aFloatArray4830;
			class319.aClass435_3529.aFloatArray4830[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    aClass182_Sub1_9585.method14948(i_1621_);
		    class319.anInt3527 = anIntArray9596[i];
		    class319.anInt3528 = anIntArray9597[i];
		    class319.anInt3526 = i_1618_ * 3;
		    class319.anInt3530 = i_1619_ - i_1618_;
		    class319.method5696(bool);
		}
	    } else {
		aClass182_Sub1_9585
		    .method14764(3, aClass363_9578.anInterface35_3834);
		aClass182_Sub1_9585
		    .method14763(aClass182_Sub1_9585.aClass337_9323);
		Class444 class444_1622_ = aClass182_Sub1_9585.aClass444_9179;
		class444_1622_.method7154(class444);
		class444_1622_.method7138();
		int i = 0;
		if (aClass182_Sub1_9585.aBool9156)
		    aClass182_Sub1_9585.method14713(true);
		else {
		    class319.aClass446_3521.method7265
			(aClass182_Sub1_9585.aFloatArray9228[0],
			 aClass182_Sub1_9585.aFloatArray9228[1],
			 aClass182_Sub1_9585.aFloatArray9228[2]);
		    class319.aClass446_3521.method7241(class444_1622_);
		    class319.aClass446_3523.method7265
			((aClass182_Sub1_9585.aFloat9152
			  * aClass182_Sub1_9585.aFloat9233),
			 (aClass182_Sub1_9585.aFloat9152
			  * aClass182_Sub1_9585.aFloat9299),
			 (aClass182_Sub1_9585.aFloat9152
			  * aClass182_Sub1_9585.aFloat9235));
		    class319.aClass446_3524.method7265
			((-aClass182_Sub1_9585.aFloat9238
			  * aClass182_Sub1_9585.aFloat9233),
			 (-aClass182_Sub1_9585.aFloat9238
			  * aClass182_Sub1_9585.aFloat9299),
			 (-aClass182_Sub1_9585.aFloat9238
			  * aClass182_Sub1_9585.aFloat9235));
		    class319.aClass446_3517.method7265
			((aClass182_Sub1_9585.aFloat9169
			  * aClass182_Sub1_9585.aFloat9233),
			 (aClass182_Sub1_9585.aFloat9169
			  * aClass182_Sub1_9585.aFloat9299),
			 (aClass182_Sub1_9585.aFloat9169
			  * aClass182_Sub1_9585.aFloat9235));
		    if (aClass182_Sub1_9585.anInt9241 > 0) {
			i = aClass182_Sub1_9585.anInt9241;
			Class446 class446 = aClass182_Sub1_9585.aClass446_9182;
			for (int i_1623_ = 0; i_1623_ < i; i_1623_++) {
			    Class525_Sub21 class525_sub21
				= (aClass182_Sub1_9585.aClass525_Sub21Array9239
				   [i_1623_]);
			    int i_1624_
				= class525_sub21.method16298(-1363873723);
			    class446
				.method7216(class525_sub21.aClass446_10579);
			    class446.method7240(class444_1622_);
			    class319.aFloatArray3511[i_1623_ * 4 + 0]
				= class446.aFloat4895;
			    class319.aFloatArray3511[i_1623_ * 4 + 1]
				= class446.aFloat4896;
			    class319.aFloatArray3511[i_1623_ * 4 + 2]
				= class446.aFloat4897;
			    class319.aFloatArray3511[i_1623_ * 4 + 3]
				= (1.0F
				   / (float) (class525_sub21
						  .method16332(2073037832)
					      * class525_sub21
						    .method16332(2053850917)));
			    float f = (class525_sub21.method16306(-1045166776)
				       / 255.0F);
			    class319.aFloatArray3510[i_1623_ * 4 + 0]
				= (float) (i_1624_ >> 16 & 0xff) * f;
			    class319.aFloatArray3510[i_1623_ * 4 + 1]
				= (float) (i_1624_ >> 8 & 0xff) * f;
			    class319.aFloatArray3510[i_1623_ * 4 + 2]
				= (float) (i_1624_ & 0xff) * f;
			    class319.aFloatArray3510[i_1623_ * 4 + 3] = 1.0F;
			}
		    }
		}
		for (int i_1625_ = 0; i_1625_ < anIntArray9596.length;
		     i_1625_++) {
		    int i_1626_ = anIntArray9567[i_1625_];
		    int i_1627_ = anIntArray9567[i_1625_ + 1];
		    int i_1628_ = aShortArray9605[i_1626_];
		    byte i_1629_ = 11;
		    Class166 class166 = null;
		    byte i_1630_ = 0;
		    if (i_1628_ != -1) {
			class166
			    = aClass182_Sub1_9585.aClass180_1944
				  .method3116(i_1628_ & 0xffff, -1431554601);
			class319.anInterface38_3512
			    = aClass182_Sub1_9585.aClass351_9253
				  .method6159(class166);
			i_1629_ = class166.aByte1825;
			class319.method5676(class166.aByte1826);
			class319.aClass435_3529.aFloatArray4830[12]
			    = ((float) (aClass182_Sub1_9585.anInt9295 % 128000)
			       / 1000.0F * (float) class166.aByte1805 / 64.0F
			       % 1.0F);
			class319.aClass435_3529.aFloatArray4830[13]
			    = ((float) (aClass182_Sub1_9585.anInt9295 % 128000)
			       / 1000.0F * (float) class166.aByte1806 / 64.0F
			       % 1.0F);
			if (class166.aClass597_1807 == Class597.aClass597_7843)
			    i_1630_ = class166.aByte1830;
		    } else {
			class319.anInterface38_3512
			    = aClass182_Sub1_9585.anInterface38_9168;
			float[] fs = class319.aClass435_3529.aFloatArray4830;
			class319.aClass435_3529.aFloatArray4830[13] = 0.0F;
			fs[12] = 0.0F;
		    }
		    aClass182_Sub1_9585.method14948(i_1630_);
		    class319.anInt3527 = anIntArray9596[i_1625_];
		    class319.anInt3528 = anIntArray9597[i_1625_];
		    class319.anInt3526 = i_1626_ * 3;
		    class319.anInt3530 = i_1627_ - i_1626_;
		    switch (i_1629_) {
		    case 1:
			class319.aClass446_3515.method7265
			    ((aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[12]),
			     (aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[13]),
			     (aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[14]));
			class319.aClass446_3515.method7240(class444_1622_);
			class319.method5680(i);
			break;
		    default:
			class319.method5679(i);
			break;
		    case 5:
			if (!aClass182_Sub1_9585.aBool9156) {
			    Class346_Sub1_Sub1 class346_sub1_sub1
				= aClass182_Sub1_9585.aClass346_Sub1_Sub1_9286;
			    class346_sub1_sub1.method18144(class166.aByte1826,
							   (class166.anInt1793
							    * 2110803401),
							   -712123924);
			    class346_sub1_sub1.aClass435_11534
				.method7040(class444);
			    class346_sub1_sub1.aClass435_11532
				.method7040(class444);
			    class346_sub1_sub1.aClass435_11532.method6950
				(aClass182_Sub1_9585.aClass435_9195);
			    class346_sub1_sub1.anInt11531
				= anIntArray9596[i_1625_] * 1072055977;
			    class346_sub1_sub1.anInt11541
				= anIntArray9597[i_1625_] * 973286163;
			    class346_sub1_sub1.anInt11526
				= i_1626_ * -1852102561;
			    class346_sub1_sub1.anInt11543
				= (i_1627_ - i_1626_) * -691828989;
			    class346_sub1_sub1.method18145(1579404450);
			} else
			    class319.method5679(i);
			break;
		    case 7:
			class319.aClass446_3515.method7265
			    ((aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[12]),
			     (aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[13]),
			     (aClass182_Sub1_9585.aClass435_9216
			      .aFloatArray4830[14]));
			class319.aClass446_3515.method7240(class444_1622_);
			class319.aClass435_3525.method7040(class444);
			class319.anInterface40_3513
			    = aClass182_Sub1_9585.method14777();
			class319.method5681(i);
			break;
		    case 6:
			class319.method5696(!Class679.method11200(i_1629_,
								  (byte) -57));
		    }
		}
	    }
	    method15298();
	}
    }
    
    void method15322(Class435 class435) {
	if (aClass359Array9604 != null) {
	    aClass182_Sub1_9585.method3235(!aBool9582);
	    Class444 class444 = aClass182_Sub1_9585.aClass444_9179;
	    Class317 class317 = aClass182_Sub1_9585.aClass317_9194;
	    boolean bool = aClass182_Sub1_9585.anInt9283 > 0;
	    if (bool)
		class317.aClass446_3501.method7265
		    (((float) (aClass182_Sub1_9585.anInt9282 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 0 & 0xff)
		      / 255.0F));
	    else
		class317.aClass446_3501.method7265(0.0F, 0.0F, 0.0F);
	    for (int i = 0; i < anInt9603; i++) {
		Class359 class359 = aClass359Array9604[i];
		Class349 class349 = aClass349Array9574[i];
		if (!class359.aBool3807 || !aClass182_Sub1_9585.method3284()) {
		    float f = ((float) (anIntArray9550[class359.anInt3806]
					+ anIntArray9550[class359.anInt3803]
					+ anIntArray9550[class359.anInt3809])
			       * 0.3333333F);
		    float f_1631_
			= ((float) (anIntArray9551[class359.anInt3806]
				    + anIntArray9551[class359.anInt3803]
				    + anIntArray9551[class359.anInt3809])
			   * 0.3333333F);
		    float f_1632_
			= ((float) (anIntArray9541[class359.anInt3806]
				    + anIntArray9541[class359.anInt3803]
				    + anIntArray9541[class359.anInt3809])
			   * 0.3333333F);
		    float f_1633_ = (class435.aFloatArray4830[0] * f
				     + class435.aFloatArray4830[4] * f_1631_
				     + class435.aFloatArray4830[8] * f_1632_
				     + class435.aFloatArray4830[12]);
		    float f_1634_ = (class435.aFloatArray4830[1] * f
				     + class435.aFloatArray4830[5] * f_1631_
				     + class435.aFloatArray4830[9] * f_1632_
				     + class435.aFloatArray4830[13]);
		    float f_1635_ = (class435.aFloatArray4830[2] * f
				     + class435.aFloatArray4830[6] * f_1631_
				     + class435.aFloatArray4830[10] * f_1632_
				     + class435.aFloatArray4830[14]);
		    float f_1636_
			= ((float) (1.0
				    / Math.sqrt((double) (f_1633_ * f_1633_
							  + f_1634_ * f_1634_
							  + (f_1635_
							     * f_1635_))))
			   * (float) class359.anInt3810);
		    class444.method7135
			(class349.anInt3736,
			 class349.anInt3740 * class359.aShort3804 >> 7,
			 class349.anInt3737 * class359.aShort3802 >> 7,
			 (f_1633_ + (float) class349.anInt3738
			  - f_1633_ * f_1636_),
			 (f_1634_ + (float) class349.anInt3735
			  - f_1634_ * f_1636_),
			 f_1635_ - f_1635_ * f_1636_);
		    class444.method7148(aClass182_Sub1_9585.aClass444_9172);
		    aClass182_Sub1_9585.aClass435_9181.method7040(class444);
		    class317.method5666(aClass182_Sub1_9585.aClass435_9181);
		    class317.aClass435_3500.method7023();
		    class317.anInt3504 = class349.anInt3739;
		    if (bool)
			class317.aFloat3498
			    = 1.0F - ((aClass182_Sub1_9585.aFloat9218
				       - f_1635_)
				      / (aClass182_Sub1_9585.aFloat9218
					 - aClass182_Sub1_9585.aFloat9207));
		    class317.anInterface38_3499 = null;
		    if (class359.aShort3808 != -1)
			class317.anInterface38_3499
			    = (aClass182_Sub1_9585.aClass351_9253.method6159
			       (aClass182_Sub1_9585.aClass180_1944.method3116
				(class359.aShort3808 & 0xffff, -1431554601)));
		    class317.method5664(bool);
		}
	    }
	    aClass182_Sub1_9585.method3235(true);
	}
    }
    
    int method15323(int i, int i_1637_) {
	i_1637_ = i_1637_ * (i & 0x7f) >> 7;
	if (i_1637_ < 2)
	    i_1637_ = 2;
	else if (i_1637_ > 126)
	    i_1637_ = 126;
	return (i & 0xff80) + i_1637_;
    }
    
    void method15324(Class435 class435) {
	if (aClass359Array9604 != null) {
	    aClass182_Sub1_9585.method3235(!aBool9582);
	    Class444 class444 = aClass182_Sub1_9585.aClass444_9179;
	    Class317 class317 = aClass182_Sub1_9585.aClass317_9194;
	    boolean bool = aClass182_Sub1_9585.anInt9283 > 0;
	    if (bool)
		class317.aClass446_3501.method7265
		    (((float) (aClass182_Sub1_9585.anInt9282 >> 16 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 8 & 0xff)
		      / 255.0F),
		     ((float) (aClass182_Sub1_9585.anInt9282 >> 0 & 0xff)
		      / 255.0F));
	    else
		class317.aClass446_3501.method7265(0.0F, 0.0F, 0.0F);
	    for (int i = 0; i < anInt9603; i++) {
		Class359 class359 = aClass359Array9604[i];
		Class349 class349 = aClass349Array9574[i];
		if (!class359.aBool3807 || !aClass182_Sub1_9585.method3284()) {
		    float f = ((float) (anIntArray9550[class359.anInt3806]
					+ anIntArray9550[class359.anInt3803]
					+ anIntArray9550[class359.anInt3809])
			       * 0.3333333F);
		    float f_1638_
			= ((float) (anIntArray9551[class359.anInt3806]
				    + anIntArray9551[class359.anInt3803]
				    + anIntArray9551[class359.anInt3809])
			   * 0.3333333F);
		    float f_1639_
			= ((float) (anIntArray9541[class359.anInt3806]
				    + anIntArray9541[class359.anInt3803]
				    + anIntArray9541[class359.anInt3809])
			   * 0.3333333F);
		    float f_1640_ = (class435.aFloatArray4830[0] * f
				     + class435.aFloatArray4830[4] * f_1638_
				     + class435.aFloatArray4830[8] * f_1639_
				     + class435.aFloatArray4830[12]);
		    float f_1641_ = (class435.aFloatArray4830[1] * f
				     + class435.aFloatArray4830[5] * f_1638_
				     + class435.aFloatArray4830[9] * f_1639_
				     + class435.aFloatArray4830[13]);
		    float f_1642_ = (class435.aFloatArray4830[2] * f
				     + class435.aFloatArray4830[6] * f_1638_
				     + class435.aFloatArray4830[10] * f_1639_
				     + class435.aFloatArray4830[14]);
		    float f_1643_
			= ((float) (1.0
				    / Math.sqrt((double) (f_1640_ * f_1640_
							  + f_1641_ * f_1641_
							  + (f_1642_
							     * f_1642_))))
			   * (float) class359.anInt3810);
		    class444.method7135
			(class349.anInt3736,
			 class349.anInt3740 * class359.aShort3804 >> 7,
			 class349.anInt3737 * class359.aShort3802 >> 7,
			 (f_1640_ + (float) class349.anInt3738
			  - f_1640_ * f_1643_),
			 (f_1641_ + (float) class349.anInt3735
			  - f_1641_ * f_1643_),
			 f_1642_ - f_1642_ * f_1643_);
		    class444.method7148(aClass182_Sub1_9585.aClass444_9172);
		    aClass182_Sub1_9585.aClass435_9181.method7040(class444);
		    class317.method5666(aClass182_Sub1_9585.aClass435_9181);
		    class317.aClass435_3500.method7023();
		    class317.anInt3504 = class349.anInt3739;
		    if (bool)
			class317.aFloat3498
			    = 1.0F - ((aClass182_Sub1_9585.aFloat9218
				       - f_1642_)
				      / (aClass182_Sub1_9585.aFloat9218
					 - aClass182_Sub1_9585.aFloat9207));
		    class317.anInterface38_3499 = null;
		    if (class359.aShort3808 != -1)
			class317.anInterface38_3499
			    = (aClass182_Sub1_9585.aClass351_9253.method6159
			       (aClass182_Sub1_9585.aClass180_1944.method3116
				(class359.aShort3808 & 0xffff, -1431554601)));
		    class317.method5664(bool);
		}
	    }
	    aClass182_Sub1_9585.method3235(true);
	}
    }
    
    boolean method15325() {
	if (aClass354_9575.aBool3787)
	    return true;
	if (aClass354_9575.anInterface44_3785 == null)
	    aClass354_9575.anInterface44_3785
		= aClass182_Sub1_9585.method14701(false);
	Interface44 interface44 = aClass354_9575.anInterface44_3785;
	interface44.method29(anInt9566 * 6);
	Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	if (unsafe != null) {
	    int i = anInt9566 * 6;
	    long l = interface44.method219(0, i);
	    if (l == 0L)
		return false;
	    for (int i_1644_ = 0; i_1644_ < anInt9566; i_1644_++) {
		unsafe.putShort(l, aShortArray9561[i_1644_]);
		l += 2L;
		unsafe.putShort(l, aShortArray9570[i_1644_]);
		l += 2L;
		unsafe.putShort(l, aShortArray9571[i_1644_]);
		l += 2L;
	    }
	    interface44.method220();
	    aClass354_9575.anInterface44_3786 = interface44;
	    aClass354_9575.aBool3787 = true;
	    aBool9581 = true;
	    return true;
	}
	ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
	bytebuffer.clear();
	for (int i = 0; i < anInt9566; i++) {
	    bytebuffer.putShort(aShortArray9561[i]);
	    bytebuffer.putShort(aShortArray9570[i]);
	    bytebuffer.putShort(aShortArray9571[i]);
	}
	if (interface44.method215(0, bytebuffer.position(),
				  aClass182_Sub1_9585.aLong9160)) {
	    aClass354_9575.anInterface44_3786 = interface44;
	    aClass354_9575.aBool3787 = true;
	    aBool9581 = true;
	    return true;
	}
	return false;
    }
    
    void method15326() {
	if (aClass363_9616 != null)
	    aClass363_9616.aBool3835 = false;
    }
    
    boolean method15327() {
	boolean bool = !aClass363_9577.aBool3835;
	boolean bool_1645_
	    = (anInt9558 & 0x37) != 0 && !aClass363_9578.aBool3835;
	boolean bool_1646_ = !aClass363_9616.aBool3835;
	boolean bool_1647_ = !aClass363_9579.aBool3835;
	if (!bool_1646_ && !bool && !bool_1645_ && !bool_1647_)
	    return true;
	boolean bool_1648_ = true;
	if (bool_1646_ && aShortArray9556 != null) {
	    if (aClass363_9616.anInterface35_3837 == null)
		aClass363_9616.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9616.anInterface35_3837;
	    interface35.method225(anInt9555 * 12, 12);
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 12;
		long l = interface35.method219(0, i);
		for (int i_1649_ = 0; i_1649_ < anInt9555; i_1649_++) {
		    short i_1650_ = aShortArray9556[i_1649_];
		    unsafe.putFloat(l, (float) anIntArray9550[i_1650_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9551[i_1650_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9541[i_1650_]);
		    l += 4L;
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		for (int i = 0; i < anInt9555; i++) {
		    bytebuffer
			.putFloat((float) anIntArray9550[aShortArray9556[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9551[aShortArray9556[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9541[aShortArray9556[i]]);
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9616.anInterface35_3834 = interface35;
	    aClass363_9616.aBool3835 = true;
	}
	if (bool) {
	    if (aClass363_9577.anInterface35_3837 == null)
		aClass363_9577.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9577.anInterface35_3837;
	    interface35.method225(anInt9555 * 4, 4);
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 4;
		long l = interface35.method219(0, i);
		if ((anInt9558 & 0x37) == 0) {
		    short[] is;
		    short[] is_1651_;
		    short[] is_1652_;
		    byte[] is_1653_;
		    if (aClass366_9564 != null) {
			is = aClass366_9564.aShortArray3857;
			is_1651_ = aClass366_9564.aShortArray3856;
			is_1652_ = aClass366_9564.aShortArray3858;
			is_1653_ = aClass366_9564.aByteArray3855;
		    } else {
			is = aShortArray9617;
			is_1651_ = aShortArray9559;
			is_1652_ = aShortArray9560;
			is_1653_ = aByteArray9557;
		    }
		    float f = (aClass182_Sub1_9585.aFloat9152 * 768.0F
			       / (float) aShort9572);
		    float f_1654_ = (aClass182_Sub1_9585.aFloat9238 * 768.0F
				     / (float) aShort9572);
		    for (int i_1655_ = 0; i_1655_ < anInt9555; i_1655_++) {
			short i_1656_ = aShortArray9545[i_1655_];
			int i_1657_
			    = method15288(aShortArray9552[i_1656_] & 0xffff,
					  aShortArray9605[i_1656_],
					  aShort9546);
			float f_1658_ = ((float) (i_1657_ >> 16 & 0xff)
					 * aClass182_Sub1_9585.aFloat9233);
			float f_1659_ = ((float) (i_1657_ >> 8 & 0xff)
					 * aClass182_Sub1_9585.aFloat9299);
			float f_1660_ = ((float) (i_1657_ & 0xff)
					 * aClass182_Sub1_9585.aFloat9235);
			byte i_1661_ = is_1653_[i_1655_];
			float f_1662_;
			if (i_1661_ == 0)
			    f_1662_
				= (((aClass182_Sub1_9585.aFloatArray9228[0]
				     * (float) is[i_1655_])
				    + (aClass182_Sub1_9585.aFloatArray9228[1]
				       * (float) is_1651_[i_1655_])
				    + (aClass182_Sub1_9585.aFloatArray9228[2]
				       * (float) is_1652_[i_1655_]))
				   * 0.0026041667F);
			else
			    f_1662_
				= (((aClass182_Sub1_9585.aFloatArray9228[0]
				     * (float) is[i_1655_])
				    + (aClass182_Sub1_9585.aFloatArray9228[1]
				       * (float) is_1651_[i_1655_])
				    + (aClass182_Sub1_9585.aFloatArray9228[2]
				       * (float) is_1652_[i_1655_]))
				   / ((float) i_1661_ * 256.0F));
			float f_1663_
			    = (aClass182_Sub1_9585.aFloat9169
			       + f_1662_ * (f_1662_ < 0.0F ? f_1654_ : f));
			int i_1664_ = (int) (f_1658_ * f_1663_);
			if (i_1664_ < 0)
			    i_1664_ = 0;
			else if (i_1664_ > 255)
			    i_1664_ = 255;
			int i_1665_ = (int) (f_1659_ * f_1663_);
			if (i_1665_ < 0)
			    i_1665_ = 0;
			else if (i_1665_ > 255)
			    i_1665_ = 255;
			int i_1666_ = (int) (f_1660_ * f_1663_);
			if (i_1666_ < 0)
			    i_1666_ = 0;
			else if (i_1666_ > 255)
			    i_1666_ = 255;
			unsafe.putInt(l, (255 - aByteArray9568[i_1656_] << 24
					  | i_1664_ << 16 | i_1665_ << 8
					  | i_1666_));
			l += 4L;
		    }
		} else {
		    for (int i_1667_ = 0; i_1667_ < anInt9555; i_1667_++) {
			short i_1668_ = aShortArray9545[i_1667_];
			int i_1669_
			    = (255 - aByteArray9568[i_1668_] << 24
			       | method15288(aShortArray9552[i_1668_] & 0xffff,
					     aShortArray9605[i_1668_],
					     aShort9546));
			unsafe.putInt(l, i_1669_);
			l += 4L;
		    }
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		if ((anInt9558 & 0x37) == 0) {
		    short[] is;
		    short[] is_1670_;
		    short[] is_1671_;
		    byte[] is_1672_;
		    if (aClass366_9564 != null) {
			is = aClass366_9564.aShortArray3857;
			is_1670_ = aClass366_9564.aShortArray3856;
			is_1671_ = aClass366_9564.aShortArray3858;
			is_1672_ = aClass366_9564.aByteArray3855;
		    } else {
			is = aShortArray9617;
			is_1670_ = aShortArray9559;
			is_1671_ = aShortArray9560;
			is_1672_ = aByteArray9557;
		    }
		    float f = (aClass182_Sub1_9585.aFloat9152 * 768.0F
			       / (float) aShort9572);
		    float f_1673_ = (aClass182_Sub1_9585.aFloat9238 * 768.0F
				     / (float) aShort9572);
		    for (int i = 0; i < anInt9555; i++) {
			short i_1674_ = aShortArray9545[i];
			int i_1675_
			    = method15288(aShortArray9552[i_1674_] & 0xffff,
					  aShortArray9605[i_1674_],
					  aShort9546);
			float f_1676_ = ((float) (i_1675_ >> 16 & 0xff)
					 * aClass182_Sub1_9585.aFloat9233);
			float f_1677_ = ((float) (i_1675_ >> 8 & 0xff)
					 * aClass182_Sub1_9585.aFloat9299);
			float f_1678_ = ((float) (i_1675_ & 0xff)
					 * aClass182_Sub1_9585.aFloat9235);
			byte i_1679_ = is_1672_[i];
			float f_1680_;
			if (i_1679_ == 0)
			    f_1680_
				= ((aClass182_Sub1_9585.aFloatArray9228[0]
				    * (float) is[i])
				   + (aClass182_Sub1_9585.aFloatArray9228[1]
				      * (float) is_1670_[i])
				   + (aClass182_Sub1_9585.aFloatArray9228[2]
				      * (float) is_1671_[i])) * 0.0026041667F;
			else
			    f_1680_
				= (((aClass182_Sub1_9585.aFloatArray9228[0]
				     * (float) is[i])
				    + (aClass182_Sub1_9585.aFloatArray9228[1]
				       * (float) is_1670_[i])
				    + (aClass182_Sub1_9585.aFloatArray9228[2]
				       * (float) is_1671_[i]))
				   / ((float) i_1679_ * 256.0F));
			float f_1681_
			    = (aClass182_Sub1_9585.aFloat9169
			       + f_1680_ * (f_1680_ < 0.0F ? f_1673_ : f));
			int i_1682_ = (int) (f_1676_ * f_1681_);
			if (i_1682_ < 0)
			    i_1682_ = 0;
			else if (i_1682_ > 255)
			    i_1682_ = 255;
			int i_1683_ = (int) (f_1677_ * f_1681_);
			if (i_1683_ < 0)
			    i_1683_ = 0;
			else if (i_1683_ > 255)
			    i_1683_ = 255;
			int i_1684_ = (int) (f_1678_ * f_1681_);
			if (i_1684_ < 0)
			    i_1684_ = 0;
			else if (i_1684_ > 255)
			    i_1684_ = 255;
			bytebuffer.putInt(255 - aByteArray9568[i_1674_] << 24
					  | i_1682_ << 16 | i_1683_ << 8
					  | i_1684_);
		    }
		} else {
		    for (int i = 0; i < anInt9555; i++) {
			short i_1685_ = aShortArray9545[i];
			int i_1686_
			    = (255 - aByteArray9568[i_1685_] << 24
			       | method15288(aShortArray9552[i_1685_] & 0xffff,
					     aShortArray9605[i_1685_],
					     aShort9546));
			bytebuffer.putInt(i_1686_);
		    }
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9577.anInterface35_3834 = interface35;
	    aClass363_9577.aBool3835 = true;
	}
	if (bool_1645_) {
	    if (aClass363_9578.anInterface35_3837 == null)
		aClass363_9578.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9578.anInterface35_3837;
	    interface35.method225(anInt9555 * 12, 12);
	    short[] is;
	    short[] is_1687_;
	    short[] is_1688_;
	    byte[] is_1689_;
	    if (aClass366_9564 != null) {
		is = aClass366_9564.aShortArray3857;
		is_1687_ = aClass366_9564.aShortArray3856;
		is_1688_ = aClass366_9564.aShortArray3858;
		is_1689_ = aClass366_9564.aByteArray3855;
	    } else {
		is = aShortArray9617;
		is_1687_ = aShortArray9559;
		is_1688_ = aShortArray9560;
		is_1689_ = aByteArray9557;
	    }
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 12;
		long l = interface35.method219(0, i);
		for (int i_1690_ = 0; i_1690_ < anInt9555; i_1690_++) {
		    Class446 class446
			= new Class446((float) is[i_1690_],
				       (float) is_1687_[i_1690_],
				       (float) is_1688_[i_1690_]);
		    if (class446.method7230() != 0.0F) {
			if (is_1689_[i_1690_] > 1)
			    class446.method7237((float) is_1689_[i_1690_]);
			class446.method7220();
		    }
		    unsafe.putFloat(l, class446.aFloat4895);
		    l += 4L;
		    unsafe.putFloat(l, class446.aFloat4896);
		    l += 4L;
		    unsafe.putFloat(l, class446.aFloat4897);
		    l += 4L;
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		for (int i = 0; i < anInt9555; i++) {
		    Class446 class446
			= new Class446((float) is[i], (float) is_1687_[i],
				       (float) is_1688_[i]);
		    if (class446.method7230() != 0.0F) {
			if (is_1689_[i] > 1)
			    class446.method7237((float) is_1689_[i]);
			class446.method7220();
		    }
		    bytebuffer.putFloat(class446.aFloat4895);
		    bytebuffer.putFloat(class446.aFloat4896);
		    bytebuffer.putFloat(class446.aFloat4897);
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9578.anInterface35_3834 = interface35;
	    aClass363_9578.aBool3835 = true;
	}
	if (bool_1647_) {
	    if (aClass363_9579.anInterface35_3837 == null)
		aClass363_9579.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9579.anInterface35_3837;
	    interface35.method225(anInt9555 * 8, 8);
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 8;
		long l = interface35.method219(0, i);
		for (int i_1691_ = 0; i_1691_ < anInt9555; i_1691_++) {
		    unsafe.putFloat(l, aFloatArray9562[i_1691_]);
		    l += 4L;
		    unsafe.putFloat(l, aFloatArray9563[i_1691_]);
		    l += 4L;
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		for (int i = 0; i < anInt9555; i++) {
		    bytebuffer.putFloat(aFloatArray9562[i]);
		    bytebuffer.putFloat(aFloatArray9563[i]);
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9579.anInterface35_3834 = interface35;
	    aClass363_9579.aBool3835 = true;
	}
	return bool_1648_;
    }
    
    boolean method15328() {
	boolean bool = !aClass363_9577.aBool3835;
	boolean bool_1692_
	    = (anInt9558 & 0x37) != 0 && !aClass363_9578.aBool3835;
	boolean bool_1693_ = !aClass363_9616.aBool3835;
	boolean bool_1694_ = !aClass363_9579.aBool3835;
	if (!bool_1693_ && !bool && !bool_1692_ && !bool_1694_)
	    return true;
	boolean bool_1695_ = true;
	if (bool_1693_ && aShortArray9556 != null) {
	    if (aClass363_9616.anInterface35_3837 == null)
		aClass363_9616.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9616.anInterface35_3837;
	    interface35.method225(anInt9555 * 12, 12);
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 12;
		long l = interface35.method219(0, i);
		for (int i_1696_ = 0; i_1696_ < anInt9555; i_1696_++) {
		    short i_1697_ = aShortArray9556[i_1696_];
		    unsafe.putFloat(l, (float) anIntArray9550[i_1697_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9551[i_1697_]);
		    l += 4L;
		    unsafe.putFloat(l, (float) anIntArray9541[i_1697_]);
		    l += 4L;
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		for (int i = 0; i < anInt9555; i++) {
		    bytebuffer
			.putFloat((float) anIntArray9550[aShortArray9556[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9551[aShortArray9556[i]]);
		    bytebuffer
			.putFloat((float) anIntArray9541[aShortArray9556[i]]);
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9616.anInterface35_3834 = interface35;
	    aClass363_9616.aBool3835 = true;
	}
	if (bool) {
	    if (aClass363_9577.anInterface35_3837 == null)
		aClass363_9577.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9577.anInterface35_3837;
	    interface35.method225(anInt9555 * 4, 4);
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 4;
		long l = interface35.method219(0, i);
		if ((anInt9558 & 0x37) == 0) {
		    short[] is;
		    short[] is_1698_;
		    short[] is_1699_;
		    byte[] is_1700_;
		    if (aClass366_9564 != null) {
			is = aClass366_9564.aShortArray3857;
			is_1698_ = aClass366_9564.aShortArray3856;
			is_1699_ = aClass366_9564.aShortArray3858;
			is_1700_ = aClass366_9564.aByteArray3855;
		    } else {
			is = aShortArray9617;
			is_1698_ = aShortArray9559;
			is_1699_ = aShortArray9560;
			is_1700_ = aByteArray9557;
		    }
		    float f = (aClass182_Sub1_9585.aFloat9152 * 768.0F
			       / (float) aShort9572);
		    float f_1701_ = (aClass182_Sub1_9585.aFloat9238 * 768.0F
				     / (float) aShort9572);
		    for (int i_1702_ = 0; i_1702_ < anInt9555; i_1702_++) {
			short i_1703_ = aShortArray9545[i_1702_];
			int i_1704_
			    = method15288(aShortArray9552[i_1703_] & 0xffff,
					  aShortArray9605[i_1703_],
					  aShort9546);
			float f_1705_ = ((float) (i_1704_ >> 16 & 0xff)
					 * aClass182_Sub1_9585.aFloat9233);
			float f_1706_ = ((float) (i_1704_ >> 8 & 0xff)
					 * aClass182_Sub1_9585.aFloat9299);
			float f_1707_ = ((float) (i_1704_ & 0xff)
					 * aClass182_Sub1_9585.aFloat9235);
			byte i_1708_ = is_1700_[i_1702_];
			float f_1709_;
			if (i_1708_ == 0)
			    f_1709_
				= (((aClass182_Sub1_9585.aFloatArray9228[0]
				     * (float) is[i_1702_])
				    + (aClass182_Sub1_9585.aFloatArray9228[1]
				       * (float) is_1698_[i_1702_])
				    + (aClass182_Sub1_9585.aFloatArray9228[2]
				       * (float) is_1699_[i_1702_]))
				   * 0.0026041667F);
			else
			    f_1709_
				= (((aClass182_Sub1_9585.aFloatArray9228[0]
				     * (float) is[i_1702_])
				    + (aClass182_Sub1_9585.aFloatArray9228[1]
				       * (float) is_1698_[i_1702_])
				    + (aClass182_Sub1_9585.aFloatArray9228[2]
				       * (float) is_1699_[i_1702_]))
				   / ((float) i_1708_ * 256.0F));
			float f_1710_
			    = (aClass182_Sub1_9585.aFloat9169
			       + f_1709_ * (f_1709_ < 0.0F ? f_1701_ : f));
			int i_1711_ = (int) (f_1705_ * f_1710_);
			if (i_1711_ < 0)
			    i_1711_ = 0;
			else if (i_1711_ > 255)
			    i_1711_ = 255;
			int i_1712_ = (int) (f_1706_ * f_1710_);
			if (i_1712_ < 0)
			    i_1712_ = 0;
			else if (i_1712_ > 255)
			    i_1712_ = 255;
			int i_1713_ = (int) (f_1707_ * f_1710_);
			if (i_1713_ < 0)
			    i_1713_ = 0;
			else if (i_1713_ > 255)
			    i_1713_ = 255;
			unsafe.putInt(l, (255 - aByteArray9568[i_1703_] << 24
					  | i_1711_ << 16 | i_1712_ << 8
					  | i_1713_));
			l += 4L;
		    }
		} else {
		    for (int i_1714_ = 0; i_1714_ < anInt9555; i_1714_++) {
			short i_1715_ = aShortArray9545[i_1714_];
			int i_1716_
			    = (255 - aByteArray9568[i_1715_] << 24
			       | method15288(aShortArray9552[i_1715_] & 0xffff,
					     aShortArray9605[i_1715_],
					     aShort9546));
			unsafe.putInt(l, i_1716_);
			l += 4L;
		    }
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		if ((anInt9558 & 0x37) == 0) {
		    short[] is;
		    short[] is_1717_;
		    short[] is_1718_;
		    byte[] is_1719_;
		    if (aClass366_9564 != null) {
			is = aClass366_9564.aShortArray3857;
			is_1717_ = aClass366_9564.aShortArray3856;
			is_1718_ = aClass366_9564.aShortArray3858;
			is_1719_ = aClass366_9564.aByteArray3855;
		    } else {
			is = aShortArray9617;
			is_1717_ = aShortArray9559;
			is_1718_ = aShortArray9560;
			is_1719_ = aByteArray9557;
		    }
		    float f = (aClass182_Sub1_9585.aFloat9152 * 768.0F
			       / (float) aShort9572);
		    float f_1720_ = (aClass182_Sub1_9585.aFloat9238 * 768.0F
				     / (float) aShort9572);
		    for (int i = 0; i < anInt9555; i++) {
			short i_1721_ = aShortArray9545[i];
			int i_1722_
			    = method15288(aShortArray9552[i_1721_] & 0xffff,
					  aShortArray9605[i_1721_],
					  aShort9546);
			float f_1723_ = ((float) (i_1722_ >> 16 & 0xff)
					 * aClass182_Sub1_9585.aFloat9233);
			float f_1724_ = ((float) (i_1722_ >> 8 & 0xff)
					 * aClass182_Sub1_9585.aFloat9299);
			float f_1725_ = ((float) (i_1722_ & 0xff)
					 * aClass182_Sub1_9585.aFloat9235);
			byte i_1726_ = is_1719_[i];
			float f_1727_;
			if (i_1726_ == 0)
			    f_1727_
				= ((aClass182_Sub1_9585.aFloatArray9228[0]
				    * (float) is[i])
				   + (aClass182_Sub1_9585.aFloatArray9228[1]
				      * (float) is_1717_[i])
				   + (aClass182_Sub1_9585.aFloatArray9228[2]
				      * (float) is_1718_[i])) * 0.0026041667F;
			else
			    f_1727_
				= (((aClass182_Sub1_9585.aFloatArray9228[0]
				     * (float) is[i])
				    + (aClass182_Sub1_9585.aFloatArray9228[1]
				       * (float) is_1717_[i])
				    + (aClass182_Sub1_9585.aFloatArray9228[2]
				       * (float) is_1718_[i]))
				   / ((float) i_1726_ * 256.0F));
			float f_1728_
			    = (aClass182_Sub1_9585.aFloat9169
			       + f_1727_ * (f_1727_ < 0.0F ? f_1720_ : f));
			int i_1729_ = (int) (f_1723_ * f_1728_);
			if (i_1729_ < 0)
			    i_1729_ = 0;
			else if (i_1729_ > 255)
			    i_1729_ = 255;
			int i_1730_ = (int) (f_1724_ * f_1728_);
			if (i_1730_ < 0)
			    i_1730_ = 0;
			else if (i_1730_ > 255)
			    i_1730_ = 255;
			int i_1731_ = (int) (f_1725_ * f_1728_);
			if (i_1731_ < 0)
			    i_1731_ = 0;
			else if (i_1731_ > 255)
			    i_1731_ = 255;
			bytebuffer.putInt(255 - aByteArray9568[i_1721_] << 24
					  | i_1729_ << 16 | i_1730_ << 8
					  | i_1731_);
		    }
		} else {
		    for (int i = 0; i < anInt9555; i++) {
			short i_1732_ = aShortArray9545[i];
			int i_1733_
			    = (255 - aByteArray9568[i_1732_] << 24
			       | method15288(aShortArray9552[i_1732_] & 0xffff,
					     aShortArray9605[i_1732_],
					     aShort9546));
			bytebuffer.putInt(i_1733_);
		    }
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9577.anInterface35_3834 = interface35;
	    aClass363_9577.aBool3835 = true;
	}
	if (bool_1692_) {
	    if (aClass363_9578.anInterface35_3837 == null)
		aClass363_9578.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9578.anInterface35_3837;
	    interface35.method225(anInt9555 * 12, 12);
	    short[] is;
	    short[] is_1734_;
	    short[] is_1735_;
	    byte[] is_1736_;
	    if (aClass366_9564 != null) {
		is = aClass366_9564.aShortArray3857;
		is_1734_ = aClass366_9564.aShortArray3856;
		is_1735_ = aClass366_9564.aShortArray3858;
		is_1736_ = aClass366_9564.aByteArray3855;
	    } else {
		is = aShortArray9617;
		is_1734_ = aShortArray9559;
		is_1735_ = aShortArray9560;
		is_1736_ = aByteArray9557;
	    }
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 12;
		long l = interface35.method219(0, i);
		for (int i_1737_ = 0; i_1737_ < anInt9555; i_1737_++) {
		    Class446 class446
			= new Class446((float) is[i_1737_],
				       (float) is_1734_[i_1737_],
				       (float) is_1735_[i_1737_]);
		    if (class446.method7230() != 0.0F) {
			if (is_1736_[i_1737_] > 1)
			    class446.method7237((float) is_1736_[i_1737_]);
			class446.method7220();
		    }
		    unsafe.putFloat(l, class446.aFloat4895);
		    l += 4L;
		    unsafe.putFloat(l, class446.aFloat4896);
		    l += 4L;
		    unsafe.putFloat(l, class446.aFloat4897);
		    l += 4L;
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		for (int i = 0; i < anInt9555; i++) {
		    Class446 class446
			= new Class446((float) is[i], (float) is_1734_[i],
				       (float) is_1735_[i]);
		    if (class446.method7230() != 0.0F) {
			if (is_1736_[i] > 1)
			    class446.method7237((float) is_1736_[i]);
			class446.method7220();
		    }
		    bytebuffer.putFloat(class446.aFloat4895);
		    bytebuffer.putFloat(class446.aFloat4896);
		    bytebuffer.putFloat(class446.aFloat4897);
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9578.anInterface35_3834 = interface35;
	    aClass363_9578.aBool3835 = true;
	}
	if (bool_1694_) {
	    if (aClass363_9579.anInterface35_3837 == null)
		aClass363_9579.anInterface35_3837
		    = aClass182_Sub1_9585.method14761(aBool9580);
	    Interface35 interface35 = aClass363_9579.anInterface35_3837;
	    interface35.method225(anInt9555 * 8, 8);
	    Unsafe unsafe = aClass182_Sub1_9585.anUnsafe9234;
	    if (unsafe != null) {
		int i = anInt9555 * 8;
		long l = interface35.method219(0, i);
		for (int i_1738_ = 0; i_1738_ < anInt9555; i_1738_++) {
		    unsafe.putFloat(l, aFloatArray9562[i_1738_]);
		    l += 4L;
		    unsafe.putFloat(l, aFloatArray9563[i_1738_]);
		    l += 4L;
		}
		interface35.method220();
	    } else {
		ByteBuffer bytebuffer = aClass182_Sub1_9585.aByteBuffer9271;
		bytebuffer.clear();
		for (int i = 0; i < anInt9555; i++) {
		    bytebuffer.putFloat(aFloatArray9562[i]);
		    bytebuffer.putFloat(aFloatArray9563[i]);
		}
		interface35.method215(0, bytebuffer.position(),
				      aClass182_Sub1_9585.aLong9160);
	    }
	    aClass363_9579.anInterface35_3834 = interface35;
	    aClass363_9579.aBool3835 = true;
	}
	return bool_1695_;
    }
    
    static short[] method15329(short[] is, int i) {
	short[] is_1739_ = new short[i];
	System.arraycopy(is, 0, is_1739_, 0, i);
	return is_1739_;
    }
    
    public void method3092() {
	if (!aBool9593) {
	    if (!aBool9586)
		method15278();
	    anInt9594 = anInt9587;
	    aBool9593 = true;
	}
    }
    
    int method15330(int i, int i_1740_) {
	i_1740_ = i_1740_ * (i & 0x7f) >> 7;
	if (i_1740_ < 2)
	    i_1740_ = 2;
	else if (i_1740_ > 126)
	    i_1740_ = 126;
	return (i & 0xff80) + i_1740_;
    }
    
    void method3013(int i, int[] is, int i_1741_, int i_1742_, int i_1743_,
		    boolean bool, int i_1744_, int[] is_1745_) {
	int i_1746_ = is.length;
	if (i == 0) {
	    i_1741_ <<= 4;
	    i_1742_ <<= 4;
	    i_1743_ <<= 4;
	    int i_1747_ = 0;
	    anInt9613 = 0;
	    anInt9614 = 0;
	    anInt9576 = 0;
	    for (int i_1748_ = 0; i_1748_ < i_1746_; i_1748_++) {
		int i_1749_ = is[i_1748_];
		if (i_1749_ < anIntArrayArray9553.length) {
		    int[] is_1750_ = anIntArrayArray9553[i_1749_];
		    for (int i_1751_ = 0; i_1751_ < is_1750_.length;
			 i_1751_++) {
			int i_1752_ = is_1750_[i_1751_];
			if (aShortArray9548 == null
			    || (i_1744_ & aShortArray9548[i_1752_]) != 0) {
			    anInt9613 += anIntArray9550[i_1752_];
			    anInt9614 += anIntArray9551[i_1752_];
			    anInt9576 += anIntArray9541[i_1752_];
			    i_1747_++;
			}
		    }
		}
	    }
	    if (i_1747_ > 0) {
		anInt9613 = anInt9613 / i_1747_ + i_1741_;
		anInt9614 = anInt9614 / i_1747_ + i_1742_;
		anInt9576 = anInt9576 / i_1747_ + i_1743_;
		aBool9554 = true;
	    } else {
		anInt9613 = i_1741_;
		anInt9614 = i_1742_;
		anInt9576 = i_1743_;
	    }
	} else if (i == 1) {
	    if (is_1745_ != null) {
		int i_1753_ = ((is_1745_[0] * i_1741_ + is_1745_[1] * i_1742_
				+ is_1745_[2] * i_1743_ + 8192)
			       >> 14);
		int i_1754_ = ((is_1745_[3] * i_1741_ + is_1745_[4] * i_1742_
				+ is_1745_[5] * i_1743_ + 8192)
			       >> 14);
		int i_1755_ = ((is_1745_[6] * i_1741_ + is_1745_[7] * i_1742_
				+ is_1745_[8] * i_1743_ + 8192)
			       >> 14);
		i_1741_ = i_1753_;
		i_1742_ = i_1754_;
		i_1743_ = i_1755_;
	    }
	    i_1741_ <<= 4;
	    i_1742_ <<= 4;
	    i_1743_ <<= 4;
	    for (int i_1756_ = 0; i_1756_ < i_1746_; i_1756_++) {
		int i_1757_ = is[i_1756_];
		if (i_1757_ < anIntArrayArray9553.length) {
		    int[] is_1758_ = anIntArrayArray9553[i_1757_];
		    for (int i_1759_ = 0; i_1759_ < is_1758_.length;
			 i_1759_++) {
			int i_1760_ = is_1758_[i_1759_];
			if (aShortArray9548 == null
			    || (i_1744_ & aShortArray9548[i_1760_]) != 0) {
			    anIntArray9550[i_1760_] += i_1741_;
			    anIntArray9551[i_1760_] += i_1742_;
			    anIntArray9541[i_1760_] += i_1743_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1745_ != null) {
		int i_1761_ = is_1745_[9] << 4;
		int i_1762_ = is_1745_[10] << 4;
		int i_1763_ = is_1745_[11] << 4;
		int i_1764_ = is_1745_[12] << 4;
		int i_1765_ = is_1745_[13] << 4;
		int i_1766_ = is_1745_[14] << 4;
		if (aBool9554) {
		    int i_1767_
			= ((is_1745_[0] * anInt9613 + is_1745_[3] * anInt9614
			    + is_1745_[6] * anInt9576 + 8192)
			   >> 14);
		    int i_1768_
			= ((is_1745_[1] * anInt9613 + is_1745_[4] * anInt9614
			    + is_1745_[7] * anInt9576 + 8192)
			   >> 14);
		    int i_1769_
			= ((is_1745_[2] * anInt9613 + is_1745_[5] * anInt9614
			    + is_1745_[8] * anInt9576 + 8192)
			   >> 14);
		    i_1767_ += i_1764_;
		    i_1768_ += i_1765_;
		    i_1769_ += i_1766_;
		    anInt9613 = i_1767_;
		    anInt9614 = i_1768_;
		    anInt9576 = i_1769_;
		    aBool9554 = false;
		}
		int[] is_1770_ = new int[9];
		int i_1771_ = Class436.anIntArray4838[i_1741_];
		int i_1772_ = Class436.anIntArray4831[i_1741_];
		int i_1773_ = Class436.anIntArray4838[i_1742_];
		int i_1774_ = Class436.anIntArray4831[i_1742_];
		int i_1775_ = Class436.anIntArray4838[i_1743_];
		int i_1776_ = Class436.anIntArray4831[i_1743_];
		int i_1777_ = i_1772_ * i_1775_ + 8192 >> 14;
		int i_1778_ = i_1772_ * i_1776_ + 8192 >> 14;
		is_1770_[0]
		    = i_1773_ * i_1775_ + i_1774_ * i_1778_ + 8192 >> 14;
		is_1770_[1]
		    = -i_1773_ * i_1776_ + i_1774_ * i_1777_ + 8192 >> 14;
		is_1770_[2] = i_1774_ * i_1771_ + 8192 >> 14;
		is_1770_[3] = i_1771_ * i_1776_ + 8192 >> 14;
		is_1770_[4] = i_1771_ * i_1775_ + 8192 >> 14;
		is_1770_[5] = -i_1772_;
		is_1770_[6]
		    = -i_1774_ * i_1775_ + i_1773_ * i_1778_ + 8192 >> 14;
		is_1770_[7]
		    = i_1774_ * i_1776_ + i_1773_ * i_1777_ + 8192 >> 14;
		is_1770_[8] = i_1773_ * i_1771_ + 8192 >> 14;
		int i_1779_
		    = ((is_1770_[0] * -anInt9613 + is_1770_[1] * -anInt9614
			+ is_1770_[2] * -anInt9576 + 8192)
		       >> 14);
		int i_1780_
		    = ((is_1770_[3] * -anInt9613 + is_1770_[4] * -anInt9614
			+ is_1770_[5] * -anInt9576 + 8192)
		       >> 14);
		int i_1781_
		    = ((is_1770_[6] * -anInt9613 + is_1770_[7] * -anInt9614
			+ is_1770_[8] * -anInt9576 + 8192)
		       >> 14);
		int i_1782_ = i_1779_ + anInt9613;
		int i_1783_ = i_1780_ + anInt9614;
		int i_1784_ = i_1781_ + anInt9576;
		int[] is_1785_ = new int[9];
		for (int i_1786_ = 0; i_1786_ < 3; i_1786_++) {
		    for (int i_1787_ = 0; i_1787_ < 3; i_1787_++) {
			int i_1788_ = 0;
			for (int i_1789_ = 0; i_1789_ < 3; i_1789_++)
			    i_1788_ += (is_1770_[i_1786_ * 3 + i_1789_]
					* is_1745_[i_1787_ * 3 + i_1789_]);
			is_1785_[i_1786_ * 3 + i_1787_] = i_1788_ + 8192 >> 14;
		    }
		}
		int i_1790_ = ((is_1770_[0] * i_1764_ + is_1770_[1] * i_1765_
				+ is_1770_[2] * i_1766_ + 8192)
			       >> 14);
		int i_1791_ = ((is_1770_[3] * i_1764_ + is_1770_[4] * i_1765_
				+ is_1770_[5] * i_1766_ + 8192)
			       >> 14);
		int i_1792_ = ((is_1770_[6] * i_1764_ + is_1770_[7] * i_1765_
				+ is_1770_[8] * i_1766_ + 8192)
			       >> 14);
		i_1790_ += i_1782_;
		i_1791_ += i_1783_;
		i_1792_ += i_1784_;
		int[] is_1793_ = new int[9];
		for (int i_1794_ = 0; i_1794_ < 3; i_1794_++) {
		    for (int i_1795_ = 0; i_1795_ < 3; i_1795_++) {
			int i_1796_ = 0;
			for (int i_1797_ = 0; i_1797_ < 3; i_1797_++)
			    i_1796_ += (is_1745_[i_1794_ * 3 + i_1797_]
					* is_1785_[i_1795_ + i_1797_ * 3]);
			is_1793_[i_1794_ * 3 + i_1795_] = i_1796_ + 8192 >> 14;
		    }
		}
		int i_1798_ = ((is_1745_[0] * i_1790_ + is_1745_[1] * i_1791_
				+ is_1745_[2] * i_1792_ + 8192)
			       >> 14);
		int i_1799_ = ((is_1745_[3] * i_1790_ + is_1745_[4] * i_1791_
				+ is_1745_[5] * i_1792_ + 8192)
			       >> 14);
		int i_1800_ = ((is_1745_[6] * i_1790_ + is_1745_[7] * i_1791_
				+ is_1745_[8] * i_1792_ + 8192)
			       >> 14);
		i_1798_ += i_1761_;
		i_1799_ += i_1762_;
		i_1800_ += i_1763_;
		for (int i_1801_ = 0; i_1801_ < i_1746_; i_1801_++) {
		    int i_1802_ = is[i_1801_];
		    if (i_1802_ < anIntArrayArray9553.length) {
			int[] is_1803_ = anIntArrayArray9553[i_1802_];
			for (int i_1804_ = 0; i_1804_ < is_1803_.length;
			     i_1804_++) {
			    int i_1805_ = is_1803_[i_1804_];
			    if (aShortArray9548 == null
				|| (i_1744_ & aShortArray9548[i_1805_]) != 0) {
				int i_1806_
				    = ((is_1793_[0] * anIntArray9550[i_1805_]
					+ is_1793_[1] * anIntArray9551[i_1805_]
					+ is_1793_[2] * anIntArray9541[i_1805_]
					+ 8192)
				       >> 14);
				int i_1807_
				    = ((is_1793_[3] * anIntArray9550[i_1805_]
					+ is_1793_[4] * anIntArray9551[i_1805_]
					+ is_1793_[5] * anIntArray9541[i_1805_]
					+ 8192)
				       >> 14);
				int i_1808_
				    = ((is_1793_[6] * anIntArray9550[i_1805_]
					+ is_1793_[7] * anIntArray9551[i_1805_]
					+ is_1793_[8] * anIntArray9541[i_1805_]
					+ 8192)
				       >> 14);
				i_1806_ += i_1798_;
				i_1807_ += i_1799_;
				i_1808_ += i_1800_;
				anIntArray9550[i_1805_] = i_1806_;
				anIntArray9551[i_1805_] = i_1807_;
				anIntArray9541[i_1805_] = i_1808_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1809_ = 0; i_1809_ < i_1746_; i_1809_++) {
		    int i_1810_ = is[i_1809_];
		    if (i_1810_ < anIntArrayArray9553.length) {
			int[] is_1811_ = anIntArrayArray9553[i_1810_];
			for (int i_1812_ = 0; i_1812_ < is_1811_.length;
			     i_1812_++) {
			    int i_1813_ = is_1811_[i_1812_];
			    if (aShortArray9548 == null
				|| (i_1744_ & aShortArray9548[i_1813_]) != 0) {
				anIntArray9550[i_1813_] -= anInt9613;
				anIntArray9551[i_1813_] -= anInt9614;
				anIntArray9541[i_1813_] -= anInt9576;
				if (i_1743_ != 0) {
				    int i_1814_
					= Class436.anIntArray4831[i_1743_];
				    int i_1815_
					= Class436.anIntArray4838[i_1743_];
				    int i_1816_
					= ((anIntArray9551[i_1813_] * i_1814_
					    + anIntArray9550[i_1813_] * i_1815_
					    + 16383)
					   >> 14);
				    anIntArray9551[i_1813_]
					= (anIntArray9551[i_1813_] * i_1815_
					   - anIntArray9550[i_1813_] * i_1814_
					   + 16383) >> 14;
				    anIntArray9550[i_1813_] = i_1816_;
				}
				if (i_1741_ != 0) {
				    int i_1817_
					= Class436.anIntArray4831[i_1741_];
				    int i_1818_
					= Class436.anIntArray4838[i_1741_];
				    int i_1819_
					= ((anIntArray9551[i_1813_] * i_1818_
					    - anIntArray9541[i_1813_] * i_1817_
					    + 16383)
					   >> 14);
				    anIntArray9541[i_1813_]
					= (anIntArray9551[i_1813_] * i_1817_
					   + anIntArray9541[i_1813_] * i_1818_
					   + 16383) >> 14;
				    anIntArray9551[i_1813_] = i_1819_;
				}
				if (i_1742_ != 0) {
				    int i_1820_
					= Class436.anIntArray4831[i_1742_];
				    int i_1821_
					= Class436.anIntArray4838[i_1742_];
				    int i_1822_
					= ((anIntArray9541[i_1813_] * i_1820_
					    + anIntArray9550[i_1813_] * i_1821_
					    + 16383)
					   >> 14);
				    anIntArray9541[i_1813_]
					= (anIntArray9541[i_1813_] * i_1821_
					   - anIntArray9550[i_1813_] * i_1820_
					   + 16383) >> 14;
				    anIntArray9550[i_1813_] = i_1822_;
				}
				anIntArray9550[i_1813_] += anInt9613;
				anIntArray9551[i_1813_] += anInt9614;
				anIntArray9541[i_1813_] += anInt9576;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1823_ = 0; i_1823_ < i_1746_; i_1823_++) {
			int i_1824_ = is[i_1823_];
			if (i_1824_ < anIntArrayArray9553.length) {
			    int[] is_1825_ = anIntArrayArray9553[i_1824_];
			    for (int i_1826_ = 0; i_1826_ < is_1825_.length;
				 i_1826_++) {
				int i_1827_ = is_1825_[i_1826_];
				if (aShortArray9548 == null
				    || ((i_1744_ & aShortArray9548[i_1827_])
					!= 0)) {
				    int i_1828_ = anIntArray9598[i_1827_];
				    int i_1829_ = anIntArray9598[i_1827_ + 1];
				    for (int i_1830_ = i_1828_;
					 (i_1830_ < i_1829_
					  && aShortArray9599[i_1830_] != 0);
					 i_1830_++) {
					int i_1831_ = (aShortArray9599[i_1830_]
						       & 0xffff) - 1;
					if (i_1743_ != 0) {
					    int i_1832_
						= (Class436.anIntArray4831
						   [i_1743_]);
					    int i_1833_
						= (Class436.anIntArray4838
						   [i_1743_]);
					    int i_1834_
						= (((aShortArray9559[i_1831_]
						     * i_1832_)
						    + (aShortArray9617[i_1831_]
						       * i_1833_)
						    + 16383)
						   >> 14);
					    aShortArray9559[i_1831_]
						= (short) ((((aShortArray9559
							      [i_1831_])
							     * i_1833_)
							    - ((aShortArray9617
								[i_1831_])
							       * i_1832_)
							    + 16383)
							   >> 14);
					    aShortArray9617[i_1831_]
						= (short) i_1834_;
					}
					if (i_1741_ != 0) {
					    int i_1835_
						= (Class436.anIntArray4831
						   [i_1741_]);
					    int i_1836_
						= (Class436.anIntArray4838
						   [i_1741_]);
					    int i_1837_
						= (((aShortArray9559[i_1831_]
						     * i_1836_)
						    - (aShortArray9560[i_1831_]
						       * i_1835_)
						    + 16383)
						   >> 14);
					    aShortArray9560[i_1831_]
						= (short) ((((aShortArray9559
							      [i_1831_])
							     * i_1835_)
							    + ((aShortArray9560
								[i_1831_])
							       * i_1836_)
							    + 16383)
							   >> 14);
					    aShortArray9559[i_1831_]
						= (short) i_1837_;
					}
					if (i_1742_ != 0) {
					    int i_1838_
						= (Class436.anIntArray4831
						   [i_1742_]);
					    int i_1839_
						= (Class436.anIntArray4838
						   [i_1742_]);
					    int i_1840_
						= (((aShortArray9560[i_1831_]
						     * i_1838_)
						    + (aShortArray9617[i_1831_]
						       * i_1839_)
						    + 16383)
						   >> 14);
					    aShortArray9560[i_1831_]
						= (short) ((((aShortArray9560
							      [i_1831_])
							     * i_1839_)
							    - ((aShortArray9617
								[i_1831_])
							       * i_1838_)
							    + 16383)
							   >> 14);
					    aShortArray9617[i_1831_]
						= (short) i_1840_;
					}
				    }
				}
			    }
			}
		    }
		    method15273();
		}
	    }
	} else if (i == 3) {
	    if (is_1745_ != null) {
		int i_1841_ = is_1745_[9] << 4;
		int i_1842_ = is_1745_[10] << 4;
		int i_1843_ = is_1745_[11] << 4;
		int i_1844_ = is_1745_[12] << 4;
		int i_1845_ = is_1745_[13] << 4;
		int i_1846_ = is_1745_[14] << 4;
		if (aBool9554) {
		    int i_1847_
			= ((is_1745_[0] * anInt9613 + is_1745_[3] * anInt9614
			    + is_1745_[6] * anInt9576 + 8192)
			   >> 14);
		    int i_1848_
			= ((is_1745_[1] * anInt9613 + is_1745_[4] * anInt9614
			    + is_1745_[7] * anInt9576 + 8192)
			   >> 14);
		    int i_1849_
			= ((is_1745_[2] * anInt9613 + is_1745_[5] * anInt9614
			    + is_1745_[8] * anInt9576 + 8192)
			   >> 14);
		    i_1847_ += i_1844_;
		    i_1848_ += i_1845_;
		    i_1849_ += i_1846_;
		    anInt9613 = i_1847_;
		    anInt9614 = i_1848_;
		    anInt9576 = i_1849_;
		    aBool9554 = false;
		}
		int i_1850_ = i_1741_ << 15 >> 7;
		int i_1851_ = i_1742_ << 15 >> 7;
		int i_1852_ = i_1743_ << 15 >> 7;
		int i_1853_ = i_1850_ * -anInt9613 + 8192 >> 14;
		int i_1854_ = i_1851_ * -anInt9614 + 8192 >> 14;
		int i_1855_ = i_1852_ * -anInt9576 + 8192 >> 14;
		int i_1856_ = i_1853_ + anInt9613;
		int i_1857_ = i_1854_ + anInt9614;
		int i_1858_ = i_1855_ + anInt9576;
		int[] is_1859_ = new int[9];
		is_1859_[0] = i_1850_ * is_1745_[0] + 8192 >> 14;
		is_1859_[1] = i_1850_ * is_1745_[3] + 8192 >> 14;
		is_1859_[2] = i_1850_ * is_1745_[6] + 8192 >> 14;
		is_1859_[3] = i_1851_ * is_1745_[1] + 8192 >> 14;
		is_1859_[4] = i_1851_ * is_1745_[4] + 8192 >> 14;
		is_1859_[5] = i_1851_ * is_1745_[7] + 8192 >> 14;
		is_1859_[6] = i_1852_ * is_1745_[2] + 8192 >> 14;
		is_1859_[7] = i_1852_ * is_1745_[5] + 8192 >> 14;
		is_1859_[8] = i_1852_ * is_1745_[8] + 8192 >> 14;
		int i_1860_ = i_1850_ * i_1844_ + 8192 >> 14;
		int i_1861_ = i_1851_ * i_1845_ + 8192 >> 14;
		int i_1862_ = i_1852_ * i_1846_ + 8192 >> 14;
		i_1860_ += i_1856_;
		i_1861_ += i_1857_;
		i_1862_ += i_1858_;
		int[] is_1863_ = new int[9];
		for (int i_1864_ = 0; i_1864_ < 3; i_1864_++) {
		    for (int i_1865_ = 0; i_1865_ < 3; i_1865_++) {
			int i_1866_ = 0;
			for (int i_1867_ = 0; i_1867_ < 3; i_1867_++)
			    i_1866_ += (is_1745_[i_1864_ * 3 + i_1867_]
					* is_1859_[i_1865_ + i_1867_ * 3]);
			is_1863_[i_1864_ * 3 + i_1865_] = i_1866_ + 8192 >> 14;
		    }
		}
		int i_1868_ = ((is_1745_[0] * i_1860_ + is_1745_[1] * i_1861_
				+ is_1745_[2] * i_1862_ + 8192)
			       >> 14);
		int i_1869_ = ((is_1745_[3] * i_1860_ + is_1745_[4] * i_1861_
				+ is_1745_[5] * i_1862_ + 8192)
			       >> 14);
		int i_1870_ = ((is_1745_[6] * i_1860_ + is_1745_[7] * i_1861_
				+ is_1745_[8] * i_1862_ + 8192)
			       >> 14);
		i_1868_ += i_1841_;
		i_1869_ += i_1842_;
		i_1870_ += i_1843_;
		for (int i_1871_ = 0; i_1871_ < i_1746_; i_1871_++) {
		    int i_1872_ = is[i_1871_];
		    if (i_1872_ < anIntArrayArray9553.length) {
			int[] is_1873_ = anIntArrayArray9553[i_1872_];
			for (int i_1874_ = 0; i_1874_ < is_1873_.length;
			     i_1874_++) {
			    int i_1875_ = is_1873_[i_1874_];
			    if (aShortArray9548 == null
				|| (i_1744_ & aShortArray9548[i_1875_]) != 0) {
				int i_1876_
				    = ((is_1863_[0] * anIntArray9550[i_1875_]
					+ is_1863_[1] * anIntArray9551[i_1875_]
					+ is_1863_[2] * anIntArray9541[i_1875_]
					+ 8192)
				       >> 14);
				int i_1877_
				    = ((is_1863_[3] * anIntArray9550[i_1875_]
					+ is_1863_[4] * anIntArray9551[i_1875_]
					+ is_1863_[5] * anIntArray9541[i_1875_]
					+ 8192)
				       >> 14);
				int i_1878_
				    = ((is_1863_[6] * anIntArray9550[i_1875_]
					+ is_1863_[7] * anIntArray9551[i_1875_]
					+ is_1863_[8] * anIntArray9541[i_1875_]
					+ 8192)
				       >> 14);
				i_1876_ += i_1868_;
				i_1877_ += i_1869_;
				i_1878_ += i_1870_;
				anIntArray9550[i_1875_] = i_1876_;
				anIntArray9551[i_1875_] = i_1877_;
				anIntArray9541[i_1875_] = i_1878_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1879_ = 0; i_1879_ < i_1746_; i_1879_++) {
		    int i_1880_ = is[i_1879_];
		    if (i_1880_ < anIntArrayArray9553.length) {
			int[] is_1881_ = anIntArrayArray9553[i_1880_];
			for (int i_1882_ = 0; i_1882_ < is_1881_.length;
			     i_1882_++) {
			    int i_1883_ = is_1881_[i_1882_];
			    if (aShortArray9548 == null
				|| (i_1744_ & aShortArray9548[i_1883_]) != 0) {
				anIntArray9550[i_1883_] -= anInt9613;
				anIntArray9551[i_1883_] -= anInt9614;
				anIntArray9541[i_1883_] -= anInt9576;
				anIntArray9550[i_1883_]
				    = anIntArray9550[i_1883_] * i_1741_ >> 7;
				anIntArray9551[i_1883_]
				    = anIntArray9551[i_1883_] * i_1742_ >> 7;
				anIntArray9541[i_1883_]
				    = anIntArray9541[i_1883_] * i_1743_ >> 7;
				anIntArray9550[i_1883_] += anInt9613;
				anIntArray9551[i_1883_] += anInt9614;
				anIntArray9541[i_1883_] += anInt9576;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9573 != null) {
		boolean bool_1884_ = false;
		for (int i_1885_ = 0; i_1885_ < i_1746_; i_1885_++) {
		    int i_1886_ = is[i_1885_];
		    if (i_1886_ < anIntArrayArray9573.length) {
			int[] is_1887_ = anIntArrayArray9573[i_1886_];
			for (int i_1888_ = 0; i_1888_ < is_1887_.length;
			     i_1888_++) {
			    int i_1889_ = is_1887_[i_1888_];
			    if (aShortArray9615 == null
				|| (i_1744_ & aShortArray9615[i_1889_]) != 0) {
				int i_1890_ = ((aByteArray9568[i_1889_] & 0xff)
					       + i_1741_ * 8);
				if (i_1890_ < 0)
				    i_1890_ = 0;
				else if (i_1890_ > 255)
				    i_1890_ = 255;
				aByteArray9568[i_1889_] = (byte) i_1890_;
			    }
			}
			bool_1884_ = bool_1884_ | is_1887_.length > 0;
		    }
		}
		if (bool_1884_) {
		    if (aClass359Array9604 != null) {
			for (int i_1891_ = 0; i_1891_ < anInt9603; i_1891_++) {
			    Class359 class359 = aClass359Array9604[i_1891_];
			    Class349 class349 = aClass349Array9574[i_1891_];
			    class349.anInt3739
				= (class349.anInt3739 & 0xffffff
				   | 255 - (aByteArray9568[class359.anInt3805]
					    & 0xff) << 24);
			}
		    }
		    method15290();
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9573 != null) {
		boolean bool_1892_ = false;
		for (int i_1893_ = 0; i_1893_ < i_1746_; i_1893_++) {
		    int i_1894_ = is[i_1893_];
		    if (i_1894_ < anIntArrayArray9573.length) {
			int[] is_1895_ = anIntArrayArray9573[i_1894_];
			for (int i_1896_ = 0; i_1896_ < is_1895_.length;
			     i_1896_++) {
			    int i_1897_ = is_1895_[i_1896_];
			    if (aShortArray9615 == null
				|| (i_1744_ & aShortArray9615[i_1897_]) != 0) {
				int i_1898_
				    = aShortArray9552[i_1897_] & 0xffff;
				int i_1899_ = i_1898_ >> 10 & 0x3f;
				int i_1900_ = i_1898_ >> 7 & 0x7;
				int i_1901_ = i_1898_ & 0x7f;
				i_1899_ = i_1899_ + i_1741_ & 0x3f;
				i_1900_ += i_1742_ / 4;
				if (i_1900_ < 0)
				    i_1900_ = 0;
				else if (i_1900_ > 7)
				    i_1900_ = 7;
				i_1901_ += i_1743_;
				if (i_1901_ < 0)
				    i_1901_ = 0;
				else if (i_1901_ > 127)
				    i_1901_ = 127;
				aShortArray9552[i_1897_]
				    = (short) (i_1899_ << 10 | i_1900_ << 7
					       | i_1901_);
			    }
			}
			bool_1892_ = bool_1892_ | is_1895_.length > 0;
		    }
		}
		if (bool_1892_) {
		    if (aClass359Array9604 != null) {
			for (int i_1902_ = 0; i_1902_ < anInt9603; i_1902_++) {
			    Class359 class359 = aClass359Array9604[i_1902_];
			    Class349 class349 = aClass349Array9574[i_1902_];
			    class349.anInt3739
				= (class349.anInt3739 & ~0xffffff
				   | (Class642.anIntArray8324
				      [(aShortArray9552[class359.anInt3805]
					& 0xffff)]) & 0xffffff);
			}
		    }
		    method15290();
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9543 != null) {
		for (int i_1903_ = 0; i_1903_ < i_1746_; i_1903_++) {
		    int i_1904_ = is[i_1903_];
		    if (i_1904_ < anIntArrayArray9543.length) {
			int[] is_1905_ = anIntArrayArray9543[i_1904_];
			for (int i_1906_ = 0; i_1906_ < is_1905_.length;
			     i_1906_++) {
			    Class349 class349
				= aClass349Array9574[is_1905_[i_1906_]];
			    class349.anInt3738 += i_1741_;
			    class349.anInt3735 += i_1742_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9543 != null) {
		for (int i_1907_ = 0; i_1907_ < i_1746_; i_1907_++) {
		    int i_1908_ = is[i_1907_];
		    if (i_1908_ < anIntArrayArray9543.length) {
			int[] is_1909_ = anIntArrayArray9543[i_1908_];
			for (int i_1910_ = 0; i_1910_ < is_1909_.length;
			     i_1910_++) {
			    Class349 class349
				= aClass349Array9574[is_1909_[i_1910_]];
			    class349.anInt3740
				= class349.anInt3740 * i_1741_ >> 7;
			    class349.anInt3737
				= class349.anInt3737 * i_1742_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9543 != null) {
		for (int i_1911_ = 0; i_1911_ < i_1746_; i_1911_++) {
		    int i_1912_ = is[i_1911_];
		    if (i_1912_ < anIntArrayArray9543.length) {
			int[] is_1913_ = anIntArrayArray9543[i_1912_];
			for (int i_1914_ = 0; i_1914_ < is_1913_.length;
			     i_1914_++) {
			    Class349 class349
				= aClass349Array9574[is_1913_[i_1914_]];
			    class349.anInt3736
				= class349.anInt3736 + i_1741_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    public void method2995(int i) {
	int i_1915_ = Class436.anIntArray4831[i];
	int i_1916_ = Class436.anIntArray4838[i];
	for (int i_1917_ = 0; i_1917_ < anInt9549; i_1917_++) {
	    int i_1918_ = ((anIntArray9541[i_1917_] * i_1915_
			    + anIntArray9550[i_1917_] * i_1916_)
			   >> 14);
	    anIntArray9541[i_1917_]
		= (anIntArray9541[i_1917_] * i_1916_
		   - anIntArray9550[i_1917_] * i_1915_) >> 14;
	    anIntArray9550[i_1917_] = i_1918_;
	}
	for (int i_1919_ = 0; i_1919_ < anInt9555; i_1919_++) {
	    int i_1920_ = ((aShortArray9560[i_1919_] * i_1915_
			    + aShortArray9617[i_1919_] * i_1916_)
			   >> 14);
	    aShortArray9560[i_1919_]
		= (short) ((aShortArray9560[i_1919_] * i_1916_
			    - aShortArray9617[i_1919_] * i_1915_)
			   >> 14);
	    aShortArray9617[i_1919_] = (short) i_1920_;
	}
	method15326();
	method15273();
	aBool9586 = false;
    }
    
    int method15331(int i, short i_1921_, int i_1922_) {
	int i_1923_
	    = aClass182_Sub1_9585.anIntArray9157[method15279(i, i_1922_)];
	if (i_1921_ != -1) {
	    Class166 class166 = aClass182_Sub1_9585.aClass180_1944
				    .method3116(i_1921_ & 0xffff, -1431554601);
	    int i_1924_ = class166.aByte1785 & 0xff;
	    if (i_1924_ != 0) {
		int i_1925_ = 131586 * i_1922_;
		if (i_1922_ < 0)
		    i_1925_ = 0;
		else if (i_1922_ > 127)
		    i_1925_ = 16777215;
		else
		    i_1925_ = 131586 * i_1922_;
		if (i_1924_ == 256)
		    i_1923_ = i_1925_;
		else {
		    int i_1926_ = i_1924_;
		    int i_1927_ = 256 - i_1924_;
		    i_1923_ = ((((i_1925_ & 0xff00ff) * i_1926_
				 + (i_1923_ & 0xff00ff) * i_1927_)
				& ~0xff00ff)
			       + (((i_1925_ & 0xff00) * i_1926_
				   + (i_1923_ & 0xff00) * i_1927_)
				  & 0xff0000)) >> 8;
		}
	    }
	    int i_1928_ = class166.aByte1831 & 0xff;
	    if (i_1928_ != 0) {
		i_1928_ += 256;
		int i_1929_ = ((i_1923_ & 0xff0000) >> 16) * i_1928_;
		if (i_1929_ > 65535)
		    i_1929_ = 65535;
		int i_1930_ = ((i_1923_ & 0xff00) >> 8) * i_1928_;
		if (i_1930_ > 65535)
		    i_1930_ = 65535;
		int i_1931_ = (i_1923_ & 0xff) * i_1928_;
		if (i_1931_ > 65535)
		    i_1931_ = 65535;
		i_1923_
		    = (i_1929_ << 8 & 0xff0000) + (i_1930_ & 0xff00) + (i_1931_
									>> 8);
	    }
	}
	return i_1923_ & 0xffffff;
    }
    
    int method15332(int i, short i_1932_, int i_1933_) {
	int i_1934_
	    = aClass182_Sub1_9585.anIntArray9157[method15279(i, i_1933_)];
	if (i_1932_ != -1) {
	    Class166 class166 = aClass182_Sub1_9585.aClass180_1944
				    .method3116(i_1932_ & 0xffff, -1431554601);
	    int i_1935_ = class166.aByte1785 & 0xff;
	    if (i_1935_ != 0) {
		int i_1936_ = 131586 * i_1933_;
		if (i_1933_ < 0)
		    i_1936_ = 0;
		else if (i_1933_ > 127)
		    i_1936_ = 16777215;
		else
		    i_1936_ = 131586 * i_1933_;
		if (i_1935_ == 256)
		    i_1934_ = i_1936_;
		else {
		    int i_1937_ = i_1935_;
		    int i_1938_ = 256 - i_1935_;
		    i_1934_ = ((((i_1936_ & 0xff00ff) * i_1937_
				 + (i_1934_ & 0xff00ff) * i_1938_)
				& ~0xff00ff)
			       + (((i_1936_ & 0xff00) * i_1937_
				   + (i_1934_ & 0xff00) * i_1938_)
				  & 0xff0000)) >> 8;
		}
	    }
	    int i_1939_ = class166.aByte1831 & 0xff;
	    if (i_1939_ != 0) {
		i_1939_ += 256;
		int i_1940_ = ((i_1934_ & 0xff0000) >> 16) * i_1939_;
		if (i_1940_ > 65535)
		    i_1940_ = 65535;
		int i_1941_ = ((i_1934_ & 0xff00) >> 8) * i_1939_;
		if (i_1941_ > 65535)
		    i_1941_ = 65535;
		int i_1942_ = (i_1934_ & 0xff) * i_1939_;
		if (i_1942_ > 65535)
		    i_1942_ = 65535;
		i_1934_
		    = (i_1940_ << 8 & 0xff0000) + (i_1941_ & 0xff00) + (i_1942_
									>> 8);
	    }
	}
	return i_1934_ & 0xffffff;
    }
}
