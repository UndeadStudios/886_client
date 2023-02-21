/* Exception_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub2 extends Exception
{
    public int anInt11418;
    public String aString11419;
    static int anInt11420;
    
    public Exception_Sub2(int i, String string) {
	this(i, string, null);
    }
    
    public Exception_Sub2(int i, String string, Throwable throwable) {
	super(throwable);
	aString11419 = string;
	anInt11418 = i * -162932803;
    }
    
    static final void method18014(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class324.method5736(class259, class245, class683, -1002941375);
    }
}
