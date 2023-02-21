/* Class590 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class590 implements Interface76
{
    static Class590 aClass590_7811 = new Class590(0);
    public static Class590 aClass590_7812 = new Class590(1);
    int anInt7813;
    public static Class157 aClass157_7814;
    
    public int method57() {
	return -104801673 * anInt7813;
    }
    
    public int method80() {
	return -104801673 * anInt7813;
    }
    
    Class590(int i) {
	anInt7813 = -1138155705 * i;
    }
    
    public int method75() {
	return -104801673 * anInt7813;
    }
    
    static Class590[] method9787() {
	return new Class590[] { aClass590_7811, aClass590_7812 };
    }
    
    static Class590[] method9788() {
	return new Class590[] { aClass590_7811, aClass590_7812 };
    }
    
    static Class590[] method9789() {
	return new Class590[] { aClass590_7811, aClass590_7812 };
    }
    
    static Class590[] method9790() {
	return new Class590[] { aClass590_7811, aClass590_7812 };
    }
    
    static final void method9791(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class683.method11228(class259, class245, class683, 84499772);
    }
    
    static final void method9792(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static void method9793(int i, int i_0_, int i_1_, int i_2_,
				  int i_3_, int i_4_, int i_5_, int i_6_,
				  int i_7_) {
	if (i_0_ >= 0 && i_1_ >= 0
	    && i_0_ < client.aClass507_11137.method8412(87790448) - 1
	    && i_1_ < client.aClass507_11137.method8352((byte) -84) - 1) {
	    if (client.aClass507_11137.method8358((byte) 18) != null) {
		if (0 == i_2_) {
		    Interface62 interface62
			= ((Interface62)
			   client.aClass507_11137.method8358((byte) 27)
			       .method8968(i, i_0_, i_1_, (byte) -128));
		    Interface62 interface62_8_
			= ((Interface62)
			   client.aClass507_11137.method8358((byte) 27)
			       .method9091(i, i_0_, i_1_, (byte) 97));
		    if (null != interface62 && 2 != i_3_) {
			if (interface62 instanceof Class656_Sub1_Sub5_Sub1)
			    ((Class656_Sub1_Sub5_Sub1) interface62)
				.aClass532_12065
				.method8804(i_5_, i_6_, (short) 759);
			else
			    Class442.method7125(i, i_2_, i_0_, i_1_,
						interface62
						    .method406((byte) 1),
						i_4_, i_3_, i_5_, i_6_,
						1164167591);
		    }
		    if (null != interface62_8_) {
			if (interface62_8_ instanceof Class656_Sub1_Sub5_Sub1)
			    ((Class656_Sub1_Sub5_Sub1) interface62_8_)
				.aClass532_12065
				.method8804(i_5_, i_6_, (short) 759);
			else
			    Class442.method7125(i, i_2_, i_0_, i_1_,
						interface62_8_
						    .method406((byte) 1),
						i_4_, i_3_, i_5_, i_6_,
						1164167591);
		    }
		} else if (i_2_ == 1) {
		    Interface62 interface62
			= ((Interface62)
			   client.aClass507_11137.method8358((byte) 118)
			       .method8970(i, i_0_, i_1_, (byte) 1));
		    if (null != interface62) {
			if (interface62 instanceof Class656_Sub1_Sub4_Sub1)
			    ((Class656_Sub1_Sub4_Sub1) interface62)
				.aClass532_12070
				.method8804(i_5_, i_6_, (short) 759);
			else {
			    int i_9_ = interface62.method406((byte) 1);
			    if (4 == i_3_ || i_3_ == 5)
				Class442.method7125(i, i_2_, i_0_, i_1_, i_9_,
						    i_4_, 4, i_5_, i_6_,
						    1164167591);
			    else if (6 == i_3_)
				Class442.method7125(i, i_2_, i_0_, i_1_, i_9_,
						    4 + i_4_, 4, i_5_, i_6_,
						    1164167591);
			    else if (7 == i_3_)
				Class442.method7125(i, i_2_, i_0_, i_1_, i_9_,
						    (i_4_ + 2 & 0x3) + 4, 4,
						    i_5_, i_6_, 1164167591);
			    else if (i_3_ == 8) {
				Class442.method7125(i, i_2_, i_0_, i_1_, i_9_,
						    i_4_ + 4, 4, i_5_, i_6_,
						    1164167591);
				Class442.method7125(i, i_2_, i_0_, i_1_, i_9_,
						    (2 + i_4_ & 0x3) + 4, 4,
						    i_5_, i_6_, 1164167591);
			    }
			}
		    }
		} else if (2 == i_2_) {
		    Interface62 interface62
			= ((Interface62)
			   (client.aClass507_11137.method8358((byte) 103)
				.method8972
			    (i, i_0_, i_1_, client.anInterface63_11091,
			     332483378)));
		    if (null != interface62) {
			if (11 == i_3_)
			    i_3_ = 10;
			if (interface62 instanceof Class656_Sub1_Sub3_Sub3)
			    ((Class656_Sub1_Sub3_Sub3) interface62)
				.aClass532_12043
				.method8804(i_5_, i_6_, (short) 759);
			else
			    Class442.method7125(i, i_2_, i_0_, i_1_,
						interface62
						    .method406((byte) 1),
						i_4_, i_3_, i_5_, i_6_,
						1164167591);
		    }
		} else if (i_2_ == 3) {
		    Interface62 interface62
			= ((Interface62)
			   client.aClass507_11137.method8358((byte) 89)
			       .method8974(i, i_0_, i_1_, (byte) -26));
		    if (interface62 != null) {
			if (interface62 instanceof Class656_Sub1_Sub1_Sub2)
			    ((Class656_Sub1_Sub1_Sub2) interface62)
				.aClass532_12061
				.method8804(i_5_, i_6_, (short) 759);
			else
			    Class442.method7125(i, i_2_, i_0_, i_1_,
						interface62
						    .method406((byte) 1),
						i_4_, i_3_, i_5_, i_6_,
						1164167591);
		    }
		}
	    }
	}
    }
    
    static final void method9794(Class683 class683, int i) {
	int i_10_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class215.aClass58_2283.method1220(i_10_, 797864)
		  .method18425(-1462491371);
    }
}
