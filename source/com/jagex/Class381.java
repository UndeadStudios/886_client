/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class381
{
    static int anInt3926;
    Class372 aClass372_3927;
    Map aMap3928 = new HashMap();
    public static int[] anIntArray3929;
    public static int anInt3930;
    
    public Class393 method6395(int i, int i_0_, float f,
			       Interface43 interface43) {
	if (method6398(i, 1209685799) != null)
	    return null;
	Class393 class393 = null;
	if (i_0_ != -1)
	    class393 = method6398(i_0_, 1282218255);
	Object object = aClass372_3927.method6338(class393, 656452380);
	Class393 class393_1_
	    = new Class393(i, f, object, this, interface43, class393);
	aMap3928.put(Integer.valueOf(i), class393_1_);
	return class393_1_;
    }
    
    public void method6396(int i) {
	Iterator iterator = aMap3928.values().iterator();
	while (iterator.hasNext()) {
	    Class393 class393 = (Class393) iterator.next();
	    class393.method6486((byte) -36);
	}
    }
    
    public Class393 method6397(int i) {
	return (Class393) aMap3928.get(Integer.valueOf(i));
    }
    
    public Class393 method6398(int i, int i_2_) {
	return (Class393) aMap3928.get(Integer.valueOf(i));
    }
    
    public Class393 method6399(int i) {
	return (Class393) aMap3928.get(Integer.valueOf(i));
    }
    
    public void method6400() {
	Iterator iterator = aMap3928.values().iterator();
	while (iterator.hasNext()) {
	    Class393 class393 = (Class393) iterator.next();
	    class393.method6486((byte) 121);
	}
    }
    
    public Class393 method6401(int i, int i_3_, float f,
			       Interface43 interface43, byte i_4_) {
	if (method6398(i, 429401025) != null)
	    return null;
	Class393 class393 = null;
	if (i_3_ != -1)
	    class393 = method6398(i_3_, -1012478072);
	Object object = aClass372_3927.method6338(class393, 656452380);
	Class393 class393_5_
	    = new Class393(i, f, object, this, interface43, class393);
	aMap3928.put(Integer.valueOf(i), class393_5_);
	return class393_5_;
    }
    
    public Class393 method6402(int i, int i_6_, float f,
			       Interface43 interface43) {
	if (method6398(i, -253024754) != null)
	    return null;
	Class393 class393 = null;
	if (i_6_ != -1)
	    class393 = method6398(i_6_, 2127223145);
	Object object = aClass372_3927.method6338(class393, 656452380);
	Class393 class393_7_
	    = new Class393(i, f, object, this, interface43, class393);
	aMap3928.put(Integer.valueOf(i), class393_7_);
	return class393_7_;
    }
    
    public Class393 method6403(int i, int i_8_, float f,
			       Interface43 interface43) {
	if (method6398(i, 1084406695) != null)
	    return null;
	Class393 class393 = null;
	if (i_8_ != -1)
	    class393 = method6398(i_8_, 1695156594);
	Object object = aClass372_3927.method6338(class393, 656452380);
	Class393 class393_9_
	    = new Class393(i, f, object, this, interface43, class393);
	aMap3928.put(Integer.valueOf(i), class393_9_);
	return class393_9_;
    }
    
    public Class381(Class372 class372) {
	aClass372_3927 = class372;
    }
    
    public void method6404() {
	Iterator iterator = aMap3928.values().iterator();
	while (iterator.hasNext()) {
	    Class393 class393 = (Class393) iterator.next();
	    class393.method6486((byte) -50);
	}
    }
    
    public Class393 method6405(int i) {
	return (Class393) aMap3928.get(Integer.valueOf(i));
    }
    
    static final void method6406(Class683 class683, short i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class183.method3600(class259, class245, false, 0, class683,
			    -889822533);
    }
    
    static final void method6407(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class642.method10593(class259, class245, class683, -208210301);
    }
    
    static final void method6408(Class683 class683, int i) {
	int i_10_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (null != client.aString11337
	    && i_10_ < -218000115 * Class110.anInt1371)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= Class699.aClass99Array8774[i_10_].aByte1212;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method6409(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method6410(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub23_10719
		  .method17189(-1613021392);
    }
    
    static final void method6411(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_11_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_12_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = AnimationSkin.method3922(i_11_, i_12_, false, -1179952119);
    }
    
    static final void method6412(int i, byte i_13_) {
	client.anInt11151 = 0;
	client.anInt11126 = 0;
	client.anInt11227 += 2098189489;
	Class217.method4148(-574542822);
	Class324.method5737(i, (byte) 24);
	Class382.method6428(781528061);
	boolean bool = false;
	for (int i_14_ = 0; i_14_ < client.anInt11151 * -1613312929; i_14_++) {
	    int i_15_ = client.anIntArray11130[i_14_];
	    Class525_Sub19 class525_sub19
		= ((Class525_Sub19)
		   client.aClass10_11121.method684((long) i_15_));
	    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		= (Class656_Sub1_Sub3_Sub1_Sub2) class525_sub19.anObject10571;
	    if (client.anInt11227 * 1624634449
		!= class656_sub1_sub3_sub1_sub2.anInt12006 * 1757254935) {
		if (Class61.aBool670
		    && Class385.method6443(i_15_, -1761587277))
		    Class219.method4200((byte) -26);
		if (class656_sub1_sub3_sub1_sub2.aClass299_12255
			.method5370(65280))
		    Class222.method4240(class656_sub1_sub3_sub1_sub2, 65280);
		class656_sub1_sub3_sub1_sub2.method18942(null, -309915016);
		class525_sub19.method8755(-1933461091);
		bool = true;
	    }
	}
	if (bool) {
	    int i_16_ = client.anInt11276 * 1530572215;
	    client.anInt11276
		= client.aClass10_11121.method687(-2135736804) * 2042937351;
	    int i_17_ = 0;
	    Iterator iterator = client.aClass10_11121.iterator();
	    while (iterator.hasNext()) {
		Class525_Sub19 class525_sub19
		    = (Class525_Sub19) iterator.next();
		client.aClass525_Sub19Array11122[i_17_++] = class525_sub19;
	    }
	    for (int i_18_ = client.anInt11276 * 1530572215; i_18_ < i_16_;
		 i_18_++)
		client.aClass525_Sub19Array11122[i_18_] = null;
	    Class289 class289
		= Class453_Sub3.aClass309_Sub1_10316.method5485(1777509275);
	    if (Class289.aClass289_3202 == class289) {
		Class350_Sub1 class350_sub1
		    = (Class350_Sub1) Class453_Sub3.aClass309_Sub1_10316
					  .method5481(-358309970);
		class350_sub1.method15810((byte) 45);
	    }
	    Class298 class298
		= Class453_Sub3.aClass309_Sub1_10316.method5484(-2130436535);
	    if (class298 == Class298.aClass298_3278) {
		Class704_Sub3 class704_sub3
		    = (Class704_Sub3) Class453_Sub3.aClass309_Sub1_10316
					  .method5482(2012321245);
		class704_sub3.method17403(-993175021);
	    }
	}
	if ((client.aClass96_11085.aClass525_Sub38_Sub2_1168.index
	     * -1133521593)
	    != -1101265009 * client.aClass96_11085.anInt1173)
	    throw new RuntimeException(new StringBuilder().append
					   (-1133521593
					    * (client.aClass96_11085
					       .aClass525_Sub38_Sub2_1168
					       .index))
					   .append
					   (" ").append
					   (client.aClass96_11085.anInt1173
					    * -1101265009)
					   .toString());
	for (int i_19_ = 0; i_19_ < 1111866889 * client.anInt11216; i_19_++) {
	    if (client.aClass10_11121
		    .method684((long) client.anIntArray11125[i_19_])
		== null)
		throw new RuntimeException(new StringBuilder().append
					       (i_19_).append
					       (" ").append
					       (1111866889 * client.anInt11216)
					       .toString());
	}
	if (0
	    != client.anInt11276 * 1530572215 - client.anInt11216 * 1111866889)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (1530572215 * client.anInt11276
					    - 1111866889 * client.anInt11216)
					   .toString());
	for (int i_20_ = 0; i_20_ < 1530572215 * client.anInt11276; i_20_++) {
	    if ((((Class656_Sub1_Sub3_Sub1)
		  client.aClass525_Sub19Array11122[i_20_].anObject10571)
		 .anInt12006) * 1757254935
		!= client.anInt11227 * 1624634449)
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       ((((Class656_Sub1_Sub3_Sub1)
						  (client
						   .aClass525_Sub19Array11122
						   [i_20_].anObject10571))
						 .anInt11964) * 2032864281)
					       .toString());
	}
    }
    
    static void method6413(byte i) {
	/* empty */
    }
    
    public static final void method6414(String string, String string_21_,
					int i) {
	Class96 class96 = Class111.method1979(-934789978);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4262, class96.aClass6_1169,
				1977859884);
	if (string_21_.length() > 30)
	    string_21_ = string_21_.substring(0, 30);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16735
	    ((Class161.method2628(string, 303811332)
	      + Class161.method2628(string_21_, -296945711)),
	     -2124666867);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string_21_,
							      975494368);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
							      -696677636);
	class96.method1794(class525_sub15, (short) 15866);
    }
}
