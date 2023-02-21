/* Class396 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Point;

public class Class396
{
    static Class396 aClass396_4103;
    static Class396 aClass396_4104;
    static Class396 aClass396_4105 = new Class396();
    public static String aString4106;
    
    static {
	aClass396_4104 = new Class396();
	aClass396_4103 = new Class396();
    }
    
    public int method6529(int i, int i_0_, byte i_1_) {
	int i_2_ = (-1883654023 * Class696_Sub47.anInt11032 > i_0_
		    ? Class696_Sub47.anInt11032 * -1883654023 : i_0_);
	if (aClass396_4105 == this)
	    return 0;
	if (this == aClass396_4103)
	    return i_2_ - i;
	if (aClass396_4104 == this)
	    return (i_2_ - i) / 2;
	return 0;
    }
    
    public int method6530(int i, int i_3_) {
	int i_4_ = (-1883654023 * Class696_Sub47.anInt11032 > i_3_
		    ? Class696_Sub47.anInt11032 * -1883654023 : i_3_);
	if (aClass396_4105 == this)
	    return 0;
	if (this == aClass396_4103)
	    return i_4_ - i;
	if (aClass396_4104 == this)
	    return (i_4_ - i) / 2;
	return 0;
    }
    
    public static Class396[] method6531() {
	return (new Class396[]
		{ aClass396_4105, aClass396_4104, aClass396_4103 });
    }
    
    public int method6532(int i, int i_5_) {
	int i_6_ = (-1883654023 * Class696_Sub47.anInt11032 > i_5_
		    ? Class696_Sub47.anInt11032 * -1883654023 : i_5_);
	if (aClass396_4105 == this)
	    return 0;
	if (this == aClass396_4103)
	    return i_6_ - i;
	if (aClass396_4104 == this)
	    return (i_6_ - i) / 2;
	return 0;
    }
    
    public int method6533(int i, int i_7_) {
	int i_8_ = (-1883654023 * Class696_Sub47.anInt11032 > i_7_
		    ? Class696_Sub47.anInt11032 * -1883654023 : i_7_);
	if (aClass396_4105 == this)
	    return 0;
	if (this == aClass396_4103)
	    return i_8_ - i;
	if (aClass396_4104 == this)
	    return (i_8_ - i) / 2;
	return 0;
    }
    
    public int method6534(int i, int i_9_) {
	int i_10_ = (-1883654023 * Class696_Sub47.anInt11032 > i_9_
		     ? Class696_Sub47.anInt11032 * -1883654023 : i_9_);
	if (aClass396_4105 == this)
	    return 0;
	if (this == aClass396_4103)
	    return i_10_ - i;
	if (aClass396_4104 == this)
	    return (i_10_ - i) / 2;
	return 0;
    }
    
    Class396() {
	/* empty */
    }
    
    static final void method6535(Class259 class259, Class683 class683, int i) {
	Class7 class7
	    = class259.method4683(Class7.aClass404_53,
				  client.anInterface50_11252, 2030157131);
	int i_11_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Point point = class7.method570(class259.aString2667,
				       class259.anInt2602 * -1694810043,
				       class259.anInt2668 * 672478219, i_11_,
				       Class229.aClass157Array2364, (byte) 59);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = point.x;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = point.y;
    }
    
    public static void method6536(Class578 class578, int i, int i_12_,
				  int i_13_) {
	Class683 class683 = Class457.method7468(-485786200);
	Class587.method9691(class578, i, i_12_, class683, (byte) 27);
    }
    
    static final void method6537(Class259 class259, Class245 class245,
				 Class683 class683, short i) {
	class683.anInt8662 -= -1189665054;
	class259.anInt2612
	    = (class683.anIntArray8661[class683.anInt8662 * 501271953]
	       * 2009282735);
	if (1693654607 * class259.anInt2612
	    > (1440880309 * class259.anInt2718
	       - class259.anInt2602 * -1694810043))
	    class259.anInt2612 = (class259.anInt2718 * -1721492037
				  - class259.anInt2602 * -278984917);
	if (1693654607 * class259.anInt2612 < 0)
	    class259.anInt2612 = 0;
	class259.anInt2613
	    = (648253975
	       * class683.anIntArray8661[501271953 * class683.anInt8662 + 1]);
	if (1059112359 * class259.anInt2613
	    > class259.anInt2615 * 997812131 - class259.anInt2598 * 2054207119)
	    class259.anInt2613 = (class259.anInt2615 * -1010023003
				  - class259.anInt2598 * -1085606695);
	if (class259.anInt2613 * 1059112359 < 0)
	    class259.anInt2613 = 0;
	Class649.method10708(class259, (byte) 0);
	if (1534974651 * class259.anInt2576 == -1 && !class245.aBool2428)
	    Class106.method1914(class259.anInt2588 * 1984678839, (byte) -98);
    }
}
