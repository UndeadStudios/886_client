/* Class684 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class684 implements Interface76
{
    public byte aByte8666;
    public static Class684 aClass684_8667;
    public static Class684 aClass684_8668;
    public static Class684 aClass684_8669;
    public static Class684 aClass684_8670;
    public int anInt8671;
    public static final int anInt8672 = 4;
    public static Class684 aClass684_8673 = new Class684(0, (byte) -1);
    
    public int method80() {
	return aByte8666;
    }
    
    Class684(int i, byte i_0_) {
	anInt8671 = i * 295175247;
	aByte8666 = i_0_;
    }
    
    public static Class684[] method11234() {
	return new Class684[] { aClass684_8673, aClass684_8667, aClass684_8668,
				aClass684_8669, aClass684_8670 };
    }
    
    public int method11235(int i) {
	return 1 + aByte8666;
    }
    
    static final void method11236(Class683 class683, int i) {
	Class280.method5162((byte) 24);
    }
    
    static void method11237(Class182 class182, int i, int i_1_, int i_2_,
			    int i_3_, int i_4_, int i_5_, int i_6_,
			    byte i_7_) {
	Class546 class546 = client.aClass507_11137.method8358((byte) 104);
	Interface62 interface62
	    = (Interface62) class546.method8968(i, i_1_, i_2_, (byte) -83);
	if (null != interface62) {
	    ObjectDefinitions class602
		= ((ObjectDefinitions)
		   client.aClass507_11137.method8362((byte) -1)
		       .method76(interface62.method406((byte) 1), 1069664765));
	    int i_8_ = interface62.method413(1685598948) & 0x3;
	    int i_9_ = interface62.method72(-1815455917);
	    if (-1 != class602.anInt7895 * 1280945471)
		Class284.method5220(class182, class602, i_8_, i_3_, i_4_,
				    -789705769);
	    else {
		int i_10_ = i_5_;
		if (1700857535 * class602.anInt7888 > 0)
		    i_10_ = i_6_;
		if (i_9_ == -1214990409 * Class608.aClass608_7981.anInt7995
		    || (-1214990409 * Class608.aClass608_7978.anInt7995
			== i_9_)) {
		    if (i_8_ == 0)
			class182.method3193(i_3_, i_4_, 4, i_10_, -1683473662);
		    else if (1 == i_8_)
			class182.method3192(i_3_, i_4_, 4, i_10_, 223369441);
		    else if (2 == i_8_)
			class182.method3193(3 + i_3_, i_4_, 4, i_10_,
					    -907148709);
		    else if (3 == i_8_)
			class182.method3192(i_3_, 3 + i_4_, 4, i_10_,
					    720567517);
		}
		if (Class608.aClass608_7979.anInt7995 * -1214990409 == i_9_) {
		    if (0 == i_8_)
			class182.method3190(i_3_, i_4_, 1, 1, i_10_,
					    (byte) -1);
		    else if (i_8_ == 1)
			class182.method3190(i_3_ + 3, i_4_, 1, 1, i_10_,
					    (byte) -1);
		    else if (2 == i_8_)
			class182.method3190(3 + i_3_, 3 + i_4_, 1, 1, i_10_,
					    (byte) -1);
		    else if (3 == i_8_)
			class182.method3190(i_3_, i_4_ + 3, 1, 1, i_10_,
					    (byte) -1);
		}
		if (-1214990409 * Class608.aClass608_7978.anInt7995 == i_9_) {
		    if (i_8_ == 0)
			class182.method3192(i_3_, i_4_, 4, i_10_, -1247193922);
		    else if (1 == i_8_)
			class182.method3193(3 + i_3_, i_4_, 4, i_10_,
					    1474665128);
		    else if (i_8_ == 2)
			class182.method3192(i_3_, i_4_ + 3, 4, i_10_,
					    425005787);
		    else if (i_8_ == 3)
			class182.method3193(i_3_, i_4_, 4, i_10_, -1276506864);
		}
	    }
	}
	interface62
	    = (Interface62) class546.method8972(i, i_1_, i_2_,
						client.anInterface63_11091,
						332483378);
	if (null != interface62) {
	    ObjectDefinitions class602
		= ((ObjectDefinitions)
		   client.aClass507_11137.method8362((byte) -1)
		       .method76(interface62.method406((byte) 1), 495179081));
	    int i_11_ = interface62.method413(1522289976) & 0x3;
	    int i_12_ = interface62.method72(-1557870934);
	    if (-1 != 1280945471 * class602.anInt7895)
		Class284.method5220(class182, class602, i_11_, i_3_, i_4_,
				    -493050283);
	    else if (i_12_
		     == Class608.aClass608_7980.anInt7995 * -1214990409) {
		int i_13_ = -1118482;
		if (1700857535 * class602.anInt7888 > 0)
		    i_13_ = -1179648;
		if (0 == i_11_ || i_11_ == 2)
		    class182.method3194(i_3_, i_4_ + 3, 3 + i_3_, i_4_, i_13_,
					-2084785913);
		else
		    class182.method3194(i_3_, i_4_, i_3_ + 3, i_4_ + 3, i_13_,
					-2143860549);
	    }
	}
	interface62
	    = (Interface62) class546.method8974(i, i_1_, i_2_, (byte) 26);
	if (interface62 != null) {
	    ObjectDefinitions class602
		= ((ObjectDefinitions)
		   (client.aClass507_11137.method8362((byte) -1).method76
		    (interface62.method406((byte) 1), -1981109221)));
	    int i_14_ = interface62.method413(1824737591) & 0x3;
	    if (class602.anInt7895 * 1280945471 != -1)
		Class284.method5220(class182, class602, i_14_, i_3_, i_4_,
				    1344760481);
	}
    }
    
    public int method75() {
	return aByte8666;
    }
    
    public static Class684[] method11238() {
	return new Class684[] { aClass684_8673, aClass684_8667, aClass684_8668,
				aClass684_8669, aClass684_8670 };
    }
    
    public int method57() {
	return aByte8666;
    }
    
    static {
	aClass684_8667 = new Class684(1, (byte) 0);
	aClass684_8668 = new Class684(2, (byte) 1);
	aClass684_8669 = new Class684(3, (byte) 2);
	aClass684_8670 = new Class684(4, (byte) 3);
    }
    
    public int method11239() {
	return 1 + aByte8666;
    }
    
    public static Class684[] method11240() {
	return new Class684[] { aClass684_8673, aClass684_8667, aClass684_8668,
				aClass684_8669, aClass684_8670 };
    }
    
    public static Class684[] method11241(int i) {
	return new Class684[] { aClass684_8673, aClass684_8667, aClass684_8668,
				aClass684_8669, aClass684_8670 };
    }
    
    static final void method11242(Class683 class683, int i) {
	int i_15_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_15_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_15_ >> 16];
	Class599.method9864(class259, class245, class683, 1143107914);
    }
    
    static final void method11243(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class332_Sub1.method15674(class259, class683, 1335794993);
    }
    
    static final void method11244(Class259 class259, int i, int i_16_,
				  Class683 class683, int i_17_) {
	if (class259.anIntArray2680 == null) {
	    if (i_16_ > 0) {
		class259.aByteArrayArray2676 = new byte[11][];
		class259.aByteArrayArray2579 = new byte[11][];
		class259.anIntArray2678 = new int[11];
		class259.anIntArray2679 = new int[11];
		class259.anIntArray2680 = new int[11];
	    } else
		return;
	}
	class259.anIntArray2680[i] = i_16_;
	if (i_16_ > 0)
	    class259.aBool2754 = true;
	else {
	    class259.aBool2754 = false;
	    for (int i_18_ = 0; i_18_ < class259.aByteArrayArray2676.length;
		 i_18_++) {
		if (class259.aByteArrayArray2676[i_18_] != null
		    || class259.anIntArray2680[i_18_] > 0) {
		    class259.aBool2754 = true;
		    break;
		}
	    }
	}
    }
    
    static final void method11245(Class683 class683, int i) {
	Class382.method6429(1771493886);
    }
    
    static void method11246(Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1,
			    int i) {
	if (class656_sub1_sub3_sub1 instanceof Class656_Sub1_Sub3_Sub1_Sub2) {
	    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		= (Class656_Sub1_Sub3_Sub1_Sub2) class656_sub1_sub3_sub1;
	    if (class656_sub1_sub3_sub1_sub2.aClass299_12255 != null)
		Class118.method2093(class656_sub1_sub3_sub1_sub2,
				    (class656_sub1_sub3_sub1_sub2.aByte10867
				     != (Class581
					 .aClass656_Sub1_Sub3_Sub1_Sub1_7705
					 .aByte10867)),
				    (byte) -118);
	} else if (class656_sub1_sub3_sub1
		   instanceof Class656_Sub1_Sub3_Sub1_Sub1) {
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= (Class656_Sub1_Sub3_Sub1_Sub1) class656_sub1_sub3_sub1;
	    Class394.method6514(class656_sub1_sub3_sub1_sub1,
				((Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				  .aByte10867)
				 != class656_sub1_sub3_sub1_sub1.aByte10867),
				(byte) -94);
	}
    }
}
