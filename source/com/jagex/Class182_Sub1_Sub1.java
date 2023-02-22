/* Class182_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

import jagdx.Class361;
import jagdx.Class365;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.RuntimeException_Sub5;

public class Class182_Sub1_Sub1 extends Class182_Sub1
{
    D3DCAPS aD3DCAPS11438;
    int anInt11439;
    int[] anIntArray11440;
    long aLong11441 = 0L;
    D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11442;
    D3DDISPLAYMODE aD3DDISPLAYMODE11443;
    long aLong11444;
    Class709 aClass709_11445;
    boolean aBool11446;
    long aLong11447;
    long aLong11448;
    boolean aBool11449;
    boolean[] aBoolArray11450;
    boolean[] aBoolArray11451;
    int anInt11452;
    boolean[] aBoolArray11453;
    Class377[] aClass377Array11454;
    boolean aBool11455;
    Class435 aClass435_11456;
    Class273_Sub1 aClass273_Sub1_11457;
    long aLong11458;
    int anInt11459;
    boolean aBool11460;
    long[] aLongArray11461;
    boolean aBool11462;
    boolean[] aBoolArray11463;
    boolean aBool11464;
    long[] aLongArray11465;
    boolean aBool11466;
    int[] anIntArray11467;
    boolean aBool11468;
    boolean aBool11469;
    float[] aFloatArray11470;
    boolean aBool11471;
    int anInt11472;
    long[] aLongArray11473;
    static final int anInt11474 = 3;
    long aLong11475 = 0L;
    long aLong11476;
    boolean aBool11477;
    boolean aBool11478;
    int anInt11479;
    int anInt11480;
    static int[] anIntArray11481 = { 77, 80 };
    static int[] anIntArray11482 = { 22, 23 };
    
    void method14815() {
	if (aBool9156) {
	    int i = (aBoolArray11463[anInt9246]
		     ? method18056(aClass362Array9317[anInt9246]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 4, i);
	}
    }
    
    static final int method18045(Class371 class371) {
	switch (class371.anInt3882) {
	case 3:
	    return 3;
	case 0:
	    return 0;
	case 1:
	    return 1;
	case 2:
	    return 2;
	default:
	    throw new IllegalArgumentException();
	}
    }
    
    public boolean method14656(boolean bool) {
	if (bool)
	    return aBool11462;
	return aBool11462 && aBool11468;
    }
    
    Interface37 method14950(Class165 class165, int i, int i_0_, int i_1_,
			    boolean bool, byte[] is) {
	return new Class419_Sub2(this, class165, i, i_0_, i_1_, bool, is);
    }
    
    Class182_Sub1_Sub1
	(int i, int i_2_, long l, long l_3_, D3DDISPLAYMODE d3ddisplaymode,
	 D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps,
	 Class180 class180, Interface24 interface24, Interface47 interface47,
	 Interface48 interface48, Interface49 interface49, JS5 class458,
	 int i_4_) {
	super(class180, interface24, interface47, interface48, interface49,
	      class458, i_4_, 0);
	aClass709_11445 = new Class709();
	aBool11446 = false;
	aLong11444 = 0L;
	aLong11447 = 0L;
	aLong11448 = 0L;
	aBool11449 = false;
	aFloatArray11470 = new float[16];
	anInt11472 = 128;
	anInt11459 = 0;
	aLongArray11473 = new long[anInt11472];
	aLong11476 = 0L;
	aLongArray11465 = new long[3];
	aLongArray11461 = new long[3];
	anIntArray11440 = new int[3];
	anInt11479 = 0;
	anInt11480 = 0;
	try {
	    anInt11452 = i;
	    anInt11439 = i_2_;
	    aLong11441 = l;
	    aLong11475 = l_3_;
	    aD3DDISPLAYMODE11443 = d3ddisplaymode;
	    aD3DPRESENT_PARAMETERS11442 = d3dpresent_parameters;
	    aD3DCAPS11438 = d3dcaps;
	    aLong11444 = D3DLIGHT.Create();
	    aLong11447 = D3DLIGHT.Create();
	    aLong11448 = D3DLIGHT.Create();
	    anInt9300 = aD3DCAPS11438.MaxSimultaneousTextures;
	    anInt9163 = (aD3DCAPS11438.MaxActiveLights > 0
			 ? aD3DCAPS11438.MaxActiveLights : 8);
	    aBool11460 = (aD3DCAPS11438.TextureCaps & 0x2) == 0;
	    aBool9306 = (aD3DCAPS11438.TextureCaps & 0x800) != 0;
	    aBool9307 = (aD3DCAPS11438.TextureCaps & 0x2000) != 0;
	    aBool11477 = (aD3DCAPS11438.TextureCaps & 0x8000) != 0;
	    aBool11478 = (aD3DCAPS11438.TextureCaps & 0x10000) != 0;
	    aBool11471 = (aD3DCAPS11438.TextureCaps & 0x4000) != 0;
	    aBool9302 = aD3DCAPS11438.NumSimultaneousRTs > 0;
	    aBool9308 = aBool9302;
	    aBool9303 = aD3DCAPS11438.NumSimultaneousRTs > 0;
	    aBool9305 = (anInt9294 > 0
			 || (IDirect3D.CheckDeviceMultiSampleType
			     (aLong11441, anInt11452, anInt11439,
			      aD3DPRESENT_PARAMETERS11442.BackBufferFormat,
			      true, 2)) == 0);
	    aBool9304
		= (aD3DCAPS11438.NumSimultaneousRTs > 0 && anInt9294 > 0
		   || IDirect3D.CheckDeviceMultiSampleType(aLong11441,
							   anInt11452,
							   anInt11439, 113,
							   true, 2) == 0);
	    aBool11464
		= (IDirect3D.CheckDeviceFormat(aLong11441, anInt11452,
					       anInt11439,
					       (aD3DPRESENT_PARAMETERS11442
						.BackBufferFormat),
					       0, 1,
					       method14951('A', 'T', 'O', 'C'))
		   == 0);
	    aBool11455
		= (IDirect3D.CheckDeviceFormat(aLong11441, anInt11452,
					       anInt11439,
					       (aD3DPRESENT_PARAMETERS11442
						.BackBufferFormat),
					       0, 1,
					       method14951('A', '2', 'M', '1'))
		   == 0);
	    aBool11466
		= (IDirect3D.CheckDeviceFormat(aLong11441, anInt11452,
					       anInt11439,
					       (aD3DPRESENT_PARAMETERS11442
						.BackBufferFormat),
					       0, 1,
					       method14951('S', 'S', 'A', 'A'))
		   == 0);
	    aBool9309 = (aD3DCAPS11438.PrimitiveMiscCaps & 0x20000) != 0;
	    aBool11462
		= IDirect3D.CheckDeviceFormat(aLong11441, anInt11452,
					      anInt11439,
					      aD3DDISPLAYMODE11443.Format,
					      524288, 3, 113) == 0;
	    aBool11468
		= IDirect3D.CheckDeviceFormat(aLong11441, anInt11452,
					      anInt11439,
					      aD3DDISPLAYMODE11443.Format,
					      524288, 3, 116) == 0;
	    aBoolArray11450 = new boolean[anInt9300];
	    aBoolArray11451 = new boolean[anInt9300];
	    aBoolArray11463 = new boolean[anInt9300];
	    aClass377Array11454 = new Class377[anInt9300];
	    aBoolArray11453 = new boolean[anInt9300];
	    anIntArray11467 = new int[anInt9300];
	    Class444 class444 = new Class444();
	    class444.method7143(1.0F, -1.0F, 0.5F);
	    class444.method7147(0.0F, 0.0F, 0.5F);
	    aClass435_11456 = new Class435();
	    aClass435_11456.method7040(class444);
	    IDirect3DDevice.BeginScene(aLong11475);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method3134(-1721016810);
	    throw new RuntimeException("");
	}
    }
    
    void method14794() {
	for (Class525_Sub19 class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14372((short) -4556);
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-1985042577)) {
	    Interface52 interface52
		= (Interface52) class525_sub19.anObject10571;
	    interface52.method217();
	    if (interface52 == aClass168_1966)
		interface52.method350();
	}
	super.method14794();
    }
    
    void method14667() {
	method3178();
	for (Class525_Sub19 class525_sub19
		 = ((Class525_Sub19)
		    aClass709_11445.method14372((short) -19416));
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-1468687164)) {
	    Interface52 interface52
		= (Interface52) class525_sub19.anObject10571;
	    interface52.method127();
	}
	super.method14667();
    }
    
    void method15046(int i) {
	IDirect3DDevice.SetRenderState(aLong11475, 168, i);
    }
    
    void method14666() {
	for (int i = 0; i < anInt9300; i++) {
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 7, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 6, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 5, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 1, 1);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 2, 1);
	    aClass377Array11454[i] = Class377.aClass377_3903;
	    boolean[] bools = aBoolArray11450;
	    int i_5_ = i;
	    aBoolArray11451[i] = true;
	    bools[i_5_] = true;
	    aBoolArray11453[i] = false;
	    anIntArray11467[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState(aLong11475, 0, 6, 1);
	IDirect3DDevice.SetRenderState(aLong11475, 9, 2);
	IDirect3DDevice.SetRenderState(aLong11475, 23, 4);
	IDirect3DDevice.SetRenderState(aLong11475, 25, 5);
	IDirect3DDevice.SetRenderState(aLong11475, 24, 0);
	IDirect3DDevice.method15881(aLong11475, 206, aBool9309);
	IDirect3DDevice.SetRenderState(aLong11475, 181, 0);
	method18066();
	IDirect3DDevice.SetRenderState(aLong11475, 147, 1);
	IDirect3DDevice.SetRenderState(aLong11475, 145, 1);
	IDirect3DDevice.method15880(aLong11475, 38, 0.95F);
	IDirect3DDevice.SetRenderState(aLong11475, 35, 3);
	IDirect3DDevice.method15880(aLong11475, 154, 1.0F);
	D3DLIGHT.SetType(aLong11444, 3);
	D3DLIGHT.SetType(aLong11447, 3);
	D3DLIGHT.SetType(aLong11448, 1);
	aBool11449 = false;
	super.method14666();
    }
    
    void method14717() {
	if (aBool9156) {
	    D3DLIGHT.SetDirection(aLong11444, -aFloatArray9228[0],
				  -aFloatArray9228[1], -aFloatArray9228[2]);
	    D3DLIGHT.SetDirection(aLong11447, -aFloatArray9229[0],
				  -aFloatArray9229[1], -aFloatArray9229[2]);
	    aBool11449 = false;
	}
    }
    
    void method3267(int i, int i_6_) throws Exception_Sub4 {
	if (aBool11446) {
	    if (!method18064(aClass168_Sub1_1959.method2710(),
			     aClass168_Sub1_1959.method2711()))
		return;
	    ((Class168_Sub1_Sub2_Sub1) aClass168_Sub1_1959).method217();
	} else
	    IDirect3DDevice.EndScene(aLong11475);
	int i_7_ = aClass168_Sub1_1959.method14606();
	if (Class361.method6304(i_7_)) {
	    aBool11446 = true;
	    aClass168_Sub1_1959.method127();
	} else {
	    IDirect3DDevice.BeginScene(aLong11475);
	    if (anInterface24_1943 != null)
		anInterface24_1943.method133((byte) -41);
	}
    }
    
    public void method3133() {
	long l = IDirect3DDevice.CreateEventQuery(aLong11475);
	if (Class361.method6305(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    void method3135() {
	super.method3135();
	if (aLong11444 != 0L) {
	    D3DLIGHT.Destroy(aLong11444);
	    aLong11444 = 0L;
	}
	if (aLong11447 != 0L) {
	    D3DLIGHT.Destroy(aLong11447);
	    aLong11447 = 0L;
	}
	if (aLong11448 != 0L) {
	    D3DLIGHT.Destroy(aLong11448);
	    aLong11448 = 0L;
	}
	if (aLong11475 != 0L) {
	    IDirect3DDevice.Destroy(aLong11475);
	    aLong11475 = 0L;
	}
	if (aLong11441 != 0L) {
	    IUnknown.Release(aLong11441);
	    aLong11441 = 0L;
	}
    }
    
    public void finalize() {
	super.finalize();
    }
    
    public float method14674() {
	return -0.5F;
    }
    
    public Class168_Sub2 method3314() {
	return new Class168_Sub2_Sub3_Sub1(this);
    }
    
    Class168_Sub1 method3536(Canvas canvas, int i, int i_8_) {
	return new Class168_Sub1_Sub2_Sub1(this, canvas, i, i_8_, false);
    }
    
    Class525_Sub19 method18046(Interface52 interface52) {
	for (Class525_Sub19 class525_sub19
		 = ((Class525_Sub19)
		    aClass709_11445.method14372((short) -19832));
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-1944448964)) {
	    if (class525_sub19.anObject10571 == interface52)
		return class525_sub19;
	}
	return null;
    }
    
    public Interface22 method3163(int i, int i_9_) {
	return new Class440(this, Class178.aClass178_1913, i, i_9_, 0);
    }
    
    public Interface22 method3164(int i, int i_10_, int i_11_) {
	return new Class440(this, Class178.aClass178_1913, i, i_10_, i_11_);
    }
    
    Class525_Sub19 method18047(Interface52 interface52) {
	for (Class525_Sub19 class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14372((short) -3719);
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-1793829450)) {
	    if (class525_sub19.anObject10571 == interface52)
		return class525_sub19;
	}
	return null;
    }
    
    public boolean method3389() {
	return false;
    }
    
    void method18048(Interface52 interface52) {
	Class525_Sub19 class525_sub19 = method18047(interface52);
	if (class525_sub19 != null)
	    class525_sub19.method8755(-1933461091);
    }
    
    final Interface44 method15016(boolean bool) {
	return new Class423(this, Class178.aClass178_1909, bool);
    }
    
    public void method3166() {
	/* empty */
    }
    
    public boolean method3167() {
	return true;
    }
    
    public void method3178() {
	if (aLong11476 != 0L) {
	    IUnknown.Release(aLong11476);
	    aLong11476 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11465[i] != 0L) {
		IUnknown.Release(aLongArray11465[i]);
		aLongArray11465[i] = 0L;
	    }
	    if (aLongArray11461[i] != 0L) {
		IUnknown.Release(aLongArray11461[i]);
		aLongArray11461[i] = 0L;
	    }
	}
	anInt11480 = 0;
	anInt11479 = 0;
    }
    
    public Class170 method3130() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(aLong11441, anInt11452, 0,
				       d3dadapter_identifier);
	return new Class170(d3dadapter_identifier.VendorID,
			    method14813() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion,
			    method14813());
    }
    
    public boolean method3169() {
	return true;
    }
    
    public boolean method3170() {
	return false;
    }
    
    public void method3173(int i, int i_12_, int i_13_) {
	if (aLong11476 == 0L)
	    method18068(i_12_, i_13_);
	long l = IDirect3DDevice.GetRenderTarget(aLong11475, 0);
	if (!Class361.method6304
	     (IDirect3DDevice.StretchRect(aLong11475, l, 0, 0,
					  aClass168_1966.method2710(),
					  aClass168_1966.method2711(),
					  aLong11476, anInt1958 * 1000431205,
					  anInt1964 * 1482704485,
					  anInt1935 * -1588334531,
					  anInt1967 * -863940247, 2))) {
	    /* empty */
	}
	IUnknown.Release(l);
	IDirect3DDevice.GetRenderTargetData(aLong11475, aLong11476,
					    aLongArray11461[anInt11480]);
	long l_14_ = IDirect3DDevice.CreateEventQuery(aLong11475);
	if (Class361.method6305(IDirect3DEventQuery.Issue(l_14_)))
	    aLongArray11465[anInt11480] = l_14_;
	anIntArray11440[anInt11480] = i;
	if (++anInt11480 >= 3)
	    anInt11480 = 0;
    }
    
    void method14854() {
	for (Class525_Sub19 class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14372((short) -7994);
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-1116218344)) {
	    Interface52 interface52
		= (Interface52) class525_sub19.anObject10571;
	    interface52.method217();
	    if (interface52 == aClass168_1966)
		interface52.method350();
	}
	super.method14794();
    }
    
    public void method3401() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11465[i] != 0L) {
		IUnknown.Release(aLongArray11465[i]);
		aLongArray11465[i] = 0L;
	    }
	}
	anInt11480 = 0;
	anInt11479 = 0;
    }
    
    public long method3174(int i, int i_15_) {
	return method18049(i, i_15_, null, null);
    }
    
    public void method3149(int i, int i_16_, int[] is, int[] is_17_) {
	method18049(i, i_16_, is, is_17_);
    }
    
    long method18049(int i, int i_18_, int[] is, int[] is_19_) {
	if (aLongArray11465[anInt11479] != 0L) {
	    IUnknown.Release(aLongArray11465[anInt11479]);
	    aLongArray11465[anInt11479] = 0L;
	}
	aByteBuffer9271.clear();
	IDirect3DSurface.Download(aLongArray11461[anInt11479], 0, 0, i, i_18_,
				  i * 4, 0, aLong9160);
	if (++anInt11479 >= 3)
	    anInt11479 = 0;
	if (is != null) {
	    aByteBuffer9271.asIntBuffer().get(is);
	    return 0L;
	}
	return aLong9160;
    }
    
    Interface37 method14886(Class165 class165, int i, int i_20_, int i_21_,
			    boolean bool, byte[] is) {
	return new Class419_Sub2(this, class165, i, i_20_, i_21_, bool, is);
    }
    
    public boolean method14899(boolean bool) {
	if (bool)
	    return aBool11462;
	return aBool11462 && aBool11468;
    }
    
    public Class174 method3246(Class174 class174, Class174 class174_22_,
			       float f, Class174 class174_23_) {
	return f < 0.5F ? class174 : class174_22_;
    }
    
    public void method3188(int i, int i_24_) {
	IDirect3DDevice.Clear(aLong11475, i, i_24_, 1.0F, 0);
    }
    
    void method15019() {
	if (aClass168_1966 != null)
	    IDirect3DDevice.SetViewport(aLong11475, anInt9219 + anInt9268,
					anInt9224 + anInt9258, anInt9250,
					anInt9285, aFloat9201, aFloat9202);
    }
    
    void method14689() {
	IDirect3DDevice.SetScissorRect(aLong11475, anInt9219 + anInt9209,
				       anInt9224 + anInt9319, anInt9210,
				       anInt9264);
    }
    
    void method14690() {
	IDirect3DDevice.method15881(aLong11475, 174, aBool9325);
    }
    
    final void method18050(long l) {
	aLong11458 = l;
	IDirect3DDevice.SetVertexShader(aLong11475, l);
    }
    
    void method14753(int i) {
	IDirect3DDevice.SetRenderState(aLong11475, 168, i);
    }
    
    void method14912() {
	IDirect3DDevice.method15881(aLong11475, 7, aBool9223 && aBool9175);
    }
    
    void method15047(int i) {
	IDirect3DDevice.SetRenderState(aLong11475, 168, i);
    }
    
    public final void method14805(Class373 class373, int i, int i_25_) {
	if (aClass273_Sub1_11457 != null)
	    aClass273_Sub1_11457.method15682();
	IDirect3DDevice.DrawPrimitive(aLong11475, method18060(class373), i,
				      i_25_);
    }
    
    Interface40 method14789(int i, boolean bool, int[][] is) {
	return new Class419_Sub1(this, i, bool, is);
    }
    
    void method18051(int i, int i_26_) {
	method3178();
	method3177(i, i_26_, (short) -25950);
	aLong11476
	    = (IDirect3DDevice.CreateRenderTarget
	       (aLong11475, i, i_26_,
		method18071(Class165.aClass165_1771, Class178.aClass178_1905),
		0, 0, false));
	for (int i_27_ = 0; i_27_ < 3; i_27_++)
	    aLongArray11461[i_27_]
		= (IDirect3DDevice.CreateOffscreenPlainSurface
		   (aLong11475, i, i_26_,
		    method18071(Class165.aClass165_1771,
				Class178.aClass178_1905),
		    2));
	method14790(i * i_26_ * 4);
    }
    
    void method15022() {
	if (aBool9156) {
	    D3DLIGHT.SetAmbient(aLong11444, aFloat9233 * aFloat9169,
				aFloat9299 * aFloat9169,
				aFloat9235 * aFloat9169, 0.0F);
	    aBool11449 = false;
	}
    }
    
    void method14716() {
	if (aBool9156) {
	    float f = aBool9226 ? aFloat9152 : 0.0F;
	    float f_28_ = aBool9226 ? -aFloat9238 : 0.0F;
	    D3DLIGHT.SetDiffuse(aLong11444, f * aFloat9233, f * aFloat9299,
				f * aFloat9235, 0.0F);
	    D3DLIGHT.SetDiffuse(aLong11447, f_28_ * aFloat9233,
				f_28_ * aFloat9299, f_28_ * aFloat9235, 0.0F);
	    aBool11449 = false;
	}
    }
    
    Interface38 method14908(Class165 class165, int i, int i_29_, boolean bool,
			    float[] fs, int i_30_, int i_31_) {
	return new Class419_Sub3(this, class165, i, i_29_, bool, fs, i_30_,
				 i_31_);
    }
    
    public final synchronized void method3442(int i) {
	for (int i_32_ = 0; i_32_ < anInt11459; i_32_++)
	    IUnknown.Release(aLongArray11473[i_32_]);
	anInt11459 = 0;
	super.method3136(i);
    }
    
    void method14718() {
	if (aBool9156 && !aBool11449) {
	    IDirect3DDevice.LightEnable(aLong11475, 0, false);
	    IDirect3DDevice.LightEnable(aLong11475, 1, false);
	    IDirect3DDevice.SetLight(aLong11475, 0, aLong11444);
	    IDirect3DDevice.SetLight(aLong11475, 1, aLong11447);
	    IDirect3DDevice.LightEnable(aLong11475, 0, true);
	    IDirect3DDevice.LightEnable(aLong11475, 1, true);
	    aBool11449 = true;
	}
    }
    
    void method14702() {
	int i;
	for (i = 0; i < anInt9214; i++) {
	    Class525_Sub21 class525_sub21 = aClass525_Sub21Array9239[i];
	    int i_33_ = i + 2;
	    int i_34_ = class525_sub21.method16298(-1989680371);
	    float f = class525_sub21.method16306(-420167208) / 255.0F;
	    D3DLIGHT.SetPosition(aLong11448,
				 (float) class525_sub21.method16314(419449237),
				 (float) class525_sub21
					     .method16312((short) 26081),
				 (float) class525_sub21.method16301((byte) 6));
	    D3DLIGHT.SetDiffuse(aLong11448, (float) (i_34_ >> 16 & 0xff) * f,
				(float) (i_34_ >> 8 & 0xff) * f,
				(float) (i_34_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(aLong11448, 0.0F, 0.0F,
		 1.0F / (float) (class525_sub21.method16332(1902197608)
				 * class525_sub21.method16332(1877172984)));
	    D3DLIGHT.SetRange(aLong11448,
			      (float) class525_sub21.method16332(2051111376));
	    IDirect3DDevice.SetLight(aLong11475, i_33_, aLong11448);
	    IDirect3DDevice.LightEnable(aLong11475, i_33_, true);
	}
	for (/**/; i < anInt9241; i++)
	    IDirect3DDevice.LightEnable(aLong11475, i + 2, false);
    }
    
    public boolean method14657() {
	return (aD3DCAPS11438.VertexShaderVersion & 0xffff) >= 257;
    }
    
    void method18052() {
	IDirect3DDevice.SetRenderState(aLong11475, 22, anInt9293);
    }
    
    void method14917() {
	if (aBool9156)
	    IDirect3DDevice.method15881(aLong11475, 137,
					aBool9225 && !aBool9227);
    }
    
    Interface38 method14726(int i, int i_35_, boolean bool, int[] is,
			    int i_36_, int i_37_) {
	return new Class419_Sub3(this, i, i_35_, bool, is, i_36_, i_37_);
    }
    
    Interface38 method14877(Class165 class165, int i, int i_38_, boolean bool,
			    byte[] is, int i_39_, int i_40_) {
	return new Class419_Sub3(this, class165, i, i_38_, bool, is, i_39_,
				 i_40_);
    }
    
    public void method3552(long l) {
	/* empty */
    }
    
    Interface42 method14728(Class165 class165, Class178 class178, int i,
			    int i_41_) {
	return new Class419_Sub3_Sub1(this, class165, class178, i, i_41_);
    }
    
    Interface40 method14806(int i, boolean bool, int[][] is) {
	return new Class419_Sub1(this, i, bool, is);
    }
    
    public void method14715(Class337 class337) {
	Class337_Sub2 class337_sub2 = (Class337_Sub2) class337;
	IDirect3DDevice.SetVertexDeclaration(aLong11475,
					     class337_sub2.aLong10296);
    }
    
    final void method18053(Class419 class419) {
	IDirect3DDevice.SetTexture(aLong11475, anInt9246,
				   class419.method6735());
	if (aBool9156 && !aBoolArray11463[anInt9246]) {
	    aBoolArray11463[anInt9246] = true;
	    method14815();
	    method14747();
	}
    }
    
    final void method18054(Class419_Sub3 class419_sub3) {
	method18053(class419_sub3);
	if (aBoolArray11450[anInt9246] != class419_sub3.aBool10238) {
	    IDirect3DDevice.SetSamplerState(aLong11475, anInt9246, 1,
					    class419_sub3.aBool10238 ? 1 : 3);
	    aBoolArray11450[anInt9246] = class419_sub3.aBool10238;
	}
	if (aBoolArray11451[anInt9246] != class419_sub3.aBool10242) {
	    IDirect3DDevice.SetSamplerState(aLong11475, anInt9246, 2,
					    class419_sub3.aBool10242 ? 1 : 3);
	    aBoolArray11451[anInt9246] = class419_sub3.aBool10242;
	}
    }
    
    final void method18055(Class419_Sub2 class419_sub2) {
	method18053(class419_sub2);
	if (!aBoolArray11450[anInt9246]) {
	    IDirect3DDevice.SetSamplerState(aLong11475, anInt9246, 1, 1);
	    aBoolArray11450[anInt9246] = true;
	}
	if (!aBoolArray11451[anInt9246]) {
	    IDirect3DDevice.SetSamplerState(aLong11475, anInt9246, 2, 1);
	    aBoolArray11451[anInt9246] = true;
	}
    }
    
    public void method14757() {
	if (aBoolArray11463[anInt9246]) {
	    aBoolArray11463[anInt9246] = false;
	    IDirect3DDevice.SetTexture(aLong11475, anInt9246, 0L);
	    method14815();
	    method14747();
	}
    }
    
    void method14745() {
	if (aLong11458 == 0L
	    && aClass368Array9208[anInt9246] != Class368.aClass368_3866) {
	    if (aClass368Array9208[anInt9246] == Class368.aClass368_3868)
		IDirect3DDevice.SetTransform
		    (aLong11475, 16 + anInt9246,
		     aClass435Array9248[anInt9246]
			 .method6980(aFloatArray11470));
	    else
		IDirect3DDevice.SetTransform
		    (aLong11475, 16 + anInt9246,
		     aClass435Array9248[anInt9246]
			 .method6974(aFloatArray11470));
	    int i = method18065(aClass368Array9208[anInt9246]);
	    if (i != anIntArray11467[anInt9246]) {
		IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 24,
						     i);
		anIntArray11467[anInt9246] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 24, 0);
	    anIntArray11467[anInt9246] = 0;
	}
    }
    
    void method14746() {
	/* empty */
    }
    
    public boolean method14822() {
	return (aD3DCAPS11438.VertexShaderVersion & 0xffff) >= 257;
    }
    
    boolean method14855(Class165 class165, Class178 class178) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class361.method6305(IDirect3D.GetAdapterDisplayMode
				    (aLong11441, anInt11452, d3ddisplaymode))
		&& Class361.method6305(IDirect3D.CheckDeviceFormat
				       (aLong11441, anInt11452, anInt11439,
					d3ddisplaymode.Format, 0, 4,
					method18071(class165, class178))));
    }
    
    final void method14673(int i, Class371 class371, boolean bool,
			   boolean bool_42_) {
	if (aBool9156) {
	    int i_43_ = 0;
	    int i_44_;
	    switch (i) {
	    case 1:
		i_44_ = 3;
		break;
	    case 2:
		i_44_ = 26;
		break;
	    default:
		i_44_ = 2;
	    }
	    if (bool)
		i_43_ |= 0x20;
	    if (bool_42_)
		i_43_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, i_44_,
						 (method18057(class371)
						  | i_43_));
	}
    }
    
    final void method14737(int i, Class371 class371, boolean bool) {
	if (aBool9156) {
	    int i_45_ = 0;
	    int i_46_;
	    switch (i) {
	    default:
		i_46_ = 5;
		break;
	    case 2:
		i_46_ = 27;
		break;
	    case 1:
		i_46_ = 6;
	    }
	    if (bool)
		i_45_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, i_46_,
						 (method18057(class371)
						  | i_45_));
	}
    }
    
    void method14928() {
	method14716();
	method14718();
    }
    
    static final int method18056(Class362 class362) {
	switch (class362.anInt3828) {
	case 1:
	    return 26;
	case 0:
	    return 10;
	default:
	    throw new IllegalArgumentException();
	case 3:
	    return 4;
	case 4:
	    return 2;
	case 2:
	    return 7;
	}
    }
    
    static final int method18057(Class371 class371) {
	switch (class371.anInt3882) {
	case 3:
	    return 3;
	case 0:
	    return 0;
	case 1:
	    return 1;
	case 2:
	    return 2;
	default:
	    throw new IllegalArgumentException();
	}
    }
    
    Interface38 method14653(Class165 class165, int i, int i_47_, boolean bool,
			    byte[] is, int i_48_, int i_49_) {
	return new Class419_Sub3(this, class165, i, i_47_, bool, is, i_48_,
				 i_49_);
    }
    
    void method14885() {
	method3178();
	for (Class525_Sub19 class525_sub19
		 = ((Class525_Sub19)
		    aClass709_11445.method14372((short) -29302));
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-1793470218)) {
	    Interface52 interface52
		= (Interface52) class525_sub19.anObject10571;
	    interface52.method127();
	}
	super.method14667();
    }
    
    void method14711() {
	IDirect3DDevice.method15881(aLong11475, 7, aBool9223 && aBool9175);
    }
    
    void method14780() {
	switch (aClass367_9289.anInt3862) {
	case 2:
	    IDirect3DDevice.SetRenderState(aLong11475, 19, 9);
	    IDirect3DDevice.SetRenderState(aLong11475, 20, 2);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState(aLong11475, 19, 5);
	    IDirect3DDevice.SetRenderState(aLong11475, 20, 6);
	    break;
	case 1:
	    IDirect3DDevice.SetRenderState(aLong11475, 19, 2);
	    IDirect3DDevice.SetRenderState(aLong11475, 20, 1);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState(aLong11475, 19, 2);
	    IDirect3DDevice.SetRenderState(aLong11475, 20, 2);
	    break;
	}
	switch (anInt9288) {
	case 2:
	    IDirect3DDevice.SetRenderState(aLong11475, 207, 2);
	    IDirect3DDevice.SetRenderState(aLong11475, 208, 2);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState(aLong11475, 207, 1);
	    IDirect3DDevice.SetRenderState(aLong11475, 208, 1);
	    break;
	case 1:
	    IDirect3DDevice.SetRenderState(aLong11475, 207, 2);
	    IDirect3DDevice.SetRenderState(aLong11475, 208, 1);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState(aLong11475, 207, 1);
	    IDirect3DDevice.SetRenderState(aLong11475, 208, 2);
	    break;
	}
    }
    
    void method14808() {
	IDirect3DDevice.method15881(aLong11475, 27, aBool9290);
    }
    
    public void method14700(Class435 class435) {
	class435.method6950(aClass435_11456);
    }
    
    boolean method14705(Class165 class165, Class178 class178) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class361.method6305(IDirect3D.GetAdapterDisplayMode
				    (aLong11441, anInt11452, d3ddisplaymode))
		&& Class361.method6305(IDirect3D.CheckDeviceFormat
				       (aLong11441, anInt11452, anInt11439,
					d3ddisplaymode.Format, 0, 3,
					method18071(class165, class178))));
    }
    
    void method14889() {
	aFloat9218 = aFloat9206 - (float) anInt9284;
	aFloat9207 = aFloat9218 - (float) anInt9283;
	if (aFloat9207 < aFloat9237)
	    aFloat9207 = aFloat9237;
	if (aBool9156) {
	    IDirect3DDevice.method15880(aLong11475, 36, aFloat9207);
	    IDirect3DDevice.method15880(aLong11475, 37, aFloat9218);
	    IDirect3DDevice.SetRenderState(aLong11475, 34, anInt9282);
	}
    }
    
    void method14936(boolean bool) {
	IDirect3DDevice.method15881(aLong11475, 161, bool);
    }
    
    final Interface44 method14701(boolean bool) {
	return new Class423(this, Class178.aClass178_1909, bool);
    }
    
    final Interface35 method14761(boolean bool) {
	return new Class421(this, bool);
    }
    
    Class337 method14762(Class378[] class378s) {
	return new Class337_Sub2(this, class378s);
    }
    
    public boolean method3327() {
	if (aBool11446)
	    return false;
	if (aLongArray11465[anInt11480] != 0L)
	    return false;
	return true;
    }
    
    public void method14764(int i, Interface35 interface35) {
	Class421 class421 = (Class421) interface35;
	IDirect3DDevice.SetStreamSource(aLong11475, i, class421.aLong4692, 0,
					class421.method6745());
    }
    
    public final synchronized void method3136(int i) {
	for (int i_50_ = 0; i_50_ < anInt11459; i_50_++)
	    IUnknown.Release(aLongArray11473[i_50_]);
	anInt11459 = 0;
	super.method3136(i);
    }
    
    public final void method15003(Class373 class373, int i, int i_51_) {
	if (aClass273_Sub1_11457 != null)
	    aClass273_Sub1_11457.method15682();
	IDirect3DDevice.DrawPrimitive(aLong11475, method18060(class373), i,
				      i_51_);
    }
    
    void method3273(int i, int i_52_) throws Exception_Sub4 {
	if (aBool11446) {
	    if (!method18064(aClass168_Sub1_1959.method2710(),
			     aClass168_Sub1_1959.method2711()))
		return;
	    ((Class168_Sub1_Sub2_Sub1) aClass168_Sub1_1959).method217();
	} else
	    IDirect3DDevice.EndScene(aLong11475);
	int i_53_ = aClass168_Sub1_1959.method14606();
	if (Class361.method6304(i_53_)) {
	    aBool11446 = true;
	    aClass168_Sub1_1959.method127();
	} else {
	    IDirect3DDevice.BeginScene(aLong11475);
	    if (anInterface24_1943 != null)
		anInterface24_1943.method133((byte) 51);
	}
    }
    
    public final void method14697(Class373 class373, int i, int i_54_,
				  int i_55_, int i_56_) {
	if (aClass273_Sub1_11457 != null)
	    aClass273_Sub1_11457.method15682();
	IDirect3DDevice.DrawIndexedPrimitive(aLong11475, method18060(class373),
					     0, i, i_54_, i_55_, i_56_);
    }
    
    byte[] method18058(String string) {
	return method14661("dx", string);
    }
    
    public Class266 method14660(String string) {
	byte[] is = method18058(string);
	if (is == null)
	    return null;
	Class262 class262 = method14865(is);
	return new Class266_Sub2(this, class262);
    }
    
    void method14867() {
	IDirect3DDevice.SetScissorRect(aLong11475, anInt9219 + anInt9209,
				       anInt9224 + anInt9319, anInt9210,
				       anInt9264);
    }
    
    void method15027(Interface44 interface44) {
	IDirect3DDevice.SetIndices(aLong11475,
				   ((Class423) interface44).aLong4715);
    }
    
    static final int method18059(Class178 class178) {
	if (class178 == Class178.aClass178_1909)
	    return 80;
	if (class178 == Class178.aClass178_1913)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    static final int method18060(Class373 class373) {
	switch (class373.anInt3886) {
	case 4:
	    return 2;
	case 3:
	    return 5;
	case 1:
	    return 6;
	case 2:
	    return 4;
	case 5:
	    return 3;
	case 0:
	    return 1;
	default:
	    throw new IllegalArgumentException("");
	}
    }
    
    public void method3269(boolean bool) {
	/* empty */
    }
    
    void method14925() {
	if (aBool9156) {
	    D3DLIGHT.SetDirection(aLong11444, -aFloatArray9228[0],
				  -aFloatArray9228[1], -aFloatArray9228[2]);
	    D3DLIGHT.SetDirection(aLong11447, -aFloatArray9229[0],
				  -aFloatArray9229[1], -aFloatArray9229[2]);
	    aBool11449 = false;
	}
    }
    
    synchronized void method18061(long l) {
	if (anInt11459 == anInt11472) {
	    anInt11472 *= 2;
	    long[] ls = new long[anInt11472];
	    System.arraycopy(aLongArray11473, 0, ls, 0, anInt11459);
	    aLongArray11473 = ls;
	}
	aLongArray11473[anInt11459] = l;
	anInt11459++;
    }
    
    void method14872(int i) {
	if (!aBool11469) {
	    int i_57_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState(aLong11475, 8, i_57_);
	}
    }
    
    void method15053() {
	/* empty */
    }
    
    public Class170 method3270() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(aLong11441, anInt11452, 0,
				       d3dadapter_identifier);
	return new Class170(d3dadapter_identifier.VendorID,
			    method14813() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion,
			    method14813());
    }
    
    public Class170 method3427() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(aLong11441, anInt11452, 0,
				       d3dadapter_identifier);
	return new Class170(d3dadapter_identifier.VendorID,
			    method14813() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion,
			    method14813());
    }
    
    void method14714() {
	if (aBool9156)
	    IDirect3DDevice.method15881(aLong11475, 137,
					aBool9225 && !aBool9227);
    }
    
    void method14922() {
	if (aBool9156) {
	    float f = aBool9226 ? aFloat9152 : 0.0F;
	    float f_58_ = aBool9226 ? -aFloat9238 : 0.0F;
	    D3DLIGHT.SetDiffuse(aLong11444, f * aFloat9233, f * aFloat9299,
				f * aFloat9235, 0.0F);
	    D3DLIGHT.SetDiffuse(aLong11447, f_58_ * aFloat9233,
				f_58_ * aFloat9299, f_58_ * aFloat9235, 0.0F);
	    aBool11449 = false;
	}
    }
    
    void method3183(int i, int i_59_) throws Exception_Sub4 {
	if (aBool11446) {
	    if (!method18064(aClass168_Sub1_1959.method2710(),
			     aClass168_Sub1_1959.method2711()))
		return;
	    ((Class168_Sub1_Sub2_Sub1) aClass168_Sub1_1959).method217();
	} else
	    IDirect3DDevice.EndScene(aLong11475);
	int i_60_ = aClass168_Sub1_1959.method14606();
	if (Class361.method6304(i_60_)) {
	    aBool11446 = true;
	    aClass168_Sub1_1959.method127();
	} else {
	    IDirect3DDevice.BeginScene(aLong11475);
	    if (anInterface24_1943 != null)
		anInterface24_1943.method133((byte) 34);
	}
    }
    
    void method3275(int i, int i_61_) throws Exception_Sub4 {
	if (aBool11446) {
	    if (!method18064(aClass168_Sub1_1959.method2710(),
			     aClass168_Sub1_1959.method2711()))
		return;
	    ((Class168_Sub1_Sub2_Sub1) aClass168_Sub1_1959).method217();
	} else
	    IDirect3DDevice.EndScene(aLong11475);
	int i_62_ = aClass168_Sub1_1959.method14606();
	if (Class361.method6304(i_62_)) {
	    aBool11446 = true;
	    aClass168_Sub1_1959.method127();
	} else {
	    IDirect3DDevice.BeginScene(aLong11475);
	    if (anInterface24_1943 != null)
		anInterface24_1943.method133((byte) -17);
	}
    }
    
    public void method3276() {
	long l = IDirect3DDevice.CreateEventQuery(aLong11475);
	if (Class361.method6305(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    static boolean method18062(int i, int i_63_, long l, int i_64_,
			       D3DDISPLAYMODE d3ddisplaymode,
			       D3DPRESENT_PARAMETERS d3dpresent_parameters) {
	int i_65_ = 0;
	int i_66_ = 0;
	int i_67_ = 0;
	boolean bool;
	try {
	    if (Class361.method6304
		(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
		return false;
	while_87_:
	    for (/**/; i_64_ >= 0; i_64_--) {
		if (i_64_ != 1) {
		    i_67_ = 0 + i_64_;
		    for (int i_68_ = 0; i_68_ < anIntArray11482.length;
			 i_68_++) {
			if (IDirect3D.CheckDeviceType(l, i, i_63_,
						      d3ddisplaymode.Format,
						      anIntArray11482[i_68_],
						      true) == 0
			    && IDirect3D.CheckDeviceFormat(l, i, i_63_,
							   (d3ddisplaymode
							    .Format),
							   1, 1,
							   (anIntArray11482
							    [i_68_])) == 0
			    && (i_64_ == 0
				|| (IDirect3D.CheckDeviceMultiSampleType
				    (l, i, i_63_, anIntArray11482[i_68_], true,
				     i_67_)) == 0)) {
			    for (int i_69_ = 0; i_69_ < anIntArray11481.length;
				 i_69_++) {
				if ((IDirect3D.CheckDeviceFormat
				     (l, i, i_63_, d3ddisplaymode.Format, 2, 1,
				      anIntArray11481[i_69_])) == 0
				    && (IDirect3D.CheckDepthStencilMatch
					(l, i, i_63_, d3ddisplaymode.Format,
					 anIntArray11482[i_68_],
					 anIntArray11481[i_69_])) == 0
				    && (i_64_ == 0
					|| (IDirect3D
						.CheckDeviceMultiSampleType
					    (l, i, i_63_,
					     anIntArray11481[i_68_], true,
					     i_67_)) == 0)) {
				    i_66_ = anIntArray11482[i_68_];
				    i_65_ = anIntArray11481[i_69_];
				    break while_87_;
				}
			    }
			}
		    }
		}
	    }
	    if (i_64_ < 0 || i_66_ == 0 || i_65_ == 0)
		return false;
	    d3dpresent_parameters.BackBufferFormat = i_66_;
	    d3dpresent_parameters.AutoDepthStencilFormat = i_65_;
	    d3dpresent_parameters.MultiSampleType = i_67_;
	    d3dpresent_parameters.MultiSampleQuality = 0;
	    bool = true;
	} catch (Throwable throwable) {
	    return false;
	}
	return bool;
    }
    
    public void method3586() {
	long l = IDirect3DDevice.CreateEventQuery(aLong11475);
	if (Class361.method6305(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    public void method3279() {
	long l = IDirect3DDevice.CreateEventQuery(aLong11475);
	if (Class361.method6305(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    void method3280() {
	super.method3135();
	if (aLong11444 != 0L) {
	    D3DLIGHT.Destroy(aLong11444);
	    aLong11444 = 0L;
	}
	if (aLong11447 != 0L) {
	    D3DLIGHT.Destroy(aLong11447);
	    aLong11447 = 0L;
	}
	if (aLong11448 != 0L) {
	    D3DLIGHT.Destroy(aLong11448);
	    aLong11448 = 0L;
	}
	if (aLong11475 != 0L) {
	    IDirect3DDevice.Destroy(aLong11475);
	    aLong11475 = 0L;
	}
	if (aLong11441 != 0L) {
	    IUnknown.Release(aLong11441);
	    aLong11441 = 0L;
	}
    }
    
    void method14759() {
	if (aBool9156)
	    IDirect3DDevice.method15881(aLong11475, 28, (aBool9281 && aBool9203
							 && anInt9283 >= 0));
    }
    
    public final synchronized void method3282(int i) {
	for (int i_70_ = 0; i_70_ < anInt11459; i_70_++)
	    IUnknown.Release(aLongArray11473[i_70_]);
	anInt11459 = 0;
	super.method3136(i);
    }
    
    public Class174 method3439(Class174 class174, Class174 class174_71_,
			       float f, Class174 class174_72_) {
	return f < 0.5F ? class174 : class174_71_;
    }
    
    public final synchronized void method3495(int i) {
	for (int i_73_ = 0; i_73_ < anInt11459; i_73_++)
	    IUnknown.Release(aLongArray11473[i_73_]);
	anInt11459 = 0;
	super.method3136(i);
    }
    
    public final synchronized void method3370(int i) {
	for (int i_74_ = 0; i_74_ < anInt11459; i_74_++)
	    IUnknown.Release(aLongArray11473[i_74_]);
	anInt11459 = 0;
	super.method3136(i);
    }
    
    public String method3305() {
	String string = "Caps: 4:";
	String string_75_ = ":";
	string = new StringBuilder().append(string).append(anInt9294).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append(anInt9300).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append(anInt9163).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9305 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (method14657() ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (method14655() ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9307 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9306 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11460 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11477 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11478 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11471 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9302 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9303 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9304 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11464 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11455 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11466 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9309 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11462 ? 1 : 0).append
		     (string_75_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11468 ? 1 : 0).toString();
	return string;
    }
    
    public String method3306() {
	String string = "Caps: 4:";
	String string_76_ = ":";
	string = new StringBuilder().append(string).append(anInt9294).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append(anInt9300).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append(anInt9163).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9305 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (method14657() ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (method14655() ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9307 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9306 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11460 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11477 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11478 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11471 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9302 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9303 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9304 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11464 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11455 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11466 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9309 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11462 ? 1 : 0).append
		     (string_76_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11468 ? 1 : 0).toString();
	return string;
    }
    
    final void method14773(Interface44 interface44, Class373 class373, int i,
			   int i_77_, int i_78_, int i_79_) {
	if (aClass273_Sub1_11457 != null)
	    aClass273_Sub1_11457.method15682();
	IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11475,
					       (((Class423) interface44)
						.aLong4715),
					       4, 0, i, i_77_, i_78_, i_79_);
    }
    
    public void method3336(boolean bool) {
	/* empty */
    }
    
    boolean method14810(Class165 class165, Class178 class178) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class361.method6305(IDirect3D.GetAdapterDisplayMode
				    (aLong11441, anInt11452, d3ddisplaymode))
		&& Class361.method6305(IDirect3D.CheckDeviceFormat
				       (aLong11441, anInt11452, anInt11439,
					d3ddisplaymode.Format, 0, 4,
					method18071(class165, class178))));
    }
    
    Class168_Sub1 method3281(Canvas canvas, int i, int i_80_) {
	return new Class168_Sub1_Sub2_Sub1(this, canvas, i, i_80_, false);
    }
    
    Class168_Sub1 method3534(Canvas canvas, int i, int i_81_) {
	return new Class168_Sub1_Sub2_Sub1(this, canvas, i, i_81_, false);
    }
    
    Class168_Sub1 method3386(Canvas canvas, int i, int i_82_) {
	return new Class168_Sub1_Sub2_Sub1(this, canvas, i, i_82_, false);
    }
    
    public int[] method3316(int i, int i_83_, int i_84_, int i_85_) {
	method3218();
	int[] is = null;
	long l = IDirect3DDevice.GetRenderTarget(aLong11475, 0);
	long l_86_ = IDirect3DDevice.CreateRenderTarget(aLong11475, i_84_,
							i_85_, 21, 0, 0, true);
	int i_87_
	    = IDirect3DDevice.StretchRect(aLong11475, l, i, i_83_, i_84_,
					  i_85_, l_86_, 0, 0, i_84_, i_85_, 1);
	method14790(i_84_ * i_85_ * 4);
	if (Class361.method6305(i_87_)) {
	    is = new int[i_84_ * i_85_];
	    IDirect3DSurface.Download(l_86_, 0, 0, i_84_, i_85_, i_84_ * 4, 16,
				      aLong9160);
	    aByteBuffer9271.clear();
	    aByteBuffer9271.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_86_);
	return is;
    }
    
    public int[] method3207(int i, int i_88_, int i_89_, int i_90_) {
	method3218();
	int[] is = null;
	long l = IDirect3DDevice.GetRenderTarget(aLong11475, 0);
	long l_91_ = IDirect3DDevice.CreateRenderTarget(aLong11475, i_89_,
							i_90_, 21, 0, 0, true);
	int i_92_
	    = IDirect3DDevice.StretchRect(aLong11475, l, i, i_88_, i_89_,
					  i_90_, l_91_, 0, 0, i_89_, i_90_, 1);
	method14790(i_89_ * i_90_ * 4);
	if (Class361.method6305(i_92_)) {
	    is = new int[i_89_ * i_90_];
	    IDirect3DSurface.Download(l_91_, 0, 0, i_89_, i_90_, i_89_ * 4, 16,
				      aLong9160);
	    aByteBuffer9271.clear();
	    aByteBuffer9271.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_91_);
	return is;
    }
    
    public void method3341() {
	/* empty */
    }
    
    public void method3518() {
	/* empty */
    }
    
    public void method3132() {
	/* empty */
    }
    
    public boolean method3220() {
	return true;
    }
    
    public boolean method3323() {
	return true;
    }
    
    public boolean method3524() {
	return true;
    }
    
    public void method14898(Class435 class435) {
	class435.method6950(aClass435_11456);
    }
    
    public boolean method3278() {
	if (aBool11446)
	    return false;
	if (aLongArray11465[anInt11480] != 0L)
	    return false;
	return true;
    }
    
    Class525_Sub19 method18063(Interface52 interface52) {
	for (Class525_Sub19 class525_sub19
		 = ((Class525_Sub19)
		    aClass709_11445.method14372((short) -28698));
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-2003219622)) {
	    if (class525_sub19.anObject10571 == interface52)
		return class525_sub19;
	}
	return null;
    }
    
    public boolean method3565() {
	return true;
    }
    
    void method14712() {
	IDirect3DDevice.method15881(aLong11475, 14, aBool9221 && aBool9222);
    }
    
    public boolean method3568() {
	return false;
    }
    
    public boolean method3331() {
	return false;
    }
    
    Class337 method15020(Class378[] class378s) {
	return new Class337_Sub2(this, class378s);
    }
    
    public int method3333() {
	if (aLongArray11465[anInt11479] == 0L)
	    return -1;
	return ((Class361.method6305
		 (IDirect3DEventQuery.IsSignaled(aLongArray11465[anInt11479])))
		? anIntArray11440[anInt11479] : -1);
    }
    
    public void method3334(int i, int i_93_, int i_94_) {
	if (aLong11476 == 0L)
	    method18068(i_93_, i_94_);
	long l = IDirect3DDevice.GetRenderTarget(aLong11475, 0);
	if (!Class361.method6304
	     (IDirect3DDevice.StretchRect(aLong11475, l, 0, 0,
					  aClass168_1966.method2710(),
					  aClass168_1966.method2711(),
					  aLong11476, anInt1958 * 1000431205,
					  anInt1964 * 1482704485,
					  anInt1935 * -1588334531,
					  anInt1967 * -863940247, 2))) {
	    /* empty */
	}
	IUnknown.Release(l);
	IDirect3DDevice.GetRenderTargetData(aLong11475, aLong11476,
					    aLongArray11461[anInt11480]);
	long l_95_ = IDirect3DDevice.CreateEventQuery(aLong11475);
	if (Class361.method6305(IDirect3DEventQuery.Issue(l_95_)))
	    aLongArray11465[anInt11480] = l_95_;
	anIntArray11440[anInt11480] = i;
	if (++anInt11480 >= 3)
	    anInt11480 = 0;
    }
    
    Interface37 method14821(Class165 class165, int i, int i_96_, int i_97_,
			    boolean bool, byte[] is) {
	return new Class419_Sub2(this, class165, i, i_96_, i_97_, bool, is);
    }
    
    void method14924() {
	if (aBool9156) {
	    D3DLIGHT.SetDirection(aLong11444, -aFloatArray9228[0],
				  -aFloatArray9228[1], -aFloatArray9228[2]);
	    D3DLIGHT.SetDirection(aLong11447, -aFloatArray9229[0],
				  -aFloatArray9229[1], -aFloatArray9229[2]);
	    aBool11449 = false;
	}
    }
    
    boolean method18064(int i, int i_98_) {
	int i_99_ = IDirect3DDevice.TestCooperativeLevel(aLong11475);
	if (i_99_ == 0 || i_99_ == -2005530519) {
	    IDirect3DDevice.SetDepthStencilSurface(aLong11475, 0L);
	    for (int i_100_ = 1; i_100_ < 4; i_100_++)
		IDirect3DDevice.SetRenderTarget(aLong11475, i_100_, 0L);
	    for (int i_101_ = 0; i_101_ < 4; i_101_++)
		IDirect3DDevice.SetStreamSource(aLong11475, i_101_, 0L, 0, 0);
	    for (int i_102_ = 0; i_102_ < 4; i_102_++)
		IDirect3DDevice.SetTexture(aLong11475, i_102_, 0L);
	    IDirect3DDevice.SetIndices(aLong11475, 0L);
	    method14667();
	    aD3DPRESENT_PARAMETERS11442.BackBufferWidth = i;
	    aD3DPRESENT_PARAMETERS11442.BackBufferHeight = i_98_;
	    aD3DPRESENT_PARAMETERS11442.BackBufferCount = 1;
	    if (method18062(anInt11452, anInt11439, aLong11441, anInt9294,
			    aD3DDISPLAYMODE11443,
			    aD3DPRESENT_PARAMETERS11442)) {
		int i_103_
		    = IDirect3DDevice.Reset(aLong11475,
					    aD3DPRESENT_PARAMETERS11442);
		if (Class361.method6305(i_103_)) {
		    aBool11446 = false;
		    method14794();
		    method14666();
		    return true;
		}
	    }
	}
	return false;
    }
    
    public long method3338(int i, int i_104_) {
	return method18049(i, i_104_, null, null);
    }
    
    public long method3222(int i, int i_105_) {
	return method18049(i, i_105_, null, null);
    }
    
    public void method15040(int i, Interface35 interface35) {
	Class421 class421 = (Class421) interface35;
	IDirect3DDevice.SetStreamSource(aLong11475, i, class421.aLong4692, 0,
					class421.method6745());
    }
    
    public void method3577(int i, int i_106_, int[] is, int[] is_107_) {
	method18049(i, i_106_, is, is_107_);
    }
    
    public void method3342() {
	if (aLong11476 != 0L) {
	    IUnknown.Release(aLong11476);
	    aLong11476 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11465[i] != 0L) {
		IUnknown.Release(aLongArray11465[i]);
		aLongArray11465[i] = 0L;
	    }
	    if (aLongArray11461[i] != 0L) {
		IUnknown.Release(aLongArray11461[i]);
		aLongArray11461[i] = 0L;
	    }
	}
	anInt11480 = 0;
	anInt11479 = 0;
    }
    
    public void method14763(Class337 class337) {
	Class337_Sub2 class337_sub2 = (Class337_Sub2) class337;
	IDirect3DDevice.SetVertexDeclaration(aLong11475,
					     class337_sub2.aLong10296);
    }
    
    void method14732() {
	method14716();
	method14718();
    }
    
    public Class168_Sub2 method3483() {
	return new Class168_Sub2_Sub3_Sub1(this);
    }
    
    public Class168_Sub2 method3484() {
	return new Class168_Sub2_Sub3_Sub1(this);
    }
    
    void method15049(int i) {
	IDirect3DDevice.SetRenderState(aLong11475, 168, i);
    }
    
    public boolean method3324() {
	if (aBool11446)
	    return false;
	if (aLongArray11465[anInt11480] != 0L)
	    return false;
	return true;
    }
    
    public Interface21 method3487(int i, int i_108_, Class165 class165,
				  Class178 class178, int i_109_) {
	return new Class426(this, class165, class178, i, i_108_, i_109_);
    }
    
    public int[] method3165(int i, int i_110_, int i_111_, int i_112_) {
	method3218();
	int[] is = null;
	long l = IDirect3DDevice.GetRenderTarget(aLong11475, 0);
	long l_113_
	    = IDirect3DDevice.CreateRenderTarget(aLong11475, i_111_, i_112_,
						 21, 0, 0, true);
	int i_114_ = IDirect3DDevice.StretchRect(aLong11475, l, i, i_110_,
						 i_111_, i_112_, l_113_, 0, 0,
						 i_111_, i_112_, 1);
	method14790(i_111_ * i_112_ * 4);
	if (Class361.method6305(i_114_)) {
	    is = new int[i_111_ * i_112_];
	    IDirect3DSurface.Download(l_113_, 0, 0, i_111_, i_112_, i_111_ * 4,
				      16, aLong9160);
	    aByteBuffer9271.clear();
	    aByteBuffer9271.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_113_);
	return is;
    }
    
    void method14754() {
	IDirect3DDevice.method15881(aLong11475, 15, aBool9291);
	IDirect3DDevice.SetRenderState(aLong11475, 24, aByte9292 & 0xff);
	if (aD3DPRESENT_PARAMETERS11442.MultiSampleType > 0) {
	    if (!aBool9291 || aByte9292 == 0) {
		if (aBool11466 || aBool11464)
		    IDirect3DDevice.SetRenderState(aLong11475, 181, 0);
		else if (aBool11455)
		    IDirect3DDevice.method15880(aLong11475, 154, 1.0F);
	    } else if (aBool11466)
		IDirect3DDevice.SetRenderState(aLong11475, 181,
					       method14951('S', 'S', 'A',
							   'A'));
	    else if (aBool11464)
		IDirect3DDevice.SetRenderState(aLong11475, 181,
					       method14951('A', 'T', 'O',
							   'C'));
	    else if (aBool11455)
		IDirect3DDevice.SetRenderState(aLong11475, 154,
					       method14951('A', '2', 'M',
							   '1'));
	}
    }
    
    void method14839() {
	if (aBool9156) {
	    D3DLIGHT.SetAmbient(aLong11444, aFloat9233 * aFloat9169,
				aFloat9299 * aFloat9169,
				aFloat9235 * aFloat9169, 0.0F);
	    aBool11449 = false;
	}
    }
    
    public Interface22 method3404(int i, int i_115_, int i_116_) {
	return new Class440(this, Class178.aClass178_1913, i, i_115_, i_116_);
    }
    
    void method3492() {
	super.finalize();
    }
    
    void method3493() {
	super.finalize();
    }
    
    void method3494() {
	super.finalize();
    }
    
    void method3399() {
	super.finalize();
    }
    
    public void method3430() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11465[i] != 0L) {
		IUnknown.Release(aLongArray11465[i]);
		aLongArray11465[i] = 0L;
	    }
	}
	anInt11480 = 0;
	anInt11479 = 0;
    }
    
    public void method3291(int i, int i_117_) {
	IDirect3DDevice.Clear(aLong11475, i, i_117_, 1.0F, 0);
    }
    
    public Interface22 method3511(int i, int i_118_) {
	return new Class440(this, Class178.aClass178_1913, i, i_118_, 0);
    }
    
    static final int method18065(Class368 class368) {
	switch (class368.anInt3870) {
	case 5:
	    return 3;
	case 2:
	    return 1;
	case 0:
	    return 4;
	default:
	    return 0;
	case 3:
	    return 256;
	case 1:
	    return 2;
	}
    }
    
    void method14803() {
	method14716();
	method14718();
    }
    
    void method18066() {
	IDirect3DDevice.SetRenderState(aLong11475, 22, anInt9293);
    }
    
    public Interface22 method3488(int i, int i_119_, int i_120_) {
	return new Class440(this, Class178.aClass178_1913, i, i_119_, i_120_);
    }
    
    public boolean method14782(boolean bool) {
	if (bool)
	    return aBool11462;
	return aBool11462 && aBool11468;
    }
    
    public boolean method3325() {
	return true;
    }
    
    public boolean method14949(boolean bool) {
	if (bool)
	    return aBool11462;
	return aBool11462 && aBool11468;
    }
    
    Class337 method15021(Class378[] class378s) {
	return new Class337_Sub2(this, class378s);
    }
    
    public Class266 method15008(String string) {
	byte[] is = method18058(string);
	if (is == null)
	    return null;
	Class262 class262 = method14865(is);
	return new Class266_Sub2(this, class262);
    }
    
    public Class266 method14953(String string) {
	byte[] is = method18058(string);
	if (is == null)
	    return null;
	Class262 class262 = method14865(is);
	return new Class266_Sub2(this, class262);
    }
    
    public Class266 method14835(String string) {
	byte[] is = method18058(string);
	if (is == null)
	    return null;
	Class262 class262 = method14865(is);
	return new Class266_Sub2(this, class262);
    }
    
    public Interface22 method3489(int i, int i_121_, int i_122_) {
	return new Class440(this, Class178.aClass178_1913, i, i_121_, i_122_);
    }
    
    public void method14787(Class435 class435, Class435 class435_123_,
			    Class435 class435_124_) {
	IDirect3DDevice.SetTransform(aLong11475, 256,
				     class435.aFloatArray4830);
	IDirect3DDevice.SetTransform(aLong11475, 2,
				     class435_123_.aFloatArray4830);
	IDirect3DDevice.SetTransform(aLong11475, 3,
				     class435_124_.aFloatArray4830);
    }
    
    public void method15025(Class435 class435, Class435 class435_125_,
			    Class435 class435_126_) {
	IDirect3DDevice.SetTransform(aLong11475, 256,
				     class435.aFloatArray4830);
	IDirect3DDevice.SetTransform(aLong11475, 2,
				     class435_125_.aFloatArray4830);
	IDirect3DDevice.SetTransform(aLong11475, 3,
				     class435_126_.aFloatArray4830);
    }
    
    public void method14840(Class435 class435, Class435 class435_127_,
			    Class435 class435_128_) {
	IDirect3DDevice.SetTransform(aLong11475, 256,
				     class435.aFloatArray4830);
	IDirect3DDevice.SetTransform(aLong11475, 2,
				     class435_127_.aFloatArray4830);
	IDirect3DDevice.SetTransform(aLong11475, 3,
				     class435_128_.aFloatArray4830);
    }
    
    Interface38 method15043(Class165 class165, Class178 class178, int i,
			    int i_129_) {
	return new Class419_Sub3(this, class165, class178, i, i_129_);
    }
    
    void method14847() {
	for (int i = 0; i < anInt9300; i++) {
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 7, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 6, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 5, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 1, 1);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 2, 1);
	    aClass377Array11454[i] = Class377.aClass377_3903;
	    boolean[] bools = aBoolArray11450;
	    int i_130_ = i;
	    aBoolArray11451[i] = true;
	    bools[i_130_] = true;
	    aBoolArray11453[i] = false;
	    anIntArray11467[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState(aLong11475, 0, 6, 1);
	IDirect3DDevice.SetRenderState(aLong11475, 9, 2);
	IDirect3DDevice.SetRenderState(aLong11475, 23, 4);
	IDirect3DDevice.SetRenderState(aLong11475, 25, 5);
	IDirect3DDevice.SetRenderState(aLong11475, 24, 0);
	IDirect3DDevice.method15881(aLong11475, 206, aBool9309);
	IDirect3DDevice.SetRenderState(aLong11475, 181, 0);
	method18066();
	IDirect3DDevice.SetRenderState(aLong11475, 147, 1);
	IDirect3DDevice.SetRenderState(aLong11475, 145, 1);
	IDirect3DDevice.method15880(aLong11475, 38, 0.95F);
	IDirect3DDevice.SetRenderState(aLong11475, 35, 3);
	IDirect3DDevice.method15880(aLong11475, 154, 1.0F);
	D3DLIGHT.SetType(aLong11444, 3);
	D3DLIGHT.SetType(aLong11447, 3);
	D3DLIGHT.SetType(aLong11448, 1);
	aBool11449 = false;
	super.method14666();
    }
    
    void method14848() {
	for (int i = 0; i < anInt9300; i++) {
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 7, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 6, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 5, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 1, 1);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 2, 1);
	    aClass377Array11454[i] = Class377.aClass377_3903;
	    boolean[] bools = aBoolArray11450;
	    int i_131_ = i;
	    aBoolArray11451[i] = true;
	    bools[i_131_] = true;
	    aBoolArray11453[i] = false;
	    anIntArray11467[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState(aLong11475, 0, 6, 1);
	IDirect3DDevice.SetRenderState(aLong11475, 9, 2);
	IDirect3DDevice.SetRenderState(aLong11475, 23, 4);
	IDirect3DDevice.SetRenderState(aLong11475, 25, 5);
	IDirect3DDevice.SetRenderState(aLong11475, 24, 0);
	IDirect3DDevice.method15881(aLong11475, 206, aBool9309);
	IDirect3DDevice.SetRenderState(aLong11475, 181, 0);
	method18066();
	IDirect3DDevice.SetRenderState(aLong11475, 147, 1);
	IDirect3DDevice.SetRenderState(aLong11475, 145, 1);
	IDirect3DDevice.method15880(aLong11475, 38, 0.95F);
	IDirect3DDevice.SetRenderState(aLong11475, 35, 3);
	IDirect3DDevice.method15880(aLong11475, 154, 1.0F);
	D3DLIGHT.SetType(aLong11444, 3);
	D3DLIGHT.SetType(aLong11447, 3);
	D3DLIGHT.SetType(aLong11448, 1);
	aBool11449 = false;
	super.method14666();
    }
    
    void method14849() {
	for (int i = 0; i < anInt9300; i++) {
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 7, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 6, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 5, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 1, 1);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 2, 1);
	    aClass377Array11454[i] = Class377.aClass377_3903;
	    boolean[] bools = aBoolArray11450;
	    int i_132_ = i;
	    aBoolArray11451[i] = true;
	    bools[i_132_] = true;
	    aBoolArray11453[i] = false;
	    anIntArray11467[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState(aLong11475, 0, 6, 1);
	IDirect3DDevice.SetRenderState(aLong11475, 9, 2);
	IDirect3DDevice.SetRenderState(aLong11475, 23, 4);
	IDirect3DDevice.SetRenderState(aLong11475, 25, 5);
	IDirect3DDevice.SetRenderState(aLong11475, 24, 0);
	IDirect3DDevice.method15881(aLong11475, 206, aBool9309);
	IDirect3DDevice.SetRenderState(aLong11475, 181, 0);
	method18066();
	IDirect3DDevice.SetRenderState(aLong11475, 147, 1);
	IDirect3DDevice.SetRenderState(aLong11475, 145, 1);
	IDirect3DDevice.method15880(aLong11475, 38, 0.95F);
	IDirect3DDevice.SetRenderState(aLong11475, 35, 3);
	IDirect3DDevice.method15880(aLong11475, 154, 1.0F);
	D3DLIGHT.SetType(aLong11444, 3);
	D3DLIGHT.SetType(aLong11447, 3);
	D3DLIGHT.SetType(aLong11448, 1);
	aBool11449 = false;
	super.method14666();
    }
    
    void method18067(Interface52 interface52) {
	if (method18047(interface52) == null)
	    aClass709_11445.method14345(new Class525_Sub19(interface52),
					(byte) 0);
    }
    
    public void method3537(int i, int i_133_) {
	IDirect3DDevice.Clear(aLong11475, i, i_133_, 1.0F, 0);
    }
    
    public boolean method14655() {
	return (aD3DCAPS11438.PixelShaderVersion & 0xffff) >= 257;
    }
    
    void method14900() {
	for (Class525_Sub19 class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14372((short) -8922);
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-1851928650)) {
	    Interface52 interface52
		= (Interface52) class525_sub19.anObject10571;
	    interface52.method217();
	    if (interface52 == aClass168_1966)
		interface52.method350();
	}
	super.method14794();
    }
    
    public float method14862() {
	return -0.5F;
    }
    
    public float method14992() {
	return -0.5F;
    }
    
    void method14875() {
	if (aClass168_1966 != null)
	    IDirect3DDevice.SetViewport(aLong11475, anInt9219 + anInt9268,
					anInt9224 + anInt9258, anInt9250,
					anInt9285, aFloat9201, aFloat9202);
    }
    
    void method14876() {
	IDirect3DDevice.SetScissorRect(aLong11475, anInt9219 + anInt9209,
				       anInt9224 + anInt9319, anInt9210,
				       anInt9264);
    }
    
    void method14747() {
	if (aBool9156) {
	    int i = (aBoolArray11463[anInt9246]
		     ? method18056(aClass362Array9322[anInt9246]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 1, i);
	}
    }
    
    void method15030() {
	IDirect3DDevice.method15881(aLong11475, 174, aBool9325);
    }
    
    void method14859() {
	IDirect3DDevice.method15881(aLong11475, 174, aBool9325);
    }
    
    public Interface21 method3168(int i, int i_134_, Class165 class165,
				  Class178 class178, int i_135_) {
	return new Class426(this, class165, class178, i, i_134_, i_135_);
    }
    
    public void method14804(Class435 class435) {
	class435.method6950(aClass435_11456);
    }
    
    public Interface22 method3490(int i, int i_136_, int i_137_) {
	return new Class440(this, Class178.aClass178_1913, i, i_136_, i_137_);
    }
    
    public void method14895(Class435 class435) {
	class435.method6950(aClass435_11456);
    }
    
    public void method14671(Class435 class435) {
	class435.method6950(aClass435_11456);
    }
    
    public boolean method14823() {
	return (aD3DCAPS11438.PixelShaderVersion & 0xffff) >= 257;
    }
    
    void method18068(int i, int i_138_) {
	method3178();
	method3177(i, i_138_, (short) -12995);
	aLong11476
	    = (IDirect3DDevice.CreateRenderTarget
	       (aLong11475, i, i_138_,
		method18071(Class165.aClass165_1771, Class178.aClass178_1905),
		0, 0, false));
	for (int i_139_ = 0; i_139_ < 3; i_139_++)
	    aLongArray11461[i_139_]
		= (IDirect3DDevice.CreateOffscreenPlainSurface
		   (aLong11475, i, i_138_,
		    method18071(Class165.aClass165_1771,
				Class178.aClass178_1905),
		    2));
	method14790(i * i_138_ * 4);
    }
    
    public boolean method15012() {
	return (aD3DCAPS11438.VertexShaderVersion & 0xffff) >= 257;
    }
    
    void method14914() {
	IDirect3DDevice.method15881(aLong11475, 14, aBool9221 && aBool9222);
    }
    
    void method15044() {
	if (aBool9156)
	    IDirect3DDevice.method15881(aLong11475, 137,
					aBool9225 && !aBool9227);
    }
    
    synchronized void method18069(long l) {
	if (anInt11459 == anInt11472) {
	    anInt11472 *= 2;
	    long[] ls = new long[anInt11472];
	    System.arraycopy(aLongArray11473, 0, ls, 0, anInt11459);
	    aLongArray11473 = ls;
	}
	aLongArray11473[anInt11459] = l;
	anInt11459++;
    }
    
    void method14918() {
	if (aBool9156) {
	    D3DLIGHT.SetAmbient(aLong11444, aFloat9233 * aFloat9169,
				aFloat9299 * aFloat9169,
				aFloat9235 * aFloat9169, 0.0F);
	    aBool11449 = false;
	}
    }
    
    final void method14708() {
	if (aBool9156)
	    IDirect3DDevice.SetRenderState(aLong11475, 60, anInt9252);
    }
    
    void method14920() {
	if (aBool9156) {
	    D3DLIGHT.SetAmbient(aLong11444, aFloat9233 * aFloat9169,
				aFloat9299 * aFloat9169,
				aFloat9235 * aFloat9169, 0.0F);
	    aBool11449 = false;
	}
    }
    
    public Class266 method14770(String string) {
	byte[] is = method18058(string);
	if (is == null)
	    return null;
	Class262 class262 = method14865(is);
	return new Class266_Sub2(this, class262);
    }
    
    void method15026(Interface44 interface44) {
	IDirect3DDevice.SetIndices(aLong11475,
				   ((Class423) interface44).aLong4715);
    }
    
    void method14913() {
	IDirect3DDevice.method15881(aLong11475, 14, aBool9221 && aBool9222);
    }
    
    public Class174 method3438(Class174 class174, Class174 class174_140_,
			       float f, Class174 class174_141_) {
	return f < 0.5F ? class174 : class174_140_;
    }
    
    void method14911() {
	IDirect3DDevice.method15881(aLong11475, 7, aBool9223 && aBool9175);
    }
    
    void method14926() {
	if (aBool9156 && !aBool11449) {
	    IDirect3DDevice.LightEnable(aLong11475, 0, false);
	    IDirect3DDevice.LightEnable(aLong11475, 1, false);
	    IDirect3DDevice.SetLight(aLong11475, 0, aLong11444);
	    IDirect3DDevice.SetLight(aLong11475, 1, aLong11447);
	    IDirect3DDevice.LightEnable(aLong11475, 0, true);
	    IDirect3DDevice.LightEnable(aLong11475, 1, true);
	    aBool11449 = true;
	}
    }
    
    void method14852() {
	if (aBool9156 && !aBool11449) {
	    IDirect3DDevice.LightEnable(aLong11475, 0, false);
	    IDirect3DDevice.LightEnable(aLong11475, 1, false);
	    IDirect3DDevice.SetLight(aLong11475, 0, aLong11444);
	    IDirect3DDevice.SetLight(aLong11475, 1, aLong11447);
	    IDirect3DDevice.LightEnable(aLong11475, 0, true);
	    IDirect3DDevice.LightEnable(aLong11475, 1, true);
	    aBool11449 = true;
	}
    }
    
    void method14927() {
	if (aBool9156 && !aBool11449) {
	    IDirect3DDevice.LightEnable(aLong11475, 0, false);
	    IDirect3DDevice.LightEnable(aLong11475, 1, false);
	    IDirect3DDevice.SetLight(aLong11475, 0, aLong11444);
	    IDirect3DDevice.SetLight(aLong11475, 1, aLong11447);
	    IDirect3DDevice.LightEnable(aLong11475, 0, true);
	    IDirect3DDevice.LightEnable(aLong11475, 1, true);
	    aBool11449 = true;
	}
    }
    
    public int method3191() {
	if (aLongArray11465[anInt11479] == 0L)
	    return -1;
	return ((Class361.method6305
		 (IDirect3DEventQuery.IsSignaled(aLongArray11465[anInt11479])))
		? anIntArray11440[anInt11479] : -1);
    }
    
    public String method3265() {
	String string = "Caps: 4:";
	String string_142_ = ":";
	string = new StringBuilder().append(string).append(anInt9294).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append(anInt9300).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append(anInt9163).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9305 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (method14657() ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (method14655() ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9307 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9306 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11460 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11477 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11478 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11471 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9302 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9303 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9304 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11464 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11455 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11466 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9309 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11462 ? 1 : 0).append
		     (string_142_).toString();
	string = new StringBuilder().append(string).append
		     (aBool11468 ? 1 : 0).toString();
	return string;
    }
    
    void method14749() {
	method14716();
	method14718();
    }
    
    void method14933() {
	int i;
	for (i = 0; i < anInt9214; i++) {
	    Class525_Sub21 class525_sub21 = aClass525_Sub21Array9239[i];
	    int i_143_ = i + 2;
	    int i_144_ = class525_sub21.method16298(-1463619063);
	    float f = class525_sub21.method16306(-955918388) / 255.0F;
	    D3DLIGHT.SetPosition(aLong11448,
				 (float) class525_sub21
					     .method16314(-927179219),
				 (float) class525_sub21
					     .method16312((short) 8470),
				 (float) class525_sub21.method16301((byte) 6));
	    D3DLIGHT.SetDiffuse(aLong11448, (float) (i_144_ >> 16 & 0xff) * f,
				(float) (i_144_ >> 8 & 0xff) * f,
				(float) (i_144_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(aLong11448, 0.0F, 0.0F,
		 1.0F / (float) (class525_sub21.method16332(1699809711)
				 * class525_sub21.method16332(1901683030)));
	    D3DLIGHT.SetRange(aLong11448,
			      (float) class525_sub21.method16332(2078180848));
	    IDirect3DDevice.SetLight(aLong11475, i_143_, aLong11448);
	    IDirect3DDevice.LightEnable(aLong11475, i_143_, true);
	}
	for (/**/; i < anInt9241; i++)
	    IDirect3DDevice.LightEnable(aLong11475, i + 2, false);
    }
    
    boolean method14934(Class165 class165, Class178 class178) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class361.method6305(IDirect3D.GetAdapterDisplayMode
				    (aLong11441, anInt11452, d3ddisplaymode))
		&& Class361.method6305(IDirect3D.CheckDeviceFormat
				       (aLong11441, anInt11452, anInt11439,
					d3ddisplaymode.Format, 0, 3,
					method18071(class165, class178))));
    }
    
    boolean method14672(Class165 class165, Class178 class178) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class361.method6305(IDirect3D.GetAdapterDisplayMode
				    (aLong11441, anInt11452, d3ddisplaymode))
		&& Class361.method6305(IDirect3D.CheckDeviceFormat
				       (aLong11441, anInt11452, anInt11439,
					d3ddisplaymode.Format, 0, 3,
					method18071(class165, class178))));
    }
    
    public int method3171() {
	if (aLongArray11465[anInt11479] == 0L)
	    return -1;
	return ((Class361.method6305
		 (IDirect3DEventQuery.IsSignaled(aLongArray11465[anInt11479])))
		? anIntArray11440[anInt11479] : -1);
    }
    
    boolean method14802(Class165 class165, Class178 class178) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class361.method6305(IDirect3D.GetAdapterDisplayMode
				    (aLong11441, anInt11452, d3ddisplaymode))
		&& Class361.method6305(IDirect3D.CheckDeviceFormat
				       (aLong11441, anInt11452, anInt11439,
					d3ddisplaymode.Format, 0, 4,
					method18071(class165, class178))));
    }
    
    Interface38 method14943(Class165 class165, Class178 class178, int i,
			    int i_145_) {
	return new Class419_Sub3(this, class165, class178, i, i_145_);
    }
    
    Interface38 method14944(Class165 class165, Class178 class178, int i,
			    int i_146_) {
	return new Class419_Sub3(this, class165, class178, i, i_146_);
    }
    
    Interface38 method14820(Class165 class165, Class178 class178, int i,
			    int i_147_) {
	return new Class419_Sub3(this, class165, class178, i, i_147_);
    }
    
    Interface38 method14735(Class165 class165, Class178 class178, int i,
			    int i_148_) {
	return new Class419_Sub3(this, class165, class178, i, i_148_);
    }
    
    static final int method18070(Class371 class371) {
	switch (class371.anInt3882) {
	case 3:
	    return 3;
	case 0:
	    return 0;
	case 1:
	    return 1;
	case 2:
	    return 2;
	default:
	    throw new IllegalArgumentException();
	}
    }
    
    Interface38 method14947(int i, int i_149_, boolean bool, int[] is,
			    int i_150_, int i_151_) {
	return new Class419_Sub3(this, i, i_149_, bool, is, i_150_, i_151_);
    }
    
    Interface38 method14846(int i, int i_152_, boolean bool, int[] is,
			    int i_153_, int i_154_) {
	return new Class419_Sub3(this, i, i_152_, bool, is, i_153_, i_154_);
    }
    
    static final int method18071(Class165 class165, Class178 class178) {
	switch (class178.anInt1910 * -1868954147) {
	case 5:
	    if (class165 == Class165.aClass165_1771)
		return 116;
	    break;
	case 1:
	    if (class165 == Class165.aClass165_1771)
		return 113;
	    break;
	case 2:
	    switch (class165.anInt1780 * -2093736709) {
	    case 7:
		return 51;
	    default:
		break;
	    case 6:
		return 50;
	    case 4:
		return Class365.anInt3854 * 868040931;
	    case 2:
		return Class365.anInt3853 * -847099087;
	    case 8:
		return 77;
	    case 5:
		return 28;
	    case 9:
		return 21;
	    case 0:
		return 22;
	    }
	    break;
	}
	throw new IllegalArgumentException("");
    }
    
    Interface40 method14686(int i, boolean bool, int[][] is) {
	return new Class419_Sub1(this, i, bool, is);
    }
    
    Interface40 method14727(int i, boolean bool, int[][] is) {
	return new Class419_Sub1(this, i, bool, is);
    }
    
    public void method15010(Class435 class435) {
	class435.method6950(aClass435_11456);
    }
    
    public Class168_Sub2 method3485() {
	return new Class168_Sub2_Sub3_Sub1(this);
    }
    
    Interface37 method14952(Class165 class165, int i, int i_155_, int i_156_,
			    boolean bool, byte[] is) {
	return new Class419_Sub2(this, class165, i, i_155_, i_156_, bool, is);
    }
    
    Interface38 method14785(Class165 class165, int i, int i_157_, boolean bool,
			    float[] fs, int i_158_, int i_159_) {
	return new Class419_Sub3(this, class165, i, i_157_, bool, fs, i_158_,
				 i_159_);
    }
    
    Interface42 method14954(Class165 class165, Class178 class178, int i,
			    int i_160_) {
	return new Class419_Sub3_Sub1(this, class165, class178, i, i_160_);
    }
    
    Interface42 method14955(Class165 class165, Class178 class178, int i,
			    int i_161_) {
	return new Class419_Sub3_Sub1(this, class165, class178, i, i_161_);
    }
    
    Interface42 method14956(Class165 class165, Class178 class178, int i,
			    int i_162_) {
	return new Class419_Sub3_Sub1(this, class165, class178, i, i_162_);
    }
    
    public Interface22 method3512(int i, int i_163_) {
	return new Class440(this, Class178.aClass178_1913, i, i_163_, 0);
    }
    
    public void method15011() {
	if (aBoolArray11463[anInt9246]) {
	    aBoolArray11463[anInt9246] = false;
	    IDirect3DDevice.SetTexture(aLong11475, anInt9246, 0L);
	    method14815();
	    method14747();
	}
    }
    
    public void method14658() {
	if (aBoolArray11463[anInt9246]) {
	    aBoolArray11463[anInt9246] = false;
	    IDirect3DDevice.SetTexture(aLong11475, anInt9246, 0L);
	    method14815();
	    method14747();
	}
    }
    
    final void method14722(int i, Class371 class371, boolean bool,
			   boolean bool_164_) {
	if (aBool9156) {
	    int i_165_ = 0;
	    int i_166_;
	    switch (i) {
	    case 1:
		i_166_ = 3;
		break;
	    case 2:
		i_166_ = 26;
		break;
	    default:
		i_166_ = 2;
	    }
	    if (bool)
		i_165_ |= 0x20;
	    if (bool_164_)
		i_165_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, i_166_,
						 (method18057(class371)
						  | i_165_));
	}
    }
    
    final void method14791(int i, Class371 class371, boolean bool,
			   boolean bool_167_) {
	if (aBool9156) {
	    int i_168_ = 0;
	    int i_169_;
	    switch (i) {
	    case 1:
		i_169_ = 3;
		break;
	    case 2:
		i_169_ = 26;
		break;
	    default:
		i_169_ = 2;
	    }
	    if (bool)
		i_168_ |= 0x20;
	    if (bool_167_)
		i_168_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, i_169_,
						 (method18057(class371)
						  | i_168_));
	}
    }
    
    final void method14976(int i, Class371 class371, boolean bool,
			   boolean bool_170_) {
	if (aBool9156) {
	    int i_171_ = 0;
	    int i_172_;
	    switch (i) {
	    case 1:
		i_172_ = 3;
		break;
	    case 2:
		i_172_ = 26;
		break;
	    default:
		i_172_ = 2;
	    }
	    if (bool)
		i_171_ |= 0x20;
	    if (bool_170_)
		i_171_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, i_172_,
						 (method18057(class371)
						  | i_171_));
	}
    }
    
    final void method15000() {
	if (aBool9156)
	    IDirect3DDevice.SetRenderState(aLong11475, 60, anInt9252);
    }
    
    void method14664() {
	for (int i = 0; i < anInt9300; i++) {
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 7, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 6, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 5, 2);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 1, 1);
	    IDirect3DDevice.SetSamplerState(aLong11475, i, 2, 1);
	    aClass377Array11454[i] = Class377.aClass377_3903;
	    boolean[] bools = aBoolArray11450;
	    int i_173_ = i;
	    aBoolArray11451[i] = true;
	    bools[i_173_] = true;
	    aBoolArray11453[i] = false;
	    anIntArray11467[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState(aLong11475, 0, 6, 1);
	IDirect3DDevice.SetRenderState(aLong11475, 9, 2);
	IDirect3DDevice.SetRenderState(aLong11475, 23, 4);
	IDirect3DDevice.SetRenderState(aLong11475, 25, 5);
	IDirect3DDevice.SetRenderState(aLong11475, 24, 0);
	IDirect3DDevice.method15881(aLong11475, 206, aBool9309);
	IDirect3DDevice.SetRenderState(aLong11475, 181, 0);
	method18066();
	IDirect3DDevice.SetRenderState(aLong11475, 147, 1);
	IDirect3DDevice.SetRenderState(aLong11475, 145, 1);
	IDirect3DDevice.method15880(aLong11475, 38, 0.95F);
	IDirect3DDevice.SetRenderState(aLong11475, 35, 3);
	IDirect3DDevice.method15880(aLong11475, 154, 1.0F);
	D3DLIGHT.SetType(aLong11444, 3);
	D3DLIGHT.SetType(aLong11447, 3);
	D3DLIGHT.SetType(aLong11448, 1);
	aBool11449 = false;
	super.method14666();
    }
    
    final void method14809() {
	if (aBool9156)
	    IDirect3DDevice.SetRenderState(aLong11475, 60, anInt9252);
    }
    
    public void method14798(Class435 class435, Class435 class435_174_,
			    Class435 class435_175_) {
	IDirect3DDevice.SetTransform(aLong11475, 256,
				     class435.aFloatArray4830);
	IDirect3DDevice.SetTransform(aLong11475, 2,
				     class435_174_.aFloatArray4830);
	IDirect3DDevice.SetTransform(aLong11475, 3,
				     class435_175_.aFloatArray4830);
    }
    
    void method14994() {
	/* empty */
    }
    
    final void method18072(long l) {
	IDirect3DDevice.SetPixelShader(aLong11475, l);
    }
    
    public Class170 method3436() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(aLong11441, anInt11452, 0,
				       d3dadapter_identifier);
	return new Class170(d3dadapter_identifier.VendorID,
			    method14813() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion,
			    method14813());
    }
    
    void method14758() {
	/* empty */
    }
    
    void method14996() {
	if (aBool9156) {
	    int i = (aBoolArray11463[anInt9246]
		     ? method18056(aClass362Array9322[anInt9246]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 1, i);
	}
    }
    
    void method14997() {
	if (aBool9156) {
	    int i = (aBoolArray11463[anInt9246]
		     ? method18056(aClass362Array9322[anInt9246]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 1, i);
	}
    }
    
    void method14998() {
	if (aBool9156) {
	    int i = (aBoolArray11463[anInt9246]
		     ? method18056(aClass362Array9317[anInt9246]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 4, i);
	}
    }
    
    void method14662() {
	if (aBool9156) {
	    int i = (aBoolArray11463[anInt9246]
		     ? method18056(aClass362Array9317[anInt9246]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 4, i);
	}
    }
    
    void method14824() {
	if (aBool9156) {
	    int i = (aBoolArray11463[anInt9246]
		     ? method18056(aClass362Array9317[anInt9246]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 4, i);
	}
    }
    
    void method15001() {
	if (aBool9156) {
	    int i = (aBoolArray11463[anInt9246]
		     ? method18056(aClass362Array9317[anInt9246]) : 1);
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 4, i);
	}
    }
    
    void method15006() {
	IDirect3DDevice.method15881(aLong11475, 15, aBool9291);
	IDirect3DDevice.SetRenderState(aLong11475, 24, aByte9292 & 0xff);
	if (aD3DPRESENT_PARAMETERS11442.MultiSampleType > 0) {
	    if (!aBool9291 || aByte9292 == 0) {
		if (aBool11466 || aBool11464)
		    IDirect3DDevice.SetRenderState(aLong11475, 181, 0);
		else if (aBool11455)
		    IDirect3DDevice.method15880(aLong11475, 154, 1.0F);
	    } else if (aBool11466)
		IDirect3DDevice.SetRenderState(aLong11475, 181,
					       method14951('S', 'S', 'A',
							   'A'));
	    else if (aBool11464)
		IDirect3DDevice.SetRenderState(aLong11475, 181,
					       method14951('A', 'T', 'O',
							   'C'));
	    else if (aBool11455)
		IDirect3DDevice.SetRenderState(aLong11475, 154,
					       method14951('A', '2', 'M',
							   '1'));
	}
    }
    
    void method15007() {
	IDirect3DDevice.method15881(aLong11475, 15, aBool9291);
	IDirect3DDevice.SetRenderState(aLong11475, 24, aByte9292 & 0xff);
	if (aD3DPRESENT_PARAMETERS11442.MultiSampleType > 0) {
	    if (!aBool9291 || aByte9292 == 0) {
		if (aBool11466 || aBool11464)
		    IDirect3DDevice.SetRenderState(aLong11475, 181, 0);
		else if (aBool11455)
		    IDirect3DDevice.method15880(aLong11475, 154, 1.0F);
	    } else if (aBool11466)
		IDirect3DDevice.SetRenderState(aLong11475, 181,
					       method14951('S', 'S', 'A',
							   'A'));
	    else if (aBool11464)
		IDirect3DDevice.SetRenderState(aLong11475, 181,
					       method14951('A', 'T', 'O',
							   'C'));
	    else if (aBool11455)
		IDirect3DDevice.SetRenderState(aLong11475, 154,
					       method14951('A', '2', 'M',
							   '1'));
	}
    }
    
    void method14999() {
	IDirect3DDevice.method15881(aLong11475, 27, aBool9290);
    }
    
    void method15014() {
	if (aBool9156)
	    IDirect3DDevice.method15881(aLong11475, 28, (aBool9281 && aBool9203
							 && anInt9283 >= 0));
    }
    
    void method15015() {
	if (aBool9156)
	    IDirect3DDevice.method15881(aLong11475, 28, (aBool9281 && aBool9203
							 && anInt9283 >= 0));
    }
    
    final void method14993() {
	if (aBool9156)
	    IDirect3DDevice.SetRenderState(aLong11475, 60, anInt9252);
    }
    
    final Interface35 method15017(boolean bool) {
	return new Class421(this, bool);
    }
    
    final Interface35 method15018(boolean bool) {
	return new Class421(this, bool);
    }
    
    final Interface35 method14991(boolean bool) {
	return new Class421(this, bool);
    }
    
    public void method3310(boolean bool) {
	/* empty */
    }
    
    public void method3335(int i, int i_176_, int i_177_) {
	if (aLong11476 == 0L)
	    method18068(i_176_, i_177_);
	long l = IDirect3DDevice.GetRenderTarget(aLong11475, 0);
	if (!Class361.method6304
	     (IDirect3DDevice.StretchRect(aLong11475, l, 0, 0,
					  aClass168_1966.method2710(),
					  aClass168_1966.method2711(),
					  aLong11476, anInt1958 * 1000431205,
					  anInt1964 * 1482704485,
					  anInt1935 * -1588334531,
					  anInt1967 * -863940247, 2))) {
	    /* empty */
	}
	IUnknown.Release(l);
	IDirect3DDevice.GetRenderTargetData(aLong11475, aLong11476,
					    aLongArray11461[anInt11480]);
	long l_178_ = IDirect3DDevice.CreateEventQuery(aLong11475);
	if (Class361.method6305(IDirect3DEventQuery.Issue(l_178_)))
	    aLongArray11465[anInt11480] = l_178_;
	anIntArray11440[anInt11480] = i;
	if (++anInt11480 >= 3)
	    anInt11480 = 0;
    }
    
    public final void method15035(Class373 class373, int i, int i_179_,
				  int i_180_, int i_181_) {
	if (aClass273_Sub1_11457 != null)
	    aClass273_Sub1_11457.method15682();
	IDirect3DDevice.DrawIndexedPrimitive(aLong11475, method18060(class373),
					     0, i, i_179_, i_180_, i_181_);
    }
    
    void method14921() {
	if (aBool9156) {
	    D3DLIGHT.SetAmbient(aLong11444, aFloat9233 * aFloat9169,
				aFloat9299 * aFloat9169,
				aFloat9235 * aFloat9169, 0.0F);
	    aBool11449 = false;
	}
    }
    
    public void method14901(int i, Interface35 interface35) {
	Class421 class421 = (Class421) interface35;
	IDirect3DDevice.SetStreamSource(aLong11475, i, class421.aLong4692, 0,
					class421.method6745());
    }
    
    void method14816(Interface44 interface44) {
	IDirect3DDevice.SetIndices(aLong11475,
				   ((Class423) interface44).aLong4715);
    }
    
    void method14995() {
	/* empty */
    }
    
    Interface37 method14881(Class165 class165, int i, int i_182_, int i_183_,
			    boolean bool, byte[] is) {
	return new Class419_Sub2(this, class165, i, i_182_, i_183_, bool, is);
    }
    
    static Class182 method18073
	(Canvas canvas, Class180 class180, Interface24 interface24,
     Interface47 interface47, Interface48 interface48,
     Interface49 interface49, JS5 class458, Integer integer) {
	Class182_Sub1_Sub1 class182_sub1_sub1 = null;
	Class182_Sub1_Sub1 class182_sub1_sub1_184_;
	try {
	    int i = 0;
	    int i_185_ = 1;
	    long l = IDirect3D.Direct3DCreate();
	    D3DCAPS d3dcaps = new D3DCAPS();
	    IDirect3D.GetDeviceCaps(l, i, i_185_, d3dcaps);
	    if ((d3dcaps.RasterCaps & 0x1000000) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxSimultaneousTextures < 2)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x8) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x40) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x200) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
		throw new RuntimeException("");
	    if (d3dcaps.MaxStreams < 5)
		throw new RuntimeException("");
	    D3DPRESENT_PARAMETERS d3dpresent_parameters
		= new D3DPRESENT_PARAMETERS(canvas);
	    d3dpresent_parameters.Windowed = true;
	    d3dpresent_parameters.EnableAutoDepthStencil = true;
	    d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
	    d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
	    d3dpresent_parameters.BackBufferCount = 1;
	    d3dpresent_parameters.PresentationInterval = -2147483648;
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (!method18062(i, i_185_, l, integer.intValue(), d3ddisplaymode,
			     d3dpresent_parameters))
		throw new RuntimeException("");
	    int i_186_ = 0;
	    if ((d3dcaps.DevCaps & 0x100000) != 0)
		i_186_ |= 0x10;
	    long l_187_ = 0L;
	    try {
		l_187_ = IDirect3D.CreateDeviceContext(l, i, i_185_, canvas,
						       i_186_ | 0x40,
						       d3dpresent_parameters);
	    } catch (RuntimeException_Sub5 runtimeexception_sub5) {
		l_187_
		    = IDirect3D.CreateDeviceContext(l, i, i_185_, canvas,
						    i_186_ & ~0x100000 | 0x20,
						    d3dpresent_parameters);
	    }
	    class182_sub1_sub1
		= new Class182_Sub1_Sub1(i, i_185_, l, l_187_, d3ddisplaymode,
					 d3dpresent_parameters, d3dcaps,
					 class180, interface24, interface47,
					 interface48, interface49, class458,
					 integer.intValue());
	    if (!class182_sub1_sub1.aHashtable1951.containsKey(canvas)) {
		Class66.method1435(canvas, -716554328);
		class182_sub1_sub1.method3154
		    (canvas,
		     new Class168_Sub1_Sub2_Sub1(class182_sub1_sub1, canvas,
						 canvas.getWidth(),
						 canvas.getHeight(), true),
		     -256593131);
	    }
	    class182_sub1_sub1.method3317(canvas, -1996589194);
	    class182_sub1_sub1.method14665();
	    class182_sub1_sub1_184_ = class182_sub1_sub1;
	} catch (RuntimeException runtimeexception) {
	    if (class182_sub1_sub1 != null)
		class182_sub1_sub1.method3135();
	    throw runtimeexception;
	}
	return class182_sub1_sub1_184_;
    }
    
    public final void method15034(Class373 class373, int i, int i_188_) {
	if (aClass273_Sub1_11457 != null)
	    aClass273_Sub1_11457.method15682();
	IDirect3DDevice.DrawPrimitive(aLong11475, method18060(class373), i,
				      i_188_);
    }
    
    final void method14793(Interface44 interface44, Class373 class373, int i,
			   int i_189_, int i_190_, int i_191_) {
	if (aClass273_Sub1_11457 != null)
	    aClass273_Sub1_11457.method15682();
	IDirect3DDevice.DrawIndexedPrimitiveIB(aLong11475,
					       (((Class423) interface44)
						.aLong4715),
					       4, 0, i, i_189_, i_190_,
					       i_191_);
    }
    
    public void method3236() {
	long l = IDirect3DDevice.CreateEventQuery(aLong11475);
	if (Class361.method6305(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    void method14781(int i) {
	if (!aBool11469) {
	    int i_192_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState(aLong11475, 8, i_192_);
	}
    }
    
    void method15039(int i) {
	if (!aBool11469) {
	    int i_193_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState(aLong11475, 8, i_193_);
	}
    }
    
    static Class182 method18074
	(Canvas canvas, Class180 class180, Interface24 interface24,
     Interface47 interface47, Interface48 interface48,
     Interface49 interface49, JS5 class458, Integer integer) {
	Class182_Sub1_Sub1 class182_sub1_sub1 = null;
	Class182_Sub1_Sub1 class182_sub1_sub1_194_;
	try {
	    int i = 0;
	    int i_195_ = 1;
	    long l = IDirect3D.Direct3DCreate();
	    D3DCAPS d3dcaps = new D3DCAPS();
	    IDirect3D.GetDeviceCaps(l, i, i_195_, d3dcaps);
	    if ((d3dcaps.RasterCaps & 0x1000000) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxSimultaneousTextures < 2)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x8) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x40) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x200) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
		throw new RuntimeException("");
	    if (d3dcaps.MaxStreams < 5)
		throw new RuntimeException("");
	    D3DPRESENT_PARAMETERS d3dpresent_parameters
		= new D3DPRESENT_PARAMETERS(canvas);
	    d3dpresent_parameters.Windowed = true;
	    d3dpresent_parameters.EnableAutoDepthStencil = true;
	    d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
	    d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
	    d3dpresent_parameters.BackBufferCount = 1;
	    d3dpresent_parameters.PresentationInterval = -2147483648;
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (!method18062(i, i_195_, l, integer.intValue(), d3ddisplaymode,
			     d3dpresent_parameters))
		throw new RuntimeException("");
	    int i_196_ = 0;
	    if ((d3dcaps.DevCaps & 0x100000) != 0)
		i_196_ |= 0x10;
	    long l_197_ = 0L;
	    try {
		l_197_ = IDirect3D.CreateDeviceContext(l, i, i_195_, canvas,
						       i_196_ | 0x40,
						       d3dpresent_parameters);
	    } catch (RuntimeException_Sub5 runtimeexception_sub5) {
		l_197_
		    = IDirect3D.CreateDeviceContext(l, i, i_195_, canvas,
						    i_196_ & ~0x100000 | 0x20,
						    d3dpresent_parameters);
	    }
	    class182_sub1_sub1
		= new Class182_Sub1_Sub1(i, i_195_, l, l_197_, d3ddisplaymode,
					 d3dpresent_parameters, d3dcaps,
					 class180, interface24, interface47,
					 interface48, interface49, class458,
					 integer.intValue());
	    if (!class182_sub1_sub1.aHashtable1951.containsKey(canvas)) {
		Class66.method1435(canvas, 1023678080);
		class182_sub1_sub1.method3154
		    (canvas,
		     new Class168_Sub1_Sub2_Sub1(class182_sub1_sub1, canvas,
						 canvas.getWidth(),
						 canvas.getHeight(), true),
		     -914198014);
	    }
	    class182_sub1_sub1.method3317(canvas, -1303334765);
	    class182_sub1_sub1.method14665();
	    class182_sub1_sub1_194_ = class182_sub1_sub1;
	} catch (RuntimeException runtimeexception) {
	    if (class182_sub1_sub1 != null)
		class182_sub1_sub1.method3135();
	    throw runtimeexception;
	}
	return class182_sub1_sub1_194_;
    }
    
    boolean method18075(int i, int i_198_) {
	int i_199_ = IDirect3DDevice.TestCooperativeLevel(aLong11475);
	if (i_199_ == 0 || i_199_ == -2005530519) {
	    IDirect3DDevice.SetDepthStencilSurface(aLong11475, 0L);
	    for (int i_200_ = 1; i_200_ < 4; i_200_++)
		IDirect3DDevice.SetRenderTarget(aLong11475, i_200_, 0L);
	    for (int i_201_ = 0; i_201_ < 4; i_201_++)
		IDirect3DDevice.SetStreamSource(aLong11475, i_201_, 0L, 0, 0);
	    for (int i_202_ = 0; i_202_ < 4; i_202_++)
		IDirect3DDevice.SetTexture(aLong11475, i_202_, 0L);
	    IDirect3DDevice.SetIndices(aLong11475, 0L);
	    method14667();
	    aD3DPRESENT_PARAMETERS11442.BackBufferWidth = i;
	    aD3DPRESENT_PARAMETERS11442.BackBufferHeight = i_198_;
	    aD3DPRESENT_PARAMETERS11442.BackBufferCount = 1;
	    if (method18062(anInt11452, anInt11439, aLong11441, anInt9294,
			    aD3DDISPLAYMODE11443,
			    aD3DPRESENT_PARAMETERS11442)) {
		int i_203_
		    = IDirect3DDevice.Reset(aLong11475,
					    aD3DPRESENT_PARAMETERS11442);
		if (Class361.method6305(i_203_)) {
		    aBool11446 = false;
		    method14794();
		    method14666();
		    return true;
		}
	    }
	}
	return false;
    }
    
    boolean method18076(int i, int i_204_) {
	int i_205_ = IDirect3DDevice.TestCooperativeLevel(aLong11475);
	if (i_205_ == 0 || i_205_ == -2005530519) {
	    IDirect3DDevice.SetDepthStencilSurface(aLong11475, 0L);
	    for (int i_206_ = 1; i_206_ < 4; i_206_++)
		IDirect3DDevice.SetRenderTarget(aLong11475, i_206_, 0L);
	    for (int i_207_ = 0; i_207_ < 4; i_207_++)
		IDirect3DDevice.SetStreamSource(aLong11475, i_207_, 0L, 0, 0);
	    for (int i_208_ = 0; i_208_ < 4; i_208_++)
		IDirect3DDevice.SetTexture(aLong11475, i_208_, 0L);
	    IDirect3DDevice.SetIndices(aLong11475, 0L);
	    method14667();
	    aD3DPRESENT_PARAMETERS11442.BackBufferWidth = i;
	    aD3DPRESENT_PARAMETERS11442.BackBufferHeight = i_204_;
	    aD3DPRESENT_PARAMETERS11442.BackBufferCount = 1;
	    if (method18062(anInt11452, anInt11439, aLong11441, anInt9294,
			    aD3DDISPLAYMODE11443,
			    aD3DPRESENT_PARAMETERS11442)) {
		int i_209_
		    = IDirect3DDevice.Reset(aLong11475,
					    aD3DPRESENT_PARAMETERS11442);
		if (Class361.method6305(i_209_)) {
		    aBool11446 = false;
		    method14794();
		    method14666();
		    return true;
		}
	    }
	}
	return false;
    }
    
    Class525_Sub19 method18077(Interface52 interface52) {
	for (Class525_Sub19 class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14372((short) -3979);
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-1210925980)) {
	    if (class525_sub19.anObject10571 == interface52)
		return class525_sub19;
	}
	return null;
    }
    
    Class525_Sub19 method18078(Interface52 interface52) {
	for (Class525_Sub19 class525_sub19
		 = ((Class525_Sub19)
		    aClass709_11445.method14372((short) -11946));
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-1109707088)) {
	    if (class525_sub19.anObject10571 == interface52)
		return class525_sub19;
	}
	return null;
    }
    
    Class525_Sub19 method18079(Interface52 interface52) {
	for (Class525_Sub19 class525_sub19
		 = ((Class525_Sub19)
		    aClass709_11445.method14372((short) -14909));
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-1668461022)) {
	    if (class525_sub19.anObject10571 == interface52)
		return class525_sub19;
	}
	return null;
    }
    
    void method15045() {
	if (aLong11458 == 0L
	    && aClass368Array9208[anInt9246] != Class368.aClass368_3866) {
	    if (aClass368Array9208[anInt9246] == Class368.aClass368_3868)
		IDirect3DDevice.SetTransform
		    (aLong11475, 16 + anInt9246,
		     aClass435Array9248[anInt9246]
			 .method6980(aFloatArray11470));
	    else
		IDirect3DDevice.SetTransform
		    (aLong11475, 16 + anInt9246,
		     aClass435Array9248[anInt9246]
			 .method6974(aFloatArray11470));
	    int i = method18065(aClass368Array9208[anInt9246]);
	    if (i != anIntArray11467[anInt9246]) {
		IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 24,
						     i);
		anIntArray11467[anInt9246] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 24, 0);
	    anIntArray11467[anInt9246] = 0;
	}
    }
    
    Class525_Sub19 method18080(Interface52 interface52) {
	for (Class525_Sub19 class525_sub19
		 = ((Class525_Sub19)
		    aClass709_11445.method14372((short) -22816));
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-2021681186)) {
	    if (class525_sub19.anObject10571 == interface52)
		return class525_sub19;
	}
	return null;
    }
    
    void method14765(Interface44 interface44) {
	IDirect3DDevice.SetIndices(aLong11475,
				   ((Class423) interface44).aLong4715);
    }
    
    void method18081(Interface52 interface52) {
	if (method18047(interface52) == null)
	    aClass709_11445.method14345(new Class525_Sub19(interface52),
					(byte) 0);
    }
    
    void method18082(Interface52 interface52) {
	if (method18047(interface52) == null)
	    aClass709_11445.method14345(new Class525_Sub19(interface52),
					(byte) 0);
    }
    
    public void method3340(long l) {
	/* empty */
    }
    
    long method18083(int i, int i_210_, int[] is, int[] is_211_) {
	if (aLongArray11465[anInt11479] != 0L) {
	    IUnknown.Release(aLongArray11465[anInt11479]);
	    aLongArray11465[anInt11479] = 0L;
	}
	aByteBuffer9271.clear();
	IDirect3DSurface.Download(aLongArray11461[anInt11479], 0, 0, i, i_210_,
				  i * 4, 0, aLong9160);
	if (++anInt11479 >= 3)
	    anInt11479 = 0;
	if (is != null) {
	    aByteBuffer9271.asIntBuffer().get(is);
	    return 0L;
	}
	return aLong9160;
    }
    
    long method18084(int i, int i_212_, int[] is, int[] is_213_) {
	if (aLongArray11465[anInt11479] != 0L) {
	    IUnknown.Release(aLongArray11465[anInt11479]);
	    aLongArray11465[anInt11479] = 0L;
	}
	aByteBuffer9271.clear();
	IDirect3DSurface.Download(aLongArray11461[anInt11479], 0, 0, i, i_212_,
				  i * 4, 0, aLong9160);
	if (++anInt11479 >= 3)
	    anInt11479 = 0;
	if (is != null) {
	    aByteBuffer9271.asIntBuffer().get(is);
	    return 0L;
	}
	return aLong9160;
    }
    
    long method18085(int i, int i_214_, int[] is, int[] is_215_) {
	if (aLongArray11465[anInt11479] != 0L) {
	    IUnknown.Release(aLongArray11465[anInt11479]);
	    aLongArray11465[anInt11479] = 0L;
	}
	aByteBuffer9271.clear();
	IDirect3DSurface.Download(aLongArray11461[anInt11479], 0, 0, i, i_214_,
				  i * 4, 0, aLong9160);
	if (++anInt11479 >= 3)
	    anInt11479 = 0;
	if (is != null) {
	    aByteBuffer9271.asIntBuffer().get(is);
	    return 0L;
	}
	return aLong9160;
    }
    
    final void method18086(long l) {
	aLong11458 = l;
	IDirect3DDevice.SetVertexShader(aLong11475, l);
    }
    
    final void method18087(long l) {
	aLong11458 = l;
	IDirect3DDevice.SetVertexShader(aLong11475, l);
    }
    
    final void method18088(long l) {
	IDirect3DDevice.SetPixelShader(aLong11475, l);
    }
    
    public void method3337() {
	for (int i = 0; i < 3; i++) {
	    if (aLongArray11465[i] != 0L) {
		IUnknown.Release(aLongArray11465[i]);
		aLongArray11465[i] = 0L;
	    }
	}
	anInt11480 = 0;
	anInt11479 = 0;
    }
    
    final void method18089(long l) {
	IDirect3DDevice.SetPixelShader(aLong11475, l);
    }
    
    Interface38 method15042(Class165 class165, int i, int i_216_, boolean bool,
			    float[] fs, int i_217_, int i_218_) {
	return new Class419_Sub3(this, class165, i, i_216_, bool, fs, i_217_,
				 i_218_);
    }
    
    Class168_Sub1 method3403(Canvas canvas, int i, int i_219_) {
	return new Class168_Sub1_Sub2_Sub1(this, canvas, i, i_219_, false);
    }
    
    final void method18090(Class419_Sub2 class419_sub2) {
	method18053(class419_sub2);
	if (!aBoolArray11450[anInt9246]) {
	    IDirect3DDevice.SetSamplerState(aLong11475, anInt9246, 1, 1);
	    aBoolArray11450[anInt9246] = true;
	}
	if (!aBoolArray11451[anInt9246]) {
	    IDirect3DDevice.SetSamplerState(aLong11475, anInt9246, 2, 1);
	    aBoolArray11451[anInt9246] = true;
	}
    }
    
    void method14797() {
	if (aLong11458 == 0L
	    && aClass368Array9208[anInt9246] != Class368.aClass368_3866) {
	    if (aClass368Array9208[anInt9246] == Class368.aClass368_3868)
		IDirect3DDevice.SetTransform
		    (aLong11475, 16 + anInt9246,
		     aClass435Array9248[anInt9246]
			 .method6980(aFloatArray11470));
	    else
		IDirect3DDevice.SetTransform
		    (aLong11475, 16 + anInt9246,
		     aClass435Array9248[anInt9246]
			 .method6974(aFloatArray11470));
	    int i = method18065(aClass368Array9208[anInt9246]);
	    if (i != anIntArray11467[anInt9246]) {
		IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 24,
						     i);
		anIntArray11467[anInt9246] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, 24, 0);
	    anIntArray11467[anInt9246] = 0;
	}
    }
    
    void method15051(boolean bool) {
	IDirect3DDevice.method15881(aLong11475, 161, bool);
    }
    
    Interface42 method14957(Class165 class165, Class178 class178, int i,
			    int i_220_) {
	return new Class419_Sub3_Sub1(this, class165, class178, i, i_220_);
    }
    
    Interface38 method14946(int i, int i_221_, boolean bool, int[] is,
			    int i_222_, int i_223_) {
	return new Class419_Sub3(this, i, i_221_, bool, is, i_222_, i_223_);
    }
    
    static final int method18091(Class368 class368) {
	switch (class368.anInt3870) {
	case 5:
	    return 3;
	case 2:
	    return 1;
	case 0:
	    return 4;
	default:
	    return 0;
	case 3:
	    return 256;
	case 1:
	    return 2;
	}
    }
    
    static final int method18092(Class165 class165, Class178 class178) {
	switch (class178.anInt1910 * -1868954147) {
	case 5:
	    if (class165 == Class165.aClass165_1771)
		return 116;
	    break;
	case 1:
	    if (class165 == Class165.aClass165_1771)
		return 113;
	    break;
	case 2:
	    switch (class165.anInt1780 * -2093736709) {
	    case 7:
		return 51;
	    default:
		break;
	    case 6:
		return 50;
	    case 4:
		return Class365.anInt3854 * 868040931;
	    case 2:
		return Class365.anInt3853 * -847099087;
	    case 8:
		return 77;
	    case 5:
		return 28;
	    case 9:
		return 21;
	    case 0:
		return 22;
	    }
	    break;
	}
	throw new IllegalArgumentException("");
    }
    
    public Class168_Sub2 method3319() {
	return new Class168_Sub2_Sub3_Sub1(this);
    }
    
    void method15048(int i) {
	IDirect3DDevice.SetRenderState(aLong11475, 168, i);
    }
    
    public final synchronized void method3502(int i) {
	for (int i_224_ = 0; i_224_ < anInt11459; i_224_++)
	    IUnknown.Release(aLongArray11473[i_224_]);
	anInt11459 = 0;
	super.method3136(i);
    }
    
    void method14744() {
	switch (aClass367_9289.anInt3862) {
	case 2:
	    IDirect3DDevice.SetRenderState(aLong11475, 19, 9);
	    IDirect3DDevice.SetRenderState(aLong11475, 20, 2);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState(aLong11475, 19, 5);
	    IDirect3DDevice.SetRenderState(aLong11475, 20, 6);
	    break;
	case 1:
	    IDirect3DDevice.SetRenderState(aLong11475, 19, 2);
	    IDirect3DDevice.SetRenderState(aLong11475, 20, 1);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState(aLong11475, 19, 2);
	    IDirect3DDevice.SetRenderState(aLong11475, 20, 2);
	    break;
	}
	switch (anInt9288) {
	case 2:
	    IDirect3DDevice.SetRenderState(aLong11475, 207, 2);
	    IDirect3DDevice.SetRenderState(aLong11475, 208, 2);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState(aLong11475, 207, 1);
	    IDirect3DDevice.SetRenderState(aLong11475, 208, 1);
	    break;
	case 1:
	    IDirect3DDevice.SetRenderState(aLong11475, 207, 2);
	    IDirect3DDevice.SetRenderState(aLong11475, 208, 1);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState(aLong11475, 207, 1);
	    IDirect3DDevice.SetRenderState(aLong11475, 208, 2);
	    break;
	}
    }
    
    void method18093() {
	IDirect3DDevice.SetRenderState(aLong11475, 22, anInt9293);
    }
    
    public void method14838(Class435 class435, Class435 class435_225_,
			    Class435 class435_226_) {
	IDirect3DDevice.SetTransform(aLong11475, 256,
				     class435.aFloatArray4830);
	IDirect3DDevice.SetTransform(aLong11475, 2,
				     class435_225_.aFloatArray4830);
	IDirect3DDevice.SetTransform(aLong11475, 3,
				     class435_226_.aFloatArray4830);
    }
    
    final void method15023() {
	if (aBool9156)
	    IDirect3DDevice.SetRenderState(aLong11475, 60, anInt9252);
    }
    
    void method14853() {
	for (Class525_Sub19 class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14372((short) -9579);
	     class525_sub19 != null;
	     class525_sub19
		 = (Class525_Sub19) aClass709_11445.method14353(-1670347098)) {
	    Interface52 interface52
		= (Interface52) class525_sub19.anObject10571;
	    interface52.method217();
	    if (interface52 == aClass168_1966)
		interface52.method350();
	}
	super.method14794();
    }
    
    void method15052(boolean bool) {
	IDirect3DDevice.method15881(aLong11475, 161, bool);
    }
    
    void method14972(boolean bool) {
	IDirect3DDevice.method15881(aLong11475, 161, bool);
    }
    
    byte[] method18094(String string) {
	return method14661("dx", string);
    }
    
    byte[] method18095(String string) {
	return method14661("dx", string);
    }
    
    final void method18096(long l) {
	IDirect3DDevice.SetPixelShader(aLong11475, l);
    }
    
    static final int method18097(Class178 class178) {
	if (class178 == Class178.aClass178_1909)
	    return 80;
	if (class178 == Class178.aClass178_1913)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    static final int method18098(Class178 class178) {
	if (class178 == Class178.aClass178_1909)
	    return 80;
	if (class178 == Class178.aClass178_1913)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    void method15050() {
	aFloat9218 = aFloat9206 - (float) anInt9284;
	aFloat9207 = aFloat9218 - (float) anInt9283;
	if (aFloat9207 < aFloat9237)
	    aFloat9207 = aFloat9237;
	if (aBool9156) {
	    IDirect3DDevice.method15880(aLong11475, 36, aFloat9207);
	    IDirect3DDevice.method15880(aLong11475, 37, aFloat9218);
	    IDirect3DDevice.SetRenderState(aLong11475, 34, anInt9282);
	}
    }
    
    Interface38 method14919(Class165 class165, int i, int i_227_, boolean bool,
			    byte[] is, int i_228_, int i_229_) {
	return new Class419_Sub3(this, class165, i, i_227_, bool, is, i_228_,
				 i_229_);
    }
    
    void method14795() {
	if (aBool9156) {
	    D3DLIGHT.SetDirection(aLong11444, -aFloatArray9228[0],
				  -aFloatArray9228[1], -aFloatArray9228[2]);
	    D3DLIGHT.SetDirection(aLong11447, -aFloatArray9229[0],
				  -aFloatArray9229[1], -aFloatArray9229[2]);
	    aBool11449 = false;
	}
    }
    
    final void method14709(int i, Class371 class371, boolean bool) {
	if (aBool9156) {
	    int i_230_ = 0;
	    int i_231_;
	    switch (i) {
	    default:
		i_231_ = 5;
		break;
	    case 2:
		i_231_ = 27;
		break;
	    case 1:
		i_231_ = 6;
	    }
	    if (bool)
		i_230_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState(aLong11475, anInt9246, i_231_,
						 (method18057(class371)
						  | i_230_));
	}
    }
}
