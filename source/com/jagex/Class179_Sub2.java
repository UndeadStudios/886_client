/* Class179_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class179_Sub2 extends Class179
{
    Class128 aClass128_9360;
    boolean aBool9361 = false;
    Class110 aClass110_9362;
    Class110 aClass110_9363;
    int anInt9364;
    static int anInt9365 = 4096;
    static int anInt9366 = 4096;
    static final int anInt9367 = -1;
    short aShort9368;
    boolean aBool9369;
    static final int anInt9370 = 7;
    Class100[] aClass100Array9371;
    static final int anInt9372 = 618648;
    int anInt9373;
    int anInt9374;
    int anInt9375;
    byte[] aByteArray9376;
    int anInt9377;
    short[] aShortArray9378;
    int[] anIntArray9379;
    boolean aBool9380;
    short aShort9381;
    short[] aShortArray9382;
    int anInt9383;
    int[] anIntArray9384;
    int anInt9385;
    Class184[] aClass184Array9386;
    short[] aShortArray9387;
    short[] aShortArray9388;
    Class179_Sub2[] aClass179_Sub2Array9389;
    float[][] aFloatArrayArray9390;
    int[] anIntArray9391;
    int[] anIntArray9392;
    int[] anIntArray9393;
    int anInt9394 = 0;
    int[] anIntArray9395;
    static final int anInt9396 = 2;
    int[][] anIntArrayArray9397;
    Class115[] aClass115Array9398;
    byte[] aByteArray9399;
    float[] aFloatArray9400;
    float[][] aFloatArrayArray9401;
    short[] aShortArray9402;
    short[] aShortArray9403;
    short[] aShortArray9404;
    short[] aShortArray9405;
    byte[] aByteArray9406;
    static int anInt9407 = 0;
    boolean aBool9408;
    boolean aBool9409;
    int[] anIntArray9410;
    int anInt9411;
    int anInt9412;
    short aShort9413;
    boolean aBool9414;
    Class154[] aClass154Array9415;
    int anInt9416;
    Class103[] aClass103Array9417;
    static final int anInt9418 = 1;
    int[][] anIntArrayArray9419;
    boolean aBool9420;
    short aShort9421;
    Class100[] aClass100Array9422;
    short aShort9423;
    int[] anIntArray9424;
    int anInt9425;
    short aShort9426;
    static final int anInt9427 = 4;
    static final int anInt9428 = 0;
    boolean aBool9429;
    short aShort9430;
    short aShort9431;
    short aShort9432;
    Class182_Sub2 aClass182_Sub2_9433;
    int[] anIntArray9434;
    float[] aFloatArray9435;
    static final int anInt9436 = 618520;
    float[] aFloatArray9437;
    float[] aFloatArray9438;
    int[] anIntArray9439;
    static final int anInt9440 = -2;
    Class107[] aClass107Array9441;
    int[] anIntArray9442;
    int[] anIntArray9443;
    int[] anIntArray9444;
    int[][] anIntArrayArray9445;
    Class179_Sub2[] aClass179_Sub2Array9446;
    
    final boolean method15064(int i) {
	if (aByteArray9406 == null)
	    return false;
	if (aByteArray9406[i] == 0)
	    return false;
	return true;
    }
    
    Class179_Sub2(Class182_Sub2 class182_sub2, Class186 class186, int i,
		  int i_0_, int i_1_, int i_2_) {
	anInt9377 = 0;
	anInt9375 = 0;
	anInt9385 = 0;
	anInt9364 = 0;
	aBool9409 = false;
	aBool9414 = false;
	aBool9420 = false;
	aBool9429 = false;
	aBool9369 = false;
	aBool9380 = false;
	aClass182_Sub2_9433 = class182_sub2;
	anInt9373 = i;
	anInt9374 = i_0_;
	anInt9383 = i_1_;
	Class180 class180 = aClass182_Sub2_9433.aClass180_1944;
	Interface47 interface47 = aClass182_Sub2_9433.anInterface47_1945;
	anInt9394 = class186.anInt2084;
	anInt9377 = class186.anInt2087;
	anIntArray9424 = class186.anIntArray2089;
	anIntArray9379 = class186.anIntArray2090;
	anIntArray9395 = class186.anIntArray2108;
	anInt9375 = class186.anInt2098;
	aShortArray9382 = class186.aShortArray2111;
	aShortArray9387 = class186.aShortArray2100;
	aShortArray9388 = class186.aShortArray2101;
	aByteArray9376 = class186.aByteArray2106;
	aShortArray9403 = class186.aShortArray2109;
	aByteArray9406 = class186.aByteArray2099;
	aShortArray9404 = class186.aShortArray2113;
	aByteArray9399 = class186.aByteArray2107;
	aClass184Array9386 = class186.aClass184Array2129;
	aClass154Array9415 = class186.aClass154Array2093;
	aShortArray9378 = class186.aShortArray2094;
	anInt9385 = anInt9375;
	int[] is = new int[anInt9375];
	for (int i_3_ = 0; i_3_ < anInt9375; i_3_++)
	    is[i_3_] = i_3_;
	long[] ls = new long[anInt9375];
	boolean bool = (anInt9373 & 0x100) != 0;
	for (int i_4_ = 0; i_4_ < anInt9375; i_4_++) {
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
				aBool9369 = true;
			}
		    }
		}
		if (bool_10_) {
		    ls[i_4_] = 9223372036854775807L;
		    anInt9385--;
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
			    = (aClass182_Sub2_9433.anInterface48_1946.method340
			       (class184.anInt2064 * -1912121795, 2116345368));
			if (class382.aBool3983)
			    bool_13_ = true;
		    }
		}
		if (bool_13_) {
		    ls[i_4_] = 9223372036854775807L;
		    anInt9385--;
		    continue;
		}
	    }
	    int i_15_ = -1;
	    if (class186.aShortArray2110 != null) {
		i_15_ = class186.aShortArray2110[i_5_];
		if (i_15_ != -1) {
		    class166
			= class180.method3116(i_15_ & 0xffff, -1431554601);
		    if ((i_2_ & 0x40) == 0 || !class166.aBool1819) {
			i_8_ = class166.aByte1825;
			i_9_ = class166.aByte1826;
		    } else
			i_15_ = -1;
		}
	    }
	    boolean bool_16_
		= (aByteArray9406 != null && aByteArray9406[i_5_] != 0
		   || (class166 != null
		       && class166.aClass597_1807 == Class597.aClass597_7841));
	    if ((bool || bool_16_) && aByteArray9376 != null)
		i_6_ += aByteArray9376[i_5_] << 17;
	    if (bool_16_)
		i_6_ += 65536;
	    i_6_ += (i_8_ & 0xff) << 8;
	    i_6_ += i_9_ & 0xff;
	    i_7_ += (i_15_ & 0xffff) << 16;
	    i_7_ += i_4_ & 0xffff;
	    ls[i_4_] = ((long) i_6_ << 32) + (long) i_7_;
	    aBool9369 |= bool_16_;
	}
	Class28.method912(ls, is, (byte) 1);
	if (class186.aClass171Array2088 != null) {
	    anInt9416 = class186.aClass171Array2088.length;
	    aClass103Array9417 = new Class103[anInt9416];
	    aClass107Array9441 = new Class107[anInt9416];
	    for (int i_17_ = 0; i_17_ < class186.aClass171Array2088.length;
		 i_17_++) {
		Class171 class171 = class186.aClass171Array2088[i_17_];
		Class394 class394
		    = interface47.method338(class171.anInt1855 * -145881707,
					    (short) 800);
		int i_18_ = ((Class381.anIntArray3929
			      [(class186.aShortArray2109
				[class171.anInt1856 * 553052305]) & 0xffff])
			     & 0xffffff);
		i_18_ = i_18_ | 255 - (class186.aByteArray2099 != null
				       ? ((class186.aByteArray2099
					   [class171.anInt1856 * 553052305])
					  & 0xff)
				       : 0) << 24;
		aClass103Array9417[i_17_]
		    = new Class103(class171.anInt1856 * 553052305,
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
				   class394.aBool4099,
				   class171.anInt1858 * -998013967);
		aClass107Array9441[i_17_] = new Class107(i_18_);
	    }
	}
	aFloatArrayArray9401 = new float[anInt9375][];
	aFloatArrayArray9390 = new float[anInt9375][];
	Class207 class207 = method2976(class186, is, anInt9375);
	Class110 class110
	    = aClass182_Sub2_9433.method15223(Thread.currentThread());
	float[] fs = class110.aFloatArray1325;
	boolean bool_19_ = false;
	for (int i_20_ = 0; i_20_ < anInt9375; i_20_++) {
	    int i_21_ = is[i_20_];
	    int i_22_ = (class186.aShortArray2110 != null
			 ? class186.aShortArray2110[i_21_] : -1);
	    if (i_22_ != -1 && (i_2_ & 0x40) != 0
		&& class180.method3116(i_22_ & 0xffff, -1431554601).aBool1819)
		i_22_ = -1;
	    if (i_22_ != -1) {
		int i_23_ = (class186.aShortArray2122 != null
			     ? class186.aShortArray2122[i_21_] : -1);
		bool_19_ = true;
		float[] fs_24_ = aFloatArrayArray9401[i_21_] = new float[3];
		float[] fs_25_ = aFloatArrayArray9390[i_21_] = new float[3];
		if (i_23_ == 32766) {
		    int i_26_ = class186.aByteArray2102[i_21_] & 0xff;
		    int i_27_ = class186.aByteArray2092[i_21_] & 0xff;
		    int i_28_ = class186.aByteArray2104[i_21_] & 0xff;
		    i_26_ += (class186.anIntArray2103
			      [class186.aShortArray2111[i_21_]]);
		    i_27_ += (class186.anIntArray2103
			      [class186.aShortArray2100[i_21_]]);
		    i_28_ += (class186.anIntArray2103
			      [class186.aShortArray2101[i_21_]]);
		    fs_24_[0] = class186.aFloatArray2096[i_26_];
		    fs_25_[0] = class186.aFloatArray2097[i_26_];
		    fs_24_[1] = class186.aFloatArray2096[i_27_];
		    fs_25_[1] = class186.aFloatArray2097[i_27_];
		    fs_24_[2] = class186.aFloatArray2096[i_28_];
		    fs_25_[2] = class186.aFloatArray2097[i_28_];
		} else if (i_23_ == -1) {
		    fs_24_[0] = 0.0F;
		    fs_25_[0] = 1.0F;
		    fs_24_[1] = 1.0F;
		    fs_25_[1] = 1.0F;
		    fs_24_[2] = 0.0F;
		    fs_25_[2] = 0.0F;
		} else {
		    i_23_ &= 0xffff;
		    byte i_29_ = class186.aByteArray2117[i_23_];
		    if (i_29_ == 0) {
			short i_30_ = aShortArray9382[i_21_];
			short i_31_ = aShortArray9387[i_21_];
			short i_32_ = aShortArray9388[i_21_];
			short i_33_ = class186.aShortArray2118[i_23_];
			short i_34_ = class186.aShortArray2119[i_23_];
			short i_35_ = class186.aShortArray2120[i_23_];
			float f = (float) anIntArray9424[i_33_];
			float f_36_ = (float) anIntArray9379[i_33_];
			float f_37_ = (float) anIntArray9395[i_33_];
			float f_38_ = (float) anIntArray9424[i_34_] - f;
			float f_39_ = (float) anIntArray9379[i_34_] - f_36_;
			float f_40_ = (float) anIntArray9395[i_34_] - f_37_;
			float f_41_ = (float) anIntArray9424[i_35_] - f;
			float f_42_ = (float) anIntArray9379[i_35_] - f_36_;
			float f_43_ = (float) anIntArray9395[i_35_] - f_37_;
			float f_44_ = (float) anIntArray9424[i_30_] - f;
			float f_45_ = (float) anIntArray9379[i_30_] - f_36_;
			float f_46_ = (float) anIntArray9395[i_30_] - f_37_;
			float f_47_ = (float) anIntArray9424[i_31_] - f;
			float f_48_ = (float) anIntArray9379[i_31_] - f_36_;
			float f_49_ = (float) anIntArray9395[i_31_] - f_37_;
			float f_50_ = (float) anIntArray9424[i_32_] - f;
			float f_51_ = (float) anIntArray9379[i_32_] - f_36_;
			float f_52_ = (float) anIntArray9395[i_32_] - f_37_;
			float f_53_ = f_39_ * f_43_ - f_40_ * f_42_;
			float f_54_ = f_40_ * f_41_ - f_38_ * f_43_;
			float f_55_ = f_38_ * f_42_ - f_39_ * f_41_;
			float f_56_ = f_42_ * f_55_ - f_43_ * f_54_;
			float f_57_ = f_43_ * f_53_ - f_41_ * f_55_;
			float f_58_ = f_41_ * f_54_ - f_42_ * f_53_;
			float f_59_ = 1.0F / (f_56_ * f_38_ + f_57_ * f_39_
					      + f_58_ * f_40_);
			fs_24_[0] = (f_56_ * f_44_ + f_57_ * f_45_
				     + f_58_ * f_46_) * f_59_;
			fs_24_[1] = (f_56_ * f_47_ + f_57_ * f_48_
				     + f_58_ * f_49_) * f_59_;
			fs_24_[2] = (f_56_ * f_50_ + f_57_ * f_51_
				     + f_58_ * f_52_) * f_59_;
			f_56_ = f_39_ * f_55_ - f_40_ * f_54_;
			f_57_ = f_40_ * f_53_ - f_38_ * f_55_;
			f_58_ = f_38_ * f_54_ - f_39_ * f_53_;
			f_59_ = 1.0F / (f_56_ * f_41_ + f_57_ * f_42_
					+ f_58_ * f_43_);
			fs_25_[0] = (f_56_ * f_44_ + f_57_ * f_45_
				     + f_58_ * f_46_) * f_59_;
			fs_25_[1] = (f_56_ * f_47_ + f_57_ * f_48_
				     + f_58_ * f_49_) * f_59_;
			fs_25_[2] = (f_56_ * f_50_ + f_57_ * f_51_
				     + f_58_ * f_52_) * f_59_;
		    } else {
			short i_60_ = aShortArray9382[i_21_];
			short i_61_ = aShortArray9387[i_21_];
			short i_62_ = aShortArray9388[i_21_];
			int i_63_ = class207.anIntArray2249[i_23_];
			int i_64_ = class207.anIntArray2248[i_23_];
			int i_65_ = class207.anIntArray2246[i_23_];
			float[] fs_66_ = class207.aFloatArrayArray2247[i_23_];
			byte i_67_ = class186.aByteArray2091[i_23_];
			float f
			    = (float) class186.anIntArray2124[i_23_] / 256.0F;
			if (i_29_ == 1) {
			    float f_68_
				= ((float) class186.anIntArray2123[i_23_]
				   / 1024.0F);
			    method2921(anIntArray9424[i_60_],
				       anIntArray9379[i_60_],
				       anIntArray9395[i_60_], i_63_, i_64_,
				       i_65_, fs_66_, f_68_, i_67_, f, fs);
			    fs_24_[0] = fs[0];
			    fs_25_[0] = fs[1];
			    method2921(anIntArray9424[i_61_],
				       anIntArray9379[i_61_],
				       anIntArray9395[i_61_], i_63_, i_64_,
				       i_65_, fs_66_, f_68_, i_67_, f, fs);
			    fs_24_[1] = fs[0];
			    fs_25_[1] = fs[1];
			    method2921(anIntArray9424[i_62_],
				       anIntArray9379[i_62_],
				       anIntArray9395[i_62_], i_63_, i_64_,
				       i_65_, fs_66_, f_68_, i_67_, f, fs);
			    fs_24_[2] = fs[0];
			    fs_25_[2] = fs[1];
			    float f_69_ = f_68_ / 2.0F;
			    if ((i_67_ & 0x1) == 0) {
				if (fs_24_[1] - fs_24_[0] > f_69_)
				    fs_24_[1] -= f_68_;
				else if (fs_24_[0] - fs_24_[1] > f_69_)
				    fs_24_[1] += f_68_;
				if (fs_24_[2] - fs_24_[0] > f_69_)
				    fs_24_[2] -= f_68_;
				else if (fs_24_[0] - fs_24_[2] > f_69_)
				    fs_24_[2] += f_68_;
			    } else {
				if (fs_25_[1] - fs_25_[0] > f_69_)
				    fs_25_[1] -= f_68_;
				else if (fs_25_[0] - fs_25_[1] > f_69_)
				    fs_25_[1] += f_68_;
				if (fs_25_[2] - fs_25_[0] > f_69_)
				    fs_25_[2] -= f_68_;
				else if (fs_25_[0] - fs_25_[2] > f_69_)
				    fs_25_[2] += f_68_;
			    }
			} else if (i_29_ == 2) {
			    float f_70_
				= ((float) class186.anIntArray2125[i_23_]
				   / 256.0F);
			    float f_71_
				= ((float) class186.anIntArray2130[i_23_]
				   / 256.0F);
			    int i_72_ = (anIntArray9424[i_61_]
					 - anIntArray9424[i_60_]);
			    int i_73_ = (anIntArray9379[i_61_]
					 - anIntArray9379[i_60_]);
			    int i_74_ = (anIntArray9395[i_61_]
					 - anIntArray9395[i_60_]);
			    int i_75_ = (anIntArray9424[i_62_]
					 - anIntArray9424[i_60_]);
			    int i_76_ = (anIntArray9379[i_62_]
					 - anIntArray9379[i_60_]);
			    int i_77_ = (anIntArray9395[i_62_]
					 - anIntArray9395[i_60_]);
			    int i_78_ = i_73_ * i_77_ - i_76_ * i_74_;
			    int i_79_ = i_74_ * i_75_ - i_77_ * i_72_;
			    int i_80_ = i_72_ * i_76_ - i_75_ * i_73_;
			    float f_81_
				= (64.0F
				   / (float) class186.anIntArray2121[i_23_]);
			    float f_82_
				= (64.0F
				   / (float) class186.anIntArray2114[i_23_]);
			    float f_83_
				= (64.0F
				   / (float) class186.anIntArray2123[i_23_]);
			    float f_84_ = (((float) i_78_ * fs_66_[0]
					    + (float) i_79_ * fs_66_[1]
					    + (float) i_80_ * fs_66_[2])
					   / f_81_);
			    float f_85_ = (((float) i_78_ * fs_66_[3]
					    + (float) i_79_ * fs_66_[4]
					    + (float) i_80_ * fs_66_[5])
					   / f_82_);
			    float f_86_ = (((float) i_78_ * fs_66_[6]
					    + (float) i_79_ * fs_66_[7]
					    + (float) i_80_ * fs_66_[8])
					   / f_83_);
			    int i_87_ = method2922(f_84_, f_85_, f_86_);
			    method3009(anIntArray9424[i_60_],
				       anIntArray9379[i_60_],
				       anIntArray9395[i_60_], i_63_, i_64_,
				       i_65_, i_87_, fs_66_, i_67_, f, f_70_,
				       f_71_, fs);
			    fs_24_[0] = fs[0];
			    fs_25_[0] = fs[1];
			    method3009(anIntArray9424[i_61_],
				       anIntArray9379[i_61_],
				       anIntArray9395[i_61_], i_63_, i_64_,
				       i_65_, i_87_, fs_66_, i_67_, f, f_70_,
				       f_71_, fs);
			    fs_24_[1] = fs[0];
			    fs_25_[1] = fs[1];
			    method3009(anIntArray9424[i_62_],
				       anIntArray9379[i_62_],
				       anIntArray9395[i_62_], i_63_, i_64_,
				       i_65_, i_87_, fs_66_, i_67_, f, f_70_,
				       f_71_, fs);
			    fs_24_[2] = fs[0];
			    fs_25_[2] = fs[1];
			} else if (i_29_ == 3) {
			    method3033(anIntArray9424[i_60_],
				       anIntArray9379[i_60_],
				       anIntArray9395[i_60_], i_63_, i_64_,
				       i_65_, fs_66_, i_67_, f, fs);
			    fs_24_[0] = fs[0];
			    fs_25_[0] = fs[1];
			    method3033(anIntArray9424[i_61_],
				       anIntArray9379[i_61_],
				       anIntArray9395[i_61_], i_63_, i_64_,
				       i_65_, fs_66_, i_67_, f, fs);
			    fs_24_[1] = fs[0];
			    fs_25_[1] = fs[1];
			    method3033(anIntArray9424[i_62_],
				       anIntArray9379[i_62_],
				       anIntArray9395[i_62_], i_63_, i_64_,
				       i_65_, fs_66_, i_67_, f, fs);
			    fs_24_[2] = fs[0];
			    fs_25_[2] = fs[1];
			    if ((i_67_ & 0x1) == 0) {
				if (fs_24_[1] - fs_24_[0] > 0.5F)
				    fs_24_[1]--;
				else if (fs_24_[0] - fs_24_[1] > 0.5F)
				    fs_24_[1]++;
				if (fs_24_[2] - fs_24_[0] > 0.5F)
				    fs_24_[2]--;
				else if (fs_24_[0] - fs_24_[2] > 0.5F)
				    fs_24_[2]++;
			    } else {
				if (fs_25_[1] - fs_25_[0] > 0.5F)
				    fs_25_[1]--;
				else if (fs_25_[0] - fs_25_[1] > 0.5F)
				    fs_25_[1]++;
				if (fs_25_[2] - fs_25_[0] > 0.5F)
				    fs_25_[2]--;
				else if (fs_25_[0] - fs_25_[2] > 0.5F)
				    fs_25_[2]++;
			    }
			}
		    }
		}
	    }
	}
	if (!bool_19_) {
	    aFloatArrayArray9390 = null;
	    aFloatArrayArray9401 = null;
	}
	if (class186.anIntArray2083 != null && (anInt9373 & 0x20) != 0)
	    anIntArrayArray9397 = class186.method3636(true);
	if (class186.anIntArray2126 != null && (anInt9373 & 0x180) != 0)
	    anIntArrayArray9445 = class186.method3629();
	if (class186.aClass171Array2088 != null && (anInt9373 & 0x400) != 0)
	    anIntArrayArray9419 = class186.method3630();
	if (class186.aShortArray2110 != null) {
	    aShortArray9402 = new short[anInt9375];
	    boolean bool_88_ = false;
	    for (int i_89_ = 0; i_89_ < anInt9375; i_89_++) {
		short i_90_ = class186.aShortArray2110[i_89_];
		if (i_90_ != -1) {
		    Class166 class166
			= aClass182_Sub2_9433.aClass180_1944
			      .method3116(i_90_ & 0xffff, -1431554601);
		    if ((i_2_ & 0x40) == 0 || !class166.aBool1819) {
			aShortArray9402[i_89_] = i_90_;
			bool_88_ = true;
			if (class166.aClass597_1807 == Class597.aClass597_7841)
			    aBool9369 = true;
			if (class166.aByte1805 != 0 || class166.aByte1806 != 0)
			    aBool9380 = true;
		    } else
			aShortArray9402[i_89_] = (short) -1;
		} else
		    aShortArray9402[i_89_] = (short) -1;
	    }
	    if (!bool_88_)
		aShortArray9402 = null;
	} else
	    aShortArray9402 = null;
	if (aBool9369 || aClass103Array9417 != null) {
	    aShortArray9405 = new short[anInt9375];
	    for (int i_91_ = 0; i_91_ < anInt9375; i_91_++)
		aShortArray9405[i_91_] = (short) is[i_91_];
	}
    }
    
    void method15065(Class110 class110) {
	aClass128_9360 = class110.aClass128_1338;
	if (class110 != aClass110_9362) {
	    aClass110_9362 = class110;
	    anIntArray9434 = aClass110_9362.anIntArray1353;
	    aFloatArray9435 = aClass110_9362.aFloatArray1343;
	    aFloatArray9400 = aClass110_9362.aFloatArray1344;
	    aFloatArray9437 = aClass110_9362.aFloatArray1345;
	    aFloatArray9438 = aClass110_9362.aFloatArray1351;
	    anIntArray9439 = aClass110_9362.anIntArray1347;
	    anIntArray9410 = aClass110_9362.anIntArray1348;
	    anIntArray9384 = aClass110_9362.anIntArray1349;
	    anIntArray9442 = aClass110_9362.anIntArray1350;
	    anIntArray9443 = aClass110_9362.anIntArray1334;
	    anIntArray9444 = aClass110_9362.anIntArray1352;
	}
    }
    
    void method15066(boolean bool) {
	if (anInt9364 == 1)
	    method15073();
	else if (anInt9364 == 2) {
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	} else {
	    method15080();
	    int i = aClass182_Sub2_9433.anInt9474 * -1893445829;
	    int i_92_ = aClass182_Sub2_9433.anInt9475 * -1615993337;
	    int i_93_ = aClass182_Sub2_9433.anInt9468 * -1138625233;
	    int i_94_ = aClass182_Sub2_9433.anInt9479 * -722712849 >> 8;
	    int i_95_ = 0;
	    int i_96_ = 0;
	    if (anInt9383 != 0) {
		i_95_
		    = aClass182_Sub2_9433.anInt9463 * -1104473344 / anInt9383;
		i_96_
		    = aClass182_Sub2_9433.anInt9478 * -1613137664 / anInt9383;
	    }
	    if (anIntArray9391 == null) {
		anIntArray9391 = new int[anInt9375];
		anIntArray9392 = new int[anInt9375];
		anIntArray9393 = new int[anInt9375];
	    }
	    for (int i_97_ = 0; i_97_ < anInt9375; i_97_++) {
		byte i_98_;
		if (aByteArray9399 == null)
		    i_98_ = (byte) 0;
		else
		    i_98_ = aByteArray9399[i_97_];
		byte i_99_;
		if (aByteArray9406 == null)
		    i_99_ = (byte) 0;
		else
		    i_99_ = aByteArray9406[i_97_];
		short i_100_;
		if (aShortArray9402 == null)
		    i_100_ = (short) -1;
		else
		    i_100_ = aShortArray9402[i_97_];
		if (i_99_ == -2)
		    i_98_ = (byte) 3;
		if (i_99_ == -1)
		    i_98_ = (byte) 2;
		if (i_100_ == -1) {
		    if (i_98_ == 0) {
			int i_101_ = aShortArray9403[i_97_] & 0xffff;
			int i_102_ = (i_101_ & 0x7f) * anInt9374 >> 7;
			short i_103_
			    = Class504.method8313(i_101_ & ~0x7f | i_102_,
						  1019662635);
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_97_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_97_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_97_]];
			int i_104_ = (((i * class100.anInt1215
					+ i_92_ * class100.anInt1217
					+ i_93_ * class100.anInt1216)
				       / class100.anInt1214)
				      >> 16);
			int i_105_ = i_104_ > 256 ? i_95_ : i_96_;
			int i_106_ = (i_94_ >> 1) + (i_105_ * i_104_ >> 17);
			anIntArray9391[i_97_]
			    = i_106_ << 17 | Class159.method2568(i_103_,
								 i_106_,
								 1770656490);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_97_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_97_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_97_]];
			i_104_ = ((i * class100.anInt1215
				   + i_92_ * class100.anInt1217
				   + i_93_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_105_ = i_104_ > 256 ? i_95_ : i_96_;
			i_106_ = (i_94_ >> 1) + (i_105_ * i_104_ >> 17);
			anIntArray9392[i_97_]
			    = i_106_ << 17 | Class159.method2568(i_103_,
								 i_106_,
								 -123634710);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_97_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_97_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_97_]];
			i_104_ = ((i * class100.anInt1215
				   + i_92_ * class100.anInt1217
				   + i_93_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_105_ = i_104_ > 256 ? i_95_ : i_96_;
			i_106_ = (i_94_ >> 1) + (i_105_ * i_104_ >> 17);
			anIntArray9393[i_97_]
			    = i_106_ << 17 | Class159.method2568(i_103_,
								 i_106_,
								 -605767927);
		    } else if (i_98_ == 1) {
			int i_107_ = aShortArray9403[i_97_] & 0xffff;
			int i_108_ = (i_107_ & 0x7f) * anInt9374 >> 7;
			short i_109_
			    = Class504.method8313(i_107_ & ~0x7f | i_108_,
						  740635965);
			Class115 class115 = aClass115Array9398[i_97_];
			int i_110_ = ((i * class115.anInt1407
				       + i_92_ * class115.anInt1408
				       + i_93_ * class115.anInt1406)
				      >> 16);
			int i_111_ = i_110_ > 256 ? i_95_ : i_96_;
			int i_112_ = (i_94_ >> 1) + (i_111_ * i_110_ >> 17);
			anIntArray9391[i_97_]
			    = i_112_ << 17 | Class159.method2568(i_109_,
								 i_112_,
								 -1386773911);
			anIntArray9393[i_97_] = -1;
		    } else if (i_98_ == 3) {
			anIntArray9391[i_97_] = 128;
			anIntArray9393[i_97_] = -1;
		    } else
			anIntArray9393[i_97_] = -2;
		} else {
		    int i_113_ = aShortArray9403[i_97_] & 0xffff;
		    if (i_98_ == 0) {
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_97_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_97_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_97_]];
			int i_114_ = (((i * class100.anInt1215
					+ i_92_ * class100.anInt1217
					+ i_93_ * class100.anInt1216)
				       / class100.anInt1214)
				      >> 16);
			int i_115_ = i_114_ > 256 ? i_95_ : i_96_;
			int i_116_
			    = method15072((i_94_ >> 2) + (i_115_ * i_114_
							  >> 18));
			anIntArray9391[i_97_]
			    = i_116_ << 24 | method15070(i_113_, i_100_,
							 i_116_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_97_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_97_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_97_]];
			i_114_ = ((i * class100.anInt1215
				   + i_92_ * class100.anInt1217
				   + i_93_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_115_ = i_114_ > 256 ? i_95_ : i_96_;
			i_116_ = method15072((i_94_ >> 2) + (i_115_ * i_114_
							     >> 18));
			anIntArray9392[i_97_]
			    = i_116_ << 24 | method15070(i_113_, i_100_,
							 i_116_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_97_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_97_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_97_]];
			i_114_ = ((i * class100.anInt1215
				   + i_92_ * class100.anInt1217
				   + i_93_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_115_ = i_114_ > 256 ? i_95_ : i_96_;
			i_116_ = method15072((i_94_ >> 2) + (i_115_ * i_114_
							     >> 18));
			anIntArray9393[i_97_]
			    = i_116_ << 24 | method15070(i_113_, i_100_,
							 i_116_);
		    } else if (i_98_ == 1) {
			Class115 class115 = aClass115Array9398[i_97_];
			int i_117_ = ((i * class115.anInt1407
				       + i_92_ * class115.anInt1408
				       + i_93_ * class115.anInt1406)
				      >> 16);
			int i_118_ = i_117_ > 256 ? i_95_ : i_96_;
			int i_119_
			    = method15072((i_94_ >> 2) + (i_118_ * i_117_
							  >> 18));
			anIntArray9391[i_97_]
			    = i_119_ << 24 | method15070(i_113_, i_100_,
							 i_119_);
			anIntArray9393[i_97_] = -1;
		    } else
			anIntArray9393[i_97_] = -2;
		}
	    }
	    aClass100Array9422 = null;
	    aClass100Array9371 = null;
	    aClass115Array9398 = null;
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	    anInt9364 = 2;
	}
    }
    
    public int method3040() {
	if (!aBool9420)
	    method15092();
	return aShort9421;
    }
    
    void method15067() {
	aClass100Array9422 = new Class100[anInt9377];
	for (int i = 0; i < anInt9377; i++)
	    aClass100Array9422[i] = new Class100();
	for (int i = 0; i < anInt9375; i++) {
	    short i_120_ = aShortArray9382[i];
	    short i_121_ = aShortArray9387[i];
	    short i_122_ = aShortArray9388[i];
	    int i_123_ = anIntArray9424[i_121_] - anIntArray9424[i_120_];
	    int i_124_ = anIntArray9379[i_121_] - anIntArray9379[i_120_];
	    int i_125_ = anIntArray9395[i_121_] - anIntArray9395[i_120_];
	    int i_126_ = anIntArray9424[i_122_] - anIntArray9424[i_120_];
	    int i_127_ = anIntArray9379[i_122_] - anIntArray9379[i_120_];
	    int i_128_ = anIntArray9395[i_122_] - anIntArray9395[i_120_];
	    int i_129_ = i_124_ * i_128_ - i_127_ * i_125_;
	    int i_130_ = i_125_ * i_126_ - i_128_ * i_123_;
	    int i_131_;
	    for (i_131_ = i_123_ * i_127_ - i_126_ * i_124_;
		 (i_129_ > 8192 || i_130_ > 8192 || i_131_ > 8192
		  || i_129_ < -8192 || i_130_ < -8192 || i_131_ < -8192);
		 i_131_ >>= 1) {
		i_129_ >>= 1;
		i_130_ >>= 1;
	    }
	    int i_132_
		= (int) Math.sqrt((double) (i_129_ * i_129_ + i_130_ * i_130_
					    + i_131_ * i_131_));
	    if (i_132_ <= 0)
		i_132_ = 1;
	    i_129_ = i_129_ * 256 / i_132_;
	    i_130_ = i_130_ * 256 / i_132_;
	    i_131_ = i_131_ * 256 / i_132_;
	    byte i_133_;
	    if (aByteArray9399 == null)
		i_133_ = (byte) 0;
	    else
		i_133_ = aByteArray9399[i];
	    if (i_133_ == 0) {
		Class100 class100 = aClass100Array9422[i_120_];
		class100.anInt1215 += i_129_;
		class100.anInt1217 += i_130_;
		class100.anInt1216 += i_131_;
		class100.anInt1214++;
		class100 = aClass100Array9422[i_121_];
		class100.anInt1215 += i_129_;
		class100.anInt1217 += i_130_;
		class100.anInt1216 += i_131_;
		class100.anInt1214++;
		class100 = aClass100Array9422[i_122_];
		class100.anInt1215 += i_129_;
		class100.anInt1217 += i_130_;
		class100.anInt1216 += i_131_;
		class100.anInt1214++;
	    } else if (i_133_ == 1) {
		if (aClass115Array9398 == null)
		    aClass115Array9398 = new Class115[anInt9375];
		Class115 class115 = aClass115Array9398[i] = new Class115();
		class115.anInt1407 = i_129_;
		class115.anInt1408 = i_130_;
		class115.anInt1406 = i_131_;
	    }
	}
    }
    
    void method15068(boolean bool) {
	if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		method15069(bool);
	    }
	} else
	    method15069(bool);
    }
    
    void method15069(boolean bool) {
	if (anInt9364 == 1)
	    method15073();
	else if (anInt9364 == 2) {
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	} else {
	    method15080();
	    int i = aClass182_Sub2_9433.anInt9474 * -1893445829;
	    int i_134_ = aClass182_Sub2_9433.anInt9475 * -1615993337;
	    int i_135_ = aClass182_Sub2_9433.anInt9468 * -1138625233;
	    int i_136_ = aClass182_Sub2_9433.anInt9479 * -722712849 >> 8;
	    int i_137_ = 0;
	    int i_138_ = 0;
	    if (anInt9383 != 0) {
		i_137_
		    = aClass182_Sub2_9433.anInt9463 * -1104473344 / anInt9383;
		i_138_
		    = aClass182_Sub2_9433.anInt9478 * -1613137664 / anInt9383;
	    }
	    if (anIntArray9391 == null) {
		anIntArray9391 = new int[anInt9375];
		anIntArray9392 = new int[anInt9375];
		anIntArray9393 = new int[anInt9375];
	    }
	    for (int i_139_ = 0; i_139_ < anInt9375; i_139_++) {
		byte i_140_;
		if (aByteArray9399 == null)
		    i_140_ = (byte) 0;
		else
		    i_140_ = aByteArray9399[i_139_];
		byte i_141_;
		if (aByteArray9406 == null)
		    i_141_ = (byte) 0;
		else
		    i_141_ = aByteArray9406[i_139_];
		short i_142_;
		if (aShortArray9402 == null)
		    i_142_ = (short) -1;
		else
		    i_142_ = aShortArray9402[i_139_];
		if (i_141_ == -2)
		    i_140_ = (byte) 3;
		if (i_141_ == -1)
		    i_140_ = (byte) 2;
		if (i_142_ == -1) {
		    if (i_140_ == 0) {
			int i_143_ = aShortArray9403[i_139_] & 0xffff;
			int i_144_ = (i_143_ & 0x7f) * anInt9374 >> 7;
			short i_145_
			    = Class504.method8313(i_143_ & ~0x7f | i_144_,
						  593760818);
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_139_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_139_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_139_]];
			int i_146_ = (((i * class100.anInt1215
					+ i_134_ * class100.anInt1217
					+ i_135_ * class100.anInt1216)
				       / class100.anInt1214)
				      >> 16);
			int i_147_ = i_146_ > 256 ? i_137_ : i_138_;
			int i_148_ = (i_136_ >> 1) + (i_147_ * i_146_ >> 17);
			anIntArray9391[i_139_]
			    = i_148_ << 17 | Class159.method2568(i_145_,
								 i_148_,
								 -1416812785);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_139_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_139_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_139_]];
			i_146_ = ((i * class100.anInt1215
				   + i_134_ * class100.anInt1217
				   + i_135_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_147_ = i_146_ > 256 ? i_137_ : i_138_;
			i_148_ = (i_136_ >> 1) + (i_147_ * i_146_ >> 17);
			anIntArray9392[i_139_]
			    = i_148_ << 17 | Class159.method2568(i_145_,
								 i_148_,
								 -1581826578);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_139_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_139_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_139_]];
			i_146_ = ((i * class100.anInt1215
				   + i_134_ * class100.anInt1217
				   + i_135_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_147_ = i_146_ > 256 ? i_137_ : i_138_;
			i_148_ = (i_136_ >> 1) + (i_147_ * i_146_ >> 17);
			anIntArray9393[i_139_]
			    = i_148_ << 17 | Class159.method2568(i_145_,
								 i_148_,
								 -1136650824);
		    } else if (i_140_ == 1) {
			int i_149_ = aShortArray9403[i_139_] & 0xffff;
			int i_150_ = (i_149_ & 0x7f) * anInt9374 >> 7;
			short i_151_
			    = Class504.method8313(i_149_ & ~0x7f | i_150_,
						  1725419557);
			Class115 class115 = aClass115Array9398[i_139_];
			int i_152_ = ((i * class115.anInt1407
				       + i_134_ * class115.anInt1408
				       + i_135_ * class115.anInt1406)
				      >> 16);
			int i_153_ = i_152_ > 256 ? i_137_ : i_138_;
			int i_154_ = (i_136_ >> 1) + (i_153_ * i_152_ >> 17);
			anIntArray9391[i_139_]
			    = i_154_ << 17 | Class159.method2568(i_151_,
								 i_154_,
								 882468967);
			anIntArray9393[i_139_] = -1;
		    } else if (i_140_ == 3) {
			anIntArray9391[i_139_] = 128;
			anIntArray9393[i_139_] = -1;
		    } else
			anIntArray9393[i_139_] = -2;
		} else {
		    int i_155_ = aShortArray9403[i_139_] & 0xffff;
		    if (i_140_ == 0) {
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_139_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_139_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_139_]];
			int i_156_ = (((i * class100.anInt1215
					+ i_134_ * class100.anInt1217
					+ i_135_ * class100.anInt1216)
				       / class100.anInt1214)
				      >> 16);
			int i_157_ = i_156_ > 256 ? i_137_ : i_138_;
			int i_158_
			    = method15072((i_136_ >> 2) + (i_157_ * i_156_
							   >> 18));
			anIntArray9391[i_139_]
			    = i_158_ << 24 | method15070(i_155_, i_142_,
							 i_158_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_139_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_139_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_139_]];
			i_156_ = ((i * class100.anInt1215
				   + i_134_ * class100.anInt1217
				   + i_135_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_157_ = i_156_ > 256 ? i_137_ : i_138_;
			i_158_ = method15072((i_136_ >> 2) + (i_157_ * i_156_
							      >> 18));
			anIntArray9392[i_139_]
			    = i_158_ << 24 | method15070(i_155_, i_142_,
							 i_158_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_139_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_139_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_139_]];
			i_156_ = ((i * class100.anInt1215
				   + i_134_ * class100.anInt1217
				   + i_135_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_157_ = i_156_ > 256 ? i_137_ : i_138_;
			i_158_ = method15072((i_136_ >> 2) + (i_157_ * i_156_
							      >> 18));
			anIntArray9393[i_139_]
			    = i_158_ << 24 | method15070(i_155_, i_142_,
							 i_158_);
		    } else if (i_140_ == 1) {
			Class115 class115 = aClass115Array9398[i_139_];
			int i_159_ = ((i * class115.anInt1407
				       + i_134_ * class115.anInt1408
				       + i_135_ * class115.anInt1406)
				      >> 16);
			int i_160_ = i_159_ > 256 ? i_137_ : i_138_;
			int i_161_
			    = method15072((i_136_ >> 2) + (i_160_ * i_159_
							   >> 18));
			anIntArray9391[i_139_]
			    = i_161_ << 24 | method15070(i_155_, i_142_,
							 i_161_);
			anIntArray9393[i_139_] = -1;
		    } else
			anIntArray9393[i_139_] = -2;
		}
	    }
	    aClass100Array9422 = null;
	    aClass100Array9371 = null;
	    aClass115Array9398 = null;
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	    anInt9364 = 2;
	}
    }
    
    int method15070(int i, short i_162_, int i_163_) {
	int i_164_ = Class642.anIntArray8324[method15071(i, i_163_)];
	Class166 class166
	    = aClass182_Sub2_9433.aClass180_1944.method3116(i_162_ & 0xffff,
							    -1431554601);
	int i_165_ = class166.aByte1785 & 0xff;
	if (i_165_ != 0) {
	    int i_166_ = 131586 * i_163_;
	    if (i_165_ == 256)
		i_164_ = i_166_;
	    else {
		int i_167_ = i_165_;
		int i_168_ = 256 - i_165_;
		i_164_ = ((((i_166_ & 0xff00ff) * i_167_
			    + (i_164_ & 0xff00ff) * i_168_)
			   & ~0xff00ff)
			  + (((i_166_ & 0xff00) * i_167_
			      + (i_164_ & 0xff00) * i_168_)
			     & 0xff0000)) >> 8;
	    }
	}
	int i_169_ = class166.aByte1831 & 0xff;
	if (i_169_ != 0) {
	    i_169_ += 256;
	    int i_170_ = ((i_164_ & 0xff0000) >> 16) * i_169_;
	    if (i_170_ > 65535)
		i_170_ = 65535;
	    int i_171_ = ((i_164_ & 0xff00) >> 8) * i_169_;
	    if (i_171_ > 65535)
		i_171_ = 65535;
	    int i_172_ = (i_164_ & 0xff) * i_169_;
	    if (i_172_ > 65535)
		i_172_ = 65535;
	    i_164_
		= (i_170_ << 8 & 0xff0000) + (i_171_ & 0xff00) + (i_172_ >> 8);
	}
	return i_164_;
    }
    
    int method15071(int i, int i_173_) {
	i_173_ = i_173_ * (i & 0x7f) >> 7;
	if (i_173_ < 2)
	    i_173_ = 2;
	else if (i_173_ > 126)
	    i_173_ = 126;
	return (i & 0xff80) + i_173_;
    }
    
    int method15072(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    void method15073() {
	if (anInt9364 == 0)
	    method15068(false);
	else if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		method15153();
	    }
	} else
	    method15153();
    }
    
    public void method3070(int i, int i_174_, int i_175_) {
	if (i != 0 && (anInt9373 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_174_ != 0 && (anInt9373 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_175_ != 0 && (anInt9373 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_176_ = 0; i_176_ < anInt9394; i_176_++) {
		anIntArray9424[i_176_] += i;
		anIntArray9379[i_176_] += i_174_;
		anIntArray9395[i_176_] += i_175_;
	    }
	}
    }
    
    public void method2929() {
	/* empty */
    }
    
    boolean method2919() {
	if (anIntArrayArray9397 == null)
	    return false;
	anInt9425 = 0;
	anInt9411 = 0;
	anInt9412 = 0;
	return true;
    }
    
    Class179 method15074(Class179_Sub2 class179_sub2_177_,
			 Class179_Sub2 class179_sub2_178_, int i, boolean bool,
			 boolean bool_179_) {
	class179_sub2_177_.aBool9420 = aBool9420;
	if (aBool9420) {
	    class179_sub2_177_.aShort9426 = aShort9426;
	    class179_sub2_177_.aShort9381 = aShort9381;
	    class179_sub2_177_.aShort9432 = aShort9432;
	    class179_sub2_177_.aShort9368 = aShort9368;
	    class179_sub2_177_.aShort9423 = aShort9423;
	    class179_sub2_177_.aShort9431 = aShort9431;
	    class179_sub2_177_.aShort9421 = aShort9421;
	    class179_sub2_177_.aShort9413 = aShort9413;
	}
	if (aBool9429) {
	    class179_sub2_177_.aShort9430 = aShort9430;
	    class179_sub2_177_.aBool9429 = true;
	} else
	    class179_sub2_177_.aBool9429 = false;
	class179_sub2_177_.anInt9374 = anInt9374;
	class179_sub2_177_.anInt9383 = anInt9383;
	class179_sub2_177_.anInt9394 = anInt9394;
	class179_sub2_177_.anInt9377 = anInt9377;
	class179_sub2_177_.anInt9375 = anInt9375;
	class179_sub2_177_.anInt9416 = anInt9416;
	class179_sub2_177_.anInt9385 = anInt9385;
	if ((i & 0x100) != 0)
	    class179_sub2_177_.aBool9369 = true;
	else
	    class179_sub2_177_.aBool9369 = aBool9369;
	class179_sub2_177_.aBool9380 = aBool9380;
	boolean bool_180_ = (i & 0x7) == 7 | (i & 0x20) != 0;
	boolean bool_181_ = bool_180_ || (i & 0x1) != 0;
	boolean bool_182_ = bool_180_ || (i & 0x2) != 0;
	boolean bool_183_ = bool_180_ || (i & 0x4) != 0 || (i & 0x10) != 0;
	if (bool_181_ || bool_182_ || bool_183_) {
	    if (bool_181_) {
		if (class179_sub2_178_.anIntArray9424 == null
		    || class179_sub2_178_.anIntArray9424.length < anInt9394)
		    class179_sub2_177_.anIntArray9424
			= class179_sub2_178_.anIntArray9424
			= new int[anInt9394];
		else
		    class179_sub2_177_.anIntArray9424
			= class179_sub2_178_.anIntArray9424;
		for (int i_184_ = 0; i_184_ < anInt9394; i_184_++)
		    class179_sub2_177_.anIntArray9424[i_184_]
			= anIntArray9424[i_184_];
	    } else
		class179_sub2_177_.anIntArray9424 = anIntArray9424;
	    if (bool_182_) {
		if (class179_sub2_178_.anIntArray9379 == null
		    || class179_sub2_178_.anIntArray9379.length < anInt9394)
		    class179_sub2_177_.anIntArray9379
			= class179_sub2_178_.anIntArray9379
			= new int[anInt9394];
		else
		    class179_sub2_177_.anIntArray9379
			= class179_sub2_178_.anIntArray9379;
		for (int i_185_ = 0; i_185_ < anInt9394; i_185_++)
		    class179_sub2_177_.anIntArray9379[i_185_]
			= anIntArray9379[i_185_];
	    } else
		class179_sub2_177_.anIntArray9379 = anIntArray9379;
	    if (bool_183_) {
		if (class179_sub2_178_.anIntArray9395 == null
		    || class179_sub2_178_.anIntArray9395.length < anInt9394)
		    class179_sub2_177_.anIntArray9395
			= class179_sub2_178_.anIntArray9395
			= new int[anInt9394];
		else
		    class179_sub2_177_.anIntArray9395
			= class179_sub2_178_.anIntArray9395;
		for (int i_186_ = 0; i_186_ < anInt9394; i_186_++)
		    class179_sub2_177_.anIntArray9395[i_186_]
			= anIntArray9395[i_186_];
	    } else
		class179_sub2_177_.anIntArray9395 = anIntArray9395;
	} else {
	    class179_sub2_177_.anIntArray9424 = anIntArray9424;
	    class179_sub2_177_.anIntArray9379 = anIntArray9379;
	    class179_sub2_177_.anIntArray9395 = anIntArray9395;
	}
	if ((i & 0x84080) != 0) {
	    if (class179_sub2_178_.aShortArray9403 == null
		|| class179_sub2_178_.aShortArray9403.length < anInt9375) {
		int i_187_ = anInt9375;
		class179_sub2_177_.aShortArray9403
		    = class179_sub2_178_.aShortArray9403 = new short[i_187_];
	    } else
		class179_sub2_177_.aShortArray9403
		    = class179_sub2_178_.aShortArray9403;
	    for (int i_188_ = 0; i_188_ < anInt9375; i_188_++)
		class179_sub2_177_.aShortArray9403[i_188_]
		    = aShortArray9403[i_188_];
	} else
	    class179_sub2_177_.aShortArray9403 = aShortArray9403;
	if ((i & 0x97018) != 0) {
	    class179_sub2_177_.anInt9364 = 0;
	    Class179_Sub2 class179_sub2_189_ = class179_sub2_177_;
	    Class179_Sub2 class179_sub2_190_ = class179_sub2_177_;
	    class179_sub2_177_.anIntArray9393 = null;
	    class179_sub2_190_.anIntArray9392 = null;
	    class179_sub2_189_.anIntArray9391 = null;
	} else if ((i & 0x80) != 0) {
	    if (bool_179_)
		method15068(false);
	    if (anIntArray9391 != null) {
		if (class179_sub2_178_.anIntArray9391 == null
		    || class179_sub2_178_.anIntArray9391.length < anInt9375) {
		    int i_191_ = anInt9375;
		    class179_sub2_177_.anIntArray9391
			= class179_sub2_178_.anIntArray9391 = new int[i_191_];
		    class179_sub2_177_.anIntArray9392
			= class179_sub2_178_.anIntArray9392 = new int[i_191_];
		    class179_sub2_177_.anIntArray9393
			= class179_sub2_178_.anIntArray9393 = new int[i_191_];
		} else {
		    class179_sub2_177_.anIntArray9391
			= class179_sub2_178_.anIntArray9391;
		    class179_sub2_177_.anIntArray9392
			= class179_sub2_178_.anIntArray9392;
		    class179_sub2_177_.anIntArray9393
			= class179_sub2_178_.anIntArray9393;
		}
		for (int i_192_ = 0; i_192_ < anInt9375; i_192_++) {
		    class179_sub2_177_.anIntArray9391[i_192_]
			= anIntArray9391[i_192_];
		    class179_sub2_177_.anIntArray9392[i_192_]
			= anIntArray9392[i_192_];
		    class179_sub2_177_.anIntArray9393[i_192_]
			= anIntArray9393[i_192_];
		}
	    }
	    class179_sub2_177_.anInt9364 = anInt9364;
	} else {
	    if (bool_179_)
		method15068(false);
	    class179_sub2_177_.anIntArray9391 = anIntArray9391;
	    class179_sub2_177_.anIntArray9392 = anIntArray9392;
	    class179_sub2_177_.anIntArray9393 = anIntArray9393;
	    class179_sub2_177_.anInt9364 = anInt9364;
	}
	if ((i & 0x100) != 0) {
	    if (class179_sub2_178_.aByteArray9406 == null
		|| class179_sub2_178_.aByteArray9406.length < anInt9375) {
		int i_193_ = anInt9375;
		class179_sub2_177_.aByteArray9406
		    = class179_sub2_178_.aByteArray9406 = new byte[i_193_];
	    } else
		class179_sub2_177_.aByteArray9406
		    = class179_sub2_178_.aByteArray9406;
	    if (aByteArray9406 != null) {
		for (int i_194_ = 0; i_194_ < anInt9375; i_194_++)
		    class179_sub2_177_.aByteArray9406[i_194_]
			= aByteArray9406[i_194_];
	    } else {
		for (int i_195_ = 0; i_195_ < anInt9375; i_195_++)
		    class179_sub2_177_.aByteArray9406[i_195_] = (byte) 0;
	    }
	} else
	    class179_sub2_177_.aByteArray9406 = aByteArray9406;
	if ((i & 0x8) != 0 || (i & 0x10) != 0) {
	    if (class179_sub2_178_.aClass100Array9422 == null
		|| class179_sub2_178_.aClass100Array9422.length < anInt9377) {
		int i_196_ = anInt9377;
		class179_sub2_177_.aClass100Array9422
		    = class179_sub2_178_.aClass100Array9422
		    = new Class100[i_196_];
	    } else
		class179_sub2_177_.aClass100Array9422
		    = class179_sub2_178_.aClass100Array9422;
	    if (aClass100Array9422 != null) {
		for (int i_197_ = 0; i_197_ < anInt9377; i_197_++)
		    class179_sub2_177_.aClass100Array9422[i_197_]
			= new Class100(aClass100Array9422[i_197_]);
	    } else
		class179_sub2_177_.aClass100Array9422 = null;
	    if (aClass115Array9398 != null) {
		if (class179_sub2_178_.aClass115Array9398 == null
		    || (class179_sub2_178_.aClass115Array9398.length
			< anInt9375)) {
		    int i_198_ = anInt9375;
		    class179_sub2_177_.aClass115Array9398
			= class179_sub2_178_.aClass115Array9398
			= new Class115[i_198_];
		} else
		    class179_sub2_177_.aClass115Array9398
			= class179_sub2_178_.aClass115Array9398;
		for (int i_199_ = 0; i_199_ < anInt9375; i_199_++)
		    class179_sub2_177_.aClass115Array9398[i_199_]
			= (aClass115Array9398[i_199_] != null
			   ? new Class115(aClass115Array9398[i_199_]) : null);
	    } else
		class179_sub2_177_.aClass115Array9398 = null;
	} else {
	    if (bool_179_)
		method15080();
	    class179_sub2_177_.aClass100Array9422 = aClass100Array9422;
	    class179_sub2_177_.aClass115Array9398 = aClass115Array9398;
	}
	if ((i & 0x8000) != 0) {
	    if (aShortArray9402 == null)
		class179_sub2_177_.aShortArray9402 = null;
	    else {
		if (class179_sub2_178_.aShortArray9402 == null
		    || class179_sub2_178_.aShortArray9402.length < anInt9375) {
		    int i_200_ = anInt9375;
		    class179_sub2_177_.aShortArray9402
			= class179_sub2_178_.aShortArray9402
			= new short[i_200_];
		} else
		    class179_sub2_177_.aShortArray9402
			= class179_sub2_178_.aShortArray9402;
		for (int i_201_ = 0; i_201_ < anInt9375; i_201_++)
		    class179_sub2_177_.aShortArray9402[i_201_]
			= aShortArray9402[i_201_];
	    }
	} else
	    class179_sub2_177_.aShortArray9402 = aShortArray9402;
	if ((i & 0x10000) != 0) {
	    if (aByteArray9399 == null)
		class179_sub2_177_.aByteArray9399 = null;
	    else {
		if (class179_sub2_178_.aByteArray9399 == null
		    || class179_sub2_178_.aByteArray9399.length < anInt9375) {
		    int i_202_ = bool ? anInt9375 + 100 : anInt9375;
		    class179_sub2_177_.aByteArray9399
			= class179_sub2_178_.aByteArray9399 = new byte[i_202_];
		} else
		    class179_sub2_177_.aByteArray9399
			= class179_sub2_178_.aByteArray9399;
		for (int i_203_ = 0; i_203_ < anInt9375; i_203_++)
		    class179_sub2_177_.aByteArray9399[i_203_]
			= aByteArray9399[i_203_];
	    }
	} else
	    class179_sub2_177_.aByteArray9399 = aByteArray9399;
	if ((i & 0xc580) != 0) {
	    if (class179_sub2_178_.aClass107Array9441 == null
		|| class179_sub2_178_.aClass107Array9441.length < anInt9416) {
		int i_204_ = anInt9416;
		class179_sub2_177_.aClass107Array9441
		    = class179_sub2_178_.aClass107Array9441
		    = new Class107[i_204_];
		for (int i_205_ = 0; i_205_ < anInt9416; i_205_++)
		    class179_sub2_177_.aClass107Array9441[i_205_]
			= aClass107Array9441[i_205_].method1918(1800341309);
	    } else {
		class179_sub2_177_.aClass107Array9441
		    = class179_sub2_178_.aClass107Array9441;
		for (int i_206_ = 0; i_206_ < anInt9416; i_206_++)
		    class179_sub2_177_.aClass107Array9441[i_206_]
			.method1919(aClass107Array9441[i_206_], -147181894);
	    }
	} else
	    class179_sub2_177_.aClass107Array9441 = aClass107Array9441;
	if (aFloatArrayArray9401 != null && (i & 0x10) != 0) {
	    if (class179_sub2_178_.aFloatArrayArray9401 == null
		|| (class179_sub2_178_.aFloatArrayArray9401.length
		    < anInt9375)) {
		int i_207_ = bool ? anInt9375 + 100 : anInt9375;
		class179_sub2_177_.aFloatArrayArray9401
		    = class179_sub2_178_.aFloatArrayArray9401
		    = new float[i_207_][3];
	    } else
		class179_sub2_177_.aFloatArrayArray9401
		    = class179_sub2_178_.aFloatArrayArray9401;
	    for (int i_208_ = 0; i_208_ < anInt9375; i_208_++) {
		if (aFloatArrayArray9401[i_208_] != null) {
		    class179_sub2_177_.aFloatArrayArray9401[i_208_][0]
			= aFloatArrayArray9401[i_208_][0];
		    class179_sub2_177_.aFloatArrayArray9401[i_208_][1]
			= aFloatArrayArray9401[i_208_][1];
		    class179_sub2_177_.aFloatArrayArray9401[i_208_][2]
			= aFloatArrayArray9401[i_208_][2];
		}
	    }
	    if (class179_sub2_178_.aFloatArrayArray9390 == null
		|| (class179_sub2_178_.aFloatArrayArray9390.length
		    < anInt9375)) {
		int i_209_ = bool ? anInt9375 + 100 : anInt9375;
		class179_sub2_177_.aFloatArrayArray9390
		    = class179_sub2_178_.aFloatArrayArray9390
		    = new float[i_209_][3];
	    } else
		class179_sub2_177_.aFloatArrayArray9390
		    = class179_sub2_178_.aFloatArrayArray9390;
	    for (int i_210_ = 0; i_210_ < anInt9375; i_210_++) {
		if (aFloatArrayArray9390[i_210_] != null) {
		    class179_sub2_177_.aFloatArrayArray9390[i_210_][0]
			= aFloatArrayArray9390[i_210_][0];
		    class179_sub2_177_.aFloatArrayArray9390[i_210_][1]
			= aFloatArrayArray9390[i_210_][1];
		    class179_sub2_177_.aFloatArrayArray9390[i_210_][2]
			= aFloatArrayArray9390[i_210_][2];
		}
	    }
	} else {
	    class179_sub2_177_.aFloatArrayArray9401 = aFloatArrayArray9401;
	    class179_sub2_177_.aFloatArrayArray9390 = aFloatArrayArray9390;
	}
	class179_sub2_177_.anIntArrayArray9397 = anIntArrayArray9397;
	class179_sub2_177_.anIntArrayArray9445 = anIntArrayArray9445;
	class179_sub2_177_.anIntArrayArray9419 = anIntArrayArray9419;
	class179_sub2_177_.aShortArray9378 = aShortArray9378;
	class179_sub2_177_.aShortArray9404 = aShortArray9404;
	class179_sub2_177_.aByteArray9376 = aByteArray9376;
	class179_sub2_177_.aShortArray9382 = aShortArray9382;
	class179_sub2_177_.aShortArray9387 = aShortArray9387;
	class179_sub2_177_.aShortArray9388 = aShortArray9388;
	class179_sub2_177_.aClass184Array9386 = aClass184Array9386;
	class179_sub2_177_.aClass154Array9415 = aClass154Array9415;
	class179_sub2_177_.aClass103Array9417 = aClass103Array9417;
	class179_sub2_177_.aShortArray9405 = aShortArray9405;
	class179_sub2_177_.anInt9373 = i;
	return class179_sub2_177_;
    }
    
    void method15075(Thread thread) {
	Class110 class110 = aClass182_Sub2_9433.method15223(thread);
	if (class110 != aClass110_9363) {
	    aClass110_9363 = class110;
	    aClass179_Sub2Array9389 = aClass110_9363.aClass179_Sub2Array1358;
	    aClass179_Sub2Array9446 = aClass110_9363.aClass179_Sub2Array1354;
	}
    }
    
    public void method3010(int i) {
	if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		if ((anInt9373 & 0x10000) == 65536 && (i & 0x10000) == 0)
		    method15068(true);
		anInt9373 = i;
	    }
	} else {
	    if ((anInt9373 & 0x10000) == 65536 && (i & 0x10000) == 0)
		method15068(true);
	    anInt9373 = i;
	}
    }
    
    public int method3065() {
	return anInt9374;
    }
    
    public void method2937(int i, int i_211_, Class161 class161,
			   Class161 class161_212_, int i_213_, int i_214_,
			   int i_215_) {
	if (i == 3) {
	    if ((anInt9373 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((anInt9373 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!aBool9420)
	    method15092();
	int i_216_ = i_213_ + aShort9368;
	int i_217_ = i_213_ + aShort9426;
	int i_218_ = i_215_ + aShort9431;
	int i_219_ = i_215_ + aShort9432;
	if (i == 4 || (i_216_ >= 0
		       && ((i_217_ + class161.anInt1761 * 435863595
			    >> class161.anInt1763 * -2063427645)
			   < class161.anInt1759 * 363736815)
		       && i_218_ >= 0
		       && ((i_219_ + class161.anInt1761 * 435863595
			    >> class161.anInt1763 * -2063427645)
			   < class161.anInt1760 * -1152334393))) {
	    int[][] is = class161.anIntArrayArray1762;
	    int[][] is_220_ = null;
	    if (class161_212_ != null)
		is_220_ = class161_212_.anIntArrayArray1762;
	    if (i == 4 || i == 5) {
		if (class161_212_ == null
		    || (i_216_ < 0
			|| ((i_217_ + class161_212_.anInt1761 * 435863595
			     >> class161_212_.anInt1763 * -2063427645)
			    >= class161_212_.anInt1759 * 363736815)
			|| i_218_ < 0
			|| ((i_219_ + class161_212_.anInt1761 * 435863595
			     >> class161_212_.anInt1763 * -2063427645)
			    >= class161_212_.anInt1760 * -1152334393)))
		    return;
	    } else {
		i_216_ >>= class161.anInt1763 * -2063427645;
		i_217_ = (i_217_ + (class161.anInt1761 * 435863595 - 1)
			  >> class161.anInt1763 * -2063427645);
		i_218_ >>= class161.anInt1763 * -2063427645;
		i_219_ = (i_219_ + (class161.anInt1761 * 435863595 - 1)
			  >> class161.anInt1763 * -2063427645);
		if (is[i_216_][i_218_] == i_214_
		    && is[i_217_][i_218_] == i_214_
		    && is[i_216_][i_219_] == i_214_
		    && is[i_217_][i_219_] == i_214_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_221_ = class161.anInt1761 * 435863595 - 1;
		    for (int i_222_ = 0; i_222_ < anInt9377; i_222_++) {
			int i_223_ = anIntArray9424[i_222_] + i_213_;
			int i_224_ = anIntArray9395[i_222_] + i_215_;
			int i_225_ = i_223_ & i_221_;
			int i_226_ = i_224_ & i_221_;
			int i_227_
			    = i_223_ >> class161.anInt1763 * -2063427645;
			int i_228_
			    = i_224_ >> class161.anInt1763 * -2063427645;
			int i_229_
			    = (((is[i_227_][i_228_]
				 * (class161.anInt1761 * 435863595 - i_225_))
				+ is[i_227_ + 1][i_228_] * i_225_)
			       >> class161.anInt1763 * -2063427645);
			int i_230_
			    = (((is[i_227_][i_228_ + 1]
				 * (class161.anInt1761 * 435863595 - i_225_))
				+ is[i_227_ + 1][i_228_ + 1] * i_225_)
			       >> class161.anInt1763 * -2063427645);
			int i_231_ = (i_229_ * (class161.anInt1761 * 435863595
						- i_226_) + i_230_ * i_226_
				      >> class161.anInt1763 * -2063427645);
			anIntArray9379[i_222_]
			    = anIntArray9379[i_222_] + i_231_ - i_214_;
		    }
		    for (int i_232_ = anInt9377; i_232_ < anInt9394;
			 i_232_++) {
			int i_233_ = anIntArray9424[i_232_] + i_213_;
			int i_234_ = anIntArray9395[i_232_] + i_215_;
			int i_235_ = i_233_ & i_221_;
			int i_236_ = i_234_ & i_221_;
			int i_237_
			    = i_233_ >> class161.anInt1763 * -2063427645;
			int i_238_
			    = i_234_ >> class161.anInt1763 * -2063427645;
			if (i_237_ >= 0 && i_237_ < is.length - 1
			    && i_238_ >= 0 && i_238_ < is[0].length - 1) {
			    int i_239_ = (((is[i_237_][i_238_]
					    * (class161.anInt1761 * 435863595
					       - i_235_))
					   + is[i_237_ + 1][i_238_] * i_235_)
					  >> class161.anInt1763 * -2063427645);
			    int i_240_
				= (((is[i_237_][i_238_ + 1]
				     * (class161.anInt1761 * 435863595
					- i_235_))
				    + is[i_237_ + 1][i_238_ + 1] * i_235_)
				   >> class161.anInt1763 * -2063427645);
			    int i_241_
				= (i_239_ * (class161.anInt1761 * 435863595
					     - i_236_) + i_240_ * i_236_
				   >> class161.anInt1763 * -2063427645);
			    anIntArray9379[i_232_]
				= anIntArray9379[i_232_] + i_241_ - i_214_;
			}
		    }
		} else if (i == 2) {
		    if (aShort9423 == 0)
			return;
		    int i_242_ = class161.anInt1761 * 435863595 - 1;
		    for (int i_243_ = 0; i_243_ < anInt9377; i_243_++) {
			int i_244_
			    = (anIntArray9379[i_243_] << 16) / aShort9423;
			if (i_244_ < i_211_) {
			    int i_245_ = anIntArray9424[i_243_] + i_213_;
			    int i_246_ = anIntArray9395[i_243_] + i_215_;
			    int i_247_ = i_245_ & i_242_;
			    int i_248_ = i_246_ & i_242_;
			    int i_249_
				= i_245_ >> class161.anInt1763 * -2063427645;
			    int i_250_
				= i_246_ >> class161.anInt1763 * -2063427645;
			    int i_251_ = (((is[i_249_][i_250_]
					    * (class161.anInt1761 * 435863595
					       - i_247_))
					   + is[i_249_ + 1][i_250_] * i_247_)
					  >> class161.anInt1763 * -2063427645);
			    int i_252_
				= (((is[i_249_][i_250_ + 1]
				     * (class161.anInt1761 * 435863595
					- i_247_))
				    + is[i_249_ + 1][i_250_ + 1] * i_247_)
				   >> class161.anInt1763 * -2063427645);
			    int i_253_
				= (i_251_ * (class161.anInt1761 * 435863595
					     - i_248_) + i_252_ * i_248_
				   >> class161.anInt1763 * -2063427645);
			    anIntArray9379[i_243_]
				= anIntArray9379[i_243_] + ((i_253_ - i_214_)
							    * (i_211_ - i_244_)
							    / i_211_);
			} else
			    anIntArray9379[i_243_] = anIntArray9379[i_243_];
		    }
		    for (int i_254_ = anInt9377; i_254_ < anInt9394;
			 i_254_++) {
			int i_255_
			    = (anIntArray9379[i_254_] << 16) / aShort9423;
			if (i_255_ < i_211_) {
			    int i_256_ = anIntArray9424[i_254_] + i_213_;
			    int i_257_ = anIntArray9395[i_254_] + i_215_;
			    int i_258_ = i_256_ & i_242_;
			    int i_259_ = i_257_ & i_242_;
			    int i_260_
				= i_256_ >> class161.anInt1763 * -2063427645;
			    int i_261_
				= i_257_ >> class161.anInt1763 * -2063427645;
			    if (i_260_ >= 0
				&& i_260_ < class161.anInt1759 * 363736815 - 1
				&& i_261_ >= 0
				&& (i_261_
				    < class161.anInt1760 * -1152334393 - 1)) {
				int i_262_
				    = (((is[i_260_][i_261_]
					 * (class161.anInt1761 * 435863595
					    - i_258_))
					+ is[i_260_ + 1][i_261_] * i_258_)
				       >> class161.anInt1763 * -2063427645);
				int i_263_
				    = (((is[i_260_][i_261_ + 1]
					 * (class161.anInt1761 * 435863595
					    - i_258_))
					+ is[i_260_ + 1][i_261_ + 1] * i_258_)
				       >> class161.anInt1763 * -2063427645);
				int i_264_
				    = (i_262_ * (class161.anInt1761 * 435863595
						 - i_259_) + i_263_ * i_259_
				       >> class161.anInt1763 * -2063427645);
				anIntArray9379[i_254_]
				    = (anIntArray9379[i_254_]
				       + ((i_264_ - i_214_) * (i_211_ - i_255_)
					  / i_211_));
			    }
			} else
			    anIntArray9379[i_254_] = anIntArray9379[i_254_];
		    }
		} else if (i == 3) {
		    int i_265_ = (i_211_ & 0xff) * 16;
		    int i_266_ = (i_211_ >> 8 & 0xff) * 16;
		    int i_267_ = (i_211_ >> 16 & 0xff) << 6;
		    int i_268_ = (i_211_ >> 24 & 0xff) << 6;
		    if (i_213_ - (i_265_ >> 1) < 0
			|| ((i_213_ + (i_265_ >> 1)
			     + class161.anInt1761 * 435863595)
			    >= (class161.anInt1759 * 363736815
				<< class161.anInt1763 * -2063427645))
			|| i_215_ - (i_266_ >> 1) < 0
			|| ((i_215_ + (i_266_ >> 1)
			     + class161.anInt1761 * 435863595)
			    >= (class161.anInt1760 * -1152334393
				<< class161.anInt1763 * -2063427645)))
			return;
		    method2938(class161, i_213_, i_214_, i_215_, i_265_,
			       i_266_, i_267_, i_268_);
		} else if (i == 4) {
		    int i_269_ = class161_212_.anInt1761 * 435863595 - 1;
		    int i_270_ = aShort9381 - aShort9423;
		    for (int i_271_ = 0; i_271_ < anInt9377; i_271_++) {
			int i_272_ = anIntArray9424[i_271_] + i_213_;
			int i_273_ = anIntArray9395[i_271_] + i_215_;
			int i_274_ = i_272_ & i_269_;
			int i_275_ = i_273_ & i_269_;
			int i_276_
			    = i_272_ >> class161_212_.anInt1763 * -2063427645;
			int i_277_
			    = i_273_ >> class161_212_.anInt1763 * -2063427645;
			int i_278_
			    = (((is_220_[i_276_][i_277_]
				 * (class161_212_.anInt1761 * 435863595
				    - i_274_))
				+ is_220_[i_276_ + 1][i_277_] * i_274_)
			       >> class161_212_.anInt1763 * -2063427645);
			int i_279_
			    = (((is_220_[i_276_][i_277_ + 1]
				 * (class161_212_.anInt1761 * 435863595
				    - i_274_))
				+ is_220_[i_276_ + 1][i_277_ + 1] * i_274_)
			       >> class161_212_.anInt1763 * -2063427645);
			int i_280_
			    = (i_278_ * (class161_212_.anInt1761 * 435863595
					 - i_275_) + i_279_ * i_275_
			       >> class161_212_.anInt1763 * -2063427645);
			anIntArray9379[i_271_]
			    = (anIntArray9379[i_271_] + (i_280_ - i_214_)
			       + i_270_);
		    }
		    for (int i_281_ = anInt9377; i_281_ < anInt9394;
			 i_281_++) {
			int i_282_ = anIntArray9424[i_281_] + i_213_;
			int i_283_ = anIntArray9395[i_281_] + i_215_;
			int i_284_ = i_282_ & i_269_;
			int i_285_ = i_283_ & i_269_;
			int i_286_
			    = i_282_ >> class161_212_.anInt1763 * -2063427645;
			int i_287_
			    = i_283_ >> class161_212_.anInt1763 * -2063427645;
			if (i_286_ >= 0
			    && i_286_ < class161_212_.anInt1759 * 363736815 - 1
			    && i_287_ >= 0
			    && (i_287_
				< class161_212_.anInt1760 * -1152334393 - 1)) {
			    int i_288_
				= (((is_220_[i_286_][i_287_]
				     * (class161_212_.anInt1761 * 435863595
					- i_284_))
				    + is_220_[i_286_ + 1][i_287_] * i_284_)
				   >> class161_212_.anInt1763 * -2063427645);
			    int i_289_
				= (((is_220_[i_286_][i_287_ + 1]
				     * (class161_212_.anInt1761 * 435863595
					- i_284_))
				    + is_220_[i_286_ + 1][i_287_ + 1] * i_284_)
				   >> class161_212_.anInt1763 * -2063427645);
			    int i_290_
				= ((i_288_
				    * (class161_212_.anInt1761 * 435863595
				       - i_285_)) + i_289_ * i_285_
				   >> class161_212_.anInt1763 * -2063427645);
			    anIntArray9379[i_281_]
				= (anIntArray9379[i_281_] + (i_290_ - i_214_)
				   + i_270_);
			}
		    }
		} else if (i == 5) {
		    int i_291_ = class161_212_.anInt1761 * 435863595 - 1;
		    int i_292_ = aShort9381 - aShort9423;
		    for (int i_293_ = 0; i_293_ < anInt9377; i_293_++) {
			int i_294_ = anIntArray9424[i_293_] + i_213_;
			int i_295_ = anIntArray9395[i_293_] + i_215_;
			int i_296_ = i_294_ & i_291_;
			int i_297_ = i_295_ & i_291_;
			int i_298_
			    = i_294_ >> class161.anInt1763 * -2063427645;
			int i_299_
			    = i_295_ >> class161.anInt1763 * -2063427645;
			int i_300_
			    = (((is[i_298_][i_299_]
				 * (class161.anInt1761 * 435863595 - i_296_))
				+ is[i_298_ + 1][i_299_] * i_296_)
			       >> class161.anInt1763 * -2063427645);
			int i_301_
			    = (((is[i_298_][i_299_ + 1]
				 * (class161.anInt1761 * 435863595 - i_296_))
				+ is[i_298_ + 1][i_299_ + 1] * i_296_)
			       >> class161.anInt1763 * -2063427645);
			int i_302_ = (i_300_ * (class161.anInt1761 * 435863595
						- i_297_) + i_301_ * i_297_
				      >> class161.anInt1763 * -2063427645);
			i_300_ = (((is_220_[i_298_][i_299_]
				    * (class161_212_.anInt1761 * 435863595
				       - i_296_))
				   + is_220_[i_298_ + 1][i_299_] * i_296_)
				  >> class161_212_.anInt1763 * -2063427645);
			i_301_ = (((is_220_[i_298_][i_299_ + 1]
				    * (class161_212_.anInt1761 * 435863595
				       - i_296_))
				   + is_220_[i_298_ + 1][i_299_ + 1] * i_296_)
				  >> class161_212_.anInt1763 * -2063427645);
			int i_303_
			    = (i_300_ * (class161_212_.anInt1761 * 435863595
					 - i_297_) + i_301_ * i_297_
			       >> class161_212_.anInt1763 * -2063427645);
			int i_304_ = i_302_ - i_303_ - i_211_;
			anIntArray9379[i_293_]
			    = ((anIntArray9379[i_293_] << 8) / i_292_ * i_304_
			       >> 8) - (i_214_ - i_302_);
		    }
		    for (int i_305_ = anInt9377; i_305_ < anInt9394;
			 i_305_++) {
			int i_306_ = anIntArray9424[i_305_] + i_213_;
			int i_307_ = anIntArray9395[i_305_] + i_215_;
			int i_308_ = i_306_ & i_291_;
			int i_309_ = i_307_ & i_291_;
			int i_310_
			    = i_306_ >> class161.anInt1763 * -2063427645;
			int i_311_
			    = i_307_ >> class161.anInt1763 * -2063427645;
			if (i_310_ >= 0
			    && i_310_ < class161.anInt1759 * 363736815 - 1
			    && i_310_ < class161_212_.anInt1759 * 363736815 - 1
			    && i_311_ >= 0
			    && i_311_ < class161.anInt1760 * -1152334393 - 1
			    && (i_311_
				< class161_212_.anInt1760 * -1152334393 - 1)) {
			    int i_312_ = (((is[i_310_][i_311_]
					    * (class161.anInt1761 * 435863595
					       - i_308_))
					   + is[i_310_ + 1][i_311_] * i_308_)
					  >> class161.anInt1763 * -2063427645);
			    int i_313_
				= (((is[i_310_][i_311_ + 1]
				     * (class161.anInt1761 * 435863595
					- i_308_))
				    + is[i_310_ + 1][i_311_ + 1] * i_308_)
				   >> class161.anInt1763 * -2063427645);
			    int i_314_
				= (i_312_ * (class161.anInt1761 * 435863595
					     - i_309_) + i_313_ * i_309_
				   >> class161.anInt1763 * -2063427645);
			    i_312_
				= (((is_220_[i_310_][i_311_]
				     * (class161_212_.anInt1761 * 435863595
					- i_308_))
				    + is_220_[i_310_ + 1][i_311_] * i_308_)
				   >> class161_212_.anInt1763 * -2063427645);
			    i_313_
				= (((is_220_[i_310_][i_311_ + 1]
				     * (class161_212_.anInt1761 * 435863595
					- i_308_))
				    + is_220_[i_310_ + 1][i_311_ + 1] * i_308_)
				   >> class161_212_.anInt1763 * -2063427645);
			    int i_315_
				= ((i_312_
				    * (class161_212_.anInt1761 * 435863595
				       - i_309_)) + i_313_ * i_309_
				   >> class161_212_.anInt1763 * -2063427645);
			    int i_316_ = i_314_ - i_315_ - i_211_;
			    anIntArray9379[i_305_]
				= (((anIntArray9379[i_305_] << 8) / i_292_
				    * i_316_)
				   >> 8) - (i_214_ - i_314_);
			}
		    }
		}
		aBool9420 = false;
	    }
	}
    }
    
    public void method2931(int i) {
	if ((anInt9373 & 0xd) != 13)
	    throw new IllegalStateException();
	if (aClass100Array9422 != null) {
	    if (i == 4096)
		method15078();
	    else if (i == 8192)
		method15079();
	    else if (i == 12288)
		method15140();
	    else {
		int i_317_ = Class436.anIntArray4831[i];
		int i_318_ = Class436.anIntArray4838[i];
		synchronized (this) {
		    for (int i_319_ = 0; i_319_ < anInt9377; i_319_++) {
			int i_320_ = ((anIntArray9395[i_319_] * i_317_
				       + anIntArray9424[i_319_] * i_318_)
				      >> 14);
			anIntArray9395[i_319_]
			    = (anIntArray9395[i_319_] * i_318_
			       - anIntArray9424[i_319_] * i_317_) >> 14;
			anIntArray9424[i_319_] = i_320_;
			if (aClass100Array9422[i_319_] != null) {
			    i_320_ = ((aClass100Array9422[i_319_].anInt1216
				       * i_317_)
				      + (aClass100Array9422[i_319_].anInt1215
					 * i_318_)) >> 14;
			    aClass100Array9422[i_319_].anInt1216
				= ((aClass100Array9422[i_319_].anInt1216
				    * i_318_)
				   - (aClass100Array9422[i_319_].anInt1215
				      * i_317_)) >> 14;
			    aClass100Array9422[i_319_].anInt1215 = i_320_;
			}
		    }
		    if (aClass115Array9398 != null) {
			for (int i_321_ = 0; i_321_ < anInt9375; i_321_++) {
			    if (aClass115Array9398[i_321_] != null) {
				int i_322_
				    = (((aClass115Array9398[i_321_].anInt1406
					 * i_317_)
					+ (aClass115Array9398[i_321_].anInt1407
					   * i_318_))
				       >> 14);
				aClass115Array9398[i_321_].anInt1406
				    = ((aClass115Array9398[i_321_].anInt1406
					* i_318_)
				       - (aClass115Array9398[i_321_].anInt1407
					  * i_317_)) >> 14;
				aClass115Array9398[i_321_].anInt1407 = i_322_;
			    }
			}
		    }
		    for (int i_323_ = anInt9377; i_323_ < anInt9394;
			 i_323_++) {
			int i_324_ = ((anIntArray9395[i_323_] * i_317_
				       + anIntArray9424[i_323_] * i_318_)
				      >> 14);
			anIntArray9395[i_323_]
			    = (anIntArray9395[i_323_] * i_318_
			       - anIntArray9424[i_323_] * i_317_) >> 14;
			anIntArray9424[i_323_] = i_324_;
		    }
		    anInt9364 = 0;
		    aBool9420 = false;
		}
	    }
	} else
	    method2930(i);
    }
    
    final boolean method15076(int i) {
	if (aByteArray9406 == null)
	    return false;
	if (aByteArray9406[i] == 0)
	    return false;
	return true;
    }
    
    void method15077() {
	synchronized (this) {
	    for (int i = 0; i < anInt9394; i++) {
		anIntArray9424[i] = -anIntArray9424[i];
		anIntArray9395[i] = -anIntArray9395[i];
	    }
	    method15084();
	}
    }
    
    public void method2993(int i) {
	if ((anInt9373 & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    method15116();
	else if (i == 8192)
	    method15077();
	else if (i == 12288)
	    method15147();
	else {
	    int i_325_ = Class436.anIntArray4831[i];
	    int i_326_ = Class436.anIntArray4838[i];
	    synchronized (this) {
		for (int i_327_ = 0; i_327_ < anInt9394; i_327_++) {
		    int i_328_ = ((anIntArray9395[i_327_] * i_325_
				   + anIntArray9424[i_327_] * i_326_)
				  >> 14);
		    anIntArray9395[i_327_]
			= (anIntArray9395[i_327_] * i_326_
			   - anIntArray9424[i_327_] * i_325_) >> 14;
		    anIntArray9424[i_327_] = i_328_;
		}
		method15084();
	    }
	}
    }
    
    void method15078() {
	synchronized (this) {
	    for (int i = 0; i < anInt9377; i++) {
		int i_329_ = anIntArray9424[i];
		anIntArray9424[i] = anIntArray9395[i];
		anIntArray9395[i] = -i_329_;
		if (aClass100Array9422[i] != null) {
		    i_329_ = aClass100Array9422[i].anInt1215;
		    aClass100Array9422[i].anInt1215
			= aClass100Array9422[i].anInt1216;
		    aClass100Array9422[i].anInt1216 = -i_329_;
		}
	    }
	    if (aClass115Array9398 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aClass115Array9398[i] != null) {
			int i_330_ = aClass115Array9398[i].anInt1407;
			aClass115Array9398[i].anInt1407
			    = aClass115Array9398[i].anInt1406;
			aClass115Array9398[i].anInt1406 = -i_330_;
		    }
		}
	    }
	    for (int i = anInt9377; i < anInt9394; i++) {
		int i_331_ = anIntArray9424[i];
		anIntArray9424[i] = anIntArray9395[i];
		anIntArray9395[i] = -i_331_;
	    }
	    anInt9364 = 0;
	    aBool9420 = false;
	}
    }
    
    void method15079() {
	synchronized (this) {
	    for (int i = 0; i < anInt9377; i++) {
		anIntArray9424[i] = -anIntArray9424[i];
		anIntArray9395[i] = -anIntArray9395[i];
		if (aClass100Array9422[i] != null) {
		    aClass100Array9422[i].anInt1215
			= -aClass100Array9422[i].anInt1215;
		    aClass100Array9422[i].anInt1216
			= -aClass100Array9422[i].anInt1216;
		}
	    }
	    if (aClass115Array9398 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aClass115Array9398[i] != null) {
			aClass115Array9398[i].anInt1407
			    = -aClass115Array9398[i].anInt1407;
			aClass115Array9398[i].anInt1406
			    = -aClass115Array9398[i].anInt1406;
		    }
		}
	    }
	    for (int i = anInt9377; i < anInt9394; i++) {
		anIntArray9424[i] = -anIntArray9424[i];
		anIntArray9395[i] = -anIntArray9395[i];
	    }
	    anInt9364 = 0;
	    aBool9420 = false;
	}
    }
    
    void method15080() {
	if (anInt9364 == 0 && aClass100Array9422 == null) {
	    if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
		synchronized (this) {
		    method15067();
		}
	    } else
		method15067();
	}
    }
    
    boolean method15081(int i, int i_332_, float f, float f_333_, float f_334_,
			float f_335_, float f_336_, float f_337_) {
	if ((float) i_332_ < f && (float) i_332_ < f_333_
	    && (float) i_332_ < f_334_)
	    return false;
	if ((float) i_332_ > f && (float) i_332_ > f_333_
	    && (float) i_332_ > f_334_)
	    return false;
	if ((float) i < f_335_ && (float) i < f_336_ && (float) i < f_337_)
	    return false;
	if ((float) i > f_335_ && (float) i > f_336_ && (float) i > f_337_)
	    return false;
	return true;
    }
    
    public void method2933(int i) {
	if ((anInt9373 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_338_ = Class436.anIntArray4831[i];
	int i_339_ = Class436.anIntArray4838[i];
	synchronized (this) {
	    for (int i_340_ = 0; i_340_ < anInt9394; i_340_++) {
		int i_341_ = ((anIntArray9379[i_340_] * i_338_
			       + anIntArray9424[i_340_] * i_339_)
			      >> 14);
		anIntArray9379[i_340_]
		    = (anIntArray9379[i_340_] * i_339_
		       - anIntArray9424[i_340_] * i_338_) >> 14;
		anIntArray9424[i_340_] = i_341_;
	    }
	    method15084();
	}
    }
    
    public void method2934(int i, int i_342_, int i_343_) {
	if (i != 0 && (anInt9373 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_342_ != 0 && (anInt9373 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_343_ != 0 && (anInt9373 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_344_ = 0; i_344_ < anInt9394; i_344_++) {
		anIntArray9424[i_344_] += i;
		anIntArray9379[i_344_] += i_342_;
		anIntArray9395[i_344_] += i_343_;
	    }
	}
    }
    
    int method15082(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    public void method2936(int i, int i_345_, int i_346_) {
	if (i != 128 && (anInt9373 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_345_ != 128 && (anInt9373 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_346_ != 128 && (anInt9373 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_347_ = 0; i_347_ < anInt9394; i_347_++) {
		anIntArray9424[i_347_] = anIntArray9424[i_347_] * i >> 7;
		anIntArray9379[i_347_] = anIntArray9379[i_347_] * i_345_ >> 7;
		anIntArray9395[i_347_] = anIntArray9395[i_347_] * i_346_ >> 7;
	    }
	    aBool9420 = false;
	}
    }
    
    void method15083(Thread thread) {
	Class110 class110 = aClass182_Sub2_9433.method15223(thread);
	if (class110 != aClass110_9363) {
	    aClass110_9363 = class110;
	    aClass179_Sub2Array9389 = aClass110_9363.aClass179_Sub2Array1358;
	    aClass179_Sub2Array9446 = aClass110_9363.aClass179_Sub2Array1354;
	}
    }
    
    void method15084() {
	aClass100Array9422 = null;
	aClass100Array9371 = null;
	aClass115Array9398 = null;
	aBool9420 = false;
    }
    
    void method2939() {
	if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		while (aBool1916) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1916 = true;
	    }
	}
    }
    
    void method2940() {
	if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		aBool1916 = false;
		this.notifyAll();
	    }
	}
    }
    
    public void method3097(byte i, byte[] is) {
	if ((anInt9373 & 0x100000) == 0)
	    throw new RuntimeException();
	if (aByteArray9406 == null)
	    aByteArray9406 = new byte[anInt9375];
	if (is == null) {
	    for (int i_348_ = 0; i_348_ < anInt9375; i_348_++)
		aByteArray9406[i_348_] = i;
	} else {
	    for (int i_349_ = 0; i_349_ < anInt9375; i_349_++) {
		int i_350_ = 255 - ((255 - (is[i_349_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		aByteArray9406[i_349_] = (byte) i_350_;
	    }
	}
	if (anInt9364 == 2)
	    anInt9364 = 1;
    }
    
    void method2942() {
	if (aBool9409) {
	    for (int i = 0; i < anInt9394; i++) {
		anIntArray9424[i] = anIntArray9424[i] + 7 >> 4;
		anIntArray9379[i] = anIntArray9379[i] + 7 >> 4;
		anIntArray9395[i] = anIntArray9395[i] + 7 >> 4;
	    }
	    aBool9409 = false;
	}
	if (aBool9408) {
	    method15073();
	    aBool9408 = false;
	}
	aBool9420 = false;
    }
    
    void method2948(int i, int[] is, int i_351_, int i_352_, int i_353_,
		    int i_354_, boolean bool) {
	int i_355_ = is.length;
	if (i == 0) {
	    i_351_ <<= 4;
	    i_352_ <<= 4;
	    i_353_ <<= 4;
	    if (!aBool9409) {
		for (int i_356_ = 0; i_356_ < anInt9394; i_356_++) {
		    anIntArray9424[i_356_] <<= 4;
		    anIntArray9379[i_356_] <<= 4;
		    anIntArray9395[i_356_] <<= 4;
		}
		aBool9409 = true;
	    }
	    int i_357_ = 0;
	    anInt9425 = 0;
	    anInt9411 = 0;
	    anInt9412 = 0;
	    for (int i_358_ = 0; i_358_ < i_355_; i_358_++) {
		int i_359_ = is[i_358_];
		if (i_359_ < anIntArrayArray9397.length) {
		    int[] is_360_ = anIntArrayArray9397[i_359_];
		    for (int i_361_ = 0; i_361_ < is_360_.length; i_361_++) {
			int i_362_ = is_360_[i_361_];
			anInt9425 += anIntArray9424[i_362_];
			anInt9411 += anIntArray9379[i_362_];
			anInt9412 += anIntArray9395[i_362_];
			i_357_++;
		    }
		}
	    }
	    if (i_357_ > 0) {
		anInt9425 = anInt9425 / i_357_ + i_351_;
		anInt9411 = anInt9411 / i_357_ + i_352_;
		anInt9412 = anInt9412 / i_357_ + i_353_;
	    } else {
		anInt9425 = i_351_;
		anInt9411 = i_352_;
		anInt9412 = i_353_;
	    }
	} else if (i == 1) {
	    i_351_ <<= 4;
	    i_352_ <<= 4;
	    i_353_ <<= 4;
	    if (!aBool9409) {
		for (int i_363_ = 0; i_363_ < anInt9394; i_363_++) {
		    anIntArray9424[i_363_] <<= 4;
		    anIntArray9379[i_363_] <<= 4;
		    anIntArray9395[i_363_] <<= 4;
		}
		aBool9409 = true;
	    }
	    for (int i_364_ = 0; i_364_ < i_355_; i_364_++) {
		int i_365_ = is[i_364_];
		if (i_365_ < anIntArrayArray9397.length) {
		    int[] is_366_ = anIntArrayArray9397[i_365_];
		    for (int i_367_ = 0; i_367_ < is_366_.length; i_367_++) {
			int i_368_ = is_366_[i_367_];
			anIntArray9424[i_368_] += i_351_;
			anIntArray9379[i_368_] += i_352_;
			anIntArray9395[i_368_] += i_353_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_369_ = 0; i_369_ < i_355_; i_369_++) {
		int i_370_ = is[i_369_];
		if (i_370_ < anIntArrayArray9397.length) {
		    int[] is_371_ = anIntArrayArray9397[i_370_];
		    if ((i_354_ & 0x1) == 0) {
			for (int i_372_ = 0; i_372_ < is_371_.length;
			     i_372_++) {
			    int i_373_ = is_371_[i_372_];
			    anIntArray9424[i_373_] -= anInt9425;
			    anIntArray9379[i_373_] -= anInt9411;
			    anIntArray9395[i_373_] -= anInt9412;
			    if (i_353_ != 0) {
				int i_374_ = Class436.anIntArray4831[i_353_];
				int i_375_ = Class436.anIntArray4838[i_353_];
				int i_376_ = (anIntArray9379[i_373_] * i_374_
					      + anIntArray9424[i_373_] * i_375_
					      + 16383) >> 14;
				anIntArray9379[i_373_]
				    = (anIntArray9379[i_373_] * i_375_
				       - anIntArray9424[i_373_] * i_374_
				       + 16383) >> 14;
				anIntArray9424[i_373_] = i_376_;
			    }
			    if (i_351_ != 0) {
				int i_377_ = Class436.anIntArray4831[i_351_];
				int i_378_ = Class436.anIntArray4838[i_351_];
				int i_379_ = (anIntArray9379[i_373_] * i_378_
					      - anIntArray9395[i_373_] * i_377_
					      + 16383) >> 14;
				anIntArray9395[i_373_]
				    = (anIntArray9379[i_373_] * i_377_
				       + anIntArray9395[i_373_] * i_378_
				       + 16383) >> 14;
				anIntArray9379[i_373_] = i_379_;
			    }
			    if (i_352_ != 0) {
				int i_380_ = Class436.anIntArray4831[i_352_];
				int i_381_ = Class436.anIntArray4838[i_352_];
				int i_382_ = (anIntArray9395[i_373_] * i_380_
					      + anIntArray9424[i_373_] * i_381_
					      + 16383) >> 14;
				anIntArray9395[i_373_]
				    = (anIntArray9395[i_373_] * i_381_
				       - anIntArray9424[i_373_] * i_380_
				       + 16383) >> 14;
				anIntArray9424[i_373_] = i_382_;
			    }
			    anIntArray9424[i_373_] += anInt9425;
			    anIntArray9379[i_373_] += anInt9411;
			    anIntArray9395[i_373_] += anInt9412;
			}
		    } else {
			for (int i_383_ = 0; i_383_ < is_371_.length;
			     i_383_++) {
			    int i_384_ = is_371_[i_383_];
			    anIntArray9424[i_384_] -= anInt9425;
			    anIntArray9379[i_384_] -= anInt9411;
			    anIntArray9395[i_384_] -= anInt9412;
			    if (i_351_ != 0) {
				int i_385_ = Class436.anIntArray4831[i_351_];
				int i_386_ = Class436.anIntArray4838[i_351_];
				int i_387_ = (anIntArray9379[i_384_] * i_386_
					      - anIntArray9395[i_384_] * i_385_
					      + 16383) >> 14;
				anIntArray9395[i_384_]
				    = (anIntArray9379[i_384_] * i_385_
				       + anIntArray9395[i_384_] * i_386_
				       + 16383) >> 14;
				anIntArray9379[i_384_] = i_387_;
			    }
			    if (i_353_ != 0) {
				int i_388_ = Class436.anIntArray4831[i_353_];
				int i_389_ = Class436.anIntArray4838[i_353_];
				int i_390_ = (anIntArray9379[i_384_] * i_388_
					      + anIntArray9424[i_384_] * i_389_
					      + 16383) >> 14;
				anIntArray9379[i_384_]
				    = (anIntArray9379[i_384_] * i_389_
				       - anIntArray9424[i_384_] * i_388_
				       + 16383) >> 14;
				anIntArray9424[i_384_] = i_390_;
			    }
			    if (i_352_ != 0) {
				int i_391_ = Class436.anIntArray4831[i_352_];
				int i_392_ = Class436.anIntArray4838[i_352_];
				int i_393_ = (anIntArray9395[i_384_] * i_391_
					      + anIntArray9424[i_384_] * i_392_
					      + 16383) >> 14;
				anIntArray9395[i_384_]
				    = (anIntArray9395[i_384_] * i_392_
				       - anIntArray9424[i_384_] * i_391_
				       + 16383) >> 14;
				anIntArray9424[i_384_] = i_393_;
			    }
			    anIntArray9424[i_384_] += anInt9425;
			    anIntArray9379[i_384_] += anInt9411;
			    anIntArray9395[i_384_] += anInt9412;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_394_ = 0; i_394_ < i_355_; i_394_++) {
		int i_395_ = is[i_394_];
		if (i_395_ < anIntArrayArray9397.length) {
		    int[] is_396_ = anIntArrayArray9397[i_395_];
		    for (int i_397_ = 0; i_397_ < is_396_.length; i_397_++) {
			int i_398_ = is_396_[i_397_];
			anIntArray9424[i_398_] -= anInt9425;
			anIntArray9379[i_398_] -= anInt9411;
			anIntArray9395[i_398_] -= anInt9412;
			anIntArray9424[i_398_]
			    = anIntArray9424[i_398_] * i_351_ / 128;
			anIntArray9379[i_398_]
			    = anIntArray9379[i_398_] * i_352_ / 128;
			anIntArray9395[i_398_]
			    = anIntArray9395[i_398_] * i_353_ / 128;
			anIntArray9424[i_398_] += anInt9425;
			anIntArray9379[i_398_] += anInt9411;
			anIntArray9395[i_398_] += anInt9412;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9445 != null && aByteArray9406 != null) {
		for (int i_399_ = 0; i_399_ < i_355_; i_399_++) {
		    int i_400_ = is[i_399_];
		    if (i_400_ < anIntArrayArray9445.length) {
			int[] is_401_ = anIntArrayArray9445[i_400_];
			for (int i_402_ = 0; i_402_ < is_401_.length;
			     i_402_++) {
			    int i_403_ = is_401_[i_402_];
			    int i_404_
				= (aByteArray9406[i_403_] & 0xff) + i_351_ * 8;
			    if (i_404_ < 0)
				i_404_ = 0;
			    else if (i_404_ > 255)
				i_404_ = 255;
			    aByteArray9406[i_403_] = (byte) i_404_;
			}
		    }
		}
		if (aClass103Array9417 != null) {
		    for (int i_405_ = 0; i_405_ < anInt9416; i_405_++) {
			Class103 class103 = aClass103Array9417[i_405_];
			Class107 class107 = aClass107Array9441[i_405_];
			class107.anInt1304
			    = (class107.anInt1304 * -1093122285 & 0xffffff
			       | 255 - ((aByteArray9406
					 [class103.anInt1273 * -954563709])
					& 0xff) << 24) * 540580635;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9445 != null) {
		for (int i_406_ = 0; i_406_ < i_355_; i_406_++) {
		    int i_407_ = is[i_406_];
		    if (i_407_ < anIntArrayArray9445.length) {
			int[] is_408_ = anIntArrayArray9445[i_407_];
			for (int i_409_ = 0; i_409_ < is_408_.length;
			     i_409_++) {
			    int i_410_ = is_408_[i_409_];
			    int i_411_ = aShortArray9403[i_410_] & 0xffff;
			    int i_412_ = i_411_ >> 10 & 0x3f;
			    int i_413_ = i_411_ >> 7 & 0x7;
			    int i_414_ = i_411_ & 0x7f;
			    i_412_ = i_412_ + i_351_ & 0x3f;
			    i_413_ += i_352_;
			    if (i_413_ < 0)
				i_413_ = 0;
			    else if (i_413_ > 7)
				i_413_ = 7;
			    i_414_ += i_353_;
			    if (i_414_ < 0)
				i_414_ = 0;
			    else if (i_414_ > 127)
				i_414_ = 127;
			    aShortArray9403[i_410_]
				= (short) (i_412_ << 10 | i_413_ << 7
					   | i_414_);
			}
			aBool9408 = true;
		    }
		}
		if (aClass103Array9417 != null) {
		    for (int i_415_ = 0; i_415_ < anInt9416; i_415_++) {
			Class103 class103 = aClass103Array9417[i_415_];
			Class107 class107 = aClass107Array9441[i_415_];
			class107.anInt1304
			    = (class107.anInt1304 * -1093122285 & ~0xffffff
			       | ((Class381.anIntArray3929
				   [Class504.method8313(((aShortArray9403
							  [(class103.anInt1273
							    * -954563709)])
							 & 0xffff),
							1066184367) & 0xffff])
				  & 0xffffff)) * 540580635;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9419 != null) {
		for (int i_416_ = 0; i_416_ < i_355_; i_416_++) {
		    int i_417_ = is[i_416_];
		    if (i_417_ < anIntArrayArray9419.length) {
			int[] is_418_ = anIntArrayArray9419[i_417_];
			for (int i_419_ = 0; i_419_ < is_418_.length;
			     i_419_++) {
			    Class107 class107
				= aClass107Array9441[is_418_[i_419_]];
			    class107.anInt1297 += i_351_ * -1780640007;
			    class107.anInt1298 += i_352_ * -1349044133;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9419 != null) {
		for (int i_420_ = 0; i_420_ < i_355_; i_420_++) {
		    int i_421_ = is[i_420_];
		    if (i_421_ < anIntArrayArray9419.length) {
			int[] is_422_ = anIntArrayArray9419[i_421_];
			for (int i_423_ = 0; i_423_ < is_422_.length;
			     i_423_++) {
			    Class107 class107
				= aClass107Array9441[is_422_[i_423_]];
			    class107.aFloat1295 = (class107.aFloat1295
						   * (float) i_351_ / 128.0F);
			    class107.aFloat1296 = (class107.aFloat1296
						   * (float) i_352_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9419 != null) {
		for (int i_424_ = 0; i_424_ < i_355_; i_424_++) {
		    int i_425_ = is[i_424_];
		    if (i_425_ < anIntArrayArray9419.length) {
			int[] is_426_ = anIntArrayArray9419[i_425_];
			for (int i_427_ = 0; i_427_ < is_426_.length;
			     i_427_++) {
			    Class107 class107
				= aClass107Array9441[is_426_[i_427_]];
			    class107.anInt1299
				= (class107.anInt1299 * -1829505101 + i_351_
				   & 0x3fff) * -412512389;
			}
		    }
		}
	    }
	}
    }
    
    void method2949(int i, int[] is, int i_428_, int i_429_, int i_430_,
		    boolean bool, int i_431_, int[] is_432_) {
	int i_433_ = is.length;
	if (i == 0) {
	    i_428_ <<= 4;
	    i_429_ <<= 4;
	    i_430_ <<= 4;
	    if (!aBool9409) {
		for (int i_434_ = 0; i_434_ < anInt9394; i_434_++) {
		    anIntArray9424[i_434_] <<= 4;
		    anIntArray9379[i_434_] <<= 4;
		    anIntArray9395[i_434_] <<= 4;
		}
		aBool9409 = true;
	    }
	    int i_435_ = 0;
	    anInt9425 = 0;
	    anInt9411 = 0;
	    anInt9412 = 0;
	    for (int i_436_ = 0; i_436_ < i_433_; i_436_++) {
		int i_437_ = is[i_436_];
		if (i_437_ < anIntArrayArray9397.length) {
		    int[] is_438_ = anIntArrayArray9397[i_437_];
		    for (int i_439_ = 0; i_439_ < is_438_.length; i_439_++) {
			int i_440_ = is_438_[i_439_];
			if (aShortArray9378 == null
			    || (i_431_ & aShortArray9378[i_440_]) != 0) {
			    anInt9425 += anIntArray9424[i_440_];
			    anInt9411 += anIntArray9379[i_440_];
			    anInt9412 += anIntArray9395[i_440_];
			    i_435_++;
			}
		    }
		}
	    }
	    if (i_435_ > 0) {
		anInt9425 = anInt9425 / i_435_ + i_428_;
		anInt9411 = anInt9411 / i_435_ + i_429_;
		anInt9412 = anInt9412 / i_435_ + i_430_;
		aBool9414 = true;
	    } else {
		anInt9425 = i_428_;
		anInt9411 = i_429_;
		anInt9412 = i_430_;
	    }
	} else if (i == 1) {
	    if (is_432_ != null) {
		int i_441_ = ((is_432_[0] * i_428_ + is_432_[1] * i_429_
			       + is_432_[2] * i_430_ + 8192)
			      >> 14);
		int i_442_ = ((is_432_[3] * i_428_ + is_432_[4] * i_429_
			       + is_432_[5] * i_430_ + 8192)
			      >> 14);
		int i_443_ = ((is_432_[6] * i_428_ + is_432_[7] * i_429_
			       + is_432_[8] * i_430_ + 8192)
			      >> 14);
		i_428_ = i_441_;
		i_429_ = i_442_;
		i_430_ = i_443_;
	    }
	    i_428_ <<= 4;
	    i_429_ <<= 4;
	    i_430_ <<= 4;
	    if (!aBool9409) {
		for (int i_444_ = 0; i_444_ < anInt9394; i_444_++) {
		    anIntArray9424[i_444_] <<= 4;
		    anIntArray9379[i_444_] <<= 4;
		    anIntArray9395[i_444_] <<= 4;
		}
		aBool9409 = true;
	    }
	    for (int i_445_ = 0; i_445_ < i_433_; i_445_++) {
		int i_446_ = is[i_445_];
		if (i_446_ < anIntArrayArray9397.length) {
		    int[] is_447_ = anIntArrayArray9397[i_446_];
		    for (int i_448_ = 0; i_448_ < is_447_.length; i_448_++) {
			int i_449_ = is_447_[i_448_];
			if (aShortArray9378 == null
			    || (i_431_ & aShortArray9378[i_449_]) != 0) {
			    anIntArray9424[i_449_] += i_428_;
			    anIntArray9379[i_449_] += i_429_;
			    anIntArray9395[i_449_] += i_430_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_432_ != null) {
		if (!aBool9409) {
		    for (int i_450_ = 0; i_450_ < anInt9394; i_450_++) {
			anIntArray9424[i_450_] <<= 4;
			anIntArray9379[i_450_] <<= 4;
			anIntArray9395[i_450_] <<= 4;
		    }
		    aBool9409 = true;
		}
		int i_451_ = is_432_[9] << 4;
		int i_452_ = is_432_[10] << 4;
		int i_453_ = is_432_[11] << 4;
		int i_454_ = is_432_[12] << 4;
		int i_455_ = is_432_[13] << 4;
		int i_456_ = is_432_[14] << 4;
		if (aBool9414) {
		    int i_457_
			= ((is_432_[0] * anInt9425 + is_432_[3] * anInt9411
			    + is_432_[6] * anInt9412 + 8192)
			   >> 14);
		    int i_458_
			= ((is_432_[1] * anInt9425 + is_432_[4] * anInt9411
			    + is_432_[7] * anInt9412 + 8192)
			   >> 14);
		    int i_459_
			= ((is_432_[2] * anInt9425 + is_432_[5] * anInt9411
			    + is_432_[8] * anInt9412 + 8192)
			   >> 14);
		    i_457_ += i_454_;
		    i_458_ += i_455_;
		    i_459_ += i_456_;
		    anInt9425 = i_457_;
		    anInt9411 = i_458_;
		    anInt9412 = i_459_;
		    aBool9414 = false;
		}
		int[] is_460_ = new int[9];
		int i_461_ = Class436.anIntArray4838[i_428_];
		int i_462_ = Class436.anIntArray4831[i_428_];
		int i_463_ = Class436.anIntArray4838[i_429_];
		int i_464_ = Class436.anIntArray4831[i_429_];
		int i_465_ = Class436.anIntArray4838[i_430_];
		int i_466_ = Class436.anIntArray4831[i_430_];
		int i_467_ = i_462_ * i_465_ + 8192 >> 14;
		int i_468_ = i_462_ * i_466_ + 8192 >> 14;
		is_460_[0] = i_463_ * i_465_ + i_464_ * i_468_ + 8192 >> 14;
		is_460_[1] = -i_463_ * i_466_ + i_464_ * i_467_ + 8192 >> 14;
		is_460_[2] = i_464_ * i_461_ + 8192 >> 14;
		is_460_[3] = i_461_ * i_466_ + 8192 >> 14;
		is_460_[4] = i_461_ * i_465_ + 8192 >> 14;
		is_460_[5] = -i_462_;
		is_460_[6] = -i_464_ * i_465_ + i_463_ * i_468_ + 8192 >> 14;
		is_460_[7] = i_464_ * i_466_ + i_463_ * i_467_ + 8192 >> 14;
		is_460_[8] = i_463_ * i_461_ + 8192 >> 14;
		int i_469_ = (is_460_[0] * -anInt9425 + is_460_[1] * -anInt9411
			      + is_460_[2] * -anInt9412 + 8192) >> 14;
		int i_470_ = (is_460_[3] * -anInt9425 + is_460_[4] * -anInt9411
			      + is_460_[5] * -anInt9412 + 8192) >> 14;
		int i_471_ = (is_460_[6] * -anInt9425 + is_460_[7] * -anInt9411
			      + is_460_[8] * -anInt9412 + 8192) >> 14;
		int i_472_ = i_469_ + anInt9425;
		int i_473_ = i_470_ + anInt9411;
		int i_474_ = i_471_ + anInt9412;
		int[] is_475_ = new int[9];
		for (int i_476_ = 0; i_476_ < 3; i_476_++) {
		    for (int i_477_ = 0; i_477_ < 3; i_477_++) {
			int i_478_ = 0;
			for (int i_479_ = 0; i_479_ < 3; i_479_++)
			    i_478_ += (is_460_[i_476_ * 3 + i_479_]
				       * is_432_[i_477_ * 3 + i_479_]);
			is_475_[i_476_ * 3 + i_477_] = i_478_ + 8192 >> 14;
		    }
		}
		int i_480_ = ((is_460_[0] * i_454_ + is_460_[1] * i_455_
			       + is_460_[2] * i_456_ + 8192)
			      >> 14);
		int i_481_ = ((is_460_[3] * i_454_ + is_460_[4] * i_455_
			       + is_460_[5] * i_456_ + 8192)
			      >> 14);
		int i_482_ = ((is_460_[6] * i_454_ + is_460_[7] * i_455_
			       + is_460_[8] * i_456_ + 8192)
			      >> 14);
		i_480_ += i_472_;
		i_481_ += i_473_;
		i_482_ += i_474_;
		int[] is_483_ = new int[9];
		for (int i_484_ = 0; i_484_ < 3; i_484_++) {
		    for (int i_485_ = 0; i_485_ < 3; i_485_++) {
			int i_486_ = 0;
			for (int i_487_ = 0; i_487_ < 3; i_487_++)
			    i_486_ += (is_432_[i_484_ * 3 + i_487_]
				       * is_475_[i_485_ + i_487_ * 3]);
			is_483_[i_484_ * 3 + i_485_] = i_486_ + 8192 >> 14;
		    }
		}
		int i_488_ = ((is_432_[0] * i_480_ + is_432_[1] * i_481_
			       + is_432_[2] * i_482_ + 8192)
			      >> 14);
		int i_489_ = ((is_432_[3] * i_480_ + is_432_[4] * i_481_
			       + is_432_[5] * i_482_ + 8192)
			      >> 14);
		int i_490_ = ((is_432_[6] * i_480_ + is_432_[7] * i_481_
			       + is_432_[8] * i_482_ + 8192)
			      >> 14);
		i_488_ += i_451_;
		i_489_ += i_452_;
		i_490_ += i_453_;
		for (int i_491_ = 0; i_491_ < i_433_; i_491_++) {
		    int i_492_ = is[i_491_];
		    if (i_492_ < anIntArrayArray9397.length) {
			int[] is_493_ = anIntArrayArray9397[i_492_];
			for (int i_494_ = 0; i_494_ < is_493_.length;
			     i_494_++) {
			    int i_495_ = is_493_[i_494_];
			    if (aShortArray9378 == null
				|| (i_431_ & aShortArray9378[i_495_]) != 0) {
				int i_496_
				    = ((is_483_[0] * anIntArray9424[i_495_]
					+ is_483_[1] * anIntArray9379[i_495_]
					+ is_483_[2] * anIntArray9395[i_495_]
					+ 8192)
				       >> 14);
				int i_497_
				    = ((is_483_[3] * anIntArray9424[i_495_]
					+ is_483_[4] * anIntArray9379[i_495_]
					+ is_483_[5] * anIntArray9395[i_495_]
					+ 8192)
				       >> 14);
				int i_498_
				    = ((is_483_[6] * anIntArray9424[i_495_]
					+ is_483_[7] * anIntArray9379[i_495_]
					+ is_483_[8] * anIntArray9395[i_495_]
					+ 8192)
				       >> 14);
				i_496_ += i_488_;
				i_497_ += i_489_;
				i_498_ += i_490_;
				anIntArray9424[i_495_] = i_496_;
				anIntArray9379[i_495_] = i_497_;
				anIntArray9395[i_495_] = i_498_;
			    }
			}
		    }
		}
	    } else {
		for (int i_499_ = 0; i_499_ < i_433_; i_499_++) {
		    int i_500_ = is[i_499_];
		    if (i_500_ < anIntArrayArray9397.length) {
			int[] is_501_ = anIntArrayArray9397[i_500_];
			for (int i_502_ = 0; i_502_ < is_501_.length;
			     i_502_++) {
			    int i_503_ = is_501_[i_502_];
			    if (aShortArray9378 == null
				|| (i_431_ & aShortArray9378[i_503_]) != 0) {
				anIntArray9424[i_503_] -= anInt9425;
				anIntArray9379[i_503_] -= anInt9411;
				anIntArray9395[i_503_] -= anInt9412;
				if (i_430_ != 0) {
				    int i_504_
					= Class436.anIntArray4831[i_430_];
				    int i_505_
					= Class436.anIntArray4838[i_430_];
				    int i_506_
					= ((anIntArray9379[i_503_] * i_504_
					    + anIntArray9424[i_503_] * i_505_
					    + 16383)
					   >> 14);
				    anIntArray9379[i_503_]
					= (anIntArray9379[i_503_] * i_505_
					   - anIntArray9424[i_503_] * i_504_
					   + 16383) >> 14;
				    anIntArray9424[i_503_] = i_506_;
				}
				if (i_428_ != 0) {
				    int i_507_
					= Class436.anIntArray4831[i_428_];
				    int i_508_
					= Class436.anIntArray4838[i_428_];
				    int i_509_
					= ((anIntArray9379[i_503_] * i_508_
					    - anIntArray9395[i_503_] * i_507_
					    + 16383)
					   >> 14);
				    anIntArray9395[i_503_]
					= (anIntArray9379[i_503_] * i_507_
					   + anIntArray9395[i_503_] * i_508_
					   + 16383) >> 14;
				    anIntArray9379[i_503_] = i_509_;
				}
				if (i_429_ != 0) {
				    int i_510_
					= Class436.anIntArray4831[i_429_];
				    int i_511_
					= Class436.anIntArray4838[i_429_];
				    int i_512_
					= ((anIntArray9395[i_503_] * i_510_
					    + anIntArray9424[i_503_] * i_511_
					    + 16383)
					   >> 14);
				    anIntArray9395[i_503_]
					= (anIntArray9395[i_503_] * i_511_
					   - anIntArray9424[i_503_] * i_510_
					   + 16383) >> 14;
				    anIntArray9424[i_503_] = i_512_;
				}
				anIntArray9424[i_503_] += anInt9425;
				anIntArray9379[i_503_] += anInt9411;
				anIntArray9395[i_503_] += anInt9412;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_432_ != null) {
		if (!aBool9409) {
		    for (int i_513_ = 0; i_513_ < anInt9394; i_513_++) {
			anIntArray9424[i_513_] <<= 4;
			anIntArray9379[i_513_] <<= 4;
			anIntArray9395[i_513_] <<= 4;
		    }
		    aBool9409 = true;
		}
		int i_514_ = is_432_[9] << 4;
		int i_515_ = is_432_[10] << 4;
		int i_516_ = is_432_[11] << 4;
		int i_517_ = is_432_[12] << 4;
		int i_518_ = is_432_[13] << 4;
		int i_519_ = is_432_[14] << 4;
		if (aBool9414) {
		    int i_520_
			= ((is_432_[0] * anInt9425 + is_432_[3] * anInt9411
			    + is_432_[6] * anInt9412 + 8192)
			   >> 14);
		    int i_521_
			= ((is_432_[1] * anInt9425 + is_432_[4] * anInt9411
			    + is_432_[7] * anInt9412 + 8192)
			   >> 14);
		    int i_522_
			= ((is_432_[2] * anInt9425 + is_432_[5] * anInt9411
			    + is_432_[8] * anInt9412 + 8192)
			   >> 14);
		    i_520_ += i_517_;
		    i_521_ += i_518_;
		    i_522_ += i_519_;
		    anInt9425 = i_520_;
		    anInt9411 = i_521_;
		    anInt9412 = i_522_;
		    aBool9414 = false;
		}
		int i_523_ = i_428_ << 15 >> 7;
		int i_524_ = i_429_ << 15 >> 7;
		int i_525_ = i_430_ << 15 >> 7;
		int i_526_ = i_523_ * -anInt9425 + 8192 >> 14;
		int i_527_ = i_524_ * -anInt9411 + 8192 >> 14;
		int i_528_ = i_525_ * -anInt9412 + 8192 >> 14;
		int i_529_ = i_526_ + anInt9425;
		int i_530_ = i_527_ + anInt9411;
		int i_531_ = i_528_ + anInt9412;
		int[] is_532_ = new int[9];
		is_532_[0] = i_523_ * is_432_[0] + 8192 >> 14;
		is_532_[1] = i_523_ * is_432_[3] + 8192 >> 14;
		is_532_[2] = i_523_ * is_432_[6] + 8192 >> 14;
		is_532_[3] = i_524_ * is_432_[1] + 8192 >> 14;
		is_532_[4] = i_524_ * is_432_[4] + 8192 >> 14;
		is_532_[5] = i_524_ * is_432_[7] + 8192 >> 14;
		is_532_[6] = i_525_ * is_432_[2] + 8192 >> 14;
		is_532_[7] = i_525_ * is_432_[5] + 8192 >> 14;
		is_532_[8] = i_525_ * is_432_[8] + 8192 >> 14;
		int i_533_ = i_523_ * i_517_ + 8192 >> 14;
		int i_534_ = i_524_ * i_518_ + 8192 >> 14;
		int i_535_ = i_525_ * i_519_ + 8192 >> 14;
		i_533_ += i_529_;
		i_534_ += i_530_;
		i_535_ += i_531_;
		int[] is_536_ = new int[9];
		for (int i_537_ = 0; i_537_ < 3; i_537_++) {
		    for (int i_538_ = 0; i_538_ < 3; i_538_++) {
			int i_539_ = 0;
			for (int i_540_ = 0; i_540_ < 3; i_540_++)
			    i_539_ += (is_432_[i_537_ * 3 + i_540_]
				       * is_532_[i_538_ + i_540_ * 3]);
			is_536_[i_537_ * 3 + i_538_] = i_539_ + 8192 >> 14;
		    }
		}
		int i_541_ = ((is_432_[0] * i_533_ + is_432_[1] * i_534_
			       + is_432_[2] * i_535_ + 8192)
			      >> 14);
		int i_542_ = ((is_432_[3] * i_533_ + is_432_[4] * i_534_
			       + is_432_[5] * i_535_ + 8192)
			      >> 14);
		int i_543_ = ((is_432_[6] * i_533_ + is_432_[7] * i_534_
			       + is_432_[8] * i_535_ + 8192)
			      >> 14);
		i_541_ += i_514_;
		i_542_ += i_515_;
		i_543_ += i_516_;
		for (int i_544_ = 0; i_544_ < i_433_; i_544_++) {
		    int i_545_ = is[i_544_];
		    if (i_545_ < anIntArrayArray9397.length) {
			int[] is_546_ = anIntArrayArray9397[i_545_];
			for (int i_547_ = 0; i_547_ < is_546_.length;
			     i_547_++) {
			    int i_548_ = is_546_[i_547_];
			    if (aShortArray9378 == null
				|| (i_431_ & aShortArray9378[i_548_]) != 0) {
				int i_549_
				    = ((is_536_[0] * anIntArray9424[i_548_]
					+ is_536_[1] * anIntArray9379[i_548_]
					+ is_536_[2] * anIntArray9395[i_548_]
					+ 8192)
				       >> 14);
				int i_550_
				    = ((is_536_[3] * anIntArray9424[i_548_]
					+ is_536_[4] * anIntArray9379[i_548_]
					+ is_536_[5] * anIntArray9395[i_548_]
					+ 8192)
				       >> 14);
				int i_551_
				    = ((is_536_[6] * anIntArray9424[i_548_]
					+ is_536_[7] * anIntArray9379[i_548_]
					+ is_536_[8] * anIntArray9395[i_548_]
					+ 8192)
				       >> 14);
				i_549_ += i_541_;
				i_550_ += i_542_;
				i_551_ += i_543_;
				anIntArray9424[i_548_] = i_549_;
				anIntArray9379[i_548_] = i_550_;
				anIntArray9395[i_548_] = i_551_;
			    }
			}
		    }
		}
	    } else {
		for (int i_552_ = 0; i_552_ < i_433_; i_552_++) {
		    int i_553_ = is[i_552_];
		    if (i_553_ < anIntArrayArray9397.length) {
			int[] is_554_ = anIntArrayArray9397[i_553_];
			for (int i_555_ = 0; i_555_ < is_554_.length;
			     i_555_++) {
			    int i_556_ = is_554_[i_555_];
			    if (aShortArray9378 == null
				|| (i_431_ & aShortArray9378[i_556_]) != 0) {
				anIntArray9424[i_556_] -= anInt9425;
				anIntArray9379[i_556_] -= anInt9411;
				anIntArray9395[i_556_] -= anInt9412;
				anIntArray9424[i_556_]
				    = anIntArray9424[i_556_] * i_428_ / 128;
				anIntArray9379[i_556_]
				    = anIntArray9379[i_556_] * i_429_ / 128;
				anIntArray9395[i_556_]
				    = anIntArray9395[i_556_] * i_430_ / 128;
				anIntArray9424[i_556_] += anInt9425;
				anIntArray9379[i_556_] += anInt9411;
				anIntArray9395[i_556_] += anInt9412;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9445 != null && aByteArray9406 != null) {
		for (int i_557_ = 0; i_557_ < i_433_; i_557_++) {
		    int i_558_ = is[i_557_];
		    if (i_558_ < anIntArrayArray9445.length) {
			int[] is_559_ = anIntArrayArray9445[i_558_];
			for (int i_560_ = 0; i_560_ < is_559_.length;
			     i_560_++) {
			    int i_561_ = is_559_[i_560_];
			    if (aShortArray9404 == null
				|| (i_431_ & aShortArray9404[i_561_]) != 0) {
				int i_562_ = ((aByteArray9406[i_561_] & 0xff)
					      + i_428_ * 8);
				if (i_562_ < 0)
				    i_562_ = 0;
				else if (i_562_ > 255)
				    i_562_ = 255;
				aByteArray9406[i_561_] = (byte) i_562_;
			    }
			}
		    }
		}
		if (aClass103Array9417 != null) {
		    for (int i_563_ = 0; i_563_ < anInt9416; i_563_++) {
			Class103 class103 = aClass103Array9417[i_563_];
			Class107 class107 = aClass107Array9441[i_563_];
			class107.anInt1304
			    = (class107.anInt1304 * -1093122285 & 0xffffff
			       | 255 - ((aByteArray9406
					 [class103.anInt1273 * -954563709])
					& 0xff) << 24) * 540580635;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9445 != null) {
		for (int i_564_ = 0; i_564_ < i_433_; i_564_++) {
		    int i_565_ = is[i_564_];
		    if (i_565_ < anIntArrayArray9445.length) {
			int[] is_566_ = anIntArrayArray9445[i_565_];
			for (int i_567_ = 0; i_567_ < is_566_.length;
			     i_567_++) {
			    int i_568_ = is_566_[i_567_];
			    if (aShortArray9404 == null
				|| (i_431_ & aShortArray9404[i_568_]) != 0) {
				int i_569_ = aShortArray9403[i_568_] & 0xffff;
				int i_570_ = i_569_ >> 10 & 0x3f;
				int i_571_ = i_569_ >> 7 & 0x7;
				int i_572_ = i_569_ & 0x7f;
				i_570_ = i_570_ + i_428_ & 0x3f;
				i_571_ += i_429_;
				if (i_571_ < 0)
				    i_571_ = 0;
				else if (i_571_ > 7)
				    i_571_ = 7;
				i_572_ += i_430_;
				if (i_572_ < 0)
				    i_572_ = 0;
				else if (i_572_ > 127)
				    i_572_ = 127;
				aShortArray9403[i_568_]
				    = (short) (i_570_ << 10 | i_571_ << 7
					       | i_572_);
			    }
			}
			aBool9408 = true;
		    }
		}
		if (aClass103Array9417 != null) {
		    for (int i_573_ = 0; i_573_ < anInt9416; i_573_++) {
			Class103 class103 = aClass103Array9417[i_573_];
			Class107 class107 = aClass107Array9441[i_573_];
			class107.anInt1304
			    = (class107.anInt1304 * -1093122285 & ~0xffffff
			       | ((Class381.anIntArray3929
				   [Class504.method8313(((aShortArray9403
							  [(class103.anInt1273
							    * -954563709)])
							 & 0xffff),
							1499965383) & 0xffff])
				  & 0xffffff)) * 540580635;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9419 != null) {
		for (int i_574_ = 0; i_574_ < i_433_; i_574_++) {
		    int i_575_ = is[i_574_];
		    if (i_575_ < anIntArrayArray9419.length) {
			int[] is_576_ = anIntArrayArray9419[i_575_];
			for (int i_577_ = 0; i_577_ < is_576_.length;
			     i_577_++) {
			    Class107 class107
				= aClass107Array9441[is_576_[i_577_]];
			    class107.anInt1297 += i_428_ * -1780640007;
			    class107.anInt1298 += i_429_ * -1349044133;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9419 != null) {
		for (int i_578_ = 0; i_578_ < i_433_; i_578_++) {
		    int i_579_ = is[i_578_];
		    if (i_579_ < anIntArrayArray9419.length) {
			int[] is_580_ = anIntArrayArray9419[i_579_];
			for (int i_581_ = 0; i_581_ < is_580_.length;
			     i_581_++) {
			    Class107 class107
				= aClass107Array9441[is_580_[i_581_]];
			    class107.aFloat1295 = (class107.aFloat1295
						   * (float) i_428_ / 128.0F);
			    class107.aFloat1296 = (class107.aFloat1296
						   * (float) i_429_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9419 != null) {
		for (int i_582_ = 0; i_582_ < i_433_; i_582_++) {
		    int i_583_ = is[i_582_];
		    if (i_583_ < anIntArrayArray9419.length) {
			int[] is_584_ = anIntArrayArray9419[i_583_];
			for (int i_585_ = 0; i_585_ < is_584_.length;
			     i_585_++) {
			    Class107 class107
				= aClass107Array9441[is_584_[i_585_]];
			    class107.anInt1299
				= (class107.anInt1299 * -1829505101 + i_428_
				   & 0x3fff) * -412512389;
			}
		    }
		}
	    }
	}
    }
    
    public void method2978(Class444 class444) {
	method15065(aClass182_Sub2_9433.method15223(Thread.currentThread()));
	Class435 class435 = aClass110_9362.aClass435_1340;
	class435.method7040(class444);
	if (aClass184Array9386 != null) {
	    for (int i = 0; i < aClass184Array9386.length; i++) {
		Class184 class184 = aClass184Array9386[i];
		Class184 class184_586_ = class184;
		if (class184.aClass184_2070 != null)
		    class184_586_ = class184.aClass184_2070;
		class184_586_.anInt2077
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 908167867);
		class184_586_.anInt2063
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * -289521417);
		class184_586_.anInt2072
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 1741678221);
		class184_586_.anInt2073
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -1237556839);
		class184_586_.anInt2074
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * 995078737);
		class184_586_.anInt2075
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -285158923);
		class184_586_.anInt2071
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -970783049);
		class184_586_.anInt2067
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -779882021);
		class184_586_.anInt2078
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -1530339371);
	    }
	}
	if (aClass154Array9415 != null) {
	    for (int i = 0; i < aClass154Array9415.length; i++) {
		Class154 class154 = aClass154Array9415[i];
		Class154 class154_587_ = class154;
		if (class154.aClass154_1728 != null)
		    class154_587_ = class154.aClass154_1728;
		if (class154.aClass435_1727 != null)
		    class154.aClass435_1727.method6947(class435);
		else
		    class154.aClass435_1727 = new Class435(class435);
		class154_587_.anInt1730
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -1389867987);
		class154_587_.anInt1731
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -182905551);
		class154_587_.anInt1732
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * 1917380171);
	    }
	}
    }
    
    public void method2943(Class444 class444, int i, boolean bool) {
	if (aShortArray9378 != null) {
	    Class110 class110
		= aClass182_Sub2_9433.method15223(Thread.currentThread());
	    Class444 class444_588_ = class110.aClass444_1337;
	    class444_588_.method7154(class444);
	    if (bool)
		class444_588_.method7138();
	    Class435 class435 = class110.aClass435_1340;
	    class435.method7040(class444_588_);
	    float[] fs = new float[3];
	    for (int i_589_ = 0; i_589_ < anInt9377; i_589_++) {
		if ((i & aShortArray9378[i_589_]) != 0) {
		    class435.method6956((float) anIntArray9424[i_589_],
					(float) anIntArray9379[i_589_],
					(float) anIntArray9395[i_589_], fs);
		    anIntArray9424[i_589_] = (int) fs[0];
		    anIntArray9379[i_589_] = (int) fs[1];
		    anIntArray9395[i_589_] = (int) fs[2];
		}
	    }
	}
    }
    
    public void method2953(Class444 class444, Class211 class211, int i) {
	method15085(class444, class211, i);
    }
    
    void method15085(Class444 class444, Class211 class211, int i) {
	if (anInt9377 >= 1) {
	    Class110 class110
		= aClass182_Sub2_9433.method15223(Thread.currentThread());
	    Class435 class435 = class110.aClass435_1340;
	    class435.method7040(class444);
	    Class435 class435_590_ = aClass182_Sub2_9433.aClass435_9467;
	    Class435 class435_591_ = aClass182_Sub2_9433.aClass435_9482;
	    if (!aBool9420)
		method15092();
	    boolean bool = class435.method6955();
	    float[] fs = class110.aFloatArray1326;
	    class435.method6956(0.0F, (float) aShort9423, 0.0F, fs);
	    float f = fs[0];
	    float f_592_ = fs[1];
	    float f_593_ = fs[2];
	    class435.method6956(0.0F, (float) aShort9381, 0.0F, fs);
	    float f_594_ = fs[0];
	    float f_595_ = fs[1];
	    float f_596_ = fs[2];
	    for (int i_597_ = 0; i_597_ < 6; i_597_++) {
		float[] fs_598_
		    = aClass182_Sub2_9433.aFloatArrayArray9484[i_597_];
		float f_599_ = (fs_598_[0] * f + fs_598_[1] * f_592_
				+ fs_598_[2] * f_593_ + fs_598_[3]
				+ (float) aShort9421);
		float f_600_ = (fs_598_[0] * f_594_ + fs_598_[1] * f_595_
				+ fs_598_[2] * f_596_ + fs_598_[3]
				+ (float) aShort9421);
		if (f_599_ < 0.0F && f_600_ < 0.0F)
		    return;
	    }
	    float f_601_;
	    float f_602_;
	    if (bool) {
		f_601_ = class435_590_.aFloatArray4830[14];
		f_602_ = class435_590_.aFloatArray4830[6];
	    } else {
		f_601_ = ((class435.aFloatArray4830[12]
			   * class435_590_.aFloatArray4830[2])
			  + (class435.aFloatArray4830[13]
			     * class435_590_.aFloatArray4830[6])
			  + (class435.aFloatArray4830[14]
			     * class435_590_.aFloatArray4830[10])
			  + class435_590_.aFloatArray4830[14]);
		f_602_ = ((class435.aFloatArray4830[4]
			   * class435_590_.aFloatArray4830[2])
			  + (class435.aFloatArray4830[5]
			     * class435_590_.aFloatArray4830[6])
			  + (class435.aFloatArray4830[6]
			     * class435_590_.aFloatArray4830[10]));
	    }
	    float f_603_ = f_601_ + (float) aShort9423 * f_602_;
	    float f_604_ = f_601_ + (float) aShort9381 * f_602_;
	    float f_605_ = (f_603_ > f_604_ ? f_603_ + (float) aShort9421
			    : f_604_ + (float) aShort9421);
	    float f_606_ = (class435_591_.aFloatArray4830[10] * f_605_
			    + class435_591_.aFloatArray4830[14]);
	    if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
		synchronized (this) {
		    while (aBool9361) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		    aBool9361 = true;
		}
	    }
	    method15065(class110);
	    Class435 class435_607_ = aClass110_9362.aClass435_1341;
	    class435_607_.method6947(class435);
	    class435_607_.method6950(aClass182_Sub2_9433.aClass435_9483);
	    if ((i & 0x2) != 0)
		aClass128_9360.method2249(true);
	    else
		aClass128_9360.method2249(false);
	    boolean bool_608_ = false;
	    aClass110_9362.aFloat1333 = aClass128_9360.aFloat1489;
	    aClass110_9362.aFloat1355 = aClass128_9360.aFloat1491;
	    aClass110_9362.aFloat1357 = aClass128_9360.aFloat1493;
	    aClass110_9362.aFloat1346 = 1.0F / aClass128_9360.aFloat1493;
	    aClass110_9362.aFloat1324 = aClass128_9360.aFloat1503;
	    aClass110_9362.aFloat1356 = aClass128_9360.aFloat1490;
	    aClass110_9362.aFloat1342 = aClass128_9360.aFloat1492;
	    aClass110_9362.anInt1360 = aClass128_9360.anInt1494 * -489821735;
	    for (int i_609_ = 0; i_609_ < anInt9394; i_609_++) {
		int i_610_ = anIntArray9424[i_609_];
		int i_611_ = anIntArray9379[i_609_];
		int i_612_ = anIntArray9395[i_609_];
		float f_613_
		    = (class435_607_.aFloatArray4830[0] * (float) i_610_
		       + class435_607_.aFloatArray4830[4] * (float) i_611_
		       + class435_607_.aFloatArray4830[8] * (float) i_612_
		       + class435_607_.aFloatArray4830[12]);
		float f_614_
		    = (class435_607_.aFloatArray4830[1] * (float) i_610_
		       + class435_607_.aFloatArray4830[5] * (float) i_611_
		       + class435_607_.aFloatArray4830[9] * (float) i_612_
		       + class435_607_.aFloatArray4830[13]);
		float f_615_
		    = (class435_607_.aFloatArray4830[2] * (float) i_610_
		       + class435_607_.aFloatArray4830[6] * (float) i_611_
		       + class435_607_.aFloatArray4830[10] * (float) i_612_
		       + class435_607_.aFloatArray4830[14]);
		float f_616_
		    = (class435_607_.aFloatArray4830[3] * (float) i_610_
		       + class435_607_.aFloatArray4830[7] * (float) i_611_
		       + class435_607_.aFloatArray4830[11] * (float) i_612_
		       + class435_607_.aFloatArray4830[15]);
		aFloatArray9437[i_609_]
		    = (aClass110_9362.aFloat1342
		       + aClass110_9362.aFloat1357 * f_615_ / f_616_);
		aFloatArray9438[i_609_] = f_616_;
		if (f_615_ >= -f_616_) {
		    aFloatArray9435[i_609_]
			= (float) (int) (aClass110_9362.aFloat1324
					 + (aClass110_9362.aFloat1333 * f_613_
					    / f_616_));
		    aFloatArray9400[i_609_]
			= (float) (int) (aClass110_9362.aFloat1356
					 + (aClass110_9362.aFloat1355 * f_614_
					    / f_616_));
		} else {
		    aFloatArray9435[i_609_] = -5000.0F;
		    bool_608_ = true;
		}
		if (aClass110_9362.aBool1332)
		    anIntArray9434[i_609_]
			= (int) (class435.aFloatArray4830[13]
				 + ((class435.aFloatArray4830[1]
				     * (float) i_610_)
				    + (class435.aFloatArray4830[5]
				       * (float) i_611_)
				    + (class435.aFloatArray4830[9]
				       * (float) i_612_)));
	    }
	    if (aClass103Array9417 != null) {
		for (int i_617_ = 0; i_617_ < anInt9416; i_617_++) {
		    Class103 class103 = aClass103Array9417[i_617_];
		    Class107 class107 = aClass107Array9441[i_617_];
		    short i_618_
			= aShortArray9382[class103.anInt1273 * -954563709];
		    short i_619_
			= aShortArray9387[class103.anInt1273 * -954563709];
		    short i_620_
			= aShortArray9388[class103.anInt1273 * -954563709];
		    int i_621_
			= ((anIntArray9424[i_618_] + anIntArray9424[i_619_]
			    + anIntArray9424[i_620_])
			   / 3);
		    int i_622_
			= ((anIntArray9379[i_618_] + anIntArray9379[i_619_]
			    + anIntArray9379[i_620_])
			   / 3);
		    int i_623_
			= ((anIntArray9395[i_618_] + anIntArray9395[i_619_]
			    + anIntArray9395[i_620_])
			   / 3);
		    float f_624_
			= (class435_607_.aFloatArray4830[0] * (float) i_621_
			   + class435_607_.aFloatArray4830[4] * (float) i_622_
			   + class435_607_.aFloatArray4830[8] * (float) i_623_
			   + class435_607_.aFloatArray4830[12]);
		    float f_625_
			= (class435_607_.aFloatArray4830[1] * (float) i_621_
			   + class435_607_.aFloatArray4830[5] * (float) i_622_
			   + class435_607_.aFloatArray4830[9] * (float) i_623_
			   + class435_607_.aFloatArray4830[13]);
		    float f_626_
			= (class435_607_.aFloatArray4830[2] * (float) i_621_
			   + class435_607_.aFloatArray4830[6] * (float) i_622_
			   + class435_607_.aFloatArray4830[10] * (float) i_623_
			   + class435_607_.aFloatArray4830[14]);
		    float f_627_
			= (class435_607_.aFloatArray4830[3] * (float) i_621_
			   + class435_607_.aFloatArray4830[7] * (float) i_622_
			   + class435_607_.aFloatArray4830[11] * (float) i_623_
			   + class435_607_.aFloatArray4830[15]);
		    f_626_
			+= ((class435_591_.aFloatArray4830[2]
			     * (float) (class107.anInt1297 * -377664695))
			    + (class435_591_.aFloatArray4830[6]
			       * (float) (class107.anInt1298 * -678217773)));
		    f_627_
			+= ((class435_591_.aFloatArray4830[3]
			     * (float) (class107.anInt1297 * -377664695))
			    + (class435_591_.aFloatArray4830[7]
			       * (float) (class107.anInt1298 * -678217773)));
		    if (f_626_ > -f_627_) {
			f_624_
			    += ((class435_591_.aFloatArray4830[0]
				 * (float) (class107.anInt1297 * -377664695))
				+ (class435_591_.aFloatArray4830[4]
				   * (float) (class107.anInt1298
					      * -678217773)));
			f_625_
			    += ((class435_591_.aFloatArray4830[1]
				 * (float) (class107.anInt1297 * -377664695))
				+ (class435_591_.aFloatArray4830[5]
				   * (float) (class107.anInt1298
					      * -678217773)));
			float f_628_ = (aClass182_Sub2_9433.aFloat9495
					+ (aClass182_Sub2_9433.aFloat9489
					   * f_624_ / f_627_));
			float f_629_ = (aClass182_Sub2_9433.aFloat9492
					+ (aClass182_Sub2_9433.aFloat9491
					   * f_625_ / f_627_));
			float f_630_ = (class107.aFloat1295
					* (float) class103.aShort1270);
			float f_631_ = (class107.aFloat1296
					* (float) class103.aShort1272);
			float f_632_
			    = (f_624_
			       + class435_591_.aFloatArray4830[0] * f_630_
			       + class435_591_.aFloatArray4830[4] * f_631_);
			float f_633_
			    = (f_625_
			       + class435_591_.aFloatArray4830[1] * f_630_
			       + class435_591_.aFloatArray4830[5] * f_631_);
			float f_634_
			    = (f_627_
			       + class435_591_.aFloatArray4830[3] * f_630_
			       + class435_591_.aFloatArray4830[7] * f_631_);
			float f_635_ = (aClass182_Sub2_9433.aFloat9495
					+ (aClass182_Sub2_9433.aFloat9489
					   * f_632_ / f_634_));
			float f_636_ = (aClass182_Sub2_9433.aFloat9492
					+ (aClass182_Sub2_9433.aFloat9491
					   * f_633_ / f_634_));
			class107.anInt1302 = (int) f_628_ * -1693914853;
			class107.anInt1300 = (int) f_629_ * 1245008861;
			class107.aFloat1301
			    = (aClass182_Sub2_9433.aFloat9498
			       + (aClass182_Sub2_9433.aFloat9480
				  * (f_626_
				     - (class435_591_.aFloatArray4830[10]
					* (float) (class103.anInt1271
						   * -2108543735)))
				  / f_627_));
			class107.anInt1294
			    = (int) (f_635_ < f_628_ ? f_628_ - f_635_
				     : f_635_ - f_628_) * 1035312701;
			class107.anInt1303
			    = (int) (f_636_ < f_629_ ? f_629_ - f_636_
				     : f_636_ - f_629_) * -1026484093;
		    } else {
			Class107 class107_637_ = class107;
			class107.anInt1303 = 0;
			class107_637_.anInt1294 = 0;
		    }
		}
	    }
	    if (class211 != null) {
		boolean bool_638_ = false;
		boolean bool_639_ = true;
		int i_640_ = aShort9368 + aShort9426 >> 1;
		int i_641_ = aShort9431 + aShort9432 >> 1;
		int i_642_ = i_640_;
		short i_643_ = aShort9423;
		int i_644_ = i_641_;
		float f_645_
		    = (class435_607_.aFloatArray4830[0] * (float) i_642_
		       + class435_607_.aFloatArray4830[4] * (float) i_643_
		       + class435_607_.aFloatArray4830[8] * (float) i_644_
		       + class435_607_.aFloatArray4830[12]);
		float f_646_
		    = (class435_607_.aFloatArray4830[1] * (float) i_642_
		       + class435_607_.aFloatArray4830[5] * (float) i_643_
		       + class435_607_.aFloatArray4830[9] * (float) i_644_
		       + class435_607_.aFloatArray4830[13]);
		float f_647_
		    = (class435_607_.aFloatArray4830[2] * (float) i_642_
		       + class435_607_.aFloatArray4830[6] * (float) i_643_
		       + class435_607_.aFloatArray4830[10] * (float) i_644_
		       + class435_607_.aFloatArray4830[14]);
		float f_648_
		    = (class435_607_.aFloatArray4830[3] * (float) i_642_
		       + class435_607_.aFloatArray4830[7] * (float) i_643_
		       + class435_607_.aFloatArray4830[11] * (float) i_644_
		       + class435_607_.aFloatArray4830[15]);
		if (f_647_ >= -f_648_) {
		    class211.anInt2264
			= (int) (aClass182_Sub2_9433.aFloat9495
				 + (aClass182_Sub2_9433.aFloat9489 * f_645_
				    / f_648_));
		    class211.anInt2266
			= (int) (aClass182_Sub2_9433.aFloat9492
				 + (aClass182_Sub2_9433.aFloat9491 * f_646_
				    / f_648_));
		} else
		    bool_638_ = true;
		i_642_ = i_640_;
		i_643_ = aShort9381;
		i_644_ = i_641_;
		float f_649_
		    = (class435_607_.aFloatArray4830[0] * (float) i_642_
		       + class435_607_.aFloatArray4830[4] * (float) i_643_
		       + class435_607_.aFloatArray4830[8] * (float) i_644_
		       + class435_607_.aFloatArray4830[12]);
		float f_650_
		    = (class435_607_.aFloatArray4830[1] * (float) i_642_
		       + class435_607_.aFloatArray4830[5] * (float) i_643_
		       + class435_607_.aFloatArray4830[9] * (float) i_644_
		       + class435_607_.aFloatArray4830[13]);
		float f_651_
		    = (class435_607_.aFloatArray4830[2] * (float) i_642_
		       + class435_607_.aFloatArray4830[6] * (float) i_643_
		       + class435_607_.aFloatArray4830[10] * (float) i_644_
		       + class435_607_.aFloatArray4830[14]);
		float f_652_
		    = (class435_607_.aFloatArray4830[3] * (float) i_642_
		       + class435_607_.aFloatArray4830[7] * (float) i_643_
		       + class435_607_.aFloatArray4830[11] * (float) i_644_
		       + class435_607_.aFloatArray4830[15]);
		if (f_651_ >= -f_652_) {
		    class211.anInt2263
			= (int) (aClass182_Sub2_9433.aFloat9495
				 + (aClass182_Sub2_9433.aFloat9489 * f_649_
				    / f_652_));
		    class211.anInt2267
			= (int) (aClass182_Sub2_9433.aFloat9492
				 + (aClass182_Sub2_9433.aFloat9491 * f_650_
				    / f_652_));
		} else
		    bool_638_ = true;
		if (bool_638_) {
		    if (f_647_ < -f_648_ && f_651_ < -f_652_)
			bool_639_ = false;
		    else if (f_647_ < -f_648_) {
			float f_653_
			    = (f_647_ + f_648_) / (f_651_ + f_652_) - 1.0F;
			float f_654_ = f_645_ + f_653_ * (f_649_ - f_645_);
			float f_655_ = f_646_ + f_653_ * (f_650_ - f_646_);
			float f_656_ = f_648_ + f_653_ * (f_652_ - f_648_);
			class211.anInt2264
			    = (int) (aClass182_Sub2_9433.aFloat9495
				     + (aClass182_Sub2_9433.aFloat9489 * f_654_
					/ f_656_));
			class211.anInt2266
			    = (int) (aClass182_Sub2_9433.aFloat9492
				     + (aClass182_Sub2_9433.aFloat9491 * f_655_
					/ f_656_));
		    } else if (f_651_ < -f_652_) {
			float f_657_
			    = (f_651_ + f_652_) / (f_647_ + f_648_) - 1.0F;
			float f_658_ = f_649_ + f_657_ * (f_645_ - f_649_);
			float f_659_ = f_650_ + f_657_ * (f_646_ - f_650_);
			float f_660_ = f_652_ + f_657_ * (f_648_ - f_652_);
			class211.anInt2263
			    = (int) (aClass182_Sub2_9433.aFloat9495
				     + (aClass182_Sub2_9433.aFloat9489 * f_658_
					/ f_660_));
			class211.anInt2267
			    = (int) (aClass182_Sub2_9433.aFloat9492
				     + (aClass182_Sub2_9433.aFloat9491 * f_659_
					/ f_660_));
		    }
		}
		if (bool_639_) {
		    if (f_647_ / f_648_ > f_651_ / f_652_) {
			float f_661_ = (f_645_
					+ (class435_591_.aFloatArray4830[0]
					   * (float) aShort9421)
					+ class435_591_.aFloatArray4830[12]);
			float f_662_ = (f_648_
					+ (class435_591_.aFloatArray4830[3]
					   * (float) aShort9421)
					+ class435_591_.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub2_9433.aFloat9495
				     - (float) class211.anInt2264
				     + (aClass182_Sub2_9433.aFloat9489 * f_661_
					/ f_662_));
		    } else {
			float f_663_ = (f_649_
					+ (class435_591_.aFloatArray4830[0]
					   * (float) aShort9421)
					+ class435_591_.aFloatArray4830[12]);
			float f_664_ = (f_652_
					+ (class435_591_.aFloatArray4830[3]
					   * (float) aShort9421)
					+ class435_591_.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub2_9433.aFloat9495
				     - (float) class211.anInt2263
				     + (aClass182_Sub2_9433.aFloat9489 * f_663_
					/ f_664_));
		    }
		    class211.aBool2265 = true;
		}
	    }
	    method15068(true);
	    aClass128_9360.aBool1482 = (i & 0x1) == 0;
	    aClass128_9360.aBool1483 = false;
	    try {
		method15150(aClass182_Sub2_9433.anIntArray9466 != null,
			    aClass182_Sub2_9433.aFloatArray9469 != null,
			    (i & 0x4) != 0, bool_608_,
			    ((aClass110_9362.aBool1369
			      && f_606_ > aClass110_9362.aFloat1328)
			     || aClass110_9362.aBool1332));
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (aClass103Array9417 != null) {
		for (int i_665_ = 0; i_665_ < anInt9375; i_665_++)
		    anIntArray9444[i_665_] = -1;
	    }
	    aClass128_9360 = null;
	    if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
		synchronized (this) {
		    aBool9361 = false;
		    this.notifyAll();
		}
	    }
	}
    }
    
    final boolean method15086(int i) {
	if (aByteArray9406 == null)
	    return false;
	if (aByteArray9406[i] == 0)
	    return false;
	return true;
    }
    
    public void method2930(int i) {
	if ((anInt9373 & 0x5) != 5)
	    throw new IllegalStateException();
	if (i == 4096)
	    method15116();
	else if (i == 8192)
	    method15077();
	else if (i == 12288)
	    method15147();
	else {
	    int i_666_ = Class436.anIntArray4831[i];
	    int i_667_ = Class436.anIntArray4838[i];
	    synchronized (this) {
		for (int i_668_ = 0; i_668_ < anInt9394; i_668_++) {
		    int i_669_ = ((anIntArray9395[i_668_] * i_666_
				   + anIntArray9424[i_668_] * i_667_)
				  >> 14);
		    anIntArray9395[i_668_]
			= (anIntArray9395[i_668_] * i_667_
			   - anIntArray9424[i_668_] * i_666_) >> 14;
		    anIntArray9424[i_668_] = i_669_;
		}
		method15084();
	    }
	}
    }
    
    final void method15087(boolean bool, boolean bool_670_, boolean bool_671_,
			   int i) {
	short i_672_ = aShortArray9382[i];
	short i_673_ = aShortArray9387[i];
	short i_674_ = aShortArray9388[i];
	boolean bool_675_ = false;
	if (aShortArray9402 != null && aShortArray9402[i] != -1)
	    bool_675_ = (aClass182_Sub2_9433.aClass180_1944.method3116
			 (aShortArray9402[i] & 0xffff, -1431554601).aBool1801);
	if (!bool_675_) {
	    if (aByteArray9406 == null)
		aClass128_9360.anInt1486 = 0;
	    else
		aClass128_9360.anInt1486 = aByteArray9406[i] & 0xff;
	    if (anIntArray9393[i] == -1)
		aClass128_9360.method2256
		    (bool, bool_670_, bool_671_, aFloatArray9400[i_672_],
		     aFloatArray9400[i_673_], aFloatArray9400[i_674_],
		     aFloatArray9435[i_672_], aFloatArray9435[i_673_],
		     aFloatArray9435[i_674_], aFloatArray9437[i_672_],
		     aFloatArray9437[i_673_], aFloatArray9437[i_674_],
		     Class381.anIntArray3929[anIntArray9391[i] & 0xffff]);
	    else
		aClass128_9360.method2266
		    (bool, bool_670_, bool_671_, aFloatArray9400[i_672_],
		     aFloatArray9400[i_673_], aFloatArray9400[i_674_],
		     aFloatArray9435[i_672_], aFloatArray9435[i_673_],
		     aFloatArray9435[i_674_], aFloatArray9437[i_672_],
		     aFloatArray9437[i_673_], aFloatArray9437[i_674_],
		     (float) (anIntArray9391[i] & 0xffff),
		     (float) (anIntArray9392[i] & 0xffff),
		     (float) (anIntArray9393[i] & 0xffff));
	} else {
	    int i_676_ = -16777216;
	    if (aByteArray9406 != null)
		i_676_ = 255 - (aByteArray9406[i] & 0xff) << 24;
	    if (anIntArray9393[i] == -1) {
		int i_677_ = i_676_ | anIntArray9391[i] & 0xffffff;
		aClass128_9360.method2248
		    (bool, bool_670_, bool_671_, aFloatArray9400[i_672_],
		     aFloatArray9400[i_673_], aFloatArray9400[i_674_],
		     aFloatArray9435[i_672_], aFloatArray9435[i_673_],
		     aFloatArray9435[i_674_], aFloatArray9437[i_672_],
		     aFloatArray9437[i_673_], aFloatArray9437[i_674_],
		     aFloatArray9438[i_672_], aFloatArray9438[i_673_],
		     aFloatArray9438[i_674_], aFloatArrayArray9401[i][0],
		     aFloatArrayArray9401[i][1], aFloatArrayArray9401[i][2],
		     aFloatArrayArray9390[i][0], aFloatArrayArray9390[i][1],
		     aFloatArrayArray9390[i][2], i_677_, i_677_, i_677_,
		     aClass110_9362.anInt1330 * 296717011, 0.0F, 0.0F, 0.0F,
		     aShortArray9402[i] & 0xffff);
	    } else
		aClass128_9360.method2248
		    (bool, bool_670_, bool_671_, aFloatArray9400[i_672_],
		     aFloatArray9400[i_673_], aFloatArray9400[i_674_],
		     aFloatArray9435[i_672_], aFloatArray9435[i_673_],
		     aFloatArray9435[i_674_], aFloatArray9437[i_672_],
		     aFloatArray9437[i_673_], aFloatArray9437[i_674_],
		     aFloatArray9438[i_672_], aFloatArray9438[i_673_],
		     aFloatArray9438[i_674_], aFloatArrayArray9401[i][0],
		     aFloatArrayArray9401[i][1], aFloatArrayArray9401[i][2],
		     aFloatArrayArray9390[i][0], aFloatArrayArray9390[i][1],
		     aFloatArrayArray9390[i][2],
		     i_676_ | anIntArray9391[i] & 0xffffff,
		     i_676_ | anIntArray9392[i] & 0xffffff,
		     i_676_ | anIntArray9393[i] & 0xffffff,
		     aClass110_9362.anInt1330 * 296717011, 0.0F, 0.0F, 0.0F,
		     aShortArray9402[i] & 0xffff);
	}
    }
    
    void method2950(int i, int i_678_, int i_679_, int i_680_) {
	if (i == 0) {
	    int i_681_ = 0;
	    anInt9425 = 0;
	    anInt9411 = 0;
	    anInt9412 = 0;
	    for (int i_682_ = 0; i_682_ < anInt9394; i_682_++) {
		anInt9425 += anIntArray9424[i_682_];
		anInt9411 += anIntArray9379[i_682_];
		anInt9412 += anIntArray9395[i_682_];
		i_681_++;
	    }
	    if (i_681_ > 0) {
		anInt9425 = anInt9425 / i_681_ + i_678_;
		anInt9411 = anInt9411 / i_681_ + i_679_;
		anInt9412 = anInt9412 / i_681_ + i_680_;
	    } else {
		anInt9425 = i_678_;
		anInt9411 = i_679_;
		anInt9412 = i_680_;
	    }
	} else if (i == 1) {
	    for (int i_683_ = 0; i_683_ < anInt9394; i_683_++) {
		anIntArray9424[i_683_] += i_678_;
		anIntArray9379[i_683_] += i_679_;
		anIntArray9395[i_683_] += i_680_;
	    }
	} else if (i == 2) {
	    for (int i_684_ = 0; i_684_ < anInt9394; i_684_++) {
		anIntArray9424[i_684_] -= anInt9425;
		anIntArray9379[i_684_] -= anInt9411;
		anIntArray9395[i_684_] -= anInt9412;
		if (i_680_ != 0) {
		    int i_685_ = Class436.anIntArray4831[i_680_];
		    int i_686_ = Class436.anIntArray4838[i_680_];
		    int i_687_ = ((anIntArray9379[i_684_] * i_685_
				   + anIntArray9424[i_684_] * i_686_ + 16383)
				  >> 14);
		    anIntArray9379[i_684_]
			= (anIntArray9379[i_684_] * i_686_
			   - anIntArray9424[i_684_] * i_685_ + 16383) >> 14;
		    anIntArray9424[i_684_] = i_687_;
		}
		if (i_678_ != 0) {
		    int i_688_ = Class436.anIntArray4831[i_678_];
		    int i_689_ = Class436.anIntArray4838[i_678_];
		    int i_690_ = ((anIntArray9379[i_684_] * i_689_
				   - anIntArray9395[i_684_] * i_688_ + 16383)
				  >> 14);
		    anIntArray9395[i_684_]
			= (anIntArray9379[i_684_] * i_688_
			   + anIntArray9395[i_684_] * i_689_ + 16383) >> 14;
		    anIntArray9379[i_684_] = i_690_;
		}
		if (i_679_ != 0) {
		    int i_691_ = Class436.anIntArray4831[i_679_];
		    int i_692_ = Class436.anIntArray4838[i_679_];
		    int i_693_ = ((anIntArray9395[i_684_] * i_691_
				   + anIntArray9424[i_684_] * i_692_ + 16383)
				  >> 14);
		    anIntArray9395[i_684_]
			= (anIntArray9395[i_684_] * i_692_
			   - anIntArray9424[i_684_] * i_691_ + 16383) >> 14;
		    anIntArray9424[i_684_] = i_693_;
		}
		anIntArray9424[i_684_] += anInt9425;
		anIntArray9379[i_684_] += anInt9411;
		anIntArray9395[i_684_] += anInt9412;
	    }
	} else if (i == 3) {
	    for (int i_694_ = 0; i_694_ < anInt9394; i_694_++) {
		anIntArray9424[i_694_] -= anInt9425;
		anIntArray9379[i_694_] -= anInt9411;
		anIntArray9395[i_694_] -= anInt9412;
		anIntArray9424[i_694_] = anIntArray9424[i_694_] * i_678_ / 128;
		anIntArray9379[i_694_] = anIntArray9379[i_694_] * i_679_ / 128;
		anIntArray9395[i_694_] = anIntArray9395[i_694_] * i_680_ / 128;
		anIntArray9424[i_694_] += anInt9425;
		anIntArray9379[i_694_] += anInt9411;
		anIntArray9395[i_694_] += anInt9412;
	    }
	} else if (i == 5) {
	    for (int i_695_ = 0; i_695_ < anInt9375; i_695_++) {
		int i_696_ = (aByteArray9406[i_695_] & 0xff) + i_678_ * 8;
		if (i_696_ < 0)
		    i_696_ = 0;
		else if (i_696_ > 255)
		    i_696_ = 255;
		aByteArray9406[i_695_] = (byte) i_696_;
	    }
	    if (aClass103Array9417 != null) {
		for (int i_697_ = 0; i_697_ < anInt9416; i_697_++) {
		    Class103 class103 = aClass103Array9417[i_697_];
		    Class107 class107 = aClass107Array9441[i_697_];
		    class107.anInt1304
			= (class107.anInt1304 * -1093122285 & 0xffffff
			   | 255 - ((aByteArray9406
				     [class103.anInt1273 * -954563709])
				    & 0xff) << 24) * 540580635;
		}
	    }
	} else if (i == 7) {
	    for (int i_698_ = 0; i_698_ < anInt9375; i_698_++) {
		int i_699_ = aShortArray9403[i_698_] & 0xffff;
		int i_700_ = i_699_ >> 10 & 0x3f;
		int i_701_ = i_699_ >> 7 & 0x7;
		int i_702_ = i_699_ & 0x7f;
		i_700_ = i_700_ + i_678_ & 0x3f;
		i_701_ += i_679_;
		if (i_701_ < 0)
		    i_701_ = 0;
		else if (i_701_ > 7)
		    i_701_ = 7;
		i_702_ += i_680_;
		if (i_702_ < 0)
		    i_702_ = 0;
		else if (i_702_ > 127)
		    i_702_ = 127;
		aShortArray9403[i_698_]
		    = (short) (i_700_ << 10 | i_701_ << 7 | i_702_);
	    }
	    aBool9408 = true;
	    if (aClass103Array9417 != null) {
		for (int i_703_ = 0; i_703_ < anInt9416; i_703_++) {
		    Class103 class103 = aClass103Array9417[i_703_];
		    Class107 class107 = aClass107Array9441[i_703_];
		    class107.anInt1304
			= (class107.anInt1304 * -1093122285 & ~0xffffff
			   | ((Class381.anIntArray3929
			       [Class504.method8313(((aShortArray9403
						      [(class103.anInt1273
							* -954563709)])
						     & 0xffff),
						    2058655384) & 0xffff])
			      & 0xffffff)) * 540580635;
		}
	    }
	} else if (i == 8) {
	    for (int i_704_ = 0; i_704_ < anInt9416; i_704_++) {
		Class107 class107 = aClass107Array9441[i_704_];
		class107.anInt1297 += i_678_ * -1780640007;
		class107.anInt1298 += i_679_ * -1349044133;
	    }
	} else if (i == 10) {
	    for (int i_705_ = 0; i_705_ < anInt9416; i_705_++) {
		Class107 class107 = aClass107Array9441[i_705_];
		class107.aFloat1295
		    = class107.aFloat1295 * (float) i_678_ / 128.0F;
		class107.aFloat1296
		    = class107.aFloat1296 * (float) i_679_ / 128.0F;
	    }
	} else if (i == 9) {
	    for (int i_706_ = 0; i_706_ < anInt9416; i_706_++) {
		Class107 class107 = aClass107Array9441[i_706_];
		class107.anInt1299 = (class107.anInt1299 * -1829505101 + i_678_
				      & 0x3fff) * -412512389;
	    }
	}
    }
    
    final void method15088(boolean bool, boolean bool_707_, boolean bool_708_,
			   int i, boolean bool_709_, boolean bool_710_) {
	if (anIntArray9393[i] != -2) {
	    short i_711_ = aShortArray9382[i];
	    short i_712_ = aShortArray9387[i];
	    short i_713_ = aShortArray9388[i];
	    float f = aFloatArray9435[i_711_];
	    float f_714_ = aFloatArray9435[i_712_];
	    float f_715_ = aFloatArray9435[i_713_];
	    if (!bool_709_
		|| f != -5000.0F && f_714_ != -5000.0F && f_715_ != -5000.0F) {
		float f_716_ = aFloatArray9400[i_711_];
		float f_717_ = aFloatArray9400[i_712_];
		float f_718_ = aFloatArray9400[i_713_];
		if (anIntArray9444[i] != -1
		    || ((f - f_714_) * (f_718_ - f_717_)
			- (f_716_ - f_717_) * (f_715_ - f_714_)) > 0.0F) {
		    if (f < 0.0F || f_714_ < 0.0F || f_715_ < 0.0F
			|| f > (float) (aClass110_9362.anInt1360 * -57670039)
			|| f_714_ > (float) (aClass110_9362.anInt1360
					     * -57670039)
			|| f_715_ > (float) (aClass110_9362.anInt1360
					     * -57670039))
			aClass128_9360.aBool1485 = true;
		    else
			aClass128_9360.aBool1485 = false;
		    if (bool_710_) {
			int i_719_ = anIntArray9444[i];
			if (i_719_ == -1
			    || !aClass103Array9417[i_719_].aBool1276)
			    method15090(bool, bool_707_, bool_708_, i);
		    } else {
			int i_720_ = anIntArray9444[i];
			if (i_720_ != -1) {
			    Class103 class103 = aClass103Array9417[i_720_];
			    Class107 class107 = aClass107Array9441[i_720_];
			    if (!class103.aBool1276)
				method15137(bool, bool_707_, bool_708_, i);
			    aClass182_Sub2_9433.method15202
				(bool, bool_707_, bool_708_,
				 class107.anInt1302 * 1736067347,
				 class107.anInt1300 * 1933483125,
				 class107.aFloat1301,
				 class107.anInt1294 * 1227843861,
				 class107.anInt1303 * -1024330197,
				 class103.aShort1277,
				 class107.anInt1304 * -1093122285,
				 class103.aByte1275, class103.aByte1274);
			} else
			    method15137(bool, bool_707_, bool_708_, i);
		    }
		}
	    }
	}
    }
    
    final boolean method15089(int i) {
	if (anIntArray9444 == null)
	    return false;
	if (anIntArray9444[i] == -1)
	    return false;
	return true;
    }
    
    final void method15090(boolean bool, boolean bool_721_, boolean bool_722_,
			   int i) {
	boolean bool_723_ = false;
	if (aShortArray9402 != null && aShortArray9402[i] != -1)
	    bool_723_ = (aClass182_Sub2_9433.aClass180_1944.method3116
			 (aShortArray9402[i] & 0xffff, -1431554601).aBool1801);
	if (!aClass110_9362.aBool1332) {
	    short i_724_ = aShortArray9382[i];
	    short i_725_ = aShortArray9387[i];
	    short i_726_ = aShortArray9388[i];
	    Class435 class435 = aClass182_Sub2_9433.aClass435_9482;
	    float f = class435.aFloatArray4830[10];
	    float f_727_ = class435.aFloatArray4830[14];
	    float f_728_ = class435.aFloatArray4830[11];
	    float f_729_ = class435.aFloatArray4830[15];
	    float f_730_ = f_727_ * f_728_ - f * f_729_;
	    float f_731_
		= ((aFloatArray9437[i_724_] - aClass110_9362.aFloat1342)
		   * aClass110_9362.aFloat1346);
	    float f_732_
		= ((aFloatArray9437[i_725_] - aClass110_9362.aFloat1342)
		   * aClass110_9362.aFloat1346);
	    float f_733_
		= ((aFloatArray9437[i_726_] - aClass110_9362.aFloat1342)
		   * aClass110_9362.aFloat1346);
	    float f_734_ = f_731_ * f_730_ / (f_731_ * f_728_ - f);
	    float f_735_ = f_732_ * f_730_ / (f_732_ * f_728_ - f);
	    float f_736_ = f_733_ * f_730_ / (f_733_ * f_728_ - f);
	    float f_737_ = ((f_734_ - aClass110_9362.aFloat1328)
			    / aClass110_9362.aFloat1329);
	    if (f_737_ > 1.0F)
		f_737_ = 1.0F;
	    else if (f_737_ < 0.0F)
		f_737_ = 0.0F;
	    float f_738_ = ((f_735_ - aClass110_9362.aFloat1328)
			    / aClass110_9362.aFloat1329);
	    if (f_738_ > 1.0F)
		f_738_ = 1.0F;
	    else if (f_738_ < 0.0F)
		f_738_ = 0.0F;
	    float f_739_ = ((f_736_ - aClass110_9362.aFloat1328)
			    / aClass110_9362.aFloat1329);
	    if (f_739_ > 1.0F)
		f_739_ = 1.0F;
	    else if (f_739_ < 0.0F)
		f_739_ = 0.0F;
	    float f_740_ = f_737_ + f_738_ + f_739_;
	    if (!(f_740_ >= 3.0F)) {
		if (f_740_ <= 0.0F)
		    method15137(bool, bool_721_, bool_722_, i);
		else {
		    if (aByteArray9406 == null)
			aClass128_9360.anInt1486 = 0;
		    else
			aClass128_9360.anInt1486 = aByteArray9406[i] & 0xff;
		    if (!bool_723_) {
			if (anIntArray9393[i] == -1)
			    aClass128_9360.method2243
				(bool, bool_721_, bool_722_,
				 aFloatArray9400[i_724_],
				 aFloatArray9400[i_725_],
				 aFloatArray9400[i_726_],
				 aFloatArray9435[i_724_],
				 aFloatArray9435[i_725_],
				 aFloatArray9435[i_726_],
				 aFloatArray9437[i_724_],
				 aFloatArray9437[i_725_],
				 aFloatArray9437[i_726_],
				 Class637.method10513((Class381.anIntArray3929
						       [(anIntArray9391[i]
							 & 0xffff)]),
						      (aClass110_9362.anInt1330
						       * 296717011),
						      f_737_ * 255.0F,
						      -1502803777),
				 Class637.method10513((Class381.anIntArray3929
						       [(anIntArray9391[i]
							 & 0xffff)]),
						      (aClass110_9362.anInt1330
						       * 296717011),
						      f_738_ * 255.0F,
						      23398351),
				 Class637.method10513((Class381.anIntArray3929
						       [(anIntArray9391[i]
							 & 0xffff)]),
						      (aClass110_9362.anInt1330
						       * 296717011),
						      f_739_ * 255.0F,
						      -120650312));
			else
			    aClass128_9360.method2243
				(bool, bool_721_, bool_722_,
				 aFloatArray9400[i_724_],
				 aFloatArray9400[i_725_],
				 aFloatArray9400[i_726_],
				 aFloatArray9435[i_724_],
				 aFloatArray9435[i_725_],
				 aFloatArray9435[i_726_],
				 aFloatArray9437[i_724_],
				 aFloatArray9437[i_725_],
				 aFloatArray9437[i_726_],
				 Class637.method10513((Class381.anIntArray3929
						       [(anIntArray9391[i]
							 & 0xffff)]),
						      (aClass110_9362.anInt1330
						       * 296717011),
						      f_737_ * 255.0F,
						      687727335),
				 Class637.method10513((Class381.anIntArray3929
						       [(anIntArray9392[i]
							 & 0xffff)]),
						      (aClass110_9362.anInt1330
						       * 296717011),
						      f_738_ * 255.0F,
						      388739016),
				 Class637.method10513((Class381.anIntArray3929
						       [(anIntArray9393[i]
							 & 0xffff)]),
						      (aClass110_9362.anInt1330
						       * 296717011),
						      f_739_ * 255.0F,
						      -982839760));
		    } else {
			int i_741_ = -16777216;
			if (aByteArray9406 != null)
			    i_741_ = 255 - (aByteArray9406[i] & 0xff) << 24;
			if (anIntArray9393[i] == -1) {
			    int i_742_ = i_741_ | anIntArray9391[i] & 0xffffff;
			    aClass128_9360.method2248
				(bool, bool_721_, bool_722_,
				 aFloatArray9400[i_724_],
				 aFloatArray9400[i_725_],
				 aFloatArray9400[i_726_],
				 aFloatArray9435[i_724_],
				 aFloatArray9435[i_725_],
				 aFloatArray9435[i_726_],
				 aFloatArray9437[i_724_],
				 aFloatArray9437[i_725_],
				 aFloatArray9437[i_726_],
				 aFloatArray9438[i_724_],
				 aFloatArray9438[i_725_],
				 aFloatArray9438[i_726_],
				 aFloatArrayArray9401[i][0],
				 aFloatArrayArray9401[i][1],
				 aFloatArrayArray9401[i][2],
				 aFloatArrayArray9390[i][0],
				 aFloatArrayArray9390[i][1],
				 aFloatArrayArray9390[i][2], i_742_, i_742_,
				 i_742_, aClass110_9362.anInt1330 * 296717011,
				 f_737_ * 255.0F, f_738_ * 255.0F,
				 f_739_ * 255.0F, aShortArray9402[i] & 0xffff);
			} else
			    aClass128_9360.method2248
				(bool, bool_721_, bool_722_,
				 aFloatArray9400[i_724_],
				 aFloatArray9400[i_725_],
				 aFloatArray9400[i_726_],
				 aFloatArray9435[i_724_],
				 aFloatArray9435[i_725_],
				 aFloatArray9435[i_726_],
				 aFloatArray9437[i_724_],
				 aFloatArray9437[i_725_],
				 aFloatArray9437[i_726_],
				 aFloatArray9438[i_724_],
				 aFloatArray9438[i_725_],
				 aFloatArray9438[i_726_],
				 aFloatArrayArray9401[i][0],
				 aFloatArrayArray9401[i][1],
				 aFloatArrayArray9401[i][2],
				 aFloatArrayArray9390[i][0],
				 aFloatArrayArray9390[i][1],
				 aFloatArrayArray9390[i][2],
				 i_741_ | anIntArray9391[i] & 0xffffff,
				 i_741_ | anIntArray9392[i] & 0xffffff,
				 i_741_ | anIntArray9393[i] & 0xffffff,
				 aClass110_9362.anInt1330 * 296717011,
				 f_737_ * 255.0F, f_738_ * 255.0F,
				 f_739_ * 255.0F, aShortArray9402[i] & 0xffff);
		    }
		}
	    }
	} else {
	    short i_743_ = aShortArray9382[i];
	    short i_744_ = aShortArray9387[i];
	    short i_745_ = aShortArray9388[i];
	    float f = 0.0F;
	    float f_746_ = 0.0F;
	    float f_747_ = 0.0F;
	    if (anIntArray9434[i_743_] > aClass110_9362.anInt1361 * -923183383)
		f = 1.0F;
	    else if (anIntArray9434[i_743_]
		     > aClass110_9362.anInt1362 * 1985680889)
		f = ((float) (aClass110_9362.anInt1362 * 1985680889
			      - anIntArray9434[i_743_])
		     * 1.0F
		     / (float) (aClass110_9362.anInt1362 * 1985680889
				- aClass110_9362.anInt1361 * -923183383));
	    if (anIntArray9434[i_744_] > aClass110_9362.anInt1361 * -923183383)
		f_746_ = 1.0F;
	    else if (anIntArray9434[i_744_]
		     > aClass110_9362.anInt1362 * 1985680889)
		f_746_ = ((float) (aClass110_9362.anInt1362 * 1985680889
				   - anIntArray9434[i_744_])
			  * 1.0F
			  / (float) (aClass110_9362.anInt1362 * 1985680889
				     - aClass110_9362.anInt1361 * -923183383));
	    if (anIntArray9434[i_745_] > aClass110_9362.anInt1361 * -923183383)
		f_747_ = 1.0F;
	    else if (anIntArray9434[i_745_]
		     > aClass110_9362.anInt1362 * 1985680889)
		f_747_ = ((float) (aClass110_9362.anInt1362 * 1985680889
				   - anIntArray9434[i_745_])
			  * 1.0F
			  / (float) (aClass110_9362.anInt1362 * 1985680889
				     - aClass110_9362.anInt1361 * -923183383));
	    if (aByteArray9406 == null)
		aClass128_9360.anInt1486 = 0;
	    else
		aClass128_9360.anInt1486 = aByteArray9406[i] & 0xff;
	    if (!bool_723_) {
		if (anIntArray9393[i] == -1)
		    aClass128_9360.method2243
			(bool, bool_721_, bool_722_, aFloatArray9400[i_743_],
			 aFloatArray9400[i_744_], aFloatArray9400[i_745_],
			 aFloatArray9435[i_743_], aFloatArray9435[i_744_],
			 aFloatArray9435[i_745_], aFloatArray9437[i_743_],
			 aFloatArray9437[i_744_], aFloatArray9437[i_745_],
			 Class637.method10513((Class381.anIntArray3929
					       [anIntArray9391[i] & 0xffff]),
					      (aClass110_9362.anInt1330
					       * 296717011),
					      f * 255.0F, 166099122),
			 Class637.method10513((Class381.anIntArray3929
					       [anIntArray9391[i] & 0xffff]),
					      (aClass110_9362.anInt1330
					       * 296717011),
					      f_746_ * 255.0F, -1852982153),
			 Class637.method10513((Class381.anIntArray3929
					       [anIntArray9391[i] & 0xffff]),
					      (aClass110_9362.anInt1330
					       * 296717011),
					      f_747_ * 255.0F, 1114592055));
		else
		    aClass128_9360.method2243
			(bool, bool_721_, bool_722_, aFloatArray9400[i_743_],
			 aFloatArray9400[i_744_], aFloatArray9400[i_745_],
			 aFloatArray9435[i_743_], aFloatArray9435[i_744_],
			 aFloatArray9435[i_745_], aFloatArray9437[i_743_],
			 aFloatArray9437[i_744_], aFloatArray9437[i_745_],
			 Class637.method10513((Class381.anIntArray3929
					       [anIntArray9391[i] & 0xffff]),
					      (aClass110_9362.anInt1330
					       * 296717011),
					      f * 255.0F, -271445002),
			 Class637.method10513((Class381.anIntArray3929
					       [anIntArray9392[i] & 0xffff]),
					      (aClass110_9362.anInt1330
					       * 296717011),
					      f_746_ * 255.0F, 1930830378),
			 Class637.method10513((Class381.anIntArray3929
					       [anIntArray9393[i] & 0xffff]),
					      (aClass110_9362.anInt1330
					       * 296717011),
					      f_747_ * 255.0F, -1740743714));
	    } else {
		int i_748_ = -16777216;
		if (aByteArray9406 != null)
		    i_748_ = 255 - (aByteArray9406[i] & 0xff) << 24;
		if (anIntArray9393[i] == -1) {
		    int i_749_ = i_748_ | anIntArray9391[i] & 0xffffff;
		    aClass128_9360.method2248
			(bool, bool_721_, bool_722_, aFloatArray9400[i_743_],
			 aFloatArray9400[i_744_], aFloatArray9400[i_745_],
			 aFloatArray9435[i_743_], aFloatArray9435[i_744_],
			 aFloatArray9435[i_745_], aFloatArray9437[i_743_],
			 aFloatArray9437[i_744_], aFloatArray9437[i_745_],
			 aFloatArray9438[i_743_], aFloatArray9438[i_744_],
			 aFloatArray9438[i_745_], aFloatArrayArray9401[i][0],
			 aFloatArrayArray9401[i][1],
			 aFloatArrayArray9401[i][2],
			 aFloatArrayArray9390[i][0],
			 aFloatArrayArray9390[i][1],
			 aFloatArrayArray9390[i][2], i_749_, i_749_, i_749_,
			 aClass110_9362.anInt1330 * 296717011, f * 255.0F,
			 f_746_ * 255.0F, f_747_ * 255.0F,
			 aShortArray9402[i] & 0xffff);
		} else
		    aClass128_9360.method2248
			(bool, bool_721_, bool_722_, aFloatArray9400[i_743_],
			 aFloatArray9400[i_744_], aFloatArray9400[i_745_],
			 aFloatArray9435[i_743_], aFloatArray9435[i_744_],
			 aFloatArray9435[i_745_], aFloatArray9437[i_743_],
			 aFloatArray9437[i_744_], aFloatArray9437[i_745_],
			 aFloatArray9438[i_743_], aFloatArray9438[i_744_],
			 aFloatArray9438[i_745_], aFloatArrayArray9401[i][0],
			 aFloatArrayArray9401[i][1],
			 aFloatArrayArray9401[i][2],
			 aFloatArrayArray9390[i][0],
			 aFloatArrayArray9390[i][1],
			 aFloatArrayArray9390[i][2],
			 i_748_ | anIntArray9391[i] & 0xffffff,
			 i_748_ | anIntArray9392[i] & 0xffffff,
			 i_748_ | anIntArray9393[i] & 0xffffff,
			 aClass110_9362.anInt1330 * 296717011, f * 255.0F,
			 f_746_ * 255.0F, f_747_ * 255.0F,
			 aShortArray9402[i] & 0xffff);
	    }
	}
    }
    
    public void method2990(int i) {
	if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		if ((anInt9373 & 0x10000) == 65536 && (i & 0x10000) == 0)
		    method15068(true);
		anInt9373 = i;
	    }
	} else {
	    if ((anInt9373 & 0x10000) == 65536 && (i & 0x10000) == 0)
		method15068(true);
	    anInt9373 = i;
	}
    }
    
    public int method3018() {
	if (!aBool9429)
	    method3003();
	return aShort9430;
    }
    
    void method15091() {
	aClass100Array9422 = new Class100[anInt9377];
	for (int i = 0; i < anInt9377; i++)
	    aClass100Array9422[i] = new Class100();
	for (int i = 0; i < anInt9375; i++) {
	    short i_750_ = aShortArray9382[i];
	    short i_751_ = aShortArray9387[i];
	    short i_752_ = aShortArray9388[i];
	    int i_753_ = anIntArray9424[i_751_] - anIntArray9424[i_750_];
	    int i_754_ = anIntArray9379[i_751_] - anIntArray9379[i_750_];
	    int i_755_ = anIntArray9395[i_751_] - anIntArray9395[i_750_];
	    int i_756_ = anIntArray9424[i_752_] - anIntArray9424[i_750_];
	    int i_757_ = anIntArray9379[i_752_] - anIntArray9379[i_750_];
	    int i_758_ = anIntArray9395[i_752_] - anIntArray9395[i_750_];
	    int i_759_ = i_754_ * i_758_ - i_757_ * i_755_;
	    int i_760_ = i_755_ * i_756_ - i_758_ * i_753_;
	    int i_761_;
	    for (i_761_ = i_753_ * i_757_ - i_756_ * i_754_;
		 (i_759_ > 8192 || i_760_ > 8192 || i_761_ > 8192
		  || i_759_ < -8192 || i_760_ < -8192 || i_761_ < -8192);
		 i_761_ >>= 1) {
		i_759_ >>= 1;
		i_760_ >>= 1;
	    }
	    int i_762_
		= (int) Math.sqrt((double) (i_759_ * i_759_ + i_760_ * i_760_
					    + i_761_ * i_761_));
	    if (i_762_ <= 0)
		i_762_ = 1;
	    i_759_ = i_759_ * 256 / i_762_;
	    i_760_ = i_760_ * 256 / i_762_;
	    i_761_ = i_761_ * 256 / i_762_;
	    byte i_763_;
	    if (aByteArray9399 == null)
		i_763_ = (byte) 0;
	    else
		i_763_ = aByteArray9399[i];
	    if (i_763_ == 0) {
		Class100 class100 = aClass100Array9422[i_750_];
		class100.anInt1215 += i_759_;
		class100.anInt1217 += i_760_;
		class100.anInt1216 += i_761_;
		class100.anInt1214++;
		class100 = aClass100Array9422[i_751_];
		class100.anInt1215 += i_759_;
		class100.anInt1217 += i_760_;
		class100.anInt1216 += i_761_;
		class100.anInt1214++;
		class100 = aClass100Array9422[i_752_];
		class100.anInt1215 += i_759_;
		class100.anInt1217 += i_760_;
		class100.anInt1216 += i_761_;
		class100.anInt1214++;
	    } else if (i_763_ == 1) {
		if (aClass115Array9398 == null)
		    aClass115Array9398 = new Class115[anInt9375];
		Class115 class115 = aClass115Array9398[i] = new Class115();
		class115.anInt1407 = i_759_;
		class115.anInt1408 = i_760_;
		class115.anInt1406 = i_761_;
	    }
	}
    }
    
    public Class525_Sub16_Sub17 method2955
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	return null;
    }
    
    void method15092() {
	if (!aBool9420) {
	    int i = 0;
	    int i_764_ = 0;
	    int i_765_ = 32767;
	    int i_766_ = 32767;
	    int i_767_ = 32767;
	    int i_768_ = -32768;
	    int i_769_ = -32768;
	    int i_770_ = -32768;
	    for (int i_771_ = 0; i_771_ < anInt9377; i_771_++) {
		int i_772_ = anIntArray9424[i_771_];
		int i_773_ = anIntArray9379[i_771_];
		int i_774_ = anIntArray9395[i_771_];
		if (i_772_ < i_765_)
		    i_765_ = i_772_;
		if (i_772_ > i_768_)
		    i_768_ = i_772_;
		if (i_773_ < i_766_)
		    i_766_ = i_773_;
		if (i_773_ > i_769_)
		    i_769_ = i_773_;
		if (i_774_ < i_767_)
		    i_767_ = i_774_;
		if (i_774_ > i_770_)
		    i_770_ = i_774_;
		int i_775_ = i_772_ * i_772_ + i_774_ * i_774_;
		if (i_775_ > i)
		    i = i_775_;
		i_775_ += i_773_ * i_773_;
		if (i_775_ > i_764_)
		    i_764_ = i_775_;
	    }
	    aShort9368 = (short) i_765_;
	    aShort9426 = (short) i_768_;
	    aShort9423 = (short) i_766_;
	    aShort9381 = (short) i_769_;
	    aShort9431 = (short) i_767_;
	    aShort9432 = (short) i_770_;
	    aShort9421 = (short) (int) (Math.sqrt((double) i) + 0.99);
	    aShort9413 = (short) (int) (Math.sqrt((double) i_764_) + 0.99);
	    aBool9420 = true;
	}
    }
    
    public void method3003() {
	if (!aBool9429) {
	    if (!aBool9420)
		method15092();
	    aShort9430 = aShort9423;
	    aBool9429 = true;
	}
    }
    
    public int method2956() {
	if (!aBool9420)
	    method15092();
	return aShort9421;
    }
    
    public int method3076() {
	if (!aBool9420)
	    method15092();
	return aShort9423;
    }
    
    final void method15093(boolean bool, boolean bool_776_, boolean bool_777_,
			   int i) {
	short i_778_ = aShortArray9382[i];
	short i_779_ = aShortArray9387[i];
	short i_780_ = aShortArray9388[i];
	boolean bool_781_ = false;
	if (aShortArray9402 != null && aShortArray9402[i] != -1)
	    bool_781_ = (aClass182_Sub2_9433.aClass180_1944.method3116
			 (aShortArray9402[i] & 0xffff, -1431554601).aBool1801);
	if (!bool_781_) {
	    if (aByteArray9406 == null)
		aClass128_9360.anInt1486 = 0;
	    else
		aClass128_9360.anInt1486 = aByteArray9406[i] & 0xff;
	    if (anIntArray9393[i] == -1)
		aClass128_9360.method2256
		    (bool, bool_776_, bool_777_, aFloatArray9400[i_778_],
		     aFloatArray9400[i_779_], aFloatArray9400[i_780_],
		     aFloatArray9435[i_778_], aFloatArray9435[i_779_],
		     aFloatArray9435[i_780_], aFloatArray9437[i_778_],
		     aFloatArray9437[i_779_], aFloatArray9437[i_780_],
		     Class381.anIntArray3929[anIntArray9391[i] & 0xffff]);
	    else
		aClass128_9360.method2266
		    (bool, bool_776_, bool_777_, aFloatArray9400[i_778_],
		     aFloatArray9400[i_779_], aFloatArray9400[i_780_],
		     aFloatArray9435[i_778_], aFloatArray9435[i_779_],
		     aFloatArray9435[i_780_], aFloatArray9437[i_778_],
		     aFloatArray9437[i_779_], aFloatArray9437[i_780_],
		     (float) (anIntArray9391[i] & 0xffff),
		     (float) (anIntArray9392[i] & 0xffff),
		     (float) (anIntArray9393[i] & 0xffff));
	} else {
	    int i_782_ = -16777216;
	    if (aByteArray9406 != null)
		i_782_ = 255 - (aByteArray9406[i] & 0xff) << 24;
	    if (anIntArray9393[i] == -1) {
		int i_783_ = i_782_ | anIntArray9391[i] & 0xffffff;
		aClass128_9360.method2248
		    (bool, bool_776_, bool_777_, aFloatArray9400[i_778_],
		     aFloatArray9400[i_779_], aFloatArray9400[i_780_],
		     aFloatArray9435[i_778_], aFloatArray9435[i_779_],
		     aFloatArray9435[i_780_], aFloatArray9437[i_778_],
		     aFloatArray9437[i_779_], aFloatArray9437[i_780_],
		     aFloatArray9438[i_778_], aFloatArray9438[i_779_],
		     aFloatArray9438[i_780_], aFloatArrayArray9401[i][0],
		     aFloatArrayArray9401[i][1], aFloatArrayArray9401[i][2],
		     aFloatArrayArray9390[i][0], aFloatArrayArray9390[i][1],
		     aFloatArrayArray9390[i][2], i_783_, i_783_, i_783_,
		     aClass110_9362.anInt1330 * 296717011, 0.0F, 0.0F, 0.0F,
		     aShortArray9402[i] & 0xffff);
	    } else
		aClass128_9360.method2248
		    (bool, bool_776_, bool_777_, aFloatArray9400[i_778_],
		     aFloatArray9400[i_779_], aFloatArray9400[i_780_],
		     aFloatArray9435[i_778_], aFloatArray9435[i_779_],
		     aFloatArray9435[i_780_], aFloatArray9437[i_778_],
		     aFloatArray9437[i_779_], aFloatArray9437[i_780_],
		     aFloatArray9438[i_778_], aFloatArray9438[i_779_],
		     aFloatArray9438[i_780_], aFloatArrayArray9401[i][0],
		     aFloatArrayArray9401[i][1], aFloatArrayArray9401[i][2],
		     aFloatArrayArray9390[i][0], aFloatArrayArray9390[i][1],
		     aFloatArrayArray9390[i][2],
		     i_782_ | anIntArray9391[i] & 0xffffff,
		     i_782_ | anIntArray9392[i] & 0xffffff,
		     i_782_ | anIntArray9393[i] & 0xffffff,
		     aClass110_9362.anInt1330 * 296717011, 0.0F, 0.0F, 0.0F,
		     aShortArray9402[i] & 0xffff);
	}
    }
    
    public boolean method3066() {
	if (aShortArray9402 == null)
	    return true;
	for (int i = 0; i < aShortArray9402.length; i++) {
	    if (aShortArray9402[i] != -1
		&& !aClass182_Sub2_9433.method15221(aShortArray9402[i]))
		return false;
	}
	return true;
    }
    
    public int method2960() {
	if (!aBool9420)
	    method15092();
	return aShort9423;
    }
    
    public int method2961() {
	if (!aBool9420)
	    method15092();
	return aShort9381;
    }
    
    public int method2962() {
	if (!aBool9420)
	    method15092();
	return aShort9431;
    }
    
    public int method2989() {
	return anInt9374;
    }
    
    void method15094() {
	if (!aBool9420) {
	    int i = 0;
	    int i_784_ = 0;
	    int i_785_ = 32767;
	    int i_786_ = 32767;
	    int i_787_ = 32767;
	    int i_788_ = -32768;
	    int i_789_ = -32768;
	    int i_790_ = -32768;
	    for (int i_791_ = 0; i_791_ < anInt9377; i_791_++) {
		int i_792_ = anIntArray9424[i_791_];
		int i_793_ = anIntArray9379[i_791_];
		int i_794_ = anIntArray9395[i_791_];
		if (i_792_ < i_785_)
		    i_785_ = i_792_;
		if (i_792_ > i_788_)
		    i_788_ = i_792_;
		if (i_793_ < i_786_)
		    i_786_ = i_793_;
		if (i_793_ > i_789_)
		    i_789_ = i_793_;
		if (i_794_ < i_787_)
		    i_787_ = i_794_;
		if (i_794_ > i_790_)
		    i_790_ = i_794_;
		int i_795_ = i_792_ * i_792_ + i_794_ * i_794_;
		if (i_795_ > i)
		    i = i_795_;
		i_795_ += i_793_ * i_793_;
		if (i_795_ > i_784_)
		    i_784_ = i_795_;
	    }
	    aShort9368 = (short) i_785_;
	    aShort9426 = (short) i_788_;
	    aShort9423 = (short) i_786_;
	    aShort9381 = (short) i_789_;
	    aShort9431 = (short) i_787_;
	    aShort9432 = (short) i_790_;
	    aShort9421 = (short) (int) (Math.sqrt((double) i) + 0.99);
	    aShort9413 = (short) (int) (Math.sqrt((double) i_784_) + 0.99);
	    aBool9420 = true;
	}
    }
    
    public void method2966(int i) {
	if ((anInt9373 & 0x1000) != 4096)
	    throw new IllegalStateException();
	anInt9374 = i;
	anInt9364 = 0;
    }
    
    public void method2952(int i) {
	if ((anInt9373 & 0x2000) != 8192)
	    throw new IllegalStateException();
	anInt9383 = i;
	anInt9364 = 0;
    }
    
    Class179 method15095(Class179_Sub2 class179_sub2_796_,
			 Class179_Sub2 class179_sub2_797_, int i, boolean bool,
			 boolean bool_798_) {
	class179_sub2_796_.aBool9420 = aBool9420;
	if (aBool9420) {
	    class179_sub2_796_.aShort9426 = aShort9426;
	    class179_sub2_796_.aShort9381 = aShort9381;
	    class179_sub2_796_.aShort9432 = aShort9432;
	    class179_sub2_796_.aShort9368 = aShort9368;
	    class179_sub2_796_.aShort9423 = aShort9423;
	    class179_sub2_796_.aShort9431 = aShort9431;
	    class179_sub2_796_.aShort9421 = aShort9421;
	    class179_sub2_796_.aShort9413 = aShort9413;
	}
	if (aBool9429) {
	    class179_sub2_796_.aShort9430 = aShort9430;
	    class179_sub2_796_.aBool9429 = true;
	} else
	    class179_sub2_796_.aBool9429 = false;
	class179_sub2_796_.anInt9374 = anInt9374;
	class179_sub2_796_.anInt9383 = anInt9383;
	class179_sub2_796_.anInt9394 = anInt9394;
	class179_sub2_796_.anInt9377 = anInt9377;
	class179_sub2_796_.anInt9375 = anInt9375;
	class179_sub2_796_.anInt9416 = anInt9416;
	class179_sub2_796_.anInt9385 = anInt9385;
	if ((i & 0x100) != 0)
	    class179_sub2_796_.aBool9369 = true;
	else
	    class179_sub2_796_.aBool9369 = aBool9369;
	class179_sub2_796_.aBool9380 = aBool9380;
	boolean bool_799_ = (i & 0x7) == 7 | (i & 0x20) != 0;
	boolean bool_800_ = bool_799_ || (i & 0x1) != 0;
	boolean bool_801_ = bool_799_ || (i & 0x2) != 0;
	boolean bool_802_ = bool_799_ || (i & 0x4) != 0 || (i & 0x10) != 0;
	if (bool_800_ || bool_801_ || bool_802_) {
	    if (bool_800_) {
		if (class179_sub2_797_.anIntArray9424 == null
		    || class179_sub2_797_.anIntArray9424.length < anInt9394)
		    class179_sub2_796_.anIntArray9424
			= class179_sub2_797_.anIntArray9424
			= new int[anInt9394];
		else
		    class179_sub2_796_.anIntArray9424
			= class179_sub2_797_.anIntArray9424;
		for (int i_803_ = 0; i_803_ < anInt9394; i_803_++)
		    class179_sub2_796_.anIntArray9424[i_803_]
			= anIntArray9424[i_803_];
	    } else
		class179_sub2_796_.anIntArray9424 = anIntArray9424;
	    if (bool_801_) {
		if (class179_sub2_797_.anIntArray9379 == null
		    || class179_sub2_797_.anIntArray9379.length < anInt9394)
		    class179_sub2_796_.anIntArray9379
			= class179_sub2_797_.anIntArray9379
			= new int[anInt9394];
		else
		    class179_sub2_796_.anIntArray9379
			= class179_sub2_797_.anIntArray9379;
		for (int i_804_ = 0; i_804_ < anInt9394; i_804_++)
		    class179_sub2_796_.anIntArray9379[i_804_]
			= anIntArray9379[i_804_];
	    } else
		class179_sub2_796_.anIntArray9379 = anIntArray9379;
	    if (bool_802_) {
		if (class179_sub2_797_.anIntArray9395 == null
		    || class179_sub2_797_.anIntArray9395.length < anInt9394)
		    class179_sub2_796_.anIntArray9395
			= class179_sub2_797_.anIntArray9395
			= new int[anInt9394];
		else
		    class179_sub2_796_.anIntArray9395
			= class179_sub2_797_.anIntArray9395;
		for (int i_805_ = 0; i_805_ < anInt9394; i_805_++)
		    class179_sub2_796_.anIntArray9395[i_805_]
			= anIntArray9395[i_805_];
	    } else
		class179_sub2_796_.anIntArray9395 = anIntArray9395;
	} else {
	    class179_sub2_796_.anIntArray9424 = anIntArray9424;
	    class179_sub2_796_.anIntArray9379 = anIntArray9379;
	    class179_sub2_796_.anIntArray9395 = anIntArray9395;
	}
	if ((i & 0x84080) != 0) {
	    if (class179_sub2_797_.aShortArray9403 == null
		|| class179_sub2_797_.aShortArray9403.length < anInt9375) {
		int i_806_ = anInt9375;
		class179_sub2_796_.aShortArray9403
		    = class179_sub2_797_.aShortArray9403 = new short[i_806_];
	    } else
		class179_sub2_796_.aShortArray9403
		    = class179_sub2_797_.aShortArray9403;
	    for (int i_807_ = 0; i_807_ < anInt9375; i_807_++)
		class179_sub2_796_.aShortArray9403[i_807_]
		    = aShortArray9403[i_807_];
	} else
	    class179_sub2_796_.aShortArray9403 = aShortArray9403;
	if ((i & 0x97018) != 0) {
	    class179_sub2_796_.anInt9364 = 0;
	    Class179_Sub2 class179_sub2_808_ = class179_sub2_796_;
	    Class179_Sub2 class179_sub2_809_ = class179_sub2_796_;
	    class179_sub2_796_.anIntArray9393 = null;
	    class179_sub2_809_.anIntArray9392 = null;
	    class179_sub2_808_.anIntArray9391 = null;
	} else if ((i & 0x80) != 0) {
	    if (bool_798_)
		method15068(false);
	    if (anIntArray9391 != null) {
		if (class179_sub2_797_.anIntArray9391 == null
		    || class179_sub2_797_.anIntArray9391.length < anInt9375) {
		    int i_810_ = anInt9375;
		    class179_sub2_796_.anIntArray9391
			= class179_sub2_797_.anIntArray9391 = new int[i_810_];
		    class179_sub2_796_.anIntArray9392
			= class179_sub2_797_.anIntArray9392 = new int[i_810_];
		    class179_sub2_796_.anIntArray9393
			= class179_sub2_797_.anIntArray9393 = new int[i_810_];
		} else {
		    class179_sub2_796_.anIntArray9391
			= class179_sub2_797_.anIntArray9391;
		    class179_sub2_796_.anIntArray9392
			= class179_sub2_797_.anIntArray9392;
		    class179_sub2_796_.anIntArray9393
			= class179_sub2_797_.anIntArray9393;
		}
		for (int i_811_ = 0; i_811_ < anInt9375; i_811_++) {
		    class179_sub2_796_.anIntArray9391[i_811_]
			= anIntArray9391[i_811_];
		    class179_sub2_796_.anIntArray9392[i_811_]
			= anIntArray9392[i_811_];
		    class179_sub2_796_.anIntArray9393[i_811_]
			= anIntArray9393[i_811_];
		}
	    }
	    class179_sub2_796_.anInt9364 = anInt9364;
	} else {
	    if (bool_798_)
		method15068(false);
	    class179_sub2_796_.anIntArray9391 = anIntArray9391;
	    class179_sub2_796_.anIntArray9392 = anIntArray9392;
	    class179_sub2_796_.anIntArray9393 = anIntArray9393;
	    class179_sub2_796_.anInt9364 = anInt9364;
	}
	if ((i & 0x100) != 0) {
	    if (class179_sub2_797_.aByteArray9406 == null
		|| class179_sub2_797_.aByteArray9406.length < anInt9375) {
		int i_812_ = anInt9375;
		class179_sub2_796_.aByteArray9406
		    = class179_sub2_797_.aByteArray9406 = new byte[i_812_];
	    } else
		class179_sub2_796_.aByteArray9406
		    = class179_sub2_797_.aByteArray9406;
	    if (aByteArray9406 != null) {
		for (int i_813_ = 0; i_813_ < anInt9375; i_813_++)
		    class179_sub2_796_.aByteArray9406[i_813_]
			= aByteArray9406[i_813_];
	    } else {
		for (int i_814_ = 0; i_814_ < anInt9375; i_814_++)
		    class179_sub2_796_.aByteArray9406[i_814_] = (byte) 0;
	    }
	} else
	    class179_sub2_796_.aByteArray9406 = aByteArray9406;
	if ((i & 0x8) != 0 || (i & 0x10) != 0) {
	    if (class179_sub2_797_.aClass100Array9422 == null
		|| class179_sub2_797_.aClass100Array9422.length < anInt9377) {
		int i_815_ = anInt9377;
		class179_sub2_796_.aClass100Array9422
		    = class179_sub2_797_.aClass100Array9422
		    = new Class100[i_815_];
	    } else
		class179_sub2_796_.aClass100Array9422
		    = class179_sub2_797_.aClass100Array9422;
	    if (aClass100Array9422 != null) {
		for (int i_816_ = 0; i_816_ < anInt9377; i_816_++)
		    class179_sub2_796_.aClass100Array9422[i_816_]
			= new Class100(aClass100Array9422[i_816_]);
	    } else
		class179_sub2_796_.aClass100Array9422 = null;
	    if (aClass115Array9398 != null) {
		if (class179_sub2_797_.aClass115Array9398 == null
		    || (class179_sub2_797_.aClass115Array9398.length
			< anInt9375)) {
		    int i_817_ = anInt9375;
		    class179_sub2_796_.aClass115Array9398
			= class179_sub2_797_.aClass115Array9398
			= new Class115[i_817_];
		} else
		    class179_sub2_796_.aClass115Array9398
			= class179_sub2_797_.aClass115Array9398;
		for (int i_818_ = 0; i_818_ < anInt9375; i_818_++)
		    class179_sub2_796_.aClass115Array9398[i_818_]
			= (aClass115Array9398[i_818_] != null
			   ? new Class115(aClass115Array9398[i_818_]) : null);
	    } else
		class179_sub2_796_.aClass115Array9398 = null;
	} else {
	    if (bool_798_)
		method15080();
	    class179_sub2_796_.aClass100Array9422 = aClass100Array9422;
	    class179_sub2_796_.aClass115Array9398 = aClass115Array9398;
	}
	if ((i & 0x8000) != 0) {
	    if (aShortArray9402 == null)
		class179_sub2_796_.aShortArray9402 = null;
	    else {
		if (class179_sub2_797_.aShortArray9402 == null
		    || class179_sub2_797_.aShortArray9402.length < anInt9375) {
		    int i_819_ = anInt9375;
		    class179_sub2_796_.aShortArray9402
			= class179_sub2_797_.aShortArray9402
			= new short[i_819_];
		} else
		    class179_sub2_796_.aShortArray9402
			= class179_sub2_797_.aShortArray9402;
		for (int i_820_ = 0; i_820_ < anInt9375; i_820_++)
		    class179_sub2_796_.aShortArray9402[i_820_]
			= aShortArray9402[i_820_];
	    }
	} else
	    class179_sub2_796_.aShortArray9402 = aShortArray9402;
	if ((i & 0x10000) != 0) {
	    if (aByteArray9399 == null)
		class179_sub2_796_.aByteArray9399 = null;
	    else {
		if (class179_sub2_797_.aByteArray9399 == null
		    || class179_sub2_797_.aByteArray9399.length < anInt9375) {
		    int i_821_ = bool ? anInt9375 + 100 : anInt9375;
		    class179_sub2_796_.aByteArray9399
			= class179_sub2_797_.aByteArray9399 = new byte[i_821_];
		} else
		    class179_sub2_796_.aByteArray9399
			= class179_sub2_797_.aByteArray9399;
		for (int i_822_ = 0; i_822_ < anInt9375; i_822_++)
		    class179_sub2_796_.aByteArray9399[i_822_]
			= aByteArray9399[i_822_];
	    }
	} else
	    class179_sub2_796_.aByteArray9399 = aByteArray9399;
	if ((i & 0xc580) != 0) {
	    if (class179_sub2_797_.aClass107Array9441 == null
		|| class179_sub2_797_.aClass107Array9441.length < anInt9416) {
		int i_823_ = anInt9416;
		class179_sub2_796_.aClass107Array9441
		    = class179_sub2_797_.aClass107Array9441
		    = new Class107[i_823_];
		for (int i_824_ = 0; i_824_ < anInt9416; i_824_++)
		    class179_sub2_796_.aClass107Array9441[i_824_]
			= aClass107Array9441[i_824_].method1918(-558885486);
	    } else {
		class179_sub2_796_.aClass107Array9441
		    = class179_sub2_797_.aClass107Array9441;
		for (int i_825_ = 0; i_825_ < anInt9416; i_825_++)
		    class179_sub2_796_.aClass107Array9441[i_825_]
			.method1919(aClass107Array9441[i_825_], -873529232);
	    }
	} else
	    class179_sub2_796_.aClass107Array9441 = aClass107Array9441;
	if (aFloatArrayArray9401 != null && (i & 0x10) != 0) {
	    if (class179_sub2_797_.aFloatArrayArray9401 == null
		|| (class179_sub2_797_.aFloatArrayArray9401.length
		    < anInt9375)) {
		int i_826_ = bool ? anInt9375 + 100 : anInt9375;
		class179_sub2_796_.aFloatArrayArray9401
		    = class179_sub2_797_.aFloatArrayArray9401
		    = new float[i_826_][3];
	    } else
		class179_sub2_796_.aFloatArrayArray9401
		    = class179_sub2_797_.aFloatArrayArray9401;
	    for (int i_827_ = 0; i_827_ < anInt9375; i_827_++) {
		if (aFloatArrayArray9401[i_827_] != null) {
		    class179_sub2_796_.aFloatArrayArray9401[i_827_][0]
			= aFloatArrayArray9401[i_827_][0];
		    class179_sub2_796_.aFloatArrayArray9401[i_827_][1]
			= aFloatArrayArray9401[i_827_][1];
		    class179_sub2_796_.aFloatArrayArray9401[i_827_][2]
			= aFloatArrayArray9401[i_827_][2];
		}
	    }
	    if (class179_sub2_797_.aFloatArrayArray9390 == null
		|| (class179_sub2_797_.aFloatArrayArray9390.length
		    < anInt9375)) {
		int i_828_ = bool ? anInt9375 + 100 : anInt9375;
		class179_sub2_796_.aFloatArrayArray9390
		    = class179_sub2_797_.aFloatArrayArray9390
		    = new float[i_828_][3];
	    } else
		class179_sub2_796_.aFloatArrayArray9390
		    = class179_sub2_797_.aFloatArrayArray9390;
	    for (int i_829_ = 0; i_829_ < anInt9375; i_829_++) {
		if (aFloatArrayArray9390[i_829_] != null) {
		    class179_sub2_796_.aFloatArrayArray9390[i_829_][0]
			= aFloatArrayArray9390[i_829_][0];
		    class179_sub2_796_.aFloatArrayArray9390[i_829_][1]
			= aFloatArrayArray9390[i_829_][1];
		    class179_sub2_796_.aFloatArrayArray9390[i_829_][2]
			= aFloatArrayArray9390[i_829_][2];
		}
	    }
	} else {
	    class179_sub2_796_.aFloatArrayArray9401 = aFloatArrayArray9401;
	    class179_sub2_796_.aFloatArrayArray9390 = aFloatArrayArray9390;
	}
	class179_sub2_796_.anIntArrayArray9397 = anIntArrayArray9397;
	class179_sub2_796_.anIntArrayArray9445 = anIntArrayArray9445;
	class179_sub2_796_.anIntArrayArray9419 = anIntArrayArray9419;
	class179_sub2_796_.aShortArray9378 = aShortArray9378;
	class179_sub2_796_.aShortArray9404 = aShortArray9404;
	class179_sub2_796_.aByteArray9376 = aByteArray9376;
	class179_sub2_796_.aShortArray9382 = aShortArray9382;
	class179_sub2_796_.aShortArray9387 = aShortArray9387;
	class179_sub2_796_.aShortArray9388 = aShortArray9388;
	class179_sub2_796_.aClass184Array9386 = aClass184Array9386;
	class179_sub2_796_.aClass154Array9415 = aClass154Array9415;
	class179_sub2_796_.aClass103Array9417 = aClass103Array9417;
	class179_sub2_796_.aShortArray9405 = aShortArray9405;
	class179_sub2_796_.anInt9373 = i;
	return class179_sub2_796_;
    }
    
    public int method2957() {
	if (!aBool9420)
	    method15092();
	return aShort9413;
    }
    
    public byte[] method2970() {
	return aByteArray9406;
    }
    
    public void method2932(int i) {
	if ((anInt9373 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_830_ = Class436.anIntArray4831[i];
	int i_831_ = Class436.anIntArray4838[i];
	synchronized (this) {
	    for (int i_832_ = 0; i_832_ < anInt9394; i_832_++) {
		int i_833_ = ((anIntArray9379[i_832_] * i_831_
			       - anIntArray9395[i_832_] * i_830_)
			      >> 14);
		anIntArray9395[i_832_]
		    = (anIntArray9379[i_832_] * i_830_
		       + anIntArray9395[i_832_] * i_831_) >> 14;
		anIntArray9379[i_832_] = i_833_;
	    }
	    method15084();
	}
    }
    
    public int method3082() {
	return anInt9383;
    }
    
    public void method2973(short i, short i_834_) {
	if (aShortArray9402 != null) {
	    if (!aBool9380 && i_834_ >= 0) {
		Class166 class166
		    = aClass182_Sub2_9433.aClass180_1944
			  .method3116(i_834_ & 0xffff, -1431554601);
		if (class166.aByte1805 != 0 || class166.aByte1806 != 0)
		    aBool9380 = true;
	    }
	    for (int i_835_ = 0; i_835_ < anInt9375; i_835_++) {
		if (aShortArray9402[i_835_] == i)
		    aShortArray9402[i_835_] = i_834_;
	    }
	}
    }
    
    public void method2974(int i, int i_836_, int i_837_, int i_838_) {
	if ((anInt9373 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_839_ = 0; i_839_ < anInt9375; i_839_++) {
	    int i_840_ = aShortArray9403[i_839_] & 0xffff;
	    int i_841_ = i_840_ >> 10 & 0x3f;
	    int i_842_ = i_840_ >> 7 & 0x7;
	    int i_843_ = i_840_ & 0x7f;
	    if (i != -1)
		i_841_ += (i - i_841_) * i_838_ >> 7;
	    if (i_836_ != -1)
		i_842_ += (i_836_ - i_842_) * i_838_ >> 7;
	    if (i_837_ != -1)
		i_843_ += (i_837_ - i_843_) * i_838_ >> 7;
	    aShortArray9403[i_839_]
		= (short) (i_841_ << 10 | i_842_ << 7 | i_843_);
	}
	if (aClass103Array9417 != null) {
	    for (int i_844_ = 0; i_844_ < anInt9416; i_844_++) {
		Class103 class103 = aClass103Array9417[i_844_];
		Class107 class107 = aClass107Array9441[i_844_];
		class107.anInt1304
		    = (class107.anInt1304 * -1093122285 & ~0xffffff
		       | ((Class381.anIntArray3929
			   [Class504.method8313((aShortArray9403
						 [(class103.anInt1273
						   * -954563709)]) & 0xffff,
						1602110966) & 0xffff])
			  & 0xffffff)) * 540580635;
	    }
	}
	if (anInt9364 == 2)
	    anInt9364 = 1;
    }
    
    public Class184[] method2979() {
	return aClass184Array9386;
    }
    
    public Class154[] method2980() {
	return aClass154Array9415;
    }
    
    public boolean method2924() {
	if (aShortArray9402 == null)
	    return true;
	for (int i = 0; i < aShortArray9402.length; i++) {
	    if (aShortArray9402[i] != -1
		&& !aClass182_Sub2_9433.method15221(aShortArray9402[i]))
		return false;
	}
	return true;
    }
    
    public boolean method3017() {
	return aBool9369;
    }
    
    public boolean method2977() {
	return aBool9380;
    }
    
    final boolean method15096(int i) {
	if (anIntArray9444 == null)
	    return false;
	if (anIntArray9444[i] == -1)
	    return false;
	return true;
    }
    
    void method15097(Thread thread) {
	Class110 class110 = aClass182_Sub2_9433.method15223(thread);
	if (class110 != aClass110_9363) {
	    aClass110_9363 = class110;
	    aClass179_Sub2Array9389 = aClass110_9363.aClass179_Sub2Array1358;
	    aClass179_Sub2Array9446 = aClass110_9363.aClass179_Sub2Array1354;
	}
    }
    
    void method15098(Thread thread) {
	Class110 class110 = aClass182_Sub2_9433.method15223(thread);
	if (class110 != aClass110_9363) {
	    aClass110_9363 = class110;
	    aClass179_Sub2Array9389 = aClass110_9363.aClass179_Sub2Array1358;
	    aClass179_Sub2Array9446 = aClass110_9363.aClass179_Sub2Array1354;
	}
    }
    
    public void method3019(Class179 class179, int i, int i_845_, int i_846_,
			   boolean bool) {
	Class179_Sub2 class179_sub2_847_ = (Class179_Sub2) class179;
	if ((anInt9373 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((class179_sub2_847_.anInt9373 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method15065(aClass182_Sub2_9433.method15223(Thread.currentThread()));
	method15092();
	method15080();
	class179_sub2_847_.method15092();
	class179_sub2_847_.method15080();
	anInt9407++;
	int i_848_ = 0;
	int[] is = class179_sub2_847_.anIntArray9424;
	int i_849_ = class179_sub2_847_.anInt9377;
	for (int i_850_ = 0; i_850_ < anInt9377; i_850_++) {
	    Class100 class100 = aClass100Array9422[i_850_];
	    if (class100.anInt1214 != 0) {
		int i_851_ = anIntArray9379[i_850_] - i_845_;
		if (i_851_ >= class179_sub2_847_.aShort9423
		    && i_851_ <= class179_sub2_847_.aShort9381) {
		    int i_852_ = anIntArray9424[i_850_] - i;
		    if (i_852_ >= class179_sub2_847_.aShort9368
			&& i_852_ <= class179_sub2_847_.aShort9426) {
			int i_853_ = anIntArray9395[i_850_] - i_846_;
			if (i_853_ >= class179_sub2_847_.aShort9431
			    && i_853_ <= class179_sub2_847_.aShort9432) {
			    for (int i_854_ = 0; i_854_ < i_849_; i_854_++) {
				Class100 class100_855_
				    = (class179_sub2_847_.aClass100Array9422
				       [i_854_]);
				if (i_852_ == is[i_854_]
				    && i_853_ == (class179_sub2_847_
						  .anIntArray9395[i_854_])
				    && i_851_ == (class179_sub2_847_
						  .anIntArray9379[i_854_])
				    && class100_855_.anInt1214 != 0) {
				    if (aClass100Array9371 == null)
					aClass100Array9371
					    = new Class100[anInt9377];
				    if (class179_sub2_847_.aClass100Array9371
					== null)
					class179_sub2_847_.aClass100Array9371
					    = new Class100[i_849_];
				    Class100 class100_856_
					= aClass100Array9371[i_850_];
				    if (class100_856_ == null)
					class100_856_
					    = aClass100Array9371[i_850_]
					    = new Class100(class100);
				    Class100 class100_857_
					= (class179_sub2_847_
					   .aClass100Array9371[i_854_]);
				    if (class100_857_ == null)
					class100_857_
					    = class179_sub2_847_
						  .aClass100Array9371[i_854_]
					    = new Class100(class100_855_);
				    class100_856_.anInt1215
					+= class100_855_.anInt1215;
				    class100_856_.anInt1217
					+= class100_855_.anInt1217;
				    class100_856_.anInt1216
					+= class100_855_.anInt1216;
				    class100_856_.anInt1214
					+= class100_855_.anInt1214;
				    class100_857_.anInt1215
					+= class100.anInt1215;
				    class100_857_.anInt1217
					+= class100.anInt1217;
				    class100_857_.anInt1216
					+= class100.anInt1216;
				    class100_857_.anInt1214
					+= class100.anInt1214;
				    i_848_++;
				    anIntArray9442[i_850_] = anInt9407;
				    anIntArray9443[i_854_] = anInt9407;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_848_ >= 3 && bool) {
	    for (int i_858_ = 0; i_858_ < anInt9375; i_858_++) {
		if (anIntArray9442[aShortArray9382[i_858_]] == anInt9407
		    && anIntArray9442[aShortArray9387[i_858_]] == anInt9407
		    && anIntArray9442[aShortArray9388[i_858_]] == anInt9407) {
		    if (aByteArray9399 == null)
			aByteArray9399 = new byte[anInt9375];
		    aByteArray9399[i_858_] = (byte) 2;
		}
	    }
	    for (int i_859_ = 0; i_859_ < class179_sub2_847_.anInt9375;
		 i_859_++) {
		if ((anIntArray9443[class179_sub2_847_.aShortArray9382[i_859_]]
		     == anInt9407)
		    && anIntArray9443[(class179_sub2_847_.aShortArray9387
				       [i_859_])] == anInt9407
		    && anIntArray9443[(class179_sub2_847_.aShortArray9388
				       [i_859_])] == anInt9407) {
		    if (class179_sub2_847_.aByteArray9399 == null)
			class179_sub2_847_.aByteArray9399
			    = new byte[class179_sub2_847_.anInt9375];
		    class179_sub2_847_.aByteArray9399[i_859_] = (byte) 2;
		}
	    }
	}
    }
    
    void method15099(Thread thread) {
	Class110 class110 = aClass182_Sub2_9433.method15223(thread);
	if (class110 != aClass110_9363) {
	    aClass110_9363 = class110;
	    aClass179_Sub2Array9389 = aClass110_9363.aClass179_Sub2Array1358;
	    aClass179_Sub2Array9446 = aClass110_9363.aClass179_Sub2Array1354;
	}
    }
    
    public int method3026() {
	return anInt9383;
    }
    
    void method15100() {
	aClass100Array9422 = new Class100[anInt9377];
	for (int i = 0; i < anInt9377; i++)
	    aClass100Array9422[i] = new Class100();
	for (int i = 0; i < anInt9375; i++) {
	    short i_860_ = aShortArray9382[i];
	    short i_861_ = aShortArray9387[i];
	    short i_862_ = aShortArray9388[i];
	    int i_863_ = anIntArray9424[i_861_] - anIntArray9424[i_860_];
	    int i_864_ = anIntArray9379[i_861_] - anIntArray9379[i_860_];
	    int i_865_ = anIntArray9395[i_861_] - anIntArray9395[i_860_];
	    int i_866_ = anIntArray9424[i_862_] - anIntArray9424[i_860_];
	    int i_867_ = anIntArray9379[i_862_] - anIntArray9379[i_860_];
	    int i_868_ = anIntArray9395[i_862_] - anIntArray9395[i_860_];
	    int i_869_ = i_864_ * i_868_ - i_867_ * i_865_;
	    int i_870_ = i_865_ * i_866_ - i_868_ * i_863_;
	    int i_871_;
	    for (i_871_ = i_863_ * i_867_ - i_866_ * i_864_;
		 (i_869_ > 8192 || i_870_ > 8192 || i_871_ > 8192
		  || i_869_ < -8192 || i_870_ < -8192 || i_871_ < -8192);
		 i_871_ >>= 1) {
		i_869_ >>= 1;
		i_870_ >>= 1;
	    }
	    int i_872_
		= (int) Math.sqrt((double) (i_869_ * i_869_ + i_870_ * i_870_
					    + i_871_ * i_871_));
	    if (i_872_ <= 0)
		i_872_ = 1;
	    i_869_ = i_869_ * 256 / i_872_;
	    i_870_ = i_870_ * 256 / i_872_;
	    i_871_ = i_871_ * 256 / i_872_;
	    byte i_873_;
	    if (aByteArray9399 == null)
		i_873_ = (byte) 0;
	    else
		i_873_ = aByteArray9399[i];
	    if (i_873_ == 0) {
		Class100 class100 = aClass100Array9422[i_860_];
		class100.anInt1215 += i_869_;
		class100.anInt1217 += i_870_;
		class100.anInt1216 += i_871_;
		class100.anInt1214++;
		class100 = aClass100Array9422[i_861_];
		class100.anInt1215 += i_869_;
		class100.anInt1217 += i_870_;
		class100.anInt1216 += i_871_;
		class100.anInt1214++;
		class100 = aClass100Array9422[i_862_];
		class100.anInt1215 += i_869_;
		class100.anInt1217 += i_870_;
		class100.anInt1216 += i_871_;
		class100.anInt1214++;
	    } else if (i_873_ == 1) {
		if (aClass115Array9398 == null)
		    aClass115Array9398 = new Class115[anInt9375];
		Class115 class115 = aClass115Array9398[i] = new Class115();
		class115.anInt1407 = i_869_;
		class115.anInt1408 = i_870_;
		class115.anInt1406 = i_871_;
	    }
	}
    }
    
    final void method15101(boolean bool, boolean bool_874_,
			   boolean bool_875_) {
	for (int i = 0; i < anInt9416; i++) {
	    Class103 class103 = aClass103Array9417[i];
	    if (class103.aBool1276) {
		Class107 class107 = aClass107Array9441[i];
		aClass182_Sub2_9433.method15202
		    (bool, bool_874_, bool_875_,
		     class107.anInt1302 * 1736067347,
		     class107.anInt1300 * 1933483125, class107.aFloat1301,
		     class107.anInt1294 * 1227843861,
		     class107.anInt1303 * -1024330197, class103.aShort1277,
		     class107.anInt1304 * -1093122285, class103.aByte1275,
		     class103.aByte1274);
	    }
	}
    }
    
    public void method3025() {
	if (!aBool9429) {
	    if (!aBool9420)
		method15092();
	    aShort9430 = aShort9423;
	    aBool9429 = true;
	}
    }
    
    void method15102(boolean bool) {
	if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		method15069(bool);
	    }
	} else
	    method15069(bool);
    }
    
    void method15103(boolean bool) {
	if (anInt9364 == 1)
	    method15073();
	else if (anInt9364 == 2) {
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	} else {
	    method15080();
	    int i = aClass182_Sub2_9433.anInt9474 * -1893445829;
	    int i_876_ = aClass182_Sub2_9433.anInt9475 * -1615993337;
	    int i_877_ = aClass182_Sub2_9433.anInt9468 * -1138625233;
	    int i_878_ = aClass182_Sub2_9433.anInt9479 * -722712849 >> 8;
	    int i_879_ = 0;
	    int i_880_ = 0;
	    if (anInt9383 != 0) {
		i_879_
		    = aClass182_Sub2_9433.anInt9463 * -1104473344 / anInt9383;
		i_880_
		    = aClass182_Sub2_9433.anInt9478 * -1613137664 / anInt9383;
	    }
	    if (anIntArray9391 == null) {
		anIntArray9391 = new int[anInt9375];
		anIntArray9392 = new int[anInt9375];
		anIntArray9393 = new int[anInt9375];
	    }
	    for (int i_881_ = 0; i_881_ < anInt9375; i_881_++) {
		byte i_882_;
		if (aByteArray9399 == null)
		    i_882_ = (byte) 0;
		else
		    i_882_ = aByteArray9399[i_881_];
		byte i_883_;
		if (aByteArray9406 == null)
		    i_883_ = (byte) 0;
		else
		    i_883_ = aByteArray9406[i_881_];
		short i_884_;
		if (aShortArray9402 == null)
		    i_884_ = (short) -1;
		else
		    i_884_ = aShortArray9402[i_881_];
		if (i_883_ == -2)
		    i_882_ = (byte) 3;
		if (i_883_ == -1)
		    i_882_ = (byte) 2;
		if (i_884_ == -1) {
		    if (i_882_ == 0) {
			int i_885_ = aShortArray9403[i_881_] & 0xffff;
			int i_886_ = (i_885_ & 0x7f) * anInt9374 >> 7;
			short i_887_
			    = Class504.method8313(i_885_ & ~0x7f | i_886_,
						  1288124863);
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_881_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_881_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_881_]];
			int i_888_ = (((i * class100.anInt1215
					+ i_876_ * class100.anInt1217
					+ i_877_ * class100.anInt1216)
				       / class100.anInt1214)
				      >> 16);
			int i_889_ = i_888_ > 256 ? i_879_ : i_880_;
			int i_890_ = (i_878_ >> 1) + (i_889_ * i_888_ >> 17);
			anIntArray9391[i_881_]
			    = i_890_ << 17 | Class159.method2568(i_887_,
								 i_890_,
								 -186492569);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_881_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_881_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_881_]];
			i_888_ = ((i * class100.anInt1215
				   + i_876_ * class100.anInt1217
				   + i_877_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_889_ = i_888_ > 256 ? i_879_ : i_880_;
			i_890_ = (i_878_ >> 1) + (i_889_ * i_888_ >> 17);
			anIntArray9392[i_881_]
			    = i_890_ << 17 | Class159.method2568(i_887_,
								 i_890_,
								 -752393991);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_881_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_881_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_881_]];
			i_888_ = ((i * class100.anInt1215
				   + i_876_ * class100.anInt1217
				   + i_877_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_889_ = i_888_ > 256 ? i_879_ : i_880_;
			i_890_ = (i_878_ >> 1) + (i_889_ * i_888_ >> 17);
			anIntArray9393[i_881_]
			    = i_890_ << 17 | Class159.method2568(i_887_,
								 i_890_,
								 1408613285);
		    } else if (i_882_ == 1) {
			int i_891_ = aShortArray9403[i_881_] & 0xffff;
			int i_892_ = (i_891_ & 0x7f) * anInt9374 >> 7;
			short i_893_
			    = Class504.method8313(i_891_ & ~0x7f | i_892_,
						  1940460983);
			Class115 class115 = aClass115Array9398[i_881_];
			int i_894_ = ((i * class115.anInt1407
				       + i_876_ * class115.anInt1408
				       + i_877_ * class115.anInt1406)
				      >> 16);
			int i_895_ = i_894_ > 256 ? i_879_ : i_880_;
			int i_896_ = (i_878_ >> 1) + (i_895_ * i_894_ >> 17);
			anIntArray9391[i_881_]
			    = i_896_ << 17 | Class159.method2568(i_893_,
								 i_896_,
								 712398832);
			anIntArray9393[i_881_] = -1;
		    } else if (i_882_ == 3) {
			anIntArray9391[i_881_] = 128;
			anIntArray9393[i_881_] = -1;
		    } else
			anIntArray9393[i_881_] = -2;
		} else {
		    int i_897_ = aShortArray9403[i_881_] & 0xffff;
		    if (i_882_ == 0) {
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_881_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_881_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_881_]];
			int i_898_ = (((i * class100.anInt1215
					+ i_876_ * class100.anInt1217
					+ i_877_ * class100.anInt1216)
				       / class100.anInt1214)
				      >> 16);
			int i_899_ = i_898_ > 256 ? i_879_ : i_880_;
			int i_900_
			    = method15072((i_878_ >> 2) + (i_899_ * i_898_
							   >> 18));
			anIntArray9391[i_881_]
			    = i_900_ << 24 | method15070(i_897_, i_884_,
							 i_900_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_881_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_881_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_881_]];
			i_898_ = ((i * class100.anInt1215
				   + i_876_ * class100.anInt1217
				   + i_877_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_899_ = i_898_ > 256 ? i_879_ : i_880_;
			i_900_ = method15072((i_878_ >> 2) + (i_899_ * i_898_
							      >> 18));
			anIntArray9392[i_881_]
			    = i_900_ << 24 | method15070(i_897_, i_884_,
							 i_900_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_881_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_881_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_881_]];
			i_898_ = ((i * class100.anInt1215
				   + i_876_ * class100.anInt1217
				   + i_877_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_899_ = i_898_ > 256 ? i_879_ : i_880_;
			i_900_ = method15072((i_878_ >> 2) + (i_899_ * i_898_
							      >> 18));
			anIntArray9393[i_881_]
			    = i_900_ << 24 | method15070(i_897_, i_884_,
							 i_900_);
		    } else if (i_882_ == 1) {
			Class115 class115 = aClass115Array9398[i_881_];
			int i_901_ = ((i * class115.anInt1407
				       + i_876_ * class115.anInt1408
				       + i_877_ * class115.anInt1406)
				      >> 16);
			int i_902_ = i_901_ > 256 ? i_879_ : i_880_;
			int i_903_
			    = method15072((i_878_ >> 2) + (i_902_ * i_901_
							   >> 18));
			anIntArray9391[i_881_]
			    = i_903_ << 24 | method15070(i_897_, i_884_,
							 i_903_);
			anIntArray9393[i_881_] = -1;
		    } else
			anIntArray9393[i_881_] = -2;
		}
	    }
	    aClass100Array9422 = null;
	    aClass100Array9371 = null;
	    aClass115Array9398 = null;
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	    anInt9364 = 2;
	}
    }
    
    void method15104(boolean bool) {
	if (anInt9364 == 1)
	    method15073();
	else if (anInt9364 == 2) {
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	} else {
	    method15080();
	    int i = aClass182_Sub2_9433.anInt9474 * -1893445829;
	    int i_904_ = aClass182_Sub2_9433.anInt9475 * -1615993337;
	    int i_905_ = aClass182_Sub2_9433.anInt9468 * -1138625233;
	    int i_906_ = aClass182_Sub2_9433.anInt9479 * -722712849 >> 8;
	    int i_907_ = 0;
	    int i_908_ = 0;
	    if (anInt9383 != 0) {
		i_907_
		    = aClass182_Sub2_9433.anInt9463 * -1104473344 / anInt9383;
		i_908_
		    = aClass182_Sub2_9433.anInt9478 * -1613137664 / anInt9383;
	    }
	    if (anIntArray9391 == null) {
		anIntArray9391 = new int[anInt9375];
		anIntArray9392 = new int[anInt9375];
		anIntArray9393 = new int[anInt9375];
	    }
	    for (int i_909_ = 0; i_909_ < anInt9375; i_909_++) {
		byte i_910_;
		if (aByteArray9399 == null)
		    i_910_ = (byte) 0;
		else
		    i_910_ = aByteArray9399[i_909_];
		byte i_911_;
		if (aByteArray9406 == null)
		    i_911_ = (byte) 0;
		else
		    i_911_ = aByteArray9406[i_909_];
		short i_912_;
		if (aShortArray9402 == null)
		    i_912_ = (short) -1;
		else
		    i_912_ = aShortArray9402[i_909_];
		if (i_911_ == -2)
		    i_910_ = (byte) 3;
		if (i_911_ == -1)
		    i_910_ = (byte) 2;
		if (i_912_ == -1) {
		    if (i_910_ == 0) {
			int i_913_ = aShortArray9403[i_909_] & 0xffff;
			int i_914_ = (i_913_ & 0x7f) * anInt9374 >> 7;
			short i_915_
			    = Class504.method8313(i_913_ & ~0x7f | i_914_,
						  1058487780);
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_909_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_909_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_909_]];
			int i_916_ = (((i * class100.anInt1215
					+ i_904_ * class100.anInt1217
					+ i_905_ * class100.anInt1216)
				       / class100.anInt1214)
				      >> 16);
			int i_917_ = i_916_ > 256 ? i_907_ : i_908_;
			int i_918_ = (i_906_ >> 1) + (i_917_ * i_916_ >> 17);
			anIntArray9391[i_909_]
			    = i_918_ << 17 | Class159.method2568(i_915_,
								 i_918_,
								 1774050206);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_909_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_909_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_909_]];
			i_916_ = ((i * class100.anInt1215
				   + i_904_ * class100.anInt1217
				   + i_905_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_917_ = i_916_ > 256 ? i_907_ : i_908_;
			i_918_ = (i_906_ >> 1) + (i_917_ * i_916_ >> 17);
			anIntArray9392[i_909_]
			    = i_918_ << 17 | Class159.method2568(i_915_,
								 i_918_,
								 -1599224522);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_909_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_909_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_909_]];
			i_916_ = ((i * class100.anInt1215
				   + i_904_ * class100.anInt1217
				   + i_905_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_917_ = i_916_ > 256 ? i_907_ : i_908_;
			i_918_ = (i_906_ >> 1) + (i_917_ * i_916_ >> 17);
			anIntArray9393[i_909_]
			    = i_918_ << 17 | Class159.method2568(i_915_,
								 i_918_,
								 -997593030);
		    } else if (i_910_ == 1) {
			int i_919_ = aShortArray9403[i_909_] & 0xffff;
			int i_920_ = (i_919_ & 0x7f) * anInt9374 >> 7;
			short i_921_
			    = Class504.method8313(i_919_ & ~0x7f | i_920_,
						  1491845337);
			Class115 class115 = aClass115Array9398[i_909_];
			int i_922_ = ((i * class115.anInt1407
				       + i_904_ * class115.anInt1408
				       + i_905_ * class115.anInt1406)
				      >> 16);
			int i_923_ = i_922_ > 256 ? i_907_ : i_908_;
			int i_924_ = (i_906_ >> 1) + (i_923_ * i_922_ >> 17);
			anIntArray9391[i_909_]
			    = i_924_ << 17 | Class159.method2568(i_921_,
								 i_924_,
								 -924433458);
			anIntArray9393[i_909_] = -1;
		    } else if (i_910_ == 3) {
			anIntArray9391[i_909_] = 128;
			anIntArray9393[i_909_] = -1;
		    } else
			anIntArray9393[i_909_] = -2;
		} else {
		    int i_925_ = aShortArray9403[i_909_] & 0xffff;
		    if (i_910_ == 0) {
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_909_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_909_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_909_]];
			int i_926_ = (((i * class100.anInt1215
					+ i_904_ * class100.anInt1217
					+ i_905_ * class100.anInt1216)
				       / class100.anInt1214)
				      >> 16);
			int i_927_ = i_926_ > 256 ? i_907_ : i_908_;
			int i_928_
			    = method15072((i_906_ >> 2) + (i_927_ * i_926_
							   >> 18));
			anIntArray9391[i_909_]
			    = i_928_ << 24 | method15070(i_925_, i_912_,
							 i_928_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_909_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_909_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_909_]];
			i_926_ = ((i * class100.anInt1215
				   + i_904_ * class100.anInt1217
				   + i_905_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_927_ = i_926_ > 256 ? i_907_ : i_908_;
			i_928_ = method15072((i_906_ >> 2) + (i_927_ * i_926_
							      >> 18));
			anIntArray9392[i_909_]
			    = i_928_ << 24 | method15070(i_925_, i_912_,
							 i_928_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_909_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_909_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_909_]];
			i_926_ = ((i * class100.anInt1215
				   + i_904_ * class100.anInt1217
				   + i_905_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_927_ = i_926_ > 256 ? i_907_ : i_908_;
			i_928_ = method15072((i_906_ >> 2) + (i_927_ * i_926_
							      >> 18));
			anIntArray9393[i_909_]
			    = i_928_ << 24 | method15070(i_925_, i_912_,
							 i_928_);
		    } else if (i_910_ == 1) {
			Class115 class115 = aClass115Array9398[i_909_];
			int i_929_ = ((i * class115.anInt1407
				       + i_904_ * class115.anInt1408
				       + i_905_ * class115.anInt1406)
				      >> 16);
			int i_930_ = i_929_ > 256 ? i_907_ : i_908_;
			int i_931_
			    = method15072((i_906_ >> 2) + (i_930_ * i_929_
							   >> 18));
			anIntArray9391[i_909_]
			    = i_931_ << 24 | method15070(i_925_, i_912_,
							 i_931_);
			anIntArray9393[i_909_] = -1;
		    } else
			anIntArray9393[i_909_] = -2;
		}
	    }
	    aClass100Array9422 = null;
	    aClass100Array9371 = null;
	    aClass115Array9398 = null;
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	    anInt9364 = 2;
	}
    }
    
    void method15105(boolean bool) {
	if (anInt9364 == 1)
	    method15073();
	else if (anInt9364 == 2) {
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	} else {
	    method15080();
	    int i = aClass182_Sub2_9433.anInt9474 * -1893445829;
	    int i_932_ = aClass182_Sub2_9433.anInt9475 * -1615993337;
	    int i_933_ = aClass182_Sub2_9433.anInt9468 * -1138625233;
	    int i_934_ = aClass182_Sub2_9433.anInt9479 * -722712849 >> 8;
	    int i_935_ = 0;
	    int i_936_ = 0;
	    if (anInt9383 != 0) {
		i_935_
		    = aClass182_Sub2_9433.anInt9463 * -1104473344 / anInt9383;
		i_936_
		    = aClass182_Sub2_9433.anInt9478 * -1613137664 / anInt9383;
	    }
	    if (anIntArray9391 == null) {
		anIntArray9391 = new int[anInt9375];
		anIntArray9392 = new int[anInt9375];
		anIntArray9393 = new int[anInt9375];
	    }
	    for (int i_937_ = 0; i_937_ < anInt9375; i_937_++) {
		byte i_938_;
		if (aByteArray9399 == null)
		    i_938_ = (byte) 0;
		else
		    i_938_ = aByteArray9399[i_937_];
		byte i_939_;
		if (aByteArray9406 == null)
		    i_939_ = (byte) 0;
		else
		    i_939_ = aByteArray9406[i_937_];
		short i_940_;
		if (aShortArray9402 == null)
		    i_940_ = (short) -1;
		else
		    i_940_ = aShortArray9402[i_937_];
		if (i_939_ == -2)
		    i_938_ = (byte) 3;
		if (i_939_ == -1)
		    i_938_ = (byte) 2;
		if (i_940_ == -1) {
		    if (i_938_ == 0) {
			int i_941_ = aShortArray9403[i_937_] & 0xffff;
			int i_942_ = (i_941_ & 0x7f) * anInt9374 >> 7;
			short i_943_
			    = Class504.method8313(i_941_ & ~0x7f | i_942_,
						  2025604187);
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_937_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_937_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_937_]];
			int i_944_ = (((i * class100.anInt1215
					+ i_932_ * class100.anInt1217
					+ i_933_ * class100.anInt1216)
				       / class100.anInt1214)
				      >> 16);
			int i_945_ = i_944_ > 256 ? i_935_ : i_936_;
			int i_946_ = (i_934_ >> 1) + (i_945_ * i_944_ >> 17);
			anIntArray9391[i_937_]
			    = i_946_ << 17 | Class159.method2568(i_943_,
								 i_946_,
								 -135943078);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_937_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_937_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_937_]];
			i_944_ = ((i * class100.anInt1215
				   + i_932_ * class100.anInt1217
				   + i_933_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_945_ = i_944_ > 256 ? i_935_ : i_936_;
			i_946_ = (i_934_ >> 1) + (i_945_ * i_944_ >> 17);
			anIntArray9392[i_937_]
			    = i_946_ << 17 | Class159.method2568(i_943_,
								 i_946_,
								 1245643226);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_937_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_937_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_937_]];
			i_944_ = ((i * class100.anInt1215
				   + i_932_ * class100.anInt1217
				   + i_933_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_945_ = i_944_ > 256 ? i_935_ : i_936_;
			i_946_ = (i_934_ >> 1) + (i_945_ * i_944_ >> 17);
			anIntArray9393[i_937_]
			    = i_946_ << 17 | Class159.method2568(i_943_,
								 i_946_,
								 1882088809);
		    } else if (i_938_ == 1) {
			int i_947_ = aShortArray9403[i_937_] & 0xffff;
			int i_948_ = (i_947_ & 0x7f) * anInt9374 >> 7;
			short i_949_
			    = Class504.method8313(i_947_ & ~0x7f | i_948_,
						  285279372);
			Class115 class115 = aClass115Array9398[i_937_];
			int i_950_ = ((i * class115.anInt1407
				       + i_932_ * class115.anInt1408
				       + i_933_ * class115.anInt1406)
				      >> 16);
			int i_951_ = i_950_ > 256 ? i_935_ : i_936_;
			int i_952_ = (i_934_ >> 1) + (i_951_ * i_950_ >> 17);
			anIntArray9391[i_937_]
			    = i_952_ << 17 | Class159.method2568(i_949_,
								 i_952_,
								 831271346);
			anIntArray9393[i_937_] = -1;
		    } else if (i_938_ == 3) {
			anIntArray9391[i_937_] = 128;
			anIntArray9393[i_937_] = -1;
		    } else
			anIntArray9393[i_937_] = -2;
		} else {
		    int i_953_ = aShortArray9403[i_937_] & 0xffff;
		    if (i_938_ == 0) {
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_937_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_937_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_937_]];
			int i_954_ = (((i * class100.anInt1215
					+ i_932_ * class100.anInt1217
					+ i_933_ * class100.anInt1216)
				       / class100.anInt1214)
				      >> 16);
			int i_955_ = i_954_ > 256 ? i_935_ : i_936_;
			int i_956_
			    = method15072((i_934_ >> 2) + (i_955_ * i_954_
							   >> 18));
			anIntArray9391[i_937_]
			    = i_956_ << 24 | method15070(i_953_, i_940_,
							 i_956_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_937_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_937_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_937_]];
			i_954_ = ((i * class100.anInt1215
				   + i_932_ * class100.anInt1217
				   + i_933_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_955_ = i_954_ > 256 ? i_935_ : i_936_;
			i_956_ = method15072((i_934_ >> 2) + (i_955_ * i_954_
							      >> 18));
			anIntArray9392[i_937_]
			    = i_956_ << 24 | method15070(i_953_, i_940_,
							 i_956_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_937_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_937_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_937_]];
			i_954_ = ((i * class100.anInt1215
				   + i_932_ * class100.anInt1217
				   + i_933_ * class100.anInt1216)
				  / class100.anInt1214) >> 16;
			i_955_ = i_954_ > 256 ? i_935_ : i_936_;
			i_956_ = method15072((i_934_ >> 2) + (i_955_ * i_954_
							      >> 18));
			anIntArray9393[i_937_]
			    = i_956_ << 24 | method15070(i_953_, i_940_,
							 i_956_);
		    } else if (i_938_ == 1) {
			Class115 class115 = aClass115Array9398[i_937_];
			int i_957_ = ((i * class115.anInt1407
				       + i_932_ * class115.anInt1408
				       + i_933_ * class115.anInt1406)
				      >> 16);
			int i_958_ = i_957_ > 256 ? i_935_ : i_936_;
			int i_959_
			    = method15072((i_934_ >> 2) + (i_958_ * i_957_
							   >> 18));
			anIntArray9391[i_937_]
			    = i_959_ << 24 | method15070(i_953_, i_940_,
							 i_959_);
			anIntArray9393[i_937_] = -1;
		    } else
			anIntArray9393[i_937_] = -2;
		}
	    }
	    aClass100Array9422 = null;
	    aClass100Array9371 = null;
	    aClass115Array9398 = null;
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	    anInt9364 = 2;
	}
    }
    
    void method3013(int i, int[] is, int i_960_, int i_961_, int i_962_,
		    boolean bool, int i_963_, int[] is_964_) {
	int i_965_ = is.length;
	if (i == 0) {
	    i_960_ <<= 4;
	    i_961_ <<= 4;
	    i_962_ <<= 4;
	    if (!aBool9409) {
		for (int i_966_ = 0; i_966_ < anInt9394; i_966_++) {
		    anIntArray9424[i_966_] <<= 4;
		    anIntArray9379[i_966_] <<= 4;
		    anIntArray9395[i_966_] <<= 4;
		}
		aBool9409 = true;
	    }
	    int i_967_ = 0;
	    anInt9425 = 0;
	    anInt9411 = 0;
	    anInt9412 = 0;
	    for (int i_968_ = 0; i_968_ < i_965_; i_968_++) {
		int i_969_ = is[i_968_];
		if (i_969_ < anIntArrayArray9397.length) {
		    int[] is_970_ = anIntArrayArray9397[i_969_];
		    for (int i_971_ = 0; i_971_ < is_970_.length; i_971_++) {
			int i_972_ = is_970_[i_971_];
			if (aShortArray9378 == null
			    || (i_963_ & aShortArray9378[i_972_]) != 0) {
			    anInt9425 += anIntArray9424[i_972_];
			    anInt9411 += anIntArray9379[i_972_];
			    anInt9412 += anIntArray9395[i_972_];
			    i_967_++;
			}
		    }
		}
	    }
	    if (i_967_ > 0) {
		anInt9425 = anInt9425 / i_967_ + i_960_;
		anInt9411 = anInt9411 / i_967_ + i_961_;
		anInt9412 = anInt9412 / i_967_ + i_962_;
		aBool9414 = true;
	    } else {
		anInt9425 = i_960_;
		anInt9411 = i_961_;
		anInt9412 = i_962_;
	    }
	} else if (i == 1) {
	    if (is_964_ != null) {
		int i_973_ = ((is_964_[0] * i_960_ + is_964_[1] * i_961_
			       + is_964_[2] * i_962_ + 8192)
			      >> 14);
		int i_974_ = ((is_964_[3] * i_960_ + is_964_[4] * i_961_
			       + is_964_[5] * i_962_ + 8192)
			      >> 14);
		int i_975_ = ((is_964_[6] * i_960_ + is_964_[7] * i_961_
			       + is_964_[8] * i_962_ + 8192)
			      >> 14);
		i_960_ = i_973_;
		i_961_ = i_974_;
		i_962_ = i_975_;
	    }
	    i_960_ <<= 4;
	    i_961_ <<= 4;
	    i_962_ <<= 4;
	    if (!aBool9409) {
		for (int i_976_ = 0; i_976_ < anInt9394; i_976_++) {
		    anIntArray9424[i_976_] <<= 4;
		    anIntArray9379[i_976_] <<= 4;
		    anIntArray9395[i_976_] <<= 4;
		}
		aBool9409 = true;
	    }
	    for (int i_977_ = 0; i_977_ < i_965_; i_977_++) {
		int i_978_ = is[i_977_];
		if (i_978_ < anIntArrayArray9397.length) {
		    int[] is_979_ = anIntArrayArray9397[i_978_];
		    for (int i_980_ = 0; i_980_ < is_979_.length; i_980_++) {
			int i_981_ = is_979_[i_980_];
			if (aShortArray9378 == null
			    || (i_963_ & aShortArray9378[i_981_]) != 0) {
			    anIntArray9424[i_981_] += i_960_;
			    anIntArray9379[i_981_] += i_961_;
			    anIntArray9395[i_981_] += i_962_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_964_ != null) {
		if (!aBool9409) {
		    for (int i_982_ = 0; i_982_ < anInt9394; i_982_++) {
			anIntArray9424[i_982_] <<= 4;
			anIntArray9379[i_982_] <<= 4;
			anIntArray9395[i_982_] <<= 4;
		    }
		    aBool9409 = true;
		}
		int i_983_ = is_964_[9] << 4;
		int i_984_ = is_964_[10] << 4;
		int i_985_ = is_964_[11] << 4;
		int i_986_ = is_964_[12] << 4;
		int i_987_ = is_964_[13] << 4;
		int i_988_ = is_964_[14] << 4;
		if (aBool9414) {
		    int i_989_
			= ((is_964_[0] * anInt9425 + is_964_[3] * anInt9411
			    + is_964_[6] * anInt9412 + 8192)
			   >> 14);
		    int i_990_
			= ((is_964_[1] * anInt9425 + is_964_[4] * anInt9411
			    + is_964_[7] * anInt9412 + 8192)
			   >> 14);
		    int i_991_
			= ((is_964_[2] * anInt9425 + is_964_[5] * anInt9411
			    + is_964_[8] * anInt9412 + 8192)
			   >> 14);
		    i_989_ += i_986_;
		    i_990_ += i_987_;
		    i_991_ += i_988_;
		    anInt9425 = i_989_;
		    anInt9411 = i_990_;
		    anInt9412 = i_991_;
		    aBool9414 = false;
		}
		int[] is_992_ = new int[9];
		int i_993_ = Class436.anIntArray4838[i_960_];
		int i_994_ = Class436.anIntArray4831[i_960_];
		int i_995_ = Class436.anIntArray4838[i_961_];
		int i_996_ = Class436.anIntArray4831[i_961_];
		int i_997_ = Class436.anIntArray4838[i_962_];
		int i_998_ = Class436.anIntArray4831[i_962_];
		int i_999_ = i_994_ * i_997_ + 8192 >> 14;
		int i_1000_ = i_994_ * i_998_ + 8192 >> 14;
		is_992_[0] = i_995_ * i_997_ + i_996_ * i_1000_ + 8192 >> 14;
		is_992_[1] = -i_995_ * i_998_ + i_996_ * i_999_ + 8192 >> 14;
		is_992_[2] = i_996_ * i_993_ + 8192 >> 14;
		is_992_[3] = i_993_ * i_998_ + 8192 >> 14;
		is_992_[4] = i_993_ * i_997_ + 8192 >> 14;
		is_992_[5] = -i_994_;
		is_992_[6] = -i_996_ * i_997_ + i_995_ * i_1000_ + 8192 >> 14;
		is_992_[7] = i_996_ * i_998_ + i_995_ * i_999_ + 8192 >> 14;
		is_992_[8] = i_995_ * i_993_ + 8192 >> 14;
		int i_1001_
		    = ((is_992_[0] * -anInt9425 + is_992_[1] * -anInt9411
			+ is_992_[2] * -anInt9412 + 8192)
		       >> 14);
		int i_1002_
		    = ((is_992_[3] * -anInt9425 + is_992_[4] * -anInt9411
			+ is_992_[5] * -anInt9412 + 8192)
		       >> 14);
		int i_1003_
		    = ((is_992_[6] * -anInt9425 + is_992_[7] * -anInt9411
			+ is_992_[8] * -anInt9412 + 8192)
		       >> 14);
		int i_1004_ = i_1001_ + anInt9425;
		int i_1005_ = i_1002_ + anInt9411;
		int i_1006_ = i_1003_ + anInt9412;
		int[] is_1007_ = new int[9];
		for (int i_1008_ = 0; i_1008_ < 3; i_1008_++) {
		    for (int i_1009_ = 0; i_1009_ < 3; i_1009_++) {
			int i_1010_ = 0;
			for (int i_1011_ = 0; i_1011_ < 3; i_1011_++)
			    i_1010_ += (is_992_[i_1008_ * 3 + i_1011_]
					* is_964_[i_1009_ * 3 + i_1011_]);
			is_1007_[i_1008_ * 3 + i_1009_] = i_1010_ + 8192 >> 14;
		    }
		}
		int i_1012_ = ((is_992_[0] * i_986_ + is_992_[1] * i_987_
				+ is_992_[2] * i_988_ + 8192)
			       >> 14);
		int i_1013_ = ((is_992_[3] * i_986_ + is_992_[4] * i_987_
				+ is_992_[5] * i_988_ + 8192)
			       >> 14);
		int i_1014_ = ((is_992_[6] * i_986_ + is_992_[7] * i_987_
				+ is_992_[8] * i_988_ + 8192)
			       >> 14);
		i_1012_ += i_1004_;
		i_1013_ += i_1005_;
		i_1014_ += i_1006_;
		int[] is_1015_ = new int[9];
		for (int i_1016_ = 0; i_1016_ < 3; i_1016_++) {
		    for (int i_1017_ = 0; i_1017_ < 3; i_1017_++) {
			int i_1018_ = 0;
			for (int i_1019_ = 0; i_1019_ < 3; i_1019_++)
			    i_1018_ += (is_964_[i_1016_ * 3 + i_1019_]
					* is_1007_[i_1017_ + i_1019_ * 3]);
			is_1015_[i_1016_ * 3 + i_1017_] = i_1018_ + 8192 >> 14;
		    }
		}
		int i_1020_ = ((is_964_[0] * i_1012_ + is_964_[1] * i_1013_
				+ is_964_[2] * i_1014_ + 8192)
			       >> 14);
		int i_1021_ = ((is_964_[3] * i_1012_ + is_964_[4] * i_1013_
				+ is_964_[5] * i_1014_ + 8192)
			       >> 14);
		int i_1022_ = ((is_964_[6] * i_1012_ + is_964_[7] * i_1013_
				+ is_964_[8] * i_1014_ + 8192)
			       >> 14);
		i_1020_ += i_983_;
		i_1021_ += i_984_;
		i_1022_ += i_985_;
		for (int i_1023_ = 0; i_1023_ < i_965_; i_1023_++) {
		    int i_1024_ = is[i_1023_];
		    if (i_1024_ < anIntArrayArray9397.length) {
			int[] is_1025_ = anIntArrayArray9397[i_1024_];
			for (int i_1026_ = 0; i_1026_ < is_1025_.length;
			     i_1026_++) {
			    int i_1027_ = is_1025_[i_1026_];
			    if (aShortArray9378 == null
				|| (i_963_ & aShortArray9378[i_1027_]) != 0) {
				int i_1028_
				    = ((is_1015_[0] * anIntArray9424[i_1027_]
					+ is_1015_[1] * anIntArray9379[i_1027_]
					+ is_1015_[2] * anIntArray9395[i_1027_]
					+ 8192)
				       >> 14);
				int i_1029_
				    = ((is_1015_[3] * anIntArray9424[i_1027_]
					+ is_1015_[4] * anIntArray9379[i_1027_]
					+ is_1015_[5] * anIntArray9395[i_1027_]
					+ 8192)
				       >> 14);
				int i_1030_
				    = ((is_1015_[6] * anIntArray9424[i_1027_]
					+ is_1015_[7] * anIntArray9379[i_1027_]
					+ is_1015_[8] * anIntArray9395[i_1027_]
					+ 8192)
				       >> 14);
				i_1028_ += i_1020_;
				i_1029_ += i_1021_;
				i_1030_ += i_1022_;
				anIntArray9424[i_1027_] = i_1028_;
				anIntArray9379[i_1027_] = i_1029_;
				anIntArray9395[i_1027_] = i_1030_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1031_ = 0; i_1031_ < i_965_; i_1031_++) {
		    int i_1032_ = is[i_1031_];
		    if (i_1032_ < anIntArrayArray9397.length) {
			int[] is_1033_ = anIntArrayArray9397[i_1032_];
			for (int i_1034_ = 0; i_1034_ < is_1033_.length;
			     i_1034_++) {
			    int i_1035_ = is_1033_[i_1034_];
			    if (aShortArray9378 == null
				|| (i_963_ & aShortArray9378[i_1035_]) != 0) {
				anIntArray9424[i_1035_] -= anInt9425;
				anIntArray9379[i_1035_] -= anInt9411;
				anIntArray9395[i_1035_] -= anInt9412;
				if (i_962_ != 0) {
				    int i_1036_
					= Class436.anIntArray4831[i_962_];
				    int i_1037_
					= Class436.anIntArray4838[i_962_];
				    int i_1038_
					= ((anIntArray9379[i_1035_] * i_1036_
					    + anIntArray9424[i_1035_] * i_1037_
					    + 16383)
					   >> 14);
				    anIntArray9379[i_1035_]
					= (anIntArray9379[i_1035_] * i_1037_
					   - anIntArray9424[i_1035_] * i_1036_
					   + 16383) >> 14;
				    anIntArray9424[i_1035_] = i_1038_;
				}
				if (i_960_ != 0) {
				    int i_1039_
					= Class436.anIntArray4831[i_960_];
				    int i_1040_
					= Class436.anIntArray4838[i_960_];
				    int i_1041_
					= ((anIntArray9379[i_1035_] * i_1040_
					    - anIntArray9395[i_1035_] * i_1039_
					    + 16383)
					   >> 14);
				    anIntArray9395[i_1035_]
					= (anIntArray9379[i_1035_] * i_1039_
					   + anIntArray9395[i_1035_] * i_1040_
					   + 16383) >> 14;
				    anIntArray9379[i_1035_] = i_1041_;
				}
				if (i_961_ != 0) {
				    int i_1042_
					= Class436.anIntArray4831[i_961_];
				    int i_1043_
					= Class436.anIntArray4838[i_961_];
				    int i_1044_
					= ((anIntArray9395[i_1035_] * i_1042_
					    + anIntArray9424[i_1035_] * i_1043_
					    + 16383)
					   >> 14);
				    anIntArray9395[i_1035_]
					= (anIntArray9395[i_1035_] * i_1043_
					   - anIntArray9424[i_1035_] * i_1042_
					   + 16383) >> 14;
				    anIntArray9424[i_1035_] = i_1044_;
				}
				anIntArray9424[i_1035_] += anInt9425;
				anIntArray9379[i_1035_] += anInt9411;
				anIntArray9395[i_1035_] += anInt9412;
			    }
			}
		    }
		}
	    }
	} else if (i == 3) {
	    if (is_964_ != null) {
		if (!aBool9409) {
		    for (int i_1045_ = 0; i_1045_ < anInt9394; i_1045_++) {
			anIntArray9424[i_1045_] <<= 4;
			anIntArray9379[i_1045_] <<= 4;
			anIntArray9395[i_1045_] <<= 4;
		    }
		    aBool9409 = true;
		}
		int i_1046_ = is_964_[9] << 4;
		int i_1047_ = is_964_[10] << 4;
		int i_1048_ = is_964_[11] << 4;
		int i_1049_ = is_964_[12] << 4;
		int i_1050_ = is_964_[13] << 4;
		int i_1051_ = is_964_[14] << 4;
		if (aBool9414) {
		    int i_1052_
			= ((is_964_[0] * anInt9425 + is_964_[3] * anInt9411
			    + is_964_[6] * anInt9412 + 8192)
			   >> 14);
		    int i_1053_
			= ((is_964_[1] * anInt9425 + is_964_[4] * anInt9411
			    + is_964_[7] * anInt9412 + 8192)
			   >> 14);
		    int i_1054_
			= ((is_964_[2] * anInt9425 + is_964_[5] * anInt9411
			    + is_964_[8] * anInt9412 + 8192)
			   >> 14);
		    i_1052_ += i_1049_;
		    i_1053_ += i_1050_;
		    i_1054_ += i_1051_;
		    anInt9425 = i_1052_;
		    anInt9411 = i_1053_;
		    anInt9412 = i_1054_;
		    aBool9414 = false;
		}
		int i_1055_ = i_960_ << 15 >> 7;
		int i_1056_ = i_961_ << 15 >> 7;
		int i_1057_ = i_962_ << 15 >> 7;
		int i_1058_ = i_1055_ * -anInt9425 + 8192 >> 14;
		int i_1059_ = i_1056_ * -anInt9411 + 8192 >> 14;
		int i_1060_ = i_1057_ * -anInt9412 + 8192 >> 14;
		int i_1061_ = i_1058_ + anInt9425;
		int i_1062_ = i_1059_ + anInt9411;
		int i_1063_ = i_1060_ + anInt9412;
		int[] is_1064_ = new int[9];
		is_1064_[0] = i_1055_ * is_964_[0] + 8192 >> 14;
		is_1064_[1] = i_1055_ * is_964_[3] + 8192 >> 14;
		is_1064_[2] = i_1055_ * is_964_[6] + 8192 >> 14;
		is_1064_[3] = i_1056_ * is_964_[1] + 8192 >> 14;
		is_1064_[4] = i_1056_ * is_964_[4] + 8192 >> 14;
		is_1064_[5] = i_1056_ * is_964_[7] + 8192 >> 14;
		is_1064_[6] = i_1057_ * is_964_[2] + 8192 >> 14;
		is_1064_[7] = i_1057_ * is_964_[5] + 8192 >> 14;
		is_1064_[8] = i_1057_ * is_964_[8] + 8192 >> 14;
		int i_1065_ = i_1055_ * i_1049_ + 8192 >> 14;
		int i_1066_ = i_1056_ * i_1050_ + 8192 >> 14;
		int i_1067_ = i_1057_ * i_1051_ + 8192 >> 14;
		i_1065_ += i_1061_;
		i_1066_ += i_1062_;
		i_1067_ += i_1063_;
		int[] is_1068_ = new int[9];
		for (int i_1069_ = 0; i_1069_ < 3; i_1069_++) {
		    for (int i_1070_ = 0; i_1070_ < 3; i_1070_++) {
			int i_1071_ = 0;
			for (int i_1072_ = 0; i_1072_ < 3; i_1072_++)
			    i_1071_ += (is_964_[i_1069_ * 3 + i_1072_]
					* is_1064_[i_1070_ + i_1072_ * 3]);
			is_1068_[i_1069_ * 3 + i_1070_] = i_1071_ + 8192 >> 14;
		    }
		}
		int i_1073_ = ((is_964_[0] * i_1065_ + is_964_[1] * i_1066_
				+ is_964_[2] * i_1067_ + 8192)
			       >> 14);
		int i_1074_ = ((is_964_[3] * i_1065_ + is_964_[4] * i_1066_
				+ is_964_[5] * i_1067_ + 8192)
			       >> 14);
		int i_1075_ = ((is_964_[6] * i_1065_ + is_964_[7] * i_1066_
				+ is_964_[8] * i_1067_ + 8192)
			       >> 14);
		i_1073_ += i_1046_;
		i_1074_ += i_1047_;
		i_1075_ += i_1048_;
		for (int i_1076_ = 0; i_1076_ < i_965_; i_1076_++) {
		    int i_1077_ = is[i_1076_];
		    if (i_1077_ < anIntArrayArray9397.length) {
			int[] is_1078_ = anIntArrayArray9397[i_1077_];
			for (int i_1079_ = 0; i_1079_ < is_1078_.length;
			     i_1079_++) {
			    int i_1080_ = is_1078_[i_1079_];
			    if (aShortArray9378 == null
				|| (i_963_ & aShortArray9378[i_1080_]) != 0) {
				int i_1081_
				    = ((is_1068_[0] * anIntArray9424[i_1080_]
					+ is_1068_[1] * anIntArray9379[i_1080_]
					+ is_1068_[2] * anIntArray9395[i_1080_]
					+ 8192)
				       >> 14);
				int i_1082_
				    = ((is_1068_[3] * anIntArray9424[i_1080_]
					+ is_1068_[4] * anIntArray9379[i_1080_]
					+ is_1068_[5] * anIntArray9395[i_1080_]
					+ 8192)
				       >> 14);
				int i_1083_
				    = ((is_1068_[6] * anIntArray9424[i_1080_]
					+ is_1068_[7] * anIntArray9379[i_1080_]
					+ is_1068_[8] * anIntArray9395[i_1080_]
					+ 8192)
				       >> 14);
				i_1081_ += i_1073_;
				i_1082_ += i_1074_;
				i_1083_ += i_1075_;
				anIntArray9424[i_1080_] = i_1081_;
				anIntArray9379[i_1080_] = i_1082_;
				anIntArray9395[i_1080_] = i_1083_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1084_ = 0; i_1084_ < i_965_; i_1084_++) {
		    int i_1085_ = is[i_1084_];
		    if (i_1085_ < anIntArrayArray9397.length) {
			int[] is_1086_ = anIntArrayArray9397[i_1085_];
			for (int i_1087_ = 0; i_1087_ < is_1086_.length;
			     i_1087_++) {
			    int i_1088_ = is_1086_[i_1087_];
			    if (aShortArray9378 == null
				|| (i_963_ & aShortArray9378[i_1088_]) != 0) {
				anIntArray9424[i_1088_] -= anInt9425;
				anIntArray9379[i_1088_] -= anInt9411;
				anIntArray9395[i_1088_] -= anInt9412;
				anIntArray9424[i_1088_]
				    = anIntArray9424[i_1088_] * i_960_ / 128;
				anIntArray9379[i_1088_]
				    = anIntArray9379[i_1088_] * i_961_ / 128;
				anIntArray9395[i_1088_]
				    = anIntArray9395[i_1088_] * i_962_ / 128;
				anIntArray9424[i_1088_] += anInt9425;
				anIntArray9379[i_1088_] += anInt9411;
				anIntArray9395[i_1088_] += anInt9412;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9445 != null && aByteArray9406 != null) {
		for (int i_1089_ = 0; i_1089_ < i_965_; i_1089_++) {
		    int i_1090_ = is[i_1089_];
		    if (i_1090_ < anIntArrayArray9445.length) {
			int[] is_1091_ = anIntArrayArray9445[i_1090_];
			for (int i_1092_ = 0; i_1092_ < is_1091_.length;
			     i_1092_++) {
			    int i_1093_ = is_1091_[i_1092_];
			    if (aShortArray9404 == null
				|| (i_963_ & aShortArray9404[i_1093_]) != 0) {
				int i_1094_ = ((aByteArray9406[i_1093_] & 0xff)
					       + i_960_ * 8);
				if (i_1094_ < 0)
				    i_1094_ = 0;
				else if (i_1094_ > 255)
				    i_1094_ = 255;
				aByteArray9406[i_1093_] = (byte) i_1094_;
			    }
			}
		    }
		}
		if (aClass103Array9417 != null) {
		    for (int i_1095_ = 0; i_1095_ < anInt9416; i_1095_++) {
			Class103 class103 = aClass103Array9417[i_1095_];
			Class107 class107 = aClass107Array9441[i_1095_];
			class107.anInt1304
			    = (class107.anInt1304 * -1093122285 & 0xffffff
			       | 255 - ((aByteArray9406
					 [class103.anInt1273 * -954563709])
					& 0xff) << 24) * 540580635;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9445 != null) {
		for (int i_1096_ = 0; i_1096_ < i_965_; i_1096_++) {
		    int i_1097_ = is[i_1096_];
		    if (i_1097_ < anIntArrayArray9445.length) {
			int[] is_1098_ = anIntArrayArray9445[i_1097_];
			for (int i_1099_ = 0; i_1099_ < is_1098_.length;
			     i_1099_++) {
			    int i_1100_ = is_1098_[i_1099_];
			    if (aShortArray9404 == null
				|| (i_963_ & aShortArray9404[i_1100_]) != 0) {
				int i_1101_
				    = aShortArray9403[i_1100_] & 0xffff;
				int i_1102_ = i_1101_ >> 10 & 0x3f;
				int i_1103_ = i_1101_ >> 7 & 0x7;
				int i_1104_ = i_1101_ & 0x7f;
				i_1102_ = i_1102_ + i_960_ & 0x3f;
				i_1103_ += i_961_;
				if (i_1103_ < 0)
				    i_1103_ = 0;
				else if (i_1103_ > 7)
				    i_1103_ = 7;
				i_1104_ += i_962_;
				if (i_1104_ < 0)
				    i_1104_ = 0;
				else if (i_1104_ > 127)
				    i_1104_ = 127;
				aShortArray9403[i_1100_]
				    = (short) (i_1102_ << 10 | i_1103_ << 7
					       | i_1104_);
			    }
			}
			aBool9408 = true;
		    }
		}
		if (aClass103Array9417 != null) {
		    for (int i_1105_ = 0; i_1105_ < anInt9416; i_1105_++) {
			Class103 class103 = aClass103Array9417[i_1105_];
			Class107 class107 = aClass107Array9441[i_1105_];
			class107.anInt1304
			    = (class107.anInt1304 * -1093122285 & ~0xffffff
			       | ((Class381.anIntArray3929
				   [Class504.method8313(((aShortArray9403
							  [(class103.anInt1273
							    * -954563709)])
							 & 0xffff),
							449163339) & 0xffff])
				  & 0xffffff)) * 540580635;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9419 != null) {
		for (int i_1106_ = 0; i_1106_ < i_965_; i_1106_++) {
		    int i_1107_ = is[i_1106_];
		    if (i_1107_ < anIntArrayArray9419.length) {
			int[] is_1108_ = anIntArrayArray9419[i_1107_];
			for (int i_1109_ = 0; i_1109_ < is_1108_.length;
			     i_1109_++) {
			    Class107 class107
				= aClass107Array9441[is_1108_[i_1109_]];
			    class107.anInt1297 += i_960_ * -1780640007;
			    class107.anInt1298 += i_961_ * -1349044133;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9419 != null) {
		for (int i_1110_ = 0; i_1110_ < i_965_; i_1110_++) {
		    int i_1111_ = is[i_1110_];
		    if (i_1111_ < anIntArrayArray9419.length) {
			int[] is_1112_ = anIntArrayArray9419[i_1111_];
			for (int i_1113_ = 0; i_1113_ < is_1112_.length;
			     i_1113_++) {
			    Class107 class107
				= aClass107Array9441[is_1112_[i_1113_]];
			    class107.aFloat1295 = (class107.aFloat1295
						   * (float) i_960_ / 128.0F);
			    class107.aFloat1296 = (class107.aFloat1296
						   * (float) i_961_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9419 != null) {
		for (int i_1114_ = 0; i_1114_ < i_965_; i_1114_++) {
		    int i_1115_ = is[i_1114_];
		    if (i_1115_ < anIntArrayArray9419.length) {
			int[] is_1116_ = anIntArrayArray9419[i_1115_];
			for (int i_1117_ = 0; i_1117_ < is_1116_.length;
			     i_1117_++) {
			    Class107 class107
				= aClass107Array9441[is_1116_[i_1117_]];
			    class107.anInt1299
				= (class107.anInt1299 * -1829505101 + i_960_
				   & 0x3fff) * -412512389;
			}
		    }
		}
	    }
	}
    }
    
    void method15106(boolean bool) {
	if (anInt9364 == 1)
	    method15073();
	else if (anInt9364 == 2) {
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	} else {
	    method15080();
	    int i = aClass182_Sub2_9433.anInt9474 * -1893445829;
	    int i_1118_ = aClass182_Sub2_9433.anInt9475 * -1615993337;
	    int i_1119_ = aClass182_Sub2_9433.anInt9468 * -1138625233;
	    int i_1120_ = aClass182_Sub2_9433.anInt9479 * -722712849 >> 8;
	    int i_1121_ = 0;
	    int i_1122_ = 0;
	    if (anInt9383 != 0) {
		i_1121_
		    = aClass182_Sub2_9433.anInt9463 * -1104473344 / anInt9383;
		i_1122_
		    = aClass182_Sub2_9433.anInt9478 * -1613137664 / anInt9383;
	    }
	    if (anIntArray9391 == null) {
		anIntArray9391 = new int[anInt9375];
		anIntArray9392 = new int[anInt9375];
		anIntArray9393 = new int[anInt9375];
	    }
	    for (int i_1123_ = 0; i_1123_ < anInt9375; i_1123_++) {
		byte i_1124_;
		if (aByteArray9399 == null)
		    i_1124_ = (byte) 0;
		else
		    i_1124_ = aByteArray9399[i_1123_];
		byte i_1125_;
		if (aByteArray9406 == null)
		    i_1125_ = (byte) 0;
		else
		    i_1125_ = aByteArray9406[i_1123_];
		short i_1126_;
		if (aShortArray9402 == null)
		    i_1126_ = (short) -1;
		else
		    i_1126_ = aShortArray9402[i_1123_];
		if (i_1125_ == -2)
		    i_1124_ = (byte) 3;
		if (i_1125_ == -1)
		    i_1124_ = (byte) 2;
		if (i_1126_ == -1) {
		    if (i_1124_ == 0) {
			int i_1127_ = aShortArray9403[i_1123_] & 0xffff;
			int i_1128_ = (i_1127_ & 0x7f) * anInt9374 >> 7;
			short i_1129_
			    = Class504.method8313(i_1127_ & ~0x7f | i_1128_,
						  943698901);
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_1123_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_1123_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_1123_]];
			int i_1130_ = (((i * class100.anInt1215
					 + i_1118_ * class100.anInt1217
					 + i_1119_ * class100.anInt1216)
					/ class100.anInt1214)
				       >> 16);
			int i_1131_ = i_1130_ > 256 ? i_1121_ : i_1122_;
			int i_1132_
			    = (i_1120_ >> 1) + (i_1131_ * i_1130_ >> 17);
			anIntArray9391[i_1123_]
			    = i_1132_ << 17 | Class159.method2568(i_1129_,
								  i_1132_,
								  424788015);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_1123_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_1123_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_1123_]];
			i_1130_ = ((i * class100.anInt1215
				    + i_1118_ * class100.anInt1217
				    + i_1119_ * class100.anInt1216)
				   / class100.anInt1214) >> 16;
			i_1131_ = i_1130_ > 256 ? i_1121_ : i_1122_;
			i_1132_ = (i_1120_ >> 1) + (i_1131_ * i_1130_ >> 17);
			anIntArray9392[i_1123_]
			    = i_1132_ << 17 | Class159.method2568(i_1129_,
								  i_1132_,
								  -1957919625);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_1123_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_1123_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_1123_]];
			i_1130_ = ((i * class100.anInt1215
				    + i_1118_ * class100.anInt1217
				    + i_1119_ * class100.anInt1216)
				   / class100.anInt1214) >> 16;
			i_1131_ = i_1130_ > 256 ? i_1121_ : i_1122_;
			i_1132_ = (i_1120_ >> 1) + (i_1131_ * i_1130_ >> 17);
			anIntArray9393[i_1123_]
			    = i_1132_ << 17 | Class159.method2568(i_1129_,
								  i_1132_,
								  712504197);
		    } else if (i_1124_ == 1) {
			int i_1133_ = aShortArray9403[i_1123_] & 0xffff;
			int i_1134_ = (i_1133_ & 0x7f) * anInt9374 >> 7;
			short i_1135_
			    = Class504.method8313(i_1133_ & ~0x7f | i_1134_,
						  216405611);
			Class115 class115 = aClass115Array9398[i_1123_];
			int i_1136_ = ((i * class115.anInt1407
					+ i_1118_ * class115.anInt1408
					+ i_1119_ * class115.anInt1406)
				       >> 16);
			int i_1137_ = i_1136_ > 256 ? i_1121_ : i_1122_;
			int i_1138_
			    = (i_1120_ >> 1) + (i_1137_ * i_1136_ >> 17);
			anIntArray9391[i_1123_]
			    = i_1138_ << 17 | Class159.method2568(i_1135_,
								  i_1138_,
								  1364276175);
			anIntArray9393[i_1123_] = -1;
		    } else if (i_1124_ == 3) {
			anIntArray9391[i_1123_] = 128;
			anIntArray9393[i_1123_] = -1;
		    } else
			anIntArray9393[i_1123_] = -2;
		} else {
		    int i_1139_ = aShortArray9403[i_1123_] & 0xffff;
		    if (i_1124_ == 0) {
			Class100 class100;
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9382[i_1123_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9382[i_1123_]];
			else
			    class100
				= aClass100Array9422[aShortArray9382[i_1123_]];
			int i_1140_ = (((i * class100.anInt1215
					 + i_1118_ * class100.anInt1217
					 + i_1119_ * class100.anInt1216)
					/ class100.anInt1214)
				       >> 16);
			int i_1141_ = i_1140_ > 256 ? i_1121_ : i_1122_;
			int i_1142_
			    = method15072((i_1120_ >> 2) + (i_1141_ * i_1140_
							    >> 18));
			anIntArray9391[i_1123_]
			    = i_1142_ << 24 | method15070(i_1139_, i_1126_,
							  i_1142_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9387[i_1123_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9387[i_1123_]];
			else
			    class100
				= aClass100Array9422[aShortArray9387[i_1123_]];
			i_1140_ = ((i * class100.anInt1215
				    + i_1118_ * class100.anInt1217
				    + i_1119_ * class100.anInt1216)
				   / class100.anInt1214) >> 16;
			i_1141_ = i_1140_ > 256 ? i_1121_ : i_1122_;
			i_1142_
			    = method15072((i_1120_ >> 2) + (i_1141_ * i_1140_
							    >> 18));
			anIntArray9392[i_1123_]
			    = i_1142_ << 24 | method15070(i_1139_, i_1126_,
							  i_1142_);
			if (aClass100Array9371 != null
			    && (aClass100Array9371[aShortArray9388[i_1123_]]
				!= null))
			    class100
				= aClass100Array9371[aShortArray9388[i_1123_]];
			else
			    class100
				= aClass100Array9422[aShortArray9388[i_1123_]];
			i_1140_ = ((i * class100.anInt1215
				    + i_1118_ * class100.anInt1217
				    + i_1119_ * class100.anInt1216)
				   / class100.anInt1214) >> 16;
			i_1141_ = i_1140_ > 256 ? i_1121_ : i_1122_;
			i_1142_
			    = method15072((i_1120_ >> 2) + (i_1141_ * i_1140_
							    >> 18));
			anIntArray9393[i_1123_]
			    = i_1142_ << 24 | method15070(i_1139_, i_1126_,
							  i_1142_);
		    } else if (i_1124_ == 1) {
			Class115 class115 = aClass115Array9398[i_1123_];
			int i_1143_ = ((i * class115.anInt1407
					+ i_1118_ * class115.anInt1408
					+ i_1119_ * class115.anInt1406)
				       >> 16);
			int i_1144_ = i_1143_ > 256 ? i_1121_ : i_1122_;
			int i_1145_
			    = method15072((i_1120_ >> 2) + (i_1144_ * i_1143_
							    >> 18));
			anIntArray9391[i_1123_]
			    = i_1145_ << 24 | method15070(i_1139_, i_1126_,
							  i_1145_);
			anIntArray9393[i_1123_] = -1;
		    } else
			anIntArray9393[i_1123_] = -2;
		}
	    }
	    aClass100Array9422 = null;
	    aClass100Array9371 = null;
	    aClass115Array9398 = null;
	    if ((anInt9373 & 0x97098) == 0 && aFloatArrayArray9401 == null)
		aShortArray9403 = null;
	    if (bool)
		aByteArray9399 = null;
	    anInt9364 = 2;
	}
    }
    
    int method15107(int i, short i_1146_, int i_1147_) {
	int i_1148_ = Class642.anIntArray8324[method15071(i, i_1147_)];
	Class166 class166
	    = aClass182_Sub2_9433.aClass180_1944.method3116(i_1146_ & 0xffff,
							    -1431554601);
	int i_1149_ = class166.aByte1785 & 0xff;
	if (i_1149_ != 0) {
	    int i_1150_ = 131586 * i_1147_;
	    if (i_1149_ == 256)
		i_1148_ = i_1150_;
	    else {
		int i_1151_ = i_1149_;
		int i_1152_ = 256 - i_1149_;
		i_1148_ = ((((i_1150_ & 0xff00ff) * i_1151_
			     + (i_1148_ & 0xff00ff) * i_1152_)
			    & ~0xff00ff)
			   + (((i_1150_ & 0xff00) * i_1151_
			       + (i_1148_ & 0xff00) * i_1152_)
			      & 0xff0000)) >> 8;
	    }
	}
	int i_1153_ = class166.aByte1831 & 0xff;
	if (i_1153_ != 0) {
	    i_1153_ += 256;
	    int i_1154_ = ((i_1148_ & 0xff0000) >> 16) * i_1153_;
	    if (i_1154_ > 65535)
		i_1154_ = 65535;
	    int i_1155_ = ((i_1148_ & 0xff00) >> 8) * i_1153_;
	    if (i_1155_ > 65535)
		i_1155_ = 65535;
	    int i_1156_ = (i_1148_ & 0xff) * i_1153_;
	    if (i_1156_ > 65535)
		i_1156_ = 65535;
	    i_1148_ = (i_1154_ << 8 & 0xff0000) + (i_1155_ & 0xff00) + (i_1156_
									>> 8);
	}
	return i_1148_;
    }
    
    public void method2972(byte i, byte[] is) {
	if ((anInt9373 & 0x100000) == 0)
	    throw new RuntimeException();
	if (aByteArray9406 == null)
	    aByteArray9406 = new byte[anInt9375];
	if (is == null) {
	    for (int i_1157_ = 0; i_1157_ < anInt9375; i_1157_++)
		aByteArray9406[i_1157_] = i;
	} else {
	    for (int i_1158_ = 0; i_1158_ < anInt9375; i_1158_++) {
		int i_1159_ = 255 - ((255 - (is[i_1158_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9406[i_1158_] = (byte) i_1159_;
	    }
	}
	if (anInt9364 == 2)
	    anInt9364 = 1;
    }
    
    int method15108(int i, int i_1160_) {
	i_1160_ = i_1160_ * (i & 0x7f) >> 7;
	if (i_1160_ < 2)
	    i_1160_ = 2;
	else if (i_1160_ > 126)
	    i_1160_ = 126;
	return (i & 0xff80) + i_1160_;
    }
    
    public Class154[] method3085() {
	return aClass154Array9415;
    }
    
    int method15109(int i, int i_1161_) {
	i_1161_ = i_1161_ * (i & 0x7f) >> 7;
	if (i_1161_ < 2)
	    i_1161_ = 2;
	else if (i_1161_ > 126)
	    i_1161_ = 126;
	return (i & 0xff80) + i_1161_;
    }
    
    int method15110(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    public boolean method2920(int i, int i_1162_, Class444 class444,
			      boolean bool, int i_1163_) {
	method15065(aClass182_Sub2_9433.method15223(Thread.currentThread()));
	Class435 class435 = aClass110_9362.aClass435_1340;
	class435.method7040(class444);
	Class435 class435_1164_ = aClass110_9362.aClass435_1341;
	class435_1164_.method6947(class435);
	class435_1164_.method6950(aClass182_Sub2_9433.aClass435_9483);
	boolean bool_1165_ = false;
	int i_1166_ = 2147483647;
	int i_1167_ = -2147483648;
	int i_1168_ = 2147483647;
	int i_1169_ = -2147483648;
	if (!aBool9420)
	    method15092();
	int i_1170_ = aShort9426 - aShort9368 >> 1;
	int i_1171_ = aShort9381 - aShort9423 >> 1;
	int i_1172_ = aShort9432 - aShort9431 >> 1;
	int i_1173_ = aShort9368 + i_1170_;
	int i_1174_ = aShort9423 + i_1171_;
	int i_1175_ = aShort9431 + i_1172_;
	int i_1176_ = i_1173_ - (i_1170_ << i_1163_);
	int i_1177_ = i_1174_ - (i_1171_ << i_1163_);
	int i_1178_ = i_1175_ - (i_1172_ << i_1163_);
	int i_1179_ = i_1173_ + (i_1170_ << i_1163_);
	int i_1180_ = i_1174_ + (i_1171_ << i_1163_);
	int i_1181_ = i_1175_ + (i_1172_ << i_1163_);
	anIntArray9439[0] = i_1176_;
	anIntArray9410[0] = i_1177_;
	anIntArray9384[0] = i_1178_;
	anIntArray9439[1] = i_1179_;
	anIntArray9410[1] = i_1177_;
	anIntArray9384[1] = i_1178_;
	anIntArray9439[2] = i_1176_;
	anIntArray9410[2] = i_1180_;
	anIntArray9384[2] = i_1178_;
	anIntArray9439[3] = i_1179_;
	anIntArray9410[3] = i_1180_;
	anIntArray9384[3] = i_1178_;
	anIntArray9439[4] = i_1176_;
	anIntArray9410[4] = i_1177_;
	anIntArray9384[4] = i_1181_;
	anIntArray9439[5] = i_1179_;
	anIntArray9410[5] = i_1177_;
	anIntArray9384[5] = i_1181_;
	anIntArray9439[6] = i_1176_;
	anIntArray9410[6] = i_1180_;
	anIntArray9384[6] = i_1181_;
	anIntArray9439[7] = i_1179_;
	anIntArray9410[7] = i_1180_;
	anIntArray9384[7] = i_1181_;
	for (int i_1182_ = 0; i_1182_ < 8; i_1182_++) {
	    int i_1183_ = anIntArray9439[i_1182_];
	    int i_1184_ = anIntArray9410[i_1182_];
	    int i_1185_ = anIntArray9384[i_1182_];
	    float f = (class435_1164_.aFloatArray4830[2] * (float) i_1183_
		       + class435_1164_.aFloatArray4830[6] * (float) i_1184_
		       + class435_1164_.aFloatArray4830[10] * (float) i_1185_
		       + class435_1164_.aFloatArray4830[14]);
	    float f_1186_
		= (class435_1164_.aFloatArray4830[3] * (float) i_1183_
		   + class435_1164_.aFloatArray4830[7] * (float) i_1184_
		   + class435_1164_.aFloatArray4830[11] * (float) i_1185_
		   + class435_1164_.aFloatArray4830[15]);
	    if (f >= -f_1186_) {
		float f_1187_
		    = (class435_1164_.aFloatArray4830[0] * (float) i_1183_
		       + class435_1164_.aFloatArray4830[4] * (float) i_1184_
		       + class435_1164_.aFloatArray4830[8] * (float) i_1185_
		       + class435_1164_.aFloatArray4830[12]);
		float f_1188_
		    = (class435_1164_.aFloatArray4830[1] * (float) i_1183_
		       + class435_1164_.aFloatArray4830[5] * (float) i_1184_
		       + class435_1164_.aFloatArray4830[9] * (float) i_1185_
		       + class435_1164_.aFloatArray4830[13]);
		int i_1189_ = (int) (aClass182_Sub2_9433.aFloat9495
				     + (aClass182_Sub2_9433.aFloat9489
					* f_1187_ / f_1186_));
		int i_1190_ = (int) (aClass182_Sub2_9433.aFloat9492
				     + (aClass182_Sub2_9433.aFloat9491
					* f_1188_ / f_1186_));
		if (i_1189_ < i_1166_)
		    i_1166_ = i_1189_;
		if (i_1189_ > i_1167_)
		    i_1167_ = i_1189_;
		if (i_1190_ < i_1168_)
		    i_1168_ = i_1190_;
		if (i_1190_ > i_1169_)
		    i_1169_ = i_1190_;
		bool_1165_ = true;
	    }
	}
	if (bool_1165_ && i > i_1166_ && i < i_1167_ && i_1162_ > i_1168_
	    && i_1162_ < i_1169_) {
	    if (bool)
		return true;
	    for (int i_1191_ = 0; i_1191_ < anInt9394; i_1191_++) {
		int i_1192_ = anIntArray9424[i_1191_];
		int i_1193_ = anIntArray9379[i_1191_];
		int i_1194_ = anIntArray9395[i_1191_];
		float f
		    = (class435_1164_.aFloatArray4830[2] * (float) i_1192_
		       + class435_1164_.aFloatArray4830[6] * (float) i_1193_
		       + class435_1164_.aFloatArray4830[10] * (float) i_1194_
		       + class435_1164_.aFloatArray4830[14]);
		float f_1195_
		    = (class435_1164_.aFloatArray4830[3] * (float) i_1192_
		       + class435_1164_.aFloatArray4830[7] * (float) i_1193_
		       + class435_1164_.aFloatArray4830[11] * (float) i_1194_
		       + class435_1164_.aFloatArray4830[15]);
		if (f >= -f_1195_) {
		    float f_1196_
			= (class435_1164_.aFloatArray4830[0] * (float) i_1192_
			   + (class435_1164_.aFloatArray4830[4]
			      * (float) i_1193_)
			   + (class435_1164_.aFloatArray4830[8]
			      * (float) i_1194_)
			   + class435_1164_.aFloatArray4830[12]);
		    float f_1197_
			= (class435_1164_.aFloatArray4830[1] * (float) i_1192_
			   + (class435_1164_.aFloatArray4830[5]
			      * (float) i_1193_)
			   + (class435_1164_.aFloatArray4830[9]
			      * (float) i_1194_)
			   + class435_1164_.aFloatArray4830[13]);
		    aFloatArray9435[i_1191_]
			= (float) (int) (aClass182_Sub2_9433.aFloat9495
					 + (aClass182_Sub2_9433.aFloat9489
					    * f_1196_ / f_1195_));
		    aFloatArray9400[i_1191_]
			= (float) (int) (aClass182_Sub2_9433.aFloat9492
					 + (aClass182_Sub2_9433.aFloat9491
					    * f_1197_ / f_1195_));
		} else
		    aFloatArray9435[i_1191_] = -999999.0F;
	    }
	    for (int i_1198_ = 0; i_1198_ < anInt9385; i_1198_++) {
		if (aFloatArray9435[aShortArray9382[i_1198_]] != -999999.0F
		    && aFloatArray9435[aShortArray9387[i_1198_]] != -999999.0F
		    && aFloatArray9435[aShortArray9388[i_1198_]] != -999999.0F
		    && method15081(i, i_1162_,
				   aFloatArray9400[aShortArray9382[i_1198_]],
				   aFloatArray9400[aShortArray9387[i_1198_]],
				   aFloatArray9400[aShortArray9388[i_1198_]],
				   aFloatArray9435[aShortArray9382[i_1198_]],
				   aFloatArray9435[aShortArray9387[i_1198_]],
				   aFloatArray9435[aShortArray9388[i_1198_]]))
		    return true;
	    }
	}
	return false;
    }
    
    public void method3058(short i, short i_1199_) {
	if (aShortArray9402 != null) {
	    if (!aBool9380 && i_1199_ >= 0) {
		Class166 class166
		    = aClass182_Sub2_9433.aClass180_1944
			  .method3116(i_1199_ & 0xffff, -1431554601);
		if (class166.aByte1805 != 0 || class166.aByte1806 != 0)
		    aBool9380 = true;
	    }
	    for (int i_1200_ = 0; i_1200_ < anInt9375; i_1200_++) {
		if (aShortArray9402[i_1200_] == i)
		    aShortArray9402[i_1200_] = i_1199_;
	    }
	}
    }
    
    int method15111(int i, int i_1201_) {
	i_1201_ = i_1201_ * (i & 0x7f) >> 7;
	if (i_1201_ < 2)
	    i_1201_ = 2;
	else if (i_1201_ > 126)
	    i_1201_ = 126;
	return (i & 0xff80) + i_1201_;
    }
    
    int method15112(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    int method15113(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    public int method2928() {
	return anInt9373;
    }
    
    void method15114() {
	for (int i = 0; i < anInt9375; i++) {
	    short i_1202_
		= aShortArray9402 != null ? aShortArray9402[i] : (short) -1;
	    if (i_1202_ == -1) {
		int i_1203_ = aShortArray9403[i] & 0xffff;
		int i_1204_ = (i_1203_ & 0x7f) * anInt9374 >> 7;
		short i_1205_ = Class504.method8313(i_1203_ & ~0x7f | i_1204_,
						    993522583);
		if (anIntArray9393[i] == -1) {
		    int i_1206_ = anIntArray9391[i] & ~0x1ffff;
		    anIntArray9391[i]
			= i_1206_ | Class159.method2568(i_1205_, i_1206_ >> 17,
							1049063576);
		} else if (anIntArray9393[i] != -2) {
		    int i_1207_ = anIntArray9391[i] & ~0x1ffff;
		    anIntArray9391[i]
			= i_1207_ | Class159.method2568(i_1205_, i_1207_ >> 17,
							1601424041);
		    i_1207_ = anIntArray9392[i] & ~0x1ffff;
		    anIntArray9392[i]
			= i_1207_ | Class159.method2568(i_1205_, i_1207_ >> 17,
							-224240171);
		    i_1207_ = anIntArray9393[i] & ~0x1ffff;
		    anIntArray9393[i]
			= i_1207_ | Class159.method2568(i_1205_, i_1207_ >> 17,
							229405393);
		}
	    }
	}
	anInt9364 = 2;
    }
    
    public void method3042(int i) {
	if ((anInt9373 & 0x1000) != 4096)
	    throw new IllegalStateException();
	anInt9374 = i;
	anInt9364 = 0;
    }
    
    public void method2983(Class179 class179, int i, int i_1208_, int i_1209_,
			   boolean bool) {
	Class179_Sub2 class179_sub2_1210_ = (Class179_Sub2) class179;
	if ((anInt9373 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((class179_sub2_1210_.anInt9373 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method15065(aClass182_Sub2_9433.method15223(Thread.currentThread()));
	method15092();
	method15080();
	class179_sub2_1210_.method15092();
	class179_sub2_1210_.method15080();
	anInt9407++;
	int i_1211_ = 0;
	int[] is = class179_sub2_1210_.anIntArray9424;
	int i_1212_ = class179_sub2_1210_.anInt9377;
	for (int i_1213_ = 0; i_1213_ < anInt9377; i_1213_++) {
	    Class100 class100 = aClass100Array9422[i_1213_];
	    if (class100.anInt1214 != 0) {
		int i_1214_ = anIntArray9379[i_1213_] - i_1208_;
		if (i_1214_ >= class179_sub2_1210_.aShort9423
		    && i_1214_ <= class179_sub2_1210_.aShort9381) {
		    int i_1215_ = anIntArray9424[i_1213_] - i;
		    if (i_1215_ >= class179_sub2_1210_.aShort9368
			&& i_1215_ <= class179_sub2_1210_.aShort9426) {
			int i_1216_ = anIntArray9395[i_1213_] - i_1209_;
			if (i_1216_ >= class179_sub2_1210_.aShort9431
			    && i_1216_ <= class179_sub2_1210_.aShort9432) {
			    for (int i_1217_ = 0; i_1217_ < i_1212_;
				 i_1217_++) {
				Class100 class100_1218_
				    = (class179_sub2_1210_.aClass100Array9422
				       [i_1217_]);
				if (i_1215_ == is[i_1217_]
				    && i_1216_ == (class179_sub2_1210_
						   .anIntArray9395[i_1217_])
				    && i_1214_ == (class179_sub2_1210_
						   .anIntArray9379[i_1217_])
				    && class100_1218_.anInt1214 != 0) {
				    if (aClass100Array9371 == null)
					aClass100Array9371
					    = new Class100[anInt9377];
				    if (class179_sub2_1210_.aClass100Array9371
					== null)
					class179_sub2_1210_.aClass100Array9371
					    = new Class100[i_1212_];
				    Class100 class100_1219_
					= aClass100Array9371[i_1213_];
				    if (class100_1219_ == null)
					class100_1219_
					    = aClass100Array9371[i_1213_]
					    = new Class100(class100);
				    Class100 class100_1220_
					= (class179_sub2_1210_
					   .aClass100Array9371[i_1217_]);
				    if (class100_1220_ == null)
					class100_1220_
					    = class179_sub2_1210_
						  .aClass100Array9371[i_1217_]
					    = new Class100(class100_1218_);
				    class100_1219_.anInt1215
					+= class100_1218_.anInt1215;
				    class100_1219_.anInt1217
					+= class100_1218_.anInt1217;
				    class100_1219_.anInt1216
					+= class100_1218_.anInt1216;
				    class100_1219_.anInt1214
					+= class100_1218_.anInt1214;
				    class100_1220_.anInt1215
					+= class100.anInt1215;
				    class100_1220_.anInt1217
					+= class100.anInt1217;
				    class100_1220_.anInt1216
					+= class100.anInt1216;
				    class100_1220_.anInt1214
					+= class100.anInt1214;
				    i_1211_++;
				    anIntArray9442[i_1213_] = anInt9407;
				    anIntArray9443[i_1217_] = anInt9407;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_1211_ >= 3 && bool) {
	    for (int i_1221_ = 0; i_1221_ < anInt9375; i_1221_++) {
		if (anIntArray9442[aShortArray9382[i_1221_]] == anInt9407
		    && anIntArray9442[aShortArray9387[i_1221_]] == anInt9407
		    && anIntArray9442[aShortArray9388[i_1221_]] == anInt9407) {
		    if (aByteArray9399 == null)
			aByteArray9399 = new byte[anInt9375];
		    aByteArray9399[i_1221_] = (byte) 2;
		}
	    }
	    for (int i_1222_ = 0; i_1222_ < class179_sub2_1210_.anInt9375;
		 i_1222_++) {
		if (anIntArray9443[(class179_sub2_1210_.aShortArray9382
				    [i_1222_])] == anInt9407
		    && anIntArray9443[(class179_sub2_1210_.aShortArray9387
				       [i_1222_])] == anInt9407
		    && anIntArray9443[(class179_sub2_1210_.aShortArray9388
				       [i_1222_])] == anInt9407) {
		    if (class179_sub2_1210_.aByteArray9399 == null)
			class179_sub2_1210_.aByteArray9399
			    = new byte[class179_sub2_1210_.anInt9375];
		    class179_sub2_1210_.aByteArray9399[i_1222_] = (byte) 2;
		}
	    }
	}
    }
    
    public void method3092() {
	if (!aBool9429) {
	    if (!aBool9420)
		method15092();
	    aShort9430 = aShort9423;
	    aBool9429 = true;
	}
    }
    
    boolean method2947() {
	if (anIntArrayArray9397 == null)
	    return false;
	anInt9425 = 0;
	anInt9411 = 0;
	anInt9412 = 0;
	return true;
    }
    
    public void method3114(int i, int i_1223_, int i_1224_, int i_1225_) {
	if ((anInt9373 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_1226_ = 0; i_1226_ < anInt9375; i_1226_++) {
	    int i_1227_ = aShortArray9403[i_1226_] & 0xffff;
	    int i_1228_ = i_1227_ >> 10 & 0x3f;
	    int i_1229_ = i_1227_ >> 7 & 0x7;
	    int i_1230_ = i_1227_ & 0x7f;
	    if (i != -1)
		i_1228_ += (i - i_1228_) * i_1225_ >> 7;
	    if (i_1223_ != -1)
		i_1229_ += (i_1223_ - i_1229_) * i_1225_ >> 7;
	    if (i_1224_ != -1)
		i_1230_ += (i_1224_ - i_1230_) * i_1225_ >> 7;
	    aShortArray9403[i_1226_]
		= (short) (i_1228_ << 10 | i_1229_ << 7 | i_1230_);
	}
	if (aClass103Array9417 != null) {
	    for (int i_1231_ = 0; i_1231_ < anInt9416; i_1231_++) {
		Class103 class103 = aClass103Array9417[i_1231_];
		Class107 class107 = aClass107Array9441[i_1231_];
		class107.anInt1304
		    = (class107.anInt1304 * -1093122285 & ~0xffffff
		       | ((Class381.anIntArray3929
			   [Class504.method8313((aShortArray9403
						 [(class103.anInt1273
						   * -954563709)]) & 0xffff,
						1553417564) & 0xffff])
			  & 0xffffff)) * 540580635;
	    }
	}
	if (anInt9364 == 2)
	    anInt9364 = 1;
    }
    
    Class179 method15115(Class179_Sub2 class179_sub2_1232_,
			 Class179_Sub2 class179_sub2_1233_, int i,
			 boolean bool, boolean bool_1234_) {
	class179_sub2_1232_.aBool9420 = aBool9420;
	if (aBool9420) {
	    class179_sub2_1232_.aShort9426 = aShort9426;
	    class179_sub2_1232_.aShort9381 = aShort9381;
	    class179_sub2_1232_.aShort9432 = aShort9432;
	    class179_sub2_1232_.aShort9368 = aShort9368;
	    class179_sub2_1232_.aShort9423 = aShort9423;
	    class179_sub2_1232_.aShort9431 = aShort9431;
	    class179_sub2_1232_.aShort9421 = aShort9421;
	    class179_sub2_1232_.aShort9413 = aShort9413;
	}
	if (aBool9429) {
	    class179_sub2_1232_.aShort9430 = aShort9430;
	    class179_sub2_1232_.aBool9429 = true;
	} else
	    class179_sub2_1232_.aBool9429 = false;
	class179_sub2_1232_.anInt9374 = anInt9374;
	class179_sub2_1232_.anInt9383 = anInt9383;
	class179_sub2_1232_.anInt9394 = anInt9394;
	class179_sub2_1232_.anInt9377 = anInt9377;
	class179_sub2_1232_.anInt9375 = anInt9375;
	class179_sub2_1232_.anInt9416 = anInt9416;
	class179_sub2_1232_.anInt9385 = anInt9385;
	if ((i & 0x100) != 0)
	    class179_sub2_1232_.aBool9369 = true;
	else
	    class179_sub2_1232_.aBool9369 = aBool9369;
	class179_sub2_1232_.aBool9380 = aBool9380;
	boolean bool_1235_ = (i & 0x7) == 7 | (i & 0x20) != 0;
	boolean bool_1236_ = bool_1235_ || (i & 0x1) != 0;
	boolean bool_1237_ = bool_1235_ || (i & 0x2) != 0;
	boolean bool_1238_ = bool_1235_ || (i & 0x4) != 0 || (i & 0x10) != 0;
	if (bool_1236_ || bool_1237_ || bool_1238_) {
	    if (bool_1236_) {
		if (class179_sub2_1233_.anIntArray9424 == null
		    || class179_sub2_1233_.anIntArray9424.length < anInt9394)
		    class179_sub2_1232_.anIntArray9424
			= class179_sub2_1233_.anIntArray9424
			= new int[anInt9394];
		else
		    class179_sub2_1232_.anIntArray9424
			= class179_sub2_1233_.anIntArray9424;
		for (int i_1239_ = 0; i_1239_ < anInt9394; i_1239_++)
		    class179_sub2_1232_.anIntArray9424[i_1239_]
			= anIntArray9424[i_1239_];
	    } else
		class179_sub2_1232_.anIntArray9424 = anIntArray9424;
	    if (bool_1237_) {
		if (class179_sub2_1233_.anIntArray9379 == null
		    || class179_sub2_1233_.anIntArray9379.length < anInt9394)
		    class179_sub2_1232_.anIntArray9379
			= class179_sub2_1233_.anIntArray9379
			= new int[anInt9394];
		else
		    class179_sub2_1232_.anIntArray9379
			= class179_sub2_1233_.anIntArray9379;
		for (int i_1240_ = 0; i_1240_ < anInt9394; i_1240_++)
		    class179_sub2_1232_.anIntArray9379[i_1240_]
			= anIntArray9379[i_1240_];
	    } else
		class179_sub2_1232_.anIntArray9379 = anIntArray9379;
	    if (bool_1238_) {
		if (class179_sub2_1233_.anIntArray9395 == null
		    || class179_sub2_1233_.anIntArray9395.length < anInt9394)
		    class179_sub2_1232_.anIntArray9395
			= class179_sub2_1233_.anIntArray9395
			= new int[anInt9394];
		else
		    class179_sub2_1232_.anIntArray9395
			= class179_sub2_1233_.anIntArray9395;
		for (int i_1241_ = 0; i_1241_ < anInt9394; i_1241_++)
		    class179_sub2_1232_.anIntArray9395[i_1241_]
			= anIntArray9395[i_1241_];
	    } else
		class179_sub2_1232_.anIntArray9395 = anIntArray9395;
	} else {
	    class179_sub2_1232_.anIntArray9424 = anIntArray9424;
	    class179_sub2_1232_.anIntArray9379 = anIntArray9379;
	    class179_sub2_1232_.anIntArray9395 = anIntArray9395;
	}
	if ((i & 0x84080) != 0) {
	    if (class179_sub2_1233_.aShortArray9403 == null
		|| class179_sub2_1233_.aShortArray9403.length < anInt9375) {
		int i_1242_ = anInt9375;
		class179_sub2_1232_.aShortArray9403
		    = class179_sub2_1233_.aShortArray9403 = new short[i_1242_];
	    } else
		class179_sub2_1232_.aShortArray9403
		    = class179_sub2_1233_.aShortArray9403;
	    for (int i_1243_ = 0; i_1243_ < anInt9375; i_1243_++)
		class179_sub2_1232_.aShortArray9403[i_1243_]
		    = aShortArray9403[i_1243_];
	} else
	    class179_sub2_1232_.aShortArray9403 = aShortArray9403;
	if ((i & 0x97018) != 0) {
	    class179_sub2_1232_.anInt9364 = 0;
	    Class179_Sub2 class179_sub2_1244_ = class179_sub2_1232_;
	    Class179_Sub2 class179_sub2_1245_ = class179_sub2_1232_;
	    class179_sub2_1232_.anIntArray9393 = null;
	    class179_sub2_1245_.anIntArray9392 = null;
	    class179_sub2_1244_.anIntArray9391 = null;
	} else if ((i & 0x80) != 0) {
	    if (bool_1234_)
		method15068(false);
	    if (anIntArray9391 != null) {
		if (class179_sub2_1233_.anIntArray9391 == null
		    || class179_sub2_1233_.anIntArray9391.length < anInt9375) {
		    int i_1246_ = anInt9375;
		    class179_sub2_1232_.anIntArray9391
			= class179_sub2_1233_.anIntArray9391
			= new int[i_1246_];
		    class179_sub2_1232_.anIntArray9392
			= class179_sub2_1233_.anIntArray9392
			= new int[i_1246_];
		    class179_sub2_1232_.anIntArray9393
			= class179_sub2_1233_.anIntArray9393
			= new int[i_1246_];
		} else {
		    class179_sub2_1232_.anIntArray9391
			= class179_sub2_1233_.anIntArray9391;
		    class179_sub2_1232_.anIntArray9392
			= class179_sub2_1233_.anIntArray9392;
		    class179_sub2_1232_.anIntArray9393
			= class179_sub2_1233_.anIntArray9393;
		}
		for (int i_1247_ = 0; i_1247_ < anInt9375; i_1247_++) {
		    class179_sub2_1232_.anIntArray9391[i_1247_]
			= anIntArray9391[i_1247_];
		    class179_sub2_1232_.anIntArray9392[i_1247_]
			= anIntArray9392[i_1247_];
		    class179_sub2_1232_.anIntArray9393[i_1247_]
			= anIntArray9393[i_1247_];
		}
	    }
	    class179_sub2_1232_.anInt9364 = anInt9364;
	} else {
	    if (bool_1234_)
		method15068(false);
	    class179_sub2_1232_.anIntArray9391 = anIntArray9391;
	    class179_sub2_1232_.anIntArray9392 = anIntArray9392;
	    class179_sub2_1232_.anIntArray9393 = anIntArray9393;
	    class179_sub2_1232_.anInt9364 = anInt9364;
	}
	if ((i & 0x100) != 0) {
	    if (class179_sub2_1233_.aByteArray9406 == null
		|| class179_sub2_1233_.aByteArray9406.length < anInt9375) {
		int i_1248_ = anInt9375;
		class179_sub2_1232_.aByteArray9406
		    = class179_sub2_1233_.aByteArray9406 = new byte[i_1248_];
	    } else
		class179_sub2_1232_.aByteArray9406
		    = class179_sub2_1233_.aByteArray9406;
	    if (aByteArray9406 != null) {
		for (int i_1249_ = 0; i_1249_ < anInt9375; i_1249_++)
		    class179_sub2_1232_.aByteArray9406[i_1249_]
			= aByteArray9406[i_1249_];
	    } else {
		for (int i_1250_ = 0; i_1250_ < anInt9375; i_1250_++)
		    class179_sub2_1232_.aByteArray9406[i_1250_] = (byte) 0;
	    }
	} else
	    class179_sub2_1232_.aByteArray9406 = aByteArray9406;
	if ((i & 0x8) != 0 || (i & 0x10) != 0) {
	    if (class179_sub2_1233_.aClass100Array9422 == null
		|| class179_sub2_1233_.aClass100Array9422.length < anInt9377) {
		int i_1251_ = anInt9377;
		class179_sub2_1232_.aClass100Array9422
		    = class179_sub2_1233_.aClass100Array9422
		    = new Class100[i_1251_];
	    } else
		class179_sub2_1232_.aClass100Array9422
		    = class179_sub2_1233_.aClass100Array9422;
	    if (aClass100Array9422 != null) {
		for (int i_1252_ = 0; i_1252_ < anInt9377; i_1252_++)
		    class179_sub2_1232_.aClass100Array9422[i_1252_]
			= new Class100(aClass100Array9422[i_1252_]);
	    } else
		class179_sub2_1232_.aClass100Array9422 = null;
	    if (aClass115Array9398 != null) {
		if (class179_sub2_1233_.aClass115Array9398 == null
		    || (class179_sub2_1233_.aClass115Array9398.length
			< anInt9375)) {
		    int i_1253_ = anInt9375;
		    class179_sub2_1232_.aClass115Array9398
			= class179_sub2_1233_.aClass115Array9398
			= new Class115[i_1253_];
		} else
		    class179_sub2_1232_.aClass115Array9398
			= class179_sub2_1233_.aClass115Array9398;
		for (int i_1254_ = 0; i_1254_ < anInt9375; i_1254_++)
		    class179_sub2_1232_.aClass115Array9398[i_1254_]
			= (aClass115Array9398[i_1254_] != null
			   ? new Class115(aClass115Array9398[i_1254_]) : null);
	    } else
		class179_sub2_1232_.aClass115Array9398 = null;
	} else {
	    if (bool_1234_)
		method15080();
	    class179_sub2_1232_.aClass100Array9422 = aClass100Array9422;
	    class179_sub2_1232_.aClass115Array9398 = aClass115Array9398;
	}
	if ((i & 0x8000) != 0) {
	    if (aShortArray9402 == null)
		class179_sub2_1232_.aShortArray9402 = null;
	    else {
		if (class179_sub2_1233_.aShortArray9402 == null
		    || (class179_sub2_1233_.aShortArray9402.length
			< anInt9375)) {
		    int i_1255_ = anInt9375;
		    class179_sub2_1232_.aShortArray9402
			= class179_sub2_1233_.aShortArray9402
			= new short[i_1255_];
		} else
		    class179_sub2_1232_.aShortArray9402
			= class179_sub2_1233_.aShortArray9402;
		for (int i_1256_ = 0; i_1256_ < anInt9375; i_1256_++)
		    class179_sub2_1232_.aShortArray9402[i_1256_]
			= aShortArray9402[i_1256_];
	    }
	} else
	    class179_sub2_1232_.aShortArray9402 = aShortArray9402;
	if ((i & 0x10000) != 0) {
	    if (aByteArray9399 == null)
		class179_sub2_1232_.aByteArray9399 = null;
	    else {
		if (class179_sub2_1233_.aByteArray9399 == null
		    || class179_sub2_1233_.aByteArray9399.length < anInt9375) {
		    int i_1257_ = bool ? anInt9375 + 100 : anInt9375;
		    class179_sub2_1232_.aByteArray9399
			= class179_sub2_1233_.aByteArray9399
			= new byte[i_1257_];
		} else
		    class179_sub2_1232_.aByteArray9399
			= class179_sub2_1233_.aByteArray9399;
		for (int i_1258_ = 0; i_1258_ < anInt9375; i_1258_++)
		    class179_sub2_1232_.aByteArray9399[i_1258_]
			= aByteArray9399[i_1258_];
	    }
	} else
	    class179_sub2_1232_.aByteArray9399 = aByteArray9399;
	if ((i & 0xc580) != 0) {
	    if (class179_sub2_1233_.aClass107Array9441 == null
		|| class179_sub2_1233_.aClass107Array9441.length < anInt9416) {
		int i_1259_ = anInt9416;
		class179_sub2_1232_.aClass107Array9441
		    = class179_sub2_1233_.aClass107Array9441
		    = new Class107[i_1259_];
		for (int i_1260_ = 0; i_1260_ < anInt9416; i_1260_++)
		    class179_sub2_1232_.aClass107Array9441[i_1260_]
			= aClass107Array9441[i_1260_].method1918(265815764);
	    } else {
		class179_sub2_1232_.aClass107Array9441
		    = class179_sub2_1233_.aClass107Array9441;
		for (int i_1261_ = 0; i_1261_ < anInt9416; i_1261_++)
		    class179_sub2_1232_.aClass107Array9441[i_1261_]
			.method1919(aClass107Array9441[i_1261_], -2136499870);
	    }
	} else
	    class179_sub2_1232_.aClass107Array9441 = aClass107Array9441;
	if (aFloatArrayArray9401 != null && (i & 0x10) != 0) {
	    if (class179_sub2_1233_.aFloatArrayArray9401 == null
		|| (class179_sub2_1233_.aFloatArrayArray9401.length
		    < anInt9375)) {
		int i_1262_ = bool ? anInt9375 + 100 : anInt9375;
		class179_sub2_1232_.aFloatArrayArray9401
		    = class179_sub2_1233_.aFloatArrayArray9401
		    = new float[i_1262_][3];
	    } else
		class179_sub2_1232_.aFloatArrayArray9401
		    = class179_sub2_1233_.aFloatArrayArray9401;
	    for (int i_1263_ = 0; i_1263_ < anInt9375; i_1263_++) {
		if (aFloatArrayArray9401[i_1263_] != null) {
		    class179_sub2_1232_.aFloatArrayArray9401[i_1263_][0]
			= aFloatArrayArray9401[i_1263_][0];
		    class179_sub2_1232_.aFloatArrayArray9401[i_1263_][1]
			= aFloatArrayArray9401[i_1263_][1];
		    class179_sub2_1232_.aFloatArrayArray9401[i_1263_][2]
			= aFloatArrayArray9401[i_1263_][2];
		}
	    }
	    if (class179_sub2_1233_.aFloatArrayArray9390 == null
		|| (class179_sub2_1233_.aFloatArrayArray9390.length
		    < anInt9375)) {
		int i_1264_ = bool ? anInt9375 + 100 : anInt9375;
		class179_sub2_1232_.aFloatArrayArray9390
		    = class179_sub2_1233_.aFloatArrayArray9390
		    = new float[i_1264_][3];
	    } else
		class179_sub2_1232_.aFloatArrayArray9390
		    = class179_sub2_1233_.aFloatArrayArray9390;
	    for (int i_1265_ = 0; i_1265_ < anInt9375; i_1265_++) {
		if (aFloatArrayArray9390[i_1265_] != null) {
		    class179_sub2_1232_.aFloatArrayArray9390[i_1265_][0]
			= aFloatArrayArray9390[i_1265_][0];
		    class179_sub2_1232_.aFloatArrayArray9390[i_1265_][1]
			= aFloatArrayArray9390[i_1265_][1];
		    class179_sub2_1232_.aFloatArrayArray9390[i_1265_][2]
			= aFloatArrayArray9390[i_1265_][2];
		}
	    }
	} else {
	    class179_sub2_1232_.aFloatArrayArray9401 = aFloatArrayArray9401;
	    class179_sub2_1232_.aFloatArrayArray9390 = aFloatArrayArray9390;
	}
	class179_sub2_1232_.anIntArrayArray9397 = anIntArrayArray9397;
	class179_sub2_1232_.anIntArrayArray9445 = anIntArrayArray9445;
	class179_sub2_1232_.anIntArrayArray9419 = anIntArrayArray9419;
	class179_sub2_1232_.aShortArray9378 = aShortArray9378;
	class179_sub2_1232_.aShortArray9404 = aShortArray9404;
	class179_sub2_1232_.aByteArray9376 = aByteArray9376;
	class179_sub2_1232_.aShortArray9382 = aShortArray9382;
	class179_sub2_1232_.aShortArray9387 = aShortArray9387;
	class179_sub2_1232_.aShortArray9388 = aShortArray9388;
	class179_sub2_1232_.aClass184Array9386 = aClass184Array9386;
	class179_sub2_1232_.aClass154Array9415 = aClass154Array9415;
	class179_sub2_1232_.aClass103Array9417 = aClass103Array9417;
	class179_sub2_1232_.aShortArray9405 = aShortArray9405;
	class179_sub2_1232_.anInt9373 = i;
	return class179_sub2_1232_;
    }
    
    public int method2986() {
	return anInt9373;
    }
    
    public int method2923() {
	return anInt9373;
    }
    
    void method15116() {
	synchronized (this) {
	    for (int i = 0; i < anInt9394; i++) {
		int i_1266_ = anIntArray9424[i];
		anIntArray9424[i] = anIntArray9395[i];
		anIntArray9395[i] = -i_1266_;
	    }
	    method15084();
	}
    }
    
    public int method3078() {
	return anInt9373;
    }
    
    public void method3036(int i) {
	if ((anInt9373 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_1267_ = Class436.anIntArray4831[i];
	int i_1268_ = Class436.anIntArray4838[i];
	synchronized (this) {
	    for (int i_1269_ = 0; i_1269_ < anInt9394; i_1269_++) {
		int i_1270_ = ((anIntArray9379[i_1269_] * i_1268_
				- anIntArray9395[i_1269_] * i_1267_)
			       >> 14);
		anIntArray9395[i_1269_]
		    = (anIntArray9379[i_1269_] * i_1267_
		       + anIntArray9395[i_1269_] * i_1268_) >> 14;
		anIntArray9379[i_1269_] = i_1270_;
	    }
	    method15084();
	}
    }
    
    public void method2991() {
	/* empty */
    }
    
    public void method2992() {
	/* empty */
    }
    
    public int method3038() {
	if (!aBool9420)
	    method15092();
	return aShort9432;
    }
    
    public void method2994(int i) {
	if ((anInt9373 & 0xd) != 13)
	    throw new IllegalStateException();
	if (aClass100Array9422 != null) {
	    if (i == 4096)
		method15078();
	    else if (i == 8192)
		method15079();
	    else if (i == 12288)
		method15140();
	    else {
		int i_1271_ = Class436.anIntArray4831[i];
		int i_1272_ = Class436.anIntArray4838[i];
		synchronized (this) {
		    for (int i_1273_ = 0; i_1273_ < anInt9377; i_1273_++) {
			int i_1274_ = ((anIntArray9395[i_1273_] * i_1271_
					+ anIntArray9424[i_1273_] * i_1272_)
				       >> 14);
			anIntArray9395[i_1273_]
			    = (anIntArray9395[i_1273_] * i_1272_
			       - anIntArray9424[i_1273_] * i_1271_) >> 14;
			anIntArray9424[i_1273_] = i_1274_;
			if (aClass100Array9422[i_1273_] != null) {
			    i_1274_ = ((aClass100Array9422[i_1273_].anInt1216
					* i_1271_)
				       + (aClass100Array9422[i_1273_].anInt1215
					  * i_1272_)) >> 14;
			    aClass100Array9422[i_1273_].anInt1216
				= ((aClass100Array9422[i_1273_].anInt1216
				    * i_1272_)
				   - (aClass100Array9422[i_1273_].anInt1215
				      * i_1271_)) >> 14;
			    aClass100Array9422[i_1273_].anInt1215 = i_1274_;
			}
		    }
		    if (aClass115Array9398 != null) {
			for (int i_1275_ = 0; i_1275_ < anInt9375; i_1275_++) {
			    if (aClass115Array9398[i_1275_] != null) {
				int i_1276_
				    = ((aClass115Array9398[i_1275_].anInt1406
					* i_1271_)
				       + (aClass115Array9398[i_1275_].anInt1407
					  * i_1272_)) >> 14;
				aClass115Array9398[i_1275_].anInt1406
				    = ((aClass115Array9398[i_1275_].anInt1406
					* i_1272_)
				       - (aClass115Array9398[i_1275_].anInt1407
					  * i_1271_)) >> 14;
				aClass115Array9398[i_1275_].anInt1407
				    = i_1276_;
			    }
			}
		    }
		    for (int i_1277_ = anInt9377; i_1277_ < anInt9394;
			 i_1277_++) {
			int i_1278_ = ((anIntArray9395[i_1277_] * i_1271_
					+ anIntArray9424[i_1277_] * i_1272_)
				       >> 14);
			anIntArray9395[i_1277_]
			    = (anIntArray9395[i_1277_] * i_1272_
			       - anIntArray9424[i_1277_] * i_1271_) >> 14;
			anIntArray9424[i_1277_] = i_1278_;
		    }
		    anInt9364 = 0;
		    aBool9420 = false;
		}
	    }
	} else
	    method2930(i);
    }
    
    public void method2995(int i) {
	if ((anInt9373 & 0xd) != 13)
	    throw new IllegalStateException();
	if (aClass100Array9422 != null) {
	    if (i == 4096)
		method15078();
	    else if (i == 8192)
		method15079();
	    else if (i == 12288)
		method15140();
	    else {
		int i_1279_ = Class436.anIntArray4831[i];
		int i_1280_ = Class436.anIntArray4838[i];
		synchronized (this) {
		    for (int i_1281_ = 0; i_1281_ < anInt9377; i_1281_++) {
			int i_1282_ = ((anIntArray9395[i_1281_] * i_1279_
					+ anIntArray9424[i_1281_] * i_1280_)
				       >> 14);
			anIntArray9395[i_1281_]
			    = (anIntArray9395[i_1281_] * i_1280_
			       - anIntArray9424[i_1281_] * i_1279_) >> 14;
			anIntArray9424[i_1281_] = i_1282_;
			if (aClass100Array9422[i_1281_] != null) {
			    i_1282_ = ((aClass100Array9422[i_1281_].anInt1216
					* i_1279_)
				       + (aClass100Array9422[i_1281_].anInt1215
					  * i_1280_)) >> 14;
			    aClass100Array9422[i_1281_].anInt1216
				= ((aClass100Array9422[i_1281_].anInt1216
				    * i_1280_)
				   - (aClass100Array9422[i_1281_].anInt1215
				      * i_1279_)) >> 14;
			    aClass100Array9422[i_1281_].anInt1215 = i_1282_;
			}
		    }
		    if (aClass115Array9398 != null) {
			for (int i_1283_ = 0; i_1283_ < anInt9375; i_1283_++) {
			    if (aClass115Array9398[i_1283_] != null) {
				int i_1284_
				    = ((aClass115Array9398[i_1283_].anInt1406
					* i_1279_)
				       + (aClass115Array9398[i_1283_].anInt1407
					  * i_1280_)) >> 14;
				aClass115Array9398[i_1283_].anInt1406
				    = ((aClass115Array9398[i_1283_].anInt1406
					* i_1280_)
				       - (aClass115Array9398[i_1283_].anInt1407
					  * i_1279_)) >> 14;
				aClass115Array9398[i_1283_].anInt1407
				    = i_1284_;
			    }
			}
		    }
		    for (int i_1285_ = anInt9377; i_1285_ < anInt9394;
			 i_1285_++) {
			int i_1286_ = ((anIntArray9395[i_1285_] * i_1279_
					+ anIntArray9424[i_1285_] * i_1280_)
				       >> 14);
			anIntArray9395[i_1285_]
			    = (anIntArray9395[i_1285_] * i_1280_
			       - anIntArray9424[i_1285_] * i_1279_) >> 14;
			anIntArray9424[i_1285_] = i_1286_;
		    }
		    anInt9364 = 0;
		    aBool9420 = false;
		}
	    }
	} else
	    method2930(i);
    }
    
    public int method3001() {
	if (!aBool9420)
	    method15092();
	return aShort9368;
    }
    
    void method15117() {
	synchronized (this) {
	    for (int i = 0; i < anInt9394; i++) {
		int i_1287_ = anIntArray9424[i];
		anIntArray9424[i] = anIntArray9395[i];
		anIntArray9395[i] = -i_1287_;
	    }
	    method15084();
	}
    }
    
    void method15118() {
	synchronized (this) {
	    for (int i = 0; i < anInt9394; i++) {
		int i_1288_ = anIntArray9424[i];
		anIntArray9424[i] = anIntArray9395[i];
		anIntArray9395[i] = -i_1288_;
	    }
	    method15084();
	}
    }
    
    public void method3047() {
	if (!aBool9429) {
	    if (!aBool9420)
		method15092();
	    aShort9430 = aShort9423;
	    aBool9429 = true;
	}
    }
    
    void method15119() {
	synchronized (this) {
	    for (int i = 0; i < anInt9394; i++) {
		anIntArray9424[i] = -anIntArray9424[i];
		anIntArray9395[i] = -anIntArray9395[i];
	    }
	    method15084();
	}
    }
    
    void method15120() {
	synchronized (this) {
	    for (int i = 0; i < anInt9394; i++) {
		anIntArray9424[i] = -anIntArray9424[i];
		anIntArray9395[i] = -anIntArray9395[i];
	    }
	    method15084();
	}
    }
    
    void method15121() {
	synchronized (this) {
	    for (int i = 0; i < anInt9394; i++) {
		int i_1289_ = anIntArray9395[i];
		anIntArray9395[i] = anIntArray9424[i];
		anIntArray9424[i] = -i_1289_;
	    }
	    method15084();
	}
    }
    
    void method15122() {
	synchronized (this) {
	    for (int i = 0; i < anInt9377; i++) {
		int i_1290_ = anIntArray9424[i];
		anIntArray9424[i] = anIntArray9395[i];
		anIntArray9395[i] = -i_1290_;
		if (aClass100Array9422[i] != null) {
		    i_1290_ = aClass100Array9422[i].anInt1215;
		    aClass100Array9422[i].anInt1215
			= aClass100Array9422[i].anInt1216;
		    aClass100Array9422[i].anInt1216 = -i_1290_;
		}
	    }
	    if (aClass115Array9398 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aClass115Array9398[i] != null) {
			int i_1291_ = aClass115Array9398[i].anInt1407;
			aClass115Array9398[i].anInt1407
			    = aClass115Array9398[i].anInt1406;
			aClass115Array9398[i].anInt1406 = -i_1291_;
		    }
		}
	    }
	    for (int i = anInt9377; i < anInt9394; i++) {
		int i_1292_ = anIntArray9424[i];
		anIntArray9424[i] = anIntArray9395[i];
		anIntArray9395[i] = -i_1292_;
	    }
	    anInt9364 = 0;
	    aBool9420 = false;
	}
    }
    
    void method15123() {
	synchronized (this) {
	    for (int i = 0; i < anInt9377; i++) {
		anIntArray9424[i] = -anIntArray9424[i];
		anIntArray9395[i] = -anIntArray9395[i];
		if (aClass100Array9422[i] != null) {
		    aClass100Array9422[i].anInt1215
			= -aClass100Array9422[i].anInt1215;
		    aClass100Array9422[i].anInt1216
			= -aClass100Array9422[i].anInt1216;
		}
	    }
	    if (aClass115Array9398 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aClass115Array9398[i] != null) {
			aClass115Array9398[i].anInt1407
			    = -aClass115Array9398[i].anInt1407;
			aClass115Array9398[i].anInt1406
			    = -aClass115Array9398[i].anInt1406;
		    }
		}
	    }
	    for (int i = anInt9377; i < anInt9394; i++) {
		anIntArray9424[i] = -anIntArray9424[i];
		anIntArray9395[i] = -anIntArray9395[i];
	    }
	    anInt9364 = 0;
	    aBool9420 = false;
	}
    }
    
    void method15124() {
	synchronized (this) {
	    for (int i = 0; i < anInt9377; i++) {
		anIntArray9424[i] = -anIntArray9424[i];
		anIntArray9395[i] = -anIntArray9395[i];
		if (aClass100Array9422[i] != null) {
		    aClass100Array9422[i].anInt1215
			= -aClass100Array9422[i].anInt1215;
		    aClass100Array9422[i].anInt1216
			= -aClass100Array9422[i].anInt1216;
		}
	    }
	    if (aClass115Array9398 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aClass115Array9398[i] != null) {
			aClass115Array9398[i].anInt1407
			    = -aClass115Array9398[i].anInt1407;
			aClass115Array9398[i].anInt1406
			    = -aClass115Array9398[i].anInt1406;
		    }
		}
	    }
	    for (int i = anInt9377; i < anInt9394; i++) {
		anIntArray9424[i] = -anIntArray9424[i];
		anIntArray9395[i] = -anIntArray9395[i];
	    }
	    anInt9364 = 0;
	    aBool9420 = false;
	}
    }
    
    void method15125() {
	synchronized (this) {
	    for (int i = 0; i < anInt9377; i++) {
		anIntArray9424[i] = -anIntArray9424[i];
		anIntArray9395[i] = -anIntArray9395[i];
		if (aClass100Array9422[i] != null) {
		    aClass100Array9422[i].anInt1215
			= -aClass100Array9422[i].anInt1215;
		    aClass100Array9422[i].anInt1216
			= -aClass100Array9422[i].anInt1216;
		}
	    }
	    if (aClass115Array9398 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aClass115Array9398[i] != null) {
			aClass115Array9398[i].anInt1407
			    = -aClass115Array9398[i].anInt1407;
			aClass115Array9398[i].anInt1406
			    = -aClass115Array9398[i].anInt1406;
		    }
		}
	    }
	    for (int i = anInt9377; i < anInt9394; i++) {
		anIntArray9424[i] = -anIntArray9424[i];
		anIntArray9395[i] = -anIntArray9395[i];
	    }
	    anInt9364 = 0;
	    aBool9420 = false;
	}
    }
    
    void method15126() {
	synchronized (this) {
	    for (int i = 0; i < anInt9377; i++) {
		int i_1293_ = anIntArray9395[i];
		anIntArray9395[i] = anIntArray9424[i];
		anIntArray9424[i] = -i_1293_;
		if (aClass100Array9422[i] != null) {
		    i_1293_ = aClass100Array9422[i].anInt1216;
		    aClass100Array9422[i].anInt1216
			= aClass100Array9422[i].anInt1215;
		    aClass100Array9422[i].anInt1215 = -i_1293_;
		}
	    }
	    if (aClass115Array9398 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aClass115Array9398[i] != null) {
			int i_1294_ = aClass115Array9398[i].anInt1406;
			aClass115Array9398[i].anInt1406
			    = aClass115Array9398[i].anInt1407;
			aClass115Array9398[i].anInt1407 = -i_1294_;
		    }
		}
	    }
	    for (int i = anInt9377; i < anInt9394; i++) {
		int i_1295_ = anIntArray9395[i];
		anIntArray9395[i] = anIntArray9424[i];
		anIntArray9424[i] = -i_1295_;
	    }
	    anInt9364 = 0;
	    aBool9420 = false;
	}
    }
    
    public void method3084(int i) {
	if ((anInt9373 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_1296_ = Class436.anIntArray4831[i];
	int i_1297_ = Class436.anIntArray4838[i];
	synchronized (this) {
	    for (int i_1298_ = 0; i_1298_ < anInt9394; i_1298_++) {
		int i_1299_ = ((anIntArray9379[i_1298_] * i_1297_
				- anIntArray9395[i_1298_] * i_1296_)
			       >> 14);
		anIntArray9395[i_1298_]
		    = (anIntArray9379[i_1298_] * i_1296_
		       + anIntArray9395[i_1298_] * i_1297_) >> 14;
		anIntArray9379[i_1298_] = i_1299_;
	    }
	    method15084();
	}
    }
    
    public void method2998(int i) {
	if ((anInt9373 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_1300_ = Class436.anIntArray4831[i];
	int i_1301_ = Class436.anIntArray4838[i];
	synchronized (this) {
	    for (int i_1302_ = 0; i_1302_ < anInt9394; i_1302_++) {
		int i_1303_ = ((anIntArray9379[i_1302_] * i_1301_
				- anIntArray9395[i_1302_] * i_1300_)
			       >> 14);
		anIntArray9395[i_1302_]
		    = (anIntArray9379[i_1302_] * i_1300_
		       + anIntArray9395[i_1302_] * i_1301_) >> 14;
		anIntArray9379[i_1302_] = i_1303_;
	    }
	    method15084();
	}
    }
    
    public void method2999(int i) {
	if ((anInt9373 & 0x6) != 6)
	    throw new IllegalStateException();
	int i_1304_ = Class436.anIntArray4831[i];
	int i_1305_ = Class436.anIntArray4838[i];
	synchronized (this) {
	    for (int i_1306_ = 0; i_1306_ < anInt9394; i_1306_++) {
		int i_1307_ = ((anIntArray9379[i_1306_] * i_1305_
				- anIntArray9395[i_1306_] * i_1304_)
			       >> 14);
		anIntArray9395[i_1306_]
		    = (anIntArray9379[i_1306_] * i_1304_
		       + anIntArray9395[i_1306_] * i_1305_) >> 14;
		anIntArray9379[i_1306_] = i_1307_;
	    }
	    method15084();
	}
    }
    
    public void method3068(Class179 class179, int i, int i_1308_, int i_1309_,
			   boolean bool) {
	Class179_Sub2 class179_sub2_1310_ = (Class179_Sub2) class179;
	if ((anInt9373 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((class179_sub2_1310_.anInt9373 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method15065(aClass182_Sub2_9433.method15223(Thread.currentThread()));
	method15092();
	method15080();
	class179_sub2_1310_.method15092();
	class179_sub2_1310_.method15080();
	anInt9407++;
	int i_1311_ = 0;
	int[] is = class179_sub2_1310_.anIntArray9424;
	int i_1312_ = class179_sub2_1310_.anInt9377;
	for (int i_1313_ = 0; i_1313_ < anInt9377; i_1313_++) {
	    Class100 class100 = aClass100Array9422[i_1313_];
	    if (class100.anInt1214 != 0) {
		int i_1314_ = anIntArray9379[i_1313_] - i_1308_;
		if (i_1314_ >= class179_sub2_1310_.aShort9423
		    && i_1314_ <= class179_sub2_1310_.aShort9381) {
		    int i_1315_ = anIntArray9424[i_1313_] - i;
		    if (i_1315_ >= class179_sub2_1310_.aShort9368
			&& i_1315_ <= class179_sub2_1310_.aShort9426) {
			int i_1316_ = anIntArray9395[i_1313_] - i_1309_;
			if (i_1316_ >= class179_sub2_1310_.aShort9431
			    && i_1316_ <= class179_sub2_1310_.aShort9432) {
			    for (int i_1317_ = 0; i_1317_ < i_1312_;
				 i_1317_++) {
				Class100 class100_1318_
				    = (class179_sub2_1310_.aClass100Array9422
				       [i_1317_]);
				if (i_1315_ == is[i_1317_]
				    && i_1316_ == (class179_sub2_1310_
						   .anIntArray9395[i_1317_])
				    && i_1314_ == (class179_sub2_1310_
						   .anIntArray9379[i_1317_])
				    && class100_1318_.anInt1214 != 0) {
				    if (aClass100Array9371 == null)
					aClass100Array9371
					    = new Class100[anInt9377];
				    if (class179_sub2_1310_.aClass100Array9371
					== null)
					class179_sub2_1310_.aClass100Array9371
					    = new Class100[i_1312_];
				    Class100 class100_1319_
					= aClass100Array9371[i_1313_];
				    if (class100_1319_ == null)
					class100_1319_
					    = aClass100Array9371[i_1313_]
					    = new Class100(class100);
				    Class100 class100_1320_
					= (class179_sub2_1310_
					   .aClass100Array9371[i_1317_]);
				    if (class100_1320_ == null)
					class100_1320_
					    = class179_sub2_1310_
						  .aClass100Array9371[i_1317_]
					    = new Class100(class100_1318_);
				    class100_1319_.anInt1215
					+= class100_1318_.anInt1215;
				    class100_1319_.anInt1217
					+= class100_1318_.anInt1217;
				    class100_1319_.anInt1216
					+= class100_1318_.anInt1216;
				    class100_1319_.anInt1214
					+= class100_1318_.anInt1214;
				    class100_1320_.anInt1215
					+= class100.anInt1215;
				    class100_1320_.anInt1217
					+= class100.anInt1217;
				    class100_1320_.anInt1216
					+= class100.anInt1216;
				    class100_1320_.anInt1214
					+= class100.anInt1214;
				    i_1311_++;
				    anIntArray9442[i_1313_] = anInt9407;
				    anIntArray9443[i_1317_] = anInt9407;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i_1311_ >= 3 && bool) {
	    for (int i_1321_ = 0; i_1321_ < anInt9375; i_1321_++) {
		if (anIntArray9442[aShortArray9382[i_1321_]] == anInt9407
		    && anIntArray9442[aShortArray9387[i_1321_]] == anInt9407
		    && anIntArray9442[aShortArray9388[i_1321_]] == anInt9407) {
		    if (aByteArray9399 == null)
			aByteArray9399 = new byte[anInt9375];
		    aByteArray9399[i_1321_] = (byte) 2;
		}
	    }
	    for (int i_1322_ = 0; i_1322_ < class179_sub2_1310_.anInt9375;
		 i_1322_++) {
		if (anIntArray9443[(class179_sub2_1310_.aShortArray9382
				    [i_1322_])] == anInt9407
		    && anIntArray9443[(class179_sub2_1310_.aShortArray9387
				       [i_1322_])] == anInt9407
		    && anIntArray9443[(class179_sub2_1310_.aShortArray9388
				       [i_1322_])] == anInt9407) {
		    if (class179_sub2_1310_.aByteArray9399 == null)
			class179_sub2_1310_.aByteArray9399
			    = new byte[class179_sub2_1310_.anInt9375];
		    class179_sub2_1310_.aByteArray9399[i_1322_] = (byte) 2;
		}
	    }
	}
    }
    
    public void method3062(int i) {
	if ((anInt9373 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_1323_ = Class436.anIntArray4831[i];
	int i_1324_ = Class436.anIntArray4838[i];
	synchronized (this) {
	    for (int i_1325_ = 0; i_1325_ < anInt9394; i_1325_++) {
		int i_1326_ = ((anIntArray9379[i_1325_] * i_1323_
				+ anIntArray9424[i_1325_] * i_1324_)
			       >> 14);
		anIntArray9379[i_1325_]
		    = (anIntArray9379[i_1325_] * i_1324_
		       - anIntArray9424[i_1325_] * i_1323_) >> 14;
		anIntArray9424[i_1325_] = i_1326_;
	    }
	    method15084();
	}
    }
    
    public void method3011(int i) {
	if ((anInt9373 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_1327_ = Class436.anIntArray4831[i];
	int i_1328_ = Class436.anIntArray4838[i];
	synchronized (this) {
	    for (int i_1329_ = 0; i_1329_ < anInt9394; i_1329_++) {
		int i_1330_ = ((anIntArray9379[i_1329_] * i_1327_
				+ anIntArray9424[i_1329_] * i_1328_)
			       >> 14);
		anIntArray9379[i_1329_]
		    = (anIntArray9379[i_1329_] * i_1328_
		       - anIntArray9424[i_1329_] * i_1327_) >> 14;
		anIntArray9424[i_1329_] = i_1330_;
	    }
	    method15084();
	}
    }
    
    public void method3004(int i) {
	if ((anInt9373 & 0x3) != 3)
	    throw new IllegalStateException();
	int i_1331_ = Class436.anIntArray4831[i];
	int i_1332_ = Class436.anIntArray4838[i];
	synchronized (this) {
	    for (int i_1333_ = 0; i_1333_ < anInt9394; i_1333_++) {
		int i_1334_ = ((anIntArray9379[i_1333_] * i_1331_
				+ anIntArray9424[i_1333_] * i_1332_)
			       >> 14);
		anIntArray9379[i_1333_]
		    = (anIntArray9379[i_1333_] * i_1332_
		       - anIntArray9424[i_1333_] * i_1331_) >> 14;
		anIntArray9424[i_1333_] = i_1334_;
	    }
	    method15084();
	}
    }
    
    public void method2965(int i, int i_1335_, int i_1336_) {
	if (i != 128 && (anInt9373 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_1335_ != 128 && (anInt9373 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_1336_ != 128 && (anInt9373 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_1337_ = 0; i_1337_ < anInt9394; i_1337_++) {
		anIntArray9424[i_1337_] = anIntArray9424[i_1337_] * i >> 7;
		anIntArray9379[i_1337_]
		    = anIntArray9379[i_1337_] * i_1335_ >> 7;
		anIntArray9395[i_1337_]
		    = anIntArray9395[i_1337_] * i_1336_ >> 7;
	    }
	    aBool9420 = false;
	}
    }
    
    public void method3005(int i, int i_1338_, int i_1339_) {
	if (i != 128 && (anInt9373 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_1338_ != 128 && (anInt9373 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_1339_ != 128 && (anInt9373 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_1340_ = 0; i_1340_ < anInt9394; i_1340_++) {
		anIntArray9424[i_1340_] = anIntArray9424[i_1340_] * i >> 7;
		anIntArray9379[i_1340_]
		    = anIntArray9379[i_1340_] * i_1338_ >> 7;
		anIntArray9395[i_1340_]
		    = anIntArray9395[i_1340_] * i_1339_ >> 7;
	    }
	    aBool9420 = false;
	}
    }
    
    void method15127() {
	aClass100Array9422 = null;
	aClass100Array9371 = null;
	aClass115Array9398 = null;
	aBool9420 = false;
    }
    
    void method15128() {
	aClass100Array9422 = null;
	aClass100Array9371 = null;
	aClass115Array9398 = null;
	aBool9420 = false;
    }
    
    void method15129() {
	aClass100Array9422 = null;
	aClass100Array9371 = null;
	aClass115Array9398 = null;
	aBool9420 = false;
    }
    
    void method3006() {
	if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		while (aBool1916) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1916 = true;
	    }
	}
    }
    
    void method3007() {
	if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		while (aBool1916) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		aBool1916 = true;
	    }
	}
    }
    
    void method3008() {
	if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		aBool1916 = false;
		this.notifyAll();
	    }
	}
    }
    
    public int method2963() {
	if (!aBool9420)
	    method15092();
	return aShort9432;
    }
    
    void method3027() {
	if (aBool9409) {
	    for (int i = 0; i < anInt9394; i++) {
		anIntArray9424[i] = anIntArray9424[i] + 7 >> 4;
		anIntArray9379[i] = anIntArray9379[i] + 7 >> 4;
		anIntArray9395[i] = anIntArray9395[i] + 7 >> 4;
	    }
	    aBool9409 = false;
	}
	if (aBool9408) {
	    method15073();
	    aBool9408 = false;
	}
	aBool9420 = false;
    }
    
    void method3108() {
	if (aBool9409) {
	    for (int i = 0; i < anInt9394; i++) {
		anIntArray9424[i] = anIntArray9424[i] + 7 >> 4;
		anIntArray9379[i] = anIntArray9379[i] + 7 >> 4;
		anIntArray9395[i] = anIntArray9395[i] + 7 >> 4;
	    }
	    aBool9409 = false;
	}
	if (aBool9408) {
	    method15073();
	    aBool9408 = false;
	}
	aBool9420 = false;
    }
    
    void method3012(int i, int[] is, int i_1341_, int i_1342_, int i_1343_,
		    int i_1344_, boolean bool) {
	int i_1345_ = is.length;
	if (i == 0) {
	    i_1341_ <<= 4;
	    i_1342_ <<= 4;
	    i_1343_ <<= 4;
	    if (!aBool9409) {
		for (int i_1346_ = 0; i_1346_ < anInt9394; i_1346_++) {
		    anIntArray9424[i_1346_] <<= 4;
		    anIntArray9379[i_1346_] <<= 4;
		    anIntArray9395[i_1346_] <<= 4;
		}
		aBool9409 = true;
	    }
	    int i_1347_ = 0;
	    anInt9425 = 0;
	    anInt9411 = 0;
	    anInt9412 = 0;
	    for (int i_1348_ = 0; i_1348_ < i_1345_; i_1348_++) {
		int i_1349_ = is[i_1348_];
		if (i_1349_ < anIntArrayArray9397.length) {
		    int[] is_1350_ = anIntArrayArray9397[i_1349_];
		    for (int i_1351_ = 0; i_1351_ < is_1350_.length;
			 i_1351_++) {
			int i_1352_ = is_1350_[i_1351_];
			anInt9425 += anIntArray9424[i_1352_];
			anInt9411 += anIntArray9379[i_1352_];
			anInt9412 += anIntArray9395[i_1352_];
			i_1347_++;
		    }
		}
	    }
	    if (i_1347_ > 0) {
		anInt9425 = anInt9425 / i_1347_ + i_1341_;
		anInt9411 = anInt9411 / i_1347_ + i_1342_;
		anInt9412 = anInt9412 / i_1347_ + i_1343_;
	    } else {
		anInt9425 = i_1341_;
		anInt9411 = i_1342_;
		anInt9412 = i_1343_;
	    }
	} else if (i == 1) {
	    i_1341_ <<= 4;
	    i_1342_ <<= 4;
	    i_1343_ <<= 4;
	    if (!aBool9409) {
		for (int i_1353_ = 0; i_1353_ < anInt9394; i_1353_++) {
		    anIntArray9424[i_1353_] <<= 4;
		    anIntArray9379[i_1353_] <<= 4;
		    anIntArray9395[i_1353_] <<= 4;
		}
		aBool9409 = true;
	    }
	    for (int i_1354_ = 0; i_1354_ < i_1345_; i_1354_++) {
		int i_1355_ = is[i_1354_];
		if (i_1355_ < anIntArrayArray9397.length) {
		    int[] is_1356_ = anIntArrayArray9397[i_1355_];
		    for (int i_1357_ = 0; i_1357_ < is_1356_.length;
			 i_1357_++) {
			int i_1358_ = is_1356_[i_1357_];
			anIntArray9424[i_1358_] += i_1341_;
			anIntArray9379[i_1358_] += i_1342_;
			anIntArray9395[i_1358_] += i_1343_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_1359_ = 0; i_1359_ < i_1345_; i_1359_++) {
		int i_1360_ = is[i_1359_];
		if (i_1360_ < anIntArrayArray9397.length) {
		    int[] is_1361_ = anIntArrayArray9397[i_1360_];
		    if ((i_1344_ & 0x1) == 0) {
			for (int i_1362_ = 0; i_1362_ < is_1361_.length;
			     i_1362_++) {
			    int i_1363_ = is_1361_[i_1362_];
			    anIntArray9424[i_1363_] -= anInt9425;
			    anIntArray9379[i_1363_] -= anInt9411;
			    anIntArray9395[i_1363_] -= anInt9412;
			    if (i_1343_ != 0) {
				int i_1364_ = Class436.anIntArray4831[i_1343_];
				int i_1365_ = Class436.anIntArray4838[i_1343_];
				int i_1366_
				    = ((anIntArray9379[i_1363_] * i_1364_
					+ anIntArray9424[i_1363_] * i_1365_
					+ 16383)
				       >> 14);
				anIntArray9379[i_1363_]
				    = (anIntArray9379[i_1363_] * i_1365_
				       - anIntArray9424[i_1363_] * i_1364_
				       + 16383) >> 14;
				anIntArray9424[i_1363_] = i_1366_;
			    }
			    if (i_1341_ != 0) {
				int i_1367_ = Class436.anIntArray4831[i_1341_];
				int i_1368_ = Class436.anIntArray4838[i_1341_];
				int i_1369_
				    = ((anIntArray9379[i_1363_] * i_1368_
					- anIntArray9395[i_1363_] * i_1367_
					+ 16383)
				       >> 14);
				anIntArray9395[i_1363_]
				    = (anIntArray9379[i_1363_] * i_1367_
				       + anIntArray9395[i_1363_] * i_1368_
				       + 16383) >> 14;
				anIntArray9379[i_1363_] = i_1369_;
			    }
			    if (i_1342_ != 0) {
				int i_1370_ = Class436.anIntArray4831[i_1342_];
				int i_1371_ = Class436.anIntArray4838[i_1342_];
				int i_1372_
				    = ((anIntArray9395[i_1363_] * i_1370_
					+ anIntArray9424[i_1363_] * i_1371_
					+ 16383)
				       >> 14);
				anIntArray9395[i_1363_]
				    = (anIntArray9395[i_1363_] * i_1371_
				       - anIntArray9424[i_1363_] * i_1370_
				       + 16383) >> 14;
				anIntArray9424[i_1363_] = i_1372_;
			    }
			    anIntArray9424[i_1363_] += anInt9425;
			    anIntArray9379[i_1363_] += anInt9411;
			    anIntArray9395[i_1363_] += anInt9412;
			}
		    } else {
			for (int i_1373_ = 0; i_1373_ < is_1361_.length;
			     i_1373_++) {
			    int i_1374_ = is_1361_[i_1373_];
			    anIntArray9424[i_1374_] -= anInt9425;
			    anIntArray9379[i_1374_] -= anInt9411;
			    anIntArray9395[i_1374_] -= anInt9412;
			    if (i_1341_ != 0) {
				int i_1375_ = Class436.anIntArray4831[i_1341_];
				int i_1376_ = Class436.anIntArray4838[i_1341_];
				int i_1377_
				    = ((anIntArray9379[i_1374_] * i_1376_
					- anIntArray9395[i_1374_] * i_1375_
					+ 16383)
				       >> 14);
				anIntArray9395[i_1374_]
				    = (anIntArray9379[i_1374_] * i_1375_
				       + anIntArray9395[i_1374_] * i_1376_
				       + 16383) >> 14;
				anIntArray9379[i_1374_] = i_1377_;
			    }
			    if (i_1343_ != 0) {
				int i_1378_ = Class436.anIntArray4831[i_1343_];
				int i_1379_ = Class436.anIntArray4838[i_1343_];
				int i_1380_
				    = ((anIntArray9379[i_1374_] * i_1378_
					+ anIntArray9424[i_1374_] * i_1379_
					+ 16383)
				       >> 14);
				anIntArray9379[i_1374_]
				    = (anIntArray9379[i_1374_] * i_1379_
				       - anIntArray9424[i_1374_] * i_1378_
				       + 16383) >> 14;
				anIntArray9424[i_1374_] = i_1380_;
			    }
			    if (i_1342_ != 0) {
				int i_1381_ = Class436.anIntArray4831[i_1342_];
				int i_1382_ = Class436.anIntArray4838[i_1342_];
				int i_1383_
				    = ((anIntArray9395[i_1374_] * i_1381_
					+ anIntArray9424[i_1374_] * i_1382_
					+ 16383)
				       >> 14);
				anIntArray9395[i_1374_]
				    = (anIntArray9395[i_1374_] * i_1382_
				       - anIntArray9424[i_1374_] * i_1381_
				       + 16383) >> 14;
				anIntArray9424[i_1374_] = i_1383_;
			    }
			    anIntArray9424[i_1374_] += anInt9425;
			    anIntArray9379[i_1374_] += anInt9411;
			    anIntArray9395[i_1374_] += anInt9412;
			}
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_1384_ = 0; i_1384_ < i_1345_; i_1384_++) {
		int i_1385_ = is[i_1384_];
		if (i_1385_ < anIntArrayArray9397.length) {
		    int[] is_1386_ = anIntArrayArray9397[i_1385_];
		    for (int i_1387_ = 0; i_1387_ < is_1386_.length;
			 i_1387_++) {
			int i_1388_ = is_1386_[i_1387_];
			anIntArray9424[i_1388_] -= anInt9425;
			anIntArray9379[i_1388_] -= anInt9411;
			anIntArray9395[i_1388_] -= anInt9412;
			anIntArray9424[i_1388_]
			    = anIntArray9424[i_1388_] * i_1341_ / 128;
			anIntArray9379[i_1388_]
			    = anIntArray9379[i_1388_] * i_1342_ / 128;
			anIntArray9395[i_1388_]
			    = anIntArray9395[i_1388_] * i_1343_ / 128;
			anIntArray9424[i_1388_] += anInt9425;
			anIntArray9379[i_1388_] += anInt9411;
			anIntArray9395[i_1388_] += anInt9412;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9445 != null && aByteArray9406 != null) {
		for (int i_1389_ = 0; i_1389_ < i_1345_; i_1389_++) {
		    int i_1390_ = is[i_1389_];
		    if (i_1390_ < anIntArrayArray9445.length) {
			int[] is_1391_ = anIntArrayArray9445[i_1390_];
			for (int i_1392_ = 0; i_1392_ < is_1391_.length;
			     i_1392_++) {
			    int i_1393_ = is_1391_[i_1392_];
			    int i_1394_ = ((aByteArray9406[i_1393_] & 0xff)
					   + i_1341_ * 8);
			    if (i_1394_ < 0)
				i_1394_ = 0;
			    else if (i_1394_ > 255)
				i_1394_ = 255;
			    aByteArray9406[i_1393_] = (byte) i_1394_;
			}
		    }
		}
		if (aClass103Array9417 != null) {
		    for (int i_1395_ = 0; i_1395_ < anInt9416; i_1395_++) {
			Class103 class103 = aClass103Array9417[i_1395_];
			Class107 class107 = aClass107Array9441[i_1395_];
			class107.anInt1304
			    = (class107.anInt1304 * -1093122285 & 0xffffff
			       | 255 - ((aByteArray9406
					 [class103.anInt1273 * -954563709])
					& 0xff) << 24) * 540580635;
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9445 != null) {
		for (int i_1396_ = 0; i_1396_ < i_1345_; i_1396_++) {
		    int i_1397_ = is[i_1396_];
		    if (i_1397_ < anIntArrayArray9445.length) {
			int[] is_1398_ = anIntArrayArray9445[i_1397_];
			for (int i_1399_ = 0; i_1399_ < is_1398_.length;
			     i_1399_++) {
			    int i_1400_ = is_1398_[i_1399_];
			    int i_1401_ = aShortArray9403[i_1400_] & 0xffff;
			    int i_1402_ = i_1401_ >> 10 & 0x3f;
			    int i_1403_ = i_1401_ >> 7 & 0x7;
			    int i_1404_ = i_1401_ & 0x7f;
			    i_1402_ = i_1402_ + i_1341_ & 0x3f;
			    i_1403_ += i_1342_;
			    if (i_1403_ < 0)
				i_1403_ = 0;
			    else if (i_1403_ > 7)
				i_1403_ = 7;
			    i_1404_ += i_1343_;
			    if (i_1404_ < 0)
				i_1404_ = 0;
			    else if (i_1404_ > 127)
				i_1404_ = 127;
			    aShortArray9403[i_1400_]
				= (short) (i_1402_ << 10 | i_1403_ << 7
					   | i_1404_);
			}
			aBool9408 = true;
		    }
		}
		if (aClass103Array9417 != null) {
		    for (int i_1405_ = 0; i_1405_ < anInt9416; i_1405_++) {
			Class103 class103 = aClass103Array9417[i_1405_];
			Class107 class107 = aClass107Array9441[i_1405_];
			class107.anInt1304
			    = (class107.anInt1304 * -1093122285 & ~0xffffff
			       | ((Class381.anIntArray3929
				   [Class504.method8313(((aShortArray9403
							  [(class103.anInt1273
							    * -954563709)])
							 & 0xffff),
							1804857429) & 0xffff])
				  & 0xffffff)) * 540580635;
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9419 != null) {
		for (int i_1406_ = 0; i_1406_ < i_1345_; i_1406_++) {
		    int i_1407_ = is[i_1406_];
		    if (i_1407_ < anIntArrayArray9419.length) {
			int[] is_1408_ = anIntArrayArray9419[i_1407_];
			for (int i_1409_ = 0; i_1409_ < is_1408_.length;
			     i_1409_++) {
			    Class107 class107
				= aClass107Array9441[is_1408_[i_1409_]];
			    class107.anInt1297 += i_1341_ * -1780640007;
			    class107.anInt1298 += i_1342_ * -1349044133;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9419 != null) {
		for (int i_1410_ = 0; i_1410_ < i_1345_; i_1410_++) {
		    int i_1411_ = is[i_1410_];
		    if (i_1411_ < anIntArrayArray9419.length) {
			int[] is_1412_ = anIntArrayArray9419[i_1411_];
			for (int i_1413_ = 0; i_1413_ < is_1412_.length;
			     i_1413_++) {
			    Class107 class107
				= aClass107Array9441[is_1412_[i_1413_]];
			    class107.aFloat1295 = (class107.aFloat1295
						   * (float) i_1341_ / 128.0F);
			    class107.aFloat1296 = (class107.aFloat1296
						   * (float) i_1342_ / 128.0F);
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9419 != null) {
		for (int i_1414_ = 0; i_1414_ < i_1345_; i_1414_++) {
		    int i_1415_ = is[i_1414_];
		    if (i_1415_ < anIntArrayArray9419.length) {
			int[] is_1416_ = anIntArrayArray9419[i_1415_];
			for (int i_1417_ = 0; i_1417_ < is_1416_.length;
			     i_1417_++) {
			    Class107 class107
				= aClass107Array9441[is_1416_[i_1417_]];
			    class107.anInt1299
				= (class107.anInt1299 * -1829505101 + i_1341_
				   & 0x3fff) * -412512389;
			}
		    }
		}
	    }
	}
    }
    
    public void method3052(short i, short i_1418_) {
	for (int i_1419_ = 0; i_1419_ < anInt9375; i_1419_++) {
	    if (aShortArray9403[i_1419_] == i)
		aShortArray9403[i_1419_] = i_1418_;
	}
	if (aClass103Array9417 != null) {
	    for (int i_1420_ = 0; i_1420_ < anInt9416; i_1420_++) {
		Class103 class103 = aClass103Array9417[i_1420_];
		Class107 class107 = aClass107Array9441[i_1420_];
		class107.anInt1304
		    = (class107.anInt1304 * -1093122285 & ~0xffffff
		       | ((Class381.anIntArray3929
			   [Class504.method8313((aShortArray9403
						 [(class103.anInt1273
						   * -954563709)]),
						716692968) & 0xffff])
			  & 0xffffff)) * 540580635;
	    }
	}
	if (anInt9364 == 2)
	    anInt9364 = 1;
    }
    
    void method3000(int i, int i_1421_, int i_1422_, int i_1423_) {
	if (i == 0) {
	    int i_1424_ = 0;
	    anInt9425 = 0;
	    anInt9411 = 0;
	    anInt9412 = 0;
	    for (int i_1425_ = 0; i_1425_ < anInt9394; i_1425_++) {
		anInt9425 += anIntArray9424[i_1425_];
		anInt9411 += anIntArray9379[i_1425_];
		anInt9412 += anIntArray9395[i_1425_];
		i_1424_++;
	    }
	    if (i_1424_ > 0) {
		anInt9425 = anInt9425 / i_1424_ + i_1421_;
		anInt9411 = anInt9411 / i_1424_ + i_1422_;
		anInt9412 = anInt9412 / i_1424_ + i_1423_;
	    } else {
		anInt9425 = i_1421_;
		anInt9411 = i_1422_;
		anInt9412 = i_1423_;
	    }
	} else if (i == 1) {
	    for (int i_1426_ = 0; i_1426_ < anInt9394; i_1426_++) {
		anIntArray9424[i_1426_] += i_1421_;
		anIntArray9379[i_1426_] += i_1422_;
		anIntArray9395[i_1426_] += i_1423_;
	    }
	} else if (i == 2) {
	    for (int i_1427_ = 0; i_1427_ < anInt9394; i_1427_++) {
		anIntArray9424[i_1427_] -= anInt9425;
		anIntArray9379[i_1427_] -= anInt9411;
		anIntArray9395[i_1427_] -= anInt9412;
		if (i_1423_ != 0) {
		    int i_1428_ = Class436.anIntArray4831[i_1423_];
		    int i_1429_ = Class436.anIntArray4838[i_1423_];
		    int i_1430_
			= ((anIntArray9379[i_1427_] * i_1428_
			    + anIntArray9424[i_1427_] * i_1429_ + 16383)
			   >> 14);
		    anIntArray9379[i_1427_]
			= (anIntArray9379[i_1427_] * i_1429_
			   - anIntArray9424[i_1427_] * i_1428_ + 16383) >> 14;
		    anIntArray9424[i_1427_] = i_1430_;
		}
		if (i_1421_ != 0) {
		    int i_1431_ = Class436.anIntArray4831[i_1421_];
		    int i_1432_ = Class436.anIntArray4838[i_1421_];
		    int i_1433_
			= ((anIntArray9379[i_1427_] * i_1432_
			    - anIntArray9395[i_1427_] * i_1431_ + 16383)
			   >> 14);
		    anIntArray9395[i_1427_]
			= (anIntArray9379[i_1427_] * i_1431_
			   + anIntArray9395[i_1427_] * i_1432_ + 16383) >> 14;
		    anIntArray9379[i_1427_] = i_1433_;
		}
		if (i_1422_ != 0) {
		    int i_1434_ = Class436.anIntArray4831[i_1422_];
		    int i_1435_ = Class436.anIntArray4838[i_1422_];
		    int i_1436_
			= ((anIntArray9395[i_1427_] * i_1434_
			    + anIntArray9424[i_1427_] * i_1435_ + 16383)
			   >> 14);
		    anIntArray9395[i_1427_]
			= (anIntArray9395[i_1427_] * i_1435_
			   - anIntArray9424[i_1427_] * i_1434_ + 16383) >> 14;
		    anIntArray9424[i_1427_] = i_1436_;
		}
		anIntArray9424[i_1427_] += anInt9425;
		anIntArray9379[i_1427_] += anInt9411;
		anIntArray9395[i_1427_] += anInt9412;
	    }
	} else if (i == 3) {
	    for (int i_1437_ = 0; i_1437_ < anInt9394; i_1437_++) {
		anIntArray9424[i_1437_] -= anInt9425;
		anIntArray9379[i_1437_] -= anInt9411;
		anIntArray9395[i_1437_] -= anInt9412;
		anIntArray9424[i_1437_]
		    = anIntArray9424[i_1437_] * i_1421_ / 128;
		anIntArray9379[i_1437_]
		    = anIntArray9379[i_1437_] * i_1422_ / 128;
		anIntArray9395[i_1437_]
		    = anIntArray9395[i_1437_] * i_1423_ / 128;
		anIntArray9424[i_1437_] += anInt9425;
		anIntArray9379[i_1437_] += anInt9411;
		anIntArray9395[i_1437_] += anInt9412;
	    }
	} else if (i == 5) {
	    for (int i_1438_ = 0; i_1438_ < anInt9375; i_1438_++) {
		int i_1439_ = (aByteArray9406[i_1438_] & 0xff) + i_1421_ * 8;
		if (i_1439_ < 0)
		    i_1439_ = 0;
		else if (i_1439_ > 255)
		    i_1439_ = 255;
		aByteArray9406[i_1438_] = (byte) i_1439_;
	    }
	    if (aClass103Array9417 != null) {
		for (int i_1440_ = 0; i_1440_ < anInt9416; i_1440_++) {
		    Class103 class103 = aClass103Array9417[i_1440_];
		    Class107 class107 = aClass107Array9441[i_1440_];
		    class107.anInt1304
			= (class107.anInt1304 * -1093122285 & 0xffffff
			   | 255 - ((aByteArray9406
				     [class103.anInt1273 * -954563709])
				    & 0xff) << 24) * 540580635;
		}
	    }
	} else if (i == 7) {
	    for (int i_1441_ = 0; i_1441_ < anInt9375; i_1441_++) {
		int i_1442_ = aShortArray9403[i_1441_] & 0xffff;
		int i_1443_ = i_1442_ >> 10 & 0x3f;
		int i_1444_ = i_1442_ >> 7 & 0x7;
		int i_1445_ = i_1442_ & 0x7f;
		i_1443_ = i_1443_ + i_1421_ & 0x3f;
		i_1444_ += i_1422_;
		if (i_1444_ < 0)
		    i_1444_ = 0;
		else if (i_1444_ > 7)
		    i_1444_ = 7;
		i_1445_ += i_1423_;
		if (i_1445_ < 0)
		    i_1445_ = 0;
		else if (i_1445_ > 127)
		    i_1445_ = 127;
		aShortArray9403[i_1441_]
		    = (short) (i_1443_ << 10 | i_1444_ << 7 | i_1445_);
	    }
	    aBool9408 = true;
	    if (aClass103Array9417 != null) {
		for (int i_1446_ = 0; i_1446_ < anInt9416; i_1446_++) {
		    Class103 class103 = aClass103Array9417[i_1446_];
		    Class107 class107 = aClass107Array9441[i_1446_];
		    class107.anInt1304
			= (class107.anInt1304 * -1093122285 & ~0xffffff
			   | ((Class381.anIntArray3929
			       [Class504.method8313(((aShortArray9403
						      [(class103.anInt1273
							* -954563709)])
						     & 0xffff),
						    1306342966) & 0xffff])
			      & 0xffffff)) * 540580635;
		}
	    }
	} else if (i == 8) {
	    for (int i_1447_ = 0; i_1447_ < anInt9416; i_1447_++) {
		Class107 class107 = aClass107Array9441[i_1447_];
		class107.anInt1297 += i_1421_ * -1780640007;
		class107.anInt1298 += i_1422_ * -1349044133;
	    }
	} else if (i == 10) {
	    for (int i_1448_ = 0; i_1448_ < anInt9416; i_1448_++) {
		Class107 class107 = aClass107Array9441[i_1448_];
		class107.aFloat1295
		    = class107.aFloat1295 * (float) i_1421_ / 128.0F;
		class107.aFloat1296
		    = class107.aFloat1296 * (float) i_1422_ / 128.0F;
	    }
	} else if (i == 9) {
	    for (int i_1449_ = 0; i_1449_ < anInt9416; i_1449_++) {
		Class107 class107 = aClass107Array9441[i_1449_];
		class107.anInt1299
		    = ((class107.anInt1299 * -1829505101 + i_1421_ & 0x3fff)
		       * -412512389);
	    }
	}
    }
    
    void method3015(int i, int i_1450_, int i_1451_, int i_1452_) {
	if (i == 0) {
	    int i_1453_ = 0;
	    anInt9425 = 0;
	    anInt9411 = 0;
	    anInt9412 = 0;
	    for (int i_1454_ = 0; i_1454_ < anInt9394; i_1454_++) {
		anInt9425 += anIntArray9424[i_1454_];
		anInt9411 += anIntArray9379[i_1454_];
		anInt9412 += anIntArray9395[i_1454_];
		i_1453_++;
	    }
	    if (i_1453_ > 0) {
		anInt9425 = anInt9425 / i_1453_ + i_1450_;
		anInt9411 = anInt9411 / i_1453_ + i_1451_;
		anInt9412 = anInt9412 / i_1453_ + i_1452_;
	    } else {
		anInt9425 = i_1450_;
		anInt9411 = i_1451_;
		anInt9412 = i_1452_;
	    }
	} else if (i == 1) {
	    for (int i_1455_ = 0; i_1455_ < anInt9394; i_1455_++) {
		anIntArray9424[i_1455_] += i_1450_;
		anIntArray9379[i_1455_] += i_1451_;
		anIntArray9395[i_1455_] += i_1452_;
	    }
	} else if (i == 2) {
	    for (int i_1456_ = 0; i_1456_ < anInt9394; i_1456_++) {
		anIntArray9424[i_1456_] -= anInt9425;
		anIntArray9379[i_1456_] -= anInt9411;
		anIntArray9395[i_1456_] -= anInt9412;
		if (i_1452_ != 0) {
		    int i_1457_ = Class436.anIntArray4831[i_1452_];
		    int i_1458_ = Class436.anIntArray4838[i_1452_];
		    int i_1459_
			= ((anIntArray9379[i_1456_] * i_1457_
			    + anIntArray9424[i_1456_] * i_1458_ + 16383)
			   >> 14);
		    anIntArray9379[i_1456_]
			= (anIntArray9379[i_1456_] * i_1458_
			   - anIntArray9424[i_1456_] * i_1457_ + 16383) >> 14;
		    anIntArray9424[i_1456_] = i_1459_;
		}
		if (i_1450_ != 0) {
		    int i_1460_ = Class436.anIntArray4831[i_1450_];
		    int i_1461_ = Class436.anIntArray4838[i_1450_];
		    int i_1462_
			= ((anIntArray9379[i_1456_] * i_1461_
			    - anIntArray9395[i_1456_] * i_1460_ + 16383)
			   >> 14);
		    anIntArray9395[i_1456_]
			= (anIntArray9379[i_1456_] * i_1460_
			   + anIntArray9395[i_1456_] * i_1461_ + 16383) >> 14;
		    anIntArray9379[i_1456_] = i_1462_;
		}
		if (i_1451_ != 0) {
		    int i_1463_ = Class436.anIntArray4831[i_1451_];
		    int i_1464_ = Class436.anIntArray4838[i_1451_];
		    int i_1465_
			= ((anIntArray9395[i_1456_] * i_1463_
			    + anIntArray9424[i_1456_] * i_1464_ + 16383)
			   >> 14);
		    anIntArray9395[i_1456_]
			= (anIntArray9395[i_1456_] * i_1464_
			   - anIntArray9424[i_1456_] * i_1463_ + 16383) >> 14;
		    anIntArray9424[i_1456_] = i_1465_;
		}
		anIntArray9424[i_1456_] += anInt9425;
		anIntArray9379[i_1456_] += anInt9411;
		anIntArray9395[i_1456_] += anInt9412;
	    }
	} else if (i == 3) {
	    for (int i_1466_ = 0; i_1466_ < anInt9394; i_1466_++) {
		anIntArray9424[i_1466_] -= anInt9425;
		anIntArray9379[i_1466_] -= anInt9411;
		anIntArray9395[i_1466_] -= anInt9412;
		anIntArray9424[i_1466_]
		    = anIntArray9424[i_1466_] * i_1450_ / 128;
		anIntArray9379[i_1466_]
		    = anIntArray9379[i_1466_] * i_1451_ / 128;
		anIntArray9395[i_1466_]
		    = anIntArray9395[i_1466_] * i_1452_ / 128;
		anIntArray9424[i_1466_] += anInt9425;
		anIntArray9379[i_1466_] += anInt9411;
		anIntArray9395[i_1466_] += anInt9412;
	    }
	} else if (i == 5) {
	    for (int i_1467_ = 0; i_1467_ < anInt9375; i_1467_++) {
		int i_1468_ = (aByteArray9406[i_1467_] & 0xff) + i_1450_ * 8;
		if (i_1468_ < 0)
		    i_1468_ = 0;
		else if (i_1468_ > 255)
		    i_1468_ = 255;
		aByteArray9406[i_1467_] = (byte) i_1468_;
	    }
	    if (aClass103Array9417 != null) {
		for (int i_1469_ = 0; i_1469_ < anInt9416; i_1469_++) {
		    Class103 class103 = aClass103Array9417[i_1469_];
		    Class107 class107 = aClass107Array9441[i_1469_];
		    class107.anInt1304
			= (class107.anInt1304 * -1093122285 & 0xffffff
			   | 255 - ((aByteArray9406
				     [class103.anInt1273 * -954563709])
				    & 0xff) << 24) * 540580635;
		}
	    }
	} else if (i == 7) {
	    for (int i_1470_ = 0; i_1470_ < anInt9375; i_1470_++) {
		int i_1471_ = aShortArray9403[i_1470_] & 0xffff;
		int i_1472_ = i_1471_ >> 10 & 0x3f;
		int i_1473_ = i_1471_ >> 7 & 0x7;
		int i_1474_ = i_1471_ & 0x7f;
		i_1472_ = i_1472_ + i_1450_ & 0x3f;
		i_1473_ += i_1451_;
		if (i_1473_ < 0)
		    i_1473_ = 0;
		else if (i_1473_ > 7)
		    i_1473_ = 7;
		i_1474_ += i_1452_;
		if (i_1474_ < 0)
		    i_1474_ = 0;
		else if (i_1474_ > 127)
		    i_1474_ = 127;
		aShortArray9403[i_1470_]
		    = (short) (i_1472_ << 10 | i_1473_ << 7 | i_1474_);
	    }
	    aBool9408 = true;
	    if (aClass103Array9417 != null) {
		for (int i_1475_ = 0; i_1475_ < anInt9416; i_1475_++) {
		    Class103 class103 = aClass103Array9417[i_1475_];
		    Class107 class107 = aClass107Array9441[i_1475_];
		    class107.anInt1304
			= (class107.anInt1304 * -1093122285 & ~0xffffff
			   | ((Class381.anIntArray3929
			       [Class504.method8313(((aShortArray9403
						      [(class103.anInt1273
							* -954563709)])
						     & 0xffff),
						    1070865965) & 0xffff])
			      & 0xffffff)) * 540580635;
		}
	    }
	} else if (i == 8) {
	    for (int i_1476_ = 0; i_1476_ < anInt9416; i_1476_++) {
		Class107 class107 = aClass107Array9441[i_1476_];
		class107.anInt1297 += i_1450_ * -1780640007;
		class107.anInt1298 += i_1451_ * -1349044133;
	    }
	} else if (i == 10) {
	    for (int i_1477_ = 0; i_1477_ < anInt9416; i_1477_++) {
		Class107 class107 = aClass107Array9441[i_1477_];
		class107.aFloat1295
		    = class107.aFloat1295 * (float) i_1450_ / 128.0F;
		class107.aFloat1296
		    = class107.aFloat1296 * (float) i_1451_ / 128.0F;
	    }
	} else if (i == 9) {
	    for (int i_1478_ = 0; i_1478_ < anInt9416; i_1478_++) {
		Class107 class107 = aClass107Array9441[i_1478_];
		class107.anInt1299
		    = ((class107.anInt1299 * -1829505101 + i_1450_ & 0x3fff)
		       * -412512389);
	    }
	}
    }
    
    public void method3016(Class444 class444, Class211 class211, int i) {
	method15085(class444, class211, i);
    }
    
    void method15130(boolean bool) {
	if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		method15069(bool);
	    }
	} else
	    method15069(bool);
    }
    
    final void method15131(boolean bool, boolean bool_1479_,
			   boolean bool_1480_, boolean bool_1481_,
			   boolean bool_1482_) {
	if (aClass103Array9417 != null) {
	    for (int i = 0; i < anInt9416; i++) {
		Class103 class103 = aClass103Array9417[i];
		anIntArray9444[class103.anInt1273 * -954563709] = i;
	    }
	}
	if (aBool9369 || aClass103Array9417 != null) {
	    if ((anInt9373 & 0x100) == 0 && aShortArray9405 != null) {
		for (int i = 0; i < anInt9385; i++) {
		    short i_1483_ = aShortArray9405[i];
		    method15088(bool, bool_1479_, bool_1480_, i_1483_,
				bool_1481_, bool_1482_);
		}
	    } else {
		for (int i = 0; i < anInt9385; i++) {
		    if (!method15086(i) && !method15096(i))
			method15088(bool, bool_1479_, bool_1480_, i,
				    bool_1481_, bool_1482_);
		}
		if (aByteArray9376 == null) {
		    for (int i = 0; i < anInt9385; i++) {
			if (method15086(i) || method15096(i))
			    method15088(bool, bool_1479_, bool_1480_, i,
					bool_1481_, bool_1482_);
		    }
		} else {
		    for (int i = 0; i < 12; i++) {
			for (int i_1484_ = 0; i_1484_ < anInt9385; i_1484_++) {
			    if (aByteArray9376[i_1484_] == i
				&& (method15086(i_1484_)
				    || method15096(i_1484_)))
				method15088(bool, bool_1479_, bool_1480_,
					    i_1484_, bool_1481_, bool_1482_);
			}
		    }
		}
	    }
	    if (aClass103Array9417 != null)
		method15148(bool, bool_1479_, bool_1480_);
	} else {
	    for (int i = 0; i < anInt9385; i++)
		method15088(bool, bool_1479_, bool_1480_, i, bool_1481_,
			    bool_1482_);
	}
    }
    
    final void method15132(boolean bool, boolean bool_1485_,
			   boolean bool_1486_) {
	for (int i = 0; i < anInt9416; i++) {
	    Class103 class103 = aClass103Array9417[i];
	    if (class103.aBool1276) {
		Class107 class107 = aClass107Array9441[i];
		aClass182_Sub2_9433.method15202
		    (bool, bool_1485_, bool_1486_,
		     class107.anInt1302 * 1736067347,
		     class107.anInt1300 * 1933483125, class107.aFloat1301,
		     class107.anInt1294 * 1227843861,
		     class107.anInt1303 * -1024330197, class103.aShort1277,
		     class107.anInt1304 * -1093122285, class103.aByte1275,
		     class103.aByte1274);
	    }
	}
    }
    
    final void method15133(boolean bool, boolean bool_1487_,
			   boolean bool_1488_) {
	for (int i = 0; i < anInt9416; i++) {
	    Class103 class103 = aClass103Array9417[i];
	    if (class103.aBool1276) {
		Class107 class107 = aClass107Array9441[i];
		aClass182_Sub2_9433.method15202
		    (bool, bool_1487_, bool_1488_,
		     class107.anInt1302 * 1736067347,
		     class107.anInt1300 * 1933483125, class107.aFloat1301,
		     class107.anInt1294 * 1227843861,
		     class107.anInt1303 * -1024330197, class103.aShort1277,
		     class107.anInt1304 * -1093122285, class103.aByte1275,
		     class103.aByte1274);
	    }
	}
    }
    
    int method15134(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    final boolean method15135(int i) {
	if (aByteArray9406 == null)
	    return false;
	if (aByteArray9406[i] == 0)
	    return false;
	return true;
    }
    
    Class179_Sub2(Class182_Sub2 class182_sub2) {
	anInt9377 = 0;
	anInt9375 = 0;
	anInt9385 = 0;
	anInt9364 = 0;
	aBool9409 = false;
	aBool9414 = false;
	aBool9420 = false;
	aBool9429 = false;
	aBool9369 = false;
	aBool9380 = false;
	aClass182_Sub2_9433 = class182_sub2;
    }
    
    public int method2964() {
	if (!aBool9429)
	    method3003();
	return aShort9430;
    }
    
    final boolean method15136(int i) {
	if (anIntArray9444 == null)
	    return false;
	if (anIntArray9444[i] == -1)
	    return false;
	return true;
    }
    
    final void method15137(boolean bool, boolean bool_1489_,
			   boolean bool_1490_, int i) {
	short i_1491_ = aShortArray9382[i];
	short i_1492_ = aShortArray9387[i];
	short i_1493_ = aShortArray9388[i];
	boolean bool_1494_ = false;
	if (aShortArray9402 != null && aShortArray9402[i] != -1)
	    bool_1494_
		= (aClass182_Sub2_9433.aClass180_1944.method3116
		   (aShortArray9402[i] & 0xffff, -1431554601).aBool1801);
	if (!bool_1494_) {
	    if (aByteArray9406 == null)
		aClass128_9360.anInt1486 = 0;
	    else
		aClass128_9360.anInt1486 = aByteArray9406[i] & 0xff;
	    if (anIntArray9393[i] == -1)
		aClass128_9360.method2256
		    (bool, bool_1489_, bool_1490_, aFloatArray9400[i_1491_],
		     aFloatArray9400[i_1492_], aFloatArray9400[i_1493_],
		     aFloatArray9435[i_1491_], aFloatArray9435[i_1492_],
		     aFloatArray9435[i_1493_], aFloatArray9437[i_1491_],
		     aFloatArray9437[i_1492_], aFloatArray9437[i_1493_],
		     Class381.anIntArray3929[anIntArray9391[i] & 0xffff]);
	    else
		aClass128_9360.method2266
		    (bool, bool_1489_, bool_1490_, aFloatArray9400[i_1491_],
		     aFloatArray9400[i_1492_], aFloatArray9400[i_1493_],
		     aFloatArray9435[i_1491_], aFloatArray9435[i_1492_],
		     aFloatArray9435[i_1493_], aFloatArray9437[i_1491_],
		     aFloatArray9437[i_1492_], aFloatArray9437[i_1493_],
		     (float) (anIntArray9391[i] & 0xffff),
		     (float) (anIntArray9392[i] & 0xffff),
		     (float) (anIntArray9393[i] & 0xffff));
	} else {
	    int i_1495_ = -16777216;
	    if (aByteArray9406 != null)
		i_1495_ = 255 - (aByteArray9406[i] & 0xff) << 24;
	    if (anIntArray9393[i] == -1) {
		int i_1496_ = i_1495_ | anIntArray9391[i] & 0xffffff;
		aClass128_9360.method2248
		    (bool, bool_1489_, bool_1490_, aFloatArray9400[i_1491_],
		     aFloatArray9400[i_1492_], aFloatArray9400[i_1493_],
		     aFloatArray9435[i_1491_], aFloatArray9435[i_1492_],
		     aFloatArray9435[i_1493_], aFloatArray9437[i_1491_],
		     aFloatArray9437[i_1492_], aFloatArray9437[i_1493_],
		     aFloatArray9438[i_1491_], aFloatArray9438[i_1492_],
		     aFloatArray9438[i_1493_], aFloatArrayArray9401[i][0],
		     aFloatArrayArray9401[i][1], aFloatArrayArray9401[i][2],
		     aFloatArrayArray9390[i][0], aFloatArrayArray9390[i][1],
		     aFloatArrayArray9390[i][2], i_1496_, i_1496_, i_1496_,
		     aClass110_9362.anInt1330 * 296717011, 0.0F, 0.0F, 0.0F,
		     aShortArray9402[i] & 0xffff);
	    } else
		aClass128_9360.method2248
		    (bool, bool_1489_, bool_1490_, aFloatArray9400[i_1491_],
		     aFloatArray9400[i_1492_], aFloatArray9400[i_1493_],
		     aFloatArray9435[i_1491_], aFloatArray9435[i_1492_],
		     aFloatArray9435[i_1493_], aFloatArray9437[i_1491_],
		     aFloatArray9437[i_1492_], aFloatArray9437[i_1493_],
		     aFloatArray9438[i_1491_], aFloatArray9438[i_1492_],
		     aFloatArray9438[i_1493_], aFloatArrayArray9401[i][0],
		     aFloatArrayArray9401[i][1], aFloatArrayArray9401[i][2],
		     aFloatArrayArray9390[i][0], aFloatArrayArray9390[i][1],
		     aFloatArrayArray9390[i][2],
		     i_1495_ | anIntArray9391[i] & 0xffffff,
		     i_1495_ | anIntArray9392[i] & 0xffffff,
		     i_1495_ | anIntArray9393[i] & 0xffffff,
		     aClass110_9362.anInt1330 * 296717011, 0.0F, 0.0F, 0.0F,
		     aShortArray9402[i] & 0xffff);
	}
    }
    
    public int method3051() {
	if (!aBool9420)
	    method15092();
	return aShort9426;
    }
    
    final void method15138(boolean bool, boolean bool_1497_,
			   boolean bool_1498_, int i, boolean bool_1499_,
			   boolean bool_1500_) {
	if (anIntArray9393[i] != -2) {
	    short i_1501_ = aShortArray9382[i];
	    short i_1502_ = aShortArray9387[i];
	    short i_1503_ = aShortArray9388[i];
	    float f = aFloatArray9435[i_1501_];
	    float f_1504_ = aFloatArray9435[i_1502_];
	    float f_1505_ = aFloatArray9435[i_1503_];
	    if (!bool_1499_ || (f != -5000.0F && f_1504_ != -5000.0F
				&& f_1505_ != -5000.0F)) {
		float f_1506_ = aFloatArray9400[i_1501_];
		float f_1507_ = aFloatArray9400[i_1502_];
		float f_1508_ = aFloatArray9400[i_1503_];
		if (anIntArray9444[i] != -1
		    || ((f - f_1504_) * (f_1508_ - f_1507_)
			- (f_1506_ - f_1507_) * (f_1505_ - f_1504_)) > 0.0F) {
		    if (f < 0.0F || f_1504_ < 0.0F || f_1505_ < 0.0F
			|| f > (float) (aClass110_9362.anInt1360 * -57670039)
			|| f_1504_ > (float) (aClass110_9362.anInt1360
					      * -57670039)
			|| f_1505_ > (float) (aClass110_9362.anInt1360
					      * -57670039))
			aClass128_9360.aBool1485 = true;
		    else
			aClass128_9360.aBool1485 = false;
		    if (bool_1500_) {
			int i_1509_ = anIntArray9444[i];
			if (i_1509_ == -1
			    || !aClass103Array9417[i_1509_].aBool1276)
			    method15090(bool, bool_1497_, bool_1498_, i);
		    } else {
			int i_1510_ = anIntArray9444[i];
			if (i_1510_ != -1) {
			    Class103 class103 = aClass103Array9417[i_1510_];
			    Class107 class107 = aClass107Array9441[i_1510_];
			    if (!class103.aBool1276)
				method15137(bool, bool_1497_, bool_1498_, i);
			    aClass182_Sub2_9433.method15202
				(bool, bool_1497_, bool_1498_,
				 class107.anInt1302 * 1736067347,
				 class107.anInt1300 * 1933483125,
				 class107.aFloat1301,
				 class107.anInt1294 * 1227843861,
				 class107.anInt1303 * -1024330197,
				 class103.aShort1277,
				 class107.anInt1304 * -1093122285,
				 class103.aByte1275, class103.aByte1274);
			} else
			    method15137(bool, bool_1497_, bool_1498_, i);
		    }
		}
	    }
	}
    }
    
    final void method15139(boolean bool, boolean bool_1511_,
			   boolean bool_1512_, int i) {
	short i_1513_ = aShortArray9382[i];
	short i_1514_ = aShortArray9387[i];
	short i_1515_ = aShortArray9388[i];
	boolean bool_1516_ = false;
	if (aShortArray9402 != null && aShortArray9402[i] != -1)
	    bool_1516_
		= (aClass182_Sub2_9433.aClass180_1944.method3116
		   (aShortArray9402[i] & 0xffff, -1431554601).aBool1801);
	if (!bool_1516_) {
	    if (aByteArray9406 == null)
		aClass128_9360.anInt1486 = 0;
	    else
		aClass128_9360.anInt1486 = aByteArray9406[i] & 0xff;
	    if (anIntArray9393[i] == -1)
		aClass128_9360.method2256
		    (bool, bool_1511_, bool_1512_, aFloatArray9400[i_1513_],
		     aFloatArray9400[i_1514_], aFloatArray9400[i_1515_],
		     aFloatArray9435[i_1513_], aFloatArray9435[i_1514_],
		     aFloatArray9435[i_1515_], aFloatArray9437[i_1513_],
		     aFloatArray9437[i_1514_], aFloatArray9437[i_1515_],
		     Class381.anIntArray3929[anIntArray9391[i] & 0xffff]);
	    else
		aClass128_9360.method2266
		    (bool, bool_1511_, bool_1512_, aFloatArray9400[i_1513_],
		     aFloatArray9400[i_1514_], aFloatArray9400[i_1515_],
		     aFloatArray9435[i_1513_], aFloatArray9435[i_1514_],
		     aFloatArray9435[i_1515_], aFloatArray9437[i_1513_],
		     aFloatArray9437[i_1514_], aFloatArray9437[i_1515_],
		     (float) (anIntArray9391[i] & 0xffff),
		     (float) (anIntArray9392[i] & 0xffff),
		     (float) (anIntArray9393[i] & 0xffff));
	} else {
	    int i_1517_ = -16777216;
	    if (aByteArray9406 != null)
		i_1517_ = 255 - (aByteArray9406[i] & 0xff) << 24;
	    if (anIntArray9393[i] == -1) {
		int i_1518_ = i_1517_ | anIntArray9391[i] & 0xffffff;
		aClass128_9360.method2248
		    (bool, bool_1511_, bool_1512_, aFloatArray9400[i_1513_],
		     aFloatArray9400[i_1514_], aFloatArray9400[i_1515_],
		     aFloatArray9435[i_1513_], aFloatArray9435[i_1514_],
		     aFloatArray9435[i_1515_], aFloatArray9437[i_1513_],
		     aFloatArray9437[i_1514_], aFloatArray9437[i_1515_],
		     aFloatArray9438[i_1513_], aFloatArray9438[i_1514_],
		     aFloatArray9438[i_1515_], aFloatArrayArray9401[i][0],
		     aFloatArrayArray9401[i][1], aFloatArrayArray9401[i][2],
		     aFloatArrayArray9390[i][0], aFloatArrayArray9390[i][1],
		     aFloatArrayArray9390[i][2], i_1518_, i_1518_, i_1518_,
		     aClass110_9362.anInt1330 * 296717011, 0.0F, 0.0F, 0.0F,
		     aShortArray9402[i] & 0xffff);
	    } else
		aClass128_9360.method2248
		    (bool, bool_1511_, bool_1512_, aFloatArray9400[i_1513_],
		     aFloatArray9400[i_1514_], aFloatArray9400[i_1515_],
		     aFloatArray9435[i_1513_], aFloatArray9435[i_1514_],
		     aFloatArray9435[i_1515_], aFloatArray9437[i_1513_],
		     aFloatArray9437[i_1514_], aFloatArray9437[i_1515_],
		     aFloatArray9438[i_1513_], aFloatArray9438[i_1514_],
		     aFloatArray9438[i_1515_], aFloatArrayArray9401[i][0],
		     aFloatArrayArray9401[i][1], aFloatArrayArray9401[i][2],
		     aFloatArrayArray9390[i][0], aFloatArrayArray9390[i][1],
		     aFloatArrayArray9390[i][2],
		     i_1517_ | anIntArray9391[i] & 0xffffff,
		     i_1517_ | anIntArray9392[i] & 0xffffff,
		     i_1517_ | anIntArray9393[i] & 0xffffff,
		     aClass110_9362.anInt1330 * 296717011, 0.0F, 0.0F, 0.0F,
		     aShortArray9402[i] & 0xffff);
	}
    }
    
    void method15140() {
	synchronized (this) {
	    for (int i = 0; i < anInt9377; i++) {
		int i_1519_ = anIntArray9395[i];
		anIntArray9395[i] = anIntArray9424[i];
		anIntArray9424[i] = -i_1519_;
		if (aClass100Array9422[i] != null) {
		    i_1519_ = aClass100Array9422[i].anInt1216;
		    aClass100Array9422[i].anInt1216
			= aClass100Array9422[i].anInt1215;
		    aClass100Array9422[i].anInt1215 = -i_1519_;
		}
	    }
	    if (aClass115Array9398 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aClass115Array9398[i] != null) {
			int i_1520_ = aClass115Array9398[i].anInt1406;
			aClass115Array9398[i].anInt1406
			    = aClass115Array9398[i].anInt1407;
			aClass115Array9398[i].anInt1407 = -i_1520_;
		    }
		}
	    }
	    for (int i = anInt9377; i < anInt9394; i++) {
		int i_1521_ = anIntArray9395[i];
		anIntArray9395[i] = anIntArray9424[i];
		anIntArray9424[i] = -i_1521_;
	    }
	    anInt9364 = 0;
	    aBool9420 = false;
	}
    }
    
    int method15141(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    public Class179 method2985(byte i, int i_1522_, boolean bool) {
	method15083(Thread.currentThread());
	boolean bool_1523_ = false;
	Class179_Sub2 class179_sub2_1524_;
	Class179_Sub2 class179_sub2_1525_;
	if (i > 0 && i <= 8) {
	    class179_sub2_1525_ = aClass179_Sub2Array9446[i - 1];
	    class179_sub2_1524_ = aClass179_Sub2Array9389[i - 1];
	    bool_1523_ = true;
	} else
	    class179_sub2_1524_ = class179_sub2_1525_
		= new Class179_Sub2(aClass182_Sub2_9433);
	return method15074(class179_sub2_1524_, class179_sub2_1525_, i_1522_,
			   bool_1523_, bool);
    }
    
    public Class179 method2926(byte i, int i_1526_, boolean bool) {
	method15083(Thread.currentThread());
	boolean bool_1527_ = false;
	Class179_Sub2 class179_sub2_1528_;
	Class179_Sub2 class179_sub2_1529_;
	if (i > 0 && i <= 8) {
	    class179_sub2_1529_ = aClass179_Sub2Array9446[i - 1];
	    class179_sub2_1528_ = aClass179_Sub2Array9389[i - 1];
	    bool_1527_ = true;
	} else
	    class179_sub2_1528_ = class179_sub2_1529_
		= new Class179_Sub2(aClass182_Sub2_9433);
	return method15074(class179_sub2_1528_, class179_sub2_1529_, i_1526_,
			   bool_1527_, bool);
    }
    
    boolean method15142(int i, int i_1530_, float f, float f_1531_,
			float f_1532_, float f_1533_, float f_1534_,
			float f_1535_) {
	if ((float) i_1530_ < f && (float) i_1530_ < f_1531_
	    && (float) i_1530_ < f_1532_)
	    return false;
	if ((float) i_1530_ > f && (float) i_1530_ > f_1531_
	    && (float) i_1530_ > f_1532_)
	    return false;
	if ((float) i < f_1533_ && (float) i < f_1534_ && (float) i < f_1535_)
	    return false;
	if ((float) i > f_1533_ && (float) i > f_1534_ && (float) i > f_1535_)
	    return false;
	return true;
    }
    
    boolean method15143(int i, int i_1536_, float f, float f_1537_,
			float f_1538_, float f_1539_, float f_1540_,
			float f_1541_) {
	if ((float) i_1536_ < f && (float) i_1536_ < f_1537_
	    && (float) i_1536_ < f_1538_)
	    return false;
	if ((float) i_1536_ > f && (float) i_1536_ > f_1537_
	    && (float) i_1536_ > f_1538_)
	    return false;
	if ((float) i < f_1539_ && (float) i < f_1540_ && (float) i < f_1541_)
	    return false;
	if ((float) i > f_1539_ && (float) i > f_1540_ && (float) i > f_1541_)
	    return false;
	return true;
    }
    
    public void method3020(Class444 class444) {
	method15065(aClass182_Sub2_9433.method15223(Thread.currentThread()));
	Class435 class435 = aClass110_9362.aClass435_1340;
	class435.method7040(class444);
	if (aClass184Array9386 != null) {
	    for (int i = 0; i < aClass184Array9386.length; i++) {
		Class184 class184 = aClass184Array9386[i];
		Class184 class184_1542_ = class184;
		if (class184.aClass184_2070 != null)
		    class184_1542_ = class184.aClass184_2070;
		class184_1542_.anInt2077
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 908167867);
		class184_1542_.anInt2063
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * -289521417);
		class184_1542_.anInt2072
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 1741678221);
		class184_1542_.anInt2073
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -1237556839);
		class184_1542_.anInt2074
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * 995078737);
		class184_1542_.anInt2075
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -285158923);
		class184_1542_.anInt2071
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -970783049);
		class184_1542_.anInt2067
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -779882021);
		class184_1542_.anInt2078
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -1530339371);
	    }
	}
	if (aClass154Array9415 != null) {
	    for (int i = 0; i < aClass154Array9415.length; i++) {
		Class154 class154 = aClass154Array9415[i];
		Class154 class154_1543_ = class154;
		if (class154.aClass154_1728 != null)
		    class154_1543_ = class154.aClass154_1728;
		if (class154.aClass435_1727 != null)
		    class154.aClass435_1727.method6947(class435);
		else
		    class154.aClass435_1727 = new Class435(class435);
		class154_1543_.anInt1730
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -1389867987);
		class154_1543_.anInt1731
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -182905551);
		class154_1543_.anInt1732
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * 1917380171);
	    }
	}
    }
    
    public void method3021(Class444 class444) {
	method15065(aClass182_Sub2_9433.method15223(Thread.currentThread()));
	Class435 class435 = aClass110_9362.aClass435_1340;
	class435.method7040(class444);
	if (aClass184Array9386 != null) {
	    for (int i = 0; i < aClass184Array9386.length; i++) {
		Class184 class184 = aClass184Array9386[i];
		Class184 class184_1544_ = class184;
		if (class184.aClass184_2070 != null)
		    class184_1544_ = class184.aClass184_2070;
		class184_1544_.anInt2077
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 908167867);
		class184_1544_.anInt2063
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * -289521417);
		class184_1544_.anInt2072
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 1741678221);
		class184_1544_.anInt2073
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -1237556839);
		class184_1544_.anInt2074
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * 995078737);
		class184_1544_.anInt2075
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -285158923);
		class184_1544_.anInt2071
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -970783049);
		class184_1544_.anInt2067
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -779882021);
		class184_1544_.anInt2078
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -1530339371);
	    }
	}
	if (aClass154Array9415 != null) {
	    for (int i = 0; i < aClass154Array9415.length; i++) {
		Class154 class154 = aClass154Array9415[i];
		Class154 class154_1545_ = class154;
		if (class154.aClass154_1728 != null)
		    class154_1545_ = class154.aClass154_1728;
		if (class154.aClass435_1727 != null)
		    class154.aClass435_1727.method6947(class435);
		else
		    class154.aClass435_1727 = new Class435(class435);
		class154_1545_.anInt1730
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9424[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9379
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9395
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -1389867987);
		class154_1545_.anInt1731
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9424[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9379
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9395
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -182905551);
		class154_1545_.anInt1732
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9424[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9379
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9395
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * 1917380171);
	    }
	}
    }
    
    public Class525_Sub16_Sub17 method3022
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	return null;
    }
    
    public Class525_Sub16_Sub17 method3023
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	return null;
    }
    
    public Class525_Sub16_Sub17 method3024
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	return null;
    }
    
    void method15144() {
	if (!aBool9420) {
	    int i = 0;
	    int i_1546_ = 0;
	    int i_1547_ = 32767;
	    int i_1548_ = 32767;
	    int i_1549_ = 32767;
	    int i_1550_ = -32768;
	    int i_1551_ = -32768;
	    int i_1552_ = -32768;
	    for (int i_1553_ = 0; i_1553_ < anInt9377; i_1553_++) {
		int i_1554_ = anIntArray9424[i_1553_];
		int i_1555_ = anIntArray9379[i_1553_];
		int i_1556_ = anIntArray9395[i_1553_];
		if (i_1554_ < i_1547_)
		    i_1547_ = i_1554_;
		if (i_1554_ > i_1550_)
		    i_1550_ = i_1554_;
		if (i_1555_ < i_1548_)
		    i_1548_ = i_1555_;
		if (i_1555_ > i_1551_)
		    i_1551_ = i_1555_;
		if (i_1556_ < i_1549_)
		    i_1549_ = i_1556_;
		if (i_1556_ > i_1552_)
		    i_1552_ = i_1556_;
		int i_1557_ = i_1554_ * i_1554_ + i_1556_ * i_1556_;
		if (i_1557_ > i)
		    i = i_1557_;
		i_1557_ += i_1555_ * i_1555_;
		if (i_1557_ > i_1546_)
		    i_1546_ = i_1557_;
	    }
	    aShort9368 = (short) i_1547_;
	    aShort9426 = (short) i_1550_;
	    aShort9423 = (short) i_1548_;
	    aShort9381 = (short) i_1551_;
	    aShort9431 = (short) i_1549_;
	    aShort9432 = (short) i_1552_;
	    aShort9421 = (short) (int) (Math.sqrt((double) i) + 0.99);
	    aShort9413 = (short) (int) (Math.sqrt((double) i_1546_) + 0.99);
	    aBool9420 = true;
	}
    }
    
    public void method3095(int i) {
	if ((anInt9373 & 0x2000) != 8192)
	    throw new IllegalStateException();
	anInt9383 = i;
	anInt9364 = 0;
    }
    
    void method15145() {
	if (anInt9364 == 0)
	    method15068(false);
	else if (aClass182_Sub2_9433.anInt9481 * -1098456669 > 1) {
	    synchronized (this) {
		method15153();
	    }
	} else
	    method15153();
    }
    
    public void method2969(short i, short i_1558_) {
	for (int i_1559_ = 0; i_1559_ < anInt9375; i_1559_++) {
	    if (aShortArray9403[i_1559_] == i)
		aShortArray9403[i_1559_] = i_1558_;
	}
	if (aClass103Array9417 != null) {
	    for (int i_1560_ = 0; i_1560_ < anInt9416; i_1560_++) {
		Class103 class103 = aClass103Array9417[i_1560_];
		Class107 class107 = aClass107Array9441[i_1560_];
		class107.anInt1304
		    = (class107.anInt1304 * -1093122285 & ~0xffffff
		       | ((Class381.anIntArray3929
			   [Class504.method8313((aShortArray9403
						 [(class103.anInt1273
						   * -954563709)]),
						380556920) & 0xffff])
			  & 0xffffff)) * 540580635;
	    }
	}
	if (anInt9364 == 2)
	    anInt9364 = 1;
    }
    
    public byte[] method2958() {
	return aByteArray9406;
    }
    
    public int method3028() {
	if (!aBool9420)
	    method15092();
	return aShort9421;
    }
    
    public void method3083(Class444 class444, int i, boolean bool) {
	if (aShortArray9378 != null) {
	    Class110 class110
		= aClass182_Sub2_9433.method15223(Thread.currentThread());
	    Class444 class444_1561_ = class110.aClass444_1337;
	    class444_1561_.method7154(class444);
	    if (bool)
		class444_1561_.method7138();
	    Class435 class435 = class110.aClass435_1340;
	    class435.method7040(class444_1561_);
	    float[] fs = new float[3];
	    for (int i_1562_ = 0; i_1562_ < anInt9377; i_1562_++) {
		if ((i & aShortArray9378[i_1562_]) != 0) {
		    class435.method6956((float) anIntArray9424[i_1562_],
					(float) anIntArray9379[i_1562_],
					(float) anIntArray9395[i_1562_], fs);
		    anIntArray9424[i_1562_] = (int) fs[0];
		    anIntArray9379[i_1562_] = (int) fs[1];
		    anIntArray9395[i_1562_] = (int) fs[2];
		}
	    }
	}
    }
    
    void method15146(Class110 class110) {
	aClass128_9360 = class110.aClass128_1338;
	if (class110 != aClass110_9362) {
	    aClass110_9362 = class110;
	    anIntArray9434 = aClass110_9362.anIntArray1353;
	    aFloatArray9435 = aClass110_9362.aFloatArray1343;
	    aFloatArray9400 = aClass110_9362.aFloatArray1344;
	    aFloatArray9437 = aClass110_9362.aFloatArray1345;
	    aFloatArray9438 = aClass110_9362.aFloatArray1351;
	    anIntArray9439 = aClass110_9362.anIntArray1347;
	    anIntArray9410 = aClass110_9362.anIntArray1348;
	    anIntArray9384 = aClass110_9362.anIntArray1349;
	    anIntArray9442 = aClass110_9362.anIntArray1350;
	    anIntArray9443 = aClass110_9362.anIntArray1334;
	    anIntArray9444 = aClass110_9362.anIntArray1352;
	}
    }
    
    public int method3106() {
	if (!aBool9420)
	    method15092();
	return aShort9368;
    }
    
    public void method2997(Class444 class444, int i, boolean bool) {
	if (aShortArray9378 != null) {
	    Class110 class110
		= aClass182_Sub2_9433.method15223(Thread.currentThread());
	    Class444 class444_1563_ = class110.aClass444_1337;
	    class444_1563_.method7154(class444);
	    if (bool)
		class444_1563_.method7138();
	    Class435 class435 = class110.aClass435_1340;
	    class435.method7040(class444_1563_);
	    float[] fs = new float[3];
	    for (int i_1564_ = 0; i_1564_ < anInt9377; i_1564_++) {
		if ((i & aShortArray9378[i_1564_]) != 0) {
		    class435.method6956((float) anIntArray9424[i_1564_],
					(float) anIntArray9379[i_1564_],
					(float) anIntArray9395[i_1564_], fs);
		    anIntArray9424[i_1564_] = (int) fs[0];
		    anIntArray9379[i_1564_] = (int) fs[1];
		    anIntArray9395[i_1564_] = (int) fs[2];
		}
	    }
	}
    }
    
    public int method3053() {
	if (!aBool9420)
	    method15092();
	return aShort9426;
    }
    
    public int method3093() {
	if (!aBool9420)
	    method15092();
	return aShort9381;
    }
    
    public int method3035() {
	if (!aBool9420)
	    method15092();
	return aShort9431;
    }
    
    public void method3074() {
	if ((anInt9373 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < anInt9394; i++)
		anIntArray9395[i] = -anIntArray9395[i];
	    if (aClass100Array9422 != null) {
		for (int i = 0; i < anInt9377; i++) {
		    if (aClass100Array9422[i] != null)
			aClass100Array9422[i].anInt1216
			    = -aClass100Array9422[i].anInt1216;
		}
	    }
	    if (aClass100Array9371 != null) {
		for (int i = 0; i < anInt9377; i++) {
		    if (aClass100Array9371[i] != null)
			aClass100Array9371[i].anInt1216
			    = -aClass100Array9371[i].anInt1216;
		}
	    }
	    if (aClass115Array9398 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aClass115Array9398[i] != null)
			aClass115Array9398[i].anInt1406
			    = -aClass115Array9398[i].anInt1406;
		}
	    }
	    short[] is = aShortArray9382;
	    aShortArray9382 = aShortArray9388;
	    aShortArray9388 = is;
	    if (aFloatArrayArray9401 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aFloatArrayArray9401[i] != null) {
			float f = aFloatArrayArray9401[i][0];
			aFloatArrayArray9401[i][0]
			    = aFloatArrayArray9401[i][2];
			aFloatArrayArray9401[i][2] = f;
		    }
		    if (aFloatArrayArray9390[i] != null) {
			float f = aFloatArrayArray9390[i][0];
			aFloatArrayArray9390[i][0]
			    = aFloatArrayArray9390[i][2];
			aFloatArrayArray9390[i][2] = f;
		    }
		}
	    }
	    aBool9420 = false;
	    anInt9364 = 0;
	}
    }
    
    public int method3037() {
	if (!aBool9420)
	    method15092();
	return aShort9431;
    }
    
    void method15147() {
	synchronized (this) {
	    for (int i = 0; i < anInt9394; i++) {
		int i_1565_ = anIntArray9395[i];
		anIntArray9395[i] = anIntArray9424[i];
		anIntArray9424[i] = -i_1565_;
	    }
	    method15084();
	}
    }
    
    public int method3039() {
	if (!aBool9420)
	    method15092();
	return aShort9432;
    }
    
    public int method3091() {
	if (!aBool9420)
	    method15092();
	return aShort9432;
    }
    
    public boolean method3069(int i, int i_1566_, Class444 class444,
			      boolean bool, int i_1567_) {
	method15065(aClass182_Sub2_9433.method15223(Thread.currentThread()));
	Class435 class435 = aClass110_9362.aClass435_1340;
	class435.method7040(class444);
	Class435 class435_1568_ = aClass110_9362.aClass435_1341;
	class435_1568_.method6947(class435);
	class435_1568_.method6950(aClass182_Sub2_9433.aClass435_9483);
	boolean bool_1569_ = false;
	int i_1570_ = 2147483647;
	int i_1571_ = -2147483648;
	int i_1572_ = 2147483647;
	int i_1573_ = -2147483648;
	if (!aBool9420)
	    method15092();
	int i_1574_ = aShort9426 - aShort9368 >> 1;
	int i_1575_ = aShort9381 - aShort9423 >> 1;
	int i_1576_ = aShort9432 - aShort9431 >> 1;
	int i_1577_ = aShort9368 + i_1574_;
	int i_1578_ = aShort9423 + i_1575_;
	int i_1579_ = aShort9431 + i_1576_;
	int i_1580_ = i_1577_ - (i_1574_ << i_1567_);
	int i_1581_ = i_1578_ - (i_1575_ << i_1567_);
	int i_1582_ = i_1579_ - (i_1576_ << i_1567_);
	int i_1583_ = i_1577_ + (i_1574_ << i_1567_);
	int i_1584_ = i_1578_ + (i_1575_ << i_1567_);
	int i_1585_ = i_1579_ + (i_1576_ << i_1567_);
	anIntArray9439[0] = i_1580_;
	anIntArray9410[0] = i_1581_;
	anIntArray9384[0] = i_1582_;
	anIntArray9439[1] = i_1583_;
	anIntArray9410[1] = i_1581_;
	anIntArray9384[1] = i_1582_;
	anIntArray9439[2] = i_1580_;
	anIntArray9410[2] = i_1584_;
	anIntArray9384[2] = i_1582_;
	anIntArray9439[3] = i_1583_;
	anIntArray9410[3] = i_1584_;
	anIntArray9384[3] = i_1582_;
	anIntArray9439[4] = i_1580_;
	anIntArray9410[4] = i_1581_;
	anIntArray9384[4] = i_1585_;
	anIntArray9439[5] = i_1583_;
	anIntArray9410[5] = i_1581_;
	anIntArray9384[5] = i_1585_;
	anIntArray9439[6] = i_1580_;
	anIntArray9410[6] = i_1584_;
	anIntArray9384[6] = i_1585_;
	anIntArray9439[7] = i_1583_;
	anIntArray9410[7] = i_1584_;
	anIntArray9384[7] = i_1585_;
	for (int i_1586_ = 0; i_1586_ < 8; i_1586_++) {
	    int i_1587_ = anIntArray9439[i_1586_];
	    int i_1588_ = anIntArray9410[i_1586_];
	    int i_1589_ = anIntArray9384[i_1586_];
	    float f = (class435_1568_.aFloatArray4830[2] * (float) i_1587_
		       + class435_1568_.aFloatArray4830[6] * (float) i_1588_
		       + class435_1568_.aFloatArray4830[10] * (float) i_1589_
		       + class435_1568_.aFloatArray4830[14]);
	    float f_1590_
		= (class435_1568_.aFloatArray4830[3] * (float) i_1587_
		   + class435_1568_.aFloatArray4830[7] * (float) i_1588_
		   + class435_1568_.aFloatArray4830[11] * (float) i_1589_
		   + class435_1568_.aFloatArray4830[15]);
	    if (f >= -f_1590_) {
		float f_1591_
		    = (class435_1568_.aFloatArray4830[0] * (float) i_1587_
		       + class435_1568_.aFloatArray4830[4] * (float) i_1588_
		       + class435_1568_.aFloatArray4830[8] * (float) i_1589_
		       + class435_1568_.aFloatArray4830[12]);
		float f_1592_
		    = (class435_1568_.aFloatArray4830[1] * (float) i_1587_
		       + class435_1568_.aFloatArray4830[5] * (float) i_1588_
		       + class435_1568_.aFloatArray4830[9] * (float) i_1589_
		       + class435_1568_.aFloatArray4830[13]);
		int i_1593_ = (int) (aClass182_Sub2_9433.aFloat9495
				     + (aClass182_Sub2_9433.aFloat9489
					* f_1591_ / f_1590_));
		int i_1594_ = (int) (aClass182_Sub2_9433.aFloat9492
				     + (aClass182_Sub2_9433.aFloat9491
					* f_1592_ / f_1590_));
		if (i_1593_ < i_1570_)
		    i_1570_ = i_1593_;
		if (i_1593_ > i_1571_)
		    i_1571_ = i_1593_;
		if (i_1594_ < i_1572_)
		    i_1572_ = i_1594_;
		if (i_1594_ > i_1573_)
		    i_1573_ = i_1594_;
		bool_1569_ = true;
	    }
	}
	if (bool_1569_ && i > i_1570_ && i < i_1571_ && i_1566_ > i_1572_
	    && i_1566_ < i_1573_) {
	    if (bool)
		return true;
	    for (int i_1595_ = 0; i_1595_ < anInt9394; i_1595_++) {
		int i_1596_ = anIntArray9424[i_1595_];
		int i_1597_ = anIntArray9379[i_1595_];
		int i_1598_ = anIntArray9395[i_1595_];
		float f
		    = (class435_1568_.aFloatArray4830[2] * (float) i_1596_
		       + class435_1568_.aFloatArray4830[6] * (float) i_1597_
		       + class435_1568_.aFloatArray4830[10] * (float) i_1598_
		       + class435_1568_.aFloatArray4830[14]);
		float f_1599_
		    = (class435_1568_.aFloatArray4830[3] * (float) i_1596_
		       + class435_1568_.aFloatArray4830[7] * (float) i_1597_
		       + class435_1568_.aFloatArray4830[11] * (float) i_1598_
		       + class435_1568_.aFloatArray4830[15]);
		if (f >= -f_1599_) {
		    float f_1600_
			= (class435_1568_.aFloatArray4830[0] * (float) i_1596_
			   + (class435_1568_.aFloatArray4830[4]
			      * (float) i_1597_)
			   + (class435_1568_.aFloatArray4830[8]
			      * (float) i_1598_)
			   + class435_1568_.aFloatArray4830[12]);
		    float f_1601_
			= (class435_1568_.aFloatArray4830[1] * (float) i_1596_
			   + (class435_1568_.aFloatArray4830[5]
			      * (float) i_1597_)
			   + (class435_1568_.aFloatArray4830[9]
			      * (float) i_1598_)
			   + class435_1568_.aFloatArray4830[13]);
		    aFloatArray9435[i_1595_]
			= (float) (int) (aClass182_Sub2_9433.aFloat9495
					 + (aClass182_Sub2_9433.aFloat9489
					    * f_1600_ / f_1599_));
		    aFloatArray9400[i_1595_]
			= (float) (int) (aClass182_Sub2_9433.aFloat9492
					 + (aClass182_Sub2_9433.aFloat9491
					    * f_1601_ / f_1599_));
		} else
		    aFloatArray9435[i_1595_] = -999999.0F;
	    }
	    for (int i_1602_ = 0; i_1602_ < anInt9385; i_1602_++) {
		if (aFloatArray9435[aShortArray9382[i_1602_]] != -999999.0F
		    && aFloatArray9435[aShortArray9387[i_1602_]] != -999999.0F
		    && aFloatArray9435[aShortArray9388[i_1602_]] != -999999.0F
		    && method15081(i, i_1566_,
				   aFloatArray9400[aShortArray9382[i_1602_]],
				   aFloatArray9400[aShortArray9387[i_1602_]],
				   aFloatArray9400[aShortArray9388[i_1602_]],
				   aFloatArray9435[aShortArray9382[i_1602_]],
				   aFloatArray9435[aShortArray9387[i_1602_]],
				   aFloatArray9435[aShortArray9388[i_1602_]]))
		    return true;
	    }
	}
	return false;
    }
    
    final void method15148(boolean bool, boolean bool_1603_,
			   boolean bool_1604_) {
	for (int i = 0; i < anInt9416; i++) {
	    Class103 class103 = aClass103Array9417[i];
	    if (class103.aBool1276) {
		Class107 class107 = aClass107Array9441[i];
		aClass182_Sub2_9433.method15202
		    (bool, bool_1603_, bool_1604_,
		     class107.anInt1302 * 1736067347,
		     class107.anInt1300 * 1933483125, class107.aFloat1301,
		     class107.anInt1294 * 1227843861,
		     class107.anInt1303 * -1024330197, class103.aShort1277,
		     class107.anInt1304 * -1093122285, class103.aByte1275,
		     class103.aByte1274);
	    }
	}
    }
    
    public void method3043(int i) {
	if ((anInt9373 & 0x1000) != 4096)
	    throw new IllegalStateException();
	anInt9374 = i;
	anInt9364 = 0;
    }
    
    public Class179 method2984(byte i, int i_1605_, boolean bool) {
	method15083(Thread.currentThread());
	boolean bool_1606_ = false;
	Class179_Sub2 class179_sub2_1607_;
	Class179_Sub2 class179_sub2_1608_;
	if (i > 0 && i <= 8) {
	    class179_sub2_1608_ = aClass179_Sub2Array9446[i - 1];
	    class179_sub2_1607_ = aClass179_Sub2Array9389[i - 1];
	    bool_1606_ = true;
	} else
	    class179_sub2_1607_ = class179_sub2_1608_
		= new Class179_Sub2(aClass182_Sub2_9433);
	return method15074(class179_sub2_1607_, class179_sub2_1608_, i_1605_,
			   bool_1606_, bool);
    }
    
    public int method3045() {
	return anInt9374;
    }
    
    public int method3046() {
	return anInt9374;
    }
    
    public int method3034() {
	return anInt9374;
    }
    
    public int method3049() {
	return anInt9374;
    }
    
    public byte[] method3050() {
	return aByteArray9406;
    }
    
    public Class154[] method3064() {
	return aClass154Array9415;
    }
    
    final void method15149(boolean bool, boolean bool_1609_,
			   boolean bool_1610_, int i, boolean bool_1611_,
			   boolean bool_1612_) {
	if (anIntArray9393[i] != -2) {
	    short i_1613_ = aShortArray9382[i];
	    short i_1614_ = aShortArray9387[i];
	    short i_1615_ = aShortArray9388[i];
	    float f = aFloatArray9435[i_1613_];
	    float f_1616_ = aFloatArray9435[i_1614_];
	    float f_1617_ = aFloatArray9435[i_1615_];
	    if (!bool_1611_ || (f != -5000.0F && f_1616_ != -5000.0F
				&& f_1617_ != -5000.0F)) {
		float f_1618_ = aFloatArray9400[i_1613_];
		float f_1619_ = aFloatArray9400[i_1614_];
		float f_1620_ = aFloatArray9400[i_1615_];
		if (anIntArray9444[i] != -1
		    || ((f - f_1616_) * (f_1620_ - f_1619_)
			- (f_1618_ - f_1619_) * (f_1617_ - f_1616_)) > 0.0F) {
		    if (f < 0.0F || f_1616_ < 0.0F || f_1617_ < 0.0F
			|| f > (float) (aClass110_9362.anInt1360 * -57670039)
			|| f_1616_ > (float) (aClass110_9362.anInt1360
					      * -57670039)
			|| f_1617_ > (float) (aClass110_9362.anInt1360
					      * -57670039))
			aClass128_9360.aBool1485 = true;
		    else
			aClass128_9360.aBool1485 = false;
		    if (bool_1612_) {
			int i_1621_ = anIntArray9444[i];
			if (i_1621_ == -1
			    || !aClass103Array9417[i_1621_].aBool1276)
			    method15090(bool, bool_1609_, bool_1610_, i);
		    } else {
			int i_1622_ = anIntArray9444[i];
			if (i_1622_ != -1) {
			    Class103 class103 = aClass103Array9417[i_1622_];
			    Class107 class107 = aClass107Array9441[i_1622_];
			    if (!class103.aBool1276)
				method15137(bool, bool_1609_, bool_1610_, i);
			    aClass182_Sub2_9433.method15202
				(bool, bool_1609_, bool_1610_,
				 class107.anInt1302 * 1736067347,
				 class107.anInt1300 * 1933483125,
				 class107.aFloat1301,
				 class107.anInt1294 * 1227843861,
				 class107.anInt1303 * -1024330197,
				 class103.aShort1277,
				 class107.anInt1304 * -1093122285,
				 class103.aByte1275, class103.aByte1274);
			} else
			    method15137(bool, bool_1609_, bool_1610_, i);
		    }
		}
	    }
	}
    }
    
    public int method3080() {
	return anInt9383;
    }
    
    public void method3054(short i, short i_1623_) {
	for (int i_1624_ = 0; i_1624_ < anInt9375; i_1624_++) {
	    if (aShortArray9403[i_1624_] == i)
		aShortArray9403[i_1624_] = i_1623_;
	}
	if (aClass103Array9417 != null) {
	    for (int i_1625_ = 0; i_1625_ < anInt9416; i_1625_++) {
		Class103 class103 = aClass103Array9417[i_1625_];
		Class107 class107 = aClass107Array9441[i_1625_];
		class107.anInt1304
		    = (class107.anInt1304 * -1093122285 & ~0xffffff
		       | ((Class381.anIntArray3929
			   [Class504.method8313((aShortArray9403
						 [(class103.anInt1273
						   * -954563709)]),
						1065707859) & 0xffff])
			  & 0xffffff)) * 540580635;
	    }
	}
	if (anInt9364 == 2)
	    anInt9364 = 1;
    }
    
    public void method3055(byte i, byte[] is) {
	if ((anInt9373 & 0x100000) == 0)
	    throw new RuntimeException();
	if (aByteArray9406 == null)
	    aByteArray9406 = new byte[anInt9375];
	if (is == null) {
	    for (int i_1626_ = 0; i_1626_ < anInt9375; i_1626_++)
		aByteArray9406[i_1626_] = i;
	} else {
	    for (int i_1627_ = 0; i_1627_ < anInt9375; i_1627_++) {
		int i_1628_ = 255 - ((255 - (is[i_1627_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9406[i_1627_] = (byte) i_1628_;
	    }
	}
	if (anInt9364 == 2)
	    anInt9364 = 1;
    }
    
    public void method3061(Class444 class444, Class211 class211, int i) {
	method15085(class444, class211, i);
    }
    
    public int method2988() {
	return anInt9373;
    }
    
    public int method2959() {
	if (!aBool9420)
	    method15092();
	return aShort9426;
    }
    
    public void method3059(short i, short i_1629_) {
	if (aShortArray9402 != null) {
	    if (!aBool9380 && i_1629_ >= 0) {
		Class166 class166
		    = aClass182_Sub2_9433.aClass180_1944
			  .method3116(i_1629_ & 0xffff, -1431554601);
		if (class166.aByte1805 != 0 || class166.aByte1806 != 0)
		    aBool9380 = true;
	    }
	    for (int i_1630_ = 0; i_1630_ < anInt9375; i_1630_++) {
		if (aShortArray9402[i_1630_] == i)
		    aShortArray9402[i_1630_] = i_1629_;
	    }
	}
    }
    
    public Class184[] method3060() {
	return aClass184Array9386;
    }
    
    public Class154[] method2946() {
	return aClass154Array9415;
    }
    
    final void method15150(boolean bool, boolean bool_1631_,
			   boolean bool_1632_, boolean bool_1633_,
			   boolean bool_1634_) {
	if (aClass103Array9417 != null) {
	    for (int i = 0; i < anInt9416; i++) {
		Class103 class103 = aClass103Array9417[i];
		anIntArray9444[class103.anInt1273 * -954563709] = i;
	    }
	}
	if (aBool9369 || aClass103Array9417 != null) {
	    if ((anInt9373 & 0x100) == 0 && aShortArray9405 != null) {
		for (int i = 0; i < anInt9385; i++) {
		    short i_1635_ = aShortArray9405[i];
		    method15088(bool, bool_1631_, bool_1632_, i_1635_,
				bool_1633_, bool_1634_);
		}
	    } else {
		for (int i = 0; i < anInt9385; i++) {
		    if (!method15086(i) && !method15096(i))
			method15088(bool, bool_1631_, bool_1632_, i,
				    bool_1633_, bool_1634_);
		}
		if (aByteArray9376 == null) {
		    for (int i = 0; i < anInt9385; i++) {
			if (method15086(i) || method15096(i))
			    method15088(bool, bool_1631_, bool_1632_, i,
					bool_1633_, bool_1634_);
		    }
		} else {
		    for (int i = 0; i < 12; i++) {
			for (int i_1636_ = 0; i_1636_ < anInt9385; i_1636_++) {
			    if (aByteArray9376[i_1636_] == i
				&& (method15086(i_1636_)
				    || method15096(i_1636_)))
				method15088(bool, bool_1631_, bool_1632_,
					    i_1636_, bool_1633_, bool_1634_);
			}
		    }
		}
	    }
	    if (aClass103Array9417 != null)
		method15148(bool, bool_1631_, bool_1632_);
	} else {
	    for (int i = 0; i < anInt9385; i++)
		method15088(bool, bool_1631_, bool_1632_, i, bool_1633_,
			    bool_1634_);
	}
    }
    
    public Class154[] method3063() {
	return aClass154Array9415;
    }
    
    public int method3002() {
	if (!aBool9420)
	    method15092();
	return aShort9431;
    }
    
    public boolean method2981() {
	if (aShortArray9402 == null)
	    return true;
	for (int i = 0; i < aShortArray9402.length; i++) {
	    if (aShortArray9402[i] != -1
		&& !aClass182_Sub2_9433.method15221(aShortArray9402[i]))
		return false;
	}
	return true;
    }
    
    public void method3029(int i, int i_1637_, Class161 class161,
			   Class161 class161_1638_, int i_1639_, int i_1640_,
			   int i_1641_) {
	if (i == 3) {
	    if ((anInt9373 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((anInt9373 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!aBool9420)
	    method15092();
	int i_1642_ = i_1639_ + aShort9368;
	int i_1643_ = i_1639_ + aShort9426;
	int i_1644_ = i_1641_ + aShort9431;
	int i_1645_ = i_1641_ + aShort9432;
	if (i == 4 || (i_1642_ >= 0
		       && ((i_1643_ + class161.anInt1761 * 435863595
			    >> class161.anInt1763 * -2063427645)
			   < class161.anInt1759 * 363736815)
		       && i_1644_ >= 0
		       && ((i_1645_ + class161.anInt1761 * 435863595
			    >> class161.anInt1763 * -2063427645)
			   < class161.anInt1760 * -1152334393))) {
	    int[][] is = class161.anIntArrayArray1762;
	    int[][] is_1646_ = null;
	    if (class161_1638_ != null)
		is_1646_ = class161_1638_.anIntArrayArray1762;
	    if (i == 4 || i == 5) {
		if (class161_1638_ == null
		    || (i_1642_ < 0
			|| ((i_1643_ + class161_1638_.anInt1761 * 435863595
			     >> class161_1638_.anInt1763 * -2063427645)
			    >= class161_1638_.anInt1759 * 363736815)
			|| i_1644_ < 0
			|| ((i_1645_ + class161_1638_.anInt1761 * 435863595
			     >> class161_1638_.anInt1763 * -2063427645)
			    >= class161_1638_.anInt1760 * -1152334393)))
		    return;
	    } else {
		i_1642_ >>= class161.anInt1763 * -2063427645;
		i_1643_ = (i_1643_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		i_1644_ >>= class161.anInt1763 * -2063427645;
		i_1645_ = (i_1645_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		if (is[i_1642_][i_1644_] == i_1640_
		    && is[i_1643_][i_1644_] == i_1640_
		    && is[i_1642_][i_1645_] == i_1640_
		    && is[i_1643_][i_1645_] == i_1640_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_1647_ = class161.anInt1761 * 435863595 - 1;
		    for (int i_1648_ = 0; i_1648_ < anInt9377; i_1648_++) {
			int i_1649_ = anIntArray9424[i_1648_] + i_1639_;
			int i_1650_ = anIntArray9395[i_1648_] + i_1641_;
			int i_1651_ = i_1649_ & i_1647_;
			int i_1652_ = i_1650_ & i_1647_;
			int i_1653_
			    = i_1649_ >> class161.anInt1763 * -2063427645;
			int i_1654_
			    = i_1650_ >> class161.anInt1763 * -2063427645;
			int i_1655_
			    = (((is[i_1653_][i_1654_]
				 * (class161.anInt1761 * 435863595 - i_1651_))
				+ is[i_1653_ + 1][i_1654_] * i_1651_)
			       >> class161.anInt1763 * -2063427645);
			int i_1656_
			    = (((is[i_1653_][i_1654_ + 1]
				 * (class161.anInt1761 * 435863595 - i_1651_))
				+ is[i_1653_ + 1][i_1654_ + 1] * i_1651_)
			       >> class161.anInt1763 * -2063427645);
			int i_1657_
			    = (i_1655_ * (class161.anInt1761 * 435863595
					  - i_1652_) + i_1656_ * i_1652_
			       >> class161.anInt1763 * -2063427645);
			anIntArray9379[i_1648_]
			    = anIntArray9379[i_1648_] + i_1657_ - i_1640_;
		    }
		    for (int i_1658_ = anInt9377; i_1658_ < anInt9394;
			 i_1658_++) {
			int i_1659_ = anIntArray9424[i_1658_] + i_1639_;
			int i_1660_ = anIntArray9395[i_1658_] + i_1641_;
			int i_1661_ = i_1659_ & i_1647_;
			int i_1662_ = i_1660_ & i_1647_;
			int i_1663_
			    = i_1659_ >> class161.anInt1763 * -2063427645;
			int i_1664_
			    = i_1660_ >> class161.anInt1763 * -2063427645;
			if (i_1663_ >= 0 && i_1663_ < is.length - 1
			    && i_1664_ >= 0 && i_1664_ < is[0].length - 1) {
			    int i_1665_
				= (((is[i_1663_][i_1664_]
				     * (class161.anInt1761 * 435863595
					- i_1661_))
				    + is[i_1663_ + 1][i_1664_] * i_1661_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1666_
				= (((is[i_1663_][i_1664_ + 1]
				     * (class161.anInt1761 * 435863595
					- i_1661_))
				    + is[i_1663_ + 1][i_1664_ + 1] * i_1661_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1667_
				= (i_1665_ * (class161.anInt1761 * 435863595
					      - i_1662_) + i_1666_ * i_1662_
				   >> class161.anInt1763 * -2063427645);
			    anIntArray9379[i_1658_]
				= anIntArray9379[i_1658_] + i_1667_ - i_1640_;
			}
		    }
		} else if (i == 2) {
		    if (aShort9423 == 0)
			return;
		    int i_1668_ = class161.anInt1761 * 435863595 - 1;
		    for (int i_1669_ = 0; i_1669_ < anInt9377; i_1669_++) {
			int i_1670_
			    = (anIntArray9379[i_1669_] << 16) / aShort9423;
			if (i_1670_ < i_1637_) {
			    int i_1671_ = anIntArray9424[i_1669_] + i_1639_;
			    int i_1672_ = anIntArray9395[i_1669_] + i_1641_;
			    int i_1673_ = i_1671_ & i_1668_;
			    int i_1674_ = i_1672_ & i_1668_;
			    int i_1675_
				= i_1671_ >> class161.anInt1763 * -2063427645;
			    int i_1676_
				= i_1672_ >> class161.anInt1763 * -2063427645;
			    int i_1677_
				= (((is[i_1675_][i_1676_]
				     * (class161.anInt1761 * 435863595
					- i_1673_))
				    + is[i_1675_ + 1][i_1676_] * i_1673_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1678_
				= (((is[i_1675_][i_1676_ + 1]
				     * (class161.anInt1761 * 435863595
					- i_1673_))
				    + is[i_1675_ + 1][i_1676_ + 1] * i_1673_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1679_
				= (i_1677_ * (class161.anInt1761 * 435863595
					      - i_1674_) + i_1678_ * i_1674_
				   >> class161.anInt1763 * -2063427645);
			    anIntArray9379[i_1669_]
				= (anIntArray9379[i_1669_]
				   + ((i_1679_ - i_1640_) * (i_1637_ - i_1670_)
				      / i_1637_));
			} else
			    anIntArray9379[i_1669_] = anIntArray9379[i_1669_];
		    }
		    for (int i_1680_ = anInt9377; i_1680_ < anInt9394;
			 i_1680_++) {
			int i_1681_
			    = (anIntArray9379[i_1680_] << 16) / aShort9423;
			if (i_1681_ < i_1637_) {
			    int i_1682_ = anIntArray9424[i_1680_] + i_1639_;
			    int i_1683_ = anIntArray9395[i_1680_] + i_1641_;
			    int i_1684_ = i_1682_ & i_1668_;
			    int i_1685_ = i_1683_ & i_1668_;
			    int i_1686_
				= i_1682_ >> class161.anInt1763 * -2063427645;
			    int i_1687_
				= i_1683_ >> class161.anInt1763 * -2063427645;
			    if (i_1686_ >= 0
				&& i_1686_ < class161.anInt1759 * 363736815 - 1
				&& i_1687_ >= 0
				&& (i_1687_
				    < class161.anInt1760 * -1152334393 - 1)) {
				int i_1688_
				    = (((is[i_1686_][i_1687_]
					 * (class161.anInt1761 * 435863595
					    - i_1684_))
					+ is[i_1686_ + 1][i_1687_] * i_1684_)
				       >> class161.anInt1763 * -2063427645);
				int i_1689_
				    = (((is[i_1686_][i_1687_ + 1]
					 * (class161.anInt1761 * 435863595
					    - i_1684_))
					+ (is[i_1686_ + 1][i_1687_ + 1]
					   * i_1684_))
				       >> class161.anInt1763 * -2063427645);
				int i_1690_
				    = ((i_1688_
					* (class161.anInt1761 * 435863595
					   - i_1685_)) + i_1689_ * i_1685_
				       >> class161.anInt1763 * -2063427645);
				anIntArray9379[i_1680_]
				    = (anIntArray9379[i_1680_]
				       + ((i_1690_ - i_1640_)
					  * (i_1637_ - i_1681_) / i_1637_));
			    }
			} else
			    anIntArray9379[i_1680_] = anIntArray9379[i_1680_];
		    }
		} else if (i == 3) {
		    int i_1691_ = (i_1637_ & 0xff) * 16;
		    int i_1692_ = (i_1637_ >> 8 & 0xff) * 16;
		    int i_1693_ = (i_1637_ >> 16 & 0xff) << 6;
		    int i_1694_ = (i_1637_ >> 24 & 0xff) << 6;
		    if (i_1639_ - (i_1691_ >> 1) < 0
			|| ((i_1639_ + (i_1691_ >> 1)
			     + class161.anInt1761 * 435863595)
			    >= (class161.anInt1759 * 363736815
				<< class161.anInt1763 * -2063427645))
			|| i_1641_ - (i_1692_ >> 1) < 0
			|| ((i_1641_ + (i_1692_ >> 1)
			     + class161.anInt1761 * 435863595)
			    >= (class161.anInt1760 * -1152334393
				<< class161.anInt1763 * -2063427645)))
			return;
		    method2938(class161, i_1639_, i_1640_, i_1641_, i_1691_,
			       i_1692_, i_1693_, i_1694_);
		} else if (i == 4) {
		    int i_1695_ = class161_1638_.anInt1761 * 435863595 - 1;
		    int i_1696_ = aShort9381 - aShort9423;
		    for (int i_1697_ = 0; i_1697_ < anInt9377; i_1697_++) {
			int i_1698_ = anIntArray9424[i_1697_] + i_1639_;
			int i_1699_ = anIntArray9395[i_1697_] + i_1641_;
			int i_1700_ = i_1698_ & i_1695_;
			int i_1701_ = i_1699_ & i_1695_;
			int i_1702_
			    = (i_1698_
			       >> class161_1638_.anInt1763 * -2063427645);
			int i_1703_
			    = (i_1699_
			       >> class161_1638_.anInt1763 * -2063427645);
			int i_1704_
			    = (((is_1646_[i_1702_][i_1703_]
				 * (class161_1638_.anInt1761 * 435863595
				    - i_1700_))
				+ is_1646_[i_1702_ + 1][i_1703_] * i_1700_)
			       >> class161_1638_.anInt1763 * -2063427645);
			int i_1705_
			    = (((is_1646_[i_1702_][i_1703_ + 1]
				 * (class161_1638_.anInt1761 * 435863595
				    - i_1700_))
				+ is_1646_[i_1702_ + 1][i_1703_ + 1] * i_1700_)
			       >> class161_1638_.anInt1763 * -2063427645);
			int i_1706_
			    = (i_1704_ * (class161_1638_.anInt1761 * 435863595
					  - i_1701_) + i_1705_ * i_1701_
			       >> class161_1638_.anInt1763 * -2063427645);
			anIntArray9379[i_1697_]
			    = (anIntArray9379[i_1697_] + (i_1706_ - i_1640_)
			       + i_1696_);
		    }
		    for (int i_1707_ = anInt9377; i_1707_ < anInt9394;
			 i_1707_++) {
			int i_1708_ = anIntArray9424[i_1707_] + i_1639_;
			int i_1709_ = anIntArray9395[i_1707_] + i_1641_;
			int i_1710_ = i_1708_ & i_1695_;
			int i_1711_ = i_1709_ & i_1695_;
			int i_1712_
			    = (i_1708_
			       >> class161_1638_.anInt1763 * -2063427645);
			int i_1713_
			    = (i_1709_
			       >> class161_1638_.anInt1763 * -2063427645);
			if (i_1712_ >= 0
			    && (i_1712_
				< class161_1638_.anInt1759 * 363736815 - 1)
			    && i_1713_ >= 0
			    && i_1713_ < (class161_1638_.anInt1760
					  * -1152334393) - 1) {
			    int i_1714_
				= (((is_1646_[i_1712_][i_1713_]
				     * (class161_1638_.anInt1761 * 435863595
					- i_1710_))
				    + is_1646_[i_1712_ + 1][i_1713_] * i_1710_)
				   >> class161_1638_.anInt1763 * -2063427645);
			    int i_1715_
				= (((is_1646_[i_1712_][i_1713_ + 1]
				     * (class161_1638_.anInt1761 * 435863595
					- i_1710_))
				    + (is_1646_[i_1712_ + 1][i_1713_ + 1]
				       * i_1710_))
				   >> class161_1638_.anInt1763 * -2063427645);
			    int i_1716_
				= ((i_1714_
				    * (class161_1638_.anInt1761 * 435863595
				       - i_1711_)) + i_1715_ * i_1711_
				   >> class161_1638_.anInt1763 * -2063427645);
			    anIntArray9379[i_1707_]
				= (anIntArray9379[i_1707_]
				   + (i_1716_ - i_1640_) + i_1696_);
			}
		    }
		} else if (i == 5) {
		    int i_1717_ = class161_1638_.anInt1761 * 435863595 - 1;
		    int i_1718_ = aShort9381 - aShort9423;
		    for (int i_1719_ = 0; i_1719_ < anInt9377; i_1719_++) {
			int i_1720_ = anIntArray9424[i_1719_] + i_1639_;
			int i_1721_ = anIntArray9395[i_1719_] + i_1641_;
			int i_1722_ = i_1720_ & i_1717_;
			int i_1723_ = i_1721_ & i_1717_;
			int i_1724_
			    = i_1720_ >> class161.anInt1763 * -2063427645;
			int i_1725_
			    = i_1721_ >> class161.anInt1763 * -2063427645;
			int i_1726_
			    = (((is[i_1724_][i_1725_]
				 * (class161.anInt1761 * 435863595 - i_1722_))
				+ is[i_1724_ + 1][i_1725_] * i_1722_)
			       >> class161.anInt1763 * -2063427645);
			int i_1727_
			    = (((is[i_1724_][i_1725_ + 1]
				 * (class161.anInt1761 * 435863595 - i_1722_))
				+ is[i_1724_ + 1][i_1725_ + 1] * i_1722_)
			       >> class161.anInt1763 * -2063427645);
			int i_1728_
			    = (i_1726_ * (class161.anInt1761 * 435863595
					  - i_1723_) + i_1727_ * i_1723_
			       >> class161.anInt1763 * -2063427645);
			i_1726_ = (((is_1646_[i_1724_][i_1725_]
				     * (class161_1638_.anInt1761 * 435863595
					- i_1722_))
				    + is_1646_[i_1724_ + 1][i_1725_] * i_1722_)
				   >> class161_1638_.anInt1763 * -2063427645);
			i_1727_
			    = (((is_1646_[i_1724_][i_1725_ + 1]
				 * (class161_1638_.anInt1761 * 435863595
				    - i_1722_))
				+ is_1646_[i_1724_ + 1][i_1725_ + 1] * i_1722_)
			       >> class161_1638_.anInt1763 * -2063427645);
			int i_1729_
			    = (i_1726_ * (class161_1638_.anInt1761 * 435863595
					  - i_1723_) + i_1727_ * i_1723_
			       >> class161_1638_.anInt1763 * -2063427645);
			int i_1730_ = i_1728_ - i_1729_ - i_1637_;
			anIntArray9379[i_1719_] = ((anIntArray9379[i_1719_]
						    << 8) / i_1718_ * i_1730_
						   >> 8) - (i_1640_ - i_1728_);
		    }
		    for (int i_1731_ = anInt9377; i_1731_ < anInt9394;
			 i_1731_++) {
			int i_1732_ = anIntArray9424[i_1731_] + i_1639_;
			int i_1733_ = anIntArray9395[i_1731_] + i_1641_;
			int i_1734_ = i_1732_ & i_1717_;
			int i_1735_ = i_1733_ & i_1717_;
			int i_1736_
			    = i_1732_ >> class161.anInt1763 * -2063427645;
			int i_1737_
			    = i_1733_ >> class161.anInt1763 * -2063427645;
			if (i_1736_ >= 0
			    && i_1736_ < class161.anInt1759 * 363736815 - 1
			    && (i_1736_
				< class161_1638_.anInt1759 * 363736815 - 1)
			    && i_1737_ >= 0
			    && i_1737_ < class161.anInt1760 * -1152334393 - 1
			    && i_1737_ < (class161_1638_.anInt1760
					  * -1152334393) - 1) {
			    int i_1738_
				= (((is[i_1736_][i_1737_]
				     * (class161.anInt1761 * 435863595
					- i_1734_))
				    + is[i_1736_ + 1][i_1737_] * i_1734_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1739_
				= (((is[i_1736_][i_1737_ + 1]
				     * (class161.anInt1761 * 435863595
					- i_1734_))
				    + is[i_1736_ + 1][i_1737_ + 1] * i_1734_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1740_
				= (i_1738_ * (class161.anInt1761 * 435863595
					      - i_1735_) + i_1739_ * i_1735_
				   >> class161.anInt1763 * -2063427645);
			    i_1738_
				= (((is_1646_[i_1736_][i_1737_]
				     * (class161_1638_.anInt1761 * 435863595
					- i_1734_))
				    + is_1646_[i_1736_ + 1][i_1737_] * i_1734_)
				   >> class161_1638_.anInt1763 * -2063427645);
			    i_1739_
				= (((is_1646_[i_1736_][i_1737_ + 1]
				     * (class161_1638_.anInt1761 * 435863595
					- i_1734_))
				    + (is_1646_[i_1736_ + 1][i_1737_ + 1]
				       * i_1734_))
				   >> class161_1638_.anInt1763 * -2063427645);
			    int i_1741_
				= ((i_1738_
				    * (class161_1638_.anInt1761 * 435863595
				       - i_1735_)) + i_1739_ * i_1735_
				   >> class161_1638_.anInt1763 * -2063427645);
			    int i_1742_ = i_1740_ - i_1741_ - i_1637_;
			    anIntArray9379[i_1731_]
				= (((anIntArray9379[i_1731_] << 8) / i_1718_
				    * i_1742_)
				   >> 8) - (i_1640_ - i_1740_);
			}
		    }
		}
		aBool9420 = false;
	    }
	}
    }
    
    public boolean method3067() {
	return aBool9369;
    }
    
    public boolean method3032() {
	return aBool9380;
    }
    
    public boolean method3079() {
	return aBool9380;
    }
    
    public void method3101(int i) {
	if ((anInt9373 & 0x2000) != 8192)
	    throw new IllegalStateException();
	anInt9383 = i;
	anInt9364 = 0;
    }
    
    public void method3102(int i, int i_1743_, int i_1744_) {
	if (i != 0 && (anInt9373 & 0x1) != 1)
	    throw new IllegalStateException();
	if (i_1743_ != 0 && (anInt9373 & 0x2) != 2)
	    throw new IllegalStateException();
	if (i_1744_ != 0 && (anInt9373 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i_1745_ = 0; i_1745_ < anInt9394; i_1745_++) {
		anIntArray9424[i_1745_] += i;
		anIntArray9379[i_1745_] += i_1743_;
		anIntArray9395[i_1745_] += i_1744_;
	    }
	}
    }
    
    public void method3072() {
	if ((anInt9373 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int i = 0; i < anInt9394; i++)
		anIntArray9395[i] = -anIntArray9395[i];
	    if (aClass100Array9422 != null) {
		for (int i = 0; i < anInt9377; i++) {
		    if (aClass100Array9422[i] != null)
			aClass100Array9422[i].anInt1216
			    = -aClass100Array9422[i].anInt1216;
		}
	    }
	    if (aClass100Array9371 != null) {
		for (int i = 0; i < anInt9377; i++) {
		    if (aClass100Array9371[i] != null)
			aClass100Array9371[i].anInt1216
			    = -aClass100Array9371[i].anInt1216;
		}
	    }
	    if (aClass115Array9398 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aClass115Array9398[i] != null)
			aClass115Array9398[i].anInt1406
			    = -aClass115Array9398[i].anInt1406;
		}
	    }
	    short[] is = aShortArray9382;
	    aShortArray9382 = aShortArray9388;
	    aShortArray9388 = is;
	    if (aFloatArrayArray9401 != null) {
		for (int i = 0; i < anInt9375; i++) {
		    if (aFloatArrayArray9401[i] != null) {
			float f = aFloatArrayArray9401[i][0];
			aFloatArrayArray9401[i][0]
			    = aFloatArrayArray9401[i][2];
			aFloatArrayArray9401[i][2] = f;
		    }
		    if (aFloatArrayArray9390[i] != null) {
			float f = aFloatArrayArray9390[i][0];
			aFloatArrayArray9390[i][0]
			    = aFloatArrayArray9390[i][2];
			aFloatArrayArray9390[i][2] = f;
		    }
		}
	    }
	    aBool9420 = false;
	    anInt9364 = 0;
	}
    }
    
    public void method3073(int i, int i_1746_, Class161 class161,
			   Class161 class161_1747_, int i_1748_, int i_1749_,
			   int i_1750_) {
	if (i == 3) {
	    if ((anInt9373 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((anInt9373 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!aBool9420)
	    method15092();
	int i_1751_ = i_1748_ + aShort9368;
	int i_1752_ = i_1748_ + aShort9426;
	int i_1753_ = i_1750_ + aShort9431;
	int i_1754_ = i_1750_ + aShort9432;
	if (i == 4 || (i_1751_ >= 0
		       && ((i_1752_ + class161.anInt1761 * 435863595
			    >> class161.anInt1763 * -2063427645)
			   < class161.anInt1759 * 363736815)
		       && i_1753_ >= 0
		       && ((i_1754_ + class161.anInt1761 * 435863595
			    >> class161.anInt1763 * -2063427645)
			   < class161.anInt1760 * -1152334393))) {
	    int[][] is = class161.anIntArrayArray1762;
	    int[][] is_1755_ = null;
	    if (class161_1747_ != null)
		is_1755_ = class161_1747_.anIntArrayArray1762;
	    if (i == 4 || i == 5) {
		if (class161_1747_ == null
		    || (i_1751_ < 0
			|| ((i_1752_ + class161_1747_.anInt1761 * 435863595
			     >> class161_1747_.anInt1763 * -2063427645)
			    >= class161_1747_.anInt1759 * 363736815)
			|| i_1753_ < 0
			|| ((i_1754_ + class161_1747_.anInt1761 * 435863595
			     >> class161_1747_.anInt1763 * -2063427645)
			    >= class161_1747_.anInt1760 * -1152334393)))
		    return;
	    } else {
		i_1751_ >>= class161.anInt1763 * -2063427645;
		i_1752_ = (i_1752_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		i_1753_ >>= class161.anInt1763 * -2063427645;
		i_1754_ = (i_1754_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		if (is[i_1751_][i_1753_] == i_1749_
		    && is[i_1752_][i_1753_] == i_1749_
		    && is[i_1751_][i_1754_] == i_1749_
		    && is[i_1752_][i_1754_] == i_1749_)
		    return;
	    }
	    synchronized (this) {
		if (i == 1) {
		    int i_1756_ = class161.anInt1761 * 435863595 - 1;
		    for (int i_1757_ = 0; i_1757_ < anInt9377; i_1757_++) {
			int i_1758_ = anIntArray9424[i_1757_] + i_1748_;
			int i_1759_ = anIntArray9395[i_1757_] + i_1750_;
			int i_1760_ = i_1758_ & i_1756_;
			int i_1761_ = i_1759_ & i_1756_;
			int i_1762_
			    = i_1758_ >> class161.anInt1763 * -2063427645;
			int i_1763_
			    = i_1759_ >> class161.anInt1763 * -2063427645;
			int i_1764_
			    = (((is[i_1762_][i_1763_]
				 * (class161.anInt1761 * 435863595 - i_1760_))
				+ is[i_1762_ + 1][i_1763_] * i_1760_)
			       >> class161.anInt1763 * -2063427645);
			int i_1765_
			    = (((is[i_1762_][i_1763_ + 1]
				 * (class161.anInt1761 * 435863595 - i_1760_))
				+ is[i_1762_ + 1][i_1763_ + 1] * i_1760_)
			       >> class161.anInt1763 * -2063427645);
			int i_1766_
			    = (i_1764_ * (class161.anInt1761 * 435863595
					  - i_1761_) + i_1765_ * i_1761_
			       >> class161.anInt1763 * -2063427645);
			anIntArray9379[i_1757_]
			    = anIntArray9379[i_1757_] + i_1766_ - i_1749_;
		    }
		    for (int i_1767_ = anInt9377; i_1767_ < anInt9394;
			 i_1767_++) {
			int i_1768_ = anIntArray9424[i_1767_] + i_1748_;
			int i_1769_ = anIntArray9395[i_1767_] + i_1750_;
			int i_1770_ = i_1768_ & i_1756_;
			int i_1771_ = i_1769_ & i_1756_;
			int i_1772_
			    = i_1768_ >> class161.anInt1763 * -2063427645;
			int i_1773_
			    = i_1769_ >> class161.anInt1763 * -2063427645;
			if (i_1772_ >= 0 && i_1772_ < is.length - 1
			    && i_1773_ >= 0 && i_1773_ < is[0].length - 1) {
			    int i_1774_
				= (((is[i_1772_][i_1773_]
				     * (class161.anInt1761 * 435863595
					- i_1770_))
				    + is[i_1772_ + 1][i_1773_] * i_1770_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1775_
				= (((is[i_1772_][i_1773_ + 1]
				     * (class161.anInt1761 * 435863595
					- i_1770_))
				    + is[i_1772_ + 1][i_1773_ + 1] * i_1770_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1776_
				= (i_1774_ * (class161.anInt1761 * 435863595
					      - i_1771_) + i_1775_ * i_1771_
				   >> class161.anInt1763 * -2063427645);
			    anIntArray9379[i_1767_]
				= anIntArray9379[i_1767_] + i_1776_ - i_1749_;
			}
		    }
		} else if (i == 2) {
		    if (aShort9423 == 0)
			return;
		    int i_1777_ = class161.anInt1761 * 435863595 - 1;
		    for (int i_1778_ = 0; i_1778_ < anInt9377; i_1778_++) {
			int i_1779_
			    = (anIntArray9379[i_1778_] << 16) / aShort9423;
			if (i_1779_ < i_1746_) {
			    int i_1780_ = anIntArray9424[i_1778_] + i_1748_;
			    int i_1781_ = anIntArray9395[i_1778_] + i_1750_;
			    int i_1782_ = i_1780_ & i_1777_;
			    int i_1783_ = i_1781_ & i_1777_;
			    int i_1784_
				= i_1780_ >> class161.anInt1763 * -2063427645;
			    int i_1785_
				= i_1781_ >> class161.anInt1763 * -2063427645;
			    int i_1786_
				= (((is[i_1784_][i_1785_]
				     * (class161.anInt1761 * 435863595
					- i_1782_))
				    + is[i_1784_ + 1][i_1785_] * i_1782_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1787_
				= (((is[i_1784_][i_1785_ + 1]
				     * (class161.anInt1761 * 435863595
					- i_1782_))
				    + is[i_1784_ + 1][i_1785_ + 1] * i_1782_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1788_
				= (i_1786_ * (class161.anInt1761 * 435863595
					      - i_1783_) + i_1787_ * i_1783_
				   >> class161.anInt1763 * -2063427645);
			    anIntArray9379[i_1778_]
				= (anIntArray9379[i_1778_]
				   + ((i_1788_ - i_1749_) * (i_1746_ - i_1779_)
				      / i_1746_));
			} else
			    anIntArray9379[i_1778_] = anIntArray9379[i_1778_];
		    }
		    for (int i_1789_ = anInt9377; i_1789_ < anInt9394;
			 i_1789_++) {
			int i_1790_
			    = (anIntArray9379[i_1789_] << 16) / aShort9423;
			if (i_1790_ < i_1746_) {
			    int i_1791_ = anIntArray9424[i_1789_] + i_1748_;
			    int i_1792_ = anIntArray9395[i_1789_] + i_1750_;
			    int i_1793_ = i_1791_ & i_1777_;
			    int i_1794_ = i_1792_ & i_1777_;
			    int i_1795_
				= i_1791_ >> class161.anInt1763 * -2063427645;
			    int i_1796_
				= i_1792_ >> class161.anInt1763 * -2063427645;
			    if (i_1795_ >= 0
				&& i_1795_ < class161.anInt1759 * 363736815 - 1
				&& i_1796_ >= 0
				&& (i_1796_
				    < class161.anInt1760 * -1152334393 - 1)) {
				int i_1797_
				    = (((is[i_1795_][i_1796_]
					 * (class161.anInt1761 * 435863595
					    - i_1793_))
					+ is[i_1795_ + 1][i_1796_] * i_1793_)
				       >> class161.anInt1763 * -2063427645);
				int i_1798_
				    = (((is[i_1795_][i_1796_ + 1]
					 * (class161.anInt1761 * 435863595
					    - i_1793_))
					+ (is[i_1795_ + 1][i_1796_ + 1]
					   * i_1793_))
				       >> class161.anInt1763 * -2063427645);
				int i_1799_
				    = ((i_1797_
					* (class161.anInt1761 * 435863595
					   - i_1794_)) + i_1798_ * i_1794_
				       >> class161.anInt1763 * -2063427645);
				anIntArray9379[i_1789_]
				    = (anIntArray9379[i_1789_]
				       + ((i_1799_ - i_1749_)
					  * (i_1746_ - i_1790_) / i_1746_));
			    }
			} else
			    anIntArray9379[i_1789_] = anIntArray9379[i_1789_];
		    }
		} else if (i == 3) {
		    int i_1800_ = (i_1746_ & 0xff) * 16;
		    int i_1801_ = (i_1746_ >> 8 & 0xff) * 16;
		    int i_1802_ = (i_1746_ >> 16 & 0xff) << 6;
		    int i_1803_ = (i_1746_ >> 24 & 0xff) << 6;
		    if (i_1748_ - (i_1800_ >> 1) < 0
			|| ((i_1748_ + (i_1800_ >> 1)
			     + class161.anInt1761 * 435863595)
			    >= (class161.anInt1759 * 363736815
				<< class161.anInt1763 * -2063427645))
			|| i_1750_ - (i_1801_ >> 1) < 0
			|| ((i_1750_ + (i_1801_ >> 1)
			     + class161.anInt1761 * 435863595)
			    >= (class161.anInt1760 * -1152334393
				<< class161.anInt1763 * -2063427645)))
			return;
		    method2938(class161, i_1748_, i_1749_, i_1750_, i_1800_,
			       i_1801_, i_1802_, i_1803_);
		} else if (i == 4) {
		    int i_1804_ = class161_1747_.anInt1761 * 435863595 - 1;
		    int i_1805_ = aShort9381 - aShort9423;
		    for (int i_1806_ = 0; i_1806_ < anInt9377; i_1806_++) {
			int i_1807_ = anIntArray9424[i_1806_] + i_1748_;
			int i_1808_ = anIntArray9395[i_1806_] + i_1750_;
			int i_1809_ = i_1807_ & i_1804_;
			int i_1810_ = i_1808_ & i_1804_;
			int i_1811_
			    = (i_1807_
			       >> class161_1747_.anInt1763 * -2063427645);
			int i_1812_
			    = (i_1808_
			       >> class161_1747_.anInt1763 * -2063427645);
			int i_1813_
			    = (((is_1755_[i_1811_][i_1812_]
				 * (class161_1747_.anInt1761 * 435863595
				    - i_1809_))
				+ is_1755_[i_1811_ + 1][i_1812_] * i_1809_)
			       >> class161_1747_.anInt1763 * -2063427645);
			int i_1814_
			    = (((is_1755_[i_1811_][i_1812_ + 1]
				 * (class161_1747_.anInt1761 * 435863595
				    - i_1809_))
				+ is_1755_[i_1811_ + 1][i_1812_ + 1] * i_1809_)
			       >> class161_1747_.anInt1763 * -2063427645);
			int i_1815_
			    = (i_1813_ * (class161_1747_.anInt1761 * 435863595
					  - i_1810_) + i_1814_ * i_1810_
			       >> class161_1747_.anInt1763 * -2063427645);
			anIntArray9379[i_1806_]
			    = (anIntArray9379[i_1806_] + (i_1815_ - i_1749_)
			       + i_1805_);
		    }
		    for (int i_1816_ = anInt9377; i_1816_ < anInt9394;
			 i_1816_++) {
			int i_1817_ = anIntArray9424[i_1816_] + i_1748_;
			int i_1818_ = anIntArray9395[i_1816_] + i_1750_;
			int i_1819_ = i_1817_ & i_1804_;
			int i_1820_ = i_1818_ & i_1804_;
			int i_1821_
			    = (i_1817_
			       >> class161_1747_.anInt1763 * -2063427645);
			int i_1822_
			    = (i_1818_
			       >> class161_1747_.anInt1763 * -2063427645);
			if (i_1821_ >= 0
			    && (i_1821_
				< class161_1747_.anInt1759 * 363736815 - 1)
			    && i_1822_ >= 0
			    && i_1822_ < (class161_1747_.anInt1760
					  * -1152334393) - 1) {
			    int i_1823_
				= (((is_1755_[i_1821_][i_1822_]
				     * (class161_1747_.anInt1761 * 435863595
					- i_1819_))
				    + is_1755_[i_1821_ + 1][i_1822_] * i_1819_)
				   >> class161_1747_.anInt1763 * -2063427645);
			    int i_1824_
				= (((is_1755_[i_1821_][i_1822_ + 1]
				     * (class161_1747_.anInt1761 * 435863595
					- i_1819_))
				    + (is_1755_[i_1821_ + 1][i_1822_ + 1]
				       * i_1819_))
				   >> class161_1747_.anInt1763 * -2063427645);
			    int i_1825_
				= ((i_1823_
				    * (class161_1747_.anInt1761 * 435863595
				       - i_1820_)) + i_1824_ * i_1820_
				   >> class161_1747_.anInt1763 * -2063427645);
			    anIntArray9379[i_1816_]
				= (anIntArray9379[i_1816_]
				   + (i_1825_ - i_1749_) + i_1805_);
			}
		    }
		} else if (i == 5) {
		    int i_1826_ = class161_1747_.anInt1761 * 435863595 - 1;
		    int i_1827_ = aShort9381 - aShort9423;
		    for (int i_1828_ = 0; i_1828_ < anInt9377; i_1828_++) {
			int i_1829_ = anIntArray9424[i_1828_] + i_1748_;
			int i_1830_ = anIntArray9395[i_1828_] + i_1750_;
			int i_1831_ = i_1829_ & i_1826_;
			int i_1832_ = i_1830_ & i_1826_;
			int i_1833_
			    = i_1829_ >> class161.anInt1763 * -2063427645;
			int i_1834_
			    = i_1830_ >> class161.anInt1763 * -2063427645;
			int i_1835_
			    = (((is[i_1833_][i_1834_]
				 * (class161.anInt1761 * 435863595 - i_1831_))
				+ is[i_1833_ + 1][i_1834_] * i_1831_)
			       >> class161.anInt1763 * -2063427645);
			int i_1836_
			    = (((is[i_1833_][i_1834_ + 1]
				 * (class161.anInt1761 * 435863595 - i_1831_))
				+ is[i_1833_ + 1][i_1834_ + 1] * i_1831_)
			       >> class161.anInt1763 * -2063427645);
			int i_1837_
			    = (i_1835_ * (class161.anInt1761 * 435863595
					  - i_1832_) + i_1836_ * i_1832_
			       >> class161.anInt1763 * -2063427645);
			i_1835_ = (((is_1755_[i_1833_][i_1834_]
				     * (class161_1747_.anInt1761 * 435863595
					- i_1831_))
				    + is_1755_[i_1833_ + 1][i_1834_] * i_1831_)
				   >> class161_1747_.anInt1763 * -2063427645);
			i_1836_
			    = (((is_1755_[i_1833_][i_1834_ + 1]
				 * (class161_1747_.anInt1761 * 435863595
				    - i_1831_))
				+ is_1755_[i_1833_ + 1][i_1834_ + 1] * i_1831_)
			       >> class161_1747_.anInt1763 * -2063427645);
			int i_1838_
			    = (i_1835_ * (class161_1747_.anInt1761 * 435863595
					  - i_1832_) + i_1836_ * i_1832_
			       >> class161_1747_.anInt1763 * -2063427645);
			int i_1839_ = i_1837_ - i_1838_ - i_1746_;
			anIntArray9379[i_1828_] = ((anIntArray9379[i_1828_]
						    << 8) / i_1827_ * i_1839_
						   >> 8) - (i_1749_ - i_1837_);
		    }
		    for (int i_1840_ = anInt9377; i_1840_ < anInt9394;
			 i_1840_++) {
			int i_1841_ = anIntArray9424[i_1840_] + i_1748_;
			int i_1842_ = anIntArray9395[i_1840_] + i_1750_;
			int i_1843_ = i_1841_ & i_1826_;
			int i_1844_ = i_1842_ & i_1826_;
			int i_1845_
			    = i_1841_ >> class161.anInt1763 * -2063427645;
			int i_1846_
			    = i_1842_ >> class161.anInt1763 * -2063427645;
			if (i_1845_ >= 0
			    && i_1845_ < class161.anInt1759 * 363736815 - 1
			    && (i_1845_
				< class161_1747_.anInt1759 * 363736815 - 1)
			    && i_1846_ >= 0
			    && i_1846_ < class161.anInt1760 * -1152334393 - 1
			    && i_1846_ < (class161_1747_.anInt1760
					  * -1152334393) - 1) {
			    int i_1847_
				= (((is[i_1845_][i_1846_]
				     * (class161.anInt1761 * 435863595
					- i_1843_))
				    + is[i_1845_ + 1][i_1846_] * i_1843_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1848_
				= (((is[i_1845_][i_1846_ + 1]
				     * (class161.anInt1761 * 435863595
					- i_1843_))
				    + is[i_1845_ + 1][i_1846_ + 1] * i_1843_)
				   >> class161.anInt1763 * -2063427645);
			    int i_1849_
				= (i_1847_ * (class161.anInt1761 * 435863595
					      - i_1844_) + i_1848_ * i_1844_
				   >> class161.anInt1763 * -2063427645);
			    i_1847_
				= (((is_1755_[i_1845_][i_1846_]
				     * (class161_1747_.anInt1761 * 435863595
					- i_1843_))
				    + is_1755_[i_1845_ + 1][i_1846_] * i_1843_)
				   >> class161_1747_.anInt1763 * -2063427645);
			    i_1848_
				= (((is_1755_[i_1845_][i_1846_ + 1]
				     * (class161_1747_.anInt1761 * 435863595
					- i_1843_))
				    + (is_1755_[i_1845_ + 1][i_1846_ + 1]
				       * i_1843_))
				   >> class161_1747_.anInt1763 * -2063427645);
			    int i_1850_
				= ((i_1847_
				    * (class161_1747_.anInt1761 * 435863595
				       - i_1844_)) + i_1848_ * i_1844_
				   >> class161_1747_.anInt1763 * -2063427645);
			    int i_1851_ = i_1849_ - i_1850_ - i_1746_;
			    anIntArray9379[i_1840_]
				= (((anIntArray9379[i_1840_] << 8) / i_1827_
				    * i_1851_)
				   >> 8) - (i_1749_ - i_1849_);
			}
		    }
		}
		aBool9420 = false;
	    }
	}
    }
    
    void method15151() {
	synchronized (this) {
	    for (int i = 0; i < anInt9394; i++) {
		int i_1852_ = anIntArray9424[i];
		anIntArray9424[i] = anIntArray9395[i];
		anIntArray9395[i] = -i_1852_;
	    }
	    method15084();
	}
    }
    
    public int method3075() {
	if (!aBool9420)
	    method15092();
	return aShort9423;
    }
    
    public void method3056(byte i, byte[] is) {
	if ((anInt9373 & 0x100000) == 0)
	    throw new RuntimeException();
	if (aByteArray9406 == null)
	    aByteArray9406 = new byte[anInt9375];
	if (is == null) {
	    for (int i_1853_ = 0; i_1853_ < anInt9375; i_1853_++)
		aByteArray9406[i_1853_] = i;
	} else {
	    for (int i_1854_ = 0; i_1854_ < anInt9375; i_1854_++) {
		int i_1855_ = 255 - ((255 - (is[i_1854_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9406[i_1854_] = (byte) i_1855_;
	    }
	}
	if (anInt9364 == 2)
	    anInt9364 = 1;
    }
    
    public int method3077() {
	if (!aBool9420)
	    method15092();
	return aShort9423;
    }
    
    public int method3030() {
	if (!aBool9420)
	    method15092();
	return aShort9413;
    }
    
    public void method3044(int i) {
	if ((anInt9373 & 0x1000) != 4096)
	    throw new IllegalStateException();
	anInt9374 = i;
	anInt9364 = 0;
    }
    
    public boolean method2954(int i, int i_1856_, Class444 class444,
			      boolean bool, int i_1857_) {
	method15065(aClass182_Sub2_9433.method15223(Thread.currentThread()));
	Class435 class435 = aClass110_9362.aClass435_1340;
	class435.method7040(class444);
	Class435 class435_1858_ = aClass110_9362.aClass435_1341;
	class435_1858_.method6947(class435);
	class435_1858_.method6950(aClass182_Sub2_9433.aClass435_9483);
	boolean bool_1859_ = false;
	int i_1860_ = 2147483647;
	int i_1861_ = -2147483648;
	int i_1862_ = 2147483647;
	int i_1863_ = -2147483648;
	if (!aBool9420)
	    method15092();
	int i_1864_ = aShort9426 - aShort9368 >> 1;
	int i_1865_ = aShort9381 - aShort9423 >> 1;
	int i_1866_ = aShort9432 - aShort9431 >> 1;
	int i_1867_ = aShort9368 + i_1864_;
	int i_1868_ = aShort9423 + i_1865_;
	int i_1869_ = aShort9431 + i_1866_;
	int i_1870_ = i_1867_ - (i_1864_ << i_1857_);
	int i_1871_ = i_1868_ - (i_1865_ << i_1857_);
	int i_1872_ = i_1869_ - (i_1866_ << i_1857_);
	int i_1873_ = i_1867_ + (i_1864_ << i_1857_);
	int i_1874_ = i_1868_ + (i_1865_ << i_1857_);
	int i_1875_ = i_1869_ + (i_1866_ << i_1857_);
	anIntArray9439[0] = i_1870_;
	anIntArray9410[0] = i_1871_;
	anIntArray9384[0] = i_1872_;
	anIntArray9439[1] = i_1873_;
	anIntArray9410[1] = i_1871_;
	anIntArray9384[1] = i_1872_;
	anIntArray9439[2] = i_1870_;
	anIntArray9410[2] = i_1874_;
	anIntArray9384[2] = i_1872_;
	anIntArray9439[3] = i_1873_;
	anIntArray9410[3] = i_1874_;
	anIntArray9384[3] = i_1872_;
	anIntArray9439[4] = i_1870_;
	anIntArray9410[4] = i_1871_;
	anIntArray9384[4] = i_1875_;
	anIntArray9439[5] = i_1873_;
	anIntArray9410[5] = i_1871_;
	anIntArray9384[5] = i_1875_;
	anIntArray9439[6] = i_1870_;
	anIntArray9410[6] = i_1874_;
	anIntArray9384[6] = i_1875_;
	anIntArray9439[7] = i_1873_;
	anIntArray9410[7] = i_1874_;
	anIntArray9384[7] = i_1875_;
	for (int i_1876_ = 0; i_1876_ < 8; i_1876_++) {
	    int i_1877_ = anIntArray9439[i_1876_];
	    int i_1878_ = anIntArray9410[i_1876_];
	    int i_1879_ = anIntArray9384[i_1876_];
	    float f = (class435_1858_.aFloatArray4830[2] * (float) i_1877_
		       + class435_1858_.aFloatArray4830[6] * (float) i_1878_
		       + class435_1858_.aFloatArray4830[10] * (float) i_1879_
		       + class435_1858_.aFloatArray4830[14]);
	    float f_1880_
		= (class435_1858_.aFloatArray4830[3] * (float) i_1877_
		   + class435_1858_.aFloatArray4830[7] * (float) i_1878_
		   + class435_1858_.aFloatArray4830[11] * (float) i_1879_
		   + class435_1858_.aFloatArray4830[15]);
	    if (f >= -f_1880_) {
		float f_1881_
		    = (class435_1858_.aFloatArray4830[0] * (float) i_1877_
		       + class435_1858_.aFloatArray4830[4] * (float) i_1878_
		       + class435_1858_.aFloatArray4830[8] * (float) i_1879_
		       + class435_1858_.aFloatArray4830[12]);
		float f_1882_
		    = (class435_1858_.aFloatArray4830[1] * (float) i_1877_
		       + class435_1858_.aFloatArray4830[5] * (float) i_1878_
		       + class435_1858_.aFloatArray4830[9] * (float) i_1879_
		       + class435_1858_.aFloatArray4830[13]);
		int i_1883_ = (int) (aClass182_Sub2_9433.aFloat9495
				     + (aClass182_Sub2_9433.aFloat9489
					* f_1881_ / f_1880_));
		int i_1884_ = (int) (aClass182_Sub2_9433.aFloat9492
				     + (aClass182_Sub2_9433.aFloat9491
					* f_1882_ / f_1880_));
		if (i_1883_ < i_1860_)
		    i_1860_ = i_1883_;
		if (i_1883_ > i_1861_)
		    i_1861_ = i_1883_;
		if (i_1884_ < i_1862_)
		    i_1862_ = i_1884_;
		if (i_1884_ > i_1863_)
		    i_1863_ = i_1884_;
		bool_1859_ = true;
	    }
	}
	if (bool_1859_ && i > i_1860_ && i < i_1861_ && i_1856_ > i_1862_
	    && i_1856_ < i_1863_) {
	    if (bool)
		return true;
	    for (int i_1885_ = 0; i_1885_ < anInt9394; i_1885_++) {
		int i_1886_ = anIntArray9424[i_1885_];
		int i_1887_ = anIntArray9379[i_1885_];
		int i_1888_ = anIntArray9395[i_1885_];
		float f
		    = (class435_1858_.aFloatArray4830[2] * (float) i_1886_
		       + class435_1858_.aFloatArray4830[6] * (float) i_1887_
		       + class435_1858_.aFloatArray4830[10] * (float) i_1888_
		       + class435_1858_.aFloatArray4830[14]);
		float f_1889_
		    = (class435_1858_.aFloatArray4830[3] * (float) i_1886_
		       + class435_1858_.aFloatArray4830[7] * (float) i_1887_
		       + class435_1858_.aFloatArray4830[11] * (float) i_1888_
		       + class435_1858_.aFloatArray4830[15]);
		if (f >= -f_1889_) {
		    float f_1890_
			= (class435_1858_.aFloatArray4830[0] * (float) i_1886_
			   + (class435_1858_.aFloatArray4830[4]
			      * (float) i_1887_)
			   + (class435_1858_.aFloatArray4830[8]
			      * (float) i_1888_)
			   + class435_1858_.aFloatArray4830[12]);
		    float f_1891_
			= (class435_1858_.aFloatArray4830[1] * (float) i_1886_
			   + (class435_1858_.aFloatArray4830[5]
			      * (float) i_1887_)
			   + (class435_1858_.aFloatArray4830[9]
			      * (float) i_1888_)
			   + class435_1858_.aFloatArray4830[13]);
		    aFloatArray9435[i_1885_]
			= (float) (int) (aClass182_Sub2_9433.aFloat9495
					 + (aClass182_Sub2_9433.aFloat9489
					    * f_1890_ / f_1889_));
		    aFloatArray9400[i_1885_]
			= (float) (int) (aClass182_Sub2_9433.aFloat9492
					 + (aClass182_Sub2_9433.aFloat9491
					    * f_1891_ / f_1889_));
		} else
		    aFloatArray9435[i_1885_] = -999999.0F;
	    }
	    for (int i_1892_ = 0; i_1892_ < anInt9385; i_1892_++) {
		if (aFloatArray9435[aShortArray9382[i_1892_]] != -999999.0F
		    && aFloatArray9435[aShortArray9387[i_1892_]] != -999999.0F
		    && aFloatArray9435[aShortArray9388[i_1892_]] != -999999.0F
		    && method15081(i, i_1856_,
				   aFloatArray9400[aShortArray9382[i_1892_]],
				   aFloatArray9400[aShortArray9387[i_1892_]],
				   aFloatArray9400[aShortArray9388[i_1892_]],
				   aFloatArray9435[aShortArray9382[i_1892_]],
				   aFloatArray9435[aShortArray9387[i_1892_]],
				   aFloatArray9435[aShortArray9388[i_1892_]]))
		    return true;
	    }
	}
	return false;
    }
    
    public int method3081() {
	return anInt9383;
    }
    
    public void method2935(int i) {
	if ((anInt9373 & 0xd) != 13)
	    throw new IllegalStateException();
	if (aClass100Array9422 != null) {
	    if (i == 4096)
		method15078();
	    else if (i == 8192)
		method15079();
	    else if (i == 12288)
		method15140();
	    else {
		int i_1893_ = Class436.anIntArray4831[i];
		int i_1894_ = Class436.anIntArray4838[i];
		synchronized (this) {
		    for (int i_1895_ = 0; i_1895_ < anInt9377; i_1895_++) {
			int i_1896_ = ((anIntArray9395[i_1895_] * i_1893_
					+ anIntArray9424[i_1895_] * i_1894_)
				       >> 14);
			anIntArray9395[i_1895_]
			    = (anIntArray9395[i_1895_] * i_1894_
			       - anIntArray9424[i_1895_] * i_1893_) >> 14;
			anIntArray9424[i_1895_] = i_1896_;
			if (aClass100Array9422[i_1895_] != null) {
			    i_1896_ = ((aClass100Array9422[i_1895_].anInt1216
					* i_1893_)
				       + (aClass100Array9422[i_1895_].anInt1215
					  * i_1894_)) >> 14;
			    aClass100Array9422[i_1895_].anInt1216
				= ((aClass100Array9422[i_1895_].anInt1216
				    * i_1894_)
				   - (aClass100Array9422[i_1895_].anInt1215
				      * i_1893_)) >> 14;
			    aClass100Array9422[i_1895_].anInt1215 = i_1896_;
			}
		    }
		    if (aClass115Array9398 != null) {
			for (int i_1897_ = 0; i_1897_ < anInt9375; i_1897_++) {
			    if (aClass115Array9398[i_1897_] != null) {
				int i_1898_
				    = ((aClass115Array9398[i_1897_].anInt1406
					* i_1893_)
				       + (aClass115Array9398[i_1897_].anInt1407
					  * i_1894_)) >> 14;
				aClass115Array9398[i_1897_].anInt1406
				    = ((aClass115Array9398[i_1897_].anInt1406
					* i_1894_)
				       - (aClass115Array9398[i_1897_].anInt1407
					  * i_1893_)) >> 14;
				aClass115Array9398[i_1897_].anInt1407
				    = i_1898_;
			    }
			}
		    }
		    for (int i_1899_ = anInt9377; i_1899_ < anInt9394;
			 i_1899_++) {
			int i_1900_ = ((anIntArray9395[i_1899_] * i_1893_
					+ anIntArray9424[i_1899_] * i_1894_)
				       >> 14);
			anIntArray9395[i_1899_]
			    = (anIntArray9395[i_1899_] * i_1894_
			       - anIntArray9424[i_1899_] * i_1893_) >> 14;
			anIntArray9424[i_1899_] = i_1900_;
		    }
		    anInt9364 = 0;
		    aBool9420 = false;
		}
	    }
	} else
	    method2930(i);
    }
    
    int method15152(int i, int i_1901_) {
	i_1901_ = i_1901_ * (i & 0x7f) >> 7;
	if (i_1901_ < 2)
	    i_1901_ = 2;
	else if (i_1901_ > 126)
	    i_1901_ = 126;
	return (i & 0xff80) + i_1901_;
    }
    
    void method15153() {
	for (int i = 0; i < anInt9375; i++) {
	    short i_1902_
		= aShortArray9402 != null ? aShortArray9402[i] : (short) -1;
	    if (i_1902_ == -1) {
		int i_1903_ = aShortArray9403[i] & 0xffff;
		int i_1904_ = (i_1903_ & 0x7f) * anInt9374 >> 7;
		short i_1905_ = Class504.method8313(i_1903_ & ~0x7f | i_1904_,
						    456596342);
		if (anIntArray9393[i] == -1) {
		    int i_1906_ = anIntArray9391[i] & ~0x1ffff;
		    anIntArray9391[i]
			= i_1906_ | Class159.method2568(i_1905_, i_1906_ >> 17,
							-206182926);
		} else if (anIntArray9393[i] != -2) {
		    int i_1907_ = anIntArray9391[i] & ~0x1ffff;
		    anIntArray9391[i]
			= i_1907_ | Class159.method2568(i_1905_, i_1907_ >> 17,
							-1921045972);
		    i_1907_ = anIntArray9392[i] & ~0x1ffff;
		    anIntArray9392[i]
			= i_1907_ | Class159.method2568(i_1905_, i_1907_ >> 17,
							-742253469);
		    i_1907_ = anIntArray9393[i] & ~0x1ffff;
		    anIntArray9393[i]
			= i_1907_ | Class159.method2568(i_1905_, i_1907_ >> 17,
							-1571923875);
		}
	    }
	}
	anInt9364 = 2;
    }
    
    public void method2968(Class444 class444, int i, boolean bool) {
	if (aShortArray9378 != null) {
	    Class110 class110
		= aClass182_Sub2_9433.method15223(Thread.currentThread());
	    Class444 class444_1908_ = class110.aClass444_1337;
	    class444_1908_.method7154(class444);
	    if (bool)
		class444_1908_.method7138();
	    Class435 class435 = class110.aClass435_1340;
	    class435.method7040(class444_1908_);
	    float[] fs = new float[3];
	    for (int i_1909_ = 0; i_1909_ < anInt9377; i_1909_++) {
		if ((i & aShortArray9378[i_1909_]) != 0) {
		    class435.method6956((float) anIntArray9424[i_1909_],
					(float) anIntArray9379[i_1909_],
					(float) anIntArray9395[i_1909_], fs);
		    anIntArray9424[i_1909_] = (int) fs[0];
		    anIntArray9379[i_1909_] = (int) fs[1];
		    anIntArray9395[i_1909_] = (int) fs[2];
		}
	    }
	}
    }
    
    public void method2971(short i, short i_1910_) {
	for (int i_1911_ = 0; i_1911_ < anInt9375; i_1911_++) {
	    if (aShortArray9403[i_1911_] == i)
		aShortArray9403[i_1911_] = i_1910_;
	}
	if (aClass103Array9417 != null) {
	    for (int i_1912_ = 0; i_1912_ < anInt9416; i_1912_++) {
		Class103 class103 = aClass103Array9417[i_1912_];
		Class107 class107 = aClass107Array9441[i_1912_];
		class107.anInt1304
		    = (class107.anInt1304 * -1093122285 & ~0xffffff
		       | ((Class381.anIntArray3929
			   [Class504.method8313((aShortArray9403
						 [(class103.anInt1273
						   * -954563709)]),
						1231698146) & 0xffff])
			  & 0xffffff)) * 540580635;
	    }
	}
	if (anInt9364 == 2)
	    anInt9364 = 1;
    }
    
    public void method3014(int i, int i_1913_, int i_1914_, int i_1915_) {
	if ((anInt9373 & 0x80000) != 524288)
	    throw new IllegalStateException();
	for (int i_1916_ = 0; i_1916_ < anInt9375; i_1916_++) {
	    int i_1917_ = aShortArray9403[i_1916_] & 0xffff;
	    int i_1918_ = i_1917_ >> 10 & 0x3f;
	    int i_1919_ = i_1917_ >> 7 & 0x7;
	    int i_1920_ = i_1917_ & 0x7f;
	    if (i != -1)
		i_1918_ += (i - i_1918_) * i_1915_ >> 7;
	    if (i_1913_ != -1)
		i_1919_ += (i_1913_ - i_1919_) * i_1915_ >> 7;
	    if (i_1914_ != -1)
		i_1920_ += (i_1914_ - i_1920_) * i_1915_ >> 7;
	    aShortArray9403[i_1916_]
		= (short) (i_1918_ << 10 | i_1919_ << 7 | i_1920_);
	}
	if (aClass103Array9417 != null) {
	    for (int i_1921_ = 0; i_1921_ < anInt9416; i_1921_++) {
		Class103 class103 = aClass103Array9417[i_1921_];
		Class107 class107 = aClass107Array9441[i_1921_];
		class107.anInt1304
		    = (class107.anInt1304 * -1093122285 & ~0xffffff
		       | ((Class381.anIntArray3929
			   [Class504.method8313((aShortArray9403
						 [(class103.anInt1273
						   * -954563709)]) & 0xffff,
						1074560427) & 0xffff])
			  & 0xffffff)) * 540580635;
	    }
	}
	if (anInt9364 == 2)
	    anInt9364 = 1;
    }
}
