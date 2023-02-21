/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class154
{
    public Class435 aClass435_1727;
    public Class154 aClass154_1728;
    public int anInt1729;
    public int anInt1730;
    public int anInt1731;
    public int anInt1732;
    public int anInt1733;
    
    public Class388 method2443(Interface49 interface49, int i) {
	return interface49.method342(-1220882097 * anInt1733, (byte) -47);
    }
    
    public Class388 method2444(Interface49 interface49) {
	return interface49.method342(-1220882097 * anInt1733, (byte) -4);
    }
    
    Class154 method2445(int i, int i_0_) {
	return new Class154(-1220882097 * anInt1733, i);
    }
    
    public Class388 method2446(Interface49 interface49) {
	return interface49.method342(-1220882097 * anInt1733, (byte) 6);
    }
    
    Class154(int i, int i_1_) {
	anInt1733 = -2060606033 * i;
	anInt1729 = -1598402539 * i_1_;
    }
    
    public Class388 method2447(Interface49 interface49) {
	return interface49.method342(-1220882097 * anInt1733, (byte) -63);
    }
    
    Class154 method2448(int i) {
	return new Class154(-1220882097 * anInt1733, i);
    }
    
    static final void method2449(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class706.method14307(class259, class245, class683, 2028628677);
    }
    
    static final void method2450(Class683 class683, int i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_2_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2622 * -1646614517;
    }
    
    static final void method2451(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub16_10670
		  .method17112(-537197321) ? 1 : 0;
    }
    
    static final void method2452(Class683 class683, int i) {
	/* empty */
    }
    
    public static Class406[] method2453(int i) {
	return (new Class406[]
		{ Class406.aClass406_4156, Class406.aClass406_4154,
		  Class406.aClass406_4158, Class406.aClass406_4155,
		  Class406.aClass406_4157, Class406.aClass406_4160,
		  Class406.aClass406_4159, Class406.aClass406_4164,
		  Class406.aClass406_4161, Class406.aClass406_4162,
		  Class406.aClass406_4163, Class406.aClass406_4167,
		  Class406.aClass406_4165, Class406.aClass406_4166,
		  Class406.aClass406_4153 });
    }
    
    static final void method2454
	(Class683 class683, Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1,
	 byte i) {
	class683.anInt8662 -= -2016344041;
	int i_3_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_4_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	int i_5_ = class683.anIntArray8661[2 + class683.anInt8662 * 501271953];
	int i_6_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 3];
	int i_7_ = class683.anIntArray8661[4 + 501271953 * class683.anInt8662];
	boolean bool
	    = class683.anIntArray8661[5 + 501271953 * class683.anInt8662] == 1;
	int i_8_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 6];
	if (Class453_Sub3.aClass309_Sub1_10316.method5485(-449886350)
	    != Class289.aClass289_3202)
	    throw new RuntimeException();
	Class350_Sub1 class350_sub1
	    = ((Class350_Sub1)
	       Class453_Sub3.aClass309_Sub1_10316.method5481(-1060003832));
	Class429 class429 = new Class429();
	Class429 class429_9_ = new Class429();
	class429.method6811(0.0F, 1.0F, 0.0F,
			    (float) ((double) i_7_ * 3.141592653589793 * 2.0
				     / 16384.0));
	Class446 class446 = new Class446(1.0F, 0.0F, 0.0F);
	class446.method7239(class429);
	class446.method7219();
	class429_9_.method6810(class446,
			       (float) (2.0
					* (3.141592653589793 * (double) i_6_)
					/ 16384.0));
	class429.method6822(class429_9_);
	Class600 class600 = client.aClass507_11137.method8350(-1457475428);
	int i_10_ = -1227002079 * class600.anInt7858 << 9;
	int i_11_ = 1429253007 * class600.anInt7860 << 9;
	if (null != class656_sub1_sub3_sub1)
	    class350_sub1.method15809(class656_sub1_sub3_sub1,
				      new Class446((float) i_3_, (float) i_4_,
						   (float) i_5_),
				      class429, bool, i_8_,
				      (client.aClass507_11137.method8359
				       (-1003512146).anIntArrayArrayArray4966),
				      client.aClass507_11137
					  .method8360(1824969069),
				      i_10_, i_11_, -446354623);
	client.aBool11364 = true;
    }
}
