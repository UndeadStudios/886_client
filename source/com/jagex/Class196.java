/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class196 implements Interface57
{
    Class217 this$0;
    
    public void method360(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) 92);
	float f_0_ = class488.method7924(-591140228);
	Class446 class446_1_ = this$0.method4030(-1432253835);
	Class446 class446_2_ = Class446.method7225(class446, class446_1_);
	float f_3_ = 0.0F;
	float f_4_ = class446_2_.method7230();
	if (f_4_ >= f_0_)
	    f_3_ = 0.0F;
	else {
	    float f_5_ = ((Float) objects[0]).floatValue();
	    float f_6_ = ((Float) objects[1]).floatValue();
	    if (class446_1_.aFloat4895 > class446.aFloat4895 - f_5_ / 2.0F
		&& class446_1_.aFloat4895 < class446.aFloat4895 + f_5_ / 2.0F
		&& class446_1_.aFloat4897 > class446.aFloat4897 - f_6_ / 2.0F
		&& (class446_1_.aFloat4897
		    < f_6_ / 2.0F + class446.aFloat4897)) {
		float f_7_
		    = Math.abs(class446_1_.aFloat4895 - (class446.aFloat4895
							 + f_5_ / 2.0F));
		float f_8_
		    = Math.abs(class446_1_.aFloat4895 - (class446.aFloat4895
							 - f_5_ / 2.0F));
		float f_9_
		    = Math.abs(class446_1_.aFloat4897 - (class446.aFloat4895
							 + f_6_ / 2.0F));
		float f_10_
		    = Math.abs(class446_1_.aFloat4897 - (class446.aFloat4895
							 - f_6_ / 2.0F));
		float f_11_ = f_0_ - f;
		float f_12_ = Math.min(f_7_, f_8_);
		float f_13_ = Math.min(f_9_, f_10_);
		float f_14_ = 1.0F / f_11_ * f_12_;
		float f_15_ = f_13_ * (1.0F / f_11_);
		f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
		f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
		f_3_ = Math.min(f_14_, f_15_);
	    }
	}
	fs[0] = f_3_;
	fs[1] = f_3_;
    }
    
    public void method357(Object object, float[] fs, Object[] objects, int i) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) -21);
	float f_16_ = class488.method7924(1983814657);
	Class446 class446_17_ = this$0.method4030(953617857);
	Class446 class446_18_ = Class446.method7225(class446, class446_17_);
	float f_19_ = 0.0F;
	float f_20_ = class446_18_.method7230();
	if (f_20_ >= f_16_)
	    f_19_ = 0.0F;
	else {
	    float f_21_ = ((Float) objects[0]).floatValue();
	    float f_22_ = ((Float) objects[1]).floatValue();
	    if (class446_17_.aFloat4895 > class446.aFloat4895 - f_21_ / 2.0F
		&& class446_17_.aFloat4895 < class446.aFloat4895 + f_21_ / 2.0F
		&& class446_17_.aFloat4897 > class446.aFloat4897 - f_22_ / 2.0F
		&& (class446_17_.aFloat4897
		    < f_22_ / 2.0F + class446.aFloat4897)) {
		float f_23_
		    = Math.abs(class446_17_.aFloat4895 - (class446.aFloat4895
							  + f_21_ / 2.0F));
		float f_24_
		    = Math.abs(class446_17_.aFloat4895 - (class446.aFloat4895
							  - f_21_ / 2.0F));
		float f_25_
		    = Math.abs(class446_17_.aFloat4897 - (class446.aFloat4895
							  + f_22_ / 2.0F));
		float f_26_
		    = Math.abs(class446_17_.aFloat4897 - (class446.aFloat4895
							  - f_22_ / 2.0F));
		float f_27_ = f_16_ - f;
		float f_28_ = Math.min(f_23_, f_24_);
		float f_29_ = Math.min(f_25_, f_26_);
		float f_30_ = 1.0F / f_27_ * f_28_;
		float f_31_ = f_29_ * (1.0F / f_27_);
		f_30_ = Math.min(Math.max(f_30_, 0.0F), 1.0F);
		f_31_ = Math.min(Math.max(f_31_, 0.0F), 1.0F);
		f_19_ = Math.min(f_30_, f_31_);
	    }
	}
	fs[0] = f_19_;
	fs[1] = f_19_;
    }
    
    public void method359(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) -33);
	float f_32_ = class488.method7924(405680749);
	Class446 class446_33_ = this$0.method4030(1000230301);
	Class446 class446_34_ = Class446.method7225(class446, class446_33_);
	float f_35_ = 0.0F;
	float f_36_ = class446_34_.method7230();
	if (f_36_ >= f_32_)
	    f_35_ = 0.0F;
	else {
	    float f_37_ = ((Float) objects[0]).floatValue();
	    float f_38_ = ((Float) objects[1]).floatValue();
	    if (class446_33_.aFloat4895 > class446.aFloat4895 - f_37_ / 2.0F
		&& class446_33_.aFloat4895 < class446.aFloat4895 + f_37_ / 2.0F
		&& class446_33_.aFloat4897 > class446.aFloat4897 - f_38_ / 2.0F
		&& (class446_33_.aFloat4897
		    < f_38_ / 2.0F + class446.aFloat4897)) {
		float f_39_
		    = Math.abs(class446_33_.aFloat4895 - (class446.aFloat4895
							  + f_37_ / 2.0F));
		float f_40_
		    = Math.abs(class446_33_.aFloat4895 - (class446.aFloat4895
							  - f_37_ / 2.0F));
		float f_41_
		    = Math.abs(class446_33_.aFloat4897 - (class446.aFloat4895
							  + f_38_ / 2.0F));
		float f_42_
		    = Math.abs(class446_33_.aFloat4897 - (class446.aFloat4895
							  - f_38_ / 2.0F));
		float f_43_ = f_32_ - f;
		float f_44_ = Math.min(f_39_, f_40_);
		float f_45_ = Math.min(f_41_, f_42_);
		float f_46_ = 1.0F / f_43_ * f_44_;
		float f_47_ = f_45_ * (1.0F / f_43_);
		f_46_ = Math.min(Math.max(f_46_, 0.0F), 1.0F);
		f_47_ = Math.min(Math.max(f_47_, 0.0F), 1.0F);
		f_35_ = Math.min(f_46_, f_47_);
	    }
	}
	fs[0] = f_35_;
	fs[1] = f_35_;
    }
    
    public void method358(Object object, float[] fs, Object[] objects) {
	Class488 class488 = (Class488) object;
	Class446 class446 = class488.method7931(65280);
	float f = class488.method7919((byte) 19);
	float f_48_ = class488.method7924(1058880257);
	Class446 class446_49_ = this$0.method4030(134045982);
	Class446 class446_50_ = Class446.method7225(class446, class446_49_);
	float f_51_ = 0.0F;
	float f_52_ = class446_50_.method7230();
	if (f_52_ >= f_48_)
	    f_51_ = 0.0F;
	else {
	    float f_53_ = ((Float) objects[0]).floatValue();
	    float f_54_ = ((Float) objects[1]).floatValue();
	    if (class446_49_.aFloat4895 > class446.aFloat4895 - f_53_ / 2.0F
		&& class446_49_.aFloat4895 < class446.aFloat4895 + f_53_ / 2.0F
		&& class446_49_.aFloat4897 > class446.aFloat4897 - f_54_ / 2.0F
		&& (class446_49_.aFloat4897
		    < f_54_ / 2.0F + class446.aFloat4897)) {
		float f_55_
		    = Math.abs(class446_49_.aFloat4895 - (class446.aFloat4895
							  + f_53_ / 2.0F));
		float f_56_
		    = Math.abs(class446_49_.aFloat4895 - (class446.aFloat4895
							  - f_53_ / 2.0F));
		float f_57_
		    = Math.abs(class446_49_.aFloat4897 - (class446.aFloat4895
							  + f_54_ / 2.0F));
		float f_58_
		    = Math.abs(class446_49_.aFloat4897 - (class446.aFloat4895
							  - f_54_ / 2.0F));
		float f_59_ = f_48_ - f;
		float f_60_ = Math.min(f_55_, f_56_);
		float f_61_ = Math.min(f_57_, f_58_);
		float f_62_ = 1.0F / f_59_ * f_60_;
		float f_63_ = f_61_ * (1.0F / f_59_);
		f_62_ = Math.min(Math.max(f_62_, 0.0F), 1.0F);
		f_63_ = Math.min(Math.max(f_63_, 0.0F), 1.0F);
		f_51_ = Math.min(f_62_, f_63_);
	    }
	}
	fs[0] = f_51_;
	fs[1] = f_51_;
    }
    
    Class196(Class217 class217) {
	this$0 = class217;
    }
    
    public static int method3736(Class182 class182, int i) {
	Class517.method8636((byte) -43);
	return Class285.aTwitchTV3143.StopStreaming();
    }
    
    static String method3737(String string, int i) {
	String string_64_ = null;
	int i_65_ = string.indexOf("--> ");
	if (i_65_ >= 0) {
	    string_64_ = string.substring(0, i_65_ + 4);
	    string = string.substring(4 + i_65_);
	}
	int i_66_ = -1;
	if (string.startsWith("directlogin "))
	    i_66_ = string.indexOf(" ", "directlogin ".length());
	if (i_66_ >= 0) {
	    int i_67_ = string.length();
	    string
		= new StringBuilder().append(string.substring(0, i_66_)).append
		      (" ").toString();
	    for (int i_68_ = 1 + i_66_; i_68_ < i_67_; i_68_++)
		string = new StringBuilder().append(string).append("*")
			     .toString();
	}
	if (string_64_ != null)
	    return new StringBuilder().append(string_64_).append(string)
		       .toString();
	return string;
    }
    
    static final void method3738(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class550.method9133(class259, class245, class683, (byte) 6);
    }
    
    static final void method3739(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 345171783 * client.anInt11200;
    }
    
    public static Class706[] method3740(byte i) {
	return (new Class706[]
		{ Class706.aClass706_8803, Class706.aClass706_8802,
		  Class706.aClass706_8806, Class706.aClass706_8805,
		  Class706.aClass706_8808, Class706.aClass706_8804 });
    }
    
    static final void method3741(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class639.method10557(class259, class245, class683, -1139525420);
    }
    
    static final void method3742(byte i) {
	if (Class34.method960(client.anInt11075 * 1777895575, (byte) 80)
	    || Class350_Sub1.method15842(1777895575 * client.anInt11075,
					 1367490715))
	    Class156.method2465(false, 795532265);
	else {
	    Class208.aClass559_2261
		= client.aClass96_11085.method1799((byte) 0);
	    client.aClass96_11085.method1798((byte) 0);
	    Class441.method7119(6, 1050040733);
	}
    }
    
    public static final void method3743(String string, int i) {
	if (!string.equals("")) {
	    Class96 class96 = Class111.method1979(-40918414);
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4327,
				    class96.aClass6_1169, 1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735
		(Class161.method2628(string, 501485742), -1015704916);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
								  -1642103955);
	    class96.method1794(class525_sub15, (short) 21180);
	}
    }
    
    public static void method3744(int i, int i_69_, int i_70_, int i_71_,
				  int i_72_, int i_73_, String string,
				  int i_74_) {
	Class531_Sub6 class531_sub6 = new Class531_Sub6();
	class531_sub6.anInt10350 = i * 1853818971;
	class531_sub6.anInt10347 = i_69_ * 85965867;
	class531_sub6.anInt10346 = -764738581 * i_70_;
	class531_sub6.anInt10348 = (i_72_ + client.anInt11083) * -1248927975;
	class531_sub6.anInt10345 = -2075088615 * i_71_;
	class531_sub6.aString10344 = string;
	class531_sub6.anInt10349 = i_73_ * -1505405401;
	client.aClass708_11293.method14331(class531_sub6, (short) -22238);
    }
    
    static final void method3745(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1693654607 * class259.anInt2612;
    }
    
    static final void method3746(Class683 class683, int i) {
	String string;
	if (null != Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
	    && (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aString12241
		!= null))
	    string = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			 .method18908(false, (byte) -100);
	else
	    string = "";
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = string;
    }
}
