/* Class346_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class346_Sub1 extends Class346
{
    Class435[] aClass435Array10150;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10151;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10152;
    static Class435 aClass435_10153 = new Class435();
    int[] anIntArray10154;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10155;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10156;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10157;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10158;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10159;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10160;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10161;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10162;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10163;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10164;
    static final int anInt10165 = 32;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10166;
    static final int anInt10167 = 1;
    static final int anInt10168 = 2;
    protected Class266 aClass266_10169;
    static final int anInt10170 = 8;
    static final int anInt10171 = 16;
    static final int anInt10172 = 128;
    static final int anInt10173 = 64;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10174;
    int anInt10175;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10176;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10177;
    static final int anInt10178 = 4;
    float[] aFloatArray10179 = new float[3];
    
    void method15765() {
	if (aClass266_10169 != null && aClass266_10169.method4830()) {
	    int i = aClass266_10169.method4816(-1150577310);
	    int i_0_ = anIntArray10154[i];
	    if ((i_0_ & 0x1) != 0 && aClass525_Sub5_Sub1_10152 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10152,
					   aClass182_Sub1_3729.method14695(),
					   -1974093605);
	    if ((i_0_ & 0x2) != 0) {
		if (aClass525_Sub5_Sub1_10166 != null)
		    aClass266_10169.method4827(aClass525_Sub5_Sub1_10166,
					       aClass182_Sub1_3729
						   .method14812(),
					       -2026672715);
		if (aClass525_Sub5_Sub1_10159 != null) {
		    aFloatArray10179[0] = 0.0F;
		    aFloatArray10179[1] = 0.0F;
		    aFloatArray10179[2] = 0.0F;
		    aClass182_Sub1_3729.method3491().method7151
			(aFloatArray10179[0], aFloatArray10179[1],
			 aFloatArray10179[2], aFloatArray10179);
		    aClass266_10169.method4820(aClass525_Sub5_Sub1_10159,
					       aFloatArray10179[0],
					       aFloatArray10179[1],
					       aFloatArray10179[2], 753873963);
		}
	    }
	    if ((i_0_ & 0x10) != 0 && aClass525_Sub5_Sub1_10156 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10156,
					   aClass182_Sub1_3729.method14799(),
					   -2054205205);
	    if ((i_0_ & 0x8) != 0 && aClass525_Sub5_Sub1_10155 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10155,
					   aClass182_Sub1_3729.method14692(),
					   -1550955591);
	    if ((i_0_ & 0x4) != 0 && aClass525_Sub5_Sub1_10158 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10158,
					   aClass182_Sub1_3729.method14699(),
					   -1673709788);
	    if ((i_0_ & 0x20) != 0 && aClass525_Sub5_Sub1_10157 != null) {
		aClass435_10153.method6949(aClass182_Sub1_3729.method14799(),
					   aClass182_Sub1_3729.method14699());
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10157,
					   aClass435_10153, -1688815294);
	    }
	    if ((i_0_ & 0x40) != 0 && aClass525_Sub5_Sub1_10174 != null) {
		aClass435_10153.method6949(aClass182_Sub1_3729.method14812(),
					   aClass182_Sub1_3729.method14699());
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10174,
					   aClass435_10153, -1892433187);
	    }
	    if (aClass182_Sub1_3729.method14817() == 0
		&& (anIntArray10154[i] & 0x80) != 0
		&& aClass525_Sub5_Sub1_10151 != null) {
		aClass266_10169.method4826(aClass525_Sub5_Sub1_10151,
					   aClass182_Sub1_3729.method14739(),
					   (short) 12473);
		anIntArray10154[i] &= ~0x80;
	    }
	    anIntArray10154[i] = 0;
	}
    }
    
    boolean method15766(String string) throws Exception_Sub5 {
	aClass266_10169 = aClass182_Sub1_3729.method14660(string);
	if (aClass266_10169 == null)
	    throw new Exception_Sub5("");
	aClass525_Sub5_Sub1_10151
	    = aClass266_10169.method4840("textureMatrix", -1855184122);
	aClass525_Sub5_Sub1_10152
	    = aClass266_10169.method4840("modelMatrix", -1460669624);
	aClass525_Sub5_Sub1_10166
	    = aClass266_10169.method4840("viewMatrix", -1482467549);
	aClass525_Sub5_Sub1_10158
	    = aClass266_10169.method4840("projectionMatrix", -1765347680);
	aClass525_Sub5_Sub1_10156
	    = aClass266_10169.method4840("modelViewMatrix", -1435475108);
	aClass525_Sub5_Sub1_10157
	    = aClass266_10169.method4840("modelViewProjectionMatrix",
					 -1399376062);
	aClass525_Sub5_Sub1_10174
	    = aClass266_10169.method4840("viewProjectionMatrix", -1264522309);
	aClass525_Sub5_Sub1_10162
	    = aClass266_10169.method4840("ambientColour", -2073889254);
	aClass525_Sub5_Sub1_10177
	    = aClass266_10169.method4840("sunDirection", -1667561683);
	aClass525_Sub5_Sub1_10163
	    = aClass266_10169.method4840("sunColour", -1372217682);
	aClass525_Sub5_Sub1_10164
	    = aClass266_10169.method4840("antiSunColour", -1812260198);
	aClass525_Sub5_Sub1_10176
	    = aClass266_10169.method4840("sunExponent", -1328990860);
	aClass525_Sub5_Sub1_10159
	    = aClass266_10169.method4840("eyePosition", -1540228685);
	aClass525_Sub5_Sub1_10160
	    = aClass266_10169.method4840("eyePositionOS", -1648923520);
	aClass525_Sub5_Sub1_10161
	    = aClass266_10169.method4840("sunDirectionOS", -1734982351);
	if (!method15767()) {
	    aClass266_10169 = null;
	    aClass525_Sub5_Sub1_10151 = null;
	    aClass525_Sub5_Sub1_10152 = null;
	    aClass525_Sub5_Sub1_10166 = null;
	    aClass525_Sub5_Sub1_10158 = null;
	    aClass525_Sub5_Sub1_10156 = null;
	    aClass525_Sub5_Sub1_10157 = null;
	    aClass525_Sub5_Sub1_10174 = null;
	    aClass525_Sub5_Sub1_10162 = null;
	    aClass525_Sub5_Sub1_10177 = null;
	    aClass525_Sub5_Sub1_10163 = null;
	    aClass525_Sub5_Sub1_10164 = null;
	    aClass525_Sub5_Sub1_10176 = null;
	    aClass525_Sub5_Sub1_10159 = null;
	    aClass525_Sub5_Sub1_10160 = null;
	    aClass525_Sub5_Sub1_10161 = null;
	    return false;
	}
	if (aClass266_10169.method4908(2029820497) == null) {
	    Class273 class273 = aClass266_10169.method4862(-1731655411);
	    if (class273 == null)
		throw new Exception_Sub5(new StringBuilder().append
					     (aClass266_10169
						  .method4838(-2142851475))
					     .append
					     ("").toString());
	    aClass266_10169.method4856(class273);
	}
	anInt10175 = aClass266_10169.method4810(65280);
	anIntArray10154 = new int[anInt10175];
	return true;
    }
    
    abstract boolean method15767() throws Exception_Sub5;
    
    void method6054() {
	aClass266_10169.method4804();
	anIntArray10154[aClass266_10169.method4816(-1325924538)] = -1;
	method15791(0);
	method15782();
    }
    
    void method15768() {
	method15772(aClass182_Sub1_3729.aBool9225);
	method15776(aClass182_Sub1_3729.method14739());
	method15770();
	method6062();
    }
    
    void method6068() {
	if (aClass266_10169 != null)
	    aClass266_10169.method4805();
    }
    
    void method15769(boolean bool) {
	if (aClass266_10169 != null && aClass266_10169.method4830()) {
	    if (aClass525_Sub5_Sub1_10162 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10162,
					   (aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9169),
					   (aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9169),
					   (aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9169),
					   -402147831);
	    if (aClass525_Sub5_Sub1_10177 != null)
		aClass266_10169.method4820
		    (aClass525_Sub5_Sub1_10177,
		     aClass182_Sub1_3729.aFloatArray9228[0],
		     aClass182_Sub1_3729.aFloatArray9228[1],
		     aClass182_Sub1_3729.aFloatArray9228[2], 566935482);
	    if (aClass525_Sub5_Sub1_10163 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10163,
					   (aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9152),
					   (aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9152),
					   (aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9152),
					   -1723628867);
	    if (aClass525_Sub5_Sub1_10164 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10164,
					   (-aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9238),
					   (-aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9238),
					   (-aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9238),
					   204748081);
	    if (aClass525_Sub5_Sub1_10176 != null)
		aClass266_10169.method4818(aClass525_Sub5_Sub1_10176,
					   64.0F + Math.abs(aClass182_Sub1_3729
							    .aFloatArray9228
							    [1]) * 928.0F,
					   1379679087);
	}
    }
    
    void method15770() {
	if (aClass266_10169 != null && aClass266_10169.method4830()) {
	    int i = aClass266_10169.method4816(-1167508645);
	    int i_1_ = anIntArray10154[i];
	    if ((i_1_ & 0x1) != 0 && aClass525_Sub5_Sub1_10152 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10152,
					   aClass182_Sub1_3729.method14695(),
					   -2019164395);
	    if ((i_1_ & 0x2) != 0) {
		if (aClass525_Sub5_Sub1_10166 != null)
		    aClass266_10169.method4827(aClass525_Sub5_Sub1_10166,
					       aClass182_Sub1_3729
						   .method14812(),
					       -1884254311);
		if (aClass525_Sub5_Sub1_10159 != null) {
		    aFloatArray10179[0] = 0.0F;
		    aFloatArray10179[1] = 0.0F;
		    aFloatArray10179[2] = 0.0F;
		    aClass182_Sub1_3729.method3491().method7151
			(aFloatArray10179[0], aFloatArray10179[1],
			 aFloatArray10179[2], aFloatArray10179);
		    aClass266_10169.method4820(aClass525_Sub5_Sub1_10159,
					       aFloatArray10179[0],
					       aFloatArray10179[1],
					       aFloatArray10179[2],
					       -809244699);
		}
	    }
	    if ((i_1_ & 0x10) != 0 && aClass525_Sub5_Sub1_10156 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10156,
					   aClass182_Sub1_3729.method14799(),
					   -1515823933);
	    if ((i_1_ & 0x8) != 0 && aClass525_Sub5_Sub1_10155 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10155,
					   aClass182_Sub1_3729.method14692(),
					   -2112928109);
	    if ((i_1_ & 0x4) != 0 && aClass525_Sub5_Sub1_10158 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10158,
					   aClass182_Sub1_3729.method14699(),
					   -2135277666);
	    if ((i_1_ & 0x20) != 0 && aClass525_Sub5_Sub1_10157 != null) {
		aClass435_10153.method6949(aClass182_Sub1_3729.method14799(),
					   aClass182_Sub1_3729.method14699());
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10157,
					   aClass435_10153, -1689844669);
	    }
	    if ((i_1_ & 0x40) != 0 && aClass525_Sub5_Sub1_10174 != null) {
		aClass435_10153.method6949(aClass182_Sub1_3729.method14812(),
					   aClass182_Sub1_3729.method14699());
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10174,
					   aClass435_10153, -1867855991);
	    }
	    if (aClass182_Sub1_3729.method14817() == 0
		&& (anIntArray10154[i] & 0x80) != 0
		&& aClass525_Sub5_Sub1_10151 != null) {
		aClass266_10169.method4826(aClass525_Sub5_Sub1_10151,
					   aClass182_Sub1_3729.method14739(),
					   (short) 3864);
		anIntArray10154[i] &= ~0x80;
	    }
	    anIntArray10154[i] = 0;
	}
    }
    
    void method6053() {
	method15774(Class444.aClass444_4889);
    }
    
    void method15771(int i, Class444 class444) {
	if (aClass525_Sub5_Sub1_10161 != null) {
	    float[] fs = { aClass182_Sub1_3729.aFloatArray9228[0],
			   aClass182_Sub1_3729.aFloatArray9228[1],
			   aClass182_Sub1_3729.aFloatArray9228[2] };
	    class444.method7153(fs);
	    aClass266_10169.method4820(aClass525_Sub5_Sub1_10161, fs[0], fs[1],
				       fs[2], -332131268);
	}
    }
    
    void method15772(boolean bool) {
	if (aClass266_10169 != null && aClass266_10169.method4830()) {
	    if (aClass525_Sub5_Sub1_10162 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10162,
					   (aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9169),
					   (aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9169),
					   (aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9169),
					   268321027);
	    if (aClass525_Sub5_Sub1_10177 != null)
		aClass266_10169.method4820
		    (aClass525_Sub5_Sub1_10177,
		     aClass182_Sub1_3729.aFloatArray9228[0],
		     aClass182_Sub1_3729.aFloatArray9228[1],
		     aClass182_Sub1_3729.aFloatArray9228[2], 700146393);
	    if (aClass525_Sub5_Sub1_10163 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10163,
					   (aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9152),
					   (aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9152),
					   (aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9152),
					   717198371);
	    if (aClass525_Sub5_Sub1_10164 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10164,
					   (-aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9238),
					   (-aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9238),
					   (-aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9238),
					   -1420299309);
	    if (aClass525_Sub5_Sub1_10176 != null)
		aClass266_10169.method4818(aClass525_Sub5_Sub1_10176,
					   64.0F + Math.abs(aClass182_Sub1_3729
							    .aFloatArray9228
							    [1]) * 928.0F,
					   -2088390027);
	}
    }
    
    void method6062() {
	/* empty */
    }
    
    void method15773(int i) {
	for (int i_2_ = 0; i_2_ < anInt10175; i_2_++)
	    anIntArray10154[i_2_] |= 128 << i;
    }
    
    void method15774(Class444 class444) {
	Class435 class435 = aClass182_Sub1_3729.aClass435_9180;
	class435.method7040(class444);
	int i = aClass266_10169.method4816(-1074058112);
	if (aClass525_Sub5_Sub1_10152 != null) {
	    aClass266_10169.method4827(aClass525_Sub5_Sub1_10152, class435,
				       -1747812289);
	    anIntArray10154[i] &= ~0x1;
	}
	if (aClass525_Sub5_Sub1_10156 != null) {
	    aClass435_10153.method6949(class435,
				       aClass182_Sub1_3729.method14812());
	    aClass266_10169.method4827(aClass525_Sub5_Sub1_10156,
				       aClass435_10153, -2055546134);
	    anIntArray10154[i] &= ~0x10;
	}
	if (aClass525_Sub5_Sub1_10157 != null) {
	    aClass435_10153.method6949(class435,
				       aClass182_Sub1_3729.method14698());
	    aClass266_10169.method4827(aClass525_Sub5_Sub1_10157,
				       aClass435_10153, -1874634869);
	    anIntArray10154[i] &= ~0x20;
	}
	method15775(i, class444);
	method15771(i, class444);
    }
    
    void method6064() {
	method15774(Class444.aClass444_4889);
    }
    
    void method15775(int i, Class444 class444) {
	if (aClass525_Sub5_Sub1_10160 != null) {
	    Class435 class435 = aClass182_Sub1_3729.method14692();
	    float[] fs
		= { class435.aFloatArray4830[12], class435.aFloatArray4830[13],
		    class435.aFloatArray4830[14] };
	    float[] fs_3_ = { 0.0F, 0.0F, 0.0F };
	    class435.method6957(fs_3_);
	    float[] fs_4_ = { 0.0F, 0.0F, 0.0F };
	    aClass182_Sub1_3729.method3491().method7168(0.0F, 0.0F, 0.0F,
							fs_4_);
	    class444.method7152(fs);
	    aClass266_10169.method4820(aClass525_Sub5_Sub1_10160, fs[0], fs[1],
				       fs[2], -1406173959);
	}
    }
    
    void method15776(Class435 class435) {
	if (aClass266_10169 != null && aClass266_10169.method4830()
	    && aClass182_Sub1_3729.method14817() == 0) {
	    int i = aClass266_10169.method4816(-1240830544);
	    if ((anIntArray10154[i] & 0x80) != 0
		&& aClass525_Sub5_Sub1_10151 != null) {
		aClass266_10169.method4826(aClass525_Sub5_Sub1_10151, class435,
					   (short) 23634);
		anIntArray10154[i] &= ~0x80;
	    }
	}
    }
    
    void method15777(int i) {
	for (int i_5_ = 0; i_5_ < anInt10175; i_5_++)
	    anIntArray10154[i_5_] |= 128 << i;
    }
    
    void method6071() {
	aClass266_10169.method4804();
	anIntArray10154[aClass266_10169.method4816(-1226860425)] = -1;
	method15791(0);
	method15782();
    }
    
    void method6063() {
	aClass266_10169.method4804();
	anIntArray10154[aClass266_10169.method4816(-1758042969)] = -1;
	method15791(0);
	method15782();
    }
    
    void method6057() {
	if (aClass266_10169 != null)
	    aClass266_10169.method4805();
    }
    
    void method6055() {
	/* empty */
    }
    
    void method6069() {
	/* empty */
    }
    
    Class346_Sub1(Class182_Sub1 class182_sub1) {
	super(class182_sub1);
	new Class444();
	aClass435Array10150 = new Class435[aClass182_Sub1_3729.anInt9300];
	for (int i = 0; i < aClass182_Sub1_3729.anInt9300; i++)
	    aClass435Array10150[i] = new Class435();
    }
    
    abstract boolean method15778() throws Exception_Sub5;
    
    void method6061() {
	aClass266_10169.method4804();
	anIntArray10154[aClass266_10169.method4816(-1407493329)] = -1;
	method15791(0);
	method15782();
    }
    
    void method15779(int i) {
	for (int i_6_ = 0; i_6_ < anInt10175; i_6_++)
	    anIntArray10154[i_6_] |= 128 << i;
    }
    
    void method15780() {
	if (aClass266_10169 != null && aClass266_10169.method4830()) {
	    int i = aClass266_10169.method4816(-1424768162);
	    int i_7_ = anIntArray10154[i];
	    if ((i_7_ & 0x1) != 0 && aClass525_Sub5_Sub1_10152 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10152,
					   aClass182_Sub1_3729.method14695(),
					   -1919736513);
	    if ((i_7_ & 0x2) != 0) {
		if (aClass525_Sub5_Sub1_10166 != null)
		    aClass266_10169.method4827(aClass525_Sub5_Sub1_10166,
					       aClass182_Sub1_3729
						   .method14812(),
					       -1889992504);
		if (aClass525_Sub5_Sub1_10159 != null) {
		    aFloatArray10179[0] = 0.0F;
		    aFloatArray10179[1] = 0.0F;
		    aFloatArray10179[2] = 0.0F;
		    aClass182_Sub1_3729.method3491().method7151
			(aFloatArray10179[0], aFloatArray10179[1],
			 aFloatArray10179[2], aFloatArray10179);
		    aClass266_10169.method4820(aClass525_Sub5_Sub1_10159,
					       aFloatArray10179[0],
					       aFloatArray10179[1],
					       aFloatArray10179[2],
					       -1586452702);
		}
	    }
	    if ((i_7_ & 0x10) != 0 && aClass525_Sub5_Sub1_10156 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10156,
					   aClass182_Sub1_3729.method14799(),
					   -2121856864);
	    if ((i_7_ & 0x8) != 0 && aClass525_Sub5_Sub1_10155 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10155,
					   aClass182_Sub1_3729.method14692(),
					   -1734989871);
	    if ((i_7_ & 0x4) != 0 && aClass525_Sub5_Sub1_10158 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10158,
					   aClass182_Sub1_3729.method14699(),
					   -1565373965);
	    if ((i_7_ & 0x20) != 0 && aClass525_Sub5_Sub1_10157 != null) {
		aClass435_10153.method6949(aClass182_Sub1_3729.method14799(),
					   aClass182_Sub1_3729.method14699());
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10157,
					   aClass435_10153, -1784728142);
	    }
	    if ((i_7_ & 0x40) != 0 && aClass525_Sub5_Sub1_10174 != null) {
		aClass435_10153.method6949(aClass182_Sub1_3729.method14812(),
					   aClass182_Sub1_3729.method14699());
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10174,
					   aClass435_10153, -1549332515);
	    }
	    if (aClass182_Sub1_3729.method14817() == 0
		&& (anIntArray10154[i] & 0x80) != 0
		&& aClass525_Sub5_Sub1_10151 != null) {
		aClass266_10169.method4826(aClass525_Sub5_Sub1_10151,
					   aClass182_Sub1_3729.method14739(),
					   (short) 10385);
		anIntArray10154[i] &= ~0x80;
	    }
	    anIntArray10154[i] = 0;
	}
    }
    
    void method15781() {
	if (aClass266_10169 != null && aClass266_10169.method4830()) {
	    int i = aClass266_10169.method4816(-1354099380);
	    int i_8_ = anIntArray10154[i];
	    if ((i_8_ & 0x1) != 0 && aClass525_Sub5_Sub1_10152 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10152,
					   aClass182_Sub1_3729.method14695(),
					   -1873907025);
	    if ((i_8_ & 0x2) != 0) {
		if (aClass525_Sub5_Sub1_10166 != null)
		    aClass266_10169.method4827(aClass525_Sub5_Sub1_10166,
					       aClass182_Sub1_3729
						   .method14812(),
					       -2074285475);
		if (aClass525_Sub5_Sub1_10159 != null) {
		    aFloatArray10179[0] = 0.0F;
		    aFloatArray10179[1] = 0.0F;
		    aFloatArray10179[2] = 0.0F;
		    aClass182_Sub1_3729.method3491().method7151
			(aFloatArray10179[0], aFloatArray10179[1],
			 aFloatArray10179[2], aFloatArray10179);
		    aClass266_10169.method4820(aClass525_Sub5_Sub1_10159,
					       aFloatArray10179[0],
					       aFloatArray10179[1],
					       aFloatArray10179[2],
					       -2045366299);
		}
	    }
	    if ((i_8_ & 0x10) != 0 && aClass525_Sub5_Sub1_10156 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10156,
					   aClass182_Sub1_3729.method14799(),
					   -1654914038);
	    if ((i_8_ & 0x8) != 0 && aClass525_Sub5_Sub1_10155 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10155,
					   aClass182_Sub1_3729.method14692(),
					   -2065404482);
	    if ((i_8_ & 0x4) != 0 && aClass525_Sub5_Sub1_10158 != null)
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10158,
					   aClass182_Sub1_3729.method14699(),
					   -1519986109);
	    if ((i_8_ & 0x20) != 0 && aClass525_Sub5_Sub1_10157 != null) {
		aClass435_10153.method6949(aClass182_Sub1_3729.method14799(),
					   aClass182_Sub1_3729.method14699());
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10157,
					   aClass435_10153, -1839579355);
	    }
	    if ((i_8_ & 0x40) != 0 && aClass525_Sub5_Sub1_10174 != null) {
		aClass435_10153.method6949(aClass182_Sub1_3729.method14812(),
					   aClass182_Sub1_3729.method14699());
		aClass266_10169.method4827(aClass525_Sub5_Sub1_10174,
					   aClass435_10153, -1507134751);
	    }
	    if (aClass182_Sub1_3729.method14817() == 0
		&& (anIntArray10154[i] & 0x80) != 0
		&& aClass525_Sub5_Sub1_10151 != null) {
		aClass266_10169.method4826(aClass525_Sub5_Sub1_10151,
					   aClass182_Sub1_3729.method14739(),
					   (short) 11956);
		anIntArray10154[i] &= ~0x80;
	    }
	    anIntArray10154[i] = 0;
	}
    }
    
    void method15782() {
	method15772(aClass182_Sub1_3729.aBool9225);
	method15776(aClass182_Sub1_3729.method14739());
	method15770();
	method6062();
    }
    
    void method15783(int i, Class444 class444) {
	if (aClass525_Sub5_Sub1_10160 != null) {
	    Class435 class435 = aClass182_Sub1_3729.method14692();
	    float[] fs
		= { class435.aFloatArray4830[12], class435.aFloatArray4830[13],
		    class435.aFloatArray4830[14] };
	    float[] fs_9_ = { 0.0F, 0.0F, 0.0F };
	    class435.method6957(fs_9_);
	    float[] fs_10_ = { 0.0F, 0.0F, 0.0F };
	    aClass182_Sub1_3729.method3491().method7168(0.0F, 0.0F, 0.0F,
							fs_10_);
	    class444.method7152(fs);
	    aClass266_10169.method4820(aClass525_Sub5_Sub1_10160, fs[0], fs[1],
				       fs[2], 46109524);
	}
    }
    
    void method15784(int i, Class444 class444) {
	if (aClass525_Sub5_Sub1_10161 != null) {
	    float[] fs = { aClass182_Sub1_3729.aFloatArray9228[0],
			   aClass182_Sub1_3729.aFloatArray9228[1],
			   aClass182_Sub1_3729.aFloatArray9228[2] };
	    class444.method7153(fs);
	    aClass266_10169.method4820(aClass525_Sub5_Sub1_10161, fs[0], fs[1],
				       fs[2], -1473567231);
	}
    }
    
    void method15785(int i, Class444 class444) {
	if (aClass525_Sub5_Sub1_10161 != null) {
	    float[] fs = { aClass182_Sub1_3729.aFloatArray9228[0],
			   aClass182_Sub1_3729.aFloatArray9228[1],
			   aClass182_Sub1_3729.aFloatArray9228[2] };
	    class444.method7153(fs);
	    aClass266_10169.method4820(aClass525_Sub5_Sub1_10161, fs[0], fs[1],
				       fs[2], -1689026176);
	}
    }
    
    void method15786(int i, Class444 class444) {
	if (aClass525_Sub5_Sub1_10161 != null) {
	    float[] fs = { aClass182_Sub1_3729.aFloatArray9228[0],
			   aClass182_Sub1_3729.aFloatArray9228[1],
			   aClass182_Sub1_3729.aFloatArray9228[2] };
	    class444.method7153(fs);
	    aClass266_10169.method4820(aClass525_Sub5_Sub1_10161, fs[0], fs[1],
				       fs[2], -733720847);
	}
    }
    
    void method15787(int i, Class444 class444) {
	if (aClass525_Sub5_Sub1_10161 != null) {
	    float[] fs = { aClass182_Sub1_3729.aFloatArray9228[0],
			   aClass182_Sub1_3729.aFloatArray9228[1],
			   aClass182_Sub1_3729.aFloatArray9228[2] };
	    class444.method7153(fs);
	    aClass266_10169.method4820(aClass525_Sub5_Sub1_10161, fs[0], fs[1],
				       fs[2], -515738866);
	}
    }
    
    void method15788(int i) {
	for (int i_11_ = 0; i_11_ < anInt10175; i_11_++)
	    anIntArray10154[i_11_] |= 128 << i;
    }
    
    void method15789(boolean bool) {
	if (aClass266_10169 != null && aClass266_10169.method4830()) {
	    if (aClass525_Sub5_Sub1_10162 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10162,
					   (aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9169),
					   (aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9169),
					   (aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9169),
					   -124199799);
	    if (aClass525_Sub5_Sub1_10177 != null)
		aClass266_10169.method4820
		    (aClass525_Sub5_Sub1_10177,
		     aClass182_Sub1_3729.aFloatArray9228[0],
		     aClass182_Sub1_3729.aFloatArray9228[1],
		     aClass182_Sub1_3729.aFloatArray9228[2], -1136265727);
	    if (aClass525_Sub5_Sub1_10163 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10163,
					   (aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9152),
					   (aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9152),
					   (aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9152),
					   133992828);
	    if (aClass525_Sub5_Sub1_10164 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10164,
					   (-aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9238),
					   (-aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9238),
					   (-aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9238),
					   247020485);
	    if (aClass525_Sub5_Sub1_10176 != null)
		aClass266_10169.method4818(aClass525_Sub5_Sub1_10176,
					   64.0F + Math.abs(aClass182_Sub1_3729
							    .aFloatArray9228
							    [1]) * 928.0F,
					   -1508016565);
	}
    }
    
    abstract boolean method15790() throws Exception_Sub5;
    
    void method15791(int i) {
	aClass435Array10150[0].method7023();
	method15773(i);
    }
    
    void method15792(Class435 class435) {
	if (aClass266_10169 != null && aClass266_10169.method4830()
	    && aClass182_Sub1_3729.method14817() == 0) {
	    int i = aClass266_10169.method4816(-1341437234);
	    if ((anIntArray10154[i] & 0x80) != 0
		&& aClass525_Sub5_Sub1_10151 != null) {
		aClass266_10169.method4826(aClass525_Sub5_Sub1_10151, class435,
					   (short) 21692);
		anIntArray10154[i] &= ~0x80;
	    }
	}
    }
    
    void method15793(boolean bool) {
	if (aClass266_10169 != null && aClass266_10169.method4830()) {
	    if (aClass525_Sub5_Sub1_10162 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10162,
					   (aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9169),
					   (aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9169),
					   (aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9169),
					   -433199946);
	    if (aClass525_Sub5_Sub1_10177 != null)
		aClass266_10169.method4820
		    (aClass525_Sub5_Sub1_10177,
		     aClass182_Sub1_3729.aFloatArray9228[0],
		     aClass182_Sub1_3729.aFloatArray9228[1],
		     aClass182_Sub1_3729.aFloatArray9228[2], -189708136);
	    if (aClass525_Sub5_Sub1_10163 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10163,
					   (aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9152),
					   (aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9152),
					   (aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9152),
					   503992926);
	    if (aClass525_Sub5_Sub1_10164 != null)
		aClass266_10169.method4820(aClass525_Sub5_Sub1_10164,
					   (-aClass182_Sub1_3729.aFloat9233
					    * aClass182_Sub1_3729.aFloat9238),
					   (-aClass182_Sub1_3729.aFloat9299
					    * aClass182_Sub1_3729.aFloat9238),
					   (-aClass182_Sub1_3729.aFloat9235
					    * aClass182_Sub1_3729.aFloat9238),
					   -986911607);
	    if (aClass525_Sub5_Sub1_10176 != null)
		aClass266_10169.method4818(aClass525_Sub5_Sub1_10176,
					   64.0F + Math.abs(aClass182_Sub1_3729
							    .aFloatArray9228
							    [1]) * 928.0F,
					   810005927);
	}
    }
    
    void method15794(Class444 class444) {
	Class435 class435 = aClass182_Sub1_3729.aClass435_9180;
	class435.method7040(class444);
	int i = aClass266_10169.method4816(-1225195700);
	if (aClass525_Sub5_Sub1_10152 != null) {
	    aClass266_10169.method4827(aClass525_Sub5_Sub1_10152, class435,
				       -1690536428);
	    anIntArray10154[i] &= ~0x1;
	}
	if (aClass525_Sub5_Sub1_10156 != null) {
	    aClass435_10153.method6949(class435,
				       aClass182_Sub1_3729.method14812());
	    aClass266_10169.method4827(aClass525_Sub5_Sub1_10156,
				       aClass435_10153, -1619569215);
	    anIntArray10154[i] &= ~0x10;
	}
	if (aClass525_Sub5_Sub1_10157 != null) {
	    aClass435_10153.method6949(class435,
				       aClass182_Sub1_3729.method14698());
	    aClass266_10169.method4827(aClass525_Sub5_Sub1_10157,
				       aClass435_10153, -2112391615);
	    anIntArray10154[i] &= ~0x20;
	}
	method15775(i, class444);
	method15771(i, class444);
    }
    
    void method6060() {
	aClass266_10169.method4804();
	anIntArray10154[aClass266_10169.method4816(-1932313089)] = -1;
	method15791(0);
	method15782();
    }
    
    void method6072() {
	method15774(Class444.aClass444_4889);
    }
}
