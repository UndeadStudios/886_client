/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class322 implements Interface14
{
    Class336 aClass336_3540;
    public int anInt3541;
    int anInt3542;
    int anInt3543;
    public Class163 aClass163_3544;
    String aString3545;
    Class453 aClass453_3546;
    int anInt3547 = -1348631017;
    static int[] anIntArray3548 = new int[32];
    public static JS5 aClass458_3549;
    
    static {
	int i = 2;
	for (int i_0_ = 0; i_0_ < 32; i_0_++) {
	    anIntArray3548[i_0_] = i - 1;
	    i += i;
	}
    }
    
    public int method5718(int i) {
	int i_1_
	    = anIntArray3548[anInt3542 * 122158679 - anInt3543 * -1395709631];
	return i >> anInt3543 * -1395709631 & i_1_;
    }
    
    void method5719(RSBuffer class525_sub38, boolean bool, int i) {
	for (;;) {
	    int i_2_ = class525_sub38.readUnsignedByte(2077751974);
	    if (i_2_ == 0)
		break;
	    method5723(class525_sub38, i_2_, bool, (byte) -51);
	}
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	method5719(class525_sub38, false, 1896010941);
    }
    
    public int method5720(int i, int i_3_) throws Exception_Sub6 {
	int i_4_
	    = anIntArray3548[122158679 * anInt3542 - anInt3543 * -1395709631];
	if (i_3_ < 0 || i_3_ > i_4_)
	    throw new Exception_Sub6((null != aString3545 ? aString3545
				      : Integer
					    .toString(1366917675 * anInt3541)),
				     i_3_, i_4_);
	i_4_ <<= -1395709631 * anInt3543;
	return (i & (i_4_ ^ 0xffffffff)
		| i_3_ << anInt3543 * -1395709631 & i_4_);
    }
    
    public int method5721(int i, int i_5_, int i_6_) throws Exception_Sub6 {
	int i_7_
	    = anIntArray3548[122158679 * anInt3542 - anInt3543 * -1395709631];
	if (i_5_ < 0 || i_5_ > i_7_)
	    throw new Exception_Sub6((null != aString3545 ? aString3545
				      : Integer
					    .toString(1366917675 * anInt3541)),
				     i_5_, i_7_);
	i_7_ <<= -1395709631 * anInt3543;
	return (i & (i_7_ ^ 0xffffffff)
		| i_5_ << anInt3543 * -1395709631 & i_7_);
    }
    
    public int method5722(int i, int i_8_) {
	int i_9_
	    = anIntArray3548[anInt3542 * 122158679 - anInt3543 * -1395709631];
	return i >> anInt3543 * -1395709631 & i_9_;
    }
    
    public void method68(RSBuffer class525_sub38) {
	method5719(class525_sub38, false, 2054602387);
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method70() {
	/* empty */
    }
    
    void method5723(RSBuffer class525_sub38, int i, boolean bool,
                    byte i_10_) {
	Class333 class333
	    = (Class333) Class539.method8888(Class496.method8156((byte) 123),
					     i, -2047437245);
	switch (class333.anInt3616 * 1032554077) {
	case 6:
	    anInt3543 = class525_sub38.readUnsignedByte(2127642947) * 1122133697;
	    anInt3542 = class525_sub38.readUnsignedByte(1037768304) * -1418998425;
	    break;
	case 13: {
	    int i_11_ = class525_sub38.readUnsignedByte(1737425807);
	    aClass453_3546
		= ((Class453)
		   Class539.method8888(Class453.method7348(1296175880), i_11_,
				       -129172827));
	    if (aClass453_3546 == null)
		throw new IllegalStateException("");
	    anInt3547 = class525_sub38.readBigSmart(-2043778683) * 1348631017;
	    if (aClass336_3540 != null) {
		Interface13 interface13
		    = ((Interface13)
		       aClass336_3540.aMap3629.get(aClass453_3546));
		if (null != interface13)
		    aClass163_3544
			= ((Class163)
			   interface13.method76(anInt3547 * -68817319,
						210538288));
		else if (!bool)
		    throw new IllegalStateException("");
	    }
	    break;
	}
	default:
	    break;
	case 3:
	    /* empty */
	}
    }
    
    void method5724(RSBuffer class525_sub38, int i, boolean bool) {
	Class333 class333
	    = (Class333) Class539.method8888(Class496.method8156((byte) 123),
					     i, 1551506738);
	switch (class333.anInt3616 * 1032554077) {
	case 6:
	    anInt3543 = class525_sub38.readUnsignedByte(1899802722) * 1122133697;
	    anInt3542 = class525_sub38.readUnsignedByte(1402948899) * -1418998425;
	    break;
	case 13: {
	    int i_12_ = class525_sub38.readUnsignedByte(1725187645);
	    aClass453_3546
		= ((Class453)
		   Class539.method8888(Class453.method7348(1470136633), i_12_,
				       -1826376738));
	    if (aClass453_3546 == null)
		throw new IllegalStateException("");
	    anInt3547 = class525_sub38.readBigSmart(-2043778683) * 1348631017;
	    if (aClass336_3540 != null) {
		Interface13 interface13
		    = ((Interface13)
		       aClass336_3540.aMap3629.get(aClass453_3546));
		if (null != interface13)
		    aClass163_3544
			= ((Class163)
			   interface13.method76(anInt3547 * -68817319,
						943677063));
		else if (!bool)
		    throw new IllegalStateException("");
	    }
	    break;
	}
	default:
	    break;
	case 3:
	    /* empty */
	}
    }
    
    void method5725(RSBuffer class525_sub38, int i, boolean bool) {
	Class333 class333
	    = (Class333) Class539.method8888(Class496.method8156((byte) 123),
					     i, -1425891670);
	switch (class333.anInt3616 * 1032554077) {
	case 6:
	    anInt3543 = class525_sub38.readUnsignedByte(1185358237) * 1122133697;
	    anInt3542 = class525_sub38.readUnsignedByte(301113596) * -1418998425;
	    break;
	case 13: {
	    int i_13_ = class525_sub38.readUnsignedByte(1905395457);
	    aClass453_3546
		= ((Class453)
		   Class539.method8888(Class453.method7348(1751231211), i_13_,
				       340545564));
	    if (aClass453_3546 == null)
		throw new IllegalStateException("");
	    anInt3547 = class525_sub38.readBigSmart(-2043778683) * 1348631017;
	    if (aClass336_3540 != null) {
		Interface13 interface13
		    = ((Interface13)
		       aClass336_3540.aMap3629.get(aClass453_3546));
		if (null != interface13)
		    aClass163_3544
			= ((Class163)
			   interface13.method76(anInt3547 * -68817319,
						-1999430348));
		else if (!bool)
		    throw new IllegalStateException("");
	    }
	    break;
	}
	default:
	    break;
	case 3:
	    /* empty */
	}
    }
    
    Class322(int i, Class336 class336) {
	anInt3541 = 1121528963 * i;
	aClass336_3540 = class336;
    }
    
    public int method5726(int i, int i_14_) throws Exception_Sub6 {
	int i_15_
	    = anIntArray3548[122158679 * anInt3542 - anInt3543 * -1395709631];
	if (i_14_ < 0 || i_14_ > i_15_)
	    throw new Exception_Sub6((null != aString3545 ? aString3545
				      : Integer
					    .toString(1366917675 * anInt3541)),
				     i_14_, i_15_);
	i_15_ <<= -1395709631 * anInt3543;
	return (i & (i_15_ ^ 0xffffffff)
		| i_14_ << anInt3543 * -1395709631 & i_15_);
    }
    
    public static Class690 method5727(int i) {
	if (null == Class25.aClass690_243)
	    return Class690.aClass690_8739;
	return Class25.aClass690_243;
    }
    
    static void method5728(Class259 class259, Class152 class152, int i,
			   int i_16_, int i_17_, int i_18_, Class157 class157,
			   double d, Class275 class275, Class272 class272,
			   int i_19_) {
	if (class157 != null) {
	    int i_20_;
	    if (-174799205 * Class700.anInt8779 == 5)
		i_20_ = ((int) ((double) Class453_Sub3.aClass309_Sub1_10316
					     .method5491((byte) 0)
				* 2607.5945876176133)
			 + client.anInt11059 * 223546583) & 0x3fff;
	    else if (2 == Class700.anInt8779 * -174799205)
		i_20_ = (int) client.aFloat11052 & 0x3fff;
	    else
		i_20_
		    = (client.anInt11059 * 223546583 + (int) client.aFloat11052
		       & 0x3fff);
	    int i_21_ = (Math.max(-1694810043 * class259.anInt2602 / 2,
				  2054207119 * class259.anInt2598 / 2)
			 + 10);
	    int i_22_ = i_18_ * i_18_ + i_17_ * i_17_;
	    if (i_22_ <= i_21_ * i_21_) {
		int i_23_ = Class436.anIntArray4831[i_20_];
		int i_24_ = Class436.anIntArray4838[i_20_];
		if (-174799205 * Class700.anInt8779 != 2) {
		    i_23_
			= i_23_ * 256 / (client.anInt11169 * -198324601 + 256);
		    i_24_
			= i_24_ * 256 / (256 + -198324601 * client.anInt11169);
		}
		int i_25_ = i_18_ * i_23_ + i_24_ * i_17_ >> 14;
		int i_26_ = i_24_ * i_18_ - i_23_ * i_17_ >> 14;
		double d_27_ = d / 100.0;
		switch (1165567667 * class275.anInt2866) {
		case 0:
		    i = i_25_ + (class259.anInt2602 * -1694810043 / 2 + i);
		    break;
		case 2:
		    i = (i_25_ + (i + class259.anInt2602 * -1694810043 / 2)
			 - (int) ((double) (class157.method12() / 2) * d_27_));
		    break;
		case 1:
		    i = (i_25_ + (-1694810043 * class259.anInt2602 / 2 + i)
			 - (int) ((double) class157.method12() * d_27_));
		    break;
		}
		switch (1302320603 * class272.anInt2847) {
		case 1:
		    i_16_
			= (i_16_ + class259.anInt2598 * 2054207119 / 2 - i_26_
			   - (int) ((double) (class157.method2472() / 2)
				    * d_27_));
		    break;
		case 2:
		    i_16_
			= i_16_ + 2054207119 * class259.anInt2598 / 2 - i_26_;
		    break;
		case 0:
		    i_16_
			= (i_16_ + class259.anInt2598 * 2054207119 / 2 - i_26_
			   - (int) ((double) class157.method2472() * d_27_));
		    break;
		}
		if (null != class152) {
		    if (1.0 == d_27_)
			class157.method2480(i, i_16_, class152, i, i_16_);
		    else
			class157.method2481(i, i_16_,
					    (int) ((double) class157.method12()
						   * d_27_),
					    (int) ((double) class157
								.method2472()
						   * d_27_));
		} else {
		    if (d_27_ == 1.0)
			class157.method2518(i, i_16_);
		    class157.method2481(i, i_16_,
					(int) ((double) class157.method12()
					       * d_27_),
					(int) ((double) class157.method2472()
					       * d_27_));
		}
	    }
	}
    }
    
    public static void method5729(int i, int i_28_) {
	synchronized (Class637.aClass200_8292) {
	    Class637.aClass200_8292.method3805(i, 1920937835);
	}
	synchronized (Class637.aClass200_8305) {
	    Class637.aClass200_8305.method3805(i, 2116089418);
	}
    }
    
    static final void method5730(Class683 class683, int i) {
	int i_29_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	ItemDefinitions class8 = (ItemDefinitions) Class313_Sub2.aClass40_Sub22_10106
				     .method76(i_29_, -1206271097);
	if (class8.anInt77 * -1095552769 >= 0
	    && -1210387357 * class8.anInt59 >= 0)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1210387357 * class8.anInt59;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= i_29_;
    }
    
    static final void method5731(Class683 class683, int i) {
	Class163 class163
	    = (Class163) (class683.aClass525_Sub16_Sub4_8664.anObjectArray11750
			  [1931825055 * class683.anInt8663]);
	Interface17 interface17
	    = ((Interface17)
	       (0 == class683.anIntArray8647[class683.anInt8663 * 1931825055]
		? class683.aMap8657.get(class163.aClass453_1767)
		: class683.aMap8643.get(class163.aClass453_1767)));
	Class480 class480 = class163.aClass495_1765.method8131(-1901663727);
	if (Class480.aClass480_5216 == class480)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= interface17.method104(class163, 623775022);
	else if (Class480.aClass480_5211 == class480)
	    class683.aLongArray8645
		[(class683.anInt8648 += 2101136961) * 105529793 - 1]
		= interface17.method101(class163, -969931502);
	else if (class480 == Class480.aClass480_5212) {
	    try {
		String string
		    = (String) interface17.method91(class163, -192491204);
		if (string == null)
		    string = "null";
		class683.anObjectArray8636
		    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		    = string;
	    } catch (Exception exception) {
		throw new RuntimeException(exception);
	    }
	} else
	    throw new RuntimeException();
    }
}
