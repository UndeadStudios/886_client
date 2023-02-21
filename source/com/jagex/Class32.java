/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class32 implements Interface63
{
    public boolean method415(Class656_Sub1_Sub3 class656_sub1_sub3) {
	return (class656_sub1_sub3 instanceof Interface62
		&& ((Interface62) class656_sub1_sub3).method394((byte) -11));
    }
    
    public boolean method414(Class656_Sub1_Sub3 class656_sub1_sub3, int i) {
	return (class656_sub1_sub3 instanceof Interface62
		&& ((Interface62) class656_sub1_sub3).method394((byte) -45));
    }
    
    public boolean method416(Class656_Sub1_Sub3 class656_sub1_sub3) {
	return (class656_sub1_sub3 instanceof Interface62
		&& ((Interface62) class656_sub1_sub3).method394((byte) 62));
    }
    
    public boolean method417(Class656_Sub1_Sub3 class656_sub1_sub3) {
	return (class656_sub1_sub3 instanceof Interface62
		&& ((Interface62) class656_sub1_sub3).method394((byte) 94));
    }
    
    public boolean method418(Class656_Sub1_Sub3 class656_sub1_sub3) {
	return (class656_sub1_sub3 instanceof Interface62
		&& ((Interface62) class656_sub1_sub3).method394((byte) 103));
    }
    
    static final void method942(Class259 class259, Class245 class245,
				Class683 class683, byte i) {
	class259.aBool2713
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) == 1;
	Class649.method10708(class259, (byte) 0);
    }
    
    static final void method943(Class683 class683, byte i) {
	if (-1122540775 * client.anInt11232 >= 5
	    && client.anInt11232 * -1122540775 <= 9)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method944(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.anIntArray8647[class683.anInt8663 * 1931825055];
    }
    
    static void method945(Class182 class182, Class525_Sub37 class525_sub37,
			  Class287 class287, int i, int i_0_, int i_1_,
			  int i_2_, short i_3_) {
	int i_4_ = i - 5;
	int i_5_ = 2 + i_0_;
	if (0 != class287.anInt3159 * 1232481695)
	    class182.method3190(i_4_, i_5_, i_2_ + 10, i_1_ + i_0_ - i_5_ + 1,
				1232481695 * class287.anInt3159, (byte) -1);
	if (class287.anInt3160 * -1038283897 != 0)
	    class182.method3189(i_4_, i_5_, i_2_ + 10, i_0_ + i_1_ - i_5_ + 1,
				class287.anInt3160 * -1038283897, -997703613);
	int i_6_ = -1507268529 * class287.anInt3153;
	if (class525_sub37.aBool10829
	    && -1866284911 * class287.anInt3154 != -1)
	    i_6_ = class287.anInt3154 * -1866284911;
	Class614.aClass175_8040.method2839(class287.aString3152, i, i_0_, i_2_,
					   i_1_, ~0xffffff | i_6_,
					   1087670703 * (Class556_Sub1
							 .aClass623_7468
							 .anInt8104),
					   1, 0, 0, null, null, null, 0, 0,
					   -1370164869);
    }
    
    static void method946(int i, int i_7_) {
	Class696_Sub13.anInt10912 = i * -2002372447;
	Class556_Sub1.anInt10627 = 107721765;
	Class556_Sub1.anInt10627 = 107721765;
	Class58.method1221(-1859649566);
    }
    
    static final void method947(Class683 class683, int i) {
	int i_8_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_8_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_8_ >> 16];
	Class477.method7786(class259, class245, class683, (short) 876);
    }
}
