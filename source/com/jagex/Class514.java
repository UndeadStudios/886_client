/* Class514 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class514
{
    Class499 aClass499_5694;
    Class525_Sub38_Sub2 aClass525_Sub38_Sub2_5695;
    static int anInt5696;
    
    public Class514(Class499 class499,
		    Class525_Sub38_Sub2 class525_sub38_sub2) {
	aClass499_5694 = class499;
	aClass525_Sub38_Sub2_5695 = class525_sub38_sub2;
    }
    
    public static final void method8552(boolean bool, int i) {
	if (!bool) {
	    Class232.aClass40_Sub18_2368.method1019(450071698);
	    Class198_Sub17.aClass40_Sub14_9981.method1019(-739981550);
	    Class38.aClass40_Sub9_328.method1019(1285589792);
	    client.aClass507_11137.method8362((byte) -1).method1019(579497384);
	    Class168_Sub1.aClass40_Sub7_9112.method1019(-710938105);
	    Class313_Sub2.aClass40_Sub22_10106.method1019(523732491);
	    Class685.aClass40_Sub8_8691.method1019(-753088056);
	    Class574.aClass40_Sub20_7645.method1019(-829074457);
	    Class575.aClass40_Sub10_7647.method1019(1899209155);
	    Class109.aClass106_Sub1_Sub1_1323.method17964(-406348307);
	    Class293.aClass106_Sub1_Sub2_3239.method17984((byte) 71);
	    Class711.aClass106_Sub1_Sub2_8869.method17984((byte) 47);
	    Class535.aClass106_Sub1_Sub2_7176.method17984((byte) 26);
	    Class198_Sub20.aClass106_Sub1_Sub2_9998.method17984((byte) 82);
	    Class234.aClass106_Sub1_Sub2_2373.method17984((byte) 24);
	    Class227.aClass40_Sub1_2345.method1019(130168332);
	    Class568.aClass40_Sub17_7627.method1019(257137928);
	    Class698.aClass40_Sub2_8770.method1019(-570464260);
	    client.aClass40_Sub16_11201.method1019(1582527735);
	    Class658.aClass40_Sub3_8457.method1019(-173137606);
	    Class539.aClass40_Sub4_7181.method1019(580270923);
	    client.aClass40_Sub21_11118.method1019(-128234893);
	    Class635.aClass40_Sub6_8274.method1019(-457217347);
	    Class83.aClass40_Sub12_852.method1019(-19061272);
	    Class566.aClass40_Sub5_7605.method1019(1302323685);
	    Class18.method795(1820142709);
	    Class89.method1676(-1849161357);
	    Class7.aClass404_53.method6582(1279822465);
	    Class462.method7608((byte) 0);
	    if (Class176.aClass685_1884 != Class685.aClass685_8686) {
		for (int i_0_ = 0; i_0_ < Class329.aByteArrayArray3591.length;
		     i_0_++)
		    Class329.aByteArrayArray3591[i_0_] = null;
		client.anInt11082 = 0;
	    }
	    client.aClass507_11137.method8361((byte) 70)
		.method10388(-2101459571);
	    Class376.method6368(-734182087);
	    Class559.method9402(-1023491615);
	    Class263.aClass402_2799.method6558(803527802);
	    Class450.aClass400_4926.method6550(2069940755);
	    Class686.aClass200_8697.method3791((byte) -25);
	    client.aClass200_11113.method3791((byte) -1);
	    client.aClass200_11259.method3791((byte) 17);
	    client.aClass200_11301.method3791((byte) -39);
	    Class486.aClass40_5240.method1019(-808583815);
	    Class685.aClass40_8690.method1019(-109977166);
	    client.aClass200_11206.method3791((byte) 46);
	}
	Class213.method3937(-2031372290);
	Class246.method4489((byte) -102);
    }
    
    static final int method8553(int i, int i_1_, int i_2_, int i_3_) {
	int i_4_ = i / i_2_;
	int i_5_ = i & i_2_ - 1;
	int i_6_ = i_1_ / i_2_;
	int i_7_ = i_1_ & i_2_ - 1;
	int i_8_ = Class469.method7712(i_4_, i_6_, -387865103);
	int i_9_ = Class469.method7712(i_4_ + 1, i_6_, -387865103);
	int i_10_ = Class469.method7712(i_4_, i_6_ + 1, -387865103);
	int i_11_ = Class469.method7712(1 + i_4_, i_6_ + 1, -387865103);
	int i_12_ = Class451.method7337(i_8_, i_9_, i_5_, i_2_, (byte) -75);
	int i_13_ = Class451.method7337(i_10_, i_11_, i_5_, i_2_, (byte) -52);
	return Class451.method7337(i_12_, i_13_, i_7_, i_2_, (byte) -59);
    }
    
    public static Class525_Sub28 method8554(int i, int i_14_, int i_15_,
					    int i_16_, int i_17_) {
	synchronized (Class525_Sub28.aClass525_Sub28Array10616) {
	    if (0 == Class703.anInt8790 * 1331388799) {
		Class525_Sub28 class525_sub28
		    = new Class525_Sub28(i, i_14_, i_15_, i_16_);
		return class525_sub28;
	    }
	    Class525_Sub28.aClass525_Sub28Array10616
		[(Class703.anInt8790 -= 1596087935) * 1331388799]
		.method16388(i, i_14_, i_15_, i_16_, -2057481329);
	    Class525_Sub28 class525_sub28
		= (Class525_Sub28.aClass525_Sub28Array10616
		   [1331388799 * Class703.anInt8790]);
	    return class525_sub28;
	}
    }
}
