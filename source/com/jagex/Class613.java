/* Class613 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class613 implements Interface76
{
    static Class613 aClass613_8027;
    static Class613 aClass613_8028;
    static Class613 aClass613_8029 = new Class613(0);
    int anInt8030;
    static int[] anIntArray8031;
    public static int anInt8032;
    
    public static Class613[] method10054() {
	return (new Class613[]
		{ aClass613_8029, aClass613_8027, aClass613_8028 });
    }
    
    Class613(int i) {
	anInt8030 = -874326527 * i;
    }
    
    static {
	aClass613_8028 = new Class613(1);
	aClass613_8027 = new Class613(2);
    }
    
    public int method57() {
	return anInt8030 * 654387713;
    }
    
    public int method75() {
	return anInt8030 * 654387713;
    }
    
    public static Class613[] method10055() {
	return (new Class613[]
		{ aClass613_8029, aClass613_8027, aClass613_8028 });
    }
    
    public static Class613[] method10056() {
	return (new Class613[]
		{ aClass613_8029, aClass613_8027, aClass613_8028 });
    }
    
    public static Class613[] method10057() {
	return (new Class613[]
		{ aClass613_8029, aClass613_8027, aClass613_8028 });
    }
    
    public static Class613[] method10058() {
	return (new Class613[]
		{ aClass613_8029, aClass613_8027, aClass613_8028 });
    }
    
    public int method80() {
	return anInt8030 * 654387713;
    }
    
    static final void method10059(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = Class182_Sub2.aClass228_9503.method4275(i_0_, 1962291714)
		  .method4189(-397784322);
    }
    
    static final void method10060(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_2_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = string.indexOf(i_1_, i_2_);
    }
    
    static int method10061(byte[][] is, byte[][] is_3_, int[] is_4_,
			   byte[] is_5_, int[] is_6_, int i, int i_7_,
			   int i_8_) {
	int i_9_ = is_4_[i];
	int i_10_ = is_6_[i] + i_9_;
	int i_11_ = is_4_[i_7_];
	int i_12_ = i_11_ + is_6_[i_7_];
	int i_13_ = i_9_;
	if (i_11_ > i_9_)
	    i_13_ = i_11_;
	int i_14_ = i_10_;
	if (i_12_ < i_10_)
	    i_14_ = i_12_;
	int i_15_ = is_5_[i] & 0xff;
	if ((is_5_[i_7_] & 0xff) < i_15_)
	    i_15_ = is_5_[i_7_] & 0xff;
	byte[] is_16_ = is_3_[i];
	byte[] is_17_ = is[i_7_];
	int i_18_ = i_13_ - i_9_;
	int i_19_ = i_13_ - i_11_;
	for (int i_20_ = i_13_; i_20_ < i_14_; i_20_++) {
	    int i_21_ = is_16_[i_18_++] + is_17_[i_19_++];
	    if (i_21_ < i_15_)
		i_15_ = i_21_;
	}
	return -i_15_;
    }
}
