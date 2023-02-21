/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub1 extends Exception
{
    public int anInt11416;
    public String aString11417;
    
    Exception_Sub1(int i, String string) {
	this(i, string, null);
    }
    
    Exception_Sub1(int i, String string, Throwable throwable) {
	super(throwable);
	aString11417 = string;
	anInt11416 = -1975089921 * i;
    }
}
