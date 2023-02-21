/* Class483 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class483 implements Interface11
{
    public Object method63(RSBuffer class525_sub38) {
	return Integer.valueOf(class525_sub38.readInt(1392202376));
    }
    
    public Object method64(RSBuffer class525_sub38) {
	return Integer.valueOf(class525_sub38.readInt(829846305));
    }
    
    public Object method65(RSBuffer class525_sub38, int i) {
	return Integer.valueOf(class525_sub38.readInt(944987755));
    }
    
    static Class525_Sub16_Sub4 method7834(byte[] is, int i) {
	return new Class525_Sub16_Sub4(new RSBuffer(is),
				       Class607.anInterface20_7975);
    }
    
    static void method7835(Class525_Sub38_Sub2 class525_sub38_sub2, int i) {
	Class56[] class56s = Class713.method14458((byte) 1);
	for (int i_0_ = 0; i_0_ < class56s.length; i_0_++) {
	    Class56 class56 = class56s[i_0_];
	    if (class56 != Class56.aClass56_595) {
		Class458 class458
		    = (Class458) Class525_Sub7_Sub13.aMap11727.get(class56);
		if (null == class458)
		    class525_sub38_sub2.method16605(0, -1463721950);
		else
		    class525_sub38_sub2.method16605(class458
							.method7471(-60002090),
						    -779763968);
	    }
	}
    }
    
    static final void method7836(Class683 class683, byte i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_1_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_1_ >> 16];
	Class467.method7698(class259, class245, class683, 1769403025);
    }
    
    public static float method7837(Class429 class429, byte i) {
	Class446 class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
	class446.method7239(class429);
	double d = Math.atan2((double) class446.aFloat4895,
			      (double) class446.aFloat4897);
	class446.method7260();
	if (d < 0.0)
	    d = d + 3.141592653589793 + 3.141592653589793;
	return (float) d;
    }
}
