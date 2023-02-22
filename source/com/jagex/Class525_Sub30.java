/* Class525_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub30 extends Class525
{
    public Class696_Sub16 aClass696_Sub16_10670;
    public Class696_Sub8 aClass696_Sub8_10671;
    public static final int anInt10672 = 500;
    Class696_Sub35 aClass696_Sub35_10673;
    Class668 aClass668_10674;
    public Class696_Sub6 aClass696_Sub6_10675;
    public Class696_Sub17 aClass696_Sub17_10676;
    public Class696_Sub39 aClass696_Sub39_10677;
    public Class696_Sub39 aClass696_Sub39_10678;
    Class696_Sub33 aClass696_Sub33_10679;
    public Class696_Sub37 aClass696_Sub37_10680;
    public Class696_Sub13 aClass696_Sub13_10681;
    public Class696_Sub26 aClass696_Sub26_10682;
    public Class696_Sub34 aClass696_Sub34_10683;
    public Class696_Sub19 aClass696_Sub19_10684;
    public Class696_Sub5 aClass696_Sub5_10685;
    Class696_Sub43 aClass696_Sub43_10686;
    public Class696_Sub24 aClass696_Sub24_10687;
    public Class696_Sub11 aClass696_Sub11_10688;
    public Class696_Sub21 aClass696_Sub21_10689;
    Class696_Sub3 aClass696_Sub3_10690;
    public Class696_Sub9 aClass696_Sub9_10691;
    public Class696_Sub6 aClass696_Sub6_10692;
    public Class696_Sub1 aClass696_Sub1_10693;
    public Class696_Sub2 aClass696_Sub2_10694;
    static final int anInt10695 = 23;
    public Class696_Sub30 aClass696_Sub30_10696;
    Class696_Sub14 aClass696_Sub14_10697;
    public Class696_Sub12 aClass696_Sub12_10698;
    public Class696_Sub36 aClass696_Sub36_10699;
    public static final int anInt10700 = 245;
    public Class696_Sub20 aClass696_Sub20_10701;
    public Class696_Sub45 aClass696_Sub45_10702;
    Class696_Sub27 aClass696_Sub27_10703;
    public Class696_Sub41 aClass696_Sub41_10704;
    public Class696_Sub41 aClass696_Sub41_10705;
    Class696_Sub18 aClass696_Sub18_10706;
    Class696_Sub22 aClass696_Sub22_10707;
    public Class696_Sub20 aClass696_Sub20_10708;
    Class696_Sub10 aClass696_Sub10_10709;
    public Class696_Sub45 aClass696_Sub45_10710;
    Class696_Sub31 aClass696_Sub31_10711;
    Class696_Sub40 aClass696_Sub40_10712;
    Class696_Sub32 aClass696_Sub32_10713;
    Class701 aClass701_10714;
    public Class696_Sub15 aClass696_Sub15_10715;
    Class696_Sub7 aClass696_Sub7_10716;
    public Class696_Sub42 aClass696_Sub42_10717;
    public Class696_Sub46 aClass696_Sub46_10718;
    public Class696_Sub23 aClass696_Sub23_10719;
    public Class696_Sub28 aClass696_Sub28_10720;
    public Class696_Sub38 aClass696_Sub38_10721;
    public Class696_Sub29 aClass696_Sub29_10722;
    public Class696_Sub25 aClass696_Sub25_10723;
    Class696_Sub44 aClass696_Sub44_10724;
    static final int anInt10725 = 38;
    public Class696_Sub45 aClass696_Sub45_10726;
    public Class696_Sub45 aClass696_Sub45_10727;
    public Class696_Sub4 aClass696_Sub4_10728;
    public Class696_Sub45 aClass696_Sub45_10729;
    public Class696_Sub47 aClass696_Sub47_10730;
    static final int anInt10731 = 59;
    
    void method16497(RSBuffer class525_sub38, byte i) {
	if (null == class525_sub38 || class525_sub38.buffer == null)
	    method16498(true, true, (byte) 60);
	else {
	    int i_0_ = class525_sub38.readUnsignedByte(1131263525);
	    if (i_0_ < 23) {
		try {
		    method16514(class525_sub38, i_0_, 1147975726);
		} catch (Exception exception) {
		    method16498(true, true, (byte) -7);
		}
		method16498(false, true, (byte) -82);
	    } else if (i_0_ > 38)
		method16498(true, true, (byte) 25);
	    else {
		if (i_0_ >= 29)
		    aClass696_Sub36_10699
			= new Class696_Sub36(class525_sub38
						 .readUnsignedByte(407259993),
					     this);
		aClass696_Sub39_10677
		    = new Class696_Sub39(class525_sub38.readUnsignedByte(114289766),
					 this);
		if (i_0_ >= 31)
		    aClass696_Sub33_10679
			= new Class696_Sub33(class525_sub38
						 .readUnsignedByte(958255359),
					     this);
		aClass696_Sub39_10678
		    = new Class696_Sub39(aClass696_Sub39_10677
					     .method17324(-16711936),
					 this);
		aClass696_Sub37_10680
		    = new Class696_Sub37(class525_sub38
					     .readUnsignedByte(1231990112),
					 this);
		aClass696_Sub13_10681
		    = new Class696_Sub13(class525_sub38.readUnsignedByte(359960894),
					 this);
		aClass696_Sub26_10682
		    = new Class696_Sub26(class525_sub38.readUnsignedByte(896637072),
					 this);
		if (i_0_ >= 27)
		    aClass696_Sub19_10684
			= new Class696_Sub19(class525_sub38
						 .readUnsignedByte(638257162),
					     this);
		aClass696_Sub5_10685
		    = new Class696_Sub5(class525_sub38.readUnsignedByte(1122695230),
					this);
		aClass696_Sub8_10671
		    = new Class696_Sub8(class525_sub38.readUnsignedByte(1921189302),
					this);
		aClass696_Sub24_10687
		    = new Class696_Sub24(class525_sub38
					     .readUnsignedByte(1176583835),
					 this);
		aClass696_Sub11_10688
		    = new Class696_Sub11(class525_sub38
					     .readUnsignedByte(1460743552),
					 this);
		aClass696_Sub21_10689
		    = new Class696_Sub21(class525_sub38
					     .readUnsignedByte(1515987963),
					 this);
		aClass696_Sub9_10691
		    = new Class696_Sub9(class525_sub38.readUnsignedByte(1159599575),
					this);
		aClass696_Sub15_10715
		    = new Class696_Sub15(class525_sub38
					     .readUnsignedByte(1023065487),
					 this);
		if (i_0_ >= 33)
		    aClass696_Sub16_10670
			= new Class696_Sub16(class525_sub38
						 .readUnsignedByte(1623980182),
					     this);
		if (i_0_ >= 34)
		    class525_sub38.readUnsignedByte(463077887);
		if (i_0_ >= 24)
		    aClass696_Sub1_10693
			= new Class696_Sub1(class525_sub38
						.readUnsignedByte(144133935),
					    this);
		aClass696_Sub2_10694
		    = new Class696_Sub2(class525_sub38.readUnsignedByte(1080369740),
					this);
		aClass696_Sub6_10692
		    = new Class696_Sub6(class525_sub38.readUnsignedByte(468319698),
					this);
		aClass696_Sub6_10675
		    = new Class696_Sub6(aClass696_Sub6_10692
					    .method17028((byte) 98),
					this);
		aClass696_Sub30_10696
		    = new Class696_Sub30(class525_sub38.readUnsignedByte(248016533),
					 this);
		if (i_0_ >= 25)
		    aClass696_Sub42_10717
			= new Class696_Sub42(class525_sub38
						 .readUnsignedByte(1991838143),
					     this);
		aClass696_Sub17_10676
		    = new Class696_Sub17(class525_sub38
					     .readUnsignedByte(1311706192),
					 this);
		if (i_0_ <= 25)
		    class525_sub38.index += 339428471;
		aClass696_Sub4_10728
		    = new Class696_Sub4(class525_sub38.readUnsignedByte(1081837398),
					this);
		aClass696_Sub20_10701
		    = new Class696_Sub20(class525_sub38.readUnsignedByte(963989500),
					 this);
		aClass696_Sub20_10708
		    = new Class696_Sub20(aClass696_Sub20_10701
					     .method17160(-1750527124),
					 this);
		class525_sub38.readUnsignedByte(1703102809);
		aClass696_Sub12_10698
		    = new Class696_Sub12(class525_sub38.readUnsignedByte(941449711),
					 this);
		aClass696_Sub41_10704
		    = new Class696_Sub41(class525_sub38
					     .readUnsignedByte(1615752491),
					 this);
		if (i_0_ >= 35) {
		    aClass696_Sub22_10707
			= new Class696_Sub22(class525_sub38
						 .readUnsignedByte(428348555),
					     this);
		    aClass696_Sub3_10690
			= new Class696_Sub3(class525_sub38
						.readUnsignedByte(72830558),
					    this);
		    aClass696_Sub10_10709
			= new Class696_Sub10(class525_sub38
						 .readUnsignedByte(575629334),
					     this);
		    aClass696_Sub18_10706
			= new Class696_Sub18(class525_sub38
						 .readUnsignedByte(513519462),
					     this);
		    aClass696_Sub35_10673
			= new Class696_Sub35(class525_sub38
						 .readUnsignedByte(1400123520),
					     this);
		    aClass696_Sub31_10711
			= new Class696_Sub31(class525_sub38
						 .readByte(-1150098071),
					     this);
		}
		if (i_0_ >= 36) {
		    aClass696_Sub40_10712
			= new Class696_Sub40(class525_sub38
						 .readUnsignedByte(2071007182),
					     this);
		    aClass696_Sub32_10713
			= new Class696_Sub32(class525_sub38
						 .readUnsignedByte(440034178),
					     this);
		}
		if (i_0_ >= 37) {
		    aClass696_Sub27_10703
			= new Class696_Sub27(class525_sub38
						 .readUnsignedShort((byte) 123),
					     this);
		    aClass696_Sub14_10697
			= new Class696_Sub14(class525_sub38
						 .readUnsignedShort((byte) 67),
					     this);
		}
		if (i_0_ >= 38) {
		    aClass696_Sub7_10716
			= new Class696_Sub7(class525_sub38
						.readUnsignedShort((byte) 106),
					    this);
		    aClass696_Sub43_10686
			= new Class696_Sub43(class525_sub38
						 .readUnsignedShort((byte) 110),
					     this);
		}
		aClass696_Sub41_10705
		    = new Class696_Sub41(aClass696_Sub41_10704
					     .method17337(-425403315),
					 this);
		aClass696_Sub46_10718
		    = new Class696_Sub46(class525_sub38.readUnsignedByte(936254653),
					 this);
		aClass696_Sub23_10719
		    = new Class696_Sub23(class525_sub38
					     .readUnsignedByte(1953348744),
					 this);
		aClass696_Sub28_10720
		    = new Class696_Sub28(class525_sub38
					     .readUnsignedByte(1720890544),
					 this);
		aClass696_Sub38_10721
		    = new Class696_Sub38(class525_sub38.readUnsignedByte(76843811),
					 this);
		aClass696_Sub29_10722
		    = new Class696_Sub29(class525_sub38.readUnsignedByte(344798177),
					 this);
		if (i_0_ >= 26)
		    aClass696_Sub25_10723
			= new Class696_Sub25(class525_sub38
						 .readUnsignedByte(1960114145),
					     this);
		if (i_0_ >= 28)
		    aClass696_Sub44_10724
			= new Class696_Sub44(class525_sub38
						 .readUnsignedByte(1069075743),
					     this);
		if (i_0_ >= 30)
		    aClass696_Sub34_10683
			= new Class696_Sub34(class525_sub38
						 .readUnsignedByte(97264698),
					     this);
		aClass696_Sub45_10710
		    = new Class696_Sub45(class525_sub38
					     .readUnsignedByte(1121868303),
					 this);
		aClass696_Sub45_10726
		    = new Class696_Sub45(class525_sub38
					     .readUnsignedByte(1236913355),
					 this);
		aClass696_Sub45_10727
		    = new Class696_Sub45(class525_sub38
					     .readUnsignedByte(1375527403),
					 this);
		aClass696_Sub45_10702
		    = new Class696_Sub45(class525_sub38.readUnsignedByte(830941629),
					 this);
		aClass696_Sub45_10729
		    = new Class696_Sub45(class525_sub38.readUnsignedByte(29577987),
					 this);
		aClass696_Sub47_10730
		    = new Class696_Sub47(class525_sub38.readUnsignedByte(526848492),
					 this);
		method16498(false, i_0_ < 32, (byte) -59);
	    }
	}
	method16504(-745710759);
    }
    
    public Class525_Sub30(RSBuffer class525_sub38, Class668 class668,
						  int i) {
	aClass668_10674 = class668;
	aClass701_10714
	    = new Class701(Class503.anInt5590 * -855455283,
			   389852961 * Class503.anInt5598,
			   Class285.aString3142.indexOf("arm") != -1,
			   Class396.aString4106.startsWith("win"), false);
	aClass696_Sub20_10708 = new Class696_Sub20(i, this);
	method16497(class525_sub38, (byte) 78);
    }
    
    void method16498(boolean bool, boolean bool_1_, byte i) {
	if (bool || aClass696_Sub36_10699 == null)
	    aClass696_Sub36_10699 = new Class696_Sub36(this);
	if (bool || aClass696_Sub39_10677 == null)
	    aClass696_Sub39_10677 = new Class696_Sub39(this);
	if (bool || null == aClass696_Sub33_10679)
	    aClass696_Sub33_10679 = new Class696_Sub33(this);
	if (bool || aClass696_Sub39_10678 == null)
	    aClass696_Sub39_10678
		= new Class696_Sub39(aClass696_Sub39_10677
					 .method17324(-16711936),
				     this);
	if (bool || null == aClass696_Sub37_10680)
	    aClass696_Sub37_10680 = new Class696_Sub37(this);
	if (bool || aClass696_Sub13_10681 == null)
	    aClass696_Sub13_10681 = new Class696_Sub13(this);
	if (bool || null == aClass696_Sub26_10682)
	    aClass696_Sub26_10682 = new Class696_Sub26(this);
	if (bool || aClass696_Sub19_10684 == null)
	    aClass696_Sub19_10684 = new Class696_Sub19(this);
	if (bool || aClass696_Sub5_10685 == null)
	    aClass696_Sub5_10685 = new Class696_Sub5(this);
	if (bool || aClass696_Sub8_10671 == null)
	    aClass696_Sub8_10671 = new Class696_Sub8(this);
	if (bool || aClass696_Sub24_10687 == null)
	    aClass696_Sub24_10687 = new Class696_Sub24(this);
	if (bool || aClass696_Sub11_10688 == null)
	    aClass696_Sub11_10688 = new Class696_Sub11(this);
	if (bool || null == aClass696_Sub21_10689)
	    aClass696_Sub21_10689 = new Class696_Sub21(this);
	if (bool || null == aClass696_Sub9_10691)
	    aClass696_Sub9_10691 = new Class696_Sub9(this);
	if (bool || null == aClass696_Sub15_10715)
	    aClass696_Sub15_10715 = new Class696_Sub15(this);
	if (bool || aClass696_Sub16_10670 == null)
	    aClass696_Sub16_10670 = new Class696_Sub16(this);
	if (bool || aClass696_Sub1_10693 == null)
	    aClass696_Sub1_10693 = new Class696_Sub1(this);
	if (bool || aClass696_Sub2_10694 == null)
	    aClass696_Sub2_10694 = new Class696_Sub2(this);
	if (bool || null == aClass696_Sub6_10692)
	    aClass696_Sub6_10692 = new Class696_Sub6(this);
	if (bool || null == aClass696_Sub6_10675)
	    aClass696_Sub6_10675
		= new Class696_Sub6(aClass696_Sub6_10692
					.method17028((byte) 72),
				    this);
	if (bool || null == aClass696_Sub30_10696)
	    aClass696_Sub30_10696 = new Class696_Sub30(this);
	if (bool || null == aClass696_Sub42_10717)
	    aClass696_Sub42_10717 = new Class696_Sub42(this);
	if (bool || null == aClass696_Sub17_10676)
	    aClass696_Sub17_10676 = new Class696_Sub17(this);
	if (bool || aClass696_Sub4_10728 == null)
	    aClass696_Sub4_10728 = new Class696_Sub4(this);
	if (bool || null == aClass696_Sub20_10701)
	    aClass696_Sub20_10701 = new Class696_Sub20(this);
	if (bool || aClass696_Sub20_10708 == null)
	    aClass696_Sub20_10708
		= new Class696_Sub20(aClass696_Sub20_10701
					 .method17160(981585852),
				     this);
	if (bool || null == aClass696_Sub12_10698)
	    aClass696_Sub12_10698 = new Class696_Sub12(this);
	if (bool || null == aClass696_Sub41_10704)
	    aClass696_Sub41_10704 = new Class696_Sub41(this);
	if (bool || null == aClass696_Sub41_10705)
	    aClass696_Sub41_10705
		= new Class696_Sub41(aClass696_Sub41_10704
					 .method17337(1042836749),
				     this);
	if (bool || aClass696_Sub18_10706 == null)
	    aClass696_Sub18_10706 = new Class696_Sub18(this);
	if (bool || null == aClass696_Sub22_10707)
	    aClass696_Sub22_10707 = new Class696_Sub22(this);
	if (bool || aClass696_Sub3_10690 == null)
	    aClass696_Sub3_10690 = new Class696_Sub3(this);
	if (bool || aClass696_Sub10_10709 == null)
	    aClass696_Sub10_10709 = new Class696_Sub10(this);
	if (bool || aClass696_Sub35_10673 == null)
	    aClass696_Sub35_10673 = new Class696_Sub35(this);
	if (bool || aClass696_Sub31_10711 == null)
	    aClass696_Sub31_10711 = new Class696_Sub31(this);
	if (bool || aClass696_Sub40_10712 == null)
	    aClass696_Sub40_10712 = new Class696_Sub40(this);
	if (bool || aClass696_Sub32_10713 == null)
	    aClass696_Sub32_10713 = new Class696_Sub32(this);
	if (bool || null == aClass696_Sub27_10703)
	    aClass696_Sub27_10703 = new Class696_Sub27(this);
	if (bool || null == aClass696_Sub14_10697)
	    aClass696_Sub14_10697 = new Class696_Sub14(this);
	if (bool || aClass696_Sub7_10716 == null)
	    aClass696_Sub7_10716 = new Class696_Sub7(this);
	if (bool || aClass696_Sub43_10686 == null)
	    aClass696_Sub43_10686 = new Class696_Sub43(this);
	if (bool || null == aClass696_Sub46_10718)
	    aClass696_Sub46_10718 = new Class696_Sub46(this);
	if (bool || aClass696_Sub23_10719 == null)
	    aClass696_Sub23_10719 = new Class696_Sub23(this);
	if (bool || null == aClass696_Sub28_10720)
	    aClass696_Sub28_10720 = new Class696_Sub28(this);
	if (bool || null == aClass696_Sub38_10721)
	    aClass696_Sub38_10721 = new Class696_Sub38(this);
	if (bool || null == aClass696_Sub29_10722)
	    aClass696_Sub29_10722 = new Class696_Sub29(this);
	if (bool || aClass696_Sub25_10723 == null)
	    aClass696_Sub25_10723 = new Class696_Sub25(this);
	if (bool || null == aClass696_Sub44_10724)
	    aClass696_Sub44_10724 = new Class696_Sub44(this);
	if (bool || null == aClass696_Sub34_10683)
	    aClass696_Sub34_10683 = new Class696_Sub34(this);
	if (bool || bool_1_ || null == aClass696_Sub45_10710)
	    aClass696_Sub45_10710 = new Class696_Sub45(this);
	if (bool || bool_1_ || null == aClass696_Sub45_10726)
	    aClass696_Sub45_10726 = new Class696_Sub45(this);
	if (bool || bool_1_ || null == aClass696_Sub45_10727)
	    aClass696_Sub45_10727 = new Class696_Sub45(this);
	if (bool || bool_1_ || aClass696_Sub45_10702 == null)
	    aClass696_Sub45_10702 = new Class696_Sub45(this);
	if (bool || bool_1_ || null == aClass696_Sub45_10729)
	    aClass696_Sub45_10729 = new Class696_Sub45(this);
	if (bool || bool_1_ || null == aClass696_Sub47_10730)
	    aClass696_Sub47_10730 = new Class696_Sub47(this);
    }
    
    public RSBuffer method16499() {
	RSBuffer class525_sub38 = new RSBuffer(59);
	class525_sub38.method16735(38, -462085865);
	class525_sub38.method16735(aClass696_Sub36_10699
				       .method17294(920654884),
				   -294021591);
	class525_sub38.method16735(aClass696_Sub39_10677
				       .method17324(-16711936),
				   -1208229991);
	class525_sub38.method16735(aClass696_Sub33_10679
				       .method17267((byte) 69),
				   -1909378488);
	class525_sub38.method16735(aClass696_Sub37_10680
				       .method17305((byte) 13),
				   -438172379);
	class525_sub38.method16735(aClass696_Sub13_10681
				       .method17081(-1834268975),
				   -2117047751);
	class525_sub38.method16735(aClass696_Sub26_10682
				       .method17219((byte) -68),
				   -1442823329);
	class525_sub38.method16735(aClass696_Sub19_10684
				       .method17144(-29047449),
				   -507420917);
	class525_sub38.method16735(aClass696_Sub5_10685
				       .method17018(-1562761209),
				   -1556639801);
	class525_sub38.method16735(aClass696_Sub8_10671
				       .method17043(-1591557455),
				   -218839562);
	class525_sub38.method16735(aClass696_Sub24_10687.method17197((byte) 9),
				   -776895590);
	class525_sub38.method16735(aClass696_Sub11_10688
				       .method17067((short) 255),
				   -1023283294);
	class525_sub38.method16735(aClass696_Sub21_10689
				       .method17167(-1324729358),
				   -1373721151);
	class525_sub38.method16735(aClass696_Sub9_10691.method17050(501271953),
				   -2092321695);
	class525_sub38.method16735(aClass696_Sub15_10715
				       .method17108(1512371807),
				   -647814577);
	class525_sub38.method16735(aClass696_Sub16_10670
				       .method17113((short) -23465),
				   -1443121832);
	class525_sub38.method16735(0, -513246087);
	class525_sub38.method16735(aClass696_Sub1_10693.method16891((byte) 1),
				   -1504385815);
	class525_sub38.method16735(aClass696_Sub2_10694
				       .method16902(-859425744),
				   -1228174929);
	class525_sub38.method16735(aClass696_Sub6_10692.method17028((byte) 21),
				   -1886651974);
	class525_sub38.method16735(aClass696_Sub30_10696
				       .method17247(-227177518),
				   -855935080);
	class525_sub38.method16735(aClass696_Sub42_10717
				       .method17348((short) 10242),
				   -1676525125);
	class525_sub38.method16735(aClass696_Sub17_10676
				       .method17123(-1437085740),
				   -921319199);
	class525_sub38.method16735(aClass696_Sub4_10728
				       .method16985(1462825613),
				   -511972607);
	class525_sub38.method16735(aClass696_Sub20_10701
				       .method17160(1563631487),
				   -1718139401);
	class525_sub38.method16735(0, -658589516);
	class525_sub38.method16735(aClass696_Sub12_10698
				       .method17074(-132813946),
				   -289838826);
	class525_sub38.method16735(aClass696_Sub41_10704
				       .method17337(1083919991),
				   -1321013359);
	class525_sub38.method16735(aClass696_Sub22_10707
				       .method17174(2034719907),
				   -2085059707);
	class525_sub38.method16735(aClass696_Sub3_10690
				       .method16977(1214798938),
				   -945216450);
	class525_sub38.method16735(aClass696_Sub10_10709
				       .method17055(1926698712),
				   -722945972);
	class525_sub38.method16735(aClass696_Sub18_10706
				       .method17136((short) -4672),
				   -2111863168);
	class525_sub38.method16735(aClass696_Sub35_10673
				       .method17288(-1445589163),
				   -1570570229);
	class525_sub38.method16735(aClass696_Sub31_10711
				       .method17260(1159883408),
				   -2127137669);
	class525_sub38.method16735(aClass696_Sub40_10712
				       .method17329(-2088953250),
				   -592377326);
	class525_sub38.method16735(aClass696_Sub32_10713
				       .method17263(1998535401),
				   -2092377688);
	class525_sub38.method16602(aClass696_Sub27_10703
				       .method17224((byte) 38),
				   1675352943);
	class525_sub38.method16602(aClass696_Sub14_10697
				       .method17089(-2014979150),
				   2004595022);
	class525_sub38.method16602(aClass696_Sub7_10716.method17035((byte) 13),
				   678105423);
	class525_sub38.method16602(aClass696_Sub43_10686
				       .method17356(-1301764801),
				   675630578);
	class525_sub38.method16735(aClass696_Sub46_10718
				       .method17437(-789046725),
				   -120906610);
	class525_sub38.method16735(aClass696_Sub23_10719
				       .method17189(-2058168833),
				   -272317565);
	class525_sub38.method16735(aClass696_Sub28_10720
				       .method17232(-1842080716),
				   -1493437028);
	class525_sub38.method16735(aClass696_Sub38_10721
				       .method17314(1792792034),
				   -1039250706);
	class525_sub38.method16735(aClass696_Sub29_10722
				       .method17240(2128098577),
				   -214384934);
	class525_sub38.method16735(aClass696_Sub25_10723
				       .method17208(424135869),
				   -1499759707);
	class525_sub38.method16735(aClass696_Sub44_10724
				       .method17363(1898980348),
				   -1855349749);
	class525_sub38.method16735(aClass696_Sub34_10683
				       .method17279((short) -29191),
				   -599582694);
	class525_sub38.method16735(aClass696_Sub45_10710
				       .method17416(2036250441),
				   -1246497467);
	class525_sub38.method16735(aClass696_Sub45_10726
				       .method17416(1616358656),
				   -377583933);
	class525_sub38.method16735(aClass696_Sub45_10727
				       .method17416(1536998420),
				   -394166533);
	class525_sub38.method16735(aClass696_Sub45_10702
				       .method17416(1220674429),
				   -1244807516);
	class525_sub38.method16735(aClass696_Sub45_10729
				       .method17416(873930412),
				   -679245826);
	class525_sub38.method16735(aClass696_Sub47_10730.method17457((byte) 2),
				   -1320172189);
	return class525_sub38;
    }
    
    public RSBuffer method16500() {
	RSBuffer class525_sub38 = new RSBuffer(59);
	class525_sub38.method16735(38, -291692634);
	class525_sub38.method16735(aClass696_Sub36_10699
				       .method17294(343647702),
				   -1613332610);
	class525_sub38.method16735(aClass696_Sub39_10677
				       .method17324(-16711936),
				   -273521878);
	class525_sub38.method16735(aClass696_Sub33_10679
				       .method17267((byte) -32),
				   -1430404230);
	class525_sub38.method16735(aClass696_Sub37_10680.method17305((byte) 1),
				   -2139640444);
	class525_sub38.method16735(aClass696_Sub13_10681
				       .method17081(1528920039),
				   -914556968);
	class525_sub38.method16735(aClass696_Sub26_10682
				       .method17219((byte) -72),
				   -1754405408);
	class525_sub38.method16735(aClass696_Sub19_10684
				       .method17144(-29047449),
				   -311728870);
	class525_sub38.method16735(aClass696_Sub5_10685
				       .method17018(-701357736),
				   -1336903148);
	class525_sub38.method16735(aClass696_Sub8_10671.method17043(-72120945),
				   -448606357);
	class525_sub38.method16735(aClass696_Sub24_10687
				       .method17197((byte) 34),
				   -1523881990);
	class525_sub38.method16735(aClass696_Sub11_10688
				       .method17067((short) 255),
				   -2128025244);
	class525_sub38.method16735(aClass696_Sub21_10689
				       .method17167(-1208902562),
				   -1303726701);
	class525_sub38.method16735(aClass696_Sub9_10691.method17050(501271953),
				   -1358867870);
	class525_sub38.method16735(aClass696_Sub15_10715
				       .method17108(613973829),
				   -959652080);
	class525_sub38.method16735(aClass696_Sub16_10670
				       .method17113((short) -30938),
				   -178547124);
	class525_sub38.method16735(0, -275354765);
	class525_sub38.method16735(aClass696_Sub1_10693.method16891((byte) 1),
				   -1399433140);
	class525_sub38.method16735(aClass696_Sub2_10694
				       .method16902(2016761462),
				   -1686683890);
	class525_sub38.method16735(aClass696_Sub6_10692.method17028((byte) 18),
				   -2074238545);
	class525_sub38.method16735(aClass696_Sub30_10696
				       .method17247(-1751468234),
				   -727589418);
	class525_sub38.method16735(aClass696_Sub42_10717
				       .method17348((short) 10242),
				   -751297969);
	class525_sub38.method16735(aClass696_Sub17_10676
				       .method17123(457079099),
				   -436630320);
	class525_sub38.method16735(aClass696_Sub4_10728
				       .method16985(-1625172916),
				   -1405192379);
	class525_sub38.method16735(aClass696_Sub20_10701
				       .method17160(-831408584),
				   -648032412);
	class525_sub38.method16735(0, -1966003699);
	class525_sub38.method16735(aClass696_Sub12_10698
				       .method17074(899348588),
				   -615538209);
	class525_sub38.method16735(aClass696_Sub41_10704
				       .method17337(2139942716),
				   -1160691414);
	class525_sub38.method16735(aClass696_Sub22_10707.method17174(57694122),
				   -718926061);
	class525_sub38.method16735(aClass696_Sub3_10690.method16977(21175391),
				   -1744646228);
	class525_sub38.method16735(aClass696_Sub10_10709
				       .method17055(2129272783),
				   -405732524);
	class525_sub38.method16735(aClass696_Sub18_10706
				       .method17136((short) -1792),
				   -802773636);
	class525_sub38.method16735(aClass696_Sub35_10673
				       .method17288(-1445589163),
				   -260185224);
	class525_sub38.method16735(aClass696_Sub31_10711
				       .method17260(1408836989),
				   -775746087);
	class525_sub38.method16735(aClass696_Sub40_10712
				       .method17329(-1985937229),
				   -1907536199);
	class525_sub38.method16735(aClass696_Sub32_10713
				       .method17263(-320630043),
				   -1638369315);
	class525_sub38.method16602(aClass696_Sub27_10703
				       .method17224((byte) 16),
				   1446185175);
	class525_sub38.method16602(aClass696_Sub14_10697
				       .method17089(-763834839),
				   1579292322);
	class525_sub38.method16602(aClass696_Sub7_10716
				       .method17035((byte) -63),
				   1492281781);
	class525_sub38.method16602(aClass696_Sub43_10686
				       .method17356(-805616596),
				   742527671);
	class525_sub38.method16735(aClass696_Sub46_10718
				       .method17437(1872671516),
				   -413644224);
	class525_sub38.method16735(aClass696_Sub23_10719
				       .method17189(-1285690146),
				   -169193380);
	class525_sub38.method16735(aClass696_Sub28_10720
				       .method17232(-1874166117),
				   -699388900);
	class525_sub38.method16735(aClass696_Sub38_10721
				       .method17314(1429454642),
				   -815506735);
	class525_sub38.method16735(aClass696_Sub29_10722
				       .method17240(1948686581),
				   -1093974262);
	class525_sub38.method16735(aClass696_Sub25_10723
				       .method17208(424135869),
				   -1680259498);
	class525_sub38.method16735(aClass696_Sub44_10724
				       .method17363(-1327443032),
				   -761427923);
	class525_sub38.method16735(aClass696_Sub34_10683
				       .method17279((short) -29015),
				   -1761396380);
	class525_sub38.method16735(aClass696_Sub45_10710
				       .method17416(1843732547),
				   -429416904);
	class525_sub38.method16735(aClass696_Sub45_10726
				       .method17416(1502254670),
				   -1506542040);
	class525_sub38.method16735(aClass696_Sub45_10727
				       .method17416(1438266100),
				   -1279695057);
	class525_sub38.method16735(aClass696_Sub45_10702
				       .method17416(986434487),
				   -648285763);
	class525_sub38.method16735(aClass696_Sub45_10729
				       .method17416(2094032696),
				   -694881868);
	class525_sub38.method16735(aClass696_Sub47_10730.method17457((byte) 2),
				   -1783293501);
	return class525_sub38;
    }
    
    public RSBuffer method16501(int i) {
	RSBuffer class525_sub38 = new RSBuffer(59);
	class525_sub38.method16735(38, -1354506783);
	class525_sub38.method16735(aClass696_Sub36_10699
				       .method17294(-40762278),
				   -291808683);
	class525_sub38.method16735(aClass696_Sub39_10677
				       .method17324(-16711936),
				   -851707404);
	class525_sub38.method16735(aClass696_Sub33_10679
				       .method17267((byte) 19),
				   -1816963927);
	class525_sub38.method16735(aClass696_Sub37_10680
				       .method17305((byte) 61),
				   -902230971);
	class525_sub38.method16735(aClass696_Sub13_10681
				       .method17081(229313780),
				   -791755012);
	class525_sub38.method16735(aClass696_Sub26_10682
				       .method17219((byte) -18),
				   -724774759);
	class525_sub38.method16735(aClass696_Sub19_10684
				       .method17144(-29047449),
				   -1486518201);
	class525_sub38.method16735(aClass696_Sub5_10685
				       .method17018(1284346580),
				   -1439166181);
	class525_sub38.method16735(aClass696_Sub8_10671
				       .method17043(1154867572),
				   -910163805);
	class525_sub38.method16735(aClass696_Sub24_10687
				       .method17197((byte) 61),
				   -1606915367);
	class525_sub38.method16735(aClass696_Sub11_10688
				       .method17067((short) 255),
				   -416850855);
	class525_sub38.method16735(aClass696_Sub21_10689
				       .method17167(-642074573),
				   -309350895);
	class525_sub38.method16735(aClass696_Sub9_10691.method17050(501271953),
				   -1065235114);
	class525_sub38.method16735(aClass696_Sub15_10715
				       .method17108(447476121),
				   -1460294696);
	class525_sub38.method16735(aClass696_Sub16_10670
				       .method17113((short) -22650),
				   -370553390);
	class525_sub38.method16735(0, -2067168655);
	class525_sub38.method16735(aClass696_Sub1_10693.method16891((byte) 1),
				   -997215325);
	class525_sub38.method16735(aClass696_Sub2_10694
				       .method16902(-2031358496),
				   -1948839255);
	class525_sub38.method16735(aClass696_Sub6_10692.method17028((byte) 31),
				   -428068925);
	class525_sub38.method16735(aClass696_Sub30_10696
				       .method17247(1098288727),
				   -1520237610);
	class525_sub38.method16735(aClass696_Sub42_10717
				       .method17348((short) 10242),
				   -1007074019);
	class525_sub38.method16735(aClass696_Sub17_10676
				       .method17123(-919343570),
				   -1413853559);
	class525_sub38.method16735(aClass696_Sub4_10728
				       .method16985(1566626308),
				   -1112924346);
	class525_sub38.method16735(aClass696_Sub20_10701
				       .method17160(-1000089726),
				   -2033737009);
	class525_sub38.method16735(0, -845782709);
	class525_sub38.method16735(aClass696_Sub12_10698
				       .method17074(-205742800),
				   -1639751558);
	class525_sub38.method16735(aClass696_Sub41_10704
				       .method17337(-222694672),
				   -1334859926);
	class525_sub38.method16735(aClass696_Sub22_10707
				       .method17174(-1753763740),
				   -2092833962);
	class525_sub38.method16735(aClass696_Sub3_10690
				       .method16977(1282024279),
				   -542255341);
	class525_sub38.method16735(aClass696_Sub10_10709
				       .method17055(2037644037),
				   -682522204);
	class525_sub38.method16735(aClass696_Sub18_10706
				       .method17136((short) -10581),
				   -1526806581);
	class525_sub38.method16735(aClass696_Sub35_10673
				       .method17288(-1445589163),
				   -544957313);
	class525_sub38.method16735(aClass696_Sub31_10711
				       .method17260(731068939),
				   -1043146491);
	class525_sub38.method16735(aClass696_Sub40_10712
				       .method17329(-2039309556),
				   -1130003422);
	class525_sub38.method16735(aClass696_Sub32_10713
				       .method17263(1635716417),
				   -903986024);
	class525_sub38.method16602(aClass696_Sub27_10703.method17224((byte) 9),
				   1043373664);
	class525_sub38.method16602(aClass696_Sub14_10697
				       .method17089(432604888),
				   795133580);
	class525_sub38.method16602(aClass696_Sub7_10716
				       .method17035((byte) -50),
				   2040964132);
	class525_sub38.method16602(aClass696_Sub43_10686
				       .method17356(-1226615707),
				   956634109);
	class525_sub38.method16735(aClass696_Sub46_10718
				       .method17437(1817580790),
				   -320772124);
	class525_sub38.method16735(aClass696_Sub23_10719
				       .method17189(-1134972943),
				   -2139866549);
	class525_sub38.method16735(aClass696_Sub28_10720
				       .method17232(-1919357493),
				   -2135722185);
	class525_sub38.method16735(aClass696_Sub38_10721
				       .method17314(1041458667),
				   -918714101);
	class525_sub38.method16735(aClass696_Sub29_10722
				       .method17240(1223049748),
				   -1324717269);
	class525_sub38.method16735(aClass696_Sub25_10723
				       .method17208(424135869),
				   -777365132);
	class525_sub38.method16735(aClass696_Sub44_10724
				       .method17363(1180938203),
				   -1551234343);
	class525_sub38.method16735(aClass696_Sub34_10683
				       .method17279((short) 96),
				   -1410138217);
	class525_sub38.method16735(aClass696_Sub45_10710
				       .method17416(942136786),
				   -735646616);
	class525_sub38.method16735(aClass696_Sub45_10726
				       .method17416(1239599991),
				   -421877796);
	class525_sub38.method16735(aClass696_Sub45_10727
				       .method17416(1447273851),
				   -689551563);
	class525_sub38.method16735(aClass696_Sub45_10702
				       .method17416(1855876101),
				   -1993559731);
	class525_sub38.method16735(aClass696_Sub45_10729
				       .method17416(1769455754),
				   -335014940);
	class525_sub38.method16735(aClass696_Sub47_10730.method17457((byte) 2),
				   -1041211230);
	return class525_sub38;
    }
    
    public void method16502(Class696 class696, int i, byte i_2_) {
	class696.method14170(i, 2129161704);
	method16504(-348362736);
    }
    
    public void method16503(Class696_Sub20 class696_sub20, boolean bool,
			    byte i) {
	class696_sub20.method17151(bool, -1181242607);
	method16504(-398752469);
    }
    
    void method16504(int i) {
	aClass696_Sub36_10699.method17293(2049659143);
	aClass696_Sub39_10677.method17320(-1700367108);
	aClass696_Sub33_10679.method17268((byte) 73);
	aClass696_Sub39_10678.method17320(-1672059460);
	aClass696_Sub37_10680.method17303((short) 1099);
	aClass696_Sub13_10681.method17080(1349398812);
	aClass696_Sub26_10682.method17212((byte) -59);
	aClass696_Sub19_10684.method17143((short) 19385);
	aClass696_Sub5_10685.method17016(-244069987);
	aClass696_Sub8_10671.method17042(-1791685534);
	aClass696_Sub24_10687.method17195((short) 8594);
	aClass696_Sub11_10688.method17065(787570971);
	aClass696_Sub21_10689.method17165(-712688998);
	aClass696_Sub9_10691.method17053(-379805342);
	aClass696_Sub15_10715.method17097(-1365862064);
	aClass696_Sub16_10670.method17120(675486541);
	aClass696_Sub1_10693.method16889(-1629772231);
	aClass696_Sub2_10694.method16900((byte) 7);
	aClass696_Sub6_10692.method17026((byte) 82);
	aClass696_Sub6_10675.method17026((byte) 52);
	aClass696_Sub30_10696.method17249(-707527632);
	aClass696_Sub42_10717.method17346((byte) 0);
	aClass696_Sub17_10676.method17122(867170455);
	aClass696_Sub4_10728.method16984(1467211680);
	aClass696_Sub20_10701.method17153(1783194530);
	aClass696_Sub20_10708.method17153(1348079669);
	aClass696_Sub12_10698.method17072((byte) 2);
	aClass696_Sub41_10704.method17338(799085720);
	aClass696_Sub41_10705.method17338(799085720);
	aClass696_Sub18_10706.method17133((byte) -27);
	aClass696_Sub22_10707.method17175(2141081146);
	aClass696_Sub3_10690.method16976(1066688277);
	aClass696_Sub10_10709.method17056(-635670216);
	aClass696_Sub35_10673.method17286(-1612989114);
	aClass696_Sub31_10711.method17254((byte) 95);
	aClass696_Sub40_10712.method17328((byte) 27);
	aClass696_Sub32_10713.method17262((byte) -74);
	aClass696_Sub27_10703.method17223(1690202066);
	aClass696_Sub14_10697.method17090(-1892784431);
	aClass696_Sub7_10716.method17037(-32228570);
	aClass696_Sub43_10686.method17355(-681390286);
	aClass696_Sub46_10718.method17445(-1111171505);
	aClass696_Sub23_10719.method17186(-2084200513);
	aClass696_Sub28_10720.method17231(-506459158);
	aClass696_Sub38_10721.method17312((byte) 7);
	aClass696_Sub29_10722.method17241((byte) -91);
	aClass696_Sub25_10723.method17204(-296963980);
	aClass696_Sub44_10724.method17366(-1825333364);
	aClass696_Sub34_10683.method17278(-1624686937);
	aClass696_Sub45_10710.method17413(2062705285);
	aClass696_Sub45_10726.method17413(-1005789681);
	aClass696_Sub45_10727.method17413(-88816079);
	aClass696_Sub45_10702.method17413(1104880174);
	aClass696_Sub45_10729.method17413(-538357479);
	aClass696_Sub47_10730.method17456((short) -6267);
    }
    
    public Class668 method16505(int i) {
	return aClass668_10674;
    }
    
    public Class701 method16506(int i) {
	return aClass701_10714;
    }
    
    void method16507(RSBuffer class525_sub38, int i) {
	aClass696_Sub13_10681
	    = new Class696_Sub13(class525_sub38.readUnsignedByte(1377786735), this);
	class525_sub38.index += 339428471;
	aClass696_Sub6_10692
	    = new Class696_Sub6(class525_sub38.readUnsignedByte(348946705) + 1,
				this);
	aClass696_Sub11_10688
	    = new Class696_Sub11(class525_sub38.readUnsignedByte(-11596612), this);
	class525_sub38.index += 339428471;
	aClass696_Sub21_10689
	    = new Class696_Sub21(class525_sub38.readUnsignedByte(2049379469), this);
	aClass696_Sub5_10685
	    = new Class696_Sub5(class525_sub38.readUnsignedByte(982734395), this);
	class525_sub38.readUnsignedByte(187761492);
	aClass696_Sub17_10676
	    = new Class696_Sub17(class525_sub38.readUnsignedByte(448799693), this);
	int i_3_ = class525_sub38.readUnsignedByte(2060270877);
	int i_4_ = 0;
	if (i >= 17)
	    i_4_ = class525_sub38.readUnsignedByte(587289058);
	aClass696_Sub15_10715
	    = new Class696_Sub15(i_3_ > i_4_ ? i_3_ : i_4_, this);
	boolean bool = true;
	boolean bool_5_ = true;
	if (i >= 2) {
	    bool = class525_sub38.readUnsignedByte(168073902) == 1;
	    if (i >= 17)
		bool_5_ = class525_sub38.readUnsignedByte(1292378036) == 1;
	} else {
	    bool = class525_sub38.readUnsignedByte(116218548) == 1;
	    class525_sub38.readUnsignedByte(1286224606);
	}
	aClass696_Sub9_10691 = new Class696_Sub9(bool | bool_5_ ? 1 : 0, this);
	aClass696_Sub12_10698
	    = new Class696_Sub12(class525_sub38.readUnsignedByte(497071222), this);
	aClass696_Sub8_10671
	    = new Class696_Sub8(class525_sub38.readUnsignedByte(973553528), this);
	aClass696_Sub39_10677
	    = new Class696_Sub39(class525_sub38.readUnsignedByte(211691952), this);
	aClass696_Sub47_10730
	    = new Class696_Sub47(class525_sub38.readUnsignedByte(2118228248), this);
	aClass696_Sub45_10710
	    = new Class696_Sub45(class525_sub38.readUnsignedByte(606413379), this);
	if (i >= 20)
	    aClass696_Sub45_10727
		= new Class696_Sub45(class525_sub38.readUnsignedByte(1686925213),
				     this);
	else
	    aClass696_Sub45_10727
		= new Class696_Sub45(aClass696_Sub45_10710
					 .method17416(1557849639),
				     this);
	aClass696_Sub45_10702
	    = new Class696_Sub45(class525_sub38.readUnsignedByte(1217942429), this);
	aClass696_Sub45_10726
	    = new Class696_Sub45(class525_sub38.readUnsignedByte(1151615235), this);
	if (i >= 21)
	    aClass696_Sub45_10729
		= new Class696_Sub45(class525_sub38.readUnsignedByte(1754979629),
				     this);
	else
	    aClass696_Sub45_10729
		= new Class696_Sub45(aClass696_Sub45_10702
					 .method17416(1602250675),
				     this);
	if (i >= 1) {
	    class525_sub38.readUnsignedShort((byte) 101);
	    class525_sub38.readUnsignedShort((byte) 5);
	}
	if (i >= 3 && i < 6)
	    class525_sub38.readUnsignedByte(649310921);
	if (i >= 4)
	    aClass696_Sub2_10694
		= new Class696_Sub2(class525_sub38.readUnsignedByte(774915238),
				    this);
	class525_sub38.readInt(1405172910);
	if (i >= 6)
	    aClass696_Sub41_10704
		= new Class696_Sub41(class525_sub38.readUnsignedByte(469929593),
				     this);
	if (i >= 7)
	    aClass696_Sub29_10722
		= new Class696_Sub29(class525_sub38.readUnsignedByte(875712871),
				     this);
	if (i >= 8)
	    class525_sub38.readUnsignedByte(1574966583);
	if (i >= 9)
	    aClass696_Sub26_10682
		= new Class696_Sub26(class525_sub38.readUnsignedByte(1425364510),
				     this);
	if (i >= 10)
	    aClass696_Sub37_10680
		= new Class696_Sub37(class525_sub38.readUnsignedByte(966010631),
				     this);
	if (i >= 11)
	    aClass696_Sub46_10718
		= new Class696_Sub46(class525_sub38.readUnsignedByte(487823878),
				     this);
	if (i >= 12)
	    aClass696_Sub21_10689
		= new Class696_Sub21(class525_sub38.readUnsignedByte(377447180),
				     this);
	if (i >= 13)
	    aClass696_Sub24_10687
		= new Class696_Sub24(class525_sub38.readUnsignedByte(495666023),
				     this);
	if (i >= 14)
	    aClass696_Sub20_10701
		= new Class696_Sub20(class525_sub38.readUnsignedByte(1936420579),
				     this);
	if (i >= 15)
	    aClass696_Sub28_10720
		= new Class696_Sub28(class525_sub38.readUnsignedByte(1521088760),
				     this);
	if (i >= 16)
	    aClass696_Sub4_10728
		= new Class696_Sub4(class525_sub38.readUnsignedByte(1745414177),
				    this);
	if (i >= 18)
	    aClass696_Sub23_10719
		= new Class696_Sub23(class525_sub38.readUnsignedByte(1044907664),
				     this);
	if (i >= 19)
	    aClass696_Sub30_10696
		= new Class696_Sub30(class525_sub38.readUnsignedByte(441025231),
				     this);
	if (i >= 22)
	    aClass696_Sub38_10721
		= new Class696_Sub38(class525_sub38.readUnsignedByte(1479621695),
				     this);
    }
    
    public RSBuffer method16508() {
	RSBuffer class525_sub38 = new RSBuffer(59);
	class525_sub38.method16735(38, -1509327189);
	class525_sub38.method16735(aClass696_Sub36_10699
				       .method17294(988927530),
				   -624760648);
	class525_sub38.method16735(aClass696_Sub39_10677
				       .method17324(-16711936),
				   -1330680717);
	class525_sub38.method16735(aClass696_Sub33_10679
				       .method17267((byte) -4),
				   -835056070);
	class525_sub38.method16735(aClass696_Sub37_10680
				       .method17305((byte) 60),
				   -2023907123);
	class525_sub38.method16735(aClass696_Sub13_10681
				       .method17081(1094245448),
				   -2123710810);
	class525_sub38.method16735(aClass696_Sub26_10682
				       .method17219((byte) -109),
				   -1313928184);
	class525_sub38.method16735(aClass696_Sub19_10684
				       .method17144(-29047449),
				   -208201157);
	class525_sub38.method16735(aClass696_Sub5_10685
				       .method17018(1891213569),
				   -388640811);
	class525_sub38.method16735(aClass696_Sub8_10671
				       .method17043(-456258187),
				   -1834923429);
	class525_sub38.method16735(aClass696_Sub24_10687
				       .method17197((byte) 74),
				   -1783198213);
	class525_sub38.method16735(aClass696_Sub11_10688
				       .method17067((short) 255),
				   -328107352);
	class525_sub38.method16735(aClass696_Sub21_10689
				       .method17167(-1259394296),
				   -905381188);
	class525_sub38.method16735(aClass696_Sub9_10691.method17050(501271953),
				   -2115652417);
	class525_sub38.method16735(aClass696_Sub15_10715
				       .method17108(1525388521),
				   -1074954301);
	class525_sub38.method16735(aClass696_Sub16_10670
				       .method17113((short) -15267),
				   -888906852);
	class525_sub38.method16735(0, -1516299449);
	class525_sub38.method16735(aClass696_Sub1_10693.method16891((byte) 1),
				   -395662919);
	class525_sub38.method16735(aClass696_Sub2_10694
				       .method16902(-1178545275),
				   -1340570153);
	class525_sub38.method16735(aClass696_Sub6_10692.method17028((byte) 75),
				   -1430004627);
	class525_sub38.method16735(aClass696_Sub30_10696
				       .method17247(-792492711),
				   -1554365643);
	class525_sub38.method16735(aClass696_Sub42_10717
				       .method17348((short) 10242),
				   -1998924829);
	class525_sub38.method16735(aClass696_Sub17_10676
				       .method17123(-744509417),
				   -244933044);
	class525_sub38.method16735(aClass696_Sub4_10728.method16985(765105082),
				   -1145298200);
	class525_sub38.method16735(aClass696_Sub20_10701
				       .method17160(239406110),
				   -1656473837);
	class525_sub38.method16735(0, -2069072406);
	class525_sub38.method16735(aClass696_Sub12_10698
				       .method17074(1262430258),
				   -727110154);
	class525_sub38.method16735(aClass696_Sub41_10704
				       .method17337(2145200393),
				   -1914316000);
	class525_sub38.method16735(aClass696_Sub22_10707
				       .method17174(-1940237983),
				   -562221551);
	class525_sub38.method16735(aClass696_Sub3_10690.method16977(601607270),
				   -1916975439);
	class525_sub38.method16735(aClass696_Sub10_10709
				       .method17055(1979188274),
				   -942950788);
	class525_sub38.method16735(aClass696_Sub18_10706
				       .method17136((short) -6996),
				   -2142123908);
	class525_sub38.method16735(aClass696_Sub35_10673
				       .method17288(-1445589163),
				   -1151497973);
	class525_sub38.method16735(aClass696_Sub31_10711
				       .method17260(1770268378),
				   -1045159948);
	class525_sub38.method16735(aClass696_Sub40_10712
				       .method17329(-1939319481),
				   -2005392762);
	class525_sub38.method16735(aClass696_Sub32_10713
				       .method17263(-1266078581),
				   -708940958);
	class525_sub38.method16602(aClass696_Sub27_10703
				       .method17224((byte) 42),
				   1166644247);
	class525_sub38.method16602(aClass696_Sub14_10697
				       .method17089(-339686577),
				   1135830084);
	class525_sub38.method16602(aClass696_Sub7_10716
				       .method17035((byte) -67),
				   1438795128);
	class525_sub38.method16602(aClass696_Sub43_10686
				       .method17356(-1637741562),
				   1327571413);
	class525_sub38.method16735(aClass696_Sub46_10718
				       .method17437(-735386808),
				   -544799912);
	class525_sub38.method16735(aClass696_Sub23_10719
				       .method17189(-1721826835),
				   -1883431870);
	class525_sub38.method16735(aClass696_Sub28_10720
				       .method17232(-1936878388),
				   -1148719389);
	class525_sub38.method16735(aClass696_Sub38_10721
				       .method17314(545156346),
				   -1177509826);
	class525_sub38.method16735(aClass696_Sub29_10722.method17240(66761511),
				   -303563082);
	class525_sub38.method16735(aClass696_Sub25_10723
				       .method17208(424135869),
				   -883431743);
	class525_sub38.method16735(aClass696_Sub44_10724
				       .method17363(1740826290),
				   -138108053);
	class525_sub38.method16735(aClass696_Sub34_10683
				       .method17279((short) -8758),
				   -1511489828);
	class525_sub38.method16735(aClass696_Sub45_10710
				       .method17416(2083726867),
				   -1669875356);
	class525_sub38.method16735(aClass696_Sub45_10726
				       .method17416(890240889),
				   -817383626);
	class525_sub38.method16735(aClass696_Sub45_10727
				       .method17416(2103554767),
				   -1803740972);
	class525_sub38.method16735(aClass696_Sub45_10702
				       .method17416(861319390),
				   -269747880);
	class525_sub38.method16735(aClass696_Sub45_10729
				       .method17416(1077997994),
				   -724294498);
	class525_sub38.method16735(aClass696_Sub47_10730.method17457((byte) 2),
				   -1425481889);
	return class525_sub38;
    }
    
    void method16509(boolean bool, boolean bool_6_) {
	if (bool || aClass696_Sub36_10699 == null)
	    aClass696_Sub36_10699 = new Class696_Sub36(this);
	if (bool || aClass696_Sub39_10677 == null)
	    aClass696_Sub39_10677 = new Class696_Sub39(this);
	if (bool || null == aClass696_Sub33_10679)
	    aClass696_Sub33_10679 = new Class696_Sub33(this);
	if (bool || aClass696_Sub39_10678 == null)
	    aClass696_Sub39_10678
		= new Class696_Sub39(aClass696_Sub39_10677
					 .method17324(-16711936),
				     this);
	if (bool || null == aClass696_Sub37_10680)
	    aClass696_Sub37_10680 = new Class696_Sub37(this);
	if (bool || aClass696_Sub13_10681 == null)
	    aClass696_Sub13_10681 = new Class696_Sub13(this);
	if (bool || null == aClass696_Sub26_10682)
	    aClass696_Sub26_10682 = new Class696_Sub26(this);
	if (bool || aClass696_Sub19_10684 == null)
	    aClass696_Sub19_10684 = new Class696_Sub19(this);
	if (bool || aClass696_Sub5_10685 == null)
	    aClass696_Sub5_10685 = new Class696_Sub5(this);
	if (bool || aClass696_Sub8_10671 == null)
	    aClass696_Sub8_10671 = new Class696_Sub8(this);
	if (bool || aClass696_Sub24_10687 == null)
	    aClass696_Sub24_10687 = new Class696_Sub24(this);
	if (bool || aClass696_Sub11_10688 == null)
	    aClass696_Sub11_10688 = new Class696_Sub11(this);
	if (bool || null == aClass696_Sub21_10689)
	    aClass696_Sub21_10689 = new Class696_Sub21(this);
	if (bool || null == aClass696_Sub9_10691)
	    aClass696_Sub9_10691 = new Class696_Sub9(this);
	if (bool || null == aClass696_Sub15_10715)
	    aClass696_Sub15_10715 = new Class696_Sub15(this);
	if (bool || aClass696_Sub16_10670 == null)
	    aClass696_Sub16_10670 = new Class696_Sub16(this);
	if (bool || aClass696_Sub1_10693 == null)
	    aClass696_Sub1_10693 = new Class696_Sub1(this);
	if (bool || aClass696_Sub2_10694 == null)
	    aClass696_Sub2_10694 = new Class696_Sub2(this);
	if (bool || null == aClass696_Sub6_10692)
	    aClass696_Sub6_10692 = new Class696_Sub6(this);
	if (bool || null == aClass696_Sub6_10675)
	    aClass696_Sub6_10675
		= new Class696_Sub6(aClass696_Sub6_10692
					.method17028((byte) 18),
				    this);
	if (bool || null == aClass696_Sub30_10696)
	    aClass696_Sub30_10696 = new Class696_Sub30(this);
	if (bool || null == aClass696_Sub42_10717)
	    aClass696_Sub42_10717 = new Class696_Sub42(this);
	if (bool || null == aClass696_Sub17_10676)
	    aClass696_Sub17_10676 = new Class696_Sub17(this);
	if (bool || aClass696_Sub4_10728 == null)
	    aClass696_Sub4_10728 = new Class696_Sub4(this);
	if (bool || null == aClass696_Sub20_10701)
	    aClass696_Sub20_10701 = new Class696_Sub20(this);
	if (bool || aClass696_Sub20_10708 == null)
	    aClass696_Sub20_10708
		= new Class696_Sub20(aClass696_Sub20_10701
					 .method17160(-1168713180),
				     this);
	if (bool || null == aClass696_Sub12_10698)
	    aClass696_Sub12_10698 = new Class696_Sub12(this);
	if (bool || null == aClass696_Sub41_10704)
	    aClass696_Sub41_10704 = new Class696_Sub41(this);
	if (bool || null == aClass696_Sub41_10705)
	    aClass696_Sub41_10705
		= new Class696_Sub41(aClass696_Sub41_10704
					 .method17337(1139532463),
				     this);
	if (bool || aClass696_Sub18_10706 == null)
	    aClass696_Sub18_10706 = new Class696_Sub18(this);
	if (bool || null == aClass696_Sub22_10707)
	    aClass696_Sub22_10707 = new Class696_Sub22(this);
	if (bool || aClass696_Sub3_10690 == null)
	    aClass696_Sub3_10690 = new Class696_Sub3(this);
	if (bool || aClass696_Sub10_10709 == null)
	    aClass696_Sub10_10709 = new Class696_Sub10(this);
	if (bool || aClass696_Sub35_10673 == null)
	    aClass696_Sub35_10673 = new Class696_Sub35(this);
	if (bool || aClass696_Sub31_10711 == null)
	    aClass696_Sub31_10711 = new Class696_Sub31(this);
	if (bool || aClass696_Sub40_10712 == null)
	    aClass696_Sub40_10712 = new Class696_Sub40(this);
	if (bool || aClass696_Sub32_10713 == null)
	    aClass696_Sub32_10713 = new Class696_Sub32(this);
	if (bool || null == aClass696_Sub27_10703)
	    aClass696_Sub27_10703 = new Class696_Sub27(this);
	if (bool || null == aClass696_Sub14_10697)
	    aClass696_Sub14_10697 = new Class696_Sub14(this);
	if (bool || aClass696_Sub7_10716 == null)
	    aClass696_Sub7_10716 = new Class696_Sub7(this);
	if (bool || aClass696_Sub43_10686 == null)
	    aClass696_Sub43_10686 = new Class696_Sub43(this);
	if (bool || null == aClass696_Sub46_10718)
	    aClass696_Sub46_10718 = new Class696_Sub46(this);
	if (bool || aClass696_Sub23_10719 == null)
	    aClass696_Sub23_10719 = new Class696_Sub23(this);
	if (bool || null == aClass696_Sub28_10720)
	    aClass696_Sub28_10720 = new Class696_Sub28(this);
	if (bool || null == aClass696_Sub38_10721)
	    aClass696_Sub38_10721 = new Class696_Sub38(this);
	if (bool || null == aClass696_Sub29_10722)
	    aClass696_Sub29_10722 = new Class696_Sub29(this);
	if (bool || aClass696_Sub25_10723 == null)
	    aClass696_Sub25_10723 = new Class696_Sub25(this);
	if (bool || null == aClass696_Sub44_10724)
	    aClass696_Sub44_10724 = new Class696_Sub44(this);
	if (bool || null == aClass696_Sub34_10683)
	    aClass696_Sub34_10683 = new Class696_Sub34(this);
	if (bool || bool_6_ || null == aClass696_Sub45_10710)
	    aClass696_Sub45_10710 = new Class696_Sub45(this);
	if (bool || bool_6_ || null == aClass696_Sub45_10726)
	    aClass696_Sub45_10726 = new Class696_Sub45(this);
	if (bool || bool_6_ || null == aClass696_Sub45_10727)
	    aClass696_Sub45_10727 = new Class696_Sub45(this);
	if (bool || bool_6_ || aClass696_Sub45_10702 == null)
	    aClass696_Sub45_10702 = new Class696_Sub45(this);
	if (bool || bool_6_ || null == aClass696_Sub45_10729)
	    aClass696_Sub45_10729 = new Class696_Sub45(this);
	if (bool || bool_6_ || null == aClass696_Sub47_10730)
	    aClass696_Sub47_10730 = new Class696_Sub47(this);
    }
    
    void method16510() {
	aClass696_Sub36_10699.method17293(2061097031);
	aClass696_Sub39_10677.method17320(-835010650);
	aClass696_Sub33_10679.method17268((byte) 106);
	aClass696_Sub39_10678.method17320(-825609706);
	aClass696_Sub37_10680.method17303((short) 1099);
	aClass696_Sub13_10681.method17080(-110441560);
	aClass696_Sub26_10682.method17212((byte) -41);
	aClass696_Sub19_10684.method17143((short) 28726);
	aClass696_Sub5_10685.method17016(-244069987);
	aClass696_Sub8_10671.method17042(-1791685534);
	aClass696_Sub24_10687.method17195((short) 30807);
	aClass696_Sub11_10688.method17065(1638816811);
	aClass696_Sub21_10689.method17165(-712688998);
	aClass696_Sub9_10691.method17053(-2145787693);
	aClass696_Sub15_10715.method17097(62791428);
	aClass696_Sub16_10670.method17120(1189248732);
	aClass696_Sub1_10693.method16889(1596060767);
	aClass696_Sub2_10694.method16900((byte) -57);
	aClass696_Sub6_10692.method17026((byte) 124);
	aClass696_Sub6_10675.method17026((byte) 99);
	aClass696_Sub30_10696.method17249(-508434416);
	aClass696_Sub42_10717.method17346((byte) 0);
	aClass696_Sub17_10676.method17122(-811462424);
	aClass696_Sub4_10728.method16984(1467211680);
	aClass696_Sub20_10701.method17153(2143200812);
	aClass696_Sub20_10708.method17153(2010877619);
	aClass696_Sub12_10698.method17072((byte) 2);
	aClass696_Sub41_10704.method17338(799085720);
	aClass696_Sub41_10705.method17338(799085720);
	aClass696_Sub18_10706.method17133((byte) -41);
	aClass696_Sub22_10707.method17175(1749947695);
	aClass696_Sub3_10690.method16976(1203344215);
	aClass696_Sub10_10709.method17056(-706148030);
	aClass696_Sub35_10673.method17286(-1826939460);
	aClass696_Sub31_10711.method17254((byte) 38);
	aClass696_Sub40_10712.method17328((byte) 109);
	aClass696_Sub32_10713.method17262((byte) -121);
	aClass696_Sub27_10703.method17223(1722552964);
	aClass696_Sub14_10697.method17090(-1881356157);
	aClass696_Sub7_10716.method17037(-32228570);
	aClass696_Sub43_10686.method17355(-1377681653);
	aClass696_Sub46_10718.method17445(-1742018999);
	aClass696_Sub23_10719.method17186(-2116870545);
	aClass696_Sub28_10720.method17231(1097341914);
	aClass696_Sub38_10721.method17312((byte) 7);
	aClass696_Sub29_10722.method17241((byte) -117);
	aClass696_Sub25_10723.method17204(119372691);
	aClass696_Sub44_10724.method17366(-616820202);
	aClass696_Sub34_10683.method17278(-1679842473);
	aClass696_Sub45_10710.method17413(-2081164252);
	aClass696_Sub45_10726.method17413(265810317);
	aClass696_Sub45_10727.method17413(-1481357148);
	aClass696_Sub45_10702.method17413(-1011700614);
	aClass696_Sub45_10729.method17413(577565004);
	aClass696_Sub47_10730.method17456((short) 8034);
    }
    
    void method16511(RSBuffer class525_sub38) {
	if (null == class525_sub38 || class525_sub38.buffer == null)
	    method16498(true, true, (byte) -3);
	else {
	    int i = class525_sub38.readUnsignedByte(651463427);
	    if (i < 23) {
		try {
		    method16514(class525_sub38, i, 276202374);
		} catch (Exception exception) {
		    method16498(true, true, (byte) -53);
		}
		method16498(false, true, (byte) 67);
	    } else if (i > 38)
		method16498(true, true, (byte) 42);
	    else {
		if (i >= 29)
		    aClass696_Sub36_10699
			= new Class696_Sub36(class525_sub38
						 .readUnsignedByte(786297211),
					     this);
		aClass696_Sub39_10677
		    = new Class696_Sub39(class525_sub38
					     .readUnsignedByte(1274519803),
					 this);
		if (i >= 31)
		    aClass696_Sub33_10679
			= new Class696_Sub33(class525_sub38
						 .readUnsignedByte(31559521),
					     this);
		aClass696_Sub39_10678
		    = new Class696_Sub39(aClass696_Sub39_10677
					     .method17324(-16711936),
					 this);
		aClass696_Sub37_10680
		    = new Class696_Sub37(class525_sub38.readUnsignedByte(894651635),
					 this);
		aClass696_Sub13_10681
		    = new Class696_Sub13(class525_sub38
					     .readUnsignedByte(2108170707),
					 this);
		aClass696_Sub26_10682
		    = new Class696_Sub26(class525_sub38.readUnsignedByte(735642769),
					 this);
		if (i >= 27)
		    aClass696_Sub19_10684
			= new Class696_Sub19(class525_sub38
						 .readUnsignedByte(1963017657),
					     this);
		aClass696_Sub5_10685
		    = new Class696_Sub5(class525_sub38.readUnsignedByte(1313808483),
					this);
		aClass696_Sub8_10671
		    = new Class696_Sub8(class525_sub38.readUnsignedByte(1181052334),
					this);
		aClass696_Sub24_10687
		    = new Class696_Sub24(class525_sub38
					     .readUnsignedByte(1784307573),
					 this);
		aClass696_Sub11_10688
		    = new Class696_Sub11(class525_sub38.readUnsignedByte(557836249),
					 this);
		aClass696_Sub21_10689
		    = new Class696_Sub21(class525_sub38.readUnsignedByte(594302811),
					 this);
		aClass696_Sub9_10691
		    = new Class696_Sub9(class525_sub38.readUnsignedByte(1283156234),
					this);
		aClass696_Sub15_10715
		    = new Class696_Sub15(class525_sub38
					     .readUnsignedByte(1968697489),
					 this);
		if (i >= 33)
		    aClass696_Sub16_10670
			= new Class696_Sub16(class525_sub38
						 .readUnsignedByte(1795927440),
					     this);
		if (i >= 34)
		    class525_sub38.readUnsignedByte(1790818611);
		if (i >= 24)
		    aClass696_Sub1_10693
			= new Class696_Sub1(class525_sub38
						.readUnsignedByte(1201875931),
					    this);
		aClass696_Sub2_10694
		    = new Class696_Sub2(class525_sub38.readUnsignedByte(447975603),
					this);
		aClass696_Sub6_10692
		    = new Class696_Sub6(class525_sub38.readUnsignedByte(135547313),
					this);
		aClass696_Sub6_10675
		    = new Class696_Sub6(aClass696_Sub6_10692
					    .method17028((byte) 109),
					this);
		aClass696_Sub30_10696
		    = new Class696_Sub30(class525_sub38
					     .readUnsignedByte(1297419767),
					 this);
		if (i >= 25)
		    aClass696_Sub42_10717
			= new Class696_Sub42(class525_sub38
						 .readUnsignedByte(1723779350),
					     this);
		aClass696_Sub17_10676
		    = new Class696_Sub17(class525_sub38
					     .readUnsignedByte(1961552474),
					 this);
		if (i <= 25)
		    class525_sub38.index += 339428471;
		aClass696_Sub4_10728
		    = new Class696_Sub4(class525_sub38.readUnsignedByte(1586778952),
					this);
		aClass696_Sub20_10701
		    = new Class696_Sub20(class525_sub38
					     .readUnsignedByte(1132067857),
					 this);
		aClass696_Sub20_10708
		    = new Class696_Sub20(aClass696_Sub20_10701
					     .method17160(236124991),
					 this);
		class525_sub38.readUnsignedByte(1476762345);
		aClass696_Sub12_10698
		    = new Class696_Sub12(class525_sub38
					     .readUnsignedByte(1077099546),
					 this);
		aClass696_Sub41_10704
		    = new Class696_Sub41(class525_sub38.readUnsignedByte(909281992),
					 this);
		if (i >= 35) {
		    aClass696_Sub22_10707
			= new Class696_Sub22(class525_sub38
						 .readUnsignedByte(461039677),
					     this);
		    aClass696_Sub3_10690
			= new Class696_Sub3(class525_sub38
						.readUnsignedByte(1513480234),
					    this);
		    aClass696_Sub10_10709
			= new Class696_Sub10(class525_sub38
						 .readUnsignedByte(222907860),
					     this);
		    aClass696_Sub18_10706
			= new Class696_Sub18(class525_sub38
						 .readUnsignedByte(1641446045),
					     this);
		    aClass696_Sub35_10673
			= new Class696_Sub35(class525_sub38
						 .readUnsignedByte(1005960033),
					     this);
		    aClass696_Sub31_10711
			= new Class696_Sub31(class525_sub38
						 .readByte(-1150098071),
					     this);
		}
		if (i >= 36) {
		    aClass696_Sub40_10712
			= new Class696_Sub40(class525_sub38
						 .readUnsignedByte(1447792735),
					     this);
		    aClass696_Sub32_10713
			= new Class696_Sub32(class525_sub38
						 .readUnsignedByte(21636280),
					     this);
		}
		if (i >= 37) {
		    aClass696_Sub27_10703
			= new Class696_Sub27(class525_sub38
						 .readUnsignedShort((byte) 54),
					     this);
		    aClass696_Sub14_10697
			= new Class696_Sub14(class525_sub38
						 .readUnsignedShort((byte) 122),
					     this);
		}
		if (i >= 38) {
		    aClass696_Sub7_10716
			= new Class696_Sub7(class525_sub38
						.readUnsignedShort((byte) 31),
					    this);
		    aClass696_Sub43_10686
			= new Class696_Sub43(class525_sub38
						 .readUnsignedShort((byte) 24),
					     this);
		}
		aClass696_Sub41_10705
		    = new Class696_Sub41(aClass696_Sub41_10704
					     .method17337(1997233588),
					 this);
		aClass696_Sub46_10718
		    = new Class696_Sub46(class525_sub38
					     .readUnsignedByte(1424326876),
					 this);
		aClass696_Sub23_10719
		    = new Class696_Sub23(class525_sub38
					     .readUnsignedByte(1414155142),
					 this);
		aClass696_Sub28_10720
		    = new Class696_Sub28(class525_sub38.readUnsignedByte(998286667),
					 this);
		aClass696_Sub38_10721
		    = new Class696_Sub38(class525_sub38.readUnsignedByte(607571471),
					 this);
		aClass696_Sub29_10722
		    = new Class696_Sub29(class525_sub38
					     .readUnsignedByte(1000802366),
					 this);
		if (i >= 26)
		    aClass696_Sub25_10723
			= new Class696_Sub25(class525_sub38
						 .readUnsignedByte(2100368525),
					     this);
		if (i >= 28)
		    aClass696_Sub44_10724
			= new Class696_Sub44(class525_sub38
						 .readUnsignedByte(563178731),
					     this);
		if (i >= 30)
		    aClass696_Sub34_10683
			= new Class696_Sub34(class525_sub38
						 .readUnsignedByte(444476347),
					     this);
		aClass696_Sub45_10710
		    = new Class696_Sub45(class525_sub38
					     .readUnsignedByte(1577650958),
					 this);
		aClass696_Sub45_10726
		    = new Class696_Sub45(class525_sub38
					     .readUnsignedByte(2095999466),
					 this);
		aClass696_Sub45_10727
		    = new Class696_Sub45(class525_sub38.readUnsignedByte(769140747),
					 this);
		aClass696_Sub45_10702
		    = new Class696_Sub45(class525_sub38
					     .readUnsignedByte(1641196967),
					 this);
		aClass696_Sub45_10729
		    = new Class696_Sub45(class525_sub38
					     .readUnsignedByte(1581146499),
					 this);
		aClass696_Sub47_10730
		    = new Class696_Sub47(class525_sub38.readUnsignedByte(872778638),
					 this);
		method16498(false, i < 32, (byte) -24);
	    }
	}
	method16504(529598837);
    }
    
    void method16512(RSBuffer class525_sub38) {
	if (null == class525_sub38 || class525_sub38.buffer == null)
	    method16498(true, true, (byte) -14);
	else {
	    int i = class525_sub38.readUnsignedByte(1889912937);
	    if (i < 23) {
		try {
		    method16514(class525_sub38, i, 1035928128);
		} catch (Exception exception) {
		    method16498(true, true, (byte) 13);
		}
		method16498(false, true, (byte) -34);
	    } else if (i > 38)
		method16498(true, true, (byte) 52);
	    else {
		if (i >= 29)
		    aClass696_Sub36_10699
			= new Class696_Sub36(class525_sub38
						 .readUnsignedByte(1914725435),
					     this);
		aClass696_Sub39_10677
		    = new Class696_Sub39(class525_sub38.readUnsignedByte(153987342),
					 this);
		if (i >= 31)
		    aClass696_Sub33_10679
			= new Class696_Sub33(class525_sub38
						 .readUnsignedByte(71824007),
					     this);
		aClass696_Sub39_10678
		    = new Class696_Sub39(aClass696_Sub39_10677
					     .method17324(-16711936),
					 this);
		aClass696_Sub37_10680
		    = new Class696_Sub37(class525_sub38.readUnsignedByte(197582291),
					 this);
		aClass696_Sub13_10681
		    = new Class696_Sub13(class525_sub38.readUnsignedByte(400782401),
					 this);
		aClass696_Sub26_10682
		    = new Class696_Sub26(class525_sub38.readUnsignedByte(613870587),
					 this);
		if (i >= 27)
		    aClass696_Sub19_10684
			= new Class696_Sub19(class525_sub38
						 .readUnsignedByte(1404214319),
					     this);
		aClass696_Sub5_10685
		    = new Class696_Sub5(class525_sub38.readUnsignedByte(54912008),
					this);
		aClass696_Sub8_10671
		    = new Class696_Sub8(class525_sub38.readUnsignedByte(1384614484),
					this);
		aClass696_Sub24_10687
		    = new Class696_Sub24(class525_sub38.readUnsignedByte(767261477),
					 this);
		aClass696_Sub11_10688
		    = new Class696_Sub11(class525_sub38
					     .readUnsignedByte(2122254304),
					 this);
		aClass696_Sub21_10689
		    = new Class696_Sub21(class525_sub38.readUnsignedByte(981236435),
					 this);
		aClass696_Sub9_10691
		    = new Class696_Sub9(class525_sub38.readUnsignedByte(445730156),
					this);
		aClass696_Sub15_10715
		    = new Class696_Sub15(class525_sub38
					     .readUnsignedByte(1086867217),
					 this);
		if (i >= 33)
		    aClass696_Sub16_10670
			= new Class696_Sub16(class525_sub38
						 .readUnsignedByte(159845183),
					     this);
		if (i >= 34)
		    class525_sub38.readUnsignedByte(627690732);
		if (i >= 24)
		    aClass696_Sub1_10693
			= new Class696_Sub1(class525_sub38
						.readUnsignedByte(45505990),
					    this);
		aClass696_Sub2_10694
		    = new Class696_Sub2(class525_sub38.readUnsignedByte(439870176),
					this);
		aClass696_Sub6_10692
		    = new Class696_Sub6(class525_sub38.readUnsignedByte(1262466284),
					this);
		aClass696_Sub6_10675
		    = new Class696_Sub6(aClass696_Sub6_10692
					    .method17028((byte) 33),
					this);
		aClass696_Sub30_10696
		    = new Class696_Sub30(class525_sub38.readUnsignedByte(510310652),
					 this);
		if (i >= 25)
		    aClass696_Sub42_10717
			= new Class696_Sub42(class525_sub38
						 .readUnsignedByte(237816285),
					     this);
		aClass696_Sub17_10676
		    = new Class696_Sub17(class525_sub38.readUnsignedByte(79655562),
					 this);
		if (i <= 25)
		    class525_sub38.index += 339428471;
		aClass696_Sub4_10728
		    = new Class696_Sub4(class525_sub38.readUnsignedByte(1398504446),
					this);
		aClass696_Sub20_10701
		    = new Class696_Sub20(class525_sub38
					     .readUnsignedByte(1919869132),
					 this);
		aClass696_Sub20_10708
		    = new Class696_Sub20(aClass696_Sub20_10701
					     .method17160(2017084126),
					 this);
		class525_sub38.readUnsignedByte(1167236316);
		aClass696_Sub12_10698
		    = new Class696_Sub12(class525_sub38
					     .readUnsignedByte(1660560478),
					 this);
		aClass696_Sub41_10704
		    = new Class696_Sub41(class525_sub38.readUnsignedByte(125325042),
					 this);
		if (i >= 35) {
		    aClass696_Sub22_10707
			= new Class696_Sub22(class525_sub38
						 .readUnsignedByte(436175473),
					     this);
		    aClass696_Sub3_10690
			= new Class696_Sub3(class525_sub38
						.readUnsignedByte(208247310),
					    this);
		    aClass696_Sub10_10709
			= new Class696_Sub10(class525_sub38
						 .readUnsignedByte(1346077407),
					     this);
		    aClass696_Sub18_10706
			= new Class696_Sub18(class525_sub38
						 .readUnsignedByte(642373833),
					     this);
		    aClass696_Sub35_10673
			= new Class696_Sub35(class525_sub38
						 .readUnsignedByte(311585312),
					     this);
		    aClass696_Sub31_10711
			= new Class696_Sub31(class525_sub38
						 .readByte(-1150098071),
					     this);
		}
		if (i >= 36) {
		    aClass696_Sub40_10712
			= new Class696_Sub40(class525_sub38
						 .readUnsignedByte(1272127730),
					     this);
		    aClass696_Sub32_10713
			= new Class696_Sub32(class525_sub38
						 .readUnsignedByte(896336248),
					     this);
		}
		if (i >= 37) {
		    aClass696_Sub27_10703
			= new Class696_Sub27(class525_sub38
						 .readUnsignedShort((byte) 97),
					     this);
		    aClass696_Sub14_10697
			= new Class696_Sub14(class525_sub38
						 .readUnsignedShort((byte) 124),
					     this);
		}
		if (i >= 38) {
		    aClass696_Sub7_10716
			= new Class696_Sub7(class525_sub38
						.readUnsignedShort((byte) 75),
					    this);
		    aClass696_Sub43_10686
			= new Class696_Sub43(class525_sub38
						 .readUnsignedShort((byte) 14),
					     this);
		}
		aClass696_Sub41_10705
		    = new Class696_Sub41(aClass696_Sub41_10704
					     .method17337(758367723),
					 this);
		aClass696_Sub46_10718
		    = new Class696_Sub46(class525_sub38.readUnsignedByte(751275151),
					 this);
		aClass696_Sub23_10719
		    = new Class696_Sub23(class525_sub38.readUnsignedByte(209196277),
					 this);
		aClass696_Sub28_10720
		    = new Class696_Sub28(class525_sub38
					     .readUnsignedByte(2082260468),
					 this);
		aClass696_Sub38_10721
		    = new Class696_Sub38(class525_sub38.readUnsignedByte(385621558),
					 this);
		aClass696_Sub29_10722
		    = new Class696_Sub29(class525_sub38.readUnsignedByte(477253777),
					 this);
		if (i >= 26)
		    aClass696_Sub25_10723
			= new Class696_Sub25(class525_sub38
						 .readUnsignedByte(139263801),
					     this);
		if (i >= 28)
		    aClass696_Sub44_10724
			= new Class696_Sub44(class525_sub38
						 .readUnsignedByte(1098660152),
					     this);
		if (i >= 30)
		    aClass696_Sub34_10683
			= new Class696_Sub34(class525_sub38
						 .readUnsignedByte(465395514),
					     this);
		aClass696_Sub45_10710
		    = new Class696_Sub45(class525_sub38
					     .readUnsignedByte(1292206078),
					 this);
		aClass696_Sub45_10726
		    = new Class696_Sub45(class525_sub38.readUnsignedByte(65692025),
					 this);
		aClass696_Sub45_10727
		    = new Class696_Sub45(class525_sub38
					     .readUnsignedByte(1211658981),
					 this);
		aClass696_Sub45_10702
		    = new Class696_Sub45(class525_sub38.readUnsignedByte(39185021),
					 this);
		aClass696_Sub45_10729
		    = new Class696_Sub45(class525_sub38.readUnsignedByte(34218670),
					 this);
		aClass696_Sub47_10730
		    = new Class696_Sub47(class525_sub38
					     .readUnsignedByte(1863384609),
					 this);
		method16498(false, i < 32, (byte) 53);
	    }
	}
	method16504(439406777);
    }
    
    void method16513() {
	aClass696_Sub36_10699.method17293(2015070001);
	aClass696_Sub39_10677.method17320(-1057429992);
	aClass696_Sub33_10679.method17268((byte) 5);
	aClass696_Sub39_10678.method17320(-2059816121);
	aClass696_Sub37_10680.method17303((short) 1099);
	aClass696_Sub13_10681.method17080(-875122474);
	aClass696_Sub26_10682.method17212((byte) 42);
	aClass696_Sub19_10684.method17143((short) 11548);
	aClass696_Sub5_10685.method17016(-244069987);
	aClass696_Sub8_10671.method17042(-1791685534);
	aClass696_Sub24_10687.method17195((short) 21473);
	aClass696_Sub11_10688.method17065(-1139808780);
	aClass696_Sub21_10689.method17165(-712688998);
	aClass696_Sub9_10691.method17053(-1329554543);
	aClass696_Sub15_10715.method17097(-1515440763);
	aClass696_Sub16_10670.method17120(1443197069);
	aClass696_Sub1_10693.method16889(268922336);
	aClass696_Sub2_10694.method16900((byte) 5);
	aClass696_Sub6_10692.method17026((byte) 68);
	aClass696_Sub6_10675.method17026((byte) 93);
	aClass696_Sub30_10696.method17249(1858333429);
	aClass696_Sub42_10717.method17346((byte) 0);
	aClass696_Sub17_10676.method17122(1368491426);
	aClass696_Sub4_10728.method16984(1467211680);
	aClass696_Sub20_10701.method17153(1292549226);
	aClass696_Sub20_10708.method17153(1563618941);
	aClass696_Sub12_10698.method17072((byte) 2);
	aClass696_Sub41_10704.method17338(799085720);
	aClass696_Sub41_10705.method17338(799085720);
	aClass696_Sub18_10706.method17133((byte) -50);
	aClass696_Sub22_10707.method17175(1822738746);
	aClass696_Sub3_10690.method16976(1307488424);
	aClass696_Sub10_10709.method17056(-329997372);
	aClass696_Sub35_10673.method17286(-420897263);
	aClass696_Sub31_10711.method17254((byte) 28);
	aClass696_Sub40_10712.method17328((byte) 69);
	aClass696_Sub32_10713.method17262((byte) -16);
	aClass696_Sub27_10703.method17223(1726887717);
	aClass696_Sub14_10697.method17090(-2042898257);
	aClass696_Sub7_10716.method17037(-32228570);
	aClass696_Sub43_10686.method17355(-1399957283);
	aClass696_Sub46_10718.method17445(-1033549592);
	aClass696_Sub23_10719.method17186(-2100834804);
	aClass696_Sub28_10720.method17231(-372914888);
	aClass696_Sub38_10721.method17312((byte) 7);
	aClass696_Sub29_10722.method17241((byte) 5);
	aClass696_Sub25_10723.method17204(11298796);
	aClass696_Sub44_10724.method17366(-1814265525);
	aClass696_Sub34_10683.method17278(-1813465543);
	aClass696_Sub45_10710.method17413(-25116787);
	aClass696_Sub45_10726.method17413(2112212737);
	aClass696_Sub45_10727.method17413(823253706);
	aClass696_Sub45_10702.method17413(1090089973);
	aClass696_Sub45_10729.method17413(1306616343);
	aClass696_Sub47_10730.method17456((short) 1333);
    }
    
    void method16514(RSBuffer class525_sub38, int i, int i_7_) {
	aClass696_Sub13_10681
	    = new Class696_Sub13(class525_sub38.readUnsignedByte(1152044325), this);
	class525_sub38.index += 339428471;
	aClass696_Sub6_10692
	    = new Class696_Sub6(class525_sub38.readUnsignedByte(1074604737) + 1,
				this);
	aClass696_Sub11_10688
	    = new Class696_Sub11(class525_sub38.readUnsignedByte(23387771), this);
	class525_sub38.index += 339428471;
	aClass696_Sub21_10689
	    = new Class696_Sub21(class525_sub38.readUnsignedByte(296732745), this);
	aClass696_Sub5_10685
	    = new Class696_Sub5(class525_sub38.readUnsignedByte(924144994), this);
	class525_sub38.readUnsignedByte(1005814270);
	aClass696_Sub17_10676
	    = new Class696_Sub17(class525_sub38.readUnsignedByte(262973576), this);
	int i_8_ = class525_sub38.readUnsignedByte(2142192946);
	int i_9_ = 0;
	if (i >= 17)
	    i_9_ = class525_sub38.readUnsignedByte(2062548947);
	aClass696_Sub15_10715
	    = new Class696_Sub15(i_8_ > i_9_ ? i_8_ : i_9_, this);
	boolean bool = true;
	boolean bool_10_ = true;
	if (i >= 2) {
	    bool = class525_sub38.readUnsignedByte(207768144) == 1;
	    if (i >= 17)
		bool_10_ = class525_sub38.readUnsignedByte(617224570) == 1;
	} else {
	    bool = class525_sub38.readUnsignedByte(1535460257) == 1;
	    class525_sub38.readUnsignedByte(1049610980);
	}
	aClass696_Sub9_10691
	    = new Class696_Sub9(bool | bool_10_ ? 1 : 0, this);
	aClass696_Sub12_10698
	    = new Class696_Sub12(class525_sub38.readUnsignedByte(42996055), this);
	aClass696_Sub8_10671
	    = new Class696_Sub8(class525_sub38.readUnsignedByte(759297601), this);
	aClass696_Sub39_10677
	    = new Class696_Sub39(class525_sub38.readUnsignedByte(863071472), this);
	aClass696_Sub47_10730
	    = new Class696_Sub47(class525_sub38.readUnsignedByte(1658229630), this);
	aClass696_Sub45_10710
	    = new Class696_Sub45(class525_sub38.readUnsignedByte(143965474), this);
	if (i >= 20)
	    aClass696_Sub45_10727
		= new Class696_Sub45(class525_sub38.readUnsignedByte(1578600912),
				     this);
	else
	    aClass696_Sub45_10727
		= new Class696_Sub45(aClass696_Sub45_10710
					 .method17416(1138833110),
				     this);
	aClass696_Sub45_10702
	    = new Class696_Sub45(class525_sub38.readUnsignedByte(1735663266), this);
	aClass696_Sub45_10726
	    = new Class696_Sub45(class525_sub38.readUnsignedByte(612443776), this);
	if (i >= 21)
	    aClass696_Sub45_10729
		= new Class696_Sub45(class525_sub38.readUnsignedByte(1538924347),
				     this);
	else
	    aClass696_Sub45_10729
		= new Class696_Sub45(aClass696_Sub45_10702
					 .method17416(1812883912),
				     this);
	if (i >= 1) {
	    class525_sub38.readUnsignedShort((byte) 45);
	    class525_sub38.readUnsignedShort((byte) 92);
	}
	if (i >= 3 && i < 6)
	    class525_sub38.readUnsignedByte(561275536);
	if (i >= 4)
	    aClass696_Sub2_10694
		= new Class696_Sub2(class525_sub38.readUnsignedByte(1839711097),
				    this);
	class525_sub38.readInt(1360835024);
	if (i >= 6)
	    aClass696_Sub41_10704
		= new Class696_Sub41(class525_sub38.readUnsignedByte(285454439),
				     this);
	if (i >= 7)
	    aClass696_Sub29_10722
		= new Class696_Sub29(class525_sub38.readUnsignedByte(949935376),
				     this);
	if (i >= 8)
	    class525_sub38.readUnsignedByte(1637627308);
	if (i >= 9)
	    aClass696_Sub26_10682
		= new Class696_Sub26(class525_sub38.readUnsignedByte(1489520167),
				     this);
	if (i >= 10)
	    aClass696_Sub37_10680
		= new Class696_Sub37(class525_sub38.readUnsignedByte(1711734799),
				     this);
	if (i >= 11)
	    aClass696_Sub46_10718
		= new Class696_Sub46(class525_sub38.readUnsignedByte(978814730),
				     this);
	if (i >= 12)
	    aClass696_Sub21_10689
		= new Class696_Sub21(class525_sub38.readUnsignedByte(1902214058),
				     this);
	if (i >= 13)
	    aClass696_Sub24_10687
		= new Class696_Sub24(class525_sub38.readUnsignedByte(670443256),
				     this);
	if (i >= 14)
	    aClass696_Sub20_10701
		= new Class696_Sub20(class525_sub38.readUnsignedByte(128983685),
				     this);
	if (i >= 15)
	    aClass696_Sub28_10720
		= new Class696_Sub28(class525_sub38.readUnsignedByte(625382596),
				     this);
	if (i >= 16)
	    aClass696_Sub4_10728
		= new Class696_Sub4(class525_sub38.readUnsignedByte(1716845538),
				    this);
	if (i >= 18)
	    aClass696_Sub23_10719
		= new Class696_Sub23(class525_sub38.readUnsignedByte(1429589901),
				     this);
	if (i >= 19)
	    aClass696_Sub30_10696
		= new Class696_Sub30(class525_sub38.readUnsignedByte(1315988426),
				     this);
	if (i >= 22)
	    aClass696_Sub38_10721
		= new Class696_Sub38(class525_sub38.readUnsignedByte(1159666135),
				     this);
    }
    
    public void method16515(Class696 class696, int i) {
	class696.method14170(i, 2010981611);
	method16504(1957524295);
    }
    
    public Class525_Sub30(Class668 class668, int i) {
	aClass668_10674 = class668;
	aClass701_10714
	    = new Class701(-855455283 * Class503.anInt5590,
			   Class503.anInt5598 * 389852961,
			   (Class285.aString3142.toLowerCase().indexOf("arm")
			    != -1),
			   Class396.aString4106.startsWith("win"), false);
	aClass696_Sub20_10708 = new Class696_Sub20(i, this);
	method16498(true, true, (byte) -51);
    }
    
    public RSBuffer method16516() {
	RSBuffer class525_sub38 = new RSBuffer(59);
	class525_sub38.method16735(38, -258734857);
	class525_sub38.method16735(aClass696_Sub36_10699
				       .method17294(494527888),
				   -630622850);
	class525_sub38.method16735(aClass696_Sub39_10677
				       .method17324(-16711936),
				   -1093681763);
	class525_sub38.method16735(aClass696_Sub33_10679.method17267((byte) 6),
				   -814740733);
	class525_sub38.method16735(aClass696_Sub37_10680
				       .method17305((byte) 26),
				   -1456704358);
	class525_sub38.method16735(aClass696_Sub13_10681
				       .method17081(263173182),
				   -676188144);
	class525_sub38.method16735(aClass696_Sub26_10682
				       .method17219((byte) -54),
				   -1193666692);
	class525_sub38.method16735(aClass696_Sub19_10684
				       .method17144(-29047449),
				   -693620238);
	class525_sub38.method16735(aClass696_Sub5_10685.method17018(602937616),
				   -409492047);
	class525_sub38.method16735(aClass696_Sub8_10671.method17043(106673320),
				   -1861338785);
	class525_sub38.method16735(aClass696_Sub24_10687
				       .method17197((byte) 88),
				   -1755387083);
	class525_sub38.method16735(aClass696_Sub11_10688
				       .method17067((short) 255),
				   -560117461);
	class525_sub38.method16735(aClass696_Sub21_10689
				       .method17167(-1902659869),
				   -1056555175);
	class525_sub38.method16735(aClass696_Sub9_10691.method17050(501271953),
				   -1577413879);
	class525_sub38.method16735(aClass696_Sub15_10715
				       .method17108(1469486260),
				   -1384475760);
	class525_sub38.method16735(aClass696_Sub16_10670
				       .method17113((short) -28890),
				   -1507004132);
	class525_sub38.method16735(0, -605645911);
	class525_sub38.method16735(aClass696_Sub1_10693.method16891((byte) 1),
				   -1382868669);
	class525_sub38.method16735(aClass696_Sub2_10694
				       .method16902(1772031105),
				   -1069818680);
	class525_sub38.method16735(aClass696_Sub6_10692.method17028((byte) 20),
				   -1812763887);
	class525_sub38.method16735(aClass696_Sub30_10696
				       .method17247(-183899835),
				   -454214924);
	class525_sub38.method16735(aClass696_Sub42_10717
				       .method17348((short) 10242),
				   -385296958);
	class525_sub38.method16735(aClass696_Sub17_10676
				       .method17123(920152590),
				   -1980429722);
	class525_sub38.method16735(aClass696_Sub4_10728
				       .method16985(1479950213),
				   -1906099612);
	class525_sub38.method16735(aClass696_Sub20_10701
				       .method17160(-1433886614),
				   -1292701180);
	class525_sub38.method16735(0, -688079245);
	class525_sub38.method16735(aClass696_Sub12_10698
				       .method17074(-1122921998),
				   -489653440);
	class525_sub38.method16735(aClass696_Sub41_10704
				       .method17337(1172268599),
				   -1723657554);
	class525_sub38.method16735(aClass696_Sub22_10707
				       .method17174(-1776506252),
				   -2122630945);
	class525_sub38.method16735(aClass696_Sub3_10690
				       .method16977(1679998835),
				   -1760776113);
	class525_sub38.method16735(aClass696_Sub10_10709
				       .method17055(1996567648),
				   -1369950882);
	class525_sub38.method16735(aClass696_Sub18_10706
				       .method17136((short) -12828),
				   -666103335);
	class525_sub38.method16735(aClass696_Sub35_10673
				       .method17288(-1445589163),
				   -372444972);
	class525_sub38.method16735(aClass696_Sub31_10711
				       .method17260(1784718382),
				   -1680378242);
	class525_sub38.method16735(aClass696_Sub40_10712
				       .method17329(-1756327928),
				   -1410413055);
	class525_sub38.method16735(aClass696_Sub32_10713
				       .method17263(1232189110),
				   -2011036801);
	class525_sub38.method16602(aClass696_Sub27_10703
				       .method17224((byte) 64),
				   1937550348);
	class525_sub38.method16602(aClass696_Sub14_10697
				       .method17089(1436534607),
				   2040908282);
	class525_sub38.method16602(aClass696_Sub7_10716.method17035((byte) 5),
				   1138967297);
	class525_sub38.method16602(aClass696_Sub43_10686
				       .method17356(-1278768573),
				   1738571960);
	class525_sub38.method16735(aClass696_Sub46_10718
				       .method17437(195011616),
				   -615949201);
	class525_sub38.method16735(aClass696_Sub23_10719
				       .method17189(-1471418207),
				   -1384733022);
	class525_sub38.method16735(aClass696_Sub28_10720
				       .method17232(-1900497571),
				   -751818580);
	class525_sub38.method16735(aClass696_Sub38_10721
				       .method17314(303109370),
				   -2057123144);
	class525_sub38.method16735(aClass696_Sub29_10722
				       .method17240(1547676134),
				   -1520692280);
	class525_sub38.method16735(aClass696_Sub25_10723
				       .method17208(424135869),
				   -397861626);
	class525_sub38.method16735(aClass696_Sub44_10724
				       .method17363(-1418136144),
				   -1027832396);
	class525_sub38.method16735(aClass696_Sub34_10683
				       .method17279((short) -5459),
				   -657728532);
	class525_sub38.method16735(aClass696_Sub45_10710
				       .method17416(2144036586),
				   -639138520);
	class525_sub38.method16735(aClass696_Sub45_10726
				       .method17416(1923719910),
				   -1224127917);
	class525_sub38.method16735(aClass696_Sub45_10727
				       .method17416(1773329660),
				   -607044228);
	class525_sub38.method16735(aClass696_Sub45_10702
				       .method17416(2087869708),
				   -1475427503);
	class525_sub38.method16735(aClass696_Sub45_10729
				       .method17416(1514687594),
				   -1423535091);
	class525_sub38.method16735(aClass696_Sub47_10730.method17457((byte) 2),
				   -1398110449);
	return class525_sub38;
    }
    
    void method16517() {
	aClass696_Sub36_10699.method17293(2042653215);
	aClass696_Sub39_10677.method17320(-1689542733);
	aClass696_Sub33_10679.method17268((byte) 126);
	aClass696_Sub39_10678.method17320(-1733160956);
	aClass696_Sub37_10680.method17303((short) 1099);
	aClass696_Sub13_10681.method17080(-1263689275);
	aClass696_Sub26_10682.method17212((byte) -66);
	aClass696_Sub19_10684.method17143((short) 19090);
	aClass696_Sub5_10685.method17016(-244069987);
	aClass696_Sub8_10671.method17042(-1791685534);
	aClass696_Sub24_10687.method17195((short) 12812);
	aClass696_Sub11_10688.method17065(1830965091);
	aClass696_Sub21_10689.method17165(-712688998);
	aClass696_Sub9_10691.method17053(-1911664370);
	aClass696_Sub15_10715.method17097(-2015403923);
	aClass696_Sub16_10670.method17120(624687560);
	aClass696_Sub1_10693.method16889(2011050532);
	aClass696_Sub2_10694.method16900((byte) -20);
	aClass696_Sub6_10692.method17026((byte) 49);
	aClass696_Sub6_10675.method17026((byte) 63);
	aClass696_Sub30_10696.method17249(962396299);
	aClass696_Sub42_10717.method17346((byte) 0);
	aClass696_Sub17_10676.method17122(-196997131);
	aClass696_Sub4_10728.method16984(1467211680);
	aClass696_Sub20_10701.method17153(1143841658);
	aClass696_Sub20_10708.method17153(1969726445);
	aClass696_Sub12_10698.method17072((byte) 2);
	aClass696_Sub41_10704.method17338(799085720);
	aClass696_Sub41_10705.method17338(799085720);
	aClass696_Sub18_10706.method17133((byte) -81);
	aClass696_Sub22_10707.method17175(1617282734);
	aClass696_Sub3_10690.method16976(1435451150);
	aClass696_Sub10_10709.method17056(-1383421889);
	aClass696_Sub35_10673.method17286(-686815473);
	aClass696_Sub31_10711.method17254((byte) 25);
	aClass696_Sub40_10712.method17328((byte) 117);
	aClass696_Sub32_10713.method17262((byte) -47);
	aClass696_Sub27_10703.method17223(1686471215);
	aClass696_Sub14_10697.method17090(-1996916518);
	aClass696_Sub7_10716.method17037(-32228570);
	aClass696_Sub43_10686.method17355(-1909883913);
	aClass696_Sub46_10718.method17445(-2117567783);
	aClass696_Sub23_10719.method17186(-2064497108);
	aClass696_Sub28_10720.method17231(-1897148908);
	aClass696_Sub38_10721.method17312((byte) 7);
	aClass696_Sub29_10722.method17241((byte) -81);
	aClass696_Sub25_10723.method17204(-1652586528);
	aClass696_Sub44_10724.method17366(-316472020);
	aClass696_Sub34_10683.method17278(-1811500234);
	aClass696_Sub45_10710.method17413(596925359);
	aClass696_Sub45_10726.method17413(-682065024);
	aClass696_Sub45_10727.method17413(732438740);
	aClass696_Sub45_10702.method17413(645289470);
	aClass696_Sub45_10729.method17413(-1690693961);
	aClass696_Sub47_10730.method17456((short) 5361);
    }
    
    void method16518() {
	aClass696_Sub36_10699.method17293(2089008871);
	aClass696_Sub39_10677.method17320(-1848969156);
	aClass696_Sub33_10679.method17268((byte) 110);
	aClass696_Sub39_10678.method17320(-1230620621);
	aClass696_Sub37_10680.method17303((short) 1099);
	aClass696_Sub13_10681.method17080(1217061155);
	aClass696_Sub26_10682.method17212((byte) -50);
	aClass696_Sub19_10684.method17143((short) 13279);
	aClass696_Sub5_10685.method17016(-244069987);
	aClass696_Sub8_10671.method17042(-1791685534);
	aClass696_Sub24_10687.method17195((short) 11823);
	aClass696_Sub11_10688.method17065(-282090037);
	aClass696_Sub21_10689.method17165(-712688998);
	aClass696_Sub9_10691.method17053(-1299529497);
	aClass696_Sub15_10715.method17097(-258298193);
	aClass696_Sub16_10670.method17120(818501654);
	aClass696_Sub1_10693.method16889(-1066599823);
	aClass696_Sub2_10694.method16900((byte) -42);
	aClass696_Sub6_10692.method17026((byte) 92);
	aClass696_Sub6_10675.method17026((byte) 57);
	aClass696_Sub30_10696.method17249(-292579895);
	aClass696_Sub42_10717.method17346((byte) 0);
	aClass696_Sub17_10676.method17122(-621748714);
	aClass696_Sub4_10728.method16984(1467211680);
	aClass696_Sub20_10701.method17153(1919986899);
	aClass696_Sub20_10708.method17153(1908606159);
	aClass696_Sub12_10698.method17072((byte) 2);
	aClass696_Sub41_10704.method17338(799085720);
	aClass696_Sub41_10705.method17338(799085720);
	aClass696_Sub18_10706.method17133((byte) -125);
	aClass696_Sub22_10707.method17175(1922493252);
	aClass696_Sub3_10690.method16976(1886311944);
	aClass696_Sub10_10709.method17056(-1929578744);
	aClass696_Sub35_10673.method17286(-110291160);
	aClass696_Sub31_10711.method17254((byte) 45);
	aClass696_Sub40_10712.method17328((byte) 29);
	aClass696_Sub32_10713.method17262((byte) -57);
	aClass696_Sub27_10703.method17223(1579256432);
	aClass696_Sub14_10697.method17090(-2146259643);
	aClass696_Sub7_10716.method17037(-32228570);
	aClass696_Sub43_10686.method17355(1698615923);
	aClass696_Sub46_10718.method17445(-2090298104);
	aClass696_Sub23_10719.method17186(-2103891241);
	aClass696_Sub28_10720.method17231(1923566984);
	aClass696_Sub38_10721.method17312((byte) 7);
	aClass696_Sub29_10722.method17241((byte) -29);
	aClass696_Sub25_10723.method17204(-415332045);
	aClass696_Sub44_10724.method17366(-1289167901);
	aClass696_Sub34_10683.method17278(-1862856604);
	aClass696_Sub45_10710.method17413(865343923);
	aClass696_Sub45_10726.method17413(94303895);
	aClass696_Sub45_10727.method17413(560344969);
	aClass696_Sub45_10702.method17413(1888074363);
	aClass696_Sub45_10729.method17413(1975356216);
	aClass696_Sub47_10730.method17456((short) 12320);
    }
    
    public Class668 method16519() {
	return aClass668_10674;
    }
    
    public Class701 method16520() {
	return aClass701_10714;
    }
    
    static final void method16521(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class15.method766(class259, class245, class683, -116244436);
    }
    
    static final void method16522(Class683 class683, int i) {
	int i_11_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_11_ >> 28;
    }
}
