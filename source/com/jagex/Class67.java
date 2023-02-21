/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class67
{
    public static Object method1440(Applet applet, String string)
	throws Throwable {
	return JSObject.getWindow(applet).call(string, null);
    }
    
    public static void method1441(Applet applet, String string, int i)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
    }
    
    public static Object method1442(Applet applet, String string, int i)
	throws Throwable {
	return JSObject.getWindow(applet).call(string, null);
    }
    
    public static Object method1443(Applet applet, String string,
				    Object[] objects, int i) throws Throwable {
	return JSObject.getWindow(applet).call(string, objects);
    }
    
    public static void method1444(Applet applet, String string)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
    }
    
    public static void method1445(Applet applet, String string)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
    }
    
    public static Object method1446
	(Applet applet, String string, Object[] objects) throws Throwable {
	return JSObject.getWindow(applet).call(string, objects);
    }
    
    public static Object method1447
	(Applet applet, String string, Object[] objects) throws Throwable {
	return JSObject.getWindow(applet).call(string, objects);
    }
    
    Class67() throws Throwable {
	throw new Error();
    }
    
    public static Object method1448
	(Applet applet, String string, Object[] objects) throws Throwable {
	return JSObject.getWindow(applet).call(string, objects);
    }
}
