/* Class566 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Iterator;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;

class Class566 implements Runnable
{
    Class372_Sub2 this$0;
    public static JS5 aClass458_7604;
    public static Class40_Sub5 aClass40_Sub5_7605;
    
    public void method9468() {
	try {
	    while (!this$0.aBool10300) {
		HashMap hashmap = this$0.method15902(-1969057240);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class477 class477 = (Class477) iterator.next();
		    if (!class477.aBool5198) {
			Class494[] class494s
			    = (Class494[]) hashmap.get(class477);
			for (int i = 0; i < class494s.length; i++)
			    class494s[i].method8030((byte) -22);
		    }
		}
		Class229.method4381(10L);
	    }
	} catch (Exception exception) {
	    Class525_Sub16_Sub13.method18448(null, exception, (byte) 125);
	    exception.printStackTrace();
	}
    }
    
    public void run() {
	try {
	    while (!this$0.aBool10300) {
		HashMap hashmap = this$0.method15902(-1906917467);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class477 class477 = (Class477) iterator.next();
		    if (!class477.aBool5198) {
			Class494[] class494s
			    = (Class494[]) hashmap.get(class477);
			for (int i = 0; i < class494s.length; i++)
			    class494s[i].method8030((byte) 28);
		    }
		}
		Class229.method4381(10L);
	    }
	} catch (Exception exception) {
	    Class525_Sub16_Sub13.method18448(null, exception, (byte) 86);
	    exception.printStackTrace();
	}
    }
    
    Class566(Class372_Sub2 class372_sub2) {
	this$0 = class372_sub2;
    }
    
    static final void method9469(Class683 class683, int i) {
	class683.anInt8662 -= 1915637188;
	int i_0_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	int i_2_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 2];
	int i_3_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 3];
	int i_4_ = 256;
	Class40_Sub20.aClass217_11050.method4047(Class204.aClass204_2233, i_0_,
						 i_1_, i_3_,
						 Class208.aClass208_2250
						     .method3907((short) 1305),
						 Class195.aClass195_2177, 0.0F,
						 0.0F, null, 0, i_4_, i_2_,
						 2128591773);
    }
    
    static final void method9470(Class683 class683, byte i) {
	class683.anInt8662 -= 1552651121;
	int i_5_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	Class40_Sub20.aClass217_11050.method4031(i_5_, -906047590);
    }
    
    static final void method9471(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_6_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_7_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	if (null
	    != Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aClass637_12246) {
	    for (int i_8_ = 0; i_8_ < Class327.anIntArray3573.length; i_8_++) {
		if (i_6_ == Class327.anIntArray3573[i_8_]) {
		    Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			.aClass637_12246.method10477
			(i_8_, i_7_, Class38.aClass40_Sub9_328, -902669522);
		    return;
		}
	    }
	    for (int i_9_ = 0; i_9_ < Class327.anIntArray3574.length; i_9_++) {
		if (i_6_ == Class327.anIntArray3574[i_9_]) {
		    Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			.aClass637_12246.method10477
			(i_9_, i_7_, Class38.aClass40_Sub9_328, -902669522);
		    break;
		}
	    }
	}
    }
    
    static final void method9472(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub16_10670
		  .method17113((short) -26920);
    }
    
    static boolean method9473(TwitchEvent twitchevent, long l) {
	if (!Class589.aBool7787) {
	    switch (twitchevent.eventType) {
	    case 7:
	    case 8:
	    case 9:
		return false;
	    }
	}
	if (twitchevent.eventType == 33) {
	    if (Class589.aTwitchWebcamFrameData7801 == null)
		return false;
	    int i = ((TwitchEventResult) twitchevent).result;
	    int i_10_ = (Class285.aTwitchTV3143.GetWebcamFrameData
			 (i, Class589.aTwitchWebcamFrameData7801));
	    if (i_10_ == 0) {
		if (Class589.aBool7800)
		    Class589.aTwitchWebcamFrameData7801.method14461();
		if (Class589.aBool7809)
		    Class589.aTwitchWebcamFrameData7801.method14462();
		Class405.method6610((byte) 126);
		Class589.aLong7806 = l * -1688966701639013385L;
		Class328.method5795(33, 0, -1545097409);
	    } else
		Class589.aClass157_7807 = null;
	    return false;
	}
	if (twitchevent.eventType == 30) {
	    int i = ((TwitchEventResult) twitchevent).result;
	    if (i == 0 || i == 1)
		Class696_Sub39.method17327(-1719493349);
	    else if (i == 2)
		Class589.aLong7806 = -1688966701639013385L * l;
	}
	if (twitchevent.eventType == 34) {
	    Class320.aTwitchEventLiveStreams3534
		= (TwitchEventLiveStreams) twitchevent;
	    Class328.method5795(34, 0, 1367855865);
	}
	return true;
    }
}
