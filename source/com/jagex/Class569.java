/* Class569 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Component;

public abstract class Class569
{
    public static RSBuffer aClass525_Sub38_7628;
    
    public abstract int method9492();
    
    public static Class569 method9493(Component component, boolean bool) {
	return new Class569_Sub1(component, bool);
    }
    
    public abstract boolean method9494(byte i);
    
    public static void method9495(int i) {
	Class577.method9577(i, -151644199);
    }
    
    public abstract boolean method9496(int i);
    
    public boolean method9497(int i) {
	return (method9494((byte) 1) || method9501(-2037686188)
		|| method9496(368624908));
    }
    
    public abstract int method9498(int i);
    
    public abstract int method9499(int i);
    
    public abstract Class525_Sub41 method9500(byte i);
    
    public abstract boolean method9501(int i);
    
    public static Class569 method9502(Component component, boolean bool) {
	return new Class569_Sub1(component, bool);
    }
    
    public abstract boolean method9503();
    
    public static void method9504(int i) {
	Class577.method9577(i, 1616415498);
    }
    
    public static void method9505(int i) {
	Class577.method9577(i, 1521924237);
    }
    
    public abstract void method9506(int i);
    
    public abstract boolean method9507();
    
    public abstract boolean method9508();
    
    public abstract boolean method9509();
    
    public abstract void method9510(short i);
    
    Class569() {
	/* empty */
    }
    
    public abstract int method9511();
    
    public abstract int method9512();
    
    public abstract int method9513();
    
    public abstract int method9514();
    
    public abstract int method9515();
    
    public abstract Class525_Sub41 method9516();
    
    public abstract Class525_Sub41 method9517();
    
    public abstract Class525_Sub41 method9518();
    
    public abstract void method9519();
    
    static final void method9520(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4345,
				client.aClass96_11085.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16602(i_0_, 948444344);
	client.aClass96_11085.method1794(class525_sub15, (short) 19294);
    }
    
    static final void method9521(Class683 class683, short i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (1819257147 * client.anInt11362 == 2
	    && i_1_ < -883281325 * client.anInt11204) {
	    Class66 class66 = client.aClass66Array11356[i_1_];
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class66.aString708;
	    if (null != class66.aString707)
		class683.anObjectArray8636
		    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		    = class66.aString707;
	    else
		class683.anObjectArray8636
		    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		    = "";
	} else {
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	}
    }
    
    static final void method9522(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class31.aClass525_Sub36_305.anInt10806 * -1113722213;
    }
    
    public static final boolean method9523(String string, String string_2_,
					   String string_3_, String string_4_,
					   int i) {
	if (string == null || null == string_3_)
	    return false;
	if (string.startsWith("#") || string_3_.startsWith("#"))
	    return string.equals(string_3_);
	return string_2_.equals(string_4_);
    }
    
    static final void method9524(Class683 class683, byte i)
	throws Exception_Sub7 {
	Class453_Sub3.aClass309_Sub1_10316.method5553
	    (((float) (class683.anIntArray8661
		       [(class683.anInt8662 -= 1552651121) * 501271953])
	      / 1000.0F),
	     1881663449);
    }
}
