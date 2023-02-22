/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class17 implements Interface5
{
    Interface13 anInterface13_189;
    boolean aBool190;
    JS5 aClass458_191;
    String[] aStringArray192;
    Class611 aClass611_193;
    Class13 aClass13_194;
    String[] aStringArray195;
    int anInt196;
    Class200 aClass200_197 = new Class200(50);
    Class666 aClass666_198;
    static String aString199;
    
    Class157 method768
	(Class182 class182, Class182 class182_0_, int i, int i_1_, int i_2_,
	 int i_3_, boolean bool, boolean bool_4_, int i_5_, Class175 class175,
	 Class637 class637, Class631 class631, Interface13 interface13) {
	if (!bool_4_) {
	    Class157 class157 = method769(class182_0_, i, i_1_, i_2_, i_3_,
					  i_5_, class637, 1969859793);
	    if (class157 != null)
		return class157;
	}
	ItemDefinitions class8 = (ItemDefinitions) interface13.method76(i, 1768328506);
	if (i_1_ > 1 && null != class8.anIntArray107) {
	    int i_6_ = -1;
	    for (int i_7_ = 0; i_7_ < 10; i_7_++) {
		if (i_1_ >= class8.anIntArray108[i_7_]
		    && class8.anIntArray108[i_7_] != 0)
		    i_6_ = class8.anIntArray107[i_7_];
	    }
	    if (i_6_ != -1)
		class8 = (ItemDefinitions) interface13.method76(i_6_, -216636605);
	}
	int[] is
	    = class8.method622(class182, class182_0_, i_1_, i_2_, i_3_, bool,
			       i_5_, class175, class637, class631, 1490114299);
	if (null == is)
	    return null;
	Class157 class157;
	if (bool_4_)
	    class157 = class182.method3215(is, 0, 36, 36, 32, (byte) 104);
	else
	    class157 = class182_0_.method3215(is, 0, 36, 36, 32, (byte) 65);
	if (!bool_4_) {
	    Class13 class13 = new Class13();
	    class13.anInt167 = class182_0_.anInt1942 * -1092940553;
	    class13.anInt162 = i * -505373651;
	    class13.anInt163 = i_1_ * 1841155941;
	    class13.anInt165 = 828015749 * i_2_;
	    class13.anInt161 = i_3_ * 1388416127;
	    class13.anInt166 = i_5_ * -532508567;
	    class13.aBool164 = null != class637;
	    aClass611_193.method10031(class157, class13);
	}
	return class157;
    }
    
    Class157 method769(Class182 class182, int i, int i_8_, int i_9_, int i_10_,
		       int i_11_, Class637 class637, int i_12_) {
	aClass13_194.anInt167 = class182.anInt1942 * -1092940553;
	aClass13_194.anInt162 = -505373651 * i;
	aClass13_194.anInt163 = 1841155941 * i_8_;
	aClass13_194.anInt165 = i_9_ * 828015749;
	aClass13_194.anInt161 = i_10_ * 1388416127;
	aClass13_194.anInt166 = -532508567 * i_11_;
	aClass13_194.aBool164 = null != class637;
	return (Class157) aClass611_193.method10028(aClass13_194);
    }
    
    Class17(Class668 class668, Class666 class666, boolean bool,
            JS5 class458, Interface13 interface13) {
	aClass611_193 = new Class611(250);
	aClass13_194 = new Class13();
	aClass666_198 = class666;
	aBool190 = bool;
	aClass458_191 = class458;
	anInterface13_189 = interface13;
	if (class668 == Class668.aClass668_8576)
	    aStringArray195
		= new String[] { null, null,
				 Class53.aClass53_393.method1169(aClass666_198,
								 1552651121),
				 null, null,
				 Class53.aClass53_509.method1169(aClass666_198,
								 1552651121) };
	else
	    aStringArray195
		= new String[] { null, null,
				 Class53.aClass53_393.method1169(aClass666_198,
								 1552651121),
				 null, null, null };
	aStringArray192
	    = new String[] { null, null, null, null,
			     Class53.aClass53_549.method1169(aClass666_198,
							     1552651121) };
    }
    
    void method770(boolean bool, byte i) {
	if (bool != aBool190) {
	    aBool190 = bool;
	    method772((byte) 77);
	}
    }
    
    void method771(int i, short i_13_) {
	anInt196 = 1164413843 * i;
	synchronized (aClass200_197) {
	    aClass200_197.method3791((byte) -81);
	}
    }
    
    void method772(byte i) {
	synchronized (aClass200_197) {
	    aClass200_197.method3791((byte) -23);
	}
	synchronized (aClass611_193) {
	    aClass611_193.method10027();
	}
    }
    
    Class157 method773(Class182 class182, Class182 class182_14_, int i,
		       int i_15_, int i_16_, int i_17_, boolean bool,
		       boolean bool_18_, int i_19_, Class175 class175,
		       Class637 class637, Class631 class631,
		       Interface13 interface13) {
	if (!bool_18_) {
	    Class157 class157 = method769(class182_14_, i, i_15_, i_16_, i_17_,
					  i_19_, class637, 1269680684);
	    if (class157 != null)
		return class157;
	}
	ItemDefinitions class8 = (ItemDefinitions) interface13.method76(i, -548481733);
	if (i_15_ > 1 && null != class8.anIntArray107) {
	    int i_20_ = -1;
	    for (int i_21_ = 0; i_21_ < 10; i_21_++) {
		if (i_15_ >= class8.anIntArray108[i_21_]
		    && class8.anIntArray108[i_21_] != 0)
		    i_20_ = class8.anIntArray107[i_21_];
	    }
	    if (i_20_ != -1)
		class8 = (ItemDefinitions) interface13.method76(i_20_, 1307881055);
	}
	int[] is = class8.method622(class182, class182_14_, i_15_, i_16_,
				    i_17_, bool, i_19_, class175, class637,
				    class631, 1729014609);
	if (null == is)
	    return null;
	Class157 class157;
	if (bool_18_)
	    class157 = class182.method3215(is, 0, 36, 36, 32, (byte) 109);
	else
	    class157 = class182_14_.method3215(is, 0, 36, 36, 32, (byte) 34);
	if (!bool_18_) {
	    Class13 class13 = new Class13();
	    class13.anInt167 = class182_14_.anInt1942 * -1092940553;
	    class13.anInt162 = i * -505373651;
	    class13.anInt163 = i_15_ * 1841155941;
	    class13.anInt165 = 828015749 * i_16_;
	    class13.anInt161 = i_17_ * 1388416127;
	    class13.anInt166 = i_19_ * -532508567;
	    class13.aBool164 = null != class637;
	    aClass611_193.method10031(class157, class13);
	}
	return class157;
    }
    
    void method774(int i) {
	anInt196 = 1164413843 * i;
	synchronized (aClass200_197) {
	    aClass200_197.method3791((byte) -50);
	}
    }
    
    void method775(int i) {
	synchronized (aClass200_197) {
	    aClass200_197.method3809((byte) 47);
	}
	synchronized (aClass611_193) {
	    aClass611_193.method10040();
	}
    }
    
    Class157 method776(Class182 class182, int i, int i_22_, int i_23_,
		       int i_24_, int i_25_, Class637 class637) {
	aClass13_194.anInt167 = class182.anInt1942 * -1092940553;
	aClass13_194.anInt162 = -505373651 * i;
	aClass13_194.anInt163 = 1841155941 * i_22_;
	aClass13_194.anInt165 = i_23_ * 828015749;
	aClass13_194.anInt161 = i_24_ * 1388416127;
	aClass13_194.anInt166 = -532508567 * i_25_;
	aClass13_194.aBool164 = null != class637;
	return (Class157) aClass611_193.method10028(aClass13_194);
    }
    
    Class157 method777(Class182 class182, Class182 class182_26_, int i,
		       int i_27_, int i_28_, int i_29_, boolean bool,
		       boolean bool_30_, int i_31_, Class175 class175,
		       Class637 class637, Class631 class631,
		       Interface13 interface13) {
	if (!bool_30_) {
	    Class157 class157 = method769(class182_26_, i, i_27_, i_28_, i_29_,
					  i_31_, class637, 1968191377);
	    if (class157 != null)
		return class157;
	}
	ItemDefinitions class8 = (ItemDefinitions) interface13.method76(i, -608718681);
	if (i_27_ > 1 && null != class8.anIntArray107) {
	    int i_32_ = -1;
	    for (int i_33_ = 0; i_33_ < 10; i_33_++) {
		if (i_27_ >= class8.anIntArray108[i_33_]
		    && class8.anIntArray108[i_33_] != 0)
		    i_32_ = class8.anIntArray107[i_33_];
	    }
	    if (i_32_ != -1)
		class8 = (ItemDefinitions) interface13.method76(i_32_, 1738145049);
	}
	int[] is = class8.method622(class182, class182_26_, i_27_, i_28_,
				    i_29_, bool, i_31_, class175, class637,
				    class631, 2020511261);
	if (null == is)
	    return null;
	Class157 class157;
	if (bool_30_)
	    class157 = class182.method3215(is, 0, 36, 36, 32, (byte) 117);
	else
	    class157 = class182_26_.method3215(is, 0, 36, 36, 32, (byte) 77);
	if (!bool_30_) {
	    Class13 class13 = new Class13();
	    class13.anInt167 = class182_26_.anInt1942 * -1092940553;
	    class13.anInt162 = i * -505373651;
	    class13.anInt163 = i_27_ * 1841155941;
	    class13.anInt165 = 828015749 * i_28_;
	    class13.anInt161 = i_29_ * 1388416127;
	    class13.anInt166 = i_31_ * -532508567;
	    class13.aBool164 = null != class637;
	    aClass611_193.method10031(class157, class13);
	}
	return class157;
    }
    
    void method778(boolean bool) {
	if (bool != aBool190) {
	    aBool190 = bool;
	    method772((byte) -12);
	}
    }
    
    void method779(int i, int i_34_) {
	synchronized (aClass200_197) {
	    aClass200_197.method3805(i, 1963482664);
	}
	synchronized (aClass611_193) {
	    aClass611_193.method10033(i);
	}
    }
    
    void method780(int i) {
	synchronized (aClass200_197) {
	    aClass200_197.method3805(i, 2017978311);
	}
	synchronized (aClass611_193) {
	    aClass611_193.method10033(i);
	}
    }
    
    void method781(int i) {
	synchronized (aClass611_193) {
	    aClass611_193.method10027();
	}
    }
    
    void method782(boolean bool) {
	if (bool != aBool190) {
	    aBool190 = bool;
	    method772((byte) -72);
	}
    }
    
    void method783() {
	synchronized (aClass200_197) {
	    aClass200_197.method3791((byte) 59);
	}
	synchronized (aClass611_193) {
	    aClass611_193.method10027();
	}
    }
    
    void method784() {
	synchronized (aClass611_193) {
	    aClass611_193.method10027();
	}
    }
    
    void method785() {
	synchronized (aClass611_193) {
	    aClass611_193.method10027();
	}
    }
    
    void method786() {
	synchronized (aClass611_193) {
	    aClass611_193.method10027();
	}
    }
    
    Class157 method787(Class182 class182, Class182 class182_35_, int i,
		       int i_36_, int i_37_, int i_38_, boolean bool,
		       boolean bool_39_, int i_40_, Class175 class175,
		       Class637 class637, Class631 class631,
		       Interface13 interface13, int i_41_) {
	if (!bool_39_) {
	    Class157 class157 = method769(class182_35_, i, i_36_, i_37_, i_38_,
					  i_40_, class637, 531326423);
	    if (class157 != null)
		return class157;
	}
	ItemDefinitions class8 = (ItemDefinitions) interface13.method76(i, 1580598530);
	if (i_36_ > 1 && null != class8.anIntArray107) {
	    int i_42_ = -1;
	    for (int i_43_ = 0; i_43_ < 10; i_43_++) {
		if (i_36_ >= class8.anIntArray108[i_43_]
		    && class8.anIntArray108[i_43_] != 0)
		    i_42_ = class8.anIntArray107[i_43_];
	    }
	    if (i_42_ != -1)
		class8 = (ItemDefinitions) interface13.method76(i_42_, -1152804366);
	}
	int[] is = class8.method622(class182, class182_35_, i_36_, i_37_,
				    i_38_, bool, i_40_, class175, class637,
				    class631, -1749803236);
	if (null == is)
	    return null;
	Class157 class157;
	if (bool_39_)
	    class157 = class182.method3215(is, 0, 36, 36, 32, (byte) 101);
	else
	    class157 = class182_35_.method3215(is, 0, 36, 36, 32, (byte) 35);
	if (!bool_39_) {
	    Class13 class13 = new Class13();
	    class13.anInt167 = class182_35_.anInt1942 * -1092940553;
	    class13.anInt162 = i * -505373651;
	    class13.anInt163 = i_36_ * 1841155941;
	    class13.anInt165 = 828015749 * i_37_;
	    class13.anInt161 = i_38_ * 1388416127;
	    class13.anInt166 = i_40_ * -532508567;
	    class13.aBool164 = null != class637;
	    aClass611_193.method10031(class157, class13);
	}
	return class157;
    }
    
    void method788(int i) {
	synchronized (aClass200_197) {
	    aClass200_197.method3805(i, 1956990123);
	}
	synchronized (aClass611_193) {
	    aClass611_193.method10033(i);
	}
    }
    
    void method789(int i) {
	synchronized (aClass200_197) {
	    aClass200_197.method3805(i, 1897850237);
	}
	synchronized (aClass611_193) {
	    aClass611_193.method10033(i);
	}
    }
    
    void method790(int i) {
	synchronized (aClass200_197) {
	    aClass200_197.method3805(i, 2144395126);
	}
	synchronized (aClass611_193) {
	    aClass611_193.method10033(i);
	}
    }
    
    void method791() {
	synchronized (aClass200_197) {
	    aClass200_197.method3809((byte) 97);
	}
	synchronized (aClass611_193) {
	    aClass611_193.method10040();
	}
    }
    
    static final void method792(Class683 class683, int i) {
	int i_44_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.anIntArray3780[i_44_];
    }
}
