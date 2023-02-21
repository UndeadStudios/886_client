/* Class476 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Stack;

public class Class476
{
    static Class476 aClass476_5180;
    static Class476 aClass476_5181;
    static Class476 aClass476_5182;
    static Class476 aClass476_5183;
    static Class476 aClass476_5184;
    int anInt5185;
    static Class476 aClass476_5186 = new Class476(2);
    static Class476 aClass476_5187;
    
    Class476(int i) {
	anInt5185 = i * -413613645;
    }
    
    static {
	aClass476_5181 = new Class476(5);
	aClass476_5180 = new Class476(3);
	aClass476_5182 = new Class476(1);
	aClass476_5184 = new Class476(4);
	aClass476_5183 = new Class476(0);
	aClass476_5187 = new Class476(6);
    }
    
    public static void method7779(byte i) {
	synchronized (Class567.aStack7607) {
	    Class567.aStack7607 = new Stack();
	}
    }
    
    static void method7780(int i, int i_0_) {
	/* empty */
    }
    
    static final void method7781(Class656_Sub1 class656_sub1,
				 Class683 class683, int i) {
	boolean bool = false;
	int i_1_ = 0;
	int i_2_ = 0;
	int i_3_ = 0;
	int i_4_ = 0;
	if (class656_sub1.aClass211Array10869 != null) {
	    for (int i_5_ = 0; i_5_ < class656_sub1.aClass211Array10869.length;
		 i_5_++) {
		Class211 class211 = class656_sub1.aClass211Array10869[i_5_];
		if (class211.aBool2265) {
		    int i_6_;
		    int i_7_;
		    if (class211.anInt2263 < class211.anInt2264) {
			i_6_ = class211.anInt2263 - class211.anInt2268;
			i_7_ = class211.anInt2268 + class211.anInt2264;
		    } else {
			i_6_ = class211.anInt2264 - class211.anInt2268;
			i_7_ = class211.anInt2263 + class211.anInt2268;
		    }
		    int i_8_;
		    int i_9_;
		    if (class211.anInt2267 < class211.anInt2266) {
			i_8_ = class211.anInt2267 - class211.anInt2268;
			i_9_ = class211.anInt2268 + class211.anInt2266;
		    } else {
			i_8_ = class211.anInt2266 - class211.anInt2268;
			i_9_ = class211.anInt2267 + class211.anInt2268;
		    }
		    if (!bool || i_6_ < i_1_)
			i_1_ = i_6_;
		    if (!bool || i_8_ < i_2_)
			i_2_ = i_8_;
		    if (!bool || i_7_ > i_3_)
			i_3_ = i_7_;
		    if (!bool || i_9_ > i_4_)
			i_4_ = i_9_;
		    bool = true;
		}
	    }
	}
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = bool ? 1 : 0;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_1_;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_2_;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_3_;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_4_;
    }
}
