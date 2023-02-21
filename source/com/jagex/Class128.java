/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class128
{
    int[] anIntArray1481;
    boolean aBool1482;
    boolean aBool1483;
    boolean aBool1484;
    boolean aBool1485;
    int anInt1486;
    int[] anIntArray1487;
    Class182_Sub2 aClass182_Sub2_1488;
    float aFloat1489;
    float aFloat1490;
    float aFloat1491;
    float aFloat1492;
    float aFloat1493;
    int anInt1494;
    int anInt1495;
    int anInt1496;
    Class110 aClass110_1497;
    int anInt1498;
    int[] anIntArray1499;
    float[] aFloatArray1500;
    int anInt1501;
    int anInt1502;
    float aFloat1503;
    int anInt1504;
    int anInt1505;
    float aFloat1506;
    Class597 aClass597_1507;
    int anInt1508;
    int anInt1509;
    boolean aBool1510 = false;
    int[] anIntArray1511;
    int anInt1512;
    int anInt1513;
    float aFloat1514;
    int anInt1515;
    int[] anIntArray1516;
    int anInt1517;
    boolean aBool1518;
    float aFloat1519;
    
    final void method2239
	(boolean bool, boolean bool_0_, boolean bool_1_, float f, float f_2_,
	 float f_3_, float f_4_, float f_5_, float f_6_, float f_7_,
	 float f_8_, float f_9_, float f_10_, float f_11_, float f_12_,
	 float f_13_, float f_14_, float f_15_, float f_16_, float f_17_,
	 float f_18_, int i, int i_19_, int i_20_, int i_21_, float f_22_,
	 float f_23_, float f_24_, int i_25_) {
	if (!bool)
	    method2256(false, bool_0_, bool_1_, f, f_2_, f_3_, f_4_, f_5_,
		       f_6_, f_7_, f_8_, f_9_, 0);
	else {
	    int i_26_ = i_25_ & 0xffff;
	    if (i_26_ != anInt1502) {
		anIntArray1481 = aClass182_Sub2_1488.method15165(i_26_);
		if (anIntArray1481 == null) {
		    anInt1502 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    anInt1496 = 0;
		    int i_27_ = (Class381.anIntArray3929
				 [Class504.method8313(aClass182_Sub2_1488
							  .method15168(i_25_),
						      934189434) & 0xffff]);
		    int i_28_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_27_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_27_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_27_ & 0xff) >> 8);
		    method2243(true, bool_0_, bool_1_, f, f_2_, f_3_, f_4_,
			       f_5_, f_6_, f_7_, f_8_, f_9_,
			       Class637.method10513(i_28_, i_21_, f_22_,
						    -2045259663),
			       Class637.method10513(i_28_, i_21_, f_23_,
						    -973037310),
			       Class637.method10513(i_28_, i_21_, f_24_,
						    1325925090));
		    return;
		}
		anInt1502 = i_26_;
		anInt1504 = aClass182_Sub2_1488.method15209(i_25_);
		anInt1505 = anInt1504 - 1;
		aClass597_1507 = aClass182_Sub2_1488.method15166(i_25_);
		aBool1484 = aClass182_Sub2_1488.method15169(i_25_);
		anInt1496 = aClass182_Sub2_1488.method15167(i_25_) & 0xff;
	    }
	    anInt1501 = i_21_;
	    if (!(f <= f_2_) || !(f <= f_3_)) {
		if (f_2_ <= f_3_) {
		    float f_29_ = f_4_;
		    f_4_ = f_5_;
		    f_5_ = f_29_;
		    f_29_ = f;
		    f = f_2_;
		    f_2_ = f_29_;
		    f_29_ = f_7_;
		    f_7_ = f_8_;
		    f_8_ = f_29_;
		    f_29_ = f_13_;
		    f_13_ = f_14_;
		    f_14_ = f_29_;
		    f_29_ = f_16_;
		    f_16_ = f_17_;
		    f_17_ = f_29_;
		    f_29_ = f_10_;
		    f_10_ = f_11_;
		    f_11_ = f_29_;
		    f_29_ = f_22_;
		    f_22_ = f_23_;
		    f_23_ = f_29_;
		    int i_30_ = i;
		    i = i_19_;
		    i_19_ = i_30_;
		} else {
		    float f_31_ = f_4_;
		    f_4_ = f_6_;
		    f_6_ = f_31_;
		    f_31_ = f;
		    f = f_3_;
		    f_3_ = f_31_;
		    f_31_ = f_7_;
		    f_7_ = f_9_;
		    f_9_ = f_31_;
		    f_31_ = f_13_;
		    f_13_ = f_15_;
		    f_15_ = f_31_;
		    f_31_ = f_16_;
		    f_16_ = f_18_;
		    f_18_ = f_31_;
		    f_31_ = f_10_;
		    f_10_ = f_12_;
		    f_12_ = f_31_;
		    f_31_ = f_22_;
		    f_22_ = f_24_;
		    f_24_ = f_31_;
		    int i_32_ = i;
		    i = i_20_;
		    i_20_ = i_32_;
		}
	    }
	    f_13_ /= f_10_;
	    f_14_ /= f_11_;
	    f_15_ /= f_12_;
	    f_16_ /= f_10_;
	    f_17_ /= f_11_;
	    f_18_ /= f_12_;
	    f_7_ = 1.0F / f_7_;
	    f_8_ = 1.0F / f_8_;
	    f_9_ = 1.0F / f_9_;
	    f_10_ = 1.0F / f_10_;
	    f_11_ = 1.0F / f_11_;
	    f_12_ = 1.0F / f_12_;
	    float f_33_ = (float) (i >> 24 & 0xff);
	    float f_34_ = (float) (i_19_ >> 24 & 0xff);
	    float f_35_ = (float) (i_20_ >> 24 & 0xff);
	    float f_36_ = (float) (i >> 16 & 0xff);
	    float f_37_ = (float) (i_19_ >> 16 & 0xff);
	    float f_38_ = (float) (i_20_ >> 16 & 0xff);
	    float f_39_ = (float) (i >> 8 & 0xff);
	    float f_40_ = (float) (i_19_ >> 8 & 0xff);
	    float f_41_ = (float) (i_20_ >> 8 & 0xff);
	    float f_42_ = (float) (i & 0xff);
	    float f_43_ = (float) (i_19_ & 0xff);
	    float f_44_ = (float) (i_20_ & 0xff);
	    float f_45_ = 0.0F;
	    float f_46_ = 0.0F;
	    float f_47_ = 0.0F;
	    float f_48_ = 0.0F;
	    float f_49_ = 0.0F;
	    float f_50_ = 0.0F;
	    float f_51_ = 0.0F;
	    float f_52_ = 0.0F;
	    float f_53_ = 0.0F;
	    float f_54_ = 0.0F;
	    if (f_2_ != f) {
		float f_55_ = f_2_ - f;
		f_45_ = (f_5_ - f_4_) / f_55_;
		f_46_ = (f_8_ - f_7_) / f_55_;
		f_47_ = (f_11_ - f_10_) / f_55_;
		f_48_ = (f_14_ - f_13_) / f_55_;
		f_49_ = (f_17_ - f_16_) / f_55_;
		f_50_ = (f_23_ - f_22_) / f_55_;
		f_51_ = (f_34_ - f_33_) / f_55_;
		f_52_ = (f_37_ - f_36_) / f_55_;
		f_53_ = (f_40_ - f_39_) / f_55_;
		f_54_ = (f_43_ - f_42_) / f_55_;
	    }
	    float f_56_ = 0.0F;
	    float f_57_ = 0.0F;
	    float f_58_ = 0.0F;
	    float f_59_ = 0.0F;
	    float f_60_ = 0.0F;
	    float f_61_ = 0.0F;
	    float f_62_ = 0.0F;
	    float f_63_ = 0.0F;
	    float f_64_ = 0.0F;
	    float f_65_ = 0.0F;
	    if (f_3_ != f_2_) {
		float f_66_ = f_3_ - f_2_;
		f_56_ = (f_6_ - f_5_) / f_66_;
		f_57_ = (f_9_ - f_8_) / f_66_;
		f_58_ = (f_12_ - f_11_) / f_66_;
		f_59_ = (f_15_ - f_14_) / f_66_;
		f_60_ = (f_18_ - f_17_) / f_66_;
		f_61_ = (f_24_ - f_23_) / f_66_;
		f_62_ = (f_35_ - f_34_) / f_66_;
		f_63_ = (f_38_ - f_37_) / f_66_;
		f_64_ = (f_41_ - f_40_) / f_66_;
		f_65_ = (f_44_ - f_43_) / f_66_;
	    }
	    float f_67_ = 0.0F;
	    float f_68_ = 0.0F;
	    float f_69_ = 0.0F;
	    float f_70_ = 0.0F;
	    float f_71_ = 0.0F;
	    float f_72_ = 0.0F;
	    float f_73_ = 0.0F;
	    float f_74_ = 0.0F;
	    float f_75_ = 0.0F;
	    float f_76_ = 0.0F;
	    if (f != f_3_) {
		float f_77_ = f - f_3_;
		f_67_ = (f_4_ - f_6_) / f_77_;
		f_68_ = (f_7_ - f_9_) / f_77_;
		f_69_ = (f_10_ - f_12_) / f_77_;
		f_70_ = (f_13_ - f_15_) / f_77_;
		f_71_ = (f_16_ - f_18_) / f_77_;
		f_72_ = (f_22_ - f_24_) / f_77_;
		f_73_ = (f_33_ - f_35_) / f_77_;
		f_74_ = (f_36_ - f_38_) / f_77_;
		f_75_ = (f_39_ - f_41_) / f_77_;
		f_76_ = (f_42_ - f_44_) / f_77_;
	    }
	    if (!(f >= (float) anInt1495)) {
		if (f_2_ > (float) anInt1495)
		    f_2_ = (float) anInt1495;
		if (f_3_ > (float) anInt1495)
		    f_3_ = (float) anInt1495;
		if (f_2_ < f_3_) {
		    f_6_ = f_4_;
		    f_9_ = f_7_;
		    f_12_ = f_10_;
		    f_15_ = f_13_;
		    f_18_ = f_16_;
		    f_24_ = f_22_;
		    f_35_ = f_33_;
		    f_38_ = f_36_;
		    f_41_ = f_39_;
		    f_44_ = f_42_;
		    if (f < 0.0F) {
			f_4_ -= f_45_ * f;
			f_6_ -= f_67_ * f;
			f_7_ -= f_46_ * f;
			f_9_ -= f_68_ * f;
			f_10_ -= f_47_ * f;
			f_12_ -= f_69_ * f;
			f_13_ -= f_48_ * f;
			f_15_ -= f_70_ * f;
			f_16_ -= f_49_ * f;
			f_18_ -= f_71_ * f;
			f_22_ -= f_50_ * f;
			f_24_ -= f_72_ * f;
			f_33_ -= f_51_ * f;
			f_35_ -= f_73_ * f;
			f_36_ -= f_51_ * f;
			f_38_ -= f_73_ * f;
			f_39_ -= f_51_ * f;
			f_41_ -= f_73_ * f;
			f_42_ -= f_51_ * f;
			f_44_ -= f_73_ * f;
			f = 0.0F;
		    }
		    if (f_2_ < 0.0F) {
			f_5_ -= f_56_ * f_2_;
			f_8_ -= f_57_ * f_2_;
			f_11_ -= f_58_ * f_2_;
			f_14_ -= f_59_ * f_2_;
			f_17_ -= f_60_ * f_2_;
			f_23_ -= f_61_ * f_2_;
			f_34_ -= f_62_ * f_2_;
			f_37_ -= f_63_ * f_2_;
			f_40_ -= f_64_ * f_2_;
			f_43_ -= f_65_ * f_2_;
			f_2_ = 0.0F;
		    }
		    if (f != f_2_ && f_67_ < f_45_
			|| f == f_2_ && f_67_ > f_56_) {
			f += 0.5F;
			f_2_ += 0.5F;
			f_3_ = (float) (int) (f_3_ + 0.5F) - f_2_;
			f_2_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_2_ >= 0.0F) {
			    method2246(bool_0_, bool_1_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_6_,
				       (int) f_4_, f_9_, f_7_, f_12_, f_10_,
				       f_15_, f_13_, f_18_, f_16_, f_24_,
				       f_22_, f_35_, f_33_, f_38_, f_36_,
				       f_41_, f_39_, f_44_, f_42_);
			    f_4_ += f_45_;
			    f_6_ += f_67_;
			    f_7_ += f_46_;
			    f_9_ += f_68_;
			    f_10_ += f_47_;
			    f_12_ += f_69_;
			    f_13_ += f_48_;
			    f_15_ += f_70_;
			    f_16_ += f_49_;
			    f_18_ += f_71_;
			    f_22_ += f_50_;
			    f_24_ += f_72_;
			    f_33_ += f_51_;
			    f_35_ += f_73_;
			    f_36_ += f_52_;
			    f_38_ += f_74_;
			    f_39_ += f_53_;
			    f_41_ += f_75_;
			    f_42_ += f_54_;
			    f_44_ += f_76_;
			    f += (float) anInt1498;
			}
			while (--f_3_ >= 0.0F) {
			    method2246(bool_0_, bool_1_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_6_,
				       (int) f_5_, f_9_, f_8_, f_12_, f_11_,
				       f_15_, f_14_, f_18_, f_17_, f_24_,
				       f_23_, f_35_, f_34_, f_38_, f_37_,
				       f_41_, f_40_, f_44_, f_43_);
			    f_5_ += f_56_;
			    f_6_ += f_67_;
			    f_8_ += f_57_;
			    f_9_ += f_68_;
			    f_11_ += f_58_;
			    f_12_ += f_69_;
			    f_14_ += f_59_;
			    f_15_ += f_70_;
			    f_17_ += f_60_;
			    f_18_ += f_71_;
			    f_23_ += f_61_;
			    f_24_ += f_72_;
			    f_34_ += f_62_;
			    f_35_ += f_73_;
			    f_37_ += f_63_;
			    f_38_ += f_74_;
			    f_40_ += f_64_;
			    f_41_ += f_75_;
			    f_43_ += f_65_;
			    f_44_ += f_76_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_2_ += 0.5F;
			f_3_ = (float) (int) (f_3_ + 0.5F) - f_2_;
			f_2_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_2_ >= 0.0F) {
			    method2246(bool_0_, bool_1_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_4_,
				       (int) f_6_, f_7_, f_9_, f_10_, f_12_,
				       f_13_, f_15_, f_16_, f_18_, f_22_,
				       f_24_, f_33_, f_35_, f_36_, f_38_,
				       f_39_, f_41_, f_42_, f_44_);
			    f_4_ += f_45_;
			    f_6_ += f_67_;
			    f_7_ += f_46_;
			    f_9_ += f_68_;
			    f_10_ += f_47_;
			    f_12_ += f_69_;
			    f_13_ += f_48_;
			    f_15_ += f_70_;
			    f_16_ += f_49_;
			    f_18_ += f_71_;
			    f_22_ += f_50_;
			    f_24_ += f_72_;
			    f_33_ += f_51_;
			    f_35_ += f_73_;
			    f_36_ += f_52_;
			    f_38_ += f_74_;
			    f_39_ += f_53_;
			    f_41_ += f_75_;
			    f_42_ += f_54_;
			    f_44_ += f_76_;
			    f += (float) anInt1498;
			}
			while (--f_3_ >= 0.0F) {
			    method2246(bool_0_, bool_1_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_5_,
				       (int) f_6_, f_8_, f_9_, f_11_, f_12_,
				       f_14_, f_15_, f_17_, f_18_, f_23_,
				       f_24_, f_34_, f_35_, f_37_, f_38_,
				       f_40_, f_41_, f_43_, f_44_);
			    f_5_ += f_56_;
			    f_6_ += f_67_;
			    f_8_ += f_57_;
			    f_9_ += f_68_;
			    f_11_ += f_58_;
			    f_12_ += f_69_;
			    f_14_ += f_59_;
			    f_15_ += f_70_;
			    f_17_ += f_60_;
			    f_18_ += f_71_;
			    f_23_ += f_61_;
			    f_24_ += f_72_;
			    f_34_ += f_62_;
			    f_35_ += f_73_;
			    f_37_ += f_63_;
			    f_38_ += f_74_;
			    f_40_ += f_64_;
			    f_41_ += f_75_;
			    f_43_ += f_65_;
			    f_44_ += f_76_;
			    f += (float) anInt1498;
			}
		    }
		} else {
		    f_5_ = f_4_;
		    f_8_ = f_7_;
		    f_11_ = f_10_;
		    f_14_ = f_13_;
		    f_17_ = f_16_;
		    f_23_ = f_22_;
		    f_34_ = f_33_;
		    f_37_ = f_36_;
		    f_40_ = f_39_;
		    f_43_ = f_42_;
		    if (f < 0.0F) {
			f_4_ -= f_45_ * f;
			f_5_ -= f_67_ * f;
			f_7_ -= f_46_ * f;
			f_8_ -= f_68_ * f;
			f_10_ -= f_47_ * f;
			f_11_ -= f_69_ * f;
			f_13_ -= f_48_ * f;
			f_14_ -= f_70_ * f;
			f_16_ -= f_49_ * f;
			f_17_ -= f_71_ * f;
			f_22_ -= f_50_ * f;
			f_23_ -= f_72_ * f;
			f_33_ -= f_51_ * f;
			f_34_ -= f_73_ * f;
			f_36_ -= f_51_ * f;
			f_37_ -= f_73_ * f;
			f_39_ -= f_51_ * f;
			f_40_ -= f_73_ * f;
			f_42_ -= f_51_ * f;
			f_43_ -= f_73_ * f;
			f = 0.0F;
		    }
		    if (f_3_ < 0.0F) {
			f_6_ -= f_56_ * f_3_;
			f_9_ -= f_57_ * f_3_;
			f_12_ -= f_58_ * f_3_;
			f_15_ -= f_59_ * f_3_;
			f_18_ -= f_60_ * f_3_;
			f_24_ -= f_61_ * f_3_;
			f_35_ -= f_62_ * f_3_;
			f_38_ -= f_63_ * f_3_;
			f_41_ -= f_64_ * f_3_;
			f_44_ -= f_65_ * f_3_;
			f_3_ = 0.0F;
		    }
		    if (f != f_3_ && f_67_ < f_45_
			|| f == f_3_ && f_56_ > f_45_) {
			f += 0.5F;
			f_3_ += 0.5F;
			f_2_ = (float) (int) (f_2_ + 0.5F) - f_3_;
			f_3_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_3_ >= 0.0F) {
			    method2246(bool_0_, bool_1_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_5_,
				       (int) f_4_, f_8_, f_7_, f_11_, f_10_,
				       f_14_, f_13_, f_17_, f_16_, f_23_,
				       f_22_, f_34_, f_33_, f_37_, f_36_,
				       f_40_, f_39_, f_43_, f_42_);
			    f_4_ += f_45_;
			    f_5_ += f_67_;
			    f_7_ += f_46_;
			    f_8_ += f_68_;
			    f_10_ += f_47_;
			    f_11_ += f_69_;
			    f_13_ += f_48_;
			    f_14_ += f_70_;
			    f_16_ += f_49_;
			    f_17_ += f_71_;
			    f_22_ += f_50_;
			    f_23_ += f_72_;
			    f_33_ += f_51_;
			    f_34_ += f_73_;
			    f_36_ += f_52_;
			    f_37_ += f_74_;
			    f_39_ += f_53_;
			    f_40_ += f_75_;
			    f_42_ += f_54_;
			    f_43_ += f_76_;
			    f += (float) anInt1498;
			}
			while (--f_2_ >= 0.0F) {
			    method2246(bool_0_, bool_1_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_6_,
				       (int) f_4_, f_9_, f_7_, f_12_, f_10_,
				       f_15_, f_13_, f_18_, f_16_, f_24_,
				       f_22_, f_35_, f_33_, f_38_, f_36_,
				       f_41_, f_39_, f_44_, f_42_);
			    f_6_ += f_56_;
			    f_4_ += f_45_;
			    f_9_ += f_57_;
			    f_7_ += f_46_;
			    f_12_ += f_58_;
			    f_10_ += f_47_;
			    f_15_ += f_59_;
			    f_13_ += f_48_;
			    f_18_ += f_60_;
			    f_16_ += f_49_;
			    f_24_ += f_61_;
			    f_22_ += f_50_;
			    f_35_ += f_62_;
			    f_33_ += f_51_;
			    f_38_ += f_63_;
			    f_36_ += f_52_;
			    f_41_ += f_64_;
			    f_39_ += f_53_;
			    f_44_ += f_65_;
			    f_42_ += f_54_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_3_ += 0.5F;
			f_2_ = (float) (int) (f_2_ + 0.5F) - f_3_;
			f_3_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_3_ >= 0.0F) {
			    method2246(bool_0_, bool_1_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_4_,
				       (int) f_5_, f_7_, f_8_, f_10_, f_11_,
				       f_13_, f_14_, f_16_, f_17_, f_22_,
				       f_23_, f_33_, f_34_, f_36_, f_37_,
				       f_39_, f_40_, f_42_, f_43_);
			    f_5_ += f_67_;
			    f_4_ += f_45_;
			    f_8_ += f_68_;
			    f_7_ += f_46_;
			    f_11_ += f_69_;
			    f_10_ += f_47_;
			    f_14_ += f_70_;
			    f_13_ += f_48_;
			    f_17_ += f_71_;
			    f_16_ += f_49_;
			    f_23_ += f_72_;
			    f_22_ += f_50_;
			    f_34_ += f_73_;
			    f_33_ += f_51_;
			    f_37_ += f_74_;
			    f_36_ += f_52_;
			    f_40_ += f_75_;
			    f_39_ += f_53_;
			    f_43_ += f_76_;
			    f_42_ += f_54_;
			    f += (float) anInt1498;
			}
			while (--f_2_ >= 0.0F) {
			    method2246(bool_0_, bool_1_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_4_,
				       (int) f_6_, f_7_, f_9_, f_10_, f_12_,
				       f_13_, f_15_, f_16_, f_18_, f_22_,
				       f_24_, f_33_, f_35_, f_36_, f_38_,
				       f_39_, f_41_, f_42_, f_44_);
			    f_4_ += f_45_;
			    f_6_ += f_56_;
			    f_7_ += f_46_;
			    f_9_ += f_57_;
			    f_10_ += f_47_;
			    f_12_ += f_58_;
			    f_13_ += f_48_;
			    f_15_ += f_59_;
			    f_16_ += f_49_;
			    f_18_ += f_60_;
			    f_22_ += f_50_;
			    f_24_ += f_61_;
			    f_33_ += f_51_;
			    f_35_ += f_62_;
			    f_36_ += f_52_;
			    f_38_ += f_63_;
			    f_39_ += f_53_;
			    f_41_ += f_64_;
			    f_42_ += f_54_;
			    f_44_ += f_65_;
			    f += (float) anInt1498;
			}
		    }
		}
	    }
	}
    }
    
    int method2240() {
	return anIntArray1487[0] % anInt1498;
    }
    
    int method2241() {
	return anIntArray1487[0] / anInt1498;
    }
    
    final void method2242(boolean bool, boolean bool_78_, int[] is, int i,
			  int i_79_, int i_80_, int i_81_, int i_82_, float f,
			  float f_83_, float f_84_, float f_85_, float f_86_,
			  float f_87_, float f_88_, float f_89_) {
	if (aBool1485) {
	    if (i_82_ > anInt1494)
		i_82_ = anInt1494;
	    if (i_81_ < 0)
		i_81_ = 0;
	}
	if (i_81_ < i_82_) {
	    if (aBool1518) {
		i += i_81_;
		f_84_ += f_85_ * (float) i_81_;
		f_86_ += f_87_ * (float) i_81_;
		f_88_ += f_89_ * (float) i_81_;
		if (aBool1482) {
		    i_80_ = i_82_ - i_81_ >> 2;
		    f_85_ *= 4.0F;
		    f_87_ *= 4.0F;
		    f_89_ *= 4.0F;
		    if (anInt1486 == 0) {
			if (i_80_ > 0) {
			    do {
				i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						     | (int) f_86_ & 0xff00
						     | (int) f_88_ & 0xff);
				f_84_ += f_85_;
				f_86_ += f_87_;
				f_88_ += f_89_;
				is[i++] = i_79_;
				is[i++] = i_79_;
				is[i++] = i_79_;
				is[i++] = i_79_;
			    } while (--i_80_ > 0);
			}
			i_80_ = i_82_ - i_81_ & 0x3;
			if (i_80_ > 0) {
			    i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						 | (int) f_86_ & 0xff00
						 | (int) f_88_ & 0xff);
			    do
				is[i++] = i_79_;
			    while (--i_80_ > 0);
			}
		    } else if (!aBool1483) {
			int i_90_ = anInt1486;
			int i_91_ = 256 - anInt1486;
			if (i_80_ > 0) {
			    do {
				i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						     | (int) f_86_ & 0xff00
						     | (int) f_88_ & 0xff);
				f_84_ += f_85_;
				f_86_ += f_87_;
				f_88_ += f_89_;
				i_79_ = (((i_79_ & 0xff00ff) * i_91_ >> 8
					  & 0xff00ff)
					 + ((i_79_ & 0xff00) * i_91_ >> 8
					    & 0xff00));
				int i_92_ = is[i];
				if (bool_78_) {
				    is[i++]
					= ((i_91_ | i_92_ >> 24) << 24
					   | (i_79_
					      + (((i_92_ & 0xff00ff) * i_90_
						  >> 8)
						 & 0xff00ff)
					      + ((i_92_ & 0xff00) * i_90_ >> 8
						 & 0xff00)));
				    i_92_ = is[i];
				    is[i++]
					= ((i_91_ | i_92_ >> 24) << 24
					   | (i_79_
					      + (((i_92_ & 0xff00ff) * i_90_
						  >> 8)
						 & 0xff00ff)
					      + ((i_92_ & 0xff00) * i_90_ >> 8
						 & 0xff00)));
				    i_92_ = is[i];
				    is[i++]
					= ((i_91_ | i_92_ >> 24) << 24
					   | (i_79_
					      + (((i_92_ & 0xff00ff) * i_90_
						  >> 8)
						 & 0xff00ff)
					      + ((i_92_ & 0xff00) * i_90_ >> 8
						 & 0xff00)));
				    i_92_ = is[i];
				    is[i++]
					= ((i_91_ | i_92_ >> 24) << 24
					   | (i_79_
					      + (((i_92_ & 0xff00ff) * i_90_
						  >> 8)
						 & 0xff00ff)
					      + ((i_92_ & 0xff00) * i_90_ >> 8
						 & 0xff00)));
				} else {
				    is[i++]
					= (i_79_
					   + ((i_92_ & 0xff00ff) * i_90_ >> 8
					      & 0xff00ff)
					   + ((i_92_ & 0xff00) * i_90_ >> 8
					      & 0xff00));
				    i_92_ = is[i];
				    is[i++]
					= (i_79_
					   + ((i_92_ & 0xff00ff) * i_90_ >> 8
					      & 0xff00ff)
					   + ((i_92_ & 0xff00) * i_90_ >> 8
					      & 0xff00));
				    i_92_ = is[i];
				    is[i++]
					= (i_79_
					   + ((i_92_ & 0xff00ff) * i_90_ >> 8
					      & 0xff00ff)
					   + ((i_92_ & 0xff00) * i_90_ >> 8
					      & 0xff00));
				    i_92_ = is[i];
				    is[i++]
					= (i_79_
					   + ((i_92_ & 0xff00ff) * i_90_ >> 8
					      & 0xff00ff)
					   + ((i_92_ & 0xff00) * i_90_ >> 8
					      & 0xff00));
				}
			    } while (--i_80_ > 0);
			}
			i_80_ = i_82_ - i_81_ & 0x3;
			if (i_80_ > 0) {
			    i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						 | (int) f_86_ & 0xff00
						 | (int) f_88_ & 0xff);
			    i_79_
				= (((i_79_ & 0xff00ff) * i_91_ >> 8 & 0xff00ff)
				   + ((i_79_ & 0xff00) * i_91_ >> 8 & 0xff00));
			    do {
				int i_93_ = is[i];
				if (bool_78_)
				    is[i++]
					= ((i_91_ | i_93_ >> 24) << 24
					   | (i_79_
					      + (((i_93_ & 0xff00ff) * i_90_
						  >> 8)
						 & 0xff00ff)
					      + ((i_93_ & 0xff00) * i_90_ >> 8
						 & 0xff00)));
				else
				    is[i++]
					= (i_79_
					   + ((i_93_ & 0xff00ff) * i_90_ >> 8
					      & 0xff00ff)
					   + ((i_93_ & 0xff00) * i_90_ >> 8
					      & 0xff00));
			    } while (--i_80_ > 0);
			}
		    } else {
			if (i_80_ > 0) {
			    do {
				i_79_ = ((int) f_84_ & 0xff0000
					 | (int) f_86_ & 0xff00
					 | (int) f_88_ & 0xff);
				f_84_ += f_85_;
				f_86_ += f_87_;
				f_88_ += f_89_;
				int[] is_94_ = is;
				int i_95_ = i++;
				int i_96_ = i_79_;
				int i_97_ = is_94_[i_95_];
				int i_98_ = i_96_ + i_97_;
				int i_99_
				    = (i_96_ & 0xff00ff) + (i_97_ & 0xff00ff);
				i_97_ = (i_99_ & 0x1000100) + (i_98_ - i_99_
							       & 0x10000);
				is_94_[i_95_] = (~0xffffff | i_98_ - i_97_
						 | i_97_ - (i_97_ >>> 8));
				int[] is_100_ = is;
				i_98_ = i++;
				i_99_ = i_79_;
				int i_101_ = is_100_[i_98_];
				int i_102_ = i_99_ + i_101_;
				int i_103_
				    = (i_99_ & 0xff00ff) + (i_101_ & 0xff00ff);
				i_101_
				    = (i_103_ & 0x1000100) + (i_102_ - i_103_
							      & 0x10000);
				is_100_[i_98_] = (~0xffffff | i_102_ - i_101_
						  | i_101_ - (i_101_ >>> 8));
				int[] is_104_ = is;
				i_102_ = i++;
				i_103_ = i_79_;
				int i_105_ = is_104_[i_102_];
				int i_106_ = i_103_ + i_105_;
				int i_107_ = ((i_103_ & 0xff00ff)
					      + (i_105_ & 0xff00ff));
				i_105_
				    = (i_107_ & 0x1000100) + (i_106_ - i_107_
							      & 0x10000);
				is_104_[i_102_] = (~0xffffff | i_106_ - i_105_
						   | i_105_ - (i_105_ >>> 8));
				int[] is_108_ = is;
				i_106_ = i++;
				i_107_ = i_79_;
				int i_109_ = is_108_[i_106_];
				int i_110_ = i_107_ + i_109_;
				int i_111_ = ((i_107_ & 0xff00ff)
					      + (i_109_ & 0xff00ff));
				i_109_
				    = (i_111_ & 0x1000100) + (i_110_ - i_111_
							      & 0x10000);
				is_108_[i_106_] = (~0xffffff | i_110_ - i_109_
						   | i_109_ - (i_109_ >>> 8));
			    } while (--i_80_ > 0);
			}
			i_80_ = i_82_ - i_81_ & 0x3;
			if (i_80_ > 0) {
			    i_79_ = ((int) f_84_ & 0xff0000
				     | (int) f_86_ & 0xff00
				     | (int) f_88_ & 0xff);
			    do {
				int[] is_112_ = is;
				int i_113_ = i++;
				int i_114_ = i_79_;
				int i_115_ = is_112_[i_113_];
				int i_116_ = i_114_ + i_115_;
				int i_117_ = ((i_114_ & 0xff00ff)
					      + (i_115_ & 0xff00ff));
				i_115_
				    = (i_117_ & 0x1000100) + (i_116_ - i_117_
							      & 0x10000);
				is_112_[i_113_] = (~0xffffff | i_116_ - i_115_
						   | i_115_ - (i_115_ >>> 8));
			    } while (--i_80_ > 0);
			}
		    }
		} else {
		    i_80_ = i_82_ - i_81_;
		    if (anInt1486 == 0) {
			do {
			    is[i++] = ~0xffffff | ((int) f_84_ & 0xff0000
						   | (int) f_86_ & 0xff00
						   | (int) f_88_ & 0xff);
			    f_84_ += f_85_;
			    f_86_ += f_87_;
			    f_88_ += f_89_;
			} while (--i_80_ > 0);
		    } else if (!aBool1483) {
			int i_118_ = anInt1486;
			int i_119_ = 256 - anInt1486;
			do {
			    i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						 | (int) f_86_ & 0xff00
						 | (int) f_88_ & 0xff);
			    f_84_ += f_85_;
			    f_86_ += f_87_;
			    f_88_ += f_89_;
			    i_79_ = (((i_79_ & 0xff00ff) * i_119_ >> 8
				      & 0xff00ff)
				     + ((i_79_ & 0xff00) * i_119_ >> 8
					& 0xff00));
			    int i_120_ = is[i];
			    if (bool_78_)
				is[i++]
				    = ((i_119_ | i_120_ >> 24) << 24
				       | (i_79_
					  + ((i_120_ & 0xff00ff) * i_118_ >> 8
					     & 0xff00ff)
					  + ((i_120_ & 0xff00) * i_118_ >> 8
					     & 0xff00)));
			    else
				is[i++] = (i_79_
					   + ((i_120_ & 0xff00ff) * i_118_ >> 8
					      & 0xff00ff)
					   + ((i_120_ & 0xff00) * i_118_ >> 8
					      & 0xff00));
			} while (--i_80_ > 0);
		    } else {
			do {
			    int[] is_121_ = is;
			    int i_122_ = i++;
			    int i_123_ = ((int) f_84_ & 0xff0000
					  | (int) f_86_ & 0xff00
					  | (int) f_88_ & 0xff);
			    int i_124_ = is_121_[i_122_];
			    int i_125_ = i_123_ + i_124_;
			    int i_126_
				= (i_123_ & 0xff00ff) + (i_124_ & 0xff00ff);
			    i_124_ = (i_126_ & 0x1000100) + (i_125_ - i_126_
							     & 0x10000);
			    is_121_[i_122_] = (~0xffffff | i_125_ - i_124_
					       | i_124_ - (i_124_ >>> 8));
			    f_84_ += f_85_;
			    f_86_ += f_87_;
			    f_88_ += f_89_;
			} while (--i_80_ > 0);
		    }
		}
	    } else {
		i += i_81_ - 1;
		f += f_83_ * (float) i_81_;
		f_84_ += f_85_ * (float) i_81_;
		f_86_ += f_87_ * (float) i_81_;
		f_88_ += f_89_ * (float) i_81_;
		if (aClass110_1497.aBool1335) {
		    if (aBool1482) {
			i_80_ = i_82_ - i_81_ >> 2;
			f_85_ *= 4.0F;
			f_87_ *= 4.0F;
			f_89_ *= 4.0F;
			if (anInt1486 == 0) {
			    if (i_80_ > 0) {
				do {
				    i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
							 | (int) f_86_ & 0xff00
							 | (int) f_88_ & 0xff);
				    f_84_ += f_85_;
				    f_86_ += f_87_;
				    f_88_ += f_89_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					is[i] = i_79_;
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					is[i] = i_79_;
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					is[i] = i_79_;
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					is[i] = i_79_;
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				} while (--i_80_ > 0);
			    }
			    i_80_ = i_82_ - i_81_ & 0x3;
			    if (i_80_ > 0) {
				i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						     | (int) f_86_ & 0xff00
						     | (int) f_88_ & 0xff);
				do {
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					is[i] = i_79_;
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				} while (--i_80_ > 0);
			    }
			} else if (!aBool1483) {
			    int i_127_ = anInt1486;
			    int i_128_ = 256 - anInt1486;
			    if (i_80_ > 0) {
				do {
				    i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
							 | (int) f_86_ & 0xff00
							 | (int) f_88_ & 0xff);
				    f_84_ += f_85_;
				    f_86_ += f_87_;
				    f_88_ += f_89_;
				    i_79_ = (((i_79_ & 0xff00ff) * i_128_ >> 8
					      & 0xff00ff)
					     + ((i_79_ & 0xff00) * i_128_ >> 8
						& 0xff00));
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int i_129_ = is[i];
					if (bool_78_)
					    is[i] = (((i_128_ | i_129_ >> 24)
						      << 24)
						     | (i_79_
							+ (((i_129_ & 0xff00ff)
							    * i_127_) >> 8
							   & 0xff00ff)
							+ (((i_129_ & 0xff00)
							    * i_127_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_79_
						     + (((i_129_ & 0xff00ff)
							 * i_127_) >> 8
							& 0xff00ff)
						     + (((i_129_ & 0xff00)
							 * i_127_) >> 8
							& 0xff00));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int i_130_ = is[i];
					if (bool_78_)
					    is[i] = (((i_128_ | i_130_ >> 24)
						      << 24)
						     | (i_79_
							+ (((i_130_ & 0xff00ff)
							    * i_127_) >> 8
							   & 0xff00ff)
							+ (((i_130_ & 0xff00)
							    * i_127_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_79_
						     + (((i_130_ & 0xff00ff)
							 * i_127_) >> 8
							& 0xff00ff)
						     + (((i_130_ & 0xff00)
							 * i_127_) >> 8
							& 0xff00));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int i_131_ = is[i];
					if (bool_78_)
					    is[i] = (((i_128_ | i_131_ >> 24)
						      << 24)
						     | (i_79_
							+ (((i_131_ & 0xff00ff)
							    * i_127_) >> 8
							   & 0xff00ff)
							+ (((i_131_ & 0xff00)
							    * i_127_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_79_
						     + (((i_131_ & 0xff00ff)
							 * i_127_) >> 8
							& 0xff00ff)
						     + (((i_131_ & 0xff00)
							 * i_127_) >> 8
							& 0xff00));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int i_132_ = is[i];
					if (bool_78_)
					    is[i] = (((i_128_ | i_132_ >> 24)
						      << 24)
						     | (i_79_
							+ (((i_132_ & 0xff00ff)
							    * i_127_) >> 8
							   & 0xff00ff)
							+ (((i_132_ & 0xff00)
							    * i_127_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_79_
						     + (((i_132_ & 0xff00ff)
							 * i_127_) >> 8
							& 0xff00ff)
						     + (((i_132_ & 0xff00)
							 * i_127_) >> 8
							& 0xff00));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				} while (--i_80_ > 0);
			    }
			    i_80_ = i_82_ - i_81_ & 0x3;
			    if (i_80_ > 0) {
				i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						     | (int) f_86_ & 0xff00
						     | (int) f_88_ & 0xff);
				i_79_ = (((i_79_ & 0xff00ff) * i_128_ >> 8
					  & 0xff00ff)
					 + ((i_79_ & 0xff00) * i_128_ >> 8
					    & 0xff00));
				do {
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int i_133_ = is[i];
					if (bool_78_)
					    is[i] = (((i_128_ | i_133_ >> 24)
						      << 24)
						     | (i_79_
							+ (((i_133_ & 0xff00ff)
							    * i_127_) >> 8
							   & 0xff00ff)
							+ (((i_133_ & 0xff00)
							    * i_127_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_79_
						     + (((i_133_ & 0xff00ff)
							 * i_127_) >> 8
							& 0xff00ff)
						     + (((i_133_ & 0xff00)
							 * i_127_) >> 8
							& 0xff00));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				} while (--i_80_ > 0);
			    }
			} else {
			    if (i_80_ > 0) {
				do {
				    i_79_ = ((int) f_84_ & 0xff0000
					     | (int) f_86_ & 0xff00
					     | (int) f_88_ & 0xff);
				    f_84_ += f_85_;
				    f_86_ += f_87_;
				    f_88_ += f_89_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int[] is_134_ = is;
					int i_135_ = i;
					int i_136_ = i_79_;
					int i_137_ = is_134_[i_135_];
					int i_138_ = i_136_ + i_137_;
					int i_139_ = ((i_136_ & 0xff00ff)
						      + (i_137_ & 0xff00ff));
					i_137_
					    = ((i_139_ & 0x1000100)
					       + (i_138_ - i_139_ & 0x10000));
					is_134_[i_135_]
					    = (~0xffffff | i_138_ - i_137_
					       | i_137_ - (i_137_ >>> 8));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int[] is_140_ = is;
					int i_141_ = i;
					int i_142_ = i_79_;
					int i_143_ = is_140_[i_141_];
					int i_144_ = i_142_ + i_143_;
					int i_145_ = ((i_142_ & 0xff00ff)
						      + (i_143_ & 0xff00ff));
					i_143_
					    = ((i_145_ & 0x1000100)
					       + (i_144_ - i_145_ & 0x10000));
					is_140_[i_141_]
					    = (~0xffffff | i_144_ - i_143_
					       | i_143_ - (i_143_ >>> 8));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int[] is_146_ = is;
					int i_147_ = i;
					int i_148_ = i_79_;
					int i_149_ = is_146_[i_147_];
					int i_150_ = i_148_ + i_149_;
					int i_151_ = ((i_148_ & 0xff00ff)
						      + (i_149_ & 0xff00ff));
					i_149_
					    = ((i_151_ & 0x1000100)
					       + (i_150_ - i_151_ & 0x10000));
					is_146_[i_147_]
					    = (~0xffffff | i_150_ - i_149_
					       | i_149_ - (i_149_ >>> 8));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int[] is_152_ = is;
					int i_153_ = i;
					int i_154_ = i_79_;
					int i_155_ = is_152_[i_153_];
					int i_156_ = i_154_ + i_155_;
					int i_157_ = ((i_154_ & 0xff00ff)
						      + (i_155_ & 0xff00ff));
					i_155_
					    = ((i_157_ & 0x1000100)
					       + (i_156_ - i_157_ & 0x10000));
					is_152_[i_153_]
					    = (~0xffffff | i_156_ - i_155_
					       | i_155_ - (i_155_ >>> 8));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				} while (--i_80_ > 0);
			    }
			    i_80_ = i_82_ - i_81_ & 0x3;
			    if (i_80_ > 0) {
				i_79_ = ((int) f_84_ & 0xff0000
					 | (int) f_86_ & 0xff00
					 | (int) f_88_ & 0xff);
				do {
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int[] is_158_ = is;
					int i_159_ = i;
					int i_160_ = i_79_;
					int i_161_ = is_158_[i_159_];
					int i_162_ = i_160_ + i_161_;
					int i_163_ = ((i_160_ & 0xff00ff)
						      + (i_161_ & 0xff00ff));
					i_161_
					    = ((i_163_ & 0x1000100)
					       + (i_162_ - i_163_ & 0x10000));
					is_158_[i_159_]
					    = (~0xffffff | i_162_ - i_161_
					       | i_161_ - (i_161_ >>> 8));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_83_;
				} while (--i_80_ > 0);
			    }
			}
		    } else {
			i_80_ = i_82_ - i_81_;
			if (anInt1486 == 0) {
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    is[i] = ~0xffffff | ((int) f_84_ & 0xff0000
							 | (int) f_86_ & 0xff00
							 | (int) f_88_ & 0xff);
				    if (bool)
					aFloatArray1500[i] = f;
				}
				f += f_83_;
				f_84_ += f_85_;
				f_86_ += f_87_;
				f_88_ += f_89_;
			    } while (--i_80_ > 0);
			} else if (!aBool1483) {
			    int i_164_ = anInt1486;
			    int i_165_ = 256 - anInt1486;
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
							 | (int) f_86_ & 0xff00
							 | (int) f_88_ & 0xff);
				    i_79_ = (((i_79_ & 0xff00ff) * i_165_ >> 8
					      & 0xff00ff)
					     + ((i_79_ & 0xff00) * i_165_ >> 8
						& 0xff00));
				    int i_166_ = is[i];
				    if (bool_78_)
					is[i] = ((i_165_ | i_166_ >> 24) << 24
						 | (i_79_
						    + (((i_166_ & 0xff00ff)
							* i_164_) >> 8
						       & 0xff00ff)
						    + (((i_166_ & 0xff00)
							* i_164_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_79_
					       + (((i_166_ & 0xff00ff) * i_164_
						   >> 8)
						  & 0xff00ff)
					       + (((i_166_ & 0xff00) * i_164_
						   >> 8)
						  & 0xff00));
				    if (bool)
					aFloatArray1500[i] = f;
				}
				f += f_83_;
				f_84_ += f_85_;
				f_86_ += f_87_;
				f_88_ += f_89_;
			    } while (--i_80_ > 0);
			} else {
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_167_ = is;
				    int i_168_ = i;
				    int i_169_ = ((int) f_84_ & 0xff0000
						  | (int) f_86_ & 0xff00
						  | (int) f_88_ & 0xff);
				    int i_170_ = is_167_[i_168_];
				    int i_171_ = i_169_ + i_170_;
				    int i_172_ = ((i_169_ & 0xff00ff)
						  + (i_170_ & 0xff00ff));
				    i_170_ = ((i_172_ & 0x1000100)
					      + (i_171_ - i_172_ & 0x10000));
				    is_167_[i_168_]
					= (~0xffffff | i_171_ - i_170_
					   | i_170_ - (i_170_ >>> 8));
				    if (bool)
					aFloatArray1500[i] = f;
				}
				f += f_83_;
				f_84_ += f_85_;
				f_86_ += f_87_;
				f_88_ += f_89_;
			    } while (--i_80_ > 0);
			}
		    }
		} else if (aBool1482) {
		    i_80_ = i_82_ - i_81_ >> 2;
		    f_85_ *= 4.0F;
		    f_87_ *= 4.0F;
		    f_89_ *= 4.0F;
		    if (anInt1486 == 0) {
			if (i_80_ > 0) {
			    do {
				i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						     | (int) f_86_ & 0xff00
						     | (int) f_88_ & 0xff);
				f_84_ += f_85_;
				f_86_ += f_87_;
				f_88_ += f_89_;
				i++;
				if (!bool || f < aFloatArray1500[i])
				    is[i] = i_79_;
				f += f_83_;
				i++;
				if (!bool || f < aFloatArray1500[i])
				    is[i] = i_79_;
				f += f_83_;
				i++;
				if (!bool || f < aFloatArray1500[i])
				    is[i] = i_79_;
				f += f_83_;
				i++;
				if (!bool || f < aFloatArray1500[i])
				    is[i] = i_79_;
				f += f_83_;
			    } while (--i_80_ > 0);
			}
			i_80_ = i_82_ - i_81_ & 0x3;
			if (i_80_ > 0) {
			    i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						 | (int) f_86_ & 0xff00
						 | (int) f_88_ & 0xff);
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i])
				    is[i] = i_79_;
				f += f_83_;
			    } while (--i_80_ > 0);
			}
		    } else if (!aBool1483) {
			int i_173_ = anInt1486;
			int i_174_ = 256 - anInt1486;
			if (i_80_ > 0) {
			    do {
				i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						     | (int) f_86_ & 0xff00
						     | (int) f_88_ & 0xff);
				f_84_ += f_85_;
				f_86_ += f_87_;
				f_88_ += f_89_;
				i_79_ = (((i_79_ & 0xff00ff) * i_174_ >> 8
					  & 0xff00ff)
					 + ((i_79_ & 0xff00) * i_174_ >> 8
					    & 0xff00));
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int i_175_ = is[i];
				    if (bool_78_)
					is[i] = ((i_174_ | i_175_ >> 24) << 24
						 | (i_79_
						    + (((i_175_ & 0xff00ff)
							* i_173_) >> 8
						       & 0xff00ff)
						    + (((i_175_ & 0xff00)
							* i_173_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_79_
					       + (((i_175_ & 0xff00ff) * i_173_
						   >> 8)
						  & 0xff00ff)
					       + (((i_175_ & 0xff00) * i_173_
						   >> 8)
						  & 0xff00));
				}
				f += f_83_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int i_176_ = is[i];
				    if (bool_78_)
					is[i] = ((i_174_ | i_176_ >> 24) << 24
						 | (i_79_
						    + (((i_176_ & 0xff00ff)
							* i_173_) >> 8
						       & 0xff00ff)
						    + (((i_176_ & 0xff00)
							* i_173_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_79_
					       + (((i_176_ & 0xff00ff) * i_173_
						   >> 8)
						  & 0xff00ff)
					       + (((i_176_ & 0xff00) * i_173_
						   >> 8)
						  & 0xff00));
				}
				f += f_83_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int i_177_ = is[i];
				    if (bool_78_)
					is[i] = ((i_174_ | i_177_ >> 24) << 24
						 | (i_79_
						    + (((i_177_ & 0xff00ff)
							* i_173_) >> 8
						       & 0xff00ff)
						    + (((i_177_ & 0xff00)
							* i_173_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_79_
					       + (((i_177_ & 0xff00ff) * i_173_
						   >> 8)
						  & 0xff00ff)
					       + (((i_177_ & 0xff00) * i_173_
						   >> 8)
						  & 0xff00));
				}
				f += f_83_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int i_178_ = is[i];
				    if (bool_78_)
					is[i] = ((i_174_ | i_178_ >> 24) << 24
						 | (i_79_
						    + (((i_178_ & 0xff00ff)
							* i_173_) >> 8
						       & 0xff00ff)
						    + (((i_178_ & 0xff00)
							* i_173_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_79_
					       + (((i_178_ & 0xff00ff) * i_173_
						   >> 8)
						  & 0xff00ff)
					       + (((i_178_ & 0xff00) * i_173_
						   >> 8)
						  & 0xff00));
				}
				f += f_83_;
			    } while (--i_80_ > 0);
			}
			i_80_ = i_82_ - i_81_ & 0x3;
			if (i_80_ > 0) {
			    i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						 | (int) f_86_ & 0xff00
						 | (int) f_88_ & 0xff);
			    i_79_ = (((i_79_ & 0xff00ff) * i_174_ >> 8
				      & 0xff00ff)
				     + ((i_79_ & 0xff00) * i_174_ >> 8
					& 0xff00));
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int i_179_ = is[i];
				    if (bool_78_)
					is[i] = ((i_174_ | i_179_ >> 24) << 24
						 | (i_79_
						    + (((i_179_ & 0xff00ff)
							* i_173_) >> 8
						       & 0xff00ff)
						    + (((i_179_ & 0xff00)
							* i_173_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_79_
					       + (((i_179_ & 0xff00ff) * i_173_
						   >> 8)
						  & 0xff00ff)
					       + (((i_179_ & 0xff00) * i_173_
						   >> 8)
						  & 0xff00));
				}
				f += f_83_;
			    } while (--i_80_ > 0);
			}
		    } else {
			if (i_80_ > 0) {
			    do {
				i_79_ = ((int) f_84_ & 0xff0000
					 | (int) f_86_ & 0xff00
					 | (int) f_88_ & 0xff);
				f_84_ += f_85_;
				f_86_ += f_87_;
				f_88_ += f_89_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_180_ = is;
				    int i_181_ = i;
				    int i_182_ = i_79_;
				    int i_183_ = is_180_[i_181_];
				    int i_184_ = i_182_ + i_183_;
				    int i_185_ = ((i_182_ & 0xff00ff)
						  + (i_183_ & 0xff00ff));
				    i_183_ = ((i_185_ & 0x1000100)
					      + (i_184_ - i_185_ & 0x10000));
				    is_180_[i_181_]
					= (~0xffffff | i_184_ - i_183_
					   | i_183_ - (i_183_ >>> 8));
				}
				f += f_83_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_186_ = is;
				    int i_187_ = i;
				    int i_188_ = i_79_;
				    int i_189_ = is_186_[i_187_];
				    int i_190_ = i_188_ + i_189_;
				    int i_191_ = ((i_188_ & 0xff00ff)
						  + (i_189_ & 0xff00ff));
				    i_189_ = ((i_191_ & 0x1000100)
					      + (i_190_ - i_191_ & 0x10000));
				    is_186_[i_187_]
					= (~0xffffff | i_190_ - i_189_
					   | i_189_ - (i_189_ >>> 8));
				}
				f += f_83_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_192_ = is;
				    int i_193_ = i;
				    int i_194_ = i_79_;
				    int i_195_ = is_192_[i_193_];
				    int i_196_ = i_194_ + i_195_;
				    int i_197_ = ((i_194_ & 0xff00ff)
						  + (i_195_ & 0xff00ff));
				    i_195_ = ((i_197_ & 0x1000100)
					      + (i_196_ - i_197_ & 0x10000));
				    is_192_[i_193_]
					= (~0xffffff | i_196_ - i_195_
					   | i_195_ - (i_195_ >>> 8));
				}
				f += f_83_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_198_ = is;
				    int i_199_ = i;
				    int i_200_ = i_79_;
				    int i_201_ = is_198_[i_199_];
				    int i_202_ = i_200_ + i_201_;
				    int i_203_ = ((i_200_ & 0xff00ff)
						  + (i_201_ & 0xff00ff));
				    i_201_ = ((i_203_ & 0x1000100)
					      + (i_202_ - i_203_ & 0x10000));
				    is_198_[i_199_]
					= (~0xffffff | i_202_ - i_201_
					   | i_201_ - (i_201_ >>> 8));
				}
				f += f_83_;
			    } while (--i_80_ > 0);
			}
			i_80_ = i_82_ - i_81_ & 0x3;
			if (i_80_ > 0) {
			    i_79_ = ((int) f_84_ & 0xff0000
				     | (int) f_86_ & 0xff00
				     | (int) f_88_ & 0xff);
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_204_ = is;
				    int i_205_ = i;
				    int i_206_ = i_79_;
				    int i_207_ = is_204_[i_205_];
				    int i_208_ = i_206_ + i_207_;
				    int i_209_ = ((i_206_ & 0xff00ff)
						  + (i_207_ & 0xff00ff));
				    i_207_ = ((i_209_ & 0x1000100)
					      + (i_208_ - i_209_ & 0x10000));
				    is_204_[i_205_]
					= (~0xffffff | i_208_ - i_207_
					   | i_207_ - (i_207_ >>> 8));
				}
				f += f_83_;
			    } while (--i_80_ > 0);
			}
		    }
		} else {
		    i_80_ = i_82_ - i_81_;
		    if (anInt1486 == 0) {
			do {
			    i++;
			    if (!bool || f < aFloatArray1500[i])
				is[i] = ~0xffffff | ((int) f_84_ & 0xff0000
						     | (int) f_86_ & 0xff00
						     | (int) f_88_ & 0xff);
			    f += f_83_;
			    f_84_ += f_85_;
			    f_86_ += f_87_;
			    f_88_ += f_89_;
			} while (--i_80_ > 0);
		    } else if (!aBool1483) {
			int i_210_ = anInt1486;
			int i_211_ = 256 - anInt1486;
			do {
			    i++;
			    if (!bool || f < aFloatArray1500[i]) {
				i_79_ = ~0xffffff | ((int) f_84_ & 0xff0000
						     | (int) f_86_ & 0xff00
						     | (int) f_88_ & 0xff);
				i_79_ = (((i_79_ & 0xff00ff) * i_211_ >> 8
					  & 0xff00ff)
					 + ((i_79_ & 0xff00) * i_211_ >> 8
					    & 0xff00));
				int i_212_ = is[i];
				if (bool_78_)
				    is[i]
					= ((i_211_ | i_212_ >> 24) << 24
					   | (i_79_
					      + (((i_212_ & 0xff00ff) * i_210_
						  >> 8)
						 & 0xff00ff)
					      + (((i_212_ & 0xff00) * i_210_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_79_
					   + ((i_212_ & 0xff00ff) * i_210_ >> 8
					      & 0xff00ff)
					   + ((i_212_ & 0xff00) * i_210_ >> 8
					      & 0xff00));
			    }
			    f += f_83_;
			    f_84_ += f_85_;
			    f_86_ += f_87_;
			    f_88_ += f_89_;
			} while (--i_80_ > 0);
		    } else {
			do {
			    i++;
			    if (!bool || f < aFloatArray1500[i]) {
				int[] is_213_ = is;
				int i_214_ = i;
				int i_215_ = ((int) f_84_ & 0xff0000
					      | (int) f_86_ & 0xff00
					      | (int) f_88_ & 0xff);
				int i_216_ = is_213_[i_214_];
				int i_217_ = i_215_ + i_216_;
				int i_218_ = ((i_215_ & 0xff00ff)
					      + (i_216_ & 0xff00ff));
				i_216_
				    = (i_218_ & 0x1000100) + (i_217_ - i_218_
							      & 0x10000);
				is_213_[i_214_] = (~0xffffff | i_217_ - i_216_
						   | i_216_ - (i_216_ >>> 8));
			    }
			    f += f_83_;
			    f_84_ += f_85_;
			    f_86_ += f_87_;
			    f_88_ += f_89_;
			} while (--i_80_ > 0);
		    }
		}
	    }
	}
    }
    
    final void method2243(boolean bool, boolean bool_219_, boolean bool_220_,
			  float f, float f_221_, float f_222_, float f_223_,
			  float f_224_, float f_225_, float f_226_,
			  float f_227_, float f_228_, int i, int i_229_,
			  int i_230_) {
	if (!bool)
	    method2256(false, bool_219_, bool_220_, f, f_221_, f_222_, f_223_,
		       f_224_, f_225_, f_226_, f_227_, f_228_, 0);
	else if (aBool1510) {
	    aClass182_Sub2_1488.method3194((int) f_223_, (int) f, (int) f_224_,
					   (int) f_221_, ~0xffffff | i,
					   -2065804103);
	    aClass182_Sub2_1488.method3194((int) f_224_, (int) f_221_,
					   (int) f_225_, (int) f_222_,
					   ~0xffffff | i, -2019327771);
	    aClass182_Sub2_1488.method3194((int) f_225_, (int) f_222_,
					   (int) f_223_, (int) f,
					   ~0xffffff | i, -2075150396);
	} else {
	    float f_231_ = f_224_ - f_223_;
	    float f_232_ = f_221_ - f;
	    float f_233_ = f_225_ - f_223_;
	    float f_234_ = f_222_ - f;
	    float f_235_ = f_227_ - f_226_;
	    float f_236_ = f_228_ - f_226_;
	    float f_237_ = (float) ((i_229_ & 0xff0000) - (i & 0xff0000));
	    float f_238_ = (float) ((i_230_ & 0xff0000) - (i & 0xff0000));
	    float f_239_ = (float) ((i_229_ & 0xff00) - (i & 0xff00));
	    float f_240_ = (float) ((i_230_ & 0xff00) - (i & 0xff00));
	    float f_241_ = (float) ((i_229_ & 0xff) - (i & 0xff));
	    float f_242_ = (float) ((i_230_ & 0xff) - (i & 0xff));
	    float f_243_;
	    if (f_222_ != f_221_)
		f_243_ = (f_225_ - f_224_) / (f_222_ - f_221_);
	    else
		f_243_ = 0.0F;
	    float f_244_;
	    if (f_221_ != f)
		f_244_ = f_231_ / f_232_;
	    else
		f_244_ = 0.0F;
	    float f_245_;
	    if (f_222_ != f)
		f_245_ = f_233_ / f_234_;
	    else
		f_245_ = 0.0F;
	    float f_246_ = f_231_ * f_234_ - f_233_ * f_232_;
	    if (f_246_ != 0.0F) {
		float f_247_ = (f_235_ * f_234_ - f_236_ * f_232_) / f_246_;
		float f_248_ = (f_236_ * f_231_ - f_235_ * f_233_) / f_246_;
		float f_249_ = (f_237_ * f_234_ - f_238_ * f_232_) / f_246_;
		float f_250_ = (f_238_ * f_231_ - f_237_ * f_233_) / f_246_;
		float f_251_ = (f_239_ * f_234_ - f_240_ * f_232_) / f_246_;
		float f_252_ = (f_240_ * f_231_ - f_239_ * f_233_) / f_246_;
		float f_253_ = (f_241_ * f_234_ - f_242_ * f_232_) / f_246_;
		float f_254_ = (f_242_ * f_231_ - f_241_ * f_233_) / f_246_;
		if (f <= f_221_ && f <= f_222_) {
		    if (!(f >= (float) anInt1495)) {
			if (f_221_ > (float) anInt1495)
			    f_221_ = (float) anInt1495;
			if (f_222_ > (float) anInt1495)
			    f_222_ = (float) anInt1495;
			f_226_ = f_226_ - f_247_ * f_223_ + f_247_;
			float f_255_ = ((float) (i & 0xff0000)
					- f_249_ * f_223_ + f_249_);
			float f_256_
			    = (float) (i & 0xff00) - f_251_ * f_223_ + f_251_;
			float f_257_
			    = (float) (i & 0xff) - f_253_ * f_223_ + f_253_;
			if (f_221_ < f_222_) {
			    f_225_ = f_223_;
			    if (f < 0.0F) {
				f_225_ -= f_245_ * f;
				f_223_ -= f_244_ * f;
				f_226_ -= f_248_ * f;
				f_255_ -= f_250_ * f;
				f_256_ -= f_252_ * f;
				f_257_ -= f_254_ * f;
				f = 0.0F;
			    }
			    if (f_221_ < 0.0F) {
				f_224_ -= f_243_ * f_221_;
				f_221_ = 0.0F;
			    }
			    if (f != f_221_ && f_245_ < f_244_
				|| f == f_221_ && f_245_ > f_243_) {
				f += 0.5F;
				f_221_ += 0.5F;
				f_222_
				    = (float) (int) (f_222_ + 0.5F) - f_221_;
				f_221_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_221_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_225_, (int) f_223_,
					       f_226_, f_247_, f_255_, f_249_,
					       f_256_, f_251_, f_257_, f_253_);
				    f_225_ += f_245_;
				    f_223_ += f_244_;
				    f_226_ += f_248_;
				    f_255_ += f_250_;
				    f_256_ += f_252_;
				    f_257_ += f_254_;
				    f += (float) anInt1498;
				}
				while (--f_222_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_225_, (int) f_224_,
					       f_226_, f_247_, f_255_, f_249_,
					       f_256_, f_251_, f_257_, f_253_);
				    f_225_ += f_245_;
				    f_224_ += f_243_;
				    f_226_ += f_248_;
				    f_255_ += f_250_;
				    f_256_ += f_252_;
				    f_257_ += f_254_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_221_ += 0.5F;
				f_222_
				    = (float) (int) (f_222_ + 0.5F) - f_221_;
				f_221_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_221_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_223_, (int) f_225_,
					       f_226_, f_247_, f_255_, f_249_,
					       f_256_, f_251_, f_257_, f_253_);
				    f_225_ += f_245_;
				    f_223_ += f_244_;
				    f_226_ += f_248_;
				    f_255_ += f_250_;
				    f_256_ += f_252_;
				    f_257_ += f_254_;
				    f += (float) anInt1498;
				}
				while (--f_222_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_224_, (int) f_225_,
					       f_226_, f_247_, f_255_, f_249_,
					       f_256_, f_251_, f_257_, f_253_);
				    f_225_ += f_245_;
				    f_224_ += f_243_;
				    f_226_ += f_248_;
				    f_255_ += f_250_;
				    f_256_ += f_252_;
				    f_257_ += f_254_;
				    f += (float) anInt1498;
				}
			    }
			} else {
			    f_224_ = f_223_;
			    if (f < 0.0F) {
				f_224_ -= f_245_ * f;
				f_223_ -= f_244_ * f;
				f_226_ -= f_248_ * f;
				f_255_ -= f_250_ * f;
				f_256_ -= f_252_ * f;
				f_257_ -= f_254_ * f;
				f = 0.0F;
			    }
			    if (f_222_ < 0.0F) {
				f_225_ -= f_243_ * f_222_;
				f_222_ = 0.0F;
			    }
			    if (f != f_222_ && f_245_ < f_244_
				|| f == f_222_ && f_243_ > f_244_) {
				f += 0.5F;
				f_222_ += 0.5F;
				f_221_
				    = (float) (int) (f_221_ + 0.5F) - f_222_;
				f_222_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_222_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_224_, (int) f_223_,
					       f_226_, f_247_, f_255_, f_249_,
					       f_256_, f_251_, f_257_, f_253_);
				    f_224_ += f_245_;
				    f_223_ += f_244_;
				    f_226_ += f_248_;
				    f_255_ += f_250_;
				    f_256_ += f_252_;
				    f_257_ += f_254_;
				    f += (float) anInt1498;
				}
				while (--f_221_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_225_, (int) f_223_,
					       f_226_, f_247_, f_255_, f_249_,
					       f_256_, f_251_, f_257_, f_253_);
				    f_225_ += f_243_;
				    f_223_ += f_244_;
				    f_226_ += f_248_;
				    f_255_ += f_250_;
				    f_256_ += f_252_;
				    f_257_ += f_254_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_222_ += 0.5F;
				f_221_
				    = (float) (int) (f_221_ + 0.5F) - f_222_;
				f_222_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_222_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_223_, (int) f_224_,
					       f_226_, f_247_, f_255_, f_249_,
					       f_256_, f_251_, f_257_, f_253_);
				    f_224_ += f_245_;
				    f_223_ += f_244_;
				    f_226_ += f_248_;
				    f_255_ += f_250_;
				    f_256_ += f_252_;
				    f_257_ += f_254_;
				    f += (float) anInt1498;
				}
				while (--f_221_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_223_, (int) f_225_,
					       f_226_, f_247_, f_255_, f_249_,
					       f_256_, f_251_, f_257_, f_253_);
				    f_225_ += f_243_;
				    f_223_ += f_244_;
				    f_226_ += f_248_;
				    f_255_ += f_250_;
				    f_256_ += f_252_;
				    f_257_ += f_254_;
				    f += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (f_221_ <= f_222_) {
		    if (!(f_221_ >= (float) anInt1495)) {
			if (f_222_ > (float) anInt1495)
			    f_222_ = (float) anInt1495;
			if (f > (float) anInt1495)
			    f = (float) anInt1495;
			f_227_ = f_227_ - f_247_ * f_224_ + f_247_;
			float f_258_ = ((float) (i_229_ & 0xff0000)
					- f_249_ * f_224_ + f_249_);
			float f_259_ = ((float) (i_229_ & 0xff00)
					- f_251_ * f_224_ + f_251_);
			float f_260_ = ((float) (i_229_ & 0xff)
					- f_253_ * f_224_ + f_253_);
			if (f_222_ < f) {
			    f_223_ = f_224_;
			    if (f_221_ < 0.0F) {
				f_223_ -= f_244_ * f_221_;
				f_224_ -= f_243_ * f_221_;
				f_227_ -= f_248_ * f_221_;
				f_258_ -= f_250_ * f_221_;
				f_259_ -= f_252_ * f_221_;
				f_260_ -= f_254_ * f_221_;
				f_221_ = 0.0F;
			    }
			    if (f_222_ < 0.0F) {
				f_225_ -= f_245_ * f_222_;
				f_222_ = 0.0F;
			    }
			    if (f_221_ != f_222_ && f_244_ < f_243_
				|| f_221_ == f_222_ && f_244_ > f_245_) {
				f_221_ += 0.5F;
				f_222_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_222_;
				f_222_ -= f_221_;
				f_221_ = (float) anIntArray1487[(int) f_221_];
				while (--f_222_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f_221_, 0,
					       0, (int) f_223_, (int) f_224_,
					       f_227_, f_247_, f_258_, f_249_,
					       f_259_, f_251_, f_260_, f_253_);
				    f_223_ += f_244_;
				    f_224_ += f_243_;
				    f_227_ += f_248_;
				    f_258_ += f_250_;
				    f_259_ += f_252_;
				    f_260_ += f_254_;
				    f_221_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f_221_, 0,
					       0, (int) f_223_, (int) f_225_,
					       f_227_, f_247_, f_258_, f_249_,
					       f_259_, f_251_, f_260_, f_253_);
				    f_223_ += f_244_;
				    f_225_ += f_245_;
				    f_227_ += f_248_;
				    f_258_ += f_250_;
				    f_259_ += f_252_;
				    f_260_ += f_254_;
				    f_221_ += (float) anInt1498;
				}
			    } else {
				f_221_ += 0.5F;
				f_222_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_222_;
				f_222_ -= f_221_;
				f_221_ = (float) anIntArray1487[(int) f_221_];
				while (--f_222_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f_221_, 0,
					       0, (int) f_224_, (int) f_223_,
					       f_227_, f_247_, f_258_, f_249_,
					       f_259_, f_251_, f_260_, f_253_);
				    f_223_ += f_244_;
				    f_224_ += f_243_;
				    f_227_ += f_248_;
				    f_258_ += f_250_;
				    f_259_ += f_252_;
				    f_260_ += f_254_;
				    f_221_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f_221_, 0,
					       0, (int) f_225_, (int) f_223_,
					       f_227_, f_247_, f_258_, f_249_,
					       f_259_, f_251_, f_260_, f_253_);
				    f_223_ += f_244_;
				    f_225_ += f_245_;
				    f_227_ += f_248_;
				    f_258_ += f_250_;
				    f_259_ += f_252_;
				    f_260_ += f_254_;
				    f_221_ += (float) anInt1498;
				}
			    }
			} else {
			    f_225_ = f_224_;
			    if (f_221_ < 0.0F) {
				f_225_ -= f_244_ * f_221_;
				f_224_ -= f_243_ * f_221_;
				f_227_ -= f_248_ * f_221_;
				f_258_ -= f_250_ * f_221_;
				f_259_ -= f_252_ * f_221_;
				f_260_ -= f_254_ * f_221_;
				f_221_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_223_ -= f_245_ * f;
				f = 0.0F;
			    }
			    if (f_244_ < f_243_) {
				f_221_ += 0.5F;
				f += 0.5F;
				f_222_ = (float) (int) (f_222_ + 0.5F) - f;
				f -= f_221_;
				f_221_ = (float) anIntArray1487[(int) f_221_];
				while (--f >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f_221_, 0,
					       0, (int) f_225_, (int) f_224_,
					       f_227_, f_247_, f_258_, f_249_,
					       f_259_, f_251_, f_260_, f_253_);
				    f_225_ += f_244_;
				    f_224_ += f_243_;
				    f_227_ += f_248_;
				    f_258_ += f_250_;
				    f_259_ += f_252_;
				    f_260_ += f_254_;
				    f_221_ += (float) anInt1498;
				}
				while (--f_222_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f_221_, 0,
					       0, (int) f_223_, (int) f_224_,
					       f_227_, f_247_, f_258_, f_249_,
					       f_259_, f_251_, f_260_, f_253_);
				    f_223_ += f_245_;
				    f_224_ += f_243_;
				    f_227_ += f_248_;
				    f_258_ += f_250_;
				    f_259_ += f_252_;
				    f_260_ += f_254_;
				    f_221_ += (float) anInt1498;
				}
			    } else {
				f_221_ += 0.5F;
				f += 0.5F;
				f_222_ = (float) (int) (f_222_ + 0.5F) - f;
				f -= f_221_;
				f_221_ = (float) anIntArray1487[(int) f_221_];
				while (--f >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f_221_, 0,
					       0, (int) f_224_, (int) f_225_,
					       f_227_, f_247_, f_258_, f_249_,
					       f_259_, f_251_, f_260_, f_253_);
				    f_225_ += f_244_;
				    f_224_ += f_243_;
				    f_227_ += f_248_;
				    f_258_ += f_250_;
				    f_259_ += f_252_;
				    f_260_ += f_254_;
				    f_221_ += (float) anInt1498;
				}
				while (--f_222_ >= 0.0F) {
				    method2245(bool_219_, bool_220_,
					       anIntArray1499, (int) f_221_, 0,
					       0, (int) f_224_, (int) f_223_,
					       f_227_, f_247_, f_258_, f_249_,
					       f_259_, f_251_, f_260_, f_253_);
				    f_223_ += f_245_;
				    f_224_ += f_243_;
				    f_227_ += f_248_;
				    f_258_ += f_250_;
				    f_259_ += f_252_;
				    f_260_ += f_254_;
				    f_221_ += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (!(f_222_ >= (float) anInt1495)) {
		    if (f > (float) anInt1495)
			f = (float) anInt1495;
		    if (f_221_ > (float) anInt1495)
			f_221_ = (float) anInt1495;
		    f_228_ = f_228_ - f_247_ * f_225_ + f_247_;
		    float f_261_ = ((float) (i_230_ & 0xff0000)
				    - f_249_ * f_225_ + f_249_);
		    float f_262_
			= (float) (i_230_ & 0xff00) - f_251_ * f_225_ + f_251_;
		    float f_263_
			= (float) (i_230_ & 0xff) - f_253_ * f_225_ + f_253_;
		    if (f < f_221_) {
			f_224_ = f_225_;
			if (f_222_ < 0.0F) {
			    f_224_ -= f_243_ * f_222_;
			    f_225_ -= f_245_ * f_222_;
			    f_228_ -= f_248_ * f_222_;
			    f_261_ -= f_250_ * f_222_;
			    f_262_ -= f_252_ * f_222_;
			    f_263_ -= f_254_ * f_222_;
			    f_222_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_223_ -= f_244_ * f;
			    f = 0.0F;
			}
			if (f_243_ < f_245_) {
			    f_222_ += 0.5F;
			    f += 0.5F;
			    f_221_ = (float) (int) (f_221_ + 0.5F) - f;
			    f -= f_222_;
			    f_222_ = (float) anIntArray1487[(int) f_222_];
			    while (--f >= 0.0F) {
				method2245(bool_219_, bool_220_,
					   anIntArray1499, (int) f_222_, 0, 0,
					   (int) f_224_, (int) f_225_, f_228_,
					   f_247_, f_261_, f_249_, f_262_,
					   f_251_, f_263_, f_253_);
				f_224_ += f_243_;
				f_225_ += f_245_;
				f_228_ += f_248_;
				f_261_ += f_250_;
				f_262_ += f_252_;
				f_263_ += f_254_;
				f_222_ += (float) anInt1498;
			    }
			    while (--f_221_ >= 0.0F) {
				method2245(bool_219_, bool_220_,
					   anIntArray1499, (int) f_222_, 0, 0,
					   (int) f_224_, (int) f_223_, f_228_,
					   f_247_, f_261_, f_249_, f_262_,
					   f_251_, f_263_, f_253_);
				f_224_ += f_243_;
				f_223_ += f_244_;
				f_228_ += f_248_;
				f_261_ += f_250_;
				f_262_ += f_252_;
				f_263_ += f_254_;
				f_222_ += (float) anInt1498;
			    }
			} else {
			    f_222_ += 0.5F;
			    f += 0.5F;
			    f_221_ = (float) (int) (f_221_ + 0.5F) - f;
			    f -= f_222_;
			    f_222_ = (float) anIntArray1487[(int) f_222_];
			    while (--f >= 0.0F) {
				method2245(bool_219_, bool_220_,
					   anIntArray1499, (int) f_222_, 0, 0,
					   (int) f_225_, (int) f_224_, f_228_,
					   f_247_, f_261_, f_249_, f_262_,
					   f_251_, f_263_, f_253_);
				f_224_ += f_243_;
				f_225_ += f_245_;
				f_228_ += f_248_;
				f_261_ += f_250_;
				f_262_ += f_252_;
				f_263_ += f_254_;
				f_222_ += (float) anInt1498;
			    }
			    while (--f_221_ >= 0.0F) {
				method2245(bool_219_, bool_220_,
					   anIntArray1499, (int) f_222_, 0, 0,
					   (int) f_223_, (int) f_224_, f_228_,
					   f_247_, f_261_, f_249_, f_262_,
					   f_251_, f_263_, f_253_);
				f_224_ += f_243_;
				f_223_ += f_244_;
				f_228_ += f_248_;
				f_261_ += f_250_;
				f_262_ += f_252_;
				f_263_ += f_254_;
				f_222_ += (float) anInt1498;
			    }
			}
		    } else {
			f_223_ = f_225_;
			if (f_222_ < 0.0F) {
			    f_223_ -= f_243_ * f_222_;
			    f_225_ -= f_245_ * f_222_;
			    f_228_ -= f_248_ * f_222_;
			    f_261_ -= f_250_ * f_222_;
			    f_262_ -= f_252_ * f_222_;
			    f_263_ -= f_254_ * f_222_;
			    f_222_ = 0.0F;
			}
			if (f_221_ < 0.0F) {
			    f_224_ -= f_244_ * f_221_;
			    f_221_ = 0.0F;
			}
			if (f_243_ < f_245_) {
			    f_222_ += 0.5F;
			    f_221_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_221_;
			    f_221_ -= f_222_;
			    f_222_ = (float) anIntArray1487[(int) f_222_];
			    while (--f_221_ >= 0.0F) {
				method2245(bool_219_, bool_220_,
					   anIntArray1499, (int) f_222_, 0, 0,
					   (int) f_223_, (int) f_225_, f_228_,
					   f_247_, f_261_, f_249_, f_262_,
					   f_251_, f_263_, f_253_);
				f_223_ += f_243_;
				f_225_ += f_245_;
				f_228_ += f_248_;
				f_261_ += f_250_;
				f_262_ += f_252_;
				f_263_ += f_254_;
				f_222_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2245(bool_219_, bool_220_,
					   anIntArray1499, (int) f_222_, 0, 0,
					   (int) f_224_, (int) f_225_, f_228_,
					   f_247_, f_261_, f_249_, f_262_,
					   f_251_, f_263_, f_253_);
				f_224_ += f_244_;
				f_225_ += f_245_;
				f_228_ += f_248_;
				f_261_ += f_250_;
				f_262_ += f_252_;
				f_263_ += f_254_;
				f_222_ += (float) anInt1498;
			    }
			} else {
			    f_222_ += 0.5F;
			    f_221_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_221_;
			    f_221_ -= f_222_;
			    f_222_ = (float) anIntArray1487[(int) f_222_];
			    while (--f_221_ >= 0.0F) {
				method2245(bool_219_, bool_220_,
					   anIntArray1499, (int) f_222_, 0, 0,
					   (int) f_225_, (int) f_223_, f_228_,
					   f_247_, f_261_, f_249_, f_262_,
					   f_251_, f_263_, f_253_);
				f_223_ += f_243_;
				f_225_ += f_245_;
				f_228_ += f_248_;
				f_261_ += f_250_;
				f_262_ += f_252_;
				f_263_ += f_254_;
				f_222_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2245(bool_219_, bool_220_,
					   anIntArray1499, (int) f_222_, 0, 0,
					   (int) f_225_, (int) f_224_, f_228_,
					   f_247_, f_261_, f_249_, f_262_,
					   f_251_, f_263_, f_253_);
				f_224_ += f_244_;
				f_225_ += f_245_;
				f_228_ += f_248_;
				f_261_ += f_250_;
				f_262_ += f_252_;
				f_263_ += f_254_;
				f_222_ += (float) anInt1498;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method2244(boolean bool, boolean bool_264_, int[] is, int i,
			  int i_265_, int i_266_, int i_267_, int i_268_,
			  float f, float f_269_, float f_270_, float f_271_) {
	if (aBool1485) {
	    if (i_268_ > anInt1494)
		i_268_ = anInt1494;
	    if (i_267_ < 0)
		i_267_ = 0;
	}
	if (i_267_ < i_268_) {
	    i += i_267_ - 1;
	    f += f_269_ * (float) i_267_;
	    f_270_ += f_271_ * (float) i_267_;
	    if (aClass110_1497.aBool1335) {
		if (aBool1482) {
		    i_266_ = i_268_ - i_267_ >> 2;
		    f_269_ *= 4.0F;
		    if (anInt1486 == 0) {
			if (i_266_ > 0) {
			    do {
				i_265_ = (Class381.anIntArray3929
					  [(int) f & 0xffff]);
				f += f_269_;
				i++;
				if (!bool || f_270_ < aFloatArray1500[i]) {
				    is[i] = i_265_;
				    if (bool)
					aFloatArray1500[i] = f_270_;
				}
				f_270_ += f_271_;
				i++;
				if (!bool || f_270_ < aFloatArray1500[i]) {
				    is[i] = i_265_;
				    if (bool)
					aFloatArray1500[i] = f_270_;
				}
				f_270_ += f_271_;
				i++;
				if (!bool || f_270_ < aFloatArray1500[i]) {
				    is[i] = i_265_;
				    if (bool)
					aFloatArray1500[i] = f_270_;
				}
				f_270_ += f_271_;
				i++;
				if (!bool || f_270_ < aFloatArray1500[i]) {
				    is[i] = i_265_;
				    if (bool)
					aFloatArray1500[i] = f_270_;
				}
				f_270_ += f_271_;
			    } while (--i_266_ > 0);
			}
			i_266_ = i_268_ - i_267_ & 0x3;
			if (i_266_ > 0) {
			    i_265_ = Class381.anIntArray3929[(int) f & 0xffff];
			    do {
				i++;
				if (!bool || f_270_ < aFloatArray1500[i]) {
				    is[i] = i_265_;
				    if (bool)
					aFloatArray1500[i] = f_270_;
				}
				f_270_ += f_271_;
			    } while (--i_266_ > 0);
			}
		    } else {
			int i_272_ = anInt1486;
			int i_273_ = 256 - anInt1486;
			if (i_266_ > 0) {
			    do {
				i_265_ = (Class381.anIntArray3929
					  [(int) f & 0xffff]);
				f += f_269_;
				i_265_ = (((i_265_ & 0xff00ff) * i_273_ >> 8
					   & 0xff00ff)
					  + ((i_265_ & 0xff00) * i_273_ >> 8
					     & 0xff00));
				i++;
				if (!bool || f_270_ < aFloatArray1500[i]) {
				    int i_274_ = is[i];
				    if (bool_264_)
					is[i] = ((i_273_ | i_274_ >> 24) << 24
						 | (i_265_
						    + (((i_274_ & 0xff00ff)
							* i_272_) >> 8
						       & 0xff00ff)
						    + (((i_274_ & 0xff00)
							* i_272_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_265_
					       + (((i_274_ & 0xff00ff) * i_272_
						   >> 8)
						  & 0xff00ff)
					       + (((i_274_ & 0xff00) * i_272_
						   >> 8)
						  & 0xff00));
				    if (bool)
					aFloatArray1500[i] = f_270_;
				}
				f_270_ += f_271_;
				i++;
				if (!bool || f_270_ < aFloatArray1500[i]) {
				    int i_275_ = is[i];
				    if (bool_264_)
					is[i] = ((i_273_ | i_275_ >> 24) << 24
						 | (i_265_
						    + (((i_275_ & 0xff00ff)
							* i_272_) >> 8
						       & 0xff00ff)
						    + (((i_275_ & 0xff00)
							* i_272_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_265_
					       + (((i_275_ & 0xff00ff) * i_272_
						   >> 8)
						  & 0xff00ff)
					       + (((i_275_ & 0xff00) * i_272_
						   >> 8)
						  & 0xff00));
				    if (bool)
					aFloatArray1500[i] = f_270_;
				}
				f_270_ += f_271_;
				i++;
				if (!bool || f_270_ < aFloatArray1500[i]) {
				    int i_276_ = is[i];
				    if (bool_264_)
					is[i] = ((i_273_ | i_276_ >> 24) << 24
						 | (i_265_
						    + (((i_276_ & 0xff00ff)
							* i_272_) >> 8
						       & 0xff00ff)
						    + (((i_276_ & 0xff00)
							* i_272_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_265_
					       + (((i_276_ & 0xff00ff) * i_272_
						   >> 8)
						  & 0xff00ff)
					       + (((i_276_ & 0xff00) * i_272_
						   >> 8)
						  & 0xff00));
				    if (bool)
					aFloatArray1500[i] = f_270_;
				}
				f_270_ += f_271_;
				i++;
				if (!bool || f_270_ < aFloatArray1500[i]) {
				    int i_277_ = is[i];
				    if (bool_264_)
					is[i] = ((i_273_ | i_277_ >> 24) << 24
						 | (i_265_
						    + (((i_277_ & 0xff00ff)
							* i_272_) >> 8
						       & 0xff00ff)
						    + (((i_277_ & 0xff00)
							* i_272_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_265_
					       + (((i_277_ & 0xff00ff) * i_272_
						   >> 8)
						  & 0xff00ff)
					       + (((i_277_ & 0xff00) * i_272_
						   >> 8)
						  & 0xff00));
				    if (bool)
					aFloatArray1500[i] = f_270_;
				}
				f_270_ += f_271_;
			    } while (--i_266_ > 0);
			}
			i_266_ = i_268_ - i_267_ & 0x3;
			if (i_266_ > 0) {
			    i_265_ = Class381.anIntArray3929[(int) f & 0xffff];
			    i_265_ = (((i_265_ & 0xff00ff) * i_273_ >> 8
				       & 0xff00ff)
				      + ((i_265_ & 0xff00) * i_273_ >> 8
					 & 0xff00));
			    do {
				i++;
				if (!bool || f_270_ < aFloatArray1500[i]) {
				    int i_278_ = is[i];
				    if (bool_264_)
					is[i] = ((i_273_ | i_278_ >> 24) << 24
						 | (i_265_
						    + (((i_278_ & 0xff00ff)
							* i_272_) >> 8
						       & 0xff00ff)
						    + (((i_278_ & 0xff00)
							* i_272_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_265_
					       + (((i_278_ & 0xff00ff) * i_272_
						   >> 8)
						  & 0xff00ff)
					       + (((i_278_ & 0xff00) * i_272_
						   >> 8)
						  & 0xff00));
				    if (bool)
					aFloatArray1500[i] = f_270_;
				}
				f_270_ += f_271_;
			    } while (--i_266_ > 0);
			}
		    }
		} else {
		    i_266_ = i_268_ - i_267_;
		    if (anInt1486 == 0) {
			do {
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i]) {
				is[i] = (Class381.anIntArray3929
					 [(int) f & 0xffff]);
				if (bool)
				    aFloatArray1500[i] = f_270_;
			    }
			    f_270_ += f_271_;
			    f += f_269_;
			} while (--i_266_ > 0);
		    } else {
			int i_279_ = anInt1486;
			int i_280_ = 256 - anInt1486;
			do {
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i]) {
				i_265_ = (Class381.anIntArray3929
					  [(int) f & 0xffff]);
				i_265_ = (((i_265_ & 0xff00ff) * i_280_ >> 8
					   & 0xff00ff)
					  + ((i_265_ & 0xff00) * i_280_ >> 8
					     & 0xff00));
				int i_281_ = is[i];
				if (bool_264_)
				    is[i]
					= ((i_280_ | i_281_ >> 24) << 24
					   | (i_265_
					      + (((i_281_ & 0xff00ff) * i_279_
						  >> 8)
						 & 0xff00ff)
					      + (((i_281_ & 0xff00) * i_279_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_265_
					   + ((i_281_ & 0xff00ff) * i_279_ >> 8
					      & 0xff00ff)
					   + ((i_281_ & 0xff00) * i_279_ >> 8
					      & 0xff00));
				if (bool)
				    aFloatArray1500[i] = f_270_;
			    }
			    f += f_269_;
			    f_270_ += f_271_;
			} while (--i_266_ > 0);
		    }
		}
	    } else if (aBool1482) {
		i_266_ = i_268_ - i_267_ >> 2;
		f_269_ *= 4.0F;
		if (anInt1486 == 0) {
		    if (i_266_ > 0) {
			do {
			    i_265_ = Class381.anIntArray3929[(int) f & 0xffff];
			    f += f_269_;
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i])
				is[i] = i_265_;
			    f_270_ += f_271_;
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i])
				is[i] = i_265_;
			    f_270_ += f_271_;
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i])
				is[i] = i_265_;
			    f_270_ += f_271_;
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i])
				is[i] = i_265_;
			    f_270_ += f_271_;
			} while (--i_266_ > 0);
		    }
		    i_266_ = i_268_ - i_267_ & 0x3;
		    if (i_266_ > 0) {
			i_265_ = Class381.anIntArray3929[(int) f & 0xffff];
			do {
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i])
				is[i] = i_265_;
			    f_270_ += f_271_;
			} while (--i_266_ > 0);
		    }
		} else {
		    int i_282_ = anInt1486;
		    int i_283_ = 256 - anInt1486;
		    if (i_266_ > 0) {
			do {
			    i_265_ = Class381.anIntArray3929[(int) f & 0xffff];
			    f += f_269_;
			    i_265_ = (((i_265_ & 0xff00ff) * i_283_ >> 8
				       & 0xff00ff)
				      + ((i_265_ & 0xff00) * i_283_ >> 8
					 & 0xff00));
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i]) {
				int i_284_ = is[i];
				if (bool_264_)
				    is[i]
					= ((i_283_ | i_284_ >> 24) << 24
					   | (i_265_
					      + (((i_284_ & 0xff00ff) * i_282_
						  >> 8)
						 & 0xff00ff)
					      + (((i_284_ & 0xff00) * i_282_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_265_
					   + ((i_284_ & 0xff00ff) * i_282_ >> 8
					      & 0xff00ff)
					   + ((i_284_ & 0xff00) * i_282_ >> 8
					      & 0xff00));
			    }
			    f_270_ += f_271_;
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i]) {
				int i_285_ = is[i];
				if (bool_264_)
				    is[i]
					= ((i_283_ | i_285_ >> 24) << 24
					   | (i_265_
					      + (((i_285_ & 0xff00ff) * i_282_
						  >> 8)
						 & 0xff00ff)
					      + (((i_285_ & 0xff00) * i_282_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_265_
					   + ((i_285_ & 0xff00ff) * i_282_ >> 8
					      & 0xff00ff)
					   + ((i_285_ & 0xff00) * i_282_ >> 8
					      & 0xff00));
			    }
			    f_270_ += f_271_;
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i]) {
				int i_286_ = is[i];
				if (bool_264_)
				    is[i]
					= ((i_283_ | i_286_ >> 24) << 24
					   | (i_265_
					      + (((i_286_ & 0xff00ff) * i_282_
						  >> 8)
						 & 0xff00ff)
					      + (((i_286_ & 0xff00) * i_282_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_265_
					   + ((i_286_ & 0xff00ff) * i_282_ >> 8
					      & 0xff00ff)
					   + ((i_286_ & 0xff00) * i_282_ >> 8
					      & 0xff00));
			    }
			    f_270_ += f_271_;
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i]) {
				int i_287_ = is[i];
				if (bool_264_)
				    is[i]
					= ((i_283_ | i_287_ >> 24) << 24
					   | (i_265_
					      + (((i_287_ & 0xff00ff) * i_282_
						  >> 8)
						 & 0xff00ff)
					      + (((i_287_ & 0xff00) * i_282_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_265_
					   + ((i_287_ & 0xff00ff) * i_282_ >> 8
					      & 0xff00ff)
					   + ((i_287_ & 0xff00) * i_282_ >> 8
					      & 0xff00));
			    }
			    f_270_ += f_271_;
			} while (--i_266_ > 0);
		    }
		    i_266_ = i_268_ - i_267_ & 0x3;
		    if (i_266_ > 0) {
			i_265_ = Class381.anIntArray3929[(int) f & 0xffff];
			i_265_
			    = (((i_265_ & 0xff00ff) * i_283_ >> 8 & 0xff00ff)
			       + ((i_265_ & 0xff00) * i_283_ >> 8 & 0xff00));
			do {
			    i++;
			    if (!bool || f_270_ < aFloatArray1500[i]) {
				int i_288_ = is[i];
				if (bool_264_)
				    is[i]
					= ((i_283_ | i_288_ >> 24) << 24
					   | (i_265_
					      + (((i_288_ & 0xff00ff) * i_282_
						  >> 8)
						 & 0xff00ff)
					      + (((i_288_ & 0xff00) * i_282_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_265_
					   + ((i_288_ & 0xff00ff) * i_282_ >> 8
					      & 0xff00ff)
					   + ((i_288_ & 0xff00) * i_282_ >> 8
					      & 0xff00));
			    }
			    f_270_ += f_271_;
			} while (--i_266_ > 0);
		    }
		}
	    } else {
		i_266_ = i_268_ - i_267_;
		if (anInt1486 == 0) {
		    do {
			i++;
			if (!bool || f_270_ < aFloatArray1500[i])
			    is[i] = Class381.anIntArray3929[(int) f & 0xffff];
			f_270_ += f_271_;
			f += f_269_;
		    } while (--i_266_ > 0);
		} else {
		    int i_289_ = anInt1486;
		    int i_290_ = 256 - anInt1486;
		    do {
			i++;
			if (!bool || f_270_ < aFloatArray1500[i]) {
			    i_265_ = Class381.anIntArray3929[(int) f & 0xffff];
			    i_265_ = (((i_265_ & 0xff00ff) * i_290_ >> 8
				       & 0xff00ff)
				      + ((i_265_ & 0xff00) * i_290_ >> 8
					 & 0xff00));
			    int i_291_ = is[i];
			    if (bool_264_)
				is[i]
				    = ((i_290_ | i_291_ >> 24) << 24
				       | (i_265_
					  + ((i_291_ & 0xff00ff) * i_289_ >> 8
					     & 0xff00ff)
					  + ((i_291_ & 0xff00) * i_289_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_265_
					 + ((i_291_ & 0xff00ff) * i_289_ >> 8
					    & 0xff00ff)
					 + ((i_291_ & 0xff00) * i_289_ >> 8
					    & 0xff00));
			}
			f += f_269_;
			f_270_ += f_271_;
		    } while (--i_266_ > 0);
		}
	    }
	}
    }
    
    Class128(Class182_Sub2 class182_sub2, Class110 class110) {
	aBool1482 = true;
	aBool1483 = false;
	anInt1486 = 0;
	aBool1485 = false;
	aBool1518 = false;
	anIntArray1487 = new int[4096];
	aFloat1492 = 0.0F;
	aFloat1493 = 1.0F;
	anInt1502 = -1;
	anIntArray1481 = null;
	anInt1504 = 0;
	anInt1505 = 0;
	aFloat1506 = 0.0F;
	anInt1496 = 0;
	aBool1484 = true;
	anInt1508 = -1;
	anIntArray1511 = null;
	anInt1512 = 0;
	anInt1513 = 0;
	aFloat1514 = 0.0F;
	anInt1515 = -1;
	anIntArray1516 = null;
	anInt1517 = 0;
	anInt1509 = 0;
	aFloat1519 = 0.0F;
	aClass182_Sub2_1488 = class182_sub2;
	aClass110_1497 = class110;
	anInt1498 = aClass182_Sub2_1488.anInt9494 * -476035351;
	anIntArray1499 = aClass182_Sub2_1488.anIntArray9466;
	aFloatArray1500 = aClass182_Sub2_1488.aFloatArray9469;
	aClass597_1507 = Class597.aClass597_7842;
    }
    
    final void method2245(boolean bool, boolean bool_292_, int[] is, int i,
			  int i_293_, int i_294_, int i_295_, int i_296_,
			  float f, float f_297_, float f_298_, float f_299_,
			  float f_300_, float f_301_, float f_302_,
			  float f_303_) {
	if (aBool1485) {
	    if (i_296_ > anInt1494)
		i_296_ = anInt1494;
	    if (i_295_ < 0)
		i_295_ = 0;
	}
	if (i_295_ < i_296_) {
	    if (aBool1518) {
		i += i_295_;
		f_298_ += f_299_ * (float) i_295_;
		f_300_ += f_301_ * (float) i_295_;
		f_302_ += f_303_ * (float) i_295_;
		if (aBool1482) {
		    i_294_ = i_296_ - i_295_ >> 2;
		    f_299_ *= 4.0F;
		    f_301_ *= 4.0F;
		    f_303_ *= 4.0F;
		    if (anInt1486 == 0) {
			if (i_294_ > 0) {
			    do {
				i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						      | (int) f_300_ & 0xff00
						      | (int) f_302_ & 0xff);
				f_298_ += f_299_;
				f_300_ += f_301_;
				f_302_ += f_303_;
				is[i++] = i_293_;
				is[i++] = i_293_;
				is[i++] = i_293_;
				is[i++] = i_293_;
			    } while (--i_294_ > 0);
			}
			i_294_ = i_296_ - i_295_ & 0x3;
			if (i_294_ > 0) {
			    i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						  | (int) f_300_ & 0xff00
						  | (int) f_302_ & 0xff);
			    do
				is[i++] = i_293_;
			    while (--i_294_ > 0);
			}
		    } else if (!aBool1483) {
			int i_304_ = anInt1486;
			int i_305_ = 256 - anInt1486;
			if (i_294_ > 0) {
			    do {
				i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						      | (int) f_300_ & 0xff00
						      | (int) f_302_ & 0xff);
				f_298_ += f_299_;
				f_300_ += f_301_;
				f_302_ += f_303_;
				i_293_ = (((i_293_ & 0xff00ff) * i_305_ >> 8
					   & 0xff00ff)
					  + ((i_293_ & 0xff00) * i_305_ >> 8
					     & 0xff00));
				int i_306_ = is[i];
				if (bool_292_) {
				    is[i++]
					= ((i_305_ | i_306_ >> 24) << 24
					   | (i_293_
					      + (((i_306_ & 0xff00ff) * i_304_
						  >> 8)
						 & 0xff00ff)
					      + (((i_306_ & 0xff00) * i_304_
						  >> 8)
						 & 0xff00)));
				    i_306_ = is[i];
				    is[i++]
					= ((i_305_ | i_306_ >> 24) << 24
					   | (i_293_
					      + (((i_306_ & 0xff00ff) * i_304_
						  >> 8)
						 & 0xff00ff)
					      + (((i_306_ & 0xff00) * i_304_
						  >> 8)
						 & 0xff00)));
				    i_306_ = is[i];
				    is[i++]
					= ((i_305_ | i_306_ >> 24) << 24
					   | (i_293_
					      + (((i_306_ & 0xff00ff) * i_304_
						  >> 8)
						 & 0xff00ff)
					      + (((i_306_ & 0xff00) * i_304_
						  >> 8)
						 & 0xff00)));
				    i_306_ = is[i];
				    is[i++]
					= ((i_305_ | i_306_ >> 24) << 24
					   | (i_293_
					      + (((i_306_ & 0xff00ff) * i_304_
						  >> 8)
						 & 0xff00ff)
					      + (((i_306_ & 0xff00) * i_304_
						  >> 8)
						 & 0xff00)));
				} else {
				    is[i++]
					= (i_293_
					   + ((i_306_ & 0xff00ff) * i_304_ >> 8
					      & 0xff00ff)
					   + ((i_306_ & 0xff00) * i_304_ >> 8
					      & 0xff00));
				    i_306_ = is[i];
				    is[i++]
					= (i_293_
					   + ((i_306_ & 0xff00ff) * i_304_ >> 8
					      & 0xff00ff)
					   + ((i_306_ & 0xff00) * i_304_ >> 8
					      & 0xff00));
				    i_306_ = is[i];
				    is[i++]
					= (i_293_
					   + ((i_306_ & 0xff00ff) * i_304_ >> 8
					      & 0xff00ff)
					   + ((i_306_ & 0xff00) * i_304_ >> 8
					      & 0xff00));
				    i_306_ = is[i];
				    is[i++]
					= (i_293_
					   + ((i_306_ & 0xff00ff) * i_304_ >> 8
					      & 0xff00ff)
					   + ((i_306_ & 0xff00) * i_304_ >> 8
					      & 0xff00));
				}
			    } while (--i_294_ > 0);
			}
			i_294_ = i_296_ - i_295_ & 0x3;
			if (i_294_ > 0) {
			    i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						  | (int) f_300_ & 0xff00
						  | (int) f_302_ & 0xff);
			    i_293_ = (((i_293_ & 0xff00ff) * i_305_ >> 8
				       & 0xff00ff)
				      + ((i_293_ & 0xff00) * i_305_ >> 8
					 & 0xff00));
			    do {
				int i_307_ = is[i];
				if (bool_292_)
				    is[i++]
					= ((i_305_ | i_307_ >> 24) << 24
					   | (i_293_
					      + (((i_307_ & 0xff00ff) * i_304_
						  >> 8)
						 & 0xff00ff)
					      + (((i_307_ & 0xff00) * i_304_
						  >> 8)
						 & 0xff00)));
				else
				    is[i++]
					= (i_293_
					   + ((i_307_ & 0xff00ff) * i_304_ >> 8
					      & 0xff00ff)
					   + ((i_307_ & 0xff00) * i_304_ >> 8
					      & 0xff00));
			    } while (--i_294_ > 0);
			}
		    } else {
			if (i_294_ > 0) {
			    do {
				i_293_ = ((int) f_298_ & 0xff0000
					  | (int) f_300_ & 0xff00
					  | (int) f_302_ & 0xff);
				f_298_ += f_299_;
				f_300_ += f_301_;
				f_302_ += f_303_;
				int[] is_308_ = is;
				int i_309_ = i++;
				int i_310_ = i_293_;
				int i_311_ = is_308_[i_309_];
				int i_312_ = i_310_ + i_311_;
				int i_313_ = ((i_310_ & 0xff00ff)
					      + (i_311_ & 0xff00ff));
				i_311_
				    = (i_313_ & 0x1000100) + (i_312_ - i_313_
							      & 0x10000);
				is_308_[i_309_] = (~0xffffff | i_312_ - i_311_
						   | i_311_ - (i_311_ >>> 8));
				int[] is_314_ = is;
				i_312_ = i++;
				i_313_ = i_293_;
				int i_315_ = is_314_[i_312_];
				int i_316_ = i_313_ + i_315_;
				int i_317_ = ((i_313_ & 0xff00ff)
					      + (i_315_ & 0xff00ff));
				i_315_
				    = (i_317_ & 0x1000100) + (i_316_ - i_317_
							      & 0x10000);
				is_314_[i_312_] = (~0xffffff | i_316_ - i_315_
						   | i_315_ - (i_315_ >>> 8));
				int[] is_318_ = is;
				i_316_ = i++;
				i_317_ = i_293_;
				int i_319_ = is_318_[i_316_];
				int i_320_ = i_317_ + i_319_;
				int i_321_ = ((i_317_ & 0xff00ff)
					      + (i_319_ & 0xff00ff));
				i_319_
				    = (i_321_ & 0x1000100) + (i_320_ - i_321_
							      & 0x10000);
				is_318_[i_316_] = (~0xffffff | i_320_ - i_319_
						   | i_319_ - (i_319_ >>> 8));
				int[] is_322_ = is;
				i_320_ = i++;
				i_321_ = i_293_;
				int i_323_ = is_322_[i_320_];
				int i_324_ = i_321_ + i_323_;
				int i_325_ = ((i_321_ & 0xff00ff)
					      + (i_323_ & 0xff00ff));
				i_323_
				    = (i_325_ & 0x1000100) + (i_324_ - i_325_
							      & 0x10000);
				is_322_[i_320_] = (~0xffffff | i_324_ - i_323_
						   | i_323_ - (i_323_ >>> 8));
			    } while (--i_294_ > 0);
			}
			i_294_ = i_296_ - i_295_ & 0x3;
			if (i_294_ > 0) {
			    i_293_ = ((int) f_298_ & 0xff0000
				      | (int) f_300_ & 0xff00
				      | (int) f_302_ & 0xff);
			    do {
				int[] is_326_ = is;
				int i_327_ = i++;
				int i_328_ = i_293_;
				int i_329_ = is_326_[i_327_];
				int i_330_ = i_328_ + i_329_;
				int i_331_ = ((i_328_ & 0xff00ff)
					      + (i_329_ & 0xff00ff));
				i_329_
				    = (i_331_ & 0x1000100) + (i_330_ - i_331_
							      & 0x10000);
				is_326_[i_327_] = (~0xffffff | i_330_ - i_329_
						   | i_329_ - (i_329_ >>> 8));
			    } while (--i_294_ > 0);
			}
		    }
		} else {
		    i_294_ = i_296_ - i_295_;
		    if (anInt1486 == 0) {
			do {
			    is[i++] = ~0xffffff | ((int) f_298_ & 0xff0000
						   | (int) f_300_ & 0xff00
						   | (int) f_302_ & 0xff);
			    f_298_ += f_299_;
			    f_300_ += f_301_;
			    f_302_ += f_303_;
			} while (--i_294_ > 0);
		    } else if (!aBool1483) {
			int i_332_ = anInt1486;
			int i_333_ = 256 - anInt1486;
			do {
			    i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						  | (int) f_300_ & 0xff00
						  | (int) f_302_ & 0xff);
			    f_298_ += f_299_;
			    f_300_ += f_301_;
			    f_302_ += f_303_;
			    i_293_ = (((i_293_ & 0xff00ff) * i_333_ >> 8
				       & 0xff00ff)
				      + ((i_293_ & 0xff00) * i_333_ >> 8
					 & 0xff00));
			    int i_334_ = is[i];
			    if (bool_292_)
				is[i++]
				    = ((i_333_ | i_334_ >> 24) << 24
				       | (i_293_
					  + ((i_334_ & 0xff00ff) * i_332_ >> 8
					     & 0xff00ff)
					  + ((i_334_ & 0xff00) * i_332_ >> 8
					     & 0xff00)));
			    else
				is[i++] = (i_293_
					   + ((i_334_ & 0xff00ff) * i_332_ >> 8
					      & 0xff00ff)
					   + ((i_334_ & 0xff00) * i_332_ >> 8
					      & 0xff00));
			} while (--i_294_ > 0);
		    } else {
			do {
			    int[] is_335_ = is;
			    int i_336_ = i++;
			    int i_337_ = ((int) f_298_ & 0xff0000
					  | (int) f_300_ & 0xff00
					  | (int) f_302_ & 0xff);
			    int i_338_ = is_335_[i_336_];
			    int i_339_ = i_337_ + i_338_;
			    int i_340_
				= (i_337_ & 0xff00ff) + (i_338_ & 0xff00ff);
			    i_338_ = (i_340_ & 0x1000100) + (i_339_ - i_340_
							     & 0x10000);
			    is_335_[i_336_] = (~0xffffff | i_339_ - i_338_
					       | i_338_ - (i_338_ >>> 8));
			    f_298_ += f_299_;
			    f_300_ += f_301_;
			    f_302_ += f_303_;
			} while (--i_294_ > 0);
		    }
		}
	    } else {
		i += i_295_ - 1;
		f += f_297_ * (float) i_295_;
		f_298_ += f_299_ * (float) i_295_;
		f_300_ += f_301_ * (float) i_295_;
		f_302_ += f_303_ * (float) i_295_;
		if (aClass110_1497.aBool1335) {
		    if (aBool1482) {
			i_294_ = i_296_ - i_295_ >> 2;
			f_299_ *= 4.0F;
			f_301_ *= 4.0F;
			f_303_ *= 4.0F;
			if (anInt1486 == 0) {
			    if (i_294_ > 0) {
				do {
				    i_293_
					= ~0xffffff | ((int) f_298_ & 0xff0000
						       | (int) f_300_ & 0xff00
						       | (int) f_302_ & 0xff);
				    f_298_ += f_299_;
				    f_300_ += f_301_;
				    f_302_ += f_303_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					is[i] = i_293_;
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					is[i] = i_293_;
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					is[i] = i_293_;
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					is[i] = i_293_;
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				} while (--i_294_ > 0);
			    }
			    i_294_ = i_296_ - i_295_ & 0x3;
			    if (i_294_ > 0) {
				i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						      | (int) f_300_ & 0xff00
						      | (int) f_302_ & 0xff);
				do {
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					is[i] = i_293_;
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				} while (--i_294_ > 0);
			    }
			} else if (!aBool1483) {
			    int i_341_ = anInt1486;
			    int i_342_ = 256 - anInt1486;
			    if (i_294_ > 0) {
				do {
				    i_293_
					= ~0xffffff | ((int) f_298_ & 0xff0000
						       | (int) f_300_ & 0xff00
						       | (int) f_302_ & 0xff);
				    f_298_ += f_299_;
				    f_300_ += f_301_;
				    f_302_ += f_303_;
				    i_293_
					= (((i_293_ & 0xff00ff) * i_342_ >> 8
					    & 0xff00ff)
					   + ((i_293_ & 0xff00) * i_342_ >> 8
					      & 0xff00));
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int i_343_ = is[i];
					if (bool_292_)
					    is[i] = (((i_342_ | i_343_ >> 24)
						      << 24)
						     | (i_293_
							+ (((i_343_ & 0xff00ff)
							    * i_341_) >> 8
							   & 0xff00ff)
							+ (((i_343_ & 0xff00)
							    * i_341_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_293_
						     + (((i_343_ & 0xff00ff)
							 * i_341_) >> 8
							& 0xff00ff)
						     + (((i_343_ & 0xff00)
							 * i_341_) >> 8
							& 0xff00));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int i_344_ = is[i];
					if (bool_292_)
					    is[i] = (((i_342_ | i_344_ >> 24)
						      << 24)
						     | (i_293_
							+ (((i_344_ & 0xff00ff)
							    * i_341_) >> 8
							   & 0xff00ff)
							+ (((i_344_ & 0xff00)
							    * i_341_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_293_
						     + (((i_344_ & 0xff00ff)
							 * i_341_) >> 8
							& 0xff00ff)
						     + (((i_344_ & 0xff00)
							 * i_341_) >> 8
							& 0xff00));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int i_345_ = is[i];
					if (bool_292_)
					    is[i] = (((i_342_ | i_345_ >> 24)
						      << 24)
						     | (i_293_
							+ (((i_345_ & 0xff00ff)
							    * i_341_) >> 8
							   & 0xff00ff)
							+ (((i_345_ & 0xff00)
							    * i_341_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_293_
						     + (((i_345_ & 0xff00ff)
							 * i_341_) >> 8
							& 0xff00ff)
						     + (((i_345_ & 0xff00)
							 * i_341_) >> 8
							& 0xff00));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int i_346_ = is[i];
					if (bool_292_)
					    is[i] = (((i_342_ | i_346_ >> 24)
						      << 24)
						     | (i_293_
							+ (((i_346_ & 0xff00ff)
							    * i_341_) >> 8
							   & 0xff00ff)
							+ (((i_346_ & 0xff00)
							    * i_341_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_293_
						     + (((i_346_ & 0xff00ff)
							 * i_341_) >> 8
							& 0xff00ff)
						     + (((i_346_ & 0xff00)
							 * i_341_) >> 8
							& 0xff00));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				} while (--i_294_ > 0);
			    }
			    i_294_ = i_296_ - i_295_ & 0x3;
			    if (i_294_ > 0) {
				i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						      | (int) f_300_ & 0xff00
						      | (int) f_302_ & 0xff);
				i_293_ = (((i_293_ & 0xff00ff) * i_342_ >> 8
					   & 0xff00ff)
					  + ((i_293_ & 0xff00) * i_342_ >> 8
					     & 0xff00));
				do {
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int i_347_ = is[i];
					if (bool_292_)
					    is[i] = (((i_342_ | i_347_ >> 24)
						      << 24)
						     | (i_293_
							+ (((i_347_ & 0xff00ff)
							    * i_341_) >> 8
							   & 0xff00ff)
							+ (((i_347_ & 0xff00)
							    * i_341_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_293_
						     + (((i_347_ & 0xff00ff)
							 * i_341_) >> 8
							& 0xff00ff)
						     + (((i_347_ & 0xff00)
							 * i_341_) >> 8
							& 0xff00));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				} while (--i_294_ > 0);
			    }
			} else {
			    if (i_294_ > 0) {
				do {
				    i_293_ = ((int) f_298_ & 0xff0000
					      | (int) f_300_ & 0xff00
					      | (int) f_302_ & 0xff);
				    f_298_ += f_299_;
				    f_300_ += f_301_;
				    f_302_ += f_303_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int[] is_348_ = is;
					int i_349_ = i;
					int i_350_ = i_293_;
					int i_351_ = is_348_[i_349_];
					int i_352_ = i_350_ + i_351_;
					int i_353_ = ((i_350_ & 0xff00ff)
						      + (i_351_ & 0xff00ff));
					i_351_
					    = ((i_353_ & 0x1000100)
					       + (i_352_ - i_353_ & 0x10000));
					is_348_[i_349_]
					    = (~0xffffff | i_352_ - i_351_
					       | i_351_ - (i_351_ >>> 8));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int[] is_354_ = is;
					int i_355_ = i;
					int i_356_ = i_293_;
					int i_357_ = is_354_[i_355_];
					int i_358_ = i_356_ + i_357_;
					int i_359_ = ((i_356_ & 0xff00ff)
						      + (i_357_ & 0xff00ff));
					i_357_
					    = ((i_359_ & 0x1000100)
					       + (i_358_ - i_359_ & 0x10000));
					is_354_[i_355_]
					    = (~0xffffff | i_358_ - i_357_
					       | i_357_ - (i_357_ >>> 8));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int[] is_360_ = is;
					int i_361_ = i;
					int i_362_ = i_293_;
					int i_363_ = is_360_[i_361_];
					int i_364_ = i_362_ + i_363_;
					int i_365_ = ((i_362_ & 0xff00ff)
						      + (i_363_ & 0xff00ff));
					i_363_
					    = ((i_365_ & 0x1000100)
					       + (i_364_ - i_365_ & 0x10000));
					is_360_[i_361_]
					    = (~0xffffff | i_364_ - i_363_
					       | i_363_ - (i_363_ >>> 8));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int[] is_366_ = is;
					int i_367_ = i;
					int i_368_ = i_293_;
					int i_369_ = is_366_[i_367_];
					int i_370_ = i_368_ + i_369_;
					int i_371_ = ((i_368_ & 0xff00ff)
						      + (i_369_ & 0xff00ff));
					i_369_
					    = ((i_371_ & 0x1000100)
					       + (i_370_ - i_371_ & 0x10000));
					is_366_[i_367_]
					    = (~0xffffff | i_370_ - i_369_
					       | i_369_ - (i_369_ >>> 8));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				} while (--i_294_ > 0);
			    }
			    i_294_ = i_296_ - i_295_ & 0x3;
			    if (i_294_ > 0) {
				i_293_ = ((int) f_298_ & 0xff0000
					  | (int) f_300_ & 0xff00
					  | (int) f_302_ & 0xff);
				do {
				    i++;
				    if (!bool || f < aFloatArray1500[i]) {
					int[] is_372_ = is;
					int i_373_ = i;
					int i_374_ = i_293_;
					int i_375_ = is_372_[i_373_];
					int i_376_ = i_374_ + i_375_;
					int i_377_ = ((i_374_ & 0xff00ff)
						      + (i_375_ & 0xff00ff));
					i_375_
					    = ((i_377_ & 0x1000100)
					       + (i_376_ - i_377_ & 0x10000));
					is_372_[i_373_]
					    = (~0xffffff | i_376_ - i_375_
					       | i_375_ - (i_375_ >>> 8));
					if (bool)
					    aFloatArray1500[i] = f;
				    }
				    f += f_297_;
				} while (--i_294_ > 0);
			    }
			}
		    } else {
			i_294_ = i_296_ - i_295_;
			if (anInt1486 == 0) {
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    is[i]
					= ~0xffffff | ((int) f_298_ & 0xff0000
						       | (int) f_300_ & 0xff00
						       | (int) f_302_ & 0xff);
				    if (bool)
					aFloatArray1500[i] = f;
				}
				f += f_297_;
				f_298_ += f_299_;
				f_300_ += f_301_;
				f_302_ += f_303_;
			    } while (--i_294_ > 0);
			} else if (!aBool1483) {
			    int i_378_ = anInt1486;
			    int i_379_ = 256 - anInt1486;
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    i_293_
					= ~0xffffff | ((int) f_298_ & 0xff0000
						       | (int) f_300_ & 0xff00
						       | (int) f_302_ & 0xff);
				    i_293_
					= (((i_293_ & 0xff00ff) * i_379_ >> 8
					    & 0xff00ff)
					   + ((i_293_ & 0xff00) * i_379_ >> 8
					      & 0xff00));
				    int i_380_ = is[i];
				    if (bool_292_)
					is[i] = ((i_379_ | i_380_ >> 24) << 24
						 | (i_293_
						    + (((i_380_ & 0xff00ff)
							* i_378_) >> 8
						       & 0xff00ff)
						    + (((i_380_ & 0xff00)
							* i_378_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_293_
					       + (((i_380_ & 0xff00ff) * i_378_
						   >> 8)
						  & 0xff00ff)
					       + (((i_380_ & 0xff00) * i_378_
						   >> 8)
						  & 0xff00));
				    if (bool)
					aFloatArray1500[i] = f;
				}
				f += f_297_;
				f_298_ += f_299_;
				f_300_ += f_301_;
				f_302_ += f_303_;
			    } while (--i_294_ > 0);
			} else {
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_381_ = is;
				    int i_382_ = i;
				    int i_383_ = ((int) f_298_ & 0xff0000
						  | (int) f_300_ & 0xff00
						  | (int) f_302_ & 0xff);
				    int i_384_ = is_381_[i_382_];
				    int i_385_ = i_383_ + i_384_;
				    int i_386_ = ((i_383_ & 0xff00ff)
						  + (i_384_ & 0xff00ff));
				    i_384_ = ((i_386_ & 0x1000100)
					      + (i_385_ - i_386_ & 0x10000));
				    is_381_[i_382_]
					= (~0xffffff | i_385_ - i_384_
					   | i_384_ - (i_384_ >>> 8));
				    if (bool)
					aFloatArray1500[i] = f;
				}
				f += f_297_;
				f_298_ += f_299_;
				f_300_ += f_301_;
				f_302_ += f_303_;
			    } while (--i_294_ > 0);
			}
		    }
		} else if (aBool1482) {
		    i_294_ = i_296_ - i_295_ >> 2;
		    f_299_ *= 4.0F;
		    f_301_ *= 4.0F;
		    f_303_ *= 4.0F;
		    if (anInt1486 == 0) {
			if (i_294_ > 0) {
			    do {
				i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						      | (int) f_300_ & 0xff00
						      | (int) f_302_ & 0xff);
				f_298_ += f_299_;
				f_300_ += f_301_;
				f_302_ += f_303_;
				i++;
				if (!bool || f < aFloatArray1500[i])
				    is[i] = i_293_;
				f += f_297_;
				i++;
				if (!bool || f < aFloatArray1500[i])
				    is[i] = i_293_;
				f += f_297_;
				i++;
				if (!bool || f < aFloatArray1500[i])
				    is[i] = i_293_;
				f += f_297_;
				i++;
				if (!bool || f < aFloatArray1500[i])
				    is[i] = i_293_;
				f += f_297_;
			    } while (--i_294_ > 0);
			}
			i_294_ = i_296_ - i_295_ & 0x3;
			if (i_294_ > 0) {
			    i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						  | (int) f_300_ & 0xff00
						  | (int) f_302_ & 0xff);
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i])
				    is[i] = i_293_;
				f += f_297_;
			    } while (--i_294_ > 0);
			}
		    } else if (!aBool1483) {
			int i_387_ = anInt1486;
			int i_388_ = 256 - anInt1486;
			if (i_294_ > 0) {
			    do {
				i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						      | (int) f_300_ & 0xff00
						      | (int) f_302_ & 0xff);
				f_298_ += f_299_;
				f_300_ += f_301_;
				f_302_ += f_303_;
				i_293_ = (((i_293_ & 0xff00ff) * i_388_ >> 8
					   & 0xff00ff)
					  + ((i_293_ & 0xff00) * i_388_ >> 8
					     & 0xff00));
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int i_389_ = is[i];
				    if (bool_292_)
					is[i] = ((i_388_ | i_389_ >> 24) << 24
						 | (i_293_
						    + (((i_389_ & 0xff00ff)
							* i_387_) >> 8
						       & 0xff00ff)
						    + (((i_389_ & 0xff00)
							* i_387_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_293_
					       + (((i_389_ & 0xff00ff) * i_387_
						   >> 8)
						  & 0xff00ff)
					       + (((i_389_ & 0xff00) * i_387_
						   >> 8)
						  & 0xff00));
				}
				f += f_297_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int i_390_ = is[i];
				    if (bool_292_)
					is[i] = ((i_388_ | i_390_ >> 24) << 24
						 | (i_293_
						    + (((i_390_ & 0xff00ff)
							* i_387_) >> 8
						       & 0xff00ff)
						    + (((i_390_ & 0xff00)
							* i_387_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_293_
					       + (((i_390_ & 0xff00ff) * i_387_
						   >> 8)
						  & 0xff00ff)
					       + (((i_390_ & 0xff00) * i_387_
						   >> 8)
						  & 0xff00));
				}
				f += f_297_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int i_391_ = is[i];
				    if (bool_292_)
					is[i] = ((i_388_ | i_391_ >> 24) << 24
						 | (i_293_
						    + (((i_391_ & 0xff00ff)
							* i_387_) >> 8
						       & 0xff00ff)
						    + (((i_391_ & 0xff00)
							* i_387_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_293_
					       + (((i_391_ & 0xff00ff) * i_387_
						   >> 8)
						  & 0xff00ff)
					       + (((i_391_ & 0xff00) * i_387_
						   >> 8)
						  & 0xff00));
				}
				f += f_297_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int i_392_ = is[i];
				    if (bool_292_)
					is[i] = ((i_388_ | i_392_ >> 24) << 24
						 | (i_293_
						    + (((i_392_ & 0xff00ff)
							* i_387_) >> 8
						       & 0xff00ff)
						    + (((i_392_ & 0xff00)
							* i_387_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_293_
					       + (((i_392_ & 0xff00ff) * i_387_
						   >> 8)
						  & 0xff00ff)
					       + (((i_392_ & 0xff00) * i_387_
						   >> 8)
						  & 0xff00));
				}
				f += f_297_;
			    } while (--i_294_ > 0);
			}
			i_294_ = i_296_ - i_295_ & 0x3;
			if (i_294_ > 0) {
			    i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						  | (int) f_300_ & 0xff00
						  | (int) f_302_ & 0xff);
			    i_293_ = (((i_293_ & 0xff00ff) * i_388_ >> 8
				       & 0xff00ff)
				      + ((i_293_ & 0xff00) * i_388_ >> 8
					 & 0xff00));
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int i_393_ = is[i];
				    if (bool_292_)
					is[i] = ((i_388_ | i_393_ >> 24) << 24
						 | (i_293_
						    + (((i_393_ & 0xff00ff)
							* i_387_) >> 8
						       & 0xff00ff)
						    + (((i_393_ & 0xff00)
							* i_387_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_293_
					       + (((i_393_ & 0xff00ff) * i_387_
						   >> 8)
						  & 0xff00ff)
					       + (((i_393_ & 0xff00) * i_387_
						   >> 8)
						  & 0xff00));
				}
				f += f_297_;
			    } while (--i_294_ > 0);
			}
		    } else {
			if (i_294_ > 0) {
			    do {
				i_293_ = ((int) f_298_ & 0xff0000
					  | (int) f_300_ & 0xff00
					  | (int) f_302_ & 0xff);
				f_298_ += f_299_;
				f_300_ += f_301_;
				f_302_ += f_303_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_394_ = is;
				    int i_395_ = i;
				    int i_396_ = i_293_;
				    int i_397_ = is_394_[i_395_];
				    int i_398_ = i_396_ + i_397_;
				    int i_399_ = ((i_396_ & 0xff00ff)
						  + (i_397_ & 0xff00ff));
				    i_397_ = ((i_399_ & 0x1000100)
					      + (i_398_ - i_399_ & 0x10000));
				    is_394_[i_395_]
					= (~0xffffff | i_398_ - i_397_
					   | i_397_ - (i_397_ >>> 8));
				}
				f += f_297_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_400_ = is;
				    int i_401_ = i;
				    int i_402_ = i_293_;
				    int i_403_ = is_400_[i_401_];
				    int i_404_ = i_402_ + i_403_;
				    int i_405_ = ((i_402_ & 0xff00ff)
						  + (i_403_ & 0xff00ff));
				    i_403_ = ((i_405_ & 0x1000100)
					      + (i_404_ - i_405_ & 0x10000));
				    is_400_[i_401_]
					= (~0xffffff | i_404_ - i_403_
					   | i_403_ - (i_403_ >>> 8));
				}
				f += f_297_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_406_ = is;
				    int i_407_ = i;
				    int i_408_ = i_293_;
				    int i_409_ = is_406_[i_407_];
				    int i_410_ = i_408_ + i_409_;
				    int i_411_ = ((i_408_ & 0xff00ff)
						  + (i_409_ & 0xff00ff));
				    i_409_ = ((i_411_ & 0x1000100)
					      + (i_410_ - i_411_ & 0x10000));
				    is_406_[i_407_]
					= (~0xffffff | i_410_ - i_409_
					   | i_409_ - (i_409_ >>> 8));
				}
				f += f_297_;
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_412_ = is;
				    int i_413_ = i;
				    int i_414_ = i_293_;
				    int i_415_ = is_412_[i_413_];
				    int i_416_ = i_414_ + i_415_;
				    int i_417_ = ((i_414_ & 0xff00ff)
						  + (i_415_ & 0xff00ff));
				    i_415_ = ((i_417_ & 0x1000100)
					      + (i_416_ - i_417_ & 0x10000));
				    is_412_[i_413_]
					= (~0xffffff | i_416_ - i_415_
					   | i_415_ - (i_415_ >>> 8));
				}
				f += f_297_;
			    } while (--i_294_ > 0);
			}
			i_294_ = i_296_ - i_295_ & 0x3;
			if (i_294_ > 0) {
			    i_293_ = ((int) f_298_ & 0xff0000
				      | (int) f_300_ & 0xff00
				      | (int) f_302_ & 0xff);
			    do {
				i++;
				if (!bool || f < aFloatArray1500[i]) {
				    int[] is_418_ = is;
				    int i_419_ = i;
				    int i_420_ = i_293_;
				    int i_421_ = is_418_[i_419_];
				    int i_422_ = i_420_ + i_421_;
				    int i_423_ = ((i_420_ & 0xff00ff)
						  + (i_421_ & 0xff00ff));
				    i_421_ = ((i_423_ & 0x1000100)
					      + (i_422_ - i_423_ & 0x10000));
				    is_418_[i_419_]
					= (~0xffffff | i_422_ - i_421_
					   | i_421_ - (i_421_ >>> 8));
				}
				f += f_297_;
			    } while (--i_294_ > 0);
			}
		    }
		} else {
		    i_294_ = i_296_ - i_295_;
		    if (anInt1486 == 0) {
			do {
			    i++;
			    if (!bool || f < aFloatArray1500[i])
				is[i] = ~0xffffff | ((int) f_298_ & 0xff0000
						     | (int) f_300_ & 0xff00
						     | (int) f_302_ & 0xff);
			    f += f_297_;
			    f_298_ += f_299_;
			    f_300_ += f_301_;
			    f_302_ += f_303_;
			} while (--i_294_ > 0);
		    } else if (!aBool1483) {
			int i_424_ = anInt1486;
			int i_425_ = 256 - anInt1486;
			do {
			    i++;
			    if (!bool || f < aFloatArray1500[i]) {
				i_293_ = ~0xffffff | ((int) f_298_ & 0xff0000
						      | (int) f_300_ & 0xff00
						      | (int) f_302_ & 0xff);
				i_293_ = (((i_293_ & 0xff00ff) * i_425_ >> 8
					   & 0xff00ff)
					  + ((i_293_ & 0xff00) * i_425_ >> 8
					     & 0xff00));
				int i_426_ = is[i];
				if (bool_292_)
				    is[i]
					= ((i_425_ | i_426_ >> 24) << 24
					   | (i_293_
					      + (((i_426_ & 0xff00ff) * i_424_
						  >> 8)
						 & 0xff00ff)
					      + (((i_426_ & 0xff00) * i_424_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_293_
					   + ((i_426_ & 0xff00ff) * i_424_ >> 8
					      & 0xff00ff)
					   + ((i_426_ & 0xff00) * i_424_ >> 8
					      & 0xff00));
			    }
			    f += f_297_;
			    f_298_ += f_299_;
			    f_300_ += f_301_;
			    f_302_ += f_303_;
			} while (--i_294_ > 0);
		    } else {
			do {
			    i++;
			    if (!bool || f < aFloatArray1500[i]) {
				int[] is_427_ = is;
				int i_428_ = i;
				int i_429_ = ((int) f_298_ & 0xff0000
					      | (int) f_300_ & 0xff00
					      | (int) f_302_ & 0xff);
				int i_430_ = is_427_[i_428_];
				int i_431_ = i_429_ + i_430_;
				int i_432_ = ((i_429_ & 0xff00ff)
					      + (i_430_ & 0xff00ff));
				i_430_
				    = (i_432_ & 0x1000100) + (i_431_ - i_432_
							      & 0x10000);
				is_427_[i_428_] = (~0xffffff | i_431_ - i_430_
						   | i_430_ - (i_430_ >>> 8));
			    }
			    f += f_297_;
			    f_298_ += f_299_;
			    f_300_ += f_301_;
			    f_302_ += f_303_;
			} while (--i_294_ > 0);
		    }
		}
	    }
	}
    }
    
    final void method2246
	(boolean bool, boolean bool_433_, int[] is, int[] is_434_, int i,
	 int i_435_, int i_436_, float f, float f_437_, float f_438_,
	 float f_439_, float f_440_, float f_441_, float f_442_, float f_443_,
	 float f_444_, float f_445_, float f_446_, float f_447_, float f_448_,
	 float f_449_, float f_450_, float f_451_, float f_452_,
	 float f_453_) {
	int i_454_ = i_436_ - i_435_;
	float f_455_ = 1.0F / (float) i_454_;
	float f_456_ = (f_437_ - f) * f_455_;
	float f_457_ = (f_439_ - f_438_) * f_455_;
	float f_458_ = (f_441_ - f_440_) * f_455_;
	float f_459_ = (f_443_ - f_442_) * f_455_;
	float f_460_ = (f_445_ - f_444_) * f_455_;
	float f_461_ = (f_447_ - f_446_) * f_455_;
	float f_462_ = (f_449_ - f_448_) * f_455_;
	float f_463_ = (f_451_ - f_450_) * f_455_;
	float f_464_ = (f_453_ - f_452_) * f_455_;
	if (aBool1485) {
	    if (i_436_ > anInt1494)
		i_436_ = anInt1494;
	    if (i_435_ < 0) {
		f -= f_456_ * (float) i_435_;
		f_438_ -= f_457_ * (float) i_435_;
		f_440_ -= f_458_ * (float) i_435_;
		f_442_ -= f_459_ * (float) i_435_;
		f_444_ -= f_460_ * (float) i_435_;
		f_446_ -= f_461_ * (float) i_435_;
		f_448_ -= f_462_ * (float) i_435_;
		f_450_ -= f_463_ * (float) i_435_;
		f_452_ -= f_464_ * (float) i_435_;
		i_435_ = 0;
	    }
	}
	if (i_435_ < i_436_) {
	    i_454_ = i_436_ - i_435_;
	    i += i_435_;
	    while (i_454_-- > 0) {
		float f_465_ = 1.0F / f;
		float f_466_ = 1.0F / f_438_;
		if (!bool || f_465_ < aFloatArray1500[i]) {
		    int i_467_ = (int) (f_440_ * f_466_ * (float) anInt1504);
		    if (aBool1484)
			i_467_ &= anInt1505;
		    else if (i_467_ < 0)
			i_467_ = 0;
		    else if (i_467_ > anInt1505)
			i_467_ = anInt1505;
		    int i_468_ = (int) (f_442_ * f_466_ * (float) anInt1504);
		    if (aBool1484)
			i_468_ &= anInt1505;
		    else if (i_468_ < 0)
			i_468_ = 0;
		    else if (i_468_ > anInt1505)
			i_468_ = anInt1505;
		    int i_469_ = anIntArray1481[i_468_ * anInt1504 + i_467_];
		    int i_470_ = 255;
		    if (aClass597_1507 == Class597.aClass597_7841)
			i_470_ = (int) ((float) (i_469_ >> 24 & 0xff) * f_446_
					/ 255.0F);
		    else if (aClass597_1507 == Class597.aClass597_7843) {
			if ((i_469_ >> 24 & 0xff) > anInt1496)
			    i_470_ = 255;
			else
			    i_470_ = 0;
		    } else
			i_470_ = (int) f_446_;
		    if (i_470_ != 0) {
			if (i_470_ != 255) {
			    int i_471_
				= (~0xffffff
				   | ((int) (f_448_ * (float) (i_469_ >> 16
							       & 0xff)) << 8
				      & 0xff0000)
				   | (int) (f_450_ * (float) (i_469_ >> 8
							      & 0xff)) & 0xff00
				   | ((int) (f_452_ * (float) (i_469_ & 0xff))
				      >> 8));
			    if (f_444_ != 0.0F) {
				int i_472_ = (int) (255.0F - f_444_);
				int i_473_
				    = ((((anInt1501 & 0xff00ff) * (int) f_444_
					 & ~0xff00ff)
					| ((anInt1501 & 0xff00) * (int) f_444_
					   & 0xff0000))
				       >>> 8);
				i_471_ = ((((i_471_ & 0xff00ff) * i_472_
					    & ~0xff00ff)
					   | ((i_471_ & 0xff00) * i_472_
					      & 0xff0000))
					  >>> 8) + i_473_;
			    }
			    int i_474_ = is[i];
			    int i_475_ = 255 - i_470_;
			    i_471_ = ((((i_474_ & 0xff00ff) * i_475_
					+ (i_471_ & 0xff00ff) * i_470_)
				       & ~0xff00ff)
				      + (((i_474_ & 0xff00) * i_475_
					  + (i_471_ & 0xff00) * i_470_)
					 & 0xff0000)) >> 8;
			    if (bool_433_)
				is[i] = (i_470_ | is[i] >> 24) << 24 | i_471_;
			    else
				is[i] = i_471_;
			    if (bool)
				aFloatArray1500[i] = f_465_;
			} else {
			    int i_476_
				= (~0xffffff
				   | ((int) (f_448_ * (float) (i_469_ >> 16
							       & 0xff)) << 8
				      & 0xff0000)
				   | (int) (f_450_ * (float) (i_469_ >> 8
							      & 0xff)) & 0xff00
				   | ((int) (f_452_ * (float) (i_469_ & 0xff))
				      >> 8));
			    if (f_444_ != 0.0F) {
				int i_477_ = (int) (255.0F - f_444_);
				int i_478_
				    = ((((anInt1501 & 0xff00ff) * (int) f_444_
					 & ~0xff00ff)
					| ((anInt1501 & 0xff00) * (int) f_444_
					   & 0xff0000))
				       >>> 8);
				i_476_ = ((((i_476_ & 0xff00ff) * i_477_
					    & ~0xff00ff)
					   | ((i_476_ & 0xff00) * i_477_
					      & 0xff0000))
					  >>> 8) + i_478_;
			    }
			    if (bool_433_)
				is[i] = i_470_ << 24 | i_476_;
			    else
				is[i] = i_476_;
			    if (bool)
				aFloatArray1500[i] = f_465_;
			}
		    }
		}
		i++;
		f += f_456_;
		f_438_ += f_457_;
		f_440_ += f_458_;
		f_442_ += f_459_;
		f_444_ += f_460_;
		f_446_ += f_461_;
		f_448_ += f_462_;
		f_450_ += f_463_;
		f_452_ += f_464_;
	    }
	}
    }
    
    final void method2247(boolean bool, boolean bool_479_, boolean bool_480_,
			  int[] is, int i, int i_481_, int i_482_, int i_483_,
			  int i_484_, float f, float f_485_) {
	if (aBool1485) {
	    if (i_484_ > anInt1494)
		i_484_ = anInt1494;
	    if (i_483_ < 0)
		i_483_ = 0;
	}
	if (i_483_ < i_484_) {
	    i += i_483_ - 1;
	    i_482_ = i_484_ - i_483_ >> 2;
	    f += f_485_ * (float) i_483_;
	    if (aClass110_1497.aBool1335) {
		if (anInt1486 == 0) {
		    while (--i_482_ >= 0) {
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    if (bool)
				is[i] = i_481_;
			    if (bool_479_)
				aFloatArray1500[i] = f;
			}
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    if (bool)
				is[i] = i_481_;
			    if (bool_479_)
				aFloatArray1500[i] = f;
			}
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    if (bool)
				is[i] = i_481_;
			    if (bool_479_)
				aFloatArray1500[i] = f;
			}
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    if (bool)
				is[i] = i_481_;
			    if (bool_479_)
				aFloatArray1500[i] = f;
			}
			f += f_485_;
		    }
		    i_482_ = i_484_ - i_483_ & 0x3;
		    while (--i_482_ >= 0) {
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    if (bool)
				is[i] = i_481_;
			    if (bool_479_)
				aFloatArray1500[i] = f;
			}
			f += f_485_;
		    }
		} else if (anInt1486 == 254) {
		    if (i_483_ != 0 && i_484_ <= anInt1494 - 1) {
			while (--i_482_ >= 0) {
			    i++;
			    if ((!bool_479_ || f < aFloatArray1500[i]) && bool)
				is[i - 1] = is[i];
			    f += f_485_;
			    i++;
			    if ((!bool_479_ || f < aFloatArray1500[i]) && bool)
				is[i - 1] = is[i];
			    f += f_485_;
			    i++;
			    if ((!bool_479_ || f < aFloatArray1500[i]) && bool)
				is[i - 1] = is[i];
			    f += f_485_;
			    i++;
			    if ((!bool_479_ || f < aFloatArray1500[i]) && bool)
				is[i - 1] = is[i];
			    f += f_485_;
			}
			i_482_ = i_484_ - i_483_ & 0x3;
			while (--i_482_ >= 0) {
			    i++;
			    if ((!bool_479_ || f < aFloatArray1500[i]) && bool)
				is[i - 1] = is[i];
			    f += f_485_;
			}
		    }
		} else {
		    int i_486_ = anInt1486;
		    int i_487_ = 256 - anInt1486;
		    i_481_ = (((i_481_ & 0xff00ff) * i_487_ >> 8 & 0xff00ff)
			      + ((i_481_ & 0xff00) * i_487_ >> 8 & 0xff00));
		    while (--i_482_ >= 0) {
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    if (bool) {
				int i_488_ = is[i];
				if (bool_480_)
				    is[i]
					= ((i_487_ | i_488_ >> 24) << 24
					   | (i_481_
					      + (((i_488_ & 0xff00ff) * i_486_
						  >> 8)
						 & 0xff00ff)
					      + (((i_488_ & 0xff00) * i_486_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_481_
					   + ((i_488_ & 0xff00ff) * i_486_ >> 8
					      & 0xff00ff)
					   + ((i_488_ & 0xff00) * i_486_ >> 8
					      & 0xff00));
			    }
			    if (bool_479_)
				aFloatArray1500[i] = f;
			}
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    if (bool) {
				int i_489_ = is[i];
				if (bool_480_)
				    is[i]
					= ((i_487_ | i_489_ >> 24) << 24
					   | (i_481_
					      + (((i_489_ & 0xff00ff) * i_486_
						  >> 8)
						 & 0xff00ff)
					      + (((i_489_ & 0xff00) * i_486_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_481_
					   + ((i_489_ & 0xff00ff) * i_486_ >> 8
					      & 0xff00ff)
					   + ((i_489_ & 0xff00) * i_486_ >> 8
					      & 0xff00));
			    }
			    if (bool_479_)
				aFloatArray1500[i] = f;
			}
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    if (bool) {
				int i_490_ = is[i];
				if (bool_480_)
				    is[i]
					= ((i_487_ | i_490_ >> 24) << 24
					   | (i_481_
					      + (((i_490_ & 0xff00ff) * i_486_
						  >> 8)
						 & 0xff00ff)
					      + (((i_490_ & 0xff00) * i_486_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_481_
					   + ((i_490_ & 0xff00ff) * i_486_ >> 8
					      & 0xff00ff)
					   + ((i_490_ & 0xff00) * i_486_ >> 8
					      & 0xff00));
			    }
			    if (bool_479_)
				aFloatArray1500[i] = f;
			}
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    if (bool) {
				int i_491_ = is[i];
				if (bool_480_)
				    is[i]
					= ((i_487_ | i_491_ >> 24) << 24
					   | (i_481_
					      + (((i_491_ & 0xff00ff) * i_486_
						  >> 8)
						 & 0xff00ff)
					      + (((i_491_ & 0xff00) * i_486_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_481_
					   + ((i_491_ & 0xff00ff) * i_486_ >> 8
					      & 0xff00ff)
					   + ((i_491_ & 0xff00) * i_486_ >> 8
					      & 0xff00));
			    }
			    if (bool_479_)
				aFloatArray1500[i] = f;
			}
			f += f_485_;
		    }
		    i_482_ = i_484_ - i_483_ & 0x3;
		    while (--i_482_ >= 0) {
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    if (bool) {
				int i_492_ = is[i];
				if (bool_480_)
				    is[i]
					= ((i_487_ | i_492_ >> 24) << 24
					   | (i_481_
					      + (((i_492_ & 0xff00ff) * i_486_
						  >> 8)
						 & 0xff00ff)
					      + (((i_492_ & 0xff00) * i_486_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_481_
					   + ((i_492_ & 0xff00ff) * i_486_ >> 8
					      & 0xff00ff)
					   + ((i_492_ & 0xff00) * i_486_ >> 8
					      & 0xff00));
			    }
			    if (bool_479_)
				aFloatArray1500[i] = f;
			}
			f += f_485_;
		    }
		}
	    } else if (bool) {
		if (anInt1486 == 0) {
		    while (--i_482_ >= 0) {
			i++;
			if (!bool_479_ || f < aFloatArray1500[i])
			    is[i] = i_481_;
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i])
			    is[i] = i_481_;
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i])
			    is[i] = i_481_;
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i])
			    is[i] = i_481_;
			f += f_485_;
		    }
		    i_482_ = i_484_ - i_483_ & 0x3;
		    while (--i_482_ >= 0) {
			i++;
			if (!bool_479_ || f < aFloatArray1500[i])
			    is[i] = i_481_;
			f += f_485_;
		    }
		} else if (anInt1486 == 254) {
		    if (i_483_ != 0 && i_484_ <= anInt1494 - 1) {
			while (--i_482_ >= 0) {
			    i++;
			    if (!bool_479_ || f < aFloatArray1500[i])
				is[i - 1] = is[i];
			    f += f_485_;
			    i++;
			    if (!bool_479_ || f < aFloatArray1500[i])
				is[i - 1] = is[i];
			    f += f_485_;
			    i++;
			    if (!bool_479_ || f < aFloatArray1500[i])
				is[i - 1] = is[i];
			    f += f_485_;
			    i++;
			    if (!bool_479_ || f < aFloatArray1500[i])
				is[i - 1] = is[i];
			    f += f_485_;
			}
			i_482_ = i_484_ - i_483_ & 0x3;
			while (--i_482_ >= 0) {
			    i++;
			    if (!bool_479_ || f < aFloatArray1500[i])
				is[i - 1] = is[i];
			    f += f_485_;
			}
		    }
		} else {
		    int i_493_ = anInt1486;
		    int i_494_ = 256 - anInt1486;
		    i_481_ = (((i_481_ & 0xff00ff) * i_494_ >> 8 & 0xff00ff)
			      + ((i_481_ & 0xff00) * i_494_ >> 8 & 0xff00));
		    while (--i_482_ >= 0) {
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    int i_495_ = is[i];
			    if (bool_480_)
				is[i]
				    = ((i_494_ | i_495_ >> 24) << 24
				       | (i_481_
					  + ((i_495_ & 0xff00ff) * i_493_ >> 8
					     & 0xff00ff)
					  + ((i_495_ & 0xff00) * i_493_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_481_
					 + ((i_495_ & 0xff00ff) * i_493_ >> 8
					    & 0xff00ff)
					 + ((i_495_ & 0xff00) * i_493_ >> 8
					    & 0xff00));
			}
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    int i_496_ = is[i];
			    if (bool_480_)
				is[i]
				    = ((i_494_ | i_496_ >> 24) << 24
				       | (i_481_
					  + ((i_496_ & 0xff00ff) * i_493_ >> 8
					     & 0xff00ff)
					  + ((i_496_ & 0xff00) * i_493_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_481_
					 + ((i_496_ & 0xff00ff) * i_493_ >> 8
					    & 0xff00ff)
					 + ((i_496_ & 0xff00) * i_493_ >> 8
					    & 0xff00));
			}
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    int i_497_ = is[i];
			    if (bool_480_)
				is[i]
				    = ((i_494_ | i_497_ >> 24) << 24
				       | (i_481_
					  + ((i_497_ & 0xff00ff) * i_493_ >> 8
					     & 0xff00ff)
					  + ((i_497_ & 0xff00) * i_493_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_481_
					 + ((i_497_ & 0xff00ff) * i_493_ >> 8
					    & 0xff00ff)
					 + ((i_497_ & 0xff00) * i_493_ >> 8
					    & 0xff00));
			}
			f += f_485_;
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    int i_498_ = is[i];
			    if (bool_480_)
				is[i]
				    = ((i_494_ | i_498_ >> 24) << 24
				       | (i_481_
					  + ((i_498_ & 0xff00ff) * i_493_ >> 8
					     & 0xff00ff)
					  + ((i_498_ & 0xff00) * i_493_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_481_
					 + ((i_498_ & 0xff00ff) * i_493_ >> 8
					    & 0xff00ff)
					 + ((i_498_ & 0xff00) * i_493_ >> 8
					    & 0xff00));
			}
			f += f_485_;
		    }
		    i_482_ = i_484_ - i_483_ & 0x3;
		    while (--i_482_ >= 0) {
			i++;
			if (!bool_479_ || f < aFloatArray1500[i]) {
			    int i_499_ = is[i];
			    if (bool_480_)
				is[i]
				    = ((i_494_ | i_499_ >> 24) << 24
				       | (i_481_
					  + ((i_499_ & 0xff00ff) * i_493_ >> 8
					     & 0xff00ff)
					  + ((i_499_ & 0xff00) * i_493_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_481_
					 + ((i_499_ & 0xff00ff) * i_493_ >> 8
					    & 0xff00ff)
					 + ((i_499_ & 0xff00) * i_493_ >> 8
					    & 0xff00));
			}
			f += f_485_;
		    }
		}
	    }
	}
    }
    
    final void method2248
	(boolean bool, boolean bool_500_, boolean bool_501_, float f,
	 float f_502_, float f_503_, float f_504_, float f_505_, float f_506_,
	 float f_507_, float f_508_, float f_509_, float f_510_, float f_511_,
	 float f_512_, float f_513_, float f_514_, float f_515_, float f_516_,
	 float f_517_, float f_518_, int i, int i_519_, int i_520_, int i_521_,
	 float f_522_, float f_523_, float f_524_, int i_525_) {
	if (!bool)
	    method2256(false, bool_500_, bool_501_, f, f_502_, f_503_, f_504_,
		       f_505_, f_506_, f_507_, f_508_, f_509_, 0);
	else {
	    int i_526_ = i_525_ & 0xffff;
	    if (i_526_ != anInt1502) {
		anIntArray1481 = aClass182_Sub2_1488.method15165(i_526_);
		if (anIntArray1481 == null) {
		    anInt1502 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    anInt1496 = 0;
		    int i_527_
			= (Class381.anIntArray3929
			   [Class504.method8313(aClass182_Sub2_1488
						    .method15168(i_525_),
						1145553395) & 0xffff]);
		    int i_528_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_527_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_527_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_527_ & 0xff) >> 8);
		    method2243(true, bool_500_, bool_501_, f, f_502_, f_503_,
			       f_504_, f_505_, f_506_, f_507_, f_508_, f_509_,
			       Class637.method10513(i_528_, i_521_, f_522_,
						    -1862761173),
			       Class637.method10513(i_528_, i_521_, f_523_,
						    -969898811),
			       Class637.method10513(i_528_, i_521_, f_524_,
						    2040669809));
		    return;
		}
		anInt1502 = i_526_;
		anInt1504 = aClass182_Sub2_1488.method15209(i_525_);
		anInt1505 = anInt1504 - 1;
		aClass597_1507 = aClass182_Sub2_1488.method15166(i_525_);
		aBool1484 = aClass182_Sub2_1488.method15169(i_525_);
		anInt1496 = aClass182_Sub2_1488.method15167(i_525_) & 0xff;
	    }
	    anInt1501 = i_521_;
	    if (!(f <= f_502_) || !(f <= f_503_)) {
		if (f_502_ <= f_503_) {
		    float f_529_ = f_504_;
		    f_504_ = f_505_;
		    f_505_ = f_529_;
		    f_529_ = f;
		    f = f_502_;
		    f_502_ = f_529_;
		    f_529_ = f_507_;
		    f_507_ = f_508_;
		    f_508_ = f_529_;
		    f_529_ = f_513_;
		    f_513_ = f_514_;
		    f_514_ = f_529_;
		    f_529_ = f_516_;
		    f_516_ = f_517_;
		    f_517_ = f_529_;
		    f_529_ = f_510_;
		    f_510_ = f_511_;
		    f_511_ = f_529_;
		    f_529_ = f_522_;
		    f_522_ = f_523_;
		    f_523_ = f_529_;
		    int i_530_ = i;
		    i = i_519_;
		    i_519_ = i_530_;
		} else {
		    float f_531_ = f_504_;
		    f_504_ = f_506_;
		    f_506_ = f_531_;
		    f_531_ = f;
		    f = f_503_;
		    f_503_ = f_531_;
		    f_531_ = f_507_;
		    f_507_ = f_509_;
		    f_509_ = f_531_;
		    f_531_ = f_513_;
		    f_513_ = f_515_;
		    f_515_ = f_531_;
		    f_531_ = f_516_;
		    f_516_ = f_518_;
		    f_518_ = f_531_;
		    f_531_ = f_510_;
		    f_510_ = f_512_;
		    f_512_ = f_531_;
		    f_531_ = f_522_;
		    f_522_ = f_524_;
		    f_524_ = f_531_;
		    int i_532_ = i;
		    i = i_520_;
		    i_520_ = i_532_;
		}
	    }
	    f_513_ /= f_510_;
	    f_514_ /= f_511_;
	    f_515_ /= f_512_;
	    f_516_ /= f_510_;
	    f_517_ /= f_511_;
	    f_518_ /= f_512_;
	    f_507_ = 1.0F / f_507_;
	    f_508_ = 1.0F / f_508_;
	    f_509_ = 1.0F / f_509_;
	    f_510_ = 1.0F / f_510_;
	    f_511_ = 1.0F / f_511_;
	    f_512_ = 1.0F / f_512_;
	    float f_533_ = (float) (i >> 24 & 0xff);
	    float f_534_ = (float) (i_519_ >> 24 & 0xff);
	    float f_535_ = (float) (i_520_ >> 24 & 0xff);
	    float f_536_ = (float) (i >> 16 & 0xff);
	    float f_537_ = (float) (i_519_ >> 16 & 0xff);
	    float f_538_ = (float) (i_520_ >> 16 & 0xff);
	    float f_539_ = (float) (i >> 8 & 0xff);
	    float f_540_ = (float) (i_519_ >> 8 & 0xff);
	    float f_541_ = (float) (i_520_ >> 8 & 0xff);
	    float f_542_ = (float) (i & 0xff);
	    float f_543_ = (float) (i_519_ & 0xff);
	    float f_544_ = (float) (i_520_ & 0xff);
	    float f_545_ = 0.0F;
	    float f_546_ = 0.0F;
	    float f_547_ = 0.0F;
	    float f_548_ = 0.0F;
	    float f_549_ = 0.0F;
	    float f_550_ = 0.0F;
	    float f_551_ = 0.0F;
	    float f_552_ = 0.0F;
	    float f_553_ = 0.0F;
	    float f_554_ = 0.0F;
	    if (f_502_ != f) {
		float f_555_ = f_502_ - f;
		f_545_ = (f_505_ - f_504_) / f_555_;
		f_546_ = (f_508_ - f_507_) / f_555_;
		f_547_ = (f_511_ - f_510_) / f_555_;
		f_548_ = (f_514_ - f_513_) / f_555_;
		f_549_ = (f_517_ - f_516_) / f_555_;
		f_550_ = (f_523_ - f_522_) / f_555_;
		f_551_ = (f_534_ - f_533_) / f_555_;
		f_552_ = (f_537_ - f_536_) / f_555_;
		f_553_ = (f_540_ - f_539_) / f_555_;
		f_554_ = (f_543_ - f_542_) / f_555_;
	    }
	    float f_556_ = 0.0F;
	    float f_557_ = 0.0F;
	    float f_558_ = 0.0F;
	    float f_559_ = 0.0F;
	    float f_560_ = 0.0F;
	    float f_561_ = 0.0F;
	    float f_562_ = 0.0F;
	    float f_563_ = 0.0F;
	    float f_564_ = 0.0F;
	    float f_565_ = 0.0F;
	    if (f_503_ != f_502_) {
		float f_566_ = f_503_ - f_502_;
		f_556_ = (f_506_ - f_505_) / f_566_;
		f_557_ = (f_509_ - f_508_) / f_566_;
		f_558_ = (f_512_ - f_511_) / f_566_;
		f_559_ = (f_515_ - f_514_) / f_566_;
		f_560_ = (f_518_ - f_517_) / f_566_;
		f_561_ = (f_524_ - f_523_) / f_566_;
		f_562_ = (f_535_ - f_534_) / f_566_;
		f_563_ = (f_538_ - f_537_) / f_566_;
		f_564_ = (f_541_ - f_540_) / f_566_;
		f_565_ = (f_544_ - f_543_) / f_566_;
	    }
	    float f_567_ = 0.0F;
	    float f_568_ = 0.0F;
	    float f_569_ = 0.0F;
	    float f_570_ = 0.0F;
	    float f_571_ = 0.0F;
	    float f_572_ = 0.0F;
	    float f_573_ = 0.0F;
	    float f_574_ = 0.0F;
	    float f_575_ = 0.0F;
	    float f_576_ = 0.0F;
	    if (f != f_503_) {
		float f_577_ = f - f_503_;
		f_567_ = (f_504_ - f_506_) / f_577_;
		f_568_ = (f_507_ - f_509_) / f_577_;
		f_569_ = (f_510_ - f_512_) / f_577_;
		f_570_ = (f_513_ - f_515_) / f_577_;
		f_571_ = (f_516_ - f_518_) / f_577_;
		f_572_ = (f_522_ - f_524_) / f_577_;
		f_573_ = (f_533_ - f_535_) / f_577_;
		f_574_ = (f_536_ - f_538_) / f_577_;
		f_575_ = (f_539_ - f_541_) / f_577_;
		f_576_ = (f_542_ - f_544_) / f_577_;
	    }
	    if (!(f >= (float) anInt1495)) {
		if (f_502_ > (float) anInt1495)
		    f_502_ = (float) anInt1495;
		if (f_503_ > (float) anInt1495)
		    f_503_ = (float) anInt1495;
		if (f_502_ < f_503_) {
		    f_506_ = f_504_;
		    f_509_ = f_507_;
		    f_512_ = f_510_;
		    f_515_ = f_513_;
		    f_518_ = f_516_;
		    f_524_ = f_522_;
		    f_535_ = f_533_;
		    f_538_ = f_536_;
		    f_541_ = f_539_;
		    f_544_ = f_542_;
		    if (f < 0.0F) {
			f_504_ -= f_545_ * f;
			f_506_ -= f_567_ * f;
			f_507_ -= f_546_ * f;
			f_509_ -= f_568_ * f;
			f_510_ -= f_547_ * f;
			f_512_ -= f_569_ * f;
			f_513_ -= f_548_ * f;
			f_515_ -= f_570_ * f;
			f_516_ -= f_549_ * f;
			f_518_ -= f_571_ * f;
			f_522_ -= f_550_ * f;
			f_524_ -= f_572_ * f;
			f_533_ -= f_551_ * f;
			f_535_ -= f_573_ * f;
			f_536_ -= f_551_ * f;
			f_538_ -= f_573_ * f;
			f_539_ -= f_551_ * f;
			f_541_ -= f_573_ * f;
			f_542_ -= f_551_ * f;
			f_544_ -= f_573_ * f;
			f = 0.0F;
		    }
		    if (f_502_ < 0.0F) {
			f_505_ -= f_556_ * f_502_;
			f_508_ -= f_557_ * f_502_;
			f_511_ -= f_558_ * f_502_;
			f_514_ -= f_559_ * f_502_;
			f_517_ -= f_560_ * f_502_;
			f_523_ -= f_561_ * f_502_;
			f_534_ -= f_562_ * f_502_;
			f_537_ -= f_563_ * f_502_;
			f_540_ -= f_564_ * f_502_;
			f_543_ -= f_565_ * f_502_;
			f_502_ = 0.0F;
		    }
		    if (f != f_502_ && f_567_ < f_545_
			|| f == f_502_ && f_567_ > f_556_) {
			f += 0.5F;
			f_502_ += 0.5F;
			f_503_ = (float) (int) (f_503_ + 0.5F) - f_502_;
			f_502_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_502_ >= 0.0F) {
			    method2246(bool_500_, bool_501_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_506_,
				       (int) f_504_, f_509_, f_507_, f_512_,
				       f_510_, f_515_, f_513_, f_518_, f_516_,
				       f_524_, f_522_, f_535_, f_533_, f_538_,
				       f_536_, f_541_, f_539_, f_544_, f_542_);
			    f_504_ += f_545_;
			    f_506_ += f_567_;
			    f_507_ += f_546_;
			    f_509_ += f_568_;
			    f_510_ += f_547_;
			    f_512_ += f_569_;
			    f_513_ += f_548_;
			    f_515_ += f_570_;
			    f_516_ += f_549_;
			    f_518_ += f_571_;
			    f_522_ += f_550_;
			    f_524_ += f_572_;
			    f_533_ += f_551_;
			    f_535_ += f_573_;
			    f_536_ += f_552_;
			    f_538_ += f_574_;
			    f_539_ += f_553_;
			    f_541_ += f_575_;
			    f_542_ += f_554_;
			    f_544_ += f_576_;
			    f += (float) anInt1498;
			}
			while (--f_503_ >= 0.0F) {
			    method2246(bool_500_, bool_501_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_506_,
				       (int) f_505_, f_509_, f_508_, f_512_,
				       f_511_, f_515_, f_514_, f_518_, f_517_,
				       f_524_, f_523_, f_535_, f_534_, f_538_,
				       f_537_, f_541_, f_540_, f_544_, f_543_);
			    f_505_ += f_556_;
			    f_506_ += f_567_;
			    f_508_ += f_557_;
			    f_509_ += f_568_;
			    f_511_ += f_558_;
			    f_512_ += f_569_;
			    f_514_ += f_559_;
			    f_515_ += f_570_;
			    f_517_ += f_560_;
			    f_518_ += f_571_;
			    f_523_ += f_561_;
			    f_524_ += f_572_;
			    f_534_ += f_562_;
			    f_535_ += f_573_;
			    f_537_ += f_563_;
			    f_538_ += f_574_;
			    f_540_ += f_564_;
			    f_541_ += f_575_;
			    f_543_ += f_565_;
			    f_544_ += f_576_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_502_ += 0.5F;
			f_503_ = (float) (int) (f_503_ + 0.5F) - f_502_;
			f_502_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_502_ >= 0.0F) {
			    method2246(bool_500_, bool_501_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_504_,
				       (int) f_506_, f_507_, f_509_, f_510_,
				       f_512_, f_513_, f_515_, f_516_, f_518_,
				       f_522_, f_524_, f_533_, f_535_, f_536_,
				       f_538_, f_539_, f_541_, f_542_, f_544_);
			    f_504_ += f_545_;
			    f_506_ += f_567_;
			    f_507_ += f_546_;
			    f_509_ += f_568_;
			    f_510_ += f_547_;
			    f_512_ += f_569_;
			    f_513_ += f_548_;
			    f_515_ += f_570_;
			    f_516_ += f_549_;
			    f_518_ += f_571_;
			    f_522_ += f_550_;
			    f_524_ += f_572_;
			    f_533_ += f_551_;
			    f_535_ += f_573_;
			    f_536_ += f_552_;
			    f_538_ += f_574_;
			    f_539_ += f_553_;
			    f_541_ += f_575_;
			    f_542_ += f_554_;
			    f_544_ += f_576_;
			    f += (float) anInt1498;
			}
			while (--f_503_ >= 0.0F) {
			    method2246(bool_500_, bool_501_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_505_,
				       (int) f_506_, f_508_, f_509_, f_511_,
				       f_512_, f_514_, f_515_, f_517_, f_518_,
				       f_523_, f_524_, f_534_, f_535_, f_537_,
				       f_538_, f_540_, f_541_, f_543_, f_544_);
			    f_505_ += f_556_;
			    f_506_ += f_567_;
			    f_508_ += f_557_;
			    f_509_ += f_568_;
			    f_511_ += f_558_;
			    f_512_ += f_569_;
			    f_514_ += f_559_;
			    f_515_ += f_570_;
			    f_517_ += f_560_;
			    f_518_ += f_571_;
			    f_523_ += f_561_;
			    f_524_ += f_572_;
			    f_534_ += f_562_;
			    f_535_ += f_573_;
			    f_537_ += f_563_;
			    f_538_ += f_574_;
			    f_540_ += f_564_;
			    f_541_ += f_575_;
			    f_543_ += f_565_;
			    f_544_ += f_576_;
			    f += (float) anInt1498;
			}
		    }
		} else {
		    f_505_ = f_504_;
		    f_508_ = f_507_;
		    f_511_ = f_510_;
		    f_514_ = f_513_;
		    f_517_ = f_516_;
		    f_523_ = f_522_;
		    f_534_ = f_533_;
		    f_537_ = f_536_;
		    f_540_ = f_539_;
		    f_543_ = f_542_;
		    if (f < 0.0F) {
			f_504_ -= f_545_ * f;
			f_505_ -= f_567_ * f;
			f_507_ -= f_546_ * f;
			f_508_ -= f_568_ * f;
			f_510_ -= f_547_ * f;
			f_511_ -= f_569_ * f;
			f_513_ -= f_548_ * f;
			f_514_ -= f_570_ * f;
			f_516_ -= f_549_ * f;
			f_517_ -= f_571_ * f;
			f_522_ -= f_550_ * f;
			f_523_ -= f_572_ * f;
			f_533_ -= f_551_ * f;
			f_534_ -= f_573_ * f;
			f_536_ -= f_551_ * f;
			f_537_ -= f_573_ * f;
			f_539_ -= f_551_ * f;
			f_540_ -= f_573_ * f;
			f_542_ -= f_551_ * f;
			f_543_ -= f_573_ * f;
			f = 0.0F;
		    }
		    if (f_503_ < 0.0F) {
			f_506_ -= f_556_ * f_503_;
			f_509_ -= f_557_ * f_503_;
			f_512_ -= f_558_ * f_503_;
			f_515_ -= f_559_ * f_503_;
			f_518_ -= f_560_ * f_503_;
			f_524_ -= f_561_ * f_503_;
			f_535_ -= f_562_ * f_503_;
			f_538_ -= f_563_ * f_503_;
			f_541_ -= f_564_ * f_503_;
			f_544_ -= f_565_ * f_503_;
			f_503_ = 0.0F;
		    }
		    if (f != f_503_ && f_567_ < f_545_
			|| f == f_503_ && f_556_ > f_545_) {
			f += 0.5F;
			f_503_ += 0.5F;
			f_502_ = (float) (int) (f_502_ + 0.5F) - f_503_;
			f_503_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_503_ >= 0.0F) {
			    method2246(bool_500_, bool_501_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_505_,
				       (int) f_504_, f_508_, f_507_, f_511_,
				       f_510_, f_514_, f_513_, f_517_, f_516_,
				       f_523_, f_522_, f_534_, f_533_, f_537_,
				       f_536_, f_540_, f_539_, f_543_, f_542_);
			    f_504_ += f_545_;
			    f_505_ += f_567_;
			    f_507_ += f_546_;
			    f_508_ += f_568_;
			    f_510_ += f_547_;
			    f_511_ += f_569_;
			    f_513_ += f_548_;
			    f_514_ += f_570_;
			    f_516_ += f_549_;
			    f_517_ += f_571_;
			    f_522_ += f_550_;
			    f_523_ += f_572_;
			    f_533_ += f_551_;
			    f_534_ += f_573_;
			    f_536_ += f_552_;
			    f_537_ += f_574_;
			    f_539_ += f_553_;
			    f_540_ += f_575_;
			    f_542_ += f_554_;
			    f_543_ += f_576_;
			    f += (float) anInt1498;
			}
			while (--f_502_ >= 0.0F) {
			    method2246(bool_500_, bool_501_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_506_,
				       (int) f_504_, f_509_, f_507_, f_512_,
				       f_510_, f_515_, f_513_, f_518_, f_516_,
				       f_524_, f_522_, f_535_, f_533_, f_538_,
				       f_536_, f_541_, f_539_, f_544_, f_542_);
			    f_506_ += f_556_;
			    f_504_ += f_545_;
			    f_509_ += f_557_;
			    f_507_ += f_546_;
			    f_512_ += f_558_;
			    f_510_ += f_547_;
			    f_515_ += f_559_;
			    f_513_ += f_548_;
			    f_518_ += f_560_;
			    f_516_ += f_549_;
			    f_524_ += f_561_;
			    f_522_ += f_550_;
			    f_535_ += f_562_;
			    f_533_ += f_551_;
			    f_538_ += f_563_;
			    f_536_ += f_552_;
			    f_541_ += f_564_;
			    f_539_ += f_553_;
			    f_544_ += f_565_;
			    f_542_ += f_554_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_503_ += 0.5F;
			f_502_ = (float) (int) (f_502_ + 0.5F) - f_503_;
			f_503_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_503_ >= 0.0F) {
			    method2246(bool_500_, bool_501_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_504_,
				       (int) f_505_, f_507_, f_508_, f_510_,
				       f_511_, f_513_, f_514_, f_516_, f_517_,
				       f_522_, f_523_, f_533_, f_534_, f_536_,
				       f_537_, f_539_, f_540_, f_542_, f_543_);
			    f_505_ += f_567_;
			    f_504_ += f_545_;
			    f_508_ += f_568_;
			    f_507_ += f_546_;
			    f_511_ += f_569_;
			    f_510_ += f_547_;
			    f_514_ += f_570_;
			    f_513_ += f_548_;
			    f_517_ += f_571_;
			    f_516_ += f_549_;
			    f_523_ += f_572_;
			    f_522_ += f_550_;
			    f_534_ += f_573_;
			    f_533_ += f_551_;
			    f_537_ += f_574_;
			    f_536_ += f_552_;
			    f_540_ += f_575_;
			    f_539_ += f_553_;
			    f_543_ += f_576_;
			    f_542_ += f_554_;
			    f += (float) anInt1498;
			}
			while (--f_502_ >= 0.0F) {
			    method2246(bool_500_, bool_501_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_504_,
				       (int) f_506_, f_507_, f_509_, f_510_,
				       f_512_, f_513_, f_515_, f_516_, f_518_,
				       f_522_, f_524_, f_533_, f_535_, f_536_,
				       f_538_, f_539_, f_541_, f_542_, f_544_);
			    f_504_ += f_545_;
			    f_506_ += f_556_;
			    f_507_ += f_546_;
			    f_509_ += f_557_;
			    f_510_ += f_547_;
			    f_512_ += f_558_;
			    f_513_ += f_548_;
			    f_515_ += f_559_;
			    f_516_ += f_549_;
			    f_518_ += f_560_;
			    f_522_ += f_550_;
			    f_524_ += f_561_;
			    f_533_ += f_551_;
			    f_535_ += f_562_;
			    f_536_ += f_552_;
			    f_538_ += f_563_;
			    f_539_ += f_553_;
			    f_541_ += f_564_;
			    f_542_ += f_554_;
			    f_544_ += f_565_;
			    f += (float) anInt1498;
			}
		    }
		}
	    }
	}
    }
    
    final void method2249(boolean bool) {
	aBool1510 = bool;
    }
    
    final void method2250
	(boolean bool, boolean bool_578_, boolean bool_579_, float f,
	 float f_580_, float f_581_, float f_582_, float f_583_, float f_584_,
	 float f_585_, float f_586_, float f_587_, float f_588_, float f_589_,
	 float f_590_, float f_591_, float f_592_, float f_593_, float f_594_,
	 float f_595_, float f_596_, int i, int i_597_, int i_598_, int i_599_,
	 float f_600_, float f_601_, float f_602_, int i_603_, float f_604_,
	 int i_605_, float f_606_, int i_607_, float f_608_) {
	if (!bool)
	    method2256(false, bool_578_, bool_579_, f, f_580_, f_581_, f_582_,
		       f_583_, f_584_, f_585_, f_586_, f_587_, 0);
	else {
	    anInt1501 = i_599_;
	    if (!(f <= f_580_) || !(f <= f_581_)) {
		if (f_580_ <= f_581_) {
		    float f_609_ = f_582_;
		    f_582_ = f_583_;
		    f_583_ = f_609_;
		    f_609_ = f;
		    f = f_580_;
		    f_580_ = f_609_;
		    f_609_ = f_585_;
		    f_585_ = f_586_;
		    f_586_ = f_609_;
		    f_609_ = f_591_;
		    f_591_ = f_592_;
		    f_592_ = f_609_;
		    f_609_ = f_594_;
		    f_594_ = f_595_;
		    f_595_ = f_609_;
		    f_609_ = f_588_;
		    f_588_ = f_589_;
		    f_589_ = f_609_;
		    f_609_ = f_600_;
		    f_600_ = f_601_;
		    f_601_ = f_609_;
		    f_609_ = f_604_;
		    f_604_ = f_606_;
		    f_606_ = f_609_;
		    int i_610_ = i;
		    i = i_597_;
		    i_597_ = i_610_;
		    i_610_ = i_603_;
		    i_603_ = i_605_;
		    i_605_ = i_610_;
		} else {
		    float f_611_ = f_582_;
		    f_582_ = f_584_;
		    f_584_ = f_611_;
		    f_611_ = f;
		    f = f_581_;
		    f_581_ = f_611_;
		    f_611_ = f_585_;
		    f_585_ = f_587_;
		    f_587_ = f_611_;
		    f_611_ = f_591_;
		    f_591_ = f_593_;
		    f_593_ = f_611_;
		    f_611_ = f_594_;
		    f_594_ = f_596_;
		    f_596_ = f_611_;
		    f_611_ = f_588_;
		    f_588_ = f_590_;
		    f_590_ = f_611_;
		    f_611_ = f_600_;
		    f_600_ = f_602_;
		    f_602_ = f_611_;
		    f_611_ = f_604_;
		    f_604_ = f_608_;
		    f_608_ = f_611_;
		    int i_612_ = i;
		    i = i_598_;
		    i_598_ = i_612_;
		    i_612_ = i_603_;
		    i_603_ = i_607_;
		    i_607_ = i_612_;
		}
	    }
	    int i_613_ = i_603_ & 0xffff;
	    int i_614_ = i_605_ & 0xffff;
	    int i_615_ = i_607_ & 0xffff;
	    if (i_613_ != anInt1502) {
		anIntArray1481 = aClass182_Sub2_1488.method15165(i_613_);
		if (anIntArray1481 == null) {
		    anInt1502 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    int i_616_
			= (Class381.anIntArray3929
			   [Class504.method8313(aClass182_Sub2_1488
						    .method15168(i_603_),
						1277226487) & 0xffff]);
		    int i_617_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_616_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_616_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_616_ & 0xff) >> 8);
		    method2243(true, bool_578_, bool_579_, f, f_580_, f_581_,
			       f_582_, f_583_, f_584_, f_585_, f_586_, f_587_,
			       Class637.method10513(i_617_, i_599_, f_600_,
						    132826150),
			       Class637.method10513(i_617_, i_599_, f_601_,
						    -1039155013),
			       Class637.method10513(i_617_, i_599_, f_602_,
						    172016724));
		    return;
		}
		anInt1502 = i_613_;
		anInt1504 = aClass182_Sub2_1488.method15209(i_603_);
		anInt1505 = anInt1504 - 1;
		aClass597_1507 = aClass182_Sub2_1488.method15166(i_603_);
	    }
	    aFloat1506 = f_604_;
	    if (i_614_ != anInt1508) {
		anIntArray1511 = aClass182_Sub2_1488.method15165(i_614_);
		if (anIntArray1511 == null) {
		    anInt1508 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    int i_618_
			= (Class381.anIntArray3929
			   [Class504.method8313(aClass182_Sub2_1488
						    .method15168(i_605_),
						368657169) & 0xffff]);
		    int i_619_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_618_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_618_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_618_ & 0xff) >> 8);
		    method2243(true, bool_578_, bool_579_, f, f_580_, f_581_,
			       f_582_, f_583_, f_584_, f_585_, f_586_, f_587_,
			       Class637.method10513(i_619_, i_599_, f_600_,
						    290379438),
			       Class637.method10513(i_619_, i_599_, f_601_,
						    343761919),
			       Class637.method10513(i_619_, i_599_, f_602_,
						    -2065851926));
		    return;
		}
		anInt1508 = i_614_;
		anInt1512 = aClass182_Sub2_1488.method15209(i_605_);
		anInt1513 = anInt1512 - 1;
	    }
	    aFloat1514 = f_606_;
	    if (i_615_ != anInt1515) {
		anIntArray1516 = aClass182_Sub2_1488.method15165(i_615_);
		if (anIntArray1516 == null) {
		    anInt1515 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    int i_620_
			= (Class381.anIntArray3929
			   [Class504.method8313(aClass182_Sub2_1488
						    .method15168(i_607_),
						974931140) & 0xffff]);
		    int i_621_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_620_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_620_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_620_ & 0xff) >> 8);
		    method2243(true, bool_578_, bool_579_, (float) (int) f,
			       (float) (int) f_580_, (float) (int) f_581_,
			       (float) (int) f_582_, (float) (int) f_583_,
			       (float) (int) f_584_, (float) (int) f_585_,
			       (float) (int) f_586_, (float) (int) f_587_,
			       Class637.method10513(i_621_, i_599_, f_600_,
						    -1118219457),
			       Class637.method10513(i_621_, i_599_, f_601_,
						    1943222818),
			       Class637.method10513(i_621_, i_599_, f_602_,
						    1872372008));
		    return;
		}
		anInt1515 = i_615_;
		anInt1517 = aClass182_Sub2_1488.method15209(i_607_);
		anInt1509 = anInt1517 - 1;
	    }
	    aFloat1519 = f_608_;
	    f_591_ /= f_588_;
	    f_592_ /= f_589_;
	    f_593_ /= f_590_;
	    f_594_ /= f_588_;
	    f_595_ /= f_589_;
	    f_596_ /= f_590_;
	    f_585_ = 1.0F / f_585_;
	    f_586_ = 1.0F / f_586_;
	    f_587_ = 1.0F / f_587_;
	    f_588_ = 1.0F / f_588_;
	    f_589_ = 1.0F / f_589_;
	    f_590_ = 1.0F / f_590_;
	    float f_622_ = (float) (i >> 24 & 0xff);
	    float f_623_ = (float) (i_597_ >> 24 & 0xff);
	    float f_624_ = (float) (i_598_ >> 24 & 0xff);
	    float f_625_ = (float) (i >> 16 & 0xff);
	    float f_626_ = (float) (i_597_ >> 16 & 0xff);
	    float f_627_ = (float) (i_598_ >> 16 & 0xff);
	    float f_628_ = (float) (i >> 8 & 0xff);
	    float f_629_ = (float) (i_597_ >> 8 & 0xff);
	    float f_630_ = (float) (i_598_ >> 8 & 0xff);
	    float f_631_ = (float) (i & 0xff);
	    float f_632_ = (float) (i_597_ & 0xff);
	    float f_633_ = (float) (i_598_ & 0xff);
	    float f_634_ = 1.0F;
	    float f_635_ = 0.0F;
	    float f_636_ = 0.0F;
	    float f_637_ = 0.0F;
	    float f_638_ = 1.0F;
	    float f_639_ = 0.0F;
	    float f_640_ = 0.0F;
	    float f_641_ = 0.0F;
	    float f_642_ = 0.0F;
	    float f_643_ = 0.0F;
	    float f_644_ = 0.0F;
	    float f_645_ = 0.0F;
	    float f_646_ = 0.0F;
	    float f_647_ = 0.0F;
	    float f_648_ = 0.0F;
	    float f_649_ = 0.0F;
	    float f_650_ = 0.0F;
	    float f_651_ = 0.0F;
	    if (f_580_ != f) {
		float f_652_ = f_580_ - f;
		f_640_ = (f_583_ - f_582_) / f_652_;
		f_641_ = (f_586_ - f_585_) / f_652_;
		f_642_ = (f_589_ - f_588_) / f_652_;
		f_643_ = (f_592_ - f_591_) / f_652_;
		f_644_ = (f_595_ - f_594_) / f_652_;
		f_645_ = (f_601_ - f_600_) / f_652_;
		f_646_ = (f_623_ - f_622_) / f_652_;
		f_647_ = (f_626_ - f_625_) / f_652_;
		f_648_ = (f_629_ - f_628_) / f_652_;
		f_649_ = (f_632_ - f_631_) / f_652_;
		f_650_ = (f_635_ - f_634_) / f_652_;
		f_651_ = (f_638_ - f_637_) / f_652_;
	    }
	    float f_653_ = 0.0F;
	    float f_654_ = 0.0F;
	    float f_655_ = 0.0F;
	    float f_656_ = 0.0F;
	    float f_657_ = 0.0F;
	    float f_658_ = 0.0F;
	    float f_659_ = 0.0F;
	    float f_660_ = 0.0F;
	    float f_661_ = 0.0F;
	    float f_662_ = 0.0F;
	    float f_663_ = 0.0F;
	    float f_664_ = 0.0F;
	    if (f_581_ != f_580_) {
		float f_665_ = f_581_ - f_580_;
		f_653_ = (f_584_ - f_583_) / f_665_;
		f_654_ = (f_587_ - f_586_) / f_665_;
		f_655_ = (f_590_ - f_589_) / f_665_;
		f_656_ = (f_593_ - f_592_) / f_665_;
		f_657_ = (f_596_ - f_595_) / f_665_;
		f_658_ = (f_602_ - f_601_) / f_665_;
		f_659_ = (f_624_ - f_623_) / f_665_;
		f_660_ = (f_627_ - f_626_) / f_665_;
		f_661_ = (f_630_ - f_629_) / f_665_;
		f_662_ = (f_633_ - f_632_) / f_665_;
		f_663_ = (f_636_ - f_635_) / f_665_;
		f_664_ = (f_639_ - f_638_) / f_665_;
	    }
	    float f_666_ = 0.0F;
	    float f_667_ = 0.0F;
	    float f_668_ = 0.0F;
	    float f_669_ = 0.0F;
	    float f_670_ = 0.0F;
	    float f_671_ = 0.0F;
	    float f_672_ = 0.0F;
	    float f_673_ = 0.0F;
	    float f_674_ = 0.0F;
	    float f_675_ = 0.0F;
	    float f_676_ = 0.0F;
	    float f_677_ = 0.0F;
	    if (f != f_581_) {
		float f_678_ = f - f_581_;
		f_666_ = (f_582_ - f_584_) / f_678_;
		f_667_ = (f_585_ - f_587_) / f_678_;
		f_668_ = (f_588_ - f_590_) / f_678_;
		f_669_ = (f_591_ - f_593_) / f_678_;
		f_670_ = (f_594_ - f_596_) / f_678_;
		f_671_ = (f_600_ - f_602_) / f_678_;
		f_672_ = (f_622_ - f_624_) / f_678_;
		f_673_ = (f_625_ - f_627_) / f_678_;
		f_674_ = (f_628_ - f_630_) / f_678_;
		f_675_ = (f_631_ - f_633_) / f_678_;
		f_676_ = (f_634_ - f_636_) / f_678_;
		f_677_ = (f_637_ - f_639_) / f_678_;
	    }
	    if (!(f >= (float) anInt1495)) {
		if (f_580_ > (float) anInt1495)
		    f_580_ = (float) anInt1495;
		if (f_581_ > (float) anInt1495)
		    f_581_ = (float) anInt1495;
		if (f_580_ < f_581_) {
		    f_584_ = f_582_;
		    f_587_ = f_585_;
		    f_590_ = f_588_;
		    f_593_ = f_591_;
		    f_596_ = f_594_;
		    f_602_ = f_600_;
		    f_624_ = f_622_;
		    f_627_ = f_625_;
		    f_630_ = f_628_;
		    f_633_ = f_631_;
		    f_636_ = f_634_;
		    f_639_ = f_637_;
		    if (f < 0.0F) {
			f_582_ -= f_640_ * f;
			f_584_ -= f_666_ * f;
			f_585_ -= f_641_ * f;
			f_587_ -= f_667_ * f;
			f_588_ -= f_642_ * f;
			f_590_ -= f_668_ * f;
			f_591_ -= f_643_ * f;
			f_593_ -= f_669_ * f;
			f_594_ -= f_644_ * f;
			f_596_ -= f_670_ * f;
			f_600_ -= f_645_ * f;
			f_602_ -= f_671_ * f;
			f_622_ -= f_646_ * f;
			f_624_ -= f_672_ * f;
			f_625_ -= f_647_ * f;
			f_627_ -= f_673_ * f;
			f_628_ -= f_648_ * f;
			f_630_ -= f_674_ * f;
			f_631_ -= f_649_ * f;
			f_633_ -= f_675_ * f;
			f_634_ -= f_650_ * f;
			f_636_ -= f_676_ * f;
			f_637_ -= f_651_ * f;
			f_639_ -= f_677_ * f;
			f = 0.0F;
		    }
		    if (f_580_ < 0.0F) {
			f_583_ -= f_653_ * f_580_;
			f_586_ -= f_654_ * f_580_;
			f_589_ -= f_655_ * f_580_;
			f_592_ -= f_656_ * f_580_;
			f_595_ -= f_657_ * f_580_;
			f_601_ -= f_658_ * f_580_;
			f_623_ -= f_659_ * f_580_;
			f_626_ -= f_660_ * f_580_;
			f_629_ -= f_661_ * f_580_;
			f_632_ -= f_662_ * f_580_;
			f_635_ -= f_663_ * f_580_;
			f_638_ -= f_664_ * f_580_;
			f_580_ = 0.0F;
		    }
		    if (f != f_580_ && f_666_ < f_640_
			|| f == f_580_ && f_666_ > f_653_) {
			f += 0.5F;
			f_580_ += 0.5F;
			f_581_ = (float) (int) (f_581_ + 0.5F) - f_580_;
			f_580_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_580_ >= 0.0F) {
			    method2251(bool_578_, bool_579_, anIntArray1499,
				       (int) f, (int) f_584_, (int) f_582_,
				       f_587_, f_585_, f_590_, f_588_, f_593_,
				       f_591_, f_596_, f_594_, f_602_, f_600_,
				       f_624_, f_622_, f_627_, f_625_, f_630_,
				       f_628_, f_633_, f_631_, f_636_, f_634_,
				       f_639_, f_637_);
			    f_582_ += f_640_;
			    f_584_ += f_666_;
			    f_585_ += f_641_;
			    f_587_ += f_667_;
			    f_588_ += f_642_;
			    f_590_ += f_668_;
			    f_591_ += f_643_;
			    f_593_ += f_669_;
			    f_594_ += f_644_;
			    f_596_ += f_670_;
			    f_600_ += f_645_;
			    f_602_ += f_671_;
			    f_622_ += f_646_;
			    f_624_ += f_672_;
			    f_625_ += f_647_;
			    f_627_ += f_673_;
			    f_628_ += f_648_;
			    f_630_ += f_674_;
			    f_631_ += f_649_;
			    f_633_ += f_675_;
			    f_634_ += f_650_;
			    f_636_ += f_676_;
			    f_637_ += f_651_;
			    f_639_ += f_677_;
			    f += (float) anInt1498;
			}
			while (--f_581_ >= 0.0F) {
			    method2251(bool_578_, bool_579_, anIntArray1499,
				       (int) f, (int) f_584_, (int) f_583_,
				       f_587_, f_586_, f_590_, f_589_, f_593_,
				       f_592_, f_596_, f_595_, f_602_, f_601_,
				       f_624_, f_623_, f_627_, f_626_, f_630_,
				       f_629_, f_633_, f_632_, f_636_, f_635_,
				       f_639_, f_638_);
			    f_583_ += f_653_;
			    f_584_ += f_666_;
			    f_586_ += f_654_;
			    f_587_ += f_667_;
			    f_589_ += f_655_;
			    f_590_ += f_668_;
			    f_592_ += f_656_;
			    f_593_ += f_669_;
			    f_595_ += f_657_;
			    f_596_ += f_670_;
			    f_601_ += f_658_;
			    f_602_ += f_671_;
			    f_623_ += f_659_;
			    f_624_ += f_672_;
			    f_626_ += f_660_;
			    f_627_ += f_673_;
			    f_629_ += f_661_;
			    f_630_ += f_674_;
			    f_632_ += f_662_;
			    f_633_ += f_675_;
			    f_635_ += f_663_;
			    f_636_ += f_676_;
			    f_638_ += f_664_;
			    f_639_ += f_677_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_580_ += 0.5F;
			f_581_ = (float) (int) (f_581_ + 0.5F) - f_580_;
			f_580_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_580_ >= 0.0F) {
			    method2251(bool_578_, bool_579_, anIntArray1499,
				       (int) f, (int) f_582_, (int) f_584_,
				       f_585_, f_587_, f_588_, f_590_, f_591_,
				       f_593_, f_594_, f_596_, f_600_, f_602_,
				       f_622_, f_624_, f_625_, f_627_, f_628_,
				       f_630_, f_631_, f_633_, f_634_, f_636_,
				       f_637_, f_639_);
			    f_582_ += f_640_;
			    f_584_ += f_666_;
			    f_585_ += f_641_;
			    f_587_ += f_667_;
			    f_588_ += f_642_;
			    f_590_ += f_668_;
			    f_591_ += f_643_;
			    f_593_ += f_669_;
			    f_594_ += f_644_;
			    f_596_ += f_670_;
			    f_600_ += f_645_;
			    f_602_ += f_671_;
			    f_622_ += f_646_;
			    f_624_ += f_672_;
			    f_625_ += f_647_;
			    f_627_ += f_673_;
			    f_628_ += f_648_;
			    f_630_ += f_674_;
			    f_631_ += f_649_;
			    f_633_ += f_675_;
			    f_634_ += f_650_;
			    f_636_ += f_676_;
			    f_637_ += f_651_;
			    f_639_ += f_677_;
			    f += (float) anInt1498;
			}
			while (--f_581_ >= 0.0F) {
			    method2251(bool_578_, bool_579_, anIntArray1499,
				       (int) f, (int) f_583_, (int) f_584_,
				       f_586_, f_587_, f_589_, f_590_, f_592_,
				       f_593_, f_595_, f_596_, f_601_, f_602_,
				       f_623_, f_624_, f_626_, f_627_, f_629_,
				       f_630_, f_632_, f_633_, f_635_, f_636_,
				       f_638_, f_639_);
			    f_583_ += f_653_;
			    f_584_ += f_666_;
			    f_586_ += f_654_;
			    f_587_ += f_667_;
			    f_589_ += f_655_;
			    f_590_ += f_668_;
			    f_592_ += f_656_;
			    f_593_ += f_669_;
			    f_595_ += f_657_;
			    f_596_ += f_670_;
			    f_601_ += f_658_;
			    f_602_ += f_671_;
			    f_623_ += f_659_;
			    f_624_ += f_672_;
			    f_626_ += f_660_;
			    f_627_ += f_673_;
			    f_629_ += f_661_;
			    f_630_ += f_674_;
			    f_632_ += f_662_;
			    f_633_ += f_675_;
			    f_635_ += f_663_;
			    f_636_ += f_676_;
			    f_638_ += f_664_;
			    f_639_ += f_677_;
			    f += (float) anInt1498;
			}
		    }
		} else {
		    f_583_ = f_582_;
		    f_586_ = f_585_;
		    f_589_ = f_588_;
		    f_592_ = f_591_;
		    f_595_ = f_594_;
		    f_601_ = f_600_;
		    f_623_ = f_622_;
		    f_626_ = f_625_;
		    f_629_ = f_628_;
		    f_632_ = f_631_;
		    f_635_ = f_634_;
		    f_638_ = f_637_;
		    if (f < 0.0F) {
			f_582_ -= f_640_ * f;
			f_583_ -= f_666_ * f;
			f_585_ -= f_641_ * f;
			f_586_ -= f_667_ * f;
			f_588_ -= f_642_ * f;
			f_589_ -= f_668_ * f;
			f_591_ -= f_643_ * f;
			f_592_ -= f_669_ * f;
			f_594_ -= f_644_ * f;
			f_595_ -= f_670_ * f;
			f_600_ -= f_645_ * f;
			f_601_ -= f_671_ * f;
			f_622_ -= f_646_ * f;
			f_623_ -= f_672_ * f;
			f_625_ -= f_647_ * f;
			f_626_ -= f_673_ * f;
			f_628_ -= f_648_ * f;
			f_629_ -= f_674_ * f;
			f_631_ -= f_649_ * f;
			f_632_ -= f_675_ * f;
			f_634_ -= f_650_ * f;
			f_635_ -= f_676_ * f;
			f_637_ -= f_651_ * f;
			f_638_ -= f_677_ * f;
			f = 0.0F;
		    }
		    if (f_581_ < 0.0F) {
			f_584_ -= f_653_ * f_581_;
			f_587_ -= f_654_ * f_581_;
			f_590_ -= f_655_ * f_581_;
			f_593_ -= f_656_ * f_581_;
			f_596_ -= f_657_ * f_581_;
			f_602_ -= f_658_ * f_581_;
			f_624_ -= f_659_ * f_581_;
			f_627_ -= f_660_ * f_581_;
			f_630_ -= f_661_ * f_581_;
			f_633_ -= f_662_ * f_581_;
			f_636_ -= f_663_ * f_581_;
			f_639_ -= f_664_ * f_581_;
			f_581_ = 0.0F;
		    }
		    if (f != f_581_ && f_666_ < f_640_
			|| f == f_581_ && f_653_ > f_640_) {
			f += 0.5F;
			f_581_ += 0.5F;
			f_580_ = (float) (int) (f_580_ + 0.5F) - f_581_;
			f_581_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_581_ >= 0.0F) {
			    method2251(bool_578_, bool_579_, anIntArray1499,
				       (int) f, (int) f_583_, (int) f_582_,
				       f_586_, f_585_, f_589_, f_588_, f_592_,
				       f_591_, f_595_, f_594_, f_601_, f_600_,
				       f_623_, f_622_, f_626_, f_625_, f_629_,
				       f_628_, f_632_, f_631_, f_635_, f_634_,
				       f_638_, f_637_);
			    f_582_ += f_640_;
			    f_583_ += f_666_;
			    f_585_ += f_641_;
			    f_586_ += f_667_;
			    f_588_ += f_642_;
			    f_589_ += f_668_;
			    f_591_ += f_643_;
			    f_592_ += f_669_;
			    f_594_ += f_644_;
			    f_595_ += f_670_;
			    f_600_ += f_645_;
			    f_601_ += f_671_;
			    f_622_ += f_646_;
			    f_623_ += f_672_;
			    f_625_ += f_647_;
			    f_626_ += f_673_;
			    f_628_ += f_648_;
			    f_629_ += f_674_;
			    f_631_ += f_649_;
			    f_632_ += f_675_;
			    f_634_ += f_650_;
			    f_635_ += f_676_;
			    f_637_ += f_651_;
			    f_638_ += f_677_;
			    f += (float) anInt1498;
			}
			while (--f_580_ >= 0.0F) {
			    method2251(bool_578_, bool_579_, anIntArray1499,
				       (int) f, (int) f_584_, (int) f_582_,
				       f_587_, f_585_, f_590_, f_588_, f_593_,
				       f_591_, f_596_, f_594_, f_602_, f_600_,
				       f_624_, f_622_, f_627_, f_625_, f_630_,
				       f_628_, f_633_, f_631_, f_636_, f_634_,
				       f_639_, f_637_);
			    f_584_ += f_653_;
			    f_582_ += f_640_;
			    f_587_ += f_654_;
			    f_585_ += f_641_;
			    f_590_ += f_655_;
			    f_588_ += f_642_;
			    f_593_ += f_656_;
			    f_591_ += f_643_;
			    f_596_ += f_657_;
			    f_594_ += f_644_;
			    f_602_ += f_658_;
			    f_600_ += f_645_;
			    f_624_ += f_659_;
			    f_622_ += f_646_;
			    f_627_ += f_660_;
			    f_625_ += f_647_;
			    f_630_ += f_661_;
			    f_628_ += f_648_;
			    f_633_ += f_662_;
			    f_631_ += f_649_;
			    f_636_ += f_663_;
			    f_634_ += f_650_;
			    f_639_ += f_664_;
			    f_637_ += f_651_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_581_ += 0.5F;
			f_580_ = (float) (int) (f_580_ + 0.5F) - f_581_;
			f_581_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_581_ >= 0.0F) {
			    method2251(bool_578_, bool_579_, anIntArray1499,
				       (int) f, (int) f_582_, (int) f_583_,
				       f_585_, f_586_, f_588_, f_589_, f_591_,
				       f_592_, f_594_, f_595_, f_600_, f_601_,
				       f_622_, f_623_, f_625_, f_626_, f_628_,
				       f_629_, f_631_, f_632_, f_634_, f_635_,
				       f_637_, f_638_);
			    f_583_ += f_666_;
			    f_582_ += f_640_;
			    f_586_ += f_667_;
			    f_585_ += f_641_;
			    f_589_ += f_668_;
			    f_588_ += f_642_;
			    f_592_ += f_669_;
			    f_591_ += f_643_;
			    f_595_ += f_670_;
			    f_594_ += f_644_;
			    f_601_ += f_671_;
			    f_600_ += f_645_;
			    f_623_ += f_672_;
			    f_622_ += f_646_;
			    f_626_ += f_673_;
			    f_625_ += f_647_;
			    f_629_ += f_674_;
			    f_628_ += f_648_;
			    f_632_ += f_675_;
			    f_631_ += f_649_;
			    f_635_ += f_676_;
			    f_634_ += f_650_;
			    f_638_ += f_677_;
			    f_637_ += f_651_;
			    f += (float) anInt1498;
			}
			while (--f_580_ >= 0.0F) {
			    method2251(bool_578_, bool_579_, anIntArray1499,
				       (int) f, (int) f_582_, (int) f_584_,
				       f_585_, f_587_, f_588_, f_590_, f_591_,
				       f_593_, f_594_, f_596_, f_600_, f_602_,
				       f_622_, f_624_, f_625_, f_627_, f_628_,
				       f_630_, f_631_, f_633_, f_634_, f_636_,
				       f_637_, f_639_);
			    f_582_ += f_640_;
			    f_584_ += f_653_;
			    f_585_ += f_641_;
			    f_587_ += f_654_;
			    f_588_ += f_642_;
			    f_590_ += f_655_;
			    f_591_ += f_643_;
			    f_593_ += f_656_;
			    f_594_ += f_644_;
			    f_596_ += f_657_;
			    f_600_ += f_645_;
			    f_602_ += f_658_;
			    f_622_ += f_646_;
			    f_624_ += f_659_;
			    f_625_ += f_647_;
			    f_627_ += f_660_;
			    f_628_ += f_648_;
			    f_630_ += f_661_;
			    f_631_ += f_649_;
			    f_633_ += f_662_;
			    f_634_ += f_650_;
			    f_636_ += f_663_;
			    f_637_ += f_651_;
			    f_639_ += f_664_;
			    f += (float) anInt1498;
			}
		    }
		}
	    }
	}
    }
    
    final void method2251
	(boolean bool, boolean bool_679_, int[] is, int i, int i_680_,
	 int i_681_, float f, float f_682_, float f_683_, float f_684_,
	 float f_685_, float f_686_, float f_687_, float f_688_, float f_689_,
	 float f_690_, float f_691_, float f_692_, float f_693_, float f_694_,
	 float f_695_, float f_696_, float f_697_, float f_698_, float f_699_,
	 float f_700_, float f_701_, float f_702_) {
	int i_703_ = i_681_ - i_680_;
	float f_704_ = 1.0F / (float) i_703_;
	float f_705_ = (f_682_ - f) * f_704_;
	float f_706_ = (f_684_ - f_683_) * f_704_;
	float f_707_ = (f_686_ - f_685_) * f_704_;
	float f_708_ = (f_688_ - f_687_) * f_704_;
	float f_709_ = (f_690_ - f_689_) * f_704_;
	float f_710_ = (f_692_ - f_691_) * f_704_;
	float f_711_ = (f_694_ - f_693_) * f_704_;
	float f_712_ = (f_696_ - f_695_) * f_704_;
	float f_713_ = (f_698_ - f_697_) * f_704_;
	float f_714_ = (f_700_ - f_699_) * f_704_;
	float f_715_ = (f_702_ - f_701_) * f_704_;
	if (aBool1485) {
	    if (i_681_ > anInt1494)
		i_681_ = anInt1494;
	    if (i_680_ < 0) {
		f -= f_705_ * (float) i_680_;
		f_683_ -= f_706_ * (float) i_680_;
		f_685_ -= f_707_ * (float) i_680_;
		f_687_ -= f_708_ * (float) i_680_;
		f_689_ -= f_709_ * (float) i_680_;
		f_691_ -= f_710_ * (float) i_680_;
		f_693_ -= f_711_ * (float) i_680_;
		f_695_ -= f_712_ * (float) i_680_;
		f_697_ -= f_713_ * (float) i_680_;
		f_699_ -= f_714_ * (float) i_680_;
		f_701_ -= f_715_ * (float) i_680_;
		i_680_ = 0;
	    }
	}
	if (i_680_ < i_681_) {
	    i_703_ = i_681_ - i_680_;
	    i += i_680_;
	    while (i_703_-- > 0) {
		float f_716_ = 1.0F / f;
		float f_717_ = 1.0F / f_683_;
		if (!bool || f_716_ < aFloatArray1500[i]) {
		    float f_718_ = f_685_ * f_717_;
		    float f_719_ = f_687_ * f_717_;
		    int i_720_
			= ((int) (f_718_ * (float) anInt1504 * aFloat1506)
			   & anInt1505);
		    int i_721_
			= ((int) (f_719_ * (float) anInt1504 * aFloat1506)
			   & anInt1505);
		    int i_722_ = anIntArray1481[i_721_ * anInt1504 + i_720_];
		    i_720_ = ((int) (f_718_ * (float) anInt1512 * aFloat1514)
			      & anInt1513);
		    i_721_ = ((int) (f_719_ * (float) anInt1512 * aFloat1514)
			      & anInt1513);
		    int i_723_ = anIntArray1511[i_721_ * anInt1512 + i_720_];
		    i_720_ = ((int) (f_718_ * (float) anInt1517 * aFloat1519)
			      & anInt1509);
		    i_721_ = ((int) (f_719_ * (float) anInt1517 * aFloat1519)
			      & anInt1509);
		    int i_724_ = anIntArray1516[i_721_ * anInt1517 + i_720_];
		    float f_725_ = 1.0F - (f_699_ + f_701_);
		    i_722_
			= (~0xffffff
			   | ((int) (f_699_ * (float) (i_722_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_699_ * (float) (i_722_ >> 8 & 0xff)) << 8
			   | (int) (f_699_ * (float) (i_722_ & 0xff)));
		    i_723_
			= (~0xffffff
			   | ((int) (f_701_ * (float) (i_723_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_701_ * (float) (i_723_ >> 8 & 0xff)) << 8
			   | (int) (f_701_ * (float) (i_723_ & 0xff)));
		    i_724_
			= (~0xffffff
			   | ((int) (f_725_ * (float) (i_724_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_725_ * (float) (i_724_ >> 8 & 0xff)) << 8
			   | (int) (f_725_ * (float) (i_724_ & 0xff)));
		    int i_726_ = i_722_ + i_723_ + i_724_;
		    int i_727_
			= (~0xffffff
			   | ((int) (f_693_ * (float) (i_726_ >> 16 & 0xff))
			      << 8) & 0xff0000
			   | ((int) (f_695_ * (float) (i_726_ >> 8 & 0xff))
			      & 0xff00)
			   | (int) (f_697_ * (float) (i_726_ & 0xff)) >> 8);
		    if (f_689_ != 0.0F) {
			int i_728_ = (int) (255.0F - f_689_);
			int i_729_ = ((((anInt1501 & 0xff00ff) * (int) f_689_
					& ~0xff00ff)
				       | ((anInt1501 & 0xff00) * (int) f_689_
					  & 0xff0000))
				      >>> 8);
			i_727_ = (((i_727_ & 0xff00ff) * i_728_ & ~0xff00ff
				   | (i_727_ & 0xff00) * i_728_ & 0xff0000)
				  >>> 8) + i_729_;
		    }
		    if (bool_679_)
			is[i] = ((int) f_691_ | is[i] >> 24) << 24 | i_727_;
		    else
			is[i] = i_727_;
		    if (bool)
			aFloatArray1500[i] = f_716_;
		}
		i++;
		f += f_705_;
		f_683_ += f_706_;
		f_685_ += f_707_;
		f_687_ += f_708_;
		f_689_ += f_709_;
		f_691_ += f_710_;
		f_693_ += f_711_;
		f_695_ += f_712_;
		f_697_ += f_713_;
		f_699_ += f_714_;
		f_701_ += f_715_;
	    }
	}
    }
    
    int method2252() {
	return anIntArray1487[0] % anInt1498;
    }
    
    int method2253() {
	return anIntArray1487[0] % anInt1498;
    }
    
    int method2254() {
	return anIntArray1487[0] / anInt1498;
    }
    
    int method2255() {
	return anIntArray1487[0] / anInt1498;
    }
    
    final void method2256(boolean bool, boolean bool_730_, boolean bool_731_,
			  float f, float f_732_, float f_733_, float f_734_,
			  float f_735_, float f_736_, float f_737_,
			  float f_738_, float f_739_, int i) {
	if (aBool1510) {
	    aClass182_Sub2_1488.method3194((int) f_734_, (int) f, (int) f_735_,
					   (int) f_732_, i, -2144382417);
	    aClass182_Sub2_1488.method3194((int) f_735_, (int) f_732_,
					   (int) f_736_, (int) f_733_, i,
					   -2083107208);
	    aClass182_Sub2_1488.method3194((int) f_736_, (int) f_733_,
					   (int) f_734_, (int) f, i,
					   -1945795840);
	} else {
	    float f_740_ = f_735_ - f_734_;
	    float f_741_ = f_732_ - f;
	    float f_742_ = f_736_ - f_734_;
	    float f_743_ = f_733_ - f;
	    float f_744_ = f_738_ - f_737_;
	    float f_745_ = f_739_ - f_737_;
	    float f_746_ = 0.0F;
	    if (f_732_ != f)
		f_746_ = (f_735_ - f_734_) / (f_732_ - f);
	    float f_747_ = 0.0F;
	    if (f_733_ != f_732_)
		f_747_ = (f_736_ - f_735_) / (f_733_ - f_732_);
	    float f_748_ = 0.0F;
	    if (f_733_ != f)
		f_748_ = (f_734_ - f_736_) / (f - f_733_);
	    float f_749_ = f_740_ * f_743_ - f_742_ * f_741_;
	    if (f_749_ != 0.0F) {
		float f_750_ = (f_744_ * f_743_ - f_745_ * f_741_) / f_749_;
		float f_751_ = (f_745_ * f_740_ - f_744_ * f_742_) / f_749_;
		if (f <= f_732_ && f <= f_733_) {
		    if (!(f >= (float) anInt1495)) {
			if (f_732_ > (float) anInt1495)
			    f_732_ = (float) anInt1495;
			if (f_733_ > (float) anInt1495)
			    f_733_ = (float) anInt1495;
			f_737_ = f_737_ - f_750_ * f_734_ + f_750_;
			if (f_732_ < f_733_) {
			    f_736_ = f_734_;
			    if (f < 0.0F) {
				f_736_ -= f_748_ * f;
				f_734_ -= f_746_ * f;
				f_737_ -= f_751_ * f;
				f = 0.0F;
			    }
			    if (f_732_ < 0.0F) {
				f_735_ -= f_747_ * f_732_;
				f_732_ = 0.0F;
			    }
			    if (f != f_732_ && f_748_ < f_746_
				|| f == f_732_ && f_748_ > f_747_) {
				f += 0.5F;
				f_732_ += 0.5F;
				f_733_
				    = (float) (int) (f_733_ + 0.5F) - f_732_;
				f_732_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_732_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_736_, (int) f_734_,
					       f_737_, f_750_);
				    f_736_ += f_748_;
				    f_734_ += f_746_;
				    f_737_ += f_751_;
				    f += (float) anInt1498;
				}
				while (--f_733_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_736_, (int) f_735_,
					       f_737_, f_750_);
				    f_736_ += f_748_;
				    f_735_ += f_747_;
				    f_737_ += f_751_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_732_ += 0.5F;
				f_733_
				    = (float) (int) (f_733_ + 0.5F) - f_732_;
				f_732_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_732_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_734_, (int) f_736_,
					       f_737_, f_750_);
				    f_736_ += f_748_;
				    f_734_ += f_746_;
				    f_737_ += f_751_;
				    f += (float) anInt1498;
				}
				while (--f_733_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_735_, (int) f_736_,
					       f_737_, f_750_);
				    f_736_ += f_748_;
				    f_735_ += f_747_;
				    f_737_ += f_751_;
				    f += (float) anInt1498;
				}
			    }
			} else {
			    f_735_ = f_734_;
			    if (f < 0.0F) {
				f_735_ -= f_748_ * f;
				f_734_ -= f_746_ * f;
				f_737_ -= f_751_ * f;
				f = 0.0F;
			    }
			    if (f_733_ < 0.0F) {
				f_736_ -= f_747_ * f_733_;
				f_733_ = 0.0F;
			    }
			    if (f != f_733_ && f_748_ < f_746_
				|| f == f_733_ && f_747_ > f_746_) {
				f += 0.5F;
				f_733_ += 0.5F;
				f_732_
				    = (float) (int) (f_732_ + 0.5F) - f_733_;
				f_733_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_733_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_735_, (int) f_734_,
					       f_737_, f_750_);
				    f_735_ += f_748_;
				    f_734_ += f_746_;
				    f_737_ += f_751_;
				    f += (float) anInt1498;
				}
				while (--f_732_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_736_, (int) f_734_,
					       f_737_, f_750_);
				    f_736_ += f_747_;
				    f_734_ += f_746_;
				    f_737_ += f_751_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_733_ += 0.5F;
				f_732_
				    = (float) (int) (f_732_ + 0.5F) - f_733_;
				f_733_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_733_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_734_, (int) f_735_,
					       f_737_, f_750_);
				    f_735_ += f_748_;
				    f_734_ += f_746_;
				    f_737_ += f_751_;
				    f += (float) anInt1498;
				}
				while (--f_732_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_734_, (int) f_736_,
					       f_737_, f_750_);
				    f_736_ += f_747_;
				    f_734_ += f_746_;
				    f_737_ += f_751_;
				    f += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (f_732_ <= f_733_) {
		    if (!(f_732_ >= (float) anInt1495)) {
			if (f_733_ > (float) anInt1495)
			    f_733_ = (float) anInt1495;
			if (f > (float) anInt1495)
			    f = (float) anInt1495;
			f_738_ = f_738_ - f_750_ * f_735_ + f_750_;
			if (f_733_ < f) {
			    f_734_ = f_735_;
			    if (f_732_ < 0.0F) {
				f_734_ -= f_746_ * f_732_;
				f_735_ -= f_747_ * f_732_;
				f_738_ -= f_751_ * f_732_;
				f_732_ = 0.0F;
			    }
			    if (f_733_ < 0.0F) {
				f_736_ -= f_748_ * f_733_;
				f_733_ = 0.0F;
			    }
			    if (f_732_ != f_733_ && f_746_ < f_747_
				|| f_732_ == f_733_ && f_746_ > f_748_) {
				f_732_ += 0.5F;
				f_733_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_733_;
				f_733_ -= f_732_;
				f_732_ = (float) anIntArray1487[(int) f_732_];
				while (--f_733_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f_732_, i,
					       0, (int) f_734_, (int) f_735_,
					       f_738_, f_750_);
				    f_734_ += f_746_;
				    f_735_ += f_747_;
				    f_738_ += f_751_;
				    f_732_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f_732_, i,
					       0, (int) f_734_, (int) f_736_,
					       f_738_, f_750_);
				    f_734_ += f_746_;
				    f_736_ += f_748_;
				    f_738_ += f_751_;
				    f_732_ += (float) anInt1498;
				}
			    } else {
				f_732_ += 0.5F;
				f_733_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_733_;
				f_733_ -= f_732_;
				f_732_ = (float) anIntArray1487[(int) f_732_];
				while (--f_733_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f_732_, i,
					       0, (int) f_735_, (int) f_734_,
					       f_738_, f_750_);
				    f_734_ += f_746_;
				    f_735_ += f_747_;
				    f_738_ += f_751_;
				    f_732_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f_732_, i,
					       0, (int) f_736_, (int) f_734_,
					       f_738_, f_750_);
				    f_734_ += f_746_;
				    f_736_ += f_748_;
				    f_738_ += f_751_;
				    f_732_ += (float) anInt1498;
				}
			    }
			} else {
			    f_736_ = f_735_;
			    if (f_732_ < 0.0F) {
				f_736_ -= f_746_ * f_732_;
				f_735_ -= f_747_ * f_732_;
				f_738_ -= f_751_ * f_732_;
				f_732_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_734_ -= f_748_ * f;
				f = 0.0F;
			    }
			    if (f_746_ < f_747_) {
				f_732_ += 0.5F;
				f += 0.5F;
				f_733_ = (float) (int) (f_733_ + 0.5F) - f;
				f -= f_732_;
				f_732_ = (float) anIntArray1487[(int) f_732_];
				while (--f >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f_732_, i,
					       0, (int) f_736_, (int) f_735_,
					       f_738_, f_750_);
				    f_736_ += f_746_;
				    f_735_ += f_747_;
				    f_738_ += f_751_;
				    f_732_ += (float) anInt1498;
				}
				while (--f_733_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f_732_, i,
					       0, (int) f_734_, (int) f_735_,
					       f_738_, f_750_);
				    f_734_ += f_748_;
				    f_735_ += f_747_;
				    f_738_ += f_751_;
				    f_732_ += (float) anInt1498;
				}
			    } else {
				f_732_ += 0.5F;
				f += 0.5F;
				f_733_ = (float) (int) (f_733_ + 0.5F) - f;
				f -= f_732_;
				f_732_ = (float) anIntArray1487[(int) f_732_];
				while (--f >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f_732_, i,
					       0, (int) f_735_, (int) f_736_,
					       f_738_, f_750_);
				    f_736_ += f_746_;
				    f_735_ += f_747_;
				    f_738_ += f_751_;
				    f_732_ += (float) anInt1498;
				}
				while (--f_733_ >= 0.0F) {
				    method2247(bool, bool_730_, bool_731_,
					       anIntArray1499, (int) f_732_, i,
					       0, (int) f_735_, (int) f_734_,
					       f_738_, f_750_);
				    f_734_ += f_748_;
				    f_735_ += f_747_;
				    f_738_ += f_751_;
				    f_732_ += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (!(f_733_ >= (float) anInt1495)) {
		    if (f > (float) anInt1495)
			f = (float) anInt1495;
		    if (f_732_ > (float) anInt1495)
			f_732_ = (float) anInt1495;
		    f_739_ = f_739_ - f_750_ * f_736_ + f_750_;
		    if (f < f_732_) {
			f_735_ = f_736_;
			if (f_733_ < 0.0F) {
			    f_735_ -= f_747_ * f_733_;
			    f_736_ -= f_748_ * f_733_;
			    f_739_ -= f_751_ * f_733_;
			    f_733_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_734_ -= f_746_ * f;
			    f = 0.0F;
			}
			if (f_747_ < f_748_) {
			    f_733_ += 0.5F;
			    f += 0.5F;
			    f_732_ = (float) (int) (f_732_ + 0.5F) - f;
			    f -= f_733_;
			    f_733_ = (float) anIntArray1487[(int) f_733_];
			    while (--f >= 0.0F) {
				method2247(bool, bool_730_, bool_731_,
					   anIntArray1499, (int) f_733_, i, 0,
					   (int) f_735_, (int) f_736_, f_739_,
					   f_750_);
				f_735_ += f_747_;
				f_736_ += f_748_;
				f_739_ += f_751_;
				f_733_ += (float) anInt1498;
			    }
			    while (--f_732_ >= 0.0F) {
				method2247(bool, bool_730_, bool_731_,
					   anIntArray1499, (int) f_733_, i, 0,
					   (int) f_735_, (int) f_734_, f_739_,
					   f_750_);
				f_735_ += f_747_;
				f_734_ += f_746_;
				f_739_ += f_751_;
				f_733_ += (float) anInt1498;
			    }
			} else {
			    f_733_ += 0.5F;
			    f += 0.5F;
			    f_732_ = (float) (int) (f_732_ + 0.5F) - f;
			    f -= f_733_;
			    f_733_ = (float) anIntArray1487[(int) f_733_];
			    while (--f >= 0.0F) {
				method2247(bool, bool_730_, bool_731_,
					   anIntArray1499, (int) f_733_, i, 0,
					   (int) f_736_, (int) f_735_, f_739_,
					   f_750_);
				f_735_ += f_747_;
				f_736_ += f_748_;
				f_739_ += f_751_;
				f_733_ += (float) anInt1498;
			    }
			    while (--f_732_ >= 0.0F) {
				method2247(bool, bool_730_, bool_731_,
					   anIntArray1499, (int) f_733_, i, 0,
					   (int) f_734_, (int) f_735_, f_739_,
					   f_750_);
				f_735_ += f_747_;
				f_734_ += f_746_;
				f_739_ += f_751_;
				f_733_ += (float) anInt1498;
			    }
			}
		    } else {
			f_734_ = f_736_;
			if (f_733_ < 0.0F) {
			    f_734_ -= f_747_ * f_733_;
			    f_736_ -= f_748_ * f_733_;
			    f_739_ -= f_751_ * f_733_;
			    f_733_ = 0.0F;
			}
			if (f_732_ < 0.0F) {
			    f_735_ -= f_746_ * f_732_;
			    f_732_ = 0.0F;
			}
			if (f_747_ < f_748_) {
			    f_733_ += 0.5F;
			    f_732_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_732_;
			    f_732_ -= f_733_;
			    f_733_ = (float) anIntArray1487[(int) f_733_];
			    while (--f_732_ >= 0.0F) {
				method2247(bool, bool_730_, bool_731_,
					   anIntArray1499, (int) f_733_, i, 0,
					   (int) f_734_, (int) f_736_, f_739_,
					   f_750_);
				f_734_ += f_747_;
				f_736_ += f_748_;
				f_739_ += f_751_;
				f_733_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2247(bool, bool_730_, bool_731_,
					   anIntArray1499, (int) f_733_, i, 0,
					   (int) f_735_, (int) f_736_, f_739_,
					   f_750_);
				f_735_ += f_746_;
				f_736_ += f_748_;
				f_739_ += f_751_;
				f_733_ += (float) anInt1498;
			    }
			} else {
			    f_733_ += 0.5F;
			    f_732_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_732_;
			    f_732_ -= f_733_;
			    f_733_ = (float) anIntArray1487[(int) f_733_];
			    while (--f_732_ >= 0.0F) {
				method2247(bool, bool_730_, bool_731_,
					   anIntArray1499, (int) f_733_, i, 0,
					   (int) f_736_, (int) f_734_, f_739_,
					   f_750_);
				f_734_ += f_747_;
				f_736_ += f_748_;
				f_739_ += f_751_;
				f_733_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2247(bool, bool_730_, bool_731_,
					   anIntArray1499, (int) f_733_, i, 0,
					   (int) f_736_, (int) f_735_, f_739_,
					   f_750_);
				f_735_ += f_746_;
				f_736_ += f_748_;
				f_739_ += f_751_;
				f_733_ += (float) anInt1498;
			    }
			}
		    }
		}
	    }
	}
    }
    
    int method2257() {
	return anIntArray1487[0] / anInt1498;
    }
    
    final void method2258
	(boolean bool, boolean bool_752_, boolean bool_753_, float f,
	 float f_754_, float f_755_, float f_756_, float f_757_, float f_758_,
	 float f_759_, float f_760_, float f_761_, float f_762_, float f_763_,
	 float f_764_, float f_765_, float f_766_, float f_767_, float f_768_,
	 float f_769_, float f_770_, int i, int i_771_, int i_772_, int i_773_,
	 float f_774_, float f_775_, float f_776_, int i_777_, float f_778_,
	 int i_779_, float f_780_, int i_781_, float f_782_) {
	if (!bool)
	    method2256(false, bool_752_, bool_753_, f, f_754_, f_755_, f_756_,
		       f_757_, f_758_, f_759_, f_760_, f_761_, 0);
	else {
	    anInt1501 = i_773_;
	    if (!(f <= f_754_) || !(f <= f_755_)) {
		if (f_754_ <= f_755_) {
		    float f_783_ = f_756_;
		    f_756_ = f_757_;
		    f_757_ = f_783_;
		    f_783_ = f;
		    f = f_754_;
		    f_754_ = f_783_;
		    f_783_ = f_759_;
		    f_759_ = f_760_;
		    f_760_ = f_783_;
		    f_783_ = f_765_;
		    f_765_ = f_766_;
		    f_766_ = f_783_;
		    f_783_ = f_768_;
		    f_768_ = f_769_;
		    f_769_ = f_783_;
		    f_783_ = f_762_;
		    f_762_ = f_763_;
		    f_763_ = f_783_;
		    f_783_ = f_774_;
		    f_774_ = f_775_;
		    f_775_ = f_783_;
		    f_783_ = f_778_;
		    f_778_ = f_780_;
		    f_780_ = f_783_;
		    int i_784_ = i;
		    i = i_771_;
		    i_771_ = i_784_;
		    i_784_ = i_777_;
		    i_777_ = i_779_;
		    i_779_ = i_784_;
		} else {
		    float f_785_ = f_756_;
		    f_756_ = f_758_;
		    f_758_ = f_785_;
		    f_785_ = f;
		    f = f_755_;
		    f_755_ = f_785_;
		    f_785_ = f_759_;
		    f_759_ = f_761_;
		    f_761_ = f_785_;
		    f_785_ = f_765_;
		    f_765_ = f_767_;
		    f_767_ = f_785_;
		    f_785_ = f_768_;
		    f_768_ = f_770_;
		    f_770_ = f_785_;
		    f_785_ = f_762_;
		    f_762_ = f_764_;
		    f_764_ = f_785_;
		    f_785_ = f_774_;
		    f_774_ = f_776_;
		    f_776_ = f_785_;
		    f_785_ = f_778_;
		    f_778_ = f_782_;
		    f_782_ = f_785_;
		    int i_786_ = i;
		    i = i_772_;
		    i_772_ = i_786_;
		    i_786_ = i_777_;
		    i_777_ = i_781_;
		    i_781_ = i_786_;
		}
	    }
	    int i_787_ = i_777_ & 0xffff;
	    int i_788_ = i_779_ & 0xffff;
	    int i_789_ = i_781_ & 0xffff;
	    if (i_787_ != anInt1502) {
		anIntArray1481 = aClass182_Sub2_1488.method15165(i_787_);
		if (anIntArray1481 == null) {
		    anInt1502 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    int i_790_
			= (Class381.anIntArray3929
			   [Class504.method8313(aClass182_Sub2_1488
						    .method15168(i_777_),
						880450066) & 0xffff]);
		    int i_791_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_790_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_790_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_790_ & 0xff) >> 8);
		    method2243(true, bool_752_, bool_753_, f, f_754_, f_755_,
			       f_756_, f_757_, f_758_, f_759_, f_760_, f_761_,
			       Class637.method10513(i_791_, i_773_, f_774_,
						    1238315694),
			       Class637.method10513(i_791_, i_773_, f_775_,
						    259514427),
			       Class637.method10513(i_791_, i_773_, f_776_,
						    1166624773));
		    return;
		}
		anInt1502 = i_787_;
		anInt1504 = aClass182_Sub2_1488.method15209(i_777_);
		anInt1505 = anInt1504 - 1;
		aClass597_1507 = aClass182_Sub2_1488.method15166(i_777_);
	    }
	    aFloat1506 = f_778_;
	    if (i_788_ != anInt1508) {
		anIntArray1511 = aClass182_Sub2_1488.method15165(i_788_);
		if (anIntArray1511 == null) {
		    anInt1508 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    int i_792_
			= (Class381.anIntArray3929
			   [Class504.method8313(aClass182_Sub2_1488
						    .method15168(i_779_),
						1481386754) & 0xffff]);
		    int i_793_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_792_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_792_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_792_ & 0xff) >> 8);
		    method2243(true, bool_752_, bool_753_, f, f_754_, f_755_,
			       f_756_, f_757_, f_758_, f_759_, f_760_, f_761_,
			       Class637.method10513(i_793_, i_773_, f_774_,
						    -1412052774),
			       Class637.method10513(i_793_, i_773_, f_775_,
						    1525553519),
			       Class637.method10513(i_793_, i_773_, f_776_,
						    -93717898));
		    return;
		}
		anInt1508 = i_788_;
		anInt1512 = aClass182_Sub2_1488.method15209(i_779_);
		anInt1513 = anInt1512 - 1;
	    }
	    aFloat1514 = f_780_;
	    if (i_789_ != anInt1515) {
		anIntArray1516 = aClass182_Sub2_1488.method15165(i_789_);
		if (anIntArray1516 == null) {
		    anInt1515 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    int i_794_
			= (Class381.anIntArray3929
			   [Class504.method8313(aClass182_Sub2_1488
						    .method15168(i_781_),
						1433852443) & 0xffff]);
		    int i_795_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_794_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_794_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_794_ & 0xff) >> 8);
		    method2243(true, bool_752_, bool_753_, (float) (int) f,
			       (float) (int) f_754_, (float) (int) f_755_,
			       (float) (int) f_756_, (float) (int) f_757_,
			       (float) (int) f_758_, (float) (int) f_759_,
			       (float) (int) f_760_, (float) (int) f_761_,
			       Class637.method10513(i_795_, i_773_, f_774_,
						    1981686487),
			       Class637.method10513(i_795_, i_773_, f_775_,
						    610561200),
			       Class637.method10513(i_795_, i_773_, f_776_,
						    484981432));
		    return;
		}
		anInt1515 = i_789_;
		anInt1517 = aClass182_Sub2_1488.method15209(i_781_);
		anInt1509 = anInt1517 - 1;
	    }
	    aFloat1519 = f_782_;
	    f_765_ /= f_762_;
	    f_766_ /= f_763_;
	    f_767_ /= f_764_;
	    f_768_ /= f_762_;
	    f_769_ /= f_763_;
	    f_770_ /= f_764_;
	    f_759_ = 1.0F / f_759_;
	    f_760_ = 1.0F / f_760_;
	    f_761_ = 1.0F / f_761_;
	    f_762_ = 1.0F / f_762_;
	    f_763_ = 1.0F / f_763_;
	    f_764_ = 1.0F / f_764_;
	    float f_796_ = (float) (i >> 24 & 0xff);
	    float f_797_ = (float) (i_771_ >> 24 & 0xff);
	    float f_798_ = (float) (i_772_ >> 24 & 0xff);
	    float f_799_ = (float) (i >> 16 & 0xff);
	    float f_800_ = (float) (i_771_ >> 16 & 0xff);
	    float f_801_ = (float) (i_772_ >> 16 & 0xff);
	    float f_802_ = (float) (i >> 8 & 0xff);
	    float f_803_ = (float) (i_771_ >> 8 & 0xff);
	    float f_804_ = (float) (i_772_ >> 8 & 0xff);
	    float f_805_ = (float) (i & 0xff);
	    float f_806_ = (float) (i_771_ & 0xff);
	    float f_807_ = (float) (i_772_ & 0xff);
	    float f_808_ = 1.0F;
	    float f_809_ = 0.0F;
	    float f_810_ = 0.0F;
	    float f_811_ = 0.0F;
	    float f_812_ = 1.0F;
	    float f_813_ = 0.0F;
	    float f_814_ = 0.0F;
	    float f_815_ = 0.0F;
	    float f_816_ = 0.0F;
	    float f_817_ = 0.0F;
	    float f_818_ = 0.0F;
	    float f_819_ = 0.0F;
	    float f_820_ = 0.0F;
	    float f_821_ = 0.0F;
	    float f_822_ = 0.0F;
	    float f_823_ = 0.0F;
	    float f_824_ = 0.0F;
	    float f_825_ = 0.0F;
	    if (f_754_ != f) {
		float f_826_ = f_754_ - f;
		f_814_ = (f_757_ - f_756_) / f_826_;
		f_815_ = (f_760_ - f_759_) / f_826_;
		f_816_ = (f_763_ - f_762_) / f_826_;
		f_817_ = (f_766_ - f_765_) / f_826_;
		f_818_ = (f_769_ - f_768_) / f_826_;
		f_819_ = (f_775_ - f_774_) / f_826_;
		f_820_ = (f_797_ - f_796_) / f_826_;
		f_821_ = (f_800_ - f_799_) / f_826_;
		f_822_ = (f_803_ - f_802_) / f_826_;
		f_823_ = (f_806_ - f_805_) / f_826_;
		f_824_ = (f_809_ - f_808_) / f_826_;
		f_825_ = (f_812_ - f_811_) / f_826_;
	    }
	    float f_827_ = 0.0F;
	    float f_828_ = 0.0F;
	    float f_829_ = 0.0F;
	    float f_830_ = 0.0F;
	    float f_831_ = 0.0F;
	    float f_832_ = 0.0F;
	    float f_833_ = 0.0F;
	    float f_834_ = 0.0F;
	    float f_835_ = 0.0F;
	    float f_836_ = 0.0F;
	    float f_837_ = 0.0F;
	    float f_838_ = 0.0F;
	    if (f_755_ != f_754_) {
		float f_839_ = f_755_ - f_754_;
		f_827_ = (f_758_ - f_757_) / f_839_;
		f_828_ = (f_761_ - f_760_) / f_839_;
		f_829_ = (f_764_ - f_763_) / f_839_;
		f_830_ = (f_767_ - f_766_) / f_839_;
		f_831_ = (f_770_ - f_769_) / f_839_;
		f_832_ = (f_776_ - f_775_) / f_839_;
		f_833_ = (f_798_ - f_797_) / f_839_;
		f_834_ = (f_801_ - f_800_) / f_839_;
		f_835_ = (f_804_ - f_803_) / f_839_;
		f_836_ = (f_807_ - f_806_) / f_839_;
		f_837_ = (f_810_ - f_809_) / f_839_;
		f_838_ = (f_813_ - f_812_) / f_839_;
	    }
	    float f_840_ = 0.0F;
	    float f_841_ = 0.0F;
	    float f_842_ = 0.0F;
	    float f_843_ = 0.0F;
	    float f_844_ = 0.0F;
	    float f_845_ = 0.0F;
	    float f_846_ = 0.0F;
	    float f_847_ = 0.0F;
	    float f_848_ = 0.0F;
	    float f_849_ = 0.0F;
	    float f_850_ = 0.0F;
	    float f_851_ = 0.0F;
	    if (f != f_755_) {
		float f_852_ = f - f_755_;
		f_840_ = (f_756_ - f_758_) / f_852_;
		f_841_ = (f_759_ - f_761_) / f_852_;
		f_842_ = (f_762_ - f_764_) / f_852_;
		f_843_ = (f_765_ - f_767_) / f_852_;
		f_844_ = (f_768_ - f_770_) / f_852_;
		f_845_ = (f_774_ - f_776_) / f_852_;
		f_846_ = (f_796_ - f_798_) / f_852_;
		f_847_ = (f_799_ - f_801_) / f_852_;
		f_848_ = (f_802_ - f_804_) / f_852_;
		f_849_ = (f_805_ - f_807_) / f_852_;
		f_850_ = (f_808_ - f_810_) / f_852_;
		f_851_ = (f_811_ - f_813_) / f_852_;
	    }
	    if (!(f >= (float) anInt1495)) {
		if (f_754_ > (float) anInt1495)
		    f_754_ = (float) anInt1495;
		if (f_755_ > (float) anInt1495)
		    f_755_ = (float) anInt1495;
		if (f_754_ < f_755_) {
		    f_758_ = f_756_;
		    f_761_ = f_759_;
		    f_764_ = f_762_;
		    f_767_ = f_765_;
		    f_770_ = f_768_;
		    f_776_ = f_774_;
		    f_798_ = f_796_;
		    f_801_ = f_799_;
		    f_804_ = f_802_;
		    f_807_ = f_805_;
		    f_810_ = f_808_;
		    f_813_ = f_811_;
		    if (f < 0.0F) {
			f_756_ -= f_814_ * f;
			f_758_ -= f_840_ * f;
			f_759_ -= f_815_ * f;
			f_761_ -= f_841_ * f;
			f_762_ -= f_816_ * f;
			f_764_ -= f_842_ * f;
			f_765_ -= f_817_ * f;
			f_767_ -= f_843_ * f;
			f_768_ -= f_818_ * f;
			f_770_ -= f_844_ * f;
			f_774_ -= f_819_ * f;
			f_776_ -= f_845_ * f;
			f_796_ -= f_820_ * f;
			f_798_ -= f_846_ * f;
			f_799_ -= f_821_ * f;
			f_801_ -= f_847_ * f;
			f_802_ -= f_822_ * f;
			f_804_ -= f_848_ * f;
			f_805_ -= f_823_ * f;
			f_807_ -= f_849_ * f;
			f_808_ -= f_824_ * f;
			f_810_ -= f_850_ * f;
			f_811_ -= f_825_ * f;
			f_813_ -= f_851_ * f;
			f = 0.0F;
		    }
		    if (f_754_ < 0.0F) {
			f_757_ -= f_827_ * f_754_;
			f_760_ -= f_828_ * f_754_;
			f_763_ -= f_829_ * f_754_;
			f_766_ -= f_830_ * f_754_;
			f_769_ -= f_831_ * f_754_;
			f_775_ -= f_832_ * f_754_;
			f_797_ -= f_833_ * f_754_;
			f_800_ -= f_834_ * f_754_;
			f_803_ -= f_835_ * f_754_;
			f_806_ -= f_836_ * f_754_;
			f_809_ -= f_837_ * f_754_;
			f_812_ -= f_838_ * f_754_;
			f_754_ = 0.0F;
		    }
		    if (f != f_754_ && f_840_ < f_814_
			|| f == f_754_ && f_840_ > f_827_) {
			f += 0.5F;
			f_754_ += 0.5F;
			f_755_ = (float) (int) (f_755_ + 0.5F) - f_754_;
			f_754_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_754_ >= 0.0F) {
			    method2251(bool_752_, bool_753_, anIntArray1499,
				       (int) f, (int) f_758_, (int) f_756_,
				       f_761_, f_759_, f_764_, f_762_, f_767_,
				       f_765_, f_770_, f_768_, f_776_, f_774_,
				       f_798_, f_796_, f_801_, f_799_, f_804_,
				       f_802_, f_807_, f_805_, f_810_, f_808_,
				       f_813_, f_811_);
			    f_756_ += f_814_;
			    f_758_ += f_840_;
			    f_759_ += f_815_;
			    f_761_ += f_841_;
			    f_762_ += f_816_;
			    f_764_ += f_842_;
			    f_765_ += f_817_;
			    f_767_ += f_843_;
			    f_768_ += f_818_;
			    f_770_ += f_844_;
			    f_774_ += f_819_;
			    f_776_ += f_845_;
			    f_796_ += f_820_;
			    f_798_ += f_846_;
			    f_799_ += f_821_;
			    f_801_ += f_847_;
			    f_802_ += f_822_;
			    f_804_ += f_848_;
			    f_805_ += f_823_;
			    f_807_ += f_849_;
			    f_808_ += f_824_;
			    f_810_ += f_850_;
			    f_811_ += f_825_;
			    f_813_ += f_851_;
			    f += (float) anInt1498;
			}
			while (--f_755_ >= 0.0F) {
			    method2251(bool_752_, bool_753_, anIntArray1499,
				       (int) f, (int) f_758_, (int) f_757_,
				       f_761_, f_760_, f_764_, f_763_, f_767_,
				       f_766_, f_770_, f_769_, f_776_, f_775_,
				       f_798_, f_797_, f_801_, f_800_, f_804_,
				       f_803_, f_807_, f_806_, f_810_, f_809_,
				       f_813_, f_812_);
			    f_757_ += f_827_;
			    f_758_ += f_840_;
			    f_760_ += f_828_;
			    f_761_ += f_841_;
			    f_763_ += f_829_;
			    f_764_ += f_842_;
			    f_766_ += f_830_;
			    f_767_ += f_843_;
			    f_769_ += f_831_;
			    f_770_ += f_844_;
			    f_775_ += f_832_;
			    f_776_ += f_845_;
			    f_797_ += f_833_;
			    f_798_ += f_846_;
			    f_800_ += f_834_;
			    f_801_ += f_847_;
			    f_803_ += f_835_;
			    f_804_ += f_848_;
			    f_806_ += f_836_;
			    f_807_ += f_849_;
			    f_809_ += f_837_;
			    f_810_ += f_850_;
			    f_812_ += f_838_;
			    f_813_ += f_851_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_754_ += 0.5F;
			f_755_ = (float) (int) (f_755_ + 0.5F) - f_754_;
			f_754_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_754_ >= 0.0F) {
			    method2251(bool_752_, bool_753_, anIntArray1499,
				       (int) f, (int) f_756_, (int) f_758_,
				       f_759_, f_761_, f_762_, f_764_, f_765_,
				       f_767_, f_768_, f_770_, f_774_, f_776_,
				       f_796_, f_798_, f_799_, f_801_, f_802_,
				       f_804_, f_805_, f_807_, f_808_, f_810_,
				       f_811_, f_813_);
			    f_756_ += f_814_;
			    f_758_ += f_840_;
			    f_759_ += f_815_;
			    f_761_ += f_841_;
			    f_762_ += f_816_;
			    f_764_ += f_842_;
			    f_765_ += f_817_;
			    f_767_ += f_843_;
			    f_768_ += f_818_;
			    f_770_ += f_844_;
			    f_774_ += f_819_;
			    f_776_ += f_845_;
			    f_796_ += f_820_;
			    f_798_ += f_846_;
			    f_799_ += f_821_;
			    f_801_ += f_847_;
			    f_802_ += f_822_;
			    f_804_ += f_848_;
			    f_805_ += f_823_;
			    f_807_ += f_849_;
			    f_808_ += f_824_;
			    f_810_ += f_850_;
			    f_811_ += f_825_;
			    f_813_ += f_851_;
			    f += (float) anInt1498;
			}
			while (--f_755_ >= 0.0F) {
			    method2251(bool_752_, bool_753_, anIntArray1499,
				       (int) f, (int) f_757_, (int) f_758_,
				       f_760_, f_761_, f_763_, f_764_, f_766_,
				       f_767_, f_769_, f_770_, f_775_, f_776_,
				       f_797_, f_798_, f_800_, f_801_, f_803_,
				       f_804_, f_806_, f_807_, f_809_, f_810_,
				       f_812_, f_813_);
			    f_757_ += f_827_;
			    f_758_ += f_840_;
			    f_760_ += f_828_;
			    f_761_ += f_841_;
			    f_763_ += f_829_;
			    f_764_ += f_842_;
			    f_766_ += f_830_;
			    f_767_ += f_843_;
			    f_769_ += f_831_;
			    f_770_ += f_844_;
			    f_775_ += f_832_;
			    f_776_ += f_845_;
			    f_797_ += f_833_;
			    f_798_ += f_846_;
			    f_800_ += f_834_;
			    f_801_ += f_847_;
			    f_803_ += f_835_;
			    f_804_ += f_848_;
			    f_806_ += f_836_;
			    f_807_ += f_849_;
			    f_809_ += f_837_;
			    f_810_ += f_850_;
			    f_812_ += f_838_;
			    f_813_ += f_851_;
			    f += (float) anInt1498;
			}
		    }
		} else {
		    f_757_ = f_756_;
		    f_760_ = f_759_;
		    f_763_ = f_762_;
		    f_766_ = f_765_;
		    f_769_ = f_768_;
		    f_775_ = f_774_;
		    f_797_ = f_796_;
		    f_800_ = f_799_;
		    f_803_ = f_802_;
		    f_806_ = f_805_;
		    f_809_ = f_808_;
		    f_812_ = f_811_;
		    if (f < 0.0F) {
			f_756_ -= f_814_ * f;
			f_757_ -= f_840_ * f;
			f_759_ -= f_815_ * f;
			f_760_ -= f_841_ * f;
			f_762_ -= f_816_ * f;
			f_763_ -= f_842_ * f;
			f_765_ -= f_817_ * f;
			f_766_ -= f_843_ * f;
			f_768_ -= f_818_ * f;
			f_769_ -= f_844_ * f;
			f_774_ -= f_819_ * f;
			f_775_ -= f_845_ * f;
			f_796_ -= f_820_ * f;
			f_797_ -= f_846_ * f;
			f_799_ -= f_821_ * f;
			f_800_ -= f_847_ * f;
			f_802_ -= f_822_ * f;
			f_803_ -= f_848_ * f;
			f_805_ -= f_823_ * f;
			f_806_ -= f_849_ * f;
			f_808_ -= f_824_ * f;
			f_809_ -= f_850_ * f;
			f_811_ -= f_825_ * f;
			f_812_ -= f_851_ * f;
			f = 0.0F;
		    }
		    if (f_755_ < 0.0F) {
			f_758_ -= f_827_ * f_755_;
			f_761_ -= f_828_ * f_755_;
			f_764_ -= f_829_ * f_755_;
			f_767_ -= f_830_ * f_755_;
			f_770_ -= f_831_ * f_755_;
			f_776_ -= f_832_ * f_755_;
			f_798_ -= f_833_ * f_755_;
			f_801_ -= f_834_ * f_755_;
			f_804_ -= f_835_ * f_755_;
			f_807_ -= f_836_ * f_755_;
			f_810_ -= f_837_ * f_755_;
			f_813_ -= f_838_ * f_755_;
			f_755_ = 0.0F;
		    }
		    if (f != f_755_ && f_840_ < f_814_
			|| f == f_755_ && f_827_ > f_814_) {
			f += 0.5F;
			f_755_ += 0.5F;
			f_754_ = (float) (int) (f_754_ + 0.5F) - f_755_;
			f_755_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_755_ >= 0.0F) {
			    method2251(bool_752_, bool_753_, anIntArray1499,
				       (int) f, (int) f_757_, (int) f_756_,
				       f_760_, f_759_, f_763_, f_762_, f_766_,
				       f_765_, f_769_, f_768_, f_775_, f_774_,
				       f_797_, f_796_, f_800_, f_799_, f_803_,
				       f_802_, f_806_, f_805_, f_809_, f_808_,
				       f_812_, f_811_);
			    f_756_ += f_814_;
			    f_757_ += f_840_;
			    f_759_ += f_815_;
			    f_760_ += f_841_;
			    f_762_ += f_816_;
			    f_763_ += f_842_;
			    f_765_ += f_817_;
			    f_766_ += f_843_;
			    f_768_ += f_818_;
			    f_769_ += f_844_;
			    f_774_ += f_819_;
			    f_775_ += f_845_;
			    f_796_ += f_820_;
			    f_797_ += f_846_;
			    f_799_ += f_821_;
			    f_800_ += f_847_;
			    f_802_ += f_822_;
			    f_803_ += f_848_;
			    f_805_ += f_823_;
			    f_806_ += f_849_;
			    f_808_ += f_824_;
			    f_809_ += f_850_;
			    f_811_ += f_825_;
			    f_812_ += f_851_;
			    f += (float) anInt1498;
			}
			while (--f_754_ >= 0.0F) {
			    method2251(bool_752_, bool_753_, anIntArray1499,
				       (int) f, (int) f_758_, (int) f_756_,
				       f_761_, f_759_, f_764_, f_762_, f_767_,
				       f_765_, f_770_, f_768_, f_776_, f_774_,
				       f_798_, f_796_, f_801_, f_799_, f_804_,
				       f_802_, f_807_, f_805_, f_810_, f_808_,
				       f_813_, f_811_);
			    f_758_ += f_827_;
			    f_756_ += f_814_;
			    f_761_ += f_828_;
			    f_759_ += f_815_;
			    f_764_ += f_829_;
			    f_762_ += f_816_;
			    f_767_ += f_830_;
			    f_765_ += f_817_;
			    f_770_ += f_831_;
			    f_768_ += f_818_;
			    f_776_ += f_832_;
			    f_774_ += f_819_;
			    f_798_ += f_833_;
			    f_796_ += f_820_;
			    f_801_ += f_834_;
			    f_799_ += f_821_;
			    f_804_ += f_835_;
			    f_802_ += f_822_;
			    f_807_ += f_836_;
			    f_805_ += f_823_;
			    f_810_ += f_837_;
			    f_808_ += f_824_;
			    f_813_ += f_838_;
			    f_811_ += f_825_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_755_ += 0.5F;
			f_754_ = (float) (int) (f_754_ + 0.5F) - f_755_;
			f_755_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_755_ >= 0.0F) {
			    method2251(bool_752_, bool_753_, anIntArray1499,
				       (int) f, (int) f_756_, (int) f_757_,
				       f_759_, f_760_, f_762_, f_763_, f_765_,
				       f_766_, f_768_, f_769_, f_774_, f_775_,
				       f_796_, f_797_, f_799_, f_800_, f_802_,
				       f_803_, f_805_, f_806_, f_808_, f_809_,
				       f_811_, f_812_);
			    f_757_ += f_840_;
			    f_756_ += f_814_;
			    f_760_ += f_841_;
			    f_759_ += f_815_;
			    f_763_ += f_842_;
			    f_762_ += f_816_;
			    f_766_ += f_843_;
			    f_765_ += f_817_;
			    f_769_ += f_844_;
			    f_768_ += f_818_;
			    f_775_ += f_845_;
			    f_774_ += f_819_;
			    f_797_ += f_846_;
			    f_796_ += f_820_;
			    f_800_ += f_847_;
			    f_799_ += f_821_;
			    f_803_ += f_848_;
			    f_802_ += f_822_;
			    f_806_ += f_849_;
			    f_805_ += f_823_;
			    f_809_ += f_850_;
			    f_808_ += f_824_;
			    f_812_ += f_851_;
			    f_811_ += f_825_;
			    f += (float) anInt1498;
			}
			while (--f_754_ >= 0.0F) {
			    method2251(bool_752_, bool_753_, anIntArray1499,
				       (int) f, (int) f_756_, (int) f_758_,
				       f_759_, f_761_, f_762_, f_764_, f_765_,
				       f_767_, f_768_, f_770_, f_774_, f_776_,
				       f_796_, f_798_, f_799_, f_801_, f_802_,
				       f_804_, f_805_, f_807_, f_808_, f_810_,
				       f_811_, f_813_);
			    f_756_ += f_814_;
			    f_758_ += f_827_;
			    f_759_ += f_815_;
			    f_761_ += f_828_;
			    f_762_ += f_816_;
			    f_764_ += f_829_;
			    f_765_ += f_817_;
			    f_767_ += f_830_;
			    f_768_ += f_818_;
			    f_770_ += f_831_;
			    f_774_ += f_819_;
			    f_776_ += f_832_;
			    f_796_ += f_820_;
			    f_798_ += f_833_;
			    f_799_ += f_821_;
			    f_801_ += f_834_;
			    f_802_ += f_822_;
			    f_804_ += f_835_;
			    f_805_ += f_823_;
			    f_807_ += f_836_;
			    f_808_ += f_824_;
			    f_810_ += f_837_;
			    f_811_ += f_825_;
			    f_813_ += f_838_;
			    f += (float) anInt1498;
			}
		    }
		}
	    }
	}
    }
    
    final void method2259(boolean bool, boolean bool_853_, boolean bool_854_,
			  float f, float f_855_, float f_856_, float f_857_,
			  float f_858_, float f_859_, float f_860_,
			  float f_861_, float f_862_, float f_863_,
			  float f_864_, float f_865_) {
	if (!bool)
	    method2256(false, bool_853_, bool_854_, f, f_855_, f_856_, f_857_,
		       f_858_, f_859_, f_860_, f_861_, f_862_, 0);
	else if (aBool1510) {
	    aClass182_Sub2_1488.method3194((int) f_857_, (int) f, (int) f_858_,
					   (int) f_855_,
					   (Class381.anIntArray3929
					    [(int) f_863_ & 0xffff]),
					   -2141264866);
	    aClass182_Sub2_1488.method3194((int) f_858_, (int) f_855_,
					   (int) f_859_, (int) f_856_,
					   (Class381.anIntArray3929
					    [(int) f_863_ & 0xffff]),
					   -2132748830);
	    aClass182_Sub2_1488.method3194((int) f_859_, (int) f_856_,
					   (int) f_857_, (int) f,
					   (Class381.anIntArray3929
					    [(int) f_863_ & 0xffff]),
					   -2123285836);
	} else {
	    float f_866_ = f_858_ - f_857_;
	    float f_867_ = f_855_ - f;
	    float f_868_ = f_859_ - f_857_;
	    float f_869_ = f_856_ - f;
	    float f_870_ = f_864_ - f_863_;
	    float f_871_ = f_865_ - f_863_;
	    float f_872_ = f_861_ - f_860_;
	    float f_873_ = f_862_ - f_860_;
	    float f_874_;
	    if (f_856_ != f_855_)
		f_874_ = (f_859_ - f_858_) / (f_856_ - f_855_);
	    else
		f_874_ = 0.0F;
	    float f_875_;
	    if (f_855_ != f)
		f_875_ = f_866_ / f_867_;
	    else
		f_875_ = 0.0F;
	    float f_876_;
	    if (f_856_ != f)
		f_876_ = f_868_ / f_869_;
	    else
		f_876_ = 0.0F;
	    float f_877_ = f_866_ * f_869_ - f_868_ * f_867_;
	    if (f_877_ != 0.0F) {
		float f_878_ = (f_870_ * f_869_ - f_871_ * f_867_) / f_877_;
		float f_879_ = (f_871_ * f_866_ - f_870_ * f_868_) / f_877_;
		float f_880_ = (f_872_ * f_869_ - f_873_ * f_867_) / f_877_;
		float f_881_ = (f_873_ * f_866_ - f_872_ * f_868_) / f_877_;
		if (f <= f_855_ && f <= f_856_) {
		    if (!(f >= (float) anInt1495)) {
			if (f_855_ > (float) anInt1495)
			    f_855_ = (float) anInt1495;
			if (f_856_ > (float) anInt1495)
			    f_856_ = (float) anInt1495;
			f_863_ = f_863_ - f_878_ * f_857_ + f_878_;
			f_860_ = f_860_ - f_880_ * f_857_ + f_880_;
			if (f_855_ < f_856_) {
			    f_859_ = f_857_;
			    if (f < 0.0F) {
				f_859_ -= f_876_ * f;
				f_857_ -= f_875_ * f;
				f_863_ -= f_879_ * f;
				f_860_ -= f_881_ * f;
				f = 0.0F;
			    }
			    if (f_855_ < 0.0F) {
				f_858_ -= f_874_ * f_855_;
				f_855_ = 0.0F;
			    }
			    if (f != f_855_ && f_876_ < f_875_
				|| f == f_855_ && f_876_ > f_874_) {
				f += 0.5F;
				f_855_ += 0.5F;
				f_856_
				    = (float) (int) (f_856_ + 0.5F) - f_855_;
				f_855_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_855_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_859_, (int) f_857_,
					       f_863_, f_878_, f_860_, f_880_);
				    f_859_ += f_876_;
				    f_857_ += f_875_;
				    f_863_ += f_879_;
				    f_860_ += f_881_;
				    f += (float) anInt1498;
				}
				while (--f_856_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_859_, (int) f_858_,
					       f_863_, f_878_, f_860_, f_880_);
				    f_859_ += f_876_;
				    f_858_ += f_874_;
				    f_863_ += f_879_;
				    f_860_ += f_881_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_855_ += 0.5F;
				f_856_
				    = (float) (int) (f_856_ + 0.5F) - f_855_;
				f_855_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_855_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_857_, (int) f_859_,
					       f_863_, f_878_, f_860_, f_880_);
				    f_859_ += f_876_;
				    f_857_ += f_875_;
				    f_863_ += f_879_;
				    f_860_ += f_881_;
				    f += (float) anInt1498;
				}
				while (--f_856_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_858_, (int) f_859_,
					       f_863_, f_878_, f_860_, f_880_);
				    f_859_ += f_876_;
				    f_858_ += f_874_;
				    f_863_ += f_879_;
				    f_860_ += f_881_;
				    f += (float) anInt1498;
				}
			    }
			} else {
			    f_858_ = f_857_;
			    if (f < 0.0F) {
				f_858_ -= f_876_ * f;
				f_857_ -= f_875_ * f;
				f_863_ -= f_879_ * f;
				f_860_ -= f_881_ * f;
				f = 0.0F;
			    }
			    if (f_856_ < 0.0F) {
				f_859_ -= f_874_ * f_856_;
				f_856_ = 0.0F;
			    }
			    if (f != f_856_ && f_876_ < f_875_
				|| f == f_856_ && f_874_ > f_875_) {
				f += 0.5F;
				f_856_ += 0.5F;
				f_855_
				    = (float) (int) (f_855_ + 0.5F) - f_856_;
				f_856_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_856_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_858_, (int) f_857_,
					       f_863_, f_878_, f_860_, f_880_);
				    f_858_ += f_876_;
				    f_857_ += f_875_;
				    f_863_ += f_879_;
				    f_860_ += f_881_;
				    f += (float) anInt1498;
				}
				while (--f_855_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_859_, (int) f_857_,
					       f_863_, f_878_, f_860_, f_880_);
				    f_859_ += f_874_;
				    f_857_ += f_875_;
				    f_863_ += f_879_;
				    f_860_ += f_881_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_856_ += 0.5F;
				f_855_
				    = (float) (int) (f_855_ + 0.5F) - f_856_;
				f_856_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_856_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_857_, (int) f_858_,
					       f_863_, f_878_, f_860_, f_880_);
				    f_858_ += f_876_;
				    f_857_ += f_875_;
				    f_863_ += f_879_;
				    f_860_ += f_881_;
				    f += (float) anInt1498;
				}
				while (--f_855_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_857_, (int) f_859_,
					       f_863_, f_878_, f_860_, f_880_);
				    f_859_ += f_874_;
				    f_857_ += f_875_;
				    f_863_ += f_879_;
				    f_860_ += f_881_;
				    f += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (f_855_ <= f_856_) {
		    if (!(f_855_ >= (float) anInt1495)) {
			if (f_856_ > (float) anInt1495)
			    f_856_ = (float) anInt1495;
			if (f > (float) anInt1495)
			    f = (float) anInt1495;
			f_864_ = f_864_ - f_878_ * f_858_ + f_878_;
			f_861_ = f_861_ - f_880_ * f_858_ + f_880_;
			if (f_856_ < f) {
			    f_857_ = f_858_;
			    if (f_855_ < 0.0F) {
				f_857_ -= f_875_ * f_855_;
				f_858_ -= f_874_ * f_855_;
				f_864_ -= f_879_ * f_855_;
				f_861_ -= f_881_ * f_855_;
				f_855_ = 0.0F;
			    }
			    if (f_856_ < 0.0F) {
				f_859_ -= f_876_ * f_856_;
				f_856_ = 0.0F;
			    }
			    if (f_855_ != f_856_ && f_875_ < f_874_
				|| f_855_ == f_856_ && f_875_ > f_876_) {
				f_855_ += 0.5F;
				f_856_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_856_;
				f_856_ -= f_855_;
				f_855_ = (float) anIntArray1487[(int) f_855_];
				while (--f_856_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f_855_, 0,
					       0, (int) f_857_, (int) f_858_,
					       f_864_, f_878_, f_861_, f_880_);
				    f_857_ += f_875_;
				    f_858_ += f_874_;
				    f_864_ += f_879_;
				    f_861_ += f_881_;
				    f_855_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f_855_, 0,
					       0, (int) f_857_, (int) f_859_,
					       f_864_, f_878_, f_861_, f_880_);
				    f_857_ += f_875_;
				    f_859_ += f_876_;
				    f_864_ += f_879_;
				    f_861_ += f_881_;
				    f_855_ += (float) anInt1498;
				}
			    } else {
				f_855_ += 0.5F;
				f_856_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_856_;
				f_856_ -= f_855_;
				f_855_ = (float) anIntArray1487[(int) f_855_];
				while (--f_856_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f_855_, 0,
					       0, (int) f_858_, (int) f_857_,
					       f_864_, f_878_, f_861_, f_880_);
				    f_857_ += f_875_;
				    f_858_ += f_874_;
				    f_864_ += f_879_;
				    f_861_ += f_881_;
				    f_855_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f_855_, 0,
					       0, (int) f_859_, (int) f_857_,
					       f_864_, f_878_, f_861_, f_880_);
				    f_857_ += f_875_;
				    f_859_ += f_876_;
				    f_864_ += f_879_;
				    f_861_ += f_881_;
				    f_855_ += (float) anInt1498;
				}
			    }
			} else {
			    f_859_ = f_858_;
			    if (f_855_ < 0.0F) {
				f_859_ -= f_875_ * f_855_;
				f_858_ -= f_874_ * f_855_;
				f_864_ -= f_879_ * f_855_;
				f_861_ -= f_881_ * f_855_;
				f_855_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_857_ -= f_876_ * f;
				f = 0.0F;
			    }
			    if (f_875_ < f_874_) {
				f_855_ += 0.5F;
				f += 0.5F;
				f_856_ = (float) (int) (f_856_ + 0.5F) - f;
				f -= f_855_;
				f_855_ = (float) anIntArray1487[(int) f_855_];
				while (--f >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f_855_, 0,
					       0, (int) f_859_, (int) f_858_,
					       f_864_, f_878_, f_861_, f_880_);
				    f_859_ += f_875_;
				    f_858_ += f_874_;
				    f_864_ += f_879_;
				    f_861_ += f_881_;
				    f_855_ += (float) anInt1498;
				}
				while (--f_856_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f_855_, 0,
					       0, (int) f_857_, (int) f_858_,
					       f_864_, f_878_, f_861_, f_880_);
				    f_857_ += f_876_;
				    f_858_ += f_874_;
				    f_864_ += f_879_;
				    f_861_ += f_881_;
				    f_855_ += (float) anInt1498;
				}
			    } else {
				f_855_ += 0.5F;
				f += 0.5F;
				f_856_ = (float) (int) (f_856_ + 0.5F) - f;
				f -= f_855_;
				f_855_ = (float) anIntArray1487[(int) f_855_];
				while (--f >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f_855_, 0,
					       0, (int) f_858_, (int) f_859_,
					       f_864_, f_878_, f_861_, f_880_);
				    f_859_ += f_875_;
				    f_858_ += f_874_;
				    f_864_ += f_879_;
				    f_861_ += f_881_;
				    f_855_ += (float) anInt1498;
				}
				while (--f_856_ >= 0.0F) {
				    method2244(bool_853_, bool_854_,
					       anIntArray1499, (int) f_855_, 0,
					       0, (int) f_858_, (int) f_857_,
					       f_864_, f_878_, f_861_, f_880_);
				    f_857_ += f_876_;
				    f_858_ += f_874_;
				    f_864_ += f_879_;
				    f_861_ += f_881_;
				    f_855_ += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (!(f_856_ >= (float) anInt1495)) {
		    if (f > (float) anInt1495)
			f = (float) anInt1495;
		    if (f_855_ > (float) anInt1495)
			f_855_ = (float) anInt1495;
		    f_865_ = f_865_ - f_878_ * f_859_ + f_878_;
		    f_862_ = f_862_ - f_880_ * f_859_ + f_880_;
		    if (f < f_855_) {
			f_858_ = f_859_;
			if (f_856_ < 0.0F) {
			    f_858_ -= f_874_ * f_856_;
			    f_859_ -= f_876_ * f_856_;
			    f_865_ -= f_879_ * f_856_;
			    f_862_ -= f_881_ * f_856_;
			    f_856_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_857_ -= f_875_ * f;
			    f = 0.0F;
			}
			if (f_874_ < f_876_) {
			    f_856_ += 0.5F;
			    f += 0.5F;
			    f_855_ = (float) (int) (f_855_ + 0.5F) - f;
			    f -= f_856_;
			    f_856_ = (float) anIntArray1487[(int) f_856_];
			    while (--f >= 0.0F) {
				method2244(bool_853_, bool_854_,
					   anIntArray1499, (int) f_856_, 0, 0,
					   (int) f_858_, (int) f_859_, f_865_,
					   f_878_, f_862_, f_880_);
				f_858_ += f_874_;
				f_859_ += f_876_;
				f_865_ += f_879_;
				f_862_ += f_881_;
				f_856_ += (float) anInt1498;
			    }
			    while (--f_855_ >= 0.0F) {
				method2244(bool_853_, bool_854_,
					   anIntArray1499, (int) f_856_, 0, 0,
					   (int) f_858_, (int) f_857_, f_865_,
					   f_878_, f_862_, f_880_);
				f_858_ += f_874_;
				f_857_ += f_875_;
				f_865_ += f_879_;
				f_862_ += f_881_;
				f_856_ += (float) anInt1498;
			    }
			} else {
			    f_856_ += 0.5F;
			    f += 0.5F;
			    f_855_ = (float) (int) (f_855_ + 0.5F) - f;
			    f -= f_856_;
			    f_856_ = (float) anIntArray1487[(int) f_856_];
			    while (--f >= 0.0F) {
				method2244(bool_853_, bool_854_,
					   anIntArray1499, (int) f_856_, 0, 0,
					   (int) f_859_, (int) f_858_, f_865_,
					   f_878_, f_862_, f_880_);
				f_858_ += f_874_;
				f_859_ += f_876_;
				f_865_ += f_879_;
				f_862_ += f_881_;
				f_856_ += (float) anInt1498;
			    }
			    while (--f_855_ >= 0.0F) {
				method2244(bool_853_, bool_854_,
					   anIntArray1499, (int) f_856_, 0, 0,
					   (int) f_857_, (int) f_858_, f_865_,
					   f_878_, f_862_, f_880_);
				f_858_ += f_874_;
				f_857_ += f_875_;
				f_865_ += f_879_;
				f_862_ += f_881_;
				f_856_ += (float) anInt1498;
			    }
			}
		    } else {
			f_857_ = f_859_;
			if (f_856_ < 0.0F) {
			    f_857_ -= f_874_ * f_856_;
			    f_859_ -= f_876_ * f_856_;
			    f_865_ -= f_879_ * f_856_;
			    f_862_ -= f_881_ * f_856_;
			    f_856_ = 0.0F;
			}
			if (f_855_ < 0.0F) {
			    f_858_ -= f_875_ * f_855_;
			    f_855_ = 0.0F;
			}
			if (f_874_ < f_876_) {
			    f_856_ += 0.5F;
			    f_855_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_855_;
			    f_855_ -= f_856_;
			    f_856_ = (float) anIntArray1487[(int) f_856_];
			    while (--f_855_ >= 0.0F) {
				method2244(bool_853_, bool_854_,
					   anIntArray1499, (int) f_856_, 0, 0,
					   (int) f_857_, (int) f_859_, f_865_,
					   f_878_, f_862_, f_880_);
				f_857_ += f_874_;
				f_859_ += f_876_;
				f_865_ += f_879_;
				f_862_ += f_881_;
				f_856_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2244(bool_853_, bool_854_,
					   anIntArray1499, (int) f_856_, 0, 0,
					   (int) f_858_, (int) f_859_, f_865_,
					   f_878_, f_862_, f_880_);
				f_858_ += f_875_;
				f_859_ += f_876_;
				f_865_ += f_879_;
				f_862_ += f_881_;
				f_856_ += (float) anInt1498;
			    }
			} else {
			    f_856_ += 0.5F;
			    f_855_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_855_;
			    f_855_ -= f_856_;
			    f_856_ = (float) anIntArray1487[(int) f_856_];
			    while (--f_855_ >= 0.0F) {
				method2244(bool_853_, bool_854_,
					   anIntArray1499, (int) f_856_, 0, 0,
					   (int) f_859_, (int) f_857_, f_865_,
					   f_878_, f_862_, f_880_);
				f_857_ += f_874_;
				f_859_ += f_876_;
				f_865_ += f_879_;
				f_862_ += f_881_;
				f_856_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2244(bool_853_, bool_854_,
					   anIntArray1499, (int) f_856_, 0, 0,
					   (int) f_859_, (int) f_858_, f_865_,
					   f_878_, f_862_, f_880_);
				f_858_ += f_875_;
				f_859_ += f_876_;
				f_865_ += f_879_;
				f_862_ += f_881_;
				f_856_ += (float) anInt1498;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method2260(boolean bool) {
	aBool1510 = bool;
    }
    
    final void method2261(boolean bool) {
	aBool1510 = bool;
    }
    
    final void method2262(boolean bool, boolean bool_882_, boolean bool_883_,
			  float f, float f_884_, float f_885_, float f_886_,
			  float f_887_, float f_888_, float f_889_,
			  float f_890_, float f_891_, float f_892_,
			  float f_893_, float f_894_) {
	if (!bool)
	    method2256(false, bool_882_, bool_883_, f, f_884_, f_885_, f_886_,
		       f_887_, f_888_, f_889_, f_890_, f_891_, 0);
	else if (aBool1510) {
	    aClass182_Sub2_1488.method3194((int) f_886_, (int) f, (int) f_887_,
					   (int) f_884_,
					   (Class381.anIntArray3929
					    [(int) f_892_ & 0xffff]),
					   -1951647854);
	    aClass182_Sub2_1488.method3194((int) f_887_, (int) f_884_,
					   (int) f_888_, (int) f_885_,
					   (Class381.anIntArray3929
					    [(int) f_892_ & 0xffff]),
					   -2021435418);
	    aClass182_Sub2_1488.method3194((int) f_888_, (int) f_885_,
					   (int) f_886_, (int) f,
					   (Class381.anIntArray3929
					    [(int) f_892_ & 0xffff]),
					   -2001935090);
	} else {
	    float f_895_ = f_887_ - f_886_;
	    float f_896_ = f_884_ - f;
	    float f_897_ = f_888_ - f_886_;
	    float f_898_ = f_885_ - f;
	    float f_899_ = f_893_ - f_892_;
	    float f_900_ = f_894_ - f_892_;
	    float f_901_ = f_890_ - f_889_;
	    float f_902_ = f_891_ - f_889_;
	    float f_903_;
	    if (f_885_ != f_884_)
		f_903_ = (f_888_ - f_887_) / (f_885_ - f_884_);
	    else
		f_903_ = 0.0F;
	    float f_904_;
	    if (f_884_ != f)
		f_904_ = f_895_ / f_896_;
	    else
		f_904_ = 0.0F;
	    float f_905_;
	    if (f_885_ != f)
		f_905_ = f_897_ / f_898_;
	    else
		f_905_ = 0.0F;
	    float f_906_ = f_895_ * f_898_ - f_897_ * f_896_;
	    if (f_906_ != 0.0F) {
		float f_907_ = (f_899_ * f_898_ - f_900_ * f_896_) / f_906_;
		float f_908_ = (f_900_ * f_895_ - f_899_ * f_897_) / f_906_;
		float f_909_ = (f_901_ * f_898_ - f_902_ * f_896_) / f_906_;
		float f_910_ = (f_902_ * f_895_ - f_901_ * f_897_) / f_906_;
		if (f <= f_884_ && f <= f_885_) {
		    if (!(f >= (float) anInt1495)) {
			if (f_884_ > (float) anInt1495)
			    f_884_ = (float) anInt1495;
			if (f_885_ > (float) anInt1495)
			    f_885_ = (float) anInt1495;
			f_892_ = f_892_ - f_907_ * f_886_ + f_907_;
			f_889_ = f_889_ - f_909_ * f_886_ + f_909_;
			if (f_884_ < f_885_) {
			    f_888_ = f_886_;
			    if (f < 0.0F) {
				f_888_ -= f_905_ * f;
				f_886_ -= f_904_ * f;
				f_892_ -= f_908_ * f;
				f_889_ -= f_910_ * f;
				f = 0.0F;
			    }
			    if (f_884_ < 0.0F) {
				f_887_ -= f_903_ * f_884_;
				f_884_ = 0.0F;
			    }
			    if (f != f_884_ && f_905_ < f_904_
				|| f == f_884_ && f_905_ > f_903_) {
				f += 0.5F;
				f_884_ += 0.5F;
				f_885_
				    = (float) (int) (f_885_ + 0.5F) - f_884_;
				f_884_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_884_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_888_, (int) f_886_,
					       f_892_, f_907_, f_889_, f_909_);
				    f_888_ += f_905_;
				    f_886_ += f_904_;
				    f_892_ += f_908_;
				    f_889_ += f_910_;
				    f += (float) anInt1498;
				}
				while (--f_885_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_888_, (int) f_887_,
					       f_892_, f_907_, f_889_, f_909_);
				    f_888_ += f_905_;
				    f_887_ += f_903_;
				    f_892_ += f_908_;
				    f_889_ += f_910_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_884_ += 0.5F;
				f_885_
				    = (float) (int) (f_885_ + 0.5F) - f_884_;
				f_884_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_884_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_886_, (int) f_888_,
					       f_892_, f_907_, f_889_, f_909_);
				    f_888_ += f_905_;
				    f_886_ += f_904_;
				    f_892_ += f_908_;
				    f_889_ += f_910_;
				    f += (float) anInt1498;
				}
				while (--f_885_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_887_, (int) f_888_,
					       f_892_, f_907_, f_889_, f_909_);
				    f_888_ += f_905_;
				    f_887_ += f_903_;
				    f_892_ += f_908_;
				    f_889_ += f_910_;
				    f += (float) anInt1498;
				}
			    }
			} else {
			    f_887_ = f_886_;
			    if (f < 0.0F) {
				f_887_ -= f_905_ * f;
				f_886_ -= f_904_ * f;
				f_892_ -= f_908_ * f;
				f_889_ -= f_910_ * f;
				f = 0.0F;
			    }
			    if (f_885_ < 0.0F) {
				f_888_ -= f_903_ * f_885_;
				f_885_ = 0.0F;
			    }
			    if (f != f_885_ && f_905_ < f_904_
				|| f == f_885_ && f_903_ > f_904_) {
				f += 0.5F;
				f_885_ += 0.5F;
				f_884_
				    = (float) (int) (f_884_ + 0.5F) - f_885_;
				f_885_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_885_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_887_, (int) f_886_,
					       f_892_, f_907_, f_889_, f_909_);
				    f_887_ += f_905_;
				    f_886_ += f_904_;
				    f_892_ += f_908_;
				    f_889_ += f_910_;
				    f += (float) anInt1498;
				}
				while (--f_884_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_888_, (int) f_886_,
					       f_892_, f_907_, f_889_, f_909_);
				    f_888_ += f_903_;
				    f_886_ += f_904_;
				    f_892_ += f_908_;
				    f_889_ += f_910_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_885_ += 0.5F;
				f_884_
				    = (float) (int) (f_884_ + 0.5F) - f_885_;
				f_885_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_885_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_886_, (int) f_887_,
					       f_892_, f_907_, f_889_, f_909_);
				    f_887_ += f_905_;
				    f_886_ += f_904_;
				    f_892_ += f_908_;
				    f_889_ += f_910_;
				    f += (float) anInt1498;
				}
				while (--f_884_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_886_, (int) f_888_,
					       f_892_, f_907_, f_889_, f_909_);
				    f_888_ += f_903_;
				    f_886_ += f_904_;
				    f_892_ += f_908_;
				    f_889_ += f_910_;
				    f += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (f_884_ <= f_885_) {
		    if (!(f_884_ >= (float) anInt1495)) {
			if (f_885_ > (float) anInt1495)
			    f_885_ = (float) anInt1495;
			if (f > (float) anInt1495)
			    f = (float) anInt1495;
			f_893_ = f_893_ - f_907_ * f_887_ + f_907_;
			f_890_ = f_890_ - f_909_ * f_887_ + f_909_;
			if (f_885_ < f) {
			    f_886_ = f_887_;
			    if (f_884_ < 0.0F) {
				f_886_ -= f_904_ * f_884_;
				f_887_ -= f_903_ * f_884_;
				f_893_ -= f_908_ * f_884_;
				f_890_ -= f_910_ * f_884_;
				f_884_ = 0.0F;
			    }
			    if (f_885_ < 0.0F) {
				f_888_ -= f_905_ * f_885_;
				f_885_ = 0.0F;
			    }
			    if (f_884_ != f_885_ && f_904_ < f_903_
				|| f_884_ == f_885_ && f_904_ > f_905_) {
				f_884_ += 0.5F;
				f_885_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_885_;
				f_885_ -= f_884_;
				f_884_ = (float) anIntArray1487[(int) f_884_];
				while (--f_885_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f_884_, 0,
					       0, (int) f_886_, (int) f_887_,
					       f_893_, f_907_, f_890_, f_909_);
				    f_886_ += f_904_;
				    f_887_ += f_903_;
				    f_893_ += f_908_;
				    f_890_ += f_910_;
				    f_884_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f_884_, 0,
					       0, (int) f_886_, (int) f_888_,
					       f_893_, f_907_, f_890_, f_909_);
				    f_886_ += f_904_;
				    f_888_ += f_905_;
				    f_893_ += f_908_;
				    f_890_ += f_910_;
				    f_884_ += (float) anInt1498;
				}
			    } else {
				f_884_ += 0.5F;
				f_885_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_885_;
				f_885_ -= f_884_;
				f_884_ = (float) anIntArray1487[(int) f_884_];
				while (--f_885_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f_884_, 0,
					       0, (int) f_887_, (int) f_886_,
					       f_893_, f_907_, f_890_, f_909_);
				    f_886_ += f_904_;
				    f_887_ += f_903_;
				    f_893_ += f_908_;
				    f_890_ += f_910_;
				    f_884_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f_884_, 0,
					       0, (int) f_888_, (int) f_886_,
					       f_893_, f_907_, f_890_, f_909_);
				    f_886_ += f_904_;
				    f_888_ += f_905_;
				    f_893_ += f_908_;
				    f_890_ += f_910_;
				    f_884_ += (float) anInt1498;
				}
			    }
			} else {
			    f_888_ = f_887_;
			    if (f_884_ < 0.0F) {
				f_888_ -= f_904_ * f_884_;
				f_887_ -= f_903_ * f_884_;
				f_893_ -= f_908_ * f_884_;
				f_890_ -= f_910_ * f_884_;
				f_884_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_886_ -= f_905_ * f;
				f = 0.0F;
			    }
			    if (f_904_ < f_903_) {
				f_884_ += 0.5F;
				f += 0.5F;
				f_885_ = (float) (int) (f_885_ + 0.5F) - f;
				f -= f_884_;
				f_884_ = (float) anIntArray1487[(int) f_884_];
				while (--f >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f_884_, 0,
					       0, (int) f_888_, (int) f_887_,
					       f_893_, f_907_, f_890_, f_909_);
				    f_888_ += f_904_;
				    f_887_ += f_903_;
				    f_893_ += f_908_;
				    f_890_ += f_910_;
				    f_884_ += (float) anInt1498;
				}
				while (--f_885_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f_884_, 0,
					       0, (int) f_886_, (int) f_887_,
					       f_893_, f_907_, f_890_, f_909_);
				    f_886_ += f_905_;
				    f_887_ += f_903_;
				    f_893_ += f_908_;
				    f_890_ += f_910_;
				    f_884_ += (float) anInt1498;
				}
			    } else {
				f_884_ += 0.5F;
				f += 0.5F;
				f_885_ = (float) (int) (f_885_ + 0.5F) - f;
				f -= f_884_;
				f_884_ = (float) anIntArray1487[(int) f_884_];
				while (--f >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f_884_, 0,
					       0, (int) f_887_, (int) f_888_,
					       f_893_, f_907_, f_890_, f_909_);
				    f_888_ += f_904_;
				    f_887_ += f_903_;
				    f_893_ += f_908_;
				    f_890_ += f_910_;
				    f_884_ += (float) anInt1498;
				}
				while (--f_885_ >= 0.0F) {
				    method2244(bool_882_, bool_883_,
					       anIntArray1499, (int) f_884_, 0,
					       0, (int) f_887_, (int) f_886_,
					       f_893_, f_907_, f_890_, f_909_);
				    f_886_ += f_905_;
				    f_887_ += f_903_;
				    f_893_ += f_908_;
				    f_890_ += f_910_;
				    f_884_ += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (!(f_885_ >= (float) anInt1495)) {
		    if (f > (float) anInt1495)
			f = (float) anInt1495;
		    if (f_884_ > (float) anInt1495)
			f_884_ = (float) anInt1495;
		    f_894_ = f_894_ - f_907_ * f_888_ + f_907_;
		    f_891_ = f_891_ - f_909_ * f_888_ + f_909_;
		    if (f < f_884_) {
			f_887_ = f_888_;
			if (f_885_ < 0.0F) {
			    f_887_ -= f_903_ * f_885_;
			    f_888_ -= f_905_ * f_885_;
			    f_894_ -= f_908_ * f_885_;
			    f_891_ -= f_910_ * f_885_;
			    f_885_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_886_ -= f_904_ * f;
			    f = 0.0F;
			}
			if (f_903_ < f_905_) {
			    f_885_ += 0.5F;
			    f += 0.5F;
			    f_884_ = (float) (int) (f_884_ + 0.5F) - f;
			    f -= f_885_;
			    f_885_ = (float) anIntArray1487[(int) f_885_];
			    while (--f >= 0.0F) {
				method2244(bool_882_, bool_883_,
					   anIntArray1499, (int) f_885_, 0, 0,
					   (int) f_887_, (int) f_888_, f_894_,
					   f_907_, f_891_, f_909_);
				f_887_ += f_903_;
				f_888_ += f_905_;
				f_894_ += f_908_;
				f_891_ += f_910_;
				f_885_ += (float) anInt1498;
			    }
			    while (--f_884_ >= 0.0F) {
				method2244(bool_882_, bool_883_,
					   anIntArray1499, (int) f_885_, 0, 0,
					   (int) f_887_, (int) f_886_, f_894_,
					   f_907_, f_891_, f_909_);
				f_887_ += f_903_;
				f_886_ += f_904_;
				f_894_ += f_908_;
				f_891_ += f_910_;
				f_885_ += (float) anInt1498;
			    }
			} else {
			    f_885_ += 0.5F;
			    f += 0.5F;
			    f_884_ = (float) (int) (f_884_ + 0.5F) - f;
			    f -= f_885_;
			    f_885_ = (float) anIntArray1487[(int) f_885_];
			    while (--f >= 0.0F) {
				method2244(bool_882_, bool_883_,
					   anIntArray1499, (int) f_885_, 0, 0,
					   (int) f_888_, (int) f_887_, f_894_,
					   f_907_, f_891_, f_909_);
				f_887_ += f_903_;
				f_888_ += f_905_;
				f_894_ += f_908_;
				f_891_ += f_910_;
				f_885_ += (float) anInt1498;
			    }
			    while (--f_884_ >= 0.0F) {
				method2244(bool_882_, bool_883_,
					   anIntArray1499, (int) f_885_, 0, 0,
					   (int) f_886_, (int) f_887_, f_894_,
					   f_907_, f_891_, f_909_);
				f_887_ += f_903_;
				f_886_ += f_904_;
				f_894_ += f_908_;
				f_891_ += f_910_;
				f_885_ += (float) anInt1498;
			    }
			}
		    } else {
			f_886_ = f_888_;
			if (f_885_ < 0.0F) {
			    f_886_ -= f_903_ * f_885_;
			    f_888_ -= f_905_ * f_885_;
			    f_894_ -= f_908_ * f_885_;
			    f_891_ -= f_910_ * f_885_;
			    f_885_ = 0.0F;
			}
			if (f_884_ < 0.0F) {
			    f_887_ -= f_904_ * f_884_;
			    f_884_ = 0.0F;
			}
			if (f_903_ < f_905_) {
			    f_885_ += 0.5F;
			    f_884_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_884_;
			    f_884_ -= f_885_;
			    f_885_ = (float) anIntArray1487[(int) f_885_];
			    while (--f_884_ >= 0.0F) {
				method2244(bool_882_, bool_883_,
					   anIntArray1499, (int) f_885_, 0, 0,
					   (int) f_886_, (int) f_888_, f_894_,
					   f_907_, f_891_, f_909_);
				f_886_ += f_903_;
				f_888_ += f_905_;
				f_894_ += f_908_;
				f_891_ += f_910_;
				f_885_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2244(bool_882_, bool_883_,
					   anIntArray1499, (int) f_885_, 0, 0,
					   (int) f_887_, (int) f_888_, f_894_,
					   f_907_, f_891_, f_909_);
				f_887_ += f_904_;
				f_888_ += f_905_;
				f_894_ += f_908_;
				f_891_ += f_910_;
				f_885_ += (float) anInt1498;
			    }
			} else {
			    f_885_ += 0.5F;
			    f_884_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_884_;
			    f_884_ -= f_885_;
			    f_885_ = (float) anIntArray1487[(int) f_885_];
			    while (--f_884_ >= 0.0F) {
				method2244(bool_882_, bool_883_,
					   anIntArray1499, (int) f_885_, 0, 0,
					   (int) f_888_, (int) f_886_, f_894_,
					   f_907_, f_891_, f_909_);
				f_886_ += f_903_;
				f_888_ += f_905_;
				f_894_ += f_908_;
				f_891_ += f_910_;
				f_885_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2244(bool_882_, bool_883_,
					   anIntArray1499, (int) f_885_, 0, 0,
					   (int) f_888_, (int) f_887_, f_894_,
					   f_907_, f_891_, f_909_);
				f_887_ += f_904_;
				f_888_ += f_905_;
				f_894_ += f_908_;
				f_891_ += f_910_;
				f_885_ += (float) anInt1498;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method2263(boolean bool, boolean bool_911_, boolean bool_912_,
			  float f, float f_913_, float f_914_, float f_915_,
			  float f_916_, float f_917_, float f_918_,
			  float f_919_, float f_920_, float f_921_,
			  float f_922_, float f_923_) {
	if (!bool)
	    method2256(false, bool_911_, bool_912_, f, f_913_, f_914_, f_915_,
		       f_916_, f_917_, f_918_, f_919_, f_920_, 0);
	else if (aBool1510) {
	    aClass182_Sub2_1488.method3194((int) f_915_, (int) f, (int) f_916_,
					   (int) f_913_,
					   (Class381.anIntArray3929
					    [(int) f_921_ & 0xffff]),
					   -2107447944);
	    aClass182_Sub2_1488.method3194((int) f_916_, (int) f_913_,
					   (int) f_917_, (int) f_914_,
					   (Class381.anIntArray3929
					    [(int) f_921_ & 0xffff]),
					   -2021286884);
	    aClass182_Sub2_1488.method3194((int) f_917_, (int) f_914_,
					   (int) f_915_, (int) f,
					   (Class381.anIntArray3929
					    [(int) f_921_ & 0xffff]),
					   -1996151742);
	} else {
	    float f_924_ = f_916_ - f_915_;
	    float f_925_ = f_913_ - f;
	    float f_926_ = f_917_ - f_915_;
	    float f_927_ = f_914_ - f;
	    float f_928_ = f_922_ - f_921_;
	    float f_929_ = f_923_ - f_921_;
	    float f_930_ = f_919_ - f_918_;
	    float f_931_ = f_920_ - f_918_;
	    float f_932_;
	    if (f_914_ != f_913_)
		f_932_ = (f_917_ - f_916_) / (f_914_ - f_913_);
	    else
		f_932_ = 0.0F;
	    float f_933_;
	    if (f_913_ != f)
		f_933_ = f_924_ / f_925_;
	    else
		f_933_ = 0.0F;
	    float f_934_;
	    if (f_914_ != f)
		f_934_ = f_926_ / f_927_;
	    else
		f_934_ = 0.0F;
	    float f_935_ = f_924_ * f_927_ - f_926_ * f_925_;
	    if (f_935_ != 0.0F) {
		float f_936_ = (f_928_ * f_927_ - f_929_ * f_925_) / f_935_;
		float f_937_ = (f_929_ * f_924_ - f_928_ * f_926_) / f_935_;
		float f_938_ = (f_930_ * f_927_ - f_931_ * f_925_) / f_935_;
		float f_939_ = (f_931_ * f_924_ - f_930_ * f_926_) / f_935_;
		if (f <= f_913_ && f <= f_914_) {
		    if (!(f >= (float) anInt1495)) {
			if (f_913_ > (float) anInt1495)
			    f_913_ = (float) anInt1495;
			if (f_914_ > (float) anInt1495)
			    f_914_ = (float) anInt1495;
			f_921_ = f_921_ - f_936_ * f_915_ + f_936_;
			f_918_ = f_918_ - f_938_ * f_915_ + f_938_;
			if (f_913_ < f_914_) {
			    f_917_ = f_915_;
			    if (f < 0.0F) {
				f_917_ -= f_934_ * f;
				f_915_ -= f_933_ * f;
				f_921_ -= f_937_ * f;
				f_918_ -= f_939_ * f;
				f = 0.0F;
			    }
			    if (f_913_ < 0.0F) {
				f_916_ -= f_932_ * f_913_;
				f_913_ = 0.0F;
			    }
			    if (f != f_913_ && f_934_ < f_933_
				|| f == f_913_ && f_934_ > f_932_) {
				f += 0.5F;
				f_913_ += 0.5F;
				f_914_
				    = (float) (int) (f_914_ + 0.5F) - f_913_;
				f_913_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_913_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_917_, (int) f_915_,
					       f_921_, f_936_, f_918_, f_938_);
				    f_917_ += f_934_;
				    f_915_ += f_933_;
				    f_921_ += f_937_;
				    f_918_ += f_939_;
				    f += (float) anInt1498;
				}
				while (--f_914_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_917_, (int) f_916_,
					       f_921_, f_936_, f_918_, f_938_);
				    f_917_ += f_934_;
				    f_916_ += f_932_;
				    f_921_ += f_937_;
				    f_918_ += f_939_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_913_ += 0.5F;
				f_914_
				    = (float) (int) (f_914_ + 0.5F) - f_913_;
				f_913_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_913_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_915_, (int) f_917_,
					       f_921_, f_936_, f_918_, f_938_);
				    f_917_ += f_934_;
				    f_915_ += f_933_;
				    f_921_ += f_937_;
				    f_918_ += f_939_;
				    f += (float) anInt1498;
				}
				while (--f_914_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_916_, (int) f_917_,
					       f_921_, f_936_, f_918_, f_938_);
				    f_917_ += f_934_;
				    f_916_ += f_932_;
				    f_921_ += f_937_;
				    f_918_ += f_939_;
				    f += (float) anInt1498;
				}
			    }
			} else {
			    f_916_ = f_915_;
			    if (f < 0.0F) {
				f_916_ -= f_934_ * f;
				f_915_ -= f_933_ * f;
				f_921_ -= f_937_ * f;
				f_918_ -= f_939_ * f;
				f = 0.0F;
			    }
			    if (f_914_ < 0.0F) {
				f_917_ -= f_932_ * f_914_;
				f_914_ = 0.0F;
			    }
			    if (f != f_914_ && f_934_ < f_933_
				|| f == f_914_ && f_932_ > f_933_) {
				f += 0.5F;
				f_914_ += 0.5F;
				f_913_
				    = (float) (int) (f_913_ + 0.5F) - f_914_;
				f_914_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_914_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_916_, (int) f_915_,
					       f_921_, f_936_, f_918_, f_938_);
				    f_916_ += f_934_;
				    f_915_ += f_933_;
				    f_921_ += f_937_;
				    f_918_ += f_939_;
				    f += (float) anInt1498;
				}
				while (--f_913_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_917_, (int) f_915_,
					       f_921_, f_936_, f_918_, f_938_);
				    f_917_ += f_932_;
				    f_915_ += f_933_;
				    f_921_ += f_937_;
				    f_918_ += f_939_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_914_ += 0.5F;
				f_913_
				    = (float) (int) (f_913_ + 0.5F) - f_914_;
				f_914_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_914_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_915_, (int) f_916_,
					       f_921_, f_936_, f_918_, f_938_);
				    f_916_ += f_934_;
				    f_915_ += f_933_;
				    f_921_ += f_937_;
				    f_918_ += f_939_;
				    f += (float) anInt1498;
				}
				while (--f_913_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_915_, (int) f_917_,
					       f_921_, f_936_, f_918_, f_938_);
				    f_917_ += f_932_;
				    f_915_ += f_933_;
				    f_921_ += f_937_;
				    f_918_ += f_939_;
				    f += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (f_913_ <= f_914_) {
		    if (!(f_913_ >= (float) anInt1495)) {
			if (f_914_ > (float) anInt1495)
			    f_914_ = (float) anInt1495;
			if (f > (float) anInt1495)
			    f = (float) anInt1495;
			f_922_ = f_922_ - f_936_ * f_916_ + f_936_;
			f_919_ = f_919_ - f_938_ * f_916_ + f_938_;
			if (f_914_ < f) {
			    f_915_ = f_916_;
			    if (f_913_ < 0.0F) {
				f_915_ -= f_933_ * f_913_;
				f_916_ -= f_932_ * f_913_;
				f_922_ -= f_937_ * f_913_;
				f_919_ -= f_939_ * f_913_;
				f_913_ = 0.0F;
			    }
			    if (f_914_ < 0.0F) {
				f_917_ -= f_934_ * f_914_;
				f_914_ = 0.0F;
			    }
			    if (f_913_ != f_914_ && f_933_ < f_932_
				|| f_913_ == f_914_ && f_933_ > f_934_) {
				f_913_ += 0.5F;
				f_914_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_914_;
				f_914_ -= f_913_;
				f_913_ = (float) anIntArray1487[(int) f_913_];
				while (--f_914_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f_913_, 0,
					       0, (int) f_915_, (int) f_916_,
					       f_922_, f_936_, f_919_, f_938_);
				    f_915_ += f_933_;
				    f_916_ += f_932_;
				    f_922_ += f_937_;
				    f_919_ += f_939_;
				    f_913_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f_913_, 0,
					       0, (int) f_915_, (int) f_917_,
					       f_922_, f_936_, f_919_, f_938_);
				    f_915_ += f_933_;
				    f_917_ += f_934_;
				    f_922_ += f_937_;
				    f_919_ += f_939_;
				    f_913_ += (float) anInt1498;
				}
			    } else {
				f_913_ += 0.5F;
				f_914_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_914_;
				f_914_ -= f_913_;
				f_913_ = (float) anIntArray1487[(int) f_913_];
				while (--f_914_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f_913_, 0,
					       0, (int) f_916_, (int) f_915_,
					       f_922_, f_936_, f_919_, f_938_);
				    f_915_ += f_933_;
				    f_916_ += f_932_;
				    f_922_ += f_937_;
				    f_919_ += f_939_;
				    f_913_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f_913_, 0,
					       0, (int) f_917_, (int) f_915_,
					       f_922_, f_936_, f_919_, f_938_);
				    f_915_ += f_933_;
				    f_917_ += f_934_;
				    f_922_ += f_937_;
				    f_919_ += f_939_;
				    f_913_ += (float) anInt1498;
				}
			    }
			} else {
			    f_917_ = f_916_;
			    if (f_913_ < 0.0F) {
				f_917_ -= f_933_ * f_913_;
				f_916_ -= f_932_ * f_913_;
				f_922_ -= f_937_ * f_913_;
				f_919_ -= f_939_ * f_913_;
				f_913_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_915_ -= f_934_ * f;
				f = 0.0F;
			    }
			    if (f_933_ < f_932_) {
				f_913_ += 0.5F;
				f += 0.5F;
				f_914_ = (float) (int) (f_914_ + 0.5F) - f;
				f -= f_913_;
				f_913_ = (float) anIntArray1487[(int) f_913_];
				while (--f >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f_913_, 0,
					       0, (int) f_917_, (int) f_916_,
					       f_922_, f_936_, f_919_, f_938_);
				    f_917_ += f_933_;
				    f_916_ += f_932_;
				    f_922_ += f_937_;
				    f_919_ += f_939_;
				    f_913_ += (float) anInt1498;
				}
				while (--f_914_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f_913_, 0,
					       0, (int) f_915_, (int) f_916_,
					       f_922_, f_936_, f_919_, f_938_);
				    f_915_ += f_934_;
				    f_916_ += f_932_;
				    f_922_ += f_937_;
				    f_919_ += f_939_;
				    f_913_ += (float) anInt1498;
				}
			    } else {
				f_913_ += 0.5F;
				f += 0.5F;
				f_914_ = (float) (int) (f_914_ + 0.5F) - f;
				f -= f_913_;
				f_913_ = (float) anIntArray1487[(int) f_913_];
				while (--f >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f_913_, 0,
					       0, (int) f_916_, (int) f_917_,
					       f_922_, f_936_, f_919_, f_938_);
				    f_917_ += f_933_;
				    f_916_ += f_932_;
				    f_922_ += f_937_;
				    f_919_ += f_939_;
				    f_913_ += (float) anInt1498;
				}
				while (--f_914_ >= 0.0F) {
				    method2244(bool_911_, bool_912_,
					       anIntArray1499, (int) f_913_, 0,
					       0, (int) f_916_, (int) f_915_,
					       f_922_, f_936_, f_919_, f_938_);
				    f_915_ += f_934_;
				    f_916_ += f_932_;
				    f_922_ += f_937_;
				    f_919_ += f_939_;
				    f_913_ += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (!(f_914_ >= (float) anInt1495)) {
		    if (f > (float) anInt1495)
			f = (float) anInt1495;
		    if (f_913_ > (float) anInt1495)
			f_913_ = (float) anInt1495;
		    f_923_ = f_923_ - f_936_ * f_917_ + f_936_;
		    f_920_ = f_920_ - f_938_ * f_917_ + f_938_;
		    if (f < f_913_) {
			f_916_ = f_917_;
			if (f_914_ < 0.0F) {
			    f_916_ -= f_932_ * f_914_;
			    f_917_ -= f_934_ * f_914_;
			    f_923_ -= f_937_ * f_914_;
			    f_920_ -= f_939_ * f_914_;
			    f_914_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_915_ -= f_933_ * f;
			    f = 0.0F;
			}
			if (f_932_ < f_934_) {
			    f_914_ += 0.5F;
			    f += 0.5F;
			    f_913_ = (float) (int) (f_913_ + 0.5F) - f;
			    f -= f_914_;
			    f_914_ = (float) anIntArray1487[(int) f_914_];
			    while (--f >= 0.0F) {
				method2244(bool_911_, bool_912_,
					   anIntArray1499, (int) f_914_, 0, 0,
					   (int) f_916_, (int) f_917_, f_923_,
					   f_936_, f_920_, f_938_);
				f_916_ += f_932_;
				f_917_ += f_934_;
				f_923_ += f_937_;
				f_920_ += f_939_;
				f_914_ += (float) anInt1498;
			    }
			    while (--f_913_ >= 0.0F) {
				method2244(bool_911_, bool_912_,
					   anIntArray1499, (int) f_914_, 0, 0,
					   (int) f_916_, (int) f_915_, f_923_,
					   f_936_, f_920_, f_938_);
				f_916_ += f_932_;
				f_915_ += f_933_;
				f_923_ += f_937_;
				f_920_ += f_939_;
				f_914_ += (float) anInt1498;
			    }
			} else {
			    f_914_ += 0.5F;
			    f += 0.5F;
			    f_913_ = (float) (int) (f_913_ + 0.5F) - f;
			    f -= f_914_;
			    f_914_ = (float) anIntArray1487[(int) f_914_];
			    while (--f >= 0.0F) {
				method2244(bool_911_, bool_912_,
					   anIntArray1499, (int) f_914_, 0, 0,
					   (int) f_917_, (int) f_916_, f_923_,
					   f_936_, f_920_, f_938_);
				f_916_ += f_932_;
				f_917_ += f_934_;
				f_923_ += f_937_;
				f_920_ += f_939_;
				f_914_ += (float) anInt1498;
			    }
			    while (--f_913_ >= 0.0F) {
				method2244(bool_911_, bool_912_,
					   anIntArray1499, (int) f_914_, 0, 0,
					   (int) f_915_, (int) f_916_, f_923_,
					   f_936_, f_920_, f_938_);
				f_916_ += f_932_;
				f_915_ += f_933_;
				f_923_ += f_937_;
				f_920_ += f_939_;
				f_914_ += (float) anInt1498;
			    }
			}
		    } else {
			f_915_ = f_917_;
			if (f_914_ < 0.0F) {
			    f_915_ -= f_932_ * f_914_;
			    f_917_ -= f_934_ * f_914_;
			    f_923_ -= f_937_ * f_914_;
			    f_920_ -= f_939_ * f_914_;
			    f_914_ = 0.0F;
			}
			if (f_913_ < 0.0F) {
			    f_916_ -= f_933_ * f_913_;
			    f_913_ = 0.0F;
			}
			if (f_932_ < f_934_) {
			    f_914_ += 0.5F;
			    f_913_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_913_;
			    f_913_ -= f_914_;
			    f_914_ = (float) anIntArray1487[(int) f_914_];
			    while (--f_913_ >= 0.0F) {
				method2244(bool_911_, bool_912_,
					   anIntArray1499, (int) f_914_, 0, 0,
					   (int) f_915_, (int) f_917_, f_923_,
					   f_936_, f_920_, f_938_);
				f_915_ += f_932_;
				f_917_ += f_934_;
				f_923_ += f_937_;
				f_920_ += f_939_;
				f_914_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2244(bool_911_, bool_912_,
					   anIntArray1499, (int) f_914_, 0, 0,
					   (int) f_916_, (int) f_917_, f_923_,
					   f_936_, f_920_, f_938_);
				f_916_ += f_933_;
				f_917_ += f_934_;
				f_923_ += f_937_;
				f_920_ += f_939_;
				f_914_ += (float) anInt1498;
			    }
			} else {
			    f_914_ += 0.5F;
			    f_913_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_913_;
			    f_913_ -= f_914_;
			    f_914_ = (float) anIntArray1487[(int) f_914_];
			    while (--f_913_ >= 0.0F) {
				method2244(bool_911_, bool_912_,
					   anIntArray1499, (int) f_914_, 0, 0,
					   (int) f_917_, (int) f_915_, f_923_,
					   f_936_, f_920_, f_938_);
				f_915_ += f_932_;
				f_917_ += f_934_;
				f_923_ += f_937_;
				f_920_ += f_939_;
				f_914_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2244(bool_911_, bool_912_,
					   anIntArray1499, (int) f_914_, 0, 0,
					   (int) f_917_, (int) f_916_, f_923_,
					   f_936_, f_920_, f_938_);
				f_916_ += f_933_;
				f_917_ += f_934_;
				f_923_ += f_937_;
				f_920_ += f_939_;
				f_914_ += (float) anInt1498;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method2264(boolean bool, boolean bool_940_, boolean bool_941_,
			  float f, float f_942_, float f_943_, float f_944_,
			  float f_945_, float f_946_, float f_947_,
			  float f_948_, float f_949_, float f_950_,
			  float f_951_, float f_952_) {
	if (!bool)
	    method2256(false, bool_940_, bool_941_, f, f_942_, f_943_, f_944_,
		       f_945_, f_946_, f_947_, f_948_, f_949_, 0);
	else if (aBool1510) {
	    aClass182_Sub2_1488.method3194((int) f_944_, (int) f, (int) f_945_,
					   (int) f_942_,
					   (Class381.anIntArray3929
					    [(int) f_950_ & 0xffff]),
					   -2075494364);
	    aClass182_Sub2_1488.method3194((int) f_945_, (int) f_942_,
					   (int) f_946_, (int) f_943_,
					   (Class381.anIntArray3929
					    [(int) f_950_ & 0xffff]),
					   -1957649437);
	    aClass182_Sub2_1488.method3194((int) f_946_, (int) f_943_,
					   (int) f_944_, (int) f,
					   (Class381.anIntArray3929
					    [(int) f_950_ & 0xffff]),
					   -2041152800);
	} else {
	    float f_953_ = f_945_ - f_944_;
	    float f_954_ = f_942_ - f;
	    float f_955_ = f_946_ - f_944_;
	    float f_956_ = f_943_ - f;
	    float f_957_ = f_951_ - f_950_;
	    float f_958_ = f_952_ - f_950_;
	    float f_959_ = f_948_ - f_947_;
	    float f_960_ = f_949_ - f_947_;
	    float f_961_;
	    if (f_943_ != f_942_)
		f_961_ = (f_946_ - f_945_) / (f_943_ - f_942_);
	    else
		f_961_ = 0.0F;
	    float f_962_;
	    if (f_942_ != f)
		f_962_ = f_953_ / f_954_;
	    else
		f_962_ = 0.0F;
	    float f_963_;
	    if (f_943_ != f)
		f_963_ = f_955_ / f_956_;
	    else
		f_963_ = 0.0F;
	    float f_964_ = f_953_ * f_956_ - f_955_ * f_954_;
	    if (f_964_ != 0.0F) {
		float f_965_ = (f_957_ * f_956_ - f_958_ * f_954_) / f_964_;
		float f_966_ = (f_958_ * f_953_ - f_957_ * f_955_) / f_964_;
		float f_967_ = (f_959_ * f_956_ - f_960_ * f_954_) / f_964_;
		float f_968_ = (f_960_ * f_953_ - f_959_ * f_955_) / f_964_;
		if (f <= f_942_ && f <= f_943_) {
		    if (!(f >= (float) anInt1495)) {
			if (f_942_ > (float) anInt1495)
			    f_942_ = (float) anInt1495;
			if (f_943_ > (float) anInt1495)
			    f_943_ = (float) anInt1495;
			f_950_ = f_950_ - f_965_ * f_944_ + f_965_;
			f_947_ = f_947_ - f_967_ * f_944_ + f_967_;
			if (f_942_ < f_943_) {
			    f_946_ = f_944_;
			    if (f < 0.0F) {
				f_946_ -= f_963_ * f;
				f_944_ -= f_962_ * f;
				f_950_ -= f_966_ * f;
				f_947_ -= f_968_ * f;
				f = 0.0F;
			    }
			    if (f_942_ < 0.0F) {
				f_945_ -= f_961_ * f_942_;
				f_942_ = 0.0F;
			    }
			    if (f != f_942_ && f_963_ < f_962_
				|| f == f_942_ && f_963_ > f_961_) {
				f += 0.5F;
				f_942_ += 0.5F;
				f_943_
				    = (float) (int) (f_943_ + 0.5F) - f_942_;
				f_942_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_942_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_946_, (int) f_944_,
					       f_950_, f_965_, f_947_, f_967_);
				    f_946_ += f_963_;
				    f_944_ += f_962_;
				    f_950_ += f_966_;
				    f_947_ += f_968_;
				    f += (float) anInt1498;
				}
				while (--f_943_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_946_, (int) f_945_,
					       f_950_, f_965_, f_947_, f_967_);
				    f_946_ += f_963_;
				    f_945_ += f_961_;
				    f_950_ += f_966_;
				    f_947_ += f_968_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_942_ += 0.5F;
				f_943_
				    = (float) (int) (f_943_ + 0.5F) - f_942_;
				f_942_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_942_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_944_, (int) f_946_,
					       f_950_, f_965_, f_947_, f_967_);
				    f_946_ += f_963_;
				    f_944_ += f_962_;
				    f_950_ += f_966_;
				    f_947_ += f_968_;
				    f += (float) anInt1498;
				}
				while (--f_943_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_945_, (int) f_946_,
					       f_950_, f_965_, f_947_, f_967_);
				    f_946_ += f_963_;
				    f_945_ += f_961_;
				    f_950_ += f_966_;
				    f_947_ += f_968_;
				    f += (float) anInt1498;
				}
			    }
			} else {
			    f_945_ = f_944_;
			    if (f < 0.0F) {
				f_945_ -= f_963_ * f;
				f_944_ -= f_962_ * f;
				f_950_ -= f_966_ * f;
				f_947_ -= f_968_ * f;
				f = 0.0F;
			    }
			    if (f_943_ < 0.0F) {
				f_946_ -= f_961_ * f_943_;
				f_943_ = 0.0F;
			    }
			    if (f != f_943_ && f_963_ < f_962_
				|| f == f_943_ && f_961_ > f_962_) {
				f += 0.5F;
				f_943_ += 0.5F;
				f_942_
				    = (float) (int) (f_942_ + 0.5F) - f_943_;
				f_943_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_943_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_945_, (int) f_944_,
					       f_950_, f_965_, f_947_, f_967_);
				    f_945_ += f_963_;
				    f_944_ += f_962_;
				    f_950_ += f_966_;
				    f_947_ += f_968_;
				    f += (float) anInt1498;
				}
				while (--f_942_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_946_, (int) f_944_,
					       f_950_, f_965_, f_947_, f_967_);
				    f_946_ += f_961_;
				    f_944_ += f_962_;
				    f_950_ += f_966_;
				    f_947_ += f_968_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_943_ += 0.5F;
				f_942_
				    = (float) (int) (f_942_ + 0.5F) - f_943_;
				f_943_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_943_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_944_, (int) f_945_,
					       f_950_, f_965_, f_947_, f_967_);
				    f_945_ += f_963_;
				    f_944_ += f_962_;
				    f_950_ += f_966_;
				    f_947_ += f_968_;
				    f += (float) anInt1498;
				}
				while (--f_942_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_944_, (int) f_946_,
					       f_950_, f_965_, f_947_, f_967_);
				    f_946_ += f_961_;
				    f_944_ += f_962_;
				    f_950_ += f_966_;
				    f_947_ += f_968_;
				    f += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (f_942_ <= f_943_) {
		    if (!(f_942_ >= (float) anInt1495)) {
			if (f_943_ > (float) anInt1495)
			    f_943_ = (float) anInt1495;
			if (f > (float) anInt1495)
			    f = (float) anInt1495;
			f_951_ = f_951_ - f_965_ * f_945_ + f_965_;
			f_948_ = f_948_ - f_967_ * f_945_ + f_967_;
			if (f_943_ < f) {
			    f_944_ = f_945_;
			    if (f_942_ < 0.0F) {
				f_944_ -= f_962_ * f_942_;
				f_945_ -= f_961_ * f_942_;
				f_951_ -= f_966_ * f_942_;
				f_948_ -= f_968_ * f_942_;
				f_942_ = 0.0F;
			    }
			    if (f_943_ < 0.0F) {
				f_946_ -= f_963_ * f_943_;
				f_943_ = 0.0F;
			    }
			    if (f_942_ != f_943_ && f_962_ < f_961_
				|| f_942_ == f_943_ && f_962_ > f_963_) {
				f_942_ += 0.5F;
				f_943_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_943_;
				f_943_ -= f_942_;
				f_942_ = (float) anIntArray1487[(int) f_942_];
				while (--f_943_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f_942_, 0,
					       0, (int) f_944_, (int) f_945_,
					       f_951_, f_965_, f_948_, f_967_);
				    f_944_ += f_962_;
				    f_945_ += f_961_;
				    f_951_ += f_966_;
				    f_948_ += f_968_;
				    f_942_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f_942_, 0,
					       0, (int) f_944_, (int) f_946_,
					       f_951_, f_965_, f_948_, f_967_);
				    f_944_ += f_962_;
				    f_946_ += f_963_;
				    f_951_ += f_966_;
				    f_948_ += f_968_;
				    f_942_ += (float) anInt1498;
				}
			    } else {
				f_942_ += 0.5F;
				f_943_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_943_;
				f_943_ -= f_942_;
				f_942_ = (float) anIntArray1487[(int) f_942_];
				while (--f_943_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f_942_, 0,
					       0, (int) f_945_, (int) f_944_,
					       f_951_, f_965_, f_948_, f_967_);
				    f_944_ += f_962_;
				    f_945_ += f_961_;
				    f_951_ += f_966_;
				    f_948_ += f_968_;
				    f_942_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f_942_, 0,
					       0, (int) f_946_, (int) f_944_,
					       f_951_, f_965_, f_948_, f_967_);
				    f_944_ += f_962_;
				    f_946_ += f_963_;
				    f_951_ += f_966_;
				    f_948_ += f_968_;
				    f_942_ += (float) anInt1498;
				}
			    }
			} else {
			    f_946_ = f_945_;
			    if (f_942_ < 0.0F) {
				f_946_ -= f_962_ * f_942_;
				f_945_ -= f_961_ * f_942_;
				f_951_ -= f_966_ * f_942_;
				f_948_ -= f_968_ * f_942_;
				f_942_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_944_ -= f_963_ * f;
				f = 0.0F;
			    }
			    if (f_962_ < f_961_) {
				f_942_ += 0.5F;
				f += 0.5F;
				f_943_ = (float) (int) (f_943_ + 0.5F) - f;
				f -= f_942_;
				f_942_ = (float) anIntArray1487[(int) f_942_];
				while (--f >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f_942_, 0,
					       0, (int) f_946_, (int) f_945_,
					       f_951_, f_965_, f_948_, f_967_);
				    f_946_ += f_962_;
				    f_945_ += f_961_;
				    f_951_ += f_966_;
				    f_948_ += f_968_;
				    f_942_ += (float) anInt1498;
				}
				while (--f_943_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f_942_, 0,
					       0, (int) f_944_, (int) f_945_,
					       f_951_, f_965_, f_948_, f_967_);
				    f_944_ += f_963_;
				    f_945_ += f_961_;
				    f_951_ += f_966_;
				    f_948_ += f_968_;
				    f_942_ += (float) anInt1498;
				}
			    } else {
				f_942_ += 0.5F;
				f += 0.5F;
				f_943_ = (float) (int) (f_943_ + 0.5F) - f;
				f -= f_942_;
				f_942_ = (float) anIntArray1487[(int) f_942_];
				while (--f >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f_942_, 0,
					       0, (int) f_945_, (int) f_946_,
					       f_951_, f_965_, f_948_, f_967_);
				    f_946_ += f_962_;
				    f_945_ += f_961_;
				    f_951_ += f_966_;
				    f_948_ += f_968_;
				    f_942_ += (float) anInt1498;
				}
				while (--f_943_ >= 0.0F) {
				    method2244(bool_940_, bool_941_,
					       anIntArray1499, (int) f_942_, 0,
					       0, (int) f_945_, (int) f_944_,
					       f_951_, f_965_, f_948_, f_967_);
				    f_944_ += f_963_;
				    f_945_ += f_961_;
				    f_951_ += f_966_;
				    f_948_ += f_968_;
				    f_942_ += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (!(f_943_ >= (float) anInt1495)) {
		    if (f > (float) anInt1495)
			f = (float) anInt1495;
		    if (f_942_ > (float) anInt1495)
			f_942_ = (float) anInt1495;
		    f_952_ = f_952_ - f_965_ * f_946_ + f_965_;
		    f_949_ = f_949_ - f_967_ * f_946_ + f_967_;
		    if (f < f_942_) {
			f_945_ = f_946_;
			if (f_943_ < 0.0F) {
			    f_945_ -= f_961_ * f_943_;
			    f_946_ -= f_963_ * f_943_;
			    f_952_ -= f_966_ * f_943_;
			    f_949_ -= f_968_ * f_943_;
			    f_943_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_944_ -= f_962_ * f;
			    f = 0.0F;
			}
			if (f_961_ < f_963_) {
			    f_943_ += 0.5F;
			    f += 0.5F;
			    f_942_ = (float) (int) (f_942_ + 0.5F) - f;
			    f -= f_943_;
			    f_943_ = (float) anIntArray1487[(int) f_943_];
			    while (--f >= 0.0F) {
				method2244(bool_940_, bool_941_,
					   anIntArray1499, (int) f_943_, 0, 0,
					   (int) f_945_, (int) f_946_, f_952_,
					   f_965_, f_949_, f_967_);
				f_945_ += f_961_;
				f_946_ += f_963_;
				f_952_ += f_966_;
				f_949_ += f_968_;
				f_943_ += (float) anInt1498;
			    }
			    while (--f_942_ >= 0.0F) {
				method2244(bool_940_, bool_941_,
					   anIntArray1499, (int) f_943_, 0, 0,
					   (int) f_945_, (int) f_944_, f_952_,
					   f_965_, f_949_, f_967_);
				f_945_ += f_961_;
				f_944_ += f_962_;
				f_952_ += f_966_;
				f_949_ += f_968_;
				f_943_ += (float) anInt1498;
			    }
			} else {
			    f_943_ += 0.5F;
			    f += 0.5F;
			    f_942_ = (float) (int) (f_942_ + 0.5F) - f;
			    f -= f_943_;
			    f_943_ = (float) anIntArray1487[(int) f_943_];
			    while (--f >= 0.0F) {
				method2244(bool_940_, bool_941_,
					   anIntArray1499, (int) f_943_, 0, 0,
					   (int) f_946_, (int) f_945_, f_952_,
					   f_965_, f_949_, f_967_);
				f_945_ += f_961_;
				f_946_ += f_963_;
				f_952_ += f_966_;
				f_949_ += f_968_;
				f_943_ += (float) anInt1498;
			    }
			    while (--f_942_ >= 0.0F) {
				method2244(bool_940_, bool_941_,
					   anIntArray1499, (int) f_943_, 0, 0,
					   (int) f_944_, (int) f_945_, f_952_,
					   f_965_, f_949_, f_967_);
				f_945_ += f_961_;
				f_944_ += f_962_;
				f_952_ += f_966_;
				f_949_ += f_968_;
				f_943_ += (float) anInt1498;
			    }
			}
		    } else {
			f_944_ = f_946_;
			if (f_943_ < 0.0F) {
			    f_944_ -= f_961_ * f_943_;
			    f_946_ -= f_963_ * f_943_;
			    f_952_ -= f_966_ * f_943_;
			    f_949_ -= f_968_ * f_943_;
			    f_943_ = 0.0F;
			}
			if (f_942_ < 0.0F) {
			    f_945_ -= f_962_ * f_942_;
			    f_942_ = 0.0F;
			}
			if (f_961_ < f_963_) {
			    f_943_ += 0.5F;
			    f_942_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_942_;
			    f_942_ -= f_943_;
			    f_943_ = (float) anIntArray1487[(int) f_943_];
			    while (--f_942_ >= 0.0F) {
				method2244(bool_940_, bool_941_,
					   anIntArray1499, (int) f_943_, 0, 0,
					   (int) f_944_, (int) f_946_, f_952_,
					   f_965_, f_949_, f_967_);
				f_944_ += f_961_;
				f_946_ += f_963_;
				f_952_ += f_966_;
				f_949_ += f_968_;
				f_943_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2244(bool_940_, bool_941_,
					   anIntArray1499, (int) f_943_, 0, 0,
					   (int) f_945_, (int) f_946_, f_952_,
					   f_965_, f_949_, f_967_);
				f_945_ += f_962_;
				f_946_ += f_963_;
				f_952_ += f_966_;
				f_949_ += f_968_;
				f_943_ += (float) anInt1498;
			    }
			} else {
			    f_943_ += 0.5F;
			    f_942_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_942_;
			    f_942_ -= f_943_;
			    f_943_ = (float) anIntArray1487[(int) f_943_];
			    while (--f_942_ >= 0.0F) {
				method2244(bool_940_, bool_941_,
					   anIntArray1499, (int) f_943_, 0, 0,
					   (int) f_946_, (int) f_944_, f_952_,
					   f_965_, f_949_, f_967_);
				f_944_ += f_961_;
				f_946_ += f_963_;
				f_952_ += f_966_;
				f_949_ += f_968_;
				f_943_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2244(bool_940_, bool_941_,
					   anIntArray1499, (int) f_943_, 0, 0,
					   (int) f_946_, (int) f_945_, f_952_,
					   f_965_, f_949_, f_967_);
				f_945_ += f_962_;
				f_946_ += f_963_;
				f_952_ += f_966_;
				f_949_ += f_968_;
				f_943_ += (float) anInt1498;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method2265(boolean bool, boolean bool_969_, boolean bool_970_,
			  float f, float f_971_, float f_972_, float f_973_,
			  float f_974_, float f_975_, float f_976_,
			  float f_977_, float f_978_, int i, int i_979_,
			  int i_980_) {
	if (!bool)
	    method2256(false, bool_969_, bool_970_, f, f_971_, f_972_, f_973_,
		       f_974_, f_975_, f_976_, f_977_, f_978_, 0);
	else if (aBool1510) {
	    aClass182_Sub2_1488.method3194((int) f_973_, (int) f, (int) f_974_,
					   (int) f_971_, ~0xffffff | i,
					   -1931782898);
	    aClass182_Sub2_1488.method3194((int) f_974_, (int) f_971_,
					   (int) f_975_, (int) f_972_,
					   ~0xffffff | i, -2090272682);
	    aClass182_Sub2_1488.method3194((int) f_975_, (int) f_972_,
					   (int) f_973_, (int) f,
					   ~0xffffff | i, -1996979427);
	} else {
	    float f_981_ = f_974_ - f_973_;
	    float f_982_ = f_971_ - f;
	    float f_983_ = f_975_ - f_973_;
	    float f_984_ = f_972_ - f;
	    float f_985_ = f_977_ - f_976_;
	    float f_986_ = f_978_ - f_976_;
	    float f_987_ = (float) ((i_979_ & 0xff0000) - (i & 0xff0000));
	    float f_988_ = (float) ((i_980_ & 0xff0000) - (i & 0xff0000));
	    float f_989_ = (float) ((i_979_ & 0xff00) - (i & 0xff00));
	    float f_990_ = (float) ((i_980_ & 0xff00) - (i & 0xff00));
	    float f_991_ = (float) ((i_979_ & 0xff) - (i & 0xff));
	    float f_992_ = (float) ((i_980_ & 0xff) - (i & 0xff));
	    float f_993_;
	    if (f_972_ != f_971_)
		f_993_ = (f_975_ - f_974_) / (f_972_ - f_971_);
	    else
		f_993_ = 0.0F;
	    float f_994_;
	    if (f_971_ != f)
		f_994_ = f_981_ / f_982_;
	    else
		f_994_ = 0.0F;
	    float f_995_;
	    if (f_972_ != f)
		f_995_ = f_983_ / f_984_;
	    else
		f_995_ = 0.0F;
	    float f_996_ = f_981_ * f_984_ - f_983_ * f_982_;
	    if (f_996_ != 0.0F) {
		float f_997_ = (f_985_ * f_984_ - f_986_ * f_982_) / f_996_;
		float f_998_ = (f_986_ * f_981_ - f_985_ * f_983_) / f_996_;
		float f_999_ = (f_987_ * f_984_ - f_988_ * f_982_) / f_996_;
		float f_1000_ = (f_988_ * f_981_ - f_987_ * f_983_) / f_996_;
		float f_1001_ = (f_989_ * f_984_ - f_990_ * f_982_) / f_996_;
		float f_1002_ = (f_990_ * f_981_ - f_989_ * f_983_) / f_996_;
		float f_1003_ = (f_991_ * f_984_ - f_992_ * f_982_) / f_996_;
		float f_1004_ = (f_992_ * f_981_ - f_991_ * f_983_) / f_996_;
		if (f <= f_971_ && f <= f_972_) {
		    if (!(f >= (float) anInt1495)) {
			if (f_971_ > (float) anInt1495)
			    f_971_ = (float) anInt1495;
			if (f_972_ > (float) anInt1495)
			    f_972_ = (float) anInt1495;
			f_976_ = f_976_ - f_997_ * f_973_ + f_997_;
			float f_1005_ = ((float) (i & 0xff0000)
					 - f_999_ * f_973_ + f_999_);
			float f_1006_ = ((float) (i & 0xff00)
					 - f_1001_ * f_973_ + f_1001_);
			float f_1007_
			    = (float) (i & 0xff) - f_1003_ * f_973_ + f_1003_;
			if (f_971_ < f_972_) {
			    f_975_ = f_973_;
			    if (f < 0.0F) {
				f_975_ -= f_995_ * f;
				f_973_ -= f_994_ * f;
				f_976_ -= f_998_ * f;
				f_1005_ -= f_1000_ * f;
				f_1006_ -= f_1002_ * f;
				f_1007_ -= f_1004_ * f;
				f = 0.0F;
			    }
			    if (f_971_ < 0.0F) {
				f_974_ -= f_993_ * f_971_;
				f_971_ = 0.0F;
			    }
			    if (f != f_971_ && f_995_ < f_994_
				|| f == f_971_ && f_995_ > f_993_) {
				f += 0.5F;
				f_971_ += 0.5F;
				f_972_
				    = (float) (int) (f_972_ + 0.5F) - f_971_;
				f_971_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_971_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_975_, (int) f_973_,
					       f_976_, f_997_, f_1005_, f_999_,
					       f_1006_, f_1001_, f_1007_,
					       f_1003_);
				    f_975_ += f_995_;
				    f_973_ += f_994_;
				    f_976_ += f_998_;
				    f_1005_ += f_1000_;
				    f_1006_ += f_1002_;
				    f_1007_ += f_1004_;
				    f += (float) anInt1498;
				}
				while (--f_972_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_975_, (int) f_974_,
					       f_976_, f_997_, f_1005_, f_999_,
					       f_1006_, f_1001_, f_1007_,
					       f_1003_);
				    f_975_ += f_995_;
				    f_974_ += f_993_;
				    f_976_ += f_998_;
				    f_1005_ += f_1000_;
				    f_1006_ += f_1002_;
				    f_1007_ += f_1004_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_971_ += 0.5F;
				f_972_
				    = (float) (int) (f_972_ + 0.5F) - f_971_;
				f_971_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_971_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_973_, (int) f_975_,
					       f_976_, f_997_, f_1005_, f_999_,
					       f_1006_, f_1001_, f_1007_,
					       f_1003_);
				    f_975_ += f_995_;
				    f_973_ += f_994_;
				    f_976_ += f_998_;
				    f_1005_ += f_1000_;
				    f_1006_ += f_1002_;
				    f_1007_ += f_1004_;
				    f += (float) anInt1498;
				}
				while (--f_972_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_974_, (int) f_975_,
					       f_976_, f_997_, f_1005_, f_999_,
					       f_1006_, f_1001_, f_1007_,
					       f_1003_);
				    f_975_ += f_995_;
				    f_974_ += f_993_;
				    f_976_ += f_998_;
				    f_1005_ += f_1000_;
				    f_1006_ += f_1002_;
				    f_1007_ += f_1004_;
				    f += (float) anInt1498;
				}
			    }
			} else {
			    f_974_ = f_973_;
			    if (f < 0.0F) {
				f_974_ -= f_995_ * f;
				f_973_ -= f_994_ * f;
				f_976_ -= f_998_ * f;
				f_1005_ -= f_1000_ * f;
				f_1006_ -= f_1002_ * f;
				f_1007_ -= f_1004_ * f;
				f = 0.0F;
			    }
			    if (f_972_ < 0.0F) {
				f_975_ -= f_993_ * f_972_;
				f_972_ = 0.0F;
			    }
			    if (f != f_972_ && f_995_ < f_994_
				|| f == f_972_ && f_993_ > f_994_) {
				f += 0.5F;
				f_972_ += 0.5F;
				f_971_
				    = (float) (int) (f_971_ + 0.5F) - f_972_;
				f_972_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_972_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_974_, (int) f_973_,
					       f_976_, f_997_, f_1005_, f_999_,
					       f_1006_, f_1001_, f_1007_,
					       f_1003_);
				    f_974_ += f_995_;
				    f_973_ += f_994_;
				    f_976_ += f_998_;
				    f_1005_ += f_1000_;
				    f_1006_ += f_1002_;
				    f_1007_ += f_1004_;
				    f += (float) anInt1498;
				}
				while (--f_971_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_975_, (int) f_973_,
					       f_976_, f_997_, f_1005_, f_999_,
					       f_1006_, f_1001_, f_1007_,
					       f_1003_);
				    f_975_ += f_993_;
				    f_973_ += f_994_;
				    f_976_ += f_998_;
				    f_1005_ += f_1000_;
				    f_1006_ += f_1002_;
				    f_1007_ += f_1004_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_972_ += 0.5F;
				f_971_
				    = (float) (int) (f_971_ + 0.5F) - f_972_;
				f_972_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_972_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_973_, (int) f_974_,
					       f_976_, f_997_, f_1005_, f_999_,
					       f_1006_, f_1001_, f_1007_,
					       f_1003_);
				    f_974_ += f_995_;
				    f_973_ += f_994_;
				    f_976_ += f_998_;
				    f_1005_ += f_1000_;
				    f_1006_ += f_1002_;
				    f_1007_ += f_1004_;
				    f += (float) anInt1498;
				}
				while (--f_971_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_973_, (int) f_975_,
					       f_976_, f_997_, f_1005_, f_999_,
					       f_1006_, f_1001_, f_1007_,
					       f_1003_);
				    f_975_ += f_993_;
				    f_973_ += f_994_;
				    f_976_ += f_998_;
				    f_1005_ += f_1000_;
				    f_1006_ += f_1002_;
				    f_1007_ += f_1004_;
				    f += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (f_971_ <= f_972_) {
		    if (!(f_971_ >= (float) anInt1495)) {
			if (f_972_ > (float) anInt1495)
			    f_972_ = (float) anInt1495;
			if (f > (float) anInt1495)
			    f = (float) anInt1495;
			f_977_ = f_977_ - f_997_ * f_974_ + f_997_;
			float f_1008_ = ((float) (i_979_ & 0xff0000)
					 - f_999_ * f_974_ + f_999_);
			float f_1009_ = ((float) (i_979_ & 0xff00)
					 - f_1001_ * f_974_ + f_1001_);
			float f_1010_ = ((float) (i_979_ & 0xff)
					 - f_1003_ * f_974_ + f_1003_);
			if (f_972_ < f) {
			    f_973_ = f_974_;
			    if (f_971_ < 0.0F) {
				f_973_ -= f_994_ * f_971_;
				f_974_ -= f_993_ * f_971_;
				f_977_ -= f_998_ * f_971_;
				f_1008_ -= f_1000_ * f_971_;
				f_1009_ -= f_1002_ * f_971_;
				f_1010_ -= f_1004_ * f_971_;
				f_971_ = 0.0F;
			    }
			    if (f_972_ < 0.0F) {
				f_975_ -= f_995_ * f_972_;
				f_972_ = 0.0F;
			    }
			    if (f_971_ != f_972_ && f_994_ < f_993_
				|| f_971_ == f_972_ && f_994_ > f_995_) {
				f_971_ += 0.5F;
				f_972_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_972_;
				f_972_ -= f_971_;
				f_971_ = (float) anIntArray1487[(int) f_971_];
				while (--f_972_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f_971_, 0,
					       0, (int) f_973_, (int) f_974_,
					       f_977_, f_997_, f_1008_, f_999_,
					       f_1009_, f_1001_, f_1010_,
					       f_1003_);
				    f_973_ += f_994_;
				    f_974_ += f_993_;
				    f_977_ += f_998_;
				    f_1008_ += f_1000_;
				    f_1009_ += f_1002_;
				    f_1010_ += f_1004_;
				    f_971_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f_971_, 0,
					       0, (int) f_973_, (int) f_975_,
					       f_977_, f_997_, f_1008_, f_999_,
					       f_1009_, f_1001_, f_1010_,
					       f_1003_);
				    f_973_ += f_994_;
				    f_975_ += f_995_;
				    f_977_ += f_998_;
				    f_1008_ += f_1000_;
				    f_1009_ += f_1002_;
				    f_1010_ += f_1004_;
				    f_971_ += (float) anInt1498;
				}
			    } else {
				f_971_ += 0.5F;
				f_972_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_972_;
				f_972_ -= f_971_;
				f_971_ = (float) anIntArray1487[(int) f_971_];
				while (--f_972_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f_971_, 0,
					       0, (int) f_974_, (int) f_973_,
					       f_977_, f_997_, f_1008_, f_999_,
					       f_1009_, f_1001_, f_1010_,
					       f_1003_);
				    f_973_ += f_994_;
				    f_974_ += f_993_;
				    f_977_ += f_998_;
				    f_1008_ += f_1000_;
				    f_1009_ += f_1002_;
				    f_1010_ += f_1004_;
				    f_971_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f_971_, 0,
					       0, (int) f_975_, (int) f_973_,
					       f_977_, f_997_, f_1008_, f_999_,
					       f_1009_, f_1001_, f_1010_,
					       f_1003_);
				    f_973_ += f_994_;
				    f_975_ += f_995_;
				    f_977_ += f_998_;
				    f_1008_ += f_1000_;
				    f_1009_ += f_1002_;
				    f_1010_ += f_1004_;
				    f_971_ += (float) anInt1498;
				}
			    }
			} else {
			    f_975_ = f_974_;
			    if (f_971_ < 0.0F) {
				f_975_ -= f_994_ * f_971_;
				f_974_ -= f_993_ * f_971_;
				f_977_ -= f_998_ * f_971_;
				f_1008_ -= f_1000_ * f_971_;
				f_1009_ -= f_1002_ * f_971_;
				f_1010_ -= f_1004_ * f_971_;
				f_971_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_973_ -= f_995_ * f;
				f = 0.0F;
			    }
			    if (f_994_ < f_993_) {
				f_971_ += 0.5F;
				f += 0.5F;
				f_972_ = (float) (int) (f_972_ + 0.5F) - f;
				f -= f_971_;
				f_971_ = (float) anIntArray1487[(int) f_971_];
				while (--f >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f_971_, 0,
					       0, (int) f_975_, (int) f_974_,
					       f_977_, f_997_, f_1008_, f_999_,
					       f_1009_, f_1001_, f_1010_,
					       f_1003_);
				    f_975_ += f_994_;
				    f_974_ += f_993_;
				    f_977_ += f_998_;
				    f_1008_ += f_1000_;
				    f_1009_ += f_1002_;
				    f_1010_ += f_1004_;
				    f_971_ += (float) anInt1498;
				}
				while (--f_972_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f_971_, 0,
					       0, (int) f_973_, (int) f_974_,
					       f_977_, f_997_, f_1008_, f_999_,
					       f_1009_, f_1001_, f_1010_,
					       f_1003_);
				    f_973_ += f_995_;
				    f_974_ += f_993_;
				    f_977_ += f_998_;
				    f_1008_ += f_1000_;
				    f_1009_ += f_1002_;
				    f_1010_ += f_1004_;
				    f_971_ += (float) anInt1498;
				}
			    } else {
				f_971_ += 0.5F;
				f += 0.5F;
				f_972_ = (float) (int) (f_972_ + 0.5F) - f;
				f -= f_971_;
				f_971_ = (float) anIntArray1487[(int) f_971_];
				while (--f >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f_971_, 0,
					       0, (int) f_974_, (int) f_975_,
					       f_977_, f_997_, f_1008_, f_999_,
					       f_1009_, f_1001_, f_1010_,
					       f_1003_);
				    f_975_ += f_994_;
				    f_974_ += f_993_;
				    f_977_ += f_998_;
				    f_1008_ += f_1000_;
				    f_1009_ += f_1002_;
				    f_1010_ += f_1004_;
				    f_971_ += (float) anInt1498;
				}
				while (--f_972_ >= 0.0F) {
				    method2245(bool_969_, bool_970_,
					       anIntArray1499, (int) f_971_, 0,
					       0, (int) f_974_, (int) f_973_,
					       f_977_, f_997_, f_1008_, f_999_,
					       f_1009_, f_1001_, f_1010_,
					       f_1003_);
				    f_973_ += f_995_;
				    f_974_ += f_993_;
				    f_977_ += f_998_;
				    f_1008_ += f_1000_;
				    f_1009_ += f_1002_;
				    f_1010_ += f_1004_;
				    f_971_ += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (!(f_972_ >= (float) anInt1495)) {
		    if (f > (float) anInt1495)
			f = (float) anInt1495;
		    if (f_971_ > (float) anInt1495)
			f_971_ = (float) anInt1495;
		    f_978_ = f_978_ - f_997_ * f_975_ + f_997_;
		    float f_1011_ = ((float) (i_980_ & 0xff0000)
				     - f_999_ * f_975_ + f_999_);
		    float f_1012_ = ((float) (i_980_ & 0xff00)
				     - f_1001_ * f_975_ + f_1001_);
		    float f_1013_
			= (float) (i_980_ & 0xff) - f_1003_ * f_975_ + f_1003_;
		    if (f < f_971_) {
			f_974_ = f_975_;
			if (f_972_ < 0.0F) {
			    f_974_ -= f_993_ * f_972_;
			    f_975_ -= f_995_ * f_972_;
			    f_978_ -= f_998_ * f_972_;
			    f_1011_ -= f_1000_ * f_972_;
			    f_1012_ -= f_1002_ * f_972_;
			    f_1013_ -= f_1004_ * f_972_;
			    f_972_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_973_ -= f_994_ * f;
			    f = 0.0F;
			}
			if (f_993_ < f_995_) {
			    f_972_ += 0.5F;
			    f += 0.5F;
			    f_971_ = (float) (int) (f_971_ + 0.5F) - f;
			    f -= f_972_;
			    f_972_ = (float) anIntArray1487[(int) f_972_];
			    while (--f >= 0.0F) {
				method2245(bool_969_, bool_970_,
					   anIntArray1499, (int) f_972_, 0, 0,
					   (int) f_974_, (int) f_975_, f_978_,
					   f_997_, f_1011_, f_999_, f_1012_,
					   f_1001_, f_1013_, f_1003_);
				f_974_ += f_993_;
				f_975_ += f_995_;
				f_978_ += f_998_;
				f_1011_ += f_1000_;
				f_1012_ += f_1002_;
				f_1013_ += f_1004_;
				f_972_ += (float) anInt1498;
			    }
			    while (--f_971_ >= 0.0F) {
				method2245(bool_969_, bool_970_,
					   anIntArray1499, (int) f_972_, 0, 0,
					   (int) f_974_, (int) f_973_, f_978_,
					   f_997_, f_1011_, f_999_, f_1012_,
					   f_1001_, f_1013_, f_1003_);
				f_974_ += f_993_;
				f_973_ += f_994_;
				f_978_ += f_998_;
				f_1011_ += f_1000_;
				f_1012_ += f_1002_;
				f_1013_ += f_1004_;
				f_972_ += (float) anInt1498;
			    }
			} else {
			    f_972_ += 0.5F;
			    f += 0.5F;
			    f_971_ = (float) (int) (f_971_ + 0.5F) - f;
			    f -= f_972_;
			    f_972_ = (float) anIntArray1487[(int) f_972_];
			    while (--f >= 0.0F) {
				method2245(bool_969_, bool_970_,
					   anIntArray1499, (int) f_972_, 0, 0,
					   (int) f_975_, (int) f_974_, f_978_,
					   f_997_, f_1011_, f_999_, f_1012_,
					   f_1001_, f_1013_, f_1003_);
				f_974_ += f_993_;
				f_975_ += f_995_;
				f_978_ += f_998_;
				f_1011_ += f_1000_;
				f_1012_ += f_1002_;
				f_1013_ += f_1004_;
				f_972_ += (float) anInt1498;
			    }
			    while (--f_971_ >= 0.0F) {
				method2245(bool_969_, bool_970_,
					   anIntArray1499, (int) f_972_, 0, 0,
					   (int) f_973_, (int) f_974_, f_978_,
					   f_997_, f_1011_, f_999_, f_1012_,
					   f_1001_, f_1013_, f_1003_);
				f_974_ += f_993_;
				f_973_ += f_994_;
				f_978_ += f_998_;
				f_1011_ += f_1000_;
				f_1012_ += f_1002_;
				f_1013_ += f_1004_;
				f_972_ += (float) anInt1498;
			    }
			}
		    } else {
			f_973_ = f_975_;
			if (f_972_ < 0.0F) {
			    f_973_ -= f_993_ * f_972_;
			    f_975_ -= f_995_ * f_972_;
			    f_978_ -= f_998_ * f_972_;
			    f_1011_ -= f_1000_ * f_972_;
			    f_1012_ -= f_1002_ * f_972_;
			    f_1013_ -= f_1004_ * f_972_;
			    f_972_ = 0.0F;
			}
			if (f_971_ < 0.0F) {
			    f_974_ -= f_994_ * f_971_;
			    f_971_ = 0.0F;
			}
			if (f_993_ < f_995_) {
			    f_972_ += 0.5F;
			    f_971_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_971_;
			    f_971_ -= f_972_;
			    f_972_ = (float) anIntArray1487[(int) f_972_];
			    while (--f_971_ >= 0.0F) {
				method2245(bool_969_, bool_970_,
					   anIntArray1499, (int) f_972_, 0, 0,
					   (int) f_973_, (int) f_975_, f_978_,
					   f_997_, f_1011_, f_999_, f_1012_,
					   f_1001_, f_1013_, f_1003_);
				f_973_ += f_993_;
				f_975_ += f_995_;
				f_978_ += f_998_;
				f_1011_ += f_1000_;
				f_1012_ += f_1002_;
				f_1013_ += f_1004_;
				f_972_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2245(bool_969_, bool_970_,
					   anIntArray1499, (int) f_972_, 0, 0,
					   (int) f_974_, (int) f_975_, f_978_,
					   f_997_, f_1011_, f_999_, f_1012_,
					   f_1001_, f_1013_, f_1003_);
				f_974_ += f_994_;
				f_975_ += f_995_;
				f_978_ += f_998_;
				f_1011_ += f_1000_;
				f_1012_ += f_1002_;
				f_1013_ += f_1004_;
				f_972_ += (float) anInt1498;
			    }
			} else {
			    f_972_ += 0.5F;
			    f_971_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_971_;
			    f_971_ -= f_972_;
			    f_972_ = (float) anIntArray1487[(int) f_972_];
			    while (--f_971_ >= 0.0F) {
				method2245(bool_969_, bool_970_,
					   anIntArray1499, (int) f_972_, 0, 0,
					   (int) f_975_, (int) f_973_, f_978_,
					   f_997_, f_1011_, f_999_, f_1012_,
					   f_1001_, f_1013_, f_1003_);
				f_973_ += f_993_;
				f_975_ += f_995_;
				f_978_ += f_998_;
				f_1011_ += f_1000_;
				f_1012_ += f_1002_;
				f_1013_ += f_1004_;
				f_972_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2245(bool_969_, bool_970_,
					   anIntArray1499, (int) f_972_, 0, 0,
					   (int) f_975_, (int) f_974_, f_978_,
					   f_997_, f_1011_, f_999_, f_1012_,
					   f_1001_, f_1013_, f_1003_);
				f_974_ += f_994_;
				f_975_ += f_995_;
				f_978_ += f_998_;
				f_1011_ += f_1000_;
				f_1012_ += f_1002_;
				f_1013_ += f_1004_;
				f_972_ += (float) anInt1498;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method2266(boolean bool, boolean bool_1014_, boolean bool_1015_,
			  float f, float f_1016_, float f_1017_, float f_1018_,
			  float f_1019_, float f_1020_, float f_1021_,
			  float f_1022_, float f_1023_, float f_1024_,
			  float f_1025_, float f_1026_) {
	if (!bool)
	    method2256(false, bool_1014_, bool_1015_, f, f_1016_, f_1017_,
		       f_1018_, f_1019_, f_1020_, f_1021_, f_1022_, f_1023_,
		       0);
	else if (aBool1510) {
	    aClass182_Sub2_1488.method3194((int) f_1018_, (int) f,
					   (int) f_1019_, (int) f_1016_,
					   (Class381.anIntArray3929
					    [(int) f_1024_ & 0xffff]),
					   -2117417798);
	    aClass182_Sub2_1488.method3194((int) f_1019_, (int) f_1016_,
					   (int) f_1020_, (int) f_1017_,
					   (Class381.anIntArray3929
					    [(int) f_1024_ & 0xffff]),
					   -2014653079);
	    aClass182_Sub2_1488.method3194((int) f_1020_, (int) f_1017_,
					   (int) f_1018_, (int) f,
					   (Class381.anIntArray3929
					    [(int) f_1024_ & 0xffff]),
					   -2135086628);
	} else {
	    float f_1027_ = f_1019_ - f_1018_;
	    float f_1028_ = f_1016_ - f;
	    float f_1029_ = f_1020_ - f_1018_;
	    float f_1030_ = f_1017_ - f;
	    float f_1031_ = f_1025_ - f_1024_;
	    float f_1032_ = f_1026_ - f_1024_;
	    float f_1033_ = f_1022_ - f_1021_;
	    float f_1034_ = f_1023_ - f_1021_;
	    float f_1035_;
	    if (f_1017_ != f_1016_)
		f_1035_ = (f_1020_ - f_1019_) / (f_1017_ - f_1016_);
	    else
		f_1035_ = 0.0F;
	    float f_1036_;
	    if (f_1016_ != f)
		f_1036_ = f_1027_ / f_1028_;
	    else
		f_1036_ = 0.0F;
	    float f_1037_;
	    if (f_1017_ != f)
		f_1037_ = f_1029_ / f_1030_;
	    else
		f_1037_ = 0.0F;
	    float f_1038_ = f_1027_ * f_1030_ - f_1029_ * f_1028_;
	    if (f_1038_ != 0.0F) {
		float f_1039_
		    = (f_1031_ * f_1030_ - f_1032_ * f_1028_) / f_1038_;
		float f_1040_
		    = (f_1032_ * f_1027_ - f_1031_ * f_1029_) / f_1038_;
		float f_1041_
		    = (f_1033_ * f_1030_ - f_1034_ * f_1028_) / f_1038_;
		float f_1042_
		    = (f_1034_ * f_1027_ - f_1033_ * f_1029_) / f_1038_;
		if (f <= f_1016_ && f <= f_1017_) {
		    if (!(f >= (float) anInt1495)) {
			if (f_1016_ > (float) anInt1495)
			    f_1016_ = (float) anInt1495;
			if (f_1017_ > (float) anInt1495)
			    f_1017_ = (float) anInt1495;
			f_1024_ = f_1024_ - f_1039_ * f_1018_ + f_1039_;
			f_1021_ = f_1021_ - f_1041_ * f_1018_ + f_1041_;
			if (f_1016_ < f_1017_) {
			    f_1020_ = f_1018_;
			    if (f < 0.0F) {
				f_1020_ -= f_1037_ * f;
				f_1018_ -= f_1036_ * f;
				f_1024_ -= f_1040_ * f;
				f_1021_ -= f_1042_ * f;
				f = 0.0F;
			    }
			    if (f_1016_ < 0.0F) {
				f_1019_ -= f_1035_ * f_1016_;
				f_1016_ = 0.0F;
			    }
			    if (f != f_1016_ && f_1037_ < f_1036_
				|| f == f_1016_ && f_1037_ > f_1035_) {
				f += 0.5F;
				f_1016_ += 0.5F;
				f_1017_
				    = (float) (int) (f_1017_ + 0.5F) - f_1016_;
				f_1016_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_1016_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_1020_, (int) f_1018_,
					       f_1024_, f_1039_, f_1021_,
					       f_1041_);
				    f_1020_ += f_1037_;
				    f_1018_ += f_1036_;
				    f_1024_ += f_1040_;
				    f_1021_ += f_1042_;
				    f += (float) anInt1498;
				}
				while (--f_1017_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_1020_, (int) f_1019_,
					       f_1024_, f_1039_, f_1021_,
					       f_1041_);
				    f_1020_ += f_1037_;
				    f_1019_ += f_1035_;
				    f_1024_ += f_1040_;
				    f_1021_ += f_1042_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_1016_ += 0.5F;
				f_1017_
				    = (float) (int) (f_1017_ + 0.5F) - f_1016_;
				f_1016_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_1016_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_1018_, (int) f_1020_,
					       f_1024_, f_1039_, f_1021_,
					       f_1041_);
				    f_1020_ += f_1037_;
				    f_1018_ += f_1036_;
				    f_1024_ += f_1040_;
				    f_1021_ += f_1042_;
				    f += (float) anInt1498;
				}
				while (--f_1017_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_1019_, (int) f_1020_,
					       f_1024_, f_1039_, f_1021_,
					       f_1041_);
				    f_1020_ += f_1037_;
				    f_1019_ += f_1035_;
				    f_1024_ += f_1040_;
				    f_1021_ += f_1042_;
				    f += (float) anInt1498;
				}
			    }
			} else {
			    f_1019_ = f_1018_;
			    if (f < 0.0F) {
				f_1019_ -= f_1037_ * f;
				f_1018_ -= f_1036_ * f;
				f_1024_ -= f_1040_ * f;
				f_1021_ -= f_1042_ * f;
				f = 0.0F;
			    }
			    if (f_1017_ < 0.0F) {
				f_1020_ -= f_1035_ * f_1017_;
				f_1017_ = 0.0F;
			    }
			    if (f != f_1017_ && f_1037_ < f_1036_
				|| f == f_1017_ && f_1035_ > f_1036_) {
				f += 0.5F;
				f_1017_ += 0.5F;
				f_1016_
				    = (float) (int) (f_1016_ + 0.5F) - f_1017_;
				f_1017_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_1017_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_1019_, (int) f_1018_,
					       f_1024_, f_1039_, f_1021_,
					       f_1041_);
				    f_1019_ += f_1037_;
				    f_1018_ += f_1036_;
				    f_1024_ += f_1040_;
				    f_1021_ += f_1042_;
				    f += (float) anInt1498;
				}
				while (--f_1016_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_1020_, (int) f_1018_,
					       f_1024_, f_1039_, f_1021_,
					       f_1041_);
				    f_1020_ += f_1035_;
				    f_1018_ += f_1036_;
				    f_1024_ += f_1040_;
				    f_1021_ += f_1042_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_1017_ += 0.5F;
				f_1016_
				    = (float) (int) (f_1016_ + 0.5F) - f_1017_;
				f_1017_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_1017_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_1018_, (int) f_1019_,
					       f_1024_, f_1039_, f_1021_,
					       f_1041_);
				    f_1019_ += f_1037_;
				    f_1018_ += f_1036_;
				    f_1024_ += f_1040_;
				    f_1021_ += f_1042_;
				    f += (float) anInt1498;
				}
				while (--f_1016_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f, 0, 0,
					       (int) f_1018_, (int) f_1020_,
					       f_1024_, f_1039_, f_1021_,
					       f_1041_);
				    f_1020_ += f_1035_;
				    f_1018_ += f_1036_;
				    f_1024_ += f_1040_;
				    f_1021_ += f_1042_;
				    f += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (f_1016_ <= f_1017_) {
		    if (!(f_1016_ >= (float) anInt1495)) {
			if (f_1017_ > (float) anInt1495)
			    f_1017_ = (float) anInt1495;
			if (f > (float) anInt1495)
			    f = (float) anInt1495;
			f_1025_ = f_1025_ - f_1039_ * f_1019_ + f_1039_;
			f_1022_ = f_1022_ - f_1041_ * f_1019_ + f_1041_;
			if (f_1017_ < f) {
			    f_1018_ = f_1019_;
			    if (f_1016_ < 0.0F) {
				f_1018_ -= f_1036_ * f_1016_;
				f_1019_ -= f_1035_ * f_1016_;
				f_1025_ -= f_1040_ * f_1016_;
				f_1022_ -= f_1042_ * f_1016_;
				f_1016_ = 0.0F;
			    }
			    if (f_1017_ < 0.0F) {
				f_1020_ -= f_1037_ * f_1017_;
				f_1017_ = 0.0F;
			    }
			    if (f_1016_ != f_1017_ && f_1036_ < f_1035_
				|| f_1016_ == f_1017_ && f_1036_ > f_1037_) {
				f_1016_ += 0.5F;
				f_1017_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_1017_;
				f_1017_ -= f_1016_;
				f_1016_
				    = (float) anIntArray1487[(int) f_1016_];
				while (--f_1017_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f_1016_,
					       0, 0, (int) f_1018_,
					       (int) f_1019_, f_1025_, f_1039_,
					       f_1022_, f_1041_);
				    f_1018_ += f_1036_;
				    f_1019_ += f_1035_;
				    f_1025_ += f_1040_;
				    f_1022_ += f_1042_;
				    f_1016_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f_1016_,
					       0, 0, (int) f_1018_,
					       (int) f_1020_, f_1025_, f_1039_,
					       f_1022_, f_1041_);
				    f_1018_ += f_1036_;
				    f_1020_ += f_1037_;
				    f_1025_ += f_1040_;
				    f_1022_ += f_1042_;
				    f_1016_ += (float) anInt1498;
				}
			    } else {
				f_1016_ += 0.5F;
				f_1017_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_1017_;
				f_1017_ -= f_1016_;
				f_1016_
				    = (float) anIntArray1487[(int) f_1016_];
				while (--f_1017_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f_1016_,
					       0, 0, (int) f_1019_,
					       (int) f_1018_, f_1025_, f_1039_,
					       f_1022_, f_1041_);
				    f_1018_ += f_1036_;
				    f_1019_ += f_1035_;
				    f_1025_ += f_1040_;
				    f_1022_ += f_1042_;
				    f_1016_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f_1016_,
					       0, 0, (int) f_1020_,
					       (int) f_1018_, f_1025_, f_1039_,
					       f_1022_, f_1041_);
				    f_1018_ += f_1036_;
				    f_1020_ += f_1037_;
				    f_1025_ += f_1040_;
				    f_1022_ += f_1042_;
				    f_1016_ += (float) anInt1498;
				}
			    }
			} else {
			    f_1020_ = f_1019_;
			    if (f_1016_ < 0.0F) {
				f_1020_ -= f_1036_ * f_1016_;
				f_1019_ -= f_1035_ * f_1016_;
				f_1025_ -= f_1040_ * f_1016_;
				f_1022_ -= f_1042_ * f_1016_;
				f_1016_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_1018_ -= f_1037_ * f;
				f = 0.0F;
			    }
			    if (f_1036_ < f_1035_) {
				f_1016_ += 0.5F;
				f += 0.5F;
				f_1017_ = (float) (int) (f_1017_ + 0.5F) - f;
				f -= f_1016_;
				f_1016_
				    = (float) anIntArray1487[(int) f_1016_];
				while (--f >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f_1016_,
					       0, 0, (int) f_1020_,
					       (int) f_1019_, f_1025_, f_1039_,
					       f_1022_, f_1041_);
				    f_1020_ += f_1036_;
				    f_1019_ += f_1035_;
				    f_1025_ += f_1040_;
				    f_1022_ += f_1042_;
				    f_1016_ += (float) anInt1498;
				}
				while (--f_1017_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f_1016_,
					       0, 0, (int) f_1018_,
					       (int) f_1019_, f_1025_, f_1039_,
					       f_1022_, f_1041_);
				    f_1018_ += f_1037_;
				    f_1019_ += f_1035_;
				    f_1025_ += f_1040_;
				    f_1022_ += f_1042_;
				    f_1016_ += (float) anInt1498;
				}
			    } else {
				f_1016_ += 0.5F;
				f += 0.5F;
				f_1017_ = (float) (int) (f_1017_ + 0.5F) - f;
				f -= f_1016_;
				f_1016_
				    = (float) anIntArray1487[(int) f_1016_];
				while (--f >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f_1016_,
					       0, 0, (int) f_1019_,
					       (int) f_1020_, f_1025_, f_1039_,
					       f_1022_, f_1041_);
				    f_1020_ += f_1036_;
				    f_1019_ += f_1035_;
				    f_1025_ += f_1040_;
				    f_1022_ += f_1042_;
				    f_1016_ += (float) anInt1498;
				}
				while (--f_1017_ >= 0.0F) {
				    method2244(bool_1014_, bool_1015_,
					       anIntArray1499, (int) f_1016_,
					       0, 0, (int) f_1019_,
					       (int) f_1018_, f_1025_, f_1039_,
					       f_1022_, f_1041_);
				    f_1018_ += f_1037_;
				    f_1019_ += f_1035_;
				    f_1025_ += f_1040_;
				    f_1022_ += f_1042_;
				    f_1016_ += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (!(f_1017_ >= (float) anInt1495)) {
		    if (f > (float) anInt1495)
			f = (float) anInt1495;
		    if (f_1016_ > (float) anInt1495)
			f_1016_ = (float) anInt1495;
		    f_1026_ = f_1026_ - f_1039_ * f_1020_ + f_1039_;
		    f_1023_ = f_1023_ - f_1041_ * f_1020_ + f_1041_;
		    if (f < f_1016_) {
			f_1019_ = f_1020_;
			if (f_1017_ < 0.0F) {
			    f_1019_ -= f_1035_ * f_1017_;
			    f_1020_ -= f_1037_ * f_1017_;
			    f_1026_ -= f_1040_ * f_1017_;
			    f_1023_ -= f_1042_ * f_1017_;
			    f_1017_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_1018_ -= f_1036_ * f;
			    f = 0.0F;
			}
			if (f_1035_ < f_1037_) {
			    f_1017_ += 0.5F;
			    f += 0.5F;
			    f_1016_ = (float) (int) (f_1016_ + 0.5F) - f;
			    f -= f_1017_;
			    f_1017_ = (float) anIntArray1487[(int) f_1017_];
			    while (--f >= 0.0F) {
				method2244(bool_1014_, bool_1015_,
					   anIntArray1499, (int) f_1017_, 0, 0,
					   (int) f_1019_, (int) f_1020_,
					   f_1026_, f_1039_, f_1023_, f_1041_);
				f_1019_ += f_1035_;
				f_1020_ += f_1037_;
				f_1026_ += f_1040_;
				f_1023_ += f_1042_;
				f_1017_ += (float) anInt1498;
			    }
			    while (--f_1016_ >= 0.0F) {
				method2244(bool_1014_, bool_1015_,
					   anIntArray1499, (int) f_1017_, 0, 0,
					   (int) f_1019_, (int) f_1018_,
					   f_1026_, f_1039_, f_1023_, f_1041_);
				f_1019_ += f_1035_;
				f_1018_ += f_1036_;
				f_1026_ += f_1040_;
				f_1023_ += f_1042_;
				f_1017_ += (float) anInt1498;
			    }
			} else {
			    f_1017_ += 0.5F;
			    f += 0.5F;
			    f_1016_ = (float) (int) (f_1016_ + 0.5F) - f;
			    f -= f_1017_;
			    f_1017_ = (float) anIntArray1487[(int) f_1017_];
			    while (--f >= 0.0F) {
				method2244(bool_1014_, bool_1015_,
					   anIntArray1499, (int) f_1017_, 0, 0,
					   (int) f_1020_, (int) f_1019_,
					   f_1026_, f_1039_, f_1023_, f_1041_);
				f_1019_ += f_1035_;
				f_1020_ += f_1037_;
				f_1026_ += f_1040_;
				f_1023_ += f_1042_;
				f_1017_ += (float) anInt1498;
			    }
			    while (--f_1016_ >= 0.0F) {
				method2244(bool_1014_, bool_1015_,
					   anIntArray1499, (int) f_1017_, 0, 0,
					   (int) f_1018_, (int) f_1019_,
					   f_1026_, f_1039_, f_1023_, f_1041_);
				f_1019_ += f_1035_;
				f_1018_ += f_1036_;
				f_1026_ += f_1040_;
				f_1023_ += f_1042_;
				f_1017_ += (float) anInt1498;
			    }
			}
		    } else {
			f_1018_ = f_1020_;
			if (f_1017_ < 0.0F) {
			    f_1018_ -= f_1035_ * f_1017_;
			    f_1020_ -= f_1037_ * f_1017_;
			    f_1026_ -= f_1040_ * f_1017_;
			    f_1023_ -= f_1042_ * f_1017_;
			    f_1017_ = 0.0F;
			}
			if (f_1016_ < 0.0F) {
			    f_1019_ -= f_1036_ * f_1016_;
			    f_1016_ = 0.0F;
			}
			if (f_1035_ < f_1037_) {
			    f_1017_ += 0.5F;
			    f_1016_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_1016_;
			    f_1016_ -= f_1017_;
			    f_1017_ = (float) anIntArray1487[(int) f_1017_];
			    while (--f_1016_ >= 0.0F) {
				method2244(bool_1014_, bool_1015_,
					   anIntArray1499, (int) f_1017_, 0, 0,
					   (int) f_1018_, (int) f_1020_,
					   f_1026_, f_1039_, f_1023_, f_1041_);
				f_1018_ += f_1035_;
				f_1020_ += f_1037_;
				f_1026_ += f_1040_;
				f_1023_ += f_1042_;
				f_1017_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2244(bool_1014_, bool_1015_,
					   anIntArray1499, (int) f_1017_, 0, 0,
					   (int) f_1019_, (int) f_1020_,
					   f_1026_, f_1039_, f_1023_, f_1041_);
				f_1019_ += f_1036_;
				f_1020_ += f_1037_;
				f_1026_ += f_1040_;
				f_1023_ += f_1042_;
				f_1017_ += (float) anInt1498;
			    }
			} else {
			    f_1017_ += 0.5F;
			    f_1016_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_1016_;
			    f_1016_ -= f_1017_;
			    f_1017_ = (float) anIntArray1487[(int) f_1017_];
			    while (--f_1016_ >= 0.0F) {
				method2244(bool_1014_, bool_1015_,
					   anIntArray1499, (int) f_1017_, 0, 0,
					   (int) f_1020_, (int) f_1018_,
					   f_1026_, f_1039_, f_1023_, f_1041_);
				f_1018_ += f_1035_;
				f_1020_ += f_1037_;
				f_1026_ += f_1040_;
				f_1023_ += f_1042_;
				f_1017_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2244(bool_1014_, bool_1015_,
					   anIntArray1499, (int) f_1017_, 0, 0,
					   (int) f_1020_, (int) f_1019_,
					   f_1026_, f_1039_, f_1023_, f_1041_);
				f_1019_ += f_1036_;
				f_1020_ += f_1037_;
				f_1026_ += f_1040_;
				f_1023_ += f_1042_;
				f_1017_ += (float) anInt1498;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method2267(boolean bool, boolean bool_1043_, boolean bool_1044_,
			  float f, float f_1045_, float f_1046_, float f_1047_,
			  float f_1048_, float f_1049_, float f_1050_,
			  float f_1051_, float f_1052_, int i) {
	if (aBool1510) {
	    aClass182_Sub2_1488.method3194((int) f_1047_, (int) f,
					   (int) f_1048_, (int) f_1045_, i,
					   -1941641870);
	    aClass182_Sub2_1488.method3194((int) f_1048_, (int) f_1045_,
					   (int) f_1049_, (int) f_1046_, i,
					   -2004648047);
	    aClass182_Sub2_1488.method3194((int) f_1049_, (int) f_1046_,
					   (int) f_1047_, (int) f, i,
					   -2111081728);
	} else {
	    float f_1053_ = f_1048_ - f_1047_;
	    float f_1054_ = f_1045_ - f;
	    float f_1055_ = f_1049_ - f_1047_;
	    float f_1056_ = f_1046_ - f;
	    float f_1057_ = f_1051_ - f_1050_;
	    float f_1058_ = f_1052_ - f_1050_;
	    float f_1059_ = 0.0F;
	    if (f_1045_ != f)
		f_1059_ = (f_1048_ - f_1047_) / (f_1045_ - f);
	    float f_1060_ = 0.0F;
	    if (f_1046_ != f_1045_)
		f_1060_ = (f_1049_ - f_1048_) / (f_1046_ - f_1045_);
	    float f_1061_ = 0.0F;
	    if (f_1046_ != f)
		f_1061_ = (f_1047_ - f_1049_) / (f - f_1046_);
	    float f_1062_ = f_1053_ * f_1056_ - f_1055_ * f_1054_;
	    if (f_1062_ != 0.0F) {
		float f_1063_
		    = (f_1057_ * f_1056_ - f_1058_ * f_1054_) / f_1062_;
		float f_1064_
		    = (f_1058_ * f_1053_ - f_1057_ * f_1055_) / f_1062_;
		if (f <= f_1045_ && f <= f_1046_) {
		    if (!(f >= (float) anInt1495)) {
			if (f_1045_ > (float) anInt1495)
			    f_1045_ = (float) anInt1495;
			if (f_1046_ > (float) anInt1495)
			    f_1046_ = (float) anInt1495;
			f_1050_ = f_1050_ - f_1063_ * f_1047_ + f_1063_;
			if (f_1045_ < f_1046_) {
			    f_1049_ = f_1047_;
			    if (f < 0.0F) {
				f_1049_ -= f_1061_ * f;
				f_1047_ -= f_1059_ * f;
				f_1050_ -= f_1064_ * f;
				f = 0.0F;
			    }
			    if (f_1045_ < 0.0F) {
				f_1048_ -= f_1060_ * f_1045_;
				f_1045_ = 0.0F;
			    }
			    if (f != f_1045_ && f_1061_ < f_1059_
				|| f == f_1045_ && f_1061_ > f_1060_) {
				f += 0.5F;
				f_1045_ += 0.5F;
				f_1046_
				    = (float) (int) (f_1046_ + 0.5F) - f_1045_;
				f_1045_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_1045_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_1049_, (int) f_1047_,
					       f_1050_, f_1063_);
				    f_1049_ += f_1061_;
				    f_1047_ += f_1059_;
				    f_1050_ += f_1064_;
				    f += (float) anInt1498;
				}
				while (--f_1046_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_1049_, (int) f_1048_,
					       f_1050_, f_1063_);
				    f_1049_ += f_1061_;
				    f_1048_ += f_1060_;
				    f_1050_ += f_1064_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_1045_ += 0.5F;
				f_1046_
				    = (float) (int) (f_1046_ + 0.5F) - f_1045_;
				f_1045_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_1045_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_1047_, (int) f_1049_,
					       f_1050_, f_1063_);
				    f_1049_ += f_1061_;
				    f_1047_ += f_1059_;
				    f_1050_ += f_1064_;
				    f += (float) anInt1498;
				}
				while (--f_1046_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_1048_, (int) f_1049_,
					       f_1050_, f_1063_);
				    f_1049_ += f_1061_;
				    f_1048_ += f_1060_;
				    f_1050_ += f_1064_;
				    f += (float) anInt1498;
				}
			    }
			} else {
			    f_1048_ = f_1047_;
			    if (f < 0.0F) {
				f_1048_ -= f_1061_ * f;
				f_1047_ -= f_1059_ * f;
				f_1050_ -= f_1064_ * f;
				f = 0.0F;
			    }
			    if (f_1046_ < 0.0F) {
				f_1049_ -= f_1060_ * f_1046_;
				f_1046_ = 0.0F;
			    }
			    if (f != f_1046_ && f_1061_ < f_1059_
				|| f == f_1046_ && f_1060_ > f_1059_) {
				f += 0.5F;
				f_1046_ += 0.5F;
				f_1045_
				    = (float) (int) (f_1045_ + 0.5F) - f_1046_;
				f_1046_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_1046_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_1048_, (int) f_1047_,
					       f_1050_, f_1063_);
				    f_1048_ += f_1061_;
				    f_1047_ += f_1059_;
				    f_1050_ += f_1064_;
				    f += (float) anInt1498;
				}
				while (--f_1045_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_1049_, (int) f_1047_,
					       f_1050_, f_1063_);
				    f_1049_ += f_1060_;
				    f_1047_ += f_1059_;
				    f_1050_ += f_1064_;
				    f += (float) anInt1498;
				}
			    } else {
				f += 0.5F;
				f_1046_ += 0.5F;
				f_1045_
				    = (float) (int) (f_1045_ + 0.5F) - f_1046_;
				f_1046_ -= f;
				f = (float) anIntArray1487[(int) f];
				while (--f_1046_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_1047_, (int) f_1048_,
					       f_1050_, f_1063_);
				    f_1048_ += f_1061_;
				    f_1047_ += f_1059_;
				    f_1050_ += f_1064_;
				    f += (float) anInt1498;
				}
				while (--f_1045_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f, i, 0,
					       (int) f_1047_, (int) f_1049_,
					       f_1050_, f_1063_);
				    f_1049_ += f_1060_;
				    f_1047_ += f_1059_;
				    f_1050_ += f_1064_;
				    f += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (f_1045_ <= f_1046_) {
		    if (!(f_1045_ >= (float) anInt1495)) {
			if (f_1046_ > (float) anInt1495)
			    f_1046_ = (float) anInt1495;
			if (f > (float) anInt1495)
			    f = (float) anInt1495;
			f_1051_ = f_1051_ - f_1063_ * f_1048_ + f_1063_;
			if (f_1046_ < f) {
			    f_1047_ = f_1048_;
			    if (f_1045_ < 0.0F) {
				f_1047_ -= f_1059_ * f_1045_;
				f_1048_ -= f_1060_ * f_1045_;
				f_1051_ -= f_1064_ * f_1045_;
				f_1045_ = 0.0F;
			    }
			    if (f_1046_ < 0.0F) {
				f_1049_ -= f_1061_ * f_1046_;
				f_1046_ = 0.0F;
			    }
			    if (f_1045_ != f_1046_ && f_1059_ < f_1060_
				|| f_1045_ == f_1046_ && f_1059_ > f_1061_) {
				f_1045_ += 0.5F;
				f_1046_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_1046_;
				f_1046_ -= f_1045_;
				f_1045_
				    = (float) anIntArray1487[(int) f_1045_];
				while (--f_1046_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f_1045_,
					       i, 0, (int) f_1047_,
					       (int) f_1048_, f_1051_,
					       f_1063_);
				    f_1047_ += f_1059_;
				    f_1048_ += f_1060_;
				    f_1051_ += f_1064_;
				    f_1045_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f_1045_,
					       i, 0, (int) f_1047_,
					       (int) f_1049_, f_1051_,
					       f_1063_);
				    f_1047_ += f_1059_;
				    f_1049_ += f_1061_;
				    f_1051_ += f_1064_;
				    f_1045_ += (float) anInt1498;
				}
			    } else {
				f_1045_ += 0.5F;
				f_1046_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_1046_;
				f_1046_ -= f_1045_;
				f_1045_
				    = (float) anIntArray1487[(int) f_1045_];
				while (--f_1046_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f_1045_,
					       i, 0, (int) f_1048_,
					       (int) f_1047_, f_1051_,
					       f_1063_);
				    f_1047_ += f_1059_;
				    f_1048_ += f_1060_;
				    f_1051_ += f_1064_;
				    f_1045_ += (float) anInt1498;
				}
				while (--f >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f_1045_,
					       i, 0, (int) f_1049_,
					       (int) f_1047_, f_1051_,
					       f_1063_);
				    f_1047_ += f_1059_;
				    f_1049_ += f_1061_;
				    f_1051_ += f_1064_;
				    f_1045_ += (float) anInt1498;
				}
			    }
			} else {
			    f_1049_ = f_1048_;
			    if (f_1045_ < 0.0F) {
				f_1049_ -= f_1059_ * f_1045_;
				f_1048_ -= f_1060_ * f_1045_;
				f_1051_ -= f_1064_ * f_1045_;
				f_1045_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_1047_ -= f_1061_ * f;
				f = 0.0F;
			    }
			    if (f_1059_ < f_1060_) {
				f_1045_ += 0.5F;
				f += 0.5F;
				f_1046_ = (float) (int) (f_1046_ + 0.5F) - f;
				f -= f_1045_;
				f_1045_
				    = (float) anIntArray1487[(int) f_1045_];
				while (--f >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f_1045_,
					       i, 0, (int) f_1049_,
					       (int) f_1048_, f_1051_,
					       f_1063_);
				    f_1049_ += f_1059_;
				    f_1048_ += f_1060_;
				    f_1051_ += f_1064_;
				    f_1045_ += (float) anInt1498;
				}
				while (--f_1046_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f_1045_,
					       i, 0, (int) f_1047_,
					       (int) f_1048_, f_1051_,
					       f_1063_);
				    f_1047_ += f_1061_;
				    f_1048_ += f_1060_;
				    f_1051_ += f_1064_;
				    f_1045_ += (float) anInt1498;
				}
			    } else {
				f_1045_ += 0.5F;
				f += 0.5F;
				f_1046_ = (float) (int) (f_1046_ + 0.5F) - f;
				f -= f_1045_;
				f_1045_
				    = (float) anIntArray1487[(int) f_1045_];
				while (--f >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f_1045_,
					       i, 0, (int) f_1048_,
					       (int) f_1049_, f_1051_,
					       f_1063_);
				    f_1049_ += f_1059_;
				    f_1048_ += f_1060_;
				    f_1051_ += f_1064_;
				    f_1045_ += (float) anInt1498;
				}
				while (--f_1046_ >= 0.0F) {
				    method2247(bool, bool_1043_, bool_1044_,
					       anIntArray1499, (int) f_1045_,
					       i, 0, (int) f_1048_,
					       (int) f_1047_, f_1051_,
					       f_1063_);
				    f_1047_ += f_1061_;
				    f_1048_ += f_1060_;
				    f_1051_ += f_1064_;
				    f_1045_ += (float) anInt1498;
				}
			    }
			}
		    }
		} else if (!(f_1046_ >= (float) anInt1495)) {
		    if (f > (float) anInt1495)
			f = (float) anInt1495;
		    if (f_1045_ > (float) anInt1495)
			f_1045_ = (float) anInt1495;
		    f_1052_ = f_1052_ - f_1063_ * f_1049_ + f_1063_;
		    if (f < f_1045_) {
			f_1048_ = f_1049_;
			if (f_1046_ < 0.0F) {
			    f_1048_ -= f_1060_ * f_1046_;
			    f_1049_ -= f_1061_ * f_1046_;
			    f_1052_ -= f_1064_ * f_1046_;
			    f_1046_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_1047_ -= f_1059_ * f;
			    f = 0.0F;
			}
			if (f_1060_ < f_1061_) {
			    f_1046_ += 0.5F;
			    f += 0.5F;
			    f_1045_ = (float) (int) (f_1045_ + 0.5F) - f;
			    f -= f_1046_;
			    f_1046_ = (float) anIntArray1487[(int) f_1046_];
			    while (--f >= 0.0F) {
				method2247(bool, bool_1043_, bool_1044_,
					   anIntArray1499, (int) f_1046_, i, 0,
					   (int) f_1048_, (int) f_1049_,
					   f_1052_, f_1063_);
				f_1048_ += f_1060_;
				f_1049_ += f_1061_;
				f_1052_ += f_1064_;
				f_1046_ += (float) anInt1498;
			    }
			    while (--f_1045_ >= 0.0F) {
				method2247(bool, bool_1043_, bool_1044_,
					   anIntArray1499, (int) f_1046_, i, 0,
					   (int) f_1048_, (int) f_1047_,
					   f_1052_, f_1063_);
				f_1048_ += f_1060_;
				f_1047_ += f_1059_;
				f_1052_ += f_1064_;
				f_1046_ += (float) anInt1498;
			    }
			} else {
			    f_1046_ += 0.5F;
			    f += 0.5F;
			    f_1045_ = (float) (int) (f_1045_ + 0.5F) - f;
			    f -= f_1046_;
			    f_1046_ = (float) anIntArray1487[(int) f_1046_];
			    while (--f >= 0.0F) {
				method2247(bool, bool_1043_, bool_1044_,
					   anIntArray1499, (int) f_1046_, i, 0,
					   (int) f_1049_, (int) f_1048_,
					   f_1052_, f_1063_);
				f_1048_ += f_1060_;
				f_1049_ += f_1061_;
				f_1052_ += f_1064_;
				f_1046_ += (float) anInt1498;
			    }
			    while (--f_1045_ >= 0.0F) {
				method2247(bool, bool_1043_, bool_1044_,
					   anIntArray1499, (int) f_1046_, i, 0,
					   (int) f_1047_, (int) f_1048_,
					   f_1052_, f_1063_);
				f_1048_ += f_1060_;
				f_1047_ += f_1059_;
				f_1052_ += f_1064_;
				f_1046_ += (float) anInt1498;
			    }
			}
		    } else {
			f_1047_ = f_1049_;
			if (f_1046_ < 0.0F) {
			    f_1047_ -= f_1060_ * f_1046_;
			    f_1049_ -= f_1061_ * f_1046_;
			    f_1052_ -= f_1064_ * f_1046_;
			    f_1046_ = 0.0F;
			}
			if (f_1045_ < 0.0F) {
			    f_1048_ -= f_1059_ * f_1045_;
			    f_1045_ = 0.0F;
			}
			if (f_1060_ < f_1061_) {
			    f_1046_ += 0.5F;
			    f_1045_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_1045_;
			    f_1045_ -= f_1046_;
			    f_1046_ = (float) anIntArray1487[(int) f_1046_];
			    while (--f_1045_ >= 0.0F) {
				method2247(bool, bool_1043_, bool_1044_,
					   anIntArray1499, (int) f_1046_, i, 0,
					   (int) f_1047_, (int) f_1049_,
					   f_1052_, f_1063_);
				f_1047_ += f_1060_;
				f_1049_ += f_1061_;
				f_1052_ += f_1064_;
				f_1046_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2247(bool, bool_1043_, bool_1044_,
					   anIntArray1499, (int) f_1046_, i, 0,
					   (int) f_1048_, (int) f_1049_,
					   f_1052_, f_1063_);
				f_1048_ += f_1059_;
				f_1049_ += f_1061_;
				f_1052_ += f_1064_;
				f_1046_ += (float) anInt1498;
			    }
			} else {
			    f_1046_ += 0.5F;
			    f_1045_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_1045_;
			    f_1045_ -= f_1046_;
			    f_1046_ = (float) anIntArray1487[(int) f_1046_];
			    while (--f_1045_ >= 0.0F) {
				method2247(bool, bool_1043_, bool_1044_,
					   anIntArray1499, (int) f_1046_, i, 0,
					   (int) f_1049_, (int) f_1047_,
					   f_1052_, f_1063_);
				f_1047_ += f_1060_;
				f_1049_ += f_1061_;
				f_1052_ += f_1064_;
				f_1046_ += (float) anInt1498;
			    }
			    while (--f >= 0.0F) {
				method2247(bool, bool_1043_, bool_1044_,
					   anIntArray1499, (int) f_1046_, i, 0,
					   (int) f_1049_, (int) f_1048_,
					   f_1052_, f_1063_);
				f_1048_ += f_1059_;
				f_1049_ += f_1061_;
				f_1052_ += f_1064_;
				f_1046_ += (float) anInt1498;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method2268(boolean bool, boolean bool_1065_, boolean bool_1066_,
			  int[] is, int i, int i_1067_, int i_1068_,
			  int i_1069_, int i_1070_, float f, float f_1071_) {
	if (aBool1485) {
	    if (i_1070_ > anInt1494)
		i_1070_ = anInt1494;
	    if (i_1069_ < 0)
		i_1069_ = 0;
	}
	if (i_1069_ < i_1070_) {
	    i += i_1069_ - 1;
	    i_1068_ = i_1070_ - i_1069_ >> 2;
	    f += f_1071_ * (float) i_1069_;
	    if (aClass110_1497.aBool1335) {
		if (anInt1486 == 0) {
		    while (--i_1068_ >= 0) {
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    if (bool)
				is[i] = i_1067_;
			    if (bool_1065_)
				aFloatArray1500[i] = f;
			}
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    if (bool)
				is[i] = i_1067_;
			    if (bool_1065_)
				aFloatArray1500[i] = f;
			}
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    if (bool)
				is[i] = i_1067_;
			    if (bool_1065_)
				aFloatArray1500[i] = f;
			}
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    if (bool)
				is[i] = i_1067_;
			    if (bool_1065_)
				aFloatArray1500[i] = f;
			}
			f += f_1071_;
		    }
		    i_1068_ = i_1070_ - i_1069_ & 0x3;
		    while (--i_1068_ >= 0) {
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    if (bool)
				is[i] = i_1067_;
			    if (bool_1065_)
				aFloatArray1500[i] = f;
			}
			f += f_1071_;
		    }
		} else if (anInt1486 == 254) {
		    if (i_1069_ != 0 && i_1070_ <= anInt1494 - 1) {
			while (--i_1068_ >= 0) {
			    i++;
			    if ((!bool_1065_ || f < aFloatArray1500[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1071_;
			    i++;
			    if ((!bool_1065_ || f < aFloatArray1500[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1071_;
			    i++;
			    if ((!bool_1065_ || f < aFloatArray1500[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1071_;
			    i++;
			    if ((!bool_1065_ || f < aFloatArray1500[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1071_;
			}
			i_1068_ = i_1070_ - i_1069_ & 0x3;
			while (--i_1068_ >= 0) {
			    i++;
			    if ((!bool_1065_ || f < aFloatArray1500[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_1071_;
			}
		    }
		} else {
		    int i_1072_ = anInt1486;
		    int i_1073_ = 256 - anInt1486;
		    i_1067_ = (((i_1067_ & 0xff00ff) * i_1073_ >> 8 & 0xff00ff)
			       + ((i_1067_ & 0xff00) * i_1073_ >> 8 & 0xff00));
		    while (--i_1068_ >= 0) {
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    if (bool) {
				int i_1074_ = is[i];
				if (bool_1066_)
				    is[i]
					= ((i_1073_ | i_1074_ >> 24) << 24
					   | (i_1067_
					      + (((i_1074_ & 0xff00ff)
						  * i_1072_) >> 8
						 & 0xff00ff)
					      + (((i_1074_ & 0xff00) * i_1072_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1067_
					   + (((i_1074_ & 0xff00ff) * i_1072_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1074_ & 0xff00) * i_1072_ >> 8
					      & 0xff00));
			    }
			    if (bool_1065_)
				aFloatArray1500[i] = f;
			}
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    if (bool) {
				int i_1075_ = is[i];
				if (bool_1066_)
				    is[i]
					= ((i_1073_ | i_1075_ >> 24) << 24
					   | (i_1067_
					      + (((i_1075_ & 0xff00ff)
						  * i_1072_) >> 8
						 & 0xff00ff)
					      + (((i_1075_ & 0xff00) * i_1072_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1067_
					   + (((i_1075_ & 0xff00ff) * i_1072_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1075_ & 0xff00) * i_1072_ >> 8
					      & 0xff00));
			    }
			    if (bool_1065_)
				aFloatArray1500[i] = f;
			}
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    if (bool) {
				int i_1076_ = is[i];
				if (bool_1066_)
				    is[i]
					= ((i_1073_ | i_1076_ >> 24) << 24
					   | (i_1067_
					      + (((i_1076_ & 0xff00ff)
						  * i_1072_) >> 8
						 & 0xff00ff)
					      + (((i_1076_ & 0xff00) * i_1072_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1067_
					   + (((i_1076_ & 0xff00ff) * i_1072_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1076_ & 0xff00) * i_1072_ >> 8
					      & 0xff00));
			    }
			    if (bool_1065_)
				aFloatArray1500[i] = f;
			}
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    if (bool) {
				int i_1077_ = is[i];
				if (bool_1066_)
				    is[i]
					= ((i_1073_ | i_1077_ >> 24) << 24
					   | (i_1067_
					      + (((i_1077_ & 0xff00ff)
						  * i_1072_) >> 8
						 & 0xff00ff)
					      + (((i_1077_ & 0xff00) * i_1072_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1067_
					   + (((i_1077_ & 0xff00ff) * i_1072_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1077_ & 0xff00) * i_1072_ >> 8
					      & 0xff00));
			    }
			    if (bool_1065_)
				aFloatArray1500[i] = f;
			}
			f += f_1071_;
		    }
		    i_1068_ = i_1070_ - i_1069_ & 0x3;
		    while (--i_1068_ >= 0) {
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    if (bool) {
				int i_1078_ = is[i];
				if (bool_1066_)
				    is[i]
					= ((i_1073_ | i_1078_ >> 24) << 24
					   | (i_1067_
					      + (((i_1078_ & 0xff00ff)
						  * i_1072_) >> 8
						 & 0xff00ff)
					      + (((i_1078_ & 0xff00) * i_1072_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_1067_
					   + (((i_1078_ & 0xff00ff) * i_1072_
					       >> 8)
					      & 0xff00ff)
					   + ((i_1078_ & 0xff00) * i_1072_ >> 8
					      & 0xff00));
			    }
			    if (bool_1065_)
				aFloatArray1500[i] = f;
			}
			f += f_1071_;
		    }
		}
	    } else if (bool) {
		if (anInt1486 == 0) {
		    while (--i_1068_ >= 0) {
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i])
			    is[i] = i_1067_;
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i])
			    is[i] = i_1067_;
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i])
			    is[i] = i_1067_;
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i])
			    is[i] = i_1067_;
			f += f_1071_;
		    }
		    i_1068_ = i_1070_ - i_1069_ & 0x3;
		    while (--i_1068_ >= 0) {
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i])
			    is[i] = i_1067_;
			f += f_1071_;
		    }
		} else if (anInt1486 == 254) {
		    if (i_1069_ != 0 && i_1070_ <= anInt1494 - 1) {
			while (--i_1068_ >= 0) {
			    i++;
			    if (!bool_1065_ || f < aFloatArray1500[i])
				is[i - 1] = is[i];
			    f += f_1071_;
			    i++;
			    if (!bool_1065_ || f < aFloatArray1500[i])
				is[i - 1] = is[i];
			    f += f_1071_;
			    i++;
			    if (!bool_1065_ || f < aFloatArray1500[i])
				is[i - 1] = is[i];
			    f += f_1071_;
			    i++;
			    if (!bool_1065_ || f < aFloatArray1500[i])
				is[i - 1] = is[i];
			    f += f_1071_;
			}
			i_1068_ = i_1070_ - i_1069_ & 0x3;
			while (--i_1068_ >= 0) {
			    i++;
			    if (!bool_1065_ || f < aFloatArray1500[i])
				is[i - 1] = is[i];
			    f += f_1071_;
			}
		    }
		} else {
		    int i_1079_ = anInt1486;
		    int i_1080_ = 256 - anInt1486;
		    i_1067_ = (((i_1067_ & 0xff00ff) * i_1080_ >> 8 & 0xff00ff)
			       + ((i_1067_ & 0xff00) * i_1080_ >> 8 & 0xff00));
		    while (--i_1068_ >= 0) {
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    int i_1081_ = is[i];
			    if (bool_1066_)
				is[i]
				    = ((i_1080_ | i_1081_ >> 24) << 24
				       | (i_1067_
					  + (((i_1081_ & 0xff00ff) * i_1079_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1081_ & 0xff00) * i_1079_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1067_
					 + ((i_1081_ & 0xff00ff) * i_1079_ >> 8
					    & 0xff00ff)
					 + ((i_1081_ & 0xff00) * i_1079_ >> 8
					    & 0xff00));
			}
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    int i_1082_ = is[i];
			    if (bool_1066_)
				is[i]
				    = ((i_1080_ | i_1082_ >> 24) << 24
				       | (i_1067_
					  + (((i_1082_ & 0xff00ff) * i_1079_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1082_ & 0xff00) * i_1079_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1067_
					 + ((i_1082_ & 0xff00ff) * i_1079_ >> 8
					    & 0xff00ff)
					 + ((i_1082_ & 0xff00) * i_1079_ >> 8
					    & 0xff00));
			}
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    int i_1083_ = is[i];
			    if (bool_1066_)
				is[i]
				    = ((i_1080_ | i_1083_ >> 24) << 24
				       | (i_1067_
					  + (((i_1083_ & 0xff00ff) * i_1079_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1083_ & 0xff00) * i_1079_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1067_
					 + ((i_1083_ & 0xff00ff) * i_1079_ >> 8
					    & 0xff00ff)
					 + ((i_1083_ & 0xff00) * i_1079_ >> 8
					    & 0xff00));
			}
			f += f_1071_;
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    int i_1084_ = is[i];
			    if (bool_1066_)
				is[i]
				    = ((i_1080_ | i_1084_ >> 24) << 24
				       | (i_1067_
					  + (((i_1084_ & 0xff00ff) * i_1079_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1084_ & 0xff00) * i_1079_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1067_
					 + ((i_1084_ & 0xff00ff) * i_1079_ >> 8
					    & 0xff00ff)
					 + ((i_1084_ & 0xff00) * i_1079_ >> 8
					    & 0xff00));
			}
			f += f_1071_;
		    }
		    i_1068_ = i_1070_ - i_1069_ & 0x3;
		    while (--i_1068_ >= 0) {
			i++;
			if (!bool_1065_ || f < aFloatArray1500[i]) {
			    int i_1085_ = is[i];
			    if (bool_1066_)
				is[i]
				    = ((i_1080_ | i_1085_ >> 24) << 24
				       | (i_1067_
					  + (((i_1085_ & 0xff00ff) * i_1079_
					      >> 8)
					     & 0xff00ff)
					  + ((i_1085_ & 0xff00) * i_1079_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_1067_
					 + ((i_1085_ & 0xff00ff) * i_1079_ >> 8
					    & 0xff00ff)
					 + ((i_1085_ & 0xff00) * i_1079_ >> 8
					    & 0xff00));
			}
			f += f_1071_;
		    }
		}
	    }
	}
    }
    
    final void method2269
	(boolean bool, boolean bool_1086_, boolean bool_1087_, float f,
	 float f_1088_, float f_1089_, float f_1090_, float f_1091_,
	 float f_1092_, float f_1093_, float f_1094_, float f_1095_,
	 float f_1096_, float f_1097_, float f_1098_, float f_1099_,
	 float f_1100_, float f_1101_, float f_1102_, float f_1103_,
	 float f_1104_, int i, int i_1105_, int i_1106_, int i_1107_,
	 float f_1108_, float f_1109_, float f_1110_, int i_1111_) {
	if (!bool)
	    method2256(false, bool_1086_, bool_1087_, f, f_1088_, f_1089_,
		       f_1090_, f_1091_, f_1092_, f_1093_, f_1094_, f_1095_,
		       0);
	else {
	    int i_1112_ = i_1111_ & 0xffff;
	    if (i_1112_ != anInt1502) {
		anIntArray1481 = aClass182_Sub2_1488.method15165(i_1112_);
		if (anIntArray1481 == null) {
		    anInt1502 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    anInt1496 = 0;
		    int i_1113_
			= (Class381.anIntArray3929
			   [Class504.method8313(aClass182_Sub2_1488
						    .method15168(i_1111_),
						967860329) & 0xffff]);
		    int i_1114_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1113_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1113_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1113_ & 0xff) >> 8);
		    method2243(true, bool_1086_, bool_1087_, f, f_1088_,
			       f_1089_, f_1090_, f_1091_, f_1092_, f_1093_,
			       f_1094_, f_1095_,
			       Class637.method10513(i_1114_, i_1107_, f_1108_,
						    1621366058),
			       Class637.method10513(i_1114_, i_1107_, f_1109_,
						    -2090167726),
			       Class637.method10513(i_1114_, i_1107_, f_1110_,
						    -2017535992));
		    return;
		}
		anInt1502 = i_1112_;
		anInt1504 = aClass182_Sub2_1488.method15209(i_1111_);
		anInt1505 = anInt1504 - 1;
		aClass597_1507 = aClass182_Sub2_1488.method15166(i_1111_);
		aBool1484 = aClass182_Sub2_1488.method15169(i_1111_);
		anInt1496 = aClass182_Sub2_1488.method15167(i_1111_) & 0xff;
	    }
	    anInt1501 = i_1107_;
	    if (!(f <= f_1088_) || !(f <= f_1089_)) {
		if (f_1088_ <= f_1089_) {
		    float f_1115_ = f_1090_;
		    f_1090_ = f_1091_;
		    f_1091_ = f_1115_;
		    f_1115_ = f;
		    f = f_1088_;
		    f_1088_ = f_1115_;
		    f_1115_ = f_1093_;
		    f_1093_ = f_1094_;
		    f_1094_ = f_1115_;
		    f_1115_ = f_1099_;
		    f_1099_ = f_1100_;
		    f_1100_ = f_1115_;
		    f_1115_ = f_1102_;
		    f_1102_ = f_1103_;
		    f_1103_ = f_1115_;
		    f_1115_ = f_1096_;
		    f_1096_ = f_1097_;
		    f_1097_ = f_1115_;
		    f_1115_ = f_1108_;
		    f_1108_ = f_1109_;
		    f_1109_ = f_1115_;
		    int i_1116_ = i;
		    i = i_1105_;
		    i_1105_ = i_1116_;
		} else {
		    float f_1117_ = f_1090_;
		    f_1090_ = f_1092_;
		    f_1092_ = f_1117_;
		    f_1117_ = f;
		    f = f_1089_;
		    f_1089_ = f_1117_;
		    f_1117_ = f_1093_;
		    f_1093_ = f_1095_;
		    f_1095_ = f_1117_;
		    f_1117_ = f_1099_;
		    f_1099_ = f_1101_;
		    f_1101_ = f_1117_;
		    f_1117_ = f_1102_;
		    f_1102_ = f_1104_;
		    f_1104_ = f_1117_;
		    f_1117_ = f_1096_;
		    f_1096_ = f_1098_;
		    f_1098_ = f_1117_;
		    f_1117_ = f_1108_;
		    f_1108_ = f_1110_;
		    f_1110_ = f_1117_;
		    int i_1118_ = i;
		    i = i_1106_;
		    i_1106_ = i_1118_;
		}
	    }
	    f_1099_ /= f_1096_;
	    f_1100_ /= f_1097_;
	    f_1101_ /= f_1098_;
	    f_1102_ /= f_1096_;
	    f_1103_ /= f_1097_;
	    f_1104_ /= f_1098_;
	    f_1093_ = 1.0F / f_1093_;
	    f_1094_ = 1.0F / f_1094_;
	    f_1095_ = 1.0F / f_1095_;
	    f_1096_ = 1.0F / f_1096_;
	    f_1097_ = 1.0F / f_1097_;
	    f_1098_ = 1.0F / f_1098_;
	    float f_1119_ = (float) (i >> 24 & 0xff);
	    float f_1120_ = (float) (i_1105_ >> 24 & 0xff);
	    float f_1121_ = (float) (i_1106_ >> 24 & 0xff);
	    float f_1122_ = (float) (i >> 16 & 0xff);
	    float f_1123_ = (float) (i_1105_ >> 16 & 0xff);
	    float f_1124_ = (float) (i_1106_ >> 16 & 0xff);
	    float f_1125_ = (float) (i >> 8 & 0xff);
	    float f_1126_ = (float) (i_1105_ >> 8 & 0xff);
	    float f_1127_ = (float) (i_1106_ >> 8 & 0xff);
	    float f_1128_ = (float) (i & 0xff);
	    float f_1129_ = (float) (i_1105_ & 0xff);
	    float f_1130_ = (float) (i_1106_ & 0xff);
	    float f_1131_ = 0.0F;
	    float f_1132_ = 0.0F;
	    float f_1133_ = 0.0F;
	    float f_1134_ = 0.0F;
	    float f_1135_ = 0.0F;
	    float f_1136_ = 0.0F;
	    float f_1137_ = 0.0F;
	    float f_1138_ = 0.0F;
	    float f_1139_ = 0.0F;
	    float f_1140_ = 0.0F;
	    if (f_1088_ != f) {
		float f_1141_ = f_1088_ - f;
		f_1131_ = (f_1091_ - f_1090_) / f_1141_;
		f_1132_ = (f_1094_ - f_1093_) / f_1141_;
		f_1133_ = (f_1097_ - f_1096_) / f_1141_;
		f_1134_ = (f_1100_ - f_1099_) / f_1141_;
		f_1135_ = (f_1103_ - f_1102_) / f_1141_;
		f_1136_ = (f_1109_ - f_1108_) / f_1141_;
		f_1137_ = (f_1120_ - f_1119_) / f_1141_;
		f_1138_ = (f_1123_ - f_1122_) / f_1141_;
		f_1139_ = (f_1126_ - f_1125_) / f_1141_;
		f_1140_ = (f_1129_ - f_1128_) / f_1141_;
	    }
	    float f_1142_ = 0.0F;
	    float f_1143_ = 0.0F;
	    float f_1144_ = 0.0F;
	    float f_1145_ = 0.0F;
	    float f_1146_ = 0.0F;
	    float f_1147_ = 0.0F;
	    float f_1148_ = 0.0F;
	    float f_1149_ = 0.0F;
	    float f_1150_ = 0.0F;
	    float f_1151_ = 0.0F;
	    if (f_1089_ != f_1088_) {
		float f_1152_ = f_1089_ - f_1088_;
		f_1142_ = (f_1092_ - f_1091_) / f_1152_;
		f_1143_ = (f_1095_ - f_1094_) / f_1152_;
		f_1144_ = (f_1098_ - f_1097_) / f_1152_;
		f_1145_ = (f_1101_ - f_1100_) / f_1152_;
		f_1146_ = (f_1104_ - f_1103_) / f_1152_;
		f_1147_ = (f_1110_ - f_1109_) / f_1152_;
		f_1148_ = (f_1121_ - f_1120_) / f_1152_;
		f_1149_ = (f_1124_ - f_1123_) / f_1152_;
		f_1150_ = (f_1127_ - f_1126_) / f_1152_;
		f_1151_ = (f_1130_ - f_1129_) / f_1152_;
	    }
	    float f_1153_ = 0.0F;
	    float f_1154_ = 0.0F;
	    float f_1155_ = 0.0F;
	    float f_1156_ = 0.0F;
	    float f_1157_ = 0.0F;
	    float f_1158_ = 0.0F;
	    float f_1159_ = 0.0F;
	    float f_1160_ = 0.0F;
	    float f_1161_ = 0.0F;
	    float f_1162_ = 0.0F;
	    if (f != f_1089_) {
		float f_1163_ = f - f_1089_;
		f_1153_ = (f_1090_ - f_1092_) / f_1163_;
		f_1154_ = (f_1093_ - f_1095_) / f_1163_;
		f_1155_ = (f_1096_ - f_1098_) / f_1163_;
		f_1156_ = (f_1099_ - f_1101_) / f_1163_;
		f_1157_ = (f_1102_ - f_1104_) / f_1163_;
		f_1158_ = (f_1108_ - f_1110_) / f_1163_;
		f_1159_ = (f_1119_ - f_1121_) / f_1163_;
		f_1160_ = (f_1122_ - f_1124_) / f_1163_;
		f_1161_ = (f_1125_ - f_1127_) / f_1163_;
		f_1162_ = (f_1128_ - f_1130_) / f_1163_;
	    }
	    if (!(f >= (float) anInt1495)) {
		if (f_1088_ > (float) anInt1495)
		    f_1088_ = (float) anInt1495;
		if (f_1089_ > (float) anInt1495)
		    f_1089_ = (float) anInt1495;
		if (f_1088_ < f_1089_) {
		    f_1092_ = f_1090_;
		    f_1095_ = f_1093_;
		    f_1098_ = f_1096_;
		    f_1101_ = f_1099_;
		    f_1104_ = f_1102_;
		    f_1110_ = f_1108_;
		    f_1121_ = f_1119_;
		    f_1124_ = f_1122_;
		    f_1127_ = f_1125_;
		    f_1130_ = f_1128_;
		    if (f < 0.0F) {
			f_1090_ -= f_1131_ * f;
			f_1092_ -= f_1153_ * f;
			f_1093_ -= f_1132_ * f;
			f_1095_ -= f_1154_ * f;
			f_1096_ -= f_1133_ * f;
			f_1098_ -= f_1155_ * f;
			f_1099_ -= f_1134_ * f;
			f_1101_ -= f_1156_ * f;
			f_1102_ -= f_1135_ * f;
			f_1104_ -= f_1157_ * f;
			f_1108_ -= f_1136_ * f;
			f_1110_ -= f_1158_ * f;
			f_1119_ -= f_1137_ * f;
			f_1121_ -= f_1159_ * f;
			f_1122_ -= f_1137_ * f;
			f_1124_ -= f_1159_ * f;
			f_1125_ -= f_1137_ * f;
			f_1127_ -= f_1159_ * f;
			f_1128_ -= f_1137_ * f;
			f_1130_ -= f_1159_ * f;
			f = 0.0F;
		    }
		    if (f_1088_ < 0.0F) {
			f_1091_ -= f_1142_ * f_1088_;
			f_1094_ -= f_1143_ * f_1088_;
			f_1097_ -= f_1144_ * f_1088_;
			f_1100_ -= f_1145_ * f_1088_;
			f_1103_ -= f_1146_ * f_1088_;
			f_1109_ -= f_1147_ * f_1088_;
			f_1120_ -= f_1148_ * f_1088_;
			f_1123_ -= f_1149_ * f_1088_;
			f_1126_ -= f_1150_ * f_1088_;
			f_1129_ -= f_1151_ * f_1088_;
			f_1088_ = 0.0F;
		    }
		    if (f != f_1088_ && f_1153_ < f_1131_
			|| f == f_1088_ && f_1153_ > f_1142_) {
			f += 0.5F;
			f_1088_ += 0.5F;
			f_1089_ = (float) (int) (f_1089_ + 0.5F) - f_1088_;
			f_1088_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_1088_ >= 0.0F) {
			    method2246(bool_1086_, bool_1087_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_1092_,
				       (int) f_1090_, f_1095_, f_1093_,
				       f_1098_, f_1096_, f_1101_, f_1099_,
				       f_1104_, f_1102_, f_1110_, f_1108_,
				       f_1121_, f_1119_, f_1124_, f_1122_,
				       f_1127_, f_1125_, f_1130_, f_1128_);
			    f_1090_ += f_1131_;
			    f_1092_ += f_1153_;
			    f_1093_ += f_1132_;
			    f_1095_ += f_1154_;
			    f_1096_ += f_1133_;
			    f_1098_ += f_1155_;
			    f_1099_ += f_1134_;
			    f_1101_ += f_1156_;
			    f_1102_ += f_1135_;
			    f_1104_ += f_1157_;
			    f_1108_ += f_1136_;
			    f_1110_ += f_1158_;
			    f_1119_ += f_1137_;
			    f_1121_ += f_1159_;
			    f_1122_ += f_1138_;
			    f_1124_ += f_1160_;
			    f_1125_ += f_1139_;
			    f_1127_ += f_1161_;
			    f_1128_ += f_1140_;
			    f_1130_ += f_1162_;
			    f += (float) anInt1498;
			}
			while (--f_1089_ >= 0.0F) {
			    method2246(bool_1086_, bool_1087_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_1092_,
				       (int) f_1091_, f_1095_, f_1094_,
				       f_1098_, f_1097_, f_1101_, f_1100_,
				       f_1104_, f_1103_, f_1110_, f_1109_,
				       f_1121_, f_1120_, f_1124_, f_1123_,
				       f_1127_, f_1126_, f_1130_, f_1129_);
			    f_1091_ += f_1142_;
			    f_1092_ += f_1153_;
			    f_1094_ += f_1143_;
			    f_1095_ += f_1154_;
			    f_1097_ += f_1144_;
			    f_1098_ += f_1155_;
			    f_1100_ += f_1145_;
			    f_1101_ += f_1156_;
			    f_1103_ += f_1146_;
			    f_1104_ += f_1157_;
			    f_1109_ += f_1147_;
			    f_1110_ += f_1158_;
			    f_1120_ += f_1148_;
			    f_1121_ += f_1159_;
			    f_1123_ += f_1149_;
			    f_1124_ += f_1160_;
			    f_1126_ += f_1150_;
			    f_1127_ += f_1161_;
			    f_1129_ += f_1151_;
			    f_1130_ += f_1162_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_1088_ += 0.5F;
			f_1089_ = (float) (int) (f_1089_ + 0.5F) - f_1088_;
			f_1088_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_1088_ >= 0.0F) {
			    method2246(bool_1086_, bool_1087_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_1090_,
				       (int) f_1092_, f_1093_, f_1095_,
				       f_1096_, f_1098_, f_1099_, f_1101_,
				       f_1102_, f_1104_, f_1108_, f_1110_,
				       f_1119_, f_1121_, f_1122_, f_1124_,
				       f_1125_, f_1127_, f_1128_, f_1130_);
			    f_1090_ += f_1131_;
			    f_1092_ += f_1153_;
			    f_1093_ += f_1132_;
			    f_1095_ += f_1154_;
			    f_1096_ += f_1133_;
			    f_1098_ += f_1155_;
			    f_1099_ += f_1134_;
			    f_1101_ += f_1156_;
			    f_1102_ += f_1135_;
			    f_1104_ += f_1157_;
			    f_1108_ += f_1136_;
			    f_1110_ += f_1158_;
			    f_1119_ += f_1137_;
			    f_1121_ += f_1159_;
			    f_1122_ += f_1138_;
			    f_1124_ += f_1160_;
			    f_1125_ += f_1139_;
			    f_1127_ += f_1161_;
			    f_1128_ += f_1140_;
			    f_1130_ += f_1162_;
			    f += (float) anInt1498;
			}
			while (--f_1089_ >= 0.0F) {
			    method2246(bool_1086_, bool_1087_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_1091_,
				       (int) f_1092_, f_1094_, f_1095_,
				       f_1097_, f_1098_, f_1100_, f_1101_,
				       f_1103_, f_1104_, f_1109_, f_1110_,
				       f_1120_, f_1121_, f_1123_, f_1124_,
				       f_1126_, f_1127_, f_1129_, f_1130_);
			    f_1091_ += f_1142_;
			    f_1092_ += f_1153_;
			    f_1094_ += f_1143_;
			    f_1095_ += f_1154_;
			    f_1097_ += f_1144_;
			    f_1098_ += f_1155_;
			    f_1100_ += f_1145_;
			    f_1101_ += f_1156_;
			    f_1103_ += f_1146_;
			    f_1104_ += f_1157_;
			    f_1109_ += f_1147_;
			    f_1110_ += f_1158_;
			    f_1120_ += f_1148_;
			    f_1121_ += f_1159_;
			    f_1123_ += f_1149_;
			    f_1124_ += f_1160_;
			    f_1126_ += f_1150_;
			    f_1127_ += f_1161_;
			    f_1129_ += f_1151_;
			    f_1130_ += f_1162_;
			    f += (float) anInt1498;
			}
		    }
		} else {
		    f_1091_ = f_1090_;
		    f_1094_ = f_1093_;
		    f_1097_ = f_1096_;
		    f_1100_ = f_1099_;
		    f_1103_ = f_1102_;
		    f_1109_ = f_1108_;
		    f_1120_ = f_1119_;
		    f_1123_ = f_1122_;
		    f_1126_ = f_1125_;
		    f_1129_ = f_1128_;
		    if (f < 0.0F) {
			f_1090_ -= f_1131_ * f;
			f_1091_ -= f_1153_ * f;
			f_1093_ -= f_1132_ * f;
			f_1094_ -= f_1154_ * f;
			f_1096_ -= f_1133_ * f;
			f_1097_ -= f_1155_ * f;
			f_1099_ -= f_1134_ * f;
			f_1100_ -= f_1156_ * f;
			f_1102_ -= f_1135_ * f;
			f_1103_ -= f_1157_ * f;
			f_1108_ -= f_1136_ * f;
			f_1109_ -= f_1158_ * f;
			f_1119_ -= f_1137_ * f;
			f_1120_ -= f_1159_ * f;
			f_1122_ -= f_1137_ * f;
			f_1123_ -= f_1159_ * f;
			f_1125_ -= f_1137_ * f;
			f_1126_ -= f_1159_ * f;
			f_1128_ -= f_1137_ * f;
			f_1129_ -= f_1159_ * f;
			f = 0.0F;
		    }
		    if (f_1089_ < 0.0F) {
			f_1092_ -= f_1142_ * f_1089_;
			f_1095_ -= f_1143_ * f_1089_;
			f_1098_ -= f_1144_ * f_1089_;
			f_1101_ -= f_1145_ * f_1089_;
			f_1104_ -= f_1146_ * f_1089_;
			f_1110_ -= f_1147_ * f_1089_;
			f_1121_ -= f_1148_ * f_1089_;
			f_1124_ -= f_1149_ * f_1089_;
			f_1127_ -= f_1150_ * f_1089_;
			f_1130_ -= f_1151_ * f_1089_;
			f_1089_ = 0.0F;
		    }
		    if (f != f_1089_ && f_1153_ < f_1131_
			|| f == f_1089_ && f_1142_ > f_1131_) {
			f += 0.5F;
			f_1089_ += 0.5F;
			f_1088_ = (float) (int) (f_1088_ + 0.5F) - f_1089_;
			f_1089_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_1089_ >= 0.0F) {
			    method2246(bool_1086_, bool_1087_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_1091_,
				       (int) f_1090_, f_1094_, f_1093_,
				       f_1097_, f_1096_, f_1100_, f_1099_,
				       f_1103_, f_1102_, f_1109_, f_1108_,
				       f_1120_, f_1119_, f_1123_, f_1122_,
				       f_1126_, f_1125_, f_1129_, f_1128_);
			    f_1090_ += f_1131_;
			    f_1091_ += f_1153_;
			    f_1093_ += f_1132_;
			    f_1094_ += f_1154_;
			    f_1096_ += f_1133_;
			    f_1097_ += f_1155_;
			    f_1099_ += f_1134_;
			    f_1100_ += f_1156_;
			    f_1102_ += f_1135_;
			    f_1103_ += f_1157_;
			    f_1108_ += f_1136_;
			    f_1109_ += f_1158_;
			    f_1119_ += f_1137_;
			    f_1120_ += f_1159_;
			    f_1122_ += f_1138_;
			    f_1123_ += f_1160_;
			    f_1125_ += f_1139_;
			    f_1126_ += f_1161_;
			    f_1128_ += f_1140_;
			    f_1129_ += f_1162_;
			    f += (float) anInt1498;
			}
			while (--f_1088_ >= 0.0F) {
			    method2246(bool_1086_, bool_1087_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_1092_,
				       (int) f_1090_, f_1095_, f_1093_,
				       f_1098_, f_1096_, f_1101_, f_1099_,
				       f_1104_, f_1102_, f_1110_, f_1108_,
				       f_1121_, f_1119_, f_1124_, f_1122_,
				       f_1127_, f_1125_, f_1130_, f_1128_);
			    f_1092_ += f_1142_;
			    f_1090_ += f_1131_;
			    f_1095_ += f_1143_;
			    f_1093_ += f_1132_;
			    f_1098_ += f_1144_;
			    f_1096_ += f_1133_;
			    f_1101_ += f_1145_;
			    f_1099_ += f_1134_;
			    f_1104_ += f_1146_;
			    f_1102_ += f_1135_;
			    f_1110_ += f_1147_;
			    f_1108_ += f_1136_;
			    f_1121_ += f_1148_;
			    f_1119_ += f_1137_;
			    f_1124_ += f_1149_;
			    f_1122_ += f_1138_;
			    f_1127_ += f_1150_;
			    f_1125_ += f_1139_;
			    f_1130_ += f_1151_;
			    f_1128_ += f_1140_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_1089_ += 0.5F;
			f_1088_ = (float) (int) (f_1088_ + 0.5F) - f_1089_;
			f_1089_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_1089_ >= 0.0F) {
			    method2246(bool_1086_, bool_1087_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_1090_,
				       (int) f_1091_, f_1093_, f_1094_,
				       f_1096_, f_1097_, f_1099_, f_1100_,
				       f_1102_, f_1103_, f_1108_, f_1109_,
				       f_1119_, f_1120_, f_1122_, f_1123_,
				       f_1125_, f_1126_, f_1128_, f_1129_);
			    f_1091_ += f_1153_;
			    f_1090_ += f_1131_;
			    f_1094_ += f_1154_;
			    f_1093_ += f_1132_;
			    f_1097_ += f_1155_;
			    f_1096_ += f_1133_;
			    f_1100_ += f_1156_;
			    f_1099_ += f_1134_;
			    f_1103_ += f_1157_;
			    f_1102_ += f_1135_;
			    f_1109_ += f_1158_;
			    f_1108_ += f_1136_;
			    f_1120_ += f_1159_;
			    f_1119_ += f_1137_;
			    f_1123_ += f_1160_;
			    f_1122_ += f_1138_;
			    f_1126_ += f_1161_;
			    f_1125_ += f_1139_;
			    f_1129_ += f_1162_;
			    f_1128_ += f_1140_;
			    f += (float) anInt1498;
			}
			while (--f_1088_ >= 0.0F) {
			    method2246(bool_1086_, bool_1087_, anIntArray1499,
				       anIntArray1481, (int) f, (int) f_1090_,
				       (int) f_1092_, f_1093_, f_1095_,
				       f_1096_, f_1098_, f_1099_, f_1101_,
				       f_1102_, f_1104_, f_1108_, f_1110_,
				       f_1119_, f_1121_, f_1122_, f_1124_,
				       f_1125_, f_1127_, f_1128_, f_1130_);
			    f_1090_ += f_1131_;
			    f_1092_ += f_1142_;
			    f_1093_ += f_1132_;
			    f_1095_ += f_1143_;
			    f_1096_ += f_1133_;
			    f_1098_ += f_1144_;
			    f_1099_ += f_1134_;
			    f_1101_ += f_1145_;
			    f_1102_ += f_1135_;
			    f_1104_ += f_1146_;
			    f_1108_ += f_1136_;
			    f_1110_ += f_1147_;
			    f_1119_ += f_1137_;
			    f_1121_ += f_1148_;
			    f_1122_ += f_1138_;
			    f_1124_ += f_1149_;
			    f_1125_ += f_1139_;
			    f_1127_ += f_1150_;
			    f_1128_ += f_1140_;
			    f_1130_ += f_1151_;
			    f += (float) anInt1498;
			}
		    }
		}
	    }
	}
    }
    
    final void method2270
	(boolean bool, boolean bool_1164_, int[] is, int[] is_1165_, int i,
	 int i_1166_, int i_1167_, float f, float f_1168_, float f_1169_,
	 float f_1170_, float f_1171_, float f_1172_, float f_1173_,
	 float f_1174_, float f_1175_, float f_1176_, float f_1177_,
	 float f_1178_, float f_1179_, float f_1180_, float f_1181_,
	 float f_1182_, float f_1183_, float f_1184_) {
	int i_1185_ = i_1167_ - i_1166_;
	float f_1186_ = 1.0F / (float) i_1185_;
	float f_1187_ = (f_1168_ - f) * f_1186_;
	float f_1188_ = (f_1170_ - f_1169_) * f_1186_;
	float f_1189_ = (f_1172_ - f_1171_) * f_1186_;
	float f_1190_ = (f_1174_ - f_1173_) * f_1186_;
	float f_1191_ = (f_1176_ - f_1175_) * f_1186_;
	float f_1192_ = (f_1178_ - f_1177_) * f_1186_;
	float f_1193_ = (f_1180_ - f_1179_) * f_1186_;
	float f_1194_ = (f_1182_ - f_1181_) * f_1186_;
	float f_1195_ = (f_1184_ - f_1183_) * f_1186_;
	if (aBool1485) {
	    if (i_1167_ > anInt1494)
		i_1167_ = anInt1494;
	    if (i_1166_ < 0) {
		f -= f_1187_ * (float) i_1166_;
		f_1169_ -= f_1188_ * (float) i_1166_;
		f_1171_ -= f_1189_ * (float) i_1166_;
		f_1173_ -= f_1190_ * (float) i_1166_;
		f_1175_ -= f_1191_ * (float) i_1166_;
		f_1177_ -= f_1192_ * (float) i_1166_;
		f_1179_ -= f_1193_ * (float) i_1166_;
		f_1181_ -= f_1194_ * (float) i_1166_;
		f_1183_ -= f_1195_ * (float) i_1166_;
		i_1166_ = 0;
	    }
	}
	if (i_1166_ < i_1167_) {
	    i_1185_ = i_1167_ - i_1166_;
	    i += i_1166_;
	    while (i_1185_-- > 0) {
		float f_1196_ = 1.0F / f;
		float f_1197_ = 1.0F / f_1169_;
		if (!bool || f_1196_ < aFloatArray1500[i]) {
		    int i_1198_
			= (int) (f_1171_ * f_1197_ * (float) anInt1504);
		    if (aBool1484)
			i_1198_ &= anInt1505;
		    else if (i_1198_ < 0)
			i_1198_ = 0;
		    else if (i_1198_ > anInt1505)
			i_1198_ = anInt1505;
		    int i_1199_
			= (int) (f_1173_ * f_1197_ * (float) anInt1504);
		    if (aBool1484)
			i_1199_ &= anInt1505;
		    else if (i_1199_ < 0)
			i_1199_ = 0;
		    else if (i_1199_ > anInt1505)
			i_1199_ = anInt1505;
		    int i_1200_
			= anIntArray1481[i_1199_ * anInt1504 + i_1198_];
		    int i_1201_ = 255;
		    if (aClass597_1507 == Class597.aClass597_7841)
			i_1201_ = (int) ((float) (i_1200_ >> 24 & 0xff)
					 * f_1177_ / 255.0F);
		    else if (aClass597_1507 == Class597.aClass597_7843) {
			if ((i_1200_ >> 24 & 0xff) > anInt1496)
			    i_1201_ = 255;
			else
			    i_1201_ = 0;
		    } else
			i_1201_ = (int) f_1177_;
		    if (i_1201_ != 0) {
			if (i_1201_ != 255) {
			    int i_1202_
				= (~0xffffff
				   | ((int) (f_1179_ * (float) (i_1200_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1181_
					     * (float) (i_1200_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1183_
					    * (float) (i_1200_ & 0xff)) >> 8);
			    if (f_1175_ != 0.0F) {
				int i_1203_ = (int) (255.0F - f_1175_);
				int i_1204_
				    = ((((anInt1501 & 0xff00ff) * (int) f_1175_
					 & ~0xff00ff)
					| ((anInt1501 & 0xff00) * (int) f_1175_
					   & 0xff0000))
				       >>> 8);
				i_1202_ = ((((i_1202_ & 0xff00ff) * i_1203_
					     & ~0xff00ff)
					    | ((i_1202_ & 0xff00) * i_1203_
					       & 0xff0000))
					   >>> 8) + i_1204_;
			    }
			    int i_1205_ = is[i];
			    int i_1206_ = 255 - i_1201_;
			    i_1202_ = ((((i_1205_ & 0xff00ff) * i_1206_
					 + (i_1202_ & 0xff00ff) * i_1201_)
					& ~0xff00ff)
				       + (((i_1205_ & 0xff00) * i_1206_
					   + (i_1202_ & 0xff00) * i_1201_)
					  & 0xff0000)) >> 8;
			    if (bool_1164_)
				is[i]
				    = (i_1201_ | is[i] >> 24) << 24 | i_1202_;
			    else
				is[i] = i_1202_;
			    if (bool)
				aFloatArray1500[i] = f_1196_;
			} else {
			    int i_1207_
				= (~0xffffff
				   | ((int) (f_1179_ * (float) (i_1200_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1181_
					     * (float) (i_1200_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1183_
					    * (float) (i_1200_ & 0xff)) >> 8);
			    if (f_1175_ != 0.0F) {
				int i_1208_ = (int) (255.0F - f_1175_);
				int i_1209_
				    = ((((anInt1501 & 0xff00ff) * (int) f_1175_
					 & ~0xff00ff)
					| ((anInt1501 & 0xff00) * (int) f_1175_
					   & 0xff0000))
				       >>> 8);
				i_1207_ = ((((i_1207_ & 0xff00ff) * i_1208_
					     & ~0xff00ff)
					    | ((i_1207_ & 0xff00) * i_1208_
					       & 0xff0000))
					   >>> 8) + i_1209_;
			    }
			    if (bool_1164_)
				is[i] = i_1201_ << 24 | i_1207_;
			    else
				is[i] = i_1207_;
			    if (bool)
				aFloatArray1500[i] = f_1196_;
			}
		    }
		}
		i++;
		f += f_1187_;
		f_1169_ += f_1188_;
		f_1171_ += f_1189_;
		f_1173_ += f_1190_;
		f_1175_ += f_1191_;
		f_1177_ += f_1192_;
		f_1179_ += f_1193_;
		f_1181_ += f_1194_;
		f_1183_ += f_1195_;
	    }
	}
    }
    
    final void method2271
	(boolean bool, boolean bool_1210_, int[] is, int[] is_1211_, int i,
	 int i_1212_, int i_1213_, float f, float f_1214_, float f_1215_,
	 float f_1216_, float f_1217_, float f_1218_, float f_1219_,
	 float f_1220_, float f_1221_, float f_1222_, float f_1223_,
	 float f_1224_, float f_1225_, float f_1226_, float f_1227_,
	 float f_1228_, float f_1229_, float f_1230_) {
	int i_1231_ = i_1213_ - i_1212_;
	float f_1232_ = 1.0F / (float) i_1231_;
	float f_1233_ = (f_1214_ - f) * f_1232_;
	float f_1234_ = (f_1216_ - f_1215_) * f_1232_;
	float f_1235_ = (f_1218_ - f_1217_) * f_1232_;
	float f_1236_ = (f_1220_ - f_1219_) * f_1232_;
	float f_1237_ = (f_1222_ - f_1221_) * f_1232_;
	float f_1238_ = (f_1224_ - f_1223_) * f_1232_;
	float f_1239_ = (f_1226_ - f_1225_) * f_1232_;
	float f_1240_ = (f_1228_ - f_1227_) * f_1232_;
	float f_1241_ = (f_1230_ - f_1229_) * f_1232_;
	if (aBool1485) {
	    if (i_1213_ > anInt1494)
		i_1213_ = anInt1494;
	    if (i_1212_ < 0) {
		f -= f_1233_ * (float) i_1212_;
		f_1215_ -= f_1234_ * (float) i_1212_;
		f_1217_ -= f_1235_ * (float) i_1212_;
		f_1219_ -= f_1236_ * (float) i_1212_;
		f_1221_ -= f_1237_ * (float) i_1212_;
		f_1223_ -= f_1238_ * (float) i_1212_;
		f_1225_ -= f_1239_ * (float) i_1212_;
		f_1227_ -= f_1240_ * (float) i_1212_;
		f_1229_ -= f_1241_ * (float) i_1212_;
		i_1212_ = 0;
	    }
	}
	if (i_1212_ < i_1213_) {
	    i_1231_ = i_1213_ - i_1212_;
	    i += i_1212_;
	    while (i_1231_-- > 0) {
		float f_1242_ = 1.0F / f;
		float f_1243_ = 1.0F / f_1215_;
		if (!bool || f_1242_ < aFloatArray1500[i]) {
		    int i_1244_
			= (int) (f_1217_ * f_1243_ * (float) anInt1504);
		    if (aBool1484)
			i_1244_ &= anInt1505;
		    else if (i_1244_ < 0)
			i_1244_ = 0;
		    else if (i_1244_ > anInt1505)
			i_1244_ = anInt1505;
		    int i_1245_
			= (int) (f_1219_ * f_1243_ * (float) anInt1504);
		    if (aBool1484)
			i_1245_ &= anInt1505;
		    else if (i_1245_ < 0)
			i_1245_ = 0;
		    else if (i_1245_ > anInt1505)
			i_1245_ = anInt1505;
		    int i_1246_
			= anIntArray1481[i_1245_ * anInt1504 + i_1244_];
		    int i_1247_ = 255;
		    if (aClass597_1507 == Class597.aClass597_7841)
			i_1247_ = (int) ((float) (i_1246_ >> 24 & 0xff)
					 * f_1223_ / 255.0F);
		    else if (aClass597_1507 == Class597.aClass597_7843) {
			if ((i_1246_ >> 24 & 0xff) > anInt1496)
			    i_1247_ = 255;
			else
			    i_1247_ = 0;
		    } else
			i_1247_ = (int) f_1223_;
		    if (i_1247_ != 0) {
			if (i_1247_ != 255) {
			    int i_1248_
				= (~0xffffff
				   | ((int) (f_1225_ * (float) (i_1246_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1227_
					     * (float) (i_1246_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1229_
					    * (float) (i_1246_ & 0xff)) >> 8);
			    if (f_1221_ != 0.0F) {
				int i_1249_ = (int) (255.0F - f_1221_);
				int i_1250_
				    = ((((anInt1501 & 0xff00ff) * (int) f_1221_
					 & ~0xff00ff)
					| ((anInt1501 & 0xff00) * (int) f_1221_
					   & 0xff0000))
				       >>> 8);
				i_1248_ = ((((i_1248_ & 0xff00ff) * i_1249_
					     & ~0xff00ff)
					    | ((i_1248_ & 0xff00) * i_1249_
					       & 0xff0000))
					   >>> 8) + i_1250_;
			    }
			    int i_1251_ = is[i];
			    int i_1252_ = 255 - i_1247_;
			    i_1248_ = ((((i_1251_ & 0xff00ff) * i_1252_
					 + (i_1248_ & 0xff00ff) * i_1247_)
					& ~0xff00ff)
				       + (((i_1251_ & 0xff00) * i_1252_
					   + (i_1248_ & 0xff00) * i_1247_)
					  & 0xff0000)) >> 8;
			    if (bool_1210_)
				is[i]
				    = (i_1247_ | is[i] >> 24) << 24 | i_1248_;
			    else
				is[i] = i_1248_;
			    if (bool)
				aFloatArray1500[i] = f_1242_;
			} else {
			    int i_1253_
				= (~0xffffff
				   | ((int) (f_1225_ * (float) (i_1246_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1227_
					     * (float) (i_1246_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1229_
					    * (float) (i_1246_ & 0xff)) >> 8);
			    if (f_1221_ != 0.0F) {
				int i_1254_ = (int) (255.0F - f_1221_);
				int i_1255_
				    = ((((anInt1501 & 0xff00ff) * (int) f_1221_
					 & ~0xff00ff)
					| ((anInt1501 & 0xff00) * (int) f_1221_
					   & 0xff0000))
				       >>> 8);
				i_1253_ = ((((i_1253_ & 0xff00ff) * i_1254_
					     & ~0xff00ff)
					    | ((i_1253_ & 0xff00) * i_1254_
					       & 0xff0000))
					   >>> 8) + i_1255_;
			    }
			    if (bool_1210_)
				is[i] = i_1247_ << 24 | i_1253_;
			    else
				is[i] = i_1253_;
			    if (bool)
				aFloatArray1500[i] = f_1242_;
			}
		    }
		}
		i++;
		f += f_1233_;
		f_1215_ += f_1234_;
		f_1217_ += f_1235_;
		f_1219_ += f_1236_;
		f_1221_ += f_1237_;
		f_1223_ += f_1238_;
		f_1225_ += f_1239_;
		f_1227_ += f_1240_;
		f_1229_ += f_1241_;
	    }
	}
    }
    
    int method2272() {
	return anIntArray1487[0] / anInt1498;
    }
    
    final void method2273
	(boolean bool, boolean bool_1256_, int[] is, int[] is_1257_, int i,
	 int i_1258_, int i_1259_, float f, float f_1260_, float f_1261_,
	 float f_1262_, float f_1263_, float f_1264_, float f_1265_,
	 float f_1266_, float f_1267_, float f_1268_, float f_1269_,
	 float f_1270_, float f_1271_, float f_1272_, float f_1273_,
	 float f_1274_, float f_1275_, float f_1276_) {
	int i_1277_ = i_1259_ - i_1258_;
	float f_1278_ = 1.0F / (float) i_1277_;
	float f_1279_ = (f_1260_ - f) * f_1278_;
	float f_1280_ = (f_1262_ - f_1261_) * f_1278_;
	float f_1281_ = (f_1264_ - f_1263_) * f_1278_;
	float f_1282_ = (f_1266_ - f_1265_) * f_1278_;
	float f_1283_ = (f_1268_ - f_1267_) * f_1278_;
	float f_1284_ = (f_1270_ - f_1269_) * f_1278_;
	float f_1285_ = (f_1272_ - f_1271_) * f_1278_;
	float f_1286_ = (f_1274_ - f_1273_) * f_1278_;
	float f_1287_ = (f_1276_ - f_1275_) * f_1278_;
	if (aBool1485) {
	    if (i_1259_ > anInt1494)
		i_1259_ = anInt1494;
	    if (i_1258_ < 0) {
		f -= f_1279_ * (float) i_1258_;
		f_1261_ -= f_1280_ * (float) i_1258_;
		f_1263_ -= f_1281_ * (float) i_1258_;
		f_1265_ -= f_1282_ * (float) i_1258_;
		f_1267_ -= f_1283_ * (float) i_1258_;
		f_1269_ -= f_1284_ * (float) i_1258_;
		f_1271_ -= f_1285_ * (float) i_1258_;
		f_1273_ -= f_1286_ * (float) i_1258_;
		f_1275_ -= f_1287_ * (float) i_1258_;
		i_1258_ = 0;
	    }
	}
	if (i_1258_ < i_1259_) {
	    i_1277_ = i_1259_ - i_1258_;
	    i += i_1258_;
	    while (i_1277_-- > 0) {
		float f_1288_ = 1.0F / f;
		float f_1289_ = 1.0F / f_1261_;
		if (!bool || f_1288_ < aFloatArray1500[i]) {
		    int i_1290_
			= (int) (f_1263_ * f_1289_ * (float) anInt1504);
		    if (aBool1484)
			i_1290_ &= anInt1505;
		    else if (i_1290_ < 0)
			i_1290_ = 0;
		    else if (i_1290_ > anInt1505)
			i_1290_ = anInt1505;
		    int i_1291_
			= (int) (f_1265_ * f_1289_ * (float) anInt1504);
		    if (aBool1484)
			i_1291_ &= anInt1505;
		    else if (i_1291_ < 0)
			i_1291_ = 0;
		    else if (i_1291_ > anInt1505)
			i_1291_ = anInt1505;
		    int i_1292_
			= anIntArray1481[i_1291_ * anInt1504 + i_1290_];
		    int i_1293_ = 255;
		    if (aClass597_1507 == Class597.aClass597_7841)
			i_1293_ = (int) ((float) (i_1292_ >> 24 & 0xff)
					 * f_1269_ / 255.0F);
		    else if (aClass597_1507 == Class597.aClass597_7843) {
			if ((i_1292_ >> 24 & 0xff) > anInt1496)
			    i_1293_ = 255;
			else
			    i_1293_ = 0;
		    } else
			i_1293_ = (int) f_1269_;
		    if (i_1293_ != 0) {
			if (i_1293_ != 255) {
			    int i_1294_
				= (~0xffffff
				   | ((int) (f_1271_ * (float) (i_1292_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1273_
					     * (float) (i_1292_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1275_
					    * (float) (i_1292_ & 0xff)) >> 8);
			    if (f_1267_ != 0.0F) {
				int i_1295_ = (int) (255.0F - f_1267_);
				int i_1296_
				    = ((((anInt1501 & 0xff00ff) * (int) f_1267_
					 & ~0xff00ff)
					| ((anInt1501 & 0xff00) * (int) f_1267_
					   & 0xff0000))
				       >>> 8);
				i_1294_ = ((((i_1294_ & 0xff00ff) * i_1295_
					     & ~0xff00ff)
					    | ((i_1294_ & 0xff00) * i_1295_
					       & 0xff0000))
					   >>> 8) + i_1296_;
			    }
			    int i_1297_ = is[i];
			    int i_1298_ = 255 - i_1293_;
			    i_1294_ = ((((i_1297_ & 0xff00ff) * i_1298_
					 + (i_1294_ & 0xff00ff) * i_1293_)
					& ~0xff00ff)
				       + (((i_1297_ & 0xff00) * i_1298_
					   + (i_1294_ & 0xff00) * i_1293_)
					  & 0xff0000)) >> 8;
			    if (bool_1256_)
				is[i]
				    = (i_1293_ | is[i] >> 24) << 24 | i_1294_;
			    else
				is[i] = i_1294_;
			    if (bool)
				aFloatArray1500[i] = f_1288_;
			} else {
			    int i_1299_
				= (~0xffffff
				   | ((int) (f_1271_ * (float) (i_1292_ >> 16
								& 0xff)) << 8
				      & 0xff0000)
				   | ((int) (f_1273_
					     * (float) (i_1292_ >> 8 & 0xff))
				      & 0xff00)
				   | (int) (f_1275_
					    * (float) (i_1292_ & 0xff)) >> 8);
			    if (f_1267_ != 0.0F) {
				int i_1300_ = (int) (255.0F - f_1267_);
				int i_1301_
				    = ((((anInt1501 & 0xff00ff) * (int) f_1267_
					 & ~0xff00ff)
					| ((anInt1501 & 0xff00) * (int) f_1267_
					   & 0xff0000))
				       >>> 8);
				i_1299_ = ((((i_1299_ & 0xff00ff) * i_1300_
					     & ~0xff00ff)
					    | ((i_1299_ & 0xff00) * i_1300_
					       & 0xff0000))
					   >>> 8) + i_1301_;
			    }
			    if (bool_1256_)
				is[i] = i_1293_ << 24 | i_1299_;
			    else
				is[i] = i_1299_;
			    if (bool)
				aFloatArray1500[i] = f_1288_;
			}
		    }
		}
		i++;
		f += f_1279_;
		f_1261_ += f_1280_;
		f_1263_ += f_1281_;
		f_1265_ += f_1282_;
		f_1267_ += f_1283_;
		f_1269_ += f_1284_;
		f_1271_ += f_1285_;
		f_1273_ += f_1286_;
		f_1275_ += f_1287_;
	    }
	}
    }
    
    final void method2274(boolean bool) {
	aBool1510 = bool;
    }
    
    final void method2275
	(boolean bool, boolean bool_1302_, boolean bool_1303_, float f,
	 float f_1304_, float f_1305_, float f_1306_, float f_1307_,
	 float f_1308_, float f_1309_, float f_1310_, float f_1311_,
	 float f_1312_, float f_1313_, float f_1314_, float f_1315_,
	 float f_1316_, float f_1317_, float f_1318_, float f_1319_,
	 float f_1320_, int i, int i_1321_, int i_1322_, int i_1323_,
	 float f_1324_, float f_1325_, float f_1326_, int i_1327_,
	 float f_1328_, int i_1329_, float f_1330_, int i_1331_,
	 float f_1332_) {
	if (!bool)
	    method2256(false, bool_1302_, bool_1303_, f, f_1304_, f_1305_,
		       f_1306_, f_1307_, f_1308_, f_1309_, f_1310_, f_1311_,
		       0);
	else {
	    anInt1501 = i_1323_;
	    if (!(f <= f_1304_) || !(f <= f_1305_)) {
		if (f_1304_ <= f_1305_) {
		    float f_1333_ = f_1306_;
		    f_1306_ = f_1307_;
		    f_1307_ = f_1333_;
		    f_1333_ = f;
		    f = f_1304_;
		    f_1304_ = f_1333_;
		    f_1333_ = f_1309_;
		    f_1309_ = f_1310_;
		    f_1310_ = f_1333_;
		    f_1333_ = f_1315_;
		    f_1315_ = f_1316_;
		    f_1316_ = f_1333_;
		    f_1333_ = f_1318_;
		    f_1318_ = f_1319_;
		    f_1319_ = f_1333_;
		    f_1333_ = f_1312_;
		    f_1312_ = f_1313_;
		    f_1313_ = f_1333_;
		    f_1333_ = f_1324_;
		    f_1324_ = f_1325_;
		    f_1325_ = f_1333_;
		    f_1333_ = f_1328_;
		    f_1328_ = f_1330_;
		    f_1330_ = f_1333_;
		    int i_1334_ = i;
		    i = i_1321_;
		    i_1321_ = i_1334_;
		    i_1334_ = i_1327_;
		    i_1327_ = i_1329_;
		    i_1329_ = i_1334_;
		} else {
		    float f_1335_ = f_1306_;
		    f_1306_ = f_1308_;
		    f_1308_ = f_1335_;
		    f_1335_ = f;
		    f = f_1305_;
		    f_1305_ = f_1335_;
		    f_1335_ = f_1309_;
		    f_1309_ = f_1311_;
		    f_1311_ = f_1335_;
		    f_1335_ = f_1315_;
		    f_1315_ = f_1317_;
		    f_1317_ = f_1335_;
		    f_1335_ = f_1318_;
		    f_1318_ = f_1320_;
		    f_1320_ = f_1335_;
		    f_1335_ = f_1312_;
		    f_1312_ = f_1314_;
		    f_1314_ = f_1335_;
		    f_1335_ = f_1324_;
		    f_1324_ = f_1326_;
		    f_1326_ = f_1335_;
		    f_1335_ = f_1328_;
		    f_1328_ = f_1332_;
		    f_1332_ = f_1335_;
		    int i_1336_ = i;
		    i = i_1322_;
		    i_1322_ = i_1336_;
		    i_1336_ = i_1327_;
		    i_1327_ = i_1331_;
		    i_1331_ = i_1336_;
		}
	    }
	    int i_1337_ = i_1327_ & 0xffff;
	    int i_1338_ = i_1329_ & 0xffff;
	    int i_1339_ = i_1331_ & 0xffff;
	    if (i_1337_ != anInt1502) {
		anIntArray1481 = aClass182_Sub2_1488.method15165(i_1337_);
		if (anIntArray1481 == null) {
		    anInt1502 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    int i_1340_
			= (Class381.anIntArray3929
			   [Class504.method8313(aClass182_Sub2_1488
						    .method15168(i_1327_),
						197072557) & 0xffff]);
		    int i_1341_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1340_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1340_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1340_ & 0xff) >> 8);
		    method2243(true, bool_1302_, bool_1303_, f, f_1304_,
			       f_1305_, f_1306_, f_1307_, f_1308_, f_1309_,
			       f_1310_, f_1311_,
			       Class637.method10513(i_1341_, i_1323_, f_1324_,
						    358737570),
			       Class637.method10513(i_1341_, i_1323_, f_1325_,
						    -1254684114),
			       Class637.method10513(i_1341_, i_1323_, f_1326_,
						    -352133777));
		    return;
		}
		anInt1502 = i_1337_;
		anInt1504 = aClass182_Sub2_1488.method15209(i_1327_);
		anInt1505 = anInt1504 - 1;
		aClass597_1507 = aClass182_Sub2_1488.method15166(i_1327_);
	    }
	    aFloat1506 = f_1328_;
	    if (i_1338_ != anInt1508) {
		anIntArray1511 = aClass182_Sub2_1488.method15165(i_1338_);
		if (anIntArray1511 == null) {
		    anInt1508 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    int i_1342_
			= (Class381.anIntArray3929
			   [Class504.method8313(aClass182_Sub2_1488
						    .method15168(i_1329_),
						932303970) & 0xffff]);
		    int i_1343_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1342_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1342_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1342_ & 0xff) >> 8);
		    method2243(true, bool_1302_, bool_1303_, f, f_1304_,
			       f_1305_, f_1306_, f_1307_, f_1308_, f_1309_,
			       f_1310_, f_1311_,
			       Class637.method10513(i_1343_, i_1323_, f_1324_,
						    -459016699),
			       Class637.method10513(i_1343_, i_1323_, f_1325_,
						    -1958237232),
			       Class637.method10513(i_1343_, i_1323_, f_1326_,
						    -327841587));
		    return;
		}
		anInt1508 = i_1338_;
		anInt1512 = aClass182_Sub2_1488.method15209(i_1329_);
		anInt1513 = anInt1512 - 1;
	    }
	    aFloat1514 = f_1330_;
	    if (i_1339_ != anInt1515) {
		anIntArray1516 = aClass182_Sub2_1488.method15165(i_1339_);
		if (anIntArray1516 == null) {
		    anInt1515 = -1;
		    anInt1486 = 255 - (i >> 24 & 0xff);
		    int i_1344_
			= (Class381.anIntArray3929
			   [Class504.method8313(aClass182_Sub2_1488
						    .method15168(i_1331_),
						520022431) & 0xffff]);
		    int i_1345_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_1344_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_1344_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_1344_ & 0xff) >> 8);
		    method2243(true, bool_1302_, bool_1303_, (float) (int) f,
			       (float) (int) f_1304_, (float) (int) f_1305_,
			       (float) (int) f_1306_, (float) (int) f_1307_,
			       (float) (int) f_1308_, (float) (int) f_1309_,
			       (float) (int) f_1310_, (float) (int) f_1311_,
			       Class637.method10513(i_1345_, i_1323_, f_1324_,
						    1443803822),
			       Class637.method10513(i_1345_, i_1323_, f_1325_,
						    -643797533),
			       Class637.method10513(i_1345_, i_1323_, f_1326_,
						    1162474146));
		    return;
		}
		anInt1515 = i_1339_;
		anInt1517 = aClass182_Sub2_1488.method15209(i_1331_);
		anInt1509 = anInt1517 - 1;
	    }
	    aFloat1519 = f_1332_;
	    f_1315_ /= f_1312_;
	    f_1316_ /= f_1313_;
	    f_1317_ /= f_1314_;
	    f_1318_ /= f_1312_;
	    f_1319_ /= f_1313_;
	    f_1320_ /= f_1314_;
	    f_1309_ = 1.0F / f_1309_;
	    f_1310_ = 1.0F / f_1310_;
	    f_1311_ = 1.0F / f_1311_;
	    f_1312_ = 1.0F / f_1312_;
	    f_1313_ = 1.0F / f_1313_;
	    f_1314_ = 1.0F / f_1314_;
	    float f_1346_ = (float) (i >> 24 & 0xff);
	    float f_1347_ = (float) (i_1321_ >> 24 & 0xff);
	    float f_1348_ = (float) (i_1322_ >> 24 & 0xff);
	    float f_1349_ = (float) (i >> 16 & 0xff);
	    float f_1350_ = (float) (i_1321_ >> 16 & 0xff);
	    float f_1351_ = (float) (i_1322_ >> 16 & 0xff);
	    float f_1352_ = (float) (i >> 8 & 0xff);
	    float f_1353_ = (float) (i_1321_ >> 8 & 0xff);
	    float f_1354_ = (float) (i_1322_ >> 8 & 0xff);
	    float f_1355_ = (float) (i & 0xff);
	    float f_1356_ = (float) (i_1321_ & 0xff);
	    float f_1357_ = (float) (i_1322_ & 0xff);
	    float f_1358_ = 1.0F;
	    float f_1359_ = 0.0F;
	    float f_1360_ = 0.0F;
	    float f_1361_ = 0.0F;
	    float f_1362_ = 1.0F;
	    float f_1363_ = 0.0F;
	    float f_1364_ = 0.0F;
	    float f_1365_ = 0.0F;
	    float f_1366_ = 0.0F;
	    float f_1367_ = 0.0F;
	    float f_1368_ = 0.0F;
	    float f_1369_ = 0.0F;
	    float f_1370_ = 0.0F;
	    float f_1371_ = 0.0F;
	    float f_1372_ = 0.0F;
	    float f_1373_ = 0.0F;
	    float f_1374_ = 0.0F;
	    float f_1375_ = 0.0F;
	    if (f_1304_ != f) {
		float f_1376_ = f_1304_ - f;
		f_1364_ = (f_1307_ - f_1306_) / f_1376_;
		f_1365_ = (f_1310_ - f_1309_) / f_1376_;
		f_1366_ = (f_1313_ - f_1312_) / f_1376_;
		f_1367_ = (f_1316_ - f_1315_) / f_1376_;
		f_1368_ = (f_1319_ - f_1318_) / f_1376_;
		f_1369_ = (f_1325_ - f_1324_) / f_1376_;
		f_1370_ = (f_1347_ - f_1346_) / f_1376_;
		f_1371_ = (f_1350_ - f_1349_) / f_1376_;
		f_1372_ = (f_1353_ - f_1352_) / f_1376_;
		f_1373_ = (f_1356_ - f_1355_) / f_1376_;
		f_1374_ = (f_1359_ - f_1358_) / f_1376_;
		f_1375_ = (f_1362_ - f_1361_) / f_1376_;
	    }
	    float f_1377_ = 0.0F;
	    float f_1378_ = 0.0F;
	    float f_1379_ = 0.0F;
	    float f_1380_ = 0.0F;
	    float f_1381_ = 0.0F;
	    float f_1382_ = 0.0F;
	    float f_1383_ = 0.0F;
	    float f_1384_ = 0.0F;
	    float f_1385_ = 0.0F;
	    float f_1386_ = 0.0F;
	    float f_1387_ = 0.0F;
	    float f_1388_ = 0.0F;
	    if (f_1305_ != f_1304_) {
		float f_1389_ = f_1305_ - f_1304_;
		f_1377_ = (f_1308_ - f_1307_) / f_1389_;
		f_1378_ = (f_1311_ - f_1310_) / f_1389_;
		f_1379_ = (f_1314_ - f_1313_) / f_1389_;
		f_1380_ = (f_1317_ - f_1316_) / f_1389_;
		f_1381_ = (f_1320_ - f_1319_) / f_1389_;
		f_1382_ = (f_1326_ - f_1325_) / f_1389_;
		f_1383_ = (f_1348_ - f_1347_) / f_1389_;
		f_1384_ = (f_1351_ - f_1350_) / f_1389_;
		f_1385_ = (f_1354_ - f_1353_) / f_1389_;
		f_1386_ = (f_1357_ - f_1356_) / f_1389_;
		f_1387_ = (f_1360_ - f_1359_) / f_1389_;
		f_1388_ = (f_1363_ - f_1362_) / f_1389_;
	    }
	    float f_1390_ = 0.0F;
	    float f_1391_ = 0.0F;
	    float f_1392_ = 0.0F;
	    float f_1393_ = 0.0F;
	    float f_1394_ = 0.0F;
	    float f_1395_ = 0.0F;
	    float f_1396_ = 0.0F;
	    float f_1397_ = 0.0F;
	    float f_1398_ = 0.0F;
	    float f_1399_ = 0.0F;
	    float f_1400_ = 0.0F;
	    float f_1401_ = 0.0F;
	    if (f != f_1305_) {
		float f_1402_ = f - f_1305_;
		f_1390_ = (f_1306_ - f_1308_) / f_1402_;
		f_1391_ = (f_1309_ - f_1311_) / f_1402_;
		f_1392_ = (f_1312_ - f_1314_) / f_1402_;
		f_1393_ = (f_1315_ - f_1317_) / f_1402_;
		f_1394_ = (f_1318_ - f_1320_) / f_1402_;
		f_1395_ = (f_1324_ - f_1326_) / f_1402_;
		f_1396_ = (f_1346_ - f_1348_) / f_1402_;
		f_1397_ = (f_1349_ - f_1351_) / f_1402_;
		f_1398_ = (f_1352_ - f_1354_) / f_1402_;
		f_1399_ = (f_1355_ - f_1357_) / f_1402_;
		f_1400_ = (f_1358_ - f_1360_) / f_1402_;
		f_1401_ = (f_1361_ - f_1363_) / f_1402_;
	    }
	    if (!(f >= (float) anInt1495)) {
		if (f_1304_ > (float) anInt1495)
		    f_1304_ = (float) anInt1495;
		if (f_1305_ > (float) anInt1495)
		    f_1305_ = (float) anInt1495;
		if (f_1304_ < f_1305_) {
		    f_1308_ = f_1306_;
		    f_1311_ = f_1309_;
		    f_1314_ = f_1312_;
		    f_1317_ = f_1315_;
		    f_1320_ = f_1318_;
		    f_1326_ = f_1324_;
		    f_1348_ = f_1346_;
		    f_1351_ = f_1349_;
		    f_1354_ = f_1352_;
		    f_1357_ = f_1355_;
		    f_1360_ = f_1358_;
		    f_1363_ = f_1361_;
		    if (f < 0.0F) {
			f_1306_ -= f_1364_ * f;
			f_1308_ -= f_1390_ * f;
			f_1309_ -= f_1365_ * f;
			f_1311_ -= f_1391_ * f;
			f_1312_ -= f_1366_ * f;
			f_1314_ -= f_1392_ * f;
			f_1315_ -= f_1367_ * f;
			f_1317_ -= f_1393_ * f;
			f_1318_ -= f_1368_ * f;
			f_1320_ -= f_1394_ * f;
			f_1324_ -= f_1369_ * f;
			f_1326_ -= f_1395_ * f;
			f_1346_ -= f_1370_ * f;
			f_1348_ -= f_1396_ * f;
			f_1349_ -= f_1371_ * f;
			f_1351_ -= f_1397_ * f;
			f_1352_ -= f_1372_ * f;
			f_1354_ -= f_1398_ * f;
			f_1355_ -= f_1373_ * f;
			f_1357_ -= f_1399_ * f;
			f_1358_ -= f_1374_ * f;
			f_1360_ -= f_1400_ * f;
			f_1361_ -= f_1375_ * f;
			f_1363_ -= f_1401_ * f;
			f = 0.0F;
		    }
		    if (f_1304_ < 0.0F) {
			f_1307_ -= f_1377_ * f_1304_;
			f_1310_ -= f_1378_ * f_1304_;
			f_1313_ -= f_1379_ * f_1304_;
			f_1316_ -= f_1380_ * f_1304_;
			f_1319_ -= f_1381_ * f_1304_;
			f_1325_ -= f_1382_ * f_1304_;
			f_1347_ -= f_1383_ * f_1304_;
			f_1350_ -= f_1384_ * f_1304_;
			f_1353_ -= f_1385_ * f_1304_;
			f_1356_ -= f_1386_ * f_1304_;
			f_1359_ -= f_1387_ * f_1304_;
			f_1362_ -= f_1388_ * f_1304_;
			f_1304_ = 0.0F;
		    }
		    if (f != f_1304_ && f_1390_ < f_1364_
			|| f == f_1304_ && f_1390_ > f_1377_) {
			f += 0.5F;
			f_1304_ += 0.5F;
			f_1305_ = (float) (int) (f_1305_ + 0.5F) - f_1304_;
			f_1304_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_1304_ >= 0.0F) {
			    method2251(bool_1302_, bool_1303_, anIntArray1499,
				       (int) f, (int) f_1308_, (int) f_1306_,
				       f_1311_, f_1309_, f_1314_, f_1312_,
				       f_1317_, f_1315_, f_1320_, f_1318_,
				       f_1326_, f_1324_, f_1348_, f_1346_,
				       f_1351_, f_1349_, f_1354_, f_1352_,
				       f_1357_, f_1355_, f_1360_, f_1358_,
				       f_1363_, f_1361_);
			    f_1306_ += f_1364_;
			    f_1308_ += f_1390_;
			    f_1309_ += f_1365_;
			    f_1311_ += f_1391_;
			    f_1312_ += f_1366_;
			    f_1314_ += f_1392_;
			    f_1315_ += f_1367_;
			    f_1317_ += f_1393_;
			    f_1318_ += f_1368_;
			    f_1320_ += f_1394_;
			    f_1324_ += f_1369_;
			    f_1326_ += f_1395_;
			    f_1346_ += f_1370_;
			    f_1348_ += f_1396_;
			    f_1349_ += f_1371_;
			    f_1351_ += f_1397_;
			    f_1352_ += f_1372_;
			    f_1354_ += f_1398_;
			    f_1355_ += f_1373_;
			    f_1357_ += f_1399_;
			    f_1358_ += f_1374_;
			    f_1360_ += f_1400_;
			    f_1361_ += f_1375_;
			    f_1363_ += f_1401_;
			    f += (float) anInt1498;
			}
			while (--f_1305_ >= 0.0F) {
			    method2251(bool_1302_, bool_1303_, anIntArray1499,
				       (int) f, (int) f_1308_, (int) f_1307_,
				       f_1311_, f_1310_, f_1314_, f_1313_,
				       f_1317_, f_1316_, f_1320_, f_1319_,
				       f_1326_, f_1325_, f_1348_, f_1347_,
				       f_1351_, f_1350_, f_1354_, f_1353_,
				       f_1357_, f_1356_, f_1360_, f_1359_,
				       f_1363_, f_1362_);
			    f_1307_ += f_1377_;
			    f_1308_ += f_1390_;
			    f_1310_ += f_1378_;
			    f_1311_ += f_1391_;
			    f_1313_ += f_1379_;
			    f_1314_ += f_1392_;
			    f_1316_ += f_1380_;
			    f_1317_ += f_1393_;
			    f_1319_ += f_1381_;
			    f_1320_ += f_1394_;
			    f_1325_ += f_1382_;
			    f_1326_ += f_1395_;
			    f_1347_ += f_1383_;
			    f_1348_ += f_1396_;
			    f_1350_ += f_1384_;
			    f_1351_ += f_1397_;
			    f_1353_ += f_1385_;
			    f_1354_ += f_1398_;
			    f_1356_ += f_1386_;
			    f_1357_ += f_1399_;
			    f_1359_ += f_1387_;
			    f_1360_ += f_1400_;
			    f_1362_ += f_1388_;
			    f_1363_ += f_1401_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_1304_ += 0.5F;
			f_1305_ = (float) (int) (f_1305_ + 0.5F) - f_1304_;
			f_1304_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_1304_ >= 0.0F) {
			    method2251(bool_1302_, bool_1303_, anIntArray1499,
				       (int) f, (int) f_1306_, (int) f_1308_,
				       f_1309_, f_1311_, f_1312_, f_1314_,
				       f_1315_, f_1317_, f_1318_, f_1320_,
				       f_1324_, f_1326_, f_1346_, f_1348_,
				       f_1349_, f_1351_, f_1352_, f_1354_,
				       f_1355_, f_1357_, f_1358_, f_1360_,
				       f_1361_, f_1363_);
			    f_1306_ += f_1364_;
			    f_1308_ += f_1390_;
			    f_1309_ += f_1365_;
			    f_1311_ += f_1391_;
			    f_1312_ += f_1366_;
			    f_1314_ += f_1392_;
			    f_1315_ += f_1367_;
			    f_1317_ += f_1393_;
			    f_1318_ += f_1368_;
			    f_1320_ += f_1394_;
			    f_1324_ += f_1369_;
			    f_1326_ += f_1395_;
			    f_1346_ += f_1370_;
			    f_1348_ += f_1396_;
			    f_1349_ += f_1371_;
			    f_1351_ += f_1397_;
			    f_1352_ += f_1372_;
			    f_1354_ += f_1398_;
			    f_1355_ += f_1373_;
			    f_1357_ += f_1399_;
			    f_1358_ += f_1374_;
			    f_1360_ += f_1400_;
			    f_1361_ += f_1375_;
			    f_1363_ += f_1401_;
			    f += (float) anInt1498;
			}
			while (--f_1305_ >= 0.0F) {
			    method2251(bool_1302_, bool_1303_, anIntArray1499,
				       (int) f, (int) f_1307_, (int) f_1308_,
				       f_1310_, f_1311_, f_1313_, f_1314_,
				       f_1316_, f_1317_, f_1319_, f_1320_,
				       f_1325_, f_1326_, f_1347_, f_1348_,
				       f_1350_, f_1351_, f_1353_, f_1354_,
				       f_1356_, f_1357_, f_1359_, f_1360_,
				       f_1362_, f_1363_);
			    f_1307_ += f_1377_;
			    f_1308_ += f_1390_;
			    f_1310_ += f_1378_;
			    f_1311_ += f_1391_;
			    f_1313_ += f_1379_;
			    f_1314_ += f_1392_;
			    f_1316_ += f_1380_;
			    f_1317_ += f_1393_;
			    f_1319_ += f_1381_;
			    f_1320_ += f_1394_;
			    f_1325_ += f_1382_;
			    f_1326_ += f_1395_;
			    f_1347_ += f_1383_;
			    f_1348_ += f_1396_;
			    f_1350_ += f_1384_;
			    f_1351_ += f_1397_;
			    f_1353_ += f_1385_;
			    f_1354_ += f_1398_;
			    f_1356_ += f_1386_;
			    f_1357_ += f_1399_;
			    f_1359_ += f_1387_;
			    f_1360_ += f_1400_;
			    f_1362_ += f_1388_;
			    f_1363_ += f_1401_;
			    f += (float) anInt1498;
			}
		    }
		} else {
		    f_1307_ = f_1306_;
		    f_1310_ = f_1309_;
		    f_1313_ = f_1312_;
		    f_1316_ = f_1315_;
		    f_1319_ = f_1318_;
		    f_1325_ = f_1324_;
		    f_1347_ = f_1346_;
		    f_1350_ = f_1349_;
		    f_1353_ = f_1352_;
		    f_1356_ = f_1355_;
		    f_1359_ = f_1358_;
		    f_1362_ = f_1361_;
		    if (f < 0.0F) {
			f_1306_ -= f_1364_ * f;
			f_1307_ -= f_1390_ * f;
			f_1309_ -= f_1365_ * f;
			f_1310_ -= f_1391_ * f;
			f_1312_ -= f_1366_ * f;
			f_1313_ -= f_1392_ * f;
			f_1315_ -= f_1367_ * f;
			f_1316_ -= f_1393_ * f;
			f_1318_ -= f_1368_ * f;
			f_1319_ -= f_1394_ * f;
			f_1324_ -= f_1369_ * f;
			f_1325_ -= f_1395_ * f;
			f_1346_ -= f_1370_ * f;
			f_1347_ -= f_1396_ * f;
			f_1349_ -= f_1371_ * f;
			f_1350_ -= f_1397_ * f;
			f_1352_ -= f_1372_ * f;
			f_1353_ -= f_1398_ * f;
			f_1355_ -= f_1373_ * f;
			f_1356_ -= f_1399_ * f;
			f_1358_ -= f_1374_ * f;
			f_1359_ -= f_1400_ * f;
			f_1361_ -= f_1375_ * f;
			f_1362_ -= f_1401_ * f;
			f = 0.0F;
		    }
		    if (f_1305_ < 0.0F) {
			f_1308_ -= f_1377_ * f_1305_;
			f_1311_ -= f_1378_ * f_1305_;
			f_1314_ -= f_1379_ * f_1305_;
			f_1317_ -= f_1380_ * f_1305_;
			f_1320_ -= f_1381_ * f_1305_;
			f_1326_ -= f_1382_ * f_1305_;
			f_1348_ -= f_1383_ * f_1305_;
			f_1351_ -= f_1384_ * f_1305_;
			f_1354_ -= f_1385_ * f_1305_;
			f_1357_ -= f_1386_ * f_1305_;
			f_1360_ -= f_1387_ * f_1305_;
			f_1363_ -= f_1388_ * f_1305_;
			f_1305_ = 0.0F;
		    }
		    if (f != f_1305_ && f_1390_ < f_1364_
			|| f == f_1305_ && f_1377_ > f_1364_) {
			f += 0.5F;
			f_1305_ += 0.5F;
			f_1304_ = (float) (int) (f_1304_ + 0.5F) - f_1305_;
			f_1305_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_1305_ >= 0.0F) {
			    method2251(bool_1302_, bool_1303_, anIntArray1499,
				       (int) f, (int) f_1307_, (int) f_1306_,
				       f_1310_, f_1309_, f_1313_, f_1312_,
				       f_1316_, f_1315_, f_1319_, f_1318_,
				       f_1325_, f_1324_, f_1347_, f_1346_,
				       f_1350_, f_1349_, f_1353_, f_1352_,
				       f_1356_, f_1355_, f_1359_, f_1358_,
				       f_1362_, f_1361_);
			    f_1306_ += f_1364_;
			    f_1307_ += f_1390_;
			    f_1309_ += f_1365_;
			    f_1310_ += f_1391_;
			    f_1312_ += f_1366_;
			    f_1313_ += f_1392_;
			    f_1315_ += f_1367_;
			    f_1316_ += f_1393_;
			    f_1318_ += f_1368_;
			    f_1319_ += f_1394_;
			    f_1324_ += f_1369_;
			    f_1325_ += f_1395_;
			    f_1346_ += f_1370_;
			    f_1347_ += f_1396_;
			    f_1349_ += f_1371_;
			    f_1350_ += f_1397_;
			    f_1352_ += f_1372_;
			    f_1353_ += f_1398_;
			    f_1355_ += f_1373_;
			    f_1356_ += f_1399_;
			    f_1358_ += f_1374_;
			    f_1359_ += f_1400_;
			    f_1361_ += f_1375_;
			    f_1362_ += f_1401_;
			    f += (float) anInt1498;
			}
			while (--f_1304_ >= 0.0F) {
			    method2251(bool_1302_, bool_1303_, anIntArray1499,
				       (int) f, (int) f_1308_, (int) f_1306_,
				       f_1311_, f_1309_, f_1314_, f_1312_,
				       f_1317_, f_1315_, f_1320_, f_1318_,
				       f_1326_, f_1324_, f_1348_, f_1346_,
				       f_1351_, f_1349_, f_1354_, f_1352_,
				       f_1357_, f_1355_, f_1360_, f_1358_,
				       f_1363_, f_1361_);
			    f_1308_ += f_1377_;
			    f_1306_ += f_1364_;
			    f_1311_ += f_1378_;
			    f_1309_ += f_1365_;
			    f_1314_ += f_1379_;
			    f_1312_ += f_1366_;
			    f_1317_ += f_1380_;
			    f_1315_ += f_1367_;
			    f_1320_ += f_1381_;
			    f_1318_ += f_1368_;
			    f_1326_ += f_1382_;
			    f_1324_ += f_1369_;
			    f_1348_ += f_1383_;
			    f_1346_ += f_1370_;
			    f_1351_ += f_1384_;
			    f_1349_ += f_1371_;
			    f_1354_ += f_1385_;
			    f_1352_ += f_1372_;
			    f_1357_ += f_1386_;
			    f_1355_ += f_1373_;
			    f_1360_ += f_1387_;
			    f_1358_ += f_1374_;
			    f_1363_ += f_1388_;
			    f_1361_ += f_1375_;
			    f += (float) anInt1498;
			}
		    } else {
			f += 0.5F;
			f_1305_ += 0.5F;
			f_1304_ = (float) (int) (f_1304_ + 0.5F) - f_1305_;
			f_1305_ -= f;
			f = (float) anIntArray1487[(int) f];
			while (--f_1305_ >= 0.0F) {
			    method2251(bool_1302_, bool_1303_, anIntArray1499,
				       (int) f, (int) f_1306_, (int) f_1307_,
				       f_1309_, f_1310_, f_1312_, f_1313_,
				       f_1315_, f_1316_, f_1318_, f_1319_,
				       f_1324_, f_1325_, f_1346_, f_1347_,
				       f_1349_, f_1350_, f_1352_, f_1353_,
				       f_1355_, f_1356_, f_1358_, f_1359_,
				       f_1361_, f_1362_);
			    f_1307_ += f_1390_;
			    f_1306_ += f_1364_;
			    f_1310_ += f_1391_;
			    f_1309_ += f_1365_;
			    f_1313_ += f_1392_;
			    f_1312_ += f_1366_;
			    f_1316_ += f_1393_;
			    f_1315_ += f_1367_;
			    f_1319_ += f_1394_;
			    f_1318_ += f_1368_;
			    f_1325_ += f_1395_;
			    f_1324_ += f_1369_;
			    f_1347_ += f_1396_;
			    f_1346_ += f_1370_;
			    f_1350_ += f_1397_;
			    f_1349_ += f_1371_;
			    f_1353_ += f_1398_;
			    f_1352_ += f_1372_;
			    f_1356_ += f_1399_;
			    f_1355_ += f_1373_;
			    f_1359_ += f_1400_;
			    f_1358_ += f_1374_;
			    f_1362_ += f_1401_;
			    f_1361_ += f_1375_;
			    f += (float) anInt1498;
			}
			while (--f_1304_ >= 0.0F) {
			    method2251(bool_1302_, bool_1303_, anIntArray1499,
				       (int) f, (int) f_1306_, (int) f_1308_,
				       f_1309_, f_1311_, f_1312_, f_1314_,
				       f_1315_, f_1317_, f_1318_, f_1320_,
				       f_1324_, f_1326_, f_1346_, f_1348_,
				       f_1349_, f_1351_, f_1352_, f_1354_,
				       f_1355_, f_1357_, f_1358_, f_1360_,
				       f_1361_, f_1363_);
			    f_1306_ += f_1364_;
			    f_1308_ += f_1377_;
			    f_1309_ += f_1365_;
			    f_1311_ += f_1378_;
			    f_1312_ += f_1366_;
			    f_1314_ += f_1379_;
			    f_1315_ += f_1367_;
			    f_1317_ += f_1380_;
			    f_1318_ += f_1368_;
			    f_1320_ += f_1381_;
			    f_1324_ += f_1369_;
			    f_1326_ += f_1382_;
			    f_1346_ += f_1370_;
			    f_1348_ += f_1383_;
			    f_1349_ += f_1371_;
			    f_1351_ += f_1384_;
			    f_1352_ += f_1372_;
			    f_1354_ += f_1385_;
			    f_1355_ += f_1373_;
			    f_1357_ += f_1386_;
			    f_1358_ += f_1374_;
			    f_1360_ += f_1387_;
			    f_1361_ += f_1375_;
			    f_1363_ += f_1388_;
			    f += (float) anInt1498;
			}
		    }
		}
	    }
	}
    }
    
    final void method2276
	(boolean bool, boolean bool_1403_, int[] is, int i, int i_1404_,
	 int i_1405_, float f, float f_1406_, float f_1407_, float f_1408_,
	 float f_1409_, float f_1410_, float f_1411_, float f_1412_,
	 float f_1413_, float f_1414_, float f_1415_, float f_1416_,
	 float f_1417_, float f_1418_, float f_1419_, float f_1420_,
	 float f_1421_, float f_1422_, float f_1423_, float f_1424_,
	 float f_1425_, float f_1426_) {
	int i_1427_ = i_1405_ - i_1404_;
	float f_1428_ = 1.0F / (float) i_1427_;
	float f_1429_ = (f_1406_ - f) * f_1428_;
	float f_1430_ = (f_1408_ - f_1407_) * f_1428_;
	float f_1431_ = (f_1410_ - f_1409_) * f_1428_;
	float f_1432_ = (f_1412_ - f_1411_) * f_1428_;
	float f_1433_ = (f_1414_ - f_1413_) * f_1428_;
	float f_1434_ = (f_1416_ - f_1415_) * f_1428_;
	float f_1435_ = (f_1418_ - f_1417_) * f_1428_;
	float f_1436_ = (f_1420_ - f_1419_) * f_1428_;
	float f_1437_ = (f_1422_ - f_1421_) * f_1428_;
	float f_1438_ = (f_1424_ - f_1423_) * f_1428_;
	float f_1439_ = (f_1426_ - f_1425_) * f_1428_;
	if (aBool1485) {
	    if (i_1405_ > anInt1494)
		i_1405_ = anInt1494;
	    if (i_1404_ < 0) {
		f -= f_1429_ * (float) i_1404_;
		f_1407_ -= f_1430_ * (float) i_1404_;
		f_1409_ -= f_1431_ * (float) i_1404_;
		f_1411_ -= f_1432_ * (float) i_1404_;
		f_1413_ -= f_1433_ * (float) i_1404_;
		f_1415_ -= f_1434_ * (float) i_1404_;
		f_1417_ -= f_1435_ * (float) i_1404_;
		f_1419_ -= f_1436_ * (float) i_1404_;
		f_1421_ -= f_1437_ * (float) i_1404_;
		f_1423_ -= f_1438_ * (float) i_1404_;
		f_1425_ -= f_1439_ * (float) i_1404_;
		i_1404_ = 0;
	    }
	}
	if (i_1404_ < i_1405_) {
	    i_1427_ = i_1405_ - i_1404_;
	    i += i_1404_;
	    while (i_1427_-- > 0) {
		float f_1440_ = 1.0F / f;
		float f_1441_ = 1.0F / f_1407_;
		if (!bool || f_1440_ < aFloatArray1500[i]) {
		    float f_1442_ = f_1409_ * f_1441_;
		    float f_1443_ = f_1411_ * f_1441_;
		    int i_1444_
			= ((int) (f_1442_ * (float) anInt1504 * aFloat1506)
			   & anInt1505);
		    int i_1445_
			= ((int) (f_1443_ * (float) anInt1504 * aFloat1506)
			   & anInt1505);
		    int i_1446_
			= anIntArray1481[i_1445_ * anInt1504 + i_1444_];
		    i_1444_ = ((int) (f_1442_ * (float) anInt1512 * aFloat1514)
			       & anInt1513);
		    i_1445_ = ((int) (f_1443_ * (float) anInt1512 * aFloat1514)
			       & anInt1513);
		    int i_1447_
			= anIntArray1511[i_1445_ * anInt1512 + i_1444_];
		    i_1444_ = ((int) (f_1442_ * (float) anInt1517 * aFloat1519)
			       & anInt1509);
		    i_1445_ = ((int) (f_1443_ * (float) anInt1517 * aFloat1519)
			       & anInt1509);
		    int i_1448_
			= anIntArray1516[i_1445_ * anInt1517 + i_1444_];
		    float f_1449_ = 1.0F - (f_1423_ + f_1425_);
		    i_1446_ = (~0xffffff
			       | (int) (f_1423_
					* (float) (i_1446_ >> 16 & 0xff)) << 16
			       | (int) (f_1423_
					* (float) (i_1446_ >> 8 & 0xff)) << 8
			       | (int) (f_1423_ * (float) (i_1446_ & 0xff)));
		    i_1447_ = (~0xffffff
			       | (int) (f_1425_
					* (float) (i_1447_ >> 16 & 0xff)) << 16
			       | (int) (f_1425_
					* (float) (i_1447_ >> 8 & 0xff)) << 8
			       | (int) (f_1425_ * (float) (i_1447_ & 0xff)));
		    i_1448_ = (~0xffffff
			       | (int) (f_1449_
					* (float) (i_1448_ >> 16 & 0xff)) << 16
			       | (int) (f_1449_
					* (float) (i_1448_ >> 8 & 0xff)) << 8
			       | (int) (f_1449_ * (float) (i_1448_ & 0xff)));
		    int i_1450_ = i_1446_ + i_1447_ + i_1448_;
		    int i_1451_
			= (~0xffffff
			   | ((int) (f_1417_ * (float) (i_1450_ >> 16 & 0xff))
			      << 8) & 0xff0000
			   | ((int) (f_1419_ * (float) (i_1450_ >> 8 & 0xff))
			      & 0xff00)
			   | (int) (f_1421_ * (float) (i_1450_ & 0xff)) >> 8);
		    if (f_1413_ != 0.0F) {
			int i_1452_ = (int) (255.0F - f_1413_);
			int i_1453_ = ((((anInt1501 & 0xff00ff) * (int) f_1413_
					 & ~0xff00ff)
					| ((anInt1501 & 0xff00) * (int) f_1413_
					   & 0xff0000))
				       >>> 8);
			i_1451_ = (((i_1451_ & 0xff00ff) * i_1452_ & ~0xff00ff
				    | (i_1451_ & 0xff00) * i_1452_ & 0xff0000)
				   >>> 8) + i_1453_;
		    }
		    if (bool_1403_)
			is[i] = ((int) f_1415_ | is[i] >> 24) << 24 | i_1451_;
		    else
			is[i] = i_1451_;
		    if (bool)
			aFloatArray1500[i] = f_1440_;
		}
		i++;
		f += f_1429_;
		f_1407_ += f_1430_;
		f_1409_ += f_1431_;
		f_1411_ += f_1432_;
		f_1413_ += f_1433_;
		f_1415_ += f_1434_;
		f_1417_ += f_1435_;
		f_1419_ += f_1436_;
		f_1421_ += f_1437_;
		f_1423_ += f_1438_;
		f_1425_ += f_1439_;
	    }
	}
    }
}
