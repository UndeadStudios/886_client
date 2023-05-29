/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WorldTile implements Interface12, Interface7
{
    Map aMap697;
    public Class495 aClass495_698;
    public Class495 aClass495_699;
    HashMap aHashMap700;
    int anInt701;
    Object[] anObjectArray702;
    String aString703 = "null";
    int anInt704 = 0;
    public static JS5 idx_7;
    
    void method1407() {
	HashMap hashmap = new HashMap();
	if (null != anObjectArray702) {
	    for (int i = 0; i < anObjectArray702.length; i++) {
		if (null != anObjectArray702[i]) {
		    Object object = anObjectArray702[i];
		    List list = (List) hashmap.get(object);
		    if (null == list) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i));
		}
	    }
	} else if (aMap697 != null) {
	    Iterator iterator = aMap697.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (list == null) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	aHashMap700 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i = 0;
	    Iterator iterator_0_ = list.iterator();
	    while (iterator_0_.hasNext()) {
		Integer integer = (Integer) iterator_0_.next();
		is[i++] = integer.intValue();
	    }
	    if (anObjectArray702 == null)
		Arrays.sort(is);
	    aHashMap700.put(entry.getKey(), is);
	}
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_1_ = class525_sub38.readUnsignedByte(1312932602);
	    if (i_1_ == 0)
		break;
	    method1408(class525_sub38, i_1_, 1289949674);
	}
    }
    
    void method1408(RSBuffer class525_sub38, int i, int i_2_) {
	if (1 == i) {
	    char c = (Class656_Sub1_Sub1_Sub1.method18717
		      (class525_sub38.readByte(-1150098071), 749222495));
	    aClass495_699 = Class495.method8132(c, 1584266080);
	} else if (i == 2) {
	    char c = (Class656_Sub1_Sub1_Sub1.method18717
		      (class525_sub38.readByte(-1150098071), -41036686));
	    aClass495_698 = Class495.method8132(c, 2006556398);
	} else if (i == 3)
	    aString703 = class525_sub38.readString((byte) 8);
	else if (i == 4)
	    anInt701 = class525_sub38.readInt(1958106214) * -145717655;
	else if (i == 5 || i == 6) {
	    anInt704 = class525_sub38.readUnsignedShort((byte) 74) * -1198381875;
	    aMap697 = new HashMap(1861904389 * anInt704);
	    for (int i_3_ = 0; i_3_ < 1861904389 * anInt704; i_3_++) {
		int i_4_ = class525_sub38.readInt(1756395288);
		java.io.Serializable serializable;
		if (i == 5)
		    serializable = class525_sub38.readString((byte) 5);
		else
		    serializable
			= new Integer(class525_sub38.readInt(1971007741));
		aMap697.put(new Integer(i_4_), serializable);
	    }
	} else if (7 == i || 8 == i) {
	    int i_5_ = class525_sub38.readUnsignedShort((byte) 57);
	    anInt704 = class525_sub38.readUnsignedShort((byte) 68) * -1198381875;
	    anObjectArray702 = new Object[i_5_];
	    for (int i_6_ = 0; i_6_ < 1861904389 * anInt704; i_6_++) {
		int i_7_ = class525_sub38.readUnsignedShort((byte) 9);
		if (7 == i)
		    anObjectArray702[i_7_]
			= class525_sub38.readString((byte) -6);
		else
		    anObjectArray702[i_7_]
			= new Integer(class525_sub38.readInt(1343395008));
	    }
	} else if (i == 101)
	    aClass495_699
		= ((Class495)
		   Class539.method8888(Class495.method8143((byte) 1),
				       class525_sub38.readUnsignedSmart((byte) -124),
				       -1443907881));
	else if (i == 102)
	    aClass495_698
		= ((Class495)
		   Class539.method8888(Class495.method8143((byte) 1),
				       class525_sub38.readUnsignedSmart((byte) -56),
				       -248620161));
    }
    
    Object method1409(int i) {
	if (null != anObjectArray702) {
	    if (i < 0 || i >= anObjectArray702.length)
		return null;
	    return anObjectArray702[i];
	}
	if (null != aMap697)
	    return aMap697.get(new Integer(i));
	return null;
    }
    
    public String method1410(int i, int i_8_) {
	Object object = method1411(i, (byte) -18);
	if (object == null)
	    return aString703;
	return (String) object;
    }
    
    Object method1411(int i, byte i_9_) {
	if (null != anObjectArray702) {
	    if (i < 0 || i >= anObjectArray702.length)
		return null;
	    return anObjectArray702[i];
	}
	if (null != aMap697)
	    return aMap697.get(new Integer(i));
	return null;
    }
    
    public boolean method1412(Object object, int i) {
	if (1861904389 * anInt704 == 0)
	    return false;
	if (aHashMap700 == null)
	    method1414(-195590439);
	return aHashMap700.containsKey(object);
    }
    
    public int[] method1413(Object object, int i) {
	if (anInt704 * 1861904389 == 0)
	    return null;
	if (null == aHashMap700)
	    method1414(296250724);
	return (int[]) aHashMap700.get(object);
    }
    
    public void method53(int i) {
	/* empty */
    }
    
    void method1414(int i) {
	HashMap hashmap = new HashMap();
	if (null != anObjectArray702) {
	    for (int i_10_ = 0; i_10_ < anObjectArray702.length; i_10_++) {
		if (null != anObjectArray702[i_10_]) {
		    Object object = anObjectArray702[i_10_];
		    List list = (List) hashmap.get(object);
		    if (null == list) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i_10_));
		}
	    }
	} else if (aMap697 != null) {
	    Iterator iterator = aMap697.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (list == null) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	aHashMap700 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i_11_ = 0;
	    Iterator iterator_12_ = list.iterator();
	    while (iterator_12_.hasNext()) {
		Integer integer = (Integer) iterator_12_.next();
		is[i_11_++] = integer.intValue();
	    }
	    if (anObjectArray702 == null)
		Arrays.sort(is);
	    aHashMap700.put(entry.getKey(), is);
	}
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    Object method1415(int i) {
	if (null != anObjectArray702) {
	    if (i < 0 || i >= anObjectArray702.length)
		return null;
	    return anObjectArray702[i];
	}
	if (null != aMap697)
	    return aMap697.get(new Integer(i));
	return null;
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1576510710);
	    if (i == 0)
		break;
	    method1408(class525_sub38, i, 1289949674);
	}
    }
    
    public int method1416(int i) {
	return 1861904389 * anInt704;
    }
    
    public void method70() {
	/* empty */
    }
    
    void method1417() {
	HashMap hashmap = new HashMap();
	if (null != anObjectArray702) {
	    for (int i = 0; i < anObjectArray702.length; i++) {
		if (null != anObjectArray702[i]) {
		    Object object = anObjectArray702[i];
		    List list = (List) hashmap.get(object);
		    if (null == list) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i));
		}
	    }
	} else if (aMap697 != null) {
	    Iterator iterator = aMap697.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (list == null) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	aHashMap700 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i = 0;
	    Iterator iterator_13_ = list.iterator();
	    while (iterator_13_.hasNext()) {
		Integer integer = (Integer) iterator_13_.next();
		is[i++] = integer.intValue();
	    }
	    if (anObjectArray702 == null)
		Arrays.sort(is);
	    aHashMap700.put(entry.getKey(), is);
	}
    }
    
    public int method1418(int i) {
	Object object = method1411(i, (byte) 6);
	if (null == object)
	    return -149591591 * anInt701;
	return ((Integer) object).intValue();
    }
    
    public int method1419(int i) {
	Object object = method1411(i, (byte) -32);
	if (null == object)
	    return -149591591 * anInt701;
	return ((Integer) object).intValue();
    }
    
    public String method1420(int i) {
	Object object = method1411(i, (byte) -71);
	if (object == null)
	    return aString703;
	return (String) object;
    }
    
    public void method54(int i, byte i_14_) {
	/* empty */
    }
    
    public boolean method1421(Object object) {
	if (1861904389 * anInt704 == 0)
	    return false;
	if (aHashMap700 == null)
	    method1414(809935019);
	return aHashMap700.containsKey(object);
    }
    
    Object method1422(int i) {
	if (null != anObjectArray702) {
	    if (i < 0 || i >= anObjectArray702.length)
		return null;
	    return anObjectArray702[i];
	}
	if (null != aMap697)
	    return aMap697.get(new Integer(i));
	return null;
    }
    
    Object method1423(int i) {
	if (null != anObjectArray702) {
	    if (i < 0 || i >= anObjectArray702.length)
		return null;
	    return anObjectArray702[i];
	}
	if (null != aMap697)
	    return aMap697.get(new Integer(i));
	return null;
    }
    
    public String method1424(int i) {
	Object object = method1411(i, (byte) -105);
	if (object == null)
	    return aString703;
	return (String) object;
    }
    
    WorldTile() {
	/* empty */
    }
    
    public boolean method1425(Object object) {
	if (1861904389 * anInt704 == 0)
	    return false;
	if (aHashMap700 == null)
	    method1414(493726692);
	return aHashMap700.containsKey(object);
    }
    
    public void method69() {
	/* empty */
    }
    
    public int[] method1426(Object object) {
	if (anInt704 * 1861904389 == 0)
	    return null;
	if (null == aHashMap700)
	    method1414(2080057041);
	return (int[]) aHashMap700.get(object);
    }
    
    public int method1427(int i, int i_15_) {
	Object object = method1411(i, (byte) -78);
	if (null == object)
	    return -149591591 * anInt701;
	return ((Integer) object).intValue();
    }
    
    public int method1428() {
	return 1861904389 * anInt704;
    }
    
    void method1429() {
	HashMap hashmap = new HashMap();
	if (null != anObjectArray702) {
	    for (int i = 0; i < anObjectArray702.length; i++) {
		if (null != anObjectArray702[i]) {
		    Object object = anObjectArray702[i];
		    List list = (List) hashmap.get(object);
		    if (null == list) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i));
		}
	    }
	} else if (aMap697 != null) {
	    Iterator iterator = aMap697.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (list == null) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	aHashMap700 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i = 0;
	    Iterator iterator_16_ = list.iterator();
	    while (iterator_16_.hasNext()) {
		Integer integer = (Integer) iterator_16_.next();
		is[i++] = integer.intValue();
	    }
	    if (anObjectArray702 == null)
		Arrays.sort(is);
	    aHashMap700.put(entry.getKey(), is);
	}
    }
    
    public int[] method1430(Object object) {
	if (anInt704 * 1861904389 == 0)
	    return null;
	if (null == aHashMap700)
	    method1414(-102900446);
	return (int[]) aHashMap700.get(object);
    }
    
    public static void method1431(int i) {
	if (!Class105.aBool1292) {
	    Class11.method717((client.aClass507_11137.method8358((byte) 48)
			       .aClass547ArrayArrayArray7220),
			      (short) 23228);
	    if ((client.aClass507_11137.method8358((byte) 103)
		 .aClass547ArrayArrayArray7216)
		!= null)
		Class11.method717((client.aClass507_11137.method8358((byte) 15)
				   .aClass547ArrayArrayArray7216),
				  (short) 5350);
	    Class105.aBool1292 = true;
	}
    }
    
    public static final Class259 method1432(Class245 class245,
					    Class259 class259, int i) {
	if (-1 != class259.anInt2606 * -1549235523)
	    return class245.method4473(-1549235523 * class259.anInt2606,
				       -2092482336);
	if (!class245.aBool2428) {
	    int i_17_ = 1984678839 * class259.anInt2588 >>> 16;
	    Class21 class21 = new Class21(client.aClass10_11261);
	    for (Class525_Sub33 class525_sub33
		     = (Class525_Sub33) class21.method812(-1277308907);
		 class525_sub33 != null;
		 class525_sub33 = (Class525_Sub33) class21.next()) {
		if (i_17_ == class525_sub33.anInt10745 * 922288809)
		    return Class43.method1069((int) (-5126207504388691097L
						     * (class525_sub33
							.aLong7113)),
					      -695254952);
	    }
	}
	return null;
    }
    
    static Class525_Sub16_Sub6 method1433(RSBuffer class525_sub38, int i,
                                          int i_18_) {
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = new Class525_Sub16_Sub6(i, class525_sub38.readString((byte) 7),
				      class525_sub38.readString((byte) 13),
				      class525_sub38.readInt(1030142483),
				      class525_sub38.readInt(1456886299),
				      (class525_sub38.readUnsignedByte(693086544)
				       == 1),
				      class525_sub38.readUnsignedByte(1982086670),
				      class525_sub38.readUnsignedByte(207965151));
	int i_19_ = class525_sub38.readUnsignedByte(1832401639);
	for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
	    class525_sub16_sub6.aClass709_11769.method14345
		(new Class525_Sub34(class525_sub38.readUnsignedByte(2106546043),
				    class525_sub38.readUnsignedShort((byte) 67),
				    class525_sub38.readUnsignedShort((byte) 97),
				    class525_sub38.readUnsignedShort((byte) 1),
				    class525_sub38.readUnsignedShort((byte) 108),
				    class525_sub38.readUnsignedShort((byte) 104),
				    class525_sub38.readUnsignedShort((byte) 6),
				    class525_sub38.readUnsignedShort((byte) 37),
				    class525_sub38.readUnsignedShort((byte) 29)),
		 (byte) 0);
	class525_sub16_sub6.method18276((byte) -121);
	return class525_sub16_sub6;
    }
    
    static final void method1434(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class626.method10260(class259, class245, class683, (byte) -109);
    }
}
