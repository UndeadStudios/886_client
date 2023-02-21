/* Class350_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class350_Sub1 extends Class350
{
    Class446 aClass446_10199;
    Class446 aClass446_10200 = new Class446();
    public Class429 aClass429_10201 = new Class429();
    boolean aBool10202;
    Class429 aClass429_10203;
    int anInt10204;
    Class446 aClass446_10205;
    Class446 aClass446_10206;
    int anInt10207 = -1016665912;
    Interface31 anInterface31_10208;
    
    public Class350_Sub1(Class309 class309) {
	super(class309);
	aClass446_10205 = new Class446(Float.NaN, Float.NaN, Float.NaN);
	aClass446_10206 = new Class446(Float.NaN, Float.NaN, Float.NaN);
	aClass446_10199 = new Class446();
	aClass429_10203 = new Class429();
    }
    
    public void method15809(Interface31 interface31, Class446 class446,
			    Class429 class429, boolean bool, int i,
			    int[][][] is, Class475 class475, int i_0_,
			    int i_1_, int i_2_) {
	anInterface31_10208 = interface31;
	aClass446_10200.method7216(class446);
	aClass429_10201.method6809(class429);
	aBool10202 = bool;
	anInt10207 = 2077975809 * i;
	anInt10204
	    = anInterface31_10208.method171(-245122557).anInt10615 * 531478081;
	method15812(is, class475, i_0_, i_1_, -1063070103);
    }
    
    public void method15810(byte i) {
	if (null != anInterface31_10208)
	    anInterface31_10208
		= (aClass309_3741.method5483(-1731430432).method170
		   (anInterface31_10208.method180(1535825078),
		    anInterface31_10208.method72(2026263672), 1174339389));
    }
    
    public void method6129(float f, int[][][] is, Class475 class475, int i,
			   int i_3_, int i_4_) {
	if (anInterface31_10208 != null) {
	    method15812(is, class475, i, i_3_, 1100732902);
	    Class429 class429 = method15813(2008948515);
	    aClass429_10203.method6840(class429,
				       aClass309_3741.method5559(-75076833));
	    if (Float.isNaN(aClass429_10203.aFloat4812))
		aClass429_10203.method6809(class429);
	    class429.method6805();
	    aClass446_10206.method7216(anInterface31_10208.method171
					   (67677895).method16381(1490202086));
	    aClass309_3741.method5454(true, f, aClass446_10205,
				      aClass309_3741.method5493(1889727111),
				      aClass446_10206, aClass446_10199,
				      (byte) -122);
	}
    }
    
    void method15811(int[][][] is, Class475 class475, int i, int i_5_) {
	if (method6130(946918107)
	    && (aClass309_3741.method5502(-1133521593)
		|| aClass309_3741.method5520(1600200154))) {
	    Class525_Sub28 class525_sub28
		= anInterface31_10208.method171(-689261283);
	    anInt10204 = class525_sub28.anInt10615 * 531478081;
	    int i_6_ = anInt10204 * 660213073;
	    boolean bool = true;
	    if (anInt10204 * 660213073 == 3)
		bool = false;
	    else if (class475 != null
		     && (class475.method7774
			 (-794397083 * class525_sub28.anInt10614 - i >> 9,
			  602488327 * class525_sub28.anInt10618 - i_5_ >> 9,
			  2074854345))) {
		i_6_ = anInt10204 * 660213073 + 1;
		bool = false;
	    }
	    if (aClass309_3741.method5520(-1576725381) && is != null) {
		float f = method15818(is, class475, i, i_5_, i_6_, bool,
				      1067867466);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_7_ = 3.1415927F;
			Class446 class446
			    = Class446.method7208(0.0F, 0.0F, 1.0F);
			class446.method7239(aClass429_10201);
			Class446 class446_8_
			    = Class446.method7208(class446.aFloat4895, 0.0F,
						  class446.aFloat4897);
			class446_8_.method7220();
			float f_9_
			    = Class446.method7234(class446, class446_8_);
			for (int i_10_ = 0; i_10_ < 10; i_10_++) {
			    float f_11_ = (f_9_ + f_7_) / 2.0F - f_9_;
			    float f_12_ = f_11_;
			    if (f > 0.0F)
				f_12_ *= -1.0F;
			    Class446 class446_13_
				= Class446.method7208(1.0F, 0.0F, 0.0F);
			    class446_13_.method7239(aClass429_10201);
			    Class429 class429 = Class429.method6864();
			    class429.method6810(class446_13_, f_12_);
			    aClass429_10201.method6822(class429);
			    aClass429_10201.method6817();
			    class446_13_.method7260();
			    class429.method6805();
			    f = method15818(is, class475, i, i_5_, i_6_, bool,
					    1245599611);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_9_ += f_11_;
			    else
				f_7_ -= f_11_;
			}
		    }
		}
	    }
	}
    }
    
    void method15812(int[][][] is, Class475 class475, int i, int i_14_,
		     int i_15_) {
	if (method6130(-286458322)
	    && (aClass309_3741.method5502(-1133521593)
		|| aClass309_3741.method5520(1115570083))) {
	    Class525_Sub28 class525_sub28
		= anInterface31_10208.method171(-873479500);
	    anInt10204 = class525_sub28.anInt10615 * 531478081;
	    int i_16_ = anInt10204 * 660213073;
	    boolean bool = true;
	    if (anInt10204 * 660213073 == 3)
		bool = false;
	    else if (class475 != null
		     && (class475.method7774
			 (-794397083 * class525_sub28.anInt10614 - i >> 9,
			  602488327 * class525_sub28.anInt10618 - i_14_ >> 9,
			  1178126483))) {
		i_16_ = anInt10204 * 660213073 + 1;
		bool = false;
	    }
	    if (aClass309_3741.method5520(1165429559) && is != null) {
		float f = method15818(is, class475, i, i_14_, i_16_, bool,
				      1332963238);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_17_ = 3.1415927F;
			Class446 class446
			    = Class446.method7208(0.0F, 0.0F, 1.0F);
			class446.method7239(aClass429_10201);
			Class446 class446_18_
			    = Class446.method7208(class446.aFloat4895, 0.0F,
						  class446.aFloat4897);
			class446_18_.method7220();
			float f_19_
			    = Class446.method7234(class446, class446_18_);
			for (int i_20_ = 0; i_20_ < 10; i_20_++) {
			    float f_21_ = (f_19_ + f_17_) / 2.0F - f_19_;
			    float f_22_ = f_21_;
			    if (f > 0.0F)
				f_22_ *= -1.0F;
			    Class446 class446_23_
				= Class446.method7208(1.0F, 0.0F, 0.0F);
			    class446_23_.method7239(aClass429_10201);
			    Class429 class429 = Class429.method6864();
			    class429.method6810(class446_23_, f_22_);
			    aClass429_10201.method6822(class429);
			    aClass429_10201.method6817();
			    class446_23_.method7260();
			    class429.method6805();
			    f = method15818(is, class475, i, i_14_, i_16_,
					    bool, 31637423);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_19_ += f_21_;
			    else
				f_17_ -= f_21_;
			}
		    }
		}
	    }
	}
    }
    
    Class429 method15813(int i) {
	Class429 class429 = Class429.method6801(aClass429_10201);
	if (aBool10202) {
	    Class446 class446 = anInterface31_10208.method172(1031913434);
	    if (class446.method7230() < (float) (anInt10207 * -587359487)) {
		class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
		Class429 class429_24_
		    = anInterface31_10208.method173(-875762552);
		class446.method7239(class429_24_);
	    }
	    class446.aFloat4896 = 0.0F;
	    float f = (float) Math.atan2((double) class446.aFloat4895,
					 (double) class446.aFloat4897);
	    class446.method7260();
	    Class429 class429_25_ = new Class429();
	    class429_25_.method6811(0.0F, 1.0F, 0.0F, f);
	    class429.method6822(class429_25_);
	}
	return class429;
    }
    
    Class446 method15814(Class429 class429, int i) {
	Class446 class446 = Class446.method7209(aClass446_10200);
	class446.method7239(class429);
	Class446 class446_26_ = Class446.method7223(aClass446_10206, class446);
	class446.method7260();
	return class446_26_;
    }
    
    public float method15815() {
	return Class350.method6157(aClass429_10201, (byte) 0);
    }
    
    public Class446 method6131(int i) {
	Class446 class446 = Class446.method7209(aClass446_10200);
	class446.method7239(aClass429_10203);
	Class446 class446_27_ = Class446.method7223(aClass446_10205, class446);
	class446.method7260();
	return class446_27_;
    }
    
    public double[] method6132(int i) {
	double[] ds = new double[3];
	Class446 class446 = method6131(-1595275599);
	ds[0] = (double) class446.aFloat4895;
	ds[1] = (double) class446.aFloat4896;
	ds[2] = (double) class446.aFloat4897;
	return ds;
    }
    
    public Class525_Sub28 method6133(byte i) {
	Class446 class446 = method6131(-2136362364);
	Class525_Sub28 class525_sub28
	    = new Class525_Sub28(660213073 * anInt10204,
				 (int) class446.aFloat4895,
				 (int) class446.aFloat4896,
				 (int) class446.aFloat4897);
	class446.method7260();
	return class525_sub28;
    }
    
    public Class525_Sub28 method6144() {
	Class446 class446 = method6131(-2074541968);
	Class525_Sub28 class525_sub28
	    = new Class525_Sub28(660213073 * anInt10204,
				 (int) class446.aFloat4895,
				 (int) class446.aFloat4896,
				 (int) class446.aFloat4897);
	class446.method7260();
	return class525_sub28;
    }
    
    public Class446 method15816() {
	return aClass446_10200;
    }
    
    public float method15817(byte i) {
	return Class350.method6157(aClass429_10201, (byte) 0);
    }
    
    public void method6135(Class291 class291, int i, int i_28_, int i_29_) {
	Class446 class446 = method6131(-2044639699);
	class291.anInt3219 = ((int) class446.aFloat4895 - i) * 505543655;
	class291.anInt3220 = -416553419 * (int) -class446.aFloat4896;
	class291.anInt3218 = 981552359 * ((int) class446.aFloat4897 - i_28_);
	class446.method7260();
    }
    
    public float method6134(int i) {
	return 0.0F;
    }
    
    float method15818(int[][][] is, Class475 class475, int i, int i_30_,
		      int i_31_, boolean bool, int i_32_) {
	Class429 class429 = method15813(1846596133);
	Class446 class446 = method15814(class429, 1860205884);
	class429.method6805();
	int i_33_ = (int) class446.aFloat4895 - i >> 9;
	int i_34_ = (int) class446.aFloat4897 - i_30_ >> 9;
	if (i_33_ >= 0 && i_34_ >= 0 && 1 + i_33_ < is[0].length
	    && 1 + i_34_ < is[0][0].length) {
	    int i_35_ = i_31_;
	    if (bool && class475.method7774(i_33_, i_34_, 586198037))
		i_35_ = i_31_ + 1;
	    long l = (long) class446.aFloat4895 % 512L;
	    long l_36_ = (long) class446.aFloat4897 % 512L;
	    long l_37_
		= (long) is[i_35_][i_33_][i_34_] * (512L - l) * (512L - l_36_);
	    l_37_ += (512L - l_36_) * (l * (long) is[i_35_][1 + i_33_][i_34_]);
	    l_37_ += (512L - l) * (long) is[i_35_][i_33_][1 + i_34_] * l_36_;
	    l_37_ += (long) is[i_35_][1 + i_33_][1 + i_34_] * l * l_36_;
	    l_37_ /= 262144L;
	    l_37_ -= 1024L;
	    float f = (float) -l_37_ - class446.aFloat4896;
	    class446.method7260();
	    return f;
	}
	class446.method7260();
	return Float.NaN;
    }
    
    Class429 method15819() {
	Class429 class429 = Class429.method6801(aClass429_10201);
	if (aBool10202) {
	    Class446 class446 = anInterface31_10208.method172(1043138152);
	    if (class446.method7230() < (float) (anInt10207 * -587359487)) {
		class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
		Class429 class429_38_
		    = anInterface31_10208.method173(-875762552);
		class446.method7239(class429_38_);
	    }
	    class446.aFloat4896 = 0.0F;
	    float f = (float) Math.atan2((double) class446.aFloat4895,
					 (double) class446.aFloat4897);
	    class446.method7260();
	    Class429 class429_39_ = new Class429();
	    class429_39_.method6811(0.0F, 1.0F, 0.0F, f);
	    class429.method6822(class429_39_);
	}
	return class429;
    }
    
    public void method6137(float f, int[][][] is, Class475 class475, int i,
			   int i_40_) {
	if (anInterface31_10208 != null) {
	    method15812(is, class475, i, i_40_, -168930139);
	    Class429 class429 = method15813(1701493169);
	    aClass429_10203.method6840(class429,
				       aClass309_3741.method5559(-1460790935));
	    if (Float.isNaN(aClass429_10203.aFloat4812))
		aClass429_10203.method6809(class429);
	    class429.method6805();
	    aClass446_10206.method7216(anInterface31_10208.method171
					   (-869938587)
					   .method16381(1661284791));
	    aClass309_3741.method5454(true, f, aClass446_10205,
				      aClass309_3741.method5493(-1298978292),
				      aClass446_10206, aClass446_10199,
				      (byte) -68);
	}
    }
    
    public void method6136(float f, int[][][] is, Class475 class475, int i,
			   int i_41_) {
	if (anInterface31_10208 != null) {
	    method15812(is, class475, i, i_41_, -2122770296);
	    Class429 class429 = method15813(1588326828);
	    aClass429_10203.method6840(class429,
				       aClass309_3741.method5559(-559959934));
	    if (Float.isNaN(aClass429_10203.aFloat4812))
		aClass429_10203.method6809(class429);
	    class429.method6805();
	    aClass446_10206.method7216(anInterface31_10208.method171
					   (184249831)
					   .method16381(1887393133));
	    aClass309_3741.method5454(true, f, aClass446_10205,
				      aClass309_3741.method5493(856793976),
				      aClass446_10206, aClass446_10199,
				      (byte) -70);
	}
    }
    
    public Class446 method15820() {
	return aClass446_10205;
    }
    
    public boolean method6148() {
	return !Float.isNaN(aClass446_10205.aFloat4895);
    }
    
    public Class446 method6140() {
	Class446 class446 = Class446.method7209(aClass446_10200);
	class446.method7239(aClass429_10203);
	Class446 class446_42_ = Class446.method7223(aClass446_10205, class446);
	class446.method7260();
	return class446_42_;
    }
    
    public Class446 method6128() {
	Class446 class446 = Class446.method7209(aClass446_10200);
	class446.method7239(aClass429_10203);
	Class446 class446_43_ = Class446.method7223(aClass446_10205, class446);
	class446.method7260();
	return class446_43_;
    }
    
    public double[] method6142() {
	double[] ds = new double[3];
	Class446 class446 = method6131(-985540321);
	ds[0] = (double) class446.aFloat4895;
	ds[1] = (double) class446.aFloat4896;
	ds[2] = (double) class446.aFloat4897;
	return ds;
    }
    
    public float method6153() {
	return 0.0F;
    }
    
    public void method15821() {
	if (null != anInterface31_10208)
	    anInterface31_10208
		= (aClass309_3741.method5483(-1583302337).method170
		   (anInterface31_10208.method180(1556709398),
		    anInterface31_10208.method72(2026263672), 1174339389));
    }
    
    public Class525_Sub28 method6141() {
	Class446 class446 = method6131(-1715812136);
	Class525_Sub28 class525_sub28
	    = new Class525_Sub28(660213073 * anInt10204,
				 (int) class446.aFloat4895,
				 (int) class446.aFloat4896,
				 (int) class446.aFloat4897);
	class446.method7260();
	return class525_sub28;
    }
    
    public Class525_Sub28 method6146() {
	Class446 class446 = method6131(-1448078998);
	Class525_Sub28 class525_sub28
	    = new Class525_Sub28(660213073 * anInt10204,
				 (int) class446.aFloat4895,
				 (int) class446.aFloat4896,
				 (int) class446.aFloat4897);
	class446.method7260();
	return class525_sub28;
    }
    
    public float method6147() {
	return 0.0F;
    }
    
    Class446 method15822(Class429 class429) {
	Class446 class446 = Class446.method7209(aClass446_10200);
	class446.method7239(class429);
	Class446 class446_44_ = Class446.method7223(aClass446_10206, class446);
	class446.method7260();
	return class446_44_;
    }
    
    public void method6145(RSBuffer class525_sub38, int i) {
	Class307 class307
	    = Class470.method7729(class525_sub38.readUnsignedByte(1660314682),
				  975555900);
	int i_45_ = class525_sub38.readUnsignedShort((byte) 34);
	aClass446_10200.method7215(class525_sub38);
	aClass429_10201.method6807(class525_sub38);
	if (class525_sub38.readUnsignedByte(695678418) == 1)
	    aBool10202 = true;
	else
	    aBool10202 = false;
	anInt10207 = class525_sub38.readUnsignedShort((byte) 87) * 2077975809;
	anInterface31_10208
	    = aClass309_3741.method5483(-1953331144).method170(class307, i_45_,
							       1174339389);
    }
    
    public void method6138(Class291 class291, int i, int i_46_) {
	Class446 class446 = method6131(-933764318);
	class291.anInt3219 = ((int) class446.aFloat4895 - i) * 505543655;
	class291.anInt3220 = -416553419 * (int) -class446.aFloat4896;
	class291.anInt3218 = 981552359 * ((int) class446.aFloat4897 - i_46_);
	class446.method7260();
    }
    
    public void method6151(Class291 class291, int i, int i_47_) {
	Class446 class446 = method6131(-473950325);
	class291.anInt3219 = ((int) class446.aFloat4895 - i) * 505543655;
	class291.anInt3220 = -416553419 * (int) -class446.aFloat4896;
	class291.anInt3218 = 981552359 * ((int) class446.aFloat4897 - i_47_);
	class446.method7260();
    }
    
    public void method6139(Class291 class291, int i, int i_48_) {
	Class446 class446 = method6131(-1277442740);
	class291.anInt3219 = ((int) class446.aFloat4895 - i) * 505543655;
	class291.anInt3220 = -416553419 * (int) -class446.aFloat4896;
	class291.anInt3218 = 981552359 * ((int) class446.aFloat4897 - i_48_);
	class446.method7260();
    }
    
    public void method6150(RSBuffer class525_sub38) {
	Class307 class307
	    = Class470.method7729(class525_sub38.readUnsignedByte(1573511503),
				  67444085);
	int i = class525_sub38.readUnsignedShort((byte) 108);
	aClass446_10200.method7215(class525_sub38);
	aClass429_10201.method6807(class525_sub38);
	if (class525_sub38.readUnsignedByte(1381812730) == 1)
	    aBool10202 = true;
	else
	    aBool10202 = false;
	anInt10207 = class525_sub38.readUnsignedShort((byte) 11) * 2077975809;
	anInterface31_10208
	    = aClass309_3741.method5483(-1989480637).method170(class307, i,
							       1174339389);
    }
    
    public Class446 method15823() {
	return aClass446_10200;
    }
    
    public void method15824(Interface31 interface31, Class446 class446,
			    Class429 class429, boolean bool, int i,
			    int[][][] is, Class475 class475, int i_49_,
			    int i_50_) {
	anInterface31_10208 = interface31;
	aClass446_10200.method7216(class446);
	aClass429_10201.method6809(class429);
	aBool10202 = bool;
	anInt10207 = 2077975809 * i;
	anInt10204
	    = anInterface31_10208.method171(-10602778).anInt10615 * 531478081;
	method15812(is, class475, i_49_, i_50_, 1125133835);
    }
    
    public void method15825(Interface31 interface31, Class446 class446,
			    Class429 class429, boolean bool, int i,
			    int[][][] is, Class475 class475, int i_51_,
			    int i_52_) {
	anInterface31_10208 = interface31;
	aClass446_10200.method7216(class446);
	aClass429_10201.method6809(class429);
	aBool10202 = bool;
	anInt10207 = 2077975809 * i;
	anInt10204
	    = anInterface31_10208.method171(-766724688).anInt10615 * 531478081;
	method15812(is, class475, i_51_, i_52_, 325251792);
    }
    
    public void method15826(Interface31 interface31, Class446 class446,
			    Class429 class429, boolean bool, int i,
			    int[][][] is, Class475 class475, int i_53_,
			    int i_54_) {
	anInterface31_10208 = interface31;
	aClass446_10200.method7216(class446);
	aClass429_10201.method6809(class429);
	aBool10202 = bool;
	anInt10207 = 2077975809 * i;
	anInt10204
	    = anInterface31_10208.method171(-610217485).anInt10615 * 531478081;
	method15812(is, class475, i_53_, i_54_, -111618939);
    }
    
    public void method15827() {
	if (null != anInterface31_10208)
	    anInterface31_10208
		= (aClass309_3741.method5483(-1930861465).method170
		   (anInterface31_10208.method180(1592282907),
		    anInterface31_10208.method72(2026263672), 1174339389));
    }
    
    Class429 method15828() {
	Class429 class429 = Class429.method6801(aClass429_10201);
	if (aBool10202) {
	    Class446 class446 = anInterface31_10208.method172(1080444684);
	    if (class446.method7230() < (float) (anInt10207 * -587359487)) {
		class446 = Class446.method7208(0.0F, 0.0F, 1.0F);
		Class429 class429_55_
		    = anInterface31_10208.method173(-875762552);
		class446.method7239(class429_55_);
	    }
	    class446.aFloat4896 = 0.0F;
	    float f = (float) Math.atan2((double) class446.aFloat4895,
					 (double) class446.aFloat4897);
	    class446.method7260();
	    Class429 class429_56_ = new Class429();
	    class429_56_.method6811(0.0F, 1.0F, 0.0F, f);
	    class429.method6822(class429_56_);
	}
	return class429;
    }
    
    public boolean method6152() {
	return !Float.isNaN(aClass446_10205.aFloat4895);
    }
    
    public boolean method6130(int i) {
	return !Float.isNaN(aClass446_10205.aFloat4895);
    }
    
    void method15829(int[][][] is, Class475 class475, int i, int i_57_) {
	if (method6130(1433737806)
	    && (aClass309_3741.method5502(-1133521593)
		|| aClass309_3741.method5520(-908363601))) {
	    Class525_Sub28 class525_sub28
		= anInterface31_10208.method171(-561676079);
	    anInt10204 = class525_sub28.anInt10615 * 531478081;
	    int i_58_ = anInt10204 * 660213073;
	    boolean bool = true;
	    if (anInt10204 * 660213073 == 3)
		bool = false;
	    else if (class475 != null
		     && (class475.method7774
			 (-794397083 * class525_sub28.anInt10614 - i >> 9,
			  602488327 * class525_sub28.anInt10618 - i_57_ >> 9,
			  1136414919))) {
		i_58_ = anInt10204 * 660213073 + 1;
		bool = false;
	    }
	    if (aClass309_3741.method5520(104940582) && is != null) {
		float f = method15818(is, class475, i, i_57_, i_58_, bool,
				      1311011295);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_59_ = 3.1415927F;
			Class446 class446
			    = Class446.method7208(0.0F, 0.0F, 1.0F);
			class446.method7239(aClass429_10201);
			Class446 class446_60_
			    = Class446.method7208(class446.aFloat4895, 0.0F,
						  class446.aFloat4897);
			class446_60_.method7220();
			float f_61_
			    = Class446.method7234(class446, class446_60_);
			for (int i_62_ = 0; i_62_ < 10; i_62_++) {
			    float f_63_ = (f_61_ + f_59_) / 2.0F - f_61_;
			    float f_64_ = f_63_;
			    if (f > 0.0F)
				f_64_ *= -1.0F;
			    Class446 class446_65_
				= Class446.method7208(1.0F, 0.0F, 0.0F);
			    class446_65_.method7239(aClass429_10201);
			    Class429 class429 = Class429.method6864();
			    class429.method6810(class446_65_, f_64_);
			    aClass429_10201.method6822(class429);
			    aClass429_10201.method6817();
			    class446_65_.method7260();
			    class429.method6805();
			    f = method15818(is, class475, i, i_57_, i_58_,
					    bool, 91331166);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_61_ += f_63_;
			    else
				f_59_ -= f_63_;
			}
		    }
		}
	    }
	}
    }
    
    float method15830(int[][][] is, Class475 class475, int i, int i_66_,
		      int i_67_, boolean bool) {
	Class429 class429 = method15813(1967540888);
	Class446 class446 = method15814(class429, -1561704370);
	class429.method6805();
	int i_68_ = (int) class446.aFloat4895 - i >> 9;
	int i_69_ = (int) class446.aFloat4897 - i_66_ >> 9;
	if (i_68_ >= 0 && i_69_ >= 0 && 1 + i_68_ < is[0].length
	    && 1 + i_69_ < is[0][0].length) {
	    int i_70_ = i_67_;
	    if (bool && class475.method7774(i_68_, i_69_, 984092604))
		i_70_ = i_67_ + 1;
	    long l = (long) class446.aFloat4895 % 512L;
	    long l_71_ = (long) class446.aFloat4897 % 512L;
	    long l_72_
		= (long) is[i_70_][i_68_][i_69_] * (512L - l) * (512L - l_71_);
	    l_72_ += (512L - l_71_) * (l * (long) is[i_70_][1 + i_68_][i_69_]);
	    l_72_ += (512L - l) * (long) is[i_70_][i_68_][1 + i_69_] * l_71_;
	    l_72_ += (long) is[i_70_][1 + i_68_][1 + i_69_] * l * l_71_;
	    l_72_ /= 262144L;
	    l_72_ -= 1024L;
	    float f = (float) -l_72_ - class446.aFloat4896;
	    class446.method7260();
	    return f;
	}
	class446.method7260();
	return Float.NaN;
    }
    
    Class446 method15831(Class429 class429) {
	Class446 class446 = Class446.method7209(aClass446_10200);
	class446.method7239(class429);
	Class446 class446_73_ = Class446.method7223(aClass446_10206, class446);
	class446.method7260();
	return class446_73_;
    }
    
    public Class446 method15832(int i) {
	return aClass446_10200;
    }
    
    Class446 method15833(Class429 class429) {
	Class446 class446 = Class446.method7209(aClass446_10200);
	class446.method7239(class429);
	Class446 class446_74_ = Class446.method7223(aClass446_10206, class446);
	class446.method7260();
	return class446_74_;
    }
    
    public float method15834(int i) {
	return Class483.method7837(aClass429_10201, (byte) 0);
    }
    
    public Class446 method15835() {
	return aClass446_10205;
    }
    
    public Class446 method15836() {
	return aClass446_10205;
    }
    
    public float method6149() {
	return 0.0F;
    }
    
    Class446 method15837(Class429 class429) {
	Class446 class446 = Class446.method7209(aClass446_10200);
	class446.method7239(class429);
	Class446 class446_75_ = Class446.method7223(aClass446_10206, class446);
	class446.method7260();
	return class446_75_;
    }
    
    public Class446 method15838(int i) {
	return aClass446_10205;
    }
    
    public float method15839() {
	return Class350.method6157(aClass429_10201, (byte) 0);
    }
    
    public double[] method6143() {
	double[] ds = new double[3];
	Class446 class446 = method6131(-1920530217);
	ds[0] = (double) class446.aFloat4895;
	ds[1] = (double) class446.aFloat4896;
	ds[2] = (double) class446.aFloat4897;
	return ds;
    }
    
    public float method15840() {
	return Class483.method7837(aClass429_10201, (byte) 0);
    }
    
    public float method15841() {
	return Class483.method7837(aClass429_10201, (byte) 0);
    }
    
    public static boolean method15842(int i, int i_76_) {
	return (1 == i || i == 13 || 14 == i || i == 0 || i == 9 || i == 8
		|| i == 2);
    }
    
    static final void method15843(int i) {
	Iterator iterator = client.aClass10_11248.iterator();
	while (iterator.hasNext()) {
	    Class525_Sub16_Sub15 class525_sub16_sub15
		= (Class525_Sub16_Sub15) iterator.next();
	    Class656_Sub1_Sub3_Sub4 class656_sub1_sub3_sub4
		= class525_sub16_sub15.aClass656_Sub1_Sub3_Sub4_11841;
	    if (client.aClass507_11137.method8358((byte) 126) != null
		&& class656_sub1_sub3_sub4.method18834((byte) 1))
		client.aClass507_11137.method8358((byte) 58)
		    .method8956(class656_sub1_sub3_sub4, true, (byte) 53);
	}
    }
    
    public static void method15844(int i, int i_77_) {
	Class234.anInt2374 = i * -558022271;
	Class525_Sub41_Sub2.aClass525_Sub41_Sub2Array11908
	    = new Class525_Sub41_Sub2[i];
	Class184.anInt2079 = 0;
    }
    
    static final void method15845(Class683 class683, byte i) {
	class683.anInt8648 -= -92693374;
	if (class683.aLongArray8645[class683.anInt8648 * 105529793]
	    >= class683.aLongArray8645[class683.anInt8648 * 105529793 + 1])
	    class683.anInt8663
		+= (class683.anIntArray8647[class683.anInt8663 * 1931825055]
		    * -1827402657);
    }
}
