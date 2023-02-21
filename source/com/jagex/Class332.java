/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public abstract class Class332 implements Interface33
{
    Class175 aClass175_3595;
    Class458 aClass458_3596;
    Class458 aClass458_3597;
    Class390 aClass390_3598;
    int anInt3599;
    long aLong3600;
    
    int method5809() {
	int i = Class159.aClass295_1755.method5326(-1974038851);
	int i_0_ = 100 * i;
	if (i == anInt3599 * 531235555 && i != 0) {
	    int i_1_ = Class159.aClass295_1755.method5321((short) 29903);
	    if (i_1_ > i) {
		long l = (aLong3600 * -3874163418420908933L
			  - Class159.aClass295_1755.method5324((byte) 101));
		if (l > 0L) {
		    long l_2_ = l * 10000L / (long) i * (long) (i_1_ - i);
		    long l_3_ = ((Class251.method4508((byte) 8)
				  - -3874163418420908933L * aLong3600)
				 * 10000L);
		    if (l_3_ < l_2_)
			i_0_
			    = (int) ((long) (i * 100)
				     + (long) (i_1_ - i) * l_3_ * 100L / l_2_);
		    else
			i_0_ = 100 * i_1_;
		}
	    }
	} else {
	    anInt3599 = i * -1339993397;
	    aLong3600 = Class251.method4508((byte) 8) * -6103727673150434637L;
	}
	return i_0_;
    }
    
    Class332(Class458 class458, Class458 class458_4_, Class390 class390) {
	aClass458_3597 = class458;
	aClass458_3596 = class458_4_;
	aClass390_3598 = class390;
    }
    
    public void method211(int i) {
	Class7 class7
	    = Class293.method5306(aClass458_3596,
				  -349107147 * aClass390_3598.anInt4061,
				  Class7.aClass404_53, -762232215);
	aClass175_3595
	    = (Class501.aClass182_5564.method3223
	       (class7,
		Class187.method3671(aClass458_3597,
				    aClass390_3598.anInt4061 * -349107147),
		true));
    }
    
    public boolean method213(int i) {
	boolean bool = true;
	if (!aClass458_3597.method7506(-349107147 * aClass390_3598.anInt4061,
				       840167039))
	    bool = false;
	if (!aClass458_3596.method7506(-349107147 * aClass390_3598.anInt4061,
				       -1862235663))
	    bool = false;
	return bool;
    }
    
    abstract void method5810(boolean bool, int i, int i_5_, int i_6_);
    
    abstract void method5811(boolean bool, int i, int i_7_, int i_8_);
    
    public boolean method210() {
	boolean bool = true;
	if (!aClass458_3597.method7506(-349107147 * aClass390_3598.anInt4061,
				       -1707175240))
	    bool = false;
	if (!aClass458_3596.method7506(-349107147 * aClass390_3598.anInt4061,
				       2018738910))
	    bool = false;
	return bool;
    }
    
    public void method209(boolean bool) {
	int i = ((aClass390_3598.aClass395_4068.method6521
		  (1827301945 * aClass390_3598.anInt4065,
		   -1202561691 * client.anInt11223, (byte) -73))
		 + aClass390_3598.anInt4063 * 1345009707);
	int i_9_ = ((aClass390_3598.aClass396_4062.method6529
		     (-797820993 * aClass390_3598.anInt4066,
		      client.anInt11224 * -1167554197, (byte) 100))
		    + aClass390_3598.anInt4064 * 1202152725);
	method5810(bool, i, i_9_, -1605532775);
	method5811(bool, i, i_9_, 1519582084);
	String string = Class159.aClass295_1755.method5327(-385195085);
	if (Class251.method4508((byte) 8) - -3874163418420908933L * aLong3600
	    > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class159.aClass295_1755.method5332(1812750373).anInt3399
		       * -631431271)
		      .append
		      (")").toString();
	aClass175_3595.method2838
	    (string, i + 1827301945 * aClass390_3598.anInt4065 / 2,
	     (4 + (-797820993 * aClass390_3598.anInt4066 / 2 + i_9_)
	      + aClass390_3598.anInt4067 * 1374070015),
	     aClass390_3598.anInt4069 * 512449097, -1, (byte) 101);
    }
    
    public void method70() {
	Class7 class7
	    = Class293.method5306(aClass458_3596,
				  -349107147 * aClass390_3598.anInt4061,
				  Class7.aClass404_53, -1098998456);
	aClass175_3595
	    = (Class501.aClass182_5564.method3223
	       (class7,
		Class187.method3671(aClass458_3597,
				    aClass390_3598.anInt4061 * -349107147),
		true));
    }
    
    abstract void method5812(boolean bool, int i, int i_10_);
    
    abstract void method5813(boolean bool, int i, int i_11_);
    
    abstract void method5814(boolean bool, int i, int i_12_);
    
    int method5815(byte i) {
	int i_13_ = Class159.aClass295_1755.method5326(-1838824942);
	int i_14_ = 100 * i_13_;
	if (i_13_ == anInt3599 * 531235555 && i_13_ != 0) {
	    int i_15_ = Class159.aClass295_1755.method5321((short) 1910);
	    if (i_15_ > i_13_) {
		long l = (aLong3600 * -3874163418420908933L
			  - Class159.aClass295_1755.method5324((byte) 44));
		if (l > 0L) {
		    long l_16_
			= l * 10000L / (long) i_13_ * (long) (i_15_ - i_13_);
		    long l_17_ = ((Class251.method4508((byte) 8)
				   - -3874163418420908933L * aLong3600)
				  * 10000L);
		    if (l_17_ < l_16_)
			i_14_ = (int) ((long) (i_13_ * 100)
				       + ((long) (i_15_ - i_13_) * l_17_ * 100L
					  / l_16_));
		    else
			i_14_ = 100 * i_15_;
		}
	    }
	} else {
	    anInt3599 = i_13_ * -1339993397;
	    aLong3600 = Class251.method4508((byte) 8) * -6103727673150434637L;
	}
	return i_14_;
    }
    
    public void method212(boolean bool, byte i) {
	int i_18_ = ((aClass390_3598.aClass395_4068.method6521
		      (1827301945 * aClass390_3598.anInt4065,
		       -1202561691 * client.anInt11223, (byte) -61))
		     + aClass390_3598.anInt4063 * 1345009707);
	int i_19_ = ((aClass390_3598.aClass396_4062.method6529
		      (-797820993 * aClass390_3598.anInt4066,
		       client.anInt11224 * -1167554197, (byte) 100))
		     + aClass390_3598.anInt4064 * 1202152725);
	method5810(bool, i_18_, i_19_, -1605532775);
	method5811(bool, i_18_, i_19_, 1514276520);
	String string = Class159.aClass295_1755.method5327(-1618159374);
	if (Class251.method4508((byte) 8) - -3874163418420908933L * aLong3600
	    > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class159.aClass295_1755.method5332(79738654).anInt3399
		       * -631431271)
		      .append
		      (")").toString();
	aClass175_3595.method2838
	    (string, i_18_ + 1827301945 * aClass390_3598.anInt4065 / 2,
	     (4 + (-797820993 * aClass390_3598.anInt4066 / 2 + i_19_)
	      + aClass390_3598.anInt4067 * 1374070015),
	     aClass390_3598.anInt4069 * 512449097, -1, (byte) 74);
    }
    
    int method5816() {
	int i = Class159.aClass295_1755.method5326(-1703839965);
	int i_20_ = 100 * i;
	if (i == anInt3599 * 531235555 && i != 0) {
	    int i_21_ = Class159.aClass295_1755.method5321((short) 13766);
	    if (i_21_ > i) {
		long l = (aLong3600 * -3874163418420908933L
			  - Class159.aClass295_1755.method5324((byte) 97));
		if (l > 0L) {
		    long l_22_ = l * 10000L / (long) i * (long) (i_21_ - i);
		    long l_23_ = ((Class251.method4508((byte) 8)
				   - -3874163418420908933L * aLong3600)
				  * 10000L);
		    if (l_23_ < l_22_)
			i_20_ = (int) ((long) (i * 100)
				       + ((long) (i_21_ - i) * l_23_ * 100L
					  / l_22_));
		    else
			i_20_ = 100 * i_21_;
		}
	    }
	} else {
	    anInt3599 = i * -1339993397;
	    aLong3600 = Class251.method4508((byte) 8) * -6103727673150434637L;
	}
	return i_20_;
    }
    
    int method5817() {
	int i = Class159.aClass295_1755.method5326(-1063824730);
	int i_24_ = 100 * i;
	if (i == anInt3599 * 531235555 && i != 0) {
	    int i_25_ = Class159.aClass295_1755.method5321((short) 19089);
	    if (i_25_ > i) {
		long l = (aLong3600 * -3874163418420908933L
			  - Class159.aClass295_1755.method5324((byte) 24));
		if (l > 0L) {
		    long l_26_ = l * 10000L / (long) i * (long) (i_25_ - i);
		    long l_27_ = ((Class251.method4508((byte) 8)
				   - -3874163418420908933L * aLong3600)
				  * 10000L);
		    if (l_27_ < l_26_)
			i_24_ = (int) ((long) (i * 100)
				       + ((long) (i_25_ - i) * l_27_ * 100L
					  / l_26_));
		    else
			i_24_ = 100 * i_25_;
		}
	    }
	} else {
	    anInt3599 = i * -1339993397;
	    aLong3600 = Class251.method4508((byte) 8) * -6103727673150434637L;
	}
	return i_24_;
    }
    
    abstract void method5818(boolean bool, int i, int i_28_);
    
    public static int method5819(CharSequence charsequence, int i, int i_29_) {
	return Class198.method3765(charsequence, i, true, 1267442617);
    }
    
    static void method5820(File file, byte[] is, int i, int i_30_)
	throws IOException {
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    static boolean method5821(int i, byte i_31_) {
	return 10 == i || i == 5 || i == 19;
    }
    
    static final void method5822(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
	int i_32_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class228.method4348(i_32_, -1662930941);
    }
}
