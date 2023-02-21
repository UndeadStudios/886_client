/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.IOException;

public class Class324 implements Interface33
{
    Class389 aClass389_3551;
    
    public void method209(boolean bool) {
	if (bool)
	    Class501.aClass182_5564.method3151
		(0, 0, Class434.anInt4827 * -1445589163,
		 -1883654023 * Class696_Sub47.anInt11032,
		 232036219 * aClass389_3551.anInt4060, 0);
    }
    
    public void method212(boolean bool, byte i) {
	if (bool)
	    Class501.aClass182_5564.method3151
		(0, 0, Class434.anInt4827 * -1445589163,
		 -1883654023 * Class696_Sub47.anInt11032,
		 232036219 * aClass389_3551.anInt4060, 0);
    }
    
    public void method211(int i) {
	/* empty */
    }
    
    public boolean method213(int i) {
	return true;
    }
    
    public void method70() {
	/* empty */
    }
    
    public boolean method210() {
	return true;
    }
    
    Class324(Class389 class389) {
	aClass389_3551 = class389;
    }
    
    public static String method5735(byte i) {
	return Class501.aFile5562.getAbsolutePath();
    }
    
    static final void method5736(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2594
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -377032643);
	class259.aBool2695 = true;
    }
    
    static final void method5737(int i, byte i_0_) {
	Class525_Sub38_Sub2 class525_sub38_sub2
	    = client.aClass96_11085.aClass525_Sub38_Sub2_1168;
	while (class525_sub38_sub2.method18506((client.aClass96_11085.anInt1173
						* -1101265009),
					       -1128190394)
	       >= 15) {
	    int i_1_ = class525_sub38_sub2.method18496(15, 578733530);
	    if (i_1_ == 32767)
		break;
	    boolean bool = false;
	    Class525_Sub19 class525_sub19
		= ((Class525_Sub19)
		   client.aClass10_11121.method684((long) i_1_));
	    if (class525_sub19 == null) {
		Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		    = (new Class656_Sub1_Sub3_Sub1_Sub2
		       (client.aClass507_11137.method8358((byte) 50)));
		class656_sub1_sub3_sub1_sub2.anInt11964 = i_1_ * -447377367;
		class525_sub19
		    = new Class525_Sub19(class656_sub1_sub3_sub1_sub2);
		client.aClass10_11121.method695(class525_sub19, (long) i_1_);
		client.aClass525_Sub19Array11122
		    [(client.anInt11276 += 2042937351) * 1530572215 - 1]
		    = class525_sub19;
		bool = true;
	    }
	    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		= (Class656_Sub1_Sub3_Sub1_Sub2) class525_sub19.anObject10571;
	    client.anIntArray11125
		[(client.anInt11216 += -639684551) * 1111866889 - 1]
		= i_1_;
	    class656_sub1_sub3_sub1_sub2.anInt12006
		= client.anInt11227 * -1954352425;
	    if (class656_sub1_sub3_sub1_sub2.aClass299_12255 != null
		&& class656_sub1_sub3_sub1_sub2.aClass299_12255
		       .method5370(65280))
		Class222.method4240(class656_sub1_sub3_sub1_sub2, 65280);
	    int i_2_ = class525_sub38_sub2.method18496(1, 578733530);
	    if (i_2_ == 1)
		client.anIntArray11297
		    [(client.anInt11126 += 831656353) * 1311380065 - 1]
		    = i_1_;
	    int i_3_ = (class525_sub38_sub2.method18496(3, 578733530) + 4 << 11
			& 0x3fff);
	    int i_4_ = class525_sub38_sub2.method18496(2, 578733530);
	    class656_sub1_sub3_sub1_sub2.method18942
		((Class299) (Class168_Sub1.aClass40_Sub7_9112.method76
			     (class525_sub38_sub2.method18496(15, 578733530),
			      -224054466)),
		 -245876714);
	    int i_5_ = class525_sub38_sub2.method18496(1, 578733530);
	    int i_6_ = class525_sub38_sub2.method18496(i, 578733530);
	    if (i_6_ > (1 << i - 1) - 1)
		i_6_ -= 1 << i;
	    int i_7_ = class525_sub38_sub2.method18496(i, 578733530);
	    if (i_7_ > (1 << i - 1) - 1)
		i_7_ -= 1 << i;
	    class656_sub1_sub3_sub1_sub2.method18607
		((class656_sub1_sub3_sub1_sub2.aClass299_12255.anInt3291
		  * 1035256919),
		 133251852);
	    class656_sub1_sub3_sub1_sub2.anInt12003
		= -1104516755 * (-412681569 * (class656_sub1_sub3_sub1_sub2
					       .aClass299_12255.anInt3322)
				 << 3);
	    if (bool)
		class656_sub1_sub3_sub1_sub2.method18597(i_3_, true, (byte) 1);
	    class656_sub1_sub3_sub1_sub2.method18945
		(i_4_,
		 (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.anIntArray12014
		  [0]) + i_6_,
		 i_7_ + (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			 .anIntArray12017[0]),
		 i_5_ == 1,
		 class656_sub1_sub3_sub1_sub2.method18608((byte) 49),
		 1252635837);
	    if (class656_sub1_sub3_sub1_sub2.aClass299_12255.method5370(65280))
		Class610.method10024(class656_sub1_sub3_sub1_sub2.aByte10867,
				     (class656_sub1_sub3_sub1_sub2
				      .anIntArray12014[0]),
				     (class656_sub1_sub3_sub1_sub2
				      .anIntArray12017[0]),
				     0, null, class656_sub1_sub3_sub1_sub2,
				     null, (short) -5295);
	    if (bool)
		class656_sub1_sub3_sub1_sub2.method18940(296717011);
	}
	class525_sub38_sub2.method18497(-2061790185);
    }
    
    static byte[] method5738(File file, int i, int i_8_) {
	byte[] is;
	try {
	    byte[] is_9_ = new byte[i];
	    Class332.method5820(file, is_9_, i, -1034104525);
	    is = is_9_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is;
    }
}
