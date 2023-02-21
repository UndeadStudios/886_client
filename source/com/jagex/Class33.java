/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.Socket;

public abstract class Class33
{
    int anInt306;
    String aString307;
    
    public static Class33 method948(String string, int i) {
	Class33_Sub1 class33_sub1 = new Class33_Sub1();
	class33_sub1.aString307 = string;
	class33_sub1.anInt306 = -1225306375 * i;
	return class33_sub1;
    }
    
    Class33() {
	/* empty */
    }
    
    Socket method949(byte i) throws IOException {
	return new Socket(aString307, 521016137 * anInt306);
    }
    
    public abstract Socket method950(int i) throws IOException;
    
    public static Class33 method951(String string, int i) {
	Class33_Sub1 class33_sub1 = new Class33_Sub1();
	class33_sub1.aString307 = string;
	class33_sub1.anInt306 = -1225306375 * i;
	return class33_sub1;
    }
    
    public abstract Socket method952() throws IOException;
    
    public abstract Socket method953() throws IOException;
    
    public static Class33 method954(String string, int i) {
	Class33_Sub1 class33_sub1 = new Class33_Sub1();
	class33_sub1.aString307 = string;
	class33_sub1.anInt306 = -1225306375 * i;
	return class33_sub1;
    }
    
    Socket method955() throws IOException {
	return new Socket(aString307, 521016137 * anInt306);
    }
    
    Socket method956() throws IOException {
	return new Socket(aString307, 521016137 * anInt306);
    }
    
    static final void method957(Class259 class259, Class245 class245,
				Class683 class683, byte i) {
	class259.anInt2706
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -1170791893;
	class259.anInt2608
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * 1940045727;
    }
}
