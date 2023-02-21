/* Class525_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class525_Sub3 extends Class525
{
    Class182_Sub1 aClass182_Sub1_10441;
    Class161_Sub3 aClass161_Sub3_10442;
    Class525_Sub21 aClass525_Sub21_10443;
    int anInt10444;
    Interface35 anInterface35_10445;
    int anInt10446;
    int anInt10447;
    int anInt10448 = 0;
    int anInt10449 = 0;
    Interface44 anInterface44_10450;
    float[][] aFloatArrayArray10451;
    int anInt10452;
    float[][] aFloatArrayArray10453;
    int anInt10454;
    float[][] aFloatArrayArray10455;
    Class10 aClass10_10456;
    ByteBuffer aByteBuffer10457;
    
    void method16092() {
	anInterface44_10450 = aClass182_Sub1_10441.method14701(false);
	anInterface44_10450.method29(anInt10444);
	anInterface35_10445 = aClass182_Sub1_10441.method14761(false);
	anInterface35_10445.method225(anInt10448 * 16, 16);
	anInterface35_10445.method215(0, anInt10448 * 16,
				      aClass182_Sub1_10441.aLong9160);
	anInterface44_10450.method215(0, anInt10444 * 2,
				      (aClass182_Sub1_10441.aLong9160
				       + (long) (aClass182_Sub1_10441.anInt9162
						 >> 1)));
    }
    
    void method16093() {
	anInterface44_10450 = aClass182_Sub1_10441.method14701(false);
	anInterface44_10450.method29(anInt10444);
	anInterface35_10445 = aClass182_Sub1_10441.method14761(false);
	anInterface35_10445.method225(anInt10448 * 16, 16);
	anInterface35_10445.method215(0, anInt10448 * 16,
				      aClass182_Sub1_10441.aLong9160);
	anInterface44_10450.method215(0, anInt10444 * 2,
				      (aClass182_Sub1_10441.aLong9160
				       + (long) (aClass182_Sub1_10441.anInt9162
						 >> 1)));
    }
    
    Class525_Sub3(Class182_Sub1 class182_sub1, Class161_Sub3 class161_sub3,
		  Class525_Sub21 class525_sub21, int[] is) {
	anInt10444 = 0;
	aClass182_Sub1_10441 = class182_sub1;
	aClass525_Sub21_10443 = class525_sub21;
	aClass161_Sub3_10442 = class161_sub3;
	int i = (aClass525_Sub21_10443.method16332(2042288544)
		 - (class161_sub3.anInt1761 * 435863595 >> 1));
	anInt10452 = (aClass525_Sub21_10443.method16314(1642284802) - i
		      >> class161_sub3.anInt1763 * -2063427645);
	anInt10454 = (aClass525_Sub21_10443.method16314(-792424432) + i
		      >> class161_sub3.anInt1763 * -2063427645);
	anInt10446 = (aClass525_Sub21_10443.method16301((byte) 6) - i
		      >> class161_sub3.anInt1763 * -2063427645);
	anInt10447 = (aClass525_Sub21_10443.method16301((byte) 6) + i
		      >> class161_sub3.anInt1763 * -2063427645);
	int i_0_ = anInt10454 - anInt10452 + 1;
	int i_1_ = anInt10447 - anInt10446 + 1;
	aFloatArrayArray10453 = new float[i_0_ + 1][i_1_ + 1];
	aFloatArrayArray10451 = new float[i_0_ + 1][i_1_ + 1];
	aFloatArrayArray10455 = new float[i_0_ + 1][i_1_ + 1];
	for (int i_2_ = 0; i_2_ <= i_1_; i_2_++) {
	    int i_3_ = i_2_ + anInt10446;
	    if (i_3_ > 0
		&& i_3_ < aClass161_Sub3_10442.anInt1760 * -1152334393 - 1) {
		for (int i_4_ = 0; i_4_ <= i_0_; i_4_++) {
		    int i_5_ = i_4_ + anInt10452;
		    if (i_5_ > 0
			&& i_5_ < (aClass161_Sub3_10442.anInt1759 * 363736815
				   - 1)) {
			int i_6_ = (class161_sub3.method2577(i_5_ + 1, i_3_,
							     (byte) 51)
				    - class161_sub3.method2577(i_5_ - 1, i_3_,
							       (byte) -7));
			int i_7_ = (class161_sub3.method2577(i_5_, i_3_ + 1,
							     (byte) -5)
				    - class161_sub3.method2577(i_5_, i_3_ - 1,
							       (byte) -49));
			float f
			    = (float) (1.0
				       / Math.sqrt((double) (i_6_ * i_6_
							     + 65536
							     + i_7_ * i_7_)));
			aFloatArrayArray10453[i_4_][i_2_] = (float) i_6_ * f;
			aFloatArrayArray10451[i_4_][i_2_] = -256.0F * f;
			aFloatArrayArray10455[i_4_][i_2_] = (float) i_7_ * f;
		    }
		}
	    }
	}
	int i_8_ = 0;
	for (int i_9_ = anInt10446; i_9_ <= anInt10447; i_9_++) {
	    if (i_9_ >= 0 && i_9_ < class161_sub3.anInt1760 * -1152334393) {
		for (int i_10_ = anInt10452; i_10_ <= anInt10454; i_10_++) {
		    if (i_10_ >= 0
			&& i_10_ < class161_sub3.anInt1759 * 363736815) {
			int i_11_ = is[i_8_];
			int[] is_12_ = (class161_sub3.anIntArrayArrayArray9855
					[i_10_][i_9_]);
			if (is_12_ != null && i_11_ != 0) {
			    if (i_11_ == 1) {
				for (int i_13_ = 0; i_13_ < is_12_.length;
				     i_13_ += 3) {
				    if (is_12_[i_13_] != -1
					&& is_12_[i_13_ + 1] != -1
					&& is_12_[i_13_ + 2] != -1)
					anInt10449 += 3;
				}
			    } else
				anInt10449 += 3;
			}
		    }
		    i_8_++;
		}
	    } else
		i_8_ += anInt10454 - anInt10452;
	}
	if (anInt10449 > 0) {
	    aClass10_10456
		= new Class10(Class212.method3935(anInt10449, -2056250364));
	    aByteBuffer10457 = aClass182_Sub1_10441.aByteBuffer9271;
	    aByteBuffer10457.clear();
	    aByteBuffer10457.position(aClass182_Sub1_10441.anInt9162 >> 1);
	    aByteBuffer10457.slice();
	    aByteBuffer10457.position(0);
	    aByteBuffer10457.limit(aClass182_Sub1_10441.anInt9162 >> 1);
	    int i_14_ = 0;
	    i_8_ = 0;
	    for (int i_15_ = anInt10446; i_15_ <= anInt10447; i_15_++) {
		if (i_15_ >= 0
		    && i_15_ < class161_sub3.anInt1760 * -1152334393) {
		    int i_16_ = 0;
		    for (int i_17_ = anInt10452; i_17_ <= anInt10454;
			 i_17_++) {
			if (i_17_ >= 0
			    && i_17_ < class161_sub3.anInt1759 * 363736815) {
			    int i_18_ = is[i_8_];
			    int[] is_19_
				= (class161_sub3.anIntArrayArrayArray9855
				   [i_17_][i_15_]);
			    if (is_19_ != null && i_18_ != 0) {
				if (i_18_ == 1) {
				    int[] is_20_ = (class161_sub3
						    .anIntArrayArrayArray9848
						    [i_17_][i_15_]);
				    int[] is_21_ = (class161_sub3
						    .anIntArrayArrayArray9858
						    [i_17_][i_15_]);
				    int i_22_ = 0;
				    while (i_22_ < is_19_.length) {
					if (is_19_[i_22_] != -1
					    && is_19_[i_22_ + 1] != -1
					    && is_19_[i_22_ + 2] != -1) {
					    method16099(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					    method16099(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					    method16099(i_16_, i_14_, i_17_,
							i_15_, is_20_[i_22_],
							is_21_[i_22_]);
					    i_22_++;
					} else
					    i_22_ += 3;
				    }
				} else if (i_18_ == 3) {
				    method16099(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				    method16099(i_16_, i_14_, i_17_, i_15_,
						(class161_sub3.anInt1761
						 * 435863595),
						0);
				    method16099(i_16_, i_14_, i_17_, i_15_, 0,
						(class161_sub3.anInt1761
						 * 435863595));
				} else if (i_18_ == 2) {
				    method16099(i_16_, i_14_, i_17_, i_15_,
						(class161_sub3.anInt1761
						 * 435863595),
						0);
				    method16099(i_16_, i_14_, i_17_, i_15_,
						(class161_sub3.anInt1761
						 * 435863595),
						(class161_sub3.anInt1761
						 * 435863595));
				    method16099(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				} else if (i_18_ == 5) {
				    method16099(i_16_, i_14_, i_17_, i_15_,
						(class161_sub3.anInt1761
						 * 435863595),
						(class161_sub3.anInt1761
						 * 435863595));
				    method16099(i_16_, i_14_, i_17_, i_15_, 0,
						(class161_sub3.anInt1761
						 * 435863595));
				    method16099(i_16_, i_14_, i_17_, i_15_,
						(class161_sub3.anInt1761
						 * 435863595),
						0);
				} else if (i_18_ == 4) {
				    method16099(i_16_, i_14_, i_17_, i_15_, 0,
						(class161_sub3.anInt1761
						 * 435863595));
				    method16099(i_16_, i_14_, i_17_, i_15_, 0,
						0);
				    method16099(i_16_, i_14_, i_17_, i_15_,
						(class161_sub3.anInt1761
						 * 435863595),
						(class161_sub3.anInt1761
						 * 435863595));
				}
			    }
			}
			i_8_++;
			i_16_++;
		    }
		} else
		    i_8_ += anInt10454 - anInt10452;
		i_14_++;
	    }
	    method16093();
	} else {
	    anInterface35_10445 = null;
	    anInterface44_10450 = null;
	}
	aClass10_10456 = null;
	aFloatArrayArray10455 = null;
	aFloatArrayArray10451 = null;
	aFloatArrayArray10453 = null;
    }
    
    void method16094(Class319 class319, int i, int i_23_, int i_24_,
		     boolean[][] bools, boolean bool) {
	if (anInterface44_10450 != null && anInt10452 <= i + i_24_
	    && anInt10454 >= i - i_24_ && anInt10446 <= i_23_ + i_24_
	    && anInt10447 >= i_23_ - i_24_) {
	    if (bool) {
		for (int i_25_ = anInt10452; i_25_ <= anInt10454; i_25_++) {
		    if (i_25_ - i >= -i_24_ && i_25_ - i <= i_24_) {
			for (int i_26_ = anInt10446; i_26_ <= anInt10447;
			     i_26_++) {
			    if (i_26_ - i_23_ >= -i_24_
				&& i_26_ - i_23_ <= i_24_
				&& (bools[i_25_ - i + i_24_]
				    [i_26_ - i_23_ + i_24_])) {
				method16095(class319, anInterface44_10450,
					    anInt10444 / 3);
				return;
			    }
			}
		    }
		}
	    } else {
		int i_27_ = 0;
		ByteBuffer bytebuffer = aClass182_Sub1_10441.aByteBuffer9271;
		bytebuffer.clear();
		for (int i_28_ = anInt10446; i_28_ <= anInt10447; i_28_++) {
		    if (i_28_ - i_23_ >= -i_24_ && i_28_ - i_23_ <= i_24_) {
			int i_29_ = (i_28_ * (aClass161_Sub3_10442.anInt1759
					      * 363736815)
				     + anInt10452);
			for (int i_30_ = anInt10452; i_30_ <= anInt10454;
			     i_30_++) {
			    if (i_30_ - i >= -i_24_ && i_30_ - i <= i_24_
				&& (bools[i_30_ - i + i_24_]
				    [i_28_ - i_23_ + i_24_])) {
				short[] is = (aClass161_Sub3_10442
					      .aShortArrayArray9851[i_29_]);
				if (is != null) {
				    for (int i_31_ = 0; i_31_ < is.length;
					 i_31_++) {
					bytebuffer.putShort(is[i_31_]);
					i_27_++;
				    }
				}
			    }
			    i_29_++;
			}
		    }
		}
		if (bytebuffer.position() != 0 && i_27_ != 0) {
		    int i_32_ = bytebuffer.position();
		    Interface44 interface44
			= aClass182_Sub1_10441.method14682(i_32_ / 2);
		    interface44.method215(0, i_32_,
					  aClass182_Sub1_10441.aLong9160);
		    method16095(class319, interface44, i_27_ / 3);
		}
	    }
	}
    }
    
    void method16095(Class319 class319, Interface44 interface44, int i) {
	class319.anInt3527 = 0;
	class319.anInt3528 = anInt10448;
	class319.anInt3526 = 0;
	class319.anInt3530 = anInt10444 / 3;
	class319.anInterface38_3512 = aClass182_Sub1_10441.anInterface38_9168;
	float f = aClass525_Sub21_10443.method16306(-612657253);
	class319.aClass446_3517.method7265(f, f, f);
	aClass182_Sub1_10441.method14764(0, anInterface35_10445);
	aClass182_Sub1_10441.method14763(aClass182_Sub1_10441.aClass337_9318);
	aClass182_Sub1_10441.method14765(anInterface44_10450);
	class319.method5679(0);
    }
    
    void method16096(int i, int i_33_, int i_34_, int i_35_, int i_36_,
		     int i_37_) {
	long l = -1L;
	int i_38_
	    = i_36_ + (i_34_ << aClass161_Sub3_10442.anInt1763 * -2063427645);
	int i_39_
	    = i_37_ + (i_35_ << aClass161_Sub3_10442.anInt1763 * -2063427645);
	int i_40_ = aClass161_Sub3_10442.method2619(i_38_, i_39_, -1056487778);
	if ((i_36_ & 0x7f) == 0 || (i_37_ & 0x7f) == 0) {
	    l = ((long) i_39_ & 0xffffL) << 16 | (long) i_38_ & 0xffffL;
	    Class525 class525 = aClass10_10456.method684(l);
	    if (class525 != null) {
		Unsafe unsafe = aClass182_Sub1_10441.anUnsafe9234;
		unsafe.putShort((aClass182_Sub1_10441.aLong9160
				 + (long) (aClass182_Sub1_10441.anInt9162 >> 1)
				 + (long) (anInt10444 * 2)),
				((Class525_Sub20) class525).aShort10573);
		anInt10444++;
		return;
	    }
	}
	short i_41_ = (short) anInt10448;
	if (l != -1L)
	    aClass10_10456.method695(new Class525_Sub20(i_41_), l);
	float f;
	float f_42_;
	float f_43_;
	if (i_36_ == 0 && i_37_ == 0) {
	    f = aFloatArrayArray10453[i][i_33_];
	    f_42_ = aFloatArrayArray10451[i][i_33_];
	    f_43_ = aFloatArrayArray10455[i][i_33_];
	} else if (i_36_ == aClass161_Sub3_10442.anInt1761 * 435863595
		   && i_37_ == 0) {
	    f = aFloatArrayArray10453[i + 1][i_33_];
	    f_42_ = aFloatArrayArray10451[i + 1][i_33_];
	    f_43_ = aFloatArrayArray10455[i + 1][i_33_];
	} else if (i_36_ == aClass161_Sub3_10442.anInt1761 * 435863595
		   && i_37_ == aClass161_Sub3_10442.anInt1761 * 435863595) {
	    f = aFloatArrayArray10453[i + 1][i_33_ + 1];
	    f_42_ = aFloatArrayArray10451[i + 1][i_33_ + 1];
	    f_43_ = aFloatArrayArray10455[i + 1][i_33_ + 1];
	} else if (i_36_ == 0
		   && i_37_ == aClass161_Sub3_10442.anInt1761 * 435863595) {
	    f = aFloatArrayArray10453[i][i_33_ + 1];
	    f_42_ = aFloatArrayArray10451[i][i_33_ + 1];
	    f_43_ = aFloatArrayArray10455[i][i_33_ + 1];
	} else {
	    float f_44_
		= ((float) i_36_
		   / (float) (aClass161_Sub3_10442.anInt1761 * 435863595));
	    float f_45_
		= ((float) i_37_
		   / (float) (aClass161_Sub3_10442.anInt1761 * 435863595));
	    float f_46_ = aFloatArrayArray10453[i][i_33_];
	    float f_47_ = aFloatArrayArray10451[i][i_33_];
	    float f_48_ = aFloatArrayArray10455[i][i_33_];
	    float f_49_ = aFloatArrayArray10453[i + 1][i_33_];
	    float f_50_ = aFloatArrayArray10451[i + 1][i_33_];
	    float f_51_ = aFloatArrayArray10455[i + 1][i_33_];
	    f_46_ += (aFloatArrayArray10453[i][i_33_ + 1] - f_46_) * f_44_;
	    f_47_ += (aFloatArrayArray10451[i][i_33_ + 1] - f_47_) * f_44_;
	    f_48_ += (aFloatArrayArray10455[i][i_33_ + 1] - f_48_) * f_44_;
	    f_49_ += (aFloatArrayArray10453[i + 1][i_33_ + 1] - f_49_) * f_44_;
	    f_50_ += (aFloatArrayArray10451[i + 1][i_33_ + 1] - f_50_) * f_44_;
	    f_51_ += (aFloatArrayArray10455[i + 1][i_33_ + 1] - f_51_) * f_44_;
	    f = f_46_ + (f_49_ - f_46_) * f_45_;
	    f_42_ = f_47_ + (f_50_ - f_47_) * f_45_;
	    f_43_ = f_48_ + (f_51_ - f_48_) * f_45_;
	}
	float f_52_
	    = (float) (aClass525_Sub21_10443.method16314(-870193256) - i_38_);
	float f_53_ = (float) (aClass525_Sub21_10443.method16312((short) 2530)
			       - i_40_);
	float f_54_
	    = (float) (aClass525_Sub21_10443.method16301((byte) 6) - i_39_);
	float f_55_ = (float) Math.sqrt((double) (f_52_ * f_52_ + f_53_ * f_53_
						  + f_54_ * f_54_));
	float f_56_ = 1.0F / f_55_;
	f_52_ *= f_56_;
	f_53_ *= f_56_;
	f_54_ *= f_56_;
	float f_57_
	    = f_55_ / (float) aClass525_Sub21_10443.method16332(1854390255);
	float f_58_ = 1.0F - f_57_ * f_57_;
	if (f_58_ < 0.0F)
	    f_58_ = 0.0F;
	float f_59_ = f_52_ * f + f_53_ * f_42_ + f_54_ * f_43_;
	if (f_59_ < 0.0F)
	    f_59_ = 0.0F;
	float f_60_ = f_59_ * f_58_ * 2.0F;
	if (f_60_ > 1.0F)
	    f_60_ = 1.0F;
	int i_61_ = aClass525_Sub21_10443.method16298(-1067528627);
	int i_62_ = (int) (f_60_ * (float) (i_61_ >> 16 & 0xff));
	if (i_62_ > 255)
	    i_62_ = 255;
	int i_63_ = (int) (f_60_ * (float) (i_61_ >> 8 & 0xff));
	if (i_63_ > 255)
	    i_63_ = 255;
	int i_64_ = (int) (f_60_ * (float) (i_61_ & 0xff));
	if (i_64_ > 255)
	    i_64_ = 255;
	Unsafe unsafe = aClass182_Sub1_10441.anUnsafe9234;
	unsafe.putFloat(aClass182_Sub1_10441.aLong9160 + (long) (anInt10448
								 * 16),
			(float) i_38_);
	unsafe.putFloat((aClass182_Sub1_10441.aLong9160
			 + (long) (anInt10448 * 16) + 4L),
			(float) i_40_);
	unsafe.putFloat((aClass182_Sub1_10441.aLong9160
			 + (long) (anInt10448 * 16) + 8L),
			(float) i_39_);
	if (aClass182_Sub1_10441.anInt9212 == 0) {
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 12L),
			   (byte) i_64_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 13L),
			   (byte) i_63_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 14L),
			   (byte) i_62_);
	} else {
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 12L),
			   (byte) i_62_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 13L),
			   (byte) i_63_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 14L),
			   (byte) i_64_);
	}
	unsafe.putByte((aClass182_Sub1_10441.aLong9160
			+ (long) (anInt10448 * 16) + 15L),
		       (byte) -1);
	anInt10448++;
	unsafe.putShort((aClass182_Sub1_10441.aLong9160
			 + (long) (aClass182_Sub1_10441.anInt9162 >> 1)
			 + (long) (anInt10444 * 2)),
			i_41_);
	anInt10444++;
    }
    
    void method16097() {
	anInterface44_10450 = aClass182_Sub1_10441.method14701(false);
	anInterface44_10450.method29(anInt10444);
	anInterface35_10445 = aClass182_Sub1_10441.method14761(false);
	anInterface35_10445.method225(anInt10448 * 16, 16);
	anInterface35_10445.method215(0, anInt10448 * 16,
				      aClass182_Sub1_10441.aLong9160);
	anInterface44_10450.method215(0, anInt10444 * 2,
				      (aClass182_Sub1_10441.aLong9160
				       + (long) (aClass182_Sub1_10441.anInt9162
						 >> 1)));
    }
    
    void method16098(int i, int i_65_, int i_66_, int i_67_, int i_68_,
		     int i_69_) {
	long l = -1L;
	int i_70_
	    = i_68_ + (i_66_ << aClass161_Sub3_10442.anInt1763 * -2063427645);
	int i_71_
	    = i_69_ + (i_67_ << aClass161_Sub3_10442.anInt1763 * -2063427645);
	int i_72_ = aClass161_Sub3_10442.method2619(i_70_, i_71_, 1178806958);
	if ((i_68_ & 0x7f) == 0 || (i_69_ & 0x7f) == 0) {
	    l = ((long) i_71_ & 0xffffL) << 16 | (long) i_70_ & 0xffffL;
	    Class525 class525 = aClass10_10456.method684(l);
	    if (class525 != null) {
		Unsafe unsafe = aClass182_Sub1_10441.anUnsafe9234;
		unsafe.putShort((aClass182_Sub1_10441.aLong9160
				 + (long) (aClass182_Sub1_10441.anInt9162 >> 1)
				 + (long) (anInt10444 * 2)),
				((Class525_Sub20) class525).aShort10573);
		anInt10444++;
		return;
	    }
	}
	short i_73_ = (short) anInt10448;
	if (l != -1L)
	    aClass10_10456.method695(new Class525_Sub20(i_73_), l);
	float f;
	float f_74_;
	float f_75_;
	if (i_68_ == 0 && i_69_ == 0) {
	    f = aFloatArrayArray10453[i][i_65_];
	    f_74_ = aFloatArrayArray10451[i][i_65_];
	    f_75_ = aFloatArrayArray10455[i][i_65_];
	} else if (i_68_ == aClass161_Sub3_10442.anInt1761 * 435863595
		   && i_69_ == 0) {
	    f = aFloatArrayArray10453[i + 1][i_65_];
	    f_74_ = aFloatArrayArray10451[i + 1][i_65_];
	    f_75_ = aFloatArrayArray10455[i + 1][i_65_];
	} else if (i_68_ == aClass161_Sub3_10442.anInt1761 * 435863595
		   && i_69_ == aClass161_Sub3_10442.anInt1761 * 435863595) {
	    f = aFloatArrayArray10453[i + 1][i_65_ + 1];
	    f_74_ = aFloatArrayArray10451[i + 1][i_65_ + 1];
	    f_75_ = aFloatArrayArray10455[i + 1][i_65_ + 1];
	} else if (i_68_ == 0
		   && i_69_ == aClass161_Sub3_10442.anInt1761 * 435863595) {
	    f = aFloatArrayArray10453[i][i_65_ + 1];
	    f_74_ = aFloatArrayArray10451[i][i_65_ + 1];
	    f_75_ = aFloatArrayArray10455[i][i_65_ + 1];
	} else {
	    float f_76_
		= ((float) i_68_
		   / (float) (aClass161_Sub3_10442.anInt1761 * 435863595));
	    float f_77_
		= ((float) i_69_
		   / (float) (aClass161_Sub3_10442.anInt1761 * 435863595));
	    float f_78_ = aFloatArrayArray10453[i][i_65_];
	    float f_79_ = aFloatArrayArray10451[i][i_65_];
	    float f_80_ = aFloatArrayArray10455[i][i_65_];
	    float f_81_ = aFloatArrayArray10453[i + 1][i_65_];
	    float f_82_ = aFloatArrayArray10451[i + 1][i_65_];
	    float f_83_ = aFloatArrayArray10455[i + 1][i_65_];
	    f_78_ += (aFloatArrayArray10453[i][i_65_ + 1] - f_78_) * f_76_;
	    f_79_ += (aFloatArrayArray10451[i][i_65_ + 1] - f_79_) * f_76_;
	    f_80_ += (aFloatArrayArray10455[i][i_65_ + 1] - f_80_) * f_76_;
	    f_81_ += (aFloatArrayArray10453[i + 1][i_65_ + 1] - f_81_) * f_76_;
	    f_82_ += (aFloatArrayArray10451[i + 1][i_65_ + 1] - f_82_) * f_76_;
	    f_83_ += (aFloatArrayArray10455[i + 1][i_65_ + 1] - f_83_) * f_76_;
	    f = f_78_ + (f_81_ - f_78_) * f_77_;
	    f_74_ = f_79_ + (f_82_ - f_79_) * f_77_;
	    f_75_ = f_80_ + (f_83_ - f_80_) * f_77_;
	}
	float f_84_
	    = (float) (aClass525_Sub21_10443.method16314(-1665758510) - i_70_);
	float f_85_ = (float) (aClass525_Sub21_10443.method16312((short) 14225)
			       - i_72_);
	float f_86_
	    = (float) (aClass525_Sub21_10443.method16301((byte) 6) - i_71_);
	float f_87_ = (float) Math.sqrt((double) (f_84_ * f_84_ + f_85_ * f_85_
						  + f_86_ * f_86_));
	float f_88_ = 1.0F / f_87_;
	f_84_ *= f_88_;
	f_85_ *= f_88_;
	f_86_ *= f_88_;
	float f_89_
	    = f_87_ / (float) aClass525_Sub21_10443.method16332(1694428265);
	float f_90_ = 1.0F - f_89_ * f_89_;
	if (f_90_ < 0.0F)
	    f_90_ = 0.0F;
	float f_91_ = f_84_ * f + f_85_ * f_74_ + f_86_ * f_75_;
	if (f_91_ < 0.0F)
	    f_91_ = 0.0F;
	float f_92_ = f_91_ * f_90_ * 2.0F;
	if (f_92_ > 1.0F)
	    f_92_ = 1.0F;
	int i_93_ = aClass525_Sub21_10443.method16298(-623121058);
	int i_94_ = (int) (f_92_ * (float) (i_93_ >> 16 & 0xff));
	if (i_94_ > 255)
	    i_94_ = 255;
	int i_95_ = (int) (f_92_ * (float) (i_93_ >> 8 & 0xff));
	if (i_95_ > 255)
	    i_95_ = 255;
	int i_96_ = (int) (f_92_ * (float) (i_93_ & 0xff));
	if (i_96_ > 255)
	    i_96_ = 255;
	Unsafe unsafe = aClass182_Sub1_10441.anUnsafe9234;
	unsafe.putFloat(aClass182_Sub1_10441.aLong9160 + (long) (anInt10448
								 * 16),
			(float) i_70_);
	unsafe.putFloat((aClass182_Sub1_10441.aLong9160
			 + (long) (anInt10448 * 16) + 4L),
			(float) i_72_);
	unsafe.putFloat((aClass182_Sub1_10441.aLong9160
			 + (long) (anInt10448 * 16) + 8L),
			(float) i_71_);
	if (aClass182_Sub1_10441.anInt9212 == 0) {
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 12L),
			   (byte) i_96_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 13L),
			   (byte) i_95_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 14L),
			   (byte) i_94_);
	} else {
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 12L),
			   (byte) i_94_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 13L),
			   (byte) i_95_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 14L),
			   (byte) i_96_);
	}
	unsafe.putByte((aClass182_Sub1_10441.aLong9160
			+ (long) (anInt10448 * 16) + 15L),
		       (byte) -1);
	anInt10448++;
	unsafe.putShort((aClass182_Sub1_10441.aLong9160
			 + (long) (aClass182_Sub1_10441.anInt9162 >> 1)
			 + (long) (anInt10444 * 2)),
			i_73_);
	anInt10444++;
    }
    
    void method16099(int i, int i_97_, int i_98_, int i_99_, int i_100_,
		     int i_101_) {
	long l = -1L;
	int i_102_
	    = i_100_ + (i_98_ << aClass161_Sub3_10442.anInt1763 * -2063427645);
	int i_103_
	    = i_101_ + (i_99_ << aClass161_Sub3_10442.anInt1763 * -2063427645);
	int i_104_
	    = aClass161_Sub3_10442.method2619(i_102_, i_103_, -729316999);
	if ((i_100_ & 0x7f) == 0 || (i_101_ & 0x7f) == 0) {
	    l = ((long) i_103_ & 0xffffL) << 16 | (long) i_102_ & 0xffffL;
	    Class525 class525 = aClass10_10456.method684(l);
	    if (class525 != null) {
		Unsafe unsafe = aClass182_Sub1_10441.anUnsafe9234;
		unsafe.putShort((aClass182_Sub1_10441.aLong9160
				 + (long) (aClass182_Sub1_10441.anInt9162 >> 1)
				 + (long) (anInt10444 * 2)),
				((Class525_Sub20) class525).aShort10573);
		anInt10444++;
		return;
	    }
	}
	short i_105_ = (short) anInt10448;
	if (l != -1L)
	    aClass10_10456.method695(new Class525_Sub20(i_105_), l);
	float f;
	float f_106_;
	float f_107_;
	if (i_100_ == 0 && i_101_ == 0) {
	    f = aFloatArrayArray10453[i][i_97_];
	    f_106_ = aFloatArrayArray10451[i][i_97_];
	    f_107_ = aFloatArrayArray10455[i][i_97_];
	} else if (i_100_ == aClass161_Sub3_10442.anInt1761 * 435863595
		   && i_101_ == 0) {
	    f = aFloatArrayArray10453[i + 1][i_97_];
	    f_106_ = aFloatArrayArray10451[i + 1][i_97_];
	    f_107_ = aFloatArrayArray10455[i + 1][i_97_];
	} else if (i_100_ == aClass161_Sub3_10442.anInt1761 * 435863595
		   && i_101_ == aClass161_Sub3_10442.anInt1761 * 435863595) {
	    f = aFloatArrayArray10453[i + 1][i_97_ + 1];
	    f_106_ = aFloatArrayArray10451[i + 1][i_97_ + 1];
	    f_107_ = aFloatArrayArray10455[i + 1][i_97_ + 1];
	} else if (i_100_ == 0
		   && i_101_ == aClass161_Sub3_10442.anInt1761 * 435863595) {
	    f = aFloatArrayArray10453[i][i_97_ + 1];
	    f_106_ = aFloatArrayArray10451[i][i_97_ + 1];
	    f_107_ = aFloatArrayArray10455[i][i_97_ + 1];
	} else {
	    float f_108_
		= ((float) i_100_
		   / (float) (aClass161_Sub3_10442.anInt1761 * 435863595));
	    float f_109_
		= ((float) i_101_
		   / (float) (aClass161_Sub3_10442.anInt1761 * 435863595));
	    float f_110_ = aFloatArrayArray10453[i][i_97_];
	    float f_111_ = aFloatArrayArray10451[i][i_97_];
	    float f_112_ = aFloatArrayArray10455[i][i_97_];
	    float f_113_ = aFloatArrayArray10453[i + 1][i_97_];
	    float f_114_ = aFloatArrayArray10451[i + 1][i_97_];
	    float f_115_ = aFloatArrayArray10455[i + 1][i_97_];
	    f_110_ += (aFloatArrayArray10453[i][i_97_ + 1] - f_110_) * f_108_;
	    f_111_ += (aFloatArrayArray10451[i][i_97_ + 1] - f_111_) * f_108_;
	    f_112_ += (aFloatArrayArray10455[i][i_97_ + 1] - f_112_) * f_108_;
	    f_113_
		+= (aFloatArrayArray10453[i + 1][i_97_ + 1] - f_113_) * f_108_;
	    f_114_
		+= (aFloatArrayArray10451[i + 1][i_97_ + 1] - f_114_) * f_108_;
	    f_115_
		+= (aFloatArrayArray10455[i + 1][i_97_ + 1] - f_115_) * f_108_;
	    f = f_110_ + (f_113_ - f_110_) * f_109_;
	    f_106_ = f_111_ + (f_114_ - f_111_) * f_109_;
	    f_107_ = f_112_ + (f_115_ - f_112_) * f_109_;
	}
	float f_116_
	    = (float) (aClass525_Sub21_10443.method16314(1674871605) - i_102_);
	float f_117_
	    = (float) (aClass525_Sub21_10443.method16312((short) 18582)
		       - i_104_);
	float f_118_
	    = (float) (aClass525_Sub21_10443.method16301((byte) 6) - i_103_);
	float f_119_
	    = (float) Math.sqrt((double) (f_116_ * f_116_ + f_117_ * f_117_
					  + f_118_ * f_118_));
	float f_120_ = 1.0F / f_119_;
	f_116_ *= f_120_;
	f_117_ *= f_120_;
	f_118_ *= f_120_;
	float f_121_
	    = f_119_ / (float) aClass525_Sub21_10443.method16332(1832770872);
	float f_122_ = 1.0F - f_121_ * f_121_;
	if (f_122_ < 0.0F)
	    f_122_ = 0.0F;
	float f_123_ = f_116_ * f + f_117_ * f_106_ + f_118_ * f_107_;
	if (f_123_ < 0.0F)
	    f_123_ = 0.0F;
	float f_124_ = f_123_ * f_122_ * 2.0F;
	if (f_124_ > 1.0F)
	    f_124_ = 1.0F;
	int i_125_ = aClass525_Sub21_10443.method16298(-91273239);
	int i_126_ = (int) (f_124_ * (float) (i_125_ >> 16 & 0xff));
	if (i_126_ > 255)
	    i_126_ = 255;
	int i_127_ = (int) (f_124_ * (float) (i_125_ >> 8 & 0xff));
	if (i_127_ > 255)
	    i_127_ = 255;
	int i_128_ = (int) (f_124_ * (float) (i_125_ & 0xff));
	if (i_128_ > 255)
	    i_128_ = 255;
	Unsafe unsafe = aClass182_Sub1_10441.anUnsafe9234;
	unsafe.putFloat(aClass182_Sub1_10441.aLong9160 + (long) (anInt10448
								 * 16),
			(float) i_102_);
	unsafe.putFloat((aClass182_Sub1_10441.aLong9160
			 + (long) (anInt10448 * 16) + 4L),
			(float) i_104_);
	unsafe.putFloat((aClass182_Sub1_10441.aLong9160
			 + (long) (anInt10448 * 16) + 8L),
			(float) i_103_);
	if (aClass182_Sub1_10441.anInt9212 == 0) {
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 12L),
			   (byte) i_128_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 13L),
			   (byte) i_127_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 14L),
			   (byte) i_126_);
	} else {
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 12L),
			   (byte) i_126_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 13L),
			   (byte) i_127_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 14L),
			   (byte) i_128_);
	}
	unsafe.putByte((aClass182_Sub1_10441.aLong9160
			+ (long) (anInt10448 * 16) + 15L),
		       (byte) -1);
	anInt10448++;
	unsafe.putShort((aClass182_Sub1_10441.aLong9160
			 + (long) (aClass182_Sub1_10441.anInt9162 >> 1)
			 + (long) (anInt10444 * 2)),
			i_105_);
	anInt10444++;
    }
    
    void method16100(int i, int i_129_, int i_130_, int i_131_, int i_132_,
		     int i_133_) {
	long l = -1L;
	int i_134_
	    = (i_132_
	       + (i_130_ << aClass161_Sub3_10442.anInt1763 * -2063427645));
	int i_135_
	    = (i_133_
	       + (i_131_ << aClass161_Sub3_10442.anInt1763 * -2063427645));
	int i_136_
	    = aClass161_Sub3_10442.method2619(i_134_, i_135_, -738655902);
	if ((i_132_ & 0x7f) == 0 || (i_133_ & 0x7f) == 0) {
	    l = ((long) i_135_ & 0xffffL) << 16 | (long) i_134_ & 0xffffL;
	    Class525 class525 = aClass10_10456.method684(l);
	    if (class525 != null) {
		Unsafe unsafe = aClass182_Sub1_10441.anUnsafe9234;
		unsafe.putShort((aClass182_Sub1_10441.aLong9160
				 + (long) (aClass182_Sub1_10441.anInt9162 >> 1)
				 + (long) (anInt10444 * 2)),
				((Class525_Sub20) class525).aShort10573);
		anInt10444++;
		return;
	    }
	}
	short i_137_ = (short) anInt10448;
	if (l != -1L)
	    aClass10_10456.method695(new Class525_Sub20(i_137_), l);
	float f;
	float f_138_;
	float f_139_;
	if (i_132_ == 0 && i_133_ == 0) {
	    f = aFloatArrayArray10453[i][i_129_];
	    f_138_ = aFloatArrayArray10451[i][i_129_];
	    f_139_ = aFloatArrayArray10455[i][i_129_];
	} else if (i_132_ == aClass161_Sub3_10442.anInt1761 * 435863595
		   && i_133_ == 0) {
	    f = aFloatArrayArray10453[i + 1][i_129_];
	    f_138_ = aFloatArrayArray10451[i + 1][i_129_];
	    f_139_ = aFloatArrayArray10455[i + 1][i_129_];
	} else if (i_132_ == aClass161_Sub3_10442.anInt1761 * 435863595
		   && i_133_ == aClass161_Sub3_10442.anInt1761 * 435863595) {
	    f = aFloatArrayArray10453[i + 1][i_129_ + 1];
	    f_138_ = aFloatArrayArray10451[i + 1][i_129_ + 1];
	    f_139_ = aFloatArrayArray10455[i + 1][i_129_ + 1];
	} else if (i_132_ == 0
		   && i_133_ == aClass161_Sub3_10442.anInt1761 * 435863595) {
	    f = aFloatArrayArray10453[i][i_129_ + 1];
	    f_138_ = aFloatArrayArray10451[i][i_129_ + 1];
	    f_139_ = aFloatArrayArray10455[i][i_129_ + 1];
	} else {
	    float f_140_
		= ((float) i_132_
		   / (float) (aClass161_Sub3_10442.anInt1761 * 435863595));
	    float f_141_
		= ((float) i_133_
		   / (float) (aClass161_Sub3_10442.anInt1761 * 435863595));
	    float f_142_ = aFloatArrayArray10453[i][i_129_];
	    float f_143_ = aFloatArrayArray10451[i][i_129_];
	    float f_144_ = aFloatArrayArray10455[i][i_129_];
	    float f_145_ = aFloatArrayArray10453[i + 1][i_129_];
	    float f_146_ = aFloatArrayArray10451[i + 1][i_129_];
	    float f_147_ = aFloatArrayArray10455[i + 1][i_129_];
	    f_142_ += (aFloatArrayArray10453[i][i_129_ + 1] - f_142_) * f_140_;
	    f_143_ += (aFloatArrayArray10451[i][i_129_ + 1] - f_143_) * f_140_;
	    f_144_ += (aFloatArrayArray10455[i][i_129_ + 1] - f_144_) * f_140_;
	    f_145_ += ((aFloatArrayArray10453[i + 1][i_129_ + 1] - f_145_)
		       * f_140_);
	    f_146_ += ((aFloatArrayArray10451[i + 1][i_129_ + 1] - f_146_)
		       * f_140_);
	    f_147_ += ((aFloatArrayArray10455[i + 1][i_129_ + 1] - f_147_)
		       * f_140_);
	    f = f_142_ + (f_145_ - f_142_) * f_141_;
	    f_138_ = f_143_ + (f_146_ - f_143_) * f_141_;
	    f_139_ = f_144_ + (f_147_ - f_144_) * f_141_;
	}
	float f_148_
	    = (float) (aClass525_Sub21_10443.method16314(1465761750) - i_134_);
	float f_149_ = (float) (aClass525_Sub21_10443.method16312((short) 2439)
				- i_136_);
	float f_150_
	    = (float) (aClass525_Sub21_10443.method16301((byte) 6) - i_135_);
	float f_151_
	    = (float) Math.sqrt((double) (f_148_ * f_148_ + f_149_ * f_149_
					  + f_150_ * f_150_));
	float f_152_ = 1.0F / f_151_;
	f_148_ *= f_152_;
	f_149_ *= f_152_;
	f_150_ *= f_152_;
	float f_153_
	    = f_151_ / (float) aClass525_Sub21_10443.method16332(2065453764);
	float f_154_ = 1.0F - f_153_ * f_153_;
	if (f_154_ < 0.0F)
	    f_154_ = 0.0F;
	float f_155_ = f_148_ * f + f_149_ * f_138_ + f_150_ * f_139_;
	if (f_155_ < 0.0F)
	    f_155_ = 0.0F;
	float f_156_ = f_155_ * f_154_ * 2.0F;
	if (f_156_ > 1.0F)
	    f_156_ = 1.0F;
	int i_157_ = aClass525_Sub21_10443.method16298(-1455637873);
	int i_158_ = (int) (f_156_ * (float) (i_157_ >> 16 & 0xff));
	if (i_158_ > 255)
	    i_158_ = 255;
	int i_159_ = (int) (f_156_ * (float) (i_157_ >> 8 & 0xff));
	if (i_159_ > 255)
	    i_159_ = 255;
	int i_160_ = (int) (f_156_ * (float) (i_157_ & 0xff));
	if (i_160_ > 255)
	    i_160_ = 255;
	Unsafe unsafe = aClass182_Sub1_10441.anUnsafe9234;
	unsafe.putFloat(aClass182_Sub1_10441.aLong9160 + (long) (anInt10448
								 * 16),
			(float) i_134_);
	unsafe.putFloat((aClass182_Sub1_10441.aLong9160
			 + (long) (anInt10448 * 16) + 4L),
			(float) i_136_);
	unsafe.putFloat((aClass182_Sub1_10441.aLong9160
			 + (long) (anInt10448 * 16) + 8L),
			(float) i_135_);
	if (aClass182_Sub1_10441.anInt9212 == 0) {
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 12L),
			   (byte) i_160_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 13L),
			   (byte) i_159_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 14L),
			   (byte) i_158_);
	} else {
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 12L),
			   (byte) i_158_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 13L),
			   (byte) i_159_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 14L),
			   (byte) i_160_);
	}
	unsafe.putByte((aClass182_Sub1_10441.aLong9160
			+ (long) (anInt10448 * 16) + 15L),
		       (byte) -1);
	anInt10448++;
	unsafe.putShort((aClass182_Sub1_10441.aLong9160
			 + (long) (aClass182_Sub1_10441.anInt9162 >> 1)
			 + (long) (anInt10444 * 2)),
			i_137_);
	anInt10444++;
    }
    
    void method16101(int i, int i_161_, int i_162_, int i_163_, int i_164_,
		     int i_165_) {
	long l = -1L;
	int i_166_
	    = (i_164_
	       + (i_162_ << aClass161_Sub3_10442.anInt1763 * -2063427645));
	int i_167_
	    = (i_165_
	       + (i_163_ << aClass161_Sub3_10442.anInt1763 * -2063427645));
	int i_168_
	    = aClass161_Sub3_10442.method2619(i_166_, i_167_, 714885855);
	if ((i_164_ & 0x7f) == 0 || (i_165_ & 0x7f) == 0) {
	    l = ((long) i_167_ & 0xffffL) << 16 | (long) i_166_ & 0xffffL;
	    Class525 class525 = aClass10_10456.method684(l);
	    if (class525 != null) {
		Unsafe unsafe = aClass182_Sub1_10441.anUnsafe9234;
		unsafe.putShort((aClass182_Sub1_10441.aLong9160
				 + (long) (aClass182_Sub1_10441.anInt9162 >> 1)
				 + (long) (anInt10444 * 2)),
				((Class525_Sub20) class525).aShort10573);
		anInt10444++;
		return;
	    }
	}
	short i_169_ = (short) anInt10448;
	if (l != -1L)
	    aClass10_10456.method695(new Class525_Sub20(i_169_), l);
	float f;
	float f_170_;
	float f_171_;
	if (i_164_ == 0 && i_165_ == 0) {
	    f = aFloatArrayArray10453[i][i_161_];
	    f_170_ = aFloatArrayArray10451[i][i_161_];
	    f_171_ = aFloatArrayArray10455[i][i_161_];
	} else if (i_164_ == aClass161_Sub3_10442.anInt1761 * 435863595
		   && i_165_ == 0) {
	    f = aFloatArrayArray10453[i + 1][i_161_];
	    f_170_ = aFloatArrayArray10451[i + 1][i_161_];
	    f_171_ = aFloatArrayArray10455[i + 1][i_161_];
	} else if (i_164_ == aClass161_Sub3_10442.anInt1761 * 435863595
		   && i_165_ == aClass161_Sub3_10442.anInt1761 * 435863595) {
	    f = aFloatArrayArray10453[i + 1][i_161_ + 1];
	    f_170_ = aFloatArrayArray10451[i + 1][i_161_ + 1];
	    f_171_ = aFloatArrayArray10455[i + 1][i_161_ + 1];
	} else if (i_164_ == 0
		   && i_165_ == aClass161_Sub3_10442.anInt1761 * 435863595) {
	    f = aFloatArrayArray10453[i][i_161_ + 1];
	    f_170_ = aFloatArrayArray10451[i][i_161_ + 1];
	    f_171_ = aFloatArrayArray10455[i][i_161_ + 1];
	} else {
	    float f_172_
		= ((float) i_164_
		   / (float) (aClass161_Sub3_10442.anInt1761 * 435863595));
	    float f_173_
		= ((float) i_165_
		   / (float) (aClass161_Sub3_10442.anInt1761 * 435863595));
	    float f_174_ = aFloatArrayArray10453[i][i_161_];
	    float f_175_ = aFloatArrayArray10451[i][i_161_];
	    float f_176_ = aFloatArrayArray10455[i][i_161_];
	    float f_177_ = aFloatArrayArray10453[i + 1][i_161_];
	    float f_178_ = aFloatArrayArray10451[i + 1][i_161_];
	    float f_179_ = aFloatArrayArray10455[i + 1][i_161_];
	    f_174_ += (aFloatArrayArray10453[i][i_161_ + 1] - f_174_) * f_172_;
	    f_175_ += (aFloatArrayArray10451[i][i_161_ + 1] - f_175_) * f_172_;
	    f_176_ += (aFloatArrayArray10455[i][i_161_ + 1] - f_176_) * f_172_;
	    f_177_ += ((aFloatArrayArray10453[i + 1][i_161_ + 1] - f_177_)
		       * f_172_);
	    f_178_ += ((aFloatArrayArray10451[i + 1][i_161_ + 1] - f_178_)
		       * f_172_);
	    f_179_ += ((aFloatArrayArray10455[i + 1][i_161_ + 1] - f_179_)
		       * f_172_);
	    f = f_174_ + (f_177_ - f_174_) * f_173_;
	    f_170_ = f_175_ + (f_178_ - f_175_) * f_173_;
	    f_171_ = f_176_ + (f_179_ - f_176_) * f_173_;
	}
	float f_180_
	    = (float) (aClass525_Sub21_10443.method16314(980203050) - i_166_);
	float f_181_
	    = (float) (aClass525_Sub21_10443.method16312((short) 15717)
		       - i_168_);
	float f_182_
	    = (float) (aClass525_Sub21_10443.method16301((byte) 6) - i_167_);
	float f_183_
	    = (float) Math.sqrt((double) (f_180_ * f_180_ + f_181_ * f_181_
					  + f_182_ * f_182_));
	float f_184_ = 1.0F / f_183_;
	f_180_ *= f_184_;
	f_181_ *= f_184_;
	f_182_ *= f_184_;
	float f_185_
	    = f_183_ / (float) aClass525_Sub21_10443.method16332(1854672182);
	float f_186_ = 1.0F - f_185_ * f_185_;
	if (f_186_ < 0.0F)
	    f_186_ = 0.0F;
	float f_187_ = f_180_ * f + f_181_ * f_170_ + f_182_ * f_171_;
	if (f_187_ < 0.0F)
	    f_187_ = 0.0F;
	float f_188_ = f_187_ * f_186_ * 2.0F;
	if (f_188_ > 1.0F)
	    f_188_ = 1.0F;
	int i_189_ = aClass525_Sub21_10443.method16298(-594217102);
	int i_190_ = (int) (f_188_ * (float) (i_189_ >> 16 & 0xff));
	if (i_190_ > 255)
	    i_190_ = 255;
	int i_191_ = (int) (f_188_ * (float) (i_189_ >> 8 & 0xff));
	if (i_191_ > 255)
	    i_191_ = 255;
	int i_192_ = (int) (f_188_ * (float) (i_189_ & 0xff));
	if (i_192_ > 255)
	    i_192_ = 255;
	Unsafe unsafe = aClass182_Sub1_10441.anUnsafe9234;
	unsafe.putFloat(aClass182_Sub1_10441.aLong9160 + (long) (anInt10448
								 * 16),
			(float) i_166_);
	unsafe.putFloat((aClass182_Sub1_10441.aLong9160
			 + (long) (anInt10448 * 16) + 4L),
			(float) i_168_);
	unsafe.putFloat((aClass182_Sub1_10441.aLong9160
			 + (long) (anInt10448 * 16) + 8L),
			(float) i_167_);
	if (aClass182_Sub1_10441.anInt9212 == 0) {
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 12L),
			   (byte) i_192_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 13L),
			   (byte) i_191_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 14L),
			   (byte) i_190_);
	} else {
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 12L),
			   (byte) i_190_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 13L),
			   (byte) i_191_);
	    unsafe.putByte((aClass182_Sub1_10441.aLong9160
			    + (long) (anInt10448 * 16) + 14L),
			   (byte) i_192_);
	}
	unsafe.putByte((aClass182_Sub1_10441.aLong9160
			+ (long) (anInt10448 * 16) + 15L),
		       (byte) -1);
	anInt10448++;
	unsafe.putShort((aClass182_Sub1_10441.aLong9160
			 + (long) (aClass182_Sub1_10441.anInt9162 >> 1)
			 + (long) (anInt10444 * 2)),
			i_169_);
	anInt10444++;
    }
    
    void method16102(Class319 class319, int i, int i_193_, int i_194_,
		     boolean[][] bools, boolean bool) {
	if (anInterface44_10450 != null && anInt10452 <= i + i_194_
	    && anInt10454 >= i - i_194_ && anInt10446 <= i_193_ + i_194_
	    && anInt10447 >= i_193_ - i_194_) {
	    if (bool) {
		for (int i_195_ = anInt10452; i_195_ <= anInt10454; i_195_++) {
		    if (i_195_ - i >= -i_194_ && i_195_ - i <= i_194_) {
			for (int i_196_ = anInt10446; i_196_ <= anInt10447;
			     i_196_++) {
			    if (i_196_ - i_193_ >= -i_194_
				&& i_196_ - i_193_ <= i_194_
				&& (bools[i_195_ - i + i_194_]
				    [i_196_ - i_193_ + i_194_])) {
				method16095(class319, anInterface44_10450,
					    anInt10444 / 3);
				return;
			    }
			}
		    }
		}
	    } else {
		int i_197_ = 0;
		ByteBuffer bytebuffer = aClass182_Sub1_10441.aByteBuffer9271;
		bytebuffer.clear();
		for (int i_198_ = anInt10446; i_198_ <= anInt10447; i_198_++) {
		    if (i_198_ - i_193_ >= -i_194_
			&& i_198_ - i_193_ <= i_194_) {
			int i_199_ = (i_198_ * (aClass161_Sub3_10442.anInt1759
						* 363736815)
				      + anInt10452);
			for (int i_200_ = anInt10452; i_200_ <= anInt10454;
			     i_200_++) {
			    if (i_200_ - i >= -i_194_ && i_200_ - i <= i_194_
				&& (bools[i_200_ - i + i_194_]
				    [i_198_ - i_193_ + i_194_])) {
				short[] is = (aClass161_Sub3_10442
					      .aShortArrayArray9851[i_199_]);
				if (is != null) {
				    for (int i_201_ = 0; i_201_ < is.length;
					 i_201_++) {
					bytebuffer.putShort(is[i_201_]);
					i_197_++;
				    }
				}
			    }
			    i_199_++;
			}
		    }
		}
		if (bytebuffer.position() != 0 && i_197_ != 0) {
		    int i_202_ = bytebuffer.position();
		    Interface44 interface44
			= aClass182_Sub1_10441.method14682(i_202_ / 2);
		    interface44.method215(0, i_202_,
					  aClass182_Sub1_10441.aLong9160);
		    method16095(class319, interface44, i_197_ / 3);
		}
	    }
	}
    }
    
    void method16103(Class319 class319, Interface44 interface44, int i) {
	class319.anInt3527 = 0;
	class319.anInt3528 = anInt10448;
	class319.anInt3526 = 0;
	class319.anInt3530 = anInt10444 / 3;
	class319.anInterface38_3512 = aClass182_Sub1_10441.anInterface38_9168;
	float f = aClass525_Sub21_10443.method16306(-298070198);
	class319.aClass446_3517.method7265(f, f, f);
	aClass182_Sub1_10441.method14764(0, anInterface35_10445);
	aClass182_Sub1_10441.method14763(aClass182_Sub1_10441.aClass337_9318);
	aClass182_Sub1_10441.method14765(anInterface44_10450);
	class319.method5679(0);
    }
}
