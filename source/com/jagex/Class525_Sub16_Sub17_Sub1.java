/* Class525_Sub16_Sub17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub16_Sub17_Sub1 extends Class525_Sub16_Sub17
{
    int anInt12106;
    static final int anInt12107 = 16;
    int anInt12108;
    int anInt12109;
    byte[] aByteArray12110;
    int anInt12111;
    
    void method18758(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
	int i_5_ = 0;
	if (i_0_ != i)
	    i_5_ = (i_3_ - i_2_ << 16) / (i_0_ - i);
	int i_6_ = 0;
	if (i_1_ != i_0_)
	    i_6_ = (i_4_ - i_3_ << 16) / (i_1_ - i_0_);
	int i_7_ = 0;
	if (i_1_ != i)
	    i_7_ = (i_2_ - i_4_ << 16) / (i - i_1_);
	if (i <= i_0_ && i <= i_1_) {
	    if (i_0_ < i_1_) {
		i_4_ = i_2_ <<= 16;
		if (i < 0) {
		    i_4_ -= i_7_ * i;
		    i_2_ -= i_5_ * i;
		    i = 0;
		}
		i_3_ <<= 16;
		if (i_0_ < 0) {
		    i_3_ -= i_6_ * i_0_;
		    i_0_ = 0;
		}
		if (i != i_0_ && i_7_ < i_5_ || i == i_0_ && i_7_ > i_6_) {
		    i_1_ -= i_0_;
		    i_0_ -= i;
		    i *= anInt12106;
		    while (--i_0_ >= 0) {
			method18763(aByteArray12110, i, 0, i_4_ >> 16,
				    i_2_ >> 16);
			i_4_ += i_7_;
			i_2_ += i_5_;
			i += anInt12106;
		    }
		    while (--i_1_ >= 0) {
			method18763(aByteArray12110, i, 0, i_4_ >> 16,
				    i_3_ >> 16);
			i_4_ += i_7_;
			i_3_ += i_6_;
			i += anInt12106;
		    }
		} else {
		    i_1_ -= i_0_;
		    i_0_ -= i;
		    i *= anInt12106;
		    while (--i_0_ >= 0) {
			method18763(aByteArray12110, i, 0, i_2_ >> 16,
				    i_4_ >> 16);
			i_4_ += i_7_;
			i_2_ += i_5_;
			i += anInt12106;
		    }
		    while (--i_1_ >= 0) {
			method18763(aByteArray12110, i, 0, i_3_ >> 16,
				    i_4_ >> 16);
			i_4_ += i_7_;
			i_3_ += i_6_;
			i += anInt12106;
		    }
		}
	    } else {
		i_3_ = i_2_ <<= 16;
		if (i < 0) {
		    i_3_ -= i_7_ * i;
		    i_2_ -= i_5_ * i;
		    i = 0;
		}
		i_4_ <<= 16;
		if (i_1_ < 0) {
		    i_4_ -= i_6_ * i_1_;
		    i_1_ = 0;
		}
		if (i != i_1_ && i_7_ < i_5_ || i == i_1_ && i_6_ > i_5_) {
		    i_0_ -= i_1_;
		    i_1_ -= i;
		    i *= anInt12106;
		    while (--i_1_ >= 0) {
			method18763(aByteArray12110, i, 0, i_3_ >> 16,
				    i_2_ >> 16);
			i_3_ += i_7_;
			i_2_ += i_5_;
			i += anInt12106;
		    }
		    while (--i_0_ >= 0) {
			method18763(aByteArray12110, i, 0, i_4_ >> 16,
				    i_2_ >> 16);
			i_4_ += i_6_;
			i_2_ += i_5_;
			i += anInt12106;
		    }
		} else {
		    i_0_ -= i_1_;
		    i_1_ -= i;
		    i *= anInt12106;
		    while (--i_1_ >= 0) {
			method18763(aByteArray12110, i, 0, i_2_ >> 16,
				    i_3_ >> 16);
			i_3_ += i_7_;
			i_2_ += i_5_;
			i += anInt12106;
		    }
		    while (--i_0_ >= 0) {
			method18763(aByteArray12110, i, 0, i_2_ >> 16,
				    i_4_ >> 16);
			i_4_ += i_6_;
			i_2_ += i_5_;
			i += anInt12106;
		    }
		}
	    }
	} else if (i_0_ <= i_1_) {
	    if (i_1_ < i) {
		i_2_ = i_3_ <<= 16;
		if (i_0_ < 0) {
		    i_2_ -= i_5_ * i_0_;
		    i_3_ -= i_6_ * i_0_;
		    i_0_ = 0;
		}
		i_4_ <<= 16;
		if (i_1_ < 0) {
		    i_4_ -= i_7_ * i_1_;
		    i_1_ = 0;
		}
		if (i_0_ != i_1_ && i_5_ < i_6_
		    || i_0_ == i_1_ && i_5_ > i_7_) {
		    i -= i_1_;
		    i_1_ -= i_0_;
		    i_0_ *= anInt12106;
		    while (--i_1_ >= 0) {
			method18763(aByteArray12110, i_0_, 0, i_2_ >> 16,
				    i_3_ >> 16);
			i_2_ += i_5_;
			i_3_ += i_6_;
			i_0_ += anInt12106;
		    }
		    while (--i >= 0) {
			method18763(aByteArray12110, i_0_, 0, i_2_ >> 16,
				    i_4_ >> 16);
			i_2_ += i_5_;
			i_4_ += i_7_;
			i_0_ += anInt12106;
		    }
		} else {
		    i -= i_1_;
		    i_1_ -= i_0_;
		    i_0_ *= anInt12106;
		    while (--i_1_ >= 0) {
			method18763(aByteArray12110, i_0_, 0, i_3_ >> 16,
				    i_2_ >> 16);
			i_2_ += i_5_;
			i_3_ += i_6_;
			i_0_ += anInt12106;
		    }
		    while (--i >= 0) {
			method18763(aByteArray12110, i_0_, 0, i_4_ >> 16,
				    i_2_ >> 16);
			i_2_ += i_5_;
			i_4_ += i_7_;
			i_0_ += anInt12106;
		    }
		}
	    } else {
		i_4_ = i_3_ <<= 16;
		if (i_0_ < 0) {
		    i_4_ -= i_5_ * i_0_;
		    i_3_ -= i_6_ * i_0_;
		    i_0_ = 0;
		}
		i_2_ <<= 16;
		if (i < 0) {
		    i_2_ -= i_7_ * i;
		    i = 0;
		}
		if (i_5_ < i_6_) {
		    i_1_ -= i;
		    i -= i_0_;
		    i_0_ *= anInt12106;
		    while (--i >= 0) {
			method18763(aByteArray12110, i_0_, 0, i_4_ >> 16,
				    i_3_ >> 16);
			i_4_ += i_5_;
			i_3_ += i_6_;
			i_0_ += anInt12106;
		    }
		    while (--i_1_ >= 0) {
			method18763(aByteArray12110, i_0_, 0, i_2_ >> 16,
				    i_3_ >> 16);
			i_2_ += i_7_;
			i_3_ += i_6_;
			i_0_ += anInt12106;
		    }
		} else {
		    i_1_ -= i;
		    i -= i_0_;
		    i_0_ *= anInt12106;
		    while (--i >= 0) {
			method18763(aByteArray12110, i_0_, 0, i_3_ >> 16,
				    i_4_ >> 16);
			i_4_ += i_5_;
			i_3_ += i_6_;
			i_0_ += anInt12106;
		    }
		    while (--i_1_ >= 0) {
			method18763(aByteArray12110, i_0_, 0, i_3_ >> 16,
				    i_2_ >> 16);
			i_2_ += i_7_;
			i_3_ += i_6_;
			i_0_ += anInt12106;
		    }
		}
	    }
	} else if (i < i_0_) {
	    i_3_ = i_4_ <<= 16;
	    if (i_1_ < 0) {
		i_3_ -= i_6_ * i_1_;
		i_4_ -= i_7_ * i_1_;
		i_1_ = 0;
	    }
	    i_2_ <<= 16;
	    if (i < 0) {
		i_2_ -= i_5_ * i;
		i = 0;
	    }
	    if (i_6_ < i_7_) {
		i_0_ -= i;
		i -= i_1_;
		i_1_ *= anInt12106;
		while (--i >= 0) {
		    method18763(aByteArray12110, i_1_, 0, i_3_ >> 16,
				i_4_ >> 16);
		    i_3_ += i_6_;
		    i_4_ += i_7_;
		    i_1_ += anInt12106;
		}
		while (--i_0_ >= 0) {
		    method18763(aByteArray12110, i_1_, 0, i_3_ >> 16,
				i_2_ >> 16);
		    i_3_ += i_6_;
		    i_2_ += i_5_;
		    i_1_ += anInt12106;
		}
	    } else {
		i_0_ -= i;
		i -= i_1_;
		i_1_ *= anInt12106;
		while (--i >= 0) {
		    method18763(aByteArray12110, i_1_, 0, i_4_ >> 16,
				i_3_ >> 16);
		    i_3_ += i_6_;
		    i_4_ += i_7_;
		    i_1_ += anInt12106;
		}
		while (--i_0_ >= 0) {
		    method18763(aByteArray12110, i_1_, 0, i_2_ >> 16,
				i_3_ >> 16);
		    i_3_ += i_6_;
		    i_2_ += i_5_;
		    i_1_ += anInt12106;
		}
	    }
	} else {
	    i_2_ = i_4_ <<= 16;
	    if (i_1_ < 0) {
		i_2_ -= i_6_ * i_1_;
		i_4_ -= i_7_ * i_1_;
		i_1_ = 0;
	    }
	    i_3_ <<= 16;
	    if (i_0_ < 0) {
		i_3_ -= i_5_ * i_0_;
		i_0_ = 0;
	    }
	    if (i_6_ < i_7_) {
		i -= i_0_;
		i_0_ -= i_1_;
		i_1_ *= anInt12106;
		while (--i_0_ >= 0) {
		    method18763(aByteArray12110, i_1_, 0, i_2_ >> 16,
				i_4_ >> 16);
		    i_2_ += i_6_;
		    i_4_ += i_7_;
		    i_1_ += anInt12106;
		}
		while (--i >= 0) {
		    method18763(aByteArray12110, i_1_, 0, i_3_ >> 16,
				i_4_ >> 16);
		    i_3_ += i_5_;
		    i_4_ += i_7_;
		    i_1_ += anInt12106;
		}
	    } else {
		i -= i_0_;
		i_0_ -= i_1_;
		i_1_ *= anInt12106;
		while (--i_0_ >= 0) {
		    method18763(aByteArray12110, i_1_, 0, i_4_ >> 16,
				i_2_ >> 16);
		    i_2_ += i_6_;
		    i_4_ += i_7_;
		    i_1_ += anInt12106;
		}
		while (--i >= 0) {
		    method18763(aByteArray12110, i_1_, 0, i_4_ >> 16,
				i_3_ >> 16);
		    i_3_ += i_5_;
		    i_4_ += i_7_;
		    i_1_ += anInt12106;
		}
	    }
	}
    }
    
    boolean method18759(int i, int i_8_) {
	return aByteArray12110.length >= i * i_8_;
    }
    
    boolean method18760(int i, int i_9_) {
	return aByteArray12110.length >= i * i_9_;
    }
    
    void method18761() {
	int i = -1;
	int i_10_ = aByteArray12110.length - 8;
	while (i < i_10_) {
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	}
	while (i < aByteArray12110.length - 1)
	    aByteArray12110[++i] = (byte) 0;
    }
    
    void method18762(int i, int i_11_, int i_12_, int i_13_, int i_14_,
		     int i_15_) {
	int i_16_ = 0;
	if (i_11_ != i)
	    i_16_ = (i_14_ - i_13_ << 16) / (i_11_ - i);
	int i_17_ = 0;
	if (i_12_ != i_11_)
	    i_17_ = (i_15_ - i_14_ << 16) / (i_12_ - i_11_);
	int i_18_ = 0;
	if (i_12_ != i)
	    i_18_ = (i_13_ - i_15_ << 16) / (i - i_12_);
	if (i <= i_11_ && i <= i_12_) {
	    if (i_11_ < i_12_) {
		i_15_ = i_13_ <<= 16;
		if (i < 0) {
		    i_15_ -= i_18_ * i;
		    i_13_ -= i_16_ * i;
		    i = 0;
		}
		i_14_ <<= 16;
		if (i_11_ < 0) {
		    i_14_ -= i_17_ * i_11_;
		    i_11_ = 0;
		}
		if (i != i_11_ && i_18_ < i_16_
		    || i == i_11_ && i_18_ > i_17_) {
		    i_12_ -= i_11_;
		    i_11_ -= i;
		    i *= anInt12106;
		    while (--i_11_ >= 0) {
			method18763(aByteArray12110, i, 0, i_15_ >> 16,
				    i_13_ >> 16);
			i_15_ += i_18_;
			i_13_ += i_16_;
			i += anInt12106;
		    }
		    while (--i_12_ >= 0) {
			method18763(aByteArray12110, i, 0, i_15_ >> 16,
				    i_14_ >> 16);
			i_15_ += i_18_;
			i_14_ += i_17_;
			i += anInt12106;
		    }
		} else {
		    i_12_ -= i_11_;
		    i_11_ -= i;
		    i *= anInt12106;
		    while (--i_11_ >= 0) {
			method18763(aByteArray12110, i, 0, i_13_ >> 16,
				    i_15_ >> 16);
			i_15_ += i_18_;
			i_13_ += i_16_;
			i += anInt12106;
		    }
		    while (--i_12_ >= 0) {
			method18763(aByteArray12110, i, 0, i_14_ >> 16,
				    i_15_ >> 16);
			i_15_ += i_18_;
			i_14_ += i_17_;
			i += anInt12106;
		    }
		}
	    } else {
		i_14_ = i_13_ <<= 16;
		if (i < 0) {
		    i_14_ -= i_18_ * i;
		    i_13_ -= i_16_ * i;
		    i = 0;
		}
		i_15_ <<= 16;
		if (i_12_ < 0) {
		    i_15_ -= i_17_ * i_12_;
		    i_12_ = 0;
		}
		if (i != i_12_ && i_18_ < i_16_
		    || i == i_12_ && i_17_ > i_16_) {
		    i_11_ -= i_12_;
		    i_12_ -= i;
		    i *= anInt12106;
		    while (--i_12_ >= 0) {
			method18763(aByteArray12110, i, 0, i_14_ >> 16,
				    i_13_ >> 16);
			i_14_ += i_18_;
			i_13_ += i_16_;
			i += anInt12106;
		    }
		    while (--i_11_ >= 0) {
			method18763(aByteArray12110, i, 0, i_15_ >> 16,
				    i_13_ >> 16);
			i_15_ += i_17_;
			i_13_ += i_16_;
			i += anInt12106;
		    }
		} else {
		    i_11_ -= i_12_;
		    i_12_ -= i;
		    i *= anInt12106;
		    while (--i_12_ >= 0) {
			method18763(aByteArray12110, i, 0, i_13_ >> 16,
				    i_14_ >> 16);
			i_14_ += i_18_;
			i_13_ += i_16_;
			i += anInt12106;
		    }
		    while (--i_11_ >= 0) {
			method18763(aByteArray12110, i, 0, i_13_ >> 16,
				    i_15_ >> 16);
			i_15_ += i_17_;
			i_13_ += i_16_;
			i += anInt12106;
		    }
		}
	    }
	} else if (i_11_ <= i_12_) {
	    if (i_12_ < i) {
		i_13_ = i_14_ <<= 16;
		if (i_11_ < 0) {
		    i_13_ -= i_16_ * i_11_;
		    i_14_ -= i_17_ * i_11_;
		    i_11_ = 0;
		}
		i_15_ <<= 16;
		if (i_12_ < 0) {
		    i_15_ -= i_18_ * i_12_;
		    i_12_ = 0;
		}
		if (i_11_ != i_12_ && i_16_ < i_17_
		    || i_11_ == i_12_ && i_16_ > i_18_) {
		    i -= i_12_;
		    i_12_ -= i_11_;
		    i_11_ *= anInt12106;
		    while (--i_12_ >= 0) {
			method18763(aByteArray12110, i_11_, 0, i_13_ >> 16,
				    i_14_ >> 16);
			i_13_ += i_16_;
			i_14_ += i_17_;
			i_11_ += anInt12106;
		    }
		    while (--i >= 0) {
			method18763(aByteArray12110, i_11_, 0, i_13_ >> 16,
				    i_15_ >> 16);
			i_13_ += i_16_;
			i_15_ += i_18_;
			i_11_ += anInt12106;
		    }
		} else {
		    i -= i_12_;
		    i_12_ -= i_11_;
		    i_11_ *= anInt12106;
		    while (--i_12_ >= 0) {
			method18763(aByteArray12110, i_11_, 0, i_14_ >> 16,
				    i_13_ >> 16);
			i_13_ += i_16_;
			i_14_ += i_17_;
			i_11_ += anInt12106;
		    }
		    while (--i >= 0) {
			method18763(aByteArray12110, i_11_, 0, i_15_ >> 16,
				    i_13_ >> 16);
			i_13_ += i_16_;
			i_15_ += i_18_;
			i_11_ += anInt12106;
		    }
		}
	    } else {
		i_15_ = i_14_ <<= 16;
		if (i_11_ < 0) {
		    i_15_ -= i_16_ * i_11_;
		    i_14_ -= i_17_ * i_11_;
		    i_11_ = 0;
		}
		i_13_ <<= 16;
		if (i < 0) {
		    i_13_ -= i_18_ * i;
		    i = 0;
		}
		if (i_16_ < i_17_) {
		    i_12_ -= i;
		    i -= i_11_;
		    i_11_ *= anInt12106;
		    while (--i >= 0) {
			method18763(aByteArray12110, i_11_, 0, i_15_ >> 16,
				    i_14_ >> 16);
			i_15_ += i_16_;
			i_14_ += i_17_;
			i_11_ += anInt12106;
		    }
		    while (--i_12_ >= 0) {
			method18763(aByteArray12110, i_11_, 0, i_13_ >> 16,
				    i_14_ >> 16);
			i_13_ += i_18_;
			i_14_ += i_17_;
			i_11_ += anInt12106;
		    }
		} else {
		    i_12_ -= i;
		    i -= i_11_;
		    i_11_ *= anInt12106;
		    while (--i >= 0) {
			method18763(aByteArray12110, i_11_, 0, i_14_ >> 16,
				    i_15_ >> 16);
			i_15_ += i_16_;
			i_14_ += i_17_;
			i_11_ += anInt12106;
		    }
		    while (--i_12_ >= 0) {
			method18763(aByteArray12110, i_11_, 0, i_14_ >> 16,
				    i_13_ >> 16);
			i_13_ += i_18_;
			i_14_ += i_17_;
			i_11_ += anInt12106;
		    }
		}
	    }
	} else if (i < i_11_) {
	    i_14_ = i_15_ <<= 16;
	    if (i_12_ < 0) {
		i_14_ -= i_17_ * i_12_;
		i_15_ -= i_18_ * i_12_;
		i_12_ = 0;
	    }
	    i_13_ <<= 16;
	    if (i < 0) {
		i_13_ -= i_16_ * i;
		i = 0;
	    }
	    if (i_17_ < i_18_) {
		i_11_ -= i;
		i -= i_12_;
		i_12_ *= anInt12106;
		while (--i >= 0) {
		    method18763(aByteArray12110, i_12_, 0, i_14_ >> 16,
				i_15_ >> 16);
		    i_14_ += i_17_;
		    i_15_ += i_18_;
		    i_12_ += anInt12106;
		}
		while (--i_11_ >= 0) {
		    method18763(aByteArray12110, i_12_, 0, i_14_ >> 16,
				i_13_ >> 16);
		    i_14_ += i_17_;
		    i_13_ += i_16_;
		    i_12_ += anInt12106;
		}
	    } else {
		i_11_ -= i;
		i -= i_12_;
		i_12_ *= anInt12106;
		while (--i >= 0) {
		    method18763(aByteArray12110, i_12_, 0, i_15_ >> 16,
				i_14_ >> 16);
		    i_14_ += i_17_;
		    i_15_ += i_18_;
		    i_12_ += anInt12106;
		}
		while (--i_11_ >= 0) {
		    method18763(aByteArray12110, i_12_, 0, i_13_ >> 16,
				i_14_ >> 16);
		    i_14_ += i_17_;
		    i_13_ += i_16_;
		    i_12_ += anInt12106;
		}
	    }
	} else {
	    i_13_ = i_15_ <<= 16;
	    if (i_12_ < 0) {
		i_13_ -= i_17_ * i_12_;
		i_15_ -= i_18_ * i_12_;
		i_12_ = 0;
	    }
	    i_14_ <<= 16;
	    if (i_11_ < 0) {
		i_14_ -= i_16_ * i_11_;
		i_11_ = 0;
	    }
	    if (i_17_ < i_18_) {
		i -= i_11_;
		i_11_ -= i_12_;
		i_12_ *= anInt12106;
		while (--i_11_ >= 0) {
		    method18763(aByteArray12110, i_12_, 0, i_13_ >> 16,
				i_15_ >> 16);
		    i_13_ += i_17_;
		    i_15_ += i_18_;
		    i_12_ += anInt12106;
		}
		while (--i >= 0) {
		    method18763(aByteArray12110, i_12_, 0, i_14_ >> 16,
				i_15_ >> 16);
		    i_14_ += i_16_;
		    i_15_ += i_18_;
		    i_12_ += anInt12106;
		}
	    } else {
		i -= i_11_;
		i_11_ -= i_12_;
		i_12_ *= anInt12106;
		while (--i_11_ >= 0) {
		    method18763(aByteArray12110, i_12_, 0, i_15_ >> 16,
				i_13_ >> 16);
		    i_13_ += i_17_;
		    i_15_ += i_18_;
		    i_12_ += anInt12106;
		}
		while (--i >= 0) {
		    method18763(aByteArray12110, i_12_, 0, i_15_ >> 16,
				i_14_ >> 16);
		    i_14_ += i_16_;
		    i_15_ += i_18_;
		    i_12_ += anInt12106;
		}
	    }
	}
    }
    
    static final void method18763(byte[] is, int i, int i_19_, int i_20_,
				  int i_21_) {
	if (i_20_ < i_21_) {
	    i += i_20_;
	    i_19_ = i_21_ - i_20_ >> 2;
	    while (--i_19_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_19_ = i_21_ - i_20_ & 0x3;
	    while (--i_19_ >= 0)
		is[i++] = (byte) 1;
	}
    }
    
    boolean method18764(int i, int i_22_) {
	return aByteArray12110.length >= i * i_22_;
    }
    
    void method18765(int i, int i_23_, int i_24_, int i_25_, int i_26_,
		     int i_27_) {
	int i_28_ = 0;
	if (i_23_ != i)
	    i_28_ = (i_26_ - i_25_ << 16) / (i_23_ - i);
	int i_29_ = 0;
	if (i_24_ != i_23_)
	    i_29_ = (i_27_ - i_26_ << 16) / (i_24_ - i_23_);
	int i_30_ = 0;
	if (i_24_ != i)
	    i_30_ = (i_25_ - i_27_ << 16) / (i - i_24_);
	if (i <= i_23_ && i <= i_24_) {
	    if (i_23_ < i_24_) {
		i_27_ = i_25_ <<= 16;
		if (i < 0) {
		    i_27_ -= i_30_ * i;
		    i_25_ -= i_28_ * i;
		    i = 0;
		}
		i_26_ <<= 16;
		if (i_23_ < 0) {
		    i_26_ -= i_29_ * i_23_;
		    i_23_ = 0;
		}
		if (i != i_23_ && i_30_ < i_28_
		    || i == i_23_ && i_30_ > i_29_) {
		    i_24_ -= i_23_;
		    i_23_ -= i;
		    i *= anInt12106;
		    while (--i_23_ >= 0) {
			method18763(aByteArray12110, i, 0, i_27_ >> 16,
				    i_25_ >> 16);
			i_27_ += i_30_;
			i_25_ += i_28_;
			i += anInt12106;
		    }
		    while (--i_24_ >= 0) {
			method18763(aByteArray12110, i, 0, i_27_ >> 16,
				    i_26_ >> 16);
			i_27_ += i_30_;
			i_26_ += i_29_;
			i += anInt12106;
		    }
		} else {
		    i_24_ -= i_23_;
		    i_23_ -= i;
		    i *= anInt12106;
		    while (--i_23_ >= 0) {
			method18763(aByteArray12110, i, 0, i_25_ >> 16,
				    i_27_ >> 16);
			i_27_ += i_30_;
			i_25_ += i_28_;
			i += anInt12106;
		    }
		    while (--i_24_ >= 0) {
			method18763(aByteArray12110, i, 0, i_26_ >> 16,
				    i_27_ >> 16);
			i_27_ += i_30_;
			i_26_ += i_29_;
			i += anInt12106;
		    }
		}
	    } else {
		i_26_ = i_25_ <<= 16;
		if (i < 0) {
		    i_26_ -= i_30_ * i;
		    i_25_ -= i_28_ * i;
		    i = 0;
		}
		i_27_ <<= 16;
		if (i_24_ < 0) {
		    i_27_ -= i_29_ * i_24_;
		    i_24_ = 0;
		}
		if (i != i_24_ && i_30_ < i_28_
		    || i == i_24_ && i_29_ > i_28_) {
		    i_23_ -= i_24_;
		    i_24_ -= i;
		    i *= anInt12106;
		    while (--i_24_ >= 0) {
			method18763(aByteArray12110, i, 0, i_26_ >> 16,
				    i_25_ >> 16);
			i_26_ += i_30_;
			i_25_ += i_28_;
			i += anInt12106;
		    }
		    while (--i_23_ >= 0) {
			method18763(aByteArray12110, i, 0, i_27_ >> 16,
				    i_25_ >> 16);
			i_27_ += i_29_;
			i_25_ += i_28_;
			i += anInt12106;
		    }
		} else {
		    i_23_ -= i_24_;
		    i_24_ -= i;
		    i *= anInt12106;
		    while (--i_24_ >= 0) {
			method18763(aByteArray12110, i, 0, i_25_ >> 16,
				    i_26_ >> 16);
			i_26_ += i_30_;
			i_25_ += i_28_;
			i += anInt12106;
		    }
		    while (--i_23_ >= 0) {
			method18763(aByteArray12110, i, 0, i_25_ >> 16,
				    i_27_ >> 16);
			i_27_ += i_29_;
			i_25_ += i_28_;
			i += anInt12106;
		    }
		}
	    }
	} else if (i_23_ <= i_24_) {
	    if (i_24_ < i) {
		i_25_ = i_26_ <<= 16;
		if (i_23_ < 0) {
		    i_25_ -= i_28_ * i_23_;
		    i_26_ -= i_29_ * i_23_;
		    i_23_ = 0;
		}
		i_27_ <<= 16;
		if (i_24_ < 0) {
		    i_27_ -= i_30_ * i_24_;
		    i_24_ = 0;
		}
		if (i_23_ != i_24_ && i_28_ < i_29_
		    || i_23_ == i_24_ && i_28_ > i_30_) {
		    i -= i_24_;
		    i_24_ -= i_23_;
		    i_23_ *= anInt12106;
		    while (--i_24_ >= 0) {
			method18763(aByteArray12110, i_23_, 0, i_25_ >> 16,
				    i_26_ >> 16);
			i_25_ += i_28_;
			i_26_ += i_29_;
			i_23_ += anInt12106;
		    }
		    while (--i >= 0) {
			method18763(aByteArray12110, i_23_, 0, i_25_ >> 16,
				    i_27_ >> 16);
			i_25_ += i_28_;
			i_27_ += i_30_;
			i_23_ += anInt12106;
		    }
		} else {
		    i -= i_24_;
		    i_24_ -= i_23_;
		    i_23_ *= anInt12106;
		    while (--i_24_ >= 0) {
			method18763(aByteArray12110, i_23_, 0, i_26_ >> 16,
				    i_25_ >> 16);
			i_25_ += i_28_;
			i_26_ += i_29_;
			i_23_ += anInt12106;
		    }
		    while (--i >= 0) {
			method18763(aByteArray12110, i_23_, 0, i_27_ >> 16,
				    i_25_ >> 16);
			i_25_ += i_28_;
			i_27_ += i_30_;
			i_23_ += anInt12106;
		    }
		}
	    } else {
		i_27_ = i_26_ <<= 16;
		if (i_23_ < 0) {
		    i_27_ -= i_28_ * i_23_;
		    i_26_ -= i_29_ * i_23_;
		    i_23_ = 0;
		}
		i_25_ <<= 16;
		if (i < 0) {
		    i_25_ -= i_30_ * i;
		    i = 0;
		}
		if (i_28_ < i_29_) {
		    i_24_ -= i;
		    i -= i_23_;
		    i_23_ *= anInt12106;
		    while (--i >= 0) {
			method18763(aByteArray12110, i_23_, 0, i_27_ >> 16,
				    i_26_ >> 16);
			i_27_ += i_28_;
			i_26_ += i_29_;
			i_23_ += anInt12106;
		    }
		    while (--i_24_ >= 0) {
			method18763(aByteArray12110, i_23_, 0, i_25_ >> 16,
				    i_26_ >> 16);
			i_25_ += i_30_;
			i_26_ += i_29_;
			i_23_ += anInt12106;
		    }
		} else {
		    i_24_ -= i;
		    i -= i_23_;
		    i_23_ *= anInt12106;
		    while (--i >= 0) {
			method18763(aByteArray12110, i_23_, 0, i_26_ >> 16,
				    i_27_ >> 16);
			i_27_ += i_28_;
			i_26_ += i_29_;
			i_23_ += anInt12106;
		    }
		    while (--i_24_ >= 0) {
			method18763(aByteArray12110, i_23_, 0, i_26_ >> 16,
				    i_25_ >> 16);
			i_25_ += i_30_;
			i_26_ += i_29_;
			i_23_ += anInt12106;
		    }
		}
	    }
	} else if (i < i_23_) {
	    i_26_ = i_27_ <<= 16;
	    if (i_24_ < 0) {
		i_26_ -= i_29_ * i_24_;
		i_27_ -= i_30_ * i_24_;
		i_24_ = 0;
	    }
	    i_25_ <<= 16;
	    if (i < 0) {
		i_25_ -= i_28_ * i;
		i = 0;
	    }
	    if (i_29_ < i_30_) {
		i_23_ -= i;
		i -= i_24_;
		i_24_ *= anInt12106;
		while (--i >= 0) {
		    method18763(aByteArray12110, i_24_, 0, i_26_ >> 16,
				i_27_ >> 16);
		    i_26_ += i_29_;
		    i_27_ += i_30_;
		    i_24_ += anInt12106;
		}
		while (--i_23_ >= 0) {
		    method18763(aByteArray12110, i_24_, 0, i_26_ >> 16,
				i_25_ >> 16);
		    i_26_ += i_29_;
		    i_25_ += i_28_;
		    i_24_ += anInt12106;
		}
	    } else {
		i_23_ -= i;
		i -= i_24_;
		i_24_ *= anInt12106;
		while (--i >= 0) {
		    method18763(aByteArray12110, i_24_, 0, i_27_ >> 16,
				i_26_ >> 16);
		    i_26_ += i_29_;
		    i_27_ += i_30_;
		    i_24_ += anInt12106;
		}
		while (--i_23_ >= 0) {
		    method18763(aByteArray12110, i_24_, 0, i_25_ >> 16,
				i_26_ >> 16);
		    i_26_ += i_29_;
		    i_25_ += i_28_;
		    i_24_ += anInt12106;
		}
	    }
	} else {
	    i_25_ = i_27_ <<= 16;
	    if (i_24_ < 0) {
		i_25_ -= i_29_ * i_24_;
		i_27_ -= i_30_ * i_24_;
		i_24_ = 0;
	    }
	    i_26_ <<= 16;
	    if (i_23_ < 0) {
		i_26_ -= i_28_ * i_23_;
		i_23_ = 0;
	    }
	    if (i_29_ < i_30_) {
		i -= i_23_;
		i_23_ -= i_24_;
		i_24_ *= anInt12106;
		while (--i_23_ >= 0) {
		    method18763(aByteArray12110, i_24_, 0, i_25_ >> 16,
				i_27_ >> 16);
		    i_25_ += i_29_;
		    i_27_ += i_30_;
		    i_24_ += anInt12106;
		}
		while (--i >= 0) {
		    method18763(aByteArray12110, i_24_, 0, i_26_ >> 16,
				i_27_ >> 16);
		    i_26_ += i_28_;
		    i_27_ += i_30_;
		    i_24_ += anInt12106;
		}
	    } else {
		i -= i_23_;
		i_23_ -= i_24_;
		i_24_ *= anInt12106;
		while (--i_23_ >= 0) {
		    method18763(aByteArray12110, i_24_, 0, i_27_ >> 16,
				i_25_ >> 16);
		    i_25_ += i_29_;
		    i_27_ += i_30_;
		    i_24_ += anInt12106;
		}
		while (--i >= 0) {
		    method18763(aByteArray12110, i_24_, 0, i_27_ >> 16,
				i_26_ >> 16);
		    i_26_ += i_28_;
		    i_27_ += i_30_;
		    i_24_ += anInt12106;
		}
	    }
	}
    }
    
    void method18766() {
	int i = -1;
	int i_31_ = aByteArray12110.length - 8;
	while (i < i_31_) {
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	}
	while (i < aByteArray12110.length - 1)
	    aByteArray12110[++i] = (byte) 0;
    }
    
    Class525_Sub16_Sub17_Sub1(Class182_Sub3 class182_sub3, int i, int i_32_) {
	aByteArray12110 = new byte[i * i_32_];
    }
    
    void method18767() {
	int i = -1;
	int i_33_ = aByteArray12110.length - 8;
	while (i < i_33_) {
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	    aByteArray12110[++i] = (byte) 0;
	}
	while (i < aByteArray12110.length - 1)
	    aByteArray12110[++i] = (byte) 0;
    }
    
    void method18768(int i, int i_34_, int i_35_, int i_36_, int i_37_,
		     int i_38_) {
	int i_39_ = 0;
	if (i_34_ != i)
	    i_39_ = (i_37_ - i_36_ << 16) / (i_34_ - i);
	int i_40_ = 0;
	if (i_35_ != i_34_)
	    i_40_ = (i_38_ - i_37_ << 16) / (i_35_ - i_34_);
	int i_41_ = 0;
	if (i_35_ != i)
	    i_41_ = (i_36_ - i_38_ << 16) / (i - i_35_);
	if (i <= i_34_ && i <= i_35_) {
	    if (i_34_ < i_35_) {
		i_38_ = i_36_ <<= 16;
		if (i < 0) {
		    i_38_ -= i_41_ * i;
		    i_36_ -= i_39_ * i;
		    i = 0;
		}
		i_37_ <<= 16;
		if (i_34_ < 0) {
		    i_37_ -= i_40_ * i_34_;
		    i_34_ = 0;
		}
		if (i != i_34_ && i_41_ < i_39_
		    || i == i_34_ && i_41_ > i_40_) {
		    i_35_ -= i_34_;
		    i_34_ -= i;
		    i *= anInt12106;
		    while (--i_34_ >= 0) {
			method18763(aByteArray12110, i, 0, i_38_ >> 16,
				    i_36_ >> 16);
			i_38_ += i_41_;
			i_36_ += i_39_;
			i += anInt12106;
		    }
		    while (--i_35_ >= 0) {
			method18763(aByteArray12110, i, 0, i_38_ >> 16,
				    i_37_ >> 16);
			i_38_ += i_41_;
			i_37_ += i_40_;
			i += anInt12106;
		    }
		} else {
		    i_35_ -= i_34_;
		    i_34_ -= i;
		    i *= anInt12106;
		    while (--i_34_ >= 0) {
			method18763(aByteArray12110, i, 0, i_36_ >> 16,
				    i_38_ >> 16);
			i_38_ += i_41_;
			i_36_ += i_39_;
			i += anInt12106;
		    }
		    while (--i_35_ >= 0) {
			method18763(aByteArray12110, i, 0, i_37_ >> 16,
				    i_38_ >> 16);
			i_38_ += i_41_;
			i_37_ += i_40_;
			i += anInt12106;
		    }
		}
	    } else {
		i_37_ = i_36_ <<= 16;
		if (i < 0) {
		    i_37_ -= i_41_ * i;
		    i_36_ -= i_39_ * i;
		    i = 0;
		}
		i_38_ <<= 16;
		if (i_35_ < 0) {
		    i_38_ -= i_40_ * i_35_;
		    i_35_ = 0;
		}
		if (i != i_35_ && i_41_ < i_39_
		    || i == i_35_ && i_40_ > i_39_) {
		    i_34_ -= i_35_;
		    i_35_ -= i;
		    i *= anInt12106;
		    while (--i_35_ >= 0) {
			method18763(aByteArray12110, i, 0, i_37_ >> 16,
				    i_36_ >> 16);
			i_37_ += i_41_;
			i_36_ += i_39_;
			i += anInt12106;
		    }
		    while (--i_34_ >= 0) {
			method18763(aByteArray12110, i, 0, i_38_ >> 16,
				    i_36_ >> 16);
			i_38_ += i_40_;
			i_36_ += i_39_;
			i += anInt12106;
		    }
		} else {
		    i_34_ -= i_35_;
		    i_35_ -= i;
		    i *= anInt12106;
		    while (--i_35_ >= 0) {
			method18763(aByteArray12110, i, 0, i_36_ >> 16,
				    i_37_ >> 16);
			i_37_ += i_41_;
			i_36_ += i_39_;
			i += anInt12106;
		    }
		    while (--i_34_ >= 0) {
			method18763(aByteArray12110, i, 0, i_36_ >> 16,
				    i_38_ >> 16);
			i_38_ += i_40_;
			i_36_ += i_39_;
			i += anInt12106;
		    }
		}
	    }
	} else if (i_34_ <= i_35_) {
	    if (i_35_ < i) {
		i_36_ = i_37_ <<= 16;
		if (i_34_ < 0) {
		    i_36_ -= i_39_ * i_34_;
		    i_37_ -= i_40_ * i_34_;
		    i_34_ = 0;
		}
		i_38_ <<= 16;
		if (i_35_ < 0) {
		    i_38_ -= i_41_ * i_35_;
		    i_35_ = 0;
		}
		if (i_34_ != i_35_ && i_39_ < i_40_
		    || i_34_ == i_35_ && i_39_ > i_41_) {
		    i -= i_35_;
		    i_35_ -= i_34_;
		    i_34_ *= anInt12106;
		    while (--i_35_ >= 0) {
			method18763(aByteArray12110, i_34_, 0, i_36_ >> 16,
				    i_37_ >> 16);
			i_36_ += i_39_;
			i_37_ += i_40_;
			i_34_ += anInt12106;
		    }
		    while (--i >= 0) {
			method18763(aByteArray12110, i_34_, 0, i_36_ >> 16,
				    i_38_ >> 16);
			i_36_ += i_39_;
			i_38_ += i_41_;
			i_34_ += anInt12106;
		    }
		} else {
		    i -= i_35_;
		    i_35_ -= i_34_;
		    i_34_ *= anInt12106;
		    while (--i_35_ >= 0) {
			method18763(aByteArray12110, i_34_, 0, i_37_ >> 16,
				    i_36_ >> 16);
			i_36_ += i_39_;
			i_37_ += i_40_;
			i_34_ += anInt12106;
		    }
		    while (--i >= 0) {
			method18763(aByteArray12110, i_34_, 0, i_38_ >> 16,
				    i_36_ >> 16);
			i_36_ += i_39_;
			i_38_ += i_41_;
			i_34_ += anInt12106;
		    }
		}
	    } else {
		i_38_ = i_37_ <<= 16;
		if (i_34_ < 0) {
		    i_38_ -= i_39_ * i_34_;
		    i_37_ -= i_40_ * i_34_;
		    i_34_ = 0;
		}
		i_36_ <<= 16;
		if (i < 0) {
		    i_36_ -= i_41_ * i;
		    i = 0;
		}
		if (i_39_ < i_40_) {
		    i_35_ -= i;
		    i -= i_34_;
		    i_34_ *= anInt12106;
		    while (--i >= 0) {
			method18763(aByteArray12110, i_34_, 0, i_38_ >> 16,
				    i_37_ >> 16);
			i_38_ += i_39_;
			i_37_ += i_40_;
			i_34_ += anInt12106;
		    }
		    while (--i_35_ >= 0) {
			method18763(aByteArray12110, i_34_, 0, i_36_ >> 16,
				    i_37_ >> 16);
			i_36_ += i_41_;
			i_37_ += i_40_;
			i_34_ += anInt12106;
		    }
		} else {
		    i_35_ -= i;
		    i -= i_34_;
		    i_34_ *= anInt12106;
		    while (--i >= 0) {
			method18763(aByteArray12110, i_34_, 0, i_37_ >> 16,
				    i_38_ >> 16);
			i_38_ += i_39_;
			i_37_ += i_40_;
			i_34_ += anInt12106;
		    }
		    while (--i_35_ >= 0) {
			method18763(aByteArray12110, i_34_, 0, i_37_ >> 16,
				    i_36_ >> 16);
			i_36_ += i_41_;
			i_37_ += i_40_;
			i_34_ += anInt12106;
		    }
		}
	    }
	} else if (i < i_34_) {
	    i_37_ = i_38_ <<= 16;
	    if (i_35_ < 0) {
		i_37_ -= i_40_ * i_35_;
		i_38_ -= i_41_ * i_35_;
		i_35_ = 0;
	    }
	    i_36_ <<= 16;
	    if (i < 0) {
		i_36_ -= i_39_ * i;
		i = 0;
	    }
	    if (i_40_ < i_41_) {
		i_34_ -= i;
		i -= i_35_;
		i_35_ *= anInt12106;
		while (--i >= 0) {
		    method18763(aByteArray12110, i_35_, 0, i_37_ >> 16,
				i_38_ >> 16);
		    i_37_ += i_40_;
		    i_38_ += i_41_;
		    i_35_ += anInt12106;
		}
		while (--i_34_ >= 0) {
		    method18763(aByteArray12110, i_35_, 0, i_37_ >> 16,
				i_36_ >> 16);
		    i_37_ += i_40_;
		    i_36_ += i_39_;
		    i_35_ += anInt12106;
		}
	    } else {
		i_34_ -= i;
		i -= i_35_;
		i_35_ *= anInt12106;
		while (--i >= 0) {
		    method18763(aByteArray12110, i_35_, 0, i_38_ >> 16,
				i_37_ >> 16);
		    i_37_ += i_40_;
		    i_38_ += i_41_;
		    i_35_ += anInt12106;
		}
		while (--i_34_ >= 0) {
		    method18763(aByteArray12110, i_35_, 0, i_36_ >> 16,
				i_37_ >> 16);
		    i_37_ += i_40_;
		    i_36_ += i_39_;
		    i_35_ += anInt12106;
		}
	    }
	} else {
	    i_36_ = i_38_ <<= 16;
	    if (i_35_ < 0) {
		i_36_ -= i_40_ * i_35_;
		i_38_ -= i_41_ * i_35_;
		i_35_ = 0;
	    }
	    i_37_ <<= 16;
	    if (i_34_ < 0) {
		i_37_ -= i_39_ * i_34_;
		i_34_ = 0;
	    }
	    if (i_40_ < i_41_) {
		i -= i_34_;
		i_34_ -= i_35_;
		i_35_ *= anInt12106;
		while (--i_34_ >= 0) {
		    method18763(aByteArray12110, i_35_, 0, i_36_ >> 16,
				i_38_ >> 16);
		    i_36_ += i_40_;
		    i_38_ += i_41_;
		    i_35_ += anInt12106;
		}
		while (--i >= 0) {
		    method18763(aByteArray12110, i_35_, 0, i_37_ >> 16,
				i_38_ >> 16);
		    i_37_ += i_39_;
		    i_38_ += i_41_;
		    i_35_ += anInt12106;
		}
	    } else {
		i -= i_34_;
		i_34_ -= i_35_;
		i_35_ *= anInt12106;
		while (--i_34_ >= 0) {
		    method18763(aByteArray12110, i_35_, 0, i_38_ >> 16,
				i_36_ >> 16);
		    i_36_ += i_40_;
		    i_38_ += i_41_;
		    i_35_ += anInt12106;
		}
		while (--i >= 0) {
		    method18763(aByteArray12110, i_35_, 0, i_38_ >> 16,
				i_37_ >> 16);
		    i_37_ += i_39_;
		    i_38_ += i_41_;
		    i_35_ += anInt12106;
		}
	    }
	}
    }
    
    boolean method18769(int i, int i_42_) {
	return aByteArray12110.length >= i * i_42_;
    }
    
    void method18770(int i, int i_43_, int i_44_, int i_45_) {
	anInt12109 = i;
	anInt12111 = i_43_;
	anInt12106 = i_44_ - i;
	anInt12108 = i_45_ - i_43_;
    }
    
    static final void method18771(byte[] is, int i, int i_46_, int i_47_,
				  int i_48_) {
	if (i_47_ < i_48_) {
	    i += i_47_;
	    i_46_ = i_48_ - i_47_ >> 2;
	    while (--i_46_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    i_46_ = i_48_ - i_47_ & 0x3;
	    while (--i_46_ >= 0)
		is[i++] = (byte) 1;
	}
    }
}
