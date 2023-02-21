/* Class446 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class446
{
    static int anInt4892;
    static Class446[] aClass446Array4893;
    static int anInt4894;
    public float aFloat4895;
    public float aFloat4896;
    public float aFloat4897;
    
    public String method7206() {
	return new StringBuilder().append(aFloat4895).append(", ").append
		   (aFloat4896).append
		   (", ").append
		   (aFloat4897).toString();
    }
    
    public static Class446 method7207() {
	synchronized (aClass446Array4893) {
	    if (anInt4894 == 0) {
		Class446 class446 = new Class446();
		return class446;
	    }
	    aClass446Array4893[--anInt4894].method7217();
	    Class446 class446 = aClass446Array4893[anInt4894];
	    return class446;
	}
    }
    
    public static Class446 method7208(float f, float f_0_, float f_1_) {
	synchronized (aClass446Array4893) {
	    if (anInt4894 == 0) {
		Class446 class446 = new Class446(f, f_0_, f_1_);
		return class446;
	    }
	    aClass446Array4893[--anInt4894].method7265(f, f_0_, f_1_);
	    Class446 class446 = aClass446Array4893[anInt4894];
	    return class446;
	}
    }
    
    public static Class446 method7209(Class446 class446) {
	synchronized (aClass446Array4893) {
	    if (anInt4894 == 0) {
		Class446 class446_2_ = new Class446(class446);
		return class446_2_;
	    }
	    aClass446Array4893[--anInt4894].method7216(class446);
	    Class446 class446_3_ = aClass446Array4893[anInt4894];
	    return class446_3_;
	}
    }
    
    public static Class446 method7210(RSBuffer class525_sub38) {
	synchronized (aClass446Array4893) {
	    if (anInt4894 == 0) {
		Class446 class446 = new Class446(class525_sub38);
		return class446;
	    }
	    aClass446Array4893[--anInt4894].method7215(class525_sub38);
	    Class446 class446 = aClass446Array4893[anInt4894];
	    return class446;
	}
    }
    
    public static void method7211(int i) {
	anInt4892 = i;
	aClass446Array4893 = new Class446[i];
	anInt4894 = 0;
    }
    
    public void method7212(Class446 class446_4_) {
	method7265(class446_4_.aFloat4895, class446_4_.aFloat4896,
		   class446_4_.aFloat4897);
    }
    
    public final void method7213() {
	if (aFloat4895 < 0.0F)
	    aFloat4895 *= -1.0F;
	if (aFloat4896 < 0.0F)
	    aFloat4896 *= -1.0F;
	if (aFloat4897 < 0.0F)
	    aFloat4897 *= -1.0F;
    }
    
    public final void method7214() {
	float f = 1.0F / method7230();
	aFloat4895 *= f;
	aFloat4896 *= f;
	aFloat4897 *= f;
    }
    
    public Class446() {
	/* empty */
    }
    
    public void method7215(RSBuffer class525_sub38) {
	aFloat4895 = class525_sub38.method16634(-156119781);
	aFloat4896 = class525_sub38.method16634(679410988);
	aFloat4897 = class525_sub38.method16634(-1483413191);
    }
    
    public Class446(Class446 class446_5_) {
	aFloat4895 = class446_5_.aFloat4895;
	aFloat4896 = class446_5_.aFloat4896;
	aFloat4897 = class446_5_.aFloat4897;
    }
    
    public void method7216(Class446 class446_6_) {
	method7265(class446_6_.aFloat4895, class446_6_.aFloat4896,
		   class446_6_.aFloat4897);
    }
    
    public final void method7217() {
	aFloat4897 = 0.0F;
	aFloat4896 = 0.0F;
	aFloat4895 = 0.0F;
    }
    
    public boolean method7218(Class446 class446_7_) {
	if (aFloat4895 != class446_7_.aFloat4895
	    || aFloat4896 != class446_7_.aFloat4896
	    || aFloat4897 != class446_7_.aFloat4897)
	    return false;
	return true;
    }
    
    public final void method7219() {
	aFloat4895 = -aFloat4895;
	aFloat4896 = -aFloat4896;
	aFloat4897 = -aFloat4897;
    }
    
    public final void method7220() {
	float f = 1.0F / method7230();
	aFloat4895 *= f;
	aFloat4896 *= f;
	aFloat4897 *= f;
    }
    
    public final void method7221(Class446 class446_8_) {
	aFloat4895 += class446_8_.aFloat4895;
	aFloat4896 += class446_8_.aFloat4896;
	aFloat4897 += class446_8_.aFloat4897;
    }
    
    public final void method7222(Class446 class446_9_, float f) {
	aFloat4895 += class446_9_.aFloat4895 * f;
	aFloat4896 += class446_9_.aFloat4896 * f;
	aFloat4897 += class446_9_.aFloat4897 * f;
    }
    
    public static final Class446 method7223(Class446 class446,
					    Class446 class446_10_) {
	Class446 class446_11_ = method7209(class446);
	class446_11_.method7221(class446_10_);
	return class446_11_;
    }
    
    public final void method7224(Class446 class446_12_, float f) {
	method7281(1.0F - f);
	method7221(method7238(class446_12_, f));
    }
    
    public static final Class446 method7225(Class446 class446,
					    Class446 class446_13_) {
	Class446 class446_14_ = method7209(class446);
	class446_14_.method7300(class446_13_);
	return class446_14_;
    }
    
    public final float method7226(Class446 class446_15_) {
	return (aFloat4895 * class446_15_.aFloat4895
		+ aFloat4896 * class446_15_.aFloat4896
		+ aFloat4897 * class446_15_.aFloat4897);
    }
    
    public static final Class446 method7227(Class446 class446, float f) {
	Class446 class446_16_ = method7209(class446);
	class446_16_.method7281(f);
	return class446_16_;
    }
    
    final void method7228(Class446 class446_17_) {
	method7265((aFloat4896 * class446_17_.aFloat4897
		    - aFloat4897 * class446_17_.aFloat4896),
		   (aFloat4897 * class446_17_.aFloat4895
		    - aFloat4895 * class446_17_.aFloat4897),
		   (aFloat4895 * class446_17_.aFloat4896
		    - aFloat4896 * class446_17_.aFloat4895));
    }
    
    public static final Class446 method7229(Class446 class446,
					    Class446 class446_18_) {
	Class446 class446_19_ = method7209(class446);
	class446_19_.method7228(class446_18_);
	return class446_19_;
    }
    
    public final float method7230() {
	return (float) Math.sqrt((double) (aFloat4895 * aFloat4895
					   + aFloat4896 * aFloat4896
					   + aFloat4897 * aFloat4897));
    }
    
    public final void method7231() {
	if (aFloat4895 < 0.0F)
	    aFloat4895 *= -1.0F;
	if (aFloat4896 < 0.0F)
	    aFloat4896 *= -1.0F;
	if (aFloat4897 < 0.0F)
	    aFloat4897 *= -1.0F;
    }
    
    final void method7232(Class446 class446_20_) {
	aFloat4895 *= class446_20_.aFloat4895;
	aFloat4896 *= class446_20_.aFloat4896;
	aFloat4897 *= class446_20_.aFloat4897;
    }
    
    public static final Class446 method7233(Class446 class446,
					    Class446 class446_21_) {
	Class446 class446_22_ = method7209(class446);
	class446_22_.method7232(class446_21_);
	return class446_22_;
    }
    
    public static final float method7234(Class446 class446,
					 Class446 class446_23_) {
	return class446.method7226(class446_23_);
    }
    
    final void method7235(Class446 class446_24_) {
	aFloat4895 /= class446_24_.aFloat4895;
	aFloat4896 /= class446_24_.aFloat4896;
	aFloat4897 /= class446_24_.aFloat4897;
    }
    
    public static final Class446 method7236(Class446 class446,
					    Class446 class446_25_) {
	Class446 class446_26_ = method7209(class446);
	class446_26_.method7235(class446_25_);
	return class446_26_;
    }
    
    public final void method7237(float f) {
	aFloat4895 /= f;
	aFloat4896 /= f;
	aFloat4897 /= f;
    }
    
    public static final Class446 method7238(Class446 class446, float f) {
	Class446 class446_27_ = method7209(class446);
	class446_27_.method7281(f);
	return class446_27_;
    }
    
    public final void method7239(Class429 class429) {
	Class429 class429_28_
	    = Class429.method6803(aFloat4895, aFloat4896, aFloat4897, 0.0F);
	Class429 class429_29_ = Class429.method6816(class429);
	Class429 class429_30_
	    = Class429.method6823(class429_29_, class429_28_);
	class429_30_.method6822(class429);
	method7265(class429_30_.aFloat4812, class429_30_.aFloat4811,
		   class429_30_.aFloat4813);
	class429_28_.method6805();
	class429_29_.method6805();
	class429_30_.method6805();
    }
    
    public final void method7240(Class444 class444) {
	float f = aFloat4895;
	float f_31_ = aFloat4896;
	aFloat4895
	    = (class444.aFloat4879 * f + class444.aFloat4882 * f_31_
	       + class444.aFloat4885 * aFloat4897 + class444.aFloat4888);
	aFloat4896
	    = (class444.aFloat4878 * f + class444.aFloat4883 * f_31_
	       + class444.aFloat4884 * aFloat4897 + class444.aFloat4886);
	aFloat4897
	    = (class444.aFloat4881 * f + class444.aFloat4890 * f_31_
	       + class444.aFloat4887 * aFloat4897 + class444.aFloat4880);
    }
    
    public final void method7241(Class444 class444) {
	float f = aFloat4895;
	float f_32_ = aFloat4896;
	aFloat4895 = (class444.aFloat4879 * f + class444.aFloat4882 * f_32_
		      + class444.aFloat4885 * aFloat4897);
	aFloat4896 = (class444.aFloat4878 * f + class444.aFloat4883 * f_32_
		      + class444.aFloat4884 * aFloat4897);
	aFloat4897 = (class444.aFloat4881 * f + class444.aFloat4890 * f_32_
		      + class444.aFloat4887 * aFloat4897);
    }
    
    public final void method7242(Class446 class446_33_, float f) {
	method7281(1.0F - f);
	method7221(method7238(class446_33_, f));
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4895).append(", ").append
		   (aFloat4896).append
		   (", ").append
		   (aFloat4897).toString();
    }
    
    static {
	new Class446(0.0F, 0.0F, 0.0F);
	aClass446Array4893 = new Class446[0];
    }
    
    public String method7243() {
	return new StringBuilder().append(aFloat4895).append(", ").append
		   (aFloat4896).append
		   (", ").append
		   (aFloat4897).toString();
    }
    
    public String method7244() {
	return new StringBuilder().append(aFloat4895).append(", ").append
		   (aFloat4896).append
		   (", ").append
		   (aFloat4897).toString();
    }
    
    public void method7245() {
	synchronized (aClass446Array4893) {
	    if (anInt4894 < anInt4892 - 1)
		aClass446Array4893[anInt4894++] = this;
	}
    }
    
    public final void method7246() {
	float f = 1.0F / method7230();
	aFloat4895 *= f;
	aFloat4896 *= f;
	aFloat4897 *= f;
    }
    
    public final void method7247(float f) {
	aFloat4895 /= f;
	aFloat4896 /= f;
	aFloat4897 /= f;
    }
    
    public static final Class446 method7248(Class446 class446,
					    Class446 class446_34_) {
	Class446 class446_35_ = method7209(class446);
	class446_35_.method7232(class446_34_);
	return class446_35_;
    }
    
    public static Class446 method7249(Class446 class446) {
	synchronized (aClass446Array4893) {
	    if (anInt4894 == 0) {
		Class446 class446_36_ = new Class446(class446);
		return class446_36_;
	    }
	    aClass446Array4893[--anInt4894].method7216(class446);
	    Class446 class446_37_ = aClass446Array4893[anInt4894];
	    return class446_37_;
	}
    }
    
    public static Class446 method7250(Class446 class446) {
	synchronized (aClass446Array4893) {
	    if (anInt4894 == 0) {
		Class446 class446_38_ = new Class446(class446);
		return class446_38_;
	    }
	    aClass446Array4893[--anInt4894].method7216(class446);
	    Class446 class446_39_ = aClass446Array4893[anInt4894];
	    return class446_39_;
	}
    }
    
    public final void method7251(Class446 class446_40_) {
	aFloat4895 += class446_40_.aFloat4895;
	aFloat4896 += class446_40_.aFloat4896;
	aFloat4897 += class446_40_.aFloat4897;
    }
    
    public final float method7252(Class446 class446_41_) {
	return (aFloat4895 * class446_41_.aFloat4895
		+ aFloat4896 * class446_41_.aFloat4896
		+ aFloat4897 * class446_41_.aFloat4897);
    }
    
    public static Class446 method7253() {
	synchronized (aClass446Array4893) {
	    if (anInt4894 == 0) {
		Class446 class446 = new Class446();
		return class446;
	    }
	    aClass446Array4893[--anInt4894].method7217();
	    Class446 class446 = aClass446Array4893[anInt4894];
	    return class446;
	}
    }
    
    public final void method7254(float f) {
	aFloat4895 *= f;
	aFloat4896 *= f;
	aFloat4897 *= f;
    }
    
    public final float method7255(Class446 class446_42_) {
	return (aFloat4895 * class446_42_.aFloat4895
		+ aFloat4896 * class446_42_.aFloat4896
		+ aFloat4897 * class446_42_.aFloat4897);
    }
    
    public static final Class446 method7256(Class446 class446,
					    Class446 class446_43_) {
	Class446 class446_44_ = method7209(class446);
	class446_44_.method7235(class446_43_);
	return class446_44_;
    }
    
    public void method7257(Class446 class446_45_) {
	method7265(class446_45_.aFloat4895, class446_45_.aFloat4896,
		   class446_45_.aFloat4897);
    }
    
    public final void method7258() {
	aFloat4897 = 0.0F;
	aFloat4896 = 0.0F;
	aFloat4895 = 0.0F;
    }
    
    public boolean method7259(Class446 class446_46_) {
	if (aFloat4895 != class446_46_.aFloat4895
	    || aFloat4896 != class446_46_.aFloat4896
	    || aFloat4897 != class446_46_.aFloat4897)
	    return false;
	return true;
    }
    
    public void method7260() {
	synchronized (aClass446Array4893) {
	    if (anInt4894 < anInt4892 - 1)
		aClass446Array4893[anInt4894++] = this;
	}
    }
    
    final void method7261(Class446 class446_47_) {
	aFloat4895 *= class446_47_.aFloat4895;
	aFloat4896 *= class446_47_.aFloat4896;
	aFloat4897 *= class446_47_.aFloat4897;
    }
    
    public final void method7262() {
	float f = 1.0F / method7230();
	aFloat4895 *= f;
	aFloat4896 *= f;
	aFloat4897 *= f;
    }
    
    public final void method7263(Class446 class446_48_) {
	aFloat4895 += class446_48_.aFloat4895;
	aFloat4896 += class446_48_.aFloat4896;
	aFloat4897 += class446_48_.aFloat4897;
    }
    
    final void method7264(Class446 class446_49_) {
	aFloat4895 *= class446_49_.aFloat4895;
	aFloat4896 *= class446_49_.aFloat4896;
	aFloat4897 *= class446_49_.aFloat4897;
    }
    
    public void method7265(float f, float f_50_, float f_51_) {
	aFloat4895 = f;
	aFloat4896 = f_50_;
	aFloat4897 = f_51_;
    }
    
    public Class446(float f, float f_52_, float f_53_) {
	aFloat4895 = f;
	aFloat4896 = f_52_;
	aFloat4897 = f_53_;
    }
    
    public void method7266(float f, float f_54_, float f_55_) {
	aFloat4895 = f;
	aFloat4896 = f_54_;
	aFloat4897 = f_55_;
    }
    
    public final float method7267() {
	return (float) Math.sqrt((double) (aFloat4895 * aFloat4895
					   + aFloat4896 * aFloat4896
					   + aFloat4897 * aFloat4897));
    }
    
    public static final Class446 method7268(Class446 class446,
					    Class446 class446_56_) {
	Class446 class446_57_ = method7209(class446);
	class446_57_.method7300(class446_56_);
	return class446_57_;
    }
    
    public static final Class446 method7269(Class446 class446,
					    Class446 class446_58_) {
	Class446 class446_59_ = method7209(class446);
	class446_59_.method7221(class446_58_);
	return class446_59_;
    }
    
    public final float method7270(Class446 class446_60_) {
	return (aFloat4895 * class446_60_.aFloat4895
		+ aFloat4896 * class446_60_.aFloat4896
		+ aFloat4897 * class446_60_.aFloat4897);
    }
    
    public static final Class446 method7271(Class446 class446,
					    Class446 class446_61_) {
	Class446 class446_62_ = method7209(class446);
	class446_62_.method7232(class446_61_);
	return class446_62_;
    }
    
    public final float method7272(Class446 class446_63_) {
	return (aFloat4895 * class446_63_.aFloat4895
		+ aFloat4896 * class446_63_.aFloat4896
		+ aFloat4897 * class446_63_.aFloat4897);
    }
    
    public final void method7273(Class446 class446_64_) {
	aFloat4895 += class446_64_.aFloat4895;
	aFloat4896 += class446_64_.aFloat4896;
	aFloat4897 += class446_64_.aFloat4897;
    }
    
    public static final float method7274(Class446 class446,
					 Class446 class446_65_) {
	return class446.method7226(class446_65_);
    }
    
    final void method7275(Class446 class446_66_) {
	method7265((aFloat4896 * class446_66_.aFloat4897
		    - aFloat4897 * class446_66_.aFloat4896),
		   (aFloat4897 * class446_66_.aFloat4895
		    - aFloat4895 * class446_66_.aFloat4897),
		   (aFloat4895 * class446_66_.aFloat4896
		    - aFloat4896 * class446_66_.aFloat4895));
    }
    
    public static final Class446 method7276(Class446 class446,
					    Class446 class446_67_) {
	Class446 class446_68_ = method7209(class446);
	class446_68_.method7228(class446_67_);
	return class446_68_;
    }
    
    public static final Class446 method7277(Class446 class446,
					    Class446 class446_69_) {
	Class446 class446_70_ = method7209(class446);
	class446_70_.method7228(class446_69_);
	return class446_70_;
    }
    
    public final float method7278() {
	return (float) Math.sqrt((double) (aFloat4895 * aFloat4895
					   + aFloat4896 * aFloat4896
					   + aFloat4897 * aFloat4897));
    }
    
    public static Class446 method7279() {
	synchronized (aClass446Array4893) {
	    if (anInt4894 == 0) {
		Class446 class446 = new Class446();
		return class446;
	    }
	    aClass446Array4893[--anInt4894].method7217();
	    Class446 class446 = aClass446Array4893[anInt4894];
	    return class446;
	}
    }
    
    public final float method7280() {
	return (float) Math.sqrt((double) (aFloat4895 * aFloat4895
					   + aFloat4896 * aFloat4896
					   + aFloat4897 * aFloat4897));
    }
    
    public final void method7281(float f) {
	aFloat4895 *= f;
	aFloat4896 *= f;
	aFloat4897 *= f;
    }
    
    public final void method7282(Class429 class429) {
	Class429 class429_71_
	    = Class429.method6803(aFloat4895, aFloat4896, aFloat4897, 0.0F);
	Class429 class429_72_ = Class429.method6816(class429);
	Class429 class429_73_
	    = Class429.method6823(class429_72_, class429_71_);
	class429_73_.method6822(class429);
	method7265(class429_73_.aFloat4812, class429_73_.aFloat4811,
		   class429_73_.aFloat4813);
	class429_71_.method6805();
	class429_72_.method6805();
	class429_73_.method6805();
    }
    
    public static final Class446 method7283(Class446 class446,
					    Class446 class446_74_) {
	Class446 class446_75_ = method7209(class446);
	class446_75_.method7300(class446_74_);
	return class446_75_;
    }
    
    public static void method7284(int i) {
	anInt4892 = i;
	aClass446Array4893 = new Class446[i];
	anInt4894 = 0;
    }
    
    public static final Class446 method7285(Class446 class446,
					    Class446 class446_76_) {
	Class446 class446_77_ = method7209(class446);
	class446_77_.method7232(class446_76_);
	return class446_77_;
    }
    
    public static final Class446 method7286(Class446 class446,
					    Class446 class446_78_) {
	Class446 class446_79_ = method7209(class446);
	class446_79_.method7232(class446_78_);
	return class446_79_;
    }
    
    public static final Class446 method7287(Class446 class446,
					    Class446 class446_80_) {
	Class446 class446_81_ = method7209(class446);
	class446_81_.method7232(class446_80_);
	return class446_81_;
    }
    
    Class446(RSBuffer class525_sub38) {
	aFloat4895 = class525_sub38.method16634(-1973419842);
	aFloat4896 = class525_sub38.method16634(-344966327);
	aFloat4897 = class525_sub38.method16634(-271048158);
    }
    
    public final void method7288(Class429 class429) {
	Class429 class429_82_
	    = Class429.method6803(aFloat4895, aFloat4896, aFloat4897, 0.0F);
	Class429 class429_83_ = Class429.method6816(class429);
	Class429 class429_84_
	    = Class429.method6823(class429_83_, class429_82_);
	class429_84_.method6822(class429);
	method7265(class429_84_.aFloat4812, class429_84_.aFloat4811,
		   class429_84_.aFloat4813);
	class429_82_.method6805();
	class429_83_.method6805();
	class429_84_.method6805();
    }
    
    final void method7289(Class446 class446_85_) {
	aFloat4895 /= class446_85_.aFloat4895;
	aFloat4896 /= class446_85_.aFloat4896;
	aFloat4897 /= class446_85_.aFloat4897;
    }
    
    final void method7290(Class446 class446_86_) {
	aFloat4895 /= class446_86_.aFloat4895;
	aFloat4896 /= class446_86_.aFloat4896;
	aFloat4897 /= class446_86_.aFloat4897;
    }
    
    final void method7291(Class446 class446_87_) {
	aFloat4895 /= class446_87_.aFloat4895;
	aFloat4896 /= class446_87_.aFloat4896;
	aFloat4897 /= class446_87_.aFloat4897;
    }
    
    public static final Class446 method7292(Class446 class446,
					    Class446 class446_88_) {
	Class446 class446_89_ = method7209(class446);
	class446_89_.method7235(class446_88_);
	return class446_89_;
    }
    
    public static final Class446 method7293(Class446 class446,
					    Class446 class446_90_) {
	Class446 class446_91_ = method7209(class446);
	class446_91_.method7235(class446_90_);
	return class446_91_;
    }
    
    public final float method7294(Class446 class446_92_) {
	return (aFloat4895 * class446_92_.aFloat4895
		+ aFloat4896 * class446_92_.aFloat4896
		+ aFloat4897 * class446_92_.aFloat4897);
    }
    
    public final void method7295(float f) {
	aFloat4895 /= f;
	aFloat4896 /= f;
	aFloat4897 /= f;
    }
    
    public static final Class446 method7296(Class446 class446,
					    Class446 class446_93_) {
	Class446 class446_94_ = method7209(class446);
	class446_94_.method7221(class446_93_);
	return class446_94_;
    }
    
    public void method7297(RSBuffer class525_sub38) {
	aFloat4895 = class525_sub38.method16634(-392877800);
	aFloat4896 = class525_sub38.method16634(-1098550645);
	aFloat4897 = class525_sub38.method16634(-572915107);
    }
    
    public static final Class446 method7298(Class446 class446, float f) {
	Class446 class446_95_ = method7209(class446);
	class446_95_.method7281(f);
	return class446_95_;
    }
    
    public static final Class446 method7299(Class446 class446, float f) {
	Class446 class446_96_ = method7209(class446);
	class446_96_.method7281(f);
	return class446_96_;
    }
    
    public final void method7300(Class446 class446_97_) {
	aFloat4895 -= class446_97_.aFloat4895;
	aFloat4896 -= class446_97_.aFloat4896;
	aFloat4897 -= class446_97_.aFloat4897;
    }
    
    public final void method7301(Class429 class429) {
	Class429 class429_98_
	    = Class429.method6803(aFloat4895, aFloat4896, aFloat4897, 0.0F);
	Class429 class429_99_ = Class429.method6816(class429);
	Class429 class429_100_
	    = Class429.method6823(class429_99_, class429_98_);
	class429_100_.method6822(class429);
	method7265(class429_100_.aFloat4812, class429_100_.aFloat4811,
		   class429_100_.aFloat4813);
	class429_98_.method6805();
	class429_99_.method6805();
	class429_100_.method6805();
    }
    
    public void method7302(RSBuffer class525_sub38) {
	aFloat4895 = class525_sub38.method16634(500033613);
	aFloat4896 = class525_sub38.method16634(-40222714);
	aFloat4897 = class525_sub38.method16634(611954024);
    }
    
    public final void method7303(Class444 class444) {
	float f = aFloat4895;
	float f_101_ = aFloat4896;
	aFloat4895
	    = (class444.aFloat4879 * f + class444.aFloat4882 * f_101_
	       + class444.aFloat4885 * aFloat4897 + class444.aFloat4888);
	aFloat4896
	    = (class444.aFloat4878 * f + class444.aFloat4883 * f_101_
	       + class444.aFloat4884 * aFloat4897 + class444.aFloat4886);
	aFloat4897
	    = (class444.aFloat4881 * f + class444.aFloat4890 * f_101_
	       + class444.aFloat4887 * aFloat4897 + class444.aFloat4880);
    }
    
    public final void method7304(Class444 class444) {
	float f = aFloat4895;
	float f_102_ = aFloat4896;
	aFloat4895 = (class444.aFloat4879 * f + class444.aFloat4882 * f_102_
		      + class444.aFloat4885 * aFloat4897);
	aFloat4896 = (class444.aFloat4878 * f + class444.aFloat4883 * f_102_
		      + class444.aFloat4884 * aFloat4897);
	aFloat4897 = (class444.aFloat4881 * f + class444.aFloat4890 * f_102_
		      + class444.aFloat4887 * aFloat4897);
    }
    
    public final void method7305(Class444 class444) {
	float f = aFloat4895;
	float f_103_ = aFloat4896;
	aFloat4895 = (class444.aFloat4879 * f + class444.aFloat4882 * f_103_
		      + class444.aFloat4885 * aFloat4897);
	aFloat4896 = (class444.aFloat4878 * f + class444.aFloat4883 * f_103_
		      + class444.aFloat4884 * aFloat4897);
	aFloat4897 = (class444.aFloat4881 * f + class444.aFloat4890 * f_103_
		      + class444.aFloat4887 * aFloat4897);
    }
    
    public final void method7306(Class446 class446_104_, float f) {
	method7281(1.0F - f);
	method7221(method7238(class446_104_, f));
    }
    
    public static Class446 method7307(Class446 class446) {
	synchronized (aClass446Array4893) {
	    if (anInt4894 == 0) {
		Class446 class446_105_ = new Class446(class446);
		return class446_105_;
	    }
	    aClass446Array4893[--anInt4894].method7216(class446);
	    Class446 class446_106_ = aClass446Array4893[anInt4894];
	    return class446_106_;
	}
    }
    
    public final void method7308(Class446 class446_107_, float f) {
	method7281(1.0F - f);
	method7221(method7238(class446_107_, f));
    }
    
    public final void method7309(Class446 class446_108_, float f) {
	method7281(1.0F - f);
	method7221(method7238(class446_108_, f));
    }
    
    public final void method7310(Class446 class446_109_, float f) {
	method7281(1.0F - f);
	method7221(method7238(class446_109_, f));
    }
}
