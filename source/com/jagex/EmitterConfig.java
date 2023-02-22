/* Class525_Sub7_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Map;

public class EmitterConfig extends Class525_Sub7
{
    long aLong11724;
    String aString11725;
    Class345 this$0;
    static Class173 aClass173_11726;
    public static Map aMap11727;
    
    void method16117(RSBuffer class525_sub38, int i) {
	if (class525_sub38.readUnsignedByte(118491019) != 255) {
	    class525_sub38.index -= 339428471;
	    aLong11724 = (class525_sub38.method16603(-1048018685)
			  * 6122057790308488077L);
	}
	aString11725 = class525_sub38.method16635(-1980114144);
    }
    
    void method16125(Class353 class353) {
	class353.method6231(5587470507140278085L * aLong11724, aString11725, 0,
			    (short) -28793);
    }
    
    void method16119(Class353 class353, int i) {
	class353.method6231(5587470507140278085L * aLong11724, aString11725, 0,
			    (short) -20396);
    }
    
    void method16120(RSBuffer class525_sub38) {
	if (class525_sub38.readUnsignedByte(245084143) != 255) {
	    class525_sub38.index -= 339428471;
	    aLong11724 = (class525_sub38.method16603(-1664041284)
			  * 6122057790308488077L);
	}
	aString11725 = class525_sub38.method16635(891348492);
    }
    
    void method16122(RSBuffer class525_sub38) {
	if (class525_sub38.readUnsignedByte(1749562031) != 255) {
	    class525_sub38.index -= 339428471;
	    aLong11724 = (class525_sub38.method16603(-1120366067)
			  * 6122057790308488077L);
	}
	aString11725 = class525_sub38.method16635(1958642624);
    }
    
    EmitterConfig(Class345 class345) {
	this$0 = class345;
	aLong11724 = -6122057790308488077L;
	aString11725 = null;
    }
    
    void method16118(Class353 class353) {
	class353.method6231(5587470507140278085L * aLong11724, aString11725, 0,
			    (short) 294);
    }
    
    void method16123(Class353 class353) {
	class353.method6231(5587470507140278085L * aLong11724, aString11725, 0,
			    (short) -9924);
    }
    
    void method16124(Class353 class353) {
	class353.method6231(5587470507140278085L * aLong11724, aString11725, 0,
			    (short) -928);
    }
    
    void method16121(RSBuffer class525_sub38) {
	if (class525_sub38.readUnsignedByte(248551378) != 255) {
	    class525_sub38.index -= 339428471;
	    aLong11724 = (class525_sub38.method16603(-1462351790)
			  * 6122057790308488077L);
	}
	aString11725 = class525_sub38.method16635(574980879);
    }
    
    public static Interface60 method18248(int i) {
	if (null == Class509.anInterface60_5660)
	    throw new IllegalStateException("");
	return Class509.anInterface60_5660;
    }
}
