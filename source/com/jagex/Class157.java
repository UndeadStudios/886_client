/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class157 implements Interface2
{
    public abstract void method2467(int i, int i_0_, int i_1_, int i_2_,
				    int i_3_);
    
    public abstract void method2468(int i, int i_4_, int i_5_, int i_6_);
    
    public abstract void method2469(int[] is);
    
    abstract void method2470(int i, int i_7_, int i_8_, int i_9_, int i_10_,
			     int i_11_, int i_12_, int i_13_);
    
    public abstract int method12();
    
    public abstract int method2471();
    
    public abstract int method2472();
    
    public final void method2473(float f, float f_14_, float f_15_,
				 float f_16_, int i, int i_17_,
				 Class152 class152, int i_18_, int i_19_) {
	if (i != 0) {
	    double d = (double) (i_17_ & 0xffff) * 9.587379924285257E-5;
	    float f_20_ = (float) Math.sin(d) * (float) i;
	    float f_21_ = (float) Math.cos(d) * (float) i;
	    float f_22_ = (-f_15_ * f_21_ + -f_16_ * f_20_) / 4096.0F + f;
	    float f_23_ = (--f_15_ * f_20_ + -f_16_ * f_21_) / 4096.0F + f_14_;
	    float f_24_ = ((((float) method12() - f_15_) * f_21_
			    + -f_16_ * f_20_) / 4096.0F
			   + f);
	    float f_25_ = ((-((float) method12() - f_15_) * f_20_
			    + -f_16_ * f_21_) / 4096.0F
			   + f_14_);
	    float f_26_ = ((-f_15_ * f_21_
			    + ((float) method2472() - f_16_) * f_20_) / 4096.0F
			   + f);
	    float f_27_ = ((--f_15_ * f_20_
			    + ((float) method2472() - f_16_) * f_21_) / 4096.0F
			   + f_14_);
	    method2494(f_22_, f_23_, f_24_, f_25_, f_26_, f_27_, class152,
		       i_18_, i_19_);
	}
    }
    
    public abstract void method2474(int i, int i_28_, int i_29_, int i_30_,
				    int[] is, int i_31_, int i_32_);
    
    public abstract void method2475(int i, int i_33_, int i_34_, int i_35_,
				    int[] is, int[] is_36_, int i_37_,
				    int i_38_);
    
    abstract void method2476(float f, float f_39_, float f_40_, float f_41_,
			     float f_42_, float f_43_, int i, int i_44_,
			     int i_45_, int i_46_);
    
    public abstract void method2477(int i, int i_47_, int i_48_);
    
    public final void method2478(int i, int i_49_, int i_50_, int i_51_) {
	method2485(i, i_49_, i_50_, i_51_, 1, -1, 1);
    }
    
    public abstract void method2479(int i, int i_52_, int i_53_, int i_54_,
				    int i_55_);
    
    public abstract void method2480(int i, int i_56_, Class152 class152,
				    int i_57_, int i_58_);
    
    public final void method2481(int i, int i_59_, int i_60_, int i_61_) {
	method2483(i, i_59_, i_60_, i_61_, 1, -1, 1, 1);
    }
    
    public final void method2482(int i, int i_62_, int i_63_, int i_64_,
				 int i_65_, int i_66_, int i_67_) {
	method2483(i, i_62_, i_63_, i_64_, i_65_, i_66_, i_67_, 1);
    }
    
    abstract void method2483(int i, int i_68_, int i_69_, int i_70_, int i_71_,
			     int i_72_, int i_73_, int i_74_);
    
    abstract void method2484(float f, float f_75_, float f_76_, float f_77_,
			     float f_78_, float f_79_, int i,
			     Class152 class152, int i_80_, int i_81_);
    
    public abstract void method2485(int i, int i_82_, int i_83_, int i_84_,
				    int i_85_, int i_86_, int i_87_);
    
    public abstract void method2486(int i, int i_88_, int i_89_);
    
    public final void method2487(float f, float f_90_, int i, int i_91_) {
	method2489(f, f_90_, (float) method12() / 2.0F,
		   (float) method2472() / 2.0F, i, i_91_, 1, -1, 1);
    }
    
    Class157() {
	/* empty */
    }
    
    public final void method2488(float f, float f_92_, float f_93_,
				 float f_94_, int i, int i_95_, int i_96_,
				 int i_97_, int i_98_, int i_99_) {
	if (i != 0 && i_95_ != 0) {
	    double d = (double) (i_96_ & 0xffff) * 9.587379924285257E-5;
	    float f_100_ = (float) Math.sin(d) * (float) i_95_;
	    float f_101_ = (float) Math.cos(d) * (float) i_95_;
	    float f_102_ = (float) Math.sin(d) * (float) i;
	    float f_103_ = (float) Math.cos(d) * (float) i;
	    float f_104_ = (-f_93_ * f_103_ + -f_94_ * f_100_) / 4096.0F + f;
	    float f_105_
		= (--f_93_ * f_102_ + -f_94_ * f_101_) / 4096.0F + f_92_;
	    float f_106_ = ((((float) method12() - f_93_) * f_103_
			     + -f_94_ * f_100_) / 4096.0F
			    + f);
	    float f_107_ = ((-((float) method12() - f_93_) * f_102_
			     + -f_94_ * f_101_) / 4096.0F
			    + f_92_);
	    float f_108_
		= (((-f_93_ * f_103_ + ((float) method2472() - f_94_) * f_100_)
		    / 4096.0F)
		   + f);
	    float f_109_
		= ((--f_93_ * f_102_
		    + ((float) method2472() - f_94_) * f_101_) / 4096.0F
		   + f_92_);
	    method2492(f_104_, f_105_, f_106_, f_107_, f_108_, f_109_, i_97_,
		       i_98_, i_99_);
	}
    }
    
    public final void method2489(float f, float f_110_, float f_111_,
				 float f_112_, int i, int i_113_, int i_114_,
				 int i_115_, int i_116_) {
	if (i != 0) {
	    double d = (double) (i_113_ & 0xffff) * 9.587379924285257E-5;
	    float f_117_ = (float) Math.sin(d) * (float) i;
	    float f_118_ = (float) Math.cos(d) * (float) i;
	    float f_119_ = (-f_111_ * f_118_ + -f_112_ * f_117_) / 4096.0F + f;
	    float f_120_
		= (--f_111_ * f_117_ + -f_112_ * f_118_) / 4096.0F + f_110_;
	    float f_121_ = ((((float) method12() - f_111_) * f_118_
			     + -f_112_ * f_117_) / 4096.0F
			    + f);
	    float f_122_ = ((-((float) method12() - f_111_) * f_117_
			     + -f_112_ * f_118_) / 4096.0F
			    + f_110_);
	    float f_123_
		= ((-f_111_ * f_118_
		    + ((float) method2472() - f_112_) * f_117_) / 4096.0F
		   + f);
	    float f_124_
		= ((--f_111_ * f_117_
		    + ((float) method2472() - f_112_) * f_118_) / 4096.0F
		   + f_110_);
	    method2492(f_119_, f_120_, f_121_, f_122_, f_123_, f_124_, i_114_,
		       i_115_, i_116_);
	}
    }
    
    public final void method2490(float f, float f_125_, int i, int i_126_,
				 Class152 class152, int i_127_, int i_128_) {
	method2491(f, f_125_, (float) method12() / 2.0F,
		   (float) method2472() / 2.0F, i, i_126_, class152, i_127_,
		   i_128_);
    }
    
    public final void method2491(float f, float f_129_, float f_130_,
				 float f_131_, int i, int i_132_,
				 Class152 class152, int i_133_, int i_134_) {
	if (i != 0) {
	    double d = (double) (i_132_ & 0xffff) * 9.587379924285257E-5;
	    float f_135_ = (float) Math.sin(d) * (float) i;
	    float f_136_ = (float) Math.cos(d) * (float) i;
	    float f_137_ = (-f_130_ * f_136_ + -f_131_ * f_135_) / 4096.0F + f;
	    float f_138_
		= (--f_130_ * f_135_ + -f_131_ * f_136_) / 4096.0F + f_129_;
	    float f_139_ = ((((float) method12() - f_130_) * f_136_
			     + -f_131_ * f_135_) / 4096.0F
			    + f);
	    float f_140_ = ((-((float) method12() - f_130_) * f_135_
			     + -f_131_ * f_136_) / 4096.0F
			    + f_129_);
	    float f_141_
		= ((-f_130_ * f_136_
		    + ((float) method2472() - f_131_) * f_135_) / 4096.0F
		   + f);
	    float f_142_
		= ((--f_130_ * f_135_
		    + ((float) method2472() - f_131_) * f_136_) / 4096.0F
		   + f_129_);
	    method2494(f_137_, f_138_, f_139_, f_140_, f_141_, f_142_,
		       class152, i_133_, i_134_);
	}
    }
    
    public final void method2492(float f, float f_143_, float f_144_,
				 float f_145_, float f_146_, float f_147_,
				 int i, int i_148_, int i_149_) {
	method2493(f, f_143_, f_144_, f_145_, f_146_, f_147_, i, i_148_,
		   i_149_, 1);
    }
    
    abstract void method2493(float f, float f_150_, float f_151_, float f_152_,
			     float f_153_, float f_154_, int i, int i_155_,
			     int i_156_, int i_157_);
    
    final void method2494(float f, float f_158_, float f_159_, float f_160_,
			  float f_161_, float f_162_, Class152 class152, int i,
			  int i_163_) {
	method2495(f, f_158_, f_159_, f_160_, f_161_, f_162_, 1, class152, i,
		   i_163_);
    }
    
    abstract void method2495(float f, float f_164_, float f_165_, float f_166_,
			     float f_167_, float f_168_, int i,
			     Class152 class152, int i_169_, int i_170_);
    
    public final void method2496(float f, float f_171_, float f_172_,
				 float f_173_, int i, int i_174_, int i_175_,
				 int i_176_, int i_177_) {
	if (i != 0) {
	    double d = (double) (i_174_ & 0xffff) * 9.587379924285257E-5;
	    float f_178_ = (float) Math.sin(d) * (float) i;
	    float f_179_ = (float) Math.cos(d) * (float) i;
	    float f_180_ = (-f_172_ * f_179_ + -f_173_ * f_178_) / 4096.0F + f;
	    float f_181_
		= (--f_172_ * f_178_ + -f_173_ * f_179_) / 4096.0F + f_171_;
	    float f_182_ = ((((float) method12() - f_172_) * f_179_
			     + -f_173_ * f_178_) / 4096.0F
			    + f);
	    float f_183_ = ((-((float) method12() - f_172_) * f_178_
			     + -f_173_ * f_179_) / 4096.0F
			    + f_171_);
	    float f_184_
		= ((-f_172_ * f_179_
		    + ((float) method2472() - f_173_) * f_178_) / 4096.0F
		   + f);
	    float f_185_
		= ((--f_172_ * f_178_
		    + ((float) method2472() - f_173_) * f_179_) / 4096.0F
		   + f_171_);
	    method2492(f_180_, f_181_, f_182_, f_183_, f_184_, f_185_, i_175_,
		       i_176_, i_177_);
	}
    }
    
    public abstract void method2497(int i, int i_186_, int i_187_, int i_188_,
				    int i_189_, int i_190_);
    
    public abstract void method2498(int i, int i_191_, int i_192_, int i_193_,
				    int i_194_, int i_195_);
    
    public abstract void method2499(int i, int i_196_, int i_197_, int i_198_,
				    int i_199_, int i_200_);
    
    public abstract void method2500(int i, int i_201_, int i_202_, int i_203_,
				    int[] is, int[] is_204_, int i_205_,
				    int i_206_);
    
    public abstract Interface21 method2501();
    
    public abstract Interface21 method2502();
    
    public abstract int method2503();
    
    abstract void method2504(float f, float f_207_, float f_208_, float f_209_,
			     float f_210_, float f_211_, int i, int i_212_,
			     int i_213_, int i_214_);
    
    public abstract void method2505(int i, int i_215_, int i_216_, int i_217_,
				    int i_218_);
    
    public final void method2506(float f, float f_219_, float f_220_,
				 float f_221_, float f_222_, float f_223_,
				 int i, int i_224_, int i_225_) {
	method2493(f, f_219_, f_220_, f_221_, f_222_, f_223_, i, i_224_,
		   i_225_, 1);
    }
    
    public abstract Interface21 method2507();
    
    abstract void method2508(int i, int i_226_, int i_227_, int i_228_,
			     int i_229_, int i_230_, int i_231_, int i_232_);
    
    abstract void method2509(int i, int i_233_, int i_234_, int i_235_,
			     int i_236_, int i_237_, int i_238_, int i_239_);
    
    public abstract void method2510(int i, int i_240_, int i_241_, int i_242_,
				    int[] is, int[] is_243_, int i_244_,
				    int i_245_);
    
    public abstract void method2511(int i, int i_246_, int i_247_, int i_248_,
				    int i_249_, int i_250_, int i_251_);
    
    public final void method2512(int i, int i_252_, int i_253_, int i_254_) {
	method2483(i, i_252_, i_253_, i_254_, 1, -1, 1, 1);
    }
    
    public abstract void method2513(int i, int i_255_, Class152 class152,
				    int i_256_, int i_257_);
    
    public abstract void method2514(int i, int i_258_, int i_259_, int i_260_,
				    int[] is, int[] is_261_, int i_262_,
				    int i_263_);
    
    public abstract void method2515(int i, int i_264_, int i_265_, int i_266_);
    
    public abstract void method2516(int i, int i_267_, int i_268_, int i_269_);
    
    public abstract void method2517(int i, int i_270_, int i_271_, int i_272_);
    
    public final void method2518(int i, int i_273_) {
	method2479(i, i_273_, 1, -1, 1);
    }
    
    public abstract int method2519();
    
    public abstract int method2520();
    
    public abstract int method11();
    
    public abstract Interface21 method2521();
    
    public final void method2522(int i, int i_274_, int i_275_, int i_276_) {
	method2485(i, i_274_, i_275_, i_276_, 1, -1, 1);
    }
    
    public final void method2523(float f, float f_277_, float f_278_,
				 float f_279_, int i, int i_280_, int i_281_,
				 int i_282_, int i_283_) {
	if (i != 0) {
	    double d = (double) (i_280_ & 0xffff) * 9.587379924285257E-5;
	    float f_284_ = (float) Math.sin(d) * (float) i;
	    float f_285_ = (float) Math.cos(d) * (float) i;
	    float f_286_ = (-f_278_ * f_285_ + -f_279_ * f_284_) / 4096.0F + f;
	    float f_287_
		= (--f_278_ * f_284_ + -f_279_ * f_285_) / 4096.0F + f_277_;
	    float f_288_ = ((((float) method12() - f_278_) * f_285_
			     + -f_279_ * f_284_) / 4096.0F
			    + f);
	    float f_289_ = ((-((float) method12() - f_278_) * f_284_
			     + -f_279_ * f_285_) / 4096.0F
			    + f_277_);
	    float f_290_
		= ((-f_278_ * f_285_
		    + ((float) method2472() - f_279_) * f_284_) / 4096.0F
		   + f);
	    float f_291_
		= ((--f_278_ * f_284_
		    + ((float) method2472() - f_279_) * f_285_) / 4096.0F
		   + f_277_);
	    method2492(f_286_, f_287_, f_288_, f_289_, f_290_, f_291_, i_281_,
		       i_282_, i_283_);
	}
    }
    
    abstract void method2524(float f, float f_292_, float f_293_, float f_294_,
			     float f_295_, float f_296_, int i, int i_297_,
			     int i_298_, int i_299_);
    
    public final void method2525(int i, int i_300_, int i_301_, int i_302_) {
	method2485(i, i_300_, i_301_, i_302_, 1, -1, 1);
    }
    
    public final void method2526(float f, float f_303_, int i, int i_304_,
				 int i_305_, int i_306_, int i_307_) {
	method2489(f, f_303_, (float) method12() / 2.0F,
		   (float) method2472() / 2.0F, i, i_304_, i_305_, i_306_,
		   i_307_);
    }
    
    public abstract void method2527(int i, int i_308_, int i_309_, int i_310_,
				    int[] is, int i_311_, int i_312_);
    
    abstract void method2528(float f, float f_313_, float f_314_, float f_315_,
			     float f_316_, float f_317_, int i,
			     Class152 class152, int i_318_, int i_319_);
    
    public abstract int method2529();
    
    public abstract int method2530();
    
    public abstract int method2531();
    
    public final void method2532(float f, float f_320_, float f_321_,
				 float f_322_, int i, int i_323_) {
	method2489(f, f_320_, f_321_, f_322_, i, i_323_, 1, -1, 1);
    }
    
    public final void method2533(int i, int i_324_) {
	method2479(i, i_324_, 1, -1, 1);
    }
    
    public final void method2534(float f, float f_325_, float f_326_,
				 float f_327_, int i, int i_328_, int i_329_,
				 int i_330_, int i_331_, int i_332_) {
	if (i != 0 && i_328_ != 0) {
	    double d = (double) (i_329_ & 0xffff) * 9.587379924285257E-5;
	    float f_333_ = (float) Math.sin(d) * (float) i_328_;
	    float f_334_ = (float) Math.cos(d) * (float) i_328_;
	    float f_335_ = (float) Math.sin(d) * (float) i;
	    float f_336_ = (float) Math.cos(d) * (float) i;
	    float f_337_ = (-f_326_ * f_336_ + -f_327_ * f_333_) / 4096.0F + f;
	    float f_338_
		= (--f_326_ * f_335_ + -f_327_ * f_334_) / 4096.0F + f_325_;
	    float f_339_ = ((((float) method12() - f_326_) * f_336_
			     + -f_327_ * f_333_) / 4096.0F
			    + f);
	    float f_340_ = ((-((float) method12() - f_326_) * f_335_
			     + -f_327_ * f_334_) / 4096.0F
			    + f_325_);
	    float f_341_
		= ((-f_326_ * f_336_
		    + ((float) method2472() - f_327_) * f_333_) / 4096.0F
		   + f);
	    float f_342_
		= ((--f_326_ * f_335_
		    + ((float) method2472() - f_327_) * f_334_) / 4096.0F
		   + f_325_);
	    method2492(f_337_, f_338_, f_339_, f_340_, f_341_, f_342_, i_330_,
		       i_331_, i_332_);
	}
    }
    
    public final void method2535(int i, int i_343_, int i_344_, int i_345_,
				 int i_346_, int i_347_, int i_348_) {
	method2483(i, i_343_, i_344_, i_345_, i_346_, i_347_, i_348_, 1);
    }
    
    public final void method2536(int i, int i_349_) {
	method2479(i, i_349_, 1, -1, 1);
    }
    
    public final void method2537(int i, int i_350_, int i_351_, int i_352_,
				 int i_353_, int i_354_, int i_355_) {
	method2483(i, i_350_, i_351_, i_352_, i_353_, i_354_, i_355_, 1);
    }
    
    public final void method2538(int i, int i_356_, int i_357_, int i_358_,
				 int i_359_, int i_360_, int i_361_) {
	method2483(i, i_356_, i_357_, i_358_, i_359_, i_360_, i_361_, 1);
    }
    
    public final void method2539(int i, int i_362_, int i_363_, int i_364_,
				 int i_365_, int i_366_, int i_367_) {
	method2483(i, i_362_, i_363_, i_364_, i_365_, i_366_, i_367_, 1);
    }
    
    public abstract void method2540(int i, int i_368_, int i_369_, int i_370_,
				    int i_371_, int i_372_);
    
    public abstract void method2541(int[] is);
    
    public final void method2542(float f, float f_373_, int i, int i_374_) {
	method2489(f, f_373_, (float) method12() / 2.0F,
		   (float) method2472() / 2.0F, i, i_374_, 1, -1, 1);
    }
    
    public final void method2543(float f, float f_375_, int i, int i_376_,
				 int i_377_, int i_378_, int i_379_) {
	method2489(f, f_375_, (float) method12() / 2.0F,
		   (float) method2472() / 2.0F, i, i_376_, i_377_, i_378_,
		   i_379_);
    }
    
    public abstract void method2544(int i, int i_380_, int i_381_, int i_382_,
				    int i_383_, int i_384_, int i_385_);
    
    public abstract void method2545(int i, int i_386_, int i_387_, int i_388_,
				    int i_389_);
    
    public final void method2546(int i, int i_390_, int i_391_, int i_392_,
				 int i_393_, int i_394_, int i_395_) {
	method2483(i, i_390_, i_391_, i_392_, i_393_, i_394_, i_395_, 1);
    }
    
    public final void method2547(float f, float f_396_, float f_397_,
				 float f_398_, int i, int i_399_, int i_400_,
				 int i_401_, int i_402_) {
	if (i != 0) {
	    double d = (double) (i_399_ & 0xffff) * 9.587379924285257E-5;
	    float f_403_ = (float) Math.sin(d) * (float) i;
	    float f_404_ = (float) Math.cos(d) * (float) i;
	    float f_405_ = (-f_397_ * f_404_ + -f_398_ * f_403_) / 4096.0F + f;
	    float f_406_
		= (--f_397_ * f_403_ + -f_398_ * f_404_) / 4096.0F + f_396_;
	    float f_407_ = ((((float) method12() - f_397_) * f_404_
			     + -f_398_ * f_403_) / 4096.0F
			    + f);
	    float f_408_ = ((-((float) method12() - f_397_) * f_403_
			     + -f_398_ * f_404_) / 4096.0F
			    + f_396_);
	    float f_409_
		= ((-f_397_ * f_404_
		    + ((float) method2472() - f_398_) * f_403_) / 4096.0F
		   + f);
	    float f_410_
		= ((--f_397_ * f_403_
		    + ((float) method2472() - f_398_) * f_404_) / 4096.0F
		   + f_396_);
	    method2492(f_405_, f_406_, f_407_, f_408_, f_409_, f_410_, i_400_,
		       i_401_, i_402_);
	}
    }
    
    public final void method2548(float f, float f_411_, int i, int i_412_,
				 Class152 class152, int i_413_, int i_414_) {
	method2491(f, f_411_, (float) method12() / 2.0F,
		   (float) method2472() / 2.0F, i, i_412_, class152, i_413_,
		   i_414_);
    }
    
    public abstract void method2549(int i, int i_415_, Class152 class152,
				    int i_416_, int i_417_);
    
    abstract void method2550(float f, float f_418_, float f_419_, float f_420_,
			     float f_421_, float f_422_, int i, int i_423_,
			     int i_424_, int i_425_);
    
    public final void method2551(float f, float f_426_, float f_427_,
				 float f_428_, float f_429_, float f_430_,
				 int i, int i_431_, int i_432_) {
	method2493(f, f_426_, f_427_, f_428_, f_429_, f_430_, i, i_431_,
		   i_432_, 1);
    }
    
    public final void method2552(float f, float f_433_, float f_434_,
				 float f_435_, float f_436_, float f_437_,
				 int i, int i_438_, int i_439_) {
	method2493(f, f_433_, f_434_, f_435_, f_436_, f_437_, i, i_438_,
		   i_439_, 1);
    }
    
    final void method2553(float f, float f_440_, float f_441_, float f_442_,
			  float f_443_, float f_444_, Class152 class152, int i,
			  int i_445_) {
	method2495(f, f_440_, f_441_, f_442_, f_443_, f_444_, 1, class152, i,
		   i_445_);
    }
}
