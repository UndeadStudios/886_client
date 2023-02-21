/* Class561 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Comparator;

class Class561 implements Comparator
{
    Class372_Sub2 this$0;
    static int anInt7550;
    
    public int method9414(Object object, Object object_0_) {
	return method9415((Class494) object, (Class494) object_0_, -644907855);
    }
    
    int method9415(Class494 class494, Class494 class494_1_, int i) {
	float f = class494.method8019(1527627062);
	float f_2_ = class494_1_.method8019(1616262330);
	if (f_2_ > f)
	    return 1;
	if (f_2_ < f)
	    return -1;
	return 0;
    }
    
    public int compare(Object object, Object object_3_) {
	return method9415((Class494) object, (Class494) object_3_, -644907855);
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    public boolean method9416(Object object) {
	return super.equals(object);
    }
    
    public int method9417(Object object, Object object_4_) {
	return method9415((Class494) object, (Class494) object_4_, -644907855);
    }
    
    public int method9418(Object object, Object object_5_) {
	return method9415((Class494) object, (Class494) object_5_, -644907855);
    }
    
    public boolean method9419(Object object) {
	return super.equals(object);
    }
    
    int method9420(Class494 class494, Class494 class494_6_) {
	float f = class494.method8019(1175801718);
	float f_7_ = class494_6_.method8019(999569365);
	if (f_7_ > f)
	    return 1;
	if (f_7_ < f)
	    return -1;
	return 0;
    }
    
    public boolean method9421(Object object) {
	return super.equals(object);
    }
    
    public boolean method9422(Object object) {
	return super.equals(object);
    }
    
    public boolean method9423(Object object) {
	return super.equals(object);
    }
    
    Class561(Class372_Sub2 class372_sub2) {
	this$0 = class372_sub2;
    }
    
    public static Class390 method9424(RSBuffer class525_sub38, int i) {
	Class390 class390 = Class198.method3766(class525_sub38, -2024962598);
	int i_8_ = class525_sub38.readBigSmart(-2043778683);
	int i_9_ = class525_sub38.readBigSmart(-2043778683);
	int i_10_ = class525_sub38.readBigSmart(-2043778683);
	int i_11_ = class525_sub38.readBigSmart(-2043778683);
	int i_12_ = class525_sub38.readBigSmart(-2043778683);
	int i_13_ = class525_sub38.readBigSmart(-2043778683);
	return new Class390_Sub1(class390.aClass395_4068,
				 class390.aClass396_4062,
				 1345009707 * class390.anInt4063,
				 1202152725 * class390.anInt4064,
				 1827301945 * class390.anInt4065,
				 -797820993 * class390.anInt4066,
				 1374070015 * class390.anInt4067,
				 -349107147 * class390.anInt4061,
				 512449097 * class390.anInt4069, i_8_, i_9_,
				 i_10_, i_11_, i_12_, i_13_);
    }
    
    static final void method9425(Class683 class683, byte i) {
	int i_14_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class287 class287
	    = ((Class287)
	       Class698.aClass40_Sub2_8770.method76(i_14_, -1918543918));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class287.anInt3150 * 1564425333;
    }
}
