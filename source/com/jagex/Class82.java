/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class82 implements Interface12, Interface7
{
    public Class495[][] aClass495ArrayArray849;
    public Object[][] anObjectArrayArray850;
    
    public void method53(int i) {
	/* empty */
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(2085516674);
	    if (i_0_ == 0)
		break;
	    method1602(class525_sub38, i_0_, 1564972455);
	}
    }
    
    void method1601(RSBuffer class525_sub38, int i) {
	if (i == 1) {
	    int i_1_ = class525_sub38.readUnsignedByte(2104056879);
	    if (null == aClass495ArrayArray849)
		aClass495ArrayArray849 = new Class495[i_1_][];
	    for (int i_2_ = class525_sub38.readUnsignedByte(1171999320);
			 i_2_ != 255; i_2_ = class525_sub38.readUnsignedByte(2024629808)) {
		int i_3_ = i_2_ & 0x7f;
		boolean bool = 0 != (i_2_ & 0x80);
		Class495[] class495s
		    = new Class495[class525_sub38.readUnsignedByte(1597420419)];
		for (int i_4_ = 0; i_4_ < class495s.length; i_4_++)
		    class495s[i_4_]
			= ((Class495)
			   Class539.method8888(Class495.method8143((byte) 1),
					       class525_sub38
						   .readUnsignedSmart((byte) -22),
					       456598970));
		aClass495ArrayArray849[i_3_] = class495s;
		if (bool) {
		    if (anObjectArrayArray850 == null)
			anObjectArrayArray850
			    = new Object[aClass495ArrayArray849.length][];
		    anObjectArrayArray850[i_3_]
			= Class227.method4262(class525_sub38, class495s,
					      (byte) 1);
		}
	    }
	}
    }
    
    Class82() {
	/* empty */
    }
    
    void method1602(RSBuffer class525_sub38, int i, int i_5_) {
	if (i == 1) {
	    int i_6_ = class525_sub38.readUnsignedByte(1491304144);
	    if (null == aClass495ArrayArray849)
		aClass495ArrayArray849 = new Class495[i_6_][];
	    for (int i_7_ = class525_sub38.readUnsignedByte(567941026); i_7_ != 255;
			 i_7_ = class525_sub38.readUnsignedByte(1198223537)) {
		int i_8_ = i_7_ & 0x7f;
		boolean bool = 0 != (i_7_ & 0x80);
		Class495[] class495s
		    = new Class495[class525_sub38.readUnsignedByte(1975046201)];
		for (int i_9_ = 0; i_9_ < class495s.length; i_9_++)
		    class495s[i_9_]
			= ((Class495)
			   Class539.method8888(Class495.method8143((byte) 1),
					       class525_sub38
						   .readUnsignedSmart((byte) -41),
					       -1802603274));
		aClass495ArrayArray849[i_8_] = class495s;
		if (bool) {
		    if (anObjectArrayArray850 == null)
			anObjectArrayArray850
			    = new Object[aClass495ArrayArray849.length][];
		    anObjectArrayArray850[i_8_]
			= Class227.method4262(class525_sub38, class495s,
					      (byte) 1);
		}
	    }
	}
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1089415972);
	    if (i == 0)
		break;
	    method1602(class525_sub38, i, 1564972455);
	}
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method70() {
	/* empty */
    }
    
    public void method54(int i, byte i_10_) {
	/* empty */
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    public static int[] method1603(int i, int i_11_, int i_12_, int i_13_,
				   int i_14_, float f, boolean bool,
				   byte i_15_) {
	int[] is = new int[i];
	Class525_Sub40_Sub1 class525_sub40_sub1 = new Class525_Sub40_Sub1();
	class525_sub40_sub1.anInt11848 = 473430349 * i_11_;
	class525_sub40_sub1.aBool11855 = bool;
	class525_sub40_sub1.anInt11842 = -111738613 * i_12_;
	class525_sub40_sub1.anInt11852 = 806466245 * i_13_;
	class525_sub40_sub1.anInt11853 = i_14_ * 1547080483;
	class525_sub40_sub1.anInt11849 = -150373995 * (int) (4096.0F * f);
	class525_sub40_sub1.method18464((byte) 1);
	Class60.method1229(i, 1, 1055103798);
	class525_sub40_sub1.method18457(0, is, 2124037669);
	return is;
    }
}
