/* Class419_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jagdx.Class361;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class419_Sub3_Sub1 extends Class419_Sub3 implements Interface42
{
    public void method236(int i, int i_0_, int i_1_, int i_2_, int[] is,
			  int[] is_3_, int i_4_) {
	super.method236(i, i_0_, i_1_, i_2_, is, is_3_, i_4_);
    }
    
    public Interface21 method322(int i) {
	return new Class414(this, i);
    }
    
    public float method264() {
	return super.method237();
    }
    
    public void method127() {
	super.method127();
    }
    
    public int method1() {
	return super.method1();
    }
    
    public void method238(int i, int i_5_, int i_6_, int i_7_, byte[] is,
			  Class165 class165, int i_8_, int i_9_) {
	super.method238(i, i_5_, i_6_, i_7_, is, class165, i_8_, i_9_);
    }
    
    public float method250(float f) {
	return super.method250(f);
    }
    
    public float method229(float f) {
	return super.method229(f);
    }
    
    public void method253(int i, int i_10_, int i_11_, int i_12_, int[] is,
			  int[] is_13_, int i_14_) {
	super.method236(i, i_10_, i_11_, i_12_, is, is_13_, i_14_);
    }
    
    public void method231(boolean bool, boolean bool_15_) {
	super.method231(bool, bool_15_);
    }
    
    public void method125() {
	super.method127();
    }
    
    public boolean method269() {
	return super.method239();
    }
    
    public boolean method240() {
	return super.method210();
    }
    
    public void method251(int i, int i_16_, int i_17_, int i_18_, int i_19_,
			  int i_20_) {
	super.method251(i, i_16_, i_17_, i_18_, i_19_, i_20_);
    }
    
    public int method241() {
	return super.method80();
    }
    
    public float method247() {
	return super.method247();
    }
    
    public void method263(int i, int i_21_, int i_22_, int i_23_, int i_24_,
			  int i_25_) {
	super.method251(i, i_21_, i_22_, i_23_, i_24_, i_25_);
    }
    
    public void method232(int i, int i_26_, int i_27_, int i_28_, int[] is,
			  int i_29_, int i_30_) {
	super.method232(i, i_26_, i_27_, i_28_, is, i_29_, i_30_);
    }
    
    public void method258(int i, int i_31_, int i_32_, int i_33_, int[] is,
			  int i_34_) {
	long l = IDirect3DTexture.GetSurfaceLevel(aLong4676, 0);
	long l_35_
	    = IDirect3DDevice.CreateRenderTarget((aClass182_Sub1_Sub1_4673
						  .aLong11475),
						 i_32_, i_33_, 21, 0, 0, true);
	aClass182_Sub1_Sub1_4673.method14790(i_33_ * i_32_ * 4);
	if (Class361.method6305
	    (IDirect3DDevice.StretchRect(aClass182_Sub1_Sub1_4673.aLong11475,
					 l, i, i_31_, i_32_, i_33_, l_35_, 0,
					 0, i_32_, i_33_, 1))) {
	    IDirect3DSurface.Download(l_35_, 0, 0, i_32_, i_33_, i_32_ * 4, 16,
				      aClass182_Sub1_Sub1_4673.aLong9160);
	    aClass182_Sub1_Sub1_4673.aByteBuffer9271.clear();
	    aClass182_Sub1_Sub1_4673.aByteBuffer9271.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_35_);
    }
    
    public void method126() {
	super.method127();
    }
    
    public float method237() {
	return super.method237();
    }
    
    public int method224() {
	return super.method1();
    }
    
    public int method234() {
	return super.method1();
    }
    
    public float method244(float f) {
	return super.method229(f);
    }
    
    public int method242() {
	return super.method80();
    }
    
    public boolean method210() {
	return super.method210();
    }
    
    public void method230(int i, int i_36_, int i_37_, int i_38_, int[] is,
			  int i_39_) {
	long l = IDirect3DTexture.GetSurfaceLevel(aLong4676, 0);
	long l_40_
	    = IDirect3DDevice.CreateRenderTarget((aClass182_Sub1_Sub1_4673
						  .aLong11475),
						 i_37_, i_38_, 21, 0, 0, true);
	aClass182_Sub1_Sub1_4673.method14790(i_38_ * i_37_ * 4);
	if (Class361.method6305
	    (IDirect3DDevice.StretchRect(aClass182_Sub1_Sub1_4673.aLong11475,
					 l, i, i_36_, i_37_, i_38_, l_40_, 0,
					 0, i_37_, i_38_, 1))) {
	    IDirect3DSurface.Download(l_40_, 0, 0, i_37_, i_38_, i_37_ * 4, 16,
				      aClass182_Sub1_Sub1_4673.aLong9160);
	    aClass182_Sub1_Sub1_4673.aByteBuffer9271.clear();
	    aClass182_Sub1_Sub1_4673.aByteBuffer9271.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_40_);
    }
    
    public float method245(float f) {
	return super.method229(f);
    }
    
    public boolean method246() {
	return super.method210();
    }
    
    Class419_Sub3_Sub1(Class182_Sub1_Sub1 class182_sub1_sub1,
		       Class165 class165, Class178 class178, int i,
		       int i_41_) {
	super(class182_sub1_sub1, class165, class178, i, i_41_, 1025, 0);
    }
    
    public boolean method248() {
	return super.method210();
    }
    
    public void method249(int i, int i_42_, int i_43_, int i_44_, int[] is,
			  int i_45_, int i_46_) {
	super.method232(i, i_42_, i_43_, i_44_, is, i_45_, i_46_);
    }
    
    public boolean method239() {
	return super.method239();
    }
    
    public void method233(int i, int i_47_, int i_48_, int i_49_, byte[] is,
			  Class165 class165, int i_50_, int i_51_) {
	super.method238(i, i_47_, i_48_, i_49_, is, class165, i_50_, i_51_);
    }
    
    public float method243(float f) {
	return super.method250(f);
    }
    
    public void method252(int i, int i_52_, int i_53_, int i_54_, int[] is,
			  int i_55_) {
	long l = IDirect3DTexture.GetSurfaceLevel(aLong4676, 0);
	long l_56_
	    = IDirect3DDevice.CreateRenderTarget((aClass182_Sub1_Sub1_4673
						  .aLong11475),
						 i_53_, i_54_, 21, 0, 0, true);
	aClass182_Sub1_Sub1_4673.method14790(i_54_ * i_53_ * 4);
	if (Class361.method6305
	    (IDirect3DDevice.StretchRect(aClass182_Sub1_Sub1_4673.aLong11475,
					 l, i, i_52_, i_53_, i_54_, l_56_, 0,
					 0, i_53_, i_54_, 1))) {
	    IDirect3DSurface.Download(l_56_, 0, 0, i_53_, i_54_, i_53_ * 4, 16,
				      aClass182_Sub1_Sub1_4673.aLong9160);
	    aClass182_Sub1_Sub1_4673.aByteBuffer9271.clear();
	    aClass182_Sub1_Sub1_4673.aByteBuffer9271.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_56_);
    }
    
    public void method267(int i, int i_57_, int i_58_, int i_59_, byte[] is,
			  Class165 class165, int i_60_, int i_61_) {
	super.method238(i, i_57_, i_58_, i_59_, is, class165, i_60_, i_61_);
    }
    
    public void method254(int i, int i_62_, int i_63_, int i_64_, int[] is,
			  int[] is_65_, int i_66_) {
	super.method236(i, i_62_, i_63_, i_64_, is, is_65_, i_66_);
    }
    
    public void method255(int i, int i_67_, int i_68_, int i_69_, int[] is,
			  int[] is_70_, int i_71_) {
	super.method236(i, i_67_, i_68_, i_69_, is, is_70_, i_71_);
    }
    
    public void method276() {
	super.method276();
    }
    
    public void method257(int i, int i_72_, int i_73_, int i_74_, int i_75_,
			  int i_76_) {
	super.method251(i, i_72_, i_73_, i_74_, i_75_, i_76_);
    }
    
    public void method270(boolean bool, boolean bool_77_) {
	super.method231(bool, bool_77_);
    }
    
    public void method259(int i, int i_78_, int i_79_, int i_80_, int i_81_,
			  int i_82_) {
	super.method251(i, i_78_, i_79_, i_80_, i_81_, i_82_);
    }
    
    public void method274() {
	super.method276();
    }
    
    public void method261(int i, int i_83_, int i_84_, int i_85_, int i_86_,
			  int i_87_) {
	super.method251(i, i_83_, i_84_, i_85_, i_86_, i_87_);
    }
    
    public float method262() {
	return super.method237();
    }
    
    public float method266() {
	return super.method237();
    }
    
    public Interface21 method321(int i) {
	return new Class414(this, i);
    }
    
    public float method265() {
	return super.method247();
    }
    
    public float method235() {
	return super.method247();
    }
    
    public boolean method228() {
	return super.method239();
    }
    
    public boolean method268() {
	return super.method239();
    }
    
    public void method256(int i, int i_88_, int i_89_, int i_90_, int[] is,
			  int[] is_91_, int i_92_) {
	super.method236(i, i_88_, i_89_, i_90_, is, is_91_, i_92_);
    }
    
    public void method260(int i, int i_93_, int i_94_, int i_95_, int i_96_,
			  int i_97_) {
	super.method251(i, i_93_, i_94_, i_95_, i_96_, i_97_);
    }
    
    public void method275() {
	super.method276();
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
    
    public Interface21 method319(int i) {
	return new Class414(this, i);
    }
    
    public Interface21 method320(int i) {
	return new Class414(this, i);
    }
    
    public void method271(Class377 class377) {
	super.method271(class377);
    }
    
    public int method80() {
	return super.method80();
    }
}
