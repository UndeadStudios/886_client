/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class339
{
    static Object anObject3631;
    static final int anInt3632 = 128;
    public static final int anInt3633 = 16;
    Class182_Sub1 aClass182_Sub1_3634;
    public boolean aBool3635;
    static final int anInt3636 = 128;
    Interface37 anInterface37_3637;
    public Interface38[] anInterface38Array3638;
    static Object anObject3639;
    public Interface37 anInterface37_3640;
    Interface38[] anInterface38Array3641 = null;
    public Interface37 anInterface37_3642;
    static Object anObject3643;
    
    public boolean method5975() {
	return (aBool3635 ? anInterface37_3637 != null
		: anInterface38Array3641 != null);
    }
    
    Class339(Class182_Sub1 class182_sub1) {
	anInterface37_3637 = null;
	anInterface38Array3638 = null;
	anInterface37_3642 = null;
	anInterface37_3640 = null;
	aClass182_Sub1_3634 = class182_sub1;
	aBool3635 = aClass182_Sub1_3634.aBool9307;
	if (aBool3635 && !aClass182_Sub1_3634.aBool9308)
	    aBool3635 = false;
	if (aBool3635
	    && !aClass182_Sub1_3634.method14855(Class165.aClass165_1776,
						Class178.aClass178_1905))
	    aBool3635 = false;
	if (aBool3635
	    || aClass182_Sub1_3634.method14705(Class165.aClass165_1776,
					       Class178.aClass178_1905)) {
	    method5976();
	    if (!aBool3635) {
		anInterface38Array3641 = new Interface38[16];
		for (int i = 0; i < 16; i++) {
		    byte[] is = Class36.method980(anObject3639, i * 32768,
						  32768, 786419831);
		    anInterface38Array3641[i]
			= aClass182_Sub1_3634.method14724((Class165
							   .aClass165_1776),
							  128, 128, true, is);
		}
		anInterface38Array3638 = new Interface38[16];
		for (int i = 0; i < 16; i++) {
		    byte[] is = Class36.method980(anObject3631, i * 32768,
						  32768, 1825550083);
		    anInterface38Array3638[i]
			= aClass182_Sub1_3634.method14724((Class165
							   .aClass165_1776),
							  128, 128, true, is);
		}
	    } else {
		byte[] is = Class23.method830(anObject3639, false, -870433644);
		anInterface37_3637
		    = aClass182_Sub1_3634.method14886(Class165.aClass165_1776,
						      128, 128, 16, true, is);
		is = Class23.method830(anObject3631, false, -1663249095);
		anInterface37_3642
		    = aClass182_Sub1_3634.method14886(Class165.aClass165_1776,
						      128, 128, 16, true, is);
	    }
	}
    }
    
    static void method5976() {
	if (anObject3639 == null) {
	    Class415_Sub1_Sub2 class415_sub1_sub2 = new Class415_Sub1_Sub2();
	    byte[] is = class415_sub1_sub2.method18197(128, 128, 16);
	    anObject3639
		= Class525_Sub16_Sub6.method18288(is, false, -1415971484);
	}
	if (anObject3631 == null) {
	    Class415_Sub2_Sub2 class415_sub2_sub2 = new Class415_Sub2_Sub2();
	    byte[] is = class415_sub2_sub2.method18183(128, 128, 16);
	    anObject3631
		= Class525_Sub16_Sub6.method18288(is, false, -147826682);
	}
    }
    
    public boolean method5977() {
	return (aBool3635 ? anInterface37_3637 != null
		: anInterface38Array3641 != null);
    }
    
    public boolean method5978() {
	return (aBool3635 ? anInterface37_3637 != null
		: anInterface38Array3641 != null);
    }
    
    public boolean method5979() {
	if (!aClass182_Sub1_3634.aBool9307)
	    return false;
	if (anInterface37_3640 == null) {
	    if (anObject3643 == null) {
		byte[] is = Class542.method8906(128, 128, 16, 8,
						new Class527_Sub1(419684),
						4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
		anObject3643
		    = Class525_Sub16_Sub6.method18288(is, false, -1652298737);
	    }
	    byte[] is = Class23.method830(anObject3643, false, 1552104548);
	    byte[] is_0_ = new byte[is.length * 4];
	    int i = 0;
	    for (int i_1_ = 0; i_1_ < 16; i_1_++) {
		int i_2_ = i_1_ * 16384;
		int i_3_ = i_2_;
		for (int i_4_ = 0; i_4_ < 128; i_4_++) {
		    int i_5_ = i_3_ + i_4_ * 128;
		    int i_6_ = i_3_ + (i_4_ - 1 & 0x7f) * 128;
		    int i_7_ = i_3_ + (i_4_ + 1 & 0x7f) * 128;
		    for (int i_8_ = 0; i_8_ < 128; i_8_++) {
			float f = (float) ((is[i_6_ + i_8_] & 0xff)
					   - (is[i_7_ + i_8_] & 0xff));
			float f_9_
			    = (float) ((is[i_5_ + (i_8_ - 1 & 0x7f)] & 0xff)
				       - (is[i_5_ + (i_8_ + 1 & 0x7f)]
					  & 0xff));
			float f_10_
			    = (float) (128.0 / Math.sqrt((double) (f_9_ * f_9_
								   + 16384.0F
								   + f * f)));
			is_0_[i++] = (byte) (int) (f_9_ * f_10_ + 127.0F);
			is_0_[i++] = (byte) (int) (128.0F * f_10_ + 127.0F);
			is_0_[i++] = (byte) (int) (f * f_10_ + 127.0F);
			is_0_[i++] = is[i_2_++];
		    }
		}
	    }
	    anInterface37_3640
		= aClass182_Sub1_3634.method14886(Class165.aClass165_1771, 128,
						  128, 16, true, is_0_);
	}
	return anInterface37_3640 != null;
    }
    
    public boolean method5980() {
	return (aBool3635 ? anInterface37_3637 != null
		: anInterface38Array3641 != null);
    }
    
    public boolean method5981() {
	return (aBool3635 ? anInterface37_3637 != null
		: anInterface38Array3641 != null);
    }
}
