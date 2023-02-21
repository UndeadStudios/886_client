/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class90 implements Interface5
{
    Class458 aClass458_897;
    Class200 aClass200_898;
    
    void method1677(int i, short i_0_) {
	synchronized (aClass200_898) {
	    aClass200_898.method3805(i, 1898364800);
	}
    }
    
    void method1678() {
	synchronized (aClass200_898) {
	    aClass200_898.method3791((byte) 51);
	}
    }
    
    void method1679(int i, byte i_1_) {
	aClass200_898 = new Class200(i);
    }
    
    void method1680(int i) {
	synchronized (aClass200_898) {
	    aClass200_898.method3791((byte) -111);
	}
    }
    
    void method1681(int i) {
	synchronized (aClass200_898) {
	    aClass200_898.method3809((byte) 78);
	}
    }
    
    void method1682(int i) {
	aClass200_898 = new Class200(i);
    }
    
    void method1683() {
	synchronized (aClass200_898) {
	    aClass200_898.method3791((byte) 12);
	}
    }
    
    Class90(Class458 class458, int i) {
	aClass458_897 = class458;
	aClass200_898 = new Class200(i);
    }
    
    void method1684(int i) {
	synchronized (aClass200_898) {
	    aClass200_898.method3805(i, 2087628769);
	}
    }
    
    void method1685(int i) {
	synchronized (aClass200_898) {
	    aClass200_898.method3805(i, 1833712541);
	}
    }
    
    static final void method1686(Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	Class314_Sub2.method15760(string, (byte) -103);
    }
    
    static final void method1687(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
}
