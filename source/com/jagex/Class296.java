/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class296 implements Interface76
{
    static Class296 aClass296_3254;
    static Class296 aClass296_3255;
    static Class296 aClass296_3256 = new Class296(0);
    int anInt3257;
    
    static {
	aClass296_3255 = new Class296(1);
	aClass296_3254 = new Class296(2);
    }
    
    public int method80() {
	return 1830977015 * anInt3257;
    }
    
    Class296(int i) {
	anInt3257 = 1026511815 * i;
    }
    
    public int method57() {
	return 1830977015 * anInt3257;
    }
    
    public int method75() {
	return 1830977015 * anInt3257;
    }
    
    static int method5353(int i, short i_0_) {
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) Class616.aClass10_8044.method684((long) i);
	if (null == class525_sub42) {
	    Class388 class388
		= Class616.anInterface49_8049.method342(i, (byte) 78);
	    if (class388 == null || 2 != -1444855139 * class388.anInt4047)
		return -1;
	    class525_sub42
		= new Class525_Sub42(1056590373 * Class616.anInt8051);
	    Class616.aClass10_8044.method695(class525_sub42, (long) i);
	    Class616.aClass388Array8052
		[(Class616.anInt8051 += -2109816403) * 1056590373 - 1]
		= class388;
	}
	return class525_sub42.anInt10858 * -1344652871;
    }
    
    static final void method5354(Class683 class683, byte i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_1_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_1_ >> 16];
	Class183.method3600(class259, class245, true, 0, class683, 568628584);
    }
}
