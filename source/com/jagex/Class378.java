/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class378
{
    int anInt3905;
    long aLong3906;
    
    final int method6370(int i) {
	return (int) (aLong3906 >> Class342.anInt3661 * i) & 0xf;
    }
    
    public final int method6371() {
	return anInt3905;
    }
    
    Class378(Class342 class342) {
	aLong3906 = (long) class342.anInt3670;
	anInt3905 = 1;
    }
    
    public final Class342 method6372(int i) {
	return Class342.method5997(method6373(i));
    }
    
    final int method6373(int i) {
	return (int) (aLong3906 >> Class342.anInt3661 * i) & 0xf;
    }
    
    Class378(Class342[] class342s) {
	for (int i = 0; i < class342s.length; i++)
	    method6378(class342s[i]);
    }
    
    public final int method6374() {
	return anInt3905;
    }
    
    public final Class342 method6375(int i) {
	return Class342.method5997(method6373(i));
    }
    
    final int method6376(int i) {
	return (int) (aLong3906 >> Class342.anInt3661 * i) & 0xf;
    }
    
    final int method6377(int i) {
	return (int) (aLong3906 >> Class342.anInt3661 * i) & 0xf;
    }
    
    final void method6378(Class342 class342) {
	aLong3906
	    |= (long) (class342.anInt3670 << Class342.anInt3661 * anInt3905++);
    }
}
