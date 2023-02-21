/* Class594 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class594
{
    public static Class594 aClass594_7833;
    public static Class594 aClass594_7834 = new Class594(0);
    public static Class594 aClass594_7835;
    
    static {
	aClass594_7833 = new Class594(1);
	aClass594_7835 = new Class594(2);
    }
    
    Class594(int i) {
	/* empty */
    }
    
    static final void method9830(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.anInt2630 = -772379722;
	class259.aClass288_2769 = null;
	class259.anInt2631
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -1938518325;
	if (class259.anInt2576 * 1534974651 == -1 && !class245.aBool2428)
	    Class689.method14096(1984678839 * class259.anInt2588, -2070139500);
    }
    
    public static int method9831(CharSequence charsequence, int i, int i_0_,
				 byte[] is, int i_1_, int i_2_) {
	int i_3_ = i_0_ - i;
	for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
	    char c = charsequence.charAt(i_4_ + i);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_4_ + i_1_] = (byte) c;
	    else if (c == '\u20ac')
		is[i_4_ + i_1_] = (byte) -128;
	    else if (c == '\u201a')
		is[i_4_ + i_1_] = (byte) -126;
	    else if ('\u0192' == c)
		is[i_4_ + i_1_] = (byte) -125;
	    else if (c == '\u201e')
		is[i_1_ + i_4_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_1_ + i_4_] = (byte) -123;
	    else if (c == '\u2020')
		is[i_4_ + i_1_] = (byte) -122;
	    else if ('\u2021' == c)
		is[i_4_ + i_1_] = (byte) -121;
	    else if (c == '\u02c6')
		is[i_1_ + i_4_] = (byte) -120;
	    else if ('\u2030' == c)
		is[i_4_ + i_1_] = (byte) -119;
	    else if ('\u0160' == c)
		is[i_1_ + i_4_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_4_ + i_1_] = (byte) -117;
	    else if (c == '\u0152')
		is[i_1_ + i_4_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_1_ + i_4_] = (byte) -114;
	    else if (c == '\u2018')
		is[i_4_ + i_1_] = (byte) -111;
	    else if ('\u2019' == c)
		is[i_1_ + i_4_] = (byte) -110;
	    else if (c == '\u201c')
		is[i_4_ + i_1_] = (byte) -109;
	    else if (c == '\u201d')
		is[i_1_ + i_4_] = (byte) -108;
	    else if ('\u2022' == c)
		is[i_1_ + i_4_] = (byte) -107;
	    else if ('\u2013' == c)
		is[i_4_ + i_1_] = (byte) -106;
	    else if ('\u2014' == c)
		is[i_4_ + i_1_] = (byte) -105;
	    else if ('\u02dc' == c)
		is[i_1_ + i_4_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_4_ + i_1_] = (byte) -103;
	    else if ('\u0161' == c)
		is[i_1_ + i_4_] = (byte) -102;
	    else if ('\u203a' == c)
		is[i_1_ + i_4_] = (byte) -101;
	    else if (c == '\u0153')
		is[i_1_ + i_4_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_1_ + i_4_] = (byte) -98;
	    else if ('\u0178' == c)
		is[i_4_ + i_1_] = (byte) -97;
	    else
		is[i_1_ + i_4_] = (byte) 63;
	}
	return i_3_;
    }
    
    static boolean method9832(Class525_Sub38_Sub2 class525_sub38_sub2, int i,
			      int i_5_) {
	int i_6_ = class525_sub38_sub2.method18496(2, 578733530);
	if (0 == i_6_) {
	    if (class525_sub38_sub2.method18496(1, 578733530) != 0)
		method9832(class525_sub38_sub2, i, 1178075518);
	    int i_7_ = class525_sub38_sub2.method18496(6, 578733530);
	    int i_8_ = class525_sub38_sub2.method18496(6, 578733530);
	    boolean bool = class525_sub38_sub2.method18496(1, 578733530) == 1;
	    if (bool)
		Class104.anIntArray1278
		    [(Class104.anInt1289 += -812984013) * -799225349 - 1]
		    = i;
	    if (null != client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i])
		throw new RuntimeException();
	    Class46 class46 = Class104.aClass46Array1283[i];
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i]
		   = (new Class656_Sub1_Sub3_Sub1_Sub1
		      (client.aClass507_11137.method8358((byte) 72))));
	    class656_sub1_sub3_sub1_sub1.anInt11964 = i * -447377367;
	    if (Class104.aClass525_Sub38Array1290[i] != null)
		class656_sub1_sub3_sub1_sub1.method18903
		    (Class104.aClass525_Sub38Array1290[i], (byte) 5);
	    if (null != Class104.aClass525_Sub38Array1282[i])
		class656_sub1_sub3_sub1_sub1.method18904
		    (Class104.aClass525_Sub38Array1282[i], 2145929138);
	    class656_sub1_sub3_sub1_sub1
		.method18597(-1365547021 * class46.anInt355, true, (byte) 1);
	    class656_sub1_sub3_sub1_sub1.anInt11983
		= class46.anInt353 * -960896119;
	    int i_9_ = 1085153405 * class46.anInt351;
	    int i_10_ = i_9_ >> 28;
	    int i_11_ = i_9_ >> 14 & 0xff;
	    int i_12_ = i_9_ & 0xff;
	    Class600 class600 = client.aClass507_11137.method8350(374258272);
	    int i_13_ = (i_11_ << 6) + i_7_ - class600.anInt7858 * -1227002079;
	    int i_14_ = i_8_ + (i_12_ << 6) - 1429253007 * class600.anInt7860;
	    class656_sub1_sub3_sub1_sub1.aClass243_12252
		= class46.aClass243_354;
	    class656_sub1_sub3_sub1_sub1.aBool12254 = class46.aBool352;
	    class656_sub1_sub3_sub1_sub1.aByteArray12007[0]
		= Class104.aByteArray1287[i];
	    class656_sub1_sub3_sub1_sub1.aByte10867
		= class656_sub1_sub3_sub1_sub1.aByte10870 = (byte) i_10_;
	    if (client.aClass507_11137.method8360(2146995516)
		    .method7774(i_13_, i_14_, 1681700475))
		class656_sub1_sub3_sub1_sub1.aByte10870++;
	    class656_sub1_sub3_sub1_sub1.method18910(i_13_, i_14_, -516561274);
	    Class104.aClass46Array1283[i] = null;
	    return true;
	}
	if (1 == i_6_) {
	    int i_15_ = class525_sub38_sub2.method18496(2, 578733530);
	    int i_16_ = Class104.aClass46Array1283[i].anInt351 * 1085153405;
	    Class104.aClass46Array1283[i].anInt351
		= -1174120235 * (((i_15_ + (i_16_ >> 28) & 0x3) << 28)
				 + (i_16_ & 0xfffffff));
	    return false;
	}
	if (2 == i_6_) {
	    int i_17_ = class525_sub38_sub2.method18496(5, 578733530);
	    int i_18_ = i_17_ >> 3 & 0x3;
	    int i_19_ = i_17_ & 0x7;
	    int i_20_ = Class104.aClass46Array1283[i].anInt351 * 1085153405;
	    if (!Class104.$assertionsDisabled
		&& (Class104.aByteArray1287[i] < 0
		    || Class104.aByteArray1287[i] > 3))
		throw new AssertionError();
	    int i_21_ = i_18_ + (i_20_ >> 28) & 0x3;
	    int i_22_ = i_20_ >> 14 & 0xff;
	    int i_23_ = i_20_ & 0xff;
	    if (i_19_ == 0) {
		i_22_--;
		i_23_--;
	    }
	    if (1 == i_19_)
		i_23_--;
	    if (2 == i_19_) {
		i_22_++;
		i_23_--;
	    }
	    if (3 == i_19_)
		i_22_--;
	    if (i_19_ == 4)
		i_22_++;
	    if (5 == i_19_) {
		i_22_--;
		i_23_++;
	    }
	    if (i_19_ == 6)
		i_23_++;
	    if (7 == i_19_) {
		i_22_++;
		i_23_++;
	    }
	    Class539.method8888(Class684.method11241(-370675625),
				Class104.aByteArray1287[i], 1699057454);
	    Class104.aClass46Array1283[i].anInt351
		= -1174120235 * (i_23_ + ((i_22_ << 14) + (i_21_ << 28)));
	    return false;
	}
	int i_24_ = class525_sub38_sub2.method18496(20, 578733530);
	int i_25_ = i_24_ >> 18 & 0x3;
	int i_26_ = i_24_ >> 16 & 0x3;
	int i_27_ = i_24_ >> 8 & 0xff;
	int i_28_ = i_24_ & 0xff;
	int i_29_ = 1085153405 * Class104.aClass46Array1283[i].anInt351;
	Class104.aByteArray1287[i] = (byte) (i_25_ - 1);
	if (!Class104.$assertionsDisabled
	    && (Class104.aByteArray1287[i] < 0
		|| Class104.aByteArray1287[i] > 3))
	    throw new AssertionError();
	int i_30_ = i_26_ + (i_29_ >> 28) & 0x3;
	int i_31_ = (i_29_ >> 14) + i_27_ & 0xff;
	int i_32_ = i_29_ + i_28_ & 0xff;
	Class539.method8888(Class684.method11241(-98334995), i_25_ - 1,
			    -775768781);
	Class104.aClass46Array1283[i].anInt351
	    = (i_32_ + ((i_31_ << 14) + (i_30_ << 28))) * -1174120235;
	return false;
    }
}
