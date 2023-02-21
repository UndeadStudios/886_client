/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class12
{
    long[] aLongArray146;
    int anInt147;
    static final String aString148
	= "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
    int anInt149;
    static long[][] aLongArrayArray150 = new long[8][256];
    long[] aLongArray151;
    byte[] aByteArray152 = new byte[32];
    byte[] aByteArray153 = new byte[64];
    static final int anInt154 = 512;
    public static final int anInt155 = 64;
    static final int anInt156 = 10;
    long[] aLongArray157;
    long[] aLongArray158;
    static long[] aLongArray159 = new long[11];
    long[] aLongArray160;
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_0_
		= "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
		      .charAt(i / 2);
	    long l
		= 0 == (i & 0x1) ? (long) (i_0_ >>> 8) : (long) (i_0_ & 0xff);
	    long l_1_ = l << 1;
	    if (l_1_ >= 256L)
		l_1_ ^= 0x11dL;
	    long l_2_ = l_1_ << 1;
	    if (l_2_ >= 256L)
		l_2_ ^= 0x11dL;
	    long l_3_ = l_2_ ^ l;
	    long l_4_ = l_2_ << 1;
	    if (l_4_ >= 256L)
		l_4_ ^= 0x11dL;
	    long l_5_ = l_4_ ^ l;
	    aLongArrayArray150[0][i]
		= (l << 56 | l << 48 | l_2_ << 40 | l << 32 | l_4_ << 24
		   | l_3_ << 16 | l_1_ << 8 | l_5_);
	    for (int i_6_ = 1; i_6_ < 8; i_6_++)
		aLongArrayArray150[i_6_][i]
		    = (aLongArrayArray150[i_6_ - 1][i] >>> 8
		       | aLongArrayArray150[i_6_ - 1][i] << 56);
	}
	aLongArray159[0] = 0L;
	for (int i = 1; i <= 10; i++) {
	    int i_7_ = 8 * (i - 1);
	    aLongArray159[i]
		= (aLongArrayArray150[0][i_7_] & ~0xffffffffffffffL
		   ^ aLongArrayArray150[1][i_7_ + 1] & 0xff000000000000L
		   ^ aLongArrayArray150[2][2 + i_7_] & 0xff0000000000L
		   ^ aLongArrayArray150[3][3 + i_7_] & 0xff00000000L
		   ^ aLongArrayArray150[4][i_7_ + 4] & 0xff000000L
		   ^ aLongArrayArray150[5][5 + i_7_] & 0xff0000L
		   ^ aLongArrayArray150[6][i_7_ + 6] & 0xff00L
		   ^ aLongArrayArray150[7][i_7_ + 7] & 0xffL);
	}
    }
    
    public static byte[] method718(byte[] is, int i, int i_8_) {
	byte[] is_9_;
	if (i > 0) {
	    is_9_ = new byte[i_8_];
	    for (int i_10_ = 0; i_10_ < i_8_; i_10_++)
		is_9_[i_10_] = is[i_10_ + i];
	} else
	    is_9_ = is;
	Class12 class12 = new Class12();
	class12.method723(-1185090540);
	class12.method719(is_9_, (long) (i_8_ * 8));
	byte[] is_11_ = new byte[64];
	class12.method720(is_11_, 0, (byte) 0);
	return is_11_;
    }
    
    Class12() {
	anInt147 = 0;
	anInt149 = 0;
	aLongArray151 = new long[8];
	aLongArray157 = new long[8];
	aLongArray158 = new long[8];
	aLongArray146 = new long[8];
	aLongArray160 = new long[8];
    }
    
    void method719(byte[] is, long l) {
	int i = 0;
	int i_12_ = 8 - ((int) l & 0x7) & 0x7;
	int i_13_ = anInt147 * 323132573 & 0x7;
	long l_14_ = l;
	int i_15_ = 31;
	int i_16_ = 0;
	for (/**/; i_15_ >= 0; i_15_--) {
	    i_16_ += (aByteArray152[i_15_] & 0xff) + ((int) l_14_ & 0xff);
	    aByteArray152[i_15_] = (byte) i_16_;
	    i_16_ >>>= 8;
	    l_14_ >>>= 8;
	}
	while (l > 8L) {
	    int i_17_
		= is[i] << i_12_ & 0xff | (is[1 + i] & 0xff) >>> 8 - i_12_;
	    if (i_17_ < 0 || i_17_ >= 256)
		throw new RuntimeException();
	    aByteArray153[398959083 * anInt149] |= i_17_ >>> i_13_;
	    anInt149 += 1446674115;
	    anInt147 += 1034996149 * (8 - i_13_);
	    if (anInt147 * 323132573 == 512) {
		method721(989433190);
		anInt149 = 0;
		anInt147 = 0;
	    }
	    aByteArray153[398959083 * anInt149]
		= (byte) (i_17_ << 8 - i_13_ & 0xff);
	    anInt147 += 1034996149 * i_13_;
	    l -= 8L;
	    i++;
	}
	int i_18_;
	if (l > 0L) {
	    i_18_ = is[i] << i_12_ & 0xff;
	    aByteArray153[398959083 * anInt149] |= i_18_ >>> i_13_;
	} else
	    i_18_ = 0;
	if (l + (long) i_13_ < 8L)
	    anInt147 += l * 1034996149L;
	else {
	    anInt149 += 1446674115;
	    anInt147 += 1034996149 * (8 - i_13_);
	    l -= (long) (8 - i_13_);
	    if (anInt147 * 323132573 == 512) {
		method721(989433190);
		anInt149 = 0;
		anInt147 = 0;
	    }
	    aByteArray153[anInt149 * 398959083]
		= (byte) (i_18_ << 8 - i_13_ & 0xff);
	    anInt147 += 1034996149 * (int) l;
	}
    }
    
    void method720(byte[] is, int i, byte i_19_) {
	aByteArray153[anInt149 * 398959083]
	    |= 128 >>> (323132573 * anInt147 & 0x7);
	anInt149 += 1446674115;
	if (398959083 * anInt149 > 32) {
	    while (398959083 * anInt149 < 64)
		aByteArray153[(anInt149 += 1446674115) * 398959083 - 1]
		    = (byte) 0;
	    method721(989433190);
	    anInt149 = 0;
	}
	while (398959083 * anInt149 < 32)
	    aByteArray153[(anInt149 += 1446674115) * 398959083 - 1] = (byte) 0;
	System.arraycopy(aByteArray152, 0, aByteArray153, 32, 32);
	method721(989433190);
	int i_20_ = 0;
	int i_21_ = i;
	while (i_20_ < 8) {
	    long l = aLongArray151[i_20_];
	    is[i_21_] = (byte) (int) (l >>> 56);
	    is[i_21_ + 1] = (byte) (int) (l >>> 48);
	    is[i_21_ + 2] = (byte) (int) (l >>> 40);
	    is[i_21_ + 3] = (byte) (int) (l >>> 32);
	    is[4 + i_21_] = (byte) (int) (l >>> 24);
	    is[5 + i_21_] = (byte) (int) (l >>> 16);
	    is[i_21_ + 6] = (byte) (int) (l >>> 8);
	    is[i_21_ + 7] = (byte) (int) l;
	    i_20_++;
	    i_21_ += 8;
	}
    }
    
    void method721(int i) {
	int i_22_ = 0;
	int i_23_ = 0;
	while (i_22_ < 8) {
	    aLongArray146[i_22_]
		= ((long) aByteArray153[i_23_] << 56
		   ^ ((long) aByteArray153[i_23_ + 1] & 0xffL) << 48
		   ^ ((long) aByteArray153[2 + i_23_] & 0xffL) << 40
		   ^ ((long) aByteArray153[3 + i_23_] & 0xffL) << 32
		   ^ ((long) aByteArray153[4 + i_23_] & 0xffL) << 24
		   ^ ((long) aByteArray153[i_23_ + 5] & 0xffL) << 16
		   ^ ((long) aByteArray153[6 + i_23_] & 0xffL) << 8
		   ^ (long) aByteArray153[i_23_ + 7] & 0xffL);
	    i_22_++;
	    i_23_ += 8;
	}
	for (i_22_ = 0; i_22_ < 8; i_22_++)
	    aLongArray160[i_22_]
		= aLongArray146[i_22_] ^ (aLongArray157[i_22_]
					  = aLongArray151[i_22_]);
	for (i_22_ = 1; i_22_ <= 10; i_22_++) {
	    for (i_23_ = 0; i_23_ < 8; i_23_++) {
		aLongArray158[i_23_] = 0L;
		int i_24_ = 0;
		int i_25_ = 56;
		while (i_24_ < 8) {
		    aLongArray158[i_23_]
			^= (aLongArrayArray150[i_24_]
			    [(int) (aLongArray157[i_23_ - i_24_ & 0x7]
				    >>> i_25_) & 0xff]);
		    i_24_++;
		    i_25_ -= 8;
		}
	    }
	    for (i_23_ = 0; i_23_ < 8; i_23_++)
		aLongArray157[i_23_] = aLongArray158[i_23_];
	    aLongArray157[0] ^= aLongArray159[i_22_];
	    for (i_23_ = 0; i_23_ < 8; i_23_++) {
		aLongArray158[i_23_] = aLongArray157[i_23_];
		int i_26_ = 0;
		int i_27_ = 56;
		while (i_26_ < 8) {
		    aLongArray158[i_23_]
			^= (aLongArrayArray150[i_26_]
			    [(int) (aLongArray160[i_23_ - i_26_ & 0x7]
				    >>> i_27_) & 0xff]);
		    i_26_++;
		    i_27_ -= 8;
		}
	    }
	    for (i_23_ = 0; i_23_ < 8; i_23_++)
		aLongArray160[i_23_] = aLongArray158[i_23_];
	}
	for (i_22_ = 0; i_22_ < 8; i_22_++)
	    aLongArray151[i_22_]
		^= aLongArray160[i_22_] ^ aLongArray146[i_22_];
    }
    
    void method722() {
	int i = 0;
	int i_28_ = 0;
	while (i < 8) {
	    aLongArray146[i]
		= ((long) aByteArray153[i_28_] << 56
		   ^ ((long) aByteArray153[i_28_ + 1] & 0xffL) << 48
		   ^ ((long) aByteArray153[2 + i_28_] & 0xffL) << 40
		   ^ ((long) aByteArray153[3 + i_28_] & 0xffL) << 32
		   ^ ((long) aByteArray153[4 + i_28_] & 0xffL) << 24
		   ^ ((long) aByteArray153[i_28_ + 5] & 0xffL) << 16
		   ^ ((long) aByteArray153[6 + i_28_] & 0xffL) << 8
		   ^ (long) aByteArray153[i_28_ + 7] & 0xffL);
	    i++;
	    i_28_ += 8;
	}
	for (i = 0; i < 8; i++)
	    aLongArray160[i]
		= aLongArray146[i] ^ (aLongArray157[i] = aLongArray151[i]);
	for (i = 1; i <= 10; i++) {
	    for (i_28_ = 0; i_28_ < 8; i_28_++) {
		aLongArray158[i_28_] = 0L;
		int i_29_ = 0;
		int i_30_ = 56;
		while (i_29_ < 8) {
		    aLongArray158[i_28_]
			^= (aLongArrayArray150[i_29_]
			    [(int) (aLongArray157[i_28_ - i_29_ & 0x7]
				    >>> i_30_) & 0xff]);
		    i_29_++;
		    i_30_ -= 8;
		}
	    }
	    for (i_28_ = 0; i_28_ < 8; i_28_++)
		aLongArray157[i_28_] = aLongArray158[i_28_];
	    aLongArray157[0] ^= aLongArray159[i];
	    for (i_28_ = 0; i_28_ < 8; i_28_++) {
		aLongArray158[i_28_] = aLongArray157[i_28_];
		int i_31_ = 0;
		int i_32_ = 56;
		while (i_31_ < 8) {
		    aLongArray158[i_28_]
			^= (aLongArrayArray150[i_31_]
			    [(int) (aLongArray160[i_28_ - i_31_ & 0x7]
				    >>> i_32_) & 0xff]);
		    i_31_++;
		    i_32_ -= 8;
		}
	    }
	    for (i_28_ = 0; i_28_ < 8; i_28_++)
		aLongArray160[i_28_] = aLongArray158[i_28_];
	}
	for (i = 0; i < 8; i++)
	    aLongArray151[i] ^= aLongArray160[i] ^ aLongArray146[i];
    }
    
    void method723(int i) {
	for (int i_33_ = 0; i_33_ < 32; i_33_++)
	    aByteArray152[i_33_] = (byte) 0;
	anInt149 = 0;
	anInt147 = 0;
	aByteArray153[0] = (byte) 0;
	for (int i_34_ = 0; i_34_ < 8; i_34_++)
	    aLongArray151[i_34_] = 0L;
    }
    
    void method724(byte[] is, long l) {
	int i = 0;
	int i_35_ = 8 - ((int) l & 0x7) & 0x7;
	int i_36_ = anInt147 * 323132573 & 0x7;
	long l_37_ = l;
	int i_38_ = 31;
	int i_39_ = 0;
	for (/**/; i_38_ >= 0; i_38_--) {
	    i_39_ += (aByteArray152[i_38_] & 0xff) + ((int) l_37_ & 0xff);
	    aByteArray152[i_38_] = (byte) i_39_;
	    i_39_ >>>= 8;
	    l_37_ >>>= 8;
	}
	while (l > 8L) {
	    int i_40_
		= is[i] << i_35_ & 0xff | (is[1 + i] & 0xff) >>> 8 - i_35_;
	    if (i_40_ < 0 || i_40_ >= 256)
		throw new RuntimeException();
	    aByteArray153[398959083 * anInt149] |= i_40_ >>> i_36_;
	    anInt149 += 1446674115;
	    anInt147 += 1034996149 * (8 - i_36_);
	    if (anInt147 * 323132573 == 512) {
		method721(989433190);
		anInt149 = 0;
		anInt147 = 0;
	    }
	    aByteArray153[398959083 * anInt149]
		= (byte) (i_40_ << 8 - i_36_ & 0xff);
	    anInt147 += 1034996149 * i_36_;
	    l -= 8L;
	    i++;
	}
	int i_41_;
	if (l > 0L) {
	    i_41_ = is[i] << i_35_ & 0xff;
	    aByteArray153[398959083 * anInt149] |= i_41_ >>> i_36_;
	} else
	    i_41_ = 0;
	if (l + (long) i_36_ < 8L)
	    anInt147 += l * 1034996149L;
	else {
	    anInt149 += 1446674115;
	    anInt147 += 1034996149 * (8 - i_36_);
	    l -= (long) (8 - i_36_);
	    if (anInt147 * 323132573 == 512) {
		method721(989433190);
		anInt149 = 0;
		anInt147 = 0;
	    }
	    aByteArray153[anInt149 * 398959083]
		= (byte) (i_41_ << 8 - i_36_ & 0xff);
	    anInt147 += 1034996149 * (int) l;
	}
    }
    
    void method725(byte[] is, long l) {
	int i = 0;
	int i_42_ = 8 - ((int) l & 0x7) & 0x7;
	int i_43_ = anInt147 * 323132573 & 0x7;
	long l_44_ = l;
	int i_45_ = 31;
	int i_46_ = 0;
	for (/**/; i_45_ >= 0; i_45_--) {
	    i_46_ += (aByteArray152[i_45_] & 0xff) + ((int) l_44_ & 0xff);
	    aByteArray152[i_45_] = (byte) i_46_;
	    i_46_ >>>= 8;
	    l_44_ >>>= 8;
	}
	while (l > 8L) {
	    int i_47_
		= is[i] << i_42_ & 0xff | (is[1 + i] & 0xff) >>> 8 - i_42_;
	    if (i_47_ < 0 || i_47_ >= 256)
		throw new RuntimeException();
	    aByteArray153[398959083 * anInt149] |= i_47_ >>> i_43_;
	    anInt149 += 1446674115;
	    anInt147 += 1034996149 * (8 - i_43_);
	    if (anInt147 * 323132573 == 512) {
		method721(989433190);
		anInt149 = 0;
		anInt147 = 0;
	    }
	    aByteArray153[398959083 * anInt149]
		= (byte) (i_47_ << 8 - i_43_ & 0xff);
	    anInt147 += 1034996149 * i_43_;
	    l -= 8L;
	    i++;
	}
	int i_48_;
	if (l > 0L) {
	    i_48_ = is[i] << i_42_ & 0xff;
	    aByteArray153[398959083 * anInt149] |= i_48_ >>> i_43_;
	} else
	    i_48_ = 0;
	if (l + (long) i_43_ < 8L)
	    anInt147 += l * 1034996149L;
	else {
	    anInt149 += 1446674115;
	    anInt147 += 1034996149 * (8 - i_43_);
	    l -= (long) (8 - i_43_);
	    if (anInt147 * 323132573 == 512) {
		method721(989433190);
		anInt149 = 0;
		anInt147 = 0;
	    }
	    aByteArray153[anInt149 * 398959083]
		= (byte) (i_48_ << 8 - i_43_ & 0xff);
	    anInt147 += 1034996149 * (int) l;
	}
    }
    
    void method726(byte[] is, int i) {
	aByteArray153[anInt149 * 398959083]
	    |= 128 >>> (323132573 * anInt147 & 0x7);
	anInt149 += 1446674115;
	if (398959083 * anInt149 > 32) {
	    while (398959083 * anInt149 < 64)
		aByteArray153[(anInt149 += 1446674115) * 398959083 - 1]
		    = (byte) 0;
	    method721(989433190);
	    anInt149 = 0;
	}
	while (398959083 * anInt149 < 32)
	    aByteArray153[(anInt149 += 1446674115) * 398959083 - 1] = (byte) 0;
	System.arraycopy(aByteArray152, 0, aByteArray153, 32, 32);
	method721(989433190);
	int i_49_ = 0;
	int i_50_ = i;
	while (i_49_ < 8) {
	    long l = aLongArray151[i_49_];
	    is[i_50_] = (byte) (int) (l >>> 56);
	    is[i_50_ + 1] = (byte) (int) (l >>> 48);
	    is[i_50_ + 2] = (byte) (int) (l >>> 40);
	    is[i_50_ + 3] = (byte) (int) (l >>> 32);
	    is[4 + i_50_] = (byte) (int) (l >>> 24);
	    is[5 + i_50_] = (byte) (int) (l >>> 16);
	    is[i_50_ + 6] = (byte) (int) (l >>> 8);
	    is[i_50_ + 7] = (byte) (int) l;
	    i_49_++;
	    i_50_ += 8;
	}
    }
    
    void method727(byte[] is, int i) {
	aByteArray153[anInt149 * 398959083]
	    |= 128 >>> (323132573 * anInt147 & 0x7);
	anInt149 += 1446674115;
	if (398959083 * anInt149 > 32) {
	    while (398959083 * anInt149 < 64)
		aByteArray153[(anInt149 += 1446674115) * 398959083 - 1]
		    = (byte) 0;
	    method721(989433190);
	    anInt149 = 0;
	}
	while (398959083 * anInt149 < 32)
	    aByteArray153[(anInt149 += 1446674115) * 398959083 - 1] = (byte) 0;
	System.arraycopy(aByteArray152, 0, aByteArray153, 32, 32);
	method721(989433190);
	int i_51_ = 0;
	int i_52_ = i;
	while (i_51_ < 8) {
	    long l = aLongArray151[i_51_];
	    is[i_52_] = (byte) (int) (l >>> 56);
	    is[i_52_ + 1] = (byte) (int) (l >>> 48);
	    is[i_52_ + 2] = (byte) (int) (l >>> 40);
	    is[i_52_ + 3] = (byte) (int) (l >>> 32);
	    is[4 + i_52_] = (byte) (int) (l >>> 24);
	    is[5 + i_52_] = (byte) (int) (l >>> 16);
	    is[i_52_ + 6] = (byte) (int) (l >>> 8);
	    is[i_52_ + 7] = (byte) (int) l;
	    i_51_++;
	    i_52_ += 8;
	}
    }
    
    void method728(byte[] is, int i) {
	aByteArray153[anInt149 * 398959083]
	    |= 128 >>> (323132573 * anInt147 & 0x7);
	anInt149 += 1446674115;
	if (398959083 * anInt149 > 32) {
	    while (398959083 * anInt149 < 64)
		aByteArray153[(anInt149 += 1446674115) * 398959083 - 1]
		    = (byte) 0;
	    method721(989433190);
	    anInt149 = 0;
	}
	while (398959083 * anInt149 < 32)
	    aByteArray153[(anInt149 += 1446674115) * 398959083 - 1] = (byte) 0;
	System.arraycopy(aByteArray152, 0, aByteArray153, 32, 32);
	method721(989433190);
	int i_53_ = 0;
	int i_54_ = i;
	while (i_53_ < 8) {
	    long l = aLongArray151[i_53_];
	    is[i_54_] = (byte) (int) (l >>> 56);
	    is[i_54_ + 1] = (byte) (int) (l >>> 48);
	    is[i_54_ + 2] = (byte) (int) (l >>> 40);
	    is[i_54_ + 3] = (byte) (int) (l >>> 32);
	    is[4 + i_54_] = (byte) (int) (l >>> 24);
	    is[5 + i_54_] = (byte) (int) (l >>> 16);
	    is[i_54_ + 6] = (byte) (int) (l >>> 8);
	    is[i_54_ + 7] = (byte) (int) l;
	    i_53_++;
	    i_54_ += 8;
	}
    }
    
    void method729(byte[] is, int i) {
	aByteArray153[anInt149 * 398959083]
	    |= 128 >>> (323132573 * anInt147 & 0x7);
	anInt149 += 1446674115;
	if (398959083 * anInt149 > 32) {
	    while (398959083 * anInt149 < 64)
		aByteArray153[(anInt149 += 1446674115) * 398959083 - 1]
		    = (byte) 0;
	    method721(989433190);
	    anInt149 = 0;
	}
	while (398959083 * anInt149 < 32)
	    aByteArray153[(anInt149 += 1446674115) * 398959083 - 1] = (byte) 0;
	System.arraycopy(aByteArray152, 0, aByteArray153, 32, 32);
	method721(989433190);
	int i_55_ = 0;
	int i_56_ = i;
	while (i_55_ < 8) {
	    long l = aLongArray151[i_55_];
	    is[i_56_] = (byte) (int) (l >>> 56);
	    is[i_56_ + 1] = (byte) (int) (l >>> 48);
	    is[i_56_ + 2] = (byte) (int) (l >>> 40);
	    is[i_56_ + 3] = (byte) (int) (l >>> 32);
	    is[4 + i_56_] = (byte) (int) (l >>> 24);
	    is[5 + i_56_] = (byte) (int) (l >>> 16);
	    is[i_56_ + 6] = (byte) (int) (l >>> 8);
	    is[i_56_ + 7] = (byte) (int) l;
	    i_55_++;
	    i_56_ += 8;
	}
    }
    
    public static byte[] method730(byte[] is, int i, int i_57_) {
	byte[] is_58_;
	if (i > 0) {
	    is_58_ = new byte[i_57_];
	    for (int i_59_ = 0; i_59_ < i_57_; i_59_++)
		is_58_[i_59_] = is[i_59_ + i];
	} else
	    is_58_ = is;
	Class12 class12 = new Class12();
	class12.method723(-1786642364);
	class12.method719(is_58_, (long) (i_57_ * 8));
	byte[] is_60_ = new byte[64];
	class12.method720(is_60_, 0, (byte) 0);
	return is_60_;
    }
    
    void method731() {
	for (int i = 0; i < 32; i++)
	    aByteArray152[i] = (byte) 0;
	anInt149 = 0;
	anInt147 = 0;
	aByteArray153[0] = (byte) 0;
	for (int i = 0; i < 8; i++)
	    aLongArray151[i] = 0L;
    }
    
    public static byte[] method732(byte[] is, int i, int i_61_) {
	byte[] is_62_;
	if (i > 0) {
	    is_62_ = new byte[i_61_];
	    for (int i_63_ = 0; i_63_ < i_61_; i_63_++)
		is_62_[i_63_] = is[i_63_ + i];
	} else
	    is_62_ = is;
	Class12 class12 = new Class12();
	class12.method723(1824700745);
	class12.method719(is_62_, (long) (i_61_ * 8));
	byte[] is_64_ = new byte[64];
	class12.method720(is_64_, 0, (byte) 0);
	return is_64_;
    }
    
    public static byte[] method733(byte[] is, int i, int i_65_) {
	byte[] is_66_;
	if (i > 0) {
	    is_66_ = new byte[i_65_];
	    for (int i_67_ = 0; i_67_ < i_65_; i_67_++)
		is_66_[i_67_] = is[i_67_ + i];
	} else
	    is_66_ = is;
	Class12 class12 = new Class12();
	class12.method723(1587456717);
	class12.method719(is_66_, (long) (i_65_ * 8));
	byte[] is_68_ = new byte[64];
	class12.method720(is_68_, 0, (byte) 0);
	return is_68_;
    }
    
    public static byte[] method734(byte[] is, int i, int i_69_) {
	byte[] is_70_;
	if (i > 0) {
	    is_70_ = new byte[i_69_];
	    for (int i_71_ = 0; i_71_ < i_69_; i_71_++)
		is_70_[i_71_] = is[i_71_ + i];
	} else
	    is_70_ = is;
	Class12 class12 = new Class12();
	class12.method723(281128425);
	class12.method719(is_70_, (long) (i_69_ * 8));
	byte[] is_72_ = new byte[64];
	class12.method720(is_72_, 0, (byte) 0);
	return is_72_;
    }
}
