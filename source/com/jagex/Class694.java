/* Class694 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class Class694
{
    public static Object method14147(byte[] is, boolean bool) {
	if (is == null)
	    return null;
	if (is.length > 136) {
	    ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
	    bytebuffer.position(0);
	    bytebuffer.put(is);
	    return bytebuffer;
	}
	if (bool)
	    return Arrays.copyOf(is, is.length);
	return is;
    }
    
    public static Object method14148(byte[] is, boolean bool) {
	if (is == null)
	    return null;
	if (is.length > 136) {
	    ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
	    bytebuffer.position(0);
	    bytebuffer.put(is);
	    return bytebuffer;
	}
	if (bool)
	    return Arrays.copyOf(is, is.length);
	return is;
    }
    
    public static byte[] method14149(Object object, boolean bool) {
	if (object == null)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    if (bool)
		return Arrays.copyOf(is, is.length);
	    return is;
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[bytebuffer.capacity()];
	    bytebuffer.position(0);
	    bytebuffer.get(is);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    public static Object method14150(byte[] is, boolean bool) {
	if (is == null)
	    return null;
	if (is.length > 136) {
	    ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
	    bytebuffer.position(0);
	    bytebuffer.put(is);
	    return bytebuffer;
	}
	if (bool)
	    return Arrays.copyOf(is, is.length);
	return is;
    }
    
    public static Object method14151(byte[] is, boolean bool) {
	if (is == null)
	    return null;
	if (is.length > 136) {
	    ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
	    bytebuffer.position(0);
	    bytebuffer.put(is);
	    return bytebuffer;
	}
	if (bool)
	    return Arrays.copyOf(is, is.length);
	return is;
    }
    
    public static byte[] method14152(Object object, boolean bool) {
	if (object == null)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    if (bool)
		return Arrays.copyOf(is, is.length);
	    return is;
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[bytebuffer.capacity()];
	    bytebuffer.position(0);
	    bytebuffer.get(is);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    Class694() throws Throwable {
	throw new Error();
    }
    
    public static byte[] method14153(Object object, boolean bool) {
	if (object == null)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    if (bool)
		return Arrays.copyOf(is, is.length);
	    return is;
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[bytebuffer.capacity()];
	    bytebuffer.position(0);
	    bytebuffer.get(is);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    public static byte[] method14154(Object object, int i, int i_0_) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    return Arrays.copyOfRange(is, i, i_0_ + i);
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[i_0_];
	    bytebuffer.position(i);
	    bytebuffer.get(is, 0, i_0_);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    public static int method14155(String string, boolean bool, byte i) {
	string = string.toLowerCase();
	Class699.anIntArray8775 = null;
	Class390_Sub3.anInt10233 = 0;
	LinkedList linkedlist = new LinkedList();
	LinkedList linkedlist_1_ = new LinkedList();
	int i_2_ = bool ? 32768 : 0;
	int i_3_ = i_2_ + (bool ? 73971291 * Class215.aClass58_2283.anInt630
			   : Class215.aClass58_2283.anInt629 * -1950517593);
	for (int i_4_ = i_2_; i_4_ < i_3_; i_4_++) {
	    Class525_Sub16_Sub11 class525_sub16_sub11
		= Class215.aClass58_2283.method1220(i_4_, 797864);
	    if (class525_sub16_sub11.aBool11831
		&& class525_sub16_sub11.method18424(1730988396).toLowerCase
		       ().indexOf(string) != -1) {
		if (linkedlist.size() >= 50)
		    return -1;
		linkedlist.add(Integer.valueOf(i_4_));
		linkedlist_1_
		    .add(class525_sub16_sub11.method18424(1627681328));
	    }
	}
	Class699.anIntArray8775 = new int[linkedlist.size()];
	int i_5_ = 0;
	Iterator iterator = linkedlist.iterator();
	while (iterator.hasNext()) {
	    Integer integer = (Integer) iterator.next();
	    Class699.anIntArray8775[i_5_++] = integer.intValue();
	}
	String[] strings
	    = ((String[])
	       linkedlist_1_
		   .toArray(new String[Class699.anIntArray8775.length]));
	Class610.method10025(strings, Class699.anIntArray8775, (byte) -23);
	return linkedlist.size();
    }
    
    static Class272[] method14156(int i) {
	return (new Class272[]
		{ Class272.aClass272_2848, Class272.aClass272_2846,
		  Class272.aClass272_2850 });
    }
}
