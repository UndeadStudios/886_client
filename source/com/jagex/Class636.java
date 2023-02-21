/* Class636 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class636
{
    int anInt8275;
    int anInt8276;
    int anInt8277;
    int anInt8278;
    int anInt8279;
    int anInt8280;
    int anInt8281;
    int anInt8282;
    int anInt8283;
    int anInt8284;
    int anInt8285;
    int anInt8286;
    
    boolean method10469(Class636 class636_0_, int i) {
	if (class636_0_.anInt8284 * 1290098051 == 1290098051 * anInt8284
	    && anInt8285 * -793531135 == -793531135 * class636_0_.anInt8285
	    && -1950313275 * anInt8286 == -1950313275 * class636_0_.anInt8286)
	    return true;
	return false;
    }
    
    Class636() {
	/* empty */
    }
    
    boolean method10470(Class636 class636_1_) {
	if (class636_1_.anInt8284 * 1290098051 == 1290098051 * anInt8284
	    && anInt8285 * -793531135 == -793531135 * class636_1_.anInt8285
	    && -1950313275 * anInt8286 == -1950313275 * class636_1_.anInt8286)
	    return true;
	return false;
    }
    
    static final void method10471(Class259 class259, Class245 class245,
				  Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2561
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -737012174);
	class259.aBool2695 = true;
    }
    
    static final void method10472(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_2_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_3_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (1725313703
	       * client.aClass486ArrayArray11128[i_3_][i_2_].anInt5239);
    }
    
    static void method10473(int i) {
	if (Class229.method4377((byte) -18)) {
	    Class69.aClass102_735
		= (Class69.aProcess733.exitValue() == 0
		   ? Class102.aClass102_1266 : Class102.aClass102_1268);
	    Class69.aProcess733 = null;
	}
    }
    
    static final void method10474(int i, int i_4_, int i_5_, int i_6_,
				  int i_7_, int i_8_, int i_9_, int i_10_,
				  int i_11_) {
	if (!Class165.method2667(i, null, 1106349767)) {
	    if (i_10_ != -1)
		client.aBoolArray11320[i_10_] = true;
	    else {
		for (int i_12_ = 0; i_12_ < 107; i_12_++)
		    client.aBoolArray11320[i_12_] = true;
	    }
	} else
	    Class184.method3613(Class162.aClass245Array1764[i]
				    .method4478((byte) 86),
				-1, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_,
				i_10_ < 0, 1798177349);
    }
}
