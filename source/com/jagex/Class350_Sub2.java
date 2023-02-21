/* Class350_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class350_Sub2 extends Class350
{
    int anInt10218 = 0;
    float[] aFloatArray10219;
    int[] anIntArray10220;
    float aFloat10221 = 0.0F;
    Class430[] aClass430Array10222;
    float aFloat10223 = 0.0F;
    public static Class458 aClass458_10224;
    static int anInt10225;
    
    public Class525_Sub28 method6141() {
	Class446 class446 = method6131(-1246745603);
	return new Class525_Sub28(0, (int) class446.aFloat4895,
				  (int) class446.aFloat4896,
				  (int) class446.aFloat4897);
    }
    
    public void method15850(Class430 class430, int i, float f, int i_0_) {
	if (null == aClass430Array10222) {
	    aClass430Array10222 = new Class430[] { class430 };
	    aFloatArray10219 = new float[] { f };
	    anIntArray10220 = new int[] { i };
	} else {
	    Class430[] class430s
		= new Class430[1 + aClass430Array10222.length];
	    float[] fs = new float[aClass430Array10222.length + 1];
	    int[] is = new int[1 + aClass430Array10222.length];
	    System.arraycopy(aClass430Array10222, 0, class430s, 0,
			     aClass430Array10222.length);
	    System.arraycopy(aFloatArray10219, 0, fs, 0,
			     aClass430Array10222.length);
	    System.arraycopy(anIntArray10220, 0, is, 0,
			     aClass430Array10222.length);
	    aClass430Array10222 = class430s;
	    aFloatArray10219 = fs;
	    anIntArray10220 = is;
	    aClass430Array10222[aClass430Array10222.length - 1] = class430;
	    aFloatArray10219[aFloatArray10219.length - 1] = f;
	    anIntArray10220[anIntArray10220.length - 1] = i;
	}
    }
    
    void method15851(float f, float f_1_, int i) {
	aFloat10221 += f;
	if (aFloat10221 > f_1_)
	    aFloat10221 = f_1_;
    }
    
    abstract void method15852(RSBuffer class525_sub38, int i, int i_2_);
    
    abstract void method15853();
    
    abstract void method15854(int i);
    
    public boolean method6130(int i) {
	return null != aClass430Array10222;
    }
    
    public Class446 method6131(int i) {
	Class446 class446 = Class446.method7207();
	double[] ds = aClass430Array10222[anInt10218 * 1653208979]
			  .method6887(aFloat10221);
	class446.aFloat4895 = (float) ds[0];
	class446.aFloat4896 = (float) ds[1];
	class446.aFloat4897 = (float) ds[2];
	return class446;
    }
    
    public double[] method6132(int i) {
	return aClass430Array10222[anInt10218 * 1653208979]
		   .method6887(aFloat10221);
    }
    
    public Class525_Sub28 method6133(byte i) {
	Class446 class446 = method6131(-1051548394);
	return new Class525_Sub28(0, (int) class446.aFloat4895,
				  (int) class446.aFloat4896,
				  (int) class446.aFloat4897);
    }
    
    public float method15855(int i) {
	return aClass430Array10222[anInt10218 * 1653208979]
		   .method6888(aFloat10221);
    }
    
    public float method6134(int i) {
	return aClass430Array10222[1653208979 * anInt10218]
		   .method6884(aFloat10221);
    }
    
    public float method6149() {
	return aClass430Array10222[1653208979 * anInt10218]
		   .method6884(aFloat10221);
    }
    
    public void method6145(RSBuffer class525_sub38, int i) {
	aFloat10221 = 0.0F;
	aFloat10223 = 0.0F;
	anInt10218 = 0;
	int i_3_ = class525_sub38.readUnsignedByte(1624782510);
	aClass430Array10222 = new Class430[i_3_];
	aFloatArray10219 = new float[i_3_];
	for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
	    aClass430Array10222[i_4_] = new Class430(class525_sub38);
	    aFloatArray10219[i_4_] = class525_sub38.method16634(-784518074);
	}
	method15852(class525_sub38, i_3_, 1477060434);
    }
    
    public boolean method6152() {
	return null != aClass430Array10222;
    }
    
    public void method6129(float f, int[][][] is, Class475 class475, int i,
			   int i_5_, int i_6_) {
	Class430 class430 = aClass430Array10222[1653208979 * anInt10218];
	if (aFloatArray10219[1653208979 * anInt10218] > 0.0F) {
	    if (aFloatArray10219[anInt10218 * 1653208979] >= f) {
		aFloatArray10219[1653208979 * anInt10218] -= f;
		return;
	    }
	    f -= aFloatArray10219[1653208979 * anInt10218];
	    aFloatArray10219[1653208979 * anInt10218] = 0.0F;
	}
	float f_7_ = 1.0F / (float) Class424.method6768(1684836768);
	while (f > 0.0F) {
	    float f_8_ = class430.method6886();
	    if (aFloat10221 >= f_8_) {
		if (aClass430Array10222.length == 1 + anInt10218 * 1653208979)
		    break;
		if (aFloatArray10219[1 + anInt10218 * 1653208979] >= f) {
		    aFloatArray10219[1653208979 * anInt10218 + 1] -= f;
		    break;
		}
		anInt10218 += 1332264603;
		f -= aFloatArray10219[anInt10218 * 1653208979];
		aFloatArray10219[anInt10218 * 1653208979] = 0.0F;
		method15854(1209882346);
		aFloat10221 = 0.0F;
		aFloat10223 = 0.0F;
		class430 = aClass430Array10222[anInt10218 * 1653208979];
		f_8_ = class430.method6886();
	    }
	    while (f > 0.0F && aFloat10221 < f_8_) {
		aFloat10223 = method15862(f_8_, aFloat10223, Math.min(f, f_7_),
					  -34045778);
		f -= f_7_;
		method15851(aFloat10223, f_8_, -54267152);
	    }
	}
    }
    
    abstract float method15856(float f, float f_9_, float f_10_);
    
    abstract float method15857(float f, float f_11_, float f_12_);
    
    abstract void method15858();
    
    public void method6137(float f, int[][][] is, Class475 class475, int i,
			   int i_13_) {
	Class430 class430 = aClass430Array10222[1653208979 * anInt10218];
	if (aFloatArray10219[1653208979 * anInt10218] > 0.0F) {
	    if (aFloatArray10219[anInt10218 * 1653208979] >= f) {
		aFloatArray10219[1653208979 * anInt10218] -= f;
		return;
	    }
	    f -= aFloatArray10219[1653208979 * anInt10218];
	    aFloatArray10219[1653208979 * anInt10218] = 0.0F;
	}
	float f_14_ = 1.0F / (float) Class424.method6768(1684836768);
	while (f > 0.0F) {
	    float f_15_ = class430.method6886();
	    if (aFloat10221 >= f_15_) {
		if (aClass430Array10222.length == 1 + anInt10218 * 1653208979)
		    break;
		if (aFloatArray10219[1 + anInt10218 * 1653208979] >= f) {
		    aFloatArray10219[1653208979 * anInt10218 + 1] -= f;
		    break;
		}
		anInt10218 += 1332264603;
		f -= aFloatArray10219[anInt10218 * 1653208979];
		aFloatArray10219[anInt10218 * 1653208979] = 0.0F;
		method15854(2099375933);
		aFloat10221 = 0.0F;
		aFloat10223 = 0.0F;
		class430 = aClass430Array10222[anInt10218 * 1653208979];
		f_15_ = class430.method6886();
	    }
	    while (f > 0.0F && aFloat10221 < f_15_) {
		aFloat10223 = method15862(f_15_, aFloat10223,
					  Math.min(f, f_14_), -34045778);
		f -= f_14_;
		method15851(aFloat10223, f_15_, -1992217834);
	    }
	}
    }
    
    abstract void method15859();
    
    abstract void method15860();
    
    abstract void method15861(RSBuffer class525_sub38, int i);
    
    public void method6138(Class291 class291, int i, int i_16_) {
	Class446 class446 = method6131(-419661967);
	class291.anInt3219 = 505543655 * ((int) class446.aFloat4895 - i);
	class291.anInt3220 = (int) -class446.aFloat4896 * -416553419;
	class291.anInt3218 = 981552359 * ((int) class446.aFloat4897 - i_16_);
    }
    
    public void method6136(float f, int[][][] is, Class475 class475, int i,
			   int i_17_) {
	Class430 class430 = aClass430Array10222[1653208979 * anInt10218];
	if (aFloatArray10219[1653208979 * anInt10218] > 0.0F) {
	    if (aFloatArray10219[anInt10218 * 1653208979] >= f) {
		aFloatArray10219[1653208979 * anInt10218] -= f;
		return;
	    }
	    f -= aFloatArray10219[1653208979 * anInt10218];
	    aFloatArray10219[1653208979 * anInt10218] = 0.0F;
	}
	float f_18_ = 1.0F / (float) Class424.method6768(1684836768);
	while (f > 0.0F) {
	    float f_19_ = class430.method6886();
	    if (aFloat10221 >= f_19_) {
		if (aClass430Array10222.length == 1 + anInt10218 * 1653208979)
		    break;
		if (aFloatArray10219[1 + anInt10218 * 1653208979] >= f) {
		    aFloatArray10219[1653208979 * anInt10218 + 1] -= f;
		    break;
		}
		anInt10218 += 1332264603;
		f -= aFloatArray10219[anInt10218 * 1653208979];
		aFloatArray10219[anInt10218 * 1653208979] = 0.0F;
		method15854(134589422);
		aFloat10221 = 0.0F;
		aFloat10223 = 0.0F;
		class430 = aClass430Array10222[anInt10218 * 1653208979];
		f_19_ = class430.method6886();
	    }
	    while (f > 0.0F && aFloat10221 < f_19_) {
		aFloat10223 = method15862(f_19_, aFloat10223,
					  Math.min(f, f_18_), -34045778);
		f -= f_18_;
		method15851(aFloat10223, f_19_, 1259092075);
	    }
	}
    }
    
    abstract float method15862(float f, float f_20_, float f_21_, int i);
    
    public boolean method6148() {
	return null != aClass430Array10222;
    }
    
    public void method6139(Class291 class291, int i, int i_22_) {
	Class446 class446 = method6131(-488724010);
	class291.anInt3219 = 505543655 * ((int) class446.aFloat4895 - i);
	class291.anInt3220 = (int) -class446.aFloat4896 * -416553419;
	class291.anInt3218 = 981552359 * ((int) class446.aFloat4897 - i_22_);
    }
    
    public Class446 method6128() {
	Class446 class446 = Class446.method7207();
	double[] ds = aClass430Array10222[anInt10218 * 1653208979]
			  .method6887(aFloat10221);
	class446.aFloat4895 = (float) ds[0];
	class446.aFloat4896 = (float) ds[1];
	class446.aFloat4897 = (float) ds[2];
	return class446;
    }
    
    public double[] method6142() {
	return aClass430Array10222[anInt10218 * 1653208979]
		   .method6887(aFloat10221);
    }
    
    public double[] method6143() {
	return aClass430Array10222[anInt10218 * 1653208979]
		   .method6887(aFloat10221);
    }
    
    public Class525_Sub28 method6144() {
	Class446 class446 = method6131(-954873748);
	return new Class525_Sub28(0, (int) class446.aFloat4895,
				  (int) class446.aFloat4896,
				  (int) class446.aFloat4897);
    }
    
    public void method6135(Class291 class291, int i, int i_23_, int i_24_) {
	Class446 class446 = method6131(-518904850);
	class291.anInt3219 = 505543655 * ((int) class446.aFloat4895 - i);
	class291.anInt3220 = (int) -class446.aFloat4896 * -416553419;
	class291.anInt3218 = 981552359 * ((int) class446.aFloat4897 - i_23_);
    }
    
    public Class525_Sub28 method6146() {
	Class446 class446 = method6131(-1358775492);
	return new Class525_Sub28(0, (int) class446.aFloat4895,
				  (int) class446.aFloat4896,
				  (int) class446.aFloat4897);
    }
    
    public float method6147() {
	return aClass430Array10222[1653208979 * anInt10218]
		   .method6884(aFloat10221);
    }
    
    public void method6150(RSBuffer class525_sub38) {
	aFloat10221 = 0.0F;
	aFloat10223 = 0.0F;
	anInt10218 = 0;
	int i = class525_sub38.readUnsignedByte(64191682);
	aClass430Array10222 = new Class430[i];
	aFloatArray10219 = new float[i];
	for (int i_25_ = 0; i_25_ < i; i_25_++) {
	    aClass430Array10222[i_25_] = new Class430(class525_sub38);
	    aFloatArray10219[i_25_] = class525_sub38.method16634(-907147131);
	}
	method15852(class525_sub38, i, 1096108332);
    }
    
    public float method6153() {
	return aClass430Array10222[1653208979 * anInt10218]
		   .method6884(aFloat10221);
    }
    
    public Class446 method6140() {
	Class446 class446 = Class446.method7207();
	double[] ds = aClass430Array10222[anInt10218 * 1653208979]
			  .method6887(aFloat10221);
	class446.aFloat4895 = (float) ds[0];
	class446.aFloat4896 = (float) ds[1];
	class446.aFloat4897 = (float) ds[2];
	return class446;
    }
    
    public void method6151(Class291 class291, int i, int i_26_) {
	Class446 class446 = method6131(-1182379287);
	class291.anInt3219 = 505543655 * ((int) class446.aFloat4895 - i);
	class291.anInt3220 = (int) -class446.aFloat4896 * -416553419;
	class291.anInt3218 = 981552359 * ((int) class446.aFloat4897 - i_26_);
    }
    
    abstract float method15863(float f, float f_27_, float f_28_);
    
    public void method15864(Class430 class430, int i, float f) {
	if (null == aClass430Array10222) {
	    aClass430Array10222 = new Class430[] { class430 };
	    aFloatArray10219 = new float[] { f };
	    anIntArray10220 = new int[] { i };
	} else {
	    Class430[] class430s
		= new Class430[1 + aClass430Array10222.length];
	    float[] fs = new float[aClass430Array10222.length + 1];
	    int[] is = new int[1 + aClass430Array10222.length];
	    System.arraycopy(aClass430Array10222, 0, class430s, 0,
			     aClass430Array10222.length);
	    System.arraycopy(aFloatArray10219, 0, fs, 0,
			     aClass430Array10222.length);
	    System.arraycopy(anIntArray10220, 0, is, 0,
			     aClass430Array10222.length);
	    aClass430Array10222 = class430s;
	    aFloatArray10219 = fs;
	    anIntArray10220 = is;
	    aClass430Array10222[aClass430Array10222.length - 1] = class430;
	    aFloatArray10219[aFloatArray10219.length - 1] = f;
	    anIntArray10220[anIntArray10220.length - 1] = i;
	}
    }
    
    public float method15865() {
	return aClass430Array10222[anInt10218 * 1653208979]
		   .method6888(aFloat10221);
    }
    
    Class350_Sub2(Class309 class309) {
	super(class309);
    }
    
    void method15866(float f, float f_29_) {
	aFloat10221 += f;
	if (aFloat10221 > f_29_)
	    aFloat10221 = f_29_;
    }
    
    static final void method15867(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	client.aShort11348
	    = (short) class683.anIntArray8661[501271953 * class683.anInt8662];
	if (client.aShort11348 <= 0)
	    client.aShort11348 = (short) 256;
	client.aShort11349 = (short) (class683.anIntArray8661
				      [class683.anInt8662 * 501271953 + 1]);
	if (client.aShort11349 <= 0)
	    client.aShort11349 = (short) 205;
    }
}
