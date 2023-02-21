/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class382
{
    public int anInt3931;
    public int anInt3932;
    public static final int anInt3933 = 2;
    public short aShort3934;
    public short aShort3935;
    public int anInt3936;
    public int anInt3937;
    public int anInt3938;
    int anInt3939;
    public int anInt3940;
    public int anInt3941;
    public int anInt3942;
    public int anInt3943 = 0;
    public int anInt3944;
    public int anInt3945;
    public boolean aBool3946;
    int anInt3947;
    int anInt3948;
    public int anInt3949;
    int anInt3950;
    public int anInt3951;
    public short aShort3952;
    int anInt3953;
    public int anInt3954;
    public int anInt3955;
    public int anInt3956;
    public int anInt3957;
    public int anInt3958;
    public int[] anIntArray3959;
    public int anInt3960;
    public int[] anIntArray3961;
    int anInt3962;
    public static final int anInt3963 = -1;
    public int anInt3964;
    int anInt3965;
    public int anInt3966;
    public int[] anIntArray3967;
    public boolean aBool3968;
    public static final int anInt3969 = 1;
    public int anInt3970;
    public int anInt3971;
    public boolean aBool3972;
    public int anInt3973;
    public int anInt3974;
    int anInt3975;
    public int anInt3976;
    public int anInt3977;
    int anInt3978;
    public short aShort3979;
    public boolean aBool3980;
    public boolean aBool3981;
    public boolean aBool3982;
    public boolean aBool3983;
    public boolean aBool3984;
    public int anInt3985;
    int anInt3986;
    public int anInt3987;
    public int[] anIntArray3988;
    public int anInt3989;
    public int anInt3990;
    public boolean aBool3991;
    int anInt3992;
    public int anInt3993;
    public int anInt3994;
    int anInt3995;
    static final int anInt3996 = 0;
    public int anInt3997;
    public int anInt3998;
    public int anInt3999;
    public int anInt4000;
    public int anInt4001;
    public int anInt4002;
    public int anInt4003;
    public int anInt4004;
    public boolean aBool4005;
    public int anInt4006;
    public int anInt4007;
    public int anInt4008;
    
    void method6415(RSBuffer class525_sub38, int i, int i_0_) {
	if (i == 1) {
	    aShort3934 = (short) class525_sub38.readUnsignedShort((byte) 38);
	    aShort3935 = (short) class525_sub38.readUnsignedShort((byte) 25);
	    aShort3979 = (short) class525_sub38.readUnsignedShort((byte) 38);
	    aShort3952 = (short) class525_sub38.readUnsignedShort((byte) 50);
	    int i_1_ = 3;
	    aShort3934 <<= i_1_;
	    aShort3935 <<= i_1_;
	    aShort3979 <<= i_1_;
	    aShort3952 <<= i_1_;
	} else if (i == 2)
	    class525_sub38.readUnsignedByte(921283602);
	else if (i == 3) {
	    anInt3955 = class525_sub38.readInt(840404602) * -1530284993;
	    anInt3936 = class525_sub38.readInt(1874488095) * 1333200205;
	} else if (4 == i) {
	    anInt3943 = class525_sub38.readUnsignedByte(1885298069) * 990500509;
	    anInt3941 = class525_sub38.readByte(-1150098071) * -2127047939;
	} else if (5 == i)
	    anInt3944 = (anInt3945 = (class525_sub38.readUnsignedShort((byte) 5)
				      << 12 << 2) * -1144849799) * 2094561289;
	else if (6 == i) {
	    anInt3948 = class525_sub38.readInt(1158209035) * 762631693;
	    anInt3965 = class525_sub38.readInt(1071978385) * -832462119;
	} else if (7 == i) {
	    anInt4003 = class525_sub38.readUnsignedShort((byte) 45) * -1957246667;
	    anInt3956 = class525_sub38.readUnsignedShort((byte) 90) * 1059080273;
	} else if (8 == i) {
	    anInt3957 = class525_sub38.readUnsignedShort((byte) 1) * 186346957;
	    anInt3958 = class525_sub38.readUnsignedShort((byte) 120) * 258314135;
	} else if (9 == i) {
	    int i_2_ = class525_sub38.readUnsignedByte(28873618);
	    anIntArray3959 = new int[i_2_];
	    for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
		anIntArray3959[i_3_] = class525_sub38.readUnsignedShort((byte) 41);
	} else if (10 == i) {
	    int i_4_ = class525_sub38.readUnsignedByte(229834997);
	    anIntArray3961 = new int[i_4_];
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
		anIntArray3961[i_5_] = class525_sub38.readUnsignedShort((byte) 52);
	} else if (i == 12)
	    anInt3964 = class525_sub38.readByte(-1150098071) * 2012260329;
	else if (13 == i)
	    anInt3931 = class525_sub38.readByte(-1150098071) * -208758775;
	else if (i == 14)
	    anInt3966 = class525_sub38.readUnsignedShort((byte) 12) * 136772283;
	else if (i == 15)
	    anInt3949 = class525_sub38.readUnsignedShort((byte) 91) * 1913216545;
	else if (16 == i) {
	    aBool4005 = class525_sub38.readUnsignedByte(1854917168) == 1;
	    anInt3985 = class525_sub38.readUnsignedShort((byte) 49) * 492752967;
	    anInt3970 = class525_sub38.readUnsignedShort((byte) 99) * -70097859;
	    aBool3968 = class525_sub38.readUnsignedByte(500303129) == 1;
	} else if (i == 17)
	    anInt3973 = class525_sub38.readUnsignedShort((byte) 113) * 201433791;
	else if (i == 18)
	    anInt3951 = class525_sub38.readInt(985404218) * 603427665;
	else if (i == 19)
	    anInt3971 = class525_sub38.readUnsignedByte(1782221748) * 787115377;
	else if (20 == i)
	    anInt3939 = class525_sub38.readUnsignedByte(728741230) * 26784685;
	else if (i == 21)
	    anInt3953 = class525_sub38.readUnsignedByte(942238653) * -926958013;
	else if (22 == i)
	    anInt3942 = class525_sub38.readInt(1099128612) * -456744661;
	else if (i == 23)
	    anInt3950 = class525_sub38.readUnsignedByte(1027004074) * 1834937021;
	else if (i == 24)
	    aBool3946 = false;
	else if (i == 25) {
	    int i_6_ = class525_sub38.readUnsignedByte(1115401739);
	    anIntArray3988 = new int[i_6_];
	    for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
		anIntArray3988[i_7_] = class525_sub38.readUnsignedShort((byte) 20);
	} else if (i == 26)
	    aBool3972 = false;
	else if (i == 27)
	    anInt4008 = ((class525_sub38.readUnsignedShort((byte) 71) << 12 << 2)
			 * 1685751505);
	else if (28 == i)
	    anInt3947 = class525_sub38.readUnsignedByte(1119924897) * 765812099;
	else if (i == 29) {
	    if (class525_sub38.readUnsignedByte(35399656) == 0)
		anInt3977 = (anInt3978 = (class525_sub38.method16625((byte) 41)
					  * 1344133768)) * -1878186241;
	    else {
		anInt3977 = class525_sub38.method16625((byte) -2) * -720052872;
		anInt3978
		    = class525_sub38.method16625((byte) -58) * 1344133768;
	    }
	} else if (30 == i)
	    aBool3991 = true;
	else if (31 == i) {
	    anInt3944 = ((class525_sub38.readUnsignedShort((byte) 27) << 12 << 2)
			 * -245660095);
	    anInt3945 = ((class525_sub38.readUnsignedShort((byte) 47) << 12 << 2)
			 * -1144849799);
	} else if (i == 32)
	    aBool3980 = false;
	else if (i == 33)
	    aBool3981 = true;
	else if (i == 34)
	    aBool3982 = false;
	else if (i == 35) {
	    if (class525_sub38.readUnsignedByte(1294699070) == 0)
		anInt3974 = (anInt3975 = (class525_sub38.method16625((byte) 30)
					  * 596477720)) * -557461067;
	    else {
		anInt3974 = class525_sub38.method16625((byte) 16) * 1943215096;
		anInt3975 = class525_sub38.method16625((byte) 58) * 596477720;
		anInt3976 = class525_sub38.readUnsignedByte(1847452484) * 427892141;
	    }
	} else if (36 == i)
	    aBool3983 = true;
    }
    
    void method6416(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_8_ = class525_sub38.readUnsignedByte(2139299103);
	    if (0 == i_8_)
		break;
	    method6415(class525_sub38, i_8_, 904006075);
	}
    }
    
    void method6417(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(347850819);
	    if (0 == i)
		break;
	    method6415(class525_sub38, i, 904006075);
	}
    }
    
    void method6418(byte i) {
	if (anInt3964 * -423321511 > -2 || anInt3931 * -993233351 > -2)
	    aBool3984 = true;
	anInt3938 = (anInt3948 * 808085701 >> 16 & 0xff) * -69134601;
	anInt3986 = -841755427 * (-2109031063 * anInt3965 >> 16 & 0xff);
	anInt3987 = -974834359 * anInt3986 - -457383453 * anInt3938;
	anInt3989 = (anInt3948 * 808085701 >> 8 & 0xff) * 439487769;
	anInt3962 = (anInt3965 * -2109031063 >> 8 & 0xff) * -569975181;
	anInt3990 = -1474465835 * anInt3962 - anInt3989 * 105656071;
	anInt3940 = (808085701 * anInt3948 & 0xff) * 852493149;
	anInt3992 = -1396967955 * (-2109031063 * anInt3965 & 0xff);
	anInt3993 = 1565063805 * anInt3992 - anInt3940 * -554232051;
	anInt3994 = (anInt3948 * 808085701 >> 24 & 0xff) * -1114474803;
	anInt3995 = (anInt3965 * -2109031063 >> 24 & 0xff) * -1790252291;
	anInt3954 = anInt3995 * -1268578149 - -979458581 * anInt3994;
	if (anInt3951 * -2138729039 != 0) {
	    anInt3997 = -1965240567 * (anInt3939 * -542693339
				       * (-1303510863 * anInt3956) / 100);
	    anInt3998 = (anInt3953 * -1849164181 * (-1303510863 * anInt3956)
			 / 100 * -276923031);
	    if (-1043763399 * anInt3997 == 0)
		anInt3997 = -1965240567;
	    anInt3999 = -891443641 * ((((-2138729039 * anInt3951 >> 16 & 0xff)
					- (anInt3938 * -938833209
					   + -450873139 * anInt3987 / 2))
				       << 8)
				      / (-1043763399 * anInt3997));
	    anInt4000 = 1468158721 * ((((-2138729039 * anInt3951 >> 8 & 0xff)
					- (-126812375 * anInt3989
					   + anInt3990 * -549280689 / 2))
				       << 8)
				      / (-1043763399 * anInt3997));
	    anInt4001
		= (((anInt3951 * -2138729039 & 0xff)
		    - (anInt3993 * 365666185 / 2 + 568027381 * anInt3940))
		   << 8) / (anInt3997 * -1043763399) * 477515535;
	    if (0 == 1802101465 * anInt3998)
		anInt3998 = -276923031;
	    anInt4002
		= (((-2138729039 * anInt3951 >> 24 & 0xff)
		    - (anInt3994 * -939104763 + anInt3954 * 2069526479 / 2))
		   << 8) / (1802101465 * anInt3998) * 1394527159;
	    Class382 class382_9_ = this;
	    class382_9_.anInt3999
		= (class382_9_.anInt3999
		   + (anInt3999 * 1122247543 > 0 ? -4 : 4) * -891443641);
	    Class382 class382_10_ = this;
	    class382_10_.anInt4000
		= (class382_10_.anInt4000
		   + (anInt4000 * -2073645823 > 0 ? -4 : 4) * 1468158721);
	    Class382 class382_11_ = this;
	    class382_11_.anInt4001
		= (class382_11_.anInt4001
		   + 477515535 * (1316012015 * anInt4001 > 0 ? -4 : 4));
	    Class382 class382_12_ = this;
	    class382_12_.anInt4002
		= (class382_12_.anInt4002
		   + (anInt4002 * -1980300793 > 0 ? -4 : 4) * 1394527159);
	}
	if (1508447619 * anInt3942 != -1) {
	    anInt4006 = -2040452279 * (anInt3950 * -947068779
				       * (anInt3956 * -1303510863) / 100);
	    if (0 == 1375713017 * anInt4006)
		anInt4006 = -2040452279;
	    anInt4004
		= ((1508447619 * anInt3942
		    - ((anInt3936 * -839402619 - anInt3955 * 1359494079) / 2
		       + 1359494079 * anInt3955))
		   / (anInt4006 * 1375713017) * 1803989195);
	}
	if (-1 != anInt4008 * -178679247) {
	    anInt3937 = -1598513323 * (anInt3947 * -193816277
				       * (anInt3956 * -1303510863) / 100);
	    if (1542874621 * anInt3937 == 0)
		anInt3937 = -1598513323;
	    anInt3932
		= (anInt4008 * -178679247
		   - (1265076673 * anInt3944
		      + ((-435269687 * anInt3945 - 1265076673 * anInt3944)
			 / 2))) / (1542874621 * anInt3937) * -1682019213;
	}
	anInt4007 = -392938939 * anInt3975 - anInt3974 * -745185199;
	anInt3960 = -1642172635 * anInt3978 - -297996837 * anInt3977;
    }
    
    Class382() {
	anInt3942 = 456744661;
	anInt3950 = -1189891628;
	anInt4008 = -1685751505;
	anInt3947 = -728201428;
	aBool3946 = true;
	anInt3939 = -1616498796;
	anInt3953 = 1793479212;
	anInt3949 = -1913216545;
	anInt3964 = 270446638;
	anInt3931 = 417517550;
	anInt3966 = 0;
	aBool4005 = true;
	aBool3968 = true;
	anInt3985 = -492752967;
	anInt3970 = 70097859;
	anInt3971 = 0;
	aBool3972 = true;
	anInt3973 = -201433791;
	anInt3974 = 0;
	anInt3975 = 0;
	anInt3976 = 0;
	anInt3977 = 0;
	anInt3978 = 0;
	aBool3991 = false;
	aBool3980 = true;
	aBool3981 = false;
	aBool3982 = true;
	aBool3983 = false;
	aBool3984 = false;
    }
    
    void method6419(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(185515569);
	    if (0 == i)
		break;
	    method6415(class525_sub38, i, 904006075);
	}
    }
    
    void method6420(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(46009053);
	    if (0 == i)
		break;
	    method6415(class525_sub38, i, 904006075);
	}
    }
    
    void method6421(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    aShort3934 = (short) class525_sub38.readUnsignedShort((byte) 120);
	    aShort3935 = (short) class525_sub38.readUnsignedShort((byte) 42);
	    aShort3979 = (short) class525_sub38.readUnsignedShort((byte) 43);
	    aShort3952 = (short) class525_sub38.readUnsignedShort((byte) 54);
	    int i_13_ = 3;
	    aShort3934 <<= i_13_;
	    aShort3935 <<= i_13_;
	    aShort3979 <<= i_13_;
	    aShort3952 <<= i_13_;
	} else if (i == 2)
	    class525_sub38.readUnsignedByte(1999878431);
	else if (i == 3) {
	    anInt3955 = class525_sub38.readInt(1428707231) * -1530284993;
	    anInt3936 = class525_sub38.readInt(2089997213) * 1333200205;
	} else if (4 == i) {
	    anInt3943 = class525_sub38.readUnsignedByte(848369605) * 990500509;
	    anInt3941 = class525_sub38.readByte(-1150098071) * -2127047939;
	} else if (5 == i)
	    anInt3944 = (anInt3945 = (class525_sub38.readUnsignedShort((byte) 111)
				      << 12 << 2) * -1144849799) * 2094561289;
	else if (6 == i) {
	    anInt3948 = class525_sub38.readInt(1544257001) * 762631693;
	    anInt3965 = class525_sub38.readInt(1122653512) * -832462119;
	} else if (7 == i) {
	    anInt4003 = class525_sub38.readUnsignedShort((byte) 9) * -1957246667;
	    anInt3956 = class525_sub38.readUnsignedShort((byte) 105) * 1059080273;
	} else if (8 == i) {
	    anInt3957 = class525_sub38.readUnsignedShort((byte) 14) * 186346957;
	    anInt3958 = class525_sub38.readUnsignedShort((byte) 26) * 258314135;
	} else if (9 == i) {
	    int i_14_ = class525_sub38.readUnsignedByte(1385402269);
	    anIntArray3959 = new int[i_14_];
	    for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
		anIntArray3959[i_15_] = class525_sub38.readUnsignedShort((byte) 32);
	} else if (10 == i) {
	    int i_16_ = class525_sub38.readUnsignedByte(225981230);
	    anIntArray3961 = new int[i_16_];
	    for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
		anIntArray3961[i_17_] = class525_sub38.readUnsignedShort((byte) 30);
	} else if (i == 12)
	    anInt3964 = class525_sub38.readByte(-1150098071) * 2012260329;
	else if (13 == i)
	    anInt3931 = class525_sub38.readByte(-1150098071) * -208758775;
	else if (i == 14)
	    anInt3966 = class525_sub38.readUnsignedShort((byte) 38) * 136772283;
	else if (i == 15)
	    anInt3949 = class525_sub38.readUnsignedShort((byte) 77) * 1913216545;
	else if (16 == i) {
	    aBool4005 = class525_sub38.readUnsignedByte(579679386) == 1;
	    anInt3985 = class525_sub38.readUnsignedShort((byte) 9) * 492752967;
	    anInt3970 = class525_sub38.readUnsignedShort((byte) 65) * -70097859;
	    aBool3968 = class525_sub38.readUnsignedByte(123459590) == 1;
	} else if (i == 17)
	    anInt3973 = class525_sub38.readUnsignedShort((byte) 30) * 201433791;
	else if (i == 18)
	    anInt3951 = class525_sub38.readInt(1268491777) * 603427665;
	else if (i == 19)
	    anInt3971 = class525_sub38.readUnsignedByte(757888728) * 787115377;
	else if (20 == i)
	    anInt3939 = class525_sub38.readUnsignedByte(682849180) * 26784685;
	else if (i == 21)
	    anInt3953 = class525_sub38.readUnsignedByte(870615252) * -926958013;
	else if (22 == i)
	    anInt3942 = class525_sub38.readInt(2000445549) * -456744661;
	else if (i == 23)
	    anInt3950 = class525_sub38.readUnsignedByte(40810146) * 1834937021;
	else if (i == 24)
	    aBool3946 = false;
	else if (i == 25) {
	    int i_18_ = class525_sub38.readUnsignedByte(1460517346);
	    anIntArray3988 = new int[i_18_];
	    for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
		anIntArray3988[i_19_] = class525_sub38.readUnsignedShort((byte) 39);
	} else if (i == 26)
	    aBool3972 = false;
	else if (i == 27)
	    anInt4008 = ((class525_sub38.readUnsignedShort((byte) 35) << 12 << 2)
			 * 1685751505);
	else if (28 == i)
	    anInt3947 = class525_sub38.readUnsignedByte(37765860) * 765812099;
	else if (i == 29) {
	    if (class525_sub38.readUnsignedByte(1706949716) == 0)
		anInt3977
		    = ((anInt3978
			= class525_sub38.method16625((byte) -46) * 1344133768)
		       * -1878186241);
	    else {
		anInt3977 = class525_sub38.method16625((byte) -9) * -720052872;
		anInt3978
		    = class525_sub38.method16625((byte) -14) * 1344133768;
	    }
	} else if (30 == i)
	    aBool3991 = true;
	else if (31 == i) {
	    anInt3944 = ((class525_sub38.readUnsignedShort((byte) 11) << 12 << 2)
			 * -245660095);
	    anInt3945 = ((class525_sub38.readUnsignedShort((byte) 79) << 12 << 2)
			 * -1144849799);
	} else if (i == 32)
	    aBool3980 = false;
	else if (i == 33)
	    aBool3981 = true;
	else if (i == 34)
	    aBool3982 = false;
	else if (i == 35) {
	    if (class525_sub38.readUnsignedByte(1598988992) == 0)
		anInt3974 = (anInt3975 = (class525_sub38.method16625((byte) 70)
					  * 596477720)) * -557461067;
	    else {
		anInt3974
		    = class525_sub38.method16625((byte) -56) * 1943215096;
		anInt3975 = class525_sub38.method16625((byte) 2) * 596477720;
		anInt3976 = class525_sub38.readUnsignedByte(704424184) * 427892141;
	    }
	} else if (36 == i)
	    aBool3983 = true;
    }
    
    void method6422(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    aShort3934 = (short) class525_sub38.readUnsignedShort((byte) 46);
	    aShort3935 = (short) class525_sub38.readUnsignedShort((byte) 80);
	    aShort3979 = (short) class525_sub38.readUnsignedShort((byte) 8);
	    aShort3952 = (short) class525_sub38.readUnsignedShort((byte) 30);
	    int i_20_ = 3;
	    aShort3934 <<= i_20_;
	    aShort3935 <<= i_20_;
	    aShort3979 <<= i_20_;
	    aShort3952 <<= i_20_;
	} else if (i == 2)
	    class525_sub38.readUnsignedByte(663403967);
	else if (i == 3) {
	    anInt3955 = class525_sub38.readInt(1307535355) * -1530284993;
	    anInt3936 = class525_sub38.readInt(1950482043) * 1333200205;
	} else if (4 == i) {
	    anInt3943 = class525_sub38.readUnsignedByte(23096512) * 990500509;
	    anInt3941 = class525_sub38.readByte(-1150098071) * -2127047939;
	} else if (5 == i)
	    anInt3944 = (anInt3945 = (class525_sub38.readUnsignedShort((byte) 105)
				      << 12 << 2) * -1144849799) * 2094561289;
	else if (6 == i) {
	    anInt3948 = class525_sub38.readInt(1531178302) * 762631693;
	    anInt3965 = class525_sub38.readInt(1478542489) * -832462119;
	} else if (7 == i) {
	    anInt4003 = class525_sub38.readUnsignedShort((byte) 56) * -1957246667;
	    anInt3956 = class525_sub38.readUnsignedShort((byte) 27) * 1059080273;
	} else if (8 == i) {
	    anInt3957 = class525_sub38.readUnsignedShort((byte) 35) * 186346957;
	    anInt3958 = class525_sub38.readUnsignedShort((byte) 28) * 258314135;
	} else if (9 == i) {
	    int i_21_ = class525_sub38.readUnsignedByte(609760751);
	    anIntArray3959 = new int[i_21_];
	    for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
		anIntArray3959[i_22_] = class525_sub38.readUnsignedShort((byte) 53);
	} else if (10 == i) {
	    int i_23_ = class525_sub38.readUnsignedByte(911947218);
	    anIntArray3961 = new int[i_23_];
	    for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
		anIntArray3961[i_24_] = class525_sub38.readUnsignedShort((byte) 37);
	} else if (i == 12)
	    anInt3964 = class525_sub38.readByte(-1150098071) * 2012260329;
	else if (13 == i)
	    anInt3931 = class525_sub38.readByte(-1150098071) * -208758775;
	else if (i == 14)
	    anInt3966 = class525_sub38.readUnsignedShort((byte) 7) * 136772283;
	else if (i == 15)
	    anInt3949 = class525_sub38.readUnsignedShort((byte) 53) * 1913216545;
	else if (16 == i) {
	    aBool4005 = class525_sub38.readUnsignedByte(628988610) == 1;
	    anInt3985 = class525_sub38.readUnsignedShort((byte) 42) * 492752967;
	    anInt3970 = class525_sub38.readUnsignedShort((byte) 18) * -70097859;
	    aBool3968 = class525_sub38.readUnsignedByte(953838221) == 1;
	} else if (i == 17)
	    anInt3973 = class525_sub38.readUnsignedShort((byte) 113) * 201433791;
	else if (i == 18)
	    anInt3951 = class525_sub38.readInt(1147973556) * 603427665;
	else if (i == 19)
	    anInt3971 = class525_sub38.readUnsignedByte(2132448991) * 787115377;
	else if (20 == i)
	    anInt3939 = class525_sub38.readUnsignedByte(2147049575) * 26784685;
	else if (i == 21)
	    anInt3953 = class525_sub38.readUnsignedByte(1445429340) * -926958013;
	else if (22 == i)
	    anInt3942 = class525_sub38.readInt(1825102337) * -456744661;
	else if (i == 23)
	    anInt3950 = class525_sub38.readUnsignedByte(2106498903) * 1834937021;
	else if (i == 24)
	    aBool3946 = false;
	else if (i == 25) {
	    int i_25_ = class525_sub38.readUnsignedByte(449358688);
	    anIntArray3988 = new int[i_25_];
	    for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
		anIntArray3988[i_26_] = class525_sub38.readUnsignedShort((byte) 2);
	} else if (i == 26)
	    aBool3972 = false;
	else if (i == 27)
	    anInt4008 = ((class525_sub38.readUnsignedShort((byte) 68) << 12 << 2)
			 * 1685751505);
	else if (28 == i)
	    anInt3947 = class525_sub38.readUnsignedByte(-13008078) * 765812099;
	else if (i == 29) {
	    if (class525_sub38.readUnsignedByte(1131927328) == 0)
		anInt3977 = (anInt3978 = (class525_sub38.method16625((byte) 32)
					  * 1344133768)) * -1878186241;
	    else {
		anInt3977 = class525_sub38.method16625((byte) -6) * -720052872;
		anInt3978 = class525_sub38.method16625((byte) 3) * 1344133768;
	    }
	} else if (30 == i)
	    aBool3991 = true;
	else if (31 == i) {
	    anInt3944 = ((class525_sub38.readUnsignedShort((byte) 64) << 12 << 2)
			 * -245660095);
	    anInt3945 = ((class525_sub38.readUnsignedShort((byte) 68) << 12 << 2)
			 * -1144849799);
	} else if (i == 32)
	    aBool3980 = false;
	else if (i == 33)
	    aBool3981 = true;
	else if (i == 34)
	    aBool3982 = false;
	else if (i == 35) {
	    if (class525_sub38.readUnsignedByte(907097134) == 0)
		anInt3974 = (anInt3975 = (class525_sub38.method16625((byte) 52)
					  * 596477720)) * -557461067;
	    else {
		anInt3974
		    = class525_sub38.method16625((byte) -48) * 1943215096;
		anInt3975 = class525_sub38.method16625((byte) 113) * 596477720;
		anInt3976 = class525_sub38.readUnsignedByte(1428186694) * 427892141;
	    }
	} else if (36 == i)
	    aBool3983 = true;
    }
    
    void method6423(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    aShort3934 = (short) class525_sub38.readUnsignedShort((byte) 78);
	    aShort3935 = (short) class525_sub38.readUnsignedShort((byte) 109);
	    aShort3979 = (short) class525_sub38.readUnsignedShort((byte) 87);
	    aShort3952 = (short) class525_sub38.readUnsignedShort((byte) 109);
	    int i_27_ = 3;
	    aShort3934 <<= i_27_;
	    aShort3935 <<= i_27_;
	    aShort3979 <<= i_27_;
	    aShort3952 <<= i_27_;
	} else if (i == 2)
	    class525_sub38.readUnsignedByte(1825917783);
	else if (i == 3) {
	    anInt3955 = class525_sub38.readInt(896682198) * -1530284993;
	    anInt3936 = class525_sub38.readInt(1559596231) * 1333200205;
	} else if (4 == i) {
	    anInt3943 = class525_sub38.readUnsignedByte(1691661756) * 990500509;
	    anInt3941 = class525_sub38.readByte(-1150098071) * -2127047939;
	} else if (5 == i)
	    anInt3944 = (anInt3945 = (class525_sub38.readUnsignedShort((byte) 2)
				      << 12 << 2) * -1144849799) * 2094561289;
	else if (6 == i) {
	    anInt3948 = class525_sub38.readInt(1877828894) * 762631693;
	    anInt3965 = class525_sub38.readInt(1405313462) * -832462119;
	} else if (7 == i) {
	    anInt4003 = class525_sub38.readUnsignedShort((byte) 9) * -1957246667;
	    anInt3956 = class525_sub38.readUnsignedShort((byte) 58) * 1059080273;
	} else if (8 == i) {
	    anInt3957 = class525_sub38.readUnsignedShort((byte) 113) * 186346957;
	    anInt3958 = class525_sub38.readUnsignedShort((byte) 13) * 258314135;
	} else if (9 == i) {
	    int i_28_ = class525_sub38.readUnsignedByte(90102830);
	    anIntArray3959 = new int[i_28_];
	    for (int i_29_ = 0; i_29_ < i_28_; i_29_++)
		anIntArray3959[i_29_] = class525_sub38.readUnsignedShort((byte) 77);
	} else if (10 == i) {
	    int i_30_ = class525_sub38.readUnsignedByte(254802695);
	    anIntArray3961 = new int[i_30_];
	    for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
		anIntArray3961[i_31_] = class525_sub38.readUnsignedShort((byte) 46);
	} else if (i == 12)
	    anInt3964 = class525_sub38.readByte(-1150098071) * 2012260329;
	else if (13 == i)
	    anInt3931 = class525_sub38.readByte(-1150098071) * -208758775;
	else if (i == 14)
	    anInt3966 = class525_sub38.readUnsignedShort((byte) 125) * 136772283;
	else if (i == 15)
	    anInt3949 = class525_sub38.readUnsignedShort((byte) 67) * 1913216545;
	else if (16 == i) {
	    aBool4005 = class525_sub38.readUnsignedByte(1342806627) == 1;
	    anInt3985 = class525_sub38.readUnsignedShort((byte) 105) * 492752967;
	    anInt3970 = class525_sub38.readUnsignedShort((byte) 38) * -70097859;
	    aBool3968 = class525_sub38.readUnsignedByte(1906971816) == 1;
	} else if (i == 17)
	    anInt3973 = class525_sub38.readUnsignedShort((byte) 6) * 201433791;
	else if (i == 18)
	    anInt3951 = class525_sub38.readInt(2138719415) * 603427665;
	else if (i == 19)
	    anInt3971 = class525_sub38.readUnsignedByte(724591269) * 787115377;
	else if (20 == i)
	    anInt3939 = class525_sub38.readUnsignedByte(945180090) * 26784685;
	else if (i == 21)
	    anInt3953 = class525_sub38.readUnsignedByte(867935985) * -926958013;
	else if (22 == i)
	    anInt3942 = class525_sub38.readInt(1206338242) * -456744661;
	else if (i == 23)
	    anInt3950 = class525_sub38.readUnsignedByte(1742446418) * 1834937021;
	else if (i == 24)
	    aBool3946 = false;
	else if (i == 25) {
	    int i_32_ = class525_sub38.readUnsignedByte(1151576382);
	    anIntArray3988 = new int[i_32_];
	    for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
		anIntArray3988[i_33_] = class525_sub38.readUnsignedShort((byte) 61);
	} else if (i == 26)
	    aBool3972 = false;
	else if (i == 27)
	    anInt4008 = ((class525_sub38.readUnsignedShort((byte) 102) << 12 << 2)
			 * 1685751505);
	else if (28 == i)
	    anInt3947 = class525_sub38.readUnsignedByte(317816971) * 765812099;
	else if (i == 29) {
	    if (class525_sub38.readUnsignedByte(2064610917) == 0)
		anInt3977
		    = ((anInt3978
			= class525_sub38.method16625((byte) -92) * 1344133768)
		       * -1878186241);
	    else {
		anInt3977
		    = class525_sub38.method16625((byte) -107) * -720052872;
		anInt3978 = class525_sub38.method16625((byte) 1) * 1344133768;
	    }
	} else if (30 == i)
	    aBool3991 = true;
	else if (31 == i) {
	    anInt3944 = ((class525_sub38.readUnsignedShort((byte) 80) << 12 << 2)
			 * -245660095);
	    anInt3945 = ((class525_sub38.readUnsignedShort((byte) 93) << 12 << 2)
			 * -1144849799);
	} else if (i == 32)
	    aBool3980 = false;
	else if (i == 33)
	    aBool3981 = true;
	else if (i == 34)
	    aBool3982 = false;
	else if (i == 35) {
	    if (class525_sub38.readUnsignedByte(1733933738) == 0)
		anInt3974 = (anInt3975 = (class525_sub38.method16625((byte) 38)
					  * 596477720)) * -557461067;
	    else {
		anInt3974 = class525_sub38.method16625((byte) 55) * 1943215096;
		anInt3975 = class525_sub38.method16625((byte) -76) * 596477720;
		anInt3976 = class525_sub38.readUnsignedByte(1159706240) * 427892141;
	    }
	} else if (36 == i)
	    aBool3983 = true;
    }
    
    void method6424() {
	if (anInt3964 * -423321511 > -2 || anInt3931 * -993233351 > -2)
	    aBool3984 = true;
	anInt3938 = (anInt3948 * 808085701 >> 16 & 0xff) * -69134601;
	anInt3986 = -841755427 * (-2109031063 * anInt3965 >> 16 & 0xff);
	anInt3987 = -974834359 * anInt3986 - -457383453 * anInt3938;
	anInt3989 = (anInt3948 * 808085701 >> 8 & 0xff) * 439487769;
	anInt3962 = (anInt3965 * -2109031063 >> 8 & 0xff) * -569975181;
	anInt3990 = -1474465835 * anInt3962 - anInt3989 * 105656071;
	anInt3940 = (808085701 * anInt3948 & 0xff) * 852493149;
	anInt3992 = -1396967955 * (-2109031063 * anInt3965 & 0xff);
	anInt3993 = 1565063805 * anInt3992 - anInt3940 * -554232051;
	anInt3994 = (anInt3948 * 808085701 >> 24 & 0xff) * -1114474803;
	anInt3995 = (anInt3965 * -2109031063 >> 24 & 0xff) * -1790252291;
	anInt3954 = anInt3995 * -1268578149 - -979458581 * anInt3994;
	if (anInt3951 * -2138729039 != 0) {
	    anInt3997 = -1965240567 * (anInt3939 * -542693339
				       * (-1303510863 * anInt3956) / 100);
	    anInt3998 = (anInt3953 * -1849164181 * (-1303510863 * anInt3956)
			 / 100 * -276923031);
	    if (-1043763399 * anInt3997 == 0)
		anInt3997 = -1965240567;
	    anInt3999 = -891443641 * ((((-2138729039 * anInt3951 >> 16 & 0xff)
					- (anInt3938 * -938833209
					   + -450873139 * anInt3987 / 2))
				       << 8)
				      / (-1043763399 * anInt3997));
	    anInt4000 = 1468158721 * ((((-2138729039 * anInt3951 >> 8 & 0xff)
					- (-126812375 * anInt3989
					   + anInt3990 * -549280689 / 2))
				       << 8)
				      / (-1043763399 * anInt3997));
	    anInt4001
		= (((anInt3951 * -2138729039 & 0xff)
		    - (anInt3993 * 365666185 / 2 + 568027381 * anInt3940))
		   << 8) / (anInt3997 * -1043763399) * 477515535;
	    if (0 == 1802101465 * anInt3998)
		anInt3998 = -276923031;
	    anInt4002
		= (((-2138729039 * anInt3951 >> 24 & 0xff)
		    - (anInt3994 * -939104763 + anInt3954 * 2069526479 / 2))
		   << 8) / (1802101465 * anInt3998) * 1394527159;
	    Class382 class382_34_ = this;
	    class382_34_.anInt3999
		= (class382_34_.anInt3999
		   + (anInt3999 * 1122247543 > 0 ? -4 : 4) * -891443641);
	    Class382 class382_35_ = this;
	    class382_35_.anInt4000
		= (class382_35_.anInt4000
		   + (anInt4000 * -2073645823 > 0 ? -4 : 4) * 1468158721);
	    Class382 class382_36_ = this;
	    class382_36_.anInt4001
		= (class382_36_.anInt4001
		   + 477515535 * (1316012015 * anInt4001 > 0 ? -4 : 4));
	    Class382 class382_37_ = this;
	    class382_37_.anInt4002
		= (class382_37_.anInt4002
		   + (anInt4002 * -1980300793 > 0 ? -4 : 4) * 1394527159);
	}
	if (1508447619 * anInt3942 != -1) {
	    anInt4006 = -2040452279 * (anInt3950 * -947068779
				       * (anInt3956 * -1303510863) / 100);
	    if (0 == 1375713017 * anInt4006)
		anInt4006 = -2040452279;
	    anInt4004
		= ((1508447619 * anInt3942
		    - ((anInt3936 * -839402619 - anInt3955 * 1359494079) / 2
		       + 1359494079 * anInt3955))
		   / (anInt4006 * 1375713017) * 1803989195);
	}
	if (-1 != anInt4008 * -178679247) {
	    anInt3937 = -1598513323 * (anInt3947 * -193816277
				       * (anInt3956 * -1303510863) / 100);
	    if (1542874621 * anInt3937 == 0)
		anInt3937 = -1598513323;
	    anInt3932
		= (anInt4008 * -178679247
		   - (1265076673 * anInt3944
		      + ((-435269687 * anInt3945 - 1265076673 * anInt3944)
			 / 2))) / (1542874621 * anInt3937) * -1682019213;
	}
	anInt4007 = -392938939 * anInt3975 - anInt3974 * -745185199;
	anInt3960 = -1642172635 * anInt3978 - -297996837 * anInt3977;
    }
    
    void method6425() {
	if (anInt3964 * -423321511 > -2 || anInt3931 * -993233351 > -2)
	    aBool3984 = true;
	anInt3938 = (anInt3948 * 808085701 >> 16 & 0xff) * -69134601;
	anInt3986 = -841755427 * (-2109031063 * anInt3965 >> 16 & 0xff);
	anInt3987 = -974834359 * anInt3986 - -457383453 * anInt3938;
	anInt3989 = (anInt3948 * 808085701 >> 8 & 0xff) * 439487769;
	anInt3962 = (anInt3965 * -2109031063 >> 8 & 0xff) * -569975181;
	anInt3990 = -1474465835 * anInt3962 - anInt3989 * 105656071;
	anInt3940 = (808085701 * anInt3948 & 0xff) * 852493149;
	anInt3992 = -1396967955 * (-2109031063 * anInt3965 & 0xff);
	anInt3993 = 1565063805 * anInt3992 - anInt3940 * -554232051;
	anInt3994 = (anInt3948 * 808085701 >> 24 & 0xff) * -1114474803;
	anInt3995 = (anInt3965 * -2109031063 >> 24 & 0xff) * -1790252291;
	anInt3954 = anInt3995 * -1268578149 - -979458581 * anInt3994;
	if (anInt3951 * -2138729039 != 0) {
	    anInt3997 = -1965240567 * (anInt3939 * -542693339
				       * (-1303510863 * anInt3956) / 100);
	    anInt3998 = (anInt3953 * -1849164181 * (-1303510863 * anInt3956)
			 / 100 * -276923031);
	    if (-1043763399 * anInt3997 == 0)
		anInt3997 = -1965240567;
	    anInt3999 = -891443641 * ((((-2138729039 * anInt3951 >> 16 & 0xff)
					- (anInt3938 * -938833209
					   + -450873139 * anInt3987 / 2))
				       << 8)
				      / (-1043763399 * anInt3997));
	    anInt4000 = 1468158721 * ((((-2138729039 * anInt3951 >> 8 & 0xff)
					- (-126812375 * anInt3989
					   + anInt3990 * -549280689 / 2))
				       << 8)
				      / (-1043763399 * anInt3997));
	    anInt4001
		= (((anInt3951 * -2138729039 & 0xff)
		    - (anInt3993 * 365666185 / 2 + 568027381 * anInt3940))
		   << 8) / (anInt3997 * -1043763399) * 477515535;
	    if (0 == 1802101465 * anInt3998)
		anInt3998 = -276923031;
	    anInt4002
		= (((-2138729039 * anInt3951 >> 24 & 0xff)
		    - (anInt3994 * -939104763 + anInt3954 * 2069526479 / 2))
		   << 8) / (1802101465 * anInt3998) * 1394527159;
	    Class382 class382_38_ = this;
	    class382_38_.anInt3999
		= (class382_38_.anInt3999
		   + (anInt3999 * 1122247543 > 0 ? -4 : 4) * -891443641);
	    Class382 class382_39_ = this;
	    class382_39_.anInt4000
		= (class382_39_.anInt4000
		   + (anInt4000 * -2073645823 > 0 ? -4 : 4) * 1468158721);
	    Class382 class382_40_ = this;
	    class382_40_.anInt4001
		= (class382_40_.anInt4001
		   + 477515535 * (1316012015 * anInt4001 > 0 ? -4 : 4));
	    Class382 class382_41_ = this;
	    class382_41_.anInt4002
		= (class382_41_.anInt4002
		   + (anInt4002 * -1980300793 > 0 ? -4 : 4) * 1394527159);
	}
	if (1508447619 * anInt3942 != -1) {
	    anInt4006 = -2040452279 * (anInt3950 * -947068779
				       * (anInt3956 * -1303510863) / 100);
	    if (0 == 1375713017 * anInt4006)
		anInt4006 = -2040452279;
	    anInt4004
		= ((1508447619 * anInt3942
		    - ((anInt3936 * -839402619 - anInt3955 * 1359494079) / 2
		       + 1359494079 * anInt3955))
		   / (anInt4006 * 1375713017) * 1803989195);
	}
	if (-1 != anInt4008 * -178679247) {
	    anInt3937 = -1598513323 * (anInt3947 * -193816277
				       * (anInt3956 * -1303510863) / 100);
	    if (1542874621 * anInt3937 == 0)
		anInt3937 = -1598513323;
	    anInt3932
		= (anInt4008 * -178679247
		   - (1265076673 * anInt3944
		      + ((-435269687 * anInt3945 - 1265076673 * anInt3944)
			 / 2))) / (1542874621 * anInt3937) * -1682019213;
	}
	anInt4007 = -392938939 * anInt3975 - anInt3974 * -745185199;
	anInt3960 = -1642172635 * anInt3978 - -297996837 * anInt3977;
    }
    
    void method6426() {
	if (anInt3964 * -423321511 > -2 || anInt3931 * -993233351 > -2)
	    aBool3984 = true;
	anInt3938 = (anInt3948 * 808085701 >> 16 & 0xff) * -69134601;
	anInt3986 = -841755427 * (-2109031063 * anInt3965 >> 16 & 0xff);
	anInt3987 = -974834359 * anInt3986 - -457383453 * anInt3938;
	anInt3989 = (anInt3948 * 808085701 >> 8 & 0xff) * 439487769;
	anInt3962 = (anInt3965 * -2109031063 >> 8 & 0xff) * -569975181;
	anInt3990 = -1474465835 * anInt3962 - anInt3989 * 105656071;
	anInt3940 = (808085701 * anInt3948 & 0xff) * 852493149;
	anInt3992 = -1396967955 * (-2109031063 * anInt3965 & 0xff);
	anInt3993 = 1565063805 * anInt3992 - anInt3940 * -554232051;
	anInt3994 = (anInt3948 * 808085701 >> 24 & 0xff) * -1114474803;
	anInt3995 = (anInt3965 * -2109031063 >> 24 & 0xff) * -1790252291;
	anInt3954 = anInt3995 * -1268578149 - -979458581 * anInt3994;
	if (anInt3951 * -2138729039 != 0) {
	    anInt3997 = -1965240567 * (anInt3939 * -542693339
				       * (-1303510863 * anInt3956) / 100);
	    anInt3998 = (anInt3953 * -1849164181 * (-1303510863 * anInt3956)
			 / 100 * -276923031);
	    if (-1043763399 * anInt3997 == 0)
		anInt3997 = -1965240567;
	    anInt3999 = -891443641 * ((((-2138729039 * anInt3951 >> 16 & 0xff)
					- (anInt3938 * -938833209
					   + -450873139 * anInt3987 / 2))
				       << 8)
				      / (-1043763399 * anInt3997));
	    anInt4000 = 1468158721 * ((((-2138729039 * anInt3951 >> 8 & 0xff)
					- (-126812375 * anInt3989
					   + anInt3990 * -549280689 / 2))
				       << 8)
				      / (-1043763399 * anInt3997));
	    anInt4001
		= (((anInt3951 * -2138729039 & 0xff)
		    - (anInt3993 * 365666185 / 2 + 568027381 * anInt3940))
		   << 8) / (anInt3997 * -1043763399) * 477515535;
	    if (0 == 1802101465 * anInt3998)
		anInt3998 = -276923031;
	    anInt4002
		= (((-2138729039 * anInt3951 >> 24 & 0xff)
		    - (anInt3994 * -939104763 + anInt3954 * 2069526479 / 2))
		   << 8) / (1802101465 * anInt3998) * 1394527159;
	    Class382 class382_42_ = this;
	    class382_42_.anInt3999
		= (class382_42_.anInt3999
		   + (anInt3999 * 1122247543 > 0 ? -4 : 4) * -891443641);
	    Class382 class382_43_ = this;
	    class382_43_.anInt4000
		= (class382_43_.anInt4000
		   + (anInt4000 * -2073645823 > 0 ? -4 : 4) * 1468158721);
	    Class382 class382_44_ = this;
	    class382_44_.anInt4001
		= (class382_44_.anInt4001
		   + 477515535 * (1316012015 * anInt4001 > 0 ? -4 : 4));
	    Class382 class382_45_ = this;
	    class382_45_.anInt4002
		= (class382_45_.anInt4002
		   + (anInt4002 * -1980300793 > 0 ? -4 : 4) * 1394527159);
	}
	if (1508447619 * anInt3942 != -1) {
	    anInt4006 = -2040452279 * (anInt3950 * -947068779
				       * (anInt3956 * -1303510863) / 100);
	    if (0 == 1375713017 * anInt4006)
		anInt4006 = -2040452279;
	    anInt4004
		= ((1508447619 * anInt3942
		    - ((anInt3936 * -839402619 - anInt3955 * 1359494079) / 2
		       + 1359494079 * anInt3955))
		   / (anInt4006 * 1375713017) * 1803989195);
	}
	if (-1 != anInt4008 * -178679247) {
	    anInt3937 = -1598513323 * (anInt3947 * -193816277
				       * (anInt3956 * -1303510863) / 100);
	    if (1542874621 * anInt3937 == 0)
		anInt3937 = -1598513323;
	    anInt3932
		= (anInt4008 * -178679247
		   - (1265076673 * anInt3944
		      + ((-435269687 * anInt3945 - 1265076673 * anInt3944)
			 / 2))) / (1542874621 * anInt3937) * -1682019213;
	}
	anInt4007 = -392938939 * anInt3975 - anInt3974 * -745185199;
	anInt3960 = -1642172635 * anInt3978 - -297996837 * anInt3977;
    }
    
    public static int method6427(int i, int i_46_, int i_47_, short i_48_) {
	i_47_ &= 0x3;
	if (0 == i_47_)
	    return i;
	if (1 == i_47_)
	    return i_46_;
	if (2 == i_47_)
	    return 7 - i;
	return 7 - i_46_;
    }
    
    static final void method6428(int i) {
	Class525_Sub38_Sub2 class525_sub38_sub2
	    = client.aClass96_11085.aClass525_Sub38_Sub2_1168;
	for (int i_49_ = 0; i_49_ < 1311380065 * client.anInt11126; i_49_++) {
	    int i_50_ = client.anIntArray11297[i_49_];
	    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		= ((Class656_Sub1_Sub3_Sub1_Sub2)
		   (((Class525_Sub19)
		     client.aClass10_11121.method684((long) i_50_))
		    .anObject10571));
	    class525_sub38_sub2.readUnsignedShort((byte) 63);
	    int i_51_ = class525_sub38_sub2.readUnsignedByte(541076717);
	    if ((i_51_ & 0x10) != 0)
		i_51_ += class525_sub38_sub2.readUnsignedByte(1158338117) << 8;
	    if ((i_51_ & 0x200) != 0)
		i_51_ += class525_sub38_sub2.readUnsignedByte(391951050) << 16;
	    if (0 != (i_51_ & 0x400000))
		i_51_ += class525_sub38_sub2.readUnsignedByte(-3650773) << 24;
	    if ((i_51_ & 0x80000) != 0) {
		class656_sub1_sub3_sub1_sub2.aString12264
		    = class525_sub38_sub2.readString((byte) -28);
		if ("".equals(class656_sub1_sub3_sub1_sub2.aString12264)
		    || (class656_sub1_sub3_sub1_sub2.aString12264.equals
			(class656_sub1_sub3_sub1_sub2.aClass299_12255
			 .aString3290)))
		    class656_sub1_sub3_sub1_sub2.aString12264
			= (class656_sub1_sub3_sub1_sub2.aClass299_12255
			   .aString3290);
	    }
	    if ((i_51_ & 0x1000000) != 0) {
		int i_52_ = class525_sub38_sub2.readUnsignedShort((byte) 3);
		int i_53_ = class525_sub38_sub2.method16677(-1367314671);
		if (i_52_ == 65535)
		    i_52_ = -1;
		int i_54_ = class525_sub38_sub2.method16607(-1571461918);
		int i_55_ = i_54_ & 0x7;
		int i_56_ = i_54_ >> 3 & 0xf;
		if (15 == i_56_)
		    i_56_ = -1;
		boolean bool = 1 == (i_54_ >> 7 & 0x1);
		class656_sub1_sub3_sub1_sub2.method18602(i_52_, i_53_, i_55_,
							 i_56_, bool, 2,
							 -1748523788);
	    }
	    if (0 != (i_51_ & 0x8)) {
		class656_sub1_sub3_sub1_sub2.anInt12266
		    = class525_sub38_sub2.readUnsignedShort((byte) 10) * 1593949769;
		class656_sub1_sub3_sub1_sub2.anInt12257
		    = (class525_sub38_sub2.method16680(-1221297967)
		       * -1238434123);
	    }
	    if (0 != (i_51_ & 0x4)) {
		int i_57_ = class525_sub38_sub2.readUnsignedByte(501025782);
		if (i_57_ > 0) {
		    for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
			int i_59_ = -1;
			int i_60_ = -1;
			int i_61_ = -1;
			int i_62_ = class525_sub38_sub2.method16740((byte) -5);
			if (32767 == i_62_) {
			    i_62_
				= class525_sub38_sub2.method16740((byte) -89);
			    i_60_
				= class525_sub38_sub2.method16740((byte) -91);
			    i_59_
				= class525_sub38_sub2.method16740((byte) -107);
			    i_61_
				= class525_sub38_sub2.method16740((byte) -20);
			} else if (i_62_ != 32766)
			    i_60_
				= class525_sub38_sub2.method16740((byte) -103);
			else {
			    i_62_ = -1;
			    i_60_
				= class525_sub38_sub2.method16607(-1571461918);
			}
			int i_63_
			    = class525_sub38_sub2.method16740((byte) -122);
			class656_sub1_sub3_sub1_sub2.method18634(i_62_, i_60_,
								 i_59_, i_61_,
								 (client
								  .anInt11083),
								 i_63_,
								 944101253);
		    }
		}
		int i_64_ = class525_sub38_sub2.readUnsignedByte(706166929);
		if (i_64_ > 0) {
		    for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
			int i_66_
			    = class525_sub38_sub2.method16740((byte) -46);
			int i_67_ = class525_sub38_sub2.method16740((byte) -5);
			if (32767 != i_67_) {
			    int i_68_
				= class525_sub38_sub2.method16740((byte) -76);
			    int i_69_
				= class525_sub38_sub2.method16624(-456149717);
			    int i_70_ = (i_67_ > 0
					 ? class525_sub38_sub2
					       .method16607(-1571461918)
					 : i_69_);
			    class656_sub1_sub3_sub1_sub2.method18605
				(i_66_, client.anInt11083, i_67_, i_68_, i_69_,
				 i_70_, -2071819227);
			} else
			    class656_sub1_sub3_sub1_sub2
				.method18631(i_66_, 2137804513);
		    }
		}
	    }
	    if (0 != (i_51_ & 0x4000)) {
		int i_71_ = class525_sub38_sub2.method16624(1631916120);
		int[] is = new int[i_71_];
		int[] is_72_ = new int[i_71_];
		int[] is_73_ = new int[i_71_];
		for (int i_74_ = 0; i_74_ < i_71_; i_74_++) {
		    int i_75_ = class525_sub38_sub2.readBigSmart(-2043778683);
		    is[i_74_] = i_75_;
		    is_72_[i_74_]
			= class525_sub38_sub2.readUnsignedByte(1857591441);
		    is_73_[i_74_]
			= class525_sub38_sub2.method16680(-402259177);
		}
		Class491.method7989(class656_sub1_sub3_sub1_sub2, is, is_72_,
				    is_73_, (byte) 15);
	    }
	    if (0 != (i_51_ & 0x2000000)) {
		class656_sub1_sub3_sub1_sub2.aByte12000
		    = class525_sub38_sub2.method16663((byte) 61);
		class656_sub1_sub3_sub1_sub2.aByte12001
		    = class525_sub38_sub2.method16663((byte) 109);
		class656_sub1_sub3_sub1_sub2.aByte12002
		    = class525_sub38_sub2.method16662(-880411526);
		class656_sub1_sub3_sub1_sub2.aByte11979
		    = (byte) class525_sub38_sub2.readUnsignedByte(83010948);
		class656_sub1_sub3_sub1_sub2.anInt11981
		    = ((client.anInt11083
			+ class525_sub38_sub2.method16680(-427971148))
		       * -1693335625);
		class656_sub1_sub3_sub1_sub2.anInt11999
		    = ((client.anInt11083
			+ class525_sub38_sub2.readUnsignedShort((byte) 13))
		       * 1584360751);
	    }
	    if ((i_51_ & 0x1) != 0) {
		if (class656_sub1_sub3_sub1_sub2.aClass299_12255
			.method5370(65280))
		    Class222.method4240(class656_sub1_sub3_sub1_sub2, 65280);
		class656_sub1_sub3_sub1_sub2.method18943
		    ((Class299) (Class168_Sub1.aClass40_Sub7_9112.method76
				 (class525_sub38_sub2.readBigSmart(-2043778683),
				  -918057338)),
		     0 == (i_51_ & 0x80000), (i_51_ & 0x10000) == 0, true,
		     1242431543);
		class656_sub1_sub3_sub1_sub2.method18607
		    (1035256919 * (class656_sub1_sub3_sub1_sub2.aClass299_12255
				   .anInt3291),
		     133251852);
		class656_sub1_sub3_sub1_sub2.anInt12003
		    = ((class656_sub1_sub3_sub1_sub2.aClass299_12255.anInt3322
			* -412681569)
		       << 3) * -1104516755;
		if (class656_sub1_sub3_sub1_sub2.aClass299_12255
			.method5370(65280))
		    Class610.method10024
			(class656_sub1_sub3_sub1_sub2.aByte10867,
			 class656_sub1_sub3_sub1_sub2.anIntArray12014[0],
			 class656_sub1_sub3_sub1_sub2.anIntArray12017[0], 0,
			 null, class656_sub1_sub3_sub1_sub2, null,
			 (short) -19096);
	    }
	    if ((i_51_ & 0x40) != 0) {
		int i_76_ = class525_sub38_sub2.method16668((byte) -62);
		int i_77_ = class525_sub38_sub2.method16679((byte) -107);
		if (65535 == i_76_)
		    i_76_ = -1;
		int i_78_ = class525_sub38_sub2.method16660(1985981137);
		int i_79_ = i_78_ & 0x7;
		int i_80_ = i_78_ >> 3 & 0xf;
		if (i_80_ == 15)
		    i_80_ = -1;
		boolean bool = (i_78_ >> 7 & 0x1) == 1;
		class656_sub1_sub3_sub1_sub2.method18602(i_76_, i_77_, i_79_,
							 i_80_, bool, 0,
							 1833501150);
	    }
	    if (0 != (i_51_ & 0x10000000))
		class656_sub1_sub3_sub1_sub2.aBool11967
		    = class525_sub38_sub2.method16607(-1571461918) == 1;
	    if (0 != (i_51_ & 0x20)) {
		int[] is = new int[4];
		for (int i_81_ = 0; i_81_ < 4; i_81_++)
		    is[i_81_] = class525_sub38_sub2.readBigSmart(-2043778683);
		int i_82_ = class525_sub38_sub2.method16624(-547148282);
		Class453_Sub2.method15917(class656_sub1_sub3_sub1_sub2, is,
					  i_82_, true, 2079825443);
	    }
	    if ((i_51_ & 0x80) != 0) {
		class656_sub1_sub3_sub1_sub2.anInt11983
		    = class525_sub38_sub2.method16667(189472990) * 104662899;
		if (class656_sub1_sub3_sub1_sub2.anInt11983 * -705923653
		    == 65535)
		    class656_sub1_sub3_sub1_sub2.anInt11983 = -104662899;
	    }
	    if ((i_51_ & 0x800000) != 0) {
		int i_83_ = (class656_sub1_sub3_sub1_sub2.aClass299_12255
			     .anIntArray3293).length;
		int i_84_ = 0;
		if ((class656_sub1_sub3_sub1_sub2.aClass299_12255
		     .aShortArray3347)
		    != null)
		    i_84_ = (class656_sub1_sub3_sub1_sub2.aClass299_12255
			     .aShortArray3347).length;
		int i_85_ = 0;
		if (null != (class656_sub1_sub3_sub1_sub2.aClass299_12255
			     .aShortArray3300))
		    i_84_ = (class656_sub1_sub3_sub1_sub2.aClass299_12255
			     .aShortArray3300).length;
		int i_86_ = class525_sub38_sub2.method16607(-1571461918);
		if ((i_86_ & 0x1) != 1) {
		    class525_sub38_sub2.pos += 678856942;
		    int[] is = null;
		    if (2 == (i_86_ & 0x2)) {
			is = new int[i_83_];
			for (int i_87_ = 0; i_87_ < i_83_; i_87_++)
			    is[i_87_]
				= class525_sub38_sub2.readBigSmart(-2043778683);
		    }
		    short[] is_88_ = null;
		    if ((i_86_ & 0x4) == 4) {
			is_88_ = new short[i_84_];
			for (int i_89_ = 0; i_89_ < i_84_; i_89_++)
			    is_88_[i_89_]
				= (short) class525_sub38_sub2
					      .method16668((byte) 23);
		    }
		    short[] is_90_ = null;
		    if ((i_86_ & 0x8) == 8) {
			is_90_ = new short[i_85_];
			for (int i_91_ = 0; i_91_ < i_85_; i_91_++)
			    is_90_[i_91_]
				= (short) class525_sub38_sub2
					      .method16667(938665666);
		    }
		    long l = (long) ((Class656_Sub1_Sub3_Sub1_Sub2.anInt12269
				      += -1582968257) * 935927231
				     - 1);
		    new Class288(l, is, null, null, null, is_88_, is_90_);
		}
	    }
	    if ((i_51_ & 0x4000000) != 0) {
		int i_92_ = class525_sub38_sub2.readUnsignedShort((byte) 75);
		int i_93_ = class525_sub38_sub2.method16679((byte) 109);
		if (65535 == i_92_)
		    i_92_ = -1;
		int i_94_ = class525_sub38_sub2.method16607(-1571461918);
		int i_95_ = i_94_ & 0x7;
		int i_96_ = i_94_ >> 3 & 0xf;
		if (i_96_ == 15)
		    i_96_ = -1;
		boolean bool = (i_94_ >> 7 & 0x1) == 1;
		class656_sub1_sub3_sub1_sub2.method18602(i_92_, i_93_, i_95_,
							 i_96_, bool, 3,
							 -333841689);
	    }
	    if (0 != (i_51_ & 0x400)) {
		int i_97_ = (class656_sub1_sub3_sub1_sub2.aClass299_12255
			     .anIntArray3324).length;
		int i_98_ = 0;
		if ((class656_sub1_sub3_sub1_sub2.aClass299_12255
		     .aShortArray3347)
		    != null)
		    i_98_ = (class656_sub1_sub3_sub1_sub2.aClass299_12255
			     .aShortArray3347).length;
		int i_99_ = 0;
		if (null != (class656_sub1_sub3_sub1_sub2.aClass299_12255
			     .aShortArray3300))
		    i_99_ = (class656_sub1_sub3_sub1_sub2.aClass299_12255
			     .aShortArray3300).length;
		int i_100_ = class525_sub38_sub2.method16607(-1571461918);
		if (1 == (i_100_ & 0x1))
		    class656_sub1_sub3_sub1_sub2.aClass288_12258 = null;
		else {
		    class525_sub38_sub2.pos += 678856942;
		    int[] is = null;
		    float[] fs = null;
		    int[][] is_101_ = null;
		    int[][] is_102_ = null;
		    if ((i_100_ & 0x2) == 2) {
			is = new int[i_97_];
			if (16 == (i_100_ & 0x10)) {
			    fs = new float[i_97_];
			    is_101_ = new int[i_97_][3];
			    is_102_ = new int[i_97_][3];
			}
			for (int i_103_ = 0; i_103_ < i_97_; i_103_++) {
			    is[i_103_]
				= class525_sub38_sub2.readBigSmart(-2043778683);
			    if ((i_100_ & 0x10) == 16 && is[i_103_] != -1) {
				fs[i_103_] = class525_sub38_sub2
						 .method16634(-1287076027);
				for (int i_104_ = 0; i_104_ < 3; i_104_++)
				    is_101_[i_103_][i_104_]
					= class525_sub38_sub2
					      .method16670((byte) 86);
				for (int i_105_ = 0; i_105_ < 3; i_105_++)
				    is_102_[i_103_][i_105_]
					= class525_sub38_sub2
					      .method16669((short) 14476);
			    }
			}
		    }
		    short[] is_106_ = null;
		    if (4 == (i_100_ & 0x4)) {
			is_106_ = new short[i_98_];
			for (int i_107_ = 0; i_107_ < i_98_; i_107_++)
			    is_106_[i_107_]
				= (short) class525_sub38_sub2
					      .method16668((byte) 2);
		    }
		    short[] is_108_ = null;
		    if (8 == (i_100_ & 0x8)) {
			is_108_ = new short[i_99_];
			for (int i_109_ = 0; i_109_ < i_99_; i_109_++)
			    is_108_[i_109_]
				= (short) class525_sub38_sub2
					      .method16680(-1517698835);
		    }
		    long l = (long) ((Class656_Sub1_Sub3_Sub1_Sub2.anInt12259
				      += 1465576967) * -265609289
				     - 1);
		    class656_sub1_sub3_sub1_sub2.aClass288_12258
			= new Class288(l, is, fs, is_101_, is_102_, is_106_,
				       is_108_);
		}
	    }
	    if ((i_51_ & 0x10000) != 0) {
		class656_sub1_sub3_sub1_sub2.anInt12260
		    = class525_sub38_sub2.method16668((byte) 16) * 1377492623;
		if (65535
		    == 550404207 * class656_sub1_sub3_sub1_sub2.anInt12260)
		    class656_sub1_sub3_sub1_sub2.anInt12260
			= 1093076055 * (class656_sub1_sub3_sub1_sub2
					.aClass299_12255.anInt3311);
	    }
	    if (0 != (i_51_ & 0x20000000))
		class656_sub1_sub3_sub1_sub2.anInt12271
		    = (class525_sub38_sub2.method16607(-1571461918)
		       * -1959150295);
	    if ((i_51_ & 0x100) != 0) {
		class656_sub1_sub3_sub1_sub2.anInt11989
		    = class525_sub38_sub2.method16739(907094016) * -1300706795;
		class656_sub1_sub3_sub1_sub2.anInt11991
		    = class525_sub38_sub2.method16739(907094016) * 1121862737;
		class656_sub1_sub3_sub1_sub2.anInt11990
		    = class525_sub38_sub2.method16739(907094016) * -140650319;
		class656_sub1_sub3_sub1_sub2.anInt12018
		    = class525_sub38_sub2.readByte(-1150098071) * 748154517;
		class656_sub1_sub3_sub1_sub2.anInt11993
		    = class525_sub38_sub2.readByte(-1150098071) * 31761437;
		class656_sub1_sub3_sub1_sub2.anInt11968
		    = (class525_sub38_sub2.readByte(-1150098071)
		       * -524750117);
		class656_sub1_sub3_sub1_sub2.anInt11995
		    = (class525_sub38_sub2.method16680(-2101719849)
		       + client.anInt11083) * 1917157447;
		class656_sub1_sub3_sub1_sub2.anInt11996
		    = (class525_sub38_sub2.method16668((byte) -62)
		       + client.anInt11083) * -1392686703;
		class656_sub1_sub3_sub1_sub2.anInt11997
		    = class525_sub38_sub2.method16667(796397780) * -1631328201;
		class656_sub1_sub3_sub1_sub2.anInt12015 = -901267287;
		class656_sub1_sub3_sub1_sub2.anInt11970 = 0;
		class656_sub1_sub3_sub1_sub2.anInt11989
		    += (class656_sub1_sub3_sub1_sub2.anIntArray12014[0]
			* -1300706795);
		class656_sub1_sub3_sub1_sub2.anInt11991
		    += (class656_sub1_sub3_sub1_sub2.anIntArray12017[0]
			* 1121862737);
		class656_sub1_sub3_sub1_sub2.anInt11990
		    += (class656_sub1_sub3_sub1_sub2.anIntArray12014[0]
			* -140650319);
		class656_sub1_sub3_sub1_sub2.anInt12018
		    += (748154517
			* class656_sub1_sub3_sub1_sub2.anIntArray12017[0]);
		class656_sub1_sub3_sub1_sub2.anInt11993
		    += 31761437 * class656_sub1_sub3_sub1_sub2.aByte10867;
		class656_sub1_sub3_sub1_sub2.anInt11968
		    += class656_sub1_sub3_sub1_sub2.aByte10867 * -524750117;
	    }
	    if (0 != (i_51_ & 0x100000)) {
		class656_sub1_sub3_sub1_sub2.anInterface3_11961
		    .method19(-711664883);
		class525_sub38_sub2.pos += 678856942;
		int i_110_ = ((class525_sub38_sub2.buffer
			       [((class525_sub38_sub2.pos += 339428471)
				 * -1133521593) - 1])
			      & 0xff);
		for (int i_111_ = 0; i_111_ < i_110_; i_111_++) {
		    int i_112_ = class525_sub38_sub2.readUnsignedByte(458386869);
		    Class480 class480
			= ((Class480)
			   Class539.method8888(Class480.method7811(708106611),
					       i_112_, 1653230763));
		    Class447 class447
			= (Class293.aClass106_Sub1_Sub2_3239.method14522
			   (class525_sub38_sub2, class480, 1005577089));
		    class656_sub1_sub3_sub1_sub2.anInterface3_11961.method18
			(class447.anInt4898 * -316828413,
			 class447.anObject4899, (byte) -20);
		}
	    }
	    if (0 != (i_51_ & 0x200000)) {
		class525_sub38_sub2.pos += 678856942;
		int i_113_ = ((class525_sub38_sub2.buffer
			       [((class525_sub38_sub2.pos += 339428471)
				 * -1133521593) - 1])
			      & 0xff);
		for (int i_114_ = 0; i_114_ < i_113_; i_114_++) {
		    int i_115_ = class525_sub38_sub2.method16624(114587596);
		    Class480 class480
			= ((Class480)
			   Class539.method8888(Class480.method7811(2037052417),
					       i_115_, -160074274));
		    Class447 class447
			= (Class293.aClass106_Sub1_Sub2_3239.method14522
			   (class525_sub38_sub2, class480, 1005577089));
		    class656_sub1_sub3_sub1_sub2.anInterface3_11961.method18
			(-316828413 * class447.anInt4898,
			 class447.anObject4899, (byte) -100);
		}
	    }
	    if ((i_51_ & 0x800) != 0) {
		int i_116_ = class525_sub38_sub2.method16667(1939281677);
		int i_117_ = class525_sub38_sub2.method16678((byte) 52);
		if (i_116_ == 65535)
		    i_116_ = -1;
		int i_118_ = class525_sub38_sub2.method16660(2072633167);
		int i_119_ = i_118_ & 0x7;
		int i_120_ = i_118_ >> 3 & 0xf;
		if (i_120_ == 15)
		    i_120_ = -1;
		boolean bool = (i_118_ >> 7 & 0x1) == 1;
		class656_sub1_sub3_sub1_sub2.method18602(i_116_, i_117_,
							 i_119_, i_120_, bool,
							 1, 88420120);
	    }
	    if (0 != (i_51_ & 0x8000)) {
		int i_121_ = class525_sub38_sub2.method16624(-922625230);
		int[] is = new int[i_121_];
		int[] is_122_ = new int[i_121_];
		for (int i_123_ = 0; i_123_ < i_121_; i_123_++) {
		    int i_124_ = class525_sub38_sub2.method16668((byte) -95);
		    if ((i_124_ & 0xc000) == 49152) {
			int i_125_
			    = class525_sub38_sub2.readUnsignedShort((byte) 59);
			is[i_123_] = i_124_ << 16 | i_125_;
		    } else
			is[i_123_] = i_124_;
		    is_122_[i_123_]
			= class525_sub38_sub2.method16680(-469419103);
		}
		class656_sub1_sub3_sub1_sub2.method18599(is, is_122_,
							 -1569520123);
	    }
	    if (0 != (i_51_ & 0x40000)) {
		int i_126_ = ((class525_sub38_sub2.buffer
			       [((class525_sub38_sub2.pos += 339428471)
				 * -1133521593) - 1])
			      & 0xff);
		for (int i_127_ = 0; i_127_ < i_126_; i_127_++) {
		    int i_128_ = class525_sub38_sub2.method16624(1973803176);
		    int i_129_ = class525_sub38_sub2.method16677(8277451);
		    int i_130_ = class525_sub38_sub2.method16673((byte) 45);
		    class656_sub1_sub3_sub1_sub2
			.method18949(i_128_, i_129_, i_130_, 1892438150);
		}
	    }
	    if (0 != (i_51_ & 0x2))
		class656_sub1_sub3_sub1_sub2.method18950
		    (class525_sub38_sub2.readString((byte) 57), 0, 0,
		     2096203239);
	    if ((i_51_ & 0x8000000) != 0) {
		int i_131_ = class525_sub38_sub2.method16668((byte) 40);
		int i_132_ = class525_sub38_sub2.readInt(1830057808);
		if (65535 == i_131_)
		    i_131_ = -1;
		int i_133_ = class525_sub38_sub2.method16660(1656192349);
		int i_134_ = i_133_ & 0x7;
		int i_135_ = i_133_ >> 3 & 0xf;
		if (i_135_ == 15)
		    i_135_ = -1;
		boolean bool = (i_133_ >> 7 & 0x1) == 1;
		class656_sub1_sub3_sub1_sub2.method18602(i_131_, i_132_,
							 i_134_, i_135_, bool,
							 4, 580448747);
	    }
	    if ((i_51_ & 0x20000) != 0) {
		int i_136_ = class525_sub38_sub2.method16660(1759928398);
		int[] is = new int[8];
		short[] is_137_ = new short[8];
		for (int i_138_ = 0; i_138_ < 8; i_138_++) {
		    if (0 != (i_136_ & 1 << i_138_)) {
			is[i_138_]
			    = class525_sub38_sub2.readBigSmart(-2043778683);
			is_137_[i_138_] = (short) class525_sub38_sub2
						      .method16623(65204700);
		    } else {
			is[i_138_] = -1;
			is_137_[i_138_] = (short) -1;
		    }
		}
		class656_sub1_sub3_sub1_sub2.aClass310_12262
		    = new Class310(is, is_137_);
	    }
	    if (0 != (i_51_ & 0x2000)) {
		class656_sub1_sub3_sub1_sub2.anInt12256
		    = class525_sub38_sub2.method16680(-910788932) * 486599261;
		if (749025781 * class656_sub1_sub3_sub1_sub2.anInt12256
		    == 65535)
		    class656_sub1_sub3_sub1_sub2.anInt12256 = -486599261;
	    }
	}
    }
    
    public static void method6429(int i) {
	if (client.aBool11358) {
	    Class259 class259
		= Class147.method2388(1477024315 * Class462.anInt5096,
				      -974815545 * client.anInt11256,
				      -591235649);
	    if (null != class259 && null != class259.anObjectArray2707) {
		Class525_Sub32 class525_sub32 = new Class525_Sub32();
		class525_sub32.aClass259_10736 = class259;
		class525_sub32.anObjectArray10740 = class259.anObjectArray2707;
		Class241.method4435(class525_sub32, 1473127830);
	    }
	    client.anInt11373 = -888222529;
	    client.anInt11298 = -14628979;
	    client.aBool11358 = false;
	    if (null != class259)
		Class649.method10708(class259, (byte) 0);
	}
    }
}
