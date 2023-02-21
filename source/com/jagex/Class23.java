/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class23 implements Interface12, Interface7
{
    public int anInt218;
    public int anInt219;
    public int anInt220;
    public boolean aBool221;
    public int anInt222;
    int anInt223 = 0;
    public boolean aBool224;
    public int anInt225;
    public int anInt226;
    
    public void method69() {
	/* empty */
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(951683938);
	    if (0 == i_0_)
		break;
	    method822(class525_sub38, i_0_, -915105175);
	}
    }
    
    void method822(RSBuffer class525_sub38, int i, int i_1_) {
	if (i == 1) {
	    anInt223 = class525_sub38.method16834(-1994884458) * -2039286103;
	    method823(anInt223 * -2027680359, 808747529);
	} else if (i == 2) {
	    anInt219 = class525_sub38.readUnsignedShort((byte) 87) * -1675517103;
	    if (-1990883919 * anInt219 == 65535)
		anInt219 = 1675517103;
	} else if (i == 3)
	    anInt220
		= (class525_sub38.readUnsignedShort((byte) 67) << 2) * 718537863;
	else if (i == 4)
	    aBool221 = false;
	else if (5 == i)
	    aBool224 = false;
    }
    
    Class23() {
	anInt219 = 1675517103;
	anInt220 = -1475801600;
	aBool221 = true;
	aBool224 = true;
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    public void method54(int i, byte i_2_) {
	/* empty */
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(909382690);
	    if (0 == i)
		break;
	    method822(class525_sub38, i, -461878592);
	}
    }
    
    void method823(int i, int i_3_) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_4_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_5_ = (double) (i & 0xff) / 256.0;
	double d_6_ = d;
	if (d_4_ < d_6_)
	    d_6_ = d_4_;
	if (d_5_ < d_6_)
	    d_6_ = d_5_;
	double d_7_ = d;
	if (d_4_ > d_7_)
	    d_7_ = d_4_;
	if (d_5_ > d_7_)
	    d_7_ = d_5_;
	double d_8_ = 0.0;
	double d_9_ = 0.0;
	double d_10_ = (d_6_ + d_7_) / 2.0;
	if (d_7_ != d_6_) {
	    if (d_10_ < 0.5)
		d_9_ = (d_7_ - d_6_) / (d_7_ + d_6_);
	    if (d_10_ >= 0.5)
		d_9_ = (d_7_ - d_6_) / (2.0 - d_7_ - d_6_);
	    if (d_7_ == d)
		d_8_ = (d_4_ - d_5_) / (d_7_ - d_6_);
	    else if (d_4_ == d_7_)
		d_8_ = 2.0 + (d_5_ - d) / (d_7_ - d_6_);
	    else if (d_7_ == d_5_)
		d_8_ = (d - d_4_) / (d_7_ - d_6_) + 4.0;
	}
	d_8_ /= 6.0;
	anInt218 = -731663077 * (int) (256.0 * d_9_);
	anInt225 = -1061502717 * (int) (256.0 * d_10_);
	if (337157395 * anInt218 < 0)
	    anInt218 = 0;
	else if (337157395 * anInt218 > 255)
	    anInt218 = -1890490907;
	if (anInt225 * 1486533035 < 0)
	    anInt225 = 0;
	else if (1486533035 * anInt225 > 255)
	    anInt225 = -100253187;
	if (d_10_ > 0.5)
	    anInt226 = 1793800249 * (int) (512.0 * ((1.0 - d_10_) * d_9_));
	else
	    anInt226 = 1793800249 * (int) (512.0 * (d_10_ * d_9_));
	if (-1462290935 * anInt226 < 1)
	    anInt226 = 1793800249;
	anInt222
	    = (int) (d_8_ * (double) (-1462290935 * anInt226)) * -1220327677;
    }
    
    public void method70() {
	/* empty */
    }
    
    public void method53(int i) {
	/* empty */
    }
    
    void method824(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    anInt223 = class525_sub38.method16834(-1994884458) * -2039286103;
	    method823(anInt223 * -2027680359, 808747529);
	} else if (i == 2) {
	    anInt219 = class525_sub38.readUnsignedShort((byte) 5) * -1675517103;
	    if (-1990883919 * anInt219 == 65535)
		anInt219 = 1675517103;
	} else if (i == 3)
	    anInt220
		= (class525_sub38.readUnsignedShort((byte) 14) << 2) * 718537863;
	else if (i == 4)
	    aBool221 = false;
	else if (5 == i)
	    aBool224 = false;
    }
    
    void method825(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    anInt223 = class525_sub38.method16834(-1994884458) * -2039286103;
	    method823(anInt223 * -2027680359, 808747529);
	} else if (i == 2) {
	    anInt219 = class525_sub38.readUnsignedShort((byte) 100) * -1675517103;
	    if (-1990883919 * anInt219 == 65535)
		anInt219 = 1675517103;
	} else if (i == 3)
	    anInt220
		= (class525_sub38.readUnsignedShort((byte) 42) << 2) * 718537863;
	else if (i == 4)
	    aBool221 = false;
	else if (5 == i)
	    aBool224 = false;
    }
    
    void method826(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_11_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_12_ = (double) (i & 0xff) / 256.0;
	double d_13_ = d;
	if (d_11_ < d_13_)
	    d_13_ = d_11_;
	if (d_12_ < d_13_)
	    d_13_ = d_12_;
	double d_14_ = d;
	if (d_11_ > d_14_)
	    d_14_ = d_11_;
	if (d_12_ > d_14_)
	    d_14_ = d_12_;
	double d_15_ = 0.0;
	double d_16_ = 0.0;
	double d_17_ = (d_13_ + d_14_) / 2.0;
	if (d_14_ != d_13_) {
	    if (d_17_ < 0.5)
		d_16_ = (d_14_ - d_13_) / (d_14_ + d_13_);
	    if (d_17_ >= 0.5)
		d_16_ = (d_14_ - d_13_) / (2.0 - d_14_ - d_13_);
	    if (d_14_ == d)
		d_15_ = (d_11_ - d_12_) / (d_14_ - d_13_);
	    else if (d_11_ == d_14_)
		d_15_ = 2.0 + (d_12_ - d) / (d_14_ - d_13_);
	    else if (d_14_ == d_12_)
		d_15_ = (d - d_11_) / (d_14_ - d_13_) + 4.0;
	}
	d_15_ /= 6.0;
	anInt218 = -731663077 * (int) (256.0 * d_16_);
	anInt225 = -1061502717 * (int) (256.0 * d_17_);
	if (337157395 * anInt218 < 0)
	    anInt218 = 0;
	else if (337157395 * anInt218 > 255)
	    anInt218 = -1890490907;
	if (anInt225 * 1486533035 < 0)
	    anInt225 = 0;
	else if (1486533035 * anInt225 > 255)
	    anInt225 = -100253187;
	if (d_17_ > 0.5)
	    anInt226 = 1793800249 * (int) (512.0 * ((1.0 - d_17_) * d_16_));
	else
	    anInt226 = 1793800249 * (int) (512.0 * (d_17_ * d_16_));
	if (-1462290935 * anInt226 < 1)
	    anInt226 = 1793800249;
	anInt222
	    = (int) (d_15_ * (double) (-1462290935 * anInt226)) * -1220327677;
    }
    
    void method827(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_18_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_19_ = (double) (i & 0xff) / 256.0;
	double d_20_ = d;
	if (d_18_ < d_20_)
	    d_20_ = d_18_;
	if (d_19_ < d_20_)
	    d_20_ = d_19_;
	double d_21_ = d;
	if (d_18_ > d_21_)
	    d_21_ = d_18_;
	if (d_19_ > d_21_)
	    d_21_ = d_19_;
	double d_22_ = 0.0;
	double d_23_ = 0.0;
	double d_24_ = (d_20_ + d_21_) / 2.0;
	if (d_21_ != d_20_) {
	    if (d_24_ < 0.5)
		d_23_ = (d_21_ - d_20_) / (d_21_ + d_20_);
	    if (d_24_ >= 0.5)
		d_23_ = (d_21_ - d_20_) / (2.0 - d_21_ - d_20_);
	    if (d_21_ == d)
		d_22_ = (d_18_ - d_19_) / (d_21_ - d_20_);
	    else if (d_18_ == d_21_)
		d_22_ = 2.0 + (d_19_ - d) / (d_21_ - d_20_);
	    else if (d_21_ == d_19_)
		d_22_ = (d - d_18_) / (d_21_ - d_20_) + 4.0;
	}
	d_22_ /= 6.0;
	anInt218 = -731663077 * (int) (256.0 * d_23_);
	anInt225 = -1061502717 * (int) (256.0 * d_24_);
	if (337157395 * anInt218 < 0)
	    anInt218 = 0;
	else if (337157395 * anInt218 > 255)
	    anInt218 = -1890490907;
	if (anInt225 * 1486533035 < 0)
	    anInt225 = 0;
	else if (1486533035 * anInt225 > 255)
	    anInt225 = -100253187;
	if (d_24_ > 0.5)
	    anInt226 = 1793800249 * (int) (512.0 * ((1.0 - d_24_) * d_23_));
	else
	    anInt226 = 1793800249 * (int) (512.0 * (d_24_ * d_23_));
	if (-1462290935 * anInt226 < 1)
	    anInt226 = 1793800249;
	anInt222
	    = (int) (d_22_ * (double) (-1462290935 * anInt226)) * -1220327677;
    }
    
    static final void method828(Class683 class683, int i)
	throws Exception_Sub7 {
	class683.anInt8662 -= -1189665054;
	int i_25_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_26_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	Class446 class446
	    = Class446.method7208((float) i_25_, (float) i_25_, (float) i_25_);
	if (-1.0F == class446.aFloat4895)
	    class446.aFloat4895 = Float.POSITIVE_INFINITY;
	if (class446.aFloat4896 == -1.0F)
	    class446.aFloat4896 = Float.POSITIVE_INFINITY;
	if (-1.0F == class446.aFloat4897)
	    class446.aFloat4897 = Float.POSITIVE_INFINITY;
	Class453_Sub3.aClass309_Sub1_10316.method5560(class446, -394935966);
	Class453_Sub3.aClass309_Sub1_10316.method5459((float) i_26_ / 1000.0F,
						      -2073390209);
	class446.method7260();
    }
    
    public static void method829(int i, byte i_27_) {
	Class34 class34
	    = (Class34) Class556_Sub1.aHashMap10646.get(Integer.valueOf(i));
	if (class34 == null)
	    class34 = new Class34();
	class34.anInt308 = Class556_Sub1.anInt10632 * 344899965;
	class34.anInt309 = Class556_Sub1.anInt10648 * -77547357;
	Class556_Sub1.aHashMap10646.put(Integer.valueOf(i), class34);
    }
    
    public static byte[] method830(Object object, boolean bool, int i) {
	if (object == null)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    if (bool)
		return Arrays.copyOf(is, is.length);
	    return is;
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[bytebuffer.capacity()];
	    bytebuffer.position(0);
	    bytebuffer.get(is);
	    return is;
	}
	throw new IllegalArgumentException();
    }
}
