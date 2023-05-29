/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.MalformedURLException;
import java.net.URL;

public class Class184
{
    public int anInt2063;
    public int anInt2064;
    public int anInt2065;
    public int anInt2066;
    public int anInt2067;
    public int anInt2068;
    byte aByte2069;
    public Class184 aClass184_2070;
    public int anInt2071;
    public int anInt2072;
    public int anInt2073;
    public int anInt2074;
    public int anInt2075;
    public int anInt2076;
    public int anInt2077;
    public int anInt2078;
    static int anInt2079;
    
    public Class382 method3602(Interface48 interface48) {
	return interface48.method340(anInt2064 * -1912121795, 2116345368);
    }
    
    public Class382 method3603(Interface48 interface48, short i) {
	return interface48.method340(anInt2064 * -1912121795, 2116345368);
    }
    
    Class184(int i, int i_0_, int i_1_, int i_2_, int i_3_, byte i_4_) {
	anInt2064 = -671518443 * i;
	anInt2065 = i_0_ * -262920511;
	anInt2066 = -1754183515 * i_1_;
	anInt2076 = i_2_ * -1340112007;
	anInt2068 = 1047441549 * i_3_;
	aByte2069 = i_4_;
    }
    
    Class184 method3604(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
	return new Class184(anInt2064 * -1912121795, i, i_5_, i_6_, i_7_,
			    aByte2069);
    }
    
    Class184 method3605(int i, int i_9_, int i_10_, int i_11_) {
	return new Class184(anInt2064 * -1912121795, i, i_9_, i_10_, i_11_,
			    aByte2069);
    }
    
    Class184 method3606(int i, int i_12_, int i_13_, int i_14_) {
	return new Class184(anInt2064 * -1912121795, i, i_12_, i_13_, i_14_,
			    aByte2069);
    }
    
    public static Class398 method3607(RSBuffer class525_sub38, byte i) {
	int i_15_ = class525_sub38.readUnsignedByte(669888596);
	Class395 class395 = (Class96.method1813(-812245221)
			     [class525_sub38.readUnsignedByte(2014554889)]);
	Class396 class396 = (Class643.method10595((byte) 35)
			     [class525_sub38.readUnsignedByte(936268702)]);
	int i_16_ = class525_sub38.readSmart((byte) -27);
	int i_17_ = class525_sub38.readSmart((byte) -54);
	int i_18_ = class525_sub38.readUnsignedShort((byte) 56);
	int i_19_ = class525_sub38.readUnsignedShort((byte) 35);
	int i_20_ = class525_sub38.readInt(1022680597);
	int i_21_ = class525_sub38.readInt(1086321610);
	int i_22_ = class525_sub38.readInt(1876569420);
	boolean bool = class525_sub38.readUnsignedByte(990080192) == 1;
	return new Class398(i_15_, class395, class396, i_16_, i_17_, i_18_,
			    i_19_, i_20_, i_21_, i_22_, bool);
    }
    
    static final void method3608(Class683 class683, int i) {
	class683.anInt8648 -= -92693374;
	if (class683.aLongArray8645[105529793 * class683.anInt8648]
	    > class683.aLongArray8645[105529793 * class683.anInt8648 + 1])
	    class683.anInt8663
		+= -1827402657 * (class683.anIntArray8647
				  [class683.anInt8663 * 1931825055]);
    }
    
    static final void method3609(Class259 class259, Class683 class683, int i) {
	int i_23_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_24_ = ((class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953])
		     - 1);
	if (class259.anInt2630 * 307215955 != 6)
	    throw new RuntimeException("");
	NPCDefinitions class299
	    = ((NPCDefinitions)
	       Class168_Sub1.aClass40_Sub7_9112
		   .method76(-961419549 * class259.anInt2631, 1100739525));
	if (class259.aClass288_2769 == null)
	    class259.aClass288_2769 = new Class288(class299, true);
	class259.aClass288_2769.aLong3195
	    = Class666.method11002((byte) 30) * -6636968143718260973L;
	if (i_24_ < 0 || i_24_ >= class299.anIntArray3324.length)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i_24_).toString());
	class259.aClass288_2769.anIntArray3197[i_24_] = i_23_;
	Class649.method10708(class259, (byte) 0);
    }
    
    static final void method3610(Class683 class683, byte i) {
	int i_25_ = 77907787 * Class99.anInt1213;
	int i_26_ = SunDefinition.anInt3426 * -1352795477;
	int i_27_ = -1;
	if (Class695.aBool8757) {
	    Class18[] class18s = Class63.method1389((byte) -12);
	    for (int i_28_ = 0; i_28_ < class18s.length; i_28_++) {
		Class18 class18 = class18s[i_28_];
		if (i_25_ == class18.anInt200 * 1036776891
		    && class18.anInt201 * -2072667521 == i_26_) {
		    i_27_ = i_28_;
		    break;
		}
	    }
	}
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_27_;
    }
    
    static final void method3611
	(Class683 class683, Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1,
	 int i) {
	class683.anInt8662 -= 1915637188;
	int i_29_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_30_
	    = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	int i_31_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 2];
	boolean bool
	    = 1 == class683.anIntArray8661[3 + class683.anInt8662 * 501271953];
	if (Class453_Sub3.aClass309_Sub1_10316.method5484(-2121539407)
	    != Class298.aClass298_3278)
	    throw new RuntimeException();
	Class704_Sub3 class704_sub3
	    = ((Class704_Sub3)
	       Class453_Sub3.aClass309_Sub1_10316.method5482(-941804399));
	if (null != class656_sub1_sub3_sub1)
	    class704_sub3.method17402(class656_sub1_sub3_sub1,
				      new Class446((float) i_29_,
						   (float) i_30_,
						   (float) i_31_),
				      bool, (short) 18542);
	client.aBool11364 = true;
    }
    
    static final void method3612(Class683 class683, int i) {
	int i_32_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class532.aClass111_7170.method1968(i_32_, (byte) 98);
    }
    
    public static final void method3613
	(Class259[] class259s, int i, int i_33_, int i_34_, int i_35_,
	 int i_36_, int i_37_, int i_38_, int i_39_, boolean bool, int i_40_) {
	Class501.aClass182_5564.method3184(i_33_, i_34_, i_35_, i_36_);
	for (int i_41_ = 0; i_41_ < class259s.length; i_41_++) {
	    Class259 class259 = class259s[i_41_];
	    if (class259 != null
		&& (class259.anInt2606 * -1549235523 == i
		    || (i == -1412584499
			&& client.aClass259_11271 == class259))) {
		int i_42_;
		if (i_39_ == -1) {
		    client.aRectangleArray11322
			[1515251815 * client.anInt11131].setBounds
			(1993853565 * class259.anInt2600 + i_37_,
			 i_38_ + class259.anInt2601 * -1028431221,
			 class259.anInt2602 * -1694810043,
			 2054207119 * class259.anInt2598);
		    i_42_
			= (client.anInt11131 += -1755860137) * 1515251815 - 1;
		} else
		    i_42_ = i_39_;
		class259.anInt2765 = i_42_ * 258208147;
		class259.anInt2766 = client.anInt11083 * -2071199131;
		if (!client.method17533(class259)) {
		    if (-210830273 * class259.anInt2591 != 0)
			Class656_Sub1_Sub3_Sub3.method18711(class259,
							    (byte) 22);
		    int i_43_ = 1993853565 * class259.anInt2600 + i_37_;
		    int i_44_ = class259.anInt2601 * -1028431221 + i_38_;
		    int i_45_ = 855530469 * class259.anInt2618;
		    if (client.aBool11363
			&& ((client.method17531(class259).anInt10486
			     * 1228765885) != 0
			    || 0 == class259.anInt2590 * 2010235789)
			&& i_45_ > 127)
			i_45_ = 127;
		    if (client.aClass259_11271 == class259) {
			if (i != -1412584499
			    && ((Class259.anInt2563 * 840205539
				 == class259.anInt2693 * -424751249)
				|| (Class259.anInt2652 * -876967301
				    == -424751249 * class259.anInt2693)
				|| (client.method17531(class259)
					.method16136(-110682587)
				    && (-424751249 * class259.anInt2693
					!= (1054513403
					    * Class259.anInt2564))))) {
			    Class317_Sub1.aClass259Array10104 = class259s;
			    Class390_Sub2.anInt10228 = 493766431 * i_37_;
			    Class320.anInt3533 = i_38_ * 2103267595;
			    continue;
			}
			if (client.aBool11284 && client.aBool11324) {
			    int i_46_ = Class509.aClass569_5662
					    .method9498(257228261);
			    int i_47_ = Class509.aClass569_5662
					    .method9499(501271953);
			    i_46_ -= -216770093 * client.anInt11198;
			    i_47_ -= 1056729841 * client.anInt11057;
			    if (i_46_ < client.anInt11277 * -1077069491)
				i_46_ = -1077069491 * client.anInt11277;
			    if (-1694810043 * class259.anInt2602 + i_46_
				> (client.anInt11279 * 215080695
				   + client.anInt11277 * -1077069491))
				i_46_ = (-1077069491 * client.anInt11277
					 + client.anInt11279 * 215080695
					 - -1694810043 * class259.anInt2602);
			    if (i_47_ < 955332869 * client.anInt11068)
				i_47_ = 955332869 * client.anInt11068;
			    if (i_47_ + 2054207119 * class259.anInt2598
				> (client.anInt11329 * -90696845
				   + client.anInt11068 * 955332869))
				i_47_ = (955332869 * client.anInt11068
					 + -90696845 * client.anInt11329
					 - class259.anInt2598 * 2054207119);
			    if (client.method17531(class259)
				    .method16136(-1135024884))
				Class198_Sub19_Sub1.method18196
				    (i_46_, i_47_,
				     -1694810043 * class259.anInt2602,
				     2054207119 * class259.anInt2598,
				     870295436);
			    if (class259.anInt2693 * -424751249
				!= 1054513403 * Class259.anInt2564) {
				i_43_ = i_46_;
				i_44_ = i_47_;
			    }
			}
			if (-424751249 * class259.anInt2693
			    == -876967301 * Class259.anInt2652)
			    i_45_ = 128;
		    }
		    int i_48_;
		    int i_49_;
		    int i_50_;
		    int i_51_;
		    if (class259.anInt2590 * 2010235789 == 2) {
			i_48_ = i_33_;
			i_49_ = i_34_;
			i_50_ = i_35_;
			i_51_ = i_36_;
		    } else {
			int i_52_ = i_43_ + class259.anInt2602 * -1694810043;
			int i_53_ = class259.anInt2598 * 2054207119 + i_44_;
			if (2010235789 * class259.anInt2590 == 9) {
			    i_52_++;
			    i_53_++;
			}
			i_48_ = i_43_ > i_33_ ? i_43_ : i_33_;
			i_49_ = i_44_ > i_34_ ? i_44_ : i_34_;
			i_50_ = i_52_ < i_35_ ? i_52_ : i_35_;
			i_51_ = i_53_ < i_36_ ? i_53_ : i_36_;
		    }
		    if (i_48_ < i_50_ && i_49_ < i_51_) {
			if (class259.anInt2591 * -210830273 != 0) {
			    if ((-210830273 * class259.anInt2591
				 == Class259.anInt2566 * -1148162767)
				|| (class259.anInt2591 * -210830273
				    == Class259.anInt2569 * -235515553)) {
				if (client.aBool11307) {
				    Class501.aClass182_5564.method3218();
				    Class550.method9135
					(i_43_, i_44_,
					 class259.anInt2602 * -1694810043,
					 class259.anInt2598 * 2054207119,
					 (class259.anInt2591 * -210830273
					  == -235515553 * Class259.anInt2569),
					 (short) 255);
				    Class688.method14018(i_42_, i_48_, i_49_,
							 i_50_, i_51_, i_43_,
							 i_44_, 2143995684);
				    Class501.aClass182_5564.method3580();
				    Class501.aClass182_5564.method3184(i_33_,
								       i_34_,
								       i_35_,
								       i_36_);
				    client.aBoolArray11320[i_42_] = true;
				}
				continue;
			    }
			    if ((-210830273 * class259.anInt2591
				 == Class259.anInt2568 * 38377017)
				&& 1 == client.anInt11145 * 1874190559) {
				if (2010235789 * class259.anInt2590 != 5
				    || (class259.method4692((Class501
							     .aClass182_5564),
							    -2049534117)
					!= null)) {
				    Class246.method4492((Class501
							 .aClass182_5564),
							class259, i_43_, i_44_,
							1706372512);
				    Class501.aClass182_5564.method3184(i_33_,
								       i_34_,
								       i_35_,
								       i_36_);
				}
				continue;
			    }
			    if (-1174196513 * Class259.anInt2575
				== -210830273 * class259.anInt2591) {
				Class195.method3735(Class501.aClass182_5564,
						    i_43_, i_44_, class259,
						    807840902);
				continue;
			    }
			    if (class259.anInt2591 * -210830273
				== -1093894375 * Class259.anInt2691) {
				Class676.method11124(Class501.aClass182_5564,
						     i_43_, i_44_, class259,
						     (class259.anInt2638
						      * 1943498005 % 64),
						     773763629);
				continue;
			    }
			    if (50963123 * Class259.anInt2574
				== class259.anInt2591 * -210830273) {
				if (class259.method4692((Class501
							 .aClass182_5564),
							-564877103)
				    != null) {
				    Class501.aClass182_5564.method3218();
				    Class267.method4948(class259, i_43_, i_44_,
							-1862271792);
				    Class501.aClass182_5564.method3184(i_33_,
								       i_34_,
								       i_35_,
								       i_36_);
				}
				continue;
			    }
			    if (class259.anInt2591 * -210830273
				== Class259.anInt2570 * -1811446463) {
				Class283.method5216(Class501.aClass182_5564,
						    i_43_, i_44_,
						    (-1694810043
						     * class259.anInt2602),
						    (class259.anInt2598
						     * 2054207119),
						    (byte) 11);
				client.aBoolArray11320[i_42_] = true;
				Class501.aClass182_5564
				    .method3184(i_33_, i_34_, i_35_, i_36_);
				continue;
			    }
			    if (Class259.anInt2567 * 109496751
				== class259.anInt2591 * -210830273) {
				Class48.method1112(Class501.aClass182_5564,
						   i_43_, i_44_,
						   (-1694810043
						    * class259.anInt2602),
						   (class259.anInt2598
						    * 2054207119),
						   1722112305);
				client.aBoolArray11320[i_42_] = true;
				Class501.aClass182_5564
				    .method3184(i_33_, i_34_, i_35_, i_36_);
				continue;
			    }
			    if (class259.anInt2591 * -210830273
				== Class259.anInt2572 * 1895695743) {
				if (client.aBool11086 || client.aBool11087) {
				    Class536.method8871(i_43_, i_44_, class259,
							(short) -29156);
				    client.aBoolArray11320[i_42_] = true;
				}
				continue;
			    }
			    if (class259.anInt2591 * -210830273
				== -407188525 * Class259.anInt2577) {
				Class157 class157
				    = Class674.method11117((byte) -36);
				if (null != class157) {
				    int i_54_ = i_35_ - i_33_;
				    int i_55_ = i_36_ - i_34_;
				    float f = (float) i_54_ / (float) i_55_;
				    float f_56_
					= ((float) class157.method2503()
					   / (float) class157.method2471());
				    int i_57_;
				    int i_58_;
				    if (f < f_56_) {
					i_57_ = i_54_;
					i_58_ = (int) ((float) i_54_ / f_56_);
				    } else {
					i_57_ = (int) ((float) i_55_ * f_56_);
					i_58_ = i_55_;
				    }
				    int i_59_ = (i_54_ - i_57_) / 2 + i_33_;
				    int i_60_ = (i_55_ - i_58_) / 2 + i_34_;
				    class157.method2481(i_59_, i_60_, i_57_,
							i_58_);
				}
				continue;
			    }
			    if (class259.anInt2591 * -210830273
				== -267468949 * Class259.anInt2578) {
				if (Class116.method2057(452781213)
				    && Class318.method5673(2041170683))
				    Class631.method10318(i_33_, i_34_, i_35_,
							 i_36_, 1961785174);
				continue;
			    }
			}
			if (class259.anInt2590 * 2010235789 == 0) {
			    if (15245173 * Class259.anInt2752
				== class259.anInt2591 * -210830273) {
				Class501.aClass182_5564.method3218();
				client.aClass507_11137.method8361
				    ((byte) 81).method10435
				    (client.aClass507_11137, (short) 312);
				Class501.aClass182_5564.method3248
				    (i_43_, i_44_,
				     -1445589163 * Class434.anInt4827,
				     -1883654023 * Class696_Sub47.anInt11032);
			    }
			    method3613(class259s,
				       class259.anInt2588 * 1984678839, i_48_,
				       i_49_, i_50_, i_51_,
				       i_43_ - class259.anInt2612 * 1693654607,
				       i_44_ - class259.anInt2613 * 1059112359,
				       i_42_, bool, 1998957920);
			    if (class259.aClass259Array2755 != null)
				method3613(class259.aClass259Array2755,
					   1984678839 * class259.anInt2588,
					   i_48_, i_49_, i_50_, i_51_,
					   (i_43_
					    - class259.anInt2612 * 1693654607),
					   (i_44_
					    - 1059112359 * class259.anInt2613),
					   i_42_, bool, 2044462444);
			    Class525_Sub33 class525_sub33
				= ((Class525_Sub33)
				   (client.aClass10_11261.method684
				    ((long) (1984678839
					     * class259.anInt2588))));
			    if (class525_sub33 != null)
				Class636.method10474
				    (922288809 * class525_sub33.anInt10745,
				     i_48_, i_49_, i_50_, i_51_,
				     i_43_ - 1693654607 * class259.anInt2612,
				     i_44_ - class259.anInt2613 * 1059112359,
				     i_42_, -269022135);
			    if (Class259.anInt2752 * 15245173
				== -210830273 * class259.anInt2591) {
				if (Class501.aClass182_5564.method3250()) {
				    Class501.aClass182_5564.method3249
					(class259.anInt2602 * -1694810043,
					 class259.anInt2598 * 2054207119);
				    if (7 == 1777895575 * client.anInt11075)
					Class525_Sub10.method16196
					    (i_43_, i_44_,
					     -1694810043 * class259.anInt2602,
					     2054207119 * class259.anInt2598,
					     (byte) 52);
				}
				if (client.anInt11145 * 1874190559 == 4) {
				    int i_61_ = 1102699809 * client.anInt11152;
				    int i_62_ = 824236299 * client.anInt11114;
				    int i_63_ = client.anInt11306 * -170210867;
				    int i_64_ = 337072185 * client.anInt11155;
				    if (client.anInt11083
					< -282482651 * client.anInt11210) {
					float f
					    = ((float) (client.anInt11083
							- (1678757245
							   * (client
							      .anInt11150)))
					       * 1.0F
					       / (float) ((client.anInt11210
							   * -282482651)
							  - (client.anInt11150
							     * 1678757245)));
					i_61_
					    = (int) (((1.0F - f)
						      * (float) ((Class628
								  .anInt8156)
								 * -454848841))
						     + ((float) (1102699809
								 * (client
								    .anInt11152))
							* f));
					i_62_
					    = (int) (((1.0F - f)
						      * (float) ((Class236
								  .anInt2392)
								 * -1668483965))
						     + ((float) (824236299
								 * (client
								    .anInt11114))
							* f));
					i_63_
					    = (int) ((float) (client.anInt11306
							      * -170210867) * f
						     + ((1.0F - f)
							* (float) (-1057309855
								   * (Class249
								      .anInt2446))));
					i_64_
					    = (int) (((1.0F - f)
						      * (float) (-1212496677
								 * (Class696_Sub37
								    .anInt10982)))
						     + (f
							* (float) ((client
								    .anInt11155)
								   * 337072185)));
				    }
				    if (i_61_ > 0)
					Class501.aClass182_5564.method3190
					    (i_48_, i_49_, i_50_ - i_48_,
					     i_51_ - i_49_,
					     (i_61_ << 24 | i_62_ << 16
					      | i_63_ << 8 | i_64_),
					     (byte) -1);
				}
			    }
			    Class501.aClass182_5564.method3184(i_33_, i_34_,
							       i_35_, i_36_);
			}
			if (client.aBoolArray11186[i_42_]
			    || client.anInt11265 * 337888111 > 1) {
			    if (2010235789 * class259.anInt2590 == 3) {
				if (i_45_ == 0) {
				    if (class259.aBool2617)
					Class501.aClass182_5564.method3151
					    (i_43_, i_44_,
					     -1694810043 * class259.anInt2602,
					     2054207119 * class259.anInt2598,
					     ~0xffffff | (class259.anInt2638
							  * 1943498005),
					     0);
				    else
					Class501.aClass182_5564.method3195
					    (i_43_, i_44_,
					     class259.anInt2602 * -1694810043,
					     class259.anInt2598 * 2054207119,
					     (~0xffffff
					      | (1943498005
						 * class259.anInt2638)),
					     0);
				} else if (class259.aBool2617)
				    Class501.aClass182_5564.method3151
					(i_43_, i_44_,
					 class259.anInt2602 * -1694810043,
					 2054207119 * class259.anInt2598,
					 (255 - (i_45_ & 0xff) << 24
					  | (class259.anInt2638 * 1943498005
					     & 0xffffff)),
					 1);
				else
				    Class501.aClass182_5564.method3195
					(i_43_, i_44_,
					 class259.anInt2602 * -1694810043,
					 2054207119 * class259.anInt2598,
					 (255 - (i_45_ & 0xff) << 24
					  | (class259.anInt2638 * 1943498005
					     & 0xffffff)),
					 1);
			    } else if (4 == class259.anInt2590 * 2010235789) {
				int i_65_ = 255 - (i_45_ & 0xff);
				if (i_65_ != 0) {
				    Class175 class175
					= (class259.method4682
					   (Class7.aClass404_53,
					    client.anInterface50_11252,
					    -1663601143));
				    if (class175 == null) {
					if (Class259.aBool2585)
					    Class649.method10708(class259,
								 (byte) 0);
				    } else {
					int i_66_
					    = class259.anInt2638 * 1943498005;
					String string = class259.aString2667;
					if (-1 != (372293357
						   * class259.anInt2740)) {
					    ItemDefinitions class8
						= ((ItemDefinitions)
						   (Class313_Sub2
							.aClass40_Sub22_10106
							.method76
						    ((class259.anInt2740
						      * 372293357),
						     -1692808470)));
					    string = class8.aString66;
					    if (string == null)
						string = "null";
					    if ((1 == (1051584679
						       * class8.anInt56)
						 || 1 != (-1408303227
							  * (class259
							     .anInt2741)))
						&& -1 != (class259.anInt2741
							  * -1408303227))
						string
						    = new StringBuilder()
							  .append
							  (Class493.method8001
							   (16748608,
							    1798193134))
							  .append
							  (string).append
							  (Class55.aString566)
							  .append
							  (" x").append
							  (Class249.method4505
							   ((-1408303227
							     * (class259
								.anInt2741)),
							    (byte) 27))
							  .toString();
					}
					if (class259
					    == client.aClass259_11263) {
					    string = (Class53.aClass53_518
							  .method1169
						      (Class21.aClass666_213,
						       1552651121));
					    i_66_ = (class259.anInt2638
						     * 1943498005);
					}
					if (client.aBool11382)
					    Class501.aClass182_5564.method3185
						(i_43_, i_44_,
						 (class259.anInt2602
						  * -1694810043) + i_43_,
						 (class259.anInt2598
						  * 2054207119) + i_44_);
					i_65_ <<= 24;
					if (class259.aBool2673)
					    class175.method2845
						(string, i_43_, i_44_,
						 (-1694810043
						  * class259.anInt2602),
						 (2054207119
						  * class259.anInt2598),
						 i_65_ | i_66_,
						 (class259.aBool2692 ? i_65_
						  : -1),
						 (-1634961939
						  * class259.anInt2669),
						 (class259.anInt2670
						  * -560565055),
						 client.aRandom11303,
						 Class413.anInt4407,
						 client.anIntArray11354,
						 Class229.aClass157Array2364,
						 null, (byte) 53);
					else
					    class175.method2840
						(string, i_43_, i_44_,
						 (-1694810043
						  * class259.anInt2602),
						 (2054207119
						  * class259.anInt2598),
						 i_65_ | i_66_,
						 (class259.aBool2692 ? i_65_
						  : -1),
						 (-1634961939
						  * class259.anInt2669),
						 (class259.anInt2670
						  * -560565055),
						 (class259.anInt2668
						  * 672478219),
						 (857274467
						  * class259.anInt2735),
						 Class229.aClass157Array2364,
						 null, null, 0, 0,
						 -2035900319);
					if (client.aBool11382)
					    Class501.aClass182_5564.method3184
						(i_33_, i_34_, i_35_, i_36_);
				    }
				}
			    } else if (2010235789 * class259.anInt2590 == 5) {
				if (class259.anInt2562 * -1802726265 >= 0)
				    class259.method4686
					(Class658.aClass40_Sub3_8457,
					 Class539.aClass40_Sub4_7181,
					 311253314)
					.method8563
					(Class501.aClass182_5564, 0, i_43_,
					 i_44_,
					 class259.anInt2602 * -1694810043,
					 2054207119 * class259.anInt2598,
					 2752133 * class259.anInt2746 << 3,
					 class259.anInt2736 * 1500086981 << 3,
					 0, 0, -1795319093);
				else {
				    Class157 class157;
				    if (class259.anInt2740 * 372293357 != -1) {
					Class637 class637
					    = (class259.aBool2702
					       ? (Class581
						  .aClass656_Sub1_Sub3_Sub1_Sub1_7705
						  .aClass637_12246)
					       : null);
					class157
					    = (Class313_Sub2
						   .aClass40_Sub22_10106
						   .method17506
					       (Class501.aClass182_5564,
						372293357 * class259.anInt2740,
						(class259.anInt2741
						 * -1408303227),
						(1107836521
						 * class259.anInt2624),
						(~0xffffff
						 | (1971227387
						    * class259.anInt2565)),
						(-510508613
						 * class259.anInt2715),
						class637, (byte) 66));
				    } else if (-600874781 * class259.anInt2751
					       != -1) {
					class157
					    = ((Class157)
					       (client.aClass200_11301
						    .method3785
						((long) (class259.anInt2751
							 * -600874781))));
					if (null == class157
					    && !(client.aMap11374.containsKey
						 (Integer.valueOf
						  (-600874781
						   * class259.anInt2751)))) {
					    try {
						client.aMap11374.put
						    ((Integer.valueOf
						      (-600874781
						       * class259.anInt2751)),
						     (Class585
							  .aClass54_7726
							  .method1177
						      ((new URL
							(new StringBuilder
							     ().append
							     (client
							      .aString11132)
							     .append
							     ("/img/image_")
							     .append
							     ((class259
							       .anInt2751)
							      * -600874781)
							     .append
							     (".png?a=").append
							     (Class251
								  .method4508
							      ((byte) 8))
							     .toString())),
						       (short) 515)));
					    } catch (MalformedURLException malformedurlexception) {
						Class525_Sub16_Sub13
						    .method18448
						    (null,
						     malformedurlexception,
						     (byte) 13);
					    }
					}
				    } else
					class157 = (class259.method4681
						    (Class501.aClass182_5564,
						     (byte) -30));
				    if (class157 != null) {
					int i_67_ = class157.method12();
					int i_68_ = class157.method2472();
					int i_69_ = 255 - (i_45_ & 0xff);
					if (i_69_ != 0) {
					    int i_70_;
					    if (-1 == (class259.anInt2638
						       * 1943498005))
						i_70_ = 16777215;
					    else {
						i_70_ = ((1943498005
							  * class259.anInt2638)
							 & 0xffffff);
						if (0 == i_70_)
						    i_70_ = 16777215;
					    }
					    i_70_ |= i_69_ << 24;
					    boolean bool_71_ = -1 != i_70_;
					    if (class259.aBool2623) {
						Class501.aClass182_5564
						    .method3185
						    (i_43_, i_44_,
						     ((-1694810043
						       * class259.anInt2602)
						      + i_43_),
						     i_44_ + (2054207119
							      * (class259
								 .anInt2598)));
						if ((class259.anInt2622
						     * -1646614517)
						    != 0) {
						    int i_72_
							= (((class259.anInt2602
							     * -1694810043)
							    + (i_67_ - 1))
							   / i_67_);
						    int i_73_
							= ((i_68_ - 1
							    + (2054207119
							       * (class259
								  .anInt2598)))
							   / i_68_);
						    for (int i_74_ = 0;
							 i_74_ < i_72_;
							 i_74_++) {
							for (int i_75_ = 0;
							     i_75_ < i_73_;
							     i_75_++) {
							    if (bool_71_)
								class157
								    .method2526
								    ((((float) i_67_
								       / 2.0F)
								      + (float) (i_43_ + i_74_ * i_67_)),
								     (((float) i_68_
								       / 2.0F)
								      + (float) (i_75_ * i_68_ + i_44_)),
								     4096,
								     (-1646614517
								      * (class259
									 .anInt2622)),
								     0, i_70_,
								     1);
							    else
								class157
								    .method2487
								    (((float) (i_74_ * i_67_
									       + i_43_)
								      + ((float) i_67_
									 / 2.0F)),
								     ((float) (i_68_ * i_75_
									       + i_44_)
								      + ((float) i_68_
									 / 2.0F)),
								     4096,
								     (-1646614517
								      * (class259
									 .anInt2622)));
							}
						    }
						} else if (bool_71_)
						    class157.method2485
							(i_43_, i_44_,
							 (class259.anInt2602
							  * -1694810043),
							 (class259.anInt2598
							  * 2054207119),
							 0, i_70_, 1);
						else
						    class157.method2478
							(i_43_, i_44_,
							 (-1694810043
							  * (class259
							     .anInt2602)),
							 (class259.anInt2598
							  * 2054207119));
						Class501.aClass182_5564
						    .method3184
						    (i_33_, i_34_, i_35_,
						     i_36_);
					    } else if (bool_71_) {
						if (0 != (class259.anInt2622
							  * -1646614517))
						    class157.method2526
							(((float) i_43_
							  + ((float) (-1694810043
								      * (class259
									 .anInt2602))
							     / 2.0F)),
							 (((float) ((class259
								     .anInt2598)
								    * 2054207119)
							   / 2.0F)
							  + (float) i_44_),
							 (class259.anInt2602
							  * -1274785792
							  / i_67_),
							 (-1646614517
							  * (class259
							     .anInt2622)),
							 0, i_70_, 1);
						else if (((-1694810043
							   * (class259
							      .anInt2602))
							  != i_67_)
							 || ((2054207119
							      * (class259
								 .anInt2598))
							     != i_68_))
						    class157.method2482
							(i_43_, i_44_,
							 (class259.anInt2602
							  * -1694810043),
							 (class259.anInt2598
							  * 2054207119),
							 0, i_70_, 1);
						else
						    class157.method2479(i_43_,
									i_44_,
									0,
									i_70_,
									1);
					    } else if (0 != (-1646614517
							     * (class259
								.anInt2622)))
						class157.method2488
						    (((float) i_43_
						      + ((float) (-1694810043
								  * (class259
								     .anInt2602))
							 / 2.0F)),
						     ((float) i_44_
						      + ((float) ((class259
								   .anInt2598)
								  * 2054207119)
							 / 2.0F)),
						     (float) i_67_ / 2.0F,
						     (float) i_68_ / 2.0F,
						     (class259.anInt2602
						      * -1274785792 / i_67_),
						     (class259.anInt2598
						      * 191426560 / i_68_),
						     (class259.anInt2622
						      * -1646614517),
						     1, -1, 1);
					    else if ((i_67_
						      != (class259.anInt2602
							  * -1694810043))
						     || ((2054207119
							  * class259.anInt2598)
							 != i_68_))
						class157.method2481
						    (i_43_, i_44_,
						     (class259.anInt2602
						      * -1694810043),
						     (2054207119
						      * class259.anInt2598));
					    else
						class157.method2518(i_43_,
								    i_44_);
					}
				    } else if (Class259.aBool2585)
					Class649.method10708(class259,
							     (byte) 0);
				}
			    } else if (class259.anInt2590 * 2010235789 == 6) {
				Class501.aClass182_5564.method3218();
				Class179 class179 = null;
				int i_76_ = 2048;
				if (-2072936317 * class259.anInt2632 != 0)
				    i_76_ |= 0x80000;
				int i_77_ = 0;
				if (-1 != 372293357 * class259.anInt2740) {
				    ItemDefinitions class8
					= ((ItemDefinitions)
					   (Class313_Sub2
						.aClass40_Sub22_10106.method76
					    (372293357 * class259.anInt2740,
					     1307730249)));
				    if (null != class8) {
					class8 = (class8.method632
						  ((-1408303227
						    * class259.anInt2741),
						   501199132));
					class179
					    = (class8.method616
					       (Class501.aClass182_5564, i_76_,
						1,
						(class259.aBool2702
						 ? (Class581
						    .aClass656_Sub1_Sub3_Sub1_Sub1_7705
						    .aClass637_12246)
						 : null),
						class259.aClass689_2664, 0, 0,
						0, 0, -1997131356));
					if (null != class179)
					    i_77_
						= -class179.method2960() >> 1;
					else
					    Class649.method10708(class259,
								 (byte) 0);
				    }
				} else if (3
					   == class259.anInt2630 * 307215955) {
				    int i_78_
					= -961419549 * class259.anInt2631;
				    if (i_78_ >= 0 && i_78_ < 2048) {
					Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
					    = (client
					       .aClass656_Sub1_Sub3_Sub1_Sub1Array11384
					       [i_78_]);
					if ((null
					     != class656_sub1_sub3_sub1_sub1)
					    && ((615376671 * client.anInt11053
						 == i_78_)
						|| ((Class412.method6678
						     ((class656_sub1_sub3_sub1_sub1
						       .aString12231),
						      21224738))
						    == (-1375535723
							* (class259
							   .anInt2672))))) {
					    class179
						= (class259.method4684
						   (Class501.aClass182_5564,
						    i_76_,
						    (Class227
						     .aClass40_Sub1_2345),
						    Class38.aClass40_Sub9_328,
						    (Class168_Sub1
						     .aClass40_Sub7_9112),
						    (Class313_Sub2
						     .aClass40_Sub22_10106),
						    (Class685
						     .aClass40_Sub8_8691),
						    Class532.aClass111_7170,
						    Class532.aClass111_7170,
						    class259.aClass689_2664,
						    (class656_sub1_sub3_sub1_sub1
						     .aClass637_12246),
						    -1644304939));
					    if (class179 == null
						&& Class259.aBool2585)
						Class649.method10708(class259,
								     (byte) 0);
					}
				    }
				} else if (5
					   == class259.anInt2630 * 307215955) {
				    int i_79_
					= -961419549 * class259.anInt2631;
				    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
					= null;
				    boolean bool_80_ = false;
				    if (i_79_ >= 0 && i_79_ < 2048) {
					class656_sub1_sub3_sub1_sub1
					    = (client
					       .aClass656_Sub1_Sub3_Sub1_Sub1Array11384
					       [i_79_]);
					bool_80_
					    = ((class656_sub1_sub3_sub1_sub1
						!= null)
					       && ((i_79_
						    == (615376671
							* client.anInt11053))
						   || ((Class412.method6678
							((class656_sub1_sub3_sub1_sub1
							  .aString12231),
							 -1734896562))
						       == (-1375535723
							   * (class259
							      .anInt2672)))));
				    } else if (i_79_ == -1) {
					bool_80_ = true;
					class656_sub1_sub3_sub1_sub1
					    = (Class581
					       .aClass656_Sub1_Sub3_Sub1_Sub1_7705);
				    } else {
					Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1_81_
					    = ((Class656_Sub1_Sub3_Sub1_Sub1)
					       (client.aMap11228.get
						(Integer.valueOf(i_79_))));
					if ((null
					     != class656_sub1_sub3_sub1_sub1_81_)
					    && (i_79_
						== ((class656_sub1_sub3_sub1_sub1_81_
						     .anInt11964)
						    * 2032864281))) {
					    bool_80_ = true;
					    class656_sub1_sub3_sub1_sub1
						= class656_sub1_sub3_sub1_sub1_81_;
					}
				    }
				    if (bool_80_
					&& null != class656_sub1_sub3_sub1_sub1
					&& (null
					    != (class656_sub1_sub3_sub1_sub1
						.aClass637_12246)))
					class179
					    = (class656_sub1_sub3_sub1_sub1
						   .aClass637_12246.method10482
					       (Class501.aClass182_5564, i_76_,
						Class227.aClass40_Sub1_2345,
						Class38.aClass40_Sub9_328,
						(Class168_Sub1
						 .aClass40_Sub7_9112),
						(Class313_Sub2
						 .aClass40_Sub22_10106),
						Class532.aClass111_7170,
						Class532.aClass111_7170,
						class259.aClass689_2664, null,
						null, null, 0, true,
						Class664.aClass634_8557,
						16711935));
				} else if (class259.anInt2630 * 307215955 == 8
					   || 9 == (307215955
						    * class259.anInt2630)) {
				    Class525_Sub10 class525_sub10
					= Class190.method3692(((class259
								.anInt2631)
							       * -961419549),
							      false,
							      (byte) 100);
				    if (class525_sub10 != null)
					class179
					    = (class525_sub10.method16174
					       (Class501.aClass182_5564, i_76_,
						class259.aClass689_2664,
						(-1375535723
						 * class259.anInt2672),
						9 == (class259.anInt2630
						      * 307215955),
						(class259.aBool2702
						 ? (Class581
						    .aClass656_Sub1_Sub3_Sub1_Sub1_7705
						    .aClass637_12246)
						 : null),
						(short) 588));
				} else if (class259.aClass689_2664 == null
					   || !class259.aClass689_2664
						   .method14021(-1791184403)) {
				    class179
					= (class259.method4684
					   (Class501.aClass182_5564, i_76_,
					    Class227.aClass40_Sub1_2345,
					    Class38.aClass40_Sub9_328,
					    Class168_Sub1.aClass40_Sub7_9112,
					    Class313_Sub2.aClass40_Sub22_10106,
					    Class685.aClass40_Sub8_8691,
					    Class532.aClass111_7170,
					    Class532.aClass111_7170, null,
					    (Class581
					     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
					     .aClass637_12246),
					    -814345061));
				    if (class179 == null && Class259.aBool2585)
					Class649.method10708(class259,
							     (byte) 0);
				} else {
				    class179
					= (class259.method4684
					   (Class501.aClass182_5564, i_76_,
					    Class227.aClass40_Sub1_2345,
					    Class38.aClass40_Sub9_328,
					    Class168_Sub1.aClass40_Sub7_9112,
					    Class313_Sub2.aClass40_Sub22_10106,
					    Class685.aClass40_Sub8_8691,
					    Class532.aClass111_7170,
					    Class532.aClass111_7170,
					    class259.aClass689_2664,
					    (Class581
					     .aClass656_Sub1_Sub3_Sub1_Sub1_7705
					     .aClass637_12246),
					    -2107874008));
				    if (class179 == null && Class259.aBool2585)
					Class649.method10708(class259,
							     (byte) 0);
				}
				if (null != class179) {
				    if (class259.anInt2632 * -2072936317 != 0)
					class179.method2974
					    (class259.anInt2704 * 1945380411,
					     class259.anInt2647 * 603876669,
					     class259.anInt2654 * 1645603435,
					     -2072936317 * class259.anInt2632);
				    int i_82_;
				    if (class259.anInt2643 * -514089217 > 0)
					i_82_ = (((-1694810043
						   * class259.anInt2602)
						  << 9)
						 / (-514089217
						    * class259.anInt2643));
				    else
					i_82_ = 512;
				    int i_83_;
				    if (695728921 * class259.anInt2644 > 0)
					i_83_
					    = ((2054207119 * class259.anInt2598
						<< 9)
					       / (695728921
						  * class259.anInt2644));
				    else
					i_83_ = 512;
				    int i_84_
					= (-1694810043 * class259.anInt2602 / 2
					   + i_43_);
				    int i_85_ = i_44_ + (class259.anInt2598
							 * 2054207119 / 2);
				    if (!class259.aBool2633) {
					i_84_ += (class259.anInt2639
						  * 684484425 * i_82_) >> 9;
					i_85_
					    += (1115037587 * class259.anInt2640
						* i_83_) >> 9;
				    }
				    client.aClass444_11077.method7133();
				    Class501.aClass182_5564
					.method3233(client.aClass444_11077);
				    Class435 class435
					= Class501.aClass182_5564.method3224();
				    int i_86_
					= client.aClass507_11137
					      .method8356((short) -13190);
				    int i_87_ = client.aClass507_11137
						    .method8357(878454238);
				    i_87_ += class259.anInt2642 * 1890162443;
				    if (class259.aBool2645) {
					if (-174799205 * Class700.anInt8779
					    == 5) {
					    if (class259.aBool2633)
						class435.method6948
						    ((float) i_84_,
						     (float) i_85_,
						     (float) i_82_,
						     (float) i_83_,
						     (Class453_Sub3
							  .aClass309_Sub1_10316
							  .method5499
						      (1195525971)),
						     (Class453_Sub3
							  .aClass309_Sub1_10316
							  .method5500
						      ((byte) 47)),
						     (float) (-1445589163
							      * (Class434
								 .anInt4827)),
						     (float) ((Class696_Sub47
							       .anInt11032)
							      * -1883654023),
						     (float) (1890162443
							      * (class259
								 .anInt2642)));
					    else
						class435.method6948
						    ((float) i_84_,
						     (float) i_85_,
						     (float) i_82_,
						     (float) i_83_,
						     (Class453_Sub3
							  .aClass309_Sub1_10316
							  .method5499
						      (1969548095)),
						     (Class453_Sub3
							  .aClass309_Sub1_10316
							  .method5500
						      ((byte) 14)),
						     (float) (-1445589163
							      * (Class434
								 .anInt4827)),
						     (float) ((Class696_Sub47
							       .anInt11032)
							      * -1883654023),
						     (float) (((class259
								.anInt2642)
							       * 1890162443)
							      << 2));
					} else if (class259.aBool2633)
					    class435.method6948
						((float) i_84_, (float) i_85_,
						 (float) i_82_, (float) i_83_,
						 (float) i_86_, (float) i_87_,
						 (float) (-1445589163
							  * (Class434
							     .anInt4827)),
						 (float) ((Class696_Sub47
							   .anInt11032)
							  * -1883654023),
						 (float) (class259.anInt2642
							  * 1890162443));
					else
					    class435.method6948
						((float) i_84_, (float) i_85_,
						 (float) i_82_, (float) i_83_,
						 (float) i_86_, (float) i_87_,
						 (float) (Class434.anInt4827
							  * -1445589163),
						 (float) (-1883654023
							  * (Class696_Sub47
							     .anInt11032)),
						 (float) ((1890162443
							   * (class259
							      .anInt2642))
							  << 2));
				    } else if (-174799205 * Class700.anInt8779
					       == 5)
					class435.method6963
					    ((float) i_84_, (float) i_85_,
					     (float) i_82_, (float) i_83_,
					     Class453_Sub3
						 .aClass309_Sub1_10316
						 .method5499(1169399054),
					     Class453_Sub3
						 .aClass309_Sub1_10316
						 .method5500((byte) 72),
					     (float) (-1445589163
						      * Class434.anInt4827),
					     (float) (-1883654023
						      * (Class696_Sub47
							 .anInt11032)));
				    else
					class435.method6963
					    ((float) i_84_, (float) i_85_,
					     (float) i_82_, (float) i_83_,
					     (float) i_86_, (float) i_87_,
					     (float) (Class434.anInt4827
						      * -1445589163),
					     (float) (-1883654023
						      * (Class696_Sub47
							 .anInt11032)));
				    Class501.aClass182_5564
					.method3252(class435);
				    Class501.aClass182_5564.method3188(2, 0);
				    if (class259.aBool2646)
					Class501.aClass182_5564
					    .method3235(false);
				    if (class259.aBool2633) {
					client.aClass444_11078.method7141
					    (1.0F, 0.0F, 0.0F,
					     (Class436.method7071
					      (class259.anInt2636
					       * -106078709)));
					client.aClass444_11078.method7142
					    (0.0F, 1.0F, 0.0F,
					     (Class436.method7071
					      (1523980585
					       * class259.anInt2637)));
					client.aClass444_11078.method7142
					    (0.0F, 0.0F, 1.0F,
					     Class436.method7071((class259
								  .anInt2620)
								 * -30526621));
					client.aClass444_11078.method7147
					    ((float) (class259.anInt2639
						      * 684484425),
					     (float) (class259.anInt2640
						      * 1115037587),
					     (float) (-378964111
						      * class259.anInt2641));
				    } else {
					int i_88_
					    = ((1890162443 * class259.anInt2642
						<< 2)
					       * (Class436.anIntArray4831
						  [((class259.anInt2636
						     * -106078709)
						    << 3)])) >> 14;
					int i_89_
					    = ((class259.anInt2642 * 1890162443
						<< 2)
					       * (Class436.anIntArray4838
						  [((-106078709
						     * class259.anInt2636)
						    << 3)])) >> 14;
					client.aClass444_11078.method7141
					    (0.0F, 0.0F, 1.0F,
					     (Class436.method7071
					      (-(-30526621
						 * class259.anInt2620) << 3)));
					client.aClass444_11078.method7142
					    (0.0F, 1.0F, 0.0F,
					     (Class436.method7071
					      (1523980585 * class259.anInt2637
					       << 3)));
					client.aClass444_11078.method7147
					    ((float) ((1248120695
						       * class259.anInt2634)
						      << 2),
					     (float) (i_77_
						      + (i_88_
							 + ((-1854178829
							     * (class259
								.anInt2628))
							    << 2))),
					     (float) (((-1854178829
							* class259.anInt2628)
						       << 2)
						      + i_89_));
					client.aClass444_11078.method7142
					    (1.0F, 0.0F, 0.0F,
					     Class436.method7071(((class259
								   .anInt2636)
								  * -106078709)
								 << 3));
				    }
				    class259.method4685((Class501
							 .aClass182_5564),
							class179,
							client.aClass444_11078,
							client.anInt11083,
							-1462290935);
				    Class501.aClass182_5564.method3580();
				    Class501.aClass182_5564.method3186(true);
				    Class501.aClass182_5564.method3184(i_33_,
								       i_34_,
								       i_35_,
								       i_36_);
				    if (client.aBool11382)
					Class501.aClass182_5564.method3185
					    (i_43_, i_44_,
					     (-1694810043 * class259.anInt2602
					      + i_43_),
					     (class259.anInt2598 * 2054207119
					      + i_44_));
				    if (class259.aBool2656)
					client.aClass507_11137.method8361
					    ((byte) 11).method10445
					    (((float) (1677835233
						       * class259.anInt2662)
					      / 256.0F),
					     ((float) (1051671267
						       * class259.anInt2689)
					      / 256.0F),
					     ((float) (199863183
						       * class259.anInt2762)
					      / 256.0F),
					     -1640513185 * class259.anInt2663,
					     class259.anInt2657 * -842365161,
					     class259.anInt2658 * 342497425,
					     class259.anInt2659 * -1783124029,
					     1937061817 * class259.anInt2674,
					     358134275);
				    else
					client.aClass507_11137.method8361
					    ((byte) 102)
					    .method10447(-674542031);
				    class179.method2953(client.aClass444_11078,
							null, 1);
				    if (!class259.aBool2645
					&& class259.aClass633_2661 != null)
					Class501.aClass182_5564.method3412
					    (class259.aClass633_2661
						 .method10329());
				    if (client.aBool11382)
					Class501.aClass182_5564.method3184
					    (i_33_, i_34_, i_35_, i_36_);
				    Class501.aClass182_5564.method3186(false);
				    Class501.aClass182_5564.method3480();
				    Class501.aClass182_5564.method3184(i_33_,
								       i_34_,
								       i_35_,
								       i_36_);
				    if (class259.aBool2656)
					client.aClass507_11137.method8361
					    ((byte) 7).method10447(-674542031);
				    if (class259.aBool2646)
					Class501.aClass182_5564
					    .method3235(true);
				}
			    } else if (9 == class259.anInt2590 * 2010235789) {
				int i_90_;
				int i_91_;
				int i_92_;
				int i_93_;
				if (class259.aBool2671) {
				    i_90_ = i_43_;
				    i_91_ = i_44_ + (2054207119
						     * class259.anInt2598);
				    i_92_ = (class259.anInt2602 * -1694810043
					     + i_43_);
				    i_93_ = i_44_;
				} else {
				    i_90_ = i_43_;
				    i_91_ = i_44_;
				    i_92_ = (-1694810043 * class259.anInt2602
					     + i_43_);
				    i_93_ = i_44_ + (2054207119
						     * class259.anInt2598);
				}
				if (-727391899 * class259.anInt2619 == 1)
				    Class501.aClass182_5564.method3201
					(i_90_, i_91_, i_92_, i_93_,
					 (~0xffffff
					  | class259.anInt2638 * 1943498005),
					 0);
				else
				    Class501.aClass182_5564.method3497
					(i_90_, i_91_, i_92_, i_93_,
					 (~0xffffff
					  | 1943498005 * class259.anInt2638),
					 class259.anInt2619 * -727391899, 0);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static final void method3614(Class182 class182, Textures class180,
				 byte i) {
	if (100 != 294186987 * Class556_Sub1.anInt10625
	    && null != Class556_Sub1.aClass525_Sub16_Sub6_7469) {
	    Class251.method4508((byte) 8);
	    Class251.method4508((byte) 8);
	    if (Class556_Sub1.anInt10625 * 294186987 < 10) {
		for (int i_94_ = 0;
		     i_94_ < Class556_Sub1.aClass175ArrayArray10637.length;
		     i_94_++) {
		    for (int i_95_ = 0;
			 i_95_ < (Class556_Sub1.aClass175ArrayArray10637
				  [i_94_]).length;
			 i_95_++) {
			Class462.idx_8.method7506
			    ((Class556_Sub1.aClass623_7468.anIntArrayArray8118
			      [i_94_][i_95_]),
			     -298497567);
			Class276.aClass458_2875.method7506
			    ((Class556_Sub1.aClass623_7468.anIntArrayArray8118
			      [i_94_][i_95_]),
			     593782155);
		    }
		}
		if (!Class556_Sub1.aClass458_7471.method7486
		     (Class556_Sub1.aClass525_Sub16_Sub6_7469.aString11776,
		      723689816)) {
		    Class556_Sub1.anInt10625
			= (Class597.idx_41.method7499
			   ((Class556_Sub1.aClass525_Sub16_Sub6_7469
			     .aString11776),
			    -483064353)) / 10 * 587448515;
		    return;
		}
		Class556_Sub1.anInt10625 = 1579517854;
	    }
	    if (10 == 294186987 * Class556_Sub1.anInt10625) {
		Class556_Sub1.anInt7483
		    = (Class556_Sub1.aClass525_Sub16_Sub6_7469.anInt11773
		       * 920415765) >> 6 << 6;
		Class556_Sub1.anInt7484
		    = 1559325441 * (Class556_Sub1.aClass525_Sub16_Sub6_7469
				    .anInt11775) >> 6 << 6;
		Class556_Sub1.anInt7502
		    = 64 + ((-1604213539 * (Class556_Sub1
					    .aClass525_Sub16_Sub6_7469
					    .anInt11774)
			     >> 6 << 6)
			    - Class556_Sub1.anInt7483);
		Class556_Sub1.anInt7521
		    = 64 + (((Class556_Sub1.aClass525_Sub16_Sub6_7469
			      .anInt11772) * -1270260779
			     >> 6 << 6)
			    - Class556_Sub1.anInt7484);
		int[] is = new int[3];
		int i_96_ = -1;
		int i_97_ = -1;
		Class446 class446
		    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818
		       ().aClass446_4807);
		Class600 class600
		    = client.aClass507_11137.method8350(890555246);
		if (Class556_Sub1.aClass525_Sub16_Sub6_7469.method18275
		    (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867,
		     (((int) class446.aFloat4895 >> 9)
		      + class600.anInt7858 * -1227002079),
		     (1429253007 * class600.anInt7860
		      + ((int) class446.aFloat4897 >> 9)),
		     is, -1412374086)) {
		    i_96_ = is[1] - Class556_Sub1.anInt7483;
		    i_97_ = is[2] - Class556_Sub1.anInt7484;
		}
		if (!Class556_Sub1.aBool10635 && i_96_ >= 0
		    && i_96_ < Class556_Sub1.anInt7502 && i_97_ >= 0
		    && i_97_ < Class556_Sub1.anInt7521) {
		    i_96_ += (int) (Math.random() * 10.0) - 5;
		    i_97_ += (int) (Math.random() * 10.0) - 5;
		    Class144_Sub1.anInt9141 = i_96_ * -1716705553;
		    Class696_Sub13.anInt10912 = i_97_ * -2002372447;
		} else if (-1 != -386625813 * Class556_Sub1.anInt10619
			   && -269729169 * Class556_Sub1.anInt10630 != -1) {
		    Class556_Sub1.aClass525_Sub16_Sub6_7469.method18274
			(Class556_Sub1.anInt10619 * -386625813,
			 Class556_Sub1.anInt10630 * -269729169, is,
			 1685088166);
		    if (null != is) {
			Class144_Sub1.anInt9141
			    = (is[1] - Class556_Sub1.anInt7483) * -1716705553;
			Class696_Sub13.anInt10912
			    = (is[2] - Class556_Sub1.anInt7484) * -2002372447;
		    }
		    Class556_Sub1.anInt10630 = 1228317553;
		    Class556_Sub1.anInt10619 = 426071613;
		    Class556_Sub1.aBool10635 = false;
		} else {
		    Class556_Sub1.aClass525_Sub16_Sub6_7469.method18274
			((Class556_Sub1.aClass525_Sub16_Sub6_7469.anInt11770
			  * -197349795) >> 14 & 0x3fff,
			 (Class556_Sub1.aClass525_Sub16_Sub6_7469.anInt11770
			  * -197349795) & 0x3fff,
			 is, 1364736642);
		    Class144_Sub1.anInt9141
			= -1716705553 * (is[1] - Class556_Sub1.anInt7483);
		    Class696_Sub13.anInt10912
			= -2002372447 * (is[2] - Class556_Sub1.anInt7484);
		}
		if (25 == -368328657 * (Class556_Sub1.aClass525_Sub16_Sub6_7469
					.anInt11766)) {
		    Class556_Sub1.aFloat7479 = 2.0F;
		    Class556_Sub1.aFloat7526 = 2.0F;
		} else if (-368328657 * (Class556_Sub1
					 .aClass525_Sub16_Sub6_7469.anInt11766)
			   == 37) {
		    Class556_Sub1.aFloat7479 = 3.0F;
		    Class556_Sub1.aFloat7526 = 3.0F;
		} else if (-368328657 * (Class556_Sub1
					 .aClass525_Sub16_Sub6_7469.anInt11766)
			   == 50) {
		    Class556_Sub1.aFloat7479 = 4.0F;
		    Class556_Sub1.aFloat7526 = 4.0F;
		} else if (75 == (Class556_Sub1.aClass525_Sub16_Sub6_7469
				  .anInt11766) * -368328657) {
		    Class556_Sub1.aFloat7479 = 6.0F;
		    Class556_Sub1.aFloat7526 = 6.0F;
		} else if (100 == -368328657 * (Class556_Sub1
						.aClass525_Sub16_Sub6_7469
						.anInt11766)) {
		    Class556_Sub1.aFloat7479 = 8.0F;
		    Class556_Sub1.aFloat7526 = 8.0F;
		} else if ((Class556_Sub1.aClass525_Sub16_Sub6_7469.anInt11766
			    * -368328657)
			   == 200) {
		    Class556_Sub1.aFloat7479 = 16.0F;
		    Class556_Sub1.aFloat7526 = 16.0F;
		} else {
		    Class556_Sub1.aFloat7479 = 8.0F;
		    Class556_Sub1.aFloat7526 = 8.0F;
		}
		Class556_Sub1.anInt7476 = (int) Class556_Sub1.aFloat7526 >> 1;
		Class556_Sub1.aByteArrayArrayArray7461
		    = Class239.method4421(Class556_Sub1.anInt7476, 1508004513);
		ConfigEntry.method1221(-777596929);
		Class556_Sub1.method9263();
		Class447.aClass709_4900 = new Class709();
		Class556_Sub1.anInt7507 += (int) (Math.random() * 5.0) - 2;
		if (Class556_Sub1.anInt7507 < -8)
		    Class556_Sub1.anInt7507 = -8;
		if (Class556_Sub1.anInt7507 > 8)
		    Class556_Sub1.anInt7507 = 8;
		Class556_Sub1.anInt7485 += (int) (Math.random() * 5.0) - 2;
		if (Class556_Sub1.anInt7485 < -16)
		    Class556_Sub1.anInt7485 = -16;
		if (Class556_Sub1.anInt7485 > 16)
		    Class556_Sub1.anInt7485 = 16;
		Class556_Sub1.method9304(class180,
					 Class556_Sub1.anInt7507 >> 2 << 10,
					 Class556_Sub1.anInt7485 >> 1);
		Class556_Sub1.aClass40_Sub2_7464.method17397(1024, 256,
							     -615092481);
		Class556_Sub1.aClass40_Sub17_7465.method17487(256, 256,
							      1791968101);
		Class556_Sub1.aClass40_Sub11_7463.method1018(4096, (byte) 84);
		Class575.aClass40_Sub10_7647.method1018(256, (byte) 105);
		Class556_Sub1.anInt10625 = -1135931588;
	    } else if (20 == Class556_Sub1.anInt10625 * 294186987) {
		if (Class556_Sub1.aBool7475) {
		    if (Class556_Sub1.method9255(class182,
						 Class556_Sub1.anInt7507,
						 Class556_Sub1.anInt7485,
						 Class556_Sub1.aBool7475))
			Class556_Sub1.anInt10625 = 887172532;
		} else {
		    Class585_Sub1.method16485(true, -1566085960);
		    Class556_Sub1.method9255(class182, Class556_Sub1.anInt7507,
					     Class556_Sub1.anInt7485,
					     Class556_Sub1.aBool7475);
		    Class556_Sub1.anInt10625 = 887172532;
		    Class585_Sub1.method16485(true, -1654125590);
		    Class473.method7753((byte) 2);
		}
	    } else if (60 == 294186987 * Class556_Sub1.anInt10625) {
		if (Class556_Sub1.aClass458_7471.method7493
		    (Class556_Sub1.aClass525_Sub16_Sub6_7469.aString11776,
		     65280)) {
		    if (!Class556_Sub1.aClass458_7471.method7486
			 (Class556_Sub1.aClass525_Sub16_Sub6_7469.aString11776,
			  -486106372))
			return;
		    Class556_Sub1.aClass529_7509
			= Class496.method8157(Class556_Sub1.aClass458_7471,
					      (Class556_Sub1
					       .aClass525_Sub16_Sub6_7469
					       .aString11776),
					      client.aBool11230, 842731505);
		} else
		    Class556_Sub1.aClass529_7509 = new Class529(0);
		Class556_Sub1.method9259();
		Class556_Sub1.anInt10625 = -1828276910;
		Class585_Sub1.method16485(true, -407979226);
		Class473.method7753((byte) 2);
	    } else if (Class556_Sub1.anInt10625 * 294186987 >= 70) {
		for (int i_98_ = 0; i_98_ < 3; i_98_++) {
		    for (int i_99_ = 0; i_99_ < 5; i_99_++) {
			if ((Class556_Sub1.aClass175ArrayArray10637[i_98_]
			     [i_99_]) == null
			    || null == (Class556_Sub1.aClass7ArrayArray10633
					[i_98_][i_99_])) {
			    Class556_Sub1.aClass175ArrayArray10637[i_98_]
				[i_99_]
				= (Class175) (Class7.aClass404_53.method6578
					      (client.anInterface50_11252,
					       (Class556_Sub1.aClass623_7468
						.anIntArrayArray8118[i_98_]
						[i_99_]),
					       true, true, -1392827995));
			    Class556_Sub1.aClass7ArrayArray10633[i_98_][i_99_]
				= (Class7.aClass404_53.method6580
				   (client.anInterface50_11252,
				    (Class556_Sub1.aClass623_7468
				     .anIntArrayArray8118[i_98_][i_99_]),
				    109320336));
			    if ((Class556_Sub1.aClass175ArrayArray10637[i_98_]
				 [i_99_]) != null
				&& null != (Class556_Sub1
					    .aClass7ArrayArray10633[i_98_]
					    [i_99_]))
				Class556_Sub1.anInt10625 += 1762345545;
			    else
				return;
			}
		    }
		}
		Class556_Sub1.anInt10625 = -1384690644;
		System.gc();
	    }
	}
    }
}
