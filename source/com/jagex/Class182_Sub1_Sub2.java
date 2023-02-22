/* Class182_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

import jaclib.memory.Stream;

import jaggl.MapBuffer;
import jaggl.OpenGL;

public final class Class182_Sub1_Sub2 extends Class182_Sub1
{
    int[] anIntArray11483;
    Class709 aClass709_11484 = new Class709();
    Class709 aClass709_11485 = new Class709();
    Class709 aClass709_11486 = new Class709();
    Class709 aClass709_11487 = new Class709();
    int anInt11488;
    Class709 aClass709_11489;
    Class709 aClass709_11490;
    String aString11491;
    int[] anIntArray11492;
    boolean aBool11493;
    boolean aBool11494;
    Class273_Sub2 aClass273_Sub2_11495;
    boolean aBool11496;
    Class487_Sub2[] aClass487_Sub2Array11497;
    int anInt11498;
    Class487_Sub1 aClass487_Sub1_11499;
    long aLong11500;
    static final int anInt11501 = 3;
    int[] anIntArray11502;
    String aString11503;
    boolean aBool11504;
    boolean aBool11505;
    boolean aBool11506;
    boolean aBool11507;
    boolean aBool11508;
    boolean aBool11509;
    boolean aBool11510;
    boolean aBool11511;
    int anInt11512;
    boolean aBool11513;
    boolean aBool11514;
    float[] aFloatArray11515;
    float[] aFloatArray11516;
    Class709 aClass709_11517 = new Class709();
    Class157 aClass157_11518;
    Class157 aClass157_11519;
    Class168_Sub2 aClass168_Sub2_11520;
    OpenGL anOpenGL11521;
    long[] aLongArray11522;
    int[] anIntArray11523;
    int anInt11524;
    int anInt11525;
    
    public Interface22 method3512(int i, int i_0_) {
	return new Class520(this, Class165.aClass165_1774,
			    Class178.aClass178_1913, i, i_0_);
    }
    
    static final int method18099(Class178 class178) {
	switch (class178.anInt1910 * -1868954147) {
	case 8:
	    return 5125;
	case 3:
	    return 5124;
	case 7:
	    return 5122;
	case 5:
	    return 5126;
	default:
	    return 5121;
	case 4:
	    return 5123;
	case 0:
	    return 5120;
	case 1:
	    return 5131;
	case 2:
	    return 5121;
	}
    }
    
    public boolean method14657() {
	return aBool11508;
    }
    
    public void method3276() {
	OpenGL.glFinish();
    }
    
    public boolean method14656(boolean bool) {
	return true;
    }
    
    public void method14700(Class435 class435) {
	float[] fs = class435.aFloatArray4830;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    void method15015() {
	if (aBool9281 && aBool9203 && anInt9283 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    public Class170 method3130() {
	int i = -1;
	if (aString11491.indexOf("nvidia") != -1)
	    i = 4318;
	else if (aString11491.indexOf("intel") != -1)
	    i = 32902;
	else if (aString11491.indexOf("ati") != -1)
	    i = 4098;
	return new Class170(i, method14813() ? "OpenGL FF" : "OpenGL",
			    anInt11488, aString11503, 0L, method14813());
    }
    
    void method3267(int i, int i_1_) throws Exception_Sub4 {
	aClass168_Sub1_1959.method14606();
	if (anInterface24_1943 != null)
	    anInterface24_1943.method133((byte) -92);
    }
    
    final synchronized void method18100(int i, int i_2_) {
	Class525_Sub42 class525_sub42 = new Class525_Sub42(i_2_);
	class525_sub42.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11486.method14345(class525_sub42, (byte) 0);
    }
    
    public void method3336(boolean bool) {
	/* empty */
    }
    
    public float method14674() {
	return 0.0F;
    }
    
    Class168_Sub1 method3536(Canvas canvas, int i, int i_3_) {
	return new Class168_Sub1_Sub2_Sub2(this, canvas);
    }
    
    void method14917() {
	if (aBool9225 && !aBool9227)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    public Interface21 method3168(int i, int i_4_, Class165 class165,
				  Class178 class178, int i_5_) {
	return new Class520(this, class165, class178, i, i_4_, i_5_);
    }
    
    Interface38 method15043(Class165 class165, Class178 class178, int i,
			    int i_6_) {
	return method14728(class165, class178, i, i_6_);
    }
    
    public Interface22 method3164(int i, int i_7_, int i_8_) {
	return new Class520(this, Class165.aClass165_1774,
			    Class178.aClass178_1913, i, i_7_, i_8_);
    }
    
    public int[] method3165(int i, int i_9_, int i_10_, int i_11_) {
	int[] is = new int[i_10_ * i_11_];
	int i_12_ = aClass168_1966.method2711();
	for (int i_13_ = 0; i_13_ < i_11_; i_13_++)
	    OpenGL.glReadPixelsi(i, i_12_ - i_9_ - i_13_ - 1, i_10_, 1, 32993,
				 anInt11512, is, i_13_ * i_10_);
	return is;
    }
    
    public void method3166() {
	if (aClass168_1966 != null) {
	    int i = aClass168_1966.method2710();
	    int i_14_ = aClass168_1966.method2711();
	    if (i > 0 || i_14_ > 0) {
		int i_15_ = anInt9268;
		int i_16_ = anInt9258;
		int i_17_ = anInt9250;
		int i_18_ = anInt9285;
		method3580();
		int i_19_ = anInt9209;
		int i_20_ = anInt9210;
		int i_21_ = anInt9319;
		int i_22_ = anInt9264;
		method3480();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method14904();
		method14756(false);
		method14713(false);
		method14807(false);
		method14710(false);
		method14731(null);
		method14800(1);
		method14779(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_14_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method3184(i_19_, i_21_, i_20_, i_22_);
		method3277(i_15_, i_16_, i_17_, i_18_);
	    }
	}
    }
    
    public boolean method3167() {
	return aBool11513;
    }
    
    public boolean method3324() {
	if (aBool11513 && aLongArray11522[anInt11525] != 0L)
	    return false;
	return true;
    }
    
    public boolean method3169() {
	return true;
    }
    
    public boolean method3170() {
	return false;
    }
    
    public int method3171() {
	if (aBool11513) {
	    if (aLongArray11522[anInt11524] == 0L)
		return -1;
	    int i = OpenGL.glClientWaitSync(aLongArray11522[anInt11524], 0, 0);
	    if (i == 37149) {
		method3401();
		return -1;
	    }
	    return i != 37147 ? anIntArray11523[anInt11524] : -1;
	}
	return -1;
    }
    
    public void method3173(int i, int i_23_, int i_24_) {
	method3219();
	if (aClass168_Sub2_11520 == null)
	    method18121(i_23_, i_24_);
	if (aClass157_11518 == null)
	    aClass157_11518 = method3217(0, 0, aClass168_1966.method2710(),
					 aClass168_1966.method2711(), false);
	else
	    aClass157_11518.method2540(0, 0, aClass168_1966.method2710(),
				       aClass168_1966.method2711(), 0, 0);
	method3158(aClass168_Sub2_11520, -1166817212);
	method3188(1, -16777216);
	aClass157_11518.method2481(anInt1958 * 1000431205,
				   anInt1964 * 1482704485,
				   anInt1935 * -1588334531,
				   anInt1967 * -863940247);
	OpenGL.glBindBufferARB(35051, anIntArray11502[anInt11525]);
	OpenGL.glReadPixelsub(0, 0, anInt1962 * -1079316541,
			      anInt1963 * -1736975045, 32993, 5121, null, 0);
	OpenGL.glBindBufferARB(35051, 0);
	method3159(aClass168_Sub2_11520, -1876999470);
	aLongArray11522[anInt11525] = OpenGL.glFenceSync(37143, 0);
	anIntArray11523[anInt11525] = i;
	if (++anInt11525 >= 3)
	    anInt11525 = 0;
	method3161();
    }
    
    public void method3401() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11522[i] != 0L) {
		OpenGL.glDeleteSync(aLongArray11522[i]);
		aLongArray11522[i] = 0L;
	    }
	}
	anInt11525 = 0;
	anInt11524 = 0;
    }
    
    Interface42 method14957(Class165 class165, Class178 class178, int i,
			    int i_25_) {
	return new Class490_Sub3(this, class165, class178, i, i_25_);
    }
    
    void method15044() {
	if (aBool9225 && !aBool9227)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    byte[] method18101(String string) {
	return method14661("gl", string);
    }
    
    public void method3552(long l) {
	if (l != 0L) {
	    if (OpenGL.glUnmapBufferARB(35051)) {
		/* empty */
	    }
	    OpenGL.glBindBufferARB(35051, 0);
	}
    }
    
    public void method3178() {
	if (aBool11513) {
	    aClass157_11518 = null;
	    if (aClass168_Sub2_11520 != null) {
		aClass168_Sub2_11520.method127();
		aClass168_Sub2_11520 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, anIntArray11502, 0);
	    for (int i = 0; i < 3; i++) {
		anIntArray11502[i] = 0;
		if (aLongArray11522[i] != 0L) {
		    OpenGL.glDeleteSync(aLongArray11522[i]);
		    aLongArray11522[i] = 0L;
		}
	    }
	} else {
	    aClass168_Sub2_11520 = null;
	    aClass157_11519 = null;
	    aClass157_11518 = null;
	}
	anInt11525 = 0;
	anInt11524 = 0;
    }
    
    void method14714() {
	if (aBool9225 && !aBool9227)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    void method14926() {
	/* empty */
    }
    
    public void method3188(int i, int i_26_) {
	int i_27_ = 0;
	if ((i & 0x1) != 0) {
	    OpenGL.glClearColor((float) (i_26_ & 0xff0000) / 1.671168E7F,
				(float) (i_26_ & 0xff00) / 65280.0F,
				(float) (i_26_ & 0xff) / 255.0F,
				(float) (i_26_ >>> 24) / 255.0F);
	    i_27_ = 16384;
	}
	if ((i & 0x2) != 0) {
	    method14710(true);
	    i_27_ |= 0x100;
	}
	if ((i & 0x4) != 0)
	    i_27_ |= 0x400;
	OpenGL.glClear(i_27_);
    }
    
    void method15019() {
	if (aClass168_1966 != null)
	    OpenGL.glViewport(anInt9219 + anInt9268,
			      (anInt9224 + aClass168_1966.method2711()
			       - anInt9258 - anInt9285),
			      anInt9250, anInt9285);
	OpenGL.glDepthRange(aFloat9201, aFloat9202);
    }
    
    void method14689() {
	if (aClass168_1966 != null) {
	    int i = anInt9219 + anInt9209;
	    int i_28_ = anInt9224 + aClass168_1966.method2711() - anInt9264;
	    int i_29_ = anInt9210 - anInt9209;
	    int i_30_ = anInt9264 - anInt9319;
	    if (i_29_ < 0)
		i_29_ = 0;
	    if (i_30_ < 0)
		i_30_ = 0;
	    OpenGL.glScissor(i, i_28_, i_29_, i_30_);
	}
    }
    
    public void method14764(int i, Interface35 interface35) {
	aClass487_Sub2Array11497[i] = (Class487_Sub2) interface35;
    }
    
    public void method3577(int i, int i_31_, int[] is, int[] is_32_) {
	method18125(i, i_31_, is, is_32_);
    }
    
    static final int method18102(Class362 class362) {
	if (class362 == Class362.aClass362_3831)
	    return 7681;
	if (class362 == Class362.aClass362_3829)
	    return 8448;
	if (class362 == Class362.aClass362_3832)
	    return 34165;
	if (class362 == Class362.aClass362_3830)
	    return 260;
	if (class362 == Class362.aClass362_3833)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    void method14711() {
	if (aBool9223 && aBool9175)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    void method14712() {
	OpenGL.glDepthMask(aBool9221 && aBool9222);
    }
    
    Class168_Sub1 method3386(Canvas canvas, int i, int i_33_) {
	return new Class168_Sub1_Sub2_Sub2(this, canvas);
    }
    
    Interface38 method14820(Class165 class165, Class178 class178, int i,
			    int i_34_) {
	return method14728(class165, class178, i, i_34_);
    }
    
    void method14716() {
	aFloatArray11515[0] = aFloat9152 * aFloat9233;
	aFloatArray11515[1] = aFloat9152 * aFloat9299;
	aFloatArray11515[2] = aFloat9152 * aFloat9235;
	aFloatArray11515[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609, aFloatArray11515, 0);
	aFloatArray11515[0] = -aFloat9238 * aFloat9233;
	aFloatArray11515[1] = -aFloat9238 * aFloat9299;
	aFloatArray11515[2] = -aFloat9238 * aFloat9235;
	aFloatArray11515[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609, aFloatArray11515, 0);
    }
    
    void method14717() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass435_9173.aFloatArray4830, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9228, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9229, 0);
    }
    
    void method14732() {
	if (aBool9226) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    void method18103() {
	int i = 0;
	while (!anOpenGL11521.method1732()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class229.method4381(1000L);
	}
    }
    
    void method14702() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass435_9173.aFloatArray4830, 0);
	int i;
	for (i = 0; i < anInt9214; i++) {
	    Class525_Sub21 class525_sub21 = aClass525_Sub21Array9239[i];
	    int i_35_ = class525_sub21.method16298(-1791872480);
	    int i_36_ = 16386 + i;
	    float f = class525_sub21.method16306(-340782996) / 255.0F;
	    aFloatArray11515[0]
		= (float) class525_sub21.method16314(108081798);
	    aFloatArray11515[1]
		= (float) class525_sub21.method16312((short) 32154);
	    aFloatArray11515[2] = (float) class525_sub21.method16301((byte) 6);
	    aFloatArray11515[3] = 1.0F;
	    OpenGL.glLightfv(i_36_, 4611, aFloatArray11515, 0);
	    aFloatArray11515[0] = (float) (i_35_ >> 16 & 0xff) * f;
	    aFloatArray11515[1] = (float) (i_35_ >> 8 & 0xff) * f;
	    aFloatArray11515[2] = (float) (i_35_ & 0xff) * f;
	    aFloatArray11515[3] = 1.0F;
	    OpenGL.glLightfv(i_36_, 4609, aFloatArray11515, 0);
	    OpenGL.glLightf(i_36_, 4617,
			    (1.0F
			     / (float) (class525_sub21.method16332(1972108538)
					* class525_sub21
					      .method16332(1917972097))));
	    OpenGL.glEnable(i_36_);
	}
	for (/**/; i < anInt9241; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    void method15027(Interface44 interface44) {
	aClass487_Sub1_11499 = (Class487_Sub1) interface44;
	aClass487_Sub1_11499.method7864();
    }
    
    void method14666() {
	OpenGL.glDepthFunc(515);
	method18112();
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9305) {
	    method14936(anInt9294 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9300 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_37_ = 16384 + i;
	    OpenGL.glLightfv(i_37_, 4608, fs, 0);
	    OpenGL.glLightf(i_37_, 4615, 0.0F);
	    OpenGL.glLightf(i_37_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	anOpenGL11521.setSwapInterval(0);
	super.method14666();
    }
    
    final synchronized void method18104(int i) {
	Class525 class525 = new Class525();
	class525.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11489.method14345(class525, (byte) 0);
    }
    
    Interface38 method14726(int i, int i_38_, boolean bool, int[] is,
			    int i_39_, int i_40_) {
	return new Class490_Sub3(this, i, i_38_, bool, is, i_39_, i_40_);
    }
    
    Interface38 method14877(Class165 class165, int i, int i_41_, boolean bool,
			    byte[] is, int i_42_, int i_43_) {
	return new Class490_Sub3(this, class165, i, i_41_, bool, is, i_42_,
				 i_43_);
    }
    
    Interface38 method14908(Class165 class165, int i, int i_44_, boolean bool,
			    float[] fs, int i_45_, int i_46_) {
	return new Class490_Sub3(this, class165, i, i_44_, bool, fs, i_45_,
				 i_46_);
    }
    
    Interface42 method14728(Class165 class165, Class178 class178, int i,
			    int i_47_) {
	return new Class490_Sub3(this, class165, class178, i, i_47_);
    }
    
    Interface40 method14806(int i, boolean bool, int[][] is) {
	return new Class490_Sub2(this, i, bool, is);
    }
    
    Interface37 method14886(Class165 class165, int i, int i_48_, int i_49_,
			    boolean bool, byte[] is) {
	return new Class490_Sub1(this, class165, i, i_48_, i_49_, bool, is);
    }
    
    public void method14757() {
	int i = anIntArray11483[anInt9246];
	if (i != 0) {
	    anIntArray11483[anInt9246] = 0;
	    OpenGL.glBindTexture(i, 0);
	    OpenGL.glDisable(i);
	}
    }
    
    void method14745() {
	OpenGL.glMatrixMode(5890);
	if (aClass368Array9208[anInt9246] != Class368.aClass368_3866)
	    OpenGL.glLoadMatrixf(aClass435Array9248[anInt9246]
				     .method6974(aFloatArray11516),
				 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method14746() {
	OpenGL.glActiveTexture(33984 + anInt9246);
    }
    
    public void method14763(Class337 class337) {
	Class378[] class378s = class337.aClass378Array3630;
	int i = 0;
	boolean bool = false;
	boolean bool_50_ = false;
	boolean bool_51_ = false;
	for (int i_52_ = 0; i_52_ < class378s.length; i_52_++) {
	    Class378 class378 = class378s[i_52_];
	    Class487_Sub2 class487_sub2 = aClass487_Sub2Array11497[i_52_];
	    int i_53_ = 0;
	    int i_54_ = class487_sub2.method15795();
	    long l = class487_sub2.method7860();
	    class487_sub2.method7864();
	    for (int i_55_ = 0; i_55_ < class378.method6371(); i_55_++) {
		Class342 class342 = class378.method6372(i_55_);
		switch (class342.anInt3667) {
		case 2:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(1, 5126, i_54_, l + (long) i_53_);
		    break;
		case 0:
		    OpenGL.glVertexPointer(3, 5126, i_54_, l + (long) i_53_);
		    bool_51_ = true;
		    break;
		case 7:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(4, 5126, i_54_, l + (long) i_53_);
		    break;
		default:
		    break;
		case 8:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(3, 5126, i_54_, l + (long) i_53_);
		    break;
		case 5:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(2, 5126, i_54_, l + (long) i_53_);
		    break;
		case 11:
		    OpenGL.glNormalPointer(5126, i_54_, l + (long) i_53_);
		    bool_50_ = true;
		    break;
		case 3:
		    OpenGL.glColorPointer(4, 5121, i_54_, l + (long) i_53_);
		    bool = true;
		}
		i_53_ += class342.anInt3671;
	    }
	}
	if (aBool11504 != bool_51_) {
	    if (bool_51_)
		OpenGL.glEnableClientState(32884);
	    else
		OpenGL.glDisableClientState(32884);
	    aBool11504 = bool_51_;
	}
	if (aBool11493 != bool_50_) {
	    if (bool_50_)
		OpenGL.glEnableClientState(32885);
	    else
		OpenGL.glDisableClientState(32885);
	    aBool11493 = bool_50_;
	}
	if (aBool11494 != bool) {
	    if (bool)
		OpenGL.glEnableClientState(32886);
	    else
		OpenGL.glDisableClientState(32886);
	    aBool11494 = bool;
	}
	if (anInt11498 < i) {
	    for (int i_56_ = anInt11498; i_56_ < i; i_56_++) {
		OpenGL.glClientActiveTexture(33984 + i_56_);
		OpenGL.glEnableClientState(32888);
	    }
	    anInt11498 = i;
	} else if (anInt11498 > i) {
	    for (int i_57_ = i; i_57_ < anInt11498; i_57_++) {
		OpenGL.glClientActiveTexture(33984 + i_57_);
		OpenGL.glDisableClientState(32888);
	    }
	    anInt11498 = i;
	}
    }
    
    void method14815() {
	OpenGL.glTexEnvi(8960, 34162,
			 method18105(aClass362Array9317[anInt9246]));
    }
    
    final void method14673(int i, Class371 class371, boolean bool,
			   boolean bool_58_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method18115(class371));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_58_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_58_ ? 769 : 768);
    }
    
    final void method14737(int i, Class371 class371, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method18115(class371));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    final void method15023() {
	aFloatArray11515[0] = (float) (anInt9252 & 0xff0000) / 1.671168E7F;
	aFloatArray11515[1] = (float) (anInt9252 & 0xff00) / 65280.0F;
	aFloatArray11515[2] = (float) (anInt9252 & 0xff) / 255.0F;
	aFloatArray11515[3] = (float) (anInt9252 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705, aFloatArray11515, 0);
    }
    
    static final int method18105(Class362 class362) {
	if (class362 == Class362.aClass362_3831)
	    return 7681;
	if (class362 == Class362.aClass362_3829)
	    return 8448;
	if (class362 == Class362.aClass362_3832)
	    return 34165;
	if (class362 == Class362.aClass362_3830)
	    return 260;
	if (class362 == Class362.aClass362_3833)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    final Interface35 method14991(boolean bool) {
	return new Class487_Sub2(this, bool);
    }
    
    public Class266 method14660(String string) {
	byte[] is = method18123(string);
	if (is == null)
	    return null;
	Class262 class262 = method14865(is);
	return new Class266_Sub1(this, class262);
    }
    
    void method14754() {
	if (aBool9291)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9292 & 0xff) / 255.0F);
	if (anInt9294 > 1) {
	    if (aByte9292 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    void method14780() {
	if (aBool9309) {
	    int i = 0;
	    int i_59_ = 0;
	    if (anInt9288 == 0) {
		i = 0;
		i_59_ = 0;
	    } else if (anInt9288 == 1) {
		i = 1;
		i_59_ = 0;
	    } else if (anInt9288 == 2) {
		i = 1;
		i_59_ = 1;
	    } else if (anInt9288 == 3) {
		i = 0;
		i_59_ = 1;
	    }
	    if (aClass367_9289 == Class367.aClass367_3859)
		OpenGL.glBlendFuncSeparate(770, 771, i, i_59_);
	    else if (aClass367_9289 == Class367.aClass367_3860)
		OpenGL.glBlendFuncSeparate(1, 1, i, i_59_);
	    else if (aClass367_9289 == Class367.aClass367_3861)
		OpenGL.glBlendFuncSeparate(774, 1, i, i_59_);
	    else if (aClass367_9289 == Class367.aClass367_3863)
		OpenGL.glBlendFuncSeparate(1, 0, i, i_59_);
	} else if (aClass367_9289 == Class367.aClass367_3859) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(770, 771);
	} else if (aClass367_9289 == Class367.aClass367_3860) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(1, 1);
	} else if (aClass367_9289 == Class367.aClass367_3861) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(774, 1);
	} else
	    OpenGL.glDisable(3042);
    }
    
    void method14808() {
	if (aBool9290)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method18106() {
	int i = 0;
	while (!anOpenGL11521.method1732()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class229.method4381(1000L);
	}
    }
    
    public void method3342() {
	if (aBool11513) {
	    aClass157_11518 = null;
	    if (aClass168_Sub2_11520 != null) {
		aClass168_Sub2_11520.method127();
		aClass168_Sub2_11520 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, anIntArray11502, 0);
	    for (int i = 0; i < 3; i++) {
		anIntArray11502[i] = 0;
		if (aLongArray11522[i] != 0L) {
		    OpenGL.glDeleteSync(aLongArray11522[i]);
		    aLongArray11522[i] = 0L;
		}
	    }
	} else {
	    aClass168_Sub2_11520 = null;
	    aClass157_11519 = null;
	    aClass157_11518 = null;
	}
	anInt11525 = 0;
	anInt11524 = 0;
    }
    
    void method14889() {
	aFloat9218 = aFloat9206 - (float) anInt9284;
	aFloat9207 = aFloat9218 - (float) anInt9283;
	if (aFloat9207 < aFloat9237)
	    aFloat9207 = aFloat9237;
	if (aBool9156) {
	    OpenGL.glFogf(2915, aFloat9207);
	    OpenGL.glFogf(2916, aFloat9218);
	    aFloatArray11515[0] = (float) (anInt9282 & 0xff0000) / 1.671168E7F;
	    aFloatArray11515[1] = (float) (anInt9282 & 0xff00) / 65280.0F;
	    aFloatArray11515[2] = (float) (anInt9282 & 0xff) / 255.0F;
	    OpenGL.glFogfv(2918, aFloatArray11515, 0);
	}
    }
    
    void method14936(boolean bool) {
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    final Interface35 method14761(boolean bool) {
	return new Class487_Sub2(this, bool);
    }
    
    final Interface44 method14701(boolean bool) {
	return new Class487_Sub1(this, Class178.aClass178_1909, bool);
    }
    
    Class337 method14762(Class378[] class378s) {
	return new Class337_Sub1(class378s);
    }
    
    final synchronized void method18107(int i, int i_60_) {
	Class525_Sub42 class525_sub42 = new Class525_Sub42(i_60_);
	class525_sub42.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11485.method14345(class525_sub42, (byte) 0);
    }
    
    void method14765(Interface44 interface44) {
	aClass487_Sub1_11499 = (Class487_Sub1) interface44;
	aClass487_Sub1_11499.method7864();
    }
    
    public boolean method14899(boolean bool) {
	return true;
    }
    
    public final void method15003(Class373 class373, int i, int i_61_) {
	int i_62_;
	int i_63_;
	if (class373 == Class373.aClass373_3884) {
	    i_62_ = 1;
	    i_63_ = i_61_ * 2;
	} else if (class373 == Class373.aClass373_3889) {
	    i_62_ = 3;
	    i_63_ = i_61_ + 1;
	} else if (class373 == Class373.aClass373_3885) {
	    i_62_ = 4;
	    i_63_ = i_61_ * 3;
	} else if (class373 == Class373.aClass373_3887) {
	    i_62_ = 6;
	    i_63_ = i_61_ + 2;
	} else if (class373 == Class373.aClass373_3888) {
	    i_62_ = 5;
	    i_63_ = i_61_ + 2;
	} else {
	    i_62_ = 0;
	    i_63_ = i_61_;
	}
	OpenGL.glDrawArrays(i_62_, i, i_63_);
    }
    
    final void method14773(Interface44 interface44, Class373 class373, int i,
			   int i_64_, int i_65_, int i_66_) {
	int i_67_;
	int i_68_;
	if (class373 == Class373.aClass373_3884) {
	    i_67_ = 1;
	    i_68_ = i_66_ * 2;
	} else if (class373 == Class373.aClass373_3889) {
	    i_67_ = 3;
	    i_68_ = i_66_ + 1;
	} else if (class373 == Class373.aClass373_3885) {
	    i_67_ = 4;
	    i_68_ = i_66_ * 3;
	} else if (class373 == Class373.aClass373_3887) {
	    i_67_ = 6;
	    i_68_ = i_66_ + 2;
	} else if (class373 == Class373.aClass373_3888) {
	    i_67_ = 5;
	    i_68_ = i_66_ + 2;
	} else {
	    i_67_ = 0;
	    i_68_ = i_66_;
	}
	Class178 class178 = interface44.method326();
	Class487_Sub1 class487_sub1 = (Class487_Sub1) interface44;
	class487_sub1.method7864();
	OpenGL.glDrawElements(i_67_, i_68_, method18109(class178),
			      (class487_sub1.method7860()
			       + (long) (i_65_ * (class178.anInt1915
						  * -103623665))));
    }
    
    public final void method14697(Class373 class373, int i, int i_69_,
				  int i_70_, int i_71_) {
	int i_72_;
	int i_73_;
	if (class373 == Class373.aClass373_3884) {
	    i_72_ = 1;
	    i_73_ = i_71_ * 2;
	} else if (class373 == Class373.aClass373_3889) {
	    i_72_ = 3;
	    i_73_ = i_71_ + 1;
	} else if (class373 == Class373.aClass373_3885) {
	    i_72_ = 4;
	    i_73_ = i_71_ * 3;
	} else if (class373 == Class373.aClass373_3887) {
	    i_72_ = 6;
	    i_73_ = i_71_ + 2;
	} else if (class373 == Class373.aClass373_3888) {
	    i_72_ = 5;
	    i_73_ = i_71_ + 2;
	} else {
	    i_72_ = 0;
	    i_73_ = i_71_;
	}
	Class178 class178 = aClass487_Sub1_11499.method326();
	OpenGL.glDrawElements(i_72_, i_73_, method18109(class178),
			      (aClass487_Sub1_11499.method7860()
			       + (long) (i_70_ * (class178.anInt1915
						  * -103623665))));
    }
    
    public final synchronized void method3136(int i) {
	try {
	    method18106();
	} catch (Exception exception) {
	    return;
	}
	int i_74_ = 0;
	i &= 0x7fffffff;
	while (!aClass709_11485.method14363(-60806496)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11485.method14423(-1676696708);
	    anIntArray11492[i_74_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9167 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_74_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_74_, anIntArray11492, 0);
		i_74_ = 0;
	    }
	}
	if (i_74_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_74_, anIntArray11492, 0);
	    i_74_ = 0;
	}
	while (!aClass709_11486.method14363(365160456)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11486.method14423(-1613918902);
	    anIntArray11492[i_74_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9166 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_74_ == 1000) {
		OpenGL.glDeleteTextures(i_74_, anIntArray11492, 0);
		i_74_ = 0;
	    }
	}
	if (i_74_ > 0) {
	    OpenGL.glDeleteTextures(i_74_, anIntArray11492, 0);
	    i_74_ = 0;
	}
	while (!aClass709_11487.method14363(2126693675)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11487.method14423(-2058096689);
	    anIntArray11492[i_74_++] = class525_sub42.anInt10858 * -1344652871;
	    if (i_74_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_74_, anIntArray11492, 0);
		i_74_ = 0;
	    }
	}
	if (i_74_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_74_, anIntArray11492, 0);
	    i_74_ = 0;
	}
	while (!aClass709_11517.method14363(-1906208747)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11517.method14423(-749144174);
	    anIntArray11492[i_74_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9144 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_74_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_74_, anIntArray11492, 0);
		i_74_ = 0;
	    }
	}
	if (i_74_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_74_, anIntArray11492, 0);
	    boolean bool = false;
	}
	while (!aClass709_11484.method14363(-1901921372)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-1688029820);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	while (!aClass709_11489.method14363(-281880291)) {
	    Class525 class525 = aClass709_11489.method14423(-2001945526);
	    OpenGL.glDeleteProgram((int) (class525.aLong7113
					  * -5126207504388691097L));
	}
	while (!aClass709_11490.method14363(1456500291)) {
	    Class525 class525 = aClass709_11490.method14423(-1676299532);
	    OpenGL.glDeleteShader((int) (class525.aLong7113
					 * -5126207504388691097L));
	}
	while (!aClass709_11484.method14363(163095948)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-1232852781);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	if (method3137() > 100663296
	    && Class251.method4508((byte) 8) > aLong11500 + 60000L) {
	    System.gc();
	    aLong11500 = Class251.method4508((byte) 8);
	}
	super.method3136(i);
    }
    
    void method14753(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    public Interface22 method3404(int i, int i_75_, int i_76_) {
	return new Class520(this, Class165.aClass165_1774,
			    Class178.aClass178_1913, i, i_75_, i_76_);
    }
    
    Interface38 method14653(Class165 class165, int i, int i_77_, boolean bool,
			    byte[] is, int i_78_, int i_79_) {
	return new Class490_Sub3(this, class165, i, i_77_, bool, is, i_78_,
				 i_79_);
    }
    
    final Interface35 method15018(boolean bool) {
	return new Class487_Sub2(this, bool);
    }
    
    final synchronized void method18108(long l) {
	Class525 class525 = new Class525();
	class525.aLong7113 = l * 2638983450515767383L;
	aClass709_11490.method14345(class525, (byte) 0);
    }
    
    void method3280() {
	super.method3135();
	if (anOpenGL11521 != null) {
	    anOpenGL11521.method1733();
	    anOpenGL11521.release();
	    anOpenGL11521 = null;
	}
    }
    
    static final int method18109(Class178 class178) {
	switch (class178.anInt1910 * -1868954147) {
	case 8:
	    return 5125;
	case 3:
	    return 5124;
	case 7:
	    return 5122;
	case 5:
	    return 5126;
	default:
	    return 5121;
	case 4:
	    return 5123;
	case 0:
	    return 5120;
	case 1:
	    return 5131;
	case 2:
	    return 5121;
	}
    }
    
    public void method14658() {
	int i = anIntArray11483[anInt9246];
	if (i != 0) {
	    anIntArray11483[anInt9246] = 0;
	    OpenGL.glBindTexture(i, 0);
	    OpenGL.glDisable(i);
	}
    }
    
    public String method3265() {
	String string = "Caps: 4:";
	String string_80_ = ":";
	string = new StringBuilder().append(string).append(anInt9294).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append(anInt11512).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append(anInt9300).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append(anInt9163).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11505 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9305 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11509 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11511 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11508 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11496 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9307 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11506 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9306 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11507 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9302 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9303 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9304 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9309 ? 1 : 0).append
		     (string_80_).toString();
	string = new StringBuilder().append(string).append
		     (OpenGL.glGetString(35724).toLowerCase()).toString();
	return string;
    }
    
    public void method3269(boolean bool) {
	/* empty */
    }
    
    static int method18110(Class165 class165, Class178 class178) {
	if (class178 == Class178.aClass178_1905) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 0:
		return 6407;
	    case 2:
		return 33777;
	    case 7:
		return 6410;
	    case 9:
		return 6408;
	    case 6:
		return 6409;
	    case 4:
		return 33779;
	    case 5:
		return 6406;
	    default:
		throw new IllegalArgumentException();
	    }
	}
	if (class178 == Class178.aClass178_1909) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 5:
		return 32830;
	    case 6:
		return 32834;
	    case 9:
		return 32859;
	    default:
		throw new IllegalArgumentException();
	    case 7:
		return 36219;
	    case 0:
		return 32852;
	    case 8:
		return 33189;
	    }
	}
	if (class178 == Class178.aClass178_1913) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 8:
		return 33190;
	    default:
		throw new IllegalArgumentException();
	    }
	}
	if (class178 == Class178.aClass178_1911) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 8:
		return 33191;
	    default:
		throw new IllegalArgumentException();
	    }
	}
	if (class178 == Class178.aClass178_1912) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 9:
		return 34842;
	    case 7:
		return 34847;
	    case 0:
		return 34843;
	    case 5:
		return 34844;
	    default:
		throw new IllegalArgumentException();
	    case 6:
		return 34846;
	    }
	}
	if (class178 == Class178.aClass178_1914) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 6:
		return 34840;
	    default:
		throw new IllegalArgumentException();
	    case 5:
		return 34838;
	    case 0:
		return 34837;
	    case 7:
		return 34841;
	    case 9:
		return 34836;
	    }
	}
	throw new IllegalArgumentException();
    }
    
    void method14872(int i) {
	if (!aBool11514)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    public boolean method3323() {
	return aBool11513;
    }
    
    public Interface22 method3489(int i, int i_81_, int i_82_) {
	return new Class520(this, Class165.aClass165_1774,
			    Class178.aClass178_1913, i, i_81_, i_82_);
    }
    
    public void method14804(Class435 class435) {
	float[] fs = class435.aFloatArray4830;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    public Class170 method3436() {
	int i = -1;
	if (aString11491.indexOf("nvidia") != -1)
	    i = 4318;
	else if (aString11491.indexOf("intel") != -1)
	    i = 32902;
	else if (aString11491.indexOf("ati") != -1)
	    i = 4098;
	return new Class170(i, method14813() ? "OpenGL FF" : "OpenGL",
			    anInt11488, aString11503, 0L, method14813());
    }
    
    void method3273(int i, int i_83_) throws Exception_Sub4 {
	aClass168_Sub1_1959.method14606();
	if (anInterface24_1943 != null)
	    anInterface24_1943.method133((byte) -46);
    }
    
    void method3183(int i, int i_84_) throws Exception_Sub4 {
	aClass168_Sub1_1959.method14606();
	if (anInterface24_1943 != null)
	    anInterface24_1943.method133((byte) 15);
    }
    
    void method14744() {
	if (aBool9309) {
	    int i = 0;
	    int i_85_ = 0;
	    if (anInt9288 == 0) {
		i = 0;
		i_85_ = 0;
	    } else if (anInt9288 == 1) {
		i = 1;
		i_85_ = 0;
	    } else if (anInt9288 == 2) {
		i = 1;
		i_85_ = 1;
	    } else if (anInt9288 == 3) {
		i = 0;
		i_85_ = 1;
	    }
	    if (aClass367_9289 == Class367.aClass367_3859)
		OpenGL.glBlendFuncSeparate(770, 771, i, i_85_);
	    else if (aClass367_9289 == Class367.aClass367_3860)
		OpenGL.glBlendFuncSeparate(1, 1, i, i_85_);
	    else if (aClass367_9289 == Class367.aClass367_3861)
		OpenGL.glBlendFuncSeparate(774, 1, i, i_85_);
	    else if (aClass367_9289 == Class367.aClass367_3863)
		OpenGL.glBlendFuncSeparate(1, 0, i, i_85_);
	} else if (aClass367_9289 == Class367.aClass367_3859) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(770, 771);
	} else if (aClass367_9289 == Class367.aClass367_3860) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(1, 1);
	} else if (aClass367_9289 == Class367.aClass367_3861) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(774, 1);
	} else
	    OpenGL.glDisable(3042);
    }
    
    void method14795() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass435_9173.aFloatArray4830, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9228, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9229, 0);
    }
    
    public void method3334(int i, int i_86_, int i_87_) {
	method3219();
	if (aClass168_Sub2_11520 == null)
	    method18121(i_86_, i_87_);
	if (aClass157_11518 == null)
	    aClass157_11518 = method3217(0, 0, aClass168_1966.method2710(),
					 aClass168_1966.method2711(), false);
	else
	    aClass157_11518.method2540(0, 0, aClass168_1966.method2710(),
				       aClass168_1966.method2711(), 0, 0);
	method3158(aClass168_Sub2_11520, -1166817212);
	method3188(1, -16777216);
	aClass157_11518.method2481(anInt1958 * 1000431205,
				   anInt1964 * 1482704485,
				   anInt1935 * -1588334531,
				   anInt1967 * -863940247);
	OpenGL.glBindBufferARB(35051, anIntArray11502[anInt11525]);
	OpenGL.glReadPixelsub(0, 0, anInt1962 * -1079316541,
			      anInt1963 * -1736975045, 32993, 5121, null, 0);
	OpenGL.glBindBufferARB(35051, 0);
	method3159(aClass168_Sub2_11520, -1876999470);
	aLongArray11522[anInt11525] = OpenGL.glFenceSync(37143, 0);
	anIntArray11523[anInt11525] = i;
	if (++anInt11525 >= 3)
	    anInt11525 = 0;
	method3161();
    }
    
    public void method3586() {
	OpenGL.glFinish();
    }
    
    final synchronized void method18111(int i) {
	Class525 class525 = new Class525();
	class525.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11489.method14345(class525, (byte) 0);
    }
    
    public void method15010(Class435 class435) {
	float[] fs = class435.aFloatArray4830;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    Class337 method15021(Class378[] class378s) {
	return new Class337_Sub1(class378s);
    }
    
    public final synchronized void method3282(int i) {
	try {
	    method18106();
	} catch (Exception exception) {
	    return;
	}
	int i_88_ = 0;
	i &= 0x7fffffff;
	while (!aClass709_11485.method14363(-205909409)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11485.method14423(-1160848343);
	    anIntArray11492[i_88_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9167 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_88_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_88_, anIntArray11492, 0);
		i_88_ = 0;
	    }
	}
	if (i_88_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_88_, anIntArray11492, 0);
	    i_88_ = 0;
	}
	while (!aClass709_11486.method14363(57056849)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11486.method14423(-1286007340);
	    anIntArray11492[i_88_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9166 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_88_ == 1000) {
		OpenGL.glDeleteTextures(i_88_, anIntArray11492, 0);
		i_88_ = 0;
	    }
	}
	if (i_88_ > 0) {
	    OpenGL.glDeleteTextures(i_88_, anIntArray11492, 0);
	    i_88_ = 0;
	}
	while (!aClass709_11487.method14363(-1781589306)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11487.method14423(-1591311105);
	    anIntArray11492[i_88_++] = class525_sub42.anInt10858 * -1344652871;
	    if (i_88_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_88_, anIntArray11492, 0);
		i_88_ = 0;
	    }
	}
	if (i_88_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_88_, anIntArray11492, 0);
	    i_88_ = 0;
	}
	while (!aClass709_11517.method14363(1554050542)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11517.method14423(-1208231501);
	    anIntArray11492[i_88_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9144 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_88_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_88_, anIntArray11492, 0);
		i_88_ = 0;
	    }
	}
	if (i_88_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_88_, anIntArray11492, 0);
	    boolean bool = false;
	}
	while (!aClass709_11484.method14363(2027332564)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-1984766526);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	while (!aClass709_11489.method14363(1226826546)) {
	    Class525 class525 = aClass709_11489.method14423(-2050159465);
	    OpenGL.glDeleteProgram((int) (class525.aLong7113
					  * -5126207504388691097L));
	}
	while (!aClass709_11490.method14363(-217771833)) {
	    Class525 class525 = aClass709_11490.method14423(-2123855619);
	    OpenGL.glDeleteShader((int) (class525.aLong7113
					 * -5126207504388691097L));
	}
	while (!aClass709_11484.method14363(425111249)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-1948037540);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	if (method3137() > 100663296
	    && Class251.method4508((byte) 8) > aLong11500 + 60000L) {
	    System.gc();
	    aLong11500 = Class251.method4508((byte) 8);
	}
	super.method3136(i);
    }
    
    public final synchronized void method3502(int i) {
	try {
	    method18106();
	} catch (Exception exception) {
	    return;
	}
	int i_89_ = 0;
	i &= 0x7fffffff;
	while (!aClass709_11485.method14363(-108638390)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11485.method14423(-1402636238);
	    anIntArray11492[i_89_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9167 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_89_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_89_, anIntArray11492, 0);
		i_89_ = 0;
	    }
	}
	if (i_89_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_89_, anIntArray11492, 0);
	    i_89_ = 0;
	}
	while (!aClass709_11486.method14363(-1207410547)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11486.method14423(-856011489);
	    anIntArray11492[i_89_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9166 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_89_ == 1000) {
		OpenGL.glDeleteTextures(i_89_, anIntArray11492, 0);
		i_89_ = 0;
	    }
	}
	if (i_89_ > 0) {
	    OpenGL.glDeleteTextures(i_89_, anIntArray11492, 0);
	    i_89_ = 0;
	}
	while (!aClass709_11487.method14363(-2057341699)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11487.method14423(-1055595303);
	    anIntArray11492[i_89_++] = class525_sub42.anInt10858 * -1344652871;
	    if (i_89_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_89_, anIntArray11492, 0);
		i_89_ = 0;
	    }
	}
	if (i_89_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_89_, anIntArray11492, 0);
	    i_89_ = 0;
	}
	while (!aClass709_11517.method14363(821634891)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11517.method14423(-674629157);
	    anIntArray11492[i_89_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9144 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_89_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_89_, anIntArray11492, 0);
		i_89_ = 0;
	    }
	}
	if (i_89_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_89_, anIntArray11492, 0);
	    boolean bool = false;
	}
	while (!aClass709_11484.method14363(77768202)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-1241244607);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	while (!aClass709_11489.method14363(-600210913)) {
	    Class525 class525 = aClass709_11489.method14423(-916149665);
	    OpenGL.glDeleteProgram((int) (class525.aLong7113
					  * -5126207504388691097L));
	}
	while (!aClass709_11490.method14363(-1305422666)) {
	    Class525 class525 = aClass709_11490.method14423(-1744082353);
	    OpenGL.glDeleteShader((int) (class525.aLong7113
					 * -5126207504388691097L));
	}
	while (!aClass709_11484.method14363(68776543)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-851254146);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	if (method3137() > 100663296
	    && Class251.method4508((byte) 8) > aLong11500 + 60000L) {
	    System.gc();
	    aLong11500 = Class251.method4508((byte) 8);
	}
	super.method3136(i);
    }
    
    void method18112() {
	if (anInt9293 == 1)
	    OpenGL.glDisable(2884);
	else {
	    OpenGL.glEnable(2884);
	    if (anInt9293 == 2)
		OpenGL.glCullFace(1029);
	    else if (anInt9293 == 3)
		OpenGL.glCullFace(1028);
	}
    }
    
    void method14876() {
	if (aClass168_1966 != null) {
	    int i = anInt9219 + anInt9209;
	    int i_90_ = anInt9224 + aClass168_1966.method2711() - anInt9264;
	    int i_91_ = anInt9210 - anInt9209;
	    int i_92_ = anInt9264 - anInt9319;
	    if (i_91_ < 0)
		i_91_ = 0;
	    if (i_92_ < 0)
		i_92_ = 0;
	    OpenGL.glScissor(i, i_90_, i_91_, i_92_);
	}
    }
    
    public String method3305() {
	String string = "Caps: 4:";
	String string_93_ = ":";
	string = new StringBuilder().append(string).append(anInt9294).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append(anInt11512).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append(anInt9300).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append(anInt9163).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11505 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9305 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11509 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11511 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11508 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11496 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9307 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11506 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9306 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11507 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9302 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9303 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9304 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9309 ? 1 : 0).append
		     (string_93_).toString();
	string = new StringBuilder().append(string).append
		     (OpenGL.glGetString(35724).toLowerCase()).toString();
	return string;
    }
    
    public Class170 method3270() {
	int i = -1;
	if (aString11491.indexOf("nvidia") != -1)
	    i = 4318;
	else if (aString11491.indexOf("intel") != -1)
	    i = 32902;
	else if (aString11491.indexOf("ati") != -1)
	    i = 4098;
	return new Class170(i, method14813() ? "OpenGL FF" : "OpenGL",
			    anInt11488, aString11503, 0L, method14813());
    }
    
    public void method3310(boolean bool) {
	/* empty */
    }
    
    public final synchronized void method3370(int i) {
	try {
	    method18106();
	} catch (Exception exception) {
	    return;
	}
	int i_94_ = 0;
	i &= 0x7fffffff;
	while (!aClass709_11485.method14363(1999699787)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11485.method14423(-649994128);
	    anIntArray11492[i_94_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9167 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_94_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_94_, anIntArray11492, 0);
		i_94_ = 0;
	    }
	}
	if (i_94_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_94_, anIntArray11492, 0);
	    i_94_ = 0;
	}
	while (!aClass709_11486.method14363(-190593177)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11486.method14423(-1918735530);
	    anIntArray11492[i_94_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9166 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_94_ == 1000) {
		OpenGL.glDeleteTextures(i_94_, anIntArray11492, 0);
		i_94_ = 0;
	    }
	}
	if (i_94_ > 0) {
	    OpenGL.glDeleteTextures(i_94_, anIntArray11492, 0);
	    i_94_ = 0;
	}
	while (!aClass709_11487.method14363(1895160208)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11487.method14423(-808562956);
	    anIntArray11492[i_94_++] = class525_sub42.anInt10858 * -1344652871;
	    if (i_94_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_94_, anIntArray11492, 0);
		i_94_ = 0;
	    }
	}
	if (i_94_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_94_, anIntArray11492, 0);
	    i_94_ = 0;
	}
	while (!aClass709_11517.method14363(481448538)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11517.method14423(-1989948883);
	    anIntArray11492[i_94_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9144 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_94_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_94_, anIntArray11492, 0);
		i_94_ = 0;
	    }
	}
	if (i_94_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_94_, anIntArray11492, 0);
	    boolean bool = false;
	}
	while (!aClass709_11484.method14363(-139224761)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-906586329);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	while (!aClass709_11489.method14363(173857392)) {
	    Class525 class525 = aClass709_11489.method14423(-1795257344);
	    OpenGL.glDeleteProgram((int) (class525.aLong7113
					  * -5126207504388691097L));
	}
	while (!aClass709_11490.method14363(1105062335)) {
	    Class525 class525 = aClass709_11490.method14423(-984383586);
	    OpenGL.glDeleteShader((int) (class525.aLong7113
					 * -5126207504388691097L));
	}
	while (!aClass709_11484.method14363(-178547385)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-1675730872);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	if (method3137() > 100663296
	    && Class251.method4508((byte) 8) > aLong11500 + 60000L) {
	    System.gc();
	    aLong11500 = Class251.method4508((byte) 8);
	}
	super.method3136(i);
    }
    
    Class168_Sub1 method3403(Canvas canvas, int i, int i_95_) {
	return new Class168_Sub1_Sub2_Sub2(this, canvas);
    }
    
    final synchronized void method18113(int i, int i_96_) {
	Class525_Sub42 class525_sub42 = new Class525_Sub42(i_96_);
	class525_sub42.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11485.method14345(class525_sub42, (byte) 0);
    }
    
    Class168_Sub1 method3534(Canvas canvas, int i, int i_97_) {
	return new Class168_Sub1_Sub2_Sub2(this, canvas);
    }
    
    boolean method14934(Class165 class165, Class178 class178) {
	return true;
    }
    
    Class182_Sub1_Sub2(OpenGL opengl, Canvas canvas, long l, Class180 class180,
                       Interface24 interface24, Interface47 interface47,
                       Interface48 interface48, Interface49 interface49,
                       JS5 class458, int i) {
	super(class180, interface24, interface47, interface48, interface49,
	      class458, i, 1);
	aClass709_11489 = new Class709();
	aClass709_11490 = new Class709();
	anIntArray11492 = new int[1000];
	aClass487_Sub2Array11497 = new Class487_Sub2[16];
	new MapBuffer();
	new MapBuffer();
	aFloatArray11515 = new float[4];
	aFloatArray11516 = new float[16];
	aClass157_11518 = null;
	aClass157_11519 = null;
	aClass168_Sub2_11520 = null;
	anIntArray11502 = new int[3];
	aLongArray11522 = new long[3];
	anIntArray11523 = new int[3];
	anInt11524 = 0;
	anInt11525 = 0;
	int[] is = new int[1];
	try {
	    anOpenGL11521 = opengl;
	    anOpenGL11521.method1732();
	    aString11491 = OpenGL.glGetString(7936).toLowerCase();
	    aString11503 = OpenGL.glGetString(7937).toLowerCase();
	    if (aString11491.indexOf("microsoft") != -1
		|| aString11491.indexOf("brian paul") != -1
		|| aString11491.indexOf("mesa") != -1)
		throw new RuntimeException("");
	    String string = OpenGL.glGetString(7938);
	    String[] strings = Class481.method7829(string.replace('.', ' '),
						   ' ', -568195779);
	    if (strings.length >= 2) {
		try {
		    int i_98_ = Class275.method5102(strings[0], -1644804528);
		    int i_99_ = Class275.method5102(strings[1], -1598147467);
		    anInt11488 = i_98_ * 10 + i_99_;
		} catch (NumberFormatException numberformatexception) {
		    throw new RuntimeException("");
		}
	    } else
		throw new RuntimeException("");
	    if (anInt11488 < 12)
		throw new RuntimeException("");
	    OpenGL.glGetIntegerv(34018, is, 0);
	    anInt9300 = is[0];
	    if (anInt9300 < 2)
		throw new RuntimeException("");
	    anInt9163 = 8;
	    aBool11505
		= anOpenGL11521.method1731("GL_ARB_vertex_buffer_object");
	    aBool9305 = anOpenGL11521.method1731("GL_ARB_multisample");
	    aBool9309 = anOpenGL11521.method1731("GL_EXT_blend_func_separate");
	    aBool11506 = anOpenGL11521.method1731("GL_ARB_texture_rectangle");
	    aBool9306 = anOpenGL11521.method1731("GL_ARB_texture_cube_map");
	    aBool11507
		= anOpenGL11521.method1731("GL_ARB_texture_non_power_of_two");
	    aBool9307 = true;
	    aBool11508 = anOpenGL11521.method1731("GL_ARB_vertex_shader");
	    aBool11509 = anOpenGL11521.method1731("GL_ARB_vertex_program");
	    aBool11496 = anOpenGL11521.method1731("GL_ARB_fragment_shader");
	    aBool11511 = anOpenGL11521.method1731("GL_ARB_fragment_program");
	    aBool9302 = anOpenGL11521.method1731("GL_EXT_framebuffer_object");
	    aBool9308 = aBool9302;
	    aBool9303 = anOpenGL11521.method1731("GL_EXT_framebuffer_blit");
	    aBool9304
		= anOpenGL11521.method1731("GL_EXT_framebuffer_multisample");
	    aBool11513 = (anUnsafe9234 != null
			  && (anInt11488 >= 32
			      || anOpenGL11521.method1731("GL_ARB_sync")));
	    anIntArray11483 = new int[anInt9300];
	    if (!method14657() || !method14655()) {
		if (!anOpenGL11521.method1731("GL_ARB_multitexture"))
		    throw new RuntimeException("");
		if (!anOpenGL11521.method1731("GL_ARB_texture_env_combine"))
		    throw new RuntimeException("");
	    }
	    Class512.aString5685.startsWith("mac");
	    anInt11512 = Stream.method1769() ? 33639 : 5121;
	    if (aString11503.indexOf("radeon") != -1
		|| aString11491.indexOf("intel") != -1) {
		int i_100_ = 0;
		boolean bool = aString11491.indexOf("intel") != -1;
		boolean bool_101_ = false;
		boolean bool_102_ = false;
		String[] strings_103_
		    = Class481.method7829(aString11503.replace('/', ' '), ' ',
					  154721997);
		for (int i_104_ = 0; i_104_ < strings_103_.length; i_104_++) {
		    String string_105_ = strings_103_[i_104_];
		    try {
			if (string_105_.length() <= 0)
			    continue;
			if (string_105_.charAt(0) == 'x'
			    && string_105_.length() >= 3
			    && Class493.method7997(string_105_.substring(1, 3),
						   -571385798)) {
			    string_105_ = string_105_.substring(1);
			    bool_102_ = true;
			}
			if (string_105_.equals("hd")) {
			    bool_101_ = true;
			    continue;
			}
			if (string_105_.startsWith("hd")) {
			    string_105_ = string_105_.substring(2);
			    bool_101_ = true;
			}
			if (string_105_.length() < 4
			    || !Class493.method7997(string_105_.substring(0,
									  4),
						    -571385798))
			    continue;
			i_100_
			    = Class275.method5102(string_105_.substring(0, 4),
						  -949128370);
		    } catch (Exception exception) {
			continue;
		    }
		    break;
		}
		if (bool) {
		    if (!bool_101_)
			aBool9302 = false;
		} else {
		    if (!bool_102_ && !bool_101_) {
			if (i_100_ >= 7000 && i_100_ <= 7999)
			    aBool11505 = false;
			if (i_100_ >= 7000 && i_100_ <= 9250)
			    aBool9307 = false;
		    }
		    aBool11506
			&= anOpenGL11521.method1731("GL_ARB_half_float_pixel");
		    aBool11510 = true;
		}
	    }
	    if (aBool11505) {
		try {
		    int[] is_106_ = new int[1];
		    OpenGL.glGenBuffersARB(1, is_106_, 0);
		} catch (Throwable throwable) {
		    throw new RuntimeException("");
		}
	    } else
		throw new RuntimeException("");
	    method3154(canvas, new Class168_Sub1_Sub2_Sub2(this, canvas, l),
		       1037732923);
	    method3317(canvas, 593318162);
	    method14681(32768, false);
	    method14681(32768, false);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method3134(-1528892940);
	    if (throwable instanceof OutOfMemoryError)
		throw (OutOfMemoryError) throwable;
	    throw new RuntimeException("");
	}
    }
    
    public int[] method3207(int i, int i_107_, int i_108_, int i_109_) {
	int[] is = new int[i_108_ * i_109_];
	int i_110_ = aClass168_1966.method2711();
	for (int i_111_ = 0; i_111_ < i_109_; i_111_++)
	    OpenGL.glReadPixelsi(i, i_110_ - i_107_ - i_111_ - 1, i_108_, 1,
				 32993, anInt11512, is, i_111_ * i_108_);
	return is;
    }
    
    public void method3341() {
	if (aClass168_1966 != null) {
	    int i = aClass168_1966.method2710();
	    int i_112_ = aClass168_1966.method2711();
	    if (i > 0 || i_112_ > 0) {
		int i_113_ = anInt9268;
		int i_114_ = anInt9258;
		int i_115_ = anInt9250;
		int i_116_ = anInt9285;
		method3580();
		int i_117_ = anInt9209;
		int i_118_ = anInt9210;
		int i_119_ = anInt9319;
		int i_120_ = anInt9264;
		method3480();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method14904();
		method14756(false);
		method14713(false);
		method14807(false);
		method14710(false);
		method14731(null);
		method14800(1);
		method14779(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_112_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method3184(i_117_, i_119_, i_118_, i_120_);
		method3277(i_113_, i_114_, i_115_, i_116_);
	    }
	}
    }
    
    public void method3518() {
	if (aClass168_1966 != null) {
	    int i = aClass168_1966.method2710();
	    int i_121_ = aClass168_1966.method2711();
	    if (i > 0 || i_121_ > 0) {
		int i_122_ = anInt9268;
		int i_123_ = anInt9258;
		int i_124_ = anInt9250;
		int i_125_ = anInt9285;
		method3580();
		int i_126_ = anInt9209;
		int i_127_ = anInt9210;
		int i_128_ = anInt9319;
		int i_129_ = anInt9264;
		method3480();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method14904();
		method14756(false);
		method14713(false);
		method14807(false);
		method14710(false);
		method14731(null);
		method14800(1);
		method14779(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_121_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method3184(i_126_, i_128_, i_127_, i_129_);
		method3277(i_122_, i_123_, i_124_, i_125_);
	    }
	}
    }
    
    void method14662() {
	OpenGL.glTexEnvi(8960, 34162,
			 method18105(aClass362Array9317[anInt9246]));
    }
    
    public void method14798(Class435 class435, Class435 class435_130_,
			    Class435 class435_131_) {
	OpenGL.glMatrixMode(5888);
	aClass435_9180.method6949(class435, class435_130_);
	OpenGL.glLoadMatrixf(aClass435_9180.aFloatArray4830, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class435_131_.aFloatArray4830, 0);
    }
    
    public final synchronized void method3495(int i) {
	try {
	    method18106();
	} catch (Exception exception) {
	    return;
	}
	int i_132_ = 0;
	i &= 0x7fffffff;
	while (!aClass709_11485.method14363(745400813)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11485.method14423(-1431249842);
	    anIntArray11492[i_132_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9167 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_132_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_132_, anIntArray11492, 0);
		i_132_ = 0;
	    }
	}
	if (i_132_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_132_, anIntArray11492, 0);
	    i_132_ = 0;
	}
	while (!aClass709_11486.method14363(883080884)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11486.method14423(-1836072564);
	    anIntArray11492[i_132_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9166 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_132_ == 1000) {
		OpenGL.glDeleteTextures(i_132_, anIntArray11492, 0);
		i_132_ = 0;
	    }
	}
	if (i_132_ > 0) {
	    OpenGL.glDeleteTextures(i_132_, anIntArray11492, 0);
	    i_132_ = 0;
	}
	while (!aClass709_11487.method14363(990176980)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11487.method14423(-2097600876);
	    anIntArray11492[i_132_++]
		= class525_sub42.anInt10858 * -1344652871;
	    if (i_132_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_132_, anIntArray11492, 0);
		i_132_ = 0;
	    }
	}
	if (i_132_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_132_, anIntArray11492, 0);
	    i_132_ = 0;
	}
	while (!aClass709_11517.method14363(-665168093)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11517.method14423(-1475405712);
	    anIntArray11492[i_132_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9144 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_132_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_132_, anIntArray11492, 0);
		i_132_ = 0;
	    }
	}
	if (i_132_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_132_, anIntArray11492, 0);
	    boolean bool = false;
	}
	while (!aClass709_11484.method14363(1847758682)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-1084108199);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	while (!aClass709_11489.method14363(133818919)) {
	    Class525 class525 = aClass709_11489.method14423(-1498624740);
	    OpenGL.glDeleteProgram((int) (class525.aLong7113
					  * -5126207504388691097L));
	}
	while (!aClass709_11490.method14363(-1218040377)) {
	    Class525 class525 = aClass709_11490.method14423(-639170070);
	    OpenGL.glDeleteShader((int) (class525.aLong7113
					 * -5126207504388691097L));
	}
	while (!aClass709_11484.method14363(1121172155)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-1470794069);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	if (method3137() > 100663296
	    && Class251.method4508((byte) 8) > aLong11500 + 60000L) {
	    System.gc();
	    aLong11500 = Class251.method4508((byte) 8);
	}
	super.method3136(i);
    }
    
    public boolean method3524() {
	return aBool11513;
    }
    
    public boolean method3325() {
	return aBool11513;
    }
    
    public boolean method3278() {
	if (aBool11513 && aLongArray11522[anInt11525] != 0L)
	    return false;
	return true;
    }
    
    public Class168_Sub2 method3485() {
	return new Class168_Sub2_Sub3_Sub2(this);
    }
    
    public boolean method3565() {
	return true;
    }
    
    public boolean method3389() {
	return false;
    }
    
    void method14747() {
	OpenGL.glTexEnvi(8960, 34161,
			 method18105(aClass362Array9322[anInt9246]));
    }
    
    final synchronized void method18114(int i, int i_133_) {
	Class525_Sub42 class525_sub42 = new Class525_Sub42(i_133_);
	class525_sub42.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11486.method14345(class525_sub42, (byte) 0);
    }
    
    public Interface22 method3163(int i, int i_134_) {
	return new Class520(this, Class165.aClass165_1774,
			    Class178.aClass178_1913, i, i_134_);
    }
    
    Interface42 method14956(Class165 class165, Class178 class178, int i,
			    int i_135_) {
	return new Class490_Sub3(this, class165, class178, i, i_135_);
    }
    
    static final int method18115(Class371 class371) {
	if (class371 == Class371.aClass371_3879)
	    return 5890;
	if (class371 == Class371.aClass371_3880)
	    return 34167;
	if (class371 == Class371.aClass371_3878)
	    return 34168;
	if (class371 == Class371.aClass371_3881)
	    return 34166;
	throw new IllegalArgumentException();
    }
    
    public Class266 method15008(String string) {
	byte[] is = method18123(string);
	if (is == null)
	    return null;
	Class262 class262 = method14865(is);
	return new Class266_Sub1(this, class262);
    }
    
    public void method3430() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11522[i] != 0L) {
		OpenGL.glDeleteSync(aLongArray11522[i]);
		aLongArray11522[i] = 0L;
	    }
	}
	anInt11525 = 0;
	anInt11524 = 0;
    }
    
    public void method3337() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11522[i] != 0L) {
		OpenGL.glDeleteSync(aLongArray11522[i]);
		aLongArray11522[i] = 0L;
	    }
	}
	anInt11525 = 0;
	anInt11524 = 0;
    }
    
    public long method3338(int i, int i_136_) {
	return method18125(i, i_136_, null, null);
    }
    
    public long method3222(int i, int i_137_) {
	return method18125(i, i_137_, null, null);
    }
    
    public void method3340(long l) {
	if (l != 0L) {
	    if (OpenGL.glUnmapBufferARB(35051)) {
		/* empty */
	    }
	    OpenGL.glBindBufferARB(35051, 0);
	}
    }
    
    Class168_Sub1 method3281(Canvas canvas, int i, int i_138_) {
	return new Class168_Sub1_Sub2_Sub2(this, canvas);
    }
    
    public int[] method3316(int i, int i_139_, int i_140_, int i_141_) {
	int[] is = new int[i_140_ * i_141_];
	int i_142_ = aClass168_1966.method2711();
	for (int i_143_ = 0; i_143_ < i_141_; i_143_++)
	    OpenGL.glReadPixelsi(i, i_142_ - i_139_ - i_143_ - 1, i_140_, 1,
				 32993, anInt11512, is, i_143_ * i_140_);
	return is;
    }
    
    public boolean method3331() {
	return false;
    }
    
    public Class174 method3439(Class174 class174, Class174 class174_144_,
			       float f, Class174 class174_145_) {
	return f < 0.5F ? class174 : class174_144_;
    }
    
    public Class174 method3246(Class174 class174, Class174 class174_146_,
			       float f, Class174 class174_147_) {
	return f < 0.5F ? class174 : class174_146_;
    }
    
    Interface38 method14944(Class165 class165, Class178 class178, int i,
			    int i_148_) {
	return method14728(class165, class178, i, i_148_);
    }
    
    public long method3174(int i, int i_149_) {
	return method18125(i, i_149_, null, null);
    }
    
    final synchronized void method18116(int i, int i_150_) {
	Class525_Sub42 class525_sub42 = new Class525_Sub42(i_150_);
	class525_sub42.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11517.method14345(class525_sub42, (byte) 0);
    }
    
    public Interface21 method3487(int i, int i_151_, Class165 class165,
				  Class178 class178, int i_152_) {
	return new Class520(this, class165, class178, i, i_151_, i_152_);
    }
    
    public Interface22 method3488(int i, int i_153_, int i_154_) {
	return new Class520(this, Class165.aClass165_1774,
			    Class178.aClass178_1913, i, i_153_, i_154_);
    }
    
    final synchronized void method18117(int i) {
	Class525 class525 = new Class525();
	class525.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11489.method14345(class525, (byte) 0);
    }
    
    Interface42 method14955(Class165 class165, Class178 class178, int i,
			    int i_155_) {
	return new Class490_Sub3(this, class165, class178, i, i_155_);
    }
    
    public Class266 method14770(String string) {
	byte[] is = method18123(string);
	if (is == null)
	    return null;
	Class262 class262 = method14865(is);
	return new Class266_Sub1(this, class262);
    }
    
    public void method3537(int i, int i_156_) {
	int i_157_ = 0;
	if ((i & 0x1) != 0) {
	    OpenGL.glClearColor((float) (i_156_ & 0xff0000) / 1.671168E7F,
				(float) (i_156_ & 0xff00) / 65280.0F,
				(float) (i_156_ & 0xff) / 255.0F,
				(float) (i_156_ >>> 24) / 255.0F);
	    i_157_ = 16384;
	}
	if ((i & 0x2) != 0) {
	    method14710(true);
	    i_157_ |= 0x100;
	}
	if ((i & 0x4) != 0)
	    i_157_ |= 0x400;
	OpenGL.glClear(i_157_);
    }
    
    public void method3133() {
	OpenGL.glFinish();
    }
    
    public Interface22 method3511(int i, int i_158_) {
	return new Class520(this, Class165.aClass165_1774,
			    Class178.aClass178_1913, i, i_158_);
    }
    
    void method14839() {
	aFloatArray11515[0] = aFloat9169 * aFloat9233;
	aFloatArray11515[1] = aFloat9169 * aFloat9299;
	aFloatArray11515[2] = aFloat9169 * aFloat9235;
	aFloatArray11515[3] = 1.0F;
	OpenGL.glLightModelfv(2899, aFloatArray11515, 0);
    }
    
    public boolean method15012() {
	return aBool11508;
    }
    
    void method14781(int i) {
	if (!aBool11514)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    public boolean method14823() {
	return aBool11496;
    }
    
    public boolean method14782(boolean bool) {
	return true;
    }
    
    void method18118() {
	int i = 0;
	while (!anOpenGL11521.method1732()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class229.method4381(1000L);
	}
    }
    
    public boolean method14949(boolean bool) {
	return true;
    }
    
    public void method14898(Class435 class435) {
	float[] fs = class435.aFloatArray4830;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    public boolean method3568() {
	return false;
    }
    
    public Class266 method14953(String string) {
	byte[] is = method18123(string);
	if (is == null)
	    return null;
	Class262 class262 = method14865(is);
	return new Class266_Sub1(this, class262);
    }
    
    public Class266 method14835(String string) {
	byte[] is = method18123(string);
	if (is == null)
	    return null;
	Class262 class262 = method14865(is);
	return new Class266_Sub1(this, class262);
    }
    
    public void method14838(Class435 class435, Class435 class435_159_,
			    Class435 class435_160_) {
	OpenGL.glMatrixMode(5888);
	aClass435_9180.method6949(class435, class435_159_);
	OpenGL.glLoadMatrixf(aClass435_9180.aFloatArray4830, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class435_160_.aFloatArray4830, 0);
    }
    
    public void method14787(Class435 class435, Class435 class435_161_,
			    Class435 class435_162_) {
	OpenGL.glMatrixMode(5888);
	aClass435_9180.method6949(class435, class435_161_);
	OpenGL.glLoadMatrixf(aClass435_9180.aFloatArray4830, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class435_162_.aFloatArray4830, 0);
    }
    
    public void method15025(Class435 class435, Class435 class435_163_,
			    Class435 class435_164_) {
	OpenGL.glMatrixMode(5888);
	aClass435_9180.method6949(class435, class435_163_);
	OpenGL.glLoadMatrixf(aClass435_9180.aFloatArray4830, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class435_164_.aFloatArray4830, 0);
    }
    
    public void method14840(Class435 class435, Class435 class435_165_,
			    Class435 class435_166_) {
	OpenGL.glMatrixMode(5888);
	aClass435_9180.method6949(class435, class435_165_);
	OpenGL.glLoadMatrixf(aClass435_9180.aFloatArray4830, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class435_166_.aFloatArray4830, 0);
    }
    
    void method14664() {
	OpenGL.glDepthFunc(515);
	method18112();
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9305) {
	    method14936(anInt9294 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9300 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_167_ = 16384 + i;
	    OpenGL.glLightfv(i_167_, 4608, fs, 0);
	    OpenGL.glLightf(i_167_, 4615, 0.0F);
	    OpenGL.glLightf(i_167_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	anOpenGL11521.setSwapInterval(0);
	super.method14666();
    }
    
    void method14847() {
	OpenGL.glDepthFunc(515);
	method18112();
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9305) {
	    method14936(anInt9294 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9300 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_168_ = 16384 + i;
	    OpenGL.glLightfv(i_168_, 4608, fs, 0);
	    OpenGL.glLightf(i_168_, 4615, 0.0F);
	    OpenGL.glLightf(i_168_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	anOpenGL11521.setSwapInterval(0);
	super.method14666();
    }
    
    void method14848() {
	OpenGL.glDepthFunc(515);
	method18112();
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9305) {
	    method14936(anInt9294 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9300 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_169_ = 16384 + i;
	    OpenGL.glLightfv(i_169_, 4608, fs, 0);
	    OpenGL.glLightf(i_169_, 4615, 0.0F);
	    OpenGL.glLightf(i_169_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	anOpenGL11521.setSwapInterval(0);
	super.method14666();
    }
    
    void method14849() {
	OpenGL.glDepthFunc(515);
	method18112();
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9305) {
	    method14936(anInt9294 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9300 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_170_ = 16384 + i;
	    OpenGL.glLightfv(i_170_, 4608, fs, 0);
	    OpenGL.glLightf(i_170_, 4615, 0.0F);
	    OpenGL.glLightf(i_170_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	anOpenGL11521.setSwapInterval(0);
	super.method14666();
    }
    
    public float method14862() {
	return 0.0F;
    }
    
    public boolean method14655() {
	return aBool11496;
    }
    
    void method14875() {
	if (aClass168_1966 != null)
	    OpenGL.glViewport(anInt9219 + anInt9268,
			      (anInt9224 + aClass168_1966.method2711()
			       - anInt9258 - anInt9285),
			      anInt9250, anInt9285);
	OpenGL.glDepthRange(aFloat9201, aFloat9202);
    }
    
    final synchronized void method18119(int i) {
	Class525_Sub42 class525_sub42 = new Class525_Sub42(i);
	aClass709_11487.method14345(class525_sub42, (byte) 0);
    }
    
    void method14867() {
	if (aClass168_1966 != null) {
	    int i = anInt9219 + anInt9209;
	    int i_171_ = anInt9224 + aClass168_1966.method2711() - anInt9264;
	    int i_172_ = anInt9210 - anInt9209;
	    int i_173_ = anInt9264 - anInt9319;
	    if (i_172_ < 0)
		i_172_ = 0;
	    if (i_173_ < 0)
		i_173_ = 0;
	    OpenGL.glScissor(i, i_171_, i_172_, i_173_);
	}
    }
    
    void method15030() {
	if (aBool9325)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    void method14859() {
	if (aBool9325)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    void method14927() {
	/* empty */
    }
    
    static int method18120(Class165 class165, Class178 class178) {
	if (class178 == Class178.aClass178_1905) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 0:
		return 6407;
	    case 2:
		return 33777;
	    case 7:
		return 6410;
	    case 9:
		return 6408;
	    case 6:
		return 6409;
	    case 4:
		return 33779;
	    case 5:
		return 6406;
	    default:
		throw new IllegalArgumentException();
	    }
	}
	if (class178 == Class178.aClass178_1909) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 5:
		return 32830;
	    case 6:
		return 32834;
	    case 9:
		return 32859;
	    default:
		throw new IllegalArgumentException();
	    case 7:
		return 36219;
	    case 0:
		return 32852;
	    case 8:
		return 33189;
	    }
	}
	if (class178 == Class178.aClass178_1913) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 8:
		return 33190;
	    default:
		throw new IllegalArgumentException();
	    }
	}
	if (class178 == Class178.aClass178_1911) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 8:
		return 33191;
	    default:
		throw new IllegalArgumentException();
	    }
	}
	if (class178 == Class178.aClass178_1912) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 9:
		return 34842;
	    case 7:
		return 34847;
	    case 0:
		return 34843;
	    case 5:
		return 34844;
	    default:
		throw new IllegalArgumentException();
	    case 6:
		return 34846;
	    }
	}
	if (class178 == Class178.aClass178_1914) {
	    switch (class165.anInt1780 * -2093736709) {
	    case 6:
		return 34840;
	    default:
		throw new IllegalArgumentException();
	    case 5:
		return 34838;
	    case 0:
		return 34837;
	    case 7:
		return 34841;
	    case 9:
		return 34836;
	    }
	}
	throw new IllegalArgumentException();
    }
    
    public Class168_Sub2 method3483() {
	return new Class168_Sub2_Sub3_Sub2(this);
    }
    
    public int method3191() {
	if (aBool11513) {
	    if (aLongArray11522[anInt11524] == 0L)
		return -1;
	    int i = OpenGL.glClientWaitSync(aLongArray11522[anInt11524], 0, 0);
	    if (i == 37149) {
		method3401();
		return -1;
	    }
	    return i != 37147 ? anIntArray11523[anInt11524] : -1;
	}
	return -1;
    }
    
    public void method14671(Class435 class435) {
	float[] fs = class435.aFloatArray4830;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    void method18121(int i, int i_174_) {
	method3178();
	method3177(i, i_174_, (short) -5203);
	if (aBool11513) {
	    aClass157_11519 = method3213(i, i_174_, false, true);
	    aClass168_Sub2_11520 = method3314();
	    aClass168_Sub2_11520.method15585(0, aClass157_11519.method2521());
	    OpenGL.glGenBuffersARB(3, anIntArray11502, 0);
	    for (int i_175_ = 0; i_175_ < 3; i_175_++) {
		OpenGL.glBindBufferARB(35051, anIntArray11502[i_175_]);
		OpenGL.glBufferDataARBa(35051, i * i_174_ * 4, 0L, 35041);
		OpenGL.glBindBufferARB(35051, 0);
	    }
	} else {
	    aClass157_11519 = method3213(i, i_174_, false, true);
	    aClass168_Sub2_11520 = method3314();
	    aClass168_Sub2_11520.method15585(0, aClass157_11519.method2521());
	}
    }
    
    void method14912() {
	if (aBool9223 && aBool9175)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    void method14913() {
	OpenGL.glDepthMask(aBool9221 && aBool9222);
    }
    
    void method14911() {
	if (aBool9223 && aBool9175)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    public void method3335(int i, int i_176_, int i_177_) {
	method3219();
	if (aClass168_Sub2_11520 == null)
	    method18121(i_176_, i_177_);
	if (aClass157_11518 == null)
	    aClass157_11518 = method3217(0, 0, aClass168_1966.method2710(),
					 aClass168_1966.method2711(), false);
	else
	    aClass157_11518.method2540(0, 0, aClass168_1966.method2710(),
				       aClass168_1966.method2711(), 0, 0);
	method3158(aClass168_Sub2_11520, -1166817212);
	method3188(1, -16777216);
	aClass157_11518.method2481(anInt1958 * 1000431205,
				   anInt1964 * 1482704485,
				   anInt1935 * -1588334531,
				   anInt1967 * -863940247);
	OpenGL.glBindBufferARB(35051, anIntArray11502[anInt11525]);
	OpenGL.glReadPixelsub(0, 0, anInt1962 * -1079316541,
			      anInt1963 * -1736975045, 32993, 5121, null, 0);
	OpenGL.glBindBufferARB(35051, 0);
	method3159(aClass168_Sub2_11520, -1876999470);
	aLongArray11522[anInt11525] = OpenGL.glFenceSync(37143, 0);
	anIntArray11523[anInt11525] = i;
	if (++anInt11525 >= 3)
	    anInt11525 = 0;
	method3161();
    }
    
    boolean method14855(Class165 class165, Class178 class178) {
	return aBool9307;
    }
    
    public final void method14805(Class373 class373, int i, int i_178_) {
	int i_179_;
	int i_180_;
	if (class373 == Class373.aClass373_3884) {
	    i_179_ = 1;
	    i_180_ = i_178_ * 2;
	} else if (class373 == Class373.aClass373_3889) {
	    i_179_ = 3;
	    i_180_ = i_178_ + 1;
	} else if (class373 == Class373.aClass373_3885) {
	    i_179_ = 4;
	    i_180_ = i_178_ * 3;
	} else if (class373 == Class373.aClass373_3887) {
	    i_179_ = 6;
	    i_180_ = i_178_ + 2;
	} else if (class373 == Class373.aClass373_3888) {
	    i_179_ = 5;
	    i_180_ = i_178_ + 2;
	} else {
	    i_179_ = 0;
	    i_180_ = i_178_;
	}
	OpenGL.glDrawArrays(i_179_, i, i_180_);
    }
    
    public Class168_Sub2 method3484() {
	return new Class168_Sub2_Sub3_Sub2(this);
    }
    
    void method14920() {
	aFloatArray11515[0] = aFloat9169 * aFloat9233;
	aFloatArray11515[1] = aFloat9169 * aFloat9299;
	aFloatArray11515[2] = aFloat9169 * aFloat9235;
	aFloatArray11515[3] = 1.0F;
	OpenGL.glLightModelfv(2899, aFloatArray11515, 0);
    }
    
    void method14921() {
	aFloatArray11515[0] = aFloat9169 * aFloat9233;
	aFloatArray11515[1] = aFloat9169 * aFloat9299;
	aFloatArray11515[2] = aFloat9169 * aFloat9235;
	aFloatArray11515[3] = 1.0F;
	OpenGL.glLightModelfv(2899, aFloatArray11515, 0);
    }
    
    void method14922() {
	aFloatArray11515[0] = aFloat9152 * aFloat9233;
	aFloatArray11515[1] = aFloat9152 * aFloat9299;
	aFloatArray11515[2] = aFloat9152 * aFloat9235;
	aFloatArray11515[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609, aFloatArray11515, 0);
	aFloatArray11515[0] = -aFloat9238 * aFloat9233;
	aFloatArray11515[1] = -aFloat9238 * aFloat9299;
	aFloatArray11515[2] = -aFloat9238 * aFloat9235;
	aFloatArray11515[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609, aFloatArray11515, 0);
    }
    
    boolean method14705(Class165 class165, Class178 class178) {
	return true;
    }
    
    void method14924() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass435_9173.aFloatArray4830, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9228, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9229, 0);
    }
    
    void method14925() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass435_9173.aFloatArray4830, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9228, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9229, 0);
    }
    
    final synchronized void method18122(int i) {
	Class525 class525 = new Class525();
	class525.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11489.method14345(class525, (byte) 0);
    }
    
    void method14852() {
	/* empty */
    }
    
    byte[] method18123(String string) {
	return method14661("gl", string);
    }
    
    void method14928() {
	if (aBool9226) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    void method14803() {
	if (aBool9226) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    void method14749() {
	if (aBool9226) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    void method14933() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass435_9173.aFloatArray4830, 0);
	int i;
	for (i = 0; i < anInt9214; i++) {
	    Class525_Sub21 class525_sub21 = aClass525_Sub21Array9239[i];
	    int i_181_ = class525_sub21.method16298(-337641115);
	    int i_182_ = 16386 + i;
	    float f = class525_sub21.method16306(-118222205) / 255.0F;
	    aFloatArray11515[0]
		= (float) class525_sub21.method16314(-1104743705);
	    aFloatArray11515[1]
		= (float) class525_sub21.method16312((short) 25606);
	    aFloatArray11515[2] = (float) class525_sub21.method16301((byte) 6);
	    aFloatArray11515[3] = 1.0F;
	    OpenGL.glLightfv(i_182_, 4611, aFloatArray11515, 0);
	    aFloatArray11515[0] = (float) (i_181_ >> 16 & 0xff) * f;
	    aFloatArray11515[1] = (float) (i_181_ >> 8 & 0xff) * f;
	    aFloatArray11515[2] = (float) (i_181_ & 0xff) * f;
	    aFloatArray11515[3] = 1.0F;
	    OpenGL.glLightfv(i_182_, 4609, aFloatArray11515, 0);
	    OpenGL.glLightf(i_182_, 4617,
			    (1.0F
			     / (float) (class525_sub21.method16332(1963620543)
					* class525_sub21
					      .method16332(1829124923))));
	    OpenGL.glEnable(i_182_);
	}
	for (/**/; i < anInt9241; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    public void method3149(int i, int i_183_, int[] is, int[] is_184_) {
	method18125(i, i_183_, is, is_184_);
    }
    
    boolean method14672(Class165 class165, Class178 class178) {
	return true;
    }
    
    final void method14809() {
	aFloatArray11515[0] = (float) (anInt9252 & 0xff0000) / 1.671168E7F;
	aFloatArray11515[1] = (float) (anInt9252 & 0xff00) / 65280.0F;
	aFloatArray11515[2] = (float) (anInt9252 & 0xff) / 255.0F;
	aFloatArray11515[3] = (float) (anInt9252 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705, aFloatArray11515, 0);
    }
    
    boolean method14802(Class165 class165, Class178 class178) {
	return aBool9307;
    }
    
    Interface38 method14943(Class165 class165, Class178 class178, int i,
			    int i_185_) {
	return method14728(class165, class178, i, i_185_);
    }
    
    void method3275(int i, int i_186_) throws Exception_Sub4 {
	aClass168_Sub1_1959.method14606();
	if (anInterface24_1943 != null)
	    anInterface24_1943.method133((byte) 52);
    }
    
    public void method3279() {
	OpenGL.glFinish();
    }
    
    public void method3291(int i, int i_187_) {
	int i_188_ = 0;
	if ((i & 0x1) != 0) {
	    OpenGL.glClearColor((float) (i_187_ & 0xff0000) / 1.671168E7F,
				(float) (i_187_ & 0xff00) / 65280.0F,
				(float) (i_187_ & 0xff) / 255.0F,
				(float) (i_187_ >>> 24) / 255.0F);
	    i_188_ = 16384;
	}
	if ((i & 0x2) != 0) {
	    method14710(true);
	    i_188_ |= 0x100;
	}
	if ((i & 0x4) != 0)
	    i_188_ |= 0x400;
	OpenGL.glClear(i_188_);
    }
    
    Interface38 method14946(int i, int i_189_, boolean bool, int[] is,
			    int i_190_, int i_191_) {
	return new Class490_Sub3(this, i, i_189_, bool, is, i_190_, i_191_);
    }
    
    Interface38 method14947(int i, int i_192_, boolean bool, int[] is,
			    int i_193_, int i_194_) {
	return new Class490_Sub3(this, i, i_192_, bool, is, i_193_, i_194_);
    }
    
    Interface38 method14846(int i, int i_195_, boolean bool, int[] is,
			    int i_196_, int i_197_) {
	return new Class490_Sub3(this, i, i_195_, bool, is, i_196_, i_197_);
    }
    
    Interface40 method14789(int i, boolean bool, int[][] is) {
	return new Class490_Sub2(this, i, bool, is);
    }
    
    Interface40 method14686(int i, boolean bool, int[][] is) {
	return new Class490_Sub2(this, i, bool, is);
    }
    
    Interface40 method14727(int i, boolean bool, int[][] is) {
	return new Class490_Sub2(this, i, bool, is);
    }
    
    Interface37 method14950(Class165 class165, int i, int i_198_, int i_199_,
			    boolean bool, byte[] is) {
	return new Class490_Sub1(this, class165, i, i_198_, i_199_, bool, is);
    }
    
    Interface37 method14821(Class165 class165, int i, int i_200_, int i_201_,
			    boolean bool, byte[] is) {
	return new Class490_Sub1(this, class165, i, i_200_, i_201_, bool, is);
    }
    
    Interface37 method14952(Class165 class165, int i, int i_202_, int i_203_,
			    boolean bool, byte[] is) {
	return new Class490_Sub1(this, class165, i, i_202_, i_203_, bool, is);
    }
    
    Interface37 method14881(Class165 class165, int i, int i_204_, int i_205_,
			    boolean bool, byte[] is) {
	return new Class490_Sub1(this, class165, i, i_204_, i_205_, bool, is);
    }
    
    public Class170 method3427() {
	int i = -1;
	if (aString11491.indexOf("nvidia") != -1)
	    i = 4318;
	else if (aString11491.indexOf("intel") != -1)
	    i = 32902;
	else if (aString11491.indexOf("ati") != -1)
	    i = 4098;
	return new Class170(i, method14813() ? "OpenGL FF" : "OpenGL",
			    anInt11488, aString11503, 0L, method14813());
    }
    
    void method15006() {
	if (aBool9291)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9292 & 0xff) / 255.0F);
	if (anInt9294 > 1) {
	    if (aByte9292 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    public void method3236() {
	OpenGL.glFinish();
    }
    
    void method14918() {
	aFloatArray11515[0] = aFloat9169 * aFloat9233;
	aFloatArray11515[1] = aFloat9169 * aFloat9299;
	aFloatArray11515[2] = aFloat9169 * aFloat9235;
	aFloatArray11515[3] = 1.0F;
	OpenGL.glLightModelfv(2899, aFloatArray11515, 0);
    }
    
    public void method15011() {
	int i = anIntArray11483[anInt9246];
	if (i != 0) {
	    anIntArray11483[anInt9246] = 0;
	    OpenGL.glBindTexture(i, 0);
	    OpenGL.glDisable(i);
	}
    }
    
    public void method3132() {
	if (aClass168_1966 != null) {
	    int i = aClass168_1966.method2710();
	    int i_206_ = aClass168_1966.method2711();
	    if (i > 0 || i_206_ > 0) {
		int i_207_ = anInt9268;
		int i_208_ = anInt9258;
		int i_209_ = anInt9250;
		int i_210_ = anInt9285;
		method3580();
		int i_211_ = anInt9209;
		int i_212_ = anInt9210;
		int i_213_ = anInt9319;
		int i_214_ = anInt9264;
		method3480();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method14904();
		method14756(false);
		method14713(false);
		method14807(false);
		method14710(false);
		method14731(null);
		method14800(1);
		method14779(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_206_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method3184(i_211_, i_213_, i_212_, i_214_);
		method3277(i_207_, i_208_, i_209_, i_210_);
	    }
	}
    }
    
    final void method14722(int i, Class371 class371, boolean bool,
			   boolean bool_215_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method18115(class371));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_215_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_215_ ? 769 : 768);
    }
    
    final void method14791(int i, Class371 class371, boolean bool,
			   boolean bool_216_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method18115(class371));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_216_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_216_ ? 769 : 768);
    }
    
    final void method14976(int i, Class371 class371, boolean bool,
			   boolean bool_217_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method18115(class371));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_217_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_217_ ? 769 : 768);
    }
    
    final void method15000() {
	aFloatArray11515[0] = (float) (anInt9252 & 0xff0000) / 1.671168E7F;
	aFloatArray11515[1] = (float) (anInt9252 & 0xff00) / 65280.0F;
	aFloatArray11515[2] = (float) (anInt9252 & 0xff) / 255.0F;
	aFloatArray11515[3] = (float) (anInt9252 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705, aFloatArray11515, 0);
    }
    
    void method3135() {
	super.method3135();
	if (anOpenGL11521 != null) {
	    anOpenGL11521.method1733();
	    anOpenGL11521.release();
	    anOpenGL11521 = null;
	}
    }
    
    public float method14992() {
	return 0.0F;
    }
    
    final void method14993() {
	aFloatArray11515[0] = (float) (anInt9252 & 0xff0000) / 1.671168E7F;
	aFloatArray11515[1] = (float) (anInt9252 & 0xff00) / 65280.0F;
	aFloatArray11515[2] = (float) (anInt9252 & 0xff) / 255.0F;
	aFloatArray11515[3] = (float) (anInt9252 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705, aFloatArray11515, 0);
    }
    
    void method14994() {
	OpenGL.glActiveTexture(33984 + anInt9246);
    }
    
    void method14995() {
	OpenGL.glActiveTexture(33984 + anInt9246);
    }
    
    void method15053() {
	OpenGL.glActiveTexture(33984 + anInt9246);
    }
    
    void method14758() {
	OpenGL.glActiveTexture(33984 + anInt9246);
    }
    
    void method14996() {
	OpenGL.glTexEnvi(8960, 34161,
			 method18105(aClass362Array9322[anInt9246]));
    }
    
    void method14997() {
	OpenGL.glTexEnvi(8960, 34161,
			 method18105(aClass362Array9322[anInt9246]));
    }
    
    void method14998() {
	OpenGL.glTexEnvi(8960, 34162,
			 method18105(aClass362Array9317[anInt9246]));
    }
    
    public void method14715(Class337 class337) {
	Class378[] class378s = class337.aClass378Array3630;
	int i = 0;
	boolean bool = false;
	boolean bool_218_ = false;
	boolean bool_219_ = false;
	for (int i_220_ = 0; i_220_ < class378s.length; i_220_++) {
	    Class378 class378 = class378s[i_220_];
	    Class487_Sub2 class487_sub2 = aClass487_Sub2Array11497[i_220_];
	    int i_221_ = 0;
	    int i_222_ = class487_sub2.method15795();
	    long l = class487_sub2.method7860();
	    class487_sub2.method7864();
	    for (int i_223_ = 0; i_223_ < class378.method6371(); i_223_++) {
		Class342 class342 = class378.method6372(i_223_);
		switch (class342.anInt3667) {
		case 2:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(1, 5126, i_222_,
					     l + (long) i_221_);
		    break;
		case 0:
		    OpenGL.glVertexPointer(3, 5126, i_222_, l + (long) i_221_);
		    bool_219_ = true;
		    break;
		case 7:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(4, 5126, i_222_,
					     l + (long) i_221_);
		    break;
		default:
		    break;
		case 8:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(3, 5126, i_222_,
					     l + (long) i_221_);
		    break;
		case 5:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(2, 5126, i_222_,
					     l + (long) i_221_);
		    break;
		case 11:
		    OpenGL.glNormalPointer(5126, i_222_, l + (long) i_221_);
		    bool_218_ = true;
		    break;
		case 3:
		    OpenGL.glColorPointer(4, 5121, i_222_, l + (long) i_221_);
		    bool = true;
		}
		i_221_ += class342.anInt3671;
	    }
	}
	if (aBool11504 != bool_219_) {
	    if (bool_219_)
		OpenGL.glEnableClientState(32884);
	    else
		OpenGL.glDisableClientState(32884);
	    aBool11504 = bool_219_;
	}
	if (aBool11493 != bool_218_) {
	    if (bool_218_)
		OpenGL.glEnableClientState(32885);
	    else
		OpenGL.glDisableClientState(32885);
	    aBool11493 = bool_218_;
	}
	if (aBool11494 != bool) {
	    if (bool)
		OpenGL.glEnableClientState(32886);
	    else
		OpenGL.glDisableClientState(32886);
	    aBool11494 = bool;
	}
	if (anInt11498 < i) {
	    for (int i_224_ = anInt11498; i_224_ < i; i_224_++) {
		OpenGL.glClientActiveTexture(33984 + i_224_);
		OpenGL.glEnableClientState(32888);
	    }
	    anInt11498 = i;
	} else if (anInt11498 > i) {
	    for (int i_225_ = i; i_225_ < anInt11498; i_225_++) {
		OpenGL.glClientActiveTexture(33984 + i_225_);
		OpenGL.glDisableClientState(32888);
	    }
	    anInt11498 = i;
	}
    }
    
    static int method18124(Class165 class165) {
	switch (class165.anInt1780 * -2093736709) {
	case 8:
	    return 6402;
	case 6:
	    return 6409;
	case 9:
	    return 6408;
	case 0:
	    return 6407;
	case 7:
	    return 6410;
	case 5:
	    return 6406;
	default:
	    throw new IllegalStateException();
	}
    }
    
    void method15001() {
	OpenGL.glTexEnvi(8960, 34162,
			 method18105(aClass362Array9317[anInt9246]));
    }
    
    void method15022() {
	aFloatArray11515[0] = aFloat9169 * aFloat9233;
	aFloatArray11515[1] = aFloat9169 * aFloat9299;
	aFloatArray11515[2] = aFloat9169 * aFloat9235;
	aFloatArray11515[3] = 1.0F;
	OpenGL.glLightModelfv(2899, aFloatArray11515, 0);
    }
    
    void method15007() {
	if (aBool9291)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9292 & 0xff) / 255.0F);
	if (anInt9294 > 1) {
	    if (aByte9292 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    void method14999() {
	if (aBool9290)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method15014() {
	if (aBool9281 && aBool9203 && anInt9283 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    public final synchronized void method3442(int i) {
	try {
	    method18106();
	} catch (Exception exception) {
	    return;
	}
	int i_226_ = 0;
	i &= 0x7fffffff;
	while (!aClass709_11485.method14363(1225137960)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11485.method14423(-1280469804);
	    anIntArray11492[i_226_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9167 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_226_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_226_, anIntArray11492, 0);
		i_226_ = 0;
	    }
	}
	if (i_226_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_226_, anIntArray11492, 0);
	    i_226_ = 0;
	}
	while (!aClass709_11486.method14363(-2093868453)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11486.method14423(-1608302724);
	    anIntArray11492[i_226_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9166 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_226_ == 1000) {
		OpenGL.glDeleteTextures(i_226_, anIntArray11492, 0);
		i_226_ = 0;
	    }
	}
	if (i_226_ > 0) {
	    OpenGL.glDeleteTextures(i_226_, anIntArray11492, 0);
	    i_226_ = 0;
	}
	while (!aClass709_11487.method14363(151128045)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11487.method14423(-1685091357);
	    anIntArray11492[i_226_++]
		= class525_sub42.anInt10858 * -1344652871;
	    if (i_226_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_226_, anIntArray11492, 0);
		i_226_ = 0;
	    }
	}
	if (i_226_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_226_, anIntArray11492, 0);
	    i_226_ = 0;
	}
	while (!aClass709_11517.method14363(-2095016152)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11517.method14423(-1578602040);
	    anIntArray11492[i_226_++]
		= (int) (class525_sub42.aLong7113 * -5126207504388691097L);
	    anInt9144 -= class525_sub42.anInt10858 * -1344652871;
	    if (i_226_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_226_, anIntArray11492, 0);
		i_226_ = 0;
	    }
	}
	if (i_226_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_226_, anIntArray11492, 0);
	    boolean bool = false;
	}
	while (!aClass709_11484.method14363(1851160627)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-1690977286);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	while (!aClass709_11489.method14363(1440292670)) {
	    Class525 class525 = aClass709_11489.method14423(-2112413150);
	    OpenGL.glDeleteProgram((int) (class525.aLong7113
					  * -5126207504388691097L));
	}
	while (!aClass709_11490.method14363(-2044146376)) {
	    Class525 class525 = aClass709_11490.method14423(-594887864);
	    OpenGL.glDeleteShader((int) (class525.aLong7113
					 * -5126207504388691097L));
	}
	while (!aClass709_11484.method14363(-1393998932)) {
	    Class525_Sub42 class525_sub42
		= (Class525_Sub42) aClass709_11484.method14423(-1707462771);
	    OpenGL.glDeleteLists((int) (class525_sub42.aLong7113
					* -5126207504388691097L),
				 class525_sub42.anInt10858 * -1344652871);
	}
	if (method3137() > 100663296
	    && Class251.method4508((byte) 8) > aLong11500 + 60000L) {
	    System.gc();
	    aLong11500 = Class251.method4508((byte) 8);
	}
	super.method3136(i);
    }
    
    final Interface44 method15016(boolean bool) {
	return new Class487_Sub1(this, Class178.aClass178_1909, bool);
    }
    
    final Interface35 method15017(boolean bool) {
	return new Class487_Sub2(this, bool);
    }
    
    public String method3306() {
	String string = "Caps: 4:";
	String string_227_ = ":";
	string = new StringBuilder().append(string).append(anInt9294).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append(anInt11512).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append(anInt9300).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append(anInt9163).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11505 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9305 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11509 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11511 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11508 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11496 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9307 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11506 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9306 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11507 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9302 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9303 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9304 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9309 ? 1 : 0).append
		     (string_227_).toString();
	string = new StringBuilder().append(string).append
		     (OpenGL.glGetString(35724).toLowerCase()).toString();
	return string;
    }
    
    boolean method14810(Class165 class165, Class178 class178) {
	return aBool9307;
    }
    
    Class337 method15020(Class378[] class378s) {
	return new Class337_Sub1(class378s);
    }
    
    public Interface22 method3490(int i, int i_228_, int i_229_) {
	return new Class520(this, Class165.aClass165_1774,
			    Class178.aClass178_1913, i, i_228_, i_229_);
    }
    
    long method18125(int i, int i_230_, int[] is, int[] is_231_) {
	if (aBool11513) {
	    if (aLongArray11522[anInt11524] != 0L) {
		OpenGL.glDeleteSync(aLongArray11522[anInt11524]);
		aLongArray11522[anInt11524] = 0L;
	    }
	    OpenGL.glBindBufferARB(35051, anIntArray11502[anInt11524]);
	    long l = OpenGL.glMapBufferARB(35051, 35000);
	    if (is != null) {
		for (int i_232_ = 0; i_232_ < i * i_230_; i_232_++)
		    is[i_232_] = anUnsafe9234.getInt(l + (long) (i_232_ * 4));
		if (OpenGL.glUnmapBufferARB(35051)) {
		    /* empty */
		}
		OpenGL.glBindBufferARB(35051, 0);
		l = 0L;
	    }
	    if (++anInt11524 >= 3)
		anInt11524 = 0;
	    return l;
	}
	if (aClass157_11519 == null)
	    method18121(i, i_230_);
	if (aClass157_11518 == null)
	    aClass157_11518 = method3217(0, 0, aClass168_1966.method2710(),
					 aClass168_1966.method2711(), false);
	else
	    aClass157_11518.method2540(0, 0, aClass168_1966.method2710(),
				       aClass168_1966.method2711(), 0, 0);
	method3158(aClass168_Sub2_11520, -1166817212);
	method3188(1, -16777216);
	aClass157_11518.method2481(anInt1958 * 1000431205,
				   anInt1964 * 1482704485,
				   anInt1935 * -1588334531,
				   anInt1967 * -863940247);
	aClass157_11519.method2475(0, 0, i, i_230_, is, is_231_, 0, i);
	method3159(aClass168_Sub2_11520, -1876999470);
	return 0L;
    }
    
    public void method15040(int i, Interface35 interface35) {
	aClass487_Sub2Array11497[i] = (Class487_Sub2) interface35;
    }
    
    public void method14901(int i, Interface35 interface35) {
	aClass487_Sub2Array11497[i] = (Class487_Sub2) interface35;
    }
    
    void method14816(Interface44 interface44) {
	aClass487_Sub1_11499 = (Class487_Sub1) interface44;
	aClass487_Sub1_11499.method7864();
    }
    
    void method15026(Interface44 interface44) {
	aClass487_Sub1_11499 = (Class487_Sub1) interface44;
	aClass487_Sub1_11499.method7864();
    }
    
    void method15049(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    void method18126() {
	if (anInt9293 == 1)
	    OpenGL.glDisable(2884);
	else {
	    OpenGL.glEnable(2884);
	    if (anInt9293 == 2)
		OpenGL.glCullFace(1029);
	    else if (anInt9293 == 3)
		OpenGL.glCullFace(1028);
	}
    }
    
    public final void method15034(Class373 class373, int i, int i_233_) {
	int i_234_;
	int i_235_;
	if (class373 == Class373.aClass373_3884) {
	    i_234_ = 1;
	    i_235_ = i_233_ * 2;
	} else if (class373 == Class373.aClass373_3889) {
	    i_234_ = 3;
	    i_235_ = i_233_ + 1;
	} else if (class373 == Class373.aClass373_3885) {
	    i_234_ = 4;
	    i_235_ = i_233_ * 3;
	} else if (class373 == Class373.aClass373_3887) {
	    i_234_ = 6;
	    i_235_ = i_233_ + 2;
	} else if (class373 == Class373.aClass373_3888) {
	    i_234_ = 5;
	    i_235_ = i_233_ + 2;
	} else {
	    i_234_ = 0;
	    i_235_ = i_233_;
	}
	OpenGL.glDrawArrays(i_234_, i, i_235_);
    }
    
    final void method14793(Interface44 interface44, Class373 class373, int i,
			   int i_236_, int i_237_, int i_238_) {
	int i_239_;
	int i_240_;
	if (class373 == Class373.aClass373_3884) {
	    i_239_ = 1;
	    i_240_ = i_238_ * 2;
	} else if (class373 == Class373.aClass373_3889) {
	    i_239_ = 3;
	    i_240_ = i_238_ + 1;
	} else if (class373 == Class373.aClass373_3885) {
	    i_239_ = 4;
	    i_240_ = i_238_ * 3;
	} else if (class373 == Class373.aClass373_3887) {
	    i_239_ = 6;
	    i_240_ = i_238_ + 2;
	} else if (class373 == Class373.aClass373_3888) {
	    i_239_ = 5;
	    i_240_ = i_238_ + 2;
	} else {
	    i_239_ = 0;
	    i_240_ = i_238_;
	}
	Class178 class178 = interface44.method326();
	Class487_Sub1 class487_sub1 = (Class487_Sub1) interface44;
	class487_sub1.method7864();
	OpenGL.glDrawElements(i_239_, i_240_, method18109(class178),
			      (class487_sub1.method7860()
			       + (long) (i_237_ * (class178.anInt1915
						   * -103623665))));
    }
    
    public void method14895(Class435 class435) {
	float[] fs = class435.aFloatArray4830;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    void method15052(boolean bool) {
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    void method15039(int i) {
	if (!aBool11514)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    Interface38 method15042(Class165 class165, int i, int i_241_, boolean bool,
			    float[] fs, int i_242_, int i_243_) {
	return new Class490_Sub3(this, class165, i, i_241_, bool, fs, i_242_,
				 i_243_);
    }
    
    Interface38 method14785(Class165 class165, int i, int i_244_, boolean bool,
			    float[] fs, int i_245_, int i_246_) {
	return new Class490_Sub3(this, class165, i, i_244_, bool, fs, i_245_,
				 i_246_);
    }
    
    public int method3333() {
	if (aBool11513) {
	    if (aLongArray11522[anInt11524] == 0L)
		return -1;
	    int i = OpenGL.glClientWaitSync(aLongArray11522[anInt11524], 0, 0);
	    if (i == 37149) {
		method3401();
		return -1;
	    }
	    return i != 37147 ? anIntArray11523[anInt11524] : -1;
	}
	return -1;
    }
    
    void method15045() {
	OpenGL.glMatrixMode(5890);
	if (aClass368Array9208[anInt9246] != Class368.aClass368_3866)
	    OpenGL.glLoadMatrixf(aClass435Array9248[anInt9246]
				     .method6974(aFloatArray11516),
				 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method15046(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    void method14797() {
	OpenGL.glMatrixMode(5890);
	if (aClass368Array9208[anInt9246] != Class368.aClass368_3866)
	    OpenGL.glLoadMatrixf(aClass435Array9248[anInt9246]
				     .method6974(aFloatArray11516),
				 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method15048(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    public Class174 method3438(Class174 class174, Class174 class174_247_,
			       float f, Class174 class174_248_) {
	return f < 0.5F ? class174 : class174_247_;
    }
    
    void method14759() {
	if (aBool9281 && aBool9203 && anInt9283 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    void method15050() {
	aFloat9218 = aFloat9206 - (float) anInt9284;
	aFloat9207 = aFloat9218 - (float) anInt9283;
	if (aFloat9207 < aFloat9237)
	    aFloat9207 = aFloat9237;
	if (aBool9156) {
	    OpenGL.glFogf(2915, aFloat9207);
	    OpenGL.glFogf(2916, aFloat9218);
	    aFloatArray11515[0] = (float) (anInt9282 & 0xff0000) / 1.671168E7F;
	    aFloatArray11515[1] = (float) (anInt9282 & 0xff00) / 65280.0F;
	    aFloatArray11515[2] = (float) (anInt9282 & 0xff) / 255.0F;
	    OpenGL.glFogfv(2918, aFloatArray11515, 0);
	}
    }
    
    void method15051(boolean bool) {
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    public final void method15035(Class373 class373, int i, int i_249_,
				  int i_250_, int i_251_) {
	int i_252_;
	int i_253_;
	if (class373 == Class373.aClass373_3884) {
	    i_252_ = 1;
	    i_253_ = i_251_ * 2;
	} else if (class373 == Class373.aClass373_3889) {
	    i_252_ = 3;
	    i_253_ = i_251_ + 1;
	} else if (class373 == Class373.aClass373_3885) {
	    i_252_ = 4;
	    i_253_ = i_251_ * 3;
	} else if (class373 == Class373.aClass373_3887) {
	    i_252_ = 6;
	    i_253_ = i_251_ + 2;
	} else if (class373 == Class373.aClass373_3888) {
	    i_252_ = 5;
	    i_253_ = i_251_ + 2;
	} else {
	    i_252_ = 0;
	    i_253_ = i_251_;
	}
	Class178 class178 = aClass487_Sub1_11499.method326();
	OpenGL.glDrawElements(i_252_, i_253_, method18109(class178),
			      (aClass487_Sub1_11499.method7860()
			       + (long) (i_250_ * (class178.anInt1915
						   * -103623665))));
    }
    
    void method14972(boolean bool) {
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    public boolean method14822() {
	return aBool11508;
    }
    
    byte[] method18127(String string) {
	return method14661("gl", string);
    }
    
    byte[] method18128(String string) {
	return method14661("gl", string);
    }
    
    Interface38 method14919(Class165 class165, int i, int i_254_, boolean bool,
			    byte[] is, int i_255_, int i_256_) {
	return new Class490_Sub3(this, class165, i, i_254_, bool, is, i_255_,
				 i_256_);
    }
    
    Interface38 method14735(Class165 class165, Class178 class178, int i,
			    int i_257_) {
	return method14728(class165, class178, i, i_257_);
    }
    
    final void method14709(int i, Class371 class371, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method18115(class371));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    static final int method18129(Class362 class362) {
	if (class362 == Class362.aClass362_3831)
	    return 7681;
	if (class362 == Class362.aClass362_3829)
	    return 8448;
	if (class362 == Class362.aClass362_3832)
	    return 34165;
	if (class362 == Class362.aClass362_3830)
	    return 260;
	if (class362 == Class362.aClass362_3833)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    public boolean method3220() {
	return aBool11513;
    }
    
    static final int method18130(Class362 class362) {
	if (class362 == Class362.aClass362_3831)
	    return 7681;
	if (class362 == Class362.aClass362_3829)
	    return 8448;
	if (class362 == Class362.aClass362_3832)
	    return 34165;
	if (class362 == Class362.aClass362_3830)
	    return 260;
	if (class362 == Class362.aClass362_3833)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    static final int method18131(Class362 class362) {
	if (class362 == Class362.aClass362_3831)
	    return 7681;
	if (class362 == Class362.aClass362_3829)
	    return 8448;
	if (class362 == Class362.aClass362_3832)
	    return 34165;
	if (class362 == Class362.aClass362_3830)
	    return 260;
	if (class362 == Class362.aClass362_3833)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    static final int method18132(Class362 class362) {
	if (class362 == Class362.aClass362_3831)
	    return 7681;
	if (class362 == Class362.aClass362_3829)
	    return 8448;
	if (class362 == Class362.aClass362_3832)
	    return 34165;
	if (class362 == Class362.aClass362_3830)
	    return 260;
	if (class362 == Class362.aClass362_3833)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    static final int method18133(Class371 class371) {
	if (class371 == Class371.aClass371_3879)
	    return 5890;
	if (class371 == Class371.aClass371_3880)
	    return 34167;
	if (class371 == Class371.aClass371_3878)
	    return 34168;
	if (class371 == Class371.aClass371_3881)
	    return 34166;
	throw new IllegalArgumentException();
    }
    
    static final int method18134(Class371 class371) {
	if (class371 == Class371.aClass371_3879)
	    return 5890;
	if (class371 == Class371.aClass371_3880)
	    return 34167;
	if (class371 == Class371.aClass371_3878)
	    return 34168;
	if (class371 == Class371.aClass371_3881)
	    return 34166;
	throw new IllegalArgumentException();
    }
    
    void method14690() {
	if (aBool9325)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    final synchronized void method18135(int i, int i_258_) {
	Class525_Sub42 class525_sub42 = new Class525_Sub42(i_258_);
	class525_sub42.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11485.method14345(class525_sub42, (byte) 0);
    }
    
    public boolean method3327() {
	if (aBool11513 && aLongArray11522[anInt11525] != 0L)
	    return false;
	return true;
    }
    
    public Class168_Sub2 method3319() {
	return new Class168_Sub2_Sub3_Sub2(this);
    }
    
    void method15047(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    final synchronized void method18136(int i, int i_259_) {
	Class525_Sub42 class525_sub42 = new Class525_Sub42(i_259_);
	class525_sub42.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11517.method14345(class525_sub42, (byte) 0);
    }
    
    final synchronized void method18137(int i, int i_260_) {
	Class525_Sub42 class525_sub42 = new Class525_Sub42(i_260_);
	class525_sub42.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11517.method14345(class525_sub42, (byte) 0);
    }
    
    Interface42 method14954(Class165 class165, Class178 class178, int i,
			    int i_261_) {
	return new Class490_Sub3(this, class165, class178, i, i_261_);
    }
    
    final synchronized void method18138(int i) {
	Class525 class525 = new Class525();
	class525.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11489.method14345(class525, (byte) 0);
    }
    
    void method14824() {
	OpenGL.glTexEnvi(8960, 34162,
			 method18105(aClass362Array9317[anInt9246]));
    }
    
    final void method14708() {
	aFloatArray11515[0] = (float) (anInt9252 & 0xff0000) / 1.671168E7F;
	aFloatArray11515[1] = (float) (anInt9252 & 0xff00) / 65280.0F;
	aFloatArray11515[2] = (float) (anInt9252 & 0xff) / 255.0F;
	aFloatArray11515[3] = (float) (anInt9252 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705, aFloatArray11515, 0);
    }
    
    static final int method18139(Class178 class178) {
	switch (class178.anInt1910 * -1868954147) {
	case 8:
	    return 5125;
	case 3:
	    return 5124;
	case 7:
	    return 5122;
	case 5:
	    return 5126;
	default:
	    return 5121;
	case 4:
	    return 5123;
	case 0:
	    return 5120;
	case 1:
	    return 5131;
	case 2:
	    return 5121;
	}
    }
    
    static final int method18140(Class178 class178) {
	switch (class178.anInt1910 * -1868954147) {
	case 8:
	    return 5125;
	case 3:
	    return 5124;
	case 7:
	    return 5122;
	case 5:
	    return 5126;
	default:
	    return 5121;
	case 4:
	    return 5123;
	case 0:
	    return 5120;
	case 1:
	    return 5131;
	case 2:
	    return 5121;
	}
    }
    
    final synchronized void method18141(int i, int i_262_) {
	Class525_Sub42 class525_sub42 = new Class525_Sub42(i_262_);
	class525_sub42.aLong7113 = (long) i * 2638983450515767383L;
	aClass709_11485.method14345(class525_sub42, (byte) 0);
    }
    
    static int method18142(Class165 class165) {
	switch (class165.anInt1780 * -2093736709) {
	case 8:
	    return 6402;
	case 6:
	    return 6409;
	case 9:
	    return 6408;
	case 0:
	    return 6407;
	case 7:
	    return 6410;
	case 5:
	    return 6406;
	default:
	    throw new IllegalStateException();
	}
    }
    
    void method14914() {
	OpenGL.glDepthMask(aBool9221 && aBool9222);
    }
    
    void method18143() {
	int i = 0;
	while (!anOpenGL11521.method1732()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class229.method4381(1000L);
	}
    }
    
    void method14718() {
	/* empty */
    }
    
    public Class168_Sub2 method3314() {
	return new Class168_Sub2_Sub3_Sub2(this);
    }
}
