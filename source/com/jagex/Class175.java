/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public abstract class Class175
{
    static int anInt1863;
    Class182 aClass182_1864;
    public static final int anInt1865 = 0;
    public static final int anInt1866 = 1;
    public static final int anInt1867 = 0;
    static int anInt1868;
    static int anInt1869 = -1016612815;
    static int anInt1870;
    Class7 aClass7_1871;
    static int anInt1872;
    static int anInt1873;
    static int anInt1874 = -1409337013;
    static int anInt1875;
    static String[] aStringArray1876;
    
    abstract void method2835(char c, int i, int i_0_, int i_1_, boolean bool,
			     Class152 class152, int i_2_, int i_3_);
    
    void method2836(int i, int i_4_) {
	anInt1869 = -1016612815;
	anInt1874 = -1409337013;
	anInt1863 = (anInt1870 = 1358286893 * i) * 2129331327;
	anInt1868 = 0;
	anInt1875 = 0;
	if (i_4_ == -1)
	    i_4_ = 0;
	anInt1873 = (anInt1872 = i_4_ * 1664277039) * 1974450301;
    }
    
    public int method2837(String string, int i, int i_5_, int i_6_, int i_7_,
			  int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
			  Class157[] class157s, int[] is, Class152 class152,
			  int i_13_, int i_14_) {
	return method2840(string, i, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_,
			  i_11_, i_12_, 0, class157s, is, class152, i_13_,
			  i_14_, 171652946);
    }
    
    public void method2838(String string, int i, int i_15_, int i_16_,
			   int i_17_, byte i_18_) {
	if (null != string) {
	    method2846(i_16_, i_17_, -384260582);
	    method2881(string,
		       i - aClass7_1871.method561(string, 1329837005) / 2,
		       i_15_, null, null, null, 0, 0, -1022016143);
	}
    }
    
    public int method2839(String string, int i, int i_19_, int i_20_,
			  int i_21_, int i_22_, int i_23_, int i_24_,
			  int i_25_, int i_26_, Class157[] class157s, int[] is,
			  Class152 class152, int i_27_, int i_28_, int i_29_) {
	return method2840(string, i, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_,
			  i_25_, i_26_, 0, class157s, is, class152, i_27_,
			  i_28_, 20017243);
    }
    
    public int method2840(String string, int i, int i_30_, int i_31_,
			  int i_32_, int i_33_, int i_34_, int i_35_,
			  int i_36_, int i_37_, int i_38_,
			  Class157[] class157s, int[] is, Class152 class152,
			  int i_39_, int i_40_, int i_41_) {
	if (null == string)
	    return 0;
	method2846(i_33_, i_34_, 299950899);
	if (i_37_ == 0)
	    i_37_ = aClass7_1871.anInt46 * 1938404803;
	int[] is_42_;
	if (i_32_ < (385749773 * aClass7_1871.anInt49
		     + aClass7_1871.anInt51 * 1921008003 + i_37_)
	    && i_32_ < i_37_ + i_37_)
	    is_42_ = null;
	else
	    is_42_ = new int[] { i_31_ };
	int i_43_ = aClass7_1871.method604(string, is_42_, aStringArray1876,
					   class157s, (byte) -11);
	if (i_38_ == -1) {
	    i_38_ = i_32_ / i_37_;
	    if (i_38_ <= 0)
		i_38_ = 1;
	}
	if (i_38_ > 0 && i_43_ >= i_38_) {
	    aStringArray1876[i_38_ - 1]
		= aClass7_1871.method609(aStringArray1876[i_38_ - 1], i_31_,
					 class157s, (byte) 64);
	    i_43_ = i_38_;
	}
	if (i_36_ == 3 && 1 == i_43_)
	    i_36_ = 1;
	int i_44_;
	if (0 == i_36_)
	    i_44_ = i_30_ + aClass7_1871.anInt49 * 385749773;
	else if (i_36_ == 1)
	    i_44_
		= ((i_32_ - aClass7_1871.anInt49 * 385749773
		    - 1921008003 * aClass7_1871.anInt51 - (i_43_ - 1) * i_37_)
		   / 2) + (385749773 * aClass7_1871.anInt49 + i_30_);
	else if (i_36_ == 2)
	    i_44_ = (i_32_ + i_30_ - 1921008003 * aClass7_1871.anInt51
		     - i_37_ * (i_43_ - 1));
	else {
	    int i_45_
		= ((i_32_ - aClass7_1871.anInt49 * 385749773
		    - aClass7_1871.anInt51 * 1921008003 - (i_43_ - 1) * i_37_)
		   / (i_43_ + 1));
	    if (i_45_ < 0)
		i_45_ = 0;
	    i_44_ = i_45_ + (i_30_ + 385749773 * aClass7_1871.anInt49);
	    i_37_ += i_45_;
	}
	for (int i_46_ = 0; i_46_ < i_43_; i_46_++) {
	    if (0 == i_35_)
		method2881(aStringArray1876[i_46_], i, i_44_, class157s, is,
			   class152, i_39_, i_40_, 923903172);
	    else if (i_35_ == 1)
		method2881(aStringArray1876[i_46_],
			   i + (i_31_
				- aClass7_1871.method561((aStringArray1876
							  [i_46_]),
							 2130931442)) / 2,
			   i_44_, class157s, is, class152, i_39_, i_40_,
			   429416681);
	    else if (2 == i_35_)
		method2881(aStringArray1876[i_46_],
			   (i_31_ + i
			    - aClass7_1871.method561(aStringArray1876[i_46_],
						     1261167227)),
			   i_44_, class157s, is, class152, i_39_, i_40_,
			   -314149874);
	    else if (i_43_ - 1 == i_46_)
		method2881(aStringArray1876[i_46_], i, i_44_, class157s, is,
			   class152, i_39_, i_40_, 1673531154);
	    else {
		method2848(aStringArray1876[i_46_], i_31_, (byte) 3);
		method2881(aStringArray1876[i_46_], i, i_44_, class157s, is,
			   class152, i_39_, i_40_, 785962552);
		anInt1868 = 0;
	    }
	    i_44_ += i_37_;
	}
	return i_43_;
    }
    
    public void method2841(String string, int i, int i_47_, int i_48_,
			   int i_49_, int i_50_, byte i_51_) {
	if (null != string) {
	    method2846(i_48_, i_49_, 1822866860);
	    int i_52_ = string.length();
	    int[] is = new int[i_52_];
	    for (int i_53_ = 0; i_53_ < i_52_; i_53_++)
		is[i_53_] = (int) (Math.sin((double) i_50_ / 5.0
					    + (double) i_53_ / 2.0)
				   * 5.0);
	    method2850(string,
		       i - aClass7_1871.method561(string, -938449146) / 2,
		       i_47_, null, null, null, is, 928444730);
	}
    }
    
    public int method2842(String string, int i, int i_54_, int i_55_,
			  int i_56_, int i_57_, int i_58_, int i_59_,
			  int i_60_, int i_61_, Class157[] class157s, int[] is,
			  Class152 class152, int i_62_, int i_63_) {
	return method2840(string, i, i_54_, i_55_, i_56_, i_57_, i_58_, i_59_,
			  i_60_, i_61_, 0, class157s, is, class152, i_62_,
			  i_63_, -1887573609);
    }
    
    public void method2843(String string, int i, int i_64_, int i_65_,
			   int i_66_, int i_67_, int i_68_, byte i_69_) {
	if (string != null) {
	    method2846(i_65_, i_66_, 1453653166);
	    double d = 7.0 - (double) i_68_ / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i_70_ = string.length();
	    int[] is = new int[i_70_];
	    for (int i_71_ = 0; i_71_ < i_70_; i_71_++)
		is[i_71_] = (int) (Math.sin((double) i_67_ / 1.0
					    + (double) i_71_ / 1.5)
				   * d);
	    method2850(string,
		       i - aClass7_1871.method561(string, 1626632705) / 2,
		       i_64_, null, null, null, is, 2042367163);
	}
    }
    
    public int method2844(String string, int i, int i_72_, int i_73_,
			  int i_74_, Random random, int i_75_,
			  Class157[] class157s, int[] is, int i_76_) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_75_);
	int i_77_ = 192 + (random.nextInt() & 0x1f);
	method2846(i_77_ << 24 | i_73_ & 0xffffff,
		   i_77_ << 24 | i_74_ & 0xffffff, 183409180);
	int i_78_ = string.length();
	int[] is_79_ = new int[i_78_];
	int i_80_ = 0;
	for (int i_81_ = 0; i_81_ < i_78_; i_81_++) {
	    is_79_[i_81_] = i_80_;
	    if ((random.nextInt() & 0x3) == 0)
		i_80_++;
	}
	method2850(string, i, i_72_, class157s, is, is_79_, null, 2067653407);
	return i_80_;
    }
    
    public int method2845(String string, int i, int i_82_, int i_83_,
			  int i_84_, int i_85_, int i_86_, int i_87_,
			  int i_88_, Random random, int i_89_, int[] is,
			  Class157[] class157s, int[] is_90_, byte i_91_) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_89_);
	int i_92_ = 192 + (random.nextInt() & 0x1f);
	method2846(i_92_ << 24 | i_85_ & 0xffffff,
		   i_86_ == -1 ? 0 : i_92_ << 24 | i_86_ & 0xffffff,
		   1800154343);
	int i_93_ = string.length();
	int[] is_94_ = new int[i_93_];
	int i_95_ = 0;
	for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
	    is_94_[i_96_] = i_95_;
	    if ((random.nextInt() & 0x3) == 0)
		i_95_++;
	}
	int i_97_ = i;
	int i_98_ = aClass7_1871.anInt49 * 385749773 + i_82_;
	int i_99_ = -1;
	if (i_88_ == 1)
	    i_98_ += (i_84_ - 385749773 * aClass7_1871.anInt49
		      - aClass7_1871.anInt51 * 1921008003) / 2;
	else if (2 == i_88_)
	    i_98_ = i_84_ + i_82_ - 1921008003 * aClass7_1871.anInt51;
	if (i_87_ == 1) {
	    i_99_ = aClass7_1871.method561(string, -1601953702) + i_95_;
	    i_97_ += (i_83_ - i_99_) / 2;
	} else if (2 == i_87_) {
	    i_99_ = aClass7_1871.method561(string, 1935752555) + i_95_;
	    i_97_ += i_83_ - i_99_;
	}
	method2850(string, i_97_, i_98_, class157s, is_90_, is_94_, null,
		   1076383390);
	if (null != is) {
	    if (i_99_ == -1)
		i_99_ = aClass7_1871.method561(string, -1151849617) + i_95_;
	    is[0] = i_97_;
	    is[1] = i_98_ - 385749773 * aClass7_1871.anInt49;
	    is[2] = i_99_;
	    is[3] = (aClass7_1871.anInt49 * 385749773
		     + aClass7_1871.anInt51 * 1921008003);
	}
	return i_95_;
    }
    
    void method2846(int i, int i_100_, int i_101_) {
	anInt1869 = -1016612815;
	anInt1874 = -1409337013;
	anInt1863 = (anInt1870 = 1358286893 * i) * 2129331327;
	anInt1868 = 0;
	anInt1875 = 0;
	if (i_100_ == -1)
	    i_100_ = 0;
	anInt1873 = (anInt1872 = i_100_ * 1664277039) * 1974450301;
    }
    
    void method2847(String string, int i) {
	try {
	    if (string.startsWith("col="))
		anInt1863 = ((anInt1863 * 320362971 & ~0xffffff
			      | Class332.method5819(string.substring(4), 16,
						    -1305623375) & 0xffffff)
			     * 1082260051);
	    else if (string.equals("/col"))
		anInt1863 = (320362971 * anInt1863 & ~0xffffff
			     | anInt1870 * 545587109 & 0xffffff) * 1082260051;
	    if (string.startsWith("argb="))
		anInt1863 = Class332.method5819(string.substring(5), 16,
						-394983142) * 1082260051;
	    else if (string.equals("/argb"))
		anInt1863 = 2129331327 * anInt1870;
	    else if (string.startsWith("str="))
		anInt1869 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(4), 16,
						   -132890809)) * 1016612815;
	    else if (string.equals("str"))
		anInt1869 = 1016612815 * (anInt1863 * 320362971 & ~0xffffff
					  | 0x800000);
	    else if (string.equals("/str"))
		anInt1869 = -1016612815;
	    else if (string.startsWith("u="))
		anInt1874 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(2), 16,
						   -1147430170)) * 1409337013;
	    else if (string.equals("u"))
		anInt1874 = 1409337013 * (320362971 * anInt1863 & ~0xffffff);
	    else if (string.equals("/u"))
		anInt1874 = -1409337013;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1873 = 0;
	    else if (string.startsWith("shad="))
		anInt1873 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(5), 16,
						   -201099093)) * -1647881997;
	    else if (string.equals("shad"))
		anInt1873 = -1647881997 * (320362971 * anInt1863 & ~0xffffff);
	    else if (string.equals("/shad"))
		anInt1873 = anInt1872 * 1974450301;
	    else if (string.equals("br"))
		method2846(anInt1870 * 545587109, -2066305841 * anInt1872,
			   -1293457950);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    void method2848(String string, int i, byte i_102_) {
	int i_103_ = 0;
	boolean bool = false;
	for (int i_104_ = 0; i_104_ < string.length(); i_104_++) {
	    char c = string.charAt(i_104_);
	    if (c == '<')
		bool = true;
	    else if ('>' == c)
		bool = false;
	    else if (!bool && c == ' ')
		i_103_++;
	}
	if (i_103_ > 0)
	    anInt1868 = ((i - aClass7_1871.method561(string, -587577874) << 8)
			 / i_103_ * -884104575);
    }
    
    public void method2849(String string, int i, int i_105_, int i_106_,
			   int i_107_, int i_108_, int i_109_) {
	if (null != string) {
	    method2846(i_106_, i_107_, 767380080);
	    int i_110_ = string.length();
	    int[] is = new int[i_110_];
	    int[] is_111_ = new int[i_110_];
	    for (int i_112_ = 0; i_112_ < i_110_; i_112_++) {
		is[i_112_] = (int) (Math.sin((double) i_112_ / 5.0
					     + (double) i_108_ / 5.0)
				    * 5.0);
		is_111_[i_112_] = (int) (Math.sin((double) i_108_ / 5.0
						  + (double) i_112_ / 3.0)
					 * 5.0);
	    }
	    method2850(string,
		       i - aClass7_1871.method561(string, -430493890) / 2,
		       i_105_, null, null, is, is_111_, 1277759167);
	}
    }
    
    void method2850(String string, int i, int i_113_, Class157[] class157s,
		    int[] is, int[] is_114_, int[] is_115_, int i_116_) {
	i_113_ -= aClass7_1871.anInt46 * 1938404803;
	int i_117_ = -1;
	int i_118_ = -1;
	int i_119_ = 0;
	int i_120_ = string.length();
	for (int i_121_ = 0; i_121_ < i_120_; i_121_++) {
	    char c
		= (char) (Class28.method908(string.charAt(i_121_), -2099340796)
			  & 0xff);
	    if (60 == c)
		i_117_ = i_121_;
	    else {
		if (62 == c && i_117_ != -1) {
		    String string_122_ = string.substring(i_117_ + 1, i_121_);
		    i_117_ = -1;
		    if (string_122_.equals("lt"))
			c = '<';
		    else if (string_122_.equals("gt"))
			c = '>';
		    else if (string_122_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_122_.equals("shy"))
			c = '\u00ad';
		    else if (string_122_.equals("times"))
			c = '\u00d7';
		    else if (string_122_.equals("euro"))
			c = '\u0080';
		    else if (string_122_.equals("copy"))
			c = '\u00a9';
		    else if (string_122_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_122_.startsWith("img=")) {
			    try {
				int i_123_;
				if (is_114_ != null)
				    i_123_ = is_114_[i_119_];
				else
				    i_123_ = 0;
				int i_124_;
				if (is_115_ != null)
				    i_124_ = is_115_[i_119_];
				else
				    i_124_ = 0;
				i_119_++;
				int i_125_
				    = Class275.method5102(string_122_
							      .substring(4),
							  -1637441639);
				Class157 class157 = class157s[i_125_];
				int i_126_ = (is != null ? is[i_125_]
					      : class157.method2472());
				class157.method2479(i_123_ + i,
						    ((aClass7_1871.anInt46
						      * 1938404803)
						     + i_113_ - i_126_
						     + i_124_),
						    1, -1, 1);
				i += class157s[i_125_].method12();
				i_118_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_122_.startsWith("sprite=")) {
			    if (null != aClass7_1871.anInterface4_52) {
				try {
				    int i_127_ = -1;
				    int i_128_ = 0;
				    int i_129_ = string_122_.indexOf(',');
				    if (i_129_ == -1)
					i_127_ = (Class275.method5102
						  (string_122_.substring(7),
						   -1771258377));
				    else {
					i_127_
					    = (Class275.method5102
					       (string_122_.substring(7,
								      i_129_),
						-476539468));
					i_128_ = (Class275.method5102
						  (string_122_
						       .substring(1 + i_129_),
						   -2093417373));
				    }
				    int i_130_;
				    if (null != is_114_)
					i_130_ = is_114_[i_119_];
				    else
					i_130_ = 0;
				    int i_131_;
				    if (null != is_115_)
					i_131_ = is_115_[i_119_];
				    else
					i_131_ = 0;
				    i_119_++;
				    Class157[] class157s_132_
					= (aClass7_1871.anInterface4_52
					       .method34
					   (aClass182_1864, i_127_,
					    1122007968));
				    if (null != class157s_132_) {
					int i_133_
					    = Math.min(class157s_132_
							   [i_128_]
							   .method2472(),
						       ((385749773
							 * (aClass7_1871
							    .anInt49))
							+ (aClass7_1871.anInt51
							   * 1921008003)));
					class157s_132_[i_128_].method2479
					    (i_130_ + i,
					     (1938404803 * aClass7_1871.anInt46
					      + (i_113_ + 3) - i_133_
					      + i_131_),
					     1, -1, 1);
					i += class157s_132_[i_128_].method12();
				    }
				    i_118_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2847(string_122_, 1188894404);
			continue;
		    }
		}
		if (-1 == i_117_) {
		    if (-1 != i_118_)
			i += aClass7_1871.method559(i_118_, c, (byte) 4);
		    int i_134_;
		    if (is_114_ != null)
			i_134_ = is_114_[i_119_];
		    else
			i_134_ = 0;
		    int i_135_;
		    if (null != is_115_)
			i_135_ = is_115_[i_119_];
		    else
			i_135_ = 0;
		    i_119_++;
		    if (c != 32) {
			if (0 != (anInt1873 * -1920710597 & ~0xffffff))
			    method2874(c, i_134_ + (i + 1),
				       1 + i_113_ + i_135_,
				       -1920710597 * anInt1873, true);
			method2874(c, i_134_ + i, i_135_ + i_113_,
				   anInt1863 * 320362971, false);
		    } else if (-449274495 * anInt1868 > 0) {
			anInt1875 += -2046028953 * anInt1868;
			i += -703078697 * anInt1875 >> 8;
			anInt1875
			    = -1286081305 * (-703078697 * anInt1875 & 0xff);
		    }
		    int i_136_ = aClass7_1871.method560(c, -1664940945);
		    if (-1 != anInt1869 * -1601478865)
			aClass182_1864.method3192
			    (i,
			     i_113_ + (int) ((double) (1938404803
						       * aClass7_1871.anInt46)
					     * 0.7),
			     i_136_, anInt1869 * -1601478865, -817192327);
		    if (-1 != anInt1874 * -1282902115)
			aClass182_1864.method3192
			    (i, i_113_ + aClass7_1871.anInt46 * 1938404803,
			     i_136_, anInt1874 * -1282902115, -1142469449);
		    i += i_136_;
		    i_118_ = c;
		}
	    }
	}
    }
    
    public void method2851(String string, int i, int i_137_, int i_138_,
			   int i_139_, int i_140_) {
	if (string != null) {
	    method2846(i_138_, i_139_, 1132671376);
	    method2881(string, i, i_137_, null, null, null, 0, 0, 1825480011);
	}
    }
    
    public void method2852(String string, int i, int i_141_, int i_142_,
			   int i_143_, int i_144_) {
	if (null != string) {
	    method2846(i_142_, i_143_, -180220037);
	    method2881(string, i - aClass7_1871.method561(string, -54316271),
		       i_141_, null, null, null, 0, 0, 101974854);
	}
    }
    
    abstract void method2853(char c, int i, int i_145_, int i_146_,
			     boolean bool);
    
    abstract void method2854(char c, int i, int i_147_, int i_148_,
			     boolean bool);
    
    public int method2855(String string, int i, int i_149_, int i_150_,
			  int i_151_, Random random, int i_152_,
			  Class157[] class157s, int[] is) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_152_);
	int i_153_ = 192 + (random.nextInt() & 0x1f);
	method2846(i_153_ << 24 | i_150_ & 0xffffff,
		   i_153_ << 24 | i_151_ & 0xffffff, -1813560814);
	int i_154_ = string.length();
	int[] is_155_ = new int[i_154_];
	int i_156_ = 0;
	for (int i_157_ = 0; i_157_ < i_154_; i_157_++) {
	    is_155_[i_157_] = i_156_;
	    if ((random.nextInt() & 0x3) == 0)
		i_156_++;
	}
	method2850(string, i, i_149_, class157s, is, is_155_, null,
		   1301246136);
	return i_156_;
    }
    
    abstract void method2856(char c, int i, int i_158_, int i_159_,
			     boolean bool);
    
    abstract void method2857(char c, int i, int i_160_, int i_161_,
			     boolean bool, Class152 class152, int i_162_,
			     int i_163_);
    
    abstract void method2858(char c, int i, int i_164_, int i_165_,
			     boolean bool, Class152 class152, int i_166_,
			     int i_167_);
    
    public void method2859(String string, int i, int i_168_, int i_169_,
			   int i_170_) {
	if (string != null) {
	    method2846(i_169_, i_170_, 33686474);
	    method2881(string, i, i_168_, null, null, null, 0, 0, 156265726);
	}
    }
    
    abstract void method2860(char c, int i, int i_171_, int i_172_,
			     boolean bool, Class152 class152, int i_173_,
			     int i_174_);
    
    public void method2861(String string, int i, int i_175_, int i_176_,
			   int i_177_) {
	if (string != null) {
	    method2846(i_176_, i_177_, 588624529);
	    method2881(string, i, i_175_, null, null, null, 0, 0, 1418736560);
	}
    }
    
    public void method2862(String string, int i, int i_178_, int i_179_,
			   int i_180_, int i_181_) {
	if (null != string) {
	    method2846(i_179_, i_180_, 288066890);
	    int i_182_ = string.length();
	    int[] is = new int[i_182_];
	    int[] is_183_ = new int[i_182_];
	    for (int i_184_ = 0; i_184_ < i_182_; i_184_++) {
		is[i_184_] = (int) (Math.sin((double) i_184_ / 5.0
					     + (double) i_181_ / 5.0)
				    * 5.0);
		is_183_[i_184_] = (int) (Math.sin((double) i_181_ / 5.0
						  + (double) i_184_ / 3.0)
					 * 5.0);
	    }
	    method2850(string,
		       i - aClass7_1871.method561(string, -539079850) / 2,
		       i_178_, null, null, is, is_183_, 533601634);
	}
    }
    
    public void method2863(String string, int i, int i_185_, int i_186_,
			   int i_187_) {
	if (null != string) {
	    method2846(i_186_, i_187_, -92200346);
	    method2881(string, i - aClass7_1871.method561(string, 1788751433),
		       i_185_, null, null, null, 0, 0, 1915694897);
	}
    }
    
    public void method2864(String string, int i, int i_188_, int i_189_,
			   int i_190_) {
	if (null != string) {
	    method2846(i_189_, i_190_, -1654146875);
	    method2881(string,
		       i - aClass7_1871.method561(string, -139688786) / 2,
		       i_188_, null, null, null, 0, 0, 265215158);
	}
    }
    
    public void method2865(String string, int i, int i_191_, int i_192_,
			   int i_193_) {
	if (null != string) {
	    method2846(i_192_, i_193_, 1268983984);
	    method2881(string,
		       i - aClass7_1871.method561(string, -1425955662) / 2,
		       i_191_, null, null, null, 0, 0, 1563985878);
	}
    }
    
    void method2866(String string, int i, int i_194_, Class157[] class157s,
		    int[] is, int[] is_195_, int[] is_196_) {
	i_194_ -= aClass7_1871.anInt46 * 1938404803;
	int i_197_ = -1;
	int i_198_ = -1;
	int i_199_ = 0;
	int i_200_ = string.length();
	for (int i_201_ = 0; i_201_ < i_200_; i_201_++) {
	    char c
		= (char) (Class28.method908(string.charAt(i_201_), -2099340796)
			  & 0xff);
	    if (60 == c)
		i_197_ = i_201_;
	    else {
		if (62 == c && i_197_ != -1) {
		    String string_202_ = string.substring(i_197_ + 1, i_201_);
		    i_197_ = -1;
		    if (string_202_.equals("lt"))
			c = '<';
		    else if (string_202_.equals("gt"))
			c = '>';
		    else if (string_202_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_202_.equals("shy"))
			c = '\u00ad';
		    else if (string_202_.equals("times"))
			c = '\u00d7';
		    else if (string_202_.equals("euro"))
			c = '\u0080';
		    else if (string_202_.equals("copy"))
			c = '\u00a9';
		    else if (string_202_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_202_.startsWith("img=")) {
			    try {
				int i_203_;
				if (is_195_ != null)
				    i_203_ = is_195_[i_199_];
				else
				    i_203_ = 0;
				int i_204_;
				if (is_196_ != null)
				    i_204_ = is_196_[i_199_];
				else
				    i_204_ = 0;
				i_199_++;
				int i_205_
				    = Class275.method5102(string_202_
							      .substring(4),
							  -278760324);
				Class157 class157 = class157s[i_205_];
				int i_206_ = (is != null ? is[i_205_]
					      : class157.method2472());
				class157.method2479(i_203_ + i,
						    ((aClass7_1871.anInt46
						      * 1938404803)
						     + i_194_ - i_206_
						     + i_204_),
						    1, -1, 1);
				i += class157s[i_205_].method12();
				i_198_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_202_.startsWith("sprite=")) {
			    if (null != aClass7_1871.anInterface4_52) {
				try {
				    int i_207_ = -1;
				    int i_208_ = 0;
				    int i_209_ = string_202_.indexOf(',');
				    if (i_209_ == -1)
					i_207_ = (Class275.method5102
						  (string_202_.substring(7),
						   -888464070));
				    else {
					i_207_
					    = (Class275.method5102
					       (string_202_.substring(7,
								      i_209_),
						-1627298682));
					i_208_ = (Class275.method5102
						  (string_202_
						       .substring(1 + i_209_),
						   -837350018));
				    }
				    int i_210_;
				    if (null != is_195_)
					i_210_ = is_195_[i_199_];
				    else
					i_210_ = 0;
				    int i_211_;
				    if (null != is_196_)
					i_211_ = is_196_[i_199_];
				    else
					i_211_ = 0;
				    i_199_++;
				    Class157[] class157s_212_
					= (aClass7_1871.anInterface4_52
					       .method34
					   (aClass182_1864, i_207_,
					    1122007968));
				    if (null != class157s_212_) {
					int i_213_
					    = Math.min(class157s_212_
							   [i_208_]
							   .method2472(),
						       ((385749773
							 * (aClass7_1871
							    .anInt49))
							+ (aClass7_1871.anInt51
							   * 1921008003)));
					class157s_212_[i_208_].method2479
					    (i_210_ + i,
					     (1938404803 * aClass7_1871.anInt46
					      + (i_194_ + 3) - i_213_
					      + i_211_),
					     1, -1, 1);
					i += class157s_212_[i_208_].method12();
				    }
				    i_198_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2847(string_202_, 1287691546);
			continue;
		    }
		}
		if (-1 == i_197_) {
		    if (-1 != i_198_)
			i += aClass7_1871.method559(i_198_, c, (byte) 76);
		    int i_214_;
		    if (is_195_ != null)
			i_214_ = is_195_[i_199_];
		    else
			i_214_ = 0;
		    int i_215_;
		    if (null != is_196_)
			i_215_ = is_196_[i_199_];
		    else
			i_215_ = 0;
		    i_199_++;
		    if (c != 32) {
			if (0 != (anInt1873 * -1920710597 & ~0xffffff))
			    method2874(c, i_214_ + (i + 1),
				       1 + i_194_ + i_215_,
				       -1920710597 * anInt1873, true);
			method2874(c, i_214_ + i, i_215_ + i_194_,
				   anInt1863 * 320362971, false);
		    } else if (-449274495 * anInt1868 > 0) {
			anInt1875 += -2046028953 * anInt1868;
			i += -703078697 * anInt1875 >> 8;
			anInt1875
			    = -1286081305 * (-703078697 * anInt1875 & 0xff);
		    }
		    int i_216_ = aClass7_1871.method560(c, -1664940945);
		    if (-1 != anInt1869 * -1601478865)
			aClass182_1864.method3192
			    (i,
			     i_194_ + (int) ((double) (1938404803
						       * aClass7_1871.anInt46)
					     * 0.7),
			     i_216_, anInt1869 * -1601478865, -159778445);
		    if (-1 != anInt1874 * -1282902115)
			aClass182_1864.method3192
			    (i, i_194_ + aClass7_1871.anInt46 * 1938404803,
			     i_216_, anInt1874 * -1282902115, -303266613);
		    i += i_216_;
		    i_198_ = c;
		}
	    }
	}
    }
    
    public void method2867(String string, int i, int i_217_, int i_218_,
			   int i_219_, int i_220_) {
	if (null != string) {
	    method2846(i_218_, i_219_, 2138369809);
	    int i_221_ = string.length();
	    int[] is = new int[i_221_];
	    for (int i_222_ = 0; i_222_ < i_221_; i_222_++)
		is[i_222_] = (int) (Math.sin((double) i_220_ / 5.0
					     + (double) i_222_ / 2.0)
				    * 5.0);
	    method2850(string,
		       i - aClass7_1871.method561(string, -584521001) / 2,
		       i_217_, null, null, null, is, 823917063);
	}
    }
    
    abstract void method2868(char c, int i, int i_223_, int i_224_,
			     boolean bool, Class152 class152, int i_225_,
			     int i_226_);
    
    public int method2869
	(String string, int i, int i_227_, int i_228_, int i_229_, int i_230_,
	 int i_231_, int i_232_, int i_233_, int i_234_, Class157[] class157s,
	 int[] is, Class152 class152, int i_235_, int i_236_) {
	return method2840(string, i, i_227_, i_228_, i_229_, i_230_, i_231_,
			  i_232_, i_233_, i_234_, 0, class157s, is, class152,
			  i_235_, i_236_, -985997540);
    }
    
    public void method2870(String string, int i, int i_237_, int i_238_,
			   int i_239_, int i_240_, int i_241_) {
	if (string != null) {
	    method2846(i_238_, i_239_, -1034088028);
	    double d = 7.0 - (double) i_241_ / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i_242_ = string.length();
	    int[] is = new int[i_242_];
	    for (int i_243_ = 0; i_243_ < i_242_; i_243_++)
		is[i_243_] = (int) (Math.sin((double) i_240_ / 1.0
					     + (double) i_243_ / 1.5)
				    * d);
	    method2850(string,
		       i - aClass7_1871.method561(string, -1422375681) / 2,
		       i_237_, null, null, null, is, 602046501);
	}
    }
    
    public int method2871(String string, int i, int i_244_, int i_245_,
			  int i_246_, int i_247_, int i_248_, int i_249_,
			  int i_250_, int i_251_, int i_252_,
			  Class157[] class157s, int[] is, Class152 class152,
			  int i_253_, int i_254_) {
	if (null == string)
	    return 0;
	method2846(i_247_, i_248_, -282996386);
	if (i_251_ == 0)
	    i_251_ = aClass7_1871.anInt46 * 1938404803;
	int[] is_255_;
	if (i_246_ < (385749773 * aClass7_1871.anInt49
		      + aClass7_1871.anInt51 * 1921008003 + i_251_)
	    && i_246_ < i_251_ + i_251_)
	    is_255_ = null;
	else
	    is_255_ = new int[] { i_245_ };
	int i_256_ = aClass7_1871.method604(string, is_255_, aStringArray1876,
					    class157s, (byte) -94);
	if (i_252_ == -1) {
	    i_252_ = i_246_ / i_251_;
	    if (i_252_ <= 0)
		i_252_ = 1;
	}
	if (i_252_ > 0 && i_256_ >= i_252_) {
	    aStringArray1876[i_252_ - 1]
		= aClass7_1871.method609(aStringArray1876[i_252_ - 1], i_245_,
					 class157s, (byte) 43);
	    i_256_ = i_252_;
	}
	if (i_250_ == 3 && 1 == i_256_)
	    i_250_ = 1;
	int i_257_;
	if (0 == i_250_)
	    i_257_ = i_244_ + aClass7_1871.anInt49 * 385749773;
	else if (i_250_ == 1)
	    i_257_ = ((i_246_ - aClass7_1871.anInt49 * 385749773
		       - 1921008003 * aClass7_1871.anInt51
		       - (i_256_ - 1) * i_251_) / 2
		      + (385749773 * aClass7_1871.anInt49 + i_244_));
	else if (i_250_ == 2)
	    i_257_ = (i_246_ + i_244_ - 1921008003 * aClass7_1871.anInt51
		      - i_251_ * (i_256_ - 1));
	else {
	    int i_258_ = ((i_246_ - aClass7_1871.anInt49 * 385749773
			   - aClass7_1871.anInt51 * 1921008003
			   - (i_256_ - 1) * i_251_)
			  / (i_256_ + 1));
	    if (i_258_ < 0)
		i_258_ = 0;
	    i_257_ = i_258_ + (i_244_ + 385749773 * aClass7_1871.anInt49);
	    i_251_ += i_258_;
	}
	for (int i_259_ = 0; i_259_ < i_256_; i_259_++) {
	    if (0 == i_249_)
		method2881(aStringArray1876[i_259_], i, i_257_, class157s, is,
			   class152, i_253_, i_254_, 358478873);
	    else if (i_249_ == 1)
		method2881(aStringArray1876[i_259_],
			   i + (i_245_
				- aClass7_1871.method561((aStringArray1876
							  [i_259_]),
							 -315266238)) / 2,
			   i_257_, class157s, is, class152, i_253_, i_254_,
			   1385172936);
	    else if (2 == i_249_)
		method2881(aStringArray1876[i_259_],
			   (i_245_ + i
			    - aClass7_1871.method561(aStringArray1876[i_259_],
						     779221647)),
			   i_257_, class157s, is, class152, i_253_, i_254_,
			   1812813834);
	    else if (i_256_ - 1 == i_259_)
		method2881(aStringArray1876[i_259_], i, i_257_, class157s, is,
			   class152, i_253_, i_254_, -782591570);
	    else {
		method2848(aStringArray1876[i_259_], i_245_, (byte) 49);
		method2881(aStringArray1876[i_259_], i, i_257_, class157s, is,
			   class152, i_253_, i_254_, -358988867);
		anInt1868 = 0;
	    }
	    i_257_ += i_251_;
	}
	return i_256_;
    }
    
    public int method2872(String string, int i, int i_260_, int i_261_,
			  int i_262_, int i_263_, int i_264_, int i_265_,
			  int i_266_, int i_267_, int i_268_,
			  Class157[] class157s, int[] is, Class152 class152,
			  int i_269_, int i_270_) {
	if (null == string)
	    return 0;
	method2846(i_263_, i_264_, -213954394);
	if (i_267_ == 0)
	    i_267_ = aClass7_1871.anInt46 * 1938404803;
	int[] is_271_;
	if (i_262_ < (385749773 * aClass7_1871.anInt49
		      + aClass7_1871.anInt51 * 1921008003 + i_267_)
	    && i_262_ < i_267_ + i_267_)
	    is_271_ = null;
	else
	    is_271_ = new int[] { i_261_ };
	int i_272_ = aClass7_1871.method604(string, is_271_, aStringArray1876,
					    class157s, (byte) -2);
	if (i_268_ == -1) {
	    i_268_ = i_262_ / i_267_;
	    if (i_268_ <= 0)
		i_268_ = 1;
	}
	if (i_268_ > 0 && i_272_ >= i_268_) {
	    aStringArray1876[i_268_ - 1]
		= aClass7_1871.method609(aStringArray1876[i_268_ - 1], i_261_,
					 class157s, (byte) 113);
	    i_272_ = i_268_;
	}
	if (i_266_ == 3 && 1 == i_272_)
	    i_266_ = 1;
	int i_273_;
	if (0 == i_266_)
	    i_273_ = i_260_ + aClass7_1871.anInt49 * 385749773;
	else if (i_266_ == 1)
	    i_273_ = ((i_262_ - aClass7_1871.anInt49 * 385749773
		       - 1921008003 * aClass7_1871.anInt51
		       - (i_272_ - 1) * i_267_) / 2
		      + (385749773 * aClass7_1871.anInt49 + i_260_));
	else if (i_266_ == 2)
	    i_273_ = (i_262_ + i_260_ - 1921008003 * aClass7_1871.anInt51
		      - i_267_ * (i_272_ - 1));
	else {
	    int i_274_ = ((i_262_ - aClass7_1871.anInt49 * 385749773
			   - aClass7_1871.anInt51 * 1921008003
			   - (i_272_ - 1) * i_267_)
			  / (i_272_ + 1));
	    if (i_274_ < 0)
		i_274_ = 0;
	    i_273_ = i_274_ + (i_260_ + 385749773 * aClass7_1871.anInt49);
	    i_267_ += i_274_;
	}
	for (int i_275_ = 0; i_275_ < i_272_; i_275_++) {
	    if (0 == i_265_)
		method2881(aStringArray1876[i_275_], i, i_273_, class157s, is,
			   class152, i_269_, i_270_, 370861379);
	    else if (i_265_ == 1)
		method2881(aStringArray1876[i_275_],
			   i + (i_261_
				- aClass7_1871.method561((aStringArray1876
							  [i_275_]),
							 26337067)) / 2,
			   i_273_, class157s, is, class152, i_269_, i_270_,
			   -379349269);
	    else if (2 == i_265_)
		method2881(aStringArray1876[i_275_],
			   (i_261_ + i
			    - aClass7_1871.method561(aStringArray1876[i_275_],
						     -1931620341)),
			   i_273_, class157s, is, class152, i_269_, i_270_,
			   1860516600);
	    else if (i_272_ - 1 == i_275_)
		method2881(aStringArray1876[i_275_], i, i_273_, class157s, is,
			   class152, i_269_, i_270_, 887542596);
	    else {
		method2848(aStringArray1876[i_275_], i_261_, (byte) 51);
		method2881(aStringArray1876[i_275_], i, i_273_, class157s, is,
			   class152, i_269_, i_270_, -1044611091);
		anInt1868 = 0;
	    }
	    i_273_ += i_267_;
	}
	return i_272_;
    }
    
    Class175(Class182 class182, Class7 class7) {
	aClass182_1864 = class182;
	aClass7_1871 = class7;
    }
    
    public void method2873(String string, int i, int i_276_, int i_277_,
			   int i_278_, int i_279_) {
	if (null != string) {
	    method2846(i_277_, i_278_, 319977224);
	    int i_280_ = string.length();
	    int[] is = new int[i_280_];
	    for (int i_281_ = 0; i_281_ < i_280_; i_281_++)
		is[i_281_] = (int) (Math.sin((double) i_279_ / 5.0
					     + (double) i_281_ / 2.0)
				    * 5.0);
	    method2850(string,
		       i - aClass7_1871.method561(string, -2049077044) / 2,
		       i_276_, null, null, null, is, 645132588);
	}
    }
    
    abstract void method2874(char c, int i, int i_282_, int i_283_,
			     boolean bool);
    
    public void method2875(String string, int i, int i_284_, int i_285_,
			   int i_286_, int i_287_) {
	if (null != string) {
	    method2846(i_285_, i_286_, -567069798);
	    int i_288_ = string.length();
	    int[] is = new int[i_288_];
	    int[] is_289_ = new int[i_288_];
	    for (int i_290_ = 0; i_290_ < i_288_; i_290_++) {
		is[i_290_] = (int) (Math.sin((double) i_290_ / 5.0
					     + (double) i_287_ / 5.0)
				    * 5.0);
		is_289_[i_290_] = (int) (Math.sin((double) i_287_ / 5.0
						  + (double) i_290_ / 3.0)
					 * 5.0);
	    }
	    method2850(string,
		       i - aClass7_1871.method561(string, -12943285) / 2,
		       i_284_, null, null, is, is_289_, 1951482396);
	}
    }
    
    public void method2876(String string, int i, int i_291_, int i_292_,
			   int i_293_, int i_294_) {
	if (null != string) {
	    method2846(i_292_, i_293_, -1295880026);
	    int i_295_ = string.length();
	    int[] is = new int[i_295_];
	    int[] is_296_ = new int[i_295_];
	    for (int i_297_ = 0; i_297_ < i_295_; i_297_++) {
		is[i_297_] = (int) (Math.sin((double) i_297_ / 5.0
					     + (double) i_294_ / 5.0)
				    * 5.0);
		is_296_[i_297_] = (int) (Math.sin((double) i_294_ / 5.0
						  + (double) i_297_ / 3.0)
					 * 5.0);
	    }
	    method2850(string,
		       i - aClass7_1871.method561(string, -1313607247) / 2,
		       i_291_, null, null, is, is_296_, 1811055712);
	}
    }
    
    void method2877(String string, int i, int i_298_, Class157[] class157s,
		    int[] is, Class152 class152, int i_299_, int i_300_) {
	i_298_ -= aClass7_1871.anInt46 * 1938404803;
	int i_301_ = -1;
	int i_302_ = -1;
	int i_303_ = string.length();
	for (int i_304_ = 0; i_304_ < i_303_; i_304_++) {
	    char c
		= (char) (Class28.method908(string.charAt(i_304_), -2099340796)
			  & 0xff);
	    if (60 == c)
		i_301_ = i_304_;
	    else {
		if (62 == c && -1 != i_301_) {
		    String string_305_ = string.substring(1 + i_301_, i_304_);
		    i_301_ = -1;
		    if (string_305_.equals("lt"))
			c = '<';
		    else if (string_305_.equals("gt"))
			c = '>';
		    else if (string_305_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_305_.equals("shy"))
			c = '\u00ad';
		    else if (string_305_.equals("times"))
			c = '\u00d7';
		    else if (string_305_.equals("euro"))
			c = '\u0080';
		    else if (string_305_.equals("copy"))
			c = '\u00a9';
		    else if (string_305_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_305_.startsWith("img=")) {
			    try {
				int i_306_
				    = Class275.method5102(string_305_
							      .substring(4),
							  -1191891572);
				Class157 class157 = class157s[i_306_];
				int i_307_ = (is != null ? is[i_306_]
					      : class157.method2472());
				if (-16777216
				    == (320362971 * anInt1863 & ~0xffffff))
				    class157.method2479(i,
							(i_298_
							 + (1938404803
							    * (aClass7_1871
							       .anInt46))
							 - i_307_),
							1, -1, 1);
				else
				    class157.method2479
					(i,
					 (i_298_
					  + 1938404803 * aClass7_1871.anInt46
					  - i_307_),
					 0,
					 (anInt1863 * 320362971 & ~0xffffff
					  | 0xffffff),
					 1);
				i += class157s[i_306_].method12();
				i_302_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_305_.startsWith("sprite=")) {
			    if (null != aClass7_1871.anInterface4_52) {
				try {
				    int i_308_ = -1;
				    int i_309_ = 0;
				    int i_310_ = string_305_.indexOf(',');
				    if (i_310_ == -1)
					i_308_ = (Class275.method5102
						  (string_305_.substring(7),
						   -2028355191));
				    else {
					i_308_
					    = (Class275.method5102
					       (string_305_.substring(7,
								      i_310_),
						-510049733));
					i_309_ = (Class275.method5102
						  (string_305_
						       .substring(1 + i_310_),
						   -575538038));
				    }
				    Class157[] class157s_311_
					= (aClass7_1871.anInterface4_52
					       .method34
					   (aClass182_1864, i_308_,
					    1122007968));
				    if (null != class157s_311_) {
					int i_312_
					    = Math.min(class157s_311_
							   [i_309_]
							   .method2472(),
						       ((1921008003
							 * (aClass7_1871
							    .anInt51))
							+ (385749773
							   * (aClass7_1871
							      .anInt49))));
					if (-16777216 == (320362971 * anInt1863
							  & ~0xffffff))
					    class157s_311_[i_309_].method2479
						(i, (i_298_ + 2
						     + (aClass7_1871.anInt46
							* 1938404803)
						     - i_312_), 1, -1, 1);
					else
					    class157s_311_[i_309_].method2479
						(i,
						 ((aClass7_1871.anInt46
						   * 1938404803)
						  + (2 + i_298_) - i_312_),
						 0,
						 (320362971 * anInt1863
						  & ~0xffffff) | 0xffffff,
						 1);
					i += class157s_311_[i_309_].method12();
				    }
				    i_302_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2847(string_305_, 745712079);
			continue;
		    }
		}
		if (-1 == i_301_) {
		    if (-1 != i_302_)
			i += aClass7_1871.method559(i_302_, c, (byte) 25);
		    if (c != 32) {
			if (null == class152) {
			    if (0 != (anInt1873 * -1920710597 & ~0xffffff))
				method2874(c, i + 1, i_298_ + 1,
					   -1920710597 * anInt1873, true);
			    method2874(c, i, i_298_, anInt1863 * 320362971,
				       false);
			} else {
			    if (0 != (-1920710597 * anInt1873 & ~0xffffff))
				method2868(c, 1 + i, i_298_ + 1,
					   anInt1873 * -1920710597, true,
					   class152, i_299_, i_300_);
			    method2868(c, i, i_298_, anInt1863 * 320362971,
				       false, class152, i_299_, i_300_);
			}
		    } else if (anInt1868 * -449274495 > 0) {
			anInt1875 += -2046028953 * anInt1868;
			i += -703078697 * anInt1875 >> 8;
			anInt1875
			    = -1286081305 * (-703078697 * anInt1875 & 0xff);
		    }
		    int i_313_ = aClass7_1871.method560(c, -1664940945);
		    if (-1 != -1601478865 * anInt1869)
			aClass182_1864.method3192
			    (i,
			     i_298_ + (int) (0.7 * (double) (1938404803
							     * (aClass7_1871
								.anInt46))),
			     i_313_, -1601478865 * anInt1869, -473764903);
		    if (-1 != -1282902115 * anInt1874)
			aClass182_1864.method3192
			    (i, i_298_ + aClass7_1871.anInt46 * 1938404803 + 1,
			     i_313_, anInt1874 * -1282902115, 536867017);
		    i += i_313_;
		    i_302_ = c;
		}
	    }
	}
    }
    
    public void method2878(String string, int i, int i_314_, int i_315_,
			   int i_316_, int i_317_, int i_318_) {
	if (string != null) {
	    method2846(i_315_, i_316_, 1402201303);
	    double d = 7.0 - (double) i_318_ / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i_319_ = string.length();
	    int[] is = new int[i_319_];
	    for (int i_320_ = 0; i_320_ < i_319_; i_320_++)
		is[i_320_] = (int) (Math.sin((double) i_317_ / 1.0
					     + (double) i_320_ / 1.5)
				    * d);
	    method2850(string,
		       i - aClass7_1871.method561(string, 1802589116) / 2,
		       i_314_, null, null, null, is, 1242220611);
	}
    }
    
    public void method2879(String string, int i, int i_321_, int i_322_,
			   int i_323_, int i_324_, int i_325_) {
	if (string != null) {
	    method2846(i_322_, i_323_, 947708492);
	    double d = 7.0 - (double) i_325_ / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int i_326_ = string.length();
	    int[] is = new int[i_326_];
	    for (int i_327_ = 0; i_327_ < i_326_; i_327_++)
		is[i_327_] = (int) (Math.sin((double) i_324_ / 1.0
					     + (double) i_327_ / 1.5)
				    * d);
	    method2850(string,
		       i - aClass7_1871.method561(string, -317503903) / 2,
		       i_321_, null, null, null, is, 1932741588);
	}
    }
    
    static {
	anInt1870 = 0;
	anInt1863 = 0;
	anInt1872 = 0;
	anInt1873 = 0;
	anInt1868 = 0;
	anInt1875 = 0;
	aStringArray1876 = new String[100];
    }
    
    public int method2880(String string, int i, int i_328_, int i_329_,
			  int i_330_, Random random, int i_331_,
			  Class157[] class157s, int[] is) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_331_);
	int i_332_ = 192 + (random.nextInt() & 0x1f);
	method2846(i_332_ << 24 | i_329_ & 0xffffff,
		   i_332_ << 24 | i_330_ & 0xffffff, 1761964978);
	int i_333_ = string.length();
	int[] is_334_ = new int[i_333_];
	int i_335_ = 0;
	for (int i_336_ = 0; i_336_ < i_333_; i_336_++) {
	    is_334_[i_336_] = i_335_;
	    if ((random.nextInt() & 0x3) == 0)
		i_335_++;
	}
	method2850(string, i, i_328_, class157s, is, is_334_, null, 533682918);
	return i_335_;
    }
    
    void method2881(String string, int i, int i_337_, Class157[] class157s,
		    int[] is, Class152 class152, int i_338_, int i_339_,
		    int i_340_) {
	i_337_ -= aClass7_1871.anInt46 * 1938404803;
	int i_341_ = -1;
	int i_342_ = -1;
	int i_343_ = string.length();
	for (int i_344_ = 0; i_344_ < i_343_; i_344_++) {
	    char c
		= (char) (Class28.method908(string.charAt(i_344_), -2099340796)
			  & 0xff);
	    if (60 == c)
		i_341_ = i_344_;
	    else {
		if (62 == c && -1 != i_341_) {
		    String string_345_ = string.substring(1 + i_341_, i_344_);
		    i_341_ = -1;
		    if (string_345_.equals("lt"))
			c = '<';
		    else if (string_345_.equals("gt"))
			c = '>';
		    else if (string_345_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_345_.equals("shy"))
			c = '\u00ad';
		    else if (string_345_.equals("times"))
			c = '\u00d7';
		    else if (string_345_.equals("euro"))
			c = '\u0080';
		    else if (string_345_.equals("copy"))
			c = '\u00a9';
		    else if (string_345_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_345_.startsWith("img=")) {
			    try {
				int i_346_
				    = Class275.method5102(string_345_
							      .substring(4),
							  -1826853850);
				Class157 class157 = class157s[i_346_];
				int i_347_ = (is != null ? is[i_346_]
					      : class157.method2472());
				if (-16777216
				    == (320362971 * anInt1863 & ~0xffffff))
				    class157.method2479(i,
							(i_337_
							 + (1938404803
							    * (aClass7_1871
							       .anInt46))
							 - i_347_),
							1, -1, 1);
				else
				    class157.method2479
					(i,
					 (i_337_
					  + 1938404803 * aClass7_1871.anInt46
					  - i_347_),
					 0,
					 (anInt1863 * 320362971 & ~0xffffff
					  | 0xffffff),
					 1);
				i += class157s[i_346_].method12();
				i_342_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_345_.startsWith("sprite=")) {
			    if (null != aClass7_1871.anInterface4_52) {
				try {
				    int i_348_ = -1;
				    int i_349_ = 0;
				    int i_350_ = string_345_.indexOf(',');
				    if (i_350_ == -1)
					i_348_ = (Class275.method5102
						  (string_345_.substring(7),
						   -1333620362));
				    else {
					i_348_
					    = (Class275.method5102
					       (string_345_.substring(7,
								      i_350_),
						-579706529));
					i_349_ = (Class275.method5102
						  (string_345_
						       .substring(1 + i_350_),
						   -365780939));
				    }
				    Class157[] class157s_351_
					= (aClass7_1871.anInterface4_52
					       .method34
					   (aClass182_1864, i_348_,
					    1122007968));
				    if (null != class157s_351_) {
					int i_352_
					    = Math.min(class157s_351_
							   [i_349_]
							   .method2472(),
						       ((1921008003
							 * (aClass7_1871
							    .anInt51))
							+ (385749773
							   * (aClass7_1871
							      .anInt49))));
					if (-16777216 == (320362971 * anInt1863
							  & ~0xffffff))
					    class157s_351_[i_349_].method2479
						(i, (i_337_ + 2
						     + (aClass7_1871.anInt46
							* 1938404803)
						     - i_352_), 1, -1, 1);
					else
					    class157s_351_[i_349_].method2479
						(i,
						 ((aClass7_1871.anInt46
						   * 1938404803)
						  + (2 + i_337_) - i_352_),
						 0,
						 (320362971 * anInt1863
						  & ~0xffffff) | 0xffffff,
						 1);
					i += class157s_351_[i_349_].method12();
				    }
				    i_342_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2847(string_345_, 552581025);
			continue;
		    }
		}
		if (-1 == i_341_) {
		    if (-1 != i_342_)
			i += aClass7_1871.method559(i_342_, c, (byte) 100);
		    if (c != 32) {
			if (null == class152) {
			    if (0 != (anInt1873 * -1920710597 & ~0xffffff))
				method2874(c, i + 1, i_337_ + 1,
					   -1920710597 * anInt1873, true);
			    method2874(c, i, i_337_, anInt1863 * 320362971,
				       false);
			} else {
			    if (0 != (-1920710597 * anInt1873 & ~0xffffff))
				method2868(c, 1 + i, i_337_ + 1,
					   anInt1873 * -1920710597, true,
					   class152, i_338_, i_339_);
			    method2868(c, i, i_337_, anInt1863 * 320362971,
				       false, class152, i_338_, i_339_);
			}
		    } else if (anInt1868 * -449274495 > 0) {
			anInt1875 += -2046028953 * anInt1868;
			i += -703078697 * anInt1875 >> 8;
			anInt1875
			    = -1286081305 * (-703078697 * anInt1875 & 0xff);
		    }
		    int i_353_ = aClass7_1871.method560(c, -1664940945);
		    if (-1 != -1601478865 * anInt1869)
			aClass182_1864.method3192
			    (i,
			     i_337_ + (int) (0.7 * (double) (1938404803
							     * (aClass7_1871
								.anInt46))),
			     i_353_, -1601478865 * anInt1869, -753899428);
		    if (-1 != -1282902115 * anInt1874)
			aClass182_1864.method3192
			    (i, i_337_ + aClass7_1871.anInt46 * 1938404803 + 1,
			     i_353_, anInt1874 * -1282902115, -584878638);
		    i += i_353_;
		    i_342_ = c;
		}
	    }
	}
    }
    
    public int method2882(String string, int i, int i_354_, int i_355_,
			  int i_356_, Random random, int i_357_,
			  Class157[] class157s, int[] is) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_357_);
	int i_358_ = 192 + (random.nextInt() & 0x1f);
	method2846(i_358_ << 24 | i_355_ & 0xffffff,
		   i_358_ << 24 | i_356_ & 0xffffff, 440998387);
	int i_359_ = string.length();
	int[] is_360_ = new int[i_359_];
	int i_361_ = 0;
	for (int i_362_ = 0; i_362_ < i_359_; i_362_++) {
	    is_360_[i_362_] = i_361_;
	    if ((random.nextInt() & 0x3) == 0)
		i_361_++;
	}
	method2850(string, i, i_354_, class157s, is, is_360_, null,
		   1717461421);
	return i_361_;
    }
    
    public int method2883(String string, int i, int i_363_, int i_364_,
			  int i_365_, Random random, int i_366_,
			  Class157[] class157s, int[] is) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_366_);
	int i_367_ = 192 + (random.nextInt() & 0x1f);
	method2846(i_367_ << 24 | i_364_ & 0xffffff,
		   i_367_ << 24 | i_365_ & 0xffffff, -432999118);
	int i_368_ = string.length();
	int[] is_369_ = new int[i_368_];
	int i_370_ = 0;
	for (int i_371_ = 0; i_371_ < i_368_; i_371_++) {
	    is_369_[i_371_] = i_370_;
	    if ((random.nextInt() & 0x3) == 0)
		i_370_++;
	}
	method2850(string, i, i_363_, class157s, is, is_369_, null, 819918435);
	return i_370_;
    }
    
    public int method2884(String string, int i, int i_372_, int i_373_,
			  int i_374_, int i_375_, int i_376_, int i_377_,
			  int i_378_, Random random, int i_379_, int[] is,
			  Class157[] class157s, int[] is_380_) {
	if (null == string)
	    return 0;
	random.setSeed((long) i_379_);
	int i_381_ = 192 + (random.nextInt() & 0x1f);
	method2846(i_381_ << 24 | i_375_ & 0xffffff,
		   i_376_ == -1 ? 0 : i_381_ << 24 | i_376_ & 0xffffff,
		   -1727614334);
	int i_382_ = string.length();
	int[] is_383_ = new int[i_382_];
	int i_384_ = 0;
	for (int i_385_ = 0; i_385_ < i_382_; i_385_++) {
	    is_383_[i_385_] = i_384_;
	    if ((random.nextInt() & 0x3) == 0)
		i_384_++;
	}
	int i_386_ = i;
	int i_387_ = aClass7_1871.anInt49 * 385749773 + i_372_;
	int i_388_ = -1;
	if (i_378_ == 1)
	    i_387_ += (i_374_ - 385749773 * aClass7_1871.anInt49
		       - aClass7_1871.anInt51 * 1921008003) / 2;
	else if (2 == i_378_)
	    i_387_ = i_374_ + i_372_ - 1921008003 * aClass7_1871.anInt51;
	if (i_377_ == 1) {
	    i_388_ = aClass7_1871.method561(string, -1763432867) + i_384_;
	    i_386_ += (i_373_ - i_388_) / 2;
	} else if (2 == i_377_) {
	    i_388_ = aClass7_1871.method561(string, -1318293811) + i_384_;
	    i_386_ += i_373_ - i_388_;
	}
	method2850(string, i_386_, i_387_, class157s, is_380_, is_383_, null,
		   2008420344);
	if (null != is) {
	    if (i_388_ == -1)
		i_388_ = aClass7_1871.method561(string, -1200854133) + i_384_;
	    is[0] = i_386_;
	    is[1] = i_387_ - 385749773 * aClass7_1871.anInt49;
	    is[2] = i_388_;
	    is[3] = (aClass7_1871.anInt49 * 385749773
		     + aClass7_1871.anInt51 * 1921008003);
	}
	return i_384_;
    }
    
    void method2885(String string, int i) {
	int i_389_ = 0;
	boolean bool = false;
	for (int i_390_ = 0; i_390_ < string.length(); i_390_++) {
	    char c = string.charAt(i_390_);
	    if (c == '<')
		bool = true;
	    else if ('>' == c)
		bool = false;
	    else if (!bool && c == ' ')
		i_389_++;
	}
	if (i_389_ > 0)
	    anInt1868 = ((i - aClass7_1871.method561(string, 1083353412) << 8)
			 / i_389_ * -884104575);
    }
    
    void method2886(String string) {
	try {
	    if (string.startsWith("col="))
		anInt1863 = ((anInt1863 * 320362971 & ~0xffffff
			      | Class332.method5819(string.substring(4), 16,
						    -1747603757) & 0xffffff)
			     * 1082260051);
	    else if (string.equals("/col"))
		anInt1863 = (320362971 * anInt1863 & ~0xffffff
			     | anInt1870 * 545587109 & 0xffffff) * 1082260051;
	    if (string.startsWith("argb="))
		anInt1863 = Class332.method5819(string.substring(5), 16,
						-965845420) * 1082260051;
	    else if (string.equals("/argb"))
		anInt1863 = 2129331327 * anInt1870;
	    else if (string.startsWith("str="))
		anInt1869 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(4), 16,
						   -579465970)) * 1016612815;
	    else if (string.equals("str"))
		anInt1869 = 1016612815 * (anInt1863 * 320362971 & ~0xffffff
					  | 0x800000);
	    else if (string.equals("/str"))
		anInt1869 = -1016612815;
	    else if (string.startsWith("u="))
		anInt1874 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(2), 16,
						   -889625389)) * 1409337013;
	    else if (string.equals("u"))
		anInt1874 = 1409337013 * (320362971 * anInt1863 & ~0xffffff);
	    else if (string.equals("/u"))
		anInt1874 = -1409337013;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1873 = 0;
	    else if (string.startsWith("shad="))
		anInt1873 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(5), 16,
						   229798846)) * -1647881997;
	    else if (string.equals("shad"))
		anInt1873 = -1647881997 * (320362971 * anInt1863 & ~0xffffff);
	    else if (string.equals("/shad"))
		anInt1873 = anInt1872 * 1974450301;
	    else if (string.equals("br"))
		method2846(anInt1870 * 545587109, -2066305841 * anInt1872,
			   -1946194377);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    void method2887(String string) {
	try {
	    if (string.startsWith("col="))
		anInt1863 = ((anInt1863 * 320362971 & ~0xffffff
			      | Class332.method5819(string.substring(4), 16,
						    -2094546559) & 0xffffff)
			     * 1082260051);
	    else if (string.equals("/col"))
		anInt1863 = (320362971 * anInt1863 & ~0xffffff
			     | anInt1870 * 545587109 & 0xffffff) * 1082260051;
	    if (string.startsWith("argb="))
		anInt1863 = Class332.method5819(string.substring(5), 16,
						-1705997855) * 1082260051;
	    else if (string.equals("/argb"))
		anInt1863 = 2129331327 * anInt1870;
	    else if (string.startsWith("str="))
		anInt1869 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(4), 16,
						   -1258406541)) * 1016612815;
	    else if (string.equals("str"))
		anInt1869 = 1016612815 * (anInt1863 * 320362971 & ~0xffffff
					  | 0x800000);
	    else if (string.equals("/str"))
		anInt1869 = -1016612815;
	    else if (string.startsWith("u="))
		anInt1874 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(2), 16,
						   -1500546969)) * 1409337013;
	    else if (string.equals("u"))
		anInt1874 = 1409337013 * (320362971 * anInt1863 & ~0xffffff);
	    else if (string.equals("/u"))
		anInt1874 = -1409337013;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1873 = 0;
	    else if (string.startsWith("shad="))
		anInt1873 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(5), 16,
						   -1855142644)) * -1647881997;
	    else if (string.equals("shad"))
		anInt1873 = -1647881997 * (320362971 * anInt1863 & ~0xffffff);
	    else if (string.equals("/shad"))
		anInt1873 = anInt1872 * 1974450301;
	    else if (string.equals("br"))
		method2846(anInt1870 * 545587109, -2066305841 * anInt1872,
			   -611527080);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    void method2888(String string) {
	try {
	    if (string.startsWith("col="))
		anInt1863 = ((anInt1863 * 320362971 & ~0xffffff
			      | Class332.method5819(string.substring(4), 16,
						    -1838909421) & 0xffffff)
			     * 1082260051);
	    else if (string.equals("/col"))
		anInt1863 = (320362971 * anInt1863 & ~0xffffff
			     | anInt1870 * 545587109 & 0xffffff) * 1082260051;
	    if (string.startsWith("argb="))
		anInt1863 = Class332.method5819(string.substring(5), 16,
						-755687290) * 1082260051;
	    else if (string.equals("/argb"))
		anInt1863 = 2129331327 * anInt1870;
	    else if (string.startsWith("str="))
		anInt1869 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(4), 16,
						   -1972615095)) * 1016612815;
	    else if (string.equals("str"))
		anInt1869 = 1016612815 * (anInt1863 * 320362971 & ~0xffffff
					  | 0x800000);
	    else if (string.equals("/str"))
		anInt1869 = -1016612815;
	    else if (string.startsWith("u="))
		anInt1874 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(2), 16,
						   -1691313678)) * 1409337013;
	    else if (string.equals("u"))
		anInt1874 = 1409337013 * (320362971 * anInt1863 & ~0xffffff);
	    else if (string.equals("/u"))
		anInt1874 = -1409337013;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1873 = 0;
	    else if (string.startsWith("shad="))
		anInt1873 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(5), 16,
						   -794910081)) * -1647881997;
	    else if (string.equals("shad"))
		anInt1873 = -1647881997 * (320362971 * anInt1863 & ~0xffffff);
	    else if (string.equals("/shad"))
		anInt1873 = anInt1872 * 1974450301;
	    else if (string.equals("br"))
		method2846(anInt1870 * 545587109, -2066305841 * anInt1872,
			   683619720);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    void method2889(String string) {
	try {
	    if (string.startsWith("col="))
		anInt1863 = ((anInt1863 * 320362971 & ~0xffffff
			      | Class332.method5819(string.substring(4), 16,
						    -92478583) & 0xffffff)
			     * 1082260051);
	    else if (string.equals("/col"))
		anInt1863 = (320362971 * anInt1863 & ~0xffffff
			     | anInt1870 * 545587109 & 0xffffff) * 1082260051;
	    if (string.startsWith("argb="))
		anInt1863 = Class332.method5819(string.substring(5), 16,
						-1607796056) * 1082260051;
	    else if (string.equals("/argb"))
		anInt1863 = 2129331327 * anInt1870;
	    else if (string.startsWith("str="))
		anInt1869 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(4), 16,
						   -1386873800)) * 1016612815;
	    else if (string.equals("str"))
		anInt1869 = 1016612815 * (anInt1863 * 320362971 & ~0xffffff
					  | 0x800000);
	    else if (string.equals("/str"))
		anInt1869 = -1016612815;
	    else if (string.startsWith("u="))
		anInt1874 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(2), 16,
						   -1735478858)) * 1409337013;
	    else if (string.equals("u"))
		anInt1874 = 1409337013 * (320362971 * anInt1863 & ~0xffffff);
	    else if (string.equals("/u"))
		anInt1874 = -1409337013;
	    else if (string.equalsIgnoreCase("shad=-1"))
		anInt1873 = 0;
	    else if (string.startsWith("shad="))
		anInt1873 = (anInt1863 * 320362971 & ~0xffffff
			     | Class332.method5819(string.substring(5), 16,
						   -559815546)) * -1647881997;
	    else if (string.equals("shad"))
		anInt1873 = -1647881997 * (320362971 * anInt1863 & ~0xffffff);
	    else if (string.equals("/shad"))
		anInt1873 = anInt1872 * 1974450301;
	    else if (string.equals("br"))
		method2846(anInt1870 * 545587109, -2066305841 * anInt1872,
			   1540974984);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    void method2890(String string, int i) {
	int i_391_ = 0;
	boolean bool = false;
	for (int i_392_ = 0; i_392_ < string.length(); i_392_++) {
	    char c = string.charAt(i_392_);
	    if (c == '<')
		bool = true;
	    else if ('>' == c)
		bool = false;
	    else if (!bool && c == ' ')
		i_391_++;
	}
	if (i_391_ > 0)
	    anInt1868 = ((i - aClass7_1871.method561(string, -1322918138) << 8)
			 / i_391_ * -884104575);
    }
    
    public void method2891(String string, int i, int i_393_, int i_394_,
			   int i_395_) {
	if (null != string) {
	    method2846(i_394_, i_395_, -1447813570);
	    method2881(string,
		       i - aClass7_1871.method561(string, 1787928976) / 2,
		       i_393_, null, null, null, 0, 0, -861446532);
	}
    }
    
    void method2892(String string, int i, int i_396_, Class157[] class157s,
		    int[] is, Class152 class152, int i_397_, int i_398_) {
	i_396_ -= aClass7_1871.anInt46 * 1938404803;
	int i_399_ = -1;
	int i_400_ = -1;
	int i_401_ = string.length();
	for (int i_402_ = 0; i_402_ < i_401_; i_402_++) {
	    char c
		= (char) (Class28.method908(string.charAt(i_402_), -2099340796)
			  & 0xff);
	    if (60 == c)
		i_399_ = i_402_;
	    else {
		if (62 == c && -1 != i_399_) {
		    String string_403_ = string.substring(1 + i_399_, i_402_);
		    i_399_ = -1;
		    if (string_403_.equals("lt"))
			c = '<';
		    else if (string_403_.equals("gt"))
			c = '>';
		    else if (string_403_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_403_.equals("shy"))
			c = '\u00ad';
		    else if (string_403_.equals("times"))
			c = '\u00d7';
		    else if (string_403_.equals("euro"))
			c = '\u0080';
		    else if (string_403_.equals("copy"))
			c = '\u00a9';
		    else if (string_403_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_403_.startsWith("img=")) {
			    try {
				int i_404_
				    = Class275.method5102(string_403_
							      .substring(4),
							  -964597000);
				Class157 class157 = class157s[i_404_];
				int i_405_ = (is != null ? is[i_404_]
					      : class157.method2472());
				if (-16777216
				    == (320362971 * anInt1863 & ~0xffffff))
				    class157.method2479(i,
							(i_396_
							 + (1938404803
							    * (aClass7_1871
							       .anInt46))
							 - i_405_),
							1, -1, 1);
				else
				    class157.method2479
					(i,
					 (i_396_
					  + 1938404803 * aClass7_1871.anInt46
					  - i_405_),
					 0,
					 (anInt1863 * 320362971 & ~0xffffff
					  | 0xffffff),
					 1);
				i += class157s[i_404_].method12();
				i_400_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_403_.startsWith("sprite=")) {
			    if (null != aClass7_1871.anInterface4_52) {
				try {
				    int i_406_ = -1;
				    int i_407_ = 0;
				    int i_408_ = string_403_.indexOf(',');
				    if (i_408_ == -1)
					i_406_ = (Class275.method5102
						  (string_403_.substring(7),
						   -2114100870));
				    else {
					i_406_
					    = (Class275.method5102
					       (string_403_.substring(7,
								      i_408_),
						-1857600803));
					i_407_ = (Class275.method5102
						  (string_403_
						       .substring(1 + i_408_),
						   -1475354974));
				    }
				    Class157[] class157s_409_
					= (aClass7_1871.anInterface4_52
					       .method34
					   (aClass182_1864, i_406_,
					    1122007968));
				    if (null != class157s_409_) {
					int i_410_
					    = Math.min(class157s_409_
							   [i_407_]
							   .method2472(),
						       ((1921008003
							 * (aClass7_1871
							    .anInt51))
							+ (385749773
							   * (aClass7_1871
							      .anInt49))));
					if (-16777216 == (320362971 * anInt1863
							  & ~0xffffff))
					    class157s_409_[i_407_].method2479
						(i, (i_396_ + 2
						     + (aClass7_1871.anInt46
							* 1938404803)
						     - i_410_), 1, -1, 1);
					else
					    class157s_409_[i_407_].method2479
						(i,
						 ((aClass7_1871.anInt46
						   * 1938404803)
						  + (2 + i_396_) - i_410_),
						 0,
						 (320362971 * anInt1863
						  & ~0xffffff) | 0xffffff,
						 1);
					i += class157s_409_[i_407_].method12();
				    }
				    i_400_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2847(string_403_, 1942765427);
			continue;
		    }
		}
		if (-1 == i_399_) {
		    if (-1 != i_400_)
			i += aClass7_1871.method559(i_400_, c, (byte) 108);
		    if (c != 32) {
			if (null == class152) {
			    if (0 != (anInt1873 * -1920710597 & ~0xffffff))
				method2874(c, i + 1, i_396_ + 1,
					   -1920710597 * anInt1873, true);
			    method2874(c, i, i_396_, anInt1863 * 320362971,
				       false);
			} else {
			    if (0 != (-1920710597 * anInt1873 & ~0xffffff))
				method2868(c, 1 + i, i_396_ + 1,
					   anInt1873 * -1920710597, true,
					   class152, i_397_, i_398_);
			    method2868(c, i, i_396_, anInt1863 * 320362971,
				       false, class152, i_397_, i_398_);
			}
		    } else if (anInt1868 * -449274495 > 0) {
			anInt1875 += -2046028953 * anInt1868;
			i += -703078697 * anInt1875 >> 8;
			anInt1875
			    = -1286081305 * (-703078697 * anInt1875 & 0xff);
		    }
		    int i_411_ = aClass7_1871.method560(c, -1664940945);
		    if (-1 != -1601478865 * anInt1869)
			aClass182_1864.method3192
			    (i,
			     i_396_ + (int) (0.7 * (double) (1938404803
							     * (aClass7_1871
								.anInt46))),
			     i_411_, -1601478865 * anInt1869, -457817168);
		    if (-1 != -1282902115 * anInt1874)
			aClass182_1864.method3192
			    (i, i_396_ + aClass7_1871.anInt46 * 1938404803 + 1,
			     i_411_, anInt1874 * -1282902115, -604308622);
		    i += i_411_;
		    i_400_ = c;
		}
	    }
	}
    }
    
    public int method2893(String string, int i, int i_412_, int i_413_,
			  int i_414_, int i_415_, int i_416_, int i_417_,
			  int i_418_, int i_419_, int i_420_,
			  Class157[] class157s, int[] is, Class152 class152,
			  int i_421_, int i_422_) {
	if (null == string)
	    return 0;
	method2846(i_415_, i_416_, 1584611593);
	if (i_419_ == 0)
	    i_419_ = aClass7_1871.anInt46 * 1938404803;
	int[] is_423_;
	if (i_414_ < (385749773 * aClass7_1871.anInt49
		      + aClass7_1871.anInt51 * 1921008003 + i_419_)
	    && i_414_ < i_419_ + i_419_)
	    is_423_ = null;
	else
	    is_423_ = new int[] { i_413_ };
	int i_424_ = aClass7_1871.method604(string, is_423_, aStringArray1876,
					    class157s, (byte) 87);
	if (i_420_ == -1) {
	    i_420_ = i_414_ / i_419_;
	    if (i_420_ <= 0)
		i_420_ = 1;
	}
	if (i_420_ > 0 && i_424_ >= i_420_) {
	    aStringArray1876[i_420_ - 1]
		= aClass7_1871.method609(aStringArray1876[i_420_ - 1], i_413_,
					 class157s, (byte) 70);
	    i_424_ = i_420_;
	}
	if (i_418_ == 3 && 1 == i_424_)
	    i_418_ = 1;
	int i_425_;
	if (0 == i_418_)
	    i_425_ = i_412_ + aClass7_1871.anInt49 * 385749773;
	else if (i_418_ == 1)
	    i_425_ = ((i_414_ - aClass7_1871.anInt49 * 385749773
		       - 1921008003 * aClass7_1871.anInt51
		       - (i_424_ - 1) * i_419_) / 2
		      + (385749773 * aClass7_1871.anInt49 + i_412_));
	else if (i_418_ == 2)
	    i_425_ = (i_414_ + i_412_ - 1921008003 * aClass7_1871.anInt51
		      - i_419_ * (i_424_ - 1));
	else {
	    int i_426_ = ((i_414_ - aClass7_1871.anInt49 * 385749773
			   - aClass7_1871.anInt51 * 1921008003
			   - (i_424_ - 1) * i_419_)
			  / (i_424_ + 1));
	    if (i_426_ < 0)
		i_426_ = 0;
	    i_425_ = i_426_ + (i_412_ + 385749773 * aClass7_1871.anInt49);
	    i_419_ += i_426_;
	}
	for (int i_427_ = 0; i_427_ < i_424_; i_427_++) {
	    if (0 == i_417_)
		method2881(aStringArray1876[i_427_], i, i_425_, class157s, is,
			   class152, i_421_, i_422_, -466029734);
	    else if (i_417_ == 1)
		method2881(aStringArray1876[i_427_],
			   i + (i_413_
				- aClass7_1871.method561((aStringArray1876
							  [i_427_]),
							 -1826411761)) / 2,
			   i_425_, class157s, is, class152, i_421_, i_422_,
			   1939181516);
	    else if (2 == i_417_)
		method2881(aStringArray1876[i_427_],
			   (i_413_ + i
			    - aClass7_1871.method561(aStringArray1876[i_427_],
						     906683931)),
			   i_425_, class157s, is, class152, i_421_, i_422_,
			   1245053410);
	    else if (i_424_ - 1 == i_427_)
		method2881(aStringArray1876[i_427_], i, i_425_, class157s, is,
			   class152, i_421_, i_422_, -714256885);
	    else {
		method2848(aStringArray1876[i_427_], i_413_, (byte) 68);
		method2881(aStringArray1876[i_427_], i, i_425_, class157s, is,
			   class152, i_421_, i_422_, -1008240739);
		anInt1868 = 0;
	    }
	    i_425_ += i_419_;
	}
	return i_424_;
    }
    
    void method2894(String string, int i, int i_428_, Class157[] class157s,
		    int[] is, int[] is_429_, int[] is_430_) {
	i_428_ -= aClass7_1871.anInt46 * 1938404803;
	int i_431_ = -1;
	int i_432_ = -1;
	int i_433_ = 0;
	int i_434_ = string.length();
	for (int i_435_ = 0; i_435_ < i_434_; i_435_++) {
	    char c
		= (char) (Class28.method908(string.charAt(i_435_), -2099340796)
			  & 0xff);
	    if (60 == c)
		i_431_ = i_435_;
	    else {
		if (62 == c && i_431_ != -1) {
		    String string_436_ = string.substring(i_431_ + 1, i_435_);
		    i_431_ = -1;
		    if (string_436_.equals("lt"))
			c = '<';
		    else if (string_436_.equals("gt"))
			c = '>';
		    else if (string_436_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_436_.equals("shy"))
			c = '\u00ad';
		    else if (string_436_.equals("times"))
			c = '\u00d7';
		    else if (string_436_.equals("euro"))
			c = '\u0080';
		    else if (string_436_.equals("copy"))
			c = '\u00a9';
		    else if (string_436_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_436_.startsWith("img=")) {
			    try {
				int i_437_;
				if (is_429_ != null)
				    i_437_ = is_429_[i_433_];
				else
				    i_437_ = 0;
				int i_438_;
				if (is_430_ != null)
				    i_438_ = is_430_[i_433_];
				else
				    i_438_ = 0;
				i_433_++;
				int i_439_
				    = Class275.method5102(string_436_
							      .substring(4),
							  -301656482);
				Class157 class157 = class157s[i_439_];
				int i_440_ = (is != null ? is[i_439_]
					      : class157.method2472());
				class157.method2479(i_437_ + i,
						    ((aClass7_1871.anInt46
						      * 1938404803)
						     + i_428_ - i_440_
						     + i_438_),
						    1, -1, 1);
				i += class157s[i_439_].method12();
				i_432_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_436_.startsWith("sprite=")) {
			    if (null != aClass7_1871.anInterface4_52) {
				try {
				    int i_441_ = -1;
				    int i_442_ = 0;
				    int i_443_ = string_436_.indexOf(',');
				    if (i_443_ == -1)
					i_441_ = (Class275.method5102
						  (string_436_.substring(7),
						   -425649193));
				    else {
					i_441_
					    = (Class275.method5102
					       (string_436_.substring(7,
								      i_443_),
						-1426913646));
					i_442_ = (Class275.method5102
						  (string_436_
						       .substring(1 + i_443_),
						   -576147271));
				    }
				    int i_444_;
				    if (null != is_429_)
					i_444_ = is_429_[i_433_];
				    else
					i_444_ = 0;
				    int i_445_;
				    if (null != is_430_)
					i_445_ = is_430_[i_433_];
				    else
					i_445_ = 0;
				    i_433_++;
				    Class157[] class157s_446_
					= (aClass7_1871.anInterface4_52
					       .method34
					   (aClass182_1864, i_441_,
					    1122007968));
				    if (null != class157s_446_) {
					int i_447_
					    = Math.min(class157s_446_
							   [i_442_]
							   .method2472(),
						       ((385749773
							 * (aClass7_1871
							    .anInt49))
							+ (aClass7_1871.anInt51
							   * 1921008003)));
					class157s_446_[i_442_].method2479
					    (i_444_ + i,
					     (1938404803 * aClass7_1871.anInt46
					      + (i_428_ + 3) - i_447_
					      + i_445_),
					     1, -1, 1);
					i += class157s_446_[i_442_].method12();
				    }
				    i_432_ = -1;
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else
			    method2847(string_436_, 506515132);
			continue;
		    }
		}
		if (-1 == i_431_) {
		    if (-1 != i_432_)
			i += aClass7_1871.method559(i_432_, c, (byte) 52);
		    int i_448_;
		    if (is_429_ != null)
			i_448_ = is_429_[i_433_];
		    else
			i_448_ = 0;
		    int i_449_;
		    if (null != is_430_)
			i_449_ = is_430_[i_433_];
		    else
			i_449_ = 0;
		    i_433_++;
		    if (c != 32) {
			if (0 != (anInt1873 * -1920710597 & ~0xffffff))
			    method2874(c, i_448_ + (i + 1),
				       1 + i_428_ + i_449_,
				       -1920710597 * anInt1873, true);
			method2874(c, i_448_ + i, i_449_ + i_428_,
				   anInt1863 * 320362971, false);
		    } else if (-449274495 * anInt1868 > 0) {
			anInt1875 += -2046028953 * anInt1868;
			i += -703078697 * anInt1875 >> 8;
			anInt1875
			    = -1286081305 * (-703078697 * anInt1875 & 0xff);
		    }
		    int i_450_ = aClass7_1871.method560(c, -1664940945);
		    if (-1 != anInt1869 * -1601478865)
			aClass182_1864.method3192
			    (i,
			     i_428_ + (int) ((double) (1938404803
						       * aClass7_1871.anInt46)
					     * 0.7),
			     i_450_, anInt1869 * -1601478865, -429120199);
		    if (-1 != anInt1874 * -1282902115)
			aClass182_1864.method3192
			    (i, i_428_ + aClass7_1871.anInt46 * 1938404803,
			     i_450_, anInt1874 * -1282902115, 767071109);
		    i += i_450_;
		    i_432_ = c;
		}
	    }
	}
    }
    
    public int method2895
	(String string, int i, int i_451_, int i_452_, int i_453_, int i_454_,
	 int i_455_, int i_456_, int i_457_, int i_458_, Class157[] class157s,
	 int[] is, Class152 class152, int i_459_, int i_460_) {
	return method2840(string, i, i_451_, i_452_, i_453_, i_454_, i_455_,
			  i_456_, i_457_, i_458_, 0, class157s, is, class152,
			  i_459_, i_460_, -907998741);
    }
    
    static final void method2896(Class683 class683, int i) {
	int i_461_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_461_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_461_ >> 16];
	Class609.method10012(class259, class245, class683, 950886696);
    }
    
    static final void method2897(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (int) (Class182_Sub2.aClass228_9503.method4270(307261211)
		     / 60000L);
    }
    
    static final void method2898(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_462_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	boolean bool
	    = class683.anIntArray8661[1 + class683.anInt8662 * 501271953] == 1;
	if (!OutputStream_Sub1.method17494(i_462_, bool, 739821117))
	    throw new RuntimeException();
    }
    
    static final void method2899(Class683 class683, int i)
	throws Exception_Sub7 {
	class683.anInt8662 -= -1189665054;
	int i_463_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_464_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	Class453_Sub3.aClass309_Sub1_10316
	    .method5571((float) i_463_, (float) i_464_, (byte) 0);
    }
}
