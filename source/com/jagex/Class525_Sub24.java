/* Class525_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub24 extends Class525
{
    public int anInt10587;
    public int anInt10588;
    public int anInt10589;
    public int anInt10590;
    public int anInt10591;
    public int anInt10592;
    public int anInt10593;
    public int anInt10594;
    static Class7 aClass7_10595;
    public int anInt10596;
    
    Class525_Sub24(RSBuffer class525_sub38) {
	int i = class525_sub38.readInt(1197074166);
	anInt10594 = -1023692889 * (i >>> 28);
	anInt10592 = -786848283 * (i >>> 14 & 0x3fff);
	anInt10589 = 1627817711 * (i & 0x3fff);
	anInt10593 = class525_sub38.readUnsignedByte(1382034126) * -774077817;
	anInt10596 = class525_sub38.readUnsignedByte(1520262305) * 248310839;
	anInt10590 = class525_sub38.readUnsignedByte(930223204) * 711392439;
	anInt10591 = class525_sub38.readUnsignedByte(1317756128) * -426826881;
	anInt10588 = class525_sub38.readUnsignedByte(271353617) * 795976941;
	anInt10587 = class525_sub38.readUnsignedByte(1924256047) * 1309651929;
    }
}
