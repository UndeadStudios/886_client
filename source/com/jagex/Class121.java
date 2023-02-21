/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.Buffer;

public class Class121
{
    Class182_Sub3 aClass182_Sub3_1443;
    Buffer aBuffer1444;
    
    void method2103(byte[] is, int i) {
	if (aBuffer1444 == null || aBuffer1444.method1() < i)
	    aBuffer1444
		= aClass182_Sub3_1443.aNativeHeap9766.method1982(i, false);
	aBuffer1444.method3(is, 0, 0, i);
    }
    
    Class121(Class182_Sub3 class182_sub3, byte[] is, int i) {
	aClass182_Sub3_1443 = class182_sub3;
	aBuffer1444 = aClass182_Sub3_1443.aNativeHeap9766.method1982(i, false);
	if (is != null)
	    aBuffer1444.method3(is, 0, 0, i);
    }
    
    void method2104(byte[] is, int i) {
	if (aBuffer1444 == null || aBuffer1444.method1() < i)
	    aBuffer1444
		= aClass182_Sub3_1443.aNativeHeap9766.method1982(i, false);
	aBuffer1444.method3(is, 0, 0, i);
    }
    
    Class121(Class182_Sub3 class182_sub3, Buffer buffer) {
	aClass182_Sub3_1443 = class182_sub3;
	aBuffer1444 = buffer;
    }
}
