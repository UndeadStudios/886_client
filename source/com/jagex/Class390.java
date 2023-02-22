/* Class390 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Map;

public class Class390 implements Interface45
{
    public int anInt4061;
    public Class396 aClass396_4062;
    public int anInt4063;
    public int anInt4064;
    public int anInt4065;
    public int anInt4066;
    public int anInt4067;
    public Class395 aClass395_4068;
    public int anInt4069;
    
    Class390(Class395 class395, Class396 class396, int i, int i_0_, int i_1_,
	     int i_2_, int i_3_, int i_4_, int i_5_) {
	aClass395_4068 = class395;
	aClass396_4062 = class396;
	anInt4063 = 1137952387 * i;
	anInt4064 = i_0_ * -1355300291;
	anInt4065 = -60529655 * i_1_;
	anInt4066 = 15579199 * i_2_;
	anInt4067 = i_3_ * 1790991103;
	anInt4061 = i_4_ * 198370845;
	anInt4069 = i_5_ * 764655609;
    }
    
    public Class392 method334(int i) {
	return null;
    }
    
    public Class392 method335() {
	return null;
    }
    
    static Class390 method6470(RSBuffer class525_sub38) {
	Class395 class395 = (Class96.method1813(-945932183)
			     [class525_sub38.readUnsignedByte(1479122321)]);
	Class396 class396 = (Class643.method10595((byte) 60)
			     [class525_sub38.readUnsignedByte(1051222769)]);
	int i = class525_sub38.readSmart((byte) 107);
	int i_6_ = class525_sub38.readSmart((byte) -77);
	int i_7_ = class525_sub38.readUnsignedShort((byte) 34);
	int i_8_ = class525_sub38.readUnsignedShort((byte) 44);
	int i_9_ = class525_sub38.readSmart((byte) -26);
	int i_10_ = class525_sub38.readBigSmart(-2043778683);
	int i_11_ = class525_sub38.readInt(1079449142);
	return new Class390(class395, class396, i, i_6_, i_7_, i_8_, i_9_,
			    i_10_, i_11_);
    }
    
    public Class392 method336() {
	return null;
    }
    
    static void method6471(Interface68 interface68, int i) {
	while (Class577.aLinkedList7649.size() > 10)
	    Class577.aLinkedList7649.remove();
	Class577.aLinkedList7649.add(interface68);
    }
    
    static void method6472(Class683 class683, byte i) {
	class683.anInt8662 -= 1915637188;
	int i_12_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_13_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	int i_14_
	    = class683.anIntArray8661[2 + class683.anInt8662 * 501271953];
	int i_15_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 3];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class220.method4204(i_12_, i_13_, i_14_, i_15_ != 0, 1960711672);
    }
    
    static final void method6473(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10692
		  .method17028((byte) 125);
    }
    
    public static Map method6474(Class106_Sub1[] class106_sub1s, int i) {
	if (class106_sub1s == null || 0 == class106_sub1s.length)
	    return null;
	HashMap hashmap = new HashMap();
	Class106_Sub1[] class106_sub1s_16_ = class106_sub1s;
	for (int i_17_ = 0; i_17_ < class106_sub1s_16_.length; i_17_++) {
	    Class106_Sub1 class106_sub1 = class106_sub1s_16_[i_17_];
	    hashmap.put(class106_sub1.aClass453_8986, class106_sub1);
	}
	return hashmap;
    }
}
