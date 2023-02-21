/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchWebcamFrameData;

public class Class193
{
    int anInt2144;
    Class608 aClass608_2145;
    int anInt2146;
    int anInt2147;
    int anInt2148;
    int anInt2149;
    public static Class353 aClass353_2150;
    
    boolean method3707(byte i) {
	if (631435793 * anInt2146 >= 0) {
	    Class602 class602
		= ((Class602)
		   Class642.aClass40_Sub11_8327.method76(631435793 * anInt2146,
							 -307464716));
	    boolean bool
		= class602.method9905(aClass608_2145.anInt7995 * -1214990409,
				      125663309);
	    int[] is = class602.method9916(16777215);
	    if (is != null) {
		int[] is_0_ = is;
		for (int i_1_ = 0; i_1_ < is_0_.length; i_1_++) {
		    int i_2_ = is_0_[i_1_];
		    bool &= ((Class194)
			     Class685.aClass40_Sub8_8691.method76(i_2_,
								  1617282308))
				.method3725(-1594066160);
		}
	    }
	    return bool;
	}
	return true;
    }
    
    void method3708(int i, int i_3_, int i_4_, int i_5_, byte i_6_) {
	Class712.method14454(i, i_3_, i_4_,
			     -1420193421 * aClass608_2145.anInt8000,
			     anInt2146 * 631435793,
			     -1214990409 * aClass608_2145.anInt7995, i_5_,
			     -75815212);
	anInt2148 = 2097922277 * i;
	anInt2147 = i_3_ * -2122041275;
	anInt2144 = i_4_ * 80059117;
	anInt2149 = 389467373 * i_5_;
    }
    
    boolean method3709() {
	if (631435793 * anInt2146 >= 0) {
	    Class602 class602
		= ((Class602)
		   Class642.aClass40_Sub11_8327.method76(631435793 * anInt2146,
							 1063089017));
	    boolean bool
		= class602.method9905(aClass608_2145.anInt7995 * -1214990409,
				      897570289);
	    int[] is = class602.method9916(16777215);
	    if (is != null) {
		int[] is_7_ = is;
		for (int i = 0; i < is_7_.length; i++) {
		    int i_8_ = is_7_[i];
		    bool &= ((Class194)
			     Class685.aClass40_Sub8_8691.method76(i_8_,
								  1655886269))
				.method3725(1217942986);
		}
	    }
	    return bool;
	}
	return true;
    }
    
    Class193(RSBuffer class525_sub38) {
	anInt2146 = class525_sub38.readBigSmart(-2043778683) * -245743887;
	aClass608_2145
	    = ((Class608)
	       Class539.method8888(Class50.method1127((byte) 16),
				   class525_sub38.readUnsignedByte(843507502),
				   -498439676));
    }
    
    void method3710(int i, int i_9_, int i_10_, int i_11_) {
	Class712.method14454(i, i_9_, i_10_,
			     -1420193421 * aClass608_2145.anInt8000,
			     anInt2146 * 631435793,
			     -1214990409 * aClass608_2145.anInt7995, i_11_,
			     211081146);
	anInt2148 = 2097922277 * i;
	anInt2147 = i_9_ * -2122041275;
	anInt2144 = i_10_ * 80059117;
	anInt2149 = 389467373 * i_11_;
    }
    
    void method3711() {
	Class712.method14454(anInt2148 * -1501954835, anInt2147 * 1224612493,
			     anInt2144 * 939447013,
			     -1420193421 * aClass608_2145.anInt8000, -1,
			     -1214990409 * aClass608_2145.anInt7995,
			     anInt2149 * -1539346203, -1111385251);
    }
    
    void method3712(int i) {
	Class712.method14454(anInt2148 * -1501954835, anInt2147 * 1224612493,
			     anInt2144 * 939447013,
			     -1420193421 * aClass608_2145.anInt8000, -1,
			     -1214990409 * aClass608_2145.anInt7995,
			     anInt2149 * -1539346203, -2009535041);
    }
    
    void method3713() {
	Class712.method14454(anInt2148 * -1501954835, anInt2147 * 1224612493,
			     anInt2144 * 939447013,
			     -1420193421 * aClass608_2145.anInt8000, -1,
			     -1214990409 * aClass608_2145.anInt7995,
			     anInt2149 * -1539346203, -1744976156);
    }
    
    public static int method3714(int i, int i_12_, int i_13_) {
	Class589.aTwitchWebcamFrameData7801 = new TwitchWebcamFrameData();
	if (i < 0 || i >= Class589.aTwitchWebcamDeviceArray7803.length)
	    return -1;
	return (Class285.aTwitchTV3143.StartWebcamDevice
		((Class589.aTwitchWebcamDeviceArray7803[i].anInt1151
		  * -1510638163),
		 i_12_));
    }
    
    static final void method3715(Class683 class683, int i) {
	Class61.method1373(-1097246688);
    }
    
    static boolean method3716(int i, int i_14_) {
	return 1 == i || i == 14 || 0 == i || i == 9 || 8 == i || 2 == i;
    }
    
    public static final void method3717(byte i) {
	if (!client.aBool11180) {
	    client.aFloat11179 += (-12.0F - client.aFloat11179) / 2.0F;
	    client.aBool11364 = true;
	    client.aBool11180 = true;
	}
    }
}
