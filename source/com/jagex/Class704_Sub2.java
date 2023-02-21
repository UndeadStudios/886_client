/* Class704_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class704_Sub2 extends Class704
{
    float aFloat11003;
    float[] aFloatArray11004;
    int anInt11005 = 0;
    Class430[] aClass430Array11006;
    float aFloat11007 = 0.0F;
    int[] anIntArray11008;
    
    Class704_Sub2(Class309 class309) {
	super(class309);
	aFloat11003 = 0.0F;
    }
    
    public void method17378(Class430 class430, int i, float f, int i_0_) {
	if (aClass430Array11006 == null) {
	    aClass430Array11006 = new Class430[] { class430 };
	    aFloatArray11004 = new float[] { f };
	    anIntArray11008 = new int[] { i };
	} else {
	    Class430[] class430s
		= new Class430[1 + aClass430Array11006.length];
	    float[] fs = new float[aClass430Array11006.length + 1];
	    int[] is = new int[1 + aClass430Array11006.length];
	    System.arraycopy(aClass430Array11006, 0, class430s, 0,
			     aClass430Array11006.length);
	    System.arraycopy(aFloatArray11004, 0, fs, 0,
			     aClass430Array11006.length);
	    System.arraycopy(anIntArray11008, 0, is, 0,
			     aClass430Array11006.length);
	    aClass430Array11006 = class430s;
	    aFloatArray11004 = fs;
	    anIntArray11008 = is;
	    aClass430Array11006[aClass430Array11006.length - 1] = class430;
	    aFloatArray11004[aFloatArray11004.length - 1] = f;
	    anIntArray11008[anIntArray11008.length - 1] = i;
	}
    }
    
    public void method14280(float f, int i) {
	Class430 class430 = aClass430Array11006[-1743813433 * anInt11005];
	if (aFloatArray11004[anInt11005 * -1743813433] > 0.0F) {
	    if (aFloatArray11004[-1743813433 * anInt11005] >= f) {
		aFloatArray11004[anInt11005 * -1743813433] -= f;
		return;
	    }
	    f -= aFloatArray11004[anInt11005 * -1743813433];
	    aFloatArray11004[anInt11005 * -1743813433] = 0.0F;
	}
	float f_1_ = 1.0F / (float) Class424.method6768(1684836768);
	while (f > 0.0F) {
	    float f_2_ = class430.method6886();
	    if (aFloat11007 >= f_2_) {
		if (aClass430Array11006.length == anInt11005 * -1743813433 + 1)
		    break;
		if (aFloatArray11004[1 + -1743813433 * anInt11005] >= f) {
		    aFloatArray11004[1 + -1743813433 * anInt11005] -= f;
		    break;
		}
		anInt11005 += -233440009;
		f -= aFloatArray11004[-1743813433 * anInt11005];
		aFloatArray11004[-1743813433 * anInt11005] = 0.0F;
		method17382((byte) 1);
		aFloat11007 = 0.0F;
		aFloat11003 = 0.0F;
		class430 = aClass430Array11006[-1743813433 * anInt11005];
		f_2_ = class430.method6886();
	    }
	    while (f > 0.0F && aFloat11007 < f_2_) {
		aFloat11003 = method17391(f_2_, aFloat11003, Math.min(f, f_1_),
					  -1005686486);
		f -= f_1_;
		method17379(aFloat11003, f_2_, -1049735288);
	    }
	}
    }
    
    void method17379(float f, float f_3_, int i) {
	aFloat11007 += f;
	if (aFloat11007 > f_3_)
	    aFloat11007 = f_3_;
    }
    
    public void method14283(RSBuffer class525_sub38) {
	aFloat11007 = 0.0F;
	aFloat11003 = 0.0F;
	anInt11005 = 0;
	int i = class525_sub38.readUnsignedByte(1137617396);
	aClass430Array11006 = new Class430[i];
	aFloatArray11004 = new float[i];
	for (int i_4_ = 0; i_4_ < i; i_4_++) {
	    aClass430Array11006[i_4_] = new Class430(class525_sub38);
	    aFloatArray11004[i_4_] = class525_sub38.method16634(-461351869);
	}
	method17383(class525_sub38, i, 890601480);
    }
    
    abstract float method17380(float f, float f_5_, float f_6_);
    
    public boolean method14286(int i) {
	return aClass430Array11006 != null;
    }
    
    public void method14285(RSBuffer class525_sub38, int i) {
	aFloat11007 = 0.0F;
	aFloat11003 = 0.0F;
	anInt11005 = 0;
	int i_7_ = class525_sub38.readUnsignedByte(91725670);
	aClass430Array11006 = new Class430[i_7_];
	aFloatArray11004 = new float[i_7_];
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
	    aClass430Array11006[i_8_] = new Class430(class525_sub38);
	    aFloatArray11004[i_8_] = class525_sub38.method16634(-183981460);
	}
	method17383(class525_sub38, i_7_, -426088789);
    }
    
    void method17381(float f, float f_9_) {
	aFloat11007 += f;
	if (aFloat11007 > f_9_)
	    aFloat11007 = f_9_;
    }
    
    public void method14279(Class291 class291, Class444 class444, int i,
			    int i_10_, float f, int i_11_) {
	double[] ds = aClass309_8791.method5487(1114956016);
	ds[0] -= (double) i;
	ds[2] -= (double) i_10_;
	double[] ds_12_ = method17387((byte) -2);
	ds_12_[0] -= (double) i;
	ds_12_[2] -= (double) i_10_;
	ds[1] *= -1.0;
	ds_12_[1] *= -1.0;
	Class446 class446 = Class446.method7207();
	class446.aFloat4895 = (float) (ds_12_[0] - ds[0]);
	class446.aFloat4896 = (float) (ds_12_[1] - ds[1]);
	class446.aFloat4897 = (float) (ds_12_[2] - ds[2]);
	class446.method7220();
	Class429 class429 = new Class429();
	class429.method6810(class446, f);
	Class446 class446_13_ = Class446.method7208(0.0F, 1.0F, 0.0F);
	Class446 class446_14_ = Class446.method7229(class446, class446_13_);
	class446_13_ = Class446.method7229(class446_14_, class446);
	class446_13_.method7239(class429);
	class444.method7187(ds[0], ds[1], ds[2], ds_12_[0], ds_12_[1],
			    ds_12_[2], class446_13_.aFloat4895,
			    class446_13_.aFloat4896, class446_13_.aFloat4897);
	class446_13_.method7260();
    }
    
    abstract void method17382(byte i);
    
    public Class446 method14281(byte i) {
	Class446 class446 = Class446.method7207();
	double[] ds = aClass430Array11006[-1743813433 * anInt11005]
			  .method6887(aFloat11007);
	class446.aFloat4895 = (float) ds[0];
	class446.aFloat4896 = (float) ds[1];
	class446.aFloat4897 = (float) ds[2];
	return class446;
    }
    
    abstract void method17383(RSBuffer class525_sub38, int i, int i_15_);
    
    abstract void method17384();
    
    abstract void method17385();
    
    public Class446 method14299(int i) {
	return method14281((byte) -55);
    }
    
    abstract void method17386(RSBuffer class525_sub38, int i);
    
    public boolean method14287() {
	return aClass430Array11006 != null;
    }
    
    public boolean method14282() {
	return aClass430Array11006 != null;
    }
    
    public boolean method14284() {
	return aClass430Array11006 != null;
    }
    
    public Class446 method14289() {
	Class446 class446 = Class446.method7207();
	double[] ds = aClass430Array11006[-1743813433 * anInt11005]
			  .method6887(aFloat11007);
	class446.aFloat4895 = (float) ds[0];
	class446.aFloat4896 = (float) ds[1];
	class446.aFloat4897 = (float) ds[2];
	return class446;
    }
    
    double[] method17387(byte i) {
	return aClass430Array11006[anInt11005 * -1743813433]
		   .method6887(aFloat11007);
    }
    
    public Class446 method14291() {
	Class446 class446 = Class446.method7207();
	double[] ds = aClass430Array11006[-1743813433 * anInt11005]
			  .method6887(aFloat11007);
	class446.aFloat4895 = (float) ds[0];
	class446.aFloat4896 = (float) ds[1];
	class446.aFloat4897 = (float) ds[2];
	return class446;
    }
    
    public void method17388(Class430 class430, int i, float f) {
	if (aClass430Array11006 == null) {
	    aClass430Array11006 = new Class430[] { class430 };
	    aFloatArray11004 = new float[] { f };
	    anIntArray11008 = new int[] { i };
	} else {
	    Class430[] class430s
		= new Class430[1 + aClass430Array11006.length];
	    float[] fs = new float[aClass430Array11006.length + 1];
	    int[] is = new int[1 + aClass430Array11006.length];
	    System.arraycopy(aClass430Array11006, 0, class430s, 0,
			     aClass430Array11006.length);
	    System.arraycopy(aFloatArray11004, 0, fs, 0,
			     aClass430Array11006.length);
	    System.arraycopy(anIntArray11008, 0, is, 0,
			     aClass430Array11006.length);
	    aClass430Array11006 = class430s;
	    aFloatArray11004 = fs;
	    anIntArray11008 = is;
	    aClass430Array11006[aClass430Array11006.length - 1] = class430;
	    aFloatArray11004[aFloatArray11004.length - 1] = f;
	    anIntArray11008[anIntArray11008.length - 1] = i;
	}
    }
    
    public Class446 method14293() {
	return method14281((byte) -91);
    }
    
    public Class446 method14294() {
	return method14281((byte) -20);
    }
    
    public Class446 method14295() {
	return method14281((byte) -103);
    }
    
    public void method14300(Class291 class291, Class444 class444, int i,
			    int i_16_, float f) {
	double[] ds = aClass309_8791.method5487(-1175158890);
	ds[0] -= (double) i;
	ds[2] -= (double) i_16_;
	double[] ds_17_ = method17387((byte) -113);
	ds_17_[0] -= (double) i;
	ds_17_[2] -= (double) i_16_;
	ds[1] *= -1.0;
	ds_17_[1] *= -1.0;
	Class446 class446 = Class446.method7207();
	class446.aFloat4895 = (float) (ds_17_[0] - ds[0]);
	class446.aFloat4896 = (float) (ds_17_[1] - ds[1]);
	class446.aFloat4897 = (float) (ds_17_[2] - ds[2]);
	class446.method7220();
	Class429 class429 = new Class429();
	class429.method6810(class446, f);
	Class446 class446_18_ = Class446.method7208(0.0F, 1.0F, 0.0F);
	Class446 class446_19_ = Class446.method7229(class446, class446_18_);
	class446_18_ = Class446.method7229(class446_19_, class446);
	class446_18_.method7239(class429);
	class444.method7187(ds[0], ds[1], ds[2], ds_17_[0], ds_17_[1],
			    ds_17_[2], class446_18_.aFloat4895,
			    class446_18_.aFloat4896, class446_18_.aFloat4897);
	class446_18_.method7260();
    }
    
    public void method14296(RSBuffer class525_sub38) {
	aFloat11007 = 0.0F;
	aFloat11003 = 0.0F;
	anInt11005 = 0;
	int i = class525_sub38.readUnsignedByte(1826887241);
	aClass430Array11006 = new Class430[i];
	aFloatArray11004 = new float[i];
	for (int i_20_ = 0; i_20_ < i; i_20_++) {
	    aClass430Array11006[i_20_] = new Class430(class525_sub38);
	    aFloatArray11004[i_20_] = class525_sub38.method16634(-349423319);
	}
	method17383(class525_sub38, i, -1602993520);
    }
    
    public void method14297(float f) {
	Class430 class430 = aClass430Array11006[-1743813433 * anInt11005];
	if (aFloatArray11004[anInt11005 * -1743813433] > 0.0F) {
	    if (aFloatArray11004[-1743813433 * anInt11005] >= f) {
		aFloatArray11004[anInt11005 * -1743813433] -= f;
		return;
	    }
	    f -= aFloatArray11004[anInt11005 * -1743813433];
	    aFloatArray11004[anInt11005 * -1743813433] = 0.0F;
	}
	float f_21_ = 1.0F / (float) Class424.method6768(1684836768);
	while (f > 0.0F) {
	    float f_22_ = class430.method6886();
	    if (aFloat11007 >= f_22_) {
		if (aClass430Array11006.length == anInt11005 * -1743813433 + 1)
		    break;
		if (aFloatArray11004[1 + -1743813433 * anInt11005] >= f) {
		    aFloatArray11004[1 + -1743813433 * anInt11005] -= f;
		    break;
		}
		anInt11005 += -233440009;
		f -= aFloatArray11004[-1743813433 * anInt11005];
		aFloatArray11004[-1743813433 * anInt11005] = 0.0F;
		method17382((byte) 1);
		aFloat11007 = 0.0F;
		aFloat11003 = 0.0F;
		class430 = aClass430Array11006[-1743813433 * anInt11005];
		f_22_ = class430.method6886();
	    }
	    while (f > 0.0F && aFloat11007 < f_22_) {
		aFloat11003 = method17391(f_22_, aFloat11003,
					  Math.min(f, f_21_), -1005686486);
		f -= f_21_;
		method17379(aFloat11003, f_22_, -1292711730);
	    }
	}
    }
    
    public void method14298(float f) {
	Class430 class430 = aClass430Array11006[-1743813433 * anInt11005];
	if (aFloatArray11004[anInt11005 * -1743813433] > 0.0F) {
	    if (aFloatArray11004[-1743813433 * anInt11005] >= f) {
		aFloatArray11004[anInt11005 * -1743813433] -= f;
		return;
	    }
	    f -= aFloatArray11004[anInt11005 * -1743813433];
	    aFloatArray11004[anInt11005 * -1743813433] = 0.0F;
	}
	float f_23_ = 1.0F / (float) Class424.method6768(1684836768);
	while (f > 0.0F) {
	    float f_24_ = class430.method6886();
	    if (aFloat11007 >= f_24_) {
		if (aClass430Array11006.length == anInt11005 * -1743813433 + 1)
		    break;
		if (aFloatArray11004[1 + -1743813433 * anInt11005] >= f) {
		    aFloatArray11004[1 + -1743813433 * anInt11005] -= f;
		    break;
		}
		anInt11005 += -233440009;
		f -= aFloatArray11004[-1743813433 * anInt11005];
		aFloatArray11004[-1743813433 * anInt11005] = 0.0F;
		method17382((byte) 1);
		aFloat11007 = 0.0F;
		aFloat11003 = 0.0F;
		class430 = aClass430Array11006[-1743813433 * anInt11005];
		f_24_ = class430.method6886();
	    }
	    while (f > 0.0F && aFloat11007 < f_24_) {
		aFloat11003 = method17391(f_24_, aFloat11003,
					  Math.min(f, f_23_), -1005686486);
		f -= f_23_;
		method17379(aFloat11003, f_24_, -1977294369);
	    }
	}
    }
    
    public void method14288(float f) {
	Class430 class430 = aClass430Array11006[-1743813433 * anInt11005];
	if (aFloatArray11004[anInt11005 * -1743813433] > 0.0F) {
	    if (aFloatArray11004[-1743813433 * anInt11005] >= f) {
		aFloatArray11004[anInt11005 * -1743813433] -= f;
		return;
	    }
	    f -= aFloatArray11004[anInt11005 * -1743813433];
	    aFloatArray11004[anInt11005 * -1743813433] = 0.0F;
	}
	float f_25_ = 1.0F / (float) Class424.method6768(1684836768);
	while (f > 0.0F) {
	    float f_26_ = class430.method6886();
	    if (aFloat11007 >= f_26_) {
		if (aClass430Array11006.length == anInt11005 * -1743813433 + 1)
		    break;
		if (aFloatArray11004[1 + -1743813433 * anInt11005] >= f) {
		    aFloatArray11004[1 + -1743813433 * anInt11005] -= f;
		    break;
		}
		anInt11005 += -233440009;
		f -= aFloatArray11004[-1743813433 * anInt11005];
		aFloatArray11004[-1743813433 * anInt11005] = 0.0F;
		method17382((byte) 1);
		aFloat11007 = 0.0F;
		aFloat11003 = 0.0F;
		class430 = aClass430Array11006[-1743813433 * anInt11005];
		f_26_ = class430.method6886();
	    }
	    while (f > 0.0F && aFloat11007 < f_26_) {
		aFloat11003 = method17391(f_26_, aFloat11003,
					  Math.min(f, f_25_), -1005686486);
		f -= f_25_;
		method17379(aFloat11003, f_26_, -1192146547);
	    }
	}
    }
    
    public Class446 method14292() {
	Class446 class446 = Class446.method7207();
	double[] ds = aClass430Array11006[-1743813433 * anInt11005]
			  .method6887(aFloat11007);
	class446.aFloat4895 = (float) ds[0];
	class446.aFloat4896 = (float) ds[1];
	class446.aFloat4897 = (float) ds[2];
	return class446;
    }
    
    public Class446 method14290() {
	Class446 class446 = Class446.method7207();
	double[] ds = aClass430Array11006[-1743813433 * anInt11005]
			  .method6887(aFloat11007);
	class446.aFloat4895 = (float) ds[0];
	class446.aFloat4896 = (float) ds[1];
	class446.aFloat4897 = (float) ds[2];
	return class446;
    }
    
    public void method17389(Class430 class430, int i, float f) {
	if (aClass430Array11006 == null) {
	    aClass430Array11006 = new Class430[] { class430 };
	    aFloatArray11004 = new float[] { f };
	    anIntArray11008 = new int[] { i };
	} else {
	    Class430[] class430s
		= new Class430[1 + aClass430Array11006.length];
	    float[] fs = new float[aClass430Array11006.length + 1];
	    int[] is = new int[1 + aClass430Array11006.length];
	    System.arraycopy(aClass430Array11006, 0, class430s, 0,
			     aClass430Array11006.length);
	    System.arraycopy(aFloatArray11004, 0, fs, 0,
			     aClass430Array11006.length);
	    System.arraycopy(anIntArray11008, 0, is, 0,
			     aClass430Array11006.length);
	    aClass430Array11006 = class430s;
	    aFloatArray11004 = fs;
	    anIntArray11008 = is;
	    aClass430Array11006[aClass430Array11006.length - 1] = class430;
	    aFloatArray11004[aFloatArray11004.length - 1] = f;
	    anIntArray11008[anIntArray11008.length - 1] = i;
	}
    }
    
    void method17390(float f, float f_27_) {
	aFloat11007 += f;
	if (aFloat11007 > f_27_)
	    aFloat11007 = f_27_;
    }
    
    abstract float method17391(float f, float f_28_, float f_29_, int i);
    
    double[] method17392() {
	return aClass430Array11006[anInt11005 * -1743813433]
		   .method6887(aFloat11007);
    }
    
    double[] method17393() {
	return aClass430Array11006[anInt11005 * -1743813433]
		   .method6887(aFloat11007);
    }
    
    static final void method17394(Class683 class683, short i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class556.anInt7483 + Class144_Sub1.anInt9141 * 1318111247;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class696_Sub13.anInt10912 * 1586604897 + Class556.anInt7484;
    }
    
    static void method17395(byte[] is, byte i) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	for (;;) {
	    int i_30_ = class525_sub38.readUnsignedByte(1722987759);
	    if (i_30_ == 0)
		break;
	    if (1 == i_30_) {
		int i_31_ = class525_sub38.readUnsignedShort((byte) 126);
		Class40_Sub20.aClass217_11050.method4050(i_31_, 835076452);
	    }
	}
    }
}
