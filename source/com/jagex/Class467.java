/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.math.BigInteger;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class467
{
    Class473[] aClass473Array5125;
    
    Class467(RSBuffer class525_sub38, BigInteger biginteger,
			 BigInteger biginteger_0_) {
	class525_sub38.index = 1697142355;
	int i = class525_sub38.readUnsignedByte(1228405227);
	class525_sub38.index += 1384473904 * i;
	byte[] is = new byte[(class525_sub38.buffer.length
			      - -1133521593 * class525_sub38.index)];
	class525_sub38.readBytes(is, 0, is.length, 1881640069);
	byte[] is_1_;
	if (null == biginteger || biginteger_0_ == null)
	    is_1_ = is;
	else {
	    BigInteger biginteger_2_ = new BigInteger(is);
	    BigInteger biginteger_3_
		= biginteger_2_.modPow(biginteger, biginteger_0_);
	    is_1_ = biginteger_3_.toByteArray();
	}
	if (65 != is_1_.length)
	    throw new RuntimeException();
	byte[] is_4_
	    = Class510.method8505(class525_sub38.buffer, 5,
				  (class525_sub38.index * -1133521593
				   - is.length - 5),
				  (byte) -36);
	for (int i_5_ = 0; i_5_ < 64; i_5_++) {
	    if (is_1_[i_5_ + 1] != is_4_[i_5_])
		throw new RuntimeException();
	}
	aClass473Array5125 = new Class473[i];
	for (int i_6_ = 0; i_6_ < i; i_6_++) {
	    class525_sub38.index = i_6_ * 1384473904 + 2036570826;
	    int i_7_ = class525_sub38.readInt(1685313421);
	    int i_8_ = class525_sub38.readInt(1281099651);
	    int i_9_ = class525_sub38.readInt(1369225616);
	    int i_10_ = class525_sub38.readInt(1757750791);
	    byte[] is_11_ = new byte[64];
	    class525_sub38.readBytes(is_11_, 0, 64, 65326539);
	    aClass473Array5125[i_6_]
		= new Class473(i_7_, i_9_, i_8_, i_10_, is_11_);
	}
    }
    
    public static TwitchWebcamDevice method7696(String string, byte i) {
	if (Class589.aTwitchWebcamDeviceArray7803 == null)
	    return null;
	for (int i_12_ = 0;
	     i_12_ < Class589.aTwitchWebcamDeviceArray7803.length; i_12_++) {
	    if (Class589.aTwitchWebcamDeviceArray7803[i_12_].aString1148
		    .equals(string))
		return Class589.aTwitchWebcamDeviceArray7803[i_12_];
	}
	return null;
    }
    
    public static void method7697(short i) {
	Class696_Sub21.method17172(-851439741);
    }
    
    static final void method7698(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.anInt2619
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * 52389997;
	Class649.method10708(class259, (byte) 0);
    }
    
    static final void method7699(Class683 class683, byte i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub17_10676,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]) == 1 ? 1 : 0,
	     (byte) -67);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
}
