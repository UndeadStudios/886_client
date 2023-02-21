/* Class525_Sub16_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.lang.ref.SoftReference;

public class Class525_Sub16_Sub5_Sub1 extends Class525_Sub16_Sub5
{
    SoftReference aSoftReference12161;
    
    boolean method18258(int i) {
	return true;
    }
    
    Class525_Sub16_Sub5_Sub1(Object object, int i) {
	super(i);
	aSoftReference12161 = new SoftReference(object);
    }
    
    Object method18257(int i) {
	return aSoftReference12161.get();
    }
    
    Object method18259() {
	return aSoftReference12161.get();
    }
    
    boolean method18260() {
	return true;
    }
}
