/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class140
{
    static final int anInt1643 = 128;
    static final int anInt1644 = 128;
    static Object anObject1645;
    Class136_Sub2[] aClass136_Sub2Array1646 = null;
    boolean aBool1647;
    static final int anInt1648 = 4000;
    Class136_Sub1 aClass136_Sub1_1649 = null;
    static final int anInt1650 = 16;
    Class136_Sub1 aClass136_Sub1_1651;
    Class136_Sub1 aClass136_Sub1_1652;
    static Object anObject1653;
    static Object anObject1654;
    Class136_Sub2[] aClass136_Sub2Array1655 = null;
    
    static void method2338(Class182_Sub3 class182_sub3) {
	if (anObject1653 == null) {
	    Class415_Sub1_Sub1 class415_sub1_sub1 = new Class415_Sub1_Sub1();
	    byte[] is = class415_sub1_sub1.method18181(128, 128, 16);
	    anObject1653
		= Class525_Sub16_Sub6.method18288(is, false, 38825287);
	}
	if (anObject1645 == null) {
	    Class415_Sub2_Sub1 class415_sub2_sub1 = new Class415_Sub2_Sub1();
	    byte[] is = class415_sub2_sub1.method18174(128, 128, 16);
	    anObject1645
		= Class525_Sub16_Sub6.method18288(is, false, -1859638558);
	}
	Class155 class155 = class182_sub3.aClass155_9683;
	if (class155.method2456() && anObject1654 == null) {
	    byte[] is = Class542.method8906(128, 128, 16, 8,
					    new Class527_Sub1(419684), 4.0F,
					    4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1654
		= Class525_Sub16_Sub6.method18288(is, false, 390270569);
	}
    }
    
    Class140(Class182_Sub3 class182_sub3) {
	aClass136_Sub1_1651 = null;
	aClass136_Sub1_1652 = null;
	aBool1647 = class182_sub3.aBool9805;
	method2338(class182_sub3);
	if (!aBool1647) {
	    aClass136_Sub2Array1646 = new Class136_Sub2[16];
	    for (int i = 0; i < 16; i++) {
		byte[] is = Class36.method980(anObject1653, i * 32768, 32768,
					      1165918159);
		aClass136_Sub2Array1646[i]
		    = new Class136_Sub2(class182_sub3, 3553,
					Class165.aClass165_1776,
					Class178.aClass178_1905, 128, 128,
					true, is, Class165.aClass165_1776,
					false);
	    }
	    aClass136_Sub2Array1655 = new Class136_Sub2[16];
	    for (int i = 0; i < 16; i++) {
		byte[] is = Class36.method980(anObject1645, i * 32768, 32768,
					      1899833293);
		aClass136_Sub2Array1655[i]
		    = new Class136_Sub2(class182_sub3, 3553,
					Class165.aClass165_1776,
					Class178.aClass178_1905, 128, 128,
					true, is, Class165.aClass165_1776,
					false);
	    }
	} else {
	    byte[] is = Class23.method830(anObject1653, false, 1749389798);
	    aClass136_Sub1_1649
		= new Class136_Sub1(class182_sub3, Class165.aClass165_1776,
				    Class178.aClass178_1905, 128, 128, 16, is,
				    Class165.aClass165_1776);
	    is = Class23.method830(anObject1645, false, 1909848082);
	    aClass136_Sub1_1651
		= new Class136_Sub1(class182_sub3, Class165.aClass165_1776,
				    Class178.aClass178_1905, 128, 128, 16, is,
				    Class165.aClass165_1776);
	    Class155 class155 = class182_sub3.aClass155_9683;
	    if (class155.method2456()) {
		is = Class23.method830(anObject1654, false, -1311134007);
		aClass136_Sub1_1652
		    = new Class136_Sub1(class182_sub3, Class165.aClass165_1771,
					Class178.aClass178_1905, 128, 128, 16);
		Class136_Sub1 class136_sub1
		    = new Class136_Sub1(class182_sub3, Class165.aClass165_1773,
					Class178.aClass178_1905, 128, 128, 16,
					is, Class165.aClass165_1773);
		if (!class155.method2455(aClass136_Sub1_1652, class136_sub1,
					 2.0F)) {
		    aClass136_Sub1_1652.method2322();
		    aClass136_Sub1_1652 = null;
		} else
		    aClass136_Sub1_1652.method2306();
		class136_sub1.method2322();
	    }
	}
    }
    
    static void method2339(Class182_Sub3 class182_sub3) {
	if (anObject1653 == null) {
	    Class415_Sub1_Sub1 class415_sub1_sub1 = new Class415_Sub1_Sub1();
	    byte[] is = class415_sub1_sub1.method18181(128, 128, 16);
	    anObject1653
		= Class525_Sub16_Sub6.method18288(is, false, 503977869);
	}
	if (anObject1645 == null) {
	    Class415_Sub2_Sub1 class415_sub2_sub1 = new Class415_Sub2_Sub1();
	    byte[] is = class415_sub2_sub1.method18174(128, 128, 16);
	    anObject1645
		= Class525_Sub16_Sub6.method18288(is, false, -1283189603);
	}
	Class155 class155 = class182_sub3.aClass155_9683;
	if (class155.method2456() && anObject1654 == null) {
	    byte[] is = Class542.method8906(128, 128, 16, 8,
					    new Class527_Sub1(419684), 4.0F,
					    4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1654
		= Class525_Sub16_Sub6.method18288(is, false, -807851847);
	}
    }
    
    static void method2340(Class182_Sub3 class182_sub3) {
	if (anObject1653 == null) {
	    Class415_Sub1_Sub1 class415_sub1_sub1 = new Class415_Sub1_Sub1();
	    byte[] is = class415_sub1_sub1.method18181(128, 128, 16);
	    anObject1653
		= Class525_Sub16_Sub6.method18288(is, false, 680565962);
	}
	if (anObject1645 == null) {
	    Class415_Sub2_Sub1 class415_sub2_sub1 = new Class415_Sub2_Sub1();
	    byte[] is = class415_sub2_sub1.method18174(128, 128, 16);
	    anObject1645
		= Class525_Sub16_Sub6.method18288(is, false, -909261685);
	}
	Class155 class155 = class182_sub3.aClass155_9683;
	if (class155.method2456() && anObject1654 == null) {
	    byte[] is = Class542.method8906(128, 128, 16, 8,
					    new Class527_Sub1(419684), 4.0F,
					    4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1654
		= Class525_Sub16_Sub6.method18288(is, false, -658036059);
	}
    }
}
