/* Class525_Sub16_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub16_Sub11 extends Class525_Sub16
{
    public int[] anIntArray11826;
    String[] aStringArray11827;
    int[] anIntArray11828;
    ConfigEntry aClass58_11829;
    int[][] anIntArrayArray11830;
    public boolean aBool11831 = true;
    
    public String method18419() {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (aStringArray11827 == null)
	    return "";
	stringbuilder.append(aStringArray11827[0]);
	for (int i = 1; i < aStringArray11827.length; i++) {
	    for (int i_0_ = 0; i_0_ < 3; i_0_++)
		stringbuilder.append('.');
	    stringbuilder.append(aStringArray11827[i]);
	}
	return stringbuilder.toString();
    }
    
    void method18420(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_1_ = class525_sub38.readUnsignedByte(880453683);
	    if (0 == i_1_)
		break;
	    method18434(class525_sub38, i_1_, (short) 1141);
	}
    }
    
    public Class650 method18421(int i) {
	if (null == anIntArray11828 || i < 0 || i > anIntArray11828.length)
	    return null;
	return Class584_Sub1.method16854(anIntArray11828[i], -1886945678);
    }
    
    public void method18422(RSBuffer class525_sub38, int[] is, byte i) {
	if (anIntArray11828 != null) {
	    for (int i_2_ = 0;
		 i_2_ < anIntArray11828.length && i_2_ < is.length; i_2_++) {
		int i_3_
		    = method18426(i_2_, -1913925699).anInt8370 * -1740275459;
		if (i_3_ > 0)
		    class525_sub38.method16610((long) is[i_2_], i_3_,
					       1588929915);
	    }
	}
    }
    
    public String method18423(RSBuffer class525_sub38, int i) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null != anIntArray11828) {
	    for (int i_4_ = 0; i_4_ < anIntArray11828.length; i_4_++) {
		stringbuilder.append(aStringArray11827[i_4_]);
		stringbuilder.append
		    (aClass58_11829.method1217
		     (method18426(i_4_, -1913925699),
		      anIntArrayArray11830[i_4_],
		      class525_sub38.method16633((Class584_Sub1.method16854
						  (anIntArray11828[i_4_],
						   -1828789903)
						  .anInt8386) * -1809250091,
						 384434437)));
	    }
	}
	stringbuilder.append(aStringArray11827[aStringArray11827.length - 1]);
	return stringbuilder.toString();
    }
    
    public String method18424(int i) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (aStringArray11827 == null)
	    return "";
	stringbuilder.append(aStringArray11827[0]);
	for (int i_5_ = 1; i_5_ < aStringArray11827.length; i_5_++) {
	    for (int i_6_ = 0; i_6_ < 3; i_6_++)
		stringbuilder.append('.');
	    stringbuilder.append(aStringArray11827[i_5_]);
	}
	return stringbuilder.toString();
    }
    
    public int method18425(int i) {
	if (null == anIntArray11828)
	    return 0;
	return anIntArray11828.length;
    }
    
    public Class650 method18426(int i, int i_7_) {
	if (null == anIntArray11828 || i < 0 || i > anIntArray11828.length)
	    return null;
	return Class584_Sub1.method16854(anIntArray11828[i], -1540004899);
    }
    
    public int method18427(int i, int i_8_, int i_9_) {
	if (null == anIntArray11828 || i < 0 || i > anIntArray11828.length)
	    return -1;
	if (null == anIntArrayArray11830[i] || i_8_ < 0
	    || i_8_ > anIntArrayArray11830[i].length)
	    return -1;
	return anIntArrayArray11830[i][i_8_];
    }
    
    void method18428(int i) {
	if (anIntArray11826 != null) {
	    for (int i_10_ = 0; i_10_ < anIntArray11826.length; i_10_++)
		anIntArray11826[i_10_] |= 0x8000;
	}
    }
    
    void method18429(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1020819923);
	    if (0 == i)
		break;
	    method18434(class525_sub38, i, (short) 1141);
	}
    }
    
    void method18430(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    aStringArray11827
		= Class481.method7829(class525_sub38.readString((byte) 53),
				      '<', -1262831332);
	else if (2 == i) {
	    int i_11_ = class525_sub38.readUnsignedByte(755102779);
	    anIntArray11826 = new int[i_11_];
	    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
		anIntArray11826[i_12_] = class525_sub38.readUnsignedShort((byte) 98);
	} else if (3 == i) {
	    int i_13_ = class525_sub38.readUnsignedByte(1219645082);
	    anIntArray11828 = new int[i_13_];
	    anIntArrayArray11830 = new int[i_13_][];
	    for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
		int i_15_ = class525_sub38.readUnsignedShort((byte) 71);
		Class650 class650
		    = Class584_Sub1.method16854(i_15_, -1934847704);
		if (null != class650) {
		    anIntArray11828[i_14_] = i_15_;
		    anIntArrayArray11830[i_14_]
			= new int[class650.anInt8387 * -4998751];
		    for (int i_16_ = 0; i_16_ < class650.anInt8387 * -4998751;
			 i_16_++)
			anIntArrayArray11830[i_14_][i_16_]
			    = class525_sub38.readUnsignedShort((byte) 112);
		}
	    }
	} else if (i == 4)
	    aBool11831 = false;
    }
    
    void method18431(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    aStringArray11827
		= Class481.method7829(class525_sub38.readString((byte) 33),
				      '<', -1020734294);
	else if (2 == i) {
	    int i_17_ = class525_sub38.readUnsignedByte(137480339);
	    anIntArray11826 = new int[i_17_];
	    for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
		anIntArray11826[i_18_] = class525_sub38.readUnsignedShort((byte) 1);
	} else if (3 == i) {
	    int i_19_ = class525_sub38.readUnsignedByte(1350827838);
	    anIntArray11828 = new int[i_19_];
	    anIntArrayArray11830 = new int[i_19_][];
	    for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
		int i_21_ = class525_sub38.readUnsignedShort((byte) 102);
		Class650 class650
		    = Class584_Sub1.method16854(i_21_, -1858606357);
		if (null != class650) {
		    anIntArray11828[i_20_] = i_21_;
		    anIntArrayArray11830[i_20_]
			= new int[class650.anInt8387 * -4998751];
		    for (int i_22_ = 0; i_22_ < class650.anInt8387 * -4998751;
			 i_22_++)
			anIntArrayArray11830[i_20_][i_22_]
			    = class525_sub38.readUnsignedShort((byte) 114);
		}
	    }
	} else if (i == 4)
	    aBool11831 = false;
    }
    
    public String method18432(RSBuffer class525_sub38) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null != anIntArray11828) {
	    for (int i = 0; i < anIntArray11828.length; i++) {
		stringbuilder.append(aStringArray11827[i]);
		stringbuilder.append
		    (aClass58_11829.method1217
		     (method18426(i, -1913925699), anIntArrayArray11830[i],
		      class525_sub38.method16633((Class584_Sub1.method16854
						  (anIntArray11828[i],
						   -1473474247)
						  .anInt8386) * -1809250091,
						 -450332539)));
	    }
	}
	stringbuilder.append(aStringArray11827[aStringArray11827.length - 1]);
	return stringbuilder.toString();
    }
    
    public String method18433(RSBuffer class525_sub38) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null != anIntArray11828) {
	    for (int i = 0; i < anIntArray11828.length; i++) {
		stringbuilder.append(aStringArray11827[i]);
		stringbuilder.append
		    (aClass58_11829.method1217
		     (method18426(i, -1913925699), anIntArrayArray11830[i],
		      class525_sub38.method16633((Class584_Sub1.method16854
						  (anIntArray11828[i],
						   -1484616274)
						  .anInt8386) * -1809250091,
						 -940653264)));
	    }
	}
	stringbuilder.append(aStringArray11827[aStringArray11827.length - 1]);
	return stringbuilder.toString();
    }
    
    void method18434(RSBuffer class525_sub38, int i, short i_23_) {
	if (1 == i)
	    aStringArray11827
		= Class481.method7829(class525_sub38.readString((byte) 21),
				      '<', 266085697);
	else if (2 == i) {
	    int i_24_ = class525_sub38.readUnsignedByte(1303634076);
	    anIntArray11826 = new int[i_24_];
	    for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
		anIntArray11826[i_25_] = class525_sub38.readUnsignedShort((byte) 39);
	} else if (3 == i) {
	    int i_26_ = class525_sub38.readUnsignedByte(1891077206);
	    anIntArray11828 = new int[i_26_];
	    anIntArrayArray11830 = new int[i_26_][];
	    for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
		int i_28_ = class525_sub38.readUnsignedShort((byte) 121);
		Class650 class650
		    = Class584_Sub1.method16854(i_28_, -1765113285);
		if (null != class650) {
		    anIntArray11828[i_27_] = i_28_;
		    anIntArrayArray11830[i_27_]
			= new int[class650.anInt8387 * -4998751];
		    for (int i_29_ = 0; i_29_ < class650.anInt8387 * -4998751;
			 i_29_++)
			anIntArrayArray11830[i_27_][i_29_]
			    = class525_sub38.readUnsignedShort((byte) 35);
		}
	    }
	} else if (i == 4)
	    aBool11831 = false;
    }
    
    void method18435(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    aStringArray11827
		= Class481.method7829(class525_sub38.readString((byte) -14),
				      '<', -2034823539);
	else if (2 == i) {
	    int i_30_ = class525_sub38.readUnsignedByte(148345318);
	    anIntArray11826 = new int[i_30_];
	    for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
		anIntArray11826[i_31_] = class525_sub38.readUnsignedShort((byte) 31);
	} else if (3 == i) {
	    int i_32_ = class525_sub38.readUnsignedByte(1481894562);
	    anIntArray11828 = new int[i_32_];
	    anIntArrayArray11830 = new int[i_32_][];
	    for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
		int i_34_ = class525_sub38.readUnsignedShort((byte) 122);
		Class650 class650
		    = Class584_Sub1.method16854(i_34_, -1627520542);
		if (null != class650) {
		    anIntArray11828[i_33_] = i_34_;
		    anIntArrayArray11830[i_33_]
			= new int[class650.anInt8387 * -4998751];
		    for (int i_35_ = 0; i_35_ < class650.anInt8387 * -4998751;
			 i_35_++)
			anIntArrayArray11830[i_33_][i_35_]
			    = class525_sub38.readUnsignedShort((byte) 14);
		}
	    }
	} else if (i == 4)
	    aBool11831 = false;
    }
    
    public String method18436(RSBuffer class525_sub38) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null != anIntArray11828) {
	    for (int i = 0; i < anIntArray11828.length; i++) {
		stringbuilder.append(aStringArray11827[i]);
		stringbuilder.append
		    (aClass58_11829.method1217
		     (method18426(i, -1913925699), anIntArrayArray11830[i],
		      class525_sub38.method16633((Class584_Sub1.method16854
						  (anIntArray11828[i],
						   -1549589840)
						  .anInt8386) * -1809250091,
						 1313296721)));
	    }
	}
	stringbuilder.append(aStringArray11827[aStringArray11827.length - 1]);
	return stringbuilder.toString();
    }
    
    public String method18437(RSBuffer class525_sub38) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null != anIntArray11828) {
	    for (int i = 0; i < anIntArray11828.length; i++) {
		stringbuilder.append(aStringArray11827[i]);
		stringbuilder.append
		    (aClass58_11829.method1217
		     (method18426(i, -1913925699), anIntArrayArray11830[i],
		      class525_sub38.method16633((Class584_Sub1.method16854
						  (anIntArray11828[i],
						   -1981817321)
						  .anInt8386) * -1809250091,
						 -460129137)));
	    }
	}
	stringbuilder.append(aStringArray11827[aStringArray11827.length - 1]);
	return stringbuilder.toString();
    }
    
    public String method18438() {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (aStringArray11827 == null)
	    return "";
	stringbuilder.append(aStringArray11827[0]);
	for (int i = 1; i < aStringArray11827.length; i++) {
	    for (int i_36_ = 0; i_36_ < 3; i_36_++)
		stringbuilder.append('.');
	    stringbuilder.append(aStringArray11827[i]);
	}
	return stringbuilder.toString();
    }
    
    void method18439(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(90640942);
	    if (0 == i)
		break;
	    method18434(class525_sub38, i, (short) 1141);
	}
    }
    
    public String method18440() {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (aStringArray11827 == null)
	    return "";
	stringbuilder.append(aStringArray11827[0]);
	for (int i = 1; i < aStringArray11827.length; i++) {
	    for (int i_37_ = 0; i_37_ < 3; i_37_++)
		stringbuilder.append('.');
	    stringbuilder.append(aStringArray11827[i]);
	}
	return stringbuilder.toString();
    }
    
    public int method18441() {
	if (null == anIntArray11828)
	    return 0;
	return anIntArray11828.length;
    }
    
    public int method18442() {
	if (null == anIntArray11828)
	    return 0;
	return anIntArray11828.length;
    }
    
    Class525_Sub16_Sub11() {
	/* empty */
    }
    
    public Class650 method18443(int i) {
	if (null == anIntArray11828 || i < 0 || i > anIntArray11828.length)
	    return null;
	return Class584_Sub1.method16854(anIntArray11828[i], -1878021750);
    }
}
