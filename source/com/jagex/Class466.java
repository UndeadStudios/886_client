/* Class466 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class466 implements Runnable
{
    Thread aThread5121;
    int anInt5122;
    boolean aBool5123;
    Class697 aClass697_5124 = new Class697();
    
    public void run() {
	while (!aBool5123) {
	    Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2;
	    synchronized (aClass697_5124) {
		class525_sub16_sub12_sub2
		    = ((Class525_Sub16_Sub12_Sub2)
		       aClass697_5124.method14196(-605325750));
		if (class525_sub16_sub12_sub2 != null)
		    anInt5122 -= -1971992289;
		else {
		    try {
			aClass697_5124.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if (2 == class525_sub16_sub12_sub2.anInt12198 * -646337025)
		    class525_sub16_sub12_sub2.aClass552_12194.method9159
			((int) (7105793357836614431L
				* class525_sub16_sub12_sub2.aLong10553),
			 class525_sub16_sub12_sub2.aByteArray12199,
			 class525_sub16_sub12_sub2.aByteArray12199.length,
			 (byte) 18);
		else if (3
			 == class525_sub16_sub12_sub2.anInt12198 * -646337025)
		    class525_sub16_sub12_sub2.aByteArray12199
			= (class525_sub16_sub12_sub2.aClass552_12194.method9162
			   ((int) (class525_sub16_sub12_sub2.aLong10553
				   * 7105793357836614431L),
			    (byte) 35));
	    } catch (Exception exception) {
		Class525_Sub16_Sub13.method18448(null, exception, (byte) 54);
	    }
	    class525_sub16_sub12_sub2.aBool11832 = false;
	}
    }
    
    Class525_Sub16_Sub12_Sub2 method7672(int i, byte[] is, Class552 class552) {
	Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2
	    = new Class525_Sub16_Sub12_Sub2();
	class525_sub16_sub12_sub2.anInt12198 = -125524994;
	class525_sub16_sub12_sub2.aLong10553 = (long) i * 7693047446987161823L;
	class525_sub16_sub12_sub2.aByteArray12199 = is;
	class525_sub16_sub12_sub2.aClass552_12194 = class552;
	class525_sub16_sub12_sub2.aBool11834 = false;
	method7675(class525_sub16_sub12_sub2, (short) 153);
	return class525_sub16_sub12_sub2;
    }
    
    Class525_Sub16_Sub12_Sub2 method7673(int i, byte[] is, Class552 class552,
					 int i_0_) {
	Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2
	    = new Class525_Sub16_Sub12_Sub2();
	class525_sub16_sub12_sub2.anInt12198 = -125524994;
	class525_sub16_sub12_sub2.aLong10553 = (long) i * 7693047446987161823L;
	class525_sub16_sub12_sub2.aByteArray12199 = is;
	class525_sub16_sub12_sub2.aClass552_12194 = class552;
	class525_sub16_sub12_sub2.aBool11834 = false;
	method7675(class525_sub16_sub12_sub2, (short) 153);
	return class525_sub16_sub12_sub2;
    }
    
    Class525_Sub16_Sub12_Sub2 method7674(int i, Class552 class552, int i_1_) {
	Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2
	    = new Class525_Sub16_Sub12_Sub2();
	class525_sub16_sub12_sub2.anInt12198 = -188287491;
	class525_sub16_sub12_sub2.aLong10553 = 7693047446987161823L * (long) i;
	class525_sub16_sub12_sub2.aClass552_12194 = class552;
	class525_sub16_sub12_sub2.aBool11834 = false;
	method7675(class525_sub16_sub12_sub2, (short) 153);
	return class525_sub16_sub12_sub2;
    }
    
    void method7675(Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2,
		    short i) {
	synchronized (aClass697_5124) {
	    aClass697_5124.method14184(class525_sub16_sub12_sub2, 728171782);
	    anInt5122 += -1971992289;
	    aClass697_5124.notifyAll();
	}
    }
    
    Class525_Sub16_Sub12_Sub2 method7676(int i, Class552 class552) {
	Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2
	    = new Class525_Sub16_Sub12_Sub2();
	class525_sub16_sub12_sub2.anInt12198 = -188287491;
	class525_sub16_sub12_sub2.aLong10553 = 7693047446987161823L * (long) i;
	class525_sub16_sub12_sub2.aClass552_12194 = class552;
	class525_sub16_sub12_sub2.aBool11834 = false;
	method7675(class525_sub16_sub12_sub2, (short) 153);
	return class525_sub16_sub12_sub2;
    }
    
    public int method7677(int i) {
	synchronized (aClass697_5124) {
	    int i_2_ = anInt5122 * 929723103;
	    return i_2_;
	}
    }
    
    public void method7678(int i) {
	aBool5123 = true;
	synchronized (aClass697_5124) {
	    aClass697_5124.notifyAll();
	}
	try {
	    aThread5121.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	aThread5121 = null;
    }
    
    public void method7679() {
	while (!aBool5123) {
	    Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2;
	    synchronized (aClass697_5124) {
		class525_sub16_sub12_sub2
		    = ((Class525_Sub16_Sub12_Sub2)
		       aClass697_5124.method14196(2049471641));
		if (class525_sub16_sub12_sub2 != null)
		    anInt5122 -= -1971992289;
		else {
		    try {
			aClass697_5124.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if (2 == class525_sub16_sub12_sub2.anInt12198 * -646337025)
		    class525_sub16_sub12_sub2.aClass552_12194.method9159
			((int) (7105793357836614431L
				* class525_sub16_sub12_sub2.aLong10553),
			 class525_sub16_sub12_sub2.aByteArray12199,
			 class525_sub16_sub12_sub2.aByteArray12199.length,
			 (byte) 53);
		else if (3
			 == class525_sub16_sub12_sub2.anInt12198 * -646337025)
		    class525_sub16_sub12_sub2.aByteArray12199
			= (class525_sub16_sub12_sub2.aClass552_12194.method9162
			   ((int) (class525_sub16_sub12_sub2.aLong10553
				   * 7105793357836614431L),
			    (byte) 30));
	    } catch (Exception exception) {
		Class525_Sub16_Sub13.method18448(null, exception, (byte) 35);
	    }
	    class525_sub16_sub12_sub2.aBool11832 = false;
	}
    }
    
    public int method7680() {
	synchronized (aClass697_5124) {
	    int i = anInt5122 * 929723103;
	    return i;
	}
    }
    
    public Class466() {
	anInt5122 = 0;
	aBool5123 = false;
	aThread5121 = new Thread(this);
	aThread5121.setDaemon(true);
	aThread5121.start();
	aThread5121.setPriority(1);
    }
    
    void method7681(Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2) {
	synchronized (aClass697_5124) {
	    aClass697_5124.method14184(class525_sub16_sub12_sub2, 728171782);
	    anInt5122 += -1971992289;
	    aClass697_5124.notifyAll();
	}
    }
    
    void method7682(Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2) {
	synchronized (aClass697_5124) {
	    aClass697_5124.method14184(class525_sub16_sub12_sub2, 728171782);
	    anInt5122 += -1971992289;
	    aClass697_5124.notifyAll();
	}
    }
    
    Class525_Sub16_Sub12_Sub2 method7683(int i, Class552 class552) {
	Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2
	    = new Class525_Sub16_Sub12_Sub2();
	class525_sub16_sub12_sub2.anInt12198 = -62762497;
	synchronized (aClass697_5124) {
	    for (Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2_3_
		     = ((Class525_Sub16_Sub12_Sub2)
			aClass697_5124.method14186((byte) -15));
		 null != class525_sub16_sub12_sub2_3_;
		 class525_sub16_sub12_sub2_3_
		     = ((Class525_Sub16_Sub12_Sub2)
			aClass697_5124.method14201((byte) -1))) {
		if ((long) i == (class525_sub16_sub12_sub2_3_.aLong10553
				 * 7105793357836614431L)
		    && class552 == class525_sub16_sub12_sub2_3_.aClass552_12194
		    && 2 == (class525_sub16_sub12_sub2_3_.anInt12198
			     * -646337025)) {
		    class525_sub16_sub12_sub2.aByteArray12199
			= class525_sub16_sub12_sub2_3_.aByteArray12199;
		    class525_sub16_sub12_sub2.aBool11832 = false;
		    Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2_4_
			= class525_sub16_sub12_sub2;
		    return class525_sub16_sub12_sub2_4_;
		}
	    }
	}
	class525_sub16_sub12_sub2.aByteArray12199
	    = class552.method9162(i, (byte) 2);
	class525_sub16_sub12_sub2.aBool11832 = false;
	class525_sub16_sub12_sub2.aBool11834 = true;
	return class525_sub16_sub12_sub2;
    }
    
    void method7684(Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2) {
	synchronized (aClass697_5124) {
	    aClass697_5124.method14184(class525_sub16_sub12_sub2, 728171782);
	    anInt5122 += -1971992289;
	    aClass697_5124.notifyAll();
	}
    }
    
    Class525_Sub16_Sub12_Sub2 method7685(int i, Class552 class552, byte i_5_) {
	Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2
	    = new Class525_Sub16_Sub12_Sub2();
	class525_sub16_sub12_sub2.anInt12198 = -62762497;
	synchronized (aClass697_5124) {
	    for (Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2_6_
		     = ((Class525_Sub16_Sub12_Sub2)
			aClass697_5124.method14186((byte) -67));
		 null != class525_sub16_sub12_sub2_6_;
		 class525_sub16_sub12_sub2_6_
		     = ((Class525_Sub16_Sub12_Sub2)
			aClass697_5124.method14201((byte) -1))) {
		if ((long) i == (class525_sub16_sub12_sub2_6_.aLong10553
				 * 7105793357836614431L)
		    && class552 == class525_sub16_sub12_sub2_6_.aClass552_12194
		    && 2 == (class525_sub16_sub12_sub2_6_.anInt12198
			     * -646337025)) {
		    class525_sub16_sub12_sub2.aByteArray12199
			= class525_sub16_sub12_sub2_6_.aByteArray12199;
		    class525_sub16_sub12_sub2.aBool11832 = false;
		    Class525_Sub16_Sub12_Sub2 class525_sub16_sub12_sub2_7_
			= class525_sub16_sub12_sub2;
		    return class525_sub16_sub12_sub2_7_;
		}
	    }
	}
	class525_sub16_sub12_sub2.aByteArray12199
	    = class552.method9162(i, (byte) -10);
	class525_sub16_sub12_sub2.aBool11832 = false;
	class525_sub16_sub12_sub2.aBool11834 = true;
	return class525_sub16_sub12_sub2;
    }
    
    static final void method7686(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	int i_8_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class88 class88
	    = (Class88) client.aClass40_Sub16_11201.method76(i_8_, 369818206);
	if (class88.method1661(1859168676))
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class259.method4691(i_8_, class88.aString892, 1644647325);
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class259.method4690(i_8_, 2053564367 * class88.anInt893,
				      1446516863);
    }
    
    static final void method7687(Class683 class683, int i) {
	Class525_Sub28 class525_sub28
	    = ((Class525_Sub28)
	       (class683.anObjectArray8636
		[(class683.anInt8644 -= 1285561025) * 1373599041]));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -1069747287 * class525_sub28.anInt10617;
    }
    
    static final void method7688(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (Class265.method4801(1777895575 * client.anInt11075, -1118147426)
	       ? 1 : 0);
    }
    
    static final void method7689(Class683 class683, byte i) {
	int i_9_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (Class182_Sub2.aClass228_9503.method4273((byte) -116) == i_9_ ? 1
	       : 0);
    }
    
    static final void method7690(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static Class198 method7691(RSBuffer class525_sub38, int i) {
	int i_10_ = class525_sub38.readUnsignedByte(1961541769);
	Class84 class84 = Class477.method7787(i_10_, 1384765611);
	Class198 class198 = null;
	switch (1405603987 * class84.anInt884) {
	case 30:
	    class198 = new Class198_Sub5(class525_sub38);
	    break;
	case 0:
	    class198 = new Class198_Sub14(class525_sub38, false);
	    break;
	case 10:
	    class198 = new Class198_Sub23(class525_sub38, 1, 0);
	    break;
	case 17:
	    class198 = new Class198_Sub2(class525_sub38);
	    break;
	case 26:
	    class198 = new Class198_Sub6(class525_sub38);
	    break;
	case 29:
	    class198 = new Class198_Sub16(class525_sub38);
	    break;
	case 12:
	    class198 = new Class198_Sub20(class525_sub38);
	    break;
	case 1:
	    class198 = new Class198_Sub19_Sub2(class525_sub38);
	    break;
	case 7:
	    class198 = new Class198_Sub1(class525_sub38);
	    break;
	case 28:
	    class198 = new Class198_Sub4(class525_sub38);
	    break;
	case 27:
	    class198 = new Class198_Sub9(class525_sub38);
	    break;
	case 14:
	    class198 = new Class198_Sub7(class525_sub38);
	    break;
	case 13:
	    class198 = new Class198_Sub10(class525_sub38);
	    break;
	case 16:
	    class198 = new Class198_Sub12(class525_sub38);
	    break;
	case 4:
	    class198 = new Class198_Sub19_Sub1(class525_sub38);
	    break;
	case 5:
	    class198 = new Class198_Sub13(class525_sub38);
	    break;
	case 2:
	    class198 = new Class198_Sub15(class525_sub38);
	    break;
	case 9:
	    class198 = new Class198_Sub21(class525_sub38);
	    break;
	default:
	    break;
	case 22:
	    class198 = new Class198_Sub11(class525_sub38);
	    break;
	case 25:
	    class198 = new Class198_Sub23(class525_sub38, 0, 0);
	    break;
	case 21:
	    class198 = new Class198_Sub14(class525_sub38, true);
	    break;
	case 8:
	    class198 = new Class198_Sub22(class525_sub38);
	    break;
	case 6:
	    class198 = new Class198_Sub23(class525_sub38, 0, 1);
	    break;
	case 11:
	    class198 = new Class198_Sub3(class525_sub38);
	    break;
	case 15:
	    class198 = new Class198_Sub17(class525_sub38);
	    break;
	case 18:
	    class198 = new Class198_Sub18(class525_sub38);
	    break;
	case 3:
	    class198 = new Class198_Sub8(class525_sub38);
	    break;
	case 19:
	    class198 = new Class198_Sub23(class525_sub38, 1, 1);
	}
	return class198;
    }
    
    static final void method7692(Class525_Sub38_Sub2 class525_sub38_sub2,
				 byte i) {
	for (int i_11_ = 0; i_11_ < Class104.anInt1289 * -799225349; i_11_++) {
	    class525_sub38_sub2.readUnsignedShort((byte) 66);
	    int i_12_ = Class104.anIntArray1278[i_11_];
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_12_];
	    int i_13_ = class525_sub38_sub2.readUnsignedByte(1644062738);
	    if (0 != (i_13_ & 0x2))
		i_13_ += class525_sub38_sub2.readUnsignedByte(688928158) << 8;
	    if ((i_13_ & 0x4000) != 0)
		i_13_ += class525_sub38_sub2.readUnsignedByte(563057892) << 16;
	    Class178.method2913(class525_sub38_sub2, i_12_,
				class656_sub1_sub3_sub1_sub1, i_13_,
				(byte) 93);
	}
    }
    
    static final void method7693(Class683 class683, int i) {
	int i_14_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_14_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_14_ >> 16];
	Class206.method3900(class259, class245, class683, (byte) -33);
    }
    
    static final void method7694(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aShort11348;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aShort11349;
    }
    
    public static Class525_Sub28 method7695(int i, boolean bool, int i_15_) {
	synchronized (Class525_Sub28.aClass525_Sub28Array10616) {
	    if (1331388799 * Class703.anInt8790 == 0) {
		Class525_Sub28 class525_sub28 = new Class525_Sub28(i, bool);
		return class525_sub28;
	    }
	    Class525_Sub28.aClass525_Sub28Array10616
		[(Class703.anInt8790 -= 1596087935) * 1331388799]
		.method16386(i, bool, -755257743);
	    Class525_Sub28 class525_sub28
		= (Class525_Sub28.aClass525_Sub28Array10616
		   [Class703.anInt8790 * 1331388799]);
	    return class525_sub28;
	}
    }
}
