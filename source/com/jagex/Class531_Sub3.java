/* Class531_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class531_Sub3 extends Class531
{
    public int anInt10317;
    public int anInt10318;
    public int anInt10319;
    public int anInt10320;
    
    void method15937(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
	anInt10317 = 583600285 * i;
	anInt10318 = i_0_ * -772135907;
	anInt10319 = i_1_ * -1423269965;
	anInt10320 = i_2_ * 1356752639;
    }
    
    void method15938(int i, int i_4_, int i_5_, int i_6_) {
	anInt10317 = 583600285 * i;
	anInt10318 = i_4_ * -772135907;
	anInt10319 = i_5_ * -1423269965;
	anInt10320 = i_6_ * 1356752639;
    }
    
    void method15939(int i, int i_7_, int i_8_, int i_9_) {
	anInt10317 = 583600285 * i;
	anInt10318 = i_7_ * -772135907;
	anInt10319 = i_8_ * -1423269965;
	anInt10320 = i_9_ * 1356752639;
    }
    
    void method15940(int i, int i_10_, int i_11_, int i_12_) {
	anInt10317 = 583600285 * i;
	anInt10318 = i_10_ * -772135907;
	anInt10319 = i_11_ * -1423269965;
	anInt10320 = i_12_ * 1356752639;
    }
    
    Class531_Sub3(int i, int i_13_, int i_14_, int i_15_) {
	anInt10317 = i * 583600285;
	anInt10318 = i_13_ * -772135907;
	anInt10319 = -1423269965 * i_14_;
	anInt10320 = i_15_ * 1356752639;
    }
    
    void method15941(int i, int i_16_, int i_17_, int i_18_) {
	anInt10317 = 583600285 * i;
	anInt10318 = i_16_ * -772135907;
	anInt10319 = i_17_ * -1423269965;
	anInt10320 = i_18_ * 1356752639;
    }
    
    void method15942(int i, int i_19_, int i_20_, int i_21_) {
	anInt10317 = 583600285 * i;
	anInt10318 = i_19_ * -772135907;
	anInt10319 = i_20_ * -1423269965;
	anInt10320 = i_21_ * 1356752639;
    }
    
    public static String method15943(byte[] is, int i, int i_22_, byte i_23_) {
	char[] cs = new char[i_22_];
	int i_24_ = 0;
	int i_25_ = i;
	int i_26_ = i_22_ + i;
	while (i_25_ < i_26_) {
	    int i_27_ = is[i_25_++] & 0xff;
	    int i_28_;
	    if (i_27_ < 128) {
		if (0 == i_27_)
		    i_28_ = 65533;
		else
		    i_28_ = i_27_;
	    } else if (i_27_ < 192)
		i_28_ = 65533;
	    else if (i_27_ < 224) {
		if (i_25_ < i_26_ && 128 == (is[i_25_] & 0xc0)) {
		    i_28_ = (i_27_ & 0x1f) << 6 | is[i_25_++] & 0x3f;
		    if (i_28_ < 128)
			i_28_ = 65533;
		} else
		    i_28_ = 65533;
	    } else if (i_27_ < 240) {
		if (1 + i_25_ < i_26_ && (is[i_25_] & 0xc0) == 128
		    && 128 == (is[i_25_ + 1] & 0xc0)) {
		    i_28_ = ((i_27_ & 0xf) << 12 | (is[i_25_++] & 0x3f) << 6
			     | is[i_25_++] & 0x3f);
		    if (i_28_ < 2048)
			i_28_ = 65533;
		} else
		    i_28_ = 65533;
	    } else if (i_27_ < 248) {
		if (i_25_ + 2 < i_26_ && 128 == (is[i_25_] & 0xc0)
		    && (is[1 + i_25_] & 0xc0) == 128
		    && (is[i_25_ + 2] & 0xc0) == 128) {
		    i_28_ = ((i_27_ & 0x7) << 18 | (is[i_25_++] & 0x3f) << 12
			     | (is[i_25_++] & 0x3f) << 6 | is[i_25_++] & 0x3f);
		    if (i_28_ < 65536 || i_28_ > 1114111)
			i_28_ = 65533;
		    else
			i_28_ = 65533;
		} else
		    i_28_ = 65533;
	    } else
		i_28_ = 65533;
	    cs[i_24_++] = (char) i_28_;
	}
	return new String(cs, 0, i_24_);
    }
    
    static void method15944(int i, int i_29_, int i_30_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(13, (long) i);
	class525_sub16_sub10.method18361((byte) 122);
	class525_sub16_sub10.anInt11817 = i_29_ * -1179952119;
    }
}
