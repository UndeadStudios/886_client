/* Class662 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;

final class Class662 implements Runnable
{
    static File aFile8475;
    
    public void run() {
	try {
	    IcmpService_Sub1.anIcmpService_Sub1_10886.run();
	} catch (Throwable throwable) {
	    /* empty */
	}
	IcmpService_Sub1.anIcmpService_Sub1_10886 = null;
    }
    
    public void method10950() {
	try {
	    IcmpService_Sub1.anIcmpService_Sub1_10886.run();
	} catch (Throwable throwable) {
	    /* empty */
	}
	IcmpService_Sub1.anIcmpService_Sub1_10886 = null;
    }
    
    static final void method10951(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class469.method7711(class259, class245, class683, 1077090938);
    }
    
    static final void method10952(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (client.anInt11362 * 1819257147 == 2
	    && i_1_ < -883281325 * client.anInt11204)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= client.aClass66Array11356[i_1_].aBool712 ? 1 : 0;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    public static Class241 method10953(RSBuffer class525_sub38, int i) {
	int i_2_ = class525_sub38.readUnsignedByte(661993737);
	if (0 == i_2_)
	    return null;
	i_2_--;
	class525_sub38.pos += 339428471;
	int i_3_ = class525_sub38.readInt(1089159465);
	Object[] objects = new Object[i_2_];
	for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
	    int i_5_ = class525_sub38.readUnsignedByte(561094842);
	    if (0 == i_5_)
		objects[i_4_]
		    = Class480.method7810
			  (java.lang.Integer.class, -796840856)
			  .method65(class525_sub38, -2012553796);
	    else if (1 == i_5_)
		objects[i_4_]
		    = Class480.method7810
			  (java.lang.String.class, -1229081514)
			  .method65(class525_sub38, -2012553796);
	    else
		throw new IllegalStateException
			  (new StringBuilder().append
			       ("Unrecognised type ID in deserialise: ").append
			       (i_5_).toString());
	}
	return new Class241(i_3_, objects);
    }
    
    static final void method10954(Class683 class683, int i) {
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_6_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_6_ >> 16];
	Class696_Sub38.method17316(class259, class245, class683, -2112134257);
    }
    
    static final void method10955(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub5_10685
		  .method17018(539837629) == 1 ? 1 : 0;
    }
}
