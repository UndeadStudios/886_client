/* Class656_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class656_Sub1 extends Class656
{
    public byte aByte10867;
    Class656_Sub1 aClass656_Sub1_10868;
    public Class211[] aClass211Array10869;
    public byte aByte10870;
    int anInt10871;
    public Class546 aClass546_10872;
    
    public abstract int method16909(byte i);
    
    abstract boolean method16910(Class182 class182, int i, int i_0_,
				 byte i_1_);
    
    int method16911(int i) {
	return 0;
    }
    
    abstract boolean method16912(int i);
    
    abstract boolean method16913(int i);
    
    abstract boolean method16914(int i);
    
    abstract void method16915(Class182 class182,
			      Class656_Sub1 class656_sub1_2_, int i, int i_3_,
			      int i_4_, boolean bool, int i_5_);
    
    abstract void method16916(int i);
    
    abstract Class567 method16917(Class182 class182, int i);
    
    abstract void method16918(Class182 class182, int i);
    
    public abstract Class553 method16919(Class182 class182, short i);
    
    abstract int method16920(Class525_Sub21[] class525_sub21s, int i);
    
    abstract Class567 method16921(Class182 class182);
    
    abstract boolean method16922(int i);
    
    public boolean method16923() {
	return true;
    }
    
    abstract boolean method16924();
    
    int method16925(int i, int i_6_, Class525_Sub21[] class525_sub21s,
		    int i_7_) {
	long l = aClass546_10872.aLongArrayArrayArray7254[aByte10867][i][i_6_];
	long l_8_ = 0L;
	int i_9_ = 0;
	for (/**/; l_8_ <= 48L; l_8_ += 16L) {
	    int i_10_ = (int) (l >> (int) l_8_ & 0xffffL);
	    if (i_10_ <= 0)
		break;
	    class525_sub21s[i_9_++] = (aClass546_10872.aClass564Array7255
				       [i_10_ - 1].aClass525_Sub21_7595);
	}
	for (int i_11_ = i_9_; i_11_ < 4; i_11_++)
	    class525_sub21s[i_11_] = null;
	return i_9_;
    }
    
    static Class553 method16926(int i, int i_12_, int i_13_,
				Class179 class179) {
	if (null == class179)
	    return null;
	Class553 class553
	    = new Class553(i, i_12_, i_13_, class179.method2956(),
			   class179.method3001(), class179.method2959(),
			   class179.method2960(), class179.method2961(),
			   class179.method2962(), class179.method2963());
	return class553;
    }
    
    public abstract int method16927();
    
    public boolean method16928(int i) {
	return true;
    }
    
    abstract boolean method16929();
    
    abstract boolean method16930();
    
    abstract boolean method16931();
    
    abstract boolean method16932();
    
    abstract boolean method16933();
    
    abstract boolean method16934();
    
    public abstract int method16935();
    
    public int method16936(int i) {
	return -method16909((byte) 64);
    }
    
    abstract boolean method16937(Class182 class182);
    
    abstract void method16938(Class182 class182);
    
    abstract boolean method16939(Class182 class182, int i, int i_14_);
    
    abstract boolean method16940(Class182 class182, int i, int i_15_);
    
    static Class553 method16941(int i, int i_16_, int i_17_,
				Class179 class179) {
	if (null == class179)
	    return null;
	Class553 class553
	    = new Class553(i, i_16_, i_17_, class179.method2956(),
			   class179.method3001(), class179.method2959(),
			   class179.method2960(), class179.method2961(),
			   class179.method2962(), class179.method2963());
	return class553;
    }
    
    abstract boolean method16942(Class182 class182, int i);
    
    abstract boolean method16943();
    
    abstract boolean method16944();
    
    abstract boolean method16945();
    
    public abstract Class553 method16946(Class182 class182);
    
    int method16947(int i, int i_18_, Class525_Sub21[] class525_sub21s) {
	long l
	    = aClass546_10872.aLongArrayArrayArray7254[aByte10867][i][i_18_];
	long l_19_ = 0L;
	int i_20_ = 0;
	for (/**/; l_19_ <= 48L; l_19_ += 16L) {
	    int i_21_ = (int) (l >> (int) l_19_ & 0xffffL);
	    if (i_21_ <= 0)
		break;
	    class525_sub21s[i_20_++] = (aClass546_10872.aClass564Array7255
					[i_21_ - 1].aClass525_Sub21_7595);
	}
	for (int i_22_ = i_20_; i_22_ < 4; i_22_++)
	    class525_sub21s[i_22_] = null;
	return i_20_;
    }
    
    abstract boolean method16948();
    
    abstract boolean method16949();
    
    abstract boolean method16950();
    
    abstract void method16951();
    
    abstract boolean method16952();
    
    public abstract Class553 method16953(Class182 class182);
    
    public abstract Class553 method16954(Class182 class182);
    
    public abstract Class553 method16955(Class182 class182);
    
    abstract boolean method16956(Class182 class182);
    
    abstract boolean method16957();
    
    abstract int method16958(Class525_Sub21[] class525_sub21s);
    
    abstract int method16959(Class525_Sub21[] class525_sub21s);
    
    int method16960() {
	return 0;
    }
    
    void method16961(int i, int i_23_) {
	aClass211Array10869 = new Class211[i];
	for (int i_24_ = 0; i_24_ < aClass211Array10869.length; i_24_++)
	    aClass211Array10869[i_24_] = new Class211();
    }
    
    abstract boolean method16962();
    
    abstract void method16963(Class182 class182);
    
    abstract boolean method16964();
    
    abstract boolean method16965(Class182 class182, int i, int i_25_);
    
    public boolean method16966() {
	return true;
    }
    
    public boolean method16967() {
	return true;
    }
    
    abstract void method16968(Class182 class182,
			      Class656_Sub1 class656_sub1_26_, int i,
			      int i_27_, int i_28_, boolean bool);
    
    public boolean method16969() {
	return true;
    }
    
    Class656_Sub1(Class546 class546) {
	aClass546_10872 = class546;
    }
    
    public boolean method16970() {
	return true;
    }
    
    int method16971(int i, int i_29_, Class525_Sub21[] class525_sub21s) {
	long l
	    = aClass546_10872.aLongArrayArrayArray7254[aByte10867][i][i_29_];
	long l_30_ = 0L;
	int i_31_ = 0;
	for (/**/; l_30_ <= 48L; l_30_ += 16L) {
	    int i_32_ = (int) (l >> (int) l_30_ & 0xffffL);
	    if (i_32_ <= 0)
		break;
	    class525_sub21s[i_31_++] = (aClass546_10872.aClass564Array7255
					[i_32_ - 1].aClass525_Sub21_7595);
	}
	for (int i_33_ = i_31_; i_33_ < 4; i_33_++)
	    class525_sub21s[i_33_] = null;
	return i_31_;
    }
    
    static Class553 method16972(int i, int i_34_, int i_35_,
				Class179 class179) {
	if (null == class179)
	    return null;
	Class553 class553
	    = new Class553(i, i_34_, i_35_, class179.method2956(),
			   class179.method3001(), class179.method2959(),
			   class179.method2960(), class179.method2961(),
			   class179.method2962(), class179.method2963());
	return class553;
    }
    
    static Class553 method16973(int i, int i_36_, int i_37_,
				Class179 class179) {
	if (null == class179)
	    return null;
	Class553 class553
	    = new Class553(i, i_36_, i_37_, class179.method2956(),
			   class179.method3001(), class179.method2959(),
			   class179.method2960(), class179.method2961(),
			   class179.method2962(), class179.method2963());
	return class553;
    }
    
    int method16974(int i, int i_38_, Class525_Sub21[] class525_sub21s) {
	long l
	    = aClass546_10872.aLongArrayArrayArray7254[aByte10867][i][i_38_];
	long l_39_ = 0L;
	int i_40_ = 0;
	for (/**/; l_39_ <= 48L; l_39_ += 16L) {
	    int i_41_ = (int) (l >> (int) l_39_ & 0xffffL);
	    if (i_41_ <= 0)
		break;
	    class525_sub21s[i_40_++] = (aClass546_10872.aClass564Array7255
					[i_41_ - 1].aClass525_Sub21_7595);
	}
	for (int i_42_ = i_40_; i_42_ < 4; i_42_++)
	    class525_sub21s[i_42_] = null;
	return i_40_;
    }
    
    public int method16975() {
	return -method16909((byte) 75);
    }
}
