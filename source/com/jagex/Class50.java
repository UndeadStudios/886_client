/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Container;
import java.awt.Insets;

import com.jagex.twitchtv.TwitchEvent;

final class Class50 implements Interface27
{
    static int anInt374;
    public static Class41 aClass41_375;
    public static int anInt376;
    
    public Class106_Sub1 method159(byte i) {
	return Class109.aClass106_Sub1_Sub1_1323;
    }
    
    public Class629 method157() {
	return Class91.aClass629_903;
    }
    
    public Class40_Sub10 method152(int i) {
	return Class575.aClass40_Sub10_7647;
    }
    
    public Class629 method153() {
	return Class91.aClass629_903;
    }
    
    public Class106_Sub1 method148() {
	return Class109.aClass106_Sub1_Sub1_1323;
    }
    
    public Class629 method147(byte i) {
	return Class91.aClass629_903;
    }
    
    public Class106_Sub1 method150() {
	return Class198_Sub20.aClass106_Sub1_Sub2_9998;
    }
    
    public Class106_Sub1 method151() {
	return Class198_Sub20.aClass106_Sub1_Sub2_9998;
    }
    
    public Class40_Sub10 method156() {
	return Class575.aClass40_Sub10_7647;
    }
    
    public Class40_Sub10 method146() {
	return Class575.aClass40_Sub10_7647;
    }
    
    public Class40_Sub10 method154() {
	return Class575.aClass40_Sub10_7647;
    }
    
    public Class629 method144() {
	return Class91.aClass629_903;
    }
    
    public Class106_Sub1 method149() {
	return Class109.aClass106_Sub1_Sub1_1323;
    }
    
    public Class106_Sub1 method145(int i) {
	return Class198_Sub20.aClass106_Sub1_Sub2_9998;
    }
    
    public Class629 method158() {
	return Class91.aClass629_903;
    }
    
    public Class629 method155() {
	return Class91.aClass629_903;
    }
    
    public static Class608[] method1127(byte i) {
	return (new Class608[]
		{ Class608.aClass608_7979, Class608.aClass608_7985,
		  Class608.aClass608_7999, Class608.aClass608_7986,
		  Class608.aClass608_7994, Class608.aClass608_7988,
		  Class608.aClass608_7990, Class608.aClass608_7989,
		  Class608.aClass608_7983, Class608.aClass608_7982,
		  Class608.aClass608_7993, Class608.aClass608_7978,
		  Class608.aClass608_7981, Class608.aClass608_7992,
		  Class608.aClass608_7996, Class608.aClass608_7998,
		  Class608.aClass608_7991, Class608.aClass608_7977,
		  Class608.aClass608_7980, Class608.aClass608_7984,
		  Class608.aClass608_7987, Class608.aClass608_7997,
		  Class608.aClass608_7976 });
    }
    
    public static void method1128(int i, TwitchEvent twitchevent, byte i_0_) {
	Class525_Sub16_Sub4 class525_sub16_sub4
	    = Class71_Sub1.method16376(Class578.aClass578_7663, i, -1,
				       (byte) 74);
	if (class525_sub16_sub4 != null) {
	    Class683 class683 = Class457.method7468(-485786200);
	    if (0 != class525_sub16_sub4.anInt11753 * -1954010063)
		class683.aLongArray8638
		    = new long[-1954010063 * class525_sub16_sub4.anInt11753];
	    if (0 != -1831313555 * class525_sub16_sub4.anInt11747)
		class683.anIntArray8649
		    = new int[-1831313555 * class525_sub16_sub4.anInt11747];
	    if (0 != class525_sub16_sub4.anInt11752 * 678090421)
		class683.anObjectArray8637
		    = new String[678090421 * class525_sub16_sub4.anInt11752];
	    twitchevent.method6640(class683.anIntArray8649,
				   class683.aLongArray8638,
				   class683.anObjectArray8637);
	    Class60.method1231(class525_sub16_sub4, 500000, class683,
			       -1142043326);
	}
    }
    
    static final void method1129(Class259 class259, Class683 class683, int i) {
	int i_1_ = 10;
	Class48.method1113(class259, i_1_, class683, -576707309);
    }
    
    static void method1130(int i, int i_2_, int i_3_, int i_4_, boolean bool,
			   byte i_5_) {
	if (Class695.aBool8757 && null != Class96.aFrame1186
	    && (3 != i_2_ || Class99.anInt1213 * 77907787 != i_3_
		|| i_4_ != SunDefinition.anInt3426 * -1352795477)) {
	    Class162.method2643(Class202.aClass4_2222, Class96.aFrame1186,
				(byte) 48);
	    Class96.aFrame1186 = null;
	}
	if (Class695.aBool8757 && i_2_ == 3 && Class96.aFrame1186 == null) {
	    Class96.aFrame1186
		= Class249.method4506(Class202.aClass4_2222, i_3_, i_4_, 0, 0,
				      -163014742);
	    if (Class96.aFrame1186 != null) {
		Class99.anInt1213 = i_3_ * -390460829;
		SunDefinition.anInt3426 = 414330883 * i_4_;
		Class650.method10715(-1758466106);
	    }
	}
	if (3 == i_2_ && (!Class695.aBool8757 || Class96.aFrame1186 == null))
	    method1130(i,
		       Class198_Sub13.aClass525_Sub30_9973
			   .aClass696_Sub41_10704.method17337(554471299),
		       -1, -1, true, (byte) -46);
	else {
	    Container container = Class203.method3854(1955349051);
	    if (Class96.aFrame1186 != null) {
		OutputStream_Sub1.anInt11049 = 1023287415 * i_3_;
		Class696_Sub9.anInt10903 = i_4_ * -1847648899;
	    } else if (null != Class198_Sub7.aFrame9932) {
		Insets insets = Class198_Sub7.aFrame9932.getInsets();
		OutputStream_Sub1.anInt11049
		    = (Class198_Sub7.aFrame9932.getSize().width
		       - (insets.left + insets.right)) * 1023287415;
		Class696_Sub9.anInt10903
		    = (Class198_Sub7.aFrame9932.getSize().height
		       - (insets.top + insets.bottom)) * -1847648899;
	    } else {
		OutputStream_Sub1.anInt11049
		    = container.getSize().width * 1023287415;
		Class696_Sub9.anInt10903
		    = container.getSize().height * -1847648899;
	    }
	    if (-349587129 * OutputStream_Sub1.anInt11049 <= 0)
		OutputStream_Sub1.anInt11049 = 1023287415;
	    if (Class696_Sub9.anInt10903 * 1666450389 <= 0)
		Class696_Sub9.anInt10903 = -1847648899;
	    if (i_2_ != 1)
		Class656_Sub1_Sub5_Sub1.method18728(-758522757);
	    else {
		Class434.anInt4827 = client.anInt11223 * -1051298351;
		client.anInt5572
		    = -2099836857 * ((OutputStream_Sub1.anInt11049 * -349587129
				      - -1202561691 * client.anInt11223)
				     / 2);
		Class696_Sub47.anInt11032 = -822190077 * client.anInt11224;
		client.anInt5573 = 0;
	    }
	    if (Class685.aClass685_8686 != Class176.aClass685_1884
		&& -1445589163 * Class434.anInt4827 < 1024
		&& -1883654023 * Class696_Sub47.anInt11032 >= 768) {
		/* empty */
	    }
	    if (!bool) {
		Class532.aCanvas7169.setSize(Class434.anInt4827 * -1445589163,
					     (-1883654023
					      * Class696_Sub47.anInt11032));
		Class501.aClass182_5564.method3157
		    (Class532.aCanvas7169, -1445589163 * Class434.anInt4827,
		     -1883654023 * Class696_Sub47.anInt11032, (byte) 74);
		if (Class198_Sub7.aFrame9932 == container) {
		    Insets insets = Class198_Sub7.aFrame9932.getInsets();
		    Class532.aCanvas7169.setLocation
			(insets.left + 288760183 * client.anInt5572,
			 insets.top + -1061711907 * client.anInt5573);
		} else
		    Class532.aCanvas7169.setLocation((client.anInt5572
						      * 288760183),
						     (-1061711907
						      * client.anInt5573));
	    } else
		Class47.method1102((byte) -16);
	    if (i_2_ >= 2)
		client.aBool11220 = true;
	    else
		client.aBool11220 = false;
	    Class416.method6719((byte) 14);
	    if (-1 != -750203937 * client.anInt11260)
		Class198_Sub14.method15652(true, 296386517);
	    if (Class111.method1979(-1092837527).method1799((byte) 0) != null
		&& (Class265.method4801(client.anInt11075 * 1777895575,
					1090352502)
		    || Class34.method960(1777895575 * client.anInt11075,
					 (byte) 98)))
		Class600.method9891(Class111.method1979(386856275), 596708880);
	    for (int i_6_ = 0; i_6_ < 107; i_6_++)
		client.aBoolArray11320[i_6_] = true;
	    client.aBool5591 = true;
	}
    }
    
    static final void method1131(int i, int i_7_, int i_8_, int i_9_,
				 Class604 class604, byte i_10_) {
	if (i_8_ >= 1 && i_9_ >= 1
	    && i_8_ <= client.aClass507_11137.method8412(139675434) - 2
	    && i_9_ <= client.aClass507_11137.method8352((byte) -123) - 2) {
	    if (client.aClass507_11137.method8358((byte) 50) != null) {
		Interface62 interface62
		    = client.aClass507_11137.method8359(476249352)
			  .method15976(i, i_7_, i_8_, i_9_, -1168826384);
		if (null != interface62) {
		    if (interface62 instanceof Class656_Sub1_Sub3_Sub3)
			((Class656_Sub1_Sub3_Sub3) interface62)
			    .method18707(class604, (byte) 1);
		    else if (interface62 instanceof Class656_Sub1_Sub1_Sub2)
			((Class656_Sub1_Sub1_Sub2) interface62)
			    .method18720(class604, 1332334147);
		    else if (interface62 instanceof Class656_Sub1_Sub5_Sub1)
			((Class656_Sub1_Sub5_Sub1) interface62)
			    .method18723(class604, 1284165642);
		    else if (interface62 instanceof Class656_Sub1_Sub4_Sub1)
			((Class656_Sub1_Sub4_Sub1) interface62)
			    .method18729(class604, -804671192);
		}
	    }
	}
    }
    
    static boolean method1132(int i) {
	if (null == Class659.aClass525_Sub16_Sub16_8459)
	    return false;
	if (Class659.aClass525_Sub16_Sub16_8459.anInt11861 * 91103913 >= 2000)
	    Class659.aClass525_Sub16_Sub16_8459.anInt11861 -= -834766000;
	if (1007 == Class659.aClass525_Sub16_Sub16_8459.anInt11861 * 91103913)
	    return true;
	return false;
    }
    
    static final void method1133(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	class259.aBool2629
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) == 1;
	Class649.method10708(class259, (byte) 0);
	if (-1 == class259.anInt2576 * 1534974651 && !class245.aBool2428)
	    Class456.method7462(1984678839 * class259.anInt2588, (byte) -109);
    }
}
