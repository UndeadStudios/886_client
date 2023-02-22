/* Class252 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class252 implements Interface26
{
    Class221 this$0;
    Class218 aClass218_2453;
    
    public void method163(Class228 class228, int i) {
	class228.method4278(aClass218_2453, -318191487);
    }
    
    Class252(Class221 class221, RSBuffer class525_sub38) {
	this$0 = class221;
	boolean bool = class525_sub38.readUnsignedByte(1080093721) != 255;
	if (bool)
	    class525_sub38.index -= 339428471;
	aClass218_2453 = new Class218(class525_sub38, bool, true,
				      class221.anInterface27_2333);
    }
    
    public void method161(Class228 class228) {
	class228.method4278(aClass218_2453, 569988404);
    }
    
    public void method162(Class228 class228) {
	class228.method4278(aClass218_2453, -1110247568);
    }
    
    public void method160(Class228 class228) {
	class228.method4278(aClass218_2453, -600378589);
    }
    
    public void method165(Class228 class228) {
	class228.method4278(aClass218_2453, -409219486);
    }
    
    public void method164(Class228 class228) {
	class228.method4278(aClass218_2453, -899375294);
    }
    
    static int method4514(int i, int i_0_, byte i_1_) {
	if (-1214990409 * Class608.aClass608_7988.anInt7995 == i
	    || i == -1214990409 * Class608.aClass608_7979.anInt7995)
	    return Class656_Sub1_Sub5_Sub2.anIntArray12084[i_0_ & 0x3];
	return Class656_Sub1_Sub5_Sub2.anIntArray12083[i_0_ & 0x3];
    }
    
    static final void method4515(Class683 class683, int i) {
	Class172_Sub1.method15240(-1631272473);
    }
    
    static final void method4516(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class168.method2720(class259, class245, class683, 425537375);
    }
    
    static final void method4517(Class683 class683, byte i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (i_2_ != Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub42_10717.method17348((short) 10242)) {
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub42_10717,
		 i_2_, (byte) -31);
	    Class650.method10715(-1758466106);
	    client.aBool11084 = false;
	}
    }
    
    static final void method4518(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_3_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_4_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (Class562.aClass471_7557.method7736(i_3_, 1557620973)
	       .aCharArray11918[i_4_]);
    }
}
