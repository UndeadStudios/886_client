/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Frame;
import java.util.Comparator;

class Class162 implements Comparator
{
    Class372_Sub1 this$0;
    public static Class245[] aClass245Array1764;
    
    public int method2631(Object object, Object object_0_) {
	return method2632((Class494) object, (Class494) object_0_, (byte) 1);
    }
    
    int method2632(Class494 class494, Class494 class494_1_, byte i) {
	float f = class494.method8019(966048724);
	float f_2_ = class494_1_.method8019(1137543978);
	if (f_2_ > f)
	    return 1;
	if (f_2_ < f)
	    return -1;
	return 0;
    }
    
    public int compare(Object object, Object object_3_) {
	return method2632((Class494) object, (Class494) object_3_, (byte) 1);
    }
    
    public int method2633(Object object, Object object_4_) {
	return method2632((Class494) object, (Class494) object_4_, (byte) 1);
    }
    
    int method2634(Class494 class494, Class494 class494_5_) {
	float f = class494.method8019(1199418101);
	float f_6_ = class494_5_.method8019(1708219796);
	if (f_6_ > f)
	    return 1;
	if (f_6_ < f)
	    return -1;
	return 0;
    }
    
    public int method2635(Object object, Object object_7_) {
	return method2632((Class494) object, (Class494) object_7_, (byte) 1);
    }
    
    Class162(Class372_Sub1 class372_sub1) {
	this$0 = class372_sub1;
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    public boolean method2636(Object object) {
	return super.equals(object);
    }
    
    public boolean method2637(Object object) {
	return super.equals(object);
    }
    
    public boolean method2638(Object object) {
	return super.equals(object);
    }
    
    public boolean method2639(Object object) {
	return super.equals(object);
    }
    
    public boolean method2640(Object object) {
	return super.equals(object);
    }
    
    static final void method2641(Class683 class683, int i) {
	int i_8_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class586 class586
	    = ((Class586)
	       Class227.aClass40_Sub1_2345.method76(i_8_, -1439462352));
	if (null != class586.anIntArray7732
	    && class586.anIntArray7732.length > 0) {
	    int i_9_ = 0;
	    int i_10_ = class586.anIntArray7729[0];
	    for (int i_11_ = 1; i_11_ < class586.anIntArray7732.length;
		 i_11_++) {
		if (class586.anIntArray7729[i_11_] > i_10_) {
		    i_9_ = i_11_;
		    i_10_ = class586.anIntArray7729[i_11_];
		}
	    }
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class586.anIntArray7732[i_9_];
	} else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 985921669 * class586.anInt7768;
    }
    
    static final void method2642(Class683 class683, short i) {
	int i_12_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	int[] is = Class235.method4404(i_12_, -1944647903);
	Class692.method14117(is, 0, class683.anIntArray8661,
			     class683.anInt8662 * 501271953, 3);
	class683.anInt8662 += 362986067;
    }
    
    public static void method2643(Class4 class4, Frame frame, byte i) {
	class4.method534(-2097263535);
	frame.setVisible(false);
	frame.dispose();
    }
}
