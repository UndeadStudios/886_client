/* Class525_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

public class Class525_Sub1 extends Class525
{
    Class182_Sub1 aClass182_Sub1_10396;
    int anInt10397;
    int anInt10398;
    int anInt10399 = 0;
    Class176 aClass176_10400;
    Interface35 anInterface35_10401;
    Class161_Sub3 aClass161_Sub3_10402;
    int[] anIntArray10403;
    ByteBuffer aByteBuffer10404;
    int anInt10405;
    int anInt10406;
    long aLong10407;
    float aFloat10408;
    
    void method16056(int i) {
	aByteBuffer10404 = aClass182_Sub1_10396.method14871(i * 4);
	aLong10407 = aClass182_Sub1_10396.method14659(aByteBuffer10404);
	for (int i_0_ = 3; i_0_ < i * 4; i_0_ += 4)
	    aClass182_Sub1_10396.anUnsafe9234.putByte(aLong10407 + (long) i_0_,
						      (byte) 0);
    }
    
    void method16057(int i, int i_1_, int i_2_) {
	anIntArray10403[(i_1_ * (aClass161_Sub3_10402.anInt1759 * 363736815)
			 + i)]
	    |= 1 << i_2_;
	anInt10399++;
    }
    
    void method16058(int i) {
	aClass182_Sub1_10396.anUnsafe9234
	    .putByte(aLong10407 + (long) (i * 4) + 3L, (byte) -1);
    }
    
    Class525_Sub1(Class161_Sub3 class161_sub3, int i, int i_3_,
		  Class176 class176) {
	anInt10397 = 0;
	anInt10405 = 0;
	anInt10406 = 0;
	aClass161_Sub3_10402 = class161_sub3;
	aClass182_Sub1_10396 = aClass161_Sub3_10402.aClass182_Sub1_9844;
	anInt10398 = i;
	aFloat10408 = (float) i_3_;
	aClass176_10400 = class176;
	anIntArray10403
	    = new int[(aClass161_Sub3_10402.anInt1759 * 363736815
		       * (aClass161_Sub3_10402.anInt1760 * -1152334393))];
    }
    
    void method16059(int i, int i_4_, int i_5_, float f) {
	if (anInt10398 != -1) {
	    TextureMetrics class166
		= aClass182_Sub1_10396.aClass180_1944.method3116(anInt10398,
								 -1431554601);
	    int i_6_ = class166.aByte1785 & 0xff;
	    if (i_6_ != 0 && class166.aByte1825 != 4) {
		int i_7_;
		if (i_5_ < 0)
		    i_7_ = 0;
		else if (i_5_ > 127)
		    i_7_ = 16777215;
		else
		    i_7_ = 131586 * i_5_;
		if (i_6_ == 256)
		    i_4_ = i_7_;
		else {
		    int i_8_ = i_6_;
		    int i_9_ = 256 - i_6_;
		    i_4_
			= (((i_7_ & 0xff00ff) * i_8_ + (i_4_ & 0xff00ff) * i_9_
			    & ~0xff00ff)
			   + ((i_7_ & 0xff00) * i_8_ + (i_4_ & 0xff00) * i_9_
			      & 0xff0000)) >> 8;
		}
	    }
	    int i_10_ = class166.aByte1831 & 0xff;
	    if (i_10_ != 0) {
		i_10_ += 256;
		int i_11_ = ((i_4_ & 0xff0000) >> 16) * i_10_;
		if (i_11_ > 65535)
		    i_11_ = 65535;
		int i_12_ = ((i_4_ & 0xff00) >> 8) * i_10_;
		if (i_12_ > 65535)
		    i_12_ = 65535;
		int i_13_ = (i_4_ & 0xff) * i_10_;
		if (i_13_ > 65535)
		    i_13_ = 65535;
		i_4_ = (i_11_ << 8 & 0xff0000) + (i_12_ & 0xff00) + (i_13_
								     >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_14_ = i_4_ >> 16 & 0xff;
	    int i_15_ = i_4_ >> 8 & 0xff;
	    int i_16_ = i_4_ & 0xff;
	    i_14_ *= f;
	    if (i_14_ < 0)
		i_14_ = 0;
	    else if (i_14_ > 255)
		i_14_ = 255;
	    i_15_ *= f;
	    if (i_15_ < 0)
		i_15_ = 0;
	    else if (i_15_ > 255)
		i_15_ = 255;
	    i_16_ *= f;
	    if (i_16_ < 0)
		i_16_ = 0;
	    else if (i_16_ > 255)
		i_16_ = 255;
	    i_4_ = i_14_ << 16 | i_15_ << 8 | i_16_;
	}
	if (aClass182_Sub1_10396.anInt9212 == 0) {
	    aByteBuffer10404.put(i * 4 + 0, (byte) (i_4_ >> 16));
	    aByteBuffer10404.put(i * 4 + 1, (byte) (i_4_ >> 8));
	    aByteBuffer10404.put(i * 4 + 2, (byte) (i_4_));
	} else {
	    aByteBuffer10404.put(i * 4 + 0, (byte) (i_4_));
	    aByteBuffer10404.put(i * 4 + 1, (byte) (i_4_ >> 8));
	    aByteBuffer10404.put(i * 4 + 2, (byte) (i_4_ >> 16));
	}
    }
    
    void method16060(int i) {
	anInterface35_10401 = aClass182_Sub1_10396.method14761(false);
	anInterface35_10401.method225(i * 4, 4);
	anInterface35_10401.method215(0, i * 4, aLong10407);
	aByteBuffer10404.clear();
	aByteBuffer10404 = null;
	aLong10407 = 0L;
    }
    
    void method16061(int[] is, int i) {
	anInt10397 = 0;
	anInt10405 = 32767;
	anInt10406 = -32768;
	ByteBuffer bytebuffer = aClass182_Sub1_10396.aByteBuffer9271;
	for (int i_17_ = 0; i_17_ < i; i_17_++) {
	    int i_18_ = is[i_17_];
	    short[] is_19_ = aClass161_Sub3_10402.aShortArrayArray9851[i_18_];
	    int i_20_ = anIntArray10403[i_18_];
	    if (i_20_ != 0 && is_19_ != null) {
		int i_21_ = 0;
		int i_22_ = 0;
		while (i_22_ < is_19_.length) {
		    if ((i_20_ & 1 << i_21_++) != 0) {
			for (int i_23_ = 0; i_23_ < 3; i_23_++) {
			    int i_24_ = is_19_[i_22_++] & 0xffff;
			    if (i_24_ > anInt10406)
				anInt10406 = i_24_;
			    if (i_24_ < anInt10405)
				anInt10405 = i_24_;
			    bytebuffer.putShort((short) i_24_);
			}
			anInt10397 += 3;
		    } else
			i_22_ += 3;
		}
	    }
	}
    }
    
    void method16062(int i, int i_25_, int i_26_) {
	anIntArray10403[(i_25_ * (aClass161_Sub3_10402.anInt1759 * 363736815)
			 + i)]
	    |= 1 << i_26_;
	anInt10399++;
    }
    
    void method16063(int i) {
	aClass182_Sub1_10396.anUnsafe9234
	    .putByte(aLong10407 + (long) (i * 4) + 3L, (byte) -1);
    }
    
    void method16064(int i) {
	aClass182_Sub1_10396.anUnsafe9234
	    .putByte(aLong10407 + (long) (i * 4) + 3L, (byte) -1);
    }
    
    void method16065(int i) {
	aClass182_Sub1_10396.anUnsafe9234
	    .putByte(aLong10407 + (long) (i * 4) + 3L, (byte) -1);
    }
    
    void method16066(int i, int i_27_, int i_28_, float f) {
	if (anInt10398 != -1) {
	    TextureMetrics class166
		= aClass182_Sub1_10396.aClass180_1944.method3116(anInt10398,
								 -1431554601);
	    int i_29_ = class166.aByte1785 & 0xff;
	    if (i_29_ != 0 && class166.aByte1825 != 4) {
		int i_30_;
		if (i_28_ < 0)
		    i_30_ = 0;
		else if (i_28_ > 127)
		    i_30_ = 16777215;
		else
		    i_30_ = 131586 * i_28_;
		if (i_29_ == 256)
		    i_27_ = i_30_;
		else {
		    int i_31_ = i_29_;
		    int i_32_ = 256 - i_29_;
		    i_27_ = ((((i_30_ & 0xff00ff) * i_31_
			       + (i_27_ & 0xff00ff) * i_32_)
			      & ~0xff00ff)
			     + (((i_30_ & 0xff00) * i_31_
				 + (i_27_ & 0xff00) * i_32_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_33_ = class166.aByte1831 & 0xff;
	    if (i_33_ != 0) {
		i_33_ += 256;
		int i_34_ = ((i_27_ & 0xff0000) >> 16) * i_33_;
		if (i_34_ > 65535)
		    i_34_ = 65535;
		int i_35_ = ((i_27_ & 0xff00) >> 8) * i_33_;
		if (i_35_ > 65535)
		    i_35_ = 65535;
		int i_36_ = (i_27_ & 0xff) * i_33_;
		if (i_36_ > 65535)
		    i_36_ = 65535;
		i_27_ = (i_34_ << 8 & 0xff0000) + (i_35_ & 0xff00) + (i_36_
								      >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_37_ = i_27_ >> 16 & 0xff;
	    int i_38_ = i_27_ >> 8 & 0xff;
	    int i_39_ = i_27_ & 0xff;
	    i_37_ *= f;
	    if (i_37_ < 0)
		i_37_ = 0;
	    else if (i_37_ > 255)
		i_37_ = 255;
	    i_38_ *= f;
	    if (i_38_ < 0)
		i_38_ = 0;
	    else if (i_38_ > 255)
		i_38_ = 255;
	    i_39_ *= f;
	    if (i_39_ < 0)
		i_39_ = 0;
	    else if (i_39_ > 255)
		i_39_ = 255;
	    i_27_ = i_37_ << 16 | i_38_ << 8 | i_39_;
	}
	if (aClass182_Sub1_10396.anInt9212 == 0) {
	    aByteBuffer10404.put(i * 4 + 0, (byte) (i_27_ >> 16));
	    aByteBuffer10404.put(i * 4 + 1, (byte) (i_27_ >> 8));
	    aByteBuffer10404.put(i * 4 + 2, (byte) (i_27_));
	} else {
	    aByteBuffer10404.put(i * 4 + 0, (byte) (i_27_));
	    aByteBuffer10404.put(i * 4 + 1, (byte) (i_27_ >> 8));
	    aByteBuffer10404.put(i * 4 + 2, (byte) (i_27_ >> 16));
	}
    }
    
    void method16067(int i) {
	anInterface35_10401 = aClass182_Sub1_10396.method14761(false);
	anInterface35_10401.method225(i * 4, 4);
	anInterface35_10401.method215(0, i * 4, aLong10407);
	aByteBuffer10404.clear();
	aByteBuffer10404 = null;
	aLong10407 = 0L;
    }
    
    void method16068(int i, int i_40_, int i_41_) {
	anIntArray10403[(i_40_ * (aClass161_Sub3_10402.anInt1759 * 363736815)
			 + i)]
	    |= 1 << i_41_;
	anInt10399++;
    }
    
    void method16069(int i) {
	aByteBuffer10404 = aClass182_Sub1_10396.method14871(i * 4);
	aLong10407 = aClass182_Sub1_10396.method14659(aByteBuffer10404);
	for (int i_42_ = 3; i_42_ < i * 4; i_42_ += 4)
	    aClass182_Sub1_10396.anUnsafe9234
		.putByte(aLong10407 + (long) i_42_, (byte) 0);
    }
    
    void method16070(int i) {
	anInterface35_10401 = aClass182_Sub1_10396.method14761(false);
	anInterface35_10401.method225(i * 4, 4);
	anInterface35_10401.method215(0, i * 4, aLong10407);
	aByteBuffer10404.clear();
	aByteBuffer10404 = null;
	aLong10407 = 0L;
    }
    
    void method16071(int i) {
	anInterface35_10401 = aClass182_Sub1_10396.method14761(false);
	anInterface35_10401.method225(i * 4, 4);
	anInterface35_10401.method215(0, i * 4, aLong10407);
	aByteBuffer10404.clear();
	aByteBuffer10404 = null;
	aLong10407 = 0L;
    }
    
    void method16072(int[] is, int i) {
	anInt10397 = 0;
	anInt10405 = 32767;
	anInt10406 = -32768;
	ByteBuffer bytebuffer = aClass182_Sub1_10396.aByteBuffer9271;
	for (int i_43_ = 0; i_43_ < i; i_43_++) {
	    int i_44_ = is[i_43_];
	    short[] is_45_ = aClass161_Sub3_10402.aShortArrayArray9851[i_44_];
	    int i_46_ = anIntArray10403[i_44_];
	    if (i_46_ != 0 && is_45_ != null) {
		int i_47_ = 0;
		int i_48_ = 0;
		while (i_48_ < is_45_.length) {
		    if ((i_46_ & 1 << i_47_++) != 0) {
			for (int i_49_ = 0; i_49_ < 3; i_49_++) {
			    int i_50_ = is_45_[i_48_++] & 0xffff;
			    if (i_50_ > anInt10406)
				anInt10406 = i_50_;
			    if (i_50_ < anInt10405)
				anInt10405 = i_50_;
			    bytebuffer.putShort((short) i_50_);
			}
			anInt10397 += 3;
		    } else
			i_48_ += 3;
		}
	    }
	}
    }
}
