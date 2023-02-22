/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Point;

public class Class7
{
    public int anInt46;
    byte[][] aByteArrayArray47;
    static String[] aStringArray48 = new String[100];
    public int anInt49;
    byte[] aByteArray50;
    public int anInt51;
    public Interface4 anInterface4_52;
    public static Class404 aClass404_53;
    public static Class278 aClass278_54;
    
    public int method558(String string, int i, Interface2[] interface2s) {
	int i_0_ = method604(string, new int[] { i }, aStringArray48,
			     interface2s, (byte) 57);
	int i_1_ = 0;
	for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
	    int i_3_
		= method562(aStringArray48[i_2_], interface2s, -2045726965);
	    if (i_3_ > i_1_)
		i_1_ = i_3_;
	}
	return i_1_;
    }
    
    public int method559(int i, char c, byte i_4_) {
	if (null != aByteArrayArray47)
	    return aByteArrayArray47[i][c];
	return 0;
    }
    
    public int method560(int i, int i_5_) {
	return aByteArray50[i] & 0xff;
    }
    
    public int method561(String string, int i) {
	return method562(string, null, -1870994775);
    }
    
    public int method562(String string, Interface2[] interface2s, int i) {
	if (null == string)
	    return 0;
	int i_6_ = -1;
	int i_7_ = -1;
	int i_8_ = 0;
	int i_9_ = string.length();
	for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
	    char c = string.charAt(i_10_);
	    if (60 == c)
		i_6_ = i_10_;
	    else {
		if (c == 62 && i_6_ != -1) {
		    String string_11_ = string.substring(1 + i_6_, i_10_);
		    i_6_ = -1;
		    if (string_11_.equals("lt"))
			c = '<';
		    else if (string_11_.equals("gt"))
			c = '>';
		    else if (string_11_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_11_.equals("shy"))
			c = '\u00ad';
		    else if (string_11_.equals("times"))
			c = '\u00d7';
		    else if (string_11_.equals("euro"))
			c = '\u0080';
		    else if (string_11_.equals("copy"))
			c = '\u00a9';
		    else if (string_11_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_11_.startsWith("img=")
			    && null != interface2s) {
			    try {
				int i_12_
				    = Class275.method5102(string_11_
							      .substring(4),
							  -788767008);
				i_8_ += interface2s[i_12_].method12();
				i_7_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_11_.startsWith("sprite=")
				   && anInterface4_52 != null) {
			    try {
				int i_13_ = -1;
				int i_14_ = string_11_.indexOf(',');
				if (-1 == i_14_)
				    i_13_ = (Class275.method5102
					     (string_11_.substring(7),
					      -2006018514));
				else
				    i_13_ = (Class275.method5102
					     (string_11_.substring(7, i_14_),
					      -696264291));
				i_8_ += anInterface4_52.method35(i_13_,
								 -889138895);
				i_7_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i_6_ == -1) {
		    i_8_ += aByteArray50[(Class28.method908(c, -2099340796)
					  & 0xff)] & 0xff;
		    if (aByteArrayArray47 != null && i_7_ != -1)
			i_8_ += aByteArrayArray47[i_7_][c];
		    i_7_ = c;
		}
	    }
	}
	return i_8_;
    }
    
    int method563(String string, int[] is, String[] strings,
		  Interface2[] interface2s, boolean bool) {
	if (null == string)
	    return 0;
	int i = 0;
	int i_15_ = 0;
	int i_16_ = -1;
	int i_17_ = 0;
	int i_18_ = 0;
	int i_19_ = -1;
	int i_20_ = -1;
	int i_21_ = 0;
	int i_22_ = string.length();
	for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
	    int i_24_
		= Class28.method908(string.charAt(i_23_), -2099340796) & 0xff;
	    int i_25_ = 0;
	    if (i_24_ == 60)
		i_19_ = i_23_;
	    else {
		int i_26_;
		if (-1 != i_19_) {
		    if (62 != i_24_)
			continue;
		    i_26_ = i_19_;
		    String string_27_ = string.substring(i_19_ + 1, i_23_);
		    i_19_ = -1;
		    if (string_27_.equals("br")) {
			strings[i_21_] = string.substring(i_15_, 1 + i_23_);
			if (++i_21_ >= strings.length)
			    return 0;
			i_15_ = i_23_ + 1;
			i = 0;
			i_16_ = -1;
			i_20_ = -1;
			continue;
		    }
		    if (string_27_.equals("lt")) {
			i_25_ += method560(60, -1664940945);
			if (aByteArrayArray47 != null && -1 != i_20_)
			    i_25_ += aByteArrayArray47[i_20_][60];
			i_20_ = 60;
		    } else if (string_27_.equals("gt")) {
			i_25_ += method560(62, -1664940945);
			if (null != aByteArrayArray47 && -1 != i_20_)
			    i_25_ += aByteArrayArray47[i_20_][62];
			i_20_ = 62;
		    } else if (string_27_.equals("nbsp")) {
			i_25_ += method560(160, -1664940945);
			if (aByteArrayArray47 != null && i_20_ != -1)
			    i_25_ += aByteArrayArray47[i_20_][160];
			i_20_ = 160;
		    } else if (string_27_.equals("shy")) {
			i_25_ += method560(173, -1664940945);
			if (null != aByteArrayArray47 && i_20_ != -1)
			    i_25_ += aByteArrayArray47[i_20_][173];
			i_20_ = 173;
		    } else if (string_27_.equals("times")) {
			i_25_ += method560(215, -1664940945);
			if (null != aByteArrayArray47 && i_20_ != -1)
			    i_25_ += aByteArrayArray47[i_20_][215];
			i_20_ = 215;
		    } else if (string_27_.equals("euro")) {
			i_25_ += method560(128, -1664940945);
			if (null != aByteArrayArray47 && i_20_ != -1)
			    i_25_ += aByteArrayArray47[i_20_][128];
			i_20_ = 128;
		    } else if (string_27_.equals("copy")) {
			i_25_ += method560(169, -1664940945);
			if (aByteArrayArray47 != null && -1 != i_20_)
			    i_25_ += aByteArrayArray47[i_20_][169];
			i_20_ = 169;
		    } else if (string_27_.equals("reg")) {
			i_25_ += method560(174, -1664940945);
			if (null != aByteArrayArray47 && i_20_ != -1)
			    i_25_ += aByteArrayArray47[i_20_][174];
			i_20_ = 174;
		    } else if (string_27_.startsWith("img=")
			       && interface2s != null) {
			try {
			    int i_28_
				= Class275.method5102(string_27_.substring(4),
						      -722743759);
			    i_25_ += interface2s[i_28_].method12();
			    i_20_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    } else if (string_27_.startsWith("sprite=")
			       && anInterface4_52 != null) {
			try {
			    int i_29_ = -1;
			    int i_30_ = string_27_.indexOf(',');
			    if (-1 == i_30_)
				i_29_ = Class275.method5102(string_27_
								.substring(7),
							    -115483051);
			    else
				i_29_ = (Class275.method5102
					 (string_27_.substring(7, i_30_),
					  -1827350397));
			    i_25_
				+= anInterface4_52.method35(i_29_, -538783235);
			    i_20_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
			continue;
		    }
		    i_24_ = -1;
		} else {
		    i_26_ = i_23_;
		    i_25_ += method560(i_24_, -1664940945);
		    if (aByteArrayArray47 != null && i_20_ != -1)
			i_25_ += aByteArrayArray47[i_20_][i_24_];
		    i_20_ = i_24_;
		}
		if (i_25_ > 0) {
		    i += i_25_;
		    if (is != null) {
			if (32 == i_24_) {
			    i_16_ = i_23_;
			    i_17_ = i;
			    i_18_ = bool ? 1 : 0;
			}
			if (i
			    > is[i_21_ < is.length ? i_21_ : is.length - 1]) {
			    if (i_16_ >= 0) {
				strings[i_21_]
				    = string.substring(i_15_,
						       1 + i_16_ - i_18_);
				if (++i_21_ >= strings.length)
				    return 0;
				i_15_ = i_16_ + 1;
				i_16_ = -1;
				i -= i_17_;
				i_20_ = -1;
			    } else {
				strings[i_21_]
				    = string.substring(i_15_, i_26_);
				if (++i_21_ >= strings.length)
				    return 0;
				i_15_ = i_26_;
				i_16_ = -1;
				i = i_25_;
				i_20_ = -1;
			    }
			}
			if (i_24_ == 45) {
			    i_16_ = i_23_;
			    i_17_ = i;
			    i_18_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_15_) {
	    strings[i_21_] = string.substring(i_15_, string.length());
	    i_21_++;
	}
	return i_21_;
    }
    
    public int method564(String string, int[] is, String[] strings,
			 Interface2[] interface2s) {
	return method565(string, is, strings, interface2s, true, (byte) -116);
    }
    
    int method565(String string, int[] is, String[] strings,
		  Interface2[] interface2s, boolean bool, byte i) {
	if (null == string)
	    return 0;
	int i_31_ = 0;
	int i_32_ = 0;
	int i_33_ = -1;
	int i_34_ = 0;
	int i_35_ = 0;
	int i_36_ = -1;
	int i_37_ = -1;
	int i_38_ = 0;
	int i_39_ = string.length();
	for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
	    int i_41_
		= Class28.method908(string.charAt(i_40_), -2099340796) & 0xff;
	    int i_42_ = 0;
	    if (i_41_ == 60)
		i_36_ = i_40_;
	    else {
		int i_43_;
		if (-1 != i_36_) {
		    if (62 != i_41_)
			continue;
		    i_43_ = i_36_;
		    String string_44_ = string.substring(i_36_ + 1, i_40_);
		    i_36_ = -1;
		    if (string_44_.equals("br")) {
			strings[i_38_] = string.substring(i_32_, 1 + i_40_);
			if (++i_38_ >= strings.length)
			    return 0;
			i_32_ = i_40_ + 1;
			i_31_ = 0;
			i_33_ = -1;
			i_37_ = -1;
			continue;
		    }
		    if (string_44_.equals("lt")) {
			i_42_ += method560(60, -1664940945);
			if (aByteArrayArray47 != null && -1 != i_37_)
			    i_42_ += aByteArrayArray47[i_37_][60];
			i_37_ = 60;
		    } else if (string_44_.equals("gt")) {
			i_42_ += method560(62, -1664940945);
			if (null != aByteArrayArray47 && -1 != i_37_)
			    i_42_ += aByteArrayArray47[i_37_][62];
			i_37_ = 62;
		    } else if (string_44_.equals("nbsp")) {
			i_42_ += method560(160, -1664940945);
			if (aByteArrayArray47 != null && i_37_ != -1)
			    i_42_ += aByteArrayArray47[i_37_][160];
			i_37_ = 160;
		    } else if (string_44_.equals("shy")) {
			i_42_ += method560(173, -1664940945);
			if (null != aByteArrayArray47 && i_37_ != -1)
			    i_42_ += aByteArrayArray47[i_37_][173];
			i_37_ = 173;
		    } else if (string_44_.equals("times")) {
			i_42_ += method560(215, -1664940945);
			if (null != aByteArrayArray47 && i_37_ != -1)
			    i_42_ += aByteArrayArray47[i_37_][215];
			i_37_ = 215;
		    } else if (string_44_.equals("euro")) {
			i_42_ += method560(128, -1664940945);
			if (null != aByteArrayArray47 && i_37_ != -1)
			    i_42_ += aByteArrayArray47[i_37_][128];
			i_37_ = 128;
		    } else if (string_44_.equals("copy")) {
			i_42_ += method560(169, -1664940945);
			if (aByteArrayArray47 != null && -1 != i_37_)
			    i_42_ += aByteArrayArray47[i_37_][169];
			i_37_ = 169;
		    } else if (string_44_.equals("reg")) {
			i_42_ += method560(174, -1664940945);
			if (null != aByteArrayArray47 && i_37_ != -1)
			    i_42_ += aByteArrayArray47[i_37_][174];
			i_37_ = 174;
		    } else if (string_44_.startsWith("img=")
			       && interface2s != null) {
			try {
			    int i_45_
				= Class275.method5102(string_44_.substring(4),
						      -630644049);
			    i_42_ += interface2s[i_45_].method12();
			    i_37_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    } else if (string_44_.startsWith("sprite=")
			       && anInterface4_52 != null) {
			try {
			    int i_46_ = -1;
			    int i_47_ = string_44_.indexOf(',');
			    if (-1 == i_47_)
				i_46_ = Class275.method5102(string_44_
								.substring(7),
							    -1421265668);
			    else
				i_46_ = (Class275.method5102
					 (string_44_.substring(7, i_47_),
					  -32457712));
			    i_42_ += anInterface4_52.method35(i_46_,
							      -1031118977);
			    i_37_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
			continue;
		    }
		    i_41_ = -1;
		} else {
		    i_43_ = i_40_;
		    i_42_ += method560(i_41_, -1664940945);
		    if (aByteArrayArray47 != null && i_37_ != -1)
			i_42_ += aByteArrayArray47[i_37_][i_41_];
		    i_37_ = i_41_;
		}
		if (i_42_ > 0) {
		    i_31_ += i_42_;
		    if (is != null) {
			if (32 == i_41_) {
			    i_33_ = i_40_;
			    i_34_ = i_31_;
			    i_35_ = bool ? 1 : 0;
			}
			if (i_31_
			    > is[i_38_ < is.length ? i_38_ : is.length - 1]) {
			    if (i_33_ >= 0) {
				strings[i_38_]
				    = string.substring(i_32_,
						       1 + i_33_ - i_35_);
				if (++i_38_ >= strings.length)
				    return 0;
				i_32_ = i_33_ + 1;
				i_33_ = -1;
				i_31_ -= i_34_;
				i_37_ = -1;
			    } else {
				strings[i_38_]
				    = string.substring(i_32_, i_43_);
				if (++i_38_ >= strings.length)
				    return 0;
				i_32_ = i_43_;
				i_33_ = -1;
				i_31_ = i_42_;
				i_37_ = -1;
			    }
			}
			if (i_41_ == 45) {
			    i_33_ = i_40_;
			    i_34_ = i_31_;
			    i_35_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_32_) {
	    strings[i_38_] = string.substring(i_32_, string.length());
	    i_38_++;
	}
	return i_38_;
    }
    
    public int method566(String string, int i, Interface2[] interface2s,
			 int i_48_) {
	int i_49_ = method604(string, new int[] { i }, aStringArray48,
			      interface2s, (byte) -80);
	int i_50_ = 0;
	for (int i_51_ = 0; i_51_ < i_49_; i_51_++) {
	    int i_52_
		= method562(aStringArray48[i_51_], interface2s, -1991149797);
	    if (i_52_ > i_50_)
		i_50_ = i_52_;
	}
	return i_50_;
    }
    
    public static Class7 method567(JS5 class458, int i, int i_53_) {
	return Class610.method10023(class458, i, i_53_, null, 357301123);
    }
    
    public String method568(String string, int i, Interface2[] interface2s,
			    int i_54_, byte i_55_) {
	int i_56_ = method604(string, new int[] { i }, aStringArray48,
			      interface2s, (byte) -8);
	if (i_54_ >= 0 && i_54_ < i_56_)
	    return aStringArray48[i_54_];
	return null;
    }
    
    public Point method569(String string, int i, int i_57_, int i_58_,
			   Interface2[] interface2s) {
	if (i_58_ <= 0)
	    return new Point(0, i_57_ + anInt49 * 385749773);
	if (i_58_ > string.length())
	    i_58_ = string.length();
	if (i_57_ == 0)
	    i_57_ = 1938404803 * anInt46;
	int i_59_ = method565(string, new int[] { i }, aStringArray48,
			      interface2s, false, (byte) -93);
	int i_60_ = 0;
	for (int i_61_ = 0; i_61_ < i_59_; i_61_++) {
	    int i_62_ = aStringArray48[i_61_].length();
	    if (i_60_ + i_62_ > i_58_
		|| i_59_ - 1 == i_61_ && i_58_ == string.length()) {
		String string_63_ = string.substring(i_60_, i_58_);
		if (string_63_.endsWith("<br>")) {
		    string_63_ = "";
		    i_60_ += i_62_;
		    i_61_++;
		}
		int i_64_ = method562(string_63_, interface2s, -2041280969);
		int i_65_ = i_61_ * i_57_ + anInt49 * 385749773;
		return new Point(i_64_, i_65_);
	    }
	    i_60_ += i_62_;
	}
	return null;
    }
    
    public Point method570(String string, int i, int i_66_, int i_67_,
			   Interface2[] interface2s, byte i_68_) {
	if (i_67_ <= 0)
	    return new Point(0, i_66_ + anInt49 * 385749773);
	if (i_67_ > string.length())
	    i_67_ = string.length();
	if (i_66_ == 0)
	    i_66_ = 1938404803 * anInt46;
	int i_69_ = method565(string, new int[] { i }, aStringArray48,
			      interface2s, false, (byte) -33);
	int i_70_ = 0;
	for (int i_71_ = 0; i_71_ < i_69_; i_71_++) {
	    int i_72_ = aStringArray48[i_71_].length();
	    if (i_70_ + i_72_ > i_67_
		|| i_69_ - 1 == i_71_ && i_67_ == string.length()) {
		String string_73_ = string.substring(i_70_, i_67_);
		if (string_73_.endsWith("<br>")) {
		    string_73_ = "";
		    i_70_ += i_72_;
		    i_71_++;
		}
		int i_74_ = method562(string_73_, interface2s, -1782633076);
		int i_75_ = i_71_ * i_66_ + anInt49 * 385749773;
		return new Point(i_74_, i_75_);
	    }
	    i_70_ += i_72_;
	}
	return null;
    }
    
    int method571(String string, int[] is, String[] strings,
		  Interface2[] interface2s, boolean bool) {
	if (null == string)
	    return 0;
	int i = 0;
	int i_76_ = 0;
	int i_77_ = -1;
	int i_78_ = 0;
	int i_79_ = 0;
	int i_80_ = -1;
	int i_81_ = -1;
	int i_82_ = 0;
	int i_83_ = string.length();
	for (int i_84_ = 0; i_84_ < i_83_; i_84_++) {
	    int i_85_
		= Class28.method908(string.charAt(i_84_), -2099340796) & 0xff;
	    int i_86_ = 0;
	    if (i_85_ == 60)
		i_80_ = i_84_;
	    else {
		int i_87_;
		if (-1 != i_80_) {
		    if (62 != i_85_)
			continue;
		    i_87_ = i_80_;
		    String string_88_ = string.substring(i_80_ + 1, i_84_);
		    i_80_ = -1;
		    if (string_88_.equals("br")) {
			strings[i_82_] = string.substring(i_76_, 1 + i_84_);
			if (++i_82_ >= strings.length)
			    return 0;
			i_76_ = i_84_ + 1;
			i = 0;
			i_77_ = -1;
			i_81_ = -1;
			continue;
		    }
		    if (string_88_.equals("lt")) {
			i_86_ += method560(60, -1664940945);
			if (aByteArrayArray47 != null && -1 != i_81_)
			    i_86_ += aByteArrayArray47[i_81_][60];
			i_81_ = 60;
		    } else if (string_88_.equals("gt")) {
			i_86_ += method560(62, -1664940945);
			if (null != aByteArrayArray47 && -1 != i_81_)
			    i_86_ += aByteArrayArray47[i_81_][62];
			i_81_ = 62;
		    } else if (string_88_.equals("nbsp")) {
			i_86_ += method560(160, -1664940945);
			if (aByteArrayArray47 != null && i_81_ != -1)
			    i_86_ += aByteArrayArray47[i_81_][160];
			i_81_ = 160;
		    } else if (string_88_.equals("shy")) {
			i_86_ += method560(173, -1664940945);
			if (null != aByteArrayArray47 && i_81_ != -1)
			    i_86_ += aByteArrayArray47[i_81_][173];
			i_81_ = 173;
		    } else if (string_88_.equals("times")) {
			i_86_ += method560(215, -1664940945);
			if (null != aByteArrayArray47 && i_81_ != -1)
			    i_86_ += aByteArrayArray47[i_81_][215];
			i_81_ = 215;
		    } else if (string_88_.equals("euro")) {
			i_86_ += method560(128, -1664940945);
			if (null != aByteArrayArray47 && i_81_ != -1)
			    i_86_ += aByteArrayArray47[i_81_][128];
			i_81_ = 128;
		    } else if (string_88_.equals("copy")) {
			i_86_ += method560(169, -1664940945);
			if (aByteArrayArray47 != null && -1 != i_81_)
			    i_86_ += aByteArrayArray47[i_81_][169];
			i_81_ = 169;
		    } else if (string_88_.equals("reg")) {
			i_86_ += method560(174, -1664940945);
			if (null != aByteArrayArray47 && i_81_ != -1)
			    i_86_ += aByteArrayArray47[i_81_][174];
			i_81_ = 174;
		    } else if (string_88_.startsWith("img=")
			       && interface2s != null) {
			try {
			    int i_89_
				= Class275.method5102(string_88_.substring(4),
						      -2134516946);
			    i_86_ += interface2s[i_89_].method12();
			    i_81_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    } else if (string_88_.startsWith("sprite=")
			       && anInterface4_52 != null) {
			try {
			    int i_90_ = -1;
			    int i_91_ = string_88_.indexOf(',');
			    if (-1 == i_91_)
				i_90_ = Class275.method5102(string_88_
								.substring(7),
							    -629153010);
			    else
				i_90_ = (Class275.method5102
					 (string_88_.substring(7, i_91_),
					  -1476761879));
			    i_86_ += anInterface4_52.method35(i_90_,
							      -2020548078);
			    i_81_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
			continue;
		    }
		    i_85_ = -1;
		} else {
		    i_87_ = i_84_;
		    i_86_ += method560(i_85_, -1664940945);
		    if (aByteArrayArray47 != null && i_81_ != -1)
			i_86_ += aByteArrayArray47[i_81_][i_85_];
		    i_81_ = i_85_;
		}
		if (i_86_ > 0) {
		    i += i_86_;
		    if (is != null) {
			if (32 == i_85_) {
			    i_77_ = i_84_;
			    i_78_ = i;
			    i_79_ = bool ? 1 : 0;
			}
			if (i
			    > is[i_82_ < is.length ? i_82_ : is.length - 1]) {
			    if (i_77_ >= 0) {
				strings[i_82_]
				    = string.substring(i_76_,
						       1 + i_77_ - i_79_);
				if (++i_82_ >= strings.length)
				    return 0;
				i_76_ = i_77_ + 1;
				i_77_ = -1;
				i -= i_78_;
				i_81_ = -1;
			    } else {
				strings[i_82_]
				    = string.substring(i_76_, i_87_);
				if (++i_82_ >= strings.length)
				    return 0;
				i_76_ = i_87_;
				i_77_ = -1;
				i = i_86_;
				i_81_ = -1;
			    }
			}
			if (i_85_ == 45) {
			    i_77_ = i_84_;
			    i_78_ = i;
			    i_79_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_76_) {
	    strings[i_82_] = string.substring(i_76_, string.length());
	    i_82_++;
	}
	return i_82_;
    }
    
    public int method572(String string, int i, Interface2[] interface2s) {
	int i_92_ = method604(string, new int[] { i }, aStringArray48,
			      interface2s, (byte) 16);
	int i_93_ = 0;
	for (int i_94_ = 0; i_94_ < i_92_; i_94_++) {
	    int i_95_
		= method562(aStringArray48[i_94_], interface2s, -1847321853);
	    if (i_95_ > i_93_)
		i_93_ = i_95_;
	}
	return i_93_;
    }
    
    public int method573(String string) {
	return method562(string, null, -1981851267);
    }
    
    public static Class7 method574(JS5 class458, int i, int i_96_,
                                   Interface4 interface4) {
	byte[] is = class458.getFile(i, i_96_, 1331810357);
	if (is == null)
	    return null;
	return new Class7(is, interface4);
    }
    
    public static Class7 method575(JS5 class458, int i,
                                   Interface4 interface4) {
	byte[] is = class458.getTextureData(i, 1894235656);
	if (null == is)
	    return null;
	return new Class7(is, interface4);
    }
    
    public static Class7 method576(JS5 class458, int i,
                                   Interface4 interface4) {
	byte[] is = class458.getTextureData(i, 1435682589);
	if (null == is)
	    return null;
	return new Class7(is, interface4);
    }
    
    public static Class7 method577(JS5 class458, int i,
                                   Interface4 interface4) {
	byte[] is = class458.getTextureData(i, 1422655938);
	if (null == is)
	    return null;
	return new Class7(is, interface4);
    }
    
    public static Class7 method578(JS5 class458, int i,
                                   Interface4 interface4) {
	byte[] is = class458.getTextureData(i, 2004645702);
	if (null == is)
	    return null;
	return new Class7(is, interface4);
    }
    
    static int method579(byte[][] is, byte[][] is_97_, int[] is_98_,
			 byte[] is_99_, int[] is_100_, int i, int i_101_) {
	int i_102_ = is_98_[i];
	int i_103_ = is_100_[i] + i_102_;
	int i_104_ = is_98_[i_101_];
	int i_105_ = i_104_ + is_100_[i_101_];
	int i_106_ = i_102_;
	if (i_104_ > i_102_)
	    i_106_ = i_104_;
	int i_107_ = i_103_;
	if (i_105_ < i_103_)
	    i_107_ = i_105_;
	int i_108_ = is_99_[i] & 0xff;
	if ((is_99_[i_101_] & 0xff) < i_108_)
	    i_108_ = is_99_[i_101_] & 0xff;
	byte[] is_109_ = is_97_[i];
	byte[] is_110_ = is[i_101_];
	int i_111_ = i_106_ - i_102_;
	int i_112_ = i_106_ - i_104_;
	for (int i_113_ = i_106_; i_113_ < i_107_; i_113_++) {
	    int i_114_ = is_109_[i_111_++] + is_110_[i_112_++];
	    if (i_114_ < i_108_)
		i_108_ = i_114_;
	}
	return -i_108_;
    }
    
    static int method580(byte[][] is, byte[][] is_115_, int[] is_116_,
			 byte[] is_117_, int[] is_118_, int i, int i_119_) {
	int i_120_ = is_116_[i];
	int i_121_ = is_118_[i] + i_120_;
	int i_122_ = is_116_[i_119_];
	int i_123_ = i_122_ + is_118_[i_119_];
	int i_124_ = i_120_;
	if (i_122_ > i_120_)
	    i_124_ = i_122_;
	int i_125_ = i_121_;
	if (i_123_ < i_121_)
	    i_125_ = i_123_;
	int i_126_ = is_117_[i] & 0xff;
	if ((is_117_[i_119_] & 0xff) < i_126_)
	    i_126_ = is_117_[i_119_] & 0xff;
	byte[] is_127_ = is_115_[i];
	byte[] is_128_ = is[i_119_];
	int i_129_ = i_124_ - i_120_;
	int i_130_ = i_124_ - i_122_;
	for (int i_131_ = i_124_; i_131_ < i_125_; i_131_++) {
	    int i_132_ = is_127_[i_129_++] + is_128_[i_130_++];
	    if (i_132_ < i_126_)
		i_126_ = i_132_;
	}
	return -i_126_;
    }
    
    public int method581(int i, char c) {
	if (null != aByteArrayArray47)
	    return aByteArrayArray47[i][c];
	return 0;
    }
    
    public int method582(String string, int i, int i_133_,
			 Interface2[] interface2s) {
	if (0 == i_133_)
	    i_133_ = 1938404803 * anInt46;
	int i_134_ = method604(string, new int[] { i }, aStringArray48,
			       interface2s, (byte) 45);
	int i_135_ = i_133_ * (i_134_ - 1);
	return 1921008003 * anInt51 + (i_135_ + 385749773 * anInt49);
    }
    
    public static Class7 method583(JS5 class458, int i, int i_136_) {
	return Class610.method10023(class458, i, i_136_, null, 442291134);
    }
    
    public int method584(int i) {
	return aByteArray50[i] & 0xff;
    }
    
    public int method585(String string, Interface2[] interface2s) {
	if (null == string)
	    return 0;
	int i = -1;
	int i_137_ = -1;
	int i_138_ = 0;
	int i_139_ = string.length();
	for (int i_140_ = 0; i_140_ < i_139_; i_140_++) {
	    char c = string.charAt(i_140_);
	    if (60 == c)
		i = i_140_;
	    else {
		if (c == 62 && i != -1) {
		    String string_141_ = string.substring(1 + i, i_140_);
		    i = -1;
		    if (string_141_.equals("lt"))
			c = '<';
		    else if (string_141_.equals("gt"))
			c = '>';
		    else if (string_141_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_141_.equals("shy"))
			c = '\u00ad';
		    else if (string_141_.equals("times"))
			c = '\u00d7';
		    else if (string_141_.equals("euro"))
			c = '\u0080';
		    else if (string_141_.equals("copy"))
			c = '\u00a9';
		    else if (string_141_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_141_.startsWith("img=")
			    && null != interface2s) {
			    try {
				int i_142_
				    = Class275.method5102(string_141_
							      .substring(4),
							  -916934292);
				i_138_ += interface2s[i_142_].method12();
				i_137_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_141_.startsWith("sprite=")
				   && anInterface4_52 != null) {
			    try {
				int i_143_ = -1;
				int i_144_ = string_141_.indexOf(',');
				if (-1 == i_144_)
				    i_143_ = (Class275.method5102
					      (string_141_.substring(7),
					       -33891597));
				else
				    i_143_
					= (Class275.method5102
					   (string_141_.substring(7, i_144_),
					    -681213427));
				i_138_
				    += anInterface4_52.method35(i_143_,
								-1746781503);
				i_137_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i == -1) {
		    i_138_ += aByteArray50[(Class28.method908(c, -2099340796)
					    & 0xff)] & 0xff;
		    if (aByteArrayArray47 != null && i_137_ != -1)
			i_138_ += aByteArrayArray47[i_137_][c];
		    i_137_ = c;
		}
	    }
	}
	return i_138_;
    }
    
    public int method586(String string, Interface2[] interface2s) {
	if (null == string)
	    return 0;
	int i = -1;
	int i_145_ = -1;
	int i_146_ = 0;
	int i_147_ = string.length();
	for (int i_148_ = 0; i_148_ < i_147_; i_148_++) {
	    char c = string.charAt(i_148_);
	    if (60 == c)
		i = i_148_;
	    else {
		if (c == 62 && i != -1) {
		    String string_149_ = string.substring(1 + i, i_148_);
		    i = -1;
		    if (string_149_.equals("lt"))
			c = '<';
		    else if (string_149_.equals("gt"))
			c = '>';
		    else if (string_149_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_149_.equals("shy"))
			c = '\u00ad';
		    else if (string_149_.equals("times"))
			c = '\u00d7';
		    else if (string_149_.equals("euro"))
			c = '\u0080';
		    else if (string_149_.equals("copy"))
			c = '\u00a9';
		    else if (string_149_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_149_.startsWith("img=")
			    && null != interface2s) {
			    try {
				int i_150_
				    = Class275.method5102(string_149_
							      .substring(4),
							  -2004322503);
				i_146_ += interface2s[i_150_].method12();
				i_145_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_149_.startsWith("sprite=")
				   && anInterface4_52 != null) {
			    try {
				int i_151_ = -1;
				int i_152_ = string_149_.indexOf(',');
				if (-1 == i_152_)
				    i_151_ = (Class275.method5102
					      (string_149_.substring(7),
					       -760266590));
				else
				    i_151_
					= (Class275.method5102
					   (string_149_.substring(7, i_152_),
					    -1530646406));
				i_146_
				    += anInterface4_52.method35(i_151_,
								-1181305453);
				i_145_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i == -1) {
		    i_146_ += aByteArray50[(Class28.method908(c, -2099340796)
					    & 0xff)] & 0xff;
		    if (aByteArrayArray47 != null && i_145_ != -1)
			i_146_ += aByteArrayArray47[i_145_][c];
		    i_145_ = c;
		}
	    }
	}
	return i_146_;
    }
    
    public String method587(String string, int i, Interface2[] interface2s) {
	if (method562(string, interface2s, -1776036288) <= i)
	    return string;
	i -= method562("...", null, -2129023421);
	int i_153_ = -1;
	int i_154_ = -1;
	int i_155_ = 0;
	int i_156_ = string.length();
	String string_157_ = "";
	for (int i_158_ = 0; i_158_ < i_156_; i_158_++) {
	    char c = string.charAt(i_158_);
	    if (60 == c)
		i_153_ = i_158_;
	    else {
		if (c == 62 && i_153_ != -1) {
		    String string_159_ = string.substring(i_153_ + 1, i_158_);
		    i_153_ = -1;
		    if (string_159_.equals("lt"))
			c = '<';
		    else if (string_159_.equals("gt"))
			c = '>';
		    else if (string_159_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_159_.equals("shy"))
			c = '\u00ad';
		    else if (string_159_.equals("times"))
			c = '\u00d7';
		    else if (string_159_.equals("euro"))
			c = '\u0080';
		    else if (string_159_.equals("copy"))
			c = '\u00a9';
		    else if (string_159_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_159_.startsWith("img=")
			    && null != interface2s) {
			    try {
				int i_160_
				    = Class275.method5102(string_159_
							      .substring(4),
							  -1199312818);
				i_155_ += interface2s[i_160_].method12();
				i_154_ = -1;
				if (i_155_ > i)
				    return new StringBuilder().append
					       (string_157_).append
					       ("...").toString();
				string_157_ = string.substring(0, 1 + i_158_);
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_159_.startsWith("sprite=")
				   && null != anInterface4_52) {
			    try {
				int i_161_ = -1;
				int i_162_ = string_159_.indexOf(',');
				if (-1 == i_162_)
				    i_161_ = (Class275.method5102
					      (string_159_.substring(7),
					       -734232340));
				else
				    i_161_
					= (Class275.method5102
					   (string_159_.substring(7, i_162_),
					    -1856494032));
				i_155_
				    += anInterface4_52.method35(i_161_,
								-1392196076);
				i_154_ = -1;
				if (i_155_ > i)
				    return new StringBuilder().append
					       (string_157_).append
					       ("...").toString();
				string_157_ = string.substring(0, 1 + i_158_);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i_153_ == -1) {
		    i_155_ += aByteArray50[(Class28.method908(c, -2099340796)
					    & 0xff)] & 0xff;
		    if (null != aByteArrayArray47 && -1 != i_154_)
			i_155_ += aByteArrayArray47[i_154_][c];
		    i_154_ = c;
		    int i_163_ = i_155_;
		    if (null != aByteArrayArray47)
			i_163_ += aByteArrayArray47[c][46];
		    if (i_163_ > i)
			return new StringBuilder().append(string_157_).append
				   ("...").toString();
		    string_157_ = string.substring(0, i_158_ + 1);
		}
	    }
	}
	return string;
    }
    
    Class7(byte[] is, Interface4 interface4) {
	anInterface4_52 = interface4;
	RSBuffer class525_sub38 = new RSBuffer(is);
	int i = class525_sub38.readUnsignedByte(731085148);
	if (0 != i)
	    throw new RuntimeException("");
	boolean bool = class525_sub38.readUnsignedByte(768839134) == 1;
	aByteArray50 = new byte[256];
	class525_sub38.readBytes(aByteArray50, 0, 256, 23843912);
	if (bool) {
	    int[] is_164_ = new int[256];
	    int[] is_165_ = new int[256];
	    for (int i_166_ = 0; i_166_ < 256; i_166_++)
		is_164_[i_166_] = class525_sub38.readUnsignedByte(2066680781);
	    for (int i_167_ = 0; i_167_ < 256; i_167_++)
		is_165_[i_167_] = class525_sub38.readUnsignedByte(781544555);
	    byte[][] is_168_ = new byte[256][];
	    for (int i_169_ = 0; i_169_ < 256; i_169_++) {
		is_168_[i_169_] = new byte[is_164_[i_169_]];
		byte i_170_ = 0;
		for (int i_171_ = 0; i_171_ < is_168_[i_169_].length;
		     i_171_++) {
		    i_170_ += class525_sub38.readByte(-1150098071);
		    is_168_[i_169_][i_171_] = i_170_;
		}
	    }
	    byte[][] is_172_ = new byte[256][];
	    for (int i_173_ = 0; i_173_ < 256; i_173_++) {
		is_172_[i_173_] = new byte[is_164_[i_173_]];
		byte i_174_ = 0;
		for (int i_175_ = 0; i_175_ < is_172_[i_173_].length;
		     i_175_++) {
		    i_174_ += class525_sub38.readByte(-1150098071);
		    is_172_[i_173_][i_175_] = i_174_;
		}
	    }
	    aByteArrayArray47 = new byte[256][256];
	    for (int i_176_ = 0; i_176_ < 256; i_176_++) {
		if (32 != i_176_ && 160 != i_176_) {
		    for (int i_177_ = 0; i_177_ < 256; i_177_++) {
			if (i_177_ != 32 && i_177_ != 160)
			    aByteArrayArray47[i_176_][i_177_]
				= (byte) Class613.method10061(is_168_, is_172_,
							      is_165_,
							      aByteArray50,
							      is_164_, i_176_,
							      i_177_,
							      -1679432026);
		    }
		}
	    }
	    anInt46 = (is_165_[32] + is_164_[32]) * -1486822677;
	} else
	    anInt46 = class525_sub38.readUnsignedByte(1568523134) * -1486822677;
	class525_sub38.readUnsignedByte(171580810);
	class525_sub38.readUnsignedByte(604593566);
	anInt49 = class525_sub38.readUnsignedByte(1206167299) * 1249833925;
	anInt51 = class525_sub38.readUnsignedByte(1221038945) * -2033068757;
    }
    
    public Point method588(String string, int i, int i_178_, int i_179_,
			   Interface2[] interface2s) {
	if (i_179_ <= 0)
	    return new Point(0, i_178_ + anInt49 * 385749773);
	if (i_179_ > string.length())
	    i_179_ = string.length();
	if (i_178_ == 0)
	    i_178_ = 1938404803 * anInt46;
	int i_180_ = method565(string, new int[] { i }, aStringArray48,
			       interface2s, false, (byte) -10);
	int i_181_ = 0;
	for (int i_182_ = 0; i_182_ < i_180_; i_182_++) {
	    int i_183_ = aStringArray48[i_182_].length();
	    if (i_181_ + i_183_ > i_179_
		|| i_180_ - 1 == i_182_ && i_179_ == string.length()) {
		String string_184_ = string.substring(i_181_, i_179_);
		if (string_184_.endsWith("<br>")) {
		    string_184_ = "";
		    i_181_ += i_183_;
		    i_182_++;
		}
		int i_185_ = method562(string_184_, interface2s, -1949544568);
		int i_186_ = i_182_ * i_178_ + anInt49 * 385749773;
		return new Point(i_185_, i_186_);
	    }
	    i_181_ += i_183_;
	}
	return null;
    }
    
    public int method589(String string, int[] is, String[] strings,
			 Interface2[] interface2s) {
	return method565(string, is, strings, interface2s, true, (byte) -112);
    }
    
    public int method590(String string, int i, int i_187_,
			 Interface2[] interface2s) {
	if (0 == i_187_)
	    i_187_ = 1938404803 * anInt46;
	int i_188_ = method604(string, new int[] { i }, aStringArray48,
			       interface2s, (byte) 20);
	int i_189_ = i_187_ * (i_188_ - 1);
	return 1921008003 * anInt51 + (i_189_ + 385749773 * anInt49);
    }
    
    public int method591(String string, int[] is, String[] strings,
			 Interface2[] interface2s) {
	return method565(string, is, strings, interface2s, true, (byte) -56);
    }
    
    int method592(String string, int[] is, String[] strings,
		  Interface2[] interface2s, boolean bool) {
	if (null == string)
	    return 0;
	int i = 0;
	int i_190_ = 0;
	int i_191_ = -1;
	int i_192_ = 0;
	int i_193_ = 0;
	int i_194_ = -1;
	int i_195_ = -1;
	int i_196_ = 0;
	int i_197_ = string.length();
	for (int i_198_ = 0; i_198_ < i_197_; i_198_++) {
	    int i_199_
		= Class28.method908(string.charAt(i_198_), -2099340796) & 0xff;
	    int i_200_ = 0;
	    if (i_199_ == 60)
		i_194_ = i_198_;
	    else {
		int i_201_;
		if (-1 != i_194_) {
		    if (62 != i_199_)
			continue;
		    i_201_ = i_194_;
		    String string_202_ = string.substring(i_194_ + 1, i_198_);
		    i_194_ = -1;
		    if (string_202_.equals("br")) {
			strings[i_196_] = string.substring(i_190_, 1 + i_198_);
			if (++i_196_ >= strings.length)
			    return 0;
			i_190_ = i_198_ + 1;
			i = 0;
			i_191_ = -1;
			i_195_ = -1;
			continue;
		    }
		    if (string_202_.equals("lt")) {
			i_200_ += method560(60, -1664940945);
			if (aByteArrayArray47 != null && -1 != i_195_)
			    i_200_ += aByteArrayArray47[i_195_][60];
			i_195_ = 60;
		    } else if (string_202_.equals("gt")) {
			i_200_ += method560(62, -1664940945);
			if (null != aByteArrayArray47 && -1 != i_195_)
			    i_200_ += aByteArrayArray47[i_195_][62];
			i_195_ = 62;
		    } else if (string_202_.equals("nbsp")) {
			i_200_ += method560(160, -1664940945);
			if (aByteArrayArray47 != null && i_195_ != -1)
			    i_200_ += aByteArrayArray47[i_195_][160];
			i_195_ = 160;
		    } else if (string_202_.equals("shy")) {
			i_200_ += method560(173, -1664940945);
			if (null != aByteArrayArray47 && i_195_ != -1)
			    i_200_ += aByteArrayArray47[i_195_][173];
			i_195_ = 173;
		    } else if (string_202_.equals("times")) {
			i_200_ += method560(215, -1664940945);
			if (null != aByteArrayArray47 && i_195_ != -1)
			    i_200_ += aByteArrayArray47[i_195_][215];
			i_195_ = 215;
		    } else if (string_202_.equals("euro")) {
			i_200_ += method560(128, -1664940945);
			if (null != aByteArrayArray47 && i_195_ != -1)
			    i_200_ += aByteArrayArray47[i_195_][128];
			i_195_ = 128;
		    } else if (string_202_.equals("copy")) {
			i_200_ += method560(169, -1664940945);
			if (aByteArrayArray47 != null && -1 != i_195_)
			    i_200_ += aByteArrayArray47[i_195_][169];
			i_195_ = 169;
		    } else if (string_202_.equals("reg")) {
			i_200_ += method560(174, -1664940945);
			if (null != aByteArrayArray47 && i_195_ != -1)
			    i_200_ += aByteArrayArray47[i_195_][174];
			i_195_ = 174;
		    } else if (string_202_.startsWith("img=")
			       && interface2s != null) {
			try {
			    int i_203_
				= Class275.method5102(string_202_.substring(4),
						      -887489875);
			    i_200_ += interface2s[i_203_].method12();
			    i_195_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    } else if (string_202_.startsWith("sprite=")
			       && anInterface4_52 != null) {
			try {
			    int i_204_ = -1;
			    int i_205_ = string_202_.indexOf(',');
			    if (-1 == i_205_)
				i_204_ = Class275.method5102(string_202_
								 .substring(7),
							     -1703190105);
			    else
				i_204_ = (Class275.method5102
					  (string_202_.substring(7, i_205_),
					   -1148661130));
			    i_200_ += anInterface4_52.method35(i_204_,
							       -1135991833);
			    i_195_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
			continue;
		    }
		    i_199_ = -1;
		} else {
		    i_201_ = i_198_;
		    i_200_ += method560(i_199_, -1664940945);
		    if (aByteArrayArray47 != null && i_195_ != -1)
			i_200_ += aByteArrayArray47[i_195_][i_199_];
		    i_195_ = i_199_;
		}
		if (i_200_ > 0) {
		    i += i_200_;
		    if (is != null) {
			if (32 == i_199_) {
			    i_191_ = i_198_;
			    i_192_ = i;
			    i_193_ = bool ? 1 : 0;
			}
			if (i > is[(i_196_ < is.length ? i_196_
				    : is.length - 1)]) {
			    if (i_191_ >= 0) {
				strings[i_196_]
				    = string.substring(i_190_,
						       1 + i_191_ - i_193_);
				if (++i_196_ >= strings.length)
				    return 0;
				i_190_ = i_191_ + 1;
				i_191_ = -1;
				i -= i_192_;
				i_195_ = -1;
			    } else {
				strings[i_196_]
				    = string.substring(i_190_, i_201_);
				if (++i_196_ >= strings.length)
				    return 0;
				i_190_ = i_201_;
				i_191_ = -1;
				i = i_200_;
				i_195_ = -1;
			    }
			}
			if (i_199_ == 45) {
			    i_191_ = i_198_;
			    i_192_ = i;
			    i_193_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_190_) {
	    strings[i_196_] = string.substring(i_190_, string.length());
	    i_196_++;
	}
	return i_196_;
    }
    
    public int method593(String string, int i, Interface2[] interface2s) {
	int i_206_ = method604(string, new int[] { i }, aStringArray48,
			       interface2s, (byte) -11);
	int i_207_ = 0;
	for (int i_208_ = 0; i_208_ < i_206_; i_208_++) {
	    int i_209_
		= method562(aStringArray48[i_208_], interface2s, -2026682877);
	    if (i_209_ > i_207_)
		i_207_ = i_209_;
	}
	return i_207_;
    }
    
    public int method594(String string, int i, int i_210_,
			 Interface2[] interface2s, int i_211_) {
	if (0 == i_210_)
	    i_210_ = 1938404803 * anInt46;
	int i_212_ = method604(string, new int[] { i }, aStringArray48,
			       interface2s, (byte) 114);
	int i_213_ = i_210_ * (i_212_ - 1);
	return 1921008003 * anInt51 + (i_213_ + 385749773 * anInt49);
    }
    
    public int method595(String string, int i, Interface2[] interface2s) {
	int i_214_ = method604(string, new int[] { i }, aStringArray48,
			       interface2s, (byte) -61);
	int i_215_ = 0;
	for (int i_216_ = 0; i_216_ < i_214_; i_216_++) {
	    int i_217_
		= method562(aStringArray48[i_216_], interface2s, -2140031896);
	    if (i_217_ > i_215_)
		i_215_ = i_217_;
	}
	return i_215_;
    }
    
    public int method596(String string, int i, Interface2[] interface2s,
			 int i_218_) {
	return method604(string, new int[] { i }, aStringArray48, interface2s,
			 (byte) 42);
    }
    
    public int method597(String string, int i, Interface2[] interface2s) {
	return method604(string, new int[] { i }, aStringArray48, interface2s,
			 (byte) -56);
    }
    
    public int method598(String string, int i, Interface2[] interface2s) {
	return method604(string, new int[] { i }, aStringArray48, interface2s,
			 (byte) 78);
    }
    
    public int method599(String string, int i, Interface2[] interface2s) {
	return method604(string, new int[] { i }, aStringArray48, interface2s,
			 (byte) -3);
    }
    
    public String method600(String string, int i, Interface2[] interface2s,
			    int i_219_) {
	int i_220_ = method604(string, new int[] { i }, aStringArray48,
			       interface2s, (byte) 54);
	if (i_219_ >= 0 && i_219_ < i_220_)
	    return aStringArray48[i_219_];
	return null;
    }
    
    public String method601(String string, int i, Interface2[] interface2s,
			    int i_221_) {
	int i_222_ = method604(string, new int[] { i }, aStringArray48,
			       interface2s, (byte) 57);
	if (i_221_ >= 0 && i_221_ < i_222_)
	    return aStringArray48[i_221_];
	return null;
    }
    
    public int method602(String string, int i, int i_223_, int i_224_,
			 int i_225_, Interface2[] interface2s, byte i_226_) {
	if (0 == i_223_)
	    i_223_ = 1938404803 * anInt46;
	int i_227_ = method565(string, new int[] { i }, aStringArray48,
			       interface2s, false, (byte) -8);
	if (i_227_ == 0)
	    return 0;
	if (i_225_ < 0)
	    i_225_ = 0;
	i_225_ /= i_223_;
	if (i_225_ >= i_227_)
	    i_225_ = i_227_ - 1;
	String string_228_ = aStringArray48[i_225_];
	int i_229_ = 0;
	int i_230_ = 0;
	int i_231_;
	for (i_231_ = 0; i_231_ < i_224_ && i_229_ < string_228_.length();
	     i_231_ = method562(string_228_.substring(0, ++i_229_),
				interface2s, -2077650438))
	    i_230_ = i_231_;
	if (i_229_ == string_228_.length() && string_228_.endsWith("<br>"))
	    i_229_ -= 4;
	if (i_224_ - i_230_ < i_231_ - i_224_)
	    i_229_--;
	for (int i_232_ = 0; i_232_ < i_225_; i_232_++)
	    i_229_ += aStringArray48[i_232_].length();
	return i_229_;
    }
    
    public int method603(String string, Interface2[] interface2s) {
	if (null == string)
	    return 0;
	int i = -1;
	int i_233_ = -1;
	int i_234_ = 0;
	int i_235_ = string.length();
	for (int i_236_ = 0; i_236_ < i_235_; i_236_++) {
	    char c = string.charAt(i_236_);
	    if (60 == c)
		i = i_236_;
	    else {
		if (c == 62 && i != -1) {
		    String string_237_ = string.substring(1 + i, i_236_);
		    i = -1;
		    if (string_237_.equals("lt"))
			c = '<';
		    else if (string_237_.equals("gt"))
			c = '>';
		    else if (string_237_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_237_.equals("shy"))
			c = '\u00ad';
		    else if (string_237_.equals("times"))
			c = '\u00d7';
		    else if (string_237_.equals("euro"))
			c = '\u0080';
		    else if (string_237_.equals("copy"))
			c = '\u00a9';
		    else if (string_237_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_237_.startsWith("img=")
			    && null != interface2s) {
			    try {
				int i_238_
				    = Class275.method5102(string_237_
							      .substring(4),
							  -1113623515);
				i_234_ += interface2s[i_238_].method12();
				i_233_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_237_.startsWith("sprite=")
				   && anInterface4_52 != null) {
			    try {
				int i_239_ = -1;
				int i_240_ = string_237_.indexOf(',');
				if (-1 == i_240_)
				    i_239_ = (Class275.method5102
					      (string_237_.substring(7),
					       -1326141326));
				else
				    i_239_
					= (Class275.method5102
					   (string_237_.substring(7, i_240_),
					    -1053632312));
				i_234_ += anInterface4_52.method35(i_239_,
								   -776023218);
				i_233_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i == -1) {
		    i_234_ += aByteArray50[(Class28.method908(c, -2099340796)
					    & 0xff)] & 0xff;
		    if (aByteArrayArray47 != null && i_233_ != -1)
			i_234_ += aByteArrayArray47[i_233_][c];
		    i_233_ = c;
		}
	    }
	}
	return i_234_;
    }
    
    public int method604(String string, int[] is, String[] strings,
			 Interface2[] interface2s, byte i) {
	return method565(string, is, strings, interface2s, true, (byte) -39);
    }
    
    public int method605(String string, int i, int i_241_,
			 Interface2[] interface2s) {
	if (0 == i_241_)
	    i_241_ = 1938404803 * anInt46;
	int i_242_ = method604(string, new int[] { i }, aStringArray48,
			       interface2s, (byte) 11);
	int i_243_ = i_241_ * (i_242_ - 1);
	return 1921008003 * anInt51 + (i_243_ + 385749773 * anInt49);
    }
    
    public Point method606(String string, int i, int i_244_, int i_245_,
			   Interface2[] interface2s) {
	if (i_245_ <= 0)
	    return new Point(0, i_244_ + anInt49 * 385749773);
	if (i_245_ > string.length())
	    i_245_ = string.length();
	if (i_244_ == 0)
	    i_244_ = 1938404803 * anInt46;
	int i_246_ = method565(string, new int[] { i }, aStringArray48,
			       interface2s, false, (byte) -3);
	int i_247_ = 0;
	for (int i_248_ = 0; i_248_ < i_246_; i_248_++) {
	    int i_249_ = aStringArray48[i_248_].length();
	    if (i_247_ + i_249_ > i_245_
		|| i_246_ - 1 == i_248_ && i_245_ == string.length()) {
		String string_250_ = string.substring(i_247_, i_245_);
		if (string_250_.endsWith("<br>")) {
		    string_250_ = "";
		    i_247_ += i_249_;
		    i_248_++;
		}
		int i_251_ = method562(string_250_, interface2s, -2089002489);
		int i_252_ = i_248_ * i_244_ + anInt49 * 385749773;
		return new Point(i_251_, i_252_);
	    }
	    i_247_ += i_249_;
	}
	return null;
    }
    
    public int method607(String string, int i, int i_253_, int i_254_,
			 int i_255_, Interface2[] interface2s) {
	if (0 == i_253_)
	    i_253_ = 1938404803 * anInt46;
	int i_256_ = method565(string, new int[] { i }, aStringArray48,
			       interface2s, false, (byte) -113);
	if (i_256_ == 0)
	    return 0;
	if (i_255_ < 0)
	    i_255_ = 0;
	i_255_ /= i_253_;
	if (i_255_ >= i_256_)
	    i_255_ = i_256_ - 1;
	String string_257_ = aStringArray48[i_255_];
	int i_258_ = 0;
	int i_259_ = 0;
	int i_260_;
	for (i_260_ = 0; i_260_ < i_254_ && i_258_ < string_257_.length();
	     i_260_ = method562(string_257_.substring(0, ++i_258_),
				interface2s, -1890681678))
	    i_259_ = i_260_;
	if (i_258_ == string_257_.length() && string_257_.endsWith("<br>"))
	    i_258_ -= 4;
	if (i_254_ - i_259_ < i_260_ - i_254_)
	    i_258_--;
	for (int i_261_ = 0; i_261_ < i_255_; i_261_++)
	    i_258_ += aStringArray48[i_261_].length();
	return i_258_;
    }
    
    public int method608(String string, int i, int i_262_, int i_263_,
			 int i_264_, Interface2[] interface2s) {
	if (0 == i_262_)
	    i_262_ = 1938404803 * anInt46;
	int i_265_ = method565(string, new int[] { i }, aStringArray48,
			       interface2s, false, (byte) -15);
	if (i_265_ == 0)
	    return 0;
	if (i_264_ < 0)
	    i_264_ = 0;
	i_264_ /= i_262_;
	if (i_264_ >= i_265_)
	    i_264_ = i_265_ - 1;
	String string_266_ = aStringArray48[i_264_];
	int i_267_ = 0;
	int i_268_ = 0;
	int i_269_;
	for (i_269_ = 0; i_269_ < i_263_ && i_267_ < string_266_.length();
	     i_269_ = method562(string_266_.substring(0, ++i_267_),
				interface2s, -2018704258))
	    i_268_ = i_269_;
	if (i_267_ == string_266_.length() && string_266_.endsWith("<br>"))
	    i_267_ -= 4;
	if (i_263_ - i_268_ < i_269_ - i_263_)
	    i_267_--;
	for (int i_270_ = 0; i_270_ < i_264_; i_270_++)
	    i_267_ += aStringArray48[i_270_].length();
	return i_267_;
    }
    
    public String method609(String string, int i, Interface2[] interface2s,
			    byte i_271_) {
	if (method562(string, interface2s, -2133290193) <= i)
	    return string;
	i -= method562("...", null, -2073171923);
	int i_272_ = -1;
	int i_273_ = -1;
	int i_274_ = 0;
	int i_275_ = string.length();
	String string_276_ = "";
	for (int i_277_ = 0; i_277_ < i_275_; i_277_++) {
	    char c = string.charAt(i_277_);
	    if (60 == c)
		i_272_ = i_277_;
	    else {
		if (c == 62 && i_272_ != -1) {
		    String string_278_ = string.substring(i_272_ + 1, i_277_);
		    i_272_ = -1;
		    if (string_278_.equals("lt"))
			c = '<';
		    else if (string_278_.equals("gt"))
			c = '>';
		    else if (string_278_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_278_.equals("shy"))
			c = '\u00ad';
		    else if (string_278_.equals("times"))
			c = '\u00d7';
		    else if (string_278_.equals("euro"))
			c = '\u0080';
		    else if (string_278_.equals("copy"))
			c = '\u00a9';
		    else if (string_278_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_278_.startsWith("img=")
			    && null != interface2s) {
			    try {
				int i_279_
				    = Class275.method5102(string_278_
							      .substring(4),
							  -1842887591);
				i_274_ += interface2s[i_279_].method12();
				i_273_ = -1;
				if (i_274_ > i)
				    return new StringBuilder().append
					       (string_276_).append
					       ("...").toString();
				string_276_ = string.substring(0, 1 + i_277_);
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_278_.startsWith("sprite=")
				   && null != anInterface4_52) {
			    try {
				int i_280_ = -1;
				int i_281_ = string_278_.indexOf(',');
				if (-1 == i_281_)
				    i_280_ = (Class275.method5102
					      (string_278_.substring(7),
					       -2014862445));
				else
				    i_280_
					= (Class275.method5102
					   (string_278_.substring(7, i_281_),
					    -299459591));
				i_274_
				    += anInterface4_52.method35(i_280_,
								-1214816606);
				i_273_ = -1;
				if (i_274_ > i)
				    return new StringBuilder().append
					       (string_276_).append
					       ("...").toString();
				string_276_ = string.substring(0, 1 + i_277_);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i_272_ == -1) {
		    i_274_ += aByteArray50[(Class28.method908(c, -2099340796)
					    & 0xff)] & 0xff;
		    if (null != aByteArrayArray47 && -1 != i_273_)
			i_274_ += aByteArrayArray47[i_273_][c];
		    i_273_ = c;
		    int i_282_ = i_274_;
		    if (null != aByteArrayArray47)
			i_282_ += aByteArrayArray47[c][46];
		    if (i_282_ > i)
			return new StringBuilder().append(string_276_).append
				   ("...").toString();
		    string_276_ = string.substring(0, i_277_ + 1);
		}
	    }
	}
	return string;
    }
    
    static final void method610(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass525_Sub25_8653.aByte10597;
    }
}
