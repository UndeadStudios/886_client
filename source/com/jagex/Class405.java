/* Class405 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class405
{
    public static final int anInt4150 = 15;
    public static final int anInt4151 = 32768;
    public static final int anInt4152 = 15;
    
    Class405() throws Throwable {
	throw new Error();
    }
    
    static void method6610(byte i) {
	if (null == Class589.aClass157_7807
	    || (Class589.aClass157_7807.method2503()
		!= Class589.aTwitchWebcamFrameData7801.width)
	    || (Class589.aClass157_7807.method2471()
		!= Class589.aTwitchWebcamFrameData7801.height))
	    Class589.aClass157_7807
		= (Class501.aClass182_5564.method3214
		   (Class589.aTwitchWebcamFrameData7801.buffer, 0,
		    Class589.aTwitchWebcamFrameData7801.width,
		    Class589.aTwitchWebcamFrameData7801.width,
		    Class589.aTwitchWebcamFrameData7801.height, false));
	else
	    Class589.aClass157_7807.method2474
		(0, 0, Class589.aTwitchWebcamFrameData7801.width,
		 Class589.aTwitchWebcamFrameData7801.height,
		 Class589.aTwitchWebcamFrameData7801.buffer, 0,
		 Class589.aTwitchWebcamFrameData7801.width);
    }
    
    static final void method6611(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aBool11230 ? 1 : 0;
    }
}
