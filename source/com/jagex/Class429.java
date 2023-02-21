/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class429
{
    static int anInt4809;
    static int anInt4810;
    public float aFloat4811;
    public float aFloat4812;
    public float aFloat4813;
    static Class429[] aClass429Array4814 = new Class429[0];
    public float aFloat4815;
    
    public static Class429 method6801(Class429 class429) {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429_0_ = new Class429(class429);
		return class429_0_;
	    }
	    aClass429Array4814[--anInt4810].method6809(class429);
	    Class429 class429_1_ = aClass429Array4814[anInt4810];
	    return class429_1_;
	}
    }
    
    void method6802(float f, float f_2_, float f_3_, float f_4_) {
	aFloat4812 = f;
	aFloat4811 = f_2_;
	aFloat4813 = f_3_;
	aFloat4815 = f_4_;
    }
    
    static Class429 method6803(float f, float f_5_, float f_6_, float f_7_) {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429 = new Class429(f, f_5_, f_6_, f_7_);
		return class429;
	    }
	    aClass429Array4814[--anInt4810].method6879(f, f_5_, f_6_, f_7_);
	    Class429 class429 = aClass429Array4814[anInt4810];
	    return class429;
	}
    }
    
    final void method6804() {
	aFloat4813 = 0.0F;
	aFloat4811 = 0.0F;
	aFloat4812 = 0.0F;
	aFloat4815 = 1.0F;
    }
    
    public void method6805() {
	synchronized (aClass429Array4814) {
	    if (anInt4810 < anInt4809 - 1)
		aClass429Array4814[anInt4810++] = this;
	}
    }
    
    public Class429() {
	method6813();
    }
    
    public Class429(float f, float f_8_, float f_9_, float f_10_) {
	method6879(f, f_8_, f_9_, f_10_);
    }
    
    public final void method6806(Class429 class429_11_) {
	method6879((class429_11_.aFloat4815 * aFloat4812
		    + class429_11_.aFloat4812 * aFloat4815
		    + class429_11_.aFloat4811 * aFloat4813
		    - class429_11_.aFloat4813 * aFloat4811),
		   (class429_11_.aFloat4815 * aFloat4811
		    - class429_11_.aFloat4812 * aFloat4813
		    + class429_11_.aFloat4811 * aFloat4815
		    + class429_11_.aFloat4813 * aFloat4812),
		   (class429_11_.aFloat4815 * aFloat4813
		    + class429_11_.aFloat4812 * aFloat4811
		    - class429_11_.aFloat4811 * aFloat4812
		    + class429_11_.aFloat4813 * aFloat4815),
		   (class429_11_.aFloat4815 * aFloat4815
		    - class429_11_.aFloat4812 * aFloat4812
		    - class429_11_.aFloat4811 * aFloat4811
		    - class429_11_.aFloat4813 * aFloat4813));
    }
    
    public Class429(float f, float f_12_, float f_13_) {
	method6821(f, f_12_, f_13_);
    }
    
    public void method6807(RSBuffer class525_sub38) {
	aFloat4812 = class525_sub38.method16634(845686754);
	aFloat4811 = class525_sub38.method16634(-87874387);
	aFloat4813 = class525_sub38.method16634(-1913182763);
	aFloat4815 = class525_sub38.method16634(-2020300380);
    }
    
    static final Class429 method6808(Class429 class429, float f) {
	Class429 class429_14_ = method6801(class429);
	class429_14_.method6824(f);
	return class429_14_;
    }
    
    public void method6809(Class429 class429_15_) {
	aFloat4812 = class429_15_.aFloat4812;
	aFloat4811 = class429_15_.aFloat4811;
	aFloat4813 = class429_15_.aFloat4813;
	aFloat4815 = class429_15_.aFloat4815;
    }
    
    public void method6810(Class446 class446, float f) {
	method6811(class446.aFloat4895, class446.aFloat4896,
		   class446.aFloat4897, f);
    }
    
    public void method6811(float f, float f_16_, float f_17_, float f_18_) {
	float f_19_ = (float) Math.sin((double) (f_18_ * 0.5F));
	float f_20_ = (float) Math.cos((double) (f_18_ * 0.5F));
	aFloat4812 = f * f_19_;
	aFloat4811 = f_16_ * f_19_;
	aFloat4813 = f_17_ * f_19_;
	aFloat4815 = f_20_;
    }
    
    final float method6812(Class429 class429_21_) {
	return (aFloat4812 * class429_21_.aFloat4812
		+ aFloat4811 * class429_21_.aFloat4811
		+ aFloat4813 * class429_21_.aFloat4813
		+ aFloat4815 * class429_21_.aFloat4815);
    }
    
    final void method6813() {
	aFloat4813 = 0.0F;
	aFloat4811 = 0.0F;
	aFloat4812 = 0.0F;
	aFloat4815 = 1.0F;
    }
    
    final void method6814() {
	aFloat4813 = 0.0F;
	aFloat4811 = 0.0F;
	aFloat4812 = 0.0F;
	aFloat4815 = 1.0F;
    }
    
    public final void method6815() {
	aFloat4812 = -aFloat4812;
	aFloat4811 = -aFloat4811;
	aFloat4813 = -aFloat4813;
    }
    
    public static final Class429 method6816(Class429 class429) {
	Class429 class429_22_ = method6801(class429);
	class429_22_.method6815();
	return class429_22_;
    }
    
    public final void method6817() {
	float f = 1.0F / method6857(this);
	aFloat4812 *= f;
	aFloat4811 *= f;
	aFloat4813 *= f;
	aFloat4815 *= f;
    }
    
    public void method6818(Class446 class446, float f) {
	method6811(class446.aFloat4895, class446.aFloat4896,
		   class446.aFloat4897, f);
    }
    
    public static Class429 method6819() {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429 = new Class429();
		return class429;
	    }
	    aClass429Array4814[--anInt4810].method6813();
	    Class429 class429 = aClass429Array4814[anInt4810];
	    return class429;
	}
    }
    
    static final float method6820(Class429 class429, Class429 class429_23_) {
	return class429.method6812(class429_23_);
    }
    
    public void method6821(float f, float f_24_, float f_25_) {
	method6811(0.0F, 1.0F, 0.0F, f);
	Class429 class429_26_ = method6864();
	class429_26_.method6811(1.0F, 0.0F, 0.0F, f_24_);
	method6822(class429_26_);
	class429_26_.method6811(0.0F, 0.0F, 1.0F, f_25_);
	method6822(class429_26_);
	class429_26_.method6805();
    }
    
    public final void method6822(Class429 class429_27_) {
	method6879((class429_27_.aFloat4815 * aFloat4812
		    + class429_27_.aFloat4812 * aFloat4815
		    + class429_27_.aFloat4811 * aFloat4813
		    - class429_27_.aFloat4813 * aFloat4811),
		   (class429_27_.aFloat4815 * aFloat4811
		    - class429_27_.aFloat4812 * aFloat4813
		    + class429_27_.aFloat4811 * aFloat4815
		    + class429_27_.aFloat4813 * aFloat4812),
		   (class429_27_.aFloat4815 * aFloat4813
		    + class429_27_.aFloat4812 * aFloat4811
		    - class429_27_.aFloat4811 * aFloat4812
		    + class429_27_.aFloat4813 * aFloat4815),
		   (class429_27_.aFloat4815 * aFloat4815
		    - class429_27_.aFloat4812 * aFloat4812
		    - class429_27_.aFloat4811 * aFloat4811
		    - class429_27_.aFloat4813 * aFloat4813));
    }
    
    static final Class429 method6823(Class429 class429,
				     Class429 class429_28_) {
	Class429 class429_29_ = method6801(class429);
	class429_29_.method6822(class429_28_);
	return class429_29_;
    }
    
    final void method6824(float f) {
	aFloat4812 *= f;
	aFloat4811 *= f;
	aFloat4813 *= f;
	aFloat4815 *= f;
    }
    
    public String method6825() {
	return new StringBuilder().append(aFloat4812).append(",").append
		   (aFloat4811).append
		   (",").append
		   (aFloat4813).append
		   (",").append
		   (aFloat4815).toString();
    }
    
    public final void method6826(Class429 class429_30_, float f) {
	if (method6812(class429_30_) < 0.0F)
	    method6867();
	method6824(1.0F - f);
	Class429 class429_31_ = method6808(class429_30_, f);
	method6834(class429_31_);
	class429_31_.method6805();
	method6817();
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4812).append(",").append
		   (aFloat4811).append
		   (",").append
		   (aFloat4813).append
		   (",").append
		   (aFloat4815).toString();
    }
    
    static {
	new Class429();
    }
    
    public String method6827() {
	return new StringBuilder().append(aFloat4812).append(",").append
		   (aFloat4811).append
		   (",").append
		   (aFloat4813).append
		   (",").append
		   (aFloat4815).toString();
    }
    
    void method6828(float f, float f_32_, float f_33_, float f_34_) {
	aFloat4812 = f;
	aFloat4811 = f_32_;
	aFloat4813 = f_33_;
	aFloat4815 = f_34_;
    }
    
    public String method6829() {
	return new StringBuilder().append(aFloat4812).append(",").append
		   (aFloat4811).append
		   (",").append
		   (aFloat4813).append
		   (",").append
		   (aFloat4815).toString();
    }
    
    final void method6830(float f) {
	aFloat4812 *= f;
	aFloat4811 *= f;
	aFloat4813 *= f;
	aFloat4815 *= f;
    }
    
    public static void method6831(int i) {
	anInt4809 = i;
	aClass429Array4814 = new Class429[i];
	anInt4810 = 0;
    }
    
    public static void method6832(int i) {
	anInt4809 = i;
	aClass429Array4814 = new Class429[i];
	anInt4810 = 0;
    }
    
    public static void method6833(int i) {
	anInt4809 = i;
	aClass429Array4814 = new Class429[i];
	anInt4810 = 0;
    }
    
    final void method6834(Class429 class429_35_) {
	aFloat4812 += class429_35_.aFloat4812;
	aFloat4811 += class429_35_.aFloat4811;
	aFloat4813 += class429_35_.aFloat4813;
	aFloat4815 += class429_35_.aFloat4815;
    }
    
    void method6835(float f, float f_36_, float f_37_, float f_38_) {
	aFloat4812 = f;
	aFloat4811 = f_36_;
	aFloat4813 = f_37_;
	aFloat4815 = f_38_;
    }
    
    public static Class429 method6836() {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429 = new Class429();
		return class429;
	    }
	    aClass429Array4814[--anInt4810].method6813();
	    Class429 class429 = aClass429Array4814[anInt4810];
	    return class429;
	}
    }
    
    static Class429 method6837(float f, float f_39_, float f_40_,
			       float f_41_) {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429 = new Class429(f, f_39_, f_40_, f_41_);
		return class429;
	    }
	    aClass429Array4814[--anInt4810].method6879(f, f_39_, f_40_, f_41_);
	    Class429 class429 = aClass429Array4814[anInt4810];
	    return class429;
	}
    }
    
    static Class429 method6838(float f, float f_42_, float f_43_,
			       float f_44_) {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429 = new Class429(f, f_42_, f_43_, f_44_);
		return class429;
	    }
	    aClass429Array4814[--anInt4810].method6879(f, f_42_, f_43_, f_44_);
	    Class429 class429 = aClass429Array4814[anInt4810];
	    return class429;
	}
    }
    
    static Class429 method6839(float f, float f_45_, float f_46_,
			       float f_47_) {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429 = new Class429(f, f_45_, f_46_, f_47_);
		return class429;
	    }
	    aClass429Array4814[--anInt4810].method6879(f, f_45_, f_46_, f_47_);
	    Class429 class429 = aClass429Array4814[anInt4810];
	    return class429;
	}
    }
    
    public final void method6840(Class429 class429_48_, float f) {
	if (method6812(class429_48_) < 0.0F)
	    method6867();
	method6824(1.0F - f);
	Class429 class429_49_ = method6808(class429_48_, f);
	method6834(class429_49_);
	class429_49_.method6805();
	method6817();
    }
    
    static final float method6841(Class429 class429, Class429 class429_50_) {
	return class429.method6812(class429_50_);
    }
    
    public static void method6842(int i) {
	anInt4809 = i;
	aClass429Array4814 = new Class429[i];
	anInt4810 = 0;
    }
    
    public void method6843() {
	synchronized (aClass429Array4814) {
	    if (anInt4810 < anInt4809 - 1)
		aClass429Array4814[anInt4810++] = this;
	}
    }
    
    public static void method6844(int i) {
	anInt4809 = i;
	aClass429Array4814 = new Class429[i];
	anInt4810 = 0;
    }
    
    public Class429(Class429 class429_51_) {
	method6809(class429_51_);
    }
    
    public void method6845(RSBuffer class525_sub38) {
	aFloat4812 = class525_sub38.method16634(-2050335198);
	aFloat4811 = class525_sub38.method16634(-1924152715);
	aFloat4813 = class525_sub38.method16634(265582083);
	aFloat4815 = class525_sub38.method16634(-68827156);
    }
    
    public void method6846(float f, float f_52_, float f_53_) {
	method6811(0.0F, 1.0F, 0.0F, f);
	Class429 class429_54_ = method6864();
	class429_54_.method6811(1.0F, 0.0F, 0.0F, f_52_);
	method6822(class429_54_);
	class429_54_.method6811(0.0F, 0.0F, 1.0F, f_53_);
	method6822(class429_54_);
	class429_54_.method6805();
    }
    
    final void method6847(Class429 class429_55_) {
	aFloat4812 += class429_55_.aFloat4812;
	aFloat4811 += class429_55_.aFloat4811;
	aFloat4813 += class429_55_.aFloat4813;
	aFloat4815 += class429_55_.aFloat4815;
    }
    
    public void method6848(Class429 class429_56_) {
	aFloat4812 = class429_56_.aFloat4812;
	aFloat4811 = class429_56_.aFloat4811;
	aFloat4813 = class429_56_.aFloat4813;
	aFloat4815 = class429_56_.aFloat4815;
    }
    
    public void method6849(Class429 class429_57_) {
	aFloat4812 = class429_57_.aFloat4812;
	aFloat4811 = class429_57_.aFloat4811;
	aFloat4813 = class429_57_.aFloat4813;
	aFloat4815 = class429_57_.aFloat4815;
    }
    
    public static Class429 method6850() {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429 = new Class429();
		return class429;
	    }
	    aClass429Array4814[--anInt4810].method6813();
	    Class429 class429 = aClass429Array4814[anInt4810];
	    return class429;
	}
    }
    
    public void method6851(float f, float f_58_, float f_59_) {
	method6811(0.0F, 1.0F, 0.0F, f);
	Class429 class429_60_ = method6864();
	class429_60_.method6811(1.0F, 0.0F, 0.0F, f_58_);
	method6822(class429_60_);
	class429_60_.method6811(0.0F, 0.0F, 1.0F, f_59_);
	method6822(class429_60_);
	class429_60_.method6805();
    }
    
    public void method6852(float f, float f_61_, float f_62_, float f_63_) {
	float f_64_ = (float) Math.sin((double) (f_63_ * 0.5F));
	float f_65_ = (float) Math.cos((double) (f_63_ * 0.5F));
	aFloat4812 = f * f_64_;
	aFloat4811 = f_61_ * f_64_;
	aFloat4813 = f_62_ * f_64_;
	aFloat4815 = f_65_;
    }
    
    public void method6853(float f, float f_66_, float f_67_, float f_68_) {
	float f_69_ = (float) Math.sin((double) (f_68_ * 0.5F));
	float f_70_ = (float) Math.cos((double) (f_68_ * 0.5F));
	aFloat4812 = f * f_69_;
	aFloat4811 = f_66_ * f_69_;
	aFloat4813 = f_67_ * f_69_;
	aFloat4815 = f_70_;
    }
    
    public void method6854(float f, float f_71_, float f_72_, float f_73_) {
	float f_74_ = (float) Math.sin((double) (f_73_ * 0.5F));
	float f_75_ = (float) Math.cos((double) (f_73_ * 0.5F));
	aFloat4812 = f * f_74_;
	aFloat4811 = f_71_ * f_74_;
	aFloat4813 = f_72_ * f_74_;
	aFloat4815 = f_75_;
    }
    
    static final Class429 method6855(Class429 class429, float f) {
	Class429 class429_76_ = method6801(class429);
	class429_76_.method6824(f);
	return class429_76_;
    }
    
    public final void method6856() {
	float f = 1.0F / method6857(this);
	aFloat4812 *= f;
	aFloat4811 *= f;
	aFloat4813 *= f;
	aFloat4815 *= f;
    }
    
    static final float method6857(Class429 class429) {
	return (float) Math.sqrt((double) method6820(class429, class429));
    }
    
    public void method6858(RSBuffer class525_sub38) {
	aFloat4812 = class525_sub38.method16634(-1132452709);
	aFloat4811 = class525_sub38.method16634(-1276452945);
	aFloat4813 = class525_sub38.method16634(683132873);
	aFloat4815 = class525_sub38.method16634(-2089803226);
    }
    
    final void method6859() {
	aFloat4813 = 0.0F;
	aFloat4811 = 0.0F;
	aFloat4812 = 0.0F;
	aFloat4815 = 1.0F;
    }
    
    public static final Class429 method6860(Class429 class429) {
	Class429 class429_77_ = method6801(class429);
	class429_77_.method6815();
	return class429_77_;
    }
    
    public static final Class429 method6861(Class429 class429) {
	Class429 class429_78_ = method6801(class429);
	class429_78_.method6815();
	return class429_78_;
    }
    
    public static Class429 method6862(Class429 class429) {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429_79_ = new Class429(class429);
		return class429_79_;
	    }
	    aClass429Array4814[--anInt4810].method6809(class429);
	    Class429 class429_80_ = aClass429Array4814[anInt4810];
	    return class429_80_;
	}
    }
    
    final void method6863(Class429 class429_81_) {
	aFloat4812 += class429_81_.aFloat4812;
	aFloat4811 += class429_81_.aFloat4811;
	aFloat4813 += class429_81_.aFloat4813;
	aFloat4815 += class429_81_.aFloat4815;
    }
    
    public static Class429 method6864() {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429 = new Class429();
		return class429;
	    }
	    aClass429Array4814[--anInt4810].method6813();
	    Class429 class429 = aClass429Array4814[anInt4810];
	    return class429;
	}
    }
    
    final float method6865(Class429 class429_82_) {
	return (aFloat4812 * class429_82_.aFloat4812
		+ aFloat4811 * class429_82_.aFloat4811
		+ aFloat4813 * class429_82_.aFloat4813
		+ aFloat4815 * class429_82_.aFloat4815);
    }
    
    final float method6866(Class429 class429_83_) {
	return (aFloat4812 * class429_83_.aFloat4812
		+ aFloat4811 * class429_83_.aFloat4811
		+ aFloat4813 * class429_83_.aFloat4813
		+ aFloat4815 * class429_83_.aFloat4815);
    }
    
    final void method6867() {
	aFloat4812 = -aFloat4812;
	aFloat4811 = -aFloat4811;
	aFloat4813 = -aFloat4813;
	aFloat4815 = -aFloat4815;
    }
    
    static final float method6868(Class429 class429) {
	return (float) Math.sqrt((double) method6820(class429, class429));
    }
    
    public final void method6869(Class429 class429_84_) {
	method6879((class429_84_.aFloat4815 * aFloat4812
		    + class429_84_.aFloat4812 * aFloat4815
		    + class429_84_.aFloat4811 * aFloat4813
		    - class429_84_.aFloat4813 * aFloat4811),
		   (class429_84_.aFloat4815 * aFloat4811
		    - class429_84_.aFloat4812 * aFloat4813
		    + class429_84_.aFloat4811 * aFloat4815
		    + class429_84_.aFloat4813 * aFloat4812),
		   (class429_84_.aFloat4815 * aFloat4813
		    + class429_84_.aFloat4812 * aFloat4811
		    - class429_84_.aFloat4811 * aFloat4812
		    + class429_84_.aFloat4813 * aFloat4815),
		   (class429_84_.aFloat4815 * aFloat4815
		    - class429_84_.aFloat4812 * aFloat4812
		    - class429_84_.aFloat4811 * aFloat4811
		    - class429_84_.aFloat4813 * aFloat4813));
    }
    
    public void method6870() {
	synchronized (aClass429Array4814) {
	    if (anInt4810 < anInt4809 - 1)
		aClass429Array4814[anInt4810++] = this;
	}
    }
    
    static final Class429 method6871(Class429 class429,
				     Class429 class429_85_) {
	Class429 class429_86_ = method6801(class429);
	class429_86_.method6822(class429_85_);
	return class429_86_;
    }
    
    final void method6872(float f) {
	aFloat4812 *= f;
	aFloat4811 *= f;
	aFloat4813 *= f;
	aFloat4815 *= f;
    }
    
    final void method6873(float f) {
	aFloat4812 *= f;
	aFloat4811 *= f;
	aFloat4813 *= f;
	aFloat4815 *= f;
    }
    
    public final void method6874(Class429 class429_87_, float f) {
	if (method6812(class429_87_) < 0.0F)
	    method6867();
	method6824(1.0F - f);
	Class429 class429_88_ = method6808(class429_87_, f);
	method6834(class429_88_);
	class429_88_.method6805();
	method6817();
    }
    
    final void method6875(float f) {
	aFloat4812 *= f;
	aFloat4811 *= f;
	aFloat4813 *= f;
	aFloat4815 *= f;
    }
    
    final void method6876(float f) {
	aFloat4812 *= f;
	aFloat4811 *= f;
	aFloat4813 *= f;
	aFloat4815 *= f;
    }
    
    static final Class429 method6877(Class429 class429, float f) {
	Class429 class429_89_ = method6801(class429);
	class429_89_.method6824(f);
	return class429_89_;
    }
    
    public static Class429 method6878(Class429 class429) {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429_90_ = new Class429(class429);
		return class429_90_;
	    }
	    aClass429Array4814[--anInt4810].method6809(class429);
	    Class429 class429_91_ = aClass429Array4814[anInt4810];
	    return class429_91_;
	}
    }
    
    void method6879(float f, float f_92_, float f_93_, float f_94_) {
	aFloat4812 = f;
	aFloat4811 = f_92_;
	aFloat4813 = f_93_;
	aFloat4815 = f_94_;
    }
    
    static Class429 method6880(float f, float f_95_, float f_96_,
			       float f_97_) {
	synchronized (aClass429Array4814) {
	    if (anInt4810 == 0) {
		Class429 class429 = new Class429(f, f_95_, f_96_, f_97_);
		return class429;
	    }
	    aClass429Array4814[--anInt4810].method6879(f, f_95_, f_96_, f_97_);
	    Class429 class429 = aClass429Array4814[anInt4810];
	    return class429;
	}
    }
    
    public final void method6881(Class429 class429_98_, float f) {
	if (method6812(class429_98_) < 0.0F)
	    method6867();
	method6824(1.0F - f);
	Class429 class429_99_ = method6808(class429_98_, f);
	method6834(class429_99_);
	class429_99_.method6805();
	method6817();
    }
    
    public final void method6882(Class429 class429_100_, float f) {
	if (method6812(class429_100_) < 0.0F)
	    method6867();
	method6824(1.0F - f);
	Class429 class429_101_ = method6808(class429_100_, f);
	method6834(class429_101_);
	class429_101_.method6805();
	method6817();
    }
    
    static final Class429 method6883(Class429 class429, float f) {
	Class429 class429_102_ = method6801(class429);
	class429_102_.method6824(f);
	return class429_102_;
    }
}
