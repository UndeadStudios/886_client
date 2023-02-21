/* Class553 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class553
{
    int anInt7411;
    int anInt7412;
    int anInt7413;
    int anInt7414;
    int anInt7415;
    int anInt7416;
    int anInt7417;
    int anInt7418;
    int anInt7419;
    int anInt7420;
    
    public boolean method9168(int i, int i_0_, int i_1_) {
	if (i < anInt7415 || i > anInt7418)
	    return false;
	if (i_0_ < anInt7417 || i_0_ > anInt7416)
	    return false;
	if (i_1_ < anInt7411 || i_1_ > anInt7420)
	    return false;
	int i_2_ = i - anInt7412;
	int i_3_ = i_1_ - anInt7413;
	return i_2_ * i_2_ + i_3_ * i_3_ < anInt7414;
    }
    
    Class553(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
	     int i_10_, int i_11_, int i_12_) {
	anInt7412 = i;
	anInt7419 = i_4_;
	anInt7413 = i_5_;
	anInt7414 = i_6_ * i_6_;
	anInt7415 = anInt7412 + i_7_;
	anInt7418 = anInt7412 + i_8_;
	anInt7417 = anInt7419 + i_9_;
	anInt7416 = anInt7419 + i_10_;
	anInt7411 = anInt7413 + i_11_;
	anInt7420 = anInt7413 + i_12_;
    }
    
    void method9169(int i, int i_13_, int i_14_, int i_15_, int i_16_,
		    int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
	anInt7412 = i;
	anInt7419 = i_13_;
	anInt7413 = i_14_;
	anInt7414 = i_15_ * i_15_;
	anInt7415 = anInt7412 + i_16_;
	anInt7418 = anInt7412 + i_17_;
	anInt7417 = anInt7419 + i_18_;
	anInt7416 = anInt7419 + i_19_;
	anInt7411 = anInt7413 + i_20_;
	anInt7420 = anInt7413 + i_21_;
    }
    
    void method9170(int i, int i_22_, int i_23_, int i_24_, int i_25_,
		    int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
	anInt7412 = i;
	anInt7419 = i_22_;
	anInt7413 = i_23_;
	anInt7414 = i_24_ * i_24_;
	anInt7415 = anInt7412 + i_25_;
	anInt7418 = anInt7412 + i_26_;
	anInt7417 = anInt7419 + i_27_;
	anInt7416 = anInt7419 + i_28_;
	anInt7411 = anInt7413 + i_29_;
	anInt7420 = anInt7413 + i_30_;
    }
}
