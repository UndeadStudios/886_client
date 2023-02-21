/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.io.InputStream;

public class Class334
{
    int anInt3618;
    static final int anInt3619 = 2048;
    static final int anInt3620 = -16777216;
    static final int anInt3621 = 5;
    static final int anInt3622 = 11;
    int anInt3623;
    InputStream anInputStream3624;
    
    public int method5829(short[] is, int i, byte i_0_) throws IOException {
	int i_1_ = is[i];
	int i_2_ = (anInt3618 * -1965279971 >>> 11) * i_1_;
	if ((anInt3623 * -1026489139 ^ ~0x7fffffff) < (i_2_ ^ ~0x7fffffff)) {
	    anInt3618 = i_2_ * 82982197;
	    is[i] = (short) (i_1_ + (2048 - i_1_ >>> 5));
	    if (0 == (-1965279971 * anInt3618 & ~0xffffff)) {
		anInt3623 = (anInt3623 * -1026489139 << 8
			     | anInputStream3624.read()) * -1261008891;
		anInt3618 = 82982197 * (anInt3618 * -1965279971 << 8);
	    }
	    return 0;
	}
	anInt3618 -= i_2_ * 82982197;
	anInt3623 -= -1261008891 * i_2_;
	is[i] = (short) (i_1_ - (i_1_ >>> 5));
	if ((-1965279971 * anInt3618 & ~0xffffff) == 0) {
	    anInt3623 = (anInt3623 * -1026489139 << 8
			 | anInputStream3624.read()) * -1261008891;
	    anInt3618 = (-1965279971 * anInt3618 << 8) * 82982197;
	}
	return 1;
    }
    
    public final void method5830(InputStream inputstream, int i) {
	anInputStream3624 = inputstream;
    }
    
    public final void method5831(int i) {
	anInputStream3624 = null;
    }
    
    public final void method5832() throws IOException {
	anInt3623 = 0;
	anInt3618 = -82982197;
	for (int i = 0; i < 5; i++)
	    anInt3623 = (anInt3623 * -1026489139 << 8
			 | anInputStream3624.read()) * -1261008891;
    }
    
    public final int method5833(int i, int i_3_) throws IOException {
	int i_4_ = 0;
	for (int i_5_ = i; 0 != i_5_; i_5_--) {
	    anInt3618 = 82982197 * (-1965279971 * anInt3618 >>> 1);
	    int i_6_
		= anInt3623 * -1026489139 - -1965279971 * anInt3618 >>> 31;
	    anInt3623 -= -1261008891 * (anInt3618 * -1965279971 & i_6_ - 1);
	    i_4_ = i_4_ << 1 | 1 - i_6_;
	    if (0 == (anInt3618 * -1965279971 & ~0xffffff)) {
		anInt3623 = (-1026489139 * anInt3623 << 8
			     | anInputStream3624.read()) * -1261008891;
		anInt3618 = 82982197 * (-1965279971 * anInt3618 << 8);
	    }
	}
	return i_4_;
    }
    
    public final void method5834(InputStream inputstream) {
	anInputStream3624 = inputstream;
    }
    
    public final void method5835(InputStream inputstream) {
	anInputStream3624 = inputstream;
    }
    
    public final void method5836() {
	anInputStream3624 = null;
    }
    
    public final void method5837(int i) throws IOException {
	anInt3623 = 0;
	anInt3618 = -82982197;
	for (int i_7_ = 0; i_7_ < 5; i_7_++)
	    anInt3623 = (anInt3623 * -1026489139 << 8
			 | anInputStream3624.read()) * -1261008891;
    }
    
    public final void method5838() throws IOException {
	anInt3623 = 0;
	anInt3618 = -82982197;
	for (int i = 0; i < 5; i++)
	    anInt3623 = (anInt3623 * -1026489139 << 8
			 | anInputStream3624.read()) * -1261008891;
    }
    
    public final int method5839(int i) throws IOException {
	int i_8_ = 0;
	for (int i_9_ = i; 0 != i_9_; i_9_--) {
	    anInt3618 = 82982197 * (-1965279971 * anInt3618 >>> 1);
	    int i_10_
		= anInt3623 * -1026489139 - -1965279971 * anInt3618 >>> 31;
	    anInt3623 -= -1261008891 * (anInt3618 * -1965279971 & i_10_ - 1);
	    i_8_ = i_8_ << 1 | 1 - i_10_;
	    if (0 == (anInt3618 * -1965279971 & ~0xffffff)) {
		anInt3623 = (-1026489139 * anInt3623 << 8
			     | anInputStream3624.read()) * -1261008891;
		anInt3618 = 82982197 * (-1965279971 * anInt3618 << 8);
	    }
	}
	return i_8_;
    }
    
    public static void method5840(short[] is) {
	for (int i = 0; i < is.length; i++)
	    is[i] = (short) 1024;
    }
    
    public static void method5841(short[] is) {
	for (int i = 0; i < is.length; i++)
	    is[i] = (short) 1024;
    }
    
    static final void method5842(Class683 class683, int i) {
	int i_11_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_11_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2665 * -1020682347;
    }
    
    static final void method5843(Class683 class683, int i) {
	Class525_Sub28 class525_sub28
	    = ((Class525_Sub28)
	       (class683.anObjectArray8636
		[(class683.anInt8644 -= 1285561025) * 1373599041]));
	if (Class453_Sub3.aClass309_Sub1_10316.method5484(-2094851284)
	    != Class298.aClass298_3276)
	    throw new RuntimeException();
	Class704_Sub1 class704_sub1
	    = ((Class704_Sub1)
	       Class453_Sub3.aClass309_Sub1_10316.method5482(-421725149));
	class704_sub1.method17377(class525_sub28, -70389820);
	client.aBool11364 = true;
    }
    
    public static int method5844(String string, String string_12_, byte i) {
	if (!Class589.aBool7794)
	    return 12;
	if (Class111.method1979(-2028862839) != client.aClass96_11085)
	    return 42;
	return Class285.aTwitchTV3143.Login(string, string_12_);
    }
}
