/* Class525_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class525_Sub18 extends Class525
{
    Class121_Sub2 aClass121_Sub2_10561;
    Class182_Sub3 aClass182_Sub3_10562;
    float aFloat10563;
    NativeHeapBuffer aNativeHeapBuffer10564;
    Class176 aClass176_10565;
    Class137 aClass137_10566;
    Class161_Sub1 aClass161_Sub1_10567;
    int[] anIntArray10568;
    int anInt10569;
    Stream aStream10570;
    
    void method16276(int i) {
	aStream10570.method1764(i * 4 + 3);
	aStream10570.method1765(-1);
    }
    
    void method16277(int i, int i_0_, int i_1_, float f) {
	if (anInt10569 != -1) {
	    Class166 class166
		= aClass182_Sub3_10562.aClass180_1944.method3116(anInt10569,
								 -1431554601);
	    int i_2_ = class166.aByte1785 & 0xff;
	    if (i_2_ != 0 && class166.aByte1825 != 4) {
		int i_3_;
		if (i_1_ < 0)
		    i_3_ = 0;
		else if (i_1_ > 127)
		    i_3_ = 16777215;
		else
		    i_3_ = 131586 * i_1_;
		if (i_2_ == 256)
		    i_0_ = i_3_;
		else {
		    int i_4_ = i_2_;
		    int i_5_ = 256 - i_2_;
		    i_0_
			= (((i_3_ & 0xff00ff) * i_4_ + (i_0_ & 0xff00ff) * i_5_
			    & ~0xff00ff)
			   + ((i_3_ & 0xff00) * i_4_ + (i_0_ & 0xff00) * i_5_
			      & 0xff0000)) >> 8;
		}
	    }
	    int i_6_ = class166.aByte1831 & 0xff;
	    if (i_6_ != 0) {
		i_6_ += 256;
		int i_7_ = ((i_0_ & 0xff0000) >> 16) * i_6_;
		if (i_7_ > 65535)
		    i_7_ = 65535;
		int i_8_ = ((i_0_ & 0xff00) >> 8) * i_6_;
		if (i_8_ > 65535)
		    i_8_ = 65535;
		int i_9_ = (i_0_ & 0xff) * i_6_;
		if (i_9_ > 65535)
		    i_9_ = 65535;
		i_0_ = (i_7_ << 8 & 0xff0000) + (i_8_ & 0xff00) + (i_9_ >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_10_ = i_0_ >> 16 & 0xff;
	    int i_11_ = i_0_ >> 8 & 0xff;
	    int i_12_ = i_0_ & 0xff;
	    i_10_ *= f;
	    if (i_10_ < 0)
		i_10_ = 0;
	    else if (i_10_ > 255)
		i_10_ = 255;
	    i_11_ *= f;
	    if (i_11_ < 0)
		i_11_ = 0;
	    else if (i_11_ > 255)
		i_11_ = 255;
	    i_12_ *= f;
	    if (i_12_ < 0)
		i_12_ = 0;
	    else if (i_12_ > 255)
		i_12_ = 255;
	    i_0_ = i_10_ << 16 | i_11_ << 8 | i_12_;
	}
	aStream10570.method1764(i * 4);
	aStream10570.method1765((byte) (i_0_ >> 16));
	aStream10570.method1765((byte) (i_0_ >> 8));
	aStream10570.method1765((byte) i_0_);
    }
    
    void method16278(int i) {
	aStream10570.method1768();
	Interface15 interface15
	    = aClass182_Sub3_10562.method15381(4, aNativeHeapBuffer10564,
					       i * 4, false);
	if (interface15 instanceof Class133_Sub1)
	    aNativeHeapBuffer10564.method1742();
	aClass137_10566 = new Class137(interface15, 5121, 4, 0);
	aNativeHeapBuffer10564 = null;
	aStream10570 = null;
    }
    
    void method16279(int i, int i_13_, int i_14_) {
	anIntArray10568[(i_13_ * (aClass161_Sub1_10567.anInt1759 * 363736815)
			 + i)]
	    |= 1 << i_14_;
    }
    
    void method16280(int i, int i_15_, int i_16_, float f) {
	if (anInt10569 != -1) {
	    Class166 class166
		= aClass182_Sub3_10562.aClass180_1944.method3116(anInt10569,
								 -1431554601);
	    int i_17_ = class166.aByte1785 & 0xff;
	    if (i_17_ != 0 && class166.aByte1825 != 4) {
		int i_18_;
		if (i_16_ < 0)
		    i_18_ = 0;
		else if (i_16_ > 127)
		    i_18_ = 16777215;
		else
		    i_18_ = 131586 * i_16_;
		if (i_17_ == 256)
		    i_15_ = i_18_;
		else {
		    int i_19_ = i_17_;
		    int i_20_ = 256 - i_17_;
		    i_15_ = ((((i_18_ & 0xff00ff) * i_19_
			       + (i_15_ & 0xff00ff) * i_20_)
			      & ~0xff00ff)
			     + (((i_18_ & 0xff00) * i_19_
				 + (i_15_ & 0xff00) * i_20_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_21_ = class166.aByte1831 & 0xff;
	    if (i_21_ != 0) {
		i_21_ += 256;
		int i_22_ = ((i_15_ & 0xff0000) >> 16) * i_21_;
		if (i_22_ > 65535)
		    i_22_ = 65535;
		int i_23_ = ((i_15_ & 0xff00) >> 8) * i_21_;
		if (i_23_ > 65535)
		    i_23_ = 65535;
		int i_24_ = (i_15_ & 0xff) * i_21_;
		if (i_24_ > 65535)
		    i_24_ = 65535;
		i_15_ = (i_22_ << 8 & 0xff0000) + (i_23_ & 0xff00) + (i_24_
								      >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_25_ = i_15_ >> 16 & 0xff;
	    int i_26_ = i_15_ >> 8 & 0xff;
	    int i_27_ = i_15_ & 0xff;
	    i_25_ *= f;
	    if (i_25_ < 0)
		i_25_ = 0;
	    else if (i_25_ > 255)
		i_25_ = 255;
	    i_26_ *= f;
	    if (i_26_ < 0)
		i_26_ = 0;
	    else if (i_26_ > 255)
		i_26_ = 255;
	    i_27_ *= f;
	    if (i_27_ < 0)
		i_27_ = 0;
	    else if (i_27_ > 255)
		i_27_ = 255;
	    i_15_ = i_25_ << 16 | i_26_ << 8 | i_27_;
	}
	aStream10570.method1764(i * 4);
	aStream10570.method1765((byte) (i_15_ >> 16));
	aStream10570.method1765((byte) (i_15_ >> 8));
	aStream10570.method1765((byte) i_15_);
    }
    
    void method16281(int[] is, int i) {
	int i_28_ = 0;
	Class525_Sub38_Sub1 class525_sub38_sub1
	    = aClass182_Sub3_10562.aClass525_Sub38_Sub1_9828;
	class525_sub38_sub1.pos = 0;
	if (aClass182_Sub3_10562.aBool9792) {
	    for (int i_29_ = 0; i_29_ < i; i_29_++) {
		int i_30_ = is[i_29_];
		short[] is_31_
		    = aClass161_Sub1_10567.aShortArrayArray9335[i_30_];
		int i_32_ = anIntArray10568[i_30_];
		if (i_32_ != 0 && is_31_ != null) {
		    int i_33_ = 0;
		    int i_34_ = 0;
		    while (i_34_ < is_31_.length) {
			if ((i_32_ & 1 << i_33_++) != 0) {
			    class525_sub38_sub1.method16602((is_31_[i_34_++]
							     & 0xffff),
							    1860150904);
			    i_28_++;
			    class525_sub38_sub1.method16602((is_31_[i_34_++]
							     & 0xffff),
							    1445938955);
			    i_28_++;
			    class525_sub38_sub1.method16602((is_31_[i_34_++]
							     & 0xffff),
							    1712526352);
			    i_28_++;
			} else
			    i_34_ += 3;
		    }
		}
	    }
	} else {
	    for (int i_35_ = 0; i_35_ < i; i_35_++) {
		int i_36_ = is[i_35_];
		short[] is_37_
		    = aClass161_Sub1_10567.aShortArrayArray9335[i_36_];
		int i_38_ = anIntArray10568[i_36_];
		if (i_38_ != 0 && is_37_ != null) {
		    int i_39_ = 0;
		    int i_40_ = 0;
		    while (i_40_ < is_37_.length) {
			if ((i_38_ & 1 << i_39_++) != 0) {
			    class525_sub38_sub1.method16840((is_37_[i_40_++]
							     & 0xffff),
							    241387851);
			    i_28_++;
			    class525_sub38_sub1.method16840((is_37_[i_40_++]
							     & 0xffff),
							    241387851);
			    i_28_++;
			    class525_sub38_sub1.method16840((is_37_[i_40_++]
							     & 0xffff),
							    241387851);
			    i_28_++;
			} else
			    i_40_ += 3;
		    }
		}
	    }
	}
	if (i_28_ > 0) {
	    aClass121_Sub2_10561.method84(5123,
					  class525_sub38_sub1.buffer,
					  (class525_sub38_sub1.pos
					   * -1133521593));
	    aClass182_Sub3_10562.method15384
		(aClass161_Sub1_10567.aClass137_9333,
		 aClass161_Sub1_10567.aClass137_9350, aClass137_10566,
		 aClass161_Sub1_10567.aClass137_9326);
	    aClass182_Sub3_10562.method15542(anInt10569,
					     (aClass161_Sub1_10567.anInt9332
					      & 0x7) != 0,
					     (aClass161_Sub1_10567.anInt9332
					      & 0x8) != 0);
	    if (aClass182_Sub3_10562.aBool9776)
		aClass182_Sub3_10562.method3262(2147483647, aClass176_10565);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPushMatrix();
	    OpenGL.glScalef(1.0F / aFloat10563, 1.0F / aFloat10563, 1.0F);
	    OpenGL.glMatrixMode(5888);
	    aClass182_Sub3_10562.method15384
		(aClass161_Sub1_10567.aClass137_9333,
		 aClass161_Sub1_10567.aClass137_9350, aClass137_10566,
		 aClass161_Sub1_10567.aClass137_9326);
	    aClass182_Sub3_10562.method15427(aClass121_Sub2_10561, 4, 0,
					     i_28_);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	}
    }
    
    void method16282(int[] is, int i) {
	int i_41_ = 0;
	Class525_Sub38_Sub1 class525_sub38_sub1
	    = aClass182_Sub3_10562.aClass525_Sub38_Sub1_9828;
	class525_sub38_sub1.pos = 0;
	if (aClass182_Sub3_10562.aBool9792) {
	    for (int i_42_ = 0; i_42_ < i; i_42_++) {
		int i_43_ = is[i_42_];
		short[] is_44_
		    = aClass161_Sub1_10567.aShortArrayArray9335[i_43_];
		int i_45_ = anIntArray10568[i_43_];
		if (i_45_ != 0 && is_44_ != null) {
		    int i_46_ = 0;
		    int i_47_ = 0;
		    while (i_47_ < is_44_.length) {
			if ((i_45_ & 1 << i_46_++) != 0) {
			    class525_sub38_sub1.method16602((is_44_[i_47_++]
							     & 0xffff),
							    651767737);
			    i_41_++;
			    class525_sub38_sub1.method16602((is_44_[i_47_++]
							     & 0xffff),
							    737667835);
			    i_41_++;
			    class525_sub38_sub1.method16602((is_44_[i_47_++]
							     & 0xffff),
							    588780682);
			    i_41_++;
			} else
			    i_47_ += 3;
		    }
		}
	    }
	} else {
	    for (int i_48_ = 0; i_48_ < i; i_48_++) {
		int i_49_ = is[i_48_];
		short[] is_50_
		    = aClass161_Sub1_10567.aShortArrayArray9335[i_49_];
		int i_51_ = anIntArray10568[i_49_];
		if (i_51_ != 0 && is_50_ != null) {
		    int i_52_ = 0;
		    int i_53_ = 0;
		    while (i_53_ < is_50_.length) {
			if ((i_51_ & 1 << i_52_++) != 0) {
			    class525_sub38_sub1.method16840((is_50_[i_53_++]
							     & 0xffff),
							    241387851);
			    i_41_++;
			    class525_sub38_sub1.method16840((is_50_[i_53_++]
							     & 0xffff),
							    241387851);
			    i_41_++;
			    class525_sub38_sub1.method16840((is_50_[i_53_++]
							     & 0xffff),
							    241387851);
			    i_41_++;
			} else
			    i_53_ += 3;
		    }
		}
	    }
	}
	if (i_41_ > 0) {
	    aClass121_Sub2_10561.method84(5123,
					  class525_sub38_sub1.buffer,
					  (class525_sub38_sub1.pos
					   * -1133521593));
	    aClass182_Sub3_10562.method15384
		(aClass161_Sub1_10567.aClass137_9333,
		 aClass161_Sub1_10567.aClass137_9350, aClass137_10566,
		 aClass161_Sub1_10567.aClass137_9326);
	    aClass182_Sub3_10562.method15542(anInt10569,
					     (aClass161_Sub1_10567.anInt9332
					      & 0x7) != 0,
					     (aClass161_Sub1_10567.anInt9332
					      & 0x8) != 0);
	    if (aClass182_Sub3_10562.aBool9776)
		aClass182_Sub3_10562.method3262(2147483647, aClass176_10565);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPushMatrix();
	    OpenGL.glScalef(1.0F / aFloat10563, 1.0F / aFloat10563, 1.0F);
	    OpenGL.glMatrixMode(5888);
	    aClass182_Sub3_10562.method15384
		(aClass161_Sub1_10567.aClass137_9333,
		 aClass161_Sub1_10567.aClass137_9350, aClass137_10566,
		 aClass161_Sub1_10567.aClass137_9326);
	    aClass182_Sub3_10562.method15427(aClass121_Sub2_10561, 4, 0,
					     i_41_);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	}
    }
    
    void method16283(int i) {
	aNativeHeapBuffer10564
	    = aClass182_Sub3_10562.aNativeHeap9766.method1982(i * 4, true);
	aStream10570 = new Stream(aNativeHeapBuffer10564);
    }
    
    void method16284(int i) {
	aNativeHeapBuffer10564
	    = aClass182_Sub3_10562.aNativeHeap9766.method1982(i * 4, true);
	aStream10570 = new Stream(aNativeHeapBuffer10564);
    }
    
    void method16285(int i) {
	aNativeHeapBuffer10564
	    = aClass182_Sub3_10562.aNativeHeap9766.method1982(i * 4, true);
	aStream10570 = new Stream(aNativeHeapBuffer10564);
    }
    
    void method16286(int i) {
	aStream10570.method1764(i * 4 + 3);
	aStream10570.method1765(-1);
    }
    
    void method16287(int i) {
	aStream10570.method1764(i * 4 + 3);
	aStream10570.method1765(-1);
    }
    
    Class525_Sub18(Class161_Sub1 class161_sub1, int i, int i_54_,
		   Class176 class176) {
	aClass161_Sub1_10567 = class161_sub1;
	aClass182_Sub3_10562 = aClass161_Sub1_10567.aClass182_Sub3_9328;
	anInt10569 = i;
	aFloat10563 = (float) i_54_;
	aClass176_10565 = class176;
	anIntArray10568
	    = new int[(aClass161_Sub1_10567.anInt1759 * 363736815
		       * (aClass161_Sub1_10567.anInt1760 * -1152334393))];
	aClass121_Sub2_10561
	    = new Class121_Sub2(aClass182_Sub3_10562, 5123, null, 1);
    }
    
    void method16288(int i, int i_55_, int i_56_) {
	anIntArray10568[(i_55_ * (aClass161_Sub1_10567.anInt1759 * 363736815)
			 + i)]
	    |= 1 << i_56_;
    }
    
    void method16289(int i, int i_57_, int i_58_, float f) {
	if (anInt10569 != -1) {
	    Class166 class166
		= aClass182_Sub3_10562.aClass180_1944.method3116(anInt10569,
								 -1431554601);
	    int i_59_ = class166.aByte1785 & 0xff;
	    if (i_59_ != 0 && class166.aByte1825 != 4) {
		int i_60_;
		if (i_58_ < 0)
		    i_60_ = 0;
		else if (i_58_ > 127)
		    i_60_ = 16777215;
		else
		    i_60_ = 131586 * i_58_;
		if (i_59_ == 256)
		    i_57_ = i_60_;
		else {
		    int i_61_ = i_59_;
		    int i_62_ = 256 - i_59_;
		    i_57_ = ((((i_60_ & 0xff00ff) * i_61_
			       + (i_57_ & 0xff00ff) * i_62_)
			      & ~0xff00ff)
			     + (((i_60_ & 0xff00) * i_61_
				 + (i_57_ & 0xff00) * i_62_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_63_ = class166.aByte1831 & 0xff;
	    if (i_63_ != 0) {
		i_63_ += 256;
		int i_64_ = ((i_57_ & 0xff0000) >> 16) * i_63_;
		if (i_64_ > 65535)
		    i_64_ = 65535;
		int i_65_ = ((i_57_ & 0xff00) >> 8) * i_63_;
		if (i_65_ > 65535)
		    i_65_ = 65535;
		int i_66_ = (i_57_ & 0xff) * i_63_;
		if (i_66_ > 65535)
		    i_66_ = 65535;
		i_57_ = (i_64_ << 8 & 0xff0000) + (i_65_ & 0xff00) + (i_66_
								      >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_67_ = i_57_ >> 16 & 0xff;
	    int i_68_ = i_57_ >> 8 & 0xff;
	    int i_69_ = i_57_ & 0xff;
	    i_67_ *= f;
	    if (i_67_ < 0)
		i_67_ = 0;
	    else if (i_67_ > 255)
		i_67_ = 255;
	    i_68_ *= f;
	    if (i_68_ < 0)
		i_68_ = 0;
	    else if (i_68_ > 255)
		i_68_ = 255;
	    i_69_ *= f;
	    if (i_69_ < 0)
		i_69_ = 0;
	    else if (i_69_ > 255)
		i_69_ = 255;
	    i_57_ = i_67_ << 16 | i_68_ << 8 | i_69_;
	}
	aStream10570.method1764(i * 4);
	aStream10570.method1765((byte) (i_57_ >> 16));
	aStream10570.method1765((byte) (i_57_ >> 8));
	aStream10570.method1765((byte) i_57_);
    }
    
    void method16290(int i) {
	aStream10570.method1768();
	Interface15 interface15
	    = aClass182_Sub3_10562.method15381(4, aNativeHeapBuffer10564,
					       i * 4, false);
	if (interface15 instanceof Class133_Sub1)
	    aNativeHeapBuffer10564.method1742();
	aClass137_10566 = new Class137(interface15, 5121, 4, 0);
	aNativeHeapBuffer10564 = null;
	aStream10570 = null;
    }
    
    void method16291(int i) {
	aNativeHeapBuffer10564
	    = aClass182_Sub3_10562.aNativeHeap9766.method1982(i * 4, true);
	aStream10570 = new Stream(aNativeHeapBuffer10564);
    }
    
    void method16292(int i) {
	aStream10570.method1768();
	Interface15 interface15
	    = aClass182_Sub3_10562.method15381(4, aNativeHeapBuffer10564,
					       i * 4, false);
	if (interface15 instanceof Class133_Sub1)
	    aNativeHeapBuffer10564.method1742();
	aClass137_10566 = new Class137(interface15, 5121, 4, 0);
	aNativeHeapBuffer10564 = null;
	aStream10570 = null;
    }
    
    void method16293(int i) {
	aStream10570.method1768();
	Interface15 interface15
	    = aClass182_Sub3_10562.method15381(4, aNativeHeapBuffer10564,
					       i * 4, false);
	if (interface15 instanceof Class133_Sub1)
	    aNativeHeapBuffer10564.method1742();
	aClass137_10566 = new Class137(interface15, 5121, 4, 0);
	aNativeHeapBuffer10564 = null;
	aStream10570 = null;
    }
    
    void method16294(int i) {
	aStream10570.method1768();
	Interface15 interface15
	    = aClass182_Sub3_10562.method15381(4, aNativeHeapBuffer10564,
					       i * 4, false);
	if (interface15 instanceof Class133_Sub1)
	    aNativeHeapBuffer10564.method1742();
	aClass137_10566 = new Class137(interface15, 5121, 4, 0);
	aNativeHeapBuffer10564 = null;
	aStream10570 = null;
    }
    
    void method16295(int i) {
	aStream10570.method1764(i * 4 + 3);
	aStream10570.method1765(-1);
    }
}
