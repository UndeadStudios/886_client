/* Class525_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

public abstract class Class525_Sub7 extends Class525
{
    abstract void method16117(RSBuffer class525_sub38, int i);
    
    abstract void method16118(Class353 class353);
    
    abstract void method16119(Class353 class353, int i);
    
    abstract void method16120(RSBuffer class525_sub38);
    
    abstract void method16121(RSBuffer class525_sub38);
    
    abstract void method16122(RSBuffer class525_sub38);
    
    Class525_Sub7() {
	/* empty */
    }
    
    abstract void method16123(Class353 class353);
    
    abstract void method16124(Class353 class353);
    
    abstract void method16125(Class353 class353);
    
    static void method16126(File file, byte i) {
	Class501.aFile5562 = file;
	if (!Class501.aFile5562.exists())
	    throw new RuntimeException("");
	Class501.aBool5561 = true;
    }
    
    static final void method16127(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class525_Sub23.method16342(class259, class245, class683, 1173060155);
    }
    
    public static Class559 method16128(Socket socket, int i, int i_1_)
	throws IOException {
	return new Class559_Sub1(socket, i);
    }
}
