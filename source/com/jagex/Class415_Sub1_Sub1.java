/* Class415_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class415_Sub1_Sub1 extends Class415_Sub1
{
    byte[] aByteArray11576;
    
    void method15846(int i, byte i_0_) {
	int i_1_ = i * 2;
	int i_2_ = i_0_ & 0xff;
	aByteArray11576[i_1_++] = (byte) (3 * i_2_ >> 5);
	aByteArray11576[i_1_] = (byte) (3 * i_2_ >> 5);
    }
    
    byte[] method18181(int i, int i_3_, int i_4_) {
	aByteArray11576 = new byte[i * i_3_ * i_4_ * 2];
	method6695(i, i_3_, i_4_);
	return aByteArray11576;
    }
    
    void method15849(int i, byte i_5_) {
	int i_6_ = i * 2;
	int i_7_ = i_5_ & 0xff;
	aByteArray11576[i_6_++] = (byte) (3 * i_7_ >> 5);
	aByteArray11576[i_6_] = (byte) (3 * i_7_ >> 5);
    }
    
    byte[] method18182(int i, int i_8_, int i_9_) {
	aByteArray11576 = new byte[i * i_8_ * i_9_ * 2];
	method6695(i, i_8_, i_9_);
	return aByteArray11576;
    }
    
    void method15847(int i, byte i_10_) {
	int i_11_ = i * 2;
	int i_12_ = i_10_ & 0xff;
	aByteArray11576[i_11_++] = (byte) (3 * i_12_ >> 5);
	aByteArray11576[i_11_] = (byte) (3 * i_12_ >> 5);
    }
    
    Class415_Sub1_Sub1() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    void method15848(int i, byte i_13_) {
	int i_14_ = i * 2;
	int i_15_ = i_13_ & 0xff;
	aByteArray11576[i_14_++] = (byte) (3 * i_15_ >> 5);
	aByteArray11576[i_14_] = (byte) (3 * i_15_ >> 5);
    }
}
