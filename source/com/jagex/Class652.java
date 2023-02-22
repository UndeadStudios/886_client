/* Class652 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.image.BufferedImage;
import java.util.Iterator;

public abstract class Class652
{
    int anInt8388;
    long aLong8389;
    Class709 aClass709_8390 = new Class709();
    int anInt8391;
    long aLong8392;
    
    void method10746(Class525_Sub41 class525_sub41) {
	aClass709_8390.method14345(class525_sub41, (byte) 0);
    }
    
    abstract void method10747(int i);
    
    void method10748(byte i) {
	aClass709_8390.method14344(-1767389591);
	aLong8389 = -4327331142458015237L;
	aLong8392 = 7324010102844509921L;
	anInt8388 = 302229629;
	anInt8391 = -1141750483;
    }
    
    void method10749(Class525_Sub41 class525_sub41, byte i) {
	aClass709_8390.method14345(class525_sub41, (byte) 0);
    }
    
    int method10750(Class525_Sub41 class525_sub41, int i, int i_0_) {
	long l;
	if (aLong8389 * -5646451208842961203L == -1L)
	    l = (long) i;
	else {
	    l = (class525_sub41.method16860(4139197)
		 - -5646451208842961203L * aLong8389);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8389
	    = class525_sub41.method16860(864214602) * 4327331142458015237L;
	return (int) l;
    }
    
    abstract int method10751(int i);
    
    void method10752() {
	aClass709_8390.method14344(1964398499);
	aLong8389 = -4327331142458015237L;
	aLong8392 = 7324010102844509921L;
	anInt8388 = 302229629;
	anInt8391 = -1141750483;
    }
    
    void method10753() {
	aClass709_8390.method14344(908329417);
	aLong8389 = -4327331142458015237L;
	aLong8392 = 7324010102844509921L;
	anInt8388 = 302229629;
	anInt8391 = -1141750483;
    }
    
    abstract boolean method10754(short i);
    
    abstract Class525_Sub15 method10755(int i);
    
    abstract void method10756();
    
    int method10757(Class525_Sub41 class525_sub41, int i) {
	long l;
	if (aLong8389 * -5646451208842961203L == -1L)
	    l = (long) i;
	else {
	    l = (class525_sub41.method16860(808989488)
		 - -5646451208842961203L * aLong8389);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8389
	    = class525_sub41.method16860(-1419786159) * 4327331142458015237L;
	return (int) l;
    }
    
    abstract void method10758();
    
    abstract void method10759();
    
    abstract Class525_Sub15 method10760();
    
    abstract void method10761(RSBuffer class525_sub38,
							  Class525_Sub41 class525_sub41);
    
    abstract Class525_Sub15 method10762();
    
    abstract int method10763();
    
    abstract int method10764();
    
    abstract int method10765();
    
    abstract int method10766();
    
    abstract boolean method10767();
    
    Class652() {
	aLong8389 = -4327331142458015237L;
	aLong8392 = 7324010102844509921L;
	anInt8388 = 302229629;
	anInt8391 = -1141750483;
    }
    
    void method10768(byte i) {
	if (method10754((short) 2928)) {
	    Class525_Sub15 class525_sub15 = null;
	    int i_1_ = 0;
	    int i_2_ = 0;
	    int i_3_ = 0;
	    Iterator iterator = aClass709_8390.iterator();
	    while (iterator.hasNext()) {
		Class525_Sub41 class525_sub41
		    = (Class525_Sub41) iterator.next();
		if (class525_sub15 != null
		    && (-1133521593 * (class525_sub15
				       .aClass525_Sub38_Sub2_10546.index)
			- i_1_) >= 252 - (6 + method10751(-1637022749)))
		    break;
		class525_sub41.method8755(-1933461091);
		int i_4_ = class525_sub41.method16858((byte) 18);
		if (i_4_ < -1)
		    i_4_ = -1;
		else if (i_4_ > 65534)
		    i_4_ = 65534;
		int i_5_ = class525_sub41.method16870((byte) -20);
		if (i_5_ < -1)
		    i_5_ = -1;
		else if (i_5_ > 65534)
		    i_5_ = 65534;
		if (anInt8388 * 1833889579 == i_5_
		    && i_4_ == 1374334299 * anInt8391)
		    class525_sub41.method16861(962923931);
		else {
		    if (class525_sub15 == null) {
			class525_sub15 = method10755(1781028183);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(0, -486382548);
			i_1_ = (class525_sub15.aClass525_Sub38_Sub2_10546
				.index) * -1133521593;
			class525_sub15.aClass525_Sub38_Sub2_10546.index
			    += 678856942;
			i_2_ = 0;
			i_3_ = 0;
		    }
		    int i_6_;
		    int i_7_;
		    int i_8_;
		    if (aLong8392 * -335173219287725345L != -1L) {
			i_6_ = i_5_ - 1833889579 * anInt8388;
			i_7_ = i_4_ - 1374334299 * anInt8391;
			i_8_ = (int) ((class525_sub41.method16860(-1841903726)
				       - aLong8392 * -335173219287725345L)
				      / 20L);
			i_2_ += (class525_sub41.method16860(1527105997)
				 - -335173219287725345L * aLong8392) % 20L;
		    } else {
			i_6_ = i_5_;
			i_7_ = i_4_;
			i_8_ = 2147483647;
		    }
		    anInt8388 = i_5_ * -302229629;
		    anInt8391 = 1141750483 * i_4_;
		    if (i_8_ < 8 && i_6_ >= -32 && i_6_ <= 31 && i_7_ >= -32
			&& i_7_ <= 31) {
			i_6_ += 32;
			i_7_ += 32;
			class525_sub15.aClass525_Sub38_Sub2_10546.method16602
			    (i_7_ + ((i_8_ << 12) + (i_6_ << 6)), 1043909492);
		    } else if (i_8_ < 32 && i_6_ >= -128 && i_6_ <= 127
			       && i_7_ >= -128 && i_7_ <= 127) {
			i_6_ += 128;
			i_7_ += 128;
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(i_8_ + 128, -2001226800);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16602(i_7_ + (i_6_ << 8), 584564176);
		    } else if (i_8_ < 32) {
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(192 + i_8_, -2022012085);
			if (-1 == i_5_ || i_4_ == -1)
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16605(-2147483648, -928504263);
			else
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16605(i_5_ | i_4_ << 16, -2146040038);
		    } else {
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16602((i_8_ & 0x1fff) + 57344, 1688113897);
			if (-1 == i_5_ || -1 == i_4_)
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16605(-2147483648, -1980359499);
			else
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16605(i_5_ | i_4_ << 16, -260374370);
		    }
		    i_3_++;
		    method10774(class525_sub15.aClass525_Sub38_Sub2_10546,
				class525_sub41, (byte) -17);
		    aLong8392 = (class525_sub41.method16860(916912307)
				 * -7324010102844509921L);
		    class525_sub41.method16861(-124181698);
		}
	    }
	    if (null != class525_sub15) {
		class525_sub15.aClass525_Sub38_Sub2_10546.method16617
		    (-1133521593 * (class525_sub15.aClass525_Sub38_Sub2_10546
				    .index) - i_1_,
		     (byte) 7);
		int i_9_
		    = (-1133521593
		       * class525_sub15.aClass525_Sub38_Sub2_10546.index);
		class525_sub15.aClass525_Sub38_Sub2_10546.index
		    = i_1_ * 339428471;
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16735(i_2_ / i_3_, -1906609957);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16735(i_2_ % i_3_, -2011137383);
		class525_sub15.aClass525_Sub38_Sub2_10546.index
		    = 339428471 * i_9_;
		client.aClass96_11085.method1794(class525_sub15,
						 (short) 25830);
	    }
	}
	method10747(-1876196392);
    }
    
    void method10769() {
	if (method10754((short) 283)) {
	    Class525_Sub15 class525_sub15 = null;
	    int i = 0;
	    int i_10_ = 0;
	    int i_11_ = 0;
	    Iterator iterator = aClass709_8390.iterator();
	    while (iterator.hasNext()) {
		Class525_Sub41 class525_sub41
		    = (Class525_Sub41) iterator.next();
		if (class525_sub15 != null
		    && (-1133521593 * (class525_sub15
				       .aClass525_Sub38_Sub2_10546.index)
			- i) >= 252 - (6 + method10751(-1232647146)))
		    break;
		class525_sub41.method8755(-1933461091);
		int i_12_ = class525_sub41.method16858((byte) 10);
		if (i_12_ < -1)
		    i_12_ = -1;
		else if (i_12_ > 65534)
		    i_12_ = 65534;
		int i_13_ = class525_sub41.method16870((byte) -31);
		if (i_13_ < -1)
		    i_13_ = -1;
		else if (i_13_ > 65534)
		    i_13_ = 65534;
		if (anInt8388 * 1833889579 == i_13_
		    && i_12_ == 1374334299 * anInt8391)
		    class525_sub41.method16861(-8202802);
		else {
		    if (class525_sub15 == null) {
			class525_sub15 = method10755(-1125060765);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(0, -2115340070);
			i = (class525_sub15.aClass525_Sub38_Sub2_10546
			     .index) * -1133521593;
			class525_sub15.aClass525_Sub38_Sub2_10546.index
			    += 678856942;
			i_10_ = 0;
			i_11_ = 0;
		    }
		    int i_14_;
		    int i_15_;
		    int i_16_;
		    if (aLong8392 * -335173219287725345L != -1L) {
			i_14_ = i_13_ - 1833889579 * anInt8388;
			i_15_ = i_12_ - 1374334299 * anInt8391;
			i_16_ = (int) ((class525_sub41.method16860(-1969030251)
					- aLong8392 * -335173219287725345L)
				       / 20L);
			i_10_ += (class525_sub41.method16860(-2049223756)
				  - -335173219287725345L * aLong8392) % 20L;
		    } else {
			i_14_ = i_13_;
			i_15_ = i_12_;
			i_16_ = 2147483647;
		    }
		    anInt8388 = i_13_ * -302229629;
		    anInt8391 = 1141750483 * i_12_;
		    if (i_16_ < 8 && i_14_ >= -32 && i_14_ <= 31
			&& i_15_ >= -32 && i_15_ <= 31) {
			i_14_ += 32;
			i_15_ += 32;
			class525_sub15.aClass525_Sub38_Sub2_10546.method16602
			    (i_15_ + ((i_16_ << 12) + (i_14_ << 6)),
			     1185227158);
		    } else if (i_16_ < 32 && i_14_ >= -128 && i_14_ <= 127
			       && i_15_ >= -128 && i_15_ <= 127) {
			i_14_ += 128;
			i_15_ += 128;
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(i_16_ + 128, -1553290730);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16602(i_15_ + (i_14_ << 8), 815115352);
		    } else if (i_16_ < 32) {
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16735(192 + i_16_, -274275270);
			if (-1 == i_13_ || i_12_ == -1)
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16605(-2147483648, -1326693973);
			else
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16605(i_13_ | i_12_ << 16, -1291770245);
		    } else {
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16602((i_16_ & 0x1fff) + 57344, 738489352);
			if (-1 == i_13_ || -1 == i_12_)
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16605(-2147483648, -501928607);
			else
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16605(i_13_ | i_12_ << 16, -1065185043);
		    }
		    i_11_++;
		    method10774(class525_sub15.aClass525_Sub38_Sub2_10546,
				class525_sub41, (byte) -29);
		    aLong8392 = (class525_sub41.method16860(282786501)
				 * -7324010102844509921L);
		    class525_sub41.method16861(652598764);
		}
	    }
	    if (null != class525_sub15) {
		class525_sub15.aClass525_Sub38_Sub2_10546.method16617
		    (-1133521593 * (class525_sub15.aClass525_Sub38_Sub2_10546
				    .index) - i,
		     (byte) 7);
		int i_17_
		    = (-1133521593
		       * class525_sub15.aClass525_Sub38_Sub2_10546.index);
		class525_sub15.aClass525_Sub38_Sub2_10546.index
		    = i * 339428471;
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16735(i_10_ / i_11_, -1172808733);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16735(i_10_ % i_11_, -361878619);
		class525_sub15.aClass525_Sub38_Sub2_10546.index
		    = 339428471 * i_17_;
		client.aClass96_11085.method1794(class525_sub15,
						 (short) 21873);
	    }
	}
	method10747(-1453441489);
    }
    
    void method10770(Class525_Sub41 class525_sub41) {
	aClass709_8390.method14345(class525_sub41, (byte) 0);
    }
    
    abstract Class525_Sub15 method10771();
    
    int method10772(Class525_Sub41 class525_sub41, int i) {
	long l;
	if (aLong8389 * -5646451208842961203L == -1L)
	    l = (long) i;
	else {
	    l = (class525_sub41.method16860(1801402495)
		 - -5646451208842961203L * aLong8389);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8389
	    = class525_sub41.method16860(-1955965139) * 4327331142458015237L;
	return (int) l;
    }
    
    int method10773(Class525_Sub41 class525_sub41, int i) {
	long l;
	if (aLong8389 * -5646451208842961203L == -1L)
	    l = (long) i;
	else {
	    l = (class525_sub41.method16860(-1299945929)
		 - -5646451208842961203L * aLong8389);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8389
	    = class525_sub41.method16860(-1122718606) * 4327331142458015237L;
	return (int) l;
    }
    
    abstract void method10774(RSBuffer class525_sub38,
							  Class525_Sub41 class525_sub41, byte i);
    
    public static int[] method10775(BufferedImage bufferedimage, int i) {
	if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
	    int[] is = null;
	    is = bufferedimage.getRaster().getPixels(0, 0,
						     bufferedimage.getWidth(),
						     bufferedimage.getHeight(),
						     is);
	    int[] is_18_
		= (new int
		   [bufferedimage.getWidth() * bufferedimage.getHeight()]);
	    if (bufferedimage.getType() == 10) {
		for (int i_19_ = 0; i_19_ < is_18_.length; i_19_++)
		    is_18_[i_19_] = ((is[i_19_] << 8) + (is[i_19_] << 16)
				     + is[i_19_] + -16777216);
	    } else {
		for (int i_20_ = 0; i_20_ < is_18_.length; i_20_++) {
		    int i_21_ = 2 * i_20_;
		    is_18_[i_20_] = ((is[i_21_ + 1] << 24) + is[i_21_]
				     + ((is[i_21_] << 16) + (is[i_21_] << 8)));
		}
	    }
	    return is_18_;
	}
	return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(),
				    bufferedimage.getHeight(), null, 0,
				    bufferedimage.getWidth());
    }
    
    static final void method10776(Class683 class683, int i) {
	int i_22_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_22_ >> 14 & 0x3fff;
    }
    
    static final void method10777(long l) {
	Class446 class446
	    = (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818()
	       .aClass446_4807);
	int i = (int) class446.aFloat4895 + client.anInt11160 * 864319767;
	int i_23_ = client.anInt11094 * 1282768989 + (int) class446.aFloat4897;
	if (Class275.anInt2867 * 1497781253 - i < -2000
	    || 1497781253 * Class275.anInt2867 - i > 2000
	    || Class381.anInt3930 * 1222586347 - i_23_ < -2000
	    || Class381.anInt3930 * 1222586347 - i_23_ > 2000) {
	    Class275.anInt2867 = i * 757684429;
	    Class381.anInt3930 = -1193574205 * i_23_;
	}
	if (1497781253 * Class275.anInt2867 != i) {
	    int i_24_ = i - 1497781253 * Class275.anInt2867;
	    int i_25_ = (int) ((long) i_24_ * l / 320L);
	    if (i_24_ > 0) {
		if (i_25_ == 0)
		    i_25_ = 1;
		else if (i_25_ > i_24_)
		    i_25_ = i_24_;
	    } else if (0 == i_25_)
		i_25_ = -1;
	    else if (i_25_ < i_24_)
		i_25_ = i_24_;
	    Class275.anInt2867 += i_25_ * 757684429;
	}
	if (1222586347 * Class381.anInt3930 != i_23_) {
	    int i_26_ = i_23_ - 1222586347 * Class381.anInt3930;
	    int i_27_ = (int) ((long) i_26_ * l / 320L);
	    if (i_26_ > 0) {
		if (i_27_ == 0)
		    i_27_ = 1;
		else if (i_27_ > i_26_)
		    i_27_ = i_26_;
	    } else if (i_27_ == 0)
		i_27_ = -1;
	    else if (i_27_ < i_26_)
		i_27_ = i_26_;
	    Class381.anInt3930 += i_27_ * -1193574205;
	}
	client.aFloat11052 += (float) l * client.aFloat11172 / 6.0F;
	client.aFloat11176 += (float) l * client.aFloat11179 / 6.0F;
	Class76.method1559(451175203);
    }
    
    static final void method10778(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4310,
				client.aClass96_11085.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16735(string.length() + 1, -1305449066);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
							      -1212429222);
	client.aClass96_11085.method1794(class525_sub15, (short) 12693);
    }
}
