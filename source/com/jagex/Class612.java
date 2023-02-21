/* Class612 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class612
{
    public static final int anInt8017 = 7;
    public static final int anInt8018 = 9;
    public static final int anInt8019 = 512;
    public static final int anInt8020 = 8;
    public static final int anInt8021 = 1024;
    public static final int anInt8022 = 256;
    public static final int anInt8023 = 128;
    public static final int anInt8024 = 2;
    public static final int anInt8025 = 511;
    public static Class40_Sub19 aClass40_Sub19_8026;
    
    static {
	Math.sqrt(131072.0);
    }
    
    Class612() throws Throwable {
	throw new Error();
    }
    
    public static Class525_Sub28 method10050(Class525_Sub28 class525_sub28,
					     byte i) {
	synchronized (Class525_Sub28.aClass525_Sub28Array10616) {
	    if (0 == 1331388799 * Class703.anInt8790) {
		Class525_Sub28 class525_sub28_0_
		    = new Class525_Sub28(class525_sub28);
		return class525_sub28_0_;
	    }
	    Class525_Sub28.aClass525_Sub28Array10616
		[(Class703.anInt8790 -= 1596087935) * 1331388799]
		.method16380(class525_sub28, (byte) -62);
	    Class525_Sub28 class525_sub28_1_
		= (Class525_Sub28.aClass525_Sub28Array10616
		   [Class703.anInt8790 * 1331388799]);
	    return class525_sub28_1_;
	}
    }
    
    public static boolean method10051(int i) {
	return Class328.aBool3576;
    }
    
    static final void method10052(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_2_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_3_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	Class584.method9644(10, i_2_, i_3_, "", -222806956);
    }
    
    static final void method10053(Class683 class683, int i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_4_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_4_ >> 16];
	Class683.method11228(class259, class245, class683, -54455738);
    }
}
