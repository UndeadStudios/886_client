/* Class700 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class700 implements Iterator
{
    Class697 aClass697_8776;
    Class525_Sub16 aClass525_Sub16_8777;
    Class525_Sub16 aClass525_Sub16_8778 = null;
    public static int anInt8779;
    
    public void remove() {
	if (null == aClass525_Sub16_8778)
	    throw new IllegalStateException();
	aClass525_Sub16_8778.method16266(-1925745724);
	aClass525_Sub16_8778 = null;
    }
    
    public boolean method14238() {
	return aClass697_8776.aClass525_Sub16_8766 != aClass525_Sub16_8777;
    }
    
    public Class525_Sub16 method14239(int i) {
	method14250((byte) 73);
	return (Class525_Sub16) next();
    }
    
    public Object next() {
	Class525_Sub16 class525_sub16 = aClass525_Sub16_8777;
	if (class525_sub16 == aClass697_8776.aClass525_Sub16_8766) {
	    class525_sub16 = null;
	    aClass525_Sub16_8777 = null;
	} else
	    aClass525_Sub16_8777 = class525_sub16.aClass525_Sub16_10554;
	aClass525_Sub16_8778 = class525_sub16;
	return class525_sub16;
    }
    
    public boolean hasNext() {
	return aClass697_8776.aClass525_Sub16_8766 != aClass525_Sub16_8777;
    }
    
    public Class525_Sub16 method14240() {
	method14250((byte) 90);
	return (Class525_Sub16) next();
    }
    
    public boolean method14241() {
	return aClass697_8776.aClass525_Sub16_8766 != aClass525_Sub16_8777;
    }
    
    public Object method14242() {
	Class525_Sub16 class525_sub16 = aClass525_Sub16_8777;
	if (class525_sub16 == aClass697_8776.aClass525_Sub16_8766) {
	    class525_sub16 = null;
	    aClass525_Sub16_8777 = null;
	} else
	    aClass525_Sub16_8777 = class525_sub16.aClass525_Sub16_10554;
	aClass525_Sub16_8778 = class525_sub16;
	return class525_sub16;
    }
    
    public boolean method14243() {
	return aClass697_8776.aClass525_Sub16_8766 != aClass525_Sub16_8777;
    }
    
    public Class525_Sub16 method14244() {
	method14250((byte) 73);
	return (Class525_Sub16) next();
    }
    
    public Object method14245() {
	Class525_Sub16 class525_sub16 = aClass525_Sub16_8777;
	if (class525_sub16 == aClass697_8776.aClass525_Sub16_8766) {
	    class525_sub16 = null;
	    aClass525_Sub16_8777 = null;
	} else
	    aClass525_Sub16_8777 = class525_sub16.aClass525_Sub16_10554;
	aClass525_Sub16_8778 = class525_sub16;
	return class525_sub16;
    }
    
    public Object method14246() {
	Class525_Sub16 class525_sub16 = aClass525_Sub16_8777;
	if (class525_sub16 == aClass697_8776.aClass525_Sub16_8766) {
	    class525_sub16 = null;
	    aClass525_Sub16_8777 = null;
	} else
	    aClass525_Sub16_8777 = class525_sub16.aClass525_Sub16_10554;
	aClass525_Sub16_8778 = class525_sub16;
	return class525_sub16;
    }
    
    public void method14247() {
	if (null == aClass525_Sub16_8778)
	    throw new IllegalStateException();
	aClass525_Sub16_8778.method16266(-1925745724);
	aClass525_Sub16_8778 = null;
    }
    
    void method14248() {
	aClass525_Sub16_8777
	    = aClass697_8776.aClass525_Sub16_8766.aClass525_Sub16_10554;
	aClass525_Sub16_8778 = null;
    }
    
    void method14249() {
	aClass525_Sub16_8777
	    = aClass697_8776.aClass525_Sub16_8766.aClass525_Sub16_10554;
	aClass525_Sub16_8778 = null;
    }
    
    void method14250(byte i) {
	aClass525_Sub16_8777
	    = aClass697_8776.aClass525_Sub16_8766.aClass525_Sub16_10554;
	aClass525_Sub16_8778 = null;
    }
    
    public Class525_Sub16 method14251() {
	method14250((byte) 34);
	return (Class525_Sub16) next();
    }
    
    public Class525_Sub16 method14252() {
	method14250((byte) 117);
	return (Class525_Sub16) next();
    }
    
    public Class700(Class697 class697) {
	aClass697_8776 = class697;
	aClass525_Sub16_8777
	    = aClass697_8776.aClass525_Sub16_8766.aClass525_Sub16_10554;
	aClass525_Sub16_8778 = null;
    }
    
    static void method14253(Class259 class259, Class246 class246, int i,
			    int i_0_, int i_1_, int i_2_, int i_3_, long l) {
	int i_4_ = i_2_ * i_2_ + i_1_ * i_1_;
	if ((long) i_4_ <= l) {
	    int i_5_;
	    if (5 == -174799205 * anInt8779)
		i_5_ = ((int) ((double) Class453_Sub3.aClass309_Sub1_10316
					    .method5491((byte) 0)
			       * 2607.5945876176133)
			+ 223546583 * client.anInt11059) & 0x3fff;
	    else if (-174799205 * anInt8779 == 2)
		i_5_ = (int) client.aFloat11052 & 0x3fff;
	    else
		i_5_
		    = ((int) client.aFloat11052 + 223546583 * client.anInt11059
		       & 0x3fff);
	    int i_6_ = Class436.anIntArray4831[i_5_];
	    int i_7_ = Class436.anIntArray4838[i_5_];
	    if (2 != anInt8779 * -174799205) {
		i_6_ = i_6_ * 256 / (256 + -198324601 * client.anInt11169);
		i_7_ = i_7_ * 256 / (-198324601 * client.anInt11169 + 256);
	    }
	    int i_8_ = i_7_ * i_1_ + i_2_ * i_6_ >> 14;
	    int i_9_ = i_7_ * i_2_ - i_6_ * i_1_ >> 14;
	    Class157 class157 = Class308_Sub1.aClass157Array10143[i_3_];
	    int i_10_ = class157.method2503();
	    int i_11_ = class157.method2471();
	    int i_12_
		= class259.anInt2602 * -1694810043 / 2 + i_8_ - i_10_ / 2;
	    int i_13_ = i_12_ + i_10_;
	    int i_14_ = -i_9_ + class259.anInt2598 * 2054207119 / 2 - i_11_;
	    int i_15_ = i_14_ + i_11_;
	    boolean bool;
	    if (null != class246)
		bool = (!class246.method4486(i_12_, i_14_, (byte) 45)
			|| !class246.method4486(i_13_, i_14_, (byte) 77)
			|| !class246.method4486(i_12_, i_15_, (byte) 58)
			|| !class246.method4486(i_13_, i_15_, (byte) 121));
	    else {
		int i_16_ = i_11_;
		int i_17_ = i_10_ / 2;
		bool = (i_14_ <= -i_16_
			|| i_15_ >= 2054207119 * class259.anInt2598
			|| i_12_ <= -i_17_
			|| i_13_ >= -1694810043 * class259.anInt2602 + i_17_);
	    }
	    if (bool) {
		double d = Math.atan2((double) i_8_, (double) i_9_);
		double d_18_ = Math.atan2((double) Math.abs(i_8_),
					  (double) Math.abs(i_9_));
		double d_19_ = Math.atan2((double) (-1694810043
						    * class259.anInt2602 / 2),
					  (double) (class259.anInt2598
						    * 2054207119 / 2));
		boolean bool_20_ = false;
		double d_21_ = 0.0;
		int i_22_;
		if (d_18_ < d_19_) {
		    d_21_ = 1.5707963267948966 - d;
		    i_22_ = 2054207119 * class259.anInt2598 / 2;
		} else {
		    d_21_ = d;
		    i_22_ = -1694810043 * class259.anInt2602 / 2;
		}
		int i_23_ = Math.abs((int) -((double) i_22_
					     * Math.sin(1.5707963267948966)
					     / Math.sin(d_21_)));
		Class335.aClass157Array3628[i_3_].method2532
		    (0.0F + ((float) (class259.anInt2602 * -1694810043) / 2.0F
			     + (float) i),
		     ((float) i_0_
		      + (float) (class259.anInt2598 * 2054207119) / 2.0F
		      - 0.0F),
		     ((float) Class335.aClass157Array3628[i_3_].method12()
		      / 2.0F),
		     (float) i_23_, 4096,
		     (int) (-d / 6.283185307179586 * 65535.0));
	    } else if (class246 != null)
		class157.method2480(i + i_12_, i_14_ + i_0_,
				    class246.aClass152_2433, i, i_0_);
	    else
		class157.method2518(i_12_ + i, i_0_ + i_14_);
	}
    }
    
    static final void method14254(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
}
