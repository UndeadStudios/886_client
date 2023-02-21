/* Class565 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class565 implements Runnable
{
    int anInt7597;
    InputStream anInputStream7598;
    int anInt7599;
    byte[] aByteArray7600;
    Thread aThread7601;
    int anInt7602 = 0;
    IOException anIOException7603;
    
    void method9455(int i) {
	synchronized (this) {
	    if (null == anIOException7603)
		anIOException7603 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread7601.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public void run() {
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (null != anIOException7603)
			return;
		    if (-2008917815 * anInt7602 == 0)
			i = 1445908023 * anInt7599 - 948958739 * anInt7597 - 1;
		    else if (anInt7602 * -2008917815 <= 948958739 * anInt7597)
			i = 1445908023 * anInt7599 - anInt7597 * 948958739;
		    else
			i = (-2008917815 * anInt7602 - anInt7597 * 948958739
			     - 1);
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_0_;
	    try {
		i_0_ = anInputStream7598.read(aByteArray7600,
					      anInt7597 * 948958739, i);
		if (-1 == i_0_)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7603 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7597 = 1161577499 * ((i_0_ + anInt7597 * 948958739)
					  % (anInt7599 * 1445908023));
	    }
	}
    }
    
    boolean method9456(int i, int i_1_) throws IOException {
	if (i <= 0 || i >= anInt7599 * 1445908023)
	    throw new IOException();
	synchronized (this) {
	    int i_2_;
	    if (-2008917815 * anInt7602 <= 948958739 * anInt7597)
		i_2_ = 948958739 * anInt7597 - -2008917815 * anInt7602;
	    else
		i_2_ = anInt7597 * 948958739 + (anInt7599 * 1445908023
						- -2008917815 * anInt7602);
	    if (i_2_ < i) {
		if (anIOException7603 != null)
		    throw new IOException(anIOException7603.toString());
		this.notifyAll();
		boolean bool = false;
		return bool;
	    }
	    boolean bool = true;
	    return bool;
	}
    }
    
    Class565(InputStream inputstream, int i) {
	anInt7597 = 0;
	anInputStream7598 = inputstream;
	anInt7599 = (i + 1) * -287291513;
	aByteArray7600 = new byte[anInt7599 * 1445908023];
	aThread7601 = new Thread(this);
	aThread7601.setDaemon(true);
	aThread7601.start();
    }
    
    int method9457(byte[] is, int i, int i_3_, int i_4_) throws IOException {
	if (i_3_ < 0 || i < 0 || i_3_ + i > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_5_;
	    if (anInt7602 * -2008917815 <= 948958739 * anInt7597)
		i_5_ = 948958739 * anInt7597 - anInt7602 * -2008917815;
	    else
		i_5_ = anInt7597 * 948958739 + (anInt7599 * 1445908023
						- anInt7602 * -2008917815);
	    if (i_3_ > i_5_)
		i_3_ = i_5_;
	    if (0 == i_3_ && anIOException7603 != null)
		throw new IOException(anIOException7603.toString());
	    if (i_3_ + -2008917815 * anInt7602 <= anInt7599 * 1445908023)
		System.arraycopy(aByteArray7600, -2008917815 * anInt7602, is,
				 i, i_3_);
	    else {
		int i_6_ = anInt7599 * 1445908023 - -2008917815 * anInt7602;
		System.arraycopy(aByteArray7600, -2008917815 * anInt7602, is,
				 i, i_6_);
		System.arraycopy(aByteArray7600, 0, is, i_6_ + i, i_3_ - i_6_);
	    }
	    anInt7602 = ((i_3_ + -2008917815 * anInt7602)
			 % (anInt7599 * 1445908023) * 617693561);
	    this.notifyAll();
	    int i_7_ = i_3_;
	    return i_7_;
	}
    }
    
    public void method9458() {
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (null != anIOException7603)
			return;
		    if (-2008917815 * anInt7602 == 0)
			i = 1445908023 * anInt7599 - 948958739 * anInt7597 - 1;
		    else if (anInt7602 * -2008917815 <= 948958739 * anInt7597)
			i = 1445908023 * anInt7599 - anInt7597 * 948958739;
		    else
			i = (-2008917815 * anInt7602 - anInt7597 * 948958739
			     - 1);
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_8_;
	    try {
		i_8_ = anInputStream7598.read(aByteArray7600,
					      anInt7597 * 948958739, i);
		if (-1 == i_8_)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7603 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7597 = 1161577499 * ((i_8_ + anInt7597 * 948958739)
					  % (anInt7599 * 1445908023));
	    }
	}
    }
    
    void method9459(int i) {
	anInputStream7598 = new InputStream_Sub1();
    }
    
    int method9460(int i) throws IOException {
	synchronized (this) {
	    int i_9_;
	    if (anInt7602 * -2008917815 <= anInt7597 * 948958739)
		i_9_ = anInt7597 * 948958739 - -2008917815 * anInt7602;
	    else
		i_9_ = anInt7597 * 948958739 + (1445908023 * anInt7599
						- anInt7602 * -2008917815);
	    if (i_9_ <= 0 && anIOException7603 != null)
		throw new IOException(anIOException7603.toString());
	    this.notifyAll();
	    int i_10_ = i_9_;
	    return i_10_;
	}
    }
    
    boolean method9461(int i) throws IOException {
	if (i <= 0 || i >= anInt7599 * 1445908023)
	    throw new IOException();
	synchronized (this) {
	    int i_11_;
	    if (-2008917815 * anInt7602 <= 948958739 * anInt7597)
		i_11_ = 948958739 * anInt7597 - -2008917815 * anInt7602;
	    else
		i_11_ = anInt7597 * 948958739 + (anInt7599 * 1445908023
						 - -2008917815 * anInt7602);
	    if (i_11_ < i) {
		if (anIOException7603 != null)
		    throw new IOException(anIOException7603.toString());
		this.notifyAll();
		boolean bool = false;
		return bool;
	    }
	    boolean bool = true;
	    return bool;
	}
    }
    
    int method9462(byte[] is, int i, int i_12_) throws IOException {
	if (i_12_ < 0 || i < 0 || i_12_ + i > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_13_;
	    if (anInt7602 * -2008917815 <= 948958739 * anInt7597)
		i_13_ = 948958739 * anInt7597 - anInt7602 * -2008917815;
	    else
		i_13_ = anInt7597 * 948958739 + (anInt7599 * 1445908023
						 - anInt7602 * -2008917815);
	    if (i_12_ > i_13_)
		i_12_ = i_13_;
	    if (0 == i_12_ && anIOException7603 != null)
		throw new IOException(anIOException7603.toString());
	    if (i_12_ + -2008917815 * anInt7602 <= anInt7599 * 1445908023)
		System.arraycopy(aByteArray7600, -2008917815 * anInt7602, is,
				 i, i_12_);
	    else {
		int i_14_ = anInt7599 * 1445908023 - -2008917815 * anInt7602;
		System.arraycopy(aByteArray7600, -2008917815 * anInt7602, is,
				 i, i_14_);
		System.arraycopy(aByteArray7600, 0, is, i_14_ + i,
				 i_12_ - i_14_);
	    }
	    anInt7602 = ((i_12_ + -2008917815 * anInt7602)
			 % (anInt7599 * 1445908023) * 617693561);
	    this.notifyAll();
	    int i_15_ = i_12_;
	    return i_15_;
	}
    }
    
    int method9463(byte[] is, int i, int i_16_) throws IOException {
	if (i_16_ < 0 || i < 0 || i_16_ + i > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_17_;
	    if (anInt7602 * -2008917815 <= 948958739 * anInt7597)
		i_17_ = 948958739 * anInt7597 - anInt7602 * -2008917815;
	    else
		i_17_ = anInt7597 * 948958739 + (anInt7599 * 1445908023
						 - anInt7602 * -2008917815);
	    if (i_16_ > i_17_)
		i_16_ = i_17_;
	    if (0 == i_16_ && anIOException7603 != null)
		throw new IOException(anIOException7603.toString());
	    if (i_16_ + -2008917815 * anInt7602 <= anInt7599 * 1445908023)
		System.arraycopy(aByteArray7600, -2008917815 * anInt7602, is,
				 i, i_16_);
	    else {
		int i_18_ = anInt7599 * 1445908023 - -2008917815 * anInt7602;
		System.arraycopy(aByteArray7600, -2008917815 * anInt7602, is,
				 i, i_18_);
		System.arraycopy(aByteArray7600, 0, is, i_18_ + i,
				 i_16_ - i_18_);
	    }
	    anInt7602 = ((i_16_ + -2008917815 * anInt7602)
			 % (anInt7599 * 1445908023) * 617693561);
	    this.notifyAll();
	    int i_19_ = i_16_;
	    return i_19_;
	}
    }
    
    int method9464(byte[] is, int i, int i_20_) throws IOException {
	if (i_20_ < 0 || i < 0 || i_20_ + i > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_21_;
	    if (anInt7602 * -2008917815 <= 948958739 * anInt7597)
		i_21_ = 948958739 * anInt7597 - anInt7602 * -2008917815;
	    else
		i_21_ = anInt7597 * 948958739 + (anInt7599 * 1445908023
						 - anInt7602 * -2008917815);
	    if (i_20_ > i_21_)
		i_20_ = i_21_;
	    if (0 == i_20_ && anIOException7603 != null)
		throw new IOException(anIOException7603.toString());
	    if (i_20_ + -2008917815 * anInt7602 <= anInt7599 * 1445908023)
		System.arraycopy(aByteArray7600, -2008917815 * anInt7602, is,
				 i, i_20_);
	    else {
		int i_22_ = anInt7599 * 1445908023 - -2008917815 * anInt7602;
		System.arraycopy(aByteArray7600, -2008917815 * anInt7602, is,
				 i, i_22_);
		System.arraycopy(aByteArray7600, 0, is, i_22_ + i,
				 i_20_ - i_22_);
	    }
	    anInt7602 = ((i_20_ + -2008917815 * anInt7602)
			 % (anInt7599 * 1445908023) * 617693561);
	    this.notifyAll();
	    int i_23_ = i_20_;
	    return i_23_;
	}
    }
    
    void method9465() {
	anInputStream7598 = new InputStream_Sub1();
    }
    
    public static void method9466
	(float f, Class446 class446, Class446 class446_24_,
	 Class446 class446_25_, Class446 class446_26_, Class446 class446_27_,
	 float f_28_, float f_29_, float f_30_, float f_31_, byte i) {
	if (!class446_24_.method7218(class446)) {
	    Class446 class446_32_
		= Class446.method7225(class446_24_, class446);
	    float f_33_ = class446_32_.method7230();
	    if (f_28_ > 0.0F) {
		class446_26_ = Class446.method7209(class446_26_);
		class446_26_.method7281(f_29_ * (f_33_ / f_28_));
	    }
	    if (class446_26_.aFloat4895 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class446.aFloat4895) || f_33_ > f_30_) {
		class446.method7216(class446_24_);
		class446_25_.method7217();
	    } else {
		Class446 class446_34_ = Class446.method7209(class446_25_);
		class446_34_.method7231();
		Class446 class446_35_
		    = Class446.method7236(class446_34_, class446_26_);
		Class446 class446_36_
		    = Class446.method7233(class446_34_, class446_35_);
		class446_36_.method7281(0.5F);
		Class446 class446_37_ = Class446.method7209(class446_25_);
		Class446 class446_38_ = Class446.method7209(class446_32_);
		class446_38_.method7231();
		if (class446_36_.aFloat4895 > class446_38_.aFloat4895) {
		    if (class446_32_.aFloat4895 < 0.0F) {
			class446_37_.aFloat4895 += f * class446_26_.aFloat4895;
			if (class446_37_.aFloat4895 > 0.0F)
			    class446_37_.aFloat4895 = 0.0F;
		    } else {
			class446_37_.aFloat4895 -= f * class446_26_.aFloat4895;
			if (class446_37_.aFloat4895 < 0.0F)
			    class446_37_.aFloat4895 = 0.0F;
		    }
		} else if (class446_34_.aFloat4895 < class446_27_.aFloat4895) {
		    if (class446_32_.aFloat4895 < 0.0F) {
			class446_37_.aFloat4895 -= f * class446_26_.aFloat4895;
			if (class446_37_.aFloat4895 < -class446_27_.aFloat4895)
			    class446_37_.aFloat4895 = -class446_27_.aFloat4895;
		    } else {
			class446_37_.aFloat4895 += f * class446_26_.aFloat4895;
			if (class446_37_.aFloat4895 > class446_27_.aFloat4895)
			    class446_37_.aFloat4895 = class446_27_.aFloat4895;
		    }
		}
		if (class446_36_.aFloat4896 > class446_38_.aFloat4896) {
		    if (class446_32_.aFloat4896 < 0.0F) {
			class446_37_.aFloat4896 += class446_26_.aFloat4896 * f;
			if (class446_37_.aFloat4896 > 0.0F)
			    class446_37_.aFloat4896 = 0.0F;
		    } else {
			class446_37_.aFloat4896 -= class446_26_.aFloat4896 * f;
			if (class446_37_.aFloat4896 < 0.0F)
			    class446_37_.aFloat4896 = 0.0F;
		    }
		} else if (class446_34_.aFloat4896 < class446_27_.aFloat4896) {
		    if (class446_32_.aFloat4896 < 0.0F) {
			class446_37_.aFloat4896 -= f * class446_26_.aFloat4896;
			if (class446_37_.aFloat4896 < -class446_27_.aFloat4896)
			    class446_37_.aFloat4896 = -class446_27_.aFloat4896;
		    } else {
			class446_37_.aFloat4896 += class446_26_.aFloat4896 * f;
			if (class446_37_.aFloat4896 > class446_27_.aFloat4896)
			    class446_37_.aFloat4896 = class446_27_.aFloat4896;
		    }
		}
		if (class446_36_.aFloat4897 > class446_38_.aFloat4897) {
		    if (class446_32_.aFloat4897 < 0.0F) {
			class446_37_.aFloat4897 += class446_26_.aFloat4897 * f;
			if (class446_37_.aFloat4897 > 0.0F)
			    class446_37_.aFloat4897 = 0.0F;
		    } else {
			class446_37_.aFloat4897 -= f * class446_26_.aFloat4897;
			if (class446_37_.aFloat4897 < 0.0F)
			    class446_37_.aFloat4897 = 0.0F;
		    }
		} else if (class446_34_.aFloat4897 < class446_27_.aFloat4897) {
		    if (class446_32_.aFloat4897 < 0.0F) {
			class446_37_.aFloat4897 -= f * class446_26_.aFloat4897;
			if (class446_37_.aFloat4897 < -class446_27_.aFloat4897)
			    class446_37_.aFloat4897 = -class446_27_.aFloat4897;
		    } else {
			class446_37_.aFloat4897 += class446_26_.aFloat4897 * f;
			if (class446_37_.aFloat4897 > class446_27_.aFloat4897)
			    class446_37_.aFloat4897 = class446_27_.aFloat4897;
		    }
		}
		class446_25_.method7242(class446_37_, 0.8F);
		if (f_33_ < f_31_ && class446_25_.method7230() < f_31_) {
		    class446.method7216(class446_24_);
		    class446_25_.method7217();
		} else
		    class446.method7221(Class446.method7238(class446_25_, f));
		class446_34_.method7260();
		class446_37_.method7260();
		class446_38_.method7260();
	    }
	}
    }
    
    static boolean method9467(int i, int i_39_) {
	return i == 1 || i == 16 || 17 == i || 7 == i;
    }
}
