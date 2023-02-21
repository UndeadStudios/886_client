/* Class529 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class529
{
    public int[] anIntArray7139;
    public int anInt7140;
    public int[] anIntArray7141;
    
    public static Class529 method8786(Class458 class458, String string,
				      boolean bool) {
	int i = class458.method7521(string, -2116786302);
	if (-1 == i)
	    return new Class529(0);
	byte[] is = class458.method7476(i, 1, 492776652);
	if (null == is)
	    return new Class529(0);
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_0_ = class525_sub38.readUnsignedShort((byte) 6);
	Class529 class529 = new Class529(i_0_);
	int i_1_ = 0;
	while (i_1_ < class529.anInt7140 * -698145127) {
	    int i_2_ = class525_sub38.readInt(892753325);
	    int i_3_ = class525_sub38.readUnsignedShort((byte) 70);
	    int i_4_ = class525_sub38.readUnsignedByte(62036193);
	    if (bool || 1 != i_4_) {
		class529.anIntArray7139[i_1_] = i_2_;
		class529.anIntArray7141[i_1_] = i_3_;
		i_1_++;
	    } else
		class529.anInt7140 -= -727986775;
	}
	return class529;
    }
    
    public Class529(int i) {
	anInt7140 = i * -727986775;
	anIntArray7139 = new int[anInt7140 * -698145127];
	anIntArray7141 = new int[-698145127 * anInt7140];
    }
    
    public static Class529 method8787(Class458 class458, String string,
				      boolean bool) {
	int i = class458.method7521(string, -2116786302);
	if (-1 == i)
	    return new Class529(0);
	byte[] is = class458.method7476(i, 1, 1463741258);
	if (null == is)
	    return new Class529(0);
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_5_ = class525_sub38.readUnsignedShort((byte) 8);
	Class529 class529 = new Class529(i_5_);
	int i_6_ = 0;
	while (i_6_ < class529.anInt7140 * -698145127) {
	    int i_7_ = class525_sub38.readInt(2014171780);
	    int i_8_ = class525_sub38.readUnsignedShort((byte) 112);
	    int i_9_ = class525_sub38.readUnsignedByte(1402512609);
	    if (bool || 1 != i_9_) {
		class529.anIntArray7139[i_6_] = i_7_;
		class529.anIntArray7141[i_6_] = i_8_;
		i_6_++;
	    } else
		class529.anInt7140 -= -727986775;
	}
	return class529;
    }
    
    public static Class529 method8788(Class458 class458, String string,
				      boolean bool) {
	int i = class458.method7521(string, -2116786302);
	if (-1 == i)
	    return new Class529(0);
	byte[] is = class458.method7476(i, 1, 696807616);
	if (null == is)
	    return new Class529(0);
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_10_ = class525_sub38.readUnsignedShort((byte) 32);
	Class529 class529 = new Class529(i_10_);
	int i_11_ = 0;
	while (i_11_ < class529.anInt7140 * -698145127) {
	    int i_12_ = class525_sub38.readInt(1510582020);
	    int i_13_ = class525_sub38.readUnsignedShort((byte) 120);
	    int i_14_ = class525_sub38.readUnsignedByte(1489223389);
	    if (bool || 1 != i_14_) {
		class529.anIntArray7139[i_11_] = i_12_;
		class529.anIntArray7141[i_11_] = i_13_;
		i_11_++;
	    } else
		class529.anInt7140 -= -727986775;
	}
	return class529;
    }
    
    public static Class529 method8789(Class458 class458, String string,
				      boolean bool) {
	int i = class458.method7521(string, -2116786302);
	if (-1 == i)
	    return new Class529(0);
	byte[] is = class458.method7476(i, 1, 725097711);
	if (null == is)
	    return new Class529(0);
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i_15_ = class525_sub38.readUnsignedShort((byte) 112);
	Class529 class529 = new Class529(i_15_);
	int i_16_ = 0;
	while (i_16_ < class529.anInt7140 * -698145127) {
	    int i_17_ = class525_sub38.readInt(1133166942);
	    int i_18_ = class525_sub38.readUnsignedShort((byte) 79);
	    int i_19_ = class525_sub38.readUnsignedByte(1170203879);
	    if (bool || 1 != i_19_) {
		class529.anIntArray7139[i_16_] = i_17_;
		class529.anIntArray7141[i_16_] = i_18_;
		i_16_++;
	    } else
		class529.anInt7140 -= -727986775;
	}
	return class529;
    }
    
    static final void method8790(Class683 class683, byte i) {
	long l = (class683.aLongArray8645
		  [(class683.anInt8648 -= 2101136961) * 105529793]);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = l == -1L ? "" : Long.toString(l, 36).toUpperCase();
    }
    
    static final void method8791(Class683 class683, short i) {
	int i_20_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Character.toLowerCase((char) i_20_);
    }
}
