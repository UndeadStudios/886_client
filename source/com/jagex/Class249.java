/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Frame;
import java.util.Iterator;

class Class249 implements Iterator
{
    Class106_Sub1_Sub1 this$0;
    int anInt2443;
    public static Class1 aClass1_2444;
    public static Class47_Sub1 aClass47_Sub1_2445;
    public static int anInt2446;
    
    public boolean hasNext() {
	return anInt2443 * 1551380023 < this$0.method72(1652956157);
    }
    
    public boolean method4496() {
	return anInt2443 * 1551380023 < this$0.method72(-1118693056);
    }
    
    public Object next() {
	int i = (anInt2443 += -160110713) * 1551380023 - 1;
	Class163_Sub2 class163_sub2
	    = (Class163_Sub2) this$0.aClass200_11397.method3785((long) i);
	if (class163_sub2 != null)
	    return class163_sub2;
	return this$0.method17963(i, -1011351119);
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method4497() {
	return anInt2443 * 1551380023 < this$0.method72(1758386393);
    }
    
    public boolean method4498() {
	return anInt2443 * 1551380023 < this$0.method72(-129843876);
    }
    
    public Object method4499() {
	int i = (anInt2443 += -160110713) * 1551380023 - 1;
	Class163_Sub2 class163_sub2
	    = (Class163_Sub2) this$0.aClass200_11397.method3785((long) i);
	if (class163_sub2 != null)
	    return class163_sub2;
	return this$0.method17963(i, -1011351119);
    }
    
    Class249(Class106_Sub1_Sub1 class106_sub1_sub1) {
	this$0 = class106_sub1_sub1;
    }
    
    public Object method4500() {
	int i = (anInt2443 += -160110713) * 1551380023 - 1;
	Class163_Sub2 class163_sub2
	    = (Class163_Sub2) this$0.aClass200_11397.method3785((long) i);
	if (class163_sub2 != null)
	    return class163_sub2;
	return this$0.method17963(i, -1011351119);
    }
    
    public Object method4501() {
	int i = (anInt2443 += -160110713) * 1551380023 - 1;
	Class163_Sub2 class163_sub2
	    = (Class163_Sub2) this$0.aClass200_11397.method3785((long) i);
	if (class163_sub2 != null)
	    return class163_sub2;
	return this$0.method17963(i, -1011351119);
    }
    
    public void method4502() {
	throw new UnsupportedOperationException();
    }
    
    static final void method4503(Class683 class683, int i) {
	class683.anIntArray8661[501271953 * class683.anInt8662 - 1]
	    = Class608.method10005((class683.anIntArray8661
				    [class683.anInt8662 * 501271953 - 1]),
				   (byte) -38);
    }
    
    static final void method4504(Class683 class683, int i) {
	class683.anInt8662 -= 725972134;
	int i_0_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	if (i_0_ >= 2)
	    throw new RuntimeException();
	client.anInt11189 = i_0_ * -412741933;
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	if (1 + i_1_ >= (client.anIntArrayArrayArray11188
			 [-1693615781 * client.anInt11189]).length >> 1)
	    throw new RuntimeException();
	client.anInt11184 = -1658649107 * i_1_;
	client.anInt11193 = 0;
	client.anInt11194 = 790324825 * (class683.anIntArray8661
					 [2 + 501271953 * class683.anInt8662]);
	client.anInt11142 = -85549893 * (class683.anIntArray8661
					 [501271953 * class683.anInt8662 + 3]);
	int i_2_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 4];
	if (i_2_ >= 2)
	    throw new RuntimeException();
	client.anInt11191 = 912399317 * i_2_;
	int i_3_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 5];
	if (1 + i_3_ >= (client.anIntArrayArrayArray11188
			 [client.anInt11191 * 1110984061]).length >> 1)
	    throw new RuntimeException();
	client.anInt11192 = i_3_ * 482467859;
	Class700.anInt8779 = 1337990514;
	Class648.anInt8363 = -1945230309;
	Class198_Sub3.anInt9911 = 56698409;
    }
    
    static final String method4505(int i, byte i_4_) {
	String string = Integer.toString(i);
	for (int i_5_ = string.length() - 3; i_5_ > 0; i_5_ -= 3)
	    string
		= new StringBuilder().append(string.substring(0, i_5_)).append
		      (Class55.aString560).append
		      (string.substring(i_5_)).toString();
	if (string.length() > 9)
	    return new StringBuilder().append(" ").append
		       (Class493.method8001(65408, 2052474441)).append
		       (string.substring(0, string.length() - 8)).append
		       (Class53.aClass53_521.method1169(Class21.aClass666_213,
							1552651121))
		       .append
		       (" (").append
		       (string).append
		       (")").append
		       (Class55.aString566).toString();
	if (string.length() > 6)
	    return new StringBuilder().append(" ").append
		       (Class493.method8001(16777215, 1619895562)).append
		       (string.substring(0, string.length() - 4)).append
		       (Class53.aClass53_523.method1169(Class21.aClass666_213,
							1552651121))
		       .append
		       (" (").append
		       (string).append
		       (")").append
		       (Class55.aString566).toString();
	return new StringBuilder().append(" ").append
		   (Class493.method8001(16776960, 529225516)).append
		   (string).append
		   (Class55.aString566).toString();
    }
    
    public static Frame method4506(Class4 class4, int i, int i_6_, int i_7_,
				   int i_8_, int i_9_) {
	if (i_7_ == 0) {
	    Class18[] class18s = Class389.method6467(class4, -1331095123);
	    if (class18s == null)
		return null;
	    boolean bool = false;
	    for (int i_10_ = 0; i_10_ < class18s.length; i_10_++) {
		if (class18s[i_10_].anInt200 * 1036776891 == i
		    && class18s[i_10_].anInt201 * -2072667521 == i_6_
		    && (i_8_ == 0
			|| i_8_ == -805434643 * class18s[i_10_].anInt203)
		    && (!bool
			|| class18s[i_10_].anInt202 * 1891227749 > i_7_)) {
		    i_7_ = class18s[i_10_].anInt202 * 1891227749;
		    bool = true;
		}
	    }
	    if (!bool)
		return null;
	}
	Frame frame = new Frame("Jagex Full Screen");
	frame.setResizable(false);
	class4.method533(frame, i, i_6_, i_7_, i_8_, (byte) 0);
	return frame;
    }
}
