/* Class444 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class444
{
    float aFloat4878;
    float aFloat4879;
    float aFloat4880;
    float aFloat4881;
    float aFloat4882;
    float aFloat4883;
    float aFloat4884;
    float aFloat4885;
    float aFloat4886;
    float aFloat4887;
    float aFloat4888;
    public static Class444 aClass444_4889 = new Class444();
    float aFloat4890;
    
    public void method7130(float f, float f_0_, float f_1_, float f_2_) {
	float f_3_ = (float) Math.cos((double) f_2_);
	float f_4_ = (float) Math.sin((double) f_2_);
	aFloat4879 = f_3_ + f * f * (1.0F - f_3_);
	aFloat4878 = f_1_ * f_4_ + f_0_ * f * (1.0F - f_3_);
	aFloat4881 = -f_0_ * f_4_ + f_1_ * f * (1.0F - f_3_);
	aFloat4882 = -f_1_ * f_4_ + f * f_0_ * (1.0F - f_3_);
	aFloat4883 = f_3_ + f_0_ * f_0_ * (1.0F - f_3_);
	aFloat4890 = f * f_4_ + f_1_ * f_0_ * (1.0F - f_3_);
	aFloat4885 = f_0_ * f_4_ + f * f_1_ * (1.0F - f_3_);
	aFloat4884 = -f * f_4_ + f_0_ * f_1_ * (1.0F - f_3_);
	aFloat4887 = f_3_ + f_1_ * f_1_ * (1.0F - f_3_);
	aFloat4880 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4888 = 0.0F;
    }
    
    public Class444(Class444 class444_5_) {
	method7154(class444_5_);
    }
    
    public Class444() {
	method7133();
    }
    
    public void method7131(Class428 class428) {
	method7140(class428.aClass429_4808);
	method7146(class428.aClass446_4807);
    }
    
    public void method7132(Class428 class428) {
	float f = (class428.aClass429_4808.aFloat4815
		   * class428.aClass429_4808.aFloat4815);
	float f_6_ = (class428.aClass429_4808.aFloat4815
		      * class428.aClass429_4808.aFloat4812);
	float f_7_ = (class428.aClass429_4808.aFloat4815
		      * class428.aClass429_4808.aFloat4811);
	float f_8_ = (class428.aClass429_4808.aFloat4815
		      * class428.aClass429_4808.aFloat4813);
	float f_9_ = (class428.aClass429_4808.aFloat4812
		      * class428.aClass429_4808.aFloat4812);
	float f_10_ = (class428.aClass429_4808.aFloat4812
		       * class428.aClass429_4808.aFloat4811);
	float f_11_ = (class428.aClass429_4808.aFloat4812
		       * class428.aClass429_4808.aFloat4813);
	float f_12_ = (class428.aClass429_4808.aFloat4811
		       * class428.aClass429_4808.aFloat4811);
	float f_13_ = (class428.aClass429_4808.aFloat4811
		       * class428.aClass429_4808.aFloat4813);
	float f_14_ = (class428.aClass429_4808.aFloat4813
		       * class428.aClass429_4808.aFloat4813);
	aFloat4879 = f_9_ + f - f_14_ - f_12_;
	aFloat4878 = f_10_ + f_8_ + f_10_ + f_8_;
	aFloat4881 = f_11_ - f_7_ - f_7_ + f_11_;
	aFloat4882 = f_10_ - f_8_ - f_8_ + f_10_;
	aFloat4883 = f_12_ + f - f_9_ - f_14_;
	aFloat4890 = f_13_ + f_6_ + f_13_ + f_6_;
	aFloat4885 = f_11_ + f_7_ + f_11_ + f_7_;
	aFloat4884 = f_13_ - f_6_ - f_6_ + f_13_;
	aFloat4887 = f_14_ + f - f_12_ - f_9_;
	aFloat4888 = class428.aClass446_4807.aFloat4895;
	aFloat4886 = class428.aClass446_4807.aFloat4896;
	aFloat4880 = class428.aClass446_4807.aFloat4897;
    }
    
    public void method7133() {
	aFloat4880 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4888 = 0.0F;
	aFloat4884 = 0.0F;
	aFloat4885 = 0.0F;
	aFloat4890 = 0.0F;
	aFloat4882 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4878 = 0.0F;
	aFloat4887 = 1.0F;
	aFloat4883 = 1.0F;
	aFloat4879 = 1.0F;
    }
    
    public void method7134(float f, float f_15_, float f_16_, float f_17_) {
	float f_18_ = (float) Math.cos((double) f_17_);
	float f_19_ = (float) Math.sin((double) f_17_);
	float f_20_ = f_18_ + f * f * (1.0F - f_18_);
	float f_21_ = f_16_ * f_19_ + f_15_ * f * (1.0F - f_18_);
	float f_22_ = -f_15_ * f_19_ + f_16_ * f * (1.0F - f_18_);
	float f_23_ = -f_16_ * f_19_ + f * f_15_ * (1.0F - f_18_);
	float f_24_ = f_18_ + f_15_ * f_15_ * (1.0F - f_18_);
	float f_25_ = f * f_19_ + f_16_ * f_15_ * (1.0F - f_18_);
	float f_26_ = f_15_ * f_19_ + f * f_16_ * (1.0F - f_18_);
	float f_27_ = -f * f_19_ + f_15_ * f_16_ * (1.0F - f_18_);
	float f_28_ = f_18_ + f_16_ * f_16_ * (1.0F - f_18_);
	float f_29_ = aFloat4879;
	float f_30_ = aFloat4878;
	float f_31_ = aFloat4882;
	float f_32_ = aFloat4883;
	float f_33_ = aFloat4885;
	float f_34_ = aFloat4884;
	float f_35_ = aFloat4888;
	float f_36_ = aFloat4886;
	aFloat4879 = f_29_ * f_20_ + f_30_ * f_23_ + aFloat4881 * f_26_;
	aFloat4878 = f_29_ * f_21_ + f_30_ * f_24_ + aFloat4881 * f_27_;
	aFloat4881 = f_29_ * f_22_ + f_30_ * f_25_ + aFloat4881 * f_28_;
	aFloat4882 = f_31_ * f_20_ + f_32_ * f_23_ + aFloat4890 * f_26_;
	aFloat4883 = f_31_ * f_21_ + f_32_ * f_24_ + aFloat4890 * f_27_;
	aFloat4890 = f_31_ * f_22_ + f_32_ * f_25_ + aFloat4890 * f_28_;
	aFloat4885 = f_33_ * f_20_ + f_34_ * f_23_ + aFloat4887 * f_26_;
	aFloat4884 = f_33_ * f_21_ + f_34_ * f_24_ + aFloat4887 * f_27_;
	aFloat4887 = f_33_ * f_22_ + f_34_ * f_25_ + aFloat4887 * f_28_;
	aFloat4888 = f_35_ * f_20_ + f_36_ * f_23_ + aFloat4880 * f_26_;
	aFloat4886 = f_35_ * f_21_ + f_36_ * f_24_ + aFloat4880 * f_27_;
	aFloat4880 = f_35_ * f_22_ + f_36_ * f_25_ + aFloat4880 * f_28_;
    }
    
    public void method7135(int i, int i_37_, int i_38_, float f, float f_39_,
			   float f_40_) {
	if (i != 0) {
	    float f_41_ = Class431.aFloatArray4819[i & 0x3fff];
	    float f_42_ = Class431.aFloatArray4818[i & 0x3fff];
	    aFloat4887 = 1.0F;
	    aFloat4884 = 0.0F;
	    aFloat4885 = 0.0F;
	    aFloat4890 = 0.0F;
	    aFloat4881 = 0.0F;
	    aFloat4879 = 2.0F * f_41_ * (float) i_37_;
	    aFloat4883 = 2.0F * f_41_ * (float) i_38_;
	    aFloat4878 = 2.0F * f_42_ * (float) i_37_;
	    aFloat4882 = -2.0F * f_42_ * (float) i_38_;
	    aFloat4888
		= (float) (2 * i_37_) * (0.5F * f_42_ - 0.5F * f_41_) + f;
	    aFloat4886
		= (float) (2 * i_38_) * (-0.5F * f_42_ - 0.5F * f_41_) + f_39_;
	    aFloat4880 = f_40_;
	} else {
	    aFloat4884 = 0.0F;
	    aFloat4885 = 0.0F;
	    aFloat4890 = 0.0F;
	    aFloat4882 = 0.0F;
	    aFloat4881 = 0.0F;
	    aFloat4878 = 0.0F;
	    aFloat4879 = (float) (2 * i_37_);
	    aFloat4883 = (float) (2 * i_38_);
	    aFloat4887 = 1.0F;
	    aFloat4888 = f - (float) i_37_;
	    aFloat4886 = f_39_ - (float) i_38_;
	    aFloat4880 = f_40_;
	}
    }
    
    public void method7136(float f, float f_43_, float f_44_, float f_45_,
			   float f_46_, float f_47_, float f_48_, float f_49_,
			   float f_50_) {
	aFloat4879 = f;
	aFloat4882 = f_45_;
	aFloat4885 = f_48_;
	aFloat4888 = 0.0F;
	aFloat4878 = f_43_;
	aFloat4883 = f_46_;
	aFloat4884 = f_49_;
	aFloat4886 = 0.0F;
	aFloat4881 = f_44_;
	aFloat4890 = f_47_;
	aFloat4887 = f_50_;
	aFloat4880 = 0.0F;
    }
    
    public void method7137(float f, float f_51_, float f_52_) {
	aFloat4884 = 0.0F;
	aFloat4885 = 0.0F;
	aFloat4890 = 0.0F;
	aFloat4882 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4878 = 0.0F;
	aFloat4887 = 1.0F;
	aFloat4883 = 1.0F;
	aFloat4879 = 1.0F;
	aFloat4888 = f;
	aFloat4886 = f_51_;
	aFloat4880 = f_52_;
    }
    
    public void method7138() {
	float f = aFloat4888;
	float f_53_ = aFloat4886;
	float f_54_ = aFloat4882;
	aFloat4882 = aFloat4878;
	aFloat4878 = f_54_;
	float f_55_ = aFloat4885;
	aFloat4885 = aFloat4881;
	aFloat4881 = f_55_;
	float f_56_ = aFloat4884;
	aFloat4884 = aFloat4890;
	aFloat4890 = f_56_;
	aFloat4888
	    = -(f * aFloat4879 + f_53_ * aFloat4882 + aFloat4880 * aFloat4885);
	aFloat4886
	    = -(f * aFloat4878 + f_53_ * aFloat4883 + aFloat4880 * aFloat4884);
	aFloat4880
	    = -(f * aFloat4881 + f_53_ * aFloat4890 + aFloat4880 * aFloat4887);
    }
    
    public void method7139(float f, float f_57_, float f_58_) {
	aFloat4888 += f;
	aFloat4886 += f_57_;
	aFloat4880 += f_58_;
    }
    
    public void method7140(Class429 class429) {
	method7167(class429.aFloat4812, class429.aFloat4811,
		   class429.aFloat4813, class429.aFloat4815);
    }
    
    public void method7141(float f, float f_59_, float f_60_, float f_61_) {
	float f_62_ = (float) Math.cos((double) f_61_);
	float f_63_ = (float) Math.sin((double) f_61_);
	aFloat4879 = f_62_ + f * f * (1.0F - f_62_);
	aFloat4878 = f_60_ * f_63_ + f_59_ * f * (1.0F - f_62_);
	aFloat4881 = -f_59_ * f_63_ + f_60_ * f * (1.0F - f_62_);
	aFloat4882 = -f_60_ * f_63_ + f * f_59_ * (1.0F - f_62_);
	aFloat4883 = f_62_ + f_59_ * f_59_ * (1.0F - f_62_);
	aFloat4890 = f * f_63_ + f_60_ * f_59_ * (1.0F - f_62_);
	aFloat4885 = f_59_ * f_63_ + f * f_60_ * (1.0F - f_62_);
	aFloat4884 = -f * f_63_ + f_59_ * f_60_ * (1.0F - f_62_);
	aFloat4887 = f_62_ + f_60_ * f_60_ * (1.0F - f_62_);
	aFloat4880 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4888 = 0.0F;
    }
    
    public void method7142(float f, float f_64_, float f_65_, float f_66_) {
	float f_67_ = (float) Math.cos((double) f_66_);
	float f_68_ = (float) Math.sin((double) f_66_);
	float f_69_ = f_67_ + f * f * (1.0F - f_67_);
	float f_70_ = f_65_ * f_68_ + f_64_ * f * (1.0F - f_67_);
	float f_71_ = -f_64_ * f_68_ + f_65_ * f * (1.0F - f_67_);
	float f_72_ = -f_65_ * f_68_ + f * f_64_ * (1.0F - f_67_);
	float f_73_ = f_67_ + f_64_ * f_64_ * (1.0F - f_67_);
	float f_74_ = f * f_68_ + f_65_ * f_64_ * (1.0F - f_67_);
	float f_75_ = f_64_ * f_68_ + f * f_65_ * (1.0F - f_67_);
	float f_76_ = -f * f_68_ + f_64_ * f_65_ * (1.0F - f_67_);
	float f_77_ = f_67_ + f_65_ * f_65_ * (1.0F - f_67_);
	float f_78_ = aFloat4879;
	float f_79_ = aFloat4878;
	float f_80_ = aFloat4882;
	float f_81_ = aFloat4883;
	float f_82_ = aFloat4885;
	float f_83_ = aFloat4884;
	float f_84_ = aFloat4888;
	float f_85_ = aFloat4886;
	aFloat4879 = f_78_ * f_69_ + f_79_ * f_72_ + aFloat4881 * f_75_;
	aFloat4878 = f_78_ * f_70_ + f_79_ * f_73_ + aFloat4881 * f_76_;
	aFloat4881 = f_78_ * f_71_ + f_79_ * f_74_ + aFloat4881 * f_77_;
	aFloat4882 = f_80_ * f_69_ + f_81_ * f_72_ + aFloat4890 * f_75_;
	aFloat4883 = f_80_ * f_70_ + f_81_ * f_73_ + aFloat4890 * f_76_;
	aFloat4890 = f_80_ * f_71_ + f_81_ * f_74_ + aFloat4890 * f_77_;
	aFloat4885 = f_82_ * f_69_ + f_83_ * f_72_ + aFloat4887 * f_75_;
	aFloat4884 = f_82_ * f_70_ + f_83_ * f_73_ + aFloat4887 * f_76_;
	aFloat4887 = f_82_ * f_71_ + f_83_ * f_74_ + aFloat4887 * f_77_;
	aFloat4888 = f_84_ * f_69_ + f_85_ * f_72_ + aFloat4880 * f_75_;
	aFloat4886 = f_84_ * f_70_ + f_85_ * f_73_ + aFloat4880 * f_76_;
	aFloat4880 = f_84_ * f_71_ + f_85_ * f_74_ + aFloat4880 * f_77_;
    }
    
    public void method7143(float f, float f_86_, float f_87_) {
	aFloat4879 = f;
	aFloat4882 = 0.0F;
	aFloat4885 = 0.0F;
	aFloat4888 = 0.0F;
	aFloat4878 = 0.0F;
	aFloat4883 = f_86_;
	aFloat4884 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4890 = 0.0F;
	aFloat4887 = f_87_;
	aFloat4880 = 0.0F;
    }
    
    public void method7144(float f, float f_88_, float f_89_) {
	aFloat4879 *= f;
	aFloat4882 *= f;
	aFloat4885 *= f;
	aFloat4888 *= f;
	aFloat4878 *= f_88_;
	aFloat4883 *= f_88_;
	aFloat4884 *= f_88_;
	aFloat4886 *= f_88_;
	aFloat4881 *= f_89_;
	aFloat4890 *= f_89_;
	aFloat4887 *= f_89_;
	aFloat4880 *= f_89_;
    }
    
    public void method7145(int i, int i_90_, int i_91_, float f, float f_92_,
			   float f_93_) {
	if (i != 0) {
	    float f_94_ = Class431.aFloatArray4819[i & 0x3fff];
	    float f_95_ = Class431.aFloatArray4818[i & 0x3fff];
	    aFloat4887 = 1.0F;
	    aFloat4884 = 0.0F;
	    aFloat4885 = 0.0F;
	    aFloat4890 = 0.0F;
	    aFloat4881 = 0.0F;
	    aFloat4879 = 2.0F * f_94_ * (float) i_90_;
	    aFloat4883 = 2.0F * f_94_ * (float) i_91_;
	    aFloat4878 = 2.0F * f_95_ * (float) i_90_;
	    aFloat4882 = -2.0F * f_95_ * (float) i_91_;
	    aFloat4888
		= (float) (2 * i_90_) * (0.5F * f_95_ - 0.5F * f_94_) + f;
	    aFloat4886
		= (float) (2 * i_91_) * (-0.5F * f_95_ - 0.5F * f_94_) + f_92_;
	    aFloat4880 = f_93_;
	} else {
	    aFloat4884 = 0.0F;
	    aFloat4885 = 0.0F;
	    aFloat4890 = 0.0F;
	    aFloat4882 = 0.0F;
	    aFloat4881 = 0.0F;
	    aFloat4878 = 0.0F;
	    aFloat4879 = (float) (2 * i_90_);
	    aFloat4883 = (float) (2 * i_91_);
	    aFloat4887 = 1.0F;
	    aFloat4888 = f - (float) i_90_;
	    aFloat4886 = f_92_ - (float) i_91_;
	    aFloat4880 = f_93_;
	}
    }
    
    public void method7146(Class446 class446) {
	method7147(class446.aFloat4895, class446.aFloat4896,
		   class446.aFloat4897);
    }
    
    public void method7147(float f, float f_96_, float f_97_) {
	aFloat4888 += f;
	aFloat4886 += f_96_;
	aFloat4880 += f_97_;
    }
    
    public void method7148(Class444 class444_98_) {
	float f = aFloat4879;
	float f_99_ = aFloat4878;
	float f_100_ = aFloat4882;
	float f_101_ = aFloat4883;
	float f_102_ = aFloat4885;
	float f_103_ = aFloat4884;
	float f_104_ = aFloat4888;
	float f_105_ = aFloat4886;
	float f_106_ = aFloat4881;
	float f_107_ = aFloat4890;
	float f_108_ = aFloat4887;
	float f_109_ = aFloat4880;
	aFloat4879
	    = (f * class444_98_.aFloat4879 + f_99_ * class444_98_.aFloat4882
	       + f_106_ * class444_98_.aFloat4885);
	aFloat4878
	    = (f * class444_98_.aFloat4878 + f_99_ * class444_98_.aFloat4883
	       + f_106_ * class444_98_.aFloat4884);
	aFloat4881
	    = (f * class444_98_.aFloat4881 + f_99_ * class444_98_.aFloat4890
	       + f_106_ * class444_98_.aFloat4887);
	aFloat4882 = (f_100_ * class444_98_.aFloat4879
		      + f_101_ * class444_98_.aFloat4882
		      + f_107_ * class444_98_.aFloat4885);
	aFloat4883 = (f_100_ * class444_98_.aFloat4878
		      + f_101_ * class444_98_.aFloat4883
		      + f_107_ * class444_98_.aFloat4884);
	aFloat4890 = (f_100_ * class444_98_.aFloat4881
		      + f_101_ * class444_98_.aFloat4890
		      + f_107_ * class444_98_.aFloat4887);
	aFloat4885 = (f_102_ * class444_98_.aFloat4879
		      + f_103_ * class444_98_.aFloat4882
		      + f_108_ * class444_98_.aFloat4885);
	aFloat4884 = (f_102_ * class444_98_.aFloat4878
		      + f_103_ * class444_98_.aFloat4883
		      + f_108_ * class444_98_.aFloat4884);
	aFloat4887 = (f_102_ * class444_98_.aFloat4881
		      + f_103_ * class444_98_.aFloat4890
		      + f_108_ * class444_98_.aFloat4887);
	aFloat4888
	    = (f_104_ * class444_98_.aFloat4879
	       + f_105_ * class444_98_.aFloat4882
	       + f_109_ * class444_98_.aFloat4885 + class444_98_.aFloat4888);
	aFloat4886
	    = (f_104_ * class444_98_.aFloat4878
	       + f_105_ * class444_98_.aFloat4883
	       + f_109_ * class444_98_.aFloat4884 + class444_98_.aFloat4886);
	aFloat4880
	    = (f_104_ * class444_98_.aFloat4881
	       + f_105_ * class444_98_.aFloat4890
	       + f_109_ * class444_98_.aFloat4887 + class444_98_.aFloat4880);
    }
    
    public String method7149() {
	return new StringBuilder().append(aFloat4879).append(",").append
		   (aFloat4882).append
		   (",").append
		   (aFloat4885).append
		   (",").append
		   (aFloat4888).append
		   (" - ").append
		   (aFloat4878).append
		   (",").append
		   (aFloat4883).append
		   (",").append
		   (aFloat4884).append
		   (",").append
		   (aFloat4886).append
		   (" - ").append
		   (aFloat4881).append
		   (",").append
		   (aFloat4890).append
		   (",").append
		   (aFloat4887).append
		   (",").append
		   (aFloat4880).toString();
    }
    
    void method7150(float f, float f_110_, float f_111_, float f_112_) {
	float f_113_ = f * f;
	float f_114_ = f * f_110_;
	float f_115_ = f * f_111_;
	float f_116_ = f * f_112_;
	float f_117_ = f_110_ * f_110_;
	float f_118_ = f_110_ * f_111_;
	float f_119_ = f_110_ * f_112_;
	float f_120_ = f_111_ * f_111_;
	float f_121_ = f_111_ * f_112_;
	aFloat4879 = 1.0F - 2.0F * (f_117_ + f_120_);
	aFloat4882 = 2.0F * (f_114_ - f_121_);
	aFloat4885 = 2.0F * (f_115_ + f_119_);
	aFloat4878 = 2.0F * (f_114_ + f_121_);
	aFloat4883 = 1.0F - 2.0F * (f_113_ + f_120_);
	aFloat4884 = 2.0F * (f_118_ - f_116_);
	aFloat4881 = 2.0F * (f_115_ - f_119_);
	aFloat4890 = 2.0F * (f_118_ + f_116_);
	aFloat4887 = 1.0F - 2.0F * (f_113_ + f_117_);
	aFloat4880 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4888 = 0.0F;
    }
    
    public void method7151(float f, float f_122_, float f_123_, float[] fs) {
	f -= aFloat4888;
	f_122_ -= aFloat4886;
	f_123_ -= aFloat4880;
	fs[0] = (float) (int) (aFloat4879 * f + aFloat4878 * f_122_
			       + aFloat4881 * f_123_);
	fs[1] = (float) (int) (aFloat4882 * f + aFloat4883 * f_122_
			       + aFloat4890 * f_123_);
	fs[2] = (float) (int) (aFloat4885 * f + aFloat4884 * f_122_
			       + aFloat4887 * f_123_);
    }
    
    public void method7152(float[] fs) {
	float f = fs[0] - aFloat4888;
	float f_124_ = fs[1] - aFloat4886;
	float f_125_ = fs[2] - aFloat4880;
	fs[0] = (float) (int) (aFloat4879 * f + aFloat4878 * f_124_
			       + aFloat4881 * f_125_);
	fs[1] = (float) (int) (aFloat4882 * f + aFloat4883 * f_124_
			       + aFloat4890 * f_125_);
	fs[2] = (float) (int) (aFloat4885 * f + aFloat4884 * f_124_
			       + aFloat4887 * f_125_);
    }
    
    public void method7153(float[] fs) {
	float f = fs[0];
	float f_126_ = fs[1];
	float f_127_ = fs[2];
	fs[0] = aFloat4879 * f + aFloat4878 * f_126_ + aFloat4881 * f_127_;
	fs[1] = aFloat4882 * f + aFloat4883 * f_126_ + aFloat4890 * f_127_;
	fs[2] = aFloat4885 * f + aFloat4884 * f_126_ + aFloat4887 * f_127_;
    }
    
    public void method7154(Class444 class444_128_) {
	aFloat4879 = class444_128_.aFloat4879;
	aFloat4882 = class444_128_.aFloat4882;
	aFloat4885 = class444_128_.aFloat4885;
	aFloat4888 = class444_128_.aFloat4888;
	aFloat4878 = class444_128_.aFloat4878;
	aFloat4883 = class444_128_.aFloat4883;
	aFloat4884 = class444_128_.aFloat4884;
	aFloat4886 = class444_128_.aFloat4886;
	aFloat4881 = class444_128_.aFloat4881;
	aFloat4890 = class444_128_.aFloat4890;
	aFloat4887 = class444_128_.aFloat4887;
	aFloat4880 = class444_128_.aFloat4880;
    }
    
    public float[] method7155(float[] fs) {
	fs[0] = aFloat4888;
	fs[1] = aFloat4886;
	fs[2] = aFloat4880;
	return fs;
    }
    
    public void method7156(Class446 class446) {
	method7147(class446.aFloat4895, class446.aFloat4896,
		   class446.aFloat4897);
    }
    
    public void method7157(int i, int i_129_, int i_130_, float f,
			   float f_131_, float f_132_) {
	if (i != 0) {
	    float f_133_ = Class431.aFloatArray4819[i & 0x3fff];
	    float f_134_ = Class431.aFloatArray4818[i & 0x3fff];
	    aFloat4887 = 1.0F;
	    aFloat4884 = 0.0F;
	    aFloat4885 = 0.0F;
	    aFloat4890 = 0.0F;
	    aFloat4881 = 0.0F;
	    aFloat4879 = 2.0F * f_133_ * (float) i_129_;
	    aFloat4883 = 2.0F * f_133_ * (float) i_130_;
	    aFloat4878 = 2.0F * f_134_ * (float) i_129_;
	    aFloat4882 = -2.0F * f_134_ * (float) i_130_;
	    aFloat4888
		= (float) (2 * i_129_) * (0.5F * f_134_ - 0.5F * f_133_) + f;
	    aFloat4886 = (float) (2 * i_130_) * (-0.5F * f_134_
						 - 0.5F * f_133_) + f_131_;
	    aFloat4880 = f_132_;
	} else {
	    aFloat4884 = 0.0F;
	    aFloat4885 = 0.0F;
	    aFloat4890 = 0.0F;
	    aFloat4882 = 0.0F;
	    aFloat4881 = 0.0F;
	    aFloat4878 = 0.0F;
	    aFloat4879 = (float) (2 * i_129_);
	    aFloat4883 = (float) (2 * i_130_);
	    aFloat4887 = 1.0F;
	    aFloat4888 = f - (float) i_129_;
	    aFloat4886 = f_131_ - (float) i_130_;
	    aFloat4880 = f_132_;
	}
    }
    
    public String method7158() {
	return new StringBuilder().append(aFloat4879).append(",").append
		   (aFloat4882).append
		   (",").append
		   (aFloat4885).append
		   (",").append
		   (aFloat4888).append
		   (" - ").append
		   (aFloat4878).append
		   (",").append
		   (aFloat4883).append
		   (",").append
		   (aFloat4884).append
		   (",").append
		   (aFloat4886).append
		   (" - ").append
		   (aFloat4881).append
		   (",").append
		   (aFloat4890).append
		   (",").append
		   (aFloat4887).append
		   (",").append
		   (aFloat4880).toString();
    }
    
    public float[] method7159(float[] fs) {
	fs[0] = aFloat4879;
	fs[1] = aFloat4878;
	fs[2] = aFloat4881;
	fs[3] = aFloat4882;
	fs[4] = aFloat4883;
	fs[5] = aFloat4890;
	fs[6] = aFloat4885;
	fs[7] = aFloat4884;
	fs[8] = aFloat4887;
	return fs;
    }
    
    public String method7160() {
	return new StringBuilder().append(aFloat4879).append(",").append
		   (aFloat4882).append
		   (",").append
		   (aFloat4885).append
		   (",").append
		   (aFloat4888).append
		   (" - ").append
		   (aFloat4878).append
		   (",").append
		   (aFloat4883).append
		   (",").append
		   (aFloat4884).append
		   (",").append
		   (aFloat4886).append
		   (" - ").append
		   (aFloat4881).append
		   (",").append
		   (aFloat4890).append
		   (",").append
		   (aFloat4887).append
		   (",").append
		   (aFloat4880).toString();
    }
    
    public void method7161(Class428 class428) {
	method7140(class428.aClass429_4808);
	method7146(class428.aClass446_4807);
    }
    
    public void method7162() {
	aFloat4880 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4888 = 0.0F;
	aFloat4884 = 0.0F;
	aFloat4885 = 0.0F;
	aFloat4890 = 0.0F;
	aFloat4882 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4878 = 0.0F;
	aFloat4887 = 1.0F;
	aFloat4883 = 1.0F;
	aFloat4879 = 1.0F;
    }
    
    public void method7163(Class444 class444_135_) {
	if (class444_135_ == this)
	    method7138();
	else {
	    aFloat4879 = class444_135_.aFloat4879;
	    aFloat4882 = class444_135_.aFloat4878;
	    aFloat4885 = class444_135_.aFloat4881;
	    aFloat4878 = class444_135_.aFloat4882;
	    aFloat4883 = class444_135_.aFloat4883;
	    aFloat4884 = class444_135_.aFloat4890;
	    aFloat4881 = class444_135_.aFloat4885;
	    aFloat4890 = class444_135_.aFloat4884;
	    aFloat4887 = class444_135_.aFloat4887;
	    aFloat4888 = -(class444_135_.aFloat4888 * aFloat4879
			   + class444_135_.aFloat4886 * aFloat4882
			   + class444_135_.aFloat4880 * aFloat4885);
	    aFloat4886 = -(class444_135_.aFloat4888 * aFloat4878
			   + class444_135_.aFloat4886 * aFloat4883
			   + class444_135_.aFloat4880 * aFloat4884);
	    aFloat4880 = -(class444_135_.aFloat4888 * aFloat4881
			   + class444_135_.aFloat4886 * aFloat4890
			   + class444_135_.aFloat4880 * aFloat4887);
	}
    }
    
    public void method7164(Class446 class446) {
	method7147(class446.aFloat4895, class446.aFloat4896,
		   class446.aFloat4897);
    }
    
    public void method7165(double d, double d_136_, double d_137_,
			   double d_138_, double d_139_, double d_140_,
			   float f, float f_141_, float f_142_) {
	float f_143_ = (float) (d_138_ - d);
	float f_144_ = (float) (d_139_ - d_136_);
	float f_145_ = (float) (d_140_ - d_137_);
	float f_146_ = f_141_ * f_145_ - f_142_ * f_144_;
	float f_147_ = f_142_ * f_143_ - f * f_145_;
	float f_148_ = f * f_144_ - f_141_ * f_143_;
	float f_149_ = (float) (1.0 / Math.sqrt((double) (f_146_ * f_146_
							  + f_147_ * f_147_
							  + f_148_ * f_148_)));
	float f_150_ = (float) (1.0 / Math.sqrt((double) (f_143_ * f_143_
							  + f_144_ * f_144_
							  + f_145_ * f_145_)));
	aFloat4879 = f_146_ * f_149_;
	aFloat4882 = f_147_ * f_149_;
	aFloat4885 = f_148_ * f_149_;
	aFloat4881 = f_143_ * f_150_;
	aFloat4890 = f_144_ * f_150_;
	aFloat4887 = f_145_ * f_150_;
	aFloat4878 = aFloat4890 * aFloat4885 - aFloat4887 * aFloat4882;
	aFloat4883 = aFloat4887 * aFloat4879 - aFloat4881 * aFloat4885;
	aFloat4884 = aFloat4881 * aFloat4882 - aFloat4890 * aFloat4879;
	aFloat4888
	    = -(float) (d * (double) aFloat4879 + d_136_ * (double) aFloat4882
			+ d_137_ * (double) aFloat4885);
	aFloat4886
	    = -(float) (d * (double) aFloat4878 + d_136_ * (double) aFloat4883
			+ d_137_ * (double) aFloat4884);
	aFloat4880
	    = -(float) (d * (double) aFloat4881 + d_136_ * (double) aFloat4890
			+ d_137_ * (double) aFloat4887);
    }
    
    public void method7166(double d, double d_151_, double d_152_,
			   double d_153_, double d_154_, double d_155_,
			   float f, float f_156_, float f_157_) {
	float f_158_ = (float) (d_153_ - d);
	float f_159_ = (float) (d_154_ - d_151_);
	float f_160_ = (float) (d_155_ - d_152_);
	float f_161_ = f_156_ * f_160_ - f_157_ * f_159_;
	float f_162_ = f_157_ * f_158_ - f * f_160_;
	float f_163_ = f * f_159_ - f_156_ * f_158_;
	float f_164_ = (float) (1.0 / Math.sqrt((double) (f_161_ * f_161_
							  + f_162_ * f_162_
							  + f_163_ * f_163_)));
	float f_165_ = (float) (1.0 / Math.sqrt((double) (f_158_ * f_158_
							  + f_159_ * f_159_
							  + f_160_ * f_160_)));
	aFloat4879 = f_161_ * f_164_;
	aFloat4882 = f_162_ * f_164_;
	aFloat4885 = f_163_ * f_164_;
	aFloat4881 = f_158_ * f_165_;
	aFloat4890 = f_159_ * f_165_;
	aFloat4887 = f_160_ * f_165_;
	aFloat4878 = aFloat4890 * aFloat4885 - aFloat4887 * aFloat4882;
	aFloat4883 = aFloat4887 * aFloat4879 - aFloat4881 * aFloat4885;
	aFloat4884 = aFloat4881 * aFloat4882 - aFloat4890 * aFloat4879;
	aFloat4888
	    = -(float) (d * (double) aFloat4879 + d_151_ * (double) aFloat4882
			+ d_152_ * (double) aFloat4885);
	aFloat4886
	    = -(float) (d * (double) aFloat4878 + d_151_ * (double) aFloat4883
			+ d_152_ * (double) aFloat4884);
	aFloat4880
	    = -(float) (d * (double) aFloat4881 + d_151_ * (double) aFloat4890
			+ d_152_ * (double) aFloat4887);
    }
    
    void method7167(float f, float f_166_, float f_167_, float f_168_) {
	float f_169_ = f * f;
	float f_170_ = f * f_166_;
	float f_171_ = f * f_167_;
	float f_172_ = f * f_168_;
	float f_173_ = f_166_ * f_166_;
	float f_174_ = f_166_ * f_167_;
	float f_175_ = f_166_ * f_168_;
	float f_176_ = f_167_ * f_167_;
	float f_177_ = f_167_ * f_168_;
	aFloat4879 = 1.0F - 2.0F * (f_173_ + f_176_);
	aFloat4882 = 2.0F * (f_170_ - f_177_);
	aFloat4885 = 2.0F * (f_171_ + f_175_);
	aFloat4878 = 2.0F * (f_170_ + f_177_);
	aFloat4883 = 1.0F - 2.0F * (f_169_ + f_176_);
	aFloat4884 = 2.0F * (f_174_ - f_172_);
	aFloat4881 = 2.0F * (f_171_ - f_175_);
	aFloat4890 = 2.0F * (f_174_ + f_172_);
	aFloat4887 = 1.0F - 2.0F * (f_169_ + f_173_);
	aFloat4880 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4888 = 0.0F;
    }
    
    public void method7168(float f, float f_178_, float f_179_, float[] fs) {
	fs[0] = (aFloat4879 * f + aFloat4882 * f_178_ + aFloat4885 * f_179_
		 + aFloat4888);
	fs[1] = (aFloat4878 * f + aFloat4883 * f_178_ + aFloat4884 * f_179_
		 + aFloat4886);
	fs[2] = (aFloat4881 * f + aFloat4890 * f_178_ + aFloat4887 * f_179_
		 + aFloat4880);
    }
    
    public void method7169(float f, float f_180_, float f_181_, float f_182_,
			   float f_183_, float f_184_, float f_185_,
			   float f_186_, float f_187_) {
	aFloat4879 = f;
	aFloat4882 = f_182_;
	aFloat4885 = f_185_;
	aFloat4888 = 0.0F;
	aFloat4878 = f_180_;
	aFloat4883 = f_183_;
	aFloat4884 = f_186_;
	aFloat4886 = 0.0F;
	aFloat4881 = f_181_;
	aFloat4890 = f_184_;
	aFloat4887 = f_187_;
	aFloat4880 = 0.0F;
    }
    
    public void method7170() {
	float f = aFloat4888;
	float f_188_ = aFloat4886;
	float f_189_ = aFloat4882;
	aFloat4882 = aFloat4878;
	aFloat4878 = f_189_;
	float f_190_ = aFloat4885;
	aFloat4885 = aFloat4881;
	aFloat4881 = f_190_;
	float f_191_ = aFloat4884;
	aFloat4884 = aFloat4890;
	aFloat4890 = f_191_;
	aFloat4888 = -(f * aFloat4879 + f_188_ * aFloat4882
		       + aFloat4880 * aFloat4885);
	aFloat4886 = -(f * aFloat4878 + f_188_ * aFloat4883
		       + aFloat4880 * aFloat4884);
	aFloat4880 = -(f * aFloat4881 + f_188_ * aFloat4890
		       + aFloat4880 * aFloat4887);
    }
    
    public void method7171() {
	aFloat4880 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4888 = 0.0F;
	aFloat4884 = 0.0F;
	aFloat4885 = 0.0F;
	aFloat4890 = 0.0F;
	aFloat4882 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4878 = 0.0F;
	aFloat4887 = 1.0F;
	aFloat4883 = 1.0F;
	aFloat4879 = 1.0F;
    }
    
    public void method7172(float f, float f_192_, float f_193_, float f_194_) {
	float f_195_ = (float) Math.cos((double) f_194_);
	float f_196_ = (float) Math.sin((double) f_194_);
	aFloat4879 = f_195_ + f * f * (1.0F - f_195_);
	aFloat4878 = f_193_ * f_196_ + f_192_ * f * (1.0F - f_195_);
	aFloat4881 = -f_192_ * f_196_ + f_193_ * f * (1.0F - f_195_);
	aFloat4882 = -f_193_ * f_196_ + f * f_192_ * (1.0F - f_195_);
	aFloat4883 = f_195_ + f_192_ * f_192_ * (1.0F - f_195_);
	aFloat4890 = f * f_196_ + f_193_ * f_192_ * (1.0F - f_195_);
	aFloat4885 = f_192_ * f_196_ + f * f_193_ * (1.0F - f_195_);
	aFloat4884 = -f * f_196_ + f_192_ * f_193_ * (1.0F - f_195_);
	aFloat4887 = f_195_ + f_193_ * f_193_ * (1.0F - f_195_);
	aFloat4880 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4888 = 0.0F;
    }
    
    public void method7173(float f, float f_197_, float f_198_, float f_199_) {
	float f_200_ = (float) Math.cos((double) f_199_);
	float f_201_ = (float) Math.sin((double) f_199_);
	aFloat4879 = f_200_ + f * f * (1.0F - f_200_);
	aFloat4878 = f_198_ * f_201_ + f_197_ * f * (1.0F - f_200_);
	aFloat4881 = -f_197_ * f_201_ + f_198_ * f * (1.0F - f_200_);
	aFloat4882 = -f_198_ * f_201_ + f * f_197_ * (1.0F - f_200_);
	aFloat4883 = f_200_ + f_197_ * f_197_ * (1.0F - f_200_);
	aFloat4890 = f * f_201_ + f_198_ * f_197_ * (1.0F - f_200_);
	aFloat4885 = f_197_ * f_201_ + f * f_198_ * (1.0F - f_200_);
	aFloat4884 = -f * f_201_ + f_197_ * f_198_ * (1.0F - f_200_);
	aFloat4887 = f_200_ + f_198_ * f_198_ * (1.0F - f_200_);
	aFloat4880 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4888 = 0.0F;
    }
    
    public void method7174(float f, float f_202_, float f_203_, float f_204_) {
	float f_205_ = (float) Math.cos((double) f_204_);
	float f_206_ = (float) Math.sin((double) f_204_);
	aFloat4879 = f_205_ + f * f * (1.0F - f_205_);
	aFloat4878 = f_203_ * f_206_ + f_202_ * f * (1.0F - f_205_);
	aFloat4881 = -f_202_ * f_206_ + f_203_ * f * (1.0F - f_205_);
	aFloat4882 = -f_203_ * f_206_ + f * f_202_ * (1.0F - f_205_);
	aFloat4883 = f_205_ + f_202_ * f_202_ * (1.0F - f_205_);
	aFloat4890 = f * f_206_ + f_203_ * f_202_ * (1.0F - f_205_);
	aFloat4885 = f_202_ * f_206_ + f * f_203_ * (1.0F - f_205_);
	aFloat4884 = -f * f_206_ + f_202_ * f_203_ * (1.0F - f_205_);
	aFloat4887 = f_205_ + f_203_ * f_203_ * (1.0F - f_205_);
	aFloat4880 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4888 = 0.0F;
    }
    
    public void method7175(float f, float f_207_, float f_208_, float f_209_) {
	float f_210_ = (float) Math.cos((double) f_209_);
	float f_211_ = (float) Math.sin((double) f_209_);
	aFloat4879 = f_210_ + f * f * (1.0F - f_210_);
	aFloat4878 = f_208_ * f_211_ + f_207_ * f * (1.0F - f_210_);
	aFloat4881 = -f_207_ * f_211_ + f_208_ * f * (1.0F - f_210_);
	aFloat4882 = -f_208_ * f_211_ + f * f_207_ * (1.0F - f_210_);
	aFloat4883 = f_210_ + f_207_ * f_207_ * (1.0F - f_210_);
	aFloat4890 = f * f_211_ + f_208_ * f_207_ * (1.0F - f_210_);
	aFloat4885 = f_207_ * f_211_ + f * f_208_ * (1.0F - f_210_);
	aFloat4884 = -f * f_211_ + f_207_ * f_208_ * (1.0F - f_210_);
	aFloat4887 = f_210_ + f_208_ * f_208_ * (1.0F - f_210_);
	aFloat4880 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4888 = 0.0F;
    }
    
    public void method7176(Class429 class429) {
	method7167(class429.aFloat4812, class429.aFloat4811,
		   class429.aFloat4813, class429.aFloat4815);
    }
    
    public void method7177(Class429 class429) {
	method7167(class429.aFloat4812, class429.aFloat4811,
		   class429.aFloat4813, class429.aFloat4815);
    }
    
    public void method7178(Class444 class444_212_) {
	float f = aFloat4879;
	float f_213_ = aFloat4878;
	float f_214_ = aFloat4882;
	float f_215_ = aFloat4883;
	float f_216_ = aFloat4885;
	float f_217_ = aFloat4884;
	float f_218_ = aFloat4888;
	float f_219_ = aFloat4886;
	float f_220_ = aFloat4881;
	float f_221_ = aFloat4890;
	float f_222_ = aFloat4887;
	float f_223_ = aFloat4880;
	aFloat4879
	    = (f * class444_212_.aFloat4879 + f_213_ * class444_212_.aFloat4882
	       + f_220_ * class444_212_.aFloat4885);
	aFloat4878
	    = (f * class444_212_.aFloat4878 + f_213_ * class444_212_.aFloat4883
	       + f_220_ * class444_212_.aFloat4884);
	aFloat4881
	    = (f * class444_212_.aFloat4881 + f_213_ * class444_212_.aFloat4890
	       + f_220_ * class444_212_.aFloat4887);
	aFloat4882 = (f_214_ * class444_212_.aFloat4879
		      + f_215_ * class444_212_.aFloat4882
		      + f_221_ * class444_212_.aFloat4885);
	aFloat4883 = (f_214_ * class444_212_.aFloat4878
		      + f_215_ * class444_212_.aFloat4883
		      + f_221_ * class444_212_.aFloat4884);
	aFloat4890 = (f_214_ * class444_212_.aFloat4881
		      + f_215_ * class444_212_.aFloat4890
		      + f_221_ * class444_212_.aFloat4887);
	aFloat4885 = (f_216_ * class444_212_.aFloat4879
		      + f_217_ * class444_212_.aFloat4882
		      + f_222_ * class444_212_.aFloat4885);
	aFloat4884 = (f_216_ * class444_212_.aFloat4878
		      + f_217_ * class444_212_.aFloat4883
		      + f_222_ * class444_212_.aFloat4884);
	aFloat4887 = (f_216_ * class444_212_.aFloat4881
		      + f_217_ * class444_212_.aFloat4890
		      + f_222_ * class444_212_.aFloat4887);
	aFloat4888
	    = (f_218_ * class444_212_.aFloat4879
	       + f_219_ * class444_212_.aFloat4882
	       + f_223_ * class444_212_.aFloat4885 + class444_212_.aFloat4888);
	aFloat4886
	    = (f_218_ * class444_212_.aFloat4878
	       + f_219_ * class444_212_.aFloat4883
	       + f_223_ * class444_212_.aFloat4884 + class444_212_.aFloat4886);
	aFloat4880
	    = (f_218_ * class444_212_.aFloat4881
	       + f_219_ * class444_212_.aFloat4890
	       + f_223_ * class444_212_.aFloat4887 + class444_212_.aFloat4880);
    }
    
    public void method7179(Class444 class444_224_, Class444 class444_225_) {
	aFloat4879 = (class444_224_.aFloat4879 * class444_225_.aFloat4879
		      + class444_224_.aFloat4878 * class444_225_.aFloat4882
		      + class444_224_.aFloat4881 * class444_225_.aFloat4885);
	aFloat4878 = (class444_224_.aFloat4879 * class444_225_.aFloat4878
		      + class444_224_.aFloat4878 * class444_225_.aFloat4883
		      + class444_224_.aFloat4881 * class444_225_.aFloat4884);
	aFloat4881 = (class444_224_.aFloat4879 * class444_225_.aFloat4881
		      + class444_224_.aFloat4878 * class444_225_.aFloat4890
		      + class444_224_.aFloat4881 * class444_225_.aFloat4887);
	aFloat4882 = (class444_224_.aFloat4882 * class444_225_.aFloat4879
		      + class444_224_.aFloat4883 * class444_225_.aFloat4882
		      + class444_224_.aFloat4890 * class444_225_.aFloat4885);
	aFloat4883 = (class444_224_.aFloat4882 * class444_225_.aFloat4878
		      + class444_224_.aFloat4883 * class444_225_.aFloat4883
		      + class444_224_.aFloat4890 * class444_225_.aFloat4884);
	aFloat4890 = (class444_224_.aFloat4882 * class444_225_.aFloat4881
		      + class444_224_.aFloat4883 * class444_225_.aFloat4890
		      + class444_224_.aFloat4890 * class444_225_.aFloat4887);
	aFloat4885 = (class444_224_.aFloat4885 * class444_225_.aFloat4879
		      + class444_224_.aFloat4884 * class444_225_.aFloat4882
		      + class444_224_.aFloat4887 * class444_225_.aFloat4885);
	aFloat4884 = (class444_224_.aFloat4885 * class444_225_.aFloat4878
		      + class444_224_.aFloat4884 * class444_225_.aFloat4883
		      + class444_224_.aFloat4887 * class444_225_.aFloat4884);
	aFloat4887 = (class444_224_.aFloat4885 * class444_225_.aFloat4881
		      + class444_224_.aFloat4884 * class444_225_.aFloat4890
		      + class444_224_.aFloat4887 * class444_225_.aFloat4887);
	aFloat4888 = (class444_224_.aFloat4888 * class444_225_.aFloat4879
		      + class444_224_.aFloat4886 * class444_225_.aFloat4882
		      + class444_224_.aFloat4880 * class444_225_.aFloat4885
		      + class444_225_.aFloat4888);
	aFloat4886 = (class444_224_.aFloat4888 * class444_225_.aFloat4878
		      + class444_224_.aFloat4886 * class444_225_.aFloat4883
		      + class444_224_.aFloat4880 * class444_225_.aFloat4884
		      + class444_225_.aFloat4886);
	aFloat4880 = (class444_224_.aFloat4888 * class444_225_.aFloat4881
		      + class444_224_.aFloat4886 * class444_225_.aFloat4890
		      + class444_224_.aFloat4880 * class444_225_.aFloat4887
		      + class444_225_.aFloat4880);
    }
    
    public void method7180(float f, float f_226_, float f_227_) {
	aFloat4879 = f;
	aFloat4882 = 0.0F;
	aFloat4885 = 0.0F;
	aFloat4888 = 0.0F;
	aFloat4878 = 0.0F;
	aFloat4883 = f_226_;
	aFloat4884 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4890 = 0.0F;
	aFloat4887 = f_227_;
	aFloat4880 = 0.0F;
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4879).append(",").append
		   (aFloat4882).append
		   (",").append
		   (aFloat4885).append
		   (",").append
		   (aFloat4888).append
		   (" - ").append
		   (aFloat4878).append
		   (",").append
		   (aFloat4883).append
		   (",").append
		   (aFloat4884).append
		   (",").append
		   (aFloat4886).append
		   (" - ").append
		   (aFloat4881).append
		   (",").append
		   (aFloat4890).append
		   (",").append
		   (aFloat4887).append
		   (",").append
		   (aFloat4880).toString();
    }
    
    public void method7181(float f, float f_228_, float f_229_, float f_230_) {
	float f_231_ = (float) Math.cos((double) f_230_);
	float f_232_ = (float) Math.sin((double) f_230_);
	float f_233_ = f_231_ + f * f * (1.0F - f_231_);
	float f_234_ = f_229_ * f_232_ + f_228_ * f * (1.0F - f_231_);
	float f_235_ = -f_228_ * f_232_ + f_229_ * f * (1.0F - f_231_);
	float f_236_ = -f_229_ * f_232_ + f * f_228_ * (1.0F - f_231_);
	float f_237_ = f_231_ + f_228_ * f_228_ * (1.0F - f_231_);
	float f_238_ = f * f_232_ + f_229_ * f_228_ * (1.0F - f_231_);
	float f_239_ = f_228_ * f_232_ + f * f_229_ * (1.0F - f_231_);
	float f_240_ = -f * f_232_ + f_228_ * f_229_ * (1.0F - f_231_);
	float f_241_ = f_231_ + f_229_ * f_229_ * (1.0F - f_231_);
	float f_242_ = aFloat4879;
	float f_243_ = aFloat4878;
	float f_244_ = aFloat4882;
	float f_245_ = aFloat4883;
	float f_246_ = aFloat4885;
	float f_247_ = aFloat4884;
	float f_248_ = aFloat4888;
	float f_249_ = aFloat4886;
	aFloat4879 = f_242_ * f_233_ + f_243_ * f_236_ + aFloat4881 * f_239_;
	aFloat4878 = f_242_ * f_234_ + f_243_ * f_237_ + aFloat4881 * f_240_;
	aFloat4881 = f_242_ * f_235_ + f_243_ * f_238_ + aFloat4881 * f_241_;
	aFloat4882 = f_244_ * f_233_ + f_245_ * f_236_ + aFloat4890 * f_239_;
	aFloat4883 = f_244_ * f_234_ + f_245_ * f_237_ + aFloat4890 * f_240_;
	aFloat4890 = f_244_ * f_235_ + f_245_ * f_238_ + aFloat4890 * f_241_;
	aFloat4885 = f_246_ * f_233_ + f_247_ * f_236_ + aFloat4887 * f_239_;
	aFloat4884 = f_246_ * f_234_ + f_247_ * f_237_ + aFloat4887 * f_240_;
	aFloat4887 = f_246_ * f_235_ + f_247_ * f_238_ + aFloat4887 * f_241_;
	aFloat4888 = f_248_ * f_233_ + f_249_ * f_236_ + aFloat4880 * f_239_;
	aFloat4886 = f_248_ * f_234_ + f_249_ * f_237_ + aFloat4880 * f_240_;
	aFloat4880 = f_248_ * f_235_ + f_249_ * f_238_ + aFloat4880 * f_241_;
    }
    
    public void method7182(float f, float f_250_, float f_251_) {
	aFloat4884 = 0.0F;
	aFloat4885 = 0.0F;
	aFloat4890 = 0.0F;
	aFloat4882 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4878 = 0.0F;
	aFloat4887 = 1.0F;
	aFloat4883 = 1.0F;
	aFloat4879 = 1.0F;
	aFloat4888 = f;
	aFloat4886 = f_250_;
	aFloat4880 = f_251_;
    }
    
    public void method7183(float f, float f_252_, float f_253_) {
	aFloat4879 = f;
	aFloat4882 = 0.0F;
	aFloat4885 = 0.0F;
	aFloat4888 = 0.0F;
	aFloat4878 = 0.0F;
	aFloat4883 = f_252_;
	aFloat4884 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4890 = 0.0F;
	aFloat4887 = f_253_;
	aFloat4880 = 0.0F;
    }
    
    public void method7184(float f, float f_254_, float f_255_, float[] fs) {
	fs[0] = (aFloat4879 * f + aFloat4882 * f_254_ + aFloat4885 * f_255_
		 + aFloat4888);
	fs[1] = (aFloat4878 * f + aFloat4883 * f_254_ + aFloat4884 * f_255_
		 + aFloat4886);
	fs[2] = (aFloat4881 * f + aFloat4890 * f_254_ + aFloat4887 * f_255_
		 + aFloat4880);
    }
    
    public void method7185(Class446 class446) {
	method7147(class446.aFloat4895, class446.aFloat4896,
		   class446.aFloat4897);
    }
    
    public void method7186(float f, float f_256_, float f_257_) {
	aFloat4888 += f;
	aFloat4886 += f_256_;
	aFloat4880 += f_257_;
    }
    
    public void method7187(double d, double d_258_, double d_259_,
			   double d_260_, double d_261_, double d_262_,
			   float f, float f_263_, float f_264_) {
	float f_265_ = (float) (d_260_ - d);
	float f_266_ = (float) (d_261_ - d_258_);
	float f_267_ = (float) (d_262_ - d_259_);
	float f_268_ = f_263_ * f_267_ - f_264_ * f_266_;
	float f_269_ = f_264_ * f_265_ - f * f_267_;
	float f_270_ = f * f_266_ - f_263_ * f_265_;
	float f_271_ = (float) (1.0 / Math.sqrt((double) (f_268_ * f_268_
							  + f_269_ * f_269_
							  + f_270_ * f_270_)));
	float f_272_ = (float) (1.0 / Math.sqrt((double) (f_265_ * f_265_
							  + f_266_ * f_266_
							  + f_267_ * f_267_)));
	aFloat4879 = f_268_ * f_271_;
	aFloat4882 = f_269_ * f_271_;
	aFloat4885 = f_270_ * f_271_;
	aFloat4881 = f_265_ * f_272_;
	aFloat4890 = f_266_ * f_272_;
	aFloat4887 = f_267_ * f_272_;
	aFloat4878 = aFloat4890 * aFloat4885 - aFloat4887 * aFloat4882;
	aFloat4883 = aFloat4887 * aFloat4879 - aFloat4881 * aFloat4885;
	aFloat4884 = aFloat4881 * aFloat4882 - aFloat4890 * aFloat4879;
	aFloat4888
	    = -(float) (d * (double) aFloat4879 + d_258_ * (double) aFloat4882
			+ d_259_ * (double) aFloat4885);
	aFloat4886
	    = -(float) (d * (double) aFloat4878 + d_258_ * (double) aFloat4883
			+ d_259_ * (double) aFloat4884);
	aFloat4880
	    = -(float) (d * (double) aFloat4881 + d_258_ * (double) aFloat4890
			+ d_259_ * (double) aFloat4887);
    }
    
    public void method7188(double d, double d_273_, double d_274_,
			   double d_275_, double d_276_, double d_277_,
			   float f, float f_278_, float f_279_) {
	float f_280_ = (float) (d_275_ - d);
	float f_281_ = (float) (d_276_ - d_273_);
	float f_282_ = (float) (d_277_ - d_274_);
	float f_283_ = f_278_ * f_282_ - f_279_ * f_281_;
	float f_284_ = f_279_ * f_280_ - f * f_282_;
	float f_285_ = f * f_281_ - f_278_ * f_280_;
	float f_286_ = (float) (1.0 / Math.sqrt((double) (f_283_ * f_283_
							  + f_284_ * f_284_
							  + f_285_ * f_285_)));
	float f_287_ = (float) (1.0 / Math.sqrt((double) (f_280_ * f_280_
							  + f_281_ * f_281_
							  + f_282_ * f_282_)));
	aFloat4879 = f_283_ * f_286_;
	aFloat4882 = f_284_ * f_286_;
	aFloat4885 = f_285_ * f_286_;
	aFloat4881 = f_280_ * f_287_;
	aFloat4890 = f_281_ * f_287_;
	aFloat4887 = f_282_ * f_287_;
	aFloat4878 = aFloat4890 * aFloat4885 - aFloat4887 * aFloat4882;
	aFloat4883 = aFloat4887 * aFloat4879 - aFloat4881 * aFloat4885;
	aFloat4884 = aFloat4881 * aFloat4882 - aFloat4890 * aFloat4879;
	aFloat4888
	    = -(float) (d * (double) aFloat4879 + d_273_ * (double) aFloat4882
			+ d_274_ * (double) aFloat4885);
	aFloat4886
	    = -(float) (d * (double) aFloat4878 + d_273_ * (double) aFloat4883
			+ d_274_ * (double) aFloat4884);
	aFloat4880
	    = -(float) (d * (double) aFloat4881 + d_273_ * (double) aFloat4890
			+ d_274_ * (double) aFloat4887);
    }
    
    public void method7189(Class444 class444_288_, Class444 class444_289_) {
	aFloat4879 = (class444_288_.aFloat4879 * class444_289_.aFloat4879
		      + class444_288_.aFloat4878 * class444_289_.aFloat4882
		      + class444_288_.aFloat4881 * class444_289_.aFloat4885);
	aFloat4878 = (class444_288_.aFloat4879 * class444_289_.aFloat4878
		      + class444_288_.aFloat4878 * class444_289_.aFloat4883
		      + class444_288_.aFloat4881 * class444_289_.aFloat4884);
	aFloat4881 = (class444_288_.aFloat4879 * class444_289_.aFloat4881
		      + class444_288_.aFloat4878 * class444_289_.aFloat4890
		      + class444_288_.aFloat4881 * class444_289_.aFloat4887);
	aFloat4882 = (class444_288_.aFloat4882 * class444_289_.aFloat4879
		      + class444_288_.aFloat4883 * class444_289_.aFloat4882
		      + class444_288_.aFloat4890 * class444_289_.aFloat4885);
	aFloat4883 = (class444_288_.aFloat4882 * class444_289_.aFloat4878
		      + class444_288_.aFloat4883 * class444_289_.aFloat4883
		      + class444_288_.aFloat4890 * class444_289_.aFloat4884);
	aFloat4890 = (class444_288_.aFloat4882 * class444_289_.aFloat4881
		      + class444_288_.aFloat4883 * class444_289_.aFloat4890
		      + class444_288_.aFloat4890 * class444_289_.aFloat4887);
	aFloat4885 = (class444_288_.aFloat4885 * class444_289_.aFloat4879
		      + class444_288_.aFloat4884 * class444_289_.aFloat4882
		      + class444_288_.aFloat4887 * class444_289_.aFloat4885);
	aFloat4884 = (class444_288_.aFloat4885 * class444_289_.aFloat4878
		      + class444_288_.aFloat4884 * class444_289_.aFloat4883
		      + class444_288_.aFloat4887 * class444_289_.aFloat4884);
	aFloat4887 = (class444_288_.aFloat4885 * class444_289_.aFloat4881
		      + class444_288_.aFloat4884 * class444_289_.aFloat4890
		      + class444_288_.aFloat4887 * class444_289_.aFloat4887);
	aFloat4888 = (class444_288_.aFloat4888 * class444_289_.aFloat4879
		      + class444_288_.aFloat4886 * class444_289_.aFloat4882
		      + class444_288_.aFloat4880 * class444_289_.aFloat4885
		      + class444_289_.aFloat4888);
	aFloat4886 = (class444_288_.aFloat4888 * class444_289_.aFloat4878
		      + class444_288_.aFloat4886 * class444_289_.aFloat4883
		      + class444_288_.aFloat4880 * class444_289_.aFloat4884
		      + class444_289_.aFloat4886);
	aFloat4880 = (class444_288_.aFloat4888 * class444_289_.aFloat4881
		      + class444_288_.aFloat4886 * class444_289_.aFloat4890
		      + class444_288_.aFloat4880 * class444_289_.aFloat4887
		      + class444_289_.aFloat4880);
    }
    
    public void method7190(Class444 class444_290_, Class444 class444_291_) {
	aFloat4879 = (class444_290_.aFloat4879 * class444_291_.aFloat4879
		      + class444_290_.aFloat4878 * class444_291_.aFloat4882
		      + class444_290_.aFloat4881 * class444_291_.aFloat4885);
	aFloat4878 = (class444_290_.aFloat4879 * class444_291_.aFloat4878
		      + class444_290_.aFloat4878 * class444_291_.aFloat4883
		      + class444_290_.aFloat4881 * class444_291_.aFloat4884);
	aFloat4881 = (class444_290_.aFloat4879 * class444_291_.aFloat4881
		      + class444_290_.aFloat4878 * class444_291_.aFloat4890
		      + class444_290_.aFloat4881 * class444_291_.aFloat4887);
	aFloat4882 = (class444_290_.aFloat4882 * class444_291_.aFloat4879
		      + class444_290_.aFloat4883 * class444_291_.aFloat4882
		      + class444_290_.aFloat4890 * class444_291_.aFloat4885);
	aFloat4883 = (class444_290_.aFloat4882 * class444_291_.aFloat4878
		      + class444_290_.aFloat4883 * class444_291_.aFloat4883
		      + class444_290_.aFloat4890 * class444_291_.aFloat4884);
	aFloat4890 = (class444_290_.aFloat4882 * class444_291_.aFloat4881
		      + class444_290_.aFloat4883 * class444_291_.aFloat4890
		      + class444_290_.aFloat4890 * class444_291_.aFloat4887);
	aFloat4885 = (class444_290_.aFloat4885 * class444_291_.aFloat4879
		      + class444_290_.aFloat4884 * class444_291_.aFloat4882
		      + class444_290_.aFloat4887 * class444_291_.aFloat4885);
	aFloat4884 = (class444_290_.aFloat4885 * class444_291_.aFloat4878
		      + class444_290_.aFloat4884 * class444_291_.aFloat4883
		      + class444_290_.aFloat4887 * class444_291_.aFloat4884);
	aFloat4887 = (class444_290_.aFloat4885 * class444_291_.aFloat4881
		      + class444_290_.aFloat4884 * class444_291_.aFloat4890
		      + class444_290_.aFloat4887 * class444_291_.aFloat4887);
	aFloat4888 = (class444_290_.aFloat4888 * class444_291_.aFloat4879
		      + class444_290_.aFloat4886 * class444_291_.aFloat4882
		      + class444_290_.aFloat4880 * class444_291_.aFloat4885
		      + class444_291_.aFloat4888);
	aFloat4886 = (class444_290_.aFloat4888 * class444_291_.aFloat4878
		      + class444_290_.aFloat4886 * class444_291_.aFloat4883
		      + class444_290_.aFloat4880 * class444_291_.aFloat4884
		      + class444_291_.aFloat4886);
	aFloat4880 = (class444_290_.aFloat4888 * class444_291_.aFloat4881
		      + class444_290_.aFloat4886 * class444_291_.aFloat4890
		      + class444_290_.aFloat4880 * class444_291_.aFloat4887
		      + class444_291_.aFloat4880);
    }
    
    public void method7191(float f, float f_292_, float f_293_, float[] fs) {
	fs[0] = (aFloat4879 * f + aFloat4882 * f_292_ + aFloat4885 * f_293_
		 + aFloat4888);
	fs[1] = (aFloat4878 * f + aFloat4883 * f_292_ + aFloat4884 * f_293_
		 + aFloat4886);
	fs[2] = (aFloat4881 * f + aFloat4890 * f_292_ + aFloat4887 * f_293_
		 + aFloat4880);
    }
    
    public void method7192(float f, float f_294_, float f_295_, float[] fs) {
	fs[0] = (aFloat4879 * f + aFloat4882 * f_294_ + aFloat4885 * f_295_
		 + aFloat4888);
	fs[1] = (aFloat4878 * f + aFloat4883 * f_294_ + aFloat4884 * f_295_
		 + aFloat4886);
	fs[2] = (aFloat4881 * f + aFloat4890 * f_294_ + aFloat4887 * f_295_
		 + aFloat4880);
    }
    
    public void method7193(float f, float f_296_, float f_297_) {
	aFloat4879 = f;
	aFloat4882 = 0.0F;
	aFloat4885 = 0.0F;
	aFloat4888 = 0.0F;
	aFloat4878 = 0.0F;
	aFloat4883 = f_296_;
	aFloat4884 = 0.0F;
	aFloat4886 = 0.0F;
	aFloat4881 = 0.0F;
	aFloat4890 = 0.0F;
	aFloat4887 = f_297_;
	aFloat4880 = 0.0F;
    }
    
    public void method7194(float f, float f_298_, float f_299_, float[] fs) {
	fs[0] = (aFloat4879 * f + aFloat4882 * f_298_ + aFloat4885 * f_299_
		 + aFloat4888);
	fs[1] = (aFloat4878 * f + aFloat4883 * f_298_ + aFloat4884 * f_299_
		 + aFloat4886);
	fs[2] = (aFloat4881 * f + aFloat4890 * f_298_ + aFloat4887 * f_299_
		 + aFloat4880);
    }
    
    public void method7195(float f, float f_300_, float f_301_, float[] fs) {
	f -= aFloat4888;
	f_300_ -= aFloat4886;
	f_301_ -= aFloat4880;
	fs[0] = (float) (int) (aFloat4879 * f + aFloat4878 * f_300_
			       + aFloat4881 * f_301_);
	fs[1] = (float) (int) (aFloat4882 * f + aFloat4883 * f_300_
			       + aFloat4890 * f_301_);
	fs[2] = (float) (int) (aFloat4885 * f + aFloat4884 * f_300_
			       + aFloat4887 * f_301_);
    }
    
    public void method7196(float[] fs) {
	float f = fs[0] - aFloat4888;
	float f_302_ = fs[1] - aFloat4886;
	float f_303_ = fs[2] - aFloat4880;
	fs[0] = (float) (int) (aFloat4879 * f + aFloat4878 * f_302_
			       + aFloat4881 * f_303_);
	fs[1] = (float) (int) (aFloat4882 * f + aFloat4883 * f_302_
			       + aFloat4890 * f_303_);
	fs[2] = (float) (int) (aFloat4885 * f + aFloat4884 * f_302_
			       + aFloat4887 * f_303_);
    }
    
    public void method7197(float[] fs) {
	float f = fs[0] - aFloat4888;
	float f_304_ = fs[1] - aFloat4886;
	float f_305_ = fs[2] - aFloat4880;
	fs[0] = (float) (int) (aFloat4879 * f + aFloat4878 * f_304_
			       + aFloat4881 * f_305_);
	fs[1] = (float) (int) (aFloat4882 * f + aFloat4883 * f_304_
			       + aFloat4890 * f_305_);
	fs[2] = (float) (int) (aFloat4885 * f + aFloat4884 * f_304_
			       + aFloat4887 * f_305_);
    }
    
    public void method7198(float[] fs) {
	float f = fs[0] - aFloat4888;
	float f_306_ = fs[1] - aFloat4886;
	float f_307_ = fs[2] - aFloat4880;
	fs[0] = (float) (int) (aFloat4879 * f + aFloat4878 * f_306_
			       + aFloat4881 * f_307_);
	fs[1] = (float) (int) (aFloat4882 * f + aFloat4883 * f_306_
			       + aFloat4890 * f_307_);
	fs[2] = (float) (int) (aFloat4885 * f + aFloat4884 * f_306_
			       + aFloat4887 * f_307_);
    }
    
    public void method7199(float[] fs) {
	float f = fs[0];
	float f_308_ = fs[1];
	float f_309_ = fs[2];
	fs[0] = aFloat4879 * f + aFloat4878 * f_308_ + aFloat4881 * f_309_;
	fs[1] = aFloat4882 * f + aFloat4883 * f_308_ + aFloat4890 * f_309_;
	fs[2] = aFloat4885 * f + aFloat4884 * f_308_ + aFloat4887 * f_309_;
    }
    
    public void method7200(float[] fs) {
	float f = fs[0];
	float f_310_ = fs[1];
	float f_311_ = fs[2];
	fs[0] = aFloat4879 * f + aFloat4878 * f_310_ + aFloat4881 * f_311_;
	fs[1] = aFloat4882 * f + aFloat4883 * f_310_ + aFloat4890 * f_311_;
	fs[2] = aFloat4885 * f + aFloat4884 * f_310_ + aFloat4887 * f_311_;
    }
    
    public void method7201(float[] fs) {
	float f = fs[0];
	float f_312_ = fs[1];
	float f_313_ = fs[2];
	fs[0] = aFloat4879 * f + aFloat4878 * f_312_ + aFloat4881 * f_313_;
	fs[1] = aFloat4882 * f + aFloat4883 * f_312_ + aFloat4890 * f_313_;
	fs[2] = aFloat4885 * f + aFloat4884 * f_312_ + aFloat4887 * f_313_;
    }
}
