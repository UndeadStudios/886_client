/* Class672 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class672
{
    public static float method11048(Class429 class429) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d = Math.atan2((double) class446.aFloat4895,
			      (double) class446.aFloat4897);
	class446.method7260();
	if (d < 0.0)
	    d = d + 3.141592653589793 + 3.141592653589793;
	return (float) d;
    }
    
    public static float method11049(Class429 class429) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d
	    = 1.5707963267948966 - Math.acos((double) class446.aFloat4896);
	class446.method7260();
	return (float) d;
    }
    
    public static float method11050(Class429 class429) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d
	    = 1.5707963267948966 - Math.acos((double) class446.aFloat4896);
	class446.method7260();
	return (float) d;
    }
    
    public static int method11051(Class429 class429) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d
	    = 1.5707963267948966 - Math.acos((double) class446.aFloat4896);
	class446.method7260();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
    }
    
    public static float method11052(Class429 class429) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d
	    = 1.5707963267948966 - Math.acos((double) class446.aFloat4896);
	class446.method7260();
	return (float) d;
    }
    
    Class672() throws Throwable {
	throw new Error();
    }
    
    public static int method11053(Class429 class429) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d
	    = 1.5707963267948966 - Math.acos((double) class446.aFloat4896);
	class446.method7260();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
    }
    
    public static float method11054(Class429 class429) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d = Math.atan2((double) class446.aFloat4895,
			      (double) class446.aFloat4897);
	class446.method7260();
	if (d < 0.0)
	    d = d + 3.141592653589793 + 3.141592653589793;
	return (float) d;
    }
    
    public static float method11055(Class429 class429) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d
	    = 1.5707963267948966 - Math.acos((double) class446.aFloat4896);
	class446.method7260();
	return (float) d;
    }
    
    public static int method11056(Class429 class429) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d = Math.atan2((double) class446.aFloat4895,
			      (double) class446.aFloat4897);
	class446.method7260();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (int) (16384.0 * (d / 6.283185307179586)) & 0x3fff;
    }
    
    static int method11057(int i, int i_0_, int i_1_) {
	int i_2_ = i >> 31 & i_0_ - 1;
	return (i + (i >>> 31)) % i_0_ + i_2_;
    }
    
    static final void method11058(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.anInt3775 * 1018823119;
    }
}
