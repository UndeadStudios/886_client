/* Class525_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub28 extends Class525 implements Interface9
{
    public int anInt10614;
    public int anInt10615;
    static Class525_Sub28[] aClass525_Sub28Array10616 = new Class525_Sub28[0];
    public int anInt10617;
    public int anInt10618;
    
    public String toString() {
	return new StringBuilder().append("Level: ").append
		   (-770574447 * anInt10615).append
		   (" Coord: ").append
		   (anInt10614 * -794397083).append
		   (",").append
		   (anInt10617 * -1069747287).append
		   (",").append
		   (anInt10618 * 602488327).append
		   (" Coord Split: ").append
		   (-794397083 * anInt10614 >> 15).append
		   (",").append
		   (602488327 * anInt10618 >> 15).append
		   (",").append
		   (-794397083 * anInt10614 >> 9 & 0x3f).append
		   (",").append
		   (anInt10618 * 602488327 >> 9 & 0x3f).append
		   (",").append
		   (-794397083 * anInt10614 & 0x1ff).append
		   (",").append
		   (anInt10618 * 602488327 & 0x1ff).toString();
    }
    
    public Class525_Sub28(int i, int i_0_, int i_1_, int i_2_) {
	anInt10615 = 1005824369 * i;
	anInt10614 = i_0_ * -1817162899;
	anInt10617 = i_1_ * 2122014873;
	anInt10618 = 884723639 * i_2_;
    }
    
    void method16378(RSBuffer class525_sub38) {
	class525_sub38.method16735(-770574447 * anInt10615, -357177830);
	class525_sub38.method16605(-794397083 * anInt10614, -596483365);
	class525_sub38.method16605(-1069747287 * anInt10617, -573593560);
	class525_sub38.method16605(anInt10618 * 602488327, -1349670277);
    }
    
    public Class525_Sub28(RSBuffer class525_sub38) {
	method61(class525_sub38, -1243816377);
    }
    
    void method16379(RSBuffer class525_sub38, int i) {
	class525_sub38.method16735(-770574447 * anInt10615, -1001114023);
	class525_sub38.method16605(-794397083 * anInt10614, -1937702480);
	class525_sub38.method16605(-1069747287 * anInt10617, -17677089);
	class525_sub38.method16605(anInt10618 * 602488327, -1536848753);
    }
    
    public void method55(RSBuffer class525_sub38) {
	anInt10615 = class525_sub38.readUnsignedByte(1422298112) * 1005824369;
	anInt10614 = class525_sub38.readInt(840860981) * -1817162899;
	anInt10617 = class525_sub38.readInt(1472963200) * 2122014873;
	anInt10618 = class525_sub38.readInt(1418448357) * 884723639;
    }
    
    void method16380(Class525_Sub28 class525_sub28_3_, byte i) {
	anInt10615 = 1 * class525_sub28_3_.anInt10615;
	anInt10614 = 1 * class525_sub28_3_.anInt10614;
	anInt10617 = 1 * class525_sub28_3_.anInt10617;
	anInt10618 = 1 * class525_sub28_3_.anInt10618;
    }
    
    public void method60(RSBuffer class525_sub38) {
	anInt10615 = class525_sub38.readUnsignedByte(1762476585) * 1005824369;
	anInt10614 = class525_sub38.readInt(1156524748) * -1817162899;
	anInt10617 = class525_sub38.readInt(836978600) * 2122014873;
	anInt10618 = class525_sub38.readInt(1133380877) * 884723639;
    }
    
    public Class446 method16381(int i) {
	return new Class446((float) (-794397083 * anInt10614),
			    (float) (-1069747287 * anInt10617),
			    (float) (anInt10618 * 602488327));
    }
    
    void method16382(int i, boolean bool) {
	if (i == -1)
	    anInt10615 = -1005824369;
	else {
	    anInt10615 = (i >> 28 & 0x3) * 1005824369;
	    anInt10614 = -1817162899 * ((i >> 14 & 0x3fff) << 9);
	    anInt10617 = 0;
	    anInt10618 = 884723639 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10614 += -1337234176;
		anInt10618 += -1144015104;
	    }
	}
    }
    
    public String method16383() {
	return new StringBuilder().append("Level: ").append
		   (-770574447 * anInt10615).append
		   (" Coord: ").append
		   (anInt10614 * -794397083).append
		   (",").append
		   (anInt10617 * -1069747287).append
		   (",").append
		   (anInt10618 * 602488327).append
		   (" Coord Split: ").append
		   (-794397083 * anInt10614 >> 15).append
		   (",").append
		   (602488327 * anInt10618 >> 15).append
		   (",").append
		   (-794397083 * anInt10614 >> 9 & 0x3f).append
		   (",").append
		   (anInt10618 * 602488327 >> 9 & 0x3f).append
		   (",").append
		   (-794397083 * anInt10614 & 0x1ff).append
		   (",").append
		   (anInt10618 * 602488327 & 0x1ff).toString();
    }
    
    public int method49(int i) {
	return Class263.method4789((byte) 1);
    }
    
    public void method58(RSBuffer class525_sub38, int i) {
	method16379(class525_sub38, -43775003);
    }
    
    public void method61(RSBuffer class525_sub38, int i) {
	anInt10615 = class525_sub38.readUnsignedByte(1292334267) * 1005824369;
	anInt10614 = class525_sub38.readInt(2042566466) * -1817162899;
	anInt10617 = class525_sub38.readInt(1027980497) * 2122014873;
	anInt10618 = class525_sub38.readInt(2118187402) * 884723639;
    }
    
    public String method16384() {
	return new StringBuilder().append("Level: ").append
		   (-770574447 * anInt10615).append
		   (" Coord: ").append
		   (anInt10614 * -794397083).append
		   (",").append
		   (anInt10617 * -1069747287).append
		   (",").append
		   (anInt10618 * 602488327).append
		   (" Coord Split: ").append
		   (-794397083 * anInt10614 >> 15).append
		   (",").append
		   (602488327 * anInt10618 >> 15).append
		   (",").append
		   (-794397083 * anInt10614 >> 9 & 0x3f).append
		   (",").append
		   (anInt10618 * 602488327 >> 9 & 0x3f).append
		   (",").append
		   (-794397083 * anInt10614 & 0x1ff).append
		   (",").append
		   (anInt10618 * 602488327 & 0x1ff).toString();
    }
    
    public String method16385() {
	return new StringBuilder().append("Level: ").append
		   (-770574447 * anInt10615).append
		   (" Coord: ").append
		   (anInt10614 * -794397083).append
		   (",").append
		   (anInt10617 * -1069747287).append
		   (",").append
		   (anInt10618 * 602488327).append
		   (" Coord Split: ").append
		   (-794397083 * anInt10614 >> 15).append
		   (",").append
		   (602488327 * anInt10618 >> 15).append
		   (",").append
		   (-794397083 * anInt10614 >> 9 & 0x3f).append
		   (",").append
		   (anInt10618 * 602488327 >> 9 & 0x3f).append
		   (",").append
		   (-794397083 * anInt10614 & 0x1ff).append
		   (",").append
		   (anInt10618 * 602488327 & 0x1ff).toString();
    }
    
    void method16386(int i, boolean bool, int i_4_) {
	if (i == -1)
	    anInt10615 = -1005824369;
	else {
	    anInt10615 = (i >> 28 & 0x3) * 1005824369;
	    anInt10614 = -1817162899 * ((i >> 14 & 0x3fff) << 9);
	    anInt10617 = 0;
	    anInt10618 = 884723639 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10614 += -1337234176;
		anInt10618 += -1144015104;
	    }
	}
    }
    
    public static Class525_Sub28 method16387(int i, int i_5_, int i_6_,
					     int i_7_) {
	synchronized (aClass525_Sub28Array10616) {
	    if (0 == Class703.anInt8790 * 1331388799) {
		Class525_Sub28 class525_sub28
		    = new Class525_Sub28(i, i_5_, i_6_, i_7_);
		return class525_sub28;
	    }
	    aClass525_Sub28Array10616
		[(Class703.anInt8790 -= 1596087935) * 1331388799]
		.method16388(i, i_5_, i_6_, i_7_, -1745129397);
	    Class525_Sub28 class525_sub28
		= aClass525_Sub28Array10616[1331388799 * Class703.anInt8790];
	    return class525_sub28;
	}
    }
    
    void method16388(int i, int i_8_, int i_9_, int i_10_, int i_11_) {
	anInt10615 = 1005824369 * i;
	anInt10614 = -1817162899 * i_8_;
	anInt10617 = 2122014873 * i_9_;
	anInt10618 = 884723639 * i_10_;
    }
    
    public void method62(RSBuffer class525_sub38) {
	anInt10615 = class525_sub38.readUnsignedByte(743996216) * 1005824369;
	anInt10614 = class525_sub38.readInt(889252958) * -1817162899;
	anInt10617 = class525_sub38.readInt(1649437162) * 2122014873;
	anInt10618 = class525_sub38.readInt(1914548079) * 884723639;
    }
    
    public static Class525_Sub28 method16389(int i, boolean bool) {
	synchronized (aClass525_Sub28Array10616) {
	    if (1331388799 * Class703.anInt8790 == 0) {
		Class525_Sub28 class525_sub28 = new Class525_Sub28(i, bool);
		return class525_sub28;
	    }
	    aClass525_Sub28Array10616
		[(Class703.anInt8790 -= 1596087935) * 1331388799]
		.method16386(i, bool, 657538834);
	    Class525_Sub28 class525_sub28
		= aClass525_Sub28Array10616[Class703.anInt8790 * 1331388799];
	    return class525_sub28;
	}
    }
    
    public static Class525_Sub28 method16390(int i, boolean bool) {
	synchronized (aClass525_Sub28Array10616) {
	    if (1331388799 * Class703.anInt8790 == 0) {
		Class525_Sub28 class525_sub28 = new Class525_Sub28(i, bool);
		return class525_sub28;
	    }
	    aClass525_Sub28Array10616
		[(Class703.anInt8790 -= 1596087935) * 1331388799]
		.method16386(i, bool, -2101443727);
	    Class525_Sub28 class525_sub28
		= aClass525_Sub28Array10616[Class703.anInt8790 * 1331388799];
	    return class525_sub28;
	}
    }
    
    Class525_Sub28(Class525_Sub28 class525_sub28_12_) {
	anInt10615 = class525_sub28_12_.anInt10615 * 1;
	anInt10614 = 1 * class525_sub28_12_.anInt10614;
	anInt10617 = class525_sub28_12_.anInt10617 * 1;
	anInt10618 = class525_sub28_12_.anInt10618 * 1;
    }
    
    void method16391(int i, int i_13_, int i_14_, int i_15_) {
	anInt10615 = 1005824369 * i;
	anInt10614 = -1817162899 * i_13_;
	anInt10617 = 2122014873 * i_14_;
	anInt10618 = 884723639 * i_15_;
    }
    
    void method16392(Class525_Sub28 class525_sub28_16_) {
	anInt10615 = 1 * class525_sub28_16_.anInt10615;
	anInt10614 = 1 * class525_sub28_16_.anInt10614;
	anInt10617 = 1 * class525_sub28_16_.anInt10617;
	anInt10618 = 1 * class525_sub28_16_.anInt10618;
    }
    
    void method16393(int i, boolean bool) {
	if (i == -1)
	    anInt10615 = -1005824369;
	else {
	    anInt10615 = (i >> 28 & 0x3) * 1005824369;
	    anInt10614 = -1817162899 * ((i >> 14 & 0x3fff) << 9);
	    anInt10617 = 0;
	    anInt10618 = 884723639 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10614 += -1337234176;
		anInt10618 += -1144015104;
	    }
	}
    }
    
    public Class446 method16394() {
	return new Class446((float) (-794397083 * anInt10614),
			    (float) (-1069747287 * anInt10617),
			    (float) (anInt10618 * 602488327));
    }
    
    void method16395(int i, boolean bool) {
	if (i == -1)
	    anInt10615 = -1005824369;
	else {
	    anInt10615 = (i >> 28 & 0x3) * 1005824369;
	    anInt10614 = -1817162899 * ((i >> 14 & 0x3fff) << 9);
	    anInt10617 = 0;
	    anInt10618 = 884723639 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10614 += -1337234176;
		anInt10618 += -1144015104;
	    }
	}
    }
    
    public static Class525_Sub28 method16396(Class525_Sub28 class525_sub28) {
	synchronized (aClass525_Sub28Array10616) {
	    if (0 == 1331388799 * Class703.anInt8790) {
		Class525_Sub28 class525_sub28_17_
		    = new Class525_Sub28(class525_sub28);
		return class525_sub28_17_;
	    }
	    aClass525_Sub28Array10616
		[(Class703.anInt8790 -= 1596087935) * 1331388799]
		.method16380(class525_sub28, (byte) 3);
	    Class525_Sub28 class525_sub28_18_
		= aClass525_Sub28Array10616[Class703.anInt8790 * 1331388799];
	    return class525_sub28_18_;
	}
    }
    
    Class525_Sub28(int i, boolean bool) {
	if (-1 == i)
	    anInt10615 = -1005824369;
	else {
	    anInt10615 = 1005824369 * (i >> 28 & 0x3);
	    anInt10614 = -1817162899 * ((i >> 14 & 0x3fff) << 9);
	    anInt10617 = 0;
	    anInt10618 = 884723639 * ((i & 0x3fff) << 9);
	    if (bool) {
		anInt10614 += -1337234176;
		anInt10618 += -1144015104;
	    }
	}
    }
    
    public Class525_Sub28() {
	anInt10615 = -1005824369;
    }
    
    static int method16397() {
	return 13;
    }
    
    public int method12() {
	return Class263.method4789((byte) 1);
    }
    
    public int method57() {
	return Class263.method4789((byte) 1);
    }
    
    void method16398(RSBuffer class525_sub38) {
	class525_sub38.method16735(-770574447 * anInt10615, -522928490);
	class525_sub38.method16605(-794397083 * anInt10614, -1961259247);
	class525_sub38.method16605(-1069747287 * anInt10617, -182155505);
	class525_sub38.method16605(anInt10618 * 602488327, -1923676754);
    }
    
    public void method59(RSBuffer class525_sub38) {
	anInt10615 = class525_sub38.readUnsignedByte(943037570) * 1005824369;
	anInt10614 = class525_sub38.readInt(1105346487) * -1817162899;
	anInt10617 = class525_sub38.readInt(997724487) * 2122014873;
	anInt10618 = class525_sub38.readInt(1456015446) * 884723639;
    }
    
    public void method56(RSBuffer class525_sub38) {
	method16379(class525_sub38, -43775003);
    }
    
    public static Class525_Sub28 method16399(Class525_Sub28 class525_sub28) {
	synchronized (aClass525_Sub28Array10616) {
	    if (0 == 1331388799 * Class703.anInt8790) {
		Class525_Sub28 class525_sub28_19_
		    = new Class525_Sub28(class525_sub28);
		return class525_sub28_19_;
	    }
	    aClass525_Sub28Array10616
		[(Class703.anInt8790 -= 1596087935) * 1331388799]
		.method16380(class525_sub28, (byte) -100);
	    Class525_Sub28 class525_sub28_20_
		= aClass525_Sub28Array10616[Class703.anInt8790 * 1331388799];
	    return class525_sub28_20_;
	}
    }
    
    public static Class525_Sub28 method16400(int i, boolean bool) {
	synchronized (aClass525_Sub28Array10616) {
	    if (1331388799 * Class703.anInt8790 == 0) {
		Class525_Sub28 class525_sub28 = new Class525_Sub28(i, bool);
		return class525_sub28;
	    }
	    aClass525_Sub28Array10616
		[(Class703.anInt8790 -= 1596087935) * 1331388799]
		.method16386(i, bool, -904458454);
	    Class525_Sub28 class525_sub28
		= aClass525_Sub28Array10616[Class703.anInt8790 * 1331388799];
	    return class525_sub28;
	}
    }
    
    public static Class603_Sub1 method16401(int i, int i_21_) {
	if (!Class617.aBool8059 || i < -1122711783 * Class478.anInt5201
	    || i > Class617.anInt8063 * -192862351)
	    return null;
	return (Class617.aClass603_Sub1Array8056
		[i - -1122711783 * Class478.anInt5201]);
    }
}
