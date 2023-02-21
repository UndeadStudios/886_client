/* Class273_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class273_Sub1 extends Class273
{
    float[][] aFloatArrayArray10033;
    long aLong10034;
    Class182_Sub1_Sub1 aClass182_Sub1_Sub1_10035;
    Class266_Sub2 aClass266_Sub2_10036;
    static final int anInt10037 = 0;
    static float[] aFloatArray10038 = new float[16];
    byte[] aByteArray10039;
    byte[] aByteArray10040;
    boolean aBool10041 = false;
    static final int anInt10042 = 1;
    long aLong10043;
    boolean[] aBoolArray10044;
    
    final void method15678(int i, float[] fs, int i_0_) {
	Class692.method14137(fs, 0, aFloatArrayArray10033[1], i * 4, i_0_);
	aBoolArray10044[1] = true;
    }
    
    Class273_Sub1(Class182_Sub1_Sub1 class182_sub1_sub1, Class280 class280) {
	aFloatArrayArray10033 = new float[2][];
	aBoolArray10044 = new boolean[2];
	aString2853 = class280.aString2997;
	if (class280.aString2996 != null) {
	    aString2852 = class280.aString2996;
	    aByteArray10039 = class182_sub1_sub1.method18058(aString2852);
	}
	if (class280.aString2998 != null) {
	    aString2851 = class280.aString2998;
	    aByteArray10040 = class182_sub1_sub1.method18058(aString2851);
	}
	class182_sub1_sub1.method14863(this);
    }
    
    public boolean method5047() {
	if (aBool10041)
	    return true;
	aLong10043
	    = (aByteArray10039 == null ? 0L
	       : IDirect3DDevice.CreateVertexShader((aClass182_Sub1_Sub1_10035
						     .aLong11475),
						    aByteArray10039));
	aLong10034
	    = (aByteArray10040 == null ? 0L
	       : IDirect3DDevice.CreatePixelShader((aClass182_Sub1_Sub1_10035
						    .aLong11475),
						   aByteArray10040));
	if (aLong10043 == 0L && aLong10034 == 0L)
	    return false;
	int i = -1;
	for (int i_1_ = 0; i_1_ < aClass266_Sub2_10036.method4810(65280);
	     i_1_++) {
	    if (aClass266_Sub2_10036.method4811(i_1_, 762487630) == this) {
		i = i_1_;
		break;
	    }
	}
	int i_2_ = aClass266_Sub2_10036.method4897(-782749482);
	int i_3_ = aClass266_Sub2_10036.method4870(-1948333057);
	for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub2_10036.method4842(i_4_, -2004456034);
	    class525_sub5_sub1.method18224(i);
	}
	for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub2_10036.method4831(i_5_, (byte) 88);
	    class525_sub5_sub1.method18224(i);
	}
	int i_6_ = 0;
	int i_7_ = 0;
	int i_8_ = aClass266_Sub2_10036.method4812(this, 486628943);
	for (int i_9_ = 0; i_9_ < i_2_ + i_3_; i_9_++) {
	    Class525_Sub5_Sub1_Sub1 class525_sub5_sub1_sub1
		= ((Class525_Sub5_Sub1_Sub1)
		   (i_9_ < i_2_
		    ? aClass266_Sub2_10036.method4842(i_9_, -1988614953)
		    : aClass266_Sub2_10036.method4831(i_9_ - i_2_,
						      (byte) 92)));
	    Class284 class284
		= class525_sub5_sub1_sub1.method18241(-1090777971);
	    int i_10_ = 1;
	    if (class284 == Class284.aClass284_3066) {
		class284 = class525_sub5_sub1_sub1.method18231((short) 189);
		i_10_ = class525_sub5_sub1_sub1.method18228(-1805153812);
	    }
	    switch (class284.anInt3048 * 836475481) {
	    case 31:
	    case 37:
	    case 68:
	    case 114:
		i_10_ *= 3;
		break;
	    case 42:
	    case 54:
	    case 66:
	    case 75:
	    case 86:
		break;
	    case 33:
	    case 47:
	    case 63:
	    case 70:
		i_10_ *= 4;
		break;
	    case 8:
	    case 25:
	    case 82:
	    case 118:
		i_10_ *= 2;
		break;
	    default:
		i_10_ = 0;
	    }
	    if (class525_sub5_sub1_sub1.anIntArray12147[i_8_] >= 0) {
		int i_11_
		    = class525_sub5_sub1_sub1.anIntArray12147[i_8_] + i_10_;
		if (i_6_ < i_11_)
		    i_6_ = i_11_;
	    }
	    if (class525_sub5_sub1_sub1.anIntArray12148[i_8_] >= 0) {
		int i_12_
		    = class525_sub5_sub1_sub1.anIntArray12148[i_8_] + i_10_;
		if (i_7_ < i_12_)
		    i_7_ = i_12_;
	    }
	}
	aFloatArrayArray10033[0] = new float[i_6_ * 4];
	aFloatArrayArray10033[1] = new float[i_7_ * 4];
	aBool10041 = true;
	return true;
    }
    
    void method5051(Class525_Sub5_Sub1 class525_sub5_sub1, float f) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_13_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(78705395) != Class284.aClass284_3054
	    && (class525_sub5_sub1.method18241(579122495)
		!= Class284.aClass284_3032))
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i] = f;
	    aBoolArray10044[0] = true;
	}
	if (i_13_ >= 0) {
	    i_13_ *= 4;
	    aFloatArrayArray10033[1][i_13_] = f;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5032(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_14_) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_15_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-32020897)
	    != Class284.aClass284_3037)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i + 0] = f;
	    aFloatArrayArray10033[0][i + 1] = f_14_;
	    aBoolArray10044[0] = true;
	}
	if (i_15_ >= 0) {
	    i_15_ *= 4;
	    aFloatArrayArray10033[1][i_15_ + 0] = f;
	    aFloatArrayArray10033[1][i_15_ + 1] = f_14_;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5080(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_16_) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_17_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-353581099)
	    != Class284.aClass284_3037)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i + 0] = f;
	    aFloatArrayArray10033[0][i + 1] = f_16_;
	    aBoolArray10044[0] = true;
	}
	if (i_17_ >= 0) {
	    i_17_ *= 4;
	    aFloatArrayArray10033[1][i_17_ + 0] = f;
	    aFloatArrayArray10033[1][i_17_ + 1] = f_16_;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5034(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_18_, float f_19_, float f_20_) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_21_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1675096547)
	    != Class284.aClass284_3106)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i + 0] = f;
	    aFloatArrayArray10033[0][i + 1] = f_18_;
	    aFloatArrayArray10033[0][i + 2] = f_19_;
	    aFloatArrayArray10033[0][i + 3] = f_20_;
	    aBoolArray10044[0] = true;
	}
	if (i_21_ >= 0) {
	    i_21_ *= 4;
	    aFloatArrayArray10033[1][i_21_ + 0] = f;
	    aFloatArrayArray10033[1][i_21_ + 1] = f_18_;
	    aFloatArrayArray10033[1][i_21_ + 2] = f_19_;
	    aFloatArrayArray10033[1][i_21_ + 3] = f_20_;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5036(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_22_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-2147340880)
	    != Class284.aClass284_3053)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0)
	    method15680(i, class435.method6979(aFloatArray10038), 8);
	if (i_22_ >= 0)
	    method15681(i_22_, class435.method6979(aFloatArray10038), 8);
    }
    
    void method15679() {
	if (aBoolArray10044[0]) {
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.clear();
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.asFloatBuffer()
		.put(aFloatArrayArray10033[0]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(aClass182_Sub1_Sub1_10035.aLong11475, 0,
		 aClass182_Sub1_Sub1_10035.aLong9160,
		 aFloatArrayArray10033[0].length / 4);
	    aBoolArray10044[0] = false;
	}
	if (aBoolArray10044[1]) {
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.clear();
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.asFloatBuffer()
		.put(aFloatArrayArray10033[1]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(aClass182_Sub1_Sub1_10035.aLong11475, 0,
		 aClass182_Sub1_Sub1_10035.aLong9160,
		 aFloatArrayArray10033[1].length / 4);
	    aBoolArray10044[1] = false;
	}
    }
    
    void method5058(Class525_Sub5_Sub1 class525_sub5_sub1, float[] fs, int i) {
	int i_23_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_24_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1150119027)
	    != Class284.aClass284_3066)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i_23_ >= 0)
	    method15680(i_23_, fs, i);
	if (i_24_ >= 0)
	    method15681(i_24_, fs, i);
    }
    
    void method5029(Class525_Sub5_Sub1 class525_sub5_sub1, int i,
		    Interface39 interface39) {
	aClass182_Sub1_Sub1_10035.method14730(i);
	aClass182_Sub1_Sub1_10035.method14731(interface39);
    }
    
    public void method125() {
	if (aLong10043 != 0L) {
	    IUnknown.Release(aLong10043);
	    aLong10043 = 0L;
	}
	if (aLong10034 != 0L) {
	    IUnknown.Release(aLong10034);
	    aLong10034 = 0L;
	}
	aClass182_Sub1_Sub1_10035.method14721(this);
    }
    
    public void finalize() {
	method15683();
    }
    
    void method5039(int i, Class435 class435) {
	int i_25_ = i >> 16;
	int i_26_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6977(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_25_], i_26_, 12);
	aBoolArray10044[i_25_] = true;
    }
    
    void method5031(Class525_Sub5_Sub1 class525_sub5_sub1, float f) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_27_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if ((class525_sub5_sub1.method18241(-1070672573)
	     != Class284.aClass284_3054)
	    && (class525_sub5_sub1.method18241(-1143006491)
		!= Class284.aClass284_3032))
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i] = f;
	    aBoolArray10044[0] = true;
	}
	if (i_27_ >= 0) {
	    i_27_ *= 4;
	    aFloatArrayArray10033[1][i_27_] = f;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5040(int i, float f, float f_28_, float f_29_, float f_30_) {
	int i_31_ = i >> 16;
	int i_32_ = (i & 0xffff) * 4;
	aFloatArrayArray10033[i_31_][i_32_] = f;
	aFloatArrayArray10033[i_31_][i_32_ + 1] = f_28_;
	aFloatArrayArray10033[i_31_][i_32_ + 2] = f_29_;
	aFloatArrayArray10033[i_31_][i_32_ + 3] = f_30_;
	aBoolArray10044[i_31_] = true;
    }
    
    void method5044(int i, Class435 class435) {
	int i_33_ = i >> 16;
	int i_34_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6977(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_33_], i_34_, 16);
	aBoolArray10044[i_33_] = true;
    }
    
    final void method15680(int i, float[] fs, int i_35_) {
	Class692.method14137(fs, 0, aFloatArrayArray10033[0], i * 4, i_35_);
	aBoolArray10044[0] = true;
    }
    
    final void method15681(int i, float[] fs, int i_36_) {
	Class692.method14137(fs, 0, aFloatArrayArray10033[1], i * 4, i_36_);
	aBoolArray10044[1] = true;
    }
    
    void method5072(int i, int i_37_, Interface39 interface39) {
	aClass182_Sub1_Sub1_10035.method14730(i_37_);
	aClass182_Sub1_Sub1_10035.method14731(interface39);
    }
    
    void method15682() {
	if (aBoolArray10044[0]) {
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.clear();
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.asFloatBuffer()
		.put(aFloatArrayArray10033[0]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(aClass182_Sub1_Sub1_10035.aLong11475, 0,
		 aClass182_Sub1_Sub1_10035.aLong9160,
		 aFloatArrayArray10033[0].length / 4);
	    aBoolArray10044[0] = false;
	}
	if (aBoolArray10044[1]) {
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.clear();
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.asFloatBuffer()
		.put(aFloatArrayArray10033[1]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(aClass182_Sub1_Sub1_10035.aLong11475, 0,
		 aClass182_Sub1_Sub1_10035.aLong9160,
		 aFloatArrayArray10033[1].length / 4);
	    aBoolArray10044[1] = false;
	}
    }
    
    void method15683() {
	if (aLong10043 != 0L) {
	    aClass182_Sub1_Sub1_10035.method18061(aLong10043);
	    aLong10043 = 0L;
	}
	if (aLong10034 != 0L) {
	    aClass182_Sub1_Sub1_10035.method18061(aLong10034);
	    aLong10034 = 0L;
	}
    }
    
    public void method127() {
	if (aLong10043 != 0L) {
	    IUnknown.Release(aLong10043);
	    aLong10043 = 0L;
	}
	if (aLong10034 != 0L) {
	    IUnknown.Release(aLong10034);
	    aLong10034 = 0L;
	}
	aClass182_Sub1_Sub1_10035.method14721(this);
    }
    
    void method5063(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_38_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-614099971)
	    != Class284.aClass284_3055)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0)
	    method15680(i, class435.method6977(aFloatArray10038), 16);
	if (i_38_ >= 0)
	    method15681(i_38_, class435.method6977(aFloatArray10038), 16);
    }
    
    public void method126() {
	if (aLong10043 != 0L) {
	    IUnknown.Release(aLong10043);
	    aLong10043 = 0L;
	}
	if (aLong10034 != 0L) {
	    IUnknown.Release(aLong10034);
	    aLong10034 = 0L;
	}
	aClass182_Sub1_Sub1_10035.method14721(this);
    }
    
    void method5065(int i, Class435 class435) {
	int i_39_ = i >> 16;
	int i_40_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6979(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_39_], i_40_, 8);
	aBoolArray10044[i_39_] = true;
    }
    
    void method15684() {
	method15683();
    }
    
    void method15685() {
	method15683();
    }
    
    void method15686() {
	method15683();
    }
    
    void method15687() {
	method15683();
    }
    
    void method5060(int i, float f, float f_41_, float f_42_, float f_43_) {
	int i_44_ = i >> 16;
	int i_45_ = (i & 0xffff) * 4;
	aFloatArrayArray10033[i_44_][i_45_] = f;
	aFloatArrayArray10033[i_44_][i_45_ + 1] = f_41_;
	aFloatArrayArray10033[i_44_][i_45_ + 2] = f_42_;
	aFloatArrayArray10033[i_44_][i_45_ + 3] = f_43_;
	aBoolArray10044[i_44_] = true;
    }
    
    void method5041(int i, float[] fs, int i_46_) {
	int i_47_ = i >> 16;
	int i_48_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0, aFloatArrayArray10033[i_47_], i_48_, i_46_);
	aBoolArray10044[i_47_] = true;
    }
    
    void method5075(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_49_, float f_50_) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_51_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-444977142)
	    != Class284.aClass284_3038)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i + 0] = f;
	    aFloatArrayArray10033[0][i + 1] = f_49_;
	    aFloatArrayArray10033[0][i + 2] = f_50_;
	    aBoolArray10044[0] = true;
	}
	if (i_51_ >= 0) {
	    i_51_ *= 4;
	    aFloatArrayArray10033[1][i_51_ + 0] = f;
	    aFloatArrayArray10033[1][i_51_ + 1] = f_49_;
	    aFloatArrayArray10033[1][i_51_ + 2] = f_50_;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5083(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_52_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-640267117)
	    != Class284.aClass284_3055)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0)
	    method15680(i, class435.method6977(aFloatArray10038), 16);
	if (i_52_ >= 0)
	    method15681(i_52_, class435.method6977(aFloatArray10038), 16);
    }
    
    void method5057(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_53_, float f_54_, float f_55_) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_56_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1993686665)
	    != Class284.aClass284_3106)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i + 0] = f;
	    aFloatArrayArray10033[0][i + 1] = f_53_;
	    aFloatArrayArray10033[0][i + 2] = f_54_;
	    aFloatArrayArray10033[0][i + 3] = f_55_;
	    aBoolArray10044[0] = true;
	}
	if (i_56_ >= 0) {
	    i_56_ *= 4;
	    aFloatArrayArray10033[1][i_56_ + 0] = f;
	    aFloatArrayArray10033[1][i_56_ + 1] = f_53_;
	    aFloatArrayArray10033[1][i_56_ + 2] = f_54_;
	    aFloatArrayArray10033[1][i_56_ + 3] = f_55_;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5045(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_57_, float f_58_, float f_59_) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_60_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1242793237)
	    != Class284.aClass284_3106)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i + 0] = f;
	    aFloatArrayArray10033[0][i + 1] = f_57_;
	    aFloatArrayArray10033[0][i + 2] = f_58_;
	    aFloatArrayArray10033[0][i + 3] = f_59_;
	    aBoolArray10044[0] = true;
	}
	if (i_60_ >= 0) {
	    i_60_ *= 4;
	    aFloatArrayArray10033[1][i_60_ + 0] = f;
	    aFloatArrayArray10033[1][i_60_ + 1] = f_57_;
	    aFloatArrayArray10033[1][i_60_ + 2] = f_58_;
	    aFloatArrayArray10033[1][i_60_ + 3] = f_59_;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5052(Class525_Sub5_Sub1 class525_sub5_sub1, float[] fs, int i) {
	int i_61_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_62_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1517073225)
	    != Class284.aClass284_3066)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i_61_ >= 0)
	    method15680(i_61_, fs, i);
	if (i_62_ >= 0)
	    method15681(i_62_, fs, i);
    }
    
    void method5053(Class525_Sub5_Sub1 class525_sub5_sub1, float[] fs, int i) {
	int i_63_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_64_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(477376569)
	    != Class284.aClass284_3066)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i_63_ >= 0)
	    method15680(i_63_, fs, i);
	if (i_64_ >= 0)
	    method15681(i_64_, fs, i);
    }
    
    void method5055(int i, Class435 class435) {
	int i_65_ = i >> 16;
	int i_66_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6979(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_65_], i_66_, 8);
	aBoolArray10044[i_65_] = true;
    }
    
    void method5035(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_67_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1549783093)
	    != Class284.aClass284_3053)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0)
	    method15680(i, class435.method6979(aFloatArray10038), 8);
	if (i_67_ >= 0)
	    method15681(i_67_, class435.method6979(aFloatArray10038), 8);
    }
    
    void method5056(Class525_Sub5_Sub1 class525_sub5_sub1, int i,
		    Interface39 interface39) {
	aClass182_Sub1_Sub1_10035.method14730(i);
	aClass182_Sub1_Sub1_10035.method14731(interface39);
    }
    
    void method5033(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_68_, float f_69_) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_70_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1631123118)
	    != Class284.aClass284_3038)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i + 0] = f;
	    aFloatArrayArray10033[0][i + 1] = f_68_;
	    aFloatArrayArray10033[0][i + 2] = f_69_;
	    aBoolArray10044[0] = true;
	}
	if (i_70_ >= 0) {
	    i_70_ *= 4;
	    aFloatArrayArray10033[1][i_70_ + 0] = f;
	    aFloatArrayArray10033[1][i_70_ + 1] = f_68_;
	    aFloatArrayArray10033[1][i_70_ + 2] = f_69_;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5042(int i, float f, float f_71_, float f_72_, float f_73_) {
	int i_74_ = i >> 16;
	int i_75_ = (i & 0xffff) * 4;
	aFloatArrayArray10033[i_74_][i_75_] = f;
	aFloatArrayArray10033[i_74_][i_75_ + 1] = f_71_;
	aFloatArrayArray10033[i_74_][i_75_ + 2] = f_72_;
	aFloatArrayArray10033[i_74_][i_75_ + 3] = f_73_;
	aBoolArray10044[i_74_] = true;
    }
    
    void method5059(int i, float f, float f_76_, float f_77_, float f_78_) {
	int i_79_ = i >> 16;
	int i_80_ = (i & 0xffff) * 4;
	aFloatArrayArray10033[i_79_][i_80_] = f;
	aFloatArrayArray10033[i_79_][i_80_ + 1] = f_76_;
	aFloatArrayArray10033[i_79_][i_80_ + 2] = f_77_;
	aFloatArrayArray10033[i_79_][i_80_ + 3] = f_78_;
	aBoolArray10044[i_79_] = true;
    }
    
    void method5050(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_81_, float f_82_) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_83_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1854539423)
	    != Class284.aClass284_3038)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i + 0] = f;
	    aFloatArrayArray10033[0][i + 1] = f_81_;
	    aFloatArrayArray10033[0][i + 2] = f_82_;
	    aBoolArray10044[0] = true;
	}
	if (i_83_ >= 0) {
	    i_83_ *= 4;
	    aFloatArrayArray10033[1][i_83_ + 0] = f;
	    aFloatArrayArray10033[1][i_83_ + 1] = f_81_;
	    aFloatArrayArray10033[1][i_83_ + 2] = f_82_;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5061(int i, float f, float f_84_, float f_85_, float f_86_) {
	int i_87_ = i >> 16;
	int i_88_ = (i & 0xffff) * 4;
	aFloatArrayArray10033[i_87_][i_88_] = f;
	aFloatArrayArray10033[i_87_][i_88_ + 1] = f_84_;
	aFloatArrayArray10033[i_87_][i_88_ + 2] = f_85_;
	aFloatArrayArray10033[i_87_][i_88_ + 3] = f_86_;
	aBoolArray10044[i_87_] = true;
    }
    
    void method5062(int i, float[] fs, int i_89_) {
	int i_90_ = i >> 16;
	int i_91_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0, aFloatArrayArray10033[i_90_], i_91_, i_89_);
	aBoolArray10044[i_90_] = true;
    }
    
    void method5038(int i, Class435 class435) {
	int i_92_ = i >> 16;
	int i_93_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6977(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_92_], i_93_, 12);
	aBoolArray10044[i_92_] = true;
    }
    
    void method5064(int i, Class435 class435) {
	int i_94_ = i >> 16;
	int i_95_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6979(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_94_], i_95_, 8);
	aBoolArray10044[i_94_] = true;
    }
    
    void method5069(int i, Class435 class435) {
	int i_96_ = i >> 16;
	int i_97_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6977(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_96_], i_97_, 16);
	aBoolArray10044[i_96_] = true;
    }
    
    void method5066(int i, Class435 class435) {
	int i_98_ = i >> 16;
	int i_99_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6979(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_98_], i_99_, 8);
	aBoolArray10044[i_98_] = true;
    }
    
    void method5054(int i, Class435 class435) {
	int i_100_ = i >> 16;
	int i_101_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6977(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_100_], i_101_, 16);
	aBoolArray10044[i_100_] = true;
    }
    
    void method5068(int i, Class435 class435) {
	int i_102_ = i >> 16;
	int i_103_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6977(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_102_], i_103_, 16);
	aBoolArray10044[i_102_] = true;
    }
    
    void method5082(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_104_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1732914781)
	    != Class284.aClass284_3055)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0)
	    method15680(i, class435.method6977(aFloatArray10038), 16);
	if (i_104_ >= 0)
	    method15681(i_104_, class435.method6977(aFloatArray10038), 16);
    }
    
    void method5070(int i, Class435 class435) {
	int i_105_ = i >> 16;
	int i_106_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6977(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_105_], i_106_, 16);
	aBoolArray10044[i_105_] = true;
    }
    
    void method5071(int i, Class435 class435) {
	int i_107_ = i >> 16;
	int i_108_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6977(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_107_], i_108_, 16);
	aBoolArray10044[i_107_] = true;
    }
    
    void method5067(int i, Class435 class435) {
	int i_109_ = i >> 16;
	int i_110_ = (i & 0xffff) * 4;
	System.arraycopy(class435.method6977(aFloatArray10038), 0,
			 aFloatArrayArray10033[i_109_], i_110_, 16);
	aBoolArray10044[i_109_] = true;
    }
    
    void method5073(int i, int i_111_, Interface39 interface39) {
	aClass182_Sub1_Sub1_10035.method14730(i_111_);
	aClass182_Sub1_Sub1_10035.method14731(interface39);
    }
    
    void method5074(int i, int i_112_, Interface39 interface39) {
	aClass182_Sub1_Sub1_10035.method14730(i_112_);
	aClass182_Sub1_Sub1_10035.method14731(interface39);
    }
    
    public boolean method5043() {
	if (aBool10041)
	    return true;
	aLong10043
	    = (aByteArray10039 == null ? 0L
	       : IDirect3DDevice.CreateVertexShader((aClass182_Sub1_Sub1_10035
						     .aLong11475),
						    aByteArray10039));
	aLong10034
	    = (aByteArray10040 == null ? 0L
	       : IDirect3DDevice.CreatePixelShader((aClass182_Sub1_Sub1_10035
						    .aLong11475),
						   aByteArray10040));
	if (aLong10043 == 0L && aLong10034 == 0L)
	    return false;
	int i = -1;
	for (int i_113_ = 0; i_113_ < aClass266_Sub2_10036.method4810(65280);
	     i_113_++) {
	    if (aClass266_Sub2_10036.method4811(i_113_, -320573814) == this) {
		i = i_113_;
		break;
	    }
	}
	int i_114_ = aClass266_Sub2_10036.method4897(-860415507);
	int i_115_ = aClass266_Sub2_10036.method4870(-1282766433);
	for (int i_116_ = 0; i_116_ < i_114_; i_116_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub2_10036.method4842(i_116_, -1766155416);
	    class525_sub5_sub1.method18224(i);
	}
	for (int i_117_ = 0; i_117_ < i_115_; i_117_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub2_10036.method4831(i_117_, (byte) 91);
	    class525_sub5_sub1.method18224(i);
	}
	int i_118_ = 0;
	int i_119_ = 0;
	int i_120_ = aClass266_Sub2_10036.method4812(this, 1827569233);
	for (int i_121_ = 0; i_121_ < i_114_ + i_115_; i_121_++) {
	    Class525_Sub5_Sub1_Sub1 class525_sub5_sub1_sub1
		= ((Class525_Sub5_Sub1_Sub1)
		   (i_121_ < i_114_
		    ? aClass266_Sub2_10036.method4842(i_121_, -1439418259)
		    : aClass266_Sub2_10036.method4831(i_121_ - i_114_,
						      (byte) 57)));
	    Class284 class284
		= class525_sub5_sub1_sub1.method18241(-2012456573);
	    int i_122_ = 1;
	    if (class284 == Class284.aClass284_3066) {
		class284 = class525_sub5_sub1_sub1.method18231((short) 189);
		i_122_ = class525_sub5_sub1_sub1.method18228(-560730863);
	    }
	    switch (class284.anInt3048 * 836475481) {
	    case 31:
	    case 37:
	    case 68:
	    case 114:
		i_122_ *= 3;
		break;
	    case 42:
	    case 54:
	    case 66:
	    case 75:
	    case 86:
		break;
	    case 33:
	    case 47:
	    case 63:
	    case 70:
		i_122_ *= 4;
		break;
	    case 8:
	    case 25:
	    case 82:
	    case 118:
		i_122_ *= 2;
		break;
	    default:
		i_122_ = 0;
	    }
	    if (class525_sub5_sub1_sub1.anIntArray12147[i_120_] >= 0) {
		int i_123_
		    = class525_sub5_sub1_sub1.anIntArray12147[i_120_] + i_122_;
		if (i_118_ < i_123_)
		    i_118_ = i_123_;
	    }
	    if (class525_sub5_sub1_sub1.anIntArray12148[i_120_] >= 0) {
		int i_124_
		    = class525_sub5_sub1_sub1.anIntArray12148[i_120_] + i_122_;
		if (i_119_ < i_124_)
		    i_119_ = i_124_;
	    }
	}
	aFloatArrayArray10033[0] = new float[i_118_ * 4];
	aFloatArrayArray10033[1] = new float[i_119_ * 4];
	aBool10041 = true;
	return true;
    }
    
    void method5048(Class525_Sub5_Sub1 class525_sub5_sub1, float f) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_125_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if ((class525_sub5_sub1.method18241(-304868882)
	     != Class284.aClass284_3054)
	    && (class525_sub5_sub1.method18241(-950464311)
		!= Class284.aClass284_3032))
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i] = f;
	    aBoolArray10044[0] = true;
	}
	if (i_125_ >= 0) {
	    i_125_ *= 4;
	    aFloatArrayArray10033[1][i_125_] = f;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5077(Class525_Sub5_Sub1 class525_sub5_sub1, float f) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_126_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if ((class525_sub5_sub1.method18241(-823670949)
	     != Class284.aClass284_3054)
	    && (class525_sub5_sub1.method18241(-711715959)
		!= Class284.aClass284_3032))
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i] = f;
	    aBoolArray10044[0] = true;
	}
	if (i_126_ >= 0) {
	    i_126_ *= 4;
	    aFloatArrayArray10033[1][i_126_] = f;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5078(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_127_) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_128_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1046491261)
	    != Class284.aClass284_3037)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i + 0] = f;
	    aFloatArrayArray10033[0][i + 1] = f_127_;
	    aBoolArray10044[0] = true;
	}
	if (i_128_ >= 0) {
	    i_128_ *= 4;
	    aFloatArrayArray10033[1][i_128_ + 0] = f;
	    aFloatArrayArray10033[1][i_128_ + 1] = f_127_;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5079(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
		    float f_129_) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_130_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-818017334)
	    != Class284.aClass284_3037)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    aFloatArrayArray10033[0][i + 0] = f;
	    aFloatArrayArray10033[0][i + 1] = f_129_;
	    aBoolArray10044[0] = true;
	}
	if (i_130_ >= 0) {
	    i_130_ *= 4;
	    aFloatArrayArray10033[1][i_130_ + 0] = f;
	    aFloatArrayArray10033[1][i_130_ + 1] = f_129_;
	    aBoolArray10044[1] = true;
	}
    }
    
    void method5037(int i, float f, float f_131_, float f_132_) {
	int i_133_ = i >> 16;
	int i_134_ = (i & 0xffff) * 4;
	aFloatArrayArray10033[i_133_][i_134_] = f;
	aFloatArrayArray10033[i_133_][i_134_ + 1] = f_131_;
	aFloatArrayArray10033[i_133_][i_134_ + 2] = f_132_;
	aBoolArray10044[i_133_] = true;
    }
    
    void method5049(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_135_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1877001323)
	    != Class284.aClass284_3055)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0)
	    method15680(i, class435.method6977(aFloatArray10038), 16);
	if (i_135_ >= 0)
	    method15681(i_135_, class435.method6977(aFloatArray10038), 16);
    }
    
    void method5076(Class525_Sub5_Sub1 class525_sub5_sub1, Class435 class435) {
	int i = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18818();
	int i_136_
	    = ((Class525_Sub5_Sub1_Sub1) class525_sub5_sub1).method18819();
	if (class525_sub5_sub1.method18241(-1009641693)
	    != Class284.aClass284_3053)
	    throw new IllegalArgumentException_Sub1(class525_sub5_sub1, "");
	if (i >= 0)
	    method15680(i, class435.method6979(aFloatArray10038), 8);
	if (i_136_ >= 0)
	    method15681(i_136_, class435.method6979(aFloatArray10038), 8);
    }
    
    Class273_Sub1(Class182_Sub1_Sub1 class182_sub1_sub1,
		  Class266_Sub2 class266_sub2, Class280 class280) {
	this(class182_sub1_sub1, class280);
	aClass182_Sub1_Sub1_10035 = class182_sub1_sub1;
	aClass266_Sub2_10036 = class266_sub2;
    }
    
    final void method15688(int i, float[] fs, int i_137_) {
	Class692.method14137(fs, 0, aFloatArrayArray10033[0], i * 4, i_137_);
	aBoolArray10044[0] = true;
    }
    
    final void method15689(int i, float[] fs, int i_138_) {
	Class692.method14137(fs, 0, aFloatArrayArray10033[1], i * 4, i_138_);
	aBoolArray10044[1] = true;
    }
    
    public boolean method5046() {
	if (aBool10041)
	    return true;
	aLong10043
	    = (aByteArray10039 == null ? 0L
	       : IDirect3DDevice.CreateVertexShader((aClass182_Sub1_Sub1_10035
						     .aLong11475),
						    aByteArray10039));
	aLong10034
	    = (aByteArray10040 == null ? 0L
	       : IDirect3DDevice.CreatePixelShader((aClass182_Sub1_Sub1_10035
						    .aLong11475),
						   aByteArray10040));
	if (aLong10043 == 0L && aLong10034 == 0L)
	    return false;
	int i = -1;
	for (int i_139_ = 0; i_139_ < aClass266_Sub2_10036.method4810(65280);
	     i_139_++) {
	    if (aClass266_Sub2_10036.method4811(i_139_, -1639280822) == this) {
		i = i_139_;
		break;
	    }
	}
	int i_140_ = aClass266_Sub2_10036.method4897(1898321552);
	int i_141_ = aClass266_Sub2_10036.method4870(-911122426);
	for (int i_142_ = 0; i_142_ < i_140_; i_142_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub2_10036.method4842(i_142_, -1598565008);
	    class525_sub5_sub1.method18224(i);
	}
	for (int i_143_ = 0; i_143_ < i_141_; i_143_++) {
	    Class525_Sub5_Sub1 class525_sub5_sub1
		= aClass266_Sub2_10036.method4831(i_143_, (byte) 30);
	    class525_sub5_sub1.method18224(i);
	}
	int i_144_ = 0;
	int i_145_ = 0;
	int i_146_ = aClass266_Sub2_10036.method4812(this, -1246939732);
	for (int i_147_ = 0; i_147_ < i_140_ + i_141_; i_147_++) {
	    Class525_Sub5_Sub1_Sub1 class525_sub5_sub1_sub1
		= ((Class525_Sub5_Sub1_Sub1)
		   (i_147_ < i_140_
		    ? aClass266_Sub2_10036.method4842(i_147_, -1187566011)
		    : aClass266_Sub2_10036.method4831(i_147_ - i_140_,
						      (byte) 90)));
	    Class284 class284 = class525_sub5_sub1_sub1.method18241(429141074);
	    int i_148_ = 1;
	    if (class284 == Class284.aClass284_3066) {
		class284 = class525_sub5_sub1_sub1.method18231((short) 189);
		i_148_ = class525_sub5_sub1_sub1.method18228(788587898);
	    }
	    switch (class284.anInt3048 * 836475481) {
	    case 31:
	    case 37:
	    case 68:
	    case 114:
		i_148_ *= 3;
		break;
	    case 42:
	    case 54:
	    case 66:
	    case 75:
	    case 86:
		break;
	    case 33:
	    case 47:
	    case 63:
	    case 70:
		i_148_ *= 4;
		break;
	    case 8:
	    case 25:
	    case 82:
	    case 118:
		i_148_ *= 2;
		break;
	    default:
		i_148_ = 0;
	    }
	    if (class525_sub5_sub1_sub1.anIntArray12147[i_146_] >= 0) {
		int i_149_
		    = class525_sub5_sub1_sub1.anIntArray12147[i_146_] + i_148_;
		if (i_144_ < i_149_)
		    i_144_ = i_149_;
	    }
	    if (class525_sub5_sub1_sub1.anIntArray12148[i_146_] >= 0) {
		int i_150_
		    = class525_sub5_sub1_sub1.anIntArray12148[i_146_] + i_148_;
		if (i_145_ < i_150_)
		    i_145_ = i_150_;
	    }
	}
	aFloatArrayArray10033[0] = new float[i_144_ * 4];
	aFloatArrayArray10033[1] = new float[i_145_ * 4];
	aBool10041 = true;
	return true;
    }
    
    void method5028(int i, float f, float f_151_, float f_152_) {
	int i_153_ = i >> 16;
	int i_154_ = (i & 0xffff) * 4;
	aFloatArrayArray10033[i_153_][i_154_] = f;
	aFloatArrayArray10033[i_153_][i_154_ + 1] = f_151_;
	aFloatArrayArray10033[i_153_][i_154_ + 2] = f_152_;
	aBoolArray10044[i_153_] = true;
    }
    
    void method15690() {
	if (aBoolArray10044[0]) {
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.clear();
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.asFloatBuffer()
		.put(aFloatArrayArray10033[0]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(aClass182_Sub1_Sub1_10035.aLong11475, 0,
		 aClass182_Sub1_Sub1_10035.aLong9160,
		 aFloatArrayArray10033[0].length / 4);
	    aBoolArray10044[0] = false;
	}
	if (aBoolArray10044[1]) {
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.clear();
	    aClass182_Sub1_Sub1_10035.aByteBuffer9271.asFloatBuffer()
		.put(aFloatArrayArray10033[1]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(aClass182_Sub1_Sub1_10035.aLong11475, 0,
		 aClass182_Sub1_Sub1_10035.aLong9160,
		 aFloatArrayArray10033[1].length / 4);
	    aBoolArray10044[1] = false;
	}
    }
    
    void method15691() {
	if (aLong10043 != 0L) {
	    aClass182_Sub1_Sub1_10035.method18061(aLong10043);
	    aLong10043 = 0L;
	}
	if (aLong10034 != 0L) {
	    aClass182_Sub1_Sub1_10035.method18061(aLong10034);
	    aLong10034 = 0L;
	}
    }
    
    void method15692() {
	if (aLong10043 != 0L) {
	    aClass182_Sub1_Sub1_10035.method18061(aLong10043);
	    aLong10043 = 0L;
	}
	if (aLong10034 != 0L) {
	    aClass182_Sub1_Sub1_10035.method18061(aLong10034);
	    aLong10034 = 0L;
	}
    }
}
