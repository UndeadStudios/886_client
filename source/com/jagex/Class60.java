/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public class Class60
{
    public static int anInt639;
    static Class479 aClass479_640 = new Class479(16, Class452.aClass452_4935);
    static int anInt641;
    public static int[] anIntArray642;
    public static int[] anIntArray643;
    static final int anInt644 = 12;
    
    public static void method1228(int i, int i_0_) {
	if (i != anInt639 * -262886165) {
	    anIntArray642 = new int[i];
	    for (int i_1_ = 0; i_1_ < i; i_1_++)
		anIntArray642[i_1_] = (i_1_ << 12) / i;
	    anInt639 = i * -722822205;
	}
	if (i_0_ != anInt641 * 2116333837) {
	    if (anInt639 * -262886165 != i_0_) {
		anIntArray643 = new int[i_0_];
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
		    anIntArray643[i_2_] = (i_2_ << 12) / i_0_;
	    } else
		anIntArray643 = anIntArray642;
	    anInt641 = i_0_ * -1830255163;
	}
    }
    
    public static void method1229(int i, int i_3_, int i_4_) {
	if (i != anInt639 * -262886165) {
	    anIntArray642 = new int[i];
	    for (int i_5_ = 0; i_5_ < i; i_5_++)
		anIntArray642[i_5_] = (i_5_ << 12) / i;
	    anInt639 = i * -722822205;
	}
	if (i_3_ != anInt641 * 2116333837) {
	    if (anInt639 * -262886165 != i_3_) {
		anIntArray643 = new int[i_3_];
		for (int i_6_ = 0; i_6_ < i_3_; i_6_++)
		    anIntArray643[i_6_] = (i_6_ << 12) / i_3_;
	    } else
		anIntArray643 = anIntArray642;
	    anInt641 = i_3_ * -1830255163;
	}
    }
    
    public static byte[] method1230(int i, int i_7_) {
	byte[] is = ((byte[])
		     aClass479_640.method7802(Integer.valueOf(i), -717055414));
	if (null == is) {
	    is = new byte[512];
	    Random random = new Random((long) i);
	    for (int i_8_ = 0; i_8_ < 255; i_8_++)
		is[i_8_] = (byte) i_8_;
	    for (int i_9_ = 0; i_9_ < 255; i_9_++) {
		int i_10_ = 255 - i_9_;
		int i_11_ = Class2.method526(random, i_10_, -1188727601);
		byte i_12_ = is[i_11_];
		is[i_11_] = is[i_10_];
		is[i_10_] = is[511 - i_9_] = i_12_;
	    }
	    aClass479_640.method7796(Integer.valueOf(i), is, -1183603449);
	}
	return is;
    }
    
    static void method1231(Class525_Sub16_Sub4 class525_sub16_sub4, int i,
			   Class683 class683, int i_13_) {
	class683.anInt8662 = 0;
	class683.anInt8644 = 0;
	class683.anInt8663 = 1827402657;
	class683.aClass525_Sub16_Sub4_8664 = class525_sub16_sub4;
	class683.aClass517Array8656
	    = class683.aClass525_Sub16_Sub4_8664.aClass517Array11746;
	class683.anIntArray8647
	    = class683.aClass525_Sub16_Sub4_8664.anIntArray11749;
	Class517 class517 = null;
	class683.anInt8650 = 0;
	class683.aMap8657.clear();
	class683.aMap8657.put(Class453.aClass453_4939,
			      Class532.aClass111_7170.aClass614_1374);
	class683.aMap8657.put(Class453.aClass453_4940,
			      Class309.aClass144_Sub1_3465);
	class683.aMap8657.put(Class453.aClass453_4944,
			      Class212.aClass144_2271);
	if (null != class683.aClass353_8652)
	    class683.aMap8657.put(Class453.aClass453_4945,
				  Class587.method9692(class683.aClass353_8652,
						      -1301235093));
	if (class683.aClass656_Sub1_Sub3_Sub1_8654
	    instanceof Class656_Sub1_Sub3_Sub1_Sub2)
	    class683.aMap8657.put(Class453.aClass453_4943,
				  (class683.aClass656_Sub1_Sub3_Sub1_8654
				   .anInterface17_12030));
	if (class683.aClass656_Sub1_Sub3_Sub1_8654
	    instanceof Class656_Sub1_Sub3_Sub1_Sub1)
	    class683.aMap8643.put(Class453.aClass453_4939,
				  (class683.aClass656_Sub1_Sub3_Sub1_8654
				   .anInterface17_12030));
	if (null != Class182_Sub2.aClass228_9503)
	    class683.aMap8657.put(Class453.aClass453_4947,
				  Class182_Sub2.aClass228_9503
				      .method4347(908093913));
	try {
	    try {
		Class686.anInt8695 = 0;
		for (;;) {
		    Class686.anInt8695 += -1795474615;
		    if (Class686.anInt8695 * 1403168505 > i)
			throw new RuntimeException("");
		    class517
			= (class683.aClass517Array8656
			   [(class683.anInt8663 += -1827402657) * 1931825055]);
		    if (Class686.aBool8698
			&& (Class686.aString8700 == null
			    || ((class683.aClass525_Sub16_Sub4_8664
				 .aString11755) != null
				&& class683.aClass525_Sub16_Sub4_8664
				       .aString11755
				       .indexOf(Class686.aString8700) != -1)))
			System.out.println(new StringBuilder().append
					       (class683
						.aClass525_Sub16_Sub4_8664
						.aString11755)
					       .append
					       (": ").append
					       (class517).toString());
		    if ((class683.anIntArray8647
			 [class683.anInt8663 * 1931825055])
			== 1)
			class683.aBool8665 = true;
		    else
			class683.aBool8665 = false;
		    if (class517 == Class517.aClass517_6060
			&& 0 == class683.anInt8650 * -965162233) {
			Class525_Sub34.method16571(-1257535980);
			break;
		    }
		    Class198_Sub19_Sub2.method18210(class517, class683,
						    (byte) 15);
		}
	    } catch (Exception exception) {
		Class696_Sub41.method17343(class683, class517, exception, "S",
					   -604924030);
		Class525_Sub34.method16571(-1198565891);
	    }
	} catch (Exception object) {
	    Class525_Sub34.method16571(1911416);
	    throw object;
	}
    }
    
    Class60() throws Throwable {
	throw new Error();
    }
    
    public static void method1232(int i, int i_14_) {
	if (i != anInt639 * -262886165) {
	    anIntArray642 = new int[i];
	    for (int i_15_ = 0; i_15_ < i; i_15_++)
		anIntArray642[i_15_] = (i_15_ << 12) / i;
	    anInt639 = i * -722822205;
	}
	if (i_14_ != anInt641 * 2116333837) {
	    if (anInt639 * -262886165 != i_14_) {
		anIntArray643 = new int[i_14_];
		for (int i_16_ = 0; i_16_ < i_14_; i_16_++)
		    anIntArray643[i_16_] = (i_16_ << 12) / i_14_;
	    } else
		anIntArray643 = anIntArray642;
	    anInt641 = i_14_ * -1830255163;
	}
    }
    
    static void method1233(Class683 class683, int i) {
	Class269 class269
	    = ((Class269)
	       Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						     [((class683.anInt8662
							-= 1552651121)
						       * 501271953)]),
						    1389302642));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (class269.anIntArray2828 == null ? 0
	       : class269.anIntArray2828.length);
    }
    
    static Class693[] method1234(int i) {
	return (new Class693[]
		{ Class693.aClass693_8750, Class693.aClass693_8752,
		  Class693.aClass693_8751, Class693.aClass693_8749,
		  Class693.aClass693_8753 });
    }
}
