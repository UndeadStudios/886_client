/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class254
{
    int anInt2464;
    int[] anIntArray2465;
    int[] anIntArray2466;
    int[][] anIntArrayArray2467;
    int[] anIntArray2468;
    int[] anIntArray2469;
    static int[] anIntArray2470 = { 256, 128, 86, 64 };
    int[][] anIntArrayArray2471;
    int[][] anIntArrayArray2472;
    boolean[][] aBoolArrayArray2473;
    Class255 aClass255_2474;
    boolean[] aBoolArray2475;
    int[] anIntArray2476;
    static float[] aFloatArray2477
	= { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F,
	    1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F,
	    1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F,
	    2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F,
	    2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F,
	    3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F,
	    4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F,
	    6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F,
	    7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F,
	    1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F,
	    1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F,
	    1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F,
	    2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F,
	    2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F,
	    3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F,
	    4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
	    5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F,
	    7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F,
	    1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F,
	    1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F,
	    1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F,
	    2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F,
	    2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F,
	    3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
	    4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F,
	    6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F,
	    7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F,
	    1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F,
	    1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F,
	    1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F,
	    2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F,
	    2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
	    3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F,
	    4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F,
	    5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F,
	    7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F,
	    9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F,
	    0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F,
	    0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F,
	    0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F,
	    0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F,
	    0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F,
	    0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F,
	    0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F,
	    0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F,
	    0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F,
	    0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F,
	    0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F,
	    0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F,
	    0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F,
	    0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F,
	    0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F,
	    0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F,
	    0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F,
	    0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F,
	    0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F,
	    0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F,
	    0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F,
	    0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F,
	    0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F,
	    0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
    
    void method4527(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method4528(Class255 class255, int i) {
	aClass255_2474 = class255;
	int i_0_ = aClass255_2474.method4550(16);
	if (i_0_ != 1)
	    throw new RuntimeException();
	if (aBoolArray2475 == null || aBoolArray2475.length != i)
	    aBoolArray2475 = new boolean[i];
	else {
	    for (int i_1_ = 0; i_1_ < aBoolArray2475.length; i_1_++)
		aBoolArray2475[i_1_] = false;
	}
	int i_2_ = aClass255_2474.method4550(5);
	int i_3_ = 0;
	if (anIntArray2466 == null || anIntArray2466.length != i_2_)
	    anIntArray2466 = new int[i_2_];
	else
	    method4533(anIntArray2466);
	for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
	    int i_5_ = aClass255_2474.method4550(4);
	    anIntArray2466[i_4_] = i_5_;
	    if (i_5_ >= i_3_)
		i_3_ = i_5_ + 1;
	}
	if (anIntArray2468 == null || anIntArray2468.length != i_3_)
	    anIntArray2468 = new int[i_3_];
	else
	    method4533(anIntArray2468);
	if (anIntArray2476 == null || anIntArray2476.length != i_3_)
	    anIntArray2476 = new int[i_3_];
	else
	    method4533(anIntArray2476);
	if (anIntArray2469 == null || anIntArray2469.length != i_3_)
	    anIntArray2469 = new int[i_3_];
	else
	    method4533(anIntArray2469);
	if (anIntArrayArray2467 == null || anIntArrayArray2467.length != i_3_)
	    anIntArrayArray2467 = new int[i_3_][];
	for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
	    anIntArray2468[i_6_] = aClass255_2474.method4550(3) + 1;
	    int i_7_ = anIntArray2476[i_6_] = aClass255_2474.method4550(2);
	    if (i_7_ != 0)
		anIntArray2469[i_6_] = aClass255_2474.method4550(8);
	    i_7_ = 1 << i_7_;
	    int[] is = new int[i_7_];
	    anIntArrayArray2467[i_6_] = is;
	    for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
		is[i_8_] = aClass255_2474.method4550(8) - 1;
	}
	anInt2464 = aClass255_2474.method4550(2) + 1;
	int i_9_ = aClass255_2474.method4550(4);
	int i_10_ = 2;
	for (int i_11_ = 0; i_11_ < i_2_; i_11_++)
	    i_10_ += anIntArray2468[anIntArray2466[i_11_]];
	if (anIntArray2465 == null || anIntArray2465.length != i_10_)
	    anIntArray2465 = new int[i_10_];
	else
	    method4533(anIntArray2465);
	anIntArray2465[0] = 0;
	anIntArray2465[1] = 1 << i_9_;
	i_10_ = 2;
	for (int i_12_ = 0; i_12_ < i_2_; i_12_++) {
	    int i_13_ = anIntArray2466[i_12_];
	    for (int i_14_ = 0; i_14_ < anIntArray2468[i_13_]; i_14_++)
		anIntArray2465[i_10_++] = aClass255_2474.method4550(i_9_);
	}
	if (anIntArrayArray2471 == null
	    || anIntArrayArray2471.length < i_10_) {
	    anIntArrayArray2471 = new int[i][i_10_];
	    anIntArrayArray2472 = new int[i][i_10_];
	    aBoolArrayArray2473 = new boolean[i][i_10_];
	}
    }
    
    static int method4529(int[] is, int i) {
	int i_15_ = is[i];
	int i_16_ = -1;
	int i_17_ = -2147483648;
	for (int i_18_ = 0; i_18_ < i; i_18_++) {
	    int i_19_ = is[i_18_];
	    if (i_19_ < i_15_ && i_19_ > i_17_) {
		i_16_ = i_18_;
		i_17_ = i_19_;
	    }
	}
	return i_16_;
    }
    
    static int method4530(int[] is, int i) {
	int i_20_ = is[i];
	int i_21_ = -1;
	int i_22_ = 2147483647;
	for (int i_23_ = 0; i_23_ < i; i_23_++) {
	    int i_24_ = is[i_23_];
	    if (i_24_ > i_20_ && i_24_ < i_22_) {
		i_21_ = i_23_;
		i_22_ = i_24_;
	    }
	}
	return i_21_;
    }
    
    void method4531(int i, int i_25_, int i_26_, int i_27_, Class250 class250,
		    int i_28_) {
	int i_29_ = i_27_ - i_25_;
	int i_30_ = i_26_ - i;
	int i_31_ = i_29_ < 0 ? -i_29_ : i_29_;
	int i_32_ = i_29_ / i_30_;
	int i_33_ = i_25_;
	int i_34_ = 0;
	int i_35_ = i_29_ < 0 ? i_32_ - 1 : i_32_ + 1;
	i_31_ = i_31_ - (i_32_ < 0 ? -i_32_ : i_32_) * i_30_;
	class250.aFloatArray2449[i] *= aFloatArray2477[i_33_];
	if (i_26_ > i_28_)
	    i_26_ = i_28_;
	for (int i_36_ = i + 1; i_36_ < i_26_; i_36_++) {
	    i_34_ += i_31_;
	    if (i_34_ >= i_30_) {
		i_34_ -= i_30_;
		i_33_ += i_35_;
	    } else
		i_33_ += i_32_;
	    class250.aFloatArray2449[i_36_] *= aFloatArray2477[i_33_];
	}
    }
    
    boolean method4532(int i) {
	boolean bool = aClass255_2474.method4570() != 0;
	aBoolArray2475[i] = bool;
	if (!bool)
	    return false;
	int i_37_ = anIntArray2465.length;
	for (int i_38_ = 0; i_38_ < i_37_; i_38_++)
	    anIntArrayArray2471[i][i_38_] = anIntArray2465[i_38_];
	int i_39_ = anIntArray2470[anInt2464 - 1];
	int i_40_ = Textures.method3120(i_39_ - 1, (byte) -96);
	anIntArrayArray2472[i][0] = aClass255_2474.method4550(i_40_);
	anIntArrayArray2472[i][1] = aClass255_2474.method4550(i_40_);
	int i_41_ = 2;
	for (int i_42_ = 0; i_42_ < anIntArray2466.length; i_42_++) {
	    int i_43_ = anIntArray2466[i_42_];
	    int i_44_ = anIntArray2468[i_43_];
	    int i_45_ = anIntArray2476[i_43_];
	    int i_46_ = (1 << i_45_) - 1;
	    int i_47_ = 0;
	    if (i_45_ > 0)
		i_47_ = aClass255_2474.aClass258Array2494
			    [anIntArray2469[i_43_]].method4671(aClass255_2474);
	    for (int i_48_ = 0; i_48_ < i_44_; i_48_++) {
		int i_49_ = anIntArrayArray2467[i_43_][i_47_ & i_46_];
		i_47_ >>>= i_45_;
		anIntArrayArray2472[i][i_41_]
		    = i_49_ >= 0 ? aClass255_2474.aClass258Array2494[i_49_]
				       .method4671(aClass255_2474) : 0;
		i_41_++;
	    }
	}
	return true;
    }
    
    void method4533(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method4534(int i, int i_50_, int i_51_) {
	if (i < i_50_) {
	    int i_52_ = i;
	    int i_53_ = anIntArrayArray2471[i_51_][i_52_];
	    int i_54_ = anIntArrayArray2472[i_51_][i_52_];
	    boolean bool = aBoolArrayArray2473[i_51_][i_52_];
	    for (int i_55_ = i + 1; i_55_ <= i_50_; i_55_++) {
		int i_56_ = anIntArrayArray2471[i_51_][i_55_];
		if (i_56_ < i_53_) {
		    anIntArrayArray2471[i_51_][i_52_] = i_56_;
		    anIntArrayArray2472[i_51_][i_52_]
			= anIntArrayArray2472[i_51_][i_55_];
		    aBoolArrayArray2473[i_51_][i_52_]
			= aBoolArrayArray2473[i_51_][i_55_];
		    i_52_++;
		    anIntArrayArray2471[i_51_][i_55_]
			= anIntArrayArray2471[i_51_][i_52_];
		    anIntArrayArray2472[i_51_][i_55_]
			= anIntArrayArray2472[i_51_][i_52_];
		    aBoolArrayArray2473[i_51_][i_55_]
			= aBoolArrayArray2473[i_51_][i_52_];
		}
	    }
	    anIntArrayArray2471[i_51_][i_52_] = i_53_;
	    anIntArrayArray2472[i_51_][i_52_] = i_54_;
	    aBoolArrayArray2473[i_51_][i_52_] = bool;
	    method4534(i, i_52_ - 1, i_51_);
	    method4534(i_52_ + 1, i_50_, i_51_);
	}
    }
    
    void method4535(int i, int i_57_, int i_58_, int i_59_, Class250 class250,
		    int i_60_) {
	int i_61_ = i_59_ - i_57_;
	int i_62_ = i_58_ - i;
	int i_63_ = i_61_ < 0 ? -i_61_ : i_61_;
	int i_64_ = i_61_ / i_62_;
	int i_65_ = i_57_;
	int i_66_ = 0;
	int i_67_ = i_61_ < 0 ? i_64_ - 1 : i_64_ + 1;
	i_63_ = i_63_ - (i_64_ < 0 ? -i_64_ : i_64_) * i_62_;
	class250.aFloatArray2449[i] *= aFloatArray2477[i_65_];
	if (i_58_ > i_60_)
	    i_58_ = i_60_;
	for (int i_68_ = i + 1; i_68_ < i_58_; i_68_++) {
	    i_66_ += i_63_;
	    if (i_66_ >= i_62_) {
		i_66_ -= i_62_;
		i_65_ += i_67_;
	    } else
		i_65_ += i_64_;
	    class250.aFloatArray2449[i_68_] *= aFloatArray2477[i_65_];
	}
    }
    
    void method4536(int i, int i_69_, int i_70_) {
	if (i < i_69_) {
	    int i_71_ = i;
	    int i_72_ = anIntArrayArray2471[i_70_][i_71_];
	    int i_73_ = anIntArrayArray2472[i_70_][i_71_];
	    boolean bool = aBoolArrayArray2473[i_70_][i_71_];
	    for (int i_74_ = i + 1; i_74_ <= i_69_; i_74_++) {
		int i_75_ = anIntArrayArray2471[i_70_][i_74_];
		if (i_75_ < i_72_) {
		    anIntArrayArray2471[i_70_][i_71_] = i_75_;
		    anIntArrayArray2472[i_70_][i_71_]
			= anIntArrayArray2472[i_70_][i_74_];
		    aBoolArrayArray2473[i_70_][i_71_]
			= aBoolArrayArray2473[i_70_][i_74_];
		    i_71_++;
		    anIntArrayArray2471[i_70_][i_74_]
			= anIntArrayArray2471[i_70_][i_71_];
		    anIntArrayArray2472[i_70_][i_74_]
			= anIntArrayArray2472[i_70_][i_71_];
		    aBoolArrayArray2473[i_70_][i_74_]
			= aBoolArrayArray2473[i_70_][i_71_];
		}
	    }
	    anIntArrayArray2471[i_70_][i_71_] = i_72_;
	    anIntArrayArray2472[i_70_][i_71_] = i_73_;
	    aBoolArrayArray2473[i_70_][i_71_] = bool;
	    method4534(i, i_71_ - 1, i_70_);
	    method4534(i_71_ + 1, i_69_, i_70_);
	}
    }
    
    int method4537(int i, int i_76_, int i_77_, int i_78_, int i_79_) {
	int i_80_ = i_78_ - i_76_;
	int i_81_ = i_77_ - i;
	int i_82_ = i_80_ < 0 ? -i_80_ : i_80_;
	int i_83_ = i_82_ * (i_79_ - i);
	int i_84_ = i_83_ / i_81_;
	return i_80_ < 0 ? i_76_ - i_84_ : i_76_ + i_84_;
    }
    
    static int method4538(int[] is, int i) {
	int i_85_ = is[i];
	int i_86_ = -1;
	int i_87_ = -2147483648;
	for (int i_88_ = 0; i_88_ < i; i_88_++) {
	    int i_89_ = is[i_88_];
	    if (i_89_ < i_85_ && i_89_ > i_87_) {
		i_86_ = i_88_;
		i_87_ = i_89_;
	    }
	}
	return i_86_;
    }
    
    static int method4539(int[] is, int i) {
	int i_90_ = is[i];
	int i_91_ = -1;
	int i_92_ = 2147483647;
	for (int i_93_ = 0; i_93_ < i; i_93_++) {
	    int i_94_ = is[i_93_];
	    if (i_94_ > i_90_ && i_94_ < i_92_) {
		i_91_ = i_93_;
		i_92_ = i_94_;
	    }
	}
	return i_91_;
    }
    
    void method4540(Class250 class250, int i, int i_95_) {
	if (aBoolArray2475[i_95_]) {
	    int i_96_ = anIntArray2465.length;
	    method4534(0, i_96_ - 1, i_95_);
	    int i_97_ = 0;
	    int i_98_ = anIntArrayArray2472[i_95_][0] * anInt2464;
	    for (int i_99_ = 1; i_99_ < i_96_; i_99_++) {
		if (anIntArrayArray2472[i_95_][i_99_] >= 0) {
		    int i_100_ = anIntArrayArray2471[i_95_][i_99_];
		    int i_101_ = anIntArrayArray2472[i_95_][i_99_] * anInt2464;
		    method4535(i_97_, i_98_, i_100_, i_101_, class250, i);
		    if (i_100_ < i) {
			/* empty */
		    }
		    i_97_ = i_100_;
		    i_98_ = i_101_;
		}
	    }
	    float f = aFloatArray2477[i_98_];
	    for (int i_102_ = i_97_; i_102_ < i; i_102_++)
		class250.aFloatArray2449[i_102_] *= f;
	}
    }
    
    int method4541(int i, int i_103_, int i_104_, int i_105_, int i_106_) {
	int i_107_ = i_105_ - i_103_;
	int i_108_ = i_104_ - i;
	int i_109_ = i_107_ < 0 ? -i_107_ : i_107_;
	int i_110_ = i_109_ * (i_106_ - i);
	int i_111_ = i_110_ / i_108_;
	return i_107_ < 0 ? i_103_ - i_111_ : i_103_ + i_111_;
    }
    
    void method4542(int i, int i_112_, int i_113_, int i_114_,
		    Class250 class250, int i_115_) {
	int i_116_ = i_114_ - i_112_;
	int i_117_ = i_113_ - i;
	int i_118_ = i_116_ < 0 ? -i_116_ : i_116_;
	int i_119_ = i_116_ / i_117_;
	int i_120_ = i_112_;
	int i_121_ = 0;
	int i_122_ = i_116_ < 0 ? i_119_ - 1 : i_119_ + 1;
	i_118_ = i_118_ - (i_119_ < 0 ? -i_119_ : i_119_) * i_117_;
	class250.aFloatArray2449[i] *= aFloatArray2477[i_120_];
	if (i_113_ > i_115_)
	    i_113_ = i_115_;
	for (int i_123_ = i + 1; i_123_ < i_113_; i_123_++) {
	    i_121_ += i_118_;
	    if (i_121_ >= i_117_) {
		i_121_ -= i_117_;
		i_120_ += i_122_;
	    } else
		i_120_ += i_119_;
	    class250.aFloatArray2449[i_123_] *= aFloatArray2477[i_120_];
	}
    }
    
    static int method4543(int[] is, int i) {
	int i_124_ = is[i];
	int i_125_ = -1;
	int i_126_ = 2147483647;
	for (int i_127_ = 0; i_127_ < i; i_127_++) {
	    int i_128_ = is[i_127_];
	    if (i_128_ > i_124_ && i_128_ < i_126_) {
		i_125_ = i_127_;
		i_126_ = i_128_;
	    }
	}
	return i_125_;
    }
    
    void method4544(int i) {
	if (aBoolArray2475[i]) {
	    int i_129_ = anIntArray2465.length;
	    int i_130_ = anIntArray2470[anInt2464 - 1];
	    boolean[] bools = aBoolArrayArray2473[i];
	    aBoolArrayArray2473[i][1] = true;
	    bools[0] = true;
	    for (int i_131_ = 2; i_131_ < i_129_; i_131_++) {
		int i_132_ = method4529(anIntArray2465, i_131_);
		int i_133_ = method4530(anIntArray2465, i_131_);
		int i_134_ = method4537(anIntArray2465[i_132_],
					anIntArrayArray2472[i][i_132_],
					anIntArray2465[i_133_],
					anIntArrayArray2472[i][i_133_],
					anIntArray2465[i_131_]);
		int i_135_ = anIntArrayArray2472[i][i_131_];
		int i_136_ = i_130_ - i_134_;
		int i_137_ = i_134_;
		int i_138_ = (i_136_ < i_137_ ? i_136_ : i_137_) << 1;
		if (i_135_ != 0) {
		    boolean[] bools_139_ = aBoolArrayArray2473[i];
		    int i_140_ = i_132_;
		    aBoolArrayArray2473[i][i_133_] = true;
		    bools_139_[i_140_] = true;
		    aBoolArrayArray2473[i][i_131_] = true;
		    if (i_135_ >= i_138_)
			anIntArrayArray2472[i][i_131_]
			    = (i_136_ > i_137_ ? i_135_ - i_137_ + i_134_
			       : i_134_ - i_135_ + i_136_ - 1);
		    else
			anIntArrayArray2472[i][i_131_]
			    = ((i_135_ & 0x1) != 0 ? i_134_ - (i_135_ + 1 >> 1)
			       : i_134_ + (i_135_ >> 1));
		} else {
		    aBoolArrayArray2473[i][i_131_] = false;
		    anIntArrayArray2472[i][i_131_] = i_134_;
		}
	    }
	    for (int i_141_ = 0; i_141_ < i_129_; i_141_++) {
		if (!aBoolArrayArray2473[i][i_141_])
		    anIntArrayArray2472[i][i_141_] = -1;
	    }
	}
    }
    
    void method4545(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method4546(int i, int i_142_, int i_143_) {
	if (i < i_142_) {
	    int i_144_ = i;
	    int i_145_ = anIntArrayArray2471[i_143_][i_144_];
	    int i_146_ = anIntArrayArray2472[i_143_][i_144_];
	    boolean bool = aBoolArrayArray2473[i_143_][i_144_];
	    for (int i_147_ = i + 1; i_147_ <= i_142_; i_147_++) {
		int i_148_ = anIntArrayArray2471[i_143_][i_147_];
		if (i_148_ < i_145_) {
		    anIntArrayArray2471[i_143_][i_144_] = i_148_;
		    anIntArrayArray2472[i_143_][i_144_]
			= anIntArrayArray2472[i_143_][i_147_];
		    aBoolArrayArray2473[i_143_][i_144_]
			= aBoolArrayArray2473[i_143_][i_147_];
		    i_144_++;
		    anIntArrayArray2471[i_143_][i_147_]
			= anIntArrayArray2471[i_143_][i_144_];
		    anIntArrayArray2472[i_143_][i_147_]
			= anIntArrayArray2472[i_143_][i_144_];
		    aBoolArrayArray2473[i_143_][i_147_]
			= aBoolArrayArray2473[i_143_][i_144_];
		}
	    }
	    anIntArrayArray2471[i_143_][i_144_] = i_145_;
	    anIntArrayArray2472[i_143_][i_144_] = i_146_;
	    aBoolArrayArray2473[i_143_][i_144_] = bool;
	    method4534(i, i_144_ - 1, i_143_);
	    method4534(i_144_ + 1, i_142_, i_143_);
	}
    }
    
    Class254() {
	/* empty */
    }
    
    boolean method4547(int i) {
	boolean bool = aClass255_2474.method4570() != 0;
	aBoolArray2475[i] = bool;
	if (!bool)
	    return false;
	int i_149_ = anIntArray2465.length;
	for (int i_150_ = 0; i_150_ < i_149_; i_150_++)
	    anIntArrayArray2471[i][i_150_] = anIntArray2465[i_150_];
	int i_151_ = anIntArray2470[anInt2464 - 1];
	int i_152_ = Textures.method3120(i_151_ - 1, (byte) 40);
	anIntArrayArray2472[i][0] = aClass255_2474.method4550(i_152_);
	anIntArrayArray2472[i][1] = aClass255_2474.method4550(i_152_);
	int i_153_ = 2;
	for (int i_154_ = 0; i_154_ < anIntArray2466.length; i_154_++) {
	    int i_155_ = anIntArray2466[i_154_];
	    int i_156_ = anIntArray2468[i_155_];
	    int i_157_ = anIntArray2476[i_155_];
	    int i_158_ = (1 << i_157_) - 1;
	    int i_159_ = 0;
	    if (i_157_ > 0)
		i_159_
		    = aClass255_2474.aClass258Array2494
			  [anIntArray2469[i_155_]].method4671(aClass255_2474);
	    for (int i_160_ = 0; i_160_ < i_156_; i_160_++) {
		int i_161_ = anIntArrayArray2467[i_155_][i_159_ & i_158_];
		i_159_ >>>= i_157_;
		anIntArrayArray2472[i][i_153_]
		    = i_161_ >= 0 ? aClass255_2474.aClass258Array2494
					[i_161_]
					.method4671(aClass255_2474) : 0;
		i_153_++;
	    }
	}
	return true;
    }
    
    void method4548(Class250 class250, int i, int i_162_) {
	if (aBoolArray2475[i_162_]) {
	    int i_163_ = anIntArray2465.length;
	    method4534(0, i_163_ - 1, i_162_);
	    int i_164_ = 0;
	    int i_165_ = anIntArrayArray2472[i_162_][0] * anInt2464;
	    for (int i_166_ = 1; i_166_ < i_163_; i_166_++) {
		if (anIntArrayArray2472[i_162_][i_166_] >= 0) {
		    int i_167_ = anIntArrayArray2471[i_162_][i_166_];
		    int i_168_
			= anIntArrayArray2472[i_162_][i_166_] * anInt2464;
		    method4535(i_164_, i_165_, i_167_, i_168_, class250, i);
		    if (i_167_ < i) {
			/* empty */
		    }
		    i_164_ = i_167_;
		    i_165_ = i_168_;
		}
	    }
	    float f = aFloatArray2477[i_165_];
	    for (int i_169_ = i_164_; i_169_ < i; i_169_++)
		class250.aFloatArray2449[i_169_] *= f;
	}
    }
    
    void method4549(Class250 class250, int i, int i_170_) {
	if (aBoolArray2475[i_170_]) {
	    int i_171_ = anIntArray2465.length;
	    method4534(0, i_171_ - 1, i_170_);
	    int i_172_ = 0;
	    int i_173_ = anIntArrayArray2472[i_170_][0] * anInt2464;
	    for (int i_174_ = 1; i_174_ < i_171_; i_174_++) {
		if (anIntArrayArray2472[i_170_][i_174_] >= 0) {
		    int i_175_ = anIntArrayArray2471[i_170_][i_174_];
		    int i_176_
			= anIntArrayArray2472[i_170_][i_174_] * anInt2464;
		    method4535(i_172_, i_173_, i_175_, i_176_, class250, i);
		    if (i_175_ < i) {
			/* empty */
		    }
		    i_172_ = i_175_;
		    i_173_ = i_176_;
		}
	    }
	    float f = aFloatArray2477[i_173_];
	    for (int i_177_ = i_172_; i_177_ < i; i_177_++)
		class250.aFloatArray2449[i_177_] *= f;
	}
    }
}
