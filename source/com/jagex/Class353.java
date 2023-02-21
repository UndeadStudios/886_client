/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class353
{
    Class10 aClass10_3754;
    boolean aBool3755;
    boolean aBool3756;
    long aLong3757;
    int anInt3758 = 0;
    public String aString3759 = null;
    int anInt3760 = 0;
    public boolean aBool3761;
    public static final byte aByte3762 = -1;
    public String[] aStringArray3763;
    public byte aByte3764;
    public byte aByte3765;
    public int anInt3766;
    public byte aByte3767;
    static final byte aByte3768 = 127;
    int[] anIntArray3769;
    int[] anIntArray3770;
    static final byte aByte3771 = 125;
    public byte[] aByteArray3772;
    public int anInt3773 = 2033539065;
    public int anInt3774 = 1460038639;
    public int anInt3775;
    long[] aLongArray3776;
    long[] aLongArray3777;
    public String[] aStringArray3778;
    static final byte aByte3779 = 126;
    public int[] anIntArray3780;
    public boolean[] aBoolArray3781;
    static final int anInt3782 = 6;
    static final byte aByte3783 = 0;
    public byte aByte3784;
    
    public Long method6200(int i) {
	if (null == aClass10_3754)
	    return null;
	Class525 class525 = aClass10_3754.method684((long) i);
	if (class525 == null || !(class525 instanceof Class525_Sub31))
	    return null;
	return new Long(((Class525_Sub31) class525).aLong10732
			* 3461934040741021073L);
    }
    
    void method6201(int i, int i_0_) {
	if (aBool3755) {
	    if (null != aLongArray3776)
		System.arraycopy(aLongArray3776, 0,
				 aLongArray3776 = new long[i], 0,
				 -52364563 * anInt3766);
	    else
		aLongArray3776 = new long[i];
	}
	if (aBool3756) {
	    if (null != aStringArray3763)
		System.arraycopy(aStringArray3763, 0,
				 aStringArray3763 = new String[i], 0,
				 -52364563 * anInt3766);
	    else
		aStringArray3763 = new String[i];
	}
	if (aByteArray3772 != null)
	    System.arraycopy(aByteArray3772, 0, aByteArray3772 = new byte[i],
			     0, -52364563 * anInt3766);
	else
	    aByteArray3772 = new byte[i];
	if (anIntArray3770 != null)
	    System.arraycopy(anIntArray3770, 0, anIntArray3770 = new int[i], 0,
			     anInt3766 * -52364563);
	else
	    anIntArray3770 = new int[i];
	if (anIntArray3780 != null)
	    System.arraycopy(anIntArray3780, 0, anIntArray3780 = new int[i], 0,
			     anInt3766 * -52364563);
	else
	    anIntArray3780 = new int[i];
	if (null != aBoolArray3781)
	    System.arraycopy(aBoolArray3781, 0,
			     aBoolArray3781 = new boolean[i], 0,
			     anInt3766 * -52364563);
	else
	    aBoolArray3781 = new boolean[i];
    }
    
    void method6202(int i, int i_1_) {
	if (aBool3755) {
	    if (aLongArray3777 != null)
		System.arraycopy(aLongArray3777, 0,
				 aLongArray3777 = new long[i], 0,
				 anInt3775 * 1018823119);
	    else
		aLongArray3777 = new long[i];
	}
	if (aBool3756) {
	    if (aStringArray3778 != null)
		System.arraycopy(aStringArray3778, 0,
				 aStringArray3778 = new String[i], 0,
				 anInt3775 * 1018823119);
	    else
		aStringArray3778 = new String[i];
	}
    }
    
    void method6203(long l, String string, byte i) {
	if (null != string && string.length() == 0)
	    string = null;
	if (l > 0L != aBool3755)
	    throw new RuntimeException("");
	if (aBool3756 != (string != null))
	    throw new RuntimeException("");
	if (l > 0L && (null == aLongArray3777
		       || anInt3775 * 1018823119 >= aLongArray3777.length)
	    || (null != string
		&& (aStringArray3778 == null
		    || 1018823119 * anInt3775 >= aStringArray3778.length)))
	    method6202(5 + 1018823119 * anInt3775, -97158484);
	if (null != aLongArray3777)
	    aLongArray3777[anInt3775 * 1018823119] = l;
	if (null != aStringArray3778)
	    aStringArray3778[anInt3775 * 1018823119] = string;
	anInt3775 += -1368562385;
    }
    
    public int method6204(int i, int i_2_, int i_3_, int i_4_) {
	int i_5_ = i_3_ == 31 ? -1 : (1 << 1 + i_3_) - 1;
	return (anIntArray3770[i] & i_5_) >>> i_2_;
    }
    
    public Integer method6205(int i, int i_6_) {
	if (aClass10_3754 == null)
	    return null;
	Class525 class525 = aClass10_3754.method684((long) i);
	if (class525 == null || !(class525 instanceof Class525_Sub42))
	    return null;
	return new Integer(((Class525_Sub42) class525).anInt10858
			   * -1344652871);
    }
    
    public Long method6206(int i, byte i_7_) {
	if (null == aClass10_3754)
	    return null;
	Class525 class525 = aClass10_3754.method684((long) i);
	if (class525 == null || !(class525 instanceof Class525_Sub31))
	    return null;
	return new Long(((Class525_Sub31) class525).aLong10732
			* 3461934040741021073L);
    }
    
    int method6207(int i, byte i_8_) {
	if (i_8_ == 126 || i_8_ == 127)
	    return -1;
	if (1701332407 * anInt3773 == i
	    && (-1 == anInt3774 * 1308482801
		|| aByteArray3772[anInt3774 * 1308482801] < 125))
	    return -1;
	if (aByteArray3772[i] == i_8_)
	    return -1;
	aByteArray3772[i] = i_8_;
	method6252(1676077977);
	return i;
    }
    
    public Class353(RSBuffer class525_sub38) {
	method6220(class525_sub38, (byte) 8);
    }
    
    void method6208(int i, int i_9_) {
	anInt3775 -= -1368562385;
	if (0 == 1018823119 * anInt3775) {
	    aLongArray3777 = null;
	    aStringArray3778 = null;
	} else {
	    if (null != aLongArray3777)
		System.arraycopy(aLongArray3777, i + 1, aLongArray3777, i,
				 anInt3775 * 1018823119 - i);
	    if (null != aStringArray3778)
		System.arraycopy(aStringArray3778, i + 1, aStringArray3778, i,
				 anInt3775 * 1018823119 - i);
	}
    }
    
    int method6209(int i, boolean bool, int i_10_) {
	if (bool == aBoolArray3781[i])
	    return -1;
	aBoolArray3781[i] = bool;
	return i;
    }
    
    boolean method6210(int i, int i_11_, int i_12_, int i_13_) {
	int i_14_ = (1 << i_12_) - 1;
	int i_15_ = 31 == i_13_ ? -1 : (1 << i_13_ + 1) - 1;
	int i_16_ = i_15_ ^ i_14_;
	i_11_ <<= i_12_;
	i_11_ &= i_16_;
	if (null != aClass10_3754) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (class525 != null) {
		if (class525 instanceof Class525_Sub42) {
		    Class525_Sub42 class525_sub42 = (Class525_Sub42) class525;
		    if ((class525_sub42.anInt10858 * -1344652871 & i_16_)
			== i_11_)
			return false;
		    Class525_Sub42 class525_sub42_17_;
		    (class525_sub42_17_ = class525_sub42).anInt10858
			= (-854721399
			   * (-1344652871 * class525_sub42_17_.anInt10858
			      & (i_16_ ^ 0xffffffff)));
		    Class525_Sub42 class525_sub42_18_;
		    (class525_sub42_18_ = class525_sub42).anInt10858
			= (-1344652871 * class525_sub42_18_.anInt10858
			   | i_11_) * -854721399;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub42(i_11_), (long) i);
	return true;
    }
    
    public String method6211(int i, int i_19_) {
	if (aClass10_3754 == null)
	    return null;
	Class525 class525 = aClass10_3754.method684((long) i);
	if (null == class525 || !(class525 instanceof Class525_Sub19))
	    return null;
	return (String) ((Class525_Sub19) class525).anObject10571;
    }
    
    int method6212(int i, byte i_20_) {
	if (i_20_ == 126 || i_20_ == 127)
	    return -1;
	if (1701332407 * anInt3773 == i
	    && (-1 == anInt3774 * 1308482801
		|| aByteArray3772[anInt3774 * 1308482801] < 125))
	    return -1;
	if (aByteArray3772[i] == i_20_)
	    return -1;
	aByteArray3772[i] = i_20_;
	method6252(1053586549);
	return i;
    }
    
    int method6213(int i, byte i_21_, int i_22_) {
	if (i_21_ == 126 || i_21_ == 127)
	    return -1;
	if (1701332407 * anInt3773 == i
	    && (-1 == anInt3774 * 1308482801
		|| aByteArray3772[anInt3774 * 1308482801] < 125))
	    return -1;
	if (aByteArray3772[i] == i_21_)
	    return -1;
	aByteArray3772[i] = i_21_;
	method6252(1383060507);
	return i;
    }
    
    void method6214(long l, String string) {
	if (null != string && string.length() == 0)
	    string = null;
	if (l > 0L != aBool3755)
	    throw new RuntimeException("");
	if (aBool3756 != (string != null))
	    throw new RuntimeException("");
	if (l > 0L && (null == aLongArray3777
		       || anInt3775 * 1018823119 >= aLongArray3777.length)
	    || (null != string
		&& (aStringArray3778 == null
		    || 1018823119 * anInt3775 >= aStringArray3778.length)))
	    method6202(5 + 1018823119 * anInt3775, -97158484);
	if (null != aLongArray3777)
	    aLongArray3777[anInt3775 * 1018823119] = l;
	if (null != aStringArray3778)
	    aStringArray3778[anInt3775 * 1018823119] = string;
	anInt3775 += -1368562385;
    }
    
    int method6215(int i, boolean bool) {
	if (bool == aBoolArray3781[i])
	    return -1;
	aBoolArray3781[i] = bool;
	return i;
    }
    
    boolean method6216(int i, int i_23_, int i_24_) {
	if (aClass10_3754 != null) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (null != class525) {
		if (class525 instanceof Class525_Sub42) {
		    Class525_Sub42 class525_sub42 = (Class525_Sub42) class525;
		    if (i_23_ == -1344652871 * class525_sub42.anInt10858)
			return false;
		    class525_sub42.anInt10858 = -854721399 * i_23_;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub42(i_23_), (long) i);
	return true;
    }
    
    boolean method6217(int i, int i_25_, int i_26_, int i_27_, int i_28_) {
	int i_29_ = (1 << i_26_) - 1;
	int i_30_ = 31 == i_27_ ? -1 : (1 << i_27_ + 1) - 1;
	int i_31_ = i_30_ ^ i_29_;
	i_25_ <<= i_26_;
	i_25_ &= i_31_;
	if (null != aClass10_3754) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (class525 != null) {
		if (class525 instanceof Class525_Sub42) {
		    Class525_Sub42 class525_sub42 = (Class525_Sub42) class525;
		    if ((class525_sub42.anInt10858 * -1344652871 & i_31_)
			== i_25_)
			return false;
		    Class525_Sub42 class525_sub42_32_;
		    (class525_sub42_32_ = class525_sub42).anInt10858
			= (-854721399
			   * (-1344652871 * class525_sub42_32_.anInt10858
			      & (i_31_ ^ 0xffffffff)));
		    Class525_Sub42 class525_sub42_33_;
		    (class525_sub42_33_ = class525_sub42).anInt10858
			= (-1344652871 * class525_sub42_33_.anInt10858
			   | i_25_) * -854721399;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub42(i_25_), (long) i);
	return true;
    }
    
    void method6218(long l, String string, int i) {
	if (null != string && string.length() == 0)
	    string = null;
	if (l > 0L != aBool3755)
	    throw new RuntimeException("");
	if ((null != string) != aBool3756)
	    throw new RuntimeException("");
	if (l > 0L && (null == aLongArray3776
		       || anInt3766 * -52364563 >= aLongArray3776.length)
	    || (null != string
		&& (aStringArray3763 == null
		    || anInt3766 * -52364563 >= aStringArray3763.length)))
	    method6201(5 + -52364563 * anInt3766, -1353691520);
	if (aLongArray3776 != null)
	    aLongArray3776[-52364563 * anInt3766] = l;
	if (aStringArray3763 != null)
	    aStringArray3763[anInt3766 * -52364563] = string;
	if (1701332407 * anInt3773 == -1) {
	    anInt3773 = -1680579461 * anInt3766;
	    aByteArray3772[anInt3766 * -52364563] = (byte) 126;
	} else
	    aByteArray3772[-52364563 * anInt3766] = (byte) 0;
	anIntArray3770[anInt3766 * -52364563] = 0;
	anIntArray3780[anInt3766 * -52364563] = i;
	aBoolArray3781[-52364563 * anInt3766] = false;
	anInt3766 += -1932889371;
	anIntArray3769 = null;
    }
    
    boolean method6219(int i, String string, int i_34_) {
	if (string == null)
	    string = "";
	else if (string.length() > 80)
	    string = string.substring(0, 80);
	if (null != aClass10_3754) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (null != class525) {
		if (class525 instanceof Class525_Sub19) {
		    Class525_Sub19 class525_sub19 = (Class525_Sub19) class525;
		    if (class525_sub19.anObject10571 instanceof String) {
			if (string.equals(class525_sub19.anObject10571))
			    return false;
			class525_sub19.method8755(-1933461091);
			aClass10_3754.method695(new Class525_Sub19(string),
						(class525_sub19.aLong7113
						 * -5126207504388691097L));
			return true;
		    }
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub19(string), (long) i);
	return true;
    }
    
    void method6220(RSBuffer class525_sub38, byte i) {
	int i_35_ = class525_sub38.readUnsignedByte(702023);
	if (i_35_ < 1 || i_35_ > 6)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i_35_).toString());
	int i_36_ = class525_sub38.readUnsignedByte(243425117);
	if (0 != (i_36_ & 0x1))
	    aBool3755 = true;
	if ((i_36_ & 0x2) != 0)
	    aBool3756 = true;
	if (!aBool3755) {
	    aLongArray3776 = null;
	    aLongArray3777 = null;
	}
	if (!aBool3756) {
	    aStringArray3763 = null;
	    aStringArray3778 = null;
	}
	anInt3758 = class525_sub38.readInt(1121285039) * 440385575;
	anInt3760 = class525_sub38.readInt(1878033285) * -567392541;
	if (i_35_ <= 3 && 0 != 16461515 * anInt3760)
	    anInt3760 += 1617387744;
	anInt3766 = class525_sub38.readUnsignedShort((byte) 122) * -1932889371;
	anInt3775 = class525_sub38.readUnsignedByte(1303240206) * -1368562385;
	aString3759 = class525_sub38.readString((byte) 45);
	if (i_35_ >= 4)
	    class525_sub38.readInt(1764937520);
	aBool3761 = class525_sub38.readUnsignedByte(660289513) == 1;
	aByte3767 = class525_sub38.readByte(-1150098071);
	aByte3784 = class525_sub38.readByte(-1150098071);
	aByte3764 = class525_sub38.readByte(-1150098071);
	aByte3765 = class525_sub38.readByte(-1150098071);
	if (anInt3766 * -52364563 > 0) {
	    if (aBool3755
		&& (null == aLongArray3776
		    || aLongArray3776.length < -52364563 * anInt3766))
		aLongArray3776 = new long[-52364563 * anInt3766];
	    if (aBool3756
		&& (null == aStringArray3763
		    || aStringArray3763.length < anInt3766 * -52364563))
		aStringArray3763 = new String[anInt3766 * -52364563];
	    if (aByteArray3772 == null
		|| aByteArray3772.length < -52364563 * anInt3766)
		aByteArray3772 = new byte[anInt3766 * -52364563];
	    if (null == anIntArray3770
		|| anIntArray3770.length < anInt3766 * -52364563)
		anIntArray3770 = new int[anInt3766 * -52364563];
	    if (anIntArray3780 == null
		|| anIntArray3780.length < anInt3766 * -52364563)
		anIntArray3780 = new int[-52364563 * anInt3766];
	    if (aBoolArray3781 == null
		|| aBoolArray3781.length < -52364563 * anInt3766)
		aBoolArray3781 = new boolean[anInt3766 * -52364563];
	    for (int i_37_ = 0; i_37_ < anInt3766 * -52364563; i_37_++) {
		if (aBool3755)
		    aLongArray3776[i_37_]
			= class525_sub38.method16603(-474166334);
		if (aBool3756)
		    aStringArray3763[i_37_]
			= class525_sub38.method16635(-345564527);
		aByteArray3772[i_37_]
		    = class525_sub38.readByte(-1150098071);
		if (i_35_ >= 2)
		    anIntArray3770[i_37_]
			= class525_sub38.readInt(1983212636);
		if (i_35_ >= 5)
		    anIntArray3780[i_37_]
			= class525_sub38.readUnsignedShort((byte) 63);
		else
		    anIntArray3780[i_37_] = 0;
		if (i_35_ >= 6)
		    aBoolArray3781[i_37_]
			= class525_sub38.readUnsignedByte(276385897) == 1;
		else
		    aBoolArray3781[i_37_] = false;
	    }
	    method6252(1854416632);
	}
	if (anInt3775 * 1018823119 > 0) {
	    if (aBool3755
		&& (aLongArray3777 == null
		    || aLongArray3777.length < anInt3775 * 1018823119))
		aLongArray3777 = new long[anInt3775 * 1018823119];
	    if (aBool3756
		&& (aStringArray3778 == null
		    || aStringArray3778.length < anInt3775 * 1018823119))
		aStringArray3778 = new String[1018823119 * anInt3775];
	    for (int i_38_ = 0; i_38_ < anInt3775 * 1018823119; i_38_++) {
		if (aBool3755)
		    aLongArray3777[i_38_]
			= class525_sub38.method16603(-1479727493);
		if (aBool3756)
		    aStringArray3778[i_38_]
			= class525_sub38.method16635(1909040501);
	    }
	}
	if (i_35_ >= 3) {
	    int i_39_ = class525_sub38.readUnsignedShort((byte) 92);
	    if (i_39_ > 0) {
		aClass10_3754
		    = new Class10(i_39_ < 16
				  ? Class212.method3935(i_39_, -2056250364)
				  : 16);
		while (i_39_-- > 0) {
		    int i_40_ = class525_sub38.readInt(1927499840);
		    int i_41_ = i_40_ & 0x3fffffff;
		    int i_42_ = i_40_ >>> 30;
		    if (0 == i_42_) {
			int i_43_ = class525_sub38.readInt(924132349);
			aClass10_3754.method695(new Class525_Sub42(i_43_),
						(long) i_41_);
		    } else if (i_42_ == 1) {
			long l = class525_sub38.method16603(155658747);
			aClass10_3754.method695(new Class525_Sub31(l),
						(long) i_41_);
		    } else if (i_42_ == 2) {
			String string = class525_sub38.readString((byte) -4);
			aClass10_3754.method695(new Class525_Sub19(string),
						(long) i_41_);
		    }
		}
	    }
	}
    }
    
    void method6221(int i) {
	if (aBool3755) {
	    if (null != aLongArray3776)
		System.arraycopy(aLongArray3776, 0,
				 aLongArray3776 = new long[i], 0,
				 -52364563 * anInt3766);
	    else
		aLongArray3776 = new long[i];
	}
	if (aBool3756) {
	    if (null != aStringArray3763)
		System.arraycopy(aStringArray3763, 0,
				 aStringArray3763 = new String[i], 0,
				 -52364563 * anInt3766);
	    else
		aStringArray3763 = new String[i];
	}
	if (aByteArray3772 != null)
	    System.arraycopy(aByteArray3772, 0, aByteArray3772 = new byte[i],
			     0, -52364563 * anInt3766);
	else
	    aByteArray3772 = new byte[i];
	if (anIntArray3770 != null)
	    System.arraycopy(anIntArray3770, 0, anIntArray3770 = new int[i], 0,
			     anInt3766 * -52364563);
	else
	    anIntArray3770 = new int[i];
	if (anIntArray3780 != null)
	    System.arraycopy(anIntArray3780, 0, anIntArray3780 = new int[i], 0,
			     anInt3766 * -52364563);
	else
	    anIntArray3780 = new int[i];
	if (null != aBoolArray3781)
	    System.arraycopy(aBoolArray3781, 0,
			     aBoolArray3781 = new boolean[i], 0,
			     anInt3766 * -52364563);
	else
	    aBoolArray3781 = new boolean[i];
    }
    
    void method6222(int i) {
	if (aBool3755) {
	    if (null != aLongArray3776)
		System.arraycopy(aLongArray3776, 0,
				 aLongArray3776 = new long[i], 0,
				 -52364563 * anInt3766);
	    else
		aLongArray3776 = new long[i];
	}
	if (aBool3756) {
	    if (null != aStringArray3763)
		System.arraycopy(aStringArray3763, 0,
				 aStringArray3763 = new String[i], 0,
				 -52364563 * anInt3766);
	    else
		aStringArray3763 = new String[i];
	}
	if (aByteArray3772 != null)
	    System.arraycopy(aByteArray3772, 0, aByteArray3772 = new byte[i],
			     0, -52364563 * anInt3766);
	else
	    aByteArray3772 = new byte[i];
	if (anIntArray3770 != null)
	    System.arraycopy(anIntArray3770, 0, anIntArray3770 = new int[i], 0,
			     anInt3766 * -52364563);
	else
	    anIntArray3770 = new int[i];
	if (anIntArray3780 != null)
	    System.arraycopy(anIntArray3780, 0, anIntArray3780 = new int[i], 0,
			     anInt3766 * -52364563);
	else
	    anIntArray3780 = new int[i];
	if (null != aBoolArray3781)
	    System.arraycopy(aBoolArray3781, 0,
			     aBoolArray3781 = new boolean[i], 0,
			     anInt3766 * -52364563);
	else
	    aBoolArray3781 = new boolean[i];
    }
    
    public int method6223(String string) {
	if (string == null || string.length() == 0)
	    return -1;
	for (int i = 0; i < -52364563 * anInt3766; i++) {
	    if (aStringArray3763[i].equals(string))
		return i;
	}
	return -1;
    }
    
    public int method6224(String string) {
	if (string == null || string.length() == 0)
	    return -1;
	for (int i = 0; i < -52364563 * anInt3766; i++) {
	    if (aStringArray3763[i].equals(string))
		return i;
	}
	return -1;
    }
    
    public int method6225(int i, int i_44_, int i_45_) {
	int i_46_ = i_45_ == 31 ? -1 : (1 << 1 + i_45_) - 1;
	return (anIntArray3770[i] & i_46_) >>> i_44_;
    }
    
    public Integer method6226(int i) {
	if (aClass10_3754 == null)
	    return null;
	Class525 class525 = aClass10_3754.method684((long) i);
	if (class525 == null || !(class525 instanceof Class525_Sub42))
	    return null;
	return new Integer(((Class525_Sub42) class525).anInt10858
			   * -1344652871);
    }
    
    public Long method6227(int i) {
	if (null == aClass10_3754)
	    return null;
	Class525 class525 = aClass10_3754.method684((long) i);
	if (class525 == null || !(class525 instanceof Class525_Sub31))
	    return null;
	return new Long(((Class525_Sub31) class525).aLong10732
			* 3461934040741021073L);
    }
    
    public Long method6228(int i) {
	if (null == aClass10_3754)
	    return null;
	Class525 class525 = aClass10_3754.method684((long) i);
	if (class525 == null || !(class525 instanceof Class525_Sub31))
	    return null;
	return new Long(((Class525_Sub31) class525).aLong10732
			* 3461934040741021073L);
    }
    
    boolean method6229(int i, long l) {
	if (null != aClass10_3754) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (null != class525) {
		if (class525 instanceof Class525_Sub31) {
		    Class525_Sub31 class525_sub31 = (Class525_Sub31) class525;
		    if (3461934040741021073L * class525_sub31.aLong10732 == l)
			return false;
		    class525_sub31.aLong10732 = -3312960714849657999L * l;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub31(l), (long) i);
	return true;
    }
    
    public int[] method6230() {
	if (anIntArray3769 == null) {
	    String[] strings = new String[-52364563 * anInt3766];
	    anIntArray3769 = new int[anInt3766 * -52364563];
	    for (int i = 0; i < anInt3766 * -52364563; i++) {
		strings[i] = aStringArray3763[i];
		if (null != strings[i])
		    strings[i] = strings[i].toLowerCase();
		anIntArray3769[i] = i;
	    }
	    Class610.method10025(strings, anIntArray3769, (byte) -77);
	}
	return anIntArray3769;
    }
    
    void method6231(long l, String string, int i, short i_47_) {
	if (null != string && string.length() == 0)
	    string = null;
	if (l > 0L != aBool3755)
	    throw new RuntimeException("");
	if ((null != string) != aBool3756)
	    throw new RuntimeException("");
	if (l > 0L && (null == aLongArray3776
		       || anInt3766 * -52364563 >= aLongArray3776.length)
	    || (null != string
		&& (aStringArray3763 == null
		    || anInt3766 * -52364563 >= aStringArray3763.length)))
	    method6201(5 + -52364563 * anInt3766, -1353691520);
	if (aLongArray3776 != null)
	    aLongArray3776[-52364563 * anInt3766] = l;
	if (aStringArray3763 != null)
	    aStringArray3763[anInt3766 * -52364563] = string;
	if (1701332407 * anInt3773 == -1) {
	    anInt3773 = -1680579461 * anInt3766;
	    aByteArray3772[anInt3766 * -52364563] = (byte) 126;
	} else
	    aByteArray3772[-52364563 * anInt3766] = (byte) 0;
	anIntArray3770[anInt3766 * -52364563] = 0;
	anIntArray3780[anInt3766 * -52364563] = i;
	aBoolArray3781[-52364563 * anInt3766] = false;
	anInt3766 += -1932889371;
	anIntArray3769 = null;
    }
    
    boolean method6232(int i, int i_48_, int i_49_, int i_50_) {
	int i_51_ = (1 << i_49_) - 1;
	int i_52_ = 31 == i_50_ ? -1 : (1 << i_50_ + 1) - 1;
	int i_53_ = i_52_ ^ i_51_;
	i_48_ <<= i_49_;
	i_48_ &= i_53_;
	if (null != aClass10_3754) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (class525 != null) {
		if (class525 instanceof Class525_Sub42) {
		    Class525_Sub42 class525_sub42 = (Class525_Sub42) class525;
		    if ((class525_sub42.anInt10858 * -1344652871 & i_53_)
			== i_48_)
			return false;
		    Class525_Sub42 class525_sub42_54_;
		    (class525_sub42_54_ = class525_sub42).anInt10858
			= (-854721399
			   * (-1344652871 * class525_sub42_54_.anInt10858
			      & (i_53_ ^ 0xffffffff)));
		    Class525_Sub42 class525_sub42_55_;
		    (class525_sub42_55_ = class525_sub42).anInt10858
			= (-1344652871 * class525_sub42_55_.anInt10858
			   | i_48_) * -854721399;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub42(i_48_), (long) i);
	return true;
    }
    
    void method6233(long l, String string, int i) {
	if (null != string && string.length() == 0)
	    string = null;
	if (l > 0L != aBool3755)
	    throw new RuntimeException("");
	if ((null != string) != aBool3756)
	    throw new RuntimeException("");
	if (l > 0L && (null == aLongArray3776
		       || anInt3766 * -52364563 >= aLongArray3776.length)
	    || (null != string
		&& (aStringArray3763 == null
		    || anInt3766 * -52364563 >= aStringArray3763.length)))
	    method6201(5 + -52364563 * anInt3766, -1353691520);
	if (aLongArray3776 != null)
	    aLongArray3776[-52364563 * anInt3766] = l;
	if (aStringArray3763 != null)
	    aStringArray3763[anInt3766 * -52364563] = string;
	if (1701332407 * anInt3773 == -1) {
	    anInt3773 = -1680579461 * anInt3766;
	    aByteArray3772[anInt3766 * -52364563] = (byte) 126;
	} else
	    aByteArray3772[-52364563 * anInt3766] = (byte) 0;
	anIntArray3770[anInt3766 * -52364563] = 0;
	anIntArray3780[anInt3766 * -52364563] = i;
	aBoolArray3781[-52364563 * anInt3766] = false;
	anInt3766 += -1932889371;
	anIntArray3769 = null;
    }
    
    void method6234(long l, String string, int i) {
	if (null != string && string.length() == 0)
	    string = null;
	if (l > 0L != aBool3755)
	    throw new RuntimeException("");
	if ((null != string) != aBool3756)
	    throw new RuntimeException("");
	if (l > 0L && (null == aLongArray3776
		       || anInt3766 * -52364563 >= aLongArray3776.length)
	    || (null != string
		&& (aStringArray3763 == null
		    || anInt3766 * -52364563 >= aStringArray3763.length)))
	    method6201(5 + -52364563 * anInt3766, -1353691520);
	if (aLongArray3776 != null)
	    aLongArray3776[-52364563 * anInt3766] = l;
	if (aStringArray3763 != null)
	    aStringArray3763[anInt3766 * -52364563] = string;
	if (1701332407 * anInt3773 == -1) {
	    anInt3773 = -1680579461 * anInt3766;
	    aByteArray3772[anInt3766 * -52364563] = (byte) 126;
	} else
	    aByteArray3772[-52364563 * anInt3766] = (byte) 0;
	anIntArray3770[anInt3766 * -52364563] = 0;
	anIntArray3780[anInt3766 * -52364563] = i;
	aBoolArray3781[-52364563 * anInt3766] = false;
	anInt3766 += -1932889371;
	anIntArray3769 = null;
    }
    
    void method6235(int i) {
	if (i < 0 || i >= anInt3766 * -52364563)
	    throw new RuntimeException("");
	anInt3766 -= -1932889371;
	anIntArray3769 = null;
	if (0 == -52364563 * anInt3766) {
	    aLongArray3776 = null;
	    aStringArray3763 = null;
	    aByteArray3772 = null;
	    anIntArray3770 = null;
	    anIntArray3780 = null;
	    aBoolArray3781 = null;
	    anInt3773 = 2033539065;
	    anInt3774 = 1460038639;
	} else {
	    System.arraycopy(aByteArray3772, i + 1, aByteArray3772, i,
			     -52364563 * anInt3766 - i);
	    System.arraycopy(anIntArray3770, i + 1, anIntArray3770, i,
			     anInt3766 * -52364563 - i);
	    System.arraycopy(anIntArray3780, i + 1, anIntArray3780, i,
			     anInt3766 * -52364563 - i);
	    System.arraycopy(aBoolArray3781, i + 1, aBoolArray3781, i,
			     anInt3766 * -52364563 - i);
	    if (null != aLongArray3776)
		System.arraycopy(aLongArray3776, 1 + i, aLongArray3776, i,
				 anInt3766 * -52364563 - i);
	    if (null != aStringArray3763)
		System.arraycopy(aStringArray3763, i + 1, aStringArray3763, i,
				 anInt3766 * -52364563 - i);
	    method6252(2047441151);
	}
    }
    
    void method6236(int i) {
	anInt3775 -= -1368562385;
	if (0 == 1018823119 * anInt3775) {
	    aLongArray3777 = null;
	    aStringArray3778 = null;
	} else {
	    if (null != aLongArray3777)
		System.arraycopy(aLongArray3777, i + 1, aLongArray3777, i,
				 anInt3775 * 1018823119 - i);
	    if (null != aStringArray3778)
		System.arraycopy(aStringArray3778, i + 1, aStringArray3778, i,
				 anInt3775 * 1018823119 - i);
	}
    }
    
    void method6237(long l, String string) {
	if (null != string && string.length() == 0)
	    string = null;
	if (l > 0L != aBool3755)
	    throw new RuntimeException("");
	if (aBool3756 != (string != null))
	    throw new RuntimeException("");
	if (l > 0L && (null == aLongArray3777
		       || anInt3775 * 1018823119 >= aLongArray3777.length)
	    || (null != string
		&& (aStringArray3778 == null
		    || 1018823119 * anInt3775 >= aStringArray3778.length)))
	    method6202(5 + 1018823119 * anInt3775, -97158484);
	if (null != aLongArray3777)
	    aLongArray3777[anInt3775 * 1018823119] = l;
	if (null != aStringArray3778)
	    aStringArray3778[anInt3775 * 1018823119] = string;
	anInt3775 += -1368562385;
    }
    
    void method6238(long l, String string) {
	if (null != string && string.length() == 0)
	    string = null;
	if (l > 0L != aBool3755)
	    throw new RuntimeException("");
	if (aBool3756 != (string != null))
	    throw new RuntimeException("");
	if (l > 0L && (null == aLongArray3777
		       || anInt3775 * 1018823119 >= aLongArray3777.length)
	    || (null != string
		&& (aStringArray3778 == null
		    || 1018823119 * anInt3775 >= aStringArray3778.length)))
	    method6202(5 + 1018823119 * anInt3775, -97158484);
	if (null != aLongArray3777)
	    aLongArray3777[anInt3775 * 1018823119] = l;
	if (null != aStringArray3778)
	    aStringArray3778[anInt3775 * 1018823119] = string;
	anInt3775 += -1368562385;
    }
    
    public int method6239(String string, int i) {
	if (string == null || string.length() == 0)
	    return -1;
	for (int i_56_ = 0; i_56_ < -52364563 * anInt3766; i_56_++) {
	    if (aStringArray3763[i_56_].equals(string))
		return i_56_;
	}
	return -1;
    }
    
    int method6240(int i, int i_57_, int i_58_, int i_59_, int i_60_) {
	int i_61_ = (1 << i_58_) - 1;
	int i_62_ = 31 == i_59_ ? -1 : (1 << 1 + i_59_) - 1;
	int i_63_ = i_62_ ^ i_61_;
	i_57_ <<= i_58_;
	i_57_ &= i_63_;
	int i_64_ = anIntArray3770[i];
	if (i_57_ == (i_64_ & i_63_))
	    return -1;
	i_64_ &= i_63_ ^ 0xffffffff;
	anIntArray3770[i] = i_64_ | i_57_;
	return i;
    }
    
    void method6241(int i, byte i_65_) {
	if (i < 0 || i >= anInt3766 * -52364563)
	    throw new RuntimeException("");
	anInt3766 -= -1932889371;
	anIntArray3769 = null;
	if (0 == -52364563 * anInt3766) {
	    aLongArray3776 = null;
	    aStringArray3763 = null;
	    aByteArray3772 = null;
	    anIntArray3770 = null;
	    anIntArray3780 = null;
	    aBoolArray3781 = null;
	    anInt3773 = 2033539065;
	    anInt3774 = 1460038639;
	} else {
	    System.arraycopy(aByteArray3772, i + 1, aByteArray3772, i,
			     -52364563 * anInt3766 - i);
	    System.arraycopy(anIntArray3770, i + 1, anIntArray3770, i,
			     anInt3766 * -52364563 - i);
	    System.arraycopy(anIntArray3780, i + 1, anIntArray3780, i,
			     anInt3766 * -52364563 - i);
	    System.arraycopy(aBoolArray3781, i + 1, aBoolArray3781, i,
			     anInt3766 * -52364563 - i);
	    if (null != aLongArray3776)
		System.arraycopy(aLongArray3776, 1 + i, aLongArray3776, i,
				 anInt3766 * -52364563 - i);
	    if (null != aStringArray3763)
		System.arraycopy(aStringArray3763, i + 1, aStringArray3763, i,
				 anInt3766 * -52364563 - i);
	    method6252(1196292672);
	}
    }
    
    void method6242() {
	if (anInt3766 * -52364563 == 0) {
	    anInt3773 = 2033539065;
	    anInt3774 = 1460038639;
	} else {
	    anInt3773 = 2033539065;
	    anInt3774 = 1460038639;
	    int i = 0;
	    byte i_66_ = aByteArray3772[0];
	    for (int i_67_ = 1; i_67_ < -52364563 * anInt3766; i_67_++) {
		if (aByteArray3772[i_67_] > i_66_) {
		    if (125 == i_66_)
			anInt3774 = i * -1460038639;
		    i = i_67_;
		    i_66_ = aByteArray3772[i_67_];
		} else if (-1 == anInt3774 * 1308482801
			   && 125 == aByteArray3772[i_67_])
		    anInt3774 = -1460038639 * i_67_;
	    }
	    anInt3773 = i * -2033539065;
	    if (anInt3773 * 1701332407 != -1)
		aByteArray3772[anInt3773 * 1701332407] = (byte) 126;
	}
    }
    
    int method6243(int i, byte i_68_) {
	if (i_68_ == 126 || i_68_ == 127)
	    return -1;
	if (1701332407 * anInt3773 == i
	    && (-1 == anInt3774 * 1308482801
		|| aByteArray3772[anInt3774 * 1308482801] < 125))
	    return -1;
	if (aByteArray3772[i] == i_68_)
	    return -1;
	aByteArray3772[i] = i_68_;
	method6252(2015482971);
	return i;
    }
    
    int method6244(int i, byte i_69_) {
	if (i_69_ == 126 || i_69_ == 127)
	    return -1;
	if (1701332407 * anInt3773 == i
	    && (-1 == anInt3774 * 1308482801
		|| aByteArray3772[anInt3774 * 1308482801] < 125))
	    return -1;
	if (aByteArray3772[i] == i_69_)
	    return -1;
	aByteArray3772[i] = i_69_;
	method6252(1507479607);
	return i;
    }
    
    public int[] method6245(byte i) {
	if (anIntArray3769 == null) {
	    String[] strings = new String[-52364563 * anInt3766];
	    anIntArray3769 = new int[anInt3766 * -52364563];
	    for (int i_70_ = 0; i_70_ < anInt3766 * -52364563; i_70_++) {
		strings[i_70_] = aStringArray3763[i_70_];
		if (null != strings[i_70_])
		    strings[i_70_] = strings[i_70_].toLowerCase();
		anIntArray3769[i_70_] = i_70_;
	    }
	    Class610.method10025(strings, anIntArray3769, (byte) -41);
	}
	return anIntArray3769;
    }
    
    int method6246(int i, boolean bool) {
	if (bool == aBoolArray3781[i])
	    return -1;
	aBoolArray3781[i] = bool;
	return i;
    }
    
    int method6247(int i, int i_71_, int i_72_, int i_73_) {
	int i_74_ = (1 << i_72_) - 1;
	int i_75_ = 31 == i_73_ ? -1 : (1 << 1 + i_73_) - 1;
	int i_76_ = i_75_ ^ i_74_;
	i_71_ <<= i_72_;
	i_71_ &= i_76_;
	int i_77_ = anIntArray3770[i];
	if (i_71_ == (i_77_ & i_76_))
	    return -1;
	i_77_ &= i_76_ ^ 0xffffffff;
	anIntArray3770[i] = i_77_ | i_71_;
	return i;
    }
    
    boolean method6248(int i, int i_78_) {
	if (aClass10_3754 != null) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (null != class525) {
		if (class525 instanceof Class525_Sub42) {
		    Class525_Sub42 class525_sub42 = (Class525_Sub42) class525;
		    if (i_78_ == -1344652871 * class525_sub42.anInt10858)
			return false;
		    class525_sub42.anInt10858 = -854721399 * i_78_;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub42(i_78_), (long) i);
	return true;
    }
    
    boolean method6249(int i, int i_79_) {
	if (aClass10_3754 != null) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (null != class525) {
		if (class525 instanceof Class525_Sub42) {
		    Class525_Sub42 class525_sub42 = (Class525_Sub42) class525;
		    if (i_79_ == -1344652871 * class525_sub42.anInt10858)
			return false;
		    class525_sub42.anInt10858 = -854721399 * i_79_;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub42(i_79_), (long) i);
	return true;
    }
    
    boolean method6250(int i, int i_80_) {
	if (aClass10_3754 != null) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (null != class525) {
		if (class525 instanceof Class525_Sub42) {
		    Class525_Sub42 class525_sub42 = (Class525_Sub42) class525;
		    if (i_80_ == -1344652871 * class525_sub42.anInt10858)
			return false;
		    class525_sub42.anInt10858 = -854721399 * i_80_;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub42(i_80_), (long) i);
	return true;
    }
    
    boolean method6251(int i, int i_81_) {
	if (aClass10_3754 != null) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (null != class525) {
		if (class525 instanceof Class525_Sub42) {
		    Class525_Sub42 class525_sub42 = (Class525_Sub42) class525;
		    if (i_81_ == -1344652871 * class525_sub42.anInt10858)
			return false;
		    class525_sub42.anInt10858 = -854721399 * i_81_;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub42(i_81_), (long) i);
	return true;
    }
    
    void method6252(int i) {
	if (anInt3766 * -52364563 == 0) {
	    anInt3773 = 2033539065;
	    anInt3774 = 1460038639;
	} else {
	    anInt3773 = 2033539065;
	    anInt3774 = 1460038639;
	    int i_82_ = 0;
	    byte i_83_ = aByteArray3772[0];
	    for (int i_84_ = 1; i_84_ < -52364563 * anInt3766; i_84_++) {
		if (aByteArray3772[i_84_] > i_83_) {
		    if (125 == i_83_)
			anInt3774 = i_82_ * -1460038639;
		    i_82_ = i_84_;
		    i_83_ = aByteArray3772[i_84_];
		} else if (-1 == anInt3774 * 1308482801
			   && 125 == aByteArray3772[i_84_])
		    anInt3774 = -1460038639 * i_84_;
	    }
	    anInt3773 = i_82_ * -2033539065;
	    if (anInt3773 * 1701332407 != -1)
		aByteArray3772[anInt3773 * 1701332407] = (byte) 126;
	}
    }
    
    boolean method6253(int i, long l) {
	if (null != aClass10_3754) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (null != class525) {
		if (class525 instanceof Class525_Sub31) {
		    Class525_Sub31 class525_sub31 = (Class525_Sub31) class525;
		    if (3461934040741021073L * class525_sub31.aLong10732 == l)
			return false;
		    class525_sub31.aLong10732 = -3312960714849657999L * l;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub31(l), (long) i);
	return true;
    }
    
    boolean method6254(int i, long l) {
	if (null != aClass10_3754) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (null != class525) {
		if (class525 instanceof Class525_Sub31) {
		    Class525_Sub31 class525_sub31 = (Class525_Sub31) class525;
		    if (3461934040741021073L * class525_sub31.aLong10732 == l)
			return false;
		    class525_sub31.aLong10732 = -3312960714849657999L * l;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub31(l), (long) i);
	return true;
    }
    
    boolean method6255(int i, long l) {
	if (null != aClass10_3754) {
	    Class525 class525 = aClass10_3754.method684((long) i);
	    if (null != class525) {
		if (class525 instanceof Class525_Sub31) {
		    Class525_Sub31 class525_sub31 = (Class525_Sub31) class525;
		    if (3461934040741021073L * class525_sub31.aLong10732 == l)
			return false;
		    class525_sub31.aLong10732 = -3312960714849657999L * l;
		    return true;
		}
		class525.method8755(-1933461091);
	    }
	} else
	    aClass10_3754 = new Class10(4);
	aClass10_3754.method695(new Class525_Sub31(l), (long) i);
	return true;
    }
    
    public int[] method6256() {
	if (anIntArray3769 == null) {
	    String[] strings = new String[-52364563 * anInt3766];
	    anIntArray3769 = new int[anInt3766 * -52364563];
	    for (int i = 0; i < anInt3766 * -52364563; i++) {
		strings[i] = aStringArray3763[i];
		if (null != strings[i])
		    strings[i] = strings[i].toLowerCase();
		anIntArray3769[i] = i;
	    }
	    Class610.method10025(strings, anIntArray3769, (byte) 34);
	}
	return anIntArray3769;
    }
    
    void method6257(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(1835063427);
	if (i < 1 || i > 6)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i).toString());
	int i_85_ = class525_sub38.readUnsignedByte(177835906);
	if (0 != (i_85_ & 0x1))
	    aBool3755 = true;
	if ((i_85_ & 0x2) != 0)
	    aBool3756 = true;
	if (!aBool3755) {
	    aLongArray3776 = null;
	    aLongArray3777 = null;
	}
	if (!aBool3756) {
	    aStringArray3763 = null;
	    aStringArray3778 = null;
	}
	anInt3758 = class525_sub38.readInt(2129874906) * 440385575;
	anInt3760 = class525_sub38.readInt(884178221) * -567392541;
	if (i <= 3 && 0 != 16461515 * anInt3760)
	    anInt3760 += 1617387744;
	anInt3766 = class525_sub38.readUnsignedShort((byte) 73) * -1932889371;
	anInt3775 = class525_sub38.readUnsignedByte(352563707) * -1368562385;
	aString3759 = class525_sub38.readString((byte) 41);
	if (i >= 4)
	    class525_sub38.readInt(1613704646);
	aBool3761 = class525_sub38.readUnsignedByte(71362209) == 1;
	aByte3767 = class525_sub38.readByte(-1150098071);
	aByte3784 = class525_sub38.readByte(-1150098071);
	aByte3764 = class525_sub38.readByte(-1150098071);
	aByte3765 = class525_sub38.readByte(-1150098071);
	if (anInt3766 * -52364563 > 0) {
	    if (aBool3755
		&& (null == aLongArray3776
		    || aLongArray3776.length < -52364563 * anInt3766))
		aLongArray3776 = new long[-52364563 * anInt3766];
	    if (aBool3756
		&& (null == aStringArray3763
		    || aStringArray3763.length < anInt3766 * -52364563))
		aStringArray3763 = new String[anInt3766 * -52364563];
	    if (aByteArray3772 == null
		|| aByteArray3772.length < -52364563 * anInt3766)
		aByteArray3772 = new byte[anInt3766 * -52364563];
	    if (null == anIntArray3770
		|| anIntArray3770.length < anInt3766 * -52364563)
		anIntArray3770 = new int[anInt3766 * -52364563];
	    if (anIntArray3780 == null
		|| anIntArray3780.length < anInt3766 * -52364563)
		anIntArray3780 = new int[-52364563 * anInt3766];
	    if (aBoolArray3781 == null
		|| aBoolArray3781.length < -52364563 * anInt3766)
		aBoolArray3781 = new boolean[anInt3766 * -52364563];
	    for (int i_86_ = 0; i_86_ < anInt3766 * -52364563; i_86_++) {
		if (aBool3755)
		    aLongArray3776[i_86_]
			= class525_sub38.method16603(-1115221347);
		if (aBool3756)
		    aStringArray3763[i_86_]
			= class525_sub38.method16635(1485336632);
		aByteArray3772[i_86_]
		    = class525_sub38.readByte(-1150098071);
		if (i >= 2)
		    anIntArray3770[i_86_]
			= class525_sub38.readInt(2085041839);
		if (i >= 5)
		    anIntArray3780[i_86_]
			= class525_sub38.readUnsignedShort((byte) 127);
		else
		    anIntArray3780[i_86_] = 0;
		if (i >= 6)
		    aBoolArray3781[i_86_]
			= class525_sub38.readUnsignedByte(654998703) == 1;
		else
		    aBoolArray3781[i_86_] = false;
	    }
	    method6252(2107568968);
	}
	if (anInt3775 * 1018823119 > 0) {
	    if (aBool3755
		&& (aLongArray3777 == null
		    || aLongArray3777.length < anInt3775 * 1018823119))
		aLongArray3777 = new long[anInt3775 * 1018823119];
	    if (aBool3756
		&& (aStringArray3778 == null
		    || aStringArray3778.length < anInt3775 * 1018823119))
		aStringArray3778 = new String[1018823119 * anInt3775];
	    for (int i_87_ = 0; i_87_ < anInt3775 * 1018823119; i_87_++) {
		if (aBool3755)
		    aLongArray3777[i_87_]
			= class525_sub38.method16603(-1822122107);
		if (aBool3756)
		    aStringArray3778[i_87_]
			= class525_sub38.method16635(-1931941017);
	    }
	}
	if (i >= 3) {
	    int i_88_ = class525_sub38.readUnsignedShort((byte) 69);
	    if (i_88_ > 0) {
		aClass10_3754
		    = new Class10(i_88_ < 16
				  ? Class212.method3935(i_88_, -2056250364)
				  : 16);
		while (i_88_-- > 0) {
		    int i_89_ = class525_sub38.readInt(1033015989);
		    int i_90_ = i_89_ & 0x3fffffff;
		    int i_91_ = i_89_ >>> 30;
		    if (0 == i_91_) {
			int i_92_ = class525_sub38.readInt(1099813261);
			aClass10_3754.method695(new Class525_Sub42(i_92_),
						(long) i_90_);
		    } else if (i_91_ == 1) {
			long l = class525_sub38.method16603(-183072856);
			aClass10_3754.method695(new Class525_Sub31(l),
						(long) i_90_);
		    } else if (i_91_ == 2) {
			String string = class525_sub38.readString((byte) -37);
			aClass10_3754.method695(new Class525_Sub19(string),
						(long) i_90_);
		    }
		}
	    }
	}
    }
    
    public static boolean method6258(char c, byte i) {
	return c >= '0' && c <= '9';
    }
}
