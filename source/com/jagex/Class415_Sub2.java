/* Class415_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class415_Sub2 extends Class415
{
    int anInt10291;
    int anInt10292;
    byte[] aByteArray10293;
    int[] anIntArray10294 = new int[anInt4420];
    
    void method6698(int i, int i_0_) {
	anInt10291 += i_0_ * anIntArray10294[i] >> 12;
    }
    
    void method15889(int i, byte i_1_) {
	aByteArray10293[anInt10292++] = (byte) (127 + ((i_1_ & 0xff) >> 1));
    }
    
    void method6696() {
	anInt10292 = 0;
	anInt10291 = 0;
    }
    
    void method6710() {
	anInt10291 = Math.abs(anInt10291);
	if (anInt10291 >= 4096)
	    anInt10291 = 4095;
	method15889(anInt10292++, (byte) (anInt10291 >> 4));
	anInt10291 = 0;
    }
    
    Class415_Sub2(int i, int i_2_, int i_3_, int i_4_, int i_5_, float f) {
	super(i, i_2_, i_3_, i_4_, i_5_);
	for (int i_6_ = 0; i_6_ < anInt4420; i_6_++)
	    anIntArray10294[i_6_]
		= (short) (int) (Math.pow((double) f, (double) i_6_) * 4096.0);
    }
    
    void method15890(int i, byte i_7_) {
	aByteArray10293[anInt10292++] = (byte) (127 + ((i_7_ & 0xff) >> 1));
    }
    
    void method6706() {
	anInt10292 = 0;
	anInt10291 = 0;
    }
    
    void method6707() {
	anInt10292 = 0;
	anInt10291 = 0;
    }
    
    void method6708() {
	anInt10291 = Math.abs(anInt10291);
	if (anInt10291 >= 4096)
	    anInt10291 = 4095;
	method15889(anInt10292++, (byte) (anInt10291 >> 4));
	anInt10291 = 0;
    }
    
    void method6709(int i, int i_8_) {
	anInt10291 += i_8_ * anIntArray10294[i] >> 12;
    }
}
