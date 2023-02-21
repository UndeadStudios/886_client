/* Class616 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class616
{
    static int anInt8042;
    static int anInt8043 = 0;
    static Class10 aClass10_8044;
    static int anInt8045;
    static int anInt8046;
    static int anInt8047;
    static int anInt8048 = 0;
    static Interface49 anInterface49_8049;
    static List aList8050;
    static int anInt8051;
    static Class388[] aClass388Array8052;
    static Class10 aClass10_8053;
    static int anInt8054;
    static int anInt8055;
    
    public static int method10092() {
	return 1206403205 * anInt8047;
    }
    
    static {
	anInt8045 = 0;
	anInt8046 = 0;
	anInt8042 = 0;
	anInt8055 = 0;
	aClass388Array8052 = new Class388[16];
	anInt8051 = 0;
	aClass10_8044 = new Class10(16);
	aClass10_8053 = new Class10(8);
	anInt8054 = 0;
	anInt8047 = 109277338;
    }
    
    public static void method10093(Interface48 interface48,
				   Interface49 interface49) {
	anInt8043 = 0;
	anInt8048 = 0;
	aList8050 = new LinkedList();
	Class261.aClass531_Sub5_Sub1_Sub1Array2790
	    = new Class531_Sub5_Sub1_Sub1[1024];
	Class329.aClass633Array3589
	    = (new Class633
	       [1 + Class181.anIntArray1922[anInt8047 * 1206403205]]);
	anInt8045 = 0;
	anInt8046 = 0;
	anInterface49_8049 = interface49;
    }
    
    public static void method10094(Interface48 interface48,
				   Interface49 interface49) {
	anInt8043 = 0;
	anInt8048 = 0;
	aList8050 = new LinkedList();
	Class261.aClass531_Sub5_Sub1_Sub1Array2790
	    = new Class531_Sub5_Sub1_Sub1[1024];
	Class329.aClass633Array3589
	    = (new Class633
	       [1 + Class181.anIntArray1922[anInt8047 * 1206403205]]);
	anInt8045 = 0;
	anInt8046 = 0;
	anInterface49_8049 = interface49;
    }
    
    public static void method10095(Class182 class182, long l) {
	anInt8055 = -883801177 * anInt8042;
	anInt8042 = 0;
	Class251.method4508((byte) 8);
	Iterator iterator = aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    boolean bool = class633.method10371(class182, l);
	    if (!bool) {
		iterator.remove();
		Class329.aClass633Array3589[1593133783 * anInt8046] = class633;
		anInt8046 = -1700050713 * (1593133783 * anInt8046 + 1
					   & (Class181.anIntArray1922
					      [anInt8047 * 1206403205]));
	    }
	}
    }
    
    public static void method10096(Class182 class182, long l) {
	anInt8055 = -883801177 * anInt8042;
	anInt8042 = 0;
	Class251.method4508((byte) 8);
	Iterator iterator = aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    boolean bool = class633.method10371(class182, l);
	    if (!bool) {
		iterator.remove();
		Class329.aClass633Array3589[1593133783 * anInt8046] = class633;
		anInt8046 = -1700050713 * (1593133783 * anInt8046 + 1
					   & (Class181.anIntArray1922
					      [anInt8047 * 1206403205]));
	    }
	}
    }
    
    public static void method10097(Class546 class546, Class182 class182) {
	Iterator iterator = aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    if (class633.aBool8232)
		class633.method10340(class546, class182);
	}
    }
    
    public static void method10098(Class546 class546, Class182 class182) {
	Iterator iterator = aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    if (class633.aBool8232)
		class633.method10340(class546, class182);
	}
    }
    
    public static void method10099(Class182 class182, long l) {
	anInt8055 = -883801177 * anInt8042;
	anInt8042 = 0;
	Class251.method4508((byte) 8);
	Iterator iterator = aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    boolean bool = class633.method10371(class182, l);
	    if (!bool) {
		iterator.remove();
		Class329.aClass633Array3589[1593133783 * anInt8046] = class633;
		anInt8046 = -1700050713 * (1593133783 * anInt8046 + 1
					   & (Class181.anIntArray1922
					      [anInt8047 * 1206403205]));
	    }
	}
    }
    
    public static void method10100(Class546 class546, Class182 class182) {
	Iterator iterator = aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    if (class633.aBool8232)
		class633.method10340(class546, class182);
	}
    }
    
    public static void method10101(Class546 class546, Class182 class182) {
	Iterator iterator = aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    if (class633.aBool8232)
		class633.method10340(class546, class182);
	}
    }
    
    public static void method10102() {
	aClass10_8053 = new Class10(8);
	anInt8054 = 0;
	Iterator iterator = aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    class633.method10331();
	}
    }
    
    public static void method10103() {
	aClass10_8053 = new Class10(8);
	anInt8054 = 0;
	Iterator iterator = aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    class633.method10331();
	}
    }
    
    public static int method10104() {
	return 1206403205 * anInt8047;
    }
    
    public static int method10105() {
	return 1206403205 * anInt8047;
    }
    
    Class616() throws Throwable {
	throw new Error();
    }
    
    static void method10106(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	if (Class678.aBool8620) {
	    Class521.method8693((class683.anIntArray8661
				 [501271953 * class683.anInt8662]) != 0,
				(byte) -7);
	    Class236.method4409(0 != (class683.anIntArray8661
				      [1 + class683.anInt8662 * 501271953]),
				(byte) 42);
	    Class696_Sub26.method17220(((class683.anIntArray8661
					 [2 + class683.anInt8662 * 501271953])
					!= 0),
				       84745001);
	}
    }
    
    static final void method10107(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class101.method1883(class259, class245, class683, (byte) 111);
    }
    
    static final void method10108(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class486.method7851(class259, class245, class683, 2119126102);
    }
    
    public static void method10109(int i) {
	for (Class525_Sub16_Sub7 class525_sub16_sub7
		 = ((Class525_Sub16_Sub7)
		    Class61.aClass697_656.method14186((byte) -80));
	     class525_sub16_sub7 != null;
	     class525_sub16_sub7
		 = ((Class525_Sub16_Sub7)
		    Class61.aClass697_656.method14201((byte) -1))) {
	    if (1624285615 * class525_sub16_sub7.anInt11780 > 1) {
		class525_sub16_sub7.anInt11780 = 0;
		Class61.aClass200_653.method3788(class525_sub16_sub7,
						 ((((Class525_Sub16_Sub16)
						    (class525_sub16_sub7
						     .aClass697_11778
						     .aClass525_Sub16_8766
						     .aClass525_Sub16_10554))
						   .aLong11866)
						  * -4663703702830765539L));
		class525_sub16_sub7.aClass697_11778.method14199(-482864949);
	    }
	}
	Class61.anInt659 = 0;
	Class61.anInt658 = 0;
	Class61.aClass709_660.method14344(-1068358708);
	Class61.aClass10_661.method688((short) 3497);
	Class61.aClass697_656.method14199(-1496260735);
	Class61.aBool670 = false;
    }
}
