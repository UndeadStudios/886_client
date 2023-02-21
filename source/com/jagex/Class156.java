/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

class Class156 implements Runnable
{
    Class372_Sub1 this$0;
    
    Class156(Class372_Sub1 class372_sub1) {
	this$0 = class372_sub1;
    }
    
    public void run() {
	try {
	    while (!this$0.aBool10190) {
		HashMap hashmap = this$0.method15801((byte) 41);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class477 class477 = (Class477) iterator.next();
		    if (!class477.aBool5198) {
			Class494[] class494s
			    = (Class494[]) hashmap.get(class477);
			for (int i = 0; i < class494s.length; i++)
			    class494s[i].method8033(1940174545);
		    }
		}
		Class229.method4381(50L);
	    }
	} catch (Exception exception) {
	    Class525_Sub16_Sub13.method18448(null, exception, (byte) 33);
	}
    }
    
    public void method2459() {
	try {
	    while (!this$0.aBool10190) {
		HashMap hashmap = this$0.method15801((byte) -61);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class477 class477 = (Class477) iterator.next();
		    if (!class477.aBool5198) {
			Class494[] class494s
			    = (Class494[]) hashmap.get(class477);
			for (int i = 0; i < class494s.length; i++)
			    class494s[i].method8033(98499402);
		    }
		}
		Class229.method4381(50L);
	    }
	} catch (Exception exception) {
	    Class525_Sub16_Sub13.method18448(null, exception, (byte) 121);
	}
    }
    
    static final void method2460(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class182_Sub2.aClass228_9503.method4275(i_0_, -393369220)
		  .method4188((byte) -77);
    }
    
    static final void method2461(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = Class647.method10695(180317049);
	if (null != class525_sub16_sub6) {
	    boolean bool
		= class525_sub16_sub6.method18275(i_1_ >> 28 & 0x3,
						  i_1_ >> 14 & 0x3fff,
						  i_1_ & 0x3fff,
						  Class686.anIntArray8699,
						  -1732157807);
	    if (bool)
		Class245.method4483(Class686.anIntArray8699[1],
				    Class686.anIntArray8699[2], (byte) 1);
	}
    }
    
    static final void method2462(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -527467203 * Class113.anInt1391;
    }
    
    static final void method2463(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_2_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_3_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	class683.aClass401_8651.anIntArray4132[i_2_] = i_3_;
    }
    
    static final void method2464(Class683 class683, int i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class525_Sub16_Sub6 class525_sub16_sub6 = Class556.method9289(i_4_);
	if (class525_sub16_sub6 == null) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class525_sub16_sub6.anInt11773 * 920415765;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class525_sub16_sub6.anInt11775 * 1559325441;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class525_sub16_sub6.anInt11774 * -1604213539;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1270260779 * class525_sub16_sub6.anInt11772;
	}
    }
    
    public static final void method2465(boolean bool, int i) {
	Class96[] class96s = client.aClass96Array11133;
	for (int i_5_ = 0; i_5_ < class96s.length; i_5_++) {
	    Class96 class96 = class96s[i_5_];
	    try {
		class96.method1792(1973169705);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	    class96.method1802((short) 14183);
	}
	Class455_Sub1.method15986(608749259);
	Class175_Sub1.method14530((byte) -52);
	Class514.method8552(false, 1075822114);
	client.aClass507_11137.method8369(-1391827569);
	client.aClass507_11137.method8405(2072978856);
	client.aClass507_11137.method8372(364285681);
	Class2.method528(1212933777);
	Class543.method8914(-1726775627);
	Class384.method6437(true, -1583571782);
	Class107.method1927(412754973);
	Class402.method6567((byte) 44);
	client.anInt11053 = 920464161;
	if (bool)
	    Class441.method7119(12, 870237129);
	else {
	    Class441.method7119(1, -164434459);
	    try {
		Class67.method1442(Class281.anApplet3006, "loggedout",
				   -1494368846);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
    
    static void method2466(int i, int i_6_, int i_7_, byte i_8_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(9, (long) i);
	class525_sub16_sub10.method18361((byte) 4);
	class525_sub16_sub10.anInt11817 = i_6_ * -1179952119;
	class525_sub16_sub10.anInt11796 = 16878283 * i_7_;
    }
}
