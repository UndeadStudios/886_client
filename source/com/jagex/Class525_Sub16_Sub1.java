/* Class525_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub16_Sub1 extends Class525_Sub16
    implements Interface12, Interface7
{
    public int anInt11401 = 0;
    public int[] anIntArray11402;
    public int[] anIntArray11403;
    public int anInt11404 = 0;
    
    public void method53(int i) {
	/* empty */
    }
    
    void method17990(RSBuffer class525_sub38, int i, int i_0_) {
	if (2 == i)
	    anInt11404 = class525_sub38.readUnsignedShort((byte) 93) * -1051401583;
	else if (i == 4) {
	    anInt11401 = class525_sub38.readUnsignedByte(910207530) * 468927333;
	    anIntArray11402 = new int[-644794771 * anInt11401];
	    anIntArray11403 = new int[anInt11401 * -644794771];
	    for (int i_1_ = 0; i_1_ < anInt11401 * -644794771; i_1_++) {
		anIntArray11402[i_1_] = class525_sub38.readUnsignedShort((byte) 90);
		anIntArray11403[i_1_] = class525_sub38.readUnsignedShort((byte) 30);
	    }
	}
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    public void method70() {
	/* empty */
    }
    
    public void method54(int i, byte i_2_) {
	/* empty */
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1815688987);
	    if (i == 0)
		break;
	    method17990(class525_sub38, i, 1908388333);
	}
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_3_ = class525_sub38.readUnsignedByte(452114120);
	    if (i_3_ == 0)
		break;
	    method17990(class525_sub38, i_3_, 1460724256);
	}
    }
    
    Class525_Sub16_Sub1() {
	/* empty */
    }
    
    void method17991(RSBuffer class525_sub38, int i) {
	if (2 == i)
	    anInt11404 = class525_sub38.readUnsignedShort((byte) 10) * -1051401583;
	else if (i == 4) {
	    anInt11401 = class525_sub38.readUnsignedByte(561538229) * 468927333;
	    anIntArray11402 = new int[-644794771 * anInt11401];
	    anIntArray11403 = new int[anInt11401 * -644794771];
	    for (int i_4_ = 0; i_4_ < anInt11401 * -644794771; i_4_++) {
		anIntArray11402[i_4_] = class525_sub38.readUnsignedShort((byte) 69);
		anIntArray11403[i_4_] = class525_sub38.readUnsignedShort((byte) 116);
	    }
	}
    }
    
    static final void method17992(byte i) {
	int i_5_ = 0;
	Class546 class546 = client.aClass507_11137.method8358((byte) 17);
	for (int i_6_ = 0; i_6_ < client.aClass507_11137.method8412(676762992);
	     i_6_++) {
	    for (int i_7_ = 0;
		 i_7_ < client.aClass507_11137.method8352((byte) -10);
		 i_7_++) {
		if (Class410.method6665(class546.aClass547ArrayArrayArray7263,
					i_5_, i_6_, i_7_, true, (byte) 22))
		    i_5_++;
		if (i_5_ >= 512)
		    return;
	    }
	}
    }
    
    static final void method17993(Class683 class683, short i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1940882535 * class259.anInt2621;
    }
    
    public static boolean method17994(int i, byte i_8_) {
	return i == 0 || i == 1 || 2 == i;
    }
}
