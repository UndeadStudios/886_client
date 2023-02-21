/* Class702 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class702
{
    public static Class702 aClass702_8785;
    public int anInt8786;
    static Class702 aClass702_8787;
    static Class702 aClass702_8788 = new Class702(0);
    static int anInt8789;
    
    static {
	aClass702_8785 = new Class702(1);
	aClass702_8787 = new Class702(2);
    }
    
    static Class702[] method14271() {
	return (new Class702[]
		{ aClass702_8787, aClass702_8788, aClass702_8785 });
    }
    
    Class702(int i) {
	anInt8786 = -422650897 * i;
    }
    
    static Class702[] method14272() {
	return (new Class702[]
		{ aClass702_8787, aClass702_8788, aClass702_8785 });
    }
    
    public static Class702 method14273(int i) {
	Class702[] class702s = Class632.method10325(-914578447);
	for (int i_0_ = 0; i_0_ < class702s.length; i_0_++) {
	    Class702 class702 = class702s[i_0_];
	    if (108507919 * class702.anInt8786 == i)
		return class702;
	}
	return null;
    }
    
    static final void method14274(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_2_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aClass229_11119.method4356(i_1_, 2112779283)
		  .method3945(i_2_, -2137966396);
    }
}
