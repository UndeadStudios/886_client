/* Class541 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class541
{
    int anInt7187;
    Class320[] aClass320Array7188;
    Class320[] aClass320Array7189;
    short[] aShortArray7190;
    Class320 aClass320_7191;
    Class526 this$0;
    static int anInt7192;
    static int anInt7193;
    
    void method8893(int i, int i_0_) {
	for (/**/; anInt7187 * -1860887297 < i; anInt7187 += 1688331007) {
	    aClass320Array7188[-1860887297 * anInt7187] = new Class320(3);
	    aClass320Array7189[anInt7187 * -1860887297] = new Class320(3);
	}
    }
    
    void method8894(int i) {
	for (/**/; anInt7187 * -1860887297 < i; anInt7187 += 1688331007) {
	    aClass320Array7188[-1860887297 * anInt7187] = new Class320(3);
	    aClass320Array7189[anInt7187 * -1860887297] = new Class320(3);
	}
    }
    
    Class541(Class526 class526) {
	this$0 = class526;
	aShortArray7190 = new short[2];
	aClass320Array7188 = new Class320[16];
	aClass320Array7189 = new Class320[16];
	aClass320_7191 = new Class320(8);
	anInt7187 = 0;
    }
    
    void method8895(int i) {
	Class28.method906(aShortArray7190, 1999352653);
	for (int i_1_ = 0; i_1_ < anInt7187 * -1860887297; i_1_++) {
	    aClass320Array7188[i_1_].method5705((byte) 71);
	    aClass320Array7189[i_1_].method5705((byte) 100);
	}
	aClass320_7191.method5705((byte) 101);
    }
    
    void method8896(int i) {
	for (/**/; anInt7187 * -1860887297 < i; anInt7187 += 1688331007) {
	    aClass320Array7188[-1860887297 * anInt7187] = new Class320(3);
	    aClass320Array7189[anInt7187 * -1860887297] = new Class320(3);
	}
    }
    
    int method8897(Class334 class334, int i, byte i_2_) throws IOException {
	if (class334.method5829(aShortArray7190, 0, (byte) 38) == 0)
	    return aClass320Array7188[i].method5708(class334, 1612554526);
	int i_3_ = 8;
	if (class334.method5829(aShortArray7190, 1, (byte) -56) == 0)
	    i_3_ += aClass320Array7189[i].method5708(class334, 1545582720);
	else
	    i_3_ += 8 + aClass320_7191.method5708(class334, 84903383);
	return i_3_;
    }
    
    void method8898(int i) {
	for (/**/; anInt7187 * -1860887297 < i; anInt7187 += 1688331007) {
	    aClass320Array7188[-1860887297 * anInt7187] = new Class320(3);
	    aClass320Array7189[anInt7187 * -1860887297] = new Class320(3);
	}
    }
    
    void method8899() {
	Class28.method906(aShortArray7190, 1983817476);
	for (int i = 0; i < anInt7187 * -1860887297; i++) {
	    aClass320Array7188[i].method5705((byte) 27);
	    aClass320Array7189[i].method5705((byte) 44);
	}
	aClass320_7191.method5705((byte) 97);
    }
    
    int method8900(Class334 class334, int i) throws IOException {
	if (class334.method5829(aShortArray7190, 0, (byte) 2) == 0)
	    return aClass320Array7188[i].method5708(class334, 1414441035);
	int i_4_ = 8;
	if (class334.method5829(aShortArray7190, 1, (byte) 68) == 0)
	    i_4_ += aClass320Array7189[i].method5708(class334, 1803029148);
	else
	    i_4_ += 8 + aClass320_7191.method5708(class334, -224019256);
	return i_4_;
    }
    
    public static TwitchWebcamDevice method8901(int i, int i_5_) {
	if (Class589.aTwitchWebcamDeviceArray7803 == null)
	    return null;
	for (int i_6_ = 0; i_6_ < Class589.aTwitchWebcamDeviceArray7803.length;
	     i_6_++) {
	    if ((-1577362963
		 * Class589.aTwitchWebcamDeviceArray7803[i_6_].anInt1150)
		== i)
		return Class589.aTwitchWebcamDeviceArray7803[i_6_];
	}
	return null;
    }
}
