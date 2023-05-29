/* Class620 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class620
{
    int[] anIntArray8085;
    static Class620 aClass620_8086 = new Class620();
    
    Class620(int[] is) {
	if (null == is)
	    throw new NullPointerException();
	anIntArray8085 = is;
	method10171(-1798832646);
    }
    
    final void method10171(int i) {
	for (int i_0_ = 1; i_0_ < anIntArray8085.length; i_0_++) {
	    if (anIntArray8085[i_0_ - 1] < 0)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("Negative XP at pos:")
						       .append
						       (i_0_ - 1).toString());
	    if (anIntArray8085[i_0_] < anIntArray8085[i_0_ - 1])
		throw new IllegalArgumentException
			  (new StringBuilder().append
			       ("XP goes backwards at pos:").append
			       (i_0_).toString());
	}
    }
    
    int method10172(int i, int i_1_) {
	int i_2_ = 0;
	for (int i_3_ = 0;
	     i_3_ < anIntArray8085.length && i >= anIntArray8085[i_3_]; i_3_++)
	    i_2_ = i_3_ + 1;
	return i_2_;
    }
    
    int method10173(int i, int i_4_) {
	if (i < 1)
	    return 0;
	if (i > anIntArray8085.length)
	    i = anIntArray8085.length;
	return anIntArray8085[i - 1];
    }
    
    final void method10174() {
	for (int i = 1; i < anIntArray8085.length; i++) {
	    if (anIntArray8085[i - 1] < 0)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("Negative XP at pos:")
						       .append
						       (i - 1).toString());
	    if (anIntArray8085[i] < anIntArray8085[i - 1])
		throw new IllegalArgumentException
			  (new StringBuilder().append
			       ("XP goes backwards at pos:").append
			       (i).toString());
	}
    }
    
    int method10175(int i) {
	int i_5_ = 0;
	for (int i_6_ = 0;
	     i_6_ < anIntArray8085.length && i >= anIntArray8085[i_6_]; i_6_++)
	    i_5_ = i_6_ + 1;
	return i_5_;
    }
    
    int method10176(int i) {
	int i_7_ = 0;
	for (int i_8_ = 0;
	     i_8_ < anIntArray8085.length && i >= anIntArray8085[i_8_]; i_8_++)
	    i_7_ = i_8_ + 1;
	return i_7_;
    }
    
    final void method10177() {
	for (int i = 1; i < anIntArray8085.length; i++) {
	    if (anIntArray8085[i - 1] < 0)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("Negative XP at pos:")
						       .append
						       (i - 1).toString());
	    if (anIntArray8085[i] < anIntArray8085[i - 1])
		throw new IllegalArgumentException
			  (new StringBuilder().append
			       ("XP goes backwards at pos:").append
			       (i).toString());
	}
    }
    
    Class620() {
	anIntArray8085 = new int[120];
	int i = 0;
	for (int i_9_ = 0; i_9_ < 120; i_9_++) {
	    int i_10_ = 1 + i_9_;
	    int i_11_ = (int) ((double) i_10_
			       + 300.0 * Math.pow(2.0, (double) i_10_ / 7.0));
	    i += i_11_;
	    anIntArray8085[i_9_] = i / 4;
	}
	method10171(-765945984);
    }
    
    int method10178(int i) {
	int i_12_ = 0;
	for (int i_13_ = 0;
	     i_13_ < anIntArray8085.length && i >= anIntArray8085[i_13_];
	     i_13_++)
	    i_12_ = i_13_ + 1;
	return i_12_;
    }
    
    final void method10179() {
	for (int i = 1; i < anIntArray8085.length; i++) {
	    if (anIntArray8085[i - 1] < 0)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("Negative XP at pos:")
						       .append
						       (i - 1).toString());
	    if (anIntArray8085[i] < anIntArray8085[i - 1])
		throw new IllegalArgumentException
			  (new StringBuilder().append
			       ("XP goes backwards at pos:").append
			       (i).toString());
	}
    }
    
    static final void method10180(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class601.method9901(class259, class245, class683,
			    ((class683.aClass525_Sub25_8653
			      == Class404.aClass525_Sub25_4148)
			     ? Class238.aClass238_2398
			     : Class238.aClass238_2395),
			    (byte) 9);
    }
    
    static final void method10181(Class683 class683, byte i) {
	int i_14_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = Class215.aClass58_2283.method1220(i_14_, 797864)
		  .method18424(1698399217);
    }
    
    static final void method10182(int i) {
	Class232.aClass40_Sub18_2368.method1020(5, (byte) 0);
	Class198_Sub17.aClass40_Sub14_9981.method1020(5, (byte) 0);
	Class38.aClass40_Sub9_328.method1020(5, (byte) 0);
	client.aClass507_11137.method8362((byte) -1).method1020(5, (byte) 0);
	Class168_Sub1.aClass40_Sub7_9112.method1020(5, (byte) 0);
	Class313_Sub2.aClass40_Sub22_10106.method1020(5, (byte) 0);
	Class685.aClass40_Sub8_8691.method1020(5, (byte) 0);
	Class574.aClass40_Sub20_7645.method1020(5, (byte) 0);
	Class575.aClass40_Sub10_7647.method1020(5, (byte) 0);
	Class109.aClass106_Sub1_Sub1_1323.method17969(5, -649621887);
	Class293.aClass106_Sub1_Sub2_3239.method17980(5, (short) -11031);
	Class711.aClass106_Sub1_Sub2_8869.method17980(5, (short) -23609);
	Class535.aClass106_Sub1_Sub2_7176.method17980(5, (short) -5989);
	Class198_Sub20.aClass106_Sub1_Sub2_9998.method17980(5, (short) 11795);
	Class234.aClass106_Sub1_Sub2_2373.method17980(5, (short) -17607);
	Class227.aClass40_Sub1_2345.method1020(5, (byte) 0);
	Class698.aClass40_Sub2_8770.method1020(5, (byte) 0);
	Class568.aClass40_Sub17_7627.method1020(5, (byte) 0);
	client.aClass40_Sub16_11201.method1020(5, (byte) 0);
	Class658.aClass40_Sub3_8457.method1020(5, (byte) 0);
	Class539.aClass40_Sub4_7181.method1020(5, (byte) 0);
	client.aClass40_Sub21_11118.method1020(5, (byte) 0);
	Class635.aClass40_Sub6_8274.method1020(5, (byte) 0);
	Class83.aClass40_Sub12_852.method1020(5, (byte) 0);
	Class566.aClass40_Sub5_7605.method1020(5, (byte) 0);
	Class322.method5729(5, 480844126);
	Class321.method5717(50, -1866030378);
	Class7.aClass404_53.method6583(50, (byte) 12);
	Class102.method1885(5, 1027621600);
	Class104.method1907(5, 1312186502);
	client.aClass200_11113.method3805(5, 2105502167);
	client.aClass200_11259.method3805(5, 2032615094);
	Class686.aClass200_8697.method3805(5, 2145181993);
	client.aClass200_11301.method3805(5, 2040154737);
	Class486.aClass40_5240.method1020(5, (byte) 0);
	Class685.aClass40_8690.method1020(5, (byte) 0);
	client.aClass200_11206.method3805(5, 1886922002);
    }
    
    static String method10183(String string, boolean bool, int i) {
	String string_15_ = bool ? "https://" : "http://";
	if (Class685.aClass685_8689 == Class176.aClass685_1884)
	    string = new StringBuilder().append(string).append("-wtrc")
			 .toString();
	else if (Class685.aClass685_8676 == Class176.aClass685_1884)
	    string = new StringBuilder().append(string).append("-wtqa")
			 .toString();
	else if (Class685.aClass685_8677 == Class176.aClass685_1884)
	    string = new StringBuilder().append(string).append("-wtwip")
			 .toString();
	else if (Class685.aClass685_8679 == Class176.aClass685_1884)
	    string
		= new StringBuilder().append(string).append("-wti").toString();
	else if (Class176.aClass685_1884 == Class685.aClass685_8683)
	    string = new StringBuilder().append(string).append("-demo")
			 .toString();
	else if (Class685.aClass685_8678 == Class176.aClass685_1884)
	    string = "local";
	String string_16_ = "";
	if (client.aString11055 != null)
	    string_16_ = new StringBuilder().append("/p=").append
			     (client.aString11055).toString();
	String string_17_ = new StringBuilder().append
				(client.gametype.aString8579).append
				(".com").toString();
	return new StringBuilder().append(string_15_).append(string).append
		   (".").append
		   (string_17_).append
		   ("/l=").append
		   (1553960475 * Class21.aClass666_213.anInt8569).append
		   ("/a=").append
		   (client.anInt11318 * 11804803).append
		   (string_16_).append
		   ("/").toString();
    }
    
    static final void method10184(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
}
