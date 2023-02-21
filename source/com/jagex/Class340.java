/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class340
{
    static final int anInt3644 = 4;
    long aLong3645 = 6411952182395645403L;
    static final int anInt3646 = 3;
    static final int anInt3647 = 1;
    long aLong3648;
    Class709 aClass709_3649 = new Class709();
    static final int anInt3650 = 2;
    static final int anInt3651 = 5;
    
    public Class340(RSBuffer class525_sub38) {
	method5983(class525_sub38, (byte) 18);
    }
    
    public void method5982(Class525_Sub25 class525_sub25, int i) {
	if ((class525_sub25.aLong7113 * -5126207504388691097L
	     != -8774409692603761423L * aLong3648)
	    || (aLong3645 * 5262834081832204717L
		!= 711857505770455945L * class525_sub25.aLong10602))
	    throw new RuntimeException("");
	for (Class525_Sub22 class525_sub22
		 = (Class525_Sub22) aClass709_3649.method14372((short) -20348);
	     null != class525_sub22;
	     class525_sub22
		 = (Class525_Sub22) aClass709_3649.method14353(-1996538211))
	    class525_sub22.method16339(class525_sub25, -1172166561);
	class525_sub25.aLong10602 += -6538747259597446471L;
    }
    
    void method5983(RSBuffer class525_sub38, byte i) {
	aLong3648
	    = class525_sub38.method16603(-518137353) * 8505269945959953425L;
	aLong3645
	    = class525_sub38.method16603(-170587131) * -6411952182395645403L;
	for (int i_0_ = class525_sub38.readUnsignedByte(1988288489); 0 != i_0_;
		 i_0_ = class525_sub38.readUnsignedByte(509542345)) {
	    Class525_Sub22 class525_sub22;
	    if (1 == i_0_)
		class525_sub22 = new Class525_Sub22_Sub1(this);
	    else if (4 == i_0_)
		class525_sub22 = new Class525_Sub22_Sub4(this);
	    else if (i_0_ == 3)
		class525_sub22 = new Class525_Sub22_Sub2(this);
	    else if (i_0_ == 2)
		class525_sub22 = new Class525_Sub22_Sub5(this);
	    else if (5 == i_0_)
		class525_sub22 = new Class525_Sub22_Sub3(this);
	    else
		throw new RuntimeException("");
	    class525_sub22.method16335(class525_sub38, (byte) 34);
	    aClass709_3649.method14345(class525_sub22, (byte) 0);
	}
    }
    
    void method5984(RSBuffer class525_sub38) {
	aLong3648
	    = class525_sub38.method16603(-1596151373) * 8505269945959953425L;
	aLong3645
	    = class525_sub38.method16603(-826916205) * -6411952182395645403L;
	for (int i = class525_sub38.readUnsignedByte(44917942); 0 != i;
		 i = class525_sub38.readUnsignedByte(1148846149)) {
	    Class525_Sub22 class525_sub22;
	    if (1 == i)
		class525_sub22 = new Class525_Sub22_Sub1(this);
	    else if (4 == i)
		class525_sub22 = new Class525_Sub22_Sub4(this);
	    else if (i == 3)
		class525_sub22 = new Class525_Sub22_Sub2(this);
	    else if (i == 2)
		class525_sub22 = new Class525_Sub22_Sub5(this);
	    else if (5 == i)
		class525_sub22 = new Class525_Sub22_Sub3(this);
	    else
		throw new RuntimeException("");
	    class525_sub22.method16335(class525_sub38, (byte) -70);
	    aClass709_3649.method14345(class525_sub22, (byte) 0);
	}
    }
    
    void method5985(RSBuffer class525_sub38) {
	aLong3648
	    = class525_sub38.method16603(-1564863436) * 8505269945959953425L;
	aLong3645
	    = class525_sub38.method16603(-794709237) * -6411952182395645403L;
	for (int i = class525_sub38.readUnsignedByte(1047627649); 0 != i;
		 i = class525_sub38.readUnsignedByte(839081079)) {
	    Class525_Sub22 class525_sub22;
	    if (1 == i)
		class525_sub22 = new Class525_Sub22_Sub1(this);
	    else if (4 == i)
		class525_sub22 = new Class525_Sub22_Sub4(this);
	    else if (i == 3)
		class525_sub22 = new Class525_Sub22_Sub2(this);
	    else if (i == 2)
		class525_sub22 = new Class525_Sub22_Sub5(this);
	    else if (5 == i)
		class525_sub22 = new Class525_Sub22_Sub3(this);
	    else
		throw new RuntimeException("");
	    class525_sub22.method16335(class525_sub38, (byte) 63);
	    aClass709_3649.method14345(class525_sub22, (byte) 0);
	}
    }
    
    public void method5986(Class525_Sub25 class525_sub25) {
	if ((class525_sub25.aLong7113 * -5126207504388691097L
	     != -8774409692603761423L * aLong3648)
	    || (aLong3645 * 5262834081832204717L
		!= 711857505770455945L * class525_sub25.aLong10602))
	    throw new RuntimeException("");
	for (Class525_Sub22 class525_sub22
		 = (Class525_Sub22) aClass709_3649.method14372((short) -3700);
	     null != class525_sub22;
	     class525_sub22
		 = (Class525_Sub22) aClass709_3649.method14353(-1693775051))
	    class525_sub22.method16339(class525_sub25, 1258915236);
	class525_sub25.aLong10602 += -6538747259597446471L;
    }
    
    public static int method5987(int i, int i_1_, int i_2_, int i_3_) {
	i_2_ &= 0x3;
	if (0 == i_2_)
	    return i_1_;
	if (i_2_ == 1)
	    return 4095 - i;
	if (2 == i_2_)
	    return 4095 - i_1_;
	return i;
    }
    
    static final void method5988(Class683 class683, int i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = class683.aClass353_8652.aStringArray3778[i_4_];
    }
    
    static final void method5989(Class683 class683, byte i) {
	if (Class695.aBool8757 && null != Class96.aFrame1186)
	    Class332_Sub1.method15672(Class198_Sub13.aClass525_Sub30_9973
					  .aClass696_Sub41_10704
					  .method17337(1664728573),
				      -1, -1, false, (byte) 17);
	if (Class669.method11036(179210738) == Class508.aClass508_5657) {
	    Class276.method5113(1289223666);
	    System.exit(0);
	} else
	    Class28.method910(-681151535);
    }
    
    static final void method5990(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class102.method1886(class259, class245, class683, -906708967);
    }
    
    static void method5991(Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1,
			   int i, int i_5_, int i_6_, int i_7_) {
	Class586 class586 = class656_sub1_sub3_sub1.method18633((byte) -37);
	Class689_Sub1 class689_sub1
	    = class656_sub1_sub3_sub1.aClass689_Sub1_11986;
	int i_8_
	    = ((-716095235 * class656_sub1_sub3_sub1.anInt11965
		- 2030157131 * class656_sub1_sub3_sub1.aClass64_11992.anInt694)
	       & 0x3fff);
	if (Class684.aClass684_8673.aByte8666 == i) {
	    if (i_8_ != 0
		|| 51790795 * class656_sub1_sub3_sub1.anInt12012 > 25) {
		if (i_6_ < 0 && -1 != class586.anInt7731 * 509097237) {
		    class689_sub1.method14027(class586.anInt7731 * 509097237,
					      false, true, 767694863);
		    class689_sub1.aBool11017 = false;
		} else if (i_6_ > 0
			   && -1 != class586.anInt7756 * -1318839683) {
		    class689_sub1.method14027(-1318839683 * class586.anInt7756,
					      false, true, 506048831);
		    class689_sub1.aBool11017 = false;
		} else if (!class689_sub1.aBool11017
			   || !(class586.method9666
				(class689_sub1.method14048(-1681033885),
				 1221432875))) {
		    class689_sub1.method14027(class586.method9665((byte) 111),
					      false, true, 435412906);
		    class689_sub1.aBool11017
			= class656_sub1_sub3_sub1.aClass689_Sub1_11986
			      .method14021(600108321);
		}
	    } else if (!class689_sub1.aBool11017
		       || !class586.method9666(class689_sub1
						   .method14048(619641601),
					       1010633972)) {
		class689_sub1.method14027(class586.method9665((byte) 68),
					  false, true, 692491170);
		class689_sub1.aBool11017
		    = class689_sub1.method14021(-1606776170);
	    }
	} else if (-1 != -705923653 * class656_sub1_sub3_sub1.anInt11983
		   && (i_8_ >= 10240 || i_8_ <= 2048)) {
	    int i_9_ = ((client.anIntArray11159[i_5_]
			 - (2030157131
			    * class656_sub1_sub3_sub1.aClass64_11992.anInt694))
			& 0x3fff);
	    if (Class684.aClass684_8669.aByte8666 == i
		&& -1 != 1543647097 * class586.anInt7737) {
		if (i_9_ > 2048 && i_9_ <= 6144
		    && -1 != 847346181 * class586.anInt7740)
		    class689_sub1.method14027(class586.anInt7740 * 847346181,
					      false, true, 1381797779);
		else if (i_9_ >= 10240 && i_9_ < 14336
			 && -323002495 * class586.anInt7749 != -1)
		    class689_sub1.method14027(class586.anInt7749 * -323002495,
					      false, true, 1361689541);
		else if (i_9_ > 6144 && i_9_ < 10240
			 && -1 != 1757568299 * class586.anInt7738)
		    class689_sub1.method14027(class586.anInt7738 * 1757568299,
					      false, true, -457564836);
		else
		    class689_sub1.method14027(1543647097 * class586.anInt7737,
					      false, true, 69589446);
	    } else if (i == Class684.aClass684_8667.aByte8666
		       && class586.anInt7741 * 323075315 != -1) {
		if (i_9_ > 2048 && i_9_ <= 6144
		    && class586.anInt7744 * -880993293 != -1)
		    class689_sub1.method14027(-880993293 * class586.anInt7744,
					      false, true, -1619488291);
		else if (i_9_ >= 10240 && i_9_ < 14336
			 && -1559403155 * class586.anInt7762 != -1)
		    class689_sub1.method14027(class586.anInt7762 * -1559403155,
					      false, true, 155004181);
		else if (i_9_ > 6144 && i_9_ < 10240
			 && -1 != -1270065645 * class586.anInt7742)
		    class689_sub1.method14027(class586.anInt7742 * -1270065645,
					      false, true, 2125250535);
		else
		    class689_sub1.method14027(323075315 * class586.anInt7741,
					      false, true, -294553739);
	    } else if (i_9_ > 2048 && i_9_ <= 6144
		       && -1 != class586.anInt7736 * -244077599)
		class689_sub1.method14027(class586.anInt7736 * -244077599,
					  false, true, 1204089178);
	    else if (i_9_ >= 10240 && i_9_ < 14336
		     && class586.anInt7735 * 514429187 != -1)
		class689_sub1.method14027(514429187 * class586.anInt7735,
					  false, true, 1291558179);
	    else if (i_9_ > 6144 && i_9_ < 10240
		     && -1 != -233221675 * class586.anInt7734)
		class689_sub1.method14027(class586.anInt7734 * -233221675,
					  false, true, -871198899);
	    else
		class689_sub1.method14027(class586.anInt7733 * -1543198931,
					  false, true, 344587065);
	    class689_sub1.aBool11017 = false;
	} else if (i_8_ != 0
		   || 51790795 * class656_sub1_sub3_sub1.anInt12012 > 25) {
	    if (Class684.aClass684_8669.aByte8666 == i
		&& -1 != 1543647097 * class586.anInt7737) {
		if (i_6_ < 0 && -1 != class586.anInt7747 * 1262179851)
		    class689_sub1.method14027(class586.anInt7747 * 1262179851,
					      false, true, 1995470211);
		else if (i_6_ > 0 && class586.anInt7770 * 805293851 != -1)
		    class689_sub1.method14027(class586.anInt7770 * 805293851,
					      false, true, -588034360);
		else
		    class689_sub1.method14027(class586.anInt7737 * 1543647097,
					      false, true, -890597569);
	    } else if (i == Class684.aClass684_8667.aByte8666
		       && -1 != class586.anInt7741 * 323075315) {
		if (i_6_ < 0 && -1 != 1241121483 * class586.anInt7745)
		    class689_sub1.method14027(1241121483 * class586.anInt7745,
					      false, true, 1226055183);
		else if (i_6_ > 0 && 2086258951 * class586.anInt7746 != -1)
		    class689_sub1.method14027(2086258951 * class586.anInt7746,
					      false, true, 429531894);
		else
		    class689_sub1.method14027(323075315 * class586.anInt7741,
					      false, true, -1201451694);
	    } else if (i_6_ < 0 && -1 != class586.anInt7750 * 1142617413)
		class689_sub1.method14027(1142617413 * class586.anInt7750,
					  false, true, -884311429);
	    else if (i_6_ > 0 && class586.anInt7739 * -1321015845 != -1)
		class689_sub1.method14027(class586.anInt7739 * -1321015845,
					  false, true, -1057300893);
	    else
		class689_sub1.method14027(-1543198931 * class586.anInt7733,
					  false, true, -862607839);
	    class689_sub1.aBool11017 = false;
	} else {
	    if (i == Class684.aClass684_8669.aByte8666
		&& class586.anInt7737 * 1543647097 != -1)
		class689_sub1.method14027(class586.anInt7737 * 1543647097,
					  false, true, -237847483);
	    else if (i == Class684.aClass684_8667.aByte8666
		     && -1 != class586.anInt7741 * 323075315)
		class689_sub1.method14027(323075315 * class586.anInt7741,
					  false, true, 1442375593);
	    else
		class689_sub1.method14027(-1543198931 * class586.anInt7733,
					  false, true, 861448383);
	    class689_sub1.aBool11017 = false;
	}
    }
}
