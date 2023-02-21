/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Image;

public class Class286
{
    byte[] aByteArray3144;
    int anInt3145;
    public static Image anImage3146;
    
    int method5224() {
	short i = 0;
	for (int i_0_ = 0; i_0_ < 2; i_0_++)
	    i |= (aByteArray3144[(anInt3145 += -1863130825) * -1485003641 - 1]
		  & 0xff) << 8 * i_0_;
	return i;
    }
    
    int method5225(byte i) {
	short i_1_ = 0;
	for (int i_2_ = 0; i_2_ < 2; i_2_++)
	    i_1_ |= ((aByteArray3144
		      [(anInt3145 += -1863130825) * -1485003641 - 1])
		     & 0xff) << 8 * i_2_;
	return i_1_;
    }
    
    String method5226(int i) {
	int i_3_ = method5225((byte) -60);
	if (-1 == i_3_)
	    return null;
	if (i_3_ > 256)
	    throw new RuntimeException_Sub1();
	String string
	    = new String(aByteArray3144, -1485003641 * anInt3145, i_3_);
	anInt3145 += -1863130825 * i_3_;
	return string;
    }
    
    int method5227() {
	short i = 0;
	for (int i_4_ = 0; i_4_ < 2; i_4_++)
	    i |= (aByteArray3144[(anInt3145 += -1863130825) * -1485003641 - 1]
		  & 0xff) << 8 * i_4_;
	return i;
    }
    
    Class286(byte[] is) {
	aByteArray3144 = is;
	anInt3145 = 0;
    }
    
    String method5228() {
	int i = method5225((byte) -77);
	if (-1 == i)
	    return null;
	if (i > 256)
	    throw new RuntimeException_Sub1();
	String string = new String(aByteArray3144, -1485003641 * anInt3145, i);
	anInt3145 += -1863130825 * i;
	return string;
    }
    
    String method5229() {
	int i = method5225((byte) -104);
	if (-1 == i)
	    return null;
	if (i > 256)
	    throw new RuntimeException_Sub1();
	String string = new String(aByteArray3144, -1485003641 * anInt3145, i);
	anInt3145 += -1863130825 * i;
	return string;
    }
    
    static final void method5230(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (i_6_ >= 1 && i_6_ <= 10)
	    class259.method4698(i_6_ - 1, i_5_, (byte) 35);
    }
    
    public static void method5231(int i, String string, int i_7_) {
	int i_8_ = Class104.anInt1284 * 692634081;
	int[] is = Class104.anIntArray1285;
	boolean bool = false;
	for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[is[i_9_]];
	    if (null != class656_sub1_sub3_sub1_sub1
		&& (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
		    != class656_sub1_sub3_sub1_sub1)
		&& null != class656_sub1_sub3_sub1_sub1.aString12231
		&& class656_sub1_sub3_sub1_sub1.aString12231
		       .equalsIgnoreCase(string)) {
		Class412 class412 = null;
		if (i == 1)
		    class412 = Class412.aClass412_4295;
		else if (i == 2)
		    class412 = Class412.aClass412_4313;
		else if (i == 3)
		    class412 = Class412.aClass412_4304;
		else if (i == 4)
		    class412 = Class412.aClass412_4316;
		else if (5 == i)
		    class412 = Class412.aClass412_4306;
		else if (6 == i)
		    class412 = Class412.aClass412_4350;
		else if (i == 7)
		    class412 = Class412.aClass412_4337;
		else if (i == 8)
		    class412 = Class412.aClass412_4314;
		else if (9 == i)
		    class412 = Class412.aClass412_4273;
		else if (i == 10)
		    class412 = Class412.aClass412_4260;
		if (class412 != null) {
		    Class525_Sub15 class525_sub15
			= Class16.method767(class412,
					    client.aClass96_11085.aClass6_1169,
					    1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16656(0, -1257991073);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16602(is[i_9_], 2064675169);
		    client.aClass96_11085.method1794(class525_sub15,
						     (short) 30010);
		}
		bool = true;
		break;
	    }
	}
	if (!bool)
	    Class202.method3852
		(4, new StringBuilder().append
			(Class53.aClass53_516.method1169(Class21.aClass666_213,
							 1552651121))
			.append
			(string).toString(), (byte) -112);
    }
}
