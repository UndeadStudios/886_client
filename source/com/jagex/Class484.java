/* Class484 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class484 implements Interface46
{
    Class494 this$0;
    
    public void method211(int i) {
	this$0.method8005(true, -883842407);
    }
    
    Class484(Class494 class494) {
	this$0 = class494;
    }
    
    public void method285() {
	this$0.method8005(true, 1804214944);
    }
    
    static final void method7838(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (i_0_ == -1)
	    throw new RuntimeException("");
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = new StringBuilder().append(string).append((char) i_0_)
		  .toString();
    }
    
    static final void method7839(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class511.method8526(class259, class245, class683, (short) 30531);
    }
    
    static final void method7840(Class683 class683, byte i) {
	Class184.method3611(class683,
			    Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705,
			    -2082329190);
    }
    
    static final void method7841(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method18623
		  ((byte) -29).method9872((byte) 1);
    }
    
    static final void method7842(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class381.anIntArray3929[i_1_ & 0xffff];
    }
    
    public static void method7843(String string, byte i) {
	Class116.aString1414 = string;
	Class116.anInt1420 = Class116.aString1414.length() * -2087599183;
    }
}
