/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class150
{
    Class200 aClass200_1722 = new Class200(10485760, 256);
    Class182_Sub3 aClass182_Sub3_1723;
    Interface24 anInterface24_1724;
    
    void method2425() {
	aClass200_1722.method3805(5, 1852807693);
    }
    
    Class150(Class182_Sub3 class182_sub3, Interface24 interface24) {
	aClass182_Sub3_1723 = class182_sub3;
	anInterface24_1724 = interface24;
    }
    
    Class136_Sub2 method2426(TextureMetrics class166, int i) {
	Class136_Sub2 class136_sub2
	    = ((Class136_Sub2)
	       aClass200_1722.method3785((long) (class166.anInt1800
						 * 261926313)));
	if (class136_sub2 != null)
	    return class136_sub2;
	if (!method2427(Class593.aClass593_7831, class166, i))
	    return null;
	if (i == -1)
	    i = class166.bitLoad * 2082667437;
	Class136_Sub2 class136_sub2_0_;
	if (!class166.aBool1815 || !aClass182_Sub3_1723.method3284()) {
	    int[] is;
	    if (class166.aClass597_1807 != Class597.aClass597_7842
		|| !Class679.method11200(class166.aByte1825, (byte) -119))
		is = anInterface24_1724.method132(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, false,
						  -1776249108);
	    else
		is = anInterface24_1724.method129(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, true,
						  -1423908969);
	    class136_sub2_0_
		= new Class136_Sub2(aClass182_Sub3_1723, 3553, i, i,
				    class166.aByte1809 != 0, is, 0, 0, false);
	} else {
	    float[] fs
		= anInterface24_1724.method131(Class593.aClass593_7831,
					       class166.anInt1800 * 261926313,
					       0.7F, i, i, false, (byte) 60);
	    class136_sub2_0_ = new Class136_Sub2(aClass182_Sub3_1723, 3553,
						 Class165.aClass165_1771,
						 Class178.aClass178_1912, i, i,
						 class166.aByte1809 != 0, fs,
						 Class165.aClass165_1771);
	}
	class136_sub2_0_.method14474(class166.aByte1810 == 1,
				     class166.aByte1811 == 1);
	aClass200_1722.method3789(class136_sub2_0_,
				  (long) (class166.anInt1800 * 261926313),
				  i * i, (byte) -36);
	return class136_sub2_0_;
    }
    
    boolean method2427(Class593 class593, TextureMetrics class166, int i) {
	if (i == -1)
	    i = class166.bitLoad * 2082667437;
	if (!class166.aBool1815 || !aClass182_Sub3_1723.method3284()) {
	    if (class166.aClass597_1807 != Class597.aClass597_7842
		|| !Class679.method11200(class166.aByte1825, (byte) -25))
		return anInterface24_1724.method130(class593,
						    (class166.anInt1800
						     * 261926313),
						    Class594.aClass594_7833,
						    0.7F, i, i, false,
						    (byte) 77);
	    return anInterface24_1724.method130(class593,
						class166.anInt1800 * 261926313,
						Class594.aClass594_7834, 0.7F,
						i, i, true, (byte) 72);
	}
	return anInterface24_1724.method130(class593,
					    class166.anInt1800 * 261926313,
					    Class594.aClass594_7835, 0.7F, i,
					    i, false, (byte) 6);
    }
    
    void method2428() {
	aClass200_1722.method3805(5, 2003635969);
    }
    
    void method2429() {
	aClass200_1722.method3791((byte) 14);
    }
    
    Class136_Sub2 method2430(TextureMetrics class166) {
	return method2426(class166, class166.bitLoad * 2082667437);
    }
    
    Class136_Sub2 method2431(TextureMetrics class166) {
	return method2426(class166, class166.bitLoad * 2082667437);
    }
    
    Class136_Sub2 method2432(TextureMetrics class166, int i) {
	Class136_Sub2 class136_sub2
	    = ((Class136_Sub2)
	       aClass200_1722.method3785((long) (class166.anInt1800
						 * 261926313)));
	if (class136_sub2 != null)
	    return class136_sub2;
	if (!method2427(Class593.aClass593_7831, class166, i))
	    return null;
	if (i == -1)
	    i = class166.bitLoad * 2082667437;
	Class136_Sub2 class136_sub2_1_;
	if (!class166.aBool1815 || !aClass182_Sub3_1723.method3284()) {
	    int[] is;
	    if (class166.aClass597_1807 != Class597.aClass597_7842
		|| !Class679.method11200(class166.aByte1825, (byte) -100))
		is = anInterface24_1724.method132(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, false,
						  -777906123);
	    else
		is = anInterface24_1724.method129(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, true,
						  -1952607393);
	    class136_sub2_1_
		= new Class136_Sub2(aClass182_Sub3_1723, 3553, i, i,
				    class166.aByte1809 != 0, is, 0, 0, false);
	} else {
	    float[] fs
		= anInterface24_1724.method131(Class593.aClass593_7831,
					       class166.anInt1800 * 261926313,
					       0.7F, i, i, false, (byte) 95);
	    class136_sub2_1_ = new Class136_Sub2(aClass182_Sub3_1723, 3553,
						 Class165.aClass165_1771,
						 Class178.aClass178_1912, i, i,
						 class166.aByte1809 != 0, fs,
						 Class165.aClass165_1771);
	}
	class136_sub2_1_.method14474(class166.aByte1810 == 1,
				     class166.aByte1811 == 1);
	aClass200_1722.method3789(class136_sub2_1_,
				  (long) (class166.anInt1800 * 261926313),
				  i * i, (byte) -54);
	return class136_sub2_1_;
    }
    
    void method2433() {
	aClass200_1722.method3791((byte) 106);
    }
    
    Class136_Sub2 method2434(TextureMetrics class166, int i) {
	Class136_Sub2 class136_sub2
	    = ((Class136_Sub2)
	       aClass200_1722.method3785((long) (class166.anInt1800
						 * 261926313)));
	if (class136_sub2 != null)
	    return class136_sub2;
	if (!method2427(Class593.aClass593_7831, class166, i))
	    return null;
	if (i == -1)
	    i = class166.bitLoad * 2082667437;
	Class136_Sub2 class136_sub2_2_;
	if (!class166.aBool1815 || !aClass182_Sub3_1723.method3284()) {
	    int[] is;
	    if (class166.aClass597_1807 != Class597.aClass597_7842
		|| !Class679.method11200(class166.aByte1825, (byte) -57))
		is = anInterface24_1724.method132(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, false,
						  -945581449);
	    else
		is = anInterface24_1724.method129(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, true,
						  -546752091);
	    class136_sub2_2_
		= new Class136_Sub2(aClass182_Sub3_1723, 3553, i, i,
				    class166.aByte1809 != 0, is, 0, 0, false);
	} else {
	    float[] fs
		= anInterface24_1724.method131(Class593.aClass593_7831,
					       class166.anInt1800 * 261926313,
					       0.7F, i, i, false, (byte) 47);
	    class136_sub2_2_ = new Class136_Sub2(aClass182_Sub3_1723, 3553,
						 Class165.aClass165_1771,
						 Class178.aClass178_1912, i, i,
						 class166.aByte1809 != 0, fs,
						 Class165.aClass165_1771);
	}
	class136_sub2_2_.method14474(class166.aByte1810 == 1,
				     class166.aByte1811 == 1);
	aClass200_1722.method3789(class136_sub2_2_,
				  (long) (class166.anInt1800 * 261926313),
				  i * i, (byte) -120);
	return class136_sub2_2_;
    }
    
    Class136_Sub2 method2435(TextureMetrics class166) {
	return method2426(class166, class166.bitLoad * 2082667437);
    }
    
    void method2436() {
	aClass200_1722.method3805(5, 1889523437);
    }
    
    void method2437() {
	aClass200_1722.method3791((byte) -25);
    }
    
    boolean method2438(Class593 class593, TextureMetrics class166, int i) {
	if (i == -1)
	    i = class166.bitLoad * 2082667437;
	if (!class166.aBool1815 || !aClass182_Sub3_1723.method3284()) {
	    if (class166.aClass597_1807 != Class597.aClass597_7842
		|| !Class679.method11200(class166.aByte1825, (byte) -113))
		return anInterface24_1724.method130(class593,
						    (class166.anInt1800
						     * 261926313),
						    Class594.aClass594_7833,
						    0.7F, i, i, false,
						    (byte) 119);
	    return anInterface24_1724.method130(class593,
						class166.anInt1800 * 261926313,
						Class594.aClass594_7834, 0.7F,
						i, i, true, (byte) 53);
	}
	return anInterface24_1724.method130(class593,
					    class166.anInt1800 * 261926313,
					    Class594.aClass594_7835, 0.7F, i,
					    i, false, (byte) 19);
    }
}
