/* Class552 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.io.IOException;

public final class Class552
{
    int anInt7406;
    Class37 aClass37_7407 = null;
    static byte[] aByteArray7408 = new byte[520];
    int anInt7409;
    Class37 aClass37_7410 = null;
    
    public String method9156() {
	return new StringBuilder().append("").append
		   (anInt7409 * -1309804595).toString();
    }
    
    boolean method9157(int i, byte[] is, int i_0_, boolean bool) {
	synchronized (aClass37_7407) {
	    boolean bool_1_;
	    try {
		int i_2_;
		if (bool) {
		    if (aClass37_7410.method1001((byte) 17)
			< (long) (i * 6 + 6)) {
			boolean bool_3_ = false;
			return bool_3_;
		    }
		    aClass37_7410.method986((long) (6 * i));
		    aClass37_7410.method983(aByteArray7408, 0, 6, -1061289791);
		    i_2_ = (((aByteArray7408[3] & 0xff) << 16)
			    + ((aByteArray7408[4] & 0xff) << 8)
			    + (aByteArray7408[5] & 0xff));
		    if (i_2_ <= 0
			|| ((long) i_2_
			    > aClass37_7407.method1001((byte) 17) / 520L)) {
			boolean bool_4_ = false;
			return bool_4_;
		    }
		} else {
		    i_2_ = (int) ((aClass37_7407.method1001((byte) 17) + 519L)
				  / 520L);
		    if (0 == i_2_)
			i_2_ = 1;
		}
		aByteArray7408[0] = (byte) (i_0_ >> 16);
		aByteArray7408[1] = (byte) (i_0_ >> 8);
		aByteArray7408[2] = (byte) i_0_;
		aByteArray7408[3] = (byte) (i_2_ >> 16);
		aByteArray7408[4] = (byte) (i_2_ >> 8);
		aByteArray7408[5] = (byte) i_2_;
		aClass37_7410.method986((long) (6 * i));
		aClass37_7410.method987(aByteArray7408, 0, 6, (byte) 1);
		int i_5_ = 0;
		int i_6_ = 0;
		while (i_5_ < i_0_) {
		    int i_7_ = 0;
		    if (bool) {
			aClass37_7407.method986((long) i_2_ * 520L);
			int i_8_;
			int i_9_;
			int i_10_;
			if (i > 65535) {
			    try {
				aClass37_7407.method983(aByteArray7408, 0, 10,
							-585818512);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_8_ = ((aByteArray7408[3] & 0xff)
				    + (((aByteArray7408[2] & 0xff) << 8)
				       + (((aByteArray7408[0] & 0xff) << 24)
					  + ((aByteArray7408[1] & 0xff)
					     << 16))));
			    i_9_ = (((aByteArray7408[4] & 0xff) << 8)
				    + (aByteArray7408[5] & 0xff));
			    i_7_ = ((aByteArray7408[8] & 0xff)
				    + (((aByteArray7408[7] & 0xff) << 8)
				       + ((aByteArray7408[6] & 0xff) << 16)));
			    i_10_ = aByteArray7408[9] & 0xff;
			} else {
			    try {
				aClass37_7407.method983(aByteArray7408, 0, 8,
							81511768);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_8_ = (((aByteArray7408[0] & 0xff) << 8)
				    + (aByteArray7408[1] & 0xff));
			    i_9_ = (((aByteArray7408[2] & 0xff) << 8)
				    + (aByteArray7408[3] & 0xff));
			    i_7_ = (((aByteArray7408[5] & 0xff) << 8)
				    + ((aByteArray7408[4] & 0xff) << 16)
				    + (aByteArray7408[6] & 0xff));
			    i_10_ = aByteArray7408[7] & 0xff;
			}
			if (i_8_ != i || i_6_ != i_9_
			    || i_10_ != -1309804595 * anInt7409) {
			    boolean bool_11_ = false;
			    return bool_11_;
			}
			if (i_7_ < 0 || ((long) i_7_
					 > (aClass37_7407.method1001((byte) 17)
					    / 520L))) {
			    boolean bool_12_ = false;
			    return bool_12_;
			}
		    }
		    if (0 == i_7_) {
			bool = false;
			i_7_ = (int) ((aClass37_7407.method1001((byte) 17)
				       + 519L)
				      / 520L);
			if (i_7_ == 0)
			    i_7_++;
			if (i_2_ == i_7_)
			    i_7_++;
		    }
		    if (i > 65535) {
			if (i_0_ - i_5_ <= 510)
			    i_7_ = 0;
			aByteArray7408[0] = (byte) (i >> 24);
			aByteArray7408[1] = (byte) (i >> 16);
			aByteArray7408[2] = (byte) (i >> 8);
			aByteArray7408[3] = (byte) i;
			aByteArray7408[4] = (byte) (i_6_ >> 8);
			aByteArray7408[5] = (byte) i_6_;
			aByteArray7408[6] = (byte) (i_7_ >> 16);
			aByteArray7408[7] = (byte) (i_7_ >> 8);
			aByteArray7408[8] = (byte) i_7_;
			aByteArray7408[9] = (byte) (-1309804595 * anInt7409);
			aClass37_7407.method986((long) i_2_ * 520L);
			aClass37_7407.method987(aByteArray7408, 0, 10,
						(byte) 1);
			int i_13_ = i_0_ - i_5_;
			if (i_13_ > 510)
			    i_13_ = 510;
			aClass37_7407.method987(is, i_5_, i_13_, (byte) 1);
			i_5_ += i_13_;
		    } else {
			if (i_0_ - i_5_ <= 512)
			    i_7_ = 0;
			aByteArray7408[0] = (byte) (i >> 8);
			aByteArray7408[1] = (byte) i;
			aByteArray7408[2] = (byte) (i_6_ >> 8);
			aByteArray7408[3] = (byte) i_6_;
			aByteArray7408[4] = (byte) (i_7_ >> 16);
			aByteArray7408[5] = (byte) (i_7_ >> 8);
			aByteArray7408[6] = (byte) i_7_;
			aByteArray7408[7] = (byte) (-1309804595 * anInt7409);
			aClass37_7407.method986(520L * (long) i_2_);
			aClass37_7407.method987(aByteArray7408, 0, 8,
						(byte) 1);
			int i_14_ = i_0_ - i_5_;
			if (i_14_ > 512)
			    i_14_ = 512;
			aClass37_7407.method987(is, i_5_, i_14_, (byte) 1);
			i_5_ += i_14_;
		    }
		    i_2_ = i_7_;
		    i_6_++;
		}
		bool_1_ = true;
	    } catch (IOException ioexception) {
		boolean bool_15_ = false;
		return bool_15_;
	    }
	    return bool_1_;
	}
    }
    
    public Class552(int i, Class37 class37, Class37 class37_16_, int i_17_) {
	anInt7406 = -17216072;
	anInt7409 = i * 26725637;
	aClass37_7407 = class37;
	aClass37_7410 = class37_16_;
	anInt7406 = -453813117 * i_17_;
    }
    
    boolean method9158(int i, byte[] is, int i_18_, boolean bool, byte i_19_) {
	synchronized (aClass37_7407) {
	    boolean bool_20_;
	    try {
		int i_21_;
		if (bool) {
		    if (aClass37_7410.method1001((byte) 17)
			< (long) (i * 6 + 6)) {
			boolean bool_22_ = false;
			return bool_22_;
		    }
		    aClass37_7410.method986((long) (6 * i));
		    aClass37_7410.method983(aByteArray7408, 0, 6, 905585239);
		    i_21_ = (((aByteArray7408[3] & 0xff) << 16)
			     + ((aByteArray7408[4] & 0xff) << 8)
			     + (aByteArray7408[5] & 0xff));
		    if (i_21_ <= 0
			|| ((long) i_21_
			    > aClass37_7407.method1001((byte) 17) / 520L)) {
			boolean bool_23_ = false;
			return bool_23_;
		    }
		} else {
		    i_21_ = (int) ((aClass37_7407.method1001((byte) 17) + 519L)
				   / 520L);
		    if (0 == i_21_)
			i_21_ = 1;
		}
		aByteArray7408[0] = (byte) (i_18_ >> 16);
		aByteArray7408[1] = (byte) (i_18_ >> 8);
		aByteArray7408[2] = (byte) i_18_;
		aByteArray7408[3] = (byte) (i_21_ >> 16);
		aByteArray7408[4] = (byte) (i_21_ >> 8);
		aByteArray7408[5] = (byte) i_21_;
		aClass37_7410.method986((long) (6 * i));
		aClass37_7410.method987(aByteArray7408, 0, 6, (byte) 1);
		int i_24_ = 0;
		int i_25_ = 0;
		while (i_24_ < i_18_) {
		    int i_26_ = 0;
		    if (bool) {
			aClass37_7407.method986((long) i_21_ * 520L);
			int i_27_;
			int i_28_;
			int i_29_;
			if (i > 65535) {
			    try {
				aClass37_7407.method983(aByteArray7408, 0, 10,
							533010586);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_27_ = ((aByteArray7408[3] & 0xff)
				     + (((aByteArray7408[2] & 0xff) << 8)
					+ (((aByteArray7408[0] & 0xff) << 24)
					   + ((aByteArray7408[1] & 0xff)
					      << 16))));
			    i_28_ = (((aByteArray7408[4] & 0xff) << 8)
				     + (aByteArray7408[5] & 0xff));
			    i_26_ = ((aByteArray7408[8] & 0xff)
				     + (((aByteArray7408[7] & 0xff) << 8)
					+ ((aByteArray7408[6] & 0xff) << 16)));
			    i_29_ = aByteArray7408[9] & 0xff;
			} else {
			    try {
				aClass37_7407.method983(aByteArray7408, 0, 8,
							-1810659321);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_27_ = (((aByteArray7408[0] & 0xff) << 8)
				     + (aByteArray7408[1] & 0xff));
			    i_28_ = (((aByteArray7408[2] & 0xff) << 8)
				     + (aByteArray7408[3] & 0xff));
			    i_26_ = (((aByteArray7408[5] & 0xff) << 8)
				     + ((aByteArray7408[4] & 0xff) << 16)
				     + (aByteArray7408[6] & 0xff));
			    i_29_ = aByteArray7408[7] & 0xff;
			}
			if (i_27_ != i || i_25_ != i_28_
			    || i_29_ != -1309804595 * anInt7409) {
			    boolean bool_30_ = false;
			    return bool_30_;
			}
			if (i_26_ < 0
			    || ((long) i_26_
				> (aClass37_7407.method1001((byte) 17)
				   / 520L))) {
			    boolean bool_31_ = false;
			    return bool_31_;
			}
		    }
		    if (0 == i_26_) {
			bool = false;
			i_26_ = (int) ((aClass37_7407.method1001((byte) 17)
					+ 519L)
				       / 520L);
			if (i_26_ == 0)
			    i_26_++;
			if (i_21_ == i_26_)
			    i_26_++;
		    }
		    if (i > 65535) {
			if (i_18_ - i_24_ <= 510)
			    i_26_ = 0;
			aByteArray7408[0] = (byte) (i >> 24);
			aByteArray7408[1] = (byte) (i >> 16);
			aByteArray7408[2] = (byte) (i >> 8);
			aByteArray7408[3] = (byte) i;
			aByteArray7408[4] = (byte) (i_25_ >> 8);
			aByteArray7408[5] = (byte) i_25_;
			aByteArray7408[6] = (byte) (i_26_ >> 16);
			aByteArray7408[7] = (byte) (i_26_ >> 8);
			aByteArray7408[8] = (byte) i_26_;
			aByteArray7408[9] = (byte) (-1309804595 * anInt7409);
			aClass37_7407.method986((long) i_21_ * 520L);
			aClass37_7407.method987(aByteArray7408, 0, 10,
						(byte) 1);
			int i_32_ = i_18_ - i_24_;
			if (i_32_ > 510)
			    i_32_ = 510;
			aClass37_7407.method987(is, i_24_, i_32_, (byte) 1);
			i_24_ += i_32_;
		    } else {
			if (i_18_ - i_24_ <= 512)
			    i_26_ = 0;
			aByteArray7408[0] = (byte) (i >> 8);
			aByteArray7408[1] = (byte) i;
			aByteArray7408[2] = (byte) (i_25_ >> 8);
			aByteArray7408[3] = (byte) i_25_;
			aByteArray7408[4] = (byte) (i_26_ >> 16);
			aByteArray7408[5] = (byte) (i_26_ >> 8);
			aByteArray7408[6] = (byte) i_26_;
			aByteArray7408[7] = (byte) (-1309804595 * anInt7409);
			aClass37_7407.method986(520L * (long) i_21_);
			aClass37_7407.method987(aByteArray7408, 0, 8,
						(byte) 1);
			int i_33_ = i_18_ - i_24_;
			if (i_33_ > 512)
			    i_33_ = 512;
			aClass37_7407.method987(is, i_24_, i_33_, (byte) 1);
			i_24_ += i_33_;
		    }
		    i_21_ = i_26_;
		    i_25_++;
		}
		bool_20_ = true;
	    } catch (IOException ioexception) {
		boolean bool_34_ = false;
		return bool_34_;
	    }
	    return bool_20_;
	}
    }
    
    public String toString() {
	return new StringBuilder().append("").append
		   (anInt7409 * -1309804595).toString();
    }
    
    public boolean method9159(int i, byte[] is, int i_35_, byte i_36_) {
	synchronized (aClass37_7407) {
	    if (i_35_ < 0 || i_35_ > anInt7406 * 1695863339)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("").append
						       (-1309804595
							* anInt7409)
						       .append
						       (',').append
						       (i).append
						       (',').append
						       (i_35_).toString());
	    boolean bool = method9158(i, is, i_35_, true, (byte) -32);
	    if (!bool)
		bool = method9158(i, is, i_35_, false, (byte) -82);
	    boolean bool_37_ = bool;
	    return bool_37_;
	}
    }
    
    public String method9160() {
	return new StringBuilder().append("").append
		   (anInt7409 * -1309804595).toString();
    }
    
    public byte[] method9161(int i) {
	synchronized (aClass37_7407) {
	    byte[] is;
	    try {
		if (aClass37_7410.method1001((byte) 17) < (long) (i * 6 + 6)) {
		    byte[] is_38_ = null;
		    return is_38_;
		}
		aClass37_7410.method986((long) (6 * i));
		aClass37_7410.method983(aByteArray7408, 0, 6, 16014067);
		int i_39_ = (((aByteArray7408[1] & 0xff) << 8)
			     + ((aByteArray7408[0] & 0xff) << 16)
			     + (aByteArray7408[2] & 0xff));
		int i_40_ = ((aByteArray7408[5] & 0xff)
			     + (((aByteArray7408[3] & 0xff) << 16)
				+ ((aByteArray7408[4] & 0xff) << 8)));
		if (i_39_ < 0 || i_39_ > 1695863339 * anInt7406) {
		    byte[] is_41_ = null;
		    return is_41_;
		}
		if (i_40_ <= 0
		    || ((long) i_40_
			> aClass37_7407.method1001((byte) 17) / 520L)) {
		    byte[] is_42_ = null;
		    return is_42_;
		}
		byte[] is_43_ = new byte[i_39_];
		int i_44_ = 0;
		int i_45_ = 0;
		while (i_44_ < i_39_) {
		    if (0 == i_40_) {
			byte[] is_46_ = null;
			return is_46_;
		    }
		    aClass37_7407.method986((long) i_40_ * 520L);
		    int i_47_ = i_39_ - i_44_;
		    int i_48_;
		    int i_49_;
		    int i_50_;
		    int i_51_;
		    int i_52_;
		    if (i > 65535) {
			if (i_47_ > 510)
			    i_47_ = 510;
			i_48_ = 10;
			aClass37_7407.method983(aByteArray7408, 0,
						i_47_ + i_48_, -1414080329);
			i_49_ = (((aByteArray7408[0] & 0xff) << 24)
				 + ((aByteArray7408[1] & 0xff) << 16)
				 + ((aByteArray7408[2] & 0xff) << 8)
				 + (aByteArray7408[3] & 0xff));
			i_50_ = (((aByteArray7408[4] & 0xff) << 8)
				 + (aByteArray7408[5] & 0xff));
			i_51_ = (((aByteArray7408[6] & 0xff) << 16)
				 + ((aByteArray7408[7] & 0xff) << 8)
				 + (aByteArray7408[8] & 0xff));
			i_52_ = aByteArray7408[9] & 0xff;
		    } else {
			if (i_47_ > 512)
			    i_47_ = 512;
			i_48_ = 8;
			aClass37_7407.method983(aByteArray7408, 0,
						i_48_ + i_47_, -332893304);
			i_49_ = (((aByteArray7408[0] & 0xff) << 8)
				 + (aByteArray7408[1] & 0xff));
			i_50_ = ((aByteArray7408[3] & 0xff)
				 + ((aByteArray7408[2] & 0xff) << 8));
			i_51_ = (((aByteArray7408[4] & 0xff) << 16)
				 + ((aByteArray7408[5] & 0xff) << 8)
				 + (aByteArray7408[6] & 0xff));
			i_52_ = aByteArray7408[7] & 0xff;
		    }
		    if (i_49_ != i || i_50_ != i_45_
			|| i_52_ != -1309804595 * anInt7409) {
			byte[] is_53_ = null;
			return is_53_;
		    }
		    if (i_51_ < 0
			|| ((long) i_51_
			    > aClass37_7407.method1001((byte) 17) / 520L)) {
			byte[] is_54_ = null;
			return is_54_;
		    }
		    int i_55_ = i_48_ + i_47_;
		    for (int i_56_ = i_48_; i_56_ < i_55_; i_56_++)
			is_43_[i_44_++] = aByteArray7408[i_56_];
		    i_40_ = i_51_;
		    i_45_++;
		}
		is = is_43_;
	    } catch (IOException ioexception) {
		byte[] is_57_ = null;
		return is_57_;
	    }
	    return is;
	}
    }
    
    public byte[] method9162(int i, byte i_58_) {
	synchronized (aClass37_7407) {
	    byte[] is;
	    try {
		if (aClass37_7410.method1001((byte) 17) < (long) (i * 6 + 6)) {
		    byte[] is_59_ = null;
		    return is_59_;
		}
		aClass37_7410.method986((long) (6 * i));
		aClass37_7410.method983(aByteArray7408, 0, 6, 157281062);
		int i_60_ = (((aByteArray7408[1] & 0xff) << 8)
			     + ((aByteArray7408[0] & 0xff) << 16)
			     + (aByteArray7408[2] & 0xff));
		int i_61_ = ((aByteArray7408[5] & 0xff)
			     + (((aByteArray7408[3] & 0xff) << 16)
				+ ((aByteArray7408[4] & 0xff) << 8)));
		if (i_60_ < 0 || i_60_ > 1695863339 * anInt7406) {
		    byte[] is_62_ = null;
		    return is_62_;
		}
		if (i_61_ <= 0
		    || ((long) i_61_
			> aClass37_7407.method1001((byte) 17) / 520L)) {
		    byte[] is_63_ = null;
		    return is_63_;
		}
		byte[] is_64_ = new byte[i_60_];
		int i_65_ = 0;
		int i_66_ = 0;
		while (i_65_ < i_60_) {
		    if (0 == i_61_) {
			byte[] is_67_ = null;
			return is_67_;
		    }
		    aClass37_7407.method986((long) i_61_ * 520L);
		    int i_68_ = i_60_ - i_65_;
		    int i_69_;
		    int i_70_;
		    int i_71_;
		    int i_72_;
		    int i_73_;
		    if (i > 65535) {
			if (i_68_ > 510)
			    i_68_ = 510;
			i_69_ = 10;
			aClass37_7407.method983(aByteArray7408, 0,
						i_68_ + i_69_, 2069835310);
			i_70_ = (((aByteArray7408[0] & 0xff) << 24)
				 + ((aByteArray7408[1] & 0xff) << 16)
				 + ((aByteArray7408[2] & 0xff) << 8)
				 + (aByteArray7408[3] & 0xff));
			i_71_ = (((aByteArray7408[4] & 0xff) << 8)
				 + (aByteArray7408[5] & 0xff));
			i_72_ = (((aByteArray7408[6] & 0xff) << 16)
				 + ((aByteArray7408[7] & 0xff) << 8)
				 + (aByteArray7408[8] & 0xff));
			i_73_ = aByteArray7408[9] & 0xff;
		    } else {
			if (i_68_ > 512)
			    i_68_ = 512;
			i_69_ = 8;
			aClass37_7407.method983(aByteArray7408, 0,
						i_69_ + i_68_, 1536230704);
			i_70_ = (((aByteArray7408[0] & 0xff) << 8)
				 + (aByteArray7408[1] & 0xff));
			i_71_ = ((aByteArray7408[3] & 0xff)
				 + ((aByteArray7408[2] & 0xff) << 8));
			i_72_ = (((aByteArray7408[4] & 0xff) << 16)
				 + ((aByteArray7408[5] & 0xff) << 8)
				 + (aByteArray7408[6] & 0xff));
			i_73_ = aByteArray7408[7] & 0xff;
		    }
		    if (i_70_ != i || i_71_ != i_66_
			|| i_73_ != -1309804595 * anInt7409) {
			byte[] is_74_ = null;
			return is_74_;
		    }
		    if (i_72_ < 0
			|| ((long) i_72_
			    > aClass37_7407.method1001((byte) 17) / 520L)) {
			byte[] is_75_ = null;
			return is_75_;
		    }
		    int i_76_ = i_69_ + i_68_;
		    for (int i_77_ = i_69_; i_77_ < i_76_; i_77_++)
			is_64_[i_65_++] = aByteArray7408[i_77_];
		    i_61_ = i_72_;
		    i_66_++;
		}
		is = is_64_;
	    } catch (IOException ioexception) {
		byte[] is_78_ = null;
		return is_78_;
	    }
	    return is;
	}
    }
    
    public byte[] method9163(int i) {
	synchronized (aClass37_7407) {
	    byte[] is;
	    try {
		if (aClass37_7410.method1001((byte) 17) < (long) (i * 6 + 6)) {
		    byte[] is_79_ = null;
		    return is_79_;
		}
		aClass37_7410.method986((long) (6 * i));
		aClass37_7410.method983(aByteArray7408, 0, 6, -1226260465);
		int i_80_ = (((aByteArray7408[1] & 0xff) << 8)
			     + ((aByteArray7408[0] & 0xff) << 16)
			     + (aByteArray7408[2] & 0xff));
		int i_81_ = ((aByteArray7408[5] & 0xff)
			     + (((aByteArray7408[3] & 0xff) << 16)
				+ ((aByteArray7408[4] & 0xff) << 8)));
		if (i_80_ < 0 || i_80_ > 1695863339 * anInt7406) {
		    byte[] is_82_ = null;
		    return is_82_;
		}
		if (i_81_ <= 0
		    || ((long) i_81_
			> aClass37_7407.method1001((byte) 17) / 520L)) {
		    byte[] is_83_ = null;
		    return is_83_;
		}
		byte[] is_84_ = new byte[i_80_];
		int i_85_ = 0;
		int i_86_ = 0;
		while (i_85_ < i_80_) {
		    if (0 == i_81_) {
			byte[] is_87_ = null;
			return is_87_;
		    }
		    aClass37_7407.method986((long) i_81_ * 520L);
		    int i_88_ = i_80_ - i_85_;
		    int i_89_;
		    int i_90_;
		    int i_91_;
		    int i_92_;
		    int i_93_;
		    if (i > 65535) {
			if (i_88_ > 510)
			    i_88_ = 510;
			i_89_ = 10;
			aClass37_7407.method983(aByteArray7408, 0,
						i_88_ + i_89_, -285854090);
			i_90_ = (((aByteArray7408[0] & 0xff) << 24)
				 + ((aByteArray7408[1] & 0xff) << 16)
				 + ((aByteArray7408[2] & 0xff) << 8)
				 + (aByteArray7408[3] & 0xff));
			i_91_ = (((aByteArray7408[4] & 0xff) << 8)
				 + (aByteArray7408[5] & 0xff));
			i_92_ = (((aByteArray7408[6] & 0xff) << 16)
				 + ((aByteArray7408[7] & 0xff) << 8)
				 + (aByteArray7408[8] & 0xff));
			i_93_ = aByteArray7408[9] & 0xff;
		    } else {
			if (i_88_ > 512)
			    i_88_ = 512;
			i_89_ = 8;
			aClass37_7407.method983(aByteArray7408, 0,
						i_89_ + i_88_, 2061727082);
			i_90_ = (((aByteArray7408[0] & 0xff) << 8)
				 + (aByteArray7408[1] & 0xff));
			i_91_ = ((aByteArray7408[3] & 0xff)
				 + ((aByteArray7408[2] & 0xff) << 8));
			i_92_ = (((aByteArray7408[4] & 0xff) << 16)
				 + ((aByteArray7408[5] & 0xff) << 8)
				 + (aByteArray7408[6] & 0xff));
			i_93_ = aByteArray7408[7] & 0xff;
		    }
		    if (i_90_ != i || i_91_ != i_86_
			|| i_93_ != -1309804595 * anInt7409) {
			byte[] is_94_ = null;
			return is_94_;
		    }
		    if (i_92_ < 0
			|| ((long) i_92_
			    > aClass37_7407.method1001((byte) 17) / 520L)) {
			byte[] is_95_ = null;
			return is_95_;
		    }
		    int i_96_ = i_89_ + i_88_;
		    for (int i_97_ = i_89_; i_97_ < i_96_; i_97_++)
			is_84_[i_85_++] = aByteArray7408[i_97_];
		    i_81_ = i_92_;
		    i_86_++;
		}
		is = is_84_;
	    } catch (IOException ioexception) {
		byte[] is_98_ = null;
		return is_98_;
	    }
	    return is;
	}
    }
    
    public String method9164() {
	return new StringBuilder().append("").append
		   (anInt7409 * -1309804595).toString();
    }
    
    public boolean method9165(int i, byte[] is, int i_99_) {
	synchronized (aClass37_7407) {
	    if (i_99_ < 0 || i_99_ > anInt7406 * 1695863339)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("").append
						       (-1309804595
							* anInt7409)
						       .append
						       (',').append
						       (i).append
						       (',').append
						       (i_99_).toString());
	    boolean bool = method9158(i, is, i_99_, true, (byte) -43);
	    if (!bool)
		bool = method9158(i, is, i_99_, false, (byte) -60);
	    boolean bool_100_ = bool;
	    return bool_100_;
	}
    }
    
    boolean method9166(int i, byte[] is, int i_101_, boolean bool) {
	synchronized (aClass37_7407) {
	    boolean bool_102_;
	    try {
		int i_103_;
		if (bool) {
		    if (aClass37_7410.method1001((byte) 17)
			< (long) (i * 6 + 6)) {
			boolean bool_104_ = false;
			return bool_104_;
		    }
		    aClass37_7410.method986((long) (6 * i));
		    aClass37_7410.method983(aByteArray7408, 0, 6, 257411744);
		    i_103_ = (((aByteArray7408[3] & 0xff) << 16)
			      + ((aByteArray7408[4] & 0xff) << 8)
			      + (aByteArray7408[5] & 0xff));
		    if (i_103_ <= 0
			|| ((long) i_103_
			    > aClass37_7407.method1001((byte) 17) / 520L)) {
			boolean bool_105_ = false;
			return bool_105_;
		    }
		} else {
		    i_103_
			= (int) ((aClass37_7407.method1001((byte) 17) + 519L)
				 / 520L);
		    if (0 == i_103_)
			i_103_ = 1;
		}
		aByteArray7408[0] = (byte) (i_101_ >> 16);
		aByteArray7408[1] = (byte) (i_101_ >> 8);
		aByteArray7408[2] = (byte) i_101_;
		aByteArray7408[3] = (byte) (i_103_ >> 16);
		aByteArray7408[4] = (byte) (i_103_ >> 8);
		aByteArray7408[5] = (byte) i_103_;
		aClass37_7410.method986((long) (6 * i));
		aClass37_7410.method987(aByteArray7408, 0, 6, (byte) 1);
		int i_106_ = 0;
		int i_107_ = 0;
		while (i_106_ < i_101_) {
		    int i_108_ = 0;
		    if (bool) {
			aClass37_7407.method986((long) i_103_ * 520L);
			int i_109_;
			int i_110_;
			int i_111_;
			if (i > 65535) {
			    try {
				aClass37_7407.method983(aByteArray7408, 0, 10,
							863034157);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_109_ = ((aByteArray7408[3] & 0xff)
				      + (((aByteArray7408[2] & 0xff) << 8)
					 + (((aByteArray7408[0] & 0xff) << 24)
					    + ((aByteArray7408[1] & 0xff)
					       << 16))));
			    i_110_ = (((aByteArray7408[4] & 0xff) << 8)
				      + (aByteArray7408[5] & 0xff));
			    i_108_
				= ((aByteArray7408[8] & 0xff)
				   + (((aByteArray7408[7] & 0xff) << 8)
				      + ((aByteArray7408[6] & 0xff) << 16)));
			    i_111_ = aByteArray7408[9] & 0xff;
			} else {
			    try {
				aClass37_7407.method983(aByteArray7408, 0, 8,
							1925421027);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_109_ = (((aByteArray7408[0] & 0xff) << 8)
				      + (aByteArray7408[1] & 0xff));
			    i_110_ = (((aByteArray7408[2] & 0xff) << 8)
				      + (aByteArray7408[3] & 0xff));
			    i_108_ = (((aByteArray7408[5] & 0xff) << 8)
				      + ((aByteArray7408[4] & 0xff) << 16)
				      + (aByteArray7408[6] & 0xff));
			    i_111_ = aByteArray7408[7] & 0xff;
			}
			if (i_109_ != i || i_107_ != i_110_
			    || i_111_ != -1309804595 * anInt7409) {
			    boolean bool_112_ = false;
			    return bool_112_;
			}
			if (i_108_ < 0
			    || ((long) i_108_
				> (aClass37_7407.method1001((byte) 17)
				   / 520L))) {
			    boolean bool_113_ = false;
			    return bool_113_;
			}
		    }
		    if (0 == i_108_) {
			bool = false;
			i_108_ = (int) ((aClass37_7407.method1001((byte) 17)
					 + 519L)
					/ 520L);
			if (i_108_ == 0)
			    i_108_++;
			if (i_103_ == i_108_)
			    i_108_++;
		    }
		    if (i > 65535) {
			if (i_101_ - i_106_ <= 510)
			    i_108_ = 0;
			aByteArray7408[0] = (byte) (i >> 24);
			aByteArray7408[1] = (byte) (i >> 16);
			aByteArray7408[2] = (byte) (i >> 8);
			aByteArray7408[3] = (byte) i;
			aByteArray7408[4] = (byte) (i_107_ >> 8);
			aByteArray7408[5] = (byte) i_107_;
			aByteArray7408[6] = (byte) (i_108_ >> 16);
			aByteArray7408[7] = (byte) (i_108_ >> 8);
			aByteArray7408[8] = (byte) i_108_;
			aByteArray7408[9] = (byte) (-1309804595 * anInt7409);
			aClass37_7407.method986((long) i_103_ * 520L);
			aClass37_7407.method987(aByteArray7408, 0, 10,
						(byte) 1);
			int i_114_ = i_101_ - i_106_;
			if (i_114_ > 510)
			    i_114_ = 510;
			aClass37_7407.method987(is, i_106_, i_114_, (byte) 1);
			i_106_ += i_114_;
		    } else {
			if (i_101_ - i_106_ <= 512)
			    i_108_ = 0;
			aByteArray7408[0] = (byte) (i >> 8);
			aByteArray7408[1] = (byte) i;
			aByteArray7408[2] = (byte) (i_107_ >> 8);
			aByteArray7408[3] = (byte) i_107_;
			aByteArray7408[4] = (byte) (i_108_ >> 16);
			aByteArray7408[5] = (byte) (i_108_ >> 8);
			aByteArray7408[6] = (byte) i_108_;
			aByteArray7408[7] = (byte) (-1309804595 * anInt7409);
			aClass37_7407.method986(520L * (long) i_103_);
			aClass37_7407.method987(aByteArray7408, 0, 8,
						(byte) 1);
			int i_115_ = i_101_ - i_106_;
			if (i_115_ > 512)
			    i_115_ = 512;
			aClass37_7407.method987(is, i_106_, i_115_, (byte) 1);
			i_106_ += i_115_;
		    }
		    i_103_ = i_108_;
		    i_107_++;
		}
		bool_102_ = true;
	    } catch (IOException ioexception) {
		boolean bool_116_ = false;
		return bool_116_;
	    }
	    return bool_102_;
	}
    }
    
    static final void method9167(Class683 class683, int i) {
	if ((class683.anIntArray8661
	     [(class683.anInt8662 -= 1552651121) * 501271953])
	    == 0)
	    class683.anInt8663
		+= (class683.anIntArray8647[class683.anInt8663 * 1931825055]
		    * -1827402657);
    }
}
