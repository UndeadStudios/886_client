/* Class415_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class415_Sub2_Sub2 extends Class415_Sub2
{
    byte[] aByteArray11577;
    
    Class415_Sub2_Sub2() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    byte[] method18183(int i, int i_0_, int i_1_) {
	aByteArray11577 = new byte[i * i_0_ * i_1_ * 2];
	method6695(i, i_0_, i_1_);
	return aByteArray11577;
    }
    
    byte[] method18184(int i, int i_2_, int i_3_) {
	aByteArray11577 = new byte[i * i_2_ * i_3_ * 2];
	method6695(i, i_2_, i_3_);
	return aByteArray11577;
    }
    
    void method15890(int i, byte i_4_) {
	int i_5_ = i * 2;
	i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
	aByteArray11577[i_5_++] = i_4_;
	aByteArray11577[i_5_] = i_4_;
    }
    
    void method15889(int i, byte i_6_) {
	int i_7_ = i * 2;
	i_6_ = (byte) (127 + ((i_6_ & 0xff) >> 1));
	aByteArray11577[i_7_++] = i_6_;
	aByteArray11577[i_7_] = i_6_;
    }
}
