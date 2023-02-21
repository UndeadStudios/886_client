/* Class525_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.math.BigInteger;

public class RSBuffer extends Class525
{
    static int[] anIntArray10830 = new int[256];
    public static final int anInt10831 = 5000;
    public byte[] buffer;
    public static long[] aLongArray10833;
    static final long aLong10834 = -3932672073523589310L;
    public int pos;
    public static final int anInt10836 = 100;
    static final int anInt10837 = -306674912;
    
    public void method16599(int[] is, int i, int i_0_) {
	int i_1_ = -1133521593 * pos;
	pos = i * 339428471;
	int i_2_ = (i_0_ - i) / 8;
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    int i_4_ = readInt(876232699);
	    int i_5_ = readInt(938233498);
	    int i_6_ = -957401312;
	    int i_7_ = -1640531527;
	    int i_8_ = 32;
	    while (i_8_-- > 0) {
		i_5_ -= (i_4_ + (i_4_ << 4 ^ i_4_ >>> 5)
			 ^ is[i_6_ >>> 11 & 0x3] + i_6_);
		i_6_ -= i_7_;
		i_4_
		    -= i_5_ + (i_5_ << 4 ^ i_5_ >>> 5) ^ i_6_ + is[i_6_ & 0x3];
	    }
	    pos -= -1579539528;
	    method16605(i_4_, -672980078);
	    method16605(i_5_, -1474395138);
	}
	pos = 339428471 * i_1_;
    }
    
    public RSBuffer(int i, boolean bool) {
	buffer = Class707.method14309(i, bool, 835300702);
    }
    
    public RSBuffer(byte[] is) {
	buffer = is;
	pos = 0;
    }
    
    public int method16600() {
	pos += 1357713884;
	return ((buffer[-1133521593 * pos - 4] & 255)
		+ (((buffer[pos * -1133521593 - 1] & 255)
		    << 24)
		   + ((buffer[-1133521593 * pos - 2] & 255)
		      << 16)
		   + ((buffer[pos * -1133521593 - 3] & 255)
		      << 8)));
    }
    
    public void method16601(long l) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 40);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 32);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) l;
    }
    
    public void method16602(int i, int i_9_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    public long method16603(int i) {
	long l = (long) readInt(2100149824) & 0xffffffffL;
	long l_10_ = (long) readInt(2069970214) & 0xffffffffL;
	return (l << 32) + l_10_;
    }
    
    public void method16604(int i, byte i_11_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    public void method16605(int i, int i_12_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    public void method16606(int i, int i_13_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
    }
    
    public int method16607(int i) {
	return ((buffer[(pos += 339428471) * -1133521593 - 1]
		 - 128)
		& 255);
    }
    
    public long method16608(int i) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	int i_14_ = i * 8;
	long l = 0L;
	for (/**/; i_14_ >= 0; i_14_ -= 8)
	    l |= ((long) (buffer
			  [(pos += 339428471) * -1133521593 - 1])
		  & 0xffL) << i_14_;
	return l;
    }
    
    public void method16609(long l) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 56);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 48);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 40);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 32);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) l;
    }
    
    public void method16610(long l, int i, int i_15_) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	for (int i_16_ = 8 * i; i_16_ >= 0; i_16_ -= 8)
	    buffer[(pos += 339428471) * -1133521593 - 1]
		= (byte) (int) (l >> i_16_);
    }
    
    public void method16611(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i + 128);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16612(String string, int i) {
	int i_17_ = string.indexOf('\0');
	if (i_17_ >= 0)
	    throw new IllegalArgumentException("");
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
	pos
	    += Class594.method9831(string, 0, string.length(), buffer,
				   pos * -1133521593,
				   -1089111321) * 339428471;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
    }
    
    public void method16613(CharSequence charsequence, int i) {
	int i_18_ = Class301.method5402(charsequence, 1434602089);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
	method16621(i_18_, 16711935);
	pos
	    += Class281.method5198(buffer, -1133521593 * pos,
				   charsequence, 613333527) * 339428471;
    }
    
    public void method16614(byte[] is, int i, int i_19_, int i_20_) {
	for (int i_21_ = i; i_21_ < i + i_19_; i_21_++)
	    buffer[(pos += 339428471) * -1133521593 - 1]
		= is[i_21_];
    }
    
    public void method16615(int i) {
	if (i < 64 && i >= -64)
	    method16735(i + 64, -2005355132);
	else if (i < 16384 && i >= -16384)
	    method16602(i + 49152, 882928925);
	else
	    throw new IllegalArgumentException();
    }
    
    public void method16616(int i, int i_22_) {
	if (i < 0 || i > 65535)
	    throw new IllegalArgumentException();
	buffer[pos * -1133521593 - i - 2] = (byte) (i >> 8);
	buffer[-1133521593 * pos - i - 1] = (byte) i;
    }
    
    public void method16617(int i, byte i_23_) {
	if (i < 0 || i > 255)
	    throw new IllegalArgumentException();
	buffer[-1133521593 * pos - i - 1] = (byte) i;
    }
    
    public void method16618(int[] is, int i, int i_24_) {
	int i_25_ = -1133521593 * pos;
	pos = i * 339428471;
	int i_26_ = (i_24_ - i) / 8;
	for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
	    int i_28_ = readInt(1355215476);
	    int i_29_ = readInt(1274707943);
	    int i_30_ = 0;
	    int i_31_ = -1640531527;
	    int i_32_ = 32;
	    while (i_32_-- > 0) {
		i_28_ += ((i_29_ << 4 ^ i_29_ >>> 5) + i_29_
			  ^ is[i_30_ & 0x3] + i_30_);
		i_30_ += i_31_;
		i_29_ += ((i_28_ << 4 ^ i_28_ >>> 5) + i_28_
			  ^ i_30_ + is[i_30_ >>> 11 & 0x3]);
	    }
	    pos -= -1579539528;
	    method16605(i_28_, -2097577078);
	    method16605(i_29_, -619880743);
	}
	pos = 339428471 * i_25_;
    }
    
    public int method16619() {
	pos += 1357713884;
	return (((buffer[-1133521593 * pos - 4] & 255) << 16)
		+ ((buffer[pos * -1133521593 - 3] & 255)
		   << 24)
		+ ((buffer[pos * -1133521593 - 1] & 255) << 8)
		+ (buffer[pos * -1133521593 - 2] & 255));
    }
    
    public void method16620(int i, byte i_33_) {
	if (i < -1)
	    throw new IllegalArgumentException();
	if (i == -1)
	    method16602(32767, 1082682341);
	else if (i < 32767)
	    method16602(i, 1308515803);
	else {
	    method16605(i, -1362005007);
	    buffer[-1133521593 * pos - 4] |= 0x80;
	}
    }
    
    void method16621(int i, int i_34_) {
	if ((i & ~0x7f) != 0) {
	    if ((i & ~0x3fff) != 0) {
		if (0 != (i & ~0x1fffff)) {
		    if (0 != (i & ~0xfffffff))
			method16735(i >>> 28 | 0x80, -674249883);
		    method16735(i >>> 21 | 0x80, -1282739820);
		}
		method16735(i >>> 14 | 0x80, -1963162538);
	    }
	    method16735(i >>> 7 | 0x80, -2006572434);
	}
	method16735(i & 0x7f, -805142549);
    }
    
    public void method16622(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (128 - i);
    }
    
    public int method16623(int i) {
	int i_35_ = buffer[pos * -1133521593] & 255;
	if (i_35_ < 128)
	    return readUnsignedByte(879328864) - 1;
	return readUnsignedShort((byte) 88) - 32769;
    }
    
    public int method16624(int i) {
	return (0 - (buffer
		     [(pos += 339428471) * -1133521593 - 1])
		& 255);
    }
    
    public int method16625(byte i) {
	pos += 678856942;
	int i_36_ = ((buffer[-1133521593 * pos - 1] & 255)
		     + ((buffer[pos * -1133521593 - 2] & 255)
			<< 8));
	if (i_36_ > 32767)
	    i_36_ -= 65536;
	return i_36_;
    }
    
    public long method16626() {
	long l = (long) readInt(1664609035) & 0xffffffffL;
	long l_37_ = (long) readInt(2115225392) & 0xffffffffL;
	return (l << 32) + l_37_;
    }
    
    public void method16627(int i) {
	if (null != buffer)
	    Class707.method14308(buffer, (byte) -46);
	buffer = null;
    }
    
    public void method16628(long l) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 32);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) l;
    }
    
    public float method16629() {
	return Float.intBitsToFloat(readInt(1310244237));
    }
    
    public int method16630() {
	int i = buffer[pos * -1133521593] & 255;
	if (i < 128)
	    return readUnsignedByte(1086266149) - 1;
	return readUnsignedShort((byte) 26) - 32769;
    }
    
    public long method16631(int i) {
	long l = (long) readUnsignedShort((byte) 41) & 0xffffffffL;
	long l_38_ = (long) readInt(1839744347) & 0xffffffffL;
	return l_38_ + (l << 32);
    }
    
    public void method16632(int i) {
	if (i < 0 || i > 255)
	    throw new IllegalArgumentException();
	buffer[-1133521593 * pos - i - 1] = (byte) i;
    }
    
    public long method16633(int i, int i_39_) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	int i_40_ = i * 8;
	long l = 0L;
	for (/**/; i_40_ >= 0; i_40_ -= 8)
	    l |= ((long) (buffer
			  [(pos += 339428471) * -1133521593 - 1])
		  & 0xffL) << i_40_;
	return l;
    }
    
    public float method16634(int i) {
	return Float.intBitsToFloat(readInt(1976756241));
    }
    
    public String method16635(int i) {
	if (buffer[-1133521593 * pos] == 0) {
	    pos += 339428471;
	    return null;
	}
	return readString((byte) 71);
    }
    
    public String readString(byte i) {
	int i_41_ = pos * -1133521593;
	while (buffer[(pos += 339428471) * -1133521593 - 1]
	       != 0) {
	    /* empty */
	}
	int i_42_ = pos * -1133521593 - i_41_ - 1;
	if (i_42_ == 0)
	    return "";
	return Class392.method6482(buffer, i_41_, i_42_, 2137496048);
    }
    
    public String method16637(int i) {
	byte i_43_
	    = buffer[(pos += 339428471) * -1133521593 - 1];
	if (0 != i_43_)
	    throw new IllegalStateException("");
	int i_44_ = -1133521593 * pos;
	while (buffer[(pos += 339428471) * -1133521593 - 1]
	       != 0) {
	    /* empty */
	}
	int i_45_ = -1133521593 * pos - i_44_ - 1;
	if (0 == i_45_)
	    return "";
	return Class392.method6482(buffer, i_44_, i_45_, 1927790934);
    }
    
    public String method16638(int i) {
	byte i_46_
	    = buffer[(pos += 339428471) * -1133521593 - 1];
	if (i_46_ != 0)
	    throw new IllegalStateException("");
	int i_47_ = method16813((byte) 127);
	if (i_47_ + pos * -1133521593 > buffer.length)
	    throw new IllegalStateException("");
	String string = Class531_Sub3.method15943(buffer,
						  -1133521593 * pos,
						  i_47_, (byte) 31);
	pos += 339428471 * i_47_;
	return string;
    }
    
    public void method16639(byte[] is, int i, int i_48_, int i_49_) {
	for (int i_50_ = i; i_50_ < i_48_ + i; i_50_++)
	    is[i_50_]
		= buffer[(pos += 339428471) * -1133521593 - 1];
    }
    
    public int method16640(int i) {
	int i_51_ = buffer[-1133521593 * pos] & 255;
	if (i_51_ < 128)
	    return readUnsignedByte(138125733) - 64;
	return readUnsignedShort((byte) 1) - 49152;
    }
    
    public static int method16641(String string) {
	return string.length() + 1;
    }
    
    public void method16642(int i, byte i_52_) {
	if (i < 64 && i >= -64)
	    method16735(i + 64, -790558747);
	else if (i < 16384 && i >= -16384)
	    method16602(i + 49152, 1235065494);
	else
	    throw new IllegalArgumentException();
    }
    
    public void method16643(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
    }
    
    public void method16644(int i) {
	if (i < 0 || i > 255)
	    throw new IllegalArgumentException();
	buffer[-1133521593 * pos - i - 1] = (byte) i;
    }
    
    public int readBigSmart(int i) {
	if (buffer[-1133521593 * pos] < 0)
	    return readInt(1261023599) & 0x7fffffff;
	int i_53_ = readUnsignedShort((byte) 56);
	if (i_53_ == 32767)
	    return -1;
	return i_53_;
    }
    
    public void method16646(RSBuffer class525_sub38_54_, int i) {
	method16614(class525_sub38_54_.buffer, 0,
		    -1133521593 * class525_sub38_54_.pos, 1080425538);
    }
    
    public int method16647(short i) {
	int i_55_ = 0;
	int i_56_ = 0;
	int i_57_;
	do {
	    i_57_ = readUnsignedByte(1920459122);
	    i_55_ |= (i_57_ & 0x7f) << i_56_;
	    i_56_ += 7;
	} while (i_57_ > 127);
	return i_55_;
    }
    
    public int method16648() {
	pos += 1357713884;
	return (((buffer[pos * -1133521593 - 4] & 255) << 24)
		+ ((buffer[pos * -1133521593 - 3] & 255)
		   << 16)
		+ ((buffer[pos * -1133521593 - 2] & 255) << 8)
		+ (buffer[-1133521593 * pos - 1] & 255));
    }
    
    public void method16649(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
    }
    
    public void method16650(int[] is, int i, int i_58_, byte i_59_) {
	int i_60_ = -1133521593 * pos;
	pos = i * 339428471;
	int i_61_ = (i_58_ - i) / 8;
	for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
	    int i_63_ = readInt(1984124188);
	    int i_64_ = readInt(1309424124);
	    int i_65_ = 0;
	    int i_66_ = -1640531527;
	    int i_67_ = 32;
	    while (i_67_-- > 0) {
		i_63_ += ((i_64_ << 4 ^ i_64_ >>> 5) + i_64_
			  ^ is[i_65_ & 0x3] + i_65_);
		i_65_ += i_66_;
		i_64_ += ((i_63_ << 4 ^ i_63_ >>> 5) + i_63_
			  ^ i_65_ + is[i_65_ >>> 11 & 0x3]);
	    }
	    pos -= -1579539528;
	    method16605(i_63_, -370040689);
	    method16605(i_64_, -1590074733);
	}
	pos = 339428471 * i_60_;
    }
    
    public void method16651(int[] is, int i, int i_68_, int i_69_) {
	int i_70_ = -1133521593 * pos;
	pos = i * 339428471;
	int i_71_ = (i_68_ - i) / 8;
	for (int i_72_ = 0; i_72_ < i_71_; i_72_++) {
	    int i_73_ = readInt(1381881061);
	    int i_74_ = readInt(1253787439);
	    int i_75_ = -957401312;
	    int i_76_ = -1640531527;
	    int i_77_ = 32;
	    while (i_77_-- > 0) {
		i_74_ -= (i_73_ + (i_73_ << 4 ^ i_73_ >>> 5)
			  ^ is[i_75_ >>> 11 & 0x3] + i_75_);
		i_75_ -= i_76_;
		i_73_ -= (i_74_ + (i_74_ << 4 ^ i_74_ >>> 5)
			  ^ i_75_ + is[i_75_ & 0x3]);
	    }
	    pos -= -1579539528;
	    method16605(i_73_, -1618785888);
	    method16605(i_74_, -1706100248);
	}
	pos = 339428471 * i_70_;
    }
    
    public int method16652() {
	return ((buffer[(pos += 339428471) * -1133521593 - 1]
		 - 128)
		& 255);
    }
    
    public void method16653(CharSequence charsequence) {
	int i = Class301.method5402(charsequence, 1434602089);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
	method16621(i, 16711935);
	pos
	    += Class281.method5198(buffer, -1133521593 * pos,
				   charsequence, 613333527) * 339428471;
    }
    
    public void method16654(long l, int i) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	for (int i_78_ = 8 * i; i_78_ >= 0; i_78_ -= 8)
	    buffer[(pos += 339428471) * -1133521593 - 1]
		= (byte) (int) (l >> i_78_);
    }
    
    public int readUnsignedByte(int i) {
	return (buffer[(pos += 339428471) * -1133521593 - 1]
		& 255);
    }
    
    public void method16656(int i, int i_79_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (0 - i);
    }
    
    public void method16657(int i, int i_80_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (128 - i);
    }
    
    public int method16658() {
	if (buffer[pos * -1133521593] < 0)
	    return readInt(1237407025) & 0x7fffffff;
	return readUnsignedShort((byte) 71);
    }
    
    public static int method16659(byte[] is, int i) {
	return Class555.method9240(is, 0, i, (byte) -6);
    }
    
    public int method16660(int i) {
	return (128 - (buffer
		       [(pos += 339428471) * -1133521593 - 1])
		& 255);
    }
    
    public void method16661(int[] is) {
	int i = -1133521593 * pos / 8;
	pos = 0;
	for (int i_81_ = 0; i_81_ < i; i_81_++) {
	    int i_82_ = readInt(2056437958);
	    int i_83_ = readInt(1893040316);
	    int i_84_ = -957401312;
	    int i_85_ = -1640531527;
	    int i_86_ = 32;
	    while (i_86_-- > 0) {
		i_83_ -= ((i_82_ << 4 ^ i_82_ >>> 5) + i_82_
			  ^ i_84_ + is[i_84_ >>> 11 & 0x3]);
		i_84_ -= i_85_;
		i_82_ -= (i_83_ + (i_83_ << 4 ^ i_83_ >>> 5)
			  ^ i_84_ + is[i_84_ & 0x3]);
	    }
	    pos -= -1579539528;
	    method16605(i_82_, -1973003636);
	    method16605(i_83_, -652432943);
	}
    }
    
    public byte method16662(int i) {
	return (byte) (0 - (buffer
			    [(pos += 339428471) * -1133521593 - 1]));
    }
    
    public byte method16663(byte i) {
	return (byte) (128 - (buffer
			      [(pos += 339428471) * -1133521593 - 1]));
    }
    
    public void method16664(int i, int i_87_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16665(int i, short i_88_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i + 128);
    }
    
    public void method16666(int i, int i_89_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i + 128);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
    }
    
    public RSBuffer(int i) {
	buffer = Class707.method14310(i, 51109958);
	pos = 0;
    }
    
    public int method16667(int i) {
	pos += 678856942;
	return ((buffer[-1133521593 * pos - 1] - 128 & 255)
		+ ((buffer[-1133521593 * pos - 2] & 255)
		   << 8));
    }
    
    public int method16668(byte i) {
	pos += 678856942;
	return (((buffer[-1133521593 * pos - 1] & 255) << 8)
		+ (buffer[pos * -1133521593 - 2] - 128
		   & 255));
    }
    
    public int method16669(short i) {
	pos += 678856942;
	int i_90_ = ((buffer[pos * -1133521593 - 2] & 255)
		     + ((buffer[-1133521593 * pos - 1] & 255)
			<< 8));
	if (i_90_ > 32767)
	    i_90_ -= 65536;
	return i_90_;
    }
    
    public int method16670(byte i) {
	pos += 678856942;
	int i_91_
	    = (((buffer[pos * -1133521593 - 1] & 255) << 8)
	       + (buffer[pos * -1133521593 - 2] - 128 & 255));
	if (i_91_ > 32767)
	    i_91_ -= 65536;
	return i_91_;
    }
    
    public void method16671(BigInteger biginteger, BigInteger biginteger_92_,
			    short i) {
	int i_93_ = pos * -1133521593;
	pos = 0;
	byte[] is = new byte[i_93_];
	method16639(is, 0, i_93_, 392537369);
	BigInteger biginteger_94_ = new BigInteger(is);
	BigInteger biginteger_95_
	    = biginteger_94_.modPow(biginteger, biginteger_92_);
	byte[] is_96_ = biginteger_95_.toByteArray();
	pos = 0;
	method16602(is_96_.length, 1064807899);
	method16614(is_96_, 0, is_96_.length, 1219549101);
    }
    
    public byte method16672() {
	return buffer[(pos += 339428471) * -1133521593 - 1];
    }
    
    public int method16673(byte i) {
	pos += 1018285413;
	return ((buffer[-1133521593 * pos - 2] & 255)
		+ (((buffer[pos * -1133521593 - 3] & 255)
		    << 16)
		   + ((buffer[-1133521593 * pos - 1] & 255)
		      << 8)));
    }
    
    public void method16674(int i, byte i_97_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method16675(int i, byte i_98_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
    }
    
    public void method16676(int i, int i_99_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
    }
    
    public int method16677(int i) {
	pos += 1357713884;
	return ((buffer[-1133521593 * pos - 4] & 255)
		+ (((buffer[pos * -1133521593 - 1] & 255)
		    << 24)
		   + ((buffer[-1133521593 * pos - 2] & 255)
		      << 16)
		   + ((buffer[pos * -1133521593 - 3] & 255)
		      << 8)));
    }
    
    public int method16678(byte i) {
	pos += 1357713884;
	return (((buffer[-1133521593 * pos - 4] & 255) << 8)
		+ (((buffer[pos * -1133521593 - 1] & 255)
		    << 16)
		   + ((buffer[-1133521593 * pos - 2] & 255)
		      << 24))
		+ (buffer[-1133521593 * pos - 3] & 255));
    }
    
    public int method16679(byte i) {
	pos += 1357713884;
	return (((buffer[-1133521593 * pos - 4] & 255) << 16)
		+ ((buffer[pos * -1133521593 - 3] & 255)
		   << 24)
		+ ((buffer[pos * -1133521593 - 1] & 255) << 8)
		+ (buffer[pos * -1133521593 - 2] & 255));
    }
    
    public int method16680(int i) {
	pos += 678856942;
	return ((buffer[pos * -1133521593 - 2] & 255)
		+ ((buffer[-1133521593 * pos - 1] & 255)
		   << 8));
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_100_ = i;
	    for (int i_101_ = 0; i_101_ < 8; i_101_++) {
		if ((i_100_ & 0x1) == 1)
		    i_100_ = i_100_ >>> 1 ^ ~0x12477cdf;
		else
		    i_100_ >>>= 1;
	    }
	    anIntArray10830[i] = i_100_;
	}
	aLongArray10833 = new long[256];
	for (int i = 0; i < 256; i++) {
	    long l = (long) i;
	    for (int i_102_ = 0; i_102_ < 8; i_102_++) {
		if (1L == (l & 0x1L))
		    l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
		else
		    l >>>= 1;
	    }
	    aLongArray10833[i] = l;
	}
    }
    
    public int readInt(int i) {
	pos += 1357713884;
	return (((buffer[pos * -1133521593 - 4] & 255) << 24)
		+ ((buffer[pos * -1133521593 - 3] & 255)
		   << 16)
		+ ((buffer[pos * -1133521593 - 2] & 255) << 8)
		+ (buffer[-1133521593 * pos - 1] & 255));
    }
    
    public void method16682(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    public void method16683() {
	if (null != buffer)
	    Class707.method14308(buffer, (byte) 94);
	buffer = null;
    }
    
    public void method16684(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    public void method16685(int i) {
	if (i < -1)
	    throw new IllegalArgumentException();
	if (i == -1)
	    method16602(32767, 880144865);
	else if (i < 32767)
	    method16602(i, 796023132);
	else {
	    method16605(i, -506429882);
	    buffer[-1133521593 * pos - 4] |= 0x80;
	}
    }
    
    public void method16686(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16687(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16688(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    public void method16689(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    public void method16690(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method16691(long l) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 32);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) l;
    }
    
    public long method16692() {
	long l = (long) readUnsignedShort((byte) 104) & 0xffffffffL;
	long l_103_ = (long) readInt(1707596634) & 0xffffffffL;
	return l_103_ + (l << 32);
    }
    
    public void method16693(long l) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 40);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 32);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) l;
    }
    
    public void method16694(long l) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 40);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 32);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) l;
    }
    
    public void method16695(long l) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 56);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 48);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 40);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 32);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) l;
    }
    
    public void method16696(int i, short i_104_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i + 128);
    }
    
    public void method16697(long l, int i) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	for (int i_105_ = 8 * i; i_105_ >= 0; i_105_ -= 8)
	    buffer[(pos += 339428471) * -1133521593 - 1]
		= (byte) (int) (l >> i_105_);
    }
    
    public void method16698(long l, int i) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	for (int i_106_ = 8 * i; i_106_ >= 0; i_106_ -= 8)
	    buffer[(pos += 339428471) * -1133521593 - 1]
		= (byte) (int) (l >> i_106_);
    }
    
    public int method16699(int i) {
	pos += 1018285413;
	int i_107_
	    = (((buffer[-1133521593 * pos - 3] & 255) << 16)
	       + ((buffer[-1133521593 * pos - 2] & 255) << 8)
	       + (buffer[pos * -1133521593 - 1] & 255));
	if (i_107_ > 8388607)
	    i_107_ -= 16777216;
	return i_107_;
    }
    
    public void method16700(String string, int i) {
	int i_108_ = string.indexOf('\0');
	if (i_108_ >= 0)
	    throw new IllegalArgumentException("");
	pos
	    += Class594.method9831(string, 0, string.length(), buffer,
				   -1133521593 * pos,
				   1155629355) * 339428471;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
    }
    
    public static int method16701(String string) {
	return string.length() + 1;
    }
    
    public void method16702(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	pos
	    += Class594.method9831(string, 0, string.length(), buffer,
				   -1133521593 * pos,
				   -2134204445) * 339428471;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
    }
    
    public void method16703(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	pos
	    += Class594.method9831(string, 0, string.length(), buffer,
				   -1133521593 * pos,
				   -340921055) * 339428471;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
    }
    
    public static int method16704(String string) {
	return string.length() + 2;
    }
    
    public void method16705(int[] is) {
	int i = pos * -1133521593 / 8;
	pos = 0;
	for (int i_109_ = 0; i_109_ < i; i_109_++) {
	    int i_110_ = readInt(1537761990);
	    int i_111_ = readInt(1838110025);
	    int i_112_ = 0;
	    int i_113_ = -1640531527;
	    int i_114_ = 32;
	    while (i_114_-- > 0) {
		i_110_ += ((i_111_ << 4 ^ i_111_ >>> 5) + i_111_
			   ^ is[i_112_ & 0x3] + i_112_);
		i_112_ += i_113_;
		i_111_ += (i_110_ + (i_110_ << 4 ^ i_110_ >>> 5)
			   ^ is[i_112_ >>> 11 & 0x3] + i_112_);
	    }
	    pos -= -1579539528;
	    method16605(i_110_, -495814624);
	    method16605(i_111_, -1546561343);
	}
    }
    
    public void method16706(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
    }
    
    public void method16707(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
	pos
	    += Class594.method9831(string, 0, string.length(), buffer,
				   pos * -1133521593,
				   -858954998) * 339428471;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
    }
    
    public void method16708(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
	pos
	    += Class594.method9831(string, 0, string.length(), buffer,
				   pos * -1133521593,
				   -1589374744) * 339428471;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
    }
    
    public void method16709(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
    }
    
    public int method16710() {
	pos += 678856942;
	int i = ((buffer[-1133521593 * pos - 1] & 255)
		 + ((buffer[pos * -1133521593 - 2] & 255)
		    << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public static int method16711(String string) {
	return string.length() + 2;
    }
    
    public byte readByte(int i) {
	return buffer[(pos += 339428471) * -1133521593 - 1];
    }
    
    public void method16713(byte[] is, int i, int i_115_) {
	for (int i_116_ = i; i_116_ < i + i_115_; i_116_++)
	    buffer[(pos += 339428471) * -1133521593 - 1]
		= is[i_116_];
    }
    
    public void method16714(RSBuffer class525_sub38_117_) {
	method16614(class525_sub38_117_.buffer, 0,
		    -1133521593 * class525_sub38_117_.pos, 383293120);
    }
    
    void method16715(int i) {
	if ((i & ~0x7f) != 0) {
	    if ((i & ~0x3fff) != 0) {
		if (0 != (i & ~0x1fffff)) {
		    if (0 != (i & ~0xfffffff))
			method16735(i >>> 28 | 0x80, -1075606726);
		    method16735(i >>> 21 | 0x80, -1597702289);
		}
		method16735(i >>> 14 | 0x80, -300815141);
	    }
	    method16735(i >>> 7 | 0x80, -435516514);
	}
	method16735(i & 0x7f, -605719259);
    }
    
    public void method16716(RSBuffer class525_sub38_118_) {
	method16614(class525_sub38_118_.buffer, 0,
		    -1133521593 * class525_sub38_118_.pos, 2135078165);
    }
    
    public void method16717(RSBuffer class525_sub38_119_) {
	method16614(class525_sub38_119_.buffer, 0,
		    -1133521593 * class525_sub38_119_.pos, 496160023);
    }
    
    public void method16718(int i) {
	if (i < 0 || i > 65535)
	    throw new IllegalArgumentException();
	buffer[pos * -1133521593 - i - 2] = (byte) (i >> 8);
	buffer[-1133521593 * pos - i - 1] = (byte) i;
    }
    
    public void method16719(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16720(int i) {
	if (i < 0 || i > 65535)
	    throw new IllegalArgumentException();
	buffer[pos * -1133521593 - i - 2] = (byte) (i >> 8);
	buffer[-1133521593 * pos - i - 1] = (byte) i;
    }
    
    public void method16721(int i, int i_120_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
    }
    
    int method16722() {
	int i = buffer[(pos += 339428471) * -1133521593 - 1];
	int i_121_ = 0;
	for (/**/; i < 0;
	     i = buffer[(pos += 339428471) * -1133521593 - 1])
	    i_121_ = (i_121_ | i & 0x7f) << 7;
	return i_121_ | i;
    }
    
    public void method16723(int i) {
	if (i < 64 && i >= -64)
	    method16735(i + 64, -573365865);
	else if (i < 16384 && i >= -16384)
	    method16602(i + 49152, 1802927290);
	else
	    throw new IllegalArgumentException();
    }
    
    public void method16724(int i) {
	if (i < 64 && i >= -64)
	    method16735(i + 64, -585138428);
	else if (i < 16384 && i >= -16384)
	    method16602(i + 49152, 1124310652);
	else
	    throw new IllegalArgumentException();
    }
    
    public void method16725(int i) {
	if (i < 64 && i >= -64)
	    method16735(i + 64, -992790162);
	else if (i < 16384 && i >= -16384)
	    method16602(i + 49152, 1090756544);
	else
	    throw new IllegalArgumentException();
    }
    
    public void method16726(int[] is, byte i) {
	int i_122_ = pos * -1133521593 / 8;
	pos = 0;
	for (int i_123_ = 0; i_123_ < i_122_; i_123_++) {
	    int i_124_ = readInt(1853355903);
	    int i_125_ = readInt(1433755559);
	    int i_126_ = 0;
	    int i_127_ = -1640531527;
	    int i_128_ = 32;
	    while (i_128_-- > 0) {
		i_124_ += ((i_125_ << 4 ^ i_125_ >>> 5) + i_125_
			   ^ is[i_126_ & 0x3] + i_126_);
		i_126_ += i_127_;
		i_125_ += (i_124_ + (i_124_ << 4 ^ i_124_ >>> 5)
			   ^ is[i_126_ >>> 11 & 0x3] + i_126_);
	    }
	    pos -= -1579539528;
	    method16605(i_124_, -1649294895);
	    method16605(i_125_, -85456685);
	}
    }
    
    public void method16727(int i) {
	if (i >= 0 && i < 128)
	    method16735(i, -992480133);
	else if (i >= 0 && i < 32768)
	    method16602(32768 + i, 2050511664);
	else
	    throw new IllegalArgumentException();
    }
    
    public void method16728(int i) {
	if (i >= 0 && i < 128)
	    method16735(i, -1131798881);
	else if (i >= 0 && i < 32768)
	    method16602(32768 + i, 1818263130);
	else
	    throw new IllegalArgumentException();
    }
    
    public void method16729(int i) {
	if (i < -1)
	    throw new IllegalArgumentException();
	if (i == -1)
	    method16602(32767, 1516527251);
	else if (i < 32767)
	    method16602(i, 1968672836);
	else {
	    method16605(i, -1109735896);
	    buffer[-1133521593 * pos - 4] |= 0x80;
	}
    }
    
    public void method16730(int i) {
	if (i < -1)
	    throw new IllegalArgumentException();
	if (i == -1)
	    method16602(32767, 902427722);
	else if (i < 32767)
	    method16602(i, 903265662);
	else {
	    method16605(i, -364649061);
	    buffer[-1133521593 * pos - 4] |= 0x80;
	}
    }
    
    public void method16731(int i) {
	if (i < -1)
	    throw new IllegalArgumentException();
	if (i == -1)
	    method16602(32767, 817967546);
	else if (i < 32767)
	    method16602(i, 873405242);
	else {
	    method16605(i, -644173686);
	    buffer[-1133521593 * pos - 4] |= 0x80;
	}
    }
    
    public int method16732(int i) {
	if (buffer[pos * -1133521593] < 0)
	    return readInt(1594708162) & 0x7fffffff;
	return readUnsignedShort((byte) 70);
    }
    
    public void method16733(CharSequence charsequence) {
	int i = Class301.method5402(charsequence, 1434602089);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
	method16621(i, 16711935);
	pos
	    += Class281.method5198(buffer, -1133521593 * pos,
				   charsequence, 613333527) * 339428471;
    }
    
    public static int method16734(String string) {
	return string.length() + 1;
    }
    
    public void method16735(int i, int i_129_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    public int method16736() {
	return (buffer[(pos += 339428471) * -1133521593 - 1]
		& 255);
    }
    
    public byte method16737() {
	return buffer[(pos += 339428471) * -1133521593 - 1];
    }
    
    public int method16738() {
	pos += 1357713884;
	return (((buffer[pos * -1133521593 - 4] & 255) << 24)
		+ ((buffer[pos * -1133521593 - 3] & 255)
		   << 16)
		+ ((buffer[pos * -1133521593 - 2] & 255) << 8)
		+ (buffer[-1133521593 * pos - 1] & 255));
    }
    
    public byte method16739(int i) {
	return (byte) ((buffer
			[(pos += 339428471) * -1133521593 - 1])
		       - 128);
    }
    
    public int method16740(byte i) {
	int i_130_ = buffer[pos * -1133521593] & 255;
	if (i_130_ < 128)
	    return readUnsignedByte(737070196);
	return readUnsignedShort((byte) 70) - 32768;
    }
    
    public int method16741() {
	pos += 678856942;
	return (((buffer[pos * -1133521593 - 2] & 255) << 8)
		+ (buffer[pos * -1133521593 - 1] & 255));
    }
    
    public String method16742() {
	if (buffer[-1133521593 * pos] == 0) {
	    pos += 339428471;
	    return null;
	}
	return readString((byte) -12);
    }
    
    public int method16743() {
	pos += 1018285413;
	return (((buffer[-1133521593 * pos - 2] & 255) << 8)
		+ ((buffer[-1133521593 * pos - 3] & 255)
		   << 16)
		+ (buffer[pos * -1133521593 - 1] & 255));
    }
    
    public int method16744() {
	pos += 1018285413;
	int i
	    = (((buffer[-1133521593 * pos - 3] & 255) << 16)
	       + ((buffer[-1133521593 * pos - 2] & 255) << 8)
	       + (buffer[pos * -1133521593 - 1] & 255));
	if (i > 8388607)
	    i -= 16777216;
	return i;
    }
    
    public void method16745(CharSequence charsequence) {
	int i = Class301.method5402(charsequence, 1434602089);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
	method16621(i, 16711935);
	pos
	    += Class281.method5198(buffer, -1133521593 * pos,
				   charsequence, 613333527) * 339428471;
    }
    
    public long method16746(int i) {
	long l = (long) readUnsignedByte(984364021) & 0xffffffffL;
	long l_131_ = (long) readInt(1371042958) & 0xffffffffL;
	return (l << 32) + l_131_;
    }
    
    public int method16747() {
	pos += 1357713884;
	return ((buffer[pos * -1133521593 - 4] & 255)
		+ (((buffer[-1133521593 * pos - 1] & 255)
		    << 24)
		   + ((buffer[-1133521593 * pos - 2] & 255)
		      << 16)
		   + ((buffer[-1133521593 * pos - 3] & 255)
		      << 8)));
    }
    
    public long method16748() {
	long l = (long) readUnsignedByte(10681562) & 0xffffffffL;
	long l_132_ = (long) readInt(1619295787) & 0xffffffffL;
	return (l << 32) + l_132_;
    }
    
    public long method16749() {
	long l = (long) readUnsignedByte(1114517063) & 0xffffffffL;
	long l_133_ = (long) readInt(2051686248) & 0xffffffffL;
	return (l << 32) + l_133_;
    }
    
    public long method16750() {
	long l = (long) readUnsignedByte(1229001585) & 0xffffffffL;
	long l_134_ = (long) readInt(1240663123) & 0xffffffffL;
	return (l << 32) + l_134_;
    }
    
    public long method16751() {
	long l = (long) readUnsignedShort((byte) 91) & 0xffffffffL;
	long l_135_ = (long) readInt(1664685514) & 0xffffffffL;
	return l_135_ + (l << 32);
    }
    
    public void method16752(int[] is, int i) {
	int i_136_ = -1133521593 * pos / 8;
	pos = 0;
	for (int i_137_ = 0; i_137_ < i_136_; i_137_++) {
	    int i_138_ = readInt(2030410159);
	    int i_139_ = readInt(941713235);
	    int i_140_ = -957401312;
	    int i_141_ = -1640531527;
	    int i_142_ = 32;
	    while (i_142_-- > 0) {
		i_139_ -= ((i_138_ << 4 ^ i_138_ >>> 5) + i_138_
			   ^ i_140_ + is[i_140_ >>> 11 & 0x3]);
		i_140_ -= i_141_;
		i_138_ -= (i_139_ + (i_139_ << 4 ^ i_139_ >>> 5)
			   ^ i_140_ + is[i_140_ & 0x3]);
	    }
	    pos -= -1579539528;
	    method16605(i_138_, -1413986148);
	    method16605(i_139_, -204839763);
	}
    }
    
    public String method16753() {
	byte i = buffer[(pos += 339428471) * -1133521593 - 1];
	if (0 != i)
	    throw new IllegalStateException("");
	int i_143_ = -1133521593 * pos;
	while (buffer[(pos += 339428471) * -1133521593 - 1]
	       != 0) {
	    /* empty */
	}
	int i_144_ = -1133521593 * pos - i_143_ - 1;
	if (0 == i_144_)
	    return "";
	return Class392.method6482(buffer, i_143_, i_144_, 930086877);
    }
    
    public long method16754() {
	long l = (long) readUnsignedShort((byte) 43) & 0xffffffffL;
	long l_145_ = (long) readInt(1691188576) & 0xffffffffL;
	return l_145_ + (l << 32);
    }
    
    public long method16755() {
	long l = (long) readInt(1315779187) & 0xffffffffL;
	long l_146_ = (long) readInt(1181665849) & 0xffffffffL;
	return (l << 32) + l_146_;
    }
    
    public long method16756() {
	long l = (long) readInt(1144174067) & 0xffffffffL;
	long l_147_ = (long) readInt(1084281486) & 0xffffffffL;
	return (l << 32) + l_147_;
    }
    
    public static int method16757(String string) {
	return string.length() + 2;
    }
    
    public long method16758(int i) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	int i_148_ = i * 8;
	long l = 0L;
	for (/**/; i_148_ >= 0; i_148_ -= 8)
	    l |= ((long) (buffer
			  [(pos += 339428471) * -1133521593 - 1])
		  & 0xffL) << i_148_;
	return l;
    }
    
    public void method16759(byte[] is, int i, int i_149_, short i_150_) {
	for (int i_151_ = i; i_151_ < i_149_ + i; i_151_++)
	    is[i_151_]
		= (byte) ((buffer
			   [(pos += 339428471) * -1133521593 - 1])
			  - 128);
    }
    
    public void method16760(RSBuffer class525_sub38_152_) {
	method16614(class525_sub38_152_.buffer, 0,
		    -1133521593 * class525_sub38_152_.pos, 1747064319);
    }
    
    public void method16761(long l) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 32);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) (l >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (int) l;
    }
    
    public float method16762() {
	return Float.intBitsToFloat(readInt(1341813418));
    }
    
    void method16763(int i) {
	if ((i & ~0x7f) != 0) {
	    if ((i & ~0x3fff) != 0) {
		if (0 != (i & ~0x1fffff)) {
		    if (0 != (i & ~0xfffffff))
			method16735(i >>> 28 | 0x80, -2011582784);
		    method16735(i >>> 21 | 0x80, -641814175);
		}
		method16735(i >>> 14 | 0x80, -614241990);
	    }
	    method16735(i >>> 7 | 0x80, -1436084648);
	}
	method16735(i & 0x7f, -829450892);
    }
    
    public boolean method16764(int i) {
	pos -= 1357713884;
	int i_153_ = Class555.method9240(buffer, 0,
					 -1133521593 * pos, (byte) -60);
	int i_154_ = readInt(1861474419);
	if (i_154_ == i_153_)
	    return true;
	return false;
    }
    
    public float method16765() {
	return Float.intBitsToFloat(readInt(1777147323));
    }
    
    public byte method16766() {
	return buffer[(pos += 339428471) * -1133521593 - 1];
    }
    
    public String method16767() {
	if (buffer[-1133521593 * pos] == 0) {
	    pos += 339428471;
	    return null;
	}
	return readString((byte) 15);
    }
    
    public boolean method16768() {
	pos -= 1357713884;
	int i = Class555.method9240(buffer, 0,
				    -1133521593 * pos, (byte) -4);
	int i_155_ = readInt(2117540843);
	if (i_155_ == i)
	    return true;
	return false;
    }
    
    public String method16769() {
	int i = pos * -1133521593;
	while (buffer[(pos += 339428471) * -1133521593 - 1]
	       != 0) {
	    /* empty */
	}
	int i_156_ = pos * -1133521593 - i - 1;
	if (i_156_ == 0)
	    return "";
	return Class392.method6482(buffer, i, i_156_, 814828404);
    }
    
    public String method16770() {
	int i = pos * -1133521593;
	while (buffer[(pos += 339428471) * -1133521593 - 1]
	       != 0) {
	    /* empty */
	}
	int i_157_ = pos * -1133521593 - i - 1;
	if (i_157_ == 0)
	    return "";
	return Class392.method6482(buffer, i, i_157_, 1627423607);
    }
    
    public String method16771() {
	int i = pos * -1133521593;
	while (buffer[(pos += 339428471) * -1133521593 - 1]
	       != 0) {
	    /* empty */
	}
	int i_158_ = pos * -1133521593 - i - 1;
	if (i_158_ == 0)
	    return "";
	return Class392.method6482(buffer, i, i_158_, 1298888794);
    }
    
    public String method16772() {
	byte i = buffer[(pos += 339428471) * -1133521593 - 1];
	if (0 != i)
	    throw new IllegalStateException("");
	int i_159_ = -1133521593 * pos;
	while (buffer[(pos += 339428471) * -1133521593 - 1]
	       != 0) {
	    /* empty */
	}
	int i_160_ = -1133521593 * pos - i_159_ - 1;
	if (0 == i_160_)
	    return "";
	return Class392.method6482(buffer, i_159_, i_160_,
				   2050418422);
    }
    
    public byte method16773() {
	return (byte) (128 - (buffer
			      [(pos += 339428471) * -1133521593 - 1]));
    }
    
    public String method16774() {
	byte i = buffer[(pos += 339428471) * -1133521593 - 1];
	if (0 != i)
	    throw new IllegalStateException("");
	int i_161_ = -1133521593 * pos;
	while (buffer[(pos += 339428471) * -1133521593 - 1]
	       != 0) {
	    /* empty */
	}
	int i_162_ = -1133521593 * pos - i_161_ - 1;
	if (0 == i_162_)
	    return "";
	return Class392.method6482(buffer, i_161_, i_162_,
				   1857459525);
    }
    
    public String method16775() {
	byte i = buffer[(pos += 339428471) * -1133521593 - 1];
	if (i != 0)
	    throw new IllegalStateException("");
	int i_163_ = method16813((byte) 96);
	if (i_163_ + pos * -1133521593 > buffer.length)
	    throw new IllegalStateException("");
	String string = Class531_Sub3.method15943(buffer,
						  -1133521593 * pos,
						  i_163_, (byte) 32);
	pos += 339428471 * i_163_;
	return string;
    }
    
    public String method16776() {
	byte i = buffer[(pos += 339428471) * -1133521593 - 1];
	if (i != 0)
	    throw new IllegalStateException("");
	int i_164_ = method16813((byte) 36);
	if (i_164_ + pos * -1133521593 > buffer.length)
	    throw new IllegalStateException("");
	String string = Class531_Sub3.method15943(buffer,
						  -1133521593 * pos,
						  i_164_, (byte) 114);
	pos += 339428471 * i_164_;
	return string;
    }
    
    public int method16777(int i) {
	int i_165_ = Class555.method9240(buffer, i,
					 -1133521593 * pos, (byte) -40);
	method16605(i_165_, -1238418540);
	return i_165_;
    }
    
    public int method16778() {
	int i = buffer[-1133521593 * pos] & 255;
	if (i < 128)
	    return readUnsignedByte(453476504) - 64;
	return readUnsignedShort((byte) 48) - 49152;
    }
    
    public int method16779() {
	int i = buffer[pos * -1133521593] & 255;
	if (i < 128)
	    return readUnsignedByte(1505530152);
	return readUnsignedShort((byte) 46) - 32768;
    }
    
    public String method16780() {
	if (buffer[-1133521593 * pos] == 0) {
	    pos += 339428471;
	    return null;
	}
	return readString((byte) -55);
    }
    
    public int method16781() {
	int i = 0;
	int i_166_;
	for (i_166_ = method16740((byte) -98); i_166_ == 32767;
	     i_166_ = method16740((byte) -62))
	    i += 32767;
	i += i_166_;
	return i;
    }
    
    void method16782(int i) {
	if ((i & ~0x7f) != 0) {
	    if ((i & ~0x3fff) != 0) {
		if (0 != (i & ~0x1fffff)) {
		    if (0 != (i & ~0xfffffff))
			method16735(i >>> 28 | 0x80, -1228512474);
		    method16735(i >>> 21 | 0x80, -2073423788);
		}
		method16735(i >>> 14 | 0x80, -1603154331);
	    }
	    method16735(i >>> 7 | 0x80, -1614263295);
	}
	method16735(i & 0x7f, -2086980531);
    }
    
    public int method16783() {
	if (buffer[pos * -1133521593] < 0)
	    return readInt(1082197597) & 0x7fffffff;
	return readUnsignedShort((byte) 74);
    }
    
    public int method16784() {
	if (buffer[-1133521593 * pos] < 0)
	    return readInt(1364783752) & 0x7fffffff;
	int i = readUnsignedShort((byte) 65);
	if (i == 32767)
	    return -1;
	return i;
    }
    
    public long method16785() {
	long l = (long) readUnsignedShort((byte) 30) & 0xffffffffL;
	long l_167_ = (long) readInt(1236404227) & 0xffffffffL;
	return l_167_ + (l << 32);
    }
    
    int method16786() {
	int i = buffer[(pos += 339428471) * -1133521593 - 1];
	int i_168_ = 0;
	for (/**/; i < 0;
	     i = buffer[(pos += 339428471) * -1133521593 - 1])
	    i_168_ = (i_168_ | i & 0x7f) << 7;
	return i_168_ | i;
    }
    
    int method16787() {
	int i = buffer[(pos += 339428471) * -1133521593 - 1];
	int i_169_ = 0;
	for (/**/; i < 0;
	     i = buffer[(pos += 339428471) * -1133521593 - 1])
	    i_169_ = (i_169_ | i & 0x7f) << 7;
	return i_169_ | i;
    }
    
    public int method16788() {
	int i = 0;
	int i_170_ = 0;
	int i_171_;
	do {
	    i_171_ = readUnsignedByte(1269578462);
	    i |= (i_171_ & 0x7f) << i_170_;
	    i_170_ += 7;
	} while (i_171_ > 127);
	return i;
    }
    
    public int method16789() {
	int i = 0;
	int i_172_ = 0;
	int i_173_;
	do {
	    i_173_ = readUnsignedByte(313228036);
	    i |= (i_173_ & 0x7f) << i_172_;
	    i_172_ += 7;
	} while (i_173_ > 127);
	return i;
    }
    
    public int method16790(short i) {
	pos += 1357713884;
	return ((buffer[pos * -1133521593 - 4] & 255)
		+ (((buffer[-1133521593 * pos - 1] & 255)
		    << 24)
		   + ((buffer[-1133521593 * pos - 2] & 255)
		      << 16)
		   + ((buffer[-1133521593 * pos - 3] & 255)
		      << 8)));
    }
    
    public void method16791(int[] is) {
	int i = pos * -1133521593 / 8;
	pos = 0;
	for (int i_174_ = 0; i_174_ < i; i_174_++) {
	    int i_175_ = readInt(848200315);
	    int i_176_ = readInt(1234796703);
	    int i_177_ = 0;
	    int i_178_ = -1640531527;
	    int i_179_ = 32;
	    while (i_179_-- > 0) {
		i_175_ += ((i_176_ << 4 ^ i_176_ >>> 5) + i_176_
			   ^ is[i_177_ & 0x3] + i_177_);
		i_177_ += i_178_;
		i_176_ += (i_175_ + (i_175_ << 4 ^ i_175_ >>> 5)
			   ^ is[i_177_ >>> 11 & 0x3] + i_177_);
	    }
	    pos -= -1579539528;
	    method16605(i_175_, -1114723953);
	    method16605(i_176_, -1191854552);
	}
    }
    
    public void method16792(int[] is) {
	int i = -1133521593 * pos / 8;
	pos = 0;
	for (int i_180_ = 0; i_180_ < i; i_180_++) {
	    int i_181_ = readInt(1208828767);
	    int i_182_ = readInt(1782913764);
	    int i_183_ = -957401312;
	    int i_184_ = -1640531527;
	    int i_185_ = 32;
	    while (i_185_-- > 0) {
		i_182_ -= ((i_181_ << 4 ^ i_181_ >>> 5) + i_181_
			   ^ i_183_ + is[i_183_ >>> 11 & 0x3]);
		i_183_ -= i_184_;
		i_181_ -= (i_182_ + (i_182_ << 4 ^ i_182_ >>> 5)
			   ^ i_183_ + is[i_183_ & 0x3]);
	    }
	    pos -= -1579539528;
	    method16605(i_181_, -78022809);
	    method16605(i_182_, -1510050637);
	}
    }
    
    public void method16793(int i) {
	if (i < 0 || i > 65535)
	    throw new IllegalArgumentException();
	buffer[pos * -1133521593 - i - 2] = (byte) (i >> 8);
	buffer[-1133521593 * pos - i - 1] = (byte) i;
    }
    
    public void method16794(int[] is) {
	int i = -1133521593 * pos / 8;
	pos = 0;
	for (int i_186_ = 0; i_186_ < i; i_186_++) {
	    int i_187_ = readInt(2029369442);
	    int i_188_ = readInt(1577581660);
	    int i_189_ = -957401312;
	    int i_190_ = -1640531527;
	    int i_191_ = 32;
	    while (i_191_-- > 0) {
		i_188_ -= ((i_187_ << 4 ^ i_187_ >>> 5) + i_187_
			   ^ i_189_ + is[i_189_ >>> 11 & 0x3]);
		i_189_ -= i_190_;
		i_187_ -= (i_188_ + (i_188_ << 4 ^ i_188_ >>> 5)
			   ^ i_189_ + is[i_189_ & 0x3]);
	    }
	    pos -= -1579539528;
	    method16605(i_187_, -2058445381);
	    method16605(i_188_, -1162055264);
	}
    }
    
    public void method16795(int[] is, int i, int i_192_) {
	int i_193_ = -1133521593 * pos;
	pos = i * 339428471;
	int i_194_ = (i_192_ - i) / 8;
	for (int i_195_ = 0; i_195_ < i_194_; i_195_++) {
	    int i_196_ = readInt(914740076);
	    int i_197_ = readInt(1609053419);
	    int i_198_ = 0;
	    int i_199_ = -1640531527;
	    int i_200_ = 32;
	    while (i_200_-- > 0) {
		i_196_ += ((i_197_ << 4 ^ i_197_ >>> 5) + i_197_
			   ^ is[i_198_ & 0x3] + i_198_);
		i_198_ += i_199_;
		i_197_ += ((i_196_ << 4 ^ i_196_ >>> 5) + i_196_
			   ^ i_198_ + is[i_198_ >>> 11 & 0x3]);
	    }
	    pos -= -1579539528;
	    method16605(i_196_, -1751581269);
	    method16605(i_197_, -1505576491);
	}
	pos = 339428471 * i_193_;
    }
    
    public int method16796() {
	pos += 1357713884;
	return (((buffer[-1133521593 * pos - 4] & 255) << 8)
		+ (((buffer[pos * -1133521593 - 1] & 255)
		    << 16)
		   + ((buffer[-1133521593 * pos - 2] & 255)
		      << 24))
		+ (buffer[-1133521593 * pos - 3] & 255));
    }
    
    public int method16797(int i, int i_201_) {
	int i_202_ = Class555.method9240(buffer, i,
					 -1133521593 * pos, (byte) 33);
	method16605(i_202_, -971841920);
	return i_202_;
    }
    
    public void method16798(BigInteger biginteger,
			    BigInteger biginteger_203_) {
	int i = pos * -1133521593;
	pos = 0;
	byte[] is = new byte[i];
	method16639(is, 0, i, 731977184);
	BigInteger biginteger_204_ = new BigInteger(is);
	BigInteger biginteger_205_
	    = biginteger_204_.modPow(biginteger, biginteger_203_);
	byte[] is_206_ = biginteger_205_.toByteArray();
	pos = 0;
	method16602(is_206_.length, 2099538380);
	method16614(is_206_, 0, is_206_.length, -633231046);
    }
    
    public void method16799(BigInteger biginteger,
			    BigInteger biginteger_207_) {
	int i = pos * -1133521593;
	pos = 0;
	byte[] is = new byte[i];
	method16639(is, 0, i, 1108364644);
	BigInteger biginteger_208_ = new BigInteger(is);
	BigInteger biginteger_209_
	    = biginteger_208_.modPow(biginteger, biginteger_207_);
	byte[] is_210_ = biginteger_209_.toByteArray();
	pos = 0;
	method16602(is_210_.length, 788991842);
	method16614(is_210_, 0, is_210_.length, -382374795);
    }
    
    public void method16800(String string) {
	int i = string.indexOf('\0');
	if (i >= 0)
	    throw new IllegalArgumentException("");
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
	pos
	    += Class594.method9831(string, 0, string.length(), buffer,
				   pos * -1133521593,
				   1429129208) * 339428471;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) 0;
    }
    
    public int method16801(int i) {
	int i_211_ = Class555.method9240(buffer, i,
					 -1133521593 * pos, (byte) 65);
	method16605(i_211_, -1390174289);
	return i_211_;
    }
    
    public int method16802(int i) {
	int i_212_ = Class555.method9240(buffer, i,
					 -1133521593 * pos, (byte) 45);
	method16605(i_212_, -1316443125);
	return i_212_;
    }
    
    public void method16803() {
	if (null != buffer)
	    Class707.method14308(buffer, (byte) -2);
	buffer = null;
    }
    
    public boolean method16804() {
	pos -= 1357713884;
	int i = Class555.method9240(buffer, 0,
				    -1133521593 * pos, (byte) 4);
	int i_213_ = readInt(1968184325);
	if (i_213_ == i)
	    return true;
	return false;
    }
    
    public int method16805() {
	pos += 1357713884;
	return (((buffer[-1133521593 * pos - 4] & 255) << 8)
		+ (((buffer[pos * -1133521593 - 1] & 255)
		    << 16)
		   + ((buffer[-1133521593 * pos - 2] & 255)
		      << 24))
		+ (buffer[-1133521593 * pos - 3] & 255));
    }
    
    public void method16806(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i + 128);
    }
    
    public void method16807(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (0 - i);
    }
    
    public void method16808(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    public float method16809() {
	return Float.intBitsToFloat(readInt(1452699394));
    }
    
    public int method16810() {
	return ((buffer[(pos += 339428471) * -1133521593 - 1]
		 - 128)
		& 255);
    }
    
    public int method16811() {
	return (0 - (buffer
		     [(pos += 339428471) * -1133521593 - 1])
		& 255);
    }
    
    public int method16812() {
	return (0 - (buffer
		     [(pos += 339428471) * -1133521593 - 1])
		& 255);
    }
    
    int method16813(byte i) {
	int i_214_
	    = buffer[(pos += 339428471) * -1133521593 - 1];
	int i_215_ = 0;
	for (/**/; i_214_ < 0;
	     i_214_ = (buffer
		       [(pos += 339428471) * -1133521593 - 1]))
	    i_215_ = (i_215_ | i_214_ & 0x7f) << 7;
	return i_215_ | i_214_;
    }
    
    public void method16814(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16815(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i + 128);
    }
    
    public void method16816(int i, int i_216_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    public int method16817() {
	pos += 678856942;
	return ((buffer[pos * -1133521593 - 2] & 255)
		+ ((buffer[-1133521593 * pos - 1] & 255)
		   << 8));
    }
    
    public int method16818() {
	pos += 678856942;
	return ((buffer[pos * -1133521593 - 2] & 255)
		+ ((buffer[-1133521593 * pos - 1] & 255)
		   << 8));
    }
    
    public int method16819() {
	pos += 678856942;
	return ((buffer[pos * -1133521593 - 2] & 255)
		+ ((buffer[-1133521593 * pos - 1] & 255)
		   << 8));
    }
    
    public int method16820() {
	pos += 678856942;
	return ((buffer[-1133521593 * pos - 1] - 128 & 255)
		+ ((buffer[-1133521593 * pos - 2] & 255)
		   << 8));
    }
    
    public int method16821() {
	pos += 678856942;
	return (((buffer[-1133521593 * pos - 1] & 255) << 8)
		+ (buffer[pos * -1133521593 - 2] - 128
		   & 255));
    }
    
    public int method16822() {
	pos += 678856942;
	return (((buffer[-1133521593 * pos - 1] & 255) << 8)
		+ (buffer[pos * -1133521593 - 2] - 128
		   & 255));
    }
    
    public int method16823() {
	pos += 678856942;
	return (((buffer[-1133521593 * pos - 1] & 255) << 8)
		+ (buffer[pos * -1133521593 - 2] - 128
		   & 255));
    }
    
    public int method16824() {
	pos += 678856942;
	int i = ((buffer[pos * -1133521593 - 2] & 255)
		 + ((buffer[-1133521593 * pos - 1] & 255)
		    << 8));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public int method16825() {
	pos += 678856942;
	int i
	    = (((buffer[pos * -1133521593 - 1] & 255) << 8)
	       + (buffer[pos * -1133521593 - 2] - 128 & 255));
	if (i > 32767)
	    i -= 65536;
	return i;
    }
    
    public long method16826(int i) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	int i_217_ = i * 8;
	long l = 0L;
	for (/**/; i_217_ >= 0; i_217_ -= 8)
	    l |= ((long) (buffer
			  [(pos += 339428471) * -1133521593 - 1])
		  & 0xffL) << i_217_;
	return l;
    }
    
    public void method16827(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
    }
    
    public void method16828(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    public void method16829(int i, int i_218_) {
	if (i >= 0 && i < 128)
	    method16735(i, -826315847);
	else if (i >= 0 && i < 32768)
	    method16602(32768 + i, 978720482);
	else
	    throw new IllegalArgumentException();
    }
    
    public int method16830() {
	pos += 1018285413;
	return ((buffer[-1133521593 * pos - 2] & 255)
		+ (((buffer[pos * -1133521593 - 3] & 255)
		    << 16)
		   + ((buffer[-1133521593 * pos - 1] & 255)
		      << 8)));
    }
    
    public void method16831(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method16832(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method16833(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
    }
    
    public int method16834(int i) {
	pos += 1018285413;
	return (((buffer[-1133521593 * pos - 2] & 255) << 8)
		+ ((buffer[-1133521593 * pos - 3] & 255)
		   << 16)
		+ (buffer[pos * -1133521593 - 1] & 255));
    }
    
    public void method16835(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
    }
    
    public int method16836(short i) {
	int i_219_ = 0;
	int i_220_;
	for (i_220_ = method16740((byte) -4); i_220_ == 32767;
	     i_220_ = method16740((byte) -15))
	    i_219_ += 32767;
	i_219_ += i_220_;
	return i_219_;
    }
    
    public int method16837() {
	int i = buffer[-1133521593 * pos] & 255;
	if (i < 128)
	    return readUnsignedByte(2063861252) - 64;
	return readUnsignedShort((byte) 76) - 49152;
    }
    
    public byte method16838() {
	return buffer[(pos += 339428471) * -1133521593 - 1];
    }
    
    public void method16839(int i) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
    }
    
    public void method16840(int i, int i_221_) {
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
    }
    
    public int method16841() {
	pos += 1357713884;
	return ((buffer[-1133521593 * pos - 4] & 255)
		+ (((buffer[pos * -1133521593 - 1] & 255)
		    << 24)
		   + ((buffer[-1133521593 * pos - 2] & 255)
		      << 16)
		   + ((buffer[pos * -1133521593 - 3] & 255)
		      << 8)));
    }
    
    public int readUnsignedShort(byte i) {
	pos += 678856942;
	return (((buffer[pos * -1133521593 - 2] & 255) << 8)
		+ (buffer[pos * -1133521593 - 1] & 255));
    }
    
    public long method16843(int i) {
	if (--i < 0 || i > 7)
	    throw new IllegalArgumentException();
	int i_222_ = i * 8;
	long l = 0L;
	for (/**/; i_222_ >= 0; i_222_ -= 8)
	    l |= ((long) (buffer
			  [(pos += 339428471) * -1133521593 - 1])
		  & 0xffL) << i_222_;
	return l;
    }
    
    public int method16844(int i) {
	int i_223_ = Class555.method9240(buffer, i,
					 -1133521593 * pos, (byte) 119);
	method16605(i_223_, -333536008);
	return i_223_;
    }
    
    public int method16845() {
	pos += 1357713884;
	return (((buffer[-1133521593 * pos - 4] & 255) << 16)
		+ ((buffer[pos * -1133521593 - 3] & 255)
		   << 24)
		+ ((buffer[pos * -1133521593 - 1] & 255) << 8)
		+ (buffer[pos * -1133521593 - 2] & 255));
    }
    
    public void method16846(byte[] is, int i, int i_224_) {
	for (int i_225_ = i; i_225_ < i_224_ + i; i_225_++)
	    is[i_225_]
		= (byte) ((buffer
			   [(pos += 339428471) * -1133521593 - 1])
			  - 128);
    }
    
    public void method16847(byte[] is, int i, int i_226_) {
	for (int i_227_ = i; i_227_ < i_226_ + i; i_227_++)
	    is[i_227_]
		= (byte) ((buffer
			   [(pos += 339428471) * -1133521593 - 1])
			  - 128);
    }
    
    static final void method16848(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class32.method942(class259, class245, class683, (byte) 1);
    }
}
