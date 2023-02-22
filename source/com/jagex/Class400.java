/* Class400 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class400 implements Interface49
{
    Class200 aClass200_4130 = new Class200(64);
    JS5 aClass458_4131;
    
    public Class388 method343(int i) {
	Class388 class388 = (Class388) aClass200_4130.method3785((long) i);
	if (null != class388)
	    return class388;
	byte[] is = aClass458_4131.getFile(1, i, 1297196863);
	class388 = new Class388();
	class388.anInt4046 = 529643011 * i;
	if (is != null)
	    class388.method6454(new RSBuffer(is), 843012463);
	class388.method6456((short) 18993);
	aClass200_4130.method3788(class388, (long) i);
	return class388;
    }
    
    public Class388 method342(int i, byte i_0_) {
	Class388 class388 = (Class388) aClass200_4130.method3785((long) i);
	if (null != class388)
	    return class388;
	byte[] is = aClass458_4131.getFile(1, i, 153470802);
	class388 = new Class388();
	class388.anInt4046 = 529643011 * i;
	if (is != null)
	    class388.method6454(new RSBuffer(is), 1444657051);
	class388.method6456((short) 18074);
	aClass200_4130.method3788(class388, (long) i);
	return class388;
    }
    
    public void method6550(int i) {
	aClass200_4130.method3791((byte) -28);
    }
    
    public Class400(JS5 class458) {
	aClass458_4131 = class458;
    }
}
