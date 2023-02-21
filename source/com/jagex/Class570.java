/* Class570 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;

public class Class570 implements Interface12, Interface7
{
    int anInt7629 = -580630731;
    int anInt7630 = 1091254767;
    Class590 aClass590_7631 = Class590.aClass590_7811;
    int[] anIntArray7632;
    int anInt7633 = 448450823;
    static File aFile7634;
    
    Class570() {
	/* empty */
    }
    
    public static Class515 method9525(int i, int i_0_, int i_1_, int i_2_,
				      Interface13 interface13,
				      Interface13 interface13_3_) {
	Class516[] class516s = null;
	Class570 class570 = (Class570) interface13.method76(i, -664983106);
	if (class570.anIntArray7632 != null) {
	    class516s = new Class516[class570.anIntArray7632.length];
	    for (int i_4_ = 0; i_4_ < class516s.length; i_4_++) {
		Class301 class301
		    = ((Class301)
		       interface13_3_.method76(class570.anIntArray7632[i_4_],
					       1256145629));
		class516s[i_4_]
		    = new Class516(1365067015 * class301.anInt3365,
				   -656593719 * class301.anInt3371,
				   -1431780545 * class301.anInt3370,
				   class301.anInt3364 * -1962950279,
				   class301.anInt3368 * 1527047925,
				   class301.anInt3367 * 1039613203,
				   class301.anInt3374 * 1047375391,
				   class301.aBool3369,
				   class301.anInt3372 * -1084072075,
				   class301.anInt3373 * 534734717,
				   -241571799 * class301.anInt3366);
	    }
	}
	return new Class515(class570.anInt7629 * 1655762147, class516s,
			    class570.anInt7630 * -1742279951, i_0_, i_1_, i_2_,
			    class570.aClass590_7631,
			    class570.anInt7633 * -424004791);
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_5_ = class525_sub38.readUnsignedByte(1923294449);
	    if (i_5_ == 0)
		break;
	    method9526(class525_sub38, i_5_, 1331991332);
	}
    }
    
    public void method54(int i, byte i_6_) {
	/* empty */
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(2051991656);
	    if (i == 0)
		break;
	    method9526(class525_sub38, i, 1331991332);
	}
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method70() {
	/* empty */
    }
    
    void method9526(RSBuffer class525_sub38, int i, int i_7_) {
	if (i == 1)
	    anInt7629 = class525_sub38.readUnsignedShort((byte) 17) * 580630731;
	else if (i == 2) {
	    anIntArray7632 = new int[class525_sub38.readUnsignedByte(2009564118)];
	    for (int i_8_ = 0; i_8_ < anIntArray7632.length; i_8_++)
		anIntArray7632[i_8_] = class525_sub38.readUnsignedShort((byte) 12);
	} else if (i == 3)
	    anInt7630 = class525_sub38.readUnsignedByte(1251134206) * -1091254767;
	else if (4 == i)
	    aClass590_7631
		= ((Class590)
		   Class539.method8888(Class225.method4250(1190720214),
				       class525_sub38.readUnsignedByte(1024421606),
				       1157406633));
	else if (i == 5)
	    anInt7633 = class525_sub38.readBigSmart(-2043778683) * -448450823;
	else if (i == 6)
	    class525_sub38.readBigSmart(-2043778683);
    }
    
    public void method53(int i) {
	/* empty */
    }
    
    public static boolean method9527(int i) {
	do {
	    boolean bool;
	    try {
		if (IcmpService_Sub1.available())
		    break;
		bool = false;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	} while (false);
	if (null != IcmpService_Sub1.anIcmpService_Sub1_10886)
	    throw new IllegalStateException("");
	IcmpService_Sub1.anIcmpService_Sub1_10886 = new IcmpService_Sub1();
	Thread thread = new Thread(new Class662());
	thread.setDaemon(true);
	thread.start();
	return true;
    }
    
    static final void method9528(Class683 class683, int i) {
	int i_9_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_9_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_9_ >> 16];
	Class50.method1133(class259, class245, class683, (byte) 24);
    }
}
