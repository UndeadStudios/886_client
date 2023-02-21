/* Class501 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class501
{
    static boolean aBool5561 = false;
    static File aFile5562;
    static Hashtable aHashtable5563 = new Hashtable(16);
    public static Class182 aClass182_5564;
    
    static void method8186(File file) {
	aFile5562 = file;
	if (!aFile5562.exists())
	    throw new RuntimeException("");
	aBool5561 = true;
    }
    
    public static File method8187(String string) {
	if (!aBool5561)
	    throw new RuntimeException("");
	File file = (File) aHashtable5563.get(string);
	if (file != null)
	    return file;
	File file_0_ = new File(aFile5562, string);
	RandomAccessFile randomaccessfile = null;
	File file_1_;
	try {
	    File file_2_ = new File(file_0_.getParent());
	    if (!file_2_.exists())
		throw new RuntimeException("");
	    randomaccessfile = new RandomAccessFile(file_0_, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    aHashtable5563.put(string, file_0_);
	    file_1_ = file_0_;
	} catch (Exception exception) {
	    try {
		if (null != randomaccessfile) {
		    randomaccessfile.close();
		    Object object = null;
		}
	    } catch (Exception exception_3_) {
		/* empty */
	    }
	    throw new RuntimeException();
	}
	return file_1_;
    }
    
    static void method8188(File file) {
	aFile5562 = file;
	if (!aFile5562.exists())
	    throw new RuntimeException("");
	aBool5561 = true;
    }
    
    static void method8189(File file) {
	aFile5562 = file;
	if (!aFile5562.exists())
	    throw new RuntimeException("");
	aBool5561 = true;
    }
    
    static void method8190(File file) {
	aFile5562 = file;
	if (!aFile5562.exists())
	    throw new RuntimeException("");
	aBool5561 = true;
    }
    
    Class501() throws Throwable {
	throw new Error();
    }
    
    public static String method8191() {
	return aFile5562.getAbsolutePath();
    }
    
    public static String method8192() {
	return aFile5562.getAbsolutePath();
    }
    
    public static String method8193() {
	return aFile5562.getAbsolutePath();
    }
    
    public static String method8194() {
	return aFile5562.getAbsolutePath();
    }
    
    public static File method8195(String string) {
	if (!aBool5561)
	    throw new RuntimeException("");
	File file = (File) aHashtable5563.get(string);
	if (file != null)
	    return file;
	File file_4_ = new File(aFile5562, string);
	RandomAccessFile randomaccessfile = null;
	File file_5_;
	try {
	    File file_6_ = new File(file_4_.getParent());
	    if (!file_6_.exists())
		throw new RuntimeException("");
	    randomaccessfile = new RandomAccessFile(file_4_, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    aHashtable5563.put(string, file_4_);
	    file_5_ = file_4_;
	} catch (Exception exception) {
	    try {
		if (null != randomaccessfile) {
		    randomaccessfile.close();
		    Object object = null;
		}
	    } catch (Exception exception_7_) {
		/* empty */
	    }
	    throw new RuntimeException();
	}
	return file_5_;
    }
    
    public static File method8196(String string) {
	if (!aBool5561)
	    throw new RuntimeException("");
	File file = (File) aHashtable5563.get(string);
	if (file != null)
	    return file;
	File file_8_ = new File(aFile5562, string);
	RandomAccessFile randomaccessfile = null;
	File file_9_;
	try {
	    File file_10_ = new File(file_8_.getParent());
	    if (!file_10_.exists())
		throw new RuntimeException("");
	    randomaccessfile = new RandomAccessFile(file_8_, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    aHashtable5563.put(string, file_8_);
	    file_9_ = file_8_;
	} catch (Exception exception) {
	    try {
		if (null != randomaccessfile) {
		    randomaccessfile.close();
		    Object object = null;
		}
	    } catch (Exception exception_11_) {
		/* empty */
	    }
	    throw new RuntimeException();
	}
	return file_9_;
    }
    
    public static String method8197(int i, int i_12_) {
	return new StringBuilder().append("<img=").append(i).append(">")
		   .toString();
    }
    
    static final void method8198(Class683 class683, short i) {
	int i_13_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (client.anInt11362 * 1819257147 != 0
	    && i_13_ < client.anInt11366 * -651611127)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= client.aClass31Array11368[i_13_].aString300;
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
    }
    
    static final void method8199(Class683 class683, byte i) {
	int i_14_ = 0;
	int i_15_ = 0;
	for (int i_16_ = 0;
	     i_16_ < Class652_Sub2.aClass454_Sub1Array10916.length; i_16_++) {
	    if (Class652_Sub2.aClass454_Sub1Array10916[i_16_] != null
		&& Class652_Sub2.aClass454_Sub1Array10916[i_16_]
		       .method16009(-516623046)) {
		i_14_ += Class652_Sub2.aClass454_Sub1Array10916[i_16_]
			     .method16007(-1944191252);
		i_15_ += Class652_Sub2.aClass454_Sub1Array10916[i_16_]
			     .method16006(2058572998);
	    }
	}
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0 == i_14_ ? 0 : 100 * i_15_ / i_14_;
    }
}
