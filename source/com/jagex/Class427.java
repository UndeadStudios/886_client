/* Class427 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class427
{
    public static final int anInt4801 = 1;
    public static final int anInt4802 = 3;
    public static final int anInt4803 = 2;
    public static final int anInt4804 = 4;
    public static final int anInt4805 = 0;
    public static Class458 aClass458_4806;
    
    Class427() throws Throwable {
	throw new Error();
    }
    
    static final void method6783(Class683 class683, byte i) {
	Class163.method2659(1643078504);
    }
    
    static final void method6784(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aClass229_11119.method4356(i_0_, 2000078239)
		  .method3965(1089560214);
    }
    
    public static void method6785(float f, Class446 class446,
				  Class429 class429, Class446 class446_1_,
				  Class446 class446_2_, Class446 class446_3_,
				  float f_4_, float f_5_, float f_6_, int i) {
	if (!class446_1_.method7218(class446)) {
	    Class446 class446_7_ = Class446.method7208(0.0F, 0.0F, 0.0F);
	    Class446 class446_8_
		= Class446.method7209(Class446.method7225(class446_1_,
							  class446));
	    class446_8_.method7239(class429);
	    Class446 class446_9_
		= Class446.method7225(class446_8_, class446_7_);
	    float f_10_ = class446_9_.method7230();
	    if (class446_3_.aFloat4895 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class446.aFloat4895) || f_10_ > f_5_
		|| f_10_ < f_6_) {
		class446.method7216(class446_1_);
		class446_2_.method7217();
	    } else {
		class429.method6815();
		Class446 class446_11_ = Class446.method7208(1.0F, 0.0F, 0.0F);
		Class446 class446_12_ = Class446.method7208(0.0F, 1.0F, 0.0F);
		Class446 class446_13_ = Class446.method7208(0.0F, 0.0F, 1.0F);
		class446_11_.method7239(class429);
		class446_12_.method7239(class429);
		class446_13_.method7239(class429);
		Class446 class446_14_
		    = Class446.method7208(Class446.method7234(class446_11_,
							      class446_2_),
					  Class446.method7234(class446_12_,
							      class446_2_),
					  Class446.method7234(class446_13_,
							      class446_2_));
		Class446 class446_15_ = Class446.method7209(class446_14_);
		Class446 class446_16_
		    = (Class446.method7208
		       (class446_9_.aFloat4895 * class446_3_.aFloat4895,
			class446_9_.aFloat4896 * class446_3_.aFloat4896,
			class446_9_.aFloat4897 * class446_3_.aFloat4897));
		class446_15_.method7222(class446_16_, f);
		class446_15_.method7237(f_4_);
		Class446 class446_17_
		    = Class446.method7238(class446_11_,
					  class446_15_.aFloat4895);
		class446_17_.method7222(class446_12_, class446_15_.aFloat4896);
		class446_17_.method7222(class446_13_, class446_15_.aFloat4897);
		class446_2_.method7216(class446_17_);
		class446.method7221(Class446.method7238(class446_2_, f));
	    }
	}
    }
    
    static final void method6786(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1534974651 * class259.anInt2576;
    }
    
    public static void method6787(int i, short i_18_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(6, (long) i);
	class525_sub16_sub10.method18350((byte) 4);
    }
}
