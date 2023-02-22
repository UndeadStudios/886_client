/* Class580 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class580 implements Interface12
{
    public boolean aBool7677 = false;
    public int anInt7678;
    String aString7679;
    public static final int anInt7680 = 0;
    int anInt7681;
    public int anInt7682;
    int anInt7683;
    public static final int anInt7684 = -1;
    public int anInt7685 = 864001639;
    public int anInt7686;
    public int anInt7687;
    int anInt7688;
    Class585 aClass585_7689;
    int anInt7690;
    int anInt7691;
    Interface13 anInterface13_7692;
    public int anInt7693;
    public int anInt7694;
    int anInt7695;
    public int anInt7696;
    static final int anInt7697 = 70;
    public int anInt7698;
    public static final int anInt7699 = 1;
    public int[] anIntArray7700;
    static final int anInt7701 = 16777215;
    int anInt7702;
    int anInt7703;
    public int anInt7704 = -712199969;
    
    public void method67(int i) {
	/* empty */
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(555487519);
	    if (0 == i_0_)
		break;
	    method9588(class525_sub38, i_0_, (byte) 5);
	}
    }
    
    void method9588(RSBuffer class525_sub38, int i, byte i_1_) {
	if (1 == i)
	    anInt7685 = class525_sub38.readBigSmart(-2043778683) * -864001639;
	else if (2 == i) {
	    anInt7704 = class525_sub38.method16834(-1994884458) * 1265848097;
	    aBool7677 = true;
	} else if (3 == i)
	    anInt7688 = class525_sub38.readBigSmart(-2043778683) * 1332984021;
	else if (i == 4)
	    anInt7690 = class525_sub38.readBigSmart(-2043778683) * -563675867;
	else if (i == 5)
	    anInt7683 = class525_sub38.readBigSmart(-2043778683) * -782705671;
	else if (6 == i)
	    anInt7691 = class525_sub38.readBigSmart(-2043778683) * 455571343;
	else if (7 == i)
	    anInt7682 = class525_sub38.readSmart((byte) -19) * 140668715;
	else if (8 == i)
	    aString7679 = class525_sub38.method16637(824853330);
	else if (9 == i)
	    anInt7687 = class525_sub38.readUnsignedShort((byte) 57) * -1375386661;
	else if (i == 10)
	    anInt7693 = class525_sub38.readSmart((byte) 65) * -1972574773;
	else if (11 == i)
	    anInt7694 = 0;
	else if (i == 12)
	    anInt7696 = class525_sub38.readUnsignedByte(3293048) * 1304269939;
	else if (i == 13)
	    anInt7686 = class525_sub38.readSmart((byte) 56) * 1488578829;
	else if (i == 14)
	    anInt7694 = class525_sub38.readUnsignedShort((byte) 38) * -1749069223;
	else if (i == 16) {
	    anInt7698 = class525_sub38.readSmart((byte) 69) * 664140071;
	    anInt7678 = class525_sub38.readSmart((byte) -79) * -1583330947;
	} else if (i == 17 || i == 18) {
	    anInt7695 = class525_sub38.readUnsignedShort((byte) 113) * 1130416875;
	    if (anInt7695 * -737767997 == 65535)
		anInt7695 = -1130416875;
	    anInt7702 = class525_sub38.readUnsignedShort((byte) 30) * 1377770713;
	    if (anInt7702 * 1098359657 == 65535)
		anInt7702 = -1377770713;
	    int i_2_ = -1;
	    if (18 == i) {
		i_2_ = class525_sub38.readUnsignedShort((byte) 14);
		if (65535 == i_2_)
		    i_2_ = -1;
	    }
	    int i_3_ = class525_sub38.readUnsignedByte(1112444477);
	    anIntArray7700 = new int[i_3_ + 2];
	    for (int i_4_ = 0; i_4_ <= i_3_; i_4_++) {
		anIntArray7700[i_4_] = class525_sub38.readUnsignedShort((byte) 98);
		if (65535 == anIntArray7700[i_4_])
		    anIntArray7700[i_4_] = -1;
	    }
	    anIntArray7700[i_3_ + 1] = i_2_;
	} else if (19 == i)
	    anInt7703 = class525_sub38.readUnsignedShort((byte) 87) * -387395611;
	else if (i == 20)
	    anInt7681 = class525_sub38.readUnsignedShort((byte) 108) * -663180113;
    }
    
    public final Class580 method9589(Interface20 interface20,
				     Interface18 interface18, int i) {
	int i_5_ = -1;
	if (null == anIntArray7700)
	    return this;
	if (interface20 == null || null == interface18)
	    return null;
	if (-737767997 * anInt7695 != -1) {
	    Class322 class322
		= interface20.method124(anInt7695 * -737767997, -1045464776);
	    if (class322 != null)
		i_5_ = interface18.method93(class322, (byte) 2);
	} else if (-1 != anInt7702 * 1098359657) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					1098359657 * anInt7702, -1360209984);
	    if (null != class163)
		i_5_ = interface18.method104(class163, 623775022);
	}
	if (i_5_ < 0 || i_5_ >= anIntArray7700.length - 1) {
	    int i_6_ = anIntArray7700[anIntArray7700.length - 1];
	    if (-1 != i_6_)
		return (Class580) anInterface13_7692.method76(i_6_, 319168864);
	    return null;
	}
	if (anIntArray7700[i_5_] == -1)
	    return null;
	return ((Class580)
		anInterface13_7692.method76(anIntArray7700[i_5_], 1902935022));
    }
    
    public String method9590(int i, byte i_7_) {
	String string = aString7679;
	i = anInt7703 * -1717119507 * i / (-1477301681 * anInt7681);
	for (;;) {
	    int i_8_ = string.indexOf("%1");
	    if (i_8_ < 0)
		break;
	    string
		= new StringBuilder().append(string.substring(0, i_8_)).append
		      (Class198_Sub6.method15617(i, false, (byte) 101)).append
		      (string.substring(i_8_ + 2)).toString();
	}
	return string;
    }
    
    public Class157 method9591(Class182 class182, int i) {
	if (-236732291 * anInt7688 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (-236732291
								* anInt7688)));
	if (null == class157) {
	    method9595(class182, -1615875748);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7688 * -236732291));
	}
	return class157;
    }
    
    public Class157 method9592(Class182 class182, int i) {
	if (-24578487 * anInt7683 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (anInt7683
								* -24578487)));
	if (class157 == null) {
	    method9595(class182, 152639640);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7683 * -24578487));
	}
	return class157;
    }
    
    public Class157 method9593(Class182 class182, int i) {
	if (anInt7690 * -796731731 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (-796731731
								* anInt7690)));
	if (null == class157) {
	    method9595(class182, 194562666);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7690 * -796731731));
	}
	return class157;
    }
    
    public Class157 method9594(Class182 class182, int i) {
	if (anInt7691 * -1822570641 < 0)
	    return null;
	Class157 class157
	    = (Class157) aClass585_7689.aClass200_7723
			     .method3785((long) (anInt7691 * -1822570641));
	if (class157 == null) {
	    method9595(class182, 502682185);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (-1822570641 * anInt7691));
	}
	return class157;
    }
    
    void method9595(Class182 class182, int i) {
	JS5 class458 = aClass585_7689.aClass458_7724;
	if (-236732291 * anInt7688 >= 0
	    && (aClass585_7689.aClass200_7723.method3785((long) (anInt7688
								 * -236732291))
		== null)
	    && class458.method7506(-236732291 * anInt7688, 1990660177)) {
	    Class173 class173
		= Class187.method3668(class458, anInt7688 * -236732291);
	    aClass585_7689.aClass200_7723.method3788
		(class182.method3216(class173, true),
		 (long) (anInt7688 * -236732291));
	}
	if (anInt7683 * -24578487 >= 0
	    && (aClass585_7689.aClass200_7723.method3785((long) (anInt7683
								 * -24578487))
		== null)
	    && class458.method7506(-24578487 * anInt7683, 1115669776)) {
	    Class173 class173
		= Class187.method3668(class458, anInt7683 * -24578487);
	    aClass585_7689.aClass200_7723.method3788
		(class182.method3216(class173, true),
		 (long) (-24578487 * anInt7683));
	}
	if (anInt7690 * -796731731 >= 0
	    && (aClass585_7689.aClass200_7723.method3785((long) (anInt7690
								 * -796731731))
		== null)
	    && class458.method7506(anInt7690 * -796731731, 2036742275)) {
	    Class173 class173
		= Class187.method3668(class458, anInt7690 * -796731731);
	    aClass585_7689.aClass200_7723.method3788
		(class182.method3216(class173, true),
		 (long) (-796731731 * anInt7690));
	}
	if (anInt7691 * -1822570641 >= 0
	    && aClass585_7689.aClass200_7723
		   .method3785((long) (anInt7691 * -1822570641)) == null
	    && class458.method7506(anInt7691 * -1822570641, 1857893258)) {
	    Class173 class173
		= Class187.method3668(class458, anInt7691 * -1822570641);
	    aClass585_7689.aClass200_7723.method3788
		(class182.method3216(class173, true),
		 (long) (anInt7691 * -1822570641));
	}
    }
    
    public String method9596(int i) {
	String string = aString7679;
	i = anInt7703 * -1717119507 * i / (-1477301681 * anInt7681);
	for (;;) {
	    int i_9_ = string.indexOf("%1");
	    if (i_9_ < 0)
		break;
	    string
		= new StringBuilder().append(string.substring(0, i_9_)).append
		      (Class198_Sub6.method15617(i, false, (byte) 2)).append
		      (string.substring(i_9_ + 2)).toString();
	}
	return string;
    }
    
    public Class157 method9597(Class182 class182) {
	if (anInt7690 * -796731731 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (-796731731
								* anInt7690)));
	if (null == class157) {
	    method9595(class182, -733425763);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7690 * -796731731));
	}
	return class157;
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method70() {
	/* empty */
    }
    
    public final Class580 method9598(Interface20 interface20,
				     Interface18 interface18) {
	int i = -1;
	if (null == anIntArray7700)
	    return this;
	if (interface20 == null || null == interface18)
	    return null;
	if (-737767997 * anInt7695 != -1) {
	    Class322 class322
		= interface20.method124(anInt7695 * -737767997, 1976446075);
	    if (class322 != null)
		i = interface18.method93(class322, (byte) 2);
	} else if (-1 != anInt7702 * 1098359657) {
	    Class163 class163
		= interface20.method119(Class453.aClass453_4939,
					1098359657 * anInt7702, -1957144427);
	    if (null != class163)
		i = interface18.method104(class163, 623775022);
	}
	if (i < 0 || i >= anIntArray7700.length - 1) {
	    int i_10_ = anIntArray7700[anIntArray7700.length - 1];
	    if (-1 != i_10_)
		return ((Class580)
			anInterface13_7692.method76(i_10_, -369655761));
	    return null;
	}
	if (anIntArray7700[i] == -1)
	    return null;
	return ((Class580)
		anInterface13_7692.method76(anIntArray7700[i], -741136839));
    }
    
    void method9599(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    anInt7685 = class525_sub38.readBigSmart(-2043778683) * -864001639;
	else if (2 == i) {
	    anInt7704 = class525_sub38.method16834(-1994884458) * 1265848097;
	    aBool7677 = true;
	} else if (3 == i)
	    anInt7688 = class525_sub38.readBigSmart(-2043778683) * 1332984021;
	else if (i == 4)
	    anInt7690 = class525_sub38.readBigSmart(-2043778683) * -563675867;
	else if (i == 5)
	    anInt7683 = class525_sub38.readBigSmart(-2043778683) * -782705671;
	else if (6 == i)
	    anInt7691 = class525_sub38.readBigSmart(-2043778683) * 455571343;
	else if (7 == i)
	    anInt7682 = class525_sub38.readSmart((byte) 66) * 140668715;
	else if (8 == i)
	    aString7679 = class525_sub38.method16637(-1290724917);
	else if (9 == i)
	    anInt7687 = class525_sub38.readUnsignedShort((byte) 78) * -1375386661;
	else if (i == 10)
	    anInt7693 = class525_sub38.readSmart((byte) 15) * -1972574773;
	else if (11 == i)
	    anInt7694 = 0;
	else if (i == 12)
	    anInt7696 = class525_sub38.readUnsignedByte(1068579124) * 1304269939;
	else if (i == 13)
	    anInt7686 = class525_sub38.readSmart((byte) -4) * 1488578829;
	else if (i == 14)
	    anInt7694 = class525_sub38.readUnsignedShort((byte) 93) * -1749069223;
	else if (i == 16) {
	    anInt7698 = class525_sub38.readSmart((byte) -62) * 664140071;
	    anInt7678 = class525_sub38.readSmart((byte) 10) * -1583330947;
	} else if (i == 17 || i == 18) {
	    anInt7695 = class525_sub38.readUnsignedShort((byte) 60) * 1130416875;
	    if (anInt7695 * -737767997 == 65535)
		anInt7695 = -1130416875;
	    anInt7702 = class525_sub38.readUnsignedShort((byte) 85) * 1377770713;
	    if (anInt7702 * 1098359657 == 65535)
		anInt7702 = -1377770713;
	    int i_11_ = -1;
	    if (18 == i) {
		i_11_ = class525_sub38.readUnsignedShort((byte) 71);
		if (65535 == i_11_)
		    i_11_ = -1;
	    }
	    int i_12_ = class525_sub38.readUnsignedByte(1493659124);
	    anIntArray7700 = new int[i_12_ + 2];
	    for (int i_13_ = 0; i_13_ <= i_12_; i_13_++) {
		anIntArray7700[i_13_] = class525_sub38.readUnsignedShort((byte) 110);
		if (65535 == anIntArray7700[i_13_])
		    anIntArray7700[i_13_] = -1;
	    }
	    anIntArray7700[i_12_ + 1] = i_11_;
	} else if (19 == i)
	    anInt7703 = class525_sub38.readUnsignedShort((byte) 89) * -387395611;
	else if (i == 20)
	    anInt7681 = class525_sub38.readUnsignedShort((byte) 10) * -663180113;
    }
    
    void method9600(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    anInt7685 = class525_sub38.readBigSmart(-2043778683) * -864001639;
	else if (2 == i) {
	    anInt7704 = class525_sub38.method16834(-1994884458) * 1265848097;
	    aBool7677 = true;
	} else if (3 == i)
	    anInt7688 = class525_sub38.readBigSmart(-2043778683) * 1332984021;
	else if (i == 4)
	    anInt7690 = class525_sub38.readBigSmart(-2043778683) * -563675867;
	else if (i == 5)
	    anInt7683 = class525_sub38.readBigSmart(-2043778683) * -782705671;
	else if (6 == i)
	    anInt7691 = class525_sub38.readBigSmart(-2043778683) * 455571343;
	else if (7 == i)
	    anInt7682 = class525_sub38.readSmart((byte) 40) * 140668715;
	else if (8 == i)
	    aString7679 = class525_sub38.method16637(-1905989837);
	else if (9 == i)
	    anInt7687 = class525_sub38.readUnsignedShort((byte) 85) * -1375386661;
	else if (i == 10)
	    anInt7693 = class525_sub38.readSmart((byte) 79) * -1972574773;
	else if (11 == i)
	    anInt7694 = 0;
	else if (i == 12)
	    anInt7696 = class525_sub38.readUnsignedByte(33309035) * 1304269939;
	else if (i == 13)
	    anInt7686 = class525_sub38.readSmart((byte) 6) * 1488578829;
	else if (i == 14)
	    anInt7694 = class525_sub38.readUnsignedShort((byte) 53) * -1749069223;
	else if (i == 16) {
	    anInt7698 = class525_sub38.readSmart((byte) -17) * 664140071;
	    anInt7678 = class525_sub38.readSmart((byte) -28) * -1583330947;
	} else if (i == 17 || i == 18) {
	    anInt7695 = class525_sub38.readUnsignedShort((byte) 120) * 1130416875;
	    if (anInt7695 * -737767997 == 65535)
		anInt7695 = -1130416875;
	    anInt7702 = class525_sub38.readUnsignedShort((byte) 104) * 1377770713;
	    if (anInt7702 * 1098359657 == 65535)
		anInt7702 = -1377770713;
	    int i_14_ = -1;
	    if (18 == i) {
		i_14_ = class525_sub38.readUnsignedShort((byte) 101);
		if (65535 == i_14_)
		    i_14_ = -1;
	    }
	    int i_15_ = class525_sub38.readUnsignedByte(135806446);
	    anIntArray7700 = new int[i_15_ + 2];
	    for (int i_16_ = 0; i_16_ <= i_15_; i_16_++) {
		anIntArray7700[i_16_] = class525_sub38.readUnsignedShort((byte) 125);
		if (65535 == anIntArray7700[i_16_])
		    anIntArray7700[i_16_] = -1;
	    }
	    anIntArray7700[i_15_ + 1] = i_14_;
	} else if (19 == i)
	    anInt7703 = class525_sub38.readUnsignedShort((byte) 37) * -387395611;
	else if (i == 20)
	    anInt7681 = class525_sub38.readUnsignedShort((byte) 20) * -663180113;
    }
    
    public Class157 method9601(Class182 class182) {
	if (-236732291 * anInt7688 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (-236732291
								* anInt7688)));
	if (null == class157) {
	    method9595(class182, 1771444000);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7688 * -236732291));
	}
	return class157;
    }
    
    public Class157 method9602(Class182 class182) {
	if (-236732291 * anInt7688 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (-236732291
								* anInt7688)));
	if (null == class157) {
	    method9595(class182, -997686743);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7688 * -236732291));
	}
	return class157;
    }
    
    public Class157 method9603(Class182 class182) {
	if (-236732291 * anInt7688 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (-236732291
								* anInt7688)));
	if (null == class157) {
	    method9595(class182, -1668065535);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7688 * -236732291));
	}
	return class157;
    }
    
    void method9604(RSBuffer class525_sub38, int i) {
	if (1 == i)
	    anInt7685 = class525_sub38.readBigSmart(-2043778683) * -864001639;
	else if (2 == i) {
	    anInt7704 = class525_sub38.method16834(-1994884458) * 1265848097;
	    aBool7677 = true;
	} else if (3 == i)
	    anInt7688 = class525_sub38.readBigSmart(-2043778683) * 1332984021;
	else if (i == 4)
	    anInt7690 = class525_sub38.readBigSmart(-2043778683) * -563675867;
	else if (i == 5)
	    anInt7683 = class525_sub38.readBigSmart(-2043778683) * -782705671;
	else if (6 == i)
	    anInt7691 = class525_sub38.readBigSmart(-2043778683) * 455571343;
	else if (7 == i)
	    anInt7682 = class525_sub38.readSmart((byte) -32) * 140668715;
	else if (8 == i)
	    aString7679 = class525_sub38.method16637(-109763380);
	else if (9 == i)
	    anInt7687 = class525_sub38.readUnsignedShort((byte) 14) * -1375386661;
	else if (i == 10)
	    anInt7693 = class525_sub38.readSmart((byte) -8) * -1972574773;
	else if (11 == i)
	    anInt7694 = 0;
	else if (i == 12)
	    anInt7696 = class525_sub38.readUnsignedByte(1654370745) * 1304269939;
	else if (i == 13)
	    anInt7686 = class525_sub38.readSmart((byte) 7) * 1488578829;
	else if (i == 14)
	    anInt7694 = class525_sub38.readUnsignedShort((byte) 26) * -1749069223;
	else if (i == 16) {
	    anInt7698 = class525_sub38.readSmart((byte) 34) * 664140071;
	    anInt7678 = class525_sub38.readSmart((byte) -77) * -1583330947;
	} else if (i == 17 || i == 18) {
	    anInt7695 = class525_sub38.readUnsignedShort((byte) 91) * 1130416875;
	    if (anInt7695 * -737767997 == 65535)
		anInt7695 = -1130416875;
	    anInt7702 = class525_sub38.readUnsignedShort((byte) 42) * 1377770713;
	    if (anInt7702 * 1098359657 == 65535)
		anInt7702 = -1377770713;
	    int i_17_ = -1;
	    if (18 == i) {
		i_17_ = class525_sub38.readUnsignedShort((byte) 122);
		if (65535 == i_17_)
		    i_17_ = -1;
	    }
	    int i_18_ = class525_sub38.readUnsignedByte(375504951);
	    anIntArray7700 = new int[i_18_ + 2];
	    for (int i_19_ = 0; i_19_ <= i_18_; i_19_++) {
		anIntArray7700[i_19_] = class525_sub38.readUnsignedShort((byte) 59);
		if (65535 == anIntArray7700[i_19_])
		    anIntArray7700[i_19_] = -1;
	    }
	    anIntArray7700[i_18_ + 1] = i_17_;
	} else if (19 == i)
	    anInt7703 = class525_sub38.readUnsignedShort((byte) 95) * -387395611;
	else if (i == 20)
	    anInt7681 = class525_sub38.readUnsignedShort((byte) 14) * -663180113;
    }
    
    public Class157 method9605(Class182 class182) {
	if (-236732291 * anInt7688 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (-236732291
								* anInt7688)));
	if (null == class157) {
	    method9595(class182, -1362602132);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7688 * -236732291));
	}
	return class157;
    }
    
    void method9606(Class182 class182) {
	JS5 class458 = aClass585_7689.aClass458_7724;
	if (-236732291 * anInt7688 >= 0
	    && (aClass585_7689.aClass200_7723.method3785((long) (anInt7688
								 * -236732291))
		== null)
	    && class458.method7506(-236732291 * anInt7688, -1128758444)) {
	    Class173 class173
		= Class187.method3668(class458, anInt7688 * -236732291);
	    aClass585_7689.aClass200_7723.method3788
		(class182.method3216(class173, true),
		 (long) (anInt7688 * -236732291));
	}
	if (anInt7683 * -24578487 >= 0
	    && (aClass585_7689.aClass200_7723.method3785((long) (anInt7683
								 * -24578487))
		== null)
	    && class458.method7506(-24578487 * anInt7683, -30414967)) {
	    Class173 class173
		= Class187.method3668(class458, anInt7683 * -24578487);
	    aClass585_7689.aClass200_7723.method3788
		(class182.method3216(class173, true),
		 (long) (-24578487 * anInt7683));
	}
	if (anInt7690 * -796731731 >= 0
	    && (aClass585_7689.aClass200_7723.method3785((long) (anInt7690
								 * -796731731))
		== null)
	    && class458.method7506(anInt7690 * -796731731, 211834344)) {
	    Class173 class173
		= Class187.method3668(class458, anInt7690 * -796731731);
	    aClass585_7689.aClass200_7723.method3788
		(class182.method3216(class173, true),
		 (long) (-796731731 * anInt7690));
	}
	if (anInt7691 * -1822570641 >= 0
	    && aClass585_7689.aClass200_7723
		   .method3785((long) (anInt7691 * -1822570641)) == null
	    && class458.method7506(anInt7691 * -1822570641, -536554887)) {
	    Class173 class173
		= Class187.method3668(class458, anInt7691 * -1822570641);
	    aClass585_7689.aClass200_7723.method3788
		(class182.method3216(class173, true),
		 (long) (anInt7691 * -1822570641));
	}
    }
    
    public Class157 method9607(Class182 class182) {
	if (anInt7690 * -796731731 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (-796731731
								* anInt7690)));
	if (null == class157) {
	    method9595(class182, -833524505);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7690 * -796731731));
	}
	return class157;
    }
    
    public Class157 method9608(Class182 class182) {
	if (-24578487 * anInt7683 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (anInt7683
								* -24578487)));
	if (class157 == null) {
	    method9595(class182, -1184721788);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7683 * -24578487));
	}
	return class157;
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(875863426);
	    if (0 == i)
		break;
	    method9588(class525_sub38, i, (byte) 5);
	}
    }
    
    Class580(int i, Class585 class585, Interface13 interface13) {
	anInt7687 = -1787785758;
	anInt7688 = -1332984021;
	anInt7683 = 782705671;
	anInt7690 = 563675867;
	anInt7691 = -455571343;
	anInt7682 = 0;
	anInt7693 = 0;
	anInt7694 = 1749069223;
	aString7679 = "";
	anInt7696 = -1304269939;
	anInt7686 = 0;
	anInt7698 = 0;
	anInt7678 = 0;
	anInt7695 = -1130416875;
	anInt7702 = -1377770713;
	anInt7703 = -387395611;
	anInt7681 = -663180113;
	aClass585_7689 = class585;
	anInterface13_7692 = interface13;
    }
    
    public Class157 method9609(Class182 class182) {
	if (anInt7690 * -796731731 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (-796731731
								* anInt7690)));
	if (null == class157) {
	    method9595(class182, -288650558);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7690 * -796731731));
	}
	return class157;
    }
    
    public Class157 method9610(Class182 class182) {
	if (-236732291 * anInt7688 < 0)
	    return null;
	Class157 class157
	    = ((Class157)
	       aClass585_7689.aClass200_7723.method3785((long) (-236732291
								* anInt7688)));
	if (null == class157) {
	    method9595(class182, 1715747977);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (anInt7688 * -236732291));
	}
	return class157;
    }
    
    public Class157 method9611(Class182 class182) {
	if (anInt7691 * -1822570641 < 0)
	    return null;
	Class157 class157
	    = (Class157) aClass585_7689.aClass200_7723
			     .method3785((long) (anInt7691 * -1822570641));
	if (class157 == null) {
	    method9595(class182, -946857182);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (-1822570641 * anInt7691));
	}
	return class157;
    }
    
    public Class157 method9612(Class182 class182) {
	if (anInt7691 * -1822570641 < 0)
	    return null;
	Class157 class157
	    = (Class157) aClass585_7689.aClass200_7723
			     .method3785((long) (anInt7691 * -1822570641));
	if (class157 == null) {
	    method9595(class182, 1873623861);
	    class157
		= (Class157) aClass585_7689.aClass200_7723
				 .method3785((long) (-1822570641 * anInt7691));
	}
	return class157;
    }
    
    static final void method9613(Class683 class683, byte i) {
	int i_20_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_20_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_20_ >> 16];
	JS5.method7570(class259, class245, class683, 361686749);
    }
    
    static final void method9614(Class683 class683, int i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub30_10696,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]),
	     (byte) -8);
	Class650.method10715(-1758466106);
	client.aBool11095 = true;
    }
    
    static final void method9615(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2753
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1152137564);
	class259.aBool2695 = true;
    }
    
    static void method9616(int i, int i_21_, int i_22_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(14, 0L);
	class525_sub16_sub10.method18361((byte) 62);
	class525_sub16_sub10.anInt11817 = i * -1179952119;
	class525_sub16_sub10.anInt11796 = i_21_ * 16878283;
    }
}
