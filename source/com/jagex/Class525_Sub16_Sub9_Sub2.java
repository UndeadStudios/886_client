/* Class525_Sub16_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub16_Sub9_Sub2 extends Class525_Sub16_Sub9
{
    float aFloat12226;
    float aFloat12227;
    float aFloat12228;
    Class276 aClass276_12229;
    
    public void method18310(Class291 class291, Class444 class444,
			    Class435 class435) {
	float f = (float) Math.sin((double) aFloat12228);
	float f_0_ = aFloat12227 * f;
	if (Class276.aClass276_2870 == aClass276_12229) {
	    Class291 class291_1_;
	    (class291_1_ = class291).anInt3219
		= 505543655 * (int) (f_0_ + (float) (446228439
						     * class291_1_.anInt3219));
	    class444.method7147(f_0_, 0.0F, 0.0F);
	} else if (aClass276_12229 == Class276.aClass276_2869) {
	    Class291 class291_2_;
	    (class291_2_ = class291).anInt3220
		= ((int) (f_0_ + (float) (-971457507 * class291_2_.anInt3220))
		   * -416553419);
	    class444.method7147(0.0F, f_0_, 0.0F);
	} else if (Class276.aClass276_2872 == aClass276_12229) {
	    Class291 class291_3_;
	    (class291_3_ = class291).anInt3218
		= 981552359 * (int) ((float) (class291_3_.anInt3218
					      * 120391383)
				     + f_0_);
	    class444.method7147(0.0F, 0.0F, f_0_);
	} else if (Class276.aClass276_2871 == aClass276_12229)
	    class444.method7142(1.0F, 0.0F, 0.0F, f_0_);
	else if (Class276.aClass276_2873 == aClass276_12229)
	    class444.method7142(0.0F, 1.0F, 0.0F, f_0_);
	else if (aClass276_12229 == Class276.aClass276_2868)
	    class444.method7142(0.0F, 0.0F, 1.0F, f_0_);
    }
    
    Class525_Sub16_Sub9_Sub2(int i, RSBuffer class525_sub38) {
	super(i);
	aClass276_12229
	    = Class229.method4380(class525_sub38.readUnsignedByte(1115302574),
				  1146176712);
	aFloat12227 = class525_sub38.method16634(-1852278839);
	aFloat12226 = class525_sub38.method16634(127549811);
    }
    
    public Class525_Sub16_Sub9_Sub2(int i, Class276 class276, float f,
				    float f_4_) {
	super(i);
	aClass276_12229 = class276;
	aFloat12227 = f;
	aFloat12226 = f_4_;
    }
    
    public void method18303(Class291 class291, Class444 class444,
			    Class435 class435, int i) {
	float f = (float) Math.sin((double) aFloat12228);
	float f_5_ = aFloat12227 * f;
	if (Class276.aClass276_2870 == aClass276_12229) {
	    Class291 class291_6_;
	    (class291_6_ = class291).anInt3219
		= 505543655 * (int) (f_5_ + (float) (446228439
						     * class291_6_.anInt3219));
	    class444.method7147(f_5_, 0.0F, 0.0F);
	} else if (aClass276_12229 == Class276.aClass276_2869) {
	    Class291 class291_7_;
	    (class291_7_ = class291).anInt3220
		= ((int) (f_5_ + (float) (-971457507 * class291_7_.anInt3220))
		   * -416553419);
	    class444.method7147(0.0F, f_5_, 0.0F);
	} else if (Class276.aClass276_2872 == aClass276_12229) {
	    Class291 class291_8_;
	    (class291_8_ = class291).anInt3218
		= 981552359 * (int) ((float) (class291_8_.anInt3218
					      * 120391383)
				     + f_5_);
	    class444.method7147(0.0F, 0.0F, f_5_);
	} else if (Class276.aClass276_2871 == aClass276_12229)
	    class444.method7142(1.0F, 0.0F, 0.0F, f_5_);
	else if (Class276.aClass276_2873 == aClass276_12229)
	    class444.method7142(0.0F, 1.0F, 0.0F, f_5_);
	else if (aClass276_12229 == Class276.aClass276_2868)
	    class444.method7142(0.0F, 0.0F, 1.0F, f_5_);
    }
    
    public void method18304(RSBuffer class525_sub38, int i) {
	aClass276_12229
	    = Class229.method4380(class525_sub38.readUnsignedByte(834919150),
				  -1297727903);
	aFloat12227 = class525_sub38.method16634(-1362162225);
	aFloat12226 = class525_sub38.method16634(-200422108);
    }
    
    public void method18301(float f) {
	aFloat12228 += aFloat12226 * f;
    }
    
    public void method18306(Class291 class291, Class444 class444,
			    Class435 class435) {
	float f = (float) Math.sin((double) aFloat12228);
	float f_9_ = aFloat12227 * f;
	if (Class276.aClass276_2870 == aClass276_12229) {
	    Class291 class291_10_;
	    (class291_10_ = class291).anInt3219
		= 505543655 * (int) (f_9_
				     + (float) (446228439
						* class291_10_.anInt3219));
	    class444.method7147(f_9_, 0.0F, 0.0F);
	} else if (aClass276_12229 == Class276.aClass276_2869) {
	    Class291 class291_11_;
	    (class291_11_ = class291).anInt3220
		= ((int) (f_9_ + (float) (-971457507 * class291_11_.anInt3220))
		   * -416553419);
	    class444.method7147(0.0F, f_9_, 0.0F);
	} else if (Class276.aClass276_2872 == aClass276_12229) {
	    Class291 class291_12_;
	    (class291_12_ = class291).anInt3218
		= 981552359 * (int) ((float) (class291_12_.anInt3218
					      * 120391383)
				     + f_9_);
	    class444.method7147(0.0F, 0.0F, f_9_);
	} else if (Class276.aClass276_2871 == aClass276_12229)
	    class444.method7142(1.0F, 0.0F, 0.0F, f_9_);
	else if (Class276.aClass276_2873 == aClass276_12229)
	    class444.method7142(0.0F, 1.0F, 0.0F, f_9_);
	else if (aClass276_12229 == Class276.aClass276_2868)
	    class444.method7142(0.0F, 0.0F, 1.0F, f_9_);
    }
    
    public void method18309(Class291 class291, Class444 class444,
			    Class435 class435) {
	float f = (float) Math.sin((double) aFloat12228);
	float f_13_ = aFloat12227 * f;
	if (Class276.aClass276_2870 == aClass276_12229) {
	    Class291 class291_14_;
	    (class291_14_ = class291).anInt3219
		= 505543655 * (int) (f_13_
				     + (float) (446228439
						* class291_14_.anInt3219));
	    class444.method7147(f_13_, 0.0F, 0.0F);
	} else if (aClass276_12229 == Class276.aClass276_2869) {
	    Class291 class291_15_;
	    (class291_15_ = class291).anInt3220
		= ((int) (f_13_
			  + (float) (-971457507 * class291_15_.anInt3220))
		   * -416553419);
	    class444.method7147(0.0F, f_13_, 0.0F);
	} else if (Class276.aClass276_2872 == aClass276_12229) {
	    Class291 class291_16_;
	    (class291_16_ = class291).anInt3218
		= 981552359 * (int) ((float) (class291_16_.anInt3218
					      * 120391383)
				     + f_13_);
	    class444.method7147(0.0F, 0.0F, f_13_);
	} else if (Class276.aClass276_2871 == aClass276_12229)
	    class444.method7142(1.0F, 0.0F, 0.0F, f_13_);
	else if (Class276.aClass276_2873 == aClass276_12229)
	    class444.method7142(0.0F, 1.0F, 0.0F, f_13_);
	else if (aClass276_12229 == Class276.aClass276_2868)
	    class444.method7142(0.0F, 0.0F, 1.0F, f_13_);
    }
    
    public void method18302(float f, int i) {
	aFloat12228 += aFloat12226 * f;
    }
    
    public void method18308(RSBuffer class525_sub38) {
	aClass276_12229
	    = Class229.method4380(class525_sub38.readUnsignedByte(230420539),
				  -1336662414);
	aFloat12227 = class525_sub38.method16634(-1942943988);
	aFloat12226 = class525_sub38.method16634(1447344);
    }
    
    public void method18307(RSBuffer class525_sub38) {
	aClass276_12229
	    = Class229.method4380(class525_sub38.readUnsignedByte(191115526),
				  -1066172490);
	aFloat12227 = class525_sub38.method16634(197783160);
	aFloat12226 = class525_sub38.method16634(-444882173);
    }
    
    public void method18305(RSBuffer class525_sub38) {
	aClass276_12229
	    = Class229.method4380(class525_sub38.readUnsignedByte(1192540234),
				  -1796166561);
	aFloat12227 = class525_sub38.method16634(-799033948);
	aFloat12226 = class525_sub38.method16634(-2041996554);
    }
    
    public void method18311(RSBuffer class525_sub38) {
	aClass276_12229
	    = Class229.method4380(class525_sub38.readUnsignedByte(1954055962),
				  1154774643);
	aFloat12227 = class525_sub38.method16634(574628400);
	aFloat12226 = class525_sub38.method16634(-112864188);
    }
}
