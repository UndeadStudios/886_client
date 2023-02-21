/* Class525_Sub16_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub16_Sub4 extends Class525_Sub16
{
    public Class517[] aClass517Array11746;
    public int anInt11747;
    public int anInt11748;
    public int[] anIntArray11749;
    public Object[] anObjectArray11750;
    public Class578 aClass578_11751;
    public int anInt11752;
    public int anInt11753;
    public int anInt11754;
    public String aString11755;
    public int anInt11756;
    public Class10[] aClass10Array11757;
    Interface20 anInterface20_11758;
    
    Class517 method18249(RSBuffer class525_sub38, Class517[] class517s) {
	int i = class525_sub38.readUnsignedShort((byte) 1);
	if (i < 0 || i >= class517s.length)
	    throw new RuntimeException("");
	Class517 class517 = class517s[i];
	return class517;
    }
    
    public Class525_Sub16_Sub4(RSBuffer class525_sub38,
							   Interface20 interface20) {
	anInterface20_11758 = interface20;
	int i = method18250(class525_sub38, -574057637);
	int i_0_ = 0;
	Class517[] class517s = Class163.method2658((byte) 30);
	while (-1133521593 * class525_sub38.pos < i) {
	    Class517 class517
		= method18254(class525_sub38, class517s, 1027059178);
	    method18251(class525_sub38, i_0_, class517, (byte) 0);
	    i_0_++;
	}
    }
    
    int method18250(RSBuffer class525_sub38, int i) {
	class525_sub38.pos
	    = (class525_sub38.buffer.length - 2) * 339428471;
	int i_1_ = class525_sub38.readUnsignedShort((byte) 106);
	int i_2_ = class525_sub38.buffer.length - 2 - i_1_ - 16;
	class525_sub38.pos = i_2_ * 339428471;
	int i_3_ = class525_sub38.readInt(2098023380);
	anInt11747 = class525_sub38.readUnsignedShort((byte) 6) * -608075163;
	anInt11752 = class525_sub38.readUnsignedShort((byte) 76) * 1424615325;
	anInt11753 = class525_sub38.readUnsignedShort((byte) 72) * -1198281519;
	anInt11754 = class525_sub38.readUnsignedShort((byte) 43) * 1758365511;
	anInt11748 = class525_sub38.readUnsignedShort((byte) 120) * 1764543363;
	anInt11756 = class525_sub38.readUnsignedShort((byte) 62) * 1199200771;
	int i_4_ = class525_sub38.readUnsignedByte(567599434);
	if (i_4_ > 0) {
	    aClass10Array11757 = new Class10[i_4_];
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		int i_6_ = class525_sub38.readUnsignedShort((byte) 29);
		Class10 class10
		    = new Class10(Class212.method3935(i_6_, -2056250364));
		aClass10Array11757[i_5_] = class10;
		while (i_6_-- > 0) {
		    int i_7_ = class525_sub38.readInt(1970263761);
		    int i_8_ = class525_sub38.readInt(840138138);
		    class10.method695(new Class525_Sub42(i_8_), (long) i_7_);
		}
	    }
	}
	class525_sub38.pos = 0;
	aString11755 = class525_sub38.method16635(338521696);
	aClass517Array11746 = new Class517[i_3_];
	return i_2_;
    }
    
    void method18251(RSBuffer class525_sub38, int i, Class517 class517,
					 byte i_9_) {
	int i_10_ = aClass517Array11746.length;
	if (Class517.aClass517_7036 == class517
	    || Class517.aClass517_5757 == class517) {
	    Class453 class453
		= ((Class453)
		   Class539.method8888(Class453.method7348(1523325574),
				       class525_sub38.readUnsignedByte(1915372749),
				       -98269935));
	    int i_11_ = class525_sub38.readUnsignedShort((byte) 37);
	    if (anObjectArray11750 == null)
		anObjectArray11750 = new Object[i_10_];
	    anObjectArray11750[i]
		= anInterface20_11758.method119(class453, i_11_, -957891113);
	    if (anIntArray11749 == null)
		anIntArray11749 = new int[i_10_];
	    anIntArray11749[i] = class525_sub38.readUnsignedByte(700707712);
	} else if (class517 == Class517.aClass517_6071) {
	    Class480 class480
		= ((Class480)
		   Class539.method8888(Class480.method7811(-566480883),
				       class525_sub38.readUnsignedByte(67319920),
				       -847465135));
	    switch (-873574733 * class480.anInt5210) {
	    case 1:
		if (anObjectArray11750 == null)
		    anObjectArray11750 = new Object[i_10_];
		class517 = Class517.aClass517_6044;
		anObjectArray11750[i]
		    = Long.valueOf(class525_sub38.method16603(-354948965));
		break;
	    case 3:
		if (anObjectArray11750 == null)
		    anObjectArray11750 = new Object[i_10_];
		anObjectArray11750[i]
		    = class525_sub38.readString((byte) 44).intern();
		break;
	    default:
		throw new RuntimeException();
	    case 4:
		if (anIntArray11749 == null)
		    anIntArray11749 = new int[i_10_];
		class517 = Class517.aClass517_6775;
		anIntArray11749[i] = class525_sub38.readInt(1645602988);
	    }
	} else if (Class517.aClass517_5758 == class517
		   || class517 == Class517.aClass517_6106) {
	    int i_12_ = class525_sub38.readUnsignedShort((byte) 126);
	    if (anObjectArray11750 == null)
		anObjectArray11750 = new Object[i_10_];
	    anObjectArray11750[i]
		= anInterface20_11758.method124(i_12_, 1825620976);
	    if (null == anIntArray11749)
		anIntArray11749 = new int[i_10_];
	    anIntArray11749[i] = class525_sub38.readUnsignedByte(1305723373);
	} else {
	    if (null == anIntArray11749)
		anIntArray11749 = new int[i_10_];
	    if (class517 != null && class517.aBool7058)
		anIntArray11749[i] = class525_sub38.readInt(2109922107);
	    else
		anIntArray11749[i] = class525_sub38.readUnsignedByte(171561139);
	}
	aClass517Array11746[i] = class517;
    }
    
    int method18252(RSBuffer class525_sub38) {
	class525_sub38.pos
	    = (class525_sub38.buffer.length - 2) * 339428471;
	int i = class525_sub38.readUnsignedShort((byte) 33);
	int i_13_ = class525_sub38.buffer.length - 2 - i - 16;
	class525_sub38.pos = i_13_ * 339428471;
	int i_14_ = class525_sub38.readInt(1661972482);
	anInt11747 = class525_sub38.readUnsignedShort((byte) 111) * -608075163;
	anInt11752 = class525_sub38.readUnsignedShort((byte) 80) * 1424615325;
	anInt11753 = class525_sub38.readUnsignedShort((byte) 57) * -1198281519;
	anInt11754 = class525_sub38.readUnsignedShort((byte) 40) * 1758365511;
	anInt11748 = class525_sub38.readUnsignedShort((byte) 35) * 1764543363;
	anInt11756 = class525_sub38.readUnsignedShort((byte) 64) * 1199200771;
	int i_15_ = class525_sub38.readUnsignedByte(1662632000);
	if (i_15_ > 0) {
	    aClass10Array11757 = new Class10[i_15_];
	    for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
		int i_17_ = class525_sub38.readUnsignedShort((byte) 69);
		Class10 class10
		    = new Class10(Class212.method3935(i_17_, -2056250364));
		aClass10Array11757[i_16_] = class10;
		while (i_17_-- > 0) {
		    int i_18_ = class525_sub38.readInt(1039850627);
		    int i_19_ = class525_sub38.readInt(1323417749);
		    class10.method695(new Class525_Sub42(i_19_), (long) i_18_);
		}
	    }
	}
	class525_sub38.pos = 0;
	aString11755 = class525_sub38.method16635(-220436858);
	aClass517Array11746 = new Class517[i_14_];
	return i_13_;
    }
    
    Class517 method18253(RSBuffer class525_sub38, Class517[] class517s) {
	int i = class525_sub38.readUnsignedShort((byte) 25);
	if (i < 0 || i >= class517s.length)
	    throw new RuntimeException("");
	Class517 class517 = class517s[i];
	return class517;
    }
    
    Class517 method18254(RSBuffer class525_sub38, Class517[] class517s,
						 int i) {
	int i_20_ = class525_sub38.readUnsignedShort((byte) 24);
	if (i_20_ < 0 || i_20_ >= class517s.length)
	    throw new RuntimeException("");
	Class517 class517 = class517s[i_20_];
	return class517;
    }
    
    void method18255(RSBuffer class525_sub38, int i, Class517 class517) {
	int i_21_ = aClass517Array11746.length;
	if (Class517.aClass517_7036 == class517
	    || Class517.aClass517_5757 == class517) {
	    Class453 class453
		= ((Class453)
		   Class539.method8888(Class453.method7348(918835775),
				       class525_sub38.readUnsignedByte(72848983),
				       -984374927));
	    int i_22_ = class525_sub38.readUnsignedShort((byte) 117);
	    if (anObjectArray11750 == null)
		anObjectArray11750 = new Object[i_21_];
	    anObjectArray11750[i]
		= anInterface20_11758.method119(class453, i_22_, -1422670312);
	    if (anIntArray11749 == null)
		anIntArray11749 = new int[i_21_];
	    anIntArray11749[i] = class525_sub38.readUnsignedByte(209059779);
	} else if (class517 == Class517.aClass517_6071) {
	    Class480 class480
		= ((Class480)
		   Class539.method8888(Class480.method7811(-239926292),
				       class525_sub38.readUnsignedByte(279937496),
				       1613950157));
	    switch (-873574733 * class480.anInt5210) {
	    case 1:
		if (anObjectArray11750 == null)
		    anObjectArray11750 = new Object[i_21_];
		class517 = Class517.aClass517_6044;
		anObjectArray11750[i]
		    = Long.valueOf(class525_sub38.method16603(-2112635635));
		break;
	    case 3:
		if (anObjectArray11750 == null)
		    anObjectArray11750 = new Object[i_21_];
		anObjectArray11750[i]
		    = class525_sub38.readString((byte) -28).intern();
		break;
	    default:
		throw new RuntimeException();
	    case 4:
		if (anIntArray11749 == null)
		    anIntArray11749 = new int[i_21_];
		class517 = Class517.aClass517_6775;
		anIntArray11749[i] = class525_sub38.readInt(902580263);
	    }
	} else if (Class517.aClass517_5758 == class517
		   || class517 == Class517.aClass517_6106) {
	    int i_23_ = class525_sub38.readUnsignedShort((byte) 123);
	    if (anObjectArray11750 == null)
		anObjectArray11750 = new Object[i_21_];
	    anObjectArray11750[i]
		= anInterface20_11758.method124(i_23_, 508175164);
	    if (null == anIntArray11749)
		anIntArray11749 = new int[i_21_];
	    anIntArray11749[i] = class525_sub38.readUnsignedByte(505805884);
	} else {
	    if (null == anIntArray11749)
		anIntArray11749 = new int[i_21_];
	    if (class517 != null && class517.aBool7058)
		anIntArray11749[i] = class525_sub38.readInt(1487847276);
	    else
		anIntArray11749[i] = class525_sub38.readUnsignedByte(512229953);
	}
	aClass517Array11746[i] = class517;
    }
    
    void method18256(RSBuffer class525_sub38, int i, Class517 class517) {
	int i_24_ = aClass517Array11746.length;
	if (Class517.aClass517_7036 == class517
	    || Class517.aClass517_5757 == class517) {
	    Class453 class453
		= ((Class453)
		   Class539.method8888(Class453.method7348(1629121108),
				       class525_sub38.readUnsignedByte(698362481),
				       -1458698415));
	    int i_25_ = class525_sub38.readUnsignedShort((byte) 81);
	    if (anObjectArray11750 == null)
		anObjectArray11750 = new Object[i_24_];
	    anObjectArray11750[i]
		= anInterface20_11758.method119(class453, i_25_, -1669452741);
	    if (anIntArray11749 == null)
		anIntArray11749 = new int[i_24_];
	    anIntArray11749[i] = class525_sub38.readUnsignedByte(521528444);
	} else if (class517 == Class517.aClass517_6071) {
	    Class480 class480
		= ((Class480)
		   Class539.method8888(Class480.method7811(582593984),
				       class525_sub38.readUnsignedByte(544489837),
				       969980357));
	    switch (-873574733 * class480.anInt5210) {
	    case 1:
		if (anObjectArray11750 == null)
		    anObjectArray11750 = new Object[i_24_];
		class517 = Class517.aClass517_6044;
		anObjectArray11750[i]
		    = Long.valueOf(class525_sub38.method16603(-251881756));
		break;
	    case 3:
		if (anObjectArray11750 == null)
		    anObjectArray11750 = new Object[i_24_];
		anObjectArray11750[i]
		    = class525_sub38.readString((byte) 26).intern();
		break;
	    default:
		throw new RuntimeException();
	    case 4:
		if (anIntArray11749 == null)
		    anIntArray11749 = new int[i_24_];
		class517 = Class517.aClass517_6775;
		anIntArray11749[i] = class525_sub38.readInt(1896231107);
	    }
	} else if (Class517.aClass517_5758 == class517
		   || class517 == Class517.aClass517_6106) {
	    int i_26_ = class525_sub38.readUnsignedShort((byte) 14);
	    if (anObjectArray11750 == null)
		anObjectArray11750 = new Object[i_24_];
	    anObjectArray11750[i]
		= anInterface20_11758.method124(i_26_, 979304563);
	    if (null == anIntArray11749)
		anIntArray11749 = new int[i_24_];
	    anIntArray11749[i] = class525_sub38.readUnsignedByte(2086418175);
	} else {
	    if (null == anIntArray11749)
		anIntArray11749 = new int[i_24_];
	    if (class517 != null && class517.aBool7058)
		anIntArray11749[i] = class525_sub38.readInt(1752342249);
	    else
		anIntArray11749[i] = class525_sub38.readUnsignedByte(1456698008);
	}
	aClass517Array11746[i] = class517;
    }
}
