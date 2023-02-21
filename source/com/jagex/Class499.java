/* Class499 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class499
{
    static Class499 aClass499_5547;
    public static Class499 aClass499_5548;
    boolean aBool5549;
    public static Class499 aClass499_5550 = new Class499(false, false);
    public static Class499 aClass499_5551 = new Class499(true, false);
    static Class499 aClass499_5552;
    static Class499 aClass499_5553;
    public static Class499 aClass499_5554;
    boolean aBool5555;
    public static Class499 aClass499_5556;
    
    public boolean method8159() {
	return aBool5549;
    }
    
    Class499(boolean bool, boolean bool_0_) {
	aBool5555 = bool;
	aBool5549 = bool_0_;
    }
    
    public boolean method8160(int i) {
	return aBool5549;
    }
    
    static {
	aClass499_5548 = new Class499(false, false);
	aClass499_5556 = new Class499(true, false);
	aClass499_5547 = new Class499(true, false);
	aClass499_5552 = new Class499(true, true);
	aClass499_5553 = new Class499(true, true);
	aClass499_5554 = new Class499(false, false);
    }
    
    boolean method8161() {
	return aBool5555;
    }
    
    public boolean method8162() {
	return aBool5549;
    }
    
    public boolean method8163() {
	return aBool5549;
    }
    
    boolean method8164(short i) {
	return aBool5555;
    }
    
    public boolean method8165() {
	return aBool5549;
    }
    
    static final void method8166(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class457.method7464(class259, class245, class683, (short) 681);
    }
    
    public static String method8167(Object[] objects, int i, int i_1_,
				    int i_2_) {
	if (i_1_ == 0)
	    return "";
	if (1 == i_1_) {
	    CharSequence charsequence = (CharSequence) objects[i];
	    if (null == charsequence)
		return "null";
	    return charsequence.toString();
	}
	int i_3_ = i_1_ + i;
	int i_4_ = 0;
	for (int i_5_ = i; i_5_ < i_3_; i_5_++) {
	    CharSequence charsequence = (CharSequence) objects[i_5_];
	    if (charsequence == null)
		i_4_ += 4;
	    else
		i_4_ += charsequence.length();
	}
	StringBuilder stringbuilder = new StringBuilder(i_4_);
	for (int i_6_ = i; i_6_ < i_3_; i_6_++) {
	    CharSequence charsequence = (CharSequence) objects[i_6_];
	    if (null == charsequence)
		stringbuilder.append("null");
	    else
		stringbuilder.append(charsequence);
	}
	return stringbuilder.toString();
    }
    
    static void method8168(Class683 class683, byte i) {
	class683.anIntArray8661[class683.anInt8662 * 501271953 - 1]
	    = ((Class269)
	       Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						     [(class683.anInt8662
						       * 501271953) - 1]),
						    -2018393307))
		  .method4968(Class532.aClass111_7170, 600413835) ? 1 : 0;
    }
    
    static final void method8169(Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	Class376.method6367(string, true, -2112869477);
    }
}
