/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class165
{
    public int anInt1770;
    public static Class165 aClass165_1771;
    public static Class165 aClass165_1772;
    public static Class165 aClass165_1773;
    public static Class165 aClass165_1774;
    public static Class165 aClass165_1775 = new Class165(0, 3);
    public static Class165 aClass165_1776;
    static Class165 aClass165_1777;
    public static Class165 aClass165_1778;
    public static Class165 aClass165_1779;
    public int anInt1780;
    static Class165 aClass165_1781;
    
    Class165(int i, int i_0_) {
	anInt1780 = i * -776892877;
	anInt1770 = 2096284049 * i_0_;
    }
    
    static {
	aClass165_1771 = new Class165(9, 4);
	aClass165_1772 = new Class165(5, 1);
	aClass165_1773 = new Class165(6, 1);
	aClass165_1776 = new Class165(7, 2);
	aClass165_1774 = new Class165(8, 1);
	aClass165_1781 = new Class165(1, 3);
	aClass165_1777 = new Class165(3, 4);
	aClass165_1778 = new Class165(2, 1);
	aClass165_1779 = new Class165(4, 1);
    }
    
    static final void method2665(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_2_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	Class584.method9644(6, i_1_, i_2_, "", 1518515300);
    }
    
    static final void method2666(Class683 class683, byte i) {
	int i_3_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_3_, -695254952);
	Class181.method3123(class259, class683, -464041627);
    }
    
    public static boolean method2667(int i, int[] is, int i_4_) {
	if (Class593.aBoolArray7832[i])
	    return true;
	Class162.aClass245Array1764[i]
	    = Class181.method3128(i, is, Class162.aClass245Array1764[i], false,
				  72005017);
	if (Class162.aClass245Array1764[i] == null)
	    return false;
	Class593.aBoolArray7832[i] = true;
	return true;
    }
    
    static final void method2668(Class683 class683, byte i) {
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_5_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_5_ >> 16];
	Class311.method5632(class259, class245, class683, -605408918);
    }
}
