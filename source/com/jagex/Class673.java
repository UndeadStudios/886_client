/* Class673 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class673
{
    public static String method11059(int i, boolean bool) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class623.method10220(i, 10, bool, 1396404645);
    }
    
    static int method11060(CharSequence charsequence, char c) {
	int i = 0;
	int i_0_ = charsequence.length();
	for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
	    if (charsequence.charAt(i_1_) == c)
		i++;
	}
	return i;
    }
    
    public static int method11061(CharSequence charsequence) {
	int i = charsequence.length();
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < i; i_3_++)
	    i_2_ = (i_2_ << 5) - i_2_ + charsequence.charAt(i_3_);
	return i_2_;
    }
    
    public static String method11062(Object[] objects, int i, int i_4_) {
	if (i_4_ == 0)
	    return "";
	if (1 == i_4_) {
	    CharSequence charsequence = (CharSequence) objects[i];
	    if (null == charsequence)
		return "null";
	    return charsequence.toString();
	}
	int i_5_ = i_4_ + i;
	int i_6_ = 0;
	for (int i_7_ = i; i_7_ < i_5_; i_7_++) {
	    CharSequence charsequence = (CharSequence) objects[i_7_];
	    if (charsequence == null)
		i_6_ += 4;
	    else
		i_6_ += charsequence.length();
	}
	StringBuilder stringbuilder = new StringBuilder(i_6_);
	for (int i_8_ = i; i_8_ < i_5_; i_8_++) {
	    CharSequence charsequence = (CharSequence) objects[i_8_];
	    if (null == charsequence)
		stringbuilder.append("null");
	    else
		stringbuilder.append(charsequence);
	}
	return stringbuilder.toString();
    }
    
    static boolean method11063(CharSequence charsequence, int i,
			       boolean bool) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_9_ = false;
	boolean bool_10_ = false;
	int i_11_ = 0;
	int i_12_ = charsequence.length();
	for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
	    int i_14_ = charsequence.charAt(i_13_);
	    if (0 == i_13_) {
		if (45 == i_14_) {
		    bool_9_ = true;
		    continue;
		}
		if (43 == i_14_ && bool)
		    continue;
	    }
	    if (i_14_ >= 48 && i_14_ <= 57)
		i_14_ -= 48;
	    else if (i_14_ >= 65 && i_14_ <= 90)
		i_14_ -= 55;
	    else if (i_14_ >= 97 && i_14_ <= 122)
		i_14_ -= 87;
	    else
		return false;
	    if (i_14_ >= i)
		return false;
	    if (bool_9_)
		i_14_ = -i_14_;
	    int i_15_ = i_14_ + i_11_ * i;
	    if (i_11_ != i_15_ / i)
		return false;
	    i_11_ = i_15_;
	    bool_10_ = true;
	}
	return bool_10_;
    }
    
    public static String method11064(int i, boolean bool) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class623.method10220(i, 10, bool, 2145359846);
    }
    
    public static String method11065(int i, boolean bool) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class623.method10220(i, 10, bool, 1458492775);
    }
    
    public static int method11066(CharSequence charsequence, int i) {
	return Class198.method3765(charsequence, i, true, 802990379);
    }
    
    public static boolean method11067(char c) {
	return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z'
		|| c >= 'a' && c <= 'z');
    }
    
    public static boolean method11068(char c) {
	return c >= '0' && c <= '9';
    }
    
    public static boolean method11069(char c) {
	return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
    
    public static int method11070(CharSequence charsequence) {
	int i = charsequence.length();
	int i_16_ = 0;
	for (int i_17_ = 0; i_17_ < i; i_17_++)
	    i_16_ = ((i_16_ << 5) - i_16_
		     + Class28.method908(charsequence.charAt(i_17_),
					 -2099340796));
	return i_16_;
    }
    
    public static int method11071(CharSequence charsequence) {
	int i = charsequence.length();
	int i_18_ = 0;
	for (int i_19_ = 0; i_19_ < i; i_19_++)
	    i_18_ = ((i_18_ << 5) - i_18_
		     + Class28.method908(charsequence.charAt(i_19_),
					 -2099340796));
	return i_18_;
    }
    
    public static int method11072(CharSequence charsequence) {
	int i = charsequence.length();
	int i_20_ = 0;
	for (int i_21_ = 0; i_21_ < i; i_21_++)
	    i_20_ = ((i_20_ << 5) - i_20_
		     + Class28.method908(charsequence.charAt(i_21_),
					 -2099340796));
	return i_20_;
    }
    
    public static int method11073(CharSequence charsequence) {
	int i = charsequence.length();
	int i_22_ = 0;
	for (int i_23_ = 0; i_23_ < i; i_23_++)
	    i_22_ = (i_22_ << 5) - i_22_ + charsequence.charAt(i_23_);
	return i_22_;
    }
    
    public static int method11074(CharSequence charsequence) {
	int i = charsequence.length();
	int i_24_ = 0;
	for (int i_25_ = 0; i_25_ < i; i_25_++)
	    i_24_ = (i_24_ << 5) - i_24_ + charsequence.charAt(i_25_);
	return i_24_;
    }
    
    public static int method11075(CharSequence charsequence) {
	int i = charsequence.length();
	int i_26_ = 0;
	for (int i_27_ = 0; i_27_ < i; i_27_++)
	    i_26_ = (i_26_ << 5) - i_26_ + charsequence.charAt(i_27_);
	return i_26_;
    }
    
    Class673() throws Throwable {
	throw new Error();
    }
    
    public static long method11076(CharSequence charsequence) {
	int i = charsequence.length();
	long l = 0L;
	for (int i_28_ = 0; i_28_ < i; i_28_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_28_);
	return l;
    }
    
    public static long method11077(CharSequence charsequence) {
	int i = charsequence.length();
	long l = 0L;
	for (int i_29_ = 0; i_29_ < i; i_29_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_29_);
	return l;
    }
    
    public static int method11078(CharSequence charsequence,
				  CharSequence charsequence_30_) {
	int i = charsequence.length();
	int i_31_ = charsequence_30_.length();
	if (i == 0)
	    return i_31_;
	if (i_31_ == 0)
	    return i;
	int[] is = new int[1 + i];
	int[] is_32_ = new int[i + 1];
	for (int i_33_ = 0; i_33_ <= i; i_33_++)
	    is[i_33_] = i_33_;
	for (int i_34_ = 1; i_34_ <= i_31_; i_34_++) {
	    is_32_[0] = i_34_;
	    char c = charsequence_30_.charAt(i_34_ - 1);
	    for (int i_35_ = 1; i_35_ <= i; i_35_++)
		is_32_[i_35_]
		    = Math.min(Math.min(1 + is_32_[i_35_ - 1], 1 + is[i_35_]),
			       (is[i_35_ - 1]
				+ (charsequence.charAt(i_35_ - 1) == c ? 0
				   : 1)));
	    int[] is_36_ = is;
	    is = is_32_;
	    is_32_ = is_36_;
	}
	return is[i];
    }
    
    public static boolean method11079(char c) {
	return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
    
    public static String method11080(int i, boolean bool) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class623.method10220(i, 10, bool, 1885416898);
    }
    
    public static String method11081(int i, boolean bool) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class623.method10220(i, 10, bool, 619056569);
    }
    
    public static boolean method11082(char c) {
	return c >= '0' && c <= '9';
    }
    
    public static boolean method11083(char c) {
	return c >= '0' && c <= '9';
    }
    
    static int method11084(CharSequence charsequence, char c) {
	int i = 0;
	int i_37_ = charsequence.length();
	for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
	    if (charsequence.charAt(i_38_) == c)
		i++;
	}
	return i;
    }
    
    public static boolean method11085(char c) {
	return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z'
		|| c >= 'a' && c <= 'z');
    }
    
    public static boolean method11086(char c) {
	return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z'
		|| c >= 'a' && c <= 'z');
    }
    
    public static String method11087(String string, char c,
				     String string_39_) {
	int i = string.length();
	int i_40_ = string_39_.length();
	int i_41_ = i;
	int i_42_ = i_40_ - 1;
	if (i_42_ != 0) {
	    int i_43_ = 0;
	    for (;;) {
		i_43_ = string.indexOf(c, i_43_);
		if (i_43_ < 0)
		    break;
		i_43_++;
		i_41_ += i_42_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_41_);
	int i_44_ = 0;
	for (;;) {
	    int i_45_ = string.indexOf(c, i_44_);
	    if (i_45_ < 0)
		break;
	    stringbuilder.append(string.substring(i_44_, i_45_));
	    stringbuilder.append(string_39_);
	    i_44_ = 1 + i_45_;
	}
	stringbuilder.append(string.substring(i_44_));
	return stringbuilder.toString();
    }
    
    public static String[] method11088(String string, char c) {
	int i = Class275.method5101(string, c, 168912168);
	String[] strings = new String[i + 1];
	int i_46_ = 0;
	int i_47_ = 0;
	for (int i_48_ = 0; i_48_ < i; i_48_++) {
	    int i_49_;
	    for (i_49_ = i_47_; string.charAt(i_49_) != c; i_49_++) {
		/* empty */
	    }
	    strings[i_46_++] = string.substring(i_47_, i_49_);
	    i_47_ = i_49_ + 1;
	}
	strings[i] = string.substring(i_47_);
	return strings;
    }
    
    public static boolean method11089(char c) {
	if (c >= ' ' && c <= '~')
	    return true;
	if (c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c == '\u20ac' || '\u0152' == c || c == '\u2014' || c == '\u0153'
	    || '\u0178' == c)
	    return true;
	return false;
    }
    
    public static boolean method11090(char c) {
	if (c >= ' ' && c <= '~')
	    return true;
	if (c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c == '\u20ac' || '\u0152' == c || c == '\u2014' || c == '\u0153'
	    || '\u0178' == c)
	    return true;
	return false;
    }
    
    static boolean method11091(Interface62 interface62,
			       Class40_Sub11 class40_sub11, int i, int i_50_,
			       byte i_51_) {
	if (interface62 == null)
	    return false;
	Class602 class602
	    = ((Class602)
	       class40_sub11.method76(interface62.method406((byte) 1),
				      -131703810));
	if (class602.aBool7936 && !client.aBool11230)
	    return false;
	int i_52_ = 1813512349 * class602.anInt7918;
	if (null != class602.anIntArray7923) {
	    for (int i_53_ = 0; i_53_ < class602.anIntArray7923.length;
		 i_53_++) {
		if (-1 != class602.anIntArray7923[i_53_]) {
		    Class602 class602_54_
			= ((Class602)
			   class40_sub11.method76((class602.anIntArray7923
						   [i_53_]),
						  990730097));
		    if (1813512349 * class602_54_.anInt7918 >= 0)
			i_52_ = class602_54_.anInt7918 * 1813512349;
		}
	    }
	}
	if (i_52_ >= 0) {
	    Class98.anIntArray1191[Class98.anInt1195 * 1748507383]
		= class602.anInt7894 * 1156889815;
	    Class98.anIntArray1194[Class98.anInt1195 * 1748507383] = i;
	    Class98.anIntArray1197[Class98.anInt1195 * 1748507383] = i_50_;
	    Class98.anInt1195 += -88553785;
	    return true;
	}
	return false;
    }
    
    static final void method11092(Class683 class683, int i) {
	if (!Class453_Sub3.aClass309_Sub1_10316.method5484(-2099916453)
		 .method5357(-2005524149))
	    throw new RuntimeException();
	Class704_Sub2 class704_sub2
	    = ((Class704_Sub2)
	       Class453_Sub3.aClass309_Sub1_10316.method5482(705923098));
	class704_sub2.method17378(Class549.aClass430_7288, -1, 0.0F,
				  -840615722);
	client.aBool11364 = true;
    }
    
    static final void method11093(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2634 * 1248120695;
    }
}
