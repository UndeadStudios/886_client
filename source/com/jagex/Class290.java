/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class290
{
    static Class290 aClass290_3210;
    static Class290 aClass290_3211;
    static Class290 aClass290_3212;
    public int anInt3213;
    static Class290 aClass290_3214;
    static Class290 aClass290_3215;
    public static Class290 aClass290_3216 = new Class290(0, 104);
    public int anInt3217;
    
    static {
	aClass290_3211 = new Class290(1, 120);
	aClass290_3212 = new Class290(2, 136);
	aClass290_3214 = new Class290(3, 168);
	aClass290_3210 = new Class290(4, 72);
	aClass290_3215 = new Class290(5, 256);
    }
    
    static Class290[] method5269() {
	return (new Class290[]
		{ aClass290_3214, aClass290_3216, aClass290_3215,
		  aClass290_3210, aClass290_3211, aClass290_3212 });
    }
    
    static Class290[] method5270() {
	return (new Class290[]
		{ aClass290_3214, aClass290_3216, aClass290_3215,
		  aClass290_3210, aClass290_3211, aClass290_3212 });
    }
    
    public static Class290 method5271(int i) {
	Class290[] class290s = Class53.method1174(-1747676321);
	for (int i_0_ = 0; i_0_ < class290s.length; i_0_++) {
	    Class290 class290 = class290s[i_0_];
	    if (i == class290.anInt3213 * -691210721)
		return class290;
	}
	return null;
    }
    
    public static Class290 method5272(int i) {
	Class290[] class290s = Class53.method1174(925800311);
	for (int i_1_ = 0; i_1_ < class290s.length; i_1_++) {
	    Class290 class290 = class290s[i_1_];
	    if (i == class290.anInt3213 * -691210721)
		return class290;
	}
	return null;
    }
    
    Class290(int i, int i_2_) {
	anInt3213 = i * -1300691489;
	anInt3217 = i_2_ * 276841073;
    }
    
    public static final int method5273(int i, int i_3_, int i_4_, int i_5_,
				       int i_6_, byte i_7_) {
	if (client.aClass507_11137.method8358((byte) 94) == null)
	    return 0;
	if (i_6_ < 3) {
	    Class475 class475 = client.aClass507_11137.method8360(1285456343);
	    int i_8_ = i >> 9;
	    int i_9_ = i_3_ >> 9;
	    if (i_4_ < 0 || i_5_ < 0
		|| i_4_ > client.aClass507_11137.method8412(1044386627) - 1
		|| i_5_ > client.aClass507_11137.method8352((byte) -49) - 1)
		return 0;
	    if (i_8_ < 1 || i_9_ < 1
		|| i_8_ > client.aClass507_11137.method8412(1007518677) - 1
		|| i_9_ > client.aClass507_11137.method8352((byte) -13) - 1)
		return 0;
	    boolean bool
		= 0 != (class475.aByteArrayArrayArray5178[1][i >> 9][i_3_ >> 9]
			& 0x2);
	    if (0 == (i & 0x1ff)) {
		boolean bool_10_ = 0 != ((class475.aByteArrayArrayArray5178[1]
					  [i_8_ - 1][i_3_ >> 9])
					 & 0x2);
		boolean bool_11_
		    = ((class475.aByteArrayArrayArray5178[1][i_8_][i_3_ >> 9]
			& 0x2)
		       != 0);
		if (bool_11_ != bool_10_)
		    bool = (class475.aByteArrayArrayArray5178[1][i_4_][i_5_]
			    & 0x2) != 0;
	    }
	    if (0 == (i_3_ & 0x1ff)) {
		boolean bool_12_ = 0 != ((class475.aByteArrayArrayArray5178[1]
					  [i >> 9][i_9_ - 1])
					 & 0x2);
		boolean bool_13_
		    = 0 != (class475.aByteArrayArrayArray5178[1][i >> 9][i_9_]
			    & 0x2);
		if (bool_13_ != bool_12_)
		    bool = 0 != ((class475.aByteArrayArrayArray5178[1][i_4_]
				  [i_5_])
				 & 0x2);
	    }
	    if (bool)
		i_6_++;
	}
	return client.aClass507_11137.method8358((byte) 16)
		   .aClass161Array7226[i_6_].method2619(i, i_3_, -2093626364);
    }
    
    static final void method5274(int i, int[] is, byte i_14_) {
	if (Class165.method2667(i, is, 1598522113)) {
	    Class259[] class259s
		= Class162.aClass245Array1764[i].aClass259Array2426;
	    for (int i_15_ = 0; i_15_ < class259s.length; i_15_++) {
		Class259 class259 = class259s[i_15_];
		if (class259 != null && null != class259.aClass689_2664)
		    class259.aClass689_2664.method14071(-431250528);
	    }
	}
    }
    
    public static Class384 method5275(RSBuffer class525_sub38, int i) {
	Class395 class395 = (Class96.method1813(1978938277)
			     [class525_sub38.readUnsignedByte(290121946)]);
	Class396 class396 = (Class643.method10595((byte) 115)
			     [class525_sub38.readUnsignedByte(1319973168)]);
	int i_16_ = class525_sub38.method16625((byte) 0);
	int i_17_ = class525_sub38.method16625((byte) -41);
	int i_18_ = class525_sub38.readBigSmart(-2043778683);
	int i_19_ = class525_sub38.readInt(2119677375);
	int i_20_ = class525_sub38.readUnsignedByte(1326939099);
	return new Class384(class395, class396, i_16_, i_17_, i_18_, i_19_,
			    i_20_);
    }
    
    static final void method5276(Class683 class683, short i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (int) ((Class251.method4508((byte) 8)
		      - Class182_Sub2.aClass228_9503.method4270(307261211)
		      - -4171256870334932335L * Class104.aLong1291)
		     / 1000L);
    }
    
    static final void method5277(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 56690511 * Class463.anInt5119;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1960864551 * Class696_Sub5.anInt10890;
    }
}
