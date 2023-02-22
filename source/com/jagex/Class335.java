/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class335 implements Runnable
{
    Thread aThread3625;
    volatile boolean aBool3626;
    Class326[] aClass326Array3627;
    static Class157[] aClass157Array3628;
    
    boolean method5845(int i) {
	if (aBool3626)
	    return true;
	if (aThread3625 == null) {
	    aThread3625 = new Thread(this);
	    aThread3625.start();
	}
	return aBool3626;
    }
    
    Class335() {
	/* empty */
    }
    
    public void method5846() {
	try {
	    int i
		= Class112.method1999(Class176.aClass685_1884,
				      Class675.aClass675_8613,
				      Class15.aClass1_174.anInt11 * -559264181,
				      (byte) -80);
	    BufferedReader bufferedreader
		= new BufferedReader(new InputStreamReader
				     (new DataInputStream
				      (new URL
					   (new StringBuilder().append
						("http://").append
						(Class15.aClass1_174.aString10)
						.append
						(":").append
						(i).append
						("/news.ws?game=").append
						((client.aClass668_11090
						  .anInt8584) * -1420999111)
						.toString())
					   .openStream())));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; null != string; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (strings.length % 3 != 0)
		return;
	    aClass326Array3627 = new Class326[strings.length / 3];
	    for (int i_0_ = 0; i_0_ < strings.length; i_0_ += 3)
		aClass326Array3627[i_0_ / 3]
		    = new Class326(strings[i_0_], strings[1 + i_0_],
				   strings[i_0_ + 2]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	aBool3626 = true;
    }
    
    public void run() {
	try {
	    int i
		= Class112.method1999(Class176.aClass685_1884,
				      Class675.aClass675_8613,
				      Class15.aClass1_174.anInt11 * -559264181,
				      (byte) -46);
	    BufferedReader bufferedreader
		= new BufferedReader(new InputStreamReader
				     (new DataInputStream
				      (new URL
					   (new StringBuilder().append
						("http://").append
						(Class15.aClass1_174.aString10)
						.append
						(":").append
						(i).append
						("/news.ws?game=").append
						((client.aClass668_11090
						  .anInt8584) * -1420999111)
						.toString())
					   .openStream())));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; null != string; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (strings.length % 3 != 0)
		return;
	    aClass326Array3627 = new Class326[strings.length / 3];
	    for (int i_1_ = 0; i_1_ < strings.length; i_1_ += 3)
		aClass326Array3627[i_1_ / 3]
		    = new Class326(strings[i_1_], strings[1 + i_1_],
				   strings[i_1_ + 2]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	aBool3626 = true;
    }
    
    boolean method5847() {
	if (aBool3626)
	    return true;
	if (aThread3625 == null) {
	    aThread3625 = new Thread(this);
	    aThread3625.start();
	}
	return aBool3626;
    }
    
    Class326 method5848(int i) {
	if (null == aClass326Array3627 || i < 0
	    || i >= aClass326Array3627.length)
	    return null;
	return aClass326Array3627[i];
    }
    
    Class326 method5849(int i, int i_2_) {
	if (null == aClass326Array3627 || i < 0
	    || i >= aClass326Array3627.length)
	    return null;
	return aClass326Array3627[i];
    }
    
    boolean method5850() {
	if (aBool3626)
	    return true;
	if (aThread3625 == null) {
	    aThread3625 = new Thread(this);
	    aThread3625.start();
	}
	return aBool3626;
    }
    
    static String method5851(Class525_Sub16_Sub16 class525_sub16_sub16,
			     int i) {
	if (class525_sub16_sub16.aString11869 == null
	    || class525_sub16_sub16.aString11869.length() == 0) {
	    if (null != class525_sub16_sub16.aString11868
		&& class525_sub16_sub16.aString11868.length() > 0)
		return new StringBuilder().append
			   (class525_sub16_sub16.aString11858).append
			   (Class53.aClass53_520
				.method1169(Class21.aClass666_213, 1552651121))
			   .append
			   (class525_sub16_sub16.aString11868).toString();
	    return class525_sub16_sub16.aString11858;
	}
	if (class525_sub16_sub16.aString11868 != null
	    && class525_sub16_sub16.aString11868.length() > 0)
	    return new StringBuilder().append
		       (class525_sub16_sub16.aString11858).append
		       (Class53.aClass53_520.method1169(Class21.aClass666_213,
							1552651121))
		       .append
		       (class525_sub16_sub16.aString11868).append
		       (Class53.aClass53_520.method1169(Class21.aClass666_213,
							1552651121))
		       .append
		       (class525_sub16_sub16.aString11869).toString();
	return new StringBuilder().append
		   (class525_sub16_sub16.aString11858).append
		   (Class53.aClass53_520.method1169(Class21.aClass666_213,
						    1552651121))
		   .append
		   (class525_sub16_sub16.aString11869).toString();
    }
    
    static final void method5852(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class176.method2908(class259, class245, class683, (short) 2014);
    }
    
    static final void method5853(Class683 class683, int i) {
	int i_3_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_3_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_3_ >> 16];
	Class226.method4258(class259, class245, class683, (byte) 12);
    }
    
    static final void method5854(Class683 class683, int i) {
	throw new RuntimeException("");
    }
    
    public static final int method5855(int i, int i_4_, int i_5_, int i_6_) {
	if (client.aClass507_11137.method8358((byte) 53) == null)
	    return 0;
	int i_7_ = i >> 9;
	int i_8_ = i_4_ >> 9;
	if (i_7_ < 0 || i_8_ < 0
	    || i_7_ > client.aClass507_11137.method8412(1626267018) - 1
	    || i_8_ > client.aClass507_11137.method8352((byte) -128) - 1)
	    return 0;
	int i_9_ = i_5_;
	if (i_9_ < 3 && ((client.aClass507_11137.method8360(1349180564)
			  .aByteArrayArrayArray5178[1][i_7_][i_8_])
			 & 0x2) != 0)
	    i_9_++;
	return client.aClass507_11137.method8358((byte) 109)
		   .aClass161Array7226[i_9_].method2619(i, i_4_, 58548380);
    }
    
    public static void method5856(int i, byte i_10_) {
	if (i < 0 || i > 2)
	    i = 0;
	Class616.anInt8047 = -2092844979 * i;
	Class329.aClass633Array3589
	    = (new Class633
	       [Class181.anIntArray1922[1206403205 * Class616.anInt8047] + 1]);
	Class616.anInt8045 = 0;
	Class616.anInt8046 = 0;
    }
    
    static final void method5857(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_11_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_12_
	    = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	Class584.method9644(2, i_11_, i_12_, "", 1629978408);
    }
    
    public static void method5858(boolean bool, byte i) {
	if (bool) {
	    if (-1 != client.anInt11260 * -750203937)
		Class39.method1015(-750203937 * client.anInt11260,
				   -1736017917);
	    for (Class525_Sub33 class525_sub33
		     = ((Class525_Sub33)
			client.aClass10_11261.method689(1908994589));
		 null != class525_sub33;
		 class525_sub33 = (Class525_Sub33) client.aClass10_11261
						       .method690((byte) 69)) {
		if (!class525_sub33.method8756(922238993)) {
		    class525_sub33
			= ((Class525_Sub33)
			   client.aClass10_11261.method689(1155593846));
		    if (class525_sub33 == null)
			break;
		}
		Class708.method14341(class525_sub33, true, false, -966097770);
	    }
	    client.anInt11260 = 2101694433;
	    client.aClass10_11261 = new Class10(8);
	    Class188.method3687(-2057523774);
	    client.anInt11260 = Class138.aClass631_1641.anInt8176 * 1366758141;
	    if (client.anInt11260 * -750203937 != -1) {
		Class198_Sub14.method15652(false, 1934193360);
		Class83.method1604(-1859713391);
		Class455_Sub1.method15987(client.anInt11260 * -750203937, null,
					  670355642);
	    }
	}
	ObjectDefinitions.method9963((short) -12568);
	Class453_Sub3.aClass309_Sub1_10316.method5452(true, -54570806);
	Class70.aBool787 = false;
	Class525_Sub26.method16365((byte) -14);
	client.anInt11373 = -888222529;
	Class523.method8732(client.anInt11154 * -1649499227, 211232972);
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
	    = new Class656_Sub1_Sub3_Sub1_Sub1(null);
	client.aMap11228.clear();
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10824
	    ((float) (client.aClass507_11137.method8412(1105370733) * 512 / 2),
	     0.0F,
	     (float) (client.aClass507_11137.method8352((byte) -118) * 512
		      / 2));
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.anIntArray12014[0]
	    = client.aClass507_11137.method8412(1253498949) / 2;
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.anIntArray12017[0]
	    = client.aClass507_11137.method8352((byte) -45) / 2;
	Class475.anInt5179 = 0;
	Class477.anInt5200 = 0;
	if (Class700.anInt8779 * -174799205 == 3) {
	    Class477.anInt5200
		= (Class50.anInt376 * 675150689 << 9) * 54795941;
	    Class475.anInt5179
		= 662343119 * (Class695.anInt8758 * -1292350601 << 9);
	} else
	    Class691.method14110(-815275986);
	client.aClass507_11137.method8361((byte) 44).method10398(-2070546342);
    }
    
    static final void method5859(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class183.method3600(class259, class245, false, 2, class683,
			    -619604646);
    }
    
    static byte method5860(int i, int i_13_, int i_14_) {
	if (Class608.aClass608_7980.anInt7995 * -1214990409 != i)
	    return (byte) 0;
	if (0 == (i_13_ & 0x1))
	    return (byte) 1;
	return (byte) 2;
    }
}
