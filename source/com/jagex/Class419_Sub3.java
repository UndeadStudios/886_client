/* Class419_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

public class Class419_Sub3 extends Class419 implements Interface38
{
    int anInt10237;
    boolean aBool10238;
    int anInt10239;
    float aFloat10240;
    float aFloat10241;
    boolean aBool10242;
    
    public int method80() {
	return anInt10237;
    }
    
    Class419_Sub3(Class182_Sub1_Sub1 class182_sub1_sub1, Class165 class165,
		  Class178 class178, int i, int i_0_, int i_1_, int i_2_) {
	super(class182_sub1_sub1, class165, class178, false, i * i_0_);
	if (!aClass182_Sub1_Sub1_4673.aBool11460) {
	    anInt10239 = Class212.method3935(i, -2056250364);
	    anInt10237 = Class212.method3935(i_0_, -2056250364);
	    aFloat10241 = (float) i / (float) anInt10239;
	    aFloat10240 = (float) i_0_ / (float) anInt10237;
	} else {
	    anInt10239 = i;
	    anInt10237 = i_0_;
	    aFloat10241 = 1.0F;
	    aFloat10240 = 1.0F;
	}
	aLong4676
	    = (IDirect3DDevice.CreateTexture
	       (aClass182_Sub1_Sub1_4673.aLong11475, anInt10239, anInt10237, 0,
		i_1_,
		Class182_Sub1_Sub1.method18071(aClass165_4675, aClass178_4674),
		i_2_));
    }
    
    Class419_Sub3(Class182_Sub1_Sub1 class182_sub1_sub1, int i, int i_3_,
		  boolean bool, int[] is, int i_4_, int i_5_) {
	super(class182_sub1_sub1, Class165.aClass165_1771,
	      Class178.aClass178_1905, bool && class182_sub1_sub1.aBool11471,
	      i * i_3_);
	if (!aClass182_Sub1_Sub1_4673.aBool11460) {
	    anInt10239 = Class212.method3935(i, -2056250364);
	    anInt10237 = Class212.method3935(i_3_, -2056250364);
	    aFloat10241 = (float) i / (float) anInt10239;
	    aFloat10240 = (float) i_3_ / (float) anInt10237;
	    if (i != anInt10239 || i_3_ != anInt10237) {
		is = aClass182_Sub1_Sub1_4673.method3266(i, i_3_, anInt10239,
							 anInt10237, is, i_4_,
							 i_5_, 961209058);
		i_4_ = 0;
		i_5_ = anInt10239;
	    }
	} else {
	    anInt10239 = i;
	    anInt10237 = i_3_;
	    aFloat10241 = 1.0F;
	    aFloat10240 = 1.0F;
	}
	if (bool)
	    aLong4676 = IDirect3DDevice.CreateTexture((aClass182_Sub1_Sub1_4673
						       .aLong11475),
						      anInt10239, anInt10237,
						      0, 1024, 21, 1);
	else
	    aLong4676 = IDirect3DDevice.CreateTexture((aClass182_Sub1_Sub1_4673
						       .aLong11475),
						      anInt10239, anInt10237,
						      1, 0, 21, 1);
	if (i_5_ == 0)
	    i_5_ = anInt10239;
	aClass182_Sub1_Sub1_4673.method14790(i_5_ * anInt10237
					     * (aClass165_4675.anInt1770
						* -1998053519));
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_4_, i_5_ * anInt10237);
	IDirect3DTexture.Upload(aLong4676, 0, 0, 0, anInt10239, anInt10237,
				i_5_ * (aClass165_4675.anInt1770
					* -1998053519),
				0, aClass182_Sub1_Sub1_4673.aLong9160);
    }
    
    public int method241() {
	return anInt10237;
    }
    
    Class419_Sub3(Class182_Sub1_Sub1 class182_sub1_sub1, Class165 class165,
		  int i, int i_6_, boolean bool, float[] fs, int i_7_,
		  int i_8_) {
	super(class182_sub1_sub1, class165, Class178.aClass178_1905,
	      bool && class182_sub1_sub1.aBool11471, i * i_6_);
	if (!aClass182_Sub1_Sub1_4673.aBool11460) {
	    anInt10239 = Class212.method3935(i, -2056250364);
	    anInt10237 = Class212.method3935(i_6_, -2056250364);
	    aFloat10241 = (float) i / (float) anInt10239;
	    aFloat10240 = (float) i_6_ / (float) anInt10237;
	    if (i != anInt10239 || i_6_ != anInt10237) {
		fs = aClass182_Sub1_Sub1_4673.method3398(i, i_6_, anInt10239,
							 anInt10237, fs, i_7_,
							 i_8_,
							 (class165.anInt1770
							  * -1998053519),
							 -1511701366);
		i_7_ = 0;
		i_8_ = anInt10239;
	    }
	} else {
	    anInt10239 = i;
	    anInt10237 = i_6_;
	    aFloat10241 = 1.0F;
	    aFloat10240 = 1.0F;
	}
	if (bool)
	    aLong4676
		= (IDirect3DDevice.CreateTexture
		   (aClass182_Sub1_Sub1_4673.aLong11475, anInt10239,
		    anInt10237, 0, 1024,
		    Class182_Sub1_Sub1.method18071(aClass165_4675,
						   Class178.aClass178_1914),
		    1));
	else
	    aLong4676
		= (IDirect3DDevice.CreateTexture
		   (aClass182_Sub1_Sub1_4673.aLong11475, anInt10239,
		    anInt10237, 1, 0,
		    Class182_Sub1_Sub1.method18071(aClass165_4675,
						   Class178.aClass178_1914),
		    1));
	if (i_8_ == 0)
	    i_8_ = anInt10239;
	aClass182_Sub1_Sub1_4673.method14790(i_8_ * anInt10237
					     * (aClass165_4675.anInt1770
						* -1998053519)
					     * 4);
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	bytebuffer.asFloatBuffer().put(fs, i_7_, (i_8_ * anInt10237
						  * (aClass165_4675.anInt1770
						     * -1998053519)));
	IDirect3DTexture.Upload(aLong4676, 0, 0, 0, anInt10239, anInt10237,
				i_8_ * (aClass165_4675.anInt1770
					* -1998053519) * 4,
				0, aClass182_Sub1_Sub1_4673.aLong9160);
    }
    
    public int method1() {
	return anInt10239;
    }
    
    public float method245(float f) {
	return f / (float) anInt10237;
    }
    
    public float method250(float f) {
	return f / (float) anInt10239;
    }
    
    public void method274() {
	aClass182_Sub1_Sub1_4673.method18054(this);
    }
    
    public void method125() {
	super.method127();
    }
    
    public float method247() {
	return aFloat10240;
    }
    
    public boolean method210() {
	return true;
    }
    
    long method6735() {
	return aLong4676;
    }
    
    public void method271(Class377 class377) {
	super.method271(class377);
    }
    
    public void method231(boolean bool, boolean bool_9_) {
	aBool10238 = bool;
	aBool10242 = bool_9_;
    }
    
    public void method253(int i, int i_10_, int i_11_, int i_12_, int[] is,
			  int[] is_13_, int i_14_) {
	if (aClass165_4675 != Class165.aClass165_1771
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	method236(i, i_10_, i_11_, i_12_, is, null, i_14_);
    }
    
    public void method232(int i, int i_15_, int i_16_, int i_17_, int[] is,
			  int i_18_, int i_19_) {
	if (aClass165_4675 != Class165.aClass165_1771
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	if (i_19_ == 0)
	    i_19_ = i_16_;
	aClass182_Sub1_Sub1_4673.method14790(i_19_ * i_17_
					     * (aClass165_4675.anInt1770
						* -1998053519));
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_18_, i_19_ * i_17_);
	IDirect3DTexture.Upload(aLong4676, 0, i, i_15_, i_16_, i_17_,
				i_19_ * (aClass165_4675.anInt1770
					 * -1998053519),
				0, aClass182_Sub1_Sub1_4673.aLong9160);
    }
    
    public void method258(int i, int i_20_, int i_21_, int i_22_, int[] is,
			  int i_23_) {
	if (aClass165_4675 != Class165.aClass165_1771
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	aClass182_Sub1_Sub1_4673.method14790(i_21_ * i_22_ * 4);
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	IDirect3DTexture.Download(aLong4676, 0, i, i_20_, i_21_, i_22_,
				  i_21_ * 4, 0,
				  aClass182_Sub1_Sub1_4673.aLong9160);
	bytebuffer.asIntBuffer().get(is, i_23_, i_21_ * i_22_);
    }
    
    public void method236(int i, int i_24_, int i_25_, int i_26_, int[] is,
			  int[] is_27_, int i_28_) {
	if (aClass165_4675 != Class165.aClass165_1771
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	method236(i, i_24_, i_25_, i_26_, is, null, i_28_);
    }
    
    public void method251(int i, int i_29_, int i_30_, int i_31_, int i_32_,
			  int i_33_) {
	int[] is
	    = aClass182_Sub1_Sub1_4673.method3165(i_32_, i_33_, i_30_, i_31_);
	if (is != null) {
	    for (int i_34_ = 0; i_34_ < is.length; i_34_++)
		is[i_34_] |= ~0xffffff;
	    method232(i, i_29_, i_30_, i_31_, is, 0, i_30_);
	}
    }
    
    public void method276() {
	aClass182_Sub1_Sub1_4673.method18054(this);
    }
    
    public boolean method239() {
	return false;
    }
    
    public void method127() {
	super.method127();
    }
    
    public void method233(int i, int i_35_, int i_36_, int i_37_, byte[] is,
			  Class165 class165, int i_38_, int i_39_) {
	if (aClass165_4675 != class165
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	if (i_39_ == 0)
	    i_39_ = i_36_;
	aClass182_Sub1_Sub1_4673.method14790(i_39_ * i_37_
					     * (aClass165_4675.anInt1770
						* -1998053519));
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	bytebuffer.put(is, i_38_, i_39_ * i_37_);
	IDirect3DTexture.Upload(aLong4676, 0, i, i_35_, i_36_, i_37_,
				i_39_ * (aClass165_4675.anInt1770
					 * -1998053519),
				0, aClass182_Sub1_Sub1_4673.aLong9160);
    }
    
    public float method262() {
	return aFloat10241;
    }
    
    public float method243(float f) {
	return f / (float) anInt10239;
    }
    
    public int method234() {
	return anInt10239;
    }
    
    public float method229(float f) {
	return f / (float) anInt10237;
    }
    
    public int method242() {
	return anInt10237;
    }
    
    public int method224() {
	return anInt10239;
    }
    
    public float method244(float f) {
	return f / (float) anInt10237;
    }
    
    public void method255(int i, int i_40_, int i_41_, int i_42_, int[] is,
			  int[] is_43_, int i_44_) {
	if (aClass165_4675 != Class165.aClass165_1771
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	method236(i, i_40_, i_41_, i_42_, is, null, i_44_);
    }
    
    public boolean method246() {
	return true;
    }
    
    public boolean method240() {
	return true;
    }
    
    public void method254(int i, int i_45_, int i_46_, int i_47_, int[] is,
			  int[] is_48_, int i_49_) {
	if (aClass165_4675 != Class165.aClass165_1771
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	method236(i, i_45_, i_46_, i_47_, is, null, i_49_);
    }
    
    public void method249(int i, int i_50_, int i_51_, int i_52_, int[] is,
			  int i_53_, int i_54_) {
	if (aClass165_4675 != Class165.aClass165_1771
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	if (i_54_ == 0)
	    i_54_ = i_51_;
	aClass182_Sub1_Sub1_4673.method14790(i_54_ * i_52_
					     * (aClass165_4675.anInt1770
						* -1998053519));
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_53_, i_54_ * i_52_);
	IDirect3DTexture.Upload(aLong4676, 0, i, i_50_, i_51_, i_52_,
				i_54_ * (aClass165_4675.anInt1770
					 * -1998053519),
				0, aClass182_Sub1_Sub1_4673.aLong9160);
    }
    
    public void method267(int i, int i_55_, int i_56_, int i_57_, byte[] is,
			  Class165 class165, int i_58_, int i_59_) {
	if (aClass165_4675 != class165
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	if (i_59_ == 0)
	    i_59_ = i_56_;
	aClass182_Sub1_Sub1_4673.method14790(i_59_ * i_57_
					     * (aClass165_4675.anInt1770
						* -1998053519));
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	bytebuffer.put(is, i_58_, i_59_ * i_57_);
	IDirect3DTexture.Upload(aLong4676, 0, i, i_55_, i_56_, i_57_,
				i_59_ * (aClass165_4675.anInt1770
					 * -1998053519),
				0, aClass182_Sub1_Sub1_4673.aLong9160);
    }
    
    public float method237() {
	return aFloat10241;
    }
    
    public boolean method248() {
	return true;
    }
    
    public void method256(int i, int i_60_, int i_61_, int i_62_, int[] is,
			  int[] is_63_, int i_64_) {
	if (aClass165_4675 != Class165.aClass165_1771
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	method236(i, i_60_, i_61_, i_62_, is, null, i_64_);
    }
    
    public void method238(int i, int i_65_, int i_66_, int i_67_, byte[] is,
			  Class165 class165, int i_68_, int i_69_) {
	if (aClass165_4675 != class165
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	if (i_69_ == 0)
	    i_69_ = i_66_;
	aClass182_Sub1_Sub1_4673.method14790(i_69_ * i_67_
					     * (aClass165_4675.anInt1770
						* -1998053519));
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	bytebuffer.put(is, i_68_, i_69_ * i_67_);
	IDirect3DTexture.Upload(aLong4676, 0, i, i_65_, i_66_, i_67_,
				i_69_ * (aClass165_4675.anInt1770
					 * -1998053519),
				0, aClass182_Sub1_Sub1_4673.aLong9160);
    }
    
    Class419_Sub3(Class182_Sub1_Sub1 class182_sub1_sub1, Class165 class165,
		  Class178 class178, int i, int i_70_) {
	this(class182_sub1_sub1, class165, class178, i, i_70_, 0, 1);
    }
    
    Class419_Sub3(Class182_Sub1_Sub1 class182_sub1_sub1, Class165 class165,
		  int i, int i_71_, boolean bool, byte[] is, int i_72_,
		  int i_73_) {
	super(class182_sub1_sub1, class165, Class178.aClass178_1905,
	      bool && class182_sub1_sub1.aBool11471, i * i_71_);
	if (!aClass182_Sub1_Sub1_4673.aBool11460) {
	    anInt10239 = Class212.method3935(i, -2056250364);
	    anInt10237 = Class212.method3935(i_71_, -2056250364);
	    aFloat10241 = (float) i / (float) anInt10239;
	    aFloat10240 = (float) i_71_ / (float) anInt10237;
	    if (i != anInt10239 || i_71_ != anInt10237) {
		is = aClass182_Sub1_Sub1_4673.method3176(i, i_71_, anInt10239,
							 anInt10237, is, i_72_,
							 i_73_,
							 (class165.anInt1770
							  * -1998053519),
							 (byte) 6);
		i_72_ = 0;
		i_73_ = anInt10239;
	    }
	} else {
	    anInt10239 = i;
	    anInt10237 = i_71_;
	    aFloat10241 = 1.0F;
	    aFloat10240 = 1.0F;
	}
	if (bool)
	    aLong4676
		= (IDirect3DDevice.CreateTexture
		   (aClass182_Sub1_Sub1_4673.aLong11475, anInt10239,
		    anInt10237, 0, 1024,
		    Class182_Sub1_Sub1.method18071(aClass165_4675,
						   Class178.aClass178_1905),
		    1));
	else
	    aLong4676
		= (IDirect3DDevice.CreateTexture
		   (aClass182_Sub1_Sub1_4673.aLong11475, anInt10239,
		    anInt10237, 1, 0,
		    Class182_Sub1_Sub1.method18071(aClass165_4675,
						   Class178.aClass178_1905),
		    1));
	if (i_73_ == 0)
	    i_73_ = anInt10239;
	aClass182_Sub1_Sub1_4673.method14790(i_73_ * anInt10237
					     * (aClass165_4675.anInt1770
						* -1998053519));
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	if (aClass165_4675 == Class165.aClass165_1778) {
	    bytebuffer.put(is, i_72_, anInt10237 * anInt10239 / 2);
	    IDirect3DTexture.Upload(aLong4676, 0, 0, 0, anInt10239,
				    anInt10237 / 4, anInt10239 / 4 * 8, 0,
				    aClass182_Sub1_Sub1_4673.aLong9160);
	} else if (aClass165_4675 == Class165.aClass165_1779) {
	    bytebuffer.put(is, i_72_, anInt10237 * anInt10239);
	    IDirect3DTexture.Upload(aLong4676, 0, 0, 0, anInt10239,
				    anInt10237 / 4, anInt10239 / 4 * 16, 0,
				    aClass182_Sub1_Sub1_4673.aLong9160);
	} else {
	    bytebuffer.put(is, i_72_, i_73_ * anInt10237);
	    IDirect3DTexture.Upload(aLong4676, 0, 0, 0, anInt10239, anInt10237,
				    i_73_ * (aClass165_4675.anInt1770
					     * -1998053519),
				    0, aClass182_Sub1_Sub1_4673.aLong9160);
	}
    }
    
    public void method252(int i, int i_74_, int i_75_, int i_76_, int[] is,
			  int i_77_) {
	if (aClass165_4675 != Class165.aClass165_1771
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	aClass182_Sub1_Sub1_4673.method14790(i_75_ * i_76_ * 4);
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	IDirect3DTexture.Download(aLong4676, 0, i, i_74_, i_75_, i_76_,
				  i_75_ * 4, 0,
				  aClass182_Sub1_Sub1_4673.aLong9160);
	bytebuffer.asIntBuffer().get(is, i_77_, i_75_ * i_76_);
    }
    
    public void method257(int i, int i_78_, int i_79_, int i_80_, int i_81_,
			  int i_82_) {
	int[] is
	    = aClass182_Sub1_Sub1_4673.method3165(i_81_, i_82_, i_79_, i_80_);
	if (is != null) {
	    for (int i_83_ = 0; i_83_ < is.length; i_83_++)
		is[i_83_] |= ~0xffffff;
	    method232(i, i_78_, i_79_, i_80_, is, 0, i_79_);
	}
    }
    
    public void method263(int i, int i_84_, int i_85_, int i_86_, int i_87_,
			  int i_88_) {
	int[] is
	    = aClass182_Sub1_Sub1_4673.method3165(i_87_, i_88_, i_85_, i_86_);
	if (is != null) {
	    for (int i_89_ = 0; i_89_ < is.length; i_89_++)
		is[i_89_] |= ~0xffffff;
	    method232(i, i_84_, i_85_, i_86_, is, 0, i_85_);
	}
    }
    
    public void method230(int i, int i_90_, int i_91_, int i_92_, int[] is,
			  int i_93_) {
	if (aClass165_4675 != Class165.aClass165_1771
	    || aClass178_4674 != Class178.aClass178_1905)
	    throw new RuntimeException();
	aClass182_Sub1_Sub1_4673.method14790(i_91_ * i_92_ * 4);
	ByteBuffer bytebuffer = aClass182_Sub1_Sub1_4673.aByteBuffer9271;
	bytebuffer.clear();
	IDirect3DTexture.Download(aLong4676, 0, i, i_90_, i_91_, i_92_,
				  i_91_ * 4, 0,
				  aClass182_Sub1_Sub1_4673.aLong9160);
	bytebuffer.asIntBuffer().get(is, i_93_, i_91_ * i_92_);
    }
    
    public void method126() {
	super.method127();
    }
    
    public void method260(int i, int i_94_, int i_95_, int i_96_, int i_97_,
			  int i_98_) {
	int[] is
	    = aClass182_Sub1_Sub1_4673.method3165(i_97_, i_98_, i_95_, i_96_);
	if (is != null) {
	    for (int i_99_ = 0; i_99_ < is.length; i_99_++)
		is[i_99_] |= ~0xffffff;
	    method232(i, i_94_, i_95_, i_96_, is, 0, i_95_);
	}
    }
    
    public void method261(int i, int i_100_, int i_101_, int i_102_,
			  int i_103_, int i_104_) {
	int[] is = aClass182_Sub1_Sub1_4673.method3165(i_103_, i_104_, i_101_,
						       i_102_);
	if (is != null) {
	    for (int i_105_ = 0; i_105_ < is.length; i_105_++)
		is[i_105_] |= ~0xffffff;
	    method232(i, i_100_, i_101_, i_102_, is, 0, i_101_);
	}
    }
    
    public float method266() {
	return aFloat10241;
    }
    
    public float method264() {
	return aFloat10241;
    }
    
    public float method265() {
	return aFloat10240;
    }
    
    public float method235() {
	return aFloat10240;
    }
    
    public boolean method228() {
	return false;
    }
    
    public boolean method268() {
	return false;
    }
    
    public boolean method269() {
	return false;
    }
    
    public void method259(int i, int i_106_, int i_107_, int i_108_,
			  int i_109_, int i_110_) {
	int[] is = aClass182_Sub1_Sub1_4673.method3165(i_109_, i_110_, i_107_,
						       i_108_);
	if (is != null) {
	    for (int i_111_ = 0; i_111_ < is.length; i_111_++)
		is[i_111_] |= ~0xffffff;
	    method232(i, i_106_, i_107_, i_108_, is, 0, i_107_);
	}
    }
    
    public void method275() {
	aClass182_Sub1_Sub1_4673.method18054(this);
    }
    
    public void method273(Class377 class377) {
	super.method271(class377);
    }
    
    public void method272(Class377 class377) {
	super.method271(class377);
    }
    
    public void method277(Class377 class377) {
	super.method271(class377);
    }
    
    public void method278(Class377 class377) {
	super.method271(class377);
    }
    
    public void method270(boolean bool, boolean bool_112_) {
	aBool10238 = bool;
	aBool10242 = bool_112_;
    }
    
    long method6737() {
	return aLong4676;
    }
}
