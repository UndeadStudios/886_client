/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class46
{
    int anInt351;
    boolean aBool352;
    int anInt353;
    Class243 aClass243_354 = Class243.aClass243_2417;
    int anInt355;
    static int anInt356;
    
    Class46() {
	/* empty */
    }
    
    public static void method1091(int i) {
	synchronized (Class654.aQueue8395) {
	    for (;;) {
		Class525_Sub41_Sub2 class525_sub41_sub2
		    = (Class525_Sub41_Sub2) Class654.aQueue8395.poll();
		if (class525_sub41_sub2 == null)
		    break;
		class525_sub41_sub2.method16861(808688821);
	    }
	}
    }
    
    static final void method1092(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub36_10699
		  .method17292(2113225233) ? 1 : 0;
    }
    
    public static void method1093(Class40_Sub8 class40_sub8, int i) {
	Class689.aClass40_Sub8_8720 = class40_sub8;
    }
    
    public static int method1094(Class685 class685, Class675 class675, int i,
				 byte i_0_) {
	if (class685 == Class685.aClass685_8686)
	    return 443;
	return 50000 + i;
    }
    
    public static int method1095(int i, int i_1_, int i_2_, int i_3_) {
	if (Class556_Sub1.anInt10625 * 294186987 < 100)
	    return -2;
	int i_4_ = -2;
	int i_5_ = 2147483647;
	int i_6_ = i_1_ - Class556_Sub1.anInt7483;
	int i_7_ = i_2_ - Class556_Sub1.anInt7484;
	for (Class525_Sub37 class525_sub37
		 = ((Class525_Sub37)
		    Class556_Sub1.aClass709_7473.method14372((short) -14099));
	     null != class525_sub37;
	     class525_sub37 = (Class525_Sub37) Class556_Sub1.aClass709_7473
						   .method14353(-1142082202)) {
	    if (i == -480723851 * class525_sub37.anInt10825) {
		int i_8_ = class525_sub37.anInt10826 * 1273194629;
		int i_9_ = -1383897689 * class525_sub37.anInt10824;
		int i_10_ = (Class556_Sub1.anInt7483 + i_8_ << 14
			     | i_9_ + Class556_Sub1.anInt7484);
		int i_11_ = ((i_6_ - i_8_) * (i_6_ - i_8_)
			     + (i_7_ - i_9_) * (i_7_ - i_9_));
		if (i_4_ < 0 || i_11_ < i_5_) {
		    i_4_ = i_10_;
		    i_5_ = i_11_;
		}
	    }
	}
	return i_4_;
    }
    
    static final void method1096(Class683 class683, int i) {
	int i_12_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class287 class287
	    = ((Class287)
	       Class698.aClass40_Sub2_8770.method76(i_12_, 608187879));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class287.anInt3149 * -436572411;
    }
}
