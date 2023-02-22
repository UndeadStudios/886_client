/* Class401 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Class401
{
    public int[] anIntArray4132;
    public Class525_Sub16_Sub11 aClass525_Sub16_Sub11_4133;
    public int anInt4134;
    
    public static Class401 method6551(RSBuffer class525_sub38) {
	Class401 class401 = new Class401();
	class401.anInt4134
	    = class525_sub38.readUnsignedShort((byte) 127) * -1532044077;
	class401.aClass525_Sub16_Sub11_4133
	    = Class215.aClass58_2283
		  .method1220(-1275733157 * class401.anInt4134, 797864);
	return class401;
    }
    
    public static Class401 method6552(RSBuffer class525_sub38) {
	Class401 class401 = new Class401();
	class401.anInt4134
	    = class525_sub38.readUnsignedShort((byte) 97) * -1532044077;
	class401.aClass525_Sub16_Sub11_4133
	    = Class215.aClass58_2283
		  .method1220(-1275733157 * class401.anInt4134, 797864);
	return class401;
    }
    
    public static byte[] method6553
	(RSBuffer class525_sub38, int i, byte i_0_) throws IOException {
	ByteArrayInputStream bytearrayinputstream
	    = new ByteArrayInputStream(class525_sub38.buffer);
	bytearrayinputstream.skip((long) (-1133521593
					  * class525_sub38.index));
	return Class518.method8640(bytearrayinputstream, i, 180121021);
    }
    
    static final void method6554(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_2_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	if (i_1_ > 700 || i_2_ > 700)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 256;
	else {
	    double d = ((Math.random() * (double) (i_1_ + i_2_) - (double) i_1_
			 + 800.0)
			/ 100.0);
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (int) (Math.pow(2.0, d) + 0.5);
	}
    }
    
    public static int method6555(long l) {
	Class677.method11134(l);
	return Class86.aCalendar890.get(1);
    }
    
    public static void method6556(byte i) {
	if (Class669.method11036(-390877146) != Class508.aClass508_5657) {
	    try {
		String string
		    = Class281.anApplet3006
			  .getParameter(Class409.aClass409_4209.aString4236);
		int i_3_ = ((int) (Class251.method4508((byte) 8) / 86400000L)
			    - 11745);
		String string_4_
		    = new StringBuilder().append("usrdob=").append(i_3_).append
			  ("; version=1; path=/; domain=").append
			  (string).toString();
		Class67.method1441(Class281.anApplet3006,
				   new StringBuilder().append
				       ("document.cookie=\"").append
				       (string_4_).append
				       ("\"").toString(),
				   573747938);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
    
    static final void method6557(Class683 class683, byte i)
	throws Exception_Sub6 {
	Class322 class322
	    = (Class322) (class683.aClass525_Sub16_Sub4_8664.anObjectArray11750
			  [1931825055 * class683.anInt8663]);
	Interface17 interface17
	    = ((Interface17)
	       (0 == class683.anIntArray8647[1931825055 * class683.anInt8663]
		? class683.aMap8657.get(class322.aClass163_3544.aClass453_1767)
		: class683.aMap8643
		      .get(class322.aClass163_3544.aClass453_1767)));
	try {
	    interface17.method98(class322,
				 class683.anIntArray8661[((class683.anInt8662
							   -= 1552651121)
							  * 501271953)],
				 1999880750);
	} catch (Exception_Sub6 exception_sub6) {
	    if (interface17 instanceof Class614)
		Class696_Sub41.method17343(class683, Class517.aClass517_6106,
					   exception_sub6, "VO", 2062114566);
	    else
		throw exception_sub6;
	}
    }
}
