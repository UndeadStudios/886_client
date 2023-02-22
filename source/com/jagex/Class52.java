/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class52
{
    LinkedHashMap aLinkedHashMap377 = new LinkedHashMap();
    static final int anInt378 = 10;
    static final int anInt379 = 1;
    
    public static Class52 method1141() {
	Class42 class42 = null;
	try {
	    Class52 class52;
	    try {
		class42
		    = Class182.method3594("3",
					  client.aClass668_11090.aString8579,
					  false, 1844723338);
		byte[] is = new byte[(int) class42.method1048(-1879179962)];
		int i;
		for (int i_0_ = 0; i_0_ < is.length; i_0_ += i) {
		    i = class42.method1049(is, i_0_, is.length - i_0_,
					   (byte) 109);
		    if (-1 == i)
			throw new EOFException();
		}
		class52 = new Class52(new RSBuffer(is));
	    } catch (Exception exception) {
		Class52 class52_1_ = new Class52();
		try {
		    if (class42 != null)
			class42.method1047(-1247547837);
		} catch (Exception exception_2_) {
		    /* empty */
		}
		return class52_1_;
	    }
	    try {
		if (class42 != null)
		    class42.method1047(-947274026);
	    } catch (Exception exception) {
		/* empty */
	    }
	    return class52;
	} catch (Exception object) {
	    try {
		if (class42 != null)
		    class42.method1047(1382964615);
	    } catch (Exception exception) {
		/* empty */
	    }
	    throw object;
	}
    }
    
    Class52(RSBuffer class525_sub38) {
	if (null != class525_sub38 && null != class525_sub38.buffer) {
	    int i = class525_sub38.readUnsignedByte(334374602);
	    if (i > 0 && i <= 1) {
		int i_3_ = class525_sub38.readUnsignedByte(425427579);
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
		    long l = class525_sub38.method16603(-294543057);
		    int i_5_ = class525_sub38.readInt(1125162058);
		    aLinkedHashMap377.put(Long.valueOf(l),
					  Integer.valueOf(i_5_));
		}
	    }
	}
    }
    
    void method1142(RSBuffer class525_sub38, int i) {
	class525_sub38.method16735(1, -1181963760);
	class525_sub38.method16735(aLinkedHashMap377.size(), -1353129284);
	Iterator iterator = aLinkedHashMap377.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    class525_sub38.method16609(((Long) entry.getKey()).longValue());
	    class525_sub38.method16605(((Integer) entry.getValue()).intValue(),
				       -243814304);
	}
    }
    
    void method1143(long l, int i, byte i_6_) {
	if (aLinkedHashMap377.size() >= 10
	    && !aLinkedHashMap377.containsKey(Long.valueOf(l))) {
	    Iterator iterator = aLinkedHashMap377.entrySet().iterator();
	    iterator.next();
	    iterator.remove();
	}
	aLinkedHashMap377.put(Long.valueOf(l), Integer.valueOf(i));
	method1147(1994587934);
    }
    
    boolean method1144(long l) {
	return aLinkedHashMap377.containsKey(Long.valueOf(l));
    }
    
    int method1145(long l) {
	return ((Integer) aLinkedHashMap377.get(Long.valueOf(l))).intValue();
    }
    
    void method1146(long l, int i) {
	if (aLinkedHashMap377.size() >= 10
	    && !aLinkedHashMap377.containsKey(Long.valueOf(l))) {
	    Iterator iterator = aLinkedHashMap377.entrySet().iterator();
	    iterator.next();
	    iterator.remove();
	}
	aLinkedHashMap377.put(Long.valueOf(l), Integer.valueOf(i));
	method1147(1528159162);
    }
    
    void method1147(int i) {
	Class42 class42 = null;
	do {
	    try {
		try {
		    class42 = Class182.method3594("3",
						  (client.aClass668_11090
						   .aString8579),
						  true, -2010286716);
		    RSBuffer class525_sub38 = new RSBuffer(5000);
		    method1142(class525_sub38, -581006069);
		    class42.method1051(class525_sub38.buffer, 0,
				       class525_sub38.index * -1133521593,
				       161983396);
		} catch (Exception exception) {
		    try {
			if (null != class42)
			    class42.method1047(-937104265);
		    } catch (Exception exception_7_) {
			exception = exception_7_;
		    }
		    break;
		}
		try {
		    if (null != class42)
			class42.method1047(-801720203);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Exception object) {
		try {
		    if (null != class42)
			class42.method1047(-1591963980);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    void method1148(RSBuffer class525_sub38) {
	class525_sub38.method16735(1, -1328392458);
	class525_sub38.method16735(aLinkedHashMap377.size(), -221232549);
	Iterator iterator = aLinkedHashMap377.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    class525_sub38.method16609(((Long) entry.getKey()).longValue());
	    class525_sub38.method16605(((Integer) entry.getValue()).intValue(),
				       -1570993579);
	}
    }
    
    void method1149(long l, int i) {
	if (aLinkedHashMap377.size() >= 10
	    && !aLinkedHashMap377.containsKey(Long.valueOf(l))) {
	    Iterator iterator = aLinkedHashMap377.entrySet().iterator();
	    iterator.next();
	    iterator.remove();
	}
	aLinkedHashMap377.put(Long.valueOf(l), Integer.valueOf(i));
	method1147(1945684741);
    }
    
    void method1150(long l, int i) {
	if (aLinkedHashMap377.size() >= 10
	    && !aLinkedHashMap377.containsKey(Long.valueOf(l))) {
	    Iterator iterator = aLinkedHashMap377.entrySet().iterator();
	    iterator.next();
	    iterator.remove();
	}
	aLinkedHashMap377.put(Long.valueOf(l), Integer.valueOf(i));
	method1147(1873751697);
    }
    
    public static Class52 method1151() {
	Class42 class42 = null;
	try {
	    Class52 class52;
	    try {
		class42
		    = Class182.method3594("3",
					  client.aClass668_11090.aString8579,
					  false, -1919299554);
		byte[] is = new byte[(int) class42.method1048(-2062110314)];
		int i;
		for (int i_8_ = 0; i_8_ < is.length; i_8_ += i) {
		    i = class42.method1049(is, i_8_, is.length - i_8_,
					   (byte) 5);
		    if (-1 == i)
			throw new EOFException();
		}
		class52 = new Class52(new RSBuffer(is));
	    } catch (Exception exception) {
		Class52 class52_9_ = new Class52();
		try {
		    if (class42 != null)
			class42.method1047(-542317708);
		} catch (Exception exception_10_) {
		    /* empty */
		}
		return class52_9_;
	    }
	    try {
		if (class42 != null)
		    class42.method1047(-675170816);
	    } catch (Exception exception) {
		/* empty */
	    }
	    return class52;
	} catch (Exception object) {
	    try {
		if (class42 != null)
		    class42.method1047(1117653539);
	    } catch (Exception exception) {
		/* empty */
	    }
	    throw object;
	}
    }
    
    boolean method1152(long l) {
	return aLinkedHashMap377.containsKey(Long.valueOf(l));
    }
    
    boolean method1153(long l) {
	return aLinkedHashMap377.containsKey(Long.valueOf(l));
    }
    
    boolean method1154(long l) {
	return aLinkedHashMap377.containsKey(Long.valueOf(l));
    }
    
    int method1155(long l) {
	return ((Integer) aLinkedHashMap377.get(Long.valueOf(l))).intValue();
    }
    
    int method1156(long l) {
	return ((Integer) aLinkedHashMap377.get(Long.valueOf(l))).intValue();
    }
    
    Class52() {
	this(null);
    }
    
    int method1157(long l) {
	return ((Integer) aLinkedHashMap377.get(Long.valueOf(l))).intValue();
    }
    
    void method1158(RSBuffer class525_sub38) {
	class525_sub38.method16735(1, -761428279);
	class525_sub38.method16735(aLinkedHashMap377.size(), -1933113671);
	Iterator iterator = aLinkedHashMap377.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    class525_sub38.method16609(((Long) entry.getKey()).longValue());
	    class525_sub38.method16605(((Integer) entry.getValue()).intValue(),
				       -1681375033);
	}
    }
    
    boolean method1159(long l) {
	return aLinkedHashMap377.containsKey(Long.valueOf(l));
    }
    
    int method1160(long l) {
	return ((Integer) aLinkedHashMap377.get(Long.valueOf(l))).intValue();
    }
    
    public static Class52 method1161() {
	Class42 class42 = null;
	try {
	    Class52 class52;
	    try {
		class42
		    = Class182.method3594("3",
					  client.aClass668_11090.aString8579,
					  false, 1029031131);
		byte[] is = new byte[(int) class42.method1048(-2065486659)];
		int i;
		for (int i_11_ = 0; i_11_ < is.length; i_11_ += i) {
		    i = class42.method1049(is, i_11_, is.length - i_11_,
					   (byte) 22);
		    if (-1 == i)
			throw new EOFException();
		}
		class52 = new Class52(new RSBuffer(is));
	    } catch (Exception exception) {
		Class52 class52_12_ = new Class52();
		try {
		    if (class42 != null)
			class42.method1047(114340044);
		} catch (Exception exception_13_) {
		    /* empty */
		}
		return class52_12_;
	    }
	    try {
		if (class42 != null)
		    class42.method1047(-365144313);
	    } catch (Exception exception) {
		/* empty */
	    }
	    return class52;
	} catch (Exception object) {
	    try {
		if (class42 != null)
		    class42.method1047(1603289402);
	    } catch (Exception exception) {
		/* empty */
	    }
	    throw object;
	}
    }
    
    void method1162() {
	Class42 class42 = null;
	do {
	    try {
		try {
		    class42 = Class182.method3594("3",
						  (client.aClass668_11090
						   .aString8579),
						  true, -1087480858);
		    RSBuffer class525_sub38 = new RSBuffer(5000);
		    method1142(class525_sub38, -581006069);
		    class42.method1051(class525_sub38.buffer, 0,
				       class525_sub38.index * -1133521593,
				       1731488553);
		} catch (Exception exception) {
		    try {
			if (null != class42)
			    class42.method1047(-742349398);
		    } catch (Exception exception_14_) {
			exception = exception_14_;
		    }
		    break;
		}
		try {
		    if (null != class42)
			class42.method1047(-243488876);
		} catch (Exception exception) {
		    /* empty */
		}
	  } catch (Exception object) {
		try {
		    if (null != class42)
			class42.method1047(-966426081);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    void method1163() {
	Class42 class42 = null;
	do {
	    try {
		try {
		    class42 = Class182.method3594("3",
						  (client.aClass668_11090
						   .aString8579),
						  true, 594451354);
		    RSBuffer class525_sub38 = new RSBuffer(5000);
		    method1142(class525_sub38, -581006069);
		    class42.method1051(class525_sub38.buffer, 0,
				       class525_sub38.index * -1133521593,
				       2134264036);
		} catch (Exception exception) {
		    try {
			if (null != class42)
			    class42.method1047(976363944);
		    } catch (Exception exception_15_) {
			exception = exception_15_;
		    }
		    break;
		}
		try {
		    if (null != class42)
			class42.method1047(-536908892);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Exception object) {
		try {
		    if (null != class42)
			class42.method1047(2032224310);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    void method1164() {
	Class42 class42 = null;
	do {
	    try {
		try {
		    class42 = Class182.method3594("3",
						  (client.aClass668_11090
						   .aString8579),
						  true, 1298499014);
		    RSBuffer class525_sub38 = new RSBuffer(5000);
		    method1142(class525_sub38, -581006069);
		    class42.method1051(class525_sub38.buffer, 0,
				       class525_sub38.index * -1133521593,
				       -1209294549);
		} catch (Exception exception) {
		    try {
			if (null != class42)
			    class42.method1047(676411712);
		    } catch (Exception exception_16_) {
			exception = exception_16_;
		    }
		    break;
		}
		try {
		    if (null != class42)
			class42.method1047(-809937516);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Exception object) {
		try {
		    if (null != class42)
			class42.method1047(-2106723073);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    static final void method1165(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class537.method8879(class259, class245, class683, -1632207889);
    }
    
    static final void method1166(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1745938009 * class683.aClass525_Sub25_8653.anInt10600;
    }
    
    static final void method1167(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static long method1168(byte i) {
	return Class19.aClass511_206.method8512((byte) 4);
    }
}
