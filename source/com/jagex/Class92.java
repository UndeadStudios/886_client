/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class92 implements Interface12, Interface7
{
    public int anInt904;
    public int anInt905;
    public int anInt906 = 0;
    public int anInt907;
    
    public void method54(int i, byte i_0_) {
	/* empty */
    }
    
    void method1701(RSBuffer class525_sub38, int i) {
	if (i == 1)
	    anInt906 = class525_sub38.readUnsignedByte(172251008) * -435415001;
	else if (i == 2)
	    anInt907 = class525_sub38.readUnsignedShort((byte) 100) * -1714355109;
	else if (3 == i)
	    anInt904 = class525_sub38.readUnsignedShort((byte) 100) * 157129429;
	else if (i == 4)
	    anInt905 = class525_sub38.method16625((byte) -42) * -1600184843;
    }
    
    void method1702(RSBuffer class525_sub38, int i, int i_1_) {
	if (i == 1)
	    anInt906 = class525_sub38.readUnsignedByte(279078920) * -435415001;
	else if (i == 2)
	    anInt907 = class525_sub38.readUnsignedShort((byte) 57) * -1714355109;
	else if (3 == i)
	    anInt904 = class525_sub38.readUnsignedShort((byte) 71) * 157129429;
	else if (i == 4)
	    anInt905 = class525_sub38.method16625((byte) -76) * -1600184843;
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_2_ = class525_sub38.readUnsignedByte(1664790437);
	    if (i_2_ == 0)
		break;
	    method1702(class525_sub38, i_2_, -1068652999);
	}
    }
    
    public void method70() {
	/* empty */
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1819849104);
	    if (i == 0)
		break;
	    method1702(class525_sub38, i, -2073957533);
	}
    }
    
    public void method69() {
	/* empty */
    }
    
    Class92() {
	anInt905 = 0;
	anInt904 = -321476608;
	anInt907 = -2010982400;
    }
    
    public void method53(int i) {
	/* empty */
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    void method1703(RSBuffer class525_sub38, int i) {
	if (i == 1)
	    anInt906 = class525_sub38.readUnsignedByte(1861572688) * -435415001;
	else if (i == 2)
	    anInt907 = class525_sub38.readUnsignedShort((byte) 76) * -1714355109;
	else if (3 == i)
	    anInt904 = class525_sub38.readUnsignedShort((byte) 21) * 157129429;
	else if (i == 4)
	    anInt905 = class525_sub38.method16625((byte) 36) * -1600184843;
    }
    
    void method1704(RSBuffer class525_sub38, int i) {
	if (i == 1)
	    anInt906 = class525_sub38.readUnsignedByte(1275054266) * -435415001;
	else if (i == 2)
	    anInt907 = class525_sub38.readUnsignedShort((byte) 49) * -1714355109;
	else if (3 == i)
	    anInt904 = class525_sub38.readUnsignedShort((byte) 25) * 157129429;
	else if (i == 4)
	    anInt905 = class525_sub38.method16625((byte) -66) * -1600184843;
    }
}
