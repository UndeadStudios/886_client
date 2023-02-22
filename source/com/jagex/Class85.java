/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class85
{
    Class480 aClass480_886;
    Map aMap887;
    
    public List method1616(Object object) {
	return (List) aMap887.get(object);
    }
    
    void method1617(RSBuffer class525_sub38, short i) {
	aClass480_886
	    = ((Class480)
	       Class539.method8888(Class480.method7811(-212322209),
				   class525_sub38.readUnsignedByte(62643302),
				   548769848));
	int i_0_ = class525_sub38.method16647((short) -26240);
	aMap887 = new HashMap(i_0_);
	while (i_0_-- > 0) {
	    Object object
		= aClass480_886.method7813(class525_sub38, 1552651121);
	    int i_1_ = class525_sub38.method16647((short) -15894);
	    LinkedList linkedlist = new LinkedList();
	    while (i_1_-- > 0) {
		int i_2_ = class525_sub38.method16647((short) -12256);
		linkedlist.add(Integer.valueOf(i_2_));
	    }
	    aMap887.put(object, linkedlist);
	}
    }
    
    public Class85(JS5 class458, int i, int i_3_) {
	byte[] is = class458.getFile(i, i_3_, 1825907787);
	method1617(new RSBuffer(is), (short) 15510);
    }
    
    public List method1618(Object object, int i) {
	return (List) aMap887.get(object);
    }
    
    void method1619(RSBuffer class525_sub38) {
	aClass480_886
	    = ((Class480)
	       Class539.method8888(Class480.method7811(2141749800),
				   class525_sub38.readUnsignedByte(929290271),
				   312620732));
	int i = class525_sub38.method16647((short) -27014);
	aMap887 = new HashMap(i);
	while (i-- > 0) {
	    Object object
		= aClass480_886.method7813(class525_sub38, 1552651121);
	    int i_4_ = class525_sub38.method16647((short) -28588);
	    LinkedList linkedlist = new LinkedList();
	    while (i_4_-- > 0) {
		int i_5_ = class525_sub38.method16647((short) -15344);
		linkedlist.add(Integer.valueOf(i_5_));
	    }
	    aMap887.put(object, linkedlist);
	}
    }
    
    public List method1620(Object object) {
	return (List) aMap887.get(object);
    }
    
    public static final int method1621(String string, byte i) {
	if (null == string || string.length() == 0)
	    return -1;
	for (int i_6_ = 0; i_6_ < client.anInt11366 * -651611127; i_6_++) {
	    if (string.equalsIgnoreCase(client.aClass31Array11368[i_6_]
					.aString300))
		return i_6_;
	}
	return -1;
    }
    
    static String method1622(long l, int i, boolean bool, byte i_7_) {
	Calendar calendar;
	if (bool) {
	    Class61.method1371(l);
	    calendar = Class86.aCalendar888;
	} else {
	    Class677.method11134(l);
	    calendar = Class86.aCalendar890;
	}
	int i_8_ = calendar.get(5);
	int i_9_ = calendar.get(2) + 1;
	int i_10_ = calendar.get(1);
	int i_11_ = calendar.get(11);
	int i_12_ = calendar.get(12);
	return new StringBuilder().append(Integer.toString(i_8_ / 10)).append
		   (i_8_ % 10).append
		   ("/").append
		   (i_9_ / 10).append
		   (i_9_ % 10).append
		   ("/").append
		   (i_10_ % 100 / 10).append
		   (i_10_ % 10).append
		   (" ").append
		   (i_11_ / 10).append
		   (i_11_ % 10).append
		   (":").append
		   (i_12_ / 10).append
		   (i_12_ % 10).toString();
    }
}
