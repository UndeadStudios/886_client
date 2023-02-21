/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class209 implements Interface57
{
    Class217 this$0;
    
    Class209(Class217 class217) {
	this$0 = class217;
    }
    
    public void method357(Object object, float[] fs, Object[] objects, int i) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) 98);
	float f_0_ = class488.method7924(-1956480834);
	Class446 class446_1_ = this$0.method4030(-695206017);
	Class446 class446_2_ = Class446.method7225(class446, class446_1_);
	float f_3_ = 0.0F;
	int i_4_ = 8192;
	float f_5_ = class446_2_.method7230();
	float f_6_ = 0.0F;
	if (f_5_ >= f_0_)
	    f_3_ = 0.0F;
	else {
	    float f_7_ = ((Float) objects[0]).floatValue();
	    float f_8_ = ((Float) objects[1]).floatValue();
	    if (class446_1_.aFloat4895 > class446.aFloat4895 - f_7_ / 2.0F
		&& class446_1_.aFloat4895 < f_7_ / 2.0F + class446.aFloat4895
		&& class446_1_.aFloat4897 > class446.aFloat4897 - f_8_ / 2.0F
		&& (class446_1_.aFloat4897
		    < f_8_ / 2.0F + class446.aFloat4897)) {
		float f_9_
		    = Math.abs(class446_1_.aFloat4895 - (class446.aFloat4895
							 + f_7_ / 2.0F));
		float f_10_
		    = Math.abs(class446_1_.aFloat4895 - (class446.aFloat4895
							 - f_7_ / 2.0F));
		float f_11_
		    = Math.abs(class446_1_.aFloat4897 - (class446.aFloat4895
							 + f_8_ / 2.0F));
		float f_12_
		    = Math.abs(class446_1_.aFloat4897 - (class446.aFloat4895
							 - f_8_ / 2.0F));
		float f_13_ = f_0_ - f;
		float f_14_ = Math.min(f_9_, f_10_);
		float f_15_ = Math.min(f_11_, f_12_);
		float f_16_ = f_14_ * (1.0F / f_13_);
		float f_17_ = 1.0F / f_13_ * f_15_;
		f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
		f_17_ = Math.min(Math.max(f_17_, 0.0F), 1.0F);
		f_3_ = Math.min(f_16_, f_17_);
	    }
	    if (class446_2_.aFloat4895 != 0.0F
		|| 0.0F != class446_2_.aFloat4897) {
		if (Class700.anInt8779 * -174799205 == 5) {
		    float f_18_ = Class453_Sub3.aClass309_Sub1_10316
				      .method5491((byte) 0);
		    if (class446_2_.aFloat4895 != 0.0F
			|| 0.0F != class446_2_.aFloat4897) {
			int i_19_
			    = (((int) (2607.5945876176133
				       * (double) (f_18_ * -1.0F))
				- (int) (Math.atan2((double) (class446_2_
							      .aFloat4895),
						    (double) (class446_2_
							      .aFloat4897))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_19_ > 8192)
			    i_19_ = 16384 - i_19_;
			int i_20_;
			if (f_5_ <= 0.0F)
			    i_20_ = 8192;
			else if (f_5_ >= 4096.0F)
			    i_20_ = 16384;
			else
			    i_20_ = (int) (8192.0F + f_5_ * 8192.0F / 4096.0F);
			i_4_ = (16384 - i_20_ >> 1) + i_19_ * i_20_ / 8192;
		    }
		    f_6_ = 6.1035156E-5F * (float) i_4_;
		} else {
		    int i_21_
			= (-(-684522141 * Class64.anInt695)
			   - (int) (Math.atan2((double) class446_2_.aFloat4895,
					       (double) class446_2_.aFloat4897)
				    * 2607.5945876176133)
			   - 4096) & 0x3fff;
		    if (i_21_ > 8192)
			i_21_ = 16384 - i_21_;
		    int i_22_;
		    if (f_5_ <= 0.0F)
			i_22_ = 8192;
		    else if (f_5_ >= 4096.0F)
			i_22_ = 16384;
		    else
			i_22_ = (int) (8192.0F + 8192.0F * f_5_ / 4096.0F);
		    i_4_ = (16384 - i_22_ >> 1) + i_22_ * i_21_ / 8192;
		    f_6_ = (float) i_4_ * 6.1035156E-5F;
		}
	    }
	}
	fs[0] = (float) (i_4_ < 0 ? (double) f_3_
			 : (double) f_3_ * Math.sqrt((double) (1.0F - f_6_)));
	fs[1] = (float) (i_4_ < 0 ? (double) -f_3_
			 : (double) f_3_ * Math.sqrt((double) f_6_));
    }
    
    public void method359(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) 91);
	float f_23_ = class488.method7924(183233368);
	Class446 class446_24_ = this$0.method4030(-867102988);
	Class446 class446_25_ = Class446.method7225(class446, class446_24_);
	float f_26_ = 0.0F;
	int i = 8192;
	float f_27_ = class446_25_.method7230();
	float f_28_ = 0.0F;
	if (f_27_ >= f_23_)
	    f_26_ = 0.0F;
	else {
	    float f_29_ = ((Float) objects[0]).floatValue();
	    float f_30_ = ((Float) objects[1]).floatValue();
	    if (class446_24_.aFloat4895 > class446.aFloat4895 - f_29_ / 2.0F
		&& class446_24_.aFloat4895 < f_29_ / 2.0F + class446.aFloat4895
		&& class446_24_.aFloat4897 > class446.aFloat4897 - f_30_ / 2.0F
		&& (class446_24_.aFloat4897
		    < f_30_ / 2.0F + class446.aFloat4897)) {
		float f_31_
		    = Math.abs(class446_24_.aFloat4895 - (class446.aFloat4895
							  + f_29_ / 2.0F));
		float f_32_
		    = Math.abs(class446_24_.aFloat4895 - (class446.aFloat4895
							  - f_29_ / 2.0F));
		float f_33_
		    = Math.abs(class446_24_.aFloat4897 - (class446.aFloat4895
							  + f_30_ / 2.0F));
		float f_34_
		    = Math.abs(class446_24_.aFloat4897 - (class446.aFloat4895
							  - f_30_ / 2.0F));
		float f_35_ = f_23_ - f;
		float f_36_ = Math.min(f_31_, f_32_);
		float f_37_ = Math.min(f_33_, f_34_);
		float f_38_ = f_36_ * (1.0F / f_35_);
		float f_39_ = 1.0F / f_35_ * f_37_;
		f_38_ = Math.min(Math.max(f_38_, 0.0F), 1.0F);
		f_39_ = Math.min(Math.max(f_39_, 0.0F), 1.0F);
		f_26_ = Math.min(f_38_, f_39_);
	    }
	    if (class446_25_.aFloat4895 != 0.0F
		|| 0.0F != class446_25_.aFloat4897) {
		if (Class700.anInt8779 * -174799205 == 5) {
		    float f_40_ = Class453_Sub3.aClass309_Sub1_10316
				      .method5491((byte) 0);
		    if (class446_25_.aFloat4895 != 0.0F
			|| 0.0F != class446_25_.aFloat4897) {
			int i_41_
			    = (((int) (2607.5945876176133
				       * (double) (f_40_ * -1.0F))
				- (int) (Math.atan2((double) (class446_25_
							      .aFloat4895),
						    (double) (class446_25_
							      .aFloat4897))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_41_ > 8192)
			    i_41_ = 16384 - i_41_;
			int i_42_;
			if (f_27_ <= 0.0F)
			    i_42_ = 8192;
			else if (f_27_ >= 4096.0F)
			    i_42_ = 16384;
			else
			    i_42_
				= (int) (8192.0F + f_27_ * 8192.0F / 4096.0F);
			i = (16384 - i_42_ >> 1) + i_41_ * i_42_ / 8192;
		    }
		    f_28_ = 6.1035156E-5F * (float) i;
		} else {
		    int i_43_ = ((-(-684522141 * Class64.anInt695)
				  - (int) (Math.atan2((double) (class446_25_
								.aFloat4895),
						      (double) (class446_25_
								.aFloat4897))
					   * 2607.5945876176133)
				  - 4096)
				 & 0x3fff);
		    if (i_43_ > 8192)
			i_43_ = 16384 - i_43_;
		    int i_44_;
		    if (f_27_ <= 0.0F)
			i_44_ = 8192;
		    else if (f_27_ >= 4096.0F)
			i_44_ = 16384;
		    else
			i_44_ = (int) (8192.0F + 8192.0F * f_27_ / 4096.0F);
		    i = (16384 - i_44_ >> 1) + i_44_ * i_43_ / 8192;
		    f_28_ = (float) i * 6.1035156E-5F;
		}
	    }
	}
	fs[0]
	    = (float) (i < 0 ? (double) f_26_
		       : (double) f_26_ * Math.sqrt((double) (1.0F - f_28_)));
	fs[1] = (float) (i < 0 ? (double) -f_26_
			 : (double) f_26_ * Math.sqrt((double) f_28_));
    }
    
    public void method358(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) 8);
	float f_45_ = class488.method7924(1525762266);
	Class446 class446_46_ = this$0.method4030(-1705867183);
	Class446 class446_47_ = Class446.method7225(class446, class446_46_);
	float f_48_ = 0.0F;
	int i = 8192;
	float f_49_ = class446_47_.method7230();
	float f_50_ = 0.0F;
	if (f_49_ >= f_45_)
	    f_48_ = 0.0F;
	else {
	    float f_51_ = ((Float) objects[0]).floatValue();
	    float f_52_ = ((Float) objects[1]).floatValue();
	    if (class446_46_.aFloat4895 > class446.aFloat4895 - f_51_ / 2.0F
		&& class446_46_.aFloat4895 < f_51_ / 2.0F + class446.aFloat4895
		&& class446_46_.aFloat4897 > class446.aFloat4897 - f_52_ / 2.0F
		&& (class446_46_.aFloat4897
		    < f_52_ / 2.0F + class446.aFloat4897)) {
		float f_53_
		    = Math.abs(class446_46_.aFloat4895 - (class446.aFloat4895
							  + f_51_ / 2.0F));
		float f_54_
		    = Math.abs(class446_46_.aFloat4895 - (class446.aFloat4895
							  - f_51_ / 2.0F));
		float f_55_
		    = Math.abs(class446_46_.aFloat4897 - (class446.aFloat4895
							  + f_52_ / 2.0F));
		float f_56_
		    = Math.abs(class446_46_.aFloat4897 - (class446.aFloat4895
							  - f_52_ / 2.0F));
		float f_57_ = f_45_ - f;
		float f_58_ = Math.min(f_53_, f_54_);
		float f_59_ = Math.min(f_55_, f_56_);
		float f_60_ = f_58_ * (1.0F / f_57_);
		float f_61_ = 1.0F / f_57_ * f_59_;
		f_60_ = Math.min(Math.max(f_60_, 0.0F), 1.0F);
		f_61_ = Math.min(Math.max(f_61_, 0.0F), 1.0F);
		f_48_ = Math.min(f_60_, f_61_);
	    }
	    if (class446_47_.aFloat4895 != 0.0F
		|| 0.0F != class446_47_.aFloat4897) {
		if (Class700.anInt8779 * -174799205 == 5) {
		    float f_62_ = Class453_Sub3.aClass309_Sub1_10316
				      .method5491((byte) 0);
		    if (class446_47_.aFloat4895 != 0.0F
			|| 0.0F != class446_47_.aFloat4897) {
			int i_63_
			    = (((int) (2607.5945876176133
				       * (double) (f_62_ * -1.0F))
				- (int) (Math.atan2((double) (class446_47_
							      .aFloat4895),
						    (double) (class446_47_
							      .aFloat4897))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_63_ > 8192)
			    i_63_ = 16384 - i_63_;
			int i_64_;
			if (f_49_ <= 0.0F)
			    i_64_ = 8192;
			else if (f_49_ >= 4096.0F)
			    i_64_ = 16384;
			else
			    i_64_
				= (int) (8192.0F + f_49_ * 8192.0F / 4096.0F);
			i = (16384 - i_64_ >> 1) + i_63_ * i_64_ / 8192;
		    }
		    f_50_ = 6.1035156E-5F * (float) i;
		} else {
		    int i_65_ = ((-(-684522141 * Class64.anInt695)
				  - (int) (Math.atan2((double) (class446_47_
								.aFloat4895),
						      (double) (class446_47_
								.aFloat4897))
					   * 2607.5945876176133)
				  - 4096)
				 & 0x3fff);
		    if (i_65_ > 8192)
			i_65_ = 16384 - i_65_;
		    int i_66_;
		    if (f_49_ <= 0.0F)
			i_66_ = 8192;
		    else if (f_49_ >= 4096.0F)
			i_66_ = 16384;
		    else
			i_66_ = (int) (8192.0F + 8192.0F * f_49_ / 4096.0F);
		    i = (16384 - i_66_ >> 1) + i_66_ * i_65_ / 8192;
		    f_50_ = (float) i * 6.1035156E-5F;
		}
	    }
	}
	fs[0]
	    = (float) (i < 0 ? (double) f_48_
		       : (double) f_48_ * Math.sqrt((double) (1.0F - f_50_)));
	fs[1] = (float) (i < 0 ? (double) -f_48_
			 : (double) f_48_ * Math.sqrt((double) f_50_));
    }
    
    public void method360(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) 76);
	float f_67_ = class488.method7924(-1200268500);
	Class446 class446_68_ = this$0.method4030(-659078779);
	Class446 class446_69_ = Class446.method7225(class446, class446_68_);
	float f_70_ = 0.0F;
	int i = 8192;
	float f_71_ = class446_69_.method7230();
	float f_72_ = 0.0F;
	if (f_71_ >= f_67_)
	    f_70_ = 0.0F;
	else {
	    float f_73_ = ((Float) objects[0]).floatValue();
	    float f_74_ = ((Float) objects[1]).floatValue();
	    if (class446_68_.aFloat4895 > class446.aFloat4895 - f_73_ / 2.0F
		&& class446_68_.aFloat4895 < f_73_ / 2.0F + class446.aFloat4895
		&& class446_68_.aFloat4897 > class446.aFloat4897 - f_74_ / 2.0F
		&& (class446_68_.aFloat4897
		    < f_74_ / 2.0F + class446.aFloat4897)) {
		float f_75_
		    = Math.abs(class446_68_.aFloat4895 - (class446.aFloat4895
							  + f_73_ / 2.0F));
		float f_76_
		    = Math.abs(class446_68_.aFloat4895 - (class446.aFloat4895
							  - f_73_ / 2.0F));
		float f_77_
		    = Math.abs(class446_68_.aFloat4897 - (class446.aFloat4895
							  + f_74_ / 2.0F));
		float f_78_
		    = Math.abs(class446_68_.aFloat4897 - (class446.aFloat4895
							  - f_74_ / 2.0F));
		float f_79_ = f_67_ - f;
		float f_80_ = Math.min(f_75_, f_76_);
		float f_81_ = Math.min(f_77_, f_78_);
		float f_82_ = f_80_ * (1.0F / f_79_);
		float f_83_ = 1.0F / f_79_ * f_81_;
		f_82_ = Math.min(Math.max(f_82_, 0.0F), 1.0F);
		f_83_ = Math.min(Math.max(f_83_, 0.0F), 1.0F);
		f_70_ = Math.min(f_82_, f_83_);
	    }
	    if (class446_69_.aFloat4895 != 0.0F
		|| 0.0F != class446_69_.aFloat4897) {
		if (Class700.anInt8779 * -174799205 == 5) {
		    float f_84_ = Class453_Sub3.aClass309_Sub1_10316
				      .method5491((byte) 0);
		    if (class446_69_.aFloat4895 != 0.0F
			|| 0.0F != class446_69_.aFloat4897) {
			int i_85_
			    = (((int) (2607.5945876176133
				       * (double) (f_84_ * -1.0F))
				- (int) (Math.atan2((double) (class446_69_
							      .aFloat4895),
						    (double) (class446_69_
							      .aFloat4897))
					 * 2607.5945876176133)
				- 4096)
			       & 0x3fff);
			if (i_85_ > 8192)
			    i_85_ = 16384 - i_85_;
			int i_86_;
			if (f_71_ <= 0.0F)
			    i_86_ = 8192;
			else if (f_71_ >= 4096.0F)
			    i_86_ = 16384;
			else
			    i_86_
				= (int) (8192.0F + f_71_ * 8192.0F / 4096.0F);
			i = (16384 - i_86_ >> 1) + i_85_ * i_86_ / 8192;
		    }
		    f_72_ = 6.1035156E-5F * (float) i;
		} else {
		    int i_87_ = ((-(-684522141 * Class64.anInt695)
				  - (int) (Math.atan2((double) (class446_69_
								.aFloat4895),
						      (double) (class446_69_
								.aFloat4897))
					   * 2607.5945876176133)
				  - 4096)
				 & 0x3fff);
		    if (i_87_ > 8192)
			i_87_ = 16384 - i_87_;
		    int i_88_;
		    if (f_71_ <= 0.0F)
			i_88_ = 8192;
		    else if (f_71_ >= 4096.0F)
			i_88_ = 16384;
		    else
			i_88_ = (int) (8192.0F + 8192.0F * f_71_ / 4096.0F);
		    i = (16384 - i_88_ >> 1) + i_88_ * i_87_ / 8192;
		    f_72_ = (float) i * 6.1035156E-5F;
		}
	    }
	}
	fs[0]
	    = (float) (i < 0 ? (double) f_70_
		       : (double) f_70_ * Math.sqrt((double) (1.0F - f_72_)));
	fs[1] = (float) (i < 0 ? (double) -f_70_
			 : (double) f_70_ * Math.sqrt((double) f_72_));
    }
    
    static final void method3914(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_89_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_90_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	int i_91_
	    = class683.anIntArray8661[2 + 501271953 * class683.anInt8662];
	Class43.method1069(i_89_, -695254952);
	Class555.method9237(Class162.aClass245Array1764[i_89_ >>> 16],
			    i_89_ & 0xffff, i_90_, i_91_, class683.aBool8665,
			    class683, 666034491);
    }
    
    static final void method3915(Class683 class683, int i) {
	int i_92_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class182_Sub2.aClass228_9503.method4275(i_92_, -872953113)
		  .method4154(-2026978506);
    }
    
    static final void method3916(Class683 class683, int i) {
	int i_93_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class639.method10559(i_93_ >> 14 & 0x3fff, i_93_ & 0x3fff,
			     -1850679036);
    }
    
    static final void method3917(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.anInt3766 * -52364563;
    }
    
    static final void method3918(Class683 class683, short i) {
	int i_94_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_94_, -695254952);
	Class43.method1073(class259, class683, 161850588);
    }
}
