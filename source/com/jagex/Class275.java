/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class275 implements Interface76
{
    int anInt2862;
    public static Class275 aClass275_2863;
    public static Class275 aClass275_2864 = new Class275(0, 0);
    static Class275 aClass275_2865;
    public int anInt2866;
    public static int anInt2867;
    
    public int method57() {
	return anInt2862 * 35404221;
    }
    
    public int method80() {
	return anInt2862 * 35404221;
    }
    
    static {
	aClass275_2863 = new Class275(2, 1);
	aClass275_2865 = new Class275(1, 2);
    }
    
    static Class275[] method5093() {
	return (new Class275[]
		{ aClass275_2864, aClass275_2865, aClass275_2863 });
    }
    
    public int method75() {
	return anInt2862 * 35404221;
    }
    
    static Class275[] method5094() {
	return (new Class275[]
		{ aClass275_2864, aClass275_2865, aClass275_2863 });
    }
    
    static Class275[] method5095() {
	return (new Class275[]
		{ aClass275_2864, aClass275_2865, aClass275_2863 });
    }
    
    static Class275[] method5096() {
	return (new Class275[]
		{ aClass275_2864, aClass275_2865, aClass275_2863 });
    }
    
    Class275(int i, int i_0_) {
	anInt2866 = -134219653 * i;
	anInt2862 = i_0_ * -729691755;
    }
    
    static final void method5097(Class683 class683, short i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class279.method5154(class259, class245, class683, (byte) 124);
    }
    
    static final void method5098(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class503.method8308(class259, class245, class683, -851013830);
    }
    
    static final void method5099(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_2_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_3_ = client.aClass486ArrayArray11128[i_2_][i_1_]
		       .method7845(-684733318);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_3_ == 2 ? 1 : 0;
    }
    
    static final void method5100(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class70.anInt767 * 1236737615;
    }
    
    static int method5101(CharSequence charsequence, char c, int i) {
	int i_4_ = 0;
	int i_5_ = charsequence.length();
	for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
	    if (charsequence.charAt(i_6_) == c)
		i_4_++;
	}
	return i_4_;
    }
    
    public static int method5102(CharSequence charsequence, int i) {
	return Class198.method3765(charsequence, 10, true, 58770396);
    }
    
    static final void method5103(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static void method5104(byte i) {
	if (null == Class96.aFrame1186) {
	    int i_7_ = client.anInt5572 * 288760183;
	    int i_8_ = client.anInt5573 * -1061711907;
	    int i_9_ = (-349587129 * OutputStream_Sub1.anInt11049
			- Class434.anInt4827 * -1445589163 - i_7_);
	    int i_10_ = (1666450389 * Class696_Sub9.anInt10903
			 - -1883654023 * Class696_Sub47.anInt11032 - i_8_);
	    if (i_7_ > 0 || i_9_ > 0 || i_8_ > 0 || i_10_ > 0) {
		try {
		    Container container = Class203.method3854(1955349051);
		    int i_11_ = 0;
		    int i_12_ = 0;
		    if (Class198_Sub7.aFrame9932 == container) {
			Insets insets = Class198_Sub7.aFrame9932.getInsets();
			i_11_ = insets.left;
			i_12_ = insets.top;
		    }
		    Graphics graphics = container.getGraphics();
		    graphics.setColor(Color.black);
		    if (i_7_ > 0)
			graphics.fillRect(i_11_, i_12_, i_7_,
					  (Class696_Sub9.anInt10903
					   * 1666450389));
		    if (i_8_ > 0)
			graphics.fillRect(i_11_, i_12_,
					  (-349587129
					   * OutputStream_Sub1.anInt11049),
					  i_8_);
		    if (i_9_ > 0)
			graphics.fillRect((i_11_
					   + (-349587129
					      * OutputStream_Sub1.anInt11049)
					   - i_9_),
					  i_12_, i_9_,
					  (Class696_Sub9.anInt10903
					   * 1666450389));
		    if (i_10_ > 0)
			graphics.fillRect(i_11_,
					  i_12_ + (Class696_Sub9.anInt10903
						   * 1666450389) - i_10_,
					  (OutputStream_Sub1.anInt11049
					   * -349587129),
					  i_10_);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
    }
    
    public static int method5105(CharSequence charsequence,
				 CharSequence charsequence_13_,
				 Class666 class666, byte i) {
	int i_14_ = charsequence.length();
	int i_15_ = charsequence_13_.length();
	int i_16_ = 0;
	int i_17_ = 0;
	char c = '\0';
	char c_18_ = '\0';
	while (i_16_ - c < i_14_ || i_17_ - c_18_ < i_15_) {
	    if (i_16_ - c >= i_14_)
		return -1;
	    if (i_17_ - c_18_ >= i_15_)
		return 1;
	    char c_19_;
	    if (0 != c) {
		c_19_ = c;
		boolean bool = false;
	    } else
		c_19_ = charsequence.charAt(i_16_++);
	    char c_20_;
	    if (0 != c_18_) {
		c_20_ = c_18_;
		boolean bool = false;
	    } else
		c_20_ = charsequence_13_.charAt(i_17_++);
	    c = Class645.method10686(c_19_, -2100186814);
	    c_18_ = Class645.method10686(c_20_, -1967467022);
	    c_19_ = Class575.method9551(c_19_, class666, (byte) -17);
	    c_20_ = Class575.method9551(c_20_, class666, (byte) -19);
	    if (c_20_ != c_19_ && (Character.toUpperCase(c_19_)
				   != Character.toUpperCase(c_20_))) {
		c_19_ = Character.toLowerCase(c_19_);
		c_20_ = Character.toLowerCase(c_20_);
		if (c_20_ != c_19_)
		    return (Class568.method9491(c_19_, class666, -1513575678)
			    - Class568.method9491(c_20_, class666, 241785004));
	    }
	}
	int i_21_ = Math.min(i_14_, i_15_);
	for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
	    if (class666 == Class666.aClass666_8561) {
		i_16_ = i_14_ - 1 - i_22_;
		i_17_ = i_15_ - 1 - i_22_;
	    } else
		i_16_ = i_17_ = i_22_;
	    char c_23_ = charsequence.charAt(i_16_);
	    char c_24_ = charsequence_13_.charAt(i_17_);
	    if (c_24_ != c_23_ && (Character.toUpperCase(c_23_)
				   != Character.toUpperCase(c_24_))) {
		c_23_ = Character.toLowerCase(c_23_);
		c_24_ = Character.toLowerCase(c_24_);
		if (c_23_ != c_24_)
		    return (Class568.method9491(c_23_, class666, -1313070554)
			    - Class568.method9491(c_24_, class666,
						  -1739145364));
	    }
	}
	int i_25_ = i_14_ - i_15_;
	if (i_25_ != 0)
	    return i_25_;
	for (int i_26_ = 0; i_26_ < i_21_; i_26_++) {
	    char c_27_ = charsequence.charAt(i_26_);
	    char c_28_ = charsequence_13_.charAt(i_26_);
	    if (c_28_ != c_27_)
		return (Class568.method9491(c_27_, class666, -1017198168)
			- Class568.method9491(c_28_, class666, -749780913));
	}
	return 0;
    }
    
    static void method5106(int i, int i_29_, int i_30_, int i_31_,
			   byte i_32_) {
	float f = ((float) Class556_Sub1.anInt7521
		   / (float) Class556_Sub1.anInt7502);
	int i_33_ = i_30_;
	int i_34_ = i_31_;
	if (f < 1.0F)
	    i_34_ = (int) ((float) i_30_ * f);
	else
	    i_33_ = (int) ((float) i_31_ / f);
	i -= (i_30_ - i_33_) / 2;
	i_29_ -= (i_31_ - i_34_) / 2;
	Class144_Sub1.anInt9141
	    = Class556_Sub1.anInt7502 * i / i_33_ * -1716705553;
	Class696_Sub13.anInt10912
	    = (Class556_Sub1.anInt7521
	       - Class556_Sub1.anInt7521 * i_29_ / i_34_) * -2002372447;
	Class556_Sub1.anInt10626 = -106402817;
	Class556_Sub1.anInt10627 = 107721765;
	Class58.method1221(317140686);
    }
    
    public static void method5107(int i) {
	Class556_Sub1.aHashMap10646.clear();
	Class556_Sub1.aHashMap10641.clear();
    }
    
    static void method5108(Class182 class182, int i) {
	if (Class116.method2057(1286884250) && Class318.method5673(1982769144))
	    Class631.method10318(0, 0, Class434.anInt4827 * -1445589163, 350,
				 2134250321);
	class182.method3184(0, 0, -1445589163 * Class434.anInt4827, 350);
	class182.method3151(0, 0, -1445589163 * Class434.anInt4827, 350,
			    Class116.anInt1417 * 2052312063 << 24 | 0x332277,
			    1);
	int i_35_ = 350 / (-1255111749 * Class226.anInt2342);
	if (-592886281 * Class116.anInt1412 > 0) {
	    int i_36_ = 346 - Class226.anInt2342 * -1255111749 - 4;
	    int i_37_ = (i_36_ * i_35_
			 / (i_35_ + -592886281 * Class116.anInt1412 - 1));
	    int i_38_ = 4;
	    if (-592886281 * Class116.anInt1412 > 1)
		i_38_ += ((i_36_ - i_37_)
			  * (-592886281 * Class116.anInt1412 - 1
			     - Class116.anInt1413 * 545098001)
			  / (Class116.anInt1412 * -592886281 - 1));
	    class182.method3151(Class434.anInt4827 * -1445589163 - 16, i_38_,
				12, i_37_,
				(2052312063 * Class116.anInt1417 << 24
				 | 0x332277),
				2);
	    for (int i_39_ = 545098001 * Class116.anInt1413;
		 (i_39_ < 545098001 * Class116.anInt1413 + i_35_
		  && i_39_ < Class116.anInt1412 * -592886281);
		 i_39_++) {
		String[] strings
		    = Class481.method7829(Class116.aStringArray1411[i_39_],
					  '\010', 813150023);
		int i_40_ = ((Class434.anInt4827 * -1445589163 - 8 - 16)
			     / strings.length);
		for (int i_41_ = 0; i_41_ < strings.length; i_41_++) {
		    int i_42_ = i_40_ * i_41_ + 8;
		    class182.method3184(i_42_, 0, i_42_ + i_40_ - 8, 350);
		    Class29.aClass175_293.method2851
			(Class196.method3737(strings[i_41_], -1027244863),
			 i_42_,
			 (350 - Class116.anInt1416 * 599755085 - 2
			  - Class500.aClass7_5560.anInt51 * 1921008003
			  - (-1255111749 * Class226.anInt2342
			     * (i_39_ - Class116.anInt1413 * 545098001))),
			 -1, -16777216, -1462875762);
		}
	    }
	}
	Class222.aClass175_2338.method2852("886 1",
					   (Class434.anInt4827 * -1445589163
					    - 25),
					   330, -1, -16777216, 1944559939);
	class182.method3184(0, 0, Class434.anInt4827 * -1445589163, 350);
	class182.method3192(0, 350 - Class116.anInt1416 * 599755085,
			    -1445589163 * Class434.anInt4827, -1, 470444501);
	Class29.aClass175_294.method2851
	    (new StringBuilder().append("--> ").append
		 (Class196.method3737(Class116.aString1414, -1248985250))
		 .toString(),
	     10, 350 - 1921008003 * Class525_Sub24.aClass7_10595.anInt51 - 1,
	     -1, -16777216, -858542594);
	if (Class280.aBool3001) {
	    int i_43_ = -1;
	    if (client.anInt11083 % 30 > 15)
		i_43_ = 16777215;
	    class182.method3193
		((10
		  + (Class525_Sub24.aClass7_10595.method561
		     (new StringBuilder().append("--> ").append
			  (Class196.method3737
			       (Class116.aString1414, -1945572495)
			       .substring(0, -675240623 * Class116.anInt1420))
			  .toString(),
		      1512446619))),
		 350 - Class525_Sub24.aClass7_10595.anInt51 * 1921008003 - 11,
		 12, i_43_, -1389929378);
	}
	class182.method3480();
	Class303.method5411((byte) 59);
    }
}
