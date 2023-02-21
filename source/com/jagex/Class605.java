/* Class605 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class605 implements Interface76
{
    public static Class605 aClass605_7959;
    static Class605 aClass605_7960;
    int anInt7961;
    static Class605 aClass605_7962 = new Class605(0);
    
    static Class605[] method9989() {
	return (new Class605[]
		{ aClass605_7959, aClass605_7962, aClass605_7960 });
    }
    
    public int method80() {
	return anInt7961 * -1146595791;
    }
    
    Class605(int i) {
	anInt7961 = i * -1347861807;
    }
    
    public int method57() {
	return anInt7961 * -1146595791;
    }
    
    static {
	aClass605_7960 = new Class605(1);
	aClass605_7959 = new Class605(2);
    }
    
    public int method75() {
	return anInt7961 * -1146595791;
    }
    
    static Class605[] method9990() {
	return (new Class605[]
		{ aClass605_7959, aClass605_7962, aClass605_7960 });
    }
    
    static Class605[] method9991() {
	return (new Class605[]
		{ aClass605_7959, aClass605_7962, aClass605_7960 });
    }
    
    static void method9992(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class420.method6744((byte) 21);
    }
    
    static final void method9993(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_1_ = i_0_ >> 16;
	if (Class162.aClass245Array1764[i_1_] == null)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (Class162.aClass245Array1764[i_1_].aClass259Array2426[i_0_]
		   .anInt2587) * 820627833;
    }
}
