/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class Class11
{
    Class11() throws Throwable {
	throw new Error();
    }
    
    public static byte[] method708(File file) {
	return Class324.method5738(file, (int) file.length(), 1654827636);
    }
    
    static byte[] method709(File file, int i) {
	byte[] is;
	try {
	    byte[] is_0_ = new byte[i];
	    Class332.method5820(file, is_0_, i, 1331487341);
	    is = is_0_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is;
    }
    
    static byte[] method710(File file, int i) {
	byte[] is;
	try {
	    byte[] is_1_ = new byte[i];
	    Class332.method5820(file, is_1_, i, 1926081326);
	    is = is_1_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is;
    }
    
    static byte[] method711(File file, int i) {
	byte[] is;
	try {
	    byte[] is_2_ = new byte[i];
	    Class332.method5820(file, is_2_, i, -597651005);
	    is = is_2_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is;
    }
    
    public static byte[] method712(File file) {
	return Class324.method5738(file, (int) file.length(), 1187435422);
    }
    
    static void method713(File file, byte[] is, int i) throws IOException {
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    static final void method714(int i, int i_3_, int i_4_, int i_5_, int i_6_,
				int i_7_, int i_8_) {
	Class109[] class109s = client.aClass109Array11089;
	for (int i_9_ = 0; i_9_ < class109s.length; i_9_++) {
	    Class109 class109 = class109s[i_9_];
	    if (null != class109 && 2 == class109.anInt1316 * 309020347) {
		Class585.method9663(class109.anInt1311 * 896214321,
				    class109.anInt1313 * 644912697,
				    class109.anInt1314 * 1703881669, 0,
				    class109.anInt1317 * 189892986, false,
				    false, 778610346);
		if (client.aFloatArray11375[0] > -1.0F
		    && client.anInt11083 % 20 < 10) {
		    Class157 class157 = (Class664.aClass157Array8556
					 [class109.anInt1312 * -1964012613]);
		    int i_10_ = (int) ((float) i + client.aFloatArray11375[0]
				       - 12.0F);
		    int i_11_ = (int) ((float) i_3_
				       + client.aFloatArray11375[1] - 28.0F);
		    class157.method2518(i_10_, i_11_);
		}
	    }
	}
    }
    
    static void method715(int i) {
	if (Class176.aClass685_1884 != Class685.aClass685_8678)
	    Class407.aClass407_4180.method6626((byte) 122);
    }
    
    static final void method716(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class69.aByte737;
    }
    
    static void method717(Class547[][][] class547s, short i) {
	for (int i_12_ = 0; i_12_ < class547s.length; i_12_++) {
	    Class547[][] class547s_13_ = class547s[i_12_];
	    for (int i_14_ = 0; i_14_ < class547s_13_.length; i_14_++) {
		for (int i_15_ = 0; i_15_ < class547s_13_[i_14_].length;
		     i_15_++) {
		    Class547 class547 = class547s_13_[i_14_][i_15_];
		    if (null != class547) {
			if (class547.aClass656_Sub1_Sub1_7264
			    instanceof Interface62)
			    ((Interface62) class547.aClass656_Sub1_Sub1_7264)
				.method395(1285561025);
			if (class547.aClass656_Sub1_Sub4_7268
			    instanceof Interface62)
			    ((Interface62) class547.aClass656_Sub1_Sub4_7268)
				.method395(1285561025);
			if (class547.aClass656_Sub1_Sub4_7276
			    instanceof Interface62)
			    ((Interface62) class547.aClass656_Sub1_Sub4_7276)
				.method395(1285561025);
			if (class547.aClass656_Sub1_Sub5_7266
			    instanceof Interface62)
			    ((Interface62) class547.aClass656_Sub1_Sub5_7266)
				.method395(1285561025);
			if (class547.aClass656_Sub1_Sub5_7267
			    instanceof Interface62)
			    ((Interface62) class547.aClass656_Sub1_Sub5_7267)
				.method395(1285561025);
			for (Class560 class560 = class547.aClass560_7272;
			     class560 != null;
			     class560 = class560.aClass560_7546) {
			    Class656_Sub1_Sub3 class656_sub1_sub3
				= class560.aClass656_Sub1_Sub3_7547;
			    if (class656_sub1_sub3 instanceof Interface62)
				((Interface62) class656_sub1_sub3)
				    .method395(1285561025);
			}
		    }
		}
	    }
	}
    }
}
