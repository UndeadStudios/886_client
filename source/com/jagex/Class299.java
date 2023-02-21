/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;

public class Class299 implements Interface12
{
    public Class682 aClass682_3284;
    public int anInt3285;
    Class10 aClass10_3286;
    Class308 aClass308_3287;
    public int anInt3288;
    public boolean aBool3289;
    public String aString3290 = "null";
    public int anInt3291 = -1121294489;
    public int anInt3292;
    public int[] anIntArray3293;
    public boolean aBool3294;
    public int anInt3295 = 555461181;
    public short aShort3296;
    public boolean aBool3297;
    byte[] aByteArray3298;
    public int anInt3299;
    public short[] aShortArray3300;
    public byte[] aByteArray3301;
    public byte[] aByteArray3302;
    public int anInt3303;
    byte aByte3304;
    byte aByte3305;
    byte aByte3306 = 0;
    public String[] aStringArray3307;
    int[][] anIntArrayArray3308;
    public int anInt3309 = -1051512571;
    public boolean aBool3310 = true;
    public int anInt3311 = -1467700361;
    public int anInt3312;
    int anInt3313;
    public boolean aBool3314;
    short[] aShortArray3315;
    public boolean aBool3316;
    int anInt3317;
    int anInt3318;
    public int[] anIntArray3319;
    short[] aShortArray3320;
    public int anInt3321;
    public int anInt3322;
    public int[] anIntArray3323;
    public int[] anIntArray3324;
    int anInt3325;
    public boolean aBool3326;
    static final int anInt3327 = 6;
    public boolean aBool3328;
    public short aShort3329;
    public short aShort3330;
    public byte aByte3331;
    public byte aByte3332;
    public int anInt3333;
    byte aByte3334;
    public byte aByte3335;
    public static final int anInt3336 = 1;
    public static final int anInt3337 = 2;
    public int anInt3338;
    public int anInt3339;
    int anInt3340 = 1063117184;
    public byte aByte3341;
    public static final int anInt3342 = 8;
    public int anInt3343;
    public int[] anIntArray3344;
    int[] anIntArray3345;
    int anInt3346;
    public short[] aShortArray3347;
    public int anInt3348;
    Interface13 anInterface13_3349;
    public byte aByte3350;
    public int anInt3351;
    public Class443 aClass443_3352;
    public static short[] aShortArray3353 = new short[256];
    public int anInt3354;
    public int anInt3355;
    public short[] aShortArray3356;
    public int anInt3357;
    public boolean aBool3358;
    
    public final Class179 method5362
	(Class182 class182, int i, Class40_Sub1 class40_sub1,
	 Interface20 interface20, Interface18 interface18, Class689 class689,
	 Class689 class689_0_, Class689[] class689s, int[] is, int i_1_,
	 Class288 class288, int i_2_) {
	return method5372(class182, i, class40_sub1, interface20, interface18,
			  class689, class689_0_, class689s, is, i_1_, class288,
			  anInt3295 * 386089707, true, (byte) 73);
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_3_ = class525_sub38.readUnsignedByte(573963339);
	    if (0 == i_3_)
		break;
	    method5363(class525_sub38, i_3_, -1476064303);
	}
    }
    
    void method5363(RSBuffer class525_sub38, int i, int i_4_) {
	if (i == 1) {
	    int i_5_ = class525_sub38.readUnsignedByte(249810847);
	    anIntArray3324 = new int[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		anIntArray3324[i_6_] = class525_sub38.readBigSmart(-2043778683);
	} else if (i == 2)
	    aString3290 = class525_sub38.readString((byte) 6);
	else if (i == 12)
	    anInt3291 = class525_sub38.readUnsignedByte(105621629) * -1121294489;
	else if (i >= 30 && i < 35)
	    aStringArray3307[i - 30] = class525_sub38.readString((byte) -41);
	else if (i == 40) {
	    int i_7_ = class525_sub38.readUnsignedByte(125114337);
	    aShortArray3315 = new short[i_7_];
	    aShortArray3347 = new short[i_7_];
	    for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
		aShortArray3315[i_8_]
		    = (short) class525_sub38.readUnsignedShort((byte) 92);
		aShortArray3347[i_8_]
		    = (short) class525_sub38.readUnsignedShort((byte) 116);
	    }
	} else if (41 == i) {
	    int i_9_ = class525_sub38.readUnsignedByte(1218646473);
	    aShortArray3320 = new short[i_9_];
	    aShortArray3300 = new short[i_9_];
	    for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
		aShortArray3320[i_10_]
		    = (short) class525_sub38.readUnsignedShort((byte) 5);
		aShortArray3300[i_10_]
		    = (short) class525_sub38.readUnsignedShort((byte) 35);
	    }
	} else if (42 == i) {
	    int i_11_ = class525_sub38.readUnsignedByte(2003562518);
	    aByteArray3298 = new byte[i_11_];
	    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
		aByteArray3298[i_12_]
		    = class525_sub38.readByte(-1150098071);
	} else if (44 == i) {
	    int i_13_ = class525_sub38.readUnsignedShort((byte) 56);
	    int i_14_ = 0;
	    for (int i_15_ = i_13_; i_15_ > 0; i_15_ >>= 1)
		i_14_++;
	    aByteArray3301 = new byte[i_14_];
	    byte i_16_ = 0;
	    for (int i_17_ = 0; i_17_ < i_14_; i_17_++) {
		if ((i_13_ & 1 << i_17_) > 0) {
		    aByteArray3301[i_17_] = i_16_;
		    i_16_++;
		} else
		    aByteArray3301[i_17_] = (byte) -1;
	    }
	} else if (45 == i) {
	    int i_18_ = class525_sub38.readUnsignedShort((byte) 8);
	    int i_19_ = 0;
	    for (int i_20_ = i_18_; i_20_ > 0; i_20_ >>= 1)
		i_19_++;
	    aByteArray3302 = new byte[i_19_];
	    byte i_21_ = 0;
	    for (int i_22_ = 0; i_22_ < i_19_; i_22_++) {
		if ((i_18_ & 1 << i_22_) > 0) {
		    aByteArray3302[i_22_] = i_21_;
		    i_21_++;
		} else
		    aByteArray3302[i_22_] = (byte) -1;
	    }
	} else if (i == 60) {
	    int i_23_ = class525_sub38.readUnsignedByte(1685663840);
	    anIntArray3293 = new int[i_23_];
	    for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
		anIntArray3293[i_24_]
		    = class525_sub38.readBigSmart(-2043778683);
	} else if (93 == i)
	    aBool3310 = false;
	else if (i == 95)
	    anInt3311 = class525_sub38.readUnsignedShort((byte) 116) * 1467700361;
	else if (i == 97)
	    anInt3340 = class525_sub38.readUnsignedShort((byte) 73) * -696337469;
	else if (i == 98)
	    anInt3313 = class525_sub38.readUnsignedShort((byte) 92) * -778622175;
	else if (99 == i)
	    aBool3314 = true;
	else if (i == 100)
	    anInt3317 = class525_sub38.readByte(-1150098071) * -576709589;
	else if (i == 101)
	    anInt3318 = class525_sub38.readByte(-1150098071) * -654105917;
	else if (i == 102) {
	    int i_25_ = class525_sub38.readUnsignedByte(1260054548);
	    int i_26_ = 0;
	    for (int i_27_ = i_25_; i_27_ != 0; i_27_ >>= 1)
		i_26_++;
	    anIntArray3319 = new int[i_26_];
	    aShortArray3356 = new short[i_26_];
	    for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
		if (0 == (i_25_ & 1 << i_28_)) {
		    anIntArray3319[i_28_] = -1;
		    aShortArray3356[i_28_] = (short) -1;
		} else {
		    anIntArray3319[i_28_]
			= class525_sub38.readBigSmart(-2043778683);
		    aShortArray3356[i_28_]
			= (short) class525_sub38.method16623(982783173);
		}
	    }
	} else if (i == 103)
	    anInt3322 = class525_sub38.readUnsignedShort((byte) 27) * -1644846753;
	else if (i == 106 || i == 118) {
	    anInt3346 = class525_sub38.readUnsignedShort((byte) 95) * -1048409561;
	    if (65535 == anInt3346 * -1147386473)
		anInt3346 = 1048409561;
	    anInt3325 = class525_sub38.readUnsignedShort((byte) 39) * -1666848879;
	    if (65535 == anInt3325 * -1960986255)
		anInt3325 = 1666848879;
	    int i_29_ = -1;
	    if (i == 118) {
		i_29_ = class525_sub38.readUnsignedShort((byte) 61);
		if (65535 == i_29_)
		    i_29_ = -1;
	    }
	    int i_30_ = class525_sub38.readUnsignedByte(1764904811);
	    anIntArray3323 = new int[2 + i_30_];
	    for (int i_31_ = 0; i_31_ <= i_30_; i_31_++) {
		anIntArray3323[i_31_] = class525_sub38.readUnsignedShort((byte) 108);
		if (65535 == anIntArray3323[i_31_])
		    anIntArray3323[i_31_] = -1;
	    }
	    anIntArray3323[i_30_ + 1] = i_29_;
	} else if (107 == i)
	    aBool3326 = false;
	else if (i == 109)
	    aBool3289 = false;
	else if (i == 111)
	    aBool3328 = false;
	else if (i == 113) {
	    aShort3329 = (short) class525_sub38.readUnsignedShort((byte) 77);
	    aShort3330 = (short) class525_sub38.readUnsignedShort((byte) 4);
	} else if (114 == i) {
	    aByte3331 = class525_sub38.readByte(-1150098071);
	    aByte3332 = class525_sub38.readByte(-1150098071);
	} else if (119 == i)
	    aByte3335 = class525_sub38.readByte(-1150098071);
	else if (i == 121) {
	    anIntArrayArray3308 = new int[anIntArray3324.length][];
	    int i_32_ = class525_sub38.readUnsignedByte(1942281099);
	    for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
		int i_34_ = class525_sub38.readUnsignedByte(1411716816);
		int[] is = anIntArrayArray3308[i_34_] = new int[3];
		is[0] = class525_sub38.readByte(-1150098071);
		is[1] = class525_sub38.readByte(-1150098071);
		is[2] = class525_sub38.readByte(-1150098071);
	    }
	} else if (123 == i)
	    anInt3338 = class525_sub38.readUnsignedShort((byte) 47) * 736164505;
	else if (125 == i)
	    aClass682_3284
		= ((Class682)
		   Class539.method8888(Class413.method6684(1895402319),
				       class525_sub38.readByte(-1150098071),
				       -591576572));
	else if (127 == i)
	    anInt3295 = class525_sub38.readUnsignedShort((byte) 118) * -555461181;
	else if (i == 128)
	    Class539.method8888(Class684.method11241(-471401550),
				class525_sub38.readUnsignedByte(87741941),
				1677441552);
	else if (i == 134) {
	    anInt3354 = class525_sub38.readUnsignedShort((byte) 109) * 800152133;
	    if (65535 == anInt3354 * -1559975795)
		anInt3354 = -800152133;
	    anInt3339 = class525_sub38.readUnsignedShort((byte) 110) * -973620045;
	    if (1541231227 * anInt3339 == 65535)
		anInt3339 = 973620045;
	    anInt3357 = class525_sub38.readUnsignedShort((byte) 1) * -1945898911;
	    if (anInt3357 * 766686113 == 65535)
		anInt3357 = 1945898911;
	    anInt3321 = class525_sub38.readUnsignedShort((byte) 28) * -19645885;
	    if (anInt3321 * -1876270485 == 65535)
		anInt3321 = 19645885;
	    anInt3333 = class525_sub38.readUnsignedByte(341553060) * -538292109;
	} else if (i == 135 || i == 136) {
	    class525_sub38.readUnsignedByte(1130565911);
	    class525_sub38.readUnsignedShort((byte) 27);
	} else if (137 == i)
	    anInt3309 = class525_sub38.readUnsignedShort((byte) 40) * 1051512571;
	else if (i == 138)
	    anInt3288 = class525_sub38.readBigSmart(-2043778683) * -811182623;
	else if (i == 140)
	    anInt3285 = class525_sub38.readUnsignedByte(1309780387) * -266127983;
	else if (141 == i)
	    aBool3316 = true;
	else if (i == 142)
	    anInt3348 = class525_sub38.readUnsignedShort((byte) 84) * -2110390413;
	else if (i == 143)
	    aBool3294 = true;
	else if (i >= 150 && i < 155) {
	    aStringArray3307[i - 150] = class525_sub38.readString((byte) 16);
	    if (!aClass308_3287.aBool3425)
		aStringArray3307[i - 150] = null;
	} else if (155 == i) {
	    aByte3334 = class525_sub38.readByte(-1150098071);
	    aByte3304 = class525_sub38.readByte(-1150098071);
	    aByte3305 = class525_sub38.readByte(-1150098071);
	    aByte3306 = class525_sub38.readByte(-1150098071);
	} else if (i == 158)
	    aByte3350 = (byte) 1;
	else if (i == 159)
	    aByte3350 = (byte) 0;
	else if (i == 160) {
	    int i_35_ = class525_sub38.readUnsignedByte(2025056613);
	    anIntArray3344 = new int[i_35_];
	    for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
		anIntArray3344[i_36_] = class525_sub38.readUnsignedShort((byte) 40);
	} else if (i != 162) {
	    if (163 == i)
		anInt3351 = class525_sub38.readUnsignedByte(65493082) * -1656145107;
	    else if (i == 164) {
		anInt3303 = class525_sub38.readUnsignedShort((byte) 44) * 1734308915;
		anInt3312
		    = class525_sub38.readUnsignedShort((byte) 114) * 1889719379;
	    } else if (i == 165)
		anInt3355 = class525_sub38.readUnsignedByte(341713792) * 2078431827;
	    else if (i == 168)
		anInt3343
		    = class525_sub38.readUnsignedByte(1110131382) * 1323714039;
	    else if (i == 169)
		aBool3297 = false;
	    else if (i >= 170 && i < 176) {
		if (anIntArray3345 == null) {
		    anIntArray3345 = new int[6];
		    Arrays.fill(anIntArray3345, -1);
		}
		int i_37_ = class525_sub38.readUnsignedShort((byte) 66);
		if (i_37_ == 65535)
		    i_37_ = -1;
		anIntArray3345[i - 170] = i_37_;
	    } else if (178 != i) {
		if (179 == i) {
		    aClass443_3352 = new Class443();
		    aClass443_3352.aFloat4877
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4873
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4871
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4875
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4869
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4874
			= (float) class525_sub38.method16640(993241788);
		} else if (i == 180)
		    anInt3292 = (class525_sub38.readUnsignedByte(1486183303)
				 & 0xff) * -1459367951;
		else if (i == 181) {
		    aShort3296 = (short) class525_sub38.readUnsignedShort((byte) 32);
		    aByte3341 = (byte) class525_sub38.readUnsignedByte(2021361439);
		} else if (i == 182)
		    aBool3358 = true;
		else if (i == 249) {
		    int i_38_ = class525_sub38.readUnsignedByte(470692231);
		    if (aClass10_3286 == null) {
			int i_39_ = Class212.method3935(i_38_, -2056250364);
			aClass10_3286 = new Class10(i_39_);
		    }
		    for (int i_40_ = 0; i_40_ < i_38_; i_40_++) {
			boolean bool
			    = class525_sub38.readUnsignedByte(17328937) == 1;
			int i_41_ = class525_sub38.method16834(-1994884458);
			Class525 class525;
			if (bool)
			    class525
				= (new Class525_Sub19
				   (class525_sub38.readString((byte) -31)));
			else
			    class525
				= (new Class525_Sub42
				   (class525_sub38.readInt(871053415)));
			aClass10_3286.method695(class525, (long) i_41_);
		    }
		}
	    }
	}
    }
    
    Class299(int i, Class308 class308, Interface13 interface13) {
	anInt3313 = -879390592;
	aBool3314 = false;
	aBool3294 = false;
	aBool3316 = false;
	anInt3317 = 0;
	anInt3318 = 0;
	anIntArray3319 = null;
	aShortArray3356 = null;
	anInt3288 = 811182623;
	anInt3322 = -1095488544;
	anInt3346 = 1048409561;
	anInt3325 = 1666848879;
	aBool3326 = true;
	aBool3289 = true;
	aBool3328 = true;
	aShort3329 = (short) 0;
	aShort3330 = (short) 0;
	aByte3331 = (byte) -96;
	aByte3332 = (byte) -16;
	aShort3296 = (short) -1;
	aByte3341 = (byte) 0;
	aByte3335 = (byte) 0;
	anInt3354 = -800152133;
	anInt3339 = 973620045;
	anInt3357 = 1945898911;
	anInt3321 = 19645885;
	anInt3333 = 0;
	anInt3343 = 0;
	anInt3285 = 856841071;
	anInt3338 = -736164505;
	aClass682_3284 = Class682.aClass682_8630;
	anInt3348 = 2110390413;
	aByte3350 = (byte) -1;
	anInt3351 = 1656145107;
	anInt3303 = 1601450752;
	anInt3312 = -1563143424;
	anInt3355 = 0;
	aBool3297 = true;
	anInt3292 = 0;
	aBool3358 = false;
	anInt3299 = i * -965157975;
	aClass308_3287 = class308;
	anInterface13_3349 = interface13;
	aStringArray3307 = (String[]) aClass308_3287.aStringArray3420.clone();
    }
    
    void method5364(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    int i_42_ = class525_sub38.readUnsignedByte(1491783245);
	    anIntArray3324 = new int[i_42_];
	    for (int i_43_ = 0; i_43_ < i_42_; i_43_++)
		anIntArray3324[i_43_]
		    = class525_sub38.readBigSmart(-2043778683);
	} else if (i == 2)
	    aString3290 = class525_sub38.readString((byte) 21);
	else if (i == 12)
	    anInt3291 = class525_sub38.readUnsignedByte(1004633041) * -1121294489;
	else if (i >= 30 && i < 35)
	    aStringArray3307[i - 30] = class525_sub38.readString((byte) -89);
	else if (i == 40) {
	    int i_44_ = class525_sub38.readUnsignedByte(1015872051);
	    aShortArray3315 = new short[i_44_];
	    aShortArray3347 = new short[i_44_];
	    for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
		aShortArray3315[i_45_]
		    = (short) class525_sub38.readUnsignedShort((byte) 8);
		aShortArray3347[i_45_]
		    = (short) class525_sub38.readUnsignedShort((byte) 31);
	    }
	} else if (41 == i) {
	    int i_46_ = class525_sub38.readUnsignedByte(1767414908);
	    aShortArray3320 = new short[i_46_];
	    aShortArray3300 = new short[i_46_];
	    for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
		aShortArray3320[i_47_]
		    = (short) class525_sub38.readUnsignedShort((byte) 44);
		aShortArray3300[i_47_]
		    = (short) class525_sub38.readUnsignedShort((byte) 62);
	    }
	} else if (42 == i) {
	    int i_48_ = class525_sub38.readUnsignedByte(2048679478);
	    aByteArray3298 = new byte[i_48_];
	    for (int i_49_ = 0; i_49_ < i_48_; i_49_++)
		aByteArray3298[i_49_]
		    = class525_sub38.readByte(-1150098071);
	} else if (44 == i) {
	    int i_50_ = class525_sub38.readUnsignedShort((byte) 90);
	    int i_51_ = 0;
	    for (int i_52_ = i_50_; i_52_ > 0; i_52_ >>= 1)
		i_51_++;
	    aByteArray3301 = new byte[i_51_];
	    byte i_53_ = 0;
	    for (int i_54_ = 0; i_54_ < i_51_; i_54_++) {
		if ((i_50_ & 1 << i_54_) > 0) {
		    aByteArray3301[i_54_] = i_53_;
		    i_53_++;
		} else
		    aByteArray3301[i_54_] = (byte) -1;
	    }
	} else if (45 == i) {
	    int i_55_ = class525_sub38.readUnsignedShort((byte) 60);
	    int i_56_ = 0;
	    for (int i_57_ = i_55_; i_57_ > 0; i_57_ >>= 1)
		i_56_++;
	    aByteArray3302 = new byte[i_56_];
	    byte i_58_ = 0;
	    for (int i_59_ = 0; i_59_ < i_56_; i_59_++) {
		if ((i_55_ & 1 << i_59_) > 0) {
		    aByteArray3302[i_59_] = i_58_;
		    i_58_++;
		} else
		    aByteArray3302[i_59_] = (byte) -1;
	    }
	} else if (i == 60) {
	    int i_60_ = class525_sub38.readUnsignedByte(1305298974);
	    anIntArray3293 = new int[i_60_];
	    for (int i_61_ = 0; i_61_ < i_60_; i_61_++)
		anIntArray3293[i_61_]
		    = class525_sub38.readBigSmart(-2043778683);
	} else if (93 == i)
	    aBool3310 = false;
	else if (i == 95)
	    anInt3311 = class525_sub38.readUnsignedShort((byte) 98) * 1467700361;
	else if (i == 97)
	    anInt3340 = class525_sub38.readUnsignedShort((byte) 124) * -696337469;
	else if (i == 98)
	    anInt3313 = class525_sub38.readUnsignedShort((byte) 112) * -778622175;
	else if (99 == i)
	    aBool3314 = true;
	else if (i == 100)
	    anInt3317 = class525_sub38.readByte(-1150098071) * -576709589;
	else if (i == 101)
	    anInt3318 = class525_sub38.readByte(-1150098071) * -654105917;
	else if (i == 102) {
	    int i_62_ = class525_sub38.readUnsignedByte(1679462778);
	    int i_63_ = 0;
	    for (int i_64_ = i_62_; i_64_ != 0; i_64_ >>= 1)
		i_63_++;
	    anIntArray3319 = new int[i_63_];
	    aShortArray3356 = new short[i_63_];
	    for (int i_65_ = 0; i_65_ < i_63_; i_65_++) {
		if (0 == (i_62_ & 1 << i_65_)) {
		    anIntArray3319[i_65_] = -1;
		    aShortArray3356[i_65_] = (short) -1;
		} else {
		    anIntArray3319[i_65_]
			= class525_sub38.readBigSmart(-2043778683);
		    aShortArray3356[i_65_]
			= (short) class525_sub38.method16623(677571603);
		}
	    }
	} else if (i == 103)
	    anInt3322 = class525_sub38.readUnsignedShort((byte) 118) * -1644846753;
	else if (i == 106 || i == 118) {
	    anInt3346 = class525_sub38.readUnsignedShort((byte) 94) * -1048409561;
	    if (65535 == anInt3346 * -1147386473)
		anInt3346 = 1048409561;
	    anInt3325 = class525_sub38.readUnsignedShort((byte) 80) * -1666848879;
	    if (65535 == anInt3325 * -1960986255)
		anInt3325 = 1666848879;
	    int i_66_ = -1;
	    if (i == 118) {
		i_66_ = class525_sub38.readUnsignedShort((byte) 114);
		if (65535 == i_66_)
		    i_66_ = -1;
	    }
	    int i_67_ = class525_sub38.readUnsignedByte(1654041446);
	    anIntArray3323 = new int[2 + i_67_];
	    for (int i_68_ = 0; i_68_ <= i_67_; i_68_++) {
		anIntArray3323[i_68_] = class525_sub38.readUnsignedShort((byte) 2);
		if (65535 == anIntArray3323[i_68_])
		    anIntArray3323[i_68_] = -1;
	    }
	    anIntArray3323[i_67_ + 1] = i_66_;
	} else if (107 == i)
	    aBool3326 = false;
	else if (i == 109)
	    aBool3289 = false;
	else if (i == 111)
	    aBool3328 = false;
	else if (i == 113) {
	    aShort3329 = (short) class525_sub38.readUnsignedShort((byte) 118);
	    aShort3330 = (short) class525_sub38.readUnsignedShort((byte) 20);
	} else if (114 == i) {
	    aByte3331 = class525_sub38.readByte(-1150098071);
	    aByte3332 = class525_sub38.readByte(-1150098071);
	} else if (119 == i)
	    aByte3335 = class525_sub38.readByte(-1150098071);
	else if (i == 121) {
	    anIntArrayArray3308 = new int[anIntArray3324.length][];
	    int i_69_ = class525_sub38.readUnsignedByte(1240348160);
	    for (int i_70_ = 0; i_70_ < i_69_; i_70_++) {
		int i_71_ = class525_sub38.readUnsignedByte(796556132);
		int[] is = anIntArrayArray3308[i_71_] = new int[3];
		is[0] = class525_sub38.readByte(-1150098071);
		is[1] = class525_sub38.readByte(-1150098071);
		is[2] = class525_sub38.readByte(-1150098071);
	    }
	} else if (123 == i)
	    anInt3338 = class525_sub38.readUnsignedShort((byte) 106) * 736164505;
	else if (125 == i)
	    aClass682_3284
		= ((Class682)
		   Class539.method8888(Class413.method6684(-964083014),
				       class525_sub38.readByte(-1150098071),
				       -510930684));
	else if (127 == i)
	    anInt3295 = class525_sub38.readUnsignedShort((byte) 57) * -555461181;
	else if (i == 128)
	    Class539.method8888(Class684.method11241(-1489520236),
				class525_sub38.readUnsignedByte(1449148361),
				159591094);
	else if (i == 134) {
	    anInt3354 = class525_sub38.readUnsignedShort((byte) 67) * 800152133;
	    if (65535 == anInt3354 * -1559975795)
		anInt3354 = -800152133;
	    anInt3339 = class525_sub38.readUnsignedShort((byte) 90) * -973620045;
	    if (1541231227 * anInt3339 == 65535)
		anInt3339 = 973620045;
	    anInt3357 = class525_sub38.readUnsignedShort((byte) 47) * -1945898911;
	    if (anInt3357 * 766686113 == 65535)
		anInt3357 = 1945898911;
	    anInt3321 = class525_sub38.readUnsignedShort((byte) 96) * -19645885;
	    if (anInt3321 * -1876270485 == 65535)
		anInt3321 = 19645885;
	    anInt3333 = class525_sub38.readUnsignedByte(1985660154) * -538292109;
	} else if (i == 135 || i == 136) {
	    class525_sub38.readUnsignedByte(1719357870);
	    class525_sub38.readUnsignedShort((byte) 57);
	} else if (137 == i)
	    anInt3309 = class525_sub38.readUnsignedShort((byte) 107) * 1051512571;
	else if (i == 138)
	    anInt3288 = class525_sub38.readBigSmart(-2043778683) * -811182623;
	else if (i == 140)
	    anInt3285 = class525_sub38.readUnsignedByte(2146827153) * -266127983;
	else if (141 == i)
	    aBool3316 = true;
	else if (i == 142)
	    anInt3348 = class525_sub38.readUnsignedShort((byte) 49) * -2110390413;
	else if (i == 143)
	    aBool3294 = true;
	else if (i >= 150 && i < 155) {
	    aStringArray3307[i - 150] = class525_sub38.readString((byte) -25);
	    if (!aClass308_3287.aBool3425)
		aStringArray3307[i - 150] = null;
	} else if (155 == i) {
	    aByte3334 = class525_sub38.readByte(-1150098071);
	    aByte3304 = class525_sub38.readByte(-1150098071);
	    aByte3305 = class525_sub38.readByte(-1150098071);
	    aByte3306 = class525_sub38.readByte(-1150098071);
	} else if (i == 158)
	    aByte3350 = (byte) 1;
	else if (i == 159)
	    aByte3350 = (byte) 0;
	else if (i == 160) {
	    int i_72_ = class525_sub38.readUnsignedByte(583226340);
	    anIntArray3344 = new int[i_72_];
	    for (int i_73_ = 0; i_73_ < i_72_; i_73_++)
		anIntArray3344[i_73_] = class525_sub38.readUnsignedShort((byte) 110);
	} else if (i != 162) {
	    if (163 == i)
		anInt3351
		    = class525_sub38.readUnsignedByte(1020990173) * -1656145107;
	    else if (i == 164) {
		anInt3303
		    = class525_sub38.readUnsignedShort((byte) 113) * 1734308915;
		anInt3312 = class525_sub38.readUnsignedShort((byte) 94) * 1889719379;
	    } else if (i == 165)
		anInt3355
		    = class525_sub38.readUnsignedByte(1153657698) * 2078431827;
	    else if (i == 168)
		anInt3343
		    = class525_sub38.readUnsignedByte(1505486624) * 1323714039;
	    else if (i == 169)
		aBool3297 = false;
	    else if (i >= 170 && i < 176) {
		if (anIntArray3345 == null) {
		    anIntArray3345 = new int[6];
		    Arrays.fill(anIntArray3345, -1);
		}
		int i_74_ = class525_sub38.readUnsignedShort((byte) 36);
		if (i_74_ == 65535)
		    i_74_ = -1;
		anIntArray3345[i - 170] = i_74_;
	    } else if (178 != i) {
		if (179 == i) {
		    aClass443_3352 = new Class443();
		    aClass443_3352.aFloat4877
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4873
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4871
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4875
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4869
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4874
			= (float) class525_sub38.method16640(993241788);
		} else if (i == 180)
		    anInt3292 = (class525_sub38.readUnsignedByte(2059361865)
				 & 0xff) * -1459367951;
		else if (i == 181) {
		    aShort3296
			= (short) class525_sub38.readUnsignedShort((byte) 125);
		    aByte3341 = (byte) class525_sub38.readUnsignedByte(1642559346);
		} else if (i == 182)
		    aBool3358 = true;
		else if (i == 249) {
		    int i_75_ = class525_sub38.readUnsignedByte(996912948);
		    if (aClass10_3286 == null) {
			int i_76_ = Class212.method3935(i_75_, -2056250364);
			aClass10_3286 = new Class10(i_76_);
		    }
		    for (int i_77_ = 0; i_77_ < i_75_; i_77_++) {
			boolean bool
			    = class525_sub38.readUnsignedByte(693460176) == 1;
			int i_78_ = class525_sub38.method16834(-1994884458);
			Class525 class525;
			if (bool)
			    class525
				= (new Class525_Sub19
				   (class525_sub38.readString((byte) -71)));
			else
			    class525
				= (new Class525_Sub42
				   (class525_sub38.readInt(905412669)));
			aClass10_3286.method695(class525, (long) i_78_);
		    }
		}
	    }
	}
    }
    
    public final Class179 method5365
	(Class182 class182, int i, Class40_Sub1 class40_sub1,
	 Interface20 interface20, Interface18 interface18, Class689 class689,
	 Class689 class689_79_, Class689[] class689s, int[] is, int i_80_,
	 Class288 class288, int i_81_, boolean bool) {
	if (anIntArray3323 != null) {
	    Class299 class299_82_
		= method5386(interface20, interface18, 2100715642);
	    if (class299_82_ == null)
		return null;
	    return class299_82_.method5372(class182, i, class40_sub1,
					   interface20, interface18, class689,
					   class689_79_, class689s, is, i_80_,
					   class288, i_81_, bool, (byte) 84);
	}
	int i_83_ = i;
	if (128 != 857217249 * anInt3313)
	    i_83_ |= 0x2;
	if (-1737913109 * anInt3340 != 128)
	    i_83_ |= 0x5;
	boolean bool_84_ = false;
	int i_85_ = null != class689s ? class689s.length : 0;
	for (int i_86_ = 0; i_86_ < i_85_; i_86_++) {
	    if (null != class689s[i_86_]) {
		i_83_ |= class689s[i_86_].method14033(1162138734);
		bool_84_ = true;
	    }
	}
	if (null != class689) {
	    i_83_ |= class689.method14033(2106460474);
	    bool_84_ = true;
	}
	if (class689_79_ != null) {
	    i_83_ |= class689_79_.method14033(-1519128014);
	    bool_84_ = true;
	}
	long l = (long) (anInt3299 * 953284761
			 | -2117565327 * class182.anInt1942 << 16);
	if (class288 != null)
	    l |= class288.aLong3195 * 2910912014388413211L << 24;
	Class179 class179;
	synchronized (aClass308_3287.aClass200_3422) {
	    class179 = (Class179) aClass308_3287.aClass200_3422.method3785(l);
	}
	Class586 class586 = null;
	if (!bool && i_81_ != -1)
	    class586 = (Class586) class40_sub1.method76(i_81_, -949474216);
	else if (386089707 * anInt3295 != -1)
	    class586 = (Class586) class40_sub1.method76(anInt3295 * 386089707,
							-842566809);
	if (class179 == null || (class179.method2928() & i_83_) != i_83_) {
	    if (class179 != null)
		i_83_ |= class179.method2928();
	    int i_87_ = i_83_;
	    if (null != aShortArray3315)
		i_87_ |= 0x4000;
	    if (null != aShortArray3320)
		i_87_ |= 0x8000;
	    if (0 != aByte3306)
		i_87_ |= 0x80000;
	    int[] is_88_ = (class288 != null && null != class288.anIntArray3197
			    ? class288.anIntArray3197 : anIntArray3324);
	    boolean bool_89_ = false;
	    synchronized (aClass308_3287.aClass458_3421) {
		for (int i_90_ = 0; i_90_ < is_88_.length; i_90_++) {
		    if (-1 != is_88_[i_90_]
			&& !aClass308_3287.aClass458_3421
				.method7478(is_88_[i_90_], 0, (short) 22905))
			bool_89_ = true;
		}
	    }
	    if (bool_89_)
		return null;
	    Class186[] class186s = new Class186[is_88_.length];
	    for (int i_91_ = 0; i_91_ < is_88_.length; i_91_++) {
		if (-1 != is_88_[i_91_]) {
		    synchronized (aClass308_3287.aClass458_3421) {
			class186s[i_91_]
			    = Class186.method3644((aClass308_3287
						   .aClass458_3421),
						  is_88_[i_91_], 0);
		    }
		    if (null != class186s[i_91_]) {
			if (class186s[i_91_].anInt2086 < 13)
			    class186s[i_91_].method3651(2);
			if (anIntArrayArray3308 != null
			    && null != anIntArrayArray3308[i_91_])
			    class186s[i_91_].method3633
				(anIntArrayArray3308[i_91_][0],
				 anIntArrayArray3308[i_91_][1],
				 anIntArrayArray3308[i_91_][2]);
		    }
		}
	    }
	    if (class288 != null) {
		for (int i_92_ = 0; i_92_ < class186s.length; i_92_++) {
		    if (class186s[i_92_] != null) {
			if (class288.aFloatArray3201 != null
			    && class288.aFloatArray3201[i_92_] != 0.0F)
			    class186s[i_92_]
				.method3635(class288.aFloatArray3201[i_92_]);
			if (class288.anIntArrayArray3198 != null)
			    class186s[i_92_].method3647
				(class288.anIntArrayArray3198[i_92_][0],
				 class288.anIntArrayArray3198[i_92_][1],
				 class288.anIntArrayArray3198[i_92_][2]);
			if (null != class288.anIntArrayArray3199)
			    class186s[i_92_].method3633
				(class288.anIntArrayArray3199[i_92_][0],
				 class288.anIntArrayArray3199[i_92_][1],
				 class288.anIntArrayArray3199[i_92_][2]);
		    }
		}
	    }
	    if (class586 != null && null != class586.anIntArrayArray7755) {
		for (int i_93_ = 0;
		     i_93_ < class586.anIntArrayArray7755.length; i_93_++) {
		    if (i_93_ < class186s.length && class186s[i_93_] != null) {
			int i_94_ = 0;
			int i_95_ = 0;
			int i_96_ = 0;
			int i_97_ = 0;
			int i_98_ = 0;
			int i_99_ = 0;
			if (class586.anIntArrayArray7755[i_93_] != null) {
			    i_94_ = class586.anIntArrayArray7755[i_93_][0];
			    i_95_ = class586.anIntArrayArray7755[i_93_][1];
			    i_96_ = class586.anIntArrayArray7755[i_93_][2];
			    i_97_
				= class586.anIntArrayArray7755[i_93_][3] << 3;
			    i_98_
				= class586.anIntArrayArray7755[i_93_][4] << 3;
			    i_99_
				= class586.anIntArrayArray7755[i_93_][5] << 3;
			}
			if (i_97_ != 0 || i_98_ != 0 || 0 != i_99_)
			    class186s[i_93_].method3647(i_97_, i_98_, i_99_);
			if (i_94_ != 0 || 0 != i_95_ || 0 != i_96_)
			    class186s[i_93_].method3633(i_94_, i_95_, i_96_);
		    }
		}
	    }
	    Class186 class186;
	    if (1 == class186s.length)
		class186 = class186s[0];
	    else
		class186 = new Class186(class186s, class186s.length);
	    class179
		= class182.method3556(class186, i_87_,
				      -508213811 * aClass308_3287.anInt3424,
				      anInt3317 * -743718269 + 64,
				      -273050217 * anInt3318 + 850);
	    if (null != aShortArray3315) {
		short[] is_100_;
		if (class288 != null && null != class288.aShortArray3200)
		    is_100_ = class288.aShortArray3200;
		else
		    is_100_ = aShortArray3347;
		for (int i_101_ = 0; i_101_ < aShortArray3315.length;
		     i_101_++) {
		    if (aByteArray3298 != null
			&& i_101_ < aByteArray3298.length)
			class179.method2971(aShortArray3315[i_101_],
					    (aShortArray3353
					     [aByteArray3298[i_101_] & 0xff]));
		    else
			class179.method2971(aShortArray3315[i_101_],
					    is_100_[i_101_]);
		}
	    }
	    if (aShortArray3320 != null) {
		short[] is_102_;
		if (class288 != null && class288.aShortArray3196 != null)
		    is_102_ = class288.aShortArray3196;
		else
		    is_102_ = aShortArray3300;
		for (int i_103_ = 0; i_103_ < aShortArray3320.length; i_103_++)
		    class179.method2973(aShortArray3320[i_103_],
					is_102_[i_103_]);
	    }
	    if (aByte3306 != 0)
		class179.method2974(aByte3334, aByte3304, aByte3305,
				    aByte3306 & 0xff);
	    class179.method3003();
	    class179.method3010(i_83_);
	    synchronized (aClass308_3287.aClass200_3422) {
		aClass308_3287.aClass200_3422.method3788(class179, l);
	    }
	}
	Class179 class179_104_ = class179.method2926((byte) 4, i_83_, true);
	boolean bool_105_ = false;
	if (is != null) {
	    for (int i_106_ = 0; i_106_ < 12; i_106_++) {
		if (is[i_106_] != -1)
		    bool_105_ = true;
	    }
	}
	if (!bool_84_ && !bool_105_)
	    return class179_104_;
	Class444[] class444s = null;
	if (null != class586)
	    class444s = class586.method9667((byte) 53);
	if (bool_105_ && null != class444s) {
	    for (int i_107_ = 0; i_107_ < 12; i_107_++) {
		if (class444s[i_107_] != null)
		    class179_104_.method2943(class444s[i_107_], 1 << i_107_,
					     true);
	    }
	}
	int i_108_ = 0;
	int i_109_ = 1;
	while (i_108_ < i_85_) {
	    if (null != class689s[i_108_])
		class689s[i_108_].method14035(class179_104_, 0, i_109_,
					      -1050789196);
	    i_108_++;
	    i_109_ <<= 1;
	}
	if (bool_105_) {
	    for (i_108_ = 0; i_108_ < 12; i_108_++) {
		if (-1 != is[i_108_]) {
		    i_109_ = is[i_108_] - i_80_;
		    i_109_ &= 0x3fff;
		    Class444 class444 = new Class444();
		    class444.method7141(0.0F, 1.0F, 0.0F,
					Class436.method7071(i_109_));
		    class179_104_.method2943(class444, 1 << i_108_, false);
		}
	    }
	}
	if (bool_105_ && null != class444s) {
	    for (i_108_ = 0; i_108_ < 12; i_108_++) {
		if (class444s[i_108_] != null)
		    class179_104_.method2943(class444s[i_108_], 1 << i_108_,
					     false);
	    }
	}
	if (class689 != null && null != class689_79_)
	    Class643.method10599(class179_104_, class689, class689_79_,
				 -2016053377);
	else if (class689 != null)
	    class689.method14034(class179_104_, 0, 2014086305);
	else if (class689_79_ != null)
	    class689_79_.method14034(class179_104_, 0, 1773751902);
	if (128 != -1737913109 * anInt3340 || 857217249 * anInt3313 != 128)
	    class179_104_.method2936(-1737913109 * anInt3340,
				     anInt3313 * 857217249,
				     -1737913109 * anInt3340);
	class179_104_.method3010(i);
	return class179_104_;
    }
    
    public boolean method5366(Interface20 interface20,
			      Interface18 interface18) {
	if (null == anIntArray3323)
	    return true;
	int i = -1;
	if (-1 != anInt3346 * -1147386473) {
	    Class322 class322
		= interface20.method124(-1147386473 * anInt3346, 1605808796);
	    if (null != class322)
		i = interface18.method93(class322, (byte) 2);
	} else if (-1 != anInt3325 * -1960986255) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					-1960986255 * anInt3325, -991674990);
	    if (class163 != null)
		i = interface18.method104(class163, 623775022);
	}
	if (i < 0 || i >= anIntArray3323.length - 1) {
	    int i_110_ = anIntArray3323[anIntArray3323.length - 1];
	    if (i_110_ != -1)
		return true;
	    return false;
	}
	if (-1 == anIntArray3323[i])
	    return false;
	return true;
    }
    
    public final boolean method5367(int i) {
	if (anIntArray3324 == null)
	    return true;
	boolean bool = true;
	int[] is = anIntArray3324;
	for (int i_111_ = 0; i_111_ < is.length; i_111_++) {
	    int i_112_ = is[i_111_];
	    if (!aClass308_3287.aClass458_3421.method7478(i_112_, 0,
							  (short) 27735))
		bool = false;
	}
	return bool;
    }
    
    public int method5368(int i, int i_113_, byte i_114_) {
	if (aClass10_3286 == null)
	    return i_113_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_3286.method684((long) i);
	if (null == class525_sub42)
	    return i_113_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    void method5369(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    int i_115_ = class525_sub38.readUnsignedByte(548524195);
	    anIntArray3324 = new int[i_115_];
	    for (int i_116_ = 0; i_116_ < i_115_; i_116_++)
		anIntArray3324[i_116_]
		    = class525_sub38.readBigSmart(-2043778683);
	} else if (i == 2)
	    aString3290 = class525_sub38.readString((byte) -14);
	else if (i == 12)
	    anInt3291 = class525_sub38.readUnsignedByte(2078271233) * -1121294489;
	else if (i >= 30 && i < 35)
	    aStringArray3307[i - 30] = class525_sub38.readString((byte) -32);
	else if (i == 40) {
	    int i_117_ = class525_sub38.readUnsignedByte(327137463);
	    aShortArray3315 = new short[i_117_];
	    aShortArray3347 = new short[i_117_];
	    for (int i_118_ = 0; i_118_ < i_117_; i_118_++) {
		aShortArray3315[i_118_]
		    = (short) class525_sub38.readUnsignedShort((byte) 3);
		aShortArray3347[i_118_]
		    = (short) class525_sub38.readUnsignedShort((byte) 127);
	    }
	} else if (41 == i) {
	    int i_119_ = class525_sub38.readUnsignedByte(1929242013);
	    aShortArray3320 = new short[i_119_];
	    aShortArray3300 = new short[i_119_];
	    for (int i_120_ = 0; i_120_ < i_119_; i_120_++) {
		aShortArray3320[i_120_]
		    = (short) class525_sub38.readUnsignedShort((byte) 86);
		aShortArray3300[i_120_]
		    = (short) class525_sub38.readUnsignedShort((byte) 83);
	    }
	} else if (42 == i) {
	    int i_121_ = class525_sub38.readUnsignedByte(438277612);
	    aByteArray3298 = new byte[i_121_];
	    for (int i_122_ = 0; i_122_ < i_121_; i_122_++)
		aByteArray3298[i_122_]
		    = class525_sub38.readByte(-1150098071);
	} else if (44 == i) {
	    int i_123_ = class525_sub38.readUnsignedShort((byte) 18);
	    int i_124_ = 0;
	    for (int i_125_ = i_123_; i_125_ > 0; i_125_ >>= 1)
		i_124_++;
	    aByteArray3301 = new byte[i_124_];
	    byte i_126_ = 0;
	    for (int i_127_ = 0; i_127_ < i_124_; i_127_++) {
		if ((i_123_ & 1 << i_127_) > 0) {
		    aByteArray3301[i_127_] = i_126_;
		    i_126_++;
		} else
		    aByteArray3301[i_127_] = (byte) -1;
	    }
	} else if (45 == i) {
	    int i_128_ = class525_sub38.readUnsignedShort((byte) 4);
	    int i_129_ = 0;
	    for (int i_130_ = i_128_; i_130_ > 0; i_130_ >>= 1)
		i_129_++;
	    aByteArray3302 = new byte[i_129_];
	    byte i_131_ = 0;
	    for (int i_132_ = 0; i_132_ < i_129_; i_132_++) {
		if ((i_128_ & 1 << i_132_) > 0) {
		    aByteArray3302[i_132_] = i_131_;
		    i_131_++;
		} else
		    aByteArray3302[i_132_] = (byte) -1;
	    }
	} else if (i == 60) {
	    int i_133_ = class525_sub38.readUnsignedByte(302985111);
	    anIntArray3293 = new int[i_133_];
	    for (int i_134_ = 0; i_134_ < i_133_; i_134_++)
		anIntArray3293[i_134_]
		    = class525_sub38.readBigSmart(-2043778683);
	} else if (93 == i)
	    aBool3310 = false;
	else if (i == 95)
	    anInt3311 = class525_sub38.readUnsignedShort((byte) 93) * 1467700361;
	else if (i == 97)
	    anInt3340 = class525_sub38.readUnsignedShort((byte) 96) * -696337469;
	else if (i == 98)
	    anInt3313 = class525_sub38.readUnsignedShort((byte) 95) * -778622175;
	else if (99 == i)
	    aBool3314 = true;
	else if (i == 100)
	    anInt3317 = class525_sub38.readByte(-1150098071) * -576709589;
	else if (i == 101)
	    anInt3318 = class525_sub38.readByte(-1150098071) * -654105917;
	else if (i == 102) {
	    int i_135_ = class525_sub38.readUnsignedByte(795428824);
	    int i_136_ = 0;
	    for (int i_137_ = i_135_; i_137_ != 0; i_137_ >>= 1)
		i_136_++;
	    anIntArray3319 = new int[i_136_];
	    aShortArray3356 = new short[i_136_];
	    for (int i_138_ = 0; i_138_ < i_136_; i_138_++) {
		if (0 == (i_135_ & 1 << i_138_)) {
		    anIntArray3319[i_138_] = -1;
		    aShortArray3356[i_138_] = (short) -1;
		} else {
		    anIntArray3319[i_138_]
			= class525_sub38.readBigSmart(-2043778683);
		    aShortArray3356[i_138_]
			= (short) class525_sub38.method16623(1210272412);
		}
	    }
	} else if (i == 103)
	    anInt3322 = class525_sub38.readUnsignedShort((byte) 35) * -1644846753;
	else if (i == 106 || i == 118) {
	    anInt3346 = class525_sub38.readUnsignedShort((byte) 127) * -1048409561;
	    if (65535 == anInt3346 * -1147386473)
		anInt3346 = 1048409561;
	    anInt3325 = class525_sub38.readUnsignedShort((byte) 21) * -1666848879;
	    if (65535 == anInt3325 * -1960986255)
		anInt3325 = 1666848879;
	    int i_139_ = -1;
	    if (i == 118) {
		i_139_ = class525_sub38.readUnsignedShort((byte) 91);
		if (65535 == i_139_)
		    i_139_ = -1;
	    }
	    int i_140_ = class525_sub38.readUnsignedByte(672434291);
	    anIntArray3323 = new int[2 + i_140_];
	    for (int i_141_ = 0; i_141_ <= i_140_; i_141_++) {
		anIntArray3323[i_141_]
		    = class525_sub38.readUnsignedShort((byte) 117);
		if (65535 == anIntArray3323[i_141_])
		    anIntArray3323[i_141_] = -1;
	    }
	    anIntArray3323[i_140_ + 1] = i_139_;
	} else if (107 == i)
	    aBool3326 = false;
	else if (i == 109)
	    aBool3289 = false;
	else if (i == 111)
	    aBool3328 = false;
	else if (i == 113) {
	    aShort3329 = (short) class525_sub38.readUnsignedShort((byte) 46);
	    aShort3330 = (short) class525_sub38.readUnsignedShort((byte) 38);
	} else if (114 == i) {
	    aByte3331 = class525_sub38.readByte(-1150098071);
	    aByte3332 = class525_sub38.readByte(-1150098071);
	} else if (119 == i)
	    aByte3335 = class525_sub38.readByte(-1150098071);
	else if (i == 121) {
	    anIntArrayArray3308 = new int[anIntArray3324.length][];
	    int i_142_ = class525_sub38.readUnsignedByte(1997480191);
	    for (int i_143_ = 0; i_143_ < i_142_; i_143_++) {
		int i_144_ = class525_sub38.readUnsignedByte(2115941147);
		int[] is = anIntArrayArray3308[i_144_] = new int[3];
		is[0] = class525_sub38.readByte(-1150098071);
		is[1] = class525_sub38.readByte(-1150098071);
		is[2] = class525_sub38.readByte(-1150098071);
	    }
	} else if (123 == i)
	    anInt3338 = class525_sub38.readUnsignedShort((byte) 30) * 736164505;
	else if (125 == i)
	    aClass682_3284
		= ((Class682)
		   Class539.method8888(Class413.method6684(959731065),
				       class525_sub38.readByte(-1150098071),
				       -188793024));
	else if (127 == i)
	    anInt3295 = class525_sub38.readUnsignedShort((byte) 105) * -555461181;
	else if (i == 128)
	    Class539.method8888(Class684.method11241(-1976823770),
				class525_sub38.readUnsignedByte(1324102507),
				-860181890);
	else if (i == 134) {
	    anInt3354 = class525_sub38.readUnsignedShort((byte) 80) * 800152133;
	    if (65535 == anInt3354 * -1559975795)
		anInt3354 = -800152133;
	    anInt3339 = class525_sub38.readUnsignedShort((byte) 59) * -973620045;
	    if (1541231227 * anInt3339 == 65535)
		anInt3339 = 973620045;
	    anInt3357 = class525_sub38.readUnsignedShort((byte) 46) * -1945898911;
	    if (anInt3357 * 766686113 == 65535)
		anInt3357 = 1945898911;
	    anInt3321 = class525_sub38.readUnsignedShort((byte) 29) * -19645885;
	    if (anInt3321 * -1876270485 == 65535)
		anInt3321 = 19645885;
	    anInt3333 = class525_sub38.readUnsignedByte(1703521955) * -538292109;
	} else if (i == 135 || i == 136) {
	    class525_sub38.readUnsignedByte(370129855);
	    class525_sub38.readUnsignedShort((byte) 88);
	} else if (137 == i)
	    anInt3309 = class525_sub38.readUnsignedShort((byte) 43) * 1051512571;
	else if (i == 138)
	    anInt3288 = class525_sub38.readBigSmart(-2043778683) * -811182623;
	else if (i == 140)
	    anInt3285 = class525_sub38.readUnsignedByte(2105496719) * -266127983;
	else if (141 == i)
	    aBool3316 = true;
	else if (i == 142)
	    anInt3348 = class525_sub38.readUnsignedShort((byte) 4) * -2110390413;
	else if (i == 143)
	    aBool3294 = true;
	else if (i >= 150 && i < 155) {
	    aStringArray3307[i - 150] = class525_sub38.readString((byte) 44);
	    if (!aClass308_3287.aBool3425)
		aStringArray3307[i - 150] = null;
	} else if (155 == i) {
	    aByte3334 = class525_sub38.readByte(-1150098071);
	    aByte3304 = class525_sub38.readByte(-1150098071);
	    aByte3305 = class525_sub38.readByte(-1150098071);
	    aByte3306 = class525_sub38.readByte(-1150098071);
	} else if (i == 158)
	    aByte3350 = (byte) 1;
	else if (i == 159)
	    aByte3350 = (byte) 0;
	else if (i == 160) {
	    int i_145_ = class525_sub38.readUnsignedByte(759837028);
	    anIntArray3344 = new int[i_145_];
	    for (int i_146_ = 0; i_146_ < i_145_; i_146_++)
		anIntArray3344[i_146_] = class525_sub38.readUnsignedShort((byte) 13);
	} else if (i != 162) {
	    if (163 == i)
		anInt3351
		    = class525_sub38.readUnsignedByte(221036355) * -1656145107;
	    else if (i == 164) {
		anInt3303 = class525_sub38.readUnsignedShort((byte) 59) * 1734308915;
		anInt3312
		    = class525_sub38.readUnsignedShort((byte) 110) * 1889719379;
	    } else if (i == 165)
		anInt3355 = class525_sub38.readUnsignedByte(98568472) * 2078431827;
	    else if (i == 168)
		anInt3343
		    = class525_sub38.readUnsignedByte(1663245634) * 1323714039;
	    else if (i == 169)
		aBool3297 = false;
	    else if (i >= 170 && i < 176) {
		if (anIntArray3345 == null) {
		    anIntArray3345 = new int[6];
		    Arrays.fill(anIntArray3345, -1);
		}
		int i_147_ = class525_sub38.readUnsignedShort((byte) 31);
		if (i_147_ == 65535)
		    i_147_ = -1;
		anIntArray3345[i - 170] = i_147_;
	    } else if (178 != i) {
		if (179 == i) {
		    aClass443_3352 = new Class443();
		    aClass443_3352.aFloat4877
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4873
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4871
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4875
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4869
			= (float) class525_sub38.method16640(993241788);
		    aClass443_3352.aFloat4874
			= (float) class525_sub38.method16640(993241788);
		} else if (i == 180)
		    anInt3292 = (class525_sub38.readUnsignedByte(1234897968)
				 & 0xff) * -1459367951;
		else if (i == 181) {
		    aShort3296 = (short) class525_sub38.readUnsignedShort((byte) 19);
		    aByte3341 = (byte) class525_sub38.readUnsignedByte(2053669217);
		} else if (i == 182)
		    aBool3358 = true;
		else if (i == 249) {
		    int i_148_ = class525_sub38.readUnsignedByte(1644554987);
		    if (aClass10_3286 == null) {
			int i_149_ = Class212.method3935(i_148_, -2056250364);
			aClass10_3286 = new Class10(i_149_);
		    }
		    for (int i_150_ = 0; i_150_ < i_148_; i_150_++) {
			boolean bool
			    = class525_sub38.readUnsignedByte(2020624400) == 1;
			int i_151_ = class525_sub38.method16834(-1994884458);
			Class525 class525;
			if (bool)
			    class525
				= (new Class525_Sub19
				   (class525_sub38.readString((byte) 95)));
			else
			    class525
				= (new Class525_Sub42
				   (class525_sub38.readInt(1646089664)));
			aClass10_3286.method695(class525, (long) i_151_);
		    }
		}
	    }
	}
    }
    
    public void method70() {
	if (null == anIntArray3324)
	    anIntArray3324 = new int[0];
	if (aByte3350 == -1) {
	    if (aClass308_3287 == null
		|| aClass308_3287.aClass668_3419 == Class668.aClass668_8576)
		aByte3350 = (byte) 1;
	    else
		aByte3350 = (byte) 0;
	}
    }
    
    public void method69() {
	if (null == anIntArray3324)
	    anIntArray3324 = new int[0];
	if (aByte3350 == -1) {
	    if (aClass308_3287 == null
		|| aClass308_3287.aClass668_3419 == Class668.aClass668_8576)
		aByte3350 = (byte) 1;
	    else
		aByte3350 = (byte) 0;
	}
    }
    
    public boolean method5370(int i) {
	if (null == anIntArray3323)
	    return (anInt3354 * -1559975795 != -1
		    || -1 != anInt3357 * 766686113
		    || anInt3321 * -1876270485 != -1);
	for (int i_152_ = 0; i_152_ < anIntArray3323.length; i_152_++) {
	    if (anIntArray3323[i_152_] != -1) {
		Class299 class299_153_
		    = ((Class299)
		       anInterface13_3349.method76(anIntArray3323[i_152_],
						   -1214279064));
		if (-1559975795 * class299_153_.anInt3354 != -1
		    || class299_153_.anInt3357 * 766686113 != -1
		    || -1 != -1876270485 * class299_153_.anInt3321)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method5371(Interface20 interface20, Interface18 interface18,
			      int i) {
	if (null == anIntArray3323)
	    return true;
	int i_154_ = -1;
	if (-1 != anInt3346 * -1147386473) {
	    Class322 class322
		= interface20.method124(-1147386473 * anInt3346, -796009124);
	    if (null != class322)
		i_154_ = interface18.method93(class322, (byte) 2);
	} else if (-1 != anInt3325 * -1960986255) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					-1960986255 * anInt3325, -1674876034);
	    if (class163 != null)
		i_154_ = interface18.method104(class163, 623775022);
	}
	if (i_154_ < 0 || i_154_ >= anIntArray3323.length - 1) {
	    int i_155_ = anIntArray3323[anIntArray3323.length - 1];
	    if (i_155_ != -1)
		return true;
	    return false;
	}
	if (-1 == anIntArray3323[i_154_])
	    return false;
	return true;
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(2045860676);
	    if (0 == i)
		break;
	    method5363(class525_sub38, i, -1096780283);
	}
    }
    
    public final Class179 method5372
	(Class182 class182, int i, Class40_Sub1 class40_sub1,
	 Interface20 interface20, Interface18 interface18, Class689 class689,
	 Class689 class689_156_, Class689[] class689s, int[] is, int i_157_,
	 Class288 class288, int i_158_, boolean bool, byte i_159_) {
	if (anIntArray3323 != null) {
	    Class299 class299_160_
		= method5386(interface20, interface18, 2145564964);
	    if (class299_160_ == null)
		return null;
	    return class299_160_.method5372(class182, i, class40_sub1,
					    interface20, interface18, class689,
					    class689_156_, class689s, is,
					    i_157_, class288, i_158_, bool,
					    (byte) 13);
	}
	int i_161_ = i;
	if (128 != 857217249 * anInt3313)
	    i_161_ |= 0x2;
	if (-1737913109 * anInt3340 != 128)
	    i_161_ |= 0x5;
	boolean bool_162_ = false;
	int i_163_ = null != class689s ? class689s.length : 0;
	for (int i_164_ = 0; i_164_ < i_163_; i_164_++) {
	    if (null != class689s[i_164_]) {
		i_161_ |= class689s[i_164_].method14033(1956298563);
		bool_162_ = true;
	    }
	}
	if (null != class689) {
	    i_161_ |= class689.method14033(2100821826);
	    bool_162_ = true;
	}
	if (class689_156_ != null) {
	    i_161_ |= class689_156_.method14033(-1538343155);
	    bool_162_ = true;
	}
	long l = (long) (anInt3299 * 953284761
			 | -2117565327 * class182.anInt1942 << 16);
	if (class288 != null)
	    l |= class288.aLong3195 * 2910912014388413211L << 24;
	Class179 class179;
	synchronized (aClass308_3287.aClass200_3422) {
	    class179 = (Class179) aClass308_3287.aClass200_3422.method3785(l);
	}
	Class586 class586 = null;
	if (!bool && i_158_ != -1)
	    class586 = (Class586) class40_sub1.method76(i_158_, 1569863248);
	else if (386089707 * anInt3295 != -1)
	    class586 = (Class586) class40_sub1.method76(anInt3295 * 386089707,
							-1984663004);
	if (class179 == null || (class179.method2928() & i_161_) != i_161_) {
	    if (class179 != null)
		i_161_ |= class179.method2928();
	    int i_165_ = i_161_;
	    if (null != aShortArray3315)
		i_165_ |= 0x4000;
	    if (null != aShortArray3320)
		i_165_ |= 0x8000;
	    if (0 != aByte3306)
		i_165_ |= 0x80000;
	    int[] is_166_
		= (class288 != null && null != class288.anIntArray3197
		   ? class288.anIntArray3197 : anIntArray3324);
	    boolean bool_167_ = false;
	    synchronized (aClass308_3287.aClass458_3421) {
		for (int i_168_ = 0; i_168_ < is_166_.length; i_168_++) {
		    if (-1 != is_166_[i_168_]
			&& !aClass308_3287.aClass458_3421
				.method7478(is_166_[i_168_], 0, (short) 2605))
			bool_167_ = true;
		}
	    }
	    if (bool_167_)
		return null;
	    Class186[] class186s = new Class186[is_166_.length];
	    for (int i_169_ = 0; i_169_ < is_166_.length; i_169_++) {
		if (-1 != is_166_[i_169_]) {
		    synchronized (aClass308_3287.aClass458_3421) {
			class186s[i_169_]
			    = Class186.method3644((aClass308_3287
						   .aClass458_3421),
						  is_166_[i_169_], 0);
		    }
		    if (null != class186s[i_169_]) {
			if (class186s[i_169_].anInt2086 < 13)
			    class186s[i_169_].method3651(2);
			if (anIntArrayArray3308 != null
			    && null != anIntArrayArray3308[i_169_])
			    class186s[i_169_].method3633
				(anIntArrayArray3308[i_169_][0],
				 anIntArrayArray3308[i_169_][1],
				 anIntArrayArray3308[i_169_][2]);
		    }
		}
	    }
	    if (class288 != null) {
		for (int i_170_ = 0; i_170_ < class186s.length; i_170_++) {
		    if (class186s[i_170_] != null) {
			if (class288.aFloatArray3201 != null
			    && class288.aFloatArray3201[i_170_] != 0.0F)
			    class186s[i_170_]
				.method3635(class288.aFloatArray3201[i_170_]);
			if (class288.anIntArrayArray3198 != null)
			    class186s[i_170_].method3647
				(class288.anIntArrayArray3198[i_170_][0],
				 class288.anIntArrayArray3198[i_170_][1],
				 class288.anIntArrayArray3198[i_170_][2]);
			if (null != class288.anIntArrayArray3199)
			    class186s[i_170_].method3633
				(class288.anIntArrayArray3199[i_170_][0],
				 class288.anIntArrayArray3199[i_170_][1],
				 class288.anIntArrayArray3199[i_170_][2]);
		    }
		}
	    }
	    if (class586 != null && null != class586.anIntArrayArray7755) {
		for (int i_171_ = 0;
		     i_171_ < class586.anIntArrayArray7755.length; i_171_++) {
		    if (i_171_ < class186s.length
			&& class186s[i_171_] != null) {
			int i_172_ = 0;
			int i_173_ = 0;
			int i_174_ = 0;
			int i_175_ = 0;
			int i_176_ = 0;
			int i_177_ = 0;
			if (class586.anIntArrayArray7755[i_171_] != null) {
			    i_172_ = class586.anIntArrayArray7755[i_171_][0];
			    i_173_ = class586.anIntArrayArray7755[i_171_][1];
			    i_174_ = class586.anIntArrayArray7755[i_171_][2];
			    i_175_
				= class586.anIntArrayArray7755[i_171_][3] << 3;
			    i_176_
				= class586.anIntArrayArray7755[i_171_][4] << 3;
			    i_177_
				= class586.anIntArrayArray7755[i_171_][5] << 3;
			}
			if (i_175_ != 0 || i_176_ != 0 || 0 != i_177_)
			    class186s[i_171_].method3647(i_175_, i_176_,
							 i_177_);
			if (i_172_ != 0 || 0 != i_173_ || 0 != i_174_)
			    class186s[i_171_].method3633(i_172_, i_173_,
							 i_174_);
		    }
		}
	    }
	    Class186 class186;
	    if (1 == class186s.length)
		class186 = class186s[0];
	    else
		class186 = new Class186(class186s, class186s.length);
	    class179
		= class182.method3556(class186, i_165_,
				      -508213811 * aClass308_3287.anInt3424,
				      anInt3317 * -743718269 + 64,
				      -273050217 * anInt3318 + 850);
	    if (null != aShortArray3315) {
		short[] is_178_;
		if (class288 != null && null != class288.aShortArray3200)
		    is_178_ = class288.aShortArray3200;
		else
		    is_178_ = aShortArray3347;
		for (int i_179_ = 0; i_179_ < aShortArray3315.length;
		     i_179_++) {
		    if (aByteArray3298 != null
			&& i_179_ < aByteArray3298.length)
			class179.method2971(aShortArray3315[i_179_],
					    (aShortArray3353
					     [aByteArray3298[i_179_] & 0xff]));
		    else
			class179.method2971(aShortArray3315[i_179_],
					    is_178_[i_179_]);
		}
	    }
	    if (aShortArray3320 != null) {
		short[] is_180_;
		if (class288 != null && class288.aShortArray3196 != null)
		    is_180_ = class288.aShortArray3196;
		else
		    is_180_ = aShortArray3300;
		for (int i_181_ = 0; i_181_ < aShortArray3320.length; i_181_++)
		    class179.method2973(aShortArray3320[i_181_],
					is_180_[i_181_]);
	    }
	    if (aByte3306 != 0)
		class179.method2974(aByte3334, aByte3304, aByte3305,
				    aByte3306 & 0xff);
	    class179.method3003();
	    class179.method3010(i_161_);
	    synchronized (aClass308_3287.aClass200_3422) {
		aClass308_3287.aClass200_3422.method3788(class179, l);
	    }
	}
	Class179 class179_182_ = class179.method2926((byte) 4, i_161_, true);
	boolean bool_183_ = false;
	if (is != null) {
	    for (int i_184_ = 0; i_184_ < 12; i_184_++) {
		if (is[i_184_] != -1)
		    bool_183_ = true;
	    }
	}
	if (!bool_162_ && !bool_183_)
	    return class179_182_;
	Class444[] class444s = null;
	if (null != class586)
	    class444s = class586.method9667((byte) 35);
	if (bool_183_ && null != class444s) {
	    for (int i_185_ = 0; i_185_ < 12; i_185_++) {
		if (class444s[i_185_] != null)
		    class179_182_.method2943(class444s[i_185_], 1 << i_185_,
					     true);
	    }
	}
	int i_186_ = 0;
	int i_187_ = 1;
	while (i_186_ < i_163_) {
	    if (null != class689s[i_186_])
		class689s[i_186_].method14035(class179_182_, 0, i_187_,
					      -1314084613);
	    i_186_++;
	    i_187_ <<= 1;
	}
	if (bool_183_) {
	    for (i_186_ = 0; i_186_ < 12; i_186_++) {
		if (-1 != is[i_186_]) {
		    i_187_ = is[i_186_] - i_157_;
		    i_187_ &= 0x3fff;
		    Class444 class444 = new Class444();
		    class444.method7141(0.0F, 1.0F, 0.0F,
					Class436.method7071(i_187_));
		    class179_182_.method2943(class444, 1 << i_186_, false);
		}
	    }
	}
	if (bool_183_ && null != class444s) {
	    for (i_186_ = 0; i_186_ < 12; i_186_++) {
		if (class444s[i_186_] != null)
		    class179_182_.method2943(class444s[i_186_], 1 << i_186_,
					     false);
	    }
	}
	if (class689 != null && null != class689_156_)
	    Class643.method10599(class179_182_, class689, class689_156_,
				 -1889900988);
	else if (class689 != null)
	    class689.method14034(class179_182_, 0, 2114990516);
	else if (class689_156_ != null)
	    class689_156_.method14034(class179_182_, 0, 1524218708);
	if (128 != -1737913109 * anInt3340 || 857217249 * anInt3313 != 128)
	    class179_182_.method2936(-1737913109 * anInt3340,
				     anInt3313 * 857217249,
				     -1737913109 * anInt3340);
	class179_182_.method3010(i);
	return class179_182_;
    }
    
    public String method5373(int i, String string) {
	if (null == aClass10_3286)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_3286.method684((long) i);
	if (class525_sub19 == null)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public int method5374(int i, int i_188_) {
	if (null == anIntArray3345)
	    return -1;
	return anIntArray3345[i];
    }
    
    public String method5375(int i, String string, int i_189_) {
	if (null == aClass10_3286)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_3286.method684((long) i);
	if (class525_sub19 == null)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public final Class179 method5376
	(Class182 class182, int i, Class40_Sub1 class40_sub1,
	 Interface20 interface20, Interface18 interface18, Class689 class689,
	 Class689 class689_190_, Class689[] class689s, int[] is, int i_191_,
	 Class288 class288) {
	return method5372(class182, i, class40_sub1, interface20, interface18,
			  class689, class689_190_, class689s, is, i_191_,
			  class288, anInt3295 * 386089707, true, (byte) 53);
    }
    
    public final Class179 method5377
	(Class182 class182, int i, Class40_Sub1 class40_sub1,
	 Interface20 interface20, Interface18 interface18, Class689 class689,
	 Class689 class689_192_, Class689[] class689s, int[] is, int i_193_,
	 Class288 class288) {
	return method5372(class182, i, class40_sub1, interface20, interface18,
			  class689, class689_192_, class689s, is, i_193_,
			  class288, anInt3295 * 386089707, true, (byte) 86);
    }
    
    public boolean method5378(Interface20 interface20,
			      Interface18 interface18) {
	if (null == anIntArray3323)
	    return true;
	int i = -1;
	if (-1 != anInt3346 * -1147386473) {
	    Class322 class322
		= interface20.method124(-1147386473 * anInt3346, 1406919833);
	    if (null != class322)
		i = interface18.method93(class322, (byte) 2);
	} else if (-1 != anInt3325 * -1960986255) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					-1960986255 * anInt3325, -1160907239);
	    if (class163 != null)
		i = interface18.method104(class163, 623775022);
	}
	if (i < 0 || i >= anIntArray3323.length - 1) {
	    int i_194_ = anIntArray3323[anIntArray3323.length - 1];
	    if (i_194_ != -1)
		return true;
	    return false;
	}
	if (-1 == anIntArray3323[i])
	    return false;
	return true;
    }
    
    public final Class179 method5379
	(Class182 class182, int i, Interface20 interface20,
	 Interface18 interface18, Class689 class689, Class288 class288) {
	if (null != anIntArray3323) {
	    Class299 class299_195_
		= method5386(interface20, interface18, 2131071092);
	    if (class299_195_ == null)
		return null;
	    return class299_195_.method5383(class182, i, interface20,
					    interface18, class689, class288,
					    (byte) 40);
	}
	if (null == anIntArray3293
	    && (null == class288 || class288.anIntArray3197 == null))
	    return null;
	int i_196_ = i;
	if (null != class689)
	    i_196_ |= class689.method14033(1250552069);
	long l = (long) (anInt3299 * 953284761
			 | -2117565327 * class182.anInt1942 << 16);
	if (class288 != null)
	    l |= class288.aLong3195 * 2910912014388413211L << 24;
	Class179 class179;
	synchronized (aClass308_3287.aClass200_3423) {
	    class179 = (Class179) aClass308_3287.aClass200_3423.method3785(l);
	}
	if (class179 == null || (class179.method2928() & i_196_) != i_196_) {
	    if (null != class179)
		i_196_ |= class179.method2928();
	    int i_197_ = i_196_;
	    if (aShortArray3315 != null)
		i_197_ |= 0x4000;
	    if (aShortArray3320 != null)
		i_197_ |= 0x8000;
	    if (0 != aByte3306)
		i_197_ |= 0x80000;
	    int[] is = (null != class288 && null != class288.anIntArray3197
			? class288.anIntArray3197 : anIntArray3293);
	    boolean bool = false;
	    synchronized (aClass308_3287.aClass458_3421) {
		for (int i_198_ = 0; i_198_ < is.length; i_198_++) {
		    if (!aClass308_3287.aClass458_3421
			     .method7478(is[i_198_], 0, (short) 13808))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class186[] class186s = new Class186[is.length];
	    synchronized (aClass308_3287.aClass458_3421) {
		for (int i_199_ = 0; i_199_ < is.length; i_199_++)
		    class186s[i_199_]
			= Class186.method3644(aClass308_3287.aClass458_3421,
					      is[i_199_], 0);
	    }
	    for (int i_200_ = 0; i_200_ < is.length; i_200_++) {
		if (null != class186s[i_200_]
		    && class186s[i_200_].anInt2086 < 13)
		    class186s[i_200_].method3651(2);
	    }
	    Class186 class186;
	    if (class186s.length == 1)
		class186 = class186s[0];
	    else
		class186 = new Class186(class186s, class186s.length);
	    class179
		= class182.method3556(class186, i_197_,
				      aClass308_3287.anInt3424 * -508213811,
				      64, 768);
	    if (null != aShortArray3315) {
		short[] is_201_;
		if (class288 != null && class288.aShortArray3200 != null)
		    is_201_ = class288.aShortArray3200;
		else
		    is_201_ = aShortArray3347;
		for (int i_202_ = 0; i_202_ < aShortArray3315.length;
		     i_202_++) {
		    if (null != aByteArray3298
			&& i_202_ < aByteArray3298.length)
			class179.method2971(aShortArray3315[i_202_],
					    (aShortArray3353
					     [aByteArray3298[i_202_] & 0xff]));
		    else
			class179.method2971(aShortArray3315[i_202_],
					    is_201_[i_202_]);
		}
	    }
	    if (null != aShortArray3320) {
		short[] is_203_;
		if (class288 != null && null != class288.aShortArray3196)
		    is_203_ = class288.aShortArray3196;
		else
		    is_203_ = aShortArray3300;
		for (int i_204_ = 0; i_204_ < aShortArray3320.length; i_204_++)
		    class179.method2973(aShortArray3320[i_204_],
					is_203_[i_204_]);
	    }
	    if (aByte3306 != 0)
		class179.method2974(aByte3334, aByte3304, aByte3305,
				    aByte3306 & 0xff);
	    class179.method3010(i_196_);
	    synchronized (aClass308_3287.aClass200_3423) {
		aClass308_3287.aClass200_3423.method3788(class179, l);
	    }
	}
	if (null != class689) {
	    class179 = class179.method2926((byte) 1, i_196_, true);
	    class689.method14034(class179, 0, 1673658677);
	}
	class179.method3010(i);
	return class179;
    }
    
    public final boolean method5380() {
	if (anIntArray3324 == null)
	    return true;
	boolean bool = true;
	int[] is = anIntArray3324;
	for (int i = 0; i < is.length; i++) {
	    int i_205_ = is[i];
	    if (!aClass308_3287.aClass458_3421.method7478(i_205_, 0,
							  (short) 6809))
		bool = false;
	}
	return bool;
    }
    
    public final boolean method5381() {
	if (anIntArray3324 == null)
	    return true;
	boolean bool = true;
	int[] is = anIntArray3324;
	for (int i = 0; i < is.length; i++) {
	    int i_206_ = is[i];
	    if (!aClass308_3287.aClass458_3421.method7478(i_206_, 0,
							  (short) 31201))
		bool = false;
	}
	return bool;
    }
    
    public int method5382(int i, int i_207_) {
	if (aClass10_3286 == null)
	    return i_207_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_3286.method684((long) i);
	if (null == class525_sub42)
	    return i_207_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public final Class179 method5383
	(Class182 class182, int i, Interface20 interface20,
	 Interface18 interface18, Class689 class689, Class288 class288,
	 byte i_208_) {
	if (null != anIntArray3323) {
	    Class299 class299_209_
		= method5386(interface20, interface18, 2092856280);
	    if (class299_209_ == null)
		return null;
	    return class299_209_.method5383(class182, i, interface20,
					    interface18, class689, class288,
					    (byte) 8);
	}
	if (null == anIntArray3293
	    && (null == class288 || class288.anIntArray3197 == null))
	    return null;
	int i_210_ = i;
	if (null != class689)
	    i_210_ |= class689.method14033(1168063844);
	long l = (long) (anInt3299 * 953284761
			 | -2117565327 * class182.anInt1942 << 16);
	if (class288 != null)
	    l |= class288.aLong3195 * 2910912014388413211L << 24;
	Class179 class179;
	synchronized (aClass308_3287.aClass200_3423) {
	    class179 = (Class179) aClass308_3287.aClass200_3423.method3785(l);
	}
	if (class179 == null || (class179.method2928() & i_210_) != i_210_) {
	    if (null != class179)
		i_210_ |= class179.method2928();
	    int i_211_ = i_210_;
	    if (aShortArray3315 != null)
		i_211_ |= 0x4000;
	    if (aShortArray3320 != null)
		i_211_ |= 0x8000;
	    if (0 != aByte3306)
		i_211_ |= 0x80000;
	    int[] is = (null != class288 && null != class288.anIntArray3197
			? class288.anIntArray3197 : anIntArray3293);
	    boolean bool = false;
	    synchronized (aClass308_3287.aClass458_3421) {
		for (int i_212_ = 0; i_212_ < is.length; i_212_++) {
		    if (!aClass308_3287.aClass458_3421
			     .method7478(is[i_212_], 0, (short) 11537))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class186[] class186s = new Class186[is.length];
	    synchronized (aClass308_3287.aClass458_3421) {
		for (int i_213_ = 0; i_213_ < is.length; i_213_++)
		    class186s[i_213_]
			= Class186.method3644(aClass308_3287.aClass458_3421,
					      is[i_213_], 0);
	    }
	    for (int i_214_ = 0; i_214_ < is.length; i_214_++) {
		if (null != class186s[i_214_]
		    && class186s[i_214_].anInt2086 < 13)
		    class186s[i_214_].method3651(2);
	    }
	    Class186 class186;
	    if (class186s.length == 1)
		class186 = class186s[0];
	    else
		class186 = new Class186(class186s, class186s.length);
	    class179
		= class182.method3556(class186, i_211_,
				      aClass308_3287.anInt3424 * -508213811,
				      64, 768);
	    if (null != aShortArray3315) {
		short[] is_215_;
		if (class288 != null && class288.aShortArray3200 != null)
		    is_215_ = class288.aShortArray3200;
		else
		    is_215_ = aShortArray3347;
		for (int i_216_ = 0; i_216_ < aShortArray3315.length;
		     i_216_++) {
		    if (null != aByteArray3298
			&& i_216_ < aByteArray3298.length)
			class179.method2971(aShortArray3315[i_216_],
					    (aShortArray3353
					     [aByteArray3298[i_216_] & 0xff]));
		    else
			class179.method2971(aShortArray3315[i_216_],
					    is_215_[i_216_]);
		}
	    }
	    if (null != aShortArray3320) {
		short[] is_217_;
		if (class288 != null && null != class288.aShortArray3196)
		    is_217_ = class288.aShortArray3196;
		else
		    is_217_ = aShortArray3300;
		for (int i_218_ = 0; i_218_ < aShortArray3320.length; i_218_++)
		    class179.method2973(aShortArray3320[i_218_],
					is_217_[i_218_]);
	    }
	    if (aByte3306 != 0)
		class179.method2974(aByte3334, aByte3304, aByte3305,
				    aByte3306 & 0xff);
	    class179.method3010(i_210_);
	    synchronized (aClass308_3287.aClass200_3423) {
		aClass308_3287.aClass200_3423.method3788(class179, l);
	    }
	}
	if (null != class689) {
	    class179 = class179.method2926((byte) 1, i_210_, true);
	    class689.method14034(class179, 0, 1585941181);
	}
	class179.method3010(i);
	return class179;
    }
    
    public String method5384(int i, String string) {
	if (null == aClass10_3286)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_3286.method684((long) i);
	if (class525_sub19 == null)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public final Class299 method5385(Interface20 interface20,
				     Interface18 interface18) {
	int i = -1;
	if (-1 != -1147386473 * anInt3346) {
	    Class322 class322
		= interface20.method124(-1147386473 * anInt3346, 845219403);
	    if (class322 != null)
		i = interface18.method93(class322, (byte) 2);
	} else if (-1960986255 * anInt3325 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3325 * -1960986255, -1821371637);
	    if (class163 != null)
		i = interface18.method104(class163, 623775022);
	}
	if (i < 0 || i >= anIntArray3323.length - 1) {
	    int i_219_ = anIntArray3323[anIntArray3323.length - 1];
	    if (i_219_ != -1)
		return ((Class299)
			anInterface13_3349.method76(i_219_, -1432713364));
	    return null;
	}
	if (anIntArray3323[i] == -1)
	    return null;
	return ((Class299)
		anInterface13_3349.method76(anIntArray3323[i], 725065048));
    }
    
    public void method67(int i) {
	if (null == anIntArray3324)
	    anIntArray3324 = new int[0];
	if (aByte3350 == -1) {
	    if (aClass308_3287 == null
		|| aClass308_3287.aClass668_3419 == Class668.aClass668_8576)
		aByte3350 = (byte) 1;
	    else
		aByte3350 = (byte) 0;
	}
    }
    
    public final Class299 method5386(Interface20 interface20,
				     Interface18 interface18, int i) {
	int i_220_ = -1;
	if (-1 != -1147386473 * anInt3346) {
	    Class322 class322
		= interface20.method124(-1147386473 * anInt3346, -1080267311);
	    if (class322 != null)
		i_220_ = interface18.method93(class322, (byte) 2);
	} else if (-1960986255 * anInt3325 != -1) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					anInt3325 * -1960986255, -1019737666);
	    if (class163 != null)
		i_220_ = interface18.method104(class163, 623775022);
	}
	if (i_220_ < 0 || i_220_ >= anIntArray3323.length - 1) {
	    int i_221_ = anIntArray3323[anIntArray3323.length - 1];
	    if (i_221_ != -1)
		return ((Class299)
			anInterface13_3349.method76(i_221_, 1873616404));
	    return null;
	}
	if (anIntArray3323[i_220_] == -1)
	    return null;
	return (Class299) anInterface13_3349.method76(anIntArray3323[i_220_],
						      1130592826);
    }
    
    public boolean method5387() {
	if (null == anIntArray3323)
	    return (anInt3354 * -1559975795 != -1
		    || -1 != anInt3357 * 766686113
		    || anInt3321 * -1876270485 != -1);
	for (int i = 0; i < anIntArray3323.length; i++) {
	    if (anIntArray3323[i] != -1) {
		Class299 class299_222_
		    = (Class299) anInterface13_3349.method76(anIntArray3323[i],
							     558338358);
		if (-1559975795 * class299_222_.anInt3354 != -1
		    || class299_222_.anInt3357 * 766686113 != -1
		    || -1 != -1876270485 * class299_222_.anInt3321)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method5388() {
	if (null == anIntArray3323)
	    return (anInt3354 * -1559975795 != -1
		    || -1 != anInt3357 * 766686113
		    || anInt3321 * -1876270485 != -1);
	for (int i = 0; i < anIntArray3323.length; i++) {
	    if (anIntArray3323[i] != -1) {
		Class299 class299_223_
		    = (Class299) anInterface13_3349.method76(anIntArray3323[i],
							     -995696075);
		if (-1559975795 * class299_223_.anInt3354 != -1
		    || class299_223_.anInt3357 * 766686113 != -1
		    || -1 != -1876270485 * class299_223_.anInt3321)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method5389() {
	if (null == anIntArray3323)
	    return (anInt3354 * -1559975795 != -1
		    || -1 != anInt3357 * 766686113
		    || anInt3321 * -1876270485 != -1);
	for (int i = 0; i < anIntArray3323.length; i++) {
	    if (anIntArray3323[i] != -1) {
		Class299 class299_224_
		    = (Class299) anInterface13_3349.method76(anIntArray3323[i],
							     -1225436589);
		if (-1559975795 * class299_224_.anInt3354 != -1
		    || class299_224_.anInt3357 * 766686113 != -1
		    || -1 != -1876270485 * class299_224_.anInt3321)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method5390() {
	if (null == anIntArray3323)
	    return (anInt3354 * -1559975795 != -1
		    || -1 != anInt3357 * 766686113
		    || anInt3321 * -1876270485 != -1);
	for (int i = 0; i < anIntArray3323.length; i++) {
	    if (anIntArray3323[i] != -1) {
		Class299 class299_225_
		    = (Class299) anInterface13_3349.method76(anIntArray3323[i],
							     -676656056);
		if (-1559975795 * class299_225_.anInt3354 != -1
		    || class299_225_.anInt3357 * 766686113 != -1
		    || -1 != -1876270485 * class299_225_.anInt3321)
		    return true;
	    }
	}
	return false;
    }
    
    public int method5391(int i) {
	if (null == anIntArray3345)
	    return -1;
	return anIntArray3345[i];
    }
    
    public int method5392(int i) {
	if (null == anIntArray3345)
	    return -1;
	return anIntArray3345[i];
    }
    
    public static void method5393(String string, boolean bool,
				  boolean bool_226_, int i) {
	Class644.method10614(string, bool, "openjs", bool_226_, -603898218);
    }
    
    static final void method5394(Class683 class683, int i) {
	int i_227_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_227_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_227_ >> 16];
	Class286.method5230(class259, class245, class683, -1950231521);
    }
}
