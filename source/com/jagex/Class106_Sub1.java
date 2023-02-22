/* Class106_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class Class106_Sub1 extends Class106 implements Interface53
{
    protected Class453 aClass453_8986;
    
    public int method75() {
	return anInt1293 * -2037061385;
    }
    
    Class106_Sub1(Class668 class668, Class453 class453, Class666 class666,
		  int i) {
	super(class668, class666, i);
	aClass453_8986 = class453;
    }
    
    public int method72(int i) {
	return anInt1293 * -2037061385;
    }
    
    public Object method355(int i, int i_0_) {
	Class163 class163 = (Class163) method76(i, 1790538472);
	if (null == class163 || !class163.method2648((short) -15586))
	    return null;
	return class163.method2646(361694892);
    }
    
    public int method14514(Class447 class447, byte i) {
	int i_1_ = 2;
	if (class447.anObject4899 instanceof Integer)
	    i_1_ += 4;
	else if (class447.anObject4899 instanceof Long)
	    i_1_ += 8;
	else if (class447.anObject4899 instanceof String)
	    i_1_ += Class538.method8886((String) class447.anObject4899,
					1470515156);
	else if (class447.anObject4899 instanceof Interface9)
	    i_1_ += ((Interface9) class447.anObject4899).method49(-444653495);
	else
	    throw new IllegalStateException();
	return i_1_;
    }
    
    public int method8() {
	return anInt1293 * -2037061385;
    }
    
    public Class447 method14515(RSBuffer class525_sub38, byte i) {
	int i_2_ = class525_sub38.readUnsignedShort((byte) 122);
	Class163 class163 = (Class163) method76(i_2_, 1063412508);
	if (!class163.method2648((short) -20903))
	    throw new IllegalStateException("");
	Class447 class447 = new Class447(i_2_);
	Class var_class
	    = class163.aClass495_1765.method8131(-383648048).aClass5217;
	if (java.lang.Integer.class == var_class)
	    class447.anObject4899
		= Integer.valueOf(class525_sub38.readInt(951292875));
	else if (java.lang.Long.class == var_class)
	    class447.anObject4899
		= Long.valueOf(class525_sub38.method16603(-1076060251));
	else if (var_class == java.lang.String.class)
	    class447.anObject4899 = class525_sub38.method16637(-781090211);
	else if (com.jagex.Interface9.class.isAssignableFrom(var_class)) {
	    try {
		Interface9 interface9 = (Interface9) var_class.newInstance();
		interface9.method61(class525_sub38, -1243816377);
		class447.anObject4899 = interface9;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	return class447;
    }
    
    public Object method25(int i) {
	Class163 class163 = (Class163) method76(i, 1214870173);
	if (null == class163 || !class163.method2648((short) -16746))
	    return null;
	return class163.method2646(-1654999950);
    }
    
    public Class447 method14516(RSBuffer class525_sub38,
								Class480 class480) {
	int i = class525_sub38.readUnsignedShort((byte) 77);
	Class447 class447 = new Class447(i);
	Class var_class = class480.aClass5217;
	if (var_class == java.lang.Integer.class)
	    class447.anObject4899
		= Integer.valueOf(class525_sub38.readInt(1449383898));
	else if (var_class == java.lang.Long.class)
	    class447.anObject4899
		= Long.valueOf(class525_sub38.method16603(-184105041));
	else if (java.lang.String.class == var_class)
	    class447.anObject4899 = class525_sub38.method16637(816533282);
	else if (com.jagex.Interface9.class.isAssignableFrom(var_class)) {
	    try {
		Interface9 interface9 = (Interface9) var_class.newInstance();
		interface9.method61(class525_sub38, -1243816377);
		class447.anObject4899 = interface9;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	Class163 class163 = (Class163) method76(i, -2129358959);
	if (!class163.method2648((short) -26989)
	    || class163.aClass495_1765.method8131(-388707003) != class480)
	    return null;
	return class447;
    }
    
    public abstract Interface12 method74(int i);
    
    public int method57() {
	return anInt1293 * -2037061385;
    }
    
    public abstract Interface12 method73(int i);
    
    public int method7() {
	return anInt1293 * -2037061385;
    }
    
    public void method14517(RSBuffer class525_sub38, Class447 class447,
							byte i) {
	class525_sub38.method16602(class447.anInt4898 * -316828413, 528926061);
	if (class447.anObject4899 instanceof Integer)
	    class525_sub38.method16605(((Integer) class447.anObject4899)
					   .intValue(),
				       -369503265);
	else if (class447.anObject4899 instanceof Long)
	    class525_sub38
		.method16609(((Long) class447.anObject4899).longValue());
	else if (class447.anObject4899 instanceof String)
	    class525_sub38.method16612((String) class447.anObject4899,
				       -2056189211);
	else if (class447.anObject4899 instanceof Interface9)
	    ((Interface9) class447.anObject4899).method58(class525_sub38,
							  1722413272);
	else
	    throw new IllegalStateException();
    }
    
    public abstract Interface12 method76(int i, int i_3_);
    
    public int method71() {
	return anInt1293 * -2037061385;
    }
    
    public static Map method14518(Class106_Sub1[] class106_sub1s) {
	if (class106_sub1s == null || 0 == class106_sub1s.length)
	    return null;
	HashMap hashmap = new HashMap();
	Class106_Sub1[] class106_sub1s_4_ = class106_sub1s;
	for (int i = 0; i < class106_sub1s_4_.length; i++) {
	    Class106_Sub1 class106_sub1 = class106_sub1s_4_[i];
	    hashmap.put(class106_sub1.aClass453_8986, class106_sub1);
	}
	return hashmap;
    }
    
    public static Map method14519(Class106_Sub1[] class106_sub1s) {
	if (class106_sub1s == null || 0 == class106_sub1s.length)
	    return null;
	HashMap hashmap = new HashMap();
	Class106_Sub1[] class106_sub1s_5_ = class106_sub1s;
	for (int i = 0; i < class106_sub1s_5_.length; i++) {
	    Class106_Sub1 class106_sub1 = class106_sub1s_5_[i];
	    hashmap.put(class106_sub1.aClass453_8986, class106_sub1);
	}
	return hashmap;
    }
    
    public int method14520(Class447 class447) {
	int i = 2;
	if (class447.anObject4899 instanceof Integer)
	    i += 4;
	else if (class447.anObject4899 instanceof Long)
	    i += 8;
	else if (class447.anObject4899 instanceof String)
	    i += Class538.method8886((String) class447.anObject4899,
				     1470515156);
	else if (class447.anObject4899 instanceof Interface9)
	    i += ((Interface9) class447.anObject4899).method49(-444653495);
	else
	    throw new IllegalStateException();
	return i;
    }
    
    public static Map method14521(Class106_Sub1[] class106_sub1s) {
	if (class106_sub1s == null || 0 == class106_sub1s.length)
	    return null;
	HashMap hashmap = new HashMap();
	Class106_Sub1[] class106_sub1s_6_ = class106_sub1s;
	for (int i = 0; i < class106_sub1s_6_.length; i++) {
	    Class106_Sub1 class106_sub1 = class106_sub1s_6_[i];
	    hashmap.put(class106_sub1.aClass453_8986, class106_sub1);
	}
	return hashmap;
    }
    
    public Class447 method14522(RSBuffer class525_sub38,
								Class480 class480, int i) {
	int i_7_ = class525_sub38.readUnsignedShort((byte) 106);
	Class447 class447 = new Class447(i_7_);
	Class var_class = class480.aClass5217;
	if (var_class == java.lang.Integer.class)
	    class447.anObject4899
		= Integer.valueOf(class525_sub38.readInt(1813172782));
	else if (var_class == java.lang.Long.class)
	    class447.anObject4899
		= Long.valueOf(class525_sub38.method16603(82108082));
	else if (java.lang.String.class == var_class)
	    class447.anObject4899 = class525_sub38.method16637(-932238929);
	else if (com.jagex.Interface9.class.isAssignableFrom(var_class)) {
	    try {
		Interface9 interface9 = (Interface9) var_class.newInstance();
		interface9.method61(class525_sub38, -1243816377);
		class447.anObject4899 = interface9;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	Class163 class163 = (Class163) method76(i_7_, 1885649547);
	if (!class163.method2648((short) -1821)
	    || class163.aClass495_1765.method8131(849301080) != class480)
	    return null;
	return class447;
    }
    
    public Object method354(int i) {
	Class163 class163 = (Class163) method76(i, 1287229503);
	if (null == class163 || !class163.method2648((short) -27634))
	    return null;
	return class163.method2646(208441824);
    }
    
    public int method14523(Class447 class447) {
	int i = 2;
	if (class447.anObject4899 instanceof Integer)
	    i += 4;
	else if (class447.anObject4899 instanceof Long)
	    i += 8;
	else if (class447.anObject4899 instanceof String)
	    i += Class538.method8886((String) class447.anObject4899,
				     1470515156);
	else if (class447.anObject4899 instanceof Interface9)
	    i += ((Interface9) class447.anObject4899).method49(-444653495);
	else
	    throw new IllegalStateException();
	return i;
    }
    
    public Class447 method14524(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedShort((byte) 46);
	Class163 class163 = (Class163) method76(i, -677083176);
	if (!class163.method2648((short) -1524))
	    throw new IllegalStateException("");
	Class447 class447 = new Class447(i);
	Class var_class
	    = class163.aClass495_1765.method8131(1362300058).aClass5217;
	if (java.lang.Integer.class == var_class)
	    class447.anObject4899
		= Integer.valueOf(class525_sub38.readInt(1815328024));
	else if (java.lang.Long.class == var_class)
	    class447.anObject4899
		= Long.valueOf(class525_sub38.method16603(-1589034377));
	else if (var_class == java.lang.String.class)
	    class447.anObject4899 = class525_sub38.method16637(-691202991);
	else if (com.jagex.Interface9.class.isAssignableFrom(var_class)) {
	    try {
		Interface9 interface9 = (Interface9) var_class.newInstance();
		interface9.method61(class525_sub38, -1243816377);
		class447.anObject4899 = interface9;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	return class447;
    }
    
    public Class447 method14525(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedShort((byte) 70);
	Class163 class163 = (Class163) method76(i, 408693822);
	if (!class163.method2648((short) -16647))
	    throw new IllegalStateException("");
	Class447 class447 = new Class447(i);
	Class var_class
	    = class163.aClass495_1765.method8131(-346863933).aClass5217;
	if (java.lang.Integer.class == var_class)
	    class447.anObject4899
		= Integer.valueOf(class525_sub38.readInt(1602385469));
	else if (java.lang.Long.class == var_class)
	    class447.anObject4899
		= Long.valueOf(class525_sub38.method16603(-1481765173));
	else if (var_class == java.lang.String.class)
	    class447.anObject4899 = class525_sub38.method16637(2013419887);
	else if (com.jagex.Interface9.class.isAssignableFrom(var_class)) {
	    try {
		Interface9 interface9 = (Interface9) var_class.newInstance();
		interface9.method61(class525_sub38, -1243816377);
		class447.anObject4899 = interface9;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	return class447;
    }
    
    public Class447 method14526(RSBuffer class525_sub38,
								Class480 class480) {
	int i = class525_sub38.readUnsignedShort((byte) 108);
	Class447 class447 = new Class447(i);
	Class var_class = class480.aClass5217;
	if (var_class == java.lang.Integer.class)
	    class447.anObject4899
		= Integer.valueOf(class525_sub38.readInt(1780167419));
	else if (var_class == java.lang.Long.class)
	    class447.anObject4899
		= Long.valueOf(class525_sub38.method16603(-1471393191));
	else if (java.lang.String.class == var_class)
	    class447.anObject4899 = class525_sub38.method16637(-1265828130);
	else if (com.jagex.Interface9.class.isAssignableFrom(var_class)) {
	    try {
		Interface9 interface9 = (Interface9) var_class.newInstance();
		interface9.method61(class525_sub38, -1243816377);
		class447.anObject4899 = interface9;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	Class163 class163 = (Class163) method76(i, -1016849643);
	if (!class163.method2648((short) -25626)
	    || class163.aClass495_1765.method8131(-861109253) != class480)
	    return null;
	return class447;
    }
    
    public int method77() {
	return anInt1293 * -2037061385;
    }
    
    public Class447 method14527(RSBuffer class525_sub38,
								Class480 class480) {
	int i = class525_sub38.readUnsignedShort((byte) 20);
	Class447 class447 = new Class447(i);
	Class var_class = class480.aClass5217;
	if (var_class == java.lang.Integer.class)
	    class447.anObject4899
		= Integer.valueOf(class525_sub38.readInt(1121996314));
	else if (var_class == java.lang.Long.class)
	    class447.anObject4899
		= Long.valueOf(class525_sub38.method16603(-975308618));
	else if (java.lang.String.class == var_class)
	    class447.anObject4899 = class525_sub38.method16637(-1129521137);
	else if (com.jagex.Interface9.class.isAssignableFrom(var_class)) {
	    try {
		Interface9 interface9 = (Interface9) var_class.newInstance();
		interface9.method61(class525_sub38, -1243816377);
		class447.anObject4899 = interface9;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	Class163 class163 = (Class163) method76(i, 1963168912);
	if (!class163.method2648((short) -7975)
	    || class163.aClass495_1765.method8131(1329572878) != class480)
	    return null;
	return class447;
    }
    
    public static void method14528(Iterable iterable,
								   RSBuffer class525_sub38, int i) {
	int i_8_ = Class598.method9853(iterable, 1539699031);
	class525_sub38.method16829(i_8_, 2127446378);
	if (i_8_ != 0) {
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
		class525_sub38.buffer
		    [class525_sub38.index * -1133521593 + i_9_]
		    = (byte) 0;
	    Iterator iterator = iterable.iterator();
	    while (iterator.hasNext()) {
		Interface76 interface76 = (Interface76) iterator.next();
		int i_10_ = interface76.method80();
		int i_11_ = i_10_ / 8;
		class525_sub38.buffer
		    [-1133521593 * class525_sub38.index + i_11_]
		    |= 1 << (i_10_ & 0x7);
	    }
	    class525_sub38.index += i_8_ * 339428471;
	}
    }
}
