/* Class637 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class637
{
    long aLong8287;
    public static final int anInt8288 = 1073741824;
    static final int anInt8289 = 1073741823;
    public static final int anInt8290 = 10;
    public boolean aBool8291;
    static Class200 aClass200_8292;
    public static final int anInt8293 = 10;
    int anInt8294;
    int[] anIntArray8295;
    Class2[] aClass2Array8296;
    static int[] anIntArray8297 = { 8, 11, 4, 6, 9, 7, 10, 0 };
    public int[] anIntArray8298;
    public static final int anInt8299 = -2147483648;
    public int anInt8300 = -1204264865;
    public int[] anIntArray8301;
    long aLong8302;
    public static final int anInt8303 = 4;
    public static final int anInt8304 = 4;
    static Class200 aClass200_8305;
    
    public static void method10475() {
	synchronized (aClass200_8292) {
	    aClass200_8292.method3809((byte) 15);
	}
	synchronized (aClass200_8305) {
	    aClass200_8305.method3809((byte) 49);
	}
    }
    
    public void method10476(int i, int[] is, Class2[] class2s, int[] is_0_,
			    int[] is_1_, boolean bool, int i_2_, int i_3_) {
	if (anInt8294 * 2129432397 != i)
	    anInt8294 = -871153275 * i;
	anIntArray8295 = is;
	aClass2Array8296 = class2s;
	anIntArray8301 = is_0_;
	anIntArray8298 = is_1_;
	aBool8291 = bool;
	anInt8300 = 1204264865 * i_2_;
	method10481((byte) 7);
    }
    
    public void method10477(int i, int i_4_, Class40_Sub9 class40_sub9,
			    int i_5_) {
	int i_6_ = anIntArray8297[i];
	if (class40_sub9.method76(i_4_, 1244581680) != null) {
	    anIntArray8295[i_6_] = i_4_ | ~0x7fffffff;
	    method10481((byte) -8);
	}
    }
    
    public void method10478(int i, int i_7_, byte i_8_) {
	anIntArray8298[i] = i_7_;
	method10481((byte) 10);
    }
    
    public void method10479(boolean bool, int i) {
	aBool8291 = bool;
	method10481((byte) -44);
    }
    
    public void method10480(int i, int i_9_, Class40_Sub22 class40_sub22,
			    int i_10_) {
	if (i_9_ == -1)
	    anIntArray8295[i] = 0;
	else if (class40_sub22.method76(i_9_, -1351893232) != null) {
	    anIntArray8295[i] = i_9_ | 0x40000000;
	    method10481((byte) -120);
	}
    }
    
    void method10481(byte i) {
	long[] ls = RSBuffer.aLongArray10833;
	aLong8287 = -4934863201018085119L;
	aLong8287 = (4934863201018085119L
		     * (aLong8287 * -4390499680284671745L >>> 8
			^ ls[(int) ((-4390499680284671745L * aLong8287
				     ^ (long) (2129432397 * anInt8294 >> 8))
				    & 0xffL)]));
	aLong8287 = (4934863201018085119L
		     * (-4390499680284671745L * aLong8287 >>> 8
			^ ls[(int) ((aLong8287 * -4390499680284671745L
				     ^ (long) (2129432397 * anInt8294))
				    & 0xffL)]));
	for (int i_11_ = 0; i_11_ < anIntArray8295.length; i_11_++) {
	    aLong8287 = (aLong8287 * -4390499680284671745L >>> 8
			 ^ ls[(int) ((aLong8287 * -4390499680284671745L
				      ^ (long) (anIntArray8295[i_11_] >> 24))
				     & 0xffL)]) * 4934863201018085119L;
	    aLong8287
		= (4934863201018085119L
		   * (aLong8287 * -4390499680284671745L >>> 8
		      ^ ls[(int) ((-4390499680284671745L * aLong8287
				   ^ (long) (anIntArray8295[i_11_] >> 16))
				  & 0xffL)]));
	    aLong8287 = (4934863201018085119L
			 * (aLong8287 * -4390499680284671745L >>> 8
			    ^ ls[(int) ((aLong8287 * -4390499680284671745L
					 ^ (long) (anIntArray8295[i_11_] >> 8))
					& 0xffL)]));
	    aLong8287 = (4934863201018085119L
			 * (-4390499680284671745L * aLong8287 >>> 8
			    ^ ls[(int) ((aLong8287 * -4390499680284671745L
					 ^ (long) anIntArray8295[i_11_])
					& 0xffL)]));
	}
	if (aClass2Array8296 != null) {
	    for (int i_12_ = 0; i_12_ < aClass2Array8296.length; i_12_++) {
		if (aClass2Array8296[i_12_] != null) {
		    int[] is;
		    int[] is_13_;
		    if (aBool8291) {
			is = aClass2Array8296[i_12_].anIntArray16;
			is_13_ = aClass2Array8296[i_12_].anIntArray23;
		    } else {
			is = aClass2Array8296[i_12_].anIntArray22;
			is_13_ = aClass2Array8296[i_12_].anIntArray15;
		    }
		    if (null != is) {
			for (int i_14_ = 0; i_14_ < is.length; i_14_++) {
			    aLong8287
				= (4934863201018085119L
				   * (-4390499680284671745L * aLong8287 >>> 8
				      ^ ls[(int) (((-4390499680284671745L
						    * aLong8287)
						   ^ (long) (is[i_14_] >> 8))
						  & 0xffL)]));
			    aLong8287
				= ((aLong8287 * -4390499680284671745L >>> 8
				    ^ ls[(int) (((-4390499680284671745L
						  * aLong8287)
						 ^ (long) is[i_14_])
						& 0xffL)])
				   * 4934863201018085119L);
			}
		    }
		    if (is_13_ != null) {
			for (int i_15_ = 0; i_15_ < is_13_.length; i_15_++) {
			    aLong8287
				= (4934863201018085119L
				   * (aLong8287 * -4390499680284671745L >>> 8
				      ^ ls[(int) (((aLong8287
						    * -4390499680284671745L)
						   ^ (long) (is_13_[i_15_]
							     >> 8))
						  & 0xffL)]));
			    aLong8287
				= (4934863201018085119L
				   * (-4390499680284671745L * aLong8287 >>> 8
				      ^ ls[(int) (((aLong8287
						    * -4390499680284671745L)
						   ^ (long) is_13_[i_15_])
						  & 0xffL)]));
			}
		    }
		    if (null != aClass2Array8296[i_12_].aShortArray24) {
			for (int i_16_ = 0;
			     (i_16_
			      < aClass2Array8296[i_12_].aShortArray24.length);
			     i_16_++) {
			    aLong8287
				= (4934863201018085119L
				   * (-4390499680284671745L * aLong8287 >>> 8
				      ^ ls[(int) (((aLong8287
						    * -4390499680284671745L)
						   ^ (long) ((aClass2Array8296
							      [i_12_]
							      .aShortArray24
							      [i_16_])
							     >> 8))
						  & 0xffL)]));
			    aLong8287
				= (4934863201018085119L
				   * (aLong8287 * -4390499680284671745L >>> 8
				      ^ ls[(int) (((-4390499680284671745L
						    * aLong8287)
						   ^ (long) (aClass2Array8296
							     [i_12_]
							     .aShortArray24
							     [i_16_]))
						  & 0xffL)]));
			}
		    }
		    if (aClass2Array8296[i_12_].aShortArray21 != null) {
			for (int i_17_ = 0;
			     (i_17_
			      < aClass2Array8296[i_12_].aShortArray21.length);
			     i_17_++) {
			    aLong8287
				= ((aLong8287 * -4390499680284671745L >>> 8
				    ^ ls[(int) (((-4390499680284671745L
						  * aLong8287)
						 ^ (long) ((aClass2Array8296
							    [i_12_]
							    .aShortArray21
							    [i_17_])
							   >> 8))
						& 0xffL)])
				   * 4934863201018085119L);
			    aLong8287
				= ((-4390499680284671745L * aLong8287 >>> 8
				    ^ ls[(int) (((-4390499680284671745L
						  * aLong8287)
						 ^ (long) (aClass2Array8296
							   [i_12_]
							   .aShortArray21
							   [i_17_]))
						& 0xffL)])
				   * 4934863201018085119L);
			}
		    }
		}
	    }
	}
	for (int i_18_ = 0; i_18_ < 10; i_18_++)
	    aLong8287 = (-4390499680284671745L * aLong8287 >>> 8
			 ^ ls[(int) ((aLong8287 * -4390499680284671745L
				      ^ (long) anIntArray8301[i_18_])
				     & 0xffL)]) * 4934863201018085119L;
	for (int i_19_ = 0; i_19_ < 10; i_19_++)
	    aLong8287 = (aLong8287 * -4390499680284671745L >>> 8
			 ^ ls[(int) ((aLong8287 * -4390499680284671745L
				      ^ (long) anIntArray8298[i_19_])
				     & 0xffL)]) * 4934863201018085119L;
	aLong8287 = (4934863201018085119L
		     * (-4390499680284671745L * aLong8287 >>> 8
			^ ls[(int) ((-4390499680284671745L * aLong8287
				     ^ (long) (aBool8291 ? 1 : 0))
				    & 0xffL)]));
    }
    
    public Class179 method10482
	(Class182 class182, int i, Class40_Sub1 class40_sub1,
	 Class40_Sub9 class40_sub9, Class40_Sub7 class40_sub7,
	 Class40_Sub22 class40_sub22, Interface20 interface20,
	 Interface18 interface18, Class689 class689, Class689 class689_20_,
	 Class689[] class689s, int[] is, int i_21_, boolean bool,
	 Class634 class634, int i_22_) {
	if (-1 != anInt8300 * -1172437919)
	    return (((Class299) class40_sub7.method76(anInt8300 * -1172437919,
						      1622393203))
			.method5362
		    (class182, i, class40_sub1, interface20, interface18,
		     class689, class689_20_, class689s, is, i_21_, null,
		     1921874991));
	int i_23_ = i;
	long l = aLong8287 * -4390499680284671745L;
	int[] is_24_ = anIntArray8295;
	boolean bool_25_ = false;
	boolean bool_26_ = false;
	if (class689 != null) {
	    Class194 class194 = class689.method14058(160719474);
	    if (class194 != null
		&& (1963525839 * class194.anInt2161 >= 0
		    || class194.anInt2164 * -1838669931 >= 0)) {
		is_24_ = new int[anIntArray8295.length];
		for (int i_27_ = 0; i_27_ < is_24_.length; i_27_++)
		    is_24_[i_27_] = anIntArray8295[i_27_];
		if (class194.anInt2161 * 1963525839 >= 0
		    && 366199787 * class634.anInt8237 != -1) {
		    bool_25_ = true;
		    if (65535 == 1963525839 * class194.anInt2161) {
			is_24_[class634.anInt8237 * 366199787] = 0;
			for (int i_28_ = 0;
			     i_28_ < class634.anIntArray8239.length; i_28_++)
			    is_24_[class634.anIntArray8239[i_28_]] = 0;
			l ^= ~0xffffffffL;
		    } else {
			is_24_[366199787 * class634.anInt8237]
			    = class194.anInt2161 * 1963525839 | 0x40000000;
			for (int i_29_ = 0;
			     i_29_ < class634.anIntArray8239.length; i_29_++)
			    is_24_[class634.anIntArray8239[i_29_]] = 0;
			l ^= ((long) is_24_[class634.anInt8237 * 366199787]
			      << 32);
		    }
		}
		if (class194.anInt2164 * -1838669931 >= 0
		    && -1 != class634.anInt8242 * 660320893) {
		    bool_26_ = true;
		    if (65535 == class194.anInt2164 * -1838669931) {
			is_24_[class634.anInt8242 * 660320893] = 0;
			for (int i_30_ = 0;
			     i_30_ < class634.anIntArray8243.length; i_30_++)
			    is_24_[class634.anIntArray8243[i_30_]] = 0;
			l ^= 0xffffffffL;
		    } else {
			is_24_[class634.anInt8242 * 660320893]
			    = class194.anInt2164 * -1838669931 | 0x40000000;
			for (int i_31_ = 0;
			     i_31_ < class634.anIntArray8243.length; i_31_++)
			    is_24_[class634.anIntArray8243[i_31_]] = 0;
			l ^= (long) is_24_[class634.anInt8242 * 660320893];
		    }
		}
	    }
	}
	boolean bool_32_ = false;
	int i_33_ = null != class689s ? class689s.length : 0;
	for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
	    if (class689s[i_34_] != null) {
		i_23_ |= class689s[i_34_].method14033(2062538840);
		bool_32_ = true;
	    }
	}
	if (class689 != null) {
	    i_23_ |= class689.method14033(612836651);
	    bool_32_ = true;
	}
	if (null != class689_20_) {
	    i_23_ |= class689_20_.method14033(-1052224841);
	    bool_32_ = true;
	}
	boolean bool_35_ = false;
	if (is != null) {
	    for (int i_36_ = 0; i_36_ < is.length; i_36_++) {
		if (-1 != is[i_36_]) {
		    i_23_ |= 0x20;
		    bool_35_ = true;
		}
	    }
	}
	Class179 class179;
	synchronized (aClass200_8292) {
	    class179 = (Class179) aClass200_8292.method3785(l);
	}
	Class586 class586 = null;
	if (anInt8294 * 2129432397 != -1)
	    class586 = (Class586) class40_sub1.method76(2129432397 * anInt8294,
							-2057299737);
	if (null == class179
	    || class182.method3321(class179.method2928(), i_23_) != 0) {
	    if (null != class179)
		i_23_ = class182.method3229(i_23_, class179.method2928());
	    int i_37_ = i_23_;
	    boolean bool_38_ = false;
	    for (int i_39_ = 0; i_39_ < is_24_.length; i_39_++) {
		int i_40_ = is_24_[i_39_];
		Class2 class2 = null;
		boolean bool_41_ = false;
		if (bool_25_) {
		    if (366199787 * class634.anInt8237 == i_39_)
			bool_41_ = true;
		    else {
			for (int i_42_ = 0;
			     i_42_ < class634.anIntArray8239.length; i_42_++) {
			    if (i_39_ == class634.anIntArray8239[i_42_]) {
				bool_41_ = true;
				break;
			    }
			}
		    }
		}
		if (bool_26_) {
		    if (class634.anInt8242 * 660320893 == i_39_)
			bool_41_ = true;
		    else {
			for (int i_43_ = 0;
			     i_43_ < class634.anIntArray8243.length; i_43_++) {
			    if (i_39_ == class634.anIntArray8243[i_43_]) {
				bool_41_ = true;
				break;
			    }
			}
		    }
		}
		if ((i_40_ & 0x40000000) != 0) {
		    if (!bool_41_ && null != aClass2Array8296
			&& aClass2Array8296[i_39_] != null)
			class2 = aClass2Array8296[i_39_];
		    if (!((Class8) class40_sub22.method76(i_40_ & 0x3fffffff,
							  819217917))
			     .method625(aBool8291, class2, 1472470898))
			bool_38_ = true;
		} else if ((i_40_ & ~0x7fffffff) != 0
			   && !((Class327)
				class40_sub9.method76(i_40_ & 0x3fffffff,
						      1093240323))
				   .method5753(1651744137))
		    bool_38_ = true;
	    }
	    if (bool_38_) {
		if (-3535620521105803683L * aLong8302 != -1L) {
		    synchronized (aClass200_8292) {
			class179
			    = (Class179) (aClass200_8292.method3785
					  (aLong8302 * -3535620521105803683L));
		    }
		}
		if (class179 == null
		    || class182.method3321(class179.method2928(), i_23_) != 0)
		    return null;
	    } else {
		Class186[] class186s = new Class186[is_24_.length];
		for (int i_44_ = 0; i_44_ < is_24_.length; i_44_++) {
		    int i_45_ = is_24_[i_44_];
		    Class2 class2 = null;
		    boolean bool_46_
			= i_44_ == 5 && bool_25_ || i_44_ == 3 && bool_26_;
		    if (0 != (i_45_ & 0x40000000)) {
			if (!bool_46_ && null != aClass2Array8296
			    && null != aClass2Array8296[i_44_])
			    class2 = aClass2Array8296[i_44_];
			Class186 class186
			    = ((Class8)
			       class40_sub22.method76(i_45_ & 0x3fffffff,
						      1802027831))
				  .method653(aBool8291, class2, -1810867420);
			if (class186 != null)
			    class186s[i_44_] = class186;
		    } else if ((i_45_ & ~0x7fffffff) != 0) {
			Class186 class186
			    = ((Class327)
			       class40_sub9.method76(i_45_ & 0x3fffffff,
						     -383763422))
				  .method5750(-1907309564);
			if (class186 != null)
			    class186s[i_44_] = class186;
		    }
		}
		if (null != class586 && class586.anIntArrayArray7755 != null) {
		    for (int i_47_ = 0;
			 i_47_ < class586.anIntArrayArray7755.length;
			 i_47_++) {
			if (class186s[i_47_] != null) {
			    int i_48_ = 0;
			    int i_49_ = 0;
			    int i_50_ = 0;
			    int i_51_ = 0;
			    int i_52_ = 0;
			    int i_53_ = 0;
			    if (class586.anIntArrayArray7755[i_47_] != null) {
				i_48_ = class586.anIntArrayArray7755[i_47_][0];
				i_49_ = class586.anIntArrayArray7755[i_47_][1];
				i_50_ = class586.anIntArrayArray7755[i_47_][2];
				i_51_ = (class586.anIntArrayArray7755[i_47_][3]
					 << 3);
				i_52_ = (class586.anIntArrayArray7755[i_47_][4]
					 << 3);
				i_53_ = (class586.anIntArrayArray7755[i_47_][5]
					 << 3);
			    }
			    if (0 != i_51_ || 0 != i_52_ || i_53_ != 0)
				class186s[i_47_].method3647(i_51_, i_52_,
							    i_53_);
			    if (i_48_ != 0 || 0 != i_49_ || i_50_ != 0)
				class186s[i_47_].method3633(i_48_, i_49_,
							    i_50_);
			}
		    }
		}
		Class186 class186 = new Class186(class186s, class186s.length);
		i_37_ |= 0x4000;
		class179 = class182.method3556(class186, i_37_,
					       1406950657 * Class325.anInt3557,
					       64, 850);
		for (int i_54_ = 0; i_54_ < 10; i_54_++) {
		    for (int i_55_ = 0;
			 (i_55_
			  < Class198_Sub18.aShortArrayArray9988[i_54_].length);
			 i_55_++) {
			if (anIntArray8301[i_54_]
			    < (Class525_Sub6.aShortArrayArrayArray10485[i_54_]
			       [i_55_]).length)
			    class179.method2971((Class198_Sub18
						 .aShortArrayArray9988[i_54_]
						 [i_55_]),
						(Class525_Sub6
						 .aShortArrayArrayArray10485
						 [i_54_][i_55_]
						 [anIntArray8301[i_54_]]));
		    }
		}
		for (int i_56_ = 0; i_56_ < 10; i_56_++) {
		    for (int i_57_ = 0;
			 i_57_ < Class477.aShortArrayArray5199[i_56_].length;
			 i_57_++) {
			if (anIntArray8298[i_56_]
			    < (Class522_Sub1.aShortArrayArrayArray10395[i_56_]
			       [i_57_]).length)
			    class179.method2973((Class477.aShortArrayArray5199
						 [i_56_][i_57_]),
						(Class522_Sub1
						 .aShortArrayArrayArray10395
						 [i_56_][i_57_]
						 [anIntArray8298[i_56_]]));
		    }
		}
		class179.method3003();
		if (bool) {
		    class179.method3010(i_23_);
		    synchronized (aClass200_8292) {
			aClass200_8292.method3788(class179, l);
		    }
		    aLong8302 = l * -4778301837496136203L;
		}
	    }
	}
	Class179 class179_58_ = class179.method2926((byte) 4, i_23_, true);
	if (!bool_32_ && !bool_35_)
	    return class179_58_;
	Class444[] class444s = null;
	if (null != class586)
	    class444s = class586.method9667((byte) 107);
	if (bool_35_ && class444s != null) {
	    for (int i_59_ = 0; i_59_ < is.length; i_59_++) {
		if (null != class444s[i_59_])
		    class179_58_.method2943(class444s[i_59_], 1 << i_59_,
					    true);
	    }
	}
	int i_60_ = 0;
	int i_61_ = 1;
	while (i_60_ < i_33_) {
	    if (class689s[i_60_] != null)
		class689s[i_60_].method14035(class179_58_, 0, i_61_,
					     -812209472);
	    i_60_++;
	    i_61_ <<= 1;
	}
	if (bool_35_) {
	    for (i_60_ = 0; i_60_ < is.length; i_60_++) {
		if (is[i_60_] != -1) {
		    i_61_ = is[i_60_] - i_21_;
		    i_61_ &= 0x3fff;
		    Class444 class444 = new Class444();
		    class444.method7141(0.0F, 1.0F, 0.0F,
					Class436.method7071(i_61_));
		    class179_58_.method2943(class444, 1 << i_60_, false);
		}
	    }
	}
	if (bool_35_ && null != class444s) {
	    for (i_60_ = 0; i_60_ < is.length; i_60_++) {
		if (null != class444s[i_60_])
		    class179_58_.method2943(class444s[i_60_], 1 << i_60_,
					    false);
	    }
	}
	if (class689 != null && null != class689_20_)
	    Class643.method10599(class179_58_, class689, class689_20_,
				 -2030553479);
	else if (null != class689)
	    class689.method14034(class179_58_, 0, 1612850611);
	else if (class689_20_ != null)
	    class689_20_.method14034(class179_58_, 0, 1818075288);
	return class179_58_;
    }
    
    public Class179 method10483
	(Class182 class182, int i, Class40_Sub9 class40_sub9,
	 Class40_Sub7 class40_sub7, Class40_Sub22 class40_sub22,
	 Interface20 interface20, Interface18 interface18, Class689 class689,
	 int i_62_) {
	if (-1 != anInt8300 * -1172437919)
	    return (((Class299) class40_sub7.method76(-1172437919 * anInt8300,
						      -415321930))
			.method5383
		    (class182, i, interface20, interface18, class689, null,
		     (byte) 16));
	int i_63_
	    = null != class689 ? i | class689.method14033(-1722991840) : i;
	Class179 class179;
	synchronized (aClass200_8305) {
	    class179 = ((Class179)
			aClass200_8305
			    .method3785(aLong8287 * -4390499680284671745L));
	}
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_63_) != 0) {
	    if (null != class179)
		i_63_ = class182.method3229(i_63_, class179.method2928());
	    int i_64_ = i_63_;
	    boolean bool = false;
	    for (int i_65_ = 0; i_65_ < anIntArray8295.length; i_65_++) {
		int i_66_ = anIntArray8295[i_65_];
		Class2 class2 = null;
		if ((i_66_ & 0x40000000) != 0) {
		    if (null != aClass2Array8296
			&& aClass2Array8296[i_65_] != null)
			class2 = aClass2Array8296[i_65_];
		    if (!((Class8) class40_sub22.method76(i_66_ & 0x3fffffff,
							  -349432621))
			     .method627(aBool8291, class2, -1688371569))
			bool = true;
		} else if ((i_66_ & ~0x7fffffff) != 0
			   && !((Class327)
				class40_sub9.method76(i_66_ & 0x3fffffff,
						      -204218168))
				   .method5749((byte) -78))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class186[] class186s = new Class186[anIntArray8295.length];
	    int i_67_ = 0;
	    for (int i_68_ = 0; i_68_ < anIntArray8295.length; i_68_++) {
		int i_69_ = anIntArray8295[i_68_];
		Class2 class2 = null;
		if (0 != (i_69_ & 0x40000000)) {
		    if (aClass2Array8296 != null
			&& null != aClass2Array8296[i_68_])
			class2 = aClass2Array8296[i_68_];
		    Class186 class186
			= ((Class8) class40_sub22.method76(i_69_ & 0x3fffffff,
							   846551429))
			      .method628(aBool8291, class2, -363287006);
		    if (null != class186)
			class186s[i_67_++] = class186;
		} else if (0 != (i_69_ & ~0x7fffffff)) {
		    Class186 class186
			= ((Class327) class40_sub9.method76(i_69_ & 0x3fffffff,
							    -321727739))
			      .method5752(-759132226);
		    if (null != class186)
			class186s[i_67_++] = class186;
		}
	    }
	    Class186 class186 = new Class186(class186s, i_67_);
	    i_64_ |= 0x4000;
	    class179 = class182.method3556(class186, i_64_,
					   Class325.anInt3557 * 1406950657, 64,
					   768);
	    for (int i_70_ = 0; i_70_ < 10; i_70_++) {
		for (int i_71_ = 0;
		     i_71_ < Class198_Sub18.aShortArrayArray9988[i_70_].length;
		     i_71_++) {
		    if (anIntArray8301[i_70_]
			< (Class525_Sub6.aShortArrayArrayArray10485[i_70_]
			   [i_71_]).length)
			class179.method2971((Class198_Sub18
					     .aShortArrayArray9988[i_70_]
					     [i_71_]),
					    (Class525_Sub6
					     .aShortArrayArrayArray10485[i_70_]
					     [i_71_][anIntArray8301[i_70_]]));
		}
	    }
	    for (int i_72_ = 0; i_72_ < 10; i_72_++) {
		for (int i_73_ = 0;
		     i_73_ < Class477.aShortArrayArray5199[i_72_].length;
		     i_73_++) {
		    if (anIntArray8298[i_72_]
			< (Class522_Sub1.aShortArrayArrayArray10395[i_72_]
			   [i_73_]).length)
			class179.method2973((Class477.aShortArrayArray5199
					     [i_72_][i_73_]),
					    (Class522_Sub1
					     .aShortArrayArrayArray10395[i_72_]
					     [i_73_][anIntArray8298[i_72_]]));
		}
	    }
	    class179.method3010(i_63_);
	    synchronized (aClass200_8305) {
		aClass200_8305.method3788(class179,
					  -4390499680284671745L * aLong8287);
	    }
	}
	if (null == class689)
	    return class179;
	Class179 class179_74_ = class179.method2926((byte) 4, i_63_, true);
	class689.method14034(class179_74_, 0, 1693883446);
	return class179_74_;
    }
    
    public static void method10484() {
	synchronized (aClass200_8292) {
	    aClass200_8292.method3791((byte) 39);
	}
	synchronized (aClass200_8305) {
	    aClass200_8305.method3791((byte) -9);
	}
    }
    
    public void method10485(int i, int i_75_, byte i_76_) {
	anIntArray8301[i] = i_75_;
	method10481((byte) 7);
    }
    
    public void method10486(int i, int[] is, Class2[] class2s, int[] is_77_,
			    int[] is_78_, boolean bool, int i_79_) {
	if (anInt8294 * 2129432397 != i)
	    anInt8294 = -871153275 * i;
	anIntArray8295 = is;
	aClass2Array8296 = class2s;
	anIntArray8301 = is_77_;
	anIntArray8298 = is_78_;
	aBool8291 = bool;
	anInt8300 = 1204264865 * i_79_;
	method10481((byte) -17);
    }
    
    public void method10487(int i, int[] is, Class2[] class2s, int[] is_80_,
			    int[] is_81_, boolean bool, int i_82_) {
	if (anInt8294 * 2129432397 != i)
	    anInt8294 = -871153275 * i;
	anIntArray8295 = is;
	aClass2Array8296 = class2s;
	anIntArray8301 = is_80_;
	anIntArray8298 = is_81_;
	aBool8291 = bool;
	anInt8300 = 1204264865 * i_82_;
	method10481((byte) -60);
    }
    
    public void method10488(int i, int[] is, Class2[] class2s, int[] is_83_,
			    int[] is_84_, boolean bool, int i_85_) {
	if (anInt8294 * 2129432397 != i)
	    anInt8294 = -871153275 * i;
	anIntArray8295 = is;
	aClass2Array8296 = class2s;
	anIntArray8301 = is_83_;
	anIntArray8298 = is_84_;
	aBool8291 = bool;
	anInt8300 = 1204264865 * i_85_;
	method10481((byte) 70);
    }
    
    public void method10489(int i, int i_86_) {
	anIntArray8301[i] = i_86_;
	method10481((byte) -18);
    }
    
    public void method10490(int i, int i_87_) {
	anIntArray8301[i] = i_87_;
	method10481((byte) 14);
    }
    
    public void method10491(int i, int i_88_) {
	anIntArray8298[i] = i_88_;
	method10481((byte) 43);
    }
    
    public void method10492(int i, int i_89_) {
	anIntArray8298[i] = i_89_;
	method10481((byte) -82);
    }
    
    public static void method10493() {
	synchronized (aClass200_8292) {
	    aClass200_8292.method3791((byte) -5);
	}
	synchronized (aClass200_8305) {
	    aClass200_8305.method3791((byte) 84);
	}
    }
    
    public void method10494(int i, int i_90_, Class40_Sub22 class40_sub22) {
	if (i_90_ == -1)
	    anIntArray8295[i] = 0;
	else if (class40_sub22.method76(i_90_, -1482185621) != null) {
	    anIntArray8295[i] = i_90_ | 0x40000000;
	    method10481((byte) -49);
	}
    }
    
    public Class179 method10495(Class182 class182, int i,
				Class40_Sub9 class40_sub9,
				Class40_Sub8 class40_sub8, Class689 class689,
				int i_91_, int i_92_, int i_93_) {
	int i_94_
	    = null != class689 ? i | class689.method14033(-223533996) : i;
	long l = (long) i_93_ << 32 | (long) (i_92_ << 16) | (long) i_91_;
	Class179 class179;
	synchronized (aClass200_8305) {
	    class179 = (Class179) aClass200_8305.method3785(l);
	}
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_94_) != 0) {
	    if (class179 != null)
		i_94_ = class182.method3229(i_94_, class179.method2928());
	    int i_95_ = i_94_;
	    Class186[] class186s = new Class186[3];
	    int i_96_ = 0;
	    if (((Class327) class40_sub9.method76(i_91_, 336810746))
		    .method5749((byte) -122)
		&& ((Class327) class40_sub9.method76(i_92_, -458799653))
		       .method5749((byte) -97)
		&& ((Class327) class40_sub9.method76(i_93_, -477100292))
		       .method5749((byte) -40)) {
		Class186 class186
		    = ((Class327) class40_sub9.method76(i_91_, -1779137639))
			  .method5752(-1572048246);
		if (class186 != null)
		    class186s[i_96_++] = class186;
		class186
		    = ((Class327) class40_sub9.method76(i_92_, -1629613044))
			  .method5752(-1392677754);
		if (class186 != null)
		    class186s[i_96_++] = class186;
		class186 = ((Class327) class40_sub9.method76(i_93_, 410598466))
			       .method5752(-946782933);
		if (class186 != null)
		    class186s[i_96_++] = class186;
		class186 = new Class186(class186s, i_96_);
		i_95_ |= 0x4000;
		class179 = class182.method3556(class186, i_95_,
					       Class325.anInt3557 * 1406950657,
					       64, 768);
		for (int i_97_ = 0; i_97_ < 10; i_97_++) {
		    for (int i_98_ = 0;
			 (i_98_
			  < Class198_Sub18.aShortArrayArray9988[i_97_].length);
			 i_98_++) {
			if (anIntArray8301[i_97_]
			    < (Class525_Sub6.aShortArrayArrayArray10485[i_97_]
			       [i_98_]).length)
			    class179.method2971((Class198_Sub18
						 .aShortArrayArray9988[i_97_]
						 [i_98_]),
						(Class525_Sub6
						 .aShortArrayArrayArray10485
						 [i_97_][i_98_]
						 [anIntArray8301[i_97_]]));
		    }
		}
		for (int i_99_ = 0; i_99_ < 10; i_99_++) {
		    for (int i_100_ = 0;
			 i_100_ < Class477.aShortArrayArray5199[i_99_].length;
			 i_100_++) {
			if (anIntArray8298[i_99_]
			    < (Class522_Sub1.aShortArrayArrayArray10395[i_99_]
			       [i_100_]).length)
			    class179.method2973((Class477.aShortArrayArray5199
						 [i_99_][i_100_]),
						(Class522_Sub1
						 .aShortArrayArrayArray10395
						 [i_99_][i_100_]
						 [anIntArray8298[i_99_]]));
		    }
		}
		class179.method3010(i_94_);
		synchronized (aClass200_8305) {
		    aClass200_8305.method3788(class179, l);
		}
	    } else
		return null;
	}
	if (null == class689)
	    return class179;
	class179 = class179.method2926((byte) 4, i_94_, true);
	class689.method14034(class179, 0, 1674740612);
	return class179;
    }
    
    public void method10496(int i, int i_101_, Class40_Sub22 class40_sub22) {
	if (i_101_ == -1)
	    anIntArray8295[i] = 0;
	else if (class40_sub22.method76(i_101_, -1183594275) != null) {
	    anIntArray8295[i] = i_101_ | 0x40000000;
	    method10481((byte) -13);
	}
    }
    
    public Class179 method10497(Class182 class182, int i,
				Class40_Sub9 class40_sub9,
				Class40_Sub8 class40_sub8, Class689 class689,
				int i_102_, int i_103_, int i_104_) {
	int i_105_
	    = null != class689 ? i | class689.method14033(-960541402) : i;
	long l = (long) i_104_ << 32 | (long) (i_103_ << 16) | (long) i_102_;
	Class179 class179;
	synchronized (aClass200_8305) {
	    class179 = (Class179) aClass200_8305.method3785(l);
	}
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_105_) != 0) {
	    if (class179 != null)
		i_105_ = class182.method3229(i_105_, class179.method2928());
	    int i_106_ = i_105_;
	    Class186[] class186s = new Class186[3];
	    int i_107_ = 0;
	    if (((Class327) class40_sub9.method76(i_102_, -1152743103))
		    .method5749((byte) -108)
		&& ((Class327) class40_sub9.method76(i_103_, -1777498448))
		       .method5749((byte) -105)
		&& ((Class327) class40_sub9.method76(i_104_, 687889154))
		       .method5749((byte) -46)) {
		Class186 class186
		    = ((Class327) class40_sub9.method76(i_102_, 2132233721))
			  .method5752(-1402784568);
		if (class186 != null)
		    class186s[i_107_++] = class186;
		class186
		    = ((Class327) class40_sub9.method76(i_103_, 390799516))
			  .method5752(361637957);
		if (class186 != null)
		    class186s[i_107_++] = class186;
		class186
		    = ((Class327) class40_sub9.method76(i_104_, -501416271))
			  .method5752(-1601187203);
		if (class186 != null)
		    class186s[i_107_++] = class186;
		class186 = new Class186(class186s, i_107_);
		i_106_ |= 0x4000;
		class179 = class182.method3556(class186, i_106_,
					       Class325.anInt3557 * 1406950657,
					       64, 768);
		for (int i_108_ = 0; i_108_ < 10; i_108_++) {
		    for (int i_109_ = 0;
			 i_109_ < (Class198_Sub18.aShortArrayArray9988
				   [i_108_]).length;
			 i_109_++) {
			if (anIntArray8301[i_108_]
			    < (Class525_Sub6.aShortArrayArrayArray10485[i_108_]
			       [i_109_]).length)
			    class179.method2971((Class198_Sub18
						 .aShortArrayArray9988[i_108_]
						 [i_109_]),
						(Class525_Sub6
						 .aShortArrayArrayArray10485
						 [i_108_][i_109_]
						 [anIntArray8301[i_108_]]));
		    }
		}
		for (int i_110_ = 0; i_110_ < 10; i_110_++) {
		    for (int i_111_ = 0;
			 i_111_ < Class477.aShortArrayArray5199[i_110_].length;
			 i_111_++) {
			if (anIntArray8298[i_110_]
			    < (Class522_Sub1.aShortArrayArrayArray10395[i_110_]
			       [i_111_]).length)
			    class179.method2973((Class477.aShortArrayArray5199
						 [i_110_][i_111_]),
						(Class522_Sub1
						 .aShortArrayArrayArray10395
						 [i_110_][i_111_]
						 [anIntArray8298[i_110_]]));
		    }
		}
		class179.method3010(i_105_);
		synchronized (aClass200_8305) {
		    aClass200_8305.method3788(class179, l);
		}
	    } else
		return null;
	}
	if (null == class689)
	    return class179;
	class179 = class179.method2926((byte) 4, i_105_, true);
	class689.method14034(class179, 0, 1980877225);
	return class179;
    }
    
    public Class179 method10498
	(Class182 class182, int i, Class40_Sub9 class40_sub9,
	 Class40_Sub7 class40_sub7, Class40_Sub22 class40_sub22,
	 Interface20 interface20, Interface18 interface18, Class689 class689) {
	if (-1 != anInt8300 * -1172437919)
	    return (((Class299) class40_sub7.method76(-1172437919 * anInt8300,
						      1290533864))
			.method5383
		    (class182, i, interface20, interface18, class689, null,
		     (byte) 9));
	int i_112_
	    = null != class689 ? i | class689.method14033(1850491810) : i;
	Class179 class179;
	synchronized (aClass200_8305) {
	    class179 = ((Class179)
			aClass200_8305
			    .method3785(aLong8287 * -4390499680284671745L));
	}
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_112_) != 0) {
	    if (null != class179)
		i_112_ = class182.method3229(i_112_, class179.method2928());
	    int i_113_ = i_112_;
	    boolean bool = false;
	    for (int i_114_ = 0; i_114_ < anIntArray8295.length; i_114_++) {
		int i_115_ = anIntArray8295[i_114_];
		Class2 class2 = null;
		if ((i_115_ & 0x40000000) != 0) {
		    if (null != aClass2Array8296
			&& aClass2Array8296[i_114_] != null)
			class2 = aClass2Array8296[i_114_];
		    if (!((Class8) class40_sub22.method76(i_115_ & 0x3fffffff,
							  1111716136))
			     .method627(aBool8291, class2, 71403402))
			bool = true;
		} else if ((i_115_ & ~0x7fffffff) != 0
			   && !((Class327)
				class40_sub9.method76(i_115_ & 0x3fffffff,
						      -1882627936))
				   .method5749((byte) -68))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class186[] class186s = new Class186[anIntArray8295.length];
	    int i_116_ = 0;
	    for (int i_117_ = 0; i_117_ < anIntArray8295.length; i_117_++) {
		int i_118_ = anIntArray8295[i_117_];
		Class2 class2 = null;
		if (0 != (i_118_ & 0x40000000)) {
		    if (aClass2Array8296 != null
			&& null != aClass2Array8296[i_117_])
			class2 = aClass2Array8296[i_117_];
		    Class186 class186
			= ((Class8) class40_sub22.method76(i_118_ & 0x3fffffff,
							   134148314))
			      .method628(aBool8291, class2, -653724689);
		    if (null != class186)
			class186s[i_116_++] = class186;
		} else if (0 != (i_118_ & ~0x7fffffff)) {
		    Class186 class186
			= ((Class327)
			   class40_sub9.method76(i_118_ & 0x3fffffff,
						 -1827000606))
			      .method5752(671261267);
		    if (null != class186)
			class186s[i_116_++] = class186;
		}
	    }
	    Class186 class186 = new Class186(class186s, i_116_);
	    i_113_ |= 0x4000;
	    class179 = class182.method3556(class186, i_113_,
					   Class325.anInt3557 * 1406950657, 64,
					   768);
	    for (int i_119_ = 0; i_119_ < 10; i_119_++) {
		for (int i_120_ = 0;
		     (i_120_
		      < Class198_Sub18.aShortArrayArray9988[i_119_].length);
		     i_120_++) {
		    if (anIntArray8301[i_119_]
			< (Class525_Sub6.aShortArrayArrayArray10485[i_119_]
			   [i_120_]).length)
			class179.method2971((Class198_Sub18
					     .aShortArrayArray9988[i_119_]
					     [i_120_]),
					    (Class525_Sub6
					     .aShortArrayArrayArray10485
					     [i_119_][i_120_]
					     [anIntArray8301[i_119_]]));
		}
	    }
	    for (int i_121_ = 0; i_121_ < 10; i_121_++) {
		for (int i_122_ = 0;
		     i_122_ < Class477.aShortArrayArray5199[i_121_].length;
		     i_122_++) {
		    if (anIntArray8298[i_121_]
			< (Class522_Sub1.aShortArrayArrayArray10395[i_121_]
			   [i_122_]).length)
			class179.method2973((Class477.aShortArrayArray5199
					     [i_121_][i_122_]),
					    (Class522_Sub1
					     .aShortArrayArrayArray10395
					     [i_121_][i_122_]
					     [anIntArray8298[i_121_]]));
		}
	    }
	    class179.method3010(i_112_);
	    synchronized (aClass200_8305) {
		aClass200_8305.method3788(class179,
					  -4390499680284671745L * aLong8287);
	    }
	}
	if (null == class689)
	    return class179;
	Class179 class179_123_ = class179.method2926((byte) 4, i_112_, true);
	class689.method14034(class179_123_, 0, 1823758614);
	return class179_123_;
    }
    
    public Class179 method10499
	(Class182 class182, int i, Class40_Sub9 class40_sub9,
	 Class40_Sub7 class40_sub7, Class40_Sub22 class40_sub22,
	 Interface20 interface20, Interface18 interface18, Class689 class689) {
	if (-1 != anInt8300 * -1172437919)
	    return (((Class299) class40_sub7.method76(-1172437919 * anInt8300,
						      -1803462276))
			.method5383
		    (class182, i, interface20, interface18, class689, null,
		     (byte) 69));
	int i_124_
	    = null != class689 ? i | class689.method14033(1214033769) : i;
	Class179 class179;
	synchronized (aClass200_8305) {
	    class179 = ((Class179)
			aClass200_8305
			    .method3785(aLong8287 * -4390499680284671745L));
	}
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_124_) != 0) {
	    if (null != class179)
		i_124_ = class182.method3229(i_124_, class179.method2928());
	    int i_125_ = i_124_;
	    boolean bool = false;
	    for (int i_126_ = 0; i_126_ < anIntArray8295.length; i_126_++) {
		int i_127_ = anIntArray8295[i_126_];
		Class2 class2 = null;
		if ((i_127_ & 0x40000000) != 0) {
		    if (null != aClass2Array8296
			&& aClass2Array8296[i_126_] != null)
			class2 = aClass2Array8296[i_126_];
		    if (!((Class8) class40_sub22.method76(i_127_ & 0x3fffffff,
							  712123112))
			     .method627(aBool8291, class2, 297746684))
			bool = true;
		} else if ((i_127_ & ~0x7fffffff) != 0
			   && !((Class327)
				class40_sub9.method76(i_127_ & 0x3fffffff,
						      -1029302037))
				   .method5749((byte) -20))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class186[] class186s = new Class186[anIntArray8295.length];
	    int i_128_ = 0;
	    for (int i_129_ = 0; i_129_ < anIntArray8295.length; i_129_++) {
		int i_130_ = anIntArray8295[i_129_];
		Class2 class2 = null;
		if (0 != (i_130_ & 0x40000000)) {
		    if (aClass2Array8296 != null
			&& null != aClass2Array8296[i_129_])
			class2 = aClass2Array8296[i_129_];
		    Class186 class186
			= ((Class8) class40_sub22.method76(i_130_ & 0x3fffffff,
							   57874830))
			      .method628(aBool8291, class2, -1338844141);
		    if (null != class186)
			class186s[i_128_++] = class186;
		} else if (0 != (i_130_ & ~0x7fffffff)) {
		    Class186 class186
			= ((Class327)
			   class40_sub9.method76(i_130_ & 0x3fffffff,
						 -1563601710))
			      .method5752(-1134283744);
		    if (null != class186)
			class186s[i_128_++] = class186;
		}
	    }
	    Class186 class186 = new Class186(class186s, i_128_);
	    i_125_ |= 0x4000;
	    class179 = class182.method3556(class186, i_125_,
					   Class325.anInt3557 * 1406950657, 64,
					   768);
	    for (int i_131_ = 0; i_131_ < 10; i_131_++) {
		for (int i_132_ = 0;
		     (i_132_
		      < Class198_Sub18.aShortArrayArray9988[i_131_].length);
		     i_132_++) {
		    if (anIntArray8301[i_131_]
			< (Class525_Sub6.aShortArrayArrayArray10485[i_131_]
			   [i_132_]).length)
			class179.method2971((Class198_Sub18
					     .aShortArrayArray9988[i_131_]
					     [i_132_]),
					    (Class525_Sub6
					     .aShortArrayArrayArray10485
					     [i_131_][i_132_]
					     [anIntArray8301[i_131_]]));
		}
	    }
	    for (int i_133_ = 0; i_133_ < 10; i_133_++) {
		for (int i_134_ = 0;
		     i_134_ < Class477.aShortArrayArray5199[i_133_].length;
		     i_134_++) {
		    if (anIntArray8298[i_133_]
			< (Class522_Sub1.aShortArrayArrayArray10395[i_133_]
			   [i_134_]).length)
			class179.method2973((Class477.aShortArrayArray5199
					     [i_133_][i_134_]),
					    (Class522_Sub1
					     .aShortArrayArrayArray10395
					     [i_133_][i_134_]
					     [anIntArray8298[i_133_]]));
		}
	    }
	    class179.method3010(i_124_);
	    synchronized (aClass200_8305) {
		aClass200_8305.method3788(class179,
					  -4390499680284671745L * aLong8287);
	    }
	}
	if (null == class689)
	    return class179;
	Class179 class179_135_ = class179.method2926((byte) 4, i_124_, true);
	class689.method14034(class179_135_, 0, 1943012703);
	return class179_135_;
    }
    
    public Class179 method10500
	(Class182 class182, int i, Class40_Sub9 class40_sub9,
	 Class40_Sub7 class40_sub7, Class40_Sub22 class40_sub22,
	 Interface20 interface20, Interface18 interface18, Class689 class689) {
	if (-1 != anInt8300 * -1172437919)
	    return (((Class299) class40_sub7.method76(-1172437919 * anInt8300,
						      1639071662))
			.method5383
		    (class182, i, interface20, interface18, class689, null,
		     (byte) 22));
	int i_136_
	    = null != class689 ? i | class689.method14033(302951731) : i;
	Class179 class179;
	synchronized (aClass200_8305) {
	    class179 = ((Class179)
			aClass200_8305
			    .method3785(aLong8287 * -4390499680284671745L));
	}
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_136_) != 0) {
	    if (null != class179)
		i_136_ = class182.method3229(i_136_, class179.method2928());
	    int i_137_ = i_136_;
	    boolean bool = false;
	    for (int i_138_ = 0; i_138_ < anIntArray8295.length; i_138_++) {
		int i_139_ = anIntArray8295[i_138_];
		Class2 class2 = null;
		if ((i_139_ & 0x40000000) != 0) {
		    if (null != aClass2Array8296
			&& aClass2Array8296[i_138_] != null)
			class2 = aClass2Array8296[i_138_];
		    if (!((Class8) class40_sub22.method76(i_139_ & 0x3fffffff,
							  1777610607))
			     .method627(aBool8291, class2, -1970547377))
			bool = true;
		} else if ((i_139_ & ~0x7fffffff) != 0
			   && !((Class327)
				class40_sub9.method76(i_139_ & 0x3fffffff,
						      1103031842))
				   .method5749((byte) -80))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class186[] class186s = new Class186[anIntArray8295.length];
	    int i_140_ = 0;
	    for (int i_141_ = 0; i_141_ < anIntArray8295.length; i_141_++) {
		int i_142_ = anIntArray8295[i_141_];
		Class2 class2 = null;
		if (0 != (i_142_ & 0x40000000)) {
		    if (aClass2Array8296 != null
			&& null != aClass2Array8296[i_141_])
			class2 = aClass2Array8296[i_141_];
		    Class186 class186
			= ((Class8) class40_sub22.method76(i_142_ & 0x3fffffff,
							   -1825269347))
			      .method628(aBool8291, class2, -1427146784);
		    if (null != class186)
			class186s[i_140_++] = class186;
		} else if (0 != (i_142_ & ~0x7fffffff)) {
		    Class186 class186
			= ((Class327)
			   class40_sub9.method76(i_142_ & 0x3fffffff,
						 845907916))
			      .method5752(-1702565161);
		    if (null != class186)
			class186s[i_140_++] = class186;
		}
	    }
	    Class186 class186 = new Class186(class186s, i_140_);
	    i_137_ |= 0x4000;
	    class179 = class182.method3556(class186, i_137_,
					   Class325.anInt3557 * 1406950657, 64,
					   768);
	    for (int i_143_ = 0; i_143_ < 10; i_143_++) {
		for (int i_144_ = 0;
		     (i_144_
		      < Class198_Sub18.aShortArrayArray9988[i_143_].length);
		     i_144_++) {
		    if (anIntArray8301[i_143_]
			< (Class525_Sub6.aShortArrayArrayArray10485[i_143_]
			   [i_144_]).length)
			class179.method2971((Class198_Sub18
					     .aShortArrayArray9988[i_143_]
					     [i_144_]),
					    (Class525_Sub6
					     .aShortArrayArrayArray10485
					     [i_143_][i_144_]
					     [anIntArray8301[i_143_]]));
		}
	    }
	    for (int i_145_ = 0; i_145_ < 10; i_145_++) {
		for (int i_146_ = 0;
		     i_146_ < Class477.aShortArrayArray5199[i_145_].length;
		     i_146_++) {
		    if (anIntArray8298[i_145_]
			< (Class522_Sub1.aShortArrayArrayArray10395[i_145_]
			   [i_146_]).length)
			class179.method2973((Class477.aShortArrayArray5199
					     [i_145_][i_146_]),
					    (Class522_Sub1
					     .aShortArrayArrayArray10395
					     [i_145_][i_146_]
					     [anIntArray8298[i_145_]]));
		}
	    }
	    class179.method3010(i_136_);
	    synchronized (aClass200_8305) {
		aClass200_8305.method3788(class179,
					  -4390499680284671745L * aLong8287);
	    }
	}
	if (null == class689)
	    return class179;
	Class179 class179_147_ = class179.method2926((byte) 4, i_136_, true);
	class689.method14034(class179_147_, 0, 1518440704);
	return class179_147_;
    }
    
    public void method10501(int i, int i_148_) {
	anIntArray8298[i] = i_148_;
	method10481((byte) 77);
    }
    
    public static void method10502() {
	synchronized (aClass200_8292) {
	    aClass200_8292.method3791((byte) -93);
	}
	synchronized (aClass200_8305) {
	    aClass200_8305.method3791((byte) -7);
	}
    }
    
    public static void method10503(int i) {
	Class325.anInt3557 = -1595104511 * i;
	synchronized (aClass200_8305) {
	    aClass200_8305.method3791((byte) -86);
	}
	synchronized (aClass200_8292) {
	    aClass200_8292.method3791((byte) 75);
	}
    }
    
    static {
	aClass200_8292 = new Class200(260);
	aClass200_8305 = new Class200(5);
    }
    
    public static int method10504() {
	synchronized (aClass200_8292) {
	    int i = aClass200_8292.method3794(24985313);
	    return i;
	}
    }
    
    public static void method10505(int i) {
	Class325.anInt3557 = -1595104511 * i;
	synchronized (aClass200_8305) {
	    aClass200_8305.method3791((byte) 7);
	}
	synchronized (aClass200_8292) {
	    aClass200_8292.method3791((byte) 4);
	}
    }
    
    public Class179 method10506
	(Class182 class182, int i, Class40_Sub9 class40_sub9,
	 Class40_Sub8 class40_sub8, Class689 class689, int i_149_, int i_150_,
	 int i_151_, int i_152_) {
	int i_153_
	    = null != class689 ? i | class689.method14033(137991884) : i;
	long l = (long) i_151_ << 32 | (long) (i_150_ << 16) | (long) i_149_;
	Class179 class179;
	synchronized (aClass200_8305) {
	    class179 = (Class179) aClass200_8305.method3785(l);
	}
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_153_) != 0) {
	    if (class179 != null)
		i_153_ = class182.method3229(i_153_, class179.method2928());
	    int i_154_ = i_153_;
	    Class186[] class186s = new Class186[3];
	    int i_155_ = 0;
	    if (((Class327) class40_sub9.method76(i_149_, -1231273828))
		    .method5749((byte) -97)
		&& ((Class327) class40_sub9.method76(i_150_, 1219993561))
		       .method5749((byte) -83)
		&& ((Class327) class40_sub9.method76(i_151_, -2070860937))
		       .method5749((byte) -20)) {
		Class186 class186
		    = ((Class327) class40_sub9.method76(i_149_, 837684512))
			  .method5752(459390431);
		if (class186 != null)
		    class186s[i_155_++] = class186;
		class186
		    = ((Class327) class40_sub9.method76(i_150_, -1363626613))
			  .method5752(-1422679549);
		if (class186 != null)
		    class186s[i_155_++] = class186;
		class186
		    = ((Class327) class40_sub9.method76(i_151_, 1412586410))
			  .method5752(-2118504597);
		if (class186 != null)
		    class186s[i_155_++] = class186;
		class186 = new Class186(class186s, i_155_);
		i_154_ |= 0x4000;
		class179 = class182.method3556(class186, i_154_,
					       Class325.anInt3557 * 1406950657,
					       64, 768);
		for (int i_156_ = 0; i_156_ < 10; i_156_++) {
		    for (int i_157_ = 0;
			 i_157_ < (Class198_Sub18.aShortArrayArray9988
				   [i_156_]).length;
			 i_157_++) {
			if (anIntArray8301[i_156_]
			    < (Class525_Sub6.aShortArrayArrayArray10485[i_156_]
			       [i_157_]).length)
			    class179.method2971((Class198_Sub18
						 .aShortArrayArray9988[i_156_]
						 [i_157_]),
						(Class525_Sub6
						 .aShortArrayArrayArray10485
						 [i_156_][i_157_]
						 [anIntArray8301[i_156_]]));
		    }
		}
		for (int i_158_ = 0; i_158_ < 10; i_158_++) {
		    for (int i_159_ = 0;
			 i_159_ < Class477.aShortArrayArray5199[i_158_].length;
			 i_159_++) {
			if (anIntArray8298[i_158_]
			    < (Class522_Sub1.aShortArrayArrayArray10395[i_158_]
			       [i_159_]).length)
			    class179.method2973((Class477.aShortArrayArray5199
						 [i_158_][i_159_]),
						(Class522_Sub1
						 .aShortArrayArrayArray10395
						 [i_158_][i_159_]
						 [anIntArray8298[i_158_]]));
		    }
		}
		class179.method3010(i_153_);
		synchronized (aClass200_8305) {
		    aClass200_8305.method3788(class179, l);
		}
	    } else
		return null;
	}
	if (null == class689)
	    return class179;
	class179 = class179.method2926((byte) 4, i_153_, true);
	class689.method14034(class179, 0, 1709646179);
	return class179;
    }
    
    public static void method10507(int i) {
	synchronized (aClass200_8292) {
	    aClass200_8292.method3805(i, 1942390843);
	}
	synchronized (aClass200_8305) {
	    aClass200_8305.method3805(i, 1853901365);
	}
    }
    
    public static void method10508() {
	synchronized (aClass200_8292) {
	    aClass200_8292.method3791((byte) -54);
	}
	synchronized (aClass200_8305) {
	    aClass200_8305.method3791((byte) 26);
	}
    }
    
    public static void method10509() {
	synchronized (aClass200_8292) {
	    aClass200_8292.method3791((byte) -21);
	}
	synchronized (aClass200_8305) {
	    aClass200_8305.method3791((byte) -36);
	}
    }
    
    public void method10510(int i, int i_160_, Class40_Sub22 class40_sub22) {
	if (i_160_ == -1)
	    anIntArray8295[i] = 0;
	else if (class40_sub22.method76(i_160_, -1324917295) != null) {
	    anIntArray8295[i] = i_160_ | 0x40000000;
	    method10481((byte) 59);
	}
    }
    
    void method10511() {
	long[] ls = RSBuffer.aLongArray10833;
	aLong8287 = -4934863201018085119L;
	aLong8287 = (4934863201018085119L
		     * (aLong8287 * -4390499680284671745L >>> 8
			^ ls[(int) ((-4390499680284671745L * aLong8287
				     ^ (long) (2129432397 * anInt8294 >> 8))
				    & 0xffL)]));
	aLong8287 = (4934863201018085119L
		     * (-4390499680284671745L * aLong8287 >>> 8
			^ ls[(int) ((aLong8287 * -4390499680284671745L
				     ^ (long) (2129432397 * anInt8294))
				    & 0xffL)]));
	for (int i = 0; i < anIntArray8295.length; i++) {
	    aLong8287 = (aLong8287 * -4390499680284671745L >>> 8
			 ^ ls[(int) ((aLong8287 * -4390499680284671745L
				      ^ (long) (anIntArray8295[i] >> 24))
				     & 0xffL)]) * 4934863201018085119L;
	    aLong8287 = (4934863201018085119L
			 * (aLong8287 * -4390499680284671745L >>> 8
			    ^ ls[(int) ((-4390499680284671745L * aLong8287
					 ^ (long) (anIntArray8295[i] >> 16))
					& 0xffL)]));
	    aLong8287 = (4934863201018085119L
			 * (aLong8287 * -4390499680284671745L >>> 8
			    ^ ls[(int) ((aLong8287 * -4390499680284671745L
					 ^ (long) (anIntArray8295[i] >> 8))
					& 0xffL)]));
	    aLong8287 = (4934863201018085119L
			 * (-4390499680284671745L * aLong8287 >>> 8
			    ^ ls[(int) ((aLong8287 * -4390499680284671745L
					 ^ (long) anIntArray8295[i])
					& 0xffL)]));
	}
	if (aClass2Array8296 != null) {
	    for (int i = 0; i < aClass2Array8296.length; i++) {
		if (aClass2Array8296[i] != null) {
		    int[] is;
		    int[] is_161_;
		    if (aBool8291) {
			is = aClass2Array8296[i].anIntArray16;
			is_161_ = aClass2Array8296[i].anIntArray23;
		    } else {
			is = aClass2Array8296[i].anIntArray22;
			is_161_ = aClass2Array8296[i].anIntArray15;
		    }
		    if (null != is) {
			for (int i_162_ = 0; i_162_ < is.length; i_162_++) {
			    aLong8287
				= (4934863201018085119L
				   * (-4390499680284671745L * aLong8287 >>> 8
				      ^ ls[(int) (((-4390499680284671745L
						    * aLong8287)
						   ^ (long) (is[i_162_] >> 8))
						  & 0xffL)]));
			    aLong8287
				= ((aLong8287 * -4390499680284671745L >>> 8
				    ^ ls[(int) (((-4390499680284671745L
						  * aLong8287)
						 ^ (long) is[i_162_])
						& 0xffL)])
				   * 4934863201018085119L);
			}
		    }
		    if (is_161_ != null) {
			for (int i_163_ = 0; i_163_ < is_161_.length;
			     i_163_++) {
			    aLong8287
				= (4934863201018085119L
				   * (aLong8287 * -4390499680284671745L >>> 8
				      ^ ls[(int) (((aLong8287
						    * -4390499680284671745L)
						   ^ (long) (is_161_[i_163_]
							     >> 8))
						  & 0xffL)]));
			    aLong8287
				= (4934863201018085119L
				   * (-4390499680284671745L * aLong8287 >>> 8
				      ^ ls[(int) (((aLong8287
						    * -4390499680284671745L)
						   ^ (long) is_161_[i_163_])
						  & 0xffL)]));
			}
		    }
		    if (null != aClass2Array8296[i].aShortArray24) {
			for (int i_164_ = 0;
			     i_164_ < aClass2Array8296[i].aShortArray24.length;
			     i_164_++) {
			    aLong8287
				= (4934863201018085119L
				   * (-4390499680284671745L * aLong8287 >>> 8
				      ^ ls[(int) (((aLong8287
						    * -4390499680284671745L)
						   ^ (long) ((aClass2Array8296
							      [i].aShortArray24
							      [i_164_])
							     >> 8))
						  & 0xffL)]));
			    aLong8287
				= (4934863201018085119L
				   * (aLong8287 * -4390499680284671745L >>> 8
				      ^ ls[(int) (((-4390499680284671745L
						    * aLong8287)
						   ^ (long) (aClass2Array8296
							     [i].aShortArray24
							     [i_164_]))
						  & 0xffL)]));
			}
		    }
		    if (aClass2Array8296[i].aShortArray21 != null) {
			for (int i_165_ = 0;
			     i_165_ < aClass2Array8296[i].aShortArray21.length;
			     i_165_++) {
			    aLong8287
				= ((aLong8287 * -4390499680284671745L >>> 8
				    ^ ls[(int) (((-4390499680284671745L
						  * aLong8287)
						 ^ (long) ((aClass2Array8296[i]
							    .aShortArray21
							    [i_165_])
							   >> 8))
						& 0xffL)])
				   * 4934863201018085119L);
			    aLong8287
				= ((-4390499680284671745L * aLong8287 >>> 8
				    ^ ls[(int) (((-4390499680284671745L
						  * aLong8287)
						 ^ (long) (aClass2Array8296[i]
							   .aShortArray21
							   [i_165_]))
						& 0xffL)])
				   * 4934863201018085119L);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 10; i++)
	    aLong8287 = (-4390499680284671745L * aLong8287 >>> 8
			 ^ ls[(int) ((aLong8287 * -4390499680284671745L
				      ^ (long) anIntArray8301[i])
				     & 0xffL)]) * 4934863201018085119L;
	for (int i = 0; i < 10; i++)
	    aLong8287 = (aLong8287 * -4390499680284671745L >>> 8
			 ^ ls[(int) ((aLong8287 * -4390499680284671745L
				      ^ (long) anIntArray8298[i])
				     & 0xffL)]) * 4934863201018085119L;
	aLong8287 = (4934863201018085119L
		     * (-4390499680284671745L * aLong8287 >>> 8
			^ ls[(int) ((-4390499680284671745L * aLong8287
				     ^ (long) (aBool8291 ? 1 : 0))
				    & 0xffL)]));
    }
    
    public Class179 method10512
	(Class182 class182, int i, Class40_Sub9 class40_sub9,
	 Class40_Sub7 class40_sub7, Class40_Sub22 class40_sub22,
	 Interface20 interface20, Interface18 interface18, Class689 class689) {
	if (-1 != anInt8300 * -1172437919)
	    return (((Class299) class40_sub7.method76(-1172437919 * anInt8300,
						      1588422410))
			.method5383
		    (class182, i, interface20, interface18, class689, null,
		     (byte) 31));
	int i_166_
	    = null != class689 ? i | class689.method14033(210971037) : i;
	Class179 class179;
	synchronized (aClass200_8305) {
	    class179 = ((Class179)
			aClass200_8305
			    .method3785(aLong8287 * -4390499680284671745L));
	}
	if (class179 == null
	    || class182.method3321(class179.method2928(), i_166_) != 0) {
	    if (null != class179)
		i_166_ = class182.method3229(i_166_, class179.method2928());
	    int i_167_ = i_166_;
	    boolean bool = false;
	    for (int i_168_ = 0; i_168_ < anIntArray8295.length; i_168_++) {
		int i_169_ = anIntArray8295[i_168_];
		Class2 class2 = null;
		if ((i_169_ & 0x40000000) != 0) {
		    if (null != aClass2Array8296
			&& aClass2Array8296[i_168_] != null)
			class2 = aClass2Array8296[i_168_];
		    if (!((Class8) class40_sub22.method76(i_169_ & 0x3fffffff,
							  341303526))
			     .method627(aBool8291, class2, -884000660))
			bool = true;
		} else if ((i_169_ & ~0x7fffffff) != 0
			   && !((Class327)
				class40_sub9.method76(i_169_ & 0x3fffffff,
						      -164715407))
				   .method5749((byte) -5))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class186[] class186s = new Class186[anIntArray8295.length];
	    int i_170_ = 0;
	    for (int i_171_ = 0; i_171_ < anIntArray8295.length; i_171_++) {
		int i_172_ = anIntArray8295[i_171_];
		Class2 class2 = null;
		if (0 != (i_172_ & 0x40000000)) {
		    if (aClass2Array8296 != null
			&& null != aClass2Array8296[i_171_])
			class2 = aClass2Array8296[i_171_];
		    Class186 class186
			= ((Class8) class40_sub22.method76(i_172_ & 0x3fffffff,
							   -482768162))
			      .method628(aBool8291, class2, -2088605122);
		    if (null != class186)
			class186s[i_170_++] = class186;
		} else if (0 != (i_172_ & ~0x7fffffff)) {
		    Class186 class186
			= ((Class327)
			   class40_sub9.method76(i_172_ & 0x3fffffff,
						 -1613861284))
			      .method5752(275405111);
		    if (null != class186)
			class186s[i_170_++] = class186;
		}
	    }
	    Class186 class186 = new Class186(class186s, i_170_);
	    i_167_ |= 0x4000;
	    class179 = class182.method3556(class186, i_167_,
					   Class325.anInt3557 * 1406950657, 64,
					   768);
	    for (int i_173_ = 0; i_173_ < 10; i_173_++) {
		for (int i_174_ = 0;
		     (i_174_
		      < Class198_Sub18.aShortArrayArray9988[i_173_].length);
		     i_174_++) {
		    if (anIntArray8301[i_173_]
			< (Class525_Sub6.aShortArrayArrayArray10485[i_173_]
			   [i_174_]).length)
			class179.method2971((Class198_Sub18
					     .aShortArrayArray9988[i_173_]
					     [i_174_]),
					    (Class525_Sub6
					     .aShortArrayArrayArray10485
					     [i_173_][i_174_]
					     [anIntArray8301[i_173_]]));
		}
	    }
	    for (int i_175_ = 0; i_175_ < 10; i_175_++) {
		for (int i_176_ = 0;
		     i_176_ < Class477.aShortArrayArray5199[i_175_].length;
		     i_176_++) {
		    if (anIntArray8298[i_175_]
			< (Class522_Sub1.aShortArrayArrayArray10395[i_175_]
			   [i_176_]).length)
			class179.method2973((Class477.aShortArrayArray5199
					     [i_175_][i_176_]),
					    (Class522_Sub1
					     .aShortArrayArrayArray10395
					     [i_175_][i_176_]
					     [anIntArray8298[i_175_]]));
		}
	    }
	    class179.method3010(i_166_);
	    synchronized (aClass200_8305) {
		aClass200_8305.method3788(class179,
					  -4390499680284671745L * aLong8287);
	    }
	}
	if (null == class689)
	    return class179;
	Class179 class179_177_ = class179.method2926((byte) 4, i_166_, true);
	class689.method14034(class179_177_, 0, 1472461406);
	return class179_177_;
    }
    
    public static int method10513(int i, int i_178_, float f, int i_179_) {
	return Class525_Sub31.method16523(i, i_178_, (int) f, -1425027090);
    }
    
    static final void method10514(Class683 class683, int i) {
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = Class182_Sub2.aClass228_9503.method4276(-2000301714);
    }
    
    static final void method10515(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	boolean bool
	    = class683.anIntArray8661[class683.anInt8662 * 501271953] == 1;
	int i_180_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	Class259 class259 = Class43.method1069(i_180_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_180_ >> 16];
	Class601.method9901(class259, class245, class683,
			    (bool ? Class238.aClass238_2396
			     : Class238.aClass238_2400),
			    (byte) 9);
    }
    
    static final void method10516(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_181_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_182_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_181_ & -1 - (1 << i_182_);
    }
    
    static void method10517(int i, String string, int i_183_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(2, (long) i);
	class525_sub16_sub10.method18361((byte) 118);
	class525_sub16_sub10.aString11798 = string;
    }
    
    static void method10518(int i, int i_184_, byte i_185_) {
	Class61.anInt676 = -1338965741 * i;
	Class61.anInt686 = i_184_ * 206903899;
    }
}
