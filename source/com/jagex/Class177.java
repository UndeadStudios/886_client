/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class177
{
    short[] aShortArray1885;
    static short[] aShortArray1886;
    static short[] aShortArray1887;
    static short[] aShortArray1888;
    static short[] aShortArray1889 = new short[500];
    static byte[] aByteArray1890;
    Class525_Sub14 aClass525_Sub14_1891 = null;
    int anInt1892 = 0;
    short[] aShortArray1893;
    short[] aShortArray1894;
    short[] aShortArray1895;
    static final int anInt1896 = 2;
    short[] aShortArray1897;
    byte[] aByteArray1898;
    boolean aBool1899 = false;
    static short[] aShortArray1900;
    boolean aBool1901 = false;
    boolean aBool1902 = false;
    static final int anInt1903 = 1;
    static final int anInt1904 = 2;
    
    Class177(byte[] is, Class525_Sub14 class525_sub14) {
	aClass525_Sub14_1891 = class525_sub14;
	try {
	    RSBuffer class525_sub38 = new RSBuffer(is);
	    RSBuffer class525_sub38_0_ = new RSBuffer(is);
	    int i = class525_sub38.readUnsignedByte(1005005350);
	    class525_sub38.pos += 678856942;
	    int i_1_ = class525_sub38.readUnsignedShort((byte) 80);
	    int i_2_ = 0;
	    int i_3_ = -1;
	    int i_4_ = -1;
	    class525_sub38_0_.pos
		= (class525_sub38.pos * -1133521593 + i_1_) * 339428471;
	    for (int i_5_ = 0; i_5_ < i_1_; i_5_++) {
		int i_6_ = aClass525_Sub14_1891.anIntArray10542[i_5_];
		if (i_6_ == 0)
		    i_3_ = i_5_;
		int i_7_ = class525_sub38.readUnsignedByte(1502456173);
		if (i_7_ > 0) {
		    if (i_6_ == 0)
			i_4_ = i_5_;
		    aShortArray1889[i_2_] = (short) i_5_;
		    short i_8_ = 0;
		    if (i_6_ == 3 || i_6_ == 10)
			i_8_ = (short) 128;
		    if (i >= 2 && i_6_ == 7) {
			if ((i_7_ & 0x1) != 0) {
			    aShortArray1886[i_2_]
				= (short) class525_sub38_0_
					      .method16640(993241788);
			    class525_sub38_0_.method16640(993241788);
			} else
			    aShortArray1886[i_2_] = i_8_;
			if ((i_7_ & 0x2) != 0) {
			    aShortArray1887[i_2_]
				= (short) class525_sub38_0_
					      .method16640(993241788);
			    class525_sub38_0_.method16640(993241788);
			} else
			    aShortArray1887[i_2_] = i_8_;
			if ((i_7_ & 0x4) != 0) {
			    aShortArray1888[i_2_]
				= (short) class525_sub38_0_
					      .method16640(993241788);
			    class525_sub38_0_.method16640(993241788);
			} else
			    aShortArray1888[i_2_] = i_8_;
		    } else {
			if ((i_7_ & 0x1) != 0)
			    aShortArray1886[i_2_]
				= (short) class525_sub38_0_
					      .method16640(993241788);
			else
			    aShortArray1886[i_2_] = i_8_;
			if ((i_7_ & 0x2) != 0)
			    aShortArray1887[i_2_]
				= (short) class525_sub38_0_
					      .method16640(993241788);
			else
			    aShortArray1887[i_2_] = i_8_;
			if ((i_7_ & 0x4) != 0)
			    aShortArray1888[i_2_]
				= (short) class525_sub38_0_
					      .method16640(993241788);
			else
			    aShortArray1888[i_2_] = i_8_;
		    }
		    aByteArray1890[i_2_] = (byte) (i_7_ >>> 3 & 0x3);
		    if (i_6_ == 2 || i_6_ == 9) {
			aShortArray1886[i_2_]
			    = (short) (aShortArray1886[i_2_] << 2 & 0x3fff);
			aShortArray1887[i_2_]
			    = (short) (aShortArray1887[i_2_] << 2 & 0x3fff);
			aShortArray1888[i_2_]
			    = (short) (aShortArray1888[i_2_] << 2 & 0x3fff);
		    }
		    aShortArray1900[i_2_] = (short) -1;
		    if (i_6_ == 1 || i_6_ == 2 || i_6_ == 3) {
			if (i_3_ > i_4_) {
			    aShortArray1900[i_2_] = (short) i_3_;
			    i_4_ = i_3_;
			}
		    } else if (i_6_ == 5)
			aBool1899 = true;
		    else if (i_6_ == 7)
			aBool1901 = true;
		    else if (i_6_ == 9 || i_6_ == 10 || i_6_ == 8)
			aBool1902 = true;
		    i_2_++;
		}
	    }
	    if (class525_sub38_0_.pos * -1133521593 != is.length)
		throw new RuntimeException();
	    anInt1892 = i_2_;
	    aShortArray1893 = new short[i_2_];
	    aShortArray1897 = new short[i_2_];
	    aShortArray1895 = new short[i_2_];
	    aShortArray1894 = new short[i_2_];
	    aShortArray1885 = new short[i_2_];
	    aByteArray1898 = new byte[i_2_];
	    for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
		aShortArray1893[i_9_] = aShortArray1889[i_9_];
		aShortArray1897[i_9_] = aShortArray1886[i_9_];
		aShortArray1895[i_9_] = aShortArray1887[i_9_];
		aShortArray1894[i_9_] = aShortArray1888[i_9_];
		aShortArray1885[i_9_] = aShortArray1900[i_9_];
		aByteArray1898[i_9_] = aByteArray1890[i_9_];
	    }
	} catch (Exception exception) {
	    anInt1892 = 0;
	    aBool1899 = false;
	    aBool1901 = false;
	}
    }
    
    static {
	aShortArray1886 = new short[500];
	aShortArray1887 = new short[500];
	aShortArray1888 = new short[500];
	aShortArray1900 = new short[500];
	aByteArray1890 = new byte[500];
    }
}
