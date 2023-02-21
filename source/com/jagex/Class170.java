/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class170
{
    public static final int anInt1845 = 0;
    public static final int anInt1846 = -1;
    public static final int anInt1847 = 4098;
    public static final int anInt1848 = 32902;
    public static final int anInt1849 = 4318;
    public int anInt1850;
    public String aString1851;
    public int anInt1852;
    public String aString1853;
    public long aLong1854;
    
    public Class170(int i, String string, int i_0_, String string_1_, long l,
		    boolean bool) {
	anInt1850 = i * -2052756883;
	aString1851 = string;
	anInt1852 = i_0_ * 1693218811;
	aString1853 = string_1_;
	aLong1854 = l * 9044556813036833831L;
    }
    
    static final void method2729(Class683 class683, byte i)
	throws Exception_Sub7 {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class302 class302 = Class300.method5398(i_2_, (short) -27652);
	if (class302 == null)
	    throw new RuntimeException();
	Class453_Sub3.aClass309_Sub1_10316.method5460(class302, -1317284492);
    }
    
    static final void method2730(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int i_3_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class7 class7
	    = Class7.aClass404_53.method6580(client.anInterface50_11252, i_3_,
					     508982374);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class7.method562(string, Class229.aClass157Array2364,
			       -2121324693);
    }
    
    static final void method2731(Class683 class683, int i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_4_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_4_ >> 16];
	Class27.method902(class259, class245, class683, 1398712142);
    }
}
