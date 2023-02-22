/* Class331 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Date;

public class Class331 implements Interface33
{
    JS5 aClass458_3592;
    Class399 aClass399_3593;
    Class157 aClass157_3594;
    
    public boolean method210() {
	return aClass458_3592.method7506((-1638978771
					  * aClass399_3593.anInt4127),
					 491475098);
    }
    
    Class331(JS5 class458, Class399 class399) {
	aClass458_3592 = class458;
	aClass399_3593 = class399;
    }
    
    public void method212(boolean bool, byte i) {
	if (bool) {
	    int i_0_ = ((aClass399_3593.aClass395_4126.method6521
			 (aClass157_3594.method12(),
			  -1202561691 * client.anInt11223, (byte) -46))
			+ -2069204943 * aClass399_3593.anInt4128);
	    int i_1_
		= (aClass399_3593.aClass396_4129.method6529(aClass157_3594
								.method2472(),
							    (client.anInt11224
							     * -1167554197),
							    (byte) 100)
		   + 1167061423 * aClass399_3593.anInt4125);
	    aClass157_3594.method2518(i_0_, i_1_);
	}
    }
    
    public boolean method213(int i) {
	return aClass458_3592.method7506((-1638978771
					  * aClass399_3593.anInt4127),
					 -1485193749);
    }
    
    public void method211(int i) {
	aClass157_3594
	    = Class108.method1933(aClass458_3592,
				  -1638978771 * aClass399_3593.anInt4127,
				  65280);
    }
    
    public void method70() {
	aClass157_3594
	    = Class108.method1933(aClass458_3592,
				  -1638978771 * aClass399_3593.anInt4127,
				  65280);
    }
    
    public void method209(boolean bool) {
	if (bool) {
	    int i = ((aClass399_3593.aClass395_4126.method6521
		      (aClass157_3594.method12(),
		       -1202561691 * client.anInt11223, (byte) -86))
		     + -2069204943 * aClass399_3593.anInt4128);
	    int i_2_
		= (aClass399_3593.aClass396_4129.method6529(aClass157_3594
								.method2472(),
							    (client.anInt11224
							     * -1167554197),
							    (byte) 100)
		   + 1167061423 * aClass399_3593.anInt4125);
	    aClass157_3594.method2518(i, i_2_);
	}
    }
    
    public static int method5806(int i) {
	if (null == Class320.aTwitchEventLiveStreams3534
	    || (-1605532775 * Class589.anInt7804
		>= Class320.aTwitchEventLiveStreams3534.streamCount - 1))
	    return -1;
	return (Class589.anInt7804 += 1007231145) * -1605532775;
    }
    
    static final void method5807(Class683 class683, int i) {
	class683.anIntArray8661[501271953 * class683.anInt8662 - 1]
	    = (class683.aClass525_Sub25_8653.method16345((byte) -48)
	       [class683.anIntArray8661[501271953 * class683.anInt8662 - 1]]);
    }
    
    static String method5808(long l) {
	return Class257.method4655(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz",
				   -123220515);
    }
}
