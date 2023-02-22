/* Class631 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class631
{
    public int anInt8165;
    public int anInt8166 = -168392388;
    public int[] anIntArray8167 = null;
    public int[] anIntArray8168 = null;
    static final int anInt8169 = 4;
    public int anInt8170 = 137353636;
    static final int anInt8171 = 4;
    public int anInt8172 = 251379948;
    public int anInt8173;
    public boolean aBool8174;
    public int anInt8175;
    public int anInt8176;
    public int anInt8177;
    public int anInt8178 = 1613571725;
    public short aShort8179;
    public byte aByte8180;
    public int anInt8181;
    public short[][] aShortArrayArray8182;
    public short[][][] aShortArrayArrayArray8183;
    public short[][] aShortArrayArray8184;
    public int anInt8185;
    public short[][][] aShortArrayArrayArray8186;
    public int anInt8187;
    public int anInt8188;
    public boolean aBool8189;
    public int anInt8190;
    public int anInt8191;
    public boolean aBool8192;
    public int anInt8193;
    public int anInt8194;
    public int anInt8195;
    public int anInt8196;
    public int anInt8197;
    public int anInt8198;
    static final int anInt8199 = 4;
    public int anInt8200;
    public int anInt8201;
    public boolean aBool8202;
    static final int anInt8203 = 7;
    public int anInt8204;
    public int anInt8205;
    public int anInt8206;
    public int anInt8207;
    public int anInt8208;
    public int anInt8209;
    public int anInt8210;
    
    public Class631(JS5 class458) {
	anInt8175 = -1841618089;
	anInt8176 = -1325572171;
	anInt8177 = 1982310963;
	aBool8202 = true;
	aShort8179 = (short) -1;
	aByte8180 = (byte) 0;
	anInt8181 = 1951008396;
	aBool8174 = true;
	anInt8187 = -1742066922;
	aBool8189 = true;
	anInt8210 = -1477765823;
	anInt8190 = -652150297;
	anInt8209 = -1487755423;
	anInt8193 = -1439490304;
	anInt8194 = -2083970017;
	anInt8173 = 383462016;
	anInt8196 = 30068257;
	anInt8195 = -58116091;
	anInt8198 = 1569051187;
	anInt8201 = -2070378679;
	anInt8200 = 1722928467;
	anInt8165 = 1111762419;
	anInt8204 = -1526720921;
	anInt8205 = -56442031;
	anInt8206 = 393357685;
	anInt8207 = -21646137;
	anInt8185 = -1123334269;
	anInt8191 = -1278965853;
	anInt8197 = 1553362389;
	byte[] is = class458.getTextureData((2028004077
					 * Class638.aClass638_8313.anInt8316),
					1611198228);
	method10313(new RSBuffer(is), (byte) 1);
    }
    
    void method10313(RSBuffer class525_sub38, byte i) {
	boolean bool = false;
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(870289333);
	    if (0 == i_0_)
		break;
	    if (i_0_ == 1) {
		if (null == anIntArray8167) {
		    anInt8166 = -168392388;
		    anIntArray8167 = new int[4];
		    anIntArray8168 = new int[4];
		}
		for (int i_1_ = 0; i_1_ < anIntArray8167.length; i_1_++) {
		    anIntArray8167[i_1_]
			= class525_sub38.readSmart((byte) -61);
		    anIntArray8168[i_1_]
			= class525_sub38.readSmart((byte) 10);
		}
		bool = true;
	    } else if (2 == i_0_)
		anInt8175
		    = class525_sub38.readBigSmart(-2043778683) * 1841618089;
	    else if (3 == i_0_) {
		anInt8166 = class525_sub38.readUnsignedByte(741496285) * -42098097;
		anIntArray8167 = new int[-379729 * anInt8166];
		anIntArray8168 = new int[anInt8166 * -379729];
	    } else if (i_0_ == 4)
		aBool8202 = false;
	    else if (i_0_ == 5)
		anInt8176
		    = class525_sub38.method16834(-1994884458) * 1325572171;
	    else if (6 == i_0_)
		anInt8177
		    = class525_sub38.method16834(-1994884458) * -1982310963;
	    else if (i_0_ == 7) {
		aShortArrayArray8182 = new short[10][4];
		aShortArrayArrayArray8183 = new short[10][4][];
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
		    for (int i_3_ = 0; i_3_ < 4; i_3_++) {
			int i_4_ = class525_sub38.readUnsignedShort((byte) 96);
			if (i_4_ == 65535)
			    i_4_ = -1;
			aShortArrayArray8182[i_2_][i_3_] = (short) i_4_;
			int i_5_ = class525_sub38.readUnsignedShort((byte) 86);
			aShortArrayArrayArray8183[i_2_][i_3_]
			    = new short[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			    int i_7_ = class525_sub38.readUnsignedShort((byte) 115);
			    if (65535 == i_7_)
				i_7_ = -1;
			    aShortArrayArrayArray8183[i_2_][i_3_][i_6_]
				= (short) i_7_;
			}
		    }
		}
	    } else if (8 == i_0_)
		aBool8174 = false;
	    else if (9 == i_0_)
		anInt8187
		    = class525_sub38.readUnsignedByte(1656800899) * 1276450187;
	    else if (i_0_ == 10)
		aBool8189 = false;
	    else if (i_0_ == 11)
		anInt8210
		    = class525_sub38.readUnsignedByte(465315519) * -1924244373;
	    else if (i_0_ == 12) {
		anInt8190 = class525_sub38.readUnsignedShort((byte) 10) * 652150297;
		anInt8209 = class525_sub38.readUnsignedShort((byte) 5) * 1487755423;
	    } else if (i_0_ == 13)
		anInt8172
		    = class525_sub38.readUnsignedByte(2008533242) * -2084638661;
	    else if (14 == i_0_)
		anInt8170
		    = class525_sub38.readUnsignedByte(1471898627) * -2113145239;
	    else if (i_0_ == 15)
		anInt8178 = class525_sub38.readUnsignedByte(878171058) * 844077003;
	    else if (i_0_ == 16)
		aBool8192 = true;
	    else if (17 == i_0_)
		anInt8193
		    = class525_sub38.readInt(1106391660) * -2093560607;
	    else if (18 == i_0_)
		anInt8194
		    = class525_sub38.readInt(1695216653) * 1563876321;
	    else if (i_0_ == 19)
		anInt8173
		    = class525_sub38.readInt(1884620126) * 2031198123;
	    else if (i_0_ == 20) {
		aShort8179 = (short) class525_sub38.readUnsignedShort((byte) 30);
		aByte8180 = (byte) class525_sub38.readUnsignedByte(2104815159);
	    } else if (21 == i_0_)
		anInt8181
		    = class525_sub38.readUnsignedByte(1602886411) * 2124044059;
	    else if (22 == i_0_) {
		anInt8196
		    = class525_sub38.readBigSmart(-2043778683) * -30068257;
		anInt8195 = class525_sub38.readBigSmart(-2043778683) * 58116091;
		anInt8198
		    = class525_sub38.readBigSmart(-2043778683) * -1569051187;
		anInt8201
		    = class525_sub38.readBigSmart(-2043778683) * 2070378679;
		anInt8200
		    = class525_sub38.readBigSmart(-2043778683) * -1722928467;
		anInt8165
		    = class525_sub38.readBigSmart(-2043778683) * -1111762419;
		anInt8208
		    = class525_sub38.readByte(-1150098071) * 168885199;
		anInt8188
		    = class525_sub38.readByte(-1150098071) * -1117098093;
		anInt8204
		    = class525_sub38.readBigSmart(-2043778683) * 1526720921;
		anInt8205 = class525_sub38.readBigSmart(-2043778683) * 56442031;
		anInt8206
		    = class525_sub38.readBigSmart(-2043778683) * -393357685;
		anInt8207 = class525_sub38.readBigSmart(-2043778683) * 21646137;
		anInt8185
		    = class525_sub38.readBigSmart(-2043778683) * 1123334269;
		anInt8191
		    = class525_sub38.readBigSmart(-2043778683) * 1278965853;
		anInt8197
		    = class525_sub38.readBigSmart(-2043778683) * -1553362389;
	    } else if (23 == i_0_) {
		aShortArrayArray8184 = new short[10][4];
		aShortArrayArrayArray8186 = new short[10][4][];
		for (int i_8_ = 0; i_8_ < 10; i_8_++) {
		    for (int i_9_ = 0; i_9_ < 4; i_9_++) {
			int i_10_ = class525_sub38.readUnsignedShort((byte) 100);
			if (65535 == i_10_)
			    i_10_ = -1;
			aShortArrayArray8184[i_8_][i_9_] = (short) i_10_;
			int i_11_ = class525_sub38.readUnsignedShort((byte) 82);
			aShortArrayArrayArray8186[i_8_][i_9_]
			    = new short[i_11_];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
			    int i_13_ = class525_sub38.readUnsignedShort((byte) 38);
			    if (65535 == i_13_)
				i_13_ = -1;
			    aShortArrayArrayArray8186[i_8_][i_9_][i_12_]
				= (short) i_13_;
			}
		    }
		}
	    }
	}
	if (!bool) {
	    if (anIntArray8167 == null) {
		anInt8166 = -168392388;
		anIntArray8167 = new int[4];
		anIntArray8168 = new int[4];
	    }
	    for (int i_14_ = 0; i_14_ < anIntArray8167.length; i_14_++) {
		anIntArray8167[i_14_] = 0;
		anIntArray8168[i_14_] = i_14_ * 20;
	    }
	}
    }
    
    void method10314(RSBuffer class525_sub38) {
	boolean bool = false;
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1006687765);
	    if (0 == i)
		break;
	    if (i == 1) {
		if (null == anIntArray8167) {
		    anInt8166 = -168392388;
		    anIntArray8167 = new int[4];
		    anIntArray8168 = new int[4];
		}
		for (int i_15_ = 0; i_15_ < anIntArray8167.length; i_15_++) {
		    anIntArray8167[i_15_]
			= class525_sub38.readSmart((byte) 67);
		    anIntArray8168[i_15_]
			= class525_sub38.readSmart((byte) -70);
		}
		bool = true;
	    } else if (2 == i)
		anInt8175
		    = class525_sub38.readBigSmart(-2043778683) * 1841618089;
	    else if (3 == i) {
		anInt8166 = class525_sub38.readUnsignedByte(1065832888) * -42098097;
		anIntArray8167 = new int[-379729 * anInt8166];
		anIntArray8168 = new int[anInt8166 * -379729];
	    } else if (i == 4)
		aBool8202 = false;
	    else if (i == 5)
		anInt8176
		    = class525_sub38.method16834(-1994884458) * 1325572171;
	    else if (6 == i)
		anInt8177
		    = class525_sub38.method16834(-1994884458) * -1982310963;
	    else if (i == 7) {
		aShortArrayArray8182 = new short[10][4];
		aShortArrayArrayArray8183 = new short[10][4][];
		for (int i_16_ = 0; i_16_ < 10; i_16_++) {
		    for (int i_17_ = 0; i_17_ < 4; i_17_++) {
			int i_18_ = class525_sub38.readUnsignedShort((byte) 13);
			if (i_18_ == 65535)
			    i_18_ = -1;
			aShortArrayArray8182[i_16_][i_17_] = (short) i_18_;
			int i_19_ = class525_sub38.readUnsignedShort((byte) 23);
			aShortArrayArrayArray8183[i_16_][i_17_]
			    = new short[i_19_];
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
			    int i_21_ = class525_sub38.readUnsignedShort((byte) 55);
			    if (65535 == i_21_)
				i_21_ = -1;
			    aShortArrayArrayArray8183[i_16_][i_17_][i_20_]
				= (short) i_21_;
			}
		    }
		}
	    } else if (8 == i)
		aBool8174 = false;
	    else if (9 == i)
		anInt8187 = class525_sub38.readUnsignedByte(352082161) * 1276450187;
	    else if (i == 10)
		aBool8189 = false;
	    else if (i == 11)
		anInt8210 = class525_sub38.readUnsignedByte(92374816) * -1924244373;
	    else if (i == 12) {
		anInt8190 = class525_sub38.readUnsignedShort((byte) 34) * 652150297;
		anInt8209 = class525_sub38.readUnsignedShort((byte) 22) * 1487755423;
	    } else if (i == 13)
		anInt8172
		    = class525_sub38.readUnsignedByte(1407276403) * -2084638661;
	    else if (14 == i)
		anInt8170
		    = class525_sub38.readUnsignedByte(1604836533) * -2113145239;
	    else if (i == 15)
		anInt8178 = class525_sub38.readUnsignedByte(119498875) * 844077003;
	    else if (i == 16)
		aBool8192 = true;
	    else if (17 == i)
		anInt8193
		    = class525_sub38.readInt(2002073711) * -2093560607;
	    else if (18 == i)
		anInt8194
		    = class525_sub38.readInt(1437108712) * 1563876321;
	    else if (i == 19)
		anInt8173
		    = class525_sub38.readInt(2076578544) * 2031198123;
	    else if (i == 20) {
		aShort8179 = (short) class525_sub38.readUnsignedShort((byte) 25);
		aByte8180 = (byte) class525_sub38.readUnsignedByte(2126286415);
	    } else if (21 == i)
		anInt8181
		    = class525_sub38.readUnsignedByte(1608349547) * 2124044059;
	    else if (22 == i) {
		anInt8196
		    = class525_sub38.readBigSmart(-2043778683) * -30068257;
		anInt8195 = class525_sub38.readBigSmart(-2043778683) * 58116091;
		anInt8198
		    = class525_sub38.readBigSmart(-2043778683) * -1569051187;
		anInt8201
		    = class525_sub38.readBigSmart(-2043778683) * 2070378679;
		anInt8200
		    = class525_sub38.readBigSmart(-2043778683) * -1722928467;
		anInt8165
		    = class525_sub38.readBigSmart(-2043778683) * -1111762419;
		anInt8208
		    = class525_sub38.readByte(-1150098071) * 168885199;
		anInt8188
		    = class525_sub38.readByte(-1150098071) * -1117098093;
		anInt8204
		    = class525_sub38.readBigSmart(-2043778683) * 1526720921;
		anInt8205 = class525_sub38.readBigSmart(-2043778683) * 56442031;
		anInt8206
		    = class525_sub38.readBigSmart(-2043778683) * -393357685;
		anInt8207 = class525_sub38.readBigSmart(-2043778683) * 21646137;
		anInt8185
		    = class525_sub38.readBigSmart(-2043778683) * 1123334269;
		anInt8191
		    = class525_sub38.readBigSmart(-2043778683) * 1278965853;
		anInt8197
		    = class525_sub38.readBigSmart(-2043778683) * -1553362389;
	    } else if (23 == i) {
		aShortArrayArray8184 = new short[10][4];
		aShortArrayArrayArray8186 = new short[10][4][];
		for (int i_22_ = 0; i_22_ < 10; i_22_++) {
		    for (int i_23_ = 0; i_23_ < 4; i_23_++) {
			int i_24_ = class525_sub38.readUnsignedShort((byte) 83);
			if (65535 == i_24_)
			    i_24_ = -1;
			aShortArrayArray8184[i_22_][i_23_] = (short) i_24_;
			int i_25_ = class525_sub38.readUnsignedShort((byte) 83);
			aShortArrayArrayArray8186[i_22_][i_23_]
			    = new short[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
			    int i_27_ = class525_sub38.readUnsignedShort((byte) 120);
			    if (65535 == i_27_)
				i_27_ = -1;
			    aShortArrayArrayArray8186[i_22_][i_23_][i_26_]
				= (short) i_27_;
			}
		    }
		}
	    }
	}
	if (!bool) {
	    if (anIntArray8167 == null) {
		anInt8166 = -168392388;
		anIntArray8167 = new int[4];
		anIntArray8168 = new int[4];
	    }
	    for (int i = 0; i < anIntArray8167.length; i++) {
		anIntArray8167[i] = 0;
		anIntArray8168[i] = i * 20;
	    }
	}
    }
    
    void method10315(RSBuffer class525_sub38) {
	boolean bool = false;
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1722771561);
	    if (0 == i)
		break;
	    if (i == 1) {
		if (null == anIntArray8167) {
		    anInt8166 = -168392388;
		    anIntArray8167 = new int[4];
		    anIntArray8168 = new int[4];
		}
		for (int i_28_ = 0; i_28_ < anIntArray8167.length; i_28_++) {
		    anIntArray8167[i_28_]
			= class525_sub38.readSmart((byte) 20);
		    anIntArray8168[i_28_]
			= class525_sub38.readSmart((byte) -54);
		}
		bool = true;
	    } else if (2 == i)
		anInt8175
		    = class525_sub38.readBigSmart(-2043778683) * 1841618089;
	    else if (3 == i) {
		anInt8166 = class525_sub38.readUnsignedByte(1300625855) * -42098097;
		anIntArray8167 = new int[-379729 * anInt8166];
		anIntArray8168 = new int[anInt8166 * -379729];
	    } else if (i == 4)
		aBool8202 = false;
	    else if (i == 5)
		anInt8176
		    = class525_sub38.method16834(-1994884458) * 1325572171;
	    else if (6 == i)
		anInt8177
		    = class525_sub38.method16834(-1994884458) * -1982310963;
	    else if (i == 7) {
		aShortArrayArray8182 = new short[10][4];
		aShortArrayArrayArray8183 = new short[10][4][];
		for (int i_29_ = 0; i_29_ < 10; i_29_++) {
		    for (int i_30_ = 0; i_30_ < 4; i_30_++) {
			int i_31_ = class525_sub38.readUnsignedShort((byte) 44);
			if (i_31_ == 65535)
			    i_31_ = -1;
			aShortArrayArray8182[i_29_][i_30_] = (short) i_31_;
			int i_32_ = class525_sub38.readUnsignedShort((byte) 2);
			aShortArrayArrayArray8183[i_29_][i_30_]
			    = new short[i_32_];
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
			    int i_34_ = class525_sub38.readUnsignedShort((byte) 2);
			    if (65535 == i_34_)
				i_34_ = -1;
			    aShortArrayArrayArray8183[i_29_][i_30_][i_33_]
				= (short) i_34_;
			}
		    }
		}
	    } else if (8 == i)
		aBool8174 = false;
	    else if (9 == i)
		anInt8187
		    = class525_sub38.readUnsignedByte(1253864871) * 1276450187;
	    else if (i == 10)
		aBool8189 = false;
	    else if (i == 11)
		anInt8210
		    = class525_sub38.readUnsignedByte(1685858533) * -1924244373;
	    else if (i == 12) {
		anInt8190 = class525_sub38.readUnsignedShort((byte) 96) * 652150297;
		anInt8209 = class525_sub38.readUnsignedShort((byte) 9) * 1487755423;
	    } else if (i == 13)
		anInt8172
		    = class525_sub38.readUnsignedByte(1477014133) * -2084638661;
	    else if (14 == i)
		anInt8170
		    = class525_sub38.readUnsignedByte(1600248237) * -2113145239;
	    else if (i == 15)
		anInt8178 = class525_sub38.readUnsignedByte(874623592) * 844077003;
	    else if (i == 16)
		aBool8192 = true;
	    else if (17 == i)
		anInt8193
		    = class525_sub38.readInt(1849790530) * -2093560607;
	    else if (18 == i)
		anInt8194
		    = class525_sub38.readInt(1787370013) * 1563876321;
	    else if (i == 19)
		anInt8173
		    = class525_sub38.readInt(1369503438) * 2031198123;
	    else if (i == 20) {
		aShort8179 = (short) class525_sub38.readUnsignedShort((byte) 41);
		aByte8180 = (byte) class525_sub38.readUnsignedByte(2096306592);
	    } else if (21 == i)
		anInt8181
		    = class525_sub38.readUnsignedByte(1420141208) * 2124044059;
	    else if (22 == i) {
		anInt8196
		    = class525_sub38.readBigSmart(-2043778683) * -30068257;
		anInt8195 = class525_sub38.readBigSmart(-2043778683) * 58116091;
		anInt8198
		    = class525_sub38.readBigSmart(-2043778683) * -1569051187;
		anInt8201
		    = class525_sub38.readBigSmart(-2043778683) * 2070378679;
		anInt8200
		    = class525_sub38.readBigSmart(-2043778683) * -1722928467;
		anInt8165
		    = class525_sub38.readBigSmart(-2043778683) * -1111762419;
		anInt8208
		    = class525_sub38.readByte(-1150098071) * 168885199;
		anInt8188
		    = class525_sub38.readByte(-1150098071) * -1117098093;
		anInt8204
		    = class525_sub38.readBigSmart(-2043778683) * 1526720921;
		anInt8205 = class525_sub38.readBigSmart(-2043778683) * 56442031;
		anInt8206
		    = class525_sub38.readBigSmart(-2043778683) * -393357685;
		anInt8207 = class525_sub38.readBigSmart(-2043778683) * 21646137;
		anInt8185
		    = class525_sub38.readBigSmart(-2043778683) * 1123334269;
		anInt8191
		    = class525_sub38.readBigSmart(-2043778683) * 1278965853;
		anInt8197
		    = class525_sub38.readBigSmart(-2043778683) * -1553362389;
	    } else if (23 == i) {
		aShortArrayArray8184 = new short[10][4];
		aShortArrayArrayArray8186 = new short[10][4][];
		for (int i_35_ = 0; i_35_ < 10; i_35_++) {
		    for (int i_36_ = 0; i_36_ < 4; i_36_++) {
			int i_37_ = class525_sub38.readUnsignedShort((byte) 65);
			if (65535 == i_37_)
			    i_37_ = -1;
			aShortArrayArray8184[i_35_][i_36_] = (short) i_37_;
			int i_38_ = class525_sub38.readUnsignedShort((byte) 33);
			aShortArrayArrayArray8186[i_35_][i_36_]
			    = new short[i_38_];
			for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
			    int i_40_ = class525_sub38.readUnsignedShort((byte) 1);
			    if (65535 == i_40_)
				i_40_ = -1;
			    aShortArrayArrayArray8186[i_35_][i_36_][i_39_]
				= (short) i_40_;
			}
		    }
		}
	    }
	}
	if (!bool) {
	    if (anIntArray8167 == null) {
		anInt8166 = -168392388;
		anIntArray8167 = new int[4];
		anIntArray8168 = new int[4];
	    }
	    for (int i = 0; i < anIntArray8167.length; i++) {
		anIntArray8167[i] = 0;
		anIntArray8168[i] = i * 20;
	    }
	}
    }
    
    void method10316(RSBuffer class525_sub38) {
	boolean bool = false;
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(199062542);
	    if (0 == i)
		break;
	    if (i == 1) {
		if (null == anIntArray8167) {
		    anInt8166 = -168392388;
		    anIntArray8167 = new int[4];
		    anIntArray8168 = new int[4];
		}
		for (int i_41_ = 0; i_41_ < anIntArray8167.length; i_41_++) {
		    anIntArray8167[i_41_]
			= class525_sub38.readSmart((byte) -27);
		    anIntArray8168[i_41_]
			= class525_sub38.readSmart((byte) -3);
		}
		bool = true;
	    } else if (2 == i)
		anInt8175
		    = class525_sub38.readBigSmart(-2043778683) * 1841618089;
	    else if (3 == i) {
		anInt8166 = class525_sub38.readUnsignedByte(561796749) * -42098097;
		anIntArray8167 = new int[-379729 * anInt8166];
		anIntArray8168 = new int[anInt8166 * -379729];
	    } else if (i == 4)
		aBool8202 = false;
	    else if (i == 5)
		anInt8176
		    = class525_sub38.method16834(-1994884458) * 1325572171;
	    else if (6 == i)
		anInt8177
		    = class525_sub38.method16834(-1994884458) * -1982310963;
	    else if (i == 7) {
		aShortArrayArray8182 = new short[10][4];
		aShortArrayArrayArray8183 = new short[10][4][];
		for (int i_42_ = 0; i_42_ < 10; i_42_++) {
		    for (int i_43_ = 0; i_43_ < 4; i_43_++) {
			int i_44_ = class525_sub38.readUnsignedShort((byte) 94);
			if (i_44_ == 65535)
			    i_44_ = -1;
			aShortArrayArray8182[i_42_][i_43_] = (short) i_44_;
			int i_45_ = class525_sub38.readUnsignedShort((byte) 97);
			aShortArrayArrayArray8183[i_42_][i_43_]
			    = new short[i_45_];
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
			    int i_47_ = class525_sub38.readUnsignedShort((byte) 55);
			    if (65535 == i_47_)
				i_47_ = -1;
			    aShortArrayArrayArray8183[i_42_][i_43_][i_46_]
				= (short) i_47_;
			}
		    }
		}
	    } else if (8 == i)
		aBool8174 = false;
	    else if (9 == i)
		anInt8187
		    = class525_sub38.readUnsignedByte(1820720970) * 1276450187;
	    else if (i == 10)
		aBool8189 = false;
	    else if (i == 11)
		anInt8210
		    = class525_sub38.readUnsignedByte(1510381808) * -1924244373;
	    else if (i == 12) {
		anInt8190 = class525_sub38.readUnsignedShort((byte) 116) * 652150297;
		anInt8209 = class525_sub38.readUnsignedShort((byte) 31) * 1487755423;
	    } else if (i == 13)
		anInt8172
		    = class525_sub38.readUnsignedByte(1957001589) * -2084638661;
	    else if (14 == i)
		anInt8170
		    = class525_sub38.readUnsignedByte(1963269220) * -2113145239;
	    else if (i == 15)
		anInt8178 = class525_sub38.readUnsignedByte(767415884) * 844077003;
	    else if (i == 16)
		aBool8192 = true;
	    else if (17 == i)
		anInt8193
		    = class525_sub38.readInt(1117910508) * -2093560607;
	    else if (18 == i)
		anInt8194 = class525_sub38.readInt(855704432) * 1563876321;
	    else if (i == 19)
		anInt8173
		    = class525_sub38.readInt(1042668272) * 2031198123;
	    else if (i == 20) {
		aShort8179 = (short) class525_sub38.readUnsignedShort((byte) 47);
		aByte8180 = (byte) class525_sub38.readUnsignedByte(933810314);
	    } else if (21 == i)
		anInt8181 = class525_sub38.readUnsignedByte(75733993) * 2124044059;
	    else if (22 == i) {
		anInt8196
		    = class525_sub38.readBigSmart(-2043778683) * -30068257;
		anInt8195 = class525_sub38.readBigSmart(-2043778683) * 58116091;
		anInt8198
		    = class525_sub38.readBigSmart(-2043778683) * -1569051187;
		anInt8201
		    = class525_sub38.readBigSmart(-2043778683) * 2070378679;
		anInt8200
		    = class525_sub38.readBigSmart(-2043778683) * -1722928467;
		anInt8165
		    = class525_sub38.readBigSmart(-2043778683) * -1111762419;
		anInt8208
		    = class525_sub38.readByte(-1150098071) * 168885199;
		anInt8188
		    = class525_sub38.readByte(-1150098071) * -1117098093;
		anInt8204
		    = class525_sub38.readBigSmart(-2043778683) * 1526720921;
		anInt8205 = class525_sub38.readBigSmart(-2043778683) * 56442031;
		anInt8206
		    = class525_sub38.readBigSmart(-2043778683) * -393357685;
		anInt8207 = class525_sub38.readBigSmart(-2043778683) * 21646137;
		anInt8185
		    = class525_sub38.readBigSmart(-2043778683) * 1123334269;
		anInt8191
		    = class525_sub38.readBigSmart(-2043778683) * 1278965853;
		anInt8197
		    = class525_sub38.readBigSmart(-2043778683) * -1553362389;
	    } else if (23 == i) {
		aShortArrayArray8184 = new short[10][4];
		aShortArrayArrayArray8186 = new short[10][4][];
		for (int i_48_ = 0; i_48_ < 10; i_48_++) {
		    for (int i_49_ = 0; i_49_ < 4; i_49_++) {
			int i_50_ = class525_sub38.readUnsignedShort((byte) 87);
			if (65535 == i_50_)
			    i_50_ = -1;
			aShortArrayArray8184[i_48_][i_49_] = (short) i_50_;
			int i_51_ = class525_sub38.readUnsignedShort((byte) 55);
			aShortArrayArrayArray8186[i_48_][i_49_]
			    = new short[i_51_];
			for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
			    int i_53_ = class525_sub38.readUnsignedShort((byte) 107);
			    if (65535 == i_53_)
				i_53_ = -1;
			    aShortArrayArrayArray8186[i_48_][i_49_][i_52_]
				= (short) i_53_;
			}
		    }
		}
	    }
	}
	if (!bool) {
	    if (anIntArray8167 == null) {
		anInt8166 = -168392388;
		anIntArray8167 = new int[4];
		anIntArray8168 = new int[4];
	    }
	    for (int i = 0; i < anIntArray8167.length; i++) {
		anIntArray8167[i] = 0;
		anIntArray8168[i] = i * 20;
	    }
	}
    }
    
    public static final Class525_Sub33 method10317
	(int i, Class525_Sub33 class525_sub33, int[] is, boolean bool,
	 int i_54_) {
	Class525_Sub33 class525_sub33_55_
	    = (Class525_Sub33) client.aClass10_11261.method684((long) i);
	if (class525_sub33_55_ != null)
	    Class708.method14341(class525_sub33_55_,
				 (class525_sub33.anInt10745 * 922288809
				  != (class525_sub33_55_.anInt10745
				      * 922288809)),
				 bool, -1855133252);
	client.aClass10_11261.method695(class525_sub33, (long) i);
	Class290.method5274(class525_sub33.anInt10745 * 922288809, is,
			    (byte) -50);
	Class259 class259 = Class43.method1069(i, -695254952);
	if (class259 != null)
	    Class649.method10708(class259, (byte) 0);
	if (null != client.aClass259_11263) {
	    Class649.method10708(client.aClass259_11263, (byte) 0);
	    client.aClass259_11263 = null;
	}
	if (null != class259)
	    Class76.method1560((Class162.aClass245Array1764
				[class259.anInt2588 * 1984678839 >>> 16]),
			       class259, !bool, -181562890);
	if (!bool)
	    Class455_Sub1.method15987(922288809 * class525_sub33.anInt10745,
				      is, 670355642);
	if (!bool && -1 != client.anInt11260 * -750203937)
	    Class180.method3121(-750203937 * client.anInt11260, 1, (byte) 24);
	return class525_sub33;
    }
    
    public static void method10318(int i, int i_56_, int i_57_, int i_58_,
				   int i_59_) {
	Class589.aLinkedList7802.addLast(new Class587(i, i_56_, i_57_ - i,
						      i_58_ - i_56_));
    }
}
