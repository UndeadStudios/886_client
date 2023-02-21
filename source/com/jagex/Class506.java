/* Class506 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.io.OutputStream;

public class Class506
{
    int anInt5606;
    int anInt5607 = 0;
    byte[] aByteArray5608;
    int anInt5609;
    OutputStream anOutputStream5610;
    
    public void method8323(int i) {
	if (aByteArray5608 == null || anInt5607 * -116334291 != i)
	    aByteArray5608 = new byte[i];
	anInt5607 = 16324261 * i;
	anInt5606 = 0;
	anInt5609 = 0;
    }
    
    public void method8324(int i, int i_0_) {
	if (aByteArray5608 == null || anInt5607 * -116334291 != i)
	    aByteArray5608 = new byte[i];
	anInt5607 = 16324261 * i;
	anInt5606 = 0;
	anInt5609 = 0;
    }
    
    public void method8325(OutputStream outputstream, int i)
	throws IOException {
	method8326(-424319811);
	anOutputStream5610 = outputstream;
    }
    
    public void method8326(int i) throws IOException {
	method8328(1583179793);
	anOutputStream5610 = null;
    }
    
    public byte method8327(int i) {
	int i_1_ = -2077029715 * anInt5606 - i - 1;
	if (i_1_ < 0)
	    i_1_ += anInt5607 * -116334291;
	return aByteArray5608[i_1_];
    }
    
    public void method8328(int i) throws IOException {
	int i_2_ = anInt5606 * -2077029715 - anInt5609 * -822572035;
	if (i_2_ != 0) {
	    anOutputStream5610.write(aByteArray5608, -822572035 * anInt5609,
				     i_2_);
	    if (anInt5606 * -2077029715 >= -116334291 * anInt5607)
		anInt5606 = 0;
	    anInt5609 = anInt5606 * 14041201;
	}
    }
    
    public void method8329(int i, int i_3_, byte i_4_) throws IOException {
	int i_5_ = -2077029715 * anInt5606 - i - 1;
	if (i_5_ < 0)
	    i_5_ += anInt5607 * -116334291;
	for (/**/; 0 != i_3_; i_3_--) {
	    if (i_5_ >= anInt5607 * -116334291)
		i_5_ = 0;
	    aByteArray5608[(anInt5606 += 1418258725) * -2077029715 - 1]
		= aByteArray5608[i_5_++];
	    if (-2077029715 * anInt5606 >= -116334291 * anInt5607)
		method8328(2080962389);
	}
    }
    
    public void method8330(byte i, int i_6_) throws IOException {
	aByteArray5608[(anInt5606 += 1418258725) * -2077029715 - 1] = i;
	if (-2077029715 * anInt5606 >= anInt5607 * -116334291)
	    method8328(2054206078);
    }
    
    public void method8331() throws IOException {
	method8328(1155270170);
	anOutputStream5610 = null;
    }
    
    public byte method8332(int i, int i_7_) {
	int i_8_ = -2077029715 * anInt5606 - i - 1;
	if (i_8_ < 0)
	    i_8_ += anInt5607 * -116334291;
	return aByteArray5608[i_8_];
    }
    
    public void method8333(boolean bool, byte i) {
	if (!bool) {
	    anInt5609 = 0;
	    anInt5606 = 0;
	}
    }
    
    public void method8334(OutputStream outputstream) throws IOException {
	method8326(48565844);
	anOutputStream5610 = outputstream;
    }
    
    public void method8335(OutputStream outputstream) throws IOException {
	method8326(-574276281);
	anOutputStream5610 = outputstream;
    }
    
    public void method8336() throws IOException {
	method8328(742487490);
	anOutputStream5610 = null;
    }
    
    public void method8337(boolean bool) {
	if (!bool) {
	    anInt5609 = 0;
	    anInt5606 = 0;
	}
    }
    
    public void method8338(boolean bool) {
	if (!bool) {
	    anInt5609 = 0;
	    anInt5606 = 0;
	}
    }
    
    public void method8339(int i) {
	if (aByteArray5608 == null || anInt5607 * -116334291 != i)
	    aByteArray5608 = new byte[i];
	anInt5607 = 16324261 * i;
	anInt5606 = 0;
	anInt5609 = 0;
    }
    
    public void method8340() throws IOException {
	int i = anInt5606 * -2077029715 - anInt5609 * -822572035;
	if (i != 0) {
	    anOutputStream5610.write(aByteArray5608, -822572035 * anInt5609,
				     i);
	    if (anInt5606 * -2077029715 >= -116334291 * anInt5607)
		anInt5606 = 0;
	    anInt5609 = anInt5606 * 14041201;
	}
    }
    
    public void method8341(int i, int i_9_) throws IOException {
	int i_10_ = -2077029715 * anInt5606 - i - 1;
	if (i_10_ < 0)
	    i_10_ += anInt5607 * -116334291;
	for (/**/; 0 != i_9_; i_9_--) {
	    if (i_10_ >= anInt5607 * -116334291)
		i_10_ = 0;
	    aByteArray5608[(anInt5606 += 1418258725) * -2077029715 - 1]
		= aByteArray5608[i_10_++];
	    if (-2077029715 * anInt5606 >= -116334291 * anInt5607)
		method8328(730500781);
	}
    }
    
    public void method8342(byte i) throws IOException {
	aByteArray5608[(anInt5606 += 1418258725) * -2077029715 - 1] = i;
	if (-2077029715 * anInt5606 >= anInt5607 * -116334291)
	    method8328(1969218907);
    }
    
    public byte method8343(int i) {
	int i_11_ = -2077029715 * anInt5606 - i - 1;
	if (i_11_ < 0)
	    i_11_ += anInt5607 * -116334291;
	return aByteArray5608[i_11_];
    }
    
    public void method8344(int i) {
	if (aByteArray5608 == null || anInt5607 * -116334291 != i)
	    aByteArray5608 = new byte[i];
	anInt5607 = 16324261 * i;
	anInt5606 = 0;
	anInt5609 = 0;
    }
}
