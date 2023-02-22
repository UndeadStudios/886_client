/* Class603 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class603
{
    static final int anInt7947 = 8;
    static final int anInt7948 = 1;
    static final int anInt7949 = 4;
    static final int anInt7950 = 2;
    public int anInt7951;
    int anInt7952;
    public int anInt7953;
    
    public boolean method9964() {
	return (anInt7951 * 36102555 & 0x8) != 0;
    }
    
    public boolean method9965(byte i) {
	return 0 != (36102555 * anInt7951 & 0x1);
    }
    
    public boolean method9966(int i) {
	return 0 != (36102555 * anInt7951 & 0x2);
    }
    
    public boolean method9967(int i) {
	return 0 != (anInt7951 * 36102555 & 0x4);
    }
    
    public boolean method9968(int i) {
	return (anInt7951 * 36102555 & 0x8) != 0;
    }
    
    public boolean method9969() {
	return 0 != (36102555 * anInt7951 & 0x1);
    }
    
    Class603() {
	/* empty */
    }
    
    public boolean method9970() {
	return 0 != (36102555 * anInt7951 & 0x2);
    }
    
    public boolean method9971() {
	return 0 != (anInt7951 * 36102555 & 0x4);
    }
    
    public boolean method9972() {
	return 0 != (anInt7951 * 36102555 & 0x4);
    }
    
    public boolean method9973() {
	return (anInt7951 * 36102555 & 0x8) != 0;
    }
    
    public boolean method9974() {
	return 0 != (anInt7951 * 36102555 & 0x4);
    }
    
    public boolean method9975() {
	return (anInt7951 * 36102555 & 0x8) != 0;
    }
    
    static final void method9976(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	class683.anInt8662 -= -1189665054;
	int i_0_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	Class7 class7
	    = Class7.aClass404_53.method6580(client.anInterface50_11252, i_1_,
					     -1369893856);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class7.method566(string, i_0_, Class229.aClass157Array2364,
			       805534933);
    }
    
    static final void method9977(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	client.anInt11154 = 644058157 * (class683.anIntArray8661
					 [class683.anInt8662 * 501271953]);
	client.anInt11253
	    = (-904156513
	       * class683.anIntArray8661[1 + 501271953 * class683.anInt8662]);
    }
    
    static final void method9978(Class683 class683, byte i) {
	class683.anInt8662 -= 1552651121;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method9979(Class683 class683, byte i) {
	client.aClass259_11271 = null;
	client.aClass259_11272 = null;
    }
    
    public static void method9980(Interface60 interface60, short i) {
	if (null != Class509.anInterface60_5660)
	    throw new IllegalStateException("");
	Class509.anInterface60_5660 = interface60;
    }
    
    public static void method9981(int i, byte i_2_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(9, (long) i);
	class525_sub16_sub10.method18350((byte) 41);
    }
    
    static Class525_Sub16_Sub6 method9982(JS5 class458, int i,
                                          byte i_3_) {
	RSBuffer class525_sub38
	    = new RSBuffer(class458.getFile(0, i, 569520864));
	return WorldTile.method1433(class525_sub38, i, 1094485096);
    }
}
