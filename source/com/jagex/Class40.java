/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class40 implements Interface13
{
    Class200 aClass200_330;
    protected Interface5 anInterface5_331;
    public int anInt332;
    Class663 aClass663_333;
    Class458 aClass458_334;
    
    public void method1016() {
	synchronized (aClass200_330) {
	    aClass200_330.method3809((byte) 112);
	}
    }
    
    public Interface12 method76(int i, int i_0_) {
	Interface12 interface12;
	synchronized (aClass200_330) {
	    interface12 = (Interface12) aClass200_330.method3785((long) i);
	}
	if (interface12 != null)
	    return interface12;
	interface12 = method1017(i, (byte) 9);
	synchronized (aClass200_330) {
	    aClass200_330.method3788(interface12, (long) i);
	}
	return interface12;
    }
    
    public Iterator iterator() {
	return new Class39(this);
    }
    
    Interface12 method1017(int i, byte i_1_) {
	byte[] is;
	synchronized (aClass458_334) {
	    is = Class293.method5307(aClass458_334, aClass663_333, i,
				     (short) 255);
	}
	Interface12 interface12
	    = anInterface5_331.method42(i, this, -169695060);
	if (is != null)
	    interface12.method66(new RSBuffer(is), -412916016);
	interface12.method67(-270826562);
	return interface12;
    }
    
    public void method1018(int i, byte i_2_) {
	synchronized (aClass200_330) {
	    aClass200_330.method3791((byte) -54);
	    aClass200_330 = new Class200(i);
	}
    }
    
    public void method1019(int i) {
	synchronized (aClass200_330) {
	    aClass200_330.method3791((byte) -81);
	}
    }
    
    public void method1020(int i, byte i_3_) {
	synchronized (aClass200_330) {
	    aClass200_330.method3805(i, 2059568286);
	}
    }
    
    public void method1021(byte i) {
	synchronized (aClass200_330) {
	    aClass200_330.method3809((byte) 123);
	}
    }
    
    public int method72(int i) {
	return -1988422751 * anInt332;
    }
    
    public Interface12 method73(int i) {
	Interface12 interface12;
	synchronized (aClass200_330) {
	    interface12 = (Interface12) aClass200_330.method3785((long) i);
	}
	if (interface12 != null)
	    return interface12;
	interface12 = method1017(i, (byte) 9);
	synchronized (aClass200_330) {
	    aClass200_330.method3788(interface12, (long) i);
	}
	return interface12;
    }
    
    public Interface12 method74(int i) {
	Interface12 interface12;
	synchronized (aClass200_330) {
	    interface12 = (Interface12) aClass200_330.method3785((long) i);
	}
	if (interface12 != null)
	    return interface12;
	interface12 = method1017(i, (byte) 9);
	synchronized (aClass200_330) {
	    aClass200_330.method3788(interface12, (long) i);
	}
	return interface12;
    }
    
    public int method57() {
	return -1988422751 * anInt332;
    }
    
    public int method75() {
	return -1988422751 * anInt332;
    }
    
    public int method7() {
	return -1988422751 * anInt332;
    }
    
    public int method8() {
	return -1988422751 * anInt332;
    }
    
    public int method77() {
	return -1988422751 * anInt332;
    }
    
    public void method1022() {
	synchronized (aClass200_330) {
	    aClass200_330.method3791((byte) -51);
	}
    }
    
    public int method71() {
	return -1988422751 * anInt332;
    }
    
    public void method1023() {
	synchronized (aClass200_330) {
	    aClass200_330.method3791((byte) -72);
	}
    }
    
    public void method1024() {
	synchronized (aClass200_330) {
	    aClass200_330.method3791((byte) -28);
	}
    }
    
    public void method1025(int i) {
	synchronized (aClass200_330) {
	    aClass200_330.method3805(i, 2082392032);
	}
    }
    
    public void method1026(int i) {
	synchronized (aClass200_330) {
	    aClass200_330.method3805(i, 1913280184);
	}
    }
    
    public Class40(Class668 class668, Class666 class666, Class458 class458,
		   Class663 class663, int i, Interface5 interface5) {
	aClass458_334 = class458;
	aClass663_333 = class663;
	anInterface5_331 = interface5;
	anInt332 = Class417.method6723(aClass458_334, aClass663_333,
				       -293795768) * 1551077473;
	aClass200_330 = new Class200(i);
    }
    
    public void method1027() {
	synchronized (aClass200_330) {
	    aClass200_330.method3809((byte) 21);
	}
    }
    
    public void method1028() {
	synchronized (aClass200_330) {
	    aClass200_330.method3809((byte) 83);
	}
    }
    
    public void method1029() {
	synchronized (aClass200_330) {
	    aClass200_330.method3809((byte) 46);
	}
    }
    
    public Iterator method1030() {
	return new Class39(this);
    }
    
    public Iterator method1031() {
	return new Class39(this);
    }
    
    Interface12 method1032(int i) {
	byte[] is;
	synchronized (aClass458_334) {
	    is = Class293.method5307(aClass458_334, aClass663_333, i,
				     (short) 255);
	}
	Interface12 interface12
	    = anInterface5_331.method42(i, this, -147869450);
	if (is != null)
	    interface12.method66(new RSBuffer(is), -412916016);
	interface12.method67(1730944617);
	return interface12;
    }
    
    public void method1033(int i) {
	synchronized (aClass200_330) {
	    aClass200_330.method3791((byte) 69);
	    aClass200_330 = new Class200(i);
	}
    }
    
    public void method1034(int i) {
	synchronized (aClass200_330) {
	    aClass200_330.method3791((byte) 45);
	    aClass200_330 = new Class200(i);
	}
    }
    
    public void method1035(int i) {
	synchronized (aClass200_330) {
	    aClass200_330.method3791((byte) -39);
	    aClass200_330 = new Class200(i);
	}
    }
    
    static final void method1036(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715
		  .method17106(-95138278) ? 1 : 0;
    }
    
    static final void method1037(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	boolean bool = ((class683.anIntArray8661
			 [(class683.anInt8662 -= 1552651121) * 501271953])
			== 1);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class694.method14155(string, bool, (byte) 44);
    }
}
