/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Class1
{
    public int anInt9;
    public String aString10;
    public int anInt11;
    public int anInt12;
    boolean aBool13 = true;
    boolean aBool14 = false;
    
    public boolean method504(Class1 class1_0_) {
	if (class1_0_ == null)
	    return false;
	return (class1_0_.anInt11 * -559264181 == anInt11 * -559264181
		&& aString10.equals(class1_0_.aString10)
		&& class1_0_.anInt12 * 1724282593 == anInt12 * 1724282593
		&& class1_0_.anInt9 * -66798031 == -66798031 * anInt9);
    }
    
    public Socket method505() throws IOException {
	if (!aBool14)
	    return new Socket(InetAddress.getByName(aString10),
			      (aBool13 ? anInt9 * -66798031
			       : 1724282593 * anInt12));
	return Class203.method3857
		   (aString10,
		    aBool13 ? anInt9 * -66798031 : anInt12 * 1724282593,
		    -1739601315)
		   .method950(-1120972880);
    }
    
    public Socket method506() throws IOException {
	if (!aBool14)
	    return new Socket(InetAddress.getByName(aString10),
			      (aBool13 ? anInt9 * -66798031
			       : 1724282593 * anInt12));
	return Class203.method3857
		   (aString10,
		    aBool13 ? anInt9 * -66798031 : anInt12 * 1724282593,
		    -1562864143)
		   .method950(-888688486);
    }
    
    public boolean method507(Class1 class1_1_, int i) {
	if (class1_1_ == null)
	    return false;
	return (class1_1_.anInt11 * -559264181 == anInt11 * -559264181
		&& aString10.equals(class1_1_.aString10)
		&& class1_1_.anInt12 * 1724282593 == anInt12 * 1724282593
		&& class1_1_.anInt9 * -66798031 == -66798031 * anInt9);
    }
    
    public Socket method508() throws IOException {
	if (!aBool14)
	    return new Socket(InetAddress.getByName(aString10),
			      (aBool13 ? anInt9 * -66798031
			       : 1724282593 * anInt12));
	return Class203.method3857
		   (aString10,
		    aBool13 ? anInt9 * -66798031 : anInt12 * 1724282593,
		    -1855379039)
		   .method950(171474818);
    }
    
    public void method509() {
	if (!aBool13) {
	    aBool13 = true;
	    aBool14 = true;
	} else if (aBool14)
	    aBool14 = false;
	else
	    aBool13 = false;
    }
    
    public void method510(int i) {
	if (!aBool13) {
	    aBool13 = true;
	    aBool14 = true;
	} else if (aBool14)
	    aBool14 = false;
	else
	    aBool13 = false;
    }
    
    public void method511() {
	if (!aBool13) {
	    aBool13 = true;
	    aBool14 = true;
	} else if (aBool14)
	    aBool14 = false;
	else
	    aBool13 = false;
    }
    
    public void method512() {
	if (!aBool13) {
	    aBool13 = true;
	    aBool14 = true;
	} else if (aBool14)
	    aBool14 = false;
	else
	    aBool13 = false;
    }
    
    public boolean method513(Class1 class1_2_) {
	if (class1_2_ == null)
	    return false;
	return (class1_2_.anInt11 * -559264181 == anInt11 * -559264181
		&& aString10.equals(class1_2_.aString10)
		&& class1_2_.anInt12 * 1724282593 == anInt12 * 1724282593
		&& class1_2_.anInt9 * -66798031 == -66798031 * anInt9);
    }
    
    public Socket method514(byte i) throws IOException {
	if (!aBool14)
	    return new Socket(InetAddress.getByName(aString10),
			      (aBool13 ? anInt9 * -66798031
			       : 1724282593 * anInt12));
	return Class203.method3857
		   (aString10,
		    aBool13 ? anInt9 * -66798031 : anInt12 * 1724282593,
		    -1926903393)
		   .method950(-1452984304);
    }
    
    static boolean method515(Class598 class598, byte i) {
	return Class535.method8867(class598, null, (byte) -33);
    }
    
    public static void method516(int i, int i_3_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(23, (long) i);
	class525_sub16_sub10.method18350((byte) -63);
    }
}
