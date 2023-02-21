/* Class390_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class390_Sub1 extends Class390
{
    public int anInt10193;
    public int anInt10194;
    public int anInt10195;
    public int anInt10196;
    public int anInt10197;
    public int anInt10198;
    
    public Class392 method336() {
	return Class392.aClass392_4077;
    }
    
    public Class392 method334(int i) {
	return Class392.aClass392_4077;
    }
    
    public Class392 method335() {
	return Class392.aClass392_4077;
    }
    
    public static Class390 method15804(RSBuffer class525_sub38) {
	Class390 class390 = Class198.method3766(class525_sub38, -1778120977);
	int i = class525_sub38.readBigSmart(-2043778683);
	int i_0_ = class525_sub38.readBigSmart(-2043778683);
	int i_1_ = class525_sub38.readBigSmart(-2043778683);
	int i_2_ = class525_sub38.readBigSmart(-2043778683);
	int i_3_ = class525_sub38.readBigSmart(-2043778683);
	int i_4_ = class525_sub38.readBigSmart(-2043778683);
	return new Class390_Sub1(class390.aClass395_4068,
				 class390.aClass396_4062,
				 1345009707 * class390.anInt4063,
				 1202152725 * class390.anInt4064,
				 1827301945 * class390.anInt4065,
				 -797820993 * class390.anInt4066,
				 1374070015 * class390.anInt4067,
				 -349107147 * class390.anInt4061,
				 512449097 * class390.anInt4069, i, i_0_, i_1_,
				 i_2_, i_3_, i_4_);
    }
    
    Class390_Sub1(Class395 class395, Class396 class396, int i, int i_5_,
		  int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_,
		  int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
	super(class395, class396, i, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_);
	anInt10193 = i_11_ * -359586299;
	anInt10194 = i_12_ * 1791233337;
	anInt10195 = i_13_ * 2010446825;
	anInt10196 = i_14_ * -1195535759;
	anInt10197 = -1295039053 * i_15_;
	anInt10198 = -1098894537 * i_16_;
    }
    
    public static Class390 method15805(RSBuffer class525_sub38) {
	Class390 class390 = Class198.method3766(class525_sub38, -1814445601);
	int i = class525_sub38.readBigSmart(-2043778683);
	int i_17_ = class525_sub38.readBigSmart(-2043778683);
	int i_18_ = class525_sub38.readBigSmart(-2043778683);
	int i_19_ = class525_sub38.readBigSmart(-2043778683);
	int i_20_ = class525_sub38.readBigSmart(-2043778683);
	int i_21_ = class525_sub38.readBigSmart(-2043778683);
	return new Class390_Sub1(class390.aClass395_4068,
				 class390.aClass396_4062,
				 1345009707 * class390.anInt4063,
				 1202152725 * class390.anInt4064,
				 1827301945 * class390.anInt4065,
				 -797820993 * class390.anInt4066,
				 1374070015 * class390.anInt4067,
				 -349107147 * class390.anInt4061,
				 512449097 * class390.anInt4069, i, i_17_,
				 i_18_, i_19_, i_20_, i_21_);
    }
    
    public static Class390 method15806(RSBuffer class525_sub38) {
	Class390 class390 = Class198.method3766(class525_sub38, -1704497627);
	int i = class525_sub38.readBigSmart(-2043778683);
	int i_22_ = class525_sub38.readBigSmart(-2043778683);
	int i_23_ = class525_sub38.readBigSmart(-2043778683);
	int i_24_ = class525_sub38.readBigSmart(-2043778683);
	int i_25_ = class525_sub38.readBigSmart(-2043778683);
	int i_26_ = class525_sub38.readBigSmart(-2043778683);
	return new Class390_Sub1(class390.aClass395_4068,
				 class390.aClass396_4062,
				 1345009707 * class390.anInt4063,
				 1202152725 * class390.anInt4064,
				 1827301945 * class390.anInt4065,
				 -797820993 * class390.anInt4066,
				 1374070015 * class390.anInt4067,
				 -349107147 * class390.anInt4061,
				 512449097 * class390.anInt4069, i, i_22_,
				 i_23_, i_24_, i_25_, i_26_);
    }
    
    static final String[] method15807(String[] strings, byte i) {
	String[] strings_27_ = new String[5];
	for (int i_28_ = 0; i_28_ < 5; i_28_++) {
	    strings_27_[i_28_]
		= new StringBuilder().append(i_28_).append(" ").toString();
	    if (strings != null && null != strings[i_28_])
		strings_27_[i_28_]
		    = new StringBuilder().append(strings_27_[i_28_]).append
			  (strings[i_28_]).toString();
	}
	return strings_27_;
    }
    
    static final void method15808(Class683 class683, byte i) {
	int i_29_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715
		  .method14167(i_29_, (byte) 16);
    }
}
