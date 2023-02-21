/* Class585 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class585
{
    Class200 aClass200_7723 = new Class200(20);
    Class458 aClass458_7724;
    static int anInt7725;
    static Class54 aClass54_7726;
    
    void method9647() {
	synchronized (aClass200_7723) {
	    aClass200_7723.method3791((byte) 89);
	}
    }
    
    void method9648() {
	synchronized (aClass200_7723) {
	    aClass200_7723.method3809((byte) 63);
	}
    }
    
    void method9649(int i, int i_0_) {
	synchronized (aClass200_7723) {
	    aClass200_7723.method3805(i, 1958863696);
	}
    }
    
    void method9650(int i) {
	synchronized (aClass200_7723) {
	    aClass200_7723.method3809((byte) 19);
	}
    }
    
    void method9651() {
	synchronized (aClass200_7723) {
	    aClass200_7723.method3791((byte) -54);
	}
    }
    
    void method9652() {
	synchronized (aClass200_7723) {
	    aClass200_7723.method3791((byte) -59);
	}
    }
    
    void method9653(int i) {
	synchronized (aClass200_7723) {
	    aClass200_7723.method3805(i, 1923323750);
	}
    }
    
    Class585(Class458 class458) {
	aClass458_7724 = class458;
    }
    
    void method9654(int i) {
	synchronized (aClass200_7723) {
	    aClass200_7723.method3805(i, 1891208041);
	}
    }
    
    void method9655(byte i) {
	synchronized (aClass200_7723) {
	    aClass200_7723.method3791((byte) 39);
	}
    }
    
    void method9656() {
	synchronized (aClass200_7723) {
	    aClass200_7723.method3809((byte) 19);
	}
    }
    
    void method9657() {
	synchronized (aClass200_7723) {
	    aClass200_7723.method3809((byte) 50);
	}
    }
    
    static final void method9658(int i, Class10 class10, int i_1_) {
	if (-1 != i && class10.method684((long) i) == null)
	    class10.method695(new Class525(), (long) i);
    }
    
    static void method9659(Class683 class683, int i) {
	class683.anIntArray8661[class683.anInt8662 * 501271953 - 2]
	    = (((Class269)
		Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						      [((501271953
							 * class683.anInt8662)
							- 2)]),
						     1129874664))
	       .anIntArray2828
	       [class683.anIntArray8661[class683.anInt8662 * 501271953 - 1]]);
	class683.anInt8662 -= 1552651121;
    }
    
    static final void method9660(Class683 class683, int i) {
	int i_2_ = client.aClass10_11261.method687(-971105739);
	if (client.anInt11260 * -750203937 != -1)
	    i_2_++;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_2_;
    }
    
    static final void method9661(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = ((Class656_Sub1) class683.anInterface62_8655)
		  .method16936(19689724);
    }
    
    public static int method9662(int i) {
	if (!Class589.aBool7794)
	    return 12;
	Class196.method3736(Class501.aClass182_5564, 65280);
	return Class285.aTwitchTV3143.Logout();
    }
    
    static final void method9663(int i, int i_3_, int i_4_, int i_5_, int i_6_,
				 boolean bool, boolean bool_7_, int i_8_) {
	if (!bool && (i_3_ < 512 || i_4_ < 512
		      || i_3_ > (client.aClass507_11137.method8412(170399604)
				 - 2) * 512
		      || i_4_ > (client.aClass507_11137.method8352((byte) -47)
				 - 2) * 512)) {
	    float[] fs = client.aFloatArray11375;
	    client.aFloatArray11375[1] = -1.0F;
	    fs[0] = -1.0F;
	} else {
	    int i_9_ = Class335.method5855(i_3_, i_4_, i, 2020563229) - i_6_;
	    client.aClass444_11077
		.method7154(Class501.aClass182_5564.method3491());
	    client.aClass444_11077.method7147((float) i_5_, 0.0F, 0.0F);
	    Class501.aClass182_5564.method3233(client.aClass444_11077);
	    if (bool)
		Class501.aClass182_5564.method3360((float) i_3_, (float) i_9_,
						   (float) i_4_,
						   client.aFloatArray11375);
	    else
		Class501.aClass182_5564.method3230((float) i_3_, (float) i_9_,
						   (float) i_4_,
						   client.aFloatArray11375);
	    client.aClass444_11077.method7147((float) -i_5_, 0.0F, 0.0F);
	    Class501.aClass182_5564.method3233(client.aClass444_11077);
	    if (!bool_7_) {
		client.aFloatArray11375[0]
		    -= (float) (client.anInt11292 * 634814571);
		client.aFloatArray11375[1]
		    -= (float) (client.anInt11357 * -1391214471);
	    }
	}
    }
}
