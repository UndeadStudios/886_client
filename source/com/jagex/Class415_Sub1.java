/* Class415_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class415_Sub1 extends Class415
{
    int anInt10209;
    byte[] aByteArray10210;
    int anInt10211;
    int anInt10212;
    int anInt10213;
    int anInt10214;
    int anInt10215;
    int anInt10216;
    int anInt10217;
    
    void method6709(int i, int i_0_) {
	if (i != 0) {
	    anInt10211 = anInt10214 * anInt10215 >> 12;
	    if (anInt10211 < 0)
		anInt10211 = 0;
	    else if (anInt10211 > 4096)
		anInt10211 = 4096;
	    anInt10214 = anInt10216 - (i_0_ < 0 ? -i_0_ : i_0_);
	    anInt10214 = anInt10214 * anInt10214 >> 12;
	    anInt10214 = anInt10214 * anInt10211 >> 12;
	    anInt10209 += anInt10214 * anInt10217 >> 12;
	    anInt10217 = anInt10217 * anInt10212 >> 12;
	} else {
	    anInt10214 = anInt10216 - (i_0_ < 0 ? -i_0_ : i_0_);
	    anInt10214 = anInt10214 * anInt10214 >> 12;
	    anInt10211 = 4096;
	    anInt10209 = anInt10214;
	}
    }
    
    void method15846(int i, byte i_1_) {
	aByteArray10210[i] = i_1_;
    }
    
    void method6698(int i, int i_2_) {
	if (i != 0) {
	    anInt10211 = anInt10214 * anInt10215 >> 12;
	    if (anInt10211 < 0)
		anInt10211 = 0;
	    else if (anInt10211 > 4096)
		anInt10211 = 4096;
	    anInt10214 = anInt10216 - (i_2_ < 0 ? -i_2_ : i_2_);
	    anInt10214 = anInt10214 * anInt10214 >> 12;
	    anInt10214 = anInt10214 * anInt10211 >> 12;
	    anInt10209 += anInt10214 * anInt10217 >> 12;
	    anInt10217 = anInt10217 * anInt10212 >> 12;
	} else {
	    anInt10214 = anInt10216 - (i_2_ < 0 ? -i_2_ : i_2_);
	    anInt10214 = anInt10214 * anInt10214 >> 12;
	    anInt10211 = 4096;
	    anInt10209 = anInt10214;
	}
    }
    
    void method6710() {
	anInt10217 = anInt10212;
	anInt10209 >>= 4;
	if (anInt10209 < 0)
	    anInt10209 = 0;
	else if (anInt10209 > 255)
	    anInt10209 = 255;
	method15849(anInt10213++, (byte) anInt10209);
	anInt10209 = 0;
    }
    
    void method6696() {
	anInt10213 = 0;
	anInt10209 = 0;
    }
    
    void method15847(int i, byte i_3_) {
	aByteArray10210[i] = i_3_;
    }
    
    void method15848(int i, byte i_4_) {
	aByteArray10210[i] = i_4_;
    }
    
    void method15849(int i, byte i_5_) {
	aByteArray10210[i] = i_5_;
    }
    
    void method6706() {
	anInt10213 = 0;
	anInt10209 = 0;
    }
    
    void method6707() {
	anInt10213 = 0;
	anInt10209 = 0;
    }
    
    void method6708() {
	anInt10217 = anInt10212;
	anInt10209 >>= 4;
	if (anInt10209 < 0)
	    anInt10209 = 0;
	else if (anInt10209 > 255)
	    anInt10209 = 255;
	method15849(anInt10213++, (byte) anInt10209);
	anInt10209 = 0;
    }
    
    Class415_Sub1(int i, int i_6_, int i_7_, int i_8_, int i_9_, float f,
		  float f_10_, float f_11_) {
	super(i, i_6_, i_7_, i_8_, i_9_);
	anInt10215 = (int) (f_11_ * 4096.0F);
	anInt10216 = (int) (f_10_ * 4096.0F);
	anInt10217 = anInt10212 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
    }
}
