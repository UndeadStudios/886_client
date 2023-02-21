/* Class581 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class581
{
    public static Class656_Sub1_Sub3_Sub1_Sub1 aClass656_Sub1_Sub3_Sub1_Sub1_7705;
    
    public static Interface66 method9617(RSBuffer class525_sub38) {
	Class610 class610
	    = Class172.method2760(class525_sub38.readUnsignedByte(146951571),
				  1325405822);
	if (Class610.aClass610_8011 == class610)
	    return Class685.method11249(class525_sub38, -1983471774);
	if (Class610.aClass610_8009 == class610)
	    return Class341.method5992(class525_sub38, -2101209818);
	if (Class610.aClass610_8012 == class610)
	    return Class571.method9531(class525_sub38, 1727686459);
	return null;
    }
    
    Class581() throws Throwable {
	throw new Error();
    }
    
    public static Interface66 method9618(RSBuffer class525_sub38) {
	Class610 class610
	    = Class172.method2760(class525_sub38.readUnsignedByte(232081691),
				  -1681754355);
	if (Class610.aClass610_8011 == class610)
	    return Class685.method11249(class525_sub38, 1867215740);
	if (Class610.aClass610_8009 == class610)
	    return Class341.method5992(class525_sub38, -1041402754);
	if (Class610.aClass610_8012 == class610)
	    return Class571.method9531(class525_sub38, 493830964);
	return null;
    }
    
    static final void method9619(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_0_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_1_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	int i_2_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class4.method540(i_0_, i_1_, i_2_, false, 1603427021);
    }
    
    static final void method9620(int i, Class259 class259, Class683 class683,
				 int i_3_) {
	if (i < 1 || i > 10)
	    throw new RuntimeException();
	Class584.method9644(i, 1984678839 * class259.anInt2588,
			    class259.anInt2576 * 1534974651, "", 243628632);
    }
    
    static boolean method9621(byte i) {
	return Class44.aBool346;
    }
    
    static final void method9622(Class683 class683, int i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]) != 0 ? 1 : 0,
	     (byte) -32);
	Class650.method10715(-1758466106);
	client.aClass507_11137.method8375((byte) 63);
    }
}
