/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class42
{
    long aLong338;
    RandomAccessFile aRandomAccessFile339;
    long aLong340;
    static int[] anIntArray341;
    
    void method1044() throws Throwable {
	if (null != aRandomAccessFile339) {
	    System.out.println("");
	    method1047(-1688824186);
	}
    }
    
    final void method1045(long l) throws IOException {
	aRandomAccessFile339.seek(l);
	aLong340 = -1020794196753344443L * l;
    }
    
    final void method1046(long l) throws IOException {
	aRandomAccessFile339.seek(l);
	aLong340 = -1020794196753344443L * l;
    }
    
    public final void method1047(int i) throws IOException {
	if (null != aRandomAccessFile339) {
	    aRandomAccessFile339.close();
	    aRandomAccessFile339 = null;
	}
    }
    
    public final long method1048(int i) throws IOException {
	return aRandomAccessFile339.length();
    }
    
    public final int method1049(byte[] is, int i, int i_0_, byte i_1_)
	throws IOException {
	int i_2_ = aRandomAccessFile339.read(is, i, i_0_);
	if (i_2_ > 0)
	    aLong340 += -1020794196753344443L * (long) i_2_;
	return i_2_;
    }
    
    public void finalize() throws Throwable {
	if (null != aRandomAccessFile339) {
	    System.out.println("");
	    method1047(-598863755);
	}
    }
    
    void method1050() throws Throwable {
	if (null != aRandomAccessFile339) {
	    System.out.println("");
	    method1047(1284468527);
	}
    }
    
    public final void method1051(byte[] is, int i, int i_3_, int i_4_)
	throws IOException {
	if ((long) i_3_ + aLong340 * 729844045566098061L
	    > aLong338 * -8473147006246653961L) {
	    aRandomAccessFile339.seek(-8473147006246653961L * aLong338);
	    aRandomAccessFile339.write(1);
	    throw new EOFException();
	}
	aRandomAccessFile339.write(is, i, i_3_);
	aLong340 += (long) i_3_ * -1020794196753344443L;
    }
    
    void method1052() throws Throwable {
	if (null != aRandomAccessFile339) {
	    System.out.println("");
	    method1047(-1128531081);
	}
    }
    
    public final long method1053() throws IOException {
	return aRandomAccessFile339.length();
    }
    
    final void method1054(long l) throws IOException {
	aRandomAccessFile339.seek(l);
	aLong340 = -1020794196753344443L * l;
    }
    
    public final int method1055(byte[] is, int i, int i_5_)
	throws IOException {
	int i_6_ = aRandomAccessFile339.read(is, i, i_5_);
	if (i_6_ > 0)
	    aLong340 += -1020794196753344443L * (long) i_6_;
	return i_6_;
    }
    
    final void method1056(long l) throws IOException {
	aRandomAccessFile339.seek(l);
	aLong340 = -1020794196753344443L * l;
    }
    
    public final void method1057(byte[] is, int i, int i_7_)
	throws IOException {
	if ((long) i_7_ + aLong340 * 729844045566098061L
	    > aLong338 * -8473147006246653961L) {
	    aRandomAccessFile339.seek(-8473147006246653961L * aLong338);
	    aRandomAccessFile339.write(1);
	    throw new EOFException();
	}
	aRandomAccessFile339.write(is, i, i_7_);
	aLong340 += (long) i_7_ * -1020794196753344443L;
    }
    
    public final void method1058(byte[] is, int i, int i_8_)
	throws IOException {
	if ((long) i_8_ + aLong340 * 729844045566098061L
	    > aLong338 * -8473147006246653961L) {
	    aRandomAccessFile339.seek(-8473147006246653961L * aLong338);
	    aRandomAccessFile339.write(1);
	    throw new EOFException();
	}
	aRandomAccessFile339.write(is, i, i_8_);
	aLong340 += (long) i_8_ * -1020794196753344443L;
    }
    
    public final void method1059(byte[] is, int i, int i_9_)
	throws IOException {
	if ((long) i_9_ + aLong340 * 729844045566098061L
	    > aLong338 * -8473147006246653961L) {
	    aRandomAccessFile339.seek(-8473147006246653961L * aLong338);
	    aRandomAccessFile339.write(1);
	    throw new EOFException();
	}
	aRandomAccessFile339.write(is, i, i_9_);
	aLong340 += (long) i_9_ * -1020794196753344443L;
    }
    
    public final void method1060() throws IOException {
	if (null != aRandomAccessFile339) {
	    aRandomAccessFile339.close();
	    aRandomAccessFile339 = null;
	}
    }
    
    public final long method1061() throws IOException {
	return aRandomAccessFile339.length();
    }
    
    public final long method1062() throws IOException {
	return aRandomAccessFile339.length();
    }
    
    public final int method1063(byte[] is, int i, int i_10_)
	throws IOException {
	int i_11_ = aRandomAccessFile339.read(is, i, i_10_);
	if (i_11_ > 0)
	    aLong340 += -1020794196753344443L * (long) i_11_;
	return i_11_;
    }
    
    void method1064() throws Throwable {
	if (null != aRandomAccessFile339) {
	    System.out.println("");
	    method1047(-228504292);
	}
    }
    
    public final int method1065(byte[] is, int i, int i_12_)
	throws IOException {
	int i_13_ = aRandomAccessFile339.read(is, i, i_12_);
	if (i_13_ > 0)
	    aLong340 += -1020794196753344443L * (long) i_13_;
	return i_13_;
    }
    
    public Class42(File file, String string, long l) throws IOException {
	if (-1L == l)
	    l = 9223372036854775807L;
	if (file.length() > l)
	    file.delete();
	aRandomAccessFile339 = new RandomAccessFile(file, string);
	aLong338 = 4823758867558465991L * l;
	aLong340 = 0L;
	int i = aRandomAccessFile339.read();
	if (i != -1 && !string.equals("r")) {
	    aRandomAccessFile339.seek(0L);
	    aRandomAccessFile339.write(i);
	}
	aRandomAccessFile339.seek(0L);
    }
    
    public final int method1066(byte[] is, int i, int i_14_)
	throws IOException {
	int i_15_ = aRandomAccessFile339.read(is, i, i_14_);
	if (i_15_ > 0)
	    aLong340 += -1020794196753344443L * (long) i_15_;
	return i_15_;
    }
    
    static final void method1067(Class683 class683, byte i) {
	class683.anInt8662 -= 362986067;
	int i_16_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_17_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_18_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	int i_19_ = 255;
	int i_20_ = 256;
	Class40_Sub20.aClass217_11050.method4047(Class204.aClass204_2233,
						 i_16_, i_17_, i_19_,
						 Class208.aClass208_2250
						     .method3907((short) 4627),
						 Class195.aClass195_2177, 0.0F,
						 0.0F, null, 0, i_20_, i_18_,
						 2125729122);
    }
}
