/* Class525_Sub22_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub22_Sub1 extends Class525_Sub22
{
    String aString11643;
    int anInt11644;
    byte aByte11645;
    Class340 this$0;
    public static Class632 aClass632_11646;
    
    void method16339(Class525_Sub25 class525_sub25, int i) {
	Class341 class341 = new Class341();
	class341.aString3654 = aString11643;
	class341.anInt3653 = anInt11644 * -159265645;
	class341.aByte3652 = aByte11645;
	class525_sub25.method16350(class341, (byte) 80);
    }
    
    void method16335(RSBuffer class525_sub38, byte i) {
	if (class525_sub38.readUnsignedByte(242089185) != 255) {
	    class525_sub38.pos -= 339428471;
	    class525_sub38.method16603(3005987);
	}
	aString11643 = class525_sub38.method16635(-1670507484);
	anInt11644 = class525_sub38.readUnsignedShort((byte) 62) * -1892764559;
	aByte11645 = class525_sub38.readByte(-1150098071);
	class525_sub38.method16603(296172804);
    }
    
    void method16338(Class525_Sub25 class525_sub25) {
	Class341 class341 = new Class341();
	class341.aString3654 = aString11643;
	class341.anInt3653 = anInt11644 * -159265645;
	class341.aByte3652 = aByte11645;
	class525_sub25.method16350(class341, (byte) 109);
    }
    
    void method16337(Class525_Sub25 class525_sub25) {
	Class341 class341 = new Class341();
	class341.aString3654 = aString11643;
	class341.anInt3653 = anInt11644 * -159265645;
	class341.aByte3652 = aByte11645;
	class525_sub25.method16350(class341, (byte) 109);
    }
    
    Class525_Sub22_Sub1(Class340 class340) {
	this$0 = class340;
	aString11643 = null;
    }
    
    void method16336(Class525_Sub25 class525_sub25) {
	Class341 class341 = new Class341();
	class341.aString3654 = aString11643;
	class341.anInt3653 = anInt11644 * -159265645;
	class341.aByte3652 = aByte11645;
	class525_sub25.method16350(class341, (byte) 37);
    }
    
    void method16340(RSBuffer class525_sub38) {
	if (class525_sub38.readUnsignedByte(1167181233) != 255) {
	    class525_sub38.pos -= 339428471;
	    class525_sub38.method16603(-1916146151);
	}
	aString11643 = class525_sub38.method16635(-1434853332);
	anInt11644 = class525_sub38.readUnsignedShort((byte) 45) * -1892764559;
	aByte11645 = class525_sub38.readByte(-1150098071);
	class525_sub38.method16603(-1366096968);
    }
}
