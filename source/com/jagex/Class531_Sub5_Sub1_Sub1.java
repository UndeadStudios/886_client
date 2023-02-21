/* Class531_Sub5_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class531_Sub5_Sub1_Sub1 extends Class531_Sub5_Sub1
{
    Class625 aClass625_12112;
    short aShort12113;
    short aShort12114;
    short aShort12115;
    int anInt12116;
    int anInt12117;
    short aShort12118;
    short aShort12119;
    short aShort12120;
    short aShort12121;
    
    void method18772(Class625 class625, int i, int i_0_, int i_1_, int i_2_,
		     int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
		     int i_8_, int i_9_, int i_10_, int i_11_, boolean bool,
		     boolean bool_12_) {
	aClass625_12112 = class625;
	anInt11731 = i << 12;
	anInt11729 = i_0_ << 12;
	anInt11730 = i_1_ << 12;
	anInt11737 = i_7_;
	aShort12114 = aShort12115 = (short) i_6_;
	anInt11734 = i_8_;
	aShort11736 = (short) i_9_;
	aShort12118 = (short) i_10_;
	anInt11735 = i_11_;
	aBool11728 = bool_12_;
	aShort12120 = (short) i_2_;
	aShort12119 = (short) i_3_;
	aShort12121 = (short) i_4_;
	anInt12117 = i_5_;
	method18777();
    }
    
    void method18773(Class625 class625, int i, int i_13_, int i_14_, int i_15_,
		     int i_16_, int i_17_, int i_18_, int i_19_, int i_20_,
		     int i_21_, int i_22_, int i_23_, int i_24_, boolean bool,
		     boolean bool_25_) {
	aClass625_12112 = class625;
	anInt11731 = i << 12;
	anInt11729 = i_13_ << 12;
	anInt11730 = i_14_ << 12;
	anInt11737 = i_20_;
	aShort12114 = aShort12115 = (short) i_19_;
	anInt11734 = i_21_;
	aShort11736 = (short) i_22_;
	aShort12118 = (short) i_23_;
	anInt11735 = i_24_;
	aBool11728 = bool_25_;
	aShort12120 = (short) i_15_;
	aShort12119 = (short) i_16_;
	aShort12121 = (short) i_17_;
	anInt12117 = i_18_;
	method18777();
    }
    
    void method18774(Class546 class546, Class182 class182, long l) {
	int i = anInt11731 >> 12 + class546.anInt7200 * 1819515263;
	int i_26_ = anInt11730 >> 12 + class546.anInt7200 * 1819515263;
	int i_27_ = anInt11729 >> 12;
	if (i_27_ > 262144 || i_27_ < -262144 || i < 0
	    || i >= class546.anInt7210 * 1761949661 || i_26_ < 0
	    || i_26_ >= class546.anInt7211 * 947301287)
	    method18784();
	else {
	    Class633 class633 = aClass625_12112.aClass633_8132;
	    Class382 class382 = aClass625_12112.aClass382_8131;
	    Class161[] class161s = class546.aClass161Array7226;
	    int i_28_ = class633.anInt8233;
	    Class547 class547 = (class546.aClass547ArrayArrayArray7263
				 [class633.anInt8233][i][i_26_]);
	    if (class547 != null)
		i_28_ = class547.aByte7271;
	    int i_29_ = class161s[i_28_].method2577(i, i_26_, (byte) -21);
	    int i_30_;
	    if (i_28_ < class546.anInt7241 * 230317859 - 1)
		i_30_ = class161s[i_28_ + 1].method2577(i, i_26_, (byte) -70);
	    else
		i_30_ = i_29_ - (8 << class546.anInt7200 * 1819515263);
	    if (class382.aBool3984) {
		if (class382.anInt3964 * -423321511 == -1 && i_27_ > i_29_) {
		    method18784();
		    return;
		}
		if (class382.anInt3964 * -423321511 >= 0
		    && i_27_ > class161s[class382.anInt3964 * -423321511]
				   .method2577(i, i_26_, (byte) -62)) {
		    method18784();
		    return;
		}
		if (class382.anInt3931 * -993233351 == -1 && i_27_ < i_30_) {
		    method18784();
		    return;
		}
		if (class382.anInt3931 * -993233351 >= 0
		    && i_27_ < class161s
				   [class382.anInt3931 * -993233351 + 1]
				   .method2577(i, i_26_, (byte) 90)) {
		    method18784();
		    return;
		}
	    }
	    int i_31_;
	    for (i_31_ = class546.anInt7241 * 230317859 - 1;
		 i_31_ > 0 && i_27_ > class161s[i_31_].method2577(i, i_26_,
								  (byte) -25);
		 i_31_--) {
		/* empty */
	    }
	    if (class382.aBool3982 && i_31_ == 0
		&& i_27_ > class161s[0].method2577(i, i_26_, (byte) 96))
		method18784();
	    else if (i_31_ == class546.anInt7241 * 230317859 - 1
		     && (class161s[i_31_].method2577(i, i_26_, (byte) 1)
			 - i_27_) > 8 << class546.anInt7200 * 1819515263)
		method18784();
	    else {
		class547
		    = class546.aClass547ArrayArrayArray7263[i_31_][i][i_26_];
		if (class547 == null) {
		    if (i_31_ == 0
			|| (class546.aClass547ArrayArrayArray7263[0][i][i_26_]
			    == null))
			class547 = class546.aClass547ArrayArrayArray7263[0]
				       [i][i_26_] = new Class547(0);
		    boolean bool = ((class546.aClass547ArrayArrayArray7263[0]
				     [i][i_26_].aClass547_7269)
				    != null);
		    if (i_31_ == 3 && bool)
			i_31_--;
		    for (int i_32_ = 1; i_32_ <= i_31_; i_32_++) {
			if ((class546.aClass547ArrayArrayArray7263[i_32_][i]
			     [i_26_])
			    == null) {
			    class547
				= class546.aClass547ArrayArrayArray7263
				      [i_32_][i][i_26_]
				= new Class547(i_32_);
			    if (bool)
				class547.aByte7271++;
			}
		    }
		    if (class547 == null)
			class547 = (class546.aClass547ArrayArrayArray7263
				    [i_31_][i][i_26_]);
		}
		if (class382.aBool3981) {
		    int i_33_ = anInt11731 >> 12;
		    int i_34_ = anInt11730 >> 12;
		    if (class547.aClass656_Sub1_Sub5_7266 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub5_7266
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_33_, i_27_, i_34_)) {
			    method18784();
			    return;
			}
		    }
		    if (class547.aClass656_Sub1_Sub5_7267 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub5_7267
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_33_, i_27_, i_34_)) {
			    method18784();
			    return;
			}
		    }
		    if (class547.aClass656_Sub1_Sub1_7264 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub1_7264
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_33_, i_27_, i_34_)) {
			    method18784();
			    return;
			}
		    }
		    for (Class560 class560 = class547.aClass560_7272;
			 class560 != null;
			 class560 = class560.aClass560_7546) {
			Class553 class553
			    = class560.aClass656_Sub1_Sub3_7547
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_33_, i_27_, i_34_)) {
			    method18784();
			    return;
			}
		    }
		}
		class633.aClass185_8231.aClass698_2081.method14208(this,
								   (byte) 4);
	    }
	}
    }
    
    void method18775() {
	int i = aClass625_12112.aClass633_8132.anInt8228;
	if (aClass625_12112.aClass633_8132.aClass531_Sub5_Sub1_Sub1Array8223[i]
	    != null)
	    aClass625_12112.aClass633_8132
		.aClass531_Sub5_Sub1_Sub1Array8223[i].method18784();
	aClass625_12112.aClass633_8132.aClass531_Sub5_Sub1_Sub1Array8223[i]
	    = this;
	aShort12113 = (short) aClass625_12112.aClass633_8132.anInt8228;
	aClass625_12112.aClass633_8132.anInt8228 = i + 1 & 0x1fff;
	aClass625_12112.aClass708_8134.method14331(this, (short) -3284);
    }
    
    void method18776() {
	aClass625_12112.aClass633_8132.aClass531_Sub5_Sub1_Sub1Array8223
	    [aShort12113]
	    = null;
	Class261.aClass531_Sub5_Sub1_Sub1Array2790[(Class616.anInt8048
						    * -1916807703)]
	    = this;
	Class616.anInt8048
	    = (Class616.anInt8048 * -1916807703 + 1 & 0x3ff) * -147172775;
	method8794(-128515538);
	method15991(1210507009);
    }
    
    Class531_Sub5_Sub1_Sub1
	(Class625 class625, int i, int i_35_, int i_36_, int i_37_, int i_38_,
	 int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_,
	 int i_45_, int i_46_, boolean bool, boolean bool_47_) {
	aClass625_12112 = class625;
	anInt11731 = i << 12;
	anInt11729 = i_35_ << 12;
	anInt11730 = i_36_ << 12;
	anInt11737 = i_42_;
	aShort12114 = aShort12115 = (short) i_41_;
	anInt11734 = i_43_;
	aShort11736 = (short) i_44_;
	aShort12118 = (short) i_45_;
	anInt11735 = i_46_;
	aBool11728 = bool_47_;
	aShort12120 = (short) i_37_;
	aShort12119 = (short) i_38_;
	aShort12121 = (short) i_39_;
	anInt12117 = i_40_;
	method18777();
    }
    
    void method18777() {
	int i = aClass625_12112.aClass633_8132.anInt8228;
	if (aClass625_12112.aClass633_8132.aClass531_Sub5_Sub1_Sub1Array8223[i]
	    != null)
	    aClass625_12112.aClass633_8132
		.aClass531_Sub5_Sub1_Sub1Array8223[i].method18784();
	aClass625_12112.aClass633_8132.aClass531_Sub5_Sub1_Sub1Array8223[i]
	    = this;
	aShort12113 = (short) aClass625_12112.aClass633_8132.anInt8228;
	aClass625_12112.aClass633_8132.anInt8228 = i + 1 & 0x1fff;
	aClass625_12112.aClass708_8134.method14331(this, (short) -4686);
    }
    
    void method18778() {
	aClass625_12112.aClass633_8132.aClass531_Sub5_Sub1_Sub1Array8223
	    [aShort12113]
	    = null;
	Class261.aClass531_Sub5_Sub1_Sub1Array2790[(Class616.anInt8048
						    * -1916807703)]
	    = this;
	Class616.anInt8048
	    = (Class616.anInt8048 * -1916807703 + 1 & 0x3ff) * -147172775;
	method8794(531391936);
	method15991(-977803057);
    }
    
    void method18779() {
	int i = aClass625_12112.aClass633_8132.anInt8228;
	if (aClass625_12112.aClass633_8132.aClass531_Sub5_Sub1_Sub1Array8223[i]
	    != null)
	    aClass625_12112.aClass633_8132
		.aClass531_Sub5_Sub1_Sub1Array8223[i].method18784();
	aClass625_12112.aClass633_8132.aClass531_Sub5_Sub1_Sub1Array8223[i]
	    = this;
	aShort12113 = (short) aClass625_12112.aClass633_8132.anInt8228;
	aClass625_12112.aClass633_8132.anInt8228 = i + 1 & 0x1fff;
	aClass625_12112.aClass708_8134.method14331(this, (short) -8488);
    }
    
    void method18780(Class546 class546, Class182 class182, long l) {
	int i = anInt11731 >> 12 + class546.anInt7200 * 1819515263;
	int i_48_ = anInt11730 >> 12 + class546.anInt7200 * 1819515263;
	int i_49_ = anInt11729 >> 12;
	if (i_49_ > 262144 || i_49_ < -262144 || i < 0
	    || i >= class546.anInt7210 * 1761949661 || i_48_ < 0
	    || i_48_ >= class546.anInt7211 * 947301287)
	    method18784();
	else {
	    Class633 class633 = aClass625_12112.aClass633_8132;
	    Class382 class382 = aClass625_12112.aClass382_8131;
	    Class161[] class161s = class546.aClass161Array7226;
	    int i_50_ = class633.anInt8233;
	    Class547 class547 = (class546.aClass547ArrayArrayArray7263
				 [class633.anInt8233][i][i_48_]);
	    if (class547 != null)
		i_50_ = class547.aByte7271;
	    int i_51_ = class161s[i_50_].method2577(i, i_48_, (byte) -15);
	    int i_52_;
	    if (i_50_ < class546.anInt7241 * 230317859 - 1)
		i_52_ = class161s[i_50_ + 1].method2577(i, i_48_, (byte) 57);
	    else
		i_52_ = i_51_ - (8 << class546.anInt7200 * 1819515263);
	    if (class382.aBool3984) {
		if (class382.anInt3964 * -423321511 == -1 && i_49_ > i_51_) {
		    method18784();
		    return;
		}
		if (class382.anInt3964 * -423321511 >= 0
		    && i_49_ > class161s[class382.anInt3964 * -423321511]
				   .method2577(i, i_48_, (byte) -31)) {
		    method18784();
		    return;
		}
		if (class382.anInt3931 * -993233351 == -1 && i_49_ < i_52_) {
		    method18784();
		    return;
		}
		if (class382.anInt3931 * -993233351 >= 0
		    && i_49_ < class161s
				   [class382.anInt3931 * -993233351 + 1]
				   .method2577(i, i_48_, (byte) -81)) {
		    method18784();
		    return;
		}
	    }
	    int i_53_;
	    for (i_53_ = class546.anInt7241 * 230317859 - 1;
		 (i_53_ > 0
		  && i_49_ > class161s[i_53_].method2577(i, i_48_, (byte) 75));
		 i_53_--) {
		/* empty */
	    }
	    if (class382.aBool3982 && i_53_ == 0
		&& i_49_ > class161s[0].method2577(i, i_48_, (byte) -38))
		method18784();
	    else if (i_53_ == class546.anInt7241 * 230317859 - 1
		     && (class161s[i_53_].method2577(i, i_48_, (byte) 38)
			 - i_49_) > 8 << class546.anInt7200 * 1819515263)
		method18784();
	    else {
		class547
		    = class546.aClass547ArrayArrayArray7263[i_53_][i][i_48_];
		if (class547 == null) {
		    if (i_53_ == 0
			|| (class546.aClass547ArrayArrayArray7263[0][i][i_48_]
			    == null))
			class547 = class546.aClass547ArrayArrayArray7263[0]
				       [i][i_48_] = new Class547(0);
		    boolean bool = ((class546.aClass547ArrayArrayArray7263[0]
				     [i][i_48_].aClass547_7269)
				    != null);
		    if (i_53_ == 3 && bool)
			i_53_--;
		    for (int i_54_ = 1; i_54_ <= i_53_; i_54_++) {
			if ((class546.aClass547ArrayArrayArray7263[i_54_][i]
			     [i_48_])
			    == null) {
			    class547
				= class546.aClass547ArrayArrayArray7263
				      [i_54_][i][i_48_]
				= new Class547(i_54_);
			    if (bool)
				class547.aByte7271++;
			}
		    }
		    if (class547 == null)
			class547 = (class546.aClass547ArrayArrayArray7263
				    [i_53_][i][i_48_]);
		}
		if (class382.aBool3981) {
		    int i_55_ = anInt11731 >> 12;
		    int i_56_ = anInt11730 >> 12;
		    if (class547.aClass656_Sub1_Sub5_7266 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub5_7266
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_55_, i_49_, i_56_)) {
			    method18784();
			    return;
			}
		    }
		    if (class547.aClass656_Sub1_Sub5_7267 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub5_7267
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_55_, i_49_, i_56_)) {
			    method18784();
			    return;
			}
		    }
		    if (class547.aClass656_Sub1_Sub1_7264 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub1_7264
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_55_, i_49_, i_56_)) {
			    method18784();
			    return;
			}
		    }
		    for (Class560 class560 = class547.aClass560_7272;
			 class560 != null;
			 class560 = class560.aClass560_7546) {
			Class553 class553
			    = class560.aClass656_Sub1_Sub3_7547
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_55_, i_49_, i_56_)) {
			    method18784();
			    return;
			}
		    }
		}
		class633.aClass185_8231.aClass698_2081.method14208(this,
								   (byte) 105);
	    }
	}
    }
    
    void method18781(Class546 class546, Class182 class182, long l) {
	int i = anInt11731 >> 12 + class546.anInt7200 * 1819515263;
	int i_57_ = anInt11730 >> 12 + class546.anInt7200 * 1819515263;
	int i_58_ = anInt11729 >> 12;
	if (i_58_ > 262144 || i_58_ < -262144 || i < 0
	    || i >= class546.anInt7210 * 1761949661 || i_57_ < 0
	    || i_57_ >= class546.anInt7211 * 947301287)
	    method18784();
	else {
	    Class633 class633 = aClass625_12112.aClass633_8132;
	    Class382 class382 = aClass625_12112.aClass382_8131;
	    Class161[] class161s = class546.aClass161Array7226;
	    int i_59_ = class633.anInt8233;
	    Class547 class547 = (class546.aClass547ArrayArrayArray7263
				 [class633.anInt8233][i][i_57_]);
	    if (class547 != null)
		i_59_ = class547.aByte7271;
	    int i_60_ = class161s[i_59_].method2577(i, i_57_, (byte) -2);
	    int i_61_;
	    if (i_59_ < class546.anInt7241 * 230317859 - 1)
		i_61_ = class161s[i_59_ + 1].method2577(i, i_57_, (byte) 37);
	    else
		i_61_ = i_60_ - (8 << class546.anInt7200 * 1819515263);
	    if (class382.aBool3984) {
		if (class382.anInt3964 * -423321511 == -1 && i_58_ > i_60_) {
		    method18784();
		    return;
		}
		if (class382.anInt3964 * -423321511 >= 0
		    && i_58_ > class161s[class382.anInt3964 * -423321511]
				   .method2577(i, i_57_, (byte) -34)) {
		    method18784();
		    return;
		}
		if (class382.anInt3931 * -993233351 == -1 && i_58_ < i_61_) {
		    method18784();
		    return;
		}
		if (class382.anInt3931 * -993233351 >= 0
		    && i_58_ < class161s
				   [class382.anInt3931 * -993233351 + 1]
				   .method2577(i, i_57_, (byte) -90)) {
		    method18784();
		    return;
		}
	    }
	    int i_62_;
	    for (i_62_ = class546.anInt7241 * 230317859 - 1;
		 i_62_ > 0 && i_58_ > class161s[i_62_].method2577(i, i_57_,
								  (byte) -94);
		 i_62_--) {
		/* empty */
	    }
	    if (class382.aBool3982 && i_62_ == 0
		&& i_58_ > class161s[0].method2577(i, i_57_, (byte) 4))
		method18784();
	    else if (i_62_ == class546.anInt7241 * 230317859 - 1
		     && (class161s[i_62_].method2577(i, i_57_, (byte) -35)
			 - i_58_) > 8 << class546.anInt7200 * 1819515263)
		method18784();
	    else {
		class547
		    = class546.aClass547ArrayArrayArray7263[i_62_][i][i_57_];
		if (class547 == null) {
		    if (i_62_ == 0
			|| (class546.aClass547ArrayArrayArray7263[0][i][i_57_]
			    == null))
			class547 = class546.aClass547ArrayArrayArray7263[0]
				       [i][i_57_] = new Class547(0);
		    boolean bool = ((class546.aClass547ArrayArrayArray7263[0]
				     [i][i_57_].aClass547_7269)
				    != null);
		    if (i_62_ == 3 && bool)
			i_62_--;
		    for (int i_63_ = 1; i_63_ <= i_62_; i_63_++) {
			if ((class546.aClass547ArrayArrayArray7263[i_63_][i]
			     [i_57_])
			    == null) {
			    class547
				= class546.aClass547ArrayArrayArray7263
				      [i_63_][i][i_57_]
				= new Class547(i_63_);
			    if (bool)
				class547.aByte7271++;
			}
		    }
		    if (class547 == null)
			class547 = (class546.aClass547ArrayArrayArray7263
				    [i_62_][i][i_57_]);
		}
		if (class382.aBool3981) {
		    int i_64_ = anInt11731 >> 12;
		    int i_65_ = anInt11730 >> 12;
		    if (class547.aClass656_Sub1_Sub5_7266 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub5_7266
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_64_, i_58_, i_65_)) {
			    method18784();
			    return;
			}
		    }
		    if (class547.aClass656_Sub1_Sub5_7267 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub5_7267
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_64_, i_58_, i_65_)) {
			    method18784();
			    return;
			}
		    }
		    if (class547.aClass656_Sub1_Sub1_7264 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub1_7264
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_64_, i_58_, i_65_)) {
			    method18784();
			    return;
			}
		    }
		    for (Class560 class560 = class547.aClass560_7272;
			 class560 != null;
			 class560 = class560.aClass560_7546) {
			Class553 class553
			    = class560.aClass656_Sub1_Sub3_7547
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_64_, i_58_, i_65_)) {
			    method18784();
			    return;
			}
		    }
		}
		class633.aClass185_8231.aClass698_2081.method14208(this,
								   (byte) 35);
	    }
	}
    }
    
    void method18782(Class546 class546, Class182 class182, long l) {
	int i = anInt11731 >> 12 + class546.anInt7200 * 1819515263;
	int i_66_ = anInt11730 >> 12 + class546.anInt7200 * 1819515263;
	int i_67_ = anInt11729 >> 12;
	if (i_67_ > 262144 || i_67_ < -262144 || i < 0
	    || i >= class546.anInt7210 * 1761949661 || i_66_ < 0
	    || i_66_ >= class546.anInt7211 * 947301287)
	    method18784();
	else {
	    Class633 class633 = aClass625_12112.aClass633_8132;
	    Class382 class382 = aClass625_12112.aClass382_8131;
	    Class161[] class161s = class546.aClass161Array7226;
	    int i_68_ = class633.anInt8233;
	    Class547 class547 = (class546.aClass547ArrayArrayArray7263
				 [class633.anInt8233][i][i_66_]);
	    if (class547 != null)
		i_68_ = class547.aByte7271;
	    int i_69_ = class161s[i_68_].method2577(i, i_66_, (byte) -53);
	    int i_70_;
	    if (i_68_ < class546.anInt7241 * 230317859 - 1)
		i_70_ = class161s[i_68_ + 1].method2577(i, i_66_, (byte) 26);
	    else
		i_70_ = i_69_ - (8 << class546.anInt7200 * 1819515263);
	    if (class382.aBool3984) {
		if (class382.anInt3964 * -423321511 == -1 && i_67_ > i_69_) {
		    method18784();
		    return;
		}
		if (class382.anInt3964 * -423321511 >= 0
		    && i_67_ > class161s[class382.anInt3964 * -423321511]
				   .method2577(i, i_66_, (byte) 77)) {
		    method18784();
		    return;
		}
		if (class382.anInt3931 * -993233351 == -1 && i_67_ < i_70_) {
		    method18784();
		    return;
		}
		if (class382.anInt3931 * -993233351 >= 0
		    && i_67_ < class161s
				   [class382.anInt3931 * -993233351 + 1]
				   .method2577(i, i_66_, (byte) -53)) {
		    method18784();
		    return;
		}
	    }
	    int i_71_;
	    for (i_71_ = class546.anInt7241 * 230317859 - 1;
		 (i_71_ > 0
		  && i_67_ > class161s[i_71_].method2577(i, i_66_, (byte) 40));
		 i_71_--) {
		/* empty */
	    }
	    if (class382.aBool3982 && i_71_ == 0
		&& i_67_ > class161s[0].method2577(i, i_66_, (byte) -42))
		method18784();
	    else if (i_71_ == class546.anInt7241 * 230317859 - 1
		     && (class161s[i_71_].method2577(i, i_66_, (byte) -8)
			 - i_67_) > 8 << class546.anInt7200 * 1819515263)
		method18784();
	    else {
		class547
		    = class546.aClass547ArrayArrayArray7263[i_71_][i][i_66_];
		if (class547 == null) {
		    if (i_71_ == 0
			|| (class546.aClass547ArrayArrayArray7263[0][i][i_66_]
			    == null))
			class547 = class546.aClass547ArrayArrayArray7263[0]
				       [i][i_66_] = new Class547(0);
		    boolean bool = ((class546.aClass547ArrayArrayArray7263[0]
				     [i][i_66_].aClass547_7269)
				    != null);
		    if (i_71_ == 3 && bool)
			i_71_--;
		    for (int i_72_ = 1; i_72_ <= i_71_; i_72_++) {
			if ((class546.aClass547ArrayArrayArray7263[i_72_][i]
			     [i_66_])
			    == null) {
			    class547
				= class546.aClass547ArrayArrayArray7263
				      [i_72_][i][i_66_]
				= new Class547(i_72_);
			    if (bool)
				class547.aByte7271++;
			}
		    }
		    if (class547 == null)
			class547 = (class546.aClass547ArrayArrayArray7263
				    [i_71_][i][i_66_]);
		}
		if (class382.aBool3981) {
		    int i_73_ = anInt11731 >> 12;
		    int i_74_ = anInt11730 >> 12;
		    if (class547.aClass656_Sub1_Sub5_7266 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub5_7266
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_73_, i_67_, i_74_)) {
			    method18784();
			    return;
			}
		    }
		    if (class547.aClass656_Sub1_Sub5_7267 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub5_7267
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_73_, i_67_, i_74_)) {
			    method18784();
			    return;
			}
		    }
		    if (class547.aClass656_Sub1_Sub1_7264 != null) {
			Class553 class553
			    = class547.aClass656_Sub1_Sub1_7264
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_73_, i_67_, i_74_)) {
			    method18784();
			    return;
			}
		    }
		    for (Class560 class560 = class547.aClass560_7272;
			 class560 != null;
			 class560 = class560.aClass560_7546) {
			Class553 class553
			    = class560.aClass656_Sub1_Sub3_7547
				  .method16919(class182, (short) 128);
			if (class553 != null
			    && class553.method9168(i_73_, i_67_, i_74_)) {
			    method18784();
			    return;
			}
		    }
		}
		class633.aClass185_8231.aClass698_2081.method14208(this,
								   (byte) 96);
	    }
	}
    }
    
    void method18783(long l, int i) {
	aShort12115 -= i;
	if (aShort12115 <= 0)
	    method18784();
	else {
	    int i_75_ = anInt11731 >> 12;
	    int i_76_ = anInt11729 >> 12;
	    int i_77_ = anInt11730 >> 12;
	    Class633 class633 = aClass625_12112.aClass633_8132;
	    Class382 class382 = aClass625_12112.aClass382_8131;
	    if (class382.anInt3951 * -2138729039 != 0) {
		if (aShort12114 - aShort12115
		    <= class382.anInt3997 * -1043763399) {
		    int i_78_ = ((anInt11737 >> 8 & 0xff00)
				 + (anInt12116 >> 16 & 0xff)
				 + class382.anInt3999 * 1122247543 * i);
		    int i_79_
			= ((anInt11737 & 0xff00) + (anInt12116 >> 8 & 0xff)
			   + class382.anInt4000 * -2073645823 * i);
		    int i_80_
			= ((anInt11737 << 8 & 0xff00) + (anInt12116 & 0xff)
			   + class382.anInt4001 * 1316012015 * i);
		    if (i_78_ < 0)
			i_78_ = 0;
		    else if (i_78_ > 65535)
			i_78_ = 65535;
		    if (i_79_ < 0)
			i_79_ = 0;
		    else if (i_79_ > 65535)
			i_79_ = 65535;
		    if (i_80_ < 0)
			i_80_ = 0;
		    else if (i_80_ > 65535)
			i_80_ = 65535;
		    anInt11737 &= ~0xffffff;
		    anInt11737 |= (((i_78_ & 0xff00) << 8) + (i_79_ & 0xff00)
				   + ((i_80_ & 0xff00) >> 8));
		    anInt12116 &= ~0xffffff;
		    anInt12116 |= (((i_78_ & 0xff) << 16)
				   + ((i_79_ & 0xff) << 8) + (i_80_ & 0xff));
		}
		if (aShort12114 - aShort12115
		    <= class382.anInt3998 * 1802101465) {
		    int i_81_ = ((anInt11737 >> 16 & 0xff00)
				 + (anInt12116 >> 24 & 0xff)
				 + class382.anInt4002 * -1980300793 * i);
		    if (i_81_ < 0)
			i_81_ = 0;
		    else if (i_81_ > 65535)
			i_81_ = 65535;
		    anInt11737 &= 0xffffff;
		    anInt11737 |= (i_81_ & 0xff00) << 16;
		    anInt12116 &= 0xffffff;
		    anInt12116 |= (i_81_ & 0xff) << 24;
		}
	    }
	    if (class382.anInt3942 * 1508447619 != -1
		&& (aShort12114 - aShort12115
		    <= class382.anInt4006 * 1375713017))
		anInt12117 += class382.anInt4004 * 905458915 * i;
	    if (class382.anInt4008 * -178679247 != -1
		&& (aShort12114 - aShort12115
		    <= class382.anInt3937 * 1542874621))
		anInt11734 += class382.anInt3932 * 72620219 * i;
	    if (aShort12118 != 0)
		aShort11736 = (short) (aShort11736 + aShort12118 * i & 0x3fff);
	    double d = (double) aShort12120;
	    double d_82_ = (double) aShort12119;
	    double d_83_ = (double) aShort12121;
	    boolean bool = false;
	    if (class382.anInt3943 * 416505781 == 1) {
		int i_84_ = i_75_ - (aClass625_12112.aClass636_8138.anInt8284
				     * 1290098051);
		int i_85_ = i_76_ - (aClass625_12112.aClass636_8138.anInt8285
				     * -793531135);
		int i_86_ = i_77_ - (aClass625_12112.aClass636_8138.anInt8286
				     * -1950313275);
		int i_87_
		    = ((int) Math.sqrt((double) (i_84_ * i_84_ + i_85_ * i_85_
						 + i_86_ * i_86_))
		       >> 2);
		long l_88_
		    = (long) (class382.anInt3941 * -191735211 * i_87_ * i);
		anInt12117 -= (long) anInt12117 * l_88_ >> 18;
	    } else if (class382.anInt3943 * 416505781 == 2) {
		int i_89_ = i_75_ - (aClass625_12112.aClass636_8138.anInt8284
				     * 1290098051);
		int i_90_ = i_76_ - (aClass625_12112.aClass636_8138.anInt8285
				     * -793531135);
		int i_91_ = i_77_ - (aClass625_12112.aClass636_8138.anInt8286
				     * -1950313275);
		int i_92_ = i_89_ * i_89_ + i_90_ * i_90_ + i_91_ * i_91_;
		long l_93_
		    = (long) (class382.anInt3941 * -191735211 * i_92_ * i);
		anInt12117 -= (long) anInt12117 * l_93_ >> 28;
	    }
	    if (class382.anIntArray3959 != null) {
		Iterator iterator = class633.aList8221.iterator();
		while (iterator.hasNext()) {
		    Class525_Sub29 class525_sub29
			= (Class525_Sub29) iterator.next();
		    Class388 class388 = class525_sub29.aClass388_10652;
		    if (class388.anInt4047 * -1444855139 != 1) {
			boolean bool_94_ = false;
			for (int i_95_ = 0;
			     i_95_ < class382.anIntArray3959.length; i_95_++) {
			    if (class382.anIntArray3959[i_95_]
				== class388.anInt4046 * -592370517) {
				bool_94_ = true;
				break;
			    }
			}
			if (bool_94_) {
			    double d_96_
				= (double) (i_75_ - (class525_sub29.anInt10651
						     * 7815927));
			    double d_97_
				= (double) (i_76_ - (class525_sub29.anInt10649
						     * 1317984849));
			    double d_98_
				= (double) (i_77_ - (class525_sub29.anInt10653
						     * 69063571));
			    double d_99_ = (d_96_ * d_96_ + d_97_ * d_97_
					    + d_98_ * d_98_);
			    if (!(d_99_
				  > (double) (class388.aLong4058
					      * -4646561278530183863L))) {
				double d_100_ = Math.sqrt(d_99_);
				if (d_100_ == 0.0)
				    d_100_ = 1.0;
				double d_101_
				    = (((d_96_
					 * (double) class525_sub29.aFloat10650)
					+ d_97_ * (double) (class388.anInt4048
							    * 1262845375)
					+ d_98_ * (double) (class525_sub29
							    .aFloat10655))
				       * 65535.0
				       / ((double) (class388.anInt4057
						    * 1318542347)
					  * d_100_));
				if (!(d_101_ < (double) (class388.anInt4059
							 * -1717376873))) {
				    double d_102_ = 0.0;
				    if (class388.anInt4052 * 104385927 == 1)
					d_102_
					    = (d_100_ / 16.0
					       * (double) (class388.anInt4053
							   * -2138470573));
				    else if (class388.anInt4052 * 104385927
					     == 2)
					d_102_
					    = (d_100_ / 16.0 * (d_100_ / 16.0)
					       * (double) (class388.anInt4053
							   * -2138470573));
				    if (class388.anInt4045 * 1284856953 == 0) {
					if (class388.anInt4054 * 2119927881
					    == 0) {
					    d += ((double) (class525_sub29
							    .aFloat10650)
						  - d_102_) * (double) i;
					    d_82_ += ((double) ((class388
								 .anInt4048)
								* 1262845375)
						      - d_102_) * (double) i;
					    d_83_ += ((double) (class525_sub29
								.aFloat10655)
						      - d_102_) * (double) i;
					    bool = true;
					} else {
					    anInt11731
						+= ((double) (class525_sub29
							      .aFloat10650)
						    - d_102_) * (double) i;
					    anInt11729
						+= ((double) ((class388
							       .anInt4048)
							      * 1262845375)
						    - d_102_) * (double) i;
					    anInt11730
						+= ((double) (class525_sub29
							      .aFloat10655)
						    - d_102_) * (double) i;
					}
				    } else {
					double d_103_
					    = (d_96_ / d_100_
					       * (double) (class388.anInt4057
							   * 1318542347));
					double d_104_
					    = (d_97_ / d_100_
					       * (double) (class388.anInt4057
							   * 1318542347));
					double d_105_
					    = (d_98_ / d_100_
					       * (double) (class388.anInt4057
							   * 1318542347));
					if (class388.anInt4054 * 2119927881
					    == 0) {
					    d += d_103_ * (double) i;
					    d_82_ += d_104_ * (double) i;
					    d_83_ += d_105_ * (double) i;
					    bool = true;
					} else {
					    anInt11731 += d_103_ * (double) i;
					    anInt11729 += d_104_ * (double) i;
					    anInt11730 += d_105_ * (double) i;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class382.anIntArray3988 != null) {
		for (int i_106_ = 0; i_106_ < class382.anIntArray3988.length;
		     i_106_++) {
		    Class525_Sub29 class525_sub29
			= ((Class525_Sub29)
			   (Class616.aClass10_8053.method684
			    ((long) class382.anIntArray3988[i_106_])));
		    while (class525_sub29 != null) {
			Class388 class388 = class525_sub29.aClass388_10652;
			double d_107_
			    = (double) (i_75_
					- class525_sub29.anInt10651 * 7815927);
			double d_108_
			    = (double) (i_76_ - (class525_sub29.anInt10649
						 * 1317984849));
			double d_109_
			    = (double) (i_77_ - (class525_sub29.anInt10653
						 * 69063571));
			double d_110_ = (d_107_ * d_107_ + d_108_ * d_108_
					 + d_109_ * d_109_);
			if (d_110_ > (double) (class388.aLong4058
					       * -4646561278530183863L))
			    class525_sub29
				= (Class525_Sub29) Class616.aClass10_8053
						       .method696(-2057538770);
			else {
			    double d_111_ = Math.sqrt(d_110_);
			    if (d_111_ == 0.0)
				d_111_ = 1.0;
			    if (class388.anInt4055 * -694135381 > 0
				&& class388.anInt4055 * -694135381 < 2047) {
				double d_112_
				    = (((d_107_
					 * (double) class525_sub29.aFloat10650)
					+ d_108_ * (double) (class388.anInt4048
							     * 1262845375)
					+ d_109_ * (double) (class525_sub29
							     .aFloat10655))
				       * 16384.0
				       / ((double) (class388.anInt4057
						    * 1318542347)
					  * d_111_));
				if (d_112_ < (double) (class388.anInt4059
						       * -1717376873)) {
				    class525_sub29
					= ((Class525_Sub29)
					   Class616.aClass10_8053
					       .method696(-2057538770));
				    continue;
				}
			    }
			    double d_113_ = 0.0;
			    if (class388.anInt4052 * 104385927 == 1)
				d_113_ = (d_111_ / 16.0
					  * (double) (class388.anInt4053
						      * -2138470573));
			    else if (class388.anInt4052 * 104385927 == 2)
				d_113_ = (d_111_ / 16.0 * (d_111_ / 16.0)
					  * (double) (class388.anInt4053
						      * -2138470573));
			    if (class388.anInt4045 * 1284856953 == 0) {
				if (class388.anInt4054 * 2119927881 == 0) {
				    d += ((double) class525_sub29.aFloat10650
					  - d_113_) * (double) i;
				    d_82_ += ((double) (class388.anInt4048
							* 1262845375)
					      - d_113_) * (double) i;
				    d_83_
					+= ((double) class525_sub29.aFloat10655
					    - d_113_) * (double) i;
				    bool = true;
				} else {
				    anInt11731
					+= ((double) class525_sub29.aFloat10650
					    - d_113_) * (double) i;
				    anInt11729 += ((double) (class388.anInt4048
							     * 1262845375)
						   - d_113_) * (double) i;
				    anInt11730
					+= ((double) class525_sub29.aFloat10655
					    - d_113_) * (double) i;
				}
			    } else {
				double d_114_ = (d_107_ / d_111_
						 * (double) (class388.anInt4057
							     * 1318542347));
				double d_115_ = (d_108_ / d_111_
						 * (double) (class388.anInt4057
							     * 1318542347));
				double d_116_ = (d_109_ / d_111_
						 * (double) (class388.anInt4057
							     * 1318542347));
				if (class388.anInt4054 * 2119927881 == 0) {
				    d += d_114_ * (double) i;
				    d_82_ += d_115_ * (double) i;
				    d_83_ += d_116_ * (double) i;
				    bool = true;
				} else {
				    anInt11731 += d_114_ * (double) i;
				    anInt11729 += d_115_ * (double) i;
				    anInt11730 += d_116_ * (double) i;
				}
			    }
			    class525_sub29
				= (Class525_Sub29) Class616.aClass10_8053
						       .method696(-2057538770);
			}
		    }
		}
	    }
	    if (class382.anIntArray3961 != null) {
		if (class382.anIntArray3967 == null) {
		    class382.anIntArray3967
			= new int[class382.anIntArray3961.length];
		    for (int i_117_ = 0;
			 i_117_ < class382.anIntArray3961.length; i_117_++) {
			Class616.anInterface49_8049.method342((class382
							       .anIntArray3961
							       [i_117_]),
							      (byte) -2);
			class382.anIntArray3967[i_117_]
			    = Class296.method5353((class382.anIntArray3961
						   [i_117_]),
						  (short) 12694);
		    }
		}
		for (int i_118_ = 0; i_118_ < class382.anIntArray3967.length;
		     i_118_++) {
		    Class388 class388 = (Class616.aClass388Array8052
					 [class382.anIntArray3967[i_118_]]);
		    if (class388.anInt4054 * 2119927881 == 0) {
			d += (double) (class388.anInt4049 * -719788841 * i);
			d_82_
			    += (double) (class388.anInt4048 * 1262845375 * i);
			d_83_
			    += (double) (class388.anInt4051 * 1898274533 * i);
			bool = true;
		    } else {
			anInt11731 += class388.anInt4049 * -719788841 * i;
			anInt11729 += class388.anInt4048 * 1262845375 * i;
			anInt11730 += class388.anInt4051 * 1898274533 * i;
		    }
		}
	    }
	    if (bool) {
		while (d > 32767.0 || d_82_ > 32767.0 || d_83_ > 32767.0
		       || d < -32767.0 || d_82_ < -32767.0
		       || d_83_ < -32767.0) {
		    d /= 2.0;
		    d_82_ /= 2.0;
		    d_83_ /= 2.0;
		    anInt12117 <<= 1;
		}
		aShort12120 = (short) (int) d;
		aShort12119 = (short) (int) d_82_;
		aShort12121 = (short) (int) d_83_;
	    }
	    anInt11731 += ((long) aShort12120 * (long) (anInt12117 << 2)
			   >> 23) * (long) i;
	    anInt11729 += ((long) aShort12119 * (long) (anInt12117 << 2)
			   >> 23) * (long) i;
	    anInt11730 += ((long) aShort12121 * (long) (anInt12117 << 2)
			   >> 23) * (long) i;
	}
    }
    
    void method18784() {
	aClass625_12112.aClass633_8132.aClass531_Sub5_Sub1_Sub1Array8223
	    [aShort12113]
	    = null;
	Class261.aClass531_Sub5_Sub1_Sub1Array2790[(Class616.anInt8048
						    * -1916807703)]
	    = this;
	Class616.anInt8048
	    = (Class616.anInt8048 * -1916807703 + 1 & 0x3ff) * -147172775;
	method8794(-1823665717);
	method15991(276974905);
    }
}
