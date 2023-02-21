/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class24
{
    protected int anInt227;
    protected int anInt228;
    protected int anInt229;
    protected int anInt230;
    protected int anInt231;
    protected int anInt232;
    protected boolean aBool233;
    protected boolean aBool234;
    protected int anInt235;
    public static boolean aBool236;
    
    Class24(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
	    boolean bool, boolean bool_5_, int i_6_) {
	anInt235 = -1179066789 * i;
	anInt231 = 1583519327 * i_0_;
	anInt229 = 1190522441 * (i_1_ > 65535 ? 65535 : i_1_);
	anInt227 = -298863017 * i_2_;
	anInt228 = -1860355145 * (i_3_ > 255 ? 255 : i_3_);
	anInt232 = 1013307715 * i_4_;
	aBool233 = bool;
	aBool234 = bool_5_;
	anInt230 = i_6_ * -673522485;
    }
    
    public static void method831(int i, int i_7_, int i_8_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(17, (long) i_7_ << 32 | (long) i);
	class525_sub16_sub10.method18350((byte) 78);
    }
    
    static final void method832(Class683 class683, byte i) {
	int i_9_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_9_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2612 * 1693654607;
    }
}
