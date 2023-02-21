/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.io.IOException;

public class Class37
{
    Class42 aClass42_312;
    long aLong313;
    byte[] aByteArray314;
    static final int anInt315 = 200000000;
    long aLong316 = -6744637479511064987L;
    byte[] aByteArray317;
    long aLong318 = 247470929236331083L;
    int anInt319 = 0;
    int anInt320;
    long aLong321;
    long aLong322;
    long aLong323;
    
    void method981(short i) throws IOException {
	if (-1L != 3009843318297006237L * aLong318) {
	    if (5039147490863018429L * aLong323
		!= 3009843318297006237L * aLong318) {
		aClass42_312.method1045(aLong318 * 3009843318297006237L);
		aLong323 = -7863737236105013151L * aLong318;
	    }
	    aClass42_312.method1051(aByteArray317, 0, -2044127933 * anInt319,
				    1200527322);
	    aLong323 += (long) anInt319 * 2862865475914502911L;
	    if (5039147490863018429L * aLong323
		> aLong313 * 5439774983646745515L)
		aLong313 = aLong323 * 5241546317141125175L;
	    long l = -1L;
	    long l_0_ = -1L;
	    if ((3009843318297006237L * aLong318
		 >= aLong316 * 7170290958735867027L)
		&& (3009843318297006237L * aLong318
		    < (aLong316 * 7170290958735867027L
		       + (long) (anInt320 * -1797476153))))
		l = 3009843318297006237L * aLong318;
	    else if ((7170290958735867027L * aLong316
		      >= 3009843318297006237L * aLong318)
		     && (aLong316 * 7170290958735867027L
			 < ((long) (-2044127933 * anInt319)
			    + aLong318 * 3009843318297006237L)))
		l = aLong316 * 7170290958735867027L;
	    if ((aLong318 * 3009843318297006237L + (long) (-2044127933
							   * anInt319)
		 > aLong316 * 7170290958735867027L)
		&& (((long) (anInt319 * -2044127933)
		     + 3009843318297006237L * aLong318)
		    <= ((long) (-1797476153 * anInt320)
			+ 7170290958735867027L * aLong316)))
		l_0_ = ((long) (anInt319 * -2044127933)
			+ aLong318 * 3009843318297006237L);
	    else if ((((long) (-1797476153 * anInt320)
		       + aLong316 * 7170290958735867027L)
		      > aLong318 * 3009843318297006237L)
		     && ((aLong316 * 7170290958735867027L
			  + (long) (anInt320 * -1797476153))
			 <= ((long) (anInt319 * -2044127933)
			     + 3009843318297006237L * aLong318)))
		l_0_ = ((long) (anInt320 * -1797476153)
			+ aLong316 * 7170290958735867027L);
	    if (l > -1L && l_0_ > l) {
		int i_1_ = (int) (l_0_ - l);
		System.arraycopy(aByteArray317,
				 (int) (l - 3009843318297006237L * aLong318),
				 aByteArray314,
				 (int) (l - aLong316 * 7170290958735867027L),
				 i_1_);
	    }
	    aLong318 = 247470929236331083L;
	    anInt319 = 0;
	}
    }
    
    public void method982(int i) throws IOException {
	method981((short) 20807);
	aClass42_312.method1047(270272883);
    }
    
    public void method983(byte[] is, int i, int i_2_, int i_3_)
	throws IOException {
	try {
	    if (i_2_ + i > is.length)
		throw new ArrayIndexOutOfBoundsException(i_2_ + i - is.length);
	    if (aLong318 * 3009843318297006237L != -1L
		&& (aLong321 * 2450946469107952811L
		    >= 3009843318297006237L * aLong318)
		&& ((long) i_2_ + aLong321 * 2450946469107952811L
		    <= (aLong318 * 3009843318297006237L
			+ (long) (-2044127933 * anInt319)))) {
		System.arraycopy(aByteArray317,
				 (int) (aLong321 * 2450946469107952811L
					- aLong318 * 3009843318297006237L),
				 is, i, i_2_);
		aLong321 += (long) i_2_ * -4890945727689970173L;
		return;
	    }
	    long l = aLong321 * 2450946469107952811L;
	    int i_4_ = i;
	    int i_5_ = i_2_;
	    if ((aLong321 * 2450946469107952811L
		 >= 7170290958735867027L * aLong316)
		&& (2450946469107952811L * aLong321
		    < ((long) (anInt320 * -1797476153)
		       + 7170290958735867027L * aLong316))) {
		int i_6_ = (int) ((long) (anInt320 * -1797476153)
				  - (aLong321 * 2450946469107952811L
				     - 7170290958735867027L * aLong316));
		if (i_6_ > i_2_)
		    i_6_ = i_2_;
		System.arraycopy(aByteArray314,
				 (int) (aLong321 * 2450946469107952811L
					- aLong316 * 7170290958735867027L),
				 is, i, i_6_);
		aLong321 += -4890945727689970173L * (long) i_6_;
		i += i_6_;
		i_2_ -= i_6_;
	    }
	    if (i_2_ > aByteArray314.length) {
		aClass42_312.method1045(2450946469107952811L * aLong321);
		aLong323 = 2903716523057076871L * aLong321;
		int i_7_;
		for (/**/; i_2_ > 0; i_2_ -= i_7_) {
		    i_7_ = aClass42_312.method1049(is, i, i_2_, (byte) 39);
		    if (-1 == i_7_)
			break;
		    aLong323 += -3584494261199384171L * (long) i_7_;
		    aLong321 += (long) i_7_ * -4890945727689970173L;
		    i += i_7_;
		}
	    } else if (i_2_ > 0) {
		method1000((byte) 7);
		int i_8_ = i_2_;
		if (i_8_ > anInt320 * -1797476153)
		    i_8_ = anInt320 * -1797476153;
		System.arraycopy(aByteArray314, 0, is, i, i_8_);
		i += i_8_;
		i_2_ -= i_8_;
		aLong321 += -4890945727689970173L * (long) i_8_;
	    }
	    if (-1L != aLong318 * 3009843318297006237L) {
		if ((aLong318 * 3009843318297006237L
		     > aLong321 * 2450946469107952811L)
		    && i_2_ > 0) {
		    int i_9_ = i + (int) (aLong318 * 3009843318297006237L
					  - 2450946469107952811L * aLong321);
		    if (i_9_ > i + i_2_)
			i_9_ = i_2_ + i;
		    while (i < i_9_) {
			is[i++] = (byte) 0;
			i_2_--;
			aLong321 += -4890945727689970173L;
		    }
		}
		long l_10_ = -1L;
		long l_11_ = -1L;
		if (aLong318 * 3009843318297006237L >= l
		    && 3009843318297006237L * aLong318 < l + (long) i_5_)
		    l_10_ = aLong318 * 3009843318297006237L;
		else if (l >= 3009843318297006237L * aLong318
			 && l < (aLong318 * 3009843318297006237L
				 + (long) (anInt319 * -2044127933)))
		    l_10_ = l;
		if (aLong318 * 3009843318297006237L + (long) (-2044127933
							      * anInt319) > l
		    && ((long) (-2044127933 * anInt319)
			+ 3009843318297006237L * aLong318) <= (long) i_5_ + l)
		    l_11_ = ((long) (anInt319 * -2044127933)
			     + aLong318 * 3009843318297006237L);
		else if (l + (long) i_5_ > 3009843318297006237L * aLong318
			 && l + (long) i_5_ <= (3009843318297006237L * aLong318
						+ (long) (-2044127933
							  * anInt319)))
		    l_11_ = l + (long) i_5_;
		if (l_10_ > -1L && l_11_ > l_10_) {
		    int i_12_ = (int) (l_11_ - l_10_);
		    System.arraycopy(aByteArray317,
				     (int) (l_10_
					    - aLong318 * 3009843318297006237L),
				     is, (int) (l_10_ - l) + i_4_, i_12_);
		    if (l_11_ > 2450946469107952811L * aLong321) {
			i_2_ -= l_11_ - aLong321 * 2450946469107952811L;
			aLong321 = -4890945727689970173L * l_11_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong323 = 3584494261199384171L;
	    throw ioexception;
	}
	if (i_2_ > 0)
	    throw new EOFException();
    }
    
    public Class37(Class42 class42, int i, int i_13_) throws IOException {
	aClass42_312 = class42;
	aLong322 = ((aLong313
		     = class42.method1048(-1896437474) * -6459846465322201341L)
		    * -5102867719338126919L);
	aByteArray314 = new byte[i];
	aByteArray317 = new byte[i_13_];
	aLong321 = 0L;
    }
    
    public void method984(byte[] is, int i) throws IOException {
	method983(is, 0, is.length, -855466940);
    }
    
    public void method985(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong321 = l * -4890945727689970173L;
    }
    
    public void method986(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong321 = l * -4890945727689970173L;
    }
    
    public void method987(byte[] is, int i, int i_14_, byte i_15_)
	throws IOException {
	do {
	    try {
		if (aLong321 * 2450946469107952811L + (long) i_14_
		    > aLong322 * -3541599747423792509L)
		    aLong322
			= (1258841893245111339L
			   * (2450946469107952811L * aLong321 + (long) i_14_));
		if (aLong318 * 3009843318297006237L != -1L
		    && ((aLong321 * 2450946469107952811L
			 < aLong318 * 3009843318297006237L)
			|| (aLong321 * 2450946469107952811L
			    > (aLong318 * 3009843318297006237L
			       + (long) (-2044127933 * anInt319)))))
		    method981((short) 23866);
		if (-1L != 3009843318297006237L * aLong318
		    && ((long) i_14_ + aLong321 * 2450946469107952811L
			> ((long) aByteArray317.length
			   + 3009843318297006237L * aLong318))) {
		    int i_16_ = (int) ((long) aByteArray317.length
				       - (aLong321 * 2450946469107952811L
					  - aLong318 * 3009843318297006237L));
		    System.arraycopy(is, i, aByteArray317,
				     (int) (aLong321 * 2450946469107952811L
					    - 3009843318297006237L * aLong318),
				     i_16_);
		    aLong321 += (long) i_16_ * -4890945727689970173L;
		    i += i_16_;
		    i_14_ -= i_16_;
		    anInt319 = -1960108181 * aByteArray317.length;
		    method981((short) 2894);
		}
		if (i_14_ > aByteArray317.length) {
		    if (2450946469107952811L * aLong321
			!= 5039147490863018429L * aLong323) {
			aClass42_312
			    .method1045(aLong321 * 2450946469107952811L);
			aLong323 = 2903716523057076871L * aLong321;
		    }
		    aClass42_312.method1051(is, i, i_14_, -151184028);
		    aLong323 += (long) i_14_ * -3584494261199384171L;
		    if (5039147490863018429L * aLong323
			> aLong313 * 5439774983646745515L)
			aLong313 = 5241546317141125175L * aLong323;
		    long l = -1L;
		    long l_17_ = -1L;
		    if ((2450946469107952811L * aLong321
			 >= aLong316 * 7170290958735867027L)
			&& (aLong321 * 2450946469107952811L
			    < (aLong316 * 7170290958735867027L
			       + (long) (-1797476153 * anInt320))))
			l = 2450946469107952811L * aLong321;
		    else if ((7170290958735867027L * aLong316
			      >= aLong321 * 2450946469107952811L)
			     && (aLong316 * 7170290958735867027L
				 < ((long) i_14_
				    + 2450946469107952811L * aLong321)))
			l = 7170290958735867027L * aLong316;
		    if (((long) i_14_ + aLong321 * 2450946469107952811L
			 > aLong316 * 7170290958735867027L)
			&& (2450946469107952811L * aLong321 + (long) i_14_
			    <= (aLong316 * 7170290958735867027L
				+ (long) (anInt320 * -1797476153))))
			l_17_ = (long) i_14_ + aLong321 * 2450946469107952811L;
		    else if ((((long) (-1797476153 * anInt320)
			       + aLong316 * 7170290958735867027L)
			      > aLong321 * 2450946469107952811L)
			     && (((long) (anInt320 * -1797476153)
				  + aLong316 * 7170290958735867027L)
				 <= ((long) i_14_
				     + 2450946469107952811L * aLong321)))
			l_17_ = ((long) (anInt320 * -1797476153)
				 + 7170290958735867027L * aLong316);
		    if (l > -1L && l_17_ > l) {
			int i_18_ = (int) (l_17_ - l);
			System.arraycopy(is,
					 (int) ((long) i + l
						- (aLong321
						   * 2450946469107952811L)),
					 aByteArray314,
					 (int) (l - (aLong316
						     * 7170290958735867027L)),
					 i_18_);
		    }
		    aLong321 += (long) i_14_ * -4890945727689970173L;
		} else {
		    if (i_14_ <= 0)
			break;
		    if (3009843318297006237L * aLong318 == -1L)
			aLong318 = aLong321 * -5913468723806045209L;
		    System.arraycopy(is, i, aByteArray317,
				     (int) (aLong321 * 2450946469107952811L
					    - aLong318 * 3009843318297006237L),
				     i_14_);
		    aLong321 += -4890945727689970173L * (long) i_14_;
		    if ((aLong321 * 2450946469107952811L
			 - aLong318 * 3009843318297006237L)
			> (long) (-2044127933 * anInt319))
			anInt319
			    = (-1960108181
			       * (int) (2450946469107952811L * aLong321
					- aLong318 * 3009843318297006237L));
		}
	    } catch (IOException ioexception) {
		aLong323 = 3584494261199384171L;
		throw ioexception;
	    }
	    break;
	} while (false);
    }
    
    void method988() throws IOException {
	if (-1L != 3009843318297006237L * aLong318) {
	    if (5039147490863018429L * aLong323
		!= 3009843318297006237L * aLong318) {
		aClass42_312.method1045(aLong318 * 3009843318297006237L);
		aLong323 = -7863737236105013151L * aLong318;
	    }
	    aClass42_312.method1051(aByteArray317, 0, -2044127933 * anInt319,
				    -955537945);
	    aLong323 += (long) anInt319 * 2862865475914502911L;
	    if (5039147490863018429L * aLong323
		> aLong313 * 5439774983646745515L)
		aLong313 = aLong323 * 5241546317141125175L;
	    long l = -1L;
	    long l_19_ = -1L;
	    if ((3009843318297006237L * aLong318
		 >= aLong316 * 7170290958735867027L)
		&& (3009843318297006237L * aLong318
		    < (aLong316 * 7170290958735867027L
		       + (long) (anInt320 * -1797476153))))
		l = 3009843318297006237L * aLong318;
	    else if ((7170290958735867027L * aLong316
		      >= 3009843318297006237L * aLong318)
		     && (aLong316 * 7170290958735867027L
			 < ((long) (-2044127933 * anInt319)
			    + aLong318 * 3009843318297006237L)))
		l = aLong316 * 7170290958735867027L;
	    if ((aLong318 * 3009843318297006237L + (long) (-2044127933
							   * anInt319)
		 > aLong316 * 7170290958735867027L)
		&& (((long) (anInt319 * -2044127933)
		     + 3009843318297006237L * aLong318)
		    <= ((long) (-1797476153 * anInt320)
			+ 7170290958735867027L * aLong316)))
		l_19_ = ((long) (anInt319 * -2044127933)
			 + aLong318 * 3009843318297006237L);
	    else if ((((long) (-1797476153 * anInt320)
		       + aLong316 * 7170290958735867027L)
		      > aLong318 * 3009843318297006237L)
		     && ((aLong316 * 7170290958735867027L
			  + (long) (anInt320 * -1797476153))
			 <= ((long) (anInt319 * -2044127933)
			     + 3009843318297006237L * aLong318)))
		l_19_ = ((long) (anInt320 * -1797476153)
			 + aLong316 * 7170290958735867027L);
	    if (l > -1L && l_19_ > l) {
		int i = (int) (l_19_ - l);
		System.arraycopy(aByteArray317,
				 (int) (l - 3009843318297006237L * aLong318),
				 aByteArray314,
				 (int) (l - aLong316 * 7170290958735867027L),
				 i);
	    }
	    aLong318 = 247470929236331083L;
	    anInt319 = 0;
	}
    }
    
    public void method989(byte[] is, int i, int i_20_) throws IOException {
	try {
	    if (i_20_ + i > is.length)
		throw new ArrayIndexOutOfBoundsException(i_20_ + i
							 - is.length);
	    if (aLong318 * 3009843318297006237L != -1L
		&& (aLong321 * 2450946469107952811L
		    >= 3009843318297006237L * aLong318)
		&& ((long) i_20_ + aLong321 * 2450946469107952811L
		    <= (aLong318 * 3009843318297006237L
			+ (long) (-2044127933 * anInt319)))) {
		System.arraycopy(aByteArray317,
				 (int) (aLong321 * 2450946469107952811L
					- aLong318 * 3009843318297006237L),
				 is, i, i_20_);
		aLong321 += (long) i_20_ * -4890945727689970173L;
		return;
	    }
	    long l = aLong321 * 2450946469107952811L;
	    int i_21_ = i;
	    int i_22_ = i_20_;
	    if ((aLong321 * 2450946469107952811L
		 >= 7170290958735867027L * aLong316)
		&& (2450946469107952811L * aLong321
		    < ((long) (anInt320 * -1797476153)
		       + 7170290958735867027L * aLong316))) {
		int i_23_ = (int) ((long) (anInt320 * -1797476153)
				   - (aLong321 * 2450946469107952811L
				      - 7170290958735867027L * aLong316));
		if (i_23_ > i_20_)
		    i_23_ = i_20_;
		System.arraycopy(aByteArray314,
				 (int) (aLong321 * 2450946469107952811L
					- aLong316 * 7170290958735867027L),
				 is, i, i_23_);
		aLong321 += -4890945727689970173L * (long) i_23_;
		i += i_23_;
		i_20_ -= i_23_;
	    }
	    if (i_20_ > aByteArray314.length) {
		aClass42_312.method1045(2450946469107952811L * aLong321);
		aLong323 = 2903716523057076871L * aLong321;
		int i_24_;
		for (/**/; i_20_ > 0; i_20_ -= i_24_) {
		    i_24_ = aClass42_312.method1049(is, i, i_20_, (byte) 32);
		    if (-1 == i_24_)
			break;
		    aLong323 += -3584494261199384171L * (long) i_24_;
		    aLong321 += (long) i_24_ * -4890945727689970173L;
		    i += i_24_;
		}
	    } else if (i_20_ > 0) {
		method1000((byte) 7);
		int i_25_ = i_20_;
		if (i_25_ > anInt320 * -1797476153)
		    i_25_ = anInt320 * -1797476153;
		System.arraycopy(aByteArray314, 0, is, i, i_25_);
		i += i_25_;
		i_20_ -= i_25_;
		aLong321 += -4890945727689970173L * (long) i_25_;
	    }
	    if (-1L != aLong318 * 3009843318297006237L) {
		if ((aLong318 * 3009843318297006237L
		     > aLong321 * 2450946469107952811L)
		    && i_20_ > 0) {
		    int i_26_ = i + (int) (aLong318 * 3009843318297006237L
					   - 2450946469107952811L * aLong321);
		    if (i_26_ > i + i_20_)
			i_26_ = i_20_ + i;
		    while (i < i_26_) {
			is[i++] = (byte) 0;
			i_20_--;
			aLong321 += -4890945727689970173L;
		    }
		}
		long l_27_ = -1L;
		long l_28_ = -1L;
		if (aLong318 * 3009843318297006237L >= l
		    && 3009843318297006237L * aLong318 < l + (long) i_22_)
		    l_27_ = aLong318 * 3009843318297006237L;
		else if (l >= 3009843318297006237L * aLong318
			 && l < (aLong318 * 3009843318297006237L
				 + (long) (anInt319 * -2044127933)))
		    l_27_ = l;
		if (aLong318 * 3009843318297006237L + (long) (-2044127933
							      * anInt319) > l
		    && ((long) (-2044127933 * anInt319)
			+ 3009843318297006237L * aLong318) <= (long) i_22_ + l)
		    l_28_ = ((long) (anInt319 * -2044127933)
			     + aLong318 * 3009843318297006237L);
		else if (l + (long) i_22_ > 3009843318297006237L * aLong318
			 && (l + (long) i_22_
			     <= (3009843318297006237L * aLong318
				 + (long) (-2044127933 * anInt319))))
		    l_28_ = l + (long) i_22_;
		if (l_27_ > -1L && l_28_ > l_27_) {
		    int i_29_ = (int) (l_28_ - l_27_);
		    System.arraycopy(aByteArray317,
				     (int) (l_27_
					    - aLong318 * 3009843318297006237L),
				     is, (int) (l_27_ - l) + i_21_, i_29_);
		    if (l_28_ > 2450946469107952811L * aLong321) {
			i_20_ -= l_28_ - aLong321 * 2450946469107952811L;
			aLong321 = -4890945727689970173L * l_28_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong323 = 3584494261199384171L;
	    throw ioexception;
	}
	if (i_20_ > 0)
	    throw new EOFException();
    }
    
    public void method990() throws IOException {
	method981((short) 21310);
	aClass42_312.method1047(1003014254);
    }
    
    public void method991(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong321 = l * -4890945727689970173L;
    }
    
    void method992() throws IOException {
	if (-1L != 3009843318297006237L * aLong318) {
	    if (5039147490863018429L * aLong323
		!= 3009843318297006237L * aLong318) {
		aClass42_312.method1045(aLong318 * 3009843318297006237L);
		aLong323 = -7863737236105013151L * aLong318;
	    }
	    aClass42_312.method1051(aByteArray317, 0, -2044127933 * anInt319,
				    1334581503);
	    aLong323 += (long) anInt319 * 2862865475914502911L;
	    if (5039147490863018429L * aLong323
		> aLong313 * 5439774983646745515L)
		aLong313 = aLong323 * 5241546317141125175L;
	    long l = -1L;
	    long l_30_ = -1L;
	    if ((3009843318297006237L * aLong318
		 >= aLong316 * 7170290958735867027L)
		&& (3009843318297006237L * aLong318
		    < (aLong316 * 7170290958735867027L
		       + (long) (anInt320 * -1797476153))))
		l = 3009843318297006237L * aLong318;
	    else if ((7170290958735867027L * aLong316
		      >= 3009843318297006237L * aLong318)
		     && (aLong316 * 7170290958735867027L
			 < ((long) (-2044127933 * anInt319)
			    + aLong318 * 3009843318297006237L)))
		l = aLong316 * 7170290958735867027L;
	    if ((aLong318 * 3009843318297006237L + (long) (-2044127933
							   * anInt319)
		 > aLong316 * 7170290958735867027L)
		&& (((long) (anInt319 * -2044127933)
		     + 3009843318297006237L * aLong318)
		    <= ((long) (-1797476153 * anInt320)
			+ 7170290958735867027L * aLong316)))
		l_30_ = ((long) (anInt319 * -2044127933)
			 + aLong318 * 3009843318297006237L);
	    else if ((((long) (-1797476153 * anInt320)
		       + aLong316 * 7170290958735867027L)
		      > aLong318 * 3009843318297006237L)
		     && ((aLong316 * 7170290958735867027L
			  + (long) (anInt320 * -1797476153))
			 <= ((long) (anInt319 * -2044127933)
			     + 3009843318297006237L * aLong318)))
		l_30_ = ((long) (anInt320 * -1797476153)
			 + aLong316 * 7170290958735867027L);
	    if (l > -1L && l_30_ > l) {
		int i = (int) (l_30_ - l);
		System.arraycopy(aByteArray317,
				 (int) (l - 3009843318297006237L * aLong318),
				 aByteArray314,
				 (int) (l - aLong316 * 7170290958735867027L),
				 i);
	    }
	    aLong318 = 247470929236331083L;
	    anInt319 = 0;
	}
    }
    
    public void method993(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong321 = l * -4890945727689970173L;
    }
    
    public long method994() {
	return aLong322 * -3541599747423792509L;
    }
    
    public void method995(byte[] is, int i, int i_31_) throws IOException {
	try {
	    if (i_31_ + i > is.length)
		throw new ArrayIndexOutOfBoundsException(i_31_ + i
							 - is.length);
	    if (aLong318 * 3009843318297006237L != -1L
		&& (aLong321 * 2450946469107952811L
		    >= 3009843318297006237L * aLong318)
		&& ((long) i_31_ + aLong321 * 2450946469107952811L
		    <= (aLong318 * 3009843318297006237L
			+ (long) (-2044127933 * anInt319)))) {
		System.arraycopy(aByteArray317,
				 (int) (aLong321 * 2450946469107952811L
					- aLong318 * 3009843318297006237L),
				 is, i, i_31_);
		aLong321 += (long) i_31_ * -4890945727689970173L;
		return;
	    }
	    long l = aLong321 * 2450946469107952811L;
	    int i_32_ = i;
	    int i_33_ = i_31_;
	    if ((aLong321 * 2450946469107952811L
		 >= 7170290958735867027L * aLong316)
		&& (2450946469107952811L * aLong321
		    < ((long) (anInt320 * -1797476153)
		       + 7170290958735867027L * aLong316))) {
		int i_34_ = (int) ((long) (anInt320 * -1797476153)
				   - (aLong321 * 2450946469107952811L
				      - 7170290958735867027L * aLong316));
		if (i_34_ > i_31_)
		    i_34_ = i_31_;
		System.arraycopy(aByteArray314,
				 (int) (aLong321 * 2450946469107952811L
					- aLong316 * 7170290958735867027L),
				 is, i, i_34_);
		aLong321 += -4890945727689970173L * (long) i_34_;
		i += i_34_;
		i_31_ -= i_34_;
	    }
	    if (i_31_ > aByteArray314.length) {
		aClass42_312.method1045(2450946469107952811L * aLong321);
		aLong323 = 2903716523057076871L * aLong321;
		int i_35_;
		for (/**/; i_31_ > 0; i_31_ -= i_35_) {
		    i_35_ = aClass42_312.method1049(is, i, i_31_, (byte) 73);
		    if (-1 == i_35_)
			break;
		    aLong323 += -3584494261199384171L * (long) i_35_;
		    aLong321 += (long) i_35_ * -4890945727689970173L;
		    i += i_35_;
		}
	    } else if (i_31_ > 0) {
		method1000((byte) 7);
		int i_36_ = i_31_;
		if (i_36_ > anInt320 * -1797476153)
		    i_36_ = anInt320 * -1797476153;
		System.arraycopy(aByteArray314, 0, is, i, i_36_);
		i += i_36_;
		i_31_ -= i_36_;
		aLong321 += -4890945727689970173L * (long) i_36_;
	    }
	    if (-1L != aLong318 * 3009843318297006237L) {
		if ((aLong318 * 3009843318297006237L
		     > aLong321 * 2450946469107952811L)
		    && i_31_ > 0) {
		    int i_37_ = i + (int) (aLong318 * 3009843318297006237L
					   - 2450946469107952811L * aLong321);
		    if (i_37_ > i + i_31_)
			i_37_ = i_31_ + i;
		    while (i < i_37_) {
			is[i++] = (byte) 0;
			i_31_--;
			aLong321 += -4890945727689970173L;
		    }
		}
		long l_38_ = -1L;
		long l_39_ = -1L;
		if (aLong318 * 3009843318297006237L >= l
		    && 3009843318297006237L * aLong318 < l + (long) i_33_)
		    l_38_ = aLong318 * 3009843318297006237L;
		else if (l >= 3009843318297006237L * aLong318
			 && l < (aLong318 * 3009843318297006237L
				 + (long) (anInt319 * -2044127933)))
		    l_38_ = l;
		if (aLong318 * 3009843318297006237L + (long) (-2044127933
							      * anInt319) > l
		    && ((long) (-2044127933 * anInt319)
			+ 3009843318297006237L * aLong318) <= (long) i_33_ + l)
		    l_39_ = ((long) (anInt319 * -2044127933)
			     + aLong318 * 3009843318297006237L);
		else if (l + (long) i_33_ > 3009843318297006237L * aLong318
			 && (l + (long) i_33_
			     <= (3009843318297006237L * aLong318
				 + (long) (-2044127933 * anInt319))))
		    l_39_ = l + (long) i_33_;
		if (l_38_ > -1L && l_39_ > l_38_) {
		    int i_40_ = (int) (l_39_ - l_38_);
		    System.arraycopy(aByteArray317,
				     (int) (l_38_
					    - aLong318 * 3009843318297006237L),
				     is, (int) (l_38_ - l) + i_32_, i_40_);
		    if (l_39_ > 2450946469107952811L * aLong321) {
			i_31_ -= l_39_ - aLong321 * 2450946469107952811L;
			aLong321 = -4890945727689970173L * l_39_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong323 = 3584494261199384171L;
	    throw ioexception;
	}
	if (i_31_ > 0)
	    throw new EOFException();
    }
    
    public void method996(byte[] is, int i, int i_41_) throws IOException {
	try {
	    if (i_41_ + i > is.length)
		throw new ArrayIndexOutOfBoundsException(i_41_ + i
							 - is.length);
	    if (aLong318 * 3009843318297006237L != -1L
		&& (aLong321 * 2450946469107952811L
		    >= 3009843318297006237L * aLong318)
		&& ((long) i_41_ + aLong321 * 2450946469107952811L
		    <= (aLong318 * 3009843318297006237L
			+ (long) (-2044127933 * anInt319)))) {
		System.arraycopy(aByteArray317,
				 (int) (aLong321 * 2450946469107952811L
					- aLong318 * 3009843318297006237L),
				 is, i, i_41_);
		aLong321 += (long) i_41_ * -4890945727689970173L;
		return;
	    }
	    long l = aLong321 * 2450946469107952811L;
	    int i_42_ = i;
	    int i_43_ = i_41_;
	    if ((aLong321 * 2450946469107952811L
		 >= 7170290958735867027L * aLong316)
		&& (2450946469107952811L * aLong321
		    < ((long) (anInt320 * -1797476153)
		       + 7170290958735867027L * aLong316))) {
		int i_44_ = (int) ((long) (anInt320 * -1797476153)
				   - (aLong321 * 2450946469107952811L
				      - 7170290958735867027L * aLong316));
		if (i_44_ > i_41_)
		    i_44_ = i_41_;
		System.arraycopy(aByteArray314,
				 (int) (aLong321 * 2450946469107952811L
					- aLong316 * 7170290958735867027L),
				 is, i, i_44_);
		aLong321 += -4890945727689970173L * (long) i_44_;
		i += i_44_;
		i_41_ -= i_44_;
	    }
	    if (i_41_ > aByteArray314.length) {
		aClass42_312.method1045(2450946469107952811L * aLong321);
		aLong323 = 2903716523057076871L * aLong321;
		int i_45_;
		for (/**/; i_41_ > 0; i_41_ -= i_45_) {
		    i_45_ = aClass42_312.method1049(is, i, i_41_, (byte) 16);
		    if (-1 == i_45_)
			break;
		    aLong323 += -3584494261199384171L * (long) i_45_;
		    aLong321 += (long) i_45_ * -4890945727689970173L;
		    i += i_45_;
		}
	    } else if (i_41_ > 0) {
		method1000((byte) 7);
		int i_46_ = i_41_;
		if (i_46_ > anInt320 * -1797476153)
		    i_46_ = anInt320 * -1797476153;
		System.arraycopy(aByteArray314, 0, is, i, i_46_);
		i += i_46_;
		i_41_ -= i_46_;
		aLong321 += -4890945727689970173L * (long) i_46_;
	    }
	    if (-1L != aLong318 * 3009843318297006237L) {
		if ((aLong318 * 3009843318297006237L
		     > aLong321 * 2450946469107952811L)
		    && i_41_ > 0) {
		    int i_47_ = i + (int) (aLong318 * 3009843318297006237L
					   - 2450946469107952811L * aLong321);
		    if (i_47_ > i + i_41_)
			i_47_ = i_41_ + i;
		    while (i < i_47_) {
			is[i++] = (byte) 0;
			i_41_--;
			aLong321 += -4890945727689970173L;
		    }
		}
		long l_48_ = -1L;
		long l_49_ = -1L;
		if (aLong318 * 3009843318297006237L >= l
		    && 3009843318297006237L * aLong318 < l + (long) i_43_)
		    l_48_ = aLong318 * 3009843318297006237L;
		else if (l >= 3009843318297006237L * aLong318
			 && l < (aLong318 * 3009843318297006237L
				 + (long) (anInt319 * -2044127933)))
		    l_48_ = l;
		if (aLong318 * 3009843318297006237L + (long) (-2044127933
							      * anInt319) > l
		    && ((long) (-2044127933 * anInt319)
			+ 3009843318297006237L * aLong318) <= (long) i_43_ + l)
		    l_49_ = ((long) (anInt319 * -2044127933)
			     + aLong318 * 3009843318297006237L);
		else if (l + (long) i_43_ > 3009843318297006237L * aLong318
			 && (l + (long) i_43_
			     <= (3009843318297006237L * aLong318
				 + (long) (-2044127933 * anInt319))))
		    l_49_ = l + (long) i_43_;
		if (l_48_ > -1L && l_49_ > l_48_) {
		    int i_50_ = (int) (l_49_ - l_48_);
		    System.arraycopy(aByteArray317,
				     (int) (l_48_
					    - aLong318 * 3009843318297006237L),
				     is, (int) (l_48_ - l) + i_42_, i_50_);
		    if (l_49_ > 2450946469107952811L * aLong321) {
			i_41_ -= l_49_ - aLong321 * 2450946469107952811L;
			aLong321 = -4890945727689970173L * l_49_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong323 = 3584494261199384171L;
	    throw ioexception;
	}
	if (i_41_ > 0)
	    throw new EOFException();
    }
    
    public void method997(byte[] is, int i, int i_51_) throws IOException {
	try {
	    if (i_51_ + i > is.length)
		throw new ArrayIndexOutOfBoundsException(i_51_ + i
							 - is.length);
	    if (aLong318 * 3009843318297006237L != -1L
		&& (aLong321 * 2450946469107952811L
		    >= 3009843318297006237L * aLong318)
		&& ((long) i_51_ + aLong321 * 2450946469107952811L
		    <= (aLong318 * 3009843318297006237L
			+ (long) (-2044127933 * anInt319)))) {
		System.arraycopy(aByteArray317,
				 (int) (aLong321 * 2450946469107952811L
					- aLong318 * 3009843318297006237L),
				 is, i, i_51_);
		aLong321 += (long) i_51_ * -4890945727689970173L;
		return;
	    }
	    long l = aLong321 * 2450946469107952811L;
	    int i_52_ = i;
	    int i_53_ = i_51_;
	    if ((aLong321 * 2450946469107952811L
		 >= 7170290958735867027L * aLong316)
		&& (2450946469107952811L * aLong321
		    < ((long) (anInt320 * -1797476153)
		       + 7170290958735867027L * aLong316))) {
		int i_54_ = (int) ((long) (anInt320 * -1797476153)
				   - (aLong321 * 2450946469107952811L
				      - 7170290958735867027L * aLong316));
		if (i_54_ > i_51_)
		    i_54_ = i_51_;
		System.arraycopy(aByteArray314,
				 (int) (aLong321 * 2450946469107952811L
					- aLong316 * 7170290958735867027L),
				 is, i, i_54_);
		aLong321 += -4890945727689970173L * (long) i_54_;
		i += i_54_;
		i_51_ -= i_54_;
	    }
	    if (i_51_ > aByteArray314.length) {
		aClass42_312.method1045(2450946469107952811L * aLong321);
		aLong323 = 2903716523057076871L * aLong321;
		int i_55_;
		for (/**/; i_51_ > 0; i_51_ -= i_55_) {
		    i_55_ = aClass42_312.method1049(is, i, i_51_, (byte) 77);
		    if (-1 == i_55_)
			break;
		    aLong323 += -3584494261199384171L * (long) i_55_;
		    aLong321 += (long) i_55_ * -4890945727689970173L;
		    i += i_55_;
		}
	    } else if (i_51_ > 0) {
		method1000((byte) 7);
		int i_56_ = i_51_;
		if (i_56_ > anInt320 * -1797476153)
		    i_56_ = anInt320 * -1797476153;
		System.arraycopy(aByteArray314, 0, is, i, i_56_);
		i += i_56_;
		i_51_ -= i_56_;
		aLong321 += -4890945727689970173L * (long) i_56_;
	    }
	    if (-1L != aLong318 * 3009843318297006237L) {
		if ((aLong318 * 3009843318297006237L
		     > aLong321 * 2450946469107952811L)
		    && i_51_ > 0) {
		    int i_57_ = i + (int) (aLong318 * 3009843318297006237L
					   - 2450946469107952811L * aLong321);
		    if (i_57_ > i + i_51_)
			i_57_ = i_51_ + i;
		    while (i < i_57_) {
			is[i++] = (byte) 0;
			i_51_--;
			aLong321 += -4890945727689970173L;
		    }
		}
		long l_58_ = -1L;
		long l_59_ = -1L;
		if (aLong318 * 3009843318297006237L >= l
		    && 3009843318297006237L * aLong318 < l + (long) i_53_)
		    l_58_ = aLong318 * 3009843318297006237L;
		else if (l >= 3009843318297006237L * aLong318
			 && l < (aLong318 * 3009843318297006237L
				 + (long) (anInt319 * -2044127933)))
		    l_58_ = l;
		if (aLong318 * 3009843318297006237L + (long) (-2044127933
							      * anInt319) > l
		    && ((long) (-2044127933 * anInt319)
			+ 3009843318297006237L * aLong318) <= (long) i_53_ + l)
		    l_59_ = ((long) (anInt319 * -2044127933)
			     + aLong318 * 3009843318297006237L);
		else if (l + (long) i_53_ > 3009843318297006237L * aLong318
			 && (l + (long) i_53_
			     <= (3009843318297006237L * aLong318
				 + (long) (-2044127933 * anInt319))))
		    l_59_ = l + (long) i_53_;
		if (l_58_ > -1L && l_59_ > l_58_) {
		    int i_60_ = (int) (l_59_ - l_58_);
		    System.arraycopy(aByteArray317,
				     (int) (l_58_
					    - aLong318 * 3009843318297006237L),
				     is, (int) (l_58_ - l) + i_52_, i_60_);
		    if (l_59_ > 2450946469107952811L * aLong321) {
			i_51_ -= l_59_ - aLong321 * 2450946469107952811L;
			aLong321 = -4890945727689970173L * l_59_;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong323 = 3584494261199384171L;
	    throw ioexception;
	}
	if (i_51_ > 0)
	    throw new EOFException();
    }
    
    public void method998() throws IOException {
	method981((short) 24550);
	aClass42_312.method1047(1328322327);
    }
    
    void method999() throws IOException {
	if (-1L != 3009843318297006237L * aLong318) {
	    if (5039147490863018429L * aLong323
		!= 3009843318297006237L * aLong318) {
		aClass42_312.method1045(aLong318 * 3009843318297006237L);
		aLong323 = -7863737236105013151L * aLong318;
	    }
	    aClass42_312.method1051(aByteArray317, 0, -2044127933 * anInt319,
				    2135794123);
	    aLong323 += (long) anInt319 * 2862865475914502911L;
	    if (5039147490863018429L * aLong323
		> aLong313 * 5439774983646745515L)
		aLong313 = aLong323 * 5241546317141125175L;
	    long l = -1L;
	    long l_61_ = -1L;
	    if ((3009843318297006237L * aLong318
		 >= aLong316 * 7170290958735867027L)
		&& (3009843318297006237L * aLong318
		    < (aLong316 * 7170290958735867027L
		       + (long) (anInt320 * -1797476153))))
		l = 3009843318297006237L * aLong318;
	    else if ((7170290958735867027L * aLong316
		      >= 3009843318297006237L * aLong318)
		     && (aLong316 * 7170290958735867027L
			 < ((long) (-2044127933 * anInt319)
			    + aLong318 * 3009843318297006237L)))
		l = aLong316 * 7170290958735867027L;
	    if ((aLong318 * 3009843318297006237L + (long) (-2044127933
							   * anInt319)
		 > aLong316 * 7170290958735867027L)
		&& (((long) (anInt319 * -2044127933)
		     + 3009843318297006237L * aLong318)
		    <= ((long) (-1797476153 * anInt320)
			+ 7170290958735867027L * aLong316)))
		l_61_ = ((long) (anInt319 * -2044127933)
			 + aLong318 * 3009843318297006237L);
	    else if ((((long) (-1797476153 * anInt320)
		       + aLong316 * 7170290958735867027L)
		      > aLong318 * 3009843318297006237L)
		     && ((aLong316 * 7170290958735867027L
			  + (long) (anInt320 * -1797476153))
			 <= ((long) (anInt319 * -2044127933)
			     + 3009843318297006237L * aLong318)))
		l_61_ = ((long) (anInt320 * -1797476153)
			 + aLong316 * 7170290958735867027L);
	    if (l > -1L && l_61_ > l) {
		int i = (int) (l_61_ - l);
		System.arraycopy(aByteArray317,
				 (int) (l - 3009843318297006237L * aLong318),
				 aByteArray314,
				 (int) (l - aLong316 * 7170290958735867027L),
				 i);
	    }
	    aLong318 = 247470929236331083L;
	    anInt319 = 0;
	}
    }
    
    void method1000(byte i) throws IOException {
	anInt320 = 0;
	if (5039147490863018429L * aLong323
	    != aLong321 * 2450946469107952811L) {
	    aClass42_312.method1045(aLong321 * 2450946469107952811L);
	    aLong323 = 2903716523057076871L * aLong321;
	}
	aLong316 = aLong321 * -6292849207686039927L;
	int i_62_;
	for (/**/; anInt320 * -1797476153 < aByteArray314.length;
	     anInt320 += i_62_ * 550703351) {
	    int i_63_ = aByteArray314.length - -1797476153 * anInt320;
	    if (i_63_ > 200000000)
		i_63_ = 200000000;
	    i_62_ = aClass42_312.method1049(aByteArray314,
					    anInt320 * -1797476153, i_63_,
					    (byte) 87);
	    if (-1 == i_62_)
		break;
	    aLong323 += -3584494261199384171L * (long) i_62_;
	}
    }
    
    public long method1001(byte i) {
	return aLong322 * -3541599747423792509L;
    }
    
    static final void method1002(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	class259.anInt2630 = -1158569583;
	class259.anInt2631 = 975533973 * client.anInt11053;
	class259.anInt2672 = 0;
	if (-1 == 1534974651 * class259.anInt2576 && !class245.aBool2428)
	    Class689.method14096(class259.anInt2588 * 1984678839, -2037631806);
    }
    
    static final void method1003(Class683 class683, int i) {
	int i_64_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class287 class287
	    = ((Class287)
	       Class698.aClass40_Sub2_8770.method76(i_64_, 336453341));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class287.anInt3192 * 433521613;
    }
}
