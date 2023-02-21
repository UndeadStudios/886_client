/* Class415_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class415_Sub2_Sub1 extends Class415_Sub2
{
    byte[] aByteArray11574;
    
    void method15889(int i, byte i_0_) {
	int i_1_ = i * 2;
	i_0_ = (byte) (127 + ((i_0_ & 0xff) >> 1));
	aByteArray11574[i_1_++] = i_0_;
	aByteArray11574[i_1_] = i_0_;
    }
    
    byte[] method18174(int i, int i_2_, int i_3_) {
	aByteArray11574 = new byte[i * i_2_ * i_3_ * 2];
	method6695(i, i_2_, i_3_);
	return aByteArray11574;
    }
    
    byte[] method18175(int i, int i_4_, int i_5_) {
	aByteArray11574 = new byte[i * i_4_ * i_5_ * 2];
	method6695(i, i_4_, i_5_);
	return aByteArray11574;
    }
    
    byte[] method18176(int i, int i_6_, int i_7_) {
	aByteArray11574 = new byte[i * i_6_ * i_7_ * 2];
	method6695(i, i_6_, i_7_);
	return aByteArray11574;
    }
    
    Class415_Sub2_Sub1() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    void method15890(int i, byte i_8_) {
	int i_9_ = i * 2;
	i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
	aByteArray11574[i_9_++] = i_8_;
	aByteArray11574[i_9_] = i_8_;
    }
}
