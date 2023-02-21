/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class341
{
    public byte aByte3652;
    public int anInt3653;
    public String aString3654;
    
    Class341() {
	/* empty */
    }
    
    static Class573 method5992(RSBuffer class525_sub38, int i) {
	int i_0_ = class525_sub38.readUnsignedByte(1961700893);
	int i_1_ = class525_sub38.readUnsignedByte(1773888633);
	return new Class573(i_0_, i_1_);
    }
    
    static final void method5993(Class683 class683, int i) {
	String string = null;
	if (Class50.aClass41_375 != null)
	    string = Class50.aClass41_375.method1039(786409409);
	if (string == null)
	    string = "";
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = string;
    }
    
    static final void method5994(Class259[] class259s, int i, int i_2_) {
	for (int i_3_ = 0; i_3_ < class259s.length; i_3_++) {
	    Class259 class259 = class259s[i_3_];
	    if (class259 != null && -1549235523 * class259.anInt2606 == i
		&& !client.method17533(class259)) {
		if (0 == 2010235789 * class259.anInt2590) {
		    method5994(class259s, 1984678839 * class259.anInt2588,
			       -171186705);
		    if (class259.aClass259Array2755 != null)
			method5994(class259.aClass259Array2755,
				   1984678839 * class259.anInt2588,
				   -620950528);
		    Class525_Sub33 class525_sub33
			= ((Class525_Sub33)
			   (client.aClass10_11261.method684
			    ((long) (1984678839 * class259.anInt2588))));
		    if (null != class525_sub33)
			Class665.method11001((class525_sub33.anInt10745
					      * 922288809),
					     1954495876);
		}
		if (2010235789 * class259.anInt2590 == 6
		    && -1 != 1891025759 * class259.anInt2737) {
		    if (null == class259.aClass689_2664) {
			class259.aClass689_2664 = new Class689_Sub3();
			class259.aClass689_2664.method14068((1891025759
							     * (class259
								.anInt2737)),
							    (byte) 12);
		    }
		    if (class259.aClass689_2664.method14041((client.anInt11173
							     * 70369845),
							    2111548785)
			&& class259.aClass689_2664.method14039(-1850049106))
			class259.aClass689_2664.method14071(-431250528);
		}
	    }
	}
    }
}
