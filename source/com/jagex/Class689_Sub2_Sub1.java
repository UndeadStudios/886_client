/* Class689_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.RandomAccessFile;

public class Class689_Sub2_Sub1 extends Class689_Sub2
{
    public int anInt11938;
    
    public Class689_Sub2_Sub1(Class656_Sub1 class656_sub1) {
	super(class656_sub1, false);
    }
    
    public static File method18590(String string, byte i) {
	if (!Class501.aBool5561)
	    throw new RuntimeException("");
	File file = (File) Class501.aHashtable5563.get(string);
	if (file != null)
	    return file;
	File file_0_ = new File(Class501.aFile5562, string);
	RandomAccessFile randomaccessfile = null;
	File file_1_;
	try {
	    File file_2_ = new File(file_0_.getParent());
	    if (!file_2_.exists())
		throw new RuntimeException("");
	    randomaccessfile = new RandomAccessFile(file_0_, "rw");
	    int i_3_ = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i_3_);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    Class501.aHashtable5563.put(string, file_0_);
	    file_1_ = file_0_;
	} catch (Exception exception) {
	    try {
		if (null != randomaccessfile) {
		    randomaccessfile.close();
		    Object object = null;
		}
	    } catch (Exception exception_4_) {
		/* empty */
	    }
	    throw new RuntimeException();
	}
	return file_1_;
    }
}
