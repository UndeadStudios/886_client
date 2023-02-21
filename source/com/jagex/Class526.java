/* Class526 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Class526
{
    Class541 aClass541_7114;
    Class334 aClass334_7115;
    short[] aShortArray7116;
    short[] aShortArray7117;
    short[] aShortArray7118;
    short[] aShortArray7119;
    Class320[] aClass320Array7120;
    Class320 aClass320_7121;
    int anInt7122;
    short[] aShortArray7123;
    short[] aShortArray7124;
    Class506 aClass506_7125 = new Class506();
    Class541 aClass541_7126;
    Class535 aClass535_7127;
    short[] aShortArray7128;
    int anInt7129;
    int anInt7130;
    public static Class466 aClass466_7131;
    
    boolean method8762(int i, int i_0_) {
	if (i < 0)
	    return false;
	if (i != 613284505 * anInt7122) {
	    anInt7122 = i * -2034910807;
	    anInt7129 = Math.max(613284505 * anInt7122, 1) * 795518501;
	    aClass506_7125.method8324(Math.max(anInt7129 * -1807546963, 4096),
				      -1632188018);
	}
	return true;
    }
    
    boolean method8763(int i, int i_1_, int i_2_, int i_3_) {
	if (i > 8 || i_1_ > 4 || i_2_ > 4)
	    return false;
	aClass535_7127.method8861(i_1_, i, 1624533062);
	int i_4_ = 1 << i_2_;
	aClass541_7114.method8893(i_4_, -1489057374);
	aClass541_7126.method8893(i_4_, 410224658);
	anInt7130 = -1443881595 * (i_4_ - 1);
	return true;
    }
    
    boolean method8764(InputStream inputstream, OutputStream outputstream,
		       long l) throws IOException {
	aClass334_7115.method5830(inputstream, -907885362);
	aClass506_7125.method8325(outputstream, 1375277918);
	method8772(-415035747);
	int i = Class261.method4765((byte) 115);
	int i_5_ = 0;
	int i_6_ = 0;
	int i_7_ = 0;
	int i_8_ = 0;
	long l_9_ = 0L;
	byte i_10_ = 0;
	while (l < 0L || l_9_ < l) {
	    int i_11_ = (int) l_9_ & -202288307 * anInt7130;
	    if (aClass334_7115.method5829(aShortArray7116, i_11_ + (i << 4),
					  (byte) 65)
		== 0) {
		Class533 class533
		    = aClass535_7127.method8859((int) l_9_, i_10_, 1917779652);
		if (!Class696_Sub29.method17244(i, -1280280764))
		    i_10_
			= class533.method8848(aClass334_7115,
					      aClass506_7125
						  .method8332(i_5_, 876518341),
					      1636682113);
		else
		    i_10_ = class533.method8845(aClass334_7115, (short) 128);
		aClass506_7125.method8330(i_10_, 1622147010);
		i = Class644.method10615(i, 944710200);
		l_9_++;
	    } else {
		int i_12_;
		if (aClass334_7115.method5829(aShortArray7117, i, (byte) 24)
		    == 1) {
		    i_12_ = 0;
		    if (aClass334_7115.method5829(aShortArray7118, i,
						  (byte) -25)
			== 0) {
			if (aClass334_7115.method5829(aShortArray7124,
						      i_11_ + (i << 4),
						      (byte) 64)
			    == 0) {
			    i = Class462.method7605(i, (byte) 1);
			    i_12_ = 1;
			}
		    } else {
			int i_13_;
			if (aClass334_7115.method5829(aShortArray7119, i,
						      (byte) 45)
			    == 0)
			    i_13_ = i_6_;
			else {
			    if (aClass334_7115.method5829(aShortArray7128, i,
							  (byte) 27)
				== 0)
				i_13_ = i_7_;
			    else {
				i_13_ = i_8_;
				i_8_ = i_7_;
			    }
			    i_7_ = i_6_;
			}
			i_6_ = i_5_;
			i_5_ = i_13_;
		    }
		    if (i_12_ == 0) {
			i_12_
			    = aClass541_7126.method8897(aClass334_7115, i_11_,
							(byte) -29) + 2;
			i = Class432.method6906(i, (byte) 100);
		    }
		} else {
		    i_8_ = i_7_;
		    i_7_ = i_6_;
		    i_6_ = i_5_;
		    i_12_ = 2 + aClass541_7114.method8897(aClass334_7115,
							  i_11_, (byte) -112);
		    i = Class103.method1888(i, -557556508);
		    int i_14_ = aClass320Array7120
				    [Class223.method4244(i_12_, (byte) 0)]
				    .method5708(aClass334_7115, 1974961518);
		    if (i_14_ >= 4) {
			int i_15_ = (i_14_ >> 1) - 1;
			i_5_ = (0x2 | i_14_ & 0x1) << i_15_;
			if (i_14_ < 14)
			    i_5_ += Class632.method10327(aShortArray7123,
							 i_5_ - i_14_ - 1,
							 aClass334_7115, i_15_,
							 (byte) 11);
			else {
			    i_5_ += aClass334_7115.method5833(i_15_ - 4,
							      -444352900) << 4;
			    i_5_ += aClass320_7121.method5703(aClass334_7115,
							      1552651121);
			    if (i_5_ < 0) {
				if (i_5_ != -1)
				    return false;
				break;
			    }
			}
		    } else
			i_5_ = i_14_;
		}
		if ((long) i_5_ >= l_9_ || i_5_ >= anInt7129 * -1807546963)
		    return false;
		aClass506_7125.method8329(i_5_, i_12_, (byte) -19);
		l_9_ += (long) i_12_;
		i_10_ = aClass506_7125.method8332(0, 1285976147);
	    }
	}
	aClass506_7125.method8328(542612443);
	aClass506_7125.method8326(-1840416001);
	aClass334_7115.method5831(-1222037297);
	return true;
    }
    
    boolean method8765(byte[] is, int i) {
	if (is.length < 5)
	    return false;
	int i_16_ = is[0] & 0xff;
	int i_17_ = i_16_ % 9;
	int i_18_ = i_16_ / 9;
	int i_19_ = i_18_ % 5;
	int i_20_ = i_18_ / 5;
	int i_21_ = 0;
	for (int i_22_ = 0; i_22_ < 4; i_22_++)
	    i_21_ += (is[1 + i_22_] & 0xff) << 8 * i_22_;
	if (!method8763(i_17_, i_19_, i_20_, 613810757))
	    return false;
	return method8762(i_21_, 619523047);
    }
    
    boolean method8766(InputStream inputstream, OutputStream outputstream,
		       long l) throws IOException {
	aClass334_7115.method5830(inputstream, -1187864440);
	aClass506_7125.method8325(outputstream, 2091695292);
	method8772(-756917113);
	int i = Class261.method4765((byte) 91);
	int i_23_ = 0;
	int i_24_ = 0;
	int i_25_ = 0;
	int i_26_ = 0;
	long l_27_ = 0L;
	byte i_28_ = 0;
	while (l < 0L || l_27_ < l) {
	    int i_29_ = (int) l_27_ & -202288307 * anInt7130;
	    if (aClass334_7115.method5829(aShortArray7116, i_29_ + (i << 4),
					  (byte) 111)
		== 0) {
		Class533 class533
		    = aClass535_7127.method8859((int) l_27_, i_28_,
						2029177786);
		if (!Class696_Sub29.method17244(i, 1876236835))
		    i_28_ = (class533.method8848
			     (aClass334_7115,
			      aClass506_7125.method8332(i_23_, 1433775593),
			      -1266987374));
		else
		    i_28_ = class533.method8845(aClass334_7115, (short) 128);
		aClass506_7125.method8330(i_28_, 1622147010);
		i = Class644.method10615(i, 1317839836);
		l_27_++;
	    } else {
		int i_30_;
		if (aClass334_7115.method5829(aShortArray7117, i, (byte) -42)
		    == 1) {
		    i_30_ = 0;
		    if (aClass334_7115.method5829(aShortArray7118, i, (byte) 7)
			== 0) {
			if (aClass334_7115.method5829(aShortArray7124,
						      i_29_ + (i << 4),
						      (byte) 5)
			    == 0) {
			    i = Class462.method7605(i, (byte) 1);
			    i_30_ = 1;
			}
		    } else {
			int i_31_;
			if (aClass334_7115.method5829(aShortArray7119, i,
						      (byte) 25)
			    == 0)
			    i_31_ = i_24_;
			else {
			    if (aClass334_7115.method5829(aShortArray7128, i,
							  (byte) -64)
				== 0)
				i_31_ = i_25_;
			    else {
				i_31_ = i_26_;
				i_26_ = i_25_;
			    }
			    i_25_ = i_24_;
			}
			i_24_ = i_23_;
			i_23_ = i_31_;
		    }
		    if (i_30_ == 0) {
			i_30_
			    = aClass541_7126.method8897(aClass334_7115, i_29_,
							(byte) -85) + 2;
			i = Class432.method6906(i, (byte) 5);
		    }
		} else {
		    i_26_ = i_25_;
		    i_25_ = i_24_;
		    i_24_ = i_23_;
		    i_30_ = 2 + aClass541_7114.method8897(aClass334_7115,
							  i_29_, (byte) -63);
		    i = Class103.method1888(i, -557556508);
		    int i_32_ = aClass320Array7120
				    [Class223.method4244(i_30_, (byte) 0)]
				    .method5708(aClass334_7115, -164924998);
		    if (i_32_ >= 4) {
			int i_33_ = (i_32_ >> 1) - 1;
			i_23_ = (0x2 | i_32_ & 0x1) << i_33_;
			if (i_32_ < 14)
			    i_23_ += Class632.method10327(aShortArray7123,
							  i_23_ - i_32_ - 1,
							  aClass334_7115,
							  i_33_, (byte) 11);
			else {
			    i_23_ += aClass334_7115.method5833(i_33_ - 4,
							       405461721) << 4;
			    i_23_ += aClass320_7121.method5703(aClass334_7115,
							       1552651121);
			    if (i_23_ < 0) {
				if (i_23_ != -1)
				    return false;
				break;
			    }
			}
		    } else
			i_23_ = i_32_;
		}
		if ((long) i_23_ >= l_27_ || i_23_ >= anInt7129 * -1807546963)
		    return false;
		aClass506_7125.method8329(i_23_, i_30_, (byte) -43);
		l_27_ += (long) i_30_;
		i_28_ = aClass506_7125.method8332(0, -1641670511);
	    }
	}
	aClass506_7125.method8328(1909282758);
	aClass506_7125.method8326(541359009);
	aClass334_7115.method5831(-1447215713);
	return true;
    }
    
    boolean method8767(int i) {
	if (i < 0)
	    return false;
	if (i != 613284505 * anInt7122) {
	    anInt7122 = i * -2034910807;
	    anInt7129 = Math.max(613284505 * anInt7122, 1) * 795518501;
	    aClass506_7125.method8324(Math.max(anInt7129 * -1807546963, 4096),
				      -356440964);
	}
	return true;
    }
    
    Class526() {
	aClass334_7115 = new Class334();
	aShortArray7116 = new short[192];
	aShortArray7117 = new short[12];
	aShortArray7118 = new short[12];
	aShortArray7119 = new short[12];
	aShortArray7128 = new short[12];
	aShortArray7124 = new short[192];
	aClass320Array7120 = new Class320[4];
	aShortArray7123 = new short[114];
	aClass320_7121 = new Class320(4);
	aClass541_7114 = new Class541(this);
	aClass541_7126 = new Class541(this);
	aClass535_7127 = new Class535(this);
	anInt7122 = 2034910807;
	anInt7129 = -795518501;
	for (int i = 0; i < 4; i++)
	    aClass320Array7120[i] = new Class320(6);
    }
    
    boolean method8768(int i, int i_34_, int i_35_) {
	if (i > 8 || i_34_ > 4 || i_35_ > 4)
	    return false;
	aClass535_7127.method8861(i_34_, i, 1035750627);
	int i_36_ = 1 << i_35_;
	aClass541_7114.method8893(i_36_, -530777379);
	aClass541_7126.method8893(i_36_, 1287491270);
	anInt7130 = -1443881595 * (i_36_ - 1);
	return true;
    }
    
    boolean method8769(int i, int i_37_, int i_38_) {
	if (i > 8 || i_37_ > 4 || i_38_ > 4)
	    return false;
	aClass535_7127.method8861(i_37_, i, -7060705);
	int i_39_ = 1 << i_38_;
	aClass541_7114.method8893(i_39_, 168381738);
	aClass541_7126.method8893(i_39_, 1828802649);
	anInt7130 = -1443881595 * (i_39_ - 1);
	return true;
    }
    
    void method8770() throws IOException {
	aClass506_7125.method8333(false, (byte) 1);
	Class28.method906(aShortArray7116, 2128451685);
	Class28.method906(aShortArray7124, 2054927819);
	Class28.method906(aShortArray7117, 2084156164);
	Class28.method906(aShortArray7118, 2131928504);
	Class28.method906(aShortArray7119, 2111979029);
	Class28.method906(aShortArray7128, 2068797772);
	Class28.method906(aShortArray7123, 2076501111);
	aClass535_7127.method8858(-423707676);
	for (int i = 0; i < 4; i++)
	    aClass320Array7120[i].method5705((byte) 54);
	aClass541_7114.method8895(-1246422236);
	aClass541_7126.method8895(-1080545892);
	aClass320_7121.method5705((byte) 23);
	aClass334_7115.method5837(-1465752056);
    }
    
    boolean method8771(InputStream inputstream, OutputStream outputstream,
		       long l) throws IOException {
	aClass334_7115.method5830(inputstream, -806743166);
	aClass506_7125.method8325(outputstream, 247429674);
	method8772(-1198628989);
	int i = Class261.method4765((byte) 21);
	int i_40_ = 0;
	int i_41_ = 0;
	int i_42_ = 0;
	int i_43_ = 0;
	long l_44_ = 0L;
	byte i_45_ = 0;
	while (l < 0L || l_44_ < l) {
	    int i_46_ = (int) l_44_ & -202288307 * anInt7130;
	    if (aClass334_7115.method5829(aShortArray7116, i_46_ + (i << 4),
					  (byte) 61)
		== 0) {
		Class533 class533
		    = aClass535_7127.method8859((int) l_44_, i_45_,
						1838928856);
		if (!Class696_Sub29.method17244(i, -421713679))
		    i_45_ = (class533.method8848
			     (aClass334_7115,
			      aClass506_7125.method8332(i_40_, 575339539),
			      697132611));
		else
		    i_45_ = class533.method8845(aClass334_7115, (short) 128);
		aClass506_7125.method8330(i_45_, 1622147010);
		i = Class644.method10615(i, 802905692);
		l_44_++;
	    } else {
		int i_47_;
		if (aClass334_7115.method5829(aShortArray7117, i, (byte) -78)
		    == 1) {
		    i_47_ = 0;
		    if (aClass334_7115.method5829(aShortArray7118, i,
						  (byte) -5)
			== 0) {
			if (aClass334_7115.method5829(aShortArray7124,
						      i_46_ + (i << 4),
						      (byte) 70)
			    == 0) {
			    i = Class462.method7605(i, (byte) 1);
			    i_47_ = 1;
			}
		    } else {
			int i_48_;
			if (aClass334_7115.method5829(aShortArray7119, i,
						      (byte) -2)
			    == 0)
			    i_48_ = i_41_;
			else {
			    if (aClass334_7115.method5829(aShortArray7128, i,
							  (byte) -28)
				== 0)
				i_48_ = i_42_;
			    else {
				i_48_ = i_43_;
				i_43_ = i_42_;
			    }
			    i_42_ = i_41_;
			}
			i_41_ = i_40_;
			i_40_ = i_48_;
		    }
		    if (i_47_ == 0) {
			i_47_
			    = aClass541_7126.method8897(aClass334_7115, i_46_,
							(byte) -66) + 2;
			i = Class432.method6906(i, (byte) 55);
		    }
		} else {
		    i_43_ = i_42_;
		    i_42_ = i_41_;
		    i_41_ = i_40_;
		    i_47_ = 2 + aClass541_7114.method8897(aClass334_7115,
							  i_46_, (byte) -18);
		    i = Class103.method1888(i, -557556508);
		    int i_49_ = aClass320Array7120
				    [Class223.method4244(i_47_, (byte) 0)]
				    .method5708(aClass334_7115, 114075026);
		    if (i_49_ >= 4) {
			int i_50_ = (i_49_ >> 1) - 1;
			i_40_ = (0x2 | i_49_ & 0x1) << i_50_;
			if (i_49_ < 14)
			    i_40_ += Class632.method10327(aShortArray7123,
							  i_40_ - i_49_ - 1,
							  aClass334_7115,
							  i_50_, (byte) 11);
			else {
			    i_40_
				+= aClass334_7115.method5833(i_50_ - 4,
							     1353281238) << 4;
			    i_40_ += aClass320_7121.method5703(aClass334_7115,
							       1552651121);
			    if (i_40_ < 0) {
				if (i_40_ != -1)
				    return false;
				break;
			    }
			}
		    } else
			i_40_ = i_49_;
		}
		if ((long) i_40_ >= l_44_ || i_40_ >= anInt7129 * -1807546963)
		    return false;
		aClass506_7125.method8329(i_40_, i_47_, (byte) 52);
		l_44_ += (long) i_47_;
		i_45_ = aClass506_7125.method8332(0, -1080379574);
	    }
	}
	aClass506_7125.method8328(709284555);
	aClass506_7125.method8326(-1756617353);
	aClass334_7115.method5831(-774440258);
	return true;
    }
    
    void method8772(int i) throws IOException {
	aClass506_7125.method8333(false, (byte) 1);
	Class28.method906(aShortArray7116, 2074635527);
	Class28.method906(aShortArray7124, 2053980089);
	Class28.method906(aShortArray7117, 2076186280);
	Class28.method906(aShortArray7118, 1988993208);
	Class28.method906(aShortArray7119, 2107173958);
	Class28.method906(aShortArray7128, 2023191872);
	Class28.method906(aShortArray7123, 2027512106);
	aClass535_7127.method8858(2046439236);
	for (int i_51_ = 0; i_51_ < 4; i_51_++)
	    aClass320Array7120[i_51_].method5705((byte) 110);
	aClass541_7114.method8895(-2019981898);
	aClass541_7126.method8895(-753979441);
	aClass320_7121.method5705((byte) 53);
	aClass334_7115.method5837(37460689);
    }
    
    boolean method8773(InputStream inputstream, OutputStream outputstream,
		       long l) throws IOException {
	aClass334_7115.method5830(inputstream, -1232840414);
	aClass506_7125.method8325(outputstream, 642849900);
	method8772(-2082744961);
	int i = Class261.method4765((byte) 17);
	int i_52_ = 0;
	int i_53_ = 0;
	int i_54_ = 0;
	int i_55_ = 0;
	long l_56_ = 0L;
	byte i_57_ = 0;
	while (l < 0L || l_56_ < l) {
	    int i_58_ = (int) l_56_ & -202288307 * anInt7130;
	    if (aClass334_7115.method5829(aShortArray7116, i_58_ + (i << 4),
					  (byte) 20)
		== 0) {
		Class533 class533
		    = aClass535_7127.method8859((int) l_56_, i_57_,
						1635772995);
		if (!Class696_Sub29.method17244(i, 922973038))
		    i_57_ = (class533.method8848
			     (aClass334_7115,
			      aClass506_7125.method8332(i_52_, 433229427),
			      2116916293));
		else
		    i_57_ = class533.method8845(aClass334_7115, (short) 128);
		aClass506_7125.method8330(i_57_, 1622147010);
		i = Class644.method10615(i, 538120969);
		l_56_++;
	    } else {
		int i_59_;
		if (aClass334_7115.method5829(aShortArray7117, i, (byte) -86)
		    == 1) {
		    i_59_ = 0;
		    if (aClass334_7115.method5829(aShortArray7118, i, (byte) 8)
			== 0) {
			if (aClass334_7115.method5829(aShortArray7124,
						      i_58_ + (i << 4),
						      (byte) -66)
			    == 0) {
			    i = Class462.method7605(i, (byte) 1);
			    i_59_ = 1;
			}
		    } else {
			int i_60_;
			if (aClass334_7115.method5829(aShortArray7119, i,
						      (byte) -66)
			    == 0)
			    i_60_ = i_53_;
			else {
			    if (aClass334_7115.method5829(aShortArray7128, i,
							  (byte) 28)
				== 0)
				i_60_ = i_54_;
			    else {
				i_60_ = i_55_;
				i_55_ = i_54_;
			    }
			    i_54_ = i_53_;
			}
			i_53_ = i_52_;
			i_52_ = i_60_;
		    }
		    if (i_59_ == 0) {
			i_59_
			    = aClass541_7126.method8897(aClass334_7115, i_58_,
							(byte) -86) + 2;
			i = Class432.method6906(i, (byte) 41);
		    }
		} else {
		    i_55_ = i_54_;
		    i_54_ = i_53_;
		    i_53_ = i_52_;
		    i_59_ = 2 + aClass541_7114.method8897(aClass334_7115,
							  i_58_, (byte) -65);
		    i = Class103.method1888(i, -557556508);
		    int i_61_ = aClass320Array7120
				    [Class223.method4244(i_59_, (byte) 0)]
				    .method5708(aClass334_7115, 1512873015);
		    if (i_61_ >= 4) {
			int i_62_ = (i_61_ >> 1) - 1;
			i_52_ = (0x2 | i_61_ & 0x1) << i_62_;
			if (i_61_ < 14)
			    i_52_ += Class632.method10327(aShortArray7123,
							  i_52_ - i_61_ - 1,
							  aClass334_7115,
							  i_62_, (byte) 11);
			else {
			    i_52_ += aClass334_7115.method5833(i_62_ - 4,
							       108087166) << 4;
			    i_52_ += aClass320_7121.method5703(aClass334_7115,
							       1552651121);
			    if (i_52_ < 0) {
				if (i_52_ != -1)
				    return false;
				break;
			    }
			}
		    } else
			i_52_ = i_61_;
		}
		if ((long) i_52_ >= l_56_ || i_52_ >= anInt7129 * -1807546963)
		    return false;
		aClass506_7125.method8329(i_52_, i_59_, (byte) -11);
		l_56_ += (long) i_59_;
		i_57_ = aClass506_7125.method8332(0, -1479512240);
	    }
	}
	aClass506_7125.method8328(1437343949);
	aClass506_7125.method8326(313479901);
	aClass334_7115.method5831(-1607631131);
	return true;
    }
    
    boolean method8774(byte[] is) {
	if (is.length < 5)
	    return false;
	int i = is[0] & 0xff;
	int i_63_ = i % 9;
	int i_64_ = i / 9;
	int i_65_ = i_64_ % 5;
	int i_66_ = i_64_ / 5;
	int i_67_ = 0;
	for (int i_68_ = 0; i_68_ < 4; i_68_++)
	    i_67_ += (is[1 + i_68_] & 0xff) << 8 * i_68_;
	if (!method8763(i_63_, i_65_, i_66_, 1421514206))
	    return false;
	return method8762(i_67_, 126648045);
    }
    
    static void method8775(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class196.method3736(Class501.aClass182_5564, 65280);
    }
    
    static final void method8776(Class683 class683, short i) {
	int i_69_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class182_Sub2.aClass228_9503.method4275(i_69_, -678729999)
		  .method4159
		  (1257933318).method80();
    }
    
    static final void method8777(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class232.method4395(749533728);
    }
    
    static final void method8778(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_70_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_71_
	    = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	Class584.method9644(8, i_70_, i_71_, "", 318759822);
    }
    
    static final void method8779(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class642.anInt8328 * 1815116363;
    }
    
    static String method8780(byte[] is, int i, int i_72_, byte i_73_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_74_ = i; i_74_ < i + i_72_; i_74_ += 3) {
	    int i_75_ = is[i_74_] & 0xff;
	    stringbuilder.append(Class687.aCharArray8705[i_75_ >>> 2]);
	    if (i_74_ < i_72_ - 1) {
		int i_76_ = is[1 + i_74_] & 0xff;
		stringbuilder.append(Class687.aCharArray8705
				     [(i_75_ & 0x3) << 4 | i_76_ >>> 4]);
		if (i_74_ < i_72_ - 2) {
		    int i_77_ = is[2 + i_74_] & 0xff;
		    stringbuilder.append
			(Class687.aCharArray8705
			 [(i_76_ & 0xf) << 2 | i_77_ >>> 6])
			.append(Class687.aCharArray8705[i_77_ & 0x3f]);
		} else
		    stringbuilder.append
			(Class687.aCharArray8705[(i_76_ & 0xf) << 2])
			.append('=');
	    } else
		stringbuilder.append
		    (Class687.aCharArray8705[(i_75_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    static final void method8781(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class469.method7711(class259, class245, class683, 2067294525);
    }
}
