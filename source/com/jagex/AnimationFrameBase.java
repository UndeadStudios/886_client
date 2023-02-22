/* Class525_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class AnimationFrameBase extends Class525
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
    int[][] labels;
    int count;
    int[] transformationTypes;
    int id;
    public static final int anInt10544 = 10;
    int[] anIntArray10545;
    
    AnimationFrameBase(int i, byte[] is) {
	id = i * 1353287555;
	RSBuffer class525_sub38 = new RSBuffer(is);
	count = class525_sub38.readUnsignedShort((byte) 56) * -988417263;
	transformationTypes = new int[count * -92709391];
	labels = new int[count * -92709391][];
	aBoolArray10539 = new boolean[-92709391 * count];
	anIntArray10545 = new int[count * -92709391];
	for (int i_0_ = 0; i_0_ < count * -92709391; i_0_++) {
	    transformationTypes[i_0_] = class525_sub38.readUnsignedByte(305789056);
	    if (6 == transformationTypes[i_0_])
		transformationTypes[i_0_] = 2;
	}
	for (int i_1_ = 0; i_1_ < count * -92709391; i_1_++)
	    aBoolArray10539[i_1_]
		= class525_sub38.readUnsignedByte(1320053965) == 1;
	for (int i_2_ = 0; i_2_ < count * -92709391; i_2_++)
	    anIntArray10545[i_2_] = class525_sub38.readUnsignedShort((byte) 82);
	for (int i_3_ = 0; i_3_ < count * -92709391; i_3_++)
	    labels[i_3_]
		= new int[class525_sub38.readUnsignedSmart((byte) -74)];
	for (int i_4_ = 0; i_4_ < -92709391 * count; i_4_++) {
	    for (int i_5_ = 0; i_5_ < labels[i_4_].length;
		 i_5_++)
		labels[i_4_][i_5_]
		    = class525_sub38.readUnsignedSmart((byte) -37);
	}
    }
}
