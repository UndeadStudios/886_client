/* Class491 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class491
{
    static Class491 aClass491_5283 = new Class491(0);
    public static Class491 aClass491_5284 = new Class491(1);
    static Class491 aClass491_5285 = new Class491(2);
    public static Class491 aClass491_5286;
    public static Class491 aClass491_5287;
    public static Class491 aClass491_5288 = new Class491(3);
    static Class491 aClass491_5289;
    static Class491 aClass491_5290;
    static Class491 aClass491_5291;
    int anInt5292;
    
    static {
	aClass491_5287 = new Class491(4);
	aClass491_5286 = new Class491(5);
	aClass491_5289 = new Class491(6);
	aClass491_5290 = new Class491(7);
	aClass491_5291 = new Class491(8);
    }
    
    Class491(int i) {
	anInt5292 = -1797036839 * i;
    }
    
    static final boolean method7987(Class96 class96, int i)
	throws IOException {
	Class559 class559 = class96.method1799((byte) 0);
	Class525_Sub38_Sub2 class525_sub38_sub2
	    = class96.aClass525_Sub38_Sub2_1168;
	if (null == class559)
	    return false;
	if (null == class96.aClass416_1172) {
	    if (class96.aBool1176) {
		if (!class559.method9376(1, 1597443302))
		    return false;
		class559.method9379((class96.aClass525_Sub38_Sub2_1168
				     .buffer),
				    0, 1, (byte) -50);
		class96.anInt1178 += -793051375;
		class96.anInt1175 = 0;
		class96.aBool1176 = false;
	    }
	    class525_sub38_sub2.index = 0;
	    if (class525_sub38_sub2.method18492(1555595371)) {
		if (!class559.method9376(1, 1597443302))
		    return false;
		class559.method9379((class96.aClass525_Sub38_Sub2_1168
				     .buffer),
				    1, 1, (byte) -87);
		class96.anInt1178 += -793051375;
		class96.anInt1175 = 0;
	    }
	    class96.aBool1176 = true;
	    Class416[] class416s = Class116.method2063((byte) 107);
	    int i_0_ = class525_sub38_sub2.method18490(-1998757601);
	    if (i_0_ < 0 || i_0_ >= class416s.length)
		throw new IOException(new StringBuilder().append(i_0_).append
					  (" ").append
					  (class525_sub38_sub2.index
					   * -1133521593)
					  .toString());
	    class96.aClass416_1172 = class416s[i_0_];
	    class96.anInt1173 = -2040333761 * class96.aClass416_1172.anInt4617;
	}
	if (-1 == class96.anInt1173 * -1101265009) {
	    if (!class559.method9376(1, 1597443302))
		return false;
	    class559.method9379(class525_sub38_sub2.buffer, 0, 1,
				(byte) -61);
	    class96.anInt1173
		= -2089339025 * (class525_sub38_sub2.buffer[0]
				 & 0xff);
	    class96.anInt1178 += -793051375;
	    class96.anInt1175 = 0;
	}
	if (-1101265009 * class96.anInt1173 == -2) {
	    if (!class559.method9376(2, 1597443302))
		return false;
	    class559.method9379(class525_sub38_sub2.buffer, 0, 2,
				(byte) -76);
	    class525_sub38_sub2.index = 0;
	    class96.anInt1173
		= class525_sub38_sub2.readUnsignedShort((byte) 6) * -2089339025;
	    class96.anInt1178 += -1586102750;
	    class96.anInt1175 = 0;
	}
	if (-1101265009 * class96.anInt1173 > 0) {
	    if (!class559.method9376(class96.anInt1173 * -1101265009,
				     1597443302))
		return false;
	    class525_sub38_sub2.index = 0;
	    class559.method9379(class525_sub38_sub2.buffer, 0,
				class96.anInt1173 * -1101265009, (byte) -43);
	    class96.anInt1178 += -41291393 * class96.anInt1173;
	    class96.anInt1175 = 0;
	}
	class96.aClass416_1183 = class96.aClass416_1165;
	class96.aClass416_1165 = class96.aClass416_1181;
	class96.aClass416_1181 = class96.aClass416_1172;
	if (class96.aClass416_1172 == Class416.aClass416_4509) {
	    Class696_Sub34.method17284(class525_sub38_sub2,
				       class96.anInt1173 * -1101265009, 65280);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4549) {
	    int i_1_ = class525_sub38_sub2.method16667(2033012006);
	    int i_2_ = class525_sub38_sub2.readUnsignedByte(2115508089);
	    Class532.aClass111_7170.aClass614_1374.method10065
		((Class322) Class575.aClass40_Sub10_7647.method76(i_1_,
								  1669707919),
		 i_2_, 1080009728);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4435) {
	    boolean bool = class525_sub38_sub2.readUnsignedByte(1565916261) == 1;
	    String string = class525_sub38_sub2.readString((byte) 21);
	    String string_3_ = string;
	    if (bool)
		string_3_ = class525_sub38_sub2.readString((byte) 73);
	    long l = (long) class525_sub38_sub2.readUnsignedShort((byte) 88);
	    long l_4_ = (long) class525_sub38_sub2.method16834(-1994884458);
	    Class411 class411
		= ((Class411)
		   Class539.method8888(Class411.method6672(-2073143159),
				       class525_sub38_sub2
					   .readUnsignedByte(924188429),
				       -609626583));
	    int i_5_ = class525_sub38_sub2.readUnsignedShort((byte) 69);
	    long l_6_ = (l << 32) + l_4_;
	    boolean bool_7_ = false;
	while_132_:
	    do {
		for (int i_8_ = 0; i_8_ < 100; i_8_++) {
		    if (client.aLongArray11335[i_8_] == l_6_) {
			bool_7_ = true;
			break while_132_;
		    }
		}
		if (class411.aBool4252
		    && Class450.method7330(string_3_, 1832504246))
		    bool_7_ = true;
	    } while (false);
	    if (!bool_7_) {
		client.aLongArray11335[1397979293 * client.anInt11336] = l_6_;
		client.anInt11336
		    = (client.anInt11336 * 1397979293 + 1) % 100 * -870396491;
		String string_9_
		    = Class215.aClass58_2283.method1220(i_5_, 797864)
			  .method18423(class525_sub38_sub2, -1136428491);
		if (-1 != -569278595 * class411.anInt4251)
		    Class627.method10275
			(18, 0,
			 new StringBuilder().append
			     (Class501.method8197((class411.anInt4251
						   * -569278595),
						  -1167698259))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class501.method8197((-569278595
						   * class411.anInt4251),
						  -855291516))
			     .append
			     (string_3_).toString(),
			 string, string_9_, null, i_5_, class411, (byte) 0);
		else
		    Class627.method10275(18, 0, string, string_3_, string,
					 string_9_, null, i_5_, class411,
					 (byte) 0);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4610 == class96.aClass416_1172) {
	    Class412.method6677(Class406.aClass406_4161, (byte) 42);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4457 == class96.aClass416_1172) {
	    int i_10_ = class525_sub38_sub2.method16668((byte) -27);
	    int i_11_ = class525_sub38_sub2.readInt(2100880098);
	    int i_12_ = class525_sub38_sub2.method16624(-771310110);
	    int i_13_ = class525_sub38_sub2.method16668((byte) 60);
	    Class242.method4448((byte) -27);
	    Class525_Sub41.method16880(i_11_, i_12_, i_13_, i_10_,
				       -1329941513);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4455 == class96.aClass416_1172) {
	    int i_14_ = class525_sub38_sub2.readUnsignedShort((byte) 13);
	    if (65535 == i_14_)
		i_14_ = -1;
	    int i_15_ = class525_sub38_sub2.readUnsignedByte(1495975051);
	    int i_16_ = class525_sub38_sub2.method16677(972642041);
	    int i_17_ = class525_sub38_sub2.method16660(298671195);
	    int i_18_ = class525_sub38_sub2.method16680(-2086516223);
	    int i_19_ = class525_sub38_sub2.method16668((byte) 90);
	    int i_20_ = i_15_ & 0x7;
	    int i_21_ = i_15_ >> 3 & 0xf;
	    if (i_21_ == 15)
		i_21_ = -1;
	    boolean bool = (i_15_ >> 7 & 0x1) == 1;
	    if (0 != i_16_ >> 30) {
		Class600 class600
		    = client.aClass507_11137.method8350(-1821406378);
		int i_22_ = i_16_ >> 28 & 0x3;
		int i_23_ = ((i_16_ >> 14 & 0x3fff)
			     - -1227002079 * class600.anInt7858);
		int i_24_ = (i_16_ & 0x3fff) - 1429253007 * class600.anInt7860;
		if (i_23_ >= 0 && i_24_ >= 0
		    && i_23_ < client.aClass507_11137.method8412(986956700)
		    && i_24_ < client.aClass507_11137.method8352((byte) -20)) {
		    if (-1 == i_14_) {
			Class525_Sub16_Sub15 class525_sub16_sub15
			    = ((Class525_Sub16_Sub15)
			       client.aClass10_11248
				   .method684((long) (i_23_ << 16 | i_24_)));
			if (class525_sub16_sub15 != null) {
			    class525_sub16_sub15
				.aClass656_Sub1_Sub3_Sub4_11841
				.method18836(-14186507);
			    class525_sub16_sub15.method8755(-1933461091);
			}
		    } else {
			int i_25_ = 256 + 512 * i_23_;
			int i_26_ = 512 * i_24_ + 256;
			int i_27_ = i_22_;
			if (i_27_ < 3
			    && client.aClass507_11137.method8360
				   (1933925345)
				   .method7774(i_23_, i_24_, 1299586139))
			    i_27_++;
			Class656_Sub1_Sub3_Sub4 class656_sub1_sub3_sub4
			    = (new Class656_Sub1_Sub3_Sub4
			       (client.aClass507_11137.method8358((byte) 51),
				i_14_, i_19_, i_22_, i_27_, i_25_,
				Class335.method5855(i_25_, i_26_, i_22_,
						    2020563229) - i_18_,
				i_26_, i_23_, i_23_, i_24_, i_24_, i_20_, bool,
				0));
			client.aClass10_11248.method695
			    (new Class525_Sub16_Sub15(class656_sub1_sub3_sub4),
			     (long) (i_23_ << 16 | i_24_));
		    }
		}
	    } else if (0 != i_16_ >> 29) {
		int i_28_ = i_16_ & 0xffff;
		Class525_Sub19 class525_sub19
		    = ((Class525_Sub19)
		       client.aClass10_11121.method684((long) i_28_));
		if (null != class525_sub19) {
		    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
			= ((Class656_Sub1_Sub3_Sub1_Sub2)
			   class525_sub19.anObject10571);
		    Class540 class540 = (class656_sub1_sub3_sub1_sub2
					 .aClass540Array12029[i_17_]);
		    if (65535 == i_14_)
			i_14_ = -1;
		    boolean bool_29_ = true;
		    int i_30_ = class540.anInt7182 * 1420286373;
		    if (i_14_ != -1 && i_30_ != -1) {
			if (i_30_ == i_14_) {
			    Class674 class674
				= (Class674) Class574.aClass40_Sub20_7645
						 .method76(i_14_, -2118385348);
			    if (class674.aBool8608
				&& class674.anInt8596 * 1700860103 != -1) {
				AnimationDefinition class194
				    = ((AnimationDefinition)
				       (Class685.aClass40_Sub8_8691.method76
					(class674.anInt8596 * 1700860103,
					 -938085838)));
				int i_31_ = class194.replayMode * -871006613;
				if (i_31_ == 0 || i_31_ == 2)
				    bool_29_ = false;
				else if (1 == i_31_)
				    bool_29_ = true;
			    }
			} else {
			    Class674 class674
				= (Class674) Class574.aClass40_Sub20_7645
						 .method76(i_14_, 1427592888);
			    Class674 class674_32_
				= (Class674) Class574.aClass40_Sub20_7645
						 .method76(i_30_, 135074321);
			    if (class674.anInt8596 * 1700860103 != -1
				&& -1 != class674_32_.anInt8596 * 1700860103) {
				AnimationDefinition class194
				    = ((AnimationDefinition)
				       (Class685.aClass40_Sub8_8691.method76
					(class674.anInt8596 * 1700860103,
					 1589959419)));
				AnimationDefinition class194_33_
				    = ((AnimationDefinition)
				       (Class685.aClass40_Sub8_8691.method76
					(class674_32_.anInt8596 * 1700860103,
					 1613469329)));
				if (1014786343 * class194.priority
				    < 1014786343 * class194_33_.priority)
				    bool_29_ = false;
			    }
			}
		    }
		    if (bool_29_) {
			class540.anInt7182 = 637232685 * i_14_;
			class540.anInt7184 = -1651654555 * i_18_;
			class540.anInt7186 = 409524119 * i_21_;
			if (-1 != i_14_) {
			    Class674 class674
				= (Class674) Class574.aClass40_Sub20_7645
						 .method76(i_14_, 1967016060);
			    int i_34_ = class674.aBool8608 ? 0 : 2;
			    if (bool)
				i_34_ = 1;
			    class540.aClass689_7183.method14082
				(class674.anInt8596 * 1700860103, i_19_, i_34_,
				 false, 149145084);
			} else
			    class540.aClass689_7183.method14068(-1,
								(byte) -35);
		    }
		}
	    } else if (0 != i_16_ >> 28) {
		int i_35_ = i_16_ & 0xffff;
		Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1;
		if (i_35_ == client.anInt11053 * 615376671)
		    class656_sub1_sub3_sub1_sub1
			= Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705;
		else
		    class656_sub1_sub3_sub1_sub1
			= (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
			   [i_35_]);
		if (null != class656_sub1_sub3_sub1_sub1) {
		    Class540 class540 = (class656_sub1_sub3_sub1_sub1
					 .aClass540Array12029[i_17_]);
		    if (i_14_ == 65535)
			i_14_ = -1;
		    boolean bool_36_ = true;
		    int i_37_ = 1420286373 * class540.anInt7182;
		    if (-1 != i_14_ && i_37_ != -1) {
			if (i_14_ == i_37_) {
			    Class674 class674
				= (Class674) Class574.aClass40_Sub20_7645
						 .method76(i_14_, 2033030846);
			    if (class674.aBool8608
				&& -1 != class674.anInt8596 * 1700860103) {
				AnimationDefinition class194
				    = ((AnimationDefinition)
				       (Class685.aClass40_Sub8_8691.method76
					(class674.anInt8596 * 1700860103,
					 -1601859325)));
				int i_38_ = class194.replayMode * -871006613;
				if (i_38_ == 0 || i_38_ == 2)
				    bool_36_ = false;
				else if (1 == i_38_)
				    bool_36_ = true;
			    }
			} else {
			    Class674 class674
				= (Class674) Class574.aClass40_Sub20_7645
						 .method76(i_14_, 1362559966);
			    Class674 class674_39_
				= (Class674) Class574.aClass40_Sub20_7645
						 .method76(i_37_, -400858696);
			    if (-1 != class674.anInt8596 * 1700860103
				&& -1 != class674_39_.anInt8596 * 1700860103) {
				AnimationDefinition class194
				    = ((AnimationDefinition)
				       (Class685.aClass40_Sub8_8691.method76
					(1700860103 * class674.anInt8596,
					 488141822)));
				AnimationDefinition class194_40_
				    = ((AnimationDefinition)
				       (Class685.aClass40_Sub8_8691.method76
					(class674_39_.anInt8596 * 1700860103,
					 -1642080204)));
				if (class194.priority * 1014786343
				    < 1014786343 * class194_40_.priority)
				    bool_36_ = false;
			    }
			}
		    }
		    if (bool_36_) {
			class540.anInt7182 = 637232685 * i_14_;
			class540.anInt7184 = -1651654555 * i_18_;
			class540.anInt7186 = 409524119 * i_21_;
			class540.anInt7185 = i_20_ * -1710964133;
			if (i_14_ != -1) {
			    Class674 class674
				= (Class674) Class574.aClass40_Sub20_7645
						 .method76(i_14_, -2050226809);
			    int i_41_ = class674.aBool8608 ? 0 : 2;
			    if (bool)
				i_41_ = 1;
			    class540.aClass689_7183.method14082
				(class674.anInt8596 * 1700860103, i_19_, i_41_,
				 false, -682740403);
			} else
			    class540.aClass689_7183.method14068(-1,
								(byte) -89);
		    }
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4480) {
	    client.anInt11081
		= class525_sub38_sub2.readSmart((byte) 43) * -1695435031;
	    client.anInt11309 = client.anInt11162 * -1428085261;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4600 == class96.aClass416_1172) {
	    String string = class525_sub38_sub2.readString((byte) -28);
	    boolean bool = class525_sub38_sub2.readUnsignedByte(1765455570) == 1;
	    String string_42_;
	    if (bool)
		string_42_ = class525_sub38_sub2.readString((byte) -61);
	    else
		string_42_ = string;
	    int i_43_ = class525_sub38_sub2.readUnsignedShort((byte) 48);
	    byte i_44_ = class525_sub38_sub2.readByte(-1150098071);
	    boolean bool_45_ = false;
	    if (-128 == i_44_)
		bool_45_ = true;
	    if (bool_45_) {
		if (0 == Class110.anInt1371 * -218000115) {
		    class96.aClass416_1172 = null;
		    return true;
		}
		boolean bool_46_ = false;
		int i_47_;
		for (i_47_ = 0;
		     (i_47_ < -218000115 * Class110.anInt1371
		      && (!Class699.aClass99Array8774[i_47_].aString1208
			       .equals(string_42_)
			  || 82498617 * (Class699.aClass99Array8774[i_47_]
					 .anInt1210) != i_43_));
		     i_47_++) {
		    /* empty */
		}
		if (i_47_ < -218000115 * Class110.anInt1371) {
		    for (/**/; i_47_ < -218000115 * Class110.anInt1371 - 1;
			 i_47_++)
			Class699.aClass99Array8774[i_47_]
			    = Class699.aClass99Array8774[1 + i_47_];
		    Class110.anInt1371 -= -1599061563;
		    Class699.aClass99Array8774[-218000115 * Class110.anInt1371]
			= null;
		}
	    } else {
		String string_48_
		    = class525_sub38_sub2.readString((byte) -21);
		Class99 class99 = new Class99();
		class99.aString1207 = string;
		class99.aString1208 = string_42_;
		class99.aString1209
		    = Class48.method1111(class99.aString1208,
					 Class454.aClass76_4951, 1755675868);
		class99.anInt1210 = i_43_ * -818488823;
		class99.aByte1212 = i_44_;
		class99.aString1211 = string_48_;
		int i_49_;
		for (i_49_ = -218000115 * Class110.anInt1371 - 1; i_49_ >= 0;
		     i_49_--) {
		    int i_50_ = Class699.aClass99Array8774[i_49_]
				    .aString1209
				    .compareTo(class99.aString1209);
		    if (0 == i_50_) {
			Class699.aClass99Array8774[i_49_].anInt1210
			    = -818488823 * i_43_;
			Class699.aClass99Array8774[i_49_].aByte1212 = i_44_;
			Class699.aClass99Array8774[i_49_].aString1211
			    = string_48_;
			if (string_42_.equals
			    (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			     .aString12231))
			    Class69.aByte737 = i_44_;
			client.anInt11339 = client.anInt11162 * -124915057;
			class96.aClass416_1172 = null;
			return true;
		    }
		    if (i_50_ < 0)
			break;
		}
		if (Class110.anInt1371 * -218000115
		    >= Class699.aClass99Array8774.length) {
		    class96.aClass416_1172 = null;
		    return true;
		}
		for (int i_51_ = -218000115 * Class110.anInt1371 - 1;
		     i_51_ > i_49_; i_51_--)
		    Class699.aClass99Array8774[i_51_ + 1]
			= Class699.aClass99Array8774[i_51_];
		if (-218000115 * Class110.anInt1371 == 0)
		    Class699.aClass99Array8774 = new Class99[100];
		Class699.aClass99Array8774[1 + i_49_] = class99;
		Class110.anInt1371 += -1599061563;
		if (string_42_.equals(Class581
				      .aClass656_Sub1_Sub3_Sub1_Sub1_7705
				      .aString12231))
		    Class69.aByte737 = i_44_;
	    }
	    client.anInt11339 = -124915057 * client.anInt11162;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4475) {
	    int i_52_ = class525_sub38_sub2.method16667(656811703);
	    int i_53_ = class525_sub38_sub2.method16678((byte) -81);
	    Class242.method4448((byte) -83);
	    Class625.method10258(i_53_, i_52_, -610555775);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4518) {
	    Class412.method6677(Class406.aClass406_4160, (byte) -68);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4560) {
	    if (!client.aBool11376) {
		try {
		    int i_54_ = class525_sub38_sub2.method16679((byte) -97);
		    int i_55_ = class525_sub38_sub2.method16660(1337682691);
		    byte i_56_ = class525_sub38_sub2.method16739(907094016);
		    client.aClass229_11119.method4356(i_55_, 2085210189)
			.method3958(i_54_, i_56_, -776487530);
		} catch (RuntimeException runtimeexception) {
		    Class525_Sub16_Sub13.method18448(null, runtimeexception,
						     (byte) 5);
		    Class671.method11046(class96, (byte) 7);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4434) {
	    Class412.method6677(Class406.aClass406_4162, (byte) -8);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4574 == class96.aClass416_1172) {
	    int i_57_ = class525_sub38_sub2.method16677(-1119924747);
	    int i_58_ = class525_sub38_sub2.method16669((short) 7526);
	    int i_59_ = class525_sub38_sub2.method16669((short) 19267);
	    Class242.method4448((byte) -94);
	    Class641.method10577(i_57_, i_58_, i_59_, -569745177);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4514 == class96.aClass416_1172) {
	    int i_60_ = class525_sub38_sub2.method16678((byte) -37);
	    int i_61_ = class525_sub38_sub2.method16667(1503462406);
	    Class532.aClass111_7170.aClass614_1374.method10065
		((Class322) Class575.aClass40_Sub10_7647.method76(i_61_,
								  242186384),
		 i_60_, -1904185833);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4505) {
	    int i_62_ = class525_sub38_sub2.method16677(-1723550544);
	    int i_63_ = class525_sub38_sub2.method16667(1984641394);
	    int i_64_ = class525_sub38_sub2.method16678((byte) -53);
	    int i_65_ = class525_sub38_sub2.readInt(970440806);
	    int i_66_ = class525_sub38_sub2.method16680(-1796980997);
	    int i_67_ = class525_sub38_sub2.method16624(1806807210);
	    int i_68_ = class525_sub38_sub2.method16679((byte) -13);
	    int i_69_ = class525_sub38_sub2.readInt(1719686431);
	    Class242.method4448((byte) -17);
	    Class631.method10317(i_62_,
				 new Class525_Sub33_Sub1(i_63_, i_67_, i_66_),
				 new int[] { i_69_, i_65_, i_64_, i_68_ },
				 false, 543356344);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4508) {
	    String string = class525_sub38_sub2.readString((byte) 38);
	    Object[] objects = new Object[string.length() + 1];
	    for (int i_70_ = string.length() - 1; i_70_ >= 0; i_70_--) {
		if (string.charAt(i_70_) == 's')
		    objects[1 + i_70_]
			= class525_sub38_sub2.readString((byte) 13);
		else
		    objects[i_70_ + 1]
			= new Integer(class525_sub38_sub2
					  .readInt(2134328899));
	    }
	    objects[0]
		= new Integer(class525_sub38_sub2.readInt(1838788387));
	    Class242.method4448((byte) -36);
	    Class525_Sub32 class525_sub32 = new Class525_Sub32();
	    class525_sub32.anObjectArray10740 = objects;
	    Class241.method4435(class525_sub32, 1118190006);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4438 == class96.aClass416_1172) {
	    Class657.aString8440
		= (-1101265009 * class96.anInt1173 > 2
		   ? class525_sub38_sub2.readString((byte) -50)
		   : Class53.aClass53_383.method1169(Class21.aClass666_213,
						     1552651121));
	    client.anInt11245 = (class96.anInt1173 * -1101265009 > 0
				 ? class525_sub38_sub2.readUnsignedShort((byte) 7)
				 : -1) * 1805700461;
	    if (65535 == client.anInt11245 * -1237957531)
		client.anInt11245 = -1805700461;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4554 == class96.aClass416_1172) {
	    Class642.anInt8328
		= class525_sub38_sub2.method16699(-2140264839) * -128909469;
	    client.aBool11233
		= class525_sub38_sub2.readUnsignedByte(1928646315) == 1;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4422 == class96.aClass416_1172) {
	    Class309.aClass144_Sub1_3465.method14633((byte) 96);
	    class96.aClass416_1172 = null;
	    return false;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4441) {
	    int i_71_ = class525_sub38_sub2.readUnsignedByte(931202891);
	    int i_72_ = class525_sub38_sub2.method16679((byte) -17);
	    Class242.method4448((byte) -123);
	    Class94.method1730(i_72_, i_71_, 1073728184);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4602 == class96.aClass416_1172) {
	    int i_73_ = class525_sub38_sub2.readUnsignedShort((byte) 54);
	    Class53.method1176(i_73_, 461490568);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4541) {
	    int i_74_ = class525_sub38_sub2.readUnsignedShort((byte) 68);
	    int i_75_ = class525_sub38_sub2.readUnsignedShort((byte) 126);
	    int i_76_ = class525_sub38_sub2.readUnsignedShort((byte) 13);
	    Class242.method4448((byte) 2);
	    if (null != Class162.aClass245Array1764[i_74_]) {
		for (int i_77_ = i_75_; i_77_ < i_76_; i_77_++) {
		    int i_78_ = class525_sub38_sub2.method16834(-1994884458);
		    if (i_77_ < (Class162.aClass245Array1764[i_74_]
				 .aClass259Array2426).length
			&& (Class162.aClass245Array1764[i_74_]
			    .aClass259Array2426[i_77_]) != null)
			Class162.aClass245Array1764[i_74_]
			    .aClass259Array2426[i_77_].anInt2587
			    = 1637044425 * i_78_;
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4471) {
	    String string = class525_sub38_sub2.readString((byte) 58);
	    String string_79_
		= Class274.method5092(Class223.method4241(class525_sub38_sub2,
							  (byte) 4),
				      2595427);
	    Class240.method4427(6, 0, string, string, string, string_79_, null,
				-238636077);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4459 == class96.aClass416_1172) {
	    int i_80_ = class525_sub38_sub2.method16667(231048770);
	    int i_81_ = class525_sub38_sub2.method16678((byte) -4);
	    Class242.method4448((byte) -19);
	    Class531_Sub2.method15935(i_80_, i_81_, -2101317348);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4599) {
	    boolean bool = class525_sub38_sub2.readUnsignedByte(819539826) == 1;
	    String string = class525_sub38_sub2.readString((byte) 34);
	    String string_82_ = string;
	    if (bool)
		string_82_ = class525_sub38_sub2.readString((byte) 11);
	    long l = (long) class525_sub38_sub2.readUnsignedShort((byte) 124);
	    long l_83_ = (long) class525_sub38_sub2.method16834(-1994884458);
	    Class411 class411
		= ((Class411)
		   Class539.method8888(Class411.method6672(-2073143159),
				       class525_sub38_sub2
					   .readUnsignedByte(1833788897),
				       1554342588));
	    long l_84_ = (l << 32) + l_83_;
	    boolean bool_85_ = false;
	while_133_:
	    do {
		for (int i_86_ = 0; i_86_ < 100; i_86_++) {
		    if (l_84_ == client.aLongArray11335[i_86_]) {
			bool_85_ = true;
			break while_133_;
		    }
		}
		if (class411.aBool4252) {
		    if (client.aBool11233 && !client.aBool11266
			|| client.aBool11064)
			bool_85_ = true;
		    else if (Class450.method7330(string_82_, 1888534461))
			bool_85_ = true;
		}
	    } while (false);
	    if (!bool_85_) {
		client.aLongArray11335[client.anInt11336 * 1397979293] = l_84_;
		client.anInt11336
		    = -870396491 * ((1 + 1397979293 * client.anInt11336)
				    % 100);
		String string_87_
		    = (Class274.method5092
		       (Class223.method4241(class525_sub38_sub2, (byte) 4),
			74471089));
		int i_88_ = class411.aBool4242 ? 7 : 3;
		if (-1 != class411.anInt4251 * -569278595)
		    Class627.method10275
			(i_88_, 0,
			 new StringBuilder().append
			     (Class501.method8197((class411.anInt4251
						   * -569278595),
						  -545978049))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class501.method8197((-569278595
						   * class411.anInt4251),
						  786362456))
			     .append
			     (string_82_).toString(),
			 string, string_87_, null, -1, class411, (byte) 0);
		else
		    Class627.method10275(i_88_, 0, string, string_82_, string,
					 string_87_, null, -1, class411,
					 (byte) 0);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4453) {
	    String string = class525_sub38_sub2.readString((byte) 54);
	    int i_89_ = class525_sub38_sub2.readUnsignedShort((byte) 12);
	    Class242.method4448((byte) -96);
	    Class637.method10517(i_89_, string, -1432923664);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4573 == class96.aClass416_1172) {
	    client.aClass621_11237
		= ((Class621)
		   Class539.method8888(Class621.method10185(1054410274),
				       class525_sub38_sub2
					   .readUnsignedByte(1047082491),
				       -117678442));
	    if (null == client.aClass621_11237)
		client.aClass621_11237 = Class621.aClass621_8087;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4575 == class96.aClass416_1172) {
	    int i_90_ = class525_sub38_sub2.readInt(879690759);
	    if (i_90_ != -628474859 * Class309.anInt3464) {
		Class309.anInt3464 = i_90_ * -1961249987;
		Class396.method6536(Class578.aClass578_7661, -1, -1,
				    537902335);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4501) {
	    int i_91_ = class525_sub38_sub2.method16678((byte) -14);
	    int i_92_ = class525_sub38_sub2.method16667(1007595269);
	    Class600 class600
		= new Class600(class525_sub38_sub2.readInt(2071179756));
	    int i_93_ = class525_sub38_sub2.method16624(1323335030);
	    int i_94_ = class525_sub38_sub2.readUnsignedByte(1549018091);
	    int i_95_ = i_94_ >> 2;
	    int i_96_ = i_94_ & 0x3;
	    int i_97_ = class525_sub38_sub2.readInt(1641038347);
	    int i_98_ = class525_sub38_sub2.method16679((byte) 56);
	    int i_99_ = class525_sub38_sub2.method16678((byte) -88);
	    int i_100_ = class525_sub38_sub2.method16677(-1082037458);
	    int i_101_ = class525_sub38_sub2.method16679((byte) 22);
	    Class242.method4448((byte) -92);
	    Class631.method10317(i_97_,
				 new Class525_Sub33_Sub2(i_92_, i_93_,
							 new Class677(class600,
								      i_95_,
								      i_96_,
								      i_99_)),
				 new int[] { i_91_, i_100_, i_98_, i_101_ },
				 false, 1328792603);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4428 == class96.aClass416_1172) {
	    if (!client.aBool11376) {
		try {
		    int i_102_ = class525_sub38_sub2.readUnsignedByte(1185436823);
		    client.aClass229_11119.method4364(i_102_, -242974792);
		} catch (RuntimeException runtimeexception) {
		    Class525_Sub16_Sub13.method18448(null, runtimeexception,
						     (byte) 5);
		    Class671.method11046(class96, (byte) 7);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4586 == class96.aClass416_1172) {
	    int i_103_ = class525_sub38_sub2.method16679((byte) 8);
	    int i_104_ = class525_sub38_sub2.method16677(-1873393116);
	    Class242.method4448((byte) -87);
	    Class531_Sub3.method15944(i_103_, i_104_, -2052228680);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4488 == class96.aClass416_1172) {
	    Class412.method6677(Class406.aClass406_4163, (byte) 74);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4506) {
	    String string = class525_sub38_sub2.readString((byte) 39);
	    int i_105_ = class525_sub38_sub2.readUnsignedShort((byte) 73);
	    if (65535 == i_105_)
		i_105_ = -1;
	    int i_106_ = class525_sub38_sub2.readUnsignedByte(2039796333);
	    int i_107_ = class525_sub38_sub2.method16624(-497044804);
	    if (i_106_ >= 1 && i_106_ <= 8) {
		if (string.equalsIgnoreCase("null"))
		    string = null;
		client.aStringArray11243[i_106_ - 1] = string;
		client.anIntArray11270[i_106_ - 1] = i_105_;
		client.aBoolArray11244[i_106_ - 1] = i_107_ == 0;
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4467 == class96.aClass416_1172) {
	    while (class525_sub38_sub2.index * -1133521593
		   < class96.anInt1173 * -1101265009) {
		boolean bool
		    = class525_sub38_sub2.readUnsignedByte(1418848611) == 1;
		String string = class525_sub38_sub2.readString((byte) 77);
		String string_108_
		    = class525_sub38_sub2.readString((byte) -18);
		int i_109_ = class525_sub38_sub2.readUnsignedShort((byte) 8);
		int i_110_ = class525_sub38_sub2.readUnsignedByte(535547945);
		int i_111_ = class525_sub38_sub2.readUnsignedByte(1691983945);
		boolean bool_112_ = (i_111_ & 0x2) != 0;
		boolean bool_113_ = 0 != (i_111_ & 0x1);
		String string_114_ = "";
		int i_115_ = -1;
		int i_116_ = 0;
		if (i_109_ > 0) {
		    string_114_ = class525_sub38_sub2.readString((byte) 6);
		    i_115_ = class525_sub38_sub2.readUnsignedByte(1600296111);
		    i_116_ = class525_sub38_sub2.readInt(1013962305);
		}
		String string_117_
		    = class525_sub38_sub2.readString((byte) -1);
		for (int i_118_ = 0; i_118_ < client.anInt11204 * -883281325;
		     i_118_++) {
		    Class66 class66 = client.aClass66Array11356[i_118_];
		    if (!bool) {
			if (string.equals(class66.aString708)) {
			    if (class66.anInt706 * 163601069 != i_109_) {
				boolean bool_119_ = true;
				for (Class531_Sub1 class531_sub1
					 = ((Class531_Sub1)
					    client.aClass708_11394
						.method14328(1651808393));
				     null != class531_sub1;
				     class531_sub1
					 = ((Class531_Sub1)
					    client.aClass708_11394
						.method14337(-1171134525))) {
				    if (class531_sub1.aString10311
					    .equals(string)) {
					if (i_109_ != 0
					    && (class531_sub1.aShort10312
						== 0)) {
					    class531_sub1
						.method8794(-1117509341);
					    bool_119_ = false;
					} else if (0 == i_109_
						   && 0 != (class531_sub1
							    .aShort10312)) {
					    class531_sub1
						.method8794(-463356549);
					    bool_119_ = false;
					}
				    }
				}
				if (bool_119_)
				    client.aClass708_11394.method14331
					(new Class531_Sub1(string, i_109_),
					 (short) -32684);
				class66.anInt706 = 1790449957 * i_109_;
			    }
			    class66.aString707 = string_108_;
			    class66.aString714 = string_114_;
			    class66.anInt709 = -374069997 * i_110_;
			    class66.anInt711 = i_115_ * -1174173927;
			    class66.aBool712 = bool_112_;
			    class66.aBool710 = bool_113_;
			    class66.aString713 = string_117_;
			    class66.anInt715 = 922575681 * i_116_;
			    string = null;
			    break;
			}
		    } else if (string_108_.equals(class66.aString708)) {
			class66.aString708 = string;
			class66.aString707 = string_108_;
			string = null;
			break;
		    }
		}
		if (null != string && client.anInt11204 * -883281325 < 400) {
		    Class66 class66 = new Class66();
		    client.aClass66Array11356[client.anInt11204 * -883281325]
			= class66;
		    class66.aString708 = string;
		    class66.aString707 = string_108_;
		    class66.anInt706 = 1790449957 * i_109_;
		    class66.aString714 = string_114_;
		    class66.anInt709 = i_110_ * -374069997;
		    class66.anInt711 = i_115_ * -1174173927;
		    class66.aBool712 = bool_112_;
		    class66.aBool710 = bool_113_;
		    class66.aString713 = string_117_;
		    class66.anInt715 = i_116_ * 922575681;
		    client.anInt11204 += 1920262619;
		}
	    }
	    client.anInt11362 = 168988646;
	    client.anInt11304 = 1928320841 * client.anInt11162;
	    boolean bool = false;
	    int i_120_ = client.anInt11204 * -883281325;
	    do {
		if (i_120_ <= 0)
		    break;
		bool = true;
		i_120_--;
		for (int i_121_ = 0; i_121_ < i_120_; i_121_++) {
		    boolean bool_122_ = false;
		    Class66 class66 = client.aClass66Array11356[i_121_];
		    Class66 class66_123_
			= client.aClass66Array11356[1 + i_121_];
		    if ((Class15.aClass1_173.anInt11 * -559264181
			 != class66.anInt706 * 163601069)
			&& (Class15.aClass1_173.anInt11 * -559264181
			    == 163601069 * class66_123_.anInt706))
			bool_122_ = true;
		    if (!bool_122_ && 0 == class66.anInt706 * 163601069
			&& 163601069 * class66_123_.anInt706 != 0)
			bool_122_ = true;
		    if (!bool_122_ && !class66.aBool712
			&& class66_123_.aBool712)
			bool_122_ = true;
		    if (!bool_122_ && !class66.aBool710
			&& class66_123_.aBool710)
			bool_122_ = true;
		    if (bool_122_) {
			Class66 class66_124_
			    = client.aClass66Array11356[i_121_];
			client.aClass66Array11356[i_121_]
			    = client.aClass66Array11356[1 + i_121_];
			client.aClass66Array11356[1 + i_121_] = class66_124_;
			bool = false;
		    }
		}
	    } while (!bool);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4426) {
	    String string = class525_sub38_sub2.readString((byte) 24);
	    Class657.method10864(string, 1435872315);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4604 == class96.aClass416_1172) {
	    Class515.anInt5723 = (class525_sub38_sub2.method16739(907094016)
				  << 3) * -212210859;
	    Class236.anInt2391 = (class525_sub38_sub2.method16662(-880411526)
				  << 3) * -1152187739;
	    TextureMetrics.anInt1836
		= class525_sub38_sub2.method16607(-1571461918) * 1493786273;
	    Class600 class600 = client.aClass507_11137.method8350(-222511604);
	    for (Class525_Sub23 class525_sub23
		     = ((Class525_Sub23)
			client.aClass10_11246.method689(1497541834));
		 class525_sub23 != null;
		 class525_sub23 = (Class525_Sub23) client.aClass10_11246
						       .method690((byte) 41)) {
		int i_125_
		    = (int) ((-5126207504388691097L * class525_sub23.aLong7113
			      >> 28)
			     & 0x3L);
		int i_126_
		    = (int) (-5126207504388691097L * class525_sub23.aLong7113
			     & 0x3fffL);
		int i_127_ = i_126_ - class600.anInt7858 * -1227002079;
		int i_128_
		    = (int) ((class525_sub23.aLong7113 * -5126207504388691097L
			      >> 14)
			     & 0x3fffL);
		int i_129_ = i_128_ - class600.anInt7860 * 1429253007;
		if (i_125_ == -799406751 * TextureMetrics.anInt1836
		    && i_127_ >= Class515.anInt5723 * -2067088899
		    && i_127_ < 8 + -2067088899 * Class515.anInt5723
		    && i_129_ >= -727902931 * Class236.anInt2391
		    && i_129_ < 8 + Class236.anInt2391 * -727902931) {
		    class525_sub23.method8755(-1933461091);
		    if (i_127_ >= 0 && i_129_ >= 0
			&& (i_127_
			    < client.aClass507_11137.method8412(673227540))
			&& (i_129_
			    < client.aClass507_11137.method8352((byte) -87)))
			Class685.method11253(-799406751 * TextureMetrics.anInt1836,
					     i_127_, i_129_, 2139459664);
		}
	    }
	    for (Class525_Sub12 class525_sub12
		     = (Class525_Sub12) Class525_Sub12.aClass709_10525
					    .method14372((short) -17069);
		 class525_sub12 != null;
		 class525_sub12
		     = (Class525_Sub12) Class525_Sub12.aClass709_10525
					    .method14353(-1581643894)) {
		if ((-1168021715 * class525_sub12.anInt10514
		     >= Class515.anInt5723 * -2067088899)
		    && (-1168021715 * class525_sub12.anInt10514
			< -2067088899 * Class515.anInt5723 + 8)
		    && (-1370300329 * class525_sub12.anInt10512
			>= -727902931 * Class236.anInt2391)
		    && (-1370300329 * class525_sub12.anInt10512
			< Class236.anInt2391 * -727902931 + 8)
		    && (-799406751 * TextureMetrics.anInt1836
			== 1334650435 * class525_sub12.anInt10527))
		    class525_sub12.aBool10524 = true;
	    }
	    for (Class525_Sub12 class525_sub12
		     = (Class525_Sub12) Class525_Sub12.aClass709_10526
					    .method14372((short) -7671);
		 null != class525_sub12;
		 class525_sub12
		     = (Class525_Sub12) Class525_Sub12.aClass709_10526
					    .method14353(-1692788893)) {
		if ((-1168021715 * class525_sub12.anInt10514
		     >= -2067088899 * Class515.anInt5723)
		    && (-1168021715 * class525_sub12.anInt10514
			< 8 + -2067088899 * Class515.anInt5723)
		    && (-1370300329 * class525_sub12.anInt10512
			>= -727902931 * Class236.anInt2391)
		    && (class525_sub12.anInt10512 * -1370300329
			< -727902931 * Class236.anInt2391 + 8)
		    && (1334650435 * class525_sub12.anInt10527
			== TextureMetrics.anInt1836 * -799406751))
		    class525_sub12.aBool10524 = true;
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4504) {
	    Class156.method2465(Class70.aBool787, 1250922532);
	    class96.aClass416_1172 = null;
	    return false;
	}
	if (Class416.aClass416_4536 == class96.aClass416_1172) {
	    Class525_Sub38_Sub2 class525_sub38_sub2_130_
		= new Class525_Sub38_Sub2(-1101265009 * class96.anInt1173);
	    System.arraycopy(class96.aClass525_Sub38_Sub2_1168.buffer,
			     (-1133521593
			      * class96.aClass525_Sub38_Sub2_1168.index),
			     class525_sub38_sub2_130_.buffer, 0,
			     -1101265009 * class96.anInt1173);
	    Class486.method7856(650110653);
	    if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub25_10723
		    .method17208(424135869)
		== 1)
		Class45.aClass500_349.method8170
		    (new Class514(Class499.aClass499_5548,
				  class525_sub38_sub2_130_),
		     -172814945);
	    else
		client.aClass507_11137.method8376
		    (new Class514(Class499.aClass499_5548,
				  class525_sub38_sub2_130_),
		     -1133521593);
	    class96.aClass416_1172 = null;
	    return false;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4522) {
	    int i_131_ = class525_sub38_sub2.readUnsignedShort((byte) 12);
	    int i_132_ = class525_sub38_sub2.method16624(-1765399449);
	    int i_133_ = class525_sub38_sub2.method16678((byte) -2);
	    int i_134_ = class525_sub38_sub2.method16680(-1949769243);
	    Class242.method4448((byte) -119);
	    Class525_Sub23.method16343(i_133_, i_132_, i_131_, i_134_,
				       -1343360368);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4479) {
	    int i_135_ = class525_sub38_sub2.readUnsignedShort((byte) 63);
	    Class40_Sub20.aClass217_11050.method4033(i_135_, (byte) -111);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4567) {
	    if (Class695.aBool8757 && Class96.aFrame1186 != null)
		Class332_Sub1.method15672(Class198_Sub13
					      .aClass525_Sub30_9973
					      .aClass696_Sub41_10704
					      .method17337(1404870807),
					  -1, -1, false, (byte) 71);
	    byte[] is = new byte[-1101265009 * class96.anInt1173];
	    class525_sub38_sub2.method18489(is, 0,
					    -1101265009 * class96.anInt1173,
					    1450532935);
	    String string
		= Class392.method6482(is, 0, class96.anInt1173 * -1101265009,
				      1875563138);
	    NPCDefinitions.method5393(string, true, client.aBool11241, -1269922510);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4503) {
	    int i_136_ = class525_sub38_sub2.method16678((byte) 93);
	    Class242.method4448((byte) -101);
	    Class525_Sub33 class525_sub33
		= ((Class525_Sub33)
		   client.aClass10_11261.method684((long) i_136_));
	    if (class525_sub33 != null)
		Class708.method14341(class525_sub33, true, false, 285206794);
	    if (null != client.aClass259_11263) {
		Class649.method10708(client.aClass259_11263, (byte) 0);
		client.aClass259_11263 = null;
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4436) {
	    int i_137_ = class525_sub38_sub2.readUnsignedByte(559502801);
	    Class706 class706
		= (Class706) Class539.method8888(Class196.method3740((byte) 1),
						 i_137_, 1809631249);
	    if (null == class706)
		class706 = Class706.aClass706_8808;
	    Class525_Sub16_Sub3.method18013(class706, -986144388);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4498) {
	    Class40_Sub20.aClass217_11050.method4044
		(class525_sub38_sub2.readUnsignedShort((byte) 35), (byte) -41);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4492 == class96.aClass416_1172) {
	    int i_138_ = class525_sub38_sub2.readUnsignedByte(1947717534);
	    int i_139_ = class525_sub38_sub2.method16668((byte) -6);
	    int i_140_ = class525_sub38_sub2.readInt(1337276523);
	    int i_141_ = class525_sub38_sub2.method16678((byte) -38);
	    int i_142_ = class525_sub38_sub2.readInt(1417297749);
	    int i_143_ = class525_sub38_sub2.readInt(1460289133);
	    int i_144_ = class525_sub38_sub2.readUnsignedShort((byte) 127);
	    int i_145_ = class525_sub38_sub2.method16679((byte) 25);
	    Class242.method4448((byte) -30);
	    Class631.method10317(i_141_,
				 new Class525_Sub33_Sub4(i_139_, i_138_,
							 i_144_),
				 new int[] { i_140_, i_142_, i_143_, i_145_ },
				 false, 2113706693);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4470 == class96.aClass416_1172) {
	    int i_146_ = class525_sub38_sub2.readUnsignedByte(1332324572);
	    int i_147_ = class525_sub38_sub2.readUnsignedByte(167681978);
	    int i_148_ = class525_sub38_sub2.method16660(1909709335);
	    int i_149_ = class525_sub38_sub2.readUnsignedByte(2136963046);
	    int i_150_ = class525_sub38_sub2.method16680(-1851942781) << 2;
	    Class242.method4448((byte) -104);
	    Class269.method4999(i_149_, i_148_, i_150_, i_147_, i_146_, true,
				(byte) 8);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4444) {
	    class525_sub38_sub2.index += 914062596;
	    if (class525_sub38_sub2.method16764(-862518970))
		Class175_Sub2.method15604(class525_sub38_sub2,
					  -1133521593 * (class525_sub38_sub2
							 .index) - 28,
					  440511526);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4540) {
	    Class525_Sub38_Sub2 class525_sub38_sub2_151_
		= new Class525_Sub38_Sub2(-1101265009 * class96.anInt1173);
	    System.arraycopy(class96.aClass525_Sub38_Sub2_1168.buffer,
			     (class96.aClass525_Sub38_Sub2_1168.index
			      * -1133521593),
			     class525_sub38_sub2_151_.buffer, 0,
			     class96.anInt1173 * -1101265009);
	    Class486.method7856(650110653);
	    if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub25_10723
		    .method17208(424135869)
		== 1)
		Class45.aClass500_349.method8170
		    (new Class514(Class499.aClass499_5556,
				  class525_sub38_sub2_151_),
		     -234919269);
	    else
		client.aClass507_11137.method8376
		    (new Class514(Class499.aClass499_5556,
				  class525_sub38_sub2_151_),
		     -1133521593);
	    class96.aClass416_1172 = null;
	    return false;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4608) {
	    int i_152_ = class525_sub38_sub2.method16679((byte) -9);
	    int i_153_ = class525_sub38_sub2.method16679((byte) -16);
	    Class242.method4448((byte) -105);
	    Class607.method10000(i_153_, i_152_, 1816508067);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4576) {
	    if (!client.aBool11376) {
		try {
		    int i_154_ = class525_sub38_sub2.method16624(-1178754765);
		    int i_155_ = class525_sub38_sub2.method16624(1801127790);
		    int i_156_ = class525_sub38_sub2.readUnsignedByte(1425211325);
		    client.aClass229_11119.method4356(i_154_, 2121134219)
			.method3964(i_155_, i_156_, null, 617204670);
		} catch (RuntimeException runtimeexception) {
		    Class525_Sub16_Sub13.method18448(null, runtimeexception,
						     (byte) 92);
		    Class671.method11046(class96, (byte) 7);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4539 == class96.aClass416_1172) {
	    if (Class695.aBool8757 && null != Class96.aFrame1186)
		Class332_Sub1.method15672(Class198_Sub13
					      .aClass525_Sub30_9973
					      .aClass696_Sub41_10704
					      .method17337(137224521),
					  -1, -1, false, (byte) 2);
	    byte[] is = new byte[-1101265009 * class96.anInt1173 - 1];
	    boolean bool = class525_sub38_sub2.readUnsignedByte(833735616) == 1;
	    class525_sub38_sub2.method18489(is, 0,
					    (-1101265009 * class96.anInt1173
					     - 1),
					    984809004);
	    RSBuffer class525_sub38 = new RSBuffer(is);
	    String string = class525_sub38.readString((byte) -80);
	    if (bool) {
		String string_157_ = class525_sub38.readString((byte) -53);
		if (string_157_.length() == 0)
		    string_157_ = string;
		if (!client.aBool11315
		    || Class396.aString4106.startsWith("mac")
		    || !Class413.method6685(string, 1,
					    Class407.aClass407_4179
						.method6633(1405397844),
					    (byte) 126))
		    NPCDefinitions.method5393(string_157_, true, client.aBool11241,
					-983824450);
	    } else
		NPCDefinitions.method5393(string, true, client.aBool11241,
				    -2051904090);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4432 == class96.aClass416_1172) {
	    Class28.aClass702_283
		= Class510.method8504(class525_sub38_sub2
					  .readUnsignedByte(1648833002),
				      766278254);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4595 == class96.aClass416_1172) {
	    client.anInt11310 = -1365349593 * client.anInt11162;
	    if (0 == class96.anInt1173 * -1101265009)
		Class182_Sub2.aClass228_9503 = null;
	    else
		Class182_Sub2.aClass228_9503
		    = new Class228(0L, class525_sub38_sub2, true,
				   client.anInterface27_11120);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4445) {
	    client.anInt11339 = -124915057 * client.anInt11162;
	    if (0 == class96.anInt1173 * -1101265009) {
		client.aString11337 = null;
		client.aString11338 = null;
		Class110.anInt1371 = 0;
		Class699.aClass99Array8774 = null;
		class96.aClass416_1172 = null;
		return true;
	    }
	    client.aString11338 = class525_sub38_sub2.readString((byte) 56);
	    boolean bool = class525_sub38_sub2.readUnsignedByte(420273742) == 1;
	    if (bool)
		class525_sub38_sub2.readString((byte) 16);
	    client.aString11337 = class525_sub38_sub2.readString((byte) 4);
	    Class74.aByte821 = class525_sub38_sub2.readByte(-1150098071);
	    int i_158_ = class525_sub38_sub2.readUnsignedByte(1212908333);
	    if (255 == i_158_) {
		class96.aClass416_1172 = null;
		return true;
	    }
	    Class110.anInt1371 = -1599061563 * i_158_;
	    Class99[] class99s = new Class99[100];
	    for (int i_159_ = 0; i_159_ < Class110.anInt1371 * -218000115;
		 i_159_++) {
		class99s[i_159_] = new Class99();
		class99s[i_159_].aString1207
		    = class525_sub38_sub2.readString((byte) 11);
		bool = class525_sub38_sub2.readUnsignedByte(496962412) == 1;
		if (bool)
		    class99s[i_159_].aString1208
			= class525_sub38_sub2.readString((byte) -55);
		else
		    class99s[i_159_].aString1208
			= class99s[i_159_].aString1207;
		class99s[i_159_].aString1209
		    = Class48.method1111(class99s[i_159_].aString1208,
					 Class454.aClass76_4951, 1795816068);
		class99s[i_159_].anInt1210
		    = class525_sub38_sub2.readUnsignedShort((byte) 59) * -818488823;
		class99s[i_159_].aByte1212
		    = class525_sub38_sub2.readByte(-1150098071);
		class99s[i_159_].aString1211
		    = class525_sub38_sub2.readString((byte) -9);
		if (class99s[i_159_].aString1208.equals
		    (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aString12231))
		    Class69.aByte737 = class99s[i_159_].aByte1212;
	    }
	    boolean bool_160_ = false;
	    int i_161_ = Class110.anInt1371 * -218000115;
	    do {
		if (i_161_ <= 0)
		    break;
		bool_160_ = true;
		i_161_--;
		for (int i_162_ = 0; i_162_ < i_161_; i_162_++) {
		    if (class99s[i_162_].aString1209
			    .compareTo(class99s[i_162_ + 1].aString1209)
			> 0) {
			Class99 class99 = class99s[i_162_];
			class99s[i_162_] = class99s[i_162_ + 1];
			class99s[i_162_ + 1] = class99;
			bool_160_ = false;
		    }
		}
	    } while (!bool_160_);
	    Class699.aClass99Array8774 = class99s;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4589 == class96.aClass416_1172) {
	    int i_163_ = class525_sub38_sub2.readUnsignedByte(-7190375);
	    Class712 class712
		= ((Class712)
		   Class539.method8888(Class508.method8493(1764922631), i_163_,
				       -410165710));
	    if (class712 == null)
		class712 = Class712.aClass712_8873;
	    Class198_Sub17.method15660(class712, (byte) 117);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4544) {
	    Class412.method6677(Class406.aClass406_4167, (byte) 18);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4588) {
	    if (null == Class212.aClass144_2271)
		Class212.aClass144_2271
		    = new Class144(Class711.aClass106_Sub1_Sub2_8869);
	    Class447 class447
		= Class711.aClass106_Sub1_Sub2_8869
		      .method14515(class525_sub38_sub2, (byte) -1);
	    Class212.aClass144_2271.anInterface3_1667.method18
		(class447.anInt4898 * -316828413, class447.anObject4899,
		 (byte) -88);
	    client.anIntArray11105
		[(client.anInt11255 += 252662709) * -586071395 - 1 & 0x3f]
		= class447.anInt4898 * -316828413;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4552 == class96.aClass416_1172) {
	    boolean bool = class525_sub38_sub2.readUnsignedByte(36666132) == 1;
	    long l = (long) class525_sub38_sub2.readUnsignedShort((byte) 63);
	    long l_164_ = (long) class525_sub38_sub2.method16834(-1994884458);
	    long l_165_ = l_164_ + (l << 32);
	    boolean bool_166_ = false;
	    Class525_Sub25 class525_sub25
		= (bool ? Class404.aClass525_Sub25_4148
		   : Class303.aClass525_Sub25_3406);
	    if (null == class525_sub25)
		bool_166_ = true;
	    else {
		for (int i_167_ = 0; i_167_ < 100; i_167_++) {
		    if (l_165_ == client.aLongArray11335[i_167_]) {
			bool_166_ = true;
			break;
		    }
		}
	    }
	    if (!bool_166_) {
		client.aLongArray11335[client.anInt11336 * 1397979293]
		    = l_165_;
		client.anInt11336
		    = (1 + client.anInt11336 * 1397979293) % 100 * -870396491;
		String string
		    = Class223.method4241(class525_sub38_sub2, (byte) 4);
		int i_168_ = bool ? 43 : 46;
		Class627.method10275(i_168_, 0, "", "", "", string,
				     class525_sub25.aString10605, -1, null,
				     (byte) 0);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4531 == class96.aClass416_1172) {
	    Class388.method6462((byte) 16);
	    class96.aClass416_1172 = null;
	    return false;
	}
	if (Class416.aClass416_4609 == class96.aClass416_1172) {
	    boolean bool = class525_sub38_sub2.method16624(989749698) == 1;
	    Class242.method4448((byte) -100);
	    Class623.aBool8123 = bool;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4556) {
	    int i_169_ = class525_sub38_sub2.readUnsignedShort((byte) 59);
	    int i_170_ = class525_sub38_sub2.readUnsignedShort((byte) 86);
	    int i_171_ = class525_sub38_sub2.readUnsignedShort((byte) 96);
	    Class40_Sub20.aClass217_11050.method4035(i_169_, i_170_, i_171_,
						     (byte) 111);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4601) {
	    boolean bool = class525_sub38_sub2.readUnsignedByte(547329652) == 1;
	    String string = class525_sub38_sub2.readString((byte) -4);
	    String string_172_ = string;
	    if (bool)
		string_172_ = class525_sub38_sub2.readString((byte) 13);
	    String string_173_ = class525_sub38_sub2.readString((byte) 58);
	    long l = (long) class525_sub38_sub2.readUnsignedShort((byte) 99);
	    long l_174_ = (long) class525_sub38_sub2.method16834(-1994884458);
	    Class411 class411
		= ((Class411)
		   Class539.method8888(Class411.method6672(-2073143159),
				       class525_sub38_sub2
					   .readUnsignedByte(1667984980),
				       1643663642));
	    int i_175_ = class525_sub38_sub2.readUnsignedShort((byte) 82);
	    long l_176_ = (l << 32) + l_174_;
	    boolean bool_177_ = false;
	while_134_:
	    do {
		for (int i_178_ = 0; i_178_ < 100; i_178_++) {
		    if (client.aLongArray11335[i_178_] == l_176_) {
			bool_177_ = true;
			break while_134_;
		    }
		}
		if (class411.aBool4252
		    && Class450.method7330(string_172_, -721980666))
		    bool_177_ = true;
	    } while (false);
	    if (!bool_177_) {
		client.aLongArray11335[client.anInt11336 * 1397979293]
		    = l_176_;
		client.anInt11336
		    = (1 + client.anInt11336 * 1397979293) % 100 * -870396491;
		String string_179_
		    = Class215.aClass58_2283.method1220(i_175_, 797864)
			  .method18423(class525_sub38_sub2, 1536082731);
		if (-569278595 * class411.anInt4251 != -1)
		    Class627.method10275
			(20, 0,
			 new StringBuilder().append
			     (Class501.method8197((-569278595
						   * class411.anInt4251),
						  630237695))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class501.method8197((class411.anInt4251
						   * -569278595),
						  1952578573))
			     .append
			     (string_172_).toString(),
			 string, string_179_, string_173_, i_175_, class411,
			 (byte) 0);
		else
		    Class627.method10275(20, 0, string, string_172_, string,
					 string_179_, string_173_, i_175_,
					 class411, (byte) 0);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4463) {
	    int i_180_ = class525_sub38_sub2.readUnsignedShort((byte) 15);
	    if (65535 == i_180_)
		i_180_ = -1;
	    int i_181_ = class525_sub38_sub2.readUnsignedByte(40762716);
	    int i_182_ = class525_sub38_sub2.readUnsignedShort((byte) 100);
	    int i_183_ = class525_sub38_sub2.readUnsignedByte(1627131803);
	    int i_184_ = class525_sub38_sub2.readUnsignedShort((byte) 63);
	    Class40_Sub20.aClass217_11050.method4047
		(Class204.aClass204_2226, i_180_, i_181_, i_183_,
		 Class208.aClass208_2250.method3907((short) -26574),
		 Class195.aClass195_2177, 0.0F, 0.0F, null, 0, i_184_, i_182_,
		 2130840932);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4440) {
	    int i_185_ = class525_sub38_sub2.method16680(-652271627);
	    byte i_186_ = class525_sub38_sub2.method16663((byte) 93);
	    Class532.aClass111_7170.aClass614_1374.method10063
		((Class163) Class109.aClass106_Sub1_Sub1_1323
				.method76(i_185_, 586345417),
		 i_186_, 1833679811);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4607) {
	    int i_187_ = class525_sub38_sub2.method16677(-1803670491);
	    int i_188_ = class525_sub38_sub2.method16680(-1841505040);
	    int i_189_ = class525_sub38_sub2.method16667(1849834556);
	    client.aClass507_11137.method8358((byte) 40)
		.method8991(i_189_, i_187_, i_188_, -23322022);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4451 == class96.aClass416_1172) {
	    int i_190_ = class525_sub38_sub2.method16680(-1810567357);
	    int i_191_ = class525_sub38_sub2.method16668((byte) 45);
	    Class242.method4448((byte) -58);
	    Class438.method7109(i_191_, i_190_, 0, 235328253);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4439 == class96.aClass416_1172) {
	    int i_192_ = class525_sub38_sub2.method16660(1411502932);
	    int i_193_ = class525_sub38_sub2.method16607(-1571461918);
	    int i_194_ = class525_sub38_sub2.method16607(-1571461918);
	    int i_195_ = class525_sub38_sub2.method16624(-1664191072);
	    int i_196_ = class525_sub38_sub2.readUnsignedShort((byte) 90) << 2;
	    Class242.method4448((byte) -73);
	    Class73.method1540(i_194_, i_195_, i_196_, i_193_, i_192_,
			       2075669485);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4482) {
	    int i_197_ = class525_sub38_sub2.readUnsignedByte(1607561246);
	    int i_198_ = i_197_ >> 5;
	    int i_199_ = i_197_ & 0x1f;
	    if (i_199_ == 0) {
		client.aClass109Array11089[i_198_] = null;
		class96.aClass416_1172 = null;
		return true;
	    }
	    Class109 class109 = new Class109();
	    class109.anInt1316 = i_199_ * -79491469;
	    class109.anInt1312
		= class525_sub38_sub2.readUnsignedByte(781671104) * -1950252685;
	    if (class109.anInt1312 * -1964012613 >= 0
		&& (-1964012613 * class109.anInt1312
		    < Class664.aClass157Array8556.length)) {
		if (1 == 309020347 * class109.anInt1316
		    || 309020347 * class109.anInt1316 == 10) {
		    class109.anInt1319
			= (class525_sub38_sub2.readUnsignedShort((byte) 1)
			   * -1389614575);
		    class109.anInt1320
			= (class525_sub38_sub2.readUnsignedShort((byte) 70)
			   * 25243717);
		    class525_sub38_sub2.index += 1357713884;
		} else if (309020347 * class109.anInt1316 >= 2
			   && class109.anInt1316 * 309020347 <= 6) {
		    if (309020347 * class109.anInt1316 == 2) {
			class109.anInt1313 = -1602746112;
			class109.anInt1314 = 2031815936;
		    }
		    if (309020347 * class109.anInt1316 == 3) {
			class109.anInt1313 = 0;
			class109.anInt1314 = 2031815936;
		    }
		    if (4 == 309020347 * class109.anInt1316) {
			class109.anInt1313 = 1089475072;
			class109.anInt1314 = 2031815936;
		    }
		    if (5 == class109.anInt1316 * 309020347) {
			class109.anInt1313 = -1602746112;
			class109.anInt1314 = 0;
		    }
		    if (class109.anInt1316 * 309020347 == 6) {
			class109.anInt1313 = -1602746112;
			class109.anInt1314 = -231335424;
		    }
		    class109.anInt1316 = -158982938;
		    class109.anInt1311
			= (class525_sub38_sub2.readUnsignedByte(109721731)
			   * -888925231);
		    Class600 class600
			= client.aClass507_11137.method8350(2050908275);
		    class109.anInt1313
			+= ((class525_sub38_sub2.readUnsignedShort((byte) 64)
			     - -1227002079 * class600.anInt7858)
			    << 9) * -593463287;
		    class109.anInt1314
			+= ((class525_sub38_sub2.readUnsignedShort((byte) 33)
			     - class600.anInt7860 * 1429253007)
			    << 9) * -1233577203;
		    class109.anInt1317
			= ((class525_sub38_sub2.readUnsignedByte(165669648) << 2)
			   * 54941333);
		    class109.anInt1315
			= (class525_sub38_sub2.readUnsignedShort((byte) 126)
			   * 624199951);
		}
		class109.anInt1318
		    = class525_sub38_sub2.readInt(1521323720) * -756476109;
		client.aClass109Array11089[i_198_] = class109;
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4429 == class96.aClass416_1172) {
	    int i_200_ = class525_sub38_sub2.readUnsignedSmart((byte) -79);
	    int i_201_ = class525_sub38_sub2.readInt(1876019978);
	    int i_202_ = class525_sub38_sub2.readUnsignedByte(1046529883);
	    String string = "";
	    String string_203_ = string;
	    if ((i_202_ & 0x1) != 0) {
		string = class525_sub38_sub2.readString((byte) 23);
		if (0 != (i_202_ & 0x2))
		    string_203_ = class525_sub38_sub2.readString((byte) 11);
		else
		    string_203_ = string;
	    }
	    String string_204_ = class525_sub38_sub2.readString((byte) -65);
	    if (i_200_ == 99)
		Class268.method4961(string_204_, 1383885330);
	    else if (98 == i_200_)
		Class484.method7843(string_204_, (byte) 6);
	    else {
		if (!string_203_.equals("")
		    && Class450.method7330(string_203_, -417386750)) {
		    class96.aClass416_1172 = null;
		    return true;
		}
		Class240.method4427(i_200_, i_201_, string, string_203_,
				    string, string_204_, null, 597780663);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4585 == class96.aClass416_1172) {
	    int i_205_ = class525_sub38_sub2.readUnsignedByte(333102591);
	    int i_206_ = class525_sub38_sub2.readBigSmart(-2043778683);
	    if (client.aClass523Array11183[i_205_] != null) {
		client.aClass523Array11183[i_205_].method8708
		    (client.aClass507_11137.method8358((byte) 108), 872267302);
		client.aClass523Array11183[i_205_] = null;
	    }
	    if (i_206_ != -1)
		client.aClass523Array11183[i_205_]
		    = new Class523(Class501.aClass182_5564,
				   class525_sub38_sub2, i_206_);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4557 == class96.aClass416_1172) {
	    if (!client.aBool11376) {
		try {
		    for (byte i_207_
				 = class525_sub38_sub2.readByte(-1150098071);
				 i_207_ != -1;
				 i_207_
			     = class525_sub38_sub2.readByte(-1150098071)) {
			for (byte i_208_ = class525_sub38_sub2
					       .readByte(-1150098071);
				 -1 != i_208_;
				 i_208_ = class525_sub38_sub2
					  .readByte(-1150098071)) {
			    for (byte i_209_ = class525_sub38_sub2
						   .readByte(-1150098071);
					 -1 != i_209_;
					 i_209_ = class525_sub38_sub2
					      .readByte(-1150098071))
				client.aClass229_11119.method4356
				    (i_207_, 2088328882).method3964
				    (i_208_, i_209_,
				     Integer.valueOf(class525_sub38_sub2
							 .readInt
						     (1579244633)),
				     617204670);
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    Class525_Sub16_Sub13.method18448(null, runtimeexception,
						     (byte) 99);
		    Class671.method11046(class96, (byte) 7);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4454) {
	    int i_210_ = class525_sub38_sub2.readUnsignedShort((byte) 67);
	    int i_211_ = class525_sub38_sub2.readUnsignedByte(891778502);
	    boolean bool = 0 != (i_211_ & 0x1);
	    boolean bool_212_ = 0 != (i_211_ & 0x2);
	    while (-1133521593 * class525_sub38_sub2.index
		   < -1101265009 * class96.anInt1173) {
		int i_213_ = class525_sub38_sub2.readUnsignedSmart((byte) -123);
		int i_214_ = class525_sub38_sub2.readUnsignedShort((byte) 96);
		int i_215_ = 0;
		Class9 class9 = null;
		if (0 != i_214_) {
		    i_215_ = class525_sub38_sub2.readUnsignedByte(67177408);
		    if (255 == i_215_)
			i_215_ = class525_sub38_sub2.readInt(1306738736);
		    if (bool_212_) {
			int i_216_
			    = class525_sub38_sub2.readUnsignedByte(484549279);
			if (i_216_ > 0) {
			    class9 = new Class9(Class234
						.aClass106_Sub1_Sub2_2373);
			    while (i_216_-- > 0) {
				Class447 class447
				    = (Class234.aClass106_Sub1_Sub2_2373
					   .method14515
				       (class525_sub38_sub2, (byte) -1));
				class9.method18((class447.anInt4898
						 * -316828413),
						class447.anObject4899,
						(byte) -95);
			    }
			}
		    }
		}
		Class442.method7126(i_210_, i_213_, i_214_ - 1, i_215_, class9,
				    bool, (byte) -33);
	    }
	    client.anIntArray11238
		[(client.anInt11294 += 1294910553) * 1777091561 - 1 & 0x3f]
		= i_210_;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4584) {
	    Class412.method6677(Class406.aClass406_4153, (byte) -32);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4592) {
	    Class412.method6677(Class406.aClass406_4158, (byte) -67);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4548) {
	    Class412.method6677(Class406.aClass406_4166, (byte) -121);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4527 == class96.aClass416_1172) {
	    int i_217_ = class525_sub38_sub2.readUnsignedByte(1502801751);
	    Class690 class690
		= (Class690) Class539.method8888(Class28.method909(1128105544),
						 i_217_, -1268617913);
	    if (class690 == null)
		class690 = Class690.aClass690_8740;
	    Class389.method6468(class690, (byte) -26);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4484 == class96.aClass416_1172) {
	    client.anInt11311 = client.anInt11162 * 1003714579;
	    int i_218_ = class525_sub38_sub2.index * -1133521593;
	    int i_219_ = class525_sub38_sub2.readUnsignedShort((byte) 105);
	    boolean bool = class525_sub38_sub2.readUnsignedByte(1661052695) == 1;
	    Class218 class218
		= Class182_Sub2.aClass228_9503.method4275(i_219_, 772082407);
	    Class9 class9 = class218.method4153((byte) 43);
	    if (class9 == null || bool) {
		class218.method4181(client.anInterface27_11120, 531394665);
		class9 = class218.method4153((byte) 103);
	    }
	    while ((-1101265009 * class96.anInt1173
		    - (-1133521593 * class525_sub38_sub2.index - i_218_))
		   > 0) {
		Class447 class447
		    = Class109.aClass106_Sub1_Sub1_1323
			  .method14515(class525_sub38_sub2, (byte) -1);
		class9.method18(class447.anInt4898 * -316828413,
				class447.anObject4899, (byte) -42);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4516 == class96.aClass416_1172) {
	    boolean bool = class525_sub38_sub2.method16624(921064939) == 1;
	    int i_220_ = class525_sub38_sub2.method16678((byte) -52);
	    Class242.method4448((byte) -105);
	    Class72.method1539(i_220_, bool, 1979457652);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4474 == class96.aClass416_1172) {
	    int i_221_ = class525_sub38_sub2.method16668((byte) -20);
	    if (i_221_ == 65535)
		i_221_ = -1;
	    int i_222_ = class525_sub38_sub2.method16607(-1571461918);
	    Class40_Sub20.aClass217_11050.method4094(i_221_, i_222_,
						     (short) -32223);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4542) {
	    int i_223_ = class525_sub38_sub2.method16660(205260215);
	    Class600 class600
		= new Class600(class525_sub38_sub2.readInt(1412702425));
	    int i_224_ = class525_sub38_sub2.method16678((byte) -3);
	    int i_225_ = class525_sub38_sub2.method16677(-1857082580);
	    int i_226_ = class525_sub38_sub2.method16678((byte) -11);
	    int i_227_ = class525_sub38_sub2.method16677(-725364341);
	    int i_228_ = class525_sub38_sub2.method16668((byte) 70);
	    int i_229_ = class525_sub38_sub2.method16678((byte) -42);
	    int i_230_ = class525_sub38_sub2.method16667(1535935884);
	    Class242.method4448((byte) -37);
	    Class631.method10317(i_226_,
				 new Class525_Sub33_Sub3(i_228_, i_223_,
							 new Class676(class600,
								      i_230_)),
				 new int[] { i_229_, i_224_, i_227_, i_225_ },
				 false, -2060866784);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4490) {
	    int i_231_ = class525_sub38_sub2.method16678((byte) -74);
	    int i_232_ = class525_sub38_sub2.method16677(943422736);
	    Class242.method4448((byte) -18);
	    Class525_Sub33 class525_sub33
		= ((Class525_Sub33)
		   client.aClass10_11261.method684((long) i_231_));
	    Class525_Sub33 class525_sub33_233_
		= ((Class525_Sub33)
		   client.aClass10_11261.method684((long) i_232_));
	    if (class525_sub33_233_ != null)
		Class708.method14341(class525_sub33_233_,
				     (null == class525_sub33
				      || (922288809 * class525_sub33.anInt10745
					  != 922288809 * (class525_sub33_233_
							  .anInt10745))),
				     false, -2104605306);
	    if (null != class525_sub33) {
		class525_sub33.method8755(-1933461091);
		client.aClass10_11261.method695(class525_sub33, (long) i_232_);
	    }
	    Class259 class259 = Class43.method1069(i_231_, -695254952);
	    if (class259 != null)
		Class649.method10708(class259, (byte) 0);
	    class259 = Class43.method1069(i_232_, -695254952);
	    if (class259 != null) {
		Class649.method10708(class259, (byte) 0);
		Class76.method1560((Class162.aClass245Array1764
				    [1984678839 * class259.anInt2588 >>> 16]),
				   class259, true, -181562890);
	    }
	    if (-750203937 * client.anInt11260 != -1)
		Textures.method3121(client.anInt11260 * -750203937, 1,
				    (byte) -31);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4493 == class96.aClass416_1172) {
	    Class212.aClass144_2271 = null;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4526 == class96.aClass416_1172) {
	    String string = class525_sub38_sub2.readString((byte) 29);
	    int i_234_ = class525_sub38_sub2.readUnsignedShort((byte) 112);
	    String string_235_
		= Class215.aClass58_2283.method1220(i_234_, 797864)
		      .method18423(class525_sub38_sub2, 1552469496);
	    Class627.method10275(19, 0, string, string, string, string_235_,
				 null, i_234_, null, (byte) 0);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4577) {
	    String string = class525_sub38_sub2.readString((byte) -21);
	    long l = (long) class525_sub38_sub2.readUnsignedShort((byte) 117);
	    long l_236_ = (long) class525_sub38_sub2.method16834(-1994884458);
	    Class411 class411
		= ((Class411)
		   Class539.method8888(Class411.method6672(-2073143159),
				       class525_sub38_sub2
					   .readUnsignedByte(1070475145),
				       -290698951));
	    boolean bool = class525_sub38_sub2.readUnsignedByte(378406166) == 1;
	    long l_237_ = (l << 32) + l_236_;
	    boolean bool_238_ = false;
	while_135_:
	    do {
		if (Class182_Sub2.aClass228_9503 == null)
		    bool_238_ = true;
		else {
		    for (int i_239_ = 0; i_239_ < 100; i_239_++) {
			if (client.aLongArray11335[i_239_] == l_237_) {
			    bool_238_ = true;
			    break while_135_;
			}
		    }
		    if (class411.aBool4252) {
			if (client.aBool11233 && !client.aBool11266
			    || client.aBool11064)
			    bool_238_ = true;
			else if (Class450.method7330(string, -1677581213))
			    bool_238_ = true;
		    }
		}
	    } while (false);
	    if (!bool_238_) {
		client.aLongArray11335[1397979293 * client.anInt11336]
		    = l_237_;
		client.anInt11336
		    = (client.anInt11336 * 1397979293 + 1) % 100 * -870396491;
		String string_240_
		    = (Class274.method5092
		       (Class223.method4241(class525_sub38_sub2, (byte) 4),
			-572397365));
		int i_241_ = bool ? 22 : 24;
		if (class411.anInt4251 * -569278595 != -1)
		    Class627.method10275
			(i_241_, 0,
			 new StringBuilder().append
			     (Class501.method8197((-569278595
						   * class411.anInt4251),
						  -293055755))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class501.method8197((-569278595
						   * class411.anInt4251),
						  -1182637374))
			     .append
			     (string).toString(),
			 string, string_240_,
			 Class182_Sub2.aClass228_9503.method4276(-1624228026),
			 -1, class411, (byte) 0);
		else
		    Class627.method10275(i_241_, 0, string, string, string,
					 string_240_,
					 Class182_Sub2.aClass228_9503
					     .method4276(-1799669239),
					 -1, class411, (byte) 0);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4555) {
	    int i_242_ = class525_sub38_sub2.readInt(1115291468);
	    int i_243_ = class525_sub38_sub2.method16668((byte) 9);
	    Class532.aClass111_7170.aClass614_1374.method10063
		((Class163) Class109.aClass106_Sub1_Sub1_1323
				.method76(i_243_, -1717603209),
		 i_242_, 1333044163);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4535 == class96.aClass416_1172) {
	    Class156.method2465(false, 1495440223);
	    class96.aClass416_1172 = null;
	    return false;
	}
	if (Class416.aClass416_4497 == class96.aClass416_1172) {
	    String string = class525_sub38_sub2.readString((byte) -67);
	    int i_244_ = class525_sub38_sub2.method16677(-1491217270);
	    Class242.method4448((byte) -33);
	    Class307.method5434(i_244_, string, 649071924);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4512 == class96.aClass416_1172) {
	    client.anInt11167
		= class525_sub38_sub2.readUnsignedByte(330213151) * -565559593;
	    client.anInt11309 = -1428085261 * client.anInt11162;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4612 == class96.aClass416_1172) {
	    int i_245_ = class525_sub38_sub2.readUnsignedShort((byte) 117);
	    if (65535 == i_245_)
		i_245_ = -1;
	    int i_246_ = class525_sub38_sub2.readUnsignedByte(1763185898);
	    Class40_Sub20.aClass217_11050.method4054(i_245_, i_246_,
						     564519426);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4587 == class96.aClass416_1172) {
	    int i_247_ = class525_sub38_sub2.readUnsignedShort((byte) 64);
	    if (i_247_ == 65535)
		i_247_ = -1;
	    int i_248_ = class525_sub38_sub2.readUnsignedByte(401352795);
	    int i_249_ = class525_sub38_sub2.readUnsignedShort((byte) 19);
	    int i_250_ = class525_sub38_sub2.readUnsignedByte(1937897011);
	    Class40_Sub20.aClass217_11050.method4047
		(Class204.aClass204_2226, i_247_, i_248_, i_250_,
		 Class208.aClass208_2252.method3907((short) 14636),
		 Class195.aClass195_2177, 0.0F, 0.0F, null, 0, 256, i_249_,
		 2131288035);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4572 == class96.aClass416_1172) {
	    int i_251_ = class525_sub38_sub2.method16624(70344073);
	    int i_252_ = class525_sub38_sub2.readUnsignedByte(1715400652);
	    if (i_252_ == 255) {
		i_252_ = -1;
		i_251_ = -1;
	    }
	    Class580.method9616(i_252_, i_251_, -574195907);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4615 == class96.aClass416_1172) {
	    int i_253_ = class525_sub38_sub2.method16678((byte) 42);
	    int i_254_ = class525_sub38_sub2.method16679((byte) 27);
	    int i_255_ = i_254_ >> 28 & 0x3;
	    int i_256_ = i_254_ >> 14 & 0x3fff;
	    int i_257_ = i_254_ & 0x3fff;
	    int i_258_ = class525_sub38_sub2.method16607(-1571461918);
	    int i_259_ = class525_sub38_sub2.method16660(408810849);
	    int i_260_ = i_259_ >> 2;
	    int i_261_ = i_259_ & 0x3;
	    int i_262_ = client.anIntArray11143[i_260_];
	    Class600 class600 = client.aClass507_11137.method8350(-2081283679);
	    i_256_ -= class600.anInt7858 * -1227002079;
	    i_257_ -= 1429253007 * class600.anInt7860;
	    Class590.method9793(i_255_, i_256_, i_257_, i_262_, i_260_, i_261_,
				i_253_, i_258_, 1252297869);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4533 == class96.aClass416_1172) {
	    Class381.method6412(-902480937 * client.aClass507_11137.anInt5647,
				(byte) 32);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4566) {
	    String string = class525_sub38_sub2.readString((byte) 0);
	    int i_263_ = class525_sub38_sub2.readUnsignedShort((byte) 62);
	    int i_264_ = class525_sub38_sub2.readUnsignedShort((byte) 84);
	    int i_265_ = class525_sub38_sub2.readUnsignedShort((byte) 67);
	    Class15.aClass1_177.aString10 = string;
	    Class15.aClass1_177.anInt11 = i_263_ * 172198755;
	    Class15.aClass1_177.anInt12 = -1194767071 * i_264_;
	    Class15.aClass1_177.anInt9 = -686040367 * i_265_;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4500) {
	    int i_266_ = class525_sub38_sub2.method16677(-1010097106);
	    int i_267_ = class525_sub38_sub2.method16679((byte) -82);
	    Class242.method4448((byte) -27);
	    Class394.method6519(i_266_, i_267_, -1440386737);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4581) {
	    if (Class34.method960(client.anInt11075 * 1777895575, (byte) 23))
		client.anInt11257
		    = (int) ((float) class525_sub38_sub2.readUnsignedShort((byte) 75)
			     * 2.5F) * 1965613579;
	    else
		client.anInt11257
		    = class525_sub38_sub2.readUnsignedShort((byte) 63) * -1161134774;
	    client.anInt11309 = -1428085261 * client.anInt11162;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4614) {
	    client.anInt11056 = -1196978197 * client.anInt11162;
	    boolean bool = class525_sub38_sub2.readUnsignedByte(809010523) == 1;
	    Class345 class345 = new Class345(class525_sub38_sub2);
	    Class353 class353;
	    if (bool)
		class353 = Class473.aClass353_5161;
	    else
		class353 = Class193.aClass353_2150;
	    class345.method6049(class353, 550501179);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4538) {
	    int i_268_ = class525_sub38_sub2.method16668((byte) 8);
	    int i_269_ = class525_sub38_sub2.method16677(-1148059080);
	    Class242.method4448((byte) -69);
	    Class630.method10312(i_268_, i_269_, 1759666505);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4546) {
	    int i_270_ = class525_sub38_sub2.readUnsignedShort((byte) 5);
	    if (i_270_ == 65535)
		i_270_ = -1;
	    int i_271_ = class525_sub38_sub2.readUnsignedByte(232147808);
	    int i_272_ = class525_sub38_sub2.readUnsignedShort((byte) 34);
	    int i_273_ = class525_sub38_sub2.readUnsignedByte(2110716296);
	    int i_274_ = class525_sub38_sub2.readUnsignedShort((byte) 108);
	    int i_275_ = class525_sub38_sub2.readUnsignedShort((byte) 87);
	    Class488 class488
		= (Class40_Sub20.aClass217_11050.method4046
		   (Class204.aClass204_2226, Class40_Sub20.aClass217_11050,
		    i_270_, i_271_, i_273_,
		    Class208.aClass208_2250.method3907((short) -17492),
		    Class195.aClass195_2177, 0.0F, 0.0F, null, 0, i_274_,
		    false, 2104443240));
	    if (null != class488)
		Class40_Sub20.aClass217_11050.method4095(class488, i_275_,
							 i_272_, (byte) 106);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4517 == class96.aClass416_1172) {
	    client.anInt11108 = client.anInt11162 * 613333527;
	    boolean bool = class525_sub38_sub2.readUnsignedByte(1778676497) == 1;
	    if (class96.anInt1173 * -1101265009 == 1) {
		if (bool)
		    Class404.aClass525_Sub25_4148 = null;
		else
		    Class303.aClass525_Sub25_3406 = null;
		class96.aClass416_1172 = null;
		return true;
	    }
	    if (bool)
		Class404.aClass525_Sub25_4148
		    = new Class525_Sub25(class525_sub38_sub2);
	    else
		Class303.aClass525_Sub25_3406
		    = new Class525_Sub25(class525_sub38_sub2);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4571 == class96.aClass416_1172) {
	    int i_276_ = class525_sub38_sub2.method16680(-681315409);
	    int i_277_ = class525_sub38_sub2.readUnsignedByte(1635616154);
	    int i_278_ = class525_sub38_sub2.method16607(-1571461918);
	    int i_279_ = class525_sub38_sub2.method16624(828288642);
	    int i_280_ = class525_sub38_sub2.method16624(-1171836111);
	    Class242.method4448((byte) -109);
	    client.aBoolArray11343[i_279_] = true;
	    client.anIntArray11344[i_279_] = i_280_;
	    client.anIntArray11345[i_279_] = i_278_;
	    client.anIntArray11346[i_279_] = i_277_;
	    client.anIntArray11088[i_279_] = i_276_;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4583 == class96.aClass416_1172) {
	    int i_281_ = class525_sub38_sub2.method16668((byte) -62);
	    int i_282_ = class525_sub38_sub2.method16679((byte) -43);
	    int i_283_ = class525_sub38_sub2.method16680(-1272696276);
	    int i_284_ = class525_sub38_sub2.readUnsignedShort((byte) 47);
	    Class242.method4448((byte) -11);
	    Class70.method1521(i_282_, i_284_, i_281_, i_283_, 506783613);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4425) {
	    boolean bool = class525_sub38_sub2.readUnsignedByte(1671083867) == 1;
	    byte[] is = new byte[-1101265009 * class96.anInt1173 - 1];
	    class525_sub38_sub2.readBytes(is, 0,
					    (class96.anInt1173 * -1101265009
					     - 1),
					    631825928);
	    Class547.method9103(bool, is, -1787706109);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4578) {
	    int i_285_ = class525_sub38_sub2.method16677(-1041985361);
	    if (i_285_ != -527467203 * Class113.anInt1391) {
		Class113.anInt1391 = i_285_ * 1858421269;
		Class396.method6536(Class578.aClass578_7671, -1, -1,
				    1964596281);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4456 == class96.aClass416_1172) {
	    int i_286_ = class525_sub38_sub2.readUnsignedShort((byte) 9);
	    if (65535 == i_286_)
		i_286_ = -1;
	    int i_287_ = class525_sub38_sub2.readUnsignedByte(29478301);
	    int i_288_ = class525_sub38_sub2.readUnsignedShort((byte) 110);
	    int i_289_ = class525_sub38_sub2.readUnsignedByte(520395984);
	    int i_290_ = class525_sub38_sub2.readUnsignedShort((byte) 7);
	    Class40_Sub20.aClass217_11050.method4047
		(Class204.aClass204_2226, i_286_, i_287_, i_289_,
		 Class208.aClass208_2250.method3907((short) -4891),
		 Class195.aClass195_2177, 0.0F, 0.0F, null, 0, i_290_, i_288_,
		 2129148552);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4603 == class96.aClass416_1172) {
	    int i_291_ = class525_sub38_sub2.method16680(-527942700);
	    int i_292_ = class525_sub38_sub2.method16624(1056991305);
	    int[] is = new int[4];
	    for (int i_293_ = 0; i_293_ < 4; i_293_++)
		is[i_293_] = class525_sub38_sub2.method16679((byte) -25);
	    Class525_Sub19 class525_sub19
		= ((Class525_Sub19)
		   client.aClass10_11121.method684((long) i_291_));
	    if (class525_sub19 != null)
		Class453_Sub2.method15917(((Class656_Sub1_Sub3_Sub1)
					   class525_sub19.anObject10571),
					  is, i_292_, true, 273653443);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4507) {
	    int i_294_ = class525_sub38_sub2.readUnsignedByte(1084214404);
	    Class705 class705
		= ((Class705)
		   Class539.method8888(Class417.method6722((byte) 36), i_294_,
				       1741051414));
	    if (class705 == null)
		class705 = Class705.aClass705_8795;
	    Class688.method14017(class705, 1085333085);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4553 == class96.aClass416_1172) {
	    int i_295_ = class525_sub38_sub2.method16667(107751592);
	    int i_296_ = class525_sub38_sub2.readSmart((byte) 2);
	    int i_297_ = class525_sub38_sub2.method16678((byte) 64);
	    int i_298_ = class525_sub38_sub2.readUnsignedByte(951427714);
	    Class525_Sub19 class525_sub19
		= ((Class525_Sub19)
		   client.aClass10_11121.method684((long) i_295_));
	    if (null != class525_sub19) {
		Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		    = ((Class656_Sub1_Sub3_Sub1_Sub2)
		       class525_sub19.anObject10571);
		if (null == class656_sub1_sub3_sub1_sub2.aClass310_12262)
		    class656_sub1_sub3_sub1_sub2.aClass310_12262
			= new Class310(class656_sub1_sub3_sub1_sub2
				       .aClass299_12255);
		class656_sub1_sub3_sub1_sub2.aClass310_12262.anIntArray3466
		    [i_298_]
		    = i_297_;
		class656_sub1_sub3_sub1_sub2.aClass310_12262
		    .aShortArray3467[i_298_]
		    = (short) i_296_;
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4525) {
	    int i_299_ = class525_sub38_sub2.readUnsignedByte(1364590052);
	    Class91.aClass629_903.method10290(i_299_, -537550172);
	    int i_300_ = class525_sub38_sub2.method16624(1489315636);
	    int i_301_ = class525_sub38_sub2.readInt(1543516433);
	    Class532.aClass111_7170.aClass624Array1373[i_299_]
		.method10224(i_301_, (byte) 0);
	    Class532.aClass111_7170.aClass624Array1373[i_299_]
		.method10221(i_300_, -1619837145);
	    client.anIntArray11295
		[(client.anInt11296 += 1575254931) * 630905499 - 1 & 0x3f]
		= i_299_;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4519) {
	    int i_302_ = class525_sub38_sub2.readSmart((byte) 18);
	    int i_303_ = class525_sub38_sub2.readUnsignedShort((byte) 95);
	    int i_304_ = class525_sub38_sub2.readUnsignedShort((byte) 44);
	    int i_305_ = class525_sub38_sub2.method16680(-1415917548);
	    int i_306_ = class525_sub38_sub2.readUnsignedByte(2036296302);
	    if (i_306_ == 255)
		i_306_ = -1;
	    int i_307_ = class525_sub38_sub2.readUnsignedByte(88424473);
	    int i_308_ = class525_sub38_sub2.method16662(-880411526);
	    int i_309_ = class525_sub38_sub2.method16607(-1571461918);
	    int i_310_ = class525_sub38_sub2.readUnsignedShort((byte) 57);
	    int i_311_ = class525_sub38_sub2.method16663((byte) 78);
	    int i_312_ = class525_sub38_sub2.method16667(1596858064);
	    int i_313_ = class525_sub38_sub2.readUnsignedShort((byte) 67);
	    int i_314_ = class525_sub38_sub2.readUnsignedByte(165686898) * 4;
	    int i_315_ = class525_sub38_sub2.readSmart((byte) -15);
	    boolean bool = 0 != (i_309_ & 0x1);
	    boolean bool_316_ = 0 != (i_309_ & 0x2);
	    int i_317_ = bool_316_ ? i_309_ >> 2 : -1;
	    if (bool_316_)
		i_307_ = (byte) i_307_;
	    else
		i_307_ *= 4;
	    Class600 class600 = client.aClass507_11137.method8350(106203065);
	    int i_318_ = i_303_ - class600.anInt7858 * 1840963138;
	    int i_319_ = i_304_ - -1436461282 * class600.anInt7860;
	    i_311_ += i_318_;
	    i_308_ += i_319_;
	    if (i_318_ >= 0 && i_319_ >= 0
		&& i_318_ < client.aClass507_11137.method8412(779345648) * 2
		&& i_319_ < client.aClass507_11137.method8412(57997140) * 2
		&& i_311_ >= 0 && i_308_ >= 0
		&& i_311_ < client.aClass507_11137.method8352((byte) -95) * 2
		&& i_308_ < client.aClass507_11137.method8352((byte) -7) * 2
		&& 65535 != i_310_) {
		i_318_ = 256 * i_318_;
		i_319_ *= 256;
		i_311_ = 256 * i_311_;
		i_308_ *= 256;
		i_307_ <<= 2;
		i_314_ <<= 2;
		i_312_ <<= 2;
		Class314_Sub2.method15761(i_310_, i_315_, i_302_, i_317_,
					  i_307_, i_314_, i_318_, i_319_,
					  i_311_, i_308_, i_313_, i_305_,
					  i_306_, i_312_, bool, 0, (byte) -20);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4582) {
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4465 == class96.aClass416_1172) {
	    int i_320_ = class525_sub38_sub2.method16678((byte) 34);
	    int i_321_ = class525_sub38_sub2.readInt(910577036);
	    int i_322_ = class525_sub38_sub2.method16668((byte) 16);
	    Class242.method4448((byte) -61);
	    Class701.method14270(i_320_, 5, i_322_, i_321_, -2055154364);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4613 == class96.aClass416_1172) {
	    Class242.method4448((byte) -15);
	    Class453.method7359((byte) -31);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4495) {
	    client.anInt11108 = client.anInt11162 * 613333527;
	    boolean bool = class525_sub38_sub2.readUnsignedByte(543799855) == 1;
	    Class340 class340 = new Class340(class525_sub38_sub2);
	    Class525_Sub25 class525_sub25;
	    if (bool)
		class525_sub25 = Class404.aClass525_Sub25_4148;
	    else
		class525_sub25 = Class303.aClass525_Sub25_3406;
	    class340.method5982(class525_sub25, 788884354);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4496 == class96.aClass416_1172) {
	    while (-1133521593 * class525_sub38_sub2.index
		   < class96.anInt1173 * -1101265009) {
		int i_323_ = class525_sub38_sub2.readUnsignedByte(1917965086);
		boolean bool = (i_323_ & 0x1) == 1;
		String string = class525_sub38_sub2.readString((byte) -2);
		String string_324_
		    = class525_sub38_sub2.readString((byte) 49);
		String string_325_ = class525_sub38_sub2.readString((byte) 8);
		for (int i_326_ = 0; i_326_ < client.anInt11366 * -651611127;
		     i_326_++) {
		    Class31 class31 = client.aClass31Array11368[i_326_];
		    if (bool) {
			if (string_324_.equals(class31.aString300)) {
			    class31.aString300 = string;
			    class31.aString301 = string_324_;
			    string = null;
			    break;
			}
		    } else if (string.equals(class31.aString300)) {
			class31.aString300 = string;
			class31.aString301 = string_324_;
			class31.aString302 = string_325_;
			string = null;
			break;
		    }
		}
		if (string != null && client.anInt11366 * -651611127 < 400) {
		    Class31 class31 = new Class31();
		    client.aClass31Array11368[-651611127 * client.anInt11366]
			= class31;
		    class31.aString300 = string;
		    class31.aString301 = string_324_;
		    class31.aString302 = string_325_;
		    class31.aBool303 = (i_323_ & 0x2) == 2;
		    client.anInt11366 += -1244227015;
		}
	    }
	    client.anInt11304 = 1928320841 * client.anInt11162;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4520 == class96.aClass416_1172) {
	    int i_327_ = class525_sub38_sub2.readInt(1237862059);
	    int i_328_ = class525_sub38_sub2.readInt(979746337);
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4275,
				    class96.aClass6_1169, 1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16605(i_327_,
								  -89434501);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16676(i_328_,
								  -1133521593);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16735(client.anInt5567 * -300823033, -1764472943);
	    class96.method1794(class525_sub15, (short) 24370);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4443) {
	    if (!client.aBool11376) {
		try {
		    int i_329_ = class525_sub38_sub2.method16624(-1480031877);
		    int i_330_ = class525_sub38_sub2.method16624(395558606);
		    client.aClass229_11119.method4356(i_330_, 2056730033)
			.method3960(i_329_, 31744000);
		} catch (RuntimeException runtimeexception) {
		    Class525_Sub16_Sub13.method18448(null, runtimeexception,
						     (byte) 101);
		    Class671.method11046(class96, (byte) 7);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4515 == class96.aClass416_1172) {
	    if (!client.aBool11376) {
		try {
		    int i_331_ = class525_sub38_sub2.method16607(-1571461918);
		    int i_332_ = class525_sub38_sub2.readUnsignedByte(1373665664);
		    client.aClass229_11119.method4356(i_332_, 2140116013)
			.method3963(i_331_, 885679824);
		} catch (RuntimeException runtimeexception) {
		    Class525_Sub16_Sub13.method18448(null, runtimeexception,
						     (byte) 82);
		    Class671.method11046(class96, (byte) 7);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4590 == class96.aClass416_1172) {
	    int i_333_ = class525_sub38_sub2.readUnsignedByte(1641912019);
	    int i_334_ = class525_sub38_sub2.readUnsignedByte(310248366);
	    if (class525_sub38_sub2.readUnsignedByte(1748110274) == 0)
		client.aClass486ArrayArray11128[i_333_][i_334_]
		    = new Class486();
	    else {
		class525_sub38_sub2.index -= 339428471;
		client.aClass486ArrayArray11128[i_333_][i_334_]
		    = new Class486(class525_sub38_sub2, null);
	    }
	    client.anInt11308 = client.anInt11162 * 29936215;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4447 == class96.aClass416_1172) {
	    int i_335_ = class525_sub38_sub2.method16680(-461299188);
	    if (i_335_ == 65535)
		i_335_ = -1;
	    int i_336_ = class525_sub38_sub2.method16680(-1269505247);
	    if (i_336_ == 65535)
		i_336_ = -1;
	    int i_337_ = class525_sub38_sub2.method16677(436915639);
	    int i_338_ = class525_sub38_sub2.method16677(113669634);
	    Class242.method4448((byte) -47);
	    for (int i_339_ = i_335_; i_339_ <= i_336_; i_339_++) {
		long l = (long) i_339_ + ((long) i_338_ << 32);
		Class525_Sub8 class525_sub8
		    = (Class525_Sub8) client.aClass10_11314.method684(l);
		Class525_Sub8 class525_sub8_340_;
		if (class525_sub8 == null) {
		    if (i_339_ == -1)
			class525_sub8_340_
			    = new Class525_Sub8(i_337_,
						(Class43.method1069
						 (i_338_, -695254952)
						 .aClass525_Sub8_2745
						 .anInt10489) * -997142025);
		    else
			class525_sub8_340_ = new Class525_Sub8(i_337_, -1);
		} else {
		    class525_sub8_340_
			= new Class525_Sub8(i_337_,
					    (-997142025
					     * class525_sub8.anInt10489));
		    class525_sub8.method8755(-1933461091);
		}
		client.aClass10_11314.method695(class525_sub8_340_, l);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4499) {
	    Class412.method6677(Class406.aClass406_4165, (byte) 9);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4591) {
	    Class412.method6677(Class406.aClass406_4155, (byte) -9);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4528) {
	    Class212.aClass144_2271
		= new Class144(Class711.aClass106_Sub1_Sub2_8869);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4521 == class96.aClass416_1172) {
	    Class453_Sub3.aClass309_Sub1_10316.method15750(class525_sub38_sub2,
							   (-1101265009
							    * (class96
							       .anInt1173)),
							   1406290578);
	    client.anInt11312 = client.anInt11162 * 652744923;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4559 == class96.aClass416_1172) {
	    client.anInt11071
		= class525_sub38_sub2.readSmart((byte) -40) * 1184633461;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4483) {
	    Class412.method6677(Class406.aClass406_4156, (byte) 54);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4529 == class96.aClass416_1172) {
	    int i_341_ = class525_sub38_sub2.readUnsignedShort((byte) 42);
	    int i_342_ = class525_sub38_sub2.readUnsignedShort((byte) 61);
	    Class40_Sub20.aClass217_11050.method4043(i_341_, i_342_,
						     -16711936);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4431 == class96.aClass416_1172) {
	    int i_343_ = class525_sub38_sub2.method16679((byte) -8);
	    int i_344_ = class525_sub38_sub2.method16668((byte) 77);
	    int i_345_ = class525_sub38_sub2.readUnsignedShort((byte) 8);
	    int i_346_ = class525_sub38_sub2.method16668((byte) -29);
	    Class242.method4448((byte) -58);
	    Class701.method14270(i_343_, 7, i_344_ << 16 | i_346_, i_345_,
				 498871993);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4511 == class96.aClass416_1172) {
	    int i_347_ = class525_sub38_sub2.readUnsignedShort((byte) 77);
	    int i_348_ = class525_sub38_sub2.readUnsignedByte(2081827923);
	    boolean bool = (i_348_ & 0x1) != 0;
	    boolean bool_349_ = 0 != (i_348_ & 0x2);
	    Class168_Sub1.method14614(i_347_, bool, 1816175695);
	    int i_350_ = class525_sub38_sub2.readUnsignedShort((byte) 66);
	    for (int i_351_ = 0; i_351_ < i_350_; i_351_++) {
		int i_352_ = class525_sub38_sub2.readUnsignedShort((byte) 2);
		int i_353_ = class525_sub38_sub2.readUnsignedByte(1587828711);
		if (i_353_ == 255)
		    i_353_ = class525_sub38_sub2.readInt(1473464279);
		Class9 class9 = null;
		if (bool_349_) {
		    int i_354_ = class525_sub38_sub2.readUnsignedByte(1770419215);
		    if (i_354_ > 0) {
			class9 = new Class9(Class234.aClass106_Sub1_Sub2_2373);
			while (i_354_-- > 0) {
			    Class447 class447
				= (Class234.aClass106_Sub1_Sub2_2373
				       .method14515
				   (class525_sub38_sub2, (byte) -1));
			    class9.method18(-316828413 * class447.anInt4898,
					    class447.anObject4899, (byte) 0);
			}
		    }
		}
		Class442.method7126(i_347_, i_351_, i_352_ - 1, i_353_, class9,
				    bool, (byte) 44);
	    }
	    client.anIntArray11238
		[(client.anInt11294 += 1294910553) * 1777091561 - 1 & 0x3f]
		= i_347_;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4449) {
	    client.anInt11310 = client.anInt11162 * -1365349593;
	    Class221 class221 = new Class221(class525_sub38_sub2,
					     client.anInterface27_11120);
	    class221.method4209(Class182_Sub2.aClass228_9503, 257187785);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4550 == class96.aClass416_1172) {
	    if (!client.aBool11376) {
		try {
		    byte i_355_ = class525_sub38_sub2.method16663((byte) 118);
		    int i_356_ = class525_sub38_sub2.readInt(1324017314);
		    int i_357_ = class525_sub38_sub2.method16607(-1571461918);
		    client.aClass229_11119.method4356(i_357_, 2057929256)
			.method3953(i_356_, i_355_, 252976751);
		} catch (RuntimeException runtimeexception) {
		    Class525_Sub16_Sub13.method18448(null, runtimeexception,
						     (byte) 120);
		    Class671.method11046(class96, (byte) 7);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4579) {
	    if (!client.aBool11376) {
		try {
		    int i_358_ = class525_sub38_sub2.method16660(1516785348);
		    int i_359_ = class525_sub38_sub2.method16624(-1179649960);
		    int i_360_ = class525_sub38_sub2.method16660(1954105172);
		    client.aClass229_11119.method4356(i_358_, 2144851436)
			.method3962(i_359_, i_360_, 2048112566);
		} catch (RuntimeException runtimeexception) {
		    Class525_Sub16_Sub13.method18448(null, runtimeexception,
						     (byte) 41);
		    Class671.method11046(class96, (byte) 7);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4473) {
	    boolean bool = class525_sub38_sub2.readUnsignedByte(1247792494) == 1;
	    String string = class525_sub38_sub2.readString((byte) 8);
	    long l = (long) class525_sub38_sub2.readUnsignedShort((byte) 111);
	    long l_361_ = (long) class525_sub38_sub2.method16834(-1994884458);
	    Class411 class411
		= ((Class411)
		   Class539.method8888(Class411.method6672(-2073143159),
				       class525_sub38_sub2
					   .readUnsignedByte(155145534),
				       1449276660));
	    int i_362_ = class525_sub38_sub2.readUnsignedShort((byte) 71);
	    long l_363_ = (l << 32) + l_361_;
	    boolean bool_364_ = false;
	    Object object = null;
	    Class525_Sub25 class525_sub25
		= (bool ? Class404.aClass525_Sub25_4148
		   : Class303.aClass525_Sub25_3406);
	while_136_:
	    do {
		if (class525_sub25 == null)
		    bool_364_ = true;
		else {
		    for (int i_365_ = 0; i_365_ < 100; i_365_++) {
			if (client.aLongArray11335[i_365_] == l_363_) {
			    bool_364_ = true;
			    break while_136_;
			}
		    }
		    if (class411.aBool4252
			&& Class450.method7330(string, -1745348191))
			bool_364_ = true;
		}
	    } while (false);
	    if (!bool_364_) {
		client.aLongArray11335[client.anInt11336 * 1397979293]
		    = l_363_;
		client.anInt11336
		    = (1397979293 * client.anInt11336 + 1) % 100 * -870396491;
		String string_366_
		    = Class215.aClass58_2283.method1220(i_362_, 797864)
			  .method18423(class525_sub38_sub2, -2035418197);
		int i_367_ = bool ? 42 : 45;
		if (class411.anInt4251 * -569278595 != -1)
		    Class627.method10275
			(i_367_, 0,
			 new StringBuilder().append
			     (Class501.method8197((class411.anInt4251
						   * -569278595),
						  -482921139))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class501.method8197((class411.anInt4251
						   * -569278595),
						  1760627396))
			     .append
			     (string).toString(),
			 string, string_366_, class525_sub25.aString10605,
			 i_362_, class411, (byte) 0);
		else
		    Class627.method10275(i_367_, 0, string, string, string,
					 string_366_,
					 class525_sub25.aString10605, i_362_,
					 class411, (byte) 0);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4593) {
	    int i_368_ = class525_sub38_sub2.method16677(-1308747491);
	    int i_369_ = class525_sub38_sub2.readUnsignedShort((byte) 39);
	    int i_370_ = class525_sub38_sub2.method16679((byte) -23);
	    Class242.method4448((byte) -120);
	    Class701.method14270(i_370_, 3, i_369_, i_368_, 1981858590);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4532 == class96.aClass416_1172) {
	    byte i_371_ = class525_sub38_sub2.readByte(-1150098071);
	    Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
		.method18926(class525_sub38_sub2, i_371_, 459575570);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4545 == class96.aClass416_1172) {
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4485) {
	    Class242.method4448((byte) -15);
	    Class202.method3853(Class152_Sub1.method14533(-561019135),
				(byte) 48);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4502) {
	    Class236.anInt2391 = (class525_sub38_sub2.method16739(907094016)
				  << 3) * -1152187739;
	    Class515.anInt5723 = (class525_sub38_sub2.readByte(-1150098071)
				  << 3) * -212210859;
	    TextureMetrics.anInt1836
		= class525_sub38_sub2.method16624(-774382356) * 1493786273;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4458) {
	    Class260.method4762(class525_sub38_sub2.readString((byte) -16),
				533792623);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4468) {
	    int i_372_ = class525_sub38_sub2.method16677(283396380);
	    int i_373_ = class525_sub38_sub2.method16679((byte) 1);
	    Class242.method4448((byte) -34);
	    Class259 class259 = Class43.method1069(i_373_, -695254952);
	    class259.anInt2751 = i_372_ * 1754064075;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4478 == class96.aClass416_1172) {
	    String string = class525_sub38_sub2.readString((byte) -85);
	    int i_374_ = class525_sub38_sub2.readUnsignedShort((byte) 105);
	    Class242.method4448((byte) -116);
	    Class637.method10517(i_374_, string, 34359198);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4597) {
	    int i_375_ = class525_sub38_sub2.method16679((byte) -11);
	    int i_376_ = class525_sub38_sub2.method16679((byte) 62);
	    Class242.method4448((byte) -5);
	    Class701.method14270(i_375_, 2, i_376_, -1, -1801324613);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4469 == class96.aClass416_1172) {
	    client.anInt11332
		= class525_sub38_sub2.method16660(71629019) * -1624165049;
	    client.anInt11200
		= class525_sub38_sub2.method16660(99276197) * -1582263689;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4547) {
	    Class83.method1606(class525_sub38_sub2,
			       -1101265009 * class96.anInt1173, 1664917328);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4606 == class96.aClass416_1172) {
	    Class40_Sub20.aClass217_11050.method4038
		(Class208.aClass208_2252.method3907((short) 10352),
		 (byte) -39);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4487) {
	    int i_377_ = class525_sub38_sub2.method16667(201950477);
	    byte i_378_ = class525_sub38_sub2.method16739(907094016);
	    Class242.method4448((byte) -98);
	    Class531_Sub2.method15935(i_377_, i_378_, 540943722);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4562) {
	    class96.aClass416_1172 = null;
	    return false;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4510) {
	    client.aClass621_11236
		= ((Class621)
		   Class539.method8888(Class621.method10185(380893400),
				       class525_sub38_sub2
					   .method16607(-1571461918),
				       -1124885654));
	    if (null == client.aClass621_11236)
		client.aClass621_11236 = Class621.aClass621_8087;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4530) {
	    int i_379_ = class525_sub38_sub2.readInt(1984845245);
	    int i_380_ = class525_sub38_sub2.method16624(-587521347);
	    i_380_ = -i_380_ - 2;
	    Class242.method4448((byte) -2);
	    Class701.method14270(i_379_, 5, i_380_, 0, -2039289152);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4523) {
	    int i_381_ = class525_sub38_sub2.method16678((byte) 52);
	    Class242.method4448((byte) -56);
	    Class701.method14270(i_381_, 5, 615376671 * client.anInt11053, 0,
				 -1416059037);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4561) {
	    Class98.anInt1205
		= class525_sub38_sub2.readUnsignedByte(910520623) * -1414568661;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4596 == class96.aClass416_1172) {
	    int i_382_ = class525_sub38_sub2.method16679((byte) 44);
	    int i_383_ = class525_sub38_sub2.method16668((byte) 38);
	    Class242.method4448((byte) -50);
	    Class225.method4254(i_382_, i_383_, (byte) -37);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4551) {
	    int i_384_ = class525_sub38_sub2.readUnsignedShort((byte) 37);
	    client.anInt11147 = -1429589879;
	    client.anInt11280 = i_384_ * -1550521413;
	    client.anInt11145 = 0;
	    Class656_Sub1_Sub3_Sub3.idx_35
		.method7506(1278550387 * client.anInt11280, 2034640278);
	    Class219.method4200((byte) 21);
	    Class272.method5024((byte) 43);
	    int i_385_ = class525_sub38_sub2.readUnsignedShort((byte) 90);
	    client.anInt11326 = -1061651327 * i_385_;
	    int i_386_ = class525_sub38_sub2.readUnsignedByte(427022017);
	    Class569.aClass525_Sub38_7628 = new RSBuffer(i_386_);
	    Class569.aClass525_Sub38_7628.method16614
		(class525_sub38_sub2.buffer,
		 class525_sub38_sub2.index * -1133521593, i_386_,
		 1204062772);
	    class525_sub38_sub2.index += i_386_ * 339428471;
	    class96.aClass416_1172 = null;
	    return false;
	}
	if (Class416.aClass416_4466 == class96.aClass416_1172) {
	    int i_387_ = class525_sub38_sub2.readUnsignedShort((byte) 74);
	    int i_388_ = class525_sub38_sub2.method16680(-1835859993);
	    if (i_388_ == 65535)
		i_388_ = -1;
	    int i_389_ = class525_sub38_sub2.method16678((byte) -93);
	    int i_390_ = class525_sub38_sub2.method16680(-687393846);
	    if (i_390_ == 65535)
		i_390_ = -1;
	    Class242.method4448((byte) -46);
	    for (int i_391_ = i_390_; i_391_ <= i_388_; i_391_++) {
		long l = ((long) i_389_ << 32) + (long) i_391_;
		Class525_Sub8 class525_sub8
		    = (Class525_Sub8) client.aClass10_11314.method684(l);
		Class525_Sub8 class525_sub8_392_;
		if (class525_sub8 == null) {
		    if (-1 == i_391_)
			class525_sub8_392_
			    = new Class525_Sub8((Class43.method1069
						 (i_389_, -695254952)
						 .aClass525_Sub8_2745
						 .anInt10486) * 1228765885,
						i_387_);
		    else
			class525_sub8_392_ = new Class525_Sub8(0, i_387_);
		} else {
		    class525_sub8_392_
			= new Class525_Sub8((1228765885
					     * class525_sub8.anInt10486),
					    i_387_);
		    class525_sub8.method8755(-1933461091);
		}
		client.aClass10_11314.method695(class525_sub8_392_, l);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4594 == class96.aClass416_1172) {
	    Class645 class645 = new Class645();
	    boolean bool = class645.method10667(class525_sub38_sub2, 63443183);
	    client.aClass507_11137.method8361((byte) 14).method10384
		(client.aClass507_11137, bool ? class645 : null,
		 class645.method10641((byte) 52), (short) 255);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4461) {
	    client.anInt11056 = -1196978197 * client.anInt11162;
	    boolean bool = class525_sub38_sub2.readUnsignedByte(119687083) == 1;
	    if (-1101265009 * class96.anInt1173 == 1) {
		if (bool)
		    Class473.aClass353_5161 = null;
		else
		    Class193.aClass353_2150 = null;
		class96.aClass416_1172 = null;
		return true;
	    }
	    if (bool)
		Class473.aClass353_5161 = new Class353(class525_sub38_sub2);
	    else
		Class193.aClass353_2150 = new Class353(class525_sub38_sub2);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4558) {
	    int i_393_ = class525_sub38_sub2.readUnsignedShort((byte) 7);
	    String string = class525_sub38_sub2.readString((byte) -24);
	    int i_394_ = class525_sub38_sub2.readUnsignedShort((byte) 111);
	    int i_395_ = class525_sub38_sub2.readUnsignedShort((byte) 98);
	    boolean bool = class525_sub38_sub2.readUnsignedByte(45870496) == 1;
	    Class15.aClass1_181 = Class15.aClass1_173;
	    Class522.aBool7097 = bool;
	    Class480.method7823(i_393_, string, i_394_, i_395_, -1371366153);
	    Object object = null;
	    Class441.method7119(3, 495967577);
	    class96.aClass416_1172 = null;
	    return false;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4452) {
	    Class236.anInt2391 = (class525_sub38_sub2.method16662(-880411526)
				  << 3) * -1152187739;
	    Class515.anInt5723 = (class525_sub38_sub2.readByte(-1150098071)
				  << 3) * -212210859;
	    TextureMetrics.anInt1836
		= class525_sub38_sub2.readUnsignedByte(508040277) * 1493786273;
	    while (class525_sub38_sub2.index * -1133521593
		   < -1101265009 * class96.anInt1173) {
		Class406 class406
		    = (MagnetConfig.method2453(-1906205427)
		       [class525_sub38_sub2.readUnsignedByte(185799161)]);
		Class412.method6677(class406, (byte) 15);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4446 == class96.aClass416_1172) {
	    client.aClass229_11119.method4366(1290295383);
	    int i_396_ = class525_sub38_sub2.readUnsignedByte(2132427482);
	    for (int i_397_ = 0; i_397_ < i_396_; i_397_++) {
		int i_398_ = class525_sub38_sub2.readInt(1847206587);
		Class214 class214 = new Class214(i_398_);
		client.aClass229_11119.method4358(class214, 1058041561);
		int i_399_ = class525_sub38_sub2.readUnsignedByte(922351870);
		for (int i_400_ = 0; i_400_ < i_399_; i_400_++)
		    class214.method3955(class525_sub38_sub2
					    .readInt(1672485457),
					-1968446924);
		int i_401_ = class525_sub38_sub2.readUnsignedByte(464813842);
		for (int i_402_ = 0; i_402_ < i_401_; i_402_++)
		    class214.method3974(class525_sub38_sub2
					    .readInt(1985674533),
					-1424419780);
		for (int i_403_ = 0; i_403_ < i_399_; i_403_++) {
		    byte i_404_ = class525_sub38_sub2.readByte(-1150098071);
		    class214.method3951(i_403_, i_404_, -88643240);
		    for (int i_405_ = 0; i_405_ < i_401_; i_405_++) {
			if (class525_sub38_sub2.readUnsignedByte(921303536) == 0)
			    class214.method3964(i_403_, i_405_, null,
						617204670);
			else
			    class214.method3964
				(i_403_, i_405_,
				 Integer.valueOf(class525_sub38_sub2
						     .readInt(1264031575)),
				 617204670);
		    }
		}
	    }
	    client.aBool11376 = false;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4605 == class96.aClass416_1172) {
	    int i_406_ = class525_sub38_sub2.method16624(-1970713540);
	    int i_407_ = class525_sub38_sub2.method16677(850773777);
	    int i_408_ = class525_sub38_sub2.readUnsignedByte(499648189);
	    int i_409_ = class525_sub38_sub2.readUnsignedByte(634165413);
	    int i_410_ = class525_sub38_sub2.method16678((byte) 115);
	    int i_411_ = i_407_ >> 28;
	    int i_412_ = i_407_ >> 14 & 0x3fff;
	    int i_413_ = i_407_ & 0x3fff;
	    Class40_Sub20.aClass217_11050.method4089(i_410_, i_408_, true,
						     i_411_, i_412_ << 9,
						     i_413_ << 9, i_406_ << 9,
						     i_409_ << 9, 51922012);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4491 == class96.aClass416_1172) {
	    int i_414_ = class525_sub38_sub2.method16667(368676216);
	    byte i_415_ = class525_sub38_sub2.method16663((byte) 127);
	    Class242.method4448((byte) -117);
	    Class630.method10312(i_414_, i_415_, -10856166);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4563 == class96.aClass416_1172) {
	    Class532.aClass111_7170.aClass614_1374.method10062(1429253007);
	    client.anInt11274 += 1978748608;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4564 == class96.aClass416_1172) {
	    Class412.method6677(Class406.aClass406_4157, (byte) -14);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4437 == class96.aClass416_1172) {
	    for (int i_416_ = 0;
		 (i_416_
		  < client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384.length);
		 i_416_++) {
		if (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_416_]
		    != null) {
		    client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_416_]
			.anIntArray11985
			= null;
		    client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_416_]
			.aClass689_11987.method14068(-1, (byte) -86);
		}
	    }
	    for (int i_417_ = 0; i_417_ < client.anInt11276 * 1530572215;
		 i_417_++) {
		((Class656_Sub1_Sub3_Sub1)
		 client.aClass525_Sub19Array11122[i_417_].anObject10571)
		    .anIntArray11985
		    = null;
		((Class656_Sub1_Sub3_Sub1)
		 client.aClass525_Sub19Array11122[i_417_].anObject10571)
		    .aClass689_11987.method14068(-1, (byte) -58);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4464 == class96.aClass416_1172) {
	    if (!client.aBool11376) {
		try {
		    byte i_418_ = class525_sub38_sub2.method16739(907094016);
		    int i_419_ = class525_sub38_sub2.method16677(-1579545262);
		    client.aClass229_11119.method4368(new Class214(i_419_),
						      i_418_, (byte) 99);
		} catch (RuntimeException runtimeexception) {
		    Class525_Sub16_Sub13.method18448(null, runtimeexception,
						     (byte) 61);
		    Class671.method11046(class96, (byte) 7);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4462) {
	    int i_420_ = class525_sub38_sub2.readInt(1358416834);
	    boolean bool = class525_sub38_sub2.method16624(1539108527) == 1;
	    Class242.method4448((byte) -23);
	    Class206_Sub1.method15716(i_420_, bool, -2001720678);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4476) {
	    client.anInt11362 = 84494323;
	    client.anInt11304 = 1928320841 * client.anInt11162;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4494) {
	    int i_421_ = class525_sub38_sub2.readUnsignedShort((byte) 18);
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1;
	    if (i_421_ == 615376671 * client.anInt11053)
		class656_sub1_sub3_sub1_sub1
		    = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705;
	    else
		class656_sub1_sub3_sub1_sub1
		    = client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_421_];
	    if (class656_sub1_sub3_sub1_sub1 == null) {
		class96.aClass416_1172 = null;
		return true;
	    }
	    int i_422_ = class525_sub38_sub2.readUnsignedShort((byte) 101);
	    Class411 class411
		= ((Class411)
		   Class539.method8888(Class411.method6672(-2073143159),
				       class525_sub38_sub2
					   .readUnsignedByte(208166180),
				       644588287));
	    boolean bool = (i_422_ & 0x8000) != 0;
	    if (class656_sub1_sub3_sub1_sub1.aString12231 != null
		&& class656_sub1_sub3_sub1_sub1.aClass637_12246 != null) {
		boolean bool_423_ = false;
		if (class411.aBool4252) {
		    if (!bool && (client.aBool11233 && !client.aBool11266
				  || client.aBool11064))
			bool_423_ = true;
		    else if (Class450.method7330((class656_sub1_sub3_sub1_sub1
						  .aString12231),
						 -575481594))
			bool_423_ = true;
		}
		if (!bool_423_) {
		    int i_424_ = -1;
		    String string;
		    if (bool) {
			i_422_ &= 0x7fff;
			Class401 class401
			    = Class450.method7332(class525_sub38_sub2,
						  (byte) 50);
			i_424_ = class401.anInt4134 * -1275733157;
			string
			    = (class401.aClass525_Sub16_Sub11_4133.method18423
			       (class525_sub38_sub2, -1215602042));
		    } else
			string = (Class274.method5092
				  (Class223.method4241(class525_sub38_sub2,
						       (byte) 4),
				   -338381450));
		    class656_sub1_sub3_sub1_sub1.method18914(string.trim(),
							     i_422_ >> 8,
							     i_422_ & 0xff,
							     -848477660);
		    int i_425_;
		    if (class411.aBool4242)
			i_425_ = bool ? 17 : 1;
		    else
			i_425_ = bool ? 17 : 2;
		    if (class411.anInt4251 * -569278595 != -1)
			Class627.method10275
			    (i_425_, 0,
			     new StringBuilder().append
				 (Class501.method8197((class411.anInt4251
						       * -569278595),
						      238601897))
				 .append
				 (class656_sub1_sub3_sub1_sub1
				      .method18907(true, 1109442456))
				 .toString(),
			     new StringBuilder().append
				 (Class501.method8197((class411.anInt4251
						       * -569278595),
						      2009563230))
				 .append
				 (class656_sub1_sub3_sub1_sub1
				      .method18908(false, (byte) -85))
				 .toString(),
			     class656_sub1_sub3_sub1_sub1.aString12241, string,
			     null, i_424_, class411, (byte) 0);
		    else
			Class627.method10275
			    (i_425_, 0,
			     class656_sub1_sub3_sub1_sub1
				 .method18907(true, 1109442456),
			     class656_sub1_sub3_sub1_sub1
				 .method18908(false, (byte) -127),
			     class656_sub1_sub3_sub1_sub1.aString12241, string,
			     null, i_424_, class411, (byte) 0);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4570 == class96.aClass416_1172) {
	    Class412.method6677(Class406.aClass406_4164, (byte) 27);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4450 == class96.aClass416_1172) {
	    String string = class525_sub38_sub2.readString((byte) -76);
	    long l = (long) class525_sub38_sub2.readUnsignedShort((byte) 32);
	    long l_426_ = (long) class525_sub38_sub2.method16834(-1994884458);
	    Class411 class411
		= ((Class411)
		   Class539.method8888(Class411.method6672(-2073143159),
				       class525_sub38_sub2
					   .readUnsignedByte(980051155),
				       -1391011801));
	    boolean bool = class525_sub38_sub2.readUnsignedByte(973570044) == 1;
	    int i_427_ = class525_sub38_sub2.readUnsignedShort((byte) 65);
	    long l_428_ = l_426_ + (l << 32);
	    boolean bool_429_ = false;
	while_137_:
	    do {
		if (null == Class182_Sub2.aClass228_9503)
		    bool_429_ = true;
		else {
		    for (int i_430_ = 0; i_430_ < 100; i_430_++) {
			if (l_428_ == client.aLongArray11335[i_430_]) {
			    bool_429_ = true;
			    break while_137_;
			}
		    }
		    if (class411.aBool4252
			&& Class450.method7330(string, 1346632306))
			bool_429_ = true;
		}
	    } while (false);
	    if (!bool_429_) {
		client.aLongArray11335[client.anInt11336 * 1397979293]
		    = l_428_;
		client.anInt11336
		    = (client.anInt11336 * 1397979293 + 1) % 100 * -870396491;
		String string_431_
		    = Class215.aClass58_2283.method1220(i_427_, 797864)
			  .method18423(class525_sub38_sub2, 1503303074);
		int i_432_ = bool ? 23 : 25;
		if (-569278595 * class411.anInt4251 != -1)
		    Class627.method10275
			(i_432_, 0,
			 new StringBuilder().append
			     (Class501.method8197((-569278595
						   * class411.anInt4251),
						  2020635503))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class501.method8197((-569278595
						   * class411.anInt4251),
						  69679270))
			     .append
			     (string).toString(),
			 string, string_431_,
			 Class182_Sub2.aClass228_9503.method4276(-1911763130),
			 i_427_, class411, (byte) 0);
		else
		    Class627.method10275(i_432_, 0, string, string, string,
					 string_431_,
					 Class182_Sub2.aClass228_9503
					     .method4276(-1772221769),
					 i_427_, class411, (byte) 0);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4598 == class96.aClass416_1172) {
	    boolean bool = class525_sub38_sub2.readUnsignedByte(2123834564) == 1;
	    String string = class525_sub38_sub2.readString((byte) 7);
	    long l = (long) class525_sub38_sub2.readUnsignedShort((byte) 7);
	    long l_433_ = (long) class525_sub38_sub2.method16834(-1994884458);
	    Class411 class411
		= ((Class411)
		   Class539.method8888(Class411.method6672(-2073143159),
				       class525_sub38_sub2
					   .readUnsignedByte(1397163938),
				       1723268690));
	    long l_434_ = (l << 32) + l_433_;
	    boolean bool_435_ = false;
	    Object object = null;
	    Class525_Sub25 class525_sub25
		= (bool ? Class404.aClass525_Sub25_4148
		   : Class303.aClass525_Sub25_3406);
	while_138_:
	    do {
		if (class525_sub25 == null)
		    bool_435_ = true;
		else {
		    for (int i_436_ = 0; i_436_ < 100; i_436_++) {
			if (client.aLongArray11335[i_436_] == l_434_) {
			    bool_435_ = true;
			    break while_138_;
			}
		    }
		    if (class411.aBool4252) {
			if (client.aBool11233 && !client.aBool11266
			    || client.aBool11064)
			    bool_435_ = true;
			else if (Class450.method7330(string, 353260021))
			    bool_435_ = true;
		    }
		}
	    } while (false);
	    if (!bool_435_) {
		client.aLongArray11335[1397979293 * client.anInt11336]
		    = l_434_;
		client.anInt11336
		    = -870396491 * ((1397979293 * client.anInt11336 + 1)
				    % 100);
		String string_437_
		    = (Class274.method5092
		       (Class223.method4241(class525_sub38_sub2, (byte) 4),
			-37232320));
		int i_438_ = bool ? 41 : 44;
		if (-1 != -569278595 * class411.anInt4251)
		    Class627.method10275
			(i_438_, 0,
			 new StringBuilder().append
			     (Class501.method8197((class411.anInt4251
						   * -569278595),
						  -1091033574))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class501.method8197((class411.anInt4251
						   * -569278595),
						  592982352))
			     .append
			     (string).toString(),
			 string, string_437_, class525_sub25.aString10605, -1,
			 class411, (byte) 0);
		else
		    Class627.method10275(i_438_, 0, string, string, string,
					 string_437_,
					 class525_sub25.aString10605, -1,
					 class411, (byte) 0);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4513) {
	    if (!client.aBool11376) {
		try {
		    int i_439_ = class525_sub38_sub2.method16624(-676472259);
		    boolean bool
			= class525_sub38_sub2.method16624(1598266347) == 1;
		    int i_440_ = class525_sub38_sub2.readUnsignedByte(811447384);
		    client.aClass229_11119.method4356(i_440_, 2130584094)
			.method3950(i_439_, bool, 1712381035);
		} catch (RuntimeException runtimeexception) {
		    Class525_Sub16_Sub13.method18448(null, runtimeexception,
						     (byte) 72);
		    Class671.method11046(class96, (byte) 7);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4424) {
	    if (client.anInt11260 * -750203937 != -1)
		Textures.method3121(-750203937 * client.anInt11260, 0,
				    (byte) -101);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4427 == class96.aClass416_1172) {
	    boolean bool = class525_sub38_sub2.readUnsignedByte(339828866) == 1;
	    if (bool)
		Class202.method3853(5, (byte) -85);
	    else
		Class202.method3853(1, (byte) 78);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4568) {
	    String string = class525_sub38_sub2.readString((byte) 24);
	    Class410.method6666(string, false, false, (byte) 90);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4442) {
	    int i_441_ = class525_sub38_sub2.method16677(-89442672);
	    int i_442_ = class525_sub38_sub2.method16678((byte) -83);
	    int i_443_ = class525_sub38_sub2.method16624(-382659761);
	    int i_444_ = class525_sub38_sub2.readInt(1646995512);
	    int i_445_ = class525_sub38_sub2.method16678((byte) 66);
	    int i_446_ = class525_sub38_sub2.method16680(-314116166);
	    int i_447_ = class525_sub38_sub2.method16679((byte) -33);
	    Class242.method4448((byte) -33);
	    Class631.method10317(i_445_, new Class525_Sub33(i_446_, i_443_),
				 new int[] { i_444_, i_447_, i_442_, i_441_ },
				 false, 1525888548);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4481) {
	    int i_448_ = class525_sub38_sub2.readInt(1198135120);
	    Class50.aClass41_375 = new Class41(i_448_);
	    Thread thread = new Thread(Class50.aClass41_375);
	    thread.setPriority(1);
	    thread.start();
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4486 == class96.aClass416_1172) {
	    Class40_Sub20.aClass217_11050.method4022(501271953);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4477) {
	    int i_449_ = class525_sub38_sub2.method16679((byte) -38);
	    Class242.method4448((byte) -92);
	    Class701.method14270(i_449_, 3, 615376671 * client.anInt11053, 0,
				 -1747284552);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4524) {
	    int i_450_ = class525_sub38_sub2.readInt(920470315);
	    int i_451_ = class525_sub38_sub2.method16667(1114035716);
	    if (i_451_ == 65535)
		i_451_ = -1;
	    int i_452_ = class525_sub38_sub2.method16679((byte) 10);
	    Class242.method4448((byte) -81);
	    Class156.method2466(i_452_, i_451_, i_450_, (byte) -87);
	    ItemDefinitions class8 = (ItemDefinitions) Class313_Sub2.aClass40_Sub22_10106
					 .method76(i_451_, 1293235342);
	    Class70.method1521(i_452_, class8.anInt75 * -1891985835,
			       795105987 * class8.anInt81,
			       class8.anInt74 * -1048035637, 506783613);
	    Class51.method1139(i_452_, -905924017 * class8.anInt128,
			       -1874228003 * class8.anInt95,
			       968302009 * class8.anInt92, 1482219101);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4569) {
	    if (!client.aBool11376) {
		try {
		    int i_453_ = class525_sub38_sub2.method16624(-236093833);
		    int i_454_ = class525_sub38_sub2.method16624(-826167357);
		    int i_455_ = class525_sub38_sub2.method16660(557870780);
		    client.aClass229_11119.method4356(i_453_, 2121642981)
			.method4000(i_455_, i_454_, 1544332501);
		} catch (RuntimeException runtimeexception) {
		    Class525_Sub16_Sub13.method18448(null, runtimeexception,
						     (byte) 61);
		    Class671.method11046(class96, (byte) 7);
		}
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4565) {
	    int i_456_ = class525_sub38_sub2.method16679((byte) -22);
	    class525_sub38_sub2.method16624(1933400627);
	    int i_457_ = class525_sub38_sub2.readInt(1826529403);
	    int i_458_ = class525_sub38_sub2.method16679((byte) -101);
	    int i_459_ = class525_sub38_sub2.method16677(-1853653396);
	    int i_460_ = class525_sub38_sub2.method16667(1662700604);
	    Class242.method4448((byte) -13);
	    int[] is = { i_457_, i_458_, i_459_, i_456_ };
	    client.anInt11260 = i_460_ * -2101694433;
	    Class290.method5274(i_460_, is, (byte) -70);
	    Class198_Sub14.method15652(false, 62661928);
	    Class455_Sub1.method15987(client.anInt11260 * -750203937, is,
				      670355642);
	    for (int i_461_ = 0; i_461_ < 107; i_461_++)
		client.aBoolArray11320[i_461_] = true;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4460) {
	    int i_462_ = class525_sub38_sub2.readUnsignedShort((byte) 79);
	    Class40_Sub20.aClass217_11050.method4031(i_462_, -864352397);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4580 == class96.aClass416_1172) {
	    int i_463_ = class525_sub38_sub2.readUnsignedShort((byte) 112);
	    Class40_Sub20.aClass217_11050.method4098(i_463_, -1559514310);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4448 == class96.aClass416_1172) {
	    int i_464_ = class525_sub38_sub2.readUnsignedByte(1915592391);
	    i_464_ = -i_464_ - 2;
	    client.aMap11228.remove(Integer.valueOf(i_464_));
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4616) {
	    int i_465_ = class525_sub38_sub2.readUnsignedByte(1722215823);
	    Class242.method4448((byte) -88);
	    client.anInt11203 = i_465_ * -371828619;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4472) {
	    int i_466_ = class525_sub38_sub2.readInt(1826773304);
	    Class242.method4448((byte) -47);
	    if (i_466_ == -1) {
		Class198_Sub3.anInt9911 = 56698409;
		Class648.anInt8363 = -1945230309;
	    } else {
		Class600 class600
		    = client.aClass507_11137.method8350(-237198440);
		int i_467_ = i_466_ >> 14 & 0x3fff;
		int i_468_ = i_466_ & 0x3fff;
		i_467_ -= -1227002079 * class600.anInt7858;
		if (i_467_ < 0)
		    i_467_ = 0;
		else if (i_467_
			 >= client.aClass507_11137.method8412(1474158386))
		    i_467_ = client.aClass507_11137.method8412(1296119031);
		i_468_ -= class600.anInt7860 * 1429253007;
		if (i_468_ < 0)
		    i_468_ = 0;
		else if (i_468_
			 >= client.aClass507_11137.method8352((byte) -54))
		    i_468_ = client.aClass507_11137.method8352((byte) -125);
		Class198_Sub3.anInt9911 = (256 + (i_467_ << 9)) * -56698409;
		Class648.anInt8363 = (256 + (i_468_ << 9)) * 1945230309;
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4537 == class96.aClass416_1172) {
	    int i_469_ = class525_sub38_sub2.method16607(-1571461918);
	    int i_470_ = class525_sub38_sub2.method16680(-885388466);
	    boolean bool = 1 == (i_469_ & 0x1);
	    Class493.method8003(i_470_, bool, (byte) 3);
	    client.anIntArray11238
		[(client.anInt11294 += 1294910553) * 1777091561 - 1 & 0x3f]
		= i_470_;
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4534 == class96.aClass416_1172) {
	    int i_471_ = class525_sub38_sub2.method16680(-689970469);
	    if (65535 == i_471_)
		i_471_ = -1;
	    Class40_Sub20.aClass217_11050.method4048(i_471_, 255, (byte) -80);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4543 == class96.aClass416_1172) {
	    int i_472_ = class525_sub38_sub2.method16677(-493189541);
	    int i_473_ = class525_sub38_sub2.method16678((byte) -63);
	    Class242.method4448((byte) -75);
	    Class701.method14270(i_472_, 1, i_473_, -1, 517709305);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4430 == class96.aClass416_1172) {
	    boolean bool = class525_sub38_sub2.readUnsignedByte(944421152) == 1;
	    String string = class525_sub38_sub2.readString((byte) 16);
	    String string_474_ = string;
	    if (bool)
		string_474_ = class525_sub38_sub2.readString((byte) -7);
	    String string_475_ = class525_sub38_sub2.readString((byte) 87);
	    long l = (long) class525_sub38_sub2.readUnsignedShort((byte) 31);
	    long l_476_ = (long) class525_sub38_sub2.method16834(-1994884458);
	    Class411 class411
		= ((Class411)
		   Class539.method8888(Class411.method6672(-2073143159),
				       class525_sub38_sub2
					   .readUnsignedByte(1968344801),
				       -391280680));
	    long l_477_ = l_476_ + (l << 32);
	    boolean bool_478_ = false;
	while_139_:
	    do {
		for (int i_479_ = 0; i_479_ < 100; i_479_++) {
		    if (client.aLongArray11335[i_479_] == l_477_) {
			bool_478_ = true;
			break while_139_;
		    }
		}
		if (class411.aBool4252) {
		    if (client.aBool11233 && !client.aBool11266
			|| client.aBool11064)
			bool_478_ = true;
		    else if (Class450.method7330(string_474_, -514965154))
			bool_478_ = true;
		}
	    } while (false);
	    if (!bool_478_) {
		client.aLongArray11335[client.anInt11336 * 1397979293]
		    = l_477_;
		client.anInt11336
		    = -870396491 * ((1 + 1397979293 * client.anInt11336)
				    % 100);
		String string_480_
		    = (Class274.method5092
		       (Class223.method4241(class525_sub38_sub2, (byte) 4),
			438933474));
		if (-569278595 * class411.anInt4251 != -1)
		    Class627.method10275
			(9, 0,
			 new StringBuilder().append
			     (Class501.method8197((-569278595
						   * class411.anInt4251),
						  -34737268))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class501.method8197((class411.anInt4251
						   * -569278595),
						  383761788))
			     .append
			     (string_474_).toString(),
			 string, string_480_, string_475_, -1, class411,
			 (byte) 0);
		else
		    Class627.method10275(9, 0, string, string_474_, string,
					 string_480_, string_475_, -1,
					 class411, (byte) 0);
	    }
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (Class416.aClass416_4433 == class96.aClass416_1172) {
	    int i_481_ = class525_sub38_sub2.readUnsignedByte(874259858);
	    i_481_ = -i_481_ - 2;
	    byte i_482_ = class525_sub38_sub2.readByte(-1150098071);
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= ((Class656_Sub1_Sub3_Sub1_Sub1)
		   client.aMap11228.get(Integer.valueOf(i_481_)));
	    if (class656_sub1_sub3_sub1_sub1 == null) {
		class656_sub1_sub3_sub1_sub1
		    = new Class656_Sub1_Sub3_Sub1_Sub1(null);
		class656_sub1_sub3_sub1_sub1.anInt11964 = -447377367 * i_481_;
		client.aMap11228.put(Integer.valueOf(i_481_),
				     class656_sub1_sub3_sub1_sub1);
	    }
	    class656_sub1_sub3_sub1_sub1.method18926(class525_sub38_sub2,
						     i_482_, 896172806);
	    class96.aClass416_1172 = null;
	    return true;
	}
	if (class96.aClass416_1172 == Class416.aClass416_4423) {
	    Class412.method6677(Class406.aClass406_4154, (byte) 43);
	    class96.aClass416_1172 = null;
	    return true;
	}
	Class525_Sub16_Sub13.method18448
	    (new StringBuilder().append
		 (class96.aClass416_1172 != null
		  ? 1810141731 * class96.aClass416_1172.anInt4611 : -1)
		 .append
		 (Class55.aString560).append
		 (null != class96.aClass416_1165
		  ? 1810141731 * class96.aClass416_1165.anInt4611 : -1)
		 .append
		 (Class55.aString560).append
		 (class96.aClass416_1183 != null
		  ? 1810141731 * class96.aClass416_1183.anInt4611 : -1)
		 .append
		 (" ").append
		 (-1101265009 * class96.anInt1173).toString(),
	     new RuntimeException(), (byte) 102);
	Class156.method2465(false, 1825680330);
	return true;
    }
    
    static final void method7988(Class683 class683, byte i) {
	Class57.method1210((class683.anIntArray8661
			    [(class683.anInt8662 -= 1552651121) * 501271953]),
			   -16777216);
    }
    
    public static void method7989
	(Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1, int[] is,
	 int[] is_483_, int[] is_484_, byte i) {
	for (int i_485_ = 0; i_485_ < is.length; i_485_++) {
	    int i_486_ = is[i_485_];
	    int i_487_ = is_484_[i_485_];
	    int i_488_ = is_483_[i_485_];
	    for (int i_489_ = 0;
		 (i_487_ != 0
		  && i_489_ < (class656_sub1_sub3_sub1
			       .aClass689_Sub2_Sub1Array11998).length);
		 i_487_ >>>= 1) {
		if ((i_487_ & 0x1) != 0) {
		    if (-1 == i_486_)
			class656_sub1_sub3_sub1
			    .aClass689_Sub2_Sub1Array11998[i_489_]
			    = null;
		    else {
			AnimationDefinition class194
			    = (AnimationDefinition) Class685.aClass40_Sub8_8691
					     .method76(i_486_, -2121872387);
			int i_490_ = class194.replayMode * -871006613;
			Class689_Sub2_Sub1 class689_sub2_sub1
			    = (class656_sub1_sub3_sub1
			       .aClass689_Sub2_Sub1Array11998[i_489_]);
			if (class689_sub2_sub1 != null
			    && class689_sub2_sub1.method14021(-125370831)) {
			    if (i_486_
				== class689_sub2_sub1.method14048(278193132)) {
				if (i_490_ == 0) {
				    class656_sub1_sub3_sub1
					.aClass689_Sub2_Sub1Array11998[i_489_]
					= null;
				    class689_sub2_sub1 = null;
				} else if (1 == i_490_) {
				    class689_sub2_sub1.method14071(-431250528);
				    class689_sub2_sub1.anInt11938
					= i_488_ * 302046731;
				} else if (2 == i_490_)
				    class689_sub2_sub1.method14038((byte) 1);
			    } else if (1014786343 * class194.priority
				       >= ((class689_sub2_sub1.method14058
					    (373838453).priority)
					   * 1014786343)) {
				class656_sub1_sub3_sub1
				    .aClass689_Sub2_Sub1Array11998[i_489_]
				    = null;
				class689_sub2_sub1 = null;
			    }
			}
			if (null == class689_sub2_sub1
			    || !class689_sub2_sub1.method14021(1182088470)) {
			    class689_sub2_sub1
				= class656_sub1_sub3_sub1
				      .aClass689_Sub2_Sub1Array11998[i_489_]
				= (new Class689_Sub2_Sub1
				   (class656_sub1_sub3_sub1));
			    class689_sub2_sub1.method14068(i_486_, (byte) -58);
			    class689_sub2_sub1.anInt11938 = 302046731 * i_488_;
			}
		    }
		}
		i_489_++;
	    }
	}
    }
}
