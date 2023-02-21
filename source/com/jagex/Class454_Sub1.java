/* Class454_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.zip.CRC32;

public class Class454_Sub1 extends Class454
{
    static final int anInt10351 = 0;
    Class525_Sub16_Sub12 aClass525_Sub16_Sub12_10352;
    static final byte aByte10353 = 1;
    Class466 aClass466_10354;
    Class552 aClass552_10355;
    int anInt10356;
    byte[] aByteArray10357;
    int anInt10358;
    byte[] aByteArray10359;
    int anInt10360;
    Class461 aClass461_10361;
    static final byte aByte10362 = 0;
    Class709 aClass709_10363;
    static final byte aByte10364 = -1;
    boolean aBool10365;
    int anInt10366 = 0;
    Class10 aClass10_10367 = new Class10(16);
    int anInt10368 = 0;
    boolean aBool10369;
    boolean aBool10370;
    static final int anInt10371 = 2;
    Class709 aClass709_10372;
    static CRC32 aCRC32_10373 = new CRC32();
    boolean aBool10374;
    Class552 aClass552_10375;
    static final int anInt10376 = 1000;
    static final int anInt10377 = 250;
    Class463 aClass463_10378;
    long aLong10379;
    static final int anInt10380 = 1;
    Class470 aClass470_10381;
    
    public int method15997() {
	if (method7361(-2021659291) == null) {
	    if (aClass525_Sub16_Sub12_10352 == null)
		return 0;
	    return aClass525_Sub16_Sub12_10352.method18445(-1558882534);
	}
	return 100;
    }
    
    void method15998(int i, byte[] is, int i_0_, int i_1_, short i_2_) {
	if (!method15999(i, is, i_0_, i_1_, 18382869)) {
	    anInt10358 = 1642209579 * i;
	    aByteArray10359 = is;
	    anInt10360 = 1790729059 * i_0_;
	    aClass461_10361 = null;
	    aClass525_Sub16_Sub12_10352 = null;
	    if (!aClass463_10378.method7613(-1370300329))
		aClass525_Sub16_Sub12_10352
		    = aClass463_10378.method7611(255, 833837449 * anInt10356,
						 (byte) 0, true, 2001325662);
	}
    }
    
    boolean method15999(int i, byte[] is, int i_3_, int i_4_, int i_5_) {
	if (i == anInt10358 * -126773885 && i_3_ == anInt10360 * 148373067) {
	    boolean bool = true;
	    for (int i_6_ = 0; i_6_ < aByteArray10359.length; i_6_++) {
		if (aByteArray10359[i_6_] != is[i_6_]) {
		    bool = false;
		    break;
		}
	    }
	    if (bool)
		return true;
	}
	return false;
    }
    
    public int method16000(byte i) {
	if (method7361(-2021659291) == null) {
	    if (aClass525_Sub16_Sub12_10352 == null)
		return 0;
	    return aClass525_Sub16_Sub12_10352.method18445(1940471467);
	}
	return 100;
    }
    
    boolean method16001() {
	return aClass470_10381 != null;
    }
    
    byte[] method7370(int i, byte i_7_) {
	Class525_Sub16_Sub12 class525_sub16_sub12
	    = method16012(i, 0, (byte) -119);
	if (null == class525_sub16_sub12)
	    return null;
	byte[] is = class525_sub16_sub12.method18447(-1253379280);
	class525_sub16_sub12.method8755(-1933461091);
	return is;
    }
    
    Class461 method7361(int i) {
	if (null != aClass461_10361)
	    return aClass461_10361;
	if (aClass525_Sub16_Sub12_10352 == null) {
	    if (aClass463_10378.method7613(-1370300329))
		return null;
	    aClass525_Sub16_Sub12_10352
		= aClass463_10378.method7611(255, 833837449 * anInt10356,
					     (byte) 0, true, 1825387332);
	}
	if (aClass525_Sub16_Sub12_10352.aBool11832)
	    return null;
	byte[] is = aClass525_Sub16_Sub12_10352.method18447(-1254067418);
	if (aClass525_Sub16_Sub12_10352 instanceof Class525_Sub16_Sub12_Sub2) {
	    try {
		if (null == is)
		    throw new RuntimeException();
		aClass461_10361 = new Class461(is, -126773885 * anInt10358,
					       aByteArray10359);
		if (anInt10360 * 148373067
		    != aClass461_10361.anInt5076 * 591215185)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		aClass461_10361 = null;
		if (aClass463_10378.method7613(-1370300329))
		    aClass525_Sub16_Sub12_10352 = null;
		else
		    aClass525_Sub16_Sub12_10352
			= aClass463_10378.method7611(255,
						     anInt10356 * 833837449,
						     (byte) 0, true,
						     1617565520);
		return null;
	    }
	} else {
	    try {
		if (null == is)
		    throw new RuntimeException();
		aClass461_10361 = new Class461(is, -126773885 * anInt10358,
					       aByteArray10359);
	    } catch (RuntimeException runtimeexception) {
		aClass463_10378.method7630(255, 833837449 * anInt10356,
					   -447114810);
		aClass461_10361 = null;
		if (aClass463_10378.method7613(-1370300329))
		    aClass525_Sub16_Sub12_10352 = null;
		else
		    aClass525_Sub16_Sub12_10352
			= aClass463_10378.method7611(255,
						     anInt10356 * 833837449,
						     (byte) 0, true,
						     1844756257);
		return null;
	    }
	    if (aClass552_10375 != null)
		aClass466_10354.method7673(anInt10356 * 833837449, is,
					   aClass552_10375, 1437841503);
	}
	aClass525_Sub16_Sub12_10352 = null;
	if (aClass552_10355 != null) {
	    aByteArray10357 = new byte[1259617575 * aClass461_10361.anInt5079];
	    anInt10366 = 0;
	}
	return aClass461_10361;
    }
    
    void method16002(int i) {
	if (null != aClass709_10372 && method7361(-2021659291) != null) {
	    for (Class525 class525
		     = aClass709_10363.method14372((short) -28154);
		 null != class525;
		 class525 = aClass709_10363.method14353(-1127611477)) {
		int i_8_ = (int) (class525.aLong7113 * -5126207504388691097L);
		if (i_8_ < 0 || i_8_ >= 1259617575 * aClass461_10361.anInt5079
		    || 0 == aClass461_10361.anIntArray5086[i_8_])
		    class525.method8755(-1933461091);
		else {
		    if (0 == aByteArray10357[i_8_])
			method16012(i_8_, 1, (byte) -2);
		    if (aByteArray10357[i_8_] == -1)
			method16012(i_8_, 2, (byte) -51);
		    if (aByteArray10357[i_8_] == 1)
			class525.method8755(-1933461091);
		}
	    }
	}
    }
    
    void method16003(int i) {
	if (null != aClass709_10372) {
	    if (method7361(-2021659291) == null)
		return;
	    if (aBool10370) {
		boolean bool = true;
		for (Class525 class525
			 = aClass709_10372.method14372((short) -14716);
		     class525 != null;
		     class525 = aClass709_10372.method14353(-1934409848)) {
		    int i_9_
			= (int) (class525.aLong7113 * -5126207504388691097L);
		    if (aByteArray10357[i_9_] == 0)
			method16012(i_9_, 1, (byte) -42);
		    if (aByteArray10357[i_9_] != 0)
			class525.method8755(-1933461091);
		    else
			bool = false;
		}
		while (anInt10368 * 1697131505
		       < aClass461_10361.anIntArray5086.length) {
		    if (0 == (aClass461_10361.anIntArray5086
			      [1697131505 * anInt10368]))
			anInt10368 += -101751535;
		    else {
			if (929723103 * aClass466_10354.anInt5122 >= 250) {
			    bool = false;
			    break;
			}
			if (0 == aByteArray10357[anInt10368 * 1697131505])
			    method16012(anInt10368 * 1697131505, 1, (byte) -3);
			if (0 == aByteArray10357[1697131505 * anInt10368]) {
			    Class525 class525 = new Class525();
			    class525.aLong7113
				= (long) anInt10368 * 8830171549014126311L;
			    aClass709_10372.method14345(class525, (byte) 0);
			    bool = false;
			}
			anInt10368 += -101751535;
		    }
		}
		if (bool) {
		    aBool10370 = false;
		    anInt10368 = 0;
		}
	    } else if (aBool10365) {
		boolean bool = true;
		for (Class525 class525
			 = aClass709_10372.method14372((short) -14548);
		     class525 != null;
		     class525 = aClass709_10372.method14353(-2146838534)) {
		    int i_10_
			= (int) (class525.aLong7113 * -5126207504388691097L);
		    if (1 != aByteArray10357[i_10_])
			method16012(i_10_, 2, (byte) -83);
		    if (aByteArray10357[i_10_] == 1)
			class525.method8755(-1933461091);
		    else
			bool = false;
		}
		while (anInt10368 * 1697131505
		       < aClass461_10361.anIntArray5086.length) {
		    if (0 == (aClass461_10361.anIntArray5086
			      [anInt10368 * 1697131505]))
			anInt10368 += -101751535;
		    else {
			if (aClass463_10378.method7612(688531380)) {
			    bool = false;
			    break;
			}
			if (1 != aByteArray10357[anInt10368 * 1697131505])
			    method16012(anInt10368 * 1697131505, 2,
					(byte) -30);
			if (aByteArray10357[anInt10368 * 1697131505] != 1) {
			    Class525 class525 = new Class525();
			    class525.aLong7113
				= (long) anInt10368 * 8830171549014126311L;
			    aClass709_10372.method14345(class525, (byte) 0);
			    bool = false;
			}
			anInt10368 += -101751535;
		    }
		}
		if (bool) {
		    aBool10365 = false;
		    anInt10368 = 0;
		}
	    } else
		aClass709_10372 = null;
	}
	if (aBool10374 && (Class251.method4508((byte) 8)
			   >= aLong10379 * 7595069598973812269L)) {
	    for (Class525_Sub16_Sub12 class525_sub16_sub12
		     = ((Class525_Sub16_Sub12)
			aClass10_10367.method689(1727214971));
		 class525_sub16_sub12 != null;
		 class525_sub16_sub12
		     = ((Class525_Sub16_Sub12)
			aClass10_10367.method690((byte) 86))) {
		if (!class525_sub16_sub12.aBool11832) {
		    if (class525_sub16_sub12.aBool11833) {
			if (!class525_sub16_sub12.aBool11834)
			    throw new RuntimeException();
			class525_sub16_sub12.method8755(-1933461091);
		    } else
			class525_sub16_sub12.aBool11833 = true;
		}
	    }
	    aLong10379 = ((Class251.method4508((byte) 8) + 1000L)
			  * 6537272328871879077L);
	}
    }
    
    public int method16004() {
	if (aClass461_10361 == null)
	    return 0;
	return aClass461_10361.anInt5075 * 1628852347;
    }
    
    public int method16005(int i) {
	return -555625729 * anInt10366;
    }
    
    public int method16006(int i) {
	if (null == aClass461_10361)
	    return 0;
	if (!aBool10370)
	    return 1628852347 * aClass461_10361.anInt5075;
	Class525 class525 = aClass709_10372.method14372((short) -15522);
	if (null == class525)
	    return 0;
	return (int) (-5126207504388691097L * class525.aLong7113);
    }
    
    public int method16007(int i) {
	if (aClass461_10361 == null)
	    return 0;
	return aClass461_10361.anInt5075 * 1628852347;
    }
    
    public int method16008() {
	if (method7361(-2021659291) == null) {
	    if (aClass525_Sub16_Sub12_10352 == null)
		return 0;
	    return aClass525_Sub16_Sub12_10352.method18445(-545635165);
	}
	return 100;
    }
    
    int method7362(int i, byte i_11_) {
	Class525_Sub16_Sub12 class525_sub16_sub12
	    = (Class525_Sub16_Sub12) aClass10_10367.method684((long) i);
	if (null != class525_sub16_sub12)
	    return class525_sub16_sub12.method18445(-2060709365);
	return 0;
    }
    
    public boolean method16009(int i) {
	return aBool10369;
    }
    
    void method16010(boolean bool, int i) {
	aClass470_10381.method7721(bool, 804523715);
    }
    
    boolean method16011(byte i) {
	return aClass470_10381 != null;
    }
    
    Class454_Sub1(int i, Class552 class552, Class552 class552_12_,
		  Class463 class463, Class470 class470, Class466 class466,
		  int i_13_, byte[] is, int i_14_, boolean bool, int i_15_) {
	aClass709_10363 = new Class709();
	aLong10379 = 0L;
	anInt10356 = i * -477434695;
	aClass552_10355 = class552;
	if (aClass552_10355 == null)
	    aBool10370 = false;
	else {
	    aBool10370 = true;
	    aClass709_10372 = new Class709();
	}
	aClass552_10375 = class552_12_;
	aClass463_10378 = class463;
	aClass470_10381 = class470;
	aClass466_10354 = class466;
	anInt10358 = i_13_ * 1642209579;
	aByteArray10359 = is;
	anInt10360 = 1790729059 * i_14_;
	aBool10374 = bool;
	if (null != aClass552_10375)
	    aClass525_Sub16_Sub12_10352
		= aClass466_10354.method7685(833837449 * anInt10356,
					     aClass552_10375, (byte) -29);
    }
    
    Class461 method7366() {
	if (null != aClass461_10361)
	    return aClass461_10361;
	if (aClass525_Sub16_Sub12_10352 == null) {
	    if (aClass463_10378.method7613(-1370300329))
		return null;
	    aClass525_Sub16_Sub12_10352
		= aClass463_10378.method7611(255, 833837449 * anInt10356,
					     (byte) 0, true, 2001122430);
	}
	if (aClass525_Sub16_Sub12_10352.aBool11832)
	    return null;
	byte[] is = aClass525_Sub16_Sub12_10352.method18447(-839445822);
	if (aClass525_Sub16_Sub12_10352 instanceof Class525_Sub16_Sub12_Sub2) {
	    try {
		if (null == is)
		    throw new RuntimeException();
		aClass461_10361 = new Class461(is, -126773885 * anInt10358,
					       aByteArray10359);
		if (anInt10360 * 148373067
		    != aClass461_10361.anInt5076 * 591215185)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		aClass461_10361 = null;
		if (aClass463_10378.method7613(-1370300329))
		    aClass525_Sub16_Sub12_10352 = null;
		else
		    aClass525_Sub16_Sub12_10352
			= aClass463_10378.method7611(255,
						     anInt10356 * 833837449,
						     (byte) 0, true,
						     1997755473);
		return null;
	    }
	} else {
	    try {
		if (null == is)
		    throw new RuntimeException();
		aClass461_10361 = new Class461(is, -126773885 * anInt10358,
					       aByteArray10359);
	    } catch (RuntimeException runtimeexception) {
		aClass463_10378.method7630(255, 833837449 * anInt10356,
					   -1166963641);
		aClass461_10361 = null;
		if (aClass463_10378.method7613(-1370300329))
		    aClass525_Sub16_Sub12_10352 = null;
		else
		    aClass525_Sub16_Sub12_10352
			= aClass463_10378.method7611(255,
						     anInt10356 * 833837449,
						     (byte) 0, true,
						     2145656396);
		return null;
	    }
	    if (aClass552_10375 != null)
		aClass466_10354.method7673(anInt10356 * 833837449, is,
					   aClass552_10375, 1614839984);
	}
	aClass525_Sub16_Sub12_10352 = null;
	if (aClass552_10355 != null) {
	    aByteArray10357 = new byte[1259617575 * aClass461_10361.anInt5079];
	    anInt10366 = 0;
	}
	return aClass461_10361;
    }
    
    byte[] method7360(int i) {
	Class525_Sub16_Sub12 class525_sub16_sub12
	    = method16012(i, 0, (byte) -109);
	if (null == class525_sub16_sub12)
	    return null;
	byte[] is = class525_sub16_sub12.method18447(-898411223);
	class525_sub16_sub12.method8755(-1933461091);
	return is;
    }
    
    int method7371(int i) {
	Class525_Sub16_Sub12 class525_sub16_sub12
	    = (Class525_Sub16_Sub12) aClass10_10367.method684((long) i);
	if (null != class525_sub16_sub12)
	    return class525_sub16_sub12.method18445(2099373693);
	return 0;
    }
    
    Class525_Sub16_Sub12 method16012(int i, int i_16_, byte i_17_) {
	Class525_Sub16_Sub12 class525_sub16_sub12
	    = (Class525_Sub16_Sub12) aClass10_10367.method684((long) i);
	if (null != class525_sub16_sub12 && 0 == i_16_
	    && !class525_sub16_sub12.aBool11834
	    && class525_sub16_sub12.aBool11832) {
	    class525_sub16_sub12.method8755(-1933461091);
	    class525_sub16_sub12 = null;
	}
	if (class525_sub16_sub12 == null) {
	    if (i_16_ == 0) {
		if (null != aClass552_10355 && -1 != aByteArray10357[i])
		    class525_sub16_sub12
			= aClass466_10354.method7685(i, aClass552_10355,
						     (byte) -70);
		else if (aClass470_10381 != null) {
		    class525_sub16_sub12
			= aClass470_10381.method7718(833837449 * anInt10356, i,
						     (byte) 2, true,
						     (aClass461_10361
						      .anIntArray5080[i]),
						     (aClass461_10361
						      .anIntArray5089[i]),
						     1741965377);
		    if (null == class525_sub16_sub12)
			return null;
		} else if (!aClass463_10378.method7613(-1370300329))
		    class525_sub16_sub12
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, true,
						     1727626141);
		else
		    return null;
	    } else if (1 == i_16_) {
		if (null == aClass552_10355)
		    throw new RuntimeException();
		class525_sub16_sub12
		    = aClass466_10354.method7674(i, aClass552_10355,
						 173734264);
	    } else if (2 == i_16_) {
		if (null == aClass552_10355)
		    throw new RuntimeException();
		if (aByteArray10357[i] != -1)
		    throw new RuntimeException();
		if (null != aClass470_10381)
		    return null;
		if (!aClass463_10378.method7612(2021824750))
		    class525_sub16_sub12
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, false,
						     2044134187);
		else
		    return null;
	    } else
		throw new RuntimeException();
	    aClass10_10367.method695(class525_sub16_sub12, (long) i);
	}
	if (class525_sub16_sub12.aBool11832)
	    return null;
	byte[] is = class525_sub16_sub12.method18447(-1649235321);
	if (class525_sub16_sub12 instanceof Class525_Sub16_Sub12_Sub2) {
	    Class525_Sub16_Sub12 class525_sub16_sub12_18_;
	    try {
		if (null == is || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10373.reset();
		aCRC32_10373.update(is, 0, is.length - 2);
		int i_19_ = (int) aCRC32_10373.getValue();
		if (aClass461_10361.anIntArray5080[i] != i_19_)
		    throw new RuntimeException();
		if (aClass461_10361.aByteArrayArray5082 != null
		    && null != aClass461_10361.aByteArrayArray5082[i]) {
		    byte[] is_20_ = aClass461_10361.aByteArrayArray5082[i];
		    byte[] is_21_ = Class510.method8505(is, 0, is.length - 2,
							(byte) -27);
		    for (int i_22_ = 0; i_22_ < 64; i_22_++) {
			if (is_21_[i_22_] != is_20_[i_22_])
			    throw new RuntimeException();
		    }
		}
		int i_23_ = (((is[is.length - 2] & 0xff) << 8)
			     + (is[is.length - 1] & 0xff));
		if ((aClass461_10361.anIntArray5089[i] & 0xffff) != i_23_)
		    throw new RuntimeException();
		if (aByteArray10357[i] != 1) {
		    if (0 != aByteArray10357[i]) {
			/* empty */
		    }
		    anInt10366 += -2110444289;
		    aByteArray10357[i] = (byte) 1;
		}
		if (!class525_sub16_sub12.aBool11834)
		    class525_sub16_sub12.method8755(-1933461091);
		class525_sub16_sub12_18_ = class525_sub16_sub12;
	    } catch (Exception exception) {
		aByteArray10357[i] = (byte) -1;
		class525_sub16_sub12.method8755(-1933461091);
		if (class525_sub16_sub12.aBool11834) {
		    if (null != aClass470_10381) {
			if (!aClass470_10381.method7716(-943880270)) {
			    Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3
				= (aClass470_10381.method7718
				   (833837449 * anInt10356, i, (byte) 2, true,
				    aClass461_10361.anIntArray5080[i],
				    aClass461_10361.anIntArray5089[i],
				    -44988798));
			    if (class525_sub16_sub12_sub3 != null)
				aClass10_10367.method695
				    (class525_sub16_sub12_sub3, (long) i);
			}
		    } else if (!aClass463_10378.method7613(-1370300329)) {
			Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
			    = aClass463_10378.method7611((anInt10356
							  * 833837449),
							 i, (byte) 2, true,
							 2060211625);
			aClass10_10367.method695(class525_sub16_sub12_sub1,
						 (long) i);
		    }
		}
		return null;
	    }
	    return class525_sub16_sub12_18_;
	}
	try {
	    if (is == null || is.length <= 2) {
		if (null != aClass470_10381) {
		    class525_sub16_sub12.method8755(-1933461091);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10373.reset();
	    aCRC32_10373.update(is, 0, is.length - 2);
	    int i_24_ = (int) aCRC32_10373.getValue();
	    if (i_24_ != aClass461_10361.anIntArray5080[i])
		throw new RuntimeException();
	    if (aClass461_10361.aByteArrayArray5082 != null
		&& aClass461_10361.aByteArrayArray5082[i] != null) {
		byte[] is_25_ = aClass461_10361.aByteArrayArray5082[i];
		byte[] is_26_
		    = Class510.method8505(is, 0, is.length - 2, (byte) -38);
		for (int i_27_ = 0; i_27_ < 64; i_27_++) {
		    if (is_26_[i_27_] != is_25_[i_27_])
			throw new RuntimeException();
		}
	    }
	    if (null != aClass470_10381) {
		aClass463_10378.anInt5114 = 0;
		aClass463_10378.anInt5112 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    aClass463_10378.method7630(833837449 * anInt10356, i, -621253666);
	    class525_sub16_sub12.method8755(-1933461091);
	    if (class525_sub16_sub12.aBool11834) {
		if (null != aClass470_10381) {
		    if (!aClass470_10381.method7716(-519855953)) {
			Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3
			    = (aClass470_10381.method7718
			       (833837449 * anInt10356, i, (byte) 2, true,
				aClass461_10361.anIntArray5080[i],
				aClass461_10361.anIntArray5089[i], 433312208));
			if (class525_sub16_sub12_sub3 != null)
			    aClass10_10367.method695(class525_sub16_sub12_sub3,
						     (long) i);
		    }
		} else if (!aClass463_10378.method7613(-1370300329)) {
		    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, true,
						     2104948510);
		    aClass10_10367.method695(class525_sub16_sub12_sub1,
					     (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2] = (byte) (aClass461_10361.anIntArray5089[i] >>> 8);
	is[is.length - 1] = (byte) aClass461_10361.anIntArray5089[i];
	if (null != aClass552_10355) {
	    aClass466_10354.method7673(i, is, aClass552_10355, 86509542);
	    if (aByteArray10357[i] != 1) {
		anInt10366 += -2110444289;
		aByteArray10357[i] = (byte) 1;
	    }
	}
	if (!class525_sub16_sub12.aBool11834)
	    class525_sub16_sub12.method8755(-1933461091);
	return class525_sub16_sub12;
    }
    
    void method7369(int i) {
	if (aClass552_10355 != null) {
	    for (Class525 class525
		     = aClass709_10363.method14372((short) -2518);
		 class525 != null;
		 class525 = aClass709_10363.method14353(-2077327862)) {
		if ((long) i == -5126207504388691097L * class525.aLong7113)
		    return;
	    }
	    Class525 class525 = new Class525();
	    class525.aLong7113 = (long) i * 2638983450515767383L;
	    aClass709_10363.method14345(class525, (byte) 0);
	}
    }
    
    public boolean method16013() {
	return aBool10369;
    }
    
    public void method16014() {
	if (null == aClass470_10381 && aClass552_10355 != null) {
	    aBool10365 = true;
	    aBool10369 = true;
	    if (aClass709_10372 == null)
		aClass709_10372 = new Class709();
	}
    }
    
    int method7372(int i) {
	Class525_Sub16_Sub12 class525_sub16_sub12
	    = (Class525_Sub16_Sub12) aClass10_10367.method684((long) i);
	if (null != class525_sub16_sub12)
	    return class525_sub16_sub12.method18445(-1944268063);
	return 0;
    }
    
    void method16015(int i, byte[] is, int i_28_, int i_29_) {
	if (!method15999(i, is, i_28_, i_29_, 18382869)) {
	    anInt10358 = 1642209579 * i;
	    aByteArray10359 = is;
	    anInt10360 = 1790729059 * i_28_;
	    aClass461_10361 = null;
	    aClass525_Sub16_Sub12_10352 = null;
	    if (!aClass463_10378.method7613(-1370300329))
		aClass525_Sub16_Sub12_10352
		    = aClass463_10378.method7611(255, 833837449 * anInt10356,
						 (byte) 0, true, 1877843117);
	}
    }
    
    boolean method16016(int i, byte[] is, int i_30_, int i_31_) {
	if (i == anInt10358 * -126773885 && i_30_ == anInt10360 * 148373067) {
	    boolean bool = true;
	    for (int i_32_ = 0; i_32_ < aByteArray10359.length; i_32_++) {
		if (aByteArray10359[i_32_] != is[i_32_]) {
		    bool = false;
		    break;
		}
	    }
	    if (bool)
		return true;
	}
	return false;
    }
    
    public int method16017() {
	if (method7361(-2021659291) == null) {
	    if (aClass525_Sub16_Sub12_10352 == null)
		return 0;
	    return aClass525_Sub16_Sub12_10352.method18445(786101632);
	}
	return 100;
    }
    
    void method16018(boolean bool) {
	aClass470_10381.method7721(bool, 1814768698);
    }
    
    boolean method16019() {
	return aClass470_10381 != null;
    }
    
    Class525_Sub16_Sub12 method16020(int i, int i_33_) {
	Class525_Sub16_Sub12 class525_sub16_sub12
	    = (Class525_Sub16_Sub12) aClass10_10367.method684((long) i);
	if (null != class525_sub16_sub12 && 0 == i_33_
	    && !class525_sub16_sub12.aBool11834
	    && class525_sub16_sub12.aBool11832) {
	    class525_sub16_sub12.method8755(-1933461091);
	    class525_sub16_sub12 = null;
	}
	if (class525_sub16_sub12 == null) {
	    if (i_33_ == 0) {
		if (null != aClass552_10355 && -1 != aByteArray10357[i])
		    class525_sub16_sub12
			= aClass466_10354.method7685(i, aClass552_10355,
						     (byte) -57);
		else if (aClass470_10381 != null) {
		    class525_sub16_sub12
			= aClass470_10381.method7718(833837449 * anInt10356, i,
						     (byte) 2, true,
						     (aClass461_10361
						      .anIntArray5080[i]),
						     (aClass461_10361
						      .anIntArray5089[i]),
						     1919065835);
		    if (null == class525_sub16_sub12)
			return null;
		} else if (!aClass463_10378.method7613(-1370300329))
		    class525_sub16_sub12
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, true,
						     1890273866);
		else
		    return null;
	    } else if (1 == i_33_) {
		if (null == aClass552_10355)
		    throw new RuntimeException();
		class525_sub16_sub12
		    = aClass466_10354.method7674(i, aClass552_10355,
						 -1316381642);
	    } else if (2 == i_33_) {
		if (null == aClass552_10355)
		    throw new RuntimeException();
		if (aByteArray10357[i] != -1)
		    throw new RuntimeException();
		if (null != aClass470_10381)
		    return null;
		if (!aClass463_10378.method7612(1295665450))
		    class525_sub16_sub12
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, false,
						     1780334362);
		else
		    return null;
	    } else
		throw new RuntimeException();
	    aClass10_10367.method695(class525_sub16_sub12, (long) i);
	}
	if (class525_sub16_sub12.aBool11832)
	    return null;
	byte[] is = class525_sub16_sub12.method18447(-1064379981);
	if (class525_sub16_sub12 instanceof Class525_Sub16_Sub12_Sub2) {
	    Class525_Sub16_Sub12 class525_sub16_sub12_34_;
	    try {
		if (null == is || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10373.reset();
		aCRC32_10373.update(is, 0, is.length - 2);
		int i_35_ = (int) aCRC32_10373.getValue();
		if (aClass461_10361.anIntArray5080[i] != i_35_)
		    throw new RuntimeException();
		if (aClass461_10361.aByteArrayArray5082 != null
		    && null != aClass461_10361.aByteArrayArray5082[i]) {
		    byte[] is_36_ = aClass461_10361.aByteArrayArray5082[i];
		    byte[] is_37_ = Class510.method8505(is, 0, is.length - 2,
							(byte) -44);
		    for (int i_38_ = 0; i_38_ < 64; i_38_++) {
			if (is_37_[i_38_] != is_36_[i_38_])
			    throw new RuntimeException();
		    }
		}
		int i_39_ = (((is[is.length - 2] & 0xff) << 8)
			     + (is[is.length - 1] & 0xff));
		if ((aClass461_10361.anIntArray5089[i] & 0xffff) != i_39_)
		    throw new RuntimeException();
		if (aByteArray10357[i] != 1) {
		    if (0 != aByteArray10357[i]) {
			/* empty */
		    }
		    anInt10366 += -2110444289;
		    aByteArray10357[i] = (byte) 1;
		}
		if (!class525_sub16_sub12.aBool11834)
		    class525_sub16_sub12.method8755(-1933461091);
		class525_sub16_sub12_34_ = class525_sub16_sub12;
	    } catch (Exception exception) {
		aByteArray10357[i] = (byte) -1;
		class525_sub16_sub12.method8755(-1933461091);
		if (class525_sub16_sub12.aBool11834) {
		    if (null != aClass470_10381) {
			if (!aClass470_10381.method7716(-115155494)) {
			    Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3
				= (aClass470_10381.method7718
				   (833837449 * anInt10356, i, (byte) 2, true,
				    aClass461_10361.anIntArray5080[i],
				    aClass461_10361.anIntArray5089[i],
				    -50754152));
			    if (class525_sub16_sub12_sub3 != null)
				aClass10_10367.method695
				    (class525_sub16_sub12_sub3, (long) i);
			}
		    } else if (!aClass463_10378.method7613(-1370300329)) {
			Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
			    = aClass463_10378.method7611((anInt10356
							  * 833837449),
							 i, (byte) 2, true,
							 1594905575);
			aClass10_10367.method695(class525_sub16_sub12_sub1,
						 (long) i);
		    }
		}
		return null;
	    }
	    return class525_sub16_sub12_34_;
	}
	try {
	    if (is == null || is.length <= 2) {
		if (null != aClass470_10381) {
		    class525_sub16_sub12.method8755(-1933461091);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10373.reset();
	    aCRC32_10373.update(is, 0, is.length - 2);
	    int i_40_ = (int) aCRC32_10373.getValue();
	    if (i_40_ != aClass461_10361.anIntArray5080[i])
		throw new RuntimeException();
	    if (aClass461_10361.aByteArrayArray5082 != null
		&& aClass461_10361.aByteArrayArray5082[i] != null) {
		byte[] is_41_ = aClass461_10361.aByteArrayArray5082[i];
		byte[] is_42_
		    = Class510.method8505(is, 0, is.length - 2, (byte) -119);
		for (int i_43_ = 0; i_43_ < 64; i_43_++) {
		    if (is_42_[i_43_] != is_41_[i_43_])
			throw new RuntimeException();
		}
	    }
	    if (null != aClass470_10381) {
		aClass463_10378.anInt5114 = 0;
		aClass463_10378.anInt5112 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    aClass463_10378.method7630(833837449 * anInt10356, i, -491508117);
	    class525_sub16_sub12.method8755(-1933461091);
	    if (class525_sub16_sub12.aBool11834) {
		if (null != aClass470_10381) {
		    if (!aClass470_10381.method7716(394882489)) {
			Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3
			    = (aClass470_10381.method7718
			       (833837449 * anInt10356, i, (byte) 2, true,
				aClass461_10361.anIntArray5080[i],
				aClass461_10361.anIntArray5089[i], 763947668));
			if (class525_sub16_sub12_sub3 != null)
			    aClass10_10367.method695(class525_sub16_sub12_sub3,
						     (long) i);
		    }
		} else if (!aClass463_10378.method7613(-1370300329)) {
		    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, true,
						     1737224481);
		    aClass10_10367.method695(class525_sub16_sub12_sub1,
					     (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2] = (byte) (aClass461_10361.anIntArray5089[i] >>> 8);
	is[is.length - 1] = (byte) aClass461_10361.anIntArray5089[i];
	if (null != aClass552_10355) {
	    aClass466_10354.method7673(i, is, aClass552_10355, 150796174);
	    if (aByteArray10357[i] != 1) {
		anInt10366 += -2110444289;
		aByteArray10357[i] = (byte) 1;
	    }
	}
	if (!class525_sub16_sub12.aBool11834)
	    class525_sub16_sub12.method8755(-1933461091);
	return class525_sub16_sub12;
    }
    
    Class525_Sub16_Sub12 method16021(int i, int i_44_) {
	Class525_Sub16_Sub12 class525_sub16_sub12
	    = (Class525_Sub16_Sub12) aClass10_10367.method684((long) i);
	if (null != class525_sub16_sub12 && 0 == i_44_
	    && !class525_sub16_sub12.aBool11834
	    && class525_sub16_sub12.aBool11832) {
	    class525_sub16_sub12.method8755(-1933461091);
	    class525_sub16_sub12 = null;
	}
	if (class525_sub16_sub12 == null) {
	    if (i_44_ == 0) {
		if (null != aClass552_10355 && -1 != aByteArray10357[i])
		    class525_sub16_sub12
			= aClass466_10354.method7685(i, aClass552_10355,
						     (byte) 55);
		else if (aClass470_10381 != null) {
		    class525_sub16_sub12
			= aClass470_10381.method7718(833837449 * anInt10356, i,
						     (byte) 2, true,
						     (aClass461_10361
						      .anIntArray5080[i]),
						     (aClass461_10361
						      .anIntArray5089[i]),
						     904507120);
		    if (null == class525_sub16_sub12)
			return null;
		} else if (!aClass463_10378.method7613(-1370300329))
		    class525_sub16_sub12
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, true,
						     1602518575);
		else
		    return null;
	    } else if (1 == i_44_) {
		if (null == aClass552_10355)
		    throw new RuntimeException();
		class525_sub16_sub12
		    = aClass466_10354.method7674(i, aClass552_10355,
						 -1249995397);
	    } else if (2 == i_44_) {
		if (null == aClass552_10355)
		    throw new RuntimeException();
		if (aByteArray10357[i] != -1)
		    throw new RuntimeException();
		if (null != aClass470_10381)
		    return null;
		if (!aClass463_10378.method7612(-1660912808))
		    class525_sub16_sub12
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, false,
						     2016453181);
		else
		    return null;
	    } else
		throw new RuntimeException();
	    aClass10_10367.method695(class525_sub16_sub12, (long) i);
	}
	if (class525_sub16_sub12.aBool11832)
	    return null;
	byte[] is = class525_sub16_sub12.method18447(-2050181096);
	if (class525_sub16_sub12 instanceof Class525_Sub16_Sub12_Sub2) {
	    Class525_Sub16_Sub12 class525_sub16_sub12_45_;
	    try {
		if (null == is || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10373.reset();
		aCRC32_10373.update(is, 0, is.length - 2);
		int i_46_ = (int) aCRC32_10373.getValue();
		if (aClass461_10361.anIntArray5080[i] != i_46_)
		    throw new RuntimeException();
		if (aClass461_10361.aByteArrayArray5082 != null
		    && null != aClass461_10361.aByteArrayArray5082[i]) {
		    byte[] is_47_ = aClass461_10361.aByteArrayArray5082[i];
		    byte[] is_48_ = Class510.method8505(is, 0, is.length - 2,
							(byte) -26);
		    for (int i_49_ = 0; i_49_ < 64; i_49_++) {
			if (is_48_[i_49_] != is_47_[i_49_])
			    throw new RuntimeException();
		    }
		}
		int i_50_ = (((is[is.length - 2] & 0xff) << 8)
			     + (is[is.length - 1] & 0xff));
		if ((aClass461_10361.anIntArray5089[i] & 0xffff) != i_50_)
		    throw new RuntimeException();
		if (aByteArray10357[i] != 1) {
		    if (0 != aByteArray10357[i]) {
			/* empty */
		    }
		    anInt10366 += -2110444289;
		    aByteArray10357[i] = (byte) 1;
		}
		if (!class525_sub16_sub12.aBool11834)
		    class525_sub16_sub12.method8755(-1933461091);
		class525_sub16_sub12_45_ = class525_sub16_sub12;
	    } catch (Exception exception) {
		aByteArray10357[i] = (byte) -1;
		class525_sub16_sub12.method8755(-1933461091);
		if (class525_sub16_sub12.aBool11834) {
		    if (null != aClass470_10381) {
			if (!aClass470_10381.method7716(721185562)) {
			    Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3
				= (aClass470_10381.method7718
				   (833837449 * anInt10356, i, (byte) 2, true,
				    aClass461_10361.anIntArray5080[i],
				    aClass461_10361.anIntArray5089[i],
				    543372342));
			    if (class525_sub16_sub12_sub3 != null)
				aClass10_10367.method695
				    (class525_sub16_sub12_sub3, (long) i);
			}
		    } else if (!aClass463_10378.method7613(-1370300329)) {
			Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
			    = aClass463_10378.method7611((anInt10356
							  * 833837449),
							 i, (byte) 2, true,
							 1648838134);
			aClass10_10367.method695(class525_sub16_sub12_sub1,
						 (long) i);
		    }
		}
		return null;
	    }
	    return class525_sub16_sub12_45_;
	}
	try {
	    if (is == null || is.length <= 2) {
		if (null != aClass470_10381) {
		    class525_sub16_sub12.method8755(-1933461091);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10373.reset();
	    aCRC32_10373.update(is, 0, is.length - 2);
	    int i_51_ = (int) aCRC32_10373.getValue();
	    if (i_51_ != aClass461_10361.anIntArray5080[i])
		throw new RuntimeException();
	    if (aClass461_10361.aByteArrayArray5082 != null
		&& aClass461_10361.aByteArrayArray5082[i] != null) {
		byte[] is_52_ = aClass461_10361.aByteArrayArray5082[i];
		byte[] is_53_
		    = Class510.method8505(is, 0, is.length - 2, (byte) -78);
		for (int i_54_ = 0; i_54_ < 64; i_54_++) {
		    if (is_53_[i_54_] != is_52_[i_54_])
			throw new RuntimeException();
		}
	    }
	    if (null != aClass470_10381) {
		aClass463_10378.anInt5114 = 0;
		aClass463_10378.anInt5112 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    aClass463_10378.method7630(833837449 * anInt10356, i, -1573361387);
	    class525_sub16_sub12.method8755(-1933461091);
	    if (class525_sub16_sub12.aBool11834) {
		if (null != aClass470_10381) {
		    if (!aClass470_10381.method7716(1958779073)) {
			Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3
			    = (aClass470_10381.method7718
			       (833837449 * anInt10356, i, (byte) 2, true,
				aClass461_10361.anIntArray5080[i],
				aClass461_10361.anIntArray5089[i],
				1729327587));
			if (class525_sub16_sub12_sub3 != null)
			    aClass10_10367.method695(class525_sub16_sub12_sub3,
						     (long) i);
		    }
		} else if (!aClass463_10378.method7613(-1370300329)) {
		    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, true,
						     1663223853);
		    aClass10_10367.method695(class525_sub16_sub12_sub1,
					     (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2] = (byte) (aClass461_10361.anIntArray5089[i] >>> 8);
	is[is.length - 1] = (byte) aClass461_10361.anIntArray5089[i];
	if (null != aClass552_10355) {
	    aClass466_10354.method7673(i, is, aClass552_10355, 513357137);
	    if (aByteArray10357[i] != 1) {
		anInt10366 += -2110444289;
		aByteArray10357[i] = (byte) 1;
	    }
	}
	if (!class525_sub16_sub12.aBool11834)
	    class525_sub16_sub12.method8755(-1933461091);
	return class525_sub16_sub12;
    }
    
    Class525_Sub16_Sub12 method16022(int i, int i_55_) {
	Class525_Sub16_Sub12 class525_sub16_sub12
	    = (Class525_Sub16_Sub12) aClass10_10367.method684((long) i);
	if (null != class525_sub16_sub12 && 0 == i_55_
	    && !class525_sub16_sub12.aBool11834
	    && class525_sub16_sub12.aBool11832) {
	    class525_sub16_sub12.method8755(-1933461091);
	    class525_sub16_sub12 = null;
	}
	if (class525_sub16_sub12 == null) {
	    if (i_55_ == 0) {
		if (null != aClass552_10355 && -1 != aByteArray10357[i])
		    class525_sub16_sub12
			= aClass466_10354.method7685(i, aClass552_10355,
						     (byte) -51);
		else if (aClass470_10381 != null) {
		    class525_sub16_sub12
			= aClass470_10381.method7718(833837449 * anInt10356, i,
						     (byte) 2, true,
						     (aClass461_10361
						      .anIntArray5080[i]),
						     (aClass461_10361
						      .anIntArray5089[i]),
						     855217928);
		    if (null == class525_sub16_sub12)
			return null;
		} else if (!aClass463_10378.method7613(-1370300329))
		    class525_sub16_sub12
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, true,
						     2103228290);
		else
		    return null;
	    } else if (1 == i_55_) {
		if (null == aClass552_10355)
		    throw new RuntimeException();
		class525_sub16_sub12
		    = aClass466_10354.method7674(i, aClass552_10355,
						 -1487377970);
	    } else if (2 == i_55_) {
		if (null == aClass552_10355)
		    throw new RuntimeException();
		if (aByteArray10357[i] != -1)
		    throw new RuntimeException();
		if (null != aClass470_10381)
		    return null;
		if (!aClass463_10378.method7612(1203136225))
		    class525_sub16_sub12
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, false,
						     1813015784);
		else
		    return null;
	    } else
		throw new RuntimeException();
	    aClass10_10367.method695(class525_sub16_sub12, (long) i);
	}
	if (class525_sub16_sub12.aBool11832)
	    return null;
	byte[] is = class525_sub16_sub12.method18447(-1388953376);
	if (class525_sub16_sub12 instanceof Class525_Sub16_Sub12_Sub2) {
	    Class525_Sub16_Sub12 class525_sub16_sub12_56_;
	    try {
		if (null == is || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10373.reset();
		aCRC32_10373.update(is, 0, is.length - 2);
		int i_57_ = (int) aCRC32_10373.getValue();
		if (aClass461_10361.anIntArray5080[i] != i_57_)
		    throw new RuntimeException();
		if (aClass461_10361.aByteArrayArray5082 != null
		    && null != aClass461_10361.aByteArrayArray5082[i]) {
		    byte[] is_58_ = aClass461_10361.aByteArrayArray5082[i];
		    byte[] is_59_ = Class510.method8505(is, 0, is.length - 2,
							(byte) -113);
		    for (int i_60_ = 0; i_60_ < 64; i_60_++) {
			if (is_59_[i_60_] != is_58_[i_60_])
			    throw new RuntimeException();
		    }
		}
		int i_61_ = (((is[is.length - 2] & 0xff) << 8)
			     + (is[is.length - 1] & 0xff));
		if ((aClass461_10361.anIntArray5089[i] & 0xffff) != i_61_)
		    throw new RuntimeException();
		if (aByteArray10357[i] != 1) {
		    if (0 != aByteArray10357[i]) {
			/* empty */
		    }
		    anInt10366 += -2110444289;
		    aByteArray10357[i] = (byte) 1;
		}
		if (!class525_sub16_sub12.aBool11834)
		    class525_sub16_sub12.method8755(-1933461091);
		class525_sub16_sub12_56_ = class525_sub16_sub12;
	    } catch (Exception exception) {
		aByteArray10357[i] = (byte) -1;
		class525_sub16_sub12.method8755(-1933461091);
		if (class525_sub16_sub12.aBool11834) {
		    if (null != aClass470_10381) {
			if (!aClass470_10381.method7716(-1881914932)) {
			    Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3
				= (aClass470_10381.method7718
				   (833837449 * anInt10356, i, (byte) 2, true,
				    aClass461_10361.anIntArray5080[i],
				    aClass461_10361.anIntArray5089[i],
				    966272851));
			    if (class525_sub16_sub12_sub3 != null)
				aClass10_10367.method695
				    (class525_sub16_sub12_sub3, (long) i);
			}
		    } else if (!aClass463_10378.method7613(-1370300329)) {
			Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
			    = aClass463_10378.method7611((anInt10356
							  * 833837449),
							 i, (byte) 2, true,
							 2035880334);
			aClass10_10367.method695(class525_sub16_sub12_sub1,
						 (long) i);
		    }
		}
		return null;
	    }
	    return class525_sub16_sub12_56_;
	}
	try {
	    if (is == null || is.length <= 2) {
		if (null != aClass470_10381) {
		    class525_sub16_sub12.method8755(-1933461091);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10373.reset();
	    aCRC32_10373.update(is, 0, is.length - 2);
	    int i_62_ = (int) aCRC32_10373.getValue();
	    if (i_62_ != aClass461_10361.anIntArray5080[i])
		throw new RuntimeException();
	    if (aClass461_10361.aByteArrayArray5082 != null
		&& aClass461_10361.aByteArrayArray5082[i] != null) {
		byte[] is_63_ = aClass461_10361.aByteArrayArray5082[i];
		byte[] is_64_
		    = Class510.method8505(is, 0, is.length - 2, (byte) -3);
		for (int i_65_ = 0; i_65_ < 64; i_65_++) {
		    if (is_64_[i_65_] != is_63_[i_65_])
			throw new RuntimeException();
		}
	    }
	    if (null != aClass470_10381) {
		aClass463_10378.anInt5114 = 0;
		aClass463_10378.anInt5112 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    aClass463_10378.method7630(833837449 * anInt10356, i, -999852715);
	    class525_sub16_sub12.method8755(-1933461091);
	    if (class525_sub16_sub12.aBool11834) {
		if (null != aClass470_10381) {
		    if (!aClass470_10381.method7716(2048929774)) {
			Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3
			    = (aClass470_10381.method7718
			       (833837449 * anInt10356, i, (byte) 2, true,
				aClass461_10361.anIntArray5080[i],
				aClass461_10361.anIntArray5089[i],
				1029918412));
			if (class525_sub16_sub12_sub3 != null)
			    aClass10_10367.method695(class525_sub16_sub12_sub3,
						     (long) i);
		    }
		} else if (!aClass463_10378.method7613(-1370300329)) {
		    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
			= aClass463_10378.method7611(anInt10356 * 833837449, i,
						     (byte) 2, true,
						     1809541129);
		    aClass10_10367.method695(class525_sub16_sub12_sub1,
					     (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2] = (byte) (aClass461_10361.anIntArray5089[i] >>> 8);
	is[is.length - 1] = (byte) aClass461_10361.anIntArray5089[i];
	if (null != aClass552_10355) {
	    aClass466_10354.method7673(i, is, aClass552_10355, 1894262123);
	    if (aByteArray10357[i] != 1) {
		anInt10366 += -2110444289;
		aByteArray10357[i] = (byte) 1;
	    }
	}
	if (!class525_sub16_sub12.aBool11834)
	    class525_sub16_sub12.method8755(-1933461091);
	return class525_sub16_sub12;
    }
    
    void method16023() {
	if (null != aClass709_10372 && method7361(-2021659291) != null) {
	    for (Class525 class525
		     = aClass709_10363.method14372((short) -7360);
		 null != class525;
		 class525 = aClass709_10363.method14353(-1609044243)) {
		int i = (int) (class525.aLong7113 * -5126207504388691097L);
		if (i < 0 || i >= 1259617575 * aClass461_10361.anInt5079
		    || 0 == aClass461_10361.anIntArray5086[i])
		    class525.method8755(-1933461091);
		else {
		    if (0 == aByteArray10357[i])
			method16012(i, 1, (byte) 2);
		    if (aByteArray10357[i] == -1)
			method16012(i, 2, (byte) -68);
		    if (aByteArray10357[i] == 1)
			class525.method8755(-1933461091);
		}
	    }
	}
    }
    
    void method16024() {
	if (null != aClass709_10372 && method7361(-2021659291) != null) {
	    for (Class525 class525
		     = aClass709_10363.method14372((short) -25110);
		 null != class525;
		 class525 = aClass709_10363.method14353(-1565186330)) {
		int i = (int) (class525.aLong7113 * -5126207504388691097L);
		if (i < 0 || i >= 1259617575 * aClass461_10361.anInt5079
		    || 0 == aClass461_10361.anIntArray5086[i])
		    class525.method8755(-1933461091);
		else {
		    if (0 == aByteArray10357[i])
			method16012(i, 1, (byte) -48);
		    if (aByteArray10357[i] == -1)
			method16012(i, 2, (byte) -4);
		    if (aByteArray10357[i] == 1)
			class525.method8755(-1933461091);
		}
	    }
	}
    }
    
    void method16025() {
	if (null != aClass709_10372 && method7361(-2021659291) != null) {
	    for (Class525 class525
		     = aClass709_10363.method14372((short) -32085);
		 null != class525;
		 class525 = aClass709_10363.method14353(-2045159876)) {
		int i = (int) (class525.aLong7113 * -5126207504388691097L);
		if (i < 0 || i >= 1259617575 * aClass461_10361.anInt5079
		    || 0 == aClass461_10361.anIntArray5086[i])
		    class525.method8755(-1933461091);
		else {
		    if (0 == aByteArray10357[i])
			method16012(i, 1, (byte) -56);
		    if (aByteArray10357[i] == -1)
			method16012(i, 2, (byte) -14);
		    if (aByteArray10357[i] == 1)
			class525.method8755(-1933461091);
		}
	    }
	}
    }
    
    public boolean method16026() {
	return aBool10369;
    }
    
    void method16027() {
	if (null != aClass709_10372) {
	    if (method7361(-2021659291) == null)
		return;
	    if (aBool10370) {
		boolean bool = true;
		for (Class525 class525
			 = aClass709_10372.method14372((short) -31712);
		     class525 != null;
		     class525 = aClass709_10372.method14353(-1482401185)) {
		    int i = (int) (class525.aLong7113 * -5126207504388691097L);
		    if (aByteArray10357[i] == 0)
			method16012(i, 1, (byte) -27);
		    if (aByteArray10357[i] != 0)
			class525.method8755(-1933461091);
		    else
			bool = false;
		}
		while (anInt10368 * 1697131505
		       < aClass461_10361.anIntArray5086.length) {
		    if (0 == (aClass461_10361.anIntArray5086
			      [1697131505 * anInt10368]))
			anInt10368 += -101751535;
		    else {
			if (929723103 * aClass466_10354.anInt5122 >= 250) {
			    bool = false;
			    break;
			}
			if (0 == aByteArray10357[anInt10368 * 1697131505])
			    method16012(anInt10368 * 1697131505, 1, (byte) -3);
			if (0 == aByteArray10357[1697131505 * anInt10368]) {
			    Class525 class525 = new Class525();
			    class525.aLong7113
				= (long) anInt10368 * 8830171549014126311L;
			    aClass709_10372.method14345(class525, (byte) 0);
			    bool = false;
			}
			anInt10368 += -101751535;
		    }
		}
		if (bool) {
		    aBool10370 = false;
		    anInt10368 = 0;
		}
	    } else if (aBool10365) {
		boolean bool = true;
		for (Class525 class525
			 = aClass709_10372.method14372((short) -2867);
		     class525 != null;
		     class525 = aClass709_10372.method14353(-1317525181)) {
		    int i = (int) (class525.aLong7113 * -5126207504388691097L);
		    if (1 != aByteArray10357[i])
			method16012(i, 2, (byte) -87);
		    if (aByteArray10357[i] == 1)
			class525.method8755(-1933461091);
		    else
			bool = false;
		}
		while (anInt10368 * 1697131505
		       < aClass461_10361.anIntArray5086.length) {
		    if (0 == (aClass461_10361.anIntArray5086
			      [anInt10368 * 1697131505]))
			anInt10368 += -101751535;
		    else {
			if (aClass463_10378.method7612(-1557440190)) {
			    bool = false;
			    break;
			}
			if (1 != aByteArray10357[anInt10368 * 1697131505])
			    method16012(anInt10368 * 1697131505, 2,
					(byte) -97);
			if (aByteArray10357[anInt10368 * 1697131505] != 1) {
			    Class525 class525 = new Class525();
			    class525.aLong7113
				= (long) anInt10368 * 8830171549014126311L;
			    aClass709_10372.method14345(class525, (byte) 0);
			    bool = false;
			}
			anInt10368 += -101751535;
		    }
		}
		if (bool) {
		    aBool10365 = false;
		    anInt10368 = 0;
		}
	    } else
		aClass709_10372 = null;
	}
	if (aBool10374 && (Class251.method4508((byte) 8)
			   >= aLong10379 * 7595069598973812269L)) {
	    for (Class525_Sub16_Sub12 class525_sub16_sub12
		     = ((Class525_Sub16_Sub12)
			aClass10_10367.method689(1964554524));
		 class525_sub16_sub12 != null;
		 class525_sub16_sub12
		     = ((Class525_Sub16_Sub12)
			aClass10_10367.method690((byte) -9))) {
		if (!class525_sub16_sub12.aBool11832) {
		    if (class525_sub16_sub12.aBool11833) {
			if (!class525_sub16_sub12.aBool11834)
			    throw new RuntimeException();
			class525_sub16_sub12.method8755(-1933461091);
		    } else
			class525_sub16_sub12.aBool11833 = true;
		}
	    }
	    aLong10379 = ((Class251.method4508((byte) 8) + 1000L)
			  * 6537272328871879077L);
	}
    }
    
    void method16028() {
	if (null != aClass709_10372) {
	    if (method7361(-2021659291) == null)
		return;
	    if (aBool10370) {
		boolean bool = true;
		for (Class525 class525
			 = aClass709_10372.method14372((short) -24348);
		     class525 != null;
		     class525 = aClass709_10372.method14353(-2004555721)) {
		    int i = (int) (class525.aLong7113 * -5126207504388691097L);
		    if (aByteArray10357[i] == 0)
			method16012(i, 1, (byte) -2);
		    if (aByteArray10357[i] != 0)
			class525.method8755(-1933461091);
		    else
			bool = false;
		}
		while (anInt10368 * 1697131505
		       < aClass461_10361.anIntArray5086.length) {
		    if (0 == (aClass461_10361.anIntArray5086
			      [1697131505 * anInt10368]))
			anInt10368 += -101751535;
		    else {
			if (929723103 * aClass466_10354.anInt5122 >= 250) {
			    bool = false;
			    break;
			}
			if (0 == aByteArray10357[anInt10368 * 1697131505])
			    method16012(anInt10368 * 1697131505, 1, (byte) -5);
			if (0 == aByteArray10357[1697131505 * anInt10368]) {
			    Class525 class525 = new Class525();
			    class525.aLong7113
				= (long) anInt10368 * 8830171549014126311L;
			    aClass709_10372.method14345(class525, (byte) 0);
			    bool = false;
			}
			anInt10368 += -101751535;
		    }
		}
		if (bool) {
		    aBool10370 = false;
		    anInt10368 = 0;
		}
	    } else if (aBool10365) {
		boolean bool = true;
		for (Class525 class525
			 = aClass709_10372.method14372((short) -6420);
		     class525 != null;
		     class525 = aClass709_10372.method14353(-1878016133)) {
		    int i = (int) (class525.aLong7113 * -5126207504388691097L);
		    if (1 != aByteArray10357[i])
			method16012(i, 2, (byte) -3);
		    if (aByteArray10357[i] == 1)
			class525.method8755(-1933461091);
		    else
			bool = false;
		}
		while (anInt10368 * 1697131505
		       < aClass461_10361.anIntArray5086.length) {
		    if (0 == (aClass461_10361.anIntArray5086
			      [anInt10368 * 1697131505]))
			anInt10368 += -101751535;
		    else {
			if (aClass463_10378.method7612(-1241660253)) {
			    bool = false;
			    break;
			}
			if (1 != aByteArray10357[anInt10368 * 1697131505])
			    method16012(anInt10368 * 1697131505, 2,
					(byte) -104);
			if (aByteArray10357[anInt10368 * 1697131505] != 1) {
			    Class525 class525 = new Class525();
			    class525.aLong7113
				= (long) anInt10368 * 8830171549014126311L;
			    aClass709_10372.method14345(class525, (byte) 0);
			    bool = false;
			}
			anInt10368 += -101751535;
		    }
		}
		if (bool) {
		    aBool10365 = false;
		    anInt10368 = 0;
		}
	    } else
		aClass709_10372 = null;
	}
	if (aBool10374 && (Class251.method4508((byte) 8)
			   >= aLong10379 * 7595069598973812269L)) {
	    for (Class525_Sub16_Sub12 class525_sub16_sub12
		     = ((Class525_Sub16_Sub12)
			aClass10_10367.method689(857919925));
		 class525_sub16_sub12 != null;
		 class525_sub16_sub12
		     = ((Class525_Sub16_Sub12)
			aClass10_10367.method690((byte) -18))) {
		if (!class525_sub16_sub12.aBool11832) {
		    if (class525_sub16_sub12.aBool11833) {
			if (!class525_sub16_sub12.aBool11834)
			    throw new RuntimeException();
			class525_sub16_sub12.method8755(-1933461091);
		    } else
			class525_sub16_sub12.aBool11833 = true;
		}
	    }
	    aLong10379 = ((Class251.method4508((byte) 8) + 1000L)
			  * 6537272328871879077L);
	}
    }
    
    void method16029() {
	if (null != aClass709_10372) {
	    if (method7361(-2021659291) == null)
		return;
	    if (aBool10370) {
		boolean bool = true;
		for (Class525 class525
			 = aClass709_10372.method14372((short) -23488);
		     class525 != null;
		     class525 = aClass709_10372.method14353(-1409834279)) {
		    int i = (int) (class525.aLong7113 * -5126207504388691097L);
		    if (aByteArray10357[i] == 0)
			method16012(i, 1, (byte) -121);
		    if (aByteArray10357[i] != 0)
			class525.method8755(-1933461091);
		    else
			bool = false;
		}
		while (anInt10368 * 1697131505
		       < aClass461_10361.anIntArray5086.length) {
		    if (0 == (aClass461_10361.anIntArray5086
			      [1697131505 * anInt10368]))
			anInt10368 += -101751535;
		    else {
			if (929723103 * aClass466_10354.anInt5122 >= 250) {
			    bool = false;
			    break;
			}
			if (0 == aByteArray10357[anInt10368 * 1697131505])
			    method16012(anInt10368 * 1697131505, 1,
					(byte) -64);
			if (0 == aByteArray10357[1697131505 * anInt10368]) {
			    Class525 class525 = new Class525();
			    class525.aLong7113
				= (long) anInt10368 * 8830171549014126311L;
			    aClass709_10372.method14345(class525, (byte) 0);
			    bool = false;
			}
			anInt10368 += -101751535;
		    }
		}
		if (bool) {
		    aBool10370 = false;
		    anInt10368 = 0;
		}
	    } else if (aBool10365) {
		boolean bool = true;
		for (Class525 class525
			 = aClass709_10372.method14372((short) -9383);
		     class525 != null;
		     class525 = aClass709_10372.method14353(-1359941801)) {
		    int i = (int) (class525.aLong7113 * -5126207504388691097L);
		    if (1 != aByteArray10357[i])
			method16012(i, 2, (byte) -17);
		    if (aByteArray10357[i] == 1)
			class525.method8755(-1933461091);
		    else
			bool = false;
		}
		while (anInt10368 * 1697131505
		       < aClass461_10361.anIntArray5086.length) {
		    if (0 == (aClass461_10361.anIntArray5086
			      [anInt10368 * 1697131505]))
			anInt10368 += -101751535;
		    else {
			if (aClass463_10378.method7612(-42020515)) {
			    bool = false;
			    break;
			}
			if (1 != aByteArray10357[anInt10368 * 1697131505])
			    method16012(anInt10368 * 1697131505, 2,
					(byte) -88);
			if (aByteArray10357[anInt10368 * 1697131505] != 1) {
			    Class525 class525 = new Class525();
			    class525.aLong7113
				= (long) anInt10368 * 8830171549014126311L;
			    aClass709_10372.method14345(class525, (byte) 0);
			    bool = false;
			}
			anInt10368 += -101751535;
		    }
		}
		if (bool) {
		    aBool10365 = false;
		    anInt10368 = 0;
		}
	    } else
		aClass709_10372 = null;
	}
	if (aBool10374 && (Class251.method4508((byte) 8)
			   >= aLong10379 * 7595069598973812269L)) {
	    for (Class525_Sub16_Sub12 class525_sub16_sub12
		     = ((Class525_Sub16_Sub12)
			aClass10_10367.method689(167066581));
		 class525_sub16_sub12 != null;
		 class525_sub16_sub12
		     = ((Class525_Sub16_Sub12)
			aClass10_10367.method690((byte) -81))) {
		if (!class525_sub16_sub12.aBool11832) {
		    if (class525_sub16_sub12.aBool11833) {
			if (!class525_sub16_sub12.aBool11834)
			    throw new RuntimeException();
			class525_sub16_sub12.method8755(-1933461091);
		    } else
			class525_sub16_sub12.aBool11833 = true;
		}
	    }
	    aLong10379 = ((Class251.method4508((byte) 8) + 1000L)
			  * 6537272328871879077L);
	}
    }
    
    void method16030() {
	if (null != aClass709_10372) {
	    if (method7361(-2021659291) == null)
		return;
	    if (aBool10370) {
		boolean bool = true;
		for (Class525 class525
			 = aClass709_10372.method14372((short) -24693);
		     class525 != null;
		     class525 = aClass709_10372.method14353(-1786663321)) {
		    int i = (int) (class525.aLong7113 * -5126207504388691097L);
		    if (aByteArray10357[i] == 0)
			method16012(i, 1, (byte) -72);
		    if (aByteArray10357[i] != 0)
			class525.method8755(-1933461091);
		    else
			bool = false;
		}
		while (anInt10368 * 1697131505
		       < aClass461_10361.anIntArray5086.length) {
		    if (0 == (aClass461_10361.anIntArray5086
			      [1697131505 * anInt10368]))
			anInt10368 += -101751535;
		    else {
			if (929723103 * aClass466_10354.anInt5122 >= 250) {
			    bool = false;
			    break;
			}
			if (0 == aByteArray10357[anInt10368 * 1697131505])
			    method16012(anInt10368 * 1697131505, 1,
					(byte) -25);
			if (0 == aByteArray10357[1697131505 * anInt10368]) {
			    Class525 class525 = new Class525();
			    class525.aLong7113
				= (long) anInt10368 * 8830171549014126311L;
			    aClass709_10372.method14345(class525, (byte) 0);
			    bool = false;
			}
			anInt10368 += -101751535;
		    }
		}
		if (bool) {
		    aBool10370 = false;
		    anInt10368 = 0;
		}
	    } else if (aBool10365) {
		boolean bool = true;
		for (Class525 class525
			 = aClass709_10372.method14372((short) -29527);
		     class525 != null;
		     class525 = aClass709_10372.method14353(-1224569964)) {
		    int i = (int) (class525.aLong7113 * -5126207504388691097L);
		    if (1 != aByteArray10357[i])
			method16012(i, 2, (byte) -1);
		    if (aByteArray10357[i] == 1)
			class525.method8755(-1933461091);
		    else
			bool = false;
		}
		while (anInt10368 * 1697131505
		       < aClass461_10361.anIntArray5086.length) {
		    if (0 == (aClass461_10361.anIntArray5086
			      [anInt10368 * 1697131505]))
			anInt10368 += -101751535;
		    else {
			if (aClass463_10378.method7612(929577552)) {
			    bool = false;
			    break;
			}
			if (1 != aByteArray10357[anInt10368 * 1697131505])
			    method16012(anInt10368 * 1697131505, 2,
					(byte) -45);
			if (aByteArray10357[anInt10368 * 1697131505] != 1) {
			    Class525 class525 = new Class525();
			    class525.aLong7113
				= (long) anInt10368 * 8830171549014126311L;
			    aClass709_10372.method14345(class525, (byte) 0);
			    bool = false;
			}
			anInt10368 += -101751535;
		    }
		}
		if (bool) {
		    aBool10365 = false;
		    anInt10368 = 0;
		}
	    } else
		aClass709_10372 = null;
	}
	if (aBool10374 && (Class251.method4508((byte) 8)
			   >= aLong10379 * 7595069598973812269L)) {
	    for (Class525_Sub16_Sub12 class525_sub16_sub12
		     = ((Class525_Sub16_Sub12)
			aClass10_10367.method689(582478110));
		 class525_sub16_sub12 != null;
		 class525_sub16_sub12
		     = ((Class525_Sub16_Sub12)
			aClass10_10367.method690((byte) -17))) {
		if (!class525_sub16_sub12.aBool11832) {
		    if (class525_sub16_sub12.aBool11833) {
			if (!class525_sub16_sub12.aBool11834)
			    throw new RuntimeException();
			class525_sub16_sub12.method8755(-1933461091);
		    } else
			class525_sub16_sub12.aBool11833 = true;
		}
	    }
	    aLong10379 = ((Class251.method4508((byte) 8) + 1000L)
			  * 6537272328871879077L);
	}
    }
    
    void method7363(int i, int i_66_) {
	if (aClass552_10355 != null) {
	    for (Class525 class525
		     = aClass709_10363.method14372((short) -6911);
		 class525 != null;
		 class525 = aClass709_10363.method14353(-1297560741)) {
		if ((long) i == -5126207504388691097L * class525.aLong7113)
		    return;
	    }
	    Class525 class525 = new Class525();
	    class525.aLong7113 = (long) i * 2638983450515767383L;
	    aClass709_10363.method14345(class525, (byte) 0);
	}
    }
    
    public int method16031() {
	if (aClass461_10361 == null)
	    return 0;
	return aClass461_10361.anInt5075 * 1628852347;
    }
    
    public int method16032() {
	return -555625729 * anInt10366;
    }
    
    public int method16033() {
	return -555625729 * anInt10366;
    }
    
    public int method16034() {
	if (null == aClass461_10361)
	    return 0;
	if (!aBool10370)
	    return 1628852347 * aClass461_10361.anInt5075;
	Class525 class525 = aClass709_10372.method14372((short) -22615);
	if (null == class525)
	    return 0;
	return (int) (-5126207504388691097L * class525.aLong7113);
    }
    
    public int method16035() {
	if (null == aClass461_10361)
	    return 0;
	if (!aBool10370)
	    return 1628852347 * aClass461_10361.anInt5075;
	Class525 class525 = aClass709_10372.method14372((short) -14449);
	if (null == class525)
	    return 0;
	return (int) (-5126207504388691097L * class525.aLong7113);
    }
    
    void method7368(int i) {
	if (aClass552_10355 != null) {
	    for (Class525 class525
		     = aClass709_10363.method14372((short) -15669);
		 class525 != null;
		 class525 = aClass709_10363.method14353(-1089680739)) {
		if ((long) i == -5126207504388691097L * class525.aLong7113)
		    return;
	    }
	    Class525 class525 = new Class525();
	    class525.aLong7113 = (long) i * 2638983450515767383L;
	    aClass709_10363.method14345(class525, (byte) 0);
	}
    }
    
    public void method16036() {
	if (null == aClass470_10381 && aClass552_10355 != null) {
	    aBool10365 = true;
	    aBool10369 = true;
	    if (aClass709_10372 == null)
		aClass709_10372 = new Class709();
	}
    }
    
    public void method16037() {
	if (null == aClass470_10381 && aClass552_10355 != null) {
	    aBool10365 = true;
	    aBool10369 = true;
	    if (aClass709_10372 == null)
		aClass709_10372 = new Class709();
	}
    }
    
    public boolean method16038() {
	return aBool10369;
    }
    
    public boolean method16039() {
	return aBool10369;
    }
    
    byte[] method7367(int i) {
	Class525_Sub16_Sub12 class525_sub16_sub12
	    = method16012(i, 0, (byte) -35);
	if (null == class525_sub16_sub12)
	    return null;
	byte[] is = class525_sub16_sub12.method18447(-1924648519);
	class525_sub16_sub12.method8755(-1933461091);
	return is;
    }
    
    Class461 method7365() {
	if (null != aClass461_10361)
	    return aClass461_10361;
	if (aClass525_Sub16_Sub12_10352 == null) {
	    if (aClass463_10378.method7613(-1370300329))
		return null;
	    aClass525_Sub16_Sub12_10352
		= aClass463_10378.method7611(255, 833837449 * anInt10356,
					     (byte) 0, true, 1638044476);
	}
	if (aClass525_Sub16_Sub12_10352.aBool11832)
	    return null;
	byte[] is = aClass525_Sub16_Sub12_10352.method18447(-1051779712);
	if (aClass525_Sub16_Sub12_10352 instanceof Class525_Sub16_Sub12_Sub2) {
	    try {
		if (null == is)
		    throw new RuntimeException();
		aClass461_10361 = new Class461(is, -126773885 * anInt10358,
					       aByteArray10359);
		if (anInt10360 * 148373067
		    != aClass461_10361.anInt5076 * 591215185)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		aClass461_10361 = null;
		if (aClass463_10378.method7613(-1370300329))
		    aClass525_Sub16_Sub12_10352 = null;
		else
		    aClass525_Sub16_Sub12_10352
			= aClass463_10378.method7611(255,
						     anInt10356 * 833837449,
						     (byte) 0, true,
						     2023104588);
		return null;
	    }
	} else {
	    try {
		if (null == is)
		    throw new RuntimeException();
		aClass461_10361 = new Class461(is, -126773885 * anInt10358,
					       aByteArray10359);
	    } catch (RuntimeException runtimeexception) {
		aClass463_10378.method7630(255, 833837449 * anInt10356,
					   -2145248577);
		aClass461_10361 = null;
		if (aClass463_10378.method7613(-1370300329))
		    aClass525_Sub16_Sub12_10352 = null;
		else
		    aClass525_Sub16_Sub12_10352
			= aClass463_10378.method7611(255,
						     anInt10356 * 833837449,
						     (byte) 0, true,
						     1856158688);
		return null;
	    }
	    if (aClass552_10375 != null)
		aClass466_10354.method7673(anInt10356 * 833837449, is,
					   aClass552_10375, 742602762);
	}
	aClass525_Sub16_Sub12_10352 = null;
	if (aClass552_10355 != null) {
	    aByteArray10357 = new byte[1259617575 * aClass461_10361.anInt5079];
	    anInt10366 = 0;
	}
	return aClass461_10361;
    }
    
    void method16040(boolean bool) {
	aClass470_10381.method7721(bool, 1214012709);
    }
    
    int method7364(int i) {
	Class525_Sub16_Sub12 class525_sub16_sub12
	    = (Class525_Sub16_Sub12) aClass10_10367.method684((long) i);
	if (null != class525_sub16_sub12)
	    return class525_sub16_sub12.method18445(-156349999);
	return 0;
    }
    
    void method16041(boolean bool) {
	aClass470_10381.method7721(bool, 452686381);
    }
    
    void method16042(boolean bool) {
	aClass470_10381.method7721(bool, 1603287609);
    }
    
    boolean method16043() {
	return aClass470_10381 != null;
    }
    
    boolean method16044() {
	return aClass470_10381 != null;
    }
    
    public void method16045(byte i) {
	if (null == aClass470_10381 && aClass552_10355 != null) {
	    aBool10365 = true;
	    aBool10369 = true;
	    if (aClass709_10372 == null)
		aClass709_10372 = new Class709();
	}
    }
    
    void method16046() {
	if (null != aClass709_10372 && method7361(-2021659291) != null) {
	    for (Class525 class525
		     = aClass709_10363.method14372((short) -21408);
		 null != class525;
		 class525 = aClass709_10363.method14353(-1306003049)) {
		int i = (int) (class525.aLong7113 * -5126207504388691097L);
		if (i < 0 || i >= 1259617575 * aClass461_10361.anInt5079
		    || 0 == aClass461_10361.anIntArray5086[i])
		    class525.method8755(-1933461091);
		else {
		    if (0 == aByteArray10357[i])
			method16012(i, 1, (byte) -91);
		    if (aByteArray10357[i] == -1)
			method16012(i, 2, (byte) -48);
		    if (aByteArray10357[i] == 1)
			class525.method8755(-1933461091);
		}
	    }
	}
    }
}
