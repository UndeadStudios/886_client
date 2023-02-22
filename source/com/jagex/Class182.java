/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class182
{
    protected int anInt1935;
    public static final int anInt1936 = 1;
    public static final int anInt1937 = 2;
    public static final int anInt1938 = 3;
    public static final int anInt1939 = 0;
    static final int anInt1940 = 8;
    static boolean[] aBoolArray1941 = new boolean[8];
    public int anInt1942;
    public Interface24 anInterface24_1943;
    public Class180 aClass180_1944;
    public Interface47 anInterface47_1945;
    public Interface48 anInterface48_1946;
    static final int anInt1947 = 4;
    public static final int anInt1948 = 1;
    protected static final int anInt1949 = 2;
    protected static final int anInt1950 = 1;
    protected Hashtable aHashtable1951;
    public static final int anInt1952 = 0;
    protected static final int anInt1953 = 8;
    protected static final int anInt1954 = 16;
    protected static final int anInt1955 = 32;
    protected static final int anInt1956 = 4;
    public static final int anInt1957 = 2;
    public int anInt1958;
    protected Class168_Sub1 aClass168_Sub1_1959;
    int anInt1960 = 1560766559;
    Class168_Sub2[] aClass168_Sub2Array1961;
    protected int anInt1962;
    protected int anInt1963;
    public int anInt1964;
    public static final int anInt1965 = 5;
    protected Class168 aClass168_1966;
    protected int anInt1967;
    public float aFloat1968;
    
    public abstract Class152 method3129(int i, int i_0_, int[] is,
					int[] is_1_);
    
    Class182(Class180 class180, Interface24 interface24,
	     Interface47 interface47, Interface48 interface48,
	     Interface49 interface49) {
	aHashtable1951 = new Hashtable();
	aClass168_Sub2Array1961 = new Class168_Sub2[4];
	anInt1967 = 0;
	aFloat1968 = 0.0F;
	aClass180_1944 = class180;
	anInterface24_1943 = interface24;
	anInterface47_1945 = interface47;
	anInterface48_1946 = interface48;
	int i = -1;
	for (int i_2_ = 0; i_2_ < 8; i_2_++) {
	    if (!aBoolArray1941[i_2_]) {
		aBoolArray1941[i_2_] = true;
		i = i_2_;
		break;
	    }
	}
	if (-1 == i)
	    throw new IllegalStateException("");
	anInt1942 = i * -339034991;
    }
    
    public abstract Class170 method3130();
    
    public void method3131() {
	/* empty */
    }
    
    public abstract void method3132();
    
    public abstract void method3133();
    
    public void method3134(int i) {
	aBoolArray1941[-2117565327 * anInt1942] = false;
	Enumeration enumeration = aHashtable1951.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    Class168_Sub1 class168_sub1
		= (Class168_Sub1) aHashtable1951.get(canvas);
	    class168_sub1.method127();
	}
	method3135();
    }
    
    abstract void method3135();
    
    public abstract void method3136(int i);
    
    public abstract int method3137();
    
    public void finalize() {
	method3134(-1555091587);
    }
    
    public abstract boolean method3138();
    
    public abstract boolean method3139();
    
    public abstract void method3140(int i, int i_3_, int i_4_);
    
    public abstract void method3141(boolean bool);
    
    public abstract boolean method3142();
    
    public abstract boolean method3143();
    
    public abstract boolean method3144();
    
    public abstract boolean method3145();
    
    public abstract boolean method3146();
    
    public abstract void method3147(int i, int i_5_, int i_6_, int i_7_,
				    int i_8_, int i_9_);
    
    public void method3148(boolean bool) {
	/* empty */
    }
    
    public abstract void method3149(int i, int i_10_, int[] is, int[] is_11_);
    
    public abstract void method3150(int i, int i_12_, int i_13_, int i_14_,
				    int i_15_, int i_16_, int i_17_);
    
    public abstract void method3151(int i, int i_18_, int i_19_, int i_20_,
				    int i_21_, int i_22_);
    
    public void method3152() {
	/* empty */
    }
    
    public final void method3153(Canvas canvas, int i, int i_23_, int i_24_) {
	if (!aHashtable1951.containsKey(canvas)) {
	    Class66.method1435(canvas, -1772156234);
	    method3154(canvas, method3536(canvas, i, i_23_), 546686691);
	}
    }
    
    final void method3154(Canvas canvas, Class168_Sub1 class168_sub1, int i) {
	if (class168_sub1 == null)
	    throw new RuntimeException("");
	aHashtable1951.put(canvas, class168_sub1);
    }
    
    public abstract void method3155();
    
    public abstract void method3156(int i, int i_25_, int i_26_, int i_27_,
				    int i_28_, int i_29_);
    
    public final void method3157(Canvas canvas, int i, int i_30_, byte i_31_) {
	Class168_Sub1 class168_sub1
	    = (Class168_Sub1) aHashtable1951.get(canvas);
	if (null == class168_sub1)
	    throw new RuntimeException("");
	class168_sub1.method14605(i, i_30_);
    }
    
    public final void method3158(Class168_Sub2 class168_sub2, int i) {
	if (anInt1960 * 1070795873 >= 3)
	    throw new RuntimeException();
	if (1070795873 * anInt1960 >= 0)
	    aClass168_Sub2Array1961[anInt1960 * 1070795873].method2712();
	else
	    aClass168_Sub1_1959.method2712();
	aClass168_1966
	    = aClass168_Sub2Array1961[(anInt1960 += -1560766559) * 1070795873]
	    = class168_sub2;
	class168_sub2.method350();
    }
    
    public final void method3159(Class168_Sub2 class168_sub2, int i) {
	if (anInt1960 * 1070795873 < 0
	    || (aClass168_Sub2Array1961[anInt1960 * 1070795873]
		!= class168_sub2))
	    throw new RuntimeException();
	aClass168_Sub2Array1961[(anInt1960 -= -1560766559) * 1070795873 + 1]
	    = null;
	class168_sub2.method2712();
	if (anInt1960 * 1070795873 >= 0) {
	    aClass168_1966 = aClass168_Sub2Array1961[anInt1960 * 1070795873];
	    aClass168_Sub2Array1961[1070795873 * anInt1960].method350();
	} else {
	    aClass168_1966 = aClass168_Sub1_1959;
	    aClass168_Sub1_1959.method350();
	}
    }
    
    public final Class168_Sub1 method3160() {
	return aClass168_Sub1_1959;
    }
    
    public void method3161() {
	/* empty */
    }
    
    public final void method3162(Canvas canvas) {
	if (aHashtable1951.containsKey(canvas)) {
	    Class168_Sub1 class168_sub1
		= (Class168_Sub1) aHashtable1951.get(canvas);
	    class168_sub1.method127();
	    aHashtable1951.remove(canvas);
	}
    }
    
    public abstract Interface22 method3163(int i, int i_32_);
    
    public abstract Interface22 method3164(int i, int i_33_, int i_34_);
    
    public abstract int[] method3165(int i, int i_35_, int i_36_, int i_37_);
    
    public abstract void method3166();
    
    public abstract boolean method3167();
    
    public abstract Interface21 method3168(int i, int i_38_, Class165 class165,
					   Class178 class178, int i_39_);
    
    public abstract boolean method3169();
    
    public abstract boolean method3170();
    
    public abstract int method3171();
    
    public abstract Class435 method3172();
    
    public abstract void method3173(int i, int i_40_, int i_41_);
    
    public abstract long method3174(int i, int i_42_);
    
    public boolean method3175(int i, int i_43_, Class444 class444,
			      Class443 class443) {
	return method3208(i, i_43_, 0, 0, class444, class443);
    }
    
    public byte[] method3176(int i, int i_44_, int i_45_, int i_46_, byte[] is,
			     int i_47_, int i_48_, int i_49_, byte i_50_) {
	byte[] is_51_ = new byte[i_46_ * i_45_ * i_49_];
	if (0 == i_48_)
	    i_48_ = i_49_ * i;
	for (int i_52_ = 0; i_52_ < i_46_; i_52_++) {
	    if (i_52_ < i_44_) {
		int i_53_ = i_52_ * i_48_ + i_47_;
		for (int i_54_ = 0; i_54_ < i; i_54_++) {
		    for (int i_55_ = 0; i_55_ < i_49_; i_55_++)
			is_51_[i_55_ + (i_49_ * i_54_ + i_52_ * i_45_ * i_49_)]
			    = is[i_54_ * i_49_ + i_53_ + i_55_];
		}
		byte[] is_56_ = new byte[i_49_];
		for (int i_57_ = 0; i_57_ < i_49_; i_57_++)
		    is_56_[i_57_] = is[(i - 1) * i_49_ + i_53_ + i_57_];
		for (int i_58_ = i; i_58_ < i_45_; i_58_++) {
		    for (int i_59_ = 0; i_59_ < i_49_; i_59_++)
			is_51_[i_59_ + (i_58_ * i_49_ + i_52_ * i_45_ * i_49_)]
			    = is_56_[i_59_];
		}
	    } else {
		int i_60_ = (i_44_ - 1) * i_45_ * i_49_;
		for (int i_61_ = 0; i_61_ < i_45_; i_61_++) {
		    for (int i_62_ = 0; i_62_ < i_49_; i_62_++)
			is_51_[i_62_ + (i_52_ * i_45_ * i_49_ + i_49_ * i_61_)]
			    = is_51_[i_62_ + (i_61_ * i_49_ + i_60_)];
		}
	    }
	}
	return is_51_;
    }
    
    void method3177(int i, int i_63_, short i_64_) {
	anInt1962 = i * -1629751061;
	anInt1963 = i_63_ * -770771981;
	float f = ((float) aClass168_1966.method2710()
		   / (float) aClass168_1966.method2711());
	float f_65_ = ((float) (anInt1962 * -1079316541)
		       / (float) (anInt1963 * -1736975045));
	if (f < f_65_) {
	    anInt1935
		= -1462491371 * (int) (f * (float) (-1736975045 * anInt1963));
	    anInt1967 = anInt1963 * 364806403;
	} else {
	    anInt1935 = anInt1962 * 1225285631;
	    anInt1967
		= (int) ((float) (anInt1962 * -1079316541) / f) * -59486503;
	}
	aFloat1968 = ((float) (anInt1935 * -1588334531)
		      / (float) aClass168_1966.method2710());
	anInt1958 = ((-1079316541 * anInt1962 - -1588334531 * anInt1935) / 2
		     * 1327965037);
	anInt1964 = ((-1736975045 * anInt1963 - -863940247 * anInt1967) / 2
		     * 2142894957);
    }
    
    public abstract void method3178();
    
    public int[] method3179(int i, int i_66_, int i_67_, int i_68_, int[] is,
			    int i_69_, int i_70_) {
	int[] is_71_ = new int[i_67_ * i_68_];
	if (0 == i_70_)
	    i_70_ = i;
	for (int i_72_ = 0; i_72_ < i_68_; i_72_++) {
	    if (i_72_ < i_66_) {
		int i_73_ = i_69_ + i_72_ * i_70_;
		for (int i_74_ = 0; i_74_ < i; i_74_++)
		    is_71_[i_72_ * i_67_ + i_74_] = is[i_73_ + i_74_];
		int i_75_ = is[i_73_ + (i - 1)];
		for (int i_76_ = i; i_76_ < i_67_; i_76_++)
		    is_71_[i_76_ + i_72_ * i_67_] = i_75_;
	    } else {
		int i_77_ = i_67_ * (i_66_ - 1);
		for (int i_78_ = 0; i_78_ < i_67_; i_78_++)
		    is_71_[i_78_ + i_67_ * i_72_] = is_71_[i_77_ + i_78_];
	    }
	}
	return is_71_;
    }
    
    public abstract void method3180(int i);
    
    public abstract void method3181(int[] is);
    
    public abstract void method3182(float f, float f_79_);
    
    abstract void method3183(int i, int i_80_) throws Exception_Sub4;
    
    public abstract void method3184(int i, int i_81_, int i_82_, int i_83_);
    
    public abstract void method3185(int i, int i_84_, int i_85_, int i_86_);
    
    public void method3186(boolean bool) {
	/* empty */
    }
    
    public abstract void method3187(int[] is);
    
    public abstract void method3188(int i, int i_87_);
    
    public final void method3189(int i, int i_88_, int i_89_, int i_90_,
				 int i_91_, int i_92_) {
	method3195(i, i_88_, i_89_, i_90_, i_91_, 1);
    }
    
    public final void method3190(int i, int i_93_, int i_94_, int i_95_,
				 int i_96_, byte i_97_) {
	method3151(i, i_93_, i_94_, i_95_, i_96_, 1);
    }
    
    public abstract int method3191();
    
    public final void method3192(int i, int i_98_, int i_99_, int i_100_,
				 int i_101_) {
	method3199(i, i_98_, i_99_, i_100_, 1);
    }
    
    public final void method3193(int i, int i_102_, int i_103_, int i_104_,
				 int i_105_) {
	method3200(i, i_102_, i_103_, i_104_, 1);
    }
    
    public final void method3194(int i, int i_106_, int i_107_, int i_108_,
				 int i_109_, int i_110_) {
	method3201(i, i_106_, i_107_, i_108_, i_109_, 1);
    }
    
    public abstract void method3195(int i, int i_111_, int i_112_, int i_113_,
				    int i_114_, int i_115_);
    
    public final void method3196(int i, int i_116_, int i_117_, int i_118_,
				 int i_119_) {
	method3201(i, i_116_, i_117_, i_118_, i_119_, 1);
    }
    
    public abstract void method3197(int i, int i_120_, float f, int i_121_,
				    int i_122_, float f_123_, int i_124_,
				    int i_125_, float f_126_, int i_127_,
				    int i_128_, int i_129_, int i_130_);
    
    public final void method3198(int i, int i_131_, int i_132_, int i_133_,
				 byte i_134_) {
	method3239(i, i_131_, i_132_, i_133_, 1);
    }
    
    abstract void method3199(int i, int i_135_, int i_136_, int i_137_,
			     int i_138_);
    
    abstract void method3200(int i, int i_139_, int i_140_, int i_141_,
			     int i_142_);
    
    public abstract void method3201(int i, int i_143_, int i_144_, int i_145_,
				    int i_146_, int i_147_);
    
    public abstract void method3202(int i, int i_148_, int i_149_, int i_150_,
				    int i_151_, int i_152_, Class152 class152,
				    int i_153_, int i_154_);
    
    public abstract Class161 method3203(int i, int i_155_, int[][] is,
					int[][] is_156_, int i_157_,
					int i_158_, int i_159_);
    
    public abstract void method3204(int i, int i_160_, int i_161_, int i_162_,
				    int i_163_, int i_164_, Class152 class152,
				    int i_165_, int i_166_, int i_167_,
				    int i_168_, int i_169_);
    
    abstract boolean method3205(int i, int i_170_, int i_171_, int i_172_,
				Class444 class444, Class443 class443);
    
    public abstract int method3206(int i, int i_173_, int i_174_, int i_175_,
				   int i_176_, int i_177_);
    
    public abstract int[] method3207(int i, int i_178_, int i_179_,
				     int i_180_);
    
    abstract boolean method3208(int i, int i_181_, int i_182_, int i_183_,
				Class444 class444, Class443 class443);
    
    public abstract Class525_Sub26 method3209(int i);
    
    public abstract Class525_Sub26 method3210(int i);
    
    public abstract void method3211(Class525_Sub26 class525_sub26);
    
    public Class157 method3212(int i, int i_184_, boolean bool, int i_185_) {
	return method3213(i, i_184_, bool, false);
    }
    
    public abstract Class157 method3213(int i, int i_186_, boolean bool,
					boolean bool_187_);
    
    public abstract Class157 method3214(int[] is, int i, int i_188_,
					int i_189_, int i_190_, boolean bool);
    
    public Class157 method3215(int[] is, int i, int i_191_, int i_192_,
			       int i_193_, byte i_194_) {
	return method3214(is, i, i_191_, i_192_, i_193_, true);
    }
    
    public abstract Class157 method3216(Class173 class173, boolean bool);
    
    public abstract Class157 method3217(int i, int i_195_, int i_196_,
					int i_197_, boolean bool);
    
    public void method3218() {
	/* empty */
    }
    
    public void method3219() {
	/* empty */
    }
    
    public abstract boolean method3220();
    
    public abstract void method3221(float f, float f_198_, float f_199_,
				    float f_200_, float f_201_);
    
    public abstract long method3222(int i, int i_202_);
    
    public abstract Class175 method3223(Class7 class7, Class173[] class173s,
					boolean bool);
    
    public abstract Class435 method3224();
    
    public abstract Class444 method3225();
    
    public abstract void method3226(int i);
    
    public abstract Class157 method3227(int[] is, int i, int i_203_,
					int i_204_, int i_205_, boolean bool);
    
    static synchronized Class182 method3228
	(int i, Canvas canvas, Class180 class180, Interface24 interface24,
     Interface47 interface47, Interface48 interface48,
     Interface49 interface49, JS5 class458, int i_206_, int i_207_,
     int i_208_, int i_209_) {
	if (0 == i)
	    return Class604.method9986(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       i_207_, i_208_, (byte) 29);
	if (1 == i)
	    return Class151.method2440(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       i_206_);
	if (5 == i)
	    return Class502.method8201(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       class458, i_206_);
	if (i == 3)
	    return Class408.method6639(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       class458, i_206_);
	throw new IllegalArgumentException("");
    }
    
    public abstract int method3229(int i, int i_210_);
    
    public abstract void method3230(float f, float f_211_, float f_212_,
				    float[] fs);
    
    public boolean method3231(int i) {
	return true;
    }
    
    public final void method3232(Canvas canvas) {
	if (aHashtable1951.containsKey(canvas)) {
	    Class168_Sub1 class168_sub1
		= (Class168_Sub1) aHashtable1951.get(canvas);
	    class168_sub1.method127();
	    aHashtable1951.remove(canvas);
	}
    }
    
    public abstract void method3233(Class444 class444);
    
    public void method3234(int[] is) {
	if (aClass168_Sub1_1959 != null) {
	    is[0] = aClass168_Sub1_1959.method2710();
	    is[1] = aClass168_Sub1_1959.method2711();
	} else {
	    int[] is_213_ = is;
	    is[1] = 0;
	    is_213_[0] = 0;
	}
    }
    
    public abstract void method3235(boolean bool);
    
    public abstract void method3236();
    
    public abstract Class435 method3237();
    
    public abstract void method3238(int i);
    
    abstract void method3239(int i, int i_214_, int i_215_, int i_216_,
			     int i_217_);
    
    public abstract void method3240(int i);
    
    void method3241(int i, int i_218_) {
	anInt1962 = i * -1629751061;
	anInt1963 = i_218_ * -770771981;
	float f = ((float) aClass168_1966.method2710()
		   / (float) aClass168_1966.method2711());
	float f_219_ = ((float) (anInt1962 * -1079316541)
			/ (float) (anInt1963 * -1736975045));
	if (f < f_219_) {
	    anInt1935
		= -1462491371 * (int) (f * (float) (-1736975045 * anInt1963));
	    anInt1967 = anInt1963 * 364806403;
	} else {
	    anInt1935 = anInt1962 * 1225285631;
	    anInt1967
		= (int) ((float) (anInt1962 * -1079316541) / f) * -59486503;
	}
	aFloat1968 = ((float) (anInt1935 * -1588334531)
		      / (float) aClass168_1966.method2710());
	anInt1958 = ((-1079316541 * anInt1962 - -1588334531 * anInt1935) / 2
		     * 1327965037);
	anInt1964 = ((-1736975045 * anInt1963 - -863940247 * anInt1967) / 2
		     * 2142894957);
    }
    
    public abstract int method3242();
    
    public Class525_Sub21 method3243(int i, int i_220_, int i_221_, int i_222_,
				     int i_223_, float f) {
	return new Class525_Sub21(i, i_220_, i_221_, i_222_, i_223_, f);
    }
    
    public abstract void method3244(int i, Class525_Sub21[] class525_sub21s);
    
    public abstract Class174 method3245(int i);
    
    public abstract Class174 method3246(Class174 class174,
					Class174 class174_224_, float f,
					Class174 class174_225_);
    
    public abstract void method3247(Class174 class174);
    
    public abstract void method3248(int i, int i_226_, int i_227_, int i_228_);
    
    public abstract void method3249(int i, int i_229_);
    
    public abstract boolean method3250();
    
    public abstract Class435 method3251();
    
    public abstract void method3252(Class435 class435);
    
    public abstract Class169 method3253(int[] is);
    
    public abstract boolean method3254();
    
    public abstract void method3255(float f, float f_230_, float f_231_,
				    float[] fs);
    
    public abstract boolean method3256();
    
    public abstract void method3257(int i, int i_232_, int i_233_, int i_234_);
    
    public abstract boolean method3258();
    
    public void method3259(float f, float f_235_, float f_236_, int i) {
	method3260(f, f_235_, f_236_, 0.0F, 1.0F, 1.0F);
    }
    
    abstract void method3260(float f, float f_237_, float f_238_, float f_239_,
			     float f_240_, float f_241_);
    
    public abstract void method3261(int i, Class176 class176);
    
    public abstract void method3262(int i, Class176 class176);
    
    public abstract void method3263();
    
    abstract void method3264(float f, float f_242_, float f_243_, float f_244_,
			     float f_245_, float f_246_);
    
    public abstract String method3265();
    
    public int[] method3266(int i, int i_247_, int i_248_, int i_249_,
			    int[] is, int i_250_, int i_251_, int i_252_) {
	int[] is_253_ = new int[i_248_ * i_249_];
	if (0 == i_251_)
	    i_251_ = i;
	for (int i_254_ = 0; i_254_ < i_249_; i_254_++) {
	    if (i_254_ < i_247_) {
		int i_255_ = i_250_ + i_254_ * i_251_;
		for (int i_256_ = 0; i_256_ < i; i_256_++)
		    is_253_[i_254_ * i_248_ + i_256_] = is[i_255_ + i_256_];
		int i_257_ = is[i_255_ + (i - 1)];
		for (int i_258_ = i; i_258_ < i_248_; i_258_++)
		    is_253_[i_258_ + i_254_ * i_248_] = i_257_;
	    } else {
		int i_259_ = i_248_ * (i_247_ - 1);
		for (int i_260_ = 0; i_260_ < i_248_; i_260_++)
		    is_253_[i_260_ + i_248_ * i_254_]
			= is_253_[i_259_ + i_260_];
	    }
	}
	return is_253_;
    }
    
    abstract void method3267(int i, int i_261_) throws Exception_Sub4;
    
    public abstract boolean method3268();
    
    public abstract void method3269(boolean bool);
    
    public abstract Class170 method3270();
    
    public abstract void method3271(Class174 class174);
    
    public abstract int[] method3272();
    
    abstract void method3273(int i, int i_262_) throws Exception_Sub4;
    
    public abstract boolean method3274();
    
    abstract void method3275(int i, int i_263_) throws Exception_Sub4;
    
    public abstract void method3276();
    
    public abstract void method3277(int i, int i_264_, int i_265_, int i_266_);
    
    public abstract boolean method3278();
    
    public abstract void method3279();
    
    abstract void method3280();
    
    abstract Class168_Sub1 method3281(Canvas canvas, int i, int i_267_);
    
    public abstract void method3282(int i);
    
    public final void method3283(Canvas canvas, int i) {
	if (aHashtable1951.containsKey(canvas)) {
	    Class168_Sub1 class168_sub1
		= (Class168_Sub1) aHashtable1951.get(canvas);
	    class168_sub1.method127();
	    aHashtable1951.remove(canvas);
	}
    }
    
    public abstract boolean method3284();
    
    public abstract void method3285(int i, int i_268_);
    
    public abstract int method3286();
    
    public abstract boolean method3287();
    
    public abstract Class175 method3288(Class7 class7, Class173[] class173s,
					boolean bool);
    
    public abstract boolean method3289();
    
    public abstract boolean method3290();
    
    public abstract void method3291(int i, int i_269_);
    
    public abstract boolean method3292();
    
    public abstract boolean method3293();
    
    public void method3294(int[] is) {
	if (aClass168_Sub1_1959 != null) {
	    is[0] = aClass168_Sub1_1959.method2710();
	    is[1] = aClass168_Sub1_1959.method2711();
	} else {
	    int[] is_270_ = is;
	    is[1] = 0;
	    is_270_[0] = 0;
	}
    }
    
    public abstract boolean method3295();
    
    public final void method3296(Canvas canvas) {
	if (aHashtable1951.containsKey(canvas)) {
	    Class168_Sub1 class168_sub1
		= (Class168_Sub1) aHashtable1951.get(canvas);
	    class168_sub1.method127();
	    aHashtable1951.remove(canvas);
	}
    }
    
    public final void method3297(Canvas canvas) {
	if (aHashtable1951.containsKey(canvas)) {
	    Class168_Sub1 class168_sub1
		= (Class168_Sub1) aHashtable1951.get(canvas);
	    class168_sub1.method127();
	    aHashtable1951.remove(canvas);
	}
    }
    
    public abstract boolean method3298();
    
    public abstract boolean method3299();
    
    public abstract boolean method3300();
    
    public abstract void method3301();
    
    public void method3302(boolean bool) {
	/* empty */
    }
    
    public abstract boolean method3303();
    
    public abstract boolean method3304();
    
    public abstract String method3305();
    
    public abstract String method3306();
    
    public abstract void method3307(int i, float f, float f_271_, float f_272_,
				    float f_273_, float f_274_);
    
    public abstract boolean method3308();
    
    public abstract int[] method3309();
    
    public abstract void method3310(boolean bool);
    
    public abstract void method3311(int i, int i_275_, int i_276_, int i_277_,
				    int i_278_, int i_279_);
    
    public abstract boolean method3312();
    
    public abstract boolean method3313();
    
    public abstract Class168_Sub2 method3314();
    
    public void method3315(boolean bool) {
	/* empty */
    }
    
    public abstract int[] method3316(int i, int i_280_, int i_281_,
				     int i_282_);
    
    public final void method3317(Canvas canvas, int i) {
	Class168_Sub1 class168_sub1
	    = (Class168_Sub1) aHashtable1951.get(canvas);
	if (class168_sub1 == null)
	    throw new RuntimeException();
	if (1070795873 * anInt1960 > 0
	    || aClass168_Sub1_1959 != aClass168_1966)
	    throw new RuntimeException();
	if (null != aClass168_1966)
	    aClass168_1966.method2712();
	if (1070795873 * anInt1960 < 0)
	    aClass168_1966 = class168_sub1;
	aClass168_Sub1_1959 = class168_sub1;
	class168_sub1.method350();
    }
    
    public final void method3318(Class168_Sub2 class168_sub2) {
	if (anInt1960 * 1070795873 < 0
	    || (aClass168_Sub2Array1961[anInt1960 * 1070795873]
		!= class168_sub2))
	    throw new RuntimeException();
	aClass168_Sub2Array1961[(anInt1960 -= -1560766559) * 1070795873 + 1]
	    = null;
	class168_sub2.method2712();
	if (anInt1960 * 1070795873 >= 0) {
	    aClass168_1966 = aClass168_Sub2Array1961[anInt1960 * 1070795873];
	    aClass168_Sub2Array1961[1070795873 * anInt1960].method350();
	} else {
	    aClass168_1966 = aClass168_Sub1_1959;
	    aClass168_Sub1_1959.method350();
	}
    }
    
    public abstract Class168_Sub2 method3319();
    
    public abstract boolean method3320();
    
    public abstract int method3321(int i, int i_283_);
    
    public final Class168_Sub1 method3322(int i) {
	return aClass168_Sub1_1959;
    }
    
    public abstract boolean method3323();
    
    public abstract boolean method3324();
    
    public abstract boolean method3325();
    
    public abstract void method3326(Class169 class169, float f,
				    Class169 class169_284_, float f_285_,
				    Class169 class169_286_, float f_287_);
    
    public abstract boolean method3327();
    
    public abstract void method3328(int i, Class152 class152, int i_288_,
				    int i_289_);
    
    public abstract void method3329(int i);
    
    final void method3330(Canvas canvas, Class168_Sub1 class168_sub1) {
	if (class168_sub1 == null)
	    throw new RuntimeException("");
	aHashtable1951.put(canvas, class168_sub1);
    }
    
    public abstract boolean method3331();
    
    public static void method3332(Canvas canvas) {
	try {
	    Class var_class = Class.forName("java.awt.Canvas");
	    Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
	    method.invoke(canvas, new Object[] { Boolean.TRUE });
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public abstract int method3333();
    
    public abstract void method3334(int i, int i_290_, int i_291_);
    
    public abstract void method3335(int i, int i_292_, int i_293_);
    
    public abstract void method3336(boolean bool);
    
    public abstract void method3337();
    
    public abstract long method3338(int i, int i_294_);
    
    public void method3339() {
	/* empty */
    }
    
    public abstract void method3340(long l);
    
    public abstract void method3341();
    
    public abstract void method3342();
    
    public abstract void method3343(boolean bool);
    
    public Class157 method3344(int[] is, int i, int i_295_, int i_296_,
			       int i_297_) {
	return method3214(is, i, i_295_, i_296_, i_297_, true);
    }
    
    public abstract boolean method3345();
    
    public abstract void method3346(boolean bool);
    
    public abstract void method3347(boolean bool);
    
    public abstract void method3348();
    
    public abstract void method3349();
    
    public abstract void method3350(int[] is);
    
    public abstract void method3351(float f);
    
    public abstract void method3352(float f, float f_298_);
    
    public final Class168_Sub1 method3353() {
	return aClass168_Sub1_1959;
    }
    
    public abstract void method3354();
    
    public abstract void method3355(int i, int i_299_, int i_300_, int i_301_);
    
    public final void method3356(Canvas canvas) {
	Class168_Sub1 class168_sub1
	    = (Class168_Sub1) aHashtable1951.get(canvas);
	if (class168_sub1 == null)
	    throw new RuntimeException();
	if (1070795873 * anInt1960 > 0
	    || aClass168_Sub1_1959 != aClass168_1966)
	    throw new RuntimeException();
	if (null != aClass168_1966)
	    aClass168_1966.method2712();
	if (1070795873 * anInt1960 < 0)
	    aClass168_1966 = class168_sub1;
	aClass168_Sub1_1959 = class168_sub1;
	class168_sub1.method350();
    }
    
    public final void method3357(int i) throws Exception_Sub4 {
	method3267(0, 0);
    }
    
    public abstract void method3358(int[] is);
    
    public abstract void method3359(int[] is);
    
    public abstract void method3360(float f, float f_302_, float f_303_,
				    float[] fs);
    
    public abstract void method3361(int i, int i_304_, int i_305_, int i_306_,
				    int i_307_, int i_308_);
    
    public abstract void method3362(int i, int i_309_, int i_310_, int i_311_,
				    int i_312_, int i_313_);
    
    public abstract void method3363(float f, float f_314_);
    
    public abstract void method3364(int i, int i_315_, int i_316_, int i_317_,
				    int i_318_, int i_319_);
    
    abstract void method3365(int i, int i_320_, int i_321_, int i_322_,
			     int i_323_);
    
    abstract void method3366(int i, int i_324_, int i_325_, int i_326_,
			     int i_327_);
    
    abstract void method3367(int i, int i_328_, int i_329_, int i_330_,
			     int i_331_);
    
    public final void method3368(int i, int i_332_, int i_333_, int i_334_) {
	method3199(i, i_332_, i_333_, i_334_, 1);
    }
    
    abstract void method3369(int i, int i_335_, int i_336_, int i_337_,
			     int i_338_);
    
    public abstract void method3370(int i);
    
    public abstract void method3371(Class444 class444, Class211 class211,
				    Class443 class443);
    
    public abstract void method3372(int i, int i_339_, int i_340_, int i_341_,
				    int i_342_, int i_343_);
    
    public abstract void method3373(int i, int i_344_, int i_345_, int i_346_,
				    int i_347_, int i_348_, int i_349_,
				    int i_350_, int i_351_);
    
    public abstract void method3374(int i, int i_352_, int i_353_, int i_354_,
				    int i_355_, int i_356_, Class152 class152,
				    int i_357_, int i_358_);
    
    public abstract Class161 method3375(int i, int i_359_, int[][] is,
					int[][] is_360_, int i_361_,
					int i_362_, int i_363_);
    
    public abstract boolean method3376();
    
    public abstract void method3377(int i, int i_364_, int i_365_, int i_366_,
				    int i_367_, int i_368_, Class152 class152,
				    int i_369_, int i_370_, int i_371_,
				    int i_372_, int i_373_);
    
    public abstract boolean method3378();
    
    public abstract void method3379(int i, Class176 class176);
    
    public abstract void method3380(int i, int i_374_, int i_375_, int i_376_,
				    int i_377_, int i_378_, int i_379_);
    
    public abstract int method3381(int i, int i_380_, int i_381_, int i_382_,
				   int i_383_, int i_384_);
    
    public abstract boolean method3382();
    
    public abstract int method3383(int i, int i_385_, int i_386_, int i_387_,
				   int i_388_, int i_389_);
    
    public abstract void method3384(Class525_Sub26 class525_sub26);
    
    abstract boolean method3385(int i, int i_390_, int i_391_, int i_392_,
				Class444 class444, Class443 class443);
    
    abstract Class168_Sub1 method3386(Canvas canvas, int i, int i_393_);
    
    public abstract void method3387(int i, Class152 class152, int i_394_,
				    int i_395_);
    
    public abstract Class525_Sub26 method3388(int i);
    
    public abstract boolean method3389();
    
    public abstract Class157 method3390(int i, int i_396_, boolean bool,
					boolean bool_397_);
    
    public abstract Class157 method3391(Class173 class173, boolean bool);
    
    public abstract Class444 method3392();
    
    public abstract Class157 method3393(int i, int i_398_, int i_399_,
					int i_400_, boolean bool);
    
    public abstract Class157 method3394(int i, int i_401_, int i_402_,
					int i_403_, boolean bool);
    
    public abstract Class157 method3395(int i, int i_404_, int i_405_,
					int i_406_, boolean bool);
    
    public abstract Class152 method3396(int i, int i_407_, int[] is,
					int[] is_408_);
    
    public abstract Class152 method3397(int i, int i_409_, int[] is,
					int[] is_410_);
    
    public float[] method3398(int i, int i_411_, int i_412_, int i_413_,
			      float[] fs, int i_414_, int i_415_, int i_416_,
			      int i_417_) {
	float[] fs_418_ = new float[i_416_ * (i_413_ * i_412_)];
	if (0 == i_415_)
	    i_415_ = i_416_ * i;
	for (int i_419_ = 0; i_419_ < i_413_; i_419_++) {
	    if (i_419_ < i_411_) {
		int i_420_ = i_414_ + i_419_ * i_415_;
		for (int i_421_ = 0; i_421_ < i; i_421_++) {
		    for (int i_422_ = 0; i_422_ < i_416_; i_422_++)
			fs_418_[(i_416_ * i_421_ + i_416_ * (i_419_ * i_412_)
				 + i_422_)]
			    = fs[i_422_ + (i_420_ + i_421_ * i_416_)];
		}
		float[] fs_423_ = new float[i_416_];
		for (int i_424_ = 0; i_424_ < i_416_; i_424_++)
		    fs_423_[i_424_] = fs[i_424_ + ((i - 1) * i_416_ + i_420_)];
		for (int i_425_ = i; i_425_ < i_412_; i_425_++) {
		    for (int i_426_ = 0; i_426_ < i_416_; i_426_++)
			fs_418_[i_426_ + (i_416_ * i_425_
					  + i_416_ * (i_419_ * i_412_))]
			    = fs_423_[i_426_];
		}
	    } else {
		int i_427_ = i_416_ * ((i_411_ - 1) * i_412_);
		for (int i_428_ = 0; i_428_ < i_412_; i_428_++) {
		    for (int i_429_ = 0; i_429_ < i_416_; i_429_++)
			fs_418_[i_429_ + (i_416_ * (i_412_ * i_419_)
					  + i_428_ * i_416_)]
			    = fs_418_[i_429_ + (i_428_ * i_416_ + i_427_)];
		}
	    }
	}
	return fs_418_;
    }
    
    void method3399() {
	method3134(-1717481646);
    }
    
    public abstract void method3400(int i, Class152 class152, int i_430_,
				    int i_431_);
    
    public abstract void method3401();
    
    public abstract Class157 method3402(int[] is, int i, int i_432_,
					int i_433_, int i_434_, boolean bool);
    
    abstract Class168_Sub1 method3403(Canvas canvas, int i, int i_435_);
    
    public abstract Interface22 method3404(int i, int i_436_, int i_437_);
    
    public final void method3405(int i, int i_438_, int i_439_, int i_440_) {
	method3200(i, i_438_, i_439_, i_440_, 1);
    }
    
    public abstract int method3406(int i, int i_441_);
    
    public abstract int method3407(int i, int i_442_);
    
    public abstract int method3408(int i, int i_443_);
    
    public abstract boolean method3409();
    
    void method3410(int i, int i_444_) {
	anInt1962 = i * -1629751061;
	anInt1963 = i_444_ * -770771981;
	float f = ((float) aClass168_1966.method2710()
		   / (float) aClass168_1966.method2711());
	float f_445_ = ((float) (anInt1962 * -1079316541)
			/ (float) (anInt1963 * -1736975045));
	if (f < f_445_) {
	    anInt1935
		= -1462491371 * (int) (f * (float) (-1736975045 * anInt1963));
	    anInt1967 = anInt1963 * 364806403;
	} else {
	    anInt1935 = anInt1962 * 1225285631;
	    anInt1967
		= (int) ((float) (anInt1962 * -1079316541) / f) * -59486503;
	}
	aFloat1968 = ((float) (anInt1935 * -1588334531)
		      / (float) aClass168_1966.method2710());
	anInt1958 = ((-1079316541 * anInt1962 - -1588334531 * anInt1935) / 2
		     * 1327965037);
	anInt1964 = ((-1736975045 * anInt1963 - -863940247 * anInt1967) / 2
		     * 2142894957);
    }
    
    public abstract void method3411();
    
    public abstract void method3412(Class185 class185);
    
    public abstract Class444 method3413();
    
    public boolean method3414(int i, int i_446_, Class444 class444,
			      Class443 class443, byte i_447_) {
	return method3208(i, i_446_, 0, 0, class444, class443);
    }
    
    public abstract int method3415();
    
    public abstract int method3416();
    
    public Class525_Sub21 method3417(int i, int i_448_, int i_449_, int i_450_,
				     int i_451_, float f) {
	return new Class525_Sub21(i, i_448_, i_449_, i_450_, i_451_, f);
    }
    
    public Class525_Sub21 method3418(int i, int i_452_, int i_453_, int i_454_,
				     int i_455_, float f) {
	return new Class525_Sub21(i, i_452_, i_453_, i_454_, i_455_, f);
    }
    
    public abstract void method3419(int i, Class525_Sub21[] class525_sub21s);
    
    public abstract void method3420(Class185 class185);
    
    public abstract void method3421(Class185 class185);
    
    public abstract void method3422(int i, int i_456_, int i_457_, int i_458_,
				    int i_459_, int i_460_, Class152 class152,
				    int i_461_, int i_462_);
    
    public abstract boolean method3423();
    
    public abstract void method3424(Class435 class435);
    
    public abstract Class444 method3425();
    
    public abstract void method3426(Class435 class435);
    
    public abstract Class170 method3427();
    
    public abstract void method3428(Class435 class435);
    
    public abstract Class435 method3429();
    
    public abstract void method3430();
    
    public abstract void method3431(int i, int i_463_, int i_464_, int i_465_);
    
    public abstract void method3432(float f);
    
    public abstract void method3433(int i, float f, float f_466_, float f_467_,
				    float f_468_, float f_469_);
    
    public abstract void method3434(int i, Class152 class152, int i_470_,
				    int i_471_);
    
    public final void method3435(int i, int i_472_, int i_473_, int i_474_,
				 int i_475_) {
	method3151(i, i_472_, i_473_, i_474_, i_475_, 1);
    }
    
    public abstract Class170 method3436();
    
    public abstract Class174 method3437(int i);
    
    public abstract Class174 method3438(Class174 class174,
					Class174 class174_476_, float f,
					Class174 class174_477_);
    
    public abstract Class174 method3439(Class174 class174,
					Class174 class174_478_, float f,
					Class174 class174_479_);
    
    public abstract void method3440(Class174 class174);
    
    public abstract void method3441(Class174 class174);
    
    public abstract void method3442(int i);
    
    public abstract boolean method3443();
    
    public abstract boolean method3444();
    
    public abstract boolean method3445();
    
    public abstract boolean method3446();
    
    public abstract boolean method3447();
    
    public abstract void method3448(float f, float f_480_, float f_481_,
				    float f_482_, float f_483_);
    
    public abstract void method3449(float f, float f_484_, float f_485_,
				    float f_486_, float f_487_);
    
    public abstract Class169 method3450(int[] is);
    
    public abstract boolean method3451();
    
    public abstract boolean method3452();
    
    public abstract void method3453(Class169 class169, float f,
				    Class169 class169_488_, float f_489_,
				    Class169 class169_490_, float f_491_);
    
    public abstract Class175 method3454(Class7 class7, Class173[] class173s,
					boolean bool);
    
    public abstract boolean method3455();
    
    public abstract boolean method3456();
    
    public abstract boolean method3457();
    
    public abstract void method3458(Class444 class444, Class211 class211,
				    Class443 class443);
    
    public abstract void method3459();
    
    public abstract void method3460();
    
    public abstract void method3461();
    
    public abstract boolean method3462();
    
    public abstract Class435 method3463();
    
    public abstract boolean method3464();
    
    public abstract void method3465(int i, float f, float f_492_, float f_493_,
				    float f_494_, float f_495_);
    
    abstract void method3466(float f, float f_496_, float f_497_, float f_498_,
			     float f_499_, float f_500_);
    
    abstract void method3467(float f, float f_501_, float f_502_, float f_503_,
			     float f_504_, float f_505_);
    
    abstract void method3468(float f, float f_506_, float f_507_, float f_508_,
			     float f_509_, float f_510_);
    
    public abstract void method3469(int i);
    
    public abstract void method3470(int i, Class176 class176);
    
    final void method3471(Canvas canvas, Class168_Sub1 class168_sub1) {
	if (class168_sub1 == null)
	    throw new RuntimeException("");
	aHashtable1951.put(canvas, class168_sub1);
    }
    
    public abstract void method3472(int i, int i_511_, int i_512_, int i_513_,
				    int i_514_, int i_515_);
    
    public abstract void method3473();
    
    public abstract int method3474(int i, int i_516_, int i_517_, int i_518_,
				   int i_519_, int i_520_);
    
    public abstract void method3475(Class169 class169, float f,
				    Class169 class169_521_, float f_522_,
				    Class169 class169_523_, float f_524_);
    
    public abstract void method3476(int i, int i_525_, float f, int i_526_,
				    int i_527_, float f_528_, int i_529_,
				    int i_530_, float f_531_, int i_532_,
				    int i_533_, int i_534_, int i_535_);
    
    public abstract void method3477(int i, int i_536_, float f, int i_537_,
				    int i_538_, float f_539_, int i_540_,
				    int i_541_, float f_542_, int i_543_,
				    int i_544_, int i_545_, int i_546_);
    
    public abstract void method3478(int i, int i_547_, float f, int i_548_,
				    int i_549_, float f_550_, int i_551_,
				    int i_552_, float f_553_, int i_554_,
				    int i_555_, int i_556_, int i_557_);
    
    public static boolean method3479(int i) {
	return 0 == i || i == 2;
    }
    
    public abstract void method3480();
    
    public abstract void method3481(float f, float f_558_, float f_559_,
				    float[] fs);
    
    public abstract void method3482(float f, float f_560_, float f_561_,
				    float[] fs);
    
    public abstract Class168_Sub2 method3483();
    
    public abstract Class168_Sub2 method3484();
    
    public abstract Class168_Sub2 method3485();
    
    public abstract void method3486(int i);
    
    public abstract Interface21 method3487
	(int i, int i_562_, Class165 class165, Class178 class178, int i_563_);
    
    public abstract Interface22 method3488(int i, int i_564_, int i_565_);
    
    public abstract Interface22 method3489(int i, int i_566_, int i_567_);
    
    public abstract Interface22 method3490(int i, int i_568_, int i_569_);
    
    public abstract Class444 method3491();
    
    void method3492() {
	method3134(-2137763715);
    }
    
    void method3493() {
	method3134(-1951696390);
    }
    
    void method3494() {
	method3134(-2061739302);
    }
    
    public abstract void method3495(int i);
    
    public abstract void method3496(float f, float f_570_, float f_571_,
				    float[] fs);
    
    public abstract void method3497(int i, int i_572_, int i_573_, int i_574_,
				    int i_575_, int i_576_, int i_577_);
    
    public final void method3498(Canvas canvas) {
	Class168_Sub1 class168_sub1
	    = (Class168_Sub1) aHashtable1951.get(canvas);
	if (class168_sub1 == null)
	    throw new RuntimeException();
	if (1070795873 * anInt1960 > 0
	    || aClass168_Sub1_1959 != aClass168_1966)
	    throw new RuntimeException();
	if (null != aClass168_1966)
	    aClass168_1966.method2712();
	if (1070795873 * anInt1960 < 0)
	    aClass168_1966 = class168_sub1;
	aClass168_Sub1_1959 = class168_sub1;
	class168_sub1.method350();
    }
    
    abstract void method3499(int i, int i_578_, int i_579_, int i_580_,
			     int i_581_);
    
    public abstract Class157 method3500(int[] is, int i, int i_582_,
					int i_583_, int i_584_, boolean bool);
    
    public abstract Class157 method3501(int[] is, int i, int i_585_,
					int i_586_, int i_587_, boolean bool);
    
    public abstract void method3502(int i);
    
    public abstract void method3503(Class444 class444);
    
    public abstract Class157 method3504(int[] is, int i, int i_588_,
					int i_589_, int i_590_, boolean bool);
    
    public abstract Class179 method3505(ModelDecoder class186, int i, int i_591_,
                                        int i_592_, int i_593_);
    
    public abstract void method3506(int i, Class176 class176);
    
    public abstract void method3507(int i, int i_594_, int i_595_);
    
    public abstract void method3508(int i, int i_596_, int i_597_, int i_598_,
				    int i_599_, int i_600_, int i_601_,
				    int i_602_, int i_603_);
    
    public abstract void method3509(int i, int i_604_, int i_605_, int i_606_);
    
    public abstract void method3510(int i, Class176 class176);
    
    public abstract Interface22 method3511(int i, int i_607_);
    
    public abstract Interface22 method3512(int i, int i_608_);
    
    public static Class182 method3513
	(int i, Canvas canvas, Class180 class180, Interface24 interface24,
     Interface47 interface47, Interface48 interface48,
     Interface49 interface49, JS5 class458, int i_609_) {
	int i_610_ = 0;
	int i_611_ = 0;
	if (null != canvas) {
	    Dimension dimension = canvas.getSize();
	    i_610_ = dimension.width;
	    i_611_ = dimension.height;
	}
	return method3228(i, canvas, class180, interface24, interface47,
			  interface48, interface49, class458, i_609_, i_610_,
			  i_611_, -858750148);
    }
    
    static synchronized Class182 method3514
	(int i, Canvas canvas, Class180 class180, Interface24 interface24,
     Interface47 interface47, Interface48 interface48,
     Interface49 interface49, JS5 class458, int i_612_, int i_613_,
     int i_614_) {
	if (0 == i)
	    return Class604.method9986(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       i_613_, i_614_, (byte) 78);
	if (1 == i)
	    return Class151.method2440(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       i_612_);
	if (5 == i)
	    return Class502.method8201(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       class458, i_612_);
	if (i == 3)
	    return Class408.method6639(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       class458, i_612_);
	throw new IllegalArgumentException("");
    }
    
    static synchronized Class182 method3515
	(int i, Canvas canvas, Class180 class180, Interface24 interface24,
     Interface47 interface47, Interface48 interface48,
     Interface49 interface49, JS5 class458, int i_615_, int i_616_,
     int i_617_) {
	if (0 == i)
	    return Class604.method9986(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       i_616_, i_617_, (byte) -77);
	if (1 == i)
	    return Class151.method2440(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       i_615_);
	if (5 == i)
	    return Class502.method8201(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       class458, i_615_);
	if (i == 3)
	    return Class408.method6639(canvas, class180, interface24,
				       interface47, interface48, interface49,
				       class458, i_615_);
	throw new IllegalArgumentException("");
    }
    
    public static boolean method3516(int i) {
	return 0 == i || i == 2;
    }
    
    public static boolean method3517(int i) {
	return 0 == i || i == 2;
    }
    
    public abstract void method3518();
    
    public final void method3519() throws Exception_Sub4 {
	method3267(0, 0);
    }
    
    public final void method3520() throws Exception_Sub4 {
	method3267(0, 0);
    }
    
    public final void method3521() throws Exception_Sub4 {
	method3267(0, 0);
    }
    
    public static void method3522(Canvas canvas) {
	try {
	    Class var_class = Class.forName("java.awt.Canvas");
	    Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
	    method.invoke(canvas, new Object[] { Boolean.TRUE });
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static void method3523(Canvas canvas) {
	try {
	    Class var_class = Class.forName("java.awt.Canvas");
	    Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
	    method.invoke(canvas, new Object[] { Boolean.TRUE });
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public abstract boolean method3524();
    
    public static void method3525(Canvas canvas) {
	try {
	    Class var_class = Class.forName("java.awt.Canvas");
	    Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
	    method.invoke(canvas, new Object[] { Boolean.TRUE });
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public final Class168_Sub1 method3526() {
	return aClass168_Sub1_1959;
    }
    
    public final Class168_Sub1 method3527() {
	return aClass168_Sub1_1959;
    }
    
    public final void method3528(Canvas canvas, int i, int i_618_) {
	if (!aHashtable1951.containsKey(canvas)) {
	    Class66.method1435(canvas, -252048064);
	    method3154(canvas, method3536(canvas, i, i_618_), -2095540854);
	}
    }
    
    public abstract Class444 method3529();
    
    public abstract void method3530();
    
    public final void method3531(Canvas canvas, int i, int i_619_) {
	if (!aHashtable1951.containsKey(canvas)) {
	    Class66.method1435(canvas, 338652395);
	    method3154(canvas, method3536(canvas, i, i_619_), -1779112311);
	}
    }
    
    public final void method3532(Canvas canvas, int i, int i_620_) {
	if (!aHashtable1951.containsKey(canvas)) {
	    Class66.method1435(canvas, 980541234);
	    method3154(canvas, method3536(canvas, i, i_620_), -1091244235);
	}
    }
    
    public final void method3533(int i, int i_621_, int i_622_, int i_623_,
				 int i_624_) {
	method3201(i, i_621_, i_622_, i_623_, i_624_, 1);
    }
    
    abstract Class168_Sub1 method3534(Canvas canvas, int i, int i_625_);
    
    public int[] method3535(int i, int i_626_, int i_627_, int i_628_,
			    int[] is, int i_629_, int i_630_) {
	int[] is_631_ = new int[i_627_ * i_628_];
	if (0 == i_630_)
	    i_630_ = i;
	for (int i_632_ = 0; i_632_ < i_628_; i_632_++) {
	    if (i_632_ < i_626_) {
		int i_633_ = i_629_ + i_632_ * i_630_;
		for (int i_634_ = 0; i_634_ < i; i_634_++)
		    is_631_[i_632_ * i_627_ + i_634_] = is[i_633_ + i_634_];
		int i_635_ = is[i_633_ + (i - 1)];
		for (int i_636_ = i; i_636_ < i_627_; i_636_++)
		    is_631_[i_636_ + i_632_ * i_627_] = i_635_;
	    } else {
		int i_637_ = i_627_ * (i_626_ - 1);
		for (int i_638_ = 0; i_638_ < i_627_; i_638_++)
		    is_631_[i_638_ + i_627_ * i_632_]
			= is_631_[i_637_ + i_638_];
	    }
	}
	return is_631_;
    }
    
    abstract Class168_Sub1 method3536(Canvas canvas, int i, int i_639_);
    
    public abstract void method3537(int i, int i_640_);
    
    public abstract void method3538(int i, int i_641_, int i_642_, int i_643_);
    
    abstract void method3539(int i, int i_644_, int i_645_, int i_646_,
			     int i_647_);
    
    public final void method3540(Canvas canvas) {
	Class168_Sub1 class168_sub1
	    = (Class168_Sub1) aHashtable1951.get(canvas);
	if (class168_sub1 == null)
	    throw new RuntimeException();
	if (1070795873 * anInt1960 > 0
	    || aClass168_Sub1_1959 != aClass168_1966)
	    throw new RuntimeException();
	if (null != aClass168_1966)
	    aClass168_1966.method2712();
	if (1070795873 * anInt1960 < 0)
	    aClass168_1966 = class168_sub1;
	aClass168_Sub1_1959 = class168_sub1;
	class168_sub1.method350();
    }
    
    public abstract int[] method3541();
    
    public final void method3542(Canvas canvas, int i, int i_648_) {
	Class168_Sub1 class168_sub1
	    = (Class168_Sub1) aHashtable1951.get(canvas);
	if (null == class168_sub1)
	    throw new RuntimeException("");
	class168_sub1.method14605(i, i_648_);
    }
    
    public final void method3543(Canvas canvas, int i, int i_649_) {
	Class168_Sub1 class168_sub1
	    = (Class168_Sub1) aHashtable1951.get(canvas);
	if (null == class168_sub1)
	    throw new RuntimeException("");
	class168_sub1.method14605(i, i_649_);
    }
    
    public final void method3544(Canvas canvas, int i, int i_650_) {
	Class168_Sub1 class168_sub1
	    = (Class168_Sub1) aHashtable1951.get(canvas);
	if (null == class168_sub1)
	    throw new RuntimeException("");
	class168_sub1.method14605(i, i_650_);
    }
    
    public final void method3545(Canvas canvas, int i, int i_651_) {
	Class168_Sub1 class168_sub1
	    = (Class168_Sub1) aHashtable1951.get(canvas);
	if (null == class168_sub1)
	    throw new RuntimeException("");
	class168_sub1.method14605(i, i_651_);
    }
    
    public final void method3546(Class168_Sub2 class168_sub2) {
	if (anInt1960 * 1070795873 >= 3)
	    throw new RuntimeException();
	if (1070795873 * anInt1960 >= 0)
	    aClass168_Sub2Array1961[anInt1960 * 1070795873].method2712();
	else
	    aClass168_Sub1_1959.method2712();
	aClass168_1966
	    = aClass168_Sub2Array1961[(anInt1960 += -1560766559) * 1070795873]
	    = class168_sub2;
	class168_sub2.method350();
    }
    
    public void method3547() {
	/* empty */
    }
    
    public final void method3548(Class168_Sub2 class168_sub2) {
	if (anInt1960 * 1070795873 < 0
	    || (aClass168_Sub2Array1961[anInt1960 * 1070795873]
		!= class168_sub2))
	    throw new RuntimeException();
	aClass168_Sub2Array1961[(anInt1960 -= -1560766559) * 1070795873 + 1]
	    = null;
	class168_sub2.method2712();
	if (anInt1960 * 1070795873 >= 0) {
	    aClass168_1966 = aClass168_Sub2Array1961[anInt1960 * 1070795873];
	    aClass168_Sub2Array1961[1070795873 * anInt1960].method350();
	} else {
	    aClass168_1966 = aClass168_Sub1_1959;
	    aClass168_Sub1_1959.method350();
	}
    }
    
    public abstract Class444 method3549();
    
    public abstract int[] method3550();
    
    public abstract void method3551(int i, int i_652_, int i_653_, int i_654_);
    
    public abstract void method3552(long l);
    
    public abstract Class157 method3553(Class173 class173, boolean bool);
    
    public void method3554(boolean bool) {
	/* empty */
    }
    
    public void method3555(boolean bool) {
	/* empty */
    }
    
    public abstract Class179 method3556(ModelDecoder class186, int i, int i_655_,
                                        int i_656_, int i_657_);
    
    public abstract void method3557(int i, int i_658_, int i_659_, int i_660_,
				    int i_661_, int i_662_, Class152 class152,
				    int i_663_, int i_664_, int i_665_,
				    int i_666_, int i_667_);
    
    public final void method3558(int i, int i_668_, int i_669_, int i_670_,
				 int i_671_) {
	method3151(i, i_668_, i_669_, i_670_, i_671_, 1);
    }
    
    public boolean method3559(int i, int i_672_, Class444 class444,
			      Class443 class443) {
	return method3208(i, i_672_, 0, 0, class444, class443);
    }
    
    public final void method3560(int i, int i_673_, int i_674_, int i_675_) {
	method3199(i, i_673_, i_674_, i_675_, 1);
    }
    
    public final void method3561(int i, int i_676_, int i_677_, int i_678_) {
	method3200(i, i_676_, i_677_, i_678_, 1);
    }
    
    public final void method3562(int i, int i_679_, int i_680_, int i_681_) {
	method3200(i, i_679_, i_680_, i_681_, 1);
    }
    
    public final void method3563(int i, int i_682_, int i_683_, int i_684_) {
	method3200(i, i_682_, i_683_, i_684_, 1);
    }
    
    public abstract void method3564(int i, int i_685_, int i_686_, int i_687_,
				    int i_688_, int i_689_, Class152 class152,
				    int i_690_, int i_691_);
    
    public abstract boolean method3565();
    
    public final Class168 method3566(int i) {
	return aClass168_1966;
    }
    
    public final void method3567(int i, int i_692_, int i_693_, int i_694_,
				 int i_695_) {
	method3201(i, i_692_, i_693_, i_694_, i_695_, 1);
    }
    
    public abstract boolean method3568();
    
    public abstract void method3569(boolean bool);
    
    public Class157 method3570(int i, int i_696_, boolean bool) {
	return method3213(i, i_696_, bool, false);
    }
    
    public Class157 method3571(int[] is, int i, int i_697_, int i_698_,
			       int i_699_) {
	return method3214(is, i, i_697_, i_698_, i_699_, true);
    }
    
    public Class157 method3572(int[] is, int i, int i_700_, int i_701_,
			       int i_702_) {
	return method3214(is, i, i_700_, i_701_, i_702_, true);
    }
    
    public Class157 method3573(int[] is, int i, int i_703_, int i_704_,
			       int i_705_) {
	return method3214(is, i, i_703_, i_704_, i_705_, true);
    }
    
    public abstract void method3574(float f, float f_706_);
    
    public void method3575() {
	/* empty */
    }
    
    public void method3576() {
	/* empty */
    }
    
    public abstract void method3577(int i, int i_707_, int[] is,
				    int[] is_708_);
    
    public void method3578() {
	/* empty */
    }
    
    public void method3579() {
	/* empty */
    }
    
    public abstract void method3580();
    
    public abstract Class161 method3581(int i, int i_709_, int[][] is,
					int[][] is_710_, int i_711_,
					int i_712_, int i_713_);
    
    public abstract boolean method3582();
    
    public boolean method3583() {
	return true;
    }
    
    public boolean method3584() {
	return true;
    }
    
    public abstract Class161 method3585(int i, int i_714_, int[][] is,
					int[][] is_715_, int i_716_,
					int i_717_, int i_718_);
    
    public abstract void method3586();
    
    public float[] method3587(int i, int i_719_, int i_720_, int i_721_,
			      float[] fs, int i_722_, int i_723_, int i_724_) {
	float[] fs_725_ = new float[i_724_ * (i_721_ * i_720_)];
	if (0 == i_723_)
	    i_723_ = i_724_ * i;
	for (int i_726_ = 0; i_726_ < i_721_; i_726_++) {
	    if (i_726_ < i_719_) {
		int i_727_ = i_722_ + i_726_ * i_723_;
		for (int i_728_ = 0; i_728_ < i; i_728_++) {
		    for (int i_729_ = 0; i_729_ < i_724_; i_729_++)
			fs_725_[(i_724_ * i_728_ + i_724_ * (i_726_ * i_720_)
				 + i_729_)]
			    = fs[i_729_ + (i_727_ + i_728_ * i_724_)];
		}
		float[] fs_730_ = new float[i_724_];
		for (int i_731_ = 0; i_731_ < i_724_; i_731_++)
		    fs_730_[i_731_] = fs[i_731_ + ((i - 1) * i_724_ + i_727_)];
		for (int i_732_ = i; i_732_ < i_720_; i_732_++) {
		    for (int i_733_ = 0; i_733_ < i_724_; i_733_++)
			fs_725_[i_733_ + (i_724_ * i_732_
					  + i_724_ * (i_726_ * i_720_))]
			    = fs_730_[i_733_];
		}
	    } else {
		int i_734_ = i_724_ * ((i_719_ - 1) * i_720_);
		for (int i_735_ = 0; i_735_ < i_720_; i_735_++) {
		    for (int i_736_ = 0; i_736_ < i_724_; i_736_++)
			fs_725_[i_736_ + (i_724_ * (i_720_ * i_726_)
					  + i_735_ * i_724_)]
			    = fs_725_[i_736_ + (i_735_ * i_724_ + i_734_)];
		}
	    }
	}
	return fs_725_;
    }
    
    public float[] method3588(int i, int i_737_, int i_738_, int i_739_,
			      float[] fs, int i_740_, int i_741_, int i_742_) {
	float[] fs_743_ = new float[i_742_ * (i_739_ * i_738_)];
	if (0 == i_741_)
	    i_741_ = i_742_ * i;
	for (int i_744_ = 0; i_744_ < i_739_; i_744_++) {
	    if (i_744_ < i_737_) {
		int i_745_ = i_740_ + i_744_ * i_741_;
		for (int i_746_ = 0; i_746_ < i; i_746_++) {
		    for (int i_747_ = 0; i_747_ < i_742_; i_747_++)
			fs_743_[(i_742_ * i_746_ + i_742_ * (i_744_ * i_738_)
				 + i_747_)]
			    = fs[i_747_ + (i_745_ + i_746_ * i_742_)];
		}
		float[] fs_748_ = new float[i_742_];
		for (int i_749_ = 0; i_749_ < i_742_; i_749_++)
		    fs_748_[i_749_] = fs[i_749_ + ((i - 1) * i_742_ + i_745_)];
		for (int i_750_ = i; i_750_ < i_738_; i_750_++) {
		    for (int i_751_ = 0; i_751_ < i_742_; i_751_++)
			fs_743_[i_751_ + (i_742_ * i_750_
					  + i_742_ * (i_744_ * i_738_))]
			    = fs_748_[i_751_];
		}
	    } else {
		int i_752_ = i_742_ * ((i_737_ - 1) * i_738_);
		for (int i_753_ = 0; i_753_ < i_738_; i_753_++) {
		    for (int i_754_ = 0; i_754_ < i_742_; i_754_++)
			fs_743_[i_754_ + (i_742_ * (i_738_ * i_744_)
					  + i_753_ * i_742_)]
			    = fs_743_[i_754_ + (i_753_ * i_742_ + i_752_)];
		}
	    }
	}
	return fs_743_;
    }
    
    public float[] method3589(int i, int i_755_, int i_756_, int i_757_,
			      float[] fs, int i_758_, int i_759_, int i_760_) {
	float[] fs_761_ = new float[i_760_ * (i_757_ * i_756_)];
	if (0 == i_759_)
	    i_759_ = i_760_ * i;
	for (int i_762_ = 0; i_762_ < i_757_; i_762_++) {
	    if (i_762_ < i_755_) {
		int i_763_ = i_758_ + i_762_ * i_759_;
		for (int i_764_ = 0; i_764_ < i; i_764_++) {
		    for (int i_765_ = 0; i_765_ < i_760_; i_765_++)
			fs_761_[(i_760_ * i_764_ + i_760_ * (i_762_ * i_756_)
				 + i_765_)]
			    = fs[i_765_ + (i_763_ + i_764_ * i_760_)];
		}
		float[] fs_766_ = new float[i_760_];
		for (int i_767_ = 0; i_767_ < i_760_; i_767_++)
		    fs_766_[i_767_] = fs[i_767_ + ((i - 1) * i_760_ + i_763_)];
		for (int i_768_ = i; i_768_ < i_756_; i_768_++) {
		    for (int i_769_ = 0; i_769_ < i_760_; i_769_++)
			fs_761_[i_769_ + (i_760_ * i_768_
					  + i_760_ * (i_762_ * i_756_))]
			    = fs_766_[i_769_];
		}
	    } else {
		int i_770_ = i_760_ * ((i_755_ - 1) * i_756_);
		for (int i_771_ = 0; i_771_ < i_756_; i_771_++) {
		    for (int i_772_ = 0; i_772_ < i_760_; i_772_++)
			fs_761_[i_772_ + (i_760_ * (i_756_ * i_762_)
					  + i_771_ * i_760_)]
			    = fs_761_[i_772_ + (i_771_ * i_760_ + i_770_)];
		}
	    }
	}
	return fs_761_;
    }
    
    public byte[] method3590(int i, int i_773_, int i_774_, int i_775_,
			     byte[] is, int i_776_, int i_777_, int i_778_) {
	byte[] is_779_ = new byte[i_775_ * i_774_ * i_778_];
	if (0 == i_777_)
	    i_777_ = i_778_ * i;
	for (int i_780_ = 0; i_780_ < i_775_; i_780_++) {
	    if (i_780_ < i_773_) {
		int i_781_ = i_780_ * i_777_ + i_776_;
		for (int i_782_ = 0; i_782_ < i; i_782_++) {
		    for (int i_783_ = 0; i_783_ < i_778_; i_783_++)
			is_779_[i_783_ + (i_778_ * i_782_
					  + i_780_ * i_774_ * i_778_)]
			    = is[i_782_ * i_778_ + i_781_ + i_783_];
		}
		byte[] is_784_ = new byte[i_778_];
		for (int i_785_ = 0; i_785_ < i_778_; i_785_++)
		    is_784_[i_785_] = is[(i - 1) * i_778_ + i_781_ + i_785_];
		for (int i_786_ = i; i_786_ < i_774_; i_786_++) {
		    for (int i_787_ = 0; i_787_ < i_778_; i_787_++)
			is_779_[i_787_ + (i_786_ * i_778_
					  + i_780_ * i_774_ * i_778_)]
			    = is_784_[i_787_];
		}
	    } else {
		int i_788_ = (i_773_ - 1) * i_774_ * i_778_;
		for (int i_789_ = 0; i_789_ < i_774_; i_789_++) {
		    for (int i_790_ = 0; i_790_ < i_778_; i_790_++)
			is_779_[i_790_ + (i_780_ * i_774_ * i_778_
					  + i_778_ * i_789_)]
			    = is_779_[i_790_ + (i_789_ * i_778_ + i_788_)];
		}
	    }
	}
	return is_779_;
    }
    
    public void method3591() {
	/* empty */
    }
    
    public void method3592() {
	/* empty */
    }
    
    static void method3593(Class259 class259, Class152 class152, int i,
			   int i_791_, int i_792_, int i_793_,
			   Class157 class157, int i_794_) {
	Class322.method5728(class259, class152, i, i_791_, i_792_, i_793_,
			    class157, 100.0, Class275.aClass275_2863,
			    Class272.aClass272_2846, -975844740);
    }
    
    public static Class42 method3594(String string, String string_795_,
				     boolean bool, int i) {
	File file = new File(Class662.aFile8475,
			     new StringBuilder().append("preferences").append
				 (string).append
				 (".dat").toString());
	do {
	    if (file.exists()) {
		Class42 class42;
		try {
		    Class42 class42_796_ = new Class42(file, "rw", 10000L);
		    class42 = class42_796_;
		} catch (IOException ioexception) {
		    break;
		}
		return class42;
	    }
	} while (false);
	String string_797_ = "";
	if (33 == -1151787333 * Class411.anInt4254)
	    string_797_ = "_rc";
	else if (34 == Class411.anInt4254 * -1151787333)
	    string_797_ = "_wip";
	File file_798_ = new File(Class199.aString2194,
				  new StringBuilder().append("jagex_").append
				      (string_795_).append
				      ("_preferences").append
				      (string).append
				      (string_797_).append
				      (".dat").toString());
	do {
	    if (!bool && file_798_.exists()) {
		Class42 class42;
		try {
		    Class42 class42_799_
			= new Class42(file_798_, "rw", 10000L);
		    class42 = class42_799_;
		} catch (IOException ioexception) {
		    break;
		}
		return class42;
	    }
	} while (false);
	Class42 class42;
	try {
	    Class42 class42_800_ = new Class42(file, "rw", 10000L);
	    class42 = class42_800_;
	} catch (IOException ioexception) {
	    throw new RuntimeException();
	}
	return class42;
    }
    
    static final void method3595(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class609.method10012(class259, class245, class683, -2060004160);
    }
    
    static final void method3596(Class683 class683, int i) {
	int i_801_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (-1 != i_801_) {
	    int i_802_ = i_801_ >> 14 & 0x3fff;
	    int i_803_ = i_801_ & 0x3fff;
	    Class600 class600 = client.aClass507_11137.method8350(-1894782081);
	    i_802_ -= class600.anInt7858 * -1227002079;
	    if (i_802_ < 0)
		i_802_ = 0;
	    else if (i_802_ >= client.aClass507_11137.method8412(1309939321))
		i_802_ = client.aClass507_11137.method8412(619386960);
	    i_803_ -= class600.anInt7860 * 1429253007;
	    if (i_803_ < 0)
		i_803_ = 0;
	    else if (i_803_ >= client.aClass507_11137.method8352((byte) -86))
		i_803_ = client.aClass507_11137.method8352((byte) -2);
	    Class198_Sub3.anInt9911 = -56698409 * ((i_802_ << 9) + 256);
	    Class648.anInt8363 = 1945230309 * (256 + (i_803_ << 9));
	} else {
	    Class198_Sub3.anInt9911 = 56698409;
	    Class648.anInt8363 = -1945230309;
	}
    }
    
    static final void method3597(Class683 class683, int i) {
	int i_804_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (0 != 1819257147 * client.anInt11362
	    && i_804_ < -651611127 * client.anInt11366)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= client.aClass31Array11368[i_804_].aString302;
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
    }
}
