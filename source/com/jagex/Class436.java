/* Class436 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class436
{
    public static int[] anIntArray4831 = new int[16384];
    public static final int anInt4832 = 16383;
    public static final int anInt4833 = 14;
    public static final double aDouble4834 = 2607.5945876176133;
    public static final int anInt4835 = 16384;
    public static final int anInt4836 = 16384;
    public static final int anInt4837 = 14;
    public static int[] anIntArray4838 = new int[16384];
    public static final int anInt4839 = 2048;
    public static final int anInt4840 = 4096;
    public static final int anInt4841 = 10240;
    public static final int anInt4842 = 16383;
    public static final int anInt4843 = 8192;
    public static final int anInt4844 = 12288;
    public static final int anInt4845 = 14336;
    public static final int anInt4846 = 16384;
    public static final int anInt4847 = 1024;
    public static final int anInt4848 = 6144;
    
    Class436() throws Throwable {
	throw new Error();
    }
    
    public static float method7071(int i) {
	i &= 0x3fff;
	return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
    }
    
    static {
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    anIntArray4831[i] = (int) (16384.0 * Math.sin((double) i * d));
	    anIntArray4838[i] = (int) (16384.0 * Math.cos((double) i * d));
	}
    }
    
    public static float method7072(int i) {
	i &= 0x3fff;
	return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
    }
}
