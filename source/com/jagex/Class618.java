/* Class618 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class618
{
    int[] anIntArray8065;
    float aFloat8066;
    int anInt8067;
    float aFloat8068;
    Class446 aClass446_8069;
    int anInt8070;
    int anInt8071;
    Class174 aClass174_8072;
    float[] aFloatArray8073;
    float aFloat8074;
    float aFloat8075;
    float aFloat8076;
    float aFloat8077 = 1.0F;
    float aFloat8078 = 0.0F;
    float aFloat8079 = 1.0F;
    float aFloat8080 = 0.0F;
    float aFloat8081 = 1.0F;
    float aFloat8082;
    Class515 aClass515_8083;
    
    void method10116(byte i) {
	anInt8067 = 1423313113;
	aClass446_8069 = Class446.method7208(-50.0F, -60.0F, -50.0F);
	aFloat8066 = 1.1523438F;
	aFloat8074 = 0.69921875F;
	aFloat8082 = 1.2F;
	anInt8070 = 2130229240;
	anInt8071 = 0;
	aClass174_8072 = Class635.aClass174_8246;
	aFloat8076 = 1.0F;
	aFloat8068 = 0.25F;
	aFloat8075 = 1.0F;
	aClass515_8083 = Class678.aClass515_8621;
	aFloat8077 = 1.0F;
	aFloat8078 = 0.0F;
	aFloat8079 = 1.0F;
	aFloat8080 = 0.0F;
	aFloat8081 = 1.0F;
	int[] is = anIntArray8065;
	int[] is_0_ = anIntArray8065;
	anIntArray8065[2] = -1;
	is_0_[1] = -1;
	is[0] = -1;
	float[] fs = aFloatArray8073;
	float[] fs_1_ = aFloatArray8073;
	aFloatArray8073[2] = 0.0F;
	fs_1_[1] = 0.0F;
	fs[0] = 0.0F;
    }
    
    public Class618(RSBuffer class525_sub38, Class635 class635) {
	anIntArray8065 = new int[] { -1, -1, -1 };
	aFloatArray8073 = new float[] { 0.0F, 0.0F, 0.0F };
	method10127(class525_sub38, class635, 722224775);
    }
    
    public void method10117(RSBuffer class525_sub38) {
	method10123(class525_sub38, 0, -592898693);
    }
    
    void method10118(Class618 class618_2_, int i) {
	anInt8067 = 1 * class618_2_.anInt8067;
	aFloat8066 = class618_2_.aFloat8066;
	aFloat8074 = class618_2_.aFloat8074;
	aFloat8082 = class618_2_.aFloat8082;
	aClass446_8069.method7216(class618_2_.aClass446_8069);
	anInt8070 = 1 * class618_2_.anInt8070;
	anInt8071 = class618_2_.anInt8071 * 1;
	aClass174_8072 = class618_2_.aClass174_8072;
	aFloat8076 = class618_2_.aFloat8076;
	aFloat8068 = class618_2_.aFloat8068;
	aFloat8075 = class618_2_.aFloat8075;
	aClass515_8083 = class618_2_.aClass515_8083;
	aFloat8077 = class618_2_.aFloat8077;
	aFloat8078 = class618_2_.aFloat8078;
	aFloat8079 = class618_2_.aFloat8079;
	aFloat8080 = class618_2_.aFloat8080;
	aFloat8081 = class618_2_.aFloat8081;
	anIntArray8065[0] = class618_2_.anIntArray8065[0];
	anIntArray8065[1] = class618_2_.anIntArray8065[1];
	anIntArray8065[2] = class618_2_.anIntArray8065[2];
	aFloatArray8073[0] = class618_2_.aFloatArray8073[0];
	aFloatArray8073[1] = class618_2_.aFloatArray8073[1];
	aFloatArray8073[2] = class618_2_.aFloatArray8073[2];
    }
    
    void method10119(Class182 class182, Class618 class618_3_,
		     Class618 class618_4_, float f, int i) {
	anInt8067 = Class637.method10513(class618_3_.anInt8067 * -1643509609,
					 class618_4_.anInt8067 * -1643509609,
					 255.0F * f, -1463612022) * -769001689;
	aFloat8074 = (class618_3_.aFloat8074
		      + (class618_4_.aFloat8074 - class618_3_.aFloat8074) * f);
	aFloat8082 = (class618_3_.aFloat8082
		      + (class618_4_.aFloat8082 - class618_3_.aFloat8082) * f);
	aFloat8066 = (f * (class618_4_.aFloat8066 - class618_3_.aFloat8066)
		      + class618_3_.aFloat8066);
	aFloat8075 = (class618_3_.aFloat8075
		      + (class618_4_.aFloat8075 - class618_3_.aFloat8075) * f);
	aFloat8076 = (class618_3_.aFloat8076
		      + (class618_4_.aFloat8076 - class618_3_.aFloat8076) * f);
	aFloat8068 = (f * (class618_4_.aFloat8068 - class618_3_.aFloat8068)
		      + class618_3_.aFloat8068);
	anInt8070 = Class637.method10513(1494025451 * class618_3_.anInt8070,
					 1494025451 * class618_4_.anInt8070,
					 255.0F * f, 1229631125) * -462191677;
	anInt8071
	    = (362532219
	       * (int) ((float) (-2036201037 * class618_3_.anInt8071)
			+ f * (float) (-2036201037 * class618_4_.anInt8071
				       - (class618_3_.anInt8071
					  * -2036201037))));
	if (class618_3_.aClass174_8072 != class618_4_.aClass174_8072)
	    aClass174_8072 = class182.method3246(class618_3_.aClass174_8072,
						 class618_4_.aClass174_8072, f,
						 aClass174_8072);
	if (class618_4_.aClass515_8083 != class618_3_.aClass515_8083) {
	    if (null == class618_3_.aClass515_8083) {
		aClass515_8083 = class618_4_.aClass515_8083;
		if (null != aClass515_8083)
		    aClass515_8083.method8569((int) (255.0F * f), 0,
					      2034336276);
	    } else {
		aClass515_8083 = class618_3_.aClass515_8083;
		if (aClass515_8083 != null)
		    aClass515_8083.method8569((int) (255.0F * f), 255,
					      1906262563);
	    }
	}
	aFloat8077 = (f * (class618_4_.aFloat8077 - class618_3_.aFloat8077)
		      + class618_3_.aFloat8077);
	aFloat8078 = class618_3_.aFloat8078 + f * (class618_4_.aFloat8078
						   - class618_3_.aFloat8078);
	aFloat8079 = class618_3_.aFloat8079 + f * (class618_4_.aFloat8079
						   - class618_3_.aFloat8079);
	aFloat8080 = (class618_3_.aFloat8080
		      + (class618_4_.aFloat8080 - class618_3_.aFloat8080) * f);
	aFloat8081 = ((class618_4_.aFloat8081 - class618_3_.aFloat8081) * f
		      + class618_3_.aFloat8081);
	float f_5_
	    = (class618_3_.aFloatArray8073[1] + class618_3_.aFloatArray8073[0]
	       + class618_3_.aFloatArray8073[2]);
	float f_6_
	    = (class618_4_.aFloatArray8073[1] + class618_4_.aFloatArray8073[0]
	       + class618_4_.aFloatArray8073[2]);
	float f_7_ = f_5_ + f * (f_6_ - f_5_);
	if (0.0F == f_7_) {
	    int[] is = anIntArray8065;
	    int[] is_8_ = anIntArray8065;
	    anIntArray8065[2] = -1;
	    is_8_[1] = -1;
	    is[0] = -1;
	    float[] fs = aFloatArray8073;
	    float[] fs_9_ = aFloatArray8073;
	    aFloatArray8073[2] = 0.0F;
	    fs_9_[1] = 0.0F;
	    fs[0] = 0.0F;
	} else if (-1 == class618_3_.anIntArray8065[0]
		   && -1 == class618_3_.anIntArray8065[1]
		   && class618_3_.anIntArray8065[2] == -1) {
	    for (int i_10_ = 0; i_10_ < 3; i_10_++) {
		anIntArray8065[i_10_] = class618_4_.anIntArray8065[i_10_];
		if (-1 == anIntArray8065[i_10_])
		    aFloatArray8073[i_10_] = 0.0F;
		else
		    aFloatArray8073[i_10_]
			= class618_4_.aFloatArray8073[i_10_] * f;
	    }
	} else if (class618_4_.anIntArray8065[0] == -1
		   && -1 == class618_4_.anIntArray8065[1]
		   && -1 == class618_4_.anIntArray8065[2]) {
	    for (int i_11_ = 0; i_11_ < 3; i_11_++) {
		anIntArray8065[i_11_] = class618_3_.anIntArray8065[i_11_];
		if (-1 == anIntArray8065[i_11_])
		    aFloatArray8073[i_11_] = 0.0F;
		else
		    aFloatArray8073[i_11_]
			= class618_3_.aFloatArray8073[i_11_] * (1.0F - f);
	    }
	} else {
	    float f_12_ = 1.0F - f;
	    int i_13_ = 0;
	    int[] is = { -1, -1, -1, -1, -1, -1 };
	    float[] fs = { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
	    for (int i_14_ = 0; i_14_ < 3; i_14_++) {
		if (class618_3_.anIntArray8065[i_14_] > -1) {
		    is[i_13_] = class618_3_.anIntArray8065[i_14_];
		    fs[i_13_++] = class618_3_.aFloatArray8073[i_14_] * f_12_;
		}
	    }
	    int i_15_ = i_13_;
	    for (int i_16_ = 0; i_16_ < 3; i_16_++) {
		if (class618_4_.anIntArray8065[i_16_] > -1) {
		    float f_17_ = f * class618_4_.aFloatArray8073[i_16_];
		    for (int i_18_ = 0; i_18_ < i_15_; i_18_++) {
			if (class618_4_.anIntArray8065[i_16_] == is[i_18_]) {
			    fs[i_18_] += f_17_;
			    break;
			}
			if (i_15_ - 1 == i_18_) {
			    is[i_13_] = class618_4_.anIntArray8065[i_16_];
			    fs[i_13_++] = f_17_;
			}
		    }
		}
	    }
	    if (i_13_ > 3) {
		float f_19_ = 0.0F;
		float f_20_ = 0.0F;
		for (int i_21_ = 0; i_21_ < i_13_; i_21_++)
		    f_19_ += fs[i_21_];
		Class544.method8928(fs, is, 0, i_13_ - 1, (byte) -16);
		for (int i_22_ = 0; i_22_ < 3; i_22_++)
		    f_20_ += fs[i_22_];
		float f_23_ = f_19_ / f_20_;
		for (int i_24_ = 0; i_24_ < 3; i_24_++)
		    fs[i_24_] *= f_23_;
	    }
	    for (int i_25_ = 0; i_25_ < 3; i_25_++) {
		anIntArray8065[i_25_] = is[i_25_];
		aFloatArray8073[i_25_] = fs[i_25_];
	    }
	}
    }
    
    public void method10120(RSBuffer class525_sub38) {
	method10123(class525_sub38, 0, -1369676422);
    }
    
    public void method10121(RSBuffer class525_sub38, int i) {
	aFloat8076 = class525_sub38.method16634(-1118989493);
	aFloat8068 = class525_sub38.method16634(-820207617);
	aFloat8075 = class525_sub38.method16634(-1088182601);
    }
    
    public void method10122(RSBuffer class525_sub38, int i) {
	method10123(class525_sub38, 0, 1987188589);
    }
    
    void method10123(RSBuffer class525_sub38, int i, int i_26_) {
	anIntArray8065[i] = class525_sub38.readUnsignedShort((byte) 56);
	aFloatArray8073[i] = class525_sub38.method16634(571822899);
    }
    
    public void method10124(RSBuffer class525_sub38) {
	method10123(class525_sub38, 0, 1338917492);
    }
    
    boolean method10125(Class618 class618_27_, byte i) {
	return (-1643509609 * anInt8067 == -1643509609 * class618_27_.anInt8067
		&& class618_27_.aFloat8066 == aFloat8066
		&& aFloat8074 == class618_27_.aFloat8074
		&& class618_27_.aFloat8082 == aFloat8082
		&& aFloat8068 == class618_27_.aFloat8068
		&& aFloat8076 == class618_27_.aFloat8076
		&& class618_27_.aFloat8075 == aFloat8075
		&& (class618_27_.anInt8070 * 1494025451
		    == 1494025451 * anInt8070)
		&& (-2036201037 * anInt8071
		    == -2036201037 * class618_27_.anInt8071)
		&& aClass174_8072 == class618_27_.aClass174_8072
		&& aClass515_8083 == class618_27_.aClass515_8083
		&& class618_27_.aFloat8077 == aFloat8077
		&& aFloat8078 == class618_27_.aFloat8078
		&& aFloat8079 == class618_27_.aFloat8079
		&& class618_27_.aFloat8080 == aFloat8080
		&& aFloat8081 == class618_27_.aFloat8081
		&& anIntArray8065[0] == class618_27_.anIntArray8065[0]
		&& anIntArray8065[1] == class618_27_.anIntArray8065[1]
		&& anIntArray8065[2] == class618_27_.anIntArray8065[2]
		&& aFloatArray8073[0] == class618_27_.aFloatArray8073[0]
		&& aFloatArray8073[1] == class618_27_.aFloatArray8073[1]
		&& aFloatArray8073[2] == class618_27_.aFloatArray8073[2]);
    }
    
    void method10126(Class635 class635, Class645 class645, byte i) {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		.method17050(501271953) == 1
	    && Class501.aClass182_5564.method3242() > 0) {
	    if (class645.method10623(-778022792) != -1)
		anInt8067 = class645.method10623(-778022792) * -769001689;
	    if (class645.method10624((byte) 34) != -1.0F)
		aFloat8066 = class645.method10624((byte) 34);
	    if (class645.method10625((byte) 6) != -1.0F)
		aFloat8074 = class645.method10625((byte) 6);
	    if (class645.method10626(-2143210563) != -1.0F)
		aFloat8082 = class645.method10626(-2140432815);
	}
	if (class645.method10627(1814628678) != null)
	    aClass446_8069.method7216(class645.method10627(2056125877));
	if (class645.method10628(320362971) != -1)
	    anInt8070 = class645.method10628(320362971) * -462191677;
	if (class645.method10653(546580414) != -1)
	    anInt8071 = class645.method10653(1151656150) * 362532219;
	if (class645.method10630((byte) 7) != -1.0F)
	    aFloat8068 = class645.method10630((byte) 13);
	if (class645.method10651((byte) 123) != -1.0F)
	    aFloat8075 = class645.method10651((byte) 121);
	if (class645.method10632((byte) 74) != -1.0F)
	    aFloat8076 = class645.method10632((byte) 99);
	if (class645.method10620((byte) 33) != -1)
	    aClass174_8072
		= class635.method10448(class645.method10620((byte) 61),
				       -1199208146);
	if (class645.method10647(389250319) != -1) {
	    int i_28_ = class645.method10647(389250319);
	    int i_29_ = class645.method10622((byte) 13);
	    int i_30_ = class645.method10636(-1251599951);
	    int i_31_ = class645.method10668(192126774);
	    int i_32_ = class645.method10634(-671181231);
	    Class108.anInt1310 = i_32_ * -1193854819;
	    aClass515_8083
		= class635.method10390(i_28_, i_29_, i_30_, i_31_, -376153959);
	}
	if (class645.method10639(0, 1886822663) != -1) {
	    anIntArray8065[0] = class645.method10639(0, -39885961);
	    aFloatArray8073[0] = class645.method10640(0, (byte) 2);
	}
	if (class645.method10639(1, 1196097895) != -1) {
	    anIntArray8065[1] = class645.method10639(1, -1216290163);
	    aFloatArray8073[1] = class645.method10640(1, (byte) 2);
	}
	if (class645.method10639(2, -468293611) != -1) {
	    anIntArray8065[2] = class645.method10639(2, -686232002);
	    aFloatArray8073[2] = class645.method10640(2, (byte) 2);
	}
    }
    
    public void method10127(RSBuffer class525_sub38, Class635 class635,
                            int i) {
	int i_33_ = class525_sub38.readUnsignedByte(1206319189);
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		.method17050(501271953) == 1
	    && Class501.aClass182_5564.method3242() > 0) {
	    if ((i_33_ & -2004594599 * Class655.aClass655_8401.anInt8426) != 0)
		anInt8067
		    = class525_sub38.readInt(1769321246) * -769001689;
	    else
		anInt8067 = 1423313113;
	    if ((i_33_ & Class655.aClass655_8407.anInt8426 * -2004594599) != 0)
		aFloat8066
		    = (float) class525_sub38.readUnsignedShort((byte) 110) / 256.0F;
	    else
		aFloat8066 = 1.1523438F;
	    if (0 != (i_33_ & -2004594599 * Class655.aClass655_8403.anInt8426))
		aFloat8074
		    = (float) class525_sub38.readUnsignedShort((byte) 103) / 256.0F;
	    else
		aFloat8074 = 0.69921875F;
	    if ((i_33_ & -2004594599 * Class655.aClass655_8404.anInt8426) != 0)
		aFloat8082
		    = (float) class525_sub38.readUnsignedShort((byte) 40) / 256.0F;
	    else
		aFloat8082 = 1.2F;
	} else {
	    if ((i_33_ & Class655.aClass655_8401.anInt8426 * -2004594599) != 0)
		class525_sub38.readInt(1058924054);
	    if ((i_33_ & Class655.aClass655_8407.anInt8426 * -2004594599) != 0)
		class525_sub38.readUnsignedShort((byte) 58);
	    if ((i_33_ & Class655.aClass655_8403.anInt8426 * -2004594599) != 0)
		class525_sub38.readUnsignedShort((byte) 30);
	    if (0 != (i_33_ & -2004594599 * Class655.aClass655_8404.anInt8426))
		class525_sub38.readUnsignedShort((byte) 80);
	    anInt8067 = 1423313113;
	    aFloat8082 = 1.2F;
	    aFloat8074 = 0.69921875F;
	    aFloat8066 = 1.1523438F;
	}
	if ((i_33_ & Class655.aClass655_8405.anInt8426 * -2004594599) != 0)
	    aClass446_8069
		= Class446.method7208((float) class525_sub38
						  .readSmart((byte) -23),
				      (float) class525_sub38
						  .readSmart((byte) 32),
				      (float) class525_sub38
						  .readSmart((byte) -18));
	else
	    aClass446_8069 = Class446.method7208(-50.0F, -60.0F, -50.0F);
	if (0 != (i_33_ & -2004594599 * Class655.aClass655_8406.anInt8426))
	    anInt8070 = class525_sub38.readInt(1633822123) * -462191677;
	else
	    anInt8070 = 2130229240;
	if (0 != (i_33_ & Class655.aClass655_8416.anInt8426 * -2004594599))
	    anInt8071 = class525_sub38.readUnsignedShort((byte) 34) * 362532219;
	else
	    anInt8071 = 0;
	if ((i_33_ & -2004594599 * Class655.aClass655_8408.anInt8426) != 0) {
	    int i_34_ = class525_sub38.readUnsignedShort((byte) 95);
	    aClass174_8072 = class635.method10448(i_34_, -1977733584);
	} else
	    aClass174_8072 = Class635.aClass174_8246;
    }
    
    public Class515 method10128(int i) {
	return aClass515_8083;
    }
    
    void method10129() {
	anInt8067 = 1423313113;
	aClass446_8069 = Class446.method7208(-50.0F, -60.0F, -50.0F);
	aFloat8066 = 1.1523438F;
	aFloat8074 = 0.69921875F;
	aFloat8082 = 1.2F;
	anInt8070 = 2130229240;
	anInt8071 = 0;
	aClass174_8072 = Class635.aClass174_8246;
	aFloat8076 = 1.0F;
	aFloat8068 = 0.25F;
	aFloat8075 = 1.0F;
	aClass515_8083 = Class678.aClass515_8621;
	aFloat8077 = 1.0F;
	aFloat8078 = 0.0F;
	aFloat8079 = 1.0F;
	aFloat8080 = 0.0F;
	aFloat8081 = 1.0F;
	int[] is = anIntArray8065;
	int[] is_35_ = anIntArray8065;
	anIntArray8065[2] = -1;
	is_35_[1] = -1;
	is[0] = -1;
	float[] fs = aFloatArray8073;
	float[] fs_36_ = aFloatArray8073;
	aFloatArray8073[2] = 0.0F;
	fs_36_[1] = 0.0F;
	fs[0] = 0.0F;
    }
    
    void method10130(Class635 class635, Class645 class645) {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		.method17050(501271953) == 1
	    && Class501.aClass182_5564.method3242() > 0) {
	    if (class645.method10623(-778022792) != -1)
		anInt8067 = class645.method10623(-778022792) * -769001689;
	    if (class645.method10624((byte) 34) != -1.0F)
		aFloat8066 = class645.method10624((byte) 34);
	    if (class645.method10625((byte) 6) != -1.0F)
		aFloat8074 = class645.method10625((byte) 6);
	    if (class645.method10626(-2140312676) != -1.0F)
		aFloat8082 = class645.method10626(-2135598813);
	}
	if (class645.method10627(1073688662) != null)
	    aClass446_8069.method7216(class645.method10627(1653399511));
	if (class645.method10628(320362971) != -1)
	    anInt8070 = class645.method10628(320362971) * -462191677;
	if (class645.method10653(575930754) != -1)
	    anInt8071 = class645.method10653(922795884) * 362532219;
	if (class645.method10630((byte) 110) != -1.0F)
	    aFloat8068 = class645.method10630((byte) 126);
	if (class645.method10651((byte) 125) != -1.0F)
	    aFloat8075 = class645.method10651((byte) 124);
	if (class645.method10632((byte) 75) != -1.0F)
	    aFloat8076 = class645.method10632((byte) 34);
	if (class645.method10620((byte) 89) != -1)
	    aClass174_8072
		= class635.method10448(class645.method10620((byte) 57),
				       -1533430365);
	if (class645.method10647(389250319) != -1) {
	    int i = class645.method10647(389250319);
	    int i_37_ = class645.method10622((byte) 89);
	    int i_38_ = class645.method10636(1803308471);
	    int i_39_ = class645.method10668(-72761622);
	    int i_40_ = class645.method10634(-1466343805);
	    Class108.anInt1310 = i_40_ * -1193854819;
	    aClass515_8083
		= class635.method10390(i, i_37_, i_38_, i_39_, -2121709148);
	}
	if (class645.method10639(0, -378648477) != -1) {
	    anIntArray8065[0] = class645.method10639(0, 201541119);
	    aFloatArray8073[0] = class645.method10640(0, (byte) 2);
	}
	if (class645.method10639(1, 1487346526) != -1) {
	    anIntArray8065[1] = class645.method10639(1, -1873521872);
	    aFloatArray8073[1] = class645.method10640(1, (byte) 2);
	}
	if (class645.method10639(2, -41458184) != -1) {
	    anIntArray8065[2] = class645.method10639(2, 667916549);
	    aFloatArray8073[2] = class645.method10640(2, (byte) 2);
	}
    }
    
    void method10131(Class618 class618_41_) {
	anInt8067 = 1 * class618_41_.anInt8067;
	aFloat8066 = class618_41_.aFloat8066;
	aFloat8074 = class618_41_.aFloat8074;
	aFloat8082 = class618_41_.aFloat8082;
	aClass446_8069.method7216(class618_41_.aClass446_8069);
	anInt8070 = 1 * class618_41_.anInt8070;
	anInt8071 = class618_41_.anInt8071 * 1;
	aClass174_8072 = class618_41_.aClass174_8072;
	aFloat8076 = class618_41_.aFloat8076;
	aFloat8068 = class618_41_.aFloat8068;
	aFloat8075 = class618_41_.aFloat8075;
	aClass515_8083 = class618_41_.aClass515_8083;
	aFloat8077 = class618_41_.aFloat8077;
	aFloat8078 = class618_41_.aFloat8078;
	aFloat8079 = class618_41_.aFloat8079;
	aFloat8080 = class618_41_.aFloat8080;
	aFloat8081 = class618_41_.aFloat8081;
	anIntArray8065[0] = class618_41_.anIntArray8065[0];
	anIntArray8065[1] = class618_41_.anIntArray8065[1];
	anIntArray8065[2] = class618_41_.anIntArray8065[2];
	aFloatArray8073[0] = class618_41_.aFloatArray8073[0];
	aFloatArray8073[1] = class618_41_.aFloatArray8073[1];
	aFloatArray8073[2] = class618_41_.aFloatArray8073[2];
    }
    
    public Class618() {
	anIntArray8065 = new int[] { -1, -1, -1 };
	aFloatArray8073 = new float[] { 0.0F, 0.0F, 0.0F };
	method10116((byte) 1);
    }
    
    void method10132(Class182 class182, Class618 class618_42_,
		     Class618 class618_43_, float f) {
	anInt8067 = Class637.method10513(class618_42_.anInt8067 * -1643509609,
					 class618_43_.anInt8067 * -1643509609,
					 255.0F * f, 1266997743) * -769001689;
	aFloat8074 = class618_42_.aFloat8074 + (class618_43_.aFloat8074
						- class618_42_.aFloat8074) * f;
	aFloat8082 = class618_42_.aFloat8082 + (class618_43_.aFloat8082
						- class618_42_.aFloat8082) * f;
	aFloat8066 = (f * (class618_43_.aFloat8066 - class618_42_.aFloat8066)
		      + class618_42_.aFloat8066);
	aFloat8075 = class618_42_.aFloat8075 + (class618_43_.aFloat8075
						- class618_42_.aFloat8075) * f;
	aFloat8076 = class618_42_.aFloat8076 + (class618_43_.aFloat8076
						- class618_42_.aFloat8076) * f;
	aFloat8068 = (f * (class618_43_.aFloat8068 - class618_42_.aFloat8068)
		      + class618_42_.aFloat8068);
	anInt8070 = Class637.method10513(1494025451 * class618_42_.anInt8070,
					 1494025451 * class618_43_.anInt8070,
					 255.0F * f, 1541056327) * -462191677;
	anInt8071
	    = (362532219
	       * (int) ((float) (-2036201037 * class618_42_.anInt8071)
			+ f * (float) (-2036201037 * class618_43_.anInt8071
				       - (class618_42_.anInt8071
					  * -2036201037))));
	if (class618_42_.aClass174_8072 != class618_43_.aClass174_8072)
	    aClass174_8072 = class182.method3246(class618_42_.aClass174_8072,
						 class618_43_.aClass174_8072,
						 f, aClass174_8072);
	if (class618_43_.aClass515_8083 != class618_42_.aClass515_8083) {
	    if (null == class618_42_.aClass515_8083) {
		aClass515_8083 = class618_43_.aClass515_8083;
		if (null != aClass515_8083)
		    aClass515_8083.method8569((int) (255.0F * f), 0,
					      1903199876);
	    } else {
		aClass515_8083 = class618_42_.aClass515_8083;
		if (aClass515_8083 != null)
		    aClass515_8083.method8569((int) (255.0F * f), 255,
					      1921783492);
	    }
	}
	aFloat8077 = (f * (class618_43_.aFloat8077 - class618_42_.aFloat8077)
		      + class618_42_.aFloat8077);
	aFloat8078 = class618_42_.aFloat8078 + f * (class618_43_.aFloat8078
						    - class618_42_.aFloat8078);
	aFloat8079 = class618_42_.aFloat8079 + f * (class618_43_.aFloat8079
						    - class618_42_.aFloat8079);
	aFloat8080 = class618_42_.aFloat8080 + (class618_43_.aFloat8080
						- class618_42_.aFloat8080) * f;
	aFloat8081 = ((class618_43_.aFloat8081 - class618_42_.aFloat8081) * f
		      + class618_42_.aFloat8081);
	float f_44_ = (class618_42_.aFloatArray8073[1]
		       + class618_42_.aFloatArray8073[0]
		       + class618_42_.aFloatArray8073[2]);
	float f_45_ = (class618_43_.aFloatArray8073[1]
		       + class618_43_.aFloatArray8073[0]
		       + class618_43_.aFloatArray8073[2]);
	float f_46_ = f_44_ + f * (f_45_ - f_44_);
	if (0.0F == f_46_) {
	    int[] is = anIntArray8065;
	    int[] is_47_ = anIntArray8065;
	    anIntArray8065[2] = -1;
	    is_47_[1] = -1;
	    is[0] = -1;
	    float[] fs = aFloatArray8073;
	    float[] fs_48_ = aFloatArray8073;
	    aFloatArray8073[2] = 0.0F;
	    fs_48_[1] = 0.0F;
	    fs[0] = 0.0F;
	} else if (-1 == class618_42_.anIntArray8065[0]
		   && -1 == class618_42_.anIntArray8065[1]
		   && class618_42_.anIntArray8065[2] == -1) {
	    for (int i = 0; i < 3; i++) {
		anIntArray8065[i] = class618_43_.anIntArray8065[i];
		if (-1 == anIntArray8065[i])
		    aFloatArray8073[i] = 0.0F;
		else
		    aFloatArray8073[i] = class618_43_.aFloatArray8073[i] * f;
	    }
	} else if (class618_43_.anIntArray8065[0] == -1
		   && -1 == class618_43_.anIntArray8065[1]
		   && -1 == class618_43_.anIntArray8065[2]) {
	    for (int i = 0; i < 3; i++) {
		anIntArray8065[i] = class618_42_.anIntArray8065[i];
		if (-1 == anIntArray8065[i])
		    aFloatArray8073[i] = 0.0F;
		else
		    aFloatArray8073[i]
			= class618_42_.aFloatArray8073[i] * (1.0F - f);
	    }
	} else {
	    float f_49_ = 1.0F - f;
	    int i = 0;
	    int[] is = { -1, -1, -1, -1, -1, -1 };
	    float[] fs = { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
	    for (int i_50_ = 0; i_50_ < 3; i_50_++) {
		if (class618_42_.anIntArray8065[i_50_] > -1) {
		    is[i] = class618_42_.anIntArray8065[i_50_];
		    fs[i++] = class618_42_.aFloatArray8073[i_50_] * f_49_;
		}
	    }
	    int i_51_ = i;
	    for (int i_52_ = 0; i_52_ < 3; i_52_++) {
		if (class618_43_.anIntArray8065[i_52_] > -1) {
		    float f_53_ = f * class618_43_.aFloatArray8073[i_52_];
		    for (int i_54_ = 0; i_54_ < i_51_; i_54_++) {
			if (class618_43_.anIntArray8065[i_52_] == is[i_54_]) {
			    fs[i_54_] += f_53_;
			    break;
			}
			if (i_51_ - 1 == i_54_) {
			    is[i] = class618_43_.anIntArray8065[i_52_];
			    fs[i++] = f_53_;
			}
		    }
		}
	    }
	    if (i > 3) {
		float f_55_ = 0.0F;
		float f_56_ = 0.0F;
		for (int i_57_ = 0; i_57_ < i; i_57_++)
		    f_55_ += fs[i_57_];
		Class544.method8928(fs, is, 0, i - 1, (byte) -54);
		for (int i_58_ = 0; i_58_ < 3; i_58_++)
		    f_56_ += fs[i_58_];
		float f_59_ = f_55_ / f_56_;
		for (int i_60_ = 0; i_60_ < 3; i_60_++)
		    fs[i_60_] *= f_59_;
	    }
	    for (int i_61_ = 0; i_61_ < 3; i_61_++) {
		anIntArray8065[i_61_] = is[i_61_];
		aFloatArray8073[i_61_] = fs[i_61_];
	    }
	}
    }
    
    public void method10133(RSBuffer class525_sub38, Class635 class635) {
	int i = class525_sub38.readUnsignedByte(1034753432);
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		.method17050(501271953) == 1
	    && Class501.aClass182_5564.method3242() > 0) {
	    if ((i & -2004594599 * Class655.aClass655_8401.anInt8426) != 0)
		anInt8067
		    = class525_sub38.readInt(1463793303) * -769001689;
	    else
		anInt8067 = 1423313113;
	    if ((i & Class655.aClass655_8407.anInt8426 * -2004594599) != 0)
		aFloat8066
		    = (float) class525_sub38.readUnsignedShort((byte) 115) / 256.0F;
	    else
		aFloat8066 = 1.1523438F;
	    if (0 != (i & -2004594599 * Class655.aClass655_8403.anInt8426))
		aFloat8074
		    = (float) class525_sub38.readUnsignedShort((byte) 120) / 256.0F;
	    else
		aFloat8074 = 0.69921875F;
	    if ((i & -2004594599 * Class655.aClass655_8404.anInt8426) != 0)
		aFloat8082
		    = (float) class525_sub38.readUnsignedShort((byte) 9) / 256.0F;
	    else
		aFloat8082 = 1.2F;
	} else {
	    if ((i & Class655.aClass655_8401.anInt8426 * -2004594599) != 0)
		class525_sub38.readInt(1326076331);
	    if ((i & Class655.aClass655_8407.anInt8426 * -2004594599) != 0)
		class525_sub38.readUnsignedShort((byte) 63);
	    if ((i & Class655.aClass655_8403.anInt8426 * -2004594599) != 0)
		class525_sub38.readUnsignedShort((byte) 96);
	    if (0 != (i & -2004594599 * Class655.aClass655_8404.anInt8426))
		class525_sub38.readUnsignedShort((byte) 39);
	    anInt8067 = 1423313113;
	    aFloat8082 = 1.2F;
	    aFloat8074 = 0.69921875F;
	    aFloat8066 = 1.1523438F;
	}
	if ((i & Class655.aClass655_8405.anInt8426 * -2004594599) != 0)
	    aClass446_8069
		= Class446.method7208((float) class525_sub38
						  .readSmart((byte) -9),
				      (float) class525_sub38
						  .readSmart((byte) 59),
				      (float) class525_sub38
						  .readSmart((byte) 55));
	else
	    aClass446_8069 = Class446.method7208(-50.0F, -60.0F, -50.0F);
	if (0 != (i & -2004594599 * Class655.aClass655_8406.anInt8426))
	    anInt8070 = class525_sub38.readInt(1237389205) * -462191677;
	else
	    anInt8070 = 2130229240;
	if (0 != (i & Class655.aClass655_8416.anInt8426 * -2004594599))
	    anInt8071 = class525_sub38.readUnsignedShort((byte) 118) * 362532219;
	else
	    anInt8071 = 0;
	if ((i & -2004594599 * Class655.aClass655_8408.anInt8426) != 0) {
	    int i_62_ = class525_sub38.readUnsignedShort((byte) 68);
	    aClass174_8072 = class635.method10448(i_62_, -1456365197);
	} else
	    aClass174_8072 = Class635.aClass174_8246;
    }
    
    public void method10134(RSBuffer class525_sub38, Class635 class635) {
	int i = class525_sub38.readUnsignedByte(1002816845);
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		.method17050(501271953) == 1
	    && Class501.aClass182_5564.method3242() > 0) {
	    if ((i & -2004594599 * Class655.aClass655_8401.anInt8426) != 0)
		anInt8067
		    = class525_sub38.readInt(1568570638) * -769001689;
	    else
		anInt8067 = 1423313113;
	    if ((i & Class655.aClass655_8407.anInt8426 * -2004594599) != 0)
		aFloat8066
		    = (float) class525_sub38.readUnsignedShort((byte) 57) / 256.0F;
	    else
		aFloat8066 = 1.1523438F;
	    if (0 != (i & -2004594599 * Class655.aClass655_8403.anInt8426))
		aFloat8074
		    = (float) class525_sub38.readUnsignedShort((byte) 96) / 256.0F;
	    else
		aFloat8074 = 0.69921875F;
	    if ((i & -2004594599 * Class655.aClass655_8404.anInt8426) != 0)
		aFloat8082
		    = (float) class525_sub38.readUnsignedShort((byte) 119) / 256.0F;
	    else
		aFloat8082 = 1.2F;
	} else {
	    if ((i & Class655.aClass655_8401.anInt8426 * -2004594599) != 0)
		class525_sub38.readInt(1191112081);
	    if ((i & Class655.aClass655_8407.anInt8426 * -2004594599) != 0)
		class525_sub38.readUnsignedShort((byte) 22);
	    if ((i & Class655.aClass655_8403.anInt8426 * -2004594599) != 0)
		class525_sub38.readUnsignedShort((byte) 10);
	    if (0 != (i & -2004594599 * Class655.aClass655_8404.anInt8426))
		class525_sub38.readUnsignedShort((byte) 105);
	    anInt8067 = 1423313113;
	    aFloat8082 = 1.2F;
	    aFloat8074 = 0.69921875F;
	    aFloat8066 = 1.1523438F;
	}
	if ((i & Class655.aClass655_8405.anInt8426 * -2004594599) != 0)
	    aClass446_8069
		= Class446.method7208((float) class525_sub38
						  .readSmart((byte) -15),
				      (float) class525_sub38
						  .readSmart((byte) 116),
				      (float) class525_sub38
						  .readSmart((byte) -14));
	else
	    aClass446_8069 = Class446.method7208(-50.0F, -60.0F, -50.0F);
	if (0 != (i & -2004594599 * Class655.aClass655_8406.anInt8426))
	    anInt8070 = class525_sub38.readInt(1192990832) * -462191677;
	else
	    anInt8070 = 2130229240;
	if (0 != (i & Class655.aClass655_8416.anInt8426 * -2004594599))
	    anInt8071 = class525_sub38.readUnsignedShort((byte) 55) * 362532219;
	else
	    anInt8071 = 0;
	if ((i & -2004594599 * Class655.aClass655_8408.anInt8426) != 0) {
	    int i_63_ = class525_sub38.readUnsignedShort((byte) 79);
	    aClass174_8072 = class635.method10448(i_63_, -1765682634);
	} else
	    aClass174_8072 = Class635.aClass174_8246;
    }
    
    public void method10135(RSBuffer class525_sub38, Class635 class635) {
	int i = class525_sub38.readUnsignedByte(673376605);
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		.method17050(501271953) == 1
	    && Class501.aClass182_5564.method3242() > 0) {
	    if ((i & -2004594599 * Class655.aClass655_8401.anInt8426) != 0)
		anInt8067
		    = class525_sub38.readInt(1383012998) * -769001689;
	    else
		anInt8067 = 1423313113;
	    if ((i & Class655.aClass655_8407.anInt8426 * -2004594599) != 0)
		aFloat8066
		    = (float) class525_sub38.readUnsignedShort((byte) 10) / 256.0F;
	    else
		aFloat8066 = 1.1523438F;
	    if (0 != (i & -2004594599 * Class655.aClass655_8403.anInt8426))
		aFloat8074
		    = (float) class525_sub38.readUnsignedShort((byte) 103) / 256.0F;
	    else
		aFloat8074 = 0.69921875F;
	    if ((i & -2004594599 * Class655.aClass655_8404.anInt8426) != 0)
		aFloat8082
		    = (float) class525_sub38.readUnsignedShort((byte) 22) / 256.0F;
	    else
		aFloat8082 = 1.2F;
	} else {
	    if ((i & Class655.aClass655_8401.anInt8426 * -2004594599) != 0)
		class525_sub38.readInt(1341174867);
	    if ((i & Class655.aClass655_8407.anInt8426 * -2004594599) != 0)
		class525_sub38.readUnsignedShort((byte) 95);
	    if ((i & Class655.aClass655_8403.anInt8426 * -2004594599) != 0)
		class525_sub38.readUnsignedShort((byte) 108);
	    if (0 != (i & -2004594599 * Class655.aClass655_8404.anInt8426))
		class525_sub38.readUnsignedShort((byte) 37);
	    anInt8067 = 1423313113;
	    aFloat8082 = 1.2F;
	    aFloat8074 = 0.69921875F;
	    aFloat8066 = 1.1523438F;
	}
	if ((i & Class655.aClass655_8405.anInt8426 * -2004594599) != 0)
	    aClass446_8069
		= Class446.method7208((float) class525_sub38
						  .readSmart((byte) 21),
				      (float) class525_sub38
						  .readSmart((byte) -8),
				      (float) class525_sub38
						  .readSmart((byte) -21));
	else
	    aClass446_8069 = Class446.method7208(-50.0F, -60.0F, -50.0F);
	if (0 != (i & -2004594599 * Class655.aClass655_8406.anInt8426))
	    anInt8070 = class525_sub38.readInt(2131422410) * -462191677;
	else
	    anInt8070 = 2130229240;
	if (0 != (i & Class655.aClass655_8416.anInt8426 * -2004594599))
	    anInt8071 = class525_sub38.readUnsignedShort((byte) 24) * 362532219;
	else
	    anInt8071 = 0;
	if ((i & -2004594599 * Class655.aClass655_8408.anInt8426) != 0) {
	    int i_64_ = class525_sub38.readUnsignedShort((byte) 63);
	    aClass174_8072 = class635.method10448(i_64_, -1334332753);
	} else
	    aClass174_8072 = Class635.aClass174_8246;
    }
    
    public void method10136(RSBuffer class525_sub38) {
	aFloat8076 = class525_sub38.method16634(-768518724);
	aFloat8068 = class525_sub38.method16634(-930428404);
	aFloat8075 = class525_sub38.method16634(141328846);
    }
    
    public void method10137(RSBuffer class525_sub38) {
	aFloat8076 = class525_sub38.method16634(-689556314);
	aFloat8068 = class525_sub38.method16634(-43427250);
	aFloat8075 = class525_sub38.method16634(283345516);
    }
    
    void method10138(RSBuffer class525_sub38, int i) {
	anIntArray8065[i] = class525_sub38.readUnsignedShort((byte) 119);
	aFloatArray8073[i] = class525_sub38.method16634(-120303287);
    }
    
    public void method10139(RSBuffer class525_sub38) {
	method10123(class525_sub38, 0, 486275711);
    }
    
    void method10140(Class618 class618_65_) {
	anInt8067 = 1 * class618_65_.anInt8067;
	aFloat8066 = class618_65_.aFloat8066;
	aFloat8074 = class618_65_.aFloat8074;
	aFloat8082 = class618_65_.aFloat8082;
	aClass446_8069.method7216(class618_65_.aClass446_8069);
	anInt8070 = 1 * class618_65_.anInt8070;
	anInt8071 = class618_65_.anInt8071 * 1;
	aClass174_8072 = class618_65_.aClass174_8072;
	aFloat8076 = class618_65_.aFloat8076;
	aFloat8068 = class618_65_.aFloat8068;
	aFloat8075 = class618_65_.aFloat8075;
	aClass515_8083 = class618_65_.aClass515_8083;
	aFloat8077 = class618_65_.aFloat8077;
	aFloat8078 = class618_65_.aFloat8078;
	aFloat8079 = class618_65_.aFloat8079;
	aFloat8080 = class618_65_.aFloat8080;
	aFloat8081 = class618_65_.aFloat8081;
	anIntArray8065[0] = class618_65_.anIntArray8065[0];
	anIntArray8065[1] = class618_65_.anIntArray8065[1];
	anIntArray8065[2] = class618_65_.anIntArray8065[2];
	aFloatArray8073[0] = class618_65_.aFloatArray8073[0];
	aFloatArray8073[1] = class618_65_.aFloatArray8073[1];
	aFloatArray8073[2] = class618_65_.aFloatArray8073[2];
    }
    
    public void method10141(RSBuffer class525_sub38, Class635 class635,
                            int i) {
	int i_66_ = class525_sub38.readUnsignedShort((byte) 104);
	int i_67_ = class525_sub38.readSmart((byte) -62);
	int i_68_ = class525_sub38.readSmart((byte) 63);
	int i_69_ = class525_sub38.readSmart((byte) -22);
	int i_70_ = class525_sub38.readUnsignedShort((byte) 126);
	Class108.anInt1310 = i_70_ * -1193854819;
	aClass515_8083
	    = class635.method10390(i_66_, i_67_, i_68_, i_69_, -928883784);
    }
    
    public void method10142(RSBuffer class525_sub38, Class635 class635) {
	int i = class525_sub38.readUnsignedShort((byte) 17);
	int i_71_ = class525_sub38.readSmart((byte) -72);
	int i_72_ = class525_sub38.readSmart((byte) 20);
	int i_73_ = class525_sub38.readSmart((byte) 4);
	int i_74_ = class525_sub38.readUnsignedShort((byte) 27);
	Class108.anInt1310 = i_74_ * -1193854819;
	aClass515_8083
	    = class635.method10390(i, i_71_, i_72_, i_73_, -1247419538);
    }
    
    void method10143(RSBuffer class525_sub38, int i) {
	anIntArray8065[i] = class525_sub38.readUnsignedShort((byte) 69);
	aFloatArray8073[i] = class525_sub38.method16634(-589999166);
    }
    
    void method10144(RSBuffer class525_sub38, int i) {
	anIntArray8065[i] = class525_sub38.readUnsignedShort((byte) 6);
	aFloatArray8073[i] = class525_sub38.method16634(-735608249);
    }
    
    void method10145(Class635 class635, Class645 class645) {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		.method17050(501271953) == 1
	    && Class501.aClass182_5564.method3242() > 0) {
	    if (class645.method10623(-778022792) != -1)
		anInt8067 = class645.method10623(-778022792) * -769001689;
	    if (class645.method10624((byte) 34) != -1.0F)
		aFloat8066 = class645.method10624((byte) 34);
	    if (class645.method10625((byte) 6) != -1.0F)
		aFloat8074 = class645.method10625((byte) 6);
	    if (class645.method10626(-2131219961) != -1.0F)
		aFloat8082 = class645.method10626(-2130332690);
	}
	if (class645.method10627(2079309474) != null)
	    aClass446_8069.method7216(class645.method10627(1025742639));
	if (class645.method10628(320362971) != -1)
	    anInt8070 = class645.method10628(320362971) * -462191677;
	if (class645.method10653(1399069816) != -1)
	    anInt8071 = class645.method10653(-276984111) * 362532219;
	if (class645.method10630((byte) 123) != -1.0F)
	    aFloat8068 = class645.method10630((byte) 94);
	if (class645.method10651((byte) 126) != -1.0F)
	    aFloat8075 = class645.method10651((byte) 127);
	if (class645.method10632((byte) 64) != -1.0F)
	    aFloat8076 = class645.method10632((byte) 73);
	if (class645.method10620((byte) 30) != -1)
	    aClass174_8072
		= class635.method10448(class645.method10620((byte) 19),
				       -1614429035);
	if (class645.method10647(389250319) != -1) {
	    int i = class645.method10647(389250319);
	    int i_75_ = class645.method10622((byte) 34);
	    int i_76_ = class645.method10636(-717124720);
	    int i_77_ = class645.method10668(-607368432);
	    int i_78_ = class645.method10634(-1620459783);
	    Class108.anInt1310 = i_78_ * -1193854819;
	    aClass515_8083
		= class635.method10390(i, i_75_, i_76_, i_77_, -569341205);
	}
	if (class645.method10639(0, 1489093010) != -1) {
	    anIntArray8065[0] = class645.method10639(0, 284343710);
	    aFloatArray8073[0] = class645.method10640(0, (byte) 2);
	}
	if (class645.method10639(1, 470431306) != -1) {
	    anIntArray8065[1] = class645.method10639(1, 1828799172);
	    aFloatArray8073[1] = class645.method10640(1, (byte) 2);
	}
	if (class645.method10639(2, -370084802) != -1) {
	    anIntArray8065[2] = class645.method10639(2, -284025538);
	    aFloatArray8073[2] = class645.method10640(2, (byte) 2);
	}
    }
    
    public void method10146(RSBuffer class525_sub38, Class635 class635) {
	int i = class525_sub38.readUnsignedShort((byte) 26);
	int i_79_ = class525_sub38.readSmart((byte) 67);
	int i_80_ = class525_sub38.readSmart((byte) -70);
	int i_81_ = class525_sub38.readSmart((byte) -40);
	int i_82_ = class525_sub38.readUnsignedShort((byte) 22);
	Class108.anInt1310 = i_82_ * -1193854819;
	aClass515_8083
	    = class635.method10390(i, i_79_, i_80_, i_81_, -918390183);
    }
    
    public void method10147(RSBuffer class525_sub38, Class635 class635) {
	int i = class525_sub38.readUnsignedShort((byte) 10);
	int i_83_ = class525_sub38.readSmart((byte) -4);
	int i_84_ = class525_sub38.readSmart((byte) 21);
	int i_85_ = class525_sub38.readSmart((byte) -7);
	int i_86_ = class525_sub38.readUnsignedShort((byte) 16);
	Class108.anInt1310 = i_86_ * -1193854819;
	aClass515_8083
	    = class635.method10390(i, i_83_, i_84_, i_85_, -591394979);
    }
    
    public void method10148(RSBuffer class525_sub38, Class635 class635) {
	int i = class525_sub38.readUnsignedShort((byte) 45);
	int i_87_ = class525_sub38.readSmart((byte) 41);
	int i_88_ = class525_sub38.readSmart((byte) 65);
	int i_89_ = class525_sub38.readSmart((byte) 3);
	int i_90_ = class525_sub38.readUnsignedShort((byte) 72);
	Class108.anInt1310 = i_90_ * -1193854819;
	aClass515_8083
	    = class635.method10390(i, i_87_, i_88_, i_89_, -2132570143);
    }
    
    boolean method10149(Class618 class618_91_) {
	return (-1643509609 * anInt8067 == -1643509609 * class618_91_.anInt8067
		&& class618_91_.aFloat8066 == aFloat8066
		&& aFloat8074 == class618_91_.aFloat8074
		&& class618_91_.aFloat8082 == aFloat8082
		&& aFloat8068 == class618_91_.aFloat8068
		&& aFloat8076 == class618_91_.aFloat8076
		&& class618_91_.aFloat8075 == aFloat8075
		&& (class618_91_.anInt8070 * 1494025451
		    == 1494025451 * anInt8070)
		&& (-2036201037 * anInt8071
		    == -2036201037 * class618_91_.anInt8071)
		&& aClass174_8072 == class618_91_.aClass174_8072
		&& aClass515_8083 == class618_91_.aClass515_8083
		&& class618_91_.aFloat8077 == aFloat8077
		&& aFloat8078 == class618_91_.aFloat8078
		&& aFloat8079 == class618_91_.aFloat8079
		&& class618_91_.aFloat8080 == aFloat8080
		&& aFloat8081 == class618_91_.aFloat8081
		&& anIntArray8065[0] == class618_91_.anIntArray8065[0]
		&& anIntArray8065[1] == class618_91_.anIntArray8065[1]
		&& anIntArray8065[2] == class618_91_.anIntArray8065[2]
		&& aFloatArray8073[0] == class618_91_.aFloatArray8073[0]
		&& aFloatArray8073[1] == class618_91_.aFloatArray8073[1]
		&& aFloatArray8073[2] == class618_91_.aFloatArray8073[2]);
    }
    
    boolean method10150(Class618 class618_92_) {
	return (-1643509609 * anInt8067 == -1643509609 * class618_92_.anInt8067
		&& class618_92_.aFloat8066 == aFloat8066
		&& aFloat8074 == class618_92_.aFloat8074
		&& class618_92_.aFloat8082 == aFloat8082
		&& aFloat8068 == class618_92_.aFloat8068
		&& aFloat8076 == class618_92_.aFloat8076
		&& class618_92_.aFloat8075 == aFloat8075
		&& (class618_92_.anInt8070 * 1494025451
		    == 1494025451 * anInt8070)
		&& (-2036201037 * anInt8071
		    == -2036201037 * class618_92_.anInt8071)
		&& aClass174_8072 == class618_92_.aClass174_8072
		&& aClass515_8083 == class618_92_.aClass515_8083
		&& class618_92_.aFloat8077 == aFloat8077
		&& aFloat8078 == class618_92_.aFloat8078
		&& aFloat8079 == class618_92_.aFloat8079
		&& class618_92_.aFloat8080 == aFloat8080
		&& aFloat8081 == class618_92_.aFloat8081
		&& anIntArray8065[0] == class618_92_.anIntArray8065[0]
		&& anIntArray8065[1] == class618_92_.anIntArray8065[1]
		&& anIntArray8065[2] == class618_92_.anIntArray8065[2]
		&& aFloatArray8073[0] == class618_92_.aFloatArray8073[0]
		&& aFloatArray8073[1] == class618_92_.aFloatArray8073[1]
		&& aFloatArray8073[2] == class618_92_.aFloatArray8073[2]);
    }
    
    public int method10151(byte i) {
	return 1494025451 * anInt8070;
    }
    
    void method10152(Class635 class635, Class645 class645) {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		.method17050(501271953) == 1
	    && Class501.aClass182_5564.method3242() > 0) {
	    if (class645.method10623(-778022792) != -1)
		anInt8067 = class645.method10623(-778022792) * -769001689;
	    if (class645.method10624((byte) 34) != -1.0F)
		aFloat8066 = class645.method10624((byte) 34);
	    if (class645.method10625((byte) 6) != -1.0F)
		aFloat8074 = class645.method10625((byte) 6);
	    if (class645.method10626(-2127149651) != -1.0F)
		aFloat8082 = class645.method10626(-2143479809);
	}
	if (class645.method10627(1828088246) != null)
	    aClass446_8069.method7216(class645.method10627(1655295304));
	if (class645.method10628(320362971) != -1)
	    anInt8070 = class645.method10628(320362971) * -462191677;
	if (class645.method10653(1134479426) != -1)
	    anInt8071 = class645.method10653(108274537) * 362532219;
	if (class645.method10630((byte) 20) != -1.0F)
	    aFloat8068 = class645.method10630((byte) 74);
	if (class645.method10651((byte) 127) != -1.0F)
	    aFloat8075 = class645.method10651((byte) 122);
	if (class645.method10632((byte) 53) != -1.0F)
	    aFloat8076 = class645.method10632((byte) 99);
	if (class645.method10620((byte) 53) != -1)
	    aClass174_8072
		= class635.method10448(class645.method10620((byte) 92),
				       -1611862561);
	if (class645.method10647(389250319) != -1) {
	    int i = class645.method10647(389250319);
	    int i_93_ = class645.method10622((byte) 24);
	    int i_94_ = class645.method10636(-397681381);
	    int i_95_ = class645.method10668(-1592880822);
	    int i_96_ = class645.method10634(-1422000601);
	    Class108.anInt1310 = i_96_ * -1193854819;
	    aClass515_8083
		= class635.method10390(i, i_93_, i_94_, i_95_, -930069652);
	}
	if (class645.method10639(0, -1182242594) != -1) {
	    anIntArray8065[0] = class645.method10639(0, -1565583859);
	    aFloatArray8073[0] = class645.method10640(0, (byte) 2);
	}
	if (class645.method10639(1, -431749391) != -1) {
	    anIntArray8065[1] = class645.method10639(1, 865962989);
	    aFloatArray8073[1] = class645.method10640(1, (byte) 2);
	}
	if (class645.method10639(2, 1657349685) != -1) {
	    anIntArray8065[2] = class645.method10639(2, 662552073);
	    aFloatArray8073[2] = class645.method10640(2, (byte) 2);
	}
    }
    
    void method10153() {
	anInt8067 = 1423313113;
	aClass446_8069 = Class446.method7208(-50.0F, -60.0F, -50.0F);
	aFloat8066 = 1.1523438F;
	aFloat8074 = 0.69921875F;
	aFloat8082 = 1.2F;
	anInt8070 = 2130229240;
	anInt8071 = 0;
	aClass174_8072 = Class635.aClass174_8246;
	aFloat8076 = 1.0F;
	aFloat8068 = 0.25F;
	aFloat8075 = 1.0F;
	aClass515_8083 = Class678.aClass515_8621;
	aFloat8077 = 1.0F;
	aFloat8078 = 0.0F;
	aFloat8079 = 1.0F;
	aFloat8080 = 0.0F;
	aFloat8081 = 1.0F;
	int[] is = anIntArray8065;
	int[] is_97_ = anIntArray8065;
	anIntArray8065[2] = -1;
	is_97_[1] = -1;
	is[0] = -1;
	float[] fs = aFloatArray8073;
	float[] fs_98_ = aFloatArray8073;
	aFloatArray8073[2] = 0.0F;
	fs_98_[1] = 0.0F;
	fs[0] = 0.0F;
    }
    
    void method10154(Class635 class635, Class645 class645) {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		.method17050(501271953) == 1
	    && Class501.aClass182_5564.method3242() > 0) {
	    if (class645.method10623(-778022792) != -1)
		anInt8067 = class645.method10623(-778022792) * -769001689;
	    if (class645.method10624((byte) 34) != -1.0F)
		aFloat8066 = class645.method10624((byte) 34);
	    if (class645.method10625((byte) 6) != -1.0F)
		aFloat8074 = class645.method10625((byte) 6);
	    if (class645.method10626(-2143307772) != -1.0F)
		aFloat8082 = class645.method10626(-2133648688);
	}
	if (class645.method10627(1188455177) != null)
	    aClass446_8069.method7216(class645.method10627(1276966911));
	if (class645.method10628(320362971) != -1)
	    anInt8070 = class645.method10628(320362971) * -462191677;
	if (class645.method10653(116484646) != -1)
	    anInt8071 = class645.method10653(148922287) * 362532219;
	if (class645.method10630((byte) 93) != -1.0F)
	    aFloat8068 = class645.method10630((byte) 123);
	if (class645.method10651((byte) 127) != -1.0F)
	    aFloat8075 = class645.method10651((byte) 122);
	if (class645.method10632((byte) 125) != -1.0F)
	    aFloat8076 = class645.method10632((byte) 117);
	if (class645.method10620((byte) 87) != -1)
	    aClass174_8072
		= class635.method10448(class645.method10620((byte) 97),
				       -1583839312);
	if (class645.method10647(389250319) != -1) {
	    int i = class645.method10647(389250319);
	    int i_99_ = class645.method10622((byte) 75);
	    int i_100_ = class645.method10636(1067479327);
	    int i_101_ = class645.method10668(-1791531856);
	    int i_102_ = class645.method10634(-1260946353);
	    Class108.anInt1310 = i_102_ * -1193854819;
	    aClass515_8083
		= class635.method10390(i, i_99_, i_100_, i_101_, -1240424649);
	}
	if (class645.method10639(0, -1130437813) != -1) {
	    anIntArray8065[0] = class645.method10639(0, -2001149362);
	    aFloatArray8073[0] = class645.method10640(0, (byte) 2);
	}
	if (class645.method10639(1, -1403073139) != -1) {
	    anIntArray8065[1] = class645.method10639(1, 941991813);
	    aFloatArray8073[1] = class645.method10640(1, (byte) 2);
	}
	if (class645.method10639(2, 1536106168) != -1) {
	    anIntArray8065[2] = class645.method10639(2, -1111123316);
	    aFloatArray8073[2] = class645.method10640(2, (byte) 2);
	}
    }
    
    boolean method10155(Class618 class618_103_) {
	return ((-1643509609 * anInt8067
		 == -1643509609 * class618_103_.anInt8067)
		&& class618_103_.aFloat8066 == aFloat8066
		&& aFloat8074 == class618_103_.aFloat8074
		&& class618_103_.aFloat8082 == aFloat8082
		&& aFloat8068 == class618_103_.aFloat8068
		&& aFloat8076 == class618_103_.aFloat8076
		&& class618_103_.aFloat8075 == aFloat8075
		&& (class618_103_.anInt8070 * 1494025451
		    == 1494025451 * anInt8070)
		&& (-2036201037 * anInt8071
		    == -2036201037 * class618_103_.anInt8071)
		&& aClass174_8072 == class618_103_.aClass174_8072
		&& aClass515_8083 == class618_103_.aClass515_8083
		&& class618_103_.aFloat8077 == aFloat8077
		&& aFloat8078 == class618_103_.aFloat8078
		&& aFloat8079 == class618_103_.aFloat8079
		&& class618_103_.aFloat8080 == aFloat8080
		&& aFloat8081 == class618_103_.aFloat8081
		&& anIntArray8065[0] == class618_103_.anIntArray8065[0]
		&& anIntArray8065[1] == class618_103_.anIntArray8065[1]
		&& anIntArray8065[2] == class618_103_.anIntArray8065[2]
		&& aFloatArray8073[0] == class618_103_.aFloatArray8073[0]
		&& aFloatArray8073[1] == class618_103_.aFloatArray8073[1]
		&& aFloatArray8073[2] == class618_103_.aFloatArray8073[2]);
    }
    
    public int method10156() {
	return 1494025451 * anInt8070;
    }
    
    public Class515 method10157() {
	return aClass515_8083;
    }
    
    public Class515 method10158() {
	return aClass515_8083;
    }
    
    public Class515 method10159() {
	return aClass515_8083;
    }
    
    static final void method10160(Class259 class259, Class245 class245,
				  Class683 class683, byte i) {
	class259.anInt2630 = -386189861;
	class259.anInt2631
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -1938518325;
	Class649.method10708(class259, (byte) 0);
	if (class259.anInt2576 * 1534974651 == -1 && !class245.aBool2428)
	    Class689.method14096(class259.anInt2588 * 1984678839, -1913240519);
    }
    
    static final void method10161(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class182_Sub2.aClass228_9503.method4268(-1611795415) ? 1 : 0;
    }
    
    static final void method10162(Class683 class683, int i) {
	if (Class453_Sub3.aClass309_Sub1_10316.method5484(-2116877216)
	    != Class298.aClass298_3275)
	    throw new RuntimeException();
	((Class704_Sub5)
	 Class453_Sub3.aClass309_Sub1_10316.method5482(-2022279447))
	    .method17461
	    ((class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]),
	     1904071577);
    }
    
    static final void method10163(Class683 class683, byte i) {
	int i_104_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10692, i_104_,
	     (byte) -73);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675, i_104_,
	     (byte) -94);
	Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10692
	    .method17026((byte) 15);
	Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub6_10675
	    .method17026((byte) 114);
	Class559.method9401((byte) -4);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
    
    static String method10164(long l) {
	if (l <= 0L || l >= 6582952005840035281L)
	    return null;
	if (l % 37L == 0L)
	    return null;
	int i = 0;
	for (long l_105_ = l; 0L != l_105_; l_105_ /= 37L)
	    i++;
	StringBuilder stringbuilder = new StringBuilder(i);
	while (0L != l) {
	    long l_106_ = l;
	    l /= 37L;
	    char c = Class680.aCharArray8625[(int) (l_106_ - 37L * l)];
	    if (c == '_') {
		int i_107_ = stringbuilder.length() - 1;
		stringbuilder.setCharAt
		    (i_107_,
		     Character.toUpperCase(stringbuilder.charAt(i_107_)));
		c = '\u00a0';
	    }
	    stringbuilder.append(c);
	}
	stringbuilder.reverse();
	stringbuilder
	    .setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
	return stringbuilder.toString();
    }
    
    public static void method10165(Class259[] class259s, int i) {
	for (int i_108_ = 0; i_108_ < class259s.length; i_108_++) {
	    Class259 class259 = class259s[i_108_];
	    if (null != class259.anObjectArray2696) {
		Class525_Sub32 class525_sub32 = new Class525_Sub32();
		class525_sub32.aClass259_10736 = class259;
		class525_sub32.anObjectArray10740 = class259.anObjectArray2696;
		Class262.method4777(class525_sub32, 5000000, -1918997446);
	    }
	}
    }
}
