/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class160
{
    static float[] aFloatArray1757;
    static float[] aFloatArray1758 = new float[16384];
    
    Class160() throws Throwable {
	throw new Error();
    }
    
    static {
	aFloatArray1757 = new float[16384];
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    aFloatArray1758[i] = (float) Math.sin((double) i * d);
	    aFloatArray1757[i] = (float) Math.cos((double) i * d);
	}
    }
}
