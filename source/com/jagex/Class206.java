/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Dimension;

public abstract class Class206 implements Interface5
{
    Class200 aClass200_2244 = new Class200(100);
    Interface13 anInterface13_2245;
    
    void method3883() {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3809((byte) 115);
	}
    }
    
    void method3884() {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3809((byte) 60);
	}
    }
    
    void method3885(int i) {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3791((byte) 76);
	}
    }
    
    void method3886(int i, int i_0_) {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3805(i, 2024838998);
	}
    }
    
    void method3887() {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3809((byte) 42);
	}
    }
    
    void method3888() {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3791((byte) -1);
	}
    }
    
    void method3889(int i) {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3805(i, 1971896246);
	}
    }
    
    void method3890(int i) {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3805(i, 1871955390);
	}
    }
    
    void method3891(int i) {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3805(i, 1995334232);
	}
    }
    
    void method3892() {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3809((byte) 60);
	}
    }
    
    void method3893() {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3809((byte) 84);
	}
    }
    
    void method3894(int i) {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3809((byte) 117);
	}
    }
    
    Class206(Interface13 interface13, JS5 class458,
	     JS5 class458_1_) {
	anInterface13_2245 = interface13;
	Class696_Sub3.method16982(class458, class458_1_, 2, -674706839);
    }
    
    void method3895() {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3809((byte) 30);
	}
    }
    
    void method3896() {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3809((byte) 99);
	}
    }
    
    void method3897() {
	synchronized (aClass200_2244) {
	    aClass200_2244.method3809((byte) 63);
	}
    }
    
    Class525_Sub16_Sub18 getCollection(int i, int i_2_) {
	Class525_Sub16_Sub18 class525_sub16_sub18;
	synchronized (aClass200_2244) {
	    class525_sub16_sub18
		= (Class525_Sub16_Sub18) aClass200_2244.method3785((long) i);
	    if (class525_sub16_sub18 == null) {
		class525_sub16_sub18 = new Class525_Sub16_Sub18(i);
		aClass200_2244.method3788(class525_sub16_sub18, (long) i);
	    }
	    if (!class525_sub16_sub18.method18485(1158840430)) {
		Class525_Sub16_Sub18 class525_sub16_sub18_3_ = null;
		return class525_sub16_sub18_3_;
	    }
	}
	return class525_sub16_sub18;
    }
    
    static void method3899(short i) {
	Class116.anInt1416
	    = (Class525_Sub24.aClass7_10595.anInt49 * 665702593
	       + 962137615 * Class525_Sub24.aClass7_10595.anInt51 + 500018954);
	Class226.anInt2342
	    = -489975066 + (Class500.aClass7_5560.anInt49 * 305710039
			    + -826521383 * Class500.aClass7_5560.anInt51);
	Class116.aStringArray1411 = new String[500];
	for (int i_4_ = 0; i_4_ < Class116.aStringArray1411.length; i_4_++)
	    Class116.aStringArray1411[i_4_] = "";
	Class268.method4961(Class53.aClass53_411
				.method1169(Class21.aClass666_213, 1552651121),
			    1472816834);
    }
    
    static final void method3900(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2724
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1304629985);
	class259.aBool2695 = true;
    }
    
    static final void method3901(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = ((Class453_Sub3.aClass309_Sub1_10316.method5484(-2092357105)
		== null)
	       ? -1
	       : (Class453_Sub3.aClass309_Sub1_10316.method5484(-2131798600)
		  .anInt3283) * 1520077733);
    }
    
    public static void method3902(int i, byte i_5_) {
	Class577.method9577(i, -76850001);
    }
    
    static final void method3903(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
    }
    
    static long method3904(Interface62 interface62, int i, int i_6_,
			   int i_7_) {
	long l = 4194304L;
	long l_8_ = -9223372036854775808L;
	ObjectDefinitions class602
	    = ((ObjectDefinitions)
	       client.aClass507_11137.method8362((byte) -1)
		   .method76(interface62.method406((byte) 1), 754148187));
	long l_9_
	    = (long) (i | i_6_ << 7 | interface62.method72(-1453526273) << 14
		      | interface62.method413(2128588948) << 20 | 0x40000000);
	if (0 == class602.anInt7888 * 1700857535)
	    l_9_ |= l_8_;
	if (1 == class602.anInt7921 * 1596797987)
	    l_9_ |= l;
	l_9_ |= (long) interface62.method406((byte) 1) << 32;
	return l_9_;
    }
    
    public static int method3905(int i, int i_10_, int i_11_) {
	if (1728284569 * Class138.aClass631_1641.anInt8175 == -1)
	    return 1;
	if (i != Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708
		     .method17160(-1923914152)) {
	    Class198_Sub17.method15659
		(i,
		 Class53.aClass53_500.method1169(Class21.aClass666_213,
						 1552651121),
		 true, 1796348338);
	    if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708
		    .method17160(-199270515)
		!= i)
		return -1;
	}
	int i_12_;
	try {
	    Dimension dimension = Class532.aCanvas7169.getSize();
	    Class666.method11016
		(Class53.aClass53_500.method1169(Class21.aClass666_213,
						 1552651121),
		 true, Class501.aClass182_5564, Class29.aClass175_293,
		 Class500.aClass7_5560, -1573689195);
	    ModelDecoder class186
		= ModelDecoder.method3644(WorldTile.aClass458_705,
				      (1728284569
				       * Class138.aClass631_1641.anInt8175),
				      0);
	    long l = Class251.method4508((byte) 8);
	    Class501.aClass182_5564.method3480();
	    client.aClass444_11077.method7137(0.0F, 256.0F, 0.0F);
	    Class501.aClass182_5564.method3233(client.aClass444_11077);
	    Class435 class435 = Class501.aClass182_5564.method3224();
	    class435.method6963((float) (dimension.width / 2),
				(float) (dimension.height / 2), 512.0F, 512.0F,
				(float) client.aClass507_11137
					    .method8356((short) -9558),
				(float) client.aClass507_11137
					    .method8357(2054413663),
				(float) dimension.width,
				(float) dimension.height);
	    Class501.aClass182_5564.method3252(class435);
	    Class501.aClass182_5564.method3351(1.0F);
	    Class501.aClass182_5564.method3307(16777215, 0.5F, 0.5F, 20.0F,
					       -50.0F, 30.0F);
	    Class179 class179
		= Class501.aClass182_5564.method3556(class186, 2048, 64, 64,
						     768);
	    int i_13_ = 0;
	while_113_:
	    for (int i_14_ = 0; i_14_ < 500; i_14_++) {
		Class501.aClass182_5564.method3188(3, 0);
		for (int i_15_ = 15; i_15_ >= 0; i_15_--) {
		    for (int i_16_ = 0; i_16_ <= i_15_; i_16_++) {
			client.aClass444_11078.method7137
			    ((float) (int) (512.0F * ((float) i_16_
						      - (float) i_15_ / 2.0F)),
			     0.0F, (float) (512 * (i_15_ + 1)));
			class179.method2953(client.aClass444_11078, null, 0);
			i_13_++;
			if (Class251.method4508((byte) 8) - l >= (long) i_10_)
			    break while_113_;
		    }
		}
	    }
	    Class501.aClass182_5564.method3133();
	    long l_17_
		= (long) (1000 * i_13_) / (Class251.method4508((byte) 8) - l);
	    Class501.aClass182_5564.method3188(3, 0);
	    i_12_ = (int) l_17_;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return -1;
	}
	return i_12_;
    }
    
    static final void method3906(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_18_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_19_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_20_ = client.aClass486ArrayArray11128[i_19_][i_18_]
			.method7845(-684733318);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0 == i_20_ ? 1 : 0;
    }
}
