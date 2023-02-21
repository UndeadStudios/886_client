/* Class583 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class583 implements Interface12
{
    public int anInt7707;
    public int anInt7708;
    public int anInt7709 = 35958201;
    Class584 aClass584_7710;
    public int anInt7711;
    static final int anInt7712 = 70;
    public int anInt7713;
    public int anInt7714;
    public int anInt7715;
    public int anInt7716;
    public int anInt7717;
    public int anInt7718;
    public int anInt7719;
    static int anInt7720;
    
    public void method67(int i) {
	/* empty */
    }
    
    Class583(int i, Class584 class584) {
	anInt7708 = 1915361689;
	anInt7711 = -2102667657;
	anInt7719 = 973776549;
	anInt7713 = 291806078;
	anInt7714 = 671534235;
	anInt7715 = 1221676409;
	anInt7716 = 428959785;
	anInt7717 = 7035785;
	anInt7718 = 356887443;
	anInt7707 = 875482927;
	aClass584_7710 = class584;
    }
    
    void method9628(RSBuffer class525_sub38, int i, int i_0_) {
	if (i == 1)
	    class525_sub38.readUnsignedShort((byte) 80);
	else if (2 == i)
	    anInt7709 = class525_sub38.readUnsignedByte(2043799578) * 1920244039;
	else if (3 == i)
	    anInt7708 = class525_sub38.readUnsignedByte(709705394) * -1323086489;
	else if (i == 4)
	    anInt7711 = 0;
	else if (i == 5)
	    anInt7713 = class525_sub38.readUnsignedShort((byte) 110) * 1660798901;
	else if (6 == i)
	    class525_sub38.readUnsignedByte(848660097);
	else if (i == 7)
	    anInt7714 = class525_sub38.readBigSmart(-2043778683) * -671534235;
	else if (8 == i)
	    anInt7715 = class525_sub38.readBigSmart(-2043778683) * -1221676409;
	else if (i == 9)
	    anInt7716 = class525_sub38.readBigSmart(-2043778683) * -428959785;
	else if (i == 10)
	    anInt7717 = class525_sub38.readBigSmart(-2043778683) * -7035785;
	else if (i == 11)
	    anInt7711 = class525_sub38.readUnsignedShort((byte) 22) * 2102667657;
	else if (i == 12)
	    anInt7718 = class525_sub38.readBigSmart(-2043778683) * -356887443;
	else if (13 == i)
	    anInt7707 = class525_sub38.readBigSmart(-2043778683) * -875482927;
    }
    
    public Class157 method9629(Class182 class182, int i, int i_1_) {
	if (i < 0)
	    return null;
	Class157 class157
	    = (Class157) aClass584_7710.aClass200_7722.method3785((long) i);
	if (class157 == null) {
	    method9631(class182, 1749818769);
	    class157 = ((Class157)
			aClass584_7710.aClass200_7722.method3785((long) i));
	}
	return class157;
    }
    
    void method9630(Class182 class182, int i, int i_2_) {
	Class458 class458 = aClass584_7710.aClass458_7721;
	if (i >= 0
	    && aClass584_7710.aClass200_7722.method3785((long) i) == null
	    && class458.method7506(i, -1745937843)) {
	    Class173 class173 = Class187.method3668(class458, i);
	    aClass584_7710.aClass200_7722
		.method3788(class182.method3216(class173, true), (long) i);
	}
    }
    
    void method9631(Class182 class182, int i) {
	method9630(class182, 1992410733 * anInt7714, 1980941095);
	method9630(class182, anInt7715 * 793998135, 1613208676);
	method9630(class182, anInt7716 * 653216743, 1330873371);
	method9630(class182, 960787783 * anInt7717, 1338206761);
	method9630(class182, -92875419 * anInt7718, 1713908096);
	method9630(class182, 356853809 * anInt7707, 1799109626);
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1048777752);
	    if (i == 0)
		break;
	    method9628(class525_sub38, i, 725621831);
	}
    }
    
    public void method70() {
	/* empty */
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_3_ = class525_sub38.readUnsignedByte(1903119124);
	    if (i_3_ == 0)
		break;
	    method9628(class525_sub38, i_3_, 1025715496);
	}
    }
    
    void method9632(Class182 class182, int i) {
	Class458 class458 = aClass584_7710.aClass458_7721;
	if (i >= 0
	    && aClass584_7710.aClass200_7722.method3785((long) i) == null
	    && class458.method7506(i, 709860072)) {
	    Class173 class173 = Class187.method3668(class458, i);
	    aClass584_7710.aClass200_7722
		.method3788(class182.method3216(class173, true), (long) i);
	}
    }
    
    static final void method9633(Class683 class683, int i) {
	boolean bool = ((class683.anIntArray8661
			 [(class683.anInt8662 -= 1552651121) * 501271953])
			!= 0);
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = Class96.method1817((long) i_4_, 0, bool, Class21.aClass666_213,
				 -167725771);
    }
    
    static final void method9634(Class683 class683, byte i) {
	class683.anInt8662 -= 1915637188;
	int i_5_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_6_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	int i_7_ = class683.anIntArray8661[2 + class683.anInt8662 * 501271953];
	int i_8_ = class683.anIntArray8661[3 + class683.anInt8662 * 501271953];
	int i_9_ = 256;
	Class40_Sub20.aClass217_11050.method4047
	    (Class204.aClass204_2233, i_5_, i_6_, i_8_,
	     Class208.aClass208_2250.method3907((short) -4497),
	     Class195.aClass195_2177, 0.0F, 0.0F, null, 0, i_9_, i_7_,
	     2104084654);
    }
    
    public static final void method9635(String string, short i) {
	int i_10_ = client.aBool11229 ? 400 : 200;
	if (null != string) {
	    if (-883281325 * client.anInt11204 >= i_10_)
		Class202.method3852
		    (4,
		     (client.aBool11229
		      ? Class53.aClass53_417.method1169(Class21.aClass666_213,
							1552651121)
		      : Class53.aClass53_418.method1169(Class21.aClass666_213,
							1552651121)),
		     (byte) -78);
	    else {
		String string_11_
		    = Class48.method1111(string, Class454.aClass76_4951,
					 1977921549);
		if (null != string_11_) {
		    for (int i_12_ = 0; i_12_ < -883281325 * client.anInt11204;
			 i_12_++) {
			Class66 class66 = client.aClass66Array11356[i_12_];
			String string_13_
			    = Class48.method1111(class66.aString708,
						 Class454.aClass76_4951,
						 2111423682);
			if (string_13_ != null
			    && string_13_.equals(string_11_)) {
			    Class202.method3852(4,
						new StringBuilder().append
						    (string).append
						    (Class53.aClass53_457
							 .method1169
						     (Class21.aClass666_213,
						      1552651121))
						    .toString(),
						(byte) -17);
			    return;
			}
			if (class66.aString707 != null) {
			    String string_14_
				= Class48.method1111(class66.aString707,
						     Class454.aClass76_4951,
						     1882005734);
			    if (null != string_14_
				&& string_14_.equals(string_11_)) {
				Class202.method3852(4,
						    new StringBuilder().append
							(string).append
							(Class53
							     .aClass53_457
							     .method1169
							 ((Class21
							   .aClass666_213),
							  1552651121))
							.toString(),
						    (byte) -123);
				return;
			    }
			}
		    }
		    for (int i_15_ = 0; i_15_ < client.anInt11366 * -651611127;
			 i_15_++) {
			Class31 class31 = client.aClass31Array11368[i_15_];
			String string_16_
			    = Class48.method1111(class31.aString300,
						 Class454.aClass76_4951,
						 1909288513);
			if (null != string_16_
			    && string_16_.equals(string_11_)) {
			    Class202.method3852(4,
						new StringBuilder().append
						    (Class53.aClass53_534
							 .method1169
						     (Class21.aClass666_213,
						      1552651121))
						    .append
						    (string).append
						    (Class53.aClass53_535
							 .method1169
						     (Class21.aClass666_213,
						      1552651121))
						    .toString(),
						(byte) -81);
			    return;
			}
			if (class31.aString301 != null) {
			    String string_17_
				= Class48.method1111(class31.aString301,
						     Class454.aClass76_4951,
						     2014438850);
			    if (string_17_ != null
				&& string_17_.equals(string_11_)) {
				Class202.method3852
				    (4,
				     new StringBuilder().append
					 (Class53.aClass53_534.method1169
					  (Class21.aClass666_213, 1552651121))
					 .append
					 (string).append
					 (Class53.aClass53_535.method1169
					  (Class21.aClass666_213, 1552651121))
					 .toString(),
				     (byte) -37);
				return;
			    }
			}
		    }
		    if (Class48.method1111
			    ((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			      .aString12231),
			     Class454.aClass76_4951, 2057434197)
			    .equals(string_11_))
			Class202.method3852(4, (Class53.aClass53_531.method1169
						(Class21.aClass666_213,
						 1552651121)), (byte) -74);
		    else {
			Class96 class96 = Class111.method1979(1152558345);
			Class525_Sub15 class525_sub15
			    = Class16.method767(Class412.aClass412_4335,
						class96.aClass6_1169,
						1977859884);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16735
			    (Class161.method2628(string, -75873280),
			     -1724077065);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16700(string, -1933983061);
			class96.method1794(class525_sub15, (short) 17428);
		    }
		}
	    }
	}
    }
}
