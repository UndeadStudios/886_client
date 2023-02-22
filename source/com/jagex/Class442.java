/* Class442 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.List;

public class Class442 implements Interface6
{
    int anInt4864;
    JS5 aClass458_4865;
    public static Class459 aClass459_4866;
    public static int anInt4867;
    public static List aList4868;
    
    public Class27 method48(int i) {
	return Class27.aClass27_279;
    }
    
    public int method49(int i) {
	if (aClass458_4865.method7558(anInt4864 * -2133200417, (byte) 83))
	    return 100;
	return aClass458_4865.method7515(-2133200417 * anInt4864, (byte) 112);
    }
    
    Class442(JS5 class458, int i) {
	aClass458_4865 = class458;
	anInt4864 = -50918881 * i;
    }
    
    public int method50() {
	if (aClass458_4865.method7558(anInt4864 * -2133200417, (byte) 95))
	    return 100;
	return aClass458_4865.method7515(-2133200417 * anInt4864, (byte) 44);
    }
    
    public Class27 method51() {
	return Class27.aClass27_279;
    }
    
    public Class27 method47() {
	return Class27.aClass27_279;
    }
    
    public int method12() {
	if (aClass458_4865.method7558(anInt4864 * -2133200417, (byte) 117))
	    return 100;
	return aClass458_4865.method7515(-2133200417 * anInt4864, (byte) 21);
    }
    
    public Class27 method52() {
	return Class27.aClass27_279;
    }
    
    static void method7122(Class683 class683, int i) {
	class683.anIntArray8661[501271953 * class683.anInt8662 - 1]
	    = (((Class269)
		Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						      [(class683.anInt8662
							* 501271953) - 1]),
						     1431282174)).anInt2824
	       * -1065889303);
    }
    
    static void method7123(Class683 class683, int i) {
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = (((Class269)
		Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						      [(class683.anInt8662
							* 501271953) - 2]),
						     1348638034))
	       .aStringArray2838
	       [class683.anIntArray8661[501271953 * class683.anInt8662 - 1]]);
	class683.anInt8662 -= -1189665054;
    }
    
    static final void method7124(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	int i_0_ = ((class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953])
		    - 1);
	if (i_0_ < 0 || i_0_ > 9)
	    class683.anInt8644 -= 1285561025;
	else
	    class259.method4687(i_0_,
				(String) (class683.anObjectArray8636
					  [((class683.anInt8644 -= 1285561025)
					    * 1373599041)]),
				(byte) 98);
    }
    
    static final void method7125(int i, int i_1_, int i_2_, int i_3_, int i_4_,
				 int i_5_, int i_6_, int i_7_, int i_8_,
				 int i_9_) {
	if (i_2_ >= 1 && i_3_ >= 1
	    && i_2_ <= client.aClass507_11137.method8412(343233799) - 2
	    && i_3_ <= client.aClass507_11137.method8352((byte) -27) - 2) {
	    int i_10_ = i;
	    if (i_10_ < 3 && client.aClass507_11137.method8360(1771615858)
				 .method7774(i_2_, i_3_, 1004247236))
		i_10_++;
	    if (client.aClass507_11137.method8358((byte) 51) != null) {
		client.aClass507_11137.method8359(-1234293482).method15979
		    (Class501.aClass182_5564, i, i_1_, i_2_, i_3_, 1113708960);
		if (i_4_ >= 0) {
		    int i_11_
			= Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub11_10688.method17067((short) 255);
		    Class198_Sub13.aClass525_Sub30_9973.method16502
			((Class198_Sub13.aClass525_Sub30_9973
			  .aClass696_Sub11_10688),
			 1, (byte) -17);
		    client.aClass507_11137.method8359(-387652410).method15968
			(Class501.aClass182_5564, i_10_, i, i_2_, i_3_, i_4_,
			 i_5_, i_6_, i_7_, i_8_, 916034466);
		    Class198_Sub13.aClass525_Sub30_9973.method16502
			((Class198_Sub13.aClass525_Sub30_9973
			  .aClass696_Sub11_10688),
			 i_11_, (byte) -65);
		}
		Class350_Sub2_Sub1.method18173
		    (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867,
		     1432111491);
	    }
	}
    }
    
    static void method7126(int i, int i_12_, int i_13_, int i_14_,
			   Class9 class9, boolean bool, byte i_15_) {
	long l = (long) (i | (bool ? -2147483648 : 0));
	Class525_Sub10 class525_sub10
	    = (Class525_Sub10) Class525_Sub10.aClass10_10509.method684(l);
	if (null == class525_sub10) {
	    class525_sub10 = new Class525_Sub10();
	    Class525_Sub10.aClass10_10509.method695(class525_sub10, l);
	}
	if (class525_sub10.anIntArray10507.length <= i_12_) {
	    int[] is = new int[i_12_ + 1];
	    int[] is_16_ = new int[i_12_ + 1];
	    Class9[] class9s = null;
	    if (null != class525_sub10.aClass9Array10508)
		class9s = new Class9[i_12_ + 1];
	    for (int i_17_ = 0; i_17_ < class525_sub10.anIntArray10507.length;
		 i_17_++) {
		is[i_17_] = class525_sub10.anIntArray10507[i_17_];
		is_16_[i_17_] = class525_sub10.anIntArray10506[i_17_];
		if (null != class525_sub10.aClass9Array10508)
		    class9s[i_17_] = class525_sub10.aClass9Array10508[i_17_];
	    }
	    for (int i_18_ = class525_sub10.anIntArray10507.length;
		 i_18_ < i_12_; i_18_++) {
		is[i_18_] = -1;
		is_16_[i_18_] = 0;
	    }
	    class525_sub10.anIntArray10507 = is;
	    class525_sub10.anIntArray10506 = is_16_;
	    class525_sub10.aClass9Array10508 = class9s;
	}
	class525_sub10.anIntArray10507[i_12_] = i_13_;
	class525_sub10.anIntArray10506[i_12_] = i_14_;
	if (class9 != null) {
	    if (null == class525_sub10.aClass9Array10508)
		class525_sub10.aClass9Array10508
		    = new Class9[class525_sub10.anIntArray10507.length];
	    class525_sub10.aClass9Array10508[i_12_] = class9;
	} else if (null != class525_sub10.aClass9Array10508)
	    class525_sub10.aClass9Array10508[i_12_] = null;
    }
}
