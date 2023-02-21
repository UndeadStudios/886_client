/* Class534 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534
{
    Class530 this$0;
    
    Class534(Class530 class530) {
	this$0 = class530;
    }
    
    static final void method8854(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int[] is = Class558.method9375(string, class683, (byte) 3);
	if (null != is)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2677
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1175890049);
	class259.anIntArray2589 = is;
	class259.aBool2695 = true;
    }
    
    static final void method8855(Class683 class683, int i) {
	class683.anInt8662 -= -2016344041;
	int i_0_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_1_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662] << 1;
	int i_2_ = class683.anIntArray8661[2 + 501271953 * class683.anInt8662];
	int i_3_ = class683.anIntArray8661[3 + 501271953 * class683.anInt8662];
	int i_4_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 4];
	int i_5_ = class683.anIntArray8661[5 + class683.anInt8662 * 501271953];
	int i_6_ = class683.anIntArray8661[6 + 501271953 * class683.anInt8662];
	if (i_0_ >= 0 && i_0_ < 2
	    && null != client.anIntArrayArrayArray11188[i_0_] && i_1_ >= 0
	    && i_1_ < client.anIntArrayArrayArray11188[i_0_].length) {
	    client.anIntArrayArrayArray11188[i_0_][i_1_]
		= new int[] { (i_2_ >> 14 & 0x3fff) << 9, i_3_ << 2,
			      (i_2_ & 0x3fff) << 9, i_6_ };
	    client.anIntArrayArrayArray11188[i_0_][i_1_ + 1]
		= new int[] { (i_4_ >> 14 & 0x3fff) << 9, i_5_ << 2,
			      (i_4_ & 0x3fff) << 9 };
	}
    }
}
