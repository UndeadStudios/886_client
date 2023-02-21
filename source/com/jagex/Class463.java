/* Class463 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class463
{
    Class697 aClass697_5097 = new Class697();
    static final int anInt5098 = 500;
    static final int anInt5099 = 500;
    static final int anInt5100 = 102400;
    public volatile int anInt5101;
    static final int anInt5102 = 4;
    static final int anInt5103 = 5;
    Class697 aClass697_5104 = new Class697();
    Class697 aClass697_5105 = new Class697();
    Class697 aClass697_5106 = new Class697();
    int anInt5107;
    long aLong5108;
    RSBuffer aClass525_Sub38_5109 = new RSBuffer(6);
    byte aByte5110 = 0;
    public volatile int anInt5111;
    public volatile int anInt5112;
    RSBuffer aClass525_Sub38_5113;
    public volatile int anInt5114 = 0;
    RSBuffer aClass525_Sub38_5115;
    static final int anInt5116 = 5;
    int anInt5117;
    Class525_Sub16_Sub12_Sub1 aClass525_Sub16_Sub12_Sub1_5118;
    public static int anInt5119;
    
    public boolean method7610() {
	return method7615((byte) -122) >= 500;
    }
    
    Class525_Sub16_Sub12_Sub1 method7611(int i, int i_0_, byte i_1_,
					 boolean bool, int i_2_) {
	long l = (long) i_0_ + ((long) i << 32);
	Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
	    = new Class525_Sub16_Sub12_Sub1();
	class525_sub16_sub12_sub1.aLong10553 = l * 7693047446987161823L;
	class525_sub16_sub12_sub1.aByte12192 = i_1_;
	class525_sub16_sub12_sub1.aBool11834 = bool;
	if (bool) {
	    if (method7615((byte) -122) >= 500)
		throw new RuntimeException();
	    aClass697_5097.method14184(class525_sub16_sub12_sub1, 728171782);
	} else {
	    if (method7636(-1864364560) >= 500)
		throw new RuntimeException();
	    aClass697_5105.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	return class525_sub16_sub12_sub1;
    }
    
    public boolean method7612(int i) {
	return method7636(-1833315454) >= 500;
    }
    
    public boolean method7613(int i) {
	return method7615((byte) -122) >= 500;
    }
    
    public abstract void method7614(byte i);
    
    public int method7615(byte i) {
	return (aClass697_5097.method14189(-2091756683)
		+ aClass697_5104.method14189(-1982043973));
    }
    
    public abstract void method7616(Object object, boolean bool);
    
    public abstract void method7617();
    
    public abstract void method7618(Object object, boolean bool, int i);
    
    public abstract void method7619(boolean bool, int i);
    
    public abstract void method7620(byte i);
    
    public int method7621() {
	return (aClass697_5097.method14189(-1930209269)
		+ aClass697_5104.method14189(-2139653946));
    }
    
    public abstract void method7622(int i);
    
    public boolean method7623() {
	return method7636(-2114733120) >= 500;
    }
    
    public boolean method7624() {
	return method7615((byte) -122) >= 500;
    }
    
    public boolean method7625() {
	return method7615((byte) -122) >= 500;
    }
    
    public abstract boolean method7626();
    
    public int method7627() {
	return (aClass697_5097.method14189(-1997339103)
		+ aClass697_5104.method14189(-1891037458));
    }
    
    public abstract void method7628(boolean bool);
    
    public abstract void method7629(Object object, boolean bool);
    
    abstract void method7630(int i, int i_3_, int i_4_);
    
    abstract void method7631(int i, int i_5_);
    
    public abstract boolean method7632(int i);
    
    public abstract boolean method7633();
    
    public abstract void method7634(Object object, boolean bool);
    
    public abstract void method7635(Object object, boolean bool);
    
    int method7636(int i) {
	return (aClass697_5105.method14189(-1962947091)
		+ aClass697_5106.method14189(-1884077115));
    }
    
    Class463() {
	anInt5112 = 0;
	anInt5111 = -1064910113;
	anInt5101 = 371593359;
	aClass525_Sub38_5115 = new RSBuffer(5);
	aClass525_Sub38_5113 = new RSBuffer(5);
	anInt5117 = 0;
	aClass525_Sub16_Sub12_Sub1_5118 = null;
    }
    
    public abstract void method7637(Object object, boolean bool);
    
    abstract void method7638(int i, int i_6_);
    
    public abstract void method7639(boolean bool);
    
    abstract void method7640(int i, int i_7_);
    
    public abstract void method7641();
    
    abstract void method7642(int i, int i_8_);
    
    public abstract void method7643();
    
    public abstract void method7644();
    
    public abstract void method7645();
    
    public abstract void method7646();
    
    public static void method7647(short i) {
	if (Class15.aBool170) {
	    if (Class15.anInt171 * -1006168075
		< Class478.anInt5201 * -1122711783)
		Class15.anInt171 = -919695339 * Class478.anInt5201;
	    while (-1006168075 * Class15.anInt171
		   < -192862351 * Class617.anInt8063) {
		Class603_Sub1 class603_sub1
		    = Class525_Sub28.method16401((-1006168075
						  * Class15.anInt171),
						 1711252198);
		if (class603_sub1 == null
		    || class603_sub1.anInt10882 * 1803394105 != -1)
		    Class15.anInt171 += -1096311715;
		else {
		    if (Class15.aClass646_180 == null)
			Class15.aClass646_180
			    = (client.aClass642_11136.method10590
			       (class603_sub1.aString10880, 665490998));
		    int i_9_ = 1053460905 * Class15.aClass646_180.anInt8356;
		    if (i_9_ == -1)
			break;
		    class603_sub1.anInt10882 = i_9_ * -1956277751;
		    Class15.anInt171 += -1096311715;
		    Class15.aClass646_180 = null;
		}
	    }
	}
    }
}
