/* Class531 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class531
{
    public Class531 aClass531_7147;
    public Class531 aClass531_7148;
    
    public void method8793() {
	if (aClass531_7148 != null) {
	    aClass531_7148.aClass531_7147 = aClass531_7147;
	    aClass531_7147.aClass531_7148 = aClass531_7148;
	    aClass531_7147 = null;
	    aClass531_7148 = null;
	}
    }
    
    public void method8794(int i) {
	if (aClass531_7148 != null) {
	    aClass531_7148.aClass531_7147 = aClass531_7147;
	    aClass531_7147.aClass531_7148 = aClass531_7148;
	    aClass531_7147 = null;
	    aClass531_7148 = null;
	}
    }
    
    public void method8795() {
	if (aClass531_7148 != null) {
	    aClass531_7148.aClass531_7147 = aClass531_7147;
	    aClass531_7147.aClass531_7148 = aClass531_7148;
	    aClass531_7147 = null;
	    aClass531_7148 = null;
	}
    }
    
    static final void method8796(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class289.method5267(class259, class245, class683, 1274929439);
    }
    
    static final void method8797(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = (Class562.aClass471_7557.method7736(i_1_, -1675709702)
	       .aString11917);
    }
    
    static final void method8798(Class683 class683, boolean bool, int i) {
	class683.anInt8662 -= -1189665054;
	int i_2_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_3_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	Class85 class85 = Class696.method14181(i_2_, -1713394414);
	if (null == class85)
	    throw new RuntimeException();
	Class442.aList4868
	    = class85.method1618(Integer.valueOf(i_3_), 1892567348);
	if (Class442.aList4868 != null) {
	    Class198_Sub9.anIterator9962 = Class442.aList4868.iterator();
	    if (bool)
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = Class442.aList4868.size();
	} else if (bool)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method8799(Class683 class683, int i) {
	Class407.aClass407_4177.method6626((byte) 116);
    }
    
    static final void method8800(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
    }
    
    static final void method8801(int i, byte i_4_) {
	Class229.method4379(-1415064970);
	int i_5_ = (((Class163_Sub2) Class109.aClass106_Sub1_Sub1_1323
					 .method76(i, 1249829646)).anInt8987
		    * -743792435);
	if (0 != i_5_) {
	    int i_6_ = (Class532.aClass111_7170.method104
			((Class163) Class109.aClass106_Sub1_Sub1_1323
					.method76(i, 1599093633),
			 623775022));
	    if (i_5_ == 5)
		client.anInt11250 = i_6_ * -279956507;
	    if (i_5_ == 6)
		client.anInt11262 = -1528885291 * i_6_;
	}
    }
    
    public static void method8802(int i) {
	if (Class589.aBool7794) {
	    int i_7_ = Class285.aTwitchTV3143.ShutdownTTV();
	    if (i_7_ == 0) {
		Class285.aTwitchTV3143 = null;
		Class589.aBool7794 = false;
	    }
	}
    }
}
