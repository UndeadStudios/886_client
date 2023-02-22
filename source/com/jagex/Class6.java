/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class6
{
    int anInt37;
    int anInt38;
    static final int anInt39 = 1020;
    int anInt40;
    int[] anIntArray41;
    int[] anIntArray42 = new int[256];
    static final int anInt43 = 256;
    static final int anInt44 = 8;
    int anInt45;
    
    public final int method543() {
	if (0 == -171525271 * anInt40) {
	    method552(-244190274);
	    anInt40 = -2122000128;
	}
	return anIntArray41[(anInt40 -= 1921090777) * -171525271];
    }
    
    public final int method544(int i) {
	if (0 == -171525271 * anInt40) {
	    method552(1489950765);
	    anInt40 = -2122000128;
	}
	return anIntArray41[(anInt40 -= 1921090777) * -171525271];
    }
    
    public final int method545(byte i) {
	if (0 == anInt40 * -171525271) {
	    method552(1501931181);
	    anInt40 = -2122000128;
	}
	return anIntArray41[-171525271 * anInt40 - 1];
    }
    
    public final int method546() {
	if (0 == anInt40 * -171525271) {
	    method552(2065848844);
	    anInt40 = -2122000128;
	}
	return anIntArray41[-171525271 * anInt40 - 1];
    }
    
    final void method547(int i) {
	int i_0_ = -1640531527;
	int i_1_ = -1640531527;
	int i_2_ = -1640531527;
	int i_3_ = -1640531527;
	int i_4_ = -1640531527;
	int i_5_ = -1640531527;
	int i_6_ = -1640531527;
	int i_7_ = -1640531527;
	for (int i_8_ = 0; i_8_ < 4; i_8_++) {
	    i_7_ ^= i_6_ << 11;
	    i_4_ += i_7_;
	    i_6_ += i_5_;
	    i_6_ ^= i_5_ >>> 2;
	    i_3_ += i_6_;
	    i_5_ += i_4_;
	    i_5_ ^= i_4_ << 8;
	    i_2_ += i_5_;
	    i_4_ += i_3_;
	    i_4_ ^= i_3_ >>> 16;
	    i_1_ += i_4_;
	    i_3_ += i_2_;
	    i_3_ ^= i_2_ << 10;
	    i_0_ += i_3_;
	    i_2_ += i_1_;
	    i_2_ ^= i_1_ >>> 4;
	    i_7_ += i_2_;
	    i_1_ += i_0_;
	    i_1_ ^= i_0_ << 8;
	    i_6_ += i_1_;
	    i_0_ += i_7_;
	    i_0_ ^= i_7_ >>> 9;
	    i_5_ += i_0_;
	    i_7_ += i_6_;
	}
	for (int i_9_ = 0; i_9_ < 256; i_9_ += 8) {
	    i_7_ += anIntArray41[i_9_];
	    i_6_ += anIntArray41[i_9_ + 1];
	    i_5_ += anIntArray41[2 + i_9_];
	    i_4_ += anIntArray41[i_9_ + 3];
	    i_3_ += anIntArray41[4 + i_9_];
	    i_2_ += anIntArray41[5 + i_9_];
	    i_1_ += anIntArray41[i_9_ + 6];
	    i_0_ += anIntArray41[i_9_ + 7];
	    i_7_ ^= i_6_ << 11;
	    i_4_ += i_7_;
	    i_6_ += i_5_;
	    i_6_ ^= i_5_ >>> 2;
	    i_3_ += i_6_;
	    i_5_ += i_4_;
	    i_5_ ^= i_4_ << 8;
	    i_2_ += i_5_;
	    i_4_ += i_3_;
	    i_4_ ^= i_3_ >>> 16;
	    i_1_ += i_4_;
	    i_3_ += i_2_;
	    i_3_ ^= i_2_ << 10;
	    i_0_ += i_3_;
	    i_2_ += i_1_;
	    i_2_ ^= i_1_ >>> 4;
	    i_7_ += i_2_;
	    i_1_ += i_0_;
	    i_1_ ^= i_0_ << 8;
	    i_6_ += i_1_;
	    i_0_ += i_7_;
	    i_0_ ^= i_7_ >>> 9;
	    i_5_ += i_0_;
	    i_7_ += i_6_;
	    anIntArray42[i_9_] = i_7_;
	    anIntArray42[1 + i_9_] = i_6_;
	    anIntArray42[i_9_ + 2] = i_5_;
	    anIntArray42[3 + i_9_] = i_4_;
	    anIntArray42[4 + i_9_] = i_3_;
	    anIntArray42[5 + i_9_] = i_2_;
	    anIntArray42[6 + i_9_] = i_1_;
	    anIntArray42[7 + i_9_] = i_0_;
	}
	for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
	    i_7_ += anIntArray42[i_10_];
	    i_6_ += anIntArray42[i_10_ + 1];
	    i_5_ += anIntArray42[2 + i_10_];
	    i_4_ += anIntArray42[3 + i_10_];
	    i_3_ += anIntArray42[i_10_ + 4];
	    i_2_ += anIntArray42[5 + i_10_];
	    i_1_ += anIntArray42[6 + i_10_];
	    i_0_ += anIntArray42[7 + i_10_];
	    i_7_ ^= i_6_ << 11;
	    i_4_ += i_7_;
	    i_6_ += i_5_;
	    i_6_ ^= i_5_ >>> 2;
	    i_3_ += i_6_;
	    i_5_ += i_4_;
	    i_5_ ^= i_4_ << 8;
	    i_2_ += i_5_;
	    i_4_ += i_3_;
	    i_4_ ^= i_3_ >>> 16;
	    i_1_ += i_4_;
	    i_3_ += i_2_;
	    i_3_ ^= i_2_ << 10;
	    i_0_ += i_3_;
	    i_2_ += i_1_;
	    i_2_ ^= i_1_ >>> 4;
	    i_7_ += i_2_;
	    i_1_ += i_0_;
	    i_1_ ^= i_0_ << 8;
	    i_6_ += i_1_;
	    i_0_ += i_7_;
	    i_0_ ^= i_7_ >>> 9;
	    i_5_ += i_0_;
	    i_7_ += i_6_;
	    anIntArray42[i_10_] = i_7_;
	    anIntArray42[i_10_ + 1] = i_6_;
	    anIntArray42[2 + i_10_] = i_5_;
	    anIntArray42[3 + i_10_] = i_4_;
	    anIntArray42[4 + i_10_] = i_3_;
	    anIntArray42[5 + i_10_] = i_2_;
	    anIntArray42[6 + i_10_] = i_1_;
	    anIntArray42[i_10_ + 7] = i_0_;
	}
	method552(1914585972);
	anInt40 = -2122000128;
    }
    
    public final int method548() {
	if (0 == anInt40 * -171525271) {
	    method552(1097222586);
	    anInt40 = -2122000128;
	}
	return anIntArray41[-171525271 * anInt40 - 1];
    }
    
    public final int method549() {
	if (0 == anInt40 * -171525271) {
	    method552(315141973);
	    anInt40 = -2122000128;
	}
	return anIntArray41[-171525271 * anInt40 - 1];
    }
    
    public Class6(int[] is) {
	anIntArray41 = new int[256];
	for (int i = 0; i < is.length; i++)
	    anIntArray41[i] = is[i];
	method547(278358603);
    }
    
    final void method550() {
	anInt38 += (anInt45 += -250405473) * -1077637469;
	for (int i = 0; i < 256; i++) {
	    int i_11_ = anIntArray42[i];
	    if (0 == (i & 0x2)) {
		if ((i & 0x1) == 0)
		    anInt37 = -1058174073 * (-2066855369 * anInt37
					     ^ anInt37 * -2066855369 << 13);
		else
		    anInt37 = -1058174073 * (-2066855369 * anInt37
					     ^ -2066855369 * anInt37 >>> 6);
	    } else if ((i & 0x1) == 0)
		anInt37 = ((-2066855369 * anInt37 ^ anInt37 * -2066855369 << 2)
			   * -1058174073);
	    else
		anInt37 = (anInt37 * -2066855369
			   ^ -2066855369 * anInt37 >>> 16) * -1058174073;
	    anInt37 += -1058174073 * anIntArray42[i + 128 & 0xff];
	    int i_12_;
	    anIntArray42[i] = i_12_
		= (anInt37 * -2066855369 + anIntArray42[(i_11_ & 0x3fc) >> 2]
		   + anInt38 * -1636927211);
	    anIntArray41[i]
		= (anInt38 = ((i_11_ + anIntArray42[(i_12_ >> 8 & 0x3fc) >> 2])
			      * 1750470205)) * -1636927211;
	}
    }
    
    public final int method551() {
	if (0 == anInt40 * -171525271) {
	    method552(804891939);
	    anInt40 = -2122000128;
	}
	return anIntArray41[-171525271 * anInt40 - 1];
    }
    
    final void method552(int i) {
	anInt38 += (anInt45 += -250405473) * -1077637469;
	for (int i_13_ = 0; i_13_ < 256; i_13_++) {
	    int i_14_ = anIntArray42[i_13_];
	    if (0 == (i_13_ & 0x2)) {
		if ((i_13_ & 0x1) == 0)
		    anInt37 = -1058174073 * (-2066855369 * anInt37
					     ^ anInt37 * -2066855369 << 13);
		else
		    anInt37 = -1058174073 * (-2066855369 * anInt37
					     ^ -2066855369 * anInt37 >>> 6);
	    } else if ((i_13_ & 0x1) == 0)
		anInt37 = ((-2066855369 * anInt37 ^ anInt37 * -2066855369 << 2)
			   * -1058174073);
	    else
		anInt37 = (anInt37 * -2066855369
			   ^ -2066855369 * anInt37 >>> 16) * -1058174073;
	    anInt37 += -1058174073 * anIntArray42[i_13_ + 128 & 0xff];
	    int i_15_;
	    anIntArray42[i_13_] = i_15_
		= (anInt37 * -2066855369 + anIntArray42[(i_14_ & 0x3fc) >> 2]
		   + anInt38 * -1636927211);
	    anIntArray41[i_13_]
		= (anInt38 = ((i_14_ + anIntArray42[(i_15_ >> 8 & 0x3fc) >> 2])
			      * 1750470205)) * -1636927211;
	}
    }
    
    public final int method553() {
	if (0 == anInt40 * -171525271) {
	    method552(690439339);
	    anInt40 = -2122000128;
	}
	return anIntArray41[-171525271 * anInt40 - 1];
    }
    
    final void method554() {
	int i = -1640531527;
	int i_16_ = -1640531527;
	int i_17_ = -1640531527;
	int i_18_ = -1640531527;
	int i_19_ = -1640531527;
	int i_20_ = -1640531527;
	int i_21_ = -1640531527;
	int i_22_ = -1640531527;
	for (int i_23_ = 0; i_23_ < 4; i_23_++) {
	    i_22_ ^= i_21_ << 11;
	    i_19_ += i_22_;
	    i_21_ += i_20_;
	    i_21_ ^= i_20_ >>> 2;
	    i_18_ += i_21_;
	    i_20_ += i_19_;
	    i_20_ ^= i_19_ << 8;
	    i_17_ += i_20_;
	    i_19_ += i_18_;
	    i_19_ ^= i_18_ >>> 16;
	    i_16_ += i_19_;
	    i_18_ += i_17_;
	    i_18_ ^= i_17_ << 10;
	    i += i_18_;
	    i_17_ += i_16_;
	    i_17_ ^= i_16_ >>> 4;
	    i_22_ += i_17_;
	    i_16_ += i;
	    i_16_ ^= i << 8;
	    i_21_ += i_16_;
	    i += i_22_;
	    i ^= i_22_ >>> 9;
	    i_20_ += i;
	    i_22_ += i_21_;
	}
	for (int i_24_ = 0; i_24_ < 256; i_24_ += 8) {
	    i_22_ += anIntArray41[i_24_];
	    i_21_ += anIntArray41[i_24_ + 1];
	    i_20_ += anIntArray41[2 + i_24_];
	    i_19_ += anIntArray41[i_24_ + 3];
	    i_18_ += anIntArray41[4 + i_24_];
	    i_17_ += anIntArray41[5 + i_24_];
	    i_16_ += anIntArray41[i_24_ + 6];
	    i += anIntArray41[i_24_ + 7];
	    i_22_ ^= i_21_ << 11;
	    i_19_ += i_22_;
	    i_21_ += i_20_;
	    i_21_ ^= i_20_ >>> 2;
	    i_18_ += i_21_;
	    i_20_ += i_19_;
	    i_20_ ^= i_19_ << 8;
	    i_17_ += i_20_;
	    i_19_ += i_18_;
	    i_19_ ^= i_18_ >>> 16;
	    i_16_ += i_19_;
	    i_18_ += i_17_;
	    i_18_ ^= i_17_ << 10;
	    i += i_18_;
	    i_17_ += i_16_;
	    i_17_ ^= i_16_ >>> 4;
	    i_22_ += i_17_;
	    i_16_ += i;
	    i_16_ ^= i << 8;
	    i_21_ += i_16_;
	    i += i_22_;
	    i ^= i_22_ >>> 9;
	    i_20_ += i;
	    i_22_ += i_21_;
	    anIntArray42[i_24_] = i_22_;
	    anIntArray42[1 + i_24_] = i_21_;
	    anIntArray42[i_24_ + 2] = i_20_;
	    anIntArray42[3 + i_24_] = i_19_;
	    anIntArray42[4 + i_24_] = i_18_;
	    anIntArray42[5 + i_24_] = i_17_;
	    anIntArray42[6 + i_24_] = i_16_;
	    anIntArray42[7 + i_24_] = i;
	}
	for (int i_25_ = 0; i_25_ < 256; i_25_ += 8) {
	    i_22_ += anIntArray42[i_25_];
	    i_21_ += anIntArray42[i_25_ + 1];
	    i_20_ += anIntArray42[2 + i_25_];
	    i_19_ += anIntArray42[3 + i_25_];
	    i_18_ += anIntArray42[i_25_ + 4];
	    i_17_ += anIntArray42[5 + i_25_];
	    i_16_ += anIntArray42[6 + i_25_];
	    i += anIntArray42[7 + i_25_];
	    i_22_ ^= i_21_ << 11;
	    i_19_ += i_22_;
	    i_21_ += i_20_;
	    i_21_ ^= i_20_ >>> 2;
	    i_18_ += i_21_;
	    i_20_ += i_19_;
	    i_20_ ^= i_19_ << 8;
	    i_17_ += i_20_;
	    i_19_ += i_18_;
	    i_19_ ^= i_18_ >>> 16;
	    i_16_ += i_19_;
	    i_18_ += i_17_;
	    i_18_ ^= i_17_ << 10;
	    i += i_18_;
	    i_17_ += i_16_;
	    i_17_ ^= i_16_ >>> 4;
	    i_22_ += i_17_;
	    i_16_ += i;
	    i_16_ ^= i << 8;
	    i_21_ += i_16_;
	    i += i_22_;
	    i ^= i_22_ >>> 9;
	    i_20_ += i;
	    i_22_ += i_21_;
	    anIntArray42[i_25_] = i_22_;
	    anIntArray42[i_25_ + 1] = i_21_;
	    anIntArray42[2 + i_25_] = i_20_;
	    anIntArray42[3 + i_25_] = i_19_;
	    anIntArray42[4 + i_25_] = i_18_;
	    anIntArray42[5 + i_25_] = i_17_;
	    anIntArray42[6 + i_25_] = i_16_;
	    anIntArray42[i_25_ + 7] = i;
	}
	method552(1131015885);
	anInt40 = -2122000128;
    }
    
    static final void method555(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class407.anInt4183 * 727473945;
    }
    
    public static void method556(Class525_Sub16 class525_sub16,
				 Class525_Sub16 class525_sub16_26_, int i) {
	if (null != class525_sub16.aClass525_Sub16_10552)
	    class525_sub16.method16266(-1925745724);
	class525_sub16.aClass525_Sub16_10552 = class525_sub16_26_;
	class525_sub16.aClass525_Sub16_10554
	    = class525_sub16_26_.aClass525_Sub16_10554;
	class525_sub16.aClass525_Sub16_10552.aClass525_Sub16_10554
	    = class525_sub16;
	class525_sub16.aClass525_Sub16_10554.aClass525_Sub16_10552
	    = class525_sub16;
    }
    
    public static void method557(int i, String string, boolean bool,
				 short i_27_) {
	if (i == 0) {
	    Class501.aClass182_5564
		= Class232.method4394(0, Class532.aCanvas7169,
				      Class166.aClass180_1835,
				      Class411.anInterface24_4255,
				      Class628.aClass385_8157,
				      Class263.aClass402_2799,
				      Class450.aClass400_4926,
				      Class17_Sub1.aClass458_11027,
				      Class198_Sub13.aClass525_Sub30_9973
					  .aClass696_Sub39_10678
					  .method17324(-16711936) * 2,
				      1140373233);
	    if (string != null) {
		Class501.aClass182_5564.method3188(1, 0);
		Class7 class7
		    = Class610.method10023(Class276.aClass458_2875,
					   -1076192539 * Class188.anInt2135, 0,
					   Class7.aClass404_53, -1662983698);
		Class175 class175
		    = (Class501.aClass182_5564.method3223
		       (class7,
			Class187.method3674(Class462.aClass458_5095,
					    -1076192539 * Class188.anInt2135,
					    0),
			true));
		Class275.method5104((byte) -4);
		Class666.method11016(string, true, Class501.aClass182_5564,
				     class175, class7, -310820315);
	    }
	} else {
	    Class182 class182 = null;
	    if (null != string) {
		class182 = Class232.method4394(0, Class532.aCanvas7169,
					       Class166.aClass180_1835,
					       Class411.anInterface24_4255,
					       Class628.aClass385_8157,
					       Class263.aClass402_2799,
					       Class450.aClass400_4926,
					       Class17_Sub1.aClass458_11027, 0,
					       173838115);
		class182.method3188(1, 0);
		Class7 class7
		    = Class49.method1125(Class276.aClass458_2875,
					 -1076192539 * Class188.anInt2135, 0,
					 (short) -31175);
		Class175 class175
		    = (class182.method3223
		       (class7,
			Class187.method3674(Class462.aClass458_5095,
					    -1076192539 * Class188.anInt2135,
					    0),
			true));
		Class275.method5104((byte) -59);
		Class666.method11016(string, true, class182, class175, class7,
				     1822926813);
		try {
		    class182.method3134(-1899357015);
		    class182 = null;
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    try {
		try {
		    Class163_Sub2.method14529((byte) 1);
		    System.gc();
		    Class501.aClass182_5564
			= Class232.method4394(i, Class532.aCanvas7169,
					      Class166.aClass180_1835,
					      Class411.anInterface24_4255,
					      Class628.aClass385_8157,
					      Class263.aClass402_2799,
					      Class450.aClass400_4926,
					      Class17_Sub1.aClass458_11027,
					      Class198_Sub13
						  .aClass525_Sub30_9973
						  .aClass696_Sub39_10678
						  .method17324(-16711936) * 2,
					      -503861860);
		    Class7.aClass404_53
			= new Class404(Class501.aClass182_5564,
				       Class462.aClass458_5095,
				       Class276.aClass458_2875,
				       Class525_Sub42
					   .method16882((short) -17858));
		    if (Class501.aClass182_5564.method3138()) {
			boolean bool_28_ = true;
			try {
			    bool_28_
				= -1113722213 * (Class31.aClass525_Sub36_305
						 .anInt10806) > 256;
			} catch (Throwable throwable) {
			    /* empty */
			}
			Class525_Sub26 class525_sub26;
			if (bool_28_)
			    class525_sub26 = Class501.aClass182_5564
						 .method3210(146800640);
			else
			    class525_sub26 = Class501.aClass182_5564
						 .method3210(104857600);
			Class501.aClass182_5564.method3211(class525_sub26);
		    }
		} catch (Throwable throwable) {
		    switch (i) {
		    case 3:
			Class217.method4141(Class68.aClass68_721, -2041930726);
			break;
		    case 1:
			Class217.method4141(Class68.aClass68_720, -2138631323);
			break;
		    }
		    if (throwable instanceof RuntimeException_Sub3) {
			Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub39_10677.method14169(0, -966795979);
			Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub39_10678.method14169(0, 11371176);
		    }
		    int i_29_
			= Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub20_10708.method17160(1241060511);
		    Class198_Sub13.aClass525_Sub30_9973.method16502
			((Class198_Sub13.aClass525_Sub30_9973
			  .aClass696_Sub20_10708),
			 0, (byte) -115);
		    if (class182 != null) {
			try {
			    class182.method3134(-2143098149);
			    class182 = null;
			} catch (Throwable throwable_30_) {
			    /* empty */
			}
		    }
		    Class163_Sub2.method14529((byte) 1);
		    System.gc();
		    method557(i_29_, string, bool, (short) -11652);
		    if (null != class182) {
			try {
			    class182.method3134(-1935114007);
			} catch (Throwable throwable_31_) {
			    /* empty */
			}
		    }
		    return;
		}
		if (null != class182) {
		    try {
			class182.method3134(-1537214135);
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	  } catch (Exception object) {
		if (null != class182) {
		    try {
			class182.method3134(-2071901308);
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
		throw object;
	    }
	}
	if (bool)
	    Class198_Sub13.aClass525_Sub30_9973.method16503
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708,
		 !bool, (byte) -84);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708, i,
	     (byte) -109);
	if (!bool)
	    Class198_Sub13.aClass525_Sub30_9973.method16503
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708,
		 !bool, (byte) -104);
	Class246.method4489((byte) -14);
	Class501.aClass182_5564.method3226(20000);
	Class501.aClass182_5564.method3240(32);
	client.aClass507_11137.method8426(1690405984);
	if (Class501.aClass182_5564.method3142())
	    Class345.method6051(Class198_Sub13.aClass525_Sub30_9973
				    .aClass696_Sub37_10680
				    .method17305((byte) 91) == 1,
				(byte) 8);
	client.aClass507_11137.method8371(true, (byte) 13);
	client.aClass507_11137.method8361((byte) 15).method10398(-1837174011);
	Class643.method10600((byte) 92);
	client.aBool11084 = false;
	client.aBool11251 = false;
	client.aBool11095 = true;
	Class390_Sub2.aClass18Array10229 = null;
	Class501.aClass182_5564.method3182(0.0F, 1.0F);
    }
}
