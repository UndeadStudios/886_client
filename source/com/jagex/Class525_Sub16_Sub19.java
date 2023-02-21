/* Class525_Sub16_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub16_Sub19 extends Class525_Sub16
{
    public int[] anIntArray11914;
    public int[] anIntArray11915;
    public char[] aCharArray11916;
    public String aString11917;
    public char[] aCharArray11918;
    
    public int method18543(char c, byte i) {
	if (anIntArray11915 == null)
	    return -1;
	for (int i_0_ = 0; i_0_ < anIntArray11915.length; i_0_++) {
	    if (aCharArray11916[i_0_] == c)
		return anIntArray11915[i_0_];
	}
	return -1;
    }
    
    Class525_Sub16_Sub19() {
	/* empty */
    }
    
    void method18544(RSBuffer class525_sub38, int i) {
	do {
	    if (1 == i)
		aString11917 = class525_sub38.readString((byte) 50);
	    else if (2 == i) {
		int i_1_ = class525_sub38.readUnsignedByte(2107727072);
		anIntArray11915 = new int[i_1_];
		aCharArray11916 = new char[i_1_];
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
		    anIntArray11915[i_2_]
			= class525_sub38.readUnsignedShort((byte) 121);
		    byte i_3_ = class525_sub38.readByte(-1150098071);
		    aCharArray11916[i_2_]
			= (i_3_ == 0 ? '\0'
			   : Class656_Sub1_Sub1_Sub1.method18717(i_3_,
								 -798190035));
		}
	    } else if (3 == i) {
		int i_4_ = class525_sub38.readUnsignedByte(2121018838);
		anIntArray11914 = new int[i_4_];
		aCharArray11918 = new char[i_4_];
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		    anIntArray11914[i_5_]
			= class525_sub38.readUnsignedShort((byte) 105);
		    byte i_6_ = class525_sub38.readByte(-1150098071);
		    aCharArray11918[i_5_]
			= (i_6_ == 0 ? '\0'
			   : Class656_Sub1_Sub1_Sub1.method18717(i_6_,
								 -1609924653));
		}
	    } else if (4 == i)
		break;
	} while (false);
    }
    
    void method18545(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_7_ = class525_sub38.readUnsignedByte(1514752420);
	    if (i_7_ == 0)
		break;
	    method18546(class525_sub38, i_7_, (byte) 55);
	}
    }
    
    void method18546(RSBuffer class525_sub38, int i, byte i_8_) {
	do {
	    if (1 == i)
		aString11917 = class525_sub38.readString((byte) -45);
	    else if (2 == i) {
		int i_9_ = class525_sub38.readUnsignedByte(790932371);
		anIntArray11915 = new int[i_9_];
		aCharArray11916 = new char[i_9_];
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
		    anIntArray11915[i_10_]
			= class525_sub38.readUnsignedShort((byte) 83);
		    byte i_11_ = class525_sub38.readByte(-1150098071);
		    aCharArray11916[i_10_]
			= (i_11_ == 0 ? '\0'
			   : Class656_Sub1_Sub1_Sub1.method18717(i_11_,
								 -659160210));
		}
	    } else if (3 == i) {
		int i_12_ = class525_sub38.readUnsignedByte(833217645);
		anIntArray11914 = new int[i_12_];
		aCharArray11918 = new char[i_12_];
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
		    anIntArray11914[i_13_]
			= class525_sub38.readUnsignedShort((byte) 106);
		    byte i_14_ = class525_sub38.readByte(-1150098071);
		    aCharArray11918[i_13_]
			= (i_14_ == 0 ? '\0'
			   : Class656_Sub1_Sub1_Sub1.method18717(i_14_,
								 -666852648));
		}
	    } else if (4 == i)
		break;
	} while (false);
    }
    
    void method18547(int i) {
	if (anIntArray11914 != null) {
	    for (int i_15_ = 0; i_15_ < anIntArray11914.length; i_15_++)
		anIntArray11914[i_15_] |= 0x8000;
	}
	if (null != anIntArray11915) {
	    for (int i_16_ = 0; i_16_ < anIntArray11915.length; i_16_++)
		anIntArray11915[i_16_] |= 0x8000;
	}
    }
    
    void method18548(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(428906897);
	    if (i == 0)
		break;
	    method18546(class525_sub38, i, (byte) 69);
	}
    }
    
    void method18549(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1105805262);
	    if (i == 0)
		break;
	    method18546(class525_sub38, i, (byte) 19);
	}
    }
    
    void method18550(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1750528436);
	    if (i == 0)
		break;
	    method18546(class525_sub38, i, (byte) 51);
	}
    }
    
    public int method18551(char c, byte i) {
	if (null == anIntArray11914)
	    return -1;
	for (int i_17_ = 0; i_17_ < anIntArray11914.length; i_17_++) {
	    if (c == aCharArray11918[i_17_])
		return anIntArray11914[i_17_];
	}
	return -1;
    }
    
    public int method18552(char c) {
	if (anIntArray11915 == null)
	    return -1;
	for (int i = 0; i < anIntArray11915.length; i++) {
	    if (aCharArray11916[i] == c)
		return anIntArray11915[i];
	}
	return -1;
    }
    
    public int method18553(char c) {
	if (null == anIntArray11914)
	    return -1;
	for (int i = 0; i < anIntArray11914.length; i++) {
	    if (c == aCharArray11918[i])
		return anIntArray11914[i];
	}
	return -1;
    }
    
    public int method18554(char c) {
	if (null == anIntArray11914)
	    return -1;
	for (int i = 0; i < anIntArray11914.length; i++) {
	    if (c == aCharArray11918[i])
		return anIntArray11914[i];
	}
	return -1;
    }
    
    void method18555() {
	if (anIntArray11914 != null) {
	    for (int i = 0; i < anIntArray11914.length; i++)
		anIntArray11914[i] |= 0x8000;
	}
	if (null != anIntArray11915) {
	    for (int i = 0; i < anIntArray11915.length; i++)
		anIntArray11915[i] |= 0x8000;
	}
    }
}
