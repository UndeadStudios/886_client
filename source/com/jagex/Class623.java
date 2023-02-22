/* Class623 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class623
{
    public int anInt8103;
    public int anInt8104;
    public static final int anInt8105 = 2;
    public static final int anInt8106 = 0;
    public static final int anInt8107 = 1;
    public int anInt8108;
    public static final int anInt8109 = 2;
    public static final int anInt8110 = 3;
    public static final int anInt8111 = 4;
    public static final int anInt8112 = 1;
    static final int anInt8113 = 3;
    static final int anInt8114 = 100;
    public static final int anInt8115 = 3;
    public int anInt8116;
    public int anInt8117;
    public int[][] anIntArrayArray8118 = new int[3][5];
    public int anInt8119;
    public int anInt8120;
    public static final int anInt8121 = 0;
    public static final int anInt8122 = 5;
    static boolean aBool8123;
    
    void method10214(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(606310539);
	    if (i_0_ == 0)
		break;
	    if (1 == i_0_)
		anInt8103 = class525_sub38.readInt(2001754778) * 32442471;
	    else if (2 == i_0_)
		anInt8116
		    = class525_sub38.readInt(1872321570) * -1905942727;
	    else if (3 == i_0_)
		anInt8117
		    = class525_sub38.readInt(1823004371) * 1948606373;
	    else if (4 == i_0_)
		anInt8108
		    = class525_sub38.readUnsignedByte(1931925191) * 1468475083;
	    else if (5 == i_0_)
		anInt8119
		    = class525_sub38.readUnsignedByte(813596587) * -1847627665;
	    else if (i_0_ == 6)
		anInt8120
		    = class525_sub38.readInt(2140573600) * -710503467;
	    else if (7 == i_0_)
		anInt8104
		    = class525_sub38.readInt(1980046575) * 1901489487;
	    else if (i_0_ >= 100) {
		i_0_ -= 100;
		anIntArrayArray8118[i_0_ & (int) (Math.pow(2.0, 3.0)
						  - 1.0)][i_0_ >> 3]
		    = class525_sub38.readUnsignedShort((byte) 103);
	    }
	}
    }
    
    public Class623(JS5 class458) {
	byte[] is = class458.getTextureData((2028004077
					 * Class638.aClass638_8306.anInt8316),
					1890053073);
	if (null != is) {
	    /* empty */
	}
	method10214(new RSBuffer(is), 1045491798);
    }
    
    void method10215(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1620464733);
	    if (i == 0)
		break;
	    if (1 == i)
		anInt8103 = class525_sub38.readInt(1280631975) * 32442471;
	    else if (2 == i)
		anInt8116
		    = class525_sub38.readInt(1738143029) * -1905942727;
	    else if (3 == i)
		anInt8117
		    = class525_sub38.readInt(2114303568) * 1948606373;
	    else if (4 == i)
		anInt8108
		    = class525_sub38.readUnsignedByte(1574011962) * 1468475083;
	    else if (5 == i)
		anInt8119
		    = class525_sub38.readUnsignedByte(1930955046) * -1847627665;
	    else if (i == 6)
		anInt8120
		    = class525_sub38.readInt(1900276748) * -710503467;
	    else if (7 == i)
		anInt8104
		    = class525_sub38.readInt(2085814157) * 1901489487;
	    else if (i >= 100) {
		i -= 100;
		anIntArrayArray8118[i & (int) (Math.pow(2.0, 3.0)
					       - 1.0)][i >> 3]
		    = class525_sub38.readUnsignedShort((byte) 89);
	    }
	}
    }
    
    void method10216(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1745835399);
	    if (i == 0)
		break;
	    if (1 == i)
		anInt8103 = class525_sub38.readInt(2026319317) * 32442471;
	    else if (2 == i)
		anInt8116
		    = class525_sub38.readInt(1791352218) * -1905942727;
	    else if (3 == i)
		anInt8117
		    = class525_sub38.readInt(1378474992) * 1948606373;
	    else if (4 == i)
		anInt8108
		    = class525_sub38.readUnsignedByte(2015541080) * 1468475083;
	    else if (5 == i)
		anInt8119
		    = class525_sub38.readUnsignedByte(321591212) * -1847627665;
	    else if (i == 6)
		anInt8120
		    = class525_sub38.readInt(1514250501) * -710503467;
	    else if (7 == i)
		anInt8104
		    = class525_sub38.readInt(1561681730) * 1901489487;
	    else if (i >= 100) {
		i -= 100;
		anIntArrayArray8118[i & (int) (Math.pow(2.0, 3.0)
					       - 1.0)][i >> 3]
		    = class525_sub38.readUnsignedShort((byte) 105);
	    }
	}
    }
    
    static final void method10217(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method10218(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (!Class501.aClass182_5564.method3144())
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 3;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10677
		      .method14167(i_1_, (byte) -15);
    }
    
    static final void method10219(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class655.method10812(class259, class245, class683, -1830978638);
    }
    
    static String method10220(int i, int i_2_, boolean bool, int i_3_) {
	if (i_2_ < 2 || i_2_ > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i_2_).toString());
	if (!bool || i < 0)
	    return Integer.toString(i, i_2_);
	int i_4_ = 2;
	int i_5_ = i / i_2_;
	while (i_5_ != 0) {
	    i_5_ /= i_2_;
	    i_4_++;
	}
	char[] cs = new char[i_4_];
	cs[0] = '+';
	for (int i_6_ = i_4_ - 1; i_6_ > 0; i_6_--) {
	    int i_7_ = i;
	    i /= i_2_;
	    int i_8_ = i_7_ - i * i_2_;
	    if (i_8_ >= 10)
		cs[i_6_] = (char) (i_8_ + 87);
	    else
		cs[i_6_] = (char) (48 + i_8_);
	}
	return new String(cs);
    }
}
