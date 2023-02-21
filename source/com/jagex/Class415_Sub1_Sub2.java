/* Class415_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class415_Sub1_Sub2 extends Class415_Sub1
{
    byte[] aByteArray11620;
    
    byte[] method18197(int i, int i_0_, int i_1_) {
	aByteArray11620 = new byte[i * i_0_ * i_1_ * 2];
	method6695(i, i_0_, i_1_);
	return aByteArray11620;
    }
    
    Class415_Sub1_Sub2() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    void method15849(int i, byte i_2_) {
	int i_3_ = i * 2;
	int i_4_ = i_2_ & 0xff;
	aByteArray11620[i_3_++] = (byte) -1;
	aByteArray11620[i_3_] = (byte) (3 * i_4_ >> 5);
    }
    
    byte[] method18198(int i, int i_5_, int i_6_) {
	aByteArray11620 = new byte[i * i_5_ * i_6_ * 2];
	method6695(i, i_5_, i_6_);
	return aByteArray11620;
    }
    
    byte[] method18199(int i, int i_7_, int i_8_) {
	aByteArray11620 = new byte[i * i_7_ * i_8_ * 2];
	method6695(i, i_7_, i_8_);
	return aByteArray11620;
    }
    
    void method15848(int i, byte i_9_) {
	int i_10_ = i * 2;
	int i_11_ = i_9_ & 0xff;
	aByteArray11620[i_10_++] = (byte) -1;
	aByteArray11620[i_10_] = (byte) (3 * i_11_ >> 5);
    }
    
    byte[] method18200(int i, int i_12_, int i_13_) {
	aByteArray11620 = new byte[i * i_12_ * i_13_ * 2];
	method6695(i, i_12_, i_13_);
	return aByteArray11620;
    }
    
    void method15847(int i, byte i_14_) {
	int i_15_ = i * 2;
	int i_16_ = i_14_ & 0xff;
	aByteArray11620[i_15_++] = (byte) -1;
	aByteArray11620[i_15_] = (byte) (3 * i_16_ >> 5);
    }
    
    void method15846(int i, byte i_17_) {
	int i_18_ = i * 2;
	int i_19_ = i_17_ & 0xff;
	aByteArray11620[i_18_++] = (byte) -1;
	aByteArray11620[i_18_] = (byte) (3 * i_19_ >> 5);
    }
    
    byte[] method18201(int i, int i_20_, int i_21_) {
	aByteArray11620 = new byte[i * i_20_ * i_21_ * 2];
	method6695(i, i_20_, i_21_);
	return aByteArray11620;
    }
}
