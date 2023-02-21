/* Class568 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class568
{
    short aShort7610;
    public static final int anInt7611 = 2;
    public static final int anInt7612 = 4;
    public static final int anInt7613 = 8;
    public static final int anInt7614 = 16;
    byte aByte7615;
    byte aByte7616;
    short aShort7617;
    short aShort7618;
    public static final int anInt7619 = 1;
    short aShort7620;
    int[] anIntArray7621;
    int[] anIntArray7622;
    int[] anIntArray7623;
    short[] aShortArray7624;
    short[] aShortArray7625;
    short[] aShortArray7626;
    public static Class40_Sub17 aClass40_Sub17_7627;
    
    Class568(Class546 class546, int i, int i_0_, int i_1_, int i_2_, int i_3_,
	     int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
	     int i_10_, int i_11_, int i_12_) {
	aByte7615 = (byte) i;
	aByte7616 = (byte) i_0_;
	anIntArray7621 = new int[4];
	anIntArray7622 = new int[4];
	anIntArray7623 = new int[4];
	anIntArray7621[0] = i_1_;
	anIntArray7621[1] = i_2_;
	anIntArray7621[2] = i_3_;
	anIntArray7621[3] = i_4_;
	anIntArray7622[0] = i_5_;
	anIntArray7622[1] = i_6_;
	anIntArray7622[2] = i_7_;
	anIntArray7622[3] = i_8_;
	anIntArray7623[0] = i_9_;
	anIntArray7623[1] = i_10_;
	anIntArray7623[2] = i_11_;
	anIntArray7623[3] = i_12_;
	aShort7617 = (short) (i_1_ >> 1819515263 * class546.anInt7200);
	aShort7610 = (short) (i_3_ >> 1819515263 * class546.anInt7200);
	aShort7618 = (short) (i_9_ >> class546.anInt7200 * 1819515263);
	aShort7620 = (short) (i_11_ >> class546.anInt7200 * 1819515263);
	aShortArray7624 = new short[4];
	aShortArray7625 = new short[4];
	aShortArray7626 = new short[4];
    }
    
    static int method9491(char c, Class666 class666, int i) {
	int i_13_ = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i_13_ = 1 + (c << 4);
	}
	if (241 == c && class666 == Class666.aClass666_8564)
	    i_13_ = 1762;
	return i_13_;
    }
}
