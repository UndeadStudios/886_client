/* Class615 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

class Class615 implements Iterator
{
    Class106_Sub1_Sub2 this$0;
    int anInt8041;
    
    public Object method10083() {
	int i = (anInt8041 += -1507675847) * -563679991 - 1;
	Class163_Sub1 class163_sub1
	    = (Class163_Sub1) this$0.aClass200_11399.method3785((long) i);
	if (null != class163_sub1)
	    return class163_sub1;
	return this$0.method17985(i, -423121071);
    }
    
    public boolean method10084() {
	return -563679991 * anInt8041 < this$0.method72(474400708);
    }
    
    public Object method10085() {
	int i = (anInt8041 += -1507675847) * -563679991 - 1;
	Class163_Sub1 class163_sub1
	    = (Class163_Sub1) this$0.aClass200_11399.method3785((long) i);
	if (null != class163_sub1)
	    return class163_sub1;
	return this$0.method17985(i, -1759268537);
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method10086() {
	return -563679991 * anInt8041 < this$0.method72(-836131986);
    }
    
    public boolean method10087() {
	return -563679991 * anInt8041 < this$0.method72(-1888315963);
    }
    
    public Object next() {
	int i = (anInt8041 += -1507675847) * -563679991 - 1;
	Class163_Sub1 class163_sub1
	    = (Class163_Sub1) this$0.aClass200_11399.method3785((long) i);
	if (null != class163_sub1)
	    return class163_sub1;
	return this$0.method17985(i, 30451090);
    }
    
    public boolean hasNext() {
	return -563679991 * anInt8041 < this$0.method72(1084826632);
    }
    
    Class615(Class106_Sub1_Sub2 class106_sub1_sub2) {
	this$0 = class106_sub1_sub2;
    }
    
    public Object method10088() {
	int i = (anInt8041 += -1507675847) * -563679991 - 1;
	Class163_Sub1 class163_sub1
	    = (Class163_Sub1) this$0.aClass200_11399.method3785((long) i);
	if (null != class163_sub1)
	    return class163_sub1;
	return this$0.method17985(i, -1793452772);
    }
    
    public void method10089() {
	throw new UnsupportedOperationException();
    }
    
    public static final int method10090(int i, int i_0_, int i_1_) {
	if (-2 == i)
	    return 12345678;
	if (-1 == i) {
	    if (i_0_ < 2)
		i_0_ = 2;
	    else if (i_0_ > 126)
		i_0_ = 126;
	    return i_0_;
	}
	i_0_ = (i & 0x7f) * i_0_ >> 7;
	if (i_0_ < 2)
	    i_0_ = 2;
	else if (i_0_ > 126)
	    i_0_ = 126;
	return (i & 0xff80) + i_0_;
    }
    
    static final void method10091(Class683 class683, int i) {
	if (Class198_Sub21.aClass551_10003.method9149(86, 898670697))
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
}
