/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class215 implements Interface70
{
    Class217 this$0;
    public static ConfigEntry aClass58_2283;
    
    Class215(Class217 class217) {
	this$0 = class217;
    }
    
    public void method482(Interface69 interface69, int i, int i_0_,
			  boolean bool, byte i_1_) {
	this$0.method4023((byte) 26).add(interface69);
	if (bool)
	    this$0.method4025(1225367130).method3788(interface69, (long) i_0_);
	else
	    this$0.method4024(764738622).method3789(interface69, (long) i_0_,
						    interface69
							.method437((byte) 110),
						    (byte) -44);
    }
    
    public void method486(Interface69 interface69, int i) {
	if (interface69 != null)
	    this$0.method4024(1863627324)
		.method3785((long) interface69.method439(-1791996218));
    }
    
    public void method481(Interface69 interface69, int i, int i_2_,
			  boolean bool) {
	this$0.method4023((byte) 107).add(interface69);
	if (bool)
	    this$0.method4025(891634758).method3788(interface69, (long) i_2_);
	else
	    this$0.method4024(-1517017892).method3789
		(interface69, (long) i_2_, interface69.method437((byte) 115),
		 (byte) -97);
    }
    
    public void method484(Interface69 interface69) {
	if (interface69 != null)
	    this$0.method4024(1780623329)
		.method3785((long) interface69.method439(-1005104040));
    }
    
    public void method483(Interface69 interface69) {
	if (interface69 != null)
	    this$0.method4024(425257207)
		.method3785((long) interface69.method439(-513311612));
    }
    
    public void method485(Interface69 interface69) {
	if (interface69 != null)
	    this$0.method4024(-1260149292)
		.method3785((long) interface69.method439(-420046891));
    }
    
    static final void method4014(Class683 class683, int i) {
	Class214.method4012((byte) 127);
    }
    
    static final void method4015(Class683 class683, byte i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub11_10688,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]) == 1 ? 1 : 0,
	     (byte) -12);
	client.aClass507_11137.method8375((byte) -27);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
    
    public static int method4016(int i, int i_3_, int i_4_, int i_5_) {
	int i_6_ = Class294.method5312(i_4_ - i_3_ + 1, (byte) 0);
	i_6_ <<= i_3_;
	return i &= i_6_ ^ 0xffffffff;
    }
    
    static final void method4017(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static int method4018(int i, byte i_7_) {
	Class589.aTwitchWebcamFrameData7801 = null;
	Class589.aClass157_7807 = null;
	if (i < 0 || i >= Class589.aTwitchWebcamDeviceArray7803.length)
	    return -1;
	return (Class285.aTwitchTV3143.StopWebcamDevice
		(Class589.aTwitchWebcamDeviceArray7803[i].anInt1151
		 * -1510638163));
    }
}
