/* Class555 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.io.OutputStream;

public class Class555 implements Runnable
{
    byte[] aByteArray7452;
    OutputStream anOutputStream7453;
    int anInt7454;
    Thread aThread7455;
    int anInt7456;
    int anInt7457 = 0;
    IOException anIOException7458;
    boolean aBool7459;
    public static JS5 idx_49;
    
    Class555(OutputStream outputstream, int i) {
	anInt7454 = 0;
	anOutputStream7453 = outputstream;
	anInt7456 = (i + 1) * 1834560087;
	aByteArray7452 = new byte[anInt7456 * -2056035993];
	aThread7455 = new Thread(this);
	aThread7455.setDaemon(true);
	aThread7455.start();
    }
    
    void method9225() {
	anOutputStream7453 = new OutputStream_Sub1();
    }
    
    public void run() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7458 != null)
			return;
		    if (anInt7457 * 258507847 <= anInt7454 * -468883683)
			i = -468883683 * anInt7454 - anInt7457 * 258507847;
		    else
			i = (-2056035993 * anInt7456 - 258507847 * anInt7457
			     + anInt7454 * -468883683);
		    if (i > 0)
			break;
		    try {
			anOutputStream7453.flush();
		    } catch (IOException ioexception) {
			anIOException7458 = ioexception;
			return;
		    }
		    if (method9226(2115161345))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (i + 258507847 * anInt7457 <= -2056035993 * anInt7456)
		    anOutputStream7453.write(aByteArray7452,
					     258507847 * anInt7457, i);
		else {
		    int i_0_ = anInt7456 * -2056035993 - 258507847 * anInt7457;
		    anOutputStream7453.write(aByteArray7452,
					     anInt7457 * 258507847, i_0_);
		    anOutputStream7453.write(aByteArray7452, 0, i - i_0_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7458 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7457 = ((i + anInt7457 * 258507847)
			     % (anInt7456 * -2056035993) * -2051938953);
	    }
	} while (!method9226(2115161345));
    }
    
    boolean method9226(int i) {
	if (aBool7459) {
	    try {
		anOutputStream7453.close();
		if (anIOException7458 == null)
		    anIOException7458 = new IOException("");
	    } catch (IOException ioexception) {
		if (anIOException7458 == null)
		    anIOException7458 = new IOException(ioexception);
	    }
	    return true;
	}
	return false;
    }
    
    void method9227(short i) {
	synchronized (this) {
	    aBool7459 = true;
	    this.notifyAll();
	}
	try {
	    aThread7455.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method9228(int i) {
	anOutputStream7453 = new OutputStream_Sub1();
    }
    
    public void method9229() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7458 != null)
			return;
		    if (anInt7457 * 258507847 <= anInt7454 * -468883683)
			i = -468883683 * anInt7454 - anInt7457 * 258507847;
		    else
			i = (-2056035993 * anInt7456 - 258507847 * anInt7457
			     + anInt7454 * -468883683);
		    if (i > 0)
			break;
		    try {
			anOutputStream7453.flush();
		    } catch (IOException ioexception) {
			anIOException7458 = ioexception;
			return;
		    }
		    if (method9226(2115161345))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (i + 258507847 * anInt7457 <= -2056035993 * anInt7456)
		    anOutputStream7453.write(aByteArray7452,
					     258507847 * anInt7457, i);
		else {
		    int i_1_ = anInt7456 * -2056035993 - 258507847 * anInt7457;
		    anOutputStream7453.write(aByteArray7452,
					     anInt7457 * 258507847, i_1_);
		    anOutputStream7453.write(aByteArray7452, 0, i - i_1_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7458 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7457 = ((i + anInt7457 * 258507847)
			     % (anInt7456 * -2056035993) * -2051938953);
	    }
	} while (!method9226(2115161345));
    }
    
    boolean method9230() {
	if (aBool7459) {
	    try {
		anOutputStream7453.close();
		if (anIOException7458 == null)
		    anIOException7458 = new IOException("");
	    } catch (IOException ioexception) {
		if (anIOException7458 == null)
		    anIOException7458 = new IOException(ioexception);
	    }
	    return true;
	}
	return false;
    }
    
    boolean method9231() {
	if (aBool7459) {
	    try {
		anOutputStream7453.close();
		if (anIOException7458 == null)
		    anIOException7458 = new IOException("");
	    } catch (IOException ioexception) {
		if (anIOException7458 == null)
		    anIOException7458 = new IOException(ioexception);
	    }
	    return true;
	}
	return false;
    }
    
    boolean method9232() {
	if (aBool7459) {
	    try {
		anOutputStream7453.close();
		if (anIOException7458 == null)
		    anIOException7458 = new IOException("");
	    } catch (IOException ioexception) {
		if (anIOException7458 == null)
		    anIOException7458 = new IOException(ioexception);
	    }
	    return true;
	}
	return false;
    }
    
    void method9233(byte[] is, int i, int i_2_) throws IOException {
	if (i_2_ < 0 || i < 0 || i_2_ + i > is.length)
	    throw new IOException();
	synchronized (this) {
	    if (null != anIOException7458)
		throw new IOException(anIOException7458.toString());
	    int i_3_;
	    if (anInt7457 * 258507847 <= anInt7454 * -468883683)
		i_3_ = 258507847 * anInt7457 + (-2056035993 * anInt7456
						- anInt7454 * -468883683) - 1;
	    else
		i_3_ = anInt7457 * 258507847 - -468883683 * anInt7454 - 1;
	    if (i_3_ < i_2_)
		throw new IOException("");
	    if (i_2_ + -468883683 * anInt7454 <= -2056035993 * anInt7456)
		System.arraycopy(is, i, aByteArray7452, -468883683 * anInt7454,
				 i_2_);
	    else {
		int i_4_ = anInt7456 * -2056035993 - anInt7454 * -468883683;
		System.arraycopy(is, i, aByteArray7452, anInt7454 * -468883683,
				 i_4_);
		System.arraycopy(is, i_4_ + i, aByteArray7452, 0, i_2_ - i_4_);
	    }
	    anInt7454 = 265589557 * ((anInt7454 * -468883683 + i_2_)
				     % (-2056035993 * anInt7456));
	    this.notifyAll();
	}
    }
    
    void method9234() {
	synchronized (this) {
	    aBool7459 = true;
	    this.notifyAll();
	}
	try {
	    aThread7455.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method9235() {
	synchronized (this) {
	    aBool7459 = true;
	    this.notifyAll();
	}
	try {
	    aThread7455.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method9236(byte[] is, int i, int i_5_, short i_6_)
	throws IOException {
	if (i_5_ < 0 || i < 0 || i_5_ + i > is.length)
	    throw new IOException();
	synchronized (this) {
	    if (null != anIOException7458)
		throw new IOException(anIOException7458.toString());
	    int i_7_;
	    if (anInt7457 * 258507847 <= anInt7454 * -468883683)
		i_7_ = 258507847 * anInt7457 + (-2056035993 * anInt7456
						- anInt7454 * -468883683) - 1;
	    else
		i_7_ = anInt7457 * 258507847 - -468883683 * anInt7454 - 1;
	    if (i_7_ < i_5_)
		throw new IOException("");
	    if (i_5_ + -468883683 * anInt7454 <= -2056035993 * anInt7456)
		System.arraycopy(is, i, aByteArray7452, -468883683 * anInt7454,
				 i_5_);
	    else {
		int i_8_ = anInt7456 * -2056035993 - anInt7454 * -468883683;
		System.arraycopy(is, i, aByteArray7452, anInt7454 * -468883683,
				 i_8_);
		System.arraycopy(is, i_8_ + i, aByteArray7452, 0, i_5_ - i_8_);
	    }
	    anInt7454 = 265589557 * ((anInt7454 * -468883683 + i_5_)
				     % (-2056035993 * anInt7456));
	    this.notifyAll();
	}
    }
    
    static void method9237(Class245 class245, int i, int i_9_, int i_10_,
			   boolean bool, Class683 class683, int i_11_) {
	if (0 == i_9_)
	    throw new RuntimeException();
	Class259 class259 = class245.aClass259Array2426[i];
	if (class259.aClass259Array2655 == null) {
	    class259.aClass259Array2655 = new Class259[i_10_ + 1];
	    class259.aClass259Array2755 = class259.aClass259Array2655;
	}
	if (class259.aClass259Array2655.length <= i_10_) {
	    if (class259.aClass259Array2755 == class259.aClass259Array2655) {
		Class259[] class259s = new Class259[i_10_ + 1];
		for (int i_12_ = 0; i_12_ < class259.aClass259Array2655.length;
		     i_12_++)
		    class259s[i_12_] = class259.aClass259Array2655[i_12_];
		class259.aClass259Array2655 = class259.aClass259Array2755
		    = class259s;
	    } else {
		Class259[] class259s = new Class259[i_10_ + 1];
		Class259[] class259s_13_ = new Class259[i_10_ + 1];
		for (int i_14_ = 0; i_14_ < class259.aClass259Array2655.length;
		     i_14_++) {
		    class259s[i_14_] = class259.aClass259Array2655[i_14_];
		    class259s_13_[i_14_] = class259.aClass259Array2755[i_14_];
		}
		class259.aClass259Array2655 = class259s;
		class259.aClass259Array2755 = class259s_13_;
	    }
	}
	if (i_10_ > 0 && class259.aClass259Array2655[i_10_ - 1] == null)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i_10_ - 1).toString());
	Class259 class259_15_ = new Class259();
	class259_15_.anInt2590 = -1023461563 * i_9_;
	class259_15_.anInt2606
	    = (class259_15_.anInt2588 = class259.anInt2588 * 1) * 1974686083;
	class259_15_.anInt2576 = i_10_ * 1076058739;
	class259.aClass259Array2655[i_10_] = class259_15_;
	if (class259.aClass259Array2655 != class259.aClass259Array2755)
	    class259.aClass259Array2755[i_10_] = class259_15_;
	Class679 class679;
	if (bool)
	    class679 = class683.aClass679_8642;
	else
	    class679 = class683.aClass679_8658;
	class679.aClass245_8622 = class245;
	class679.aClass259_8623 = class259_15_;
	Class649.method10708(class259, (byte) 0);
    }
    
    static final void method9238(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -30526621 * class259.anInt2620;
    }
    
    static void method9239(Class182 class182, int i, int i_16_, int i_17_,
			   int i_18_, int i_19_, byte i_20_) {
	if ((Class685.aClass157_8685 == null || Class61.aClass157_669 == null
	     || Class64.aClass157_696 == null)
	    && Class462.idx_8
		   .method7506(Class61.anInt665 * 1848940705, -2102979111)
	    && Class462.idx_8
		   .method7506(Class493.anInt5299 * 948400913, 913118940)
	    && Class462.idx_8.method7506(-76170861 * Class61.anInt678,
						  -648244921)) {
	    Class173 class173
		= Class187.method3667(Class462.idx_8,
				      948400913 * Class493.anInt5299, 0);
	    Class61.aClass157_669 = class182.method3216(class173, true);
	    class173.method2773();
	    Class31.aClass157_304 = class182.method3216(class173, true);
	    Class685.aClass157_8685
		= class182.method3216(Class187.method3667((Class462
							   .idx_8),
							  (1848940705
							   * Class61.anInt665),
							  0),
				      true);
	    Class173 class173_21_
		= Class187.method3667(Class462.idx_8,
				      -76170861 * Class61.anInt678, 0);
	    Class64.aClass157_696 = class182.method3216(class173_21_, true);
	    class173_21_.method2773();
	    Class590.aClass157_7814 = class182.method3216(class173_21_, true);
	}
	if (null != Class685.aClass157_8685 && null != Class61.aClass157_669
	    && null != Class64.aClass157_696) {
	    int i_22_ = ((i_17_ - Class64.aClass157_696.method2503() * 2)
			 / Class685.aClass157_8685.method2503());
	    for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
		Class685.aClass157_8685.method2518
		    ((i + Class64.aClass157_696.method2503()
		      + i_23_ * Class685.aClass157_8685.method2503()),
		     i_16_ + i_18_ - Class685.aClass157_8685.method2471());
	    int i_24_ = ((i_18_ - i_19_ - Class64.aClass157_696.method2471())
			 / Class61.aClass157_669.method2471());
	    for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
		Class61.aClass157_669.method2518(i, (i_19_ + i_16_
						     + (i_25_
							* Class61
							      .aClass157_669
							      .method2471())));
		Class31.aClass157_304.method2518
		    (i + i_17_ - Class31.aClass157_304.method2503(),
		     (i_19_ + i_16_
		      + i_25_ * Class61.aClass157_669.method2471()));
	    }
	    Class64.aClass157_696.method2518(i, (i_16_ + i_18_
						 - Class64.aClass157_696
						       .method2471()));
	    Class590.aClass157_7814.method2518
		(i_17_ + i - Class64.aClass157_696.method2503(),
		 i_18_ + i_16_ - Class64.aClass157_696.method2471());
	}
    }
    
    static int method9240(byte[] is, int i, int i_26_, byte i_27_) {
	int i_28_ = -1;
	for (int i_29_ = i; i_29_ < i_26_; i_29_++)
	    i_28_ = i_28_ >>> 8 ^ (RSBuffer.anIntArray10830
				   [(i_28_ ^ is[i_29_]) & 0xff]);
	i_28_ ^= 0xffffffff;
	return i_28_;
    }
    
    public static void method9241(int i) {
	Class201.aClass10_2204.method688((short) -10644);
	Class201.aClass709_2201.method14344(-497787086);
	Class201.aClass202Array2206 = null;
	Class201.aClass205Array2202 = null;
	Class201.aClass193Array2203 = null;
	Class201.aClass191Array2210 = null;
	Class201.aClass198Array2205 = null;
	Class201.anInt2207 = 247241703;
	Class201.anInt2208 = 0;
	Class201.anInt2200 = 0;
	Class387.aClass190_4036 = null;
	Class201.anInt2209 = -831896571;
	Class201.anInt2212 = -44052937;
	if (Class201.aBool2213) {
	    client.aShort11175 = Class45.aShort350;
	    client.aShort11355 = Class201.aShort2211;
	    client.aShort11352 = Class646.aShort8358;
	    client.aShort11353 = Class35.aShort311;
	    Class201.aBool2213 = false;
	}
    }
    
    static void method9242(Class245 class245, Class259 class259, int i) {
	if (null != class259) {
	    if (-1 != class259.anInt2576 * 1534974651) {
		Class259 class259_30_
		    = class245.method4473(-1549235523 * class259.anInt2606,
					  -2129541898);
		if (null != class259_30_) {
		    if (class259_30_.aClass259Array2655
			== class259_30_.aClass259Array2755) {
			class259_30_.aClass259Array2755
			    = (new Class259
			       [class259_30_.aClass259Array2655.length]);
			class259_30_.aClass259Array2755
			    [class259_30_.aClass259Array2755.length - 1]
			    = class259;
			Class692.method14119(class259_30_.aClass259Array2655,
					     0,
					     class259_30_.aClass259Array2755,
					     0,
					     class259.anInt2576 * 1534974651);
			Class692.method14119(class259_30_.aClass259Array2655,
					     (class259.anInt2576 * 1534974651
					      + 1),
					     class259_30_.aClass259Array2755,
					     class259.anInt2576 * 1534974651,
					     ((class259_30_
					       .aClass259Array2655).length
					      - class259.anInt2576 * 1534974651
					      - 1));
		    } else {
			int i_31_ = 0;
			Class259[] class259s;
			for (class259s = class259_30_.aClass259Array2755;
			     (i_31_ < class259s.length
			      && class259 != class259s[i_31_]);
			     i_31_++) {
			    /* empty */
			}
			if (i_31_ < class259s.length) {
			    Class692.method14119(class259s, i_31_ + 1,
						 class259s, i_31_,
						 class259s.length - i_31_ - 1);
			    class259s[(class259_30_.aClass259Array2755.length
				       - 1)]
				= class259;
			}
		    }
		}
	    } else {
		Class259[] class259s = class245.method4472((byte) 2);
		int i_32_;
		for (i_32_ = 0;
		     i_32_ < class259s.length && class259s[i_32_] != class259;
		     i_32_++) {
		    /* empty */
		}
		if (i_32_ < class259s.length) {
		    Class692.method14119(class259s, 1 + i_32_, class259s,
					 i_32_, class259s.length - i_32_ - 1);
		    class259s[class259s.length - 1] = class259;
		}
	    }
	}
    }
}
