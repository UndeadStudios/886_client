/* Class567 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Stack;

import com.jagex.twitchtv.TwitchTV;

public class Class567
{
    public Class656_Sub1 aClass656_Sub1_7606;
    static Stack aStack7607 = new Stack();
    boolean aBool7608;
    Class557 aClass557_7609;
    
    public static void method9474() {
	synchronized (aStack7607) {
	    aStack7607 = new Stack();
	}
    }
    
    static void method9475(Class567 class567) {
	class567.aClass656_Sub1_7606 = null;
	synchronized (aStack7607) {
	    if (aStack7607.size() < 200)
		aStack7607.push(class567);
	}
    }
    
    public static Class567 method9476(boolean bool) {
	synchronized (aStack7607) {
	    Class567 class567;
	    if (aStack7607.isEmpty())
		class567 = new Class567();
	    else
		class567 = (Class567) aStack7607.pop();
	    class567.aBool7608 = bool;
	    Class567 class567_0_ = class567;
	    return class567_0_;
	}
    }
    
    public static Class567 method9477(boolean bool) {
	synchronized (aStack7607) {
	    Class567 class567;
	    if (aStack7607.isEmpty())
		class567 = new Class567();
	    else
		class567 = (Class567) aStack7607.pop();
	    class567.aBool7608 = bool;
	    Class567 class567_1_ = class567;
	    return class567_1_;
	}
    }
    
    public static Class567 method9478(boolean bool) {
	synchronized (aStack7607) {
	    Class567 class567;
	    if (aStack7607.isEmpty())
		class567 = new Class567();
	    else
		class567 = (Class567) aStack7607.pop();
	    class567.aBool7608 = bool;
	    Class567 class567_2_ = class567;
	    return class567_2_;
	}
    }
    
    public boolean method9479(Class182 class182, int i, int i_3_) {
	int i_4_ = aClass656_Sub1_7606.method16911(-71428513);
	if (aClass656_Sub1_7606.aClass211Array10869 != null) {
	    for (int i_5_ = 0;
		 i_5_ < aClass656_Sub1_7606.aClass211Array10869.length;
		 i_5_++) {
		aClass656_Sub1_7606.aClass211Array10869[i_5_].anInt2268
		    <<= i_4_;
		if ((aClass656_Sub1_7606.aClass211Array10869[i_5_].method3927
		     (i + aClass557_7609.anInt7532 * -296588691,
		      i_3_ + aClass557_7609.anInt7535 * 76955409))
		    && aClass656_Sub1_7606.method16910(class182, i, i_3_,
						       (byte) 1)) {
		    aClass656_Sub1_7606.aClass211Array10869[i_5_].anInt2268
			>>= i_4_;
		    return true;
		}
		aClass656_Sub1_7606.aClass211Array10869[i_5_].anInt2268
		    >>= i_4_;
	    }
	}
	return false;
    }
    
    public static void method9480() {
	synchronized (aStack7607) {
	    aStack7607 = new Stack();
	}
    }
    
    public static void method9481() {
	synchronized (aStack7607) {
	    aStack7607 = new Stack();
	}
    }
    
    public boolean method9482(Class182 class182, int i, int i_6_, int i_7_) {
	int i_8_ = aClass656_Sub1_7606.method16911(-1846637805);
	if (aClass656_Sub1_7606.aClass211Array10869 != null) {
	    for (int i_9_ = 0;
		 i_9_ < aClass656_Sub1_7606.aClass211Array10869.length;
		 i_9_++) {
		aClass656_Sub1_7606.aClass211Array10869[i_9_].anInt2268
		    <<= i_8_;
		if ((aClass656_Sub1_7606.aClass211Array10869[i_9_].method3927
		     (i + aClass557_7609.anInt7532 * -296588691,
		      i_6_ + aClass557_7609.anInt7535 * 76955409))
		    && aClass656_Sub1_7606.method16910(class182, i, i_6_,
						       (byte) 1)) {
		    aClass656_Sub1_7606.aClass211Array10869[i_9_].anInt2268
			>>= i_8_;
		    return true;
		}
		aClass656_Sub1_7606.aClass211Array10869[i_9_].anInt2268
		    >>= i_8_;
	    }
	}
	return false;
    }
    
    public static void method9483() {
	synchronized (aStack7607) {
	    aStack7607 = new Stack();
	}
    }
    
    Class567() {
	/* empty */
    }
    
    public boolean method9484(Class182 class182, int i, int i_10_) {
	int i_11_ = aClass656_Sub1_7606.method16911(-52353917);
	if (aClass656_Sub1_7606.aClass211Array10869 != null) {
	    for (int i_12_ = 0;
		 i_12_ < aClass656_Sub1_7606.aClass211Array10869.length;
		 i_12_++) {
		aClass656_Sub1_7606.aClass211Array10869[i_12_].anInt2268
		    <<= i_11_;
		if ((aClass656_Sub1_7606.aClass211Array10869[i_12_].method3927
		     (i + aClass557_7609.anInt7532 * -296588691,
		      i_10_ + aClass557_7609.anInt7535 * 76955409))
		    && aClass656_Sub1_7606.method16910(class182, i, i_10_,
						       (byte) 1)) {
		    aClass656_Sub1_7606.aClass211Array10869[i_12_].anInt2268
			>>= i_11_;
		    return true;
		}
		aClass656_Sub1_7606.aClass211Array10869[i_12_].anInt2268
		    >>= i_11_;
	    }
	}
	return false;
    }
    
    public boolean method9485(Class182 class182, int i, int i_13_) {
	int i_14_ = aClass656_Sub1_7606.method16911(2030066892);
	if (aClass656_Sub1_7606.aClass211Array10869 != null) {
	    for (int i_15_ = 0;
		 i_15_ < aClass656_Sub1_7606.aClass211Array10869.length;
		 i_15_++) {
		aClass656_Sub1_7606.aClass211Array10869[i_15_].anInt2268
		    <<= i_14_;
		if ((aClass656_Sub1_7606.aClass211Array10869[i_15_].method3927
		     (i + aClass557_7609.anInt7532 * -296588691,
		      i_13_ + aClass557_7609.anInt7535 * 76955409))
		    && aClass656_Sub1_7606.method16910(class182, i, i_13_,
						       (byte) 1)) {
		    aClass656_Sub1_7606.aClass211Array10869[i_15_].anInt2268
			>>= i_14_;
		    return true;
		}
		aClass656_Sub1_7606.aClass211Array10869[i_15_].anInt2268
		    >>= i_14_;
	    }
	}
	return false;
    }
    
    public boolean method9486(Class182 class182, int i, int i_16_) {
	int i_17_ = aClass656_Sub1_7606.method16911(1315121990);
	if (aClass656_Sub1_7606.aClass211Array10869 != null) {
	    for (int i_18_ = 0;
		 i_18_ < aClass656_Sub1_7606.aClass211Array10869.length;
		 i_18_++) {
		aClass656_Sub1_7606.aClass211Array10869[i_18_].anInt2268
		    <<= i_17_;
		if ((aClass656_Sub1_7606.aClass211Array10869[i_18_].method3927
		     (i + aClass557_7609.anInt7532 * -296588691,
		      i_16_ + aClass557_7609.anInt7535 * 76955409))
		    && aClass656_Sub1_7606.method16910(class182, i, i_16_,
						       (byte) 1)) {
		    aClass656_Sub1_7606.aClass211Array10869[i_18_].anInt2268
			>>= i_17_;
		    return true;
		}
		aClass656_Sub1_7606.aClass211Array10869[i_18_].anInt2268
		    >>= i_17_;
	    }
	}
	return false;
    }
    
    static int method9487(int i) {
	try {
	    for (int i_19_ = 0; i_19_ < Class589.aStringArray7793.length;
		 i_19_++) {
		if (null != Class589.aStringArray7793[i_19_]
		    && Class589.aBoolArray7792[i_19_])
		    EmitterConfig.method18248(-691734241).method385
			(Class589.aStringArray7793[i_19_], -1153771936);
	    }
	} catch (Exception_Sub2 exception_sub2) {
	    return 3;
	}
	Class285.aTwitchTV3143 = new TwitchTV();
	int i_20_ = Class285.aTwitchTV3143
			.InitialiseTTV(Class324.method5735((byte) 75));
	if (0 == i_20_)
	    Class589.aBool7794 = true;
	else
	    Class525_Sub16_Sub13.method18448(new StringBuilder().append(10)
						 .append
						 (Class55.aString560).append
						 (i_20_).toString(),
					     new RuntimeException(),
					     (byte) 67);
	return 2;
    }
    
    static final void method9488(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_21_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_22_
	    = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	int i_23_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	Class259 class259 = Class43.method1069(i_23_, -695254952);
	Class169.method2728(class259, i_21_, i_22_, -1522971015);
    }
    
    public static Class525_Sub16_Sub16 method9489(byte i) {
	return Class198_Sub19.aClass525_Sub16_Sub16_9993;
    }
    
    public static Class511 method9490(int i) {
	Class511_Sub1 class511_sub1;
	try {
	    class511_sub1 = new Class511_Sub1();
	} catch (Throwable throwable) {
	    return new Class511_Sub2();
	}
	return class511_sub1;
    }
}
