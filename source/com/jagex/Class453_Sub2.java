/* Class453_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Color;

final class Class453_Sub2 extends Class453
{
    Object method7354(Class163 class163, byte i) {
	if (class163.aClass495_1765 == Class495.aClass495_5444)
	    return Integer.valueOf(-1);
	return class163.aClass495_1765.method8133((byte) 73);
    }
    
    Object method7353(Class163 class163) {
	if (class163.aClass495_1765 == Class495.aClass495_5444)
	    return Integer.valueOf(-1);
	return class163.aClass495_1765.method8133((byte) 120);
    }
    
    Class453_Sub2(Class663 class663, int i, boolean bool, boolean bool_0_) {
	super(class663, i, bool, bool_0_);
    }
    
    Object method7355(Class163 class163) {
	if (class163.aClass495_1765 == Class495.aClass495_5444)
	    return Integer.valueOf(-1);
	return class163.aClass495_1765.method8133((byte) 55);
    }
    
    Object method7346(Class163 class163) {
	if (class163.aClass495_1765 == Class495.aClass495_5444)
	    return Integer.valueOf(-1);
	return class163.aClass495_1765.method8133((byte) 50);
    }
    
    static void method15916(int i) {
	Class198_Sub21.aClass551_10003.method9139(-1014478080);
	Class509.aClass569_5662.method9506(-213699670);
	Class327.aclient3575.method8208((byte) 95);
	Class532.aCanvas7169.setBackground(Color.black);
	client.anInt11254 = -1528091137;
	Class198_Sub21.aClass551_10003
	    = Class262.method4776(Class532.aCanvas7169, 1772613858);
	Class509.aClass569_5662
	    = Class29.method936(Class532.aCanvas7169, true, (byte) -92);
    }
    
    public static void method15917
	(Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1, int[] is, int i,
	 boolean bool, int i_1_) {
	if (null != class656_sub1_sub3_sub1.anIntArray11985) {
	    boolean bool_2_ = true;
	    for (int i_3_ = 0;
		 i_3_ < class656_sub1_sub3_sub1.anIntArray11985.length;
		 i_3_++) {
		if (is[i_3_]
		    != class656_sub1_sub3_sub1.anIntArray11985[i_3_]) {
		    bool_2_ = false;
		    break;
		}
	    }
	    Class689 class689 = class656_sub1_sub3_sub1.aClass689_11987;
	    if (bool_2_ && class689.method14021(1654046370)) {
		Class194 class194 = class656_sub1_sub3_sub1.aClass689_11987
					.method14058(-1843655678);
		int i_4_ = class194.anInt2154 * -871006613;
		if (1 == i_4_)
		    class689.method14040(i, (byte) 1);
		if (2 == i_4_)
		    class689.method14038((byte) -28);
	    }
	}
	boolean bool_5_ = true;
	for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
	    if (-1 != is[i_6_])
		bool_5_ = false;
	    if (class656_sub1_sub3_sub1.anIntArray11985 == null
		|| -1 == class656_sub1_sub3_sub1.anIntArray11985[i_6_]
		|| ((((Class194) Class685.aClass40_Sub8_8691
				     .method76(is[i_6_], 238487834)).anInt2162
		     * 1014786343)
		    >= ((Class194)
			(Class685.aClass40_Sub8_8691.method76
			 (class656_sub1_sub3_sub1.anIntArray11985[i_6_],
			  -317348717))).anInt2162 * 1014786343)) {
		class656_sub1_sub3_sub1.anIntArray11985 = is;
		class656_sub1_sub3_sub1.aClass689_11987
		    .method14032(i, (short) -24563);
		if (bool)
		    class656_sub1_sub3_sub1.anInt11970
			= class656_sub1_sub3_sub1.anInt12015 * 1772857993;
	    }
	}
	if (bool_5_) {
	    class656_sub1_sub3_sub1.anIntArray11985 = is;
	    class656_sub1_sub3_sub1.aClass689_11987
		.method14032(i, (short) -12221);
	    if (bool)
		class656_sub1_sub3_sub1.anInt11970
		    = class656_sub1_sub3_sub1.anInt12015 * 1772857993;
	}
    }
    
    public static int method15918(int i, byte i_7_) {
	if (-410093193 * Class556_Sub1.anInt10643 == i)
	    return Class556_Sub1.aBool10629 ? 1 : 0;
	if (Class556_Sub1.anInt10620 * -1628218543 == i)
	    return Class556_Sub1.aBool10644 ? 1 : 0;
	if (i == 347888745 * Class556_Sub1.anInt10636)
	    return Class556_Sub1.aBool10647 ? 1 : 0;
	return -1;
    }
}
