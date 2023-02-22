/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class191
{
    static final int anInt2140 = 2;
    static final int anInt2141 = 0;
    int[] anIntArray2142;
    int[] anIntArray2143;
    
    void method3694(Class205 class205, int i, int i_0_) {
	int i_1_ = anIntArray2143[0];
	class205.method3870(i, i_1_ >>> 16, i_1_ & 0xffff, -2026221341);
	Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1
	    = class205.method3864(476831029);
	class656_sub1_sub3_sub1.anInt12015 = 0;
	for (int i_2_ = anIntArray2142.length - 1; i_2_ >= 0; i_2_--) {
	    int i_3_ = anIntArray2142[i_2_];
	    int i_4_ = anIntArray2143[i_2_];
	    class656_sub1_sub3_sub1.anIntArray12014
		[class656_sub1_sub3_sub1.anInt12015 * -2046237799]
		= i_4_ >> 16;
	    class656_sub1_sub3_sub1.anIntArray12017
		[class656_sub1_sub3_sub1.anInt12015 * -2046237799]
		= i_4_ & 0xffff;
	    byte i_5_ = Class684.aClass684_8668.aByte8666;
	    if (i_3_ == 0)
		i_5_ = Class684.aClass684_8667.aByte8666;
	    else if (i_3_ == 2)
		i_5_ = Class684.aClass684_8669.aByte8666;
	    class656_sub1_sub3_sub1.aByteArray12007
		[class656_sub1_sub3_sub1.anInt12015 * -2046237799]
		= i_5_;
	    class656_sub1_sub3_sub1.anInt12015 += -901267287;
	}
    }
    
    Class191(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedSmart((byte) -4);
	anIntArray2142 = new int[i];
	anIntArray2143 = new int[i];
	for (int i_6_ = 0; i_6_ < i; i_6_++) {
	    int i_7_ = class525_sub38.readUnsignedByte(1168314367);
	    anIntArray2142[i_6_] = i_7_;
	    int i_8_ = class525_sub38.readUnsignedShort((byte) 120);
	    int i_9_ = class525_sub38.readUnsignedShort((byte) 15);
	    anIntArray2143[i_6_] = (i_8_ << 16) + i_9_;
	}
    }
    
    void method3695(Class205 class205, int i) {
	int i_10_ = anIntArray2143[0];
	class205.method3870(i, i_10_ >>> 16, i_10_ & 0xffff, -1634666539);
	Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1
	    = class205.method3864(-1265087387);
	class656_sub1_sub3_sub1.anInt12015 = 0;
	for (int i_11_ = anIntArray2142.length - 1; i_11_ >= 0; i_11_--) {
	    int i_12_ = anIntArray2142[i_11_];
	    int i_13_ = anIntArray2143[i_11_];
	    class656_sub1_sub3_sub1.anIntArray12014
		[class656_sub1_sub3_sub1.anInt12015 * -2046237799]
		= i_13_ >> 16;
	    class656_sub1_sub3_sub1.anIntArray12017
		[class656_sub1_sub3_sub1.anInt12015 * -2046237799]
		= i_13_ & 0xffff;
	    byte i_14_ = Class684.aClass684_8668.aByte8666;
	    if (i_12_ == 0)
		i_14_ = Class684.aClass684_8667.aByte8666;
	    else if (i_12_ == 2)
		i_14_ = Class684.aClass684_8669.aByte8666;
	    class656_sub1_sub3_sub1.aByteArray12007
		[class656_sub1_sub3_sub1.anInt12015 * -2046237799]
		= i_14_;
	    class656_sub1_sub3_sub1.anInt12015 += -901267287;
	}
    }
    
    void method3696(Class205 class205, int i) {
	int i_15_ = anIntArray2143[0];
	class205.method3870(i, i_15_ >>> 16, i_15_ & 0xffff, -84190054);
	Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1
	    = class205.method3864(-1043359039);
	class656_sub1_sub3_sub1.anInt12015 = 0;
	for (int i_16_ = anIntArray2142.length - 1; i_16_ >= 0; i_16_--) {
	    int i_17_ = anIntArray2142[i_16_];
	    int i_18_ = anIntArray2143[i_16_];
	    class656_sub1_sub3_sub1.anIntArray12014
		[class656_sub1_sub3_sub1.anInt12015 * -2046237799]
		= i_18_ >> 16;
	    class656_sub1_sub3_sub1.anIntArray12017
		[class656_sub1_sub3_sub1.anInt12015 * -2046237799]
		= i_18_ & 0xffff;
	    byte i_19_ = Class684.aClass684_8668.aByte8666;
	    if (i_17_ == 0)
		i_19_ = Class684.aClass684_8667.aByte8666;
	    else if (i_17_ == 2)
		i_19_ = Class684.aClass684_8669.aByte8666;
	    class656_sub1_sub3_sub1.aByteArray12007
		[class656_sub1_sub3_sub1.anInt12015 * -2046237799]
		= i_19_;
	    class656_sub1_sub3_sub1.anInt12015 += -901267287;
	}
    }
    
    static final void method3697(Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (string.startsWith(Class501.method8197(0, 2041240721))
	    || string.startsWith(Class501.method8197(1, 297447898)))
	    string = string.substring(7);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class450.method7330(string, -799803019) ? 1 : 0;
    }
    
    static final void method3698(Class683 class683, int i) {
	int i_20_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (i_20_ >= 1 && i_20_ <= 2) {
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub41_10704,
		 i_20_, (byte) -48);
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub41_10705,
		 i_20_, (byte) -70);
	    Class650.method10715(-1758466106);
	}
    }
    
    static final void method3699(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class164.method2663(class259, class245, class683, 677051985);
    }
    
    static final void method3700(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static Class712 method3701(short i) {
	if (Class25.aClass712_237 == null)
	    return Class712.aClass712_8874;
	return Class25.aClass712_237;
    }
}
