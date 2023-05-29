/* Class471 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class471
{
    JS5 aClass458_5146;
    Class200 aClass200_5147 = new Class200(64);
    JS5 aClass458_5148;
    static final int anInt5149 = 0;
    static final int anInt5150 = 32768;
    
    public Class525_Sub16_Sub19 method7735(int i) {
	Class525_Sub16_Sub19 class525_sub16_sub19
	    = (Class525_Sub16_Sub19) aClass200_5147.method3785((long) i);
	if (class525_sub16_sub19 != null)
	    return class525_sub16_sub19;
	byte[] is;
	if (i >= 32768)
	    is = aClass458_5146.getFile(0, i & 0x7fff, 773815132);
	else
	    is = aClass458_5148.getFile(0, i, 145683438);
	class525_sub16_sub19 = new Class525_Sub16_Sub19();
	if (null != is)
	    class525_sub16_sub19.method18545(new RSBuffer(is),
					     -358948524);
	if (i >= 32768)
	    class525_sub16_sub19.method18547(681098252);
	aClass200_5147.method3788(class525_sub16_sub19, (long) i);
	return class525_sub16_sub19;
    }
    
    public Class525_Sub16_Sub19 method7736(int i, int i_0_) {
	Class525_Sub16_Sub19 class525_sub16_sub19
	    = (Class525_Sub16_Sub19) aClass200_5147.method3785((long) i);
	if (class525_sub16_sub19 != null)
	    return class525_sub16_sub19;
	byte[] is;
	if (i >= 32768)
	    is = aClass458_5146.getFile(0, i & 0x7fff, 1045712406);
	else
	    is = aClass458_5148.getFile(0, i, 1208407917);
	class525_sub16_sub19 = new Class525_Sub16_Sub19();
	if (null != is)
	    class525_sub16_sub19.method18545(new RSBuffer(is),
					     1450252566);
	if (i >= 32768)
	    class525_sub16_sub19.method18547(-122888474);
	aClass200_5147.method3788(class525_sub16_sub19, (long) i);
	return class525_sub16_sub19;
    }
    
    public Class525_Sub16_Sub19 method7737(int i) {
	Class525_Sub16_Sub19 class525_sub16_sub19
	    = (Class525_Sub16_Sub19) aClass200_5147.method3785((long) i);
	if (class525_sub16_sub19 != null)
	    return class525_sub16_sub19;
	byte[] is;
	if (i >= 32768)
	    is = aClass458_5146.getFile(0, i & 0x7fff, 505463047);
	else
	    is = aClass458_5148.getFile(0, i, 903421936);
	class525_sub16_sub19 = new Class525_Sub16_Sub19();
	if (null != is)
	    class525_sub16_sub19.method18545(new RSBuffer(is),
					     692802082);
	if (i >= 32768)
	    class525_sub16_sub19.method18547(323608955);
	aClass200_5147.method3788(class525_sub16_sub19, (long) i);
	return class525_sub16_sub19;
    }
    
    public Class471(Class666 class666, JS5 class458,
		    JS5 class458_1_) {
	aClass458_5148 = class458;
	aClass458_5146 = class458_1_;
	if (aClass458_5148 != null)
	    aClass458_5148.getFileCountForArchive(0, 2143142058);
	if (aClass458_5146 != null)
	    aClass458_5146.getFileCountForArchive(0, 2109542015);
    }
    
    public Class525_Sub16_Sub19 method7738(int i) {
	Class525_Sub16_Sub19 class525_sub16_sub19
	    = (Class525_Sub16_Sub19) aClass200_5147.method3785((long) i);
	if (class525_sub16_sub19 != null)
	    return class525_sub16_sub19;
	byte[] is;
	if (i >= 32768)
	    is = aClass458_5146.getFile(0, i & 0x7fff, 1113204181);
	else
	    is = aClass458_5148.getFile(0, i, 1248104942);
	class525_sub16_sub19 = new Class525_Sub16_Sub19();
	if (null != is)
	    class525_sub16_sub19.method18545(new RSBuffer(is),
					     -932775237);
	if (i >= 32768)
	    class525_sub16_sub19.method18547(1297525040);
	aClass200_5147.method3788(class525_sub16_sub19, (long) i);
	return class525_sub16_sub19;
    }
    
    static final void method7739(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class259 class259_2_
	    = WorldTile.method1432(class245, class259, 93078391);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = null == class259_2_ ? -1 : class259_2_.anInt2588 * 1984678839;
    }
    
    static final void method7740(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -1854178829 * class259.anInt2628;
    }
    
    public static void method7741(int i) {
	if (Class328.aClass303Array3578 == null) {
	    Class328.aClass303Array3578 = Class303.method5412(-1738860745);
	    Class328.aClass303_3583 = Class328.aClass303Array3578[0];
	    Class328.aLong3582
		= Class251.method4508((byte) 8) * -1072739247410761927L;
	}
	if (Class159.aClass295_1755 == null)
	    Class97.method1821(-582357193);
	Class303 class303 = Class328.aClass303_3583;
	int i_3_ = SunDefinition.method5447((byte) -28);
	if (class303 == Class328.aClass303_3583) {
	    Class220.aString2331
		= Class328.aClass303_3583.aClass53_3391
		      .method1169(Class21.aClass666_213, 1552651121);
	    Class198_Sub19.aString9992 = Class220.aString2331;
	    if (Class328.aClass303_3583.aBool3405)
		Class168_Sub2.anInt9885
		    = ((((Class328.aClass303_3583.anInt3403 * 1113563215
			  - 1474421939 * Class328.aClass303_3583.anInt3385)
			 * i_3_ / 100)
			+ 1474421939 * Class328.aClass303_3583.anInt3385)
		       * -1040104935);
	    if (Class328.aClass303_3583.aBool3404)
		Class198_Sub19.aString9992
		    = new StringBuilder().append
			  (Class198_Sub19.aString9992).append
			  (" - ").append
			  (893450793 * Class168_Sub2.anInt9885).append
			  ("%").toString();
	} else if (Class328.aClass303_3583 == Class303.aClass303_3388) {
	    Class159.aClass295_1755 = null;
	    Class441.method7119(1, 451322702);
	    if (Class328.aBool3576) {
		Class328.aBool3576 = false;
		Class350.method6154(Class108.aString1309,
				    Class525_Sub21.aString10584, "", false,
				    (byte) 0);
	    }
	} else {
	    Class220.aString2331
		= class303.aClass53_3401.method1169(Class21.aClass666_213,
						    1552651121);
	    Class198_Sub19.aString9992 = Class220.aString2331;
	    if (Class328.aClass303_3583.aBool3404)
		Class198_Sub19.aString9992
		    = new StringBuilder().append
			  (Class198_Sub19.aString9992).append
			  (" - ").append
			  (class303.anInt3403 * 1113563215).append
			  ("%").toString();
	    Class168_Sub2.anInt9885 = -1594227273 * class303.anInt3403;
	    if (Class328.aClass303_3583.aBool3405 || class303.aBool3405)
		Class328.aLong3582
		    = Class251.method4508((byte) 8) * -1072739247410761927L;
	}
	if (Class159.aClass295_1755 != null) {
	    Class159.aClass295_1755.method5341
		(-4466893964599619831L * Class328.aLong3582,
		 Class220.aString2331, Class198_Sub19.aString9992,
		 893450793 * Class168_Sub2.anInt9885, Class328.aClass303_3583,
		 -80136654);
	    if (null != Class328.anInterface32Array3585) {
		for (int i_4_ = 720830411 * Class328.anInt3580 + 1;
		     i_4_ < Class328.anInterface32Array3585.length; i_4_++) {
		    if (Class328.anInterface32Array3585[i_4_]
			    .method202(-1318175184) >= 100
			&& i_4_ - 1 == Class328.anInt3580 * 720830411
			&& 10 != 1777895575 * client.anInt11075
			&& Class159.aClass295_1755.method5318((byte) 9)) {
			try {
			    Class328.anInterface32Array3585[i_4_]
				.method19(521765011);
			} catch (Exception exception) {
			    Class328.anInterface32Array3585 = null;
			    break;
			}
			Class159.aClass295_1755.method5319
			    (Class328.anInterface32Array3585[i_4_],
			     1514621810);
			Class328.anInt3580 += -2105692701;
			if ((720830411 * Class328.anInt3580
			     >= Class328.anInterface32Array3585.length - 1)
			    && Class328.anInterface32Array3585.length > 1)
			    Class328.anInt3580 = (Class328.aClass91_3579
						      .method1695(-527910033)
						  ? 0 : -1) * -2105692701;
		    }
		}
	    }
	}
    }
}
