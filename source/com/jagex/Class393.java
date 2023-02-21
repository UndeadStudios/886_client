/* Class393 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class393
{
    float aFloat4084;
    Class393 aClass393_4085;
    Interface43 anInterface43_4086;
    float aFloat4087;
    float aFloat4088;
    float aFloat4089;
    long aLong4090;
    long aLong4091;
    
    public void method6483(float f) {
	if (anInterface43_4086 == null) {
	    aFloat4089 = f;
	    aFloat4084 = aFloat4088;
	    aLong4090 = Class251.method4508((byte) 8) * 5738763048700570821L;
	    aLong4091 = 1315895222026394244L + 557108913679993653L * aLong4090;
	}
    }
    
    float method6484(byte i) {
	return aFloat4087;
    }
    
    public float method6485(int i) {
	float f = 1.0F;
	for (Class393 class393_0_ = this; null != class393_0_;
	     class393_0_ = class393_0_.method6499(-854764053))
	    f *= class393_0_.method6484((byte) 1);
	return f;
    }
    
    void method6486(byte i) {
	if (null != anInterface43_4086) {
	    float f = anInterface43_4086.method323(269909876);
	    if (aFloat4088 != f && aFloat4089 < 0.0F) {
		aFloat4084 = aFloat4088;
		aFloat4089 = f;
		aLong4090
		    = Class251.method4508((byte) 8) * 5738763048700570821L;
		aLong4091
		    = 557108913679993653L * aLong4090 + 1315895222026394244L;
	    }
	}
	if (aFloat4089 >= 0.0F) {
	    long l = Class251.method4508((byte) 8);
	    if (l > aLong4091 * -8054467619430887815L) {
		aFloat4088 = aFloat4089;
		aFloat4089 = -1.0F;
	    } else {
		float f = aFloat4089 - aFloat4084;
		long l_1_ = (aLong4091 * -8054467619430887815L
			     - aLong4090 * -6215458399010344435L);
		float f_2_ = f / (float) l_1_;
		aFloat4088 = aFloat4084 + (float) (l - (-6215458399010344435L
							* aLong4090)) * f_2_;
		if (aFloat4088 == aFloat4089)
		    aFloat4089 = -1.0F;
	    }
	}
	aFloat4088 = Math.min(1.0F, Math.max(aFloat4088, 0.0F));
    }
    
    public float method6487(short i) {
	float f = aFloat4088;
	for (Class393 class393_3_ = aClass393_4085; class393_3_ != null;
	     class393_3_ = class393_3_.method6499(-829729572))
	    f *= class393_3_.method6501((byte) 0);
	f = Math.min(Math.max(f, 0.0F), 1.0F);
	return f;
    }
    
    public Class393 method6488() {
	return aClass393_4085;
    }
    
    public void method6489(float f, int i) {
	if (anInterface43_4086 == null) {
	    aFloat4089 = f;
	    aFloat4084 = aFloat4088;
	    aLong4090 = Class251.method4508((byte) 8) * 5738763048700570821L;
	    aLong4091 = 1315895222026394244L + 557108913679993653L * aLong4090;
	}
    }
    
    public Class393 method6490() {
	return aClass393_4085;
    }
    
    float method6491() {
	return aFloat4087;
    }
    
    float method6492() {
	return aFloat4087;
    }
    
    public float method6493() {
	float f = 1.0F;
	for (Class393 class393_4_ = this; null != class393_4_;
	     class393_4_ = class393_4_.method6499(-205179071))
	    f *= class393_4_.method6484((byte) 1);
	return f;
    }
    
    public float method6494() {
	float f = 1.0F;
	for (Class393 class393_5_ = this; null != class393_5_;
	     class393_5_ = class393_5_.method6499(-974668675))
	    f *= class393_5_.method6484((byte) 1);
	return f;
    }
    
    public float method6495() {
	float f = 1.0F;
	for (Class393 class393_6_ = this; null != class393_6_;
	     class393_6_ = class393_6_.method6499(58332889))
	    f *= class393_6_.method6484((byte) 1);
	return f;
    }
    
    public float method6496() {
	float f = aFloat4088;
	for (Class393 class393_7_ = aClass393_4085; class393_7_ != null;
	     class393_7_ = class393_7_.method6499(1259461447))
	    f *= class393_7_.method6501((byte) 0);
	f = Math.min(Math.max(f, 0.0F), 1.0F);
	return f;
    }
    
    public float method6497() {
	return aFloat4088;
    }
    
    public void method6498(float f) {
	if (anInterface43_4086 == null) {
	    aFloat4089 = f;
	    aFloat4084 = aFloat4088;
	    aLong4090 = Class251.method4508((byte) 8) * 5738763048700570821L;
	    aLong4091 = 1315895222026394244L + 557108913679993653L * aLong4090;
	}
    }
    
    Class393(int i, float f, Object object, Class381 class381,
	     Interface43 interface43, Class393 class393_8_) {
	aClass393_4085 = class393_8_;
	anInterface43_4086 = interface43;
	aFloat4088 = 1.0F;
	aFloat4087 = f;
	aFloat4084 = -1.0F;
	aFloat4089 = -1.0F;
	aLong4090 = -5738763048700570821L;
	aLong4091 = -7576324022441180105L;
    }
    
    public Class393 method6499(int i) {
	return aClass393_4085;
    }
    
    public Class393 method6500() {
	return aClass393_4085;
    }
    
    public float method6501(byte i) {
	return aFloat4088;
    }
    
    static final void method6502(Class683 class683, int i) {
	int i_9_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (null == Class162.aClass245Array1764[i_9_])
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= Class162.aClass245Array1764[i_9_].aClass259Array2426.length;
    }
}
