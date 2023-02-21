/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class271
{
    public String aString2844;
    public String aString2845;
    
    Class271() {
	/* empty */
    }
    
    void method5009(Class286 class286, byte i) {
	aString2844 = class286.method5226(1838667824);
	aString2845 = class286.method5226(2123513555);
    }
    
    void method5010(Class286 class286) {
	aString2844 = class286.method5226(1980289758);
	aString2845 = class286.method5226(1844195652);
    }
    
    void method5011(Class286 class286) {
	aString2844 = class286.method5226(1638877899);
	aString2845 = class286.method5226(1940386549);
    }
    
    static final void method5012(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2601 * -1028431221;
    }
    
    static final void method5013(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass353_8652.anInt3774 * 1308482801;
    }
    
    static final void method5014(Class683 class683, int i) {
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = Class556.method9289(class683.anIntArray8661[((class683.anInt8662
							    -= 1552651121)
							   * 501271953)]);
	if (null == class525_sub16_sub6
	    || null == class525_sub16_sub6.aString11768)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class525_sub16_sub6.aString11768;
    }
    
    static final void method5015(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub8_10671
		  .method17043(-584843275) == 1 ? 1 : 0;
    }
    
    static final void method5016(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_2_ = i_1_ >> 16;
	if (Class162.aClass245Array1764[i_2_] == null)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	else {
	    String string = (Class162.aClass245Array1764[i_2_]
			     .aClass259Array2426[i_1_].aString2586);
	    if (null == string)
		class683.anObjectArray8636
		    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		    = "";
	    else
		class683.anObjectArray8636
		    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		    = string;
	}
    }
    
    static final void method5017(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	if (null == class259.aString2763)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class259.aString2763;
    }
    
    static final void method5018(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.anInt2618
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -163288595;
	Class649.method10708(class259, (byte) 0);
    }
}
