/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class272 implements Interface76
{
    public static Class272 aClass272_2846;
    public int anInt2847;
    static Class272 aClass272_2848;
    int anInt2849;
    public static Class272 aClass272_2850 = new Class272(2, 0);
    
    public int method80() {
	return anInt2849 * -1044767397;
    }
    
    Class272(int i, int i_0_) {
	anInt2847 = -71688621 * i;
	anInt2849 = -1538209069 * i_0_;
    }
    
    static {
	aClass272_2846 = new Class272(1, 1);
	aClass272_2848 = new Class272(0, 2);
    }
    
    public int method57() {
	return anInt2849 * -1044767397;
    }
    
    public int method75() {
	return anInt2849 * -1044767397;
    }
    
    static Class272[] method5019() {
	return (new Class272[]
		{ aClass272_2848, aClass272_2846, aClass272_2850 });
    }
    
    public static void method5020(Class546 class546, Class182 class182,
				  int i) {
	Iterator iterator = Class616.aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    if (class633.aBool8232)
		class633.method10340(class546, class182);
	}
    }
    
    static final void method5021(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class509.aClass569_5662.method9498(2026953475);
    }
    
    static final void method5022(Class683 class683, int i) {
	class683.anInt8644 -= -1723845246;
	Class245.method4479((String) (class683.anObjectArray8636
				      [class683.anInt8644 * 1373599041]),
			    (String) (class683.anObjectArray8636
				      [1 + class683.anInt8644 * 1373599041]),
			    "",
			    ((class683.anIntArray8661
			      [(class683.anInt8662 -= 1552651121) * 501271953])
			     == 1),
			    false, -1379185369);
    }
    
    public static int method5023(byte[] is, int i, int i_1_) {
	return Class555.method9240(is, 0, i, (byte) 102);
    }
    
    static void method5024(byte i) {
	for (Class525_Sub16_Sub7 class525_sub16_sub7
		 = ((Class525_Sub16_Sub7)
		    Class61.aClass697_656.method14186((byte) -72));
	     null != class525_sub16_sub7;
	     class525_sub16_sub7
		 = ((Class525_Sub16_Sub7)
		    Class61.aClass697_656.method14201((byte) -1))) {
	    if (1624285615 * class525_sub16_sub7.anInt11780 > 1) {
		class525_sub16_sub7.anInt11780 = 0;
		Class61.aClass200_653.method3788(class525_sub16_sub7,
						 (-4663703702830765539L
						  * (((Class525_Sub16_Sub16)
						      (class525_sub16_sub7
						       .aClass697_11778
						       .aClass525_Sub16_8766
						       .aClass525_Sub16_10554))
						     .aLong11866)));
		class525_sub16_sub7.aClass697_11778.method14199(-556682323);
	    }
	}
	Class61.anInt659 = 0;
	Class61.anInt658 = 0;
	Class61.aClass709_660.method14344(1016025556);
	Class61.aClass10_661.method688((short) 17943);
	Class61.aClass697_656.method14199(-846017381);
	Class190.method3690(Class61.aClass525_Sub16_Sub16_647, 1610347252);
    }
    
    static final void method5025(Class683 class683, int i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (((ItemDefinitions)
		Class313_Sub2.aClass40_Sub22_10106.method76(i_2_, -1816456189))
	       .anInt56) * 1051584679 == 1 ? 1 : 0;
    }
    
    static String method5026(int i, Class666 class666, Class631 class631,
			     int i_3_) {
	if (i < 100000)
	    return new StringBuilder().append
		       (Class459.method7583(1746106145 * class631.anInt8193,
					    (byte) -11))
		       .append
		       (i).append
		       (ItemDefinitions.aString89).toString();
	if (i < 10000000)
	    return new StringBuilder().append
		       (Class459.method7583(class631.anInt8194 * -1075664863,
					    (byte) -83))
		       .append
		       (i / 1000).append
		       (Class53.aClass53_524.method1169(class666, 1552651121))
		       .append
		       (ItemDefinitions.aString89).toString();
	return new StringBuilder().append
		   (Class459.method7583(class631.anInt8173 * -266050813,
					(byte) -117))
		   .append
		   (i / 1000000).append
		   (Class53.aClass53_546.method1169(class666, 1552651121))
		   .append
		   (ItemDefinitions.aString89).toString();
    }
    
    static final void method5027(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	Class198_Sub1.method15606(string, 586362342);
    }
}
