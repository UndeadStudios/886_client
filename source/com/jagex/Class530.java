/* Class530 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class530
{
    Class536[] aClass536Array7142;
    static final int anInt7143 = 4096;
    static byte[] aByteArray7144 = new byte[2048];
    Class330[] aClass330Array7145;
    public static int anInt7146;
    
    static {
	int i = 22;
	int i_0_ = 2;
	aByteArray7144[0] = (byte) 0;
	aByteArray7144[1] = (byte) 1;
	for (int i_1_ = 2; i_1_ < i; i_1_++) {
	    int i_2_ = 1 << (i_1_ >> 1) - 1;
	    int i_3_ = 0;
	    while (i_3_ < i_2_) {
		aByteArray7144[i_0_] = (byte) i_1_;
		i_3_++;
		i_0_++;
	    }
	}
    }
    
    Class530() {
	Class261.method4765((byte) 5);
	aClass536Array7142 = new Class536[4096];
	new Class325();
	aClass330Array7145 = new Class330[4];
	new Class330(4);
	new Class522_Sub1(this);
	new Class522_Sub1(this);
	new Class534(this);
	for (int i = 0; i < 4096; i++)
	    aClass536Array7142[i] = new Class536(this);
	for (int i = 0; i < 4; i++)
	    aClass330Array7145[i] = new Class330(6);
    }
    
    static final void method8792(Class683 class683, int i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_4_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_4_ >> 16];
	Class227.method4261(class259, class245, class683, -810732978);
    }
}
