/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class69
{
    static Process aProcess733;
    static String aString734
	= new StringBuilder().append(Class538.method8885(-1878246361)).append
	      ("\\RuneScape-Setup.exe").toString();
    static Class102 aClass102_735 = Class102.aClass102_1269;
    static Class646 aClass646_736;
    public static byte aByte737;
    
    Class69() throws Throwable {
	throw new Error();
    }
    
    static boolean method1449() {
	if (aProcess733 == null)
	    return false;
	boolean bool;
	try {
	    aProcess733.exitValue();
	    bool = true;
	} catch (IllegalThreadStateException illegalthreadstateexception) {
	    return false;
	}
	return bool;
    }
    
    public static int method1450() {
	Class636.method10473(815780751);
	return 1677281923 * aClass102_735.anInt1267;
    }
    
    public static int method1451() {
	Class636.method10473(380453066);
	return 1677281923 * aClass102_735.anInt1267;
    }
    
    static boolean method1452() {
	if (aProcess733 == null)
	    return false;
	boolean bool;
	try {
	    aProcess733.exitValue();
	    bool = true;
	} catch (IllegalThreadStateException illegalthreadstateexception) {
	    return false;
	}
	return bool;
    }
    
    public static int method1453() {
	Class636.method10473(136425197);
	return 1677281923 * aClass102_735.anInt1267;
    }
}
