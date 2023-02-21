/* Class525_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub14 extends Class525
{
    public static final int anInt10530 = 0;
    public static final int anInt10531 = 1;
    public static final int anInt10532 = 2;
    public static final int anInt10533 = 8;
    public static final int anInt10534 = 5;
    static final int anInt10535 = 6;
    public static final int anInt10536 = 7;
    public static final int anInt10537 = 3;
    public static final int anInt10538 = 9;
    boolean[] aBoolArray10539;
    int[][] anIntArrayArray10540;
    int anInt10541;
    int[] anIntArray10542;
    int anInt10543;
    public static final int anInt10544 = 10;
    int[] anIntArray10545;
    
    Class525_Sub14(int i, byte[] is) {
	anInt10543 = i * 1353287555;
	RSBuffer class525_sub38 = new RSBuffer(is);
	anInt10541 = class525_sub38.readUnsignedShort((byte) 56) * -988417263;
	anIntArray10542 = new int[anInt10541 * -92709391];
	anIntArrayArray10540 = new int[anInt10541 * -92709391][];
	aBoolArray10539 = new boolean[-92709391 * anInt10541];
	anIntArray10545 = new int[anInt10541 * -92709391];
	for (int i_0_ = 0; i_0_ < anInt10541 * -92709391; i_0_++) {
	    anIntArray10542[i_0_] = class525_sub38.readUnsignedByte(305789056);
	    if (6 == anIntArray10542[i_0_])
		anIntArray10542[i_0_] = 2;
	}
	for (int i_1_ = 0; i_1_ < anInt10541 * -92709391; i_1_++)
	    aBoolArray10539[i_1_]
		= class525_sub38.readUnsignedByte(1320053965) == 1;
	for (int i_2_ = 0; i_2_ < anInt10541 * -92709391; i_2_++)
	    anIntArray10545[i_2_] = class525_sub38.readUnsignedShort((byte) 82);
	for (int i_3_ = 0; i_3_ < anInt10541 * -92709391; i_3_++)
	    anIntArrayArray10540[i_3_]
		= new int[class525_sub38.method16740((byte) -74)];
	for (int i_4_ = 0; i_4_ < -92709391 * anInt10541; i_4_++) {
	    for (int i_5_ = 0; i_5_ < anIntArrayArray10540[i_4_].length;
		 i_5_++)
		anIntArrayArray10540[i_4_][i_5_]
		    = class525_sub38.method16740((byte) -37);
	}
    }
}
