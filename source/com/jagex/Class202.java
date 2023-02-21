/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class202
{
    int[] anIntArray2215;
    int[] anIntArray2216;
    int[] anIntArray2217;
    int[] anIntArray2218;
    int[] anIntArray2219;
    int[] anIntArray2220;
    int[] anIntArray2221;
    protected static Class4 aClass4_2222;
    
    void method3847(int i, int i_0_) {
	int[][] is = new int[anIntArray2216.length << 1][4];
	for (int i_1_ = 0; i_1_ < anIntArray2216.length; i_1_++) {
	    is[i_1_ * 2][0] = anIntArray2216[i_1_];
	    is[i_1_ * 2][1] = anIntArray2218[i_1_];
	    is[i_1_ * 2][2] = anIntArray2217[i_1_];
	    is[2 * i_1_][3] = anIntArray2215[i_1_];
	    is[1 + i_1_ * 2][0] = anIntArray2219[i_1_];
	    is[2 * i_1_ + 1][1] = anIntArray2220[i_1_];
	    is[1 + i_1_ * 2][2] = anIntArray2221[i_1_];
	    is[i_1_ * 2 + 1][3] = anIntArray2215[i_1_];
	}
	client.anIntArrayArrayArray11188[i] = is;
    }
    
    void method3848(int i) {
	int[][] is = new int[anIntArray2216.length << 1][4];
	for (int i_2_ = 0; i_2_ < anIntArray2216.length; i_2_++) {
	    is[i_2_ * 2][0] = anIntArray2216[i_2_];
	    is[i_2_ * 2][1] = anIntArray2218[i_2_];
	    is[i_2_ * 2][2] = anIntArray2217[i_2_];
	    is[2 * i_2_][3] = anIntArray2215[i_2_];
	    is[1 + i_2_ * 2][0] = anIntArray2219[i_2_];
	    is[2 * i_2_ + 1][1] = anIntArray2220[i_2_];
	    is[1 + i_2_ * 2][2] = anIntArray2221[i_2_];
	    is[i_2_ * 2 + 1][3] = anIntArray2215[i_2_];
	}
	client.anIntArrayArrayArray11188[i] = is;
    }
    
    void method3849(int i) {
	int[][] is = new int[anIntArray2216.length << 1][4];
	for (int i_3_ = 0; i_3_ < anIntArray2216.length; i_3_++) {
	    is[i_3_ * 2][0] = anIntArray2216[i_3_];
	    is[i_3_ * 2][1] = anIntArray2218[i_3_];
	    is[i_3_ * 2][2] = anIntArray2217[i_3_];
	    is[2 * i_3_][3] = anIntArray2215[i_3_];
	    is[1 + i_3_ * 2][0] = anIntArray2219[i_3_];
	    is[2 * i_3_ + 1][1] = anIntArray2220[i_3_];
	    is[1 + i_3_ * 2][2] = anIntArray2221[i_3_];
	    is[i_3_ * 2 + 1][3] = anIntArray2215[i_3_];
	}
	client.anIntArrayArrayArray11188[i] = is;
    }
    
    Class202(RSBuffer class525_sub38) {
	int i = class525_sub38.method16740((byte) -32);
	anIntArray2216 = new int[i];
	anIntArray2218 = new int[i];
	anIntArray2217 = new int[i];
	anIntArray2215 = new int[i];
	anIntArray2219 = new int[i];
	anIntArray2220 = new int[i];
	anIntArray2221 = new int[i];
	for (int i_4_ = 0; i_4_ < i; i_4_++) {
	    anIntArray2216[i_4_]
		= class525_sub38.readUnsignedShort((byte) 117) - 5120;
	    anIntArray2217[i_4_]
		= class525_sub38.readUnsignedShort((byte) 90) - 5120;
	    anIntArray2218[i_4_] = class525_sub38.method16625((byte) -22);
	    anIntArray2219[i_4_]
		= class525_sub38.readUnsignedShort((byte) 33) - 5120;
	    anIntArray2221[i_4_]
		= class525_sub38.readUnsignedShort((byte) 76) - 5120;
	    anIntArray2220[i_4_] = class525_sub38.method16625((byte) 31);
	    anIntArray2215[i_4_] = class525_sub38.method16625((byte) 0);
	}
    }
    
    void method3850(int i) {
	int[][] is = new int[anIntArray2216.length << 1][4];
	for (int i_5_ = 0; i_5_ < anIntArray2216.length; i_5_++) {
	    is[i_5_ * 2][0] = anIntArray2216[i_5_];
	    is[i_5_ * 2][1] = anIntArray2218[i_5_];
	    is[i_5_ * 2][2] = anIntArray2217[i_5_];
	    is[2 * i_5_][3] = anIntArray2215[i_5_];
	    is[1 + i_5_ * 2][0] = anIntArray2219[i_5_];
	    is[2 * i_5_ + 1][1] = anIntArray2220[i_5_];
	    is[1 + i_5_ * 2][2] = anIntArray2221[i_5_];
	    is[i_5_ * 2 + 1][3] = anIntArray2215[i_5_];
	}
	client.anIntArrayArrayArray11188[i] = is;
    }
    
    public static void method3851(int[] is, Object[] objects, int i) {
	Class288.method5260(is, objects, 0, is.length - 1, (byte) 34);
    }
    
    public static void method3852(int i, String string, byte i_6_) {
	Class240.method4427(i, 0, "", "", "", string, null, -1045851655);
    }
    
    public static final void method3853(int i, byte i_7_) {
	for (int i_8_ = 0; i_8_ < 5; i_8_++)
	    client.aBoolArray11343[i_8_] = false;
	client.anInt11189 = 412741933;
	client.anInt11191 = -912399317;
	Class28.anInt284 = 0;
	Class585.anInt7725 = 0;
	Class648.anInt8363 = -1945230309;
	Class198_Sub3.anInt9911 = 56698409;
	Class700.anInt8779 = 222998419 * i;
	if (5 != Class700.anInt8779 * -174799205)
	    Class332_Sub1.aLong10010 = 0L;
    }
}
