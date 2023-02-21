/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class41 implements Runnable
{
    volatile String aString335;
    InetAddress anInetAddress336;
    static long aLong337;
    
    public String method1038() {
	return aString335;
    }
    
    public String method1039(int i) {
	return aString335;
    }
    
    Class41(int i) throws UnknownHostException {
	anInetAddress336
	    = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff),
						    (byte) (i >> 16 & 0xff),
						    (byte) (i >> 8 & 0xff),
						    (byte) (i & 0xff) });
    }
    
    public void method1040() {
	aString335 = anInetAddress336.getHostName();
    }
    
    public void run() {
	aString335 = anInetAddress336.getHostName();
    }
    
    public String method1041() {
	return aString335;
    }
    
    static final void method1042(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	if (class683.anIntArray8661[501271953 * class683.anInt8662]
	    != class683.anIntArray8661[501271953 * class683.anInt8662 + 1])
	    class683.anInt8663
		+= (class683.anIntArray8647[1931825055 * class683.anInt8663]
		    * -1827402657);
    }
    
    static final void method1043(Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	class683.anInt8662 -= -1189665054;
	int i_0_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_1_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	Class7 class7
	    = Class7.aClass404_53.method6580(client.anInterface50_11252, i_1_,
					     -1056114760);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class7.method596(string, i_0_, Class229.aClass157Array2364,
			       2050100982);
    }
}
