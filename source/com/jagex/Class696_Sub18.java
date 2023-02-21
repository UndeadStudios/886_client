/* Class696_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class696_Sub18 extends Class696
{
    void method14173(int i) {
	anInt8760 = 1908664649 * i;
    }
    
    public Class696_Sub18(int i, Class525_Sub30 class525_sub30) {
	super(i, class525_sub30);
    }
    
    public void method17133(byte i) {
	if (anInt8760 * -1757849351 < Class296.aClass296_3256.method80()
	    || anInt8760 * -1757849351 > Class296.aClass296_3254.method80())
	    anInt8760 = method14168(-594361814) * 1908664649;
    }
    
    int method14168(int i) {
	return Class296.aClass296_3256.method80();
    }
    
    public int method17134() {
	return anInt8760 * -1757849351;
    }
    
    public void method17135() {
	if (anInt8760 * -1757849351 < Class296.aClass296_3256.method80()
	    || anInt8760 * -1757849351 > Class296.aClass296_3254.method80())
	    anInt8760 = method14168(90096130) * 1908664649;
    }
    
    int method14167(int i, byte i_0_) {
	return 3;
    }
    
    int method14175() {
	return Class296.aClass296_3256.method80();
    }
    
    public int method17136(short i) {
	return anInt8760 * -1757849351;
    }
    
    void method14169(int i, int i_1_) {
	anInt8760 = 1908664649 * i;
    }
    
    void method14174(int i) {
	anInt8760 = 1908664649 * i;
    }
    
    public Class696_Sub18(Class525_Sub30 class525_sub30) {
	super(class525_sub30);
    }
    
    public void method17137() {
	if (anInt8760 * -1757849351 < Class296.aClass296_3256.method80()
	    || anInt8760 * -1757849351 > Class296.aClass296_3254.method80())
	    anInt8760 = method14168(296163595) * 1908664649;
    }
    
    public int method17138() {
	return anInt8760 * -1757849351;
    }
    
    public int method17139() {
	return anInt8760 * -1757849351;
    }
    
    int method14172(int i) {
	return 3;
    }
    
    public int method17140() {
	return anInt8760 * -1757849351;
    }
    
    static void method17141(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			    int i_6_, Class604 class604, int i_7_) {
	Class525_Sub12 class525_sub12 = null;
	for (Class525_Sub12 class525_sub12_8_
		 = (Class525_Sub12) Class525_Sub12.aClass709_10526
					.method14372((short) -20234);
	     class525_sub12_8_ != null;
	     class525_sub12_8_
		 = ((Class525_Sub12)
		    Class525_Sub12.aClass709_10526.method14353(-1213104893))) {
	    if (class525_sub12_8_.anInt10527 * 1334650435 == i
		&& i_2_ == -1168021715 * class525_sub12_8_.anInt10514
		&& i_3_ == class525_sub12_8_.anInt10512 * -1370300329
		&& i_4_ == class525_sub12_8_.anInt10513 * -833422411) {
		class525_sub12 = class525_sub12_8_;
		break;
	    }
	}
	if (class525_sub12 == null) {
	    class525_sub12 = new Class525_Sub12();
	    class525_sub12.anInt10527 = 1175967339 * i;
	    class525_sub12.anInt10513 = i_4_ * 1323719325;
	    class525_sub12.anInt10514 = 527073445 * i_2_;
	    class525_sub12.anInt10512 = i_3_ * 681315175;
	    Class525_Sub12.aClass709_10526.method14345(class525_sub12,
						       (byte) 0);
	}
	class525_sub12.anInt10519 = 126087467 * i_5_;
	class525_sub12.anInt10521 = 2029844103 * i_6_;
	class525_sub12.aClass604_10522 = class604;
	class525_sub12.aBool10515 = true;
	class525_sub12.aBool10524 = false;
    }
    
    public static int method17142(int i, byte i_9_) {
	int i_10_ = i >>> 1;
	i_10_ |= i_10_ >>> 1;
	i_10_ |= i_10_ >>> 2;
	i_10_ |= i_10_ >>> 4;
	i_10_ |= i_10_ >>> 8;
	i_10_ |= i_10_ >>> 16;
	return i & (i_10_ ^ 0xffffffff);
    }
}
