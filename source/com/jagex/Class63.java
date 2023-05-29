/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class63
{
    static int anInt692;
    
    static int method1382(JS5 class458, Class663 class663) {
	if (null != class458) {
	    if (class663.method10957(-2104248984) > 1) {
		int i = class458.method7505(465636960) - 1;
		return (i * class663.method10957(703939570)
			+ class458.getFileCountForArchive(i, 2068009005));
	    }
	    return class458.getFileCountForArchive(-1918643565 * class663.anInt8553,
				       2130613124);
	}
	return 0;
    }
    
    static int method1383(JS5 class458, Class663 class663) {
	if (null != class458) {
	    if (class663.method10957(1143004831) > 1) {
		int i = class458.method7505(1305236856) - 1;
		return (i * class663.method10957(639762319)
			+ class458.getFileCountForArchive(i, 2079628703));
	    }
	    return class458.getFileCountForArchive(-1918643565 * class663.anInt8553,
				       2087842654);
	}
	return 0;
    }
    
    static int method1384(JS5 class458, Class663 class663) {
	if (null != class458) {
	    if (class663.method10957(-809018039) > 1) {
		int i = class458.method7505(-95266468) - 1;
		return (i * class663.method10957(833918030)
			+ class458.getFileCountForArchive(i, 2134687848));
	    }
	    return class458.getFileCountForArchive(-1918643565 * class663.anInt8553,
				       2057577641);
	}
	return 0;
    }
    
    Class63() throws Throwable {
	throw new Error();
    }
    
    static int method1385(JS5 class458, Class663 class663) {
	if (null != class458) {
	    if (class663.method10957(-1810994330) > 1) {
		int i = class458.method7505(2084746731) - 1;
		return (i * class663.method10957(-1069250608)
			+ class458.getFileCountForArchive(i, 2065337127));
	    }
	    return class458.getFileCountForArchive(-1918643565 * class663.anInt8553,
				       2075955546);
	}
	return 0;
    }
    
    static int method1386(JS5 class458, Class663 class663) {
	if (null != class458) {
	    if (class663.method10957(-659778106) > 1) {
		int i = class458.method7505(-73680873) - 1;
		return (i * class663.method10957(-1642086529)
			+ class458.getFileCountForArchive(i, 2063128596));
	    }
	    return class458.getFileCountForArchive(-1918643565 * class663.anInt8553,
				       2051243285);
	}
	return 0;
    }
    
    static byte[] method1387(JS5 class458, Class663 class663, int i) {
	if (class663.method10957(370951604) > 1)
	    return class458.getFile(class663.method10963(i, 60504709),
				       class663.method10958(i, (byte) -63),
				       1295868781);
	return class458.getFile(class663.anInt8553 * -1918643565, i,
				   1924548024);
    }
    
    static byte[] method1388(JS5 class458, Class663 class663, int i) {
	if (class663.method10957(1787671526) > 1)
	    return class458.getFile(class663.method10963(i, -1089794366),
				       class663.method10958(i, (byte) 17),
				       1814808352);
	return class458.getFile(class663.anInt8553 * -1918643565, i,
				   963891005);
    }
    
    public static Class18[] method1389(byte i) {
	if (null == Class390_Sub2.aClass18Array10229) {
	    Class18[] class18s
		= Class389.method6467(Class202.aClass4_2222, 1569116001);
	    Class18[] class18s_0_ = new Class18[class18s.length];
	    int i_1_ = 0;
	    int i_2_ = Class198_Sub13.aClass525_Sub30_9973
			   .aClass696_Sub30_10696.method17247(-501463285);
	while_125_:
	    for (int i_3_ = 0; i_3_ < class18s.length; i_3_++) {
		Class18 class18 = class18s[i_3_];
		if ((1891227749 * class18.anInt202 <= 0
		     || 1891227749 * class18.anInt202 >= 24)
		    && class18.anInt200 * 1036776891 >= 800
		    && class18.anInt201 * -2072667521 >= 600
		    && (2 != i_2_
			|| (class18.anInt200 * 1036776891 <= 800
			    && class18.anInt201 * -2072667521 <= 600))
		    && (i_2_ != 1
			|| (1036776891 * class18.anInt200 <= 1024
			    && -2072667521 * class18.anInt201 <= 768))) {
		    for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
			Class18 class18_5_ = class18s_0_[i_4_];
			if ((1036776891 * class18.anInt200
			     == class18_5_.anInt200 * 1036776891)
			    && (class18.anInt201 * -2072667521
				== class18_5_.anInt201 * -2072667521)) {
			    if (class18.anInt202 * 1891227749
				> 1891227749 * class18_5_.anInt202)
				class18s_0_[i_4_] = class18;
			    continue while_125_;
			}
		    }
		    class18s_0_[i_1_] = class18;
		    i_1_++;
		}
	    }
	    Class390_Sub2.aClass18Array10229 = new Class18[i_1_];
	    System.arraycopy(class18s_0_, 0, Class390_Sub2.aClass18Array10229,
			     0, i_1_);
	    int[] is = new int[Class390_Sub2.aClass18Array10229.length];
	    for (int i_6_ = 0; i_6_ < Class390_Sub2.aClass18Array10229.length;
		 i_6_++) {
		Class18 class18 = Class390_Sub2.aClass18Array10229[i_6_];
		is[i_6_]
		    = 1036776891 * class18.anInt200 * (-2072667521
						       * class18.anInt201);
	    }
	    Class202.method3851(is, Class390_Sub2.aClass18Array10229,
				2143793755);
	}
	return Class390_Sub2.aClass18Array10229;
    }
}
