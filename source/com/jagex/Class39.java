/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

class Class39 implements Iterator
{
    Class40 this$0;
    int anInt329;
    
    public void method1006() {
	throw new UnsupportedOperationException();
    }
    
    public boolean hasNext() {
	return 96619001 * anInt329 < -1988422751 * this$0.anInt332;
    }
    
    public Object next() {
	int i = (anInt329 += -1831196599) * 96619001 - 1;
	synchronized (this$0.aClass200_330) {
	    Interface12 interface12
		= (Interface12) this$0.aClass200_330.method3785((long) i);
	    if (interface12 != null) {
		Interface12 interface12_0_ = interface12;
		return interface12_0_;
	    }
	}
	return this$0.method1017(i, (byte) 9);
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method1007() {
	return 96619001 * anInt329 < -1988422751 * this$0.anInt332;
    }
    
    public boolean method1008() {
	return 96619001 * anInt329 < -1988422751 * this$0.anInt332;
    }
    
    public boolean method1009() {
	return 96619001 * anInt329 < -1988422751 * this$0.anInt332;
    }
    
    public Object method1010() {
	int i = (anInt329 += -1831196599) * 96619001 - 1;
	synchronized (this$0.aClass200_330) {
	    Interface12 interface12
		= (Interface12) this$0.aClass200_330.method3785((long) i);
	    if (interface12 != null) {
		Interface12 interface12_1_ = interface12;
		return interface12_1_;
	    }
	}
	return this$0.method1017(i, (byte) 9);
    }
    
    public Object method1011() {
	int i = (anInt329 += -1831196599) * 96619001 - 1;
	synchronized (this$0.aClass200_330) {
	    Interface12 interface12
		= (Interface12) this$0.aClass200_330.method3785((long) i);
	    if (interface12 != null) {
		Interface12 interface12_2_ = interface12;
		return interface12_2_;
	    }
	}
	return this$0.method1017(i, (byte) 9);
    }
    
    public Object method1012() {
	int i = (anInt329 += -1831196599) * 96619001 - 1;
	synchronized (this$0.aClass200_330) {
	    Interface12 interface12
		= (Interface12) this$0.aClass200_330.method3785((long) i);
	    if (interface12 != null) {
		Interface12 interface12_3_ = interface12;
		return interface12_3_;
	    }
	}
	return this$0.method1017(i, (byte) 9);
    }
    
    Class39(Class40 class40) {
	this$0 = class40;
    }
    
    static final void method1013(Class259 class259, Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_4_ = class683.anIntArray8661[501271953 * class683.anInt8662] - 1;
	int i_5_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	if (i_4_ < 0 || i_4_ > 9)
	    throw new RuntimeException();
	Class684.method11244(class259, i_4_, i_5_, class683, -1681803501);
    }
    
    static final void method1014(Class683 class683, byte i) {
	class683.anInt8662 -= 725972134;
	int i_6_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_7_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_8_ = class683.anIntArray8661[2 + class683.anInt8662 * 501271953];
	int i_9_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 3];
	int i_10_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 4];
	int i_11_
	    = class683.anIntArray8661[5 + class683.anInt8662 * 501271953];
	Class488 class488
	    = (Class40_Sub20.aClass217_11050.method4046
	       (Class204.aClass204_2226, Class40_Sub20.aClass217_11050, i_6_,
		i_7_, i_9_, Class208.aClass208_2250.method3907((short) -9221),
		Class195.aClass195_2177, 0.0F, 0.0F, null, 0, i_10_, false,
		-105574900));
	if (class488 != null)
	    Class40_Sub20.aClass217_11050.method4095(class488, i_11_, i_8_,
						     (byte) 49);
    }
    
    public static void method1015(int i, int i_12_) {
	Class593.aBoolArray7832[i] = false;
	Class166.method2674(i, (byte) -37);
    }
}
