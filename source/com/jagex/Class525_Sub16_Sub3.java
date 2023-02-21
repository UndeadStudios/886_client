/* Class525_Sub16_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub16_Sub3 extends Class525_Sub16
    implements Interface12, Interface7
{
    Class10 aClass10_11413;
    static Class7 aClass7_11414;
    public static Class157 aClass157_11415;
    
    public void method69() {
	/* empty */
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(1556131827);
	    if (0 == i_0_)
		break;
	    method18001(class525_sub38, i_0_, -397176198);
	}
    }
    
    void method18001(RSBuffer class525_sub38, int i, int i_1_) {
	if (i == 249) {
	    int i_2_ = class525_sub38.readUnsignedByte(354002287);
	    if (aClass10_11413 == null) {
		int i_3_ = Class212.method3935(i_2_, -2056250364);
		aClass10_11413 = new Class10(i_3_);
	    }
	    for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
		boolean bool = class525_sub38.readUnsignedByte(1779403607) == 1;
		int i_5_ = class525_sub38.method16834(-1994884458);
		Class525 class525;
		if (bool)
		    class525 = new Class525_Sub19(class525_sub38
						      .readString((byte) 52));
		else
		    class525
			= new Class525_Sub42(class525_sub38
						 .readInt(1062137755));
		aClass10_11413.method695(class525, (long) i_5_);
	    }
	}
    }
    
    public void method53(int i) {
	/* empty */
    }
    
    public String method18002(int i, String string, int i_6_) {
	if (aClass10_11413 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_11413.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public void method54(int i, byte i_7_) {
	/* empty */
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1350509408);
	    if (0 == i)
		break;
	    method18001(class525_sub38, i, 347781712);
	}
    }
    
    public int method18003(int i, int i_8_) {
	if (null == aClass10_11413)
	    return i_8_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_11413.method684((long) i);
	if (null == class525_sub42)
	    return i_8_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public void method70() {
	/* empty */
    }
    
    void method18004(RSBuffer class525_sub38, int i) {
	if (i == 249) {
	    int i_9_ = class525_sub38.readUnsignedByte(1765196201);
	    if (aClass10_11413 == null) {
		int i_10_ = Class212.method3935(i_9_, -2056250364);
		aClass10_11413 = new Class10(i_10_);
	    }
	    for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
		boolean bool = class525_sub38.readUnsignedByte(712552282) == 1;
		int i_12_ = class525_sub38.method16834(-1994884458);
		Class525 class525;
		if (bool)
		    class525
			= new Class525_Sub19(class525_sub38
						 .readString((byte) -52));
		else
		    class525
			= new Class525_Sub42(class525_sub38
						 .readInt(1130003791));
		aClass10_11413.method695(class525, (long) i_12_);
	    }
	}
    }
    
    public int method18005(int i, int i_13_) {
	if (null == aClass10_11413)
	    return i_13_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_11413.method684((long) i);
	if (null == class525_sub42)
	    return i_13_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    Class525_Sub16_Sub3() {
	/* empty */
    }
    
    public int method18006(int i, int i_14_) {
	if (null == aClass10_11413)
	    return i_14_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_11413.method684((long) i);
	if (null == class525_sub42)
	    return i_14_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public int method18007(int i, int i_15_) {
	if (null == aClass10_11413)
	    return i_15_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_11413.method684((long) i);
	if (null == class525_sub42)
	    return i_15_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public int method18008(int i, int i_16_, byte i_17_) {
	if (null == aClass10_11413)
	    return i_16_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_11413.method684((long) i);
	if (null == class525_sub42)
	    return i_16_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    void method18009(RSBuffer class525_sub38, int i) {
	if (i == 249) {
	    int i_18_ = class525_sub38.readUnsignedByte(394676730);
	    if (aClass10_11413 == null) {
		int i_19_ = Class212.method3935(i_18_, -2056250364);
		aClass10_11413 = new Class10(i_19_);
	    }
	    for (int i_20_ = 0; i_20_ < i_18_; i_20_++) {
		boolean bool = class525_sub38.readUnsignedByte(578747810) == 1;
		int i_21_ = class525_sub38.method16834(-1994884458);
		Class525 class525;
		if (bool)
		    class525
			= new Class525_Sub19(class525_sub38
						 .readString((byte) -30));
		else
		    class525
			= new Class525_Sub42(class525_sub38
						 .readInt(1263022642));
		aClass10_11413.method695(class525, (long) i_21_);
	    }
	}
    }
    
    public int method18010(int i, int i_22_) {
	if (null == aClass10_11413)
	    return i_22_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_11413.method684((long) i);
	if (null == class525_sub42)
	    return i_22_;
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    public String method18011(int i, String string) {
	if (aClass10_11413 == null)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_11413.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    static final void method18012(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 11804803 * client.anInt11318;
    }
    
    static void method18013(Class706 class706, int i) {
	Class669_Sub1.aClass706_10920 = class706;
    }
}
