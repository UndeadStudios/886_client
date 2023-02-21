/* Class537 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Class537
{
    static final int anInt7177 = 5;
    static Class526 aClass526_7178;
    
    static {
	new Class530();
	aClass526_7178 = new Class526();
    }
    
    Class537() throws Throwable {
	throw new Error();
    }
    
    public static byte[] method8875(RSBuffer class525_sub38, int i)
	throws IOException {
	ByteArrayInputStream bytearrayinputstream
	    = new ByteArrayInputStream(class525_sub38.buffer);
	bytearrayinputstream.skip((long) (-1133521593
					  * class525_sub38.pos));
	return Class518.method8640(bytearrayinputstream, i, 180121021);
    }
    
    static final void method8876(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = Class647.method10695(-742477393);
	if (null != class525_sub16_sub6) {
	    boolean bool
		= class525_sub16_sub6.method18273(i_0_ >> 14 & 0x3fff,
						  i_0_ & 0x3fff,
						  Class686.anIntArray8699,
						  1936283541);
	    if (bool) {
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = Class686.anIntArray8699[1];
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = Class686.anIntArray8699[2];
	    } else {
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = -1;
		class683.anIntArray8661
		    [(class683.anInt8662 += 1552651121) * 501271953 - 1]
		    = -1;
	    }
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	}
    }
    
    static final void method8877(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (null == client.aClass259_11268 ? -1
	       : client.aClass259_11268.anInt2588 * 1984678839);
    }
    
    static final void method8878(Class683 class683, int i) {
	Class275.method5107(-304412515);
    }
    
    static final void method8879(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2609
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1738502522);
	class259.aBool2695 = true;
    }
}
