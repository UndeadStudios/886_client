/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class161
{
    public int anInt1759;
    public int anInt1760;
    public int anInt1761;
    public int[][] anIntArrayArray1762;
    public int anInt1763;
    
    public abstract void method2574(int i, int i_0_, int i_1_, int i_2_,
				    int i_3_, int i_4_, int i_5_,
				    boolean[][] bools);
    
    public abstract void method2575(Class525_Sub16_Sub17 class525_sub16_sub17,
				    int i, int i_6_, int i_7_, int i_8_,
				    boolean bool);
    
    public abstract void method2576(int i, int i_9_, int[] is, int[] is_10_,
				    int[] is_11_, int[] is_12_, int[] is_13_,
				    int[] is_14_, int[] is_15_, int[] is_16_,
				    Class176 class176, boolean bool);
    
    public final int method2577(int i, int i_17_, byte i_18_) {
	return anIntArrayArray1762[i][i_17_];
    }
    
    public abstract void method2578();
    
    public abstract void method2579(int i, int i_19_, int i_20_,
				    boolean[][] bools, boolean bool,
				    int i_21_);
    
    public final int method2580(int i, int i_22_) {
	return (anIntArrayArray1762
		[Math.min(363736815 * anInt1759 - 1, Math.max(0, i))]
		[Math.min(-1152334393 * anInt1760 - 1, Math.max(0, i_22_))]);
    }
    
    public abstract Class525_Sub16_Sub17 method2581
	(int i, int i_23_, Class525_Sub16_Sub17 class525_sub16_sub17);
    
    public abstract void method2582(int i, int i_24_, int[] is, int[] is_25_,
				    int[] is_26_, int[] is_27_, int[] is_28_,
				    int[] is_29_, int[] is_30_, int[] is_31_,
				    Class176 class176, boolean bool);
    
    public abstract void method2583();
    
    public abstract void method2584(Class525_Sub21 class525_sub21, int[] is);
    
    public abstract void method2585(Class525_Sub16_Sub17 class525_sub16_sub17,
				    int i, int i_32_, int i_33_, int i_34_,
				    boolean bool);
    
    public abstract void method2586(Class525_Sub16_Sub17 class525_sub16_sub17,
				    int i, int i_35_, int i_36_, int i_37_,
				    boolean bool);
    
    public abstract void method2587(int i, int i_38_, int i_39_);
    
    public final int method2588(int i, int i_40_, int i_41_) {
	int i_42_ = i >> -2063427645 * anInt1763;
	int i_43_ = i_40_ >> anInt1763 * -2063427645;
	i_42_ = Math.min(363736815 * anInt1759 - 1, Math.max(0, i_42_));
	i_43_ = Math.min(anInt1760 * -1152334393 - 1, Math.max(0, i_43_));
	int i_44_ = Math.min(anInt1759 * 363736815 - 1, 1 + i_42_);
	int i_45_ = Math.min(-1152334393 * anInt1760 - 1, i_43_ + 1);
	int i_46_ = i & anInt1761 * 435863595 - 1;
	int i_47_ = i_40_ & anInt1761 * 435863595 - 1;
	int i_48_ = ((anIntArrayArray1762[i_44_][i_43_] * i_46_
		      + ((anInt1761 * 435863595 - i_46_)
			 * anIntArrayArray1762[i_42_][i_43_]))
		     >> anInt1763 * -2063427645);
	int i_49_
	    = ((i_46_ * anIntArrayArray1762[i_44_][i_45_]
		+ anIntArrayArray1762[i_42_][i_45_] * (anInt1761 * 435863595
						       - i_46_))
	       >> anInt1763 * -2063427645);
	return (i_47_ * i_49_ + i_48_ * (anInt1761 * 435863595 - i_47_)
		>> anInt1763 * -2063427645);
    }
    
    public abstract void method2589(Class525_Sub21 class525_sub21, int[] is);
    
    Class161(int i, int i_50_, int i_51_, int[][] is) {
	anInt1759 = 1642643471 * i;
	anInt1760 = -564040713 * i_50_;
	int i_52_ = 0;
	for (/**/; i_51_ > 1; i_51_ >>= 1)
	    i_52_++;
	anInt1761 = (1 << i_52_) * -1232077181;
	anInt1763 = -2035576597 * i_52_;
	anIntArrayArray1762 = is;
    }
    
    public abstract void method2590
	(int i, int i_53_, int[] is, int[] is_54_, int[] is_55_, int[] is_56_,
	 int[] is_57_, int[] is_58_, int[] is_59_, int[] is_60_, int[] is_61_,
	 int[] is_62_, int[] is_63_, Class176 class176, boolean bool);
    
    public abstract void method2591
	(int i, int i_64_, int[] is, int[] is_65_, int[] is_66_, int[] is_67_,
	 int[] is_68_, int[] is_69_, int[] is_70_, int[] is_71_, int[] is_72_,
	 int[] is_73_, int[] is_74_, Class176 class176, boolean bool);
    
    public abstract void method2592
	(int i, int i_75_, int[] is, int[] is_76_, int[] is_77_, int[] is_78_,
	 int[] is_79_, int[] is_80_, int[] is_81_, int[] is_82_, int[] is_83_,
	 int[] is_84_, int[] is_85_, Class176 class176, boolean bool);
    
    public abstract void method2593(int i, int i_86_, int[] is, int[] is_87_,
				    int[] is_88_, int[] is_89_, int[] is_90_,
				    int[] is_91_, int[] is_92_, int[] is_93_,
				    Class176 class176, boolean bool);
    
    public abstract void method2594();
    
    public abstract void method2595(Class525_Sub16_Sub17 class525_sub16_sub17,
				    int i, int i_94_, int i_95_, int i_96_,
				    boolean bool);
    
    public final int method2596(int i, int i_97_) {
	int i_98_ = i >> -2063427645 * anInt1763;
	int i_99_ = i_97_ >> -2063427645 * anInt1763;
	if (i_98_ < 0 || i_99_ < 0 || i_98_ > anInt1759 * 363736815 - 1
	    || i_99_ > anInt1760 * -1152334393 - 1)
	    return 0;
	int i_100_ = i & 435863595 * anInt1761 - 1;
	int i_101_ = i_97_ & anInt1761 * 435863595 - 1;
	int i_102_
	    = ((anIntArrayArray1762[i_98_ + 1][i_99_] * i_100_
		+ anIntArrayArray1762[i_98_][i_99_] * (anInt1761 * 435863595
						       - i_100_))
	       >> -2063427645 * anInt1763);
	int i_103_ = ((((anInt1761 * 435863595 - i_100_)
			* anIntArrayArray1762[i_98_][1 + i_99_])
		       + anIntArrayArray1762[1 + i_98_][i_99_ + 1] * i_100_)
		      >> -2063427645 * anInt1763);
	return ((435863595 * anInt1761 - i_101_) * i_102_ + i_101_ * i_103_
		>> -2063427645 * anInt1763);
    }
    
    public abstract Class525_Sub16_Sub17 method2597
	(int i, int i_104_, Class525_Sub16_Sub17 class525_sub16_sub17);
    
    public abstract void method2598(int i, int i_105_, int i_106_,
				    boolean[][] bools, boolean bool,
				    int i_107_);
    
    public abstract void method2599(int i, int i_108_, int i_109_, int i_110_,
				    int i_111_, int i_112_, int i_113_,
				    boolean[][] bools);
    
    public abstract void method2600();
    
    public abstract Class525_Sub16_Sub17 method2601
	(int i, int i_114_, Class525_Sub16_Sub17 class525_sub16_sub17);
    
    public abstract void method2602(int i, int i_115_, int i_116_);
    
    public abstract void method2603(Class525_Sub16_Sub17 class525_sub16_sub17,
				    int i, int i_117_, int i_118_, int i_119_,
				    boolean bool);
    
    public abstract void method2604(Class525_Sub16_Sub17 class525_sub16_sub17,
				    int i, int i_120_, int i_121_, int i_122_,
				    boolean bool);
    
    public abstract boolean method2605
	(Class525_Sub16_Sub17 class525_sub16_sub17, int i, int i_123_,
	 int i_124_, int i_125_, boolean bool);
    
    public abstract boolean method2606
	(Class525_Sub16_Sub17 class525_sub16_sub17, int i, int i_126_,
	 int i_127_, int i_128_, boolean bool);
    
    public abstract void method2607(Class525_Sub16_Sub17 class525_sub16_sub17,
				    int i, int i_129_, int i_130_, int i_131_,
				    boolean bool);
    
    public abstract void method2608(Class525_Sub16_Sub17 class525_sub16_sub17,
				    int i, int i_132_, int i_133_, int i_134_,
				    boolean bool);
    
    public abstract void method2609(int i, int i_135_, int i_136_);
    
    public abstract void method2610(Class525_Sub16_Sub17 class525_sub16_sub17,
				    int i, int i_137_, int i_138_, int i_139_,
				    boolean bool);
    
    public abstract void method2611(Class525_Sub21 class525_sub21, int[] is);
    
    public abstract void method2612(int i, int i_140_, int i_141_,
				    boolean[][] bools, boolean bool,
				    int i_142_);
    
    public abstract void method2613
	(int i, int i_143_, int[] is, int[] is_144_, int[] is_145_,
	 int[] is_146_, int[] is_147_, int[] is_148_, int[] is_149_,
	 int[] is_150_, int[] is_151_, int[] is_152_, int[] is_153_,
	 Class176 class176, boolean bool);
    
    public abstract void method2614(Class525_Sub21 class525_sub21, int[] is);
    
    public abstract boolean method2615
	(Class525_Sub16_Sub17 class525_sub16_sub17, int i, int i_154_,
	 int i_155_, int i_156_, boolean bool);
    
    public abstract void method2616
	(int i, int i_157_, int[] is, int[] is_158_, int[] is_159_,
	 int[] is_160_, int[] is_161_, int[] is_162_, int[] is_163_,
	 int[] is_164_, Class176 class176, boolean bool);
    
    public final int method2617(int i, int i_165_, int i_166_) {
	return (anIntArrayArray1762
		[Math.min(363736815 * anInt1759 - 1, Math.max(0, i))]
		[Math.min(-1152334393 * anInt1760 - 1, Math.max(0, i_165_))]);
    }
    
    public abstract void method2618
	(int i, int i_167_, int[] is, int[] is_168_, int[] is_169_,
	 int[] is_170_, int[] is_171_, int[] is_172_, int[] is_173_,
	 int[] is_174_, Class176 class176, boolean bool);
    
    public final int method2619(int i, int i_175_, int i_176_) {
	int i_177_ = i >> -2063427645 * anInt1763;
	int i_178_ = i_175_ >> -2063427645 * anInt1763;
	if (i_177_ < 0 || i_178_ < 0 || i_177_ > anInt1759 * 363736815 - 1
	    || i_178_ > anInt1760 * -1152334393 - 1)
	    return 0;
	int i_179_ = i & 435863595 * anInt1761 - 1;
	int i_180_ = i_175_ & anInt1761 * 435863595 - 1;
	int i_181_
	    = ((anIntArrayArray1762[i_177_ + 1][i_178_] * i_179_
		+ anIntArrayArray1762[i_177_][i_178_] * (anInt1761 * 435863595
							 - i_179_))
	       >> -2063427645 * anInt1763);
	int i_182_ = ((((anInt1761 * 435863595 - i_179_)
			* anIntArrayArray1762[i_177_][1 + i_178_])
		       + anIntArrayArray1762[1 + i_177_][i_178_ + 1] * i_179_)
		      >> -2063427645 * anInt1763);
	return ((435863595 * anInt1761 - i_180_) * i_181_ + i_180_ * i_182_
		>> -2063427645 * anInt1763);
    }
    
    public final int method2620(int i, int i_183_) {
	int i_184_ = i >> -2063427645 * anInt1763;
	int i_185_ = i_183_ >> -2063427645 * anInt1763;
	if (i_184_ < 0 || i_185_ < 0 || i_184_ > anInt1759 * 363736815 - 1
	    || i_185_ > anInt1760 * -1152334393 - 1)
	    return 0;
	int i_186_ = i & 435863595 * anInt1761 - 1;
	int i_187_ = i_183_ & anInt1761 * 435863595 - 1;
	int i_188_
	    = ((anIntArrayArray1762[i_184_ + 1][i_185_] * i_186_
		+ anIntArrayArray1762[i_184_][i_185_] * (anInt1761 * 435863595
							 - i_186_))
	       >> -2063427645 * anInt1763);
	int i_189_ = ((((anInt1761 * 435863595 - i_186_)
			* anIntArrayArray1762[i_184_][1 + i_185_])
		       + anIntArrayArray1762[1 + i_184_][i_185_ + 1] * i_186_)
		      >> -2063427645 * anInt1763);
	return ((435863595 * anInt1761 - i_187_) * i_188_ + i_187_ * i_189_
		>> -2063427645 * anInt1763);
    }
    
    public final int method2621(int i, int i_190_) {
	int i_191_ = i >> -2063427645 * anInt1763;
	int i_192_ = i_190_ >> anInt1763 * -2063427645;
	i_191_ = Math.min(363736815 * anInt1759 - 1, Math.max(0, i_191_));
	i_192_ = Math.min(anInt1760 * -1152334393 - 1, Math.max(0, i_192_));
	int i_193_ = Math.min(anInt1759 * 363736815 - 1, 1 + i_191_);
	int i_194_ = Math.min(-1152334393 * anInt1760 - 1, i_192_ + 1);
	int i_195_ = i & anInt1761 * 435863595 - 1;
	int i_196_ = i_190_ & anInt1761 * 435863595 - 1;
	int i_197_ = ((anIntArrayArray1762[i_193_][i_192_] * i_195_
		       + ((anInt1761 * 435863595 - i_195_)
			  * anIntArrayArray1762[i_191_][i_192_]))
		      >> anInt1763 * -2063427645);
	int i_198_
	    = ((i_195_ * anIntArrayArray1762[i_193_][i_194_]
		+ anIntArrayArray1762[i_191_][i_194_] * (anInt1761 * 435863595
							 - i_195_))
	       >> anInt1763 * -2063427645);
	return (i_196_ * i_198_ + i_197_ * (anInt1761 * 435863595 - i_196_)
		>> anInt1763 * -2063427645);
    }
    
    public final int method2622(int i, int i_199_) {
	int i_200_ = i >> -2063427645 * anInt1763;
	int i_201_ = i_199_ >> anInt1763 * -2063427645;
	i_200_ = Math.min(363736815 * anInt1759 - 1, Math.max(0, i_200_));
	i_201_ = Math.min(anInt1760 * -1152334393 - 1, Math.max(0, i_201_));
	int i_202_ = Math.min(anInt1759 * 363736815 - 1, 1 + i_200_);
	int i_203_ = Math.min(-1152334393 * anInt1760 - 1, i_201_ + 1);
	int i_204_ = i & anInt1761 * 435863595 - 1;
	int i_205_ = i_199_ & anInt1761 * 435863595 - 1;
	int i_206_ = ((anIntArrayArray1762[i_202_][i_201_] * i_204_
		       + ((anInt1761 * 435863595 - i_204_)
			  * anIntArrayArray1762[i_200_][i_201_]))
		      >> anInt1763 * -2063427645);
	int i_207_
	    = ((i_204_ * anIntArrayArray1762[i_202_][i_203_]
		+ anIntArrayArray1762[i_200_][i_203_] * (anInt1761 * 435863595
							 - i_204_))
	       >> anInt1763 * -2063427645);
	return (i_205_ * i_207_ + i_206_ * (anInt1761 * 435863595 - i_205_)
		>> anInt1763 * -2063427645);
    }
    
    public final int method2623(int i, int i_208_) {
	return anIntArrayArray1762[i][i_208_];
    }
    
    public final int method2624(int i, int i_209_) {
	return (anIntArrayArray1762
		[Math.min(363736815 * anInt1759 - 1, Math.max(0, i))]
		[Math.min(-1152334393 * anInt1760 - 1, Math.max(0, i_209_))]);
    }
    
    public abstract void method2625(Class525_Sub21 class525_sub21, int[] is);
    
    static final void method2626(Class683 class683, byte i) {
	int i_210_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_210_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_210_ >> 16];
	Class168.method2719(class259, class245, class683, (short) 255);
    }
    
    static final void method2627(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub46_10718
		  .method17437(1862751337) == 1 ? 1 : 0;
    }
    
    public static int method2628(String string, int i) {
	return string.length() + 1;
    }
    
    static final void method2629(Class683 class683, short i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698
		  .method17074(1614986097) == 2 ? 1 : 0;
    }
    
    public static String method2630(Class525_Sub16_Sub16 class525_sub16_sub16,
				    int i) {
	if (Class61.aBool670 || null == class525_sub16_sub16)
	    return "";
	if ((class525_sub16_sub16.aString11868 == null
	     || class525_sub16_sub16.aString11868.length() == 0)
	    && null != class525_sub16_sub16.aString11869
	    && class525_sub16_sub16.aString11869.length() > 0)
	    return class525_sub16_sub16.aString11869;
	return class525_sub16_sub16.aString11868;
    }
}
