/* Class302 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class302
{
    int anInt3375;
    static Class302 aClass302_3376;
    boolean aBool3377;
    static Class302 aClass302_3378;
    static Class302 aClass302_3379 = new Class302(0, true);
    static boolean aBool3380;
    
    Class302(int i, boolean bool) {
	anInt3375 = i * 1105116915;
	aBool3377 = bool;
    }
    
    public static Class302 method5406(int i) {
	if (i == aClass302_3379.anInt3375 * -1021736389)
	    return aClass302_3379;
	if (aClass302_3376.anInt3375 * -1021736389 == i)
	    return aClass302_3376;
	if (i == aClass302_3378.anInt3375 * -1021736389)
	    return aClass302_3378;
	return null;
    }
    
    public static Class302 method5407(int i) {
	if (i == aClass302_3379.anInt3375 * -1021736389)
	    return aClass302_3379;
	if (aClass302_3376.anInt3375 * -1021736389 == i)
	    return aClass302_3376;
	if (i == aClass302_3378.anInt3375 * -1021736389)
	    return aClass302_3378;
	return null;
    }
    
    static {
	aClass302_3376 = new Class302(1, true);
	aClass302_3378 = new Class302(2, false);
    }
    
    static final void method5408(Class259 class259, Class683 class683, int i) {
	int i_0_ = 10;
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class619.method10167(class259, i_0_, i_1_, i_2_, class683, 994448801);
    }
    
    static final void method5409(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10678
		  .method17324(-16711936);
    }
    
    static void method5410(RSBuffer class525_sub38, long l) {
	Class16 class16;
	if (Class70.aString779 != null && Class70.aString779.length() == 6) {
	    if (Class70.aBool780)
		class16 = Class16.aClass16_183;
	    else
		class16 = Class16.aClass16_182;
	} else if (Class424.aClass52_4742.method1152(l))
	    class16 = Class16.aClass16_184;
	else
	    class16 = Class16.aClass16_185;
	class525_sub38.method16735(class16.method80(), -1394620519);
	switch (-2009487659 * class16.anInt186) {
	case 0:
	    class525_sub38.pos += 1357713884;
	    break;
	case 1:
	    class525_sub38.method16605(Class424.aClass52_4742.method1145(l),
				       -2079440453);
	    break;
	case 2:
	case 3:
	    class525_sub38.method16604(Integer.parseInt(Class70.aString779),
				       (byte) 1);
	    class525_sub38.pos += 339428471;
	    break;
	}
    }
}
