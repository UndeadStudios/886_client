/* Class522 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class522
{
    Class330[] aClass330Array7095;
    Class330[] aClass330Array7096;
    Class530 this$0;
    public static boolean aBool7097;
    
    Class522(Class530 class530) {
	this$0 = class530;
	aClass330Array7095 = new Class330[16];
	aClass330Array7096 = new Class330[16];
	new Class330(8);
	for (int i = 0; i < 16; i++) {
	    aClass330Array7095[i] = new Class330(3);
	    aClass330Array7096[i] = new Class330(3);
	}
    }
    
    static final void method8699(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class39.method1013(class259, class683, 432387337);
    }
    
    static final void method8700(Class683 class683, short i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (1819257147 * client.anInt11362 == 2
	    && i_1_ < client.anInt11204 * -883281325)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= client.aClass66Array11356[i_1_].anInt709 * -221418213;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method8701(int i) {
	if (-1 != client.anInt11260 * -750203937) {
	    int i_2_ = Class509.aClass569_5662.method9498(1206297913);
	    int i_3_ = Class509.aClass569_5662.method9499(501271953);
	    Class525_Sub41 class525_sub41
		= ((Class525_Sub41)
		   client.aClass709_11288.method14372((short) -17279));
	    if (class525_sub41 != null) {
		i_2_ = class525_sub41.method16870((byte) -41);
		i_3_ = class525_sub41.method16858((byte) 108);
	    }
	    if (null != client.aClass259_11271
		&& client.aClass259_11272 == Class25.aClass259_245) {
		client.aBool11324 = true;
		client.anInt11277 = 0;
		client.anInt11068 = 0;
		client.anInt11279 = -1283861229 * Class434.anInt4827;
		client.anInt11329 = -1818345117 * Class696_Sub47.anInt11032;
	    }
	    Class91.method1700(null, client.anInt11260 * -750203937, 0, 0,
			       -1445589163 * Class434.anInt4827,
			       Class696_Sub47.anInt11032 * -1883654023, 0, 0,
			       i_2_, i_3_, -891527048);
	    if (Class562.aClass259_7558 != null)
		Class58.method1222(i_2_, i_3_, (short) 25565);
	}
    }
    
    public static Class383 method8702(RSBuffer class525_sub38, int i) {
	int i_4_ = class525_sub38.readBigSmart(-2043778683);
	return new Class383(i_4_);
    }
    
    static final void method8703(boolean bool, Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	if (bool)
	    Class555.method9242(class245, class259, 108507919);
	else
	    Class458.method7569(class245, class259, (byte) 0);
    }
    
    static final void method8704(Class683 class683, int i) {
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_5_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_5_ >> 16];
	Class638.method10519(class259, class245, class683, 670719239);
    }
}
