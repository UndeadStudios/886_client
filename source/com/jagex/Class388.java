/* Class388 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class388
{
    public static final int anInt4037 = 0;
    public static final int anInt4038 = 2;
    static final int anInt4039 = 0;
    static final int anInt4040 = 1;
    public static final int anInt4041 = 1;
    public static final int anInt4042 = 0;
    static final int anInt4043 = 1;
    public static final int anInt4044 = 2;
    public int anInt4045;
    public int anInt4046;
    public int anInt4047;
    public int anInt4048;
    public int anInt4049;
    public static final int anInt4050 = 1;
    public int anInt4051;
    public int anInt4052;
    public int anInt4053;
    public int anInt4054 = 0;
    public int anInt4055;
    boolean aBool4056;
    public int anInt4057;
    public long aLong4058;
    public int anInt4059;
    
    void method6453() {
	anInt4059 = (-316729561
		     * Class436.anIntArray4838[-694135381 * anInt4055 << 3]);
	long l = (long) (-719788841 * anInt4049);
	long l_0_ = (long) (anInt4048 * 1262845375);
	long l_1_ = (long) (1898274533 * anInt4051);
	anInt4057 = (int) Math.sqrt((double) (l * l + l_0_ * l_0_
					      + l_1_ * l_1_)) * 2068533155;
	if (0 == anInt4053 * -2138470573)
	    anInt4053 = -1979296549;
	if (anInt4052 * 104385927 == 0)
	    aLong4058 = -510359399732339961L;
	else if (anInt4052 * 104385927 == 1) {
	    aLong4058
		= 828411264976020729L * (long) (anInt4057 * 1958404184
						/ (anInt4053 * -2138470573));
	    aLong4058 *= aLong4058 * -4646561278530183863L;
	} else if (104385927 * anInt4052 == 2)
	    aLong4058
		= ((long) (anInt4057 * 1958404184 / (anInt4053 * -2138470573))
		   * 828411264976020729L);
	if (aBool4056)
	    anInt4057 *= -1;
    }
    
    void method6454(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_2_ = class525_sub38.readUnsignedByte(243451227);
	    if (i_2_ == 0)
		break;
	    method6455(class525_sub38, i_2_, (byte) 64);
	}
    }
    
    void method6455(RSBuffer class525_sub38, int i, byte i_3_) {
	if (1 == i)
	    anInt4055 = class525_sub38.readUnsignedShort((byte) 96) * -1218446077;
	else if (2 == i)
	    class525_sub38.readUnsignedByte(1973837656);
	else if (3 == i) {
	    anInt4049 = class525_sub38.readInt(1251560770) * -72331545;
	    anInt4048 = class525_sub38.readInt(1731177543) * 1339650623;
	    anInt4051 = class525_sub38.readInt(1617076349) * 1414672109;
	} else if (4 == i) {
	    anInt4052 = class525_sub38.readUnsignedByte(1667875364) * -1836357577;
	    anInt4053 = class525_sub38.readInt(1521159610) * -1979296549;
	} else if (6 == i)
	    anInt4047 = class525_sub38.readUnsignedByte(2014385544) * 1220498357;
	else if (8 == i)
	    anInt4054 = 108980729;
	else if (i == 9)
	    anInt4045 = 1387941321;
	else if (i == 10)
	    aBool4056 = true;
    }
    
    void method6456(short i) {
	anInt4059 = (-316729561
		     * Class436.anIntArray4838[-694135381 * anInt4055 << 3]);
	long l = (long) (-719788841 * anInt4049);
	long l_4_ = (long) (anInt4048 * 1262845375);
	long l_5_ = (long) (1898274533 * anInt4051);
	anInt4057 = (int) Math.sqrt((double) (l * l + l_4_ * l_4_
					      + l_5_ * l_5_)) * 2068533155;
	if (0 == anInt4053 * -2138470573)
	    anInt4053 = -1979296549;
	if (anInt4052 * 104385927 == 0)
	    aLong4058 = -510359399732339961L;
	else if (anInt4052 * 104385927 == 1) {
	    aLong4058
		= 828411264976020729L * (long) (anInt4057 * 1958404184
						/ (anInt4053 * -2138470573));
	    aLong4058 *= aLong4058 * -4646561278530183863L;
	} else if (104385927 * anInt4052 == 2)
	    aLong4058
		= ((long) (anInt4057 * 1958404184 / (anInt4053 * -2138470573))
		   * 828411264976020729L);
	if (aBool4056)
	    anInt4057 *= -1;
    }
    
    void method6457(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1715002877);
	    if (i == 0)
		break;
	    method6455(class525_sub38, i, (byte) 61);
	}
    }
    
    Class388() {
	anInt4045 = 0;
	aBool4056 = false;
    }
    
    void method6458(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    anInt4055 = class525_sub38.readUnsignedShort((byte) 47) * -1218446077;
	else if (2 == i)
	    class525_sub38.readUnsignedByte(1151790522);
	else if (3 == i) {
	    anInt4049 = class525_sub38.readInt(1101695787) * -72331545;
	    anInt4048 = class525_sub38.readInt(939266773) * 1339650623;
	    anInt4051 = class525_sub38.readInt(1490931661) * 1414672109;
	} else if (4 == i) {
	    anInt4052 = class525_sub38.readUnsignedByte(1063761706) * -1836357577;
	    anInt4053 = class525_sub38.readInt(1109354752) * -1979296549;
	} else if (6 == i)
	    anInt4047 = class525_sub38.readUnsignedByte(1355596986) * 1220498357;
	else if (8 == i)
	    anInt4054 = 108980729;
	else if (i == 9)
	    anInt4045 = 1387941321;
	else if (i == 10)
	    aBool4056 = true;
    }
    
    void method6459(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    anInt4055 = class525_sub38.readUnsignedShort((byte) 49) * -1218446077;
	else if (2 == i)
	    class525_sub38.readUnsignedByte(1665633312);
	else if (3 == i) {
	    anInt4049 = class525_sub38.readInt(1810235268) * -72331545;
	    anInt4048 = class525_sub38.readInt(1562739870) * 1339650623;
	    anInt4051 = class525_sub38.readInt(1495009161) * 1414672109;
	} else if (4 == i) {
	    anInt4052 = class525_sub38.readUnsignedByte(1959869268) * -1836357577;
	    anInt4053 = class525_sub38.readInt(1773842261) * -1979296549;
	} else if (6 == i)
	    anInt4047 = class525_sub38.readUnsignedByte(250529597) * 1220498357;
	else if (8 == i)
	    anInt4054 = 108980729;
	else if (i == 9)
	    anInt4045 = 1387941321;
	else if (i == 10)
	    aBool4056 = true;
    }
    
    void method6460(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(276597544);
	    if (i == 0)
		break;
	    method6455(class525_sub38, i, (byte) 74);
	}
    }
    
    void method6461() {
	anInt4059 = (-316729561
		     * Class436.anIntArray4838[-694135381 * anInt4055 << 3]);
	long l = (long) (-719788841 * anInt4049);
	long l_6_ = (long) (anInt4048 * 1262845375);
	long l_7_ = (long) (1898274533 * anInt4051);
	anInt4057 = (int) Math.sqrt((double) (l * l + l_6_ * l_6_
					      + l_7_ * l_7_)) * 2068533155;
	if (0 == anInt4053 * -2138470573)
	    anInt4053 = -1979296549;
	if (anInt4052 * 104385927 == 0)
	    aLong4058 = -510359399732339961L;
	else if (anInt4052 * 104385927 == 1) {
	    aLong4058
		= 828411264976020729L * (long) (anInt4057 * 1958404184
						/ (anInt4053 * -2138470573));
	    aLong4058 *= aLong4058 * -4646561278530183863L;
	} else if (104385927 * anInt4052 == 2)
	    aLong4058
		= ((long) (anInt4057 * 1958404184 / (anInt4053 * -2138470573))
		   * 828411264976020729L);
	if (aBool4056)
	    anInt4057 *= -1;
    }
    
    public static void method6462(byte i) {
	Class328.aBool3576 = true;
	Class108.aString1309 = Class70.aString777;
	Class525_Sub21.aString10584 = Class70.aString789;
	Class156.method2465(false, -2047965342);
	Class392.method6481(-2143587960);
	Class328.aClass303Array3578 = null;
	Class442.aClass459_4866 = null;
	Class441.method7119(10, -1188439438);
    }
}
