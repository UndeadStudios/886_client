/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;
import java.util.Vector;

public class Class343
{
    int anInt3674;
    Class168_Sub2 aClass168_Sub2_3675;
    Class168_Sub2 aClass168_Sub2_3676;
    Interface35 anInterface35_3677;
    Interface42 anInterface42_3678;
    int anInt3679;
    Interface21 anInterface21_3680;
    Vector aVector3681;
    Interface21 anInterface21_3682;
    Interface21 anInterface21_3683;
    Interface22 anInterface22_3684;
    Interface22 anInterface22_3685;
    int anInt3686;
    int anInt3687;
    Interface42 anInterface42_3688;
    Interface21 anInterface21_3689;
    Class178 aClass178_3690;
    boolean aBool3691;
    Interface42 anInterface42_3692;
    Class337 aClass337_3693;
    Class182_Sub1 aClass182_Sub1_3694;
    int anInt3695 = 0;
    int anInt3696;
    
    void method6000(int i, int i_0_) {
	if (aBool3691) {
	    if (aClass168_Sub2_3675 != null) {
		aClass182_Sub1_3694.method3159(aClass168_Sub2_3675,
					       -1876999470);
		aClass182_Sub1_3694.method3158(aClass168_Sub2_3676,
					       -1166817212);
		aClass168_Sub2_3675.method15596(0, 0, anInt3686, anInt3687, 0,
						0, true,
						anInterface22_3684 != null);
	    }
	    method6028(i, i_0_);
	    aBool3691 = false;
	}
    }
    
    void method6001() {
	if (anInterface35_3677 == null) {
	    anInterface35_3677 = aClass182_Sub1_3694.method14761(false);
	    anInterface35_3677.method225(12, 4);
	    ByteBuffer bytebuffer = aClass182_Sub1_3694.aByteBuffer9271;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    anInterface35_3677.method215(0, bytebuffer.position(),
					 aClass182_Sub1_3694.aLong9160);
	    aClass337_3693
		= (aClass182_Sub1_3694.method14762
		   (new Class378[] { new Class378(Class342.aClass342_3658) }));
	}
    }
    
    void method6002() {
	method6033();
	switch (anInt3679) {
	case 0:
	    aClass178_3690 = Class178.aClass178_1905;
	    break;
	default:
	    throw new RuntimeException();
	case 2:
	    aClass178_3690 = Class178.aClass178_1914;
	    break;
	case 1:
	    aClass178_3690 = Class178.aClass178_1912;
	}
	aClass168_Sub2_3676 = aClass182_Sub1_3694.method3314();
	if (aClass182_Sub1_3694.anInt9294 > 1 && aClass182_Sub1_3694.aBool9303
	    && aClass182_Sub1_3694.aBool9304) {
	    aClass168_Sub2_3675 = aClass182_Sub1_3694.method3314();
	    anInterface21_3689
		= aClass182_Sub1_3694.method3168(anInt3686, anInt3687,
						 Class165.aClass165_1771,
						 aClass178_3690,
						 (aClass182_Sub1_3694
						  .anInt9294));
	    anInterface22_3685
		= aClass182_Sub1_3694.method3164(anInt3686, anInt3687,
						 (aClass182_Sub1_3694
						  .anInt9294));
	}
	anInterface42_3692
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3680 = anInterface42_3692.method322(0);
	anInterface42_3678
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3683 = anInterface42_3678.method322(0);
	anInterface42_3688
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3682 = anInterface42_3688.method322(0);
	anInterface22_3684
	    = aClass182_Sub1_3694.method3163(anInterface42_3688.method1(),
					     anInterface42_3688.method80());
	int i = aVector3681.size();
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    Class347 class347 = (Class347) aVector3681.elementAt(i_1_);
	    class347.method6079(anInt3686, anInt3687);
	}
    }
    
    void method6003() {
	method6033();
	switch (anInt3679) {
	case 0:
	    aClass178_3690 = Class178.aClass178_1905;
	    break;
	default:
	    throw new RuntimeException();
	case 2:
	    aClass178_3690 = Class178.aClass178_1914;
	    break;
	case 1:
	    aClass178_3690 = Class178.aClass178_1912;
	}
	aClass168_Sub2_3676 = aClass182_Sub1_3694.method3314();
	if (aClass182_Sub1_3694.anInt9294 > 1 && aClass182_Sub1_3694.aBool9303
	    && aClass182_Sub1_3694.aBool9304) {
	    aClass168_Sub2_3675 = aClass182_Sub1_3694.method3314();
	    anInterface21_3689
		= aClass182_Sub1_3694.method3168(anInt3686, anInt3687,
						 Class165.aClass165_1771,
						 aClass178_3690,
						 (aClass182_Sub1_3694
						  .anInt9294));
	    anInterface22_3685
		= aClass182_Sub1_3694.method3164(anInt3686, anInt3687,
						 (aClass182_Sub1_3694
						  .anInt9294));
	}
	anInterface42_3692
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3680 = anInterface42_3692.method322(0);
	anInterface42_3678
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3683 = anInterface42_3678.method322(0);
	anInterface42_3688
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3682 = anInterface42_3688.method322(0);
	anInterface22_3684
	    = aClass182_Sub1_3694.method3163(anInterface42_3688.method1(),
					     anInterface42_3688.method80());
	int i = aVector3681.size();
	for (int i_2_ = 0; i_2_ < i; i_2_++) {
	    Class347 class347 = (Class347) aVector3681.elementAt(i_2_);
	    class347.method6079(anInt3686, anInt3687);
	}
    }
    
    boolean method6004(Class347 class347) {
	Vector vector = new Vector();
	boolean bool = false;
	for (int i = 0; i < aVector3681.size(); i++) {
	    if (!bool && class347.method6083() < method6011(i).method6083()) {
		bool = true;
		if (!method6005(vector, vector.size(), class347))
		    return false;
	    }
	    vector.addElement(method6011(i));
	}
	if (!bool && !method6005(vector, vector.size(), class347))
	    return false;
	aVector3681 = vector;
	return true;
    }
    
    boolean method6005(Vector vector, int i, Class347 class347) {
	if (class347.method6075() || class347.method6076()) {
	    vector.insertElementAt(class347, i);
	    class347.method6079(anInt3686, anInt3687);
	    int i_3_ = class347.method6084();
	    if (i_3_ > anInt3679)
		anInt3679 = i_3_;
	    class347.aBool3730 = true;
	    return true;
	}
	return false;
    }
    
    void method6006(int i, int i_4_) {
	aClass182_Sub1_3694.method3186(true);
	aClass182_Sub1_3694.method14774();
	aClass182_Sub1_3694.method14779(0);
	aClass182_Sub1_3694.method14800(1);
	aClass182_Sub1_3694.method3480();
	aClass168_Sub2_3676.method15584(null);
	aClass182_Sub1_3694.method14688(0, 0);
	int i_5_ = aVector3681.size();
	Vector vector = aVector3681;
	for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
	    if (((Class347) aVector3681.elementAt(i_6_)).method6090()) {
		vector = new Vector();
		for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
		    if (!((Class347) aVector3681.elementAt(i_7_)).method6090())
			vector.addElement(aVector3681.elementAt(i_7_));
		}
		i_5_ = vector.size();
		break;
	    }
	}
	anInterface42_3688.method239();
	for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
	    Class347 class347 = (Class347) vector.elementAt(i_8_);
	    int i_9_ = class347.method6082();
	    boolean bool = i_8_ == i_5_ - 1;
	    boolean bool_10_ = false;
	    for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
		if (i_11_ == i_9_ - 1) {
		    if (bool) {
			aClass182_Sub1_3694.method3159(aClass168_Sub2_3676,
						       -1876999470);
			aClass182_Sub1_3694.method3184(anInt3674, anInt3695,
						       anInt3674 + i,
						       anInt3695 + i_4_);
		    } else {
			bool_10_ = true;
			aClass168_Sub2_3676.method15585(0, anInterface21_3682);
		    }
		} else
		    aClass168_Sub2_3676.method15585(0, anInterface21_3683);
		Interface42 interface42 = anInterface42_3692;
		if (i_11_ == 0)
		    interface42 = anInterface42_3688;
		class347.method6080(i_11_, aClass168_Sub2_3676, interface42,
				    anInterface22_3684, anInterface42_3688,
				    bool && i_11_ == i_9_ - 1);
		method6018();
		class347.method6093(i_11_);
		if (bool_10_)
		    anInterface42_3688.method239();
		Interface42 interface42_12_ = anInterface42_3692;
		anInterface42_3692 = anInterface42_3678;
		anInterface42_3678 = interface42_12_;
		Interface21 interface21 = anInterface21_3680;
		anInterface21_3680 = anInterface21_3683;
		anInterface21_3683 = interface21;
	    }
	}
	aClass182_Sub1_3694.method14779(1);
	aClass182_Sub1_3694.method14800(0);
	aClass182_Sub1_3694.method3186(false);
	aClass182_Sub1_3694.method3480();
	Object object = null;
    }
    
    void method6007(Class347 class347) {
	class347.method6078();
	class347.aBool3730 = false;
	aVector3681.removeElement(class347);
    }
    
    boolean method6008() {
	int i = aVector3681.size();
	for (int i_13_ = 0; i_13_ < i; i_13_++) {
	    if (!((Class347) aVector3681.elementAt(i_13_)).method6090())
		return false;
	}
	return true;
    }
    
    boolean method6009(int i, int i_14_, int i_15_, int i_16_) {
	if (aVector3681.isEmpty() || method6008())
	    return true;
	if (anInt3686 != i_15_ || anInt3687 != i_16_
	    || aClass182_Sub1_3694.anInt9294 != anInt3696) {
	    anInt3696 = aClass182_Sub1_3694.anInt9294;
	    anInt3686 = i_15_;
	    anInt3687 = i_16_;
	    method6012();
	    method6003();
	}
	aClass168_Sub2_3676.method15585(0, anInterface21_3682);
	if (anInterface22_3684 != null)
	    aClass168_Sub2_3676.method15584(anInterface22_3684);
	if (aClass168_Sub2_3675 != null) {
	    aClass168_Sub2_3675.method15585(0, anInterface21_3689);
	    aClass168_Sub2_3675.method15584(anInterface22_3685);
	    aClass182_Sub1_3694.method3158(aClass168_Sub2_3675, -1166817212);
	} else
	    aClass182_Sub1_3694.method3158(aClass168_Sub2_3676, -1166817212);
	if (!aClass168_Sub2_3676.method15588()) {
	    aClass182_Sub1_3694.method3159((aClass168_Sub2_3675 != null
					    ? aClass168_Sub2_3675
					    : aClass168_Sub2_3676),
					   -1876999470);
	    return false;
	}
	anInt3674 = i;
	anInt3695 = i_14_;
	aClass182_Sub1_3694.method3188(3, -16777216);
	aClass182_Sub1_3694.method14753(15);
	aClass182_Sub1_3694.method14751(0);
	aBool3691 = true;
	return true;
    }
    
    Class347 method6010(int i) {
	return (Class347) aVector3681.elementAt(i);
    }
    
    Class347 method6011(int i) {
	return (Class347) aVector3681.elementAt(i);
    }
    
    void method6012() {
	if (aClass168_Sub2_3675 != null) {
	    aClass168_Sub2_3675.method127();
	    aClass168_Sub2_3675 = null;
	}
	if (anInterface21_3689 != null) {
	    anInterface21_3689.method127();
	    anInterface21_3689 = null;
	}
	if (anInterface22_3685 != null) {
	    anInterface22_3685.method127();
	    anInterface22_3685 = null;
	}
	if (aClass168_Sub2_3676 != null)
	    aClass168_Sub2_3676.method127();
	if (anInterface21_3680 != null)
	    anInterface21_3680.method127();
	if (anInterface21_3683 != null)
	    anInterface21_3683.method127();
	if (anInterface21_3682 != null)
	    anInterface21_3682.method127();
	if (anInterface42_3692 != null)
	    anInterface42_3692.method127();
	if (anInterface42_3678 != null)
	    anInterface42_3678.method127();
	if (anInterface42_3688 != null)
	    anInterface42_3688.method127();
	if (anInterface22_3684 != null)
	    anInterface22_3684.method127();
	int i = aVector3681.size();
	for (int i_17_ = 0; i_17_ < i; i_17_++) {
	    Class347 class347 = (Class347) aVector3681.elementAt(i_17_);
	    class347.method6078();
	}
    }
    
    boolean method6013(Class347 class347) {
	Vector vector = new Vector();
	boolean bool = false;
	for (int i = 0; i < aVector3681.size(); i++) {
	    if (!bool && class347.method6083() < method6011(i).method6083()) {
		bool = true;
		if (!method6005(vector, vector.size(), class347))
		    return false;
	    }
	    vector.addElement(method6011(i));
	}
	if (!bool && !method6005(vector, vector.size(), class347))
	    return false;
	aVector3681 = vector;
	return true;
    }
    
    void method6014() {
	aClass182_Sub1_3694.method14764(0, anInterface35_3677);
	aClass182_Sub1_3694.method14763(aClass337_3693);
	aClass182_Sub1_3694.method15003(Class373.aClass373_3885, 0, 1);
    }
    
    Class343(Class182_Sub1 class182_sub1, int i, int i_18_) {
	aVector3681 = new Vector();
	anInt3679 = 0;
	anInt3696 = 0;
	aClass182_Sub1_3694 = class182_sub1;
	aClass178_3690 = Class178.aClass178_1905;
	anInt3686 = i;
	anInt3687 = i_18_;
    }
    
    void method6015() {
	method6033();
	switch (anInt3679) {
	case 0:
	    aClass178_3690 = Class178.aClass178_1905;
	    break;
	default:
	    throw new RuntimeException();
	case 2:
	    aClass178_3690 = Class178.aClass178_1914;
	    break;
	case 1:
	    aClass178_3690 = Class178.aClass178_1912;
	}
	aClass168_Sub2_3676 = aClass182_Sub1_3694.method3314();
	if (aClass182_Sub1_3694.anInt9294 > 1 && aClass182_Sub1_3694.aBool9303
	    && aClass182_Sub1_3694.aBool9304) {
	    aClass168_Sub2_3675 = aClass182_Sub1_3694.method3314();
	    anInterface21_3689
		= aClass182_Sub1_3694.method3168(anInt3686, anInt3687,
						 Class165.aClass165_1771,
						 aClass178_3690,
						 (aClass182_Sub1_3694
						  .anInt9294));
	    anInterface22_3685
		= aClass182_Sub1_3694.method3164(anInt3686, anInt3687,
						 (aClass182_Sub1_3694
						  .anInt9294));
	}
	anInterface42_3692
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3680 = anInterface42_3692.method322(0);
	anInterface42_3678
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3683 = anInterface42_3678.method322(0);
	anInterface42_3688
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3682 = anInterface42_3688.method322(0);
	anInterface22_3684
	    = aClass182_Sub1_3694.method3163(anInterface42_3688.method1(),
					     anInterface42_3688.method80());
	int i = aVector3681.size();
	for (int i_19_ = 0; i_19_ < i; i_19_++) {
	    Class347 class347 = (Class347) aVector3681.elementAt(i_19_);
	    class347.method6079(anInt3686, anInt3687);
	}
    }
    
    void method6016() {
	method6033();
	switch (anInt3679) {
	case 0:
	    aClass178_3690 = Class178.aClass178_1905;
	    break;
	default:
	    throw new RuntimeException();
	case 2:
	    aClass178_3690 = Class178.aClass178_1914;
	    break;
	case 1:
	    aClass178_3690 = Class178.aClass178_1912;
	}
	aClass168_Sub2_3676 = aClass182_Sub1_3694.method3314();
	if (aClass182_Sub1_3694.anInt9294 > 1 && aClass182_Sub1_3694.aBool9303
	    && aClass182_Sub1_3694.aBool9304) {
	    aClass168_Sub2_3675 = aClass182_Sub1_3694.method3314();
	    anInterface21_3689
		= aClass182_Sub1_3694.method3168(anInt3686, anInt3687,
						 Class165.aClass165_1771,
						 aClass178_3690,
						 (aClass182_Sub1_3694
						  .anInt9294));
	    anInterface22_3685
		= aClass182_Sub1_3694.method3164(anInt3686, anInt3687,
						 (aClass182_Sub1_3694
						  .anInt9294));
	}
	anInterface42_3692
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3680 = anInterface42_3692.method322(0);
	anInterface42_3678
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3683 = anInterface42_3678.method322(0);
	anInterface42_3688
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3682 = anInterface42_3688.method322(0);
	anInterface22_3684
	    = aClass182_Sub1_3694.method3163(anInterface42_3688.method1(),
					     anInterface42_3688.method80());
	int i = aVector3681.size();
	for (int i_20_ = 0; i_20_ < i; i_20_++) {
	    Class347 class347 = (Class347) aVector3681.elementAt(i_20_);
	    class347.method6079(anInt3686, anInt3687);
	}
    }
    
    void method6017() {
	method6033();
	switch (anInt3679) {
	case 0:
	    aClass178_3690 = Class178.aClass178_1905;
	    break;
	default:
	    throw new RuntimeException();
	case 2:
	    aClass178_3690 = Class178.aClass178_1914;
	    break;
	case 1:
	    aClass178_3690 = Class178.aClass178_1912;
	}
	aClass168_Sub2_3676 = aClass182_Sub1_3694.method3314();
	if (aClass182_Sub1_3694.anInt9294 > 1 && aClass182_Sub1_3694.aBool9303
	    && aClass182_Sub1_3694.aBool9304) {
	    aClass168_Sub2_3675 = aClass182_Sub1_3694.method3314();
	    anInterface21_3689
		= aClass182_Sub1_3694.method3168(anInt3686, anInt3687,
						 Class165.aClass165_1771,
						 aClass178_3690,
						 (aClass182_Sub1_3694
						  .anInt9294));
	    anInterface22_3685
		= aClass182_Sub1_3694.method3164(anInt3686, anInt3687,
						 (aClass182_Sub1_3694
						  .anInt9294));
	}
	anInterface42_3692
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3680 = anInterface42_3692.method322(0);
	anInterface42_3678
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3683 = anInterface42_3678.method322(0);
	anInterface42_3688
	    = aClass182_Sub1_3694.method14728(Class165.aClass165_1771,
					      aClass178_3690, anInt3686,
					      anInt3687);
	anInterface21_3682 = anInterface42_3688.method322(0);
	anInterface22_3684
	    = aClass182_Sub1_3694.method3163(anInterface42_3688.method1(),
					     anInterface42_3688.method80());
	int i = aVector3681.size();
	for (int i_21_ = 0; i_21_ < i; i_21_++) {
	    Class347 class347 = (Class347) aVector3681.elementAt(i_21_);
	    class347.method6079(anInt3686, anInt3687);
	}
    }
    
    void method6018() {
	aClass182_Sub1_3694.method14764(0, anInterface35_3677);
	aClass182_Sub1_3694.method14763(aClass337_3693);
	aClass182_Sub1_3694.method15003(Class373.aClass373_3885, 0, 1);
    }
    
    boolean method6019(int i, int i_22_, int i_23_, int i_24_) {
	if (aVector3681.isEmpty() || method6008())
	    return true;
	if (anInt3686 != i_23_ || anInt3687 != i_24_
	    || aClass182_Sub1_3694.anInt9294 != anInt3696) {
	    anInt3696 = aClass182_Sub1_3694.anInt9294;
	    anInt3686 = i_23_;
	    anInt3687 = i_24_;
	    method6012();
	    method6003();
	}
	aClass168_Sub2_3676.method15585(0, anInterface21_3682);
	if (anInterface22_3684 != null)
	    aClass168_Sub2_3676.method15584(anInterface22_3684);
	if (aClass168_Sub2_3675 != null) {
	    aClass168_Sub2_3675.method15585(0, anInterface21_3689);
	    aClass168_Sub2_3675.method15584(anInterface22_3685);
	    aClass182_Sub1_3694.method3158(aClass168_Sub2_3675, -1166817212);
	} else
	    aClass182_Sub1_3694.method3158(aClass168_Sub2_3676, -1166817212);
	if (!aClass168_Sub2_3676.method15588()) {
	    aClass182_Sub1_3694.method3159((aClass168_Sub2_3675 != null
					    ? aClass168_Sub2_3675
					    : aClass168_Sub2_3676),
					   -1876999470);
	    return false;
	}
	anInt3674 = i;
	anInt3695 = i_22_;
	aClass182_Sub1_3694.method3188(3, -16777216);
	aClass182_Sub1_3694.method14753(15);
	aClass182_Sub1_3694.method14751(0);
	aBool3691 = true;
	return true;
    }
    
    boolean method6020(Vector vector, int i, Class347 class347) {
	if (class347.method6075() || class347.method6076()) {
	    vector.insertElementAt(class347, i);
	    class347.method6079(anInt3686, anInt3687);
	    int i_25_ = class347.method6084();
	    if (i_25_ > anInt3679)
		anInt3679 = i_25_;
	    class347.aBool3730 = true;
	    return true;
	}
	return false;
    }
    
    void method6021(Class347 class347) {
	class347.method6078();
	class347.aBool3730 = false;
	aVector3681.removeElement(class347);
    }
    
    void method6022(Class347 class347) {
	class347.method6078();
	class347.aBool3730 = false;
	aVector3681.removeElement(class347);
    }
    
    void method6023(Class347 class347) {
	class347.method6078();
	class347.aBool3730 = false;
	aVector3681.removeElement(class347);
    }
    
    void method6024(Class347 class347) {
	class347.method6078();
	class347.aBool3730 = false;
	aVector3681.removeElement(class347);
    }
    
    void method6025(Class347 class347) {
	class347.method6078();
	class347.aBool3730 = false;
	aVector3681.removeElement(class347);
    }
    
    void method6026(Class347 class347) {
	class347.method6078();
	class347.aBool3730 = false;
	aVector3681.removeElement(class347);
    }
    
    void method6027(Class347 class347) {
	class347.method6078();
	class347.aBool3730 = false;
	aVector3681.removeElement(class347);
    }
    
    void method6028(int i, int i_26_) {
	aClass182_Sub1_3694.method3186(true);
	aClass182_Sub1_3694.method14774();
	aClass182_Sub1_3694.method14779(0);
	aClass182_Sub1_3694.method14800(1);
	aClass182_Sub1_3694.method3480();
	aClass168_Sub2_3676.method15584(null);
	aClass182_Sub1_3694.method14688(0, 0);
	int i_27_ = aVector3681.size();
	Vector vector = aVector3681;
	for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
	    if (((Class347) aVector3681.elementAt(i_28_)).method6090()) {
		vector = new Vector();
		for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
		    if (!((Class347) aVector3681.elementAt(i_29_))
			     .method6090())
			vector.addElement(aVector3681.elementAt(i_29_));
		}
		i_27_ = vector.size();
		break;
	    }
	}
	anInterface42_3688.method239();
	for (int i_30_ = 0; i_30_ < i_27_; i_30_++) {
	    Class347 class347 = (Class347) vector.elementAt(i_30_);
	    int i_31_ = class347.method6082();
	    boolean bool = i_30_ == i_27_ - 1;
	    boolean bool_32_ = false;
	    for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
		if (i_33_ == i_31_ - 1) {
		    if (bool) {
			aClass182_Sub1_3694.method3159(aClass168_Sub2_3676,
						       -1876999470);
			aClass182_Sub1_3694.method3184(anInt3674, anInt3695,
						       anInt3674 + i,
						       anInt3695 + i_26_);
		    } else {
			bool_32_ = true;
			aClass168_Sub2_3676.method15585(0, anInterface21_3682);
		    }
		} else
		    aClass168_Sub2_3676.method15585(0, anInterface21_3683);
		Interface42 interface42 = anInterface42_3692;
		if (i_33_ == 0)
		    interface42 = anInterface42_3688;
		class347.method6080(i_33_, aClass168_Sub2_3676, interface42,
				    anInterface22_3684, anInterface42_3688,
				    bool && i_33_ == i_31_ - 1);
		method6018();
		class347.method6093(i_33_);
		if (bool_32_)
		    anInterface42_3688.method239();
		Interface42 interface42_34_ = anInterface42_3692;
		anInterface42_3692 = anInterface42_3678;
		anInterface42_3678 = interface42_34_;
		Interface21 interface21 = anInterface21_3680;
		anInterface21_3680 = anInterface21_3683;
		anInterface21_3683 = interface21;
	    }
	}
	aClass182_Sub1_3694.method14779(1);
	aClass182_Sub1_3694.method14800(0);
	aClass182_Sub1_3694.method3186(false);
	aClass182_Sub1_3694.method3480();
	Object object = null;
    }
    
    boolean method6029() {
	int i = aVector3681.size();
	for (int i_35_ = 0; i_35_ < i; i_35_++) {
	    if (!((Class347) aVector3681.elementAt(i_35_)).method6090())
		return false;
	}
	return true;
    }
    
    boolean method6030(Vector vector, int i, Class347 class347) {
	if (class347.method6075() || class347.method6076()) {
	    vector.insertElementAt(class347, i);
	    class347.method6079(anInt3686, anInt3687);
	    int i_36_ = class347.method6084();
	    if (i_36_ > anInt3679)
		anInt3679 = i_36_;
	    class347.aBool3730 = true;
	    return true;
	}
	return false;
    }
    
    void method6031(int i, int i_37_) {
	if (aBool3691) {
	    if (aClass168_Sub2_3675 != null) {
		aClass182_Sub1_3694.method3159(aClass168_Sub2_3675,
					       -1876999470);
		aClass182_Sub1_3694.method3158(aClass168_Sub2_3676,
					       -1166817212);
		aClass168_Sub2_3675.method15596(0, 0, anInt3686, anInt3687, 0,
						0, true,
						anInterface22_3684 != null);
	    }
	    method6028(i, i_37_);
	    aBool3691 = false;
	}
    }
    
    void method6032(int i, int i_38_) {
	aClass182_Sub1_3694.method3186(true);
	aClass182_Sub1_3694.method14774();
	aClass182_Sub1_3694.method14779(0);
	aClass182_Sub1_3694.method14800(1);
	aClass182_Sub1_3694.method3480();
	aClass168_Sub2_3676.method15584(null);
	aClass182_Sub1_3694.method14688(0, 0);
	int i_39_ = aVector3681.size();
	Vector vector = aVector3681;
	for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
	    if (((Class347) aVector3681.elementAt(i_40_)).method6090()) {
		vector = new Vector();
		for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
		    if (!((Class347) aVector3681.elementAt(i_41_))
			     .method6090())
			vector.addElement(aVector3681.elementAt(i_41_));
		}
		i_39_ = vector.size();
		break;
	    }
	}
	anInterface42_3688.method239();
	for (int i_42_ = 0; i_42_ < i_39_; i_42_++) {
	    Class347 class347 = (Class347) vector.elementAt(i_42_);
	    int i_43_ = class347.method6082();
	    boolean bool = i_42_ == i_39_ - 1;
	    boolean bool_44_ = false;
	    for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
		if (i_45_ == i_43_ - 1) {
		    if (bool) {
			aClass182_Sub1_3694.method3159(aClass168_Sub2_3676,
						       -1876999470);
			aClass182_Sub1_3694.method3184(anInt3674, anInt3695,
						       anInt3674 + i,
						       anInt3695 + i_38_);
		    } else {
			bool_44_ = true;
			aClass168_Sub2_3676.method15585(0, anInterface21_3682);
		    }
		} else
		    aClass168_Sub2_3676.method15585(0, anInterface21_3683);
		Interface42 interface42 = anInterface42_3692;
		if (i_45_ == 0)
		    interface42 = anInterface42_3688;
		class347.method6080(i_45_, aClass168_Sub2_3676, interface42,
				    anInterface22_3684, anInterface42_3688,
				    bool && i_45_ == i_43_ - 1);
		method6018();
		class347.method6093(i_45_);
		if (bool_44_)
		    anInterface42_3688.method239();
		Interface42 interface42_46_ = anInterface42_3692;
		anInterface42_3692 = anInterface42_3678;
		anInterface42_3678 = interface42_46_;
		Interface21 interface21 = anInterface21_3680;
		anInterface21_3680 = anInterface21_3683;
		anInterface21_3683 = interface21;
	    }
	}
	aClass182_Sub1_3694.method14779(1);
	aClass182_Sub1_3694.method14800(0);
	aClass182_Sub1_3694.method3186(false);
	aClass182_Sub1_3694.method3480();
	Object object = null;
    }
    
    void method6033() {
	if (anInterface35_3677 == null) {
	    anInterface35_3677 = aClass182_Sub1_3694.method14761(false);
	    anInterface35_3677.method225(12, 4);
	    ByteBuffer bytebuffer = aClass182_Sub1_3694.aByteBuffer9271;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    anInterface35_3677.method215(0, bytebuffer.position(),
					 aClass182_Sub1_3694.aLong9160);
	    aClass337_3693
		= (aClass182_Sub1_3694.method14762
		   (new Class378[] { new Class378(Class342.aClass342_3658) }));
	}
    }
    
    void method6034(int i, int i_47_) {
	aClass182_Sub1_3694.method3186(true);
	aClass182_Sub1_3694.method14774();
	aClass182_Sub1_3694.method14779(0);
	aClass182_Sub1_3694.method14800(1);
	aClass182_Sub1_3694.method3480();
	aClass168_Sub2_3676.method15584(null);
	aClass182_Sub1_3694.method14688(0, 0);
	int i_48_ = aVector3681.size();
	Vector vector = aVector3681;
	for (int i_49_ = 0; i_49_ < i_48_; i_49_++) {
	    if (((Class347) aVector3681.elementAt(i_49_)).method6090()) {
		vector = new Vector();
		for (int i_50_ = 0; i_50_ < i_48_; i_50_++) {
		    if (!((Class347) aVector3681.elementAt(i_50_))
			     .method6090())
			vector.addElement(aVector3681.elementAt(i_50_));
		}
		i_48_ = vector.size();
		break;
	    }
	}
	anInterface42_3688.method239();
	for (int i_51_ = 0; i_51_ < i_48_; i_51_++) {
	    Class347 class347 = (Class347) vector.elementAt(i_51_);
	    int i_52_ = class347.method6082();
	    boolean bool = i_51_ == i_48_ - 1;
	    boolean bool_53_ = false;
	    for (int i_54_ = 0; i_54_ < i_52_; i_54_++) {
		if (i_54_ == i_52_ - 1) {
		    if (bool) {
			aClass182_Sub1_3694.method3159(aClass168_Sub2_3676,
						       -1876999470);
			aClass182_Sub1_3694.method3184(anInt3674, anInt3695,
						       anInt3674 + i,
						       anInt3695 + i_47_);
		    } else {
			bool_53_ = true;
			aClass168_Sub2_3676.method15585(0, anInterface21_3682);
		    }
		} else
		    aClass168_Sub2_3676.method15585(0, anInterface21_3683);
		Interface42 interface42 = anInterface42_3692;
		if (i_54_ == 0)
		    interface42 = anInterface42_3688;
		class347.method6080(i_54_, aClass168_Sub2_3676, interface42,
				    anInterface22_3684, anInterface42_3688,
				    bool && i_54_ == i_52_ - 1);
		method6018();
		class347.method6093(i_54_);
		if (bool_53_)
		    anInterface42_3688.method239();
		Interface42 interface42_55_ = anInterface42_3692;
		anInterface42_3692 = anInterface42_3678;
		anInterface42_3678 = interface42_55_;
		Interface21 interface21 = anInterface21_3680;
		anInterface21_3680 = anInterface21_3683;
		anInterface21_3683 = interface21;
	    }
	}
	aClass182_Sub1_3694.method14779(1);
	aClass182_Sub1_3694.method14800(0);
	aClass182_Sub1_3694.method3186(false);
	aClass182_Sub1_3694.method3480();
	Object object = null;
    }
}
