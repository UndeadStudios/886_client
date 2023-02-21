/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public abstract class Class309
{
    Class350 aClass350_3427;
    Class446 aClass446_3428;
    float aFloat3429;
    Class298 aClass298_3430;
    Class704 aClass704_3431;
    Class289 aClass289_3432;
    float aFloat3433;
    Interface30 anInterface30_3434;
    static final int anInt3435 = 50;
    float aFloat3436;
    Class294 aClass294_3437;
    Class446 aClass446_3438 = new Class446();
    Class446 aClass446_3439 = new Class446();
    public static final float aFloat3440 = Float.POSITIVE_INFINITY;
    Class446 aClass446_3441 = new Class446();
    Class446 aClass446_3442 = new Class446();
    Class311 aClass311_3443;
    float aFloat3444 = 10.0F;
    static final int anInt3445 = 10000;
    float aFloat3446 = 5120.0F;
    int anInt3447;
    float aFloat3448;
    float aFloat3449 = 1.0F;
    Class446 aClass446_3450;
    float aFloat3451;
    float aFloat3452;
    float aFloat3453;
    float aFloat3454;
    Class302 aClass302_3455;
    boolean aBool3456;
    float aFloat3457;
    float aFloat3458;
    Class304 aClass304_3459;
    boolean aBool3460;
    int anInt3461;
    float aFloat3462;
    Class10 aClass10_3463;
    public static int anInt3464;
    public static Class144_Sub1 aClass144_Sub1_3465;
    
    public Class446 method5451(int i) {
	return aClass446_3442;
    }
    
    public void method5452(boolean bool, int i) {
	aClass311_3443 = Class311.aClass311_3470;
	aClass298_3430 = null;
	aClass704_3431 = null;
	aClass289_3432 = null;
	aClass350_3427 = null;
	if (Class304.aClass304_3407 == aClass304_3459 || !bool)
	    aClass294_3437 = Class294.aClass294_3242;
	else
	    aClass294_3437 = Class294.aClass294_3240;
	aClass302_3455 = Class302.aClass302_3376;
	aClass446_3438.method7265(100.0F, 100.0F, 100.0F);
	aClass446_3439.method7265(100.0F, 100.0F, 100.0F);
	aFloat3433 = 0.05F;
	aClass446_3441.method7265(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass446_3442.method7265(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass446_3428.method7265(1.0F, 1.0F, 1.0F);
	aClass446_3450.method7265(1.0F, 1.0F, 1.0F);
	aFloat3451 = 1.1F;
	aFloat3452 = 1.1F;
	aFloat3453 = 50.0F;
	aFloat3436 = 10000.0F;
	aFloat3458 = 1.5707964F;
	aFloat3457 = 1.5707964F;
	anInt3447 = -266121843;
	aBool3456 = true;
	aBool3460 = true;
	anInt3461 = 0;
	aFloat3462 = 1.0F;
	aClass10_3463.method688((short) 29617);
    }
    
    public void method5453(float f, int[][][] is, Class475 class475, int i,
			   int i_0_, int i_1_) {
	if (aClass704_3431 != null)
	    aClass704_3431.method14280(f, -1989149267);
	if (aClass350_3427 != null)
	    aClass350_3427.method6129(f, is, class475, i, i_0_, -1432049601);
	Iterator iterator = aClass10_3463.iterator();
	while (iterator.hasNext()) {
	    Class525_Sub16_Sub9 class525_sub16_sub9
		= (Class525_Sub16_Sub9) iterator.next();
	    class525_sub16_sub9.method18302(f, -1301146407);
	}
    }
    
    public void method5454(boolean bool, float f, Class446 class446,
			   Class429 class429, Class446 class446_2_,
			   Class446 class446_3_, byte i) {
	if (aClass302_3455 == Class302.aClass302_3379)
	    Class565.method9466(f, class446, class446_2_, class446_3_,
				bool ? aClass446_3442 : aClass446_3441,
				bool ? aClass446_3439 : aClass446_3438,
				(float) (anInt3461 * 2088152901), aFloat3462,
				aFloat3454, aFloat3429, (byte) -81);
	else if (Class302.aClass302_3376 == aClass302_3455)
	    Class474.method7755(f, class446, class429, class446_2_,
				class446_3_,
				bool ? aClass446_3442 : aClass446_3441,
				bool ? aClass446_3439 : aClass446_3438,
				(float) (2088152901 * anInt3461), aFloat3462,
				aFloat3454, aFloat3429, -844745301);
	else if (aClass302_3455 == Class302.aClass302_3378)
	    Class427.method6785(f, class446, class429, class446_2_,
				class446_3_,
				bool ? aClass446_3450 : aClass446_3428,
				bool ? aFloat3452 : aFloat3451, aFloat3454,
				aFloat3448, 1749739754);
    }
    
    public boolean method5455() {
	return aBool3460;
    }
    
    public Class446 method5456() {
	return aClass446_3438;
    }
    
    Class309(Class304 class304, Interface30 interface30) {
	aFloat3444 = 10.0F;
	aFloat3449 = 1.0F;
	aFloat3454 = 5120.0F;
	aFloat3429 = 10.0F;
	aFloat3448 = 1.0F;
	aClass446_3428 = new Class446();
	aClass446_3450 = new Class446();
	anInt3461 = 0;
	aFloat3462 = 1.0F;
	aClass10_3463 = new Class10(8);
	aClass304_3459 = class304;
	anInterface30_3434 = interface30;
	method5452(true, -820053451);
    }
    
    boolean method5457(byte i) {
	if (aClass304_3459 == Class304.aClass304_3407
	    && aClass294_3437 == Class294.aClass294_3242)
	    return true;
	if (aClass304_3459 == Class304.aClass304_3408
	    && aClass294_3437 == Class294.aClass294_3240)
	    return true;
	return false;
    }
    
    public void method5458(boolean bool, boolean bool_4_, int i)
	throws Exception_Sub7 {
	if (!method5457((byte) 51))
	    throw new Exception_Sub7();
	aBool3456 = bool;
	aBool3460 = bool_4_;
    }
    
    public void method5459(float f, int i) throws Exception_Sub7 {
	if (!method5457((byte) 78))
	    throw new Exception_Sub7();
	aFloat3433 = f;
    }
    
    public void method5460(Class302 class302, int i) throws Exception_Sub7 {
	if (!method5457((byte) 29))
	    throw new Exception_Sub7();
	aClass302_3455 = class302;
    }
    
    public void method5461(int i, float f, int i_5_) throws Exception_Sub7 {
	if (!method5457((byte) 56) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	anInt3461 = 1804307341 * i;
	aFloat3462 = f;
    }
    
    public float method5462() {
	return aFloat3433;
    }
    
    public void method5463(float f, float f_6_, float f_7_, int i)
	throws Exception_Sub7 {
	if (!method5457((byte) 17))
	    throw new Exception_Sub7();
	aFloat3454 = f;
	aFloat3429 = f_6_;
	aFloat3448 = f_7_;
    }
    
    public void method5464(Class446 class446) throws Exception_Sub7 {
	if (!method5457((byte) 66) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3442.method7216(class446);
    }
    
    public void method5465(Class446 class446, int i) throws Exception_Sub7 {
	if (!method5457((byte) 48) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3438.method7216(class446);
    }
    
    public float method5466() {
	Class446 class446 = method5486(833929440);
	Class446 class446_8_ = method5488(-1890840134);
	float f = 0.0F;
	if (null != class446 && class446_8_ != null) {
	    Class446 class446_9_ = Class446.method7225(class446, class446_8_);
	    class446_9_.aFloat4896 = 0.0F;
	    f = (float) Math.atan2((double) class446_9_.aFloat4895,
				   (double) class446_9_.aFloat4897);
	    class446.method7260();
	    class446_8_.method7260();
	}
	return (float) (3.141592653589793 - (double) f);
    }
    
    public void method5467(Class446 class446, float f, byte i)
	throws Exception_Sub7 {
	if (!method5457((byte) 84) || aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3428.method7216(class446);
	aClass446_3450.method7216(class446);
	aFloat3451 = f;
	aFloat3452 = f;
    }
    
    public void method5468(Class446 class446, float f, int i)
	throws Exception_Sub7 {
	if (!method5457((byte) 78) || aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3428.method7216(class446);
	aFloat3451 = f;
    }
    
    public void method5469(Class446 class446, float f, int i)
	throws Exception_Sub7 {
	if (!method5457((byte) 41) || aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3450.method7216(class446);
	aFloat3452 = f;
    }
    
    public void method5470(Class525_Sub16_Sub9 class525_sub16_sub9) {
	aClass10_3463.method695(class525_sub16_sub9,
				(long) (1940820665
					* class525_sub16_sub9.anInt11794));
    }
    
    public void method5471(Class291 class291, Class444 class444,
			   Class435 class435, int i, int i_10_) {
	if (method5505((byte) 0)) {
	    aClass704_3431.method14279(class291, class444, i, i_10_,
				       aClass350_3427.method6134(-1609400892),
				       -454639953);
	    aClass350_3427.method6135(class291, i, i_10_, -1044670105);
	    if (Class311.aClass311_3470 == aClass311_3443)
		class435.method6964(aFloat3453, aFloat3436, aFloat3457,
				    aFloat3458);
	    else
		class435.method6961(aFloat3453, aFloat3436,
				    (float) (anInt3447 * -528043431));
	    Iterator iterator = aClass10_3463.iterator();
	    while (iterator.hasNext()) {
		Class525_Sub16_Sub9 class525_sub16_sub9
		    = (Class525_Sub16_Sub9) iterator.next();
		class525_sub16_sub9.method18303(class291, class444, class435,
						936798607);
	    }
	}
    }
    
    public void method5472(Class446 class446, float f) throws Exception_Sub7 {
	if (!method5457((byte) 83) || aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3428.method7216(class446);
	aFloat3451 = f;
    }
    
    public void method5473(byte i) throws Exception_Sub7 {
	if (!method5457((byte) 39))
	    throw new Exception_Sub7();
	aFloat3454 = 5120.0F;
	aFloat3429 = 10.0F;
	aFloat3448 = 1.0F;
    }
    
    public void method5474(Class294 class294) {
	aClass294_3437 = class294;
    }
    
    public boolean method5475() {
	if (null == aClass704_3431 || aClass350_3427 == null)
	    return false;
	if (!aClass704_3431.method14286(-1406544941))
	    return false;
	if (!aClass350_3427.method6130(-1743903684))
	    return false;
	return true;
    }
    
    public Class525_Sub16_Sub9 method5476(int i, int i_11_) {
	return (Class525_Sub16_Sub9) aClass10_3463.method684((long) i);
    }
    
    public Class350 method5477() {
	return aClass350_3427;
    }
    
    public void method5478(Class446 class446) throws Exception_Sub7 {
	if (!method5457((byte) 40) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3439.method7216(class446);
    }
    
    public void method5479(Class291 class291, Class444 class444,
			   Class435 class435, int i, int i_12_, int i_13_) {
	if (method5505((byte) 0)) {
	    aClass704_3431.method14279(class291, class444, i, i_12_,
				       aClass350_3427.method6134(945544928),
				       -1501847435);
	    aClass350_3427.method6135(class291, i, i_12_, 1671274272);
	    if (Class311.aClass311_3470 == aClass311_3443)
		class435.method6964(aFloat3453, aFloat3436, aFloat3457,
				    aFloat3458);
	    else
		class435.method6961(aFloat3453, aFloat3436,
				    (float) (anInt3447 * -528043431));
	    Iterator iterator = aClass10_3463.iterator();
	    while (iterator.hasNext()) {
		Class525_Sub16_Sub9 class525_sub16_sub9
		    = (Class525_Sub16_Sub9) iterator.next();
		class525_sub16_sub9.method18303(class291, class444, class435,
						893613334);
	    }
	}
    }
    
    public Class294 method5480(int i) {
	return aClass294_3437;
    }
    
    public Class350 method5481(int i) {
	return aClass350_3427;
    }
    
    public Class704 method5482(int i) {
	return aClass704_3431;
    }
    
    public Interface30 method5483(int i) {
	return anInterface30_3434;
    }
    
    public Class298 method5484(int i) {
	return aClass298_3430;
    }
    
    public Class289 method5485(int i) {
	return aClass289_3432;
    }
    
    public Class446 method5486(int i) {
	if (null == aClass350_3427 || !aClass350_3427.method6130(100105562))
	    return null;
	return aClass350_3427.method6131(-1277924072);
    }
    
    public double[] method5487(int i) {
	if (null == aClass350_3427 || !aClass350_3427.method6130(321237116))
	    return null;
	return aClass350_3427.method6132(619996392);
    }
    
    public Class446 method5488(int i) {
	if (aClass704_3431 == null || !aClass704_3431.method14286(-1877881482))
	    return null;
	return aClass704_3431.method14281((byte) -20);
    }
    
    public Class525_Sub28 method5489(int i) {
	if (null == aClass350_3427 || !aClass350_3427.method6130(-1867209364))
	    return null;
	return aClass350_3427.method6133((byte) 107);
    }
    
    public float method5490(int i) {
	Class446 class446 = method5486(-536146536);
	Class446 class446_14_ = method5488(-2144006996);
	float f = 0.0F;
	if (class446 != null && null != class446_14_) {
	    Class446 class446_15_
		= Class446.method7225(class446_14_, class446);
	    float f_16_
		= (float) Math.sqrt((double) ((class446_15_.aFloat4897
					       * class446_15_.aFloat4897)
					      + (class446_15_.aFloat4895
						 * class446_15_.aFloat4895)));
	    f = (float) Math.atan2((double) -class446_15_.aFloat4896,
				   (double) f_16_);
	    class446.method7260();
	    class446_14_.method7260();
	}
	return f;
    }
    
    public float method5491(byte i) {
	Class446 class446 = method5486(-1190870339);
	Class446 class446_17_ = method5488(-2011082461);
	float f = 0.0F;
	if (null != class446 && class446_17_ != null) {
	    Class446 class446_18_
		= Class446.method7225(class446, class446_17_);
	    class446_18_.aFloat4896 = 0.0F;
	    f = (float) Math.atan2((double) class446_18_.aFloat4895,
				   (double) class446_18_.aFloat4897);
	    class446.method7260();
	    class446_17_.method7260();
	}
	return (float) (3.141592653589793 - (double) f);
    }
    
    float method5492(int i) {
	return 0.0F;
    }
    
    public Class429 method5493(int i) {
	Class429 class429 = Class429.method6864();
	class429.method6821(method5491((byte) 0), method5490(-655649440),
			    method5492(1992262818));
	return class429;
    }
    
    public Class446 method5494(byte i) {
	return aClass446_3441;
    }
    
    public void method5495(Class446 class446, int i) throws Exception_Sub7 {
	if (!method5457((byte) 103) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3441.method7216(class446);
    }
    
    public void method5496(Class446 class446, float f) throws Exception_Sub7 {
	if (!method5457((byte) 123) || aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3428.method7216(class446);
	aClass446_3450.method7216(class446);
	aFloat3451 = f;
	aFloat3452 = f;
    }
    
    public Class446 method5497(byte i) {
	return aClass446_3438;
    }
    
    public Class446 method5498(int i) {
	return aClass446_3439;
    }
    
    public float method5499(int i) {
	return aFloat3453;
    }
    
    public float method5500(byte i) {
	return aFloat3436;
    }
    
    public float method5501(byte i) {
	return aFloat3457;
    }
    
    public boolean method5502(int i) {
	return aBool3456;
    }
    
    public Class446 method5503() {
	return aClass446_3441;
    }
    
    public void method5504(boolean bool) {
	aClass311_3443 = Class311.aClass311_3470;
	aClass298_3430 = null;
	aClass704_3431 = null;
	aClass289_3432 = null;
	aClass350_3427 = null;
	if (Class304.aClass304_3407 == aClass304_3459 || !bool)
	    aClass294_3437 = Class294.aClass294_3242;
	else
	    aClass294_3437 = Class294.aClass294_3240;
	aClass302_3455 = Class302.aClass302_3376;
	aClass446_3438.method7265(100.0F, 100.0F, 100.0F);
	aClass446_3439.method7265(100.0F, 100.0F, 100.0F);
	aFloat3433 = 0.05F;
	aClass446_3441.method7265(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass446_3442.method7265(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass446_3428.method7265(1.0F, 1.0F, 1.0F);
	aClass446_3450.method7265(1.0F, 1.0F, 1.0F);
	aFloat3451 = 1.1F;
	aFloat3452 = 1.1F;
	aFloat3453 = 50.0F;
	aFloat3436 = 10000.0F;
	aFloat3458 = 1.5707964F;
	aFloat3457 = 1.5707964F;
	anInt3447 = -266121843;
	aBool3456 = true;
	aBool3460 = true;
	anInt3461 = 0;
	aFloat3462 = 1.0F;
	aClass10_3463.method688((short) 17430);
    }
    
    public boolean method5505(byte i) {
	if (null == aClass704_3431 || aClass350_3427 == null)
	    return false;
	if (!aClass704_3431.method14286(-1175312852))
	    return false;
	if (!aClass350_3427.method6130(-1880472236))
	    return false;
	return true;
    }
    
    public Class446 method5506() {
	if (null == aClass350_3427 || !aClass350_3427.method6130(-1338094162))
	    return null;
	return aClass350_3427.method6131(-695655126);
    }
    
    public void method5507(float f, int[][][] is, Class475 class475, int i,
			   int i_19_) {
	if (aClass704_3431 != null)
	    aClass704_3431.method14280(f, -1989149267);
	if (aClass350_3427 != null)
	    aClass350_3427.method6129(f, is, class475, i, i_19_, -329141235);
	Iterator iterator = aClass10_3463.iterator();
	while (iterator.hasNext()) {
	    Class525_Sub16_Sub9 class525_sub16_sub9
		= (Class525_Sub16_Sub9) iterator.next();
	    class525_sub16_sub9.method18302(f, 1467829031);
	}
    }
    
    public void method5508(float f, int[][][] is, Class475 class475, int i,
			   int i_20_) {
	if (aClass704_3431 != null)
	    aClass704_3431.method14280(f, -1989149267);
	if (aClass350_3427 != null)
	    aClass350_3427.method6129(f, is, class475, i, i_20_, 103273252);
	Iterator iterator = aClass10_3463.iterator();
	while (iterator.hasNext()) {
	    Class525_Sub16_Sub9 class525_sub16_sub9
		= (Class525_Sub16_Sub9) iterator.next();
	    class525_sub16_sub9.method18302(f, -1222205269);
	}
    }
    
    public void method5509(float f, float f_21_, int i) throws Exception_Sub7 {
	if (!method5457((byte) 48))
	    throw new Exception_Sub7();
	aFloat3457 = f;
	aFloat3458 = f_21_;
    }
    
    public void method5510(boolean bool, float f, Class446 class446,
			   Class429 class429, Class446 class446_22_,
			   Class446 class446_23_) {
	if (aClass302_3455 == Class302.aClass302_3379)
	    Class565.method9466(f, class446, class446_22_, class446_23_,
				bool ? aClass446_3442 : aClass446_3441,
				bool ? aClass446_3439 : aClass446_3438,
				(float) (anInt3461 * 2088152901), aFloat3462,
				aFloat3454, aFloat3429, (byte) -76);
	else if (Class302.aClass302_3376 == aClass302_3455)
	    Class474.method7755(f, class446, class429, class446_22_,
				class446_23_,
				bool ? aClass446_3442 : aClass446_3441,
				bool ? aClass446_3439 : aClass446_3438,
				(float) (2088152901 * anInt3461), aFloat3462,
				aFloat3454, aFloat3429, -217676898);
	else if (aClass302_3455 == Class302.aClass302_3378)
	    Class427.method6785(f, class446, class429, class446_22_,
				class446_23_,
				bool ? aClass446_3450 : aClass446_3428,
				bool ? aFloat3452 : aFloat3451, aFloat3454,
				aFloat3448, 1282248135);
    }
    
    public void method5511(boolean bool, float f, Class446 class446,
			   Class429 class429, Class446 class446_24_,
			   Class446 class446_25_) {
	if (aClass302_3455 == Class302.aClass302_3379)
	    Class565.method9466(f, class446, class446_24_, class446_25_,
				bool ? aClass446_3442 : aClass446_3441,
				bool ? aClass446_3439 : aClass446_3438,
				(float) (anInt3461 * 2088152901), aFloat3462,
				aFloat3454, aFloat3429, (byte) -78);
	else if (Class302.aClass302_3376 == aClass302_3455)
	    Class474.method7755(f, class446, class429, class446_24_,
				class446_25_,
				bool ? aClass446_3442 : aClass446_3441,
				bool ? aClass446_3439 : aClass446_3438,
				(float) (2088152901 * anInt3461), aFloat3462,
				aFloat3454, aFloat3429, 2145632609);
	else if (aClass302_3455 == Class302.aClass302_3378)
	    Class427.method6785(f, class446, class429, class446_24_,
				class446_25_,
				bool ? aClass446_3450 : aClass446_3428,
				bool ? aFloat3452 : aFloat3451, aFloat3454,
				aFloat3448, 1368418606);
    }
    
    public Class525_Sub16_Sub9 method5512(int i) {
	return (Class525_Sub16_Sub9) aClass10_3463.method684((long) i);
    }
    
    public void method5513(int i, float f) throws Exception_Sub7 {
	if (!method5457((byte) 15) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	anInt3461 = 1804307341 * i;
	aFloat3462 = f;
    }
    
    public void method5514(Class294 class294) {
	aClass294_3437 = class294;
    }
    
    public Class704 method5515(Class298 class298, boolean bool)
	throws Exception_Sub7 {
	if (aClass294_3437 == Class294.aClass294_3242 && !bool)
	    throw new Exception_Sub7();
	aClass298_3430 = class298;
	if (class298 == Class298.aClass298_3278)
	    aClass704_3431 = new Class704_Sub3(this);
	else if (class298 == Class298.aClass298_3275)
	    aClass704_3431 = new Class704_Sub5(this);
	else if (Class298.aClass298_3276 == class298)
	    aClass704_3431 = new Class704_Sub1(this);
	else if (Class298.aClass298_3277 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub3(this);
	else if (Class298.aClass298_3279 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub1(this);
	else if (Class298.aClass298_3280 == class298)
	    aClass704_3431 = new Class704_Sub4(this);
	else if (Class298.aClass298_3281 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub2(this);
	return aClass704_3431;
    }
    
    public Class704 method5516(Class298 class298, boolean bool)
	throws Exception_Sub7 {
	if (aClass294_3437 == Class294.aClass294_3242 && !bool)
	    throw new Exception_Sub7();
	aClass298_3430 = class298;
	if (class298 == Class298.aClass298_3278)
	    aClass704_3431 = new Class704_Sub3(this);
	else if (class298 == Class298.aClass298_3275)
	    aClass704_3431 = new Class704_Sub5(this);
	else if (Class298.aClass298_3276 == class298)
	    aClass704_3431 = new Class704_Sub1(this);
	else if (Class298.aClass298_3277 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub3(this);
	else if (Class298.aClass298_3279 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub1(this);
	else if (Class298.aClass298_3280 == class298)
	    aClass704_3431 = new Class704_Sub4(this);
	else if (Class298.aClass298_3281 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub2(this);
	return aClass704_3431;
    }
    
    public Class704 method5517(Class298 class298, boolean bool)
	throws Exception_Sub7 {
	if (aClass294_3437 == Class294.aClass294_3242 && !bool)
	    throw new Exception_Sub7();
	aClass298_3430 = class298;
	if (class298 == Class298.aClass298_3278)
	    aClass704_3431 = new Class704_Sub3(this);
	else if (class298 == Class298.aClass298_3275)
	    aClass704_3431 = new Class704_Sub5(this);
	else if (Class298.aClass298_3276 == class298)
	    aClass704_3431 = new Class704_Sub1(this);
	else if (Class298.aClass298_3277 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub3(this);
	else if (Class298.aClass298_3279 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub1(this);
	else if (Class298.aClass298_3280 == class298)
	    aClass704_3431 = new Class704_Sub4(this);
	else if (Class298.aClass298_3281 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub2(this);
	return aClass704_3431;
    }
    
    public Class704 method5518(Class298 class298, boolean bool)
	throws Exception_Sub7 {
	if (aClass294_3437 == Class294.aClass294_3242 && !bool)
	    throw new Exception_Sub7();
	aClass298_3430 = class298;
	if (class298 == Class298.aClass298_3278)
	    aClass704_3431 = new Class704_Sub3(this);
	else if (class298 == Class298.aClass298_3275)
	    aClass704_3431 = new Class704_Sub5(this);
	else if (Class298.aClass298_3276 == class298)
	    aClass704_3431 = new Class704_Sub1(this);
	else if (Class298.aClass298_3277 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub3(this);
	else if (Class298.aClass298_3279 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub1(this);
	else if (Class298.aClass298_3280 == class298)
	    aClass704_3431 = new Class704_Sub4(this);
	else if (Class298.aClass298_3281 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub2(this);
	return aClass704_3431;
    }
    
    public Class704 method5519(Class298 class298, boolean bool)
	throws Exception_Sub7 {
	if (aClass294_3437 == Class294.aClass294_3242 && !bool)
	    throw new Exception_Sub7();
	aClass298_3430 = class298;
	if (class298 == Class298.aClass298_3278)
	    aClass704_3431 = new Class704_Sub3(this);
	else if (class298 == Class298.aClass298_3275)
	    aClass704_3431 = new Class704_Sub5(this);
	else if (Class298.aClass298_3276 == class298)
	    aClass704_3431 = new Class704_Sub1(this);
	else if (Class298.aClass298_3277 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub3(this);
	else if (Class298.aClass298_3279 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub1(this);
	else if (Class298.aClass298_3280 == class298)
	    aClass704_3431 = new Class704_Sub4(this);
	else if (Class298.aClass298_3281 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub2(this);
	return aClass704_3431;
    }
    
    public boolean method5520(int i) {
	return aBool3460;
    }
    
    public Class350 method5521(Class289 class289, boolean bool)
	throws Exception_Sub7 {
	if (aClass294_3437 == Class294.aClass294_3242 && !bool)
	    throw new Exception_Sub7();
	aClass289_3432 = class289;
	if (class289 == Class289.aClass289_3202)
	    aClass350_3427 = new Class350_Sub1(this);
	else if (Class289.aClass289_3204 == class289)
	    aClass350_3427 = new Class350_Sub3(this);
	else if (Class289.aClass289_3203 == class289)
	    aClass350_3427 = new Class350_Sub2_Sub2(this);
	else if (Class289.aClass289_3205 == class289)
	    aClass350_3427 = new Class350_Sub2_Sub1(this);
	else if (class289 == Class289.aClass289_3206)
	    aClass350_3427 = new Class350_Sub2_Sub3(this);
	return aClass350_3427;
    }
    
    public Class350 method5522(Class289 class289, boolean bool)
	throws Exception_Sub7 {
	if (aClass294_3437 == Class294.aClass294_3242 && !bool)
	    throw new Exception_Sub7();
	aClass289_3432 = class289;
	if (class289 == Class289.aClass289_3202)
	    aClass350_3427 = new Class350_Sub1(this);
	else if (Class289.aClass289_3204 == class289)
	    aClass350_3427 = new Class350_Sub3(this);
	else if (Class289.aClass289_3203 == class289)
	    aClass350_3427 = new Class350_Sub2_Sub2(this);
	else if (Class289.aClass289_3205 == class289)
	    aClass350_3427 = new Class350_Sub2_Sub1(this);
	else if (class289 == Class289.aClass289_3206)
	    aClass350_3427 = new Class350_Sub2_Sub3(this);
	return aClass350_3427;
    }
    
    public void method5523(float f) throws Exception_Sub7 {
	if (!method5457((byte) 57))
	    throw new Exception_Sub7();
    }
    
    boolean method5524() {
	if (aClass304_3459 == Class304.aClass304_3407
	    && aClass294_3437 == Class294.aClass294_3242)
	    return true;
	if (aClass304_3459 == Class304.aClass304_3408
	    && aClass294_3437 == Class294.aClass294_3240)
	    return true;
	return false;
    }
    
    public void method5525(Class294 class294) {
	aClass294_3437 = class294;
    }
    
    public void method5526(float f) throws Exception_Sub7 {
	if (!method5457((byte) 57))
	    throw new Exception_Sub7();
    }
    
    public void method5527(float f) throws Exception_Sub7 {
	if (!method5457((byte) 81))
	    throw new Exception_Sub7();
    }
    
    public void method5528(byte i) {
	aClass10_3463.method688((short) 6132);
    }
    
    public void method5529(float f) throws Exception_Sub7 {
	if (!method5457((byte) 33))
	    throw new Exception_Sub7();
	aFloat3433 = f;
    }
    
    public void method5530(int i, int i_26_) {
	Class525_Sub16_Sub9 class525_sub16_sub9
	    = (Class525_Sub16_Sub9) aClass10_3463.method684((long) i);
	if (null != class525_sub16_sub9)
	    class525_sub16_sub9.method8755(-1933461091);
    }
    
    public void method5531(float f) throws Exception_Sub7 {
	if (!method5457((byte) 1))
	    throw new Exception_Sub7();
	aFloat3433 = f;
    }
    
    public void method5532(Class302 class302) throws Exception_Sub7 {
	if (!method5457((byte) 51))
	    throw new Exception_Sub7();
	aClass302_3455 = class302;
    }
    
    public void method5533(float f, float f_27_) throws Exception_Sub7 {
	if (!method5457((byte) 112))
	    throw new Exception_Sub7();
	aFloat3457 = f;
	aFloat3458 = f_27_;
    }
    
    public void method5534(Class302 class302) throws Exception_Sub7 {
	if (!method5457((byte) 77))
	    throw new Exception_Sub7();
	aClass302_3455 = class302;
    }
    
    public void method5535(Class302 class302) throws Exception_Sub7 {
	if (!method5457((byte) 110))
	    throw new Exception_Sub7();
	aClass302_3455 = class302;
    }
    
    public void method5536(Class446 class446) throws Exception_Sub7 {
	if (!method5457((byte) 87) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3441.method7216(class446);
    }
    
    public void method5537(Class446 class446) throws Exception_Sub7 {
	if (!method5457((byte) 121) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3441.method7216(class446);
    }
    
    public void method5538(Class446 class446) throws Exception_Sub7 {
	if (!method5457((byte) 88) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3442.method7216(class446);
    }
    
    public void method5539(boolean bool, boolean bool_28_)
	throws Exception_Sub7 {
	if (!method5457((byte) 5))
	    throw new Exception_Sub7();
	aBool3456 = bool;
	aBool3460 = bool_28_;
    }
    
    public void method5540(Class446 class446) throws Exception_Sub7 {
	if (!method5457((byte) 38) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3442.method7216(class446);
    }
    
    public Interface30 method5541() {
	return anInterface30_3434;
    }
    
    public void method5542(float f, float f_29_, float f_30_)
	throws Exception_Sub7 {
	if (!method5457((byte) 28))
	    throw new Exception_Sub7();
	aFloat3454 = f;
	aFloat3429 = f_29_;
	aFloat3448 = f_30_;
    }
    
    public void method5543() throws Exception_Sub7 {
	if (!method5457((byte) 65))
	    throw new Exception_Sub7();
	aFloat3454 = 5120.0F;
	aFloat3429 = 10.0F;
	aFloat3448 = 1.0F;
    }
    
    public void method5544() throws Exception_Sub7 {
	if (!method5457((byte) 44))
	    throw new Exception_Sub7();
	aFloat3454 = 5120.0F;
	aFloat3429 = 10.0F;
	aFloat3448 = 1.0F;
    }
    
    public void method5545(float f) throws Exception_Sub7 {
	if (!method5457((byte) 59))
	    throw new Exception_Sub7();
    }
    
    public void method5546(Class446 class446) throws Exception_Sub7 {
	if (!method5457((byte) 37) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3439.method7216(class446);
    }
    
    public void method5547(Class446 class446) throws Exception_Sub7 {
	if (!method5457((byte) 19) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3439.method7216(class446);
    }
    
    public void method5548(float f, float f_31_) throws Exception_Sub7 {
	if (!method5457((byte) 79))
	    throw new Exception_Sub7();
	if (f < 1.0F)
	    f = 50.0F;
	if (f_31_ < 1.0F)
	    f_31_ = 10000.0F;
	if (f >= f_31_)
	    throw new Exception_Sub7();
	aFloat3453 = f;
	aFloat3436 = f_31_;
    }
    
    public void method5549(Class446 class446, float f) throws Exception_Sub7 {
	if (!method5457((byte) 111) || aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3428.method7216(class446);
	aClass446_3450.method7216(class446);
	aFloat3451 = f;
	aFloat3452 = f;
    }
    
    public void method5550(Class446 class446, float f) throws Exception_Sub7 {
	if (!method5457((byte) 83) || aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3428.method7216(class446);
	aClass446_3450.method7216(class446);
	aFloat3451 = f;
	aFloat3452 = f;
    }
    
    public void method5551(Class525_Sub16_Sub9 class525_sub16_sub9, int i) {
	aClass10_3463.method695(class525_sub16_sub9,
				(long) (1940820665
					* class525_sub16_sub9.anInt11794));
    }
    
    public Class350 method5552(Class289 class289, boolean bool, int i)
	throws Exception_Sub7 {
	if (aClass294_3437 == Class294.aClass294_3242 && !bool)
	    throw new Exception_Sub7();
	aClass289_3432 = class289;
	if (class289 == Class289.aClass289_3202)
	    aClass350_3427 = new Class350_Sub1(this);
	else if (Class289.aClass289_3204 == class289)
	    aClass350_3427 = new Class350_Sub3(this);
	else if (Class289.aClass289_3203 == class289)
	    aClass350_3427 = new Class350_Sub2_Sub2(this);
	else if (Class289.aClass289_3205 == class289)
	    aClass350_3427 = new Class350_Sub2_Sub1(this);
	else if (class289 == Class289.aClass289_3206)
	    aClass350_3427 = new Class350_Sub2_Sub3(this);
	return aClass350_3427;
    }
    
    public void method5553(float f, int i) throws Exception_Sub7 {
	if (!method5457((byte) 51))
	    throw new Exception_Sub7();
    }
    
    public void method5554(Class446 class446, float f) throws Exception_Sub7 {
	if (!method5457((byte) 28) || aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3450.method7216(class446);
	aFloat3452 = f;
    }
    
    public void method5555(float f, float f_32_) throws Exception_Sub7 {
	if (!method5457((byte) 79))
	    throw new Exception_Sub7();
	if (f < 1.0F)
	    f = 50.0F;
	if (f_32_ < 1.0F)
	    f_32_ = 10000.0F;
	if (f >= f_32_)
	    throw new Exception_Sub7();
	aFloat3453 = f;
	aFloat3436 = f_32_;
    }
    
    public Class298 method5556() {
	return aClass298_3430;
    }
    
    public void method5557(float f, float f_33_) throws Exception_Sub7 {
	if (!method5457((byte) 60))
	    throw new Exception_Sub7();
	aFloat3457 = f;
	aFloat3458 = f_33_;
    }
    
    public void method5558(float f) throws Exception_Sub7 {
	if (!method5457((byte) 12))
	    throw new Exception_Sub7();
	aFloat3433 = f;
    }
    
    public float method5559(int i) {
	return aFloat3433;
    }
    
    public void method5560(Class446 class446, int i) throws Exception_Sub7 {
	if (!method5457((byte) 50) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3442.method7216(class446);
    }
    
    public void method5561(boolean bool, boolean bool_34_)
	throws Exception_Sub7 {
	if (!method5457((byte) 101))
	    throw new Exception_Sub7();
	aBool3456 = bool;
	aBool3460 = bool_34_;
    }
    
    public Class446 method5562() {
	if (aClass704_3431 == null || !aClass704_3431.method14286(-315718796))
	    return null;
	return aClass704_3431.method14281((byte) -5);
    }
    
    public void method5563(int i, float f) throws Exception_Sub7 {
	if (!method5457((byte) 102) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	anInt3461 = 1804307341 * i;
	aFloat3462 = f;
    }
    
    public void method5564(Class446 class446) throws Exception_Sub7 {
	if (!method5457((byte) 63) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3438.method7216(class446);
    }
    
    public boolean method5565() {
	if (null == aClass704_3431 || aClass350_3427 == null)
	    return false;
	if (!aClass704_3431.method14286(-1895110431))
	    return false;
	if (!aClass350_3427.method6130(1702560702))
	    return false;
	return true;
    }
    
    public void method5566(int i, float f) throws Exception_Sub7 {
	if (!method5457((byte) 80) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	anInt3461 = 1804307341 * i;
	aFloat3462 = f;
    }
    
    public boolean method5567() {
	return aBool3460;
    }
    
    public void method5568(int i) {
	Class525_Sub16_Sub9 class525_sub16_sub9
	    = (Class525_Sub16_Sub9) aClass10_3463.method684((long) i);
	if (null != class525_sub16_sub9)
	    class525_sub16_sub9.method8755(-1933461091);
    }
    
    public Class298 method5569() {
	return aClass298_3430;
    }
    
    public void method5570(boolean bool) {
	aClass311_3443 = Class311.aClass311_3470;
	aClass298_3430 = null;
	aClass704_3431 = null;
	aClass289_3432 = null;
	aClass350_3427 = null;
	if (Class304.aClass304_3407 == aClass304_3459 || !bool)
	    aClass294_3437 = Class294.aClass294_3242;
	else
	    aClass294_3437 = Class294.aClass294_3240;
	aClass302_3455 = Class302.aClass302_3376;
	aClass446_3438.method7265(100.0F, 100.0F, 100.0F);
	aClass446_3439.method7265(100.0F, 100.0F, 100.0F);
	aFloat3433 = 0.05F;
	aClass446_3441.method7265(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass446_3442.method7265(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass446_3428.method7265(1.0F, 1.0F, 1.0F);
	aClass446_3450.method7265(1.0F, 1.0F, 1.0F);
	aFloat3451 = 1.1F;
	aFloat3452 = 1.1F;
	aFloat3453 = 50.0F;
	aFloat3436 = 10000.0F;
	aFloat3458 = 1.5707964F;
	aFloat3457 = 1.5707964F;
	anInt3447 = -266121843;
	aBool3456 = true;
	aBool3460 = true;
	anInt3461 = 0;
	aFloat3462 = 1.0F;
	aClass10_3463.method688((short) -10085);
    }
    
    public void method5571(float f, float f_35_, byte i)
	throws Exception_Sub7 {
	if (!method5457((byte) 37))
	    throw new Exception_Sub7();
	if (f < 1.0F)
	    f = 50.0F;
	if (f_35_ < 1.0F)
	    f_35_ = 10000.0F;
	if (f >= f_35_)
	    throw new Exception_Sub7();
	aFloat3453 = f;
	aFloat3436 = f_35_;
    }
    
    public void method5572(Class294 class294, int i) {
	aClass294_3437 = class294;
    }
    
    public boolean method5573() {
	if (null == aClass704_3431 || aClass350_3427 == null)
	    return false;
	if (!aClass704_3431.method14286(-700810902))
	    return false;
	if (!aClass350_3427.method6130(-209597791))
	    return false;
	return true;
    }
    
    public Class429 method5574() {
	Class429 class429 = Class429.method6864();
	class429.method6821(method5491((byte) 0), method5490(-308504950),
			    method5492(1992262818));
	return class429;
    }
    
    public Class350 method5575(Class289 class289, boolean bool)
	throws Exception_Sub7 {
	if (aClass294_3437 == Class294.aClass294_3242 && !bool)
	    throw new Exception_Sub7();
	aClass289_3432 = class289;
	if (class289 == Class289.aClass289_3202)
	    aClass350_3427 = new Class350_Sub1(this);
	else if (Class289.aClass289_3204 == class289)
	    aClass350_3427 = new Class350_Sub3(this);
	else if (Class289.aClass289_3203 == class289)
	    aClass350_3427 = new Class350_Sub2_Sub2(this);
	else if (Class289.aClass289_3205 == class289)
	    aClass350_3427 = new Class350_Sub2_Sub1(this);
	else if (class289 == Class289.aClass289_3206)
	    aClass350_3427 = new Class350_Sub2_Sub3(this);
	return aClass350_3427;
    }
    
    public boolean method5576() {
	if (null == aClass704_3431 || aClass350_3427 == null)
	    return false;
	if (!aClass704_3431.method14286(-360392857))
	    return false;
	if (!aClass350_3427.method6130(-1200156690))
	    return false;
	return true;
    }
    
    public void method5577(Class291 class291, Class444 class444,
			   Class435 class435, int i, int i_36_) {
	if (method5505((byte) 0)) {
	    aClass704_3431.method14279(class291, class444, i, i_36_,
				       aClass350_3427.method6134(-427251099),
				       -623574219);
	    aClass350_3427.method6135(class291, i, i_36_, 1151772526);
	    if (Class311.aClass311_3470 == aClass311_3443)
		class435.method6964(aFloat3453, aFloat3436, aFloat3457,
				    aFloat3458);
	    else
		class435.method6961(aFloat3453, aFloat3436,
				    (float) (anInt3447 * -528043431));
	    Iterator iterator = aClass10_3463.iterator();
	    while (iterator.hasNext()) {
		Class525_Sub16_Sub9 class525_sub16_sub9
		    = (Class525_Sub16_Sub9) iterator.next();
		class525_sub16_sub9.method18303(class291, class444, class435,
						1115887590);
	    }
	}
    }
    
    public Class704 method5578(Class298 class298, boolean bool, byte i)
	throws Exception_Sub7 {
	if (aClass294_3437 == Class294.aClass294_3242 && !bool)
	    throw new Exception_Sub7();
	aClass298_3430 = class298;
	if (class298 == Class298.aClass298_3278)
	    aClass704_3431 = new Class704_Sub3(this);
	else if (class298 == Class298.aClass298_3275)
	    aClass704_3431 = new Class704_Sub5(this);
	else if (Class298.aClass298_3276 == class298)
	    aClass704_3431 = new Class704_Sub1(this);
	else if (Class298.aClass298_3277 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub3(this);
	else if (Class298.aClass298_3279 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub1(this);
	else if (Class298.aClass298_3280 == class298)
	    aClass704_3431 = new Class704_Sub4(this);
	else if (Class298.aClass298_3281 == class298)
	    aClass704_3431 = new Class704_Sub2_Sub2(this);
	return aClass704_3431;
    }
    
    public void method5579(Class291 class291, Class444 class444,
			   Class435 class435, int i, int i_37_) {
	if (method5505((byte) 0)) {
	    aClass704_3431.method14279(class291, class444, i, i_37_,
				       aClass350_3427.method6134(442947346),
				       -1713159817);
	    aClass350_3427.method6135(class291, i, i_37_, 1489044472);
	    if (Class311.aClass311_3470 == aClass311_3443)
		class435.method6964(aFloat3453, aFloat3436, aFloat3457,
				    aFloat3458);
	    else
		class435.method6961(aFloat3453, aFloat3436,
				    (float) (anInt3447 * -528043431));
	    Iterator iterator = aClass10_3463.iterator();
	    while (iterator.hasNext()) {
		Class525_Sub16_Sub9 class525_sub16_sub9
		    = (Class525_Sub16_Sub9) iterator.next();
		class525_sub16_sub9.method18303(class291, class444, class435,
						646656895);
	    }
	}
    }
    
    public Class294 method5580() {
	return aClass294_3437;
    }
    
    public Class350 method5581() {
	return aClass350_3427;
    }
    
    public Class446 method5582() {
	return aClass446_3438;
    }
    
    public void method5583(Class446 class446, float f) throws Exception_Sub7 {
	if (!method5457((byte) 53) || aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3428.method7216(class446);
	aFloat3451 = f;
    }
    
    public Class704 method5584() {
	return aClass704_3431;
    }
    
    public Interface30 method5585() {
	return anInterface30_3434;
    }
    
    public Class525_Sub16_Sub9 method5586(int i) {
	return (Class525_Sub16_Sub9) aClass10_3463.method684((long) i);
    }
    
    public Interface30 method5587() {
	return anInterface30_3434;
    }
    
    public Interface30 method5588() {
	return anInterface30_3434;
    }
    
    public boolean method5589() {
	if (null == aClass704_3431 || aClass350_3427 == null)
	    return false;
	if (!aClass704_3431.method14286(-1916569549))
	    return false;
	if (!aClass350_3427.method6130(1227928962))
	    return false;
	return true;
    }
    
    float method5590() {
	return 0.0F;
    }
    
    public Class289 method5591() {
	return aClass289_3432;
    }
    
    public Class704 method5592() {
	return aClass704_3431;
    }
    
    public void method5593(int i, float f) throws Exception_Sub7 {
	if (!method5457((byte) 6) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	anInt3461 = 1804307341 * i;
	aFloat3462 = f;
    }
    
    public Class446 method5594() {
	if (aClass704_3431 == null || !aClass704_3431.method14286(-2015566462))
	    return null;
	return aClass704_3431.method14281((byte) -2);
    }
    
    public Class446 method5595() {
	if (aClass704_3431 == null || !aClass704_3431.method14286(-1600531288))
	    return null;
	return aClass704_3431.method14281((byte) -10);
    }
    
    public float method5596() {
	Class446 class446 = method5486(-915270475);
	Class446 class446_38_ = method5488(-1977019280);
	float f = 0.0F;
	if (class446 != null && null != class446_38_) {
	    Class446 class446_39_
		= Class446.method7225(class446_38_, class446);
	    float f_40_
		= (float) Math.sqrt((double) ((class446_39_.aFloat4897
					       * class446_39_.aFloat4897)
					      + (class446_39_.aFloat4895
						 * class446_39_.aFloat4895)));
	    f = (float) Math.atan2((double) -class446_39_.aFloat4896,
				   (double) f_40_);
	    class446.method7260();
	    class446_38_.method7260();
	}
	return f;
    }
    
    public void method5597(boolean bool, float f, Class446 class446,
			   Class429 class429, Class446 class446_41_,
			   Class446 class446_42_) {
	if (aClass302_3455 == Class302.aClass302_3379)
	    Class565.method9466(f, class446, class446_41_, class446_42_,
				bool ? aClass446_3442 : aClass446_3441,
				bool ? aClass446_3439 : aClass446_3438,
				(float) (anInt3461 * 2088152901), aFloat3462,
				aFloat3454, aFloat3429, (byte) -45);
	else if (Class302.aClass302_3376 == aClass302_3455)
	    Class474.method7755(f, class446, class429, class446_41_,
				class446_42_,
				bool ? aClass446_3442 : aClass446_3441,
				bool ? aClass446_3439 : aClass446_3438,
				(float) (2088152901 * anInt3461), aFloat3462,
				aFloat3454, aFloat3429, 41328003);
	else if (aClass302_3455 == Class302.aClass302_3378)
	    Class427.method6785(f, class446, class429, class446_41_,
				class446_42_,
				bool ? aClass446_3450 : aClass446_3428,
				bool ? aFloat3452 : aFloat3451, aFloat3454,
				aFloat3448, 412277166);
    }
    
    public void method5598(boolean bool) {
	aClass311_3443 = Class311.aClass311_3470;
	aClass298_3430 = null;
	aClass704_3431 = null;
	aClass289_3432 = null;
	aClass350_3427 = null;
	if (Class304.aClass304_3407 == aClass304_3459 || !bool)
	    aClass294_3437 = Class294.aClass294_3242;
	else
	    aClass294_3437 = Class294.aClass294_3240;
	aClass302_3455 = Class302.aClass302_3376;
	aClass446_3438.method7265(100.0F, 100.0F, 100.0F);
	aClass446_3439.method7265(100.0F, 100.0F, 100.0F);
	aFloat3433 = 0.05F;
	aClass446_3441.method7265(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass446_3442.method7265(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass446_3428.method7265(1.0F, 1.0F, 1.0F);
	aClass446_3450.method7265(1.0F, 1.0F, 1.0F);
	aFloat3451 = 1.1F;
	aFloat3452 = 1.1F;
	aFloat3453 = 50.0F;
	aFloat3436 = 10000.0F;
	aFloat3458 = 1.5707964F;
	aFloat3457 = 1.5707964F;
	anInt3447 = -266121843;
	aBool3456 = true;
	aBool3460 = true;
	anInt3461 = 0;
	aFloat3462 = 1.0F;
	aClass10_3463.method688((short) 6928);
    }
    
    public float method5599() {
	Class446 class446 = method5486(-1646096399);
	Class446 class446_43_ = method5488(-1845093559);
	float f = 0.0F;
	if (null != class446 && class446_43_ != null) {
	    Class446 class446_44_
		= Class446.method7225(class446, class446_43_);
	    class446_44_.aFloat4896 = 0.0F;
	    f = (float) Math.atan2((double) class446_44_.aFloat4895,
				   (double) class446_44_.aFloat4897);
	    class446.method7260();
	    class446_43_.method7260();
	}
	return (float) (3.141592653589793 - (double) f);
    }
    
    public float method5600() {
	Class446 class446 = method5486(-1152082135);
	Class446 class446_45_ = method5488(-1906736099);
	float f = 0.0F;
	if (null != class446 && class446_45_ != null) {
	    Class446 class446_46_
		= Class446.method7225(class446, class446_45_);
	    class446_46_.aFloat4896 = 0.0F;
	    f = (float) Math.atan2((double) class446_46_.aFloat4895,
				   (double) class446_46_.aFloat4897);
	    class446.method7260();
	    class446_45_.method7260();
	}
	return (float) (3.141592653589793 - (double) f);
    }
    
    float method5601() {
	return 0.0F;
    }
    
    public void method5602(float f, float f_47_) throws Exception_Sub7 {
	if (!method5457((byte) 115))
	    throw new Exception_Sub7();
	aFloat3457 = f;
	aFloat3458 = f_47_;
    }
    
    public float method5603() {
	Class446 class446 = method5486(1347809107);
	Class446 class446_48_ = method5488(-2084023294);
	float f = 0.0F;
	if (null != class446 && class446_48_ != null) {
	    Class446 class446_49_
		= Class446.method7225(class446, class446_48_);
	    class446_49_.aFloat4896 = 0.0F;
	    f = (float) Math.atan2((double) class446_49_.aFloat4895,
				   (double) class446_49_.aFloat4897);
	    class446.method7260();
	    class446_48_.method7260();
	}
	return (float) (3.141592653589793 - (double) f);
    }
    
    public Class429 method5604() {
	Class429 class429 = Class429.method6864();
	class429.method6821(method5491((byte) 0), method5490(-1130989147),
			    method5492(1992262818));
	return class429;
    }
    
    public Class429 method5605() {
	Class429 class429 = Class429.method6864();
	class429.method6821(method5491((byte) 0), method5490(665058374),
			    method5492(1992262818));
	return class429;
    }
    
    public Class446 method5606() {
	return aClass446_3441;
    }
    
    public void method5607(Class446 class446, byte i) throws Exception_Sub7 {
	if (!method5457((byte) 12) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3439.method7216(class446);
    }
    
    public Class446 method5608() {
	return aClass446_3442;
    }
    
    public Class446 method5609() {
	return aClass446_3442;
    }
    
    public float method5610() {
	return aFloat3433;
    }
    
    public void method5611(int i, float f) throws Exception_Sub7 {
	if (!method5457((byte) 91) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	anInt3461 = 1804307341 * i;
	aFloat3462 = f;
    }
    
    public Class446 method5612() {
	return aClass446_3438;
    }
    
    public Class525_Sub16_Sub9 method5613(int i) {
	return (Class525_Sub16_Sub9) aClass10_3463.method684((long) i);
    }
    
    public Class350 method5614(Class289 class289, boolean bool)
	throws Exception_Sub7 {
	if (aClass294_3437 == Class294.aClass294_3242 && !bool)
	    throw new Exception_Sub7();
	aClass289_3432 = class289;
	if (class289 == Class289.aClass289_3202)
	    aClass350_3427 = new Class350_Sub1(this);
	else if (Class289.aClass289_3204 == class289)
	    aClass350_3427 = new Class350_Sub3(this);
	else if (Class289.aClass289_3203 == class289)
	    aClass350_3427 = new Class350_Sub2_Sub2(this);
	else if (Class289.aClass289_3205 == class289)
	    aClass350_3427 = new Class350_Sub2_Sub1(this);
	else if (class289 == Class289.aClass289_3206)
	    aClass350_3427 = new Class350_Sub2_Sub3(this);
	return aClass350_3427;
    }
    
    public Class446 method5615() {
	return aClass446_3438;
    }
    
    public Class446 method5616() {
	return aClass446_3439;
    }
    
    public float method5617() {
	return aFloat3453;
    }
    
    public float method5618() {
	return aFloat3436;
    }
    
    public float method5619() {
	return aFloat3457;
    }
    
    public float method5620() {
	return aFloat3457;
    }
    
    public boolean method5621() {
	return aBool3456;
    }
    
    public boolean method5622() {
	return aBool3460;
    }
    
    public void method5623(Class302 class302) throws Exception_Sub7 {
	if (!method5457((byte) 63))
	    throw new Exception_Sub7();
	aClass302_3455 = class302;
    }
    
    public void method5624(Class446 class446) throws Exception_Sub7 {
	if (!method5457((byte) 86) || !aClass302_3455.aBool3377)
	    throw new Exception_Sub7();
	aClass446_3442.method7216(class446);
    }
}
