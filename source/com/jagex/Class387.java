/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class387 implements Interface45
{
    public int anInt4023;
    public Class395 aClass395_4024;
    public int anInt4025;
    public int anInt4026;
    public Class396 aClass396_4027;
    public int anInt4028;
    public int anInt4029;
    public int anInt4030;
    public int anInt4031;
    public String aString4032;
    public int anInt4033;
    public int anInt4034;
    public int anInt4035;
    static Class190 aClass190_4036;
    
    public Class392 method336() {
	return Class392.aClass392_4079;
    }
    
    Class387(String string, Class395 class395, Class396 class396, int i,
	     int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
	     int i_6_, int i_7_, int i_8_) {
	aString4032 = string;
	aClass395_4024 = class395;
	aClass396_4027 = class396;
	anInt4026 = 1224845449 * i;
	anInt4023 = i_0_ * -1344701841;
	anInt4025 = i_1_ * 1244919029;
	anInt4028 = i_2_ * 696581455;
	anInt4030 = i_3_ * 321107609;
	anInt4031 = i_4_ * -655366259;
	anInt4029 = -520201209 * i_5_;
	anInt4033 = i_6_ * -1235763355;
	anInt4034 = i_7_ * -1822173917;
	anInt4035 = i_8_ * -1089063043;
    }
    
    public Class392 method335() {
	return Class392.aClass392_4079;
    }
    
    public static Class387 method6448(RSBuffer class525_sub38) {
	String string = class525_sub38.readString((byte) 10);
	Class395 class395 = (Class96.method1813(2027026904)
			     [class525_sub38.readUnsignedByte(1038145105)]);
	Class396 class396 = (Class643.method10595((byte) 69)
			     [class525_sub38.readUnsignedByte(632672896)]);
	int i = class525_sub38.method16625((byte) -52);
	int i_9_ = class525_sub38.method16625((byte) 77);
	int i_10_ = class525_sub38.readUnsignedByte(73151910);
	int i_11_ = class525_sub38.readUnsignedByte(1465683709);
	int i_12_ = class525_sub38.readUnsignedByte(823854476);
	int i_13_ = class525_sub38.readUnsignedShort((byte) 97);
	int i_14_ = class525_sub38.readUnsignedShort((byte) 53);
	int i_15_ = class525_sub38.readBigSmart(-2043778683);
	int i_16_ = class525_sub38.readInt(1749314023);
	int i_17_ = class525_sub38.readInt(1278919218);
	return new Class387(string, class395, class396, i, i_9_, i_10_, i_11_,
			    i_12_, i_13_, i_14_, i_15_, i_16_, i_17_);
    }
    
    public static Class387 method6449(RSBuffer class525_sub38) {
	String string = class525_sub38.readString((byte) 48);
	Class395 class395 = (Class96.method1813(-1285550201)
			     [class525_sub38.readUnsignedByte(107029188)]);
	Class396 class396 = (Class643.method10595((byte) 125)
			     [class525_sub38.readUnsignedByte(1659349572)]);
	int i = class525_sub38.method16625((byte) 93);
	int i_18_ = class525_sub38.method16625((byte) -61);
	int i_19_ = class525_sub38.readUnsignedByte(1607901659);
	int i_20_ = class525_sub38.readUnsignedByte(1990202976);
	int i_21_ = class525_sub38.readUnsignedByte(1595625757);
	int i_22_ = class525_sub38.readUnsignedShort((byte) 42);
	int i_23_ = class525_sub38.readUnsignedShort((byte) 43);
	int i_24_ = class525_sub38.readBigSmart(-2043778683);
	int i_25_ = class525_sub38.readInt(1458712105);
	int i_26_ = class525_sub38.readInt(1151282512);
	return new Class387(string, class395, class396, i, i_18_, i_19_, i_20_,
			    i_21_, i_22_, i_23_, i_24_, i_25_, i_26_);
    }
    
    public static Class387 method6450(RSBuffer class525_sub38) {
	String string = class525_sub38.readString((byte) 36);
	Class395 class395 = (Class96.method1813(1335735069)
			     [class525_sub38.readUnsignedByte(131432102)]);
	Class396 class396 = (Class643.method10595((byte) 33)
			     [class525_sub38.readUnsignedByte(1087634136)]);
	int i = class525_sub38.method16625((byte) 77);
	int i_27_ = class525_sub38.method16625((byte) 54);
	int i_28_ = class525_sub38.readUnsignedByte(122753493);
	int i_29_ = class525_sub38.readUnsignedByte(1972921237);
	int i_30_ = class525_sub38.readUnsignedByte(693842118);
	int i_31_ = class525_sub38.readUnsignedShort((byte) 44);
	int i_32_ = class525_sub38.readUnsignedShort((byte) 107);
	int i_33_ = class525_sub38.readBigSmart(-2043778683);
	int i_34_ = class525_sub38.readInt(1601803315);
	int i_35_ = class525_sub38.readInt(1890109227);
	return new Class387(string, class395, class396, i, i_27_, i_28_, i_29_,
			    i_30_, i_31_, i_32_, i_33_, i_34_, i_35_);
    }
    
    public Class392 method334(int i) {
	return Class392.aClass392_4079;
    }
    
    static final void method6451(Class683 class683, int i) {
	int i_36_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_36_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_36_ >> 16];
	Class511.method8526(class259, class245, class683, (short) 12640);
    }
    
    static final void method6452(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aBool11358 ? 1 : 0;
    }
}
