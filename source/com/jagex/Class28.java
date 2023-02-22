/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class28 implements Interface30
{
    public static Class702 aClass702_283;
    static int anInt284;
    public static int anInt285;
    
    Class28() {
	/* empty */
    }
    
    public Interface31 method170(Class307 class307, int i, int i_0_) {
	if (Class307.aClass307_3416 == class307)
	    return client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i];
	if (Class307.aClass307_3415 == class307) {
	    Class525_Sub19 class525_sub19
		= (Class525_Sub19) client.aClass10_11121.method684((long) i);
	    if (null != class525_sub19)
		return (Interface31) class525_sub19.anObject10571;
	}
	return null;
    }
    
    public Interface31 method169(Class307 class307, int i) {
	if (Class307.aClass307_3416 == class307)
	    return client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i];
	if (Class307.aClass307_3415 == class307) {
	    Class525_Sub19 class525_sub19
		= (Class525_Sub19) client.aClass10_11121.method684((long) i);
	    if (null != class525_sub19)
		return (Interface31) class525_sub19.anObject10571;
	}
	return null;
    }
    
    public static void method906(short[] is, int i) {
	for (int i_1_ = 0; i_1_ < is.length; i_1_++)
	    is[i_1_] = (short) 1024;
    }
    
    static final void method907(Class683 class683, boolean bool,
				boolean bool_2_, int i) {
	int i_3_ = class683.anIntArray8647[1931825055 * class683.anInt8663];
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (i_4_ < 0 || i_4_ >= class683.anIntArray8639[i_3_])
	    throw new RuntimeException();
	if (!bool)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class683.anIntArrayArray8641[i_3_][i_4_];
	else if (bool_2_) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class683.anIntArrayArray8641[i_3_][i_4_];
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= i_4_;
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= i_4_;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class683.anIntArrayArray8641[i_3_][i_4_];
	}
    }
    
    public static byte method908(char c, int i) {
	byte i_5_;
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    i_5_ = (byte) c;
	else if (c == '\u20ac')
	    i_5_ = (byte) -128;
	else if ('\u201a' == c)
	    i_5_ = (byte) -126;
	else if ('\u0192' == c)
	    i_5_ = (byte) -125;
	else if ('\u201e' == c)
	    i_5_ = (byte) -124;
	else if (c == '\u2026')
	    i_5_ = (byte) -123;
	else if (c == '\u2020')
	    i_5_ = (byte) -122;
	else if ('\u2021' == c)
	    i_5_ = (byte) -121;
	else if (c == '\u02c6')
	    i_5_ = (byte) -120;
	else if (c == '\u2030')
	    i_5_ = (byte) -119;
	else if ('\u0160' == c)
	    i_5_ = (byte) -118;
	else if ('\u2039' == c)
	    i_5_ = (byte) -117;
	else if ('\u0152' == c)
	    i_5_ = (byte) -116;
	else if ('\u017d' == c)
	    i_5_ = (byte) -114;
	else if ('\u2018' == c)
	    i_5_ = (byte) -111;
	else if (c == '\u2019')
	    i_5_ = (byte) -110;
	else if (c == '\u201c')
	    i_5_ = (byte) -109;
	else if ('\u201d' == c)
	    i_5_ = (byte) -108;
	else if ('\u2022' == c)
	    i_5_ = (byte) -107;
	else if (c == '\u2013')
	    i_5_ = (byte) -106;
	else if (c == '\u2014')
	    i_5_ = (byte) -105;
	else if (c == '\u02dc')
	    i_5_ = (byte) -104;
	else if ('\u2122' == c)
	    i_5_ = (byte) -103;
	else if (c == '\u0161')
	    i_5_ = (byte) -102;
	else if ('\u203a' == c)
	    i_5_ = (byte) -101;
	else if (c == '\u0153')
	    i_5_ = (byte) -100;
	else if (c == '\u017e')
	    i_5_ = (byte) -98;
	else if ('\u0178' == c)
	    i_5_ = (byte) -97;
	else
	    i_5_ = (byte) 63;
	return i_5_;
    }
    
    public static Class690[] method909(int i) {
	return (new Class690[]
		{ Class690.aClass690_8737, Class690.aClass690_8741,
		  Class690.aClass690_8740, Class690.aClass690_8742,
		  Class690.aClass690_8739 });
    }
    
    public static final void method910(int i) {
	String string = (Class441.aString4863 != null ? Class441.aString4863
			 : Class453_Sub4.method15959(-1527038723));
	NPCDefinitions.method5393(string, false, client.aBool11241, -1355450929);
    }
    
    static void method911(int i) {
	Class525_Sub16_Sub10.aClass10_11795.method688((short) 1128);
	Class525_Sub16_Sub10.aClass697_11804.method14199(1820658129);
	Class525_Sub16_Sub10.aClass697_11819.method14199(866854248);
    }
    
    public static void method912(long[] ls, int[] is, byte i) {
	Class643.method10596(ls, is, 0, ls.length - 1, (byte) 6);
    }
}
