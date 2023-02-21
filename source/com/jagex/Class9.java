/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class9 implements Interface3
{
    Interface53 anInterface53_138;
    Map aMap139;
    
    public void method28(int i, int i_0_) {
	if (aMap139 != null)
	    aMap139.remove(Integer.valueOf(i));
    }
    
    public int method26(int i, byte i_1_) {
	if (aMap139 != null) {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (null != class447)
		return ((Integer) class447.anObject4899).intValue();
	}
	return ((Integer) anInterface53_138.method355(i, -1368992936))
		   .intValue();
    }
    
    public void method14(int i, int i_2_, int i_3_) {
	if (aMap139 == null) {
	    aMap139 = new HashMap();
	    aMap139.put(Integer.valueOf(i),
			new Class447(i, Integer.valueOf(i_2_)));
	} else {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (class447 == null)
		aMap139.put(Integer.valueOf(i),
			    new Class447(i, Integer.valueOf(i_2_)));
	    else
		class447.anObject4899 = Integer.valueOf(i_2_);
	}
    }
    
    public void method16(int i, long l) {
	if (null == aMap139) {
	    aMap139 = new HashMap();
	    aMap139.put(Integer.valueOf(i), new Class447(i, Long.valueOf(l)));
	} else {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (class447 == null)
		aMap139.put(Integer.valueOf(i),
			    new Class447(i, Long.valueOf(l)));
	    else
		class447.anObject4899 = Long.valueOf(l);
	}
    }
    
    public void method21(int i, int i_4_) {
	if (aMap139 == null) {
	    aMap139 = new HashMap();
	    aMap139.put(Integer.valueOf(i),
			new Class447(i, Integer.valueOf(i_4_)));
	} else {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (class447 == null)
		aMap139.put(Integer.valueOf(i),
			    new Class447(i, Integer.valueOf(i_4_)));
	    else
		class447.anObject4899 = Integer.valueOf(i_4_);
	}
    }
    
    public Class9(Interface53 interface53) {
	anInterface53_138 = interface53;
    }
    
    public void method18(int i, Object object, byte i_5_) {
	if (aMap139 == null) {
	    aMap139 = new HashMap();
	    aMap139.put(Integer.valueOf(i), new Class447(i, object));
	} else {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (class447 == null)
		aMap139.put(Integer.valueOf(i), new Class447(i, object));
	    else
		class447.anObject4899 = object;
	}
    }
    
    public void method29(int i) {
	if (aMap139 != null)
	    aMap139.remove(Integer.valueOf(i));
    }
    
    public Iterator method677() {
	if (aMap139 == null)
	    return Collections.emptyList().iterator();
	return aMap139.values().iterator();
    }
    
    public Iterator iterator() {
	if (aMap139 == null)
	    return Collections.emptyList().iterator();
	return aMap139.values().iterator();
    }
    
    public Iterator method678() {
	if (aMap139 == null)
	    return Collections.emptyList().iterator();
	return aMap139.values().iterator();
    }
    
    public void method19(int i) {
	if (aMap139 != null)
	    aMap139.clear();
    }
    
    public Object method17(int i, int i_6_) {
	if (null != aMap139) {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (class447 != null)
		return class447.anObject4899;
	}
	return anInterface53_138.method355(i, -1368992936);
    }
    
    public long method22(int i) {
	if (aMap139 != null) {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (null != class447)
		return ((Long) class447.anObject4899).longValue();
	}
	return ((Long) anInterface53_138.method355(i, -1368992936))
		   .longValue();
    }
    
    public long method23(int i) {
	if (aMap139 != null) {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (null != class447)
		return ((Long) class447.anObject4899).longValue();
	}
	return ((Long) anInterface53_138.method355(i, -1368992936))
		   .longValue();
    }
    
    public void method13(int i, long l) {
	if (null == aMap139) {
	    aMap139 = new HashMap();
	    aMap139.put(Integer.valueOf(i), new Class447(i, Long.valueOf(l)));
	} else {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (class447 == null)
		aMap139.put(Integer.valueOf(i),
			    new Class447(i, Long.valueOf(l)));
	    else
		class447.anObject4899 = Long.valueOf(l);
	}
    }
    
    public Object method25(int i) {
	if (null != aMap139) {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (class447 != null)
		return class447.anObject4899;
	}
	return anInterface53_138.method355(i, -1368992936);
    }
    
    public void method24(int i, Object object) {
	if (aMap139 == null) {
	    aMap139 = new HashMap();
	    aMap139.put(Integer.valueOf(i), new Class447(i, object));
	} else {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (class447 == null)
		aMap139.put(Integer.valueOf(i), new Class447(i, object));
	    else
		class447.anObject4899 = object;
	}
    }
    
    public void method27(int i) {
	if (aMap139 != null)
	    aMap139.remove(Integer.valueOf(i));
    }
    
    public void method20(int i) {
	if (aMap139 != null)
	    aMap139.remove(Integer.valueOf(i));
    }
    
    public void method31(int i) {
	if (aMap139 != null)
	    aMap139.remove(Integer.valueOf(i));
    }
    
    public void method30(int i) {
	if (aMap139 != null)
	    aMap139.remove(Integer.valueOf(i));
    }
    
    public long method15(int i, int i_7_) {
	if (aMap139 != null) {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (null != class447)
		return ((Long) class447.anObject4899).longValue();
	}
	return ((Long) anInterface53_138.method355(i, -1368992936))
		   .longValue();
    }
    
    public int method32(int i) {
	if (aMap139 != null) {
	    Class447 class447 = (Class447) aMap139.get(Integer.valueOf(i));
	    if (null != class447)
		return ((Integer) class447.anObject4899).intValue();
	}
	return ((Integer) anInterface53_138.method355(i, -1368992936))
		   .intValue();
    }
    
    public void method33() {
	if (aMap139 != null)
	    aMap139.clear();
    }
    
    static final void method679(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_8_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_9_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	Class697 class697
	    = Class556.method9251(i_8_ >> 14 & 0x3fff, i_8_ & 0x3fff);
	boolean bool = false;
	for (Class525_Sub16_Sub6 class525_sub16_sub6
		 = (Class525_Sub16_Sub6) class697.method14186((byte) -90);
	     null != class525_sub16_sub6;
	     class525_sub16_sub6
		 = (Class525_Sub16_Sub6) class697.method14201((byte) -1)) {
	    if (class525_sub16_sub6.anInt11777 * 2044380983 == i_9_) {
		bool = true;
		break;
	    }
	}
	if (bool)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
}
