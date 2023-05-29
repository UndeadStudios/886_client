/* Class179_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.Stream;

import jaggl.OpenGL;

public class Class179_Sub1 extends Class179
{
    Interface16 anInterface16_9035;
    static final int anInt9036 = 7;
    byte aByte9037;
    static final int anInt9038 = 2;
    short[] aShortArray9039;
    static final int anInt9040 = 4;
    Class182_Sub3 aClass182_Sub3_9041;
    int[][] anIntArrayArray9042;
    int anInt9043;
    short[] aShortArray9044;
    boolean aBool9045 = false;
    int[] anIntArray9046;
    short aShort9047;
    int[][] anIntArrayArray9048;
    boolean aBool9049 = false;
    static int anInt9050;
    Class137 aClass137_9051;
    int[] anIntArray9052;
    static final int anInt9053 = 8;
    int[] anIntArray9054;
    int[][] anIntArrayArray9055;
    short[] aShortArray9056;
    int anInt9057;
    float[] aFloatArray9058;
    short[] aShortArray9059;
    short[] aShortArray9060;
    byte[] aByteArray9061;
    int anInt9062 = 0;
    Class145 aClass145_9063;
    float[] aFloatArray9064;
    int anInt9065;
    static int[] anIntArray9066;
    short[] aShortArray9067;
    byte[] aByteArray9068;
    int[] anIntArray9069;
    short[] aShortArray9070;
    short[] aShortArray9071;
    int anInt9072 = 0;
    short[] aShortArray9073;
    int anInt9074;
    Class137 aClass137_9075;
    Class137 aClass137_9076;
    static final int anInt9077 = 1;
    Class137 aClass137_9078;
    Class139 aClass139_9079;
    int anInt9080;
    Interface15 anInterface15_9081;
    static boolean aBool9082;
    int anInt9083;
    int anInt9084;
    boolean aBool9085;
    short aShort9086;
    static long[] aLongArray9087;
    short aShort9088;
    short aShort9089;
    short aShort9090;
    short[] aShortArray9091;
    boolean aBool9092;
    short aShort9093;
    int[] anIntArray9094;
    boolean aBool9095;
    short[] aShortArray9096;
    Class184[] aClass184Array9097;
    MagnetConfig[] aClass154Array9098;
    static final int anInt9099 = 4;
    Class148[] aClass148Array9100;
    Class131[] aClass131Array9101;
    short aShort9102;
    short aShort9103;
    static float[] aFloatArray9104 = new float[2];
    static int[] anIntArray9105 = new int[8];
    static int[] anIntArray9106 = new int[8];
    static final int anInt9107 = 16;
    static int anInt9108;
    static int anInt9109;
    short aShort9110;
    int anInt9111;
    
    void method14549(Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1) {
	if (aClass182_Sub3_9041.anIntArray9829.length < anInt9057) {
	    aClass182_Sub3_9041.anIntArray9829 = new int[anInt9057];
	    aClass182_Sub3_9041.anIntArray9830 = new int[anInt9057];
	}
	int[] is = aClass182_Sub3_9041.anIntArray9829;
	int[] is_0_ = aClass182_Sub3_9041.anIntArray9830;
	for (int i = 0; i < anInt9072; i++) {
	    int i_1_ = (((anIntArray9052[i]
			  - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9697
			     >> 8))
			 >> aClass182_Sub3_9041.anInt9800)
			- class525_sub16_sub17_sub1.anInt12109);
	    int i_2_ = (((anIntArray9054[i]
			  - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9765
			     >> 8))
			 >> aClass182_Sub3_9041.anInt9800)
			- class525_sub16_sub17_sub1.anInt12111);
	    int i_3_ = anIntArray9046[i];
	    int i_4_ = anIntArray9046[i + 1];
	    for (int i_5_ = i_3_; i_5_ < i_4_ && aShortArray9096[i_5_] != 0;
		 i_5_++) {
		int i_6_ = (aShortArray9096[i_5_] & 0xffff) - 1;
		is[i_6_] = i_1_;
		is_0_[i_6_] = i_2_;
	    }
	}
	for (int i = 0; i < anInt9111; i++) {
	    if (aByteArray9068 == null || aByteArray9068[i] <= 128) {
		int i_7_ = aShortArray9091[i] & 0xffff;
		int i_8_ = aShortArray9070[i] & 0xffff;
		int i_9_ = aShortArray9071[i] & 0xffff;
		int i_10_ = is[i_7_];
		int i_11_ = is[i_8_];
		int i_12_ = is[i_9_];
		int i_13_ = is_0_[i_7_];
		int i_14_ = is_0_[i_8_];
		int i_15_ = is_0_[i_9_];
		if (((i_10_ - i_11_) * (i_14_ - i_15_)
		     - (i_14_ - i_13_) * (i_12_ - i_11_))
		    > 0)
		    class525_sub16_sub17_sub1.method18765(i_13_, i_14_, i_15_,
							  i_10_, i_11_, i_12_);
	    }
	}
    }
    
    public void method3059(short i, short i_16_) {
	Textures class180 = aClass182_Sub3_9041.aClass180_1944;
	for (int i_17_ = 0; i_17_ < anInt9065; i_17_++) {
	    if (aShortArray9039[i_17_] == i)
		aShortArray9039[i_17_] = i_16_;
	}
	byte i_18_ = 0;
	byte i_19_ = 0;
	if (i != -1) {
	    TextureMetrics class166 = class180.method3116(i & 0xffff, -1431554601);
	    i_18_ = class166.aByte1785;
	    i_19_ = class166.aByte1831;
	}
	byte i_20_ = 0;
	byte i_21_ = 0;
	if (i_16_ != -1) {
	    TextureMetrics class166
		= class180.method3116(i_16_ & 0xffff, -1431554601);
	    i_20_ = class166.aByte1785;
	    i_21_ = class166.aByte1831;
	    if (class166.aByte1805 != 0 || class166.aByte1806 != 0)
		aBool9049 = true;
	}
	if (i_18_ != i_20_ | i_19_ != i_21_) {
	    if (aClass148Array9100 != null) {
		for (int i_22_ = 0; i_22_ < anInt9074; i_22_++) {
		    Class148 class148 = aClass148Array9100[i_22_];
		    Class131 class131 = aClass131Array9101[i_22_];
		    class131.anInt1582
			= (class131.anInt1582 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9067[class148.anInt1694] & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (aClass137_9076 != null)
		aClass137_9076.anInterface15_1635 = null;
	}
    }
    
    short method14550(ModelDecoder class186, int i, long l, int i_23_, int i_24_,
                      int i_25_, int i_26_, float f, float f_27_) {
	int i_28_ = anIntArray9046[i];
	int i_29_ = anIntArray9046[i + 1];
	int i_30_ = 0;
	for (int i_31_ = i_28_; i_31_ < i_29_; i_31_++) {
	    if (aShortArray9096[i_31_] == 0) {
		i_30_ = i_31_;
		break;
	    }
	    int i_32_ = (aShortArray9096[i_31_] & 0xffff) - 1;
	    if (aLongArray9087[i_31_] == l)
		return (short) i_32_;
	}
	aShortArray9096[i_30_] = (short) (anInt9057 + 1);
	aLongArray9087[i_30_] = l;
	aShortArray9073[anInt9057] = (short) i_23_;
	aShortArray9059[anInt9057] = (short) i_24_;
	aShortArray9060[anInt9057] = (short) i_25_;
	aByteArray9061[anInt9057] = (byte) i_26_;
	aFloatArray9058[anInt9057] = f;
	aFloatArray9064[anInt9057] = f_27_;
	return (short) anInt9057++;
    }
    
    static byte[] method14551(byte[] is, int i) {
	byte[] is_33_ = new byte[i];
	System.arraycopy(is, 0, is_33_, 0, i);
	return is_33_;
    }
    
    public void method3052(short i, short i_34_) {
	for (int i_35_ = 0; i_35_ < anInt9065; i_35_++) {
	    if (aShortArray9067[i_35_] == i)
		aShortArray9067[i_35_] = i_34_;
	}
	if (aClass148Array9100 != null) {
	    for (int i_36_ = 0; i_36_ < anInt9074; i_36_++) {
		Class148 class148 = aClass148Array9100[i_36_];
		Class131 class131 = aClass131Array9101[i_36_];
		class131.anInt1582
		    = (class131.anInt1582 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9067[class148.anInt1694] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    static float[] method14552(float[] fs, int i) {
	float[] fs_37_ = new float[i];
	System.arraycopy(fs, 0, fs_37_, 0, i);
	return fs_37_;
    }
    
    public int method2928() {
	return anInt9043;
    }
    
    public void method3010(int i) {
	anInt9043 = i;
	if (aClass145_9063 != null && (anInt9043 & 0x10000) == 0) {
	    aShortArray9073 = aClass145_9063.aShortArray1672;
	    aShortArray9059 = aClass145_9063.aShortArray1671;
	    aShortArray9060 = aClass145_9063.aShortArray1669;
	    aByteArray9061 = aClass145_9063.aByteArray1670;
	    aClass145_9063 = null;
	}
	aBool9095 = true;
	method14590();
    }
    
    public void method2929() {
	if (anInt9057 > 0 && anInt9111 > 0) {
	    method14564(false);
	    if ((aByte9037 & 0x10) == 0
		&& aClass139_9079.anInterface16_1642 == null)
		method14563(false);
	    method14590();
	}
    }
    
    static short[] method14553(short[] is, int i) {
	short[] is_38_ = new short[i];
	System.arraycopy(is, 0, is_38_, 0, i);
	return is_38_;
    }
    
    Class179 method14554(Class179_Sub1 class179_sub1_39_,
			 Class179_Sub1 class179_sub1_40_, int i, boolean bool,
			 boolean bool_41_) {
	class179_sub1_39_.aByte9037 = (byte) 0;
	class179_sub1_39_.anInt9043 = i;
	class179_sub1_39_.anInt9080 = anInt9080;
	class179_sub1_39_.aShort9110 = aShort9110;
	class179_sub1_39_.aShort9047 = aShort9047;
	class179_sub1_39_.anInt9062 = anInt9062;
	class179_sub1_39_.anInt9072 = anInt9072;
	class179_sub1_39_.anInt9057 = anInt9057;
	class179_sub1_39_.anInt9065 = anInt9065;
	class179_sub1_39_.anInt9111 = anInt9111;
	class179_sub1_39_.anInt9074 = anInt9074;
	if ((i & 0x100) != 0)
	    class179_sub1_39_.aBool9045 = true;
	else
	    class179_sub1_39_.aBool9045 = aBool9045;
	class179_sub1_39_.aBool9049 = aBool9049;
	boolean bool_42_ = Class125.method2129(i, anInt9080);
	boolean bool_43_ = Class125.method2148(i, anInt9080);
	boolean bool_44_ = Class125.method2176(i, anInt9080);
	boolean bool_45_ = bool_42_ | bool_43_ | bool_44_;
	if (bool_45_) {
	    if (bool_42_) {
		if (class179_sub1_40_.anIntArray9052 == null
		    || class179_sub1_40_.anIntArray9052.length < anInt9062)
		    class179_sub1_39_.anIntArray9052
			= class179_sub1_40_.anIntArray9052
			= new int[anInt9062];
		else
		    class179_sub1_39_.anIntArray9052
			= class179_sub1_40_.anIntArray9052;
	    } else
		class179_sub1_39_.anIntArray9052 = anIntArray9052;
	    if (bool_43_) {
		if (class179_sub1_40_.anIntArray9069 == null
		    || class179_sub1_40_.anIntArray9069.length < anInt9062)
		    class179_sub1_39_.anIntArray9069
			= class179_sub1_40_.anIntArray9069
			= new int[anInt9062];
		else
		    class179_sub1_39_.anIntArray9069
			= class179_sub1_40_.anIntArray9069;
	    } else
		class179_sub1_39_.anIntArray9069 = anIntArray9069;
	    if (bool_44_) {
		if (class179_sub1_40_.anIntArray9054 == null
		    || class179_sub1_40_.anIntArray9054.length < anInt9062)
		    class179_sub1_39_.anIntArray9054
			= class179_sub1_40_.anIntArray9054
			= new int[anInt9062];
		else
		    class179_sub1_39_.anIntArray9054
			= class179_sub1_40_.anIntArray9054;
	    } else
		class179_sub1_39_.anIntArray9054 = anIntArray9054;
	    for (int i_46_ = 0; i_46_ < anInt9062; i_46_++) {
		if (bool_42_)
		    class179_sub1_39_.anIntArray9052[i_46_]
			= anIntArray9052[i_46_];
		if (bool_43_)
		    class179_sub1_39_.anIntArray9069[i_46_]
			= anIntArray9069[i_46_];
		if (bool_44_)
		    class179_sub1_39_.anIntArray9054[i_46_]
			= anIntArray9054[i_46_];
	    }
	} else {
	    class179_sub1_39_.anIntArray9052 = anIntArray9052;
	    class179_sub1_39_.anIntArray9069 = anIntArray9069;
	    class179_sub1_39_.anIntArray9054 = anIntArray9054;
	}
	if (Class125.method2182(i, anInt9080)) {
	    if (bool)
		class179_sub1_39_.aByte9037 |= 0x1;
	    class179_sub1_39_.aClass137_9075
		= class179_sub1_40_.aClass137_9075;
	    class179_sub1_39_.aClass137_9075.aByte1634
		= aClass137_9075.aByte1634;
	    class179_sub1_39_.aClass137_9075.anInterface15_1635
		= aClass137_9075.anInterface15_1635;
	} else if (Class125.method2141(i, anInt9080))
	    class179_sub1_39_.aClass137_9075 = aClass137_9075;
	else
	    class179_sub1_39_.aClass137_9075 = null;
	if (Class125.method2204(i, anInt9080)) {
	    if (class179_sub1_40_.aShortArray9067 == null
		|| class179_sub1_40_.aShortArray9067.length < anInt9065)
		class179_sub1_39_.aShortArray9067
		    = class179_sub1_40_.aShortArray9067 = new short[anInt9065];
	    else
		class179_sub1_39_.aShortArray9067
		    = class179_sub1_40_.aShortArray9067;
	    for (int i_47_ = 0; i_47_ < anInt9065; i_47_++)
		class179_sub1_39_.aShortArray9067[i_47_]
		    = aShortArray9067[i_47_];
	} else
	    class179_sub1_39_.aShortArray9067 = aShortArray9067;
	if (Class125.method2135(i, anInt9080)) {
	    if (class179_sub1_40_.aByteArray9068 == null
		|| class179_sub1_40_.aByteArray9068.length < anInt9065)
		class179_sub1_39_.aByteArray9068
		    = class179_sub1_40_.aByteArray9068 = new byte[anInt9065];
	    else
		class179_sub1_39_.aByteArray9068
		    = class179_sub1_40_.aByteArray9068;
	    for (int i_48_ = 0; i_48_ < anInt9065; i_48_++)
		class179_sub1_39_.aByteArray9068[i_48_]
		    = aByteArray9068[i_48_];
	} else
	    class179_sub1_39_.aByteArray9068 = aByteArray9068;
	if (Class125.method2227(i, anInt9080)) {
	    if (bool)
		class179_sub1_39_.aByte9037 |= 0x2;
	    class179_sub1_39_.aClass137_9076
		= class179_sub1_40_.aClass137_9076;
	    class179_sub1_39_.aClass137_9076.aByte1634
		= aClass137_9076.aByte1634;
	    class179_sub1_39_.aClass137_9076.anInterface15_1635
		= aClass137_9076.anInterface15_1635;
	} else if (Class125.method2143(i, anInt9080))
	    class179_sub1_39_.aClass137_9076 = aClass137_9076;
	else
	    class179_sub1_39_.aClass137_9076 = null;
	if (Class125.method2133(i, anInt9080)) {
	    if (class179_sub1_40_.aShortArray9073 == null
		|| class179_sub1_40_.aShortArray9073.length < anInt9057) {
		int i_49_ = anInt9057;
		class179_sub1_39_.aShortArray9073
		    = class179_sub1_40_.aShortArray9073 = new short[i_49_];
		class179_sub1_39_.aShortArray9059
		    = class179_sub1_40_.aShortArray9059 = new short[i_49_];
		class179_sub1_39_.aShortArray9060
		    = class179_sub1_40_.aShortArray9060 = new short[i_49_];
	    } else {
		class179_sub1_39_.aShortArray9073
		    = class179_sub1_40_.aShortArray9073;
		class179_sub1_39_.aShortArray9059
		    = class179_sub1_40_.aShortArray9059;
		class179_sub1_39_.aShortArray9060
		    = class179_sub1_40_.aShortArray9060;
	    }
	    if (aClass145_9063 != null) {
		if (class179_sub1_40_.aClass145_9063 == null)
		    class179_sub1_40_.aClass145_9063 = new Class145();
		Class145 class145 = (class179_sub1_39_.aClass145_9063
				     = class179_sub1_40_.aClass145_9063);
		if (class145.aShortArray1672 == null
		    || class145.aShortArray1672.length < anInt9057) {
		    int i_50_ = anInt9057;
		    class145.aShortArray1672 = new short[i_50_];
		    class145.aShortArray1671 = new short[i_50_];
		    class145.aShortArray1669 = new short[i_50_];
		    class145.aByteArray1670 = new byte[i_50_];
		}
		for (int i_51_ = 0; i_51_ < anInt9057; i_51_++) {
		    class179_sub1_39_.aShortArray9073[i_51_]
			= aShortArray9073[i_51_];
		    class179_sub1_39_.aShortArray9059[i_51_]
			= aShortArray9059[i_51_];
		    class179_sub1_39_.aShortArray9060[i_51_]
			= aShortArray9060[i_51_];
		    class145.aShortArray1672[i_51_]
			= aClass145_9063.aShortArray1672[i_51_];
		    class145.aShortArray1671[i_51_]
			= aClass145_9063.aShortArray1671[i_51_];
		    class145.aShortArray1669[i_51_]
			= aClass145_9063.aShortArray1669[i_51_];
		    class145.aByteArray1670[i_51_]
			= aClass145_9063.aByteArray1670[i_51_];
		}
	    } else {
		for (int i_52_ = 0; i_52_ < anInt9057; i_52_++) {
		    class179_sub1_39_.aShortArray9073[i_52_]
			= aShortArray9073[i_52_];
		    class179_sub1_39_.aShortArray9059[i_52_]
			= aShortArray9059[i_52_];
		    class179_sub1_39_.aShortArray9060[i_52_]
			= aShortArray9060[i_52_];
		}
	    }
	    class179_sub1_39_.aByteArray9061 = aByteArray9061;
	} else {
	    class179_sub1_39_.aClass145_9063 = aClass145_9063;
	    class179_sub1_39_.aShortArray9073 = aShortArray9073;
	    class179_sub1_39_.aShortArray9059 = aShortArray9059;
	    class179_sub1_39_.aShortArray9060 = aShortArray9060;
	    class179_sub1_39_.aByteArray9061 = aByteArray9061;
	}
	if (Class125.method2147(i, anInt9080)) {
	    if (bool)
		class179_sub1_39_.aByte9037 |= 0x4;
	    class179_sub1_39_.aClass137_9051
		= class179_sub1_40_.aClass137_9051;
	    class179_sub1_39_.aClass137_9051.aByte1634
		= aClass137_9051.aByte1634;
	    class179_sub1_39_.aClass137_9051.anInterface15_1635
		= aClass137_9051.anInterface15_1635;
	} else if (Class125.method2142(i, anInt9080))
	    class179_sub1_39_.aClass137_9051 = aClass137_9051;
	else
	    class179_sub1_39_.aClass137_9051 = null;
	if (Class125.method2136(i, anInt9080)) {
	    if (class179_sub1_40_.aFloatArray9058 == null
		|| class179_sub1_40_.aFloatArray9058.length < anInt9065) {
		int i_53_ = anInt9057;
		class179_sub1_39_.aFloatArray9058
		    = class179_sub1_40_.aFloatArray9058 = new float[i_53_];
		class179_sub1_39_.aFloatArray9064
		    = class179_sub1_40_.aFloatArray9064 = new float[i_53_];
	    } else {
		class179_sub1_39_.aFloatArray9058
		    = class179_sub1_40_.aFloatArray9058;
		class179_sub1_39_.aFloatArray9064
		    = class179_sub1_40_.aFloatArray9064;
	    }
	    for (int i_54_ = 0; i_54_ < anInt9057; i_54_++) {
		class179_sub1_39_.aFloatArray9058[i_54_]
		    = aFloatArray9058[i_54_];
		class179_sub1_39_.aFloatArray9064[i_54_]
		    = aFloatArray9064[i_54_];
	    }
	} else {
	    class179_sub1_39_.aFloatArray9058 = aFloatArray9058;
	    class179_sub1_39_.aFloatArray9064 = aFloatArray9064;
	}
	if (Class125.method2201(i, anInt9080)) {
	    if (bool)
		class179_sub1_39_.aByte9037 |= 0x8;
	    class179_sub1_39_.aClass137_9078
		= class179_sub1_40_.aClass137_9078;
	    class179_sub1_39_.aClass137_9078.aByte1634
		= aClass137_9078.aByte1634;
	    class179_sub1_39_.aClass137_9078.anInterface15_1635
		= aClass137_9078.anInterface15_1635;
	} else if (Class125.method2205(i, anInt9080))
	    class179_sub1_39_.aClass137_9078 = aClass137_9078;
	else
	    class179_sub1_39_.aClass137_9078 = null;
	if (Class125.method2137(i, anInt9080)) {
	    if (class179_sub1_40_.aShortArray9091 == null
		|| class179_sub1_40_.aShortArray9091.length < anInt9065) {
		int i_55_ = anInt9065;
		class179_sub1_39_.aShortArray9091
		    = class179_sub1_40_.aShortArray9091 = new short[i_55_];
		class179_sub1_39_.aShortArray9070
		    = class179_sub1_40_.aShortArray9070 = new short[i_55_];
		class179_sub1_39_.aShortArray9071
		    = class179_sub1_40_.aShortArray9071 = new short[i_55_];
	    } else {
		class179_sub1_39_.aShortArray9091
		    = class179_sub1_40_.aShortArray9091;
		class179_sub1_39_.aShortArray9070
		    = class179_sub1_40_.aShortArray9070;
		class179_sub1_39_.aShortArray9071
		    = class179_sub1_40_.aShortArray9071;
	    }
	    for (int i_56_ = 0; i_56_ < anInt9065; i_56_++) {
		class179_sub1_39_.aShortArray9091[i_56_]
		    = aShortArray9091[i_56_];
		class179_sub1_39_.aShortArray9070[i_56_]
		    = aShortArray9070[i_56_];
		class179_sub1_39_.aShortArray9071[i_56_]
		    = aShortArray9071[i_56_];
	    }
	} else {
	    class179_sub1_39_.aShortArray9091 = aShortArray9091;
	    class179_sub1_39_.aShortArray9070 = aShortArray9070;
	    class179_sub1_39_.aShortArray9071 = aShortArray9071;
	}
	if (Class125.method2150(i, anInt9080)) {
	    if (bool)
		class179_sub1_39_.aByte9037 |= 0x10;
	    class179_sub1_39_.aClass139_9079
		= class179_sub1_40_.aClass139_9079;
	    class179_sub1_39_.aClass139_9079.anInterface16_1642
		= aClass139_9079.anInterface16_1642;
	} else if (Class125.method2155(i, anInt9080))
	    class179_sub1_39_.aClass139_9079 = aClass139_9079;
	else
	    class179_sub1_39_.aClass139_9079 = null;
	if (Class125.method2138(i, anInt9080)) {
	    if (class179_sub1_40_.aShortArray9039 == null
		|| class179_sub1_40_.aShortArray9039.length < anInt9065) {
		int i_57_ = anInt9065;
		class179_sub1_39_.aShortArray9039
		    = class179_sub1_40_.aShortArray9039 = new short[i_57_];
	    } else
		class179_sub1_39_.aShortArray9039
		    = class179_sub1_40_.aShortArray9039;
	    for (int i_58_ = 0; i_58_ < anInt9065; i_58_++)
		class179_sub1_39_.aShortArray9039[i_58_]
		    = aShortArray9039[i_58_];
	} else
	    class179_sub1_39_.aShortArray9039 = aShortArray9039;
	if (Class125.method2139(i, anInt9080)) {
	    if (class179_sub1_40_.aClass131Array9101 == null
		|| class179_sub1_40_.aClass131Array9101.length < anInt9074) {
		int i_59_ = anInt9074;
		class179_sub1_39_.aClass131Array9101
		    = class179_sub1_40_.aClass131Array9101
		    = new Class131[i_59_];
		for (int i_60_ = 0; i_60_ < anInt9074; i_60_++)
		    class179_sub1_39_.aClass131Array9101[i_60_]
			= aClass131Array9101[i_60_].method2280();
	    } else {
		class179_sub1_39_.aClass131Array9101
		    = class179_sub1_40_.aClass131Array9101;
		for (int i_61_ = 0; i_61_ < anInt9074; i_61_++)
		    class179_sub1_39_.aClass131Array9101[i_61_]
			.method2284(aClass131Array9101[i_61_]);
	    }
	} else
	    class179_sub1_39_.aClass131Array9101 = aClass131Array9101;
	class179_sub1_39_.aClass148Array9100 = aClass148Array9100;
	if (aBool9085) {
	    class179_sub1_39_.anInt9083 = anInt9083;
	    class179_sub1_39_.anInt9084 = anInt9084;
	    class179_sub1_39_.aShort9088 = aShort9088;
	    class179_sub1_39_.aShort9089 = aShort9089;
	    class179_sub1_39_.aShort9086 = aShort9086;
	    class179_sub1_39_.aShort9103 = aShort9103;
	    class179_sub1_39_.aShort9090 = aShort9090;
	    class179_sub1_39_.aShort9102 = aShort9102;
	    class179_sub1_39_.aBool9085 = true;
	} else
	    class179_sub1_39_.aBool9085 = false;
	if (aBool9092) {
	    class179_sub1_39_.aShort9093 = aShort9093;
	    class179_sub1_39_.aBool9092 = true;
	} else
	    class179_sub1_39_.aBool9092 = false;
	class179_sub1_39_.anIntArrayArray9055 = anIntArrayArray9055;
	class179_sub1_39_.anIntArrayArray9048 = anIntArrayArray9048;
	class179_sub1_39_.anIntArrayArray9042 = anIntArrayArray9042;
	class179_sub1_39_.aShortArray9096 = aShortArray9096;
	class179_sub1_39_.anIntArray9046 = anIntArray9046;
	class179_sub1_39_.aShortArray9056 = aShortArray9056;
	class179_sub1_39_.aShortArray9044 = aShortArray9044;
	class179_sub1_39_.anIntArray9094 = anIntArray9094;
	class179_sub1_39_.aClass184Array9097 = aClass184Array9097;
	class179_sub1_39_.aClass154Array9098 = aClass154Array9098;
	return class179_sub1_39_;
    }
    
    int method14555(int i, short i_62_, int i_63_, byte i_64_) {
	int i_65_ = Class642.anIntArray8324[method14566(i, i_63_)];
	if (i_62_ != -1) {
	    TextureMetrics class166
		= aClass182_Sub3_9041.aClass180_1944.method3116(i_62_ & 0xffff,
								-1431554601);
	    int i_66_ = class166.aByte1785 & 0xff;
	    if (i_66_ != 0) {
		int i_67_;
		if (i_63_ < 0)
		    i_67_ = 0;
		else if (i_63_ > 127)
		    i_67_ = 16777215;
		else
		    i_67_ = 131586 * i_63_;
		if (i_66_ == 256)
		    i_65_ = i_67_;
		else {
		    int i_68_ = i_66_;
		    int i_69_ = 256 - i_66_;
		    i_65_ = ((((i_67_ & 0xff00ff) * i_68_
			       + (i_65_ & 0xff00ff) * i_69_)
			      & ~0xff00ff)
			     + (((i_67_ & 0xff00) * i_68_
				 + (i_65_ & 0xff00) * i_69_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_70_ = class166.aByte1831 & 0xff;
	    if (i_70_ != 0) {
		i_70_ += 256;
		int i_71_ = ((i_65_ & 0xff0000) >> 16) * i_70_;
		if (i_71_ > 65535)
		    i_71_ = 65535;
		int i_72_ = ((i_65_ & 0xff00) >> 8) * i_70_;
		if (i_72_ > 65535)
		    i_72_ = 65535;
		int i_73_ = (i_65_ & 0xff) * i_70_;
		if (i_73_ > 65535)
		    i_73_ = 65535;
		i_65_ = (i_71_ << 8 & 0xff0000) + (i_72_ & 0xff00) + (i_73_
								      >> 8);
	    }
	}
	return i_65_ << 8 | 255 - (i_64_ & 0xff);
    }
    
    public int method3034() {
	return aShort9110;
    }
    
    boolean method14556(int i, int i_74_, int i_75_, int i_76_, int i_77_,
			int i_78_, int i_79_, int i_80_) {
	if (i_74_ < i_75_ && i_74_ < i_76_ && i_74_ < i_77_)
	    return false;
	if (i_74_ > i_75_ && i_74_ > i_76_ && i_74_ > i_77_)
	    return false;
	if (i < i_78_ && i < i_79_ && i < i_80_)
	    return false;
	if (i > i_78_ && i > i_79_ && i > i_80_)
	    return false;
	return true;
    }
    
    public void method3055(byte i, byte[] is) {
	if (is == null) {
	    for (int i_81_ = 0; i_81_ < anInt9065; i_81_++)
		aByteArray9068[i_81_] = i;
	} else {
	    for (int i_82_ = 0; i_82_ < anInt9065; i_82_++) {
		int i_83_ = 255 - ((255 - (is[i_82_] & 0xff))
				   * (255 - (i & 0xff)) / 255);
		aByteArray9068[i_82_] = (byte) i_83_;
	    }
	}
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    public void method2933(int i) {
	int i_84_ = Class436.anIntArray4831[i];
	int i_85_ = Class436.anIntArray4838[i];
	for (int i_86_ = 0; i_86_ < anInt9072; i_86_++) {
	    int i_87_ = ((anIntArray9069[i_86_] * i_84_
			  + anIntArray9052[i_86_] * i_85_)
			 >> 14);
	    anIntArray9069[i_86_] = (anIntArray9069[i_86_] * i_85_
				     - anIntArray9052[i_86_] * i_84_) >> 14;
	    anIntArray9052[i_86_] = i_87_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method2934(int i, int i_88_, int i_89_) {
	for (int i_90_ = 0; i_90_ < anInt9072; i_90_++) {
	    if (i != 0)
		anIntArray9052[i_90_] += i;
	    if (i_88_ != 0)
		anIntArray9069[i_90_] += i_88_;
	    if (i_89_ != 0)
		anIntArray9054[i_90_] += i_89_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method3074() {
	for (int i = 0; i < anInt9072; i++)
	    anIntArray9054[i] = -anIntArray9054[i];
	for (int i = 0; i < anInt9057; i++)
	    aShortArray9060[i] = (short) -aShortArray9060[i];
	for (int i = 0; i < anInt9065; i++) {
	    short i_91_ = aShortArray9091[i];
	    aShortArray9091[i] = aShortArray9071[i];
	    aShortArray9071[i] = i_91_;
	}
	if (aClass137_9051 == null && aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
	if (aClass137_9051 != null)
	    aClass137_9051.anInterface15_1635 = null;
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	if (aClass139_9079 != null)
	    aClass139_9079.anInterface16_1642 = null;
	aBool9085 = false;
    }
    
    public void method2974(int i, int i_92_, int i_93_, int i_94_) {
	for (int i_95_ = 0; i_95_ < anInt9065; i_95_++) {
	    int i_96_ = aShortArray9067[i_95_] & 0xffff;
	    int i_97_ = i_96_ >> 10 & 0x3f;
	    int i_98_ = i_96_ >> 7 & 0x7;
	    int i_99_ = i_96_ & 0x7f;
	    if (i != -1)
		i_97_ += (i - i_97_) * i_94_ >> 7;
	    if (i_92_ != -1)
		i_98_ += (i_92_ - i_98_) * i_94_ >> 7;
	    if (i_93_ != -1)
		i_99_ += (i_93_ - i_99_) * i_94_ >> 7;
	    aShortArray9067[i_95_]
		= (short) (i_97_ << 10 | i_98_ << 7 | i_99_);
	}
	if (aClass148Array9100 != null) {
	    for (int i_100_ = 0; i_100_ < anInt9074; i_100_++) {
		Class148 class148 = aClass148Array9100[i_100_];
		Class131 class131 = aClass131Array9101[i_100_];
		class131.anInt1582
		    = (class131.anInt1582 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9067[class148.anInt1694] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    boolean method14557(int i, int i_101_, int i_102_, int i_103_, int i_104_,
			int i_105_, int i_106_, int i_107_) {
	if (i_101_ < i_102_ && i_101_ < i_103_ && i_101_ < i_104_)
	    return false;
	if (i_101_ > i_102_ && i_101_ > i_103_ && i_101_ > i_104_)
	    return false;
	if (i < i_105_ && i < i_106_ && i < i_107_)
	    return false;
	if (i > i_105_ && i > i_106_ && i > i_107_)
	    return false;
	return true;
    }
    
    void method14558() {
	int i = 32767;
	int i_108_ = 32767;
	int i_109_ = 32767;
	int i_110_ = -32768;
	int i_111_ = -32768;
	int i_112_ = -32768;
	int i_113_ = 0;
	int i_114_ = 0;
	for (int i_115_ = 0; i_115_ < anInt9072; i_115_++) {
	    int i_116_ = anIntArray9052[i_115_];
	    int i_117_ = anIntArray9069[i_115_];
	    int i_118_ = anIntArray9054[i_115_];
	    if (i_116_ < i)
		i = i_116_;
	    if (i_116_ > i_110_)
		i_110_ = i_116_;
	    if (i_117_ < i_108_)
		i_108_ = i_117_;
	    if (i_117_ > i_111_)
		i_111_ = i_117_;
	    if (i_118_ < i_109_)
		i_109_ = i_118_;
	    if (i_118_ > i_112_)
		i_112_ = i_118_;
	    int i_119_ = i_116_ * i_116_ + i_118_ * i_118_;
	    if (i_119_ > i_113_)
		i_113_ = i_119_;
	    i_119_ = i_116_ * i_116_ + i_118_ * i_118_ + i_117_ * i_117_;
	    if (i_119_ > i_114_)
		i_114_ = i_119_;
	}
	aShort9088 = (short) i;
	aShort9089 = (short) i_110_;
	aShort9086 = (short) i_108_;
	aShort9103 = (short) i_111_;
	aShort9090 = (short) i_109_;
	aShort9102 = (short) i_112_;
	anInt9084 = (int) (Math.sqrt((double) i_113_) + 0.99);
	anInt9083 = (int) (Math.sqrt((double) i_114_) + 0.99);
	aBool9085 = true;
    }
    
    public void method3003() {
	if (!aBool9092) {
	    if (!aBool9085)
		method14558();
	    aShort9093 = aShort9086;
	    aBool9092 = true;
	}
    }
    
    void method14559(Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1) {
	if (aClass182_Sub3_9041.anIntArray9829.length < anInt9057) {
	    aClass182_Sub3_9041.anIntArray9829 = new int[anInt9057];
	    aClass182_Sub3_9041.anIntArray9830 = new int[anInt9057];
	}
	int[] is = aClass182_Sub3_9041.anIntArray9829;
	int[] is_120_ = aClass182_Sub3_9041.anIntArray9830;
	for (int i = 0; i < anInt9072; i++) {
	    int i_121_
		= (((anIntArray9052[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9697
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12109);
	    int i_122_
		= (((anIntArray9054[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9765
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12111);
	    int i_123_ = anIntArray9046[i];
	    int i_124_ = anIntArray9046[i + 1];
	    for (int i_125_ = i_123_;
		 i_125_ < i_124_ && aShortArray9096[i_125_] != 0; i_125_++) {
		int i_126_ = (aShortArray9096[i_125_] & 0xffff) - 1;
		is[i_126_] = i_121_;
		is_120_[i_126_] = i_122_;
	    }
	}
	for (int i = 0; i < anInt9111; i++) {
	    if (aByteArray9068 == null || aByteArray9068[i] <= 128) {
		int i_127_ = aShortArray9091[i] & 0xffff;
		int i_128_ = aShortArray9070[i] & 0xffff;
		int i_129_ = aShortArray9071[i] & 0xffff;
		int i_130_ = is[i_127_];
		int i_131_ = is[i_128_];
		int i_132_ = is[i_129_];
		int i_133_ = is_120_[i_127_];
		int i_134_ = is_120_[i_128_];
		int i_135_ = is_120_[i_129_];
		if (((i_130_ - i_131_) * (i_134_ - i_135_)
		     - (i_134_ - i_133_) * (i_132_ - i_131_))
		    > 0)
		    class525_sub16_sub17_sub1.method18765(i_133_, i_134_,
							  i_135_, i_130_,
							  i_131_, i_132_);
	    }
	}
    }
    
    public int method2957() {
	if (!aBool9085)
	    method14558();
	return anInt9083;
    }
    
    public int method3046() {
	return aShort9110;
    }
    
    public int method2959() {
	if (!aBool9085)
	    method14558();
	return aShort9089;
    }
    
    public int method3030() {
	if (!aBool9085)
	    method14558();
	return anInt9083;
    }
    
    public int method2961() {
	if (!aBool9085)
	    method14558();
	return aShort9103;
    }
    
    public void method2931(int i) {
	int i_136_ = Class436.anIntArray4831[i];
	int i_137_ = Class436.anIntArray4838[i];
	for (int i_138_ = 0; i_138_ < anInt9072; i_138_++) {
	    int i_139_ = ((anIntArray9054[i_138_] * i_136_
			   + anIntArray9052[i_138_] * i_137_)
			  >> 14);
	    anIntArray9054[i_138_] = (anIntArray9054[i_138_] * i_137_
				      - anIntArray9052[i_138_] * i_136_) >> 14;
	    anIntArray9052[i_138_] = i_139_;
	}
	for (int i_140_ = 0; i_140_ < anInt9057; i_140_++) {
	    int i_141_ = ((aShortArray9060[i_140_] * i_136_
			   + aShortArray9073[i_140_] * i_137_)
			  >> 14);
	    aShortArray9060[i_140_]
		= (short) ((aShortArray9060[i_140_] * i_137_
			    - aShortArray9073[i_140_] * i_136_)
			   >> 14);
	    aShortArray9073[i_140_] = (short) i_141_;
	}
	if (aClass137_9051 == null && aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
	if (aClass137_9051 != null)
	    aClass137_9051.anInterface15_1635 = null;
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public int method2963() {
	if (!aBool9085)
	    method14558();
	return aShort9102;
    }
    
    public int method2964() {
	if (!aBool9092)
	    method3003();
	return aShort9093;
    }
    
    public void method3019(Class179 class179, int i, int i_142_, int i_143_,
			   boolean bool) {
	Class179_Sub1 class179_sub1_144_ = (Class179_Sub1) class179;
	if (anInt9065 != 0 && class179_sub1_144_.anInt9065 != 0) {
	    int i_145_ = class179_sub1_144_.anInt9072;
	    int[] is = class179_sub1_144_.anIntArray9052;
	    int[] is_146_ = class179_sub1_144_.anIntArray9069;
	    int[] is_147_ = class179_sub1_144_.anIntArray9054;
	    short[] is_148_ = class179_sub1_144_.aShortArray9073;
	    short[] is_149_ = class179_sub1_144_.aShortArray9059;
	    short[] is_150_ = class179_sub1_144_.aShortArray9060;
	    byte[] is_151_ = class179_sub1_144_.aByteArray9061;
	    short[] is_152_;
	    short[] is_153_;
	    short[] is_154_;
	    byte[] is_155_;
	    if (aClass145_9063 != null) {
		is_152_ = aClass145_9063.aShortArray1672;
		is_153_ = aClass145_9063.aShortArray1671;
		is_154_ = aClass145_9063.aShortArray1669;
		is_155_ = aClass145_9063.aByteArray1670;
	    } else {
		is_152_ = null;
		is_153_ = null;
		is_154_ = null;
		is_155_ = null;
	    }
	    short[] is_156_;
	    short[] is_157_;
	    short[] is_158_;
	    byte[] is_159_;
	    if (class179_sub1_144_.aClass145_9063 != null) {
		is_156_ = class179_sub1_144_.aClass145_9063.aShortArray1672;
		is_157_ = class179_sub1_144_.aClass145_9063.aShortArray1671;
		is_158_ = class179_sub1_144_.aClass145_9063.aShortArray1669;
		is_159_ = class179_sub1_144_.aClass145_9063.aByteArray1670;
	    } else {
		is_156_ = null;
		is_157_ = null;
		is_158_ = null;
		is_159_ = null;
	    }
	    int[] is_160_ = class179_sub1_144_.anIntArray9046;
	    short[] is_161_ = class179_sub1_144_.aShortArray9096;
	    if (!class179_sub1_144_.aBool9085)
		class179_sub1_144_.method14558();
	    int i_162_ = class179_sub1_144_.aShort9086;
	    int i_163_ = class179_sub1_144_.aShort9103;
	    int i_164_ = class179_sub1_144_.aShort9088;
	    int i_165_ = class179_sub1_144_.aShort9089;
	    int i_166_ = class179_sub1_144_.aShort9090;
	    int i_167_ = class179_sub1_144_.aShort9102;
	    for (int i_168_ = 0; i_168_ < anInt9072; i_168_++) {
		int i_169_ = anIntArray9069[i_168_] - i_142_;
		if (i_169_ >= i_162_ && i_169_ <= i_163_) {
		    int i_170_ = anIntArray9052[i_168_] - i;
		    if (i_170_ >= i_164_ && i_170_ <= i_165_) {
			int i_171_ = anIntArray9054[i_168_] - i_143_;
			if (i_171_ >= i_166_ && i_171_ <= i_167_) {
			    int i_172_ = -1;
			    int i_173_ = anIntArray9046[i_168_];
			    int i_174_ = anIntArray9046[i_168_ + 1];
			    for (int i_175_ = i_173_;
				 (i_175_ < i_174_
				  && aShortArray9096[i_175_] != 0);
				 i_175_++) {
				i_172_
				    = (aShortArray9096[i_175_] & 0xffff) - 1;
				if (aByteArray9061[i_172_] != 0)
				    break;
			    }
			    if (i_172_ != -1) {
				for (int i_176_ = 0; i_176_ < i_145_;
				     i_176_++) {
				    if (i_170_ == is[i_176_]
					&& i_171_ == is_147_[i_176_]
					&& i_169_ == is_146_[i_176_]) {
					int i_177_ = -1;
					i_173_ = is_160_[i_176_];
					i_174_ = is_160_[i_176_ + 1];
					for (int i_178_ = i_173_;
					     (i_178_ < i_174_
					      && is_161_[i_178_] != 0);
					     i_178_++) {
					    i_177_ = (is_161_[i_178_]
						      & 0xffff) - 1;
					    if (is_151_[i_177_] != 0)
						break;
					}
					if (i_177_ != -1) {
					    if (is_152_ == null) {
						aClass145_9063
						    = new Class145();
						is_152_
						    = aClass145_9063
							  .aShortArray1672
						    = (Class457.method7467
						       (aShortArray9073,
							-1993390250));
						is_153_
						    = aClass145_9063
							  .aShortArray1671
						    = (Class457.method7467
						       (aShortArray9059,
							713759501));
						is_154_
						    = aClass145_9063
							  .aShortArray1669
						    = (Class457.method7467
						       (aShortArray9060,
							137439384));
						is_155_
						    = aClass145_9063
							  .aByteArray1670
						    = (Class509.method8501
						       (aByteArray9061,
							288795233));
					    }
					    if (is_156_ == null) {
						Class145 class145
						    = (class179_sub1_144_
							   .aClass145_9063
						       = new Class145());
						is_156_
						    = class145.aShortArray1672
						    = (Class457.method7467
						       (is_148_, 1467961941));
						is_157_
						    = class145.aShortArray1671
						    = (Class457.method7467
						       (is_149_, 317247709));
						is_158_
						    = class145.aShortArray1669
						    = (Class457.method7467
						       (is_150_, -873096897));
						is_159_
						    = class145.aByteArray1670
						    = (Class509.method8501
						       (is_151_, 1170223506));
					    }
					    short i_179_
						= aShortArray9073[i_172_];
					    short i_180_
						= aShortArray9059[i_172_];
					    short i_181_
						= aShortArray9060[i_172_];
					    byte i_182_
						= aByteArray9061[i_172_];
					    i_173_ = is_160_[i_176_];
					    i_174_ = is_160_[i_176_ + 1];
					    for (int i_183_ = i_173_;
						 i_183_ < i_174_; i_183_++) {
						int i_184_
						    = is_161_[i_183_] - 1;
						if (i_184_ == -1)
						    break;
						if (is_159_[i_184_] != 0) {
						    is_156_[i_184_] += i_179_;
						    is_157_[i_184_] += i_180_;
						    is_158_[i_184_] += i_181_;
						    is_159_[i_184_] += i_182_;
						}
					    }
					    i_179_ = is_148_[i_177_];
					    i_180_ = is_149_[i_177_];
					    i_181_ = is_150_[i_177_];
					    i_182_ = is_151_[i_177_];
					    i_173_ = anIntArray9046[i_168_];
					    i_174_
						= anIntArray9046[i_168_ + 1];
					    for (int i_185_ = i_173_;
						 (i_185_ < i_174_
						  && (aShortArray9096[i_185_]
						      != 0));
						 i_185_++) {
						int i_186_
						    = ((aShortArray9096[i_185_]
							& 0xffff)
						       - 1);
						if (is_155_[i_186_] != 0) {
						    is_152_[i_186_] += i_179_;
						    is_153_[i_186_] += i_180_;
						    is_154_[i_186_] += i_181_;
						    is_155_[i_186_] += i_182_;
						}
					    }
					    if (aClass137_9051 == null
						&& aClass137_9076 != null)
						aClass137_9076
						    .anInterface15_1635
						    = null;
					    if (aClass137_9051 != null)
						aClass137_9051
						    .anInterface15_1635
						    = null;
					    if ((class179_sub1_144_
						 .aClass137_9051) == null
						&& (class179_sub1_144_
						    .aClass137_9076) != null)
						class179_sub1_144_
						    .aClass137_9076
						    .anInterface15_1635
						    = null;
					    if ((class179_sub1_144_
						 .aClass137_9051)
						!= null)
						class179_sub1_144_
						    .aClass137_9051
						    .anInterface15_1635
						    = null;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method2966(int i) {
	aShort9110 = (short) i;
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    void method14560() {
	if (anInt9111 != 0) {
	    if (aByte9037 != 0)
		method14564(true);
	    method14564(false);
	    if (aClass139_9079 != null) {
		if (aClass139_9079.anInterface16_1642 == null)
		    method14563((aByte9037 & 0x10) != 0);
		if (aClass139_9079.anInterface16_1642 != null) {
		    aClass182_Sub3_9041.method15404(aClass137_9051 != null);
		    aClass182_Sub3_9041.method15384(aClass137_9075,
						    aClass137_9051,
						    aClass137_9076,
						    aClass137_9078);
		    int i = anIntArray9094.length - 1;
		    for (int i_187_ = 0; i_187_ < i; i_187_++) {
			int i_188_ = anIntArray9094[i_187_];
			int i_189_ = anIntArray9094[i_187_ + 1];
			int i_190_ = (aShortArray9039[i_188_] == -1 ? -1
				      : aShortArray9039[i_188_] & 0xffff);
			aClass182_Sub3_9041
			    .method15446(i_190_, aClass137_9051 != null);
			aClass182_Sub3_9041.method15427((aClass139_9079
							 .anInterface16_1642),
							4, i_188_ * 3,
							(i_189_ - i_188_) * 3);
		    }
		}
	    }
	    method14590();
	}
    }
    
    public int method3065() {
	return aShort9110;
    }
    
    public int method3026() {
	return aShort9047;
    }
    
    public int method3001() {
	if (!aBool9085)
	    method14558();
	return aShort9088;
    }
    
    static final int method14561(int i, int i_191_) {
	i_191_ = i_191_ * (i & 0x7f) >> 7;
	if (i_191_ < 2)
	    i_191_ = 2;
	else if (i_191_ > 126)
	    i_191_ = 126;
	return (i & 0xff80) + i_191_;
    }
    
    public void method2972(byte i, byte[] is) {
	if (is == null) {
	    for (int i_192_ = 0; i_192_ < anInt9065; i_192_++)
		aByteArray9068[i_192_] = i;
	} else {
	    for (int i_193_ = 0; i_193_ < anInt9065; i_193_++) {
		int i_194_ = 255 - ((255 - (is[i_193_] & 0xff))
				    * (255 - (i & 0xff)) / 255);
		aByteArray9068[i_193_] = (byte) i_194_;
	    }
	}
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    public void method2973(short i, short i_195_) {
	Textures class180 = aClass182_Sub3_9041.aClass180_1944;
	for (int i_196_ = 0; i_196_ < anInt9065; i_196_++) {
	    if (aShortArray9039[i_196_] == i)
		aShortArray9039[i_196_] = i_195_;
	}
	byte i_197_ = 0;
	byte i_198_ = 0;
	if (i != -1) {
	    TextureMetrics class166 = class180.method3116(i & 0xffff, -1431554601);
	    i_197_ = class166.aByte1785;
	    i_198_ = class166.aByte1831;
	}
	byte i_199_ = 0;
	byte i_200_ = 0;
	if (i_195_ != -1) {
	    TextureMetrics class166
		= class180.method3116(i_195_ & 0xffff, -1431554601);
	    i_199_ = class166.aByte1785;
	    i_200_ = class166.aByte1831;
	    if (class166.aByte1805 != 0 || class166.aByte1806 != 0)
		aBool9049 = true;
	}
	if (i_197_ != i_199_ | i_198_ != i_200_) {
	    if (aClass148Array9100 != null) {
		for (int i_201_ = 0; i_201_ < anInt9074; i_201_++) {
		    Class148 class148 = aClass148Array9100[i_201_];
		    Class131 class131 = aClass131Array9101[i_201_];
		    class131.anInt1582
			= (class131.anInt1582 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9067[class148.anInt1694] & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (aClass137_9076 != null)
		aClass137_9076.anInterface15_1635 = null;
	}
    }
    
    public Class179 method2926(byte i, int i_202_, boolean bool) {
	boolean bool_203_ = false;
	Class179_Sub1 class179_sub1_204_;
	Class179_Sub1 class179_sub1_205_;
	if (i > 0 && i <= 8) {
	    class179_sub1_205_
		= aClass182_Sub3_9041.aClass179_Sub1Array9781[i - 1];
	    class179_sub1_204_
		= aClass182_Sub3_9041.aClass179_Sub1Array9642[i - 1];
	    bool_203_ = true;
	} else
	    class179_sub1_204_ = class179_sub1_205_
		= new Class179_Sub1(aClass182_Sub3_9041);
	return method14554(class179_sub1_204_, class179_sub1_205_, i_202_,
			   bool_203_, bool);
    }
    
    public boolean method2924() {
	if (aShortArray9039 == null)
	    return true;
	for (int i = 0; i < aShortArray9039.length; i++) {
	    if (aShortArray9039[i] != -1) {
		TextureMetrics class166
		    = (aClass182_Sub3_9041.aClass180_1944.method3116
		       (aShortArray9039[i] & 0xffff, -1431554601));
		if (class166.aBool1801
		    && !aClass182_Sub3_9041.aClass150_9673
			    .method2427(Class593.aClass593_7831, class166, -1))
		    return false;
	    }
	}
	return true;
    }
    
    public void method2943(Class444 class444, int i, boolean bool) {
	if (aShortArray9056 != null) {
	    Class444 class444_206_ = class444;
	    if (bool) {
		class444_206_ = aClass182_Sub3_9041.aClass444_9730;
		class444_206_.method7163(class444);
	    }
	    float[] fs = new float[3];
	    for (int i_207_ = 0; i_207_ < anInt9072; i_207_++) {
		if ((i & aShortArray9056[i_207_]) != 0) {
		    class444_206_.method7168((float) anIntArray9052[i_207_],
					     (float) anIntArray9069[i_207_],
					     (float) anIntArray9054[i_207_],
					     fs);
		    anIntArray9052[i_207_] = (int) fs[0];
		    anIntArray9069[i_207_] = (int) fs[1];
		    anIntArray9054[i_207_] = (int) fs[2];
		}
	    }
	}
    }
    
    public boolean method2977() {
	return aBool9049;
    }
    
    void method2939() {
	/* empty */
    }
    
    void method2940() {
	/* empty */
    }
    
    public void method2937(int i, int i_208_, Class161 class161,
			   Class161 class161_209_, int i_210_, int i_211_,
			   int i_212_) {
	if (!aBool9085)
	    method14558();
	int i_213_ = i_210_ + aShort9088;
	int i_214_ = i_210_ + aShort9089;
	int i_215_ = i_212_ + aShort9090;
	int i_216_ = i_212_ + aShort9102;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_213_ >= 0
		&& ((i_214_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1759 * 363736815)
		&& i_215_ >= 0
		&& ((i_216_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1760 * -1152334393))) {
	    if (i == 4 || i == 5) {
		if (class161_209_ == null
		    || (i_213_ < 0
			|| ((i_214_ + class161_209_.anInt1761 * 435863595
			     >> class161_209_.anInt1763 * -2063427645)
			    >= class161_209_.anInt1759 * 363736815)
			|| i_215_ < 0
			|| ((i_216_ + class161_209_.anInt1761 * 435863595
			     >> class161_209_.anInt1763 * -2063427645)
			    >= class161_209_.anInt1760 * -1152334393)))
		    return;
	    } else {
		i_213_ >>= class161.anInt1763 * -2063427645;
		i_214_ = (i_214_ + (class161.anInt1761 * 435863595 - 1)
			  >> class161.anInt1763 * -2063427645);
		i_215_ >>= class161.anInt1763 * -2063427645;
		i_216_ = (i_216_ + (class161.anInt1761 * 435863595 - 1)
			  >> class161.anInt1763 * -2063427645);
		if (class161.method2577(i_213_, i_215_, (byte) 30) == i_211_
		    && class161.method2577(i_214_, i_215_, (byte) 28) == i_211_
		    && (class161.method2577(i_213_, i_216_, (byte) -24)
			== i_211_)
		    && (class161.method2577(i_214_, i_216_, (byte) -85)
			== i_211_))
		    return;
	    }
	    if (i == 1) {
		for (int i_217_ = 0; i_217_ < anInt9072; i_217_++)
		    anIntArray9069[i_217_]
			= (anIntArray9069[i_217_]
			   + class161.method2588((anIntArray9052[i_217_]
						  + i_210_),
						 (anIntArray9054[i_217_]
						  + i_212_),
						 1198083567)
			   - i_211_);
	    } else if (i == 2) {
		int i_218_ = aShort9086;
		if (i_218_ == 0)
		    return;
		for (int i_219_ = 0; i_219_ < anInt9072; i_219_++) {
		    int i_220_ = (anIntArray9069[i_219_] << 16) / i_218_;
		    if (i_220_ < i_208_)
			anIntArray9069[i_219_]
			    = (anIntArray9069[i_219_]
			       + (class161.method2588((anIntArray9052[i_219_]
						       + i_210_),
						      (anIntArray9054[i_219_]
						       + i_212_),
						      -1419669984)
				  - i_211_) * (i_208_ - i_220_) / i_208_);
		}
	    } else if (i == 3) {
		int i_221_ = (i_208_ & 0xff) * 16;
		int i_222_ = (i_208_ >> 8 & 0xff) * 16;
		int i_223_ = (i_208_ >> 16 & 0xff) << 6;
		int i_224_ = (i_208_ >> 24 & 0xff) << 6;
		if (i_210_ - (i_221_ >> 1) < 0
		    || (i_210_ + (i_221_ >> 1) + class161.anInt1761 * 435863595
			>= (class161.anInt1759 * 363736815
			    << class161.anInt1763 * -2063427645))
		    || i_212_ - (i_222_ >> 1) < 0
		    || (i_212_ + (i_222_ >> 1) + class161.anInt1761 * 435863595
			>= (class161.anInt1760 * -1152334393
			    << class161.anInt1763 * -2063427645)))
		    return;
		method2938(class161, i_210_, i_211_, i_212_, i_221_, i_222_,
			   i_223_, i_224_);
	    } else if (i == 4) {
		int i_225_ = aShort9103 - aShort9086;
		for (int i_226_ = 0; i_226_ < anInt9072; i_226_++)
		    anIntArray9069[i_226_]
			= (anIntArray9069[i_226_]
			   + (class161_209_.method2588((anIntArray9052[i_226_]
							+ i_210_),
						       (anIntArray9054[i_226_]
							+ i_212_),
						       -1020641607)
			      - i_211_)
			   + i_225_);
	    } else if (i == 5) {
		int i_227_ = aShort9103 - aShort9086;
		for (int i_228_ = 0; i_228_ < anInt9072; i_228_++) {
		    int i_229_ = anIntArray9052[i_228_] + i_210_;
		    int i_230_ = anIntArray9054[i_228_] + i_212_;
		    int i_231_
			= class161.method2588(i_229_, i_230_, -1407049042);
		    int i_232_
			= class161_209_.method2588(i_229_, i_230_, -980973555);
		    int i_233_ = i_231_ - i_232_ - i_208_;
		    anIntArray9069[i_228_]
			= ((anIntArray9069[i_228_] << 8) / i_227_ * i_233_
			   >> 8) - (i_211_ - i_231_);
		}
	    }
	    if (aClass137_9075 != null)
		aClass137_9075.anInterface15_1635 = null;
	    aBool9085 = false;
	}
    }
    
    void method2949(int i, int[] is, int i_234_, int i_235_, int i_236_,
		    boolean bool, int i_237_, int[] is_238_) {
	int i_239_ = is.length;
	if (i == 0) {
	    i_234_ <<= 4;
	    i_235_ <<= 4;
	    i_236_ <<= 4;
	    int i_240_ = 0;
	    anInt9108 = 0;
	    anInt9109 = 0;
	    anInt9050 = 0;
	    for (int i_241_ = 0; i_241_ < i_239_; i_241_++) {
		int i_242_ = is[i_241_];
		if (i_242_ < anIntArrayArray9055.length) {
		    int[] is_243_ = anIntArrayArray9055[i_242_];
		    for (int i_244_ = 0; i_244_ < is_243_.length; i_244_++) {
			int i_245_ = is_243_[i_244_];
			if (aShortArray9056 == null
			    || (i_237_ & aShortArray9056[i_245_]) != 0) {
			    anInt9108 += anIntArray9052[i_245_];
			    anInt9109 += anIntArray9069[i_245_];
			    anInt9050 += anIntArray9054[i_245_];
			    i_240_++;
			}
		    }
		}
	    }
	    if (i_240_ > 0) {
		anInt9108 = anInt9108 / i_240_ + i_234_;
		anInt9109 = anInt9109 / i_240_ + i_235_;
		anInt9050 = anInt9050 / i_240_ + i_236_;
		aBool9082 = true;
	    } else {
		anInt9108 = i_234_;
		anInt9109 = i_235_;
		anInt9050 = i_236_;
	    }
	} else if (i == 1) {
	    if (is_238_ != null) {
		int i_246_ = ((is_238_[0] * i_234_ + is_238_[1] * i_235_
			       + is_238_[2] * i_236_ + 8192)
			      >> 14);
		int i_247_ = ((is_238_[3] * i_234_ + is_238_[4] * i_235_
			       + is_238_[5] * i_236_ + 8192)
			      >> 14);
		int i_248_ = ((is_238_[6] * i_234_ + is_238_[7] * i_235_
			       + is_238_[8] * i_236_ + 8192)
			      >> 14);
		i_234_ = i_246_;
		i_235_ = i_247_;
		i_236_ = i_248_;
	    }
	    i_234_ <<= 4;
	    i_235_ <<= 4;
	    i_236_ <<= 4;
	    for (int i_249_ = 0; i_249_ < i_239_; i_249_++) {
		int i_250_ = is[i_249_];
		if (i_250_ < anIntArrayArray9055.length) {
		    int[] is_251_ = anIntArrayArray9055[i_250_];
		    for (int i_252_ = 0; i_252_ < is_251_.length; i_252_++) {
			int i_253_ = is_251_[i_252_];
			if (aShortArray9056 == null
			    || (i_237_ & aShortArray9056[i_253_]) != 0) {
			    anIntArray9052[i_253_] += i_234_;
			    anIntArray9069[i_253_] += i_235_;
			    anIntArray9054[i_253_] += i_236_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_238_ != null) {
		int i_254_ = is_238_[9] << 4;
		int i_255_ = is_238_[10] << 4;
		int i_256_ = is_238_[11] << 4;
		int i_257_ = is_238_[12] << 4;
		int i_258_ = is_238_[13] << 4;
		int i_259_ = is_238_[14] << 4;
		if (aBool9082) {
		    int i_260_
			= ((is_238_[0] * anInt9108 + is_238_[3] * anInt9109
			    + is_238_[6] * anInt9050 + 8192)
			   >> 14);
		    int i_261_
			= ((is_238_[1] * anInt9108 + is_238_[4] * anInt9109
			    + is_238_[7] * anInt9050 + 8192)
			   >> 14);
		    int i_262_
			= ((is_238_[2] * anInt9108 + is_238_[5] * anInt9109
			    + is_238_[8] * anInt9050 + 8192)
			   >> 14);
		    i_260_ += i_257_;
		    i_261_ += i_258_;
		    i_262_ += i_259_;
		    anInt9108 = i_260_;
		    anInt9109 = i_261_;
		    anInt9050 = i_262_;
		    aBool9082 = false;
		}
		int[] is_263_ = new int[9];
		int i_264_ = Class436.anIntArray4838[i_234_];
		int i_265_ = Class436.anIntArray4831[i_234_];
		int i_266_ = Class436.anIntArray4838[i_235_];
		int i_267_ = Class436.anIntArray4831[i_235_];
		int i_268_ = Class436.anIntArray4838[i_236_];
		int i_269_ = Class436.anIntArray4831[i_236_];
		int i_270_ = i_265_ * i_268_ + 8192 >> 14;
		int i_271_ = i_265_ * i_269_ + 8192 >> 14;
		is_263_[0] = i_266_ * i_268_ + i_267_ * i_271_ + 8192 >> 14;
		is_263_[1] = -i_266_ * i_269_ + i_267_ * i_270_ + 8192 >> 14;
		is_263_[2] = i_267_ * i_264_ + 8192 >> 14;
		is_263_[3] = i_264_ * i_269_ + 8192 >> 14;
		is_263_[4] = i_264_ * i_268_ + 8192 >> 14;
		is_263_[5] = -i_265_;
		is_263_[6] = -i_267_ * i_268_ + i_266_ * i_271_ + 8192 >> 14;
		is_263_[7] = i_267_ * i_269_ + i_266_ * i_270_ + 8192 >> 14;
		is_263_[8] = i_266_ * i_264_ + 8192 >> 14;
		int i_272_ = (is_263_[0] * -anInt9108 + is_263_[1] * -anInt9109
			      + is_263_[2] * -anInt9050 + 8192) >> 14;
		int i_273_ = (is_263_[3] * -anInt9108 + is_263_[4] * -anInt9109
			      + is_263_[5] * -anInt9050 + 8192) >> 14;
		int i_274_ = (is_263_[6] * -anInt9108 + is_263_[7] * -anInt9109
			      + is_263_[8] * -anInt9050 + 8192) >> 14;
		int i_275_ = i_272_ + anInt9108;
		int i_276_ = i_273_ + anInt9109;
		int i_277_ = i_274_ + anInt9050;
		int[] is_278_ = new int[9];
		for (int i_279_ = 0; i_279_ < 3; i_279_++) {
		    for (int i_280_ = 0; i_280_ < 3; i_280_++) {
			int i_281_ = 0;
			for (int i_282_ = 0; i_282_ < 3; i_282_++)
			    i_281_ += (is_263_[i_279_ * 3 + i_282_]
				       * is_238_[i_280_ * 3 + i_282_]);
			is_278_[i_279_ * 3 + i_280_] = i_281_ + 8192 >> 14;
		    }
		}
		int i_283_ = ((is_263_[0] * i_257_ + is_263_[1] * i_258_
			       + is_263_[2] * i_259_ + 8192)
			      >> 14);
		int i_284_ = ((is_263_[3] * i_257_ + is_263_[4] * i_258_
			       + is_263_[5] * i_259_ + 8192)
			      >> 14);
		int i_285_ = ((is_263_[6] * i_257_ + is_263_[7] * i_258_
			       + is_263_[8] * i_259_ + 8192)
			      >> 14);
		i_283_ += i_275_;
		i_284_ += i_276_;
		i_285_ += i_277_;
		int[] is_286_ = new int[9];
		for (int i_287_ = 0; i_287_ < 3; i_287_++) {
		    for (int i_288_ = 0; i_288_ < 3; i_288_++) {
			int i_289_ = 0;
			for (int i_290_ = 0; i_290_ < 3; i_290_++)
			    i_289_ += (is_238_[i_287_ * 3 + i_290_]
				       * is_278_[i_288_ + i_290_ * 3]);
			is_286_[i_287_ * 3 + i_288_] = i_289_ + 8192 >> 14;
		    }
		}
		int i_291_ = ((is_238_[0] * i_283_ + is_238_[1] * i_284_
			       + is_238_[2] * i_285_ + 8192)
			      >> 14);
		int i_292_ = ((is_238_[3] * i_283_ + is_238_[4] * i_284_
			       + is_238_[5] * i_285_ + 8192)
			      >> 14);
		int i_293_ = ((is_238_[6] * i_283_ + is_238_[7] * i_284_
			       + is_238_[8] * i_285_ + 8192)
			      >> 14);
		i_291_ += i_254_;
		i_292_ += i_255_;
		i_293_ += i_256_;
		for (int i_294_ = 0; i_294_ < i_239_; i_294_++) {
		    int i_295_ = is[i_294_];
		    if (i_295_ < anIntArrayArray9055.length) {
			int[] is_296_ = anIntArrayArray9055[i_295_];
			for (int i_297_ = 0; i_297_ < is_296_.length;
			     i_297_++) {
			    int i_298_ = is_296_[i_297_];
			    if (aShortArray9056 == null
				|| (i_237_ & aShortArray9056[i_298_]) != 0) {
				int i_299_
				    = ((is_286_[0] * anIntArray9052[i_298_]
					+ is_286_[1] * anIntArray9069[i_298_]
					+ is_286_[2] * anIntArray9054[i_298_]
					+ 8192)
				       >> 14);
				int i_300_
				    = ((is_286_[3] * anIntArray9052[i_298_]
					+ is_286_[4] * anIntArray9069[i_298_]
					+ is_286_[5] * anIntArray9054[i_298_]
					+ 8192)
				       >> 14);
				int i_301_
				    = ((is_286_[6] * anIntArray9052[i_298_]
					+ is_286_[7] * anIntArray9069[i_298_]
					+ is_286_[8] * anIntArray9054[i_298_]
					+ 8192)
				       >> 14);
				i_299_ += i_291_;
				i_300_ += i_292_;
				i_301_ += i_293_;
				anIntArray9052[i_298_] = i_299_;
				anIntArray9069[i_298_] = i_300_;
				anIntArray9054[i_298_] = i_301_;
			    }
			}
		    }
		}
	    } else {
		for (int i_302_ = 0; i_302_ < i_239_; i_302_++) {
		    int i_303_ = is[i_302_];
		    if (i_303_ < anIntArrayArray9055.length) {
			int[] is_304_ = anIntArrayArray9055[i_303_];
			for (int i_305_ = 0; i_305_ < is_304_.length;
			     i_305_++) {
			    int i_306_ = is_304_[i_305_];
			    if (aShortArray9056 == null
				|| (i_237_ & aShortArray9056[i_306_]) != 0) {
				anIntArray9052[i_306_] -= anInt9108;
				anIntArray9069[i_306_] -= anInt9109;
				anIntArray9054[i_306_] -= anInt9050;
				if (i_236_ != 0) {
				    int i_307_
					= Class436.anIntArray4831[i_236_];
				    int i_308_
					= Class436.anIntArray4838[i_236_];
				    int i_309_
					= ((anIntArray9069[i_306_] * i_307_
					    + anIntArray9052[i_306_] * i_308_
					    + 16383)
					   >> 14);
				    anIntArray9069[i_306_]
					= (anIntArray9069[i_306_] * i_308_
					   - anIntArray9052[i_306_] * i_307_
					   + 16383) >> 14;
				    anIntArray9052[i_306_] = i_309_;
				}
				if (i_234_ != 0) {
				    int i_310_
					= Class436.anIntArray4831[i_234_];
				    int i_311_
					= Class436.anIntArray4838[i_234_];
				    int i_312_
					= ((anIntArray9069[i_306_] * i_311_
					    - anIntArray9054[i_306_] * i_310_
					    + 16383)
					   >> 14);
				    anIntArray9054[i_306_]
					= (anIntArray9069[i_306_] * i_310_
					   + anIntArray9054[i_306_] * i_311_
					   + 16383) >> 14;
				    anIntArray9069[i_306_] = i_312_;
				}
				if (i_235_ != 0) {
				    int i_313_
					= Class436.anIntArray4831[i_235_];
				    int i_314_
					= Class436.anIntArray4838[i_235_];
				    int i_315_
					= ((anIntArray9054[i_306_] * i_313_
					    + anIntArray9052[i_306_] * i_314_
					    + 16383)
					   >> 14);
				    anIntArray9054[i_306_]
					= (anIntArray9054[i_306_] * i_314_
					   - anIntArray9052[i_306_] * i_313_
					   + 16383) >> 14;
				    anIntArray9052[i_306_] = i_315_;
				}
				anIntArray9052[i_306_] += anInt9108;
				anIntArray9069[i_306_] += anInt9109;
				anIntArray9054[i_306_] += anInt9050;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_316_ = 0; i_316_ < i_239_; i_316_++) {
			int i_317_ = is[i_316_];
			if (i_317_ < anIntArrayArray9055.length) {
			    int[] is_318_ = anIntArrayArray9055[i_317_];
			    for (int i_319_ = 0; i_319_ < is_318_.length;
				 i_319_++) {
				int i_320_ = is_318_[i_319_];
				if (aShortArray9056 == null
				    || ((i_237_ & aShortArray9056[i_320_])
					!= 0)) {
				    int i_321_ = anIntArray9046[i_320_];
				    int i_322_ = anIntArray9046[i_320_ + 1];
				    for (int i_323_ = i_321_;
					 (i_323_ < i_322_
					  && aShortArray9096[i_323_] != 0);
					 i_323_++) {
					int i_324_ = ((aShortArray9096[i_323_]
						       & 0xffff)
						      - 1);
					if (i_236_ != 0) {
					    int i_325_
						= (Class436.anIntArray4831
						   [i_236_]);
					    int i_326_
						= (Class436.anIntArray4838
						   [i_236_]);
					    int i_327_
						= (((aShortArray9059[i_324_]
						     * i_325_)
						    + (aShortArray9073[i_324_]
						       * i_326_)
						    + 16383)
						   >> 14);
					    aShortArray9059[i_324_]
						= (short) (((aShortArray9059
							     [i_324_]) * i_326_
							    - ((aShortArray9073
								[i_324_])
							       * i_325_)
							    + 16383)
							   >> 14);
					    aShortArray9073[i_324_]
						= (short) i_327_;
					}
					if (i_234_ != 0) {
					    int i_328_
						= (Class436.anIntArray4831
						   [i_234_]);
					    int i_329_
						= (Class436.anIntArray4838
						   [i_234_]);
					    int i_330_
						= (((aShortArray9059[i_324_]
						     * i_329_)
						    - (aShortArray9060[i_324_]
						       * i_328_)
						    + 16383)
						   >> 14);
					    aShortArray9060[i_324_]
						= (short) (((aShortArray9059
							     [i_324_]) * i_328_
							    + ((aShortArray9060
								[i_324_])
							       * i_329_)
							    + 16383)
							   >> 14);
					    aShortArray9059[i_324_]
						= (short) i_330_;
					}
					if (i_235_ != 0) {
					    int i_331_
						= (Class436.anIntArray4831
						   [i_235_]);
					    int i_332_
						= (Class436.anIntArray4838
						   [i_235_]);
					    int i_333_
						= (((aShortArray9060[i_324_]
						     * i_331_)
						    + (aShortArray9073[i_324_]
						       * i_332_)
						    + 16383)
						   >> 14);
					    aShortArray9060[i_324_]
						= (short) (((aShortArray9060
							     [i_324_]) * i_332_
							    - ((aShortArray9073
								[i_324_])
							       * i_331_)
							    + 16383)
							   >> 14);
					    aShortArray9073[i_324_]
						= (short) i_333_;
					}
				    }
				}
			    }
			}
		    }
		    if (aClass137_9051 == null && aClass137_9076 != null)
			aClass137_9076.anInterface15_1635 = null;
		    if (aClass137_9051 != null)
			aClass137_9051.anInterface15_1635 = null;
		}
	    }
	} else if (i == 3) {
	    if (is_238_ != null) {
		int i_334_ = is_238_[9] << 4;
		int i_335_ = is_238_[10] << 4;
		int i_336_ = is_238_[11] << 4;
		int i_337_ = is_238_[12] << 4;
		int i_338_ = is_238_[13] << 4;
		int i_339_ = is_238_[14] << 4;
		if (aBool9082) {
		    int i_340_
			= ((is_238_[0] * anInt9108 + is_238_[3] * anInt9109
			    + is_238_[6] * anInt9050 + 8192)
			   >> 14);
		    int i_341_
			= ((is_238_[1] * anInt9108 + is_238_[4] * anInt9109
			    + is_238_[7] * anInt9050 + 8192)
			   >> 14);
		    int i_342_
			= ((is_238_[2] * anInt9108 + is_238_[5] * anInt9109
			    + is_238_[8] * anInt9050 + 8192)
			   >> 14);
		    i_340_ += i_337_;
		    i_341_ += i_338_;
		    i_342_ += i_339_;
		    anInt9108 = i_340_;
		    anInt9109 = i_341_;
		    anInt9050 = i_342_;
		    aBool9082 = false;
		}
		int i_343_ = i_234_ << 15 >> 7;
		int i_344_ = i_235_ << 15 >> 7;
		int i_345_ = i_236_ << 15 >> 7;
		int i_346_ = i_343_ * -anInt9108 + 8192 >> 14;
		int i_347_ = i_344_ * -anInt9109 + 8192 >> 14;
		int i_348_ = i_345_ * -anInt9050 + 8192 >> 14;
		int i_349_ = i_346_ + anInt9108;
		int i_350_ = i_347_ + anInt9109;
		int i_351_ = i_348_ + anInt9050;
		int[] is_352_ = new int[9];
		is_352_[0] = i_343_ * is_238_[0] + 8192 >> 14;
		is_352_[1] = i_343_ * is_238_[3] + 8192 >> 14;
		is_352_[2] = i_343_ * is_238_[6] + 8192 >> 14;
		is_352_[3] = i_344_ * is_238_[1] + 8192 >> 14;
		is_352_[4] = i_344_ * is_238_[4] + 8192 >> 14;
		is_352_[5] = i_344_ * is_238_[7] + 8192 >> 14;
		is_352_[6] = i_345_ * is_238_[2] + 8192 >> 14;
		is_352_[7] = i_345_ * is_238_[5] + 8192 >> 14;
		is_352_[8] = i_345_ * is_238_[8] + 8192 >> 14;
		int i_353_ = i_343_ * i_337_ + 8192 >> 14;
		int i_354_ = i_344_ * i_338_ + 8192 >> 14;
		int i_355_ = i_345_ * i_339_ + 8192 >> 14;
		i_353_ += i_349_;
		i_354_ += i_350_;
		i_355_ += i_351_;
		int[] is_356_ = new int[9];
		for (int i_357_ = 0; i_357_ < 3; i_357_++) {
		    for (int i_358_ = 0; i_358_ < 3; i_358_++) {
			int i_359_ = 0;
			for (int i_360_ = 0; i_360_ < 3; i_360_++)
			    i_359_ += (is_238_[i_357_ * 3 + i_360_]
				       * is_352_[i_358_ + i_360_ * 3]);
			is_356_[i_357_ * 3 + i_358_] = i_359_ + 8192 >> 14;
		    }
		}
		int i_361_ = ((is_238_[0] * i_353_ + is_238_[1] * i_354_
			       + is_238_[2] * i_355_ + 8192)
			      >> 14);
		int i_362_ = ((is_238_[3] * i_353_ + is_238_[4] * i_354_
			       + is_238_[5] * i_355_ + 8192)
			      >> 14);
		int i_363_ = ((is_238_[6] * i_353_ + is_238_[7] * i_354_
			       + is_238_[8] * i_355_ + 8192)
			      >> 14);
		i_361_ += i_334_;
		i_362_ += i_335_;
		i_363_ += i_336_;
		for (int i_364_ = 0; i_364_ < i_239_; i_364_++) {
		    int i_365_ = is[i_364_];
		    if (i_365_ < anIntArrayArray9055.length) {
			int[] is_366_ = anIntArrayArray9055[i_365_];
			for (int i_367_ = 0; i_367_ < is_366_.length;
			     i_367_++) {
			    int i_368_ = is_366_[i_367_];
			    if (aShortArray9056 == null
				|| (i_237_ & aShortArray9056[i_368_]) != 0) {
				int i_369_
				    = ((is_356_[0] * anIntArray9052[i_368_]
					+ is_356_[1] * anIntArray9069[i_368_]
					+ is_356_[2] * anIntArray9054[i_368_]
					+ 8192)
				       >> 14);
				int i_370_
				    = ((is_356_[3] * anIntArray9052[i_368_]
					+ is_356_[4] * anIntArray9069[i_368_]
					+ is_356_[5] * anIntArray9054[i_368_]
					+ 8192)
				       >> 14);
				int i_371_
				    = ((is_356_[6] * anIntArray9052[i_368_]
					+ is_356_[7] * anIntArray9069[i_368_]
					+ is_356_[8] * anIntArray9054[i_368_]
					+ 8192)
				       >> 14);
				i_369_ += i_361_;
				i_370_ += i_362_;
				i_371_ += i_363_;
				anIntArray9052[i_368_] = i_369_;
				anIntArray9069[i_368_] = i_370_;
				anIntArray9054[i_368_] = i_371_;
			    }
			}
		    }
		}
	    } else {
		for (int i_372_ = 0; i_372_ < i_239_; i_372_++) {
		    int i_373_ = is[i_372_];
		    if (i_373_ < anIntArrayArray9055.length) {
			int[] is_374_ = anIntArrayArray9055[i_373_];
			for (int i_375_ = 0; i_375_ < is_374_.length;
			     i_375_++) {
			    int i_376_ = is_374_[i_375_];
			    if (aShortArray9056 == null
				|| (i_237_ & aShortArray9056[i_376_]) != 0) {
				anIntArray9052[i_376_] -= anInt9108;
				anIntArray9069[i_376_] -= anInt9109;
				anIntArray9054[i_376_] -= anInt9050;
				anIntArray9052[i_376_]
				    = anIntArray9052[i_376_] * i_234_ >> 7;
				anIntArray9069[i_376_]
				    = anIntArray9069[i_376_] * i_235_ >> 7;
				anIntArray9054[i_376_]
				    = anIntArray9054[i_376_] * i_236_ >> 7;
				anIntArray9052[i_376_] += anInt9108;
				anIntArray9069[i_376_] += anInt9109;
				anIntArray9054[i_376_] += anInt9050;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9048 != null) {
		for (int i_377_ = 0; i_377_ < i_239_; i_377_++) {
		    int i_378_ = is[i_377_];
		    if (i_378_ < anIntArrayArray9048.length) {
			int[] is_379_ = anIntArrayArray9048[i_378_];
			for (int i_380_ = 0; i_380_ < is_379_.length;
			     i_380_++) {
			    int i_381_ = is_379_[i_380_];
			    if (aShortArray9044 == null
				|| (i_237_ & aShortArray9044[i_381_]) != 0) {
				int i_382_ = ((aByteArray9068[i_381_] & 0xff)
					      + i_234_ * 8);
				if (i_382_ < 0)
				    i_382_ = 0;
				else if (i_382_ > 255)
				    i_382_ = 255;
				aByteArray9068[i_381_] = (byte) i_382_;
				if (aClass137_9076 != null)
				    aClass137_9076.anInterface15_1635 = null;
			    }
			}
		    }
		}
		if (aClass148Array9100 != null) {
		    for (int i_383_ = 0; i_383_ < anInt9074; i_383_++) {
			Class148 class148 = aClass148Array9100[i_383_];
			Class131 class131 = aClass131Array9101[i_383_];
			class131.anInt1582
			    = (class131.anInt1582 & 0xffffff
			       | 255 - (aByteArray9068[class148.anInt1694]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9048 != null) {
		for (int i_384_ = 0; i_384_ < i_239_; i_384_++) {
		    int i_385_ = is[i_384_];
		    if (i_385_ < anIntArrayArray9048.length) {
			int[] is_386_ = anIntArrayArray9048[i_385_];
			for (int i_387_ = 0; i_387_ < is_386_.length;
			     i_387_++) {
			    int i_388_ = is_386_[i_387_];
			    if (aShortArray9044 == null
				|| (i_237_ & aShortArray9044[i_388_]) != 0) {
				int i_389_ = aShortArray9067[i_388_] & 0xffff;
				int i_390_ = i_389_ >> 10 & 0x3f;
				int i_391_ = i_389_ >> 7 & 0x7;
				int i_392_ = i_389_ & 0x7f;
				i_390_ = i_390_ + i_234_ & 0x3f;
				i_391_ += i_235_ / 4;
				if (i_391_ < 0)
				    i_391_ = 0;
				else if (i_391_ > 7)
				    i_391_ = 7;
				i_392_ += i_236_;
				if (i_392_ < 0)
				    i_392_ = 0;
				else if (i_392_ > 127)
				    i_392_ = 127;
				aShortArray9067[i_388_]
				    = (short) (i_390_ << 10 | i_391_ << 7
					       | i_392_);
				if (aClass137_9076 != null)
				    aClass137_9076.anInterface15_1635 = null;
			    }
			}
		    }
		}
		if (aClass148Array9100 != null) {
		    for (int i_393_ = 0; i_393_ < anInt9074; i_393_++) {
			Class148 class148 = aClass148Array9100[i_393_];
			Class131 class131 = aClass131Array9101[i_393_];
			class131.anInt1582
			    = (class131.anInt1582 & ~0xffffff
			       | (Class642.anIntArray8324
				  [(aShortArray9067[class148.anInt1694]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9042 != null) {
		for (int i_394_ = 0; i_394_ < i_239_; i_394_++) {
		    int i_395_ = is[i_394_];
		    if (i_395_ < anIntArrayArray9042.length) {
			int[] is_396_ = anIntArrayArray9042[i_395_];
			for (int i_397_ = 0; i_397_ < is_396_.length;
			     i_397_++) {
			    Class131 class131
				= aClass131Array9101[is_396_[i_397_]];
			    class131.anInt1583 += i_234_;
			    class131.anInt1585 += i_235_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9042 != null) {
		for (int i_398_ = 0; i_398_ < i_239_; i_398_++) {
		    int i_399_ = is[i_398_];
		    if (i_399_ < anIntArrayArray9042.length) {
			int[] is_400_ = anIntArrayArray9042[i_399_];
			for (int i_401_ = 0; i_401_ < is_400_.length;
			     i_401_++) {
			    Class131 class131
				= aClass131Array9101[is_400_[i_401_]];
			    class131.anInt1581
				= class131.anInt1581 * i_234_ >> 7;
			    class131.anInt1584
				= class131.anInt1584 * i_235_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9042 != null) {
		for (int i_402_ = 0; i_402_ < i_239_; i_402_++) {
		    int i_403_ = is[i_402_];
		    if (i_403_ < anIntArrayArray9042.length) {
			int[] is_404_ = anIntArrayArray9042[i_403_];
			for (int i_405_ = 0; i_405_ < is_404_.length;
			     i_405_++) {
			    Class131 class131
				= aClass131Array9101[is_404_[i_405_]];
			    class131.anInt1586
				= class131.anInt1586 + i_234_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method2950(int i, int i_406_, int i_407_, int i_408_) {
	if (i == 0) {
	    int i_409_ = 0;
	    anInt9108 = 0;
	    anInt9109 = 0;
	    anInt9050 = 0;
	    for (int i_410_ = 0; i_410_ < anInt9072; i_410_++) {
		anInt9108 += anIntArray9052[i_410_];
		anInt9109 += anIntArray9069[i_410_];
		anInt9050 += anIntArray9054[i_410_];
		i_409_++;
	    }
	    if (i_409_ > 0) {
		anInt9108 = anInt9108 / i_409_ + i_406_;
		anInt9109 = anInt9109 / i_409_ + i_407_;
		anInt9050 = anInt9050 / i_409_ + i_408_;
	    } else {
		anInt9108 = i_406_;
		anInt9109 = i_407_;
		anInt9050 = i_408_;
	    }
	} else if (i == 1) {
	    for (int i_411_ = 0; i_411_ < anInt9072; i_411_++) {
		anIntArray9052[i_411_] += i_406_;
		anIntArray9069[i_411_] += i_407_;
		anIntArray9054[i_411_] += i_408_;
	    }
	} else if (i == 2) {
	    for (int i_412_ = 0; i_412_ < anInt9072; i_412_++) {
		anIntArray9052[i_412_] -= anInt9108;
		anIntArray9069[i_412_] -= anInt9109;
		anIntArray9054[i_412_] -= anInt9050;
		if (i_408_ != 0) {
		    int i_413_ = Class436.anIntArray4831[i_408_];
		    int i_414_ = Class436.anIntArray4838[i_408_];
		    int i_415_ = ((anIntArray9069[i_412_] * i_413_
				   + anIntArray9052[i_412_] * i_414_ + 16383)
				  >> 14);
		    anIntArray9069[i_412_]
			= (anIntArray9069[i_412_] * i_414_
			   - anIntArray9052[i_412_] * i_413_ + 16383) >> 14;
		    anIntArray9052[i_412_] = i_415_;
		}
		if (i_406_ != 0) {
		    int i_416_ = Class436.anIntArray4831[i_406_];
		    int i_417_ = Class436.anIntArray4838[i_406_];
		    int i_418_ = ((anIntArray9069[i_412_] * i_417_
				   - anIntArray9054[i_412_] * i_416_ + 16383)
				  >> 14);
		    anIntArray9054[i_412_]
			= (anIntArray9069[i_412_] * i_416_
			   + anIntArray9054[i_412_] * i_417_ + 16383) >> 14;
		    anIntArray9069[i_412_] = i_418_;
		}
		if (i_407_ != 0) {
		    int i_419_ = Class436.anIntArray4831[i_407_];
		    int i_420_ = Class436.anIntArray4838[i_407_];
		    int i_421_ = ((anIntArray9054[i_412_] * i_419_
				   + anIntArray9052[i_412_] * i_420_ + 16383)
				  >> 14);
		    anIntArray9054[i_412_]
			= (anIntArray9054[i_412_] * i_420_
			   - anIntArray9052[i_412_] * i_419_ + 16383) >> 14;
		    anIntArray9052[i_412_] = i_421_;
		}
		anIntArray9052[i_412_] += anInt9108;
		anIntArray9069[i_412_] += anInt9109;
		anIntArray9054[i_412_] += anInt9050;
	    }
	} else if (i == 3) {
	    for (int i_422_ = 0; i_422_ < anInt9072; i_422_++) {
		anIntArray9052[i_422_] -= anInt9108;
		anIntArray9069[i_422_] -= anInt9109;
		anIntArray9054[i_422_] -= anInt9050;
		anIntArray9052[i_422_] = anIntArray9052[i_422_] * i_406_ / 128;
		anIntArray9069[i_422_] = anIntArray9069[i_422_] * i_407_ / 128;
		anIntArray9054[i_422_] = anIntArray9054[i_422_] * i_408_ / 128;
		anIntArray9052[i_422_] += anInt9108;
		anIntArray9069[i_422_] += anInt9109;
		anIntArray9054[i_422_] += anInt9050;
	    }
	} else if (i == 5) {
	    for (int i_423_ = 0; i_423_ < anInt9065; i_423_++) {
		int i_424_ = (aByteArray9068[i_423_] & 0xff) + i_406_ * 8;
		if (i_424_ < 0)
		    i_424_ = 0;
		else if (i_424_ > 255)
		    i_424_ = 255;
		aByteArray9068[i_423_] = (byte) i_424_;
	    }
	    if (aClass137_9076 != null)
		aClass137_9076.anInterface15_1635 = null;
	    if (aClass148Array9100 != null) {
		for (int i_425_ = 0; i_425_ < anInt9074; i_425_++) {
		    Class148 class148 = aClass148Array9100[i_425_];
		    Class131 class131 = aClass131Array9101[i_425_];
		    class131.anInt1582
			= (class131.anInt1582 & 0xffffff
			   | (255 - (aByteArray9068[class148.anInt1694] & 0xff)
			      << 24));
		}
	    }
	} else if (i == 7) {
	    for (int i_426_ = 0; i_426_ < anInt9065; i_426_++) {
		int i_427_ = aShortArray9067[i_426_] & 0xffff;
		int i_428_ = i_427_ >> 10 & 0x3f;
		int i_429_ = i_427_ >> 7 & 0x7;
		int i_430_ = i_427_ & 0x7f;
		i_428_ = i_428_ + i_406_ & 0x3f;
		i_429_ += i_407_ / 4;
		if (i_429_ < 0)
		    i_429_ = 0;
		else if (i_429_ > 7)
		    i_429_ = 7;
		i_430_ += i_408_;
		if (i_430_ < 0)
		    i_430_ = 0;
		else if (i_430_ > 127)
		    i_430_ = 127;
		aShortArray9067[i_426_]
		    = (short) (i_428_ << 10 | i_429_ << 7 | i_430_);
	    }
	    if (aClass137_9076 != null)
		aClass137_9076.anInterface15_1635 = null;
	    if (aClass148Array9100 != null) {
		for (int i_431_ = 0; i_431_ < anInt9074; i_431_++) {
		    Class148 class148 = aClass148Array9100[i_431_];
		    Class131 class131 = aClass131Array9101[i_431_];
		    class131.anInt1582
			= (class131.anInt1582 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9067[class148.anInt1694] & 0xffff])
			      & 0xffffff));
		}
	    }
	} else if (i == 8) {
	    for (int i_432_ = 0; i_432_ < anInt9074; i_432_++) {
		Class131 class131 = aClass131Array9101[i_432_];
		class131.anInt1583 += i_406_;
		class131.anInt1585 += i_407_;
	    }
	} else if (i == 10) {
	    for (int i_433_ = 0; i_433_ < anInt9074; i_433_++) {
		Class131 class131 = aClass131Array9101[i_433_];
		class131.anInt1581 = class131.anInt1581 * i_406_ >> 7;
		class131.anInt1584 = class131.anInt1584 * i_407_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_434_ = 0; i_434_ < anInt9074; i_434_++) {
		Class131 class131 = aClass131Array9101[i_434_];
		class131.anInt1586 = class131.anInt1586 + i_406_ & 0x3fff;
	    }
	}
    }
    
    public Class179 method2984(byte i, int i_435_, boolean bool) {
	boolean bool_436_ = false;
	Class179_Sub1 class179_sub1_437_;
	Class179_Sub1 class179_sub1_438_;
	if (i > 0 && i <= 8) {
	    class179_sub1_438_
		= aClass182_Sub3_9041.aClass179_Sub1Array9781[i - 1];
	    class179_sub1_437_
		= aClass182_Sub3_9041.aClass179_Sub1Array9642[i - 1];
	    bool_436_ = true;
	} else
	    class179_sub1_437_ = class179_sub1_438_
		= new Class179_Sub1(aClass182_Sub3_9041);
	return method14554(class179_sub1_437_, class179_sub1_438_, i_435_,
			   bool_436_, bool);
    }
    
    void method2942() {
	for (int i = 0; i < anInt9062; i++) {
	    anIntArray9052[i] = anIntArray9052[i] + 7 >> 4;
	    anIntArray9069[i] = anIntArray9069[i] + 7 >> 4;
	    anIntArray9054[i] = anIntArray9054[i] + 7 >> 4;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public byte[] method2970() {
	return aByteArray9068;
    }
    
    public MagnetConfig[] method2980() {
	return aClass154Array9098;
    }
    
    public int method3018() {
	if (!aBool9092)
	    method3003();
	return aShort9093;
    }
    
    public void method2978(Class444 class444) {
	Class435 class435 = aClass182_Sub3_9041.aClass435_9731;
	class435.method7040(class444);
	if (aClass184Array9097 != null) {
	    for (int i = 0; i < aClass184Array9097.length; i++) {
		Class184 class184 = aClass184Array9097[i];
		Class184 class184_439_ = class184;
		if (class184.aClass184_2070 != null)
		    class184_439_ = class184.aClass184_2070;
		class184_439_.anInt2077
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 908167867);
		class184_439_.anInt2063
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * -289521417);
		class184_439_.anInt2072
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 1741678221);
		class184_439_.anInt2073
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -1237556839);
		class184_439_.anInt2074
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * 995078737);
		class184_439_.anInt2075
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -285158923);
		class184_439_.anInt2071
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -970783049);
		class184_439_.anInt2067
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -779882021);
		class184_439_.anInt2078
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -1530339371);
	    }
	}
	if (aClass154Array9098 != null) {
	    for (int i = 0; i < aClass154Array9098.length; i++) {
		MagnetConfig class154 = aClass154Array9098[i];
		MagnetConfig class154_440_ = class154;
		if (class154.aClass154_1728 != null)
		    class154_440_ = class154.aClass154_1728;
		if (class154.aClass435_1727 != null)
		    class154.aClass435_1727.method6947(class435);
		else
		    class154.aClass435_1727 = new Class435(class435);
		class154_440_.anInt1730
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -1389867987);
		class154_440_.anInt1731
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -182905551);
		class154_440_.anInt1732
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * 1917380171);
	    }
	}
    }
    
    public boolean method2954(int i, int i_441_, Class444 class444,
			      boolean bool, int i_442_) {
	Class435 class435 = aClass182_Sub3_9041.aClass435_9731;
	class435.method7040(class444);
	class435.method6950(aClass182_Sub3_9041.aClass435_9710);
	boolean bool_443_ = false;
	int i_444_ = 2147483647;
	int i_445_ = -2147483648;
	int i_446_ = 2147483647;
	int i_447_ = -2147483648;
	if (!aBool9085)
	    method14558();
	int i_448_ = aShort9089 - aShort9088 >> 1;
	int i_449_ = aShort9103 - aShort9086 >> 1;
	int i_450_ = aShort9102 - aShort9090 >> 1;
	int i_451_ = aShort9088 + i_448_;
	int i_452_ = aShort9086 + i_449_;
	int i_453_ = aShort9090 + i_450_;
	int i_454_ = i_451_ - (i_448_ << i_442_);
	int i_455_ = i_452_ - (i_449_ << i_442_);
	int i_456_ = i_453_ - (i_450_ << i_442_);
	int i_457_ = i_451_ + (i_448_ << i_442_);
	int i_458_ = i_452_ + (i_449_ << i_442_);
	int i_459_ = i_453_ + (i_450_ << i_442_);
	anIntArray9105[0] = i_454_;
	anIntArray9106[0] = i_455_;
	anIntArray9066[0] = i_456_;
	anIntArray9105[1] = i_457_;
	anIntArray9106[1] = i_455_;
	anIntArray9066[1] = i_456_;
	anIntArray9105[2] = i_454_;
	anIntArray9106[2] = i_458_;
	anIntArray9066[2] = i_456_;
	anIntArray9105[3] = i_457_;
	anIntArray9106[3] = i_458_;
	anIntArray9066[3] = i_456_;
	anIntArray9105[4] = i_454_;
	anIntArray9106[4] = i_455_;
	anIntArray9066[4] = i_459_;
	anIntArray9105[5] = i_457_;
	anIntArray9106[5] = i_455_;
	anIntArray9066[5] = i_459_;
	anIntArray9105[6] = i_454_;
	anIntArray9106[6] = i_458_;
	anIntArray9066[6] = i_459_;
	anIntArray9105[7] = i_457_;
	anIntArray9106[7] = i_458_;
	anIntArray9066[7] = i_459_;
	for (int i_460_ = 0; i_460_ < 8; i_460_++) {
	    int i_461_ = anIntArray9105[i_460_];
	    int i_462_ = anIntArray9106[i_460_];
	    int i_463_ = anIntArray9066[i_460_];
	    float f = (class435.aFloatArray4830[2] * (float) i_461_
		       + class435.aFloatArray4830[6] * (float) i_462_
		       + class435.aFloatArray4830[10] * (float) i_463_
		       + class435.aFloatArray4830[14]);
	    float f_464_ = (class435.aFloatArray4830[3] * (float) i_461_
			    + class435.aFloatArray4830[7] * (float) i_462_
			    + class435.aFloatArray4830[11] * (float) i_463_
			    + class435.aFloatArray4830[15]);
	    if (f >= -f_464_) {
		float f_465_ = (class435.aFloatArray4830[0] * (float) i_461_
				+ class435.aFloatArray4830[4] * (float) i_462_
				+ class435.aFloatArray4830[8] * (float) i_463_
				+ class435.aFloatArray4830[12]);
		float f_466_ = (class435.aFloatArray4830[1] * (float) i_461_
				+ class435.aFloatArray4830[5] * (float) i_462_
				+ class435.aFloatArray4830[9] * (float) i_463_
				+ class435.aFloatArray4830[13]);
		int i_467_ = (int) (aClass182_Sub3_9041.aFloat9799
				    + (aClass182_Sub3_9041.aFloat9723 * f_465_
				       / f_464_));
		int i_468_ = (int) (aClass182_Sub3_9041.aFloat9651
				    + (aClass182_Sub3_9041.aFloat9725 * f_466_
				       / f_464_));
		if (i_467_ < i_444_)
		    i_444_ = i_467_;
		if (i_467_ > i_445_)
		    i_445_ = i_467_;
		if (i_468_ < i_446_)
		    i_446_ = i_468_;
		if (i_468_ > i_447_)
		    i_447_ = i_468_;
		bool_443_ = true;
	    }
	}
	if (bool_443_ && i > i_444_ && i < i_445_ && i_441_ > i_446_
	    && i_441_ < i_447_) {
	    if (bool)
		return true;
	    if (aClass182_Sub3_9041.anIntArray9829.length < anInt9057) {
		aClass182_Sub3_9041.anIntArray9829 = new int[anInt9057];
		aClass182_Sub3_9041.anIntArray9830 = new int[anInt9057];
	    }
	    int[] is = aClass182_Sub3_9041.anIntArray9829;
	    int[] is_469_ = aClass182_Sub3_9041.anIntArray9830;
	    for (int i_470_ = 0; i_470_ < anInt9072; i_470_++) {
		int i_471_ = anIntArray9052[i_470_];
		int i_472_ = anIntArray9069[i_470_];
		int i_473_ = anIntArray9054[i_470_];
		float f = (class435.aFloatArray4830[2] * (float) i_471_
			   + class435.aFloatArray4830[6] * (float) i_472_
			   + class435.aFloatArray4830[10] * (float) i_473_
			   + class435.aFloatArray4830[14]);
		float f_474_ = (class435.aFloatArray4830[3] * (float) i_471_
				+ class435.aFloatArray4830[7] * (float) i_472_
				+ class435.aFloatArray4830[11] * (float) i_473_
				+ class435.aFloatArray4830[15]);
		if (f >= -f_474_) {
		    float f_475_
			= (class435.aFloatArray4830[0] * (float) i_471_
			   + class435.aFloatArray4830[4] * (float) i_472_
			   + class435.aFloatArray4830[8] * (float) i_473_
			   + class435.aFloatArray4830[12]);
		    float f_476_
			= (class435.aFloatArray4830[1] * (float) i_471_
			   + class435.aFloatArray4830[5] * (float) i_472_
			   + class435.aFloatArray4830[9] * (float) i_473_
			   + class435.aFloatArray4830[13]);
		    int i_477_ = anIntArray9046[i_470_];
		    int i_478_ = anIntArray9046[i_470_ + 1];
		    for (int i_479_ = i_477_;
			 i_479_ < i_478_ && aShortArray9096[i_479_] != 0;
			 i_479_++) {
			int i_480_ = (aShortArray9096[i_479_] & 0xffff) - 1;
			is[i_480_] = (int) (aClass182_Sub3_9041.aFloat9799
					    + (aClass182_Sub3_9041.aFloat9723
					       * f_475_ / f_474_));
			is_469_[i_480_]
			    = (int) (aClass182_Sub3_9041.aFloat9651
				     + (aClass182_Sub3_9041.aFloat9725 * f_476_
					/ f_474_));
		    }
		} else {
		    int i_481_ = anIntArray9046[i_470_];
		    int i_482_ = anIntArray9046[i_470_ + 1];
		    for (int i_483_ = i_481_;
			 i_483_ < i_482_ && aShortArray9096[i_483_] != 0;
			 i_483_++) {
			int i_484_ = (aShortArray9096[i_483_] & 0xffff) - 1;
			is[i_484_] = -999999;
		    }
		}
	    }
	    for (int i_485_ = 0; i_485_ < anInt9065; i_485_++) {
		if (is[aShortArray9091[i_485_] & 0xffff] != -999999
		    && is[aShortArray9070[i_485_] & 0xffff] != -999999
		    && is[aShortArray9071[i_485_] & 0xffff] != -999999
		    && method14557(i, i_441_,
				   is_469_[aShortArray9091[i_485_] & 0xffff],
				   is_469_[aShortArray9070[i_485_] & 0xffff],
				   is_469_[aShortArray9071[i_485_] & 0xffff],
				   is[aShortArray9091[i_485_] & 0xffff],
				   is[aShortArray9070[i_485_] & 0xffff],
				   is[aShortArray9071[i_485_] & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    public void method3061(Class444 class444, Class211 class211, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (anInt9057 != 0) {
	    Class435 class435 = aClass182_Sub3_9041.aClass435_9717;
	    Class435 class435_486_ = aClass182_Sub3_9041.aClass435_9731;
	    Class435 class435_487_ = aClass182_Sub3_9041.aClass435_9646;
	    class435_486_.method7040(class444);
	    class435_487_.method6947(class435_486_);
	    class435_487_.method6950(aClass182_Sub3_9041.aClass435_9710);
	    if (!aBool9085)
		method14558();
	    float[] fs = aClass182_Sub3_9041.aFloatArray9752;
	    class435_486_.method6956(0.0F, (float) aShort9086, 0.0F, fs);
	    float f = fs[0];
	    float f_488_ = fs[1];
	    float f_489_ = fs[2];
	    class435_486_.method6956(0.0F, (float) aShort9103, 0.0F, fs);
	    float f_490_ = fs[0];
	    float f_491_ = fs[1];
	    float f_492_ = fs[2];
	    for (int i_493_ = 0; i_493_ < 6; i_493_++) {
		float[] fs_494_
		    = aClass182_Sub3_9041.aFloatArrayArray9720[i_493_];
		float f_495_
		    = (fs_494_[0] * f + fs_494_[1] * f_488_
		       + fs_494_[2] * f_489_ + fs_494_[3] + (float) anInt9084);
		float f_496_
		    = (fs_494_[0] * f_490_ + fs_494_[1] * f_491_
		       + fs_494_[2] * f_492_ + fs_494_[3] + (float) anInt9084);
		if (f_495_ < 0.0F && f_496_ < 0.0F)
		    return;
	    }
	    if (class211 != null) {
		boolean bool = false;
		boolean bool_497_ = true;
		int i_498_ = aShort9088 + aShort9089 >> 1;
		int i_499_ = aShort9090 + aShort9102 >> 1;
		int i_500_ = i_498_;
		short i_501_ = aShort9086;
		int i_502_ = i_499_;
		float f_503_
		    = (class435_487_.aFloatArray4830[0] * (float) i_500_
		       + class435_487_.aFloatArray4830[4] * (float) i_501_
		       + class435_487_.aFloatArray4830[8] * (float) i_502_
		       + class435_487_.aFloatArray4830[12]);
		float f_504_
		    = (class435_487_.aFloatArray4830[1] * (float) i_500_
		       + class435_487_.aFloatArray4830[5] * (float) i_501_
		       + class435_487_.aFloatArray4830[9] * (float) i_502_
		       + class435_487_.aFloatArray4830[13]);
		float f_505_
		    = (class435_487_.aFloatArray4830[2] * (float) i_500_
		       + class435_487_.aFloatArray4830[6] * (float) i_501_
		       + class435_487_.aFloatArray4830[10] * (float) i_502_
		       + class435_487_.aFloatArray4830[14]);
		float f_506_
		    = (class435_487_.aFloatArray4830[3] * (float) i_500_
		       + class435_487_.aFloatArray4830[7] * (float) i_501_
		       + class435_487_.aFloatArray4830[11] * (float) i_502_
		       + class435_487_.aFloatArray4830[15]);
		if (f_505_ >= -f_506_) {
		    class211.anInt2264
			= (int) (aClass182_Sub3_9041.aFloat9799
				 + (aClass182_Sub3_9041.aFloat9723 * f_503_
				    / f_506_));
		    class211.anInt2266
			= (int) (aClass182_Sub3_9041.aFloat9651
				 + (aClass182_Sub3_9041.aFloat9725 * f_504_
				    / f_506_));
		} else
		    bool = true;
		i_500_ = i_498_;
		i_501_ = aShort9103;
		i_502_ = i_499_;
		float f_507_
		    = (class435_487_.aFloatArray4830[0] * (float) i_500_
		       + class435_487_.aFloatArray4830[4] * (float) i_501_
		       + class435_487_.aFloatArray4830[8] * (float) i_502_
		       + class435_487_.aFloatArray4830[12]);
		float f_508_
		    = (class435_487_.aFloatArray4830[1] * (float) i_500_
		       + class435_487_.aFloatArray4830[5] * (float) i_501_
		       + class435_487_.aFloatArray4830[9] * (float) i_502_
		       + class435_487_.aFloatArray4830[13]);
		float f_509_
		    = (class435_487_.aFloatArray4830[2] * (float) i_500_
		       + class435_487_.aFloatArray4830[6] * (float) i_501_
		       + class435_487_.aFloatArray4830[10] * (float) i_502_
		       + class435_487_.aFloatArray4830[14]);
		float f_510_
		    = (class435_487_.aFloatArray4830[3] * (float) i_500_
		       + class435_487_.aFloatArray4830[7] * (float) i_501_
		       + class435_487_.aFloatArray4830[11] * (float) i_502_
		       + class435_487_.aFloatArray4830[15]);
		if (f_509_ >= -f_510_) {
		    class211.anInt2263
			= (int) (aClass182_Sub3_9041.aFloat9799
				 + (aClass182_Sub3_9041.aFloat9723 * f_507_
				    / f_510_));
		    class211.anInt2267
			= (int) (aClass182_Sub3_9041.aFloat9651
				 + (aClass182_Sub3_9041.aFloat9725 * f_508_
				    / f_510_));
		} else
		    bool = true;
		if (bool) {
		    if (f_505_ < -f_506_ && f_509_ < -f_510_)
			bool_497_ = false;
		    else if (f_505_ < -f_506_) {
			float f_511_
			    = (f_505_ + f_506_) / (f_509_ + f_510_) - 1.0F;
			float f_512_ = f_503_ + f_511_ * (f_507_ - f_503_);
			float f_513_ = f_504_ + f_511_ * (f_508_ - f_504_);
			float f_514_ = f_506_ + f_511_ * (f_510_ - f_506_);
			class211.anInt2264
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     + (aClass182_Sub3_9041.aFloat9723 * f_512_
					/ f_514_));
			class211.anInt2266
			    = (int) (aClass182_Sub3_9041.aFloat9651
				     + (aClass182_Sub3_9041.aFloat9725 * f_513_
					/ f_514_));
		    } else if (f_509_ < -f_510_) {
			float f_515_
			    = (f_509_ + f_510_) / (f_505_ + f_506_) - 1.0F;
			float f_516_ = f_507_ + f_515_ * (f_503_ - f_507_);
			float f_517_ = f_508_ + f_515_ * (f_504_ - f_508_);
			float f_518_ = f_510_ + f_515_ * (f_506_ - f_510_);
			class211.anInt2263
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     + (aClass182_Sub3_9041.aFloat9723 * f_516_
					/ f_518_));
			class211.anInt2267
			    = (int) (aClass182_Sub3_9041.aFloat9651
				     + (aClass182_Sub3_9041.aFloat9725 * f_517_
					/ f_518_));
		    }
		}
		if (bool_497_) {
		    if (f_505_ / f_506_ > f_509_ / f_510_) {
			float f_519_ = (f_503_
					+ (class435.aFloatArray4830[0]
					   * (float) anInt9084)
					+ class435.aFloatArray4830[12]);
			float f_520_ = (f_506_
					+ (class435.aFloatArray4830[3]
					   * (float) anInt9084)
					+ class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     - (float) class211.anInt2264
				     + (aClass182_Sub3_9041.aFloat9723 * f_519_
					/ f_520_));
		    } else {
			float f_521_ = (f_507_
					+ (class435.aFloatArray4830[0]
					   * (float) anInt9084)
					+ class435.aFloatArray4830[12]);
			float f_522_ = (f_510_
					+ (class435.aFloatArray4830[3]
					   * (float) anInt9084)
					+ class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     - (float) class211.anInt2263
				     + (aClass182_Sub3_9041.aFloat9723 * f_521_
					/ f_522_));
		    }
		    class211.aBool2265 = true;
		}
	    }
	    aClass182_Sub3_9041.method15390();
	    aClass182_Sub3_9041.method15357(class435_486_);
	    method14560();
	    aClass182_Sub3_9041.method15451();
	    class435_486_.method6950(aClass182_Sub3_9041.aClass435_9715);
	    method14562(class435_486_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    public Class525_Sub16_Sub17 method2955
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	if (anInt9057 == 0)
	    return null;
	if (!aBool9085)
	    method14558();
	int i;
	int i_523_;
	if (aClass182_Sub3_9041.anInt9697 > 0) {
	    i = (aShort9088 - (aShort9103 * aClass182_Sub3_9041.anInt9697 >> 8)
		 >> aClass182_Sub3_9041.anInt9800);
	    i_523_ = aShort9089 - (aShort9086 * aClass182_Sub3_9041.anInt9697
				   >> 8) >> aClass182_Sub3_9041.anInt9800;
	} else {
	    i = (aShort9088 - (aShort9086 * aClass182_Sub3_9041.anInt9697 >> 8)
		 >> aClass182_Sub3_9041.anInt9800);
	    i_523_ = aShort9089 - (aShort9103 * aClass182_Sub3_9041.anInt9697
				   >> 8) >> aClass182_Sub3_9041.anInt9800;
	}
	int i_524_;
	int i_525_;
	if (aClass182_Sub3_9041.anInt9765 > 0) {
	    i_524_ = aShort9090 - (aShort9103 * aClass182_Sub3_9041.anInt9765
				   >> 8) >> aClass182_Sub3_9041.anInt9800;
	    i_525_ = aShort9102 - (aShort9086 * aClass182_Sub3_9041.anInt9765
				   >> 8) >> aClass182_Sub3_9041.anInt9800;
	} else {
	    i_524_ = aShort9090 - (aShort9086 * aClass182_Sub3_9041.anInt9765
				   >> 8) >> aClass182_Sub3_9041.anInt9800;
	    i_525_ = aShort9102 - (aShort9103 * aClass182_Sub3_9041.anInt9765
				   >> 8) >> aClass182_Sub3_9041.anInt9800;
	}
	int i_526_ = i_523_ - i + 1;
	int i_527_ = i_525_ - i_524_ + 1;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1_528_;
	if (class525_sub16_sub17_sub1 != null
	    && class525_sub16_sub17_sub1.method18760(i_526_, i_527_)) {
	    class525_sub16_sub17_sub1_528_ = class525_sub16_sub17_sub1;
	    class525_sub16_sub17_sub1_528_.method18761();
	} else
	    class525_sub16_sub17_sub1_528_
		= new Class525_Sub16_Sub17_Sub1(aClass182_Sub3_9041, i_526_,
						i_527_);
	class525_sub16_sub17_sub1_528_.method18770(i, i_524_, i_523_, i_525_);
	method14559(class525_sub16_sub17_sub1_528_);
	return class525_sub16_sub17_sub1_528_;
    }
    
    public void method2998(int i) {
	int i_529_ = Class436.anIntArray4831[i];
	int i_530_ = Class436.anIntArray4838[i];
	for (int i_531_ = 0; i_531_ < anInt9072; i_531_++) {
	    int i_532_ = ((anIntArray9069[i_531_] * i_530_
			   - anIntArray9054[i_531_] * i_529_)
			  >> 14);
	    anIntArray9054[i_531_] = (anIntArray9069[i_531_] * i_529_
				      + anIntArray9054[i_531_] * i_530_) >> 14;
	    anIntArray9069[i_531_] = i_532_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method2953(Class444 class444, Class211 class211, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (anInt9057 != 0) {
	    Class435 class435 = aClass182_Sub3_9041.aClass435_9717;
	    Class435 class435_533_ = aClass182_Sub3_9041.aClass435_9731;
	    Class435 class435_534_ = aClass182_Sub3_9041.aClass435_9646;
	    class435_533_.method7040(class444);
	    class435_534_.method6947(class435_533_);
	    class435_534_.method6950(aClass182_Sub3_9041.aClass435_9710);
	    if (!aBool9085)
		method14558();
	    float[] fs = aClass182_Sub3_9041.aFloatArray9752;
	    class435_533_.method6956(0.0F, (float) aShort9086, 0.0F, fs);
	    float f = fs[0];
	    float f_535_ = fs[1];
	    float f_536_ = fs[2];
	    class435_533_.method6956(0.0F, (float) aShort9103, 0.0F, fs);
	    float f_537_ = fs[0];
	    float f_538_ = fs[1];
	    float f_539_ = fs[2];
	    for (int i_540_ = 0; i_540_ < 6; i_540_++) {
		float[] fs_541_
		    = aClass182_Sub3_9041.aFloatArrayArray9720[i_540_];
		float f_542_
		    = (fs_541_[0] * f + fs_541_[1] * f_535_
		       + fs_541_[2] * f_536_ + fs_541_[3] + (float) anInt9084);
		float f_543_
		    = (fs_541_[0] * f_537_ + fs_541_[1] * f_538_
		       + fs_541_[2] * f_539_ + fs_541_[3] + (float) anInt9084);
		if (f_542_ < 0.0F && f_543_ < 0.0F)
		    return;
	    }
	    if (class211 != null) {
		boolean bool = false;
		boolean bool_544_ = true;
		int i_545_ = aShort9088 + aShort9089 >> 1;
		int i_546_ = aShort9090 + aShort9102 >> 1;
		int i_547_ = i_545_;
		short i_548_ = aShort9086;
		int i_549_ = i_546_;
		float f_550_
		    = (class435_534_.aFloatArray4830[0] * (float) i_547_
		       + class435_534_.aFloatArray4830[4] * (float) i_548_
		       + class435_534_.aFloatArray4830[8] * (float) i_549_
		       + class435_534_.aFloatArray4830[12]);
		float f_551_
		    = (class435_534_.aFloatArray4830[1] * (float) i_547_
		       + class435_534_.aFloatArray4830[5] * (float) i_548_
		       + class435_534_.aFloatArray4830[9] * (float) i_549_
		       + class435_534_.aFloatArray4830[13]);
		float f_552_
		    = (class435_534_.aFloatArray4830[2] * (float) i_547_
		       + class435_534_.aFloatArray4830[6] * (float) i_548_
		       + class435_534_.aFloatArray4830[10] * (float) i_549_
		       + class435_534_.aFloatArray4830[14]);
		float f_553_
		    = (class435_534_.aFloatArray4830[3] * (float) i_547_
		       + class435_534_.aFloatArray4830[7] * (float) i_548_
		       + class435_534_.aFloatArray4830[11] * (float) i_549_
		       + class435_534_.aFloatArray4830[15]);
		if (f_552_ >= -f_553_) {
		    class211.anInt2264
			= (int) (aClass182_Sub3_9041.aFloat9799
				 + (aClass182_Sub3_9041.aFloat9723 * f_550_
				    / f_553_));
		    class211.anInt2266
			= (int) (aClass182_Sub3_9041.aFloat9651
				 + (aClass182_Sub3_9041.aFloat9725 * f_551_
				    / f_553_));
		} else
		    bool = true;
		i_547_ = i_545_;
		i_548_ = aShort9103;
		i_549_ = i_546_;
		float f_554_
		    = (class435_534_.aFloatArray4830[0] * (float) i_547_
		       + class435_534_.aFloatArray4830[4] * (float) i_548_
		       + class435_534_.aFloatArray4830[8] * (float) i_549_
		       + class435_534_.aFloatArray4830[12]);
		float f_555_
		    = (class435_534_.aFloatArray4830[1] * (float) i_547_
		       + class435_534_.aFloatArray4830[5] * (float) i_548_
		       + class435_534_.aFloatArray4830[9] * (float) i_549_
		       + class435_534_.aFloatArray4830[13]);
		float f_556_
		    = (class435_534_.aFloatArray4830[2] * (float) i_547_
		       + class435_534_.aFloatArray4830[6] * (float) i_548_
		       + class435_534_.aFloatArray4830[10] * (float) i_549_
		       + class435_534_.aFloatArray4830[14]);
		float f_557_
		    = (class435_534_.aFloatArray4830[3] * (float) i_547_
		       + class435_534_.aFloatArray4830[7] * (float) i_548_
		       + class435_534_.aFloatArray4830[11] * (float) i_549_
		       + class435_534_.aFloatArray4830[15]);
		if (f_556_ >= -f_557_) {
		    class211.anInt2263
			= (int) (aClass182_Sub3_9041.aFloat9799
				 + (aClass182_Sub3_9041.aFloat9723 * f_554_
				    / f_557_));
		    class211.anInt2267
			= (int) (aClass182_Sub3_9041.aFloat9651
				 + (aClass182_Sub3_9041.aFloat9725 * f_555_
				    / f_557_));
		} else
		    bool = true;
		if (bool) {
		    if (f_552_ < -f_553_ && f_556_ < -f_557_)
			bool_544_ = false;
		    else if (f_552_ < -f_553_) {
			float f_558_
			    = (f_552_ + f_553_) / (f_556_ + f_557_) - 1.0F;
			float f_559_ = f_550_ + f_558_ * (f_554_ - f_550_);
			float f_560_ = f_551_ + f_558_ * (f_555_ - f_551_);
			float f_561_ = f_553_ + f_558_ * (f_557_ - f_553_);
			class211.anInt2264
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     + (aClass182_Sub3_9041.aFloat9723 * f_559_
					/ f_561_));
			class211.anInt2266
			    = (int) (aClass182_Sub3_9041.aFloat9651
				     + (aClass182_Sub3_9041.aFloat9725 * f_560_
					/ f_561_));
		    } else if (f_556_ < -f_557_) {
			float f_562_
			    = (f_556_ + f_557_) / (f_552_ + f_553_) - 1.0F;
			float f_563_ = f_554_ + f_562_ * (f_550_ - f_554_);
			float f_564_ = f_555_ + f_562_ * (f_551_ - f_555_);
			float f_565_ = f_557_ + f_562_ * (f_553_ - f_557_);
			class211.anInt2263
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     + (aClass182_Sub3_9041.aFloat9723 * f_563_
					/ f_565_));
			class211.anInt2267
			    = (int) (aClass182_Sub3_9041.aFloat9651
				     + (aClass182_Sub3_9041.aFloat9725 * f_564_
					/ f_565_));
		    }
		}
		if (bool_544_) {
		    if (f_552_ / f_553_ > f_556_ / f_557_) {
			float f_566_ = (f_550_
					+ (class435.aFloatArray4830[0]
					   * (float) anInt9084)
					+ class435.aFloatArray4830[12]);
			float f_567_ = (f_553_
					+ (class435.aFloatArray4830[3]
					   * (float) anInt9084)
					+ class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     - (float) class211.anInt2264
				     + (aClass182_Sub3_9041.aFloat9723 * f_566_
					/ f_567_));
		    } else {
			float f_568_ = (f_554_
					+ (class435.aFloatArray4830[0]
					   * (float) anInt9084)
					+ class435.aFloatArray4830[12]);
			float f_569_ = (f_557_
					+ (class435.aFloatArray4830[3]
					   * (float) anInt9084)
					+ class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     - (float) class211.anInt2263
				     + (aClass182_Sub3_9041.aFloat9723 * f_568_
					/ f_569_));
		    }
		    class211.aBool2265 = true;
		}
	    }
	    aClass182_Sub3_9041.method15390();
	    aClass182_Sub3_9041.method15357(class435_533_);
	    method14560();
	    aClass182_Sub3_9041.method15451();
	    class435_533_.method6950(aClass182_Sub3_9041.aClass435_9715);
	    method14562(class435_533_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    public void method3101(int i) {
	aShort9047 = (short) i;
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
	if (aClass137_9051 != null)
	    aClass137_9051.anInterface15_1635 = null;
    }
    
    void method14562(Class435 class435) {
	if (aClass148Array9100 != null) {
	    Class435 class435_570_ = aClass182_Sub3_9041.aClass435_9681;
	    aClass182_Sub3_9041.method15414();
	    aClass182_Sub3_9041.method3235(!aBool9045);
	    aClass182_Sub3_9041.method15404(false);
	    aClass182_Sub3_9041.method15384(aClass182_Sub3_9041.aClass137_9758,
					    null, null,
					    (aClass182_Sub3_9041
					     .aClass137_9824));
	    for (int i = 0; i < anInt9074; i++) {
		Class148 class148 = aClass148Array9100[i];
		Class131 class131 = aClass131Array9101[i];
		if (!class148.aBool1698 || !aClass182_Sub3_9041.method3284()) {
		    float f = ((float) (anIntArray9052[class148.anInt1695]
					+ anIntArray9052[class148.anInt1692]
					+ anIntArray9052[class148.anInt1693])
			       * 0.3333333F);
		    float f_571_
			= ((float) (anIntArray9069[class148.anInt1695]
				    + anIntArray9069[class148.anInt1692]
				    + anIntArray9069[class148.anInt1693])
			   * 0.3333333F);
		    float f_572_
			= ((float) (anIntArray9054[class148.anInt1695]
				    + anIntArray9054[class148.anInt1692]
				    + anIntArray9054[class148.anInt1693])
			   * 0.3333333F);
		    float f_573_ = (class435.aFloatArray4830[0] * f
				    + class435.aFloatArray4830[4] * f_571_
				    + class435.aFloatArray4830[8] * f_572_
				    + class435.aFloatArray4830[12]);
		    float f_574_ = (class435.aFloatArray4830[1] * f
				    + class435.aFloatArray4830[5] * f_571_
				    + class435.aFloatArray4830[9] * f_572_
				    + class435.aFloatArray4830[13]);
		    float f_575_ = (class435.aFloatArray4830[2] * f
				    + class435.aFloatArray4830[6] * f_571_
				    + class435.aFloatArray4830[10] * f_572_
				    + class435.aFloatArray4830[14]);
		    float f_576_
			= ((float) (1.0
				    / Math.sqrt((double) (f_573_ * f_573_
							  + f_574_ * f_574_
							  + f_575_ * f_575_)))
			   * (float) class148.anInt1700);
		    class435_570_.method7050
			(class131.anInt1586,
			 class131.anInt1581 * class148.aShort1699 >> 7,
			 class131.anInt1584 * class148.aShort1696 >> 7,
			 f_573_ + (float) class131.anInt1583 - f_573_ * f_576_,
			 f_574_ + (float) class131.anInt1585 - f_574_ * f_576_,
			 f_575_ - f_575_ * f_576_);
		    aClass182_Sub3_9041.method15358(class435_570_);
		    int i_577_ = class131.anInt1582;
		    OpenGL.glColor4ub((byte) (i_577_ >> 16),
				      (byte) (i_577_ >> 8), (byte) i_577_,
				      (byte) (i_577_ >> 24));
		    aClass182_Sub3_9041.method15455(class148.aShort1697);
		    aClass182_Sub3_9041.method15409(class148.aByte1691);
		    aClass182_Sub3_9041.method15385(7, 0, 4);
		}
	    }
	    aClass182_Sub3_9041.method3235(true);
	    aClass182_Sub3_9041.method15451();
	}
    }
    
    void method14563(boolean bool) {
	if ((aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
	     .buffer).length
	    < anInt9111 * 6)
	    aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
		= new Class525_Sub38_Sub1((anInt9111 + 100) * 6);
	else
	    aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828.index = 0;
	Class525_Sub38_Sub1 class525_sub38_sub1
	    = aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828;
	if (aClass182_Sub3_9041.aBool9792) {
	    for (int i = 0; i < anInt9111; i++) {
		class525_sub38_sub1.method16602(aShortArray9091[i], 714187420);
		class525_sub38_sub1.method16602(aShortArray9070[i],
						1488164111);
		class525_sub38_sub1.method16602(aShortArray9071[i],
						1380518055);
	    }
	} else {
	    for (int i = 0; i < anInt9111; i++) {
		class525_sub38_sub1.method16840(aShortArray9091[i], 241387851);
		class525_sub38_sub1.method16840(aShortArray9070[i], 241387851);
		class525_sub38_sub1.method16840(aShortArray9071[i], 241387851);
	    }
	}
	if (class525_sub38_sub1.index * -1133521593 != 0) {
	    if (bool) {
		if (anInterface16_9035 == null)
		    anInterface16_9035
			= (aClass182_Sub3_9041.method15441
			   (5123, class525_sub38_sub1.buffer,
			    class525_sub38_sub1.index * -1133521593,
			    true));
		else
		    anInterface16_9035.method84(5123,
						(class525_sub38_sub1
						 .buffer),
						(class525_sub38_sub1.index
						 * -1133521593));
		aClass139_9079.anInterface16_1642 = anInterface16_9035;
	    } else
		aClass139_9079.anInterface16_1642
		    = (aClass182_Sub3_9041.method15441
		       (5123, class525_sub38_sub1.buffer,
			class525_sub38_sub1.index * -1133521593, false));
	    if (!bool)
		aBool9095 = true;
	}
    }
    
    void method14564(boolean bool) {
	boolean bool_578_ = (aClass137_9076 != null
			     && aClass137_9076.anInterface15_1635 == null);
	boolean bool_579_ = (aClass137_9051 != null
			     && aClass137_9051.anInterface15_1635 == null);
	boolean bool_580_ = (aClass137_9075 != null
			     && aClass137_9075.anInterface15_1635 == null);
	boolean bool_581_ = (aClass137_9078 != null
			     && aClass137_9078.anInterface15_1635 == null);
	if (bool) {
	    bool_578_ = bool_578_ & (aByte9037 & 0x2) != 0;
	    bool_579_ = bool_579_ & (aByte9037 & 0x4) != 0;
	    bool_580_ = bool_580_ & (aByte9037 & 0x1) != 0;
	    bool_581_ = bool_581_ & (aByte9037 & 0x8) != 0;
	}
	byte i = 0;
	byte i_582_ = 0;
	byte i_583_ = 0;
	byte i_584_ = 0;
	byte i_585_ = 0;
	if (bool_580_) {
	    i_582_ = i;
	    i += 12;
	}
	if (bool_578_) {
	    i_583_ = i;
	    i += 4;
	}
	if (bool_579_) {
	    i_584_ = i;
	    i += 12;
	}
	if (bool_581_) {
	    i_585_ = i;
	    i += 8;
	}
	if (i != 0) {
	    if ((aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
		 .buffer).length
		< anInt9057 * i)
		aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
		    = new Class525_Sub38_Sub1((anInt9057 + 100) * i);
	    else
		aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828.index = 0;
	    Class525_Sub38_Sub1 class525_sub38_sub1
		= aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828;
	    if (bool_580_) {
		if (aClass182_Sub3_9041.aBool9792) {
		    for (int i_586_ = 0; i_586_ < anInt9072; i_586_++) {
			int i_587_
			    = Stream.floatToRawIntBits((float) anIntArray9052
							       [i_586_]);
			int i_588_
			    = Stream.floatToRawIntBits((float) anIntArray9069
							       [i_586_]);
			int i_589_
			    = Stream.floatToRawIntBits((float) anIntArray9054
							       [i_586_]);
			int i_590_ = anIntArray9046[i_586_];
			int i_591_ = anIntArray9046[i_586_ + 1];
			for (int i_592_ = i_590_;
			     i_592_ < i_591_ && aShortArray9096[i_592_] != 0;
			     i_592_++) {
			    int i_593_
				= (aShortArray9096[i_592_] & 0xffff) - 1;
			    class525_sub38_sub1.index
				= i_593_ * i * 339428471;
			    class525_sub38_sub1.method16605(i_587_,
							    -109199348);
			    class525_sub38_sub1.method16605(i_588_,
							    -1754768492);
			    class525_sub38_sub1.method16605(i_589_,
							    -1217335989);
			}
		    }
		} else {
		    for (int i_594_ = 0; i_594_ < anInt9072; i_594_++) {
			int i_595_
			    = Stream.floatToRawIntBits((float) anIntArray9052
							       [i_594_]);
			int i_596_
			    = Stream.floatToRawIntBits((float) anIntArray9069
							       [i_594_]);
			int i_597_
			    = Stream.floatToRawIntBits((float) anIntArray9054
							       [i_594_]);
			int i_598_ = anIntArray9046[i_594_];
			int i_599_ = anIntArray9046[i_594_ + 1];
			for (int i_600_ = i_598_;
			     i_600_ < i_599_ && aShortArray9096[i_600_] != 0;
			     i_600_++) {
			    int i_601_
				= (aShortArray9096[i_600_] & 0xffff) - 1;
			    class525_sub38_sub1.index
				= i_601_ * i * 339428471;
			    class525_sub38_sub1.method16606(i_595_,
							    -783171572);
			    class525_sub38_sub1.method16606(i_596_,
							    -470873274);
			    class525_sub38_sub1.method16606(i_597_, 495251583);
			}
		    }
		}
	    }
	    if (bool_578_) {
		if (aClass137_9051 == null) {
		    short[] is;
		    short[] is_602_;
		    short[] is_603_;
		    byte[] is_604_;
		    if (aClass145_9063 != null) {
			is = aClass145_9063.aShortArray1672;
			is_602_ = aClass145_9063.aShortArray1671;
			is_603_ = aClass145_9063.aShortArray1669;
			is_604_ = aClass145_9063.aByteArray1670;
		    } else {
			is = aShortArray9073;
			is_602_ = aShortArray9059;
			is_603_ = aShortArray9060;
			is_604_ = aByteArray9061;
		    }
		    float f = aClass182_Sub3_9041.aFloatArray9660[0];
		    float f_605_ = aClass182_Sub3_9041.aFloatArray9660[1];
		    float f_606_ = aClass182_Sub3_9041.aFloatArray9660[2];
		    float f_607_ = aClass182_Sub3_9041.aFloat9834;
		    float f_608_ = (aClass182_Sub3_9041.aFloat9759 * 768.0F
				    / (float) aShort9047);
		    float f_609_ = (aClass182_Sub3_9041.aFloat9631 * 768.0F
				    / (float) aShort9047);
		    for (int i_610_ = 0; i_610_ < anInt9065; i_610_++) {
			int i_611_
			    = method14565(aShortArray9067[i_610_],
					  aShortArray9039[i_610_], aShort9110,
					  aByteArray9068[i_610_]);
			float f_612_ = ((float) (i_611_ >>> 24)
					* aClass182_Sub3_9041.aFloat9755);
			float f_613_ = ((float) (i_611_ >> 16 & 0xff)
					* aClass182_Sub3_9041.aFloat9756);
			float f_614_ = ((float) (i_611_ >> 8 & 0xff)
					* aClass182_Sub3_9041.aFloat9708);
			int i_615_ = aShortArray9091[i_610_] & 0xffff;
			short i_616_ = (short) is_604_[i_615_];
			float f_617_;
			if (i_616_ == 0)
			    f_617_ = ((f * (float) is[i_615_]
				       + f_605_ * (float) is_602_[i_615_]
				       + f_606_ * (float) is_603_[i_615_])
				      * 0.0026041667F);
			else
			    f_617_ = ((f * (float) is[i_615_]
				       + f_605_ * (float) is_602_[i_615_]
				       + f_606_ * (float) is_603_[i_615_])
				      / (float) (i_616_ * 256));
			float f_618_ = f_607_ + f_617_ * (f_617_ < 0.0F
							  ? f_609_ : f_608_);
			int i_619_ = (int) (f_612_ * f_618_);
			if (i_619_ < 0)
			    i_619_ = 0;
			else if (i_619_ > 255)
			    i_619_ = 255;
			int i_620_ = (int) (f_613_ * f_618_);
			if (i_620_ < 0)
			    i_620_ = 0;
			else if (i_620_ > 255)
			    i_620_ = 255;
			int i_621_ = (int) (f_614_ * f_618_);
			if (i_621_ < 0)
			    i_621_ = 0;
			else if (i_621_ > 255)
			    i_621_ = 255;
			class525_sub38_sub1.index
			    = (i_583_ + i_615_ * i) * 339428471;
			class525_sub38_sub1.method16735(i_619_, -1871431796);
			class525_sub38_sub1.method16735(i_620_, -1339147593);
			class525_sub38_sub1.method16735(i_621_, -691087717);
			class525_sub38_sub1.method16735(255 - ((aByteArray9068
								[i_610_])
							       & 0xff),
							-2058903440);
			i_615_ = aShortArray9070[i_610_] & 0xffff;
			i_616_ = (short) is_604_[i_615_];
			if (i_616_ == 0)
			    f_617_ = ((f * (float) is[i_615_]
				       + f_605_ * (float) is_602_[i_615_]
				       + f_606_ * (float) is_603_[i_615_])
				      * 0.0026041667F);
			else
			    f_617_ = ((f * (float) is[i_615_]
				       + f_605_ * (float) is_602_[i_615_]
				       + f_606_ * (float) is_603_[i_615_])
				      / (float) (i_616_ * 256));
			f_618_ = f_607_ + f_617_ * (f_617_ < 0.0F ? f_609_
						    : f_608_);
			i_619_ = (int) (f_612_ * f_618_);
			if (i_619_ < 0)
			    i_619_ = 0;
			else if (i_619_ > 255)
			    i_619_ = 255;
			i_620_ = (int) (f_613_ * f_618_);
			if (i_620_ < 0)
			    i_620_ = 0;
			else if (i_620_ > 255)
			    i_620_ = 255;
			i_621_ = (int) (f_614_ * f_618_);
			if (i_621_ < 0)
			    i_621_ = 0;
			else if (i_621_ > 255)
			    i_621_ = 255;
			class525_sub38_sub1.index
			    = (i_583_ + i_615_ * i) * 339428471;
			class525_sub38_sub1.method16735(i_619_, -260554479);
			class525_sub38_sub1.method16735(i_620_, -1368923958);
			class525_sub38_sub1.method16735(i_621_, -127898808);
			class525_sub38_sub1.method16735(255 - ((aByteArray9068
								[i_610_])
							       & 0xff),
							-581831688);
			i_615_ = aShortArray9071[i_610_] & 0xffff;
			i_616_ = (short) is_604_[i_615_];
			if (i_616_ == 0)
			    f_617_ = ((f * (float) is[i_615_]
				       + f_605_ * (float) is_602_[i_615_]
				       + f_606_ * (float) is_603_[i_615_])
				      * 0.0026041667F);
			else
			    f_617_ = ((f * (float) is[i_615_]
				       + f_605_ * (float) is_602_[i_615_]
				       + f_606_ * (float) is_603_[i_615_])
				      / (float) (i_616_ * 256));
			f_618_ = f_607_ + f_617_ * (f_617_ < 0.0F ? f_609_
						    : f_608_);
			i_619_ = (int) (f_612_ * f_618_);
			if (i_619_ < 0)
			    i_619_ = 0;
			else if (i_619_ > 255)
			    i_619_ = 255;
			i_620_ = (int) (f_613_ * f_618_);
			if (i_620_ < 0)
			    i_620_ = 0;
			else if (i_620_ > 255)
			    i_620_ = 255;
			i_621_ = (int) (f_614_ * f_618_);
			if (i_621_ < 0)
			    i_621_ = 0;
			else if (i_621_ > 255)
			    i_621_ = 255;
			class525_sub38_sub1.index
			    = (i_583_ + i_615_ * i) * 339428471;
			class525_sub38_sub1.method16735(i_619_, -273934691);
			class525_sub38_sub1.method16735(i_620_, -2053949753);
			class525_sub38_sub1.method16735(i_621_, -1643911581);
			class525_sub38_sub1.method16735(255 - ((aByteArray9068
								[i_610_])
							       & 0xff),
							-1004386072);
		    }
		} else {
		    for (int i_622_ = 0; i_622_ < anInt9065; i_622_++) {
			int i_623_
			    = method14565(aShortArray9067[i_622_],
					  aShortArray9039[i_622_], aShort9110,
					  aByteArray9068[i_622_]);
			class525_sub38_sub1.index
			    = ((i_583_
				+ (aShortArray9091[i_622_] & 0xffff) * i)
			       * 339428471);
			class525_sub38_sub1.method16605(i_623_, -1796846681);
			class525_sub38_sub1.index
			    = ((i_583_
				+ (aShortArray9070[i_622_] & 0xffff) * i)
			       * 339428471);
			class525_sub38_sub1.method16605(i_623_, -1495770112);
			class525_sub38_sub1.index
			    = ((i_583_
				+ (aShortArray9071[i_622_] & 0xffff) * i)
			       * 339428471);
			class525_sub38_sub1.method16605(i_623_, -1627086823);
		    }
		}
	    }
	    if (bool_579_) {
		short[] is;
		short[] is_624_;
		short[] is_625_;
		byte[] is_626_;
		if (aClass145_9063 != null) {
		    is = aClass145_9063.aShortArray1672;
		    is_624_ = aClass145_9063.aShortArray1671;
		    is_625_ = aClass145_9063.aShortArray1669;
		    is_626_ = aClass145_9063.aByteArray1670;
		} else {
		    is = aShortArray9073;
		    is_624_ = aShortArray9059;
		    is_625_ = aShortArray9060;
		    is_626_ = aByteArray9061;
		}
		float f = 3.0F / (float) aShort9047;
		float f_627_ = 3.0F / (float) (aShort9047 + aShort9047 / 2);
		class525_sub38_sub1.index = i_584_ * 339428471;
		if (aClass182_Sub3_9041.aBool9792) {
		    for (int i_628_ = 0; i_628_ < anInt9057; i_628_++) {
			int i_629_ = is_626_[i_628_] & 0xff;
			if (i_629_ == 0) {
			    class525_sub38_sub1
				.method18263((float) is[i_628_] * f_627_);
			    class525_sub38_sub1
				.method18263((float) is_624_[i_628_] * f_627_);
			    class525_sub38_sub1
				.method18263((float) is_625_[i_628_] * f_627_);
			} else {
			    float f_630_ = f / (float) i_629_;
			    class525_sub38_sub1
				.method18263((float) is[i_628_] * f_630_);
			    class525_sub38_sub1
				.method18263((float) is_624_[i_628_] * f_630_);
			    class525_sub38_sub1
				.method18263((float) is_625_[i_628_] * f_630_);
			}
			class525_sub38_sub1.index += (i - 12) * 339428471;
		    }
		} else {
		    for (int i_631_ = 0; i_631_ < anInt9057; i_631_++) {
			int i_632_ = is_626_[i_631_] & 0xff;
			if (i_632_ == 0) {
			    class525_sub38_sub1
				.method18262((float) is[i_631_] * f_627_);
			    class525_sub38_sub1
				.method18262((float) is_624_[i_631_] * f_627_);
			    class525_sub38_sub1
				.method18262((float) is_625_[i_631_] * f_627_);
			} else {
			    float f_633_ = f / (float) i_632_;
			    class525_sub38_sub1
				.method18262((float) is[i_631_] * f_633_);
			    class525_sub38_sub1
				.method18262((float) is_624_[i_631_] * f_633_);
			    class525_sub38_sub1
				.method18262((float) is_625_[i_631_] * f_633_);
			}
			class525_sub38_sub1.index += (i - 12) * 339428471;
		    }
		}
	    }
	    if (bool_581_) {
		class525_sub38_sub1.index = i_585_ * 339428471;
		if (aClass182_Sub3_9041.aBool9792) {
		    for (int i_634_ = 0; i_634_ < anInt9057; i_634_++) {
			class525_sub38_sub1
			    .method18263(aFloatArray9058[i_634_]);
			class525_sub38_sub1
			    .method18263(aFloatArray9064[i_634_]);
			class525_sub38_sub1.index += (i - 8) * 339428471;
		    }
		} else {
		    for (int i_635_ = 0; i_635_ < anInt9057; i_635_++) {
			class525_sub38_sub1
			    .method18262(aFloatArray9058[i_635_]);
			class525_sub38_sub1
			    .method18262(aFloatArray9064[i_635_]);
			class525_sub38_sub1.index += (i - 8) * 339428471;
		    }
		}
	    }
	    class525_sub38_sub1.index = i * anInt9057 * 339428471;
	    Interface15 interface15;
	    if (bool) {
		if (anInterface15_9081 == null)
		    anInterface15_9081
			= (aClass182_Sub3_9041.method15533
			   (i, class525_sub38_sub1.buffer,
			    class525_sub38_sub1.index * -1133521593,
			    true));
		else
		    anInterface15_9081.method78(i,
						(class525_sub38_sub1
						 .buffer),
						(class525_sub38_sub1.index
						 * -1133521593));
		interface15 = anInterface15_9081;
		aByte9037 = (byte) 0;
	    } else {
		interface15
		    = (aClass182_Sub3_9041.method15533
		       (i, class525_sub38_sub1.buffer,
			class525_sub38_sub1.index * -1133521593, false));
		aBool9095 = true;
	    }
	    if (bool_580_) {
		aClass137_9075.anInterface15_1635 = interface15;
		aClass137_9075.aByte1634 = i_582_;
	    }
	    if (bool_581_) {
		aClass137_9078.anInterface15_1635 = interface15;
		aClass137_9078.aByte1634 = i_585_;
	    }
	    if (bool_578_) {
		aClass137_9076.anInterface15_1635 = interface15;
		aClass137_9076.aByte1634 = i_583_;
	    }
	    if (bool_579_) {
		aClass137_9051.anInterface15_1635 = interface15;
		aClass137_9051.aByte1634 = i_584_;
	    }
	}
    }
    
    int method14565(int i, short i_636_, int i_637_, byte i_638_) {
	int i_639_ = Class642.anIntArray8324[method14566(i, i_637_)];
	if (i_636_ != -1) {
	    TextureMetrics class166 = aClass182_Sub3_9041.aClass180_1944
				    .method3116(i_636_ & 0xffff, -1431554601);
	    int i_640_ = class166.aByte1785 & 0xff;
	    if (i_640_ != 0) {
		int i_641_;
		if (i_637_ < 0)
		    i_641_ = 0;
		else if (i_637_ > 127)
		    i_641_ = 16777215;
		else
		    i_641_ = 131586 * i_637_;
		if (i_640_ == 256)
		    i_639_ = i_641_;
		else {
		    int i_642_ = i_640_;
		    int i_643_ = 256 - i_640_;
		    i_639_ = ((((i_641_ & 0xff00ff) * i_642_
				+ (i_639_ & 0xff00ff) * i_643_)
			       & ~0xff00ff)
			      + (((i_641_ & 0xff00) * i_642_
				  + (i_639_ & 0xff00) * i_643_)
				 & 0xff0000)) >> 8;
		}
	    }
	    int i_644_ = class166.aByte1831 & 0xff;
	    if (i_644_ != 0) {
		i_644_ += 256;
		int i_645_ = ((i_639_ & 0xff0000) >> 16) * i_644_;
		if (i_645_ > 65535)
		    i_645_ = 65535;
		int i_646_ = ((i_639_ & 0xff00) >> 8) * i_644_;
		if (i_646_ > 65535)
		    i_646_ = 65535;
		int i_647_ = (i_639_ & 0xff) * i_644_;
		if (i_647_ > 65535)
		    i_647_ = 65535;
		i_639_ = (i_645_ << 8 & 0xff0000) + (i_646_ & 0xff00) + (i_647_
									 >> 8);
	    }
	}
	return i_639_ << 8 | 255 - (i_638_ & 0xff);
    }
    
    static final int method14566(int i, int i_648_) {
	i_648_ = i_648_ * (i & 0x7f) >> 7;
	if (i_648_ < 2)
	    i_648_ = 2;
	else if (i_648_ > 126)
	    i_648_ = 126;
	return (i & 0xff80) + i_648_;
    }
    
    static {
	anIntArray9066 = new int[8];
    }
    
    public void method3068(Class179 class179, int i, int i_649_, int i_650_,
			   boolean bool) {
	Class179_Sub1 class179_sub1_651_ = (Class179_Sub1) class179;
	if (anInt9065 != 0 && class179_sub1_651_.anInt9065 != 0) {
	    int i_652_ = class179_sub1_651_.anInt9072;
	    int[] is = class179_sub1_651_.anIntArray9052;
	    int[] is_653_ = class179_sub1_651_.anIntArray9069;
	    int[] is_654_ = class179_sub1_651_.anIntArray9054;
	    short[] is_655_ = class179_sub1_651_.aShortArray9073;
	    short[] is_656_ = class179_sub1_651_.aShortArray9059;
	    short[] is_657_ = class179_sub1_651_.aShortArray9060;
	    byte[] is_658_ = class179_sub1_651_.aByteArray9061;
	    short[] is_659_;
	    short[] is_660_;
	    short[] is_661_;
	    byte[] is_662_;
	    if (aClass145_9063 != null) {
		is_659_ = aClass145_9063.aShortArray1672;
		is_660_ = aClass145_9063.aShortArray1671;
		is_661_ = aClass145_9063.aShortArray1669;
		is_662_ = aClass145_9063.aByteArray1670;
	    } else {
		is_659_ = null;
		is_660_ = null;
		is_661_ = null;
		is_662_ = null;
	    }
	    short[] is_663_;
	    short[] is_664_;
	    short[] is_665_;
	    byte[] is_666_;
	    if (class179_sub1_651_.aClass145_9063 != null) {
		is_663_ = class179_sub1_651_.aClass145_9063.aShortArray1672;
		is_664_ = class179_sub1_651_.aClass145_9063.aShortArray1671;
		is_665_ = class179_sub1_651_.aClass145_9063.aShortArray1669;
		is_666_ = class179_sub1_651_.aClass145_9063.aByteArray1670;
	    } else {
		is_663_ = null;
		is_664_ = null;
		is_665_ = null;
		is_666_ = null;
	    }
	    int[] is_667_ = class179_sub1_651_.anIntArray9046;
	    short[] is_668_ = class179_sub1_651_.aShortArray9096;
	    if (!class179_sub1_651_.aBool9085)
		class179_sub1_651_.method14558();
	    int i_669_ = class179_sub1_651_.aShort9086;
	    int i_670_ = class179_sub1_651_.aShort9103;
	    int i_671_ = class179_sub1_651_.aShort9088;
	    int i_672_ = class179_sub1_651_.aShort9089;
	    int i_673_ = class179_sub1_651_.aShort9090;
	    int i_674_ = class179_sub1_651_.aShort9102;
	    for (int i_675_ = 0; i_675_ < anInt9072; i_675_++) {
		int i_676_ = anIntArray9069[i_675_] - i_649_;
		if (i_676_ >= i_669_ && i_676_ <= i_670_) {
		    int i_677_ = anIntArray9052[i_675_] - i;
		    if (i_677_ >= i_671_ && i_677_ <= i_672_) {
			int i_678_ = anIntArray9054[i_675_] - i_650_;
			if (i_678_ >= i_673_ && i_678_ <= i_674_) {
			    int i_679_ = -1;
			    int i_680_ = anIntArray9046[i_675_];
			    int i_681_ = anIntArray9046[i_675_ + 1];
			    for (int i_682_ = i_680_;
				 (i_682_ < i_681_
				  && aShortArray9096[i_682_] != 0);
				 i_682_++) {
				i_679_
				    = (aShortArray9096[i_682_] & 0xffff) - 1;
				if (aByteArray9061[i_679_] != 0)
				    break;
			    }
			    if (i_679_ != -1) {
				for (int i_683_ = 0; i_683_ < i_652_;
				     i_683_++) {
				    if (i_677_ == is[i_683_]
					&& i_678_ == is_654_[i_683_]
					&& i_676_ == is_653_[i_683_]) {
					int i_684_ = -1;
					i_680_ = is_667_[i_683_];
					i_681_ = is_667_[i_683_ + 1];
					for (int i_685_ = i_680_;
					     (i_685_ < i_681_
					      && is_668_[i_685_] != 0);
					     i_685_++) {
					    i_684_ = (is_668_[i_685_]
						      & 0xffff) - 1;
					    if (is_658_[i_684_] != 0)
						break;
					}
					if (i_684_ != -1) {
					    if (is_659_ == null) {
						aClass145_9063
						    = new Class145();
						is_659_
						    = aClass145_9063
							  .aShortArray1672
						    = (Class457.method7467
						       (aShortArray9073,
							1056019459));
						is_660_
						    = aClass145_9063
							  .aShortArray1671
						    = (Class457.method7467
						       (aShortArray9059,
							1331698823));
						is_661_
						    = aClass145_9063
							  .aShortArray1669
						    = (Class457.method7467
						       (aShortArray9060,
							491067750));
						is_662_
						    = aClass145_9063
							  .aByteArray1670
						    = (Class509.method8501
						       (aByteArray9061,
							813569940));
					    }
					    if (is_663_ == null) {
						Class145 class145
						    = (class179_sub1_651_
							   .aClass145_9063
						       = new Class145());
						is_663_
						    = class145.aShortArray1672
						    = (Class457.method7467
						       (is_655_, -746324089));
						is_664_
						    = class145.aShortArray1671
						    = (Class457.method7467
						       (is_656_, -1998161306));
						is_665_
						    = class145.aShortArray1669
						    = (Class457.method7467
						       (is_657_, 500860236));
						is_666_
						    = class145.aByteArray1670
						    = (Class509.method8501
						       (is_658_, -1495493583));
					    }
					    short i_686_
						= aShortArray9073[i_679_];
					    short i_687_
						= aShortArray9059[i_679_];
					    short i_688_
						= aShortArray9060[i_679_];
					    byte i_689_
						= aByteArray9061[i_679_];
					    i_680_ = is_667_[i_683_];
					    i_681_ = is_667_[i_683_ + 1];
					    for (int i_690_ = i_680_;
						 i_690_ < i_681_; i_690_++) {
						int i_691_
						    = is_668_[i_690_] - 1;
						if (i_691_ == -1)
						    break;
						if (is_666_[i_691_] != 0) {
						    is_663_[i_691_] += i_686_;
						    is_664_[i_691_] += i_687_;
						    is_665_[i_691_] += i_688_;
						    is_666_[i_691_] += i_689_;
						}
					    }
					    i_686_ = is_655_[i_684_];
					    i_687_ = is_656_[i_684_];
					    i_688_ = is_657_[i_684_];
					    i_689_ = is_658_[i_684_];
					    i_680_ = anIntArray9046[i_675_];
					    i_681_
						= anIntArray9046[i_675_ + 1];
					    for (int i_692_ = i_680_;
						 (i_692_ < i_681_
						  && (aShortArray9096[i_692_]
						      != 0));
						 i_692_++) {
						int i_693_
						    = ((aShortArray9096[i_692_]
							& 0xffff)
						       - 1);
						if (is_662_[i_693_] != 0) {
						    is_659_[i_693_] += i_686_;
						    is_660_[i_693_] += i_687_;
						    is_661_[i_693_] += i_688_;
						    is_662_[i_693_] += i_689_;
						}
					    }
					    if (aClass137_9051 == null
						&& aClass137_9076 != null)
						aClass137_9076
						    .anInterface15_1635
						    = null;
					    if (aClass137_9051 != null)
						aClass137_9051
						    .anInterface15_1635
						    = null;
					    if ((class179_sub1_651_
						 .aClass137_9051) == null
						&& (class179_sub1_651_
						    .aClass137_9076) != null)
						class179_sub1_651_
						    .aClass137_9076
						    .anInterface15_1635
						    = null;
					    if ((class179_sub1_651_
						 .aClass137_9051)
						!= null)
						class179_sub1_651_
						    .aClass137_9051
						    .anInterface15_1635
						    = null;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method2983(Class179 class179, int i, int i_694_, int i_695_,
			   boolean bool) {
	Class179_Sub1 class179_sub1_696_ = (Class179_Sub1) class179;
	if (anInt9065 != 0 && class179_sub1_696_.anInt9065 != 0) {
	    int i_697_ = class179_sub1_696_.anInt9072;
	    int[] is = class179_sub1_696_.anIntArray9052;
	    int[] is_698_ = class179_sub1_696_.anIntArray9069;
	    int[] is_699_ = class179_sub1_696_.anIntArray9054;
	    short[] is_700_ = class179_sub1_696_.aShortArray9073;
	    short[] is_701_ = class179_sub1_696_.aShortArray9059;
	    short[] is_702_ = class179_sub1_696_.aShortArray9060;
	    byte[] is_703_ = class179_sub1_696_.aByteArray9061;
	    short[] is_704_;
	    short[] is_705_;
	    short[] is_706_;
	    byte[] is_707_;
	    if (aClass145_9063 != null) {
		is_704_ = aClass145_9063.aShortArray1672;
		is_705_ = aClass145_9063.aShortArray1671;
		is_706_ = aClass145_9063.aShortArray1669;
		is_707_ = aClass145_9063.aByteArray1670;
	    } else {
		is_704_ = null;
		is_705_ = null;
		is_706_ = null;
		is_707_ = null;
	    }
	    short[] is_708_;
	    short[] is_709_;
	    short[] is_710_;
	    byte[] is_711_;
	    if (class179_sub1_696_.aClass145_9063 != null) {
		is_708_ = class179_sub1_696_.aClass145_9063.aShortArray1672;
		is_709_ = class179_sub1_696_.aClass145_9063.aShortArray1671;
		is_710_ = class179_sub1_696_.aClass145_9063.aShortArray1669;
		is_711_ = class179_sub1_696_.aClass145_9063.aByteArray1670;
	    } else {
		is_708_ = null;
		is_709_ = null;
		is_710_ = null;
		is_711_ = null;
	    }
	    int[] is_712_ = class179_sub1_696_.anIntArray9046;
	    short[] is_713_ = class179_sub1_696_.aShortArray9096;
	    if (!class179_sub1_696_.aBool9085)
		class179_sub1_696_.method14558();
	    int i_714_ = class179_sub1_696_.aShort9086;
	    int i_715_ = class179_sub1_696_.aShort9103;
	    int i_716_ = class179_sub1_696_.aShort9088;
	    int i_717_ = class179_sub1_696_.aShort9089;
	    int i_718_ = class179_sub1_696_.aShort9090;
	    int i_719_ = class179_sub1_696_.aShort9102;
	    for (int i_720_ = 0; i_720_ < anInt9072; i_720_++) {
		int i_721_ = anIntArray9069[i_720_] - i_694_;
		if (i_721_ >= i_714_ && i_721_ <= i_715_) {
		    int i_722_ = anIntArray9052[i_720_] - i;
		    if (i_722_ >= i_716_ && i_722_ <= i_717_) {
			int i_723_ = anIntArray9054[i_720_] - i_695_;
			if (i_723_ >= i_718_ && i_723_ <= i_719_) {
			    int i_724_ = -1;
			    int i_725_ = anIntArray9046[i_720_];
			    int i_726_ = anIntArray9046[i_720_ + 1];
			    for (int i_727_ = i_725_;
				 (i_727_ < i_726_
				  && aShortArray9096[i_727_] != 0);
				 i_727_++) {
				i_724_
				    = (aShortArray9096[i_727_] & 0xffff) - 1;
				if (aByteArray9061[i_724_] != 0)
				    break;
			    }
			    if (i_724_ != -1) {
				for (int i_728_ = 0; i_728_ < i_697_;
				     i_728_++) {
				    if (i_722_ == is[i_728_]
					&& i_723_ == is_699_[i_728_]
					&& i_721_ == is_698_[i_728_]) {
					int i_729_ = -1;
					i_725_ = is_712_[i_728_];
					i_726_ = is_712_[i_728_ + 1];
					for (int i_730_ = i_725_;
					     (i_730_ < i_726_
					      && is_713_[i_730_] != 0);
					     i_730_++) {
					    i_729_ = (is_713_[i_730_]
						      & 0xffff) - 1;
					    if (is_703_[i_729_] != 0)
						break;
					}
					if (i_729_ != -1) {
					    if (is_704_ == null) {
						aClass145_9063
						    = new Class145();
						is_704_
						    = aClass145_9063
							  .aShortArray1672
						    = (Class457.method7467
						       (aShortArray9073,
							-1856587263));
						is_705_
						    = aClass145_9063
							  .aShortArray1671
						    = (Class457.method7467
						       (aShortArray9059,
							-1811826009));
						is_706_
						    = aClass145_9063
							  .aShortArray1669
						    = (Class457.method7467
						       (aShortArray9060,
							-1049680550));
						is_707_
						    = aClass145_9063
							  .aByteArray1670
						    = (Class509.method8501
						       (aByteArray9061,
							-1434305375));
					    }
					    if (is_708_ == null) {
						Class145 class145
						    = (class179_sub1_696_
							   .aClass145_9063
						       = new Class145());
						is_708_
						    = class145.aShortArray1672
						    = (Class457.method7467
						       (is_700_, 1226027315));
						is_709_
						    = class145.aShortArray1671
						    = (Class457.method7467
						       (is_701_, 1719086415));
						is_710_
						    = class145.aShortArray1669
						    = (Class457.method7467
						       (is_702_, -702784653));
						is_711_
						    = class145.aByteArray1670
						    = (Class509.method8501
						       (is_703_, -1157480529));
					    }
					    short i_731_
						= aShortArray9073[i_724_];
					    short i_732_
						= aShortArray9059[i_724_];
					    short i_733_
						= aShortArray9060[i_724_];
					    byte i_734_
						= aByteArray9061[i_724_];
					    i_725_ = is_712_[i_728_];
					    i_726_ = is_712_[i_728_ + 1];
					    for (int i_735_ = i_725_;
						 i_735_ < i_726_; i_735_++) {
						int i_736_
						    = is_713_[i_735_] - 1;
						if (i_736_ == -1)
						    break;
						if (is_711_[i_736_] != 0) {
						    is_708_[i_736_] += i_731_;
						    is_709_[i_736_] += i_732_;
						    is_710_[i_736_] += i_733_;
						    is_711_[i_736_] += i_734_;
						}
					    }
					    i_731_ = is_700_[i_729_];
					    i_732_ = is_701_[i_729_];
					    i_733_ = is_702_[i_729_];
					    i_734_ = is_703_[i_729_];
					    i_725_ = anIntArray9046[i_720_];
					    i_726_
						= anIntArray9046[i_720_ + 1];
					    for (int i_737_ = i_725_;
						 (i_737_ < i_726_
						  && (aShortArray9096[i_737_]
						      != 0));
						 i_737_++) {
						int i_738_
						    = ((aShortArray9096[i_737_]
							& 0xffff)
						       - 1);
						if (is_707_[i_738_] != 0) {
						    is_704_[i_738_] += i_731_;
						    is_705_[i_738_] += i_732_;
						    is_706_[i_738_] += i_733_;
						    is_707_[i_738_] += i_734_;
						}
					    }
					    if (aClass137_9051 == null
						&& aClass137_9076 != null)
						aClass137_9076
						    .anInterface15_1635
						    = null;
					    if (aClass137_9051 != null)
						aClass137_9051
						    .anInterface15_1635
						    = null;
					    if ((class179_sub1_696_
						 .aClass137_9051) == null
						&& (class179_sub1_696_
						    .aClass137_9076) != null)
						class179_sub1_696_
						    .aClass137_9076
						    .anInterface15_1635
						    = null;
					    if ((class179_sub1_696_
						 .aClass137_9051)
						!= null)
						class179_sub1_696_
						    .aClass137_9051
						    .anInterface15_1635
						    = null;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method2993(int i) {
	int i_739_ = Class436.anIntArray4831[i];
	int i_740_ = Class436.anIntArray4838[i];
	for (int i_741_ = 0; i_741_ < anInt9072; i_741_++) {
	    int i_742_ = ((anIntArray9054[i_741_] * i_739_
			   + anIntArray9052[i_741_] * i_740_)
			  >> 14);
	    anIntArray9054[i_741_] = (anIntArray9054[i_741_] * i_740_
				      - anIntArray9052[i_741_] * i_739_) >> 14;
	    anIntArray9052[i_741_] = i_742_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public Class179 method2985(byte i, int i_743_, boolean bool) {
	boolean bool_744_ = false;
	Class179_Sub1 class179_sub1_745_;
	Class179_Sub1 class179_sub1_746_;
	if (i > 0 && i <= 8) {
	    class179_sub1_746_
		= aClass182_Sub3_9041.aClass179_Sub1Array9781[i - 1];
	    class179_sub1_745_
		= aClass182_Sub3_9041.aClass179_Sub1Array9642[i - 1];
	    bool_744_ = true;
	} else
	    class179_sub1_745_ = class179_sub1_746_
		= new Class179_Sub1(aClass182_Sub3_9041);
	return method14554(class179_sub1_745_, class179_sub1_746_, i_743_,
			   bool_744_, bool);
    }
    
    public int method2986() {
	return anInt9043;
    }
    
    public void method3036(int i) {
	int i_747_ = Class436.anIntArray4831[i];
	int i_748_ = Class436.anIntArray4838[i];
	for (int i_749_ = 0; i_749_ < anInt9072; i_749_++) {
	    int i_750_ = ((anIntArray9069[i_749_] * i_748_
			   - anIntArray9054[i_749_] * i_747_)
			  >> 14);
	    anIntArray9054[i_749_] = (anIntArray9069[i_749_] * i_747_
				      + anIntArray9054[i_749_] * i_748_) >> 14;
	    anIntArray9069[i_749_] = i_750_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public int method3002() {
	if (!aBool9085)
	    method14558();
	return aShort9090;
    }
    
    public int method3078() {
	return anInt9043;
    }
    
    public void method2990(int i) {
	anInt9043 = i;
	if (aClass145_9063 != null && (anInt9043 & 0x10000) == 0) {
	    aShortArray9073 = aClass145_9063.aShortArray1672;
	    aShortArray9059 = aClass145_9063.aShortArray1671;
	    aShortArray9060 = aClass145_9063.aShortArray1669;
	    aByteArray9061 = aClass145_9063.aByteArray1670;
	    aClass145_9063 = null;
	}
	aBool9095 = true;
	method14590();
    }
    
    public void method2991() {
	if (anInt9057 > 0 && anInt9111 > 0) {
	    method14564(false);
	    if ((aByte9037 & 0x10) == 0
		&& aClass139_9079.anInterface16_1642 == null)
		method14563(false);
	    method14590();
	}
    }
    
    void method14567() {
	if (anInt9111 != 0) {
	    if (aByte9037 != 0)
		method14564(true);
	    method14564(false);
	    if (aClass139_9079 != null) {
		if (aClass139_9079.anInterface16_1642 == null)
		    method14563((aByte9037 & 0x10) != 0);
		if (aClass139_9079.anInterface16_1642 != null) {
		    aClass182_Sub3_9041.method15404(aClass137_9051 != null);
		    aClass182_Sub3_9041.method15384(aClass137_9075,
						    aClass137_9051,
						    aClass137_9076,
						    aClass137_9078);
		    int i = anIntArray9094.length - 1;
		    for (int i_751_ = 0; i_751_ < i; i_751_++) {
			int i_752_ = anIntArray9094[i_751_];
			int i_753_ = anIntArray9094[i_751_ + 1];
			int i_754_ = (aShortArray9039[i_752_] == -1 ? -1
				      : aShortArray9039[i_752_] & 0xffff);
			aClass182_Sub3_9041
			    .method15446(i_754_, aClass137_9051 != null);
			aClass182_Sub3_9041.method15427((aClass139_9079
							 .anInterface16_1642),
							4, i_752_ * 3,
							(i_753_ - i_752_) * 3);
		    }
		}
	    }
	    method14590();
	}
    }
    
    void method2948(int i, int[] is, int i_755_, int i_756_, int i_757_,
		    int i_758_, boolean bool) {
	int i_759_ = is.length;
	if (i == 0) {
	    i_755_ <<= 4;
	    i_756_ <<= 4;
	    i_757_ <<= 4;
	    int i_760_ = 0;
	    anInt9108 = 0;
	    anInt9109 = 0;
	    anInt9050 = 0;
	    for (int i_761_ = 0; i_761_ < i_759_; i_761_++) {
		int i_762_ = is[i_761_];
		if (i_762_ < anIntArrayArray9055.length) {
		    int[] is_763_ = anIntArrayArray9055[i_762_];
		    for (int i_764_ = 0; i_764_ < is_763_.length; i_764_++) {
			int i_765_ = is_763_[i_764_];
			anInt9108 += anIntArray9052[i_765_];
			anInt9109 += anIntArray9069[i_765_];
			anInt9050 += anIntArray9054[i_765_];
			i_760_++;
		    }
		}
	    }
	    if (i_760_ > 0) {
		anInt9108 = anInt9108 / i_760_ + i_755_;
		anInt9109 = anInt9109 / i_760_ + i_756_;
		anInt9050 = anInt9050 / i_760_ + i_757_;
	    } else {
		anInt9108 = i_755_;
		anInt9109 = i_756_;
		anInt9050 = i_757_;
	    }
	} else if (i == 1) {
	    i_755_ <<= 4;
	    i_756_ <<= 4;
	    i_757_ <<= 4;
	    for (int i_766_ = 0; i_766_ < i_759_; i_766_++) {
		int i_767_ = is[i_766_];
		if (i_767_ < anIntArrayArray9055.length) {
		    int[] is_768_ = anIntArrayArray9055[i_767_];
		    for (int i_769_ = 0; i_769_ < is_768_.length; i_769_++) {
			int i_770_ = is_768_[i_769_];
			anIntArray9052[i_770_] += i_755_;
			anIntArray9069[i_770_] += i_756_;
			anIntArray9054[i_770_] += i_757_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_771_ = 0; i_771_ < i_759_; i_771_++) {
		int i_772_ = is[i_771_];
		if (i_772_ < anIntArrayArray9055.length) {
		    int[] is_773_ = anIntArrayArray9055[i_772_];
		    if ((i_758_ & 0x1) == 0) {
			for (int i_774_ = 0; i_774_ < is_773_.length;
			     i_774_++) {
			    int i_775_ = is_773_[i_774_];
			    anIntArray9052[i_775_] -= anInt9108;
			    anIntArray9069[i_775_] -= anInt9109;
			    anIntArray9054[i_775_] -= anInt9050;
			    if (i_757_ != 0) {
				int i_776_ = Class436.anIntArray4831[i_757_];
				int i_777_ = Class436.anIntArray4838[i_757_];
				int i_778_ = (anIntArray9069[i_775_] * i_776_
					      + anIntArray9052[i_775_] * i_777_
					      + 16383) >> 14;
				anIntArray9069[i_775_]
				    = (anIntArray9069[i_775_] * i_777_
				       - anIntArray9052[i_775_] * i_776_
				       + 16383) >> 14;
				anIntArray9052[i_775_] = i_778_;
			    }
			    if (i_755_ != 0) {
				int i_779_ = Class436.anIntArray4831[i_755_];
				int i_780_ = Class436.anIntArray4838[i_755_];
				int i_781_ = (anIntArray9069[i_775_] * i_780_
					      - anIntArray9054[i_775_] * i_779_
					      + 16383) >> 14;
				anIntArray9054[i_775_]
				    = (anIntArray9069[i_775_] * i_779_
				       + anIntArray9054[i_775_] * i_780_
				       + 16383) >> 14;
				anIntArray9069[i_775_] = i_781_;
			    }
			    if (i_756_ != 0) {
				int i_782_ = Class436.anIntArray4831[i_756_];
				int i_783_ = Class436.anIntArray4838[i_756_];
				int i_784_ = (anIntArray9054[i_775_] * i_782_
					      + anIntArray9052[i_775_] * i_783_
					      + 16383) >> 14;
				anIntArray9054[i_775_]
				    = (anIntArray9054[i_775_] * i_783_
				       - anIntArray9052[i_775_] * i_782_
				       + 16383) >> 14;
				anIntArray9052[i_775_] = i_784_;
			    }
			    anIntArray9052[i_775_] += anInt9108;
			    anIntArray9069[i_775_] += anInt9109;
			    anIntArray9054[i_775_] += anInt9050;
			}
		    } else {
			for (int i_785_ = 0; i_785_ < is_773_.length;
			     i_785_++) {
			    int i_786_ = is_773_[i_785_];
			    anIntArray9052[i_786_] -= anInt9108;
			    anIntArray9069[i_786_] -= anInt9109;
			    anIntArray9054[i_786_] -= anInt9050;
			    if (i_755_ != 0) {
				int i_787_ = Class436.anIntArray4831[i_755_];
				int i_788_ = Class436.anIntArray4838[i_755_];
				int i_789_ = (anIntArray9069[i_786_] * i_788_
					      - anIntArray9054[i_786_] * i_787_
					      + 16383) >> 14;
				anIntArray9054[i_786_]
				    = (anIntArray9069[i_786_] * i_787_
				       + anIntArray9054[i_786_] * i_788_
				       + 16383) >> 14;
				anIntArray9069[i_786_] = i_789_;
			    }
			    if (i_757_ != 0) {
				int i_790_ = Class436.anIntArray4831[i_757_];
				int i_791_ = Class436.anIntArray4838[i_757_];
				int i_792_ = (anIntArray9069[i_786_] * i_790_
					      + anIntArray9052[i_786_] * i_791_
					      + 16383) >> 14;
				anIntArray9069[i_786_]
				    = (anIntArray9069[i_786_] * i_791_
				       - anIntArray9052[i_786_] * i_790_
				       + 16383) >> 14;
				anIntArray9052[i_786_] = i_792_;
			    }
			    if (i_756_ != 0) {
				int i_793_ = Class436.anIntArray4831[i_756_];
				int i_794_ = Class436.anIntArray4838[i_756_];
				int i_795_ = (anIntArray9054[i_786_] * i_793_
					      + anIntArray9052[i_786_] * i_794_
					      + 16383) >> 14;
				anIntArray9054[i_786_]
				    = (anIntArray9054[i_786_] * i_794_
				       - anIntArray9052[i_786_] * i_793_
				       + 16383) >> 14;
				anIntArray9052[i_786_] = i_795_;
			    }
			    anIntArray9052[i_786_] += anInt9108;
			    anIntArray9069[i_786_] += anInt9109;
			    anIntArray9054[i_786_] += anInt9050;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_796_ = 0; i_796_ < i_759_; i_796_++) {
		    int i_797_ = is[i_796_];
		    if (i_797_ < anIntArrayArray9055.length) {
			int[] is_798_ = anIntArrayArray9055[i_797_];
			for (int i_799_ = 0; i_799_ < is_798_.length;
			     i_799_++) {
			    int i_800_ = is_798_[i_799_];
			    int i_801_ = anIntArray9046[i_800_];
			    int i_802_ = anIntArray9046[i_800_ + 1];
			    for (int i_803_ = i_801_;
				 (i_803_ < i_802_
				  && aShortArray9096[i_803_] != 0);
				 i_803_++) {
				int i_804_
				    = (aShortArray9096[i_803_] & 0xffff) - 1;
				if (i_757_ != 0) {
				    int i_805_
					= Class436.anIntArray4831[i_757_];
				    int i_806_
					= Class436.anIntArray4838[i_757_];
				    int i_807_
					= ((aShortArray9059[i_804_] * i_805_
					    + aShortArray9073[i_804_] * i_806_
					    + 16383)
					   >> 14);
				    aShortArray9059[i_804_]
					= (short) (((aShortArray9059[i_804_]
						     * i_806_)
						    - (aShortArray9073[i_804_]
						       * i_805_)
						    + 16383)
						   >> 14);
				    aShortArray9073[i_804_] = (short) i_807_;
				}
				if (i_755_ != 0) {
				    int i_808_
					= Class436.anIntArray4831[i_755_];
				    int i_809_
					= Class436.anIntArray4838[i_755_];
				    int i_810_
					= ((aShortArray9059[i_804_] * i_809_
					    - aShortArray9060[i_804_] * i_808_
					    + 16383)
					   >> 14);
				    aShortArray9060[i_804_]
					= (short) (((aShortArray9059[i_804_]
						     * i_808_)
						    + (aShortArray9060[i_804_]
						       * i_809_)
						    + 16383)
						   >> 14);
				    aShortArray9059[i_804_] = (short) i_810_;
				}
				if (i_756_ != 0) {
				    int i_811_
					= Class436.anIntArray4831[i_756_];
				    int i_812_
					= Class436.anIntArray4838[i_756_];
				    int i_813_
					= ((aShortArray9060[i_804_] * i_811_
					    + aShortArray9073[i_804_] * i_812_
					    + 16383)
					   >> 14);
				    aShortArray9060[i_804_]
					= (short) (((aShortArray9060[i_804_]
						     * i_812_)
						    - (aShortArray9073[i_804_]
						       * i_811_)
						    + 16383)
						   >> 14);
				    aShortArray9073[i_804_] = (short) i_813_;
				}
			    }
			}
		    }
		}
		if (aClass137_9051 == null && aClass137_9076 != null)
		    aClass137_9076.anInterface15_1635 = null;
		if (aClass137_9051 != null)
		    aClass137_9051.anInterface15_1635 = null;
	    }
	} else if (i == 3) {
	    for (int i_814_ = 0; i_814_ < i_759_; i_814_++) {
		int i_815_ = is[i_814_];
		if (i_815_ < anIntArrayArray9055.length) {
		    int[] is_816_ = anIntArrayArray9055[i_815_];
		    for (int i_817_ = 0; i_817_ < is_816_.length; i_817_++) {
			int i_818_ = is_816_[i_817_];
			anIntArray9052[i_818_] -= anInt9108;
			anIntArray9069[i_818_] -= anInt9109;
			anIntArray9054[i_818_] -= anInt9050;
			anIntArray9052[i_818_]
			    = anIntArray9052[i_818_] * i_755_ >> 7;
			anIntArray9069[i_818_]
			    = anIntArray9069[i_818_] * i_756_ >> 7;
			anIntArray9054[i_818_]
			    = anIntArray9054[i_818_] * i_757_ >> 7;
			anIntArray9052[i_818_] += anInt9108;
			anIntArray9069[i_818_] += anInt9109;
			anIntArray9054[i_818_] += anInt9050;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9048 != null) {
		for (int i_819_ = 0; i_819_ < i_759_; i_819_++) {
		    int i_820_ = is[i_819_];
		    if (i_820_ < anIntArrayArray9048.length) {
			int[] is_821_ = anIntArrayArray9048[i_820_];
			for (int i_822_ = 0; i_822_ < is_821_.length;
			     i_822_++) {
			    int i_823_ = is_821_[i_822_];
			    int i_824_
				= (aByteArray9068[i_823_] & 0xff) + i_755_ * 8;
			    if (i_824_ < 0)
				i_824_ = 0;
			    else if (i_824_ > 255)
				i_824_ = 255;
			    aByteArray9068[i_823_] = (byte) i_824_;
			}
			if (is_821_.length > 0 && aClass137_9076 != null)
			    aClass137_9076.anInterface15_1635 = null;
		    }
		}
		if (aClass148Array9100 != null) {
		    for (int i_825_ = 0; i_825_ < anInt9074; i_825_++) {
			Class148 class148 = aClass148Array9100[i_825_];
			Class131 class131 = aClass131Array9101[i_825_];
			class131.anInt1582
			    = (class131.anInt1582 & 0xffffff
			       | 255 - (aByteArray9068[class148.anInt1694]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9048 != null) {
		for (int i_826_ = 0; i_826_ < i_759_; i_826_++) {
		    int i_827_ = is[i_826_];
		    if (i_827_ < anIntArrayArray9048.length) {
			int[] is_828_ = anIntArrayArray9048[i_827_];
			for (int i_829_ = 0; i_829_ < is_828_.length;
			     i_829_++) {
			    int i_830_ = is_828_[i_829_];
			    int i_831_ = aShortArray9067[i_830_] & 0xffff;
			    int i_832_ = i_831_ >> 10 & 0x3f;
			    int i_833_ = i_831_ >> 7 & 0x7;
			    int i_834_ = i_831_ & 0x7f;
			    i_832_ = i_832_ + i_755_ & 0x3f;
			    i_833_ += i_756_ / 4;
			    if (i_833_ < 0)
				i_833_ = 0;
			    else if (i_833_ > 7)
				i_833_ = 7;
			    i_834_ += i_757_;
			    if (i_834_ < 0)
				i_834_ = 0;
			    else if (i_834_ > 127)
				i_834_ = 127;
			    aShortArray9067[i_830_]
				= (short) (i_832_ << 10 | i_833_ << 7
					   | i_834_);
			}
			if (is_828_.length > 0 && aClass137_9076 != null)
			    aClass137_9076.anInterface15_1635 = null;
		    }
		}
		if (aClass148Array9100 != null) {
		    for (int i_835_ = 0; i_835_ < anInt9074; i_835_++) {
			Class148 class148 = aClass148Array9100[i_835_];
			Class131 class131 = aClass131Array9101[i_835_];
			class131.anInt1582
			    = (class131.anInt1582 & ~0xffffff
			       | (Class642.anIntArray8324
				  [(aShortArray9067[class148.anInt1694]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9042 != null) {
		for (int i_836_ = 0; i_836_ < i_759_; i_836_++) {
		    int i_837_ = is[i_836_];
		    if (i_837_ < anIntArrayArray9042.length) {
			int[] is_838_ = anIntArrayArray9042[i_837_];
			for (int i_839_ = 0; i_839_ < is_838_.length;
			     i_839_++) {
			    Class131 class131
				= aClass131Array9101[is_838_[i_839_]];
			    class131.anInt1583 += i_755_;
			    class131.anInt1585 += i_756_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9042 != null) {
		for (int i_840_ = 0; i_840_ < i_759_; i_840_++) {
		    int i_841_ = is[i_840_];
		    if (i_841_ < anIntArrayArray9042.length) {
			int[] is_842_ = anIntArrayArray9042[i_841_];
			for (int i_843_ = 0; i_843_ < is_842_.length;
			     i_843_++) {
			    Class131 class131
				= aClass131Array9101[is_842_[i_843_]];
			    class131.anInt1581
				= class131.anInt1581 * i_755_ >> 7;
			    class131.anInt1584
				= class131.anInt1584 * i_756_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9042 != null) {
		for (int i_844_ = 0; i_844_ < i_759_; i_844_++) {
		    int i_845_ = is[i_844_];
		    if (i_845_ < anIntArrayArray9042.length) {
			int[] is_846_ = anIntArrayArray9042[i_845_];
			for (int i_847_ = 0; i_847_ < is_846_.length;
			     i_847_++) {
			    Class131 class131
				= aClass131Array9101[is_846_[i_847_]];
			    class131.anInt1586
				= class131.anInt1586 + i_755_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    public void method2994(int i) {
	int i_848_ = Class436.anIntArray4831[i];
	int i_849_ = Class436.anIntArray4838[i];
	for (int i_850_ = 0; i_850_ < anInt9072; i_850_++) {
	    int i_851_ = ((anIntArray9054[i_850_] * i_848_
			   + anIntArray9052[i_850_] * i_849_)
			  >> 14);
	    anIntArray9054[i_850_] = (anIntArray9054[i_850_] * i_849_
				      - anIntArray9052[i_850_] * i_848_) >> 14;
	    anIntArray9052[i_850_] = i_851_;
	}
	for (int i_852_ = 0; i_852_ < anInt9057; i_852_++) {
	    int i_853_ = ((aShortArray9060[i_852_] * i_848_
			   + aShortArray9073[i_852_] * i_849_)
			  >> 14);
	    aShortArray9060[i_852_]
		= (short) ((aShortArray9060[i_852_] * i_849_
			    - aShortArray9073[i_852_] * i_848_)
			   >> 14);
	    aShortArray9073[i_852_] = (short) i_853_;
	}
	if (aClass137_9051 == null && aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
	if (aClass137_9051 != null)
	    aClass137_9051.anInterface15_1635 = null;
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    void method14568(boolean bool) {
	boolean bool_854_ = (aClass137_9076 != null
			     && aClass137_9076.anInterface15_1635 == null);
	boolean bool_855_ = (aClass137_9051 != null
			     && aClass137_9051.anInterface15_1635 == null);
	boolean bool_856_ = (aClass137_9075 != null
			     && aClass137_9075.anInterface15_1635 == null);
	boolean bool_857_ = (aClass137_9078 != null
			     && aClass137_9078.anInterface15_1635 == null);
	if (bool) {
	    bool_854_ = bool_854_ & (aByte9037 & 0x2) != 0;
	    bool_855_ = bool_855_ & (aByte9037 & 0x4) != 0;
	    bool_856_ = bool_856_ & (aByte9037 & 0x1) != 0;
	    bool_857_ = bool_857_ & (aByte9037 & 0x8) != 0;
	}
	byte i = 0;
	byte i_858_ = 0;
	byte i_859_ = 0;
	byte i_860_ = 0;
	byte i_861_ = 0;
	if (bool_856_) {
	    i_858_ = i;
	    i += 12;
	}
	if (bool_854_) {
	    i_859_ = i;
	    i += 4;
	}
	if (bool_855_) {
	    i_860_ = i;
	    i += 12;
	}
	if (bool_857_) {
	    i_861_ = i;
	    i += 8;
	}
	if (i != 0) {
	    if ((aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
		 .buffer).length
		< anInt9057 * i)
		aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
		    = new Class525_Sub38_Sub1((anInt9057 + 100) * i);
	    else
		aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828.index = 0;
	    Class525_Sub38_Sub1 class525_sub38_sub1
		= aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828;
	    if (bool_856_) {
		if (aClass182_Sub3_9041.aBool9792) {
		    for (int i_862_ = 0; i_862_ < anInt9072; i_862_++) {
			int i_863_
			    = Stream.floatToRawIntBits((float) anIntArray9052
							       [i_862_]);
			int i_864_
			    = Stream.floatToRawIntBits((float) anIntArray9069
							       [i_862_]);
			int i_865_
			    = Stream.floatToRawIntBits((float) anIntArray9054
							       [i_862_]);
			int i_866_ = anIntArray9046[i_862_];
			int i_867_ = anIntArray9046[i_862_ + 1];
			for (int i_868_ = i_866_;
			     i_868_ < i_867_ && aShortArray9096[i_868_] != 0;
			     i_868_++) {
			    int i_869_
				= (aShortArray9096[i_868_] & 0xffff) - 1;
			    class525_sub38_sub1.index
				= i_869_ * i * 339428471;
			    class525_sub38_sub1.method16605(i_863_,
							    -1653620726);
			    class525_sub38_sub1.method16605(i_864_,
							    -1092079615);
			    class525_sub38_sub1.method16605(i_865_,
							    -1700908000);
			}
		    }
		} else {
		    for (int i_870_ = 0; i_870_ < anInt9072; i_870_++) {
			int i_871_
			    = Stream.floatToRawIntBits((float) anIntArray9052
							       [i_870_]);
			int i_872_
			    = Stream.floatToRawIntBits((float) anIntArray9069
							       [i_870_]);
			int i_873_
			    = Stream.floatToRawIntBits((float) anIntArray9054
							       [i_870_]);
			int i_874_ = anIntArray9046[i_870_];
			int i_875_ = anIntArray9046[i_870_ + 1];
			for (int i_876_ = i_874_;
			     i_876_ < i_875_ && aShortArray9096[i_876_] != 0;
			     i_876_++) {
			    int i_877_
				= (aShortArray9096[i_876_] & 0xffff) - 1;
			    class525_sub38_sub1.index
				= i_877_ * i * 339428471;
			    class525_sub38_sub1.method16606(i_871_, 129778038);
			    class525_sub38_sub1.method16606(i_872_,
							    -169763263);
			    class525_sub38_sub1.method16606(i_873_,
							    1502313331);
			}
		    }
		}
	    }
	    if (bool_854_) {
		if (aClass137_9051 == null) {
		    short[] is;
		    short[] is_878_;
		    short[] is_879_;
		    byte[] is_880_;
		    if (aClass145_9063 != null) {
			is = aClass145_9063.aShortArray1672;
			is_878_ = aClass145_9063.aShortArray1671;
			is_879_ = aClass145_9063.aShortArray1669;
			is_880_ = aClass145_9063.aByteArray1670;
		    } else {
			is = aShortArray9073;
			is_878_ = aShortArray9059;
			is_879_ = aShortArray9060;
			is_880_ = aByteArray9061;
		    }
		    float f = aClass182_Sub3_9041.aFloatArray9660[0];
		    float f_881_ = aClass182_Sub3_9041.aFloatArray9660[1];
		    float f_882_ = aClass182_Sub3_9041.aFloatArray9660[2];
		    float f_883_ = aClass182_Sub3_9041.aFloat9834;
		    float f_884_ = (aClass182_Sub3_9041.aFloat9759 * 768.0F
				    / (float) aShort9047);
		    float f_885_ = (aClass182_Sub3_9041.aFloat9631 * 768.0F
				    / (float) aShort9047);
		    for (int i_886_ = 0; i_886_ < anInt9065; i_886_++) {
			int i_887_
			    = method14565(aShortArray9067[i_886_],
					  aShortArray9039[i_886_], aShort9110,
					  aByteArray9068[i_886_]);
			float f_888_ = ((float) (i_887_ >>> 24)
					* aClass182_Sub3_9041.aFloat9755);
			float f_889_ = ((float) (i_887_ >> 16 & 0xff)
					* aClass182_Sub3_9041.aFloat9756);
			float f_890_ = ((float) (i_887_ >> 8 & 0xff)
					* aClass182_Sub3_9041.aFloat9708);
			int i_891_ = aShortArray9091[i_886_] & 0xffff;
			short i_892_ = (short) is_880_[i_891_];
			float f_893_;
			if (i_892_ == 0)
			    f_893_ = ((f * (float) is[i_891_]
				       + f_881_ * (float) is_878_[i_891_]
				       + f_882_ * (float) is_879_[i_891_])
				      * 0.0026041667F);
			else
			    f_893_ = ((f * (float) is[i_891_]
				       + f_881_ * (float) is_878_[i_891_]
				       + f_882_ * (float) is_879_[i_891_])
				      / (float) (i_892_ * 256));
			float f_894_ = f_883_ + f_893_ * (f_893_ < 0.0F
							  ? f_885_ : f_884_);
			int i_895_ = (int) (f_888_ * f_894_);
			if (i_895_ < 0)
			    i_895_ = 0;
			else if (i_895_ > 255)
			    i_895_ = 255;
			int i_896_ = (int) (f_889_ * f_894_);
			if (i_896_ < 0)
			    i_896_ = 0;
			else if (i_896_ > 255)
			    i_896_ = 255;
			int i_897_ = (int) (f_890_ * f_894_);
			if (i_897_ < 0)
			    i_897_ = 0;
			else if (i_897_ > 255)
			    i_897_ = 255;
			class525_sub38_sub1.index
			    = (i_859_ + i_891_ * i) * 339428471;
			class525_sub38_sub1.method16735(i_895_, -1346282276);
			class525_sub38_sub1.method16735(i_896_, -1582313366);
			class525_sub38_sub1.method16735(i_897_, -150882123);
			class525_sub38_sub1.method16735(255 - ((aByteArray9068
								[i_886_])
							       & 0xff),
							-514845647);
			i_891_ = aShortArray9070[i_886_] & 0xffff;
			i_892_ = (short) is_880_[i_891_];
			if (i_892_ == 0)
			    f_893_ = ((f * (float) is[i_891_]
				       + f_881_ * (float) is_878_[i_891_]
				       + f_882_ * (float) is_879_[i_891_])
				      * 0.0026041667F);
			else
			    f_893_ = ((f * (float) is[i_891_]
				       + f_881_ * (float) is_878_[i_891_]
				       + f_882_ * (float) is_879_[i_891_])
				      / (float) (i_892_ * 256));
			f_894_ = f_883_ + f_893_ * (f_893_ < 0.0F ? f_885_
						    : f_884_);
			i_895_ = (int) (f_888_ * f_894_);
			if (i_895_ < 0)
			    i_895_ = 0;
			else if (i_895_ > 255)
			    i_895_ = 255;
			i_896_ = (int) (f_889_ * f_894_);
			if (i_896_ < 0)
			    i_896_ = 0;
			else if (i_896_ > 255)
			    i_896_ = 255;
			i_897_ = (int) (f_890_ * f_894_);
			if (i_897_ < 0)
			    i_897_ = 0;
			else if (i_897_ > 255)
			    i_897_ = 255;
			class525_sub38_sub1.index
			    = (i_859_ + i_891_ * i) * 339428471;
			class525_sub38_sub1.method16735(i_895_, -1921443479);
			class525_sub38_sub1.method16735(i_896_, -569161978);
			class525_sub38_sub1.method16735(i_897_, -489067531);
			class525_sub38_sub1.method16735(255 - ((aByteArray9068
								[i_886_])
							       & 0xff),
							-1562328850);
			i_891_ = aShortArray9071[i_886_] & 0xffff;
			i_892_ = (short) is_880_[i_891_];
			if (i_892_ == 0)
			    f_893_ = ((f * (float) is[i_891_]
				       + f_881_ * (float) is_878_[i_891_]
				       + f_882_ * (float) is_879_[i_891_])
				      * 0.0026041667F);
			else
			    f_893_ = ((f * (float) is[i_891_]
				       + f_881_ * (float) is_878_[i_891_]
				       + f_882_ * (float) is_879_[i_891_])
				      / (float) (i_892_ * 256));
			f_894_ = f_883_ + f_893_ * (f_893_ < 0.0F ? f_885_
						    : f_884_);
			i_895_ = (int) (f_888_ * f_894_);
			if (i_895_ < 0)
			    i_895_ = 0;
			else if (i_895_ > 255)
			    i_895_ = 255;
			i_896_ = (int) (f_889_ * f_894_);
			if (i_896_ < 0)
			    i_896_ = 0;
			else if (i_896_ > 255)
			    i_896_ = 255;
			i_897_ = (int) (f_890_ * f_894_);
			if (i_897_ < 0)
			    i_897_ = 0;
			else if (i_897_ > 255)
			    i_897_ = 255;
			class525_sub38_sub1.index
			    = (i_859_ + i_891_ * i) * 339428471;
			class525_sub38_sub1.method16735(i_895_, -258462870);
			class525_sub38_sub1.method16735(i_896_, -1436326690);
			class525_sub38_sub1.method16735(i_897_, -379124920);
			class525_sub38_sub1.method16735(255 - ((aByteArray9068
								[i_886_])
							       & 0xff),
							-646009555);
		    }
		} else {
		    for (int i_898_ = 0; i_898_ < anInt9065; i_898_++) {
			int i_899_
			    = method14565(aShortArray9067[i_898_],
					  aShortArray9039[i_898_], aShort9110,
					  aByteArray9068[i_898_]);
			class525_sub38_sub1.index
			    = ((i_859_
				+ (aShortArray9091[i_898_] & 0xffff) * i)
			       * 339428471);
			class525_sub38_sub1.method16605(i_899_, -1036913018);
			class525_sub38_sub1.index
			    = ((i_859_
				+ (aShortArray9070[i_898_] & 0xffff) * i)
			       * 339428471);
			class525_sub38_sub1.method16605(i_899_, -228485403);
			class525_sub38_sub1.index
			    = ((i_859_
				+ (aShortArray9071[i_898_] & 0xffff) * i)
			       * 339428471);
			class525_sub38_sub1.method16605(i_899_, -529175197);
		    }
		}
	    }
	    if (bool_855_) {
		short[] is;
		short[] is_900_;
		short[] is_901_;
		byte[] is_902_;
		if (aClass145_9063 != null) {
		    is = aClass145_9063.aShortArray1672;
		    is_900_ = aClass145_9063.aShortArray1671;
		    is_901_ = aClass145_9063.aShortArray1669;
		    is_902_ = aClass145_9063.aByteArray1670;
		} else {
		    is = aShortArray9073;
		    is_900_ = aShortArray9059;
		    is_901_ = aShortArray9060;
		    is_902_ = aByteArray9061;
		}
		float f = 3.0F / (float) aShort9047;
		float f_903_ = 3.0F / (float) (aShort9047 + aShort9047 / 2);
		class525_sub38_sub1.index = i_860_ * 339428471;
		if (aClass182_Sub3_9041.aBool9792) {
		    for (int i_904_ = 0; i_904_ < anInt9057; i_904_++) {
			int i_905_ = is_902_[i_904_] & 0xff;
			if (i_905_ == 0) {
			    class525_sub38_sub1
				.method18263((float) is[i_904_] * f_903_);
			    class525_sub38_sub1
				.method18263((float) is_900_[i_904_] * f_903_);
			    class525_sub38_sub1
				.method18263((float) is_901_[i_904_] * f_903_);
			} else {
			    float f_906_ = f / (float) i_905_;
			    class525_sub38_sub1
				.method18263((float) is[i_904_] * f_906_);
			    class525_sub38_sub1
				.method18263((float) is_900_[i_904_] * f_906_);
			    class525_sub38_sub1
				.method18263((float) is_901_[i_904_] * f_906_);
			}
			class525_sub38_sub1.index += (i - 12) * 339428471;
		    }
		} else {
		    for (int i_907_ = 0; i_907_ < anInt9057; i_907_++) {
			int i_908_ = is_902_[i_907_] & 0xff;
			if (i_908_ == 0) {
			    class525_sub38_sub1
				.method18262((float) is[i_907_] * f_903_);
			    class525_sub38_sub1
				.method18262((float) is_900_[i_907_] * f_903_);
			    class525_sub38_sub1
				.method18262((float) is_901_[i_907_] * f_903_);
			} else {
			    float f_909_ = f / (float) i_908_;
			    class525_sub38_sub1
				.method18262((float) is[i_907_] * f_909_);
			    class525_sub38_sub1
				.method18262((float) is_900_[i_907_] * f_909_);
			    class525_sub38_sub1
				.method18262((float) is_901_[i_907_] * f_909_);
			}
			class525_sub38_sub1.index += (i - 12) * 339428471;
		    }
		}
	    }
	    if (bool_857_) {
		class525_sub38_sub1.index = i_861_ * 339428471;
		if (aClass182_Sub3_9041.aBool9792) {
		    for (int i_910_ = 0; i_910_ < anInt9057; i_910_++) {
			class525_sub38_sub1
			    .method18263(aFloatArray9058[i_910_]);
			class525_sub38_sub1
			    .method18263(aFloatArray9064[i_910_]);
			class525_sub38_sub1.index += (i - 8) * 339428471;
		    }
		} else {
		    for (int i_911_ = 0; i_911_ < anInt9057; i_911_++) {
			class525_sub38_sub1
			    .method18262(aFloatArray9058[i_911_]);
			class525_sub38_sub1
			    .method18262(aFloatArray9064[i_911_]);
			class525_sub38_sub1.index += (i - 8) * 339428471;
		    }
		}
	    }
	    class525_sub38_sub1.index = i * anInt9057 * 339428471;
	    Interface15 interface15;
	    if (bool) {
		if (anInterface15_9081 == null)
		    anInterface15_9081
			= (aClass182_Sub3_9041.method15533
			   (i, class525_sub38_sub1.buffer,
			    class525_sub38_sub1.index * -1133521593,
			    true));
		else
		    anInterface15_9081.method78(i,
						(class525_sub38_sub1
						 .buffer),
						(class525_sub38_sub1.index
						 * -1133521593));
		interface15 = anInterface15_9081;
		aByte9037 = (byte) 0;
	    } else {
		interface15
		    = (aClass182_Sub3_9041.method15533
		       (i, class525_sub38_sub1.buffer,
			class525_sub38_sub1.index * -1133521593, false));
		aBool9095 = true;
	    }
	    if (bool_856_) {
		aClass137_9075.anInterface15_1635 = interface15;
		aClass137_9075.aByte1634 = i_858_;
	    }
	    if (bool_857_) {
		aClass137_9078.anInterface15_1635 = interface15;
		aClass137_9078.aByte1634 = i_861_;
	    }
	    if (bool_854_) {
		aClass137_9076.anInterface15_1635 = interface15;
		aClass137_9076.aByte1634 = i_859_;
	    }
	    if (bool_855_) {
		aClass137_9051.anInterface15_1635 = interface15;
		aClass137_9051.aByte1634 = i_860_;
	    }
	}
    }
    
    public void method2935(int i) {
	int i_912_ = Class436.anIntArray4831[i];
	int i_913_ = Class436.anIntArray4838[i];
	for (int i_914_ = 0; i_914_ < anInt9072; i_914_++) {
	    int i_915_ = ((anIntArray9054[i_914_] * i_912_
			   + anIntArray9052[i_914_] * i_913_)
			  >> 14);
	    anIntArray9054[i_914_] = (anIntArray9054[i_914_] * i_913_
				      - anIntArray9052[i_914_] * i_912_) >> 14;
	    anIntArray9052[i_914_] = i_915_;
	}
	for (int i_916_ = 0; i_916_ < anInt9057; i_916_++) {
	    int i_917_ = ((aShortArray9060[i_916_] * i_912_
			   + aShortArray9073[i_916_] * i_913_)
			  >> 14);
	    aShortArray9060[i_916_]
		= (short) ((aShortArray9060[i_916_] * i_913_
			    - aShortArray9073[i_916_] * i_912_)
			   >> 14);
	    aShortArray9073[i_916_] = (short) i_917_;
	}
	if (aClass137_9051 == null && aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
	if (aClass137_9051 != null)
	    aClass137_9051.anInterface15_1635 = null;
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method3084(int i) {
	int i_918_ = Class436.anIntArray4831[i];
	int i_919_ = Class436.anIntArray4838[i];
	for (int i_920_ = 0; i_920_ < anInt9072; i_920_++) {
	    int i_921_ = ((anIntArray9069[i_920_] * i_919_
			   - anIntArray9054[i_920_] * i_918_)
			  >> 14);
	    anIntArray9054[i_920_] = (anIntArray9069[i_920_] * i_918_
				      + anIntArray9054[i_920_] * i_919_) >> 14;
	    anIntArray9069[i_920_] = i_921_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    Class179_Sub1(Class182_Sub3 class182_sub3) {
	anInt9057 = 0;
	anInt9065 = 0;
	anInt9111 = 0;
	aBool9095 = true;
	aBool9085 = false;
	aBool9092 = false;
	aClass182_Sub3_9041 = class182_sub3;
	aClass137_9075 = new Class137(null, 5126, 3, 0);
	aClass137_9078 = new Class137(null, 5126, 2, 0);
	aClass137_9051 = new Class137(null, 5126, 3, 0);
	aClass137_9076 = new Class137(null, 5121, 4, 0);
	aClass139_9079 = new Class139();
    }
    
    public void method2999(int i) {
	int i_922_ = Class436.anIntArray4831[i];
	int i_923_ = Class436.anIntArray4838[i];
	for (int i_924_ = 0; i_924_ < anInt9072; i_924_++) {
	    int i_925_ = ((anIntArray9069[i_924_] * i_923_
			   - anIntArray9054[i_924_] * i_922_)
			  >> 14);
	    anIntArray9054[i_924_] = (anIntArray9069[i_924_] * i_922_
				      + anIntArray9054[i_924_] * i_923_) >> 14;
	    anIntArray9069[i_924_] = i_925_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public int method3051() {
	if (!aBool9085)
	    method14558();
	return aShort9089;
    }
    
    public void method3062(int i) {
	int i_926_ = Class436.anIntArray4831[i];
	int i_927_ = Class436.anIntArray4838[i];
	for (int i_928_ = 0; i_928_ < anInt9072; i_928_++) {
	    int i_929_ = ((anIntArray9069[i_928_] * i_926_
			   + anIntArray9052[i_928_] * i_927_)
			  >> 14);
	    anIntArray9069[i_928_] = (anIntArray9069[i_928_] * i_927_
				      - anIntArray9052[i_928_] * i_926_) >> 14;
	    anIntArray9052[i_928_] = i_929_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method3011(int i) {
	int i_930_ = Class436.anIntArray4831[i];
	int i_931_ = Class436.anIntArray4838[i];
	for (int i_932_ = 0; i_932_ < anInt9072; i_932_++) {
	    int i_933_ = ((anIntArray9069[i_932_] * i_930_
			   + anIntArray9052[i_932_] * i_931_)
			  >> 14);
	    anIntArray9069[i_932_] = (anIntArray9069[i_932_] * i_931_
				      - anIntArray9052[i_932_] * i_930_) >> 14;
	    anIntArray9052[i_932_] = i_933_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method3004(int i) {
	int i_934_ = Class436.anIntArray4831[i];
	int i_935_ = Class436.anIntArray4838[i];
	for (int i_936_ = 0; i_936_ < anInt9072; i_936_++) {
	    int i_937_ = ((anIntArray9069[i_936_] * i_934_
			   + anIntArray9052[i_936_] * i_935_)
			  >> 14);
	    anIntArray9069[i_936_] = (anIntArray9069[i_936_] * i_935_
				      - anIntArray9052[i_936_] * i_934_) >> 14;
	    anIntArray9052[i_936_] = i_937_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public int method2960() {
	if (!aBool9085)
	    method14558();
	return aShort9086;
    }
    
    public int method3106() {
	if (!aBool9085)
	    method14558();
	return aShort9088;
    }
    
    public Class184[] method3060() {
	return aClass184Array9097;
    }
    
    void method3007() {
	/* empty */
    }
    
    public void method3114(int i, int i_938_, int i_939_, int i_940_) {
	for (int i_941_ = 0; i_941_ < anInt9065; i_941_++) {
	    int i_942_ = aShortArray9067[i_941_] & 0xffff;
	    int i_943_ = i_942_ >> 10 & 0x3f;
	    int i_944_ = i_942_ >> 7 & 0x7;
	    int i_945_ = i_942_ & 0x7f;
	    if (i != -1)
		i_943_ += (i - i_943_) * i_940_ >> 7;
	    if (i_938_ != -1)
		i_944_ += (i_938_ - i_944_) * i_940_ >> 7;
	    if (i_939_ != -1)
		i_945_ += (i_939_ - i_945_) * i_940_ >> 7;
	    aShortArray9067[i_941_]
		= (short) (i_943_ << 10 | i_944_ << 7 | i_945_);
	}
	if (aClass148Array9100 != null) {
	    for (int i_946_ = 0; i_946_ < anInt9074; i_946_++) {
		Class148 class148 = aClass148Array9100[i_946_];
		Class131 class131 = aClass131Array9101[i_946_];
		class131.anInt1582
		    = (class131.anInt1582 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9067[class148.anInt1694] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    boolean method2919() {
	if (anIntArrayArray9055 == null)
	    return false;
	for (int i = 0; i < anInt9062; i++) {
	    anIntArray9052[i] <<= 4;
	    anIntArray9069[i] <<= 4;
	    anIntArray9054[i] <<= 4;
	}
	anInt9108 = 0;
	anInt9109 = 0;
	anInt9050 = 0;
	return true;
    }
    
    public int method3035() {
	if (!aBool9085)
	    method14558();
	return aShort9090;
    }
    
    void method3108() {
	for (int i = 0; i < anInt9062; i++) {
	    anIntArray9052[i] = anIntArray9052[i] + 7 >> 4;
	    anIntArray9069[i] = anIntArray9069[i] + 7 >> 4;
	    anIntArray9054[i] = anIntArray9054[i] + 7 >> 4;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    void method3012(int i, int[] is, int i_947_, int i_948_, int i_949_,
		    int i_950_, boolean bool) {
	int i_951_ = is.length;
	if (i == 0) {
	    i_947_ <<= 4;
	    i_948_ <<= 4;
	    i_949_ <<= 4;
	    int i_952_ = 0;
	    anInt9108 = 0;
	    anInt9109 = 0;
	    anInt9050 = 0;
	    for (int i_953_ = 0; i_953_ < i_951_; i_953_++) {
		int i_954_ = is[i_953_];
		if (i_954_ < anIntArrayArray9055.length) {
		    int[] is_955_ = anIntArrayArray9055[i_954_];
		    for (int i_956_ = 0; i_956_ < is_955_.length; i_956_++) {
			int i_957_ = is_955_[i_956_];
			anInt9108 += anIntArray9052[i_957_];
			anInt9109 += anIntArray9069[i_957_];
			anInt9050 += anIntArray9054[i_957_];
			i_952_++;
		    }
		}
	    }
	    if (i_952_ > 0) {
		anInt9108 = anInt9108 / i_952_ + i_947_;
		anInt9109 = anInt9109 / i_952_ + i_948_;
		anInt9050 = anInt9050 / i_952_ + i_949_;
	    } else {
		anInt9108 = i_947_;
		anInt9109 = i_948_;
		anInt9050 = i_949_;
	    }
	} else if (i == 1) {
	    i_947_ <<= 4;
	    i_948_ <<= 4;
	    i_949_ <<= 4;
	    for (int i_958_ = 0; i_958_ < i_951_; i_958_++) {
		int i_959_ = is[i_958_];
		if (i_959_ < anIntArrayArray9055.length) {
		    int[] is_960_ = anIntArrayArray9055[i_959_];
		    for (int i_961_ = 0; i_961_ < is_960_.length; i_961_++) {
			int i_962_ = is_960_[i_961_];
			anIntArray9052[i_962_] += i_947_;
			anIntArray9069[i_962_] += i_948_;
			anIntArray9054[i_962_] += i_949_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_963_ = 0; i_963_ < i_951_; i_963_++) {
		int i_964_ = is[i_963_];
		if (i_964_ < anIntArrayArray9055.length) {
		    int[] is_965_ = anIntArrayArray9055[i_964_];
		    if ((i_950_ & 0x1) == 0) {
			for (int i_966_ = 0; i_966_ < is_965_.length;
			     i_966_++) {
			    int i_967_ = is_965_[i_966_];
			    anIntArray9052[i_967_] -= anInt9108;
			    anIntArray9069[i_967_] -= anInt9109;
			    anIntArray9054[i_967_] -= anInt9050;
			    if (i_949_ != 0) {
				int i_968_ = Class436.anIntArray4831[i_949_];
				int i_969_ = Class436.anIntArray4838[i_949_];
				int i_970_ = (anIntArray9069[i_967_] * i_968_
					      + anIntArray9052[i_967_] * i_969_
					      + 16383) >> 14;
				anIntArray9069[i_967_]
				    = (anIntArray9069[i_967_] * i_969_
				       - anIntArray9052[i_967_] * i_968_
				       + 16383) >> 14;
				anIntArray9052[i_967_] = i_970_;
			    }
			    if (i_947_ != 0) {
				int i_971_ = Class436.anIntArray4831[i_947_];
				int i_972_ = Class436.anIntArray4838[i_947_];
				int i_973_ = (anIntArray9069[i_967_] * i_972_
					      - anIntArray9054[i_967_] * i_971_
					      + 16383) >> 14;
				anIntArray9054[i_967_]
				    = (anIntArray9069[i_967_] * i_971_
				       + anIntArray9054[i_967_] * i_972_
				       + 16383) >> 14;
				anIntArray9069[i_967_] = i_973_;
			    }
			    if (i_948_ != 0) {
				int i_974_ = Class436.anIntArray4831[i_948_];
				int i_975_ = Class436.anIntArray4838[i_948_];
				int i_976_ = (anIntArray9054[i_967_] * i_974_
					      + anIntArray9052[i_967_] * i_975_
					      + 16383) >> 14;
				anIntArray9054[i_967_]
				    = (anIntArray9054[i_967_] * i_975_
				       - anIntArray9052[i_967_] * i_974_
				       + 16383) >> 14;
				anIntArray9052[i_967_] = i_976_;
			    }
			    anIntArray9052[i_967_] += anInt9108;
			    anIntArray9069[i_967_] += anInt9109;
			    anIntArray9054[i_967_] += anInt9050;
			}
		    } else {
			for (int i_977_ = 0; i_977_ < is_965_.length;
			     i_977_++) {
			    int i_978_ = is_965_[i_977_];
			    anIntArray9052[i_978_] -= anInt9108;
			    anIntArray9069[i_978_] -= anInt9109;
			    anIntArray9054[i_978_] -= anInt9050;
			    if (i_947_ != 0) {
				int i_979_ = Class436.anIntArray4831[i_947_];
				int i_980_ = Class436.anIntArray4838[i_947_];
				int i_981_ = (anIntArray9069[i_978_] * i_980_
					      - anIntArray9054[i_978_] * i_979_
					      + 16383) >> 14;
				anIntArray9054[i_978_]
				    = (anIntArray9069[i_978_] * i_979_
				       + anIntArray9054[i_978_] * i_980_
				       + 16383) >> 14;
				anIntArray9069[i_978_] = i_981_;
			    }
			    if (i_949_ != 0) {
				int i_982_ = Class436.anIntArray4831[i_949_];
				int i_983_ = Class436.anIntArray4838[i_949_];
				int i_984_ = (anIntArray9069[i_978_] * i_982_
					      + anIntArray9052[i_978_] * i_983_
					      + 16383) >> 14;
				anIntArray9069[i_978_]
				    = (anIntArray9069[i_978_] * i_983_
				       - anIntArray9052[i_978_] * i_982_
				       + 16383) >> 14;
				anIntArray9052[i_978_] = i_984_;
			    }
			    if (i_948_ != 0) {
				int i_985_ = Class436.anIntArray4831[i_948_];
				int i_986_ = Class436.anIntArray4838[i_948_];
				int i_987_ = (anIntArray9054[i_978_] * i_985_
					      + anIntArray9052[i_978_] * i_986_
					      + 16383) >> 14;
				anIntArray9054[i_978_]
				    = (anIntArray9054[i_978_] * i_986_
				       - anIntArray9052[i_978_] * i_985_
				       + 16383) >> 14;
				anIntArray9052[i_978_] = i_987_;
			    }
			    anIntArray9052[i_978_] += anInt9108;
			    anIntArray9069[i_978_] += anInt9109;
			    anIntArray9054[i_978_] += anInt9050;
			}
		    }
		}
	    }
	    if (bool) {
		for (int i_988_ = 0; i_988_ < i_951_; i_988_++) {
		    int i_989_ = is[i_988_];
		    if (i_989_ < anIntArrayArray9055.length) {
			int[] is_990_ = anIntArrayArray9055[i_989_];
			for (int i_991_ = 0; i_991_ < is_990_.length;
			     i_991_++) {
			    int i_992_ = is_990_[i_991_];
			    int i_993_ = anIntArray9046[i_992_];
			    int i_994_ = anIntArray9046[i_992_ + 1];
			    for (int i_995_ = i_993_;
				 (i_995_ < i_994_
				  && aShortArray9096[i_995_] != 0);
				 i_995_++) {
				int i_996_
				    = (aShortArray9096[i_995_] & 0xffff) - 1;
				if (i_949_ != 0) {
				    int i_997_
					= Class436.anIntArray4831[i_949_];
				    int i_998_
					= Class436.anIntArray4838[i_949_];
				    int i_999_
					= ((aShortArray9059[i_996_] * i_997_
					    + aShortArray9073[i_996_] * i_998_
					    + 16383)
					   >> 14);
				    aShortArray9059[i_996_]
					= (short) (((aShortArray9059[i_996_]
						     * i_998_)
						    - (aShortArray9073[i_996_]
						       * i_997_)
						    + 16383)
						   >> 14);
				    aShortArray9073[i_996_] = (short) i_999_;
				}
				if (i_947_ != 0) {
				    int i_1000_
					= Class436.anIntArray4831[i_947_];
				    int i_1001_
					= Class436.anIntArray4838[i_947_];
				    int i_1002_
					= ((aShortArray9059[i_996_] * i_1001_
					    - aShortArray9060[i_996_] * i_1000_
					    + 16383)
					   >> 14);
				    aShortArray9060[i_996_]
					= (short) (((aShortArray9059[i_996_]
						     * i_1000_)
						    + (aShortArray9060[i_996_]
						       * i_1001_)
						    + 16383)
						   >> 14);
				    aShortArray9059[i_996_] = (short) i_1002_;
				}
				if (i_948_ != 0) {
				    int i_1003_
					= Class436.anIntArray4831[i_948_];
				    int i_1004_
					= Class436.anIntArray4838[i_948_];
				    int i_1005_
					= ((aShortArray9060[i_996_] * i_1003_
					    + aShortArray9073[i_996_] * i_1004_
					    + 16383)
					   >> 14);
				    aShortArray9060[i_996_]
					= (short) (((aShortArray9060[i_996_]
						     * i_1004_)
						    - (aShortArray9073[i_996_]
						       * i_1003_)
						    + 16383)
						   >> 14);
				    aShortArray9073[i_996_] = (short) i_1005_;
				}
			    }
			}
		    }
		}
		if (aClass137_9051 == null && aClass137_9076 != null)
		    aClass137_9076.anInterface15_1635 = null;
		if (aClass137_9051 != null)
		    aClass137_9051.anInterface15_1635 = null;
	    }
	} else if (i == 3) {
	    for (int i_1006_ = 0; i_1006_ < i_951_; i_1006_++) {
		int i_1007_ = is[i_1006_];
		if (i_1007_ < anIntArrayArray9055.length) {
		    int[] is_1008_ = anIntArrayArray9055[i_1007_];
		    for (int i_1009_ = 0; i_1009_ < is_1008_.length;
			 i_1009_++) {
			int i_1010_ = is_1008_[i_1009_];
			anIntArray9052[i_1010_] -= anInt9108;
			anIntArray9069[i_1010_] -= anInt9109;
			anIntArray9054[i_1010_] -= anInt9050;
			anIntArray9052[i_1010_]
			    = anIntArray9052[i_1010_] * i_947_ >> 7;
			anIntArray9069[i_1010_]
			    = anIntArray9069[i_1010_] * i_948_ >> 7;
			anIntArray9054[i_1010_]
			    = anIntArray9054[i_1010_] * i_949_ >> 7;
			anIntArray9052[i_1010_] += anInt9108;
			anIntArray9069[i_1010_] += anInt9109;
			anIntArray9054[i_1010_] += anInt9050;
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9048 != null) {
		for (int i_1011_ = 0; i_1011_ < i_951_; i_1011_++) {
		    int i_1012_ = is[i_1011_];
		    if (i_1012_ < anIntArrayArray9048.length) {
			int[] is_1013_ = anIntArrayArray9048[i_1012_];
			for (int i_1014_ = 0; i_1014_ < is_1013_.length;
			     i_1014_++) {
			    int i_1015_ = is_1013_[i_1014_];
			    int i_1016_ = ((aByteArray9068[i_1015_] & 0xff)
					   + i_947_ * 8);
			    if (i_1016_ < 0)
				i_1016_ = 0;
			    else if (i_1016_ > 255)
				i_1016_ = 255;
			    aByteArray9068[i_1015_] = (byte) i_1016_;
			}
			if (is_1013_.length > 0 && aClass137_9076 != null)
			    aClass137_9076.anInterface15_1635 = null;
		    }
		}
		if (aClass148Array9100 != null) {
		    for (int i_1017_ = 0; i_1017_ < anInt9074; i_1017_++) {
			Class148 class148 = aClass148Array9100[i_1017_];
			Class131 class131 = aClass131Array9101[i_1017_];
			class131.anInt1582
			    = (class131.anInt1582 & 0xffffff
			       | 255 - (aByteArray9068[class148.anInt1694]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9048 != null) {
		for (int i_1018_ = 0; i_1018_ < i_951_; i_1018_++) {
		    int i_1019_ = is[i_1018_];
		    if (i_1019_ < anIntArrayArray9048.length) {
			int[] is_1020_ = anIntArrayArray9048[i_1019_];
			for (int i_1021_ = 0; i_1021_ < is_1020_.length;
			     i_1021_++) {
			    int i_1022_ = is_1020_[i_1021_];
			    int i_1023_ = aShortArray9067[i_1022_] & 0xffff;
			    int i_1024_ = i_1023_ >> 10 & 0x3f;
			    int i_1025_ = i_1023_ >> 7 & 0x7;
			    int i_1026_ = i_1023_ & 0x7f;
			    i_1024_ = i_1024_ + i_947_ & 0x3f;
			    i_1025_ += i_948_ / 4;
			    if (i_1025_ < 0)
				i_1025_ = 0;
			    else if (i_1025_ > 7)
				i_1025_ = 7;
			    i_1026_ += i_949_;
			    if (i_1026_ < 0)
				i_1026_ = 0;
			    else if (i_1026_ > 127)
				i_1026_ = 127;
			    aShortArray9067[i_1022_]
				= (short) (i_1024_ << 10 | i_1025_ << 7
					   | i_1026_);
			}
			if (is_1020_.length > 0 && aClass137_9076 != null)
			    aClass137_9076.anInterface15_1635 = null;
		    }
		}
		if (aClass148Array9100 != null) {
		    for (int i_1027_ = 0; i_1027_ < anInt9074; i_1027_++) {
			Class148 class148 = aClass148Array9100[i_1027_];
			Class131 class131 = aClass131Array9101[i_1027_];
			class131.anInt1582
			    = (class131.anInt1582 & ~0xffffff
			       | (Class642.anIntArray8324
				  [(aShortArray9067[class148.anInt1694]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9042 != null) {
		for (int i_1028_ = 0; i_1028_ < i_951_; i_1028_++) {
		    int i_1029_ = is[i_1028_];
		    if (i_1029_ < anIntArrayArray9042.length) {
			int[] is_1030_ = anIntArrayArray9042[i_1029_];
			for (int i_1031_ = 0; i_1031_ < is_1030_.length;
			     i_1031_++) {
			    Class131 class131
				= aClass131Array9101[is_1030_[i_1031_]];
			    class131.anInt1583 += i_947_;
			    class131.anInt1585 += i_948_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9042 != null) {
		for (int i_1032_ = 0; i_1032_ < i_951_; i_1032_++) {
		    int i_1033_ = is[i_1032_];
		    if (i_1033_ < anIntArrayArray9042.length) {
			int[] is_1034_ = anIntArrayArray9042[i_1033_];
			for (int i_1035_ = 0; i_1035_ < is_1034_.length;
			     i_1035_++) {
			    Class131 class131
				= aClass131Array9101[is_1034_[i_1035_]];
			    class131.anInt1581
				= class131.anInt1581 * i_947_ >> 7;
			    class131.anInt1584
				= class131.anInt1584 * i_948_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9042 != null) {
		for (int i_1036_ = 0; i_1036_ < i_951_; i_1036_++) {
		    int i_1037_ = is[i_1036_];
		    if (i_1037_ < anIntArrayArray9042.length) {
			int[] is_1038_ = anIntArrayArray9042[i_1037_];
			for (int i_1039_ = 0; i_1039_ < is_1038_.length;
			     i_1039_++) {
			    Class131 class131
				= aClass131Array9101[is_1038_[i_1039_]];
			    class131.anInt1586
				= class131.anInt1586 + i_947_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3013(int i, int[] is, int i_1040_, int i_1041_, int i_1042_,
		    boolean bool, int i_1043_, int[] is_1044_) {
	int i_1045_ = is.length;
	if (i == 0) {
	    i_1040_ <<= 4;
	    i_1041_ <<= 4;
	    i_1042_ <<= 4;
	    int i_1046_ = 0;
	    anInt9108 = 0;
	    anInt9109 = 0;
	    anInt9050 = 0;
	    for (int i_1047_ = 0; i_1047_ < i_1045_; i_1047_++) {
		int i_1048_ = is[i_1047_];
		if (i_1048_ < anIntArrayArray9055.length) {
		    int[] is_1049_ = anIntArrayArray9055[i_1048_];
		    for (int i_1050_ = 0; i_1050_ < is_1049_.length;
			 i_1050_++) {
			int i_1051_ = is_1049_[i_1050_];
			if (aShortArray9056 == null
			    || (i_1043_ & aShortArray9056[i_1051_]) != 0) {
			    anInt9108 += anIntArray9052[i_1051_];
			    anInt9109 += anIntArray9069[i_1051_];
			    anInt9050 += anIntArray9054[i_1051_];
			    i_1046_++;
			}
		    }
		}
	    }
	    if (i_1046_ > 0) {
		anInt9108 = anInt9108 / i_1046_ + i_1040_;
		anInt9109 = anInt9109 / i_1046_ + i_1041_;
		anInt9050 = anInt9050 / i_1046_ + i_1042_;
		aBool9082 = true;
	    } else {
		anInt9108 = i_1040_;
		anInt9109 = i_1041_;
		anInt9050 = i_1042_;
	    }
	} else if (i == 1) {
	    if (is_1044_ != null) {
		int i_1052_ = ((is_1044_[0] * i_1040_ + is_1044_[1] * i_1041_
				+ is_1044_[2] * i_1042_ + 8192)
			       >> 14);
		int i_1053_ = ((is_1044_[3] * i_1040_ + is_1044_[4] * i_1041_
				+ is_1044_[5] * i_1042_ + 8192)
			       >> 14);
		int i_1054_ = ((is_1044_[6] * i_1040_ + is_1044_[7] * i_1041_
				+ is_1044_[8] * i_1042_ + 8192)
			       >> 14);
		i_1040_ = i_1052_;
		i_1041_ = i_1053_;
		i_1042_ = i_1054_;
	    }
	    i_1040_ <<= 4;
	    i_1041_ <<= 4;
	    i_1042_ <<= 4;
	    for (int i_1055_ = 0; i_1055_ < i_1045_; i_1055_++) {
		int i_1056_ = is[i_1055_];
		if (i_1056_ < anIntArrayArray9055.length) {
		    int[] is_1057_ = anIntArrayArray9055[i_1056_];
		    for (int i_1058_ = 0; i_1058_ < is_1057_.length;
			 i_1058_++) {
			int i_1059_ = is_1057_[i_1058_];
			if (aShortArray9056 == null
			    || (i_1043_ & aShortArray9056[i_1059_]) != 0) {
			    anIntArray9052[i_1059_] += i_1040_;
			    anIntArray9069[i_1059_] += i_1041_;
			    anIntArray9054[i_1059_] += i_1042_;
			}
		    }
		}
	    }
	} else if (i == 2) {
	    if (is_1044_ != null) {
		int i_1060_ = is_1044_[9] << 4;
		int i_1061_ = is_1044_[10] << 4;
		int i_1062_ = is_1044_[11] << 4;
		int i_1063_ = is_1044_[12] << 4;
		int i_1064_ = is_1044_[13] << 4;
		int i_1065_ = is_1044_[14] << 4;
		if (aBool9082) {
		    int i_1066_
			= ((is_1044_[0] * anInt9108 + is_1044_[3] * anInt9109
			    + is_1044_[6] * anInt9050 + 8192)
			   >> 14);
		    int i_1067_
			= ((is_1044_[1] * anInt9108 + is_1044_[4] * anInt9109
			    + is_1044_[7] * anInt9050 + 8192)
			   >> 14);
		    int i_1068_
			= ((is_1044_[2] * anInt9108 + is_1044_[5] * anInt9109
			    + is_1044_[8] * anInt9050 + 8192)
			   >> 14);
		    i_1066_ += i_1063_;
		    i_1067_ += i_1064_;
		    i_1068_ += i_1065_;
		    anInt9108 = i_1066_;
		    anInt9109 = i_1067_;
		    anInt9050 = i_1068_;
		    aBool9082 = false;
		}
		int[] is_1069_ = new int[9];
		int i_1070_ = Class436.anIntArray4838[i_1040_];
		int i_1071_ = Class436.anIntArray4831[i_1040_];
		int i_1072_ = Class436.anIntArray4838[i_1041_];
		int i_1073_ = Class436.anIntArray4831[i_1041_];
		int i_1074_ = Class436.anIntArray4838[i_1042_];
		int i_1075_ = Class436.anIntArray4831[i_1042_];
		int i_1076_ = i_1071_ * i_1074_ + 8192 >> 14;
		int i_1077_ = i_1071_ * i_1075_ + 8192 >> 14;
		is_1069_[0]
		    = i_1072_ * i_1074_ + i_1073_ * i_1077_ + 8192 >> 14;
		is_1069_[1]
		    = -i_1072_ * i_1075_ + i_1073_ * i_1076_ + 8192 >> 14;
		is_1069_[2] = i_1073_ * i_1070_ + 8192 >> 14;
		is_1069_[3] = i_1070_ * i_1075_ + 8192 >> 14;
		is_1069_[4] = i_1070_ * i_1074_ + 8192 >> 14;
		is_1069_[5] = -i_1071_;
		is_1069_[6]
		    = -i_1073_ * i_1074_ + i_1072_ * i_1077_ + 8192 >> 14;
		is_1069_[7]
		    = i_1073_ * i_1075_ + i_1072_ * i_1076_ + 8192 >> 14;
		is_1069_[8] = i_1072_ * i_1070_ + 8192 >> 14;
		int i_1078_
		    = ((is_1069_[0] * -anInt9108 + is_1069_[1] * -anInt9109
			+ is_1069_[2] * -anInt9050 + 8192)
		       >> 14);
		int i_1079_
		    = ((is_1069_[3] * -anInt9108 + is_1069_[4] * -anInt9109
			+ is_1069_[5] * -anInt9050 + 8192)
		       >> 14);
		int i_1080_
		    = ((is_1069_[6] * -anInt9108 + is_1069_[7] * -anInt9109
			+ is_1069_[8] * -anInt9050 + 8192)
		       >> 14);
		int i_1081_ = i_1078_ + anInt9108;
		int i_1082_ = i_1079_ + anInt9109;
		int i_1083_ = i_1080_ + anInt9050;
		int[] is_1084_ = new int[9];
		for (int i_1085_ = 0; i_1085_ < 3; i_1085_++) {
		    for (int i_1086_ = 0; i_1086_ < 3; i_1086_++) {
			int i_1087_ = 0;
			for (int i_1088_ = 0; i_1088_ < 3; i_1088_++)
			    i_1087_ += (is_1069_[i_1085_ * 3 + i_1088_]
					* is_1044_[i_1086_ * 3 + i_1088_]);
			is_1084_[i_1085_ * 3 + i_1086_] = i_1087_ + 8192 >> 14;
		    }
		}
		int i_1089_ = ((is_1069_[0] * i_1063_ + is_1069_[1] * i_1064_
				+ is_1069_[2] * i_1065_ + 8192)
			       >> 14);
		int i_1090_ = ((is_1069_[3] * i_1063_ + is_1069_[4] * i_1064_
				+ is_1069_[5] * i_1065_ + 8192)
			       >> 14);
		int i_1091_ = ((is_1069_[6] * i_1063_ + is_1069_[7] * i_1064_
				+ is_1069_[8] * i_1065_ + 8192)
			       >> 14);
		i_1089_ += i_1081_;
		i_1090_ += i_1082_;
		i_1091_ += i_1083_;
		int[] is_1092_ = new int[9];
		for (int i_1093_ = 0; i_1093_ < 3; i_1093_++) {
		    for (int i_1094_ = 0; i_1094_ < 3; i_1094_++) {
			int i_1095_ = 0;
			for (int i_1096_ = 0; i_1096_ < 3; i_1096_++)
			    i_1095_ += (is_1044_[i_1093_ * 3 + i_1096_]
					* is_1084_[i_1094_ + i_1096_ * 3]);
			is_1092_[i_1093_ * 3 + i_1094_] = i_1095_ + 8192 >> 14;
		    }
		}
		int i_1097_ = ((is_1044_[0] * i_1089_ + is_1044_[1] * i_1090_
				+ is_1044_[2] * i_1091_ + 8192)
			       >> 14);
		int i_1098_ = ((is_1044_[3] * i_1089_ + is_1044_[4] * i_1090_
				+ is_1044_[5] * i_1091_ + 8192)
			       >> 14);
		int i_1099_ = ((is_1044_[6] * i_1089_ + is_1044_[7] * i_1090_
				+ is_1044_[8] * i_1091_ + 8192)
			       >> 14);
		i_1097_ += i_1060_;
		i_1098_ += i_1061_;
		i_1099_ += i_1062_;
		for (int i_1100_ = 0; i_1100_ < i_1045_; i_1100_++) {
		    int i_1101_ = is[i_1100_];
		    if (i_1101_ < anIntArrayArray9055.length) {
			int[] is_1102_ = anIntArrayArray9055[i_1101_];
			for (int i_1103_ = 0; i_1103_ < is_1102_.length;
			     i_1103_++) {
			    int i_1104_ = is_1102_[i_1103_];
			    if (aShortArray9056 == null
				|| (i_1043_ & aShortArray9056[i_1104_]) != 0) {
				int i_1105_
				    = ((is_1092_[0] * anIntArray9052[i_1104_]
					+ is_1092_[1] * anIntArray9069[i_1104_]
					+ is_1092_[2] * anIntArray9054[i_1104_]
					+ 8192)
				       >> 14);
				int i_1106_
				    = ((is_1092_[3] * anIntArray9052[i_1104_]
					+ is_1092_[4] * anIntArray9069[i_1104_]
					+ is_1092_[5] * anIntArray9054[i_1104_]
					+ 8192)
				       >> 14);
				int i_1107_
				    = ((is_1092_[6] * anIntArray9052[i_1104_]
					+ is_1092_[7] * anIntArray9069[i_1104_]
					+ is_1092_[8] * anIntArray9054[i_1104_]
					+ 8192)
				       >> 14);
				i_1105_ += i_1097_;
				i_1106_ += i_1098_;
				i_1107_ += i_1099_;
				anIntArray9052[i_1104_] = i_1105_;
				anIntArray9069[i_1104_] = i_1106_;
				anIntArray9054[i_1104_] = i_1107_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1108_ = 0; i_1108_ < i_1045_; i_1108_++) {
		    int i_1109_ = is[i_1108_];
		    if (i_1109_ < anIntArrayArray9055.length) {
			int[] is_1110_ = anIntArrayArray9055[i_1109_];
			for (int i_1111_ = 0; i_1111_ < is_1110_.length;
			     i_1111_++) {
			    int i_1112_ = is_1110_[i_1111_];
			    if (aShortArray9056 == null
				|| (i_1043_ & aShortArray9056[i_1112_]) != 0) {
				anIntArray9052[i_1112_] -= anInt9108;
				anIntArray9069[i_1112_] -= anInt9109;
				anIntArray9054[i_1112_] -= anInt9050;
				if (i_1042_ != 0) {
				    int i_1113_
					= Class436.anIntArray4831[i_1042_];
				    int i_1114_
					= Class436.anIntArray4838[i_1042_];
				    int i_1115_
					= ((anIntArray9069[i_1112_] * i_1113_
					    + anIntArray9052[i_1112_] * i_1114_
					    + 16383)
					   >> 14);
				    anIntArray9069[i_1112_]
					= (anIntArray9069[i_1112_] * i_1114_
					   - anIntArray9052[i_1112_] * i_1113_
					   + 16383) >> 14;
				    anIntArray9052[i_1112_] = i_1115_;
				}
				if (i_1040_ != 0) {
				    int i_1116_
					= Class436.anIntArray4831[i_1040_];
				    int i_1117_
					= Class436.anIntArray4838[i_1040_];
				    int i_1118_
					= ((anIntArray9069[i_1112_] * i_1117_
					    - anIntArray9054[i_1112_] * i_1116_
					    + 16383)
					   >> 14);
				    anIntArray9054[i_1112_]
					= (anIntArray9069[i_1112_] * i_1116_
					   + anIntArray9054[i_1112_] * i_1117_
					   + 16383) >> 14;
				    anIntArray9069[i_1112_] = i_1118_;
				}
				if (i_1041_ != 0) {
				    int i_1119_
					= Class436.anIntArray4831[i_1041_];
				    int i_1120_
					= Class436.anIntArray4838[i_1041_];
				    int i_1121_
					= ((anIntArray9054[i_1112_] * i_1119_
					    + anIntArray9052[i_1112_] * i_1120_
					    + 16383)
					   >> 14);
				    anIntArray9054[i_1112_]
					= (anIntArray9054[i_1112_] * i_1120_
					   - anIntArray9052[i_1112_] * i_1119_
					   + 16383) >> 14;
				    anIntArray9052[i_1112_] = i_1121_;
				}
				anIntArray9052[i_1112_] += anInt9108;
				anIntArray9069[i_1112_] += anInt9109;
				anIntArray9054[i_1112_] += anInt9050;
			    }
			}
		    }
		}
		if (bool) {
		    for (int i_1122_ = 0; i_1122_ < i_1045_; i_1122_++) {
			int i_1123_ = is[i_1122_];
			if (i_1123_ < anIntArrayArray9055.length) {
			    int[] is_1124_ = anIntArrayArray9055[i_1123_];
			    for (int i_1125_ = 0; i_1125_ < is_1124_.length;
				 i_1125_++) {
				int i_1126_ = is_1124_[i_1125_];
				if (aShortArray9056 == null
				    || ((i_1043_ & aShortArray9056[i_1126_])
					!= 0)) {
				    int i_1127_ = anIntArray9046[i_1126_];
				    int i_1128_ = anIntArray9046[i_1126_ + 1];
				    for (int i_1129_ = i_1127_;
					 (i_1129_ < i_1128_
					  && aShortArray9096[i_1129_] != 0);
					 i_1129_++) {
					int i_1130_ = (aShortArray9096[i_1129_]
						       & 0xffff) - 1;
					if (i_1042_ != 0) {
					    int i_1131_
						= (Class436.anIntArray4831
						   [i_1042_]);
					    int i_1132_
						= (Class436.anIntArray4838
						   [i_1042_]);
					    int i_1133_
						= (((aShortArray9059[i_1130_]
						     * i_1131_)
						    + (aShortArray9073[i_1130_]
						       * i_1132_)
						    + 16383)
						   >> 14);
					    aShortArray9059[i_1130_]
						= (short) ((((aShortArray9059
							      [i_1130_])
							     * i_1132_)
							    - ((aShortArray9073
								[i_1130_])
							       * i_1131_)
							    + 16383)
							   >> 14);
					    aShortArray9073[i_1130_]
						= (short) i_1133_;
					}
					if (i_1040_ != 0) {
					    int i_1134_
						= (Class436.anIntArray4831
						   [i_1040_]);
					    int i_1135_
						= (Class436.anIntArray4838
						   [i_1040_]);
					    int i_1136_
						= (((aShortArray9059[i_1130_]
						     * i_1135_)
						    - (aShortArray9060[i_1130_]
						       * i_1134_)
						    + 16383)
						   >> 14);
					    aShortArray9060[i_1130_]
						= (short) ((((aShortArray9059
							      [i_1130_])
							     * i_1134_)
							    + ((aShortArray9060
								[i_1130_])
							       * i_1135_)
							    + 16383)
							   >> 14);
					    aShortArray9059[i_1130_]
						= (short) i_1136_;
					}
					if (i_1041_ != 0) {
					    int i_1137_
						= (Class436.anIntArray4831
						   [i_1041_]);
					    int i_1138_
						= (Class436.anIntArray4838
						   [i_1041_]);
					    int i_1139_
						= (((aShortArray9060[i_1130_]
						     * i_1137_)
						    + (aShortArray9073[i_1130_]
						       * i_1138_)
						    + 16383)
						   >> 14);
					    aShortArray9060[i_1130_]
						= (short) ((((aShortArray9060
							      [i_1130_])
							     * i_1138_)
							    - ((aShortArray9073
								[i_1130_])
							       * i_1137_)
							    + 16383)
							   >> 14);
					    aShortArray9073[i_1130_]
						= (short) i_1139_;
					}
				    }
				}
			    }
			}
		    }
		    if (aClass137_9051 == null && aClass137_9076 != null)
			aClass137_9076.anInterface15_1635 = null;
		    if (aClass137_9051 != null)
			aClass137_9051.anInterface15_1635 = null;
		}
	    }
	} else if (i == 3) {
	    if (is_1044_ != null) {
		int i_1140_ = is_1044_[9] << 4;
		int i_1141_ = is_1044_[10] << 4;
		int i_1142_ = is_1044_[11] << 4;
		int i_1143_ = is_1044_[12] << 4;
		int i_1144_ = is_1044_[13] << 4;
		int i_1145_ = is_1044_[14] << 4;
		if (aBool9082) {
		    int i_1146_
			= ((is_1044_[0] * anInt9108 + is_1044_[3] * anInt9109
			    + is_1044_[6] * anInt9050 + 8192)
			   >> 14);
		    int i_1147_
			= ((is_1044_[1] * anInt9108 + is_1044_[4] * anInt9109
			    + is_1044_[7] * anInt9050 + 8192)
			   >> 14);
		    int i_1148_
			= ((is_1044_[2] * anInt9108 + is_1044_[5] * anInt9109
			    + is_1044_[8] * anInt9050 + 8192)
			   >> 14);
		    i_1146_ += i_1143_;
		    i_1147_ += i_1144_;
		    i_1148_ += i_1145_;
		    anInt9108 = i_1146_;
		    anInt9109 = i_1147_;
		    anInt9050 = i_1148_;
		    aBool9082 = false;
		}
		int i_1149_ = i_1040_ << 15 >> 7;
		int i_1150_ = i_1041_ << 15 >> 7;
		int i_1151_ = i_1042_ << 15 >> 7;
		int i_1152_ = i_1149_ * -anInt9108 + 8192 >> 14;
		int i_1153_ = i_1150_ * -anInt9109 + 8192 >> 14;
		int i_1154_ = i_1151_ * -anInt9050 + 8192 >> 14;
		int i_1155_ = i_1152_ + anInt9108;
		int i_1156_ = i_1153_ + anInt9109;
		int i_1157_ = i_1154_ + anInt9050;
		int[] is_1158_ = new int[9];
		is_1158_[0] = i_1149_ * is_1044_[0] + 8192 >> 14;
		is_1158_[1] = i_1149_ * is_1044_[3] + 8192 >> 14;
		is_1158_[2] = i_1149_ * is_1044_[6] + 8192 >> 14;
		is_1158_[3] = i_1150_ * is_1044_[1] + 8192 >> 14;
		is_1158_[4] = i_1150_ * is_1044_[4] + 8192 >> 14;
		is_1158_[5] = i_1150_ * is_1044_[7] + 8192 >> 14;
		is_1158_[6] = i_1151_ * is_1044_[2] + 8192 >> 14;
		is_1158_[7] = i_1151_ * is_1044_[5] + 8192 >> 14;
		is_1158_[8] = i_1151_ * is_1044_[8] + 8192 >> 14;
		int i_1159_ = i_1149_ * i_1143_ + 8192 >> 14;
		int i_1160_ = i_1150_ * i_1144_ + 8192 >> 14;
		int i_1161_ = i_1151_ * i_1145_ + 8192 >> 14;
		i_1159_ += i_1155_;
		i_1160_ += i_1156_;
		i_1161_ += i_1157_;
		int[] is_1162_ = new int[9];
		for (int i_1163_ = 0; i_1163_ < 3; i_1163_++) {
		    for (int i_1164_ = 0; i_1164_ < 3; i_1164_++) {
			int i_1165_ = 0;
			for (int i_1166_ = 0; i_1166_ < 3; i_1166_++)
			    i_1165_ += (is_1044_[i_1163_ * 3 + i_1166_]
					* is_1158_[i_1164_ + i_1166_ * 3]);
			is_1162_[i_1163_ * 3 + i_1164_] = i_1165_ + 8192 >> 14;
		    }
		}
		int i_1167_ = ((is_1044_[0] * i_1159_ + is_1044_[1] * i_1160_
				+ is_1044_[2] * i_1161_ + 8192)
			       >> 14);
		int i_1168_ = ((is_1044_[3] * i_1159_ + is_1044_[4] * i_1160_
				+ is_1044_[5] * i_1161_ + 8192)
			       >> 14);
		int i_1169_ = ((is_1044_[6] * i_1159_ + is_1044_[7] * i_1160_
				+ is_1044_[8] * i_1161_ + 8192)
			       >> 14);
		i_1167_ += i_1140_;
		i_1168_ += i_1141_;
		i_1169_ += i_1142_;
		for (int i_1170_ = 0; i_1170_ < i_1045_; i_1170_++) {
		    int i_1171_ = is[i_1170_];
		    if (i_1171_ < anIntArrayArray9055.length) {
			int[] is_1172_ = anIntArrayArray9055[i_1171_];
			for (int i_1173_ = 0; i_1173_ < is_1172_.length;
			     i_1173_++) {
			    int i_1174_ = is_1172_[i_1173_];
			    if (aShortArray9056 == null
				|| (i_1043_ & aShortArray9056[i_1174_]) != 0) {
				int i_1175_
				    = ((is_1162_[0] * anIntArray9052[i_1174_]
					+ is_1162_[1] * anIntArray9069[i_1174_]
					+ is_1162_[2] * anIntArray9054[i_1174_]
					+ 8192)
				       >> 14);
				int i_1176_
				    = ((is_1162_[3] * anIntArray9052[i_1174_]
					+ is_1162_[4] * anIntArray9069[i_1174_]
					+ is_1162_[5] * anIntArray9054[i_1174_]
					+ 8192)
				       >> 14);
				int i_1177_
				    = ((is_1162_[6] * anIntArray9052[i_1174_]
					+ is_1162_[7] * anIntArray9069[i_1174_]
					+ is_1162_[8] * anIntArray9054[i_1174_]
					+ 8192)
				       >> 14);
				i_1175_ += i_1167_;
				i_1176_ += i_1168_;
				i_1177_ += i_1169_;
				anIntArray9052[i_1174_] = i_1175_;
				anIntArray9069[i_1174_] = i_1176_;
				anIntArray9054[i_1174_] = i_1177_;
			    }
			}
		    }
		}
	    } else {
		for (int i_1178_ = 0; i_1178_ < i_1045_; i_1178_++) {
		    int i_1179_ = is[i_1178_];
		    if (i_1179_ < anIntArrayArray9055.length) {
			int[] is_1180_ = anIntArrayArray9055[i_1179_];
			for (int i_1181_ = 0; i_1181_ < is_1180_.length;
			     i_1181_++) {
			    int i_1182_ = is_1180_[i_1181_];
			    if (aShortArray9056 == null
				|| (i_1043_ & aShortArray9056[i_1182_]) != 0) {
				anIntArray9052[i_1182_] -= anInt9108;
				anIntArray9069[i_1182_] -= anInt9109;
				anIntArray9054[i_1182_] -= anInt9050;
				anIntArray9052[i_1182_]
				    = anIntArray9052[i_1182_] * i_1040_ >> 7;
				anIntArray9069[i_1182_]
				    = anIntArray9069[i_1182_] * i_1041_ >> 7;
				anIntArray9054[i_1182_]
				    = anIntArray9054[i_1182_] * i_1042_ >> 7;
				anIntArray9052[i_1182_] += anInt9108;
				anIntArray9069[i_1182_] += anInt9109;
				anIntArray9054[i_1182_] += anInt9050;
			    }
			}
		    }
		}
	    }
	} else if (i == 5) {
	    if (anIntArrayArray9048 != null) {
		for (int i_1183_ = 0; i_1183_ < i_1045_; i_1183_++) {
		    int i_1184_ = is[i_1183_];
		    if (i_1184_ < anIntArrayArray9048.length) {
			int[] is_1185_ = anIntArrayArray9048[i_1184_];
			for (int i_1186_ = 0; i_1186_ < is_1185_.length;
			     i_1186_++) {
			    int i_1187_ = is_1185_[i_1186_];
			    if (aShortArray9044 == null
				|| (i_1043_ & aShortArray9044[i_1187_]) != 0) {
				int i_1188_ = ((aByteArray9068[i_1187_] & 0xff)
					       + i_1040_ * 8);
				if (i_1188_ < 0)
				    i_1188_ = 0;
				else if (i_1188_ > 255)
				    i_1188_ = 255;
				aByteArray9068[i_1187_] = (byte) i_1188_;
				if (aClass137_9076 != null)
				    aClass137_9076.anInterface15_1635 = null;
			    }
			}
		    }
		}
		if (aClass148Array9100 != null) {
		    for (int i_1189_ = 0; i_1189_ < anInt9074; i_1189_++) {
			Class148 class148 = aClass148Array9100[i_1189_];
			Class131 class131 = aClass131Array9101[i_1189_];
			class131.anInt1582
			    = (class131.anInt1582 & 0xffffff
			       | 255 - (aByteArray9068[class148.anInt1694]
					& 0xff) << 24);
		    }
		}
	    }
	} else if (i == 7) {
	    if (anIntArrayArray9048 != null) {
		for (int i_1190_ = 0; i_1190_ < i_1045_; i_1190_++) {
		    int i_1191_ = is[i_1190_];
		    if (i_1191_ < anIntArrayArray9048.length) {
			int[] is_1192_ = anIntArrayArray9048[i_1191_];
			for (int i_1193_ = 0; i_1193_ < is_1192_.length;
			     i_1193_++) {
			    int i_1194_ = is_1192_[i_1193_];
			    if (aShortArray9044 == null
				|| (i_1043_ & aShortArray9044[i_1194_]) != 0) {
				int i_1195_
				    = aShortArray9067[i_1194_] & 0xffff;
				int i_1196_ = i_1195_ >> 10 & 0x3f;
				int i_1197_ = i_1195_ >> 7 & 0x7;
				int i_1198_ = i_1195_ & 0x7f;
				i_1196_ = i_1196_ + i_1040_ & 0x3f;
				i_1197_ += i_1041_ / 4;
				if (i_1197_ < 0)
				    i_1197_ = 0;
				else if (i_1197_ > 7)
				    i_1197_ = 7;
				i_1198_ += i_1042_;
				if (i_1198_ < 0)
				    i_1198_ = 0;
				else if (i_1198_ > 127)
				    i_1198_ = 127;
				aShortArray9067[i_1194_]
				    = (short) (i_1196_ << 10 | i_1197_ << 7
					       | i_1198_);
				if (aClass137_9076 != null)
				    aClass137_9076.anInterface15_1635 = null;
			    }
			}
		    }
		}
		if (aClass148Array9100 != null) {
		    for (int i_1199_ = 0; i_1199_ < anInt9074; i_1199_++) {
			Class148 class148 = aClass148Array9100[i_1199_];
			Class131 class131 = aClass131Array9101[i_1199_];
			class131.anInt1582
			    = (class131.anInt1582 & ~0xffffff
			       | (Class642.anIntArray8324
				  [(aShortArray9067[class148.anInt1694]
				    & 0xffff)]) & 0xffffff);
		    }
		}
	    }
	} else if (i == 8) {
	    if (anIntArrayArray9042 != null) {
		for (int i_1200_ = 0; i_1200_ < i_1045_; i_1200_++) {
		    int i_1201_ = is[i_1200_];
		    if (i_1201_ < anIntArrayArray9042.length) {
			int[] is_1202_ = anIntArrayArray9042[i_1201_];
			for (int i_1203_ = 0; i_1203_ < is_1202_.length;
			     i_1203_++) {
			    Class131 class131
				= aClass131Array9101[is_1202_[i_1203_]];
			    class131.anInt1583 += i_1040_;
			    class131.anInt1585 += i_1041_;
			}
		    }
		}
	    }
	} else if (i == 10) {
	    if (anIntArrayArray9042 != null) {
		for (int i_1204_ = 0; i_1204_ < i_1045_; i_1204_++) {
		    int i_1205_ = is[i_1204_];
		    if (i_1205_ < anIntArrayArray9042.length) {
			int[] is_1206_ = anIntArrayArray9042[i_1205_];
			for (int i_1207_ = 0; i_1207_ < is_1206_.length;
			     i_1207_++) {
			    Class131 class131
				= aClass131Array9101[is_1206_[i_1207_]];
			    class131.anInt1581
				= class131.anInt1581 * i_1040_ >> 7;
			    class131.anInt1584
				= class131.anInt1584 * i_1041_ >> 7;
			}
		    }
		}
	    }
	} else if (i == 9) {
	    if (anIntArrayArray9042 != null) {
		for (int i_1208_ = 0; i_1208_ < i_1045_; i_1208_++) {
		    int i_1209_ = is[i_1208_];
		    if (i_1209_ < anIntArrayArray9042.length) {
			int[] is_1210_ = anIntArrayArray9042[i_1209_];
			for (int i_1211_ = 0; i_1211_ < is_1210_.length;
			     i_1211_++) {
			    Class131 class131
				= aClass131Array9101[is_1210_[i_1211_]];
			    class131.anInt1586
				= class131.anInt1586 + i_1040_ & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    void method3000(int i, int i_1212_, int i_1213_, int i_1214_) {
	if (i == 0) {
	    int i_1215_ = 0;
	    anInt9108 = 0;
	    anInt9109 = 0;
	    anInt9050 = 0;
	    for (int i_1216_ = 0; i_1216_ < anInt9072; i_1216_++) {
		anInt9108 += anIntArray9052[i_1216_];
		anInt9109 += anIntArray9069[i_1216_];
		anInt9050 += anIntArray9054[i_1216_];
		i_1215_++;
	    }
	    if (i_1215_ > 0) {
		anInt9108 = anInt9108 / i_1215_ + i_1212_;
		anInt9109 = anInt9109 / i_1215_ + i_1213_;
		anInt9050 = anInt9050 / i_1215_ + i_1214_;
	    } else {
		anInt9108 = i_1212_;
		anInt9109 = i_1213_;
		anInt9050 = i_1214_;
	    }
	} else if (i == 1) {
	    for (int i_1217_ = 0; i_1217_ < anInt9072; i_1217_++) {
		anIntArray9052[i_1217_] += i_1212_;
		anIntArray9069[i_1217_] += i_1213_;
		anIntArray9054[i_1217_] += i_1214_;
	    }
	} else if (i == 2) {
	    for (int i_1218_ = 0; i_1218_ < anInt9072; i_1218_++) {
		anIntArray9052[i_1218_] -= anInt9108;
		anIntArray9069[i_1218_] -= anInt9109;
		anIntArray9054[i_1218_] -= anInt9050;
		if (i_1214_ != 0) {
		    int i_1219_ = Class436.anIntArray4831[i_1214_];
		    int i_1220_ = Class436.anIntArray4838[i_1214_];
		    int i_1221_
			= ((anIntArray9069[i_1218_] * i_1219_
			    + anIntArray9052[i_1218_] * i_1220_ + 16383)
			   >> 14);
		    anIntArray9069[i_1218_]
			= (anIntArray9069[i_1218_] * i_1220_
			   - anIntArray9052[i_1218_] * i_1219_ + 16383) >> 14;
		    anIntArray9052[i_1218_] = i_1221_;
		}
		if (i_1212_ != 0) {
		    int i_1222_ = Class436.anIntArray4831[i_1212_];
		    int i_1223_ = Class436.anIntArray4838[i_1212_];
		    int i_1224_
			= ((anIntArray9069[i_1218_] * i_1223_
			    - anIntArray9054[i_1218_] * i_1222_ + 16383)
			   >> 14);
		    anIntArray9054[i_1218_]
			= (anIntArray9069[i_1218_] * i_1222_
			   + anIntArray9054[i_1218_] * i_1223_ + 16383) >> 14;
		    anIntArray9069[i_1218_] = i_1224_;
		}
		if (i_1213_ != 0) {
		    int i_1225_ = Class436.anIntArray4831[i_1213_];
		    int i_1226_ = Class436.anIntArray4838[i_1213_];
		    int i_1227_
			= ((anIntArray9054[i_1218_] * i_1225_
			    + anIntArray9052[i_1218_] * i_1226_ + 16383)
			   >> 14);
		    anIntArray9054[i_1218_]
			= (anIntArray9054[i_1218_] * i_1226_
			   - anIntArray9052[i_1218_] * i_1225_ + 16383) >> 14;
		    anIntArray9052[i_1218_] = i_1227_;
		}
		anIntArray9052[i_1218_] += anInt9108;
		anIntArray9069[i_1218_] += anInt9109;
		anIntArray9054[i_1218_] += anInt9050;
	    }
	} else if (i == 3) {
	    for (int i_1228_ = 0; i_1228_ < anInt9072; i_1228_++) {
		anIntArray9052[i_1228_] -= anInt9108;
		anIntArray9069[i_1228_] -= anInt9109;
		anIntArray9054[i_1228_] -= anInt9050;
		anIntArray9052[i_1228_]
		    = anIntArray9052[i_1228_] * i_1212_ / 128;
		anIntArray9069[i_1228_]
		    = anIntArray9069[i_1228_] * i_1213_ / 128;
		anIntArray9054[i_1228_]
		    = anIntArray9054[i_1228_] * i_1214_ / 128;
		anIntArray9052[i_1228_] += anInt9108;
		anIntArray9069[i_1228_] += anInt9109;
		anIntArray9054[i_1228_] += anInt9050;
	    }
	} else if (i == 5) {
	    for (int i_1229_ = 0; i_1229_ < anInt9065; i_1229_++) {
		int i_1230_ = (aByteArray9068[i_1229_] & 0xff) + i_1212_ * 8;
		if (i_1230_ < 0)
		    i_1230_ = 0;
		else if (i_1230_ > 255)
		    i_1230_ = 255;
		aByteArray9068[i_1229_] = (byte) i_1230_;
	    }
	    if (aClass137_9076 != null)
		aClass137_9076.anInterface15_1635 = null;
	    if (aClass148Array9100 != null) {
		for (int i_1231_ = 0; i_1231_ < anInt9074; i_1231_++) {
		    Class148 class148 = aClass148Array9100[i_1231_];
		    Class131 class131 = aClass131Array9101[i_1231_];
		    class131.anInt1582
			= (class131.anInt1582 & 0xffffff
			   | (255 - (aByteArray9068[class148.anInt1694] & 0xff)
			      << 24));
		}
	    }
	} else if (i == 7) {
	    for (int i_1232_ = 0; i_1232_ < anInt9065; i_1232_++) {
		int i_1233_ = aShortArray9067[i_1232_] & 0xffff;
		int i_1234_ = i_1233_ >> 10 & 0x3f;
		int i_1235_ = i_1233_ >> 7 & 0x7;
		int i_1236_ = i_1233_ & 0x7f;
		i_1234_ = i_1234_ + i_1212_ & 0x3f;
		i_1235_ += i_1213_ / 4;
		if (i_1235_ < 0)
		    i_1235_ = 0;
		else if (i_1235_ > 7)
		    i_1235_ = 7;
		i_1236_ += i_1214_;
		if (i_1236_ < 0)
		    i_1236_ = 0;
		else if (i_1236_ > 127)
		    i_1236_ = 127;
		aShortArray9067[i_1232_]
		    = (short) (i_1234_ << 10 | i_1235_ << 7 | i_1236_);
	    }
	    if (aClass137_9076 != null)
		aClass137_9076.anInterface15_1635 = null;
	    if (aClass148Array9100 != null) {
		for (int i_1237_ = 0; i_1237_ < anInt9074; i_1237_++) {
		    Class148 class148 = aClass148Array9100[i_1237_];
		    Class131 class131 = aClass131Array9101[i_1237_];
		    class131.anInt1582
			= (class131.anInt1582 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9067[class148.anInt1694] & 0xffff])
			      & 0xffffff));
		}
	    }
	} else if (i == 8) {
	    for (int i_1238_ = 0; i_1238_ < anInt9074; i_1238_++) {
		Class131 class131 = aClass131Array9101[i_1238_];
		class131.anInt1583 += i_1212_;
		class131.anInt1585 += i_1213_;
	    }
	} else if (i == 10) {
	    for (int i_1239_ = 0; i_1239_ < anInt9074; i_1239_++) {
		Class131 class131 = aClass131Array9101[i_1239_];
		class131.anInt1581 = class131.anInt1581 * i_1212_ >> 7;
		class131.anInt1584 = class131.anInt1584 * i_1213_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_1240_ = 0; i_1240_ < anInt9074; i_1240_++) {
		Class131 class131 = aClass131Array9101[i_1240_];
		class131.anInt1586 = class131.anInt1586 + i_1212_ & 0x3fff;
	    }
	}
    }
    
    void method3015(int i, int i_1241_, int i_1242_, int i_1243_) {
	if (i == 0) {
	    int i_1244_ = 0;
	    anInt9108 = 0;
	    anInt9109 = 0;
	    anInt9050 = 0;
	    for (int i_1245_ = 0; i_1245_ < anInt9072; i_1245_++) {
		anInt9108 += anIntArray9052[i_1245_];
		anInt9109 += anIntArray9069[i_1245_];
		anInt9050 += anIntArray9054[i_1245_];
		i_1244_++;
	    }
	    if (i_1244_ > 0) {
		anInt9108 = anInt9108 / i_1244_ + i_1241_;
		anInt9109 = anInt9109 / i_1244_ + i_1242_;
		anInt9050 = anInt9050 / i_1244_ + i_1243_;
	    } else {
		anInt9108 = i_1241_;
		anInt9109 = i_1242_;
		anInt9050 = i_1243_;
	    }
	} else if (i == 1) {
	    for (int i_1246_ = 0; i_1246_ < anInt9072; i_1246_++) {
		anIntArray9052[i_1246_] += i_1241_;
		anIntArray9069[i_1246_] += i_1242_;
		anIntArray9054[i_1246_] += i_1243_;
	    }
	} else if (i == 2) {
	    for (int i_1247_ = 0; i_1247_ < anInt9072; i_1247_++) {
		anIntArray9052[i_1247_] -= anInt9108;
		anIntArray9069[i_1247_] -= anInt9109;
		anIntArray9054[i_1247_] -= anInt9050;
		if (i_1243_ != 0) {
		    int i_1248_ = Class436.anIntArray4831[i_1243_];
		    int i_1249_ = Class436.anIntArray4838[i_1243_];
		    int i_1250_
			= ((anIntArray9069[i_1247_] * i_1248_
			    + anIntArray9052[i_1247_] * i_1249_ + 16383)
			   >> 14);
		    anIntArray9069[i_1247_]
			= (anIntArray9069[i_1247_] * i_1249_
			   - anIntArray9052[i_1247_] * i_1248_ + 16383) >> 14;
		    anIntArray9052[i_1247_] = i_1250_;
		}
		if (i_1241_ != 0) {
		    int i_1251_ = Class436.anIntArray4831[i_1241_];
		    int i_1252_ = Class436.anIntArray4838[i_1241_];
		    int i_1253_
			= ((anIntArray9069[i_1247_] * i_1252_
			    - anIntArray9054[i_1247_] * i_1251_ + 16383)
			   >> 14);
		    anIntArray9054[i_1247_]
			= (anIntArray9069[i_1247_] * i_1251_
			   + anIntArray9054[i_1247_] * i_1252_ + 16383) >> 14;
		    anIntArray9069[i_1247_] = i_1253_;
		}
		if (i_1242_ != 0) {
		    int i_1254_ = Class436.anIntArray4831[i_1242_];
		    int i_1255_ = Class436.anIntArray4838[i_1242_];
		    int i_1256_
			= ((anIntArray9054[i_1247_] * i_1254_
			    + anIntArray9052[i_1247_] * i_1255_ + 16383)
			   >> 14);
		    anIntArray9054[i_1247_]
			= (anIntArray9054[i_1247_] * i_1255_
			   - anIntArray9052[i_1247_] * i_1254_ + 16383) >> 14;
		    anIntArray9052[i_1247_] = i_1256_;
		}
		anIntArray9052[i_1247_] += anInt9108;
		anIntArray9069[i_1247_] += anInt9109;
		anIntArray9054[i_1247_] += anInt9050;
	    }
	} else if (i == 3) {
	    for (int i_1257_ = 0; i_1257_ < anInt9072; i_1257_++) {
		anIntArray9052[i_1257_] -= anInt9108;
		anIntArray9069[i_1257_] -= anInt9109;
		anIntArray9054[i_1257_] -= anInt9050;
		anIntArray9052[i_1257_]
		    = anIntArray9052[i_1257_] * i_1241_ / 128;
		anIntArray9069[i_1257_]
		    = anIntArray9069[i_1257_] * i_1242_ / 128;
		anIntArray9054[i_1257_]
		    = anIntArray9054[i_1257_] * i_1243_ / 128;
		anIntArray9052[i_1257_] += anInt9108;
		anIntArray9069[i_1257_] += anInt9109;
		anIntArray9054[i_1257_] += anInt9050;
	    }
	} else if (i == 5) {
	    for (int i_1258_ = 0; i_1258_ < anInt9065; i_1258_++) {
		int i_1259_ = (aByteArray9068[i_1258_] & 0xff) + i_1241_ * 8;
		if (i_1259_ < 0)
		    i_1259_ = 0;
		else if (i_1259_ > 255)
		    i_1259_ = 255;
		aByteArray9068[i_1258_] = (byte) i_1259_;
	    }
	    if (aClass137_9076 != null)
		aClass137_9076.anInterface15_1635 = null;
	    if (aClass148Array9100 != null) {
		for (int i_1260_ = 0; i_1260_ < anInt9074; i_1260_++) {
		    Class148 class148 = aClass148Array9100[i_1260_];
		    Class131 class131 = aClass131Array9101[i_1260_];
		    class131.anInt1582
			= (class131.anInt1582 & 0xffffff
			   | (255 - (aByteArray9068[class148.anInt1694] & 0xff)
			      << 24));
		}
	    }
	} else if (i == 7) {
	    for (int i_1261_ = 0; i_1261_ < anInt9065; i_1261_++) {
		int i_1262_ = aShortArray9067[i_1261_] & 0xffff;
		int i_1263_ = i_1262_ >> 10 & 0x3f;
		int i_1264_ = i_1262_ >> 7 & 0x7;
		int i_1265_ = i_1262_ & 0x7f;
		i_1263_ = i_1263_ + i_1241_ & 0x3f;
		i_1264_ += i_1242_ / 4;
		if (i_1264_ < 0)
		    i_1264_ = 0;
		else if (i_1264_ > 7)
		    i_1264_ = 7;
		i_1265_ += i_1243_;
		if (i_1265_ < 0)
		    i_1265_ = 0;
		else if (i_1265_ > 127)
		    i_1265_ = 127;
		aShortArray9067[i_1261_]
		    = (short) (i_1263_ << 10 | i_1264_ << 7 | i_1265_);
	    }
	    if (aClass137_9076 != null)
		aClass137_9076.anInterface15_1635 = null;
	    if (aClass148Array9100 != null) {
		for (int i_1266_ = 0; i_1266_ < anInt9074; i_1266_++) {
		    Class148 class148 = aClass148Array9100[i_1266_];
		    Class131 class131 = aClass131Array9101[i_1266_];
		    class131.anInt1582
			= (class131.anInt1582 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9067[class148.anInt1694] & 0xffff])
			      & 0xffffff));
		}
	    }
	} else if (i == 8) {
	    for (int i_1267_ = 0; i_1267_ < anInt9074; i_1267_++) {
		Class131 class131 = aClass131Array9101[i_1267_];
		class131.anInt1583 += i_1241_;
		class131.anInt1585 += i_1242_;
	    }
	} else if (i == 10) {
	    for (int i_1268_ = 0; i_1268_ < anInt9074; i_1268_++) {
		Class131 class131 = aClass131Array9101[i_1268_];
		class131.anInt1581 = class131.anInt1581 * i_1241_ >> 7;
		class131.anInt1584 = class131.anInt1584 * i_1242_ >> 7;
	    }
	} else if (i == 9) {
	    for (int i_1269_ = 0; i_1269_ < anInt9074; i_1269_++) {
		Class131 class131 = aClass131Array9101[i_1269_];
		class131.anInt1586 = class131.anInt1586 + i_1241_ & 0x3fff;
	    }
	}
    }
    
    public void method3016(Class444 class444, Class211 class211, int i) {
	if ((i & 0x2) != 0)
	    OpenGL.glPolygonMode(1032, 6913);
	if (anInt9057 != 0) {
	    Class435 class435 = aClass182_Sub3_9041.aClass435_9717;
	    Class435 class435_1270_ = aClass182_Sub3_9041.aClass435_9731;
	    Class435 class435_1271_ = aClass182_Sub3_9041.aClass435_9646;
	    class435_1270_.method7040(class444);
	    class435_1271_.method6947(class435_1270_);
	    class435_1271_.method6950(aClass182_Sub3_9041.aClass435_9710);
	    if (!aBool9085)
		method14558();
	    float[] fs = aClass182_Sub3_9041.aFloatArray9752;
	    class435_1270_.method6956(0.0F, (float) aShort9086, 0.0F, fs);
	    float f = fs[0];
	    float f_1272_ = fs[1];
	    float f_1273_ = fs[2];
	    class435_1270_.method6956(0.0F, (float) aShort9103, 0.0F, fs);
	    float f_1274_ = fs[0];
	    float f_1275_ = fs[1];
	    float f_1276_ = fs[2];
	    for (int i_1277_ = 0; i_1277_ < 6; i_1277_++) {
		float[] fs_1278_
		    = aClass182_Sub3_9041.aFloatArrayArray9720[i_1277_];
		float f_1279_ = (fs_1278_[0] * f + fs_1278_[1] * f_1272_
				 + fs_1278_[2] * f_1273_ + fs_1278_[3]
				 + (float) anInt9084);
		float f_1280_ = (fs_1278_[0] * f_1274_ + fs_1278_[1] * f_1275_
				 + fs_1278_[2] * f_1276_ + fs_1278_[3]
				 + (float) anInt9084);
		if (f_1279_ < 0.0F && f_1280_ < 0.0F)
		    return;
	    }
	    if (class211 != null) {
		boolean bool = false;
		boolean bool_1281_ = true;
		int i_1282_ = aShort9088 + aShort9089 >> 1;
		int i_1283_ = aShort9090 + aShort9102 >> 1;
		int i_1284_ = i_1282_;
		short i_1285_ = aShort9086;
		int i_1286_ = i_1283_;
		float f_1287_
		    = (class435_1271_.aFloatArray4830[0] * (float) i_1284_
		       + class435_1271_.aFloatArray4830[4] * (float) i_1285_
		       + class435_1271_.aFloatArray4830[8] * (float) i_1286_
		       + class435_1271_.aFloatArray4830[12]);
		float f_1288_
		    = (class435_1271_.aFloatArray4830[1] * (float) i_1284_
		       + class435_1271_.aFloatArray4830[5] * (float) i_1285_
		       + class435_1271_.aFloatArray4830[9] * (float) i_1286_
		       + class435_1271_.aFloatArray4830[13]);
		float f_1289_
		    = (class435_1271_.aFloatArray4830[2] * (float) i_1284_
		       + class435_1271_.aFloatArray4830[6] * (float) i_1285_
		       + class435_1271_.aFloatArray4830[10] * (float) i_1286_
		       + class435_1271_.aFloatArray4830[14]);
		float f_1290_
		    = (class435_1271_.aFloatArray4830[3] * (float) i_1284_
		       + class435_1271_.aFloatArray4830[7] * (float) i_1285_
		       + class435_1271_.aFloatArray4830[11] * (float) i_1286_
		       + class435_1271_.aFloatArray4830[15]);
		if (f_1289_ >= -f_1290_) {
		    class211.anInt2264
			= (int) (aClass182_Sub3_9041.aFloat9799
				 + (aClass182_Sub3_9041.aFloat9723 * f_1287_
				    / f_1290_));
		    class211.anInt2266
			= (int) (aClass182_Sub3_9041.aFloat9651
				 + (aClass182_Sub3_9041.aFloat9725 * f_1288_
				    / f_1290_));
		} else
		    bool = true;
		i_1284_ = i_1282_;
		i_1285_ = aShort9103;
		i_1286_ = i_1283_;
		float f_1291_
		    = (class435_1271_.aFloatArray4830[0] * (float) i_1284_
		       + class435_1271_.aFloatArray4830[4] * (float) i_1285_
		       + class435_1271_.aFloatArray4830[8] * (float) i_1286_
		       + class435_1271_.aFloatArray4830[12]);
		float f_1292_
		    = (class435_1271_.aFloatArray4830[1] * (float) i_1284_
		       + class435_1271_.aFloatArray4830[5] * (float) i_1285_
		       + class435_1271_.aFloatArray4830[9] * (float) i_1286_
		       + class435_1271_.aFloatArray4830[13]);
		float f_1293_
		    = (class435_1271_.aFloatArray4830[2] * (float) i_1284_
		       + class435_1271_.aFloatArray4830[6] * (float) i_1285_
		       + class435_1271_.aFloatArray4830[10] * (float) i_1286_
		       + class435_1271_.aFloatArray4830[14]);
		float f_1294_
		    = (class435_1271_.aFloatArray4830[3] * (float) i_1284_
		       + class435_1271_.aFloatArray4830[7] * (float) i_1285_
		       + class435_1271_.aFloatArray4830[11] * (float) i_1286_
		       + class435_1271_.aFloatArray4830[15]);
		if (f_1293_ >= -f_1294_) {
		    class211.anInt2263
			= (int) (aClass182_Sub3_9041.aFloat9799
				 + (aClass182_Sub3_9041.aFloat9723 * f_1291_
				    / f_1294_));
		    class211.anInt2267
			= (int) (aClass182_Sub3_9041.aFloat9651
				 + (aClass182_Sub3_9041.aFloat9725 * f_1292_
				    / f_1294_));
		} else
		    bool = true;
		if (bool) {
		    if (f_1289_ < -f_1290_ && f_1293_ < -f_1294_)
			bool_1281_ = false;
		    else if (f_1289_ < -f_1290_) {
			float f_1295_
			    = (f_1289_ + f_1290_) / (f_1293_ + f_1294_) - 1.0F;
			float f_1296_
			    = f_1287_ + f_1295_ * (f_1291_ - f_1287_);
			float f_1297_
			    = f_1288_ + f_1295_ * (f_1292_ - f_1288_);
			float f_1298_
			    = f_1290_ + f_1295_ * (f_1294_ - f_1290_);
			class211.anInt2264
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     + (aClass182_Sub3_9041.aFloat9723
					* f_1296_ / f_1298_));
			class211.anInt2266
			    = (int) (aClass182_Sub3_9041.aFloat9651
				     + (aClass182_Sub3_9041.aFloat9725
					* f_1297_ / f_1298_));
		    } else if (f_1293_ < -f_1294_) {
			float f_1299_
			    = (f_1293_ + f_1294_) / (f_1289_ + f_1290_) - 1.0F;
			float f_1300_
			    = f_1291_ + f_1299_ * (f_1287_ - f_1291_);
			float f_1301_
			    = f_1292_ + f_1299_ * (f_1288_ - f_1292_);
			float f_1302_
			    = f_1294_ + f_1299_ * (f_1290_ - f_1294_);
			class211.anInt2263
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     + (aClass182_Sub3_9041.aFloat9723
					* f_1300_ / f_1302_));
			class211.anInt2267
			    = (int) (aClass182_Sub3_9041.aFloat9651
				     + (aClass182_Sub3_9041.aFloat9725
					* f_1301_ / f_1302_));
		    }
		}
		if (bool_1281_) {
		    if (f_1289_ / f_1290_ > f_1293_ / f_1294_) {
			float f_1303_ = (f_1287_
					 + (class435.aFloatArray4830[0]
					    * (float) anInt9084)
					 + class435.aFloatArray4830[12]);
			float f_1304_ = (f_1290_
					 + (class435.aFloatArray4830[3]
					    * (float) anInt9084)
					 + class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     - (float) class211.anInt2264
				     + (aClass182_Sub3_9041.aFloat9723
					* f_1303_ / f_1304_));
		    } else {
			float f_1305_ = (f_1291_
					 + (class435.aFloatArray4830[0]
					    * (float) anInt9084)
					 + class435.aFloatArray4830[12]);
			float f_1306_ = (f_1294_
					 + (class435.aFloatArray4830[3]
					    * (float) anInt9084)
					 + class435.aFloatArray4830[15]);
			class211.anInt2268
			    = (int) (aClass182_Sub3_9041.aFloat9799
				     - (float) class211.anInt2263
				     + (aClass182_Sub3_9041.aFloat9723
					* f_1305_ / f_1306_));
		    }
		    class211.aBool2265 = true;
		}
	    }
	    aClass182_Sub3_9041.method15390();
	    aClass182_Sub3_9041.method15357(class435_1270_);
	    method14560();
	    aClass182_Sub3_9041.method15451();
	    class435_1270_.method6950(aClass182_Sub3_9041.aClass435_9715);
	    method14562(class435_1270_);
	    if ((i & 0x2) != 0)
		OpenGL.glPolygonMode(1028, 6914);
	}
    }
    
    Class179_Sub1(Class182_Sub3 class182_sub3, ModelDecoder class186, int i,
                  int i_1307_, int i_1308_, int i_1309_) {
	anInt9057 = 0;
	anInt9065 = 0;
	anInt9111 = 0;
	aBool9095 = true;
	aBool9085 = false;
	aBool9092 = false;
	aClass182_Sub3_9041 = class182_sub3;
	anInt9043 = i;
	anInt9080 = i_1309_;
	if (Class125.method2141(i, i_1309_))
	    aClass137_9075 = new Class137(null, 5126, 3, 0);
	if (Class125.method2205(i, i_1309_))
	    aClass137_9078 = new Class137(null, 5126, 2, 0);
	if (Class125.method2142(i, i_1309_))
	    aClass137_9051 = new Class137(null, 5126, 3, 0);
	if (Class125.method2143(i, i_1309_))
	    aClass137_9076 = new Class137(null, 5121, 4, 0);
	if (Class125.method2155(i, i_1309_))
	    aClass139_9079 = new Class139();
	Textures class180 = class182_sub3.aClass180_1944;
	Interface47 interface47 = class182_sub3.anInterface47_1945;
	int[] is = new int[class186.faceCount];
	anIntArray9046 = new int[class186.maxVertexUsed + 1];
	for (int i_1310_ = 0; i_1310_ < class186.faceCount; i_1310_++) {
	    if (class186.faceRenderTypes == null
		|| class186.faceRenderTypes[i_1310_] != 2) {
		if (class186.aShortArray2110 != null
		    && class186.aShortArray2110[i_1310_] != -1) {
		    TextureMetrics class166
			= class180.method3116((class186.aShortArray2110
					       [i_1310_]) & 0xffff,
					      -1431554601);
		    if (((anInt9080 & 0x40) == 0 || !class166.aBool1819)
			&& class166.aBool1829)
			continue;
		}
		is[anInt9065++] = i_1310_;
		anIntArray9046[class186.faceA[i_1310_]]++;
		anIntArray9046[class186.faceB[i_1310_]]++;
		anIntArray9046[class186.faceC[i_1310_]]++;
	    }
	}
	anInt9111 = anInt9065;
	long[] ls = new long[anInt9065];
	boolean bool = (anInt9043 & 0x100) != 0;
	for (int i_1311_ = 0; i_1311_ < anInt9065; i_1311_++) {
	    int i_1312_ = is[i_1311_];
	    TextureMetrics class166 = null;
	    int i_1313_ = 0;
	    int i_1314_ = 0;
	    int i_1315_ = 0;
	    int i_1316_ = 0;
	    if (class186.aClass171Array2088 != null) {
		boolean bool_1317_ = false;
		for (int i_1318_ = 0;
		     i_1318_ < class186.aClass171Array2088.length; i_1318_++) {
		    Class171 class171 = class186.aClass171Array2088[i_1318_];
		    if (i_1312_ == class171.anInt1856 * 553052305) {
			Class394 class394
			    = interface47.method338((class171.anInt1855
						     * -145881707),
						    (short) 800);
			if (class394.aBool4099)
			    bool_1317_ = true;
			if (class394.anInt4094 * 836405987 != -1) {
			    TextureMetrics class166_1319_
				= class180.method3116((class394.anInt4094
						       * 836405987),
						      -1431554601);
			    if (class166_1319_.aClass597_1807
				== Class597.aClass597_7841)
				aBool9045 = true;
			}
		    }
		}
		if (bool_1317_) {
		    ls[i_1311_] = 9223372036854775807L;
		    anInt9111--;
		    continue;
		}
	    }
	    if (class186.aClass184Array2129 != null) {
		boolean bool_1320_ = false;
		for (int i_1321_ = 0;
		     i_1321_ < class186.aClass184Array2129.length; i_1321_++) {
		    Class184 class184 = class186.aClass184Array2129[i_1321_];
		    if (i_1312_ == class184.anInt2065 * -1426233023) {
			Class382 class382
			    = (aClass182_Sub3_9041.anInterface48_1946.method340
			       (class184.anInt2064 * -1912121795, 2116345368));
			if (class382.aBool3983)
			    bool_1320_ = true;
		    }
		}
		if (bool_1320_) {
		    ls[i_1311_] = 9223372036854775807L;
		    anInt9111--;
		    continue;
		}
	    }
	    int i_1322_ = -1;
	    if (class186.aShortArray2110 != null) {
		i_1322_ = class186.aShortArray2110[i_1312_];
		if (i_1322_ != -1) {
		    class166
			= class180.method3116(i_1322_ & 0xffff, -1431554601);
		    if ((anInt9080 & 0x40) == 0 || !class166.aBool1819) {
			i_1315_ = class166.aByte1825;
			i_1316_ = class166.aByte1826;
			if (class166.aByte1805 != 0 || class166.aByte1806 != 0)
			    aBool9049 = true;
		    } else {
			i_1322_ = -1;
			class166 = null;
		    }
		}
	    }
	    boolean bool_1323_
		= ((class186.faceAlpha != null
		    && class186.faceAlpha[i_1312_] != 0)
		   || (class166 != null
		       && class166.aClass597_1807 != Class597.aClass597_7842));
	    if ((bool || bool_1323_) && class186.facePriorities != null)
		i_1313_ += class186.facePriorities[i_1312_] << 17;
	    if (bool_1323_)
		i_1313_ += 65536;
	    i_1313_ += (i_1315_ & 0xff) << 8;
	    i_1313_ += i_1316_ & 0xff;
	    i_1314_ += (i_1322_ & 0xffff) << 16;
	    i_1314_ += i_1311_ & 0xffff;
	    ls[i_1311_] = ((long) i_1313_ << 32) + (long) i_1314_;
	    aBool9045 |= bool_1323_;
	    Class179_Sub1 class179_sub1_1324_ = this;
	    class179_sub1_1324_.aBool9049
		= (class179_sub1_1324_.aBool9049
		   | (class166 != null && (class166.aByte1805 != 0
					   || class166.aByte1806 != 0)));
	}
	Class28.method912(ls, is, (byte) 1);
	anInt9062 = class186.vertexCount;
	anInt9072 = class186.maxVertexUsed;
	anIntArray9052 = class186.vertexX;
	anIntArray9069 = class186.vertexY;
	anIntArray9054 = class186.vertexZ;
	aShortArray9056 = class186.aShortArray2094;
	Class141[] class141s = new Class141[anInt9072];
	aClass184Array9097 = class186.aClass184Array2129;
	aClass154Array9098 = class186.aClass154Array2093;
	if (class186.aClass171Array2088 != null) {
	    anInt9074 = class186.aClass171Array2088.length;
	    aClass148Array9100 = new Class148[anInt9074];
	    aClass131Array9101 = new Class131[anInt9074];
	    for (int i_1325_ = 0; i_1325_ < anInt9074; i_1325_++) {
		Class171 class171 = class186.aClass171Array2088[i_1325_];
		Class394 class394
		    = interface47.method338(class171.anInt1855 * -145881707,
					    (short) 800);
		int i_1326_ = -1;
		for (int i_1327_ = 0; i_1327_ < anInt9065; i_1327_++) {
		    if (is[i_1327_] == class171.anInt1856 * 553052305) {
			i_1326_ = i_1327_;
			break;
		    }
		}
		if (i_1326_ == -1)
		    throw new RuntimeException();
		int i_1328_ = ((Class642.anIntArray8324
				[(class186.aShortArray2109
				  [class171.anInt1856 * 553052305]) & 0xffff])
			       & 0xffffff);
		i_1328_ = i_1328_ | 255 - (class186.faceAlpha != null
					   ? (class186.faceAlpha
					      [class171.anInt1856 * 553052305])
					   : 0) << 24;
		aClass148Array9100[i_1325_]
		    = new Class148(i_1326_,
				   (class186.faceA
				    [class171.anInt1856 * 553052305]),
				   (class186.faceB
				    [class171.anInt1856 * 553052305]),
				   (class186.faceC
				    [class171.anInt1856 * 553052305]),
				   class394.anInt4092 * 1011185193,
				   class394.anInt4095 * -1869723579,
				   class394.anInt4094 * 836405987,
				   class394.anInt4097 * 208895961,
				   class394.anInt4093 * -101232969,
				   class394.aBool4099, class394.aBool4098,
				   class171.anInt1858 * -998013967);
		aClass131Array9101[i_1325_] = new Class131(i_1328_);
	    }
	}
	int i_1329_ = anInt9065 * 3;
	aShortArray9073 = new short[i_1329_];
	aShortArray9059 = new short[i_1329_];
	aShortArray9060 = new short[i_1329_];
	aByteArray9061 = new byte[i_1329_];
	aFloatArray9058 = new float[i_1329_];
	aFloatArray9064 = new float[i_1329_];
	aShortArray9067 = new short[anInt9065];
	aByteArray9068 = new byte[anInt9065];
	aShortArray9091 = new short[anInt9065];
	aShortArray9070 = new short[anInt9065];
	aShortArray9071 = new short[anInt9065];
	aShortArray9039 = new short[anInt9065];
	if (class186.aShortArray2113 != null)
	    aShortArray9044 = new short[anInt9065];
	aShort9110 = (short) i_1307_;
	aShort9047 = (short) i_1308_;
	aShortArray9096 = new short[i_1329_];
	aLongArray9087 = new long[i_1329_];
	int i_1330_ = 0;
	for (int i_1331_ = 0; i_1331_ < class186.maxVertexUsed; i_1331_++) {
	    int i_1332_ = anIntArray9046[i_1331_];
	    anIntArray9046[i_1331_] = i_1330_;
	    i_1330_ += i_1332_;
	    class141s[i_1331_] = new Class141();
	}
	anIntArray9046[class186.maxVertexUsed] = i_1330_;
	Class207 class207 = method2976(class186, is, anInt9065);
	Class120[] class120s = new Class120[class186.faceCount];
	for (int i_1333_ = 0; i_1333_ < class186.faceCount; i_1333_++) {
	    short i_1334_ = class186.faceA[i_1333_];
	    short i_1335_ = class186.faceB[i_1333_];
	    short i_1336_ = class186.faceC[i_1333_];
	    int i_1337_ = anIntArray9052[i_1335_] - anIntArray9052[i_1334_];
	    int i_1338_ = anIntArray9069[i_1335_] - anIntArray9069[i_1334_];
	    int i_1339_ = anIntArray9054[i_1335_] - anIntArray9054[i_1334_];
	    int i_1340_ = anIntArray9052[i_1336_] - anIntArray9052[i_1334_];
	    int i_1341_ = anIntArray9069[i_1336_] - anIntArray9069[i_1334_];
	    int i_1342_ = anIntArray9054[i_1336_] - anIntArray9054[i_1334_];
	    int i_1343_ = i_1338_ * i_1342_ - i_1341_ * i_1339_;
	    int i_1344_ = i_1339_ * i_1340_ - i_1342_ * i_1337_;
	    int i_1345_;
	    for (i_1345_ = i_1337_ * i_1341_ - i_1340_ * i_1338_;
		 (i_1343_ > 8192 || i_1344_ > 8192 || i_1345_ > 8192
		  || i_1343_ < -8192 || i_1344_ < -8192 || i_1345_ < -8192);
		 i_1345_ >>= 1) {
		i_1343_ >>= 1;
		i_1344_ >>= 1;
	    }
	    int i_1346_ = (int) Math.sqrt((double) (i_1343_ * i_1343_
						    + i_1344_ * i_1344_
						    + i_1345_ * i_1345_));
	    if (i_1346_ <= 0)
		i_1346_ = 1;
	    i_1343_ = i_1343_ * 256 / i_1346_;
	    i_1344_ = i_1344_ * 256 / i_1346_;
	    i_1345_ = i_1345_ * 256 / i_1346_;
	    byte i_1347_ = (class186.faceRenderTypes == null ? (byte) 0
			    : class186.faceRenderTypes[i_1333_]);
	    if (i_1347_ == 0) {
		Class141 class141 = class141s[i_1334_];
		class141.anInt1657 += i_1343_;
		class141.anInt1658 += i_1344_;
		class141.anInt1656 += i_1345_;
		class141.anInt1659++;
		class141 = class141s[i_1335_];
		class141.anInt1657 += i_1343_;
		class141.anInt1658 += i_1344_;
		class141.anInt1656 += i_1345_;
		class141.anInt1659++;
		class141 = class141s[i_1336_];
		class141.anInt1657 += i_1343_;
		class141.anInt1658 += i_1344_;
		class141.anInt1656 += i_1345_;
		class141.anInt1659++;
	    } else if (i_1347_ == 1) {
		Class120 class120 = class120s[i_1333_] = new Class120();
		class120.anInt1441 = i_1343_;
		class120.anInt1440 = i_1344_;
		class120.anInt1442 = i_1345_;
	    }
	}
	for (int i_1348_ = 0; i_1348_ < anInt9065; i_1348_++) {
	    int i_1349_ = is[i_1348_];
	    int i_1350_ = class186.aShortArray2109[i_1349_] & 0xffff;
	    int i_1351_ = (class186.faceAlpha != null
			   ? class186.faceAlpha[i_1349_] & 0xff : 0);
	    short i_1352_ = (class186.aShortArray2110 == null ? (short) -1
			     : class186.aShortArray2110[i_1349_]);
	    if (i_1352_ != -1 && (anInt9080 & 0x40) != 0
		&& class180.method3116(i_1352_, -1431554601).aBool1819)
		i_1352_ = (short) -1;
	    float f = 0.0F;
	    float f_1353_ = 0.0F;
	    float f_1354_ = 0.0F;
	    float f_1355_ = 0.0F;
	    float f_1356_ = 0.0F;
	    float f_1357_ = 0.0F;
	    long l;
	    long l_1358_;
	    long l_1359_;
	    if (i_1352_ != -1) {
		int i_1360_ = (class186.aShortArray2122 != null
			       ? class186.aShortArray2122[i_1349_] : -1);
		if (i_1360_ == 32766) {
		    int i_1361_ = class186.aByteArray2102[i_1349_] & 0xff;
		    int i_1362_ = class186.aByteArray2092[i_1349_] & 0xff;
		    int i_1363_ = class186.aByteArray2104[i_1349_] & 0xff;
		    i_1361_ += (class186.anIntArray2103
				[class186.faceA[i_1349_]]);
		    l_1359_ = (long) i_1361_;
		    i_1362_ += (class186.anIntArray2103
				[class186.faceB[i_1349_]]);
		    l_1358_ = (long) i_1361_;
		    i_1363_ += (class186.anIntArray2103
				[class186.faceC[i_1349_]]);
		    l = (long) i_1361_;
		    f = class186.aFloatArray2096[i_1361_];
		    f_1353_ = class186.aFloatArray2097[i_1361_];
		    f_1354_ = class186.aFloatArray2096[i_1362_];
		    f_1355_ = class186.aFloatArray2097[i_1362_];
		    f_1356_ = class186.aFloatArray2096[i_1363_];
		    f_1357_ = class186.aFloatArray2097[i_1363_];
		} else if (i_1360_ == -1) {
		    f = 0.0F;
		    f_1353_ = 1.0F;
		    l_1359_ = 65535L;
		    f_1354_ = 1.0F;
		    f_1355_ = 1.0F;
		    l_1358_ = 131071L;
		    f_1356_ = 0.0F;
		    f_1357_ = 0.0F;
		    l = 196607L;
		} else {
		    i_1360_ &= 0xffff;
		    int i_1364_ = 0;
		    int i_1365_ = 0;
		    int i_1366_ = 0;
		    byte i_1367_ = class186.textureRenderTypes[i_1360_];
		    if (i_1367_ == 0) {
			short i_1368_ = class186.faceA[i_1349_];
			short i_1369_ = class186.faceB[i_1349_];
			short i_1370_ = class186.faceC[i_1349_];
			short i_1371_ = class186.aShortArray2118[i_1360_];
			short i_1372_ = class186.aShortArray2119[i_1360_];
			short i_1373_ = class186.aShortArray2120[i_1360_];
			float f_1374_
			    = (float) class186.vertexX[i_1371_];
			float f_1375_
			    = (float) class186.vertexY[i_1371_];
			float f_1376_
			    = (float) class186.vertexZ[i_1371_];
			float f_1377_
			    = ((float) class186.vertexX[i_1372_]
			       - f_1374_);
			float f_1378_
			    = ((float) class186.vertexY[i_1372_]
			       - f_1375_);
			float f_1379_
			    = ((float) class186.vertexZ[i_1372_]
			       - f_1376_);
			float f_1380_
			    = ((float) class186.vertexX[i_1373_]
			       - f_1374_);
			float f_1381_
			    = ((float) class186.vertexY[i_1373_]
			       - f_1375_);
			float f_1382_
			    = ((float) class186.vertexZ[i_1373_]
			       - f_1376_);
			float f_1383_
			    = ((float) class186.vertexX[i_1368_]
			       - f_1374_);
			float f_1384_
			    = ((float) class186.vertexY[i_1368_]
			       - f_1375_);
			float f_1385_
			    = ((float) class186.vertexZ[i_1368_]
			       - f_1376_);
			float f_1386_
			    = ((float) class186.vertexX[i_1369_]
			       - f_1374_);
			float f_1387_
			    = ((float) class186.vertexY[i_1369_]
			       - f_1375_);
			float f_1388_
			    = ((float) class186.vertexZ[i_1369_]
			       - f_1376_);
			float f_1389_
			    = ((float) class186.vertexX[i_1370_]
			       - f_1374_);
			float f_1390_
			    = ((float) class186.vertexY[i_1370_]
			       - f_1375_);
			float f_1391_
			    = ((float) class186.vertexZ[i_1370_]
			       - f_1376_);
			float f_1392_ = f_1378_ * f_1382_ - f_1379_ * f_1381_;
			float f_1393_ = f_1379_ * f_1380_ - f_1377_ * f_1382_;
			float f_1394_ = f_1377_ * f_1381_ - f_1378_ * f_1380_;
			float f_1395_ = f_1381_ * f_1394_ - f_1382_ * f_1393_;
			float f_1396_ = f_1382_ * f_1392_ - f_1380_ * f_1394_;
			float f_1397_ = f_1380_ * f_1393_ - f_1381_ * f_1392_;
			float f_1398_
			    = 1.0F / (f_1395_ * f_1377_ + f_1396_ * f_1378_
				      + f_1397_ * f_1379_);
			f = (f_1395_ * f_1383_ + f_1396_ * f_1384_
			     + f_1397_ * f_1385_) * f_1398_;
			f_1354_ = (f_1395_ * f_1386_ + f_1396_ * f_1387_
				   + f_1397_ * f_1388_) * f_1398_;
			f_1356_ = (f_1395_ * f_1389_ + f_1396_ * f_1390_
				   + f_1397_ * f_1391_) * f_1398_;
			f_1395_ = f_1378_ * f_1394_ - f_1379_ * f_1393_;
			f_1396_ = f_1379_ * f_1392_ - f_1377_ * f_1394_;
			f_1397_ = f_1377_ * f_1393_ - f_1378_ * f_1392_;
			f_1398_ = 1.0F / (f_1395_ * f_1380_ + f_1396_ * f_1381_
					  + f_1397_ * f_1382_);
			f_1353_ = (f_1395_ * f_1383_ + f_1396_ * f_1384_
				   + f_1397_ * f_1385_) * f_1398_;
			f_1355_ = (f_1395_ * f_1386_ + f_1396_ * f_1387_
				   + f_1397_ * f_1388_) * f_1398_;
			f_1357_ = (f_1395_ * f_1389_ + f_1396_ * f_1390_
				   + f_1397_ * f_1391_) * f_1398_;
		    } else {
			short i_1399_ = class186.faceA[i_1349_];
			short i_1400_ = class186.faceB[i_1349_];
			short i_1401_ = class186.faceC[i_1349_];
			int i_1402_ = class207.anIntArray2249[i_1360_];
			int i_1403_ = class207.anIntArray2248[i_1360_];
			int i_1404_ = class207.anIntArray2246[i_1360_];
			float[] fs = class207.aFloatArrayArray2247[i_1360_];
			byte i_1405_ = class186.aByteArray2091[i_1360_];
			float f_1406_
			    = ((float) class186.anIntArray2124[i_1360_]
			       / 256.0F);
			if (i_1367_ == 1) {
			    float f_1407_
				= ((float) class186.anIntArray2123[i_1360_]
				   / 1024.0F);
			    method2921(class186.vertexX[i_1399_],
				       class186.vertexY[i_1399_],
				       class186.vertexZ[i_1399_],
				       i_1402_, i_1403_, i_1404_, fs, f_1407_,
				       i_1405_, f_1406_, aFloatArray9104);
			    f = aFloatArray9104[0];
			    f_1353_ = aFloatArray9104[1];
			    method2921(class186.vertexX[i_1400_],
				       class186.vertexY[i_1400_],
				       class186.vertexZ[i_1400_],
				       i_1402_, i_1403_, i_1404_, fs, f_1407_,
				       i_1405_, f_1406_, aFloatArray9104);
			    f_1354_ = aFloatArray9104[0];
			    f_1355_ = aFloatArray9104[1];
			    method2921(class186.vertexX[i_1401_],
				       class186.vertexY[i_1401_],
				       class186.vertexZ[i_1401_],
				       i_1402_, i_1403_, i_1404_, fs, f_1407_,
				       i_1405_, f_1406_, aFloatArray9104);
			    f_1356_ = aFloatArray9104[0];
			    f_1357_ = aFloatArray9104[1];
			    float f_1408_ = f_1407_ / 2.0F;
			    if ((i_1405_ & 0x1) == 0) {
				if (f_1354_ - f > f_1408_) {
				    f_1354_ -= f_1407_;
				    i_1365_ = 1;
				} else if (f - f_1354_ > f_1408_) {
				    f_1354_ += f_1407_;
				    i_1365_ = 2;
				}
				if (f_1356_ - f > f_1408_) {
				    f_1356_ -= f_1407_;
				    i_1366_ = 1;
				} else if (f - f_1356_ > f_1408_) {
				    f_1356_ += f_1407_;
				    i_1366_ = 2;
				}
			    } else {
				if (f_1355_ - f_1353_ > f_1408_) {
				    f_1355_ -= f_1407_;
				    i_1365_ = 1;
				} else if (f_1353_ - f_1355_ > f_1408_) {
				    f_1355_ += f_1407_;
				    i_1365_ = 2;
				}
				if (f_1357_ - f_1353_ > f_1408_) {
				    f_1357_ -= f_1407_;
				    i_1366_ = 1;
				} else if (f_1353_ - f_1357_ > f_1408_) {
				    f_1357_ += f_1407_;
				    i_1366_ = 2;
				}
			    }
			} else if (i_1367_ == 2) {
			    float f_1409_
				= ((float) class186.anIntArray2125[i_1360_]
				   / 256.0F);
			    float f_1410_
				= ((float) class186.anIntArray2130[i_1360_]
				   / 256.0F);
			    int i_1411_ = (class186.vertexX[i_1400_]
					   - class186.vertexX[i_1399_]);
			    int i_1412_ = (class186.vertexY[i_1400_]
					   - class186.vertexY[i_1399_]);
			    int i_1413_ = (class186.vertexZ[i_1400_]
					   - class186.vertexZ[i_1399_]);
			    int i_1414_ = (class186.vertexX[i_1401_]
					   - class186.vertexX[i_1399_]);
			    int i_1415_ = (class186.vertexY[i_1401_]
					   - class186.vertexY[i_1399_]);
			    int i_1416_ = (class186.vertexZ[i_1401_]
					   - class186.vertexZ[i_1399_]);
			    int i_1417_
				= i_1412_ * i_1416_ - i_1415_ * i_1413_;
			    int i_1418_
				= i_1413_ * i_1414_ - i_1416_ * i_1411_;
			    int i_1419_
				= i_1411_ * i_1415_ - i_1414_ * i_1412_;
			    float f_1420_
				= (64.0F
				   / (float) class186.anIntArray2121[i_1360_]);
			    float f_1421_
				= (64.0F
				   / (float) class186.anIntArray2114[i_1360_]);
			    float f_1422_
				= (64.0F
				   / (float) class186.anIntArray2123[i_1360_]);
			    float f_1423_ = (((float) i_1417_ * fs[0]
					      + (float) i_1418_ * fs[1]
					      + (float) i_1419_ * fs[2])
					     / f_1420_);
			    float f_1424_ = (((float) i_1417_ * fs[3]
					      + (float) i_1418_ * fs[4]
					      + (float) i_1419_ * fs[5])
					     / f_1421_);
			    float f_1425_ = (((float) i_1417_ * fs[6]
					      + (float) i_1418_ * fs[7]
					      + (float) i_1419_ * fs[8])
					     / f_1422_);
			    i_1364_ = method2922(f_1423_, f_1424_, f_1425_);
			    method3009(class186.vertexX[i_1399_],
				       class186.vertexY[i_1399_],
				       class186.vertexZ[i_1399_],
				       i_1402_, i_1403_, i_1404_, i_1364_, fs,
				       i_1405_, f_1406_, f_1409_, f_1410_,
				       aFloatArray9104);
			    f = aFloatArray9104[0];
			    f_1353_ = aFloatArray9104[1];
			    method3009(class186.vertexX[i_1400_],
				       class186.vertexY[i_1400_],
				       class186.vertexZ[i_1400_],
				       i_1402_, i_1403_, i_1404_, i_1364_, fs,
				       i_1405_, f_1406_, f_1409_, f_1410_,
				       aFloatArray9104);
			    f_1354_ = aFloatArray9104[0];
			    f_1355_ = aFloatArray9104[1];
			    method3009(class186.vertexX[i_1401_],
				       class186.vertexY[i_1401_],
				       class186.vertexZ[i_1401_],
				       i_1402_, i_1403_, i_1404_, i_1364_, fs,
				       i_1405_, f_1406_, f_1409_, f_1410_,
				       aFloatArray9104);
			    f_1356_ = aFloatArray9104[0];
			    f_1357_ = aFloatArray9104[1];
			} else if (i_1367_ == 3) {
			    method3033(class186.vertexX[i_1399_],
				       class186.vertexY[i_1399_],
				       class186.vertexZ[i_1399_],
				       i_1402_, i_1403_, i_1404_, fs, i_1405_,
				       f_1406_, aFloatArray9104);
			    f = aFloatArray9104[0];
			    f_1353_ = aFloatArray9104[1];
			    method3033(class186.vertexX[i_1400_],
				       class186.vertexY[i_1400_],
				       class186.vertexZ[i_1400_],
				       i_1402_, i_1403_, i_1404_, fs, i_1405_,
				       f_1406_, aFloatArray9104);
			    f_1354_ = aFloatArray9104[0];
			    f_1355_ = aFloatArray9104[1];
			    method3033(class186.vertexX[i_1401_],
				       class186.vertexY[i_1401_],
				       class186.vertexZ[i_1401_],
				       i_1402_, i_1403_, i_1404_, fs, i_1405_,
				       f_1406_, aFloatArray9104);
			    f_1356_ = aFloatArray9104[0];
			    f_1357_ = aFloatArray9104[1];
			    if ((i_1405_ & 0x1) == 0) {
				if (f_1354_ - f > 0.5F) {
				    f_1354_--;
				    i_1365_ = 1;
				} else if (f - f_1354_ > 0.5F) {
				    f_1354_++;
				    i_1365_ = 2;
				}
				if (f_1356_ - f > 0.5F) {
				    f_1356_--;
				    i_1366_ = 1;
				} else if (f - f_1356_ > 0.5F) {
				    f_1356_++;
				    i_1366_ = 2;
				}
			    } else {
				if (f_1355_ - f_1353_ > 0.5F) {
				    f_1355_--;
				    i_1365_ = 1;
				} else if (f_1353_ - f_1355_ > 0.5F) {
				    f_1355_++;
				    i_1365_ = 2;
				}
				if (f_1357_ - f_1353_ > 0.5F) {
				    f_1357_--;
				    i_1366_ = 1;
				} else if (f_1353_ - f_1357_ > 0.5F) {
				    f_1357_++;
				    i_1366_ = 2;
				}
			    }
			}
		    }
		    l_1359_ = (long) (i_1364_ << 16 | i_1360_);
		    l_1358_ = (long) (i_1365_ << 19) | l_1359_;
		    l = (long) (i_1366_ << 19) | l_1359_;
		}
	    } else {
		l = 0L;
		l_1358_ = 0L;
		l_1359_ = 0L;
	    }
	    byte i_1426_ = (class186.faceRenderTypes != null
			    ? class186.faceRenderTypes[i_1349_] : (byte) 0);
	    if (i_1426_ == 0) {
		long l_1427_ = (long) ((i_1350_ << 8) + i_1351_);
		short i_1428_ = class186.faceA[i_1349_];
		short i_1429_ = class186.faceB[i_1349_];
		short i_1430_ = class186.faceC[i_1349_];
		Class141 class141 = class141s[i_1428_];
		aShortArray9091[i_1348_]
		    = method14550(class186, i_1428_, l_1427_ | l_1359_ << 24,
				  class141.anInt1657, class141.anInt1658,
				  class141.anInt1656, class141.anInt1659, f,
				  f_1353_);
		class141 = class141s[i_1429_];
		aShortArray9070[i_1348_]
		    = method14550(class186, i_1429_, l_1427_ | l_1358_ << 24,
				  class141.anInt1657, class141.anInt1658,
				  class141.anInt1656, class141.anInt1659,
				  f_1354_, f_1355_);
		class141 = class141s[i_1430_];
		aShortArray9071[i_1348_]
		    = method14550(class186, i_1430_, l_1427_ | l << 24,
				  class141.anInt1657, class141.anInt1658,
				  class141.anInt1656, class141.anInt1659,
				  f_1356_, f_1357_);
	    } else if (i_1426_ == 1) {
		Class120 class120 = class120s[i_1349_];
		long l_1431_
		    = (((long) (class120.anInt1441 & ~0x7fffffff) << 9)
		       + ((long) (class120.anInt1440 + 256) << 32)
		       + ((long) (class120.anInt1442 + 256) << 24)
		       + (long) (i_1350_ << 8) + (long) i_1351_);
		aShortArray9091[i_1348_]
		    = method14550(class186, class186.faceA[i_1349_],
				  l_1431_ | l_1359_ << 41, class120.anInt1441,
				  class120.anInt1440, class120.anInt1442, 0, f,
				  f_1353_);
		aShortArray9070[i_1348_]
		    = method14550(class186, class186.faceB[i_1349_],
				  l_1431_ | l_1359_ << 41, class120.anInt1441,
				  class120.anInt1440, class120.anInt1442, 0,
				  f_1354_, f_1355_);
		aShortArray9071[i_1348_]
		    = method14550(class186, class186.faceC[i_1349_],
				  l_1431_ | l_1359_ << 41, class120.anInt1441,
				  class120.anInt1440, class120.anInt1442, 0,
				  f_1356_, f_1357_);
	    }
	    if (class186.faceAlpha != null)
		aByteArray9068[i_1348_] = class186.faceAlpha[i_1349_];
	    if (class186.aShortArray2113 != null)
		aShortArray9044[i_1348_] = class186.aShortArray2113[i_1349_];
	    aShortArray9067[i_1348_] = class186.aShortArray2109[i_1349_];
	    aShortArray9039[i_1348_] = i_1352_;
	}
	int i_1432_ = 0;
	short i_1433_ = -10000;
	for (int i_1434_ = 0; i_1434_ < anInt9111; i_1434_++) {
	    short i_1435_ = aShortArray9039[i_1434_];
	    if (i_1435_ != i_1433_) {
		i_1432_++;
		i_1433_ = i_1435_;
	    }
	}
	anIntArray9094 = new int[i_1432_ + 1];
	i_1432_ = 0;
	i_1433_ = (short) -10000;
	for (int i_1436_ = 0; i_1436_ < anInt9111; i_1436_++) {
	    short i_1437_ = aShortArray9039[i_1436_];
	    if (i_1437_ != i_1433_) {
		anIntArray9094[i_1432_++] = i_1436_;
		i_1433_ = i_1437_;
	    }
	}
	anIntArray9094[i_1432_] = anInt9111;
	aLongArray9087 = null;
	aShortArray9073 = method14553(aShortArray9073, anInt9057);
	aShortArray9059 = method14553(aShortArray9059, anInt9057);
	aShortArray9060 = method14553(aShortArray9060, anInt9057);
	aByteArray9061 = method14551(aByteArray9061, anInt9057);
	aFloatArray9058 = method14552(aFloatArray9058, anInt9057);
	aFloatArray9064 = method14552(aFloatArray9064, anInt9057);
	if (class186.vertexBones != null
	    && Class125.method2197(i, anInt9080))
	    anIntArrayArray9055 = class186.method3636(false);
	if (class186.aClass171Array2088 != null
	    && Class125.method2209(i, anInt9080))
	    anIntArrayArray9042 = class186.method3630();
	if (class186.faceBones != null
	    && Class125.method2158(i, anInt9080)) {
	    int i_1438_ = 0;
	    int[] is_1439_ = new int[256];
	    for (int i_1440_ = 0; i_1440_ < anInt9065; i_1440_++) {
		int i_1441_ = class186.faceBones[is[i_1440_]];
		if (i_1441_ >= 0) {
		    is_1439_[i_1441_]++;
		    if (i_1441_ > i_1438_)
			i_1438_ = i_1441_;
		}
	    }
	    anIntArrayArray9048 = new int[i_1438_ + 1][];
	    for (int i_1442_ = 0; i_1442_ <= i_1438_; i_1442_++) {
		anIntArrayArray9048[i_1442_] = new int[is_1439_[i_1442_]];
		is_1439_[i_1442_] = 0;
	    }
	    for (int i_1443_ = 0; i_1443_ < anInt9065; i_1443_++) {
		int i_1444_ = class186.faceBones[is[i_1443_]];
		if (i_1444_ >= 0)
		    anIntArrayArray9048[i_1444_][is_1439_[i_1444_]++]
			= i_1443_;
	    }
	}
    }
    
    public void method2965(int i, int i_1445_, int i_1446_) {
	for (int i_1447_ = 0; i_1447_ < anInt9072; i_1447_++) {
	    if (i != 128)
		anIntArray9052[i_1447_] = anIntArray9052[i_1447_] * i >> 7;
	    if (i_1445_ != 128)
		anIntArray9069[i_1447_]
		    = anIntArray9069[i_1447_] * i_1445_ >> 7;
	    if (i_1446_ != 128)
		anIntArray9054[i_1447_]
		    = anIntArray9054[i_1447_] * i_1446_ >> 7;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public boolean method3069(int i, int i_1448_, Class444 class444,
			      boolean bool, int i_1449_) {
	Class435 class435 = aClass182_Sub3_9041.aClass435_9731;
	class435.method7040(class444);
	class435.method6950(aClass182_Sub3_9041.aClass435_9710);
	boolean bool_1450_ = false;
	int i_1451_ = 2147483647;
	int i_1452_ = -2147483648;
	int i_1453_ = 2147483647;
	int i_1454_ = -2147483648;
	if (!aBool9085)
	    method14558();
	int i_1455_ = aShort9089 - aShort9088 >> 1;
	int i_1456_ = aShort9103 - aShort9086 >> 1;
	int i_1457_ = aShort9102 - aShort9090 >> 1;
	int i_1458_ = aShort9088 + i_1455_;
	int i_1459_ = aShort9086 + i_1456_;
	int i_1460_ = aShort9090 + i_1457_;
	int i_1461_ = i_1458_ - (i_1455_ << i_1449_);
	int i_1462_ = i_1459_ - (i_1456_ << i_1449_);
	int i_1463_ = i_1460_ - (i_1457_ << i_1449_);
	int i_1464_ = i_1458_ + (i_1455_ << i_1449_);
	int i_1465_ = i_1459_ + (i_1456_ << i_1449_);
	int i_1466_ = i_1460_ + (i_1457_ << i_1449_);
	anIntArray9105[0] = i_1461_;
	anIntArray9106[0] = i_1462_;
	anIntArray9066[0] = i_1463_;
	anIntArray9105[1] = i_1464_;
	anIntArray9106[1] = i_1462_;
	anIntArray9066[1] = i_1463_;
	anIntArray9105[2] = i_1461_;
	anIntArray9106[2] = i_1465_;
	anIntArray9066[2] = i_1463_;
	anIntArray9105[3] = i_1464_;
	anIntArray9106[3] = i_1465_;
	anIntArray9066[3] = i_1463_;
	anIntArray9105[4] = i_1461_;
	anIntArray9106[4] = i_1462_;
	anIntArray9066[4] = i_1466_;
	anIntArray9105[5] = i_1464_;
	anIntArray9106[5] = i_1462_;
	anIntArray9066[5] = i_1466_;
	anIntArray9105[6] = i_1461_;
	anIntArray9106[6] = i_1465_;
	anIntArray9066[6] = i_1466_;
	anIntArray9105[7] = i_1464_;
	anIntArray9106[7] = i_1465_;
	anIntArray9066[7] = i_1466_;
	for (int i_1467_ = 0; i_1467_ < 8; i_1467_++) {
	    int i_1468_ = anIntArray9105[i_1467_];
	    int i_1469_ = anIntArray9106[i_1467_];
	    int i_1470_ = anIntArray9066[i_1467_];
	    float f = (class435.aFloatArray4830[2] * (float) i_1468_
		       + class435.aFloatArray4830[6] * (float) i_1469_
		       + class435.aFloatArray4830[10] * (float) i_1470_
		       + class435.aFloatArray4830[14]);
	    float f_1471_ = (class435.aFloatArray4830[3] * (float) i_1468_
			     + class435.aFloatArray4830[7] * (float) i_1469_
			     + class435.aFloatArray4830[11] * (float) i_1470_
			     + class435.aFloatArray4830[15]);
	    if (f >= -f_1471_) {
		float f_1472_
		    = (class435.aFloatArray4830[0] * (float) i_1468_
		       + class435.aFloatArray4830[4] * (float) i_1469_
		       + class435.aFloatArray4830[8] * (float) i_1470_
		       + class435.aFloatArray4830[12]);
		float f_1473_
		    = (class435.aFloatArray4830[1] * (float) i_1468_
		       + class435.aFloatArray4830[5] * (float) i_1469_
		       + class435.aFloatArray4830[9] * (float) i_1470_
		       + class435.aFloatArray4830[13]);
		int i_1474_ = (int) (aClass182_Sub3_9041.aFloat9799
				     + (aClass182_Sub3_9041.aFloat9723
					* f_1472_ / f_1471_));
		int i_1475_ = (int) (aClass182_Sub3_9041.aFloat9651
				     + (aClass182_Sub3_9041.aFloat9725
					* f_1473_ / f_1471_));
		if (i_1474_ < i_1451_)
		    i_1451_ = i_1474_;
		if (i_1474_ > i_1452_)
		    i_1452_ = i_1474_;
		if (i_1475_ < i_1453_)
		    i_1453_ = i_1475_;
		if (i_1475_ > i_1454_)
		    i_1454_ = i_1475_;
		bool_1450_ = true;
	    }
	}
	if (bool_1450_ && i > i_1451_ && i < i_1452_ && i_1448_ > i_1453_
	    && i_1448_ < i_1454_) {
	    if (bool)
		return true;
	    if (aClass182_Sub3_9041.anIntArray9829.length < anInt9057) {
		aClass182_Sub3_9041.anIntArray9829 = new int[anInt9057];
		aClass182_Sub3_9041.anIntArray9830 = new int[anInt9057];
	    }
	    int[] is = aClass182_Sub3_9041.anIntArray9829;
	    int[] is_1476_ = aClass182_Sub3_9041.anIntArray9830;
	    for (int i_1477_ = 0; i_1477_ < anInt9072; i_1477_++) {
		int i_1478_ = anIntArray9052[i_1477_];
		int i_1479_ = anIntArray9069[i_1477_];
		int i_1480_ = anIntArray9054[i_1477_];
		float f = (class435.aFloatArray4830[2] * (float) i_1478_
			   + class435.aFloatArray4830[6] * (float) i_1479_
			   + class435.aFloatArray4830[10] * (float) i_1480_
			   + class435.aFloatArray4830[14]);
		float f_1481_
		    = (class435.aFloatArray4830[3] * (float) i_1478_
		       + class435.aFloatArray4830[7] * (float) i_1479_
		       + class435.aFloatArray4830[11] * (float) i_1480_
		       + class435.aFloatArray4830[15]);
		if (f >= -f_1481_) {
		    float f_1482_
			= (class435.aFloatArray4830[0] * (float) i_1478_
			   + class435.aFloatArray4830[4] * (float) i_1479_
			   + class435.aFloatArray4830[8] * (float) i_1480_
			   + class435.aFloatArray4830[12]);
		    float f_1483_
			= (class435.aFloatArray4830[1] * (float) i_1478_
			   + class435.aFloatArray4830[5] * (float) i_1479_
			   + class435.aFloatArray4830[9] * (float) i_1480_
			   + class435.aFloatArray4830[13]);
		    int i_1484_ = anIntArray9046[i_1477_];
		    int i_1485_ = anIntArray9046[i_1477_ + 1];
		    for (int i_1486_ = i_1484_;
			 i_1486_ < i_1485_ && aShortArray9096[i_1486_] != 0;
			 i_1486_++) {
			int i_1487_ = (aShortArray9096[i_1486_] & 0xffff) - 1;
			is[i_1487_] = (int) (aClass182_Sub3_9041.aFloat9799
					     + (aClass182_Sub3_9041.aFloat9723
						* f_1482_ / f_1481_));
			is_1476_[i_1487_]
			    = (int) (aClass182_Sub3_9041.aFloat9651
				     + (aClass182_Sub3_9041.aFloat9725
					* f_1483_ / f_1481_));
		    }
		} else {
		    int i_1488_ = anIntArray9046[i_1477_];
		    int i_1489_ = anIntArray9046[i_1477_ + 1];
		    for (int i_1490_ = i_1488_;
			 i_1490_ < i_1489_ && aShortArray9096[i_1490_] != 0;
			 i_1490_++) {
			int i_1491_ = (aShortArray9096[i_1490_] & 0xffff) - 1;
			is[i_1491_] = -999999;
		    }
		}
	    }
	    for (int i_1492_ = 0; i_1492_ < anInt9065; i_1492_++) {
		if (is[aShortArray9091[i_1492_] & 0xffff] != -999999
		    && is[aShortArray9070[i_1492_] & 0xffff] != -999999
		    && is[aShortArray9071[i_1492_] & 0xffff] != -999999
		    && method14557(i, i_1448_,
				   is_1476_[aShortArray9091[i_1492_] & 0xffff],
				   is_1476_[aShortArray9070[i_1492_] & 0xffff],
				   is_1476_[aShortArray9071[i_1492_] & 0xffff],
				   is[aShortArray9091[i_1492_] & 0xffff],
				   is[aShortArray9070[i_1492_] & 0xffff],
				   is[aShortArray9071[i_1492_] & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    public void method3020(Class444 class444) {
	Class435 class435 = aClass182_Sub3_9041.aClass435_9731;
	class435.method7040(class444);
	if (aClass184Array9097 != null) {
	    for (int i = 0; i < aClass184Array9097.length; i++) {
		Class184 class184 = aClass184Array9097[i];
		Class184 class184_1493_ = class184;
		if (class184.aClass184_2070 != null)
		    class184_1493_ = class184.aClass184_2070;
		class184_1493_.anInt2077
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 908167867);
		class184_1493_.anInt2063
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * -289521417);
		class184_1493_.anInt2072
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 1741678221);
		class184_1493_.anInt2073
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -1237556839);
		class184_1493_.anInt2074
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * 995078737);
		class184_1493_.anInt2075
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -285158923);
		class184_1493_.anInt2071
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -970783049);
		class184_1493_.anInt2067
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -779882021);
		class184_1493_.anInt2078
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -1530339371);
	    }
	}
	if (aClass154Array9098 != null) {
	    for (int i = 0; i < aClass154Array9098.length; i++) {
		MagnetConfig class154 = aClass154Array9098[i];
		MagnetConfig class154_1494_ = class154;
		if (class154.aClass154_1728 != null)
		    class154_1494_ = class154.aClass154_1728;
		if (class154.aClass435_1727 != null)
		    class154.aClass435_1727.method6947(class435);
		else
		    class154.aClass435_1727 = new Class435(class435);
		class154_1494_.anInt1730
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -1389867987);
		class154_1494_.anInt1731
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -182905551);
		class154_1494_.anInt1732
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * 1917380171);
	    }
	}
    }
    
    boolean method2947() {
	if (anIntArrayArray9055 == null)
	    return false;
	for (int i = 0; i < anInt9062; i++) {
	    anIntArray9052[i] <<= 4;
	    anIntArray9069[i] <<= 4;
	    anIntArray9054[i] <<= 4;
	}
	anInt9108 = 0;
	anInt9109 = 0;
	anInt9050 = 0;
	return true;
    }
    
    public Class525_Sub16_Sub17 method3022
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	if (anInt9057 == 0)
	    return null;
	if (!aBool9085)
	    method14558();
	int i;
	int i_1495_;
	if (aClass182_Sub3_9041.anInt9697 > 0) {
	    i = (aShort9088 - (aShort9103 * aClass182_Sub3_9041.anInt9697 >> 8)
		 >> aClass182_Sub3_9041.anInt9800);
	    i_1495_ = aShort9089 - (aShort9086 * aClass182_Sub3_9041.anInt9697
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	} else {
	    i = (aShort9088 - (aShort9086 * aClass182_Sub3_9041.anInt9697 >> 8)
		 >> aClass182_Sub3_9041.anInt9800);
	    i_1495_ = aShort9089 - (aShort9103 * aClass182_Sub3_9041.anInt9697
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	}
	int i_1496_;
	int i_1497_;
	if (aClass182_Sub3_9041.anInt9765 > 0) {
	    i_1496_ = aShort9090 - (aShort9103 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	    i_1497_ = aShort9102 - (aShort9086 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	} else {
	    i_1496_ = aShort9090 - (aShort9086 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	    i_1497_ = aShort9102 - (aShort9103 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	}
	int i_1498_ = i_1495_ - i + 1;
	int i_1499_ = i_1497_ - i_1496_ + 1;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1_1500_;
	if (class525_sub16_sub17_sub1 != null
	    && class525_sub16_sub17_sub1.method18760(i_1498_, i_1499_)) {
	    class525_sub16_sub17_sub1_1500_ = class525_sub16_sub17_sub1;
	    class525_sub16_sub17_sub1_1500_.method18761();
	} else
	    class525_sub16_sub17_sub1_1500_
		= new Class525_Sub16_Sub17_Sub1(aClass182_Sub3_9041, i_1498_,
						i_1499_);
	class525_sub16_sub17_sub1_1500_.method18770(i, i_1496_, i_1495_,
						    i_1497_);
	method14559(class525_sub16_sub17_sub1_1500_);
	return class525_sub16_sub17_sub1_1500_;
    }
    
    public Class525_Sub16_Sub17 method3023
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	if (anInt9057 == 0)
	    return null;
	if (!aBool9085)
	    method14558();
	int i;
	int i_1501_;
	if (aClass182_Sub3_9041.anInt9697 > 0) {
	    i = (aShort9088 - (aShort9103 * aClass182_Sub3_9041.anInt9697 >> 8)
		 >> aClass182_Sub3_9041.anInt9800);
	    i_1501_ = aShort9089 - (aShort9086 * aClass182_Sub3_9041.anInt9697
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	} else {
	    i = (aShort9088 - (aShort9086 * aClass182_Sub3_9041.anInt9697 >> 8)
		 >> aClass182_Sub3_9041.anInt9800);
	    i_1501_ = aShort9089 - (aShort9103 * aClass182_Sub3_9041.anInt9697
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	}
	int i_1502_;
	int i_1503_;
	if (aClass182_Sub3_9041.anInt9765 > 0) {
	    i_1502_ = aShort9090 - (aShort9103 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	    i_1503_ = aShort9102 - (aShort9086 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	} else {
	    i_1502_ = aShort9090 - (aShort9086 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	    i_1503_ = aShort9102 - (aShort9103 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	}
	int i_1504_ = i_1501_ - i + 1;
	int i_1505_ = i_1503_ - i_1502_ + 1;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1_1506_;
	if (class525_sub16_sub17_sub1 != null
	    && class525_sub16_sub17_sub1.method18760(i_1504_, i_1505_)) {
	    class525_sub16_sub17_sub1_1506_ = class525_sub16_sub17_sub1;
	    class525_sub16_sub17_sub1_1506_.method18761();
	} else
	    class525_sub16_sub17_sub1_1506_
		= new Class525_Sub16_Sub17_Sub1(aClass182_Sub3_9041, i_1504_,
						i_1505_);
	class525_sub16_sub17_sub1_1506_.method18770(i, i_1502_, i_1501_,
						    i_1503_);
	method14559(class525_sub16_sub17_sub1_1506_);
	return class525_sub16_sub17_sub1_1506_;
    }
    
    public Class525_Sub16_Sub17 method3024
	(Class525_Sub16_Sub17 class525_sub16_sub17) {
	if (anInt9057 == 0)
	    return null;
	if (!aBool9085)
	    method14558();
	int i;
	int i_1507_;
	if (aClass182_Sub3_9041.anInt9697 > 0) {
	    i = (aShort9088 - (aShort9103 * aClass182_Sub3_9041.anInt9697 >> 8)
		 >> aClass182_Sub3_9041.anInt9800);
	    i_1507_ = aShort9089 - (aShort9086 * aClass182_Sub3_9041.anInt9697
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	} else {
	    i = (aShort9088 - (aShort9086 * aClass182_Sub3_9041.anInt9697 >> 8)
		 >> aClass182_Sub3_9041.anInt9800);
	    i_1507_ = aShort9089 - (aShort9103 * aClass182_Sub3_9041.anInt9697
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	}
	int i_1508_;
	int i_1509_;
	if (aClass182_Sub3_9041.anInt9765 > 0) {
	    i_1508_ = aShort9090 - (aShort9103 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	    i_1509_ = aShort9102 - (aShort9086 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	} else {
	    i_1508_ = aShort9090 - (aShort9086 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	    i_1509_ = aShort9102 - (aShort9103 * aClass182_Sub3_9041.anInt9765
				    >> 8) >> aClass182_Sub3_9041.anInt9800;
	}
	int i_1510_ = i_1507_ - i + 1;
	int i_1511_ = i_1509_ - i_1508_ + 1;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1
	    = (Class525_Sub16_Sub17_Sub1) class525_sub16_sub17;
	Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1_1512_;
	if (class525_sub16_sub17_sub1 != null
	    && class525_sub16_sub17_sub1.method18760(i_1510_, i_1511_)) {
	    class525_sub16_sub17_sub1_1512_ = class525_sub16_sub17_sub1;
	    class525_sub16_sub17_sub1_1512_.method18761();
	} else
	    class525_sub16_sub17_sub1_1512_
		= new Class525_Sub16_Sub17_Sub1(aClass182_Sub3_9041, i_1510_,
						i_1511_);
	class525_sub16_sub17_sub1_1512_.method18770(i, i_1508_, i_1507_,
						    i_1509_);
	method14559(class525_sub16_sub17_sub1_1512_);
	return class525_sub16_sub17_sub1_1512_;
    }
    
    public void method3025() {
	if (!aBool9092) {
	    if (!aBool9085)
		method14558();
	    aShort9093 = aShort9086;
	    aBool9092 = true;
	}
    }
    
    public int method2962() {
	if (!aBool9085)
	    method14558();
	return aShort9090;
    }
    
    public void method3092() {
	if (!aBool9092) {
	    if (!aBool9085)
		method14558();
	    aShort9093 = aShort9086;
	    aBool9092 = true;
	}
    }
    
    public MagnetConfig[] method2946() {
	return aClass154Array9098;
    }
    
    public int method3040() {
	if (!aBool9085)
	    method14558();
	return anInt9084;
    }
    
    public void method2930(int i) {
	int i_1513_ = Class436.anIntArray4831[i];
	int i_1514_ = Class436.anIntArray4838[i];
	for (int i_1515_ = 0; i_1515_ < anInt9072; i_1515_++) {
	    int i_1516_ = ((anIntArray9054[i_1515_] * i_1513_
			    + anIntArray9052[i_1515_] * i_1514_)
			   >> 14);
	    anIntArray9054[i_1515_]
		= (anIntArray9054[i_1515_] * i_1514_
		   - anIntArray9052[i_1515_] * i_1513_) >> 14;
	    anIntArray9052[i_1515_] = i_1516_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method3083(Class444 class444, int i, boolean bool) {
	if (aShortArray9056 != null) {
	    Class444 class444_1517_ = class444;
	    if (bool) {
		class444_1517_ = aClass182_Sub3_9041.aClass444_9730;
		class444_1517_.method7163(class444);
	    }
	    float[] fs = new float[3];
	    for (int i_1518_ = 0; i_1518_ < anInt9072; i_1518_++) {
		if ((i & aShortArray9056[i_1518_]) != 0) {
		    class444_1517_.method7168((float) anIntArray9052[i_1518_],
					      (float) anIntArray9069[i_1518_],
					      (float) anIntArray9054[i_1518_],
					      fs);
		    anIntArray9052[i_1518_] = (int) fs[0];
		    anIntArray9069[i_1518_] = (int) fs[1];
		    anIntArray9054[i_1518_] = (int) fs[2];
		}
	    }
	}
    }
    
    public MagnetConfig[] method3085() {
	return aClass154Array9098;
    }
    
    public int method3053() {
	if (!aBool9085)
	    method14558();
	return aShort9089;
    }
    
    public int method3093() {
	if (!aBool9085)
	    method14558();
	return aShort9103;
    }
    
    public int method3077() {
	if (!aBool9085)
	    method14558();
	return aShort9086;
    }
    
    public void method3005(int i, int i_1519_, int i_1520_) {
	for (int i_1521_ = 0; i_1521_ < anInt9072; i_1521_++) {
	    if (i != 128)
		anIntArray9052[i_1521_] = anIntArray9052[i_1521_] * i >> 7;
	    if (i_1519_ != 128)
		anIntArray9069[i_1521_]
		    = anIntArray9069[i_1521_] * i_1519_ >> 7;
	    if (i_1520_ != 128)
		anIntArray9054[i_1521_]
		    = anIntArray9054[i_1521_] * i_1520_ >> 7;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public int method3037() {
	if (!aBool9085)
	    method14558();
	return aShort9090;
    }
    
    public int method3038() {
	if (!aBool9085)
	    method14558();
	return aShort9102;
    }
    
    void method3006() {
	/* empty */
    }
    
    public int method3091() {
	if (!aBool9085)
	    method14558();
	return aShort9102;
    }
    
    void method3027() {
	for (int i = 0; i < anInt9062; i++) {
	    anIntArray9052[i] = anIntArray9052[i] + 7 >> 4;
	    anIntArray9069[i] = anIntArray9069[i] + 7 >> 4;
	    anIntArray9054[i] = anIntArray9054[i] + 7 >> 4;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method3042(int i) {
	aShort9110 = (short) i;
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    public void method3043(int i) {
	aShort9110 = (short) i;
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    public void method3044(int i) {
	aShort9110 = (short) i;
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    static float[] method14569(float[] fs, int i) {
	float[] fs_1522_ = new float[i];
	System.arraycopy(fs, 0, fs_1522_, 0, i);
	return fs_1522_;
    }
    
    public int method3039() {
	if (!aBool9085)
	    method14558();
	return aShort9102;
    }
    
    public boolean method3066() {
	if (aShortArray9039 == null)
	    return true;
	for (int i = 0; i < aShortArray9039.length; i++) {
	    if (aShortArray9039[i] != -1) {
		TextureMetrics class166
		    = (aClass182_Sub3_9041.aClass180_1944.method3116
		       (aShortArray9039[i] & 0xffff, -1431554601));
		if (class166.aBool1801
		    && !aClass182_Sub3_9041.aClass150_9673
			    .method2427(Class593.aClass593_7831, class166, -1))
		    return false;
	    }
	}
	return true;
    }
    
    void method3008() {
	/* empty */
    }
    
    public int method3049() {
	return aShort9110;
    }
    
    public byte[] method3050() {
	return aByteArray9068;
    }
    
    public byte[] method2958() {
	return aByteArray9068;
    }
    
    static short[] method14570(short[] is, int i) {
	short[] is_1523_ = new short[i];
	System.arraycopy(is, 0, is_1523_, 0, i);
	return is_1523_;
    }
    
    public void method3021(Class444 class444) {
	Class435 class435 = aClass182_Sub3_9041.aClass435_9731;
	class435.method7040(class444);
	if (aClass184Array9097 != null) {
	    for (int i = 0; i < aClass184Array9097.length; i++) {
		Class184 class184 = aClass184Array9097[i];
		Class184 class184_1524_ = class184;
		if (class184.aClass184_2070 != null)
		    class184_1524_ = class184.aClass184_2070;
		class184_1524_.anInt2077
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 908167867);
		class184_1524_.anInt2063
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * -289521417);
		class184_1524_.anInt2072
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class184.anInt2066
							    * -1882366163)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class184.anInt2066
						 * -1882366163)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class184.anInt2066
						 * -1882366163)]))))
		       * 1741678221);
		class184_1524_.anInt2073
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -1237556839);
		class184_1524_.anInt2074
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * 995078737);
		class184_1524_.anInt2075
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class184.anInt2076
							    * -1545046327)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class184.anInt2076
						 * -1545046327)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class184.anInt2076
						 * -1545046327)]))))
		       * -285158923);
		class184_1524_.anInt2071
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -970783049);
		class184_1524_.anInt2067
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -779882021);
		class184_1524_.anInt2078
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class184.anInt2068
							    * -1411214779)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class184.anInt2068
						 * -1411214779)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class184.anInt2068
						 * -1411214779)]))))
		       * -1530339371);
	    }
	}
	if (aClass154Array9098 != null) {
	    for (int i = 0; i < aClass154Array9098.length; i++) {
		MagnetConfig class154 = aClass154Array9098[i];
		MagnetConfig class154_1525_ = class154;
		if (class154.aClass154_1728 != null)
		    class154_1525_ = class154.aClass154_1728;
		if (class154.aClass435_1727 != null)
		    class154.aClass435_1727.method6947(class435);
		else
		    class154.aClass435_1727 = new Class435(class435);
		class154_1525_.anInt1730
		    = ((int) (class435.aFloatArray4830[12]
			      + ((class435.aFloatArray4830[0]
				  * (float) anIntArray9052[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[4]
				    * (float) (anIntArray9069
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[8]
				    * (float) (anIntArray9054
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -1389867987);
		class154_1525_.anInt1731
		    = ((int) (class435.aFloatArray4830[13]
			      + ((class435.aFloatArray4830[1]
				  * (float) anIntArray9052[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[5]
				    * (float) (anIntArray9069
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[9]
				    * (float) (anIntArray9054
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * -182905551);
		class154_1525_.anInt1732
		    = ((int) (class435.aFloatArray4830[14]
			      + ((class435.aFloatArray4830[2]
				  * (float) anIntArray9052[(class154.anInt1729
							    * 1174339389)])
				 + (class435.aFloatArray4830[6]
				    * (float) (anIntArray9069
					       [(class154.anInt1729
						 * 1174339389)]))
				 + (class435.aFloatArray4830[10]
				    * (float) (anIntArray9054
					       [(class154.anInt1729
						 * 1174339389)]))))
		       * 1917380171);
	    }
	}
    }
    
    public void method3054(short i, short i_1526_) {
	for (int i_1527_ = 0; i_1527_ < anInt9065; i_1527_++) {
	    if (aShortArray9067[i_1527_] == i)
		aShortArray9067[i_1527_] = i_1526_;
	}
	if (aClass148Array9100 != null) {
	    for (int i_1528_ = 0; i_1528_ < anInt9074; i_1528_++) {
		Class148 class148 = aClass148Array9100[i_1528_];
		Class131 class131 = aClass131Array9101[i_1528_];
		class131.anInt1582
		    = (class131.anInt1582 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9067[class148.anInt1694] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    void method14571() {
	int i = 32767;
	int i_1529_ = 32767;
	int i_1530_ = 32767;
	int i_1531_ = -32768;
	int i_1532_ = -32768;
	int i_1533_ = -32768;
	int i_1534_ = 0;
	int i_1535_ = 0;
	for (int i_1536_ = 0; i_1536_ < anInt9072; i_1536_++) {
	    int i_1537_ = anIntArray9052[i_1536_];
	    int i_1538_ = anIntArray9069[i_1536_];
	    int i_1539_ = anIntArray9054[i_1536_];
	    if (i_1537_ < i)
		i = i_1537_;
	    if (i_1537_ > i_1531_)
		i_1531_ = i_1537_;
	    if (i_1538_ < i_1529_)
		i_1529_ = i_1538_;
	    if (i_1538_ > i_1532_)
		i_1532_ = i_1538_;
	    if (i_1539_ < i_1530_)
		i_1530_ = i_1539_;
	    if (i_1539_ > i_1533_)
		i_1533_ = i_1539_;
	    int i_1540_ = i_1537_ * i_1537_ + i_1539_ * i_1539_;
	    if (i_1540_ > i_1534_)
		i_1534_ = i_1540_;
	    i_1540_
		= i_1537_ * i_1537_ + i_1539_ * i_1539_ + i_1538_ * i_1538_;
	    if (i_1540_ > i_1535_)
		i_1535_ = i_1540_;
	}
	aShort9088 = (short) i;
	aShort9089 = (short) i_1531_;
	aShort9086 = (short) i_1529_;
	aShort9103 = (short) i_1532_;
	aShort9090 = (short) i_1530_;
	aShort9102 = (short) i_1533_;
	anInt9084 = (int) (Math.sqrt((double) i_1534_) + 0.99);
	anInt9083 = (int) (Math.sqrt((double) i_1535_) + 0.99);
	aBool9085 = true;
    }
    
    public void method3056(byte i, byte[] is) {
	if (is == null) {
	    for (int i_1541_ = 0; i_1541_ < anInt9065; i_1541_++)
		aByteArray9068[i_1541_] = i;
	} else {
	    for (int i_1542_ = 0; i_1542_ < anInt9065; i_1542_++) {
		int i_1543_ = 255 - ((255 - (is[i_1542_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9068[i_1542_] = (byte) i_1543_;
	    }
	}
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    public boolean method3017() {
	return aBool9045;
    }
    
    public void method3058(short i, short i_1544_) {
	Textures class180 = aClass182_Sub3_9041.aClass180_1944;
	for (int i_1545_ = 0; i_1545_ < anInt9065; i_1545_++) {
	    if (aShortArray9039[i_1545_] == i)
		aShortArray9039[i_1545_] = i_1544_;
	}
	byte i_1546_ = 0;
	byte i_1547_ = 0;
	if (i != -1) {
	    TextureMetrics class166 = class180.method3116(i & 0xffff, -1431554601);
	    i_1546_ = class166.aByte1785;
	    i_1547_ = class166.aByte1831;
	}
	byte i_1548_ = 0;
	byte i_1549_ = 0;
	if (i_1544_ != -1) {
	    TextureMetrics class166
		= class180.method3116(i_1544_ & 0xffff, -1431554601);
	    i_1548_ = class166.aByte1785;
	    i_1549_ = class166.aByte1831;
	    if (class166.aByte1805 != 0 || class166.aByte1806 != 0)
		aBool9049 = true;
	}
	if (i_1546_ != i_1548_ | i_1547_ != i_1549_) {
	    if (aClass148Array9100 != null) {
		for (int i_1550_ = 0; i_1550_ < anInt9074; i_1550_++) {
		    Class148 class148 = aClass148Array9100[i_1550_];
		    Class131 class131 = aClass131Array9101[i_1550_];
		    class131.anInt1582
			= (class131.anInt1582 & ~0xffffff
			   | ((Class642.anIntArray8324
			       [aShortArray9067[class148.anInt1694] & 0xffff])
			      & 0xffffff));
		}
	    }
	    if (aClass137_9076 != null)
		aClass137_9076.anInterface15_1635 = null;
	}
    }
    
    public void method2995(int i) {
	int i_1551_ = Class436.anIntArray4831[i];
	int i_1552_ = Class436.anIntArray4838[i];
	for (int i_1553_ = 0; i_1553_ < anInt9072; i_1553_++) {
	    int i_1554_ = ((anIntArray9054[i_1553_] * i_1551_
			    + anIntArray9052[i_1553_] * i_1552_)
			   >> 14);
	    anIntArray9054[i_1553_]
		= (anIntArray9054[i_1553_] * i_1552_
		   - anIntArray9052[i_1553_] * i_1551_) >> 14;
	    anIntArray9052[i_1553_] = i_1554_;
	}
	for (int i_1555_ = 0; i_1555_ < anInt9057; i_1555_++) {
	    int i_1556_ = ((aShortArray9060[i_1555_] * i_1551_
			    + aShortArray9073[i_1555_] * i_1552_)
			   >> 14);
	    aShortArray9060[i_1555_]
		= (short) ((aShortArray9060[i_1555_] * i_1552_
			    - aShortArray9073[i_1555_] * i_1551_)
			   >> 14);
	    aShortArray9073[i_1555_] = (short) i_1556_;
	}
	if (aClass137_9051 == null && aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
	if (aClass137_9051 != null)
	    aClass137_9051.anInterface15_1635 = null;
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method2952(int i) {
	aShort9047 = (short) i;
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
	if (aClass137_9051 != null)
	    aClass137_9051.anInterface15_1635 = null;
    }
    
    static final int method14572(int i, int i_1557_) {
	i_1557_ = i_1557_ * (i & 0x7f) >> 7;
	if (i_1557_ < 2)
	    i_1557_ = 2;
	else if (i_1557_ > 126)
	    i_1557_ = 126;
	return (i & 0xff80) + i_1557_;
    }
    
    public int method2988() {
	return anInt9043;
    }
    
    public MagnetConfig[] method3063() {
	return aClass154Array9098;
    }
    
    public MagnetConfig[] method3064() {
	return aClass154Array9098;
    }
    
    public boolean method2981() {
	if (aShortArray9039 == null)
	    return true;
	for (int i = 0; i < aShortArray9039.length; i++) {
	    if (aShortArray9039[i] != -1) {
		TextureMetrics class166
		    = (aClass182_Sub3_9041.aClass180_1944.method3116
		       (aShortArray9039[i] & 0xffff, -1431554601));
		if (class166.aBool1801
		    && !aClass182_Sub3_9041.aClass150_9673
			    .method2427(Class593.aClass593_7831, class166, -1))
		    return false;
	    }
	}
	return true;
    }
    
    public void method3047() {
	if (!aBool9092) {
	    if (!aBool9085)
		method14558();
	    aShort9093 = aShort9086;
	    aBool9092 = true;
	}
    }
    
    public boolean method3067() {
	return aBool9045;
    }
    
    public boolean method3032() {
	return aBool9049;
    }
    
    public boolean method3079() {
	return aBool9049;
    }
    
    short method14573(ModelDecoder class186, int i, long l, int i_1558_,
                      int i_1559_, int i_1560_, int i_1561_, float f,
                      float f_1562_) {
	int i_1563_ = anIntArray9046[i];
	int i_1564_ = anIntArray9046[i + 1];
	int i_1565_ = 0;
	for (int i_1566_ = i_1563_; i_1566_ < i_1564_; i_1566_++) {
	    if (aShortArray9096[i_1566_] == 0) {
		i_1565_ = i_1566_;
		break;
	    }
	    int i_1567_ = (aShortArray9096[i_1566_] & 0xffff) - 1;
	    if (aLongArray9087[i_1566_] == l)
		return (short) i_1567_;
	}
	aShortArray9096[i_1565_] = (short) (anInt9057 + 1);
	aLongArray9087[i_1565_] = l;
	aShortArray9073[anInt9057] = (short) i_1558_;
	aShortArray9059[anInt9057] = (short) i_1559_;
	aShortArray9060[anInt9057] = (short) i_1560_;
	aByteArray9061[anInt9057] = (byte) i_1561_;
	aFloatArray9058[anInt9057] = f;
	aFloatArray9064[anInt9057] = f_1562_;
	return (short) anInt9057++;
    }
    
    short method14574(ModelDecoder class186, int i, long l, int i_1568_,
                      int i_1569_, int i_1570_, int i_1571_, float f,
                      float f_1572_) {
	int i_1573_ = anIntArray9046[i];
	int i_1574_ = anIntArray9046[i + 1];
	int i_1575_ = 0;
	for (int i_1576_ = i_1573_; i_1576_ < i_1574_; i_1576_++) {
	    if (aShortArray9096[i_1576_] == 0) {
		i_1575_ = i_1576_;
		break;
	    }
	    int i_1577_ = (aShortArray9096[i_1576_] & 0xffff) - 1;
	    if (aLongArray9087[i_1576_] == l)
		return (short) i_1577_;
	}
	aShortArray9096[i_1575_] = (short) (anInt9057 + 1);
	aLongArray9087[i_1575_] = l;
	aShortArray9073[anInt9057] = (short) i_1568_;
	aShortArray9059[anInt9057] = (short) i_1569_;
	aShortArray9060[anInt9057] = (short) i_1570_;
	aByteArray9061[anInt9057] = (byte) i_1571_;
	aFloatArray9058[anInt9057] = f;
	aFloatArray9064[anInt9057] = f_1572_;
	return (short) anInt9057++;
    }
    
    static byte[] method14575(byte[] is, int i) {
	byte[] is_1578_ = new byte[i];
	System.arraycopy(is, 0, is_1578_, 0, i);
	return is_1578_;
    }
    
    static byte[] method14576(byte[] is, int i) {
	byte[] is_1579_ = new byte[i];
	System.arraycopy(is, 0, is_1579_, 0, i);
	return is_1579_;
    }
    
    static short[] method14577(short[] is, int i) {
	short[] is_1580_ = new short[i];
	System.arraycopy(is, 0, is_1580_, 0, i);
	return is_1580_;
    }
    
    static short[] method14578(short[] is, int i) {
	short[] is_1581_ = new short[i];
	System.arraycopy(is, 0, is_1581_, 0, i);
	return is_1581_;
    }
    
    void method14579(boolean bool) {
	if ((aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
	     .buffer).length
	    < anInt9111 * 6)
	    aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
		= new Class525_Sub38_Sub1((anInt9111 + 100) * 6);
	else
	    aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828.index = 0;
	Class525_Sub38_Sub1 class525_sub38_sub1
	    = aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828;
	if (aClass182_Sub3_9041.aBool9792) {
	    for (int i = 0; i < anInt9111; i++) {
		class525_sub38_sub1.method16602(aShortArray9091[i],
						1321356807);
		class525_sub38_sub1.method16602(aShortArray9070[i],
						1166175910);
		class525_sub38_sub1.method16602(aShortArray9071[i],
						1025186901);
	    }
	} else {
	    for (int i = 0; i < anInt9111; i++) {
		class525_sub38_sub1.method16840(aShortArray9091[i], 241387851);
		class525_sub38_sub1.method16840(aShortArray9070[i], 241387851);
		class525_sub38_sub1.method16840(aShortArray9071[i], 241387851);
	    }
	}
	if (class525_sub38_sub1.index * -1133521593 != 0) {
	    if (bool) {
		if (anInterface16_9035 == null)
		    anInterface16_9035
			= (aClass182_Sub3_9041.method15441
			   (5123, class525_sub38_sub1.buffer,
			    class525_sub38_sub1.index * -1133521593,
			    true));
		else
		    anInterface16_9035.method84(5123,
						(class525_sub38_sub1
						 .buffer),
						(class525_sub38_sub1.index
						 * -1133521593));
		aClass139_9079.anInterface16_1642 = anInterface16_9035;
	    } else
		aClass139_9079.anInterface16_1642
		    = (aClass182_Sub3_9041.method15441
		       (5123, class525_sub38_sub1.buffer,
			class525_sub38_sub1.index * -1133521593, false));
	    if (!bool)
		aBool9095 = true;
	}
    }
    
    public int method2923() {
	return anInt9043;
    }
    
    static float[] method14580(float[] fs, int i) {
	float[] fs_1582_ = new float[i];
	System.arraycopy(fs, 0, fs_1582_, 0, i);
	return fs_1582_;
    }
    
    static float[] method14581(float[] fs, int i) {
	float[] fs_1583_ = new float[i];
	System.arraycopy(fs, 0, fs_1583_, 0, i);
	return fs_1583_;
    }
    
    public int method2989() {
	return aShort9110;
    }
    
    Class179 method14582(Class179_Sub1 class179_sub1_1584_,
			 Class179_Sub1 class179_sub1_1585_, int i,
			 boolean bool, boolean bool_1586_) {
	class179_sub1_1584_.aByte9037 = (byte) 0;
	class179_sub1_1584_.anInt9043 = i;
	class179_sub1_1584_.anInt9080 = anInt9080;
	class179_sub1_1584_.aShort9110 = aShort9110;
	class179_sub1_1584_.aShort9047 = aShort9047;
	class179_sub1_1584_.anInt9062 = anInt9062;
	class179_sub1_1584_.anInt9072 = anInt9072;
	class179_sub1_1584_.anInt9057 = anInt9057;
	class179_sub1_1584_.anInt9065 = anInt9065;
	class179_sub1_1584_.anInt9111 = anInt9111;
	class179_sub1_1584_.anInt9074 = anInt9074;
	if ((i & 0x100) != 0)
	    class179_sub1_1584_.aBool9045 = true;
	else
	    class179_sub1_1584_.aBool9045 = aBool9045;
	class179_sub1_1584_.aBool9049 = aBool9049;
	boolean bool_1587_ = Class125.method2129(i, anInt9080);
	boolean bool_1588_ = Class125.method2148(i, anInt9080);
	boolean bool_1589_ = Class125.method2176(i, anInt9080);
	boolean bool_1590_ = bool_1587_ | bool_1588_ | bool_1589_;
	if (bool_1590_) {
	    if (bool_1587_) {
		if (class179_sub1_1585_.anIntArray9052 == null
		    || class179_sub1_1585_.anIntArray9052.length < anInt9062)
		    class179_sub1_1584_.anIntArray9052
			= class179_sub1_1585_.anIntArray9052
			= new int[anInt9062];
		else
		    class179_sub1_1584_.anIntArray9052
			= class179_sub1_1585_.anIntArray9052;
	    } else
		class179_sub1_1584_.anIntArray9052 = anIntArray9052;
	    if (bool_1588_) {
		if (class179_sub1_1585_.anIntArray9069 == null
		    || class179_sub1_1585_.anIntArray9069.length < anInt9062)
		    class179_sub1_1584_.anIntArray9069
			= class179_sub1_1585_.anIntArray9069
			= new int[anInt9062];
		else
		    class179_sub1_1584_.anIntArray9069
			= class179_sub1_1585_.anIntArray9069;
	    } else
		class179_sub1_1584_.anIntArray9069 = anIntArray9069;
	    if (bool_1589_) {
		if (class179_sub1_1585_.anIntArray9054 == null
		    || class179_sub1_1585_.anIntArray9054.length < anInt9062)
		    class179_sub1_1584_.anIntArray9054
			= class179_sub1_1585_.anIntArray9054
			= new int[anInt9062];
		else
		    class179_sub1_1584_.anIntArray9054
			= class179_sub1_1585_.anIntArray9054;
	    } else
		class179_sub1_1584_.anIntArray9054 = anIntArray9054;
	    for (int i_1591_ = 0; i_1591_ < anInt9062; i_1591_++) {
		if (bool_1587_)
		    class179_sub1_1584_.anIntArray9052[i_1591_]
			= anIntArray9052[i_1591_];
		if (bool_1588_)
		    class179_sub1_1584_.anIntArray9069[i_1591_]
			= anIntArray9069[i_1591_];
		if (bool_1589_)
		    class179_sub1_1584_.anIntArray9054[i_1591_]
			= anIntArray9054[i_1591_];
	    }
	} else {
	    class179_sub1_1584_.anIntArray9052 = anIntArray9052;
	    class179_sub1_1584_.anIntArray9069 = anIntArray9069;
	    class179_sub1_1584_.anIntArray9054 = anIntArray9054;
	}
	if (Class125.method2182(i, anInt9080)) {
	    if (bool)
		class179_sub1_1584_.aByte9037 |= 0x1;
	    class179_sub1_1584_.aClass137_9075
		= class179_sub1_1585_.aClass137_9075;
	    class179_sub1_1584_.aClass137_9075.aByte1634
		= aClass137_9075.aByte1634;
	    class179_sub1_1584_.aClass137_9075.anInterface15_1635
		= aClass137_9075.anInterface15_1635;
	} else if (Class125.method2141(i, anInt9080))
	    class179_sub1_1584_.aClass137_9075 = aClass137_9075;
	else
	    class179_sub1_1584_.aClass137_9075 = null;
	if (Class125.method2204(i, anInt9080)) {
	    if (class179_sub1_1585_.aShortArray9067 == null
		|| class179_sub1_1585_.aShortArray9067.length < anInt9065)
		class179_sub1_1584_.aShortArray9067
		    = class179_sub1_1585_.aShortArray9067
		    = new short[anInt9065];
	    else
		class179_sub1_1584_.aShortArray9067
		    = class179_sub1_1585_.aShortArray9067;
	    for (int i_1592_ = 0; i_1592_ < anInt9065; i_1592_++)
		class179_sub1_1584_.aShortArray9067[i_1592_]
		    = aShortArray9067[i_1592_];
	} else
	    class179_sub1_1584_.aShortArray9067 = aShortArray9067;
	if (Class125.method2135(i, anInt9080)) {
	    if (class179_sub1_1585_.aByteArray9068 == null
		|| class179_sub1_1585_.aByteArray9068.length < anInt9065)
		class179_sub1_1584_.aByteArray9068
		    = class179_sub1_1585_.aByteArray9068 = new byte[anInt9065];
	    else
		class179_sub1_1584_.aByteArray9068
		    = class179_sub1_1585_.aByteArray9068;
	    for (int i_1593_ = 0; i_1593_ < anInt9065; i_1593_++)
		class179_sub1_1584_.aByteArray9068[i_1593_]
		    = aByteArray9068[i_1593_];
	} else
	    class179_sub1_1584_.aByteArray9068 = aByteArray9068;
	if (Class125.method2227(i, anInt9080)) {
	    if (bool)
		class179_sub1_1584_.aByte9037 |= 0x2;
	    class179_sub1_1584_.aClass137_9076
		= class179_sub1_1585_.aClass137_9076;
	    class179_sub1_1584_.aClass137_9076.aByte1634
		= aClass137_9076.aByte1634;
	    class179_sub1_1584_.aClass137_9076.anInterface15_1635
		= aClass137_9076.anInterface15_1635;
	} else if (Class125.method2143(i, anInt9080))
	    class179_sub1_1584_.aClass137_9076 = aClass137_9076;
	else
	    class179_sub1_1584_.aClass137_9076 = null;
	if (Class125.method2133(i, anInt9080)) {
	    if (class179_sub1_1585_.aShortArray9073 == null
		|| class179_sub1_1585_.aShortArray9073.length < anInt9057) {
		int i_1594_ = anInt9057;
		class179_sub1_1584_.aShortArray9073
		    = class179_sub1_1585_.aShortArray9073 = new short[i_1594_];
		class179_sub1_1584_.aShortArray9059
		    = class179_sub1_1585_.aShortArray9059 = new short[i_1594_];
		class179_sub1_1584_.aShortArray9060
		    = class179_sub1_1585_.aShortArray9060 = new short[i_1594_];
	    } else {
		class179_sub1_1584_.aShortArray9073
		    = class179_sub1_1585_.aShortArray9073;
		class179_sub1_1584_.aShortArray9059
		    = class179_sub1_1585_.aShortArray9059;
		class179_sub1_1584_.aShortArray9060
		    = class179_sub1_1585_.aShortArray9060;
	    }
	    if (aClass145_9063 != null) {
		if (class179_sub1_1585_.aClass145_9063 == null)
		    class179_sub1_1585_.aClass145_9063 = new Class145();
		Class145 class145 = (class179_sub1_1584_.aClass145_9063
				     = class179_sub1_1585_.aClass145_9063);
		if (class145.aShortArray1672 == null
		    || class145.aShortArray1672.length < anInt9057) {
		    int i_1595_ = anInt9057;
		    class145.aShortArray1672 = new short[i_1595_];
		    class145.aShortArray1671 = new short[i_1595_];
		    class145.aShortArray1669 = new short[i_1595_];
		    class145.aByteArray1670 = new byte[i_1595_];
		}
		for (int i_1596_ = 0; i_1596_ < anInt9057; i_1596_++) {
		    class179_sub1_1584_.aShortArray9073[i_1596_]
			= aShortArray9073[i_1596_];
		    class179_sub1_1584_.aShortArray9059[i_1596_]
			= aShortArray9059[i_1596_];
		    class179_sub1_1584_.aShortArray9060[i_1596_]
			= aShortArray9060[i_1596_];
		    class145.aShortArray1672[i_1596_]
			= aClass145_9063.aShortArray1672[i_1596_];
		    class145.aShortArray1671[i_1596_]
			= aClass145_9063.aShortArray1671[i_1596_];
		    class145.aShortArray1669[i_1596_]
			= aClass145_9063.aShortArray1669[i_1596_];
		    class145.aByteArray1670[i_1596_]
			= aClass145_9063.aByteArray1670[i_1596_];
		}
	    } else {
		for (int i_1597_ = 0; i_1597_ < anInt9057; i_1597_++) {
		    class179_sub1_1584_.aShortArray9073[i_1597_]
			= aShortArray9073[i_1597_];
		    class179_sub1_1584_.aShortArray9059[i_1597_]
			= aShortArray9059[i_1597_];
		    class179_sub1_1584_.aShortArray9060[i_1597_]
			= aShortArray9060[i_1597_];
		}
	    }
	    class179_sub1_1584_.aByteArray9061 = aByteArray9061;
	} else {
	    class179_sub1_1584_.aClass145_9063 = aClass145_9063;
	    class179_sub1_1584_.aShortArray9073 = aShortArray9073;
	    class179_sub1_1584_.aShortArray9059 = aShortArray9059;
	    class179_sub1_1584_.aShortArray9060 = aShortArray9060;
	    class179_sub1_1584_.aByteArray9061 = aByteArray9061;
	}
	if (Class125.method2147(i, anInt9080)) {
	    if (bool)
		class179_sub1_1584_.aByte9037 |= 0x4;
	    class179_sub1_1584_.aClass137_9051
		= class179_sub1_1585_.aClass137_9051;
	    class179_sub1_1584_.aClass137_9051.aByte1634
		= aClass137_9051.aByte1634;
	    class179_sub1_1584_.aClass137_9051.anInterface15_1635
		= aClass137_9051.anInterface15_1635;
	} else if (Class125.method2142(i, anInt9080))
	    class179_sub1_1584_.aClass137_9051 = aClass137_9051;
	else
	    class179_sub1_1584_.aClass137_9051 = null;
	if (Class125.method2136(i, anInt9080)) {
	    if (class179_sub1_1585_.aFloatArray9058 == null
		|| class179_sub1_1585_.aFloatArray9058.length < anInt9065) {
		int i_1598_ = anInt9057;
		class179_sub1_1584_.aFloatArray9058
		    = class179_sub1_1585_.aFloatArray9058 = new float[i_1598_];
		class179_sub1_1584_.aFloatArray9064
		    = class179_sub1_1585_.aFloatArray9064 = new float[i_1598_];
	    } else {
		class179_sub1_1584_.aFloatArray9058
		    = class179_sub1_1585_.aFloatArray9058;
		class179_sub1_1584_.aFloatArray9064
		    = class179_sub1_1585_.aFloatArray9064;
	    }
	    for (int i_1599_ = 0; i_1599_ < anInt9057; i_1599_++) {
		class179_sub1_1584_.aFloatArray9058[i_1599_]
		    = aFloatArray9058[i_1599_];
		class179_sub1_1584_.aFloatArray9064[i_1599_]
		    = aFloatArray9064[i_1599_];
	    }
	} else {
	    class179_sub1_1584_.aFloatArray9058 = aFloatArray9058;
	    class179_sub1_1584_.aFloatArray9064 = aFloatArray9064;
	}
	if (Class125.method2201(i, anInt9080)) {
	    if (bool)
		class179_sub1_1584_.aByte9037 |= 0x8;
	    class179_sub1_1584_.aClass137_9078
		= class179_sub1_1585_.aClass137_9078;
	    class179_sub1_1584_.aClass137_9078.aByte1634
		= aClass137_9078.aByte1634;
	    class179_sub1_1584_.aClass137_9078.anInterface15_1635
		= aClass137_9078.anInterface15_1635;
	} else if (Class125.method2205(i, anInt9080))
	    class179_sub1_1584_.aClass137_9078 = aClass137_9078;
	else
	    class179_sub1_1584_.aClass137_9078 = null;
	if (Class125.method2137(i, anInt9080)) {
	    if (class179_sub1_1585_.aShortArray9091 == null
		|| class179_sub1_1585_.aShortArray9091.length < anInt9065) {
		int i_1600_ = anInt9065;
		class179_sub1_1584_.aShortArray9091
		    = class179_sub1_1585_.aShortArray9091 = new short[i_1600_];
		class179_sub1_1584_.aShortArray9070
		    = class179_sub1_1585_.aShortArray9070 = new short[i_1600_];
		class179_sub1_1584_.aShortArray9071
		    = class179_sub1_1585_.aShortArray9071 = new short[i_1600_];
	    } else {
		class179_sub1_1584_.aShortArray9091
		    = class179_sub1_1585_.aShortArray9091;
		class179_sub1_1584_.aShortArray9070
		    = class179_sub1_1585_.aShortArray9070;
		class179_sub1_1584_.aShortArray9071
		    = class179_sub1_1585_.aShortArray9071;
	    }
	    for (int i_1601_ = 0; i_1601_ < anInt9065; i_1601_++) {
		class179_sub1_1584_.aShortArray9091[i_1601_]
		    = aShortArray9091[i_1601_];
		class179_sub1_1584_.aShortArray9070[i_1601_]
		    = aShortArray9070[i_1601_];
		class179_sub1_1584_.aShortArray9071[i_1601_]
		    = aShortArray9071[i_1601_];
	    }
	} else {
	    class179_sub1_1584_.aShortArray9091 = aShortArray9091;
	    class179_sub1_1584_.aShortArray9070 = aShortArray9070;
	    class179_sub1_1584_.aShortArray9071 = aShortArray9071;
	}
	if (Class125.method2150(i, anInt9080)) {
	    if (bool)
		class179_sub1_1584_.aByte9037 |= 0x10;
	    class179_sub1_1584_.aClass139_9079
		= class179_sub1_1585_.aClass139_9079;
	    class179_sub1_1584_.aClass139_9079.anInterface16_1642
		= aClass139_9079.anInterface16_1642;
	} else if (Class125.method2155(i, anInt9080))
	    class179_sub1_1584_.aClass139_9079 = aClass139_9079;
	else
	    class179_sub1_1584_.aClass139_9079 = null;
	if (Class125.method2138(i, anInt9080)) {
	    if (class179_sub1_1585_.aShortArray9039 == null
		|| class179_sub1_1585_.aShortArray9039.length < anInt9065) {
		int i_1602_ = anInt9065;
		class179_sub1_1584_.aShortArray9039
		    = class179_sub1_1585_.aShortArray9039 = new short[i_1602_];
	    } else
		class179_sub1_1584_.aShortArray9039
		    = class179_sub1_1585_.aShortArray9039;
	    for (int i_1603_ = 0; i_1603_ < anInt9065; i_1603_++)
		class179_sub1_1584_.aShortArray9039[i_1603_]
		    = aShortArray9039[i_1603_];
	} else
	    class179_sub1_1584_.aShortArray9039 = aShortArray9039;
	if (Class125.method2139(i, anInt9080)) {
	    if (class179_sub1_1585_.aClass131Array9101 == null
		|| class179_sub1_1585_.aClass131Array9101.length < anInt9074) {
		int i_1604_ = anInt9074;
		class179_sub1_1584_.aClass131Array9101
		    = class179_sub1_1585_.aClass131Array9101
		    = new Class131[i_1604_];
		for (int i_1605_ = 0; i_1605_ < anInt9074; i_1605_++)
		    class179_sub1_1584_.aClass131Array9101[i_1605_]
			= aClass131Array9101[i_1605_].method2280();
	    } else {
		class179_sub1_1584_.aClass131Array9101
		    = class179_sub1_1585_.aClass131Array9101;
		for (int i_1606_ = 0; i_1606_ < anInt9074; i_1606_++)
		    class179_sub1_1584_.aClass131Array9101[i_1606_]
			.method2284(aClass131Array9101[i_1606_]);
	    }
	} else
	    class179_sub1_1584_.aClass131Array9101 = aClass131Array9101;
	class179_sub1_1584_.aClass148Array9100 = aClass148Array9100;
	if (aBool9085) {
	    class179_sub1_1584_.anInt9083 = anInt9083;
	    class179_sub1_1584_.anInt9084 = anInt9084;
	    class179_sub1_1584_.aShort9088 = aShort9088;
	    class179_sub1_1584_.aShort9089 = aShort9089;
	    class179_sub1_1584_.aShort9086 = aShort9086;
	    class179_sub1_1584_.aShort9103 = aShort9103;
	    class179_sub1_1584_.aShort9090 = aShort9090;
	    class179_sub1_1584_.aShort9102 = aShort9102;
	    class179_sub1_1584_.aBool9085 = true;
	} else
	    class179_sub1_1584_.aBool9085 = false;
	if (aBool9092) {
	    class179_sub1_1584_.aShort9093 = aShort9093;
	    class179_sub1_1584_.aBool9092 = true;
	} else
	    class179_sub1_1584_.aBool9092 = false;
	class179_sub1_1584_.anIntArrayArray9055 = anIntArrayArray9055;
	class179_sub1_1584_.anIntArrayArray9048 = anIntArrayArray9048;
	class179_sub1_1584_.anIntArrayArray9042 = anIntArrayArray9042;
	class179_sub1_1584_.aShortArray9096 = aShortArray9096;
	class179_sub1_1584_.anIntArray9046 = anIntArray9046;
	class179_sub1_1584_.aShortArray9056 = aShortArray9056;
	class179_sub1_1584_.aShortArray9044 = aShortArray9044;
	class179_sub1_1584_.anIntArray9094 = anIntArray9094;
	class179_sub1_1584_.aClass184Array9097 = aClass184Array9097;
	class179_sub1_1584_.aClass154Array9098 = aClass154Array9098;
	return class179_sub1_1584_;
    }
    
    void method14583() {
	if (aBool9095) {
	    aBool9095 = false;
	    if (aClass184Array9097 == null && aClass154Array9098 == null
		&& aClass148Array9100 == null
		&& !Class125.method2132(anInt9043, anInt9080)) {
		boolean bool = false;
		boolean bool_1607_ = false;
		boolean bool_1608_ = false;
		if (anIntArray9052 != null
		    && !Class125.method2151(anInt9043, anInt9080)) {
		    if (aClass137_9075 == null
			|| aClass137_9075.anInterface15_1635 != null) {
			if (!aBool9085)
			    method14558();
			bool = true;
		    } else
			aBool9095 = true;
		}
		if (anIntArray9069 != null
		    && !Class125.method2207(anInt9043, anInt9080)) {
		    if (aClass137_9075 == null
			|| aClass137_9075.anInterface15_1635 != null) {
			if (!aBool9085)
			    method14558();
			bool_1607_ = true;
		    } else
			aBool9095 = true;
		}
		if (anIntArray9054 != null
		    && !Class125.method2153(anInt9043, anInt9080)) {
		    if (aClass137_9075 == null
			|| aClass137_9075.anInterface15_1635 != null) {
			if (!aBool9085)
			    method14558();
			bool_1608_ = true;
		    } else
			aBool9095 = true;
		}
		if (bool)
		    anIntArray9052 = null;
		if (bool_1607_)
		    anIntArray9069 = null;
		if (bool_1608_)
		    anIntArray9054 = null;
	    }
	    if (aShortArray9096 != null && anIntArray9052 == null
		&& anIntArray9069 == null && anIntArray9054 == null) {
		aShortArray9096 = null;
		anIntArray9046 = null;
	    }
	    if (aByteArray9061 != null
		&& !Class125.method2154(anInt9043, anInt9080)) {
		if (aClass137_9051 != null) {
		    if (aClass137_9051.anInterface15_1635 != null) {
			aShortArray9060 = null;
			aShortArray9059 = null;
			aShortArray9073 = null;
			aByteArray9061 = null;
		    } else
			aBool9095 = true;
		} else if (aClass137_9076 == null
			   || aClass137_9076.anInterface15_1635 != null) {
		    aShortArray9060 = null;
		    aShortArray9059 = null;
		    aShortArray9073 = null;
		    aByteArray9061 = null;
		} else
		    aBool9095 = true;
	    }
	    if (aShortArray9067 != null
		&& !Class125.method2185(anInt9043, anInt9080)) {
		if (aClass137_9076 == null
		    || aClass137_9076.anInterface15_1635 != null)
		    aShortArray9067 = null;
		else
		    aBool9095 = true;
	    }
	    if (aByteArray9068 != null
		&& !Class125.method2156(anInt9043, anInt9080)) {
		if (aClass137_9076 == null
		    || aClass137_9076.anInterface15_1635 != null)
		    aByteArray9068 = null;
		else
		    aBool9095 = true;
	    }
	    if (aFloatArray9058 != null
		&& !Class125.method2157(anInt9043, anInt9080)) {
		if (aClass137_9078 == null
		    || aClass137_9078.anInterface15_1635 != null) {
		    aFloatArray9064 = null;
		    aFloatArray9058 = null;
		} else
		    aBool9095 = true;
	    }
	    if (aShortArray9039 != null
		&& !Class125.method2162(anInt9043, anInt9080)) {
		if (aClass137_9076 == null
		    || aClass137_9076.anInterface15_1635 != null)
		    aShortArray9039 = null;
		else
		    aBool9095 = true;
	    }
	    if (aShortArray9091 != null
		&& !Class125.method2161(anInt9043, anInt9080)) {
		if ((aClass139_9079 == null
		     || aClass139_9079.anInterface16_1642 != null)
		    && (aClass137_9076 == null
			|| aClass137_9076.anInterface15_1635 != null)) {
		    aShortArray9071 = null;
		    aShortArray9070 = null;
		    aShortArray9091 = null;
		} else
		    aBool9095 = true;
	    }
	    if (anIntArrayArray9048 != null
		&& !Class125.method2158(anInt9043, anInt9080)) {
		anIntArrayArray9048 = null;
		aShortArray9044 = null;
	    }
	    if (anIntArrayArray9055 != null
		&& !Class125.method2197(anInt9043, anInt9080)) {
		anIntArrayArray9055 = null;
		aShortArray9056 = null;
	    }
	    if (anIntArrayArray9042 != null
		&& !Class125.method2209(anInt9043, anInt9080))
		anIntArrayArray9042 = null;
	    if (anIntArray9094 != null && (anInt9043 & 0x800) == 0
		&& (anInt9043 & 0x40000) == 0)
		anIntArray9094 = null;
	}
    }
    
    public void method3070(int i, int i_1609_, int i_1610_) {
	for (int i_1611_ = 0; i_1611_ < anInt9072; i_1611_++) {
	    if (i != 0)
		anIntArray9052[i_1611_] += i;
	    if (i_1609_ != 0)
		anIntArray9069[i_1611_] += i_1609_;
	    if (i_1610_ != 0)
		anIntArray9054[i_1611_] += i_1610_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method3102(int i, int i_1612_, int i_1613_) {
	for (int i_1614_ = 0; i_1614_ < anInt9072; i_1614_++) {
	    if (i != 0)
		anIntArray9052[i_1614_] += i;
	    if (i_1612_ != 0)
		anIntArray9069[i_1614_] += i_1612_;
	    if (i_1613_ != 0)
		anIntArray9054[i_1614_] += i_1613_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method3072() {
	for (int i = 0; i < anInt9072; i++)
	    anIntArray9054[i] = -anIntArray9054[i];
	for (int i = 0; i < anInt9057; i++)
	    aShortArray9060[i] = (short) -aShortArray9060[i];
	for (int i = 0; i < anInt9065; i++) {
	    short i_1615_ = aShortArray9091[i];
	    aShortArray9091[i] = aShortArray9071[i];
	    aShortArray9071[i] = i_1615_;
	}
	if (aClass137_9051 == null && aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
	if (aClass137_9051 != null)
	    aClass137_9051.anInterface15_1635 = null;
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	if (aClass139_9079 != null)
	    aClass139_9079.anInterface16_1642 = null;
	aBool9085 = false;
    }
    
    public void method3073(int i, int i_1616_, Class161 class161,
			   Class161 class161_1617_, int i_1618_, int i_1619_,
			   int i_1620_) {
	if (!aBool9085)
	    method14558();
	int i_1621_ = i_1618_ + aShort9088;
	int i_1622_ = i_1618_ + aShort9089;
	int i_1623_ = i_1620_ + aShort9090;
	int i_1624_ = i_1620_ + aShort9102;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1621_ >= 0
		&& ((i_1622_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1759 * 363736815)
		&& i_1623_ >= 0
		&& ((i_1624_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1760 * -1152334393))) {
	    if (i == 4 || i == 5) {
		if (class161_1617_ == null
		    || (i_1621_ < 0
			|| ((i_1622_ + class161_1617_.anInt1761 * 435863595
			     >> class161_1617_.anInt1763 * -2063427645)
			    >= class161_1617_.anInt1759 * 363736815)
			|| i_1623_ < 0
			|| ((i_1624_ + class161_1617_.anInt1761 * 435863595
			     >> class161_1617_.anInt1763 * -2063427645)
			    >= class161_1617_.anInt1760 * -1152334393)))
		    return;
	    } else {
		i_1621_ >>= class161.anInt1763 * -2063427645;
		i_1622_ = (i_1622_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		i_1623_ >>= class161.anInt1763 * -2063427645;
		i_1624_ = (i_1624_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		if (class161.method2577(i_1621_, i_1623_, (byte) 27) == i_1619_
		    && (class161.method2577(i_1622_, i_1623_, (byte) -71)
			== i_1619_)
		    && (class161.method2577(i_1621_, i_1624_, (byte) 70)
			== i_1619_)
		    && (class161.method2577(i_1622_, i_1624_, (byte) -74)
			== i_1619_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1625_ = 0; i_1625_ < anInt9072; i_1625_++)
		    anIntArray9069[i_1625_]
			= (anIntArray9069[i_1625_]
			   + class161.method2588((anIntArray9052[i_1625_]
						  + i_1618_),
						 (anIntArray9054[i_1625_]
						  + i_1620_),
						 -845103698)
			   - i_1619_);
	    } else if (i == 2) {
		int i_1626_ = aShort9086;
		if (i_1626_ == 0)
		    return;
		for (int i_1627_ = 0; i_1627_ < anInt9072; i_1627_++) {
		    int i_1628_ = (anIntArray9069[i_1627_] << 16) / i_1626_;
		    if (i_1628_ < i_1616_)
			anIntArray9069[i_1627_]
			    = (anIntArray9069[i_1627_]
			       + (class161.method2588((anIntArray9052[i_1627_]
						       + i_1618_),
						      (anIntArray9054[i_1627_]
						       + i_1620_),
						      -1333747156)
				  - i_1619_) * (i_1616_ - i_1628_) / i_1616_);
		}
	    } else if (i == 3) {
		int i_1629_ = (i_1616_ & 0xff) * 16;
		int i_1630_ = (i_1616_ >> 8 & 0xff) * 16;
		int i_1631_ = (i_1616_ >> 16 & 0xff) << 6;
		int i_1632_ = (i_1616_ >> 24 & 0xff) << 6;
		if (i_1618_ - (i_1629_ >> 1) < 0
		    || ((i_1618_ + (i_1629_ >> 1)
			 + class161.anInt1761 * 435863595)
			>= (class161.anInt1759 * 363736815
			    << class161.anInt1763 * -2063427645))
		    || i_1620_ - (i_1630_ >> 1) < 0
		    || ((i_1620_ + (i_1630_ >> 1)
			 + class161.anInt1761 * 435863595)
			>= (class161.anInt1760 * -1152334393
			    << class161.anInt1763 * -2063427645)))
		    return;
		method2938(class161, i_1618_, i_1619_, i_1620_, i_1629_,
			   i_1630_, i_1631_, i_1632_);
	    } else if (i == 4) {
		int i_1633_ = aShort9103 - aShort9086;
		for (int i_1634_ = 0; i_1634_ < anInt9072; i_1634_++)
		    anIntArray9069[i_1634_]
			= (anIntArray9069[i_1634_]
			   + (class161_1617_.method2588((anIntArray9052
							 [i_1634_]) + i_1618_,
							(anIntArray9054
							 [i_1634_]) + i_1620_,
							-1671312988)
			      - i_1619_)
			   + i_1633_);
	    } else if (i == 5) {
		int i_1635_ = aShort9103 - aShort9086;
		for (int i_1636_ = 0; i_1636_ < anInt9072; i_1636_++) {
		    int i_1637_ = anIntArray9052[i_1636_] + i_1618_;
		    int i_1638_ = anIntArray9054[i_1636_] + i_1620_;
		    int i_1639_
			= class161.method2588(i_1637_, i_1638_, -92931149);
		    int i_1640_ = class161_1617_.method2588(i_1637_, i_1638_,
							    -2026204774);
		    int i_1641_ = i_1639_ - i_1640_ - i_1616_;
		    anIntArray9069[i_1636_]
			= ((anIntArray9069[i_1636_] << 8) / i_1635_ * i_1641_
			   >> 8) - (i_1619_ - i_1639_);
		}
	    }
	    if (aClass137_9075 != null)
		aClass137_9075.anInterface15_1635 = null;
	    aBool9085 = false;
	}
    }
    
    public void method3029(int i, int i_1642_, Class161 class161,
			   Class161 class161_1643_, int i_1644_, int i_1645_,
			   int i_1646_) {
	if (!aBool9085)
	    method14558();
	int i_1647_ = i_1644_ + aShort9088;
	int i_1648_ = i_1644_ + aShort9089;
	int i_1649_ = i_1646_ + aShort9090;
	int i_1650_ = i_1646_ + aShort9102;
	if (i != 1 && i != 2 && i != 3 && i != 5
	    || (i_1647_ >= 0
		&& ((i_1648_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1759 * 363736815)
		&& i_1649_ >= 0
		&& ((i_1650_ + class161.anInt1761 * 435863595
		     >> class161.anInt1763 * -2063427645)
		    < class161.anInt1760 * -1152334393))) {
	    if (i == 4 || i == 5) {
		if (class161_1643_ == null
		    || (i_1647_ < 0
			|| ((i_1648_ + class161_1643_.anInt1761 * 435863595
			     >> class161_1643_.anInt1763 * -2063427645)
			    >= class161_1643_.anInt1759 * 363736815)
			|| i_1649_ < 0
			|| ((i_1650_ + class161_1643_.anInt1761 * 435863595
			     >> class161_1643_.anInt1763 * -2063427645)
			    >= class161_1643_.anInt1760 * -1152334393)))
		    return;
	    } else {
		i_1647_ >>= class161.anInt1763 * -2063427645;
		i_1648_ = (i_1648_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		i_1649_ >>= class161.anInt1763 * -2063427645;
		i_1650_ = (i_1650_ + (class161.anInt1761 * 435863595 - 1)
			   >> class161.anInt1763 * -2063427645);
		if (class161.method2577(i_1647_, i_1649_, (byte) 34) == i_1645_
		    && (class161.method2577(i_1648_, i_1649_, (byte) -16)
			== i_1645_)
		    && (class161.method2577(i_1647_, i_1650_, (byte) 38)
			== i_1645_)
		    && (class161.method2577(i_1648_, i_1650_, (byte) 75)
			== i_1645_))
		    return;
	    }
	    if (i == 1) {
		for (int i_1651_ = 0; i_1651_ < anInt9072; i_1651_++)
		    anIntArray9069[i_1651_]
			= (anIntArray9069[i_1651_]
			   + class161.method2588((anIntArray9052[i_1651_]
						  + i_1644_),
						 (anIntArray9054[i_1651_]
						  + i_1646_),
						 -625815279)
			   - i_1645_);
	    } else if (i == 2) {
		int i_1652_ = aShort9086;
		if (i_1652_ == 0)
		    return;
		for (int i_1653_ = 0; i_1653_ < anInt9072; i_1653_++) {
		    int i_1654_ = (anIntArray9069[i_1653_] << 16) / i_1652_;
		    if (i_1654_ < i_1642_)
			anIntArray9069[i_1653_]
			    = (anIntArray9069[i_1653_]
			       + (class161.method2588((anIntArray9052[i_1653_]
						       + i_1644_),
						      (anIntArray9054[i_1653_]
						       + i_1646_),
						      -843305935)
				  - i_1645_) * (i_1642_ - i_1654_) / i_1642_);
		}
	    } else if (i == 3) {
		int i_1655_ = (i_1642_ & 0xff) * 16;
		int i_1656_ = (i_1642_ >> 8 & 0xff) * 16;
		int i_1657_ = (i_1642_ >> 16 & 0xff) << 6;
		int i_1658_ = (i_1642_ >> 24 & 0xff) << 6;
		if (i_1644_ - (i_1655_ >> 1) < 0
		    || ((i_1644_ + (i_1655_ >> 1)
			 + class161.anInt1761 * 435863595)
			>= (class161.anInt1759 * 363736815
			    << class161.anInt1763 * -2063427645))
		    || i_1646_ - (i_1656_ >> 1) < 0
		    || ((i_1646_ + (i_1656_ >> 1)
			 + class161.anInt1761 * 435863595)
			>= (class161.anInt1760 * -1152334393
			    << class161.anInt1763 * -2063427645)))
		    return;
		method2938(class161, i_1644_, i_1645_, i_1646_, i_1655_,
			   i_1656_, i_1657_, i_1658_);
	    } else if (i == 4) {
		int i_1659_ = aShort9103 - aShort9086;
		for (int i_1660_ = 0; i_1660_ < anInt9072; i_1660_++)
		    anIntArray9069[i_1660_]
			= (anIntArray9069[i_1660_]
			   + ((class161_1643_.method2588
			       (anIntArray9052[i_1660_] + i_1644_,
				anIntArray9054[i_1660_] + i_1646_, 317460808))
			      - i_1645_)
			   + i_1659_);
	    } else if (i == 5) {
		int i_1661_ = aShort9103 - aShort9086;
		for (int i_1662_ = 0; i_1662_ < anInt9072; i_1662_++) {
		    int i_1663_ = anIntArray9052[i_1662_] + i_1644_;
		    int i_1664_ = anIntArray9054[i_1662_] + i_1646_;
		    int i_1665_
			= class161.method2588(i_1663_, i_1664_, -934694577);
		    int i_1666_ = class161_1643_.method2588(i_1663_, i_1664_,
							    -1425288749);
		    int i_1667_ = i_1665_ - i_1666_ - i_1642_;
		    anIntArray9069[i_1662_]
			= ((anIntArray9069[i_1662_] << 8) / i_1661_ * i_1667_
			   >> 8) - (i_1645_ - i_1665_);
		}
	    }
	    if (aClass137_9075 != null)
		aClass137_9075.anInterface15_1635 = null;
	    aBool9085 = false;
	}
    }
    
    void method14584() {
	int i = 32767;
	int i_1668_ = 32767;
	int i_1669_ = 32767;
	int i_1670_ = -32768;
	int i_1671_ = -32768;
	int i_1672_ = -32768;
	int i_1673_ = 0;
	int i_1674_ = 0;
	for (int i_1675_ = 0; i_1675_ < anInt9072; i_1675_++) {
	    int i_1676_ = anIntArray9052[i_1675_];
	    int i_1677_ = anIntArray9069[i_1675_];
	    int i_1678_ = anIntArray9054[i_1675_];
	    if (i_1676_ < i)
		i = i_1676_;
	    if (i_1676_ > i_1670_)
		i_1670_ = i_1676_;
	    if (i_1677_ < i_1668_)
		i_1668_ = i_1677_;
	    if (i_1677_ > i_1671_)
		i_1671_ = i_1677_;
	    if (i_1678_ < i_1669_)
		i_1669_ = i_1678_;
	    if (i_1678_ > i_1672_)
		i_1672_ = i_1678_;
	    int i_1679_ = i_1676_ * i_1676_ + i_1678_ * i_1678_;
	    if (i_1679_ > i_1673_)
		i_1673_ = i_1679_;
	    i_1679_
		= i_1676_ * i_1676_ + i_1678_ * i_1678_ + i_1677_ * i_1677_;
	    if (i_1679_ > i_1674_)
		i_1674_ = i_1679_;
	}
	aShort9088 = (short) i;
	aShort9089 = (short) i_1670_;
	aShort9086 = (short) i_1668_;
	aShort9103 = (short) i_1671_;
	aShort9090 = (short) i_1669_;
	aShort9102 = (short) i_1672_;
	anInt9084 = (int) (Math.sqrt((double) i_1673_) + 0.99);
	anInt9083 = (int) (Math.sqrt((double) i_1674_) + 0.99);
	aBool9085 = true;
    }
    
    public Class184[] method2979() {
	return aClass184Array9097;
    }
    
    public int method3075() {
	if (!aBool9085)
	    method14558();
	return aShort9086;
    }
    
    public int method3076() {
	if (!aBool9085)
	    method14558();
	return aShort9086;
    }
    
    public void method2992() {
	if (anInt9057 > 0 && anInt9111 > 0) {
	    method14564(false);
	    if ((aByte9037 & 0x10) == 0
		&& aClass139_9079.anInterface16_1642 == null)
		method14563(false);
	    method14590();
	}
    }
    
    public void method3095(int i) {
	aShort9047 = (short) i;
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
	if (aClass137_9051 != null)
	    aClass137_9051.anInterface15_1635 = null;
    }
    
    public int method3045() {
	return aShort9110;
    }
    
    public int method3080() {
	return aShort9047;
    }
    
    public int method3081() {
	return aShort9047;
    }
    
    void method14585(Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1) {
	if (aClass182_Sub3_9041.anIntArray9829.length < anInt9057) {
	    aClass182_Sub3_9041.anIntArray9829 = new int[anInt9057];
	    aClass182_Sub3_9041.anIntArray9830 = new int[anInt9057];
	}
	int[] is = aClass182_Sub3_9041.anIntArray9829;
	int[] is_1680_ = aClass182_Sub3_9041.anIntArray9830;
	for (int i = 0; i < anInt9072; i++) {
	    int i_1681_
		= (((anIntArray9052[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9697
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12109);
	    int i_1682_
		= (((anIntArray9054[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9765
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12111);
	    int i_1683_ = anIntArray9046[i];
	    int i_1684_ = anIntArray9046[i + 1];
	    for (int i_1685_ = i_1683_;
		 i_1685_ < i_1684_ && aShortArray9096[i_1685_] != 0;
		 i_1685_++) {
		int i_1686_ = (aShortArray9096[i_1685_] & 0xffff) - 1;
		is[i_1686_] = i_1681_;
		is_1680_[i_1686_] = i_1682_;
	    }
	}
	for (int i = 0; i < anInt9111; i++) {
	    if (aByteArray9068 == null || aByteArray9068[i] <= 128) {
		int i_1687_ = aShortArray9091[i] & 0xffff;
		int i_1688_ = aShortArray9070[i] & 0xffff;
		int i_1689_ = aShortArray9071[i] & 0xffff;
		int i_1690_ = is[i_1687_];
		int i_1691_ = is[i_1688_];
		int i_1692_ = is[i_1689_];
		int i_1693_ = is_1680_[i_1687_];
		int i_1694_ = is_1680_[i_1688_];
		int i_1695_ = is_1680_[i_1689_];
		if (((i_1690_ - i_1691_) * (i_1694_ - i_1695_)
		     - (i_1694_ - i_1693_) * (i_1692_ - i_1691_))
		    > 0)
		    class525_sub16_sub17_sub1.method18765(i_1693_, i_1694_,
							  i_1695_, i_1690_,
							  i_1691_, i_1692_);
	    }
	}
    }
    
    public void method2936(int i, int i_1696_, int i_1697_) {
	for (int i_1698_ = 0; i_1698_ < anInt9072; i_1698_++) {
	    if (i != 128)
		anIntArray9052[i_1698_] = anIntArray9052[i_1698_] * i >> 7;
	    if (i_1696_ != 128)
		anIntArray9069[i_1698_]
		    = anIntArray9069[i_1698_] * i_1696_ >> 7;
	    if (i_1697_ != 128)
		anIntArray9054[i_1698_]
		    = anIntArray9054[i_1698_] * i_1697_ >> 7;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method2997(Class444 class444, int i, boolean bool) {
	if (aShortArray9056 != null) {
	    Class444 class444_1699_ = class444;
	    if (bool) {
		class444_1699_ = aClass182_Sub3_9041.aClass444_9730;
		class444_1699_.method7163(class444);
	    }
	    float[] fs = new float[3];
	    for (int i_1700_ = 0; i_1700_ < anInt9072; i_1700_++) {
		if ((i & aShortArray9056[i_1700_]) != 0) {
		    class444_1699_.method7168((float) anIntArray9052[i_1700_],
					      (float) anIntArray9069[i_1700_],
					      (float) anIntArray9054[i_1700_],
					      fs);
		    anIntArray9052[i_1700_] = (int) fs[0];
		    anIntArray9069[i_1700_] = (int) fs[1];
		    anIntArray9054[i_1700_] = (int) fs[2];
		}
	    }
	}
    }
    
    public void method2968(Class444 class444, int i, boolean bool) {
	if (aShortArray9056 != null) {
	    Class444 class444_1701_ = class444;
	    if (bool) {
		class444_1701_ = aClass182_Sub3_9041.aClass444_9730;
		class444_1701_.method7163(class444);
	    }
	    float[] fs = new float[3];
	    for (int i_1702_ = 0; i_1702_ < anInt9072; i_1702_++) {
		if ((i & aShortArray9056[i_1702_]) != 0) {
		    class444_1701_.method7168((float) anIntArray9052[i_1702_],
					      (float) anIntArray9069[i_1702_],
					      (float) anIntArray9054[i_1702_],
					      fs);
		    anIntArray9052[i_1702_] = (int) fs[0];
		    anIntArray9069[i_1702_] = (int) fs[1];
		    anIntArray9054[i_1702_] = (int) fs[2];
		}
	    }
	}
    }
    
    boolean method14586(int i, int i_1703_, int i_1704_, int i_1705_,
			int i_1706_, int i_1707_, int i_1708_, int i_1709_) {
	if (i_1703_ < i_1704_ && i_1703_ < i_1705_ && i_1703_ < i_1706_)
	    return false;
	if (i_1703_ > i_1704_ && i_1703_ > i_1705_ && i_1703_ > i_1706_)
	    return false;
	if (i < i_1707_ && i < i_1708_ && i < i_1709_)
	    return false;
	if (i > i_1707_ && i > i_1708_ && i > i_1709_)
	    return false;
	return true;
    }
    
    boolean method14587(int i, int i_1710_, int i_1711_, int i_1712_,
			int i_1713_, int i_1714_, int i_1715_, int i_1716_) {
	if (i_1710_ < i_1711_ && i_1710_ < i_1712_ && i_1710_ < i_1713_)
	    return false;
	if (i_1710_ > i_1711_ && i_1710_ > i_1712_ && i_1710_ > i_1713_)
	    return false;
	if (i < i_1714_ && i < i_1715_ && i < i_1716_)
	    return false;
	if (i > i_1714_ && i > i_1715_ && i > i_1716_)
	    return false;
	return true;
    }
    
    public int method2956() {
	if (!aBool9085)
	    method14558();
	return anInt9084;
    }
    
    boolean method14588(int i, int i_1717_, int i_1718_, int i_1719_,
			int i_1720_, int i_1721_, int i_1722_, int i_1723_) {
	if (i_1717_ < i_1718_ && i_1717_ < i_1719_ && i_1717_ < i_1720_)
	    return false;
	if (i_1717_ > i_1718_ && i_1717_ > i_1719_ && i_1717_ > i_1720_)
	    return false;
	if (i < i_1721_ && i < i_1722_ && i < i_1723_)
	    return false;
	if (i > i_1721_ && i > i_1722_ && i > i_1723_)
	    return false;
	return true;
    }
    
    static float[] method14589(float[] fs, int i) {
	float[] fs_1724_ = new float[i];
	System.arraycopy(fs, 0, fs_1724_, 0, i);
	return fs_1724_;
    }
    
    void method14590() {
	if (aBool9095) {
	    aBool9095 = false;
	    if (aClass184Array9097 == null && aClass154Array9098 == null
		&& aClass148Array9100 == null
		&& !Class125.method2132(anInt9043, anInt9080)) {
		boolean bool = false;
		boolean bool_1725_ = false;
		boolean bool_1726_ = false;
		if (anIntArray9052 != null
		    && !Class125.method2151(anInt9043, anInt9080)) {
		    if (aClass137_9075 == null
			|| aClass137_9075.anInterface15_1635 != null) {
			if (!aBool9085)
			    method14558();
			bool = true;
		    } else
			aBool9095 = true;
		}
		if (anIntArray9069 != null
		    && !Class125.method2207(anInt9043, anInt9080)) {
		    if (aClass137_9075 == null
			|| aClass137_9075.anInterface15_1635 != null) {
			if (!aBool9085)
			    method14558();
			bool_1725_ = true;
		    } else
			aBool9095 = true;
		}
		if (anIntArray9054 != null
		    && !Class125.method2153(anInt9043, anInt9080)) {
		    if (aClass137_9075 == null
			|| aClass137_9075.anInterface15_1635 != null) {
			if (!aBool9085)
			    method14558();
			bool_1726_ = true;
		    } else
			aBool9095 = true;
		}
		if (bool)
		    anIntArray9052 = null;
		if (bool_1725_)
		    anIntArray9069 = null;
		if (bool_1726_)
		    anIntArray9054 = null;
	    }
	    if (aShortArray9096 != null && anIntArray9052 == null
		&& anIntArray9069 == null && anIntArray9054 == null) {
		aShortArray9096 = null;
		anIntArray9046 = null;
	    }
	    if (aByteArray9061 != null
		&& !Class125.method2154(anInt9043, anInt9080)) {
		if (aClass137_9051 != null) {
		    if (aClass137_9051.anInterface15_1635 != null) {
			aShortArray9060 = null;
			aShortArray9059 = null;
			aShortArray9073 = null;
			aByteArray9061 = null;
		    } else
			aBool9095 = true;
		} else if (aClass137_9076 == null
			   || aClass137_9076.anInterface15_1635 != null) {
		    aShortArray9060 = null;
		    aShortArray9059 = null;
		    aShortArray9073 = null;
		    aByteArray9061 = null;
		} else
		    aBool9095 = true;
	    }
	    if (aShortArray9067 != null
		&& !Class125.method2185(anInt9043, anInt9080)) {
		if (aClass137_9076 == null
		    || aClass137_9076.anInterface15_1635 != null)
		    aShortArray9067 = null;
		else
		    aBool9095 = true;
	    }
	    if (aByteArray9068 != null
		&& !Class125.method2156(anInt9043, anInt9080)) {
		if (aClass137_9076 == null
		    || aClass137_9076.anInterface15_1635 != null)
		    aByteArray9068 = null;
		else
		    aBool9095 = true;
	    }
	    if (aFloatArray9058 != null
		&& !Class125.method2157(anInt9043, anInt9080)) {
		if (aClass137_9078 == null
		    || aClass137_9078.anInterface15_1635 != null) {
		    aFloatArray9064 = null;
		    aFloatArray9058 = null;
		} else
		    aBool9095 = true;
	    }
	    if (aShortArray9039 != null
		&& !Class125.method2162(anInt9043, anInt9080)) {
		if (aClass137_9076 == null
		    || aClass137_9076.anInterface15_1635 != null)
		    aShortArray9039 = null;
		else
		    aBool9095 = true;
	    }
	    if (aShortArray9091 != null
		&& !Class125.method2161(anInt9043, anInt9080)) {
		if ((aClass139_9079 == null
		     || aClass139_9079.anInterface16_1642 != null)
		    && (aClass137_9076 == null
			|| aClass137_9076.anInterface15_1635 != null)) {
		    aShortArray9071 = null;
		    aShortArray9070 = null;
		    aShortArray9091 = null;
		} else
		    aBool9095 = true;
	    }
	    if (anIntArrayArray9048 != null
		&& !Class125.method2158(anInt9043, anInt9080)) {
		anIntArrayArray9048 = null;
		aShortArray9044 = null;
	    }
	    if (anIntArrayArray9055 != null
		&& !Class125.method2197(anInt9043, anInt9080)) {
		anIntArrayArray9055 = null;
		aShortArray9056 = null;
	    }
	    if (anIntArrayArray9042 != null
		&& !Class125.method2209(anInt9043, anInt9080))
		anIntArrayArray9042 = null;
	    if (anIntArray9094 != null && (anInt9043 & 0x800) == 0
		&& (anInt9043 & 0x40000) == 0)
		anIntArray9094 = null;
	}
    }
    
    void method14591(Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1) {
	if (aClass182_Sub3_9041.anIntArray9829.length < anInt9057) {
	    aClass182_Sub3_9041.anIntArray9829 = new int[anInt9057];
	    aClass182_Sub3_9041.anIntArray9830 = new int[anInt9057];
	}
	int[] is = aClass182_Sub3_9041.anIntArray9829;
	int[] is_1727_ = aClass182_Sub3_9041.anIntArray9830;
	for (int i = 0; i < anInt9072; i++) {
	    int i_1728_
		= (((anIntArray9052[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9697
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12109);
	    int i_1729_
		= (((anIntArray9054[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9765
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12111);
	    int i_1730_ = anIntArray9046[i];
	    int i_1731_ = anIntArray9046[i + 1];
	    for (int i_1732_ = i_1730_;
		 i_1732_ < i_1731_ && aShortArray9096[i_1732_] != 0;
		 i_1732_++) {
		int i_1733_ = (aShortArray9096[i_1732_] & 0xffff) - 1;
		is[i_1733_] = i_1728_;
		is_1727_[i_1733_] = i_1729_;
	    }
	}
	for (int i = 0; i < anInt9111; i++) {
	    if (aByteArray9068 == null || aByteArray9068[i] <= 128) {
		int i_1734_ = aShortArray9091[i] & 0xffff;
		int i_1735_ = aShortArray9070[i] & 0xffff;
		int i_1736_ = aShortArray9071[i] & 0xffff;
		int i_1737_ = is[i_1734_];
		int i_1738_ = is[i_1735_];
		int i_1739_ = is[i_1736_];
		int i_1740_ = is_1727_[i_1734_];
		int i_1741_ = is_1727_[i_1735_];
		int i_1742_ = is_1727_[i_1736_];
		if (((i_1737_ - i_1738_) * (i_1741_ - i_1742_)
		     - (i_1741_ - i_1740_) * (i_1739_ - i_1738_))
		    > 0)
		    class525_sub16_sub17_sub1.method18765(i_1740_, i_1741_,
							  i_1742_, i_1737_,
							  i_1738_, i_1739_);
	    }
	}
    }
    
    void method14592(Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1) {
	if (aClass182_Sub3_9041.anIntArray9829.length < anInt9057) {
	    aClass182_Sub3_9041.anIntArray9829 = new int[anInt9057];
	    aClass182_Sub3_9041.anIntArray9830 = new int[anInt9057];
	}
	int[] is = aClass182_Sub3_9041.anIntArray9829;
	int[] is_1743_ = aClass182_Sub3_9041.anIntArray9830;
	for (int i = 0; i < anInt9072; i++) {
	    int i_1744_
		= (((anIntArray9052[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9697
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12109);
	    int i_1745_
		= (((anIntArray9054[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9765
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12111);
	    int i_1746_ = anIntArray9046[i];
	    int i_1747_ = anIntArray9046[i + 1];
	    for (int i_1748_ = i_1746_;
		 i_1748_ < i_1747_ && aShortArray9096[i_1748_] != 0;
		 i_1748_++) {
		int i_1749_ = (aShortArray9096[i_1748_] & 0xffff) - 1;
		is[i_1749_] = i_1744_;
		is_1743_[i_1749_] = i_1745_;
	    }
	}
	for (int i = 0; i < anInt9111; i++) {
	    if (aByteArray9068 == null || aByteArray9068[i] <= 128) {
		int i_1750_ = aShortArray9091[i] & 0xffff;
		int i_1751_ = aShortArray9070[i] & 0xffff;
		int i_1752_ = aShortArray9071[i] & 0xffff;
		int i_1753_ = is[i_1750_];
		int i_1754_ = is[i_1751_];
		int i_1755_ = is[i_1752_];
		int i_1756_ = is_1743_[i_1750_];
		int i_1757_ = is_1743_[i_1751_];
		int i_1758_ = is_1743_[i_1752_];
		if (((i_1753_ - i_1754_) * (i_1757_ - i_1758_)
		     - (i_1757_ - i_1756_) * (i_1755_ - i_1754_))
		    > 0)
		    class525_sub16_sub17_sub1.method18765(i_1756_, i_1757_,
							  i_1758_, i_1753_,
							  i_1754_, i_1755_);
	    }
	}
    }
    
    void method14593(Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1) {
	if (aClass182_Sub3_9041.anIntArray9829.length < anInt9057) {
	    aClass182_Sub3_9041.anIntArray9829 = new int[anInt9057];
	    aClass182_Sub3_9041.anIntArray9830 = new int[anInt9057];
	}
	int[] is = aClass182_Sub3_9041.anIntArray9829;
	int[] is_1759_ = aClass182_Sub3_9041.anIntArray9830;
	for (int i = 0; i < anInt9072; i++) {
	    int i_1760_
		= (((anIntArray9052[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9697
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12109);
	    int i_1761_
		= (((anIntArray9054[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9765
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12111);
	    int i_1762_ = anIntArray9046[i];
	    int i_1763_ = anIntArray9046[i + 1];
	    for (int i_1764_ = i_1762_;
		 i_1764_ < i_1763_ && aShortArray9096[i_1764_] != 0;
		 i_1764_++) {
		int i_1765_ = (aShortArray9096[i_1764_] & 0xffff) - 1;
		is[i_1765_] = i_1760_;
		is_1759_[i_1765_] = i_1761_;
	    }
	}
	for (int i = 0; i < anInt9111; i++) {
	    if (aByteArray9068 == null || aByteArray9068[i] <= 128) {
		int i_1766_ = aShortArray9091[i] & 0xffff;
		int i_1767_ = aShortArray9070[i] & 0xffff;
		int i_1768_ = aShortArray9071[i] & 0xffff;
		int i_1769_ = is[i_1766_];
		int i_1770_ = is[i_1767_];
		int i_1771_ = is[i_1768_];
		int i_1772_ = is_1759_[i_1766_];
		int i_1773_ = is_1759_[i_1767_];
		int i_1774_ = is_1759_[i_1768_];
		if (((i_1769_ - i_1770_) * (i_1773_ - i_1774_)
		     - (i_1773_ - i_1772_) * (i_1771_ - i_1770_))
		    > 0)
		    class525_sub16_sub17_sub1.method18765(i_1772_, i_1773_,
							  i_1774_, i_1769_,
							  i_1770_, i_1771_);
	    }
	}
    }
    
    void method14594(Class525_Sub16_Sub17_Sub1 class525_sub16_sub17_sub1) {
	if (aClass182_Sub3_9041.anIntArray9829.length < anInt9057) {
	    aClass182_Sub3_9041.anIntArray9829 = new int[anInt9057];
	    aClass182_Sub3_9041.anIntArray9830 = new int[anInt9057];
	}
	int[] is = aClass182_Sub3_9041.anIntArray9829;
	int[] is_1775_ = aClass182_Sub3_9041.anIntArray9830;
	for (int i = 0; i < anInt9072; i++) {
	    int i_1776_
		= (((anIntArray9052[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9697
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12109);
	    int i_1777_
		= (((anIntArray9054[i]
		     - (anIntArray9069[i] * aClass182_Sub3_9041.anInt9765
			>> 8))
		    >> aClass182_Sub3_9041.anInt9800)
		   - class525_sub16_sub17_sub1.anInt12111);
	    int i_1778_ = anIntArray9046[i];
	    int i_1779_ = anIntArray9046[i + 1];
	    for (int i_1780_ = i_1778_;
		 i_1780_ < i_1779_ && aShortArray9096[i_1780_] != 0;
		 i_1780_++) {
		int i_1781_ = (aShortArray9096[i_1780_] & 0xffff) - 1;
		is[i_1781_] = i_1776_;
		is_1775_[i_1781_] = i_1777_;
	    }
	}
	for (int i = 0; i < anInt9111; i++) {
	    if (aByteArray9068 == null || aByteArray9068[i] <= 128) {
		int i_1782_ = aShortArray9091[i] & 0xffff;
		int i_1783_ = aShortArray9070[i] & 0xffff;
		int i_1784_ = aShortArray9071[i] & 0xffff;
		int i_1785_ = is[i_1782_];
		int i_1786_ = is[i_1783_];
		int i_1787_ = is[i_1784_];
		int i_1788_ = is_1775_[i_1782_];
		int i_1789_ = is_1775_[i_1783_];
		int i_1790_ = is_1775_[i_1784_];
		if (((i_1785_ - i_1786_) * (i_1789_ - i_1790_)
		     - (i_1789_ - i_1788_) * (i_1787_ - i_1786_))
		    > 0)
		    class525_sub16_sub17_sub1.method18765(i_1788_, i_1789_,
							  i_1790_, i_1785_,
							  i_1786_, i_1787_);
	    }
	}
    }
    
    public void method2969(short i, short i_1791_) {
	for (int i_1792_ = 0; i_1792_ < anInt9065; i_1792_++) {
	    if (aShortArray9067[i_1792_] == i)
		aShortArray9067[i_1792_] = i_1791_;
	}
	if (aClass148Array9100 != null) {
	    for (int i_1793_ = 0; i_1793_ < anInt9074; i_1793_++) {
		Class148 class148 = aClass148Array9100[i_1793_];
		Class131 class131 = aClass131Array9101[i_1793_];
		class131.anInt1582
		    = (class131.anInt1582 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9067[class148.anInt1694] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    void method14595(Class435 class435) {
	if (aClass148Array9100 != null) {
	    Class435 class435_1794_ = aClass182_Sub3_9041.aClass435_9681;
	    aClass182_Sub3_9041.method15414();
	    aClass182_Sub3_9041.method3235(!aBool9045);
	    aClass182_Sub3_9041.method15404(false);
	    aClass182_Sub3_9041.method15384(aClass182_Sub3_9041.aClass137_9758,
					    null, null,
					    (aClass182_Sub3_9041
					     .aClass137_9824));
	    for (int i = 0; i < anInt9074; i++) {
		Class148 class148 = aClass148Array9100[i];
		Class131 class131 = aClass131Array9101[i];
		if (!class148.aBool1698 || !aClass182_Sub3_9041.method3284()) {
		    float f = ((float) (anIntArray9052[class148.anInt1695]
					+ anIntArray9052[class148.anInt1692]
					+ anIntArray9052[class148.anInt1693])
			       * 0.3333333F);
		    float f_1795_
			= ((float) (anIntArray9069[class148.anInt1695]
				    + anIntArray9069[class148.anInt1692]
				    + anIntArray9069[class148.anInt1693])
			   * 0.3333333F);
		    float f_1796_
			= ((float) (anIntArray9054[class148.anInt1695]
				    + anIntArray9054[class148.anInt1692]
				    + anIntArray9054[class148.anInt1693])
			   * 0.3333333F);
		    float f_1797_ = (class435.aFloatArray4830[0] * f
				     + class435.aFloatArray4830[4] * f_1795_
				     + class435.aFloatArray4830[8] * f_1796_
				     + class435.aFloatArray4830[12]);
		    float f_1798_ = (class435.aFloatArray4830[1] * f
				     + class435.aFloatArray4830[5] * f_1795_
				     + class435.aFloatArray4830[9] * f_1796_
				     + class435.aFloatArray4830[13]);
		    float f_1799_ = (class435.aFloatArray4830[2] * f
				     + class435.aFloatArray4830[6] * f_1795_
				     + class435.aFloatArray4830[10] * f_1796_
				     + class435.aFloatArray4830[14]);
		    float f_1800_
			= ((float) (1.0
				    / Math.sqrt((double) (f_1797_ * f_1797_
							  + f_1798_ * f_1798_
							  + (f_1799_
							     * f_1799_))))
			   * (float) class148.anInt1700);
		    class435_1794_.method7050
			(class131.anInt1586,
			 class131.anInt1581 * class148.aShort1699 >> 7,
			 class131.anInt1584 * class148.aShort1696 >> 7,
			 (f_1797_ + (float) class131.anInt1583
			  - f_1797_ * f_1800_),
			 (f_1798_ + (float) class131.anInt1585
			  - f_1798_ * f_1800_),
			 f_1799_ - f_1799_ * f_1800_);
		    aClass182_Sub3_9041.method15358(class435_1794_);
		    int i_1801_ = class131.anInt1582;
		    OpenGL.glColor4ub((byte) (i_1801_ >> 16),
				      (byte) (i_1801_ >> 8), (byte) i_1801_,
				      (byte) (i_1801_ >> 24));
		    aClass182_Sub3_9041.method15455(class148.aShort1697);
		    aClass182_Sub3_9041.method15409(class148.aByte1691);
		    aClass182_Sub3_9041.method15385(7, 0, 4);
		}
	    }
	    aClass182_Sub3_9041.method3235(true);
	    aClass182_Sub3_9041.method15451();
	}
    }
    
    void method14596(Class435 class435) {
	if (aClass148Array9100 != null) {
	    Class435 class435_1802_ = aClass182_Sub3_9041.aClass435_9681;
	    aClass182_Sub3_9041.method15414();
	    aClass182_Sub3_9041.method3235(!aBool9045);
	    aClass182_Sub3_9041.method15404(false);
	    aClass182_Sub3_9041.method15384(aClass182_Sub3_9041.aClass137_9758,
					    null, null,
					    (aClass182_Sub3_9041
					     .aClass137_9824));
	    for (int i = 0; i < anInt9074; i++) {
		Class148 class148 = aClass148Array9100[i];
		Class131 class131 = aClass131Array9101[i];
		if (!class148.aBool1698 || !aClass182_Sub3_9041.method3284()) {
		    float f = ((float) (anIntArray9052[class148.anInt1695]
					+ anIntArray9052[class148.anInt1692]
					+ anIntArray9052[class148.anInt1693])
			       * 0.3333333F);
		    float f_1803_
			= ((float) (anIntArray9069[class148.anInt1695]
				    + anIntArray9069[class148.anInt1692]
				    + anIntArray9069[class148.anInt1693])
			   * 0.3333333F);
		    float f_1804_
			= ((float) (anIntArray9054[class148.anInt1695]
				    + anIntArray9054[class148.anInt1692]
				    + anIntArray9054[class148.anInt1693])
			   * 0.3333333F);
		    float f_1805_ = (class435.aFloatArray4830[0] * f
				     + class435.aFloatArray4830[4] * f_1803_
				     + class435.aFloatArray4830[8] * f_1804_
				     + class435.aFloatArray4830[12]);
		    float f_1806_ = (class435.aFloatArray4830[1] * f
				     + class435.aFloatArray4830[5] * f_1803_
				     + class435.aFloatArray4830[9] * f_1804_
				     + class435.aFloatArray4830[13]);
		    float f_1807_ = (class435.aFloatArray4830[2] * f
				     + class435.aFloatArray4830[6] * f_1803_
				     + class435.aFloatArray4830[10] * f_1804_
				     + class435.aFloatArray4830[14]);
		    float f_1808_
			= ((float) (1.0
				    / Math.sqrt((double) (f_1805_ * f_1805_
							  + f_1806_ * f_1806_
							  + (f_1807_
							     * f_1807_))))
			   * (float) class148.anInt1700);
		    class435_1802_.method7050
			(class131.anInt1586,
			 class131.anInt1581 * class148.aShort1699 >> 7,
			 class131.anInt1584 * class148.aShort1696 >> 7,
			 (f_1805_ + (float) class131.anInt1583
			  - f_1805_ * f_1808_),
			 (f_1806_ + (float) class131.anInt1585
			  - f_1806_ * f_1808_),
			 f_1807_ - f_1807_ * f_1808_);
		    aClass182_Sub3_9041.method15358(class435_1802_);
		    int i_1809_ = class131.anInt1582;
		    OpenGL.glColor4ub((byte) (i_1809_ >> 16),
				      (byte) (i_1809_ >> 8), (byte) i_1809_,
				      (byte) (i_1809_ >> 24));
		    aClass182_Sub3_9041.method15455(class148.aShort1697);
		    aClass182_Sub3_9041.method15409(class148.aByte1691);
		    aClass182_Sub3_9041.method15385(7, 0, 4);
		}
	    }
	    aClass182_Sub3_9041.method3235(true);
	    aClass182_Sub3_9041.method15451();
	}
    }
    
    public void method2971(short i, short i_1810_) {
	for (int i_1811_ = 0; i_1811_ < anInt9065; i_1811_++) {
	    if (aShortArray9067[i_1811_] == i)
		aShortArray9067[i_1811_] = i_1810_;
	}
	if (aClass148Array9100 != null) {
	    for (int i_1812_ = 0; i_1812_ < anInt9074; i_1812_++) {
		Class148 class148 = aClass148Array9100[i_1812_];
		Class131 class131 = aClass131Array9101[i_1812_];
		class131.anInt1582
		    = (class131.anInt1582 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9067[class148.anInt1694] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    void method14597(boolean bool) {
	if ((aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
	     .buffer).length
	    < anInt9111 * 6)
	    aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
		= new Class525_Sub38_Sub1((anInt9111 + 100) * 6);
	else
	    aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828.index = 0;
	Class525_Sub38_Sub1 class525_sub38_sub1
	    = aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828;
	if (aClass182_Sub3_9041.aBool9792) {
	    for (int i = 0; i < anInt9111; i++) {
		class525_sub38_sub1.method16602(aShortArray9091[i],
						1778344518);
		class525_sub38_sub1.method16602(aShortArray9070[i],
						1444374166);
		class525_sub38_sub1.method16602(aShortArray9071[i], 809627246);
	    }
	} else {
	    for (int i = 0; i < anInt9111; i++) {
		class525_sub38_sub1.method16840(aShortArray9091[i], 241387851);
		class525_sub38_sub1.method16840(aShortArray9070[i], 241387851);
		class525_sub38_sub1.method16840(aShortArray9071[i], 241387851);
	    }
	}
	if (class525_sub38_sub1.index * -1133521593 != 0) {
	    if (bool) {
		if (anInterface16_9035 == null)
		    anInterface16_9035
			= (aClass182_Sub3_9041.method15441
			   (5123, class525_sub38_sub1.buffer,
			    class525_sub38_sub1.index * -1133521593,
			    true));
		else
		    anInterface16_9035.method84(5123,
						(class525_sub38_sub1
						 .buffer),
						(class525_sub38_sub1.index
						 * -1133521593));
		aClass139_9079.anInterface16_1642 = anInterface16_9035;
	    } else
		aClass139_9079.anInterface16_1642
		    = (aClass182_Sub3_9041.method15441
		       (5123, class525_sub38_sub1.buffer,
			class525_sub38_sub1.index * -1133521593, false));
	    if (!bool)
		aBool9095 = true;
	}
    }
    
    void method14598(boolean bool) {
	if ((aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
	     .buffer).length
	    < anInt9111 * 6)
	    aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
		= new Class525_Sub38_Sub1((anInt9111 + 100) * 6);
	else
	    aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828.index = 0;
	Class525_Sub38_Sub1 class525_sub38_sub1
	    = aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828;
	if (aClass182_Sub3_9041.aBool9792) {
	    for (int i = 0; i < anInt9111; i++) {
		class525_sub38_sub1.method16602(aShortArray9091[i], 959685183);
		class525_sub38_sub1.method16602(aShortArray9070[i],
						1761380564);
		class525_sub38_sub1.method16602(aShortArray9071[i],
						1059886529);
	    }
	} else {
	    for (int i = 0; i < anInt9111; i++) {
		class525_sub38_sub1.method16840(aShortArray9091[i], 241387851);
		class525_sub38_sub1.method16840(aShortArray9070[i], 241387851);
		class525_sub38_sub1.method16840(aShortArray9071[i], 241387851);
	    }
	}
	if (class525_sub38_sub1.index * -1133521593 != 0) {
	    if (bool) {
		if (anInterface16_9035 == null)
		    anInterface16_9035
			= (aClass182_Sub3_9041.method15441
			   (5123, class525_sub38_sub1.buffer,
			    class525_sub38_sub1.index * -1133521593,
			    true));
		else
		    anInterface16_9035.method84(5123,
						(class525_sub38_sub1
						 .buffer),
						(class525_sub38_sub1.index
						 * -1133521593));
		aClass139_9079.anInterface16_1642 = anInterface16_9035;
	    } else
		aClass139_9079.anInterface16_1642
		    = (aClass182_Sub3_9041.method15441
		       (5123, class525_sub38_sub1.buffer,
			class525_sub38_sub1.index * -1133521593, false));
	    if (!bool)
		aBool9095 = true;
	}
    }
    
    public boolean method2920(int i, int i_1813_, Class444 class444,
			      boolean bool, int i_1814_) {
	Class435 class435 = aClass182_Sub3_9041.aClass435_9731;
	class435.method7040(class444);
	class435.method6950(aClass182_Sub3_9041.aClass435_9710);
	boolean bool_1815_ = false;
	int i_1816_ = 2147483647;
	int i_1817_ = -2147483648;
	int i_1818_ = 2147483647;
	int i_1819_ = -2147483648;
	if (!aBool9085)
	    method14558();
	int i_1820_ = aShort9089 - aShort9088 >> 1;
	int i_1821_ = aShort9103 - aShort9086 >> 1;
	int i_1822_ = aShort9102 - aShort9090 >> 1;
	int i_1823_ = aShort9088 + i_1820_;
	int i_1824_ = aShort9086 + i_1821_;
	int i_1825_ = aShort9090 + i_1822_;
	int i_1826_ = i_1823_ - (i_1820_ << i_1814_);
	int i_1827_ = i_1824_ - (i_1821_ << i_1814_);
	int i_1828_ = i_1825_ - (i_1822_ << i_1814_);
	int i_1829_ = i_1823_ + (i_1820_ << i_1814_);
	int i_1830_ = i_1824_ + (i_1821_ << i_1814_);
	int i_1831_ = i_1825_ + (i_1822_ << i_1814_);
	anIntArray9105[0] = i_1826_;
	anIntArray9106[0] = i_1827_;
	anIntArray9066[0] = i_1828_;
	anIntArray9105[1] = i_1829_;
	anIntArray9106[1] = i_1827_;
	anIntArray9066[1] = i_1828_;
	anIntArray9105[2] = i_1826_;
	anIntArray9106[2] = i_1830_;
	anIntArray9066[2] = i_1828_;
	anIntArray9105[3] = i_1829_;
	anIntArray9106[3] = i_1830_;
	anIntArray9066[3] = i_1828_;
	anIntArray9105[4] = i_1826_;
	anIntArray9106[4] = i_1827_;
	anIntArray9066[4] = i_1831_;
	anIntArray9105[5] = i_1829_;
	anIntArray9106[5] = i_1827_;
	anIntArray9066[5] = i_1831_;
	anIntArray9105[6] = i_1826_;
	anIntArray9106[6] = i_1830_;
	anIntArray9066[6] = i_1831_;
	anIntArray9105[7] = i_1829_;
	anIntArray9106[7] = i_1830_;
	anIntArray9066[7] = i_1831_;
	for (int i_1832_ = 0; i_1832_ < 8; i_1832_++) {
	    int i_1833_ = anIntArray9105[i_1832_];
	    int i_1834_ = anIntArray9106[i_1832_];
	    int i_1835_ = anIntArray9066[i_1832_];
	    float f = (class435.aFloatArray4830[2] * (float) i_1833_
		       + class435.aFloatArray4830[6] * (float) i_1834_
		       + class435.aFloatArray4830[10] * (float) i_1835_
		       + class435.aFloatArray4830[14]);
	    float f_1836_ = (class435.aFloatArray4830[3] * (float) i_1833_
			     + class435.aFloatArray4830[7] * (float) i_1834_
			     + class435.aFloatArray4830[11] * (float) i_1835_
			     + class435.aFloatArray4830[15]);
	    if (f >= -f_1836_) {
		float f_1837_
		    = (class435.aFloatArray4830[0] * (float) i_1833_
		       + class435.aFloatArray4830[4] * (float) i_1834_
		       + class435.aFloatArray4830[8] * (float) i_1835_
		       + class435.aFloatArray4830[12]);
		float f_1838_
		    = (class435.aFloatArray4830[1] * (float) i_1833_
		       + class435.aFloatArray4830[5] * (float) i_1834_
		       + class435.aFloatArray4830[9] * (float) i_1835_
		       + class435.aFloatArray4830[13]);
		int i_1839_ = (int) (aClass182_Sub3_9041.aFloat9799
				     + (aClass182_Sub3_9041.aFloat9723
					* f_1837_ / f_1836_));
		int i_1840_ = (int) (aClass182_Sub3_9041.aFloat9651
				     + (aClass182_Sub3_9041.aFloat9725
					* f_1838_ / f_1836_));
		if (i_1839_ < i_1816_)
		    i_1816_ = i_1839_;
		if (i_1839_ > i_1817_)
		    i_1817_ = i_1839_;
		if (i_1840_ < i_1818_)
		    i_1818_ = i_1840_;
		if (i_1840_ > i_1819_)
		    i_1819_ = i_1840_;
		bool_1815_ = true;
	    }
	}
	if (bool_1815_ && i > i_1816_ && i < i_1817_ && i_1813_ > i_1818_
	    && i_1813_ < i_1819_) {
	    if (bool)
		return true;
	    if (aClass182_Sub3_9041.anIntArray9829.length < anInt9057) {
		aClass182_Sub3_9041.anIntArray9829 = new int[anInt9057];
		aClass182_Sub3_9041.anIntArray9830 = new int[anInt9057];
	    }
	    int[] is = aClass182_Sub3_9041.anIntArray9829;
	    int[] is_1841_ = aClass182_Sub3_9041.anIntArray9830;
	    for (int i_1842_ = 0; i_1842_ < anInt9072; i_1842_++) {
		int i_1843_ = anIntArray9052[i_1842_];
		int i_1844_ = anIntArray9069[i_1842_];
		int i_1845_ = anIntArray9054[i_1842_];
		float f = (class435.aFloatArray4830[2] * (float) i_1843_
			   + class435.aFloatArray4830[6] * (float) i_1844_
			   + class435.aFloatArray4830[10] * (float) i_1845_
			   + class435.aFloatArray4830[14]);
		float f_1846_
		    = (class435.aFloatArray4830[3] * (float) i_1843_
		       + class435.aFloatArray4830[7] * (float) i_1844_
		       + class435.aFloatArray4830[11] * (float) i_1845_
		       + class435.aFloatArray4830[15]);
		if (f >= -f_1846_) {
		    float f_1847_
			= (class435.aFloatArray4830[0] * (float) i_1843_
			   + class435.aFloatArray4830[4] * (float) i_1844_
			   + class435.aFloatArray4830[8] * (float) i_1845_
			   + class435.aFloatArray4830[12]);
		    float f_1848_
			= (class435.aFloatArray4830[1] * (float) i_1843_
			   + class435.aFloatArray4830[5] * (float) i_1844_
			   + class435.aFloatArray4830[9] * (float) i_1845_
			   + class435.aFloatArray4830[13]);
		    int i_1849_ = anIntArray9046[i_1842_];
		    int i_1850_ = anIntArray9046[i_1842_ + 1];
		    for (int i_1851_ = i_1849_;
			 i_1851_ < i_1850_ && aShortArray9096[i_1851_] != 0;
			 i_1851_++) {
			int i_1852_ = (aShortArray9096[i_1851_] & 0xffff) - 1;
			is[i_1852_] = (int) (aClass182_Sub3_9041.aFloat9799
					     + (aClass182_Sub3_9041.aFloat9723
						* f_1847_ / f_1846_));
			is_1841_[i_1852_]
			    = (int) (aClass182_Sub3_9041.aFloat9651
				     + (aClass182_Sub3_9041.aFloat9725
					* f_1848_ / f_1846_));
		    }
		} else {
		    int i_1853_ = anIntArray9046[i_1842_];
		    int i_1854_ = anIntArray9046[i_1842_ + 1];
		    for (int i_1855_ = i_1853_;
			 i_1855_ < i_1854_ && aShortArray9096[i_1855_] != 0;
			 i_1855_++) {
			int i_1856_ = (aShortArray9096[i_1855_] & 0xffff) - 1;
			is[i_1856_] = -999999;
		    }
		}
	    }
	    for (int i_1857_ = 0; i_1857_ < anInt9065; i_1857_++) {
		if (is[aShortArray9091[i_1857_] & 0xffff] != -999999
		    && is[aShortArray9070[i_1857_] & 0xffff] != -999999
		    && is[aShortArray9071[i_1857_] & 0xffff] != -999999
		    && method14557(i, i_1813_,
				   is_1841_[aShortArray9091[i_1857_] & 0xffff],
				   is_1841_[aShortArray9070[i_1857_] & 0xffff],
				   is_1841_[aShortArray9071[i_1857_] & 0xffff],
				   is[aShortArray9091[i_1857_] & 0xffff],
				   is[aShortArray9070[i_1857_] & 0xffff],
				   is[aShortArray9071[i_1857_] & 0xffff]))
		    return true;
	    }
	}
	return false;
    }
    
    void method14599(boolean bool) {
	boolean bool_1858_ = (aClass137_9076 != null
			      && aClass137_9076.anInterface15_1635 == null);
	boolean bool_1859_ = (aClass137_9051 != null
			      && aClass137_9051.anInterface15_1635 == null);
	boolean bool_1860_ = (aClass137_9075 != null
			      && aClass137_9075.anInterface15_1635 == null);
	boolean bool_1861_ = (aClass137_9078 != null
			      && aClass137_9078.anInterface15_1635 == null);
	if (bool) {
	    bool_1858_ = bool_1858_ & (aByte9037 & 0x2) != 0;
	    bool_1859_ = bool_1859_ & (aByte9037 & 0x4) != 0;
	    bool_1860_ = bool_1860_ & (aByte9037 & 0x1) != 0;
	    bool_1861_ = bool_1861_ & (aByte9037 & 0x8) != 0;
	}
	byte i = 0;
	byte i_1862_ = 0;
	byte i_1863_ = 0;
	byte i_1864_ = 0;
	byte i_1865_ = 0;
	if (bool_1860_) {
	    i_1862_ = i;
	    i += 12;
	}
	if (bool_1858_) {
	    i_1863_ = i;
	    i += 4;
	}
	if (bool_1859_) {
	    i_1864_ = i;
	    i += 12;
	}
	if (bool_1861_) {
	    i_1865_ = i;
	    i += 8;
	}
	if (i != 0) {
	    if ((aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
		 .buffer).length
		< anInt9057 * i)
		aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828
		    = new Class525_Sub38_Sub1((anInt9057 + 100) * i);
	    else
		aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828.index = 0;
	    Class525_Sub38_Sub1 class525_sub38_sub1
		= aClass182_Sub3_9041.aClass525_Sub38_Sub1_9828;
	    if (bool_1860_) {
		if (aClass182_Sub3_9041.aBool9792) {
		    for (int i_1866_ = 0; i_1866_ < anInt9072; i_1866_++) {
			int i_1867_
			    = Stream.floatToRawIntBits((float) anIntArray9052
							       [i_1866_]);
			int i_1868_
			    = Stream.floatToRawIntBits((float) anIntArray9069
							       [i_1866_]);
			int i_1869_
			    = Stream.floatToRawIntBits((float) anIntArray9054
							       [i_1866_]);
			int i_1870_ = anIntArray9046[i_1866_];
			int i_1871_ = anIntArray9046[i_1866_ + 1];
			for (int i_1872_ = i_1870_;
			     (i_1872_ < i_1871_
			      && aShortArray9096[i_1872_] != 0);
			     i_1872_++) {
			    int i_1873_
				= (aShortArray9096[i_1872_] & 0xffff) - 1;
			    class525_sub38_sub1.index
				= i_1873_ * i * 339428471;
			    class525_sub38_sub1.method16605(i_1867_,
							    -945035434);
			    class525_sub38_sub1.method16605(i_1868_,
							    -1721277775);
			    class525_sub38_sub1.method16605(i_1869_,
							    -1874614075);
			}
		    }
		} else {
		    for (int i_1874_ = 0; i_1874_ < anInt9072; i_1874_++) {
			int i_1875_
			    = Stream.floatToRawIntBits((float) anIntArray9052
							       [i_1874_]);
			int i_1876_
			    = Stream.floatToRawIntBits((float) anIntArray9069
							       [i_1874_]);
			int i_1877_
			    = Stream.floatToRawIntBits((float) anIntArray9054
							       [i_1874_]);
			int i_1878_ = anIntArray9046[i_1874_];
			int i_1879_ = anIntArray9046[i_1874_ + 1];
			for (int i_1880_ = i_1878_;
			     (i_1880_ < i_1879_
			      && aShortArray9096[i_1880_] != 0);
			     i_1880_++) {
			    int i_1881_
				= (aShortArray9096[i_1880_] & 0xffff) - 1;
			    class525_sub38_sub1.index
				= i_1881_ * i * 339428471;
			    class525_sub38_sub1.method16606(i_1875_,
							    -115059486);
			    class525_sub38_sub1.method16606(i_1876_,
							    981884043);
			    class525_sub38_sub1.method16606(i_1877_,
							    -526676329);
			}
		    }
		}
	    }
	    if (bool_1858_) {
		if (aClass137_9051 == null) {
		    short[] is;
		    short[] is_1882_;
		    short[] is_1883_;
		    byte[] is_1884_;
		    if (aClass145_9063 != null) {
			is = aClass145_9063.aShortArray1672;
			is_1882_ = aClass145_9063.aShortArray1671;
			is_1883_ = aClass145_9063.aShortArray1669;
			is_1884_ = aClass145_9063.aByteArray1670;
		    } else {
			is = aShortArray9073;
			is_1882_ = aShortArray9059;
			is_1883_ = aShortArray9060;
			is_1884_ = aByteArray9061;
		    }
		    float f = aClass182_Sub3_9041.aFloatArray9660[0];
		    float f_1885_ = aClass182_Sub3_9041.aFloatArray9660[1];
		    float f_1886_ = aClass182_Sub3_9041.aFloatArray9660[2];
		    float f_1887_ = aClass182_Sub3_9041.aFloat9834;
		    float f_1888_ = (aClass182_Sub3_9041.aFloat9759 * 768.0F
				     / (float) aShort9047);
		    float f_1889_ = (aClass182_Sub3_9041.aFloat9631 * 768.0F
				     / (float) aShort9047);
		    for (int i_1890_ = 0; i_1890_ < anInt9065; i_1890_++) {
			int i_1891_
			    = method14565(aShortArray9067[i_1890_],
					  aShortArray9039[i_1890_], aShort9110,
					  aByteArray9068[i_1890_]);
			float f_1892_ = ((float) (i_1891_ >>> 24)
					 * aClass182_Sub3_9041.aFloat9755);
			float f_1893_ = ((float) (i_1891_ >> 16 & 0xff)
					 * aClass182_Sub3_9041.aFloat9756);
			float f_1894_ = ((float) (i_1891_ >> 8 & 0xff)
					 * aClass182_Sub3_9041.aFloat9708);
			int i_1895_ = aShortArray9091[i_1890_] & 0xffff;
			short i_1896_ = (short) is_1884_[i_1895_];
			float f_1897_;
			if (i_1896_ == 0)
			    f_1897_ = ((f * (float) is[i_1895_]
					+ f_1885_ * (float) is_1882_[i_1895_]
					+ f_1886_ * (float) is_1883_[i_1895_])
				       * 0.0026041667F);
			else
			    f_1897_ = ((f * (float) is[i_1895_]
					+ f_1885_ * (float) is_1882_[i_1895_]
					+ f_1886_ * (float) is_1883_[i_1895_])
				       / (float) (i_1896_ * 256));
			float f_1898_
			    = f_1887_ + f_1897_ * (f_1897_ < 0.0F ? f_1889_
						   : f_1888_);
			int i_1899_ = (int) (f_1892_ * f_1898_);
			if (i_1899_ < 0)
			    i_1899_ = 0;
			else if (i_1899_ > 255)
			    i_1899_ = 255;
			int i_1900_ = (int) (f_1893_ * f_1898_);
			if (i_1900_ < 0)
			    i_1900_ = 0;
			else if (i_1900_ > 255)
			    i_1900_ = 255;
			int i_1901_ = (int) (f_1894_ * f_1898_);
			if (i_1901_ < 0)
			    i_1901_ = 0;
			else if (i_1901_ > 255)
			    i_1901_ = 255;
			class525_sub38_sub1.index
			    = (i_1863_ + i_1895_ * i) * 339428471;
			class525_sub38_sub1.method16735(i_1899_, -1296190895);
			class525_sub38_sub1.method16735(i_1900_, -310121474);
			class525_sub38_sub1.method16735(i_1901_, -202901573);
			class525_sub38_sub1.method16735(255 - ((aByteArray9068
								[i_1890_])
							       & 0xff),
							-1400403305);
			i_1895_ = aShortArray9070[i_1890_] & 0xffff;
			i_1896_ = (short) is_1884_[i_1895_];
			if (i_1896_ == 0)
			    f_1897_ = ((f * (float) is[i_1895_]
					+ f_1885_ * (float) is_1882_[i_1895_]
					+ f_1886_ * (float) is_1883_[i_1895_])
				       * 0.0026041667F);
			else
			    f_1897_ = ((f * (float) is[i_1895_]
					+ f_1885_ * (float) is_1882_[i_1895_]
					+ f_1886_ * (float) is_1883_[i_1895_])
				       / (float) (i_1896_ * 256));
			f_1898_ = f_1887_ + f_1897_ * (f_1897_ < 0.0F ? f_1889_
						       : f_1888_);
			i_1899_ = (int) (f_1892_ * f_1898_);
			if (i_1899_ < 0)
			    i_1899_ = 0;
			else if (i_1899_ > 255)
			    i_1899_ = 255;
			i_1900_ = (int) (f_1893_ * f_1898_);
			if (i_1900_ < 0)
			    i_1900_ = 0;
			else if (i_1900_ > 255)
			    i_1900_ = 255;
			i_1901_ = (int) (f_1894_ * f_1898_);
			if (i_1901_ < 0)
			    i_1901_ = 0;
			else if (i_1901_ > 255)
			    i_1901_ = 255;
			class525_sub38_sub1.index
			    = (i_1863_ + i_1895_ * i) * 339428471;
			class525_sub38_sub1.method16735(i_1899_, -436340674);
			class525_sub38_sub1.method16735(i_1900_, -1914791275);
			class525_sub38_sub1.method16735(i_1901_, -2048190661);
			class525_sub38_sub1.method16735(255 - ((aByteArray9068
								[i_1890_])
							       & 0xff),
							-1975451726);
			i_1895_ = aShortArray9071[i_1890_] & 0xffff;
			i_1896_ = (short) is_1884_[i_1895_];
			if (i_1896_ == 0)
			    f_1897_ = ((f * (float) is[i_1895_]
					+ f_1885_ * (float) is_1882_[i_1895_]
					+ f_1886_ * (float) is_1883_[i_1895_])
				       * 0.0026041667F);
			else
			    f_1897_ = ((f * (float) is[i_1895_]
					+ f_1885_ * (float) is_1882_[i_1895_]
					+ f_1886_ * (float) is_1883_[i_1895_])
				       / (float) (i_1896_ * 256));
			f_1898_ = f_1887_ + f_1897_ * (f_1897_ < 0.0F ? f_1889_
						       : f_1888_);
			i_1899_ = (int) (f_1892_ * f_1898_);
			if (i_1899_ < 0)
			    i_1899_ = 0;
			else if (i_1899_ > 255)
			    i_1899_ = 255;
			i_1900_ = (int) (f_1893_ * f_1898_);
			if (i_1900_ < 0)
			    i_1900_ = 0;
			else if (i_1900_ > 255)
			    i_1900_ = 255;
			i_1901_ = (int) (f_1894_ * f_1898_);
			if (i_1901_ < 0)
			    i_1901_ = 0;
			else if (i_1901_ > 255)
			    i_1901_ = 255;
			class525_sub38_sub1.index
			    = (i_1863_ + i_1895_ * i) * 339428471;
			class525_sub38_sub1.method16735(i_1899_, -845576180);
			class525_sub38_sub1.method16735(i_1900_, -1576909446);
			class525_sub38_sub1.method16735(i_1901_, -1825537097);
			class525_sub38_sub1.method16735(255 - ((aByteArray9068
								[i_1890_])
							       & 0xff),
							-1713867615);
		    }
		} else {
		    for (int i_1902_ = 0; i_1902_ < anInt9065; i_1902_++) {
			int i_1903_
			    = method14565(aShortArray9067[i_1902_],
					  aShortArray9039[i_1902_], aShort9110,
					  aByteArray9068[i_1902_]);
			class525_sub38_sub1.index
			    = ((i_1863_
				+ (aShortArray9091[i_1902_] & 0xffff) * i)
			       * 339428471);
			class525_sub38_sub1.method16605(i_1903_, -1871560221);
			class525_sub38_sub1.index
			    = ((i_1863_
				+ (aShortArray9070[i_1902_] & 0xffff) * i)
			       * 339428471);
			class525_sub38_sub1.method16605(i_1903_, -342510220);
			class525_sub38_sub1.index
			    = ((i_1863_
				+ (aShortArray9071[i_1902_] & 0xffff) * i)
			       * 339428471);
			class525_sub38_sub1.method16605(i_1903_, -1278540393);
		    }
		}
	    }
	    if (bool_1859_) {
		short[] is;
		short[] is_1904_;
		short[] is_1905_;
		byte[] is_1906_;
		if (aClass145_9063 != null) {
		    is = aClass145_9063.aShortArray1672;
		    is_1904_ = aClass145_9063.aShortArray1671;
		    is_1905_ = aClass145_9063.aShortArray1669;
		    is_1906_ = aClass145_9063.aByteArray1670;
		} else {
		    is = aShortArray9073;
		    is_1904_ = aShortArray9059;
		    is_1905_ = aShortArray9060;
		    is_1906_ = aByteArray9061;
		}
		float f = 3.0F / (float) aShort9047;
		float f_1907_ = 3.0F / (float) (aShort9047 + aShort9047 / 2);
		class525_sub38_sub1.index = i_1864_ * 339428471;
		if (aClass182_Sub3_9041.aBool9792) {
		    for (int i_1908_ = 0; i_1908_ < anInt9057; i_1908_++) {
			int i_1909_ = is_1906_[i_1908_] & 0xff;
			if (i_1909_ == 0) {
			    class525_sub38_sub1
				.method18263((float) is[i_1908_] * f_1907_);
			    class525_sub38_sub1.method18263((float) (is_1904_
								     [i_1908_])
							    * f_1907_);
			    class525_sub38_sub1.method18263((float) (is_1905_
								     [i_1908_])
							    * f_1907_);
			} else {
			    float f_1910_ = f / (float) i_1909_;
			    class525_sub38_sub1
				.method18263((float) is[i_1908_] * f_1910_);
			    class525_sub38_sub1.method18263((float) (is_1904_
								     [i_1908_])
							    * f_1910_);
			    class525_sub38_sub1.method18263((float) (is_1905_
								     [i_1908_])
							    * f_1910_);
			}
			class525_sub38_sub1.index += (i - 12) * 339428471;
		    }
		} else {
		    for (int i_1911_ = 0; i_1911_ < anInt9057; i_1911_++) {
			int i_1912_ = is_1906_[i_1911_] & 0xff;
			if (i_1912_ == 0) {
			    class525_sub38_sub1
				.method18262((float) is[i_1911_] * f_1907_);
			    class525_sub38_sub1.method18262((float) (is_1904_
								     [i_1911_])
							    * f_1907_);
			    class525_sub38_sub1.method18262((float) (is_1905_
								     [i_1911_])
							    * f_1907_);
			} else {
			    float f_1913_ = f / (float) i_1912_;
			    class525_sub38_sub1
				.method18262((float) is[i_1911_] * f_1913_);
			    class525_sub38_sub1.method18262((float) (is_1904_
								     [i_1911_])
							    * f_1913_);
			    class525_sub38_sub1.method18262((float) (is_1905_
								     [i_1911_])
							    * f_1913_);
			}
			class525_sub38_sub1.index += (i - 12) * 339428471;
		    }
		}
	    }
	    if (bool_1861_) {
		class525_sub38_sub1.index = i_1865_ * 339428471;
		if (aClass182_Sub3_9041.aBool9792) {
		    for (int i_1914_ = 0; i_1914_ < anInt9057; i_1914_++) {
			class525_sub38_sub1
			    .method18263(aFloatArray9058[i_1914_]);
			class525_sub38_sub1
			    .method18263(aFloatArray9064[i_1914_]);
			class525_sub38_sub1.index += (i - 8) * 339428471;
		    }
		} else {
		    for (int i_1915_ = 0; i_1915_ < anInt9057; i_1915_++) {
			class525_sub38_sub1
			    .method18262(aFloatArray9058[i_1915_]);
			class525_sub38_sub1
			    .method18262(aFloatArray9064[i_1915_]);
			class525_sub38_sub1.index += (i - 8) * 339428471;
		    }
		}
	    }
	    class525_sub38_sub1.index = i * anInt9057 * 339428471;
	    Interface15 interface15;
	    if (bool) {
		if (anInterface15_9081 == null)
		    anInterface15_9081
			= (aClass182_Sub3_9041.method15533
			   (i, class525_sub38_sub1.buffer,
			    class525_sub38_sub1.index * -1133521593,
			    true));
		else
		    anInterface15_9081.method78(i,
						(class525_sub38_sub1
						 .buffer),
						(class525_sub38_sub1.index
						 * -1133521593));
		interface15 = anInterface15_9081;
		aByte9037 = (byte) 0;
	    } else {
		interface15
		    = (aClass182_Sub3_9041.method15533
		       (i, class525_sub38_sub1.buffer,
			class525_sub38_sub1.index * -1133521593, false));
		aBool9095 = true;
	    }
	    if (bool_1860_) {
		aClass137_9075.anInterface15_1635 = interface15;
		aClass137_9075.aByte1634 = i_1862_;
	    }
	    if (bool_1861_) {
		aClass137_9078.anInterface15_1635 = interface15;
		aClass137_9078.aByte1634 = i_1865_;
	    }
	    if (bool_1858_) {
		aClass137_9076.anInterface15_1635 = interface15;
		aClass137_9076.aByte1634 = i_1863_;
	    }
	    if (bool_1859_) {
		aClass137_9051.anInterface15_1635 = interface15;
		aClass137_9051.aByte1634 = i_1864_;
	    }
	}
    }
    
    int method14600(int i, short i_1916_, int i_1917_, byte i_1918_) {
	int i_1919_ = Class642.anIntArray8324[method14566(i, i_1917_)];
	if (i_1916_ != -1) {
	    TextureMetrics class166 = aClass182_Sub3_9041.aClass180_1944
				    .method3116(i_1916_ & 0xffff, -1431554601);
	    int i_1920_ = class166.aByte1785 & 0xff;
	    if (i_1920_ != 0) {
		int i_1921_;
		if (i_1917_ < 0)
		    i_1921_ = 0;
		else if (i_1917_ > 127)
		    i_1921_ = 16777215;
		else
		    i_1921_ = 131586 * i_1917_;
		if (i_1920_ == 256)
		    i_1919_ = i_1921_;
		else {
		    int i_1922_ = i_1920_;
		    int i_1923_ = 256 - i_1920_;
		    i_1919_ = ((((i_1921_ & 0xff00ff) * i_1922_
				 + (i_1919_ & 0xff00ff) * i_1923_)
				& ~0xff00ff)
			       + (((i_1921_ & 0xff00) * i_1922_
				   + (i_1919_ & 0xff00) * i_1923_)
				  & 0xff0000)) >> 8;
		}
	    }
	    int i_1924_ = class166.aByte1831 & 0xff;
	    if (i_1924_ != 0) {
		i_1924_ += 256;
		int i_1925_ = ((i_1919_ & 0xff0000) >> 16) * i_1924_;
		if (i_1925_ > 65535)
		    i_1925_ = 65535;
		int i_1926_ = ((i_1919_ & 0xff00) >> 8) * i_1924_;
		if (i_1926_ > 65535)
		    i_1926_ = 65535;
		int i_1927_ = (i_1919_ & 0xff) * i_1924_;
		if (i_1927_ > 65535)
		    i_1927_ = 65535;
		i_1919_
		    = (i_1925_ << 8 & 0xff0000) + (i_1926_ & 0xff00) + (i_1927_
									>> 8);
	    }
	}
	return i_1919_ << 8 | 255 - (i_1918_ & 0xff);
    }
    
    int method14601(int i, short i_1928_, int i_1929_, byte i_1930_) {
	int i_1931_ = Class642.anIntArray8324[method14566(i, i_1929_)];
	if (i_1928_ != -1) {
	    TextureMetrics class166 = aClass182_Sub3_9041.aClass180_1944
				    .method3116(i_1928_ & 0xffff, -1431554601);
	    int i_1932_ = class166.aByte1785 & 0xff;
	    if (i_1932_ != 0) {
		int i_1933_;
		if (i_1929_ < 0)
		    i_1933_ = 0;
		else if (i_1929_ > 127)
		    i_1933_ = 16777215;
		else
		    i_1933_ = 131586 * i_1929_;
		if (i_1932_ == 256)
		    i_1931_ = i_1933_;
		else {
		    int i_1934_ = i_1932_;
		    int i_1935_ = 256 - i_1932_;
		    i_1931_ = ((((i_1933_ & 0xff00ff) * i_1934_
				 + (i_1931_ & 0xff00ff) * i_1935_)
				& ~0xff00ff)
			       + (((i_1933_ & 0xff00) * i_1934_
				   + (i_1931_ & 0xff00) * i_1935_)
				  & 0xff0000)) >> 8;
		}
	    }
	    int i_1936_ = class166.aByte1831 & 0xff;
	    if (i_1936_ != 0) {
		i_1936_ += 256;
		int i_1937_ = ((i_1931_ & 0xff0000) >> 16) * i_1936_;
		if (i_1937_ > 65535)
		    i_1937_ = 65535;
		int i_1938_ = ((i_1931_ & 0xff00) >> 8) * i_1936_;
		if (i_1938_ > 65535)
		    i_1938_ = 65535;
		int i_1939_ = (i_1931_ & 0xff) * i_1936_;
		if (i_1939_ > 65535)
		    i_1939_ = 65535;
		i_1931_
		    = (i_1937_ << 8 & 0xff0000) + (i_1938_ & 0xff00) + (i_1939_
									>> 8);
	    }
	}
	return i_1931_ << 8 | 255 - (i_1930_ & 0xff);
    }
    
    public void method3097(byte i, byte[] is) {
	if (is == null) {
	    for (int i_1940_ = 0; i_1940_ < anInt9065; i_1940_++)
		aByteArray9068[i_1940_] = i;
	} else {
	    for (int i_1941_ = 0; i_1941_ < anInt9065; i_1941_++) {
		int i_1942_ = 255 - ((255 - (is[i_1941_] & 0xff))
				     * (255 - (i & 0xff)) / 255);
		aByteArray9068[i_1941_] = (byte) i_1942_;
	    }
	}
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
    
    int method14602(int i, short i_1943_, int i_1944_, byte i_1945_) {
	int i_1946_ = Class642.anIntArray8324[method14566(i, i_1944_)];
	if (i_1943_ != -1) {
	    TextureMetrics class166 = aClass182_Sub3_9041.aClass180_1944
				    .method3116(i_1943_ & 0xffff, -1431554601);
	    int i_1947_ = class166.aByte1785 & 0xff;
	    if (i_1947_ != 0) {
		int i_1948_;
		if (i_1944_ < 0)
		    i_1948_ = 0;
		else if (i_1944_ > 127)
		    i_1948_ = 16777215;
		else
		    i_1948_ = 131586 * i_1944_;
		if (i_1947_ == 256)
		    i_1946_ = i_1948_;
		else {
		    int i_1949_ = i_1947_;
		    int i_1950_ = 256 - i_1947_;
		    i_1946_ = ((((i_1948_ & 0xff00ff) * i_1949_
				 + (i_1946_ & 0xff00ff) * i_1950_)
				& ~0xff00ff)
			       + (((i_1948_ & 0xff00) * i_1949_
				   + (i_1946_ & 0xff00) * i_1950_)
				  & 0xff0000)) >> 8;
		}
	    }
	    int i_1951_ = class166.aByte1831 & 0xff;
	    if (i_1951_ != 0) {
		i_1951_ += 256;
		int i_1952_ = ((i_1946_ & 0xff0000) >> 16) * i_1951_;
		if (i_1952_ > 65535)
		    i_1952_ = 65535;
		int i_1953_ = ((i_1946_ & 0xff00) >> 8) * i_1951_;
		if (i_1953_ > 65535)
		    i_1953_ = 65535;
		int i_1954_ = (i_1946_ & 0xff) * i_1951_;
		if (i_1954_ > 65535)
		    i_1954_ = 65535;
		i_1946_
		    = (i_1952_ << 8 & 0xff0000) + (i_1953_ & 0xff00) + (i_1954_
									>> 8);
	    }
	}
	return i_1946_ << 8 | 255 - (i_1945_ & 0xff);
    }
    
    public int method3028() {
	if (!aBool9085)
	    method14558();
	return anInt9084;
    }
    
    static final int method14603(int i, int i_1955_) {
	i_1955_ = i_1955_ * (i & 0x7f) >> 7;
	if (i_1955_ < 2)
	    i_1955_ = 2;
	else if (i_1955_ > 126)
	    i_1955_ = 126;
	return (i & 0xff80) + i_1955_;
    }
    
    static final int method14604(int i, int i_1956_) {
	i_1956_ = i_1956_ * (i & 0x7f) >> 7;
	if (i_1956_ < 2)
	    i_1956_ = 2;
	else if (i_1956_ > 126)
	    i_1956_ = 126;
	return (i & 0xff80) + i_1956_;
    }
    
    public int method3082() {
	return aShort9047;
    }
    
    public void method2932(int i) {
	int i_1957_ = Class436.anIntArray4831[i];
	int i_1958_ = Class436.anIntArray4838[i];
	for (int i_1959_ = 0; i_1959_ < anInt9072; i_1959_++) {
	    int i_1960_ = ((anIntArray9069[i_1959_] * i_1958_
			    - anIntArray9054[i_1959_] * i_1957_)
			   >> 14);
	    anIntArray9054[i_1959_]
		= (anIntArray9069[i_1959_] * i_1957_
		   + anIntArray9054[i_1959_] * i_1958_) >> 14;
	    anIntArray9069[i_1959_] = i_1960_;
	}
	if (aClass137_9075 != null)
	    aClass137_9075.anInterface15_1635 = null;
	aBool9085 = false;
    }
    
    public void method3014(int i, int i_1961_, int i_1962_, int i_1963_) {
	for (int i_1964_ = 0; i_1964_ < anInt9065; i_1964_++) {
	    int i_1965_ = aShortArray9067[i_1964_] & 0xffff;
	    int i_1966_ = i_1965_ >> 10 & 0x3f;
	    int i_1967_ = i_1965_ >> 7 & 0x7;
	    int i_1968_ = i_1965_ & 0x7f;
	    if (i != -1)
		i_1966_ += (i - i_1966_) * i_1963_ >> 7;
	    if (i_1961_ != -1)
		i_1967_ += (i_1961_ - i_1967_) * i_1963_ >> 7;
	    if (i_1962_ != -1)
		i_1968_ += (i_1962_ - i_1968_) * i_1963_ >> 7;
	    aShortArray9067[i_1964_]
		= (short) (i_1966_ << 10 | i_1967_ << 7 | i_1968_);
	}
	if (aClass148Array9100 != null) {
	    for (int i_1969_ = 0; i_1969_ < anInt9074; i_1969_++) {
		Class148 class148 = aClass148Array9100[i_1969_];
		Class131 class131 = aClass131Array9101[i_1969_];
		class131.anInt1582
		    = (class131.anInt1582 & ~0xffffff
		       | ((Class642.anIntArray8324
			   [aShortArray9067[class148.anInt1694] & 0xffff])
			  & 0xffffff));
	    }
	}
	if (aClass137_9076 != null)
	    aClass137_9076.anInterface15_1635 = null;
    }
}
