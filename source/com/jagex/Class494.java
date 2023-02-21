/* Class494 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class494
{
    int anInt5300;
    int anInt5301;
    int anInt5302 = 0;
    float aFloat5303;
    float[] aFloatArray5304;
    Class372 aClass372_5305;
    boolean aBool5306;
    float aFloat5307;
    Interface58 anInterface58_5308;
    int anInt5309;
    int anInt5310;
    int anInt5311;
    int anInt5312;
    Class481[] aClass481Array5313;
    int anInt5314;
    Object anObject5315;
    int anInt5316;
    int anInt5317;
    int anInt5318;
    float aFloat5319;
    boolean aBool5320;
    int[] anIntArray5321;
    int[] anIntArray5322;
    int[] anIntArray5323;
    int anInt5324;
    boolean aBool5325;
    Interface57 anInterface57_5326;
    Interface41 anInterface41_5327;
    boolean aBool5328;
    int anInt5329;
    int anInt5330;
    Object anObject5331;
    byte[] aByteArray5332;
    int anInt5333 = 0;
    int anInt5334 = 0;
    boolean aBool5335;
    int anInt5336 = 0;
    int anInt5337 = 0;
    Class491 aClass491_5338;
    int anInt5339 = 0;
    float aFloat5340;
    boolean aBool5341;
    float aFloat5342 = 0.0F;
    long aLong5343 = 0L;
    long aLong5344 = 0L;
    float aFloat5345 = 0.0F;
    boolean aBool5346;
    boolean aBool5347;
    int anInt5348;
    int anInt5349;
    boolean aBool5350;
    
    public void method8004(int i) {
	synchronized (this) {
	    method8080(-145881707);
	}
    }
    
    void method8005(boolean bool, int i) {
	aBool5347 = bool;
    }
    
    void method8006(Class491 class491, int i) {
	aClass491_5338 = class491;
    }
    
    void method8007() {
	aBool5350 = true;
    }
    
    boolean method8008(int i) {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 49);
	    return interface69.method459(i, (byte) 127);
	}
	return false;
    }
    
    boolean method8009(int i, byte i_0_) {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 92);
	    return interface69.method459(i, (byte) 127);
	}
	return false;
    }
    
    public void method8010(int i) {
	if (method8038((byte) 113).anInt5292 * 1634130793
	    < Class491.aClass491_5285.anInt5292 * 1634130793)
	    throw new RuntimeException("");
	anObject5331 = null;
	method8006(Class491.aClass491_5291, -1095552769);
    }
    
    void method8011(byte[] is, int i, int i_1_) {
	int i_2_ = i;
	int i_3_ = 0;
	int i_4_ = anInterface41_5327.method290().anInt4107 * -1339941795;
	while (i_2_ < is.length && i_2_ < i_1_) {
	    float f = aFloatArray5304[i_3_] * (aFloat5319 * aFloat5303);
	    if (16 == i_4_) {
		int i_5_ = (is[i_2_] & 0xff) + (is[i_2_ + 1] << 8);
		i_5_ *= f * f;
		is[i_2_++] = (byte) i_5_;
		is[i_2_++] = (byte) (i_5_ >> 8);
	    } else if (8 == i_4_) {
		byte i_6_ = is[i_2_];
		i_6_ *= f;
		is[i_2_++] = i_6_;
	    } else
		throw new RuntimeException("");
	    i_3_ = ++i_3_ % aFloatArray5304.length;
	}
    }
    
    float method8012(int i) {
	return aFloat5319;
    }
    
    boolean method8013(byte[] is, Interface58 interface58, int i, float f,
		       boolean bool, boolean bool_7_, int i_8_, float f_9_,
		       Object object, byte i_10_) {
	synchronized (this) {
	    if (interface58 != null) {
		aByteArray5332 = null;
		anInterface58_5308 = interface58;
	    } else
		aByteArray5332 = is;
	    anObject5331 = object;
	    anInt5301 = -234715533 * i;
	    aFloat5319 = f;
	    aBool5328 = bool_7_;
	    anInt5324 = 637710707 * i_8_;
	    aFloat5307 = f_9_;
	    byte[] is_11_ = null;
	    if (aByteArray5332 != null)
		is_11_ = aByteArray5332;
	    else if (anInterface58_5308 != null) {
		anInt5309 = 0;
		is_11_ = anInterface58_5308.method363(anInt5309 * 1295923039,
						      1945756037);
	    }
	    if (null != is_11_) {
		RSBuffer class525_sub38 = new RSBuffer(is_11_);
		if (class525_sub38.readUnsignedByte(265503362) != 74
		    || class525_sub38.readUnsignedByte(555298928) != 65
		    || class525_sub38.readUnsignedByte(699198419) != 71
		    || class525_sub38.readUnsignedByte(1668917399) != 65)
		    throw new RuntimeException("");
		anInt5316
		    = class525_sub38.readInt(1598519038) * 2108834467;
		anInt5317
		    = class525_sub38.readInt(1142110149) * 1044160181;
		anInt5310
		    = class525_sub38.readInt(1821870777) * 1185194453;
		anInt5318 = class525_sub38.readInt(2054248346) * 852494605;
		anInt5348
		    = class525_sub38.readInt(1565411358) * 2142815153;
		if (null == anObject5315) {
		    anObject5315
			= aClass372_5305.method6333(anInt5318 * -1851200059,
						    -1294233731 * anInt5310,
						    anInterface41_5327
							.method290(),
						    anInterface41_5327
							.method313(),
						    anInt5312 * 1076467623,
						    aFloat5307, -315460886);
		    if (anObject5315 == null) {
			method8006(Class491.aClass491_5290, -1095552769);
			boolean bool_12_ = false;
			return bool_12_;
		    }
		}
		anIntArray5321 = new int[anInt5348 * 1312400721];
		anIntArray5322 = new int[1312400721 * anInt5348];
		anIntArray5323 = new int[anInt5348 * 1312400721];
		int i_13_ = (-1133521593 * class525_sub38.pos
			     + 1909271176 * anInt5348);
		for (int i_14_ = 0; i_14_ < 1312400721 * anInt5348; i_14_++) {
		    anIntArray5321[i_14_] = i_13_;
		    anIntArray5322[i_14_]
			= class525_sub38.readInt(1511984248);
		    anIntArray5323[i_14_]
			= class525_sub38.readInt(1899257057);
		    i_13_ += anIntArray5322[i_14_];
		}
		anInt5300 = class525_sub38.pos * -690326199;
		aClass481Array5313 = new Class481[1967952941 * anInt5330];
		aFloatArray5304 = new float[2];
		for (int i_15_ = 0; i_15_ < aFloatArray5304.length; i_15_++)
		    aFloatArray5304[i_15_] = 1.0F;
		if (anObject5331 instanceof Class488) {
		    Interface69 interface69
			= ((Class488) anObject5331).method7897((byte) 125);
		    aBool5306 = interface69.method442(-123008712);
		    aBool5320 = !aBool5306;
		}
		anInterface41_5327.method291(aBool5320,
					     (aBool5328
					      ? anInt5324 * 2115623867 : 0),
					     -1033797365 * anInt5316,
					     354934685 * anInt5317);
		if (null != anInterface58_5308) {
		    int i_16_ = (class525_sub38.buffer.length
				 - -100055537 * anInt5300);
		    byte[] is_17_
			= Class707.method14309(i_16_, true, 1908224940);
		    System.arraycopy(class525_sub38.buffer,
				     anInt5300 * -100055537, is_17_, 0, i_16_);
		    class525_sub38.buffer = is_17_;
		    class525_sub38.pos = 339428471 * i_16_;
		    anInterface41_5327.method56(class525_sub38);
		    anInt5309 += 1440081055;
		} else
		    aBool5347 = true;
		boolean bool_18_ = true;
		return bool_18_;
	    }
	    boolean bool_19_ = null != is_11_;
	    return bool_19_;
	}
    }
    
    void method8014(int i) {
	synchronized (this) {
	    method8026((byte) 4);
	}
    }
    
    boolean method8015() {
	synchronized (this) {
	    if (null != anObject5331 && anObject5331 instanceof Class488) {
		Class488 class488 = (Class488) anObject5331;
		Interface69 interface69 = class488.method7897((byte) 90);
		if (null != interface69) {
		    boolean bool = interface69.method477(-904093972);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    void method8016(Interface57 interface57, short i) {
	anInterface57_5326 = interface57;
	if (anInterface57_5326 != null)
	    anInterface57_5326.method357(anObject5331, aFloatArray5304, null,
					 1684935471);
    }
    
    boolean method8017(int i) {
	if (aFloatArray5304 == null)
	    return false;
	float f = 0.0F;
	float f_20_ = 0.0F;
	for (int i_21_ = 0; i_21_ < aFloatArray5304.length; i_21_++) {
	    float f_22_ = aFloatArray5304[i_21_];
	    if (aFloat5319 * f_22_ > f)
		f = f_22_;
	    if (f_22_ > f_20_)
		f_20_ = f_22_;
	}
	if (f < 1.0E-5F) {
	    if (f_20_ >= 1.0E-5F && aFloat5342 >= 1.0E-5F)
		return true;
	    return false;
	}
	return true;
    }
    
    void method8018(int i) {
	Class393 class393 = aClass372_5305.method6342(-1603105735)
				.method6398(anInt5301 * 790400699, 1153358662);
	aFloat5303
	    = class393 != null ? class393.method6487((short) 2914) : 1.0F;
	float f = null != class393 ? class393.method6485(2131756141) : 0.1F;
	f *= aFloat5319;
	float f_23_ = aFloatArray5304.length > 0 ? 0.0F : 1.0F;
	for (int i_24_ = 0; i_24_ < aFloatArray5304.length; i_24_++) {
	    if (aFloatArray5304[i_24_] > f_23_)
		f_23_ = aFloatArray5304[i_24_];
	}
	f *= f_23_;
	if (!method8017(-1933666994))
	    f = -1.0F;
	if (method8019(1574002851) != f) {
	    method8020(f, 1723327789);
	    aBool5341 = true;
	}
    }
    
    public float method8019(int i) {
	return aFloat5340;
    }
    
    void method8020(float f, int i) {
	synchronized (this) {
	    aFloat5340 = f;
	}
    }
    
    void method8021(float f, int i, int i_25_) {
	if (i <= 0) {
	    aFloat5319 = f;
	    aFloat5342 = aFloat5319;
	    aLong5344 = 0L;
	    aLong5343 = 0L;
	} else {
	    aFloat5345 = aFloat5319;
	    aFloat5342 = f;
	    aLong5344 = Class251.method4508((byte) 8) * 7826010647947044207L;
	    aLong5343 = (((long) i + aLong5344 * -6539278696046782065L)
			 * 6540599599891690083L);
	}
    }
    
    boolean method8022(byte i) {
	return Class491.aClass491_5290 == aClass491_5338;
    }
    
    void method8023() {
	synchronized (this) {
	    method8026((byte) 4);
	}
    }
    
    void method8024(short i) {
	synchronized (this) {
	    int i_26_ = method8087(1552651121);
	    if (aBool5306 && i_26_ > 1167824447 * anInt5329
		&& anInterface41_5327.method289()) {
		/* empty */
	    } else {
		Class376 class376 = anInterface41_5327.method281();
		if (aBool5347 && Class376.aClass376_3902 != class376) {
		    if (aByteArray5332 != null) {
			if (1261553337 * anInt5336 >= 1312400721 * anInt5348) {
			    anInterface41_5327.method56(null);
			    anInt5336 = 0;
			} else {
			    if (anInt5311 * -1154700593
				< -100055537 * anInt5300)
				anInt5311 = anInt5300 * -1040482111;
			    anInt5311
				= -1920852945 * (anInt5339 * 1435764817
						 + (anIntArray5321
						    [anInt5336 * 1261553337]));
			    int i_27_ = anIntArray5322[anInt5336 * 1261553337];
			    int i_28_ = i_27_;
			    int i_29_
				= (1435764817 * anInt5339 + i_28_ > i_27_
				   ? (anIntArray5321[anInt5336 * 1261553337]
				      + i_27_)
				   : -1154700593 * anInt5311 + i_28_);
			    Class494 class494_30_ = this;
			    class494_30_.anInt5339
				= (class494_30_.anInt5339
				   + ((i_28_ + anInt5311 * -1154700593
				       > aByteArray5332.length)
				      ? (aByteArray5332.length
					 - -1154700593 * anInt5311)
				      : i_28_) * 384975025);
			    RSBuffer class525_sub38
				= new RSBuffer(i_29_ - (anInt5311
							      * -1154700593),
						     true);
			    if (aByteArray5332 == null)
				throw new RuntimeException("");
			    if (null == class525_sub38.buffer)
				throw new RuntimeException("");
			    class525_sub38.method16614(aByteArray5332,
						       anInt5311 * -1154700593,
						       i_29_ - (-1154700593
								* anInt5311),
						       -460124108);
			    anInterface41_5327.method56(class525_sub38);
			    method8005(false, -1411296334);
			    if (anInt5339 * 1435764817 >= i_27_) {
				anInt5336 += 126771081;
				anInt5339 = 0;
			    }
			}
		    } else if (anInterface58_5308 != null) {
			if (1295923039 * anInt5309 >= 1312400721 * anInt5348) {
			    anInt5309 = 0;
			    anInterface41_5327.method56(null);
			} else {
			    byte[] is
				= (anInterface58_5308.method363
				   (anIntArray5323[anInt5309 * 1295923039],
				    1840132204));
			    if (is != null) {
				RSBuffer class525_sub38
				    = new RSBuffer(is);
				class525_sub38.pos
				    = is.length * 339428471;
				anInterface41_5327.method56(class525_sub38);
				method8005(false, 932613287);
				anInt5309 += 1440081055;
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method8025(int i) {
	synchronized (this) {
	    if (anInterface41_5327.method281() == Class376.aClass376_3900) {
		if (null != anObject5315) {
		    int i_31_
			= aClass372_5305.method6336(anObject5315, -551250535);
		    if (i_31_ >= anInt5312 * 1076467623) {
			aClass372_5305.method6334(anObject5315, (byte) 56);
			anObject5315 = null;
			method8006(Class491.aClass491_5284, -1095552769);
		    }
		} else
		    method8006(Class491.aClass491_5284, -1095552769);
	    }
	}
	method8058(10461425);
    }
    
    void method8026(byte i) {
	if (method8038((byte) 101) != Class491.aClass491_5289
	    && (method8038((byte) 84).anInt5292 * 1634130793
		< Class491.aClass491_5288.anInt5292 * 1634130793)) {
	    method8006(Class491.aClass491_5288, -1095552769);
	    aBool5325 = true;
	    method8117(-960613331);
	    method8018(-1840384665);
	}
    }
    
    void method8027() {
	synchronized (this) {
	    int i = method8087(1552651121);
	    if (aBool5306 && i > 1167824447 * anInt5329
		&& anInterface41_5327.method289()) {
		/* empty */
	    } else {
		Class376 class376 = anInterface41_5327.method281();
		if (aBool5347 && Class376.aClass376_3902 != class376) {
		    if (aByteArray5332 != null) {
			if (1261553337 * anInt5336 >= 1312400721 * anInt5348) {
			    anInterface41_5327.method56(null);
			    anInt5336 = 0;
			} else {
			    if (anInt5311 * -1154700593
				< -100055537 * anInt5300)
				anInt5311 = anInt5300 * -1040482111;
			    anInt5311
				= -1920852945 * (anInt5339 * 1435764817
						 + (anIntArray5321
						    [anInt5336 * 1261553337]));
			    int i_32_ = anIntArray5322[anInt5336 * 1261553337];
			    int i_33_ = i_32_;
			    int i_34_
				= (1435764817 * anInt5339 + i_33_ > i_32_
				   ? (anIntArray5321[anInt5336 * 1261553337]
				      + i_32_)
				   : -1154700593 * anInt5311 + i_33_);
			    Class494 class494_35_ = this;
			    class494_35_.anInt5339
				= (class494_35_.anInt5339
				   + ((i_33_ + anInt5311 * -1154700593
				       > aByteArray5332.length)
				      ? (aByteArray5332.length
					 - -1154700593 * anInt5311)
				      : i_33_) * 384975025);
			    RSBuffer class525_sub38
				= new RSBuffer(i_34_ - (anInt5311
							      * -1154700593),
						     true);
			    if (aByteArray5332 == null)
				throw new RuntimeException("");
			    if (null == class525_sub38.buffer)
				throw new RuntimeException("");
			    class525_sub38.method16614(aByteArray5332,
						       anInt5311 * -1154700593,
						       i_34_ - (-1154700593
								* anInt5311),
						       769954803);
			    anInterface41_5327.method56(class525_sub38);
			    method8005(false, 408576807);
			    if (anInt5339 * 1435764817 >= i_32_) {
				anInt5336 += 126771081;
				anInt5339 = 0;
			    }
			}
		    } else if (anInterface58_5308 != null) {
			if (1295923039 * anInt5309 >= 1312400721 * anInt5348) {
			    anInt5309 = 0;
			    anInterface41_5327.method56(null);
			} else {
			    byte[] is
				= (anInterface58_5308.method363
				   (anIntArray5323[anInt5309 * 1295923039],
				    1827019688));
			    if (is != null) {
				RSBuffer class525_sub38
				    = new RSBuffer(is);
				class525_sub38.pos
				    = is.length * 339428471;
				anInterface41_5327.method56(class525_sub38);
				method8005(false, 1191187605);
				anInt5309 += 1440081055;
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method8028(Interface57 interface57) {
	anInterface57_5326 = interface57;
	if (anInterface57_5326 != null)
	    anInterface57_5326.method357(anObject5331, aFloatArray5304, null,
					 1684935471);
    }
    
    void method8029(byte i) {
	aBool5350 = false;
    }
    
    public void method8030(byte i) {
	if ((method8038((byte) 107).anInt5292 * 1634130793
	     >= Class491.aClass491_5288.anInt5292 * 1634130793)
	    && (method8038((byte) 88).anInt5292 * 1634130793
		< Class491.aClass491_5289.anInt5292 * 1634130793)
	    && method8017(670718583)) {
	    synchronized (this) {
		anInterface41_5327.method282();
		method8031(1810534389);
	    }
	    Thread.yield();
	}
    }
    
    void method8031(int i) {
	if (null != aClass481Array5313) {
	    boolean bool = true;
	    Class376 class376 = anInterface41_5327.method281();
	    if (anInterface41_5327.method289()) {
		if (aBool5306
		    && method8009(1167824447 * anInt5329, (byte) -78)) {
		    if (aClass481Array5313[anInt5337 * 150670463] == null) {
			RSBuffer class525_sub38
			    = method8037(1167824447 * anInt5329, -1713316009);
			if (class525_sub38 != null) {
			    aClass481Array5313[150670463 * anInt5337]
				= new Class481(this, class525_sub38, false);
			    int i_36_ = anInterface41_5327.method224();
			    int i_37_
				= (anInterface41_5327.method190
				   (-1133521593 * (aClass481Array5313
						   [150670463 * anInt5337]
						   .aClass525_Sub38_5222
						   .pos) / i_36_));
			    anInt5333 += -1842521807 * i_37_;
			    if (false == aBool5320 && aBool5328
				&& anInt5349 * 1020788903 > 0) {
				if (1253138385 * anInt5333
				    < anInt5316 * -1033797365)
				    aClass481Array5313[150670463 * anInt5337]
					= null;
				else if ((anInt5333 * 1253138385
					  >= -1033797365 * anInt5316)
					 && (1253138385 * anInt5333 - i_37_
					     < -1033797365 * anInt5316))
				    aClass481Array5313
					[anInt5337 * 150670463].anInt5220
					= (anInterface41_5327.method283
					   ((anInt5333 * 1253138385
					     - -1033797365 * anInt5316)
					    * i_36_)) * 1695524045;
			    }
			    anInt5329 += 546396607;
			    if (false == aBool5320 && aBool5328
				&& (1253138385 * anInt5333
				    >= 354934685 * anInt5317)
				&& ((1020788903 * anInt5349
				     < 2115623867 * anInt5324)
				    || anInt5324 * 2115623867 < 0)) {
				int i_38_ = (anInt5333 * 1253138385
					     - 354934685 * anInt5317);
				int i_39_ = i_37_ - i_38_;
				aClass481Array5313[150670463 * anInt5337]
				    .anInt5221
				    = (anInterface41_5327
					   .method283(i_36_ * i_39_)
				       * -1096621995);
				anInt5329 = 0;
				anInt5333 = 0;
				anInt5349 += 1893574423;
			    }
			    if (null
				!= aClass481Array5313[150670463 * anInt5337]) {
				anInt5337 += -2109164673;
				anInt5337 = (150670463 * anInt5337
					     % aClass481Array5313.length
					     * -2109164673);
			    }
			}
		    }
		} else if (!method8040((byte) 90) || !aBool5306) {
		    int i_40_ = anInterface41_5327.method77();
		    int i_41_
			= anInterface41_5327.method190(1076467623 * anInt5312);
		    if (!aBool5335
			&& aClass481Array5313[150670463 * anInt5337] == null) {
			if (class376 != Class376.aClass376_3901 && i_40_ > 0) {
			    RSBuffer class525_sub38
				= method8035(i_41_, (byte) 67);
			    aClass481Array5313[150670463 * anInt5337]
				= (class525_sub38 != null
				   ? new Class481(this, class525_sub38, false)
				   : null);
			    int i_42_
				= ((aClass481Array5313[150670463 * anInt5337]
				    != null)
				   ? (aClass481Array5313[anInt5337 * 150670463]
				      .aClass525_Sub38_5222
				      .pos) * -1133521593
				   : 0);
			    int i_43_ = anInterface41_5327.method224();
			    int i_44_
				= anInterface41_5327.method190(i_42_ / i_43_);
			    anInt5334 += -421777535 * i_44_;
			    if (anInt5334 * 840175745
				> anInt5333 * 1253138385) {
				anInt5333 += i_44_ * -1842521807;
				i_40_ -= i_44_;
				if (false == aBool5320 && aBool5328
				    && 1020788903 * anInt5349 > 0) {
				    if (anInt5333 * 1253138385
					< anInt5316 * -1033797365)
					aClass481Array5313[(150670463
							    * anInt5337)]
					    = null;
				    else if ((anInt5333 * 1253138385
					      >= anInt5316 * -1033797365)
					     && (1253138385 * anInt5333 - i_44_
						 < anInt5316 * -1033797365))
					aClass481Array5313
					    [150670463 * anInt5337].anInt5220
					    = ((anInterface41_5327.method283
						(i_43_
						 * (anInt5333 * 1253138385
						    - (anInt5316
						       * -1033797365))))
					       * 1695524045);
				}
				if (aClass481Array5313[anInt5337 * 150670463]
				    != null) {
				    if (aBool5306
					&& !method8009(anInt5329 * 1167824447,
						       (byte) -100))
					method8036((aClass481Array5313
						    [anInt5337 * 150670463]
						    .aClass525_Sub38_5222),
						   -290147272);
				    if (!aBool5320 && aBool5328
					&& (anInt5333 * 1253138385
					    >= anInt5317 * 354934685)
					&& ((1020788903 * anInt5349
					     <= 2115623867 * anInt5324)
					    || 2115623867 * anInt5324 < 0)) {
					int i_45_ = (1253138385 * anInt5333
						     - anInt5317 * 354934685);
					int i_46_ = i_44_ - i_45_;
					aClass481Array5313
					    [anInt5337 * 150670463].anInt5221
					    = (anInterface41_5327
						   .method283(i_46_ * i_43_)
					       * -1096621995);
					anInt5329 = 0;
					anInt5349 += 1893574423;
					anInt5333 = 0;
				    } else
					anInt5329 += 546396607;
				    anInt5337 += -2109164673;
				    anInt5337
					= (-2109164673
					   * (anInt5337 * 150670463
					      % aClass481Array5313.length));
				}
			    } else
				aClass481Array5313[anInt5337 * 150670463]
				    = null;
			} else if (Class376.aClass376_3901 == class376
				   && aBool5328 && false == aBool5320
				   && ((1020788903 * anInt5349
					< 2115623867 * anInt5324)
				       || 2115623867 * anInt5324 < 0))
			    anInterface41_5327.method307(true);
		    }
		}
	    }
	    int i_47_ = 0;
	    for (int i_48_ = 0; i_48_ < aClass481Array5313.length; i_48_++) {
		if (null != aClass481Array5313[i_48_]) {
		    i_47_++;
		    bool = false;
		}
	    }
	    if (!aBool5346 && method8019(1232823523) >= 0.0F
		&& (i_47_ >= 1967952941 * anInt5330
		    || class376 == Class376.aClass376_3901
		    || class376 == Class376.aClass376_3902)) {
		aBool5346 = true;
		method8006(Class491.aClass491_5286, -1095552769);
	    }
	    if (anInterface41_5327.method289() && bool
		&& (method8040((byte) 97) || aBool5335
		    || class376 == Class376.aClass376_3901)
		&& (!aBool5328
		    || (!aBool5320
			&& anInt5349 * 1020788903 >= 2115623867 * anInt5324
			&& 2115623867 * anInt5324 >= 0))) {
		method8006(Class491.aClass491_5290, -1095552769);
		aBool5325 = false;
		if (aBool5306)
		    method8077((byte) 27);
	    }
	}
    }
    
    void method8032() {
	Class393 class393 = aClass372_5305.method6342(-699015846)
				.method6398(anInt5301 * 790400699, 1143911099);
	aFloat5303
	    = class393 != null ? class393.method6487((short) 2914) : 1.0F;
	float f = null != class393 ? class393.method6485(2108297173) : 0.1F;
	f *= aFloat5319;
	float f_49_ = aFloatArray5304.length > 0 ? 0.0F : 1.0F;
	for (int i = 0; i < aFloatArray5304.length; i++) {
	    if (aFloatArray5304[i] > f_49_)
		f_49_ = aFloatArray5304[i];
	}
	f *= f_49_;
	if (!method8017(33424709))
	    f = -1.0F;
	if (method8019(1352267239) != f) {
	    method8020(f, -1514408042);
	    aBool5341 = true;
	}
    }
    
    public void method8033(int i) {
	synchronized (this) {
	    if (aBool5350) {
		/* empty */
	    } else if (null == anObject5315) {
		/* empty */
	    } else {
		int i_50_ = aClass372_5305.method6336(anObject5315, -88539950);
		if (i_50_ <= 0) {
		    /* empty */
		} else if (aClass481Array5313 != null
			   && (aClass481Array5313[-1806014645 * anInt5314]
			       != null)
			   && aBool5346) {
		    int i_51_
			= ((1042587551 * anInt5302 + i_50_
			    > (aClass481Array5313[-1806014645 * anInt5314]
			       .aClass525_Sub38_5222.pos) * -1133521593)
			   ? (-1133521593 * (aClass481Array5313
					     [-1806014645 * anInt5314]
					     .aClass525_Sub38_5222.pos)
			      - anInt5302 * 1042587551)
			   : i_50_);
		    if (anInt5302 * 1042587551 < (aClass481Array5313
						  [anInt5314 * -1806014645]
						  .anInt5220) * -21436411
			&& (i_51_ + 1042587551 * anInt5302
			    > -21436411 * (aClass481Array5313
					   [-1806014645 * anInt5314]
					   .anInt5220))
			&& (aClass481Array5313[-1806014645 * anInt5314]
			    .anInt5220) * -21436411 >= 0) {
			anInt5302 += -753809957 * (aClass481Array5313
						   [-1806014645 * anInt5314]
						   .anInt5220) - 1 * anInt5302;
			i_51_
			    = ((i_50_ + 1042587551 * anInt5302
				> ((aClass481Array5313[anInt5314 * -1806014645]
				    .aClass525_Sub38_5222.pos)
				   * -1133521593))
			       ? (-1133521593 * (aClass481Array5313
						 [-1806014645 * anInt5314]
						 .aClass525_Sub38_5222
						 .pos)
				  - anInt5302 * 1042587551)
			       : i_50_);
		    }
		    if ((1042587551 * anInt5302 + i_51_
			 > 159587581 * (aClass481Array5313
					[-1806014645 * anInt5314].anInt5221))
			&& (159587581 * (aClass481Array5313
					 [-1806014645 * anInt5314].anInt5221)
			    >= 0))
			i_51_ = (159587581 * (aClass481Array5313
					      [-1806014645 * anInt5314]
					      .anInt5221)
				 - anInt5302 * 1042587551);
		    method8034((aClass481Array5313[-1806014645 * anInt5314]
				.aClass525_Sub38_5222.buffer),
			       anInt5302 * 1042587551,
			       i_51_ + 1042587551 * anInt5302, 796969629);
		    aClass372_5305.method6335(anObject5315,
					      (aClass481Array5313
					       [anInt5314 * -1806014645]
					       .aClass525_Sub38_5222
					       .buffer),
					      1042587551 * anInt5302, i_51_,
					      -1475004069);
		    anInt5302 += 1724955743 * i_51_;
		    i_50_ -= i_51_;
		    if ((anInt5302 * 1042587551
			 >= (aClass481Array5313[-1806014645 * anInt5314]
			     .aClass525_Sub38_5222.pos) * -1133521593)
			|| ((1042587551 * anInt5302
			     >= (aClass481Array5313[-1806014645 * anInt5314]
				 .anInt5221) * 159587581)
			    && 159587581 * (aClass481Array5313
					    [anInt5314 * -1806014645]
					    .anInt5221) >= 0)) {
			aClass481Array5313[-1806014645 * anInt5314]
			    .method7827(62252875);
			aClass481Array5313[anInt5314 * -1806014645] = null;
			anInt5314 += 45050467;
			anInt5314 = (-1806014645 * anInt5314
				     % aClass481Array5313.length * 45050467);
			anInt5302 = 0;
		    }
		}
	    }
	}
    }
    
    void method8034(byte[] is, int i, int i_52_, int i_53_) {
	int i_54_ = i;
	int i_55_ = 0;
	int i_56_ = anInterface41_5327.method290().anInt4107 * -1339941795;
	while (i_54_ < is.length && i_54_ < i_52_) {
	    float f = aFloatArray5304[i_55_] * (aFloat5319 * aFloat5303);
	    if (16 == i_56_) {
		int i_57_ = (is[i_54_] & 0xff) + (is[i_54_ + 1] << 8);
		i_57_ *= f * f;
		is[i_54_++] = (byte) i_57_;
		is[i_54_++] = (byte) (i_57_ >> 8);
	    } else if (8 == i_56_) {
		byte i_58_ = is[i_54_];
		i_58_ *= f;
		is[i_54_++] = i_58_;
	    } else
		throw new RuntimeException("");
	    i_55_ = ++i_55_ % aFloatArray5304.length;
	}
    }
    
    RSBuffer method8035(int i, byte i_59_) {
	return anInterface41_5327.method286(i);
    }
    
    void method8036(RSBuffer class525_sub38, int i) {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 58);
	    byte[] is = new byte[class525_sub38.pos * -1133521593];
	    System.arraycopy(class525_sub38.buffer, 0, is, 0,
			     class525_sub38.pos * -1133521593);
	    RSBuffer class525_sub38_60_ = new RSBuffer(is);
	    class525_sub38_60_.pos = class525_sub38.pos * 1;
	    interface69.method443(class525_sub38_60_, -1207700141);
	}
    }
    
    RSBuffer method8037(int i, int i_61_) {
	if (null != anObject5331 && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 39);
	    RSBuffer class525_sub38
		= interface69.method441(i, -1163294422);
	    RSBuffer class525_sub38_62_
		= new RSBuffer(class525_sub38.pos * -1133521593,
				     true);
	    class525_sub38_62_.method16646(class525_sub38, -2035476402);
	    return class525_sub38_62_;
	}
	return null;
    }
    
    public Class491 method8038(byte i) {
	return aClass491_5338;
    }
    
    public void method8039() {
	synchronized (this) {
	    if (aBool5350) {
		/* empty */
	    } else if (null == anObject5315) {
		/* empty */
	    } else {
		int i = aClass372_5305.method6336(anObject5315, -1593020321);
		if (i <= 0) {
		    /* empty */
		} else if (aClass481Array5313 != null
			   && (aClass481Array5313[-1806014645 * anInt5314]
			       != null)
			   && aBool5346) {
		    int i_63_
			= ((1042587551 * anInt5302 + i
			    > (aClass481Array5313[-1806014645 * anInt5314]
			       .aClass525_Sub38_5222.pos) * -1133521593)
			   ? (-1133521593 * (aClass481Array5313
					     [-1806014645 * anInt5314]
					     .aClass525_Sub38_5222.pos)
			      - anInt5302 * 1042587551)
			   : i);
		    if (anInt5302 * 1042587551 < (aClass481Array5313
						  [anInt5314 * -1806014645]
						  .anInt5220) * -21436411
			&& (i_63_ + 1042587551 * anInt5302
			    > -21436411 * (aClass481Array5313
					   [-1806014645 * anInt5314]
					   .anInt5220))
			&& (aClass481Array5313[-1806014645 * anInt5314]
			    .anInt5220) * -21436411 >= 0) {
			anInt5302 += -753809957 * (aClass481Array5313
						   [-1806014645 * anInt5314]
						   .anInt5220) - 1 * anInt5302;
			i_63_
			    = ((i + 1042587551 * anInt5302
				> ((aClass481Array5313[anInt5314 * -1806014645]
				    .aClass525_Sub38_5222.pos)
				   * -1133521593))
			       ? (-1133521593 * (aClass481Array5313
						 [-1806014645 * anInt5314]
						 .aClass525_Sub38_5222
						 .pos)
				  - anInt5302 * 1042587551)
			       : i);
		    }
		    if ((1042587551 * anInt5302 + i_63_
			 > 159587581 * (aClass481Array5313
					[-1806014645 * anInt5314].anInt5221))
			&& (159587581 * (aClass481Array5313
					 [-1806014645 * anInt5314].anInt5221)
			    >= 0))
			i_63_ = (159587581 * (aClass481Array5313
					      [-1806014645 * anInt5314]
					      .anInt5221)
				 - anInt5302 * 1042587551);
		    method8034((aClass481Array5313[-1806014645 * anInt5314]
				.aClass525_Sub38_5222.buffer),
			       anInt5302 * 1042587551,
			       i_63_ + 1042587551 * anInt5302, -254947774);
		    aClass372_5305.method6335(anObject5315,
					      (aClass481Array5313
					       [anInt5314 * -1806014645]
					       .aClass525_Sub38_5222
					       .buffer),
					      1042587551 * anInt5302, i_63_,
					      -1491324467);
		    anInt5302 += 1724955743 * i_63_;
		    i -= i_63_;
		    if ((anInt5302 * 1042587551
			 >= (aClass481Array5313[-1806014645 * anInt5314]
			     .aClass525_Sub38_5222.pos) * -1133521593)
			|| ((1042587551 * anInt5302
			     >= (aClass481Array5313[-1806014645 * anInt5314]
				 .anInt5221) * 159587581)
			    && 159587581 * (aClass481Array5313
					    [anInt5314 * -1806014645]
					    .anInt5221) >= 0)) {
			aClass481Array5313[-1806014645 * anInt5314]
			    .method7827(-1856069594);
			aClass481Array5313[anInt5314 * -1806014645] = null;
			anInt5314 += 45050467;
			anInt5314 = (-1806014645 * anInt5314
				     % aClass481Array5313.length * 45050467);
			anInt5302 = 0;
		    }
		}
	    }
	}
    }
    
    boolean method8040(byte i) {
	synchronized (this) {
	    if (null != anObject5331 && anObject5331 instanceof Class488) {
		Class488 class488 = (Class488) anObject5331;
		Interface69 interface69 = class488.method7897((byte) 121);
		if (null != interface69) {
		    boolean bool = interface69.method477(1002619177);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    void method8041(float f) {
	synchronized (this) {
	    aFloat5340 = f;
	}
    }
    
    void method8042() {
	synchronized (this) {
	    int i = method8087(1552651121);
	    if (aBool5306 && i > 1167824447 * anInt5329
		&& anInterface41_5327.method289()) {
		/* empty */
	    } else {
		Class376 class376 = anInterface41_5327.method281();
		if (aBool5347 && Class376.aClass376_3902 != class376) {
		    if (aByteArray5332 != null) {
			if (1261553337 * anInt5336 >= 1312400721 * anInt5348) {
			    anInterface41_5327.method56(null);
			    anInt5336 = 0;
			} else {
			    if (anInt5311 * -1154700593
				< -100055537 * anInt5300)
				anInt5311 = anInt5300 * -1040482111;
			    anInt5311
				= -1920852945 * (anInt5339 * 1435764817
						 + (anIntArray5321
						    [anInt5336 * 1261553337]));
			    int i_64_ = anIntArray5322[anInt5336 * 1261553337];
			    int i_65_ = i_64_;
			    int i_66_
				= (1435764817 * anInt5339 + i_65_ > i_64_
				   ? (anIntArray5321[anInt5336 * 1261553337]
				      + i_64_)
				   : -1154700593 * anInt5311 + i_65_);
			    Class494 class494_67_ = this;
			    class494_67_.anInt5339
				= (class494_67_.anInt5339
				   + ((i_65_ + anInt5311 * -1154700593
				       > aByteArray5332.length)
				      ? (aByteArray5332.length
					 - -1154700593 * anInt5311)
				      : i_65_) * 384975025);
			    RSBuffer class525_sub38
				= new RSBuffer(i_66_ - (anInt5311
							      * -1154700593),
						     true);
			    if (aByteArray5332 == null)
				throw new RuntimeException("");
			    if (null == class525_sub38.buffer)
				throw new RuntimeException("");
			    class525_sub38.method16614(aByteArray5332,
						       anInt5311 * -1154700593,
						       i_66_ - (-1154700593
								* anInt5311),
						       1376906087);
			    anInterface41_5327.method56(class525_sub38);
			    method8005(false, 232899264);
			    if (anInt5339 * 1435764817 >= i_64_) {
				anInt5336 += 126771081;
				anInt5339 = 0;
			    }
			}
		    } else if (anInterface58_5308 != null) {
			if (1295923039 * anInt5309 >= 1312400721 * anInt5348) {
			    anInt5309 = 0;
			    anInterface41_5327.method56(null);
			} else {
			    byte[] is
				= (anInterface58_5308.method363
				   (anIntArray5323[anInt5309 * 1295923039],
				    1491048802));
			    if (is != null) {
				RSBuffer class525_sub38
				    = new RSBuffer(is);
				class525_sub38.pos
				    = is.length * 339428471;
				anInterface41_5327.method56(class525_sub38);
				method8005(false, 264994571);
				anInt5309 += 1440081055;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method8043(short i) {
	if (method8038((byte) 85).anInt5292 * 1634130793
	    >= 1634130793 * Class491.aClass491_5285.anInt5292)
	    throw new RuntimeException("");
	method8006(Class491.aClass491_5285, -1095552769);
    }
    
    public Class491 method8044() {
	return aClass491_5338;
    }
    
    public void method8045() {
	synchronized (this) {
	    if (method8038((byte) 124) == Class491.aClass491_5289
		|| (method8038((byte) 83).anInt5292 * 1634130793
		    < 1634130793 * Class491.aClass491_5285.anInt5292)) {
		/* empty */
	    } else
		method8006(Class491.aClass491_5289, -1095552769);
	}
    }
    
    void method8046(Class491 class491) {
	aClass491_5338 = class491;
    }
    
    boolean method8047() {
	return Class491.aClass491_5289 == aClass491_5338;
    }
    
    boolean method8048() {
	return Class491.aClass491_5289 == aClass491_5338;
    }
    
    boolean method8049() {
	return Class491.aClass491_5290 == aClass491_5338;
    }
    
    Object method8050(byte i) {
	return anObject5331;
    }
    
    public void method8051() {
	if (method8038((byte) 112).anInt5292 * 1634130793
	    >= 1634130793 * Class491.aClass491_5285.anInt5292)
	    throw new RuntimeException("");
	method8006(Class491.aClass491_5285, -1095552769);
    }
    
    boolean method8052() {
	synchronized (this) {
	    if (null != anObject5331 && anObject5331 instanceof Class488) {
		Class488 class488 = (Class488) anObject5331;
		Interface69 interface69 = class488.method7897((byte) 23);
		if (null != interface69) {
		    boolean bool = interface69.method477(-1703142493);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    public void method8053() {
	if (method8038((byte) 84).anInt5292 * 1634130793
	    >= 1634130793 * Class491.aClass491_5285.anInt5292)
	    throw new RuntimeException("");
	method8006(Class491.aClass491_5285, -1095552769);
    }
    
    public void method8054() {
	if (method8038((byte) 87).anInt5292 * 1634130793
	    >= 1634130793 * Class491.aClass491_5285.anInt5292)
	    throw new RuntimeException("");
	method8006(Class491.aClass491_5285, -1095552769);
    }
    
    void method8055(float f, int i) {
	if (i <= 0) {
	    aFloat5319 = f;
	    aFloat5342 = aFloat5319;
	    aLong5344 = 0L;
	    aLong5343 = 0L;
	} else {
	    aFloat5345 = aFloat5319;
	    aFloat5342 = f;
	    aLong5344 = Class251.method4508((byte) 8) * 7826010647947044207L;
	    aLong5343 = (((long) i + aLong5344 * -6539278696046782065L)
			 * 6540599599891690083L);
	}
    }
    
    void method8056(float f, int i) {
	if (i <= 0) {
	    aFloat5319 = f;
	    aFloat5342 = aFloat5319;
	    aLong5344 = 0L;
	    aLong5343 = 0L;
	} else {
	    aFloat5345 = aFloat5319;
	    aFloat5342 = f;
	    aLong5344 = Class251.method4508((byte) 8) * 7826010647947044207L;
	    aLong5343 = (((long) i + aLong5344 * -6539278696046782065L)
			 * 6540599599891690083L);
	}
    }
    
    void method8057(float f, int i) {
	if (i <= 0) {
	    aFloat5319 = f;
	    aFloat5342 = aFloat5319;
	    aLong5344 = 0L;
	    aLong5343 = 0L;
	} else {
	    aFloat5345 = aFloat5319;
	    aFloat5342 = f;
	    aLong5344 = Class251.method4508((byte) 8) * 7826010647947044207L;
	    aLong5343 = (((long) i + aLong5344 * -6539278696046782065L)
			 * 6540599599891690083L);
	}
    }
    
    void method8058(int i) {
	synchronized (this) {
	    aByteArray5332 = null;
	    anInt5301 = 0;
	    aFloat5319 = 0.0F;
	    aFloat5303 = 0.0F;
	    aBool5328 = false;
	    anInt5324 = 0;
	    aFloat5307 = 1.0F;
	    anInterface58_5308 = null;
	    anInt5309 = 0;
	    anInt5311 = 0;
	    if (aClass481Array5313 != null) {
		for (int i_68_ = 0; i_68_ < aClass481Array5313.length;
		     i_68_++) {
		    if (aClass481Array5313[i_68_] != null)
			aClass481Array5313[i_68_].method7827(52787979);
		}
	    }
	    aClass481Array5313 = null;
	    aBool5306 = false;
	    anInt5314 = 0;
	    anInt5316 = 0;
	    anInt5317 = 0;
	    anInt5318 = 0;
	    anInt5310 = 0;
	    anInt5348 = 0;
	    anIntArray5321 = null;
	    anIntArray5322 = null;
	    anIntArray5323 = null;
	    anInt5300 = 0;
	    aBool5325 = false;
	    anInterface41_5327.method285();
	    aBool5347 = false;
	    anInterface57_5326 = null;
	    anObject5331 = null;
	    anInt5302 = 0;
	    anInt5333 = 0;
	    anInt5334 = 0;
	    aBool5335 = false;
	    anInt5336 = 0;
	    anInt5337 = 0;
	    aBool5346 = false;
	    anInt5339 = 0;
	    method8020(-1.0F, 255639918);
	    aBool5341 = false;
	    aFloat5342 = 0.0F;
	    aLong5343 = 0L;
	    aLong5344 = 0L;
	    aFloat5345 = 0.0F;
	    anInt5329 = 0;
	    anInt5349 = 0;
	}
    }
    
    float method8059() {
	return aFloat5319;
    }
    
    RSBuffer method8060(int i) {
	return anInterface41_5327.method286(i);
    }
    
    boolean method8061(byte[] is, Interface58 interface58, int i, float f,
		       boolean bool, boolean bool_69_, int i_70_, float f_71_,
		       Object object) {
	synchronized (this) {
	    if (interface58 != null) {
		aByteArray5332 = null;
		anInterface58_5308 = interface58;
	    } else
		aByteArray5332 = is;
	    anObject5331 = object;
	    anInt5301 = -234715533 * i;
	    aFloat5319 = f;
	    aBool5328 = bool_69_;
	    anInt5324 = 637710707 * i_70_;
	    aFloat5307 = f_71_;
	    byte[] is_72_ = null;
	    if (aByteArray5332 != null)
		is_72_ = aByteArray5332;
	    else if (anInterface58_5308 != null) {
		anInt5309 = 0;
		is_72_ = anInterface58_5308.method363(anInt5309 * 1295923039,
						      1817149974);
	    }
	    if (null != is_72_) {
		RSBuffer class525_sub38 = new RSBuffer(is_72_);
		if (class525_sub38.readUnsignedByte(756270105) != 74
		    || class525_sub38.readUnsignedByte(1459244169) != 65
		    || class525_sub38.readUnsignedByte(786424401) != 71
		    || class525_sub38.readUnsignedByte(1036746659) != 65)
		    throw new RuntimeException("");
		anInt5316
		    = class525_sub38.readInt(1343413781) * 2108834467;
		anInt5317 = class525_sub38.readInt(913257271) * 1044160181;
		anInt5310
		    = class525_sub38.readInt(2081699220) * 1185194453;
		anInt5318 = class525_sub38.readInt(971276447) * 852494605;
		anInt5348
		    = class525_sub38.readInt(1721906714) * 2142815153;
		if (null == anObject5315) {
		    anObject5315
			= aClass372_5305.method6333(anInt5318 * -1851200059,
						    -1294233731 * anInt5310,
						    anInterface41_5327
							.method290(),
						    anInterface41_5327
							.method313(),
						    anInt5312 * 1076467623,
						    aFloat5307, 1344855943);
		    if (anObject5315 == null) {
			method8006(Class491.aClass491_5290, -1095552769);
			boolean bool_73_ = false;
			return bool_73_;
		    }
		}
		anIntArray5321 = new int[anInt5348 * 1312400721];
		anIntArray5322 = new int[1312400721 * anInt5348];
		anIntArray5323 = new int[anInt5348 * 1312400721];
		int i_74_ = (-1133521593 * class525_sub38.pos
			     + 1909271176 * anInt5348);
		for (int i_75_ = 0; i_75_ < 1312400721 * anInt5348; i_75_++) {
		    anIntArray5321[i_75_] = i_74_;
		    anIntArray5322[i_75_]
			= class525_sub38.readInt(1437697815);
		    anIntArray5323[i_75_]
			= class525_sub38.readInt(1114241361);
		    i_74_ += anIntArray5322[i_75_];
		}
		anInt5300 = class525_sub38.pos * -690326199;
		aClass481Array5313 = new Class481[1967952941 * anInt5330];
		aFloatArray5304 = new float[2];
		for (int i_76_ = 0; i_76_ < aFloatArray5304.length; i_76_++)
		    aFloatArray5304[i_76_] = 1.0F;
		if (anObject5331 instanceof Class488) {
		    Interface69 interface69
			= ((Class488) anObject5331).method7897((byte) 41);
		    aBool5306 = interface69.method442(-2043185045);
		    aBool5320 = !aBool5306;
		}
		anInterface41_5327.method291(aBool5320,
					     (aBool5328
					      ? anInt5324 * 2115623867 : 0),
					     -1033797365 * anInt5316,
					     354934685 * anInt5317);
		if (null != anInterface58_5308) {
		    int i_77_ = (class525_sub38.buffer.length
				 - -100055537 * anInt5300);
		    byte[] is_78_
			= Class707.method14309(i_77_, true, 966636965);
		    System.arraycopy(class525_sub38.buffer,
				     anInt5300 * -100055537, is_78_, 0, i_77_);
		    class525_sub38.buffer = is_78_;
		    class525_sub38.pos = 339428471 * i_77_;
		    anInterface41_5327.method56(class525_sub38);
		    anInt5309 += 1440081055;
		} else
		    aBool5347 = true;
		boolean bool_79_ = true;
		return bool_79_;
	    }
	    boolean bool_80_ = null != is_72_;
	    return bool_80_;
	}
    }
    
    public void method8062() {
	if ((method8038((byte) 86).anInt5292 * 1634130793
	     >= Class491.aClass491_5288.anInt5292 * 1634130793)
	    && (method8038((byte) 96).anInt5292 * 1634130793
		< Class491.aClass491_5289.anInt5292 * 1634130793)
	    && method8017(-1092532633)) {
	    synchronized (this) {
		anInterface41_5327.method282();
		method8031(2118447674);
	    }
	    Thread.yield();
	}
    }
    
    void method8063() {
	Class393 class393 = aClass372_5305.method6342(-887413428)
				.method6398(anInt5301 * 790400699, -474053208);
	aFloat5303
	    = class393 != null ? class393.method6487((short) 2914) : 1.0F;
	float f = null != class393 ? class393.method6485(1614885002) : 0.1F;
	f *= aFloat5319;
	float f_81_ = aFloatArray5304.length > 0 ? 0.0F : 1.0F;
	for (int i = 0; i < aFloatArray5304.length; i++) {
	    if (aFloatArray5304[i] > f_81_)
		f_81_ = aFloatArray5304[i];
	}
	f *= f_81_;
	if (!method8017(339674507))
	    f = -1.0F;
	if (method8019(1881661202) != f) {
	    method8020(f, 1129033545);
	    aBool5341 = true;
	}
    }
    
    public void method8064() {
	synchronized (this) {
	    if (method8038((byte) 96) == Class491.aClass491_5289
		|| (method8038((byte) 127).anInt5292 * 1634130793
		    < 1634130793 * Class491.aClass491_5285.anInt5292)) {
		/* empty */
	    } else
		method8006(Class491.aClass491_5289, -1095552769);
	}
    }
    
    public void method8065() {
	synchronized (this) {
	    if (method8038((byte) 94) == Class491.aClass491_5289
		|| (method8038((byte) 102).anInt5292 * 1634130793
		    < 1634130793 * Class491.aClass491_5285.anInt5292)) {
		/* empty */
	    } else
		method8006(Class491.aClass491_5289, -1095552769);
	}
    }
    
    void method8066(Interface57 interface57) {
	anInterface57_5326 = interface57;
	if (anInterface57_5326 != null)
	    anInterface57_5326.method357(anObject5331, aFloatArray5304, null,
					 1684935471);
    }
    
    public void method8067() {
	if (method8038((byte) 85).anInt5292 * 1634130793
	    < Class491.aClass491_5285.anInt5292 * 1634130793)
	    throw new RuntimeException("");
	anObject5331 = null;
	method8006(Class491.aClass491_5291, -1095552769);
    }
    
    void method8068(Interface57 interface57) {
	anInterface57_5326 = interface57;
	if (anInterface57_5326 != null)
	    anInterface57_5326.method357(anObject5331, aFloatArray5304, null,
					 1684935471);
    }
    
    boolean method8069() {
	synchronized (this) {
	    if (null != anObject5331 && anObject5331 instanceof Class488) {
		Class488 class488 = (Class488) anObject5331;
		Interface69 interface69 = class488.method7897((byte) 36);
		if (null != interface69) {
		    boolean bool = interface69.method477(209781182);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    RSBuffer method8070(int i) {
	return anInterface41_5327.method286(i);
    }
    
    boolean method8071(int i) {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 26);
	    return interface69.method459(i, (byte) 127);
	}
	return false;
    }
    
    public float method8072() {
	return aFloat5340;
    }
    
    void method8073(float f) {
	synchronized (this) {
	    aFloat5340 = f;
	}
    }
    
    void method8074(Class491 class491) {
	aClass491_5338 = class491;
    }
    
    void method8075(float f) {
	synchronized (this) {
	    aFloat5340 = f;
	}
    }
    
    void method8076(float f) {
	synchronized (this) {
	    aFloat5340 = f;
	}
    }
    
    void method8077(byte i) {
	synchronized (this) {
	    if (anObject5331 != null && anObject5331 instanceof Class488) {
		Class488 class488 = (Class488) anObject5331;
		Interface69 interface69 = class488.method7897((byte) 72);
		if (interface69 != null)
		    interface69.method461(true, -2094232122);
	    }
	}
    }
    
    void method8078() {
	if (method8038((byte) 121).anInt5292 * 1634130793
	    >= Class491.aClass491_5288.anInt5292 * 1634130793) {
	    if (method8038((byte) 120) == Class491.aClass491_5291)
		method8025(-750886923);
	    else {
		method8024((short) 1075);
		if (aFloat5319 != aFloat5342) {
		    long l = Class251.method4508((byte) 8);
		    if (l > -7502394600270799029L * aLong5343)
			aFloat5319 = aFloat5342;
		    else {
			float f = aFloat5342 - aFloat5345;
			long l_82_ = (aLong5343 * -7502394600270799029L
				      - -6539278696046782065L * aLong5344);
			float f_83_ = f / (float) l_82_;
			aFloat5319
			    = aFloat5345 + (float) (l - (-6539278696046782065L
							 * aLong5344)) * f_83_;
			aFloat5319
			    = Math.max(0.0F, Math.min(1.0F, aFloat5319));
		    }
		}
		method8018(-1933865143);
		if (method8038((byte) 90).anInt5292 * 1634130793
		    < 1634130793 * Class491.aClass491_5289.anInt5292)
		    method8117(-1366165823);
	    }
	}
    }
    
    void method8079(boolean bool) {
	aBool5347 = bool;
    }
    
    void method8080(int i) {
	if (method8038((byte) 86).anInt5292 * 1634130793
	    >= Class491.aClass491_5288.anInt5292 * 1634130793) {
	    if (method8038((byte) 105) == Class491.aClass491_5291)
		method8025(-757036643);
	    else {
		method8024((short) 1075);
		if (aFloat5319 != aFloat5342) {
		    long l = Class251.method4508((byte) 8);
		    if (l > -7502394600270799029L * aLong5343)
			aFloat5319 = aFloat5342;
		    else {
			float f = aFloat5342 - aFloat5345;
			long l_84_ = (aLong5343 * -7502394600270799029L
				      - -6539278696046782065L * aLong5344);
			float f_85_ = f / (float) l_84_;
			aFloat5319
			    = aFloat5345 + (float) (l - (-6539278696046782065L
							 * aLong5344)) * f_85_;
			aFloat5319
			    = Math.max(0.0F, Math.min(1.0F, aFloat5319));
		    }
		}
		method8018(-816920192);
		if (method8038((byte) 116).anInt5292 * 1634130793
		    < 1634130793 * Class491.aClass491_5289.anInt5292)
		    method8117(-1165122148);
	    }
	}
    }
    
    void method8081(byte i) {
	aBool5350 = true;
    }
    
    void method8082() {
	if (method8038((byte) 106).anInt5292 * 1634130793
	    >= Class491.aClass491_5288.anInt5292 * 1634130793) {
	    if (method8038((byte) 115) == Class491.aClass491_5291)
		method8025(-974928422);
	    else {
		method8024((short) 1075);
		if (aFloat5319 != aFloat5342) {
		    long l = Class251.method4508((byte) 8);
		    if (l > -7502394600270799029L * aLong5343)
			aFloat5319 = aFloat5342;
		    else {
			float f = aFloat5342 - aFloat5345;
			long l_86_ = (aLong5343 * -7502394600270799029L
				      - -6539278696046782065L * aLong5344);
			float f_87_ = f / (float) l_86_;
			aFloat5319
			    = aFloat5345 + (float) (l - (-6539278696046782065L
							 * aLong5344)) * f_87_;
			aFloat5319
			    = Math.max(0.0F, Math.min(1.0F, aFloat5319));
		    }
		}
		method8018(-871581198);
		if (method8038((byte) 97).anInt5292 * 1634130793
		    < 1634130793 * Class491.aClass491_5289.anInt5292)
		    method8117(-1331647182);
	    }
	}
    }
    
    boolean method8083(int i) {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 59);
	    return interface69.method459(i, (byte) 127);
	}
	return false;
    }
    
    void method8084() {
	synchronized (this) {
	    int i = method8087(1552651121);
	    if (aBool5306 && i > 1167824447 * anInt5329
		&& anInterface41_5327.method289()) {
		/* empty */
	    } else {
		Class376 class376 = anInterface41_5327.method281();
		if (aBool5347 && Class376.aClass376_3902 != class376) {
		    if (aByteArray5332 != null) {
			if (1261553337 * anInt5336 >= 1312400721 * anInt5348) {
			    anInterface41_5327.method56(null);
			    anInt5336 = 0;
			} else {
			    if (anInt5311 * -1154700593
				< -100055537 * anInt5300)
				anInt5311 = anInt5300 * -1040482111;
			    anInt5311
				= -1920852945 * (anInt5339 * 1435764817
						 + (anIntArray5321
						    [anInt5336 * 1261553337]));
			    int i_88_ = anIntArray5322[anInt5336 * 1261553337];
			    int i_89_ = i_88_;
			    int i_90_
				= (1435764817 * anInt5339 + i_89_ > i_88_
				   ? (anIntArray5321[anInt5336 * 1261553337]
				      + i_88_)
				   : -1154700593 * anInt5311 + i_89_);
			    Class494 class494_91_ = this;
			    class494_91_.anInt5339
				= (class494_91_.anInt5339
				   + ((i_89_ + anInt5311 * -1154700593
				       > aByteArray5332.length)
				      ? (aByteArray5332.length
					 - -1154700593 * anInt5311)
				      : i_89_) * 384975025);
			    RSBuffer class525_sub38
				= new RSBuffer(i_90_ - (anInt5311
							      * -1154700593),
						     true);
			    if (aByteArray5332 == null)
				throw new RuntimeException("");
			    if (null == class525_sub38.buffer)
				throw new RuntimeException("");
			    class525_sub38.method16614(aByteArray5332,
						       anInt5311 * -1154700593,
						       i_90_ - (-1154700593
								* anInt5311),
						       817801395);
			    anInterface41_5327.method56(class525_sub38);
			    method8005(false, 1196343330);
			    if (anInt5339 * 1435764817 >= i_88_) {
				anInt5336 += 126771081;
				anInt5339 = 0;
			    }
			}
		    } else if (anInterface58_5308 != null) {
			if (1295923039 * anInt5309 >= 1312400721 * anInt5348) {
			    anInt5309 = 0;
			    anInterface41_5327.method56(null);
			} else {
			    byte[] is
				= (anInterface58_5308.method363
				   (anIntArray5323[anInt5309 * 1295923039],
				    1566733543));
			    if (is != null) {
				RSBuffer class525_sub38
				    = new RSBuffer(is);
				class525_sub38.pos
				    = is.length * 339428471;
				anInterface41_5327.method56(class525_sub38);
				method8005(false, 942137856);
				anInt5309 += 1440081055;
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method8085() {
	if (method8038((byte) 83) != Class491.aClass491_5289
	    && (method8038((byte) 92).anInt5292 * 1634130793
		< Class491.aClass491_5288.anInt5292 * 1634130793)) {
	    method8006(Class491.aClass491_5288, -1095552769);
	    aBool5325 = true;
	    method8117(-702811104);
	    method8018(-1567487350);
	}
    }
    
    void method8086() {
	if (method8038((byte) 110) != Class491.aClass491_5289
	    && (method8038((byte) 94).anInt5292 * 1634130793
		< Class491.aClass491_5288.anInt5292 * 1634130793)) {
	    method8006(Class491.aClass491_5288, -1095552769);
	    aBool5325 = true;
	    method8117(-665849739);
	    method8018(-2058120863);
	}
    }
    
    int method8087(int i) {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 81);
	    return interface69.method444(540085170);
	}
	return 0;
    }
    
    void method8088() {
	if (method8038((byte) 83) != Class491.aClass491_5289
	    && (method8038((byte) 86).anInt5292 * 1634130793
		< Class491.aClass491_5288.anInt5292 * 1634130793)) {
	    method8006(Class491.aClass491_5288, -1095552769);
	    aBool5325 = true;
	    method8117(-1439360560);
	    method8018(-1702704511);
	}
    }
    
    void method8089() {
	if (aBool5325 == true
	    && (method8038((byte) 107).anInt5292 * 1634130793
		>= Class491.aClass491_5288.anInt5292 * 1634130793)
	    && (method8038((byte) 102).anInt5292 * 1634130793
		< Class491.aClass491_5290.anInt5292 * 1634130793)
	    && anInterface57_5326 != null && aFloat5319 == aFloat5342)
	    anInterface57_5326.method357(anObject5331, aFloatArray5304, null,
					 1684935471);
    }
    
    void method8090() {
	if (aBool5325 == true
	    && (method8038((byte) 110).anInt5292 * 1634130793
		>= Class491.aClass491_5288.anInt5292 * 1634130793)
	    && (method8038((byte) 103).anInt5292 * 1634130793
		< Class491.aClass491_5290.anInt5292 * 1634130793)
	    && anInterface57_5326 != null && aFloat5319 == aFloat5342)
	    anInterface57_5326.method357(anObject5331, aFloatArray5304, null,
					 1684935471);
    }
    
    public void method8091() {
	synchronized (this) {
	    method8080(-145881707);
	}
    }
    
    void method8092() {
	aBool5350 = false;
    }
    
    public boolean method8093(int i) {
	return aBool5341;
    }
    
    void method8094() {
	Class393 class393 = aClass372_5305.method6342(-1723564341)
				.method6398(anInt5301 * 790400699, 1863316282);
	aFloat5303
	    = class393 != null ? class393.method6487((short) 2914) : 1.0F;
	float f = null != class393 ? class393.method6485(1602821024) : 0.1F;
	f *= aFloat5319;
	float f_92_ = aFloatArray5304.length > 0 ? 0.0F : 1.0F;
	for (int i = 0; i < aFloatArray5304.length; i++) {
	    if (aFloatArray5304[i] > f_92_)
		f_92_ = aFloatArray5304[i];
	}
	f *= f_92_;
	if (!method8017(-1692285687))
	    f = -1.0F;
	if (method8019(1549809047) != f) {
	    method8020(f, -211741423);
	    aBool5341 = true;
	}
    }
    
    public void method8095() {
	if ((method8038((byte) 94).anInt5292 * 1634130793
	     >= Class491.aClass491_5288.anInt5292 * 1634130793)
	    && (method8038((byte) 106).anInt5292 * 1634130793
		< Class491.aClass491_5289.anInt5292 * 1634130793)
	    && method8017(2032032512)) {
	    synchronized (this) {
		anInterface41_5327.method282();
		method8031(1738918292);
	    }
	    Thread.yield();
	}
    }
    
    boolean method8096(int i) {
	return Class491.aClass491_5289 == aClass491_5338;
    }
    
    void method8097(boolean bool) {
	aBool5347 = bool;
    }
    
    public void method8098() {
	if ((method8038((byte) 116).anInt5292 * 1634130793
	     >= Class491.aClass491_5288.anInt5292 * 1634130793)
	    && (method8038((byte) 97).anInt5292 * 1634130793
		< Class491.aClass491_5289.anInt5292 * 1634130793)
	    && method8017(18133951)) {
	    synchronized (this) {
		anInterface41_5327.method282();
		method8031(1979750506);
	    }
	    Thread.yield();
	}
    }
    
    public Class494(Class477 class477, int i, int i_93_,
		    Interface41 interface41, Class372 class372) {
	anInt5329 = 0;
	anInt5349 = 0;
	aClass372_5305 = class372;
	method8006(Class491.aClass491_5284, -1095552769);
	anInt5312 = 1712168983 * i;
	anInt5330 = -1851073627 * i_93_;
	anInterface41_5327 = interface41;
	anInt5314 = 0;
	aBool5347 = false;
	anInterface41_5327.method316(new Class484(this));
	method8058(-336970904);
    }
    
    boolean method8099(int i) {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 56);
	    return interface69.method459(i, (byte) 127);
	}
	return false;
    }
    
    void method8100(byte[] is, int i, int i_94_) {
	int i_95_ = i;
	int i_96_ = 0;
	int i_97_ = anInterface41_5327.method290().anInt4107 * -1339941795;
	while (i_95_ < is.length && i_95_ < i_94_) {
	    float f = aFloatArray5304[i_96_] * (aFloat5319 * aFloat5303);
	    if (16 == i_97_) {
		int i_98_ = (is[i_95_] & 0xff) + (is[i_95_ + 1] << 8);
		i_98_ *= f * f;
		is[i_95_++] = (byte) i_98_;
		is[i_95_++] = (byte) (i_98_ >> 8);
	    } else if (8 == i_97_) {
		byte i_99_ = is[i_95_];
		i_99_ *= f;
		is[i_95_++] = i_99_;
	    } else
		throw new RuntimeException("");
	    i_96_ = ++i_96_ % aFloatArray5304.length;
	}
    }
    
    boolean method8101(int i) {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 46);
	    return interface69.method459(i, (byte) 127);
	}
	return false;
    }
    
    int method8102() {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 19);
	    return interface69.method444(540085170);
	}
	return 0;
    }
    
    void method8103(RSBuffer class525_sub38) {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 77);
	    byte[] is = new byte[class525_sub38.pos * -1133521593];
	    System.arraycopy(class525_sub38.buffer, 0, is, 0,
			     class525_sub38.pos * -1133521593);
	    RSBuffer class525_sub38_100_ = new RSBuffer(is);
	    class525_sub38_100_.pos = class525_sub38.pos * 1;
	    interface69.method443(class525_sub38_100_, -1710354169);
	}
    }
    
    void method8104(RSBuffer class525_sub38) {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 52);
	    byte[] is = new byte[class525_sub38.pos * -1133521593];
	    System.arraycopy(class525_sub38.buffer, 0, is, 0,
			     class525_sub38.pos * -1133521593);
	    RSBuffer class525_sub38_101_ = new RSBuffer(is);
	    class525_sub38_101_.pos = class525_sub38.pos * 1;
	    interface69.method443(class525_sub38_101_, -2112698867);
	}
    }
    
    void method8105(RSBuffer class525_sub38) {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 70);
	    byte[] is = new byte[class525_sub38.pos * -1133521593];
	    System.arraycopy(class525_sub38.buffer, 0, is, 0,
			     class525_sub38.pos * -1133521593);
	    RSBuffer class525_sub38_102_ = new RSBuffer(is);
	    class525_sub38_102_.pos = class525_sub38.pos * 1;
	    interface69.method443(class525_sub38_102_, -1418475253);
	}
    }
    
    RSBuffer method8106(int i) {
	if (null != anObject5331 && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 65);
	    RSBuffer class525_sub38
		= interface69.method441(i, -1163294422);
	    RSBuffer class525_sub38_103_
		= new RSBuffer(class525_sub38.pos * -1133521593,
				     true);
	    class525_sub38_103_.method16646(class525_sub38, 1354428159);
	    return class525_sub38_103_;
	}
	return null;
    }
    
    RSBuffer method8107(int i) {
	if (null != anObject5331 && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 85);
	    RSBuffer class525_sub38
		= interface69.method441(i, -1163294422);
	    RSBuffer class525_sub38_104_
		= new RSBuffer(class525_sub38.pos * -1133521593,
				     true);
	    class525_sub38_104_.method16646(class525_sub38, -112995347);
	    return class525_sub38_104_;
	}
	return null;
    }
    
    RSBuffer method8108(int i) {
	if (null != anObject5331 && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 16);
	    RSBuffer class525_sub38
		= interface69.method441(i, -1163294422);
	    RSBuffer class525_sub38_105_
		= new RSBuffer(class525_sub38.pos * -1133521593,
				     true);
	    class525_sub38_105_.method16646(class525_sub38, -350131398);
	    return class525_sub38_105_;
	}
	return null;
    }
    
    public void method8109(byte i) {
	synchronized (this) {
	    if (method8038((byte) 94) == Class491.aClass491_5289
		|| (method8038((byte) 116).anInt5292 * 1634130793
		    < 1634130793 * Class491.aClass491_5285.anInt5292)) {
		/* empty */
	    } else
		method8006(Class491.aClass491_5289, -1095552769);
	}
    }
    
    float method8110() {
	return aFloat5319;
    }
    
    boolean method8111() {
	return Class491.aClass491_5290 == aClass491_5338;
    }
    
    float method8112() {
	return aFloat5319;
    }
    
    void method8113() {
	synchronized (this) {
	    int i = method8087(1552651121);
	    if (aBool5306 && i > 1167824447 * anInt5329
		&& anInterface41_5327.method289()) {
		/* empty */
	    } else {
		Class376 class376 = anInterface41_5327.method281();
		if (aBool5347 && Class376.aClass376_3902 != class376) {
		    if (aByteArray5332 != null) {
			if (1261553337 * anInt5336 >= 1312400721 * anInt5348) {
			    anInterface41_5327.method56(null);
			    anInt5336 = 0;
			} else {
			    if (anInt5311 * -1154700593
				< -100055537 * anInt5300)
				anInt5311 = anInt5300 * -1040482111;
			    anInt5311
				= -1920852945 * (anInt5339 * 1435764817
						 + (anIntArray5321
						    [anInt5336 * 1261553337]));
			    int i_106_
				= anIntArray5322[anInt5336 * 1261553337];
			    int i_107_ = i_106_;
			    int i_108_
				= (1435764817 * anInt5339 + i_107_ > i_106_
				   ? (anIntArray5321[anInt5336 * 1261553337]
				      + i_106_)
				   : -1154700593 * anInt5311 + i_107_);
			    Class494 class494_109_ = this;
			    class494_109_.anInt5339
				= (class494_109_.anInt5339
				   + ((i_107_ + anInt5311 * -1154700593
				       > aByteArray5332.length)
				      ? (aByteArray5332.length
					 - -1154700593 * anInt5311)
				      : i_107_) * 384975025);
			    RSBuffer class525_sub38
				= new RSBuffer(i_108_ - (anInt5311
							       * -1154700593),
						     true);
			    if (aByteArray5332 == null)
				throw new RuntimeException("");
			    if (null == class525_sub38.buffer)
				throw new RuntimeException("");
			    class525_sub38.method16614(aByteArray5332,
						       anInt5311 * -1154700593,
						       i_108_ - (-1154700593
								 * anInt5311),
						       1573682122);
			    anInterface41_5327.method56(class525_sub38);
			    method8005(false, 2090242998);
			    if (anInt5339 * 1435764817 >= i_106_) {
				anInt5336 += 126771081;
				anInt5339 = 0;
			    }
			}
		    } else if (anInterface58_5308 != null) {
			if (1295923039 * anInt5309 >= 1312400721 * anInt5348) {
			    anInt5309 = 0;
			    anInterface41_5327.method56(null);
			} else {
			    byte[] is
				= (anInterface58_5308.method363
				   (anIntArray5323[anInt5309 * 1295923039],
				    2002593167));
			    if (is != null) {
				RSBuffer class525_sub38
				    = new RSBuffer(is);
				class525_sub38.pos
				    = is.length * 339428471;
				anInterface41_5327.method56(class525_sub38);
				method8005(false, 1561199917);
				anInt5309 += 1440081055;
			    }
			}
		    }
		}
	    }
	}
    }
    
    int method8114() {
	if (anObject5331 != null && anObject5331 instanceof Class488) {
	    Class488 class488 = (Class488) anObject5331;
	    Interface69 interface69 = class488.method7897((byte) 44);
	    return interface69.method444(540085170);
	}
	return 0;
    }
    
    void method8115() {
	if (method8038((byte) 90) != Class491.aClass491_5289
	    && (method8038((byte) 120).anInt5292 * 1634130793
		< Class491.aClass491_5288.anInt5292 * 1634130793)) {
	    method8006(Class491.aClass491_5288, -1095552769);
	    aBool5325 = true;
	    method8117(-1494045431);
	    method8018(-993506860);
	}
    }
    
    public void method8116() {
	if ((method8038((byte) 97).anInt5292 * 1634130793
	     >= Class491.aClass491_5288.anInt5292 * 1634130793)
	    && (method8038((byte) 96).anInt5292 * 1634130793
		< Class491.aClass491_5289.anInt5292 * 1634130793)
	    && method8017(-457891642)) {
	    synchronized (this) {
		anInterface41_5327.method282();
		method8031(1063279339);
	    }
	    Thread.yield();
	}
    }
    
    void method8117(int i) {
	if (aBool5325 == true
	    && (method8038((byte) 117).anInt5292 * 1634130793
		>= Class491.aClass491_5288.anInt5292 * 1634130793)
	    && (method8038((byte) 87).anInt5292 * 1634130793
		< Class491.aClass491_5290.anInt5292 * 1634130793)
	    && anInterface57_5326 != null && aFloat5319 == aFloat5342)
	    anInterface57_5326.method357(anObject5331, aFloatArray5304, null,
					 1684935471);
    }
    
    void method8118() {
	synchronized (this) {
	    int i = method8087(1552651121);
	    if (aBool5306 && i > 1167824447 * anInt5329
		&& anInterface41_5327.method289()) {
		/* empty */
	    } else {
		Class376 class376 = anInterface41_5327.method281();
		if (aBool5347 && Class376.aClass376_3902 != class376) {
		    if (aByteArray5332 != null) {
			if (1261553337 * anInt5336 >= 1312400721 * anInt5348) {
			    anInterface41_5327.method56(null);
			    anInt5336 = 0;
			} else {
			    if (anInt5311 * -1154700593
				< -100055537 * anInt5300)
				anInt5311 = anInt5300 * -1040482111;
			    anInt5311
				= -1920852945 * (anInt5339 * 1435764817
						 + (anIntArray5321
						    [anInt5336 * 1261553337]));
			    int i_110_
				= anIntArray5322[anInt5336 * 1261553337];
			    int i_111_ = i_110_;
			    int i_112_
				= (1435764817 * anInt5339 + i_111_ > i_110_
				   ? (anIntArray5321[anInt5336 * 1261553337]
				      + i_110_)
				   : -1154700593 * anInt5311 + i_111_);
			    Class494 class494_113_ = this;
			    class494_113_.anInt5339
				= (class494_113_.anInt5339
				   + ((i_111_ + anInt5311 * -1154700593
				       > aByteArray5332.length)
				      ? (aByteArray5332.length
					 - -1154700593 * anInt5311)
				      : i_111_) * 384975025);
			    RSBuffer class525_sub38
				= new RSBuffer(i_112_ - (anInt5311
							       * -1154700593),
						     true);
			    if (aByteArray5332 == null)
				throw new RuntimeException("");
			    if (null == class525_sub38.buffer)
				throw new RuntimeException("");
			    class525_sub38.method16614(aByteArray5332,
						       anInt5311 * -1154700593,
						       i_112_ - (-1154700593
								 * anInt5311),
						       -636614803);
			    anInterface41_5327.method56(class525_sub38);
			    method8005(false, 348242940);
			    if (anInt5339 * 1435764817 >= i_110_) {
				anInt5336 += 126771081;
				anInt5339 = 0;
			    }
			}
		    } else if (anInterface58_5308 != null) {
			if (1295923039 * anInt5309 >= 1312400721 * anInt5348) {
			    anInt5309 = 0;
			    anInterface41_5327.method56(null);
			} else {
			    byte[] is
				= (anInterface58_5308.method363
				   (anIntArray5323[anInt5309 * 1295923039],
				    2041855512));
			    if (is != null) {
				RSBuffer class525_sub38
				    = new RSBuffer(is);
				class525_sub38.pos
				    = is.length * 339428471;
				anInterface41_5327.method56(class525_sub38);
				method8005(false, 1452494141);
				anInt5309 += 1440081055;
			    }
			}
		    }
		}
	    }
	}
    }
    
    boolean method8119() {
	synchronized (this) {
	    if (null != anObject5331 && anObject5331 instanceof Class488) {
		Class488 class488 = (Class488) anObject5331;
		Interface69 interface69 = class488.method7897((byte) 10);
		if (null != interface69) {
		    boolean bool = interface69.method477(-1001329866);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    void method8120() {
	synchronized (this) {
	    if (anObject5331 != null && anObject5331 instanceof Class488) {
		Class488 class488 = (Class488) anObject5331;
		Interface69 interface69 = class488.method7897((byte) 58);
		if (interface69 != null)
		    interface69.method461(true, -2096144633);
	    }
	}
    }
    
    void method8121() {
	synchronized (this) {
	    if (anObject5331 != null && anObject5331 instanceof Class488) {
		Class488 class488 = (Class488) anObject5331;
		Interface69 interface69 = class488.method7897((byte) 96);
		if (interface69 != null)
		    interface69.method461(true, -2135063227);
	    }
	}
    }
    
    Object method8122() {
	return anObject5331;
    }
    
    Object method8123() {
	return anObject5331;
    }
    
    Object method8124() {
	return anObject5331;
    }
    
    void method8125() {
	synchronized (this) {
	    aByteArray5332 = null;
	    anInt5301 = 0;
	    aFloat5319 = 0.0F;
	    aFloat5303 = 0.0F;
	    aBool5328 = false;
	    anInt5324 = 0;
	    aFloat5307 = 1.0F;
	    anInterface58_5308 = null;
	    anInt5309 = 0;
	    anInt5311 = 0;
	    if (aClass481Array5313 != null) {
		for (int i = 0; i < aClass481Array5313.length; i++) {
		    if (aClass481Array5313[i] != null)
			aClass481Array5313[i].method7827(-542759085);
		}
	    }
	    aClass481Array5313 = null;
	    aBool5306 = false;
	    anInt5314 = 0;
	    anInt5316 = 0;
	    anInt5317 = 0;
	    anInt5318 = 0;
	    anInt5310 = 0;
	    anInt5348 = 0;
	    anIntArray5321 = null;
	    anIntArray5322 = null;
	    anIntArray5323 = null;
	    anInt5300 = 0;
	    aBool5325 = false;
	    anInterface41_5327.method285();
	    aBool5347 = false;
	    anInterface57_5326 = null;
	    anObject5331 = null;
	    anInt5302 = 0;
	    anInt5333 = 0;
	    anInt5334 = 0;
	    aBool5335 = false;
	    anInt5336 = 0;
	    anInt5337 = 0;
	    aBool5346 = false;
	    anInt5339 = 0;
	    method8020(-1.0F, -1148004089);
	    aBool5341 = false;
	    aFloat5342 = 0.0F;
	    aLong5343 = 0L;
	    aLong5344 = 0L;
	    aFloat5345 = 0.0F;
	    anInt5329 = 0;
	    anInt5349 = 0;
	}
    }
    
    void method8126() {
	synchronized (this) {
	    aByteArray5332 = null;
	    anInt5301 = 0;
	    aFloat5319 = 0.0F;
	    aFloat5303 = 0.0F;
	    aBool5328 = false;
	    anInt5324 = 0;
	    aFloat5307 = 1.0F;
	    anInterface58_5308 = null;
	    anInt5309 = 0;
	    anInt5311 = 0;
	    if (aClass481Array5313 != null) {
		for (int i = 0; i < aClass481Array5313.length; i++) {
		    if (aClass481Array5313[i] != null)
			aClass481Array5313[i].method7827(-880123067);
		}
	    }
	    aClass481Array5313 = null;
	    aBool5306 = false;
	    anInt5314 = 0;
	    anInt5316 = 0;
	    anInt5317 = 0;
	    anInt5318 = 0;
	    anInt5310 = 0;
	    anInt5348 = 0;
	    anIntArray5321 = null;
	    anIntArray5322 = null;
	    anIntArray5323 = null;
	    anInt5300 = 0;
	    aBool5325 = false;
	    anInterface41_5327.method285();
	    aBool5347 = false;
	    anInterface57_5326 = null;
	    anObject5331 = null;
	    anInt5302 = 0;
	    anInt5333 = 0;
	    anInt5334 = 0;
	    aBool5335 = false;
	    anInt5336 = 0;
	    anInt5337 = 0;
	    aBool5346 = false;
	    anInt5339 = 0;
	    method8020(-1.0F, -901039307);
	    aBool5341 = false;
	    aFloat5342 = 0.0F;
	    aLong5343 = 0L;
	    aLong5344 = 0L;
	    aFloat5345 = 0.0F;
	    anInt5329 = 0;
	    anInt5349 = 0;
	}
    }
    
    static void method8127(Class683 class683, int i) {
	class683.anIntArray8661[class683.anInt8662 * 501271953 - 1]
	    = (((Class269)
		Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						      [((501271953
							 * class683.anInt8662)
							- 1)]),
						     731564562)).anInt2818
	       * -282689705);
    }
}
