/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class295 implements Runnable
{
    Interface32 anInterface32_3243 = new Class292();
    boolean aBool3244;
    String aString3245;
    String aString3246;
    long aLong3247;
    int anInt3248;
    Class303 aClass303_3249;
    volatile boolean aBool3250;
    long aLong3251;
    int anInt3252;
    Interface32 anInterface32_3253 = null;
    
    int method5315(short i) {
	return -443122033 * anInt3248;
    }
    
    public long method5316() {
	return aLong3251 * -8032362087629447145L;
    }
    
    synchronized void method5317(int i) {
	aBool3244 = true;
    }
    
    synchronized boolean method5318(byte i) {
	return anInterface32_3243.method198(aLong3247 * -2454604180582803625L);
    }
    
    synchronized void method5319(Interface32 interface32, int i) {
	anInterface32_3253 = anInterface32_3243;
	anInterface32_3243 = interface32;
	aLong3247 = Class251.method4508((byte) 8) * 4100302134587720807L;
    }
    
    int method5320() {
	return -443122033 * anInt3248;
    }
    
    public int method5321(short i) {
	if (null == aClass303_3249)
	    return 0;
	int i_0_ = aClass303_3249.anInt3399 * -631431271;
	if (aClass303_3249.aBool3405
	    && anInt3252 * -904484357 < aClass303_3249.anInt3403 * 1113563215)
	    return 1 + anInt3252 * -904484357;
	if (i_0_ < 0 || i_0_ >= Class328.aClass303Array3578.length - 1)
	    return 100;
	if (aClass303_3249.anInt3385 * 1474421939 == anInt3252 * -904484357)
	    return 1113563215 * aClass303_3249.anInt3403;
	return aClass303_3249.anInt3385 * 1474421939;
    }
    
    public void run() {
	while (!aBool3250) {
	    long l = Class251.method4508((byte) 8);
	    synchronized (this) {
		try {
		    anInt3248 += 736026735;
		    if (anInterface32_3243 instanceof Class292)
			anInterface32_3243.method194(aBool3244, 1452591033);
		    else {
			long l_1_ = Class251.method4508((byte) 8);
			if (null != Class501.aClass182_5564
			    && null != anInterface32_3253
			    && anInterface32_3253.method190(-230022946) != 0
			    && (-2454604180582803625L * aLong3247
				>= l_1_ - (long) anInterface32_3253
						     .method190(1836663570))) {
			    int i
				= (int) ((l_1_
					  - -2454604180582803625L * aLong3247)
					 * 255L
					 / (long) anInterface32_3253
						      .method190(-126255464));
			    int i_2_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_2_ = i_2_ << 24 | 0xffffff;
			    Class275.method5104((byte) -27);
			    Class501.aClass182_5564.method3188(1, 0);
			    Class157 class157
				= (Class501.aClass182_5564.method3212
				   (-1445589163 * Class434.anInt4827,
				    -1883654023 * Class696_Sub47.anInt11032,
				    true, 1708064337));
			    Class168_Sub2 class168_sub2
				= Class501.aClass182_5564.method3314();
			    class168_sub2.method15585(0,
						      class157.method2521());
			    Class501.aClass182_5564.method3158(class168_sub2,
							       -1166817212);
			    anInterface32_3253.method194(true, 1452591033);
			    Class501.aClass182_5564.method3159(class168_sub2,
							       -1876999470);
			    class157.method2479(0, 0, 0, i_2_, 1);
			    Class501.aClass182_5564.method3158(class168_sub2,
							       -1166817212);
			    Class501.aClass182_5564.method3188(1, 0);
			    anInterface32_3243.method194(true, 1452591033);
			    Class501.aClass182_5564.method3159(class168_sub2,
							       -1876999470);
			    class157.method2479(0, 0, 0, i, 1);
			} else {
			    if (anInterface32_3253 != null) {
				aBool3244 = true;
				anInterface32_3253.method188(-2068321084);
				anInterface32_3253 = null;
			    }
			    if (aBool3244) {
				Class275.method5104((byte) -122);
				if (Class501.aClass182_5564 != null)
				    Class501.aClass182_5564.method3188(1, 0);
			    }
			    anInterface32_3243.method194
				(aBool3244 || (null != Class501.aClass182_5564
					       && Class501.aClass182_5564
						      .method3139()),
				 1452591033);
			}
			try {
			    if (Class501.aClass182_5564 != null
				&& !(anInterface32_3243 instanceof Class292))
				Class501.aClass182_5564.method3357(65535);
			} catch (Exception_Sub4 exception_sub4) {
			    Class525_Sub16_Sub13.method18448
				(new StringBuilder().append
				     (exception_sub4.getMessage()).append
				     (Class327.aclient3575
					  .method8215(-16711936))
				     .toString(),
				 exception_sub4, (byte) 83);
			    Class217.method4146(0, true, (byte) 104);
			}
		    }
		    aBool3244 = false;
		    if (Class501.aClass182_5564 != null
			&& !(anInterface32_3243 instanceof Class292)
			&& (aClass303_3249.anInt3399 * -631431271
			    < Class303.aClass303_3396.anInt3399 * -631431271))
			Class219.method4202(754476373);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_3_ = Class251.method4508((byte) 8);
	    int i = (int) (20L - (l_3_ - l));
	    if (i > 0)
		Class229.method4381((long) i);
	}
    }
    
    void method5322() {
	aBool3250 = true;
    }
    
    synchronized void method5323(long l, String string, String string_4_,
				 int i, Class303 class303) {
	aLong3251 = l * -2690177414451488857L;
	aString3245 = string;
	aString3246 = string_4_;
	anInt3252 = 1824913715 * i;
	aClass303_3249 = class303;
    }
    
    public long method5324(byte i) {
	return aLong3251 * -8032362087629447145L;
    }
    
    public int method5325() {
	return anInt3252 * -904484357;
    }
    
    public int method5326(int i) {
	return anInt3252 * -904484357;
    }
    
    public String method5327(int i) {
	return aString3246;
    }
    
    public void method5328() {
	while (!aBool3250) {
	    long l = Class251.method4508((byte) 8);
	    synchronized (this) {
		try {
		    anInt3248 += 736026735;
		    if (anInterface32_3243 instanceof Class292)
			anInterface32_3243.method194(aBool3244, 1452591033);
		    else {
			long l_5_ = Class251.method4508((byte) 8);
			if (null != Class501.aClass182_5564
			    && null != anInterface32_3253
			    && anInterface32_3253.method190(1872971194) != 0
			    && (-2454604180582803625L * aLong3247
				>= l_5_ - (long) anInterface32_3253
						     .method190(646923990))) {
			    int i
				= (int) ((l_5_
					  - -2454604180582803625L * aLong3247)
					 * 255L
					 / (long) anInterface32_3253
						      .method190(-521369903));
			    int i_6_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_6_ = i_6_ << 24 | 0xffffff;
			    Class275.method5104((byte) -128);
			    Class501.aClass182_5564.method3188(1, 0);
			    Class157 class157
				= (Class501.aClass182_5564.method3212
				   (-1445589163 * Class434.anInt4827,
				    -1883654023 * Class696_Sub47.anInt11032,
				    true, 717531711));
			    Class168_Sub2 class168_sub2
				= Class501.aClass182_5564.method3314();
			    class168_sub2.method15585(0,
						      class157.method2521());
			    Class501.aClass182_5564.method3158(class168_sub2,
							       -1166817212);
			    anInterface32_3253.method194(true, 1452591033);
			    Class501.aClass182_5564.method3159(class168_sub2,
							       -1876999470);
			    class157.method2479(0, 0, 0, i_6_, 1);
			    Class501.aClass182_5564.method3158(class168_sub2,
							       -1166817212);
			    Class501.aClass182_5564.method3188(1, 0);
			    anInterface32_3243.method194(true, 1452591033);
			    Class501.aClass182_5564.method3159(class168_sub2,
							       -1876999470);
			    class157.method2479(0, 0, 0, i, 1);
			} else {
			    if (anInterface32_3253 != null) {
				aBool3244 = true;
				anInterface32_3253.method188(-2042139906);
				anInterface32_3253 = null;
			    }
			    if (aBool3244) {
				Class275.method5104((byte) -85);
				if (Class501.aClass182_5564 != null)
				    Class501.aClass182_5564.method3188(1, 0);
			    }
			    anInterface32_3243.method194
				(aBool3244 || (null != Class501.aClass182_5564
					       && Class501.aClass182_5564
						      .method3139()),
				 1452591033);
			}
			try {
			    if (Class501.aClass182_5564 != null
				&& !(anInterface32_3243 instanceof Class292))
				Class501.aClass182_5564.method3357(65535);
			} catch (Exception_Sub4 exception_sub4) {
			    Class525_Sub16_Sub13.method18448
				(new StringBuilder().append
				     (exception_sub4.getMessage()).append
				     (Class327.aclient3575
					  .method8215(-16711936))
				     .toString(),
				 exception_sub4, (byte) 119);
			    Class217.method4146(0, true, (byte) -52);
			}
		    }
		    aBool3244 = false;
		    if (Class501.aClass182_5564 != null
			&& !(anInterface32_3243 instanceof Class292)
			&& (aClass303_3249.anInt3399 * -631431271
			    < Class303.aClass303_3396.anInt3399 * -631431271))
			Class219.method4202(754476373);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_7_ = Class251.method4508((byte) 8);
	    int i = (int) (20L - (l_7_ - l));
	    if (i > 0)
		Class229.method4381((long) i);
	}
    }
    
    synchronized void method5329(long l, String string, String string_8_,
				 int i, Class303 class303) {
	aLong3251 = l * -2690177414451488857L;
	aString3245 = string;
	aString3246 = string_8_;
	anInt3252 = 1824913715 * i;
	aClass303_3249 = class303;
    }
    
    synchronized boolean method5330() {
	return anInterface32_3243.method198(aLong3247 * -2454604180582803625L);
    }
    
    public String method5331(int i) {
	return aString3245;
    }
    
    public Class303 method5332(int i) {
	return aClass303_3249;
    }
    
    synchronized void method5333(Interface32 interface32) {
	anInterface32_3253 = anInterface32_3243;
	anInterface32_3243 = interface32;
	aLong3247 = Class251.method4508((byte) 8) * 4100302134587720807L;
    }
    
    synchronized void method5334(Interface32 interface32) {
	anInterface32_3253 = anInterface32_3243;
	anInterface32_3243 = interface32;
	aLong3247 = Class251.method4508((byte) 8) * 4100302134587720807L;
    }
    
    Class295() {
	/* empty */
    }
    
    synchronized void method5335(long l, String string, String string_9_,
				 int i, Class303 class303) {
	aLong3251 = l * -2690177414451488857L;
	aString3245 = string;
	aString3246 = string_9_;
	anInt3252 = 1824913715 * i;
	aClass303_3249 = class303;
    }
    
    synchronized void method5336(Interface32 interface32) {
	anInterface32_3253 = anInterface32_3243;
	anInterface32_3243 = interface32;
	aLong3247 = Class251.method4508((byte) 8) * 4100302134587720807L;
    }
    
    public int method5337() {
	if (null == aClass303_3249)
	    return 0;
	int i = aClass303_3249.anInt3399 * -631431271;
	if (aClass303_3249.aBool3405
	    && anInt3252 * -904484357 < aClass303_3249.anInt3403 * 1113563215)
	    return 1 + anInt3252 * -904484357;
	if (i < 0 || i >= Class328.aClass303Array3578.length - 1)
	    return 100;
	if (aClass303_3249.anInt3385 * 1474421939 == anInt3252 * -904484357)
	    return 1113563215 * aClass303_3249.anInt3403;
	return aClass303_3249.anInt3385 * 1474421939;
    }
    
    public int method5338() {
	return anInt3252 * -904484357;
    }
    
    public int method5339() {
	return anInt3252 * -904484357;
    }
    
    public int method5340() {
	return anInt3252 * -904484357;
    }
    
    synchronized void method5341(long l, String string, String string_10_,
				 int i, Class303 class303, int i_11_) {
	aLong3251 = l * -2690177414451488857L;
	aString3245 = string;
	aString3246 = string_10_;
	anInt3252 = 1824913715 * i;
	aClass303_3249 = class303;
    }
    
    public String method5342() {
	return aString3246;
    }
    
    public String method5343() {
	return aString3246;
    }
    
    public String method5344() {
	return aString3245;
    }
    
    public long method5345() {
	return aLong3251 * -8032362087629447145L;
    }
    
    void method5346(byte i) {
	aBool3250 = true;
    }
    
    public Class303 method5347() {
	return aClass303_3249;
    }
    
    synchronized void method5348(long l, String string, String string_12_,
				 int i, Class303 class303) {
	aLong3251 = l * -2690177414451488857L;
	aString3245 = string;
	aString3246 = string_12_;
	anInt3252 = 1824913715 * i;
	aClass303_3249 = class303;
    }
    
    void method5349() {
	aBool3250 = true;
    }
    
    void method5350() {
	aBool3250 = true;
    }
    
    void method5351() {
	aBool3250 = true;
    }
    
    public static Class298 method5352(int i, int i_13_) {
	if (i == Class298.aClass298_3276.anInt3283 * 1520077733)
	    return Class298.aClass298_3276;
	if (i == 1520077733 * Class298.aClass298_3278.anInt3283)
	    return Class298.aClass298_3278;
	if (i == Class298.aClass298_3277.anInt3283 * 1520077733)
	    return Class298.aClass298_3277;
	if (i == 1520077733 * Class298.aClass298_3275.anInt3283)
	    return Class298.aClass298_3275;
	if (i == Class298.aClass298_3279.anInt3283 * 1520077733)
	    return Class298.aClass298_3279;
	if (i == 1520077733 * Class298.aClass298_3280.anInt3283)
	    return Class298.aClass298_3280;
	if (i == Class298.aClass298_3281.anInt3283 * 1520077733)
	    return Class298.aClass298_3281;
	return null;
    }
}
