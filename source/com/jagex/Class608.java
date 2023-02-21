/* Class608 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class608 implements Interface76
{
    public static Class608 aClass608_7976;
    static Class608 aClass608_7977;
    public static Class608 aClass608_7978;
    public static Class608 aClass608_7979;
    public static Class608 aClass608_7980;
    public static Class608 aClass608_7981 = new Class608(0, 0);
    public static Class608 aClass608_7982;
    public static Class608 aClass608_7983;
    public static Class608 aClass608_7984;
    public static Class608 aClass608_7985;
    static Class608 aClass608_7986;
    public static Class608 aClass608_7987;
    public static Class608 aClass608_7988 = new Class608(1, 0);
    static Class608 aClass608_7989;
    static Class608 aClass608_7990;
    static Class608 aClass608_7991;
    static Class608 aClass608_7992;
    static Class608 aClass608_7993;
    static Class608 aClass608_7994;
    public int anInt7995;
    public static Class608 aClass608_7996;
    public static Class608 aClass608_7997;
    public static Class608 aClass608_7998;
    static Class608 aClass608_7999;
    public int anInt8000;
    
    public int method75() {
	return -1214990409 * anInt7995;
    }
    
    static {
	aClass608_7978 = new Class608(2, 0);
	aClass608_7979 = new Class608(3, 0);
	aClass608_7980 = new Class608(9, 2);
	aClass608_7976 = new Class608(4, 1);
	aClass608_7982 = new Class608(5, 1);
	aClass608_7983 = new Class608(6, 1);
	aClass608_7984 = new Class608(7, 1);
	aClass608_7985 = new Class608(8, 1);
	aClass608_7986 = new Class608(12, 2);
	aClass608_7987 = new Class608(13, 2);
	aClass608_7990 = new Class608(14, 2);
	aClass608_7989 = new Class608(15, 2);
	aClass608_7991 = new Class608(16, 2);
	aClass608_7999 = new Class608(17, 2);
	aClass608_7992 = new Class608(18, 2);
	aClass608_7993 = new Class608(19, 2);
	aClass608_7994 = new Class608(20, 2);
	aClass608_7977 = new Class608(21, 2);
	aClass608_7996 = new Class608(10, 2);
	aClass608_7997 = new Class608(11, 2);
	aClass608_7998 = new Class608(22, 3);
    }
    
    Class608(int i, int i_0_) {
	anInt7995 = -1987783161 * i;
	anInt8000 = 309197755 * i_0_;
    }
    
    public int method80() {
	return -1214990409 * anInt7995;
    }
    
    public int method57() {
	return -1214990409 * anInt7995;
    }
    
    public static Class608[] method10001() {
	return new Class608[] { aClass608_7979, aClass608_7985, aClass608_7999,
				aClass608_7986, aClass608_7994, aClass608_7988,
				aClass608_7990, aClass608_7989, aClass608_7983,
				aClass608_7982, aClass608_7993, aClass608_7978,
				aClass608_7981, aClass608_7992, aClass608_7996,
				aClass608_7998, aClass608_7991, aClass608_7977,
				aClass608_7980, aClass608_7984, aClass608_7987,
				aClass608_7997, aClass608_7976 };
    }
    
    public static Class608[] method10002() {
	return new Class608[] { aClass608_7979, aClass608_7985, aClass608_7999,
				aClass608_7986, aClass608_7994, aClass608_7988,
				aClass608_7990, aClass608_7989, aClass608_7983,
				aClass608_7982, aClass608_7993, aClass608_7978,
				aClass608_7981, aClass608_7992, aClass608_7996,
				aClass608_7998, aClass608_7991, aClass608_7977,
				aClass608_7980, aClass608_7984, aClass608_7987,
				aClass608_7997, aClass608_7976 };
    }
    
    static boolean method10003(int i) {
	return (i >= aClass608_7976.anInt7995 * -1214990409
		&& i <= -1214990409 * aClass608_7985.anInt7995);
    }
    
    static long method10004(CharSequence charsequence, byte i) {
	long l = 0L;
	int i_1_ = charsequence.length();
	for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_2_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) ('\001' + c - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) (c + '\001' - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) ('\033' + c - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    public static int method10005(int i, byte i_3_) {
	i = (i & 0x55555555) + (i >>> 1 & 0x55555555);
	i = (i >>> 2 & 0x33333333) + (i & 0x33333333);
	i = (i >>> 4) + i & 0xf0f0f0f;
	i += i >>> 8;
	i += i >>> 16;
	return i & 0xff;
    }
    
    static final void method10006(Class683 class683, byte i) {
	if (Class453_Sub3.aClass309_Sub1_10316.method5484(-2100518035)
	    != Class298.aClass298_3275)
	    throw new RuntimeException();
	((Class704_Sub5)
	 Class453_Sub3.aClass309_Sub1_10316.method5482(70863964))
	    .method17477
	    ((class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]),
	     -353756392);
    }
}
