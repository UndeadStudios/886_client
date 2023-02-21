/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class242
{
    Class242() throws Throwable {
	throw new Error();
    }
    
    public static final void method4441(long l) {
	if (l > 0L) {
	    if (0L == l % 10L) {
		Class78.method1573(l - 1L);
		Class78.method1573(1L);
	    } else
		Class78.method1573(l);
	}
    }
    
    static final void method4442(long l) {
	try {
	    Thread.sleep(l);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static final void method4443(long l) {
	try {
	    Thread.sleep(l);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static final void method4444(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class245.method4483(i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff, (byte) 1);
    }
    
    static final void method4445(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class311.method5632(class259, class245, class683, 1809721296);
    }
    
    public static int method4446(int i, int i_1_, int i_2_, int i_3_) {
	int i_4_ = Class294.method5312(1 + (i_2_ - i_1_), (byte) 0);
	i_4_ <<= i_1_;
	i |= i_4_;
	return i;
    }
    
    static final void method4447(Class683 class683, int i) {
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (2 == client.anInt11362 * 1819257147
	    && i_5_ < client.anInt11204 * -883281325)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= client.aClass66Array11356[i_5_].aString714;
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
    }
    
    static boolean method4448(byte i) {
	client.anInt11134 += -314148941;
	client.aBool11135 = true;
	return true;
    }
    
    public static void method4449(Class578 class578, int i, int i_6_,
				  Interface62 interface62, int i_7_) {
	Class683 class683 = Class457.method7468(-485786200);
	class683.anInterface62_8655 = interface62;
	Class587.method9691(class578, i, i_6_, class683, (byte) 37);
	class683.anInterface62_8655 = null;
    }
    
    static float method4450(float f, float f_8_, float f_9_, float f_10_,
			    float f_11_, float f_12_, int i, int i_13_) {
	float f_14_ = 0.0F;
	float f_15_ = f_10_ - f;
	float f_16_ = f_11_ - f_8_;
	float f_17_ = f_12_ - f_9_;
	float f_18_ = 0.0F;
	float f_19_ = 0.0F;
	float f_20_ = 0.0F;
	Class546 class546 = client.aClass507_11137.method8358((byte) 127);
	for (/**/; f_14_ < 1.1F; f_14_ += 0.1F) {
	    float f_21_ = f_14_ * f_15_ + f;
	    float f_22_ = f_14_ * f_16_ + f_8_;
	    float f_23_ = f_9_ + f_17_ * f_14_;
	    int i_24_ = (int) f_21_ >> 9;
	    int i_25_ = (int) f_23_ >> 9;
	    if (i_24_ > 0 && i_25_ > 0
		&& i_24_ < client.aClass507_11137.method8412(1085524906)
		&& i_25_ < client.aClass507_11137.method8352((byte) -100)) {
		int i_26_
		    = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867;
		if (i_26_ < 3
		    && ((client.aClass507_11137.method8360(1369673333)
			 .aByteArrayArrayArray5178[1][i_24_][i_25_])
			& 0x2) != 0)
		    i_26_++;
		int i_27_
		    = class546.aClass161Array7215[i_26_]
			  .method2619((int) f_21_, (int) f_23_, 1484482045);
		if ((float) i_27_ < f_22_) {
		    if (i >= 2)
			return (f_14_ - 0.1F
				+ (method4450(f_18_, f_19_, f_20_, f_21_,
					      f_22_, f_23_, i - 1, -2094234173)
				   * 0.1F));
		    return f_14_;
		}
	    }
	    f_18_ = f_21_;
	    f_19_ = f_22_;
	    f_20_ = f_23_;
	}
	return -1.0F;
    }
}
