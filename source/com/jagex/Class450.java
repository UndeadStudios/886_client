/* Class450 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class450 implements Interface76
{
    public static Class450 aClass450_4922 = new Class450(0);
    public static Class450 aClass450_4923 = new Class450(1);
    public static Class450 aClass450_4924 = new Class450(2);
    int anInt4925;
    public static Class400 aClass400_4926;
    
    public int method75() {
	return 1157700987 * anInt4925;
    }
    
    public int method80() {
	return 1157700987 * anInt4925;
    }
    
    public int method57() {
	return 1157700987 * anInt4925;
    }
    
    Class450(int i) {
	anInt4925 = 1568160179 * i;
    }
    
    static final void method7327(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class37.method1002(class259, class245, class683, (byte) 17);
    }
    
    static final void method7328(Class683 class683, int i) {
	boolean bool = ((class683.anIntArray8661
			 [(class683.anInt8662 -= 1552651121) * 501271953])
			== 1);
	if (bool)
	    Class202.method3853(5, (byte) -75);
	else
	    Class202.method3853(1, (byte) 20);
    }
    
    static final void method7329(Class683 class683, int i) {
	Class184.method3611(class683, class683.aClass656_Sub1_Sub3_Sub1_8654,
			    -342124937);
    }
    
    public static boolean method7330(String string, int i) {
	if (string == null)
	    return false;
	for (int i_1_ = 0; i_1_ < -651611127 * client.anInt11366; i_1_++) {
	    Class31 class31 = client.aClass31Array11368[i_1_];
	    if (string.equalsIgnoreCase(class31.aString300))
		return true;
	    if (string.equalsIgnoreCase(class31.aString301))
		return true;
	}
	return false;
    }
    
    static final void method7331(Class259 class259, Class245 class245,
				 Class683 class683, short i) {
	class683.anInt8662 -= 362986067;
	int i_2_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	short i_3_ = (short) (class683.anIntArray8661
			      [1 + 501271953 * class683.anInt8662]);
	short i_4_ = (short) (class683.anIntArray8661
			      [2 + 501271953 * class683.anInt8662]);
	if (i_2_ >= 0 && i_2_ < 5) {
	    class259.method4701(i_2_, i_3_, i_4_, -673760297);
	    Class649.method10708(class259, (byte) 0);
	    if (1534974651 * class259.anInt2576 == -1 && !class245.aBool2428)
		Class24.method831(class259.anInt2588 * 1984678839, i_2_,
				  -319091728);
	}
    }
    
    public static Class401 method7332(RSBuffer class525_sub38, byte i) {
	Class401 class401 = new Class401();
	class401.anInt4134
	    = class525_sub38.readUnsignedShort((byte) 9) * -1532044077;
	class401.aClass525_Sub16_Sub11_4133
	    = Class215.aClass58_2283
		  .method1220(-1275733157 * class401.anInt4134, 797864);
	return class401;
    }
}
