/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class351
{
    Class200 aClass200_3742 = new Class200(10485760, 256);
    Interface24 anInterface24_3743;
    Class182_Sub1 aClass182_Sub1_3744;
    
    Interface38 method6159(TextureMetrics class166) {
	return method6161(class166, class166.bitLoad * 2082667437);
    }
    
    boolean method6160(TextureMetrics class166, int i) {
	if (i == -1)
	    i = class166.bitLoad * 2082667437;
	if (!class166.aBool1815 || !aClass182_Sub1_3744.method3284()) {
	    if (class166.aClass597_1807 != Class597.aClass597_7842
		|| !Class679.method11200(class166.aByte1825, (byte) -122))
		return anInterface24_3743.method130(Class593.aClass593_7831,
						    (class166.anInt1800
						     * 261926313),
						    Class594.aClass594_7833,
						    0.7F, i, i, false,
						    (byte) 116);
	    return anInterface24_3743.method130(Class593.aClass593_7831,
						class166.anInt1800 * 261926313,
						Class594.aClass594_7834, 0.7F,
						i, i, true, (byte) 34);
	}
	return anInterface24_3743.method130(Class593.aClass593_7831,
					    class166.anInt1800 * 261926313,
					    Class594.aClass594_7835, 0.7F, i,
					    i, false, (byte) 67);
    }
    
    Interface38 method6161(TextureMetrics class166, int i) {
	long l = (long) (i << 16 | class166.anInt1800 * 261926313);
	Interface38 interface38 = (Interface38) aClass200_3742.method3785(l);
	if (interface38 != null)
	    return interface38;
	if (!method6162(class166, i))
	    return null;
	if (i == -1)
	    i = class166.bitLoad * 2082667437;
	Interface38 interface38_0_;
	if (!class166.aBool1815 || !aClass182_Sub1_3744.method3284()) {
	    int[] is;
	    if (class166.aClass597_1807 != Class597.aClass597_7842
		|| !Class679.method11200(class166.aByte1825, (byte) -10))
		is = anInterface24_3743.method132(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, false,
						  -1798345938);
	    else
		is = anInterface24_3743.method129(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, true,
						  -1720491973);
	    if (is == null)
		return null;
	    interface38_0_ = aClass182_Sub1_3744.method14723(i, i, true, is);
	} else {
	    float[] fs
		= anInterface24_3743.method131(Class593.aClass593_7831,
					       class166.anInt1800 * 261926313,
					       0.7F, i, i, false, (byte) 44);
	    interface38_0_
		= aClass182_Sub1_3744.method14784(Class165.aClass165_1771, i,
						  i, true, fs);
	}
	interface38_0_.method231(class166.aByte1810 == 1,
				 class166.aByte1811 == 1);
	aClass200_3742.method3789(interface38_0_, l, i * i, (byte) -73);
	return interface38_0_;
    }
    
    boolean method6162(TextureMetrics class166, int i) {
	if (i == -1)
	    i = class166.bitLoad * 2082667437;
	if (!class166.aBool1815 || !aClass182_Sub1_3744.method3284()) {
	    if (class166.aClass597_1807 != Class597.aClass597_7842
		|| !Class679.method11200(class166.aByte1825, (byte) -72))
		return anInterface24_3743.method130(Class593.aClass593_7831,
						    (class166.anInt1800
						     * 261926313),
						    Class594.aClass594_7833,
						    0.7F, i, i, false,
						    (byte) 40);
	    return anInterface24_3743.method130(Class593.aClass593_7831,
						class166.anInt1800 * 261926313,
						Class594.aClass594_7834, 0.7F,
						i, i, true, (byte) 35);
	}
	return anInterface24_3743.method130(Class593.aClass593_7831,
					    class166.anInt1800 * 261926313,
					    Class594.aClass594_7835, 0.7F, i,
					    i, false, (byte) 12);
    }
    
    Class351(Class182_Sub1 class182_sub1, Interface24 interface24) {
	aClass182_Sub1_3744 = class182_sub1;
	anInterface24_3743 = interface24;
    }
    
    void method6163() {
	aClass200_3742.method3805(5, 1975460751);
    }
    
    Interface38 method6164(TextureMetrics class166, int i) {
	long l = (long) (i << 16 | class166.anInt1800 * 261926313);
	Interface38 interface38 = (Interface38) aClass200_3742.method3785(l);
	if (interface38 != null)
	    return interface38;
	if (!method6162(class166, i))
	    return null;
	if (i == -1)
	    i = class166.bitLoad * 2082667437;
	Interface38 interface38_1_;
	if (!class166.aBool1815 || !aClass182_Sub1_3744.method3284()) {
	    int[] is;
	    if (class166.aClass597_1807 != Class597.aClass597_7842
		|| !Class679.method11200(class166.aByte1825, (byte) -63))
		is = anInterface24_3743.method132(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, false,
						  -1367520926);
	    else
		is = anInterface24_3743.method129(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, true,
						  -821821367);
	    if (is == null)
		return null;
	    interface38_1_ = aClass182_Sub1_3744.method14723(i, i, true, is);
	} else {
	    float[] fs
		= anInterface24_3743.method131(Class593.aClass593_7831,
					       class166.anInt1800 * 261926313,
					       0.7F, i, i, false, (byte) 63);
	    interface38_1_
		= aClass182_Sub1_3744.method14784(Class165.aClass165_1771, i,
						  i, true, fs);
	}
	interface38_1_.method231(class166.aByte1810 == 1,
				 class166.aByte1811 == 1);
	aClass200_3742.method3789(interface38_1_, l, i * i, (byte) -58);
	return interface38_1_;
    }
    
    Interface38 method6165(TextureMetrics class166, int i) {
	long l = (long) (i << 16 | class166.anInt1800 * 261926313);
	Interface38 interface38 = (Interface38) aClass200_3742.method3785(l);
	if (interface38 != null)
	    return interface38;
	if (!method6162(class166, i))
	    return null;
	if (i == -1)
	    i = class166.bitLoad * 2082667437;
	Interface38 interface38_2_;
	if (!class166.aBool1815 || !aClass182_Sub1_3744.method3284()) {
	    int[] is;
	    if (class166.aClass597_1807 != Class597.aClass597_7842
		|| !Class679.method11200(class166.aByte1825, (byte) -127))
		is = anInterface24_3743.method132(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, false,
						  -552746408);
	    else
		is = anInterface24_3743.method129(Class593.aClass593_7831,
						  (class166.anInt1800
						   * 261926313),
						  0.7F, i, i, true,
						  -1536409719);
	    if (is == null)
		return null;
	    interface38_2_ = aClass182_Sub1_3744.method14723(i, i, true, is);
	} else {
	    float[] fs
		= anInterface24_3743.method131(Class593.aClass593_7831,
					       class166.anInt1800 * 261926313,
					       0.7F, i, i, false, (byte) 82);
	    interface38_2_
		= aClass182_Sub1_3744.method14784(Class165.aClass165_1771, i,
						  i, true, fs);
	}
	interface38_2_.method231(class166.aByte1810 == 1,
				 class166.aByte1811 == 1);
	aClass200_3742.method3789(interface38_2_, l, i * i, (byte) -60);
	return interface38_2_;
    }
    
    boolean method6166(TextureMetrics class166, int i) {
	if (i == -1)
	    i = class166.bitLoad * 2082667437;
	if (!class166.aBool1815 || !aClass182_Sub1_3744.method3284()) {
	    if (class166.aClass597_1807 != Class597.aClass597_7842
		|| !Class679.method11200(class166.aByte1825, (byte) -67))
		return anInterface24_3743.method130(Class593.aClass593_7831,
						    (class166.anInt1800
						     * 261926313),
						    Class594.aClass594_7833,
						    0.7F, i, i, false,
						    (byte) 91);
	    return anInterface24_3743.method130(Class593.aClass593_7831,
						class166.anInt1800 * 261926313,
						Class594.aClass594_7834, 0.7F,
						i, i, true, (byte) 95);
	}
	return anInterface24_3743.method130(Class593.aClass593_7831,
					    class166.anInt1800 * 261926313,
					    Class594.aClass594_7835, 0.7F, i,
					    i, false, (byte) 19);
    }
    
    void method6167() {
	aClass200_3742.method3805(5, 1922948011);
    }
    
    void method6168() {
	aClass200_3742.method3805(5, 1896134950);
    }
    
    void method6169() {
	aClass200_3742.method3791((byte) 11);
    }
    
    void method6170() {
	aClass200_3742.method3805(5, 2001092696);
    }
    
    void method6171() {
	aClass200_3742.method3791((byte) 30);
    }
    
    void method6172() {
	aClass200_3742.method3791((byte) -29);
    }
}
