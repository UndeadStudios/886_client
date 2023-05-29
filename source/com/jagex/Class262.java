/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Component;

public class Class262
{
    static final int anInt2791 = 4;
    String aString2792;
    static final int anInt2793 = 256;
    Class274[] aClass274Array2794;
    Class274[] aClass274Array2795;
    Class280[] aClass280Array2796;
    static final int anInt2797 = 2;
    
    void method4771(byte[] is) throws Exception_Sub3 {
	Class286 class286 = new Class286(is);
	int i = class286.method5225((byte) 13);
	if (4 != i)
	    throw new Exception_Sub3(this, i, 4);
	aString2792 = class286.method5226(1691449666);
	aClass274Array2794 = new Class274[class286.method5225((byte) -98)];
	aClass274Array2795 = new Class274[class286.method5225((byte) -15)];
	aClass280Array2796 = new Class280[class286.method5225((byte) -40)];
	for (int i_0_ = 0; i_0_ < aClass274Array2794.length; i_0_++) {
	    aClass274Array2794[i_0_] = new Class274();
	    aClass274Array2794[i_0_].method5087(class286, 1755464319);
	}
	for (int i_1_ = 0; i_1_ < aClass274Array2795.length; i_1_++) {
	    aClass274Array2795[i_1_] = new Class274();
	    aClass274Array2795[i_1_].method5087(class286, 1439638848);
	}
	for (int i_2_ = 0; i_2_ < aClass280Array2796.length; i_2_++) {
	    aClass280Array2796[i_2_] = new Class280();
	    aClass280Array2796[i_2_].method5156(class286, -1028431221);
	}
    }
    
    void method4772(byte[] is, byte i) throws Exception_Sub3 {
	Class286 class286 = new Class286(is);
	int i_3_ = class286.method5225((byte) -36);
	if (4 != i_3_)
	    throw new Exception_Sub3(this, i_3_, 4);
	aString2792 = class286.method5226(1874063264);
	aClass274Array2794 = new Class274[class286.method5225((byte) -82)];
	aClass274Array2795 = new Class274[class286.method5225((byte) -124)];
	aClass280Array2796 = new Class280[class286.method5225((byte) -61)];
	for (int i_4_ = 0; i_4_ < aClass274Array2794.length; i_4_++) {
	    aClass274Array2794[i_4_] = new Class274();
	    aClass274Array2794[i_4_].method5087(class286, 433258666);
	}
	for (int i_5_ = 0; i_5_ < aClass274Array2795.length; i_5_++) {
	    aClass274Array2795[i_5_] = new Class274();
	    aClass274Array2795[i_5_].method5087(class286, 965314155);
	}
	for (int i_6_ = 0; i_6_ < aClass280Array2796.length; i_6_++) {
	    aClass280Array2796[i_6_] = new Class280();
	    aClass280Array2796[i_6_].method5156(class286, -1028431221);
	}
    }
    
    public Class262(byte[] is) throws Exception_Sub3 {
	method4772(is, (byte) -124);
    }
    
    void method4773(byte[] is) throws Exception_Sub3 {
	Class286 class286 = new Class286(is);
	int i = class286.method5225((byte) -80);
	if (4 != i)
	    throw new Exception_Sub3(this, i, 4);
	aString2792 = class286.method5226(1733765969);
	aClass274Array2794 = new Class274[class286.method5225((byte) -31)];
	aClass274Array2795 = new Class274[class286.method5225((byte) -120)];
	aClass280Array2796 = new Class280[class286.method5225((byte) -67)];
	for (int i_7_ = 0; i_7_ < aClass274Array2794.length; i_7_++) {
	    aClass274Array2794[i_7_] = new Class274();
	    aClass274Array2794[i_7_].method5087(class286, 1602026068);
	}
	for (int i_8_ = 0; i_8_ < aClass274Array2795.length; i_8_++) {
	    aClass274Array2795[i_8_] = new Class274();
	    aClass274Array2795[i_8_].method5087(class286, 1935908009);
	}
	for (int i_9_ = 0; i_9_ < aClass280Array2796.length; i_9_++) {
	    aClass280Array2796[i_9_] = new Class280();
	    aClass280Array2796[i_9_].method5156(class286, -1028431221);
	}
    }
    
    public static void method4774(Class182 class182, long l) {
	class182.method3178();
	Class589.aLinkedList7802.clear();
	Class589.aLinkedList7798.clear();
	Class589.aLong7795 = (((long) (Class589.anInt7788 * -784803871) + l)
			      * -7476698233485713155L);
    }
    
    static final void method4775(Class683 class683, int i) {
	if ((class683.anIntArray8661
	     [(class683.anInt8662 -= 1552651121) * 501271953])
	    == 1)
	    class683.anInt8663
		+= (class683.anIntArray8647[1931825055 * class683.anInt8663]
		    * -1827402657);
    }
    
    public static Class551 method4776(Component component, int i) {
	return new Class551_Sub1(component);
    }
    
    static void method4777(Class525_Sub32 class525_sub32, int i, int i_10_) {
	Object[] objects = class525_sub32.anObjectArray10740;
	int i_11_ = ((Integer) objects[0]).intValue();
	Class525_Sub16_Sub4 class525_sub16_sub4
	    = TextureMetrics.method2675(i_11_, (byte) -42);
	if (class525_sub16_sub4 != null) {
	    Class683 class683 = Class457.method7468(-485786200);
	    class683.anIntArray8649
		= new int[-1831313555 * class525_sub16_sub4.anInt11747];
	    int i_12_ = 0;
	    class683.anObjectArray8637
		= new String[class525_sub16_sub4.anInt11752 * 678090421];
	    int i_13_ = 0;
	    class683.aLongArray8638
		= new long[class525_sub16_sub4.anInt11753 * -1954010063];
	    int i_14_ = 0;
	    for (int i_15_ = 1; i_15_ < objects.length; i_15_++) {
		if (objects[i_15_] instanceof Integer) {
		    int i_16_ = ((Integer) objects[i_15_]).intValue();
		    if (-2147483647 == i_16_)
			i_16_ = 1013884159 * class525_sub32.anInt10737;
		    if (i_16_ == -2147483646)
			i_16_ = -127322147 * class525_sub32.anInt10738;
		    if (i_16_ == -2147483645)
			i_16_ = (null != class525_sub32.aClass259_10736
				 ? (1984678839
				    * class525_sub32.aClass259_10736.anInt2588)
				 : -1);
		    if (-2147483644 == i_16_)
			i_16_ = 2128800005 * class525_sub32.anInt10739;
		    if (-2147483643 == i_16_)
			i_16_ = (class525_sub32.aClass259_10736 != null
				 ? (class525_sub32.aClass259_10736.anInt2576
				    * 1534974651)
				 : -1);
		    if (-2147483642 == i_16_)
			i_16_ = (null != class525_sub32.aClass259_10735
				 ? (1984678839
				    * class525_sub32.aClass259_10735.anInt2588)
				 : -1);
		    if (-2147483641 == i_16_)
			i_16_ = (null != class525_sub32.aClass259_10735
				 ? (1534974651
				    * class525_sub32.aClass259_10735.anInt2576)
				 : -1);
		    if (i_16_ == -2147483640)
			i_16_ = class525_sub32.anInt10741 * 1231527441;
		    if (i_16_ == -2147483639)
			i_16_ = class525_sub32.anInt10742 * -462882151;
		    class683.anIntArray8649[i_12_++] = i_16_;
		} else if (objects[i_15_] instanceof String) {
		    String string = (String) objects[i_15_];
		    if (string.equals("event_opbase"))
			string = class525_sub32.aString10743;
		    class683.anObjectArray8637[i_13_++] = string;
		} else if (objects[i_15_] instanceof Long) {
		    long l = ((Long) objects[i_15_]).longValue();
		    class683.aLongArray8638[i_14_++] = l;
		}
	    }
	    class683.anInt8659 = 1094670399 * class525_sub32.anInt10744;
	    Class60.method1231(class525_sub16_sub4, i, class683, -981142050);
	    class683.anInt8659 = 0;
	}
    }
    
    static final void method4778(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class206.method3900(class259, class245, class683, (byte) -17);
    }
    
    static final void method4779(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class256.method4649(class259, class245, class683, (byte) -4);
    }
    
    static final void method4780(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_17_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_18_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	ItemDefinitions class8
	    = ((ItemDefinitions)
	       Class313_Sub2.aClass40_Sub22_10106.method76(i_17_, -153802187));
	if (i_18_ >= 1 && i_18_ <= 5
	    && null != class8.aStringArray85[i_18_ - 1])
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class8.aStringArray85[i_18_ - 1];
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
    }
    
    public static Class179 method4781(Class182 class182, int i, int i_19_,
				      int i_20_, int i_21_, Class179 class179,
				      short i_22_, byte i_23_,
				      Class689 class689, int i_24_) {
	if (null == class179)
	    return null;
	int i_25_ = 2055;
	if (class689 != null) {
	    i_25_ |= class689.method14033(-984514696);
	    i_25_ &= ~0x200;
	}
	long l = (long) ((i_22_ & 0xffff) << 8 | i_23_);
	Class179 class179_26_;
	synchronized (Class72.aClass200_816) {
	    class179_26_ = (Class179) Class72.aClass200_816.method3785(l);
	}
	if (null == class179_26_
	    || class182.method3321(class179_26_.method2928(), i_25_) != 0) {
	    if (null != class179_26_)
		i_25_ = class182.method3229(i_25_, class179_26_.method2928());
	    ModelDecoder class186 = new ModelDecoder(4, 2, 2);
	    int i_27_ = 128;
	    int[] is = new int[4];
	    is[0] = class186.method3625(-i_27_, 0, -i_27_);
	    is[1] = class186.method3625(i_27_, 0, -i_27_);
	    is[2] = class186.method3625(i_27_, 0, i_27_);
	    is[3] = class186.method3625(-i_27_, 0, i_27_);
	    class186.method3626(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_23_,
				i_22_);
	    class186.method3626(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_23_,
				i_22_);
	    class186.method3627((short) 1, (short) 2, (short) 0);
	    class186.method3627((short) 2, (short) 3, (short) 0);
	    class179_26_
		= class182.method3556(class186, i_25_,
				      Class72.anInt815 * -1099674713, 64, 768);
	    synchronized (Class72.aClass200_816) {
		Class72.aClass200_816.method3788(class179_26_, l);
	    }
	}
	int i_28_ = class179.method3001();
	int i_29_ = class179.method2959();
	int i_30_ = class179.method2962();
	int i_31_ = class179.method2963();
	if (class689 != null) {
	    class179_26_ = class179_26_.method2926((byte) 3, i_25_, true);
	    class179_26_.method2936(i_29_ - i_28_ >> 1, 128,
				    i_31_ - i_30_ >> 1);
	    class179_26_.method2934(i_29_ + i_28_ >> 1, 0, i_30_ + i_31_ >> 1);
	    class689.method14036(class179_26_, (byte) 91);
	} else {
	    class179_26_ = class179_26_.method2926((byte) 3, i_25_, true);
	    class179_26_.method2936(i_29_ - i_28_ >> 1, 128,
				    i_31_ - i_30_ >> 1);
	    class179_26_.method2934(i_28_ + i_29_ >> 1, 0, i_30_ + i_31_ >> 1);
	}
	if (i_19_ != 0)
	    class179_26_.method2932(i_19_);
	if (0 != i_20_)
	    class179_26_.method2933(i_20_);
	if (i_21_ != 0)
	    class179_26_.method2934(0, i_21_, 0);
	return class179_26_;
    }
    
    static void method4782(int i, int i_32_, int i_33_, byte i_34_) {
	if (1008 == i)
	    Class396.method6536(Class578.aClass578_7669, i_32_, i_33_,
				854684161);
	else if (i == 1009)
	    Class396.method6536(Class578.aClass578_7651, i_32_, i_33_,
				483526419);
	else if (i == 1010)
	    Class396.method6536(Class578.aClass578_7652, i_32_, i_33_,
				564699215);
	else if (i == 1011)
	    Class396.method6536(Class578.aClass578_7653, i_32_, i_33_,
				-367549905);
	else if (i == 1012)
	    Class396.method6536(Class578.aClass578_7664, i_32_, i_33_,
				-61161460);
    }
}
