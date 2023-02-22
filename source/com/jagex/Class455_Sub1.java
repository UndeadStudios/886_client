/* Class455_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class455_Sub1 extends Class455
{
    static final int anInt10329 = 2;
    static boolean aBool10330;
    static final int anInt10331 = 0;
    Class40_Sub11 aClass40_Sub11_10332;
    static boolean aBool10333 = false;
    static final int anInt10334 = 3;
    static int[] anIntArray10335;
    static int[] anIntArray10336;
    static int[] anIntArray10337;
    static int[] anIntArray10338;
    int anInt10339 = -1823721613;
    Class635 aClass635_10340;
    static final int anInt10341 = 1;
    
    public final void method15960
	(Class182 class182, RSBuffer class525_sub38, int i, int i_0_,
	 int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
	if (!aBool4965) {
	    class525_sub38.index += -1579539528;
	    boolean bool = false;
	    Class618 class618 = null;
	    boolean bool_7_ = false;
	    int i_8_ = (i_3_ & 0x7) * 8;
	    int i_9_ = (i_4_ & 0x7) * 8;
	    while (class525_sub38.index * -1133521593
		   < class525_sub38.buffer.length) {
		int i_10_ = class525_sub38.readUnsignedByte(1606928835);
		if (i_10_ == 0) {
		    if (null == class618)
			class618
			    = new Class618(class525_sub38, aClass635_10340);
		    else
			class618.method10127(class525_sub38, aClass635_10340,
					     2006737277);
		} else if (1 == i_10_) {
		    int i_11_ = class525_sub38.readUnsignedByte(736664880);
		    if (i_11_ > 0) {
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
			    Class564 class564
				= new Class564(class182,
					       (aClass546_5007.anInt7200
						* 1819515263),
					       class525_sub38, 2);
			    if (class564.anInt7590 * -1812738709 == 31) {
				Class92 class92
				    = ((Class92)
				       (client.aClass40_Sub21_11118.method76
					(class525_sub38.readUnsignedShort((byte) 70),
					 667199581)));
				class564.method9437
				    (class92.anInt906 * -454830185,
				     class92.anInt907 * 1624542163,
				     class92.anInt904 * -505098627,
				     388556381 * class92.anInt905, 2077838296);
			    }
			    if (class182.method3242() > 0) {
				Class525_Sub21 class525_sub21
				    = class564.aClass525_Sub21_7595;
				int i_13_
				    = (class525_sub21.method16314(-1180107517)
				       >> 9);
				int i_14_
				    = (class525_sub21.method16301((byte) 6)
				       >> 9);
				if (i_2_ == -2032095817 * class564.anInt7578
				    && i_13_ >= i_8_ && i_13_ < i_8_ + 8
				    && i_14_ >= i_9_ && i_14_ < 8 + i_9_) {
				    int i_15_
					= ((i_0_ << 9)
					   + (Class599.method9868
					      ((class525_sub21
						    .method16314(-811212747)
						& 0xfff),
					       (class525_sub21
						    .method16301((byte) 6)
						& 0xfff),
					       i_5_, 860594912)));
				    int i_16_
					= ((i_1_ << 9)
					   + (Class340.method5987
					      ((class525_sub21
						    .method16314(-677906980)
						& 0xfff),
					       (class525_sub21
						    .method16301((byte) 6)
						& 0xfff),
					       i_5_, -1535986600)));
				    i_13_ = i_15_ >> 9;
				    i_14_ = i_16_ >> 9;
				    if (i_13_ >= 0 && i_14_ >= 0
					&& i_13_ < -528942713 * anInt4963
					&& i_14_ < -129082381 * anInt4964) {
					class564.anInt7578 = 520011783 * i;
					class525_sub21.method16324
					    (i_15_,
					     ((anIntArrayArrayArray4966
					       [(class564.anInt7578
						 * -2032095817)]
					       [i_13_][i_14_])
					      - (class525_sub21.method16312
						 ((short) 30402))),
					     i_16_, (short) 797);
					aClass546_5007.method9038(class564,
								  -528246541);
				    }
				}
			    }
			}
		    }
		} else if (2 == i_10_) {
		    if (class618 == null)
			class618 = new Class618();
		    class618.method10121(class525_sub38, 1951384392);
		} else if (3 == i_10_) {
		    if (null == class618)
			class618 = new Class618();
		    class618.method10122(class525_sub38, 303980406);
		} else if (128 == i_10_) {
		    if (class618 == null)
			class618 = new Class618();
		    class618.method10141(class525_sub38, aClass635_10340,
					 -1052789925);
		} else if (i_10_ == 129) {
		    if (null == aByteArrayArrayArray4967)
			aByteArrayArrayArray4967 = new byte[4][][];
		    for (int i_17_ = 0; i_17_ < 4; i_17_++) {
			byte i_18_ = class525_sub38.readByte(-1150098071);
			if (0 == i_18_
			    && null != aByteArrayArrayArray4967[i]) {
			    if (i_17_ <= i_2_) {
				int i_19_ = i_0_;
				int i_20_ = 7 + i_0_;
				int i_21_ = i_1_;
				int i_22_ = i_1_ + 7;
				if (i_19_ < 0)
				    i_19_ = 0;
				else if (i_19_ >= -528942713 * anInt4963)
				    i_19_ = anInt4963 * -528942713;
				if (i_20_ < 0)
				    i_20_ = 0;
				else if (i_20_ >= -528942713 * anInt4963)
				    i_20_ = -528942713 * anInt4963;
				if (i_21_ < 0)
				    i_21_ = 0;
				else if (i_21_ >= anInt4964 * -129082381)
				    i_21_ = -129082381 * anInt4964;
				if (i_22_ < 0)
				    i_22_ = 0;
				else if (i_22_ >= anInt4964 * -129082381)
				    i_22_ = anInt4964 * -129082381;
				for (/**/; i_19_ < i_20_; i_19_++) {
				    for (/**/; i_21_ < i_22_; i_21_++)
					aByteArrayArrayArray4967[i][i_19_]
					    [i_21_]
					    = (byte) 0;
				}
			    }
			} else if (i_18_ == 1) {
			    if (null == aByteArrayArrayArray4967[i])
				aByteArrayArrayArray4967[i]
				    = (new byte[-528942713 * anInt4963 + 1]
				       [1 + anInt4964 * -129082381]);
			    for (int i_23_ = 0; i_23_ < 64; i_23_ += 4) {
				for (int i_24_ = 0; i_24_ < 64; i_24_ += 4) {
				    byte i_25_ = class525_sub38
						     .readByte(-1150098071);
				    if (i_17_ <= i_2_) {
					for (int i_26_ = i_23_;
					     i_26_ < 4 + i_23_; i_26_++) {
					    for (int i_27_ = i_24_;
						 i_27_ < i_24_ + 4; i_27_++) {
						if (i_26_ >= i_8_
						    && i_26_ < 8 + i_8_
						    && i_27_ >= i_9_
						    && i_27_ < i_9_ + 8) {
						    int i_28_
							= (i_0_
							   + (Class382
								  .method6427
							      (i_26_ & 0x7,
							       i_27_ & 0x7,
							       i_5_,
							       (short) 1260)));
						    int i_29_
							= (i_1_
							   + (Class512
								  .method8536
							      (i_26_ & 0x7,
							       i_27_ & 0x7,
							       i_5_,
							       -2108863904)));
						    if (i_28_ >= 0
							&& (i_28_
							    < (-528942713
							       * anInt4963))
							&& i_29_ >= 0
							&& (i_29_
							    < (-129082381
							       * anInt4964))) {
							aByteArrayArrayArray4967
							    [i][i_28_][i_29_]
							    = i_25_;
							bool = true;
						    }
						}
					    }
					}
				    }
				}
			    }
			} else if (2 == i_18_)
			    continue;
		    }
		} else if (130 == i_10_)
		    bool_7_ = true;
		else
		    throw new IllegalStateException("");
	    }
	    if (null != class618)
		aClass635_10340.method10392(i_0_ >> 3, i_1_ >> 3, class618,
					    1571201588);
	    Class259.method4754(i_0_ >> 3, i_1_ >> 3, bool_7_, (byte) 58);
	    if (!bool && null != aByteArrayArrayArray4967
		&& aByteArrayArrayArray4967[i] != null) {
		int i_30_ = i_0_ + 7;
		int i_31_ = 7 + i_1_;
		for (int i_32_ = i_0_; i_32_ < i_30_; i_32_++) {
		    for (int i_33_ = i_1_; i_33_ < i_31_; i_33_++)
			aByteArrayArrayArray4967[i][i_32_][i_33_] = (byte) 0;
		}
	    }
	}
    }
    
    public final void method15961(Class182 class182,
								  RSBuffer class525_sub38, int i,
								  int i_34_, byte i_35_) {
	if (!aBool4965) {
	    class525_sub38.index += -1579539528;
	    boolean bool = false;
	    Class618 class618 = null;
	    boolean bool_36_ = false;
	    while (class525_sub38.index * -1133521593
		   < class525_sub38.buffer.length) {
		int i_37_ = class525_sub38.readUnsignedByte(1920696096);
		if (i_37_ == 0) {
		    if (class618 == null)
			class618
			    = new Class618(class525_sub38, aClass635_10340);
		    else
			class618.method10127(class525_sub38, aClass635_10340,
					     -1566749068);
		} else if (i_37_ == 1) {
		    int i_38_ = class525_sub38.readUnsignedByte(1108194768);
		    if (i_38_ > 0) {
			for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
			    Class564 class564
				= new Class564(class182,
					       (aClass546_5007.anInt7200
						* 1819515263),
					       class525_sub38, 2);
			    if (31 == -1812738709 * class564.anInt7590) {
				Class92 class92
				    = ((Class92)
				       (client.aClass40_Sub21_11118.method76
					(class525_sub38.readUnsignedShort((byte) 53),
					 -898456943)));
				class564.method9437
				    (-454830185 * class92.anInt906,
				     class92.anInt907 * 1624542163,
				     class92.anInt904 * -505098627,
				     388556381 * class92.anInt905, 2094425121);
			    }
			    if (class182.method3242() > 0) {
				Class525_Sub21 class525_sub21
				    = class564.aClass525_Sub21_7595;
				int i_40_
				    = (class525_sub21.method16314(1436594978)
				       + (i << 9));
				int i_41_
				    = (class525_sub21.method16301((byte) 6)
				       + (i_34_ << 9));
				int i_42_ = i_40_ >> 9;
				int i_43_ = i_41_ >> 9;
				if (i_42_ >= 0 && i_43_ >= 0
				    && i_42_ < -528942713 * anInt4963
				    && i_43_ < -129082381 * anInt4964) {
				    class525_sub21.method16324
					(i_40_,
					 ((anIntArrayArrayArray4966
					   [class564.anInt7578 * -2032095817]
					   [i_42_][i_43_])
					  - class525_sub21
						.method16312((short) 5312)),
					 i_41_, (short) 797);
				    aClass546_5007.method9038(class564,
							      -2116743246);
				}
			    }
			}
		    }
		} else if (i_37_ == 2) {
		    if (null == class618)
			class618 = new Class618();
		    class618.method10121(class525_sub38, -2145203033);
		} else if (i_37_ == 3) {
		    if (null == class618)
			class618 = new Class618();
		    class618.method10122(class525_sub38, 1029514234);
		} else if (i_37_ == 128) {
		    if (null == class618)
			class618 = new Class618();
		    class618.method10141(class525_sub38, aClass635_10340,
					 -1052789925);
		} else if (i_37_ == 129) {
		    if (aByteArrayArrayArray4967 == null)
			aByteArrayArrayArray4967 = new byte[4][][];
		    for (int i_44_ = 0; i_44_ < 4; i_44_++) {
			byte i_45_ = class525_sub38.readByte(-1150098071);
			if (i_45_ == 0
			    && aByteArrayArrayArray4967[i_44_] != null) {
			    int i_46_ = i;
			    int i_47_ = 64 + i;
			    int i_48_ = i_34_;
			    int i_49_ = 64 + i_34_;
			    if (i_46_ < 0)
				i_46_ = 0;
			    else if (i_46_ >= -528942713 * anInt4963)
				i_46_ = -528942713 * anInt4963;
			    if (i_47_ < 0)
				i_47_ = 0;
			    else if (i_47_ >= -528942713 * anInt4963)
				i_47_ = anInt4963 * -528942713;
			    if (i_48_ < 0)
				i_48_ = 0;
			    else if (i_48_ >= anInt4964 * -129082381)
				i_48_ = -129082381 * anInt4964;
			    if (i_49_ < 0)
				i_49_ = 0;
			    else if (i_49_ >= anInt4964 * -129082381)
				i_49_ = -129082381 * anInt4964;
			    for (/**/; i_46_ < i_47_; i_46_++) {
				for (/**/; i_48_ < i_49_; i_48_++)
				    aByteArrayArrayArray4967[i_44_][i_46_]
					[i_48_]
					= (byte) 0;
			    }
			} else if (1 == i_45_) {
			    if (aByteArrayArrayArray4967[i_44_] == null)
				aByteArrayArrayArray4967[i_44_]
				    = (new byte[1 + -528942713 * anInt4963]
				       [1 + -129082381 * anInt4964]);
			    for (int i_50_ = 0; i_50_ < 64; i_50_ += 4) {
				for (int i_51_ = 0; i_51_ < 64; i_51_ += 4) {
				    byte i_52_ = class525_sub38
						     .readByte(-1150098071);
				    for (int i_53_ = i_50_ + i;
					 i_53_ < 4 + (i_50_ + i); i_53_++) {
					for (int i_54_ = i_51_ + i_34_;
					     i_54_ < i_34_ + i_51_ + 4;
					     i_54_++) {
					    if (i_53_ >= 0
						&& (i_53_
						    < anInt4963 * -528942713)
						&& i_54_ >= 0
						&& (i_54_
						    < anInt4964 * -129082381))
						aByteArrayArrayArray4967
						    [i_44_][i_53_][i_54_]
						    = i_52_;
					}
				    }
				}
			    }
			} else if (2 == i_45_) {
			    if (null == aByteArrayArrayArray4967[i_44_])
				aByteArrayArrayArray4967[i_44_]
				    = (new byte[anInt4963 * -528942713 + 1]
				       [1 + -129082381 * anInt4964]);
			    if (i_44_ > 0) {
				int i_55_ = i;
				int i_56_ = i + 64;
				int i_57_ = i_34_;
				int i_58_ = 64 + i_34_;
				if (i_55_ < 0)
				    i_55_ = 0;
				else if (i_55_ >= -528942713 * anInt4963)
				    i_55_ = anInt4963 * -528942713;
				if (i_56_ < 0)
				    i_56_ = 0;
				else if (i_56_ >= anInt4963 * -528942713)
				    i_56_ = anInt4963 * -528942713;
				if (i_57_ < 0)
				    i_57_ = 0;
				else if (i_57_ >= anInt4964 * -129082381)
				    i_57_ = anInt4964 * -129082381;
				if (i_58_ < 0)
				    i_58_ = 0;
				else if (i_58_ >= anInt4964 * -129082381)
				    i_58_ = anInt4964 * -129082381;
				for (/**/; i_55_ < i_56_; i_55_++) {
				    for (/**/; i_57_ < i_58_; i_57_++)
					aByteArrayArrayArray4967[i_44_]
					    [i_55_][i_57_]
					    = (aByteArrayArrayArray4967
					       [i_44_ - 1][i_55_][i_57_]);
				}
			    }
			}
		    }
		    bool = true;
		} else if (i_37_ == 130)
		    bool_36_ = true;
		else
		    throw new IllegalStateException("");
	    }
	    for (int i_59_ = 0; i_59_ < 8; i_59_++) {
		for (int i_60_ = 0; i_60_ < 8; i_60_++) {
		    int i_61_ = i_59_ + (i >> 3);
		    int i_62_ = i_60_ + (i_34_ >> 3);
		    if (i_61_ >= 0 && i_61_ < -528942713 * anInt4963 >> 3
			&& i_62_ >= 0 && i_62_ < -129082381 * anInt4964 >> 3) {
			if (class618 != null)
			    aClass635_10340.method10392(i_61_, i_62_, class618,
							1527930288);
			Class259.method4754(i_61_, i_62_, bool_36_, (byte) 58);
		    }
		}
	    }
	    if (!bool && aByteArrayArrayArray4967 != null) {
		for (int i_63_ = 0; i_63_ < 4; i_63_++) {
		    if (null != aByteArrayArrayArray4967[i_63_]) {
			for (int i_64_ = 0; i_64_ < 16; i_64_++) {
			    for (int i_65_ = 0; i_65_ < 16; i_65_++) {
				int i_66_ = i_64_ + (i >> 2);
				int i_67_ = i_65_ + (i_34_ >> 2);
				if (i_66_ >= 0 && i_66_ < 26 && i_67_ >= 0
				    && i_67_ < 26)
				    aByteArrayArrayArray4967[i_63_][i_66_]
					[i_67_]
					= (byte) 0;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public final void method15962(Class182 class182, byte[] is, int i,
				  int i_68_, int i_69_, int i_70_, int i_71_,
				  int i_72_, int i_73_) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_74_ = -1;
	for (;;) {
	    int i_75_ = class525_sub38.method16836((short) -22897);
	    if (i_75_ == 0)
		break;
	    i_74_ += i_75_;
	    int i_76_ = 0;
	    for (;;) {
		int i_77_ = class525_sub38.readUnsignedSmart((byte) -45);
		if (i_77_ == 0)
		    break;
		i_76_ += i_77_ - 1;
		int i_78_ = i_76_ & 0x3f;
		int i_79_ = i_76_ >> 6 & 0x3f;
		int i_80_ = i_76_ >> 12;
		int i_81_ = class525_sub38.readUnsignedByte(2042430630);
		int i_82_ = i_81_ >> 2;
		int i_83_ = i_81_ & 0x3;
		if (i_70_ == i_80_ && i_79_ >= i_71_ && i_79_ < 8 + i_71_
		    && i_78_ >= i_72_ && i_78_ < 8 + i_72_) {
		    ObjectDefinitions class602
			= ((ObjectDefinitions)
			   aClass40_Sub11_10332.method76(i_74_, 1459333936));
		    int i_84_;
		    int i_85_;
		    if ((i_83_ & 0x1) == 0) {
			i_84_ = -2084474039 * class602.anInt7885;
			i_85_ = 1437840657 * class602.anInt7886;
		    } else {
			i_84_ = class602.anInt7886 * 1437840657;
			i_85_ = class602.anInt7885 * -2084474039;
		    }
		    int i_86_
			= i_68_ + Class251.method4512(i_79_ & 0x7, i_78_ & 0x7,
						      i_73_,
						      (class602.anInt7885
						       * -2084474039),
						      (1437840657
						       * class602.anInt7886),
						      i_83_, -428756749);
		    int i_87_
			= i_69_ + Class383.method6430(i_79_ & 0x7, i_78_ & 0x7,
						      i_73_,
						      (-2084474039
						       * class602.anInt7885),
						      (1437840657
						       * class602.anInt7886),
						      i_83_, (byte) 13);
		    int i_88_ = i_86_ + i_84_;
		    int i_89_ = i_87_ + i_85_;
		    if (i_86_ < anInt4963 * -528942713
			&& i_87_ < -129082381 * anInt4964 && i_88_ > 0
			&& i_89_ > 0
			&& ((-1214990409 * Class608.aClass608_7996.anInt7995
			     == i_82_)
			    || i_82_ == (Class608.aClass608_7997.anInt7995
					 * -1214990409)
			    || (i_86_ > 0 && i_87_ > 0
				&& i_86_ < anInt4963 * -528942713 - 1
				&& i_87_ < -129082381 * anInt4964 - 1)))
			method15968(class182, i, i, i_86_, i_87_, i_74_,
				    i_83_ + i_73_ & 0x3, i_82_, -1, 0,
				    1519870312);
		}
	    }
	}
    }
    
    public final void method15963(Class182 class182, byte[] is, int i,
				  int i_90_, int i_91_) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_92_ = -1;
	for (;;) {
	    int i_93_ = class525_sub38.method16836((short) 13958);
	    if (i_93_ == 0)
		break;
	    i_92_ += i_93_;
	    int i_94_ = 0;
	    for (;;) {
		int i_95_ = class525_sub38.readUnsignedSmart((byte) -10);
		if (0 == i_95_)
		    break;
		i_94_ += i_95_ - 1;
		int i_96_ = i_94_ & 0x3f;
		int i_97_ = i_94_ >> 6 & 0x3f;
		int i_98_ = i_94_ >> 12;
		int i_99_ = class525_sub38.readUnsignedByte(1511069284);
		int i_100_ = i_99_ >> 2;
		int i_101_ = i_99_ & 0x3;
		int i_102_ = i + i_97_;
		int i_103_ = i_90_ + i_96_;
		ObjectDefinitions class602
		    = ((ObjectDefinitions)
		       aClass40_Sub11_10332.method76(i_92_, -1315036897));
		int i_104_;
		int i_105_;
		if (0 == (i_101_ & 0x1)) {
		    i_104_ = -2084474039 * class602.anInt7885;
		    i_105_ = class602.anInt7886 * 1437840657;
		} else {
		    i_104_ = 1437840657 * class602.anInt7886;
		    i_105_ = -2084474039 * class602.anInt7885;
		}
		int i_106_ = i_102_ + i_104_;
		int i_107_ = i_105_ + i_103_;
		if (i_102_ < anInt4963 * -528942713
		    && i_103_ < -129082381 * anInt4964 && i_106_ > 0
		    && i_107_ > 0
		    && ((Class608.aClass608_7996.anInt7995 * -1214990409
			 == i_100_)
			|| (-1214990409 * Class608.aClass608_7997.anInt7995
			    == i_100_)
			|| (i_102_ > 0 && i_103_ > 0
			    && i_102_ < -528942713 * anInt4963 - 1
			    && i_103_ < anInt4964 * -129082381 - 1)))
		    method15968(class182, i_98_, i_98_, i_102_, i_103_, i_92_,
				i_101_, i_100_, -1, 0, 1996343088);
	    }
	}
    }
    
    static {
	aBool10330 = false;
	anIntArray10338 = new int[] { 1, 0, -1, 0 };
	anIntArray10336 = new int[] { 0, -1, 0, 1 };
	anIntArray10337 = new int[] { 1, -1, -1, 1 };
	anIntArray10335 = new int[] { -1, -1, 1, 1 };
    }
    
    void method15964(Class182 class182, int i, int i_108_, int i_109_,
		     int i_110_) {
	Interface62 interface62
	    = method15976(i, i_108_, i_109_, i_110_, -1812086426);
	if (null != interface62) {
	    ObjectDefinitions class602
		= ((ObjectDefinitions)
		   aClass40_Sub11_10332
		       .method76(interface62.method406((byte) 1), 1211500970));
	    int i_111_ = interface62.method72(-918988987);
	    int i_112_ = interface62.method413(1367225423);
	    if (class602.method9953(1809284017))
		Class573.method9542(i, i_109_, i_110_, class602, (byte) -10);
	    if (interface62.method396(-858184077))
		interface62.method393(class182, -1984600308);
	    if (0 == i_108_) {
		aClass546_5007.method8959(i, i_109_, i_110_, 1295013932);
		aClass546_5007.method8960(i, i_109_, i_110_, 428017936);
		if (-260940369 * class602.anInt7892 == 1) {
		    if (0 == i_112_)
			aClass546_5007.aClass554_7208.method9173(1, i, i_109_,
								 i_110_);
		    else if (i_112_ == 1)
			aClass546_5007.aClass554_7208.method9173(2, i, i_109_,
								 1 + i_110_);
		    else if (2 == i_112_)
			aClass546_5007.aClass554_7208
			    .method9173(1, i, 1 + i_109_, i_110_);
		    else if (i_112_ == 3)
			aClass546_5007.aClass554_7208.method9173(2, i, i_109_,
								 i_110_);
		}
	    } else if (1 == i_108_) {
		aClass546_5007.method8961(i, i_109_, i_110_, 38751730);
		aClass546_5007.method8962(i, i_109_, i_110_, (byte) -20);
	    } else if (i_108_ == 2) {
		aClass546_5007.method8965(i, i_109_, i_110_,
					  client.anInterface63_11091,
					  858447381);
		if (-1214990409 * Class608.aClass608_7980.anInt7995
		    == i_111_) {
		    if ((i_112_ & 0x1) == 0)
			aClass546_5007.aClass554_7208.method9173(8, i, i_109_,
								 i_110_);
		    else
			aClass546_5007.aClass554_7208.method9173(16, i, i_109_,
								 i_110_);
		}
	    } else if (i_108_ == 3)
		aClass546_5007.method8963(i, i_109_, i_110_, 855444881);
	}
    }
    
    boolean method15965
	(Class182 class182, int i, int i_113_, boolean bool, ObjectDefinitions class602,
	 int i_114_, int i_115_, int i_116_, int i_117_, int i_118_,
	 int i_119_, int i_120_, int i_121_, int i_122_, boolean bool_123_,
	 Class161 class161, int i_124_, int i_125_, int i_126_) {
	if (i == -1214990409 * Class608.aClass608_7981.anInt7995) {
	    int i_127_ = class602.anInt7892 * -260940369;
	    if (aBool10330 && -1 == class602.anInt7892 * -260940369)
		i_127_ = 1;
	    Class656_Sub1_Sub5 class656_sub1_sub5;
	    if (bool) {
		Class656_Sub1_Sub5_Sub2 class656_sub1_sub5_sub2
		    = new Class656_Sub1_Sub5_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i, i_113_,
						  bool_123_);
		if (class656_sub1_sub5_sub2.method396(-691265180))
		    class656_sub1_sub5_sub2.method404(class182,
						      (short) -10237);
		class656_sub1_sub5 = class656_sub1_sub5_sub2;
	    } else
		class656_sub1_sub5
		    = new Class656_Sub1_Sub5_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i, i_113_, i_114_,
						  i_115_);
	    aClass546_5007.method8997(i_116_, i_121_, i_122_,
				      class656_sub1_sub5, null, 1933539773);
	    if (i_113_ == 0) {
		if (aBool4968 && class602.aBool7875) {
		    class161.method2609(i_121_, i_122_, 50);
		    class161.method2609(i_121_, i_122_ + 1, 50);
		}
		if (1 == i_127_ && !aBool4965)
		    aClass546_5007.aClass554_7208.method9203
			(1, i_116_, i_121_, i_122_,
			 class602.anInt7893 * 483868675,
			 1608040835 * class602.anInt7879);
	    } else if (i_113_ == 1) {
		if (aBool4968 && class602.aBool7875) {
		    class161.method2609(i_121_, i_122_ + 1, 50);
		    class161.method2609(i_121_ + 1, i_122_ + 1, 50);
		}
		if (i_127_ == 1 && !aBool4965)
		    aClass546_5007.aClass554_7208.method9203
			(2, i_116_, i_121_, i_122_ + 1,
			 class602.anInt7893 * 483868675,
			 -(1608040835 * class602.anInt7879));
	    } else if (i_113_ == 2) {
		if (aBool4968 && class602.aBool7875) {
		    class161.method2609(1 + i_121_, i_122_, 50);
		    class161.method2609(i_121_ + 1, 1 + i_122_, 50);
		}
		if (1 == i_127_ && !aBool4965)
		    aClass546_5007.aClass554_7208.method9203
			(1, i_116_, i_121_ + 1, i_122_,
			 class602.anInt7893 * 483868675,
			 -(1608040835 * class602.anInt7879));
	    } else if (3 == i_113_) {
		if (aBool4968 && class602.aBool7875) {
		    class161.method2609(i_121_, i_122_, 50);
		    class161.method2609(i_121_ + 1, i_122_, 50);
		}
		if (1 == i_127_ && !aBool4965)
		    aClass546_5007.aClass554_7208.method9203
			(2, i_116_, i_121_, i_122_,
			 class602.anInt7893 * 483868675,
			 1608040835 * class602.anInt7879);
	    }
	    if (class602.anInt7898 * 811837827 != 64)
		aClass546_5007.method8957(i_116_, i_121_, i_122_,
					  811837827 * class602.anInt7898,
					  -1626639053);
	    return true;
	}
	if (-1214990409 * Class608.aClass608_7988.anInt7995 == i) {
	    Class656_Sub1_Sub5 class656_sub1_sub5;
	    if (bool) {
		Class656_Sub1_Sub5_Sub2 class656_sub1_sub5_sub2
		    = new Class656_Sub1_Sub5_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i, i_113_,
						  bool_123_);
		if (class656_sub1_sub5_sub2.method396(-1123809075))
		    class656_sub1_sub5_sub2.method404(class182, (short) 6602);
		class656_sub1_sub5 = class656_sub1_sub5_sub2;
	    } else
		class656_sub1_sub5
		    = new Class656_Sub1_Sub5_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i, i_113_, i_114_,
						  i_115_);
	    aClass546_5007.method8997(i_116_, i_121_, i_122_,
				      class656_sub1_sub5, null, 1933539773);
	    if (class602.aBool7875 && aBool4968) {
		if (i_113_ == 0)
		    class161.method2609(i_121_, i_122_ + 1, 50);
		else if (1 == i_113_)
		    class161.method2609(i_121_ + 1, 1 + i_122_, 50);
		else if (2 == i_113_)
		    class161.method2609(i_121_ + 1, i_122_, 50);
		else if (i_113_ == 3)
		    class161.method2609(i_121_, i_122_, 50);
	    }
	    return true;
	}
	if (Class608.aClass608_7978.anInt7995 * -1214990409 == i) {
	    int i_128_ = i_113_ + 1 & 0x3;
	    Class656_Sub1_Sub5 class656_sub1_sub5;
	    Class656_Sub1_Sub5 class656_sub1_sub5_129_;
	    if (bool) {
		Class656_Sub1_Sub5_Sub2 class656_sub1_sub5_sub2
		    = new Class656_Sub1_Sub5_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i, i_113_ + 4,
						  bool_123_);
		Class656_Sub1_Sub5_Sub2 class656_sub1_sub5_sub2_130_
		    = new Class656_Sub1_Sub5_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i, i_128_,
						  bool_123_);
		if (class656_sub1_sub5_sub2.method396(-2125823252))
		    class656_sub1_sub5_sub2.method404(class182,
						      (short) -10594);
		if (class656_sub1_sub5_sub2_130_.method396(-785534782))
		    class656_sub1_sub5_sub2_130_.method404(class182,
							   (short) 10726);
		class656_sub1_sub5 = class656_sub1_sub5_sub2;
		class656_sub1_sub5_129_ = class656_sub1_sub5_sub2_130_;
	    } else {
		class656_sub1_sub5
		    = new Class656_Sub1_Sub5_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i, 4 + i_113_,
						  i_114_, i_115_);
		class656_sub1_sub5_129_
		    = new Class656_Sub1_Sub5_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i, i_128_, i_114_,
						  i_115_);
	    }
	    aClass546_5007.method8997(i_116_, i_121_, i_122_,
				      class656_sub1_sub5,
				      class656_sub1_sub5_129_, 1933539773);
	    if ((1 == -260940369 * class602.anInt7892
		 || aBool10330 && class602.anInt7892 * -260940369 == -1)
		&& !aBool4965) {
		if (i_113_ == 0) {
		    aClass546_5007.aClass554_7208.method9203
			(1, i_116_, i_121_, i_122_,
			 class602.anInt7893 * 483868675,
			 class602.anInt7879 * 1608040835);
		    aClass546_5007.aClass554_7208.method9203
			(2, i_116_, i_121_, i_122_ + 1,
			 class602.anInt7893 * 483868675,
			 class602.anInt7879 * 1608040835);
		} else if (1 == i_113_) {
		    aClass546_5007.aClass554_7208.method9203
			(1, i_116_, 1 + i_121_, i_122_,
			 483868675 * class602.anInt7893,
			 class602.anInt7879 * 1608040835);
		    aClass546_5007.aClass554_7208.method9203
			(2, i_116_, i_121_, i_122_ + 1,
			 class602.anInt7893 * 483868675,
			 class602.anInt7879 * 1608040835);
		} else if (i_113_ == 2) {
		    aClass546_5007.aClass554_7208.method9203
			(1, i_116_, 1 + i_121_, i_122_,
			 483868675 * class602.anInt7893,
			 1608040835 * class602.anInt7879);
		    aClass546_5007.aClass554_7208.method9203
			(2, i_116_, i_121_, i_122_,
			 class602.anInt7893 * 483868675,
			 1608040835 * class602.anInt7879);
		} else if (3 == i_113_) {
		    aClass546_5007.aClass554_7208.method9203
			(1, i_116_, i_121_, i_122_,
			 483868675 * class602.anInt7893,
			 class602.anInt7879 * 1608040835);
		    aClass546_5007.aClass554_7208.method9203
			(2, i_116_, i_121_, i_122_,
			 483868675 * class602.anInt7893,
			 1608040835 * class602.anInt7879);
		}
	    }
	    if (class602.anInt7898 * 811837827 != 64)
		aClass546_5007.method8957(i_116_, i_121_, i_122_,
					  class602.anInt7898 * 811837827,
					  323986700);
	    return true;
	}
	if (-1214990409 * Class608.aClass608_7979.anInt7995 == i) {
	    Class656_Sub1_Sub5 class656_sub1_sub5;
	    if (bool) {
		Class656_Sub1_Sub5_Sub2 class656_sub1_sub5_sub2
		    = new Class656_Sub1_Sub5_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i, i_113_,
						  bool_123_);
		if (class656_sub1_sub5_sub2.method396(-1507428931))
		    class656_sub1_sub5_sub2.method404(class182,
						      (short) -18867);
		class656_sub1_sub5 = class656_sub1_sub5_sub2;
	    } else
		class656_sub1_sub5
		    = new Class656_Sub1_Sub5_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i, i_113_, i_114_,
						  i_115_);
	    aClass546_5007.method8997(i_116_, i_121_, i_122_,
				      class656_sub1_sub5, null, 1933539773);
	    if (class602.aBool7875 && aBool4968) {
		if (0 == i_113_)
		    class161.method2609(i_121_, 1 + i_122_, 50);
		else if (i_113_ == 1)
		    class161.method2609(i_121_ + 1, 1 + i_122_, 50);
		else if (2 == i_113_)
		    class161.method2609(1 + i_121_, i_122_, 50);
		else if (i_113_ == 3)
		    class161.method2609(i_121_, i_122_, 50);
	    }
	    return true;
	}
	if (-1214990409 * Class608.aClass608_7980.anInt7995 == i) {
	    Class656_Sub1_Sub3 class656_sub1_sub3;
	    if (bool) {
		Class656_Sub1_Sub3_Sub2 class656_sub1_sub3_sub2
		    = new Class656_Sub1_Sub3_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i_121_, i_121_,
						  i_122_, i_122_, i, i_113_,
						  bool_123_, true);
		if (class656_sub1_sub3_sub2.method396(-1922172250))
		    class656_sub1_sub3_sub2.method404(class182, (short) -1787);
		class656_sub1_sub3 = class656_sub1_sub3_sub2;
	    } else
		class656_sub1_sub3
		    = new Class656_Sub1_Sub3_Sub3(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_116_, i_117_,
						  i_118_, i_119_, i_120_,
						  aBool4965, i_121_,
						  i_121_ + i_124_ - 1, i_122_,
						  i_122_ + i_125_ - 1, i,
						  i_113_, i_114_, i_115_,
						  true);
	    aClass546_5007.method8956(class656_sub1_sub3, false, (byte) 29);
	    if (class602.anInt7892 * -260940369 == 1 && !aBool4965) {
		int i_131_;
		if ((i_113_ & 0x1) == 0)
		    i_131_ = 8;
		else
		    i_131_ = 16;
		aClass546_5007.aClass554_7208.method9203
		    (i_131_, i_116_, i_121_, i_122_,
		     483868675 * class602.anInt7893, 0);
	    }
	    if (class602.anInt7898 * 811837827 != 64)
		aClass546_5007.method8957(i_116_, i_121_, i_122_,
					  class602.anInt7898 * 811837827,
					  -772057707);
	    return true;
	}
	return false;
    }
    
    boolean method15966(Class182 class182, int i, int i_132_, boolean bool,
                        ObjectDefinitions class602, int i_133_, int i_134_, int i_135_,
                        int i_136_, int i_137_, int i_138_, int i_139_,
                        int i_140_, int i_141_, int i_142_) {
	if (-1214990409 * Class608.aClass608_7976.anInt7995 == i) {
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = new Class656_Sub1_Sub4_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_135_, i_136_,
						  i_137_, i_138_, i_139_,
						  aBool4965, 0, 0, i, i_132_);
		if (class656_sub1_sub4_sub2.method396(-1901877661))
		    class656_sub1_sub4_sub2.method404(class182,
						      (short) -11795);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = new Class656_Sub1_Sub4_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_135_, i_136_,
						  i_137_, i_138_, i_139_,
						  aBool4965, 0, 0, i, i_132_,
						  i_133_, i_134_);
	    aClass546_5007.method8955(i_135_, i_140_, i_141_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (i == -1214990409 * Class608.aClass608_7982.anInt7995) {
	    int i_143_ = 65;
	    Interface62 interface62
		= (Interface62) aClass546_5007.method8968(i_135_, i_140_,
							  i_141_, (byte) -40);
	    if (interface62 != null)
		i_143_
		    = (((ObjectDefinitions)
			aClass40_Sub11_10332.method76(interface62
							  .method406((byte) 1),
						      1097095800)).anInt7898
		       * 811837827) + 1;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = (new Class656_Sub1_Sub4_Sub2
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_135_, i_136_, i_137_, i_138_, i_139_,
			aBool4965, anIntArray10338[i_132_] * i_143_,
			anIntArray10336[i_132_] * i_143_, i, i_132_));
		if (class656_sub1_sub4_sub2.method396(-741267063))
		    class656_sub1_sub4_sub2.method404(class182, (short) -7706);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = (new Class656_Sub1_Sub4_Sub1
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_135_, i_136_, i_137_, i_138_, i_139_,
			aBool4965, anIntArray10338[i_132_] * i_143_,
			anIntArray10336[i_132_] * i_143_, i, i_132_, i_133_,
			i_134_));
	    aClass546_5007.method8955(i_135_, i_140_, i_141_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (i == -1214990409 * Class608.aClass608_7983.anInt7995) {
	    int i_144_ = 33;
	    Interface62 interface62
		= (Interface62) aClass546_5007.method8968(i_135_, i_140_,
							  i_141_, (byte) -9);
	    if (interface62 != null)
		i_144_
		    = (((ObjectDefinitions)
			aClass40_Sub11_10332.method76(interface62
							  .method406((byte) 1),
						      1112484871)).anInt7898
		       * 811837827 / 2) + 1;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = (new Class656_Sub1_Sub4_Sub2
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_135_, i_136_, i_137_, i_138_, i_139_,
			aBool4965, i_144_ * anIntArray10338[i_132_],
			i_144_ * anIntArray10336[i_132_], i, 4 + i_132_));
		if (class656_sub1_sub4_sub2.method396(-1526358710))
		    class656_sub1_sub4_sub2.method404(class182, (short) -1702);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = (new Class656_Sub1_Sub4_Sub1
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_135_, i_136_, i_137_, i_138_, i_139_,
			aBool4965, anIntArray10337[i_132_] * i_144_,
			anIntArray10335[i_132_] * i_144_, i, i_132_ + 4,
			i_133_, i_134_));
	    aClass546_5007.method8955(i_135_, i_140_, i_141_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (i == -1214990409 * Class608.aClass608_7984.anInt7995) {
	    int i_145_ = 2 + i_132_ & 0x3;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = new Class656_Sub1_Sub4_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_135_, i_136_,
						  i_137_, i_138_, i_139_,
						  aBool4965, 0, 0, i,
						  i_145_ + 4);
		if (class656_sub1_sub4_sub2.method396(-2088974619))
		    class656_sub1_sub4_sub2.method404(class182, (short) 5866);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = new Class656_Sub1_Sub4_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_135_, i_136_,
						  i_137_, i_138_, i_139_,
						  aBool4965, 0, 0, i,
						  4 + i_145_, i_133_, i_134_);
	    aClass546_5007.method8955(i_135_, i_140_, i_141_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (-1214990409 * Class608.aClass608_7985.anInt7995 == i) {
	    int i_146_ = 2 + i_132_ & 0x3;
	    int i_147_ = 33;
	    Interface62 interface62
		= (Interface62) aClass546_5007.method8968(i_135_, i_140_,
							  i_141_, (byte) -5);
	    if (interface62 != null)
		i_147_
		    = (((ObjectDefinitions)
			aClass40_Sub11_10332.method76(interface62
							  .method406((byte) 1),
						      405008557)).anInt7898
		       * 811837827 / 2) + 1;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    Class656_Sub1_Sub4 class656_sub1_sub4_148_;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = (new Class656_Sub1_Sub4_Sub2
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_135_, i_136_, i_137_, i_138_, i_139_,
			aBool4965, i_147_ * anIntArray10337[i_132_],
			anIntArray10335[i_132_] * i_147_, i, i_132_ + 4));
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2_149_
		    = new Class656_Sub1_Sub4_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_135_, i_136_,
						  i_137_, i_138_, i_139_,
						  aBool4965, 0, 0, i,
						  i_146_ + 4);
		if (class656_sub1_sub4_sub2.method396(-1907795132))
		    class656_sub1_sub4_sub2.method404(class182,
						      (short) -23427);
		if (class656_sub1_sub4_sub2_149_.method396(-1212051908))
		    class656_sub1_sub4_sub2_149_.method404(class182,
							   (short) -28867);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
		class656_sub1_sub4_148_ = class656_sub1_sub4_sub2_149_;
	    } else {
		Class656_Sub1_Sub4_Sub1 class656_sub1_sub4_sub1
		    = (new Class656_Sub1_Sub4_Sub1
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_135_, i_136_, i_137_, i_138_, i_139_,
			aBool4965, anIntArray10337[i_132_] * i_147_,
			i_147_ * anIntArray10335[i_132_], i, i_132_ + 4,
			i_133_, i_134_));
		Class656_Sub1_Sub4_Sub1 class656_sub1_sub4_sub1_150_
		    = new Class656_Sub1_Sub4_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_135_, i_136_,
						  i_137_, i_138_, i_139_,
						  aBool4965, 0, 0, i,
						  4 + i_146_, i_133_, i_134_);
		class656_sub1_sub4 = class656_sub1_sub4_sub1;
		class656_sub1_sub4_148_ = class656_sub1_sub4_sub1_150_;
	    }
	    aClass546_5007.method8955(i_135_, i_140_, i_141_,
				      class656_sub1_sub4,
				      class656_sub1_sub4_148_, (byte) 0);
	    return true;
	}
	return false;
    }
    
    public final void method15967
	(Class182 class182, byte[] is, int i, int i_151_, int i_152_,
	 int i_153_, int i_154_, int i_155_, int i_156_, int i_157_) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_158_ = -1;
	for (;;) {
	    int i_159_ = class525_sub38.method16836((short) 6036);
	    if (i_159_ == 0)
		break;
	    i_158_ += i_159_;
	    int i_160_ = 0;
	    for (;;) {
		int i_161_ = class525_sub38.readUnsignedSmart((byte) -47);
		if (i_161_ == 0)
		    break;
		i_160_ += i_161_ - 1;
		int i_162_ = i_160_ & 0x3f;
		int i_163_ = i_160_ >> 6 & 0x3f;
		int i_164_ = i_160_ >> 12;
		int i_165_ = class525_sub38.readUnsignedByte(1583500471);
		int i_166_ = i_165_ >> 2;
		int i_167_ = i_165_ & 0x3;
		if (i_153_ == i_164_ && i_163_ >= i_154_ && i_163_ < 8 + i_154_
		    && i_162_ >= i_155_ && i_162_ < 8 + i_155_) {
		    ObjectDefinitions class602
			= ((ObjectDefinitions)
			   aClass40_Sub11_10332.method76(i_158_, 1559396194));
		    int i_168_;
		    int i_169_;
		    if ((i_167_ & 0x1) == 0) {
			i_168_ = -2084474039 * class602.anInt7885;
			i_169_ = 1437840657 * class602.anInt7886;
		    } else {
			i_168_ = class602.anInt7886 * 1437840657;
			i_169_ = class602.anInt7885 * -2084474039;
		    }
		    int i_170_
			= i_151_ + Class251.method4512(i_163_ & 0x7,
						       i_162_ & 0x7, i_156_,
						       (class602.anInt7885
							* -2084474039),
						       (1437840657
							* class602.anInt7886),
						       i_167_, 440554692);
		    int i_171_
			= i_152_ + Class383.method6430(i_163_ & 0x7,
						       i_162_ & 0x7, i_156_,
						       (-2084474039
							* class602.anInt7885),
						       (1437840657
							* class602.anInt7886),
						       i_167_, (byte) -26);
		    int i_172_ = i_170_ + i_168_;
		    int i_173_ = i_171_ + i_169_;
		    if (i_170_ < anInt4963 * -528942713
			&& i_171_ < -129082381 * anInt4964 && i_172_ > 0
			&& i_173_ > 0
			&& ((-1214990409 * Class608.aClass608_7996.anInt7995
			     == i_166_)
			    || i_166_ == (Class608.aClass608_7997.anInt7995
					  * -1214990409)
			    || (i_170_ > 0 && i_171_ > 0
				&& i_170_ < anInt4963 * -528942713 - 1
				&& i_171_ < -129082381 * anInt4964 - 1)))
			method15968(class182, i, i, i_170_, i_171_, i_158_,
				    i_167_ + i_156_ & 0x3, i_166_, -1, 0,
				    -399396047);
		}
	    }
	}
    }
    
    final void method15968(Class182 class182, int i, int i_174_, int i_175_,
			   int i_176_, int i_177_, int i_178_, int i_179_,
			   int i_180_, int i_181_, int i_182_) {
	if (i_174_ < 225736529 * anInt10339)
	    anInt10339 = -625790543 * i_174_;
	ObjectDefinitions class602
	    = (ObjectDefinitions) aClass40_Sub11_10332.method76(i_177_, 564181211);
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		.method16985(-261276081) != 0
	    || !class602.aBool7934) {
	    int i_183_;
	    int i_184_;
	    if (1 == i_178_ || i_178_ == 3) {
		i_183_ = 1437840657 * class602.anInt7886;
		i_184_ = -2084474039 * class602.anInt7885;
	    } else {
		i_183_ = class602.anInt7885 * -2084474039;
		i_184_ = class602.anInt7886 * 1437840657;
	    }
	    int i_185_;
	    int i_186_;
	    if (i_183_ + i_175_ <= -528942713 * anInt4963) {
		i_185_ = i_175_ + (i_183_ >> 1);
		i_186_ = i_175_ + (1 + i_183_ >> 1);
	    } else {
		i_185_ = i_175_;
		i_186_ = 1 + i_175_;
	    }
	    int i_187_;
	    int i_188_;
	    if (i_176_ + i_184_ <= -129082381 * anInt4964) {
		i_187_ = (i_184_ >> 1) + i_176_;
		i_188_ = i_176_ + (1 + i_184_ >> 1);
	    } else {
		i_187_ = i_176_;
		i_188_ = 1 + i_176_;
	    }
	    Class161 class161 = aClass546_5007.aClass161Array7226[i];
	    int i_189_;
	    if (i_179_ == Class608.aClass608_7996.anInt7995 * -1214990409
		|| Class608.aClass608_7997.anInt7995 * -1214990409 == i_179_)
		i_189_ = ((class161.method2617(i_185_, i_187_, -541336426)
			   + class161.method2617(i_186_, i_187_, -1634284548)
			   + class161.method2617(i_185_, i_188_, -1046007735)
			   + class161.method2617(i_186_, i_188_, -2110874563))
			  >> 2);
	    else
		i_189_
		    = (class161.method2577(i_185_, i_187_, (byte) -40)
		       + class161.method2577(i_186_, i_187_, (byte) -87)
		       + class161.method2577(i_185_, i_188_, (byte) 9)
		       + class161.method2577(i_186_, i_188_, (byte) 9)) >> 2;
	    int i_190_ = (i_175_ << 9) + (i_183_ << 8);
	    int i_191_ = (i_176_ << 9) + (i_184_ << 8);
	    boolean bool = aBool4968 && !aBool4965 && class602.aBool7889;
	    if (class602.method9953(1173634684))
		Class610.method10024(i_174_, i_175_, i_176_, i_178_, class602,
				     null, null, (short) -19521);
	    boolean bool_192_
		= (-1 == i_180_
		   && (!class602.method9956(-1863943746)
		       || (class602.aBool7897
			   && Class198_Sub13.aClass525_Sub30_9973
				  .aClass696_Sub36_10699
				  .method17294(1801913272) == 0))
		   && class602.anIntArray7923 == null && !class602.aBool7938
		   && !class602.aBool7942);
	    if (!aBool10333
		|| ((!Class507.method8488(i_179_, -2088448719)
		     || 1 == class602.anInt7892 * -260940369)
		    && (!Class111.method1972(i_179_, (byte) 117)
			|| class602.anInt7892 * -260940369 != 0))) {
		if (Class608.aClass608_7998.anInt7995 * -1214990409
		    == i_179_) {
		    if ((Class198_Sub13.aClass525_Sub30_9973
			     .aClass696_Sub11_10688.method17067((short) 255)
			 != 0)
			|| class602.anInt7888 * 1700857535 != 0
			|| 668917471 * class602.anInt7887 == 1
			|| class602.aBool7919) {
			Class656_Sub1_Sub1 class656_sub1_sub1;
			if (bool_192_) {
			    Class656_Sub1_Sub1_Sub1 class656_sub1_sub1_sub1
				= (new Class656_Sub1_Sub1_Sub1
				   (aClass546_5007, class182,
				    aClass40_Sub11_10332, class602, i_174_, i,
				    i_190_, i_189_, i_191_, aBool4965, i_178_,
				    bool));
			    if (class656_sub1_sub1_sub1.method396(-1696909161))
				class656_sub1_sub1_sub1
				    .method404(class182, (short) -25660);
			    class656_sub1_sub1 = class656_sub1_sub1_sub1;
			} else
			    class656_sub1_sub1
				= (new Class656_Sub1_Sub1_Sub2
				   (aClass546_5007, class182,
				    aClass40_Sub11_10332, class602, i_174_, i,
				    i_190_, i_189_, i_191_, aBool4965, i_178_,
				    i_180_, i_181_));
			aClass546_5007.method8952(i_174_, i_175_, i_176_,
						  class656_sub1_sub1,
						  -879826165);
		    }
		} else if ((i_179_
			    == Class608.aClass608_7996.anInt7995 * -1214990409)
			   || i_179_ == (Class608.aClass608_7997.anInt7995
					 * -1214990409)) {
		    Class656_Sub1_Sub3_Sub2 class656_sub1_sub3_sub2 = null;
		    Class656_Sub1_Sub3 class656_sub1_sub3;
		    int i_193_;
		    if (bool_192_) {
			Class656_Sub1_Sub3_Sub2 class656_sub1_sub3_sub2_194_
			    = (new Class656_Sub1_Sub3_Sub2
			       (aClass546_5007, class182, aClass40_Sub11_10332,
				class602, i_174_, i, i_190_, i_189_, i_191_,
				aBool4965, i_175_, i_175_ + i_183_ - 1, i_176_,
				i_176_ + i_184_ - 1, i_179_, i_178_, bool,
				(Class605.aClass605_7959
				 != class602.aClass605_7944)));
			i_193_ = class656_sub1_sub3_sub2_194_
				     .method18702(-547621389);
			class656_sub1_sub3 = class656_sub1_sub3_sub2_194_;
			class656_sub1_sub3_sub2 = class656_sub1_sub3_sub2_194_;
		    } else {
			class656_sub1_sub3
			    = (new Class656_Sub1_Sub3_Sub3
			       (aClass546_5007, class182, aClass40_Sub11_10332,
				class602, i_174_, i, i_190_, i_189_, i_191_,
				aBool4965, i_175_, i_175_ + i_183_ - 1, i_176_,
				i_176_ + i_184_ - 1, i_179_, i_178_, i_180_,
				i_181_,
				(class602.aClass605_7944
				 != Class605.aClass605_7959)));
			i_193_ = 15;
		    }
		    if (aClass546_5007.method8956(class656_sub1_sub3, false,
						  (byte) 124)) {
			if (class656_sub1_sub3_sub2 != null
			    && class656_sub1_sub3_sub2.method396(-556149549))
			    class656_sub1_sub3_sub2.method404(class182,
							      (short) 18501);
			if (class602.aBool7875 && aBool4968) {
			    if (i_193_ > 30)
				i_193_ = 30;
			    for (int i_195_ = 0; i_195_ <= i_183_; i_195_++) {
				for (int i_196_ = 0; i_196_ <= i_184_;
				     i_196_++)
				    class161.method2609(i_175_ + i_195_,
							i_176_ + i_196_,
							i_193_);
			    }
			}
		    }
		} else if (Class111.method1972(i_179_, (byte) 83)
			   || Class579.method9584(i_179_, -806942272)) {
		    Class656_Sub1_Sub3 class656_sub1_sub3;
		    if (bool_192_) {
			Class656_Sub1_Sub3_Sub2 class656_sub1_sub3_sub2
			    = (new Class656_Sub1_Sub3_Sub2
			       (aClass546_5007, class182, aClass40_Sub11_10332,
				class602, i_174_, i, i_190_, i_189_, i_191_,
				aBool4965, i_175_, i_183_ + i_175_ - 1, i_176_,
				i_176_ + i_184_ - 1, i_179_, i_178_, bool,
				true));
			if (class656_sub1_sub3_sub2.method396(-960786753))
			    class656_sub1_sub3_sub2.method404(class182,
							      (short) -26796);
			class656_sub1_sub3 = class656_sub1_sub3_sub2;
		    } else
			class656_sub1_sub3
			    = (new Class656_Sub1_Sub3_Sub3
			       (aClass546_5007, class182, aClass40_Sub11_10332,
				class602, i_174_, i, i_190_, i_189_, i_191_,
				aBool4965, i_175_, i_183_ + i_175_ - 1, i_176_,
				i_184_ + i_176_ - 1, i_179_, i_178_, i_180_,
				i_181_, true));
		    aClass546_5007.method8956(class656_sub1_sub3, false,
					      (byte) 78);
		    if (aBool4968 && !aBool4965
			&& Class111.method1972(i_179_, (byte) 84)
			&& (Class608.aClass608_7987.anInt7995 * -1214990409
			    != i_179_)
			&& i_174_ > 0 && -260940369 * class602.anInt7892 != 0)
			aByteArrayArrayArray4973[i_174_][i_175_][i_176_]
			    |= 0x4;
		} else if (method15965(class182, i_179_, i_178_, bool_192_,
				       class602, i_180_, i_181_, i_174_, i,
				       i_190_, i_189_, i_191_, i_175_, i_176_,
				       bool, class161, i_183_, i_184_,
				       -2127808360)
			   || method15966(class182, i_179_, i_178_, bool_192_,
					  class602, i_180_, i_181_, i_174_, i,
					  i_190_, i_189_, i_191_, i_175_,
					  i_176_, 2127021135)) {
		    /* empty */
		}
	    }
	}
    }
    
    public final void method15969(Class182 class182, boolean bool, int i) {
	aClass546_5007.method8975();
	if (!bool) {
	    if (anInt4987 * -155906383 > 1) {
		for (int i_197_ = 0; i_197_ < anInt4963 * -528942713;
		     i_197_++) {
		    for (int i_198_ = 0; i_198_ < -129082381 * anInt4964;
			 i_198_++) {
			if (((aClass475_4990.aByteArrayArrayArray5178[1]
			      [i_197_][i_198_])
			     & 0x2)
			    == 2)
			    aClass546_5007.method8940(i_197_, i_198_,
						      -1225098854);
		    }
		}
	    }
	    for (int i_199_ = 0; i_199_ < -155906383 * anInt4987; i_199_++) {
		for (int i_200_ = 0; i_200_ <= -129082381 * anInt4964;
		     i_200_++) {
		    for (int i_201_ = 0; i_201_ <= anInt4963 * -528942713;
			 i_201_++) {
			if (0 != ((aByteArrayArrayArray4973[i_199_][i_201_]
				   [i_200_])
				  & 0x4)) {
			    int i_202_ = i_201_;
			    int i_203_ = i_201_;
			    int i_204_ = i_200_;
			    int i_205_;
			    for (i_205_ = i_200_;
				 (i_204_ > 0
				  && ((aByteArrayArrayArray4973[i_199_][i_201_]
				       [i_204_ - 1])
				      & 0x4) != 0
				  && i_205_ - i_204_ < 10);
				 i_204_--) {
				/* empty */
			    }
			    for (/**/; (i_205_ < anInt4964 * -129082381
					&& 0 != ((aByteArrayArrayArray4973
						  [i_199_][i_201_][i_205_ + 1])
						 & 0x4)
					&& i_205_ - i_204_ < 10); i_205_++) {
				/* empty */
			    }
			while_39_:
			    for (/**/; i_202_ > 0 && i_203_ - i_202_ < 10;
				 i_202_--) {
				for (int i_206_ = i_204_; i_206_ <= i_205_;
				     i_206_++) {
				    if (((aByteArrayArrayArray4973[i_199_]
					  [i_202_ - 1][i_206_])
					 & 0x4)
					== 0)
					break while_39_;
				}
			    }
			while_40_:
			    for (/**/; (i_203_ < anInt4963 * -528942713
					&& i_203_ - i_202_ < 10); i_203_++) {
				for (int i_207_ = i_204_; i_207_ <= i_205_;
				     i_207_++) {
				    if (((aByteArrayArrayArray4973[i_199_]
					  [1 + i_203_][i_207_])
					 & 0x4)
					== 0)
					break while_40_;
				}
			    }
			    if ((i_205_ - i_204_ + 1) * (1 + (i_203_ - i_202_))
				>= 4) {
				int i_208_ = (anIntArrayArrayArray4966[i_199_]
					      [i_202_][i_204_]);
				aClass546_5007.aClass554_7208.method9191
				    (4, i_199_, i_202_ << 9,
				     512 + (i_203_ << 9), i_204_ << 9,
				     512 + (i_205_ << 9), i_208_, i_208_);
				for (int i_209_ = i_202_; i_209_ <= i_203_;
				     i_209_++) {
				    for (int i_210_ = i_204_; i_210_ <= i_205_;
					 i_210_++)
					aByteArrayArrayArray4973[i_199_]
					    [i_209_][i_210_]
					    &= ~0x4;
				}
			    }
			}
		    }
		}
	    }
	    aClass546_5007.aClass554_7208.method9213();
	}
	aByteArrayArrayArray4973 = null;
    }
    
    public Class455_Sub1(Class546 class546, Class40_Sub11 class40_sub11, int i,
			 int i_211_, int i_212_, boolean bool,
			 Class475 class475, Class635 class635) {
	super(class546, i, i_211_, i_212_, bool, Class232.aClass40_Sub18_2368,
	      Class198_Sub17.aClass40_Sub14_9981, class475);
	aClass40_Sub11_10332 = class40_sub11;
	aClass635_10340 = class635;
    }
    
    public final void method15970
	(Class182 class182, RSBuffer class525_sub38, int i, int i_213_) {
	if (!aBool4965) {
	    class525_sub38.index += -1579539528;
	    boolean bool = false;
	    Class618 class618 = null;
	    boolean bool_214_ = false;
	    while (class525_sub38.index * -1133521593
		   < class525_sub38.buffer.length) {
		int i_215_ = class525_sub38.readUnsignedByte(697201878);
		if (i_215_ == 0) {
		    if (class618 == null)
			class618
			    = new Class618(class525_sub38, aClass635_10340);
		    else
			class618.method10127(class525_sub38, aClass635_10340,
					     601804478);
		} else if (i_215_ == 1) {
		    int i_216_ = class525_sub38.readUnsignedByte(1434533049);
		    if (i_216_ > 0) {
			for (int i_217_ = 0; i_217_ < i_216_; i_217_++) {
			    Class564 class564
				= new Class564(class182,
					       (aClass546_5007.anInt7200
						* 1819515263),
					       class525_sub38, 2);
			    if (31 == -1812738709 * class564.anInt7590) {
				Class92 class92
				    = ((Class92)
				       (client.aClass40_Sub21_11118.method76
					(class525_sub38.readUnsignedShort((byte) 52),
					 1296032255)));
				class564.method9437
				    (-454830185 * class92.anInt906,
				     class92.anInt907 * 1624542163,
				     class92.anInt904 * -505098627,
				     388556381 * class92.anInt905, 1666175483);
			    }
			    if (class182.method3242() > 0) {
				Class525_Sub21 class525_sub21
				    = class564.aClass525_Sub21_7595;
				int i_218_
				    = (class525_sub21.method16314(1057510836)
				       + (i << 9));
				int i_219_
				    = (class525_sub21.method16301((byte) 6)
				       + (i_213_ << 9));
				int i_220_ = i_218_ >> 9;
				int i_221_ = i_219_ >> 9;
				if (i_220_ >= 0 && i_221_ >= 0
				    && i_220_ < -528942713 * anInt4963
				    && i_221_ < -129082381 * anInt4964) {
				    class525_sub21.method16324
					(i_218_,
					 ((anIntArrayArrayArray4966
					   [class564.anInt7578 * -2032095817]
					   [i_220_][i_221_])
					  - class525_sub21
						.method16312((short) 18821)),
					 i_219_, (short) 797);
				    aClass546_5007.method9038(class564,
							      -531935264);
				}
			    }
			}
		    }
		} else if (i_215_ == 2) {
		    if (null == class618)
			class618 = new Class618();
		    class618.method10121(class525_sub38, -1783473387);
		} else if (i_215_ == 3) {
		    if (null == class618)
			class618 = new Class618();
		    class618.method10122(class525_sub38, 695937775);
		} else if (i_215_ == 128) {
		    if (null == class618)
			class618 = new Class618();
		    class618.method10141(class525_sub38, aClass635_10340,
					 -1052789925);
		} else if (i_215_ == 129) {
		    if (aByteArrayArrayArray4967 == null)
			aByteArrayArrayArray4967 = new byte[4][][];
		    for (int i_222_ = 0; i_222_ < 4; i_222_++) {
			byte i_223_ = class525_sub38.readByte(-1150098071);
			if (i_223_ == 0
			    && aByteArrayArrayArray4967[i_222_] != null) {
			    int i_224_ = i;
			    int i_225_ = 64 + i;
			    int i_226_ = i_213_;
			    int i_227_ = 64 + i_213_;
			    if (i_224_ < 0)
				i_224_ = 0;
			    else if (i_224_ >= -528942713 * anInt4963)
				i_224_ = -528942713 * anInt4963;
			    if (i_225_ < 0)
				i_225_ = 0;
			    else if (i_225_ >= -528942713 * anInt4963)
				i_225_ = anInt4963 * -528942713;
			    if (i_226_ < 0)
				i_226_ = 0;
			    else if (i_226_ >= anInt4964 * -129082381)
				i_226_ = -129082381 * anInt4964;
			    if (i_227_ < 0)
				i_227_ = 0;
			    else if (i_227_ >= anInt4964 * -129082381)
				i_227_ = -129082381 * anInt4964;
			    for (/**/; i_224_ < i_225_; i_224_++) {
				for (/**/; i_226_ < i_227_; i_226_++)
				    aByteArrayArrayArray4967[i_222_]
					[i_224_][i_226_]
					= (byte) 0;
			    }
			} else if (1 == i_223_) {
			    if (aByteArrayArrayArray4967[i_222_] == null)
				aByteArrayArrayArray4967[i_222_]
				    = (new byte[1 + -528942713 * anInt4963]
				       [1 + -129082381 * anInt4964]);
			    for (int i_228_ = 0; i_228_ < 64; i_228_ += 4) {
				for (int i_229_ = 0; i_229_ < 64;
				     i_229_ += 4) {
				    byte i_230_
					= class525_sub38
					      .readByte(-1150098071);
				    for (int i_231_ = i_228_ + i;
					 i_231_ < 4 + (i_228_ + i); i_231_++) {
					for (int i_232_ = i_229_ + i_213_;
					     i_232_ < i_213_ + i_229_ + 4;
					     i_232_++) {
					    if (i_231_ >= 0
						&& (i_231_
						    < anInt4963 * -528942713)
						&& i_232_ >= 0
						&& (i_232_
						    < anInt4964 * -129082381))
						aByteArrayArrayArray4967
						    [i_222_][i_231_][i_232_]
						    = i_230_;
					}
				    }
				}
			    }
			} else if (2 == i_223_) {
			    if (null == aByteArrayArrayArray4967[i_222_])
				aByteArrayArrayArray4967[i_222_]
				    = (new byte[anInt4963 * -528942713 + 1]
				       [1 + -129082381 * anInt4964]);
			    if (i_222_ > 0) {
				int i_233_ = i;
				int i_234_ = i + 64;
				int i_235_ = i_213_;
				int i_236_ = 64 + i_213_;
				if (i_233_ < 0)
				    i_233_ = 0;
				else if (i_233_ >= -528942713 * anInt4963)
				    i_233_ = anInt4963 * -528942713;
				if (i_234_ < 0)
				    i_234_ = 0;
				else if (i_234_ >= anInt4963 * -528942713)
				    i_234_ = anInt4963 * -528942713;
				if (i_235_ < 0)
				    i_235_ = 0;
				else if (i_235_ >= anInt4964 * -129082381)
				    i_235_ = anInt4964 * -129082381;
				if (i_236_ < 0)
				    i_236_ = 0;
				else if (i_236_ >= anInt4964 * -129082381)
				    i_236_ = anInt4964 * -129082381;
				for (/**/; i_233_ < i_234_; i_233_++) {
				    for (/**/; i_235_ < i_236_; i_235_++)
					aByteArrayArrayArray4967[i_222_]
					    [i_233_][i_235_]
					    = (aByteArrayArrayArray4967
					       [i_222_ - 1][i_233_][i_235_]);
				}
			    }
			}
		    }
		    bool = true;
		} else if (i_215_ == 130)
		    bool_214_ = true;
		else
		    throw new IllegalStateException("");
	    }
	    for (int i_237_ = 0; i_237_ < 8; i_237_++) {
		for (int i_238_ = 0; i_238_ < 8; i_238_++) {
		    int i_239_ = i_237_ + (i >> 3);
		    int i_240_ = i_238_ + (i_213_ >> 3);
		    if (i_239_ >= 0 && i_239_ < -528942713 * anInt4963 >> 3
			&& i_240_ >= 0
			&& i_240_ < -129082381 * anInt4964 >> 3) {
			if (class618 != null)
			    aClass635_10340.method10392(i_239_, i_240_,
							class618, 1250956110);
			Class259.method4754(i_239_, i_240_, bool_214_,
					    (byte) 81);
		    }
		}
	    }
	    if (!bool && aByteArrayArrayArray4967 != null) {
		for (int i_241_ = 0; i_241_ < 4; i_241_++) {
		    if (null != aByteArrayArrayArray4967[i_241_]) {
			for (int i_242_ = 0; i_242_ < 16; i_242_++) {
			    for (int i_243_ = 0; i_243_ < 16; i_243_++) {
				int i_244_ = i_242_ + (i >> 2);
				int i_245_ = i_243_ + (i_213_ >> 2);
				if (i_244_ >= 0 && i_244_ < 26 && i_245_ >= 0
				    && i_245_ < 26)
				    aByteArrayArrayArray4967[i_241_]
					[i_244_][i_245_]
					= (byte) 0;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static final int method15971
	(Class40_Sub11 class40_sub11, byte[] is, int i, int i_246_, int i_247_,
	 int i_248_, Class641 class641, Class641 class641_249_) {
	int i_250_ = 0;
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_251_ = -1;
	for (;;) {
	    int i_252_ = class525_sub38.method16836((short) 3943);
	    if (i_252_ == 0)
		break;
	    i_251_ += i_252_;
	    int i_253_ = 0;
	    boolean bool = false;
	    for (;;) {
		if (bool) {
		    int i_254_ = class525_sub38.readUnsignedSmart((byte) -105);
		    if (i_254_ == 0)
			break;
		    class525_sub38.readUnsignedByte(782165786);
		} else {
		    int i_255_ = class525_sub38.readUnsignedSmart((byte) -79);
		    if (i_255_ == 0)
			break;
		    i_253_ += i_255_ - 1;
		    int i_256_ = i_253_ & 0x3f;
		    int i_257_ = i_253_ >> 6 & 0x3f;
		    int i_258_ = class525_sub38.readUnsignedByte(678004628) >> 2;
		    int i_259_ = i_258_ & 0x3;
		    i_258_ >>= 2;
		    int i_260_ = i_257_ + i;
		    int i_261_ = i_246_ + i_256_;
		    ObjectDefinitions class602
			= ((ObjectDefinitions)
			   class40_sub11.method76(i_251_, 1081383573));
		    int i_262_;
		    int i_263_;
		    if ((i_259_ & 0x1) == 0) {
			i_262_ = -2084474039 * class602.anInt7885;
			i_263_ = class602.anInt7886 * 1437840657;
		    } else {
			i_262_ = 1437840657 * class602.anInt7886;
			i_263_ = class602.anInt7885 * -2084474039;
		    }
		    if (i_260_ < i_247_ && i_261_ < i_248_
			&& i_260_ + i_262_ >= 0 && i_263_ + i_261_ >= 0) {
			if ((-1214990409 * Class608.aClass608_7998.anInt7995
			     != i_258_)
			    || Class198_Sub13.aClass525_Sub30_9973
				   .aClass696_Sub11_10688
				   .method17067((short) 255) != 0
			    || 0 != class602.anInt7888 * 1700857535
			    || 668917471 * class602.anInt7887 == 1
			    || class602.aBool7919) {
			    if (!class602.method9918(class641_249_,
						     -1439739708)) {
				class641.anInt8322 = i_251_ * -1459355133;
				i_250_++;
			    }
			    bool = true;
			}
		    }
		}
	    }
	}
	return i_250_;
    }
    
    void method15972(Class182 class182, int i, int i_264_, int i_265_,
		     int i_266_) {
	Interface62 interface62
	    = method15976(i, i_264_, i_265_, i_266_, -1349575522);
	if (null != interface62) {
	    ObjectDefinitions class602
		= ((ObjectDefinitions)
		   aClass40_Sub11_10332.method76(interface62
						     .method406((byte) 1),
						 -1934609128));
	    int i_267_ = interface62.method72(-1954330757);
	    int i_268_ = interface62.method413(2019444151);
	    if (class602.method9953(-919997881))
		Class573.method9542(i, i_265_, i_266_, class602, (byte) -47);
	    if (interface62.method396(-2146540906))
		interface62.method393(class182, -2057400899);
	    if (0 == i_264_) {
		aClass546_5007.method8959(i, i_265_, i_266_, -1827039150);
		aClass546_5007.method8960(i, i_265_, i_266_, 164753196);
		if (-260940369 * class602.anInt7892 == 1) {
		    if (0 == i_268_)
			aClass546_5007.aClass554_7208.method9173(1, i, i_265_,
								 i_266_);
		    else if (i_268_ == 1)
			aClass546_5007.aClass554_7208.method9173(2, i, i_265_,
								 1 + i_266_);
		    else if (2 == i_268_)
			aClass546_5007.aClass554_7208
			    .method9173(1, i, 1 + i_265_, i_266_);
		    else if (i_268_ == 3)
			aClass546_5007.aClass554_7208.method9173(2, i, i_265_,
								 i_266_);
		}
	    } else if (1 == i_264_) {
		aClass546_5007.method8961(i, i_265_, i_266_, -1704234236);
		aClass546_5007.method8962(i, i_265_, i_266_, (byte) -57);
	    } else if (i_264_ == 2) {
		aClass546_5007.method8965(i, i_265_, i_266_,
					  client.anInterface63_11091,
					  1300605558);
		if (-1214990409 * Class608.aClass608_7980.anInt7995
		    == i_267_) {
		    if ((i_268_ & 0x1) == 0)
			aClass546_5007.aClass554_7208.method9173(8, i, i_265_,
								 i_266_);
		    else
			aClass546_5007.aClass554_7208.method9173(16, i, i_265_,
								 i_266_);
		}
	    } else if (i_264_ == 3)
		aClass546_5007.method8963(i, i_265_, i_266_, -1158869405);
	}
    }
    
    public final void method15973(Class182 class182, byte[] is, int i,
				  int i_269_) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_270_ = -1;
	for (;;) {
	    int i_271_ = class525_sub38.method16836((short) 39);
	    if (i_271_ == 0)
		break;
	    i_270_ += i_271_;
	    int i_272_ = 0;
	    for (;;) {
		int i_273_ = class525_sub38.readUnsignedSmart((byte) -81);
		if (0 == i_273_)
		    break;
		i_272_ += i_273_ - 1;
		int i_274_ = i_272_ & 0x3f;
		int i_275_ = i_272_ >> 6 & 0x3f;
		int i_276_ = i_272_ >> 12;
		int i_277_ = class525_sub38.readUnsignedByte(1639506913);
		int i_278_ = i_277_ >> 2;
		int i_279_ = i_277_ & 0x3;
		int i_280_ = i + i_275_;
		int i_281_ = i_269_ + i_274_;
		ObjectDefinitions class602
		    = ((ObjectDefinitions)
		       aClass40_Sub11_10332.method76(i_270_, 212697287));
		int i_282_;
		int i_283_;
		if (0 == (i_279_ & 0x1)) {
		    i_282_ = -2084474039 * class602.anInt7885;
		    i_283_ = class602.anInt7886 * 1437840657;
		} else {
		    i_282_ = 1437840657 * class602.anInt7886;
		    i_283_ = -2084474039 * class602.anInt7885;
		}
		int i_284_ = i_280_ + i_282_;
		int i_285_ = i_283_ + i_281_;
		if (i_280_ < anInt4963 * -528942713
		    && i_281_ < -129082381 * anInt4964 && i_284_ > 0
		    && i_285_ > 0
		    && ((Class608.aClass608_7996.anInt7995 * -1214990409
			 == i_278_)
			|| (-1214990409 * Class608.aClass608_7997.anInt7995
			    == i_278_)
			|| (i_280_ > 0 && i_281_ > 0
			    && i_280_ < -528942713 * anInt4963 - 1
			    && i_281_ < anInt4964 * -129082381 - 1)))
		    method15968(class182, i_276_, i_276_, i_280_, i_281_,
				i_270_, i_279_, i_278_, -1, 0, 318833714);
	    }
	}
    }
    
    Interface62 method15974(int i, int i_286_, int i_287_, int i_288_) {
	Interface62 interface62 = null;
	if (i_286_ == 0)
	    interface62
		= (Interface62) aClass546_5007.method8968(i, i_287_, i_288_,
							  (byte) -3);
	if (1 == i_286_)
	    interface62
		= (Interface62) aClass546_5007.method8970(i, i_287_, i_288_,
							  (byte) 1);
	if (2 == i_286_)
	    interface62
		= ((Interface62)
		   aClass546_5007.method8972(i, i_287_, i_288_,
					     client.anInterface63_11091,
					     332483378));
	if (i_286_ == 3)
	    interface62
		= (Interface62) aClass546_5007.method8974(i, i_287_, i_288_,
							  (byte) -71);
	return interface62;
    }
    
    public final void method15975(Class182 class182, byte[] is, int i,
				  int i_289_, int i_290_, int i_291_,
				  int i_292_, int i_293_, int i_294_) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_295_ = -1;
	for (;;) {
	    int i_296_ = class525_sub38.method16836((short) -19347);
	    if (i_296_ == 0)
		break;
	    i_295_ += i_296_;
	    int i_297_ = 0;
	    for (;;) {
		int i_298_ = class525_sub38.readUnsignedSmart((byte) -52);
		if (i_298_ == 0)
		    break;
		i_297_ += i_298_ - 1;
		int i_299_ = i_297_ & 0x3f;
		int i_300_ = i_297_ >> 6 & 0x3f;
		int i_301_ = i_297_ >> 12;
		int i_302_ = class525_sub38.readUnsignedByte(749784853);
		int i_303_ = i_302_ >> 2;
		int i_304_ = i_302_ & 0x3;
		if (i_291_ == i_301_ && i_300_ >= i_292_ && i_300_ < 8 + i_292_
		    && i_299_ >= i_293_ && i_299_ < 8 + i_293_) {
		    ObjectDefinitions class602
			= ((ObjectDefinitions)
			   aClass40_Sub11_10332.method76(i_295_, -417386201));
		    int i_305_;
		    int i_306_;
		    if ((i_304_ & 0x1) == 0) {
			i_305_ = -2084474039 * class602.anInt7885;
			i_306_ = 1437840657 * class602.anInt7886;
		    } else {
			i_305_ = class602.anInt7886 * 1437840657;
			i_306_ = class602.anInt7885 * -2084474039;
		    }
		    int i_307_
			= i_289_ + Class251.method4512(i_300_ & 0x7,
						       i_299_ & 0x7, i_294_,
						       (class602.anInt7885
							* -2084474039),
						       (1437840657
							* class602.anInt7886),
						       i_304_, 1446517730);
		    int i_308_
			= i_290_ + Class383.method6430(i_300_ & 0x7,
						       i_299_ & 0x7, i_294_,
						       (-2084474039
							* class602.anInt7885),
						       (1437840657
							* class602.anInt7886),
						       i_304_, (byte) 14);
		    int i_309_ = i_307_ + i_305_;
		    int i_310_ = i_308_ + i_306_;
		    if (i_307_ < anInt4963 * -528942713
			&& i_308_ < -129082381 * anInt4964 && i_309_ > 0
			&& i_310_ > 0
			&& ((-1214990409 * Class608.aClass608_7996.anInt7995
			     == i_303_)
			    || i_303_ == (Class608.aClass608_7997.anInt7995
					  * -1214990409)
			    || (i_307_ > 0 && i_308_ > 0
				&& i_307_ < anInt4963 * -528942713 - 1
				&& i_308_ < -129082381 * anInt4964 - 1)))
			method15968(class182, i, i, i_307_, i_308_, i_295_,
				    i_304_ + i_294_ & 0x3, i_303_, -1, 0,
				    2054044746);
		}
	    }
	}
    }
    
    Interface62 method15976(int i, int i_311_, int i_312_, int i_313_,
			    int i_314_) {
	Interface62 interface62 = null;
	if (i_311_ == 0)
	    interface62
		= (Interface62) aClass546_5007.method8968(i, i_312_, i_313_,
							  (byte) -94);
	if (1 == i_311_)
	    interface62
		= (Interface62) aClass546_5007.method8970(i, i_312_, i_313_,
							  (byte) 1);
	if (2 == i_311_)
	    interface62
		= ((Interface62)
		   aClass546_5007.method8972(i, i_312_, i_313_,
					     client.anInterface63_11091,
					     332483378));
	if (i_311_ == 3)
	    interface62
		= (Interface62) aClass546_5007.method8974(i, i_312_, i_313_,
							  (byte) -91);
	return interface62;
    }
    
    boolean method15977(Class182 class182, int i, int i_315_, boolean bool,
                        ObjectDefinitions class602, int i_316_, int i_317_, int i_318_,
                        int i_319_, int i_320_, int i_321_, int i_322_,
                        int i_323_, int i_324_) {
	if (-1214990409 * Class608.aClass608_7976.anInt7995 == i) {
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = new Class656_Sub1_Sub4_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_318_, i_319_,
						  i_320_, i_321_, i_322_,
						  aBool4965, 0, 0, i, i_315_);
		if (class656_sub1_sub4_sub2.method396(-1723797893))
		    class656_sub1_sub4_sub2.method404(class182, (short) 8037);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = new Class656_Sub1_Sub4_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_318_, i_319_,
						  i_320_, i_321_, i_322_,
						  aBool4965, 0, 0, i, i_315_,
						  i_316_, i_317_);
	    aClass546_5007.method8955(i_318_, i_323_, i_324_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (i == -1214990409 * Class608.aClass608_7982.anInt7995) {
	    int i_325_ = 65;
	    Interface62 interface62
		= (Interface62) aClass546_5007.method8968(i_318_, i_323_,
							  i_324_, (byte) -108);
	    if (interface62 != null)
		i_325_
		    = (((ObjectDefinitions)
			aClass40_Sub11_10332.method76(interface62
							  .method406((byte) 1),
						      1048489791)).anInt7898
		       * 811837827) + 1;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = (new Class656_Sub1_Sub4_Sub2
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_318_, i_319_, i_320_, i_321_, i_322_,
			aBool4965, anIntArray10338[i_315_] * i_325_,
			anIntArray10336[i_315_] * i_325_, i, i_315_));
		if (class656_sub1_sub4_sub2.method396(-1469358454))
		    class656_sub1_sub4_sub2.method404(class182, (short) -5221);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = (new Class656_Sub1_Sub4_Sub1
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_318_, i_319_, i_320_, i_321_, i_322_,
			aBool4965, anIntArray10338[i_315_] * i_325_,
			anIntArray10336[i_315_] * i_325_, i, i_315_, i_316_,
			i_317_));
	    aClass546_5007.method8955(i_318_, i_323_, i_324_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (i == -1214990409 * Class608.aClass608_7983.anInt7995) {
	    int i_326_ = 33;
	    Interface62 interface62
		= (Interface62) aClass546_5007.method8968(i_318_, i_323_,
							  i_324_, (byte) -99);
	    if (interface62 != null)
		i_326_
		    = (((ObjectDefinitions)
			aClass40_Sub11_10332.method76(interface62
							  .method406((byte) 1),
						      1230493108)).anInt7898
		       * 811837827 / 2) + 1;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = (new Class656_Sub1_Sub4_Sub2
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_318_, i_319_, i_320_, i_321_, i_322_,
			aBool4965, i_326_ * anIntArray10338[i_315_],
			i_326_ * anIntArray10336[i_315_], i, 4 + i_315_));
		if (class656_sub1_sub4_sub2.method396(-1245427207))
		    class656_sub1_sub4_sub2.method404(class182, (short) 17973);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = (new Class656_Sub1_Sub4_Sub1
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_318_, i_319_, i_320_, i_321_, i_322_,
			aBool4965, anIntArray10337[i_315_] * i_326_,
			anIntArray10335[i_315_] * i_326_, i, i_315_ + 4,
			i_316_, i_317_));
	    aClass546_5007.method8955(i_318_, i_323_, i_324_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (i == -1214990409 * Class608.aClass608_7984.anInt7995) {
	    int i_327_ = 2 + i_315_ & 0x3;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = new Class656_Sub1_Sub4_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_318_, i_319_,
						  i_320_, i_321_, i_322_,
						  aBool4965, 0, 0, i,
						  i_327_ + 4);
		if (class656_sub1_sub4_sub2.method396(-1496455059))
		    class656_sub1_sub4_sub2.method404(class182, (short) -5647);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = new Class656_Sub1_Sub4_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_318_, i_319_,
						  i_320_, i_321_, i_322_,
						  aBool4965, 0, 0, i,
						  4 + i_327_, i_316_, i_317_);
	    aClass546_5007.method8955(i_318_, i_323_, i_324_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (-1214990409 * Class608.aClass608_7985.anInt7995 == i) {
	    int i_328_ = 2 + i_315_ & 0x3;
	    int i_329_ = 33;
	    Interface62 interface62
		= (Interface62) aClass546_5007.method8968(i_318_, i_323_,
							  i_324_, (byte) -37);
	    if (interface62 != null)
		i_329_
		    = (((ObjectDefinitions)
			aClass40_Sub11_10332.method76(interface62
							  .method406((byte) 1),
						      306983722)).anInt7898
		       * 811837827 / 2) + 1;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    Class656_Sub1_Sub4 class656_sub1_sub4_330_;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = (new Class656_Sub1_Sub4_Sub2
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_318_, i_319_, i_320_, i_321_, i_322_,
			aBool4965, i_329_ * anIntArray10337[i_315_],
			anIntArray10335[i_315_] * i_329_, i, i_315_ + 4));
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2_331_
		    = new Class656_Sub1_Sub4_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_318_, i_319_,
						  i_320_, i_321_, i_322_,
						  aBool4965, 0, 0, i,
						  i_328_ + 4);
		if (class656_sub1_sub4_sub2.method396(-1301170752))
		    class656_sub1_sub4_sub2.method404(class182, (short) 4738);
		if (class656_sub1_sub4_sub2_331_.method396(-1546231568))
		    class656_sub1_sub4_sub2_331_.method404(class182,
							   (short) 10632);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
		class656_sub1_sub4_330_ = class656_sub1_sub4_sub2_331_;
	    } else {
		Class656_Sub1_Sub4_Sub1 class656_sub1_sub4_sub1
		    = (new Class656_Sub1_Sub4_Sub1
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_318_, i_319_, i_320_, i_321_, i_322_,
			aBool4965, anIntArray10337[i_315_] * i_329_,
			i_329_ * anIntArray10335[i_315_], i, i_315_ + 4,
			i_316_, i_317_));
		Class656_Sub1_Sub4_Sub1 class656_sub1_sub4_sub1_332_
		    = new Class656_Sub1_Sub4_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_318_, i_319_,
						  i_320_, i_321_, i_322_,
						  aBool4965, 0, 0, i,
						  4 + i_328_, i_316_, i_317_);
		class656_sub1_sub4 = class656_sub1_sub4_sub1;
		class656_sub1_sub4_330_ = class656_sub1_sub4_sub1_332_;
	    }
	    aClass546_5007.method8955(i_318_, i_323_, i_324_,
				      class656_sub1_sub4,
				      class656_sub1_sub4_330_, (byte) 0);
	    return true;
	}
	return false;
    }
    
    boolean method15978(Class182 class182, int i, int i_333_, boolean bool,
                        ObjectDefinitions class602, int i_334_, int i_335_, int i_336_,
                        int i_337_, int i_338_, int i_339_, int i_340_,
                        int i_341_, int i_342_) {
	if (-1214990409 * Class608.aClass608_7976.anInt7995 == i) {
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = new Class656_Sub1_Sub4_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_336_, i_337_,
						  i_338_, i_339_, i_340_,
						  aBool4965, 0, 0, i, i_333_);
		if (class656_sub1_sub4_sub2.method396(-1115843810))
		    class656_sub1_sub4_sub2.method404(class182, (short) 27353);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = new Class656_Sub1_Sub4_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_336_, i_337_,
						  i_338_, i_339_, i_340_,
						  aBool4965, 0, 0, i, i_333_,
						  i_334_, i_335_);
	    aClass546_5007.method8955(i_336_, i_341_, i_342_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (i == -1214990409 * Class608.aClass608_7982.anInt7995) {
	    int i_343_ = 65;
	    Interface62 interface62
		= (Interface62) aClass546_5007.method8968(i_336_, i_341_,
							  i_342_, (byte) -100);
	    if (interface62 != null)
		i_343_
		    = (((ObjectDefinitions)
			aClass40_Sub11_10332.method76(interface62
							  .method406((byte) 1),
						      454098904)).anInt7898
		       * 811837827) + 1;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = (new Class656_Sub1_Sub4_Sub2
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_336_, i_337_, i_338_, i_339_, i_340_,
			aBool4965, anIntArray10338[i_333_] * i_343_,
			anIntArray10336[i_333_] * i_343_, i, i_333_));
		if (class656_sub1_sub4_sub2.method396(-542916828))
		    class656_sub1_sub4_sub2.method404(class182, (short) -9133);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = (new Class656_Sub1_Sub4_Sub1
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_336_, i_337_, i_338_, i_339_, i_340_,
			aBool4965, anIntArray10338[i_333_] * i_343_,
			anIntArray10336[i_333_] * i_343_, i, i_333_, i_334_,
			i_335_));
	    aClass546_5007.method8955(i_336_, i_341_, i_342_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (i == -1214990409 * Class608.aClass608_7983.anInt7995) {
	    int i_344_ = 33;
	    Interface62 interface62
		= (Interface62) aClass546_5007.method8968(i_336_, i_341_,
							  i_342_, (byte) -119);
	    if (interface62 != null)
		i_344_
		    = (((ObjectDefinitions)
			aClass40_Sub11_10332.method76(interface62
							  .method406((byte) 1),
						      -671858269)).anInt7898
		       * 811837827 / 2) + 1;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = (new Class656_Sub1_Sub4_Sub2
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_336_, i_337_, i_338_, i_339_, i_340_,
			aBool4965, i_344_ * anIntArray10338[i_333_],
			i_344_ * anIntArray10336[i_333_], i, 4 + i_333_));
		if (class656_sub1_sub4_sub2.method396(-1984461189))
		    class656_sub1_sub4_sub2.method404(class182,
						      (short) -15218);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = (new Class656_Sub1_Sub4_Sub1
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_336_, i_337_, i_338_, i_339_, i_340_,
			aBool4965, anIntArray10337[i_333_] * i_344_,
			anIntArray10335[i_333_] * i_344_, i, i_333_ + 4,
			i_334_, i_335_));
	    aClass546_5007.method8955(i_336_, i_341_, i_342_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (i == -1214990409 * Class608.aClass608_7984.anInt7995) {
	    int i_345_ = 2 + i_333_ & 0x3;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = new Class656_Sub1_Sub4_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_336_, i_337_,
						  i_338_, i_339_, i_340_,
						  aBool4965, 0, 0, i,
						  i_345_ + 4);
		if (class656_sub1_sub4_sub2.method396(-1086544508))
		    class656_sub1_sub4_sub2.method404(class182, (short) 16771);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
	    } else
		class656_sub1_sub4
		    = new Class656_Sub1_Sub4_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_336_, i_337_,
						  i_338_, i_339_, i_340_,
						  aBool4965, 0, 0, i,
						  4 + i_345_, i_334_, i_335_);
	    aClass546_5007.method8955(i_336_, i_341_, i_342_,
				      class656_sub1_sub4, null, (byte) 0);
	    return true;
	}
	if (-1214990409 * Class608.aClass608_7985.anInt7995 == i) {
	    int i_346_ = 2 + i_333_ & 0x3;
	    int i_347_ = 33;
	    Interface62 interface62
		= (Interface62) aClass546_5007.method8968(i_336_, i_341_,
							  i_342_, (byte) -116);
	    if (interface62 != null)
		i_347_
		    = (((ObjectDefinitions)
			aClass40_Sub11_10332.method76(interface62
							  .method406((byte) 1),
						      882832226)).anInt7898
		       * 811837827 / 2) + 1;
	    Class656_Sub1_Sub4 class656_sub1_sub4;
	    Class656_Sub1_Sub4 class656_sub1_sub4_348_;
	    if (bool) {
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2
		    = (new Class656_Sub1_Sub4_Sub2
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_336_, i_337_, i_338_, i_339_, i_340_,
			aBool4965, i_347_ * anIntArray10337[i_333_],
			anIntArray10335[i_333_] * i_347_, i, i_333_ + 4));
		Class656_Sub1_Sub4_Sub2 class656_sub1_sub4_sub2_349_
		    = new Class656_Sub1_Sub4_Sub2(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_336_, i_337_,
						  i_338_, i_339_, i_340_,
						  aBool4965, 0, 0, i,
						  i_346_ + 4);
		if (class656_sub1_sub4_sub2.method396(-2137327806))
		    class656_sub1_sub4_sub2.method404(class182, (short) 30140);
		if (class656_sub1_sub4_sub2_349_.method396(-1147400142))
		    class656_sub1_sub4_sub2_349_.method404(class182,
							   (short) -4038);
		class656_sub1_sub4 = class656_sub1_sub4_sub2;
		class656_sub1_sub4_348_ = class656_sub1_sub4_sub2_349_;
	    } else {
		Class656_Sub1_Sub4_Sub1 class656_sub1_sub4_sub1
		    = (new Class656_Sub1_Sub4_Sub1
		       (aClass546_5007, class182, aClass40_Sub11_10332,
			class602, i_336_, i_337_, i_338_, i_339_, i_340_,
			aBool4965, anIntArray10337[i_333_] * i_347_,
			i_347_ * anIntArray10335[i_333_], i, i_333_ + 4,
			i_334_, i_335_));
		Class656_Sub1_Sub4_Sub1 class656_sub1_sub4_sub1_350_
		    = new Class656_Sub1_Sub4_Sub1(aClass546_5007, class182,
						  aClass40_Sub11_10332,
						  class602, i_336_, i_337_,
						  i_338_, i_339_, i_340_,
						  aBool4965, 0, 0, i,
						  4 + i_346_, i_334_, i_335_);
		class656_sub1_sub4 = class656_sub1_sub4_sub1;
		class656_sub1_sub4_348_ = class656_sub1_sub4_sub1_350_;
	    }
	    aClass546_5007.method8955(i_336_, i_341_, i_342_,
				      class656_sub1_sub4,
				      class656_sub1_sub4_348_, (byte) 0);
	    return true;
	}
	return false;
    }
    
    void method15979(Class182 class182, int i, int i_351_, int i_352_,
		     int i_353_, int i_354_) {
	Interface62 interface62
	    = method15976(i, i_351_, i_352_, i_353_, -1843248708);
	if (null != interface62) {
	    ObjectDefinitions class602
		= ((ObjectDefinitions)
		   aClass40_Sub11_10332
		       .method76(interface62.method406((byte) 1), 612628616));
	    int i_355_ = interface62.method72(-2021217309);
	    int i_356_ = interface62.method413(2094948805);
	    if (class602.method9953(161900389))
		Class573.method9542(i, i_352_, i_353_, class602, (byte) -96);
	    if (interface62.method396(-754497524))
		interface62.method393(class182, -100023607);
	    if (0 == i_351_) {
		aClass546_5007.method8959(i, i_352_, i_353_, 390256204);
		aClass546_5007.method8960(i, i_352_, i_353_, 1594674508);
		if (-260940369 * class602.anInt7892 == 1) {
		    if (0 == i_356_)
			aClass546_5007.aClass554_7208.method9173(1, i, i_352_,
								 i_353_);
		    else if (i_356_ == 1)
			aClass546_5007.aClass554_7208.method9173(2, i, i_352_,
								 1 + i_353_);
		    else if (2 == i_356_)
			aClass546_5007.aClass554_7208
			    .method9173(1, i, 1 + i_352_, i_353_);
		    else if (i_356_ == 3)
			aClass546_5007.aClass554_7208.method9173(2, i, i_352_,
								 i_353_);
		}
	    } else if (1 == i_351_) {
		aClass546_5007.method8961(i, i_352_, i_353_, 1362163415);
		aClass546_5007.method8962(i, i_352_, i_353_, (byte) -49);
	    } else if (i_351_ == 2) {
		aClass546_5007.method8965(i, i_352_, i_353_,
					  client.anInterface63_11091,
					  1531355940);
		if (-1214990409 * Class608.aClass608_7980.anInt7995
		    == i_355_) {
		    if ((i_356_ & 0x1) == 0)
			aClass546_5007.aClass554_7208.method9173(8, i, i_352_,
								 i_353_);
		    else
			aClass546_5007.aClass554_7208.method9173(16, i, i_352_,
								 i_353_);
		}
	    } else if (i_351_ == 3)
		aClass546_5007.method8963(i, i_352_, i_353_, 1280206589);
	}
    }
    
    public final void method15980(Class182 class182, byte[] is, int i,
				  int i_357_) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_358_ = -1;
	for (;;) {
	    int i_359_ = class525_sub38.method16836((short) -13368);
	    if (i_359_ == 0)
		break;
	    i_358_ += i_359_;
	    int i_360_ = 0;
	    for (;;) {
		int i_361_ = class525_sub38.readUnsignedSmart((byte) -106);
		if (0 == i_361_)
		    break;
		i_360_ += i_361_ - 1;
		int i_362_ = i_360_ & 0x3f;
		int i_363_ = i_360_ >> 6 & 0x3f;
		int i_364_ = i_360_ >> 12;
		int i_365_ = class525_sub38.readUnsignedByte(58328709);
		int i_366_ = i_365_ >> 2;
		int i_367_ = i_365_ & 0x3;
		int i_368_ = i + i_363_;
		int i_369_ = i_357_ + i_362_;
		ObjectDefinitions class602
		    = ((ObjectDefinitions)
		       aClass40_Sub11_10332.method76(i_358_, 1691250326));
		int i_370_;
		int i_371_;
		if (0 == (i_367_ & 0x1)) {
		    i_370_ = -2084474039 * class602.anInt7885;
		    i_371_ = class602.anInt7886 * 1437840657;
		} else {
		    i_370_ = 1437840657 * class602.anInt7886;
		    i_371_ = -2084474039 * class602.anInt7885;
		}
		int i_372_ = i_368_ + i_370_;
		int i_373_ = i_371_ + i_369_;
		if (i_368_ < anInt4963 * -528942713
		    && i_369_ < -129082381 * anInt4964 && i_372_ > 0
		    && i_373_ > 0
		    && ((Class608.aClass608_7996.anInt7995 * -1214990409
			 == i_366_)
			|| (-1214990409 * Class608.aClass608_7997.anInt7995
			    == i_366_)
			|| (i_368_ > 0 && i_369_ > 0
			    && i_368_ < -528942713 * anInt4963 - 1
			    && i_369_ < anInt4964 * -129082381 - 1)))
		    method15968(class182, i_364_, i_364_, i_368_, i_369_,
				i_358_, i_367_, i_366_, -1, 0, -555306975);
	    }
	}
    }
    
    Interface62 method15981(int i, int i_374_, int i_375_, int i_376_) {
	Interface62 interface62 = null;
	if (i_374_ == 0)
	    interface62
		= (Interface62) aClass546_5007.method8968(i, i_375_, i_376_,
							  (byte) -34);
	if (1 == i_374_)
	    interface62
		= (Interface62) aClass546_5007.method8970(i, i_375_, i_376_,
							  (byte) 1);
	if (2 == i_374_)
	    interface62
		= ((Interface62)
		   aClass546_5007.method8972(i, i_375_, i_376_,
					     client.anInterface63_11091,
					     332483378));
	if (i_374_ == 3)
	    interface62
		= (Interface62) aClass546_5007.method8974(i, i_375_, i_376_,
							  (byte) -83);
	return interface62;
    }
    
    Interface62 method15982(int i, int i_377_, int i_378_, int i_379_) {
	Interface62 interface62 = null;
	if (i_377_ == 0)
	    interface62
		= (Interface62) aClass546_5007.method8968(i, i_378_, i_379_,
							  (byte) -91);
	if (1 == i_377_)
	    interface62
		= (Interface62) aClass546_5007.method8970(i, i_378_, i_379_,
							  (byte) 1);
	if (2 == i_377_)
	    interface62
		= ((Interface62)
		   aClass546_5007.method8972(i, i_378_, i_379_,
					     client.anInterface63_11091,
					     332483378));
	if (i_377_ == 3)
	    interface62
		= (Interface62) aClass546_5007.method8974(i, i_378_, i_379_,
							  (byte) 68);
	return interface62;
    }
    
    public final void method15983(Class182 class182, byte[] is, int i,
				  int i_380_) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_381_ = -1;
	for (;;) {
	    int i_382_ = class525_sub38.method16836((short) 1813);
	    if (i_382_ == 0)
		break;
	    i_381_ += i_382_;
	    int i_383_ = 0;
	    for (;;) {
		int i_384_ = class525_sub38.readUnsignedSmart((byte) -88);
		if (0 == i_384_)
		    break;
		i_383_ += i_384_ - 1;
		int i_385_ = i_383_ & 0x3f;
		int i_386_ = i_383_ >> 6 & 0x3f;
		int i_387_ = i_383_ >> 12;
		int i_388_ = class525_sub38.readUnsignedByte(1611700123);
		int i_389_ = i_388_ >> 2;
		int i_390_ = i_388_ & 0x3;
		int i_391_ = i + i_386_;
		int i_392_ = i_380_ + i_385_;
		ObjectDefinitions class602
		    = ((ObjectDefinitions)
		       aClass40_Sub11_10332.method76(i_381_, -1855436894));
		int i_393_;
		int i_394_;
		if (0 == (i_390_ & 0x1)) {
		    i_393_ = -2084474039 * class602.anInt7885;
		    i_394_ = class602.anInt7886 * 1437840657;
		} else {
		    i_393_ = 1437840657 * class602.anInt7886;
		    i_394_ = -2084474039 * class602.anInt7885;
		}
		int i_395_ = i_391_ + i_393_;
		int i_396_ = i_394_ + i_392_;
		if (i_391_ < anInt4963 * -528942713
		    && i_392_ < -129082381 * anInt4964 && i_395_ > 0
		    && i_396_ > 0
		    && ((Class608.aClass608_7996.anInt7995 * -1214990409
			 == i_389_)
			|| (-1214990409 * Class608.aClass608_7997.anInt7995
			    == i_389_)
			|| (i_391_ > 0 && i_392_ > 0
			    && i_391_ < -528942713 * anInt4963 - 1
			    && i_392_ < anInt4964 * -129082381 - 1)))
		    method15968(class182, i_387_, i_387_, i_391_, i_392_,
				i_381_, i_390_, i_389_, -1, 0, 261856431);
	    }
	}
    }
    
    Interface62 method15984(int i, int i_397_, int i_398_, int i_399_) {
	Interface62 interface62 = null;
	if (i_397_ == 0)
	    interface62
		= (Interface62) aClass546_5007.method8968(i, i_398_, i_399_,
							  (byte) -100);
	if (1 == i_397_)
	    interface62
		= (Interface62) aClass546_5007.method8970(i, i_398_, i_399_,
							  (byte) 1);
	if (2 == i_397_)
	    interface62
		= ((Interface62)
		   aClass546_5007.method8972(i, i_398_, i_399_,
					     client.anInterface63_11091,
					     332483378));
	if (i_397_ == 3)
	    interface62
		= (Interface62) aClass546_5007.method8974(i, i_398_, i_399_,
							  (byte) -87);
	return interface62;
    }
    
    public final void method15985(Class182 class182, boolean bool) {
	aClass546_5007.method8975();
	if (!bool) {
	    if (anInt4987 * -155906383 > 1) {
		for (int i = 0; i < anInt4963 * -528942713; i++) {
		    for (int i_400_ = 0; i_400_ < -129082381 * anInt4964;
			 i_400_++) {
			if (((aClass475_4990.aByteArrayArrayArray5178[1][i]
			      [i_400_])
			     & 0x2)
			    == 2)
			    aClass546_5007.method8940(i, i_400_, -801607604);
		    }
		}
	    }
	    for (int i = 0; i < -155906383 * anInt4987; i++) {
		for (int i_401_ = 0; i_401_ <= -129082381 * anInt4964;
		     i_401_++) {
		    for (int i_402_ = 0; i_402_ <= anInt4963 * -528942713;
			 i_402_++) {
			if (0 != (aByteArrayArrayArray4973[i][i_402_][i_401_]
				  & 0x4)) {
			    int i_403_ = i_402_;
			    int i_404_ = i_402_;
			    int i_405_ = i_401_;
			    int i_406_;
			    for (i_406_ = i_401_;
				 (i_405_ > 0
				  && ((aByteArrayArrayArray4973[i][i_402_]
				       [i_405_ - 1])
				      & 0x4) != 0
				  && i_406_ - i_405_ < 10);
				 i_405_--) {
				/* empty */
			    }
			    for (/**/; (i_406_ < anInt4964 * -129082381
					&& 0 != ((aByteArrayArrayArray4973[i]
						  [i_402_][i_406_ + 1])
						 & 0x4)
					&& i_406_ - i_405_ < 10); i_406_++) {
				/* empty */
			    }
			while_41_:
			    for (/**/; i_403_ > 0 && i_404_ - i_403_ < 10;
				 i_403_--) {
				for (int i_407_ = i_405_; i_407_ <= i_406_;
				     i_407_++) {
				    if (((aByteArrayArrayArray4973[i]
					  [i_403_ - 1][i_407_])
					 & 0x4)
					== 0)
					break while_41_;
				}
			    }
			while_42_:
			    for (/**/; (i_404_ < anInt4963 * -528942713
					&& i_404_ - i_403_ < 10); i_404_++) {
				for (int i_408_ = i_405_; i_408_ <= i_406_;
				     i_408_++) {
				    if (((aByteArrayArrayArray4973[i]
					  [1 + i_404_][i_408_])
					 & 0x4)
					== 0)
					break while_42_;
				}
			    }
			    if ((i_406_ - i_405_ + 1) * (1 + (i_404_ - i_403_))
				>= 4) {
				int i_409_ = (anIntArrayArrayArray4966[i]
					      [i_403_][i_405_]);
				aClass546_5007.aClass554_7208.method9191
				    (4, i, i_403_ << 9, 512 + (i_404_ << 9),
				     i_405_ << 9, 512 + (i_406_ << 9), i_409_,
				     i_409_);
				for (int i_410_ = i_403_; i_410_ <= i_404_;
				     i_410_++) {
				    for (int i_411_ = i_405_; i_411_ <= i_406_;
					 i_411_++)
					aByteArrayArrayArray4973[i][i_410_]
					    [i_411_]
					    &= ~0x4;
				}
			    }
			}
		    }
		}
	    }
	    aClass546_5007.aClass554_7208.method9213();
	}
	aByteArrayArrayArray4973 = null;
    }
    
    public static final void method15986(int i) {
	Class70.anInt784 = -2134589259;
	Class70.anInt739 = -1340436310;
	Class70.anInt782 = -1450306422;
    }
    
    public static void method15987(int i, int[] is, int i_412_) {
	if (-1 != i && Class165.method2667(i, is, -1836947574)) {
	    Class259[] class259s
		= Class162.aClass245Array1764[i].aClass259Array2426;
	    Class618.method10165(class259s, 2065474058);
	}
    }
    
    public static void method15988(boolean bool, boolean bool_413_, int i) {
	if (bool) {
	    Class639.anInt8317 += -1740306889;
	    Class398.method6543(-1621472843);
	}
	if (bool_413_) {
	    Class639.anInt8318 += -114268357;
	    Class413.method6681((byte) 114);
	}
    }
}
