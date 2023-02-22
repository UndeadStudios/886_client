/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public class Class91
{
    static final int anInt899 = 0;
    JS5 aClass458_900;
    Class75[] aClass75Array901;
    int anInt902;
    public static Class629 aClass629_903;
    
    Class75 method1688(int i, int i_0_, int i_1_) {
	if (anInt902 * 808848415 == -1)
	    return new Class75(false, new Class73[0]);
	Class73 class73 = new Class73(anInt902 * 808848415, i, i_0_);
	return new Class75(false, new Class73[] { class73 });
    }
    
    public Class73[] method1689(int i) {
	if (i < 0 || i >= aClass75Array901.length)
	    return method1688(0, 0, 1137960571).aClass73Array823;
	Class75 class75 = aClass75Array901[i];
	if (!class75.aBool822 || class75.aClass73Array823.length <= 1)
	    return class75.aClass73Array823;
	int i_2_ = anInt902 * 808848415 == -1 ? 0 : 1;
	Random random = new Random();
	Class73[] class73s = new Class73[class75.aClass73Array823.length];
	System.arraycopy(class75.aClass73Array823, 0, class73s, 0,
			 class73s.length);
	for (int i_3_ = i_2_; i_3_ < class73s.length; i_3_++) {
	    int i_4_ = (Class2.method526(random, class73s.length - i_2_,
					 -1561778525)
			+ i_2_);
	    Class73 class73 = class75.aClass73Array823[i_3_];
	    class73s[i_3_] = class73s[i_4_];
	    class73s[i_4_] = class73;
	}
	return class73s;
    }
    
    public Class87 method1690(int i, int i_5_) {
	byte[] is = aClass458_900.getFile(i, 0, 705096282);
	Class87 class87 = new Class87();
	class87.method1652(new RSBuffer(is), -982730474);
	return class87;
    }
    
    public boolean method1691() {
	return -1 != 808848415 * anInt902;
    }
    
    public Class73[] method1692(int i, int i_6_) {
	if (i < 0 || i >= aClass75Array901.length)
	    return method1688(0, 0, 1137960571).aClass73Array823;
	Class75 class75 = aClass75Array901[i];
	if (!class75.aBool822 || class75.aClass73Array823.length <= 1)
	    return class75.aClass73Array823;
	int i_7_ = anInt902 * 808848415 == -1 ? 0 : 1;
	Random random = new Random();
	Class73[] class73s = new Class73[class75.aClass73Array823.length];
	System.arraycopy(class75.aClass73Array823, 0, class73s, 0,
			 class73s.length);
	for (int i_8_ = i_7_; i_8_ < class73s.length; i_8_++) {
	    int i_9_ = (Class2.method526(random, class73s.length - i_7_,
					 -1073440110)
			+ i_7_);
	    Class73 class73 = class75.aClass73Array823[i_8_];
	    class73s[i_8_] = class73s[i_9_];
	    class73s[i_9_] = class73;
	}
	return class73s;
    }
    
    public Class87 method1693(int i) {
	byte[] is = aClass458_900.getFile(i, 0, 2030989202);
	Class87 class87 = new Class87();
	class87.method1652(new RSBuffer(is), -1647226407);
	return class87;
    }
    
    public Class87 method1694(int i) {
	byte[] is = aClass458_900.getFile(i, 0, 1105365190);
	Class87 class87 = new Class87();
	class87.method1652(new RSBuffer(is), -1183954245);
	return class87;
    }
    
    public boolean method1695(int i) {
	return -1 != 808848415 * anInt902;
    }
    
    public Class73[] method1696(int i) {
	if (i < 0 || i >= aClass75Array901.length)
	    return method1688(0, 0, 1137960571).aClass73Array823;
	Class75 class75 = aClass75Array901[i];
	if (!class75.aBool822 || class75.aClass73Array823.length <= 1)
	    return class75.aClass73Array823;
	int i_10_ = anInt902 * 808848415 == -1 ? 0 : 1;
	Random random = new Random();
	Class73[] class73s = new Class73[class75.aClass73Array823.length];
	System.arraycopy(class75.aClass73Array823, 0, class73s, 0,
			 class73s.length);
	for (int i_11_ = i_10_; i_11_ < class73s.length; i_11_++) {
	    int i_12_ = (Class2.method526(random, class73s.length - i_10_,
					  -873758817)
			 + i_10_);
	    Class73 class73 = class75.aClass73Array823[i_11_];
	    class73s[i_11_] = class73s[i_12_];
	    class73s[i_12_] = class73;
	}
	return class73s;
    }
    
    public boolean method1697() {
	return -1 != 808848415 * anInt902;
    }
    
    public boolean method1698() {
	return -1 != 808848415 * anInt902;
    }
    
    public Class91(Class668 class668, Class666 class666, JS5 class458) {
	aClass458_900 = class458;
	RSBuffer class525_sub38
	    = new RSBuffer(aClass458_900.getFile(0, 0, 696178791));
	int i = ((class525_sub38.buffer == null
		  || class525_sub38.buffer.length < 1)
		 ? -1 : class525_sub38.readUnsignedByte(1076573301));
	if (i < 4) {
	    aClass75Array901 = new Class75[0];
	    anInt902 = 1726582817;
	} else {
	    int i_13_ = class525_sub38.readUnsignedByte(1872626007);
	    Class392[] class392s = Class531_Sub2.method15934((short) 16383);
	    boolean bool = true;
	    if (class392s.length != i_13_)
		bool = false;
	    else {
		for (int i_14_ = 0; i_14_ < class392s.length; i_14_++) {
		    int i_15_ = class525_sub38.readUnsignedByte(1382032898);
		    if (i_15_ != class392s[i_14_].anInt4083 * -208789247) {
			bool = false;
			break;
		    }
		}
	    }
	    if (bool) {
		int i_16_ = class525_sub38.readUnsignedByte(770212906);
		int i_17_ = class525_sub38.readUnsignedByte(1002554537);
		int i_18_;
		int i_19_;
		if (i > 2) {
		    anInt902
			= class525_sub38.readSmart((byte) 32) * -1726582817;
		    i_18_ = class525_sub38.method16834(-1994884458);
		    i_19_ = class525_sub38.readUnsignedShort((byte) 71);
		} else {
		    anInt902 = 1726582817;
		    i_18_ = 0;
		    i_19_ = 0;
		}
		aClass75Array901 = new Class75[i_17_ + 1];
		for (int i_20_ = 0; i_20_ < i_16_; i_20_++) {
		    int i_21_ = class525_sub38.readUnsignedByte(992911684);
		    boolean bool_22_
			= class525_sub38.readUnsignedByte(760246773) == 1;
		    int i_23_ = class525_sub38.readUnsignedShort((byte) 63);
		    Class73[] class73s;
		    if (anInt902 * 808848415 == -1) {
			class73s = new Class73[i_23_];
			for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
			    int i_25_ = class525_sub38.readUnsignedShort((byte) 72);
			    int i_26_
				= class525_sub38.method16834(-1994884458);
			    int i_27_ = class525_sub38.readUnsignedShort((byte) 40);
			    class73s[i_24_] = new Class73(i_25_, i_26_, i_27_);
			}
			aClass75Array901[i_21_]
			    = new Class75(bool_22_, class73s);
		    } else {
			class73s = new Class73[1 + i_23_];
			class73s[0]
			    = new Class73(808848415 * anInt902, i_18_, i_19_);
			for (int i_28_ = 0; i_28_ < i_23_; i_28_++) {
			    int i_29_ = class525_sub38.readUnsignedShort((byte) 53);
			    int i_30_
				= class525_sub38.method16834(-1994884458);
			    int i_31_ = class525_sub38.readUnsignedShort((byte) 47);
			    class73s[i_28_ + 1]
				= new Class73(i_29_, i_30_, i_31_);
			}
		    }
		    aClass75Array901[i_21_] = new Class75(bool_22_, class73s);
		}
		for (int i_32_ = 0; i_32_ < i_17_ + 1; i_32_++) {
		    if (null == aClass75Array901[i_32_])
			aClass75Array901[i_32_]
			    = method1688(i_18_, i_19_, 1137960571);
		}
	    } else {
		aClass75Array901 = new Class75[0];
		anInt902 = 1726582817;
	    }
	}
    }
    
    static String method1699(int[] is, int i) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_33_ = 0; i_33_ < is.length; i_33_++) {
	    Class269 class269
		= (Class269) Class249.aClass47_Sub1_2445.method76(is[i_33_],
								  1202408679);
	    if (-1 != class269.anInt2840 * -347634379)
		stringbuilder.append(" <sprite=").append
		    (-347634379 * class269.anInt2840).append(">");
	}
	return stringbuilder.toString();
    }
    
    static final void method1700
	(Class525_Sub33 class525_sub33, int i, int i_34_, int i_35_, int i_36_,
	 int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
	if (Class165.method2667(i, null, 1980633393)) {
	    if (null != class525_sub33
		&& !class525_sub33.method16526(305409137))
		Class708.method14341(class525_sub33, true, false, -544961882);
	    else {
		Class245 class245 = Class162.aClass245Array1764[i];
		client.method17530(class245, class245.method4478((byte) 34),
				   -1, i_34_, i_35_, i_36_, i_37_, i_38_,
				   i_39_, i_40_, i_41_);
	    }
	}
    }
}
