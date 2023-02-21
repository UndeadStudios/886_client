/* Class457 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class457
{
    public static final int anInt5040 = 6;
    public static final int anInt5041 = 3;
    public static final int anInt5042 = 1;
    public static final int anInt5043 = 2;
    public static final int anInt5044 = 4;
    public static final int anInt5045 = 5;
    
    Class457() throws Throwable {
	throw new Error();
    }
    
    static final void method7464(Class259 class259, Class245 class245,
				 Class683 class683, short i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2744
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1512589795);
	class259.aBool2695 = true;
    }
    
    static final void method7465(Class683 class683, byte i) {
	class683.anInt8662 -= 362986067;
	int i_0_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_1_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_2_ = class683.anIntArray8661[2 + class683.anInt8662 * 501271953];
	if (i_1_ == -1)
	    throw new RuntimeException();
	Class65 class65
	    = ((Class65)
	       Class525_Sub22.aClass40_Sub15_10585.method76(i_1_, 1381214181));
	if (class65.aClass495_698.method80() != i_0_)
	    throw new RuntimeException();
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class65.method1412(Integer.valueOf(i_2_), -1922090294) ? 1 : 0;
    }
    
    static final void method7466(Class683 class683, int i) {
	Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
	    = ((Class656_Sub1_Sub3_Sub1_Sub2)
	       class683.aClass656_Sub1_Sub3_Sub1_8654);
	Class299 class299 = class656_sub1_sub3_sub1_sub2.aClass299_12255;
	if (class299.anIntArray3323 != null)
	    class299
		= class299.method5386(Class532.aClass111_7170,
				      Class532.aClass111_7170, 2112100671);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = null != class299 ? 1 : 0;
    }
    
    public static short[] method7467(short[] is, int i) {
	if (is == null)
	    return null;
	short[] is_3_ = new short[is.length];
	System.arraycopy(is, 0, is_3_, 0, is.length);
	return is_3_;
    }
    
    static final Class683 method7468(int i) {
	if (Class686.anInt8693 * -1776363431
	    == Class686.anArrayList8701.size())
	    Class686.anArrayList8701.add(new Class683());
	Class683 class683
	    = ((Class683)
	       Class686.anArrayList8701.get(Class686.anInt8693 * -1776363431));
	Class686.anInt8693 += -1019023383;
	return class683;
    }
}
