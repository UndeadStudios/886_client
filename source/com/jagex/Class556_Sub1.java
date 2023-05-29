/* Class556_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class556_Sub1 extends Class556
{
    static int anInt10619;
    static int anInt10620;
    public static boolean aBool10621;
    static int anInt10622;
    public static int anInt10623;
    public static int anInt10624;
    public static int anInt10625;
    static int anInt10626;
    static int anInt10627;
    static boolean aBool10628;
    static boolean aBool10629;
    static int anInt10630;
    static boolean aBool10631;
    static int anInt10632;
    static Class7[][] aClass7ArrayArray10633;
    public static Class10 aClass10_10634;
    static boolean aBool10635;
    static int anInt10636;
    static Class175[][] aClass175ArrayArray10637;
    public static boolean aBool10638;
    public static boolean aBool10639;
    public static Class10 aClass10_10640;
    static HashMap aHashMap10641;
    static Class699 aClass699_10642;
    static int anInt10643 = 0;
    static boolean aBool10644;
    public static boolean aBool10645;
    static HashMap aHashMap10646;
    static boolean aBool10647;
    static int anInt10648;
    
    public static int method16402(int i, int i_0_, int i_1_) {
	if (anInt10625 * 294186987 < 100)
	    return -2;
	int i_2_ = -2;
	int i_3_ = 2147483647;
	int i_4_ = i_0_ - anInt7483;
	int i_5_ = i_1_ - anInt7484;
	for (Class525_Sub37 class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14372((short) -27834);
	     null != class525_sub37;
	     class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14353(-1371424190)) {
	    if (i == -480723851 * class525_sub37.anInt10825) {
		int i_6_ = class525_sub37.anInt10826 * 1273194629;
		int i_7_ = -1383897689 * class525_sub37.anInt10824;
		int i_8_ = anInt7483 + i_6_ << 14 | i_7_ + anInt7484;
		int i_9_ = ((i_4_ - i_6_) * (i_4_ - i_6_)
			    + (i_5_ - i_7_) * (i_5_ - i_7_));
		if (i_2_ < 0 || i_9_ < i_3_) {
		    i_2_ = i_8_;
		    i_3_ = i_9_;
		}
	    }
	}
	return i_2_;
    }
    
    static void method16403(int i) {
	int i_10_;
	if (i == 0)
	    i_10_ = 0;
	else if (i == 1)
	    i_10_ = 1;
	else if (2 == i)
	    i_10_ = 2;
	else
	    return;
	int i_11_;
	if (2.0 == (double) aFloat7526)
	    i_11_ = 0;
	else if (3.0 == (double) aFloat7526)
	    i_11_ = 1;
	else if (4.0 == (double) aFloat7526)
	    i_11_ = 2;
	else if (6.0 == (double) aFloat7526)
	    i_11_ = 3;
	else if ((double) aFloat7526 >= 8.0)
	    i_11_ = 4;
	else
	    return;
	Class614.aClass175_8040 = aClass175ArrayArray10637[i_10_][i_11_];
	Class525_Sub19.aClass7_10572 = aClass7ArrayArray10633[i_10_][i_11_];
    }
    
    static void method16404(Class182 class182, Class525_Sub37 class525_sub37,
			    Class287 class287) {
	Class157 class157 = class287.method5250(class182, -1799579825);
	if (null != class157) {
	    int i = class157.method2503();
	    if (class157.method2471() > i)
		i = class157.method2471();
	    int i_12_ = 10;
	    int i_13_ = -1279070887 * class525_sub37.anInt10827;
	    int i_14_ = 1255986271 * class525_sub37.anInt10828;
	    int i_15_ = 0;
	    int i_16_ = 0;
	    if (class287.aString3152 != null) {
		i_16_
		    = (Class525_Sub19.aClass7_10572.method594
		       (class287.aString3152, Class434.anInt4827 * -1445589163,
			0, null, -2136180344));
		i_15_ = (Class525_Sub19.aClass7_10572.method566
			 (class287.aString3152,
			  -1445589163 * Class434.anInt4827, null, 805534933));
	    }
	    int i_17_ = i / 2 + -1279070887 * class525_sub37.anInt10827;
	    int i_18_ = 1255986271 * class525_sub37.anInt10828;
	    if (i_13_ < anInt7525 + i) {
		i_13_ = anInt7525;
		i_17_ = 5 + (i_12_ + (i / 2 + anInt7525) + i_15_ / 2);
	    } else if (i_13_ > anInt7527 - i) {
		i_13_ = anInt7527 - i;
		i_17_ = anInt7527 - i / 2 - i_12_ - i_15_ / 2 - 5;
	    }
	    if (i_14_ < i + anInt7480) {
		i_14_ = anInt7480;
		i_18_ = i / 2 + (anInt7480 + i_12_);
	    } else if (i_14_ > anInt7528 - i) {
		i_14_ = anInt7528 - i;
		i_18_ = anInt7528 - i / 2 - i_12_ - i_16_;
	    }
	    int i_19_
		= ((int) (Math.atan2((double) (i_13_
					       - -1279070887 * (class525_sub37
								.anInt10827)),
				     (double) (i_14_
					       - (class525_sub37.anInt10828
						  * 1255986271)))
			  / 3.141592653589793 * 32767.0)
		   & 0xffff);
	    class157.method2487((float) i_13_ + (float) i / 2.0F,
				(float) i_14_ + (float) i / 2.0F, 4096, i_19_);
	    int i_20_ = -2;
	    int i_21_ = -2;
	    int i_22_ = -2;
	    int i_23_ = -2;
	    if (null != class287.aString3152) {
		i_20_ = i_17_ - i_15_ / 2 - 5;
		i_21_ = i_18_;
		i_22_ = 10 + (i_15_ + i_20_);
		i_23_ = 3 + (i_16_ + i_21_);
		if (0 != 1232481695 * class287.anInt3159)
		    class182.method3190(i_20_, i_21_, i_22_ - i_20_,
					i_23_ - i_21_,
					1232481695 * class287.anInt3159,
					(byte) -1);
		if (class287.anInt3160 * -1038283897 != 0)
		    class182.method3189(i_20_, i_21_, i_22_ - i_20_,
					i_23_ - i_21_,
					-1038283897 * class287.anInt3160,
					-752886503);
		Class614.aClass175_8040.method2839
		    (class287.aString3152, i_17_, i_18_, i_15_, i_16_,
		     ~0xffffff | class287.anInt3153 * -1507268529,
		     1087670703 * aClass623_7468.anInt8104, 1, 0, 0, null,
		     null, null, 0, 0, -56119976);
	    }
	    if (-1 != class287.anInt3150 * 1564425333
		|| null != class287.aString3152) {
		Class525_Sub9 class525_sub9
		    = new Class525_Sub9(class525_sub37);
		class525_sub9.anInt10496 = 647937669 * (i_13_ - i / 2);
		class525_sub9.anInt10497 = (i / 2 + i_13_) * 474907445;
		class525_sub9.anInt10498 = 1708619381 * (i_14_ - i);
		class525_sub9.anInt10499 = -828303603 * i_14_;
		class525_sub9.anInt10503 = 1492879441 * i_20_;
		class525_sub9.anInt10501 = i_22_ * -934959729;
		class525_sub9.anInt10500 = -66536729 * i_21_;
		class525_sub9.anInt10502 = 1554786835 * i_23_;
		Class447.aClass709_4900.method14345(class525_sub9, (byte) 0);
	    }
	}
    }
    
    static final void method16405(Class182 class182, int i, int i_24_,
				  int i_25_, int i_26_) {
	class182.method3184(i, i_24_, i + i_25_, i_26_ + i_24_);
	class182.method3190(i, i_24_, i_25_, i_26_, -16777216, (byte) -1);
	if (294186987 * anInt10625 >= 100) {
	    float f = (float) anInt7521 / (float) anInt7502;
	    int i_27_ = i_25_;
	    int i_28_ = i_26_;
	    if (f < 1.0F)
		i_28_ = (int) (f * (float) i_25_);
	    else
		i_27_ = (int) ((float) i_26_ / f);
	    i += (i_25_ - i_27_) / 2;
	    i_24_ += (i_26_ - i_28_) / 2;
	    if (Class604.aClass157_7958 == null
		|| Class604.aClass157_7958.method2503() != i_27_
		|| Class604.aClass157_7958.method2471() != i_28_) {
		aClass200_7496 = aClass200_7508;
		method9260(anInt7483, anInt7484 + anInt7521,
			   anInt7502 + anInt7483, anInt7484, i, i_24_,
			   i_27_ + i, i_28_ + i_24_);
		method9261(class182, false, false, client.aBool11230, true);
		class182.method3218();
		Class604.aClass157_7958
		    = class182.method3217(i, i_24_, i_27_, i_28_, true);
	    }
	    Class604.aClass157_7958.method2518(i, i_24_);
	    int i_29_ = i_27_ * (Class463.anInt5119 * 56690511) / anInt7502;
	    int i_30_
		= 1960864551 * Class696_Sub5.anInt10890 * i_28_ / anInt7521;
	    int i_31_ = i + client.anInt11396 * -525773749 * i_27_ / anInt7502;
	    int i_32_ = (i_24_ + i_28_
			 - i_28_ * (-655115223 * Class63.anInt692) / anInt7521
			 - i_30_);
	    int i_33_ = -1996554240;
	    if (Class668.aClass668_8577 == client.gametype)
		i_33_ = -1996488705;
	    class182.method3151(i_31_, i_32_, i_29_, i_30_, i_33_, 1);
	    class182.method3195(i_31_, i_32_, i_29_, i_30_, i_33_, 0);
	    for (Class525_Sub37 class525_sub37
		     = ((Class525_Sub37)
			aClass709_7473.method14372((short) -21504));
		 class525_sub37 != null;
		 class525_sub37 = ((Class525_Sub37)
				   aClass709_7473.method14353(-1122581426))) {
		Class287 class287
		    = ((Class287)
		       aClass40_Sub2_7464.method76(-480723851 * (class525_sub37
								 .anInt10825),
						   -1949862387));
		if (Class525_Sub42.method16881(class287, 1314892703)) {
		    Class34 class34
			= ((Class34)
			   aHashMap10646.get(Integer.valueOf((class525_sub37
							      .anInt10825)
							     * -480723851)));
		    if (null == class34)
			class34
			    = (Class34) (aHashMap10641.get
					 (Integer.valueOf(class287.anInt3192
							  * 433521613)));
		    if (class34 != null) {
			int i_34_;
			if (class34.anInt309 * -392080105
			    > -1987988059 * anInt10648 / 2)
			    i_34_ = ((-130814117 * anInt10648
				      - -1196178967 * class34.anInt309)
				     / (-1987988059 * anInt10648));
			else
			    i_34_ = (class34.anInt309 * -1196178967
				     / (anInt10648 * -1987988059));
			int i_35_
			    = (i_27_ * (1273194629 * class525_sub37.anInt10826)
			       / anInt7502) + i;
			int i_36_
			    = (i_24_
			       + ((anInt7521
				   - -1383897689 * class525_sub37.anInt10824)
				  * i_28_ / anInt7521));
			class182.method3190(i_35_ - 2, i_36_ - 2, 4, 4,
					    i_34_ << 24 | 0xffff00, (byte) -1);
		    }
		}
	    }
	    aClass200_7508.method3805(5, 1836314678);
	}
    }
    
    static final void method16406(Class182 class182, Textures class180) {
	if (100 != 294186987 * anInt10625
	    && null != aClass525_Sub16_Sub6_7469) {
	    Class251.method4508((byte) 8);
	    Class251.method4508((byte) 8);
	    if (anInt10625 * 294186987 < 10) {
		for (int i = 0; i < aClass175ArrayArray10637.length; i++) {
		    for (int i_37_ = 0;
			 i_37_ < aClass175ArrayArray10637[i].length; i_37_++) {
			Class462.idx_8.method7506
			    (aClass623_7468.anIntArrayArray8118[i][i_37_],
			     1239787496);
			Class276.aClass458_2875.method7506
			    (aClass623_7468.anIntArrayArray8118[i][i_37_],
			     538548307);
		    }
		}
		if (!aClass458_7471.method7486((aClass525_Sub16_Sub6_7469
						.aString11776),
					       1134894821)) {
		    anInt10625 = (Class597.idx_41.method7499
				  (aClass525_Sub16_Sub6_7469.aString11776,
				   -240817874)) / 10 * 587448515;
		    return;
		}
		anInt10625 = 1579517854;
	    }
	    if (10 == 294186987 * anInt10625) {
		anInt7483 = (aClass525_Sub16_Sub6_7469.anInt11773 * 920415765
			     >> 6 << 6);
		anInt7484 = (1559325441 * aClass525_Sub16_Sub6_7469.anInt11775
			     >> 6 << 6);
		anInt7502
		    = 64 + ((-1604213539 * aClass525_Sub16_Sub6_7469.anInt11774
			     >> 6 << 6)
			    - anInt7483);
		anInt7521
		    = 64 + ((aClass525_Sub16_Sub6_7469.anInt11772 * -1270260779
			     >> 6 << 6)
			    - anInt7484);
		int[] is = new int[3];
		int i = -1;
		int i_38_ = -1;
		Class446 class446
		    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818
		       ().aClass446_4807);
		Class600 class600
		    = client.aClass507_11137.method8350(1070501211);
		if (aClass525_Sub16_Sub6_7469.method18275
		    (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867,
		     (((int) class446.aFloat4895 >> 9)
		      + class600.anInt7858 * -1227002079),
		     (1429253007 * class600.anInt7860
		      + ((int) class446.aFloat4897 >> 9)),
		     is, -542419067)) {
		    i = is[1] - anInt7483;
		    i_38_ = is[2] - anInt7484;
		}
		if (!aBool10635 && i >= 0 && i < anInt7502 && i_38_ >= 0
		    && i_38_ < anInt7521) {
		    i += (int) (Math.random() * 10.0) - 5;
		    i_38_ += (int) (Math.random() * 10.0) - 5;
		    Class144_Sub1.anInt9141 = i * -1716705553;
		    Class696_Sub13.anInt10912 = i_38_ * -2002372447;
		} else if (-1 != -386625813 * anInt10619
			   && -269729169 * anInt10630 != -1) {
		    aClass525_Sub16_Sub6_7469.method18274((anInt10619
							   * -386625813),
							  (anInt10630
							   * -269729169),
							  is, 1856836812);
		    if (null != is) {
			Class144_Sub1.anInt9141
			    = (is[1] - anInt7483) * -1716705553;
			Class696_Sub13.anInt10912
			    = (is[2] - anInt7484) * -2002372447;
		    }
		    anInt10630 = 1228317553;
		    anInt10619 = 426071613;
		    aBool10635 = false;
		} else {
		    aClass525_Sub16_Sub6_7469.method18274
			((aClass525_Sub16_Sub6_7469.anInt11770 * -197349795
			  >> 14) & 0x3fff,
			 (aClass525_Sub16_Sub6_7469.anInt11770 * -197349795
			  & 0x3fff),
			 is, 1347869104);
		    Class144_Sub1.anInt9141
			= -1716705553 * (is[1] - anInt7483);
		    Class696_Sub13.anInt10912
			= -2002372447 * (is[2] - anInt7484);
		}
		if (25 == -368328657 * aClass525_Sub16_Sub6_7469.anInt11766) {
		    aFloat7479 = 2.0F;
		    aFloat7526 = 2.0F;
		} else if (-368328657 * aClass525_Sub16_Sub6_7469.anInt11766
			   == 37) {
		    aFloat7479 = 3.0F;
		    aFloat7526 = 3.0F;
		} else if (-368328657 * aClass525_Sub16_Sub6_7469.anInt11766
			   == 50) {
		    aFloat7479 = 4.0F;
		    aFloat7526 = 4.0F;
		} else if (75 == (aClass525_Sub16_Sub6_7469.anInt11766
				  * -368328657)) {
		    aFloat7479 = 6.0F;
		    aFloat7526 = 6.0F;
		} else if (100 == (-368328657
				   * aClass525_Sub16_Sub6_7469.anInt11766)) {
		    aFloat7479 = 8.0F;
		    aFloat7526 = 8.0F;
		} else if (aClass525_Sub16_Sub6_7469.anInt11766 * -368328657
			   == 200) {
		    aFloat7479 = 16.0F;
		    aFloat7526 = 16.0F;
		} else {
		    aFloat7479 = 8.0F;
		    aFloat7526 = 8.0F;
		}
		anInt7476 = (int) aFloat7526 >> 1;
		aByteArrayArrayArray7461
		    = Class239.method4421(anInt7476, 88021415);
		ConfigEntry.method1221(-1474174709);
		method9263();
		Class447.aClass709_4900 = new Class709();
		anInt7507 += (int) (Math.random() * 5.0) - 2;
		if (anInt7507 < -8)
		    anInt7507 = -8;
		if (anInt7507 > 8)
		    anInt7507 = 8;
		anInt7485 += (int) (Math.random() * 5.0) - 2;
		if (anInt7485 < -16)
		    anInt7485 = -16;
		if (anInt7485 > 16)
		    anInt7485 = 16;
		method9304(class180, anInt7507 >> 2 << 10, anInt7485 >> 1);
		aClass40_Sub2_7464.method17397(1024, 256, -615092481);
		aClass40_Sub17_7465.method17487(256, 256, 1544496110);
		aClass40_Sub11_7463.method1018(4096, (byte) -79);
		Class575.aClass40_Sub10_7647.method1018(256, (byte) 22);
		anInt10625 = -1135931588;
	    } else if (20 == anInt10625 * 294186987) {
		if (aBool7475) {
		    if (method9255(class182, anInt7507, anInt7485, aBool7475))
			anInt10625 = 887172532;
		} else {
		    Class585_Sub1.method16485(true, 334717456);
		    method9255(class182, anInt7507, anInt7485, aBool7475);
		    anInt10625 = 887172532;
		    Class585_Sub1.method16485(true, 1572015006);
		    Class473.method7753((byte) 2);
		}
	    } else if (60 == 294186987 * anInt10625) {
		if (aClass458_7471.method7493((aClass525_Sub16_Sub6_7469
					       .aString11776),
					      65280)) {
		    if (!aClass458_7471.method7486((aClass525_Sub16_Sub6_7469
						    .aString11776),
						   1086144760))
			return;
		    aClass529_7509
			= Class496.method8157(aClass458_7471,
					      (aClass525_Sub16_Sub6_7469
					       .aString11776),
					      client.aBool11230, -1541339678);
		} else
		    aClass529_7509 = new Class529(0);
		method9259();
		anInt10625 = -1828276910;
		Class585_Sub1.method16485(true, 1775372631);
		Class473.method7753((byte) 2);
	    } else if (anInt10625 * 294186987 >= 70) {
		for (int i = 0; i < 3; i++) {
		    for (int i_39_ = 0; i_39_ < 5; i_39_++) {
			if (aClass175ArrayArray10637[i][i_39_] == null
			    || null == aClass7ArrayArray10633[i][i_39_]) {
			    aClass175ArrayArray10637[i][i_39_]
				= (Class175) (Class7.aClass404_53.method6578
					      (client.anInterface50_11252,
					       (aClass623_7468
						.anIntArrayArray8118[i]
						[i_39_]),
					       true, true, -1909774244));
			    aClass7ArrayArray10633[i][i_39_]
				= (Class7.aClass404_53.method6580
				   (client.anInterface50_11252,
				    (aClass623_7468.anIntArrayArray8118[i]
				     [i_39_]),
				    1687792502));
			    if (aClass175ArrayArray10637[i][i_39_] != null
				&& null != aClass7ArrayArray10633[i][i_39_])
				anInt10625 += 1762345545;
			    else
				return;
			}
		    }
		}
		anInt10625 = -1384690644;
		System.gc();
	    }
	}
    }
    
    static {
	anInt10620 = 1547619761;
	anInt10636 = 1071507378;
	anInt10622 = -441311944;
	anInt10623 = -713897549;
	anInt10624 = -859919658;
	anInt10625 = 0;
	anInt10626 = -106402817;
	anInt10627 = 107721765;
	aBool10628 = false;
	anInt10619 = 426071613;
	anInt10630 = 1228317553;
	aBool10635 = false;
	aClass175ArrayArray10637 = new Class175[3][5];
	aClass7ArrayArray10633 = new Class7[3][5];
	aHashMap10646 = new HashMap();
	aHashMap10641 = new HashMap();
	anInt10632 = anInt10623 * 2091802645;
	anInt10648 = anInt10624 * 329547631;
	aBool10631 = false;
	aBool10639 = false;
	aClass10_10640 = new Class10(8);
	aClass10_10634 = new Class10(8);
	aClass699_10642 = new Class699(new Class709());
	aBool10638 = false;
	aBool10621 = false;
	aBool10645 = false;
	aBool10644 = false;
	aBool10647 = false;
	aBool10629 = false;
    }
    
    public static int method16407(int i, int i_40_, int i_41_) {
	if (anInt10625 * 294186987 < 100)
	    return -2;
	int i_42_ = -2;
	int i_43_ = 2147483647;
	int i_44_ = i_40_ - anInt7483;
	int i_45_ = i_41_ - anInt7484;
	for (Class525_Sub37 class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14372((short) -26009);
	     null != class525_sub37;
	     class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14353(-1570853234)) {
	    if (i == -480723851 * class525_sub37.anInt10825) {
		int i_46_ = class525_sub37.anInt10826 * 1273194629;
		int i_47_ = -1383897689 * class525_sub37.anInt10824;
		int i_48_ = anInt7483 + i_46_ << 14 | i_47_ + anInt7484;
		int i_49_ = ((i_44_ - i_46_) * (i_44_ - i_46_)
			     + (i_45_ - i_47_) * (i_45_ - i_47_));
		if (i_42_ < 0 || i_49_ < i_43_) {
		    i_42_ = i_48_;
		    i_43_ = i_49_;
		}
	    }
	}
	return i_42_;
    }
    
    static void method16408() {
	int i = -1;
	if (null != aClass525_Sub16_Sub6_7469)
	    i = 2044380983 * aClass525_Sub16_Sub6_7469.anInt11777;
	Class2.method528(1423333834);
	for (int i_50_ = 0; i_50_ < 3; i_50_++) {
	    for (int i_51_ = 0; i_51_ < 5; i_51_++) {
		aClass175ArrayArray10637[i_50_][i_51_] = null;
		aClass7ArrayArray10633[i_50_][i_51_] = null;
	    }
	}
	aClass525_Sub16_Sub6_7469 = null;
	if (i != -1)
	    Class372_Sub1.method15803(i, -1, -1, false, 65280);
    }
    
    static void method16409() {
	Class2.method528(1582754061);
	aClass525_Sub16_Sub6_7469 = null;
	Class182_Sub2.aClass525_Sub16_Sub6_9504 = null;
	aClass10_10640.method688((short) -5810);
	aClass10_10634.method688((short) 18701);
	for (int i = 0; i < 3; i++) {
	    for (int i_52_ = 0; i_52_ < 5; i_52_++) {
		aClass175ArrayArray10637[i][i_52_] = null;
		aClass7ArrayArray10633[i][i_52_] = null;
	    }
	}
    }
    
    static void method16410() {
	Class2.method528(2103722419);
	aClass525_Sub16_Sub6_7469 = null;
	Class182_Sub2.aClass525_Sub16_Sub6_9504 = null;
	aClass10_10640.method688((short) -22446);
	aClass10_10634.method688((short) -5003);
	for (int i = 0; i < 3; i++) {
	    for (int i_53_ = 0; i_53_ < 5; i_53_++) {
		aClass175ArrayArray10637[i][i_53_] = null;
		aClass7ArrayArray10633[i][i_53_] = null;
	    }
	}
    }
    
    static final void method16411(Class182 class182, int i, int i_54_,
				  int i_55_, int i_56_) {
	class182.method3184(i, i_54_, i + i_55_, i_56_ + i_54_);
	class182.method3190(i, i_54_, i_55_, i_56_, -16777216, (byte) -1);
	if (294186987 * anInt10625 >= 100) {
	    float f = (float) anInt7521 / (float) anInt7502;
	    int i_57_ = i_55_;
	    int i_58_ = i_56_;
	    if (f < 1.0F)
		i_58_ = (int) (f * (float) i_55_);
	    else
		i_57_ = (int) ((float) i_56_ / f);
	    i += (i_55_ - i_57_) / 2;
	    i_54_ += (i_56_ - i_58_) / 2;
	    if (Class604.aClass157_7958 == null
		|| Class604.aClass157_7958.method2503() != i_57_
		|| Class604.aClass157_7958.method2471() != i_58_) {
		aClass200_7496 = aClass200_7508;
		method9260(anInt7483, anInt7484 + anInt7521,
			   anInt7502 + anInt7483, anInt7484, i, i_54_,
			   i_57_ + i, i_58_ + i_54_);
		method9261(class182, false, false, client.aBool11230, true);
		class182.method3218();
		Class604.aClass157_7958
		    = class182.method3217(i, i_54_, i_57_, i_58_, true);
	    }
	    Class604.aClass157_7958.method2518(i, i_54_);
	    int i_59_ = i_57_ * (Class463.anInt5119 * 56690511) / anInt7502;
	    int i_60_
		= 1960864551 * Class696_Sub5.anInt10890 * i_58_ / anInt7521;
	    int i_61_ = i + client.anInt11396 * -525773749 * i_57_ / anInt7502;
	    int i_62_ = (i_54_ + i_58_
			 - i_58_ * (-655115223 * Class63.anInt692) / anInt7521
			 - i_60_);
	    int i_63_ = -1996554240;
	    if (Class668.aClass668_8577 == client.gametype)
		i_63_ = -1996488705;
	    class182.method3151(i_61_, i_62_, i_59_, i_60_, i_63_, 1);
	    class182.method3195(i_61_, i_62_, i_59_, i_60_, i_63_, 0);
	    for (Class525_Sub37 class525_sub37
		     = ((Class525_Sub37)
			aClass709_7473.method14372((short) -10208));
		 class525_sub37 != null;
		 class525_sub37 = ((Class525_Sub37)
				   aClass709_7473.method14353(-1179073055))) {
		Class287 class287
		    = ((Class287)
		       aClass40_Sub2_7464.method76(-480723851 * (class525_sub37
								 .anInt10825),
						   -1818442017));
		if (Class525_Sub42.method16881(class287, -434245435)) {
		    Class34 class34
			= ((Class34)
			   aHashMap10646.get(Integer.valueOf((class525_sub37
							      .anInt10825)
							     * -480723851)));
		    if (null == class34)
			class34
			    = (Class34) (aHashMap10641.get
					 (Integer.valueOf(class287.anInt3192
							  * 433521613)));
		    if (class34 != null) {
			int i_64_;
			if (class34.anInt309 * -392080105
			    > -1987988059 * anInt10648 / 2)
			    i_64_ = ((-130814117 * anInt10648
				      - -1196178967 * class34.anInt309)
				     / (-1987988059 * anInt10648));
			else
			    i_64_ = (class34.anInt309 * -1196178967
				     / (anInt10648 * -1987988059));
			int i_65_
			    = (i_57_ * (1273194629 * class525_sub37.anInt10826)
			       / anInt7502) + i;
			int i_66_
			    = (i_54_
			       + ((anInt7521
				   - -1383897689 * class525_sub37.anInt10824)
				  * i_58_ / anInt7521));
			class182.method3190(i_65_ - 2, i_66_ - 2, 4, 4,
					    i_64_ << 24 | 0xffff00, (byte) -1);
		    }
		}
	    }
	    aClass200_7508.method3805(5, 1873157370);
	}
    }
    
    static void method16412(Class182 class182, int i, int i_67_, int i_68_,
			    int i_69_) {
	class182.method3184(i, i_67_, i_68_ + i, i_67_ + i_69_);
	if (anInt10625 * 294186987 < 100) {
	    int i_70_ = 20;
	    int i_71_ = i + i_68_ / 2;
	    int i_72_ = i_67_ + i_69_ / 2 - 18 - i_70_;
	    class182.method3151(i, i_67_, i_68_, i_69_, -16777216, 0);
	    class182.method3195(i_71_ - 152, i_72_, 304, 34,
				client.aColorArray11070
				    [client.anInt11217 * 155153947].getRGB(),
				0);
	    class182.method3151(i_71_ - 150, i_72_ + 2, anInt10625 * 882560961,
				30,
				client.aColorArray11107
				    [client.anInt11217 * 155153947].getRGB(),
				0);
	    Class29.aClass175_294.method2838
		(Class53.aClass53_478.method1169(Class21.aClass666_213,
						 1552651121),
		 i_71_, i_70_ + i_72_,
		 client.aColorArray11109[155153947 * client.anInt11217]
		     .getRGB(),
		 -1, (byte) 103);
	} else {
	    int i_73_ = (Class144_Sub1.anInt9141 * 1318111247
			 - (int) ((float) i_68_ / aFloat7479));
	    int i_74_ = ((int) ((float) i_69_ / aFloat7479)
			 + 1586604897 * Class696_Sub13.anInt10912);
	    int i_75_ = ((int) ((float) i_68_ / aFloat7479)
			 + Class144_Sub1.anInt9141 * 1318111247);
	    int i_76_ = (Class696_Sub13.anInt10912 * 1586604897
			 - (int) ((float) i_69_ / aFloat7479));
	    client.anInt11396
		= -2132355741 * (Class144_Sub1.anInt9141 * 1318111247
				 - (int) ((float) i_68_ / aFloat7479));
	    Class63.anInt692
		= -1728995303 * (Class696_Sub13.anInt10912 * 1586604897
				 - (int) ((float) i_69_ / aFloat7479));
	    Class463.anInt5119
		= (int) ((float) (2 * i_68_) / aFloat7479) * -1656508497;
	    Class696_Sub5.anInt10890
		= 1523078295 * (int) ((float) (i_69_ * 2) / aFloat7479);
	    aClass200_7496 = aClass200_7486;
	    method9260(i_73_ + anInt7483, anInt7484 + i_74_, i_75_ + anInt7483,
		       i_76_ + anInt7484, i, i_67_, i_68_ + i,
		       i_67_ + i_69_ + 1);
	    method9261(class182, !aBool10644, !aBool10647, client.aBool11230,
		       false);
	    Class709 class709 = method9268(class182);
	    Class690.method14101(class182, class709, 0, 0, -727902931);
	    if (client.aBool11086) {
		int i_77_ = i + i_68_ - 5;
		int i_78_ = i_67_ + i_69_ - 8;
		Class29.aClass175_293.method2852
		    (new StringBuilder().append("Fps: ").append
			 (-300823033 * Class503.anInt5567).append
			 (" (").append
			 (1203003921 * Class503.anInt5595).append
			 (" ms)").toString(),
		     i_77_, i_78_, 16776960, -1, 2125395213);
		i_78_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_79_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_80_ = 16776960;
		if (i_79_ > 65536)
		    i_80_ = 16711680;
		Class29.aClass175_293.method2852(new StringBuilder().append
						     ("Mem:").append
						     (i_79_).append
						     ("k").toString(),
						 i_77_, i_78_, i_80_, -1,
						 1984915711);
		i_78_ -= 15;
	    }
	    aClass200_7486.method3805(5, 1936867970);
	}
    }
    
    static void method16413(Class182 class182, int i, int i_81_, int i_82_,
			    int i_83_) {
	class182.method3184(i, i_81_, i_82_ + i, i_81_ + i_83_);
	if (anInt10625 * 294186987 < 100) {
	    int i_84_ = 20;
	    int i_85_ = i + i_82_ / 2;
	    int i_86_ = i_81_ + i_83_ / 2 - 18 - i_84_;
	    class182.method3151(i, i_81_, i_82_, i_83_, -16777216, 0);
	    class182.method3195(i_85_ - 152, i_86_, 304, 34,
				client.aColorArray11070
				    [client.anInt11217 * 155153947].getRGB(),
				0);
	    class182.method3151(i_85_ - 150, i_86_ + 2, anInt10625 * 882560961,
				30,
				client.aColorArray11107
				    [client.anInt11217 * 155153947].getRGB(),
				0);
	    Class29.aClass175_294.method2838
		(Class53.aClass53_478.method1169(Class21.aClass666_213,
						 1552651121),
		 i_85_, i_84_ + i_86_,
		 client.aColorArray11109[155153947 * client.anInt11217]
		     .getRGB(),
		 -1, (byte) 22);
	} else {
	    int i_87_ = (Class144_Sub1.anInt9141 * 1318111247
			 - (int) ((float) i_82_ / aFloat7479));
	    int i_88_ = ((int) ((float) i_83_ / aFloat7479)
			 + 1586604897 * Class696_Sub13.anInt10912);
	    int i_89_ = ((int) ((float) i_82_ / aFloat7479)
			 + Class144_Sub1.anInt9141 * 1318111247);
	    int i_90_ = (Class696_Sub13.anInt10912 * 1586604897
			 - (int) ((float) i_83_ / aFloat7479));
	    client.anInt11396
		= -2132355741 * (Class144_Sub1.anInt9141 * 1318111247
				 - (int) ((float) i_82_ / aFloat7479));
	    Class63.anInt692
		= -1728995303 * (Class696_Sub13.anInt10912 * 1586604897
				 - (int) ((float) i_83_ / aFloat7479));
	    Class463.anInt5119
		= (int) ((float) (2 * i_82_) / aFloat7479) * -1656508497;
	    Class696_Sub5.anInt10890
		= 1523078295 * (int) ((float) (i_83_ * 2) / aFloat7479);
	    aClass200_7496 = aClass200_7486;
	    method9260(i_87_ + anInt7483, anInt7484 + i_88_, i_89_ + anInt7483,
		       i_90_ + anInt7484, i, i_81_, i_82_ + i,
		       i_81_ + i_83_ + 1);
	    method9261(class182, !aBool10644, !aBool10647, client.aBool11230,
		       false);
	    Class709 class709 = method9268(class182);
	    Class690.method14101(class182, class709, 0, 0, -727902931);
	    if (client.aBool11086) {
		int i_91_ = i + i_82_ - 5;
		int i_92_ = i_81_ + i_83_ - 8;
		Class29.aClass175_293.method2852
		    (new StringBuilder().append("Fps: ").append
			 (-300823033 * Class503.anInt5567).append
			 (" (").append
			 (1203003921 * Class503.anInt5595).append
			 (" ms)").toString(),
		     i_91_, i_92_, 16776960, -1, 2090364394);
		i_92_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_93_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_94_ = 16776960;
		if (i_93_ > 65536)
		    i_94_ = 16711680;
		Class29.aClass175_293.method2852(new StringBuilder().append
						     ("Mem:").append
						     (i_93_).append
						     ("k").toString(),
						 i_91_, i_92_, i_94_, -1,
						 2119653602);
		i_92_ -= 15;
	    }
	    aClass200_7486.method3805(5, 2033183915);
	}
    }
    
    static void method16414(Class182 class182, int i, int i_95_, int i_96_,
			    int i_97_) {
	class182.method3184(i, i_95_, i_96_ + i, i_95_ + i_97_);
	if (anInt10625 * 294186987 < 100) {
	    int i_98_ = 20;
	    int i_99_ = i + i_96_ / 2;
	    int i_100_ = i_95_ + i_97_ / 2 - 18 - i_98_;
	    class182.method3151(i, i_95_, i_96_, i_97_, -16777216, 0);
	    class182.method3195(i_99_ - 152, i_100_, 304, 34,
				client.aColorArray11070
				    [client.anInt11217 * 155153947].getRGB(),
				0);
	    class182.method3151(i_99_ - 150, i_100_ + 2,
				anInt10625 * 882560961, 30,
				client.aColorArray11107
				    [client.anInt11217 * 155153947].getRGB(),
				0);
	    Class29.aClass175_294.method2838
		(Class53.aClass53_478.method1169(Class21.aClass666_213,
						 1552651121),
		 i_99_, i_98_ + i_100_,
		 client.aColorArray11109[155153947 * client.anInt11217]
		     .getRGB(),
		 -1, (byte) 22);
	} else {
	    int i_101_ = (Class144_Sub1.anInt9141 * 1318111247
			  - (int) ((float) i_96_ / aFloat7479));
	    int i_102_ = ((int) ((float) i_97_ / aFloat7479)
			  + 1586604897 * Class696_Sub13.anInt10912);
	    int i_103_ = ((int) ((float) i_96_ / aFloat7479)
			  + Class144_Sub1.anInt9141 * 1318111247);
	    int i_104_ = (Class696_Sub13.anInt10912 * 1586604897
			  - (int) ((float) i_97_ / aFloat7479));
	    client.anInt11396
		= -2132355741 * (Class144_Sub1.anInt9141 * 1318111247
				 - (int) ((float) i_96_ / aFloat7479));
	    Class63.anInt692
		= -1728995303 * (Class696_Sub13.anInt10912 * 1586604897
				 - (int) ((float) i_97_ / aFloat7479));
	    Class463.anInt5119
		= (int) ((float) (2 * i_96_) / aFloat7479) * -1656508497;
	    Class696_Sub5.anInt10890
		= 1523078295 * (int) ((float) (i_97_ * 2) / aFloat7479);
	    aClass200_7496 = aClass200_7486;
	    method9260(i_101_ + anInt7483, anInt7484 + i_102_,
		       i_103_ + anInt7483, i_104_ + anInt7484, i, i_95_,
		       i_96_ + i, i_95_ + i_97_ + 1);
	    method9261(class182, !aBool10644, !aBool10647, client.aBool11230,
		       false);
	    Class709 class709 = method9268(class182);
	    Class690.method14101(class182, class709, 0, 0, -727902931);
	    if (client.aBool11086) {
		int i_105_ = i + i_96_ - 5;
		int i_106_ = i_95_ + i_97_ - 8;
		Class29.aClass175_293.method2852
		    (new StringBuilder().append("Fps: ").append
			 (-300823033 * Class503.anInt5567).append
			 (" (").append
			 (1203003921 * Class503.anInt5595).append
			 (" ms)").toString(),
		     i_105_, i_106_, 16776960, -1, 2003536217);
		i_106_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_107_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_108_ = 16776960;
		if (i_107_ > 65536)
		    i_108_ = 16711680;
		Class29.aClass175_293.method2852(new StringBuilder().append
						     ("Mem:").append
						     (i_107_).append
						     ("k").toString(),
						 i_105_, i_106_, i_108_, -1,
						 2010509486);
		i_106_ -= 15;
	    }
	    aClass200_7486.method3805(5, 2039025925);
	}
    }
    
    static boolean method16415(Class287 class287) {
	if (null == class287)
	    return false;
	if (null != class287.anIntArray3174) {
	    class287 = class287.method5232(anInterface20_7472,
					   anInterface18_7466, -2100421665);
	    if (null == class287)
		return false;
	}
	if (!class287.aBool3188)
	    return false;
	if (!class287.method5234(anInterface20_7472, anInterface18_7466,
				 (byte) -40))
	    return false;
	if (aClass10_10640.method684((long) (-1356678121 * class287.anInt3194))
	    != null)
	    return false;
	if (aClass10_10634.method684((long) (class287.anInt3192 * 433521613))
	    != null)
	    return false;
	if (class287.aString3152 != null) {
	    if (-436572411 * class287.anInt3149 == 0 && aBool10638)
		return false;
	    if (1 == -436572411 * class287.anInt3149 && aBool10621)
		return false;
	    if (-436572411 * class287.anInt3149 == 2 && aBool10645)
		return false;
	}
	return true;
    }
    
    public static void method16416(int i) {
	if (i < 1)
	    anInt10632 = 2091802645 * anInt10623;
	else
	    anInt10632 = 501736421 * i;
    }
    
    public static void method16417() {
	aHashMap10646.clear();
	aHashMap10641.clear();
    }
    
    public static int method16418(int i) {
	if (-410093193 * anInt10643 == i)
	    return aBool10629 ? 1 : 0;
	if (anInt10620 * -1628218543 == i)
	    return aBool10644 ? 1 : 0;
	if (i == 347888745 * anInt10636)
	    return aBool10647 ? 1 : 0;
	return -1;
    }
    
    public static void method16419(int i, int i_109_, int i_110_,
				   boolean bool) {
	Class525_Sub16_Sub6 class525_sub16_sub6 = aClass525_Sub16_Sub6_7469;
	method9315(i);
	aBool7475 = false;
	if (class525_sub16_sub6 != aClass525_Sub16_Sub6_7469)
	    Class2.method528(1520523707);
	anInt10619 = -426071613 * i_109_;
	anInt10630 = i_110_ * -1228317553;
	aBool10635 = bool;
    }
    
    static void method16420(Class182 class182, Class525_Sub37 class525_sub37,
			    Class287 class287) {
	Class157 class157 = class287.method5250(class182, -1799579825);
	if (null != class157) {
	    int i = class157.method2503();
	    if (class157.method2471() > i)
		i = class157.method2471();
	    int i_111_ = 10;
	    int i_112_ = -1279070887 * class525_sub37.anInt10827;
	    int i_113_ = 1255986271 * class525_sub37.anInt10828;
	    int i_114_ = 0;
	    int i_115_ = 0;
	    if (class287.aString3152 != null) {
		i_115_
		    = (Class525_Sub19.aClass7_10572.method594
		       (class287.aString3152, Class434.anInt4827 * -1445589163,
			0, null, -2099521109));
		i_114_ = (Class525_Sub19.aClass7_10572.method566
			  (class287.aString3152,
			   -1445589163 * Class434.anInt4827, null, 805534933));
	    }
	    int i_116_ = i / 2 + -1279070887 * class525_sub37.anInt10827;
	    int i_117_ = 1255986271 * class525_sub37.anInt10828;
	    if (i_112_ < anInt7525 + i) {
		i_112_ = anInt7525;
		i_116_ = 5 + (i_111_ + (i / 2 + anInt7525) + i_114_ / 2);
	    } else if (i_112_ > anInt7527 - i) {
		i_112_ = anInt7527 - i;
		i_116_ = anInt7527 - i / 2 - i_111_ - i_114_ / 2 - 5;
	    }
	    if (i_113_ < i + anInt7480) {
		i_113_ = anInt7480;
		i_117_ = i / 2 + (anInt7480 + i_111_);
	    } else if (i_113_ > anInt7528 - i) {
		i_113_ = anInt7528 - i;
		i_117_ = anInt7528 - i / 2 - i_111_ - i_115_;
	    }
	    int i_118_
		= ((int) (Math.atan2((double) (i_112_
					       - -1279070887 * (class525_sub37
								.anInt10827)),
				     (double) (i_113_
					       - (class525_sub37.anInt10828
						  * 1255986271)))
			  / 3.141592653589793 * 32767.0)
		   & 0xffff);
	    class157.method2487((float) i_112_ + (float) i / 2.0F,
				(float) i_113_ + (float) i / 2.0F, 4096,
				i_118_);
	    int i_119_ = -2;
	    int i_120_ = -2;
	    int i_121_ = -2;
	    int i_122_ = -2;
	    if (null != class287.aString3152) {
		i_119_ = i_116_ - i_114_ / 2 - 5;
		i_120_ = i_117_;
		i_121_ = 10 + (i_114_ + i_119_);
		i_122_ = 3 + (i_115_ + i_120_);
		if (0 != 1232481695 * class287.anInt3159)
		    class182.method3190(i_119_, i_120_, i_121_ - i_119_,
					i_122_ - i_120_,
					1232481695 * class287.anInt3159,
					(byte) -1);
		if (class287.anInt3160 * -1038283897 != 0)
		    class182.method3189(i_119_, i_120_, i_121_ - i_119_,
					i_122_ - i_120_,
					-1038283897 * class287.anInt3160,
					-1250591549);
		Class614.aClass175_8040.method2839
		    (class287.aString3152, i_116_, i_117_, i_114_, i_115_,
		     ~0xffffff | class287.anInt3153 * -1507268529,
		     1087670703 * aClass623_7468.anInt8104, 1, 0, 0, null,
		     null, null, 0, 0, -1662830315);
	    }
	    if (-1 != class287.anInt3150 * 1564425333
		|| null != class287.aString3152) {
		Class525_Sub9 class525_sub9
		    = new Class525_Sub9(class525_sub37);
		class525_sub9.anInt10496 = 647937669 * (i_112_ - i / 2);
		class525_sub9.anInt10497 = (i / 2 + i_112_) * 474907445;
		class525_sub9.anInt10498 = 1708619381 * (i_113_ - i);
		class525_sub9.anInt10499 = -828303603 * i_113_;
		class525_sub9.anInt10503 = 1492879441 * i_119_;
		class525_sub9.anInt10501 = i_121_ * -934959729;
		class525_sub9.anInt10500 = -66536729 * i_120_;
		class525_sub9.anInt10502 = 1554786835 * i_122_;
		Class447.aClass709_4900.method14345(class525_sub9, (byte) 0);
	    }
	}
    }
    
    static void method16421(int i) {
	int i_123_;
	if (i == 0)
	    i_123_ = 0;
	else if (i == 1)
	    i_123_ = 1;
	else if (2 == i)
	    i_123_ = 2;
	else
	    return;
	int i_124_;
	if (2.0 == (double) aFloat7526)
	    i_124_ = 0;
	else if (3.0 == (double) aFloat7526)
	    i_124_ = 1;
	else if (4.0 == (double) aFloat7526)
	    i_124_ = 2;
	else if (6.0 == (double) aFloat7526)
	    i_124_ = 3;
	else if ((double) aFloat7526 >= 8.0)
	    i_124_ = 4;
	else
	    return;
	Class614.aClass175_8040 = aClass175ArrayArray10637[i_123_][i_124_];
	Class525_Sub19.aClass7_10572 = aClass7ArrayArray10633[i_123_][i_124_];
    }
    
    static void method16422(int i) {
	int i_125_;
	if (i == 0)
	    i_125_ = 0;
	else if (i == 1)
	    i_125_ = 1;
	else if (2 == i)
	    i_125_ = 2;
	else
	    return;
	int i_126_;
	if (2.0 == (double) aFloat7526)
	    i_126_ = 0;
	else if (3.0 == (double) aFloat7526)
	    i_126_ = 1;
	else if (4.0 == (double) aFloat7526)
	    i_126_ = 2;
	else if (6.0 == (double) aFloat7526)
	    i_126_ = 3;
	else if ((double) aFloat7526 >= 8.0)
	    i_126_ = 4;
	else
	    return;
	Class614.aClass175_8040 = aClass175ArrayArray10637[i_125_][i_126_];
	Class525_Sub19.aClass7_10572 = aClass7ArrayArray10633[i_125_][i_126_];
    }
    
    public static void method16423(boolean bool) {
	aBool10631 = bool;
    }
    
    public static void method16424(int i, int i_127_, int i_128_,
				   boolean bool) {
	Class525_Sub16_Sub6 class525_sub16_sub6 = aClass525_Sub16_Sub6_7469;
	method9315(i);
	aBool7475 = false;
	if (class525_sub16_sub6 != aClass525_Sub16_Sub6_7469)
	    Class2.method528(1254649384);
	anInt10619 = -426071613 * i_127_;
	anInt10630 = i_128_ * -1228317553;
	aBool10635 = bool;
    }
    
    static final void method16425(Class182 class182, Textures class180) {
	if (100 != 294186987 * anInt10625
	    && null != aClass525_Sub16_Sub6_7469) {
	    Class251.method4508((byte) 8);
	    Class251.method4508((byte) 8);
	    if (anInt10625 * 294186987 < 10) {
		for (int i = 0; i < aClass175ArrayArray10637.length; i++) {
		    for (int i_129_ = 0;
			 i_129_ < aClass175ArrayArray10637[i].length;
			 i_129_++) {
			Class462.idx_8.method7506
			    (aClass623_7468.anIntArrayArray8118[i][i_129_],
			     252806454);
			Class276.aClass458_2875.method7506
			    (aClass623_7468.anIntArrayArray8118[i][i_129_],
			     1964797760);
		    }
		}
		if (!aClass458_7471.method7486((aClass525_Sub16_Sub6_7469
						.aString11776),
					       1304898489)) {
		    anInt10625 = (Class597.idx_41.method7499
				  (aClass525_Sub16_Sub6_7469.aString11776,
				   -1655532057)) / 10 * 587448515;
		    return;
		}
		anInt10625 = 1579517854;
	    }
	    if (10 == 294186987 * anInt10625) {
		anInt7483 = (aClass525_Sub16_Sub6_7469.anInt11773 * 920415765
			     >> 6 << 6);
		anInt7484 = (1559325441 * aClass525_Sub16_Sub6_7469.anInt11775
			     >> 6 << 6);
		anInt7502
		    = 64 + ((-1604213539 * aClass525_Sub16_Sub6_7469.anInt11774
			     >> 6 << 6)
			    - anInt7483);
		anInt7521
		    = 64 + ((aClass525_Sub16_Sub6_7469.anInt11772 * -1270260779
			     >> 6 << 6)
			    - anInt7484);
		int[] is = new int[3];
		int i = -1;
		int i_130_ = -1;
		Class446 class446
		    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818
		       ().aClass446_4807);
		Class600 class600
		    = client.aClass507_11137.method8350(951224567);
		if (aClass525_Sub16_Sub6_7469.method18275
		    (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867,
		     (((int) class446.aFloat4895 >> 9)
		      + class600.anInt7858 * -1227002079),
		     (1429253007 * class600.anInt7860
		      + ((int) class446.aFloat4897 >> 9)),
		     is, -373984703)) {
		    i = is[1] - anInt7483;
		    i_130_ = is[2] - anInt7484;
		}
		if (!aBool10635 && i >= 0 && i < anInt7502 && i_130_ >= 0
		    && i_130_ < anInt7521) {
		    i += (int) (Math.random() * 10.0) - 5;
		    i_130_ += (int) (Math.random() * 10.0) - 5;
		    Class144_Sub1.anInt9141 = i * -1716705553;
		    Class696_Sub13.anInt10912 = i_130_ * -2002372447;
		} else if (-1 != -386625813 * anInt10619
			   && -269729169 * anInt10630 != -1) {
		    aClass525_Sub16_Sub6_7469.method18274((anInt10619
							   * -386625813),
							  (anInt10630
							   * -269729169),
							  is, 1206212983);
		    if (null != is) {
			Class144_Sub1.anInt9141
			    = (is[1] - anInt7483) * -1716705553;
			Class696_Sub13.anInt10912
			    = (is[2] - anInt7484) * -2002372447;
		    }
		    anInt10630 = 1228317553;
		    anInt10619 = 426071613;
		    aBool10635 = false;
		} else {
		    aClass525_Sub16_Sub6_7469.method18274
			((aClass525_Sub16_Sub6_7469.anInt11770 * -197349795
			  >> 14) & 0x3fff,
			 (aClass525_Sub16_Sub6_7469.anInt11770 * -197349795
			  & 0x3fff),
			 is, 1978950566);
		    Class144_Sub1.anInt9141
			= -1716705553 * (is[1] - anInt7483);
		    Class696_Sub13.anInt10912
			= -2002372447 * (is[2] - anInt7484);
		}
		if (25 == -368328657 * aClass525_Sub16_Sub6_7469.anInt11766) {
		    aFloat7479 = 2.0F;
		    aFloat7526 = 2.0F;
		} else if (-368328657 * aClass525_Sub16_Sub6_7469.anInt11766
			   == 37) {
		    aFloat7479 = 3.0F;
		    aFloat7526 = 3.0F;
		} else if (-368328657 * aClass525_Sub16_Sub6_7469.anInt11766
			   == 50) {
		    aFloat7479 = 4.0F;
		    aFloat7526 = 4.0F;
		} else if (75 == (aClass525_Sub16_Sub6_7469.anInt11766
				  * -368328657)) {
		    aFloat7479 = 6.0F;
		    aFloat7526 = 6.0F;
		} else if (100 == (-368328657
				   * aClass525_Sub16_Sub6_7469.anInt11766)) {
		    aFloat7479 = 8.0F;
		    aFloat7526 = 8.0F;
		} else if (aClass525_Sub16_Sub6_7469.anInt11766 * -368328657
			   == 200) {
		    aFloat7479 = 16.0F;
		    aFloat7526 = 16.0F;
		} else {
		    aFloat7479 = 8.0F;
		    aFloat7526 = 8.0F;
		}
		anInt7476 = (int) aFloat7526 >> 1;
		aByteArrayArrayArray7461
		    = Class239.method4421(anInt7476, 1275773507);
		ConfigEntry.method1221(-1401564374);
		method9263();
		Class447.aClass709_4900 = new Class709();
		anInt7507 += (int) (Math.random() * 5.0) - 2;
		if (anInt7507 < -8)
		    anInt7507 = -8;
		if (anInt7507 > 8)
		    anInt7507 = 8;
		anInt7485 += (int) (Math.random() * 5.0) - 2;
		if (anInt7485 < -16)
		    anInt7485 = -16;
		if (anInt7485 > 16)
		    anInt7485 = 16;
		method9304(class180, anInt7507 >> 2 << 10, anInt7485 >> 1);
		aClass40_Sub2_7464.method17397(1024, 256, -615092481);
		aClass40_Sub17_7465.method17487(256, 256, 1595165082);
		aClass40_Sub11_7463.method1018(4096, (byte) -11);
		Class575.aClass40_Sub10_7647.method1018(256, (byte) -58);
		anInt10625 = -1135931588;
	    } else if (20 == anInt10625 * 294186987) {
		if (aBool7475) {
		    if (method9255(class182, anInt7507, anInt7485, aBool7475))
			anInt10625 = 887172532;
		} else {
		    Class585_Sub1.method16485(true, 265651782);
		    method9255(class182, anInt7507, anInt7485, aBool7475);
		    anInt10625 = 887172532;
		    Class585_Sub1.method16485(true, -2144304346);
		    Class473.method7753((byte) 2);
		}
	    } else if (60 == 294186987 * anInt10625) {
		if (aClass458_7471.method7493((aClass525_Sub16_Sub6_7469
					       .aString11776),
					      65280)) {
		    if (!aClass458_7471.method7486((aClass525_Sub16_Sub6_7469
						    .aString11776),
						   -289980259))
			return;
		    aClass529_7509
			= Class496.method8157(aClass458_7471,
					      (aClass525_Sub16_Sub6_7469
					       .aString11776),
					      client.aBool11230, -1725051459);
		} else
		    aClass529_7509 = new Class529(0);
		method9259();
		anInt10625 = -1828276910;
		Class585_Sub1.method16485(true, 912656756);
		Class473.method7753((byte) 2);
	    } else if (anInt10625 * 294186987 >= 70) {
		for (int i = 0; i < 3; i++) {
		    for (int i_131_ = 0; i_131_ < 5; i_131_++) {
			if (aClass175ArrayArray10637[i][i_131_] == null
			    || null == aClass7ArrayArray10633[i][i_131_]) {
			    aClass175ArrayArray10637[i][i_131_]
				= (Class175) (Class7.aClass404_53.method6578
					      (client.anInterface50_11252,
					       (aClass623_7468
						.anIntArrayArray8118[i]
						[i_131_]),
					       true, true, -1312066382));
			    aClass7ArrayArray10633[i][i_131_]
				= (Class7.aClass404_53.method6580
				   (client.anInterface50_11252,
				    (aClass623_7468.anIntArrayArray8118[i]
				     [i_131_]),
				    -1971733180));
			    if (aClass175ArrayArray10637[i][i_131_] != null
				&& null != aClass7ArrayArray10633[i][i_131_])
				anInt10625 += 1762345545;
			    else
				return;
			}
		    }
		}
		anInt10625 = -1384690644;
		System.gc();
	    }
	}
    }
    
    Class556_Sub1() throws Throwable {
	throw new Error();
    }
    
    static void method16426(boolean bool) {
	Class600 class600 = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				.method18623((byte) -19);
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = method9249(class600.anInt7858 * -1227002079,
			 1429253007 * class600.anInt7860);
	if (null == class525_sub16_sub6)
	    class525_sub16_sub6
		= method9289(aClass623_7468.anInt8120 * 1938296189);
	if (Class182_Sub2.aClass525_Sub16_Sub6_9504 != class525_sub16_sub6
	    || bool) {
	    Class182_Sub2.aClass525_Sub16_Sub6_9504 = class525_sub16_sub6;
	    boolean bool_132_ = method9248(class525_sub16_sub6);
	    if (bool_132_) {
		aBool7475 = true;
		Class2.method528(1330717288);
	    }
	}
    }
    
    static final void method16427(int i, int i_133_) {
	if (aFloat7479 < aFloat7526) {
	    aFloat7479 += (double) aFloat7479 / 30.0;
	    if (aFloat7479 > aFloat7526)
		aFloat7479 = aFloat7526;
	    ConfigEntry.method1221(-89238181);
	    anInt7476 = (int) aFloat7526 >> 1;
	    aByteArrayArrayArray7461
		= Class239.method4421(anInt7476, 809971490);
	} else if (aFloat7479 > aFloat7526) {
	    aFloat7479 -= (double) aFloat7479 / 30.0;
	    if (aFloat7479 < aFloat7526)
		aFloat7479 = aFloat7526;
	    ConfigEntry.method1221(-289773411);
	    anInt7476 = (int) aFloat7526 >> 1;
	    aByteArrayArrayArray7461
		= Class239.method4421(anInt7476, -1486565729);
	}
	if (-1 != -1489474559 * anInt10626 && -1 != anInt10627 * 1259518035) {
	    int i_134_ = (anInt10626 * -1489474559
			  - 1318111247 * Class144_Sub1.anInt9141);
	    if (i_134_ != 0)
		i_134_ /= Math.min(anInt10622 * 793654295, Math.abs(i_134_));
	    int i_135_ = (anInt10627 * 1259518035
			  - Class696_Sub13.anInt10912 * 1586604897);
	    if (i_135_ != 0)
		i_135_ /= Math.min(anInt10622 * 793654295, Math.abs(i_135_));
	    Class144_Sub1.anInt9141
		= -1716705553 * (1318111247 * Class144_Sub1.anInt9141
				 + i_134_);
	    Class696_Sub13.anInt10912
		= -2002372447 * (i_135_
				 + 1586604897 * Class696_Sub13.anInt10912);
	    if (0 == i_134_ && 0 == i_135_) {
		anInt10626 = -106402817;
		anInt10627 = 107721765;
	    }
	    ConfigEntry.method1221(-23491707);
	}
	Iterator iterator = aHashMap10646.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class34 class34
		= (Class34) ((Map.Entry) iterator.next()).getValue();
	    class34.anInt309 -= -1865076057;
	    if (class34.anInt309 * -392080105 == 0) {
		if (405163313 * class34.anInt308 <= 1 && !aBool10631)
		    iterator.remove();
		else {
		    class34.anInt308 -= -1173361711;
		    class34.anInt309 = anInt10648 * -77547357;
		}
	    }
	}
	iterator = aHashMap10641.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class34 class34
		= (Class34) ((Map.Entry) iterator.next()).getValue();
	    class34.anInt309 -= -1865076057;
	    if (0 == -392080105 * class34.anInt309) {
		if (class34.anInt308 * 405163313 <= 1 && !aBool10631)
		    iterator.remove();
		else {
		    class34.anInt308 -= -1173361711;
		    class34.anInt309 = -77547357 * anInt10648;
		}
	    }
	}
	if (aBool10628 && null != Class447.aClass709_4900) {
	    for (Class525_Sub9 class525_sub9
		     = ((Class525_Sub9)
			Class447.aClass709_4900.method14372((short) -10739));
		 class525_sub9 != null;
		 class525_sub9
		     = ((Class525_Sub9)
			Class447.aClass709_4900.method14353(-1248544194))) {
		Class287 class287
		    = ((Class287)
		       aClass40_Sub2_7464.method76((-480723851
						    * (class525_sub9
						       .aClass525_Sub37_10504
						       .anInt10825)),
						   369463196));
		if (class525_sub9.method16153(i, i_133_, (short) 12000)) {
		    if (null != class287.aStringArray3163) {
			if (null != class287.aStringArray3163[4])
			    Class564.method9454
				(class287.aStringArray3163[4],
				 class287.aString3191, -1, 1012, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 433521613 * class287.anInt3192, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) 31);
			if (class287.aStringArray3163[3] != null)
			    Class564.method9454
				(class287.aStringArray3163[3],
				 class287.aString3191, -1, 1011, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) 76);
			if (null != class287.aStringArray3163[2])
			    Class564.method9454
				(class287.aStringArray3163[2],
				 class287.aString3191, -1, 1010, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 false, (byte) 102);
			if (class287.aStringArray3163[1] != null)
			    Class564.method9454
				(class287.aStringArray3163[1],
				 class287.aString3191, -1, 1009, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 false, (byte) -26);
			if (null != class287.aStringArray3163[0])
			    Class564.method9454
				(class287.aStringArray3163[0],
				 class287.aString3191, -1, 1008, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 433521613 * class287.anInt3192, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) -16);
		    }
		    if (!class525_sub9.aClass525_Sub37_10504.aBool10829) {
			class525_sub9.aClass525_Sub37_10504.aBool10829 = true;
			Class396.method6536(Class578.aClass578_7655,
					    (class525_sub9
					     .aClass525_Sub37_10504
					     .anInt10825) * -480723851,
					    433521613 * class287.anInt3192,
					    1794548158);
		    }
		    if (class525_sub9.aClass525_Sub37_10504.aBool10829)
			Class396.method6536(Class578.aClass578_7657,
					    (-480723851
					     * (class525_sub9
						.aClass525_Sub37_10504
						.anInt10825)),
					    433521613 * class287.anInt3192,
					    335574161);
		} else if (class525_sub9.aClass525_Sub37_10504.aBool10829) {
		    class525_sub9.aClass525_Sub37_10504.aBool10829 = false;
		    Class396.method6536(Class578.aClass578_7656,
					-480723851 * (class525_sub9
						      .aClass525_Sub37_10504
						      .anInt10825),
					433521613 * class287.anInt3192,
					985921148);
		}
	    }
	}
    }
    
    static final void method16428(int i, int i_136_) {
	if (aFloat7479 < aFloat7526) {
	    aFloat7479 += (double) aFloat7479 / 30.0;
	    if (aFloat7479 > aFloat7526)
		aFloat7479 = aFloat7526;
	    ConfigEntry.method1221(181986773);
	    anInt7476 = (int) aFloat7526 >> 1;
	    aByteArrayArrayArray7461
		= Class239.method4421(anInt7476, -484528797);
	} else if (aFloat7479 > aFloat7526) {
	    aFloat7479 -= (double) aFloat7479 / 30.0;
	    if (aFloat7479 < aFloat7526)
		aFloat7479 = aFloat7526;
	    ConfigEntry.method1221(-1802684680);
	    anInt7476 = (int) aFloat7526 >> 1;
	    aByteArrayArrayArray7461
		= Class239.method4421(anInt7476, 1450863247);
	}
	if (-1 != -1489474559 * anInt10626 && -1 != anInt10627 * 1259518035) {
	    int i_137_ = (anInt10626 * -1489474559
			  - 1318111247 * Class144_Sub1.anInt9141);
	    if (i_137_ != 0)
		i_137_ /= Math.min(anInt10622 * 793654295, Math.abs(i_137_));
	    int i_138_ = (anInt10627 * 1259518035
			  - Class696_Sub13.anInt10912 * 1586604897);
	    if (i_138_ != 0)
		i_138_ /= Math.min(anInt10622 * 793654295, Math.abs(i_138_));
	    Class144_Sub1.anInt9141
		= -1716705553 * (1318111247 * Class144_Sub1.anInt9141
				 + i_137_);
	    Class696_Sub13.anInt10912
		= -2002372447 * (i_138_
				 + 1586604897 * Class696_Sub13.anInt10912);
	    if (0 == i_137_ && 0 == i_138_) {
		anInt10626 = -106402817;
		anInt10627 = 107721765;
	    }
	    ConfigEntry.method1221(-238213691);
	}
	Iterator iterator = aHashMap10646.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class34 class34
		= (Class34) ((Map.Entry) iterator.next()).getValue();
	    class34.anInt309 -= -1865076057;
	    if (class34.anInt309 * -392080105 == 0) {
		if (405163313 * class34.anInt308 <= 1 && !aBool10631)
		    iterator.remove();
		else {
		    class34.anInt308 -= -1173361711;
		    class34.anInt309 = anInt10648 * -77547357;
		}
	    }
	}
	iterator = aHashMap10641.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class34 class34
		= (Class34) ((Map.Entry) iterator.next()).getValue();
	    class34.anInt309 -= -1865076057;
	    if (0 == -392080105 * class34.anInt309) {
		if (class34.anInt308 * 405163313 <= 1 && !aBool10631)
		    iterator.remove();
		else {
		    class34.anInt308 -= -1173361711;
		    class34.anInt309 = -77547357 * anInt10648;
		}
	    }
	}
	if (aBool10628 && null != Class447.aClass709_4900) {
	    for (Class525_Sub9 class525_sub9
		     = ((Class525_Sub9)
			Class447.aClass709_4900.method14372((short) -24431));
		 class525_sub9 != null;
		 class525_sub9
		     = ((Class525_Sub9)
			Class447.aClass709_4900.method14353(-1952517188))) {
		Class287 class287
		    = ((Class287)
		       aClass40_Sub2_7464.method76((-480723851
						    * (class525_sub9
						       .aClass525_Sub37_10504
						       .anInt10825)),
						   -390591999));
		if (class525_sub9.method16153(i, i_136_, (short) 11856)) {
		    if (null != class287.aStringArray3163) {
			if (null != class287.aStringArray3163[4])
			    Class564.method9454
				(class287.aStringArray3163[4],
				 class287.aString3191, -1, 1012, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 433521613 * class287.anInt3192, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) -77);
			if (class287.aStringArray3163[3] != null)
			    Class564.method9454
				(class287.aStringArray3163[3],
				 class287.aString3191, -1, 1011, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) -67);
			if (null != class287.aStringArray3163[2])
			    Class564.method9454
				(class287.aStringArray3163[2],
				 class287.aString3191, -1, 1010, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 false, (byte) -18);
			if (class287.aStringArray3163[1] != null)
			    Class564.method9454
				(class287.aStringArray3163[1],
				 class287.aString3191, -1, 1009, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 false, (byte) 84);
			if (null != class287.aStringArray3163[0])
			    Class564.method9454
				(class287.aStringArray3163[0],
				 class287.aString3191, -1, 1008, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 433521613 * class287.anInt3192, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) 87);
		    }
		    if (!class525_sub9.aClass525_Sub37_10504.aBool10829) {
			class525_sub9.aClass525_Sub37_10504.aBool10829 = true;
			Class396.method6536(Class578.aClass578_7655,
					    (class525_sub9
					     .aClass525_Sub37_10504
					     .anInt10825) * -480723851,
					    433521613 * class287.anInt3192,
					    2010927416);
		    }
		    if (class525_sub9.aClass525_Sub37_10504.aBool10829)
			Class396.method6536(Class578.aClass578_7657,
					    (-480723851
					     * (class525_sub9
						.aClass525_Sub37_10504
						.anInt10825)),
					    433521613 * class287.anInt3192,
					    600529756);
		} else if (class525_sub9.aClass525_Sub37_10504.aBool10829) {
		    class525_sub9.aClass525_Sub37_10504.aBool10829 = false;
		    Class396.method6536(Class578.aClass578_7656,
					-480723851 * (class525_sub9
						      .aClass525_Sub37_10504
						      .anInt10825),
					433521613 * class287.anInt3192,
					509705140);
		}
	    }
	}
    }
    
    static final void method16429(int i, int i_139_) {
	if (aFloat7479 < aFloat7526) {
	    aFloat7479 += (double) aFloat7479 / 30.0;
	    if (aFloat7479 > aFloat7526)
		aFloat7479 = aFloat7526;
	    ConfigEntry.method1221(97208377);
	    anInt7476 = (int) aFloat7526 >> 1;
	    aByteArrayArrayArray7461
		= Class239.method4421(anInt7476, 1459384176);
	} else if (aFloat7479 > aFloat7526) {
	    aFloat7479 -= (double) aFloat7479 / 30.0;
	    if (aFloat7479 < aFloat7526)
		aFloat7479 = aFloat7526;
	    ConfigEntry.method1221(-1794575978);
	    anInt7476 = (int) aFloat7526 >> 1;
	    aByteArrayArrayArray7461
		= Class239.method4421(anInt7476, -2029152115);
	}
	if (-1 != -1489474559 * anInt10626 && -1 != anInt10627 * 1259518035) {
	    int i_140_ = (anInt10626 * -1489474559
			  - 1318111247 * Class144_Sub1.anInt9141);
	    if (i_140_ != 0)
		i_140_ /= Math.min(anInt10622 * 793654295, Math.abs(i_140_));
	    int i_141_ = (anInt10627 * 1259518035
			  - Class696_Sub13.anInt10912 * 1586604897);
	    if (i_141_ != 0)
		i_141_ /= Math.min(anInt10622 * 793654295, Math.abs(i_141_));
	    Class144_Sub1.anInt9141
		= -1716705553 * (1318111247 * Class144_Sub1.anInt9141
				 + i_140_);
	    Class696_Sub13.anInt10912
		= -2002372447 * (i_141_
				 + 1586604897 * Class696_Sub13.anInt10912);
	    if (0 == i_140_ && 0 == i_141_) {
		anInt10626 = -106402817;
		anInt10627 = 107721765;
	    }
	    ConfigEntry.method1221(358113308);
	}
	Iterator iterator = aHashMap10646.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class34 class34
		= (Class34) ((Map.Entry) iterator.next()).getValue();
	    class34.anInt309 -= -1865076057;
	    if (class34.anInt309 * -392080105 == 0) {
		if (405163313 * class34.anInt308 <= 1 && !aBool10631)
		    iterator.remove();
		else {
		    class34.anInt308 -= -1173361711;
		    class34.anInt309 = anInt10648 * -77547357;
		}
	    }
	}
	iterator = aHashMap10641.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class34 class34
		= (Class34) ((Map.Entry) iterator.next()).getValue();
	    class34.anInt309 -= -1865076057;
	    if (0 == -392080105 * class34.anInt309) {
		if (class34.anInt308 * 405163313 <= 1 && !aBool10631)
		    iterator.remove();
		else {
		    class34.anInt308 -= -1173361711;
		    class34.anInt309 = -77547357 * anInt10648;
		}
	    }
	}
	if (aBool10628 && null != Class447.aClass709_4900) {
	    for (Class525_Sub9 class525_sub9
		     = ((Class525_Sub9)
			Class447.aClass709_4900.method14372((short) -16651));
		 class525_sub9 != null;
		 class525_sub9
		     = ((Class525_Sub9)
			Class447.aClass709_4900.method14353(-1280401130))) {
		Class287 class287
		    = ((Class287)
		       aClass40_Sub2_7464.method76((-480723851
						    * (class525_sub9
						       .aClass525_Sub37_10504
						       .anInt10825)),
						   1325513534));
		if (class525_sub9.method16153(i, i_139_, (short) 8873)) {
		    if (null != class287.aStringArray3163) {
			if (null != class287.aStringArray3163[4])
			    Class564.method9454
				(class287.aStringArray3163[4],
				 class287.aString3191, -1, 1012, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 433521613 * class287.anInt3192, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) -18);
			if (class287.aStringArray3163[3] != null)
			    Class564.method9454
				(class287.aStringArray3163[3],
				 class287.aString3191, -1, 1011, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) 17);
			if (null != class287.aStringArray3163[2])
			    Class564.method9454
				(class287.aStringArray3163[2],
				 class287.aString3191, -1, 1010, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 false, (byte) -44);
			if (class287.aStringArray3163[1] != null)
			    Class564.method9454
				(class287.aStringArray3163[1],
				 class287.aString3191, -1, 1009, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 false, (byte) -26);
			if (null != class287.aStringArray3163[0])
			    Class564.method9454
				(class287.aStringArray3163[0],
				 class287.aString3191, -1, 1008, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 433521613 * class287.anInt3192, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) 15);
		    }
		    if (!class525_sub9.aClass525_Sub37_10504.aBool10829) {
			class525_sub9.aClass525_Sub37_10504.aBool10829 = true;
			Class396.method6536(Class578.aClass578_7655,
					    (class525_sub9
					     .aClass525_Sub37_10504
					     .anInt10825) * -480723851,
					    433521613 * class287.anInt3192,
					    -110162616);
		    }
		    if (class525_sub9.aClass525_Sub37_10504.aBool10829)
			Class396.method6536(Class578.aClass578_7657,
					    (-480723851
					     * (class525_sub9
						.aClass525_Sub37_10504
						.anInt10825)),
					    433521613 * class287.anInt3192,
					    607280300);
		} else if (class525_sub9.aClass525_Sub37_10504.aBool10829) {
		    class525_sub9.aClass525_Sub37_10504.aBool10829 = false;
		    Class396.method6536(Class578.aClass578_7656,
					-480723851 * (class525_sub9
						      .aClass525_Sub37_10504
						      .anInt10825),
					433521613 * class287.anInt3192,
					1491779527);
		}
	    }
	}
    }
    
    static final void method16430(int i, int i_142_) {
	if (aFloat7479 < aFloat7526) {
	    aFloat7479 += (double) aFloat7479 / 30.0;
	    if (aFloat7479 > aFloat7526)
		aFloat7479 = aFloat7526;
	    ConfigEntry.method1221(-1639721865);
	    anInt7476 = (int) aFloat7526 >> 1;
	    aByteArrayArrayArray7461
		= Class239.method4421(anInt7476, 360220097);
	} else if (aFloat7479 > aFloat7526) {
	    aFloat7479 -= (double) aFloat7479 / 30.0;
	    if (aFloat7479 < aFloat7526)
		aFloat7479 = aFloat7526;
	    ConfigEntry.method1221(-1067764561);
	    anInt7476 = (int) aFloat7526 >> 1;
	    aByteArrayArrayArray7461
		= Class239.method4421(anInt7476, 2074078285);
	}
	if (-1 != -1489474559 * anInt10626 && -1 != anInt10627 * 1259518035) {
	    int i_143_ = (anInt10626 * -1489474559
			  - 1318111247 * Class144_Sub1.anInt9141);
	    if (i_143_ != 0)
		i_143_ /= Math.min(anInt10622 * 793654295, Math.abs(i_143_));
	    int i_144_ = (anInt10627 * 1259518035
			  - Class696_Sub13.anInt10912 * 1586604897);
	    if (i_144_ != 0)
		i_144_ /= Math.min(anInt10622 * 793654295, Math.abs(i_144_));
	    Class144_Sub1.anInt9141
		= -1716705553 * (1318111247 * Class144_Sub1.anInt9141
				 + i_143_);
	    Class696_Sub13.anInt10912
		= -2002372447 * (i_144_
				 + 1586604897 * Class696_Sub13.anInt10912);
	    if (0 == i_143_ && 0 == i_144_) {
		anInt10626 = -106402817;
		anInt10627 = 107721765;
	    }
	    ConfigEntry.method1221(-2100980820);
	}
	Iterator iterator = aHashMap10646.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class34 class34
		= (Class34) ((Map.Entry) iterator.next()).getValue();
	    class34.anInt309 -= -1865076057;
	    if (class34.anInt309 * -392080105 == 0) {
		if (405163313 * class34.anInt308 <= 1 && !aBool10631)
		    iterator.remove();
		else {
		    class34.anInt308 -= -1173361711;
		    class34.anInt309 = anInt10648 * -77547357;
		}
	    }
	}
	iterator = aHashMap10641.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class34 class34
		= (Class34) ((Map.Entry) iterator.next()).getValue();
	    class34.anInt309 -= -1865076057;
	    if (0 == -392080105 * class34.anInt309) {
		if (class34.anInt308 * 405163313 <= 1 && !aBool10631)
		    iterator.remove();
		else {
		    class34.anInt308 -= -1173361711;
		    class34.anInt309 = -77547357 * anInt10648;
		}
	    }
	}
	if (aBool10628 && null != Class447.aClass709_4900) {
	    for (Class525_Sub9 class525_sub9
		     = ((Class525_Sub9)
			Class447.aClass709_4900.method14372((short) -13606));
		 class525_sub9 != null;
		 class525_sub9
		     = ((Class525_Sub9)
			Class447.aClass709_4900.method14353(-1220963454))) {
		Class287 class287
		    = ((Class287)
		       aClass40_Sub2_7464.method76((-480723851
						    * (class525_sub9
						       .aClass525_Sub37_10504
						       .anInt10825)),
						   -1120258868));
		if (class525_sub9.method16153(i, i_142_, (short) 31086)) {
		    if (null != class287.aStringArray3163) {
			if (null != class287.aStringArray3163[4])
			    Class564.method9454
				(class287.aStringArray3163[4],
				 class287.aString3191, -1, 1012, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 433521613 * class287.anInt3192, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) 102);
			if (class287.aStringArray3163[3] != null)
			    Class564.method9454
				(class287.aStringArray3163[3],
				 class287.aString3191, -1, 1011, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) 0);
			if (null != class287.aStringArray3163[2])
			    Class564.method9454
				(class287.aStringArray3163[2],
				 class287.aString3191, -1, 1010, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 false, (byte) 38);
			if (class287.aStringArray3163[1] != null)
			    Class564.method9454
				(class287.aStringArray3163[1],
				 class287.aString3191, -1, 1009, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 class287.anInt3192 * 433521613, 0, true,
				 false,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 false, (byte) 66);
			if (null != class287.aStringArray3163[0])
			    Class564.method9454
				(class287.aStringArray3163[0],
				 class287.aString3191, -1, 1008, -1,
				 (long) (-480723851
					 * (class525_sub9.aClass525_Sub37_10504
					    .anInt10825)),
				 433521613 * class287.anInt3192, 0, true,
				 false,
				 (long) ((class525_sub9.aClass525_Sub37_10504
					  .anInt10825)
					 * -480723851),
				 false, (byte) 40);
		    }
		    if (!class525_sub9.aClass525_Sub37_10504.aBool10829) {
			class525_sub9.aClass525_Sub37_10504.aBool10829 = true;
			Class396.method6536(Class578.aClass578_7655,
					    (class525_sub9
					     .aClass525_Sub37_10504
					     .anInt10825) * -480723851,
					    433521613 * class287.anInt3192,
					    588189673);
		    }
		    if (class525_sub9.aClass525_Sub37_10504.aBool10829)
			Class396.method6536(Class578.aClass578_7657,
					    (-480723851
					     * (class525_sub9
						.aClass525_Sub37_10504
						.anInt10825)),
					    433521613 * class287.anInt3192,
					    -447360689);
		} else if (class525_sub9.aClass525_Sub37_10504.aBool10829) {
		    class525_sub9.aClass525_Sub37_10504.aBool10829 = false;
		    Class396.method6536(Class578.aClass578_7656,
					-480723851 * (class525_sub9
						      .aClass525_Sub37_10504
						      .anInt10825),
					433521613 * class287.anInt3192,
					1834114026);
		}
	    }
	}
    }
    
    static void method16431(int i, int i_145_, int i_146_) {
	if (1008 == i)
	    Class396.method6536(Class578.aClass578_7669, i_145_, i_146_,
				2122705920);
	else if (i == 1009)
	    Class396.method6536(Class578.aClass578_7651, i_145_, i_146_,
				547666986);
	else if (i == 1010)
	    Class396.method6536(Class578.aClass578_7652, i_145_, i_146_,
				1088665205);
	else if (i == 1011)
	    Class396.method6536(Class578.aClass578_7653, i_145_, i_146_,
				903194514);
	else if (i == 1012)
	    Class396.method6536(Class578.aClass578_7664, i_145_, i_146_,
				585166418);
    }
    
    static void method16432(int i, int i_147_, int i_148_) {
	if (1008 == i)
	    Class396.method6536(Class578.aClass578_7669, i_147_, i_148_,
				92250596);
	else if (i == 1009)
	    Class396.method6536(Class578.aClass578_7651, i_147_, i_148_,
				-307871592);
	else if (i == 1010)
	    Class396.method6536(Class578.aClass578_7652, i_147_, i_148_,
				24991197);
	else if (i == 1011)
	    Class396.method6536(Class578.aClass578_7653, i_147_, i_148_,
				1746747671);
	else if (i == 1012)
	    Class396.method6536(Class578.aClass578_7664, i_147_, i_148_,
				21521169);
    }
    
    static void method16433(Class182 class182, Class525_Sub37 class525_sub37,
			    Class287 class287, int i, int i_149_, int i_150_,
			    int i_151_) {
	int i_152_ = i - 5;
	int i_153_ = 2 + i_149_;
	if (0 != class287.anInt3159 * 1232481695)
	    class182.method3190(i_152_, i_153_, i_151_ + 10,
				i_150_ + i_149_ - i_153_ + 1,
				1232481695 * class287.anInt3159, (byte) -1);
	if (class287.anInt3160 * -1038283897 != 0)
	    class182.method3189(i_152_, i_153_, i_151_ + 10,
				i_149_ + i_150_ - i_153_ + 1,
				class287.anInt3160 * -1038283897, -1744501385);
	int i_154_ = -1507268529 * class287.anInt3153;
	if (class525_sub37.aBool10829
	    && -1866284911 * class287.anInt3154 != -1)
	    i_154_ = class287.anInt3154 * -1866284911;
	Class614.aClass175_8040.method2839(class287.aString3152, i, i_149_,
					   i_151_, i_150_, ~0xffffff | i_154_,
					   (1087670703
					    * aClass623_7468.anInt8104),
					   1, 0, 0, null, null, null, 0, 0,
					   -849557177);
    }
    
    public static int method16434(int i, int i_155_, int i_156_) {
	if (anInt10625 * 294186987 < 100)
	    return -2;
	int i_157_ = -2;
	int i_158_ = 2147483647;
	int i_159_ = i_155_ - anInt7483;
	int i_160_ = i_156_ - anInt7484;
	for (Class525_Sub37 class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14372((short) -14836);
	     null != class525_sub37;
	     class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14353(-1902422979)) {
	    if (i == -480723851 * class525_sub37.anInt10825) {
		int i_161_ = class525_sub37.anInt10826 * 1273194629;
		int i_162_ = -1383897689 * class525_sub37.anInt10824;
		int i_163_ = anInt7483 + i_161_ << 14 | i_162_ + anInt7484;
		int i_164_ = ((i_159_ - i_161_) * (i_159_ - i_161_)
			      + (i_160_ - i_162_) * (i_160_ - i_162_));
		if (i_157_ < 0 || i_164_ < i_158_) {
		    i_157_ = i_163_;
		    i_158_ = i_164_;
		}
	    }
	}
	return i_157_;
    }
    
    public static void method16435() {
	Class231.method4391(true, -1162709656);
    }
    
    public static void method16436() {
	Class231.method4391(true, -386500547);
    }
    
    public static void method16437() {
	Class231.method4391(true, 133679495);
    }
    
    public static Class525_Sub16_Sub6 method16438() {
	return aClass525_Sub16_Sub6_7469;
    }
    
    static final void method16439(Class182 class182, Textures class180) {
	if (100 != 294186987 * anInt10625
	    && null != aClass525_Sub16_Sub6_7469) {
	    Class251.method4508((byte) 8);
	    Class251.method4508((byte) 8);
	    if (anInt10625 * 294186987 < 10) {
		for (int i = 0; i < aClass175ArrayArray10637.length; i++) {
		    for (int i_165_ = 0;
			 i_165_ < aClass175ArrayArray10637[i].length;
			 i_165_++) {
			Class462.idx_8.method7506
			    (aClass623_7468.anIntArrayArray8118[i][i_165_],
			     1357440877);
			Class276.aClass458_2875.method7506
			    (aClass623_7468.anIntArrayArray8118[i][i_165_],
			     1921891529);
		    }
		}
		if (!aClass458_7471.method7486((aClass525_Sub16_Sub6_7469
						.aString11776),
					       100560247)) {
		    anInt10625 = (Class597.idx_41.method7499
				  (aClass525_Sub16_Sub6_7469.aString11776,
				   149829583)) / 10 * 587448515;
		    return;
		}
		anInt10625 = 1579517854;
	    }
	    if (10 == 294186987 * anInt10625) {
		anInt7483 = (aClass525_Sub16_Sub6_7469.anInt11773 * 920415765
			     >> 6 << 6);
		anInt7484 = (1559325441 * aClass525_Sub16_Sub6_7469.anInt11775
			     >> 6 << 6);
		anInt7502
		    = 64 + ((-1604213539 * aClass525_Sub16_Sub6_7469.anInt11774
			     >> 6 << 6)
			    - anInt7483);
		anInt7521
		    = 64 + ((aClass525_Sub16_Sub6_7469.anInt11772 * -1270260779
			     >> 6 << 6)
			    - anInt7484);
		int[] is = new int[3];
		int i = -1;
		int i_166_ = -1;
		Class446 class446
		    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818
		       ().aClass446_4807);
		Class600 class600
		    = client.aClass507_11137.method8350(-1700594705);
		if (aClass525_Sub16_Sub6_7469.method18275
		    (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867,
		     (((int) class446.aFloat4895 >> 9)
		      + class600.anInt7858 * -1227002079),
		     (1429253007 * class600.anInt7860
		      + ((int) class446.aFloat4897 >> 9)),
		     is, -120651489)) {
		    i = is[1] - anInt7483;
		    i_166_ = is[2] - anInt7484;
		}
		if (!aBool10635 && i >= 0 && i < anInt7502 && i_166_ >= 0
		    && i_166_ < anInt7521) {
		    i += (int) (Math.random() * 10.0) - 5;
		    i_166_ += (int) (Math.random() * 10.0) - 5;
		    Class144_Sub1.anInt9141 = i * -1716705553;
		    Class696_Sub13.anInt10912 = i_166_ * -2002372447;
		} else if (-1 != -386625813 * anInt10619
			   && -269729169 * anInt10630 != -1) {
		    aClass525_Sub16_Sub6_7469.method18274((anInt10619
							   * -386625813),
							  (anInt10630
							   * -269729169),
							  is, 1442954616);
		    if (null != is) {
			Class144_Sub1.anInt9141
			    = (is[1] - anInt7483) * -1716705553;
			Class696_Sub13.anInt10912
			    = (is[2] - anInt7484) * -2002372447;
		    }
		    anInt10630 = 1228317553;
		    anInt10619 = 426071613;
		    aBool10635 = false;
		} else {
		    aClass525_Sub16_Sub6_7469.method18274
			((aClass525_Sub16_Sub6_7469.anInt11770 * -197349795
			  >> 14) & 0x3fff,
			 (aClass525_Sub16_Sub6_7469.anInt11770 * -197349795
			  & 0x3fff),
			 is, 1141847334);
		    Class144_Sub1.anInt9141
			= -1716705553 * (is[1] - anInt7483);
		    Class696_Sub13.anInt10912
			= -2002372447 * (is[2] - anInt7484);
		}
		if (25 == -368328657 * aClass525_Sub16_Sub6_7469.anInt11766) {
		    aFloat7479 = 2.0F;
		    aFloat7526 = 2.0F;
		} else if (-368328657 * aClass525_Sub16_Sub6_7469.anInt11766
			   == 37) {
		    aFloat7479 = 3.0F;
		    aFloat7526 = 3.0F;
		} else if (-368328657 * aClass525_Sub16_Sub6_7469.anInt11766
			   == 50) {
		    aFloat7479 = 4.0F;
		    aFloat7526 = 4.0F;
		} else if (75 == (aClass525_Sub16_Sub6_7469.anInt11766
				  * -368328657)) {
		    aFloat7479 = 6.0F;
		    aFloat7526 = 6.0F;
		} else if (100 == (-368328657
				   * aClass525_Sub16_Sub6_7469.anInt11766)) {
		    aFloat7479 = 8.0F;
		    aFloat7526 = 8.0F;
		} else if (aClass525_Sub16_Sub6_7469.anInt11766 * -368328657
			   == 200) {
		    aFloat7479 = 16.0F;
		    aFloat7526 = 16.0F;
		} else {
		    aFloat7479 = 8.0F;
		    aFloat7526 = 8.0F;
		}
		anInt7476 = (int) aFloat7526 >> 1;
		aByteArrayArrayArray7461
		    = Class239.method4421(anInt7476, -2093291172);
		ConfigEntry.method1221(-1021041371);
		method9263();
		Class447.aClass709_4900 = new Class709();
		anInt7507 += (int) (Math.random() * 5.0) - 2;
		if (anInt7507 < -8)
		    anInt7507 = -8;
		if (anInt7507 > 8)
		    anInt7507 = 8;
		anInt7485 += (int) (Math.random() * 5.0) - 2;
		if (anInt7485 < -16)
		    anInt7485 = -16;
		if (anInt7485 > 16)
		    anInt7485 = 16;
		method9304(class180, anInt7507 >> 2 << 10, anInt7485 >> 1);
		aClass40_Sub2_7464.method17397(1024, 256, -615092481);
		aClass40_Sub17_7465.method17487(256, 256, 1141919592);
		aClass40_Sub11_7463.method1018(4096, (byte) 31);
		Class575.aClass40_Sub10_7647.method1018(256, (byte) 81);
		anInt10625 = -1135931588;
	    } else if (20 == anInt10625 * 294186987) {
		if (aBool7475) {
		    if (method9255(class182, anInt7507, anInt7485, aBool7475))
			anInt10625 = 887172532;
		} else {
		    Class585_Sub1.method16485(true, 814162167);
		    method9255(class182, anInt7507, anInt7485, aBool7475);
		    anInt10625 = 887172532;
		    Class585_Sub1.method16485(true, -489379948);
		    Class473.method7753((byte) 2);
		}
	    } else if (60 == 294186987 * anInt10625) {
		if (aClass458_7471.method7493((aClass525_Sub16_Sub6_7469
					       .aString11776),
					      65280)) {
		    if (!aClass458_7471.method7486((aClass525_Sub16_Sub6_7469
						    .aString11776),
						   837455953))
			return;
		    aClass529_7509
			= Class496.method8157(aClass458_7471,
					      (aClass525_Sub16_Sub6_7469
					       .aString11776),
					      client.aBool11230, -1931626399);
		} else
		    aClass529_7509 = new Class529(0);
		method9259();
		anInt10625 = -1828276910;
		Class585_Sub1.method16485(true, 1023205289);
		Class473.method7753((byte) 2);
	    } else if (anInt10625 * 294186987 >= 70) {
		for (int i = 0; i < 3; i++) {
		    for (int i_167_ = 0; i_167_ < 5; i_167_++) {
			if (aClass175ArrayArray10637[i][i_167_] == null
			    || null == aClass7ArrayArray10633[i][i_167_]) {
			    aClass175ArrayArray10637[i][i_167_]
				= (Class175) (Class7.aClass404_53.method6578
					      (client.anInterface50_11252,
					       (aClass623_7468
						.anIntArrayArray8118[i]
						[i_167_]),
					       true, true, -1205641837));
			    aClass7ArrayArray10633[i][i_167_]
				= (Class7.aClass404_53.method6580
				   (client.anInterface50_11252,
				    (aClass623_7468.anIntArrayArray8118[i]
				     [i_167_]),
				    -1305237748));
			    if (aClass175ArrayArray10637[i][i_167_] != null
				&& null != aClass7ArrayArray10633[i][i_167_])
				anInt10625 += 1762345545;
			    else
				return;
			}
		    }
		}
		anInt10625 = -1384690644;
		System.gc();
	    }
	}
    }
    
    public static Class525_Sub16_Sub6 method16440() {
	return aClass525_Sub16_Sub6_7469;
    }
    
    static void method16441(boolean bool) {
	Class600 class600 = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				.method18623((byte) 14);
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = method9249(class600.anInt7858 * -1227002079,
			 1429253007 * class600.anInt7860);
	if (null == class525_sub16_sub6)
	    class525_sub16_sub6
		= method9289(aClass623_7468.anInt8120 * 1938296189);
	if (Class182_Sub2.aClass525_Sub16_Sub6_9504 != class525_sub16_sub6
	    || bool) {
	    Class182_Sub2.aClass525_Sub16_Sub6_9504 = class525_sub16_sub6;
	    boolean bool_168_ = method9248(class525_sub16_sub6);
	    if (bool_168_) {
		aBool7475 = true;
		Class2.method528(1468545287);
	    }
	}
    }
    
    static void method16442() {
	Class447.aClass709_4900 = null;
	anInt10625 = 0;
	anInt7517 = 0;
	Class562.aClass259_7558 = null;
	method9247();
	aClass709_7473.method14344(1987304494);
	aClass529_7509 = null;
	aClass200_7486.method3791((byte) -25);
	aClass200_7508.method3791((byte) -75);
	Class604.aClass157_7958 = null;
	anInt10626 = -106402817;
	anInt10627 = 107721765;
	if (aClass40_Sub2_7464 != null) {
	    aClass40_Sub2_7464.method1019(-496892446);
	    aClass40_Sub2_7464.method17397(128, 64, -615092481);
	}
	if (null != aClass40_Sub17_7465)
	    aClass40_Sub17_7465.method17487(64, 64, 2029169095);
	if (aClass40_Sub11_7463 != null)
	    aClass40_Sub11_7463.method1018(256, (byte) 84);
	Class575.aClass40_Sub10_7647.method1018(64, (byte) 77);
    }
    
    static void method16443(int i) {
	Class144_Sub1.anInt9141 = i * -1716705553;
	anInt10626 = -106402817;
	anInt10627 = 107721765;
	ConfigEntry.method1221(-1608559639);
    }
    
    static void method16444(int i) {
	Class696_Sub13.anInt10912 = i * -2002372447;
	anInt10627 = 107721765;
	anInt10627 = 107721765;
	ConfigEntry.method1221(-1993730239);
    }
    
    static final void method16445(Class182 class182, int i, int i_169_,
				  int i_170_, int i_171_) {
	class182.method3184(i, i_169_, i + i_170_, i_171_ + i_169_);
	class182.method3190(i, i_169_, i_170_, i_171_, -16777216, (byte) -1);
	if (294186987 * anInt10625 >= 100) {
	    float f = (float) anInt7521 / (float) anInt7502;
	    int i_172_ = i_170_;
	    int i_173_ = i_171_;
	    if (f < 1.0F)
		i_173_ = (int) (f * (float) i_170_);
	    else
		i_172_ = (int) ((float) i_171_ / f);
	    i += (i_170_ - i_172_) / 2;
	    i_169_ += (i_171_ - i_173_) / 2;
	    if (Class604.aClass157_7958 == null
		|| Class604.aClass157_7958.method2503() != i_172_
		|| Class604.aClass157_7958.method2471() != i_173_) {
		aClass200_7496 = aClass200_7508;
		method9260(anInt7483, anInt7484 + anInt7521,
			   anInt7502 + anInt7483, anInt7484, i, i_169_,
			   i_172_ + i, i_173_ + i_169_);
		method9261(class182, false, false, client.aBool11230, true);
		class182.method3218();
		Class604.aClass157_7958
		    = class182.method3217(i, i_169_, i_172_, i_173_, true);
	    }
	    Class604.aClass157_7958.method2518(i, i_169_);
	    int i_174_ = i_172_ * (Class463.anInt5119 * 56690511) / anInt7502;
	    int i_175_
		= 1960864551 * Class696_Sub5.anInt10890 * i_173_ / anInt7521;
	    int i_176_
		= i + client.anInt11396 * -525773749 * i_172_ / anInt7502;
	    int i_177_
		= (i_169_ + i_173_
		   - i_173_ * (-655115223 * Class63.anInt692) / anInt7521
		   - i_175_);
	    int i_178_ = -1996554240;
	    if (Class668.aClass668_8577 == client.gametype)
		i_178_ = -1996488705;
	    class182.method3151(i_176_, i_177_, i_174_, i_175_, i_178_, 1);
	    class182.method3195(i_176_, i_177_, i_174_, i_175_, i_178_, 0);
	    for (Class525_Sub37 class525_sub37
		     = ((Class525_Sub37)
			aClass709_7473.method14372((short) -20277));
		 class525_sub37 != null;
		 class525_sub37 = ((Class525_Sub37)
				   aClass709_7473.method14353(-1540803619))) {
		Class287 class287
		    = ((Class287)
		       aClass40_Sub2_7464.method76(-480723851 * (class525_sub37
								 .anInt10825),
						   -770223707));
		if (Class525_Sub42.method16881(class287, -194646332)) {
		    Class34 class34
			= ((Class34)
			   aHashMap10646.get(Integer.valueOf((class525_sub37
							      .anInt10825)
							     * -480723851)));
		    if (null == class34)
			class34
			    = (Class34) (aHashMap10641.get
					 (Integer.valueOf(class287.anInt3192
							  * 433521613)));
		    if (class34 != null) {
			int i_179_;
			if (class34.anInt309 * -392080105
			    > -1987988059 * anInt10648 / 2)
			    i_179_ = ((-130814117 * anInt10648
				       - -1196178967 * class34.anInt309)
				      / (-1987988059 * anInt10648));
			else
			    i_179_ = (class34.anInt309 * -1196178967
				      / (anInt10648 * -1987988059));
			int i_180_
			    = ((i_172_
				* (1273194629 * class525_sub37.anInt10826)
				/ anInt7502)
			       + i);
			int i_181_
			    = (i_169_
			       + ((anInt7521
				   - -1383897689 * class525_sub37.anInt10824)
				  * i_173_ / anInt7521));
			class182.method3190(i_180_ - 2, i_181_ - 2, 4, 4,
					    i_179_ << 24 | 0xffff00,
					    (byte) -1);
		    }
		}
	    }
	    aClass200_7508.method3805(5, 1862173185);
	}
    }
    
    static void method16446(int i) {
	Class696_Sub13.anInt10912 = i * -2002372447;
	anInt10627 = 107721765;
	anInt10627 = 107721765;
	ConfigEntry.method1221(-1886579416);
    }
    
    public static void method16447(int i) {
	if (25 == i)
	    aFloat7526 = 2.0F;
	else if (37 == i)
	    aFloat7526 = 3.0F;
	else if (50 == i)
	    aFloat7526 = 4.0F;
	else if (i == 75)
	    aFloat7526 = 6.0F;
	else if (100 == i)
	    aFloat7526 = 8.0F;
	else if (i == 200)
	    aFloat7526 = 16.0F;
	anInt10627 = 107721765;
	anInt10627 = 107721765;
    }
    
    public static void method16448(int i) {
	if (25 == i)
	    aFloat7526 = 2.0F;
	else if (37 == i)
	    aFloat7526 = 3.0F;
	else if (50 == i)
	    aFloat7526 = 4.0F;
	else if (i == 75)
	    aFloat7526 = 6.0F;
	else if (100 == i)
	    aFloat7526 = 8.0F;
	else if (i == 200)
	    aFloat7526 = 16.0F;
	anInt10627 = 107721765;
	anInt10627 = 107721765;
    }
    
    public static void method16449(int i) {
	if (25 == i)
	    aFloat7526 = 2.0F;
	else if (37 == i)
	    aFloat7526 = 3.0F;
	else if (50 == i)
	    aFloat7526 = 4.0F;
	else if (i == 75)
	    aFloat7526 = 6.0F;
	else if (100 == i)
	    aFloat7526 = 8.0F;
	else if (i == 200)
	    aFloat7526 = 16.0F;
	anInt10627 = 107721765;
	anInt10627 = 107721765;
    }
    
    static void method16450(int i, int i_182_, int i_183_, int i_184_) {
	float f = (float) anInt7521 / (float) anInt7502;
	int i_185_ = i_183_;
	int i_186_ = i_184_;
	if (f < 1.0F)
	    i_186_ = (int) ((float) i_183_ * f);
	else
	    i_185_ = (int) ((float) i_184_ / f);
	i -= (i_183_ - i_185_) / 2;
	i_182_ -= (i_184_ - i_186_) / 2;
	Class144_Sub1.anInt9141 = anInt7502 * i / i_185_ * -1716705553;
	Class696_Sub13.anInt10912
	    = (anInt7521 - anInt7521 * i_182_ / i_186_) * -2002372447;
	anInt10626 = -106402817;
	anInt10627 = 107721765;
	ConfigEntry.method1221(-168306429);
    }
    
    static void method16451(int i, int i_187_, int i_188_, int i_189_) {
	float f = (float) anInt7521 / (float) anInt7502;
	int i_190_ = i_188_;
	int i_191_ = i_189_;
	if (f < 1.0F)
	    i_191_ = (int) ((float) i_188_ * f);
	else
	    i_190_ = (int) ((float) i_189_ / f);
	i -= (i_188_ - i_190_) / 2;
	i_187_ -= (i_189_ - i_191_) / 2;
	Class144_Sub1.anInt9141 = anInt7502 * i / i_190_ * -1716705553;
	Class696_Sub13.anInt10912
	    = (anInt7521 - anInt7521 * i_187_ / i_191_) * -2002372447;
	anInt10626 = -106402817;
	anInt10627 = 107721765;
	ConfigEntry.method1221(498384422);
    }
    
    static boolean method16452(Class182 class182,
			       Class525_Sub37 class525_sub37,
			       Class287 class287, int i, int i_192_) {
	if (aBool7495 && !client.aBool11230
	    && !method9272(1273194629 * class525_sub37.anInt10826,
			   class525_sub37.anInt10824 * -1383897689))
	    return false;
	if (null != class287.anIntArray3174) {
	    class287 = class287.method5232(anInterface20_7472,
					   anInterface18_7466, -2100421665);
	    if (null == class287)
		return false;
	}
	int i_193_ = 2147483647;
	int i_194_ = -2147483648;
	int i_195_ = 2147483647;
	int i_196_ = -2147483648;
	if (null != class287.anIntArray3175) {
	    i_193_ = (anInt7525
		      + ((class287.anInt3176 * -218323365
			  + 1273194629 * class525_sub37.anInt10826 - anInt7489)
			 * (anInt7527 - anInt7525) / (anInt7523 - anInt7489)));
	    i_194_ = (((class287.anInt3178 * 1597685531
			+ 1273194629 * class525_sub37.anInt10826 - anInt7489)
		       * (anInt7527 - anInt7525) / (anInt7523 - anInt7489))
		      + anInt7525);
	    i_196_ = anInt7528 - ((-420580167 * class287.anInt3164
				   + class525_sub37.anInt10824 * -1383897689
				   - anInt7524)
				  * (anInt7528 - anInt7480)
				  / (anInt7522 - anInt7524));
	    i_195_ = anInt7528 - ((anInt7528 - anInt7480)
				  * (class287.anInt3179 * 443050347
				     + -1383897689 * class525_sub37.anInt10824
				     - anInt7524)
				  / (anInt7522 - anInt7524));
	}
	Class157 class157 = null;
	int i_197_ = 0;
	int i_198_ = 0;
	int i_199_ = 0;
	int i_200_ = 0;
	if (1564425333 * class287.anInt3150 != -1) {
	    if (class525_sub37.aBool10829
		&& class287.anInt3151 * 425207199 != -1)
		class157 = class287.method5235(class182, true, 430926630);
	    else
		class157 = class287.method5235(class182, false, 430926630);
	    if (class157 != null) {
		switch (class287.aClass275_3186.anInt2866 * 1165567667) {
		case 2:
		    i_197_ = (-1279070887 * class525_sub37.anInt10827
			      - (class157.method12() + 1 >> 1));
		    i_198_ = (class525_sub37.anInt10827 * -1279070887
			      + (class157.method12() + 1 >> 1));
		    break;
		case 0:
		    i_197_ = class525_sub37.anInt10827 * -1279070887;
		    i_198_ = (-1279070887 * class525_sub37.anInt10827
			      + class157.method12());
		    break;
		case 1:
		    i_197_ = (class525_sub37.anInt10827 * -1279070887
			      - class157.method12());
		    i_198_ = class525_sub37.anInt10827 * -1279070887;
		    break;
		}
		switch (class287.aClass272_3161.anInt2847 * 1302320603) {
		case 0:
		    i_199_ = (1255986271 * class525_sub37.anInt10828
			      - class157.method2472());
		    i_200_ = 1255986271 * class525_sub37.anInt10828;
		    break;
		case 1:
		    i_199_ = (1255986271 * class525_sub37.anInt10828
			      - (class157.method2472() + 1 >> 1));
		    i_200_ = (class525_sub37.anInt10828 * 1255986271
			      + (class157.method2472() + 1 >> 1));
		    break;
		case 2:
		    i_199_ = class525_sub37.anInt10828 * 1255986271;
		    i_200_ = (1255986271 * class525_sub37.anInt10828
			      + class157.method2472());
		    break;
		}
		if (i_197_ < i_193_)
		    i_193_ = i_197_;
		if (i_198_ > i_194_)
		    i_194_ = i_198_;
		if (i_199_ < i_195_)
		    i_195_ = i_199_;
		if (i_200_ > i_196_)
		    i_196_ = i_200_;
	    }
	}
	Class157 class157_201_ = null;
	if (-1 != 980209229 * class287.anInt3147)
	    class157_201_ = class287.method5236(class182, -1706897562);
	int i_202_ = 0;
	int i_203_ = 0;
	int i_204_ = 0;
	int i_205_ = 0;
	int i_206_ = 0;
	int i_207_ = 0;
	int i_208_ = 0;
	int i_209_ = 0;
	if (class287.aString3152 != null) {
	    Class650.method10714(class287.anInt3149 * -436572411, 1267171798);
	    if (Class614.aClass175_8040 != null) {
		i_209_
		    = (Class525_Sub19.aClass7_10572.method594
		       (class287.aString3152, Class434.anInt4827 * -1445589163,
			0, null, -2100092658));
		i_204_ = (Class525_Sub19.aClass7_10572.method566
			  (class287.aString3152,
			   Class434.anInt4827 * -1445589163, null, 805534933));
		i_202_ = (class525_sub37.anInt10827 * -1279070887 - i_204_ / 2
			  + (-1994938459 * class287.anInt3173
			     * (anInt7527 - anInt7525)
			     / (anInt7523 - anInt7489)));
		i_203_ = (class525_sub37.anInt10828 * 1255986271
			  - (class287.anInt3185 * -145778573
			     * (anInt7528 - anInt7480)
			     / (anInt7522 - anInt7524)));
		if (null == class157)
		    i_203_ -= i_209_ / 2;
		else
		    i_203_ -= (class157.method2472() >> 1) + i_209_;
		i_205_ = i_202_ + i;
		if (i_205_ < i_193_)
		    i_193_ = i_205_;
		i_206_ = i + (i_204_ + i_202_);
		if (i_206_ > i_194_)
		    i_194_ = i_206_;
		i_207_ = i_203_ + i_192_;
		if (i_207_ < i_195_)
		    i_195_ = i_207_;
		i_208_ = i_203_ + i_209_ + i_192_;
		if (i_208_ > i_196_)
		    i_196_ = i_208_;
	    }
	}
	if (i_194_ < anInt7525 || i_193_ > anInt7527 || i_196_ < anInt7480
	    || i_195_ > anInt7528)
	    return true;
	method9271(class182, class525_sub37, class287);
	if (class157 != null) {
	    int i_210_ = 0;
	    int i_211_ = 0;
	    int i_212_ = 0;
	    int i_213_ = 0;
	    int i_214_ = 0;
	    int i_215_ = 0;
	    switch (class287.aClass275_3186.anInt2866 * 1165567667) {
	    case 0:
		i_211_ = -(class157.method2503() + 1) / 2;
		break;
	    case 2:
		i_210_ = class157.method2503() / 2;
		i_212_ = class157.method12() >> 1;
		break;
	    case 1:
		i_210_ = class157.method2503();
		i_211_ = (class157.method2503() + 1) / 2;
		i_212_ = class157.method12();
		break;
	    }
	    switch (class287.aClass272_3161.anInt2847 * 1302320603) {
	    case 0:
		i_213_ = class157.method2503();
		i_214_ = (class157.method2503() + 1) / 2;
		i_215_ = class157.method2472();
		break;
	    case 2:
		i_214_ = -(class157.method2503() + 1) / 2;
		break;
	    case 1:
		i_213_ = class157.method2503() / 2;
		i_215_ = class157.method2472() >> 1;
		break;
	    }
	    Class34 class34
		= ((Class34)
		   aHashMap10646.get(Integer.valueOf(-480723851
						     * (class525_sub37
							.anInt10825))));
	    if (class34 == null)
		class34 = ((Class34)
			   aHashMap10641.get(Integer.valueOf(433521613
							     * (class287
								.anInt3192))));
	    if (null != class34 && class287.anInt3147 * 980209229 == -1) {
		int i_216_;
		if (class34.anInt309 * -392080105
		    > anInt10648 * -1987988059 / 2)
		    i_216_ = ((-130814117 * anInt10648
			       - class34.anInt309 * -1196178967)
			      / (anInt10648 * -1987988059));
		else
		    i_216_ = class34.anInt309 * -1196178967 / (anInt10648
							       * -1987988059);
		int i_217_ = i_216_ << 24 | 0xffff00;
		if (class182 instanceof Class182_Sub1) {
		    class182.method3190
			(class525_sub37.anInt10827 * -1279070887 - i_210_ - 7,
			 class525_sub37.anInt10828 * 1255986271 - i_213_ - 7,
			 class157.method2503() + 14,
			 class157.method2503() + 14, i_217_, (byte) -1);
		    class182.method3190
			(class525_sub37.anInt10827 * -1279070887 - i_210_ - 5,
			 class525_sub37.anInt10828 * 1255986271 - i_213_ - 5,
			 class157.method2503() + 10,
			 class157.method2503() + 10, i_217_, (byte) -1);
		    class182.method3190
			(-1279070887 * class525_sub37.anInt10827 - i_210_ - 3,
			 class525_sub37.anInt10828 * 1255986271 - i_213_ - 3,
			 class157.method2503() + 6, class157.method2503() + 6,
			 i_217_, (byte) -1);
		    class182.method3190
			(class525_sub37.anInt10827 * -1279070887 - i_210_ - 1,
			 1255986271 * class525_sub37.anInt10828 - i_213_ - 1,
			 class157.method2503() + 2, class157.method2503() + 2,
			 i_217_, (byte) -1);
		    class182.method3190
			(class525_sub37.anInt10827 * -1279070887 - i_210_,
			 class525_sub37.anInt10828 * 1255986271 - i_213_,
			 class157.method2503(), class157.method2503(), i_217_,
			 (byte) -1);
		} else {
		    class182.method3198
			(class525_sub37.anInt10827 * -1279070887 - i_211_,
			 class525_sub37.anInt10828 * 1255986271 - i_214_,
			 class157.method2503() / 2 + 7, i_217_, (byte) -1);
		    class182.method3198((class525_sub37.anInt10827
					 * -1279070887) - i_211_,
					(class525_sub37.anInt10828 * 1255986271
					 - i_214_ - i_214_) != 0 ? 1 : 0,
					class157.method2503() / 2 + 5, i_217_,
					(byte) -1);
		    class182.method3198((-1279070887
					 * class525_sub37.anInt10827) - i_211_,
					(1255986271 * class525_sub37.anInt10828
					 - i_214_ - i_214_) != 0 ? 1 : 0,
					class157.method2503() / 2 + 3, i_217_,
					(byte) -1);
		    class182.method3198
			(-1279070887 * class525_sub37.anInt10827 - i_211_,
			 0 != (class525_sub37.anInt10828 * 1255986271 - i_214_
			       - i_214_) ? 1 : 0,
			 class157.method2503() / 2 + 1, i_217_, (byte) -1);
		    class182.method3198
			(class525_sub37.anInt10827 * -1279070887 - i_211_,
			 0 != (class525_sub37.anInt10828 * 1255986271 - i_214_
			       - i_214_) ? 1 : 0,
			 class157.method2503() / 2, i_217_, (byte) -1);
		}
	    }
	    class157.method2518((class525_sub37.anInt10827 * -1279070887
				 - i_212_),
				(1255986271 * class525_sub37.anInt10828
				 - i_215_));
	    int i_218_ = 0;
	    int i_219_ = 0;
	    if (class34 != null && null != class157_201_) {
		switch (class287.aClass275_3186.anInt2866 * 1165567667) {
		case 2:
		    i_218_ = class157_201_.method12() >> 1;
		    break;
		case 1:
		    break;
		case 0:
		    i_218_ = class157_201_.method12();
		    break;
		}
		switch (1302320603 * class287.aClass272_3161.anInt2847) {
		case 1:
		    i_219_ = (class157_201_.method2472() / 2
			      + class157.method2472()) / 2;
		    break;
		case 2:
		    break;
		case 0:
		    i_219_ = (class157_201_.method2472()
			      + class157.method2472()) / 2;
		    break;
		}
		int i_220_;
		if (-392080105 * class34.anInt309
		    > anInt10648 * -1987988059 / 2)
		    i_220_ = ((-130814117 * anInt10648
			       - class34.anInt309 * -1196178967)
			      / (anInt10648 * -1987988059));
		else
		    i_220_ = class34.anInt309 * -1196178967 / (-1987988059
							       * anInt10648);
		int i_221_ = i_220_ << 24 | 0xffff00;
		class157_201_.method2479
		    (class525_sub37.anInt10827 * -1279070887 - i_218_,
		     1255986271 * class525_sub37.anInt10828 - i_219_, 0,
		     i_221_, 1);
	    }
	}
	if (class287.aString3152 != null && null != Class614.aClass175_8040)
	    Class32.method945(class182, class525_sub37, class287, i_202_,
			      i_203_, i_209_, i_204_, (short) -17481);
	if (class287.anInt3150 * 1564425333 != -1
	    || null != class287.aString3152) {
	    Class525_Sub9 class525_sub9 = new Class525_Sub9(class525_sub37);
	    class525_sub9.anInt10496 = i_197_ * 647937669;
	    class525_sub9.anInt10497 = 474907445 * i_198_;
	    class525_sub9.anInt10498 = i_199_ * 1708619381;
	    class525_sub9.anInt10499 = i_200_ * -828303603;
	    class525_sub9.anInt10503 = 1492879441 * i_205_;
	    class525_sub9.anInt10501 = i_206_ * -934959729;
	    class525_sub9.anInt10500 = i_207_ * -66536729;
	    class525_sub9.anInt10502 = 1554786835 * i_208_;
	    Class447.aClass709_4900.method14345(class525_sub9, (byte) 0);
	}
	return false;
    }
    
    static void method16453(int i, int i_222_, int i_223_, int i_224_) {
	float f = (float) anInt7521 / (float) anInt7502;
	int i_225_ = i_223_;
	int i_226_ = i_224_;
	if (f < 1.0F)
	    i_226_ = (int) ((float) i_223_ * f);
	else
	    i_225_ = (int) ((float) i_224_ / f);
	i -= (i_223_ - i_225_) / 2;
	i_222_ -= (i_224_ - i_226_) / 2;
	Class144_Sub1.anInt9141 = anInt7502 * i / i_225_ * -1716705553;
	Class696_Sub13.anInt10912
	    = (anInt7521 - anInt7521 * i_222_ / i_226_) * -2002372447;
	anInt10626 = -106402817;
	anInt10627 = 107721765;
	ConfigEntry.method1221(-80565881);
    }
    
    public static int method16454() {
	if ((double) aFloat7526 == 2.0)
	    return 25;
	if ((double) aFloat7526 == 3.0)
	    return 37;
	if ((double) aFloat7526 == 4.0)
	    return 50;
	if ((double) aFloat7526 == 6.0)
	    return 75;
	if (8.0 == (double) aFloat7526)
	    return 100;
	return 200;
    }
    
    public static int method16455() {
	if ((double) aFloat7526 == 2.0)
	    return 25;
	if ((double) aFloat7526 == 3.0)
	    return 37;
	if ((double) aFloat7526 == 4.0)
	    return 50;
	if ((double) aFloat7526 == 6.0)
	    return 75;
	if (8.0 == (double) aFloat7526)
	    return 100;
	return 200;
    }
    
    public static int method16456() {
	if ((double) aFloat7526 == 2.0)
	    return 25;
	if ((double) aFloat7526 == 3.0)
	    return 37;
	if ((double) aFloat7526 == 4.0)
	    return 50;
	if ((double) aFloat7526 == 6.0)
	    return 75;
	if (8.0 == (double) aFloat7526)
	    return 100;
	return 200;
    }
    
    public static void method16457(int i) {
	Class34 class34 = (Class34) aHashMap10646.get(Integer.valueOf(i));
	if (class34 == null)
	    class34 = new Class34();
	class34.anInt308 = anInt10632 * 344899965;
	class34.anInt309 = anInt10648 * -77547357;
	aHashMap10646.put(Integer.valueOf(i), class34);
    }
    
    public static void method16458(int i) {
	Class34 class34 = (Class34) aHashMap10646.get(Integer.valueOf(i));
	if (class34 == null)
	    class34 = new Class34();
	class34.anInt308 = anInt10632 * 344899965;
	class34.anInt309 = anInt10648 * -77547357;
	aHashMap10646.put(Integer.valueOf(i), class34);
    }
    
    public static void method16459(int i) {
	Class34 class34 = (Class34) aHashMap10641.get(Integer.valueOf(i));
	if (class34 == null)
	    class34 = new Class34();
	class34.anInt308 = anInt10632 * 344899965;
	class34.anInt309 = anInt10648 * -77547357;
	aHashMap10641.put(Integer.valueOf(i), class34);
    }
    
    public static void method16460(int i) {
	if (i < 1)
	    anInt10632 = 2091802645 * anInt10623;
	else
	    anInt10632 = 501736421 * i;
    }
    
    public static void method16461(int i) {
	if (i < 1)
	    anInt10632 = 2091802645 * anInt10623;
	else
	    anInt10632 = 501736421 * i;
    }
    
    static void method16462(int i) {
	Class696_Sub13.anInt10912 = i * -2002372447;
	anInt10627 = 107721765;
	anInt10627 = 107721765;
	ConfigEntry.method1221(-1012561447);
    }
    
    public static void method16463(int i) {
	if (i < 1)
	    anInt10648 = 329547631 * anInt10624;
	else
	    anInt10648 = i * 1777216045;
    }
    
    public static void method16464(int i) {
	if (i < 1)
	    anInt10648 = 329547631 * anInt10624;
	else
	    anInt10648 = i * 1777216045;
    }
    
    public static void method16465(int i) {
	if (i < 1)
	    anInt10648 = 329547631 * anInt10624;
	else
	    anInt10648 = i * 1777216045;
    }
    
    public static void method16466(boolean bool) {
	aBool10631 = bool;
    }
    
    public static boolean method16467(int i, boolean bool) {
	if (anInt10643 * -410093193 == i)
	    aBool10629 = bool;
	else if (-1628218543 * anInt10620 == i)
	    aBool10644 = bool;
	else if (i == anInt10636 * 347888745)
	    aBool10647 = bool;
	else
	    return false;
	return true;
    }
    
    public static void method16468(boolean bool) {
	aBool10631 = bool;
    }
    
    static void method16469(int i, int i_227_, int i_228_, int i_229_) {
	float f = (float) anInt7521 / (float) anInt7502;
	int i_230_ = i_228_;
	int i_231_ = i_229_;
	if (f < 1.0F)
	    i_231_ = (int) ((float) i_228_ * f);
	else
	    i_230_ = (int) ((float) i_229_ / f);
	i -= (i_228_ - i_230_) / 2;
	i_227_ -= (i_229_ - i_231_) / 2;
	Class144_Sub1.anInt9141 = anInt7502 * i / i_230_ * -1716705553;
	Class696_Sub13.anInt10912
	    = (anInt7521 - anInt7521 * i_227_ / i_231_) * -2002372447;
	anInt10626 = -106402817;
	anInt10627 = 107721765;
	ConfigEntry.method1221(-834706697);
    }
    
    static void method16470(Class182 class182, int i, int i_232_, int i_233_,
			    int i_234_) {
	class182.method3184(i, i_232_, i_233_ + i, i_232_ + i_234_);
	if (anInt10625 * 294186987 < 100) {
	    int i_235_ = 20;
	    int i_236_ = i + i_233_ / 2;
	    int i_237_ = i_232_ + i_234_ / 2 - 18 - i_235_;
	    class182.method3151(i, i_232_, i_233_, i_234_, -16777216, 0);
	    class182.method3195(i_236_ - 152, i_237_, 304, 34,
				client.aColorArray11070
				    [client.anInt11217 * 155153947].getRGB(),
				0);
	    class182.method3151(i_236_ - 150, i_237_ + 2,
				anInt10625 * 882560961, 30,
				client.aColorArray11107
				    [client.anInt11217 * 155153947].getRGB(),
				0);
	    Class29.aClass175_294.method2838
		(Class53.aClass53_478.method1169(Class21.aClass666_213,
						 1552651121),
		 i_236_, i_235_ + i_237_,
		 client.aColorArray11109[155153947 * client.anInt11217]
		     .getRGB(),
		 -1, (byte) 26);
	} else {
	    int i_238_ = (Class144_Sub1.anInt9141 * 1318111247
			  - (int) ((float) i_233_ / aFloat7479));
	    int i_239_ = ((int) ((float) i_234_ / aFloat7479)
			  + 1586604897 * Class696_Sub13.anInt10912);
	    int i_240_ = ((int) ((float) i_233_ / aFloat7479)
			  + Class144_Sub1.anInt9141 * 1318111247);
	    int i_241_ = (Class696_Sub13.anInt10912 * 1586604897
			  - (int) ((float) i_234_ / aFloat7479));
	    client.anInt11396
		= -2132355741 * (Class144_Sub1.anInt9141 * 1318111247
				 - (int) ((float) i_233_ / aFloat7479));
	    Class63.anInt692
		= -1728995303 * (Class696_Sub13.anInt10912 * 1586604897
				 - (int) ((float) i_234_ / aFloat7479));
	    Class463.anInt5119
		= (int) ((float) (2 * i_233_) / aFloat7479) * -1656508497;
	    Class696_Sub5.anInt10890
		= 1523078295 * (int) ((float) (i_234_ * 2) / aFloat7479);
	    aClass200_7496 = aClass200_7486;
	    method9260(i_238_ + anInt7483, anInt7484 + i_239_,
		       i_240_ + anInt7483, i_241_ + anInt7484, i, i_232_,
		       i_233_ + i, i_232_ + i_234_ + 1);
	    method9261(class182, !aBool10644, !aBool10647, client.aBool11230,
		       false);
	    Class709 class709 = method9268(class182);
	    Class690.method14101(class182, class709, 0, 0, -727902931);
	    if (client.aBool11086) {
		int i_242_ = i + i_233_ - 5;
		int i_243_ = i_232_ + i_234_ - 8;
		Class29.aClass175_293.method2852
		    (new StringBuilder().append("Fps: ").append
			 (-300823033 * Class503.anInt5567).append
			 (" (").append
			 (1203003921 * Class503.anInt5595).append
			 (" ms)").toString(),
		     i_242_, i_243_, 16776960, -1, 1975368526);
		i_243_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_244_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_245_ = 16776960;
		if (i_244_ > 65536)
		    i_245_ = 16711680;
		Class29.aClass175_293.method2852(new StringBuilder().append
						     ("Mem:").append
						     (i_244_).append
						     ("k").toString(),
						 i_242_, i_243_, i_245_, -1,
						 2021860975);
		i_243_ -= 15;
	    }
	    aClass200_7486.method3805(5, 1967215072);
	}
    }
    
    static boolean method16471(Class182 class182,
			       Class525_Sub37 class525_sub37,
			       Class287 class287, int i, int i_246_) {
	if (aBool7495 && !client.aBool11230
	    && !method9272(1273194629 * class525_sub37.anInt10826,
			   class525_sub37.anInt10824 * -1383897689))
	    return false;
	if (null != class287.anIntArray3174) {
	    class287 = class287.method5232(anInterface20_7472,
					   anInterface18_7466, -2100421665);
	    if (null == class287)
		return false;
	}
	int i_247_ = 2147483647;
	int i_248_ = -2147483648;
	int i_249_ = 2147483647;
	int i_250_ = -2147483648;
	if (null != class287.anIntArray3175) {
	    i_247_ = (anInt7525
		      + ((class287.anInt3176 * -218323365
			  + 1273194629 * class525_sub37.anInt10826 - anInt7489)
			 * (anInt7527 - anInt7525) / (anInt7523 - anInt7489)));
	    i_248_ = (((class287.anInt3178 * 1597685531
			+ 1273194629 * class525_sub37.anInt10826 - anInt7489)
		       * (anInt7527 - anInt7525) / (anInt7523 - anInt7489))
		      + anInt7525);
	    i_250_ = anInt7528 - ((-420580167 * class287.anInt3164
				   + class525_sub37.anInt10824 * -1383897689
				   - anInt7524)
				  * (anInt7528 - anInt7480)
				  / (anInt7522 - anInt7524));
	    i_249_ = anInt7528 - ((anInt7528 - anInt7480)
				  * (class287.anInt3179 * 443050347
				     + -1383897689 * class525_sub37.anInt10824
				     - anInt7524)
				  / (anInt7522 - anInt7524));
	}
	Class157 class157 = null;
	int i_251_ = 0;
	int i_252_ = 0;
	int i_253_ = 0;
	int i_254_ = 0;
	if (1564425333 * class287.anInt3150 != -1) {
	    if (class525_sub37.aBool10829
		&& class287.anInt3151 * 425207199 != -1)
		class157 = class287.method5235(class182, true, 430926630);
	    else
		class157 = class287.method5235(class182, false, 430926630);
	    if (class157 != null) {
		switch (class287.aClass275_3186.anInt2866 * 1165567667) {
		case 2:
		    i_251_ = (-1279070887 * class525_sub37.anInt10827
			      - (class157.method12() + 1 >> 1));
		    i_252_ = (class525_sub37.anInt10827 * -1279070887
			      + (class157.method12() + 1 >> 1));
		    break;
		case 0:
		    i_251_ = class525_sub37.anInt10827 * -1279070887;
		    i_252_ = (-1279070887 * class525_sub37.anInt10827
			      + class157.method12());
		    break;
		case 1:
		    i_251_ = (class525_sub37.anInt10827 * -1279070887
			      - class157.method12());
		    i_252_ = class525_sub37.anInt10827 * -1279070887;
		    break;
		}
		switch (class287.aClass272_3161.anInt2847 * 1302320603) {
		case 0:
		    i_253_ = (1255986271 * class525_sub37.anInt10828
			      - class157.method2472());
		    i_254_ = 1255986271 * class525_sub37.anInt10828;
		    break;
		case 1:
		    i_253_ = (1255986271 * class525_sub37.anInt10828
			      - (class157.method2472() + 1 >> 1));
		    i_254_ = (class525_sub37.anInt10828 * 1255986271
			      + (class157.method2472() + 1 >> 1));
		    break;
		case 2:
		    i_253_ = class525_sub37.anInt10828 * 1255986271;
		    i_254_ = (1255986271 * class525_sub37.anInt10828
			      + class157.method2472());
		    break;
		}
		if (i_251_ < i_247_)
		    i_247_ = i_251_;
		if (i_252_ > i_248_)
		    i_248_ = i_252_;
		if (i_253_ < i_249_)
		    i_249_ = i_253_;
		if (i_254_ > i_250_)
		    i_250_ = i_254_;
	    }
	}
	Class157 class157_255_ = null;
	if (-1 != 980209229 * class287.anInt3147)
	    class157_255_ = class287.method5236(class182, 1023036432);
	int i_256_ = 0;
	int i_257_ = 0;
	int i_258_ = 0;
	int i_259_ = 0;
	int i_260_ = 0;
	int i_261_ = 0;
	int i_262_ = 0;
	int i_263_ = 0;
	if (class287.aString3152 != null) {
	    Class650.method10714(class287.anInt3149 * -436572411, 1973217652);
	    if (Class614.aClass175_8040 != null) {
		i_263_
		    = (Class525_Sub19.aClass7_10572.method594
		       (class287.aString3152, Class434.anInt4827 * -1445589163,
			0, null, -2132980825));
		i_258_ = (Class525_Sub19.aClass7_10572.method566
			  (class287.aString3152,
			   Class434.anInt4827 * -1445589163, null, 805534933));
		i_256_ = (class525_sub37.anInt10827 * -1279070887 - i_258_ / 2
			  + (-1994938459 * class287.anInt3173
			     * (anInt7527 - anInt7525)
			     / (anInt7523 - anInt7489)));
		i_257_ = (class525_sub37.anInt10828 * 1255986271
			  - (class287.anInt3185 * -145778573
			     * (anInt7528 - anInt7480)
			     / (anInt7522 - anInt7524)));
		if (null == class157)
		    i_257_ -= i_263_ / 2;
		else
		    i_257_ -= (class157.method2472() >> 1) + i_263_;
		i_259_ = i_256_ + i;
		if (i_259_ < i_247_)
		    i_247_ = i_259_;
		i_260_ = i + (i_258_ + i_256_);
		if (i_260_ > i_248_)
		    i_248_ = i_260_;
		i_261_ = i_257_ + i_246_;
		if (i_261_ < i_249_)
		    i_249_ = i_261_;
		i_262_ = i_257_ + i_263_ + i_246_;
		if (i_262_ > i_250_)
		    i_250_ = i_262_;
	    }
	}
	if (i_248_ < anInt7525 || i_247_ > anInt7527 || i_250_ < anInt7480
	    || i_249_ > anInt7528)
	    return true;
	method9271(class182, class525_sub37, class287);
	if (class157 != null) {
	    int i_264_ = 0;
	    int i_265_ = 0;
	    int i_266_ = 0;
	    int i_267_ = 0;
	    int i_268_ = 0;
	    int i_269_ = 0;
	    switch (class287.aClass275_3186.anInt2866 * 1165567667) {
	    case 0:
		i_265_ = -(class157.method2503() + 1) / 2;
		break;
	    case 2:
		i_264_ = class157.method2503() / 2;
		i_266_ = class157.method12() >> 1;
		break;
	    case 1:
		i_264_ = class157.method2503();
		i_265_ = (class157.method2503() + 1) / 2;
		i_266_ = class157.method12();
		break;
	    }
	    switch (class287.aClass272_3161.anInt2847 * 1302320603) {
	    case 0:
		i_267_ = class157.method2503();
		i_268_ = (class157.method2503() + 1) / 2;
		i_269_ = class157.method2472();
		break;
	    case 2:
		i_268_ = -(class157.method2503() + 1) / 2;
		break;
	    case 1:
		i_267_ = class157.method2503() / 2;
		i_269_ = class157.method2472() >> 1;
		break;
	    }
	    Class34 class34
		= ((Class34)
		   aHashMap10646.get(Integer.valueOf(-480723851
						     * (class525_sub37
							.anInt10825))));
	    if (class34 == null)
		class34 = ((Class34)
			   aHashMap10641.get(Integer.valueOf(433521613
							     * (class287
								.anInt3192))));
	    if (null != class34 && class287.anInt3147 * 980209229 == -1) {
		int i_270_;
		if (class34.anInt309 * -392080105
		    > anInt10648 * -1987988059 / 2)
		    i_270_ = ((-130814117 * anInt10648
			       - class34.anInt309 * -1196178967)
			      / (anInt10648 * -1987988059));
		else
		    i_270_ = class34.anInt309 * -1196178967 / (anInt10648
							       * -1987988059);
		int i_271_ = i_270_ << 24 | 0xffff00;
		if (class182 instanceof Class182_Sub1) {
		    class182.method3190
			(class525_sub37.anInt10827 * -1279070887 - i_264_ - 7,
			 class525_sub37.anInt10828 * 1255986271 - i_267_ - 7,
			 class157.method2503() + 14,
			 class157.method2503() + 14, i_271_, (byte) -1);
		    class182.method3190
			(class525_sub37.anInt10827 * -1279070887 - i_264_ - 5,
			 class525_sub37.anInt10828 * 1255986271 - i_267_ - 5,
			 class157.method2503() + 10,
			 class157.method2503() + 10, i_271_, (byte) -1);
		    class182.method3190
			(-1279070887 * class525_sub37.anInt10827 - i_264_ - 3,
			 class525_sub37.anInt10828 * 1255986271 - i_267_ - 3,
			 class157.method2503() + 6, class157.method2503() + 6,
			 i_271_, (byte) -1);
		    class182.method3190
			(class525_sub37.anInt10827 * -1279070887 - i_264_ - 1,
			 1255986271 * class525_sub37.anInt10828 - i_267_ - 1,
			 class157.method2503() + 2, class157.method2503() + 2,
			 i_271_, (byte) -1);
		    class182.method3190
			(class525_sub37.anInt10827 * -1279070887 - i_264_,
			 class525_sub37.anInt10828 * 1255986271 - i_267_,
			 class157.method2503(), class157.method2503(), i_271_,
			 (byte) -1);
		} else {
		    class182.method3198
			(class525_sub37.anInt10827 * -1279070887 - i_265_,
			 class525_sub37.anInt10828 * 1255986271 - i_268_,
			 class157.method2503() / 2 + 7, i_271_, (byte) -1);
		    class182.method3198((class525_sub37.anInt10827
					 * -1279070887) - i_265_,
					(class525_sub37.anInt10828 * 1255986271
					 - i_268_ - i_268_) != 0 ? 1 : 0,
					class157.method2503() / 2 + 5, i_271_,
					(byte) -1);
		    class182.method3198((-1279070887
					 * class525_sub37.anInt10827) - i_265_,
					(1255986271 * class525_sub37.anInt10828
					 - i_268_ - i_268_) != 0 ? 1 : 0,
					class157.method2503() / 2 + 3, i_271_,
					(byte) -1);
		    class182.method3198
			(-1279070887 * class525_sub37.anInt10827 - i_265_,
			 0 != (class525_sub37.anInt10828 * 1255986271 - i_268_
			       - i_268_) ? 1 : 0,
			 class157.method2503() / 2 + 1, i_271_, (byte) -1);
		    class182.method3198
			(class525_sub37.anInt10827 * -1279070887 - i_265_,
			 0 != (class525_sub37.anInt10828 * 1255986271 - i_268_
			       - i_268_) ? 1 : 0,
			 class157.method2503() / 2, i_271_, (byte) -1);
		}
	    }
	    class157.method2518((class525_sub37.anInt10827 * -1279070887
				 - i_266_),
				(1255986271 * class525_sub37.anInt10828
				 - i_269_));
	    int i_272_ = 0;
	    int i_273_ = 0;
	    if (class34 != null && null != class157_255_) {
		switch (class287.aClass275_3186.anInt2866 * 1165567667) {
		case 2:
		    i_272_ = class157_255_.method12() >> 1;
		    break;
		case 1:
		    break;
		case 0:
		    i_272_ = class157_255_.method12();
		    break;
		}
		switch (1302320603 * class287.aClass272_3161.anInt2847) {
		case 1:
		    i_273_ = (class157_255_.method2472() / 2
			      + class157.method2472()) / 2;
		    break;
		case 2:
		    break;
		case 0:
		    i_273_ = (class157_255_.method2472()
			      + class157.method2472()) / 2;
		    break;
		}
		int i_274_;
		if (-392080105 * class34.anInt309
		    > anInt10648 * -1987988059 / 2)
		    i_274_ = ((-130814117 * anInt10648
			       - class34.anInt309 * -1196178967)
			      / (anInt10648 * -1987988059));
		else
		    i_274_ = class34.anInt309 * -1196178967 / (-1987988059
							       * anInt10648);
		int i_275_ = i_274_ << 24 | 0xffff00;
		class157_255_.method2479
		    (class525_sub37.anInt10827 * -1279070887 - i_272_,
		     1255986271 * class525_sub37.anInt10828 - i_273_, 0,
		     i_275_, 1);
	    }
	}
	if (class287.aString3152 != null && null != Class614.aClass175_8040)
	    Class32.method945(class182, class525_sub37, class287, i_256_,
			      i_257_, i_263_, i_258_, (short) 1046);
	if (class287.anInt3150 * 1564425333 != -1
	    || null != class287.aString3152) {
	    Class525_Sub9 class525_sub9 = new Class525_Sub9(class525_sub37);
	    class525_sub9.anInt10496 = i_251_ * 647937669;
	    class525_sub9.anInt10497 = 474907445 * i_252_;
	    class525_sub9.anInt10498 = i_253_ * 1708619381;
	    class525_sub9.anInt10499 = i_254_ * -828303603;
	    class525_sub9.anInt10503 = 1492879441 * i_259_;
	    class525_sub9.anInt10501 = i_260_ * -934959729;
	    class525_sub9.anInt10500 = i_261_ * -66536729;
	    class525_sub9.anInt10502 = 1554786835 * i_262_;
	    Class447.aClass709_4900.method14345(class525_sub9, (byte) 0);
	}
	return false;
    }
    
    public static Class525_Sub16_Sub6 method16472() {
	return aClass525_Sub16_Sub6_7469;
    }
    
    public static int method16473(int i, int i_276_, int i_277_) {
	if (anInt10625 * 294186987 < 100)
	    return -2;
	int i_278_ = -2;
	int i_279_ = 2147483647;
	int i_280_ = i_276_ - anInt7483;
	int i_281_ = i_277_ - anInt7484;
	for (Class525_Sub37 class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14372((short) -19484);
	     null != class525_sub37;
	     class525_sub37
		 = (Class525_Sub37) aClass709_7473.method14353(-1147420426)) {
	    if (i == -480723851 * class525_sub37.anInt10825) {
		int i_282_ = class525_sub37.anInt10826 * 1273194629;
		int i_283_ = -1383897689 * class525_sub37.anInt10824;
		int i_284_ = anInt7483 + i_282_ << 14 | i_283_ + anInt7484;
		int i_285_ = ((i_280_ - i_282_) * (i_280_ - i_282_)
			      + (i_281_ - i_283_) * (i_281_ - i_283_));
		if (i_278_ < 0 || i_285_ < i_279_) {
		    i_278_ = i_284_;
		    i_279_ = i_285_;
		}
	    }
	}
	return i_278_;
    }
    
    public static void method16474(int i, int i_286_) {
	anInt10626 = 106402817 * (i - anInt7483);
	anInt10627 = -107721765 * (i_286_ - anInt7484);
    }
    
    public static void method16475(int i, int i_287_) {
	anInt10626 = 106402817 * (i - anInt7483);
	anInt10627 = -107721765 * (i_287_ - anInt7484);
    }
    
    public static void method16476(int i, int i_288_) {
	anInt10626 = 106402817 * (i - anInt7483);
	anInt10627 = -107721765 * (i_288_ - anInt7484);
    }
    
    public static void method16477(int i, int i_289_) {
	Class144_Sub1.anInt9141 = -1716705553 * (i - anInt7483);
	Class696_Sub13.anInt10912 = -2002372447 * (i_289_ - anInt7484);
	anInt10626 = -106402817;
	anInt10627 = 107721765;
	ConfigEntry.method1221(-21237726);
    }
    
    public static void method16478(int i, int i_290_) {
	Class144_Sub1.anInt9141 = -1716705553 * (i - anInt7483);
	Class696_Sub13.anInt10912 = -2002372447 * (i_290_ - anInt7484);
	anInt10626 = -106402817;
	anInt10627 = 107721765;
	ConfigEntry.method1221(322489580);
    }
    
    public static boolean method16479(int i, boolean bool) {
	if (anInt10643 * -410093193 == i)
	    aBool10629 = bool;
	else if (-1628218543 * anInt10620 == i)
	    aBool10644 = bool;
	else if (i == anInt10636 * 347888745)
	    aBool10647 = bool;
	else
	    return false;
	return true;
    }
    
    static boolean method16480(Class287 class287) {
	if (null == class287)
	    return false;
	if (null != class287.anIntArray3174) {
	    class287 = class287.method5232(anInterface20_7472,
					   anInterface18_7466, -2100421665);
	    if (null == class287)
		return false;
	}
	if (!class287.aBool3188)
	    return false;
	if (!class287.method5234(anInterface20_7472, anInterface18_7466,
				 (byte) -7))
	    return false;
	if (aClass10_10640.method684((long) (-1356678121 * class287.anInt3194))
	    != null)
	    return false;
	if (aClass10_10634.method684((long) (class287.anInt3192 * 433521613))
	    != null)
	    return false;
	if (class287.aString3152 != null) {
	    if (-436572411 * class287.anInt3149 == 0 && aBool10638)
		return false;
	    if (1 == -436572411 * class287.anInt3149 && aBool10621)
		return false;
	    if (-436572411 * class287.anInt3149 == 2 && aBool10645)
		return false;
	}
	return true;
    }
    
    public static int method16481(int i) {
	if (-410093193 * anInt10643 == i)
	    return aBool10629 ? 1 : 0;
	if (anInt10620 * -1628218543 == i)
	    return aBool10644 ? 1 : 0;
	if (i == 347888745 * anInt10636)
	    return aBool10647 ? 1 : 0;
	return -1;
    }
    
    static void method16482() {
	Class447.aClass709_4900 = null;
	anInt10625 = 0;
	anInt7517 = 0;
	Class562.aClass259_7558 = null;
	method9247();
	aClass709_7473.method14344(-1436627753);
	aClass529_7509 = null;
	aClass200_7486.method3791((byte) -22);
	aClass200_7508.method3791((byte) -14);
	Class604.aClass157_7958 = null;
	anInt10626 = -106402817;
	anInt10627 = 107721765;
	if (aClass40_Sub2_7464 != null) {
	    aClass40_Sub2_7464.method1019(1013231512);
	    aClass40_Sub2_7464.method17397(128, 64, -615092481);
	}
	if (null != aClass40_Sub17_7465)
	    aClass40_Sub17_7465.method17487(64, 64, 1802242823);
	if (aClass40_Sub11_7463 != null)
	    aClass40_Sub11_7463.method1018(256, (byte) 49);
	Class575.aClass40_Sub10_7647.method1018(64, (byte) 54);
    }
    
    public static void method16483(short i) {
	Class281.aMap3005.clear();
	Class281.aClass10_3003.method688((short) 3909);
	Class281.aClass697_3002.method14199(1770122083);
	Class281.anInt3004 = 0;
    }
}
