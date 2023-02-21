/* Class470 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class470
{
    static final int anInt5134 = 60000;
    String aString5135;
    int anInt5136;
    static final int anInt5137 = 10;
    volatile int anInt5138 = 0;
    ExecutorService anExecutorService5139 = Executors.newFixedThreadPool(2);
    static final int anInt5140 = 10000;
    long aLong5141;
    static final int anInt5142 = 10000;
    int anInt5143;
    static final int anInt5144 = 2;
    boolean aBool5145 = false;
    
    void method7715(boolean bool) {
	aBool5145 = bool;
    }
    
    boolean method7716(int i) {
	return anInt5138 * 206791171 >= 10;
    }
    
    Class525_Sub16_Sub12_Sub3 method7717(byte i) {
	return method7718(255, 255, (byte) 0, true, 0, 0, 207636959);
    }
    
    Class525_Sub16_Sub12_Sub3 method7718(int i, int i_0_, byte i_1_,
					 boolean bool, int i_2_, int i_3_,
					 int i_4_) {
	if (i < 0 || i_0_ < 0)
	    throw new RuntimeException(new StringBuilder().append(i).append
					   (",").append
					   (i_0_).toString());
	if (method7716(428174166))
	    return null;
	boolean bool_5_ = i == 255 && i_0_ == 255;
	if (!aBool5145 && !bool_5_)
	    return null;
	if (10000L + -5869678006625395481L * aLong5141
	    >= Class251.method4508((byte) 8))
	    return null;
	Object object = null;
	String string;
	if (bool_5_)
	    string = new StringBuilder().append("&cb=").append
			 (Class251.method4508((byte) 8)).toString();
	else
	    string = new StringBuilder().append("&c=").append(i_2_).append
			 ("&v=").append
			 (i_3_).toString();
	URL url;
	try {
	    url = new URL("http", aString5135, anInt5143 * -910751813,
			  new StringBuilder().append("/ms?m=").append
			      (-1844455413 * anInt5136).append
			      ("&a=").append
			      (i).append
			      ("&g=").append
			      (i_0_).append
			      (string).toString());
	} catch (MalformedURLException malformedurlexception) {
	    return null;
	}
	Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3
	    = new Class525_Sub16_Sub12_Sub3(i_1_);
	class525_sub16_sub12_sub3.aBool11834 = bool;
	anInt5138 += 1384765611;
	Future future
	    = anExecutorService5139
		  .submit(new Class460(this, url, class525_sub16_sub12_sub3));
	class525_sub16_sub12_sub3.method18894(future, (byte) 0);
	return class525_sub16_sub12_sub3;
    }
    
    void method7719(int i) {
	anInt5138 -= 1384765611;
    }
    
    public void method7720(byte i) {
	anExecutorService5139.shutdown();
    }
    
    void method7721(boolean bool, int i) {
	aBool5145 = bool;
    }
    
    public Class470(String string, int i, int i_6_) {
	aString5135 = string;
	anInt5143 = 1973724531 * i;
	anInt5136 = -1662651485 * i_6_;
    }
    
    Class525_Sub16_Sub12_Sub3 method7722(int i, int i_7_, byte i_8_,
					 boolean bool, int i_9_, int i_10_) {
	if (i < 0 || i_7_ < 0)
	    throw new RuntimeException(new StringBuilder().append(i).append
					   (",").append
					   (i_7_).toString());
	if (method7716(1262355531))
	    return null;
	boolean bool_11_ = i == 255 && i_7_ == 255;
	if (!aBool5145 && !bool_11_)
	    return null;
	if (10000L + -5869678006625395481L * aLong5141
	    >= Class251.method4508((byte) 8))
	    return null;
	Object object = null;
	String string;
	if (bool_11_)
	    string = new StringBuilder().append("&cb=").append
			 (Class251.method4508((byte) 8)).toString();
	else
	    string = new StringBuilder().append("&c=").append(i_9_).append
			 ("&v=").append
			 (i_10_).toString();
	URL url;
	try {
	    url = new URL("http", aString5135, anInt5143 * -910751813,
			  new StringBuilder().append("/ms?m=").append
			      (-1844455413 * anInt5136).append
			      ("&a=").append
			      (i).append
			      ("&g=").append
			      (i_7_).append
			      (string).toString());
	} catch (MalformedURLException malformedurlexception) {
	    return null;
	}
	Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3
	    = new Class525_Sub16_Sub12_Sub3(i_8_);
	class525_sub16_sub12_sub3.aBool11834 = bool;
	anInt5138 += 1384765611;
	Future future
	    = anExecutorService5139
		  .submit(new Class460(this, url, class525_sub16_sub12_sub3));
	class525_sub16_sub12_sub3.method18894(future, (byte) 0);
	return class525_sub16_sub12_sub3;
    }
    
    Class525_Sub16_Sub12_Sub3 method7723() {
	return method7718(255, 255, (byte) 0, true, 0, 0, 955052308);
    }
    
    public void method7724() {
	anExecutorService5139.shutdown();
    }
    
    Class525_Sub16_Sub12_Sub3 method7725(int i, int i_12_, byte i_13_,
					 boolean bool, int i_14_, int i_15_) {
	if (i < 0 || i_12_ < 0)
	    throw new RuntimeException(new StringBuilder().append(i).append
					   (",").append
					   (i_12_).toString());
	if (method7716(-1482771068))
	    return null;
	boolean bool_16_ = i == 255 && i_12_ == 255;
	if (!aBool5145 && !bool_16_)
	    return null;
	if (10000L + -5869678006625395481L * aLong5141
	    >= Class251.method4508((byte) 8))
	    return null;
	Object object = null;
	String string;
	if (bool_16_)
	    string = new StringBuilder().append("&cb=").append
			 (Class251.method4508((byte) 8)).toString();
	else
	    string = new StringBuilder().append("&c=").append(i_14_).append
			 ("&v=").append
			 (i_15_).toString();
	URL url;
	try {
	    url = new URL("http", aString5135, anInt5143 * -910751813,
			  new StringBuilder().append("/ms?m=").append
			      (-1844455413 * anInt5136).append
			      ("&a=").append
			      (i).append
			      ("&g=").append
			      (i_12_).append
			      (string).toString());
	} catch (MalformedURLException malformedurlexception) {
	    return null;
	}
	Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3
	    = new Class525_Sub16_Sub12_Sub3(i_13_);
	class525_sub16_sub12_sub3.aBool11834 = bool;
	anInt5138 += 1384765611;
	Future future
	    = anExecutorService5139
		  .submit(new Class460(this, url, class525_sub16_sub12_sub3));
	class525_sub16_sub12_sub3.method18894(future, (byte) 0);
	return class525_sub16_sub12_sub3;
    }
    
    public void method7726() {
	anExecutorService5139.shutdown();
    }
    
    void method7727(boolean bool) {
	aBool5145 = bool;
    }
    
    void method7728(boolean bool) {
	aBool5145 = bool;
    }
    
    public static Class307 method7729(int i, int i_17_) {
	if (i == 1876777343 * Class307.aClass307_3416.anInt3414)
	    return Class307.aClass307_3416;
	if (Class307.aClass307_3415.anInt3414 * 1876777343 == i)
	    return Class307.aClass307_3415;
	return null;
    }
    
    public static Class613[] method7730(int i) {
	return (new Class613[]
		{ Class613.aClass613_8029, Class613.aClass613_8027,
		  Class613.aClass613_8028 });
    }
    
    static final void method7731(Class683 class683, int i) {
	int i_18_ = Class268.method4958(-435230218);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (Class383.anInt4010
	       = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10708
		     .method17160(1271996577) * -1127979167) * -2023195487;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_18_;
	Class559.method9402(-152460819);
	client.aClass507_11137.method8375((byte) -9);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
    
    public static Class705 method7732(byte i) {
	if (Class251.aClass705_2452 == null)
	    return Class705.aClass705_8800;
	return Class251.aClass705_2452;
    }
    
    static final void method7733(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	class259.anInt2642
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -1211958109;
	Class649.method10708(class259, (byte) 0);
	if (1534974651 * class259.anInt2576 == -1 && !class245.aBool2428)
	    Class176.method2909(1984678839 * class259.anInt2588, -1347906748);
    }
    
    static final void method7734(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class396.method6537(class259, class245, class683, (short) 566);
    }
}
