/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

class Class192 implements Interface25
{
    Class217 this$0;
    
    public void method141(Object object) {
	method3702((Interface69) object, (byte) 37);
    }
    
    void method3702(Interface69 interface69, byte i) {
	Iterator iterator = this$0.method4029(-405102881).iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    if (class488.method7897((byte) 127) == interface69) {
		class488.method7871(2003023860);
		iterator.remove();
	    }
	}
    }
    
    public void method142(Object object, byte i) {
	method3702((Interface69) object, (byte) 34);
    }
    
    void method3703(Interface69 interface69) {
	Iterator iterator = this$0.method4029(517582590).iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    if (class488.method7897((byte) 63) == interface69) {
		class488.method7871(2135060910);
		iterator.remove();
	    }
	}
    }
    
    void method3704(Interface69 interface69) {
	Iterator iterator = this$0.method4029(2006905294).iterator();
	while (iterator.hasNext()) {
	    Class488 class488 = (Class488) iterator.next();
	    if (class488.method7897((byte) 106) == interface69) {
		class488.method7871(1954714501);
		iterator.remove();
	    }
	}
    }
    
    Class192(Class217 class217) {
	this$0 = class217;
    }
    
    public void method143(Object object) {
	method3702((Interface69) object, (byte) 1);
    }
    
    static final void method3705(Class683 class683, byte i) {
	throw new RuntimeException("");
    }
    
    static void method3706(Class683 class683, int i) {
	int i_0_ = Class331.method5806(1270541166);
	if (i_0_ < 0) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= Class320.aTwitchEventLiveStreams3534.viewerCounts[i_0_];
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= Class320.aTwitchEventLiveStreams3534.channelUrls[i_0_];
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= (Class320.aTwitchEventLiveStreams3534.previewUrlTemplates
		   [i_0_]);
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= Class320.aTwitchEventLiveStreams3534.streamTitles[i_0_];
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= (Class320.aTwitchEventLiveStreams3534.channelDisplayNames
		   [i_0_]);
	}
    }
}
