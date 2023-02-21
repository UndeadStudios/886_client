/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class76 implements Interface76
{
    static Class76 aClass76_824;
    public static Class76 aClass76_825;
    static Class76 aClass76_826;
    public static Class76 aClass76_827;
    public static Class76 aClass76_828 = new Class76(2, 0, "", "");
    static Class76 aClass76_829 = new Class76(8, 1, "", "");
    public static Class76 aClass76_830;
    static Class76 aClass76_831;
    public static Class76 aClass76_832;
    int anInt833;
    int anInt834;
    String aString835;
    
    static {
	aClass76_826 = new Class76(6, 2, "", "");
	aClass76_827 = new Class76(0, 3, "", "");
	aClass76_824 = new Class76(1, 4, "", "");
	aClass76_832 = new Class76(4, 5, "", "");
	aClass76_830 = new Class76(5, 6, "", "");
	aClass76_831 = new Class76(3, 7, "", "");
	aClass76_825 = new Class76(7, -1, "", "", true,
				   new Class76[] { aClass76_828, aClass76_829,
						   aClass76_826, aClass76_824,
						   aClass76_827 });
    }
    
    Class76(int i, int i_0_, String string, String string_1_, boolean bool,
	    Class76[] class76s) {
	anInt833 = -941218967 * i;
	anInt834 = i_0_ * -2086482619;
	aString835 = string_1_;
    }
    
    public int method80() {
	return anInt834 * 1018543501;
    }
    
    public String method1556() {
	return aString835;
    }
    
    public int method57() {
	return anInt834 * 1018543501;
    }
    
    public String toString() {
	return aString835;
    }
    
    public int method75() {
	return anInt834 * 1018543501;
    }
    
    public String method1557() {
	return aString835;
    }
    
    Class76(int i, int i_2_, String string, String string_3_) {
	anInt833 = i * -941218967;
	anInt834 = i_2_ * -2086482619;
	aString835 = string_3_;
    }
    
    public String method1558() {
	return aString835;
    }
    
    static final void method1559(int i) {
	if (client.aFloat11176 < 1048.0F)
	    client.aFloat11176 = 1048.0F;
	if (client.aFloat11176 > 2942.0F)
	    client.aFloat11176 = 2942.0F;
	for (/**/; client.aFloat11052 >= 16384.0F;
	     client.aFloat11052 -= 16384.0F) {
	    /* empty */
	}
	for (/**/; client.aFloat11052 < 0.0F; client.aFloat11052 += 16384.0F) {
	    /* empty */
	}
	Class475 class475 = client.aClass507_11137.method8360(1813617644);
	Class546 class546 = client.aClass507_11137.method8358((byte) 125);
	int i_4_ = Class275.anInt2867 * 1497781253 >> 9;
	int i_5_ = 1222586347 * Class381.anInt3930 >> 9;
	int i_6_ = Class335.method5855(1497781253 * Class275.anInt2867,
				       1222586347 * Class381.anInt3930,
				       Class677.anInt8619 * -1335910809,
				       2020563229);
	int i_7_ = 0;
	if (i_4_ > 3 && i_5_ > 3
	    && i_4_ < client.aClass507_11137.method8412(1676759850) - 4
	    && i_5_ < client.aClass507_11137.method8352((byte) -6) - 4) {
	    for (int i_8_ = i_4_ - 4; i_8_ <= 4 + i_4_; i_8_++) {
		for (int i_9_ = i_5_ - 4; i_9_ <= i_5_ + 4; i_9_++) {
		    int i_10_ = -1335910809 * Class677.anInt8619;
		    if (i_10_ < 3
			&& class475.method7774(i_8_, i_9_, 1650200429))
			i_10_++;
		    int i_11_ = 0;
		    byte[][] is
			= client.aClass507_11137.method8450(i_10_, (byte) 0);
		    if (null != is)
			i_11_ = 8 * (is[i_8_][i_9_] & 0xff) << 2;
		    if (class546.aClass161Array7226 != null
			&& class546.aClass161Array7226[i_10_] != null) {
			int i_12_
			    = i_6_ - (class546.aClass161Array7226[i_10_]
					  .method2577(i_8_, i_9_, (byte) -104)
				      - i_11_);
			if (i_12_ > i_7_)
			    i_7_ = i_12_;
		    }
		}
	    }
	}
	int i_13_ = (i_7_ >> 2) * 1536;
	if (i_13_ > 786432)
	    i_13_ = 786432;
	if (i_13_ < 262144)
	    i_13_ = 262144;
	if (i_13_ > 466430475 * client.anInt11185)
	    client.anInt11185
		+= (i_13_ - 466430475 * client.anInt11185) / 24 * 1835700643;
	else if (i_13_ < client.anInt11185 * 466430475)
	    client.anInt11185
		+= 1835700643 * ((i_13_ - client.anInt11185 * 466430475) / 80);
    }
    
    public static void method1560(Class245 class245, Class259 class259,
				  boolean bool, int i) {
	Class13.method738(class245.aClass259Array2426, class259, bool,
			  (byte) 103);
    }
    
    static final void method1561(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_14_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_15_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	if (-1 == i_14_ && -1 == i_15_)
	    class259.aClass259_2685 = null;
	else
	    class259.aClass259_2685
		= Class147.method2388(i_14_, i_15_, -591235649);
    }
    
    static final void method1562(Class683 class683, int i) {
	Class525_Sub28 class525_sub28
	    = ((Class525_Sub28)
	       (class683.anObjectArray8636
		[(class683.anInt8644 -= 1285561025) * 1373599041]));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -770574447 * class525_sub28.anInt10615;
    }
}
