/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class228
{
    static final int anInt2346 = 1;
    static final int anInt2347 = 1;
    static final int anInt2348 = 2;
    static final int anInt2349 = 4;
    int anInt2350;
    long aLong2351;
    String aString2352;
    boolean aBool2353;
    long aLong2354;
    Class9 aClass9_2355;
    int anInt2356;
    ArrayList anArrayList2357;
    boolean aBool2358;
    ArrayList anArrayList2359;
    int anInt2360 = -206765475;
    boolean aBool2361;
    
    void method4263() {
	Iterator iterator = anArrayList2359.iterator();
	while (iterator.hasNext()) {
	    Class218 class218 = (Class218) iterator.next();
	    class218.method4160(Class239.aClass239_2405, -995882994);
	}
    }
    
    public List method4264(int i) {
	return Collections.unmodifiableList(anArrayList2359);
    }
    
    void method4265() {
	Iterator iterator = anArrayList2359.iterator();
	while (iterator.hasNext()) {
	    Class218 class218 = (Class218) iterator.next();
	    class218.method4160(Class239.aClass239_2407, 1029276610);
	}
    }
    
    int method4266(byte i) {
	return anInt2356 * 1662254083;
    }
    
    void method4267(byte i) {
	anInt2356 += 312446635;
    }
    
    public boolean method4268(int i) {
	return aBool2353;
    }
    
    public long method4269() {
	return aLong2351 * 6301367537106280645L;
    }
    
    public long method4270(int i) {
	return aLong2351 * 6301367537106280645L;
    }
    
    void method4271() {
	int i = -1;
	int i_0_ = -1;
	for (int i_1_ = 0; i_1_ < anArrayList2359.size(); i_1_++) {
	    Class218 class218 = (Class218) anArrayList2359.get(i_1_);
	    int i_2_ = class218.method4188((byte) -36);
	    if (i_2_ > i) {
		i = i_2_;
		i_0_ = i_1_;
	    }
	}
	anInt2360 = i_0_ * 206765475;
    }
    
    void method4272(byte i) {
	int i_3_ = -1;
	int i_4_ = -1;
	for (int i_5_ = 0; i_5_ < anArrayList2359.size(); i_5_++) {
	    Class218 class218 = (Class218) anArrayList2359.get(i_5_);
	    int i_6_ = class218.method4188((byte) -94);
	    if (i_6_ > i_3_) {
		i_3_ = i_6_;
		i_4_ = i_5_;
	    }
	}
	anInt2360 = i_4_ * 206765475;
    }
    
    public int method4273(byte i) {
	return anInt2360 * -2049827317;
    }
    
    void method4274(int i, Class218 class218) {
	Class218 class218_7_ = (Class218) anArrayList2359.get(i);
	class218_7_.method4166(class218, 784200969);
    }
    
    public Class218 method4275(int i, int i_8_) {
	if (-1 == i)
	    return null;
	return (Class218) anArrayList2359.get(i);
    }
    
    public String method4276(int i) {
	return aString2352;
    }
    
    void method4277(int i, boolean bool) {
	Class218 class218 = (Class218) anArrayList2359.get(i);
	class218.method4160((bool ? Class239.aClass239_2406
			     : Class239.aClass239_2410),
			    1667633997);
    }
    
    void method4278(Class218 class218, int i) {
	anArrayList2359.add(class218);
	method4272((byte) -5);
    }
    
    void method4279(int i, short i_9_) {
	anArrayList2359.remove(i);
	method4272((byte) -90);
    }
    
    void method4280(Class230 class230, int i) {
	anArrayList2357.add(class230);
    }
    
    void method4281(int i, int i_10_) {
	((Class218) anArrayList2359.get(i)).method4155(i_10_, 1081041056);
    }
    
    void method4282(int i, int i_11_, int i_12_) {
	((Class218) anArrayList2359.get(i)).method4165(i_11_, -1002448354);
	method4272((byte) -56);
    }
    
    void method4283(int i, int i_13_, int i_14_) {
	Class218 class218 = (Class218) anArrayList2359.get(i);
	class218.method4156(i_13_, 901995883);
	class218.method4158(true, 808848415);
    }
    
    void method4284(int i, int i_15_) {
	Class218 class218 = (Class218) anArrayList2359.get(i);
	class218.method4158(false, 808848415);
    }
    
    void method4285(int i, boolean bool, int i_16_) {
	Class218 class218 = (Class218) anArrayList2359.get(i);
	class218.method4160((bool ? Class239.aClass239_2406
			     : Class239.aClass239_2410),
			    -988517799);
    }
    
    int method4286() {
	return anInt2356 * 1662254083;
    }
    
    void method4287(short i) {
	Iterator iterator = anArrayList2359.iterator();
	while (iterator.hasNext()) {
	    Class218 class218 = (Class218) iterator.next();
	    class218.method4160(Class239.aClass239_2407, 1933861400);
	}
    }
    
    void method4288(int i) {
	Iterator iterator = anArrayList2359.iterator();
	while (iterator.hasNext()) {
	    Class218 class218 = (Class218) iterator.next();
	    class218.method4160(Class239.aClass239_2405, 1911866057);
	}
    }
    
    void method4289(int i, Class218 class218, int i_17_) {
	Class218 class218_18_ = (Class218) anArrayList2359.get(i);
	class218_18_.method4166(class218, 1167066054);
    }
    
    void method4290(int i) {
	anArrayList2359.remove(i);
	method4272((byte) -76);
    }
    
    void method4291(int i, int i_19_) {
	((Class218) anArrayList2359.get(i)).method4165(i_19_, -537343382);
	method4272((byte) -29);
    }
    
    public List method4292() {
	return Collections.unmodifiableList(anArrayList2357);
    }
    
    public Interface17 method4293() {
	return new Class144(Class453.aClass453_4947, aClass9_2355);
    }
    
    int method4294() {
	return anInt2356 * 1662254083;
    }
    
    void method4295() {
	anInt2356 += 312446635;
    }
    
    void method4296(int i, int i_20_) {
	anArrayList2357.remove(i);
    }
    
    public long method4297() {
	return aLong2351 * 6301367537106280645L;
    }
    
    void method4298(int i, Class218 class218) {
	Class218 class218_21_ = (Class218) anArrayList2359.get(i);
	class218_21_.method4166(class218, 854146930);
    }
    
    public Interface17 method4299() {
	return new Class144(Class453.aClass453_4947, aClass9_2355);
    }
    
    public int hashCode() {
	return (int) (aLong2354 * 4573397280263845675L);
    }
    
    public long method4300() {
	return aLong2351 * 6301367537106280645L;
    }
    
    public int method4301() {
	return (int) (aLong2354 * 4573397280263845675L);
    }
    
    public int method4302() {
	return (int) (aLong2354 * 4573397280263845675L);
    }
    
    void method4303(Class218 class218) {
	anArrayList2359.add(class218);
	method4272((byte) -105);
    }
    
    void method4304() {
	int i = -1;
	int i_22_ = -1;
	for (int i_23_ = 0; i_23_ < anArrayList2359.size(); i_23_++) {
	    Class218 class218 = (Class218) anArrayList2359.get(i_23_);
	    int i_24_ = class218.method4188((byte) 104);
	    if (i_24_ > i) {
		i = i_24_;
		i_22_ = i_23_;
	    }
	}
	anInt2360 = i_22_ * 206765475;
    }
    
    void method4305() {
	int i = -1;
	int i_25_ = -1;
	for (int i_26_ = 0; i_26_ < anArrayList2359.size(); i_26_++) {
	    Class218 class218 = (Class218) anArrayList2359.get(i_26_);
	    int i_27_ = class218.method4188((byte) 32);
	    if (i_27_ > i) {
		i = i_27_;
		i_25_ = i_26_;
	    }
	}
	anInt2360 = i_25_ * 206765475;
    }
    
    public int method4306() {
	return anInt2360 * -2049827317;
    }
    
    public int method4307() {
	return anInt2360 * -2049827317;
    }
    
    public int method4308() {
	return anInt2360 * -2049827317;
    }
    
    public int method4309() {
	return anInt2360 * -2049827317;
    }
    
    public Class239 method4310() {
	if (anArrayList2359.isEmpty())
	    return Class239.aClass239_2410;
	Class239 class239
	    = ((Class218) anArrayList2359.get(0)).method4159(-479205944);
	switch (1635395023 * class239.anInt2409) {
	default: {
	    Iterator iterator = anArrayList2359.iterator();
	    while (iterator.hasNext()) {
		Class218 class218 = (Class218) iterator.next();
		if (class218.method4159(-78628378) == Class239.aClass239_2410)
		    return Class239.aClass239_2410;
	    }
	    return Class239.aClass239_2406;
	}
	case 0:
	case 3:
	    return class239;
	}
    }
    
    public Class239 method4311() {
	if (anArrayList2359.isEmpty())
	    return Class239.aClass239_2410;
	Class239 class239
	    = ((Class218) anArrayList2359.get(0)).method4159(-1366902309);
	switch (1635395023 * class239.anInt2409) {
	default: {
	    Iterator iterator = anArrayList2359.iterator();
	    while (iterator.hasNext()) {
		Class218 class218 = (Class218) iterator.next();
		if (class218.method4159(-1044211939)
		    == Class239.aClass239_2410)
		    return Class239.aClass239_2410;
	    }
	    return Class239.aClass239_2406;
	}
	case 0:
	case 3:
	    return class239;
	}
    }
    
    public Class239 method4312() {
	if (anArrayList2359.isEmpty())
	    return Class239.aClass239_2410;
	Class239 class239
	    = ((Class218) anArrayList2359.get(0)).method4159(986870590);
	switch (1635395023 * class239.anInt2409) {
	default: {
	    Iterator iterator = anArrayList2359.iterator();
	    while (iterator.hasNext()) {
		Class218 class218 = (Class218) iterator.next();
		if (class218.method4159(288953903) == Class239.aClass239_2410)
		    return Class239.aClass239_2410;
	    }
	    return Class239.aClass239_2406;
	}
	case 0:
	case 3:
	    return class239;
	}
    }
    
    public Class218 method4313(int i) {
	if (-1 == i)
	    return null;
	return (Class218) anArrayList2359.get(i);
    }
    
    public String method4314() {
	return aString2352;
    }
    
    public Interface17 method4315() {
	return new Class144(Class453.aClass453_4947, aClass9_2355);
    }
    
    public Interface17 method4316() {
	return new Class144(Class453.aClass453_4947, aClass9_2355);
    }
    
    public int method4317() {
	return (int) (aLong2354 * 4573397280263845675L);
    }
    
    public Class239 method4318(int i) {
	if (anArrayList2359.isEmpty())
	    return Class239.aClass239_2410;
	Class239 class239
	    = ((Class218) anArrayList2359.get(0)).method4159(1880019316);
	switch (1635395023 * class239.anInt2409) {
	default: {
	    Iterator iterator = anArrayList2359.iterator();
	    while (iterator.hasNext()) {
		Class218 class218 = (Class218) iterator.next();
		if (class218.method4159(-952777629) == Class239.aClass239_2410)
		    return Class239.aClass239_2410;
	    }
	    return Class239.aClass239_2406;
	}
	case 0:
	case 3:
	    return class239;
	}
    }
    
    void method4319(Class230 class230) {
	anArrayList2357.add(class230);
    }
    
    public List method4320() {
	return Collections.unmodifiableList(anArrayList2359);
    }
    
    void method4321(Class218 class218) {
	anArrayList2359.add(class218);
	method4272((byte) -93);
    }
    
    void method4322(int i) {
	anArrayList2359.remove(i);
	method4272((byte) -47);
    }
    
    public long method4323() {
	return aLong2351 * 6301367537106280645L;
    }
    
    void method4324(int i, int i_28_, byte i_29_) {
	((Class218) anArrayList2359.get(i)).method4155(i_28_, 1081041056);
    }
    
    public int method4325(int i) {
	return anInt2350 * -597434613;
    }
    
    void method4326(Class230 class230) {
	anArrayList2357.add(class230);
    }
    
    void method4327(int i) {
	anArrayList2357.remove(i);
    }
    
    void method4328(int i) {
	anArrayList2357.remove(i);
    }
    
    public Class228(long l, RSBuffer class525_sub38, boolean bool,
					Interface27 interface27) {
	aLong2354 = l * -2741712219320103037L;
	int i = class525_sub38.readUnsignedByte(525730095);
	if (i == 1) {
	    int i_30_ = class525_sub38.readUnsignedByte(2025134846);
	    aBool2353 = 0 != (i_30_ & 0x1);
	    aBool2358 = 0 != (i_30_ & 0x2);
	    aBool2361 = (i_30_ & 0x4) != 0;
	    anInt2356 = class525_sub38.readInt(1894353528) * 312446635;
	    aLong2351 = (class525_sub38.method16603(-604965432)
			 * -7481414921824854515L);
	    aString2352 = class525_sub38.readString((byte) 29);
	    anInt2350 = class525_sub38.method16625((byte) -46) * 956855459;
	    class525_sub38.readInt(1496075167);
	    class525_sub38.method16603(-277704284);
	    int i_31_ = class525_sub38.readUnsignedShort((byte) 41);
	    anArrayList2359 = new ArrayList(i_31_);
	    for (int i_32_ = 0; i_32_ < i_31_; i_32_++)
		anArrayList2359.add(new Class218(class525_sub38, aBool2358,
						 aBool2361, interface27));
	    int i_33_ = class525_sub38.readUnsignedShort((byte) 66);
	    anArrayList2357 = new ArrayList(i_33_);
	    for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
		anArrayList2357.add(new Class230(class525_sub38, aBool2358,
						 aBool2361));
	    aClass9_2355 = new Class9(interface27.method145(-1220657054));
	    int i_35_ = class525_sub38.readUnsignedShort((byte) 15);
	    for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
		Class447 class447
		    = interface27.method145(1480430572)
			  .method14515(class525_sub38, (byte) -1);
		aClass9_2355.method18(class447.anInt4898 * -316828413,
				      class447.anObject4899, (byte) 1);
	    }
	    if (!bool) {
		class525_sub38.readUnsignedShort((byte) 5);
		class525_sub38.readUnsignedShort((byte) 121);
		class525_sub38.readUnsignedShort((byte) 27);
		class525_sub38.readUnsignedShort((byte) 14);
		class525_sub38.readUnsignedShort((byte) 101);
	    }
	    method4272((byte) -81);
	}
    }
    
    void method4329(int i, int i_37_) {
	((Class218) anArrayList2359.get(i)).method4165(i_37_, 340047818);
	method4272((byte) -29);
    }
    
    void method4330(int i, int i_38_) {
	Class218 class218 = (Class218) anArrayList2359.get(i);
	class218.method4156(i_38_, -178361350);
	class218.method4158(true, 808848415);
    }
    
    void method4331(int i, int i_39_) {
	Class218 class218 = (Class218) anArrayList2359.get(i);
	class218.method4156(i_39_, -1128091981);
	class218.method4158(true, 808848415);
    }
    
    public List method4332(byte i) {
	return Collections.unmodifiableList(anArrayList2357);
    }
    
    public Interface17 method4333() {
	return new Class144(Class453.aClass453_4947, aClass9_2355);
    }
    
    void method4334(int i, boolean bool) {
	Class218 class218 = (Class218) anArrayList2359.get(i);
	class218.method4160((bool ? Class239.aClass239_2406
			     : Class239.aClass239_2410),
			    1150631174);
    }
    
    void method4335(int i, boolean bool) {
	Class218 class218 = (Class218) anArrayList2359.get(i);
	class218.method4160((bool ? Class239.aClass239_2406
			     : Class239.aClass239_2410),
			    -1083538568);
    }
    
    void method4336(int i, int i_40_) {
	((Class218) anArrayList2359.get(i)).method4155(i_40_, 1081041056);
    }
    
    void method4337(int i, int i_41_) {
	((Class218) anArrayList2359.get(i)).method4155(i_41_, 1081041056);
    }
    
    void method4338(int i, int i_42_) {
	((Class218) anArrayList2359.get(i)).method4155(i_42_, 1081041056);
    }
    
    void method4339(int i, int i_43_) {
	((Class218) anArrayList2359.get(i)).method4155(i_43_, 1081041056);
    }
    
    void method4340(int i) {
	Class218 class218 = (Class218) anArrayList2359.get(i);
	class218.method4158(false, 808848415);
    }
    
    void method4341(int i, int i_44_) {
	((Class218) anArrayList2359.get(i)).method4155(i_44_, 1081041056);
    }
    
    void method4342(Class230 class230) {
	anArrayList2357.add(class230);
    }
    
    void method4343() {
	Iterator iterator = anArrayList2359.iterator();
	while (iterator.hasNext()) {
	    Class218 class218 = (Class218) iterator.next();
	    class218.method4160(Class239.aClass239_2407, 1378595343);
	}
    }
    
    public List method4344() {
	return Collections.unmodifiableList(anArrayList2359);
    }
    
    public int method4345() {
	return anInt2350 * -597434613;
    }
    
    void method4346(int i, Class218 class218) {
	Class218 class218_45_ = (Class218) anArrayList2359.get(i);
	class218_45_.method4166(class218, 1796234120);
    }
    
    public Interface17 method4347(int i) {
	return new Class144(Class453.aClass453_4947, aClass9_2355);
    }
    
    public static int method4348(int i, int i_46_) {
	Class270 class270
	    = (Class270) Class281.aMap3005.get(Integer.valueOf(i));
	if (null == class270)
	    return 0;
	return class270.method5005(-1517427099);
    }
    
    static void method4349(Class683 class683, int i) {
	int i_47_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	TwitchWebcamDevice twitchwebcamdevice
	    = Class541.method8901(i_47_, 1829996124);
	if (twitchwebcamdevice == null) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1577362963 * twitchwebcamdevice.anInt1150;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= twitchwebcamdevice.aString1148;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= twitchwebcamdevice.aString1149;
	}
    }
    
    static final void method4350(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class668.method11029(class259, class245, class683, -356734248);
    }
    
    static final void method4351(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_48_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_49_
	    = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	int i_50_
	    = class683.anIntArray8661[2 + class683.anInt8662 * 501271953];
	Class40_Sub20.aClass217_11050.method4035(i_48_, i_49_, i_50_,
						 (byte) 100);
    }
    
    static final void method4352(Class683 class683, int i)
	throws Exception_Sub7 {
	class683.anInt8662 -= 362986067;
	int i_51_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_52_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_53_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 2];
	float f = (float) (2.0 * Math.atan((double) ((float) i_51_ / 2.0F
						     / (float) i_53_)));
	float f_54_ = (float) (2.0 * Math.atan((double) ((float) i_52_ / 2.0F
							 / (float) i_53_)));
	Class453_Sub3.aClass309_Sub1_10316.method5509(f, f_54_, -1440770652);
    }
    
    public static void method4353(int i) {
	if (Class661.aClass372_8473 != null) {
	    Class661.aClass372_8473.method6340(437537262);
	    Class661.aClass372_8473 = null;
	}
    }
    
    static void method4354(byte i) {
	client.aClass96_11361.method1802((short) 15235);
	if (-903386307 * Class25.anInt240 < 2) {
	    Class15.aClass1_177.method510(43328821);
	    Class25.anInt244 = 0;
	    Class25.anInt240 += -1555435;
	    Class25.aClass43_241 = Class43.aClass43_343;
	} else {
	    Class25.aClass43_241 = null;
	    Class25.aClass688_242 = Class688.aClass688_8713;
	    Class441.method7119(1, -623806638);
	}
    }
}
