/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class14 implements Interface12, Interface7
{
    Object[][] anObjectArrayArray168;
    Class495[][] aClass495ArrayArray169;
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(248853639);
	    if (0 == i)
		break;
	    method740(class525_sub38, i, 1424712208);
	}
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(624818110);
	    if (0 == i_0_)
		break;
	    method740(class525_sub38, i_0_, 1359146137);
	}
    }
    
    public Object[] method739(int i, int i_1_) {
	if (null == anObjectArrayArray168)
	    return null;
	return anObjectArrayArray168[i];
    }
    
    void method740(RSBuffer class525_sub38, int i, int i_2_) {
	if (i == 3) {
	    int i_3_ = class525_sub38.readUnsignedByte(743821816);
	    if (null == anObjectArrayArray168) {
		anObjectArrayArray168 = new Object[i_3_][];
		aClass495ArrayArray169 = new Class495[i_3_][];
	    }
	    for (int i_4_ = class525_sub38.readUnsignedByte(1997770856);
			 255 != i_4_; i_4_ = class525_sub38.readUnsignedByte(1187190264)) {
		int i_5_ = class525_sub38.readUnsignedByte(1155056408);
		Class495[] class495s = new Class495[i_5_];
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		    class495s[i_6_]
			= ((Class495)
			   Class539.method8888(Class495.method8143((byte) 1),
					       class525_sub38
						   .method16740((byte) -77),
					       1168373263));
		anObjectArrayArray168[i_4_]
		    = Class227.method4262(class525_sub38, class495s, (byte) 1);
		aClass495ArrayArray169[i_4_] = class495s;
	    }
	}
    }
    
    Class14() {
	/* empty */
    }
    
    public void method54(int i, byte i_7_) {
	/* empty */
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method70() {
	/* empty */
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    public void method53(int i) {
	/* empty */
    }
    
    public Object[] method741(int i) {
	if (null == anObjectArrayArray168)
	    return null;
	return anObjectArrayArray168[i];
    }
    
    void method742(RSBuffer class525_sub38, int i) {
	if (i == 3) {
	    int i_8_ = class525_sub38.readUnsignedByte(171568703);
	    if (null == anObjectArrayArray168) {
		anObjectArrayArray168 = new Object[i_8_][];
		aClass495ArrayArray169 = new Class495[i_8_][];
	    }
	    for (int i_9_ = class525_sub38.readUnsignedByte(1280611843);
			 255 != i_9_; i_9_ = class525_sub38.readUnsignedByte(2025678852)) {
		int i_10_ = class525_sub38.readUnsignedByte(36464392);
		Class495[] class495s = new Class495[i_10_];
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
		    class495s[i_11_]
			= ((Class495)
			   Class539.method8888(Class495.method8143((byte) 1),
					       class525_sub38
						   .method16740((byte) -28),
					       1320963848));
		anObjectArrayArray168[i_9_]
		    = Class227.method4262(class525_sub38, class495s, (byte) 1);
		aClass495ArrayArray169[i_9_] = class495s;
	    }
	}
    }
    
    static final void method743(Class683 class683, int i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10678,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]),
	     (byte) -78);
	Class217.method4146(Class198_Sub13.aClass525_Sub30_9973
				.aClass696_Sub20_10708.method17160(705539059),
			    false, (byte) -41);
	Class650.method10715(-1758466106);
    }
    
    public static Class390 method744(RSBuffer class525_sub38, int i) {
	Class390 class390 = Class198.method3766(class525_sub38, -1991023339);
	int i_12_ = class525_sub38.readInt(1772946479);
	int i_13_ = class525_sub38.readInt(967001850);
	return new Class390_Sub3(class390.aClass395_4068,
				 class390.aClass396_4062,
				 1345009707 * class390.anInt4063,
				 class390.anInt4064 * 1202152725,
				 class390.anInt4065 * 1827301945,
				 class390.anInt4066 * -797820993,
				 1374070015 * class390.anInt4067,
				 class390.anInt4061 * -349107147,
				 class390.anInt4069 * 512449097, i_12_, i_13_);
    }
}
