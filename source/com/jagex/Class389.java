/* Class389 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class389 implements Interface45
{
    public int anInt4060;
    
    Class389(int i) {
	anInt4060 = i * -1302876237;
    }
    
    public Class392 method334(int i) {
	return Class392.aClass392_4078;
    }
    
    public Class392 method335() {
	return Class392.aClass392_4078;
    }
    
    public Class392 method336() {
	return Class392.aClass392_4078;
    }
    
    static final void method6463(Class683 class683, int i) {
	int i_0_ = class683.anIntArray8647[class683.anInt8663 * 1931825055];
	Class525_Sub16_Sub4 class525_sub16_sub4
	    = Class166.method2675(i_0_, (byte) -61);
	if (null == class525_sub16_sub4)
	    throw new RuntimeException();
	int[] is = new int[-1831313555 * class525_sub16_sub4.anInt11747];
	Object[] objects
	    = new Object[class525_sub16_sub4.anInt11752 * 678090421];
	long[] ls = new long[class525_sub16_sub4.anInt11753 * -1954010063];
	for (int i_1_ = 0; i_1_ < -34409865 * class525_sub16_sub4.anInt11754;
	     i_1_++)
	    is[i_1_]
		= (class683.anIntArray8661
		   [i_1_ + (501271953 * class683.anInt8662
			    - class525_sub16_sub4.anInt11754 * -34409865)]);
	for (int i_2_ = 0; i_2_ < -2055136469 * class525_sub16_sub4.anInt11748;
	     i_2_++)
	    objects[i_2_]
		= (class683.anObjectArray8636
		   [i_2_ + (1373599041 * class683.anInt8644
			    - class525_sub16_sub4.anInt11748 * -2055136469)]);
	for (int i_3_ = 0; i_3_ < class525_sub16_sub4.anInt11756 * -978542421;
	     i_3_++)
	    ls[i_3_]
		= (class683.aLongArray8645
		   [(105529793 * class683.anInt8648
		     - class525_sub16_sub4.anInt11756 * -978542421 + i_3_)]);
	class683.anInt8662 -= class525_sub16_sub4.anInt11754 * 68443015;
	class683.anInt8644 -= class525_sub16_sub4.anInt11748 * -2114463381;
	class683.anInt8648 -= 1093821803 * class525_sub16_sub4.anInt11756;
	Class649 class649 = new Class649();
	class649.aClass525_Sub16_Sub4_8367
	    = class683.aClass525_Sub16_Sub4_8664;
	class649.anInt8365 = class683.anInt8663 * 1224414323;
	class649.anIntArray8366 = class683.anIntArray8649;
	class649.anObjectArray8364 = class683.anObjectArray8637;
	class649.aLongArray8368 = class683.aLongArray8638;
	if (class683.anInt8650 * -965162233
	    >= class683.aClass649Array8640.length)
	    throw new RuntimeException();
	class683.aClass649Array8640
	    [(class683.anInt8650 += -559631689) * -965162233 - 1]
	    = class649;
	class683.aClass525_Sub16_Sub4_8664 = class525_sub16_sub4;
	class683.aClass517Array8656
	    = class683.aClass525_Sub16_Sub4_8664.aClass517Array11746;
	class683.anIntArray8647
	    = class683.aClass525_Sub16_Sub4_8664.anIntArray11749;
	class683.anInt8663 = 1827402657;
	class683.anIntArray8649 = is;
	class683.anObjectArray8637 = objects;
	class683.aLongArray8638 = ls;
    }
    
    static final void method6464(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class224.method4246(class259, class245, class683, 1883246729);
    }
    
    static final void method6465(Class683 class683, short i) {
	if (619753713 * client.anInt11231 >= 2)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= client.anInt11231 * 619753713;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method6466(Class683 class683, int i) {
	float f
	    = Class436.method7071(class683.anIntArray8661[((class683.anInt8662
							    -= 1552651121)
							   * 501271953)]);
	Class525_Sub16_Sub9_Sub1 class525_sub16_sub9_sub1
	    = new Class525_Sub16_Sub9_Sub1(Class453_Sub3
					       .aClass309_Sub1_10316
					       .method15748(1727597662),
					   f);
	Class453_Sub3.aClass309_Sub1_10316.method5551(class525_sub16_sub9_sub1,
						      -1074995218);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class525_sub16_sub9_sub1.anInt11794 * 1940820665;
    }
    
    public static Class18[] method6467(Class4 class4, int i) {
	int[] is = class4.method532((byte) 119);
	Class18[] class18s = new Class18[is.length >> 2];
	for (int i_4_ = 0; i_4_ < class18s.length; i_4_++) {
	    Class18 class18 = new Class18();
	    class18s[i_4_] = class18;
	    class18.anInt200 = is[i_4_ << 2] * -1842247821;
	    class18.anInt201 = is[1 + (i_4_ << 2)] * 61613439;
	    class18.anInt202 = -1753671315 * is[(i_4_ << 2) + 2];
	    class18.anInt203 = is[(i_4_ << 2) + 3] * -903355675;
	}
	return class18s;
    }
    
    static void method6468(Class690 class690, byte i) {
	Class25.aClass690_243 = class690;
	Class587.aString7773 = null;
    }
    
    static final void method6469(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1377539303 * client.anInt11167;
    }
}
