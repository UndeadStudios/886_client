/* Class182_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

public class Class182_Sub2 extends Class182
{
    int anInt9463;
    int anInt9464;
    boolean aBool9465;
    int[] anIntArray9466;
    Class435 aClass435_9467;
    int anInt9468;
    float[] aFloatArray9469;
    int anInt9470;
    Class444 aClass444_9471;
    int anInt9472;
    int anInt9473;
    int anInt9474;
    int anInt9475;
    int anInt9476;
    Class157 aClass157_9477;
    int anInt9478;
    int anInt9479;
    float aFloat9480;
    int anInt9481;
    Class435 aClass435_9482;
    Class435 aClass435_9483;
    float[][] aFloatArrayArray9484;
    int anInt9485;
    int anInt9486;
    int anInt9487;
    int anInt9488;
    float aFloat9489;
    Class200 aClass200_9490;
    float aFloat9491;
    float aFloat9492;
    Class157 aClass157_9493;
    int anInt9494;
    float aFloat9495;
    Class110[] aClass110Array9496;
    Class200 aClass200_9497;
    float aFloat9498;
    int anInt9499;
    int anInt9500;
    boolean aBool9501 = false;
    Class168_Sub2 aClass168_Sub2_9502;
    public static Class228 aClass228_9503;
    static Class525_Sub16_Sub6 aClass525_Sub16_Sub6_9504;
    
    public void method3151(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_) {
	if (anIntArray9466 != null) {
	    if (i < anInt9470 * 1988019027) {
		i_1_ -= 1988019027 * anInt9470 - i;
		i = anInt9470 * 1988019027;
	    }
	    if (i_0_ < anInt9472 * 1722112305) {
		i_2_ -= anInt9472 * 1722112305 - i_0_;
		i_0_ = 1722112305 * anInt9472;
	    }
	    if (i_1_ + i > -466178451 * anInt9499)
		i_1_ = anInt9499 * -466178451 - i;
	    if (i_0_ + i_2_ > 1920901985 * anInt9473)
		i_2_ = 1920901985 * anInt9473 - i_0_;
	    if (i_1_ > 0 && i_2_ > 0 && i <= -466178451 * anInt9499
		&& i_0_ <= anInt9473 * 1920901985) {
		int i_5_ = -476035351 * anInt9494 - i_1_;
		int i_6_ = anInt9494 * -476035351 * i_0_ + i;
		int i_7_ = i_3_ >>> 24;
		if (i_4_ == 0 || i_4_ == 1 && 255 == i_7_) {
		    int i_8_ = i_1_ >> 3;
		    int i_9_ = i_1_ & 0x7;
		    i_1_ = i_6_ - 1;
		    for (int i_10_ = -i_2_; i_10_ < 0; i_10_++) {
			if (i_8_ > 0) {
			    i = i_8_;
			    do {
				anIntArray9466[++i_1_] = i_3_;
				anIntArray9466[++i_1_] = i_3_;
				anIntArray9466[++i_1_] = i_3_;
				anIntArray9466[++i_1_] = i_3_;
				anIntArray9466[++i_1_] = i_3_;
				anIntArray9466[++i_1_] = i_3_;
				anIntArray9466[++i_1_] = i_3_;
				anIntArray9466[++i_1_] = i_3_;
			    } while (--i > 0);
			}
			if (i_9_ > 0) {
			    i = i_9_;
			    do
				anIntArray9466[++i_1_] = i_3_;
			    while (--i > 0);
			}
			i_1_ += i_5_;
		    }
		} else if (1 == i_4_) {
		    i_3_ = ((i_7_ * ((i_3_ & ~0xff00ff) >>> 8) & ~0xff00ff)
			    + ((i_3_ & 0xff00ff) * i_7_ >> 8 & 0xff00ff));
		    int i_11_ = 256 - i_7_;
		    for (int i_12_ = 0; i_12_ < i_2_; i_12_++) {
			for (int i_13_ = -i_1_; i_13_ < 0; i_13_++) {
			    int i_14_ = anIntArray9466[i_6_];
			    i_14_ = ((((i_14_ & ~0xff00ff) >>> 8) * i_11_
				      & ~0xff00ff)
				     + ((i_14_ & 0xff00ff) * i_11_ >> 8
					& 0xff00ff));
			    anIntArray9466[i_6_++] = i_14_ + i_3_;
			}
			i_6_ += i_5_;
		    }
		} else if (i_4_ == 2) {
		    for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
			for (int i_16_ = -i_1_; i_16_ < 0; i_16_++) {
			    int i_17_ = anIntArray9466[i_6_];
			    int i_18_ = i_17_ + i_3_;
			    int i_19_ = (i_3_ & 0xff00ff) + (i_17_ & 0xff00ff);
			    i_17_ = (i_19_ & 0x1000100) + (i_18_ - i_19_
							   & 0x10000);
			    anIntArray9466[i_6_++]
				= i_18_ - i_17_ | i_17_ - (i_17_ >>> 8);
			}
			i_6_ += i_5_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Class169 method3253(int[] is) {
	return null;
    }
    
    public Class170 method3130() {
	return new Class170(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    boolean method15164(int i) {
	TextureMetrics class166 = aClass180_1944.method3116(i, -1431554601);
	return anInterface24_1943.method130(Class593.aClass593_7831, i,
					    Class594.aClass594_7833, 0.7F,
					    2082667437 * class166.bitLoad,
					    class166.bitLoad * 2082667437,
					    true, (byte) 72);
    }
    
    public void method3133() {
	/* empty */
    }
    
    public void method3442(int i) {
	int i_20_ = i - 284847091 * anInt9464;
	for (Class525_Sub17 class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3796(-138118524);
	     class525_sub17 != null;
	     class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3818(-1778695684)) {
	    if (class525_sub17.aBool10558) {
		class525_sub17.anInt10555 += i_20_;
		int i_21_ = class525_sub17.anInt10555 / 50;
		if (i_21_ > 0) {
		    TextureMetrics class166
			= aClass180_1944.method3116(class525_sub17.anInt10560,
						    -1431554601);
		    float f = (float) (class166.bitLoad * 2082667437);
		    class525_sub17.method16272
			((int) ((float) class166.aByte1805
				* ((float) i_20_ / 1000.0F) / 64.0F * f),
			 (int) (f * ((float) class166.aByte1806
				     * ((float) i_20_ / 1000.0F) / 64.0F)));
		    class525_sub17.anInt10555 -= 50 * i_21_;
		}
		class525_sub17.aBool10558 = false;
	    }
	}
	anInt9464 = -11197125 * i;
	aClass200_9490.method3805(5, 2122936788);
	aClass200_9497.method3805(5, 2146014076);
    }
    
    public void method3136(int i) {
	int i_22_ = i - 284847091 * anInt9464;
	for (Class525_Sub17 class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3796(105878359);
	     class525_sub17 != null;
	     class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3818(-1630466604)) {
	    if (class525_sub17.aBool10558) {
		class525_sub17.anInt10555 += i_22_;
		int i_23_ = class525_sub17.anInt10555 / 50;
		if (i_23_ > 0) {
		    TextureMetrics class166
			= aClass180_1944.method3116(class525_sub17.anInt10560,
						    -1431554601);
		    float f = (float) (class166.bitLoad * 2082667437);
		    class525_sub17.method16272
			((int) ((float) class166.aByte1805
				* ((float) i_22_ / 1000.0F) / 64.0F * f),
			 (int) (f * ((float) class166.aByte1806
				     * ((float) i_22_ / 1000.0F) / 64.0F)));
		    class525_sub17.anInt10555 -= 50 * i_23_;
		}
		class525_sub17.aBool10558 = false;
	    }
	}
	anInt9464 = -11197125 * i;
	aClass200_9490.method3805(5, 2116574046);
	aClass200_9497.method3805(5, 1885224495);
    }
    
    void method3135() {
	if (aBool9465) {
	    Class511.method8524(true, false, (byte) 1);
	    aBool9465 = false;
	}
	aBool9501 = true;
    }
    
    public void method3424(Class435 class435) {
	aClass435_9482.method6947(class435);
	method15181();
    }
    
    int[] method15165(int i) {
	Class525_Sub17 class525_sub17;
	synchronized (aClass200_9497) {
	    class525_sub17
		= ((Class525_Sub17)
		   aClass200_9497.method3785((long) (i & 0xffff)
					     | ~0x7fffffffffffffffL));
	    if (class525_sub17 == null) {
		TextureMetrics class166 = aClass180_1944.method3116(i, -1431554601);
		int i_24_ = 2082667437 * class166.bitLoad;
		if (!anInterface24_1943.method130(Class593.aClass593_7831, i,
						  Class594.aClass594_7833,
						  0.7F, i_24_, i_24_, true,
						  (byte) 34)) {
		    int[] is = null;
		    return is;
		}
		int[] is;
		if (class166.aClass597_1807 != Class597.aClass597_7842)
		    is = anInterface24_1943.method132(Class593.aClass593_7831,
						      i, 0.7F, i_24_, i_24_,
						      true, -1563995344);
		else
		    is = anInterface24_1943.method129(Class593.aClass593_7831,
						      i, 0.7F, i_24_, i_24_,
						      true, -1543103039);
		class525_sub17
		    = new Class525_Sub17(i, i_24_, is,
					 (Class597.aClass597_7843
					  != class166.aClass597_1807));
		aClass200_9497.method3789(class525_sub17,
					  ((long) (i & 0xffff)
					   | ~0x7fffffffffffffffL),
					  i_24_ * i_24_, (byte) -91);
	    }
	}
	class525_sub17.aBool10558 = true;
	return class525_sub17.method16271();
    }
    
    public void method3201(int i, int i_25_, int i_26_, int i_27_, int i_28_,
			   int i_29_) {
	if (null != anIntArray9466) {
	    i_26_ -= i;
	    i_27_ -= i_25_;
	    if (0 == i_27_) {
		if (i_26_ >= 0)
		    method3199(i, i_25_, 1 + i_26_, i_28_, i_29_);
		else
		    method3199(i + i_26_, i_25_, 1 + -i_26_, i_28_, i_29_);
	    } else if (i_26_ == 0) {
		if (i_27_ >= 0)
		    method3200(i, i_25_, 1 + i_27_, i_28_, i_29_);
		else
		    method3200(i, i_27_ + i_25_, -i_27_ + 1, i_28_, i_29_);
	    } else {
		if (i_27_ + i_26_ < 0) {
		    i += i_26_;
		    i_26_ = -i_26_;
		    i_25_ += i_27_;
		    i_27_ = -i_27_;
		}
		if (i_26_ > i_27_) {
		    i_25_ <<= 16;
		    i_25_ += 32768;
		    i_27_ <<= 16;
		    int i_30_
			= (int) Math.floor((double) i_27_ / (double) i_26_
					   + 0.5);
		    i_26_ += i;
		    if (i < anInt9470 * 1988019027) {
			i_25_ += (1988019027 * anInt9470 - i) * i_30_;
			i = anInt9470 * 1988019027;
		    }
		    if (i_26_ >= -466178451 * anInt9499)
			i_26_ = -466178451 * anInt9499 - 1;
		    int i_31_ = i_28_ >>> 24;
		    if (0 == i_29_ || 1 == i_29_ && 255 == i_31_) {
			for (/**/; i <= i_26_; i++) {
			    int i_32_ = i_25_ >> 16;
			    if (i_32_ >= 1722112305 * anInt9472
				&& i_32_ < 1920901985 * anInt9473)
				anIntArray9466[i + i_32_ * (-476035351
							    * anInt9494)]
				    = i_28_;
			    i_25_ += i_30_;
			}
		    } else if (i_29_ == 1) {
			i_28_ = ((i_31_ * (i_28_ & 0xff00) >> 8 & 0xff00)
				 + ((i_28_ & 0xff00ff) * i_31_ >> 8 & 0xff00ff)
				 + (i_31_ << 24));
			int i_33_ = 256 - i_31_;
			for (/**/; i <= i_26_; i++) {
			    int i_34_ = i_25_ >> 16;
			    if (i_34_ >= 1722112305 * anInt9472
				&& i_34_ < 1920901985 * anInt9473) {
				int i_35_ = i + -476035351 * anInt9494 * i_34_;
				int i_36_ = anIntArray9466[i_35_];
				i_36_
				    = (((i_36_ & 0xff00) * i_33_ >> 8 & 0xff00)
				       + (i_33_ * (i_36_ & 0xff00ff) >> 8
					  & 0xff00ff));
				anIntArray9466[i_35_] = i_36_ + i_28_;
			    }
			    i_25_ += i_30_;
			}
		    } else if (i_29_ == 2) {
			for (/**/; i <= i_26_; i++) {
			    int i_37_ = i_25_ >> 16;
			    if (i_37_ >= 1722112305 * anInt9472
				&& i_37_ < 1920901985 * anInt9473) {
				int i_38_
				    = i + i_37_ * (-476035351 * anInt9494);
				int i_39_ = anIntArray9466[i_38_];
				int i_40_ = i_39_ + i_28_;
				int i_41_
				    = (i_39_ & 0xff00ff) + (i_28_ & 0xff00ff);
				i_39_ = (i_41_ & 0x1000100) + (i_40_ - i_41_
							       & 0x10000);
				anIntArray9466[i_38_]
				    = i_40_ - i_39_ | i_39_ - (i_39_ >>> 8);
			    }
			    i_25_ += i_30_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_26_ <<= 16;
		    int i_42_ = (int) Math.floor(0.5 + ((double) i_26_
							/ (double) i_27_));
		    i_27_ += i_25_;
		    if (i_25_ < 1722112305 * anInt9472) {
			i += (1722112305 * anInt9472 - i_25_) * i_42_;
			i_25_ = 1722112305 * anInt9472;
		    }
		    if (i_27_ >= anInt9473 * 1920901985)
			i_27_ = 1920901985 * anInt9473 - 1;
		    int i_43_ = i_28_ >>> 24;
		    if (i_29_ == 0 || 1 == i_29_ && 255 == i_43_) {
			for (/**/; i_25_ <= i_27_; i_25_++) {
			    int i_44_ = i >> 16;
			    if (i_44_ >= 1988019027 * anInt9470
				&& i_44_ < -466178451 * anInt9499)
				anIntArray9466[i_44_ + i_25_ * (-476035351
								* anInt9494)]
				    = i_28_;
			    i += i_42_;
			}
		    } else if (1 == i_29_) {
			i_28_ = (((i_28_ & 0xff00ff) * i_43_ >> 8 & 0xff00ff)
				 + (i_43_ * (i_28_ & 0xff00) >> 8 & 0xff00)
				 + (i_43_ << 24));
			int i_45_ = 256 - i_43_;
			for (/**/; i_25_ <= i_27_; i_25_++) {
			    int i_46_ = i >> 16;
			    if (i_46_ >= anInt9470 * 1988019027
				&& i_46_ < anInt9499 * -466178451) {
				int i_47_
				    = i_46_ + -476035351 * anInt9494 * i_25_;
				int i_48_ = anIntArray9466[i_47_];
				i_48_ = (((i_48_ & 0xff00ff) * i_45_ >> 8
					  & 0xff00ff)
					 + (i_45_ * (i_48_ & 0xff00) >> 8
					    & 0xff00));
				anIntArray9466[i_25_ * (anInt9494
							* -476035351) + i_46_]
				    = i_28_ + i_48_;
			    }
			    i += i_42_;
			}
		    } else if (i_29_ == 2) {
			for (/**/; i_25_ <= i_27_; i_25_++) {
			    int i_49_ = i >> 16;
			    if (i_49_ >= anInt9470 * 1988019027
				&& i_49_ < anInt9499 * -466178451) {
				int i_50_
				    = i_49_ + i_25_ * (-476035351 * anInt9494);
				int i_51_ = anIntArray9466[i_50_];
				int i_52_ = i_28_ + i_51_;
				int i_53_
				    = (i_28_ & 0xff00ff) + (i_51_ & 0xff00ff);
				i_51_ = (i_53_ & 0x1000100) + (i_52_ - i_53_
							       & 0x10000);
				anIntArray9466[i_50_]
				    = i_52_ - i_51_ | i_51_ - (i_51_ >>> 8);
			    }
			    i += i_42_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public boolean method3456() {
	return false;
    }
    
    Class597 method15166(int i) {
	return aClass180_1944.method3116(i, -1431554601).aClass597_1807;
    }
    
    byte method15167(int i) {
	return aClass180_1944.method3116(i, -1431554601).aByte1830;
    }
    
    int method15168(int i) {
	return aClass180_1944.method3116(i, -1431554601).aShort1834 & 0xffff;
    }
    
    boolean method15169(int i) {
	TextureMetrics class166 = aClass180_1944.method3116(i, -1431554601);
	return class166.aByte1810 != 0 || class166.aByte1811 != 0;
    }
    
    public boolean method3138() {
	return false;
    }
    
    public boolean method3382() {
	return false;
    }
    
    public boolean method3258() {
	return true;
    }
    
    public boolean method3142() {
	return false;
    }
    
    public boolean method3143() {
	return false;
    }
    
    public boolean method3345() {
	return false;
    }
    
    void method15170(int i) {
	anInt9481 = i * 1873500683;
	aClass110Array9496 = new Class110[anInt9481 * -1098456669];
	for (int i_54_ = 0; i_54_ < anInt9481 * -1098456669; i_54_++)
	    aClass110Array9496[i_54_] = new Class110(this);
    }
    
    public Class525_Sub26 method3210(int i) {
	return null;
    }
    
    public boolean method3146() {
	return false;
    }
    
    public void method3465(int i, float f, float f_55_, float f_56_,
			   float f_57_, float f_58_) {
	anInt9463 = -1599142575 * (int) (65535.0F * f);
	anInt9478 = (int) (f_55_ * 65535.0F) * 845202011;
	float f_59_ = (float) Math.sqrt((double) (f_56_ * f_56_ + f_57_ * f_57_
						  + f_58_ * f_58_));
	anInt9474 = (int) (f_56_ * 65535.0F / f_59_) * -416042509;
	anInt9475 = 818849719 * (int) (f_57_ * 65535.0F / f_59_);
	anInt9468 = (int) (65535.0F * f_58_ / f_59_) * -1887473201;
    }
    
    public String method3265() {
	return "";
    }
    
    public void method3433(int i, float f, float f_60_, float f_61_,
			   float f_62_, float f_63_) {
	anInt9463 = -1599142575 * (int) (65535.0F * f);
	anInt9478 = (int) (f_60_ * 65535.0F) * 845202011;
	float f_64_ = (float) Math.sqrt((double) (f_61_ * f_61_ + f_62_ * f_62_
						  + f_63_ * f_63_));
	anInt9474 = (int) (f_61_ * 65535.0F / f_64_) * -416042509;
	anInt9475 = 818849719 * (int) (f_62_ * 65535.0F / f_64_);
	anInt9468 = (int) (65535.0F * f_63_ / f_64_) * -1887473201;
    }
    
    public boolean method3312() {
	return false;
    }
    
    Class168_Sub1 method3536(Canvas canvas, int i, int i_65_) {
	return Class152_Sub1.method14535(this, canvas, i, i_65_, 3649320);
    }
    
    void method15171(int i, int i_66_, int[] is, float[] fs) {
	anInt9494 = 1050079577 * i;
	anInt9476 = 1151409721 * i_66_;
	anIntArray9466 = is;
	aFloatArray9469 = fs;
	for (int i_67_ = 0; i_67_ < -1098456669 * anInt9481; i_67_++)
	    aClass110Array9496[i_67_].method1954((byte) 79);
	method3480();
	method3580();
    }
    
    public void method3448(float f, float f_68_, float f_69_, float f_70_,
			   float f_71_) {
	/* empty */
    }
    
    public void method3166() {
	/* empty */
    }
    
    public void method3234(int[] is) {
	is[0] = -476035351 * anInt9494;
	is[1] = -1845137399 * anInt9476;
    }
    
    void method3468(float f, float f_72_, float f_73_, float f_74_,
		    float f_75_, float f_76_) {
	/* empty */
    }
    
    public int method3381(int i, int i_77_, int i_78_, int i_79_, int i_80_,
			  int i_81_) {
	int i_82_ = 0;
	float f = ((float) i_78_ * aClass435_9483.aFloatArray4830[10]
		   + ((float) i_77_ * aClass435_9483.aFloatArray4830[6]
		      + (aClass435_9483.aFloatArray4830[2] * (float) i
			 + aClass435_9483.aFloatArray4830[14])));
	float f_83_ = (aClass435_9483.aFloatArray4830[14]
		       + aClass435_9483.aFloatArray4830[2] * (float) i_79_
		       + aClass435_9483.aFloatArray4830[6] * (float) i_80_
		       + aClass435_9483.aFloatArray4830[10] * (float) i_81_);
	float f_84_ = (aClass435_9483.aFloatArray4830[11] * (float) i_78_
		       + (aClass435_9483.aFloatArray4830[7] * (float) i_77_
			  + (aClass435_9483.aFloatArray4830[3] * (float) i
			     + aClass435_9483.aFloatArray4830[15])));
	float f_85_ = ((float) i_81_ * aClass435_9483.aFloatArray4830[11]
		       + ((float) i_80_ * aClass435_9483.aFloatArray4830[7]
			  + ((float) i_79_ * aClass435_9483.aFloatArray4830[3]
			     + aClass435_9483.aFloatArray4830[15])));
	if (f < -f_84_ && f_83_ < -f_85_)
	    i_82_ |= 0x10;
	else if (f > f_84_ && f_83_ > f_85_)
	    i_82_ |= 0x20;
	float f_86_ = ((float) i_77_ * aClass435_9483.aFloatArray4830[4]
		       + (aClass435_9483.aFloatArray4830[12]
			  + (float) i * aClass435_9483.aFloatArray4830[0])
		       + aClass435_9483.aFloatArray4830[8] * (float) i_78_);
	float f_87_
	    = ((float) i_81_ * aClass435_9483.aFloatArray4830[8]
	       + (aClass435_9483.aFloatArray4830[12]
		  + aClass435_9483.aFloatArray4830[0] * (float) i_79_
		  + aClass435_9483.aFloatArray4830[4] * (float) i_80_));
	if (f_86_ < -f_84_ && f_87_ < -f_85_)
	    i_82_ |= 0x1;
	if (f_86_ > f_84_ && f_87_ > f_85_)
	    i_82_ |= 0x2;
	float f_88_
	    = ((float) i_78_ * aClass435_9483.aFloatArray4830[9]
	       + (aClass435_9483.aFloatArray4830[1] * (float) i
		  + aClass435_9483.aFloatArray4830[13]
		  + (float) i_77_ * aClass435_9483.aFloatArray4830[5]));
	float f_89_ = (aClass435_9483.aFloatArray4830[13]
		       + (float) i_79_ * aClass435_9483.aFloatArray4830[1]
		       + aClass435_9483.aFloatArray4830[5] * (float) i_80_
		       + aClass435_9483.aFloatArray4830[9] * (float) i_81_);
	if (f_88_ < -f_84_ && f_89_ < -f_85_)
	    i_82_ |= 0x4;
	if (f_88_ > f_84_ && f_89_ > f_85_)
	    i_82_ |= 0x8;
	return i_82_;
    }
    
    public boolean method3169() {
	return false;
    }
    
    public boolean method3170() {
	return false;
    }
    
    public int method3171() {
	return -1;
    }
    
    public void method3173(int i, int i_90_, int i_91_) {
	/* empty */
    }
    
    boolean method3208(int i, int i_92_, int i_93_, int i_94_,
		       Class444 class444, Class443 class443) {
	Class435 class435 = method3224();
	class435.method7040(class444);
	class435.method6950(aClass435_9483);
	return class443.method7128(i, i_92_, i_93_, i_94_, class435,
				   aFloat9495, aFloat9492, aFloat9489,
				   aFloat9491);
    }
    
    public long method3174(int i, int i_95_) {
	return 0L;
    }
    
    public Interface22 method3490(int i, int i_96_, int i_97_) {
	return new HashTable(i, i_96_);
    }
    
    public void method3149(int i, int i_98_, int[] is, int[] is_99_) {
	method3177(i, i_98_, (short) -5779);
	if (null == aClass157_9477 || aClass157_9477.method2503() != i
	    || aClass157_9477.method2471() != i_98_) {
	    aClass157_9477 = method3213(i, i_98_, true, true);
	    aClass168_Sub2_9502 = null;
	}
	if (aClass168_Sub2_9502 == null) {
	    aClass168_Sub2_9502 = method3314();
	    aClass168_Sub2_9502.method15585(0, aClass157_9477.method2521());
	}
	Class157_Sub1_Sub3 class157_sub1_sub3
	    = new Class157_Sub1_Sub3(this, anIntArray9466,
				     -476035351 * anInt9494,
				     anInt9476 * -1845137399);
	method3158(aClass168_Sub2_9502, -1166817212);
	method3188(1, -16777216);
	class157_sub1_sub3.method2483(anInt1958 * 1000431205,
				      anInt1964 * 1482704485,
				      anInt1935 * -1588334531,
				      anInt1967 * -863940247, 1, 0, 0, 0);
	aClass157_9477.method2475(0, 0, i, i_98_, is, is_99_, 0, i);
	method3159(aClass168_Sub2_9502, -1876999470);
    }
    
    public void method3441(Class174 class174) {
	/* empty */
    }
    
    void method15172() {
	if (null != aFloatArray9469) {
	    if (0 == anInt9470 * 1988019027
		&& anInt9499 * -466178451 == anInt9494 * -476035351
		&& anInt9472 * 1722112305 == 0
		&& anInt9476 * -1845137399 == anInt9473 * 1920901985) {
		int i = aFloatArray9469.length;
		int i_100_ = i - (i & 0x7);
		int i_101_ = 0;
		while (i_101_ < i_100_) {
		    aFloatArray9469[i_101_++] = 2.14748365E9F;
		    aFloatArray9469[i_101_++] = 2.14748365E9F;
		    aFloatArray9469[i_101_++] = 2.14748365E9F;
		    aFloatArray9469[i_101_++] = 2.14748365E9F;
		    aFloatArray9469[i_101_++] = 2.14748365E9F;
		    aFloatArray9469[i_101_++] = 2.14748365E9F;
		    aFloatArray9469[i_101_++] = 2.14748365E9F;
		    aFloatArray9469[i_101_++] = 2.14748365E9F;
		}
		while (i_101_ < i)
		    aFloatArray9469[i_101_++] = 2.14748365E9F;
	    } else {
		int i = -466178451 * anInt9499 - 1988019027 * anInt9470;
		int i_102_ = 1920901985 * anInt9473 - 1722112305 * anInt9472;
		int i_103_ = -476035351 * anInt9494 - i;
		int i_104_ = (-476035351 * anInt9494 * (1722112305 * anInt9472)
			      + 1988019027 * anInt9470);
		int i_105_ = i >> 3;
		int i_106_ = i & 0x7;
		i = i_104_ - 1;
		for (int i_107_ = -i_102_; i_107_ < 0; i_107_++) {
		    if (i_105_ > 0) {
			int i_108_ = i_105_;
			do {
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			} while (--i_108_ > 0);
		    }
		    if (i_106_ > 0) {
			int i_109_ = i_106_;
			do
			    aFloatArray9469[++i] = 2.14748365E9F;
			while (--i_109_ > 0);
		    }
		    i += i_103_;
		}
	    }
	}
    }
    
    public Class170 method3436() {
	return new Class170(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    public void method3336(boolean bool) {
	/* empty */
    }
    
    public void method3277(int i, int i_110_, int i_111_, int i_112_) {
	anInt9485 = 878748845 * i;
	anInt9486 = i_110_ * -40344083;
	anInt9487 = i_111_ * -888844797;
	anInt9488 = 1674120175 * i_112_;
	method15173();
    }
    
    public void method3181(int[] is) {
	is[0] = -2044960987 * anInt9485;
	is[1] = -1459240987 * anInt9486;
	is[2] = anInt9487 * -1295758165;
	is[3] = anInt9488 * -223116529;
    }
    
    public void method3182(float f, float f_113_) {
	aFloat9480 = f_113_ - f;
	aFloat9498 = f + f_113_ - 1.0F;
	for (int i = 0; i < -1098456669 * anInt9481; i++) {
	    Class110 class110 = aClass110Array9496[i];
	    Class128 class128 = class110.aClass128_1338;
	    class128.aFloat1493 = aFloat9480;
	    class128.aFloat1492 = aFloat9498;
	}
    }
    
    void method15173() {
	int i = anInt9499 * -466178451 - 1988019027 * anInt9470;
	int i_114_ = 1920901985 * anInt9473 - anInt9472 * 1722112305;
	float f = aFloat9489 = (float) (-1295758165 * anInt9487) / 2.0F;
	float f_115_ = aFloat9491 = (float) (-223116529 * anInt9488) / 2.0F;
	aFloat9495 = (float) (-2044960987 * anInt9485) + f;
	aFloat9492 = f_115_ + (float) (-1459240987 * anInt9486);
	for (int i_116_ = 0; i_116_ < -1098456669 * anInt9481; i_116_++) {
	    Class110 class110 = aClass110Array9496[i_116_];
	    Class128 class128 = class110.aClass128_1338;
	    class128.aFloat1489 = f;
	    class128.aFloat1491 = f_115_;
	    class128.aFloat1503
		= aFloat9495 - (float) (1988019027 * anInt9470);
	    class128.aFloat1490
		= aFloat9492 - (float) (1722112305 * anInt9472);
	    class128.anInt1494 = i;
	    class128.anInt1495 = i_114_;
	}
	int i_117_ = (1988019027 * anInt9470
		      + 1722112305 * anInt9472 * (anInt9494 * -476035351));
	for (int i_118_ = anInt9472 * 1722112305;
	     i_118_ < 1920901985 * anInt9473; i_118_++) {
	    for (int i_119_ = 0; i_119_ < -1098456669 * anInt9481; i_119_++)
		aClass110Array9496[i_119_].aClass128_1338.anIntArray1487
		    [i_118_ - anInt9472 * 1722112305]
		    = i_117_;
	    i_117_ += anInt9494 * -476035351;
	}
    }
    
    public void method3480() {
	anInt9470 = 0;
	anInt9472 = 0;
	anInt9499 = anInt9494 * -2146140947;
	anInt9473 = anInt9476 * 1139324329;
	method15173();
    }
    
    public boolean method3144() {
	return false;
    }
    
    public void method3185(int i, int i_120_, int i_121_, int i_122_) {
	if (anInt9470 * 1988019027 < i)
	    anInt9470 = i * 838891739;
	if (1722112305 * anInt9472 < i_120_)
	    anInt9472 = i_120_ * -348561455;
	if (anInt9499 * -466178451 > i_121_)
	    anInt9499 = 1771604837 * i_121_;
	if (anInt9473 * 1920901985 > i_122_)
	    anInt9473 = i_122_ * -2023538527;
	method15173();
    }
    
    public void method3187(int[] is) {
	is[0] = 1988019027 * anInt9470;
	is[1] = anInt9472 * 1722112305;
	is[2] = anInt9499 * -466178451;
	is[3] = anInt9473 * 1920901985;
    }
    
    public void method3188(int i, int i_123_) {
	if ((i & 0x1) != 0)
	    method3151(0, 0, anInt9494 * -476035351, -1845137399 * anInt9476,
		       i_123_, 0);
	if ((i & 0x2) != 0)
	    method15172();
    }
    
    public void method3195(int i, int i_124_, int i_125_, int i_126_,
			   int i_127_, int i_128_) {
	method3199(i, i_124_, i_125_, i_127_, i_128_);
	method3199(i, i_126_ + i_124_ - 1, i_125_, i_127_, i_128_);
	method3200(i, i_124_ + 1, i_126_ - 2, i_127_, i_128_);
	method3200(i + i_125_ - 1, i_124_ + 1, i_126_ - 2, i_127_, i_128_);
    }
    
    public boolean method3292() {
	return false;
    }
    
    public void method3291(int i, int i_129_) {
	if ((i & 0x1) != 0)
	    method3151(0, 0, anInt9494 * -476035351, -1845137399 * anInt9476,
		       i_129_, 0);
	if ((i & 0x2) != 0)
	    method15172();
    }
    
    void method3199(int i, int i_130_, int i_131_, int i_132_, int i_133_) {
	if (anIntArray9466 != null && (i_130_ >= anInt9472 * 1722112305
				       && i_130_ < 1920901985 * anInt9473)) {
	    if (i < anInt9470 * 1988019027) {
		i_131_ -= anInt9470 * 1988019027 - i;
		i = anInt9470 * 1988019027;
	    }
	    if (i_131_ + i > -466178451 * anInt9499)
		i_131_ = anInt9499 * -466178451 - i;
	    int i_134_ = i + i_130_ * (-476035351 * anInt9494);
	    int i_135_ = i_132_ >>> 24;
	    if (0 == i_133_ || i_133_ == 1 && i_135_ == 255) {
		for (int i_136_ = 0; i_136_ < i_131_; i_136_++)
		    anIntArray9466[i_134_ + i_136_] = i_132_;
	    } else if (1 == i_133_) {
		i_132_ = (i_135_ << 24) + (((i_132_ & 0xff00) * i_135_ >> 8
					    & 0xff00)
					   + ((i_132_ & 0xff00ff) * i_135_ >> 8
					      & 0xff00ff));
		int i_137_ = 256 - i_135_;
		for (int i_138_ = 0; i_138_ < i_131_; i_138_++) {
		    int i_139_ = anIntArray9466[i_134_ + i_138_];
		    i_139_
			= ((i_137_ * (i_139_ & 0xff00) >> 8 & 0xff00)
			   + (i_137_ * (i_139_ & 0xff00ff) >> 8 & 0xff00ff));
		    anIntArray9466[i_134_ + i_138_] = i_139_ + i_132_;
		}
	    } else if (i_133_ == 2) {
		for (int i_140_ = 0; i_140_ < i_131_; i_140_++) {
		    int i_141_ = anIntArray9466[i_134_ + i_140_];
		    int i_142_ = i_132_ + i_141_;
		    int i_143_ = (i_141_ & 0xff00ff) + (i_132_ & 0xff00ff);
		    i_141_
			= (i_143_ & 0x1000100) + (i_142_ - i_143_ & 0x10000);
		    anIntArray9466[i_140_ + i_134_]
			= i_142_ - i_141_ | i_141_ - (i_141_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public boolean method3376() {
	return false;
    }
    
    void method3200(int i, int i_144_, int i_145_, int i_146_, int i_147_) {
	if (anIntArray9466 != null
	    && (i >= anInt9470 * 1988019027 && i < anInt9499 * -466178451)) {
	    if (i_144_ < anInt9472 * 1722112305) {
		i_145_ -= 1722112305 * anInt9472 - i_144_;
		i_144_ = anInt9472 * 1722112305;
	    }
	    if (i_145_ + i_144_ > anInt9473 * 1920901985)
		i_145_ = anInt9473 * 1920901985 - i_144_;
	    int i_148_ = i + i_144_ * (anInt9494 * -476035351);
	    int i_149_ = i_146_ >>> 24;
	    if (0 == i_147_ || i_147_ == 1 && i_149_ == 255) {
		for (int i_150_ = 0; i_150_ < i_145_; i_150_++)
		    anIntArray9466[i_148_ + i_150_ * (anInt9494 * -476035351)]
			= i_146_;
	    } else if (1 == i_147_) {
		i_146_ = (((i_146_ & 0xff00ff) * i_149_ >> 8 & 0xff00ff)
			  + ((i_146_ & 0xff00) * i_149_ >> 8 & 0xff00)
			  + (i_149_ << 24));
		int i_151_ = 256 - i_149_;
		for (int i_152_ = 0; i_152_ < i_145_; i_152_++) {
		    int i_153_ = -476035351 * anInt9494 * i_152_ + i_148_;
		    int i_154_ = anIntArray9466[i_153_];
		    i_154_ = (((i_154_ & 0xff00ff) * i_151_ >> 8 & 0xff00ff)
			      + ((i_154_ & 0xff00) * i_151_ >> 8 & 0xff00));
		    anIntArray9466[i_153_] = i_146_ + i_154_;
		}
	    } else if (i_147_ == 2) {
		for (int i_155_ = 0; i_155_ < i_145_; i_155_++) {
		    int i_156_ = i_155_ * (anInt9494 * -476035351) + i_148_;
		    int i_157_ = anIntArray9466[i_156_];
		    int i_158_ = i_146_ + i_157_;
		    int i_159_ = (i_146_ & 0xff00ff) + (i_157_ & 0xff00ff);
		    i_157_
			= (i_159_ & 0x1000100) + (i_158_ - i_159_ & 0x10000);
		    anIntArray9466[i_156_]
			= i_158_ - i_157_ | i_157_ - (i_157_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public int method3474(int i, int i_160_, int i_161_, int i_162_,
			  int i_163_, int i_164_) {
	int i_165_ = 0;
	float f = ((float) i_161_ * aClass435_9483.aFloatArray4830[10]
		   + ((float) i_160_ * aClass435_9483.aFloatArray4830[6]
		      + (aClass435_9483.aFloatArray4830[2] * (float) i
			 + aClass435_9483.aFloatArray4830[14])));
	float f_166_ = (aClass435_9483.aFloatArray4830[14]
			+ aClass435_9483.aFloatArray4830[2] * (float) i_162_
			+ aClass435_9483.aFloatArray4830[6] * (float) i_163_
			+ aClass435_9483.aFloatArray4830[10] * (float) i_164_);
	float f_167_ = (aClass435_9483.aFloatArray4830[11] * (float) i_161_
			+ (aClass435_9483.aFloatArray4830[7] * (float) i_160_
			   + (aClass435_9483.aFloatArray4830[3] * (float) i
			      + aClass435_9483.aFloatArray4830[15])));
	float f_168_
	    = ((float) i_164_ * aClass435_9483.aFloatArray4830[11]
	       + ((float) i_163_ * aClass435_9483.aFloatArray4830[7]
		  + ((float) i_162_ * aClass435_9483.aFloatArray4830[3]
		     + aClass435_9483.aFloatArray4830[15])));
	if (f < -f_167_ && f_166_ < -f_168_)
	    i_165_ |= 0x10;
	else if (f > f_167_ && f_166_ > f_168_)
	    i_165_ |= 0x20;
	float f_169_ = ((float) i_160_ * aClass435_9483.aFloatArray4830[4]
			+ (aClass435_9483.aFloatArray4830[12]
			   + (float) i * aClass435_9483.aFloatArray4830[0])
			+ aClass435_9483.aFloatArray4830[8] * (float) i_161_);
	float f_170_
	    = ((float) i_164_ * aClass435_9483.aFloatArray4830[8]
	       + (aClass435_9483.aFloatArray4830[12]
		  + aClass435_9483.aFloatArray4830[0] * (float) i_162_
		  + aClass435_9483.aFloatArray4830[4] * (float) i_163_));
	if (f_169_ < -f_167_ && f_170_ < -f_168_)
	    i_165_ |= 0x1;
	if (f_169_ > f_167_ && f_170_ > f_168_)
	    i_165_ |= 0x2;
	float f_171_
	    = ((float) i_161_ * aClass435_9483.aFloatArray4830[9]
	       + (aClass435_9483.aFloatArray4830[1] * (float) i
		  + aClass435_9483.aFloatArray4830[13]
		  + (float) i_160_ * aClass435_9483.aFloatArray4830[5]));
	float f_172_ = (aClass435_9483.aFloatArray4830[13]
			+ (float) i_162_ * aClass435_9483.aFloatArray4830[1]
			+ aClass435_9483.aFloatArray4830[5] * (float) i_163_
			+ aClass435_9483.aFloatArray4830[9] * (float) i_164_);
	if (f_171_ < -f_167_ && f_172_ < -f_168_)
	    i_165_ |= 0x4;
	if (f_171_ > f_167_ && f_172_ > f_168_)
	    i_165_ |= 0x8;
	return i_165_;
    }
    
    public boolean method3327() {
	return true;
    }
    
    public void method3508(int i, int i_173_, int i_174_, int i_175_,
			   int i_176_, int i_177_, int i_178_, int i_179_,
			   int i_180_) {
	if (null != anIntArray9466) {
	    i_174_ -= i;
	    i_175_ -= i_173_;
	    if (i_175_ == 0) {
		if (i_174_ >= 0)
		    method15210(i, i_173_, i_174_ + 1, i_176_, i_177_, i_178_,
				i_179_, i_180_);
		else {
		    int i_181_ = i_179_ + i_178_;
		    i_180_ %= i_181_;
		    i_180_ = i_181_ + i_178_ - i_180_ - (1 + -i_174_) % i_181_;
		    i_180_ %= i_181_;
		    if (i_180_ < 0)
			i_180_ += i_181_;
		    method15210(i_174_ + i, i_173_, 1 + -i_174_, i_176_,
				i_177_, i_178_, i_179_, i_180_);
		}
	    } else if (0 == i_174_) {
		if (i_175_ >= 0)
		    method15198(i, i_173_, 1 + i_175_, i_176_, i_177_, i_178_,
				i_179_, i_180_);
		else {
		    int i_182_ = i_178_ + i_179_;
		    i_180_ %= i_182_;
		    i_180_ = i_178_ + i_182_ - i_180_ - (-i_175_ + 1) % i_182_;
		    i_180_ %= i_182_;
		    if (i_180_ < 0)
			i_180_ += i_182_;
		    method15198(i, i_175_ + i_173_, 1 + -i_175_, i_176_,
				i_177_, i_178_, i_179_, i_180_);
		}
	    } else {
		i_180_ <<= 8;
		i_178_ <<= 8;
		i_179_ <<= 8;
		int i_183_ = i_178_ + i_179_;
		i_180_ %= i_183_;
		if (i_174_ + i_175_ < 0) {
		    int i_184_ = (int) (Math.sqrt((double) (i_174_ * i_174_
							    + i_175_ * i_175_))
					* 256.0);
		    int i_185_ = i_184_ % i_183_;
		    i_180_ = i_183_ + i_178_ - i_180_ - i_185_;
		    i_180_ %= i_183_;
		    if (i_180_ < 0)
			i_180_ += i_183_;
		    i += i_174_;
		    i_174_ = -i_174_;
		    i_173_ += i_175_;
		    i_175_ = -i_175_;
		}
		if (i_174_ > i_175_) {
		    i_173_ <<= 16;
		    i_173_ += 32768;
		    i_175_ <<= 16;
		    int i_186_ = (int) Math.floor(0.5 + ((double) i_175_
							 / (double) i_174_));
		    i_174_ += i;
		    int i_187_ = i_176_ >>> 24;
		    int i_188_
			= (int) Math.sqrt((double) (65536
						    + (i_186_ >> 8) * (i_186_
								       >> 8)));
		    if (0 == i_177_ || 1 == i_177_ && 255 == i_187_) {
			while (i <= i_174_) {
			    int i_189_ = i_173_ >> 16;
			    if (i >= anInt9470 * 1988019027
				&& i < -466178451 * anInt9499
				&& i_189_ >= 1722112305 * anInt9472
				&& i_189_ < 1920901985 * anInt9473
				&& i_180_ < i_178_)
				anIntArray9466[i + i_189_ * (-476035351
							     * anInt9494)]
				    = i_176_;
			    i_173_ += i_186_;
			    i++;
			    i_180_ += i_188_;
			    i_180_ %= i_183_;
			}
		    } else if (i_177_ == 1) {
			i_176_
			    = ((i_187_ * (i_176_ & 0xff00) >> 8 & 0xff00)
			       + (i_187_ * (i_176_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_187_ << 24));
			int i_190_ = 256 - i_187_;
			while (i <= i_174_) {
			    int i_191_ = i_173_ >> 16;
			    if (i >= anInt9470 * 1988019027
				&& i < -466178451 * anInt9499
				&& i_191_ >= anInt9472 * 1722112305
				&& i_191_ < anInt9473 * 1920901985
				&& i_180_ < i_178_) {
				int i_192_
				    = i + i_191_ * (anInt9494 * -476035351);
				int i_193_ = anIntArray9466[i_192_];
				i_193_ = ((i_190_ * (i_193_ & 0xff00) >> 8
					   & 0xff00)
					  + ((i_193_ & 0xff00ff) * i_190_ >> 8
					     & 0xff00ff));
				anIntArray9466[i_192_] = i_193_ + i_176_;
			    }
			    i_173_ += i_186_;
			    i++;
			    i_180_ += i_188_;
			    i_180_ %= i_183_;
			}
		    } else if (i_177_ == 2) {
			while (i <= i_174_) {
			    int i_194_ = i_173_ >> 16;
			    if (i >= anInt9470 * 1988019027
				&& i < anInt9499 * -466178451
				&& i_194_ >= 1722112305 * anInt9472
				&& i_194_ < anInt9473 * 1920901985
				&& i_180_ < i_178_) {
				int i_195_
				    = i_194_ * (-476035351 * anInt9494) + i;
				int i_196_ = anIntArray9466[i_195_];
				int i_197_ = i_176_ + i_196_;
				int i_198_ = ((i_196_ & 0xff00ff)
					      + (i_176_ & 0xff00ff));
				i_196_
				    = (i_198_ & 0x1000100) + (i_197_ - i_198_
							      & 0x10000);
				anIntArray9466[i_195_]
				    = i_197_ - i_196_ | i_196_ - (i_196_
								  >>> 8);
			    }
			    i_173_ += i_186_;
			    i++;
			    i_180_ += i_188_;
			    i_180_ %= i_183_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_174_ <<= 16;
		    int i_199_ = (int) Math.floor(0.5 + ((double) i_174_
							 / (double) i_175_));
		    i_175_ += i_173_;
		    int i_200_ = i_176_ >>> 24;
		    int i_201_
			= (int) Math.sqrt((double) ((i_199_ >> 8) * (i_199_
								     >> 8)
						    + 65536));
		    if (i_177_ == 0 || i_177_ == 1 && 255 == i_200_) {
			while (i_173_ <= i_175_) {
			    int i_202_ = i >> 16;
			    if (i_173_ >= 1722112305 * anInt9472
				&& i_173_ < anInt9473 * 1920901985
				&& i_202_ >= anInt9470 * 1988019027
				&& i_202_ < -466178451 * anInt9499
				&& i_180_ < i_178_)
				anIntArray9466[i_202_ + (-476035351 * anInt9494
							 * i_173_)]
				    = i_176_;
			    i += i_199_;
			    i_173_++;
			    i_180_ += i_201_;
			    i_180_ %= i_183_;
			}
		    } else if (1 == i_177_) {
			i_176_
			    = ((i_200_ * (i_176_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_200_ * (i_176_ & 0xff00) >> 8 & 0xff00)
			       + (i_200_ << 24));
			int i_203_ = 256 - i_200_;
			while (i_173_ <= i_175_) {
			    int i_204_ = i >> 16;
			    if (i_173_ >= 1722112305 * anInt9472
				&& i_173_ < anInt9473 * 1920901985
				&& i_204_ >= anInt9470 * 1988019027
				&& i_204_ < anInt9499 * -466178451
				&& i_180_ < i_178_) {
				int i_205_ = (i_173_ * (anInt9494 * -476035351)
					      + i_204_);
				int i_206_ = anIntArray9466[i_205_];
				i_206_ = (((i_206_ & 0xff00) * i_203_ >> 8
					   & 0xff00)
					  + (i_203_ * (i_206_ & 0xff00ff) >> 8
					     & 0xff00ff));
				anIntArray9466[i_204_ + (anInt9494 * -476035351
							 * i_173_)]
				    = i_206_ + i_176_;
			    }
			    i += i_199_;
			    i_173_++;
			    i_180_ += i_201_;
			    i_180_ %= i_183_;
			}
		    } else if (2 == i_177_) {
			while (i_173_ <= i_175_) {
			    int i_207_ = i >> 16;
			    if (i_173_ >= 1722112305 * anInt9472
				&& i_173_ < 1920901985 * anInt9473
				&& i_207_ >= 1988019027 * anInt9470
				&& i_207_ < -466178451 * anInt9499
				&& i_180_ < i_178_) {
				int i_208_ = i_207_ + i_173_ * (anInt9494
								* -476035351);
				int i_209_ = anIntArray9466[i_208_];
				int i_210_ = i_176_ + i_209_;
				int i_211_ = ((i_176_ & 0xff00ff)
					      + (i_209_ & 0xff00ff));
				i_209_ = ((i_210_ - i_211_ & 0x10000)
					  + (i_211_ & 0x1000100));
				anIntArray9466[i_208_]
				    = i_210_ - i_209_ | i_209_ - (i_209_
								  >>> 8);
			    }
			    i += i_199_;
			    i_173_++;
			    i_180_ += i_201_;
			    i_180_ %= i_183_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    void method15174(int i) {
	aClass110Array9496[i].method1956(Thread.currentThread(), -149559469);
    }
    
    public Class157 method3402(int[] is, int i, int i_212_, int i_213_,
			       int i_214_, boolean bool) {
	boolean bool_215_ = false;
	int i_216_ = i;
    while_142_:
	for (int i_217_ = 0; i_217_ < i_214_; i_217_++) {
	    for (int i_218_ = 0; i_218_ < i_213_; i_218_++) {
		int i_219_ = is[i_216_++] >>> 24;
		if (i_219_ != 0 && i_219_ != 255) {
		    bool_215_ = true;
		    break while_142_;
		}
	    }
	}
	if (bool_215_)
	    return new Class157_Sub1_Sub3(this, is, i, i_212_, i_213_, i_214_,
					  bool);
	return new Class157_Sub1_Sub2(this, is, i, i_212_, i_213_, i_214_,
				      bool);
    }
    
    public void method3497(int i, int i_220_, int i_221_, int i_222_,
			   int i_223_, int i_224_, int i_225_) {
	if (anIntArray9466 != null) {
	    Class110 class110 = method15223(Thread.currentThread());
	    Class128 class128 = class110.aClass128_1338;
	    int i_226_ = i_221_ - i;
	    int i_227_ = i_222_ - i_220_;
	    int i_228_ = i_226_ >= 0 ? i_226_ : -i_226_;
	    int i_229_ = i_227_ >= 0 ? i_227_ : -i_227_;
	    int i_230_ = i_228_;
	    if (i_230_ < i_229_)
		i_230_ = i_229_;
	    if (i_230_ != 0) {
		int i_231_ = (i_226_ << 16) / i_230_;
		int i_232_ = (i_227_ << 16) / i_230_;
		i_226_ += i_231_ >> 16;
		i_227_ += i_232_ >> 16;
		if (i_232_ <= i_231_)
		    i_231_ = -i_231_;
		else
		    i_232_ = -i_232_;
		int i_233_ = i_224_ * i_232_ >> 17;
		int i_234_ = 1 + i_232_ * i_224_ >> 17;
		int i_235_ = i_231_ * i_224_ >> 17;
		int i_236_ = i_231_ * i_224_ + 1 >> 17;
		i -= class128.method2240();
		i_220_ -= class128.method2272();
		int i_237_ = i + i_233_;
		int i_238_ = i - i_234_;
		int i_239_ = i + i_226_ - i_234_;
		int i_240_ = i_226_ + i + i_233_;
		int i_241_ = i_220_ + i_235_;
		int i_242_ = i_220_ - i_236_;
		int i_243_ = i_227_ + i_220_ - i_236_;
		int i_244_ = i_235_ + (i_220_ + i_227_);
		if (0 == i_225_)
		    class128.anInt1486 = 0;
		else if (1 == i_225_)
		    class128.anInt1486 = 255 - (i_223_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method3235(false);
		class128.aBool1485
		    = (i_237_ < 0 || i_237_ > class128.anInt1494 || i_238_ < 0
		       || i_238_ > class128.anInt1494 || i_239_ < 0
		       || i_239_ > class128.anInt1494);
		class128.method2256(true, false, false, (float) i_241_,
				    (float) i_242_, (float) i_243_,
				    (float) i_237_, (float) i_238_,
				    (float) i_239_, 100.0F, 100.0F, 100.0F,
				    i_223_);
		class128.aBool1485
		    = (i_237_ < 0 || i_237_ > class128.anInt1494 || i_239_ < 0
		       || i_239_ > class128.anInt1494 || i_240_ < 0
		       || i_240_ > class128.anInt1494);
		class128.method2256(true, false, false, (float) i_241_,
				    (float) i_243_, (float) i_244_,
				    (float) i_237_, (float) i_239_,
				    (float) i_240_, 100.0F, 100.0F, 100.0F,
				    i_223_);
		method3235(true);
	    }
	}
    }
    
    public int method3206(int i, int i_245_, int i_246_, int i_247_,
			  int i_248_, int i_249_) {
	int i_250_ = 0;
	float f = ((float) i_246_ * aClass435_9483.aFloatArray4830[10]
		   + ((float) i_245_ * aClass435_9483.aFloatArray4830[6]
		      + (aClass435_9483.aFloatArray4830[2] * (float) i
			 + aClass435_9483.aFloatArray4830[14])));
	float f_251_ = (aClass435_9483.aFloatArray4830[14]
			+ aClass435_9483.aFloatArray4830[2] * (float) i_247_
			+ aClass435_9483.aFloatArray4830[6] * (float) i_248_
			+ aClass435_9483.aFloatArray4830[10] * (float) i_249_);
	float f_252_ = (aClass435_9483.aFloatArray4830[11] * (float) i_246_
			+ (aClass435_9483.aFloatArray4830[7] * (float) i_245_
			   + (aClass435_9483.aFloatArray4830[3] * (float) i
			      + aClass435_9483.aFloatArray4830[15])));
	float f_253_
	    = ((float) i_249_ * aClass435_9483.aFloatArray4830[11]
	       + ((float) i_248_ * aClass435_9483.aFloatArray4830[7]
		  + ((float) i_247_ * aClass435_9483.aFloatArray4830[3]
		     + aClass435_9483.aFloatArray4830[15])));
	if (f < -f_252_ && f_251_ < -f_253_)
	    i_250_ |= 0x10;
	else if (f > f_252_ && f_251_ > f_253_)
	    i_250_ |= 0x20;
	float f_254_ = ((float) i_245_ * aClass435_9483.aFloatArray4830[4]
			+ (aClass435_9483.aFloatArray4830[12]
			   + (float) i * aClass435_9483.aFloatArray4830[0])
			+ aClass435_9483.aFloatArray4830[8] * (float) i_246_);
	float f_255_
	    = ((float) i_249_ * aClass435_9483.aFloatArray4830[8]
	       + (aClass435_9483.aFloatArray4830[12]
		  + aClass435_9483.aFloatArray4830[0] * (float) i_247_
		  + aClass435_9483.aFloatArray4830[4] * (float) i_248_));
	if (f_254_ < -f_252_ && f_255_ < -f_253_)
	    i_250_ |= 0x1;
	if (f_254_ > f_252_ && f_255_ > f_253_)
	    i_250_ |= 0x2;
	float f_256_
	    = ((float) i_246_ * aClass435_9483.aFloatArray4830[9]
	       + (aClass435_9483.aFloatArray4830[1] * (float) i
		  + aClass435_9483.aFloatArray4830[13]
		  + (float) i_245_ * aClass435_9483.aFloatArray4830[5]));
	float f_257_ = (aClass435_9483.aFloatArray4830[13]
			+ (float) i_247_ * aClass435_9483.aFloatArray4830[1]
			+ aClass435_9483.aFloatArray4830[5] * (float) i_248_
			+ aClass435_9483.aFloatArray4830[9] * (float) i_249_);
	if (f_256_ < -f_252_ && f_257_ < -f_253_)
	    i_250_ |= 0x4;
	if (f_256_ > f_252_ && f_257_ > f_253_)
	    i_250_ |= 0x8;
	return i_250_;
    }
    
    void method15175(int i, int i_258_, int[] is, float[] fs) {
	anInt9494 = 1050079577 * i;
	anInt9476 = 1151409721 * i_258_;
	anIntArray9466 = is;
	aFloatArray9469 = fs;
	for (int i_259_ = 0; i_259_ < -1098456669 * anInt9481; i_259_++)
	    aClass110Array9496[i_259_].method1954((byte) 117);
	method3480();
	method3580();
    }
    
    public void method3371(Class444 class444, Class211 class211,
			   Class443 class443) {
	Class435 class435 = method3224();
	class435.method7040(class444);
	class435.method6950(aClass435_9483);
	class211.method3929(class443, aClass435_9482, class435, aFloat9495,
			    aFloat9492, aFloat9489, aFloat9491);
    }
    
    void method15176(int i, int i_260_, int[] is, float[] fs) {
	anInt9494 = 1050079577 * i;
	anInt9476 = 1151409721 * i_260_;
	anIntArray9466 = is;
	aFloatArray9469 = fs;
	for (int i_261_ = 0; i_261_ < -1098456669 * anInt9481; i_261_++)
	    aClass110Array9496[i_261_].method1954((byte) 72);
	method3480();
	method3580();
    }
    
    byte method15177(int i) {
	return aClass180_1944.method3116(i, -1431554601).aByte1830;
    }
    
    public Class157 method3213(int i, int i_262_, boolean bool,
			       boolean bool_263_) {
	if (bool)
	    return new Class157_Sub1_Sub3(this, i, i_262_);
	return new Class157_Sub1_Sub2(this, i, i_262_);
    }
    
    public Class157 method3214(int[] is, int i, int i_264_, int i_265_,
			       int i_266_, boolean bool) {
	boolean bool_267_ = false;
	int i_268_ = i;
    while_143_:
	for (int i_269_ = 0; i_269_ < i_266_; i_269_++) {
	    for (int i_270_ = 0; i_270_ < i_265_; i_270_++) {
		int i_271_ = is[i_268_++] >>> 24;
		if (i_271_ != 0 && i_271_ != 255) {
		    bool_267_ = true;
		    break while_143_;
		}
	    }
	}
	if (bool_267_)
	    return new Class157_Sub1_Sub3(this, is, i, i_264_, i_265_, i_266_,
					  bool);
	return new Class157_Sub1_Sub2(this, is, i, i_264_, i_265_, i_266_,
				      bool);
    }
    
    public Class157 method3216(Class173 class173, boolean bool) {
	int i = class173.method2772();
	int i_272_ = class173.method2765();
	Class157_Sub1 class157_sub1;
	if (bool && !class173.method2763() && class173.method2762()) {
	    Class173_Sub2 class173_sub2 = (Class173_Sub2) class173;
	    int[] is = new int[class173_sub2.anIntArray9624.length];
	    byte[] is_273_ = new byte[i * i_272_];
	    for (int i_274_ = 0; i_274_ < i_272_; i_274_++) {
		int i_275_ = i_274_ * i;
		for (int i_276_ = 0; i_276_ < i; i_276_++)
		    is_273_[i_276_ + i_275_]
			= class173_sub2.aByteArray9622[i_275_ + i_276_];
	    }
	    for (int i_277_ = 0; i_277_ < class173_sub2.anIntArray9624.length;
		 i_277_++)
		is[i_277_] = class173_sub2.anIntArray9624[i_277_];
	    class157_sub1
		= new Class157_Sub1_Sub1(this, is_273_, is, i, i_272_);
	} else {
	    int[] is = class173.method2778(false);
	    if (class173.method2763())
		class157_sub1 = new Class157_Sub1_Sub3(this, is, i, i_272_);
	    else
		class157_sub1 = new Class157_Sub1_Sub2(this, is, i, i_272_);
	}
	class157_sub1.method2468(class173.method2766(), class173.method2768(),
				 class173.method2767(), class173.method2769());
	return class157_sub1;
    }
    
    public Class157 method3217(int i, int i_278_, int i_279_, int i_280_,
			       boolean bool) {
	if (null == anIntArray9466)
	    throw new IllegalStateException("");
	int[] is = new int[i_279_ * i_280_];
	int i_281_ = i + i_278_ * (anInt9494 * -476035351);
	int i_282_ = -476035351 * anInt9494 - i_279_;
	for (int i_283_ = 0; i_283_ < i_280_; i_283_++) {
	    int i_284_ = i_279_ * i_283_;
	    for (int i_285_ = 0; i_285_ < i_279_; i_285_++)
		is[i_285_ + i_284_] = anIntArray9466[i_281_++];
	    i_281_ += i_282_;
	}
	if (bool)
	    return new Class157_Sub1_Sub3(this, is, i_279_, i_280_);
	return new Class157_Sub1_Sub2(this, is, i_279_, i_280_);
    }
    
    public Class152 method3129(int i, int i_286_, int[] is, int[] is_287_) {
	return new Class152_Sub1(i, i_286_, is, is_287_);
    }
    
    public void method3328(int i, Class152 class152, int i_288_, int i_289_) {
	if (anIntArray9466 != null) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    int[] is = class152_sub1.anIntArray8998;
	    int[] is_290_ = class152_sub1.anIntArray8997;
	    int i_291_;
	    if (anInt9473 * 1920901985 < i_289_ + is.length)
		i_291_ = anInt9473 * 1920901985 - i_289_;
	    else
		i_291_ = is.length;
	    int i_292_;
	    if (1722112305 * anInt9472 > i_289_) {
		i_292_ = anInt9472 * 1722112305 - i_289_;
		i_289_ = 1722112305 * anInt9472;
	    } else
		i_292_ = 0;
	    if (i_291_ - i_292_ > 0) {
		int i_293_ = i_289_ * (-476035351 * anInt9494);
		for (int i_294_ = i_292_; i_294_ < i_291_; i_294_++) {
		    int i_295_ = is[i_294_] + i_288_;
		    int i_296_ = is_290_[i_294_];
		    if (1988019027 * anInt9470 > i_295_) {
			i_296_ -= 1988019027 * anInt9470 - i_295_;
			i_295_ = 1988019027 * anInt9470;
		    }
		    if (-466178451 * anInt9499 < i_295_ + i_296_)
			i_296_ = -466178451 * anInt9499 - i_295_;
		    i_295_ += i_293_;
		    for (int i_297_ = -i_296_; i_297_ < 0; i_297_++)
			anIntArray9466[i_295_++] = i;
		    i_293_ += anInt9494 * -476035351;
		}
	    }
	}
    }
    
    public Class175 method3223(Class7 class7, Class173[] class173s,
			       boolean bool) {
	int[] is = new int[class173s.length];
	int[] is_298_ = new int[class173s.length];
	boolean bool_299_ = false;
	boolean bool_300_ = false;
	for (int i = 0; i < class173s.length; i++) {
	    is[i] = class173s[i].method2772();
	    is_298_[i] = class173s[i].method2765();
	    if (class173s[i].method2763())
		bool_299_ = true;
	    if (class173s[i].method2762())
		bool_300_ = true;
	}
	if (bool) {
	    if (bool_300_) {
		if (bool_299_)
		    return new Class175_Sub2(this, class7,
					     (Class173_Sub2[]) class173s, is,
					     is_298_);
		return new Class175_Sub5(this, class7,
					 (Class173_Sub2[]) class173s, is,
					 is_298_);
	    }
	    if (bool_299_)
		return new Class175_Sub2(this, class7,
					 (Class173_Sub1[]) class173s, is,
					 is_298_);
	    return new Class175_Sub5(this, class7, (Class173_Sub1[]) class173s,
				     is, is_298_);
	}
	if (bool_300_) {
	    if (bool_299_)
		throw new IllegalArgumentException("");
	    return new Class175_Sub4(this, class7, (Class173_Sub2[]) class173s,
				     is, is_298_);
	}
	return new Class175_Sub1(this, class7, (Class173_Sub1[]) class173s, is,
				 is_298_);
    }
    
    public void method3226(int i) {
	Class179_Sub2.anInt9366 = Class179_Sub2.anInt9365 = i;
	if (anInt9481 * -1098456669 > 1)
	    throw new IllegalStateException();
	method15179(anInt9481 * -1098456669);
	method15174(0);
    }
    
    public void method3384(Class525_Sub26 class525_sub26) {
	/* empty */
    }
    
    public int method3321(int i, int i_301_) {
	i |= 0x20800;
	return i & i_301_ ^ i_301_;
    }
    
    public boolean method3444() {
	return false;
    }
    
    void method15178() {
	if (null != aFloatArray9469) {
	    if (0 == anInt9470 * 1988019027
		&& anInt9499 * -466178451 == anInt9494 * -476035351
		&& anInt9472 * 1722112305 == 0
		&& anInt9476 * -1845137399 == anInt9473 * 1920901985) {
		int i = aFloatArray9469.length;
		int i_302_ = i - (i & 0x7);
		int i_303_ = 0;
		while (i_303_ < i_302_) {
		    aFloatArray9469[i_303_++] = 2.14748365E9F;
		    aFloatArray9469[i_303_++] = 2.14748365E9F;
		    aFloatArray9469[i_303_++] = 2.14748365E9F;
		    aFloatArray9469[i_303_++] = 2.14748365E9F;
		    aFloatArray9469[i_303_++] = 2.14748365E9F;
		    aFloatArray9469[i_303_++] = 2.14748365E9F;
		    aFloatArray9469[i_303_++] = 2.14748365E9F;
		    aFloatArray9469[i_303_++] = 2.14748365E9F;
		}
		while (i_303_ < i)
		    aFloatArray9469[i_303_++] = 2.14748365E9F;
	    } else {
		int i = -466178451 * anInt9499 - 1988019027 * anInt9470;
		int i_304_ = 1920901985 * anInt9473 - 1722112305 * anInt9472;
		int i_305_ = -476035351 * anInt9494 - i;
		int i_306_ = (-476035351 * anInt9494 * (1722112305 * anInt9472)
			      + 1988019027 * anInt9470);
		int i_307_ = i >> 3;
		int i_308_ = i & 0x7;
		i = i_306_ - 1;
		for (int i_309_ = -i_304_; i_309_ < 0; i_309_++) {
		    if (i_307_ > 0) {
			int i_310_ = i_307_;
			do {
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			} while (--i_310_ > 0);
		    }
		    if (i_308_ > 0) {
			int i_311_ = i_308_;
			do
			    aFloatArray9469[++i] = 2.14748365E9F;
			while (--i_311_ > 0);
		    }
		    i += i_305_;
		}
	    }
	}
    }
    
    public Class435 method3224() {
	Class110 class110 = method15223(Thread.currentThread());
	return class110.aClass435_1336;
    }
    
    public boolean method3409() {
	return false;
    }
    
    public void method3374(int i, int i_312_, int i_313_, int i_314_,
			   int i_315_, int i_316_, Class152 class152,
			   int i_317_, int i_318_) {
	if (anIntArray9466 != null) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    int[] is = class152_sub1.anIntArray8998;
	    int[] is_319_ = class152_sub1.anIntArray8997;
	    int i_320_ = (1722112305 * anInt9472 > i_318_
			  ? anInt9472 * 1722112305 : i_318_);
	    int i_321_ = (1920901985 * anInt9473 < i_318_ + is.length
			  ? 1920901985 * anInt9473 : is.length + i_318_);
	    i_313_ -= i;
	    i_314_ -= i_312_;
	    if (i_313_ + i_314_ < 0) {
		i += i_313_;
		i_313_ = -i_313_;
		i_312_ += i_314_;
		i_314_ = -i_314_;
	    }
	    if (i_313_ > i_314_) {
		i_312_ <<= 16;
		i_312_ += 32768;
		i_314_ <<= 16;
		int i_322_ = (int) Math.floor((double) i_314_ / (double) i_313_
					      + 0.5);
		i_313_ += i;
		if (i < 1988019027 * anInt9470) {
		    i_312_ += (1988019027 * anInt9470 - i) * i_322_;
		    i = 1988019027 * anInt9470;
		}
		if (i_313_ >= anInt9499 * -466178451)
		    i_313_ = anInt9499 * -466178451 - 1;
		int i_323_ = i_315_ >>> 24;
		if (0 == i_316_ || 1 == i_316_ && 255 == i_323_) {
		    for (/**/; i <= i_313_; i++) {
			int i_324_ = i_312_ >> 16;
			int i_325_ = i_324_ - i_318_;
			if (i_324_ >= i_320_ && i_324_ < i_321_) {
			    int i_326_ = i_317_ + is[i_325_];
			    if (i >= i_326_ && i < is_319_[i_325_] + i_326_)
				anIntArray9466[(-476035351 * anInt9494 * i_324_
						+ i)]
				    = i_315_;
			}
			i_312_ += i_322_;
		    }
		} else if (1 == i_316_) {
		    i_315_ = (((i_315_ & 0xff00) * i_323_ >> 8 & 0xff00)
			      + (i_323_ * (i_315_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_323_ << 24));
		    int i_327_ = 256 - i_323_;
		    for (/**/; i <= i_313_; i++) {
			int i_328_ = i_312_ >> 16;
			int i_329_ = i_328_ - i_318_;
			if (i_328_ >= i_320_ && i_328_ < i_321_) {
			    int i_330_ = i_317_ + is[i_329_];
			    if (i >= i_330_ && i < i_330_ + is_319_[i_329_]) {
				int i_331_
				    = i + i_328_ * (anInt9494 * -476035351);
				int i_332_ = anIntArray9466[i_331_];
				i_332_ = (((i_332_ & 0xff00) * i_327_ >> 8
					   & 0xff00)
					  + (i_327_ * (i_332_ & 0xff00ff) >> 8
					     & 0xff00ff));
				anIntArray9466[i_331_] = i_315_ + i_332_;
			    }
			}
			i_312_ += i_322_;
		    }
		} else if (2 == i_316_) {
		    for (/**/; i <= i_313_; i++) {
			int i_333_ = i_312_ >> 16;
			int i_334_ = i_333_ - i_318_;
			if (i_333_ >= i_320_ && i_333_ < i_321_) {
			    int i_335_ = is[i_334_] + i_317_;
			    if (i >= i_335_ && i < i_335_ + is_319_[i_334_]) {
				int i_336_
				    = i + anInt9494 * -476035351 * i_333_;
				int i_337_ = anIntArray9466[i_336_];
				int i_338_ = i_315_ + i_337_;
				int i_339_ = ((i_315_ & 0xff00ff)
					      + (i_337_ & 0xff00ff));
				i_337_ = ((i_338_ - i_339_ & 0x10000)
					  + (i_339_ & 0x1000100));
				anIntArray9466[i_336_]
				    = i_338_ - i_337_ | i_337_ - (i_337_
								  >>> 8);
			    }
			}
			i_312_ += i_322_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_313_ <<= 16;
		int i_340_ = (int) Math.floor((double) i_313_ / (double) i_314_
					      + 0.5);
		i_314_ += i_312_;
		if (i_312_ < i_320_) {
		    i += (i_320_ - i_312_) * i_340_;
		    i_312_ = i_320_;
		}
		if (i_314_ >= i_321_)
		    i_314_ = i_321_ - 1;
		int i_341_ = i_315_ >>> 24;
		if (0 == i_316_ || i_316_ == 1 && i_341_ == 255) {
		    for (/**/; i_312_ <= i_314_; i_312_++) {
			int i_342_ = i >> 16;
			int i_343_ = i_312_ - i_318_;
			int i_344_ = is[i_343_] + i_317_;
			if (i_342_ >= 1988019027 * anInt9470
			    && i_342_ < -466178451 * anInt9499
			    && i_342_ >= i_344_
			    && i_342_ < i_344_ + is_319_[i_343_])
			    anIntArray9466[(i_312_ * (anInt9494 * -476035351)
					    + i_342_)]
				= i_315_;
			i += i_340_;
		    }
		} else if (i_316_ == 1) {
		    i_315_ = ((i_341_ << 24)
			      + ((i_341_ * (i_315_ & 0xff00) >> 8 & 0xff00)
				 + (i_341_ * (i_315_ & 0xff00ff) >> 8
				    & 0xff00ff)));
		    int i_345_ = 256 - i_341_;
		    for (/**/; i_312_ <= i_314_; i_312_++) {
			int i_346_ = i >> 16;
			int i_347_ = i_312_ - i_318_;
			int i_348_ = i_317_ + is[i_347_];
			if (i_346_ >= 1988019027 * anInt9470
			    && i_346_ < -466178451 * anInt9499
			    && i_346_ >= i_348_
			    && i_346_ < i_348_ + is_319_[i_347_]) {
			    int i_349_
				= anInt9494 * -476035351 * i_312_ + i_346_;
			    int i_350_ = anIntArray9466[i_349_];
			    i_350_
				= (((i_350_ & 0xff00) * i_345_ >> 8 & 0xff00)
				   + ((i_350_ & 0xff00ff) * i_345_ >> 8
				      & 0xff00ff));
			    anIntArray9466[(-476035351 * anInt9494 * i_312_
					    + i_346_)]
				= i_350_ + i_315_;
			}
			i += i_340_;
		    }
		} else if (i_316_ == 2) {
		    for (/**/; i_312_ <= i_314_; i_312_++) {
			int i_351_ = i >> 16;
			int i_352_ = i_312_ - i_318_;
			int i_353_ = is[i_352_] + i_317_;
			if (i_351_ >= 1988019027 * anInt9470
			    && i_351_ < -466178451 * anInt9499
			    && i_351_ >= i_353_
			    && i_351_ < is_319_[i_352_] + i_353_) {
			    int i_354_
				= i_351_ + i_312_ * (-476035351 * anInt9494);
			    int i_355_ = anIntArray9466[i_354_];
			    int i_356_ = i_315_ + i_355_;
			    int i_357_
				= (i_355_ & 0xff00ff) + (i_315_ & 0xff00ff);
			    i_355_ = (i_357_ & 0x1000100) + (i_356_ - i_357_
							     & 0x10000);
			    anIntArray9466[i_354_]
				= i_356_ - i_355_ | i_355_ - (i_355_ >>> 8);
			}
			i += i_340_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Class525_Sub21 method3243(int i, int i_358_, int i_359_, int i_360_,
				     int i_361_, float f) {
	return null;
    }
    
    public void method3244(int i, Class525_Sub21[] class525_sub21s) {
	/* empty */
    }
    
    public boolean method3389() {
	return false;
    }
    
    void method15179(int i) {
	anInt9481 = i * 1873500683;
	aClass110Array9496 = new Class110[anInt9481 * -1098456669];
	for (int i_362_ = 0; i_362_ < anInt9481 * -1098456669; i_362_++)
	    aClass110Array9496[i_362_] = new Class110(this);
    }
    
    public Interface22 method3163(int i, int i_363_) {
	return new HashTable(i, i_363_);
    }
    
    public void method3412(Class185 class185) {
	method15229(null != anIntArray9466, null != aFloatArray9469, false,
		    class185);
    }
    
    public int method3408(int i, int i_364_) {
	return i | i_364_;
    }
    
    public boolean method3447() {
	return false;
    }
    
    public Class444 method3225() {
	Class110 class110 = method15223(Thread.currentThread());
	return class110.aClass444_1368;
    }
    
    void method15180(boolean bool, int i, int i_365_, float f, int i_366_,
		     int i_367_, int i_368_) {
	if (anIntArray9466 != null) {
	    if (i_366_ < 0)
		i_366_ = -i_366_;
	    int i_369_ = i_365_ - i_366_;
	    if (i_369_ < 1722112305 * anInt9472)
		i_369_ = 1722112305 * anInt9472;
	    int i_370_ = 1 + (i_365_ + i_366_);
	    if (i_370_ > anInt9473 * 1920901985)
		i_370_ = 1920901985 * anInt9473;
	    int i_371_ = i_369_;
	    int i_372_ = i_366_ * i_366_;
	    int i_373_ = 0;
	    int i_374_ = i_365_ - i_371_;
	    int i_375_ = i_374_ * i_374_;
	    int i_376_ = i_375_ - i_374_;
	    if (i_365_ > i_370_)
		i_365_ = i_370_;
	    int i_377_ = i_367_ >>> 24;
	    if (0 == i_368_ || i_368_ == 1 && i_377_ == 255) {
		while (i_371_ < i_365_) {
		    for (/**/; i_376_ <= i_372_ || i_375_ <= i_372_;
			 i_376_ += i_373_++ + i_373_)
			i_375_ += i_373_ + i_373_;
		    int i_378_ = 1 + (i - i_373_);
		    if (i_378_ < anInt9470 * 1988019027)
			i_378_ = 1988019027 * anInt9470;
		    int i_379_ = i + i_373_;
		    if (i_379_ > anInt9499 * -466178451)
			i_379_ = anInt9499 * -466178451;
		    int i_380_ = i_378_ + i_371_ * (anInt9494 * -476035351);
		    for (int i_381_ = i_378_; i_381_ < i_379_; i_381_++) {
			if (!bool || f < aFloatArray9469[i_380_])
			    anIntArray9466[i_380_] = i_367_;
			i_380_++;
		    }
		    i_371_++;
		    i_375_ -= i_374_-- + i_374_;
		    i_376_ -= i_374_ + i_374_;
		}
		i_373_ = i_366_;
		i_374_ = i_371_ - i_365_;
		i_376_ = i_374_ * i_374_ + i_372_;
		i_375_ = i_376_ - i_373_;
		i_376_ -= i_374_;
		while (i_371_ < i_370_) {
		    for (/**/; i_376_ > i_372_ && i_375_ > i_372_;
			 i_375_ -= i_373_ + i_373_)
			i_376_ -= i_373_-- + i_373_;
		    int i_382_ = i - i_373_;
		    if (i_382_ < 1988019027 * anInt9470)
			i_382_ = 1988019027 * anInt9470;
		    int i_383_ = i + i_373_;
		    if (i_383_ > -466178451 * anInt9499 - 1)
			i_383_ = anInt9499 * -466178451 - 1;
		    int i_384_ = i_382_ + i_371_ * (-476035351 * anInt9494);
		    for (int i_385_ = i_382_; i_385_ <= i_383_; i_385_++) {
			if (!bool || f < aFloatArray9469[i_384_])
			    anIntArray9466[i_384_] = i_367_;
			i_384_++;
		    }
		    i_371_++;
		    i_376_ += i_374_ + i_374_;
		    i_375_ += i_374_++ + i_374_;
		}
	    } else if (1 == i_368_) {
		i_367_ = (((i_367_ & 0xff00) * i_377_ >> 8 & 0xff00)
			  + ((i_367_ & 0xff00ff) * i_377_ >> 8 & 0xff00ff)
			  + (i_377_ << 24));
		int i_386_ = 256 - i_377_;
		while (i_371_ < i_365_) {
		    for (/**/; i_376_ <= i_372_ || i_375_ <= i_372_;
			 i_376_ += i_373_++ + i_373_)
			i_375_ += i_373_ + i_373_;
		    int i_387_ = i - i_373_ + 1;
		    if (i_387_ < 1988019027 * anInt9470)
			i_387_ = anInt9470 * 1988019027;
		    int i_388_ = i_373_ + i;
		    if (i_388_ > anInt9499 * -466178451)
			i_388_ = -466178451 * anInt9499;
		    int i_389_ = i_387_ + anInt9494 * -476035351 * i_371_;
		    for (int i_390_ = i_387_; i_390_ < i_388_; i_390_++) {
			if (!bool || f < aFloatArray9469[i_389_]) {
			    int i_391_ = anIntArray9466[i_389_];
			    i_391_
				= (((i_391_ & 0xff00) * i_386_ >> 8 & 0xff00)
				   + (i_386_ * (i_391_ & 0xff00ff) >> 8
				      & 0xff00ff));
			    anIntArray9466[i_389_] = i_391_ + i_367_;
			}
			i_389_++;
		    }
		    i_371_++;
		    i_375_ -= i_374_-- + i_374_;
		    i_376_ -= i_374_ + i_374_;
		}
		i_373_ = i_366_;
		i_374_ = -i_374_;
		i_376_ = i_372_ + i_374_ * i_374_;
		i_375_ = i_376_ - i_373_;
		i_376_ -= i_374_;
		while (i_371_ < i_370_) {
		    for (/**/; i_376_ > i_372_ && i_375_ > i_372_;
			 i_375_ -= i_373_ + i_373_)
			i_376_ -= i_373_-- + i_373_;
		    int i_392_ = i - i_373_;
		    if (i_392_ < anInt9470 * 1988019027)
			i_392_ = anInt9470 * 1988019027;
		    int i_393_ = i + i_373_;
		    if (i_393_ > anInt9499 * -466178451 - 1)
			i_393_ = -466178451 * anInt9499 - 1;
		    int i_394_ = anInt9494 * -476035351 * i_371_ + i_392_;
		    for (int i_395_ = i_392_; i_395_ <= i_393_; i_395_++) {
			if (!bool || f < aFloatArray9469[i_394_]) {
			    int i_396_ = anIntArray9466[i_394_];
			    i_396_
				= (((i_396_ & 0xff00) * i_386_ >> 8 & 0xff00)
				   + ((i_396_ & 0xff00ff) * i_386_ >> 8
				      & 0xff00ff));
			    anIntArray9466[i_394_] = i_367_ + i_396_;
			}
			i_394_++;
		    }
		    i_371_++;
		    i_376_ += i_374_ + i_374_;
		    i_375_ += i_374_++ + i_374_;
		}
	    } else if (i_368_ == 2) {
		while (i_371_ < i_365_) {
		    for (/**/; i_376_ <= i_372_ || i_375_ <= i_372_;
			 i_376_ += i_373_++ + i_373_)
			i_375_ += i_373_ + i_373_;
		    int i_397_ = i - i_373_ + 1;
		    if (i_397_ < 1988019027 * anInt9470)
			i_397_ = 1988019027 * anInt9470;
		    int i_398_ = i_373_ + i;
		    if (i_398_ > -466178451 * anInt9499)
			i_398_ = anInt9499 * -466178451;
		    int i_399_ = i_371_ * (anInt9494 * -476035351) + i_397_;
		    for (int i_400_ = i_397_; i_400_ < i_398_; i_400_++) {
			if (!bool || f < aFloatArray9469[i_399_]) {
			    int i_401_ = anIntArray9466[i_399_];
			    int i_402_ = i_367_ + i_401_;
			    int i_403_
				= (i_367_ & 0xff00ff) + (i_401_ & 0xff00ff);
			    i_401_ = (i_403_ & 0x1000100) + (i_402_ - i_403_
							     & 0x10000);
			    anIntArray9466[i_399_]
				= i_402_ - i_401_ | i_401_ - (i_401_ >>> 8);
			}
			i_399_++;
		    }
		    i_371_++;
		    i_375_ -= i_374_-- + i_374_;
		    i_376_ -= i_374_ + i_374_;
		}
		i_373_ = i_366_;
		i_374_ = -i_374_;
		i_376_ = i_372_ + i_374_ * i_374_;
		i_375_ = i_376_ - i_373_;
		i_376_ -= i_374_;
		while (i_371_ < i_370_) {
		    for (/**/; i_376_ > i_372_ && i_375_ > i_372_;
			 i_375_ -= i_373_ + i_373_)
			i_376_ -= i_373_-- + i_373_;
		    int i_404_ = i - i_373_;
		    if (i_404_ < 1988019027 * anInt9470)
			i_404_ = anInt9470 * 1988019027;
		    int i_405_ = i_373_ + i;
		    if (i_405_ > -466178451 * anInt9499 - 1)
			i_405_ = anInt9499 * -466178451 - 1;
		    int i_406_ = i_404_ + -476035351 * anInt9494 * i_371_;
		    for (int i_407_ = i_404_; i_407_ <= i_405_; i_407_++) {
			if (!bool || f < aFloatArray9469[i_406_]) {
			    int i_408_ = anIntArray9466[i_406_];
			    int i_409_ = i_408_ + i_367_;
			    int i_410_
				= (i_367_ & 0xff00ff) + (i_408_ & 0xff00ff);
			    i_408_
				= (i_409_ - i_410_ & 0x10000) + (i_410_
								 & 0x1000100);
			    anIntArray9466[i_406_]
				= i_409_ - i_408_ | i_408_ - (i_408_ >>> 8);
			}
			i_406_++;
		    }
		    i_371_++;
		    i_376_ += i_374_ + i_374_;
		    i_375_ += i_374_++ + i_374_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3233(Class444 class444) {
	aClass444_9471 = class444;
	method15181();
    }
    
    public Class444 method3491() {
	return new Class444(aClass444_9471);
    }
    
    public int method3406(int i, int i_411_) {
	i |= 0x20800;
	return i & i_411_ ^ i_411_;
    }
    
    public Class435 method3237() {
	return new Class435(aClass435_9482);
    }
    
    public void method3351(float f) {
	anInt9479 = -1172985841 * (int) (65535.0F * f);
    }
    
    Class168_Sub1 method3403(Canvas canvas, int i, int i_412_) {
	return Class152_Sub1.method14535(this, canvas, i, i_412_, -1130465615);
    }
    
    public void method3240(int i) {
	/* empty */
    }
    
    public void method3184(int i, int i_413_, int i_414_, int i_415_) {
	if (i < 0)
	    i = 0;
	if (i_413_ < 0)
	    i_413_ = 0;
	if (i_414_ > -476035351 * anInt9494)
	    i_414_ = anInt9494 * -476035351;
	if (i_415_ > anInt9476 * -1845137399)
	    i_415_ = anInt9476 * -1845137399;
	anInt9470 = 838891739 * i;
	anInt9499 = 1771604837 * i_414_;
	anInt9472 = i_413_ * -348561455;
	anInt9473 = -2023538527 * i_415_;
	method15173();
    }
    
    void method15181() {
	aClass435_9467.method7040(aClass444_9471);
	aClass435_9483.method6947(aClass435_9467);
	aClass435_9483.method6950(aClass435_9482);
	aClass435_9483.method7061(aFloatArrayArray9484[0]);
	aClass435_9483.method6972(aFloatArrayArray9484[1]);
	aClass435_9483.method6967(aFloatArrayArray9484[2]);
	aClass435_9483.method6968(aFloatArrayArray9484[3]);
	aClass435_9483.method6969(aFloatArrayArray9484[4]);
	aClass435_9483.method6970(aFloatArrayArray9484[5]);
	float f = aClass435_9482.method7041();
	float f_416_ = (aClass435_9482.aFloatArray4830[14]
			+ aClass435_9482.aFloatArray4830[10] * (f - 255.0F));
	float f_417_ = (aClass435_9482.aFloatArray4830[14]
			+ aClass435_9482.aFloatArray4830[10] * f);
	float f_418_ = f_417_ - f_416_;
	for (int i = 0; i < -1098456669 * anInt9481; i++) {
	    Class110 class110 = aClass110Array9496[i];
	    class110.aFloat1328 = f_416_;
	    class110.aFloat1329 = f_418_;
	}
    }
    
    public Class174 method3245(int i) {
	return null;
    }
    
    public boolean method3220() {
	return false;
    }
    
    public boolean method3324() {
	return true;
    }
    
    public void method3248(int i, int i_419_, int i_420_, int i_421_) {
	/* empty */
    }
    
    public long method3222(int i, int i_422_) {
	return 0L;
    }
    
    public boolean method3250() {
	return false;
    }
    
    public boolean method3254() {
	return false;
    }
    
    public void method3372(int i, int i_423_, int i_424_, int i_425_,
			   int i_426_, int i_427_) {
	if (null != anIntArray9466) {
	    i_424_ -= i;
	    i_425_ -= i_423_;
	    if (0 == i_425_) {
		if (i_424_ >= 0)
		    method3199(i, i_423_, 1 + i_424_, i_426_, i_427_);
		else
		    method3199(i + i_424_, i_423_, 1 + -i_424_, i_426_,
			       i_427_);
	    } else if (i_424_ == 0) {
		if (i_425_ >= 0)
		    method3200(i, i_423_, 1 + i_425_, i_426_, i_427_);
		else
		    method3200(i, i_425_ + i_423_, -i_425_ + 1, i_426_,
			       i_427_);
	    } else {
		if (i_425_ + i_424_ < 0) {
		    i += i_424_;
		    i_424_ = -i_424_;
		    i_423_ += i_425_;
		    i_425_ = -i_425_;
		}
		if (i_424_ > i_425_) {
		    i_423_ <<= 16;
		    i_423_ += 32768;
		    i_425_ <<= 16;
		    int i_428_
			= (int) Math.floor((double) i_425_ / (double) i_424_
					   + 0.5);
		    i_424_ += i;
		    if (i < anInt9470 * 1988019027) {
			i_423_ += (1988019027 * anInt9470 - i) * i_428_;
			i = anInt9470 * 1988019027;
		    }
		    if (i_424_ >= -466178451 * anInt9499)
			i_424_ = -466178451 * anInt9499 - 1;
		    int i_429_ = i_426_ >>> 24;
		    if (0 == i_427_ || 1 == i_427_ && 255 == i_429_) {
			for (/**/; i <= i_424_; i++) {
			    int i_430_ = i_423_ >> 16;
			    if (i_430_ >= 1722112305 * anInt9472
				&& i_430_ < 1920901985 * anInt9473)
				anIntArray9466[i + i_430_ * (-476035351
							     * anInt9494)]
				    = i_426_;
			    i_423_ += i_428_;
			}
		    } else if (i_427_ == 1) {
			i_426_
			    = ((i_429_ * (i_426_ & 0xff00) >> 8 & 0xff00)
			       + ((i_426_ & 0xff00ff) * i_429_ >> 8 & 0xff00ff)
			       + (i_429_ << 24));
			int i_431_ = 256 - i_429_;
			for (/**/; i <= i_424_; i++) {
			    int i_432_ = i_423_ >> 16;
			    if (i_432_ >= 1722112305 * anInt9472
				&& i_432_ < 1920901985 * anInt9473) {
				int i_433_
				    = i + -476035351 * anInt9494 * i_432_;
				int i_434_ = anIntArray9466[i_433_];
				i_434_ = (((i_434_ & 0xff00) * i_431_ >> 8
					   & 0xff00)
					  + (i_431_ * (i_434_ & 0xff00ff) >> 8
					     & 0xff00ff));
				anIntArray9466[i_433_] = i_434_ + i_426_;
			    }
			    i_423_ += i_428_;
			}
		    } else if (i_427_ == 2) {
			for (/**/; i <= i_424_; i++) {
			    int i_435_ = i_423_ >> 16;
			    if (i_435_ >= 1722112305 * anInt9472
				&& i_435_ < 1920901985 * anInt9473) {
				int i_436_
				    = i + i_435_ * (-476035351 * anInt9494);
				int i_437_ = anIntArray9466[i_436_];
				int i_438_ = i_437_ + i_426_;
				int i_439_ = ((i_437_ & 0xff00ff)
					      + (i_426_ & 0xff00ff));
				i_437_
				    = (i_439_ & 0x1000100) + (i_438_ - i_439_
							      & 0x10000);
				anIntArray9466[i_436_]
				    = i_438_ - i_437_ | i_437_ - (i_437_
								  >>> 8);
			    }
			    i_423_ += i_428_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_424_ <<= 16;
		    int i_440_ = (int) Math.floor(0.5 + ((double) i_424_
							 / (double) i_425_));
		    i_425_ += i_423_;
		    if (i_423_ < 1722112305 * anInt9472) {
			i += (1722112305 * anInt9472 - i_423_) * i_440_;
			i_423_ = 1722112305 * anInt9472;
		    }
		    if (i_425_ >= anInt9473 * 1920901985)
			i_425_ = 1920901985 * anInt9473 - 1;
		    int i_441_ = i_426_ >>> 24;
		    if (i_427_ == 0 || 1 == i_427_ && 255 == i_441_) {
			for (/**/; i_423_ <= i_425_; i_423_++) {
			    int i_442_ = i >> 16;
			    if (i_442_ >= 1988019027 * anInt9470
				&& i_442_ < -466178451 * anInt9499)
				anIntArray9466[i_442_ + i_423_ * (-476035351
								  * anInt9494)]
				    = i_426_;
			    i += i_440_;
			}
		    } else if (1 == i_427_) {
			i_426_
			    = (((i_426_ & 0xff00ff) * i_441_ >> 8 & 0xff00ff)
			       + (i_441_ * (i_426_ & 0xff00) >> 8 & 0xff00)
			       + (i_441_ << 24));
			int i_443_ = 256 - i_441_;
			for (/**/; i_423_ <= i_425_; i_423_++) {
			    int i_444_ = i >> 16;
			    if (i_444_ >= anInt9470 * 1988019027
				&& i_444_ < anInt9499 * -466178451) {
				int i_445_
				    = i_444_ + -476035351 * anInt9494 * i_423_;
				int i_446_ = anIntArray9466[i_445_];
				i_446_ = (((i_446_ & 0xff00ff) * i_443_ >> 8
					   & 0xff00ff)
					  + (i_443_ * (i_446_ & 0xff00) >> 8
					     & 0xff00));
				anIntArray9466[(i_423_ * (anInt9494
							  * -476035351)
						+ i_444_)]
				    = i_426_ + i_446_;
			    }
			    i += i_440_;
			}
		    } else if (i_427_ == 2) {
			for (/**/; i_423_ <= i_425_; i_423_++) {
			    int i_447_ = i >> 16;
			    if (i_447_ >= anInt9470 * 1988019027
				&& i_447_ < anInt9499 * -466178451) {
				int i_448_ = i_447_ + i_423_ * (-476035351
								* anInt9494);
				int i_449_ = anIntArray9466[i_448_];
				int i_450_ = i_426_ + i_449_;
				int i_451_ = ((i_426_ & 0xff00ff)
					      + (i_449_ & 0xff00ff));
				i_449_
				    = (i_451_ & 0x1000100) + (i_450_ - i_451_
							      & 0x10000);
				anIntArray9466[i_448_]
				    = i_450_ - i_449_ | i_449_ - (i_449_
								  >>> 8);
			    }
			    i += i_440_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    void method15182(int i) {
	aClass110Array9496[i].method1956(Thread.currentThread(), -1190767456);
    }
    
    public boolean method3313() {
	return false;
    }
    
    public void method3326(Class169 class169, float f, Class169 class169_452_,
			   float f_453_, Class169 class169_454_,
			   float f_455_) {
	/* empty */
    }
    
    public boolean method3256() {
	return false;
    }
    
    public void method3301() {
	/* empty */
    }
    
    public boolean method3284() {
	return false;
    }
    
    public int method3229(int i, int i_456_) {
	return i | i_456_;
    }
    
    public void method3261(int i, Class176 class176) {
	for (int i_457_ = 0; i_457_ < aClass110Array9496.length; i_457_++) {
	    aClass110Array9496[i_457_].anInt1331
		= 1528073863 * aClass110Array9496[i_457_].anInt1330;
	    aClass110Array9496[i_457_].anInt1362 = i * -1334076343;
	    aClass110Array9496[i_457_].anInt1330
		= 38100277 * class176.anInt1877;
	    aClass110Array9496[i_457_].anInt1361
		= 1852975569 * class176.anInt1879;
	    aClass110Array9496[i_457_].aBool1332 = true;
	}
    }
    
    Class182_Sub2(Textures class180, Interface24 interface24,
				  Interface47 interface47, Interface48 interface48,
				  Interface49 interface49) {
	super(class180, interface24, interface47, interface48, interface49);
	aBool9465 = false;
	anInt9470 = 0;
	anInt9499 = 0;
	anInt9472 = 0;
	anInt9473 = 0;
	anInt9463 = -1073177169;
	anInt9478 = -537323834;
	anInt9479 = -2139227934;
	aFloatArrayArray9484 = new float[6][4];
	aFloat9480 = 1.0F;
	aFloat9498 = 0.0F;
	aClass200_9490 = new Class200(16);
	anInt9500 = 1648253959;
	try {
	    aClass200_9497 = new Class200(10485760, 256);
	    aClass444_9471 = new Class444();
	    aClass435_9467 = new Class435();
	    aClass435_9482 = new Class435();
	    aClass435_9483 = new Class435();
	    method15179(1);
	    method15174(0);
	    Class455_Sub1.method15988(true, true, 679780902);
	    aBool9465 = true;
	    anInt9464 = (int) Class251.method4508((byte) 8) * -11197125;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method3134(-1629635364);
	    throw new RuntimeException("");
	}
    }
    
    public boolean method3524() {
	return false;
    }
    
    public void method3197(int i, int i_458_, float f, int i_459_, int i_460_,
			   float f_461_, int i_462_, int i_463_, float f_464_,
			   int i_465_, int i_466_, int i_467_, int i_468_) {
	boolean bool = anIntArray9466 != null;
	boolean bool_469_ = null != aFloatArray9469;
	if (bool || bool_469_) {
	    Class110 class110 = method15223(Thread.currentThread());
	    Class128 class128 = class110.aClass128_1338;
	    class128.aBool1482 = false;
	    i -= 1988019027 * anInt9470;
	    i_459_ -= anInt9470 * 1988019027;
	    i_462_ -= 1988019027 * anInt9470;
	    i_458_ -= anInt9472 * 1722112305;
	    i_460_ -= 1722112305 * anInt9472;
	    i_463_ -= 1722112305 * anInt9472;
	    class128.aBool1485 = (i < 0 || i > class128.anInt1494 || i_459_ < 0
				  || i_459_ > class128.anInt1494 || i_462_ < 0
				  || i_462_ > class128.anInt1494);
	    int i_470_ = i_465_ >>> 24;
	    if (i_468_ == 0 || 1 == i_468_ && i_470_ == 255) {
		class128.anInt1486 = 0;
		class128.aBool1483 = false;
		class128.method2243(bool, bool_469_, false, (float) i_458_,
				    (float) i_460_, (float) i_463_, (float) i,
				    (float) i_459_, (float) i_462_, f, f_461_,
				    f_464_, i_465_, i_466_, i_467_);
	    } else if (i_468_ == 1) {
		class128.anInt1486 = 255 - i_470_;
		class128.aBool1483 = false;
		class128.method2243(bool, bool_469_, false, (float) i_458_,
				    (float) i_460_, (float) i_463_, (float) i,
				    (float) i_459_, (float) i_462_, f, f_461_,
				    f_464_, i_465_, i_466_, i_467_);
	    } else if (2 == i_468_) {
		class128.anInt1486 = 128;
		class128.aBool1483 = true;
		class128.method2243(bool, bool_469_, false, (float) i_458_,
				    (float) i_460_, (float) i_463_, (float) i,
				    (float) i_459_, (float) i_462_, f, f_461_,
				    f_464_, i_465_, i_466_, i_467_);
	    } else
		throw new IllegalArgumentException();
	    class128.aBool1482 = true;
	}
    }
    
    public void method3360(float f, float f_471_, float f_472_, float[] fs) {
	float f_473_ = (aClass435_9483.aFloatArray4830[11] * f_472_
			+ (aClass435_9483.aFloatArray4830[3] * f
			   + aClass435_9483.aFloatArray4830[15]
			   + f_471_ * aClass435_9483.aFloatArray4830[7]));
	float f_474_ = (aClass435_9483.aFloatArray4830[8] * f_472_
			+ (aClass435_9483.aFloatArray4830[4] * f_471_
			   + (aClass435_9483.aFloatArray4830[0] * f
			      + aClass435_9483.aFloatArray4830[12])));
	float f_475_ = (aClass435_9483.aFloatArray4830[9] * f_472_
			+ (aClass435_9483.aFloatArray4830[5] * f_471_
			   + (aClass435_9483.aFloatArray4830[13]
			      + aClass435_9483.aFloatArray4830[1] * f)));
	float f_476_ = (aClass435_9467.aFloatArray4830[10] * f_472_
			+ (aClass435_9467.aFloatArray4830[2] * f
			   + aClass435_9467.aFloatArray4830[14]
			   + f_471_ * aClass435_9467.aFloatArray4830[6]));
	fs[0] = aFloat9495 + aFloat9489 * f_474_ / f_473_;
	fs[1] = aFloat9492 + aFloat9491 * f_475_ / f_473_;
	fs[2] = f_476_;
    }
    
    public void method3346(boolean bool) {
	Class110 class110 = method15223(Thread.currentThread());
	class110.aBool1335 = bool;
    }
    
    public Class175 method3454(Class7 class7, Class173[] class173s,
			       boolean bool) {
	int[] is = new int[class173s.length];
	int[] is_477_ = new int[class173s.length];
	boolean bool_478_ = false;
	boolean bool_479_ = false;
	for (int i = 0; i < class173s.length; i++) {
	    is[i] = class173s[i].method2772();
	    is_477_[i] = class173s[i].method2765();
	    if (class173s[i].method2763())
		bool_478_ = true;
	    if (class173s[i].method2762())
		bool_479_ = true;
	}
	if (bool) {
	    if (bool_479_) {
		if (bool_478_)
		    return new Class175_Sub2(this, class7,
					     (Class173_Sub2[]) class173s, is,
					     is_477_);
		return new Class175_Sub5(this, class7,
					 (Class173_Sub2[]) class173s, is,
					 is_477_);
	    }
	    if (bool_478_)
		return new Class175_Sub2(this, class7,
					 (Class173_Sub1[]) class173s, is,
					 is_477_);
	    return new Class175_Sub5(this, class7, (Class173_Sub1[]) class173s,
				     is, is_477_);
	}
	if (bool_479_) {
	    if (bool_478_)
		throw new IllegalArgumentException("");
	    return new Class175_Sub4(this, class7, (Class173_Sub2[]) class173s,
				     is, is_477_);
	}
	return new Class175_Sub1(this, class7, (Class173_Sub1[]) class173s, is,
				 is_477_);
    }
    
    Interface21 method15183(int i, int i_480_) {
	return new Class97(i, i_480_);
    }
    
    public Interface21 method3168(int i, int i_481_, Class165 class165,
				  Class178 class178, int i_482_) {
	return method15183(i, i_481_);
    }
    
    public void method3530() {
	for (int i = 0; i < aClass110Array9496.length; i++) {
	    aClass110Array9496[i].anInt1330
		= 76470071 * aClass110Array9496[i].anInt1331;
	    aClass110Array9496[i].aBool1332 = false;
	}
    }
    
    public Interface22 method3164(int i, int i_483_, int i_484_) {
	return new HashTable(i, i_483_);
    }
    
    public Class170 method3270() {
	return new Class170(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    public Class170 method3427() {
	return new Class170(0, "Pure Java", 1, "CPU", 0L, false);
    }
    
    Interface21 method15184(int i, int i_485_) {
	return new Class97(i, i_485_);
    }
    
    void method3273(int i, int i_486_) throws Exception_Sub4 {
	aClass168_Sub1_1959.method14607(i, i_486_);
	if (anInterface24_1943 != null)
	    anInterface24_1943.method133((byte) -29);
    }
    
    void method3183(int i, int i_487_) throws Exception_Sub4 {
	aClass168_Sub1_1959.method14607(i, i_487_);
	if (anInterface24_1943 != null)
	    anInterface24_1943.method133((byte) -52);
    }
    
    void method3275(int i, int i_488_) throws Exception_Sub4 {
	aClass168_Sub1_1959.method14607(i, i_488_);
	if (anInterface24_1943 != null)
	    anInterface24_1943.method133((byte) 18);
    }
    
    public void method3276() {
	/* empty */
    }
    
    public void method3236() {
	/* empty */
    }
    
    public void method3586() {
	/* empty */
    }
    
    public void method3569(boolean bool) {
	Class110 class110 = method15223(Thread.currentThread());
	class110.aBool1335 = bool;
    }
    
    void method3280() {
	if (aBool9465) {
	    Class511.method8524(true, false, (byte) 1);
	    aBool9465 = false;
	}
	aBool9501 = true;
    }
    
    public void method3255(float f, float f_489_, float f_490_, float[] fs) {
	float f_491_ = (aClass435_9483.aFloatArray4830[11] * f_490_
			+ (aClass435_9483.aFloatArray4830[3] * f
			   + aClass435_9483.aFloatArray4830[15]
			   + f_489_ * aClass435_9483.aFloatArray4830[7]));
	float f_492_ = (aClass435_9483.aFloatArray4830[8] * f_490_
			+ (aClass435_9483.aFloatArray4830[4] * f_489_
			   + (aClass435_9483.aFloatArray4830[0] * f
			      + aClass435_9483.aFloatArray4830[12])));
	float f_493_ = (aClass435_9483.aFloatArray4830[9] * f_490_
			+ (aClass435_9483.aFloatArray4830[5] * f_489_
			   + (aClass435_9483.aFloatArray4830[13]
			      + aClass435_9483.aFloatArray4830[1] * f)));
	float f_494_ = (aClass435_9467.aFloatArray4830[10] * f_490_
			+ (aClass435_9467.aFloatArray4830[2] * f
			   + aClass435_9467.aFloatArray4830[14]
			   + f_489_ * aClass435_9467.aFloatArray4830[6]));
	fs[0] = aFloat9495 + aFloat9489 * f_492_ / f_491_;
	fs[1] = aFloat9492 + aFloat9491 * f_493_ / f_491_;
	fs[2] = f_494_;
    }
    
    public void method3282(int i) {
	int i_495_ = i - 284847091 * anInt9464;
	for (Class525_Sub17 class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3796(12370521);
	     class525_sub17 != null;
	     class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3818(-883537152)) {
	    if (class525_sub17.aBool10558) {
		class525_sub17.anInt10555 += i_495_;
		int i_496_ = class525_sub17.anInt10555 / 50;
		if (i_496_ > 0) {
		    TextureMetrics class166
			= aClass180_1944.method3116(class525_sub17.anInt10560,
						    -1431554601);
		    float f = (float) (class166.bitLoad * 2082667437);
		    class525_sub17.method16272
			((int) ((float) class166.aByte1805
				* ((float) i_495_ / 1000.0F) / 64.0F * f),
			 (int) (f * ((float) class166.aByte1806
				     * ((float) i_495_ / 1000.0F) / 64.0F)));
		    class525_sub17.anInt10555 -= 50 * i_496_;
		}
		class525_sub17.aBool10558 = false;
	    }
	}
	anInt9464 = -11197125 * i;
	aClass200_9490.method3805(5, 2110016836);
	aClass200_9497.method3805(5, 2004879814);
    }
    
    public void method3502(int i) {
	int i_497_ = i - 284847091 * anInt9464;
	for (Class525_Sub17 class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3796(1883459402);
	     class525_sub17 != null;
	     class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3818(-1030741846)) {
	    if (class525_sub17.aBool10558) {
		class525_sub17.anInt10555 += i_497_;
		int i_498_ = class525_sub17.anInt10555 / 50;
		if (i_498_ > 0) {
		    TextureMetrics class166
			= aClass180_1944.method3116(class525_sub17.anInt10560,
						    -1431554601);
		    float f = (float) (class166.bitLoad * 2082667437);
		    class525_sub17.method16272
			((int) ((float) class166.aByte1805
				* ((float) i_497_ / 1000.0F) / 64.0F * f),
			 (int) (f * ((float) class166.aByte1806
				     * ((float) i_497_ / 1000.0F) / 64.0F)));
		    class525_sub17.anInt10555 -= 50 * i_498_;
		}
		class525_sub17.aBool10558 = false;
	    }
	}
	anInt9464 = -11197125 * i;
	aClass200_9490.method3805(5, 2012350750);
	aClass200_9497.method3805(5, 2084217403);
    }
    
    public void method3495(int i) {
	int i_499_ = i - 284847091 * anInt9464;
	for (Class525_Sub17 class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3796(113124141);
	     class525_sub17 != null;
	     class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3818(-2036687149)) {
	    if (class525_sub17.aBool10558) {
		class525_sub17.anInt10555 += i_499_;
		int i_500_ = class525_sub17.anInt10555 / 50;
		if (i_500_ > 0) {
		    TextureMetrics class166
			= aClass180_1944.method3116(class525_sub17.anInt10560,
						    -1431554601);
		    float f = (float) (class166.bitLoad * 2082667437);
		    class525_sub17.method16272
			((int) ((float) class166.aByte1805
				* ((float) i_499_ / 1000.0F) / 64.0F * f),
			 (int) (f * ((float) class166.aByte1806
				     * ((float) i_499_ / 1000.0F) / 64.0F)));
		    class525_sub17.anInt10555 -= 50 * i_500_;
		}
		class525_sub17.aBool10558 = false;
	    }
	}
	anInt9464 = -11197125 * i;
	aClass200_9490.method3805(5, 1884854359);
	aClass200_9497.method3805(5, 1966988575);
    }
    
    void method15185(boolean bool, boolean bool_501_, boolean bool_502_, int i,
		     int i_503_, float f, int i_504_, int i_505_, short i_506_,
		     int i_507_, int i_508_, int i_509_) {
	if (0 != i_504_ && 0 != i_505_) {
	    if (i_506_ != -1) {
		TextureMetrics class166
		    = aClass180_1944.method3116(i_506_, -1431554601);
		if (!class166.aBool1819) {
		    if (anInt9500 * -197284279 != i_506_) {
			Class157 class157
			    = ((Class157)
			       aClass200_9490.method3785((long) i_506_));
			if (class157 == null) {
			    int[] is = method15165(i_506_);
			    if (null == is)
				return;
			    int i_510_ = class166.bitLoad * 2082667437;
			    class157 = method3215(is, 0, i_510_, i_510_,
						  i_510_, (byte) 75);
			    aClass200_9490.method3788(class157, (long) i_506_);
			}
			anInt9500 = -1648253959 * i_506_;
			aClass157_9493 = class157;
		    }
		    ((Class157_Sub1) aClass157_9493).method14537
			(bool, bool_501_, bool_502_, i - i_504_,
			 i_503_ - i_505_, f, i_504_ << 1, i_505_ << 1, i_508_,
			 i_507_, i_509_, 1,
			 Class597.aClass597_7841 != class166.aClass597_1807);
		    return;
		}
	    }
	    method15180(bool_501_, i, i_503_, f, i_504_, i_507_, i_509_);
	}
    }
    
    void method3466(float f, float f_511_, float f_512_, float f_513_,
		    float f_514_, float f_515_) {
	/* empty */
    }
    
    public int method3137() {
	return 0;
    }
    
    int[] method15186(int i) {
	Class525_Sub17 class525_sub17;
	synchronized (aClass200_9497) {
	    class525_sub17
		= ((Class525_Sub17)
		   aClass200_9497.method3785((long) (i & 0xffff)
					     | ~0x7fffffffffffffffL));
	    if (class525_sub17 == null) {
		TextureMetrics class166 = aClass180_1944.method3116(i, -1431554601);
		int i_516_ = 2082667437 * class166.bitLoad;
		if (!anInterface24_1943.method130(Class593.aClass593_7831, i,
						  Class594.aClass594_7833,
						  0.7F, i_516_, i_516_, true,
						  (byte) 79)) {
		    int[] is = null;
		    return is;
		}
		int[] is;
		if (class166.aClass597_1807 != Class597.aClass597_7842)
		    is = anInterface24_1943.method132(Class593.aClass593_7831,
						      i, 0.7F, i_516_, i_516_,
						      true, -1711573080);
		else
		    is = anInterface24_1943.method129(Class593.aClass593_7831,
						      i, 0.7F, i_516_, i_516_,
						      true, -1377544789);
		class525_sub17
		    = new Class525_Sub17(i, i_516_, is,
					 (Class597.aClass597_7843
					  != class166.aClass597_1807));
		aClass200_9497.method3789(class525_sub17,
					  ((long) (i & 0xffff)
					   | ~0x7fffffffffffffffL),
					  i_516_ * i_516_, (byte) -58);
	    }
	}
	class525_sub17.aBool10558 = true;
	return class525_sub17.method16271();
    }
    
    public void method3204(int i, int i_517_, int i_518_, int i_519_,
			   int i_520_, int i_521_, Class152 class152,
			   int i_522_, int i_523_, int i_524_, int i_525_,
			   int i_526_) {
	if (null != anIntArray9466) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    int[] is = class152_sub1.anIntArray8998;
	    int[] is_527_ = class152_sub1.anIntArray8997;
	    int i_528_ = (anInt9472 * 1722112305 > i_523_
			  ? 1722112305 * anInt9472 : i_523_);
	    int i_529_ = (1920901985 * anInt9473 < is.length + i_523_
			  ? anInt9473 * 1920901985 : i_523_ + is.length);
	    i_526_ <<= 8;
	    i_524_ <<= 8;
	    i_525_ <<= 8;
	    int i_530_ = i_525_ + i_524_;
	    i_526_ %= i_530_;
	    i_518_ -= i;
	    i_519_ -= i_517_;
	    if (i_518_ + i_519_ < 0) {
		int i_531_ = (int) (Math.sqrt((double) (i_518_ * i_518_
							+ i_519_ * i_519_))
				    * 256.0);
		int i_532_ = i_531_ % i_530_;
		i_526_ = i_530_ + i_524_ - i_526_ - i_532_;
		i_526_ %= i_530_;
		if (i_526_ < 0)
		    i_526_ += i_530_;
		i += i_518_;
		i_518_ = -i_518_;
		i_517_ += i_519_;
		i_519_ = -i_519_;
	    }
	    if (i_518_ > i_519_) {
		i_517_ <<= 16;
		i_517_ += 32768;
		i_519_ <<= 16;
		int i_533_ = (int) Math.floor(0.5 + ((double) i_519_
						     / (double) i_518_));
		i_518_ += i;
		int i_534_ = i_520_ >>> 24;
		int i_535_
		    = (int) Math.sqrt((double) (65536
						+ (i_533_ >> 8) * (i_533_
								   >> 8)));
		if (0 == i_521_ || i_521_ == 1 && i_534_ == 255) {
		    while (i <= i_518_) {
			int i_536_ = i_517_ >> 16;
			int i_537_ = i_536_ - i_523_;
			if (i >= 1988019027 * anInt9470
			    && i < -466178451 * anInt9499 && i_536_ >= i_528_
			    && i_536_ < i_529_ && i_526_ < i_524_) {
			    int i_538_ = is[i_537_] + i_522_;
			    if (i >= i_538_ && i < i_538_ + is_527_[i_537_])
				anIntArray9466[i_536_ * (-476035351
							 * anInt9494) + i]
				    = i_520_;
			}
			i_517_ += i_533_;
			i++;
			i_526_ += i_535_;
			i_526_ %= i_530_;
		    }
		} else if (1 == i_521_) {
		    i_520_
			= ((i_534_ << 24)
			   + ((i_534_ * (i_520_ & 0xff00ff) >> 8 & 0xff00ff)
			      + ((i_520_ & 0xff00) * i_534_ >> 8 & 0xff00)));
		    int i_539_ = 256 - i_534_;
		    while (i <= i_518_) {
			int i_540_ = i_517_ >> 16;
			int i_541_ = i_540_ - i_523_;
			if (i >= 1988019027 * anInt9470
			    && i < anInt9499 * -466178451 && i_540_ >= i_528_
			    && i_540_ < i_529_ && i_526_ < i_524_) {
			    int i_542_ = i_522_ + is[i_541_];
			    if (i >= i_542_ && i < is_527_[i_541_] + i_542_) {
				int i_543_
				    = i + i_540_ * (anInt9494 * -476035351);
				int i_544_ = anIntArray9466[i_543_];
				i_544_ = (((i_544_ & 0xff00ff) * i_539_ >> 8
					   & 0xff00ff)
					  + (i_539_ * (i_544_ & 0xff00) >> 8
					     & 0xff00));
				anIntArray9466[i_543_] = i_520_ + i_544_;
			    }
			}
			i_517_ += i_533_;
			i++;
			i_526_ += i_535_;
			i_526_ %= i_530_;
		    }
		} else if (i_521_ == 2) {
		    while (i <= i_518_) {
			int i_545_ = i_517_ >> 16;
			int i_546_ = i_545_ - i_523_;
			if (i >= 1988019027 * anInt9470
			    && i < anInt9499 * -466178451 && i_545_ >= i_528_
			    && i_545_ < i_529_ && i_526_ < i_524_) {
			    int i_547_ = i_522_ + is[i_546_];
			    if (i >= i_547_ && i < i_547_ + is_527_[i_546_]) {
				int i_548_
				    = i + -476035351 * anInt9494 * i_545_;
				int i_549_ = anIntArray9466[i_548_];
				int i_550_ = i_520_ + i_549_;
				int i_551_ = ((i_520_ & 0xff00ff)
					      + (i_549_ & 0xff00ff));
				i_549_ = ((i_550_ - i_551_ & 0x10000)
					  + (i_551_ & 0x1000100));
				anIntArray9466[i_548_]
				    = i_550_ - i_549_ | i_549_ - (i_549_
								  >>> 8);
			    }
			}
			i_517_ += i_533_;
			i++;
			i_526_ += i_535_;
			i_526_ %= i_530_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_518_ <<= 16;
		int i_552_ = (int) Math.floor((double) i_518_ / (double) i_519_
					      + 0.5);
		int i_553_
		    = (int) Math.sqrt((double) ((i_552_ >> 8) * (i_552_ >> 8)
						+ 65536));
		i_519_ += i_517_;
		int i_554_ = i_520_ >>> 24;
		if (0 == i_521_ || i_521_ == 1 && i_554_ == 255) {
		    while (i_517_ <= i_519_) {
			int i_555_ = i >> 16;
			int i_556_ = i_517_ - i_523_;
			if (i_517_ >= i_528_ && i_517_ < i_529_
			    && i_555_ >= 1988019027 * anInt9470
			    && i_555_ < -466178451 * anInt9499
			    && i_526_ < i_524_ && i_555_ >= is[i_556_] + i_522_
			    && i_555_ < is[i_556_] + i_522_ + is_527_[i_556_])
			    anIntArray9466[(i_555_
					    + -476035351 * anInt9494 * i_517_)]
				= i_520_;
			i += i_552_;
			i_517_++;
			i_526_ += i_553_;
			i_526_ %= i_530_;
		    }
		} else if (i_521_ == 1) {
		    i_520_ = ((i_554_ << 24)
			      + ((i_554_ * (i_520_ & 0xff00) >> 8 & 0xff00)
				 + ((i_520_ & 0xff00ff) * i_554_ >> 8
				    & 0xff00ff)));
		    int i_557_ = 256 - i_554_;
		    while (i_517_ <= i_519_) {
			int i_558_ = i >> 16;
			int i_559_ = i_517_ - i_523_;
			if (i_517_ >= i_528_ && i_517_ < i_529_
			    && i_558_ >= 1988019027 * anInt9470
			    && i_558_ < anInt9499 * -466178451
			    && i_526_ < i_524_ && i_558_ >= is[i_559_] + i_522_
			    && (i_558_
				< is[i_559_] + i_522_ + is_527_[i_559_])) {
			    int i_560_
				= -476035351 * anInt9494 * i_517_ + i_558_;
			    int i_561_ = anIntArray9466[i_560_];
			    i_561_ = ((i_557_ * (i_561_ & 0xff00ff) >> 8
				       & 0xff00ff)
				      + ((i_561_ & 0xff00) * i_557_ >> 8
					 & 0xff00));
			    anIntArray9466[(i_558_
					    + -476035351 * anInt9494 * i_517_)]
				= i_561_ + i_520_;
			}
			i += i_552_;
			i_517_++;
			i_526_ += i_553_;
			i_526_ %= i_530_;
		    }
		} else if (2 == i_521_) {
		    while (i_517_ <= i_519_) {
			int i_562_ = i >> 16;
			int i_563_ = i_517_ - i_523_;
			if (i_517_ >= i_528_ && i_517_ < i_529_
			    && i_562_ >= 1988019027 * anInt9470
			    && i_562_ < -466178451 * anInt9499
			    && i_526_ < i_524_ && i_562_ >= is[i_563_] + i_522_
			    && (i_562_
				< i_522_ + is[i_563_] + is_527_[i_563_])) {
			    int i_564_
				= i_517_ * (anInt9494 * -476035351) + i_562_;
			    int i_565_ = anIntArray9466[i_564_];
			    int i_566_ = i_565_ + i_520_;
			    int i_567_
				= (i_565_ & 0xff00ff) + (i_520_ & 0xff00ff);
			    i_565_ = (i_567_ & 0x1000100) + (i_566_ - i_567_
							     & 0x10000);
			    anIntArray9466[i_564_]
				= i_566_ - i_565_ | i_565_ - (i_565_ >>> 8);
			}
			i += i_552_;
			i_517_++;
			i_526_ += i_553_;
			i_526_ %= i_530_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    int method15187(int i) {
	return (aClass180_1944.method3116(i, -1431554601).bitLoad
		* 2082667437);
    }
    
    int method15188(int i) {
	return (aClass180_1944.method3116(i, -1431554601).bitLoad
		* 2082667437);
    }
    
    Class597 method15189(int i) {
	return aClass180_1944.method3116(i, -1431554601).aClass597_1807;
    }
    
    public int[] method3550() {
	return null;
    }
    
    public void method3361(int i, int i_568_, int i_569_, int i_570_,
			   int i_571_, int i_572_) {
	if (anIntArray9466 != null) {
	    if (i < anInt9470 * 1988019027) {
		i_569_ -= 1988019027 * anInt9470 - i;
		i = anInt9470 * 1988019027;
	    }
	    if (i_568_ < anInt9472 * 1722112305) {
		i_570_ -= anInt9472 * 1722112305 - i_568_;
		i_568_ = 1722112305 * anInt9472;
	    }
	    if (i_569_ + i > -466178451 * anInt9499)
		i_569_ = anInt9499 * -466178451 - i;
	    if (i_568_ + i_570_ > 1920901985 * anInt9473)
		i_570_ = 1920901985 * anInt9473 - i_568_;
	    if (i_569_ > 0 && i_570_ > 0 && i <= -466178451 * anInt9499
		&& i_568_ <= anInt9473 * 1920901985) {
		int i_573_ = -476035351 * anInt9494 - i_569_;
		int i_574_ = anInt9494 * -476035351 * i_568_ + i;
		int i_575_ = i_571_ >>> 24;
		if (i_572_ == 0 || i_572_ == 1 && 255 == i_575_) {
		    int i_576_ = i_569_ >> 3;
		    int i_577_ = i_569_ & 0x7;
		    i_569_ = i_574_ - 1;
		    for (int i_578_ = -i_570_; i_578_ < 0; i_578_++) {
			if (i_576_ > 0) {
			    i = i_576_;
			    do {
				anIntArray9466[++i_569_] = i_571_;
				anIntArray9466[++i_569_] = i_571_;
				anIntArray9466[++i_569_] = i_571_;
				anIntArray9466[++i_569_] = i_571_;
				anIntArray9466[++i_569_] = i_571_;
				anIntArray9466[++i_569_] = i_571_;
				anIntArray9466[++i_569_] = i_571_;
				anIntArray9466[++i_569_] = i_571_;
			    } while (--i > 0);
			}
			if (i_577_ > 0) {
			    i = i_577_;
			    do
				anIntArray9466[++i_569_] = i_571_;
			    while (--i > 0);
			}
			i_569_ += i_573_;
		    }
		} else if (1 == i_572_) {
		    i_571_
			= ((i_575_ * ((i_571_ & ~0xff00ff) >>> 8) & ~0xff00ff)
			   + ((i_571_ & 0xff00ff) * i_575_ >> 8 & 0xff00ff));
		    int i_579_ = 256 - i_575_;
		    for (int i_580_ = 0; i_580_ < i_570_; i_580_++) {
			for (int i_581_ = -i_569_; i_581_ < 0; i_581_++) {
			    int i_582_ = anIntArray9466[i_574_];
			    i_582_ = ((((i_582_ & ~0xff00ff) >>> 8) * i_579_
				       & ~0xff00ff)
				      + ((i_582_ & 0xff00ff) * i_579_ >> 8
					 & 0xff00ff));
			    anIntArray9466[i_574_++] = i_582_ + i_571_;
			}
			i_574_ += i_573_;
		    }
		} else if (i_572_ == 2) {
		    for (int i_583_ = 0; i_583_ < i_570_; i_583_++) {
			for (int i_584_ = -i_569_; i_584_ < 0; i_584_++) {
			    int i_585_ = anIntArray9466[i_574_];
			    int i_586_ = i_585_ + i_571_;
			    int i_587_
				= (i_571_ & 0xff00ff) + (i_585_ & 0xff00ff);
			    i_585_ = (i_587_ & 0x1000100) + (i_586_ - i_587_
							     & 0x10000);
			    anIntArray9466[i_574_++]
				= i_586_ - i_585_ | i_585_ - (i_585_ >>> 8);
			}
			i_574_ += i_573_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method3267(int i, int i_588_) throws Exception_Sub4 {
	aClass168_Sub1_1959.method14607(i, i_588_);
	if (anInterface24_1943 != null)
	    anInterface24_1943.method133((byte) -17);
    }
    
    int method15190(int i) {
	return aClass180_1944.method3116(i, -1431554601).aShort1834 & 0xffff;
    }
    
    int method15191(int i) {
	return aClass180_1944.method3116(i, -1431554601).aShort1834 & 0xffff;
    }
    
    boolean method15192(int i) {
	TextureMetrics class166 = aClass180_1944.method3116(i, -1431554601);
	return class166.aByte1810 != 0 || class166.aByte1811 != 0;
    }
    
    public boolean method3287() {
	return false;
    }
    
    public boolean method3423() {
	return false;
    }
    
    public void method3235(boolean bool) {
	Class110 class110 = method15223(Thread.currentThread());
	class110.aBool1335 = bool;
    }
    
    public boolean method3290() {
	return false;
    }
    
    public boolean method3320() {
	return false;
    }
    
    public boolean method3298() {
	return false;
    }
    
    public boolean method3293() {
	return false;
    }
    
    public boolean method3455() {
	return false;
    }
    
    public boolean method3295() {
	return false;
    }
    
    public boolean method3582() {
	return false;
    }
    
    public boolean method3308() {
	return false;
    }
    
    public void method3431(int i, int i_589_, int i_590_, int i_591_) {
	if (anInt9470 * 1988019027 < i)
	    anInt9470 = i * 838891739;
	if (1722112305 * anInt9472 < i_589_)
	    anInt9472 = i_589_ * -348561455;
	if (anInt9499 * -466178451 > i_590_)
	    anInt9499 = 1771604837 * i_590_;
	if (anInt9473 * 1920901985 > i_591_)
	    anInt9473 = i_591_ * -2023538527;
	method15173();
    }
    
    public boolean method3299() {
	return false;
    }
    
    public boolean method3300() {
	return false;
    }
    
    void method15193() {
	int i = anInt9499 * -466178451 - 1988019027 * anInt9470;
	int i_592_ = 1920901985 * anInt9473 - anInt9472 * 1722112305;
	float f = aFloat9489 = (float) (-1295758165 * anInt9487) / 2.0F;
	float f_593_ = aFloat9491 = (float) (-223116529 * anInt9488) / 2.0F;
	aFloat9495 = (float) (-2044960987 * anInt9485) + f;
	aFloat9492 = f_593_ + (float) (-1459240987 * anInt9486);
	for (int i_594_ = 0; i_594_ < -1098456669 * anInt9481; i_594_++) {
	    Class110 class110 = aClass110Array9496[i_594_];
	    Class128 class128 = class110.aClass128_1338;
	    class128.aFloat1489 = f;
	    class128.aFloat1491 = f_593_;
	    class128.aFloat1503
		= aFloat9495 - (float) (1988019027 * anInt9470);
	    class128.aFloat1490
		= aFloat9492 - (float) (1722112305 * anInt9472);
	    class128.anInt1494 = i;
	    class128.anInt1495 = i_592_;
	}
	int i_595_ = (1988019027 * anInt9470
		      + 1722112305 * anInt9472 * (anInt9494 * -476035351));
	for (int i_596_ = anInt9472 * 1722112305;
	     i_596_ < 1920901985 * anInt9473; i_596_++) {
	    for (int i_597_ = 0; i_597_ < -1098456669 * anInt9481; i_597_++)
		aClass110Array9496[i_597_].aClass128_1338.anIntArray1487
		    [i_596_ - anInt9472 * 1722112305]
		    = i_595_;
	    i_595_ += anInt9494 * -476035351;
	}
    }
    
    public boolean method3274() {
	return true;
    }
    
    public boolean method3303() {
	return true;
    }
    
    public boolean method3304() {
	return true;
    }
    
    public String method3305() {
	return "";
    }
    
    public String method3306() {
	return "";
    }
    
    public int[] method3272() {
	return null;
    }
    
    public void method3271(Class174 class174) {
	/* empty */
    }
    
    public int[] method3309() {
	return null;
    }
    
    public void method3310(boolean bool) {
	/* empty */
    }
    
    public Class152 method3396(int i, int i_598_, int[] is, int[] is_599_) {
	return new Class152_Sub1(i, i_598_, is, is_599_);
    }
    
    public Class157 method3227(int[] is, int i, int i_600_, int i_601_,
			       int i_602_, boolean bool) {
	boolean bool_603_ = false;
	int i_604_ = i;
    while_144_:
	for (int i_605_ = 0; i_605_ < i_602_; i_605_++) {
	    for (int i_606_ = 0; i_606_ < i_601_; i_606_++) {
		int i_607_ = is[i_604_++] >>> 24;
		if (i_607_ != 0 && i_607_ != 255) {
		    bool_603_ = true;
		    break while_144_;
		}
	    }
	}
	if (bool_603_)
	    return new Class157_Sub1_Sub3(this, is, i, i_600_, i_601_, i_602_,
					  bool);
	return new Class157_Sub1_Sub2(this, is, i, i_600_, i_601_, i_602_,
				      bool);
    }
    
    Class168_Sub1 method3281(Canvas canvas, int i, int i_608_) {
	return Class152_Sub1.method14535(this, canvas, i, i_608_, 206150784);
    }
    
    Class168_Sub1 method3534(Canvas canvas, int i, int i_609_) {
	return Class152_Sub1.method14535(this, canvas, i, i_609_, -1866646072);
    }
    
    Class168_Sub1 method3386(Canvas canvas, int i, int i_610_) {
	return Class152_Sub1.method14535(this, canvas, i, i_610_, 526321943);
    }
    
    public Class157 method3394(int i, int i_611_, int i_612_, int i_613_,
			       boolean bool) {
	if (null == anIntArray9466)
	    throw new IllegalStateException("");
	int[] is = new int[i_612_ * i_613_];
	int i_614_ = i + i_611_ * (anInt9494 * -476035351);
	int i_615_ = -476035351 * anInt9494 - i_612_;
	for (int i_616_ = 0; i_616_ < i_613_; i_616_++) {
	    int i_617_ = i_612_ * i_616_;
	    for (int i_618_ = 0; i_618_ < i_612_; i_618_++)
		is[i_618_ + i_617_] = anIntArray9466[i_614_++];
	    i_614_ += i_615_;
	}
	if (bool)
	    return new Class157_Sub1_Sub3(this, is, i_612_, i_613_);
	return new Class157_Sub1_Sub2(this, is, i_612_, i_613_);
    }
    
    Class597 method15194(int i) {
	return aClass180_1944.method3116(i, -1431554601).aClass597_1807;
    }
    
    public int[] method3316(int i, int i_619_, int i_620_, int i_621_) {
	if (anIntArray9466 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_621_ * i_620_];
	int i_622_ = 0;
	for (int i_623_ = 0; i_623_ < i_621_; i_623_++) {
	    int i_624_ = (i_623_ + i_619_) * (anInt9494 * -476035351) + i;
	    for (int i_625_ = 0; i_625_ < i_620_; i_625_++)
		is[i_622_++] = anIntArray9466[i_624_ + i_625_];
	}
	return is;
    }
    
    public int[] method3207(int i, int i_626_, int i_627_, int i_628_) {
	if (anIntArray9466 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_628_ * i_627_];
	int i_629_ = 0;
	for (int i_630_ = 0; i_630_ < i_628_; i_630_++) {
	    int i_631_ = (i_630_ + i_626_) * (anInt9494 * -476035351) + i;
	    for (int i_632_ = 0; i_632_ < i_627_; i_632_++)
		is[i_629_++] = anIntArray9466[i_631_ + i_632_];
	}
	return is;
    }
    
    public void method3341() {
	/* empty */
    }
    
    public void method3518() {
	/* empty */
    }
    
    void method15195() {
	if (null != aFloatArray9469) {
	    if (0 == anInt9470 * 1988019027
		&& anInt9499 * -466178451 == anInt9494 * -476035351
		&& anInt9472 * 1722112305 == 0
		&& anInt9476 * -1845137399 == anInt9473 * 1920901985) {
		int i = aFloatArray9469.length;
		int i_633_ = i - (i & 0x7);
		int i_634_ = 0;
		while (i_634_ < i_633_) {
		    aFloatArray9469[i_634_++] = 2.14748365E9F;
		    aFloatArray9469[i_634_++] = 2.14748365E9F;
		    aFloatArray9469[i_634_++] = 2.14748365E9F;
		    aFloatArray9469[i_634_++] = 2.14748365E9F;
		    aFloatArray9469[i_634_++] = 2.14748365E9F;
		    aFloatArray9469[i_634_++] = 2.14748365E9F;
		    aFloatArray9469[i_634_++] = 2.14748365E9F;
		    aFloatArray9469[i_634_++] = 2.14748365E9F;
		}
		while (i_634_ < i)
		    aFloatArray9469[i_634_++] = 2.14748365E9F;
	    } else {
		int i = -466178451 * anInt9499 - 1988019027 * anInt9470;
		int i_635_ = 1920901985 * anInt9473 - 1722112305 * anInt9472;
		int i_636_ = -476035351 * anInt9494 - i;
		int i_637_ = (-476035351 * anInt9494 * (1722112305 * anInt9472)
			      + 1988019027 * anInt9470);
		int i_638_ = i >> 3;
		int i_639_ = i & 0x7;
		i = i_637_ - 1;
		for (int i_640_ = -i_635_; i_640_ < 0; i_640_++) {
		    if (i_638_ > 0) {
			int i_641_ = i_638_;
			do {
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			} while (--i_641_ > 0);
		    }
		    if (i_639_ > 0) {
			int i_642_ = i_639_;
			do
			    aFloatArray9469[++i] = 2.14748365E9F;
			while (--i_642_ > 0);
		    }
		    i += i_636_;
		}
	    }
	}
    }
    
    public int[] method3165(int i, int i_643_, int i_644_, int i_645_) {
	if (anIntArray9466 == null)
	    throw new IllegalStateException("");
	int[] is = new int[i_645_ * i_644_];
	int i_646_ = 0;
	for (int i_647_ = 0; i_647_ < i_645_; i_647_++) {
	    int i_648_ = (i_647_ + i_643_) * (anInt9494 * -476035351) + i;
	    for (int i_649_ = 0; i_649_ < i_644_; i_649_++)
		is[i_646_++] = anIntArray9466[i_648_ + i_649_];
	}
	return is;
    }
    
    void method15196(boolean bool, int i, int i_650_, float f, int i_651_,
		     int i_652_, int i_653_) {
	if (anIntArray9466 != null) {
	    if (i_651_ < 0)
		i_651_ = -i_651_;
	    int i_654_ = i_650_ - i_651_;
	    if (i_654_ < 1722112305 * anInt9472)
		i_654_ = 1722112305 * anInt9472;
	    int i_655_ = 1 + (i_650_ + i_651_);
	    if (i_655_ > anInt9473 * 1920901985)
		i_655_ = 1920901985 * anInt9473;
	    int i_656_ = i_654_;
	    int i_657_ = i_651_ * i_651_;
	    int i_658_ = 0;
	    int i_659_ = i_650_ - i_656_;
	    int i_660_ = i_659_ * i_659_;
	    int i_661_ = i_660_ - i_659_;
	    if (i_650_ > i_655_)
		i_650_ = i_655_;
	    int i_662_ = i_652_ >>> 24;
	    if (0 == i_653_ || i_653_ == 1 && i_662_ == 255) {
		while (i_656_ < i_650_) {
		    for (/**/; i_661_ <= i_657_ || i_660_ <= i_657_;
			 i_661_ += i_658_++ + i_658_)
			i_660_ += i_658_ + i_658_;
		    int i_663_ = 1 + (i - i_658_);
		    if (i_663_ < anInt9470 * 1988019027)
			i_663_ = 1988019027 * anInt9470;
		    int i_664_ = i + i_658_;
		    if (i_664_ > anInt9499 * -466178451)
			i_664_ = anInt9499 * -466178451;
		    int i_665_ = i_663_ + i_656_ * (anInt9494 * -476035351);
		    for (int i_666_ = i_663_; i_666_ < i_664_; i_666_++) {
			if (!bool || f < aFloatArray9469[i_665_])
			    anIntArray9466[i_665_] = i_652_;
			i_665_++;
		    }
		    i_656_++;
		    i_660_ -= i_659_-- + i_659_;
		    i_661_ -= i_659_ + i_659_;
		}
		i_658_ = i_651_;
		i_659_ = i_656_ - i_650_;
		i_661_ = i_659_ * i_659_ + i_657_;
		i_660_ = i_661_ - i_658_;
		i_661_ -= i_659_;
		while (i_656_ < i_655_) {
		    for (/**/; i_661_ > i_657_ && i_660_ > i_657_;
			 i_660_ -= i_658_ + i_658_)
			i_661_ -= i_658_-- + i_658_;
		    int i_667_ = i - i_658_;
		    if (i_667_ < 1988019027 * anInt9470)
			i_667_ = 1988019027 * anInt9470;
		    int i_668_ = i + i_658_;
		    if (i_668_ > -466178451 * anInt9499 - 1)
			i_668_ = anInt9499 * -466178451 - 1;
		    int i_669_ = i_667_ + i_656_ * (-476035351 * anInt9494);
		    for (int i_670_ = i_667_; i_670_ <= i_668_; i_670_++) {
			if (!bool || f < aFloatArray9469[i_669_])
			    anIntArray9466[i_669_] = i_652_;
			i_669_++;
		    }
		    i_656_++;
		    i_661_ += i_659_ + i_659_;
		    i_660_ += i_659_++ + i_659_;
		}
	    } else if (1 == i_653_) {
		i_652_ = (((i_652_ & 0xff00) * i_662_ >> 8 & 0xff00)
			  + ((i_652_ & 0xff00ff) * i_662_ >> 8 & 0xff00ff)
			  + (i_662_ << 24));
		int i_671_ = 256 - i_662_;
		while (i_656_ < i_650_) {
		    for (/**/; i_661_ <= i_657_ || i_660_ <= i_657_;
			 i_661_ += i_658_++ + i_658_)
			i_660_ += i_658_ + i_658_;
		    int i_672_ = i - i_658_ + 1;
		    if (i_672_ < 1988019027 * anInt9470)
			i_672_ = anInt9470 * 1988019027;
		    int i_673_ = i_658_ + i;
		    if (i_673_ > anInt9499 * -466178451)
			i_673_ = -466178451 * anInt9499;
		    int i_674_ = i_672_ + anInt9494 * -476035351 * i_656_;
		    for (int i_675_ = i_672_; i_675_ < i_673_; i_675_++) {
			if (!bool || f < aFloatArray9469[i_674_]) {
			    int i_676_ = anIntArray9466[i_674_];
			    i_676_
				= (((i_676_ & 0xff00) * i_671_ >> 8 & 0xff00)
				   + (i_671_ * (i_676_ & 0xff00ff) >> 8
				      & 0xff00ff));
			    anIntArray9466[i_674_] = i_676_ + i_652_;
			}
			i_674_++;
		    }
		    i_656_++;
		    i_660_ -= i_659_-- + i_659_;
		    i_661_ -= i_659_ + i_659_;
		}
		i_658_ = i_651_;
		i_659_ = -i_659_;
		i_661_ = i_657_ + i_659_ * i_659_;
		i_660_ = i_661_ - i_658_;
		i_661_ -= i_659_;
		while (i_656_ < i_655_) {
		    for (/**/; i_661_ > i_657_ && i_660_ > i_657_;
			 i_660_ -= i_658_ + i_658_)
			i_661_ -= i_658_-- + i_658_;
		    int i_677_ = i - i_658_;
		    if (i_677_ < anInt9470 * 1988019027)
			i_677_ = anInt9470 * 1988019027;
		    int i_678_ = i + i_658_;
		    if (i_678_ > anInt9499 * -466178451 - 1)
			i_678_ = -466178451 * anInt9499 - 1;
		    int i_679_ = anInt9494 * -476035351 * i_656_ + i_677_;
		    for (int i_680_ = i_677_; i_680_ <= i_678_; i_680_++) {
			if (!bool || f < aFloatArray9469[i_679_]) {
			    int i_681_ = anIntArray9466[i_679_];
			    i_681_
				= (((i_681_ & 0xff00) * i_671_ >> 8 & 0xff00)
				   + ((i_681_ & 0xff00ff) * i_671_ >> 8
				      & 0xff00ff));
			    anIntArray9466[i_679_] = i_652_ + i_681_;
			}
			i_679_++;
		    }
		    i_656_++;
		    i_661_ += i_659_ + i_659_;
		    i_660_ += i_659_++ + i_659_;
		}
	    } else if (i_653_ == 2) {
		while (i_656_ < i_650_) {
		    for (/**/; i_661_ <= i_657_ || i_660_ <= i_657_;
			 i_661_ += i_658_++ + i_658_)
			i_660_ += i_658_ + i_658_;
		    int i_682_ = i - i_658_ + 1;
		    if (i_682_ < 1988019027 * anInt9470)
			i_682_ = 1988019027 * anInt9470;
		    int i_683_ = i_658_ + i;
		    if (i_683_ > -466178451 * anInt9499)
			i_683_ = anInt9499 * -466178451;
		    int i_684_ = i_656_ * (anInt9494 * -476035351) + i_682_;
		    for (int i_685_ = i_682_; i_685_ < i_683_; i_685_++) {
			if (!bool || f < aFloatArray9469[i_684_]) {
			    int i_686_ = anIntArray9466[i_684_];
			    int i_687_ = i_652_ + i_686_;
			    int i_688_
				= (i_652_ & 0xff00ff) + (i_686_ & 0xff00ff);
			    i_686_ = (i_688_ & 0x1000100) + (i_687_ - i_688_
							     & 0x10000);
			    anIntArray9466[i_684_]
				= i_687_ - i_686_ | i_686_ - (i_686_ >>> 8);
			}
			i_684_++;
		    }
		    i_656_++;
		    i_660_ -= i_659_-- + i_659_;
		    i_661_ -= i_659_ + i_659_;
		}
		i_658_ = i_651_;
		i_659_ = -i_659_;
		i_661_ = i_657_ + i_659_ * i_659_;
		i_660_ = i_661_ - i_658_;
		i_661_ -= i_659_;
		while (i_656_ < i_655_) {
		    for (/**/; i_661_ > i_657_ && i_660_ > i_657_;
			 i_660_ -= i_658_ + i_658_)
			i_661_ -= i_658_-- + i_658_;
		    int i_689_ = i - i_658_;
		    if (i_689_ < 1988019027 * anInt9470)
			i_689_ = anInt9470 * 1988019027;
		    int i_690_ = i_658_ + i;
		    if (i_690_ > -466178451 * anInt9499 - 1)
			i_690_ = anInt9499 * -466178451 - 1;
		    int i_691_ = i_689_ + -476035351 * anInt9494 * i_656_;
		    for (int i_692_ = i_689_; i_692_ <= i_690_; i_692_++) {
			if (!bool || f < aFloatArray9469[i_691_]) {
			    int i_693_ = anIntArray9466[i_691_];
			    int i_694_ = i_693_ + i_652_;
			    int i_695_
				= (i_652_ & 0xff00ff) + (i_693_ & 0xff00ff);
			    i_693_
				= (i_694_ - i_695_ & 0x10000) + (i_695_
								 & 0x1000100);
			    anIntArray9466[i_691_]
				= i_694_ - i_693_ | i_693_ - (i_693_ >>> 8);
			}
			i_691_++;
		    }
		    i_656_++;
		    i_661_ += i_659_ + i_659_;
		    i_660_ += i_659_++ + i_659_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public boolean method3323() {
	return false;
    }
    
    public void method3422(int i, int i_696_, int i_697_, int i_698_,
			   int i_699_, int i_700_, Class152 class152,
			   int i_701_, int i_702_) {
	if (anIntArray9466 != null) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    int[] is = class152_sub1.anIntArray8998;
	    int[] is_703_ = class152_sub1.anIntArray8997;
	    int i_704_ = (1722112305 * anInt9472 > i_702_
			  ? anInt9472 * 1722112305 : i_702_);
	    int i_705_ = (1920901985 * anInt9473 < i_702_ + is.length
			  ? 1920901985 * anInt9473 : is.length + i_702_);
	    i_697_ -= i;
	    i_698_ -= i_696_;
	    if (i_697_ + i_698_ < 0) {
		i += i_697_;
		i_697_ = -i_697_;
		i_696_ += i_698_;
		i_698_ = -i_698_;
	    }
	    if (i_697_ > i_698_) {
		i_696_ <<= 16;
		i_696_ += 32768;
		i_698_ <<= 16;
		int i_706_ = (int) Math.floor((double) i_698_ / (double) i_697_
					      + 0.5);
		i_697_ += i;
		if (i < 1988019027 * anInt9470) {
		    i_696_ += (1988019027 * anInt9470 - i) * i_706_;
		    i = 1988019027 * anInt9470;
		}
		if (i_697_ >= anInt9499 * -466178451)
		    i_697_ = anInt9499 * -466178451 - 1;
		int i_707_ = i_699_ >>> 24;
		if (0 == i_700_ || 1 == i_700_ && 255 == i_707_) {
		    for (/**/; i <= i_697_; i++) {
			int i_708_ = i_696_ >> 16;
			int i_709_ = i_708_ - i_702_;
			if (i_708_ >= i_704_ && i_708_ < i_705_) {
			    int i_710_ = i_701_ + is[i_709_];
			    if (i >= i_710_ && i < is_703_[i_709_] + i_710_)
				anIntArray9466[(-476035351 * anInt9494 * i_708_
						+ i)]
				    = i_699_;
			}
			i_696_ += i_706_;
		    }
		} else if (1 == i_700_) {
		    i_699_ = (((i_699_ & 0xff00) * i_707_ >> 8 & 0xff00)
			      + (i_707_ * (i_699_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_707_ << 24));
		    int i_711_ = 256 - i_707_;
		    for (/**/; i <= i_697_; i++) {
			int i_712_ = i_696_ >> 16;
			int i_713_ = i_712_ - i_702_;
			if (i_712_ >= i_704_ && i_712_ < i_705_) {
			    int i_714_ = i_701_ + is[i_713_];
			    if (i >= i_714_ && i < i_714_ + is_703_[i_713_]) {
				int i_715_
				    = i + i_712_ * (anInt9494 * -476035351);
				int i_716_ = anIntArray9466[i_715_];
				i_716_ = (((i_716_ & 0xff00) * i_711_ >> 8
					   & 0xff00)
					  + (i_711_ * (i_716_ & 0xff00ff) >> 8
					     & 0xff00ff));
				anIntArray9466[i_715_] = i_699_ + i_716_;
			    }
			}
			i_696_ += i_706_;
		    }
		} else if (2 == i_700_) {
		    for (/**/; i <= i_697_; i++) {
			int i_717_ = i_696_ >> 16;
			int i_718_ = i_717_ - i_702_;
			if (i_717_ >= i_704_ && i_717_ < i_705_) {
			    int i_719_ = is[i_718_] + i_701_;
			    if (i >= i_719_ && i < i_719_ + is_703_[i_718_]) {
				int i_720_
				    = i + anInt9494 * -476035351 * i_717_;
				int i_721_ = anIntArray9466[i_720_];
				int i_722_ = i_699_ + i_721_;
				int i_723_ = ((i_699_ & 0xff00ff)
					      + (i_721_ & 0xff00ff));
				i_721_ = ((i_722_ - i_723_ & 0x10000)
					  + (i_723_ & 0x1000100));
				anIntArray9466[i_720_]
				    = i_722_ - i_721_ | i_721_ - (i_721_
								  >>> 8);
			    }
			}
			i_696_ += i_706_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_697_ <<= 16;
		int i_724_ = (int) Math.floor((double) i_697_ / (double) i_698_
					      + 0.5);
		i_698_ += i_696_;
		if (i_696_ < i_704_) {
		    i += (i_704_ - i_696_) * i_724_;
		    i_696_ = i_704_;
		}
		if (i_698_ >= i_705_)
		    i_698_ = i_705_ - 1;
		int i_725_ = i_699_ >>> 24;
		if (0 == i_700_ || i_700_ == 1 && i_725_ == 255) {
		    for (/**/; i_696_ <= i_698_; i_696_++) {
			int i_726_ = i >> 16;
			int i_727_ = i_696_ - i_702_;
			int i_728_ = is[i_727_] + i_701_;
			if (i_726_ >= 1988019027 * anInt9470
			    && i_726_ < -466178451 * anInt9499
			    && i_726_ >= i_728_
			    && i_726_ < i_728_ + is_703_[i_727_])
			    anIntArray9466[(i_696_ * (anInt9494 * -476035351)
					    + i_726_)]
				= i_699_;
			i += i_724_;
		    }
		} else if (i_700_ == 1) {
		    i_699_ = ((i_725_ << 24)
			      + ((i_725_ * (i_699_ & 0xff00) >> 8 & 0xff00)
				 + (i_725_ * (i_699_ & 0xff00ff) >> 8
				    & 0xff00ff)));
		    int i_729_ = 256 - i_725_;
		    for (/**/; i_696_ <= i_698_; i_696_++) {
			int i_730_ = i >> 16;
			int i_731_ = i_696_ - i_702_;
			int i_732_ = i_701_ + is[i_731_];
			if (i_730_ >= 1988019027 * anInt9470
			    && i_730_ < -466178451 * anInt9499
			    && i_730_ >= i_732_
			    && i_730_ < i_732_ + is_703_[i_731_]) {
			    int i_733_
				= anInt9494 * -476035351 * i_696_ + i_730_;
			    int i_734_ = anIntArray9466[i_733_];
			    i_734_
				= (((i_734_ & 0xff00) * i_729_ >> 8 & 0xff00)
				   + ((i_734_ & 0xff00ff) * i_729_ >> 8
				      & 0xff00ff));
			    anIntArray9466[(-476035351 * anInt9494 * i_696_
					    + i_730_)]
				= i_734_ + i_699_;
			}
			i += i_724_;
		    }
		} else if (i_700_ == 2) {
		    for (/**/; i_696_ <= i_698_; i_696_++) {
			int i_735_ = i >> 16;
			int i_736_ = i_696_ - i_702_;
			int i_737_ = is[i_736_] + i_701_;
			if (i_735_ >= 1988019027 * anInt9470
			    && i_735_ < -466178451 * anInt9499
			    && i_735_ >= i_737_
			    && i_735_ < is_703_[i_736_] + i_737_) {
			    int i_738_
				= i_735_ + i_696_ * (-476035351 * anInt9494);
			    int i_739_ = anIntArray9466[i_738_];
			    int i_740_ = i_699_ + i_739_;
			    int i_741_
				= (i_739_ & 0xff00ff) + (i_699_ & 0xff00ff);
			    i_739_ = (i_741_ & 0x1000100) + (i_740_ - i_741_
							     & 0x10000);
			    anIntArray9466[i_738_]
				= i_740_ - i_739_ | i_739_ - (i_739_ >>> 8);
			}
			i += i_724_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public boolean method3325() {
	return false;
    }
    
    public boolean method3278() {
	return true;
    }
    
    void method15197(boolean bool, boolean bool_742_, boolean bool_743_,
		     Class531_Sub5_Sub1 class531_sub5_sub1, int i, int i_744_,
		     float f, int i_745_) {
	int i_746_ = class531_sub5_sub1.anInt11735;
	int i_747_ = i_745_;
	i_745_ <<= 1;
	if (i_746_ == -1)
	    method15180(bool_742_, i, i_744_, f, i_747_,
			class531_sub5_sub1.anInt11737, 1);
	else {
	    if (-197284279 * anInt9500 != i_746_) {
		Class157 class157
		    = (Class157) aClass200_9490.method3785((long) i_746_);
		if (class157 == null) {
		    TextureMetrics class166
			= aClass180_1944.method3116(i_746_, -1431554601);
		    int[] is = method15165(i_746_);
		    if (is != null) {
			int i_748_ = class166.bitLoad * 2082667437;
			class157 = method3215(is, 0, i_748_, i_748_, i_748_,
					      (byte) 57);
			aClass200_9490.method3788(class157, (long) i_746_);
		    } else
			return;
		}
		anInt9500 = i_746_ * -1648253959;
		aClass157_9493 = class157;
	    }
	    i_745_++;
	    ((Class157_Sub1) aClass157_9493).method14537(bool, bool_742_,
							 bool_743_, i - i_747_,
							 i_744_ - i_747_, f,
							 i_745_, i_745_, 0,
							 (class531_sub5_sub1
							  .anInt11737),
							 1, 1, false);
	}
    }
    
    public boolean method3565() {
	return false;
    }
    
    public void method3285(int i, int i_749_) {
	/* empty */
    }
    
    public void method3279() {
	/* empty */
    }
    
    public boolean method3331() {
	return false;
    }
    
    public int method3191() {
	return -1;
    }
    
    public void method3577(int i, int i_750_, int[] is, int[] is_751_) {
	method3177(i, i_750_, (short) 2876);
	if (null == aClass157_9477 || aClass157_9477.method2503() != i
	    || aClass157_9477.method2471() != i_750_) {
	    aClass157_9477 = method3213(i, i_750_, true, true);
	    aClass168_Sub2_9502 = null;
	}
	if (aClass168_Sub2_9502 == null) {
	    aClass168_Sub2_9502 = method3314();
	    aClass168_Sub2_9502.method15585(0, aClass157_9477.method2521());
	}
	Class157_Sub1_Sub3 class157_sub1_sub3
	    = new Class157_Sub1_Sub3(this, anIntArray9466,
				     -476035351 * anInt9494,
				     anInt9476 * -1845137399);
	method3158(aClass168_Sub2_9502, -1166817212);
	method3188(1, -16777216);
	class157_sub1_sub3.method2483(anInt1958 * 1000431205,
				      anInt1964 * 1482704485,
				      anInt1935 * -1588334531,
				      anInt1967 * -863940247, 1, 0, 0, 0);
	aClass157_9477.method2475(0, 0, i, i_750_, is, is_751_, 0, i);
	method3159(aClass168_Sub2_9502, -1876999470);
    }
    
    public void method3334(int i, int i_752_, int i_753_) {
	/* empty */
    }
    
    public void method3335(int i, int i_754_, int i_755_) {
	/* empty */
    }
    
    public void method3430() {
	/* empty */
    }
    
    public void method3510(int i, Class176 class176) {
	Class110 class110 = method15223(Thread.currentThread());
	class110.anInt1362 = -1334076343 * i;
	class110.anInt1330 = class176.anInt1877 * 38100277;
	class110.anInt1361 = class176.anInt1879 * 1852975569;
    }
    
    public long method3338(int i, int i_756_) {
	return 0L;
    }
    
    Class182_Sub2(Canvas canvas, Textures class180, Interface24 interface24,
				  Interface47 interface47, Interface48 interface48,
				  Interface49 interface49, int i, int i_757_) {
	this(class180, interface24, interface47, interface48, interface49);
	try {
	    method3153(canvas, i, i_757_, 1848422509);
	    method3317(canvas, -1490713319);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method3134(-1533096481);
	    throw new RuntimeException("");
	}
    }
    
    public void method3340(long l) {
	/* empty */
    }
    
    public void method3580() {
	anInt9485 = 0;
	anInt9486 = 0;
	anInt9487 = -1509371205 * anInt9494;
	anInt9488 = anInt9476 * 16055143;
	method15173();
    }
    
    public void method3342() {
	aClass168_Sub2_9502 = null;
	aClass157_9477 = null;
    }
    
    void method15198(int i, int i_758_, int i_759_, int i_760_, int i_761_,
		     int i_762_, int i_763_, int i_764_) {
	if (anIntArray9466 != null
	    && (i >= 1988019027 * anInt9470 && i < anInt9499 * -466178451)) {
	    int i_765_ = i + i_758_ * (-476035351 * anInt9494);
	    int i_766_ = i_760_ >>> 24;
	    int i_767_ = i_763_ + i_762_;
	    int i_768_ = i_764_ % i_767_;
	    if (i_761_ == 0 || i_761_ == 1 && 255 == i_766_) {
		int i_769_ = 0;
		while (i_769_ < i_759_) {
		    if (i_769_ + i_758_ >= anInt9472 * 1722112305
			&& i_769_ + i_758_ < 1920901985 * anInt9473
			&& i_768_ < i_762_)
			anIntArray9466[(i_769_ * (-476035351 * anInt9494)
					+ i_765_)]
			    = i_760_;
		    i_769_++;
		    i_768_ = ++i_768_ % i_767_;
		}
	    } else if (1 == i_761_) {
		i_760_ = (((i_760_ & 0xff00ff) * i_766_ >> 8 & 0xff00ff)
			  + ((i_760_ & 0xff00) * i_766_ >> 8 & 0xff00)
			  + (i_766_ << 24));
		int i_770_ = 256 - i_766_;
		int i_771_ = 0;
		while (i_771_ < i_759_) {
		    if (i_771_ + i_758_ >= 1722112305 * anInt9472
			&& i_758_ + i_771_ < 1920901985 * anInt9473
			&& i_768_ < i_762_) {
			int i_772_ = i_765_ + -476035351 * anInt9494 * i_771_;
			int i_773_ = anIntArray9466[i_772_];
			i_773_
			    = (((i_773_ & 0xff00ff) * i_770_ >> 8 & 0xff00ff)
			       + (i_770_ * (i_773_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_772_] = i_773_ + i_760_;
		    }
		    i_771_++;
		    i_768_ = ++i_768_ % i_767_;
		}
	    } else if (i_761_ == 2) {
		int i_774_ = 0;
		while (i_774_ < i_759_) {
		    if (i_758_ + i_774_ >= 1722112305 * anInt9472
			&& i_774_ + i_758_ < anInt9473 * 1920901985
			&& i_768_ < i_762_) {
			int i_775_
			    = i_774_ * (anInt9494 * -476035351) + i_765_;
			int i_776_ = anIntArray9466[i_775_];
			int i_777_ = i_776_ + i_760_;
			int i_778_ = (i_760_ & 0xff00ff) + (i_776_ & 0xff00ff);
			i_776_ = (i_777_ - i_778_ & 0x10000) + (i_778_
								& 0x1000100);
			anIntArray9466[i_775_]
			    = i_777_ - i_776_ | i_776_ - (i_776_ >>> 8);
		    }
		    i_774_++;
		    i_768_ = ++i_768_ % i_767_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3249(int i, int i_779_) {
	/* empty */
    }
    
    void method15199() {
	if (null != aFloatArray9469) {
	    if (0 == anInt9470 * 1988019027
		&& anInt9499 * -466178451 == anInt9494 * -476035351
		&& anInt9472 * 1722112305 == 0
		&& anInt9476 * -1845137399 == anInt9473 * 1920901985) {
		int i = aFloatArray9469.length;
		int i_780_ = i - (i & 0x7);
		int i_781_ = 0;
		while (i_781_ < i_780_) {
		    aFloatArray9469[i_781_++] = 2.14748365E9F;
		    aFloatArray9469[i_781_++] = 2.14748365E9F;
		    aFloatArray9469[i_781_++] = 2.14748365E9F;
		    aFloatArray9469[i_781_++] = 2.14748365E9F;
		    aFloatArray9469[i_781_++] = 2.14748365E9F;
		    aFloatArray9469[i_781_++] = 2.14748365E9F;
		    aFloatArray9469[i_781_++] = 2.14748365E9F;
		    aFloatArray9469[i_781_++] = 2.14748365E9F;
		}
		while (i_781_ < i)
		    aFloatArray9469[i_781_++] = 2.14748365E9F;
	    } else {
		int i = -466178451 * anInt9499 - 1988019027 * anInt9470;
		int i_782_ = 1920901985 * anInt9473 - 1722112305 * anInt9472;
		int i_783_ = -476035351 * anInt9494 - i;
		int i_784_ = (-476035351 * anInt9494 * (1722112305 * anInt9472)
			      + 1988019027 * anInt9470);
		int i_785_ = i >> 3;
		int i_786_ = i & 0x7;
		i = i_784_ - 1;
		for (int i_787_ = -i_782_; i_787_ < 0; i_787_++) {
		    if (i_785_ > 0) {
			int i_788_ = i_785_;
			do {
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			} while (--i_788_ > 0);
		    }
		    if (i_786_ > 0) {
			int i_789_ = i_786_;
			do
			    aFloatArray9469[++i] = 2.14748365E9F;
			while (--i_789_ > 0);
		    }
		    i += i_783_;
		}
	    }
	}
    }
    
    void method15200() {
	if (null != aFloatArray9469) {
	    if (0 == anInt9470 * 1988019027
		&& anInt9499 * -466178451 == anInt9494 * -476035351
		&& anInt9472 * 1722112305 == 0
		&& anInt9476 * -1845137399 == anInt9473 * 1920901985) {
		int i = aFloatArray9469.length;
		int i_790_ = i - (i & 0x7);
		int i_791_ = 0;
		while (i_791_ < i_790_) {
		    aFloatArray9469[i_791_++] = 2.14748365E9F;
		    aFloatArray9469[i_791_++] = 2.14748365E9F;
		    aFloatArray9469[i_791_++] = 2.14748365E9F;
		    aFloatArray9469[i_791_++] = 2.14748365E9F;
		    aFloatArray9469[i_791_++] = 2.14748365E9F;
		    aFloatArray9469[i_791_++] = 2.14748365E9F;
		    aFloatArray9469[i_791_++] = 2.14748365E9F;
		    aFloatArray9469[i_791_++] = 2.14748365E9F;
		}
		while (i_791_ < i)
		    aFloatArray9469[i_791_++] = 2.14748365E9F;
	    } else {
		int i = -466178451 * anInt9499 - 1988019027 * anInt9470;
		int i_792_ = 1920901985 * anInt9473 - 1722112305 * anInt9472;
		int i_793_ = -476035351 * anInt9494 - i;
		int i_794_ = (-476035351 * anInt9494 * (1722112305 * anInt9472)
			      + 1988019027 * anInt9470);
		int i_795_ = i >> 3;
		int i_796_ = i & 0x7;
		i = i_794_ - 1;
		for (int i_797_ = -i_792_; i_797_ < 0; i_797_++) {
		    if (i_795_ > 0) {
			int i_798_ = i_795_;
			do {
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			    aFloatArray9469[++i] = 2.14748365E9F;
			} while (--i_798_ > 0);
		    }
		    if (i_796_ > 0) {
			int i_799_ = i_796_;
			do
			    aFloatArray9469[++i] = 2.14748365E9F;
			while (--i_799_ > 0);
		    }
		    i += i_793_;
		}
	    }
	}
    }
    
    public void method3343(boolean bool) {
	Class110 class110 = method15223(Thread.currentThread());
	class110.aBool1335 = bool;
    }
    
    public void method3141(boolean bool) {
	Class110 class110 = method15223(Thread.currentThread());
	class110.aBool1335 = bool;
    }
    
    Class597 method15201(int i) {
	return aClass180_1944.method3116(i, -1431554601).aClass597_1807;
    }
    
    public void method3476(int i, int i_800_, float f, int i_801_, int i_802_,
			   float f_803_, int i_804_, int i_805_, float f_806_,
			   int i_807_, int i_808_, int i_809_, int i_810_) {
	boolean bool = anIntArray9466 != null;
	boolean bool_811_ = null != aFloatArray9469;
	if (bool || bool_811_) {
	    Class110 class110 = method15223(Thread.currentThread());
	    Class128 class128 = class110.aClass128_1338;
	    class128.aBool1482 = false;
	    i -= 1988019027 * anInt9470;
	    i_801_ -= anInt9470 * 1988019027;
	    i_804_ -= 1988019027 * anInt9470;
	    i_800_ -= anInt9472 * 1722112305;
	    i_802_ -= 1722112305 * anInt9472;
	    i_805_ -= 1722112305 * anInt9472;
	    class128.aBool1485 = (i < 0 || i > class128.anInt1494 || i_801_ < 0
				  || i_801_ > class128.anInt1494 || i_804_ < 0
				  || i_804_ > class128.anInt1494);
	    int i_812_ = i_807_ >>> 24;
	    if (i_810_ == 0 || 1 == i_810_ && i_812_ == 255) {
		class128.anInt1486 = 0;
		class128.aBool1483 = false;
		class128.method2243(bool, bool_811_, false, (float) i_800_,
				    (float) i_802_, (float) i_805_, (float) i,
				    (float) i_801_, (float) i_804_, f, f_803_,
				    f_806_, i_807_, i_808_, i_809_);
	    } else if (i_810_ == 1) {
		class128.anInt1486 = 255 - i_812_;
		class128.aBool1483 = false;
		class128.method2243(bool, bool_811_, false, (float) i_800_,
				    (float) i_802_, (float) i_805_, (float) i,
				    (float) i_801_, (float) i_804_, f, f_803_,
				    f_806_, i_807_, i_808_, i_809_);
	    } else if (2 == i_810_) {
		class128.anInt1486 = 128;
		class128.aBool1483 = true;
		class128.method2243(bool, bool_811_, false, (float) i_800_,
				    (float) i_802_, (float) i_805_, (float) i,
				    (float) i_801_, (float) i_804_, f, f_803_,
				    f_806_, i_807_, i_808_, i_809_);
	    } else
		throw new IllegalArgumentException();
	    class128.aBool1482 = true;
	}
    }
    
    public void method3347(boolean bool) {
	Class110 class110 = method15223(Thread.currentThread());
	class110.aBool1335 = bool;
    }
    
    public void method3348() {
	anInt9485 = 0;
	anInt9486 = 0;
	anInt9487 = -1509371205 * anInt9494;
	anInt9488 = anInt9476 * 16055143;
	method15173();
    }
    
    void method15202(boolean bool, boolean bool_813_, boolean bool_814_, int i,
		     int i_815_, float f, int i_816_, int i_817_, short i_818_,
		     int i_819_, int i_820_, int i_821_) {
	if (0 != i_816_ && 0 != i_817_) {
	    if (i_818_ != -1) {
		TextureMetrics class166
		    = aClass180_1944.method3116(i_818_, -1431554601);
		if (!class166.aBool1819) {
		    if (anInt9500 * -197284279 != i_818_) {
			Class157 class157
			    = ((Class157)
			       aClass200_9490.method3785((long) i_818_));
			if (class157 == null) {
			    int[] is = method15165(i_818_);
			    if (null == is)
				return;
			    int i_822_ = class166.bitLoad * 2082667437;
			    class157 = method3215(is, 0, i_822_, i_822_,
						  i_822_, (byte) 55);
			    aClass200_9490.method3788(class157, (long) i_818_);
			}
			anInt9500 = -1648253959 * i_818_;
			aClass157_9493 = class157;
		    }
		    ((Class157_Sub1) aClass157_9493).method14537
			(bool, bool_813_, bool_814_, i - i_816_,
			 i_815_ - i_817_, f, i_816_ << 1, i_817_ << 1, i_820_,
			 i_819_, i_821_, 1,
			 Class597.aClass597_7841 != class166.aClass597_1807);
		    return;
		}
	    }
	    method15180(bool_813_, i, i_815_, f, i_816_, i_819_, i_821_);
	}
    }
    
    public void method3350(int[] is) {
	is[0] = -2044960987 * anInt9485;
	is[1] = -1459240987 * anInt9486;
	is[2] = anInt9487 * -1295758165;
	is[3] = anInt9488 * -223116529;
    }
    
    public void method3574(float f, float f_823_) {
	aFloat9480 = f_823_ - f;
	aFloat9498 = f + f_823_ - 1.0F;
	for (int i = 0; i < -1098456669 * anInt9481; i++) {
	    Class110 class110 = aClass110Array9496[i];
	    Class128 class128 = class110.aClass128_1338;
	    class128.aFloat1493 = aFloat9480;
	    class128.aFloat1492 = aFloat9498;
	}
    }
    
    public void method3352(float f, float f_824_) {
	aFloat9480 = f_824_ - f;
	aFloat9498 = f + f_824_ - 1.0F;
	for (int i = 0; i < -1098456669 * anInt9481; i++) {
	    Class110 class110 = aClass110Array9496[i];
	    Class128 class128 = class110.aClass128_1338;
	    class128.aFloat1493 = aFloat9480;
	    class128.aFloat1492 = aFloat9498;
	}
    }
    
    public void method3363(float f, float f_825_) {
	aFloat9480 = f_825_ - f;
	aFloat9498 = f + f_825_ - 1.0F;
	for (int i = 0; i < -1098456669 * anInt9481; i++) {
	    Class110 class110 = aClass110Array9496[i];
	    Class128 class128 = class110.aClass128_1338;
	    class128.aFloat1493 = aFloat9480;
	    class128.aFloat1492 = aFloat9498;
	}
    }
    
    void method15203() {
	int i = anInt9499 * -466178451 - 1988019027 * anInt9470;
	int i_826_ = 1920901985 * anInt9473 - anInt9472 * 1722112305;
	float f = aFloat9489 = (float) (-1295758165 * anInt9487) / 2.0F;
	float f_827_ = aFloat9491 = (float) (-223116529 * anInt9488) / 2.0F;
	aFloat9495 = (float) (-2044960987 * anInt9485) + f;
	aFloat9492 = f_827_ + (float) (-1459240987 * anInt9486);
	for (int i_828_ = 0; i_828_ < -1098456669 * anInt9481; i_828_++) {
	    Class110 class110 = aClass110Array9496[i_828_];
	    Class128 class128 = class110.aClass128_1338;
	    class128.aFloat1489 = f;
	    class128.aFloat1491 = f_827_;
	    class128.aFloat1503
		= aFloat9495 - (float) (1988019027 * anInt9470);
	    class128.aFloat1490
		= aFloat9492 - (float) (1722112305 * anInt9472);
	    class128.anInt1494 = i;
	    class128.anInt1495 = i_826_;
	}
	int i_829_ = (1988019027 * anInt9470
		      + 1722112305 * anInt9472 * (anInt9494 * -476035351));
	for (int i_830_ = anInt9472 * 1722112305;
	     i_830_ < 1920901985 * anInt9473; i_830_++) {
	    for (int i_831_ = 0; i_831_ < -1098456669 * anInt9481; i_831_++)
		aClass110Array9496[i_831_].aClass128_1338.anIntArray1487
		    [i_830_ - anInt9472 * 1722112305]
		    = i_829_;
	    i_829_ += anInt9494 * -476035351;
	}
    }
    
    boolean method15204() {
	return aBool9501;
    }
    
    public void method3262(int i, Class176 class176) {
	Class110 class110 = method15223(Thread.currentThread());
	class110.anInt1362 = -1334076343 * i;
	class110.anInt1330 = class176.anInt1877 * 38100277;
	class110.anInt1361 = class176.anInt1879 * 1852975569;
    }
    
    public void method3552(long l) {
	/* empty */
    }
    
    public void method3355(int i, int i_832_, int i_833_, int i_834_) {
	if (i < 0)
	    i = 0;
	if (i_832_ < 0)
	    i_832_ = 0;
	if (i_833_ > -476035351 * anInt9494)
	    i_833_ = anInt9494 * -476035351;
	if (i_834_ > anInt9476 * -1845137399)
	    i_834_ = anInt9476 * -1845137399;
	anInt9470 = 838891739 * i;
	anInt9499 = 1771604837 * i_833_;
	anInt9472 = i_832_ * -348561455;
	anInt9473 = -2023538527 * i_834_;
	method15173();
    }
    
    public boolean method3167() {
	return false;
    }
    
    public Class169 method3450(int[] is) {
	return null;
    }
    
    public void method3358(int[] is) {
	is[0] = 1988019027 * anInt9470;
	is[1] = anInt9472 * 1722112305;
	is[2] = anInt9499 * -466178451;
	is[3] = anInt9473 * 1920901985;
    }
    
    public void method3359(int[] is) {
	is[0] = 1988019027 * anInt9470;
	is[1] = anInt9472 * 1722112305;
	is[2] = anInt9499 * -466178451;
	is[3] = anInt9473 * 1920901985;
    }
    
    public void method3311(int i, int i_835_, int i_836_, int i_837_,
			   int i_838_, int i_839_) {
	method3199(i, i_835_, i_836_, i_838_, i_839_);
	method3199(i, i_837_ + i_835_ - 1, i_836_, i_838_, i_839_);
	method3200(i, i_835_ + 1, i_837_ - 2, i_838_, i_839_);
	method3200(i + i_836_ - 1, i_835_ + 1, i_837_ - 2, i_838_, i_839_);
    }
    
    void method15205() {
	int i = anInt9499 * -466178451 - 1988019027 * anInt9470;
	int i_840_ = 1920901985 * anInt9473 - anInt9472 * 1722112305;
	float f = aFloat9489 = (float) (-1295758165 * anInt9487) / 2.0F;
	float f_841_ = aFloat9491 = (float) (-223116529 * anInt9488) / 2.0F;
	aFloat9495 = (float) (-2044960987 * anInt9485) + f;
	aFloat9492 = f_841_ + (float) (-1459240987 * anInt9486);
	for (int i_842_ = 0; i_842_ < -1098456669 * anInt9481; i_842_++) {
	    Class110 class110 = aClass110Array9496[i_842_];
	    Class128 class128 = class110.aClass128_1338;
	    class128.aFloat1489 = f;
	    class128.aFloat1491 = f_841_;
	    class128.aFloat1503
		= aFloat9495 - (float) (1988019027 * anInt9470);
	    class128.aFloat1490
		= aFloat9492 - (float) (1722112305 * anInt9472);
	    class128.anInt1494 = i;
	    class128.anInt1495 = i_840_;
	}
	int i_843_ = (1988019027 * anInt9470
		      + 1722112305 * anInt9472 * (anInt9494 * -476035351));
	for (int i_844_ = anInt9472 * 1722112305;
	     i_844_ < 1920901985 * anInt9473; i_844_++) {
	    for (int i_845_ = 0; i_845_ < -1098456669 * anInt9481; i_845_++)
		aClass110Array9496[i_845_].aClass128_1338.anIntArray1487
		    [i_844_ - anInt9472 * 1722112305]
		    = i_843_;
	    i_843_ += anInt9494 * -476035351;
	}
    }
    
    public void method3362(int i, int i_846_, int i_847_, int i_848_,
			   int i_849_, int i_850_) {
	if (anIntArray9466 != null) {
	    if (i < anInt9470 * 1988019027) {
		i_847_ -= 1988019027 * anInt9470 - i;
		i = anInt9470 * 1988019027;
	    }
	    if (i_846_ < anInt9472 * 1722112305) {
		i_848_ -= anInt9472 * 1722112305 - i_846_;
		i_846_ = 1722112305 * anInt9472;
	    }
	    if (i_847_ + i > -466178451 * anInt9499)
		i_847_ = anInt9499 * -466178451 - i;
	    if (i_846_ + i_848_ > 1920901985 * anInt9473)
		i_848_ = 1920901985 * anInt9473 - i_846_;
	    if (i_847_ > 0 && i_848_ > 0 && i <= -466178451 * anInt9499
		&& i_846_ <= anInt9473 * 1920901985) {
		int i_851_ = -476035351 * anInt9494 - i_847_;
		int i_852_ = anInt9494 * -476035351 * i_846_ + i;
		int i_853_ = i_849_ >>> 24;
		if (i_850_ == 0 || i_850_ == 1 && 255 == i_853_) {
		    int i_854_ = i_847_ >> 3;
		    int i_855_ = i_847_ & 0x7;
		    i_847_ = i_852_ - 1;
		    for (int i_856_ = -i_848_; i_856_ < 0; i_856_++) {
			if (i_854_ > 0) {
			    i = i_854_;
			    do {
				anIntArray9466[++i_847_] = i_849_;
				anIntArray9466[++i_847_] = i_849_;
				anIntArray9466[++i_847_] = i_849_;
				anIntArray9466[++i_847_] = i_849_;
				anIntArray9466[++i_847_] = i_849_;
				anIntArray9466[++i_847_] = i_849_;
				anIntArray9466[++i_847_] = i_849_;
				anIntArray9466[++i_847_] = i_849_;
			    } while (--i > 0);
			}
			if (i_855_ > 0) {
			    i = i_855_;
			    do
				anIntArray9466[++i_847_] = i_849_;
			    while (--i > 0);
			}
			i_847_ += i_851_;
		    }
		} else if (1 == i_850_) {
		    i_849_
			= ((i_853_ * ((i_849_ & ~0xff00ff) >>> 8) & ~0xff00ff)
			   + ((i_849_ & 0xff00ff) * i_853_ >> 8 & 0xff00ff));
		    int i_857_ = 256 - i_853_;
		    for (int i_858_ = 0; i_858_ < i_848_; i_858_++) {
			for (int i_859_ = -i_847_; i_859_ < 0; i_859_++) {
			    int i_860_ = anIntArray9466[i_852_];
			    i_860_ = ((((i_860_ & ~0xff00ff) >>> 8) * i_857_
				       & ~0xff00ff)
				      + ((i_860_ & 0xff00ff) * i_857_ >> 8
					 & 0xff00ff));
			    anIntArray9466[i_852_++] = i_860_ + i_849_;
			}
			i_852_ += i_851_;
		    }
		} else if (i_850_ == 2) {
		    for (int i_861_ = 0; i_861_ < i_848_; i_861_++) {
			for (int i_862_ = -i_847_; i_862_ < 0; i_862_++) {
			    int i_863_ = anIntArray9466[i_852_];
			    int i_864_ = i_863_ + i_849_;
			    int i_865_
				= (i_849_ & 0xff00ff) + (i_863_ & 0xff00ff);
			    i_863_ = (i_865_ & 0x1000100) + (i_864_ - i_865_
							     & 0x10000);
			    anIntArray9466[i_852_++]
				= i_864_ - i_863_ | i_863_ - (i_863_ >>> 8);
			}
			i_852_ += i_851_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method3147(int i, int i_866_, int i_867_, int i_868_,
			   int i_869_, int i_870_) {
	if (anIntArray9466 != null) {
	    if (i < anInt9470 * 1988019027) {
		i_867_ -= 1988019027 * anInt9470 - i;
		i = anInt9470 * 1988019027;
	    }
	    if (i_866_ < anInt9472 * 1722112305) {
		i_868_ -= anInt9472 * 1722112305 - i_866_;
		i_866_ = 1722112305 * anInt9472;
	    }
	    if (i_867_ + i > -466178451 * anInt9499)
		i_867_ = anInt9499 * -466178451 - i;
	    if (i_866_ + i_868_ > 1920901985 * anInt9473)
		i_868_ = 1920901985 * anInt9473 - i_866_;
	    if (i_867_ > 0 && i_868_ > 0 && i <= -466178451 * anInt9499
		&& i_866_ <= anInt9473 * 1920901985) {
		int i_871_ = -476035351 * anInt9494 - i_867_;
		int i_872_ = anInt9494 * -476035351 * i_866_ + i;
		int i_873_ = i_869_ >>> 24;
		if (i_870_ == 0 || i_870_ == 1 && 255 == i_873_) {
		    int i_874_ = i_867_ >> 3;
		    int i_875_ = i_867_ & 0x7;
		    i_867_ = i_872_ - 1;
		    for (int i_876_ = -i_868_; i_876_ < 0; i_876_++) {
			if (i_874_ > 0) {
			    i = i_874_;
			    do {
				anIntArray9466[++i_867_] = i_869_;
				anIntArray9466[++i_867_] = i_869_;
				anIntArray9466[++i_867_] = i_869_;
				anIntArray9466[++i_867_] = i_869_;
				anIntArray9466[++i_867_] = i_869_;
				anIntArray9466[++i_867_] = i_869_;
				anIntArray9466[++i_867_] = i_869_;
				anIntArray9466[++i_867_] = i_869_;
			    } while (--i > 0);
			}
			if (i_875_ > 0) {
			    i = i_875_;
			    do
				anIntArray9466[++i_867_] = i_869_;
			    while (--i > 0);
			}
			i_867_ += i_871_;
		    }
		} else if (1 == i_870_) {
		    i_869_
			= ((i_873_ * ((i_869_ & ~0xff00ff) >>> 8) & ~0xff00ff)
			   + ((i_869_ & 0xff00ff) * i_873_ >> 8 & 0xff00ff));
		    int i_877_ = 256 - i_873_;
		    for (int i_878_ = 0; i_878_ < i_868_; i_878_++) {
			for (int i_879_ = -i_867_; i_879_ < 0; i_879_++) {
			    int i_880_ = anIntArray9466[i_872_];
			    i_880_ = ((((i_880_ & ~0xff00ff) >>> 8) * i_877_
				       & ~0xff00ff)
				      + ((i_880_ & 0xff00ff) * i_877_ >> 8
					 & 0xff00ff));
			    anIntArray9466[i_872_++] = i_880_ + i_869_;
			}
			i_872_ += i_871_;
		    }
		} else if (i_870_ == 2) {
		    for (int i_881_ = 0; i_881_ < i_868_; i_881_++) {
			for (int i_882_ = -i_867_; i_882_ < 0; i_882_++) {
			    int i_883_ = anIntArray9466[i_872_];
			    int i_884_ = i_883_ + i_869_;
			    int i_885_
				= (i_869_ & 0xff00ff) + (i_883_ & 0xff00ff);
			    i_883_ = (i_885_ & 0x1000100) + (i_884_ - i_885_
							     & 0x10000);
			    anIntArray9466[i_872_++]
				= i_884_ - i_883_ | i_883_ - (i_883_ >>> 8);
			}
			i_872_ += i_871_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method3364(int i, int i_886_, int i_887_, int i_888_,
			   int i_889_, int i_890_) {
	if (anIntArray9466 != null) {
	    if (i < anInt9470 * 1988019027) {
		i_887_ -= 1988019027 * anInt9470 - i;
		i = anInt9470 * 1988019027;
	    }
	    if (i_886_ < anInt9472 * 1722112305) {
		i_888_ -= anInt9472 * 1722112305 - i_886_;
		i_886_ = 1722112305 * anInt9472;
	    }
	    if (i_887_ + i > -466178451 * anInt9499)
		i_887_ = anInt9499 * -466178451 - i;
	    if (i_886_ + i_888_ > 1920901985 * anInt9473)
		i_888_ = 1920901985 * anInt9473 - i_886_;
	    if (i_887_ > 0 && i_888_ > 0 && i <= -466178451 * anInt9499
		&& i_886_ <= anInt9473 * 1920901985) {
		int i_891_ = -476035351 * anInt9494 - i_887_;
		int i_892_ = anInt9494 * -476035351 * i_886_ + i;
		int i_893_ = i_889_ >>> 24;
		if (i_890_ == 0 || i_890_ == 1 && 255 == i_893_) {
		    int i_894_ = i_887_ >> 3;
		    int i_895_ = i_887_ & 0x7;
		    i_887_ = i_892_ - 1;
		    for (int i_896_ = -i_888_; i_896_ < 0; i_896_++) {
			if (i_894_ > 0) {
			    i = i_894_;
			    do {
				anIntArray9466[++i_887_] = i_889_;
				anIntArray9466[++i_887_] = i_889_;
				anIntArray9466[++i_887_] = i_889_;
				anIntArray9466[++i_887_] = i_889_;
				anIntArray9466[++i_887_] = i_889_;
				anIntArray9466[++i_887_] = i_889_;
				anIntArray9466[++i_887_] = i_889_;
				anIntArray9466[++i_887_] = i_889_;
			    } while (--i > 0);
			}
			if (i_895_ > 0) {
			    i = i_895_;
			    do
				anIntArray9466[++i_887_] = i_889_;
			    while (--i > 0);
			}
			i_887_ += i_891_;
		    }
		} else if (1 == i_890_) {
		    i_889_
			= ((i_893_ * ((i_889_ & ~0xff00ff) >>> 8) & ~0xff00ff)
			   + ((i_889_ & 0xff00ff) * i_893_ >> 8 & 0xff00ff));
		    int i_897_ = 256 - i_893_;
		    for (int i_898_ = 0; i_898_ < i_888_; i_898_++) {
			for (int i_899_ = -i_887_; i_899_ < 0; i_899_++) {
			    int i_900_ = anIntArray9466[i_892_];
			    i_900_ = ((((i_900_ & ~0xff00ff) >>> 8) * i_897_
				       & ~0xff00ff)
				      + ((i_900_ & 0xff00ff) * i_897_ >> 8
					 & 0xff00ff));
			    anIntArray9466[i_892_++] = i_900_ + i_889_;
			}
			i_892_ += i_891_;
		    }
		} else if (i_890_ == 2) {
		    for (int i_901_ = 0; i_901_ < i_888_; i_901_++) {
			for (int i_902_ = -i_887_; i_902_ < 0; i_902_++) {
			    int i_903_ = anIntArray9466[i_892_];
			    int i_904_ = i_903_ + i_889_;
			    int i_905_
				= (i_889_ & 0xff00ff) + (i_903_ & 0xff00ff);
			    i_903_ = (i_905_ & 0x1000100) + (i_904_ - i_905_
							     & 0x10000);
			    anIntArray9466[i_892_++]
				= i_904_ - i_903_ | i_903_ - (i_903_ >>> 8);
			}
			i_892_ += i_891_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    void method3365(int i, int i_906_, int i_907_, int i_908_, int i_909_) {
	if (anIntArray9466 != null) {
	    if (i_907_ < 0)
		i_907_ = -i_907_;
	    int i_910_ = i_906_ - i_907_;
	    if (i_910_ < anInt9472 * 1722112305)
		i_910_ = 1722112305 * anInt9472;
	    int i_911_ = 1 + (i_907_ + i_906_);
	    if (i_911_ > anInt9473 * 1920901985)
		i_911_ = 1920901985 * anInt9473;
	    int i_912_ = i_910_;
	    int i_913_ = i_907_ * i_907_;
	    int i_914_ = 0;
	    int i_915_ = i_906_ - i_912_;
	    int i_916_ = i_915_ * i_915_;
	    int i_917_ = i_916_ - i_915_;
	    if (i_906_ > i_911_)
		i_906_ = i_911_;
	    int i_918_ = i_908_ >>> 24;
	    if (i_909_ == 0 || 1 == i_909_ && 255 == i_918_) {
		while (i_912_ < i_906_) {
		    for (/**/; i_917_ <= i_913_ || i_916_ <= i_913_;
			 i_917_ += i_914_++ + i_914_)
			i_916_ += i_914_ + i_914_;
		    int i_919_ = i - i_914_ + 1;
		    if (i_919_ < 1988019027 * anInt9470)
			i_919_ = anInt9470 * 1988019027;
		    int i_920_ = i_914_ + i;
		    if (i_920_ > -466178451 * anInt9499)
			i_920_ = anInt9499 * -466178451;
		    int i_921_ = i_919_ + anInt9494 * -476035351 * i_912_;
		    for (int i_922_ = i_919_; i_922_ < i_920_; i_922_++)
			anIntArray9466[i_921_++] = i_908_;
		    i_912_++;
		    i_916_ -= i_915_-- + i_915_;
		    i_917_ -= i_915_ + i_915_;
		}
		i_914_ = i_907_;
		i_915_ = i_912_ - i_906_;
		i_917_ = i_913_ + i_915_ * i_915_;
		i_916_ = i_917_ - i_914_;
		i_917_ -= i_915_;
		while (i_912_ < i_911_) {
		    for (/**/; i_917_ > i_913_ && i_916_ > i_913_;
			 i_916_ -= i_914_ + i_914_)
			i_917_ -= i_914_-- + i_914_;
		    int i_923_ = i - i_914_;
		    if (i_923_ < 1988019027 * anInt9470)
			i_923_ = anInt9470 * 1988019027;
		    int i_924_ = i_914_ + i;
		    if (i_924_ > anInt9499 * -466178451 - 1)
			i_924_ = -466178451 * anInt9499 - 1;
		    int i_925_ = i_923_ + anInt9494 * -476035351 * i_912_;
		    for (int i_926_ = i_923_; i_926_ <= i_924_; i_926_++)
			anIntArray9466[i_925_++] = i_908_;
		    i_912_++;
		    i_917_ += i_915_ + i_915_;
		    i_916_ += i_915_++ + i_915_;
		}
	    } else if (1 == i_909_) {
		i_908_ = ((i_918_ << 24)
			  + ((i_918_ * (i_908_ & 0xff00ff) >> 8 & 0xff00ff)
			     + (i_918_ * (i_908_ & 0xff00) >> 8 & 0xff00)));
		int i_927_ = 256 - i_918_;
		while (i_912_ < i_906_) {
		    for (/**/; i_917_ <= i_913_ || i_916_ <= i_913_;
			 i_917_ += i_914_++ + i_914_)
			i_916_ += i_914_ + i_914_;
		    int i_928_ = i - i_914_ + 1;
		    if (i_928_ < 1988019027 * anInt9470)
			i_928_ = anInt9470 * 1988019027;
		    int i_929_ = i + i_914_;
		    if (i_929_ > -466178451 * anInt9499)
			i_929_ = anInt9499 * -466178451;
		    int i_930_ = anInt9494 * -476035351 * i_912_ + i_928_;
		    for (int i_931_ = i_928_; i_931_ < i_929_; i_931_++) {
			int i_932_ = anIntArray9466[i_930_];
			i_932_
			    = (((i_932_ & 0xff00ff) * i_927_ >> 8 & 0xff00ff)
			       + (i_927_ * (i_932_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_930_++] = i_908_ + i_932_;
		    }
		    i_912_++;
		    i_916_ -= i_915_-- + i_915_;
		    i_917_ -= i_915_ + i_915_;
		}
		i_914_ = i_907_;
		i_915_ = -i_915_;
		i_917_ = i_913_ + i_915_ * i_915_;
		i_916_ = i_917_ - i_914_;
		i_917_ -= i_915_;
		while (i_912_ < i_911_) {
		    for (/**/; i_917_ > i_913_ && i_916_ > i_913_;
			 i_916_ -= i_914_ + i_914_)
			i_917_ -= i_914_-- + i_914_;
		    int i_933_ = i - i_914_;
		    if (i_933_ < anInt9470 * 1988019027)
			i_933_ = 1988019027 * anInt9470;
		    int i_934_ = i_914_ + i;
		    if (i_934_ > -466178451 * anInt9499 - 1)
			i_934_ = anInt9499 * -466178451 - 1;
		    int i_935_ = i_933_ + -476035351 * anInt9494 * i_912_;
		    for (int i_936_ = i_933_; i_936_ <= i_934_; i_936_++) {
			int i_937_ = anIntArray9466[i_935_];
			i_937_
			    = ((i_927_ * (i_937_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_927_ * (i_937_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_935_++] = i_908_ + i_937_;
		    }
		    i_912_++;
		    i_917_ += i_915_ + i_915_;
		    i_916_ += i_915_++ + i_915_;
		}
	    } else if (2 == i_909_) {
		while (i_912_ < i_906_) {
		    for (/**/; i_917_ <= i_913_ || i_916_ <= i_913_;
			 i_917_ += i_914_++ + i_914_)
			i_916_ += i_914_ + i_914_;
		    int i_938_ = i - i_914_ + 1;
		    if (i_938_ < 1988019027 * anInt9470)
			i_938_ = anInt9470 * 1988019027;
		    int i_939_ = i_914_ + i;
		    if (i_939_ > -466178451 * anInt9499)
			i_939_ = anInt9499 * -466178451;
		    int i_940_ = i_938_ + -476035351 * anInt9494 * i_912_;
		    for (int i_941_ = i_938_; i_941_ < i_939_; i_941_++) {
			int i_942_ = anIntArray9466[i_940_];
			int i_943_ = i_908_ + i_942_;
			int i_944_ = (i_908_ & 0xff00ff) + (i_942_ & 0xff00ff);
			i_942_ = (i_944_ & 0x1000100) + (i_943_ - i_944_
							 & 0x10000);
			anIntArray9466[i_940_++]
			    = i_943_ - i_942_ | i_942_ - (i_942_ >>> 8);
		    }
		    i_912_++;
		    i_916_ -= i_915_-- + i_915_;
		    i_917_ -= i_915_ + i_915_;
		}
		i_914_ = i_907_;
		i_915_ = -i_915_;
		i_917_ = i_913_ + i_915_ * i_915_;
		i_916_ = i_917_ - i_914_;
		i_917_ -= i_915_;
		while (i_912_ < i_911_) {
		    for (/**/; i_917_ > i_913_ && i_916_ > i_913_;
			 i_916_ -= i_914_ + i_914_)
			i_917_ -= i_914_-- + i_914_;
		    int i_945_ = i - i_914_;
		    if (i_945_ < 1988019027 * anInt9470)
			i_945_ = anInt9470 * 1988019027;
		    int i_946_ = i_914_ + i;
		    if (i_946_ > -466178451 * anInt9499 - 1)
			i_946_ = -466178451 * anInt9499 - 1;
		    int i_947_ = i_945_ + -476035351 * anInt9494 * i_912_;
		    for (int i_948_ = i_945_; i_948_ <= i_946_; i_948_++) {
			int i_949_ = anIntArray9466[i_947_];
			int i_950_ = i_949_ + i_908_;
			int i_951_ = (i_949_ & 0xff00ff) + (i_908_ & 0xff00ff);
			i_949_ = (i_950_ - i_951_ & 0x10000) + (i_951_
								& 0x1000100);
			anIntArray9466[i_947_++]
			    = i_950_ - i_949_ | i_949_ - (i_949_ >>> 8);
		    }
		    i_912_++;
		    i_917_ += i_915_ + i_915_;
		    i_916_ += i_915_++ + i_915_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method3366(int i, int i_952_, int i_953_, int i_954_, int i_955_) {
	if (anIntArray9466 != null) {
	    if (i_953_ < 0)
		i_953_ = -i_953_;
	    int i_956_ = i_952_ - i_953_;
	    if (i_956_ < anInt9472 * 1722112305)
		i_956_ = 1722112305 * anInt9472;
	    int i_957_ = 1 + (i_953_ + i_952_);
	    if (i_957_ > anInt9473 * 1920901985)
		i_957_ = 1920901985 * anInt9473;
	    int i_958_ = i_956_;
	    int i_959_ = i_953_ * i_953_;
	    int i_960_ = 0;
	    int i_961_ = i_952_ - i_958_;
	    int i_962_ = i_961_ * i_961_;
	    int i_963_ = i_962_ - i_961_;
	    if (i_952_ > i_957_)
		i_952_ = i_957_;
	    int i_964_ = i_954_ >>> 24;
	    if (i_955_ == 0 || 1 == i_955_ && 255 == i_964_) {
		while (i_958_ < i_952_) {
		    for (/**/; i_963_ <= i_959_ || i_962_ <= i_959_;
			 i_963_ += i_960_++ + i_960_)
			i_962_ += i_960_ + i_960_;
		    int i_965_ = i - i_960_ + 1;
		    if (i_965_ < 1988019027 * anInt9470)
			i_965_ = anInt9470 * 1988019027;
		    int i_966_ = i_960_ + i;
		    if (i_966_ > -466178451 * anInt9499)
			i_966_ = anInt9499 * -466178451;
		    int i_967_ = i_965_ + anInt9494 * -476035351 * i_958_;
		    for (int i_968_ = i_965_; i_968_ < i_966_; i_968_++)
			anIntArray9466[i_967_++] = i_954_;
		    i_958_++;
		    i_962_ -= i_961_-- + i_961_;
		    i_963_ -= i_961_ + i_961_;
		}
		i_960_ = i_953_;
		i_961_ = i_958_ - i_952_;
		i_963_ = i_959_ + i_961_ * i_961_;
		i_962_ = i_963_ - i_960_;
		i_963_ -= i_961_;
		while (i_958_ < i_957_) {
		    for (/**/; i_963_ > i_959_ && i_962_ > i_959_;
			 i_962_ -= i_960_ + i_960_)
			i_963_ -= i_960_-- + i_960_;
		    int i_969_ = i - i_960_;
		    if (i_969_ < 1988019027 * anInt9470)
			i_969_ = anInt9470 * 1988019027;
		    int i_970_ = i_960_ + i;
		    if (i_970_ > anInt9499 * -466178451 - 1)
			i_970_ = -466178451 * anInt9499 - 1;
		    int i_971_ = i_969_ + anInt9494 * -476035351 * i_958_;
		    for (int i_972_ = i_969_; i_972_ <= i_970_; i_972_++)
			anIntArray9466[i_971_++] = i_954_;
		    i_958_++;
		    i_963_ += i_961_ + i_961_;
		    i_962_ += i_961_++ + i_961_;
		}
	    } else if (1 == i_955_) {
		i_954_ = ((i_964_ << 24)
			  + ((i_964_ * (i_954_ & 0xff00ff) >> 8 & 0xff00ff)
			     + (i_964_ * (i_954_ & 0xff00) >> 8 & 0xff00)));
		int i_973_ = 256 - i_964_;
		while (i_958_ < i_952_) {
		    for (/**/; i_963_ <= i_959_ || i_962_ <= i_959_;
			 i_963_ += i_960_++ + i_960_)
			i_962_ += i_960_ + i_960_;
		    int i_974_ = i - i_960_ + 1;
		    if (i_974_ < 1988019027 * anInt9470)
			i_974_ = anInt9470 * 1988019027;
		    int i_975_ = i + i_960_;
		    if (i_975_ > -466178451 * anInt9499)
			i_975_ = anInt9499 * -466178451;
		    int i_976_ = anInt9494 * -476035351 * i_958_ + i_974_;
		    for (int i_977_ = i_974_; i_977_ < i_975_; i_977_++) {
			int i_978_ = anIntArray9466[i_976_];
			i_978_
			    = (((i_978_ & 0xff00ff) * i_973_ >> 8 & 0xff00ff)
			       + (i_973_ * (i_978_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_976_++] = i_954_ + i_978_;
		    }
		    i_958_++;
		    i_962_ -= i_961_-- + i_961_;
		    i_963_ -= i_961_ + i_961_;
		}
		i_960_ = i_953_;
		i_961_ = -i_961_;
		i_963_ = i_959_ + i_961_ * i_961_;
		i_962_ = i_963_ - i_960_;
		i_963_ -= i_961_;
		while (i_958_ < i_957_) {
		    for (/**/; i_963_ > i_959_ && i_962_ > i_959_;
			 i_962_ -= i_960_ + i_960_)
			i_963_ -= i_960_-- + i_960_;
		    int i_979_ = i - i_960_;
		    if (i_979_ < anInt9470 * 1988019027)
			i_979_ = 1988019027 * anInt9470;
		    int i_980_ = i_960_ + i;
		    if (i_980_ > -466178451 * anInt9499 - 1)
			i_980_ = anInt9499 * -466178451 - 1;
		    int i_981_ = i_979_ + -476035351 * anInt9494 * i_958_;
		    for (int i_982_ = i_979_; i_982_ <= i_980_; i_982_++) {
			int i_983_ = anIntArray9466[i_981_];
			i_983_
			    = ((i_973_ * (i_983_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_973_ * (i_983_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_981_++] = i_954_ + i_983_;
		    }
		    i_958_++;
		    i_963_ += i_961_ + i_961_;
		    i_962_ += i_961_++ + i_961_;
		}
	    } else if (2 == i_955_) {
		while (i_958_ < i_952_) {
		    for (/**/; i_963_ <= i_959_ || i_962_ <= i_959_;
			 i_963_ += i_960_++ + i_960_)
			i_962_ += i_960_ + i_960_;
		    int i_984_ = i - i_960_ + 1;
		    if (i_984_ < 1988019027 * anInt9470)
			i_984_ = anInt9470 * 1988019027;
		    int i_985_ = i_960_ + i;
		    if (i_985_ > -466178451 * anInt9499)
			i_985_ = anInt9499 * -466178451;
		    int i_986_ = i_984_ + -476035351 * anInt9494 * i_958_;
		    for (int i_987_ = i_984_; i_987_ < i_985_; i_987_++) {
			int i_988_ = anIntArray9466[i_986_];
			int i_989_ = i_954_ + i_988_;
			int i_990_ = (i_954_ & 0xff00ff) + (i_988_ & 0xff00ff);
			i_988_ = (i_990_ & 0x1000100) + (i_989_ - i_990_
							 & 0x10000);
			anIntArray9466[i_986_++]
			    = i_989_ - i_988_ | i_988_ - (i_988_ >>> 8);
		    }
		    i_958_++;
		    i_962_ -= i_961_-- + i_961_;
		    i_963_ -= i_961_ + i_961_;
		}
		i_960_ = i_953_;
		i_961_ = -i_961_;
		i_963_ = i_959_ + i_961_ * i_961_;
		i_962_ = i_963_ - i_960_;
		i_963_ -= i_961_;
		while (i_958_ < i_957_) {
		    for (/**/; i_963_ > i_959_ && i_962_ > i_959_;
			 i_962_ -= i_960_ + i_960_)
			i_963_ -= i_960_-- + i_960_;
		    int i_991_ = i - i_960_;
		    if (i_991_ < 1988019027 * anInt9470)
			i_991_ = anInt9470 * 1988019027;
		    int i_992_ = i_960_ + i;
		    if (i_992_ > -466178451 * anInt9499 - 1)
			i_992_ = -466178451 * anInt9499 - 1;
		    int i_993_ = i_991_ + -476035351 * anInt9494 * i_958_;
		    for (int i_994_ = i_991_; i_994_ <= i_992_; i_994_++) {
			int i_995_ = anIntArray9466[i_993_];
			int i_996_ = i_995_ + i_954_;
			int i_997_ = (i_995_ & 0xff00ff) + (i_954_ & 0xff00ff);
			i_995_ = (i_996_ - i_997_ & 0x10000) + (i_997_
								& 0x1000100);
			anIntArray9466[i_993_++]
			    = i_996_ - i_995_ | i_995_ - (i_995_ >>> 8);
		    }
		    i_958_++;
		    i_963_ += i_961_ + i_961_;
		    i_962_ += i_961_++ + i_961_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method3367(int i, int i_998_, int i_999_, int i_1000_, int i_1001_) {
	if (anIntArray9466 != null) {
	    if (i_999_ < 0)
		i_999_ = -i_999_;
	    int i_1002_ = i_998_ - i_999_;
	    if (i_1002_ < anInt9472 * 1722112305)
		i_1002_ = 1722112305 * anInt9472;
	    int i_1003_ = 1 + (i_999_ + i_998_);
	    if (i_1003_ > anInt9473 * 1920901985)
		i_1003_ = 1920901985 * anInt9473;
	    int i_1004_ = i_1002_;
	    int i_1005_ = i_999_ * i_999_;
	    int i_1006_ = 0;
	    int i_1007_ = i_998_ - i_1004_;
	    int i_1008_ = i_1007_ * i_1007_;
	    int i_1009_ = i_1008_ - i_1007_;
	    if (i_998_ > i_1003_)
		i_998_ = i_1003_;
	    int i_1010_ = i_1000_ >>> 24;
	    if (i_1001_ == 0 || 1 == i_1001_ && 255 == i_1010_) {
		while (i_1004_ < i_998_) {
		    for (/**/; i_1009_ <= i_1005_ || i_1008_ <= i_1005_;
			 i_1009_ += i_1006_++ + i_1006_)
			i_1008_ += i_1006_ + i_1006_;
		    int i_1011_ = i - i_1006_ + 1;
		    if (i_1011_ < 1988019027 * anInt9470)
			i_1011_ = anInt9470 * 1988019027;
		    int i_1012_ = i_1006_ + i;
		    if (i_1012_ > -466178451 * anInt9499)
			i_1012_ = anInt9499 * -466178451;
		    int i_1013_ = i_1011_ + anInt9494 * -476035351 * i_1004_;
		    for (int i_1014_ = i_1011_; i_1014_ < i_1012_; i_1014_++)
			anIntArray9466[i_1013_++] = i_1000_;
		    i_1004_++;
		    i_1008_ -= i_1007_-- + i_1007_;
		    i_1009_ -= i_1007_ + i_1007_;
		}
		i_1006_ = i_999_;
		i_1007_ = i_1004_ - i_998_;
		i_1009_ = i_1005_ + i_1007_ * i_1007_;
		i_1008_ = i_1009_ - i_1006_;
		i_1009_ -= i_1007_;
		while (i_1004_ < i_1003_) {
		    for (/**/; i_1009_ > i_1005_ && i_1008_ > i_1005_;
			 i_1008_ -= i_1006_ + i_1006_)
			i_1009_ -= i_1006_-- + i_1006_;
		    int i_1015_ = i - i_1006_;
		    if (i_1015_ < 1988019027 * anInt9470)
			i_1015_ = anInt9470 * 1988019027;
		    int i_1016_ = i_1006_ + i;
		    if (i_1016_ > anInt9499 * -466178451 - 1)
			i_1016_ = -466178451 * anInt9499 - 1;
		    int i_1017_ = i_1015_ + anInt9494 * -476035351 * i_1004_;
		    for (int i_1018_ = i_1015_; i_1018_ <= i_1016_; i_1018_++)
			anIntArray9466[i_1017_++] = i_1000_;
		    i_1004_++;
		    i_1009_ += i_1007_ + i_1007_;
		    i_1008_ += i_1007_++ + i_1007_;
		}
	    } else if (1 == i_1001_) {
		i_1000_ = ((i_1010_ << 24)
			   + ((i_1010_ * (i_1000_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_1010_ * (i_1000_ & 0xff00) >> 8 & 0xff00)));
		int i_1019_ = 256 - i_1010_;
		while (i_1004_ < i_998_) {
		    for (/**/; i_1009_ <= i_1005_ || i_1008_ <= i_1005_;
			 i_1009_ += i_1006_++ + i_1006_)
			i_1008_ += i_1006_ + i_1006_;
		    int i_1020_ = i - i_1006_ + 1;
		    if (i_1020_ < 1988019027 * anInt9470)
			i_1020_ = anInt9470 * 1988019027;
		    int i_1021_ = i + i_1006_;
		    if (i_1021_ > -466178451 * anInt9499)
			i_1021_ = anInt9499 * -466178451;
		    int i_1022_ = anInt9494 * -476035351 * i_1004_ + i_1020_;
		    for (int i_1023_ = i_1020_; i_1023_ < i_1021_; i_1023_++) {
			int i_1024_ = anIntArray9466[i_1022_];
			i_1024_
			    = (((i_1024_ & 0xff00ff) * i_1019_ >> 8 & 0xff00ff)
			       + (i_1019_ * (i_1024_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_1022_++] = i_1000_ + i_1024_;
		    }
		    i_1004_++;
		    i_1008_ -= i_1007_-- + i_1007_;
		    i_1009_ -= i_1007_ + i_1007_;
		}
		i_1006_ = i_999_;
		i_1007_ = -i_1007_;
		i_1009_ = i_1005_ + i_1007_ * i_1007_;
		i_1008_ = i_1009_ - i_1006_;
		i_1009_ -= i_1007_;
		while (i_1004_ < i_1003_) {
		    for (/**/; i_1009_ > i_1005_ && i_1008_ > i_1005_;
			 i_1008_ -= i_1006_ + i_1006_)
			i_1009_ -= i_1006_-- + i_1006_;
		    int i_1025_ = i - i_1006_;
		    if (i_1025_ < anInt9470 * 1988019027)
			i_1025_ = 1988019027 * anInt9470;
		    int i_1026_ = i_1006_ + i;
		    if (i_1026_ > -466178451 * anInt9499 - 1)
			i_1026_ = anInt9499 * -466178451 - 1;
		    int i_1027_ = i_1025_ + -476035351 * anInt9494 * i_1004_;
		    for (int i_1028_ = i_1025_; i_1028_ <= i_1026_;
			 i_1028_++) {
			int i_1029_ = anIntArray9466[i_1027_];
			i_1029_
			    = ((i_1019_ * (i_1029_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_1019_ * (i_1029_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_1027_++] = i_1000_ + i_1029_;
		    }
		    i_1004_++;
		    i_1009_ += i_1007_ + i_1007_;
		    i_1008_ += i_1007_++ + i_1007_;
		}
	    } else if (2 == i_1001_) {
		while (i_1004_ < i_998_) {
		    for (/**/; i_1009_ <= i_1005_ || i_1008_ <= i_1005_;
			 i_1009_ += i_1006_++ + i_1006_)
			i_1008_ += i_1006_ + i_1006_;
		    int i_1030_ = i - i_1006_ + 1;
		    if (i_1030_ < 1988019027 * anInt9470)
			i_1030_ = anInt9470 * 1988019027;
		    int i_1031_ = i_1006_ + i;
		    if (i_1031_ > -466178451 * anInt9499)
			i_1031_ = anInt9499 * -466178451;
		    int i_1032_ = i_1030_ + -476035351 * anInt9494 * i_1004_;
		    for (int i_1033_ = i_1030_; i_1033_ < i_1031_; i_1033_++) {
			int i_1034_ = anIntArray9466[i_1032_];
			int i_1035_ = i_1000_ + i_1034_;
			int i_1036_
			    = (i_1000_ & 0xff00ff) + (i_1034_ & 0xff00ff);
			i_1034_ = (i_1036_ & 0x1000100) + (i_1035_ - i_1036_
							   & 0x10000);
			anIntArray9466[i_1032_++]
			    = i_1035_ - i_1034_ | i_1034_ - (i_1034_ >>> 8);
		    }
		    i_1004_++;
		    i_1008_ -= i_1007_-- + i_1007_;
		    i_1009_ -= i_1007_ + i_1007_;
		}
		i_1006_ = i_999_;
		i_1007_ = -i_1007_;
		i_1009_ = i_1005_ + i_1007_ * i_1007_;
		i_1008_ = i_1009_ - i_1006_;
		i_1009_ -= i_1007_;
		while (i_1004_ < i_1003_) {
		    for (/**/; i_1009_ > i_1005_ && i_1008_ > i_1005_;
			 i_1008_ -= i_1006_ + i_1006_)
			i_1009_ -= i_1006_-- + i_1006_;
		    int i_1037_ = i - i_1006_;
		    if (i_1037_ < 1988019027 * anInt9470)
			i_1037_ = anInt9470 * 1988019027;
		    int i_1038_ = i_1006_ + i;
		    if (i_1038_ > -466178451 * anInt9499 - 1)
			i_1038_ = -466178451 * anInt9499 - 1;
		    int i_1039_ = i_1037_ + -476035351 * anInt9494 * i_1004_;
		    for (int i_1040_ = i_1037_; i_1040_ <= i_1038_;
			 i_1040_++) {
			int i_1041_ = anIntArray9466[i_1039_];
			int i_1042_ = i_1041_ + i_1000_;
			int i_1043_
			    = (i_1041_ & 0xff00ff) + (i_1000_ & 0xff00ff);
			i_1041_
			    = (i_1042_ - i_1043_ & 0x10000) + (i_1043_
							       & 0x1000100);
			anIntArray9466[i_1039_++]
			    = i_1042_ - i_1041_ | i_1041_ - (i_1041_ >>> 8);
		    }
		    i_1004_++;
		    i_1009_ += i_1007_ + i_1007_;
		    i_1008_ += i_1007_++ + i_1007_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method3539(int i, int i_1044_, int i_1045_, int i_1046_,
		    int i_1047_) {
	if (anIntArray9466 != null) {
	    if (i_1045_ < 0)
		i_1045_ = -i_1045_;
	    int i_1048_ = i_1044_ - i_1045_;
	    if (i_1048_ < anInt9472 * 1722112305)
		i_1048_ = 1722112305 * anInt9472;
	    int i_1049_ = 1 + (i_1045_ + i_1044_);
	    if (i_1049_ > anInt9473 * 1920901985)
		i_1049_ = 1920901985 * anInt9473;
	    int i_1050_ = i_1048_;
	    int i_1051_ = i_1045_ * i_1045_;
	    int i_1052_ = 0;
	    int i_1053_ = i_1044_ - i_1050_;
	    int i_1054_ = i_1053_ * i_1053_;
	    int i_1055_ = i_1054_ - i_1053_;
	    if (i_1044_ > i_1049_)
		i_1044_ = i_1049_;
	    int i_1056_ = i_1046_ >>> 24;
	    if (i_1047_ == 0 || 1 == i_1047_ && 255 == i_1056_) {
		while (i_1050_ < i_1044_) {
		    for (/**/; i_1055_ <= i_1051_ || i_1054_ <= i_1051_;
			 i_1055_ += i_1052_++ + i_1052_)
			i_1054_ += i_1052_ + i_1052_;
		    int i_1057_ = i - i_1052_ + 1;
		    if (i_1057_ < 1988019027 * anInt9470)
			i_1057_ = anInt9470 * 1988019027;
		    int i_1058_ = i_1052_ + i;
		    if (i_1058_ > -466178451 * anInt9499)
			i_1058_ = anInt9499 * -466178451;
		    int i_1059_ = i_1057_ + anInt9494 * -476035351 * i_1050_;
		    for (int i_1060_ = i_1057_; i_1060_ < i_1058_; i_1060_++)
			anIntArray9466[i_1059_++] = i_1046_;
		    i_1050_++;
		    i_1054_ -= i_1053_-- + i_1053_;
		    i_1055_ -= i_1053_ + i_1053_;
		}
		i_1052_ = i_1045_;
		i_1053_ = i_1050_ - i_1044_;
		i_1055_ = i_1051_ + i_1053_ * i_1053_;
		i_1054_ = i_1055_ - i_1052_;
		i_1055_ -= i_1053_;
		while (i_1050_ < i_1049_) {
		    for (/**/; i_1055_ > i_1051_ && i_1054_ > i_1051_;
			 i_1054_ -= i_1052_ + i_1052_)
			i_1055_ -= i_1052_-- + i_1052_;
		    int i_1061_ = i - i_1052_;
		    if (i_1061_ < 1988019027 * anInt9470)
			i_1061_ = anInt9470 * 1988019027;
		    int i_1062_ = i_1052_ + i;
		    if (i_1062_ > anInt9499 * -466178451 - 1)
			i_1062_ = -466178451 * anInt9499 - 1;
		    int i_1063_ = i_1061_ + anInt9494 * -476035351 * i_1050_;
		    for (int i_1064_ = i_1061_; i_1064_ <= i_1062_; i_1064_++)
			anIntArray9466[i_1063_++] = i_1046_;
		    i_1050_++;
		    i_1055_ += i_1053_ + i_1053_;
		    i_1054_ += i_1053_++ + i_1053_;
		}
	    } else if (1 == i_1047_) {
		i_1046_ = ((i_1056_ << 24)
			   + ((i_1056_ * (i_1046_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_1056_ * (i_1046_ & 0xff00) >> 8 & 0xff00)));
		int i_1065_ = 256 - i_1056_;
		while (i_1050_ < i_1044_) {
		    for (/**/; i_1055_ <= i_1051_ || i_1054_ <= i_1051_;
			 i_1055_ += i_1052_++ + i_1052_)
			i_1054_ += i_1052_ + i_1052_;
		    int i_1066_ = i - i_1052_ + 1;
		    if (i_1066_ < 1988019027 * anInt9470)
			i_1066_ = anInt9470 * 1988019027;
		    int i_1067_ = i + i_1052_;
		    if (i_1067_ > -466178451 * anInt9499)
			i_1067_ = anInt9499 * -466178451;
		    int i_1068_ = anInt9494 * -476035351 * i_1050_ + i_1066_;
		    for (int i_1069_ = i_1066_; i_1069_ < i_1067_; i_1069_++) {
			int i_1070_ = anIntArray9466[i_1068_];
			i_1070_
			    = (((i_1070_ & 0xff00ff) * i_1065_ >> 8 & 0xff00ff)
			       + (i_1065_ * (i_1070_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_1068_++] = i_1046_ + i_1070_;
		    }
		    i_1050_++;
		    i_1054_ -= i_1053_-- + i_1053_;
		    i_1055_ -= i_1053_ + i_1053_;
		}
		i_1052_ = i_1045_;
		i_1053_ = -i_1053_;
		i_1055_ = i_1051_ + i_1053_ * i_1053_;
		i_1054_ = i_1055_ - i_1052_;
		i_1055_ -= i_1053_;
		while (i_1050_ < i_1049_) {
		    for (/**/; i_1055_ > i_1051_ && i_1054_ > i_1051_;
			 i_1054_ -= i_1052_ + i_1052_)
			i_1055_ -= i_1052_-- + i_1052_;
		    int i_1071_ = i - i_1052_;
		    if (i_1071_ < anInt9470 * 1988019027)
			i_1071_ = 1988019027 * anInt9470;
		    int i_1072_ = i_1052_ + i;
		    if (i_1072_ > -466178451 * anInt9499 - 1)
			i_1072_ = anInt9499 * -466178451 - 1;
		    int i_1073_ = i_1071_ + -476035351 * anInt9494 * i_1050_;
		    for (int i_1074_ = i_1071_; i_1074_ <= i_1072_;
			 i_1074_++) {
			int i_1075_ = anIntArray9466[i_1073_];
			i_1075_
			    = ((i_1065_ * (i_1075_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_1065_ * (i_1075_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_1073_++] = i_1046_ + i_1075_;
		    }
		    i_1050_++;
		    i_1055_ += i_1053_ + i_1053_;
		    i_1054_ += i_1053_++ + i_1053_;
		}
	    } else if (2 == i_1047_) {
		while (i_1050_ < i_1044_) {
		    for (/**/; i_1055_ <= i_1051_ || i_1054_ <= i_1051_;
			 i_1055_ += i_1052_++ + i_1052_)
			i_1054_ += i_1052_ + i_1052_;
		    int i_1076_ = i - i_1052_ + 1;
		    if (i_1076_ < 1988019027 * anInt9470)
			i_1076_ = anInt9470 * 1988019027;
		    int i_1077_ = i_1052_ + i;
		    if (i_1077_ > -466178451 * anInt9499)
			i_1077_ = anInt9499 * -466178451;
		    int i_1078_ = i_1076_ + -476035351 * anInt9494 * i_1050_;
		    for (int i_1079_ = i_1076_; i_1079_ < i_1077_; i_1079_++) {
			int i_1080_ = anIntArray9466[i_1078_];
			int i_1081_ = i_1046_ + i_1080_;
			int i_1082_
			    = (i_1046_ & 0xff00ff) + (i_1080_ & 0xff00ff);
			i_1080_ = (i_1082_ & 0x1000100) + (i_1081_ - i_1082_
							   & 0x10000);
			anIntArray9466[i_1078_++]
			    = i_1081_ - i_1080_ | i_1080_ - (i_1080_ >>> 8);
		    }
		    i_1050_++;
		    i_1054_ -= i_1053_-- + i_1053_;
		    i_1055_ -= i_1053_ + i_1053_;
		}
		i_1052_ = i_1045_;
		i_1053_ = -i_1053_;
		i_1055_ = i_1051_ + i_1053_ * i_1053_;
		i_1054_ = i_1055_ - i_1052_;
		i_1055_ -= i_1053_;
		while (i_1050_ < i_1049_) {
		    for (/**/; i_1055_ > i_1051_ && i_1054_ > i_1051_;
			 i_1054_ -= i_1052_ + i_1052_)
			i_1055_ -= i_1052_-- + i_1052_;
		    int i_1083_ = i - i_1052_;
		    if (i_1083_ < 1988019027 * anInt9470)
			i_1083_ = anInt9470 * 1988019027;
		    int i_1084_ = i_1052_ + i;
		    if (i_1084_ > -466178451 * anInt9499 - 1)
			i_1084_ = -466178451 * anInt9499 - 1;
		    int i_1085_ = i_1083_ + -476035351 * anInt9494 * i_1050_;
		    for (int i_1086_ = i_1083_; i_1086_ <= i_1084_;
			 i_1086_++) {
			int i_1087_ = anIntArray9466[i_1085_];
			int i_1088_ = i_1087_ + i_1046_;
			int i_1089_
			    = (i_1087_ & 0xff00ff) + (i_1046_ & 0xff00ff);
			i_1087_
			    = (i_1088_ - i_1089_ & 0x10000) + (i_1089_
							       & 0x1000100);
			anIntArray9466[i_1085_++]
			    = i_1088_ - i_1087_ | i_1087_ - (i_1087_ >>> 8);
		    }
		    i_1050_++;
		    i_1055_ += i_1053_ + i_1053_;
		    i_1054_ += i_1053_++ + i_1053_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public int method3383(int i, int i_1090_, int i_1091_, int i_1092_,
			  int i_1093_, int i_1094_) {
	int i_1095_ = 0;
	float f = ((float) i_1091_ * aClass435_9483.aFloatArray4830[10]
		   + ((float) i_1090_ * aClass435_9483.aFloatArray4830[6]
		      + (aClass435_9483.aFloatArray4830[2] * (float) i
			 + aClass435_9483.aFloatArray4830[14])));
	float f_1096_
	    = (aClass435_9483.aFloatArray4830[14]
	       + aClass435_9483.aFloatArray4830[2] * (float) i_1092_
	       + aClass435_9483.aFloatArray4830[6] * (float) i_1093_
	       + aClass435_9483.aFloatArray4830[10] * (float) i_1094_);
	float f_1097_ = (aClass435_9483.aFloatArray4830[11] * (float) i_1091_
			 + (aClass435_9483.aFloatArray4830[7] * (float) i_1090_
			    + (aClass435_9483.aFloatArray4830[3] * (float) i
			       + aClass435_9483.aFloatArray4830[15])));
	float f_1098_
	    = ((float) i_1094_ * aClass435_9483.aFloatArray4830[11]
	       + ((float) i_1093_ * aClass435_9483.aFloatArray4830[7]
		  + ((float) i_1092_ * aClass435_9483.aFloatArray4830[3]
		     + aClass435_9483.aFloatArray4830[15])));
	if (f < -f_1097_ && f_1096_ < -f_1098_)
	    i_1095_ |= 0x10;
	else if (f > f_1097_ && f_1096_ > f_1098_)
	    i_1095_ |= 0x20;
	float f_1099_
	    = ((float) i_1090_ * aClass435_9483.aFloatArray4830[4]
	       + (aClass435_9483.aFloatArray4830[12]
		  + (float) i * aClass435_9483.aFloatArray4830[0])
	       + aClass435_9483.aFloatArray4830[8] * (float) i_1091_);
	float f_1100_
	    = ((float) i_1094_ * aClass435_9483.aFloatArray4830[8]
	       + (aClass435_9483.aFloatArray4830[12]
		  + aClass435_9483.aFloatArray4830[0] * (float) i_1092_
		  + aClass435_9483.aFloatArray4830[4] * (float) i_1093_));
	if (f_1099_ < -f_1097_ && f_1100_ < -f_1098_)
	    i_1095_ |= 0x1;
	if (f_1099_ > f_1097_ && f_1100_ > f_1098_)
	    i_1095_ |= 0x2;
	float f_1101_
	    = ((float) i_1091_ * aClass435_9483.aFloatArray4830[9]
	       + (aClass435_9483.aFloatArray4830[1] * (float) i
		  + aClass435_9483.aFloatArray4830[13]
		  + (float) i_1090_ * aClass435_9483.aFloatArray4830[5]));
	float f_1102_
	    = (aClass435_9483.aFloatArray4830[13]
	       + (float) i_1092_ * aClass435_9483.aFloatArray4830[1]
	       + aClass435_9483.aFloatArray4830[5] * (float) i_1093_
	       + aClass435_9483.aFloatArray4830[9] * (float) i_1094_);
	if (f_1101_ < -f_1097_ && f_1102_ < -f_1098_)
	    i_1095_ |= 0x4;
	if (f_1101_ > f_1097_ && f_1102_ > f_1098_)
	    i_1095_ |= 0x8;
	return i_1095_;
    }
    
    void method15206(int i, int i_1103_, int i_1104_, int i_1105_, int i_1106_,
		     int i_1107_, int i_1108_, int i_1109_) {
	if (anIntArray9466 != null && (i_1103_ >= 1722112305 * anInt9472
				       && i_1103_ < anInt9473 * 1920901985)) {
	    int i_1110_ = i + -476035351 * anInt9494 * i_1103_;
	    int i_1111_ = i_1105_ >>> 24;
	    int i_1112_ = i_1108_ + i_1107_;
	    int i_1113_ = i_1109_ % i_1112_;
	    if (i_1106_ == 0 || i_1106_ == 1 && i_1111_ == 255) {
		int i_1114_ = 0;
		while (i_1114_ < i_1104_) {
		    if (i + i_1114_ >= 1988019027 * anInt9470
			&& i + i_1114_ < -466178451 * anInt9499
			&& i_1113_ < i_1107_)
			anIntArray9466[i_1110_ + i_1114_] = i_1105_;
		    i_1114_++;
		    i_1113_ = ++i_1113_ % i_1112_;
		}
	    } else if (1 == i_1106_) {
		i_1105_ = (((i_1105_ & 0xff00ff) * i_1111_ >> 8 & 0xff00ff)
			   + ((i_1105_ & 0xff00) * i_1111_ >> 8 & 0xff00)
			   + (i_1111_ << 24));
		int i_1115_ = 256 - i_1111_;
		int i_1116_ = 0;
		while (i_1116_ < i_1104_) {
		    if (i_1116_ + i >= anInt9470 * 1988019027
			&& i_1116_ + i < anInt9499 * -466178451
			&& i_1113_ < i_1107_) {
			int i_1117_ = anIntArray9466[i_1110_ + i_1116_];
			i_1117_ = (((i_1117_ & 0xff00) * i_1115_ >> 8 & 0xff00)
				   + (i_1115_ * (i_1117_ & 0xff00ff) >> 8
				      & 0xff00ff));
			anIntArray9466[i_1116_ + i_1110_] = i_1105_ + i_1117_;
		    }
		    i_1116_++;
		    i_1113_ = ++i_1113_ % i_1112_;
		}
	    } else if (2 == i_1106_) {
		int i_1118_ = 0;
		while (i_1118_ < i_1104_) {
		    if (i + i_1118_ >= anInt9470 * 1988019027
			&& i + i_1118_ < anInt9499 * -466178451
			&& i_1113_ < i_1107_) {
			int i_1119_ = anIntArray9466[i_1118_ + i_1110_];
			int i_1120_ = i_1105_ + i_1119_;
			int i_1121_
			    = (i_1119_ & 0xff00ff) + (i_1105_ & 0xff00ff);
			i_1119_ = (i_1121_ & 0x1000100) + (i_1120_ - i_1121_
							   & 0x10000);
			anIntArray9466[i_1118_ + i_1110_]
			    = i_1120_ - i_1119_ | i_1119_ - (i_1119_ >>> 8);
		    }
		    i_1118_++;
		    i_1113_ = ++i_1113_ % i_1112_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15207(int i, int i_1122_, int i_1123_, int i_1124_, int i_1125_,
		     int i_1126_, int i_1127_, int i_1128_) {
	if (anIntArray9466 != null
	    && (i >= 1988019027 * anInt9470 && i < anInt9499 * -466178451)) {
	    int i_1129_ = i + i_1122_ * (-476035351 * anInt9494);
	    int i_1130_ = i_1124_ >>> 24;
	    int i_1131_ = i_1127_ + i_1126_;
	    int i_1132_ = i_1128_ % i_1131_;
	    if (i_1125_ == 0 || i_1125_ == 1 && 255 == i_1130_) {
		int i_1133_ = 0;
		while (i_1133_ < i_1123_) {
		    if (i_1133_ + i_1122_ >= anInt9472 * 1722112305
			&& i_1133_ + i_1122_ < 1920901985 * anInt9473
			&& i_1132_ < i_1126_)
			anIntArray9466[(i_1133_ * (-476035351 * anInt9494)
					+ i_1129_)]
			    = i_1124_;
		    i_1133_++;
		    i_1132_ = ++i_1132_ % i_1131_;
		}
	    } else if (1 == i_1125_) {
		i_1124_ = (((i_1124_ & 0xff00ff) * i_1130_ >> 8 & 0xff00ff)
			   + ((i_1124_ & 0xff00) * i_1130_ >> 8 & 0xff00)
			   + (i_1130_ << 24));
		int i_1134_ = 256 - i_1130_;
		int i_1135_ = 0;
		while (i_1135_ < i_1123_) {
		    if (i_1135_ + i_1122_ >= 1722112305 * anInt9472
			&& i_1122_ + i_1135_ < 1920901985 * anInt9473
			&& i_1132_ < i_1126_) {
			int i_1136_
			    = i_1129_ + -476035351 * anInt9494 * i_1135_;
			int i_1137_ = anIntArray9466[i_1136_];
			i_1137_
			    = (((i_1137_ & 0xff00ff) * i_1134_ >> 8 & 0xff00ff)
			       + (i_1134_ * (i_1137_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_1136_] = i_1137_ + i_1124_;
		    }
		    i_1135_++;
		    i_1132_ = ++i_1132_ % i_1131_;
		}
	    } else if (i_1125_ == 2) {
		int i_1138_ = 0;
		while (i_1138_ < i_1123_) {
		    if (i_1122_ + i_1138_ >= 1722112305 * anInt9472
			&& i_1138_ + i_1122_ < anInt9473 * 1920901985
			&& i_1132_ < i_1126_) {
			int i_1139_
			    = i_1138_ * (anInt9494 * -476035351) + i_1129_;
			int i_1140_ = anIntArray9466[i_1139_];
			int i_1141_ = i_1140_ + i_1124_;
			int i_1142_
			    = (i_1124_ & 0xff00ff) + (i_1140_ & 0xff00ff);
			i_1140_
			    = (i_1141_ - i_1142_ & 0x10000) + (i_1142_
							       & 0x1000100);
			anIntArray9466[i_1139_]
			    = i_1141_ - i_1140_ | i_1140_ - (i_1140_ >>> 8);
		    }
		    i_1138_++;
		    i_1132_ = ++i_1132_ % i_1131_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15208(int i, int i_1143_, int i_1144_, int i_1145_, int i_1146_,
		     int i_1147_, int i_1148_, int i_1149_) {
	if (anIntArray9466 != null
	    && (i >= 1988019027 * anInt9470 && i < anInt9499 * -466178451)) {
	    int i_1150_ = i + i_1143_ * (-476035351 * anInt9494);
	    int i_1151_ = i_1145_ >>> 24;
	    int i_1152_ = i_1148_ + i_1147_;
	    int i_1153_ = i_1149_ % i_1152_;
	    if (i_1146_ == 0 || i_1146_ == 1 && 255 == i_1151_) {
		int i_1154_ = 0;
		while (i_1154_ < i_1144_) {
		    if (i_1154_ + i_1143_ >= anInt9472 * 1722112305
			&& i_1154_ + i_1143_ < 1920901985 * anInt9473
			&& i_1153_ < i_1147_)
			anIntArray9466[(i_1154_ * (-476035351 * anInt9494)
					+ i_1150_)]
			    = i_1145_;
		    i_1154_++;
		    i_1153_ = ++i_1153_ % i_1152_;
		}
	    } else if (1 == i_1146_) {
		i_1145_ = (((i_1145_ & 0xff00ff) * i_1151_ >> 8 & 0xff00ff)
			   + ((i_1145_ & 0xff00) * i_1151_ >> 8 & 0xff00)
			   + (i_1151_ << 24));
		int i_1155_ = 256 - i_1151_;
		int i_1156_ = 0;
		while (i_1156_ < i_1144_) {
		    if (i_1156_ + i_1143_ >= 1722112305 * anInt9472
			&& i_1143_ + i_1156_ < 1920901985 * anInt9473
			&& i_1153_ < i_1147_) {
			int i_1157_
			    = i_1150_ + -476035351 * anInt9494 * i_1156_;
			int i_1158_ = anIntArray9466[i_1157_];
			i_1158_
			    = (((i_1158_ & 0xff00ff) * i_1155_ >> 8 & 0xff00ff)
			       + (i_1155_ * (i_1158_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_1157_] = i_1158_ + i_1145_;
		    }
		    i_1156_++;
		    i_1153_ = ++i_1153_ % i_1152_;
		}
	    } else if (i_1146_ == 2) {
		int i_1159_ = 0;
		while (i_1159_ < i_1144_) {
		    if (i_1143_ + i_1159_ >= 1722112305 * anInt9472
			&& i_1159_ + i_1143_ < anInt9473 * 1920901985
			&& i_1153_ < i_1147_) {
			int i_1160_
			    = i_1159_ * (anInt9494 * -476035351) + i_1150_;
			int i_1161_ = anIntArray9466[i_1160_];
			int i_1162_ = i_1161_ + i_1145_;
			int i_1163_
			    = (i_1145_ & 0xff00ff) + (i_1161_ & 0xff00ff);
			i_1161_
			    = (i_1162_ - i_1163_ & 0x10000) + (i_1163_
							       & 0x1000100);
			anIntArray9466[i_1160_]
			    = i_1162_ - i_1161_ | i_1161_ - (i_1161_ >>> 8);
		    }
		    i_1159_++;
		    i_1153_ = ++i_1153_ % i_1152_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3472(int i, int i_1164_, int i_1165_, int i_1166_,
			   int i_1167_, int i_1168_) {
	if (null != anIntArray9466) {
	    i_1165_ -= i;
	    i_1166_ -= i_1164_;
	    if (0 == i_1166_) {
		if (i_1165_ >= 0)
		    method3199(i, i_1164_, 1 + i_1165_, i_1167_, i_1168_);
		else
		    method3199(i + i_1165_, i_1164_, 1 + -i_1165_, i_1167_,
			       i_1168_);
	    } else if (i_1165_ == 0) {
		if (i_1166_ >= 0)
		    method3200(i, i_1164_, 1 + i_1166_, i_1167_, i_1168_);
		else
		    method3200(i, i_1166_ + i_1164_, -i_1166_ + 1, i_1167_,
			       i_1168_);
	    } else {
		if (i_1166_ + i_1165_ < 0) {
		    i += i_1165_;
		    i_1165_ = -i_1165_;
		    i_1164_ += i_1166_;
		    i_1166_ = -i_1166_;
		}
		if (i_1165_ > i_1166_) {
		    i_1164_ <<= 16;
		    i_1164_ += 32768;
		    i_1166_ <<= 16;
		    int i_1169_
			= (int) Math.floor((double) i_1166_ / (double) i_1165_
					   + 0.5);
		    i_1165_ += i;
		    if (i < anInt9470 * 1988019027) {
			i_1164_ += (1988019027 * anInt9470 - i) * i_1169_;
			i = anInt9470 * 1988019027;
		    }
		    if (i_1165_ >= -466178451 * anInt9499)
			i_1165_ = -466178451 * anInt9499 - 1;
		    int i_1170_ = i_1167_ >>> 24;
		    if (0 == i_1168_ || 1 == i_1168_ && 255 == i_1170_) {
			for (/**/; i <= i_1165_; i++) {
			    int i_1171_ = i_1164_ >> 16;
			    if (i_1171_ >= 1722112305 * anInt9472
				&& i_1171_ < 1920901985 * anInt9473)
				anIntArray9466[i + i_1171_ * (-476035351
							      * anInt9494)]
				    = i_1167_;
			    i_1164_ += i_1169_;
			}
		    } else if (i_1168_ == 1) {
			i_1167_ = ((i_1170_ * (i_1167_ & 0xff00) >> 8 & 0xff00)
				   + ((i_1167_ & 0xff00ff) * i_1170_ >> 8
				      & 0xff00ff)
				   + (i_1170_ << 24));
			int i_1172_ = 256 - i_1170_;
			for (/**/; i <= i_1165_; i++) {
			    int i_1173_ = i_1164_ >> 16;
			    if (i_1173_ >= 1722112305 * anInt9472
				&& i_1173_ < 1920901985 * anInt9473) {
				int i_1174_
				    = i + -476035351 * anInt9494 * i_1173_;
				int i_1175_ = anIntArray9466[i_1174_];
				i_1175_
				    = (((i_1175_ & 0xff00) * i_1172_ >> 8
					& 0xff00)
				       + (i_1172_ * (i_1175_ & 0xff00ff) >> 8
					  & 0xff00ff));
				anIntArray9466[i_1174_] = i_1175_ + i_1167_;
			    }
			    i_1164_ += i_1169_;
			}
		    } else if (i_1168_ == 2) {
			for (/**/; i <= i_1165_; i++) {
			    int i_1176_ = i_1164_ >> 16;
			    if (i_1176_ >= 1722112305 * anInt9472
				&& i_1176_ < 1920901985 * anInt9473) {
				int i_1177_
				    = i + i_1176_ * (-476035351 * anInt9494);
				int i_1178_ = anIntArray9466[i_1177_];
				int i_1179_ = i_1178_ + i_1167_;
				int i_1180_ = ((i_1178_ & 0xff00ff)
					       + (i_1167_ & 0xff00ff));
				i_1178_ = ((i_1180_ & 0x1000100)
					   + (i_1179_ - i_1180_ & 0x10000));
				anIntArray9466[i_1177_]
				    = i_1179_ - i_1178_ | i_1178_ - (i_1178_
								     >>> 8);
			    }
			    i_1164_ += i_1169_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_1165_ <<= 16;
		    int i_1181_ = (int) Math.floor(0.5 + ((double) i_1165_
							  / (double) i_1166_));
		    i_1166_ += i_1164_;
		    if (i_1164_ < 1722112305 * anInt9472) {
			i += (1722112305 * anInt9472 - i_1164_) * i_1181_;
			i_1164_ = 1722112305 * anInt9472;
		    }
		    if (i_1166_ >= anInt9473 * 1920901985)
			i_1166_ = 1920901985 * anInt9473 - 1;
		    int i_1182_ = i_1167_ >>> 24;
		    if (i_1168_ == 0 || 1 == i_1168_ && 255 == i_1182_) {
			for (/**/; i_1164_ <= i_1166_; i_1164_++) {
			    int i_1183_ = i >> 16;
			    if (i_1183_ >= 1988019027 * anInt9470
				&& i_1183_ < -466178451 * anInt9499)
				anIntArray9466[(i_1183_
						+ i_1164_ * (-476035351
							     * anInt9494))]
				    = i_1167_;
			    i += i_1181_;
			}
		    } else if (1 == i_1168_) {
			i_1167_
			    = (((i_1167_ & 0xff00ff) * i_1182_ >> 8 & 0xff00ff)
			       + (i_1182_ * (i_1167_ & 0xff00) >> 8 & 0xff00)
			       + (i_1182_ << 24));
			int i_1184_ = 256 - i_1182_;
			for (/**/; i_1164_ <= i_1166_; i_1164_++) {
			    int i_1185_ = i >> 16;
			    if (i_1185_ >= anInt9470 * 1988019027
				&& i_1185_ < anInt9499 * -466178451) {
				int i_1186_
				    = (i_1185_
				       + -476035351 * anInt9494 * i_1164_);
				int i_1187_ = anIntArray9466[i_1186_];
				i_1187_ = (((i_1187_ & 0xff00ff) * i_1184_ >> 8
					    & 0xff00ff)
					   + (i_1184_ * (i_1187_ & 0xff00) >> 8
					      & 0xff00));
				anIntArray9466[(i_1164_ * (anInt9494
							   * -476035351)
						+ i_1185_)]
				    = i_1167_ + i_1187_;
			    }
			    i += i_1181_;
			}
		    } else if (i_1168_ == 2) {
			for (/**/; i_1164_ <= i_1166_; i_1164_++) {
			    int i_1188_ = i >> 16;
			    if (i_1188_ >= anInt9470 * 1988019027
				&& i_1188_ < anInt9499 * -466178451) {
				int i_1189_
				    = (i_1188_
				       + i_1164_ * (-476035351 * anInt9494));
				int i_1190_ = anIntArray9466[i_1189_];
				int i_1191_ = i_1167_ + i_1190_;
				int i_1192_ = ((i_1167_ & 0xff00ff)
					       + (i_1190_ & 0xff00ff));
				i_1190_ = ((i_1192_ & 0x1000100)
					   + (i_1191_ - i_1192_ & 0x10000));
				anIntArray9466[i_1189_]
				    = i_1191_ - i_1190_ | i_1190_ - (i_1190_
								     >>> 8);
			    }
			    i += i_1181_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method3156(int i, int i_1193_, int i_1194_, int i_1195_,
			   int i_1196_, int i_1197_) {
	if (null != anIntArray9466) {
	    i_1194_ -= i;
	    i_1195_ -= i_1193_;
	    if (0 == i_1195_) {
		if (i_1194_ >= 0)
		    method3199(i, i_1193_, 1 + i_1194_, i_1196_, i_1197_);
		else
		    method3199(i + i_1194_, i_1193_, 1 + -i_1194_, i_1196_,
			       i_1197_);
	    } else if (i_1194_ == 0) {
		if (i_1195_ >= 0)
		    method3200(i, i_1193_, 1 + i_1195_, i_1196_, i_1197_);
		else
		    method3200(i, i_1195_ + i_1193_, -i_1195_ + 1, i_1196_,
			       i_1197_);
	    } else {
		if (i_1195_ + i_1194_ < 0) {
		    i += i_1194_;
		    i_1194_ = -i_1194_;
		    i_1193_ += i_1195_;
		    i_1195_ = -i_1195_;
		}
		if (i_1194_ > i_1195_) {
		    i_1193_ <<= 16;
		    i_1193_ += 32768;
		    i_1195_ <<= 16;
		    int i_1198_
			= (int) Math.floor((double) i_1195_ / (double) i_1194_
					   + 0.5);
		    i_1194_ += i;
		    if (i < anInt9470 * 1988019027) {
			i_1193_ += (1988019027 * anInt9470 - i) * i_1198_;
			i = anInt9470 * 1988019027;
		    }
		    if (i_1194_ >= -466178451 * anInt9499)
			i_1194_ = -466178451 * anInt9499 - 1;
		    int i_1199_ = i_1196_ >>> 24;
		    if (0 == i_1197_ || 1 == i_1197_ && 255 == i_1199_) {
			for (/**/; i <= i_1194_; i++) {
			    int i_1200_ = i_1193_ >> 16;
			    if (i_1200_ >= 1722112305 * anInt9472
				&& i_1200_ < 1920901985 * anInt9473)
				anIntArray9466[i + i_1200_ * (-476035351
							      * anInt9494)]
				    = i_1196_;
			    i_1193_ += i_1198_;
			}
		    } else if (i_1197_ == 1) {
			i_1196_ = ((i_1199_ * (i_1196_ & 0xff00) >> 8 & 0xff00)
				   + ((i_1196_ & 0xff00ff) * i_1199_ >> 8
				      & 0xff00ff)
				   + (i_1199_ << 24));
			int i_1201_ = 256 - i_1199_;
			for (/**/; i <= i_1194_; i++) {
			    int i_1202_ = i_1193_ >> 16;
			    if (i_1202_ >= 1722112305 * anInt9472
				&& i_1202_ < 1920901985 * anInt9473) {
				int i_1203_
				    = i + -476035351 * anInt9494 * i_1202_;
				int i_1204_ = anIntArray9466[i_1203_];
				i_1204_
				    = (((i_1204_ & 0xff00) * i_1201_ >> 8
					& 0xff00)
				       + (i_1201_ * (i_1204_ & 0xff00ff) >> 8
					  & 0xff00ff));
				anIntArray9466[i_1203_] = i_1204_ + i_1196_;
			    }
			    i_1193_ += i_1198_;
			}
		    } else if (i_1197_ == 2) {
			for (/**/; i <= i_1194_; i++) {
			    int i_1205_ = i_1193_ >> 16;
			    if (i_1205_ >= 1722112305 * anInt9472
				&& i_1205_ < 1920901985 * anInt9473) {
				int i_1206_
				    = i + i_1205_ * (-476035351 * anInt9494);
				int i_1207_ = anIntArray9466[i_1206_];
				int i_1208_ = i_1207_ + i_1196_;
				int i_1209_ = ((i_1207_ & 0xff00ff)
					       + (i_1196_ & 0xff00ff));
				i_1207_ = ((i_1209_ & 0x1000100)
					   + (i_1208_ - i_1209_ & 0x10000));
				anIntArray9466[i_1206_]
				    = i_1208_ - i_1207_ | i_1207_ - (i_1207_
								     >>> 8);
			    }
			    i_1193_ += i_1198_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_1194_ <<= 16;
		    int i_1210_ = (int) Math.floor(0.5 + ((double) i_1194_
							  / (double) i_1195_));
		    i_1195_ += i_1193_;
		    if (i_1193_ < 1722112305 * anInt9472) {
			i += (1722112305 * anInt9472 - i_1193_) * i_1210_;
			i_1193_ = 1722112305 * anInt9472;
		    }
		    if (i_1195_ >= anInt9473 * 1920901985)
			i_1195_ = 1920901985 * anInt9473 - 1;
		    int i_1211_ = i_1196_ >>> 24;
		    if (i_1197_ == 0 || 1 == i_1197_ && 255 == i_1211_) {
			for (/**/; i_1193_ <= i_1195_; i_1193_++) {
			    int i_1212_ = i >> 16;
			    if (i_1212_ >= 1988019027 * anInt9470
				&& i_1212_ < -466178451 * anInt9499)
				anIntArray9466[(i_1212_
						+ i_1193_ * (-476035351
							     * anInt9494))]
				    = i_1196_;
			    i += i_1210_;
			}
		    } else if (1 == i_1197_) {
			i_1196_
			    = (((i_1196_ & 0xff00ff) * i_1211_ >> 8 & 0xff00ff)
			       + (i_1211_ * (i_1196_ & 0xff00) >> 8 & 0xff00)
			       + (i_1211_ << 24));
			int i_1213_ = 256 - i_1211_;
			for (/**/; i_1193_ <= i_1195_; i_1193_++) {
			    int i_1214_ = i >> 16;
			    if (i_1214_ >= anInt9470 * 1988019027
				&& i_1214_ < anInt9499 * -466178451) {
				int i_1215_
				    = (i_1214_
				       + -476035351 * anInt9494 * i_1193_);
				int i_1216_ = anIntArray9466[i_1215_];
				i_1216_ = (((i_1216_ & 0xff00ff) * i_1213_ >> 8
					    & 0xff00ff)
					   + (i_1213_ * (i_1216_ & 0xff00) >> 8
					      & 0xff00));
				anIntArray9466[(i_1193_ * (anInt9494
							   * -476035351)
						+ i_1214_)]
				    = i_1196_ + i_1216_;
			    }
			    i += i_1210_;
			}
		    } else if (i_1197_ == 2) {
			for (/**/; i_1193_ <= i_1195_; i_1193_++) {
			    int i_1217_ = i >> 16;
			    if (i_1217_ >= anInt9470 * 1988019027
				&& i_1217_ < anInt9499 * -466178451) {
				int i_1218_
				    = (i_1217_
				       + i_1193_ * (-476035351 * anInt9494));
				int i_1219_ = anIntArray9466[i_1218_];
				int i_1220_ = i_1196_ + i_1219_;
				int i_1221_ = ((i_1196_ & 0xff00ff)
					       + (i_1219_ & 0xff00ff));
				i_1219_ = ((i_1221_ & 0x1000100)
					   + (i_1220_ - i_1221_ & 0x10000));
				anIntArray9466[i_1218_]
				    = i_1220_ - i_1219_ | i_1219_ - (i_1219_
								     >>> 8);
			    }
			    i += i_1210_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public void method3230(float f, float f_1222_, float f_1223_, float[] fs) {
	float f_1224_ = (aClass435_9483.aFloatArray4830[14]
			 + aClass435_9483.aFloatArray4830[2] * f
			 + aClass435_9483.aFloatArray4830[6] * f_1222_
			 + f_1223_ * aClass435_9483.aFloatArray4830[10]);
	float f_1225_ = (f_1222_ * aClass435_9483.aFloatArray4830[7]
			 + (aClass435_9483.aFloatArray4830[15]
			    + aClass435_9483.aFloatArray4830[3] * f)
			 + f_1223_ * aClass435_9483.aFloatArray4830[11]);
	if (f_1224_ < -f_1225_ || f_1224_ > f_1225_) {
	    float[] fs_1226_ = fs;
	    float[] fs_1227_ = fs;
	    fs[2] = Float.NaN;
	    fs_1227_[1] = Float.NaN;
	    fs_1226_[0] = Float.NaN;
	} else {
	    float f_1228_ = (f_1222_ * aClass435_9483.aFloatArray4830[4]
			     + (aClass435_9483.aFloatArray4830[12]
				+ f * aClass435_9483.aFloatArray4830[0])
			     + f_1223_ * aClass435_9483.aFloatArray4830[8]);
	    if (f_1228_ < -f_1225_ || f_1228_ > f_1225_) {
		float[] fs_1229_ = fs;
		float[] fs_1230_ = fs;
		fs[2] = Float.NaN;
		fs_1230_[1] = Float.NaN;
		fs_1229_[0] = Float.NaN;
	    } else {
		float f_1231_
		    = (f_1223_ * aClass435_9483.aFloatArray4830[9]
		       + (f * aClass435_9483.aFloatArray4830[1]
			  + aClass435_9483.aFloatArray4830[13]
			  + f_1222_ * aClass435_9483.aFloatArray4830[5]));
		if (f_1231_ < -f_1225_ || f_1231_ > f_1225_) {
		    float[] fs_1232_ = fs;
		    float[] fs_1233_ = fs;
		    fs[2] = Float.NaN;
		    fs_1233_[1] = Float.NaN;
		    fs_1232_[0] = Float.NaN;
		} else {
		    float f_1234_
			= (aClass435_9467.aFloatArray4830[14]
			   + f * aClass435_9467.aFloatArray4830[2]
			   + f_1222_ * aClass435_9467.aFloatArray4830[6]
			   + aClass435_9467.aFloatArray4830[10] * f_1223_);
		    fs[0] = aFloat9495 + aFloat9489 * f_1228_ / f_1225_;
		    fs[1] = aFloat9492 + f_1231_ * aFloat9491 / f_1225_;
		    fs[2] = f_1234_;
		}
	    }
	}
    }
    
    public void method3373(int i, int i_1235_, int i_1236_, int i_1237_,
			   int i_1238_, int i_1239_, int i_1240_, int i_1241_,
			   int i_1242_) {
	if (null != anIntArray9466) {
	    i_1236_ -= i;
	    i_1237_ -= i_1235_;
	    if (i_1237_ == 0) {
		if (i_1236_ >= 0)
		    method15210(i, i_1235_, i_1236_ + 1, i_1238_, i_1239_,
				i_1240_, i_1241_, i_1242_);
		else {
		    int i_1243_ = i_1241_ + i_1240_;
		    i_1242_ %= i_1243_;
		    i_1242_ = (i_1243_ + i_1240_ - i_1242_
			       - (1 + -i_1236_) % i_1243_);
		    i_1242_ %= i_1243_;
		    if (i_1242_ < 0)
			i_1242_ += i_1243_;
		    method15210(i_1236_ + i, i_1235_, 1 + -i_1236_, i_1238_,
				i_1239_, i_1240_, i_1241_, i_1242_);
		}
	    } else if (0 == i_1236_) {
		if (i_1237_ >= 0)
		    method15198(i, i_1235_, 1 + i_1237_, i_1238_, i_1239_,
				i_1240_, i_1241_, i_1242_);
		else {
		    int i_1244_ = i_1240_ + i_1241_;
		    i_1242_ %= i_1244_;
		    i_1242_ = (i_1240_ + i_1244_ - i_1242_
			       - (-i_1237_ + 1) % i_1244_);
		    i_1242_ %= i_1244_;
		    if (i_1242_ < 0)
			i_1242_ += i_1244_;
		    method15198(i, i_1237_ + i_1235_, 1 + -i_1237_, i_1238_,
				i_1239_, i_1240_, i_1241_, i_1242_);
		}
	    } else {
		i_1242_ <<= 8;
		i_1240_ <<= 8;
		i_1241_ <<= 8;
		int i_1245_ = i_1240_ + i_1241_;
		i_1242_ %= i_1245_;
		if (i_1236_ + i_1237_ < 0) {
		    int i_1246_
			= (int) (Math.sqrt((double) (i_1236_ * i_1236_
						     + i_1237_ * i_1237_))
				 * 256.0);
		    int i_1247_ = i_1246_ % i_1245_;
		    i_1242_ = i_1245_ + i_1240_ - i_1242_ - i_1247_;
		    i_1242_ %= i_1245_;
		    if (i_1242_ < 0)
			i_1242_ += i_1245_;
		    i += i_1236_;
		    i_1236_ = -i_1236_;
		    i_1235_ += i_1237_;
		    i_1237_ = -i_1237_;
		}
		if (i_1236_ > i_1237_) {
		    i_1235_ <<= 16;
		    i_1235_ += 32768;
		    i_1237_ <<= 16;
		    int i_1248_ = (int) Math.floor(0.5 + ((double) i_1237_
							  / (double) i_1236_));
		    i_1236_ += i;
		    int i_1249_ = i_1238_ >>> 24;
		    int i_1250_
			= (int) Math.sqrt((double) (65536
						    + ((i_1248_ >> 8)
						       * (i_1248_ >> 8))));
		    if (0 == i_1239_ || 1 == i_1239_ && 255 == i_1249_) {
			while (i <= i_1236_) {
			    int i_1251_ = i_1235_ >> 16;
			    if (i >= anInt9470 * 1988019027
				&& i < -466178451 * anInt9499
				&& i_1251_ >= 1722112305 * anInt9472
				&& i_1251_ < 1920901985 * anInt9473
				&& i_1242_ < i_1240_)
				anIntArray9466[i + i_1251_ * (-476035351
							      * anInt9494)]
				    = i_1238_;
			    i_1235_ += i_1248_;
			    i++;
			    i_1242_ += i_1250_;
			    i_1242_ %= i_1245_;
			}
		    } else if (i_1239_ == 1) {
			i_1238_ = ((i_1249_ * (i_1238_ & 0xff00) >> 8 & 0xff00)
				   + (i_1249_ * (i_1238_ & 0xff00ff) >> 8
				      & 0xff00ff)
				   + (i_1249_ << 24));
			int i_1252_ = 256 - i_1249_;
			while (i <= i_1236_) {
			    int i_1253_ = i_1235_ >> 16;
			    if (i >= anInt9470 * 1988019027
				&& i < -466178451 * anInt9499
				&& i_1253_ >= anInt9472 * 1722112305
				&& i_1253_ < anInt9473 * 1920901985
				&& i_1242_ < i_1240_) {
				int i_1254_
				    = i + i_1253_ * (anInt9494 * -476035351);
				int i_1255_ = anIntArray9466[i_1254_];
				i_1255_
				    = ((i_1252_ * (i_1255_ & 0xff00) >> 8
					& 0xff00)
				       + ((i_1255_ & 0xff00ff) * i_1252_ >> 8
					  & 0xff00ff));
				anIntArray9466[i_1254_] = i_1255_ + i_1238_;
			    }
			    i_1235_ += i_1248_;
			    i++;
			    i_1242_ += i_1250_;
			    i_1242_ %= i_1245_;
			}
		    } else if (i_1239_ == 2) {
			while (i <= i_1236_) {
			    int i_1256_ = i_1235_ >> 16;
			    if (i >= anInt9470 * 1988019027
				&& i < anInt9499 * -466178451
				&& i_1256_ >= 1722112305 * anInt9472
				&& i_1256_ < anInt9473 * 1920901985
				&& i_1242_ < i_1240_) {
				int i_1257_
				    = i_1256_ * (-476035351 * anInt9494) + i;
				int i_1258_ = anIntArray9466[i_1257_];
				int i_1259_ = i_1238_ + i_1258_;
				int i_1260_ = ((i_1258_ & 0xff00ff)
					       + (i_1238_ & 0xff00ff));
				i_1258_ = ((i_1260_ & 0x1000100)
					   + (i_1259_ - i_1260_ & 0x10000));
				anIntArray9466[i_1257_]
				    = i_1259_ - i_1258_ | i_1258_ - (i_1258_
								     >>> 8);
			    }
			    i_1235_ += i_1248_;
			    i++;
			    i_1242_ += i_1250_;
			    i_1242_ %= i_1245_;
			}
		    } else
			throw new IllegalArgumentException();
		} else {
		    i <<= 16;
		    i += 32768;
		    i_1236_ <<= 16;
		    int i_1261_ = (int) Math.floor(0.5 + ((double) i_1236_
							  / (double) i_1237_));
		    i_1237_ += i_1235_;
		    int i_1262_ = i_1238_ >>> 24;
		    int i_1263_
			= (int) Math.sqrt((double) ((i_1261_ >> 8) * (i_1261_
								      >> 8)
						    + 65536));
		    if (i_1239_ == 0 || i_1239_ == 1 && 255 == i_1262_) {
			while (i_1235_ <= i_1237_) {
			    int i_1264_ = i >> 16;
			    if (i_1235_ >= 1722112305 * anInt9472
				&& i_1235_ < anInt9473 * 1920901985
				&& i_1264_ >= anInt9470 * 1988019027
				&& i_1264_ < -466178451 * anInt9499
				&& i_1242_ < i_1240_)
				anIntArray9466[i_1264_ + (-476035351
							  * anInt9494
							  * i_1235_)]
				    = i_1238_;
			    i += i_1261_;
			    i_1235_++;
			    i_1242_ += i_1263_;
			    i_1242_ %= i_1245_;
			}
		    } else if (1 == i_1239_) {
			i_1238_
			    = ((i_1262_ * (i_1238_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_1262_ * (i_1238_ & 0xff00) >> 8 & 0xff00)
			       + (i_1262_ << 24));
			int i_1265_ = 256 - i_1262_;
			while (i_1235_ <= i_1237_) {
			    int i_1266_ = i >> 16;
			    if (i_1235_ >= 1722112305 * anInt9472
				&& i_1235_ < anInt9473 * 1920901985
				&& i_1266_ >= anInt9470 * 1988019027
				&& i_1266_ < anInt9499 * -466178451
				&& i_1242_ < i_1240_) {
				int i_1267_
				    = (i_1235_ * (anInt9494 * -476035351)
				       + i_1266_);
				int i_1268_ = anIntArray9466[i_1267_];
				i_1268_
				    = (((i_1268_ & 0xff00) * i_1265_ >> 8
					& 0xff00)
				       + (i_1265_ * (i_1268_ & 0xff00ff) >> 8
					  & 0xff00ff));
				anIntArray9466[i_1266_ + (anInt9494
							  * -476035351
							  * i_1235_)]
				    = i_1268_ + i_1238_;
			    }
			    i += i_1261_;
			    i_1235_++;
			    i_1242_ += i_1263_;
			    i_1242_ %= i_1245_;
			}
		    } else if (2 == i_1239_) {
			while (i_1235_ <= i_1237_) {
			    int i_1269_ = i >> 16;
			    if (i_1235_ >= 1722112305 * anInt9472
				&& i_1235_ < 1920901985 * anInt9473
				&& i_1269_ >= 1988019027 * anInt9470
				&& i_1269_ < -466178451 * anInt9499
				&& i_1242_ < i_1240_) {
				int i_1270_
				    = (i_1269_
				       + i_1235_ * (anInt9494 * -476035351));
				int i_1271_ = anIntArray9466[i_1270_];
				int i_1272_ = i_1238_ + i_1271_;
				int i_1273_ = ((i_1238_ & 0xff00ff)
					       + (i_1271_ & 0xff00ff));
				i_1271_ = ((i_1272_ - i_1273_ & 0x10000)
					   + (i_1273_ & 0x1000100));
				anIntArray9466[i_1270_]
				    = i_1272_ - i_1271_ | i_1271_ - (i_1271_
								     >>> 8);
			    }
			    i += i_1261_;
			    i_1235_++;
			    i_1242_ += i_1263_;
			    i_1242_ %= i_1245_;
			}
		    } else
			throw new IllegalArgumentException();
		}
	    }
	}
    }
    
    public boolean method3289() {
	return true;
    }
    
    public void method3564(int i, int i_1274_, int i_1275_, int i_1276_,
			   int i_1277_, int i_1278_, Class152 class152,
			   int i_1279_, int i_1280_) {
	if (anIntArray9466 != null) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    int[] is = class152_sub1.anIntArray8998;
	    int[] is_1281_ = class152_sub1.anIntArray8997;
	    int i_1282_ = (1722112305 * anInt9472 > i_1280_
			   ? anInt9472 * 1722112305 : i_1280_);
	    int i_1283_ = (1920901985 * anInt9473 < i_1280_ + is.length
			   ? 1920901985 * anInt9473 : is.length + i_1280_);
	    i_1275_ -= i;
	    i_1276_ -= i_1274_;
	    if (i_1275_ + i_1276_ < 0) {
		i += i_1275_;
		i_1275_ = -i_1275_;
		i_1274_ += i_1276_;
		i_1276_ = -i_1276_;
	    }
	    if (i_1275_ > i_1276_) {
		i_1274_ <<= 16;
		i_1274_ += 32768;
		i_1276_ <<= 16;
		int i_1284_
		    = (int) Math.floor((double) i_1276_ / (double) i_1275_
				       + 0.5);
		i_1275_ += i;
		if (i < 1988019027 * anInt9470) {
		    i_1274_ += (1988019027 * anInt9470 - i) * i_1284_;
		    i = 1988019027 * anInt9470;
		}
		if (i_1275_ >= anInt9499 * -466178451)
		    i_1275_ = anInt9499 * -466178451 - 1;
		int i_1285_ = i_1277_ >>> 24;
		if (0 == i_1278_ || 1 == i_1278_ && 255 == i_1285_) {
		    for (/**/; i <= i_1275_; i++) {
			int i_1286_ = i_1274_ >> 16;
			int i_1287_ = i_1286_ - i_1280_;
			if (i_1286_ >= i_1282_ && i_1286_ < i_1283_) {
			    int i_1288_ = i_1279_ + is[i_1287_];
			    if (i >= i_1288_
				&& i < is_1281_[i_1287_] + i_1288_)
				anIntArray9466
				    [-476035351 * anInt9494 * i_1286_ + i]
				    = i_1277_;
			}
			i_1274_ += i_1284_;
		    }
		} else if (1 == i_1278_) {
		    i_1277_
			= (((i_1277_ & 0xff00) * i_1285_ >> 8 & 0xff00)
			   + (i_1285_ * (i_1277_ & 0xff00ff) >> 8 & 0xff00ff)
			   + (i_1285_ << 24));
		    int i_1289_ = 256 - i_1285_;
		    for (/**/; i <= i_1275_; i++) {
			int i_1290_ = i_1274_ >> 16;
			int i_1291_ = i_1290_ - i_1280_;
			if (i_1290_ >= i_1282_ && i_1290_ < i_1283_) {
			    int i_1292_ = i_1279_ + is[i_1291_];
			    if (i >= i_1292_
				&& i < i_1292_ + is_1281_[i_1291_]) {
				int i_1293_
				    = i + i_1290_ * (anInt9494 * -476035351);
				int i_1294_ = anIntArray9466[i_1293_];
				i_1294_
				    = (((i_1294_ & 0xff00) * i_1289_ >> 8
					& 0xff00)
				       + (i_1289_ * (i_1294_ & 0xff00ff) >> 8
					  & 0xff00ff));
				anIntArray9466[i_1293_] = i_1277_ + i_1294_;
			    }
			}
			i_1274_ += i_1284_;
		    }
		} else if (2 == i_1278_) {
		    for (/**/; i <= i_1275_; i++) {
			int i_1295_ = i_1274_ >> 16;
			int i_1296_ = i_1295_ - i_1280_;
			if (i_1295_ >= i_1282_ && i_1295_ < i_1283_) {
			    int i_1297_ = is[i_1296_] + i_1279_;
			    if (i >= i_1297_
				&& i < i_1297_ + is_1281_[i_1296_]) {
				int i_1298_
				    = i + anInt9494 * -476035351 * i_1295_;
				int i_1299_ = anIntArray9466[i_1298_];
				int i_1300_ = i_1277_ + i_1299_;
				int i_1301_ = ((i_1277_ & 0xff00ff)
					       + (i_1299_ & 0xff00ff));
				i_1299_ = ((i_1300_ - i_1301_ & 0x10000)
					   + (i_1301_ & 0x1000100));
				anIntArray9466[i_1298_]
				    = i_1300_ - i_1299_ | i_1299_ - (i_1299_
								     >>> 8);
			    }
			}
			i_1274_ += i_1284_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_1275_ <<= 16;
		int i_1302_
		    = (int) Math.floor((double) i_1275_ / (double) i_1276_
				       + 0.5);
		i_1276_ += i_1274_;
		if (i_1274_ < i_1282_) {
		    i += (i_1282_ - i_1274_) * i_1302_;
		    i_1274_ = i_1282_;
		}
		if (i_1276_ >= i_1283_)
		    i_1276_ = i_1283_ - 1;
		int i_1303_ = i_1277_ >>> 24;
		if (0 == i_1278_ || i_1278_ == 1 && i_1303_ == 255) {
		    for (/**/; i_1274_ <= i_1276_; i_1274_++) {
			int i_1304_ = i >> 16;
			int i_1305_ = i_1274_ - i_1280_;
			int i_1306_ = is[i_1305_] + i_1279_;
			if (i_1304_ >= 1988019027 * anInt9470
			    && i_1304_ < -466178451 * anInt9499
			    && i_1304_ >= i_1306_
			    && i_1304_ < i_1306_ + is_1281_[i_1305_])
			    anIntArray9466[(i_1274_ * (anInt9494 * -476035351)
					    + i_1304_)]
				= i_1277_;
			i += i_1302_;
		    }
		} else if (i_1278_ == 1) {
		    i_1277_ = ((i_1303_ << 24)
			       + ((i_1303_ * (i_1277_ & 0xff00) >> 8 & 0xff00)
				  + (i_1303_ * (i_1277_ & 0xff00ff) >> 8
				     & 0xff00ff)));
		    int i_1307_ = 256 - i_1303_;
		    for (/**/; i_1274_ <= i_1276_; i_1274_++) {
			int i_1308_ = i >> 16;
			int i_1309_ = i_1274_ - i_1280_;
			int i_1310_ = i_1279_ + is[i_1309_];
			if (i_1308_ >= 1988019027 * anInt9470
			    && i_1308_ < -466178451 * anInt9499
			    && i_1308_ >= i_1310_
			    && i_1308_ < i_1310_ + is_1281_[i_1309_]) {
			    int i_1311_
				= anInt9494 * -476035351 * i_1274_ + i_1308_;
			    int i_1312_ = anIntArray9466[i_1311_];
			    i_1312_
				= (((i_1312_ & 0xff00) * i_1307_ >> 8 & 0xff00)
				   + ((i_1312_ & 0xff00ff) * i_1307_ >> 8
				      & 0xff00ff));
			    anIntArray9466[(-476035351 * anInt9494 * i_1274_
					    + i_1308_)]
				= i_1312_ + i_1277_;
			}
			i += i_1302_;
		    }
		} else if (i_1278_ == 2) {
		    for (/**/; i_1274_ <= i_1276_; i_1274_++) {
			int i_1313_ = i >> 16;
			int i_1314_ = i_1274_ - i_1280_;
			int i_1315_ = is[i_1314_] + i_1279_;
			if (i_1313_ >= 1988019027 * anInt9470
			    && i_1313_ < -466178451 * anInt9499
			    && i_1313_ >= i_1315_
			    && i_1313_ < is_1281_[i_1314_] + i_1315_) {
			    int i_1316_
				= i_1313_ + i_1274_ * (-476035351 * anInt9494);
			    int i_1317_ = anIntArray9466[i_1316_];
			    int i_1318_ = i_1277_ + i_1317_;
			    int i_1319_
				= (i_1317_ & 0xff00ff) + (i_1277_ & 0xff00ff);
			    i_1317_
				= (i_1319_ & 0x1000100) + (i_1318_ - i_1319_
							   & 0x10000);
			    anIntArray9466[i_1316_]
				= i_1318_ - i_1317_ | i_1317_ - (i_1317_
								 >>> 8);
			}
			i += i_1302_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Class179 method3505(ModelDecoder class186, int i, int i_1320_,
                               int i_1321_, int i_1322_) {
	return new Class179_Sub2(this, class186, i, i_1321_, i_1322_, i_1320_);
    }
    
    public void method3401() {
	/* empty */
    }
    
    public void method3557(int i, int i_1323_, int i_1324_, int i_1325_,
			   int i_1326_, int i_1327_, Class152 class152,
			   int i_1328_, int i_1329_, int i_1330_, int i_1331_,
			   int i_1332_) {
	if (null != anIntArray9466) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    int[] is = class152_sub1.anIntArray8998;
	    int[] is_1333_ = class152_sub1.anIntArray8997;
	    int i_1334_ = (anInt9472 * 1722112305 > i_1329_
			   ? 1722112305 * anInt9472 : i_1329_);
	    int i_1335_ = (1920901985 * anInt9473 < is.length + i_1329_
			   ? anInt9473 * 1920901985 : i_1329_ + is.length);
	    i_1332_ <<= 8;
	    i_1330_ <<= 8;
	    i_1331_ <<= 8;
	    int i_1336_ = i_1331_ + i_1330_;
	    i_1332_ %= i_1336_;
	    i_1324_ -= i;
	    i_1325_ -= i_1323_;
	    if (i_1324_ + i_1325_ < 0) {
		int i_1337_ = (int) (Math.sqrt((double) (i_1324_ * i_1324_
							 + i_1325_ * i_1325_))
				     * 256.0);
		int i_1338_ = i_1337_ % i_1336_;
		i_1332_ = i_1336_ + i_1330_ - i_1332_ - i_1338_;
		i_1332_ %= i_1336_;
		if (i_1332_ < 0)
		    i_1332_ += i_1336_;
		i += i_1324_;
		i_1324_ = -i_1324_;
		i_1323_ += i_1325_;
		i_1325_ = -i_1325_;
	    }
	    if (i_1324_ > i_1325_) {
		i_1323_ <<= 16;
		i_1323_ += 32768;
		i_1325_ <<= 16;
		int i_1339_ = (int) Math.floor(0.5 + ((double) i_1325_
						      / (double) i_1324_));
		i_1324_ += i;
		int i_1340_ = i_1326_ >>> 24;
		int i_1341_
		    = (int) Math.sqrt((double) (65536
						+ (i_1339_ >> 8) * (i_1339_
								    >> 8)));
		if (0 == i_1327_ || i_1327_ == 1 && i_1340_ == 255) {
		    while (i <= i_1324_) {
			int i_1342_ = i_1323_ >> 16;
			int i_1343_ = i_1342_ - i_1329_;
			if (i >= 1988019027 * anInt9470
			    && i < -466178451 * anInt9499 && i_1342_ >= i_1334_
			    && i_1342_ < i_1335_ && i_1332_ < i_1330_) {
			    int i_1344_ = is[i_1343_] + i_1328_;
			    if (i >= i_1344_
				&& i < i_1344_ + is_1333_[i_1343_])
				anIntArray9466[i_1342_ * (-476035351
							  * anInt9494) + i]
				    = i_1326_;
			}
			i_1323_ += i_1339_;
			i++;
			i_1332_ += i_1341_;
			i_1332_ %= i_1336_;
		    }
		} else if (1 == i_1327_) {
		    i_1326_
			= ((i_1340_ << 24)
			   + ((i_1340_ * (i_1326_ & 0xff00ff) >> 8 & 0xff00ff)
			      + ((i_1326_ & 0xff00) * i_1340_ >> 8 & 0xff00)));
		    int i_1345_ = 256 - i_1340_;
		    while (i <= i_1324_) {
			int i_1346_ = i_1323_ >> 16;
			int i_1347_ = i_1346_ - i_1329_;
			if (i >= 1988019027 * anInt9470
			    && i < anInt9499 * -466178451 && i_1346_ >= i_1334_
			    && i_1346_ < i_1335_ && i_1332_ < i_1330_) {
			    int i_1348_ = i_1328_ + is[i_1347_];
			    if (i >= i_1348_
				&& i < is_1333_[i_1347_] + i_1348_) {
				int i_1349_
				    = i + i_1346_ * (anInt9494 * -476035351);
				int i_1350_ = anIntArray9466[i_1349_];
				i_1350_ = (((i_1350_ & 0xff00ff) * i_1345_ >> 8
					    & 0xff00ff)
					   + (i_1345_ * (i_1350_ & 0xff00) >> 8
					      & 0xff00));
				anIntArray9466[i_1349_] = i_1326_ + i_1350_;
			    }
			}
			i_1323_ += i_1339_;
			i++;
			i_1332_ += i_1341_;
			i_1332_ %= i_1336_;
		    }
		} else if (i_1327_ == 2) {
		    while (i <= i_1324_) {
			int i_1351_ = i_1323_ >> 16;
			int i_1352_ = i_1351_ - i_1329_;
			if (i >= 1988019027 * anInt9470
			    && i < anInt9499 * -466178451 && i_1351_ >= i_1334_
			    && i_1351_ < i_1335_ && i_1332_ < i_1330_) {
			    int i_1353_ = i_1328_ + is[i_1352_];
			    if (i >= i_1353_
				&& i < i_1353_ + is_1333_[i_1352_]) {
				int i_1354_
				    = i + -476035351 * anInt9494 * i_1351_;
				int i_1355_ = anIntArray9466[i_1354_];
				int i_1356_ = i_1326_ + i_1355_;
				int i_1357_ = ((i_1326_ & 0xff00ff)
					       + (i_1355_ & 0xff00ff));
				i_1355_ = ((i_1356_ - i_1357_ & 0x10000)
					   + (i_1357_ & 0x1000100));
				anIntArray9466[i_1354_]
				    = i_1356_ - i_1355_ | i_1355_ - (i_1355_
								     >>> 8);
			    }
			}
			i_1323_ += i_1339_;
			i++;
			i_1332_ += i_1341_;
			i_1332_ %= i_1336_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_1324_ <<= 16;
		int i_1358_
		    = (int) Math.floor((double) i_1324_ / (double) i_1325_
				       + 0.5);
		int i_1359_
		    = (int) Math.sqrt((double) ((i_1358_ >> 8) * (i_1358_ >> 8)
						+ 65536));
		i_1325_ += i_1323_;
		int i_1360_ = i_1326_ >>> 24;
		if (0 == i_1327_ || i_1327_ == 1 && i_1360_ == 255) {
		    while (i_1323_ <= i_1325_) {
			int i_1361_ = i >> 16;
			int i_1362_ = i_1323_ - i_1329_;
			if (i_1323_ >= i_1334_ && i_1323_ < i_1335_
			    && i_1361_ >= 1988019027 * anInt9470
			    && i_1361_ < -466178451 * anInt9499
			    && i_1332_ < i_1330_
			    && i_1361_ >= is[i_1362_] + i_1328_
			    && (i_1361_
				< is[i_1362_] + i_1328_ + is_1333_[i_1362_]))
			    anIntArray9466[i_1361_ + (-476035351 * anInt9494
						      * i_1323_)]
				= i_1326_;
			i += i_1358_;
			i_1323_++;
			i_1332_ += i_1359_;
			i_1332_ %= i_1336_;
		    }
		} else if (i_1327_ == 1) {
		    i_1326_ = ((i_1360_ << 24)
			       + ((i_1360_ * (i_1326_ & 0xff00) >> 8 & 0xff00)
				  + ((i_1326_ & 0xff00ff) * i_1360_ >> 8
				     & 0xff00ff)));
		    int i_1363_ = 256 - i_1360_;
		    while (i_1323_ <= i_1325_) {
			int i_1364_ = i >> 16;
			int i_1365_ = i_1323_ - i_1329_;
			if (i_1323_ >= i_1334_ && i_1323_ < i_1335_
			    && i_1364_ >= 1988019027 * anInt9470
			    && i_1364_ < anInt9499 * -466178451
			    && i_1332_ < i_1330_
			    && i_1364_ >= is[i_1365_] + i_1328_
			    && (i_1364_
				< is[i_1365_] + i_1328_ + is_1333_[i_1365_])) {
			    int i_1366_
				= -476035351 * anInt9494 * i_1323_ + i_1364_;
			    int i_1367_ = anIntArray9466[i_1366_];
			    i_1367_ = ((i_1363_ * (i_1367_ & 0xff00ff) >> 8
					& 0xff00ff)
				       + ((i_1367_ & 0xff00) * i_1363_ >> 8
					  & 0xff00));
			    anIntArray9466[i_1364_ + (-476035351 * anInt9494
						      * i_1323_)]
				= i_1367_ + i_1326_;
			}
			i += i_1358_;
			i_1323_++;
			i_1332_ += i_1359_;
			i_1332_ %= i_1336_;
		    }
		} else if (2 == i_1327_) {
		    while (i_1323_ <= i_1325_) {
			int i_1368_ = i >> 16;
			int i_1369_ = i_1323_ - i_1329_;
			if (i_1323_ >= i_1334_ && i_1323_ < i_1335_
			    && i_1368_ >= 1988019027 * anInt9470
			    && i_1368_ < -466178451 * anInt9499
			    && i_1332_ < i_1330_
			    && i_1368_ >= is[i_1369_] + i_1328_
			    && (i_1368_
				< i_1328_ + is[i_1369_] + is_1333_[i_1369_])) {
			    int i_1370_
				= i_1323_ * (anInt9494 * -476035351) + i_1368_;
			    int i_1371_ = anIntArray9466[i_1370_];
			    int i_1372_ = i_1371_ + i_1326_;
			    int i_1373_
				= (i_1371_ & 0xff00ff) + (i_1326_ & 0xff00ff);
			    i_1371_
				= (i_1373_ & 0x1000100) + (i_1372_ - i_1373_
							   & 0x10000);
			    anIntArray9466[i_1370_]
				= i_1372_ - i_1371_ | i_1371_ - (i_1371_
								 >>> 8);
			}
			i += i_1358_;
			i_1323_++;
			i_1332_ += i_1359_;
			i_1332_ %= i_1336_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Class161 method3581(int i, int i_1374_, int[][] is,
			       int[][] is_1375_, int i_1376_, int i_1377_,
			       int i_1378_) {
	return new Class161_Sub2(this, i_1377_, i_1378_, i, i_1374_, is,
				 is_1375_, i_1376_);
    }
    
    public void method3354() {
	anInt9470 = 0;
	anInt9472 = 0;
	anInt9499 = anInt9494 * -2146140947;
	anInt9473 = anInt9476 * 1139324329;
	method15173();
    }
    
    public Class174 method3438(Class174 class174, Class174 class174_1379_,
			       float f, Class174 class174_1380_) {
	return null;
    }
    
    public void method3150(int i, int i_1381_, int i_1382_, int i_1383_,
			   int i_1384_, int i_1385_, int i_1386_) {
	if (anIntArray9466 != null) {
	    Class110 class110 = method15223(Thread.currentThread());
	    Class128 class128 = class110.aClass128_1338;
	    int i_1387_ = i_1382_ - i;
	    int i_1388_ = i_1383_ - i_1381_;
	    int i_1389_ = i_1387_ >= 0 ? i_1387_ : -i_1387_;
	    int i_1390_ = i_1388_ >= 0 ? i_1388_ : -i_1388_;
	    int i_1391_ = i_1389_;
	    if (i_1391_ < i_1390_)
		i_1391_ = i_1390_;
	    if (i_1391_ != 0) {
		int i_1392_ = (i_1387_ << 16) / i_1391_;
		int i_1393_ = (i_1388_ << 16) / i_1391_;
		i_1387_ += i_1392_ >> 16;
		i_1388_ += i_1393_ >> 16;
		if (i_1393_ <= i_1392_)
		    i_1392_ = -i_1392_;
		else
		    i_1393_ = -i_1393_;
		int i_1394_ = i_1385_ * i_1393_ >> 17;
		int i_1395_ = 1 + i_1393_ * i_1385_ >> 17;
		int i_1396_ = i_1392_ * i_1385_ >> 17;
		int i_1397_ = i_1392_ * i_1385_ + 1 >> 17;
		i -= class128.method2240();
		i_1381_ -= class128.method2272();
		int i_1398_ = i + i_1394_;
		int i_1399_ = i - i_1395_;
		int i_1400_ = i + i_1387_ - i_1395_;
		int i_1401_ = i_1387_ + i + i_1394_;
		int i_1402_ = i_1381_ + i_1396_;
		int i_1403_ = i_1381_ - i_1397_;
		int i_1404_ = i_1388_ + i_1381_ - i_1397_;
		int i_1405_ = i_1396_ + (i_1381_ + i_1388_);
		if (0 == i_1386_)
		    class128.anInt1486 = 0;
		else if (1 == i_1386_)
		    class128.anInt1486 = 255 - (i_1384_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method3235(false);
		class128.aBool1485
		    = (i_1398_ < 0 || i_1398_ > class128.anInt1494
		       || i_1399_ < 0 || i_1399_ > class128.anInt1494
		       || i_1400_ < 0 || i_1400_ > class128.anInt1494);
		class128.method2256(true, false, false, (float) i_1402_,
				    (float) i_1403_, (float) i_1404_,
				    (float) i_1398_, (float) i_1399_,
				    (float) i_1400_, 100.0F, 100.0F, 100.0F,
				    i_1384_);
		class128.aBool1485
		    = (i_1398_ < 0 || i_1398_ > class128.anInt1494
		       || i_1400_ < 0 || i_1400_ > class128.anInt1494
		       || i_1401_ < 0 || i_1401_ > class128.anInt1494);
		class128.method2256(true, false, false, (float) i_1402_,
				    (float) i_1404_, (float) i_1405_,
				    (float) i_1398_, (float) i_1400_,
				    (float) i_1401_, 100.0F, 100.0F, 100.0F,
				    i_1384_);
		method3235(true);
	    }
	}
    }
    
    public int method3415() {
	return 0;
    }
    
    boolean method3205(int i, int i_1406_, int i_1407_, int i_1408_,
		       Class444 class444, Class443 class443) {
	Class435 class435 = method3224();
	class435.method7040(class444);
	class435.method6950(aClass435_9483);
	return class443.method7128(i, i_1406_, i_1407_, i_1408_, class435,
				   aFloat9495, aFloat9492, aFloat9489,
				   aFloat9491);
    }
    
    boolean method3385(int i, int i_1409_, int i_1410_, int i_1411_,
		       Class444 class444, Class443 class443) {
	Class435 class435 = method3224();
	class435.method7040(class444);
	class435.method6950(aClass435_9483);
	return class443.method7128(i, i_1409_, i_1410_, i_1411_, class435,
				   aFloat9495, aFloat9492, aFloat9489,
				   aFloat9491);
    }
    
    public void method3458(Class444 class444, Class211 class211,
			   Class443 class443) {
	Class435 class435 = method3224();
	class435.method7040(class444);
	class435.method6950(aClass435_9483);
	class211.method3929(class443, aClass435_9482, class435, aFloat9495,
			    aFloat9492, aFloat9489, aFloat9491);
    }
    
    public Class525_Sub26 method3209(int i) {
	return null;
    }
    
    public Class525_Sub26 method3388(int i) {
	return null;
    }
    
    public void method3380(int i, int i_1412_, int i_1413_, int i_1414_,
			   int i_1415_, int i_1416_, int i_1417_) {
	if (anIntArray9466 != null) {
	    Class110 class110 = method15223(Thread.currentThread());
	    Class128 class128 = class110.aClass128_1338;
	    int i_1418_ = i_1413_ - i;
	    int i_1419_ = i_1414_ - i_1412_;
	    int i_1420_ = i_1418_ >= 0 ? i_1418_ : -i_1418_;
	    int i_1421_ = i_1419_ >= 0 ? i_1419_ : -i_1419_;
	    int i_1422_ = i_1420_;
	    if (i_1422_ < i_1421_)
		i_1422_ = i_1421_;
	    if (i_1422_ != 0) {
		int i_1423_ = (i_1418_ << 16) / i_1422_;
		int i_1424_ = (i_1419_ << 16) / i_1422_;
		i_1418_ += i_1423_ >> 16;
		i_1419_ += i_1424_ >> 16;
		if (i_1424_ <= i_1423_)
		    i_1423_ = -i_1423_;
		else
		    i_1424_ = -i_1424_;
		int i_1425_ = i_1416_ * i_1424_ >> 17;
		int i_1426_ = 1 + i_1424_ * i_1416_ >> 17;
		int i_1427_ = i_1423_ * i_1416_ >> 17;
		int i_1428_ = i_1423_ * i_1416_ + 1 >> 17;
		i -= class128.method2240();
		i_1412_ -= class128.method2272();
		int i_1429_ = i + i_1425_;
		int i_1430_ = i - i_1426_;
		int i_1431_ = i + i_1418_ - i_1426_;
		int i_1432_ = i_1418_ + i + i_1425_;
		int i_1433_ = i_1412_ + i_1427_;
		int i_1434_ = i_1412_ - i_1428_;
		int i_1435_ = i_1419_ + i_1412_ - i_1428_;
		int i_1436_ = i_1427_ + (i_1412_ + i_1419_);
		if (0 == i_1417_)
		    class128.anInt1486 = 0;
		else if (1 == i_1417_)
		    class128.anInt1486 = 255 - (i_1415_ >>> 24);
		else
		    throw new IllegalArgumentException();
		method3235(false);
		class128.aBool1485
		    = (i_1429_ < 0 || i_1429_ > class128.anInt1494
		       || i_1430_ < 0 || i_1430_ > class128.anInt1494
		       || i_1431_ < 0 || i_1431_ > class128.anInt1494);
		class128.method2256(true, false, false, (float) i_1433_,
				    (float) i_1434_, (float) i_1435_,
				    (float) i_1429_, (float) i_1430_,
				    (float) i_1431_, 100.0F, 100.0F, 100.0F,
				    i_1415_);
		class128.aBool1485
		    = (i_1429_ < 0 || i_1429_ > class128.anInt1494
		       || i_1431_ < 0 || i_1431_ > class128.anInt1494
		       || i_1432_ < 0 || i_1432_ > class128.anInt1494);
		class128.method2256(true, false, false, (float) i_1433_,
				    (float) i_1435_, (float) i_1436_,
				    (float) i_1429_, (float) i_1431_,
				    (float) i_1432_, 100.0F, 100.0F, 100.0F,
				    i_1415_);
		method3235(true);
	    }
	}
    }
    
    public Class157 method3390(int i, int i_1437_, boolean bool,
			       boolean bool_1438_) {
	if (bool)
	    return new Class157_Sub1_Sub3(this, i, i_1437_);
	return new Class157_Sub1_Sub2(this, i, i_1437_);
    }
    
    public Class157 method3391(Class173 class173, boolean bool) {
	int i = class173.method2772();
	int i_1439_ = class173.method2765();
	Class157_Sub1 class157_sub1;
	if (bool && !class173.method2763() && class173.method2762()) {
	    Class173_Sub2 class173_sub2 = (Class173_Sub2) class173;
	    int[] is = new int[class173_sub2.anIntArray9624.length];
	    byte[] is_1440_ = new byte[i * i_1439_];
	    for (int i_1441_ = 0; i_1441_ < i_1439_; i_1441_++) {
		int i_1442_ = i_1441_ * i;
		for (int i_1443_ = 0; i_1443_ < i; i_1443_++)
		    is_1440_[i_1443_ + i_1442_]
			= class173_sub2.aByteArray9622[i_1442_ + i_1443_];
	    }
	    for (int i_1444_ = 0;
		 i_1444_ < class173_sub2.anIntArray9624.length; i_1444_++)
		is[i_1444_] = class173_sub2.anIntArray9624[i_1444_];
	    class157_sub1
		= new Class157_Sub1_Sub1(this, is_1440_, is, i, i_1439_);
	} else {
	    int[] is = class173.method2778(false);
	    if (class173.method2763())
		class157_sub1 = new Class157_Sub1_Sub3(this, is, i, i_1439_);
	    else
		class157_sub1 = new Class157_Sub1_Sub2(this, is, i, i_1439_);
	}
	class157_sub1.method2468(class173.method2766(), class173.method2768(),
				 class173.method2767(), class173.method2769());
	return class157_sub1;
    }
    
    public Class157 method3393(int i, int i_1445_, int i_1446_, int i_1447_,
			       boolean bool) {
	if (null == anIntArray9466)
	    throw new IllegalStateException("");
	int[] is = new int[i_1446_ * i_1447_];
	int i_1448_ = i + i_1445_ * (anInt9494 * -476035351);
	int i_1449_ = -476035351 * anInt9494 - i_1446_;
	for (int i_1450_ = 0; i_1450_ < i_1447_; i_1450_++) {
	    int i_1451_ = i_1446_ * i_1450_;
	    for (int i_1452_ = 0; i_1452_ < i_1446_; i_1452_++)
		is[i_1452_ + i_1451_] = anIntArray9466[i_1448_++];
	    i_1448_ += i_1449_;
	}
	if (bool)
	    return new Class157_Sub1_Sub3(this, is, i_1446_, i_1447_);
	return new Class157_Sub1_Sub2(this, is, i_1446_, i_1447_);
    }
    
    public void method3461() {
	/* empty */
    }
    
    void method3239(int i, int i_1453_, int i_1454_, int i_1455_,
		    int i_1456_) {
	if (anIntArray9466 != null) {
	    if (i_1454_ < 0)
		i_1454_ = -i_1454_;
	    int i_1457_ = i_1453_ - i_1454_;
	    if (i_1457_ < anInt9472 * 1722112305)
		i_1457_ = 1722112305 * anInt9472;
	    int i_1458_ = 1 + (i_1454_ + i_1453_);
	    if (i_1458_ > anInt9473 * 1920901985)
		i_1458_ = 1920901985 * anInt9473;
	    int i_1459_ = i_1457_;
	    int i_1460_ = i_1454_ * i_1454_;
	    int i_1461_ = 0;
	    int i_1462_ = i_1453_ - i_1459_;
	    int i_1463_ = i_1462_ * i_1462_;
	    int i_1464_ = i_1463_ - i_1462_;
	    if (i_1453_ > i_1458_)
		i_1453_ = i_1458_;
	    int i_1465_ = i_1455_ >>> 24;
	    if (i_1456_ == 0 || 1 == i_1456_ && 255 == i_1465_) {
		while (i_1459_ < i_1453_) {
		    for (/**/; i_1464_ <= i_1460_ || i_1463_ <= i_1460_;
			 i_1464_ += i_1461_++ + i_1461_)
			i_1463_ += i_1461_ + i_1461_;
		    int i_1466_ = i - i_1461_ + 1;
		    if (i_1466_ < 1988019027 * anInt9470)
			i_1466_ = anInt9470 * 1988019027;
		    int i_1467_ = i_1461_ + i;
		    if (i_1467_ > -466178451 * anInt9499)
			i_1467_ = anInt9499 * -466178451;
		    int i_1468_ = i_1466_ + anInt9494 * -476035351 * i_1459_;
		    for (int i_1469_ = i_1466_; i_1469_ < i_1467_; i_1469_++)
			anIntArray9466[i_1468_++] = i_1455_;
		    i_1459_++;
		    i_1463_ -= i_1462_-- + i_1462_;
		    i_1464_ -= i_1462_ + i_1462_;
		}
		i_1461_ = i_1454_;
		i_1462_ = i_1459_ - i_1453_;
		i_1464_ = i_1460_ + i_1462_ * i_1462_;
		i_1463_ = i_1464_ - i_1461_;
		i_1464_ -= i_1462_;
		while (i_1459_ < i_1458_) {
		    for (/**/; i_1464_ > i_1460_ && i_1463_ > i_1460_;
			 i_1463_ -= i_1461_ + i_1461_)
			i_1464_ -= i_1461_-- + i_1461_;
		    int i_1470_ = i - i_1461_;
		    if (i_1470_ < 1988019027 * anInt9470)
			i_1470_ = anInt9470 * 1988019027;
		    int i_1471_ = i_1461_ + i;
		    if (i_1471_ > anInt9499 * -466178451 - 1)
			i_1471_ = -466178451 * anInt9499 - 1;
		    int i_1472_ = i_1470_ + anInt9494 * -476035351 * i_1459_;
		    for (int i_1473_ = i_1470_; i_1473_ <= i_1471_; i_1473_++)
			anIntArray9466[i_1472_++] = i_1455_;
		    i_1459_++;
		    i_1464_ += i_1462_ + i_1462_;
		    i_1463_ += i_1462_++ + i_1462_;
		}
	    } else if (1 == i_1456_) {
		i_1455_ = ((i_1465_ << 24)
			   + ((i_1465_ * (i_1455_ & 0xff00ff) >> 8 & 0xff00ff)
			      + (i_1465_ * (i_1455_ & 0xff00) >> 8 & 0xff00)));
		int i_1474_ = 256 - i_1465_;
		while (i_1459_ < i_1453_) {
		    for (/**/; i_1464_ <= i_1460_ || i_1463_ <= i_1460_;
			 i_1464_ += i_1461_++ + i_1461_)
			i_1463_ += i_1461_ + i_1461_;
		    int i_1475_ = i - i_1461_ + 1;
		    if (i_1475_ < 1988019027 * anInt9470)
			i_1475_ = anInt9470 * 1988019027;
		    int i_1476_ = i + i_1461_;
		    if (i_1476_ > -466178451 * anInt9499)
			i_1476_ = anInt9499 * -466178451;
		    int i_1477_ = anInt9494 * -476035351 * i_1459_ + i_1475_;
		    for (int i_1478_ = i_1475_; i_1478_ < i_1476_; i_1478_++) {
			int i_1479_ = anIntArray9466[i_1477_];
			i_1479_
			    = (((i_1479_ & 0xff00ff) * i_1474_ >> 8 & 0xff00ff)
			       + (i_1474_ * (i_1479_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_1477_++] = i_1455_ + i_1479_;
		    }
		    i_1459_++;
		    i_1463_ -= i_1462_-- + i_1462_;
		    i_1464_ -= i_1462_ + i_1462_;
		}
		i_1461_ = i_1454_;
		i_1462_ = -i_1462_;
		i_1464_ = i_1460_ + i_1462_ * i_1462_;
		i_1463_ = i_1464_ - i_1461_;
		i_1464_ -= i_1462_;
		while (i_1459_ < i_1458_) {
		    for (/**/; i_1464_ > i_1460_ && i_1463_ > i_1460_;
			 i_1463_ -= i_1461_ + i_1461_)
			i_1464_ -= i_1461_-- + i_1461_;
		    int i_1480_ = i - i_1461_;
		    if (i_1480_ < anInt9470 * 1988019027)
			i_1480_ = 1988019027 * anInt9470;
		    int i_1481_ = i_1461_ + i;
		    if (i_1481_ > -466178451 * anInt9499 - 1)
			i_1481_ = anInt9499 * -466178451 - 1;
		    int i_1482_ = i_1480_ + -476035351 * anInt9494 * i_1459_;
		    for (int i_1483_ = i_1480_; i_1483_ <= i_1481_;
			 i_1483_++) {
			int i_1484_ = anIntArray9466[i_1482_];
			i_1484_
			    = ((i_1474_ * (i_1484_ & 0xff00ff) >> 8 & 0xff00ff)
			       + (i_1474_ * (i_1484_ & 0xff00) >> 8 & 0xff00));
			anIntArray9466[i_1482_++] = i_1455_ + i_1484_;
		    }
		    i_1459_++;
		    i_1464_ += i_1462_ + i_1462_;
		    i_1463_ += i_1462_++ + i_1462_;
		}
	    } else if (2 == i_1456_) {
		while (i_1459_ < i_1453_) {
		    for (/**/; i_1464_ <= i_1460_ || i_1463_ <= i_1460_;
			 i_1464_ += i_1461_++ + i_1461_)
			i_1463_ += i_1461_ + i_1461_;
		    int i_1485_ = i - i_1461_ + 1;
		    if (i_1485_ < 1988019027 * anInt9470)
			i_1485_ = anInt9470 * 1988019027;
		    int i_1486_ = i_1461_ + i;
		    if (i_1486_ > -466178451 * anInt9499)
			i_1486_ = anInt9499 * -466178451;
		    int i_1487_ = i_1485_ + -476035351 * anInt9494 * i_1459_;
		    for (int i_1488_ = i_1485_; i_1488_ < i_1486_; i_1488_++) {
			int i_1489_ = anIntArray9466[i_1487_];
			int i_1490_ = i_1455_ + i_1489_;
			int i_1491_
			    = (i_1455_ & 0xff00ff) + (i_1489_ & 0xff00ff);
			i_1489_ = (i_1491_ & 0x1000100) + (i_1490_ - i_1491_
							   & 0x10000);
			anIntArray9466[i_1487_++]
			    = i_1490_ - i_1489_ | i_1489_ - (i_1489_ >>> 8);
		    }
		    i_1459_++;
		    i_1463_ -= i_1462_-- + i_1462_;
		    i_1464_ -= i_1462_ + i_1462_;
		}
		i_1461_ = i_1454_;
		i_1462_ = -i_1462_;
		i_1464_ = i_1460_ + i_1462_ * i_1462_;
		i_1463_ = i_1464_ - i_1461_;
		i_1464_ -= i_1462_;
		while (i_1459_ < i_1458_) {
		    for (/**/; i_1464_ > i_1460_ && i_1463_ > i_1460_;
			 i_1463_ -= i_1461_ + i_1461_)
			i_1464_ -= i_1461_-- + i_1461_;
		    int i_1492_ = i - i_1461_;
		    if (i_1492_ < 1988019027 * anInt9470)
			i_1492_ = anInt9470 * 1988019027;
		    int i_1493_ = i_1461_ + i;
		    if (i_1493_ > -466178451 * anInt9499 - 1)
			i_1493_ = -466178451 * anInt9499 - 1;
		    int i_1494_ = i_1492_ + -476035351 * anInt9494 * i_1459_;
		    for (int i_1495_ = i_1492_; i_1495_ <= i_1493_;
			 i_1495_++) {
			int i_1496_ = anIntArray9466[i_1494_];
			int i_1497_ = i_1496_ + i_1455_;
			int i_1498_
			    = (i_1496_ & 0xff00ff) + (i_1455_ & 0xff00ff);
			i_1496_
			    = (i_1497_ - i_1498_ & 0x10000) + (i_1498_
							       & 0x1000100);
			anIntArray9466[i_1494_++]
			    = i_1497_ - i_1496_ | i_1496_ - (i_1496_ >>> 8);
		    }
		    i_1459_++;
		    i_1464_ += i_1462_ + i_1462_;
		    i_1463_ += i_1462_++ + i_1462_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public Class157 method3395(int i, int i_1499_, int i_1500_, int i_1501_,
			       boolean bool) {
	if (null == anIntArray9466)
	    throw new IllegalStateException("");
	int[] is = new int[i_1500_ * i_1501_];
	int i_1502_ = i + i_1499_ * (anInt9494 * -476035351);
	int i_1503_ = -476035351 * anInt9494 - i_1500_;
	for (int i_1504_ = 0; i_1504_ < i_1501_; i_1504_++) {
	    int i_1505_ = i_1500_ * i_1504_;
	    for (int i_1506_ = 0; i_1506_ < i_1500_; i_1506_++)
		is[i_1506_ + i_1505_] = anIntArray9466[i_1502_++];
	    i_1502_ += i_1503_;
	}
	if (bool)
	    return new Class157_Sub1_Sub3(this, is, i_1500_, i_1501_);
	return new Class157_Sub1_Sub2(this, is, i_1500_, i_1501_);
    }
    
    public Class525_Sub21 method3417(int i, int i_1507_, int i_1508_,
				     int i_1509_, int i_1510_, float f) {
	return null;
    }
    
    public Class152 method3397(int i, int i_1511_, int[] is, int[] is_1512_) {
	return new Class152_Sub1(i, i_1511_, is, is_1512_);
    }
    
    public boolean method3139() {
	return false;
    }
    
    public void method3387(int i, Class152 class152, int i_1513_,
			   int i_1514_) {
	if (anIntArray9466 != null) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    int[] is = class152_sub1.anIntArray8998;
	    int[] is_1515_ = class152_sub1.anIntArray8997;
	    int i_1516_;
	    if (anInt9473 * 1920901985 < i_1514_ + is.length)
		i_1516_ = anInt9473 * 1920901985 - i_1514_;
	    else
		i_1516_ = is.length;
	    int i_1517_;
	    if (1722112305 * anInt9472 > i_1514_) {
		i_1517_ = anInt9472 * 1722112305 - i_1514_;
		i_1514_ = 1722112305 * anInt9472;
	    } else
		i_1517_ = 0;
	    if (i_1516_ - i_1517_ > 0) {
		int i_1518_ = i_1514_ * (-476035351 * anInt9494);
		for (int i_1519_ = i_1517_; i_1519_ < i_1516_; i_1519_++) {
		    int i_1520_ = is[i_1519_] + i_1513_;
		    int i_1521_ = is_1515_[i_1519_];
		    if (1988019027 * anInt9470 > i_1520_) {
			i_1521_ -= 1988019027 * anInt9470 - i_1520_;
			i_1520_ = 1988019027 * anInt9470;
		    }
		    if (-466178451 * anInt9499 < i_1520_ + i_1521_)
			i_1521_ = -466178451 * anInt9499 - i_1520_;
		    i_1520_ += i_1518_;
		    for (int i_1522_ = -i_1521_; i_1522_ < 0; i_1522_++)
			anIntArray9466[i_1520_++] = i;
		    i_1518_ += anInt9494 * -476035351;
		}
	    }
	}
    }
    
    int method15209(int i) {
	return (aClass180_1944.method3116(i, -1431554601).bitLoad
		* 2082667437);
    }
    
    public Class175 method3288(Class7 class7, Class173[] class173s,
			       boolean bool) {
	int[] is = new int[class173s.length];
	int[] is_1523_ = new int[class173s.length];
	boolean bool_1524_ = false;
	boolean bool_1525_ = false;
	for (int i = 0; i < class173s.length; i++) {
	    is[i] = class173s[i].method2772();
	    is_1523_[i] = class173s[i].method2765();
	    if (class173s[i].method2763())
		bool_1524_ = true;
	    if (class173s[i].method2762())
		bool_1525_ = true;
	}
	if (bool) {
	    if (bool_1525_) {
		if (bool_1524_)
		    return new Class175_Sub2(this, class7,
					     (Class173_Sub2[]) class173s, is,
					     is_1523_);
		return new Class175_Sub5(this, class7,
					 (Class173_Sub2[]) class173s, is,
					 is_1523_);
	    }
	    if (bool_1524_)
		return new Class175_Sub2(this, class7,
					 (Class173_Sub1[]) class173s, is,
					 is_1523_);
	    return new Class175_Sub5(this, class7, (Class173_Sub1[]) class173s,
				     is, is_1523_);
	}
	if (bool_1525_) {
	    if (bool_1524_)
		throw new IllegalArgumentException("");
	    return new Class175_Sub4(this, class7, (Class173_Sub2[]) class173s,
				     is, is_1523_);
	}
	return new Class175_Sub1(this, class7, (Class173_Sub1[]) class173s, is,
				 is_1523_);
    }
    
    public Class525_Sub21 method3418(int i, int i_1526_, int i_1527_,
				     int i_1528_, int i_1529_, float f) {
	return null;
    }
    
    public void method3469(int i) {
	Class179_Sub2.anInt9366 = Class179_Sub2.anInt9365 = i;
	if (anInt9481 * -1098456669 > 1)
	    throw new IllegalStateException();
	method15179(anInt9481 * -1098456669);
	method15174(0);
    }
    
    public void method3329(int i) {
	Class179_Sub2.anInt9366 = Class179_Sub2.anInt9365 = i;
	if (anInt9481 * -1098456669 > 1)
	    throw new IllegalStateException();
	method15179(anInt9481 * -1098456669);
	method15174(0);
    }
    
    public void method3486(int i) {
	Class179_Sub2.anInt9366 = Class179_Sub2.anInt9365 = i;
	if (anInt9481 * -1098456669 > 1)
	    throw new IllegalStateException();
	method15179(anInt9481 * -1098456669);
	method15174(0);
    }
    
    void method3260(float f, float f_1530_, float f_1531_, float f_1532_,
		    float f_1533_, float f_1534_) {
	/* empty */
    }
    
    public int method3407(int i, int i_1535_) {
	i |= 0x20800;
	return i & i_1535_ ^ i_1535_;
    }
    
    void method15210(int i, int i_1536_, int i_1537_, int i_1538_, int i_1539_,
		     int i_1540_, int i_1541_, int i_1542_) {
	if (anIntArray9466 != null && (i_1536_ >= 1722112305 * anInt9472
				       && i_1536_ < anInt9473 * 1920901985)) {
	    int i_1543_ = i + -476035351 * anInt9494 * i_1536_;
	    int i_1544_ = i_1538_ >>> 24;
	    int i_1545_ = i_1541_ + i_1540_;
	    int i_1546_ = i_1542_ % i_1545_;
	    if (i_1539_ == 0 || i_1539_ == 1 && i_1544_ == 255) {
		int i_1547_ = 0;
		while (i_1547_ < i_1537_) {
		    if (i + i_1547_ >= 1988019027 * anInt9470
			&& i + i_1547_ < -466178451 * anInt9499
			&& i_1546_ < i_1540_)
			anIntArray9466[i_1543_ + i_1547_] = i_1538_;
		    i_1547_++;
		    i_1546_ = ++i_1546_ % i_1545_;
		}
	    } else if (1 == i_1539_) {
		i_1538_ = (((i_1538_ & 0xff00ff) * i_1544_ >> 8 & 0xff00ff)
			   + ((i_1538_ & 0xff00) * i_1544_ >> 8 & 0xff00)
			   + (i_1544_ << 24));
		int i_1548_ = 256 - i_1544_;
		int i_1549_ = 0;
		while (i_1549_ < i_1537_) {
		    if (i_1549_ + i >= anInt9470 * 1988019027
			&& i_1549_ + i < anInt9499 * -466178451
			&& i_1546_ < i_1540_) {
			int i_1550_ = anIntArray9466[i_1543_ + i_1549_];
			i_1550_ = (((i_1550_ & 0xff00) * i_1548_ >> 8 & 0xff00)
				   + (i_1548_ * (i_1550_ & 0xff00ff) >> 8
				      & 0xff00ff));
			anIntArray9466[i_1549_ + i_1543_] = i_1538_ + i_1550_;
		    }
		    i_1549_++;
		    i_1546_ = ++i_1546_ % i_1545_;
		}
	    } else if (2 == i_1539_) {
		int i_1551_ = 0;
		while (i_1551_ < i_1537_) {
		    if (i + i_1551_ >= anInt9470 * 1988019027
			&& i + i_1551_ < anInt9499 * -466178451
			&& i_1546_ < i_1540_) {
			int i_1552_ = anIntArray9466[i_1551_ + i_1543_];
			int i_1553_ = i_1538_ + i_1552_;
			int i_1554_
			    = (i_1552_ & 0xff00ff) + (i_1538_ & 0xff00ff);
			i_1552_ = (i_1554_ & 0x1000100) + (i_1553_ - i_1554_
							   & 0x10000);
			anIntArray9466[i_1551_ + i_1543_]
			    = i_1553_ - i_1552_ | i_1552_ - (i_1552_ >>> 8);
		    }
		    i_1551_++;
		    i_1546_ = ++i_1546_ % i_1545_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public Class161 method3203(int i, int i_1555_, int[][] is,
			       int[][] is_1556_, int i_1557_, int i_1558_,
			       int i_1559_) {
	return new Class161_Sub2(this, i_1558_, i_1559_, i, i_1555_, is,
				 is_1556_, i_1557_);
    }
    
    public Class161 method3585(int i, int i_1560_, int[][] is,
			       int[][] is_1561_, int i_1562_, int i_1563_,
			       int i_1564_) {
	return new Class161_Sub2(this, i_1563_, i_1564_, i, i_1560_, is,
				 is_1561_, i_1562_);
    }
    
    public Class161 method3375(int i, int i_1565_, int[][] is,
			       int[][] is_1566_, int i_1567_, int i_1568_,
			       int i_1569_) {
	return new Class161_Sub2(this, i_1568_, i_1569_, i, i_1565_, is,
				 is_1566_, i_1567_);
    }
    
    public Class435 method3463() {
	Class110 class110 = method15223(Thread.currentThread());
	return class110.aClass435_1336;
    }
    
    public Class444 method3413() {
	Class110 class110 = method15223(Thread.currentThread());
	return class110.aClass444_1368;
    }
    
    public Class444 method3529() {
	Class110 class110 = method15223(Thread.currentThread());
	return class110.aClass444_1368;
    }
    
    public void method3257(int i, int i_1570_, int i_1571_, int i_1572_) {
	if (anInt9470 * 1988019027 < i)
	    anInt9470 = i * 838891739;
	if (1722112305 * anInt9472 < i_1570_)
	    anInt9472 = i_1570_ * -348561455;
	if (anInt9499 * -466178451 > i_1571_)
	    anInt9499 = 1771604837 * i_1571_;
	if (anInt9473 * 1920901985 > i_1572_)
	    anInt9473 = i_1572_ * -2023538527;
	method15173();
    }
    
    public int method3416() {
	return 0;
    }
    
    public void method3132() {
	/* empty */
    }
    
    public void method3252(Class435 class435) {
	aClass435_9482.method6947(class435);
	method15181();
    }
    
    public void method3419(int i, Class525_Sub21[] class525_sub21s) {
	/* empty */
    }
    
    public Class157 method3553(Class173 class173, boolean bool) {
	int i = class173.method2772();
	int i_1573_ = class173.method2765();
	Class157_Sub1 class157_sub1;
	if (bool && !class173.method2763() && class173.method2762()) {
	    Class173_Sub2 class173_sub2 = (Class173_Sub2) class173;
	    int[] is = new int[class173_sub2.anIntArray9624.length];
	    byte[] is_1574_ = new byte[i * i_1573_];
	    for (int i_1575_ = 0; i_1575_ < i_1573_; i_1575_++) {
		int i_1576_ = i_1575_ * i;
		for (int i_1577_ = 0; i_1577_ < i; i_1577_++)
		    is_1574_[i_1577_ + i_1576_]
			= class173_sub2.aByteArray9622[i_1576_ + i_1577_];
	    }
	    for (int i_1578_ = 0;
		 i_1578_ < class173_sub2.anIntArray9624.length; i_1578_++)
		is[i_1578_] = class173_sub2.anIntArray9624[i_1578_];
	    class157_sub1
		= new Class157_Sub1_Sub1(this, is_1574_, is, i, i_1573_);
	} else {
	    int[] is = class173.method2778(false);
	    if (class173.method2763())
		class157_sub1 = new Class157_Sub1_Sub3(this, is, i, i_1573_);
	    else
		class157_sub1 = new Class157_Sub1_Sub2(this, is, i, i_1573_);
	}
	class157_sub1.method2468(class173.method2766(), class173.method2768(),
				 class173.method2767(), class173.method2769());
	return class157_sub1;
    }
    
    public void method3370(int i) {
	int i_1579_ = i - 284847091 * anInt9464;
	for (Class525_Sub17 class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3796(-464640280);
	     class525_sub17 != null;
	     class525_sub17
		 = (Class525_Sub17) aClass200_9497.method3818(-939006220)) {
	    if (class525_sub17.aBool10558) {
		class525_sub17.anInt10555 += i_1579_;
		int i_1580_ = class525_sub17.anInt10555 / 50;
		if (i_1580_ > 0) {
		    TextureMetrics class166
			= aClass180_1944.method3116(class525_sub17.anInt10560,
						    -1431554601);
		    float f = (float) (class166.bitLoad * 2082667437);
		    class525_sub17.method16272
			((int) ((float) class166.aByte1805
				* ((float) i_1579_ / 1000.0F) / 64.0F * f),
			 (int) (f * ((float) class166.aByte1806
				     * ((float) i_1579_ / 1000.0F) / 64.0F)));
		    class525_sub17.anInt10555 -= 50 * i_1580_;
		}
		class525_sub17.aBool10558 = false;
	    }
	}
	anInt9464 = -11197125 * i;
	aClass200_9490.method3805(5, 1990323187);
	aClass200_9497.method3805(5, 2070276176);
    }
    
    public Class179 method3556(ModelDecoder class186, int i, int i_1581_,
                               int i_1582_, int i_1583_) {
	return new Class179_Sub2(this, class186, i, i_1582_, i_1583_, i_1581_);
    }
    
    void method15211(int i) {
	anInt9481 = i * 1873500683;
	aClass110Array9496 = new Class110[anInt9481 * -1098456669];
	for (int i_1584_ = 0; i_1584_ < anInt9481 * -1098456669; i_1584_++)
	    aClass110Array9496[i_1584_] = new Class110(this);
    }
    
    Class110 method15212(Runnable runnable) {
	for (int i = 0; i < anInt9481 * -1098456669; i++) {
	    if (aClass110Array9496[i].aRunnable1363 == runnable)
		return aClass110Array9496[i];
	}
	return null;
    }
    
    public void method3434(int i, Class152 class152, int i_1585_,
			   int i_1586_) {
	if (anIntArray9466 != null) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    int[] is = class152_sub1.anIntArray8998;
	    int[] is_1587_ = class152_sub1.anIntArray8997;
	    int i_1588_;
	    if (anInt9473 * 1920901985 < i_1586_ + is.length)
		i_1588_ = anInt9473 * 1920901985 - i_1586_;
	    else
		i_1588_ = is.length;
	    int i_1589_;
	    if (1722112305 * anInt9472 > i_1586_) {
		i_1589_ = anInt9472 * 1722112305 - i_1586_;
		i_1586_ = 1722112305 * anInt9472;
	    } else
		i_1589_ = 0;
	    if (i_1588_ - i_1589_ > 0) {
		int i_1590_ = i_1586_ * (-476035351 * anInt9494);
		for (int i_1591_ = i_1589_; i_1591_ < i_1588_; i_1591_++) {
		    int i_1592_ = is[i_1591_] + i_1585_;
		    int i_1593_ = is_1587_[i_1591_];
		    if (1988019027 * anInt9470 > i_1592_) {
			i_1593_ -= 1988019027 * anInt9470 - i_1592_;
			i_1592_ = 1988019027 * anInt9470;
		    }
		    if (-466178451 * anInt9499 < i_1592_ + i_1593_)
			i_1593_ = -466178451 * anInt9499 - i_1592_;
		    i_1592_ += i_1590_;
		    for (int i_1594_ = -i_1593_; i_1594_ < 0; i_1594_++)
			anIntArray9466[i_1592_++] = i;
		    i_1590_ += anInt9494 * -476035351;
		}
	    }
	}
    }
    
    public boolean method3462() {
	return false;
    }
    
    void method15213(boolean bool, boolean bool_1595_, boolean bool_1596_,
		     Class185 class185) {
	Class110 class110 = method15223(Thread.currentThread());
	for (Class531_Sub5_Sub1 class531_sub5_sub1
		 = ((Class531_Sub5_Sub1)
		    class185.aClass698_2081.method14217(34161));
	     null != class531_sub5_sub1;
	     class531_sub5_sub1
		 = ((Class531_Sub5_Sub1)
		    class185.aClass698_2081.method14221(-642344633))) {
	    int i = class531_sub5_sub1.anInt11731 >> 12;
	    int i_1597_ = class531_sub5_sub1.anInt11729 >> 12;
	    int i_1598_ = class531_sub5_sub1.anInt11730 >> 12;
	    float f
		= ((float) i_1598_ * aClass435_9483.aFloatArray4830[10]
		   + (aClass435_9483.aFloatArray4830[2] * (float) i
		      + aClass435_9483.aFloatArray4830[6] * (float) i_1597_)
		   + aClass435_9483.aFloatArray4830[14]);
	    float f_1599_
		= (aClass435_9483.aFloatArray4830[15]
		   + (aClass435_9483.aFloatArray4830[11] * (float) i_1598_
		      + ((float) i * aClass435_9483.aFloatArray4830[3]
			 + ((float) i_1597_
			    * aClass435_9483.aFloatArray4830[7]))));
	    if (!(f < -f_1599_)) {
		float f_1600_ = aFloat9498 + f * aFloat9480 / f_1599_;
		if (!(f > class110.aFloat1328)) {
		    float f_1601_
			= (aClass435_9483.aFloatArray4830[12]
			   + ((float) i * aClass435_9483.aFloatArray4830[0]
			      + ((float) i_1597_
				 * aClass435_9483.aFloatArray4830[4])
			      + (aClass435_9483.aFloatArray4830[8]
				 * (float) i_1598_)));
		    float f_1602_
			= ((float) i_1598_ * aClass435_9483.aFloatArray4830[9]
			   + ((aClass435_9483.aFloatArray4830[5]
			       * (float) i_1597_)
			      + aClass435_9483.aFloatArray4830[1] * (float) i)
			   + aClass435_9483.aFloatArray4830[13]);
		    if (!(f_1601_ < -f_1599_) && !(f_1601_ > f_1599_)
			&& !(f_1602_ < -f_1599_) && !(f_1602_ > f_1599_)) {
			float f_1603_
			    = (float) class531_sub5_sub1.anInt11734 / 4096.0F;
			float f_1604_
			    = (aClass435_9482.aFloatArray4830[0] * f_1603_
			       + f_1601_);
			float f_1605_
			    = (f_1603_ * aClass435_9482.aFloatArray4830[3]
			       + f_1599_);
			float f_1606_
			    = aFloat9495 + f_1601_ * aFloat9489 / f_1599_;
			float f_1607_
			    = f_1602_ * aFloat9491 / f_1599_ + aFloat9492;
			float f_1608_
			    = aFloat9495 + aFloat9489 * f_1604_ / f_1605_;
			method15197(bool, bool_1595_, bool_1596_,
				    class531_sub5_sub1, (int) f_1606_,
				    (int) f_1607_, f_1600_,
				    (int) (f_1608_ < f_1606_
					   ? f_1606_ - f_1608_
					   : f_1608_ - f_1606_));
		    }
		}
	    }
	}
    }
    
    void method15214(boolean bool, boolean bool_1609_, boolean bool_1610_,
		     Class185 class185) {
	Class110 class110 = method15223(Thread.currentThread());
	for (Class531_Sub5_Sub1 class531_sub5_sub1
		 = ((Class531_Sub5_Sub1)
		    class185.aClass698_2081.method14217(34161));
	     null != class531_sub5_sub1;
	     class531_sub5_sub1
		 = ((Class531_Sub5_Sub1)
		    class185.aClass698_2081.method14221(164655065))) {
	    int i = class531_sub5_sub1.anInt11731 >> 12;
	    int i_1611_ = class531_sub5_sub1.anInt11729 >> 12;
	    int i_1612_ = class531_sub5_sub1.anInt11730 >> 12;
	    float f
		= ((float) i_1612_ * aClass435_9483.aFloatArray4830[10]
		   + (aClass435_9483.aFloatArray4830[2] * (float) i
		      + aClass435_9483.aFloatArray4830[6] * (float) i_1611_)
		   + aClass435_9483.aFloatArray4830[14]);
	    float f_1613_
		= (aClass435_9483.aFloatArray4830[15]
		   + (aClass435_9483.aFloatArray4830[11] * (float) i_1612_
		      + ((float) i * aClass435_9483.aFloatArray4830[3]
			 + ((float) i_1611_
			    * aClass435_9483.aFloatArray4830[7]))));
	    if (!(f < -f_1613_)) {
		float f_1614_ = aFloat9498 + f * aFloat9480 / f_1613_;
		if (!(f > class110.aFloat1328)) {
		    float f_1615_
			= (aClass435_9483.aFloatArray4830[12]
			   + ((float) i * aClass435_9483.aFloatArray4830[0]
			      + ((float) i_1611_
				 * aClass435_9483.aFloatArray4830[4])
			      + (aClass435_9483.aFloatArray4830[8]
				 * (float) i_1612_)));
		    float f_1616_
			= ((float) i_1612_ * aClass435_9483.aFloatArray4830[9]
			   + ((aClass435_9483.aFloatArray4830[5]
			       * (float) i_1611_)
			      + aClass435_9483.aFloatArray4830[1] * (float) i)
			   + aClass435_9483.aFloatArray4830[13]);
		    if (!(f_1615_ < -f_1613_) && !(f_1615_ > f_1613_)
			&& !(f_1616_ < -f_1613_) && !(f_1616_ > f_1613_)) {
			float f_1617_
			    = (float) class531_sub5_sub1.anInt11734 / 4096.0F;
			float f_1618_
			    = (aClass435_9482.aFloatArray4830[0] * f_1617_
			       + f_1615_);
			float f_1619_
			    = (f_1617_ * aClass435_9482.aFloatArray4830[3]
			       + f_1613_);
			float f_1620_
			    = aFloat9495 + f_1615_ * aFloat9489 / f_1613_;
			float f_1621_
			    = f_1616_ * aFloat9491 / f_1613_ + aFloat9492;
			float f_1622_
			    = aFloat9495 + aFloat9489 * f_1618_ / f_1619_;
			method15197(bool, bool_1609_, bool_1610_,
				    class531_sub5_sub1, (int) f_1620_,
				    (int) f_1621_, f_1614_,
				    (int) (f_1622_ < f_1620_
					   ? f_1620_ - f_1622_
					   : f_1622_ - f_1620_));
		    }
		}
	    }
	}
    }
    
    public int[] method3541() {
	return null;
    }
    
    void method15215(boolean bool, boolean bool_1623_, boolean bool_1624_,
		     Class531_Sub5_Sub1 class531_sub5_sub1, int i, int i_1625_,
		     float f, int i_1626_) {
	int i_1627_ = class531_sub5_sub1.anInt11735;
	int i_1628_ = i_1626_;
	i_1626_ <<= 1;
	if (i_1627_ == -1)
	    method15180(bool_1623_, i, i_1625_, f, i_1628_,
			class531_sub5_sub1.anInt11737, 1);
	else {
	    if (-197284279 * anInt9500 != i_1627_) {
		Class157 class157
		    = (Class157) aClass200_9490.method3785((long) i_1627_);
		if (class157 == null) {
		    TextureMetrics class166
			= aClass180_1944.method3116(i_1627_, -1431554601);
		    int[] is = method15165(i_1627_);
		    if (is != null) {
			int i_1629_ = class166.bitLoad * 2082667437;
			class157 = method3215(is, 0, i_1629_, i_1629_, i_1629_,
					      (byte) 95);
			aClass200_9490.method3788(class157, (long) i_1627_);
		    } else
			return;
		}
		anInt9500 = i_1627_ * -1648253959;
		aClass157_9493 = class157;
	    }
	    i_1626_++;
	    ((Class157_Sub1) aClass157_9493).method14537
		(bool, bool_1623_, bool_1624_, i - i_1628_, i_1625_ - i_1628_,
		 f, i_1626_, i_1626_, 0, class531_sub5_sub1.anInt11737, 1, 1,
		 false);
	}
    }
    
    public int method3242() {
	return 0;
    }
    
    void method15216(boolean bool, int i, int i_1630_, float f, int i_1631_,
		     int i_1632_, int i_1633_) {
	if (anIntArray9466 != null) {
	    if (i_1631_ < 0)
		i_1631_ = -i_1631_;
	    int i_1634_ = i_1630_ - i_1631_;
	    if (i_1634_ < 1722112305 * anInt9472)
		i_1634_ = 1722112305 * anInt9472;
	    int i_1635_ = 1 + (i_1630_ + i_1631_);
	    if (i_1635_ > anInt9473 * 1920901985)
		i_1635_ = 1920901985 * anInt9473;
	    int i_1636_ = i_1634_;
	    int i_1637_ = i_1631_ * i_1631_;
	    int i_1638_ = 0;
	    int i_1639_ = i_1630_ - i_1636_;
	    int i_1640_ = i_1639_ * i_1639_;
	    int i_1641_ = i_1640_ - i_1639_;
	    if (i_1630_ > i_1635_)
		i_1630_ = i_1635_;
	    int i_1642_ = i_1632_ >>> 24;
	    if (0 == i_1633_ || i_1633_ == 1 && i_1642_ == 255) {
		while (i_1636_ < i_1630_) {
		    for (/**/; i_1641_ <= i_1637_ || i_1640_ <= i_1637_;
			 i_1641_ += i_1638_++ + i_1638_)
			i_1640_ += i_1638_ + i_1638_;
		    int i_1643_ = 1 + (i - i_1638_);
		    if (i_1643_ < anInt9470 * 1988019027)
			i_1643_ = 1988019027 * anInt9470;
		    int i_1644_ = i + i_1638_;
		    if (i_1644_ > anInt9499 * -466178451)
			i_1644_ = anInt9499 * -466178451;
		    int i_1645_ = i_1643_ + i_1636_ * (anInt9494 * -476035351);
		    for (int i_1646_ = i_1643_; i_1646_ < i_1644_; i_1646_++) {
			if (!bool || f < aFloatArray9469[i_1645_])
			    anIntArray9466[i_1645_] = i_1632_;
			i_1645_++;
		    }
		    i_1636_++;
		    i_1640_ -= i_1639_-- + i_1639_;
		    i_1641_ -= i_1639_ + i_1639_;
		}
		i_1638_ = i_1631_;
		i_1639_ = i_1636_ - i_1630_;
		i_1641_ = i_1639_ * i_1639_ + i_1637_;
		i_1640_ = i_1641_ - i_1638_;
		i_1641_ -= i_1639_;
		while (i_1636_ < i_1635_) {
		    for (/**/; i_1641_ > i_1637_ && i_1640_ > i_1637_;
			 i_1640_ -= i_1638_ + i_1638_)
			i_1641_ -= i_1638_-- + i_1638_;
		    int i_1647_ = i - i_1638_;
		    if (i_1647_ < 1988019027 * anInt9470)
			i_1647_ = 1988019027 * anInt9470;
		    int i_1648_ = i + i_1638_;
		    if (i_1648_ > -466178451 * anInt9499 - 1)
			i_1648_ = anInt9499 * -466178451 - 1;
		    int i_1649_ = i_1647_ + i_1636_ * (-476035351 * anInt9494);
		    for (int i_1650_ = i_1647_; i_1650_ <= i_1648_;
			 i_1650_++) {
			if (!bool || f < aFloatArray9469[i_1649_])
			    anIntArray9466[i_1649_] = i_1632_;
			i_1649_++;
		    }
		    i_1636_++;
		    i_1641_ += i_1639_ + i_1639_;
		    i_1640_ += i_1639_++ + i_1639_;
		}
	    } else if (1 == i_1633_) {
		i_1632_ = (((i_1632_ & 0xff00) * i_1642_ >> 8 & 0xff00)
			   + ((i_1632_ & 0xff00ff) * i_1642_ >> 8 & 0xff00ff)
			   + (i_1642_ << 24));
		int i_1651_ = 256 - i_1642_;
		while (i_1636_ < i_1630_) {
		    for (/**/; i_1641_ <= i_1637_ || i_1640_ <= i_1637_;
			 i_1641_ += i_1638_++ + i_1638_)
			i_1640_ += i_1638_ + i_1638_;
		    int i_1652_ = i - i_1638_ + 1;
		    if (i_1652_ < 1988019027 * anInt9470)
			i_1652_ = anInt9470 * 1988019027;
		    int i_1653_ = i_1638_ + i;
		    if (i_1653_ > anInt9499 * -466178451)
			i_1653_ = -466178451 * anInt9499;
		    int i_1654_ = i_1652_ + anInt9494 * -476035351 * i_1636_;
		    for (int i_1655_ = i_1652_; i_1655_ < i_1653_; i_1655_++) {
			if (!bool || f < aFloatArray9469[i_1654_]) {
			    int i_1656_ = anIntArray9466[i_1654_];
			    i_1656_
				= (((i_1656_ & 0xff00) * i_1651_ >> 8 & 0xff00)
				   + (i_1651_ * (i_1656_ & 0xff00ff) >> 8
				      & 0xff00ff));
			    anIntArray9466[i_1654_] = i_1656_ + i_1632_;
			}
			i_1654_++;
		    }
		    i_1636_++;
		    i_1640_ -= i_1639_-- + i_1639_;
		    i_1641_ -= i_1639_ + i_1639_;
		}
		i_1638_ = i_1631_;
		i_1639_ = -i_1639_;
		i_1641_ = i_1637_ + i_1639_ * i_1639_;
		i_1640_ = i_1641_ - i_1638_;
		i_1641_ -= i_1639_;
		while (i_1636_ < i_1635_) {
		    for (/**/; i_1641_ > i_1637_ && i_1640_ > i_1637_;
			 i_1640_ -= i_1638_ + i_1638_)
			i_1641_ -= i_1638_-- + i_1638_;
		    int i_1657_ = i - i_1638_;
		    if (i_1657_ < anInt9470 * 1988019027)
			i_1657_ = anInt9470 * 1988019027;
		    int i_1658_ = i + i_1638_;
		    if (i_1658_ > anInt9499 * -466178451 - 1)
			i_1658_ = -466178451 * anInt9499 - 1;
		    int i_1659_ = anInt9494 * -476035351 * i_1636_ + i_1657_;
		    for (int i_1660_ = i_1657_; i_1660_ <= i_1658_;
			 i_1660_++) {
			if (!bool || f < aFloatArray9469[i_1659_]) {
			    int i_1661_ = anIntArray9466[i_1659_];
			    i_1661_
				= (((i_1661_ & 0xff00) * i_1651_ >> 8 & 0xff00)
				   + ((i_1661_ & 0xff00ff) * i_1651_ >> 8
				      & 0xff00ff));
			    anIntArray9466[i_1659_] = i_1632_ + i_1661_;
			}
			i_1659_++;
		    }
		    i_1636_++;
		    i_1641_ += i_1639_ + i_1639_;
		    i_1640_ += i_1639_++ + i_1639_;
		}
	    } else if (i_1633_ == 2) {
		while (i_1636_ < i_1630_) {
		    for (/**/; i_1641_ <= i_1637_ || i_1640_ <= i_1637_;
			 i_1641_ += i_1638_++ + i_1638_)
			i_1640_ += i_1638_ + i_1638_;
		    int i_1662_ = i - i_1638_ + 1;
		    if (i_1662_ < 1988019027 * anInt9470)
			i_1662_ = 1988019027 * anInt9470;
		    int i_1663_ = i_1638_ + i;
		    if (i_1663_ > -466178451 * anInt9499)
			i_1663_ = anInt9499 * -466178451;
		    int i_1664_ = i_1636_ * (anInt9494 * -476035351) + i_1662_;
		    for (int i_1665_ = i_1662_; i_1665_ < i_1663_; i_1665_++) {
			if (!bool || f < aFloatArray9469[i_1664_]) {
			    int i_1666_ = anIntArray9466[i_1664_];
			    int i_1667_ = i_1632_ + i_1666_;
			    int i_1668_
				= (i_1632_ & 0xff00ff) + (i_1666_ & 0xff00ff);
			    i_1666_
				= (i_1668_ & 0x1000100) + (i_1667_ - i_1668_
							   & 0x10000);
			    anIntArray9466[i_1664_]
				= i_1667_ - i_1666_ | i_1666_ - (i_1666_
								 >>> 8);
			}
			i_1664_++;
		    }
		    i_1636_++;
		    i_1640_ -= i_1639_-- + i_1639_;
		    i_1641_ -= i_1639_ + i_1639_;
		}
		i_1638_ = i_1631_;
		i_1639_ = -i_1639_;
		i_1641_ = i_1637_ + i_1639_ * i_1639_;
		i_1640_ = i_1641_ - i_1638_;
		i_1641_ -= i_1639_;
		while (i_1636_ < i_1635_) {
		    for (/**/; i_1641_ > i_1637_ && i_1640_ > i_1637_;
			 i_1640_ -= i_1638_ + i_1638_)
			i_1641_ -= i_1638_-- + i_1638_;
		    int i_1669_ = i - i_1638_;
		    if (i_1669_ < 1988019027 * anInt9470)
			i_1669_ = anInt9470 * 1988019027;
		    int i_1670_ = i_1638_ + i;
		    if (i_1670_ > -466178451 * anInt9499 - 1)
			i_1670_ = anInt9499 * -466178451 - 1;
		    int i_1671_ = i_1669_ + -476035351 * anInt9494 * i_1636_;
		    for (int i_1672_ = i_1669_; i_1672_ <= i_1670_;
			 i_1672_++) {
			if (!bool || f < aFloatArray9469[i_1671_]) {
			    int i_1673_ = anIntArray9466[i_1671_];
			    int i_1674_ = i_1673_ + i_1632_;
			    int i_1675_
				= (i_1632_ & 0xff00ff) + (i_1673_ & 0xff00ff);
			    i_1673_ = ((i_1674_ - i_1675_ & 0x10000)
				       + (i_1675_ & 0x1000100));
			    anIntArray9466[i_1671_]
				= i_1674_ - i_1673_ | i_1673_ - (i_1673_
								 >>> 8);
			}
			i_1671_++;
		    }
		    i_1636_++;
		    i_1641_ += i_1639_ + i_1639_;
		    i_1640_ += i_1639_++ + i_1639_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    void method15217(boolean bool, int i, int i_1676_, float f, int i_1677_,
		     int i_1678_, int i_1679_) {
	if (anIntArray9466 != null) {
	    if (i_1677_ < 0)
		i_1677_ = -i_1677_;
	    int i_1680_ = i_1676_ - i_1677_;
	    if (i_1680_ < 1722112305 * anInt9472)
		i_1680_ = 1722112305 * anInt9472;
	    int i_1681_ = 1 + (i_1676_ + i_1677_);
	    if (i_1681_ > anInt9473 * 1920901985)
		i_1681_ = 1920901985 * anInt9473;
	    int i_1682_ = i_1680_;
	    int i_1683_ = i_1677_ * i_1677_;
	    int i_1684_ = 0;
	    int i_1685_ = i_1676_ - i_1682_;
	    int i_1686_ = i_1685_ * i_1685_;
	    int i_1687_ = i_1686_ - i_1685_;
	    if (i_1676_ > i_1681_)
		i_1676_ = i_1681_;
	    int i_1688_ = i_1678_ >>> 24;
	    if (0 == i_1679_ || i_1679_ == 1 && i_1688_ == 255) {
		while (i_1682_ < i_1676_) {
		    for (/**/; i_1687_ <= i_1683_ || i_1686_ <= i_1683_;
			 i_1687_ += i_1684_++ + i_1684_)
			i_1686_ += i_1684_ + i_1684_;
		    int i_1689_ = 1 + (i - i_1684_);
		    if (i_1689_ < anInt9470 * 1988019027)
			i_1689_ = 1988019027 * anInt9470;
		    int i_1690_ = i + i_1684_;
		    if (i_1690_ > anInt9499 * -466178451)
			i_1690_ = anInt9499 * -466178451;
		    int i_1691_ = i_1689_ + i_1682_ * (anInt9494 * -476035351);
		    for (int i_1692_ = i_1689_; i_1692_ < i_1690_; i_1692_++) {
			if (!bool || f < aFloatArray9469[i_1691_])
			    anIntArray9466[i_1691_] = i_1678_;
			i_1691_++;
		    }
		    i_1682_++;
		    i_1686_ -= i_1685_-- + i_1685_;
		    i_1687_ -= i_1685_ + i_1685_;
		}
		i_1684_ = i_1677_;
		i_1685_ = i_1682_ - i_1676_;
		i_1687_ = i_1685_ * i_1685_ + i_1683_;
		i_1686_ = i_1687_ - i_1684_;
		i_1687_ -= i_1685_;
		while (i_1682_ < i_1681_) {
		    for (/**/; i_1687_ > i_1683_ && i_1686_ > i_1683_;
			 i_1686_ -= i_1684_ + i_1684_)
			i_1687_ -= i_1684_-- + i_1684_;
		    int i_1693_ = i - i_1684_;
		    if (i_1693_ < 1988019027 * anInt9470)
			i_1693_ = 1988019027 * anInt9470;
		    int i_1694_ = i + i_1684_;
		    if (i_1694_ > -466178451 * anInt9499 - 1)
			i_1694_ = anInt9499 * -466178451 - 1;
		    int i_1695_ = i_1693_ + i_1682_ * (-476035351 * anInt9494);
		    for (int i_1696_ = i_1693_; i_1696_ <= i_1694_;
			 i_1696_++) {
			if (!bool || f < aFloatArray9469[i_1695_])
			    anIntArray9466[i_1695_] = i_1678_;
			i_1695_++;
		    }
		    i_1682_++;
		    i_1687_ += i_1685_ + i_1685_;
		    i_1686_ += i_1685_++ + i_1685_;
		}
	    } else if (1 == i_1679_) {
		i_1678_ = (((i_1678_ & 0xff00) * i_1688_ >> 8 & 0xff00)
			   + ((i_1678_ & 0xff00ff) * i_1688_ >> 8 & 0xff00ff)
			   + (i_1688_ << 24));
		int i_1697_ = 256 - i_1688_;
		while (i_1682_ < i_1676_) {
		    for (/**/; i_1687_ <= i_1683_ || i_1686_ <= i_1683_;
			 i_1687_ += i_1684_++ + i_1684_)
			i_1686_ += i_1684_ + i_1684_;
		    int i_1698_ = i - i_1684_ + 1;
		    if (i_1698_ < 1988019027 * anInt9470)
			i_1698_ = anInt9470 * 1988019027;
		    int i_1699_ = i_1684_ + i;
		    if (i_1699_ > anInt9499 * -466178451)
			i_1699_ = -466178451 * anInt9499;
		    int i_1700_ = i_1698_ + anInt9494 * -476035351 * i_1682_;
		    for (int i_1701_ = i_1698_; i_1701_ < i_1699_; i_1701_++) {
			if (!bool || f < aFloatArray9469[i_1700_]) {
			    int i_1702_ = anIntArray9466[i_1700_];
			    i_1702_
				= (((i_1702_ & 0xff00) * i_1697_ >> 8 & 0xff00)
				   + (i_1697_ * (i_1702_ & 0xff00ff) >> 8
				      & 0xff00ff));
			    anIntArray9466[i_1700_] = i_1702_ + i_1678_;
			}
			i_1700_++;
		    }
		    i_1682_++;
		    i_1686_ -= i_1685_-- + i_1685_;
		    i_1687_ -= i_1685_ + i_1685_;
		}
		i_1684_ = i_1677_;
		i_1685_ = -i_1685_;
		i_1687_ = i_1683_ + i_1685_ * i_1685_;
		i_1686_ = i_1687_ - i_1684_;
		i_1687_ -= i_1685_;
		while (i_1682_ < i_1681_) {
		    for (/**/; i_1687_ > i_1683_ && i_1686_ > i_1683_;
			 i_1686_ -= i_1684_ + i_1684_)
			i_1687_ -= i_1684_-- + i_1684_;
		    int i_1703_ = i - i_1684_;
		    if (i_1703_ < anInt9470 * 1988019027)
			i_1703_ = anInt9470 * 1988019027;
		    int i_1704_ = i + i_1684_;
		    if (i_1704_ > anInt9499 * -466178451 - 1)
			i_1704_ = -466178451 * anInt9499 - 1;
		    int i_1705_ = anInt9494 * -476035351 * i_1682_ + i_1703_;
		    for (int i_1706_ = i_1703_; i_1706_ <= i_1704_;
			 i_1706_++) {
			if (!bool || f < aFloatArray9469[i_1705_]) {
			    int i_1707_ = anIntArray9466[i_1705_];
			    i_1707_
				= (((i_1707_ & 0xff00) * i_1697_ >> 8 & 0xff00)
				   + ((i_1707_ & 0xff00ff) * i_1697_ >> 8
				      & 0xff00ff));
			    anIntArray9466[i_1705_] = i_1678_ + i_1707_;
			}
			i_1705_++;
		    }
		    i_1682_++;
		    i_1687_ += i_1685_ + i_1685_;
		    i_1686_ += i_1685_++ + i_1685_;
		}
	    } else if (i_1679_ == 2) {
		while (i_1682_ < i_1676_) {
		    for (/**/; i_1687_ <= i_1683_ || i_1686_ <= i_1683_;
			 i_1687_ += i_1684_++ + i_1684_)
			i_1686_ += i_1684_ + i_1684_;
		    int i_1708_ = i - i_1684_ + 1;
		    if (i_1708_ < 1988019027 * anInt9470)
			i_1708_ = 1988019027 * anInt9470;
		    int i_1709_ = i_1684_ + i;
		    if (i_1709_ > -466178451 * anInt9499)
			i_1709_ = anInt9499 * -466178451;
		    int i_1710_ = i_1682_ * (anInt9494 * -476035351) + i_1708_;
		    for (int i_1711_ = i_1708_; i_1711_ < i_1709_; i_1711_++) {
			if (!bool || f < aFloatArray9469[i_1710_]) {
			    int i_1712_ = anIntArray9466[i_1710_];
			    int i_1713_ = i_1678_ + i_1712_;
			    int i_1714_
				= (i_1678_ & 0xff00ff) + (i_1712_ & 0xff00ff);
			    i_1712_
				= (i_1714_ & 0x1000100) + (i_1713_ - i_1714_
							   & 0x10000);
			    anIntArray9466[i_1710_]
				= i_1713_ - i_1712_ | i_1712_ - (i_1712_
								 >>> 8);
			}
			i_1710_++;
		    }
		    i_1682_++;
		    i_1686_ -= i_1685_-- + i_1685_;
		    i_1687_ -= i_1685_ + i_1685_;
		}
		i_1684_ = i_1677_;
		i_1685_ = -i_1685_;
		i_1687_ = i_1683_ + i_1685_ * i_1685_;
		i_1686_ = i_1687_ - i_1684_;
		i_1687_ -= i_1685_;
		while (i_1682_ < i_1681_) {
		    for (/**/; i_1687_ > i_1683_ && i_1686_ > i_1683_;
			 i_1686_ -= i_1684_ + i_1684_)
			i_1687_ -= i_1684_-- + i_1684_;
		    int i_1715_ = i - i_1684_;
		    if (i_1715_ < 1988019027 * anInt9470)
			i_1715_ = anInt9470 * 1988019027;
		    int i_1716_ = i_1684_ + i;
		    if (i_1716_ > -466178451 * anInt9499 - 1)
			i_1716_ = anInt9499 * -466178451 - 1;
		    int i_1717_ = i_1715_ + -476035351 * anInt9494 * i_1682_;
		    for (int i_1718_ = i_1715_; i_1718_ <= i_1716_;
			 i_1718_++) {
			if (!bool || f < aFloatArray9469[i_1717_]) {
			    int i_1719_ = anIntArray9466[i_1717_];
			    int i_1720_ = i_1719_ + i_1678_;
			    int i_1721_
				= (i_1678_ & 0xff00ff) + (i_1719_ & 0xff00ff);
			    i_1719_ = ((i_1720_ - i_1721_ & 0x10000)
				       + (i_1721_ & 0x1000100));
			    anIntArray9466[i_1717_]
				= i_1720_ - i_1719_ | i_1719_ - (i_1719_
								 >>> 8);
			}
			i_1717_++;
		    }
		    i_1682_++;
		    i_1687_ += i_1685_ + i_1685_;
		    i_1686_ += i_1685_++ + i_1685_;
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public void method3307(int i, float f, float f_1722_, float f_1723_,
			   float f_1724_, float f_1725_) {
	anInt9463 = -1599142575 * (int) (65535.0F * f);
	anInt9478 = (int) (f_1722_ * 65535.0F) * 845202011;
	float f_1726_
	    = (float) Math.sqrt((double) (f_1723_ * f_1723_ + f_1724_ * f_1724_
					  + f_1725_ * f_1725_));
	anInt9474 = (int) (f_1723_ * 65535.0F / f_1726_) * -416042509;
	anInt9475 = 818849719 * (int) (f_1724_ * 65535.0F / f_1726_);
	anInt9468 = (int) (65535.0F * f_1725_ / f_1726_) * -1887473201;
    }
    
    public void method3503(Class444 class444) {
	aClass444_9471 = class444;
	method15181();
    }
    
    public Class444 method3549() {
	return new Class444(aClass444_9471);
    }
    
    public Class444 method3392() {
	return new Class444(aClass444_9471);
    }
    
    public Class444 method3425() {
	return new Class444(aClass444_9471);
    }
    
    public void method3426(Class435 class435) {
	aClass435_9482.method6947(class435);
	method15181();
    }
    
    public Class174 method3246(Class174 class174, Class174 class174_1727_,
			       float f, Class174 class174_1728_) {
	return null;
    }
    
    public void method3428(Class435 class435) {
	aClass435_9482.method6947(class435);
	method15181();
    }
    
    public void method3294(int[] is) {
	is[0] = -476035351 * anInt9494;
	is[1] = -1845137399 * anInt9476;
    }
    
    public Class435 method3172() {
	return new Class435(aClass435_9482);
    }
    
    public Class435 method3251() {
	return new Class435(aClass435_9482);
    }
    
    public void method3432(float f) {
	anInt9479 = -1172985841 * (int) (65535.0F * f);
    }
    
    public void method3140(int i, int i_1729_, int i_1730_) {
	for (int i_1731_ = 0; i_1731_ < aClass110Array9496.length; i_1731_++) {
	    Class110 class110 = aClass110Array9496[i_1731_];
	    class110.anInt1330 = 1497980251 * (i & 0xffffff);
	    int i_1732_ = 296717011 * class110.anInt1330 >>> 16 & 0xff;
	    if (i_1732_ < 2)
		i_1732_ = 2;
	    int i_1733_ = class110.anInt1330 * 296717011 >> 8 & 0xff;
	    if (i_1733_ < 2)
		i_1733_ = 2;
	    int i_1734_ = class110.anInt1330 * 296717011 & 0xff;
	    if (i_1734_ < 2)
		i_1734_ = 2;
	    class110.anInt1330
		= 1497980251 * (i_1732_ << 16 | i_1733_ << 8 | i_1734_);
	    if (i_1729_ < 0)
		class110.aBool1369 = false;
	    else
		class110.aBool1369 = true;
	}
    }
    
    public void method3269(boolean bool) {
	/* empty */
    }
    
    public void method3180(int i) {
	/* empty */
    }
    
    public void method3211(Class525_Sub26 class525_sub26) {
	/* empty */
    }
    
    void method15218() {
	aClass435_9467.method7040(aClass444_9471);
	aClass435_9483.method6947(aClass435_9467);
	aClass435_9483.method6950(aClass435_9482);
	aClass435_9483.method7061(aFloatArrayArray9484[0]);
	aClass435_9483.method6972(aFloatArrayArray9484[1]);
	aClass435_9483.method6967(aFloatArrayArray9484[2]);
	aClass435_9483.method6968(aFloatArrayArray9484[3]);
	aClass435_9483.method6969(aFloatArrayArray9484[4]);
	aClass435_9483.method6970(aFloatArrayArray9484[5]);
	float f = aClass435_9482.method7041();
	float f_1735_ = (aClass435_9482.aFloatArray4830[14]
			 + aClass435_9482.aFloatArray4830[10] * (f - 255.0F));
	float f_1736_ = (aClass435_9482.aFloatArray4830[14]
			 + aClass435_9482.aFloatArray4830[10] * f);
	float f_1737_ = f_1736_ - f_1735_;
	for (int i = 0; i < -1098456669 * anInt9481; i++) {
	    Class110 class110 = aClass110Array9496[i];
	    class110.aFloat1328 = f_1735_;
	    class110.aFloat1329 = f_1737_;
	}
    }
    
    void method15219() {
	aClass435_9467.method7040(aClass444_9471);
	aClass435_9483.method6947(aClass435_9467);
	aClass435_9483.method6950(aClass435_9482);
	aClass435_9483.method7061(aFloatArrayArray9484[0]);
	aClass435_9483.method6972(aFloatArrayArray9484[1]);
	aClass435_9483.method6967(aFloatArrayArray9484[2]);
	aClass435_9483.method6968(aFloatArrayArray9484[3]);
	aClass435_9483.method6969(aFloatArrayArray9484[4]);
	aClass435_9483.method6970(aFloatArrayArray9484[5]);
	float f = aClass435_9482.method7041();
	float f_1738_ = (aClass435_9482.aFloatArray4830[14]
			 + aClass435_9482.aFloatArray4830[10] * (f - 255.0F));
	float f_1739_ = (aClass435_9482.aFloatArray4830[14]
			 + aClass435_9482.aFloatArray4830[10] * f);
	float f_1740_ = f_1739_ - f_1738_;
	for (int i = 0; i < -1098456669 * anInt9481; i++) {
	    Class110 class110 = aClass110Array9496[i];
	    class110.aFloat1328 = f_1738_;
	    class110.aFloat1329 = f_1740_;
	}
    }
    
    void method15220() {
	aClass435_9467.method7040(aClass444_9471);
	aClass435_9483.method6947(aClass435_9467);
	aClass435_9483.method6950(aClass435_9482);
	aClass435_9483.method7061(aFloatArrayArray9484[0]);
	aClass435_9483.method6972(aFloatArrayArray9484[1]);
	aClass435_9483.method6967(aFloatArrayArray9484[2]);
	aClass435_9483.method6968(aFloatArrayArray9484[3]);
	aClass435_9483.method6969(aFloatArrayArray9484[4]);
	aClass435_9483.method6970(aFloatArrayArray9484[5]);
	float f = aClass435_9482.method7041();
	float f_1741_ = (aClass435_9482.aFloatArray4830[14]
			 + aClass435_9482.aFloatArray4830[10] * (f - 255.0F));
	float f_1742_ = (aClass435_9482.aFloatArray4830[14]
			 + aClass435_9482.aFloatArray4830[10] * f);
	float f_1743_ = f_1742_ - f_1741_;
	for (int i = 0; i < -1098456669 * anInt9481; i++) {
	    Class110 class110 = aClass110Array9496[i];
	    class110.aFloat1328 = f_1741_;
	    class110.aFloat1329 = f_1743_;
	}
    }
    
    public Class174 method3437(int i) {
	return null;
    }
    
    boolean method15221(int i) {
	TextureMetrics class166 = aClass180_1944.method3116(i, -1431554601);
	return anInterface24_1943.method130(Class593.aClass593_7831, i,
					    Class594.aClass594_7833, 0.7F,
					    2082667437 * class166.bitLoad,
					    class166.bitLoad * 2082667437,
					    true, (byte) 125);
    }
    
    public Class174 method3439(Class174 class174, Class174 class174_1744_,
			       float f, Class174 class174_1745_) {
	return null;
    }
    
    public void method3440(Class174 class174) {
	/* empty */
    }
    
    public void method3421(Class185 class185) {
	method15229(null != anIntArray9466, null != aFloatArray9469, false,
		    class185);
    }
    
    void method15222(int i) {
	aClass110Array9496[i].method1956(Thread.currentThread(), 996572751);
    }
    
    public boolean method3443() {
	return false;
    }
    
    public void method3400(int i, Class152 class152, int i_1746_,
			   int i_1747_) {
	if (anIntArray9466 != null) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    int[] is = class152_sub1.anIntArray8998;
	    int[] is_1748_ = class152_sub1.anIntArray8997;
	    int i_1749_;
	    if (anInt9473 * 1920901985 < i_1747_ + is.length)
		i_1749_ = anInt9473 * 1920901985 - i_1747_;
	    else
		i_1749_ = is.length;
	    int i_1750_;
	    if (1722112305 * anInt9472 > i_1747_) {
		i_1750_ = anInt9472 * 1722112305 - i_1747_;
		i_1747_ = 1722112305 * anInt9472;
	    } else
		i_1750_ = 0;
	    if (i_1749_ - i_1750_ > 0) {
		int i_1751_ = i_1747_ * (-476035351 * anInt9494);
		for (int i_1752_ = i_1750_; i_1752_ < i_1749_; i_1752_++) {
		    int i_1753_ = is[i_1752_] + i_1746_;
		    int i_1754_ = is_1748_[i_1752_];
		    if (1988019027 * anInt9470 > i_1753_) {
			i_1754_ -= 1988019027 * anInt9470 - i_1753_;
			i_1753_ = 1988019027 * anInt9470;
		    }
		    if (-466178451 * anInt9499 < i_1753_ + i_1754_)
			i_1754_ = -466178451 * anInt9499 - i_1753_;
		    i_1753_ += i_1751_;
		    for (int i_1755_ = -i_1754_; i_1755_ < 0; i_1755_++)
			anIntArray9466[i_1753_++] = i;
		    i_1751_ += anInt9494 * -476035351;
		}
	    }
	}
    }
    
    public boolean method3445() {
	return false;
    }
    
    public boolean method3446() {
	return false;
    }
    
    public void method3247(Class174 class174) {
	/* empty */
    }
    
    public Class435 method3429() {
	return new Class435(aClass435_9482);
    }
    
    public void method3449(float f, float f_1756_, float f_1757_,
			   float f_1758_, float f_1759_) {
	/* empty */
    }
    
    Class110 method15223(Runnable runnable) {
	for (int i = 0; i < anInt9481 * -1098456669; i++) {
	    if (aClass110Array9496[i].aRunnable1363 == runnable)
		return aClass110Array9496[i];
	}
	return null;
    }
    
    public boolean method3451() {
	return false;
    }
    
    public boolean method3452() {
	return false;
    }
    
    public void method3453(Class169 class169, float f, Class169 class169_1760_,
			   float f_1761_, Class169 class169_1762_,
			   float f_1763_) {
	/* empty */
    }
    
    public void method3475(Class169 class169, float f, Class169 class169_1764_,
			   float f_1765_, Class169 class169_1766_,
			   float f_1767_) {
	/* empty */
    }
    
    public boolean method3145() {
	return false;
    }
    
    public void method3263() {
	for (int i = 0; i < aClass110Array9496.length; i++) {
	    aClass110Array9496[i].anInt1330
		= 76470071 * aClass110Array9496[i].anInt1331;
	    aClass110Array9496[i].aBool1332 = false;
	}
    }
    
    public boolean method3568() {
	return false;
    }
    
    public boolean method3378() {
	return false;
    }
    
    public void method3459() {
	/* empty */
    }
    
    Interface21 method15224(int i, int i_1768_) {
	return new Class97(i, i_1768_);
    }
    
    public int method3286() {
	return 0;
    }
    
    public void method3202(int i, int i_1769_, int i_1770_, int i_1771_,
			   int i_1772_, int i_1773_, Class152 class152,
			   int i_1774_, int i_1775_) {
	if (anIntArray9466 != null) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    int[] is = class152_sub1.anIntArray8998;
	    int[] is_1776_ = class152_sub1.anIntArray8997;
	    int i_1777_ = (1722112305 * anInt9472 > i_1775_
			   ? anInt9472 * 1722112305 : i_1775_);
	    int i_1778_ = (1920901985 * anInt9473 < i_1775_ + is.length
			   ? 1920901985 * anInt9473 : is.length + i_1775_);
	    i_1770_ -= i;
	    i_1771_ -= i_1769_;
	    if (i_1770_ + i_1771_ < 0) {
		i += i_1770_;
		i_1770_ = -i_1770_;
		i_1769_ += i_1771_;
		i_1771_ = -i_1771_;
	    }
	    if (i_1770_ > i_1771_) {
		i_1769_ <<= 16;
		i_1769_ += 32768;
		i_1771_ <<= 16;
		int i_1779_
		    = (int) Math.floor((double) i_1771_ / (double) i_1770_
				       + 0.5);
		i_1770_ += i;
		if (i < 1988019027 * anInt9470) {
		    i_1769_ += (1988019027 * anInt9470 - i) * i_1779_;
		    i = 1988019027 * anInt9470;
		}
		if (i_1770_ >= anInt9499 * -466178451)
		    i_1770_ = anInt9499 * -466178451 - 1;
		int i_1780_ = i_1772_ >>> 24;
		if (0 == i_1773_ || 1 == i_1773_ && 255 == i_1780_) {
		    for (/**/; i <= i_1770_; i++) {
			int i_1781_ = i_1769_ >> 16;
			int i_1782_ = i_1781_ - i_1775_;
			if (i_1781_ >= i_1777_ && i_1781_ < i_1778_) {
			    int i_1783_ = i_1774_ + is[i_1782_];
			    if (i >= i_1783_
				&& i < is_1776_[i_1782_] + i_1783_)
				anIntArray9466
				    [-476035351 * anInt9494 * i_1781_ + i]
				    = i_1772_;
			}
			i_1769_ += i_1779_;
		    }
		} else if (1 == i_1773_) {
		    i_1772_
			= (((i_1772_ & 0xff00) * i_1780_ >> 8 & 0xff00)
			   + (i_1780_ * (i_1772_ & 0xff00ff) >> 8 & 0xff00ff)
			   + (i_1780_ << 24));
		    int i_1784_ = 256 - i_1780_;
		    for (/**/; i <= i_1770_; i++) {
			int i_1785_ = i_1769_ >> 16;
			int i_1786_ = i_1785_ - i_1775_;
			if (i_1785_ >= i_1777_ && i_1785_ < i_1778_) {
			    int i_1787_ = i_1774_ + is[i_1786_];
			    if (i >= i_1787_
				&& i < i_1787_ + is_1776_[i_1786_]) {
				int i_1788_
				    = i + i_1785_ * (anInt9494 * -476035351);
				int i_1789_ = anIntArray9466[i_1788_];
				i_1789_
				    = (((i_1789_ & 0xff00) * i_1784_ >> 8
					& 0xff00)
				       + (i_1784_ * (i_1789_ & 0xff00ff) >> 8
					  & 0xff00ff));
				anIntArray9466[i_1788_] = i_1772_ + i_1789_;
			    }
			}
			i_1769_ += i_1779_;
		    }
		} else if (2 == i_1773_) {
		    for (/**/; i <= i_1770_; i++) {
			int i_1790_ = i_1769_ >> 16;
			int i_1791_ = i_1790_ - i_1775_;
			if (i_1790_ >= i_1777_ && i_1790_ < i_1778_) {
			    int i_1792_ = is[i_1791_] + i_1774_;
			    if (i >= i_1792_
				&& i < i_1792_ + is_1776_[i_1791_]) {
				int i_1793_
				    = i + anInt9494 * -476035351 * i_1790_;
				int i_1794_ = anIntArray9466[i_1793_];
				int i_1795_ = i_1772_ + i_1794_;
				int i_1796_ = ((i_1772_ & 0xff00ff)
					       + (i_1794_ & 0xff00ff));
				i_1794_ = ((i_1795_ - i_1796_ & 0x10000)
					   + (i_1796_ & 0x1000100));
				anIntArray9466[i_1793_]
				    = i_1795_ - i_1794_ | i_1794_ - (i_1794_
								     >>> 8);
			    }
			}
			i_1769_ += i_1779_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_1770_ <<= 16;
		int i_1797_
		    = (int) Math.floor((double) i_1770_ / (double) i_1771_
				       + 0.5);
		i_1771_ += i_1769_;
		if (i_1769_ < i_1777_) {
		    i += (i_1777_ - i_1769_) * i_1797_;
		    i_1769_ = i_1777_;
		}
		if (i_1771_ >= i_1778_)
		    i_1771_ = i_1778_ - 1;
		int i_1798_ = i_1772_ >>> 24;
		if (0 == i_1773_ || i_1773_ == 1 && i_1798_ == 255) {
		    for (/**/; i_1769_ <= i_1771_; i_1769_++) {
			int i_1799_ = i >> 16;
			int i_1800_ = i_1769_ - i_1775_;
			int i_1801_ = is[i_1800_] + i_1774_;
			if (i_1799_ >= 1988019027 * anInt9470
			    && i_1799_ < -466178451 * anInt9499
			    && i_1799_ >= i_1801_
			    && i_1799_ < i_1801_ + is_1776_[i_1800_])
			    anIntArray9466[(i_1769_ * (anInt9494 * -476035351)
					    + i_1799_)]
				= i_1772_;
			i += i_1797_;
		    }
		} else if (i_1773_ == 1) {
		    i_1772_ = ((i_1798_ << 24)
			       + ((i_1798_ * (i_1772_ & 0xff00) >> 8 & 0xff00)
				  + (i_1798_ * (i_1772_ & 0xff00ff) >> 8
				     & 0xff00ff)));
		    int i_1802_ = 256 - i_1798_;
		    for (/**/; i_1769_ <= i_1771_; i_1769_++) {
			int i_1803_ = i >> 16;
			int i_1804_ = i_1769_ - i_1775_;
			int i_1805_ = i_1774_ + is[i_1804_];
			if (i_1803_ >= 1988019027 * anInt9470
			    && i_1803_ < -466178451 * anInt9499
			    && i_1803_ >= i_1805_
			    && i_1803_ < i_1805_ + is_1776_[i_1804_]) {
			    int i_1806_
				= anInt9494 * -476035351 * i_1769_ + i_1803_;
			    int i_1807_ = anIntArray9466[i_1806_];
			    i_1807_
				= (((i_1807_ & 0xff00) * i_1802_ >> 8 & 0xff00)
				   + ((i_1807_ & 0xff00ff) * i_1802_ >> 8
				      & 0xff00ff));
			    anIntArray9466[(-476035351 * anInt9494 * i_1769_
					    + i_1803_)]
				= i_1807_ + i_1772_;
			}
			i += i_1797_;
		    }
		} else if (i_1773_ == 2) {
		    for (/**/; i_1769_ <= i_1771_; i_1769_++) {
			int i_1808_ = i >> 16;
			int i_1809_ = i_1769_ - i_1775_;
			int i_1810_ = is[i_1809_] + i_1774_;
			if (i_1808_ >= 1988019027 * anInt9470
			    && i_1808_ < -466178451 * anInt9499
			    && i_1808_ >= i_1810_
			    && i_1808_ < is_1776_[i_1809_] + i_1810_) {
			    int i_1811_
				= i_1808_ + i_1769_ * (-476035351 * anInt9494);
			    int i_1812_ = anIntArray9466[i_1811_];
			    int i_1813_ = i_1772_ + i_1812_;
			    int i_1814_
				= (i_1812_ & 0xff00ff) + (i_1772_ & 0xff00ff);
			    i_1812_
				= (i_1814_ & 0x1000100) + (i_1813_ - i_1814_
							   & 0x10000);
			    anIntArray9466[i_1811_]
				= i_1813_ - i_1812_ | i_1812_ - (i_1812_
								 >>> 8);
			}
			i += i_1797_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public void method3337() {
	/* empty */
    }
    
    public boolean method3464() {
	return false;
    }
    
    void method3264(float f, float f_1815_, float f_1816_, float f_1817_,
		    float f_1818_, float f_1819_) {
	/* empty */
    }
    
    public void method3238(int i) {
	/* empty */
    }
    
    void method3467(float f, float f_1820_, float f_1821_, float f_1822_,
		    float f_1823_, float f_1824_) {
	/* empty */
    }
    
    public Class168_Sub2 method3314() {
	return new Class168_Sub2_Sub1(this);
    }
    
    public void method3379(int i, Class176 class176) {
	Class110 class110 = method15223(Thread.currentThread());
	class110.anInt1362 = -1334076343 * i;
	class110.anInt1330 = class176.anInt1877 * 38100277;
	class110.anInt1361 = class176.anInt1879 * 1852975569;
    }
    
    public void method3470(int i, Class176 class176) {
	Class110 class110 = method15223(Thread.currentThread());
	class110.anInt1362 = -1334076343 * i;
	class110.anInt1330 = class176.anInt1877 * 38100277;
	class110.anInt1361 = class176.anInt1879 * 1852975569;
    }
    
    public void method3460() {
	/* empty */
    }
    
    public void method3221(float f, float f_1825_, float f_1826_,
			   float f_1827_, float f_1828_) {
	/* empty */
    }
    
    public void method3473() {
	for (int i = 0; i < aClass110Array9496.length; i++) {
	    aClass110Array9496[i].anInt1330
		= 76470071 * aClass110Array9496[i].anInt1331;
	    aClass110Array9496[i].aBool1332 = false;
	}
    }
    
    public void method3411() {
	for (int i = 0; i < aClass110Array9496.length; i++) {
	    aClass110Array9496[i].anInt1330
		= 76470071 * aClass110Array9496[i].anInt1331;
	    aClass110Array9496[i].aBool1332 = false;
	}
    }
    
    public void method3155() {
	for (int i = 0; i < aClass110Array9496.length; i++) {
	    aClass110Array9496[i].anInt1330
		= 76470071 * aClass110Array9496[i].anInt1331;
	    aClass110Array9496[i].aBool1332 = false;
	}
    }
    
    public Class168_Sub2 method3319() {
	return new Class168_Sub2_Sub1(this);
    }
    
    public void method3477(int i, int i_1829_, float f, int i_1830_,
			   int i_1831_, float f_1832_, int i_1833_,
			   int i_1834_, float f_1835_, int i_1836_,
			   int i_1837_, int i_1838_, int i_1839_) {
	boolean bool = anIntArray9466 != null;
	boolean bool_1840_ = null != aFloatArray9469;
	if (bool || bool_1840_) {
	    Class110 class110 = method15223(Thread.currentThread());
	    Class128 class128 = class110.aClass128_1338;
	    class128.aBool1482 = false;
	    i -= 1988019027 * anInt9470;
	    i_1830_ -= anInt9470 * 1988019027;
	    i_1833_ -= 1988019027 * anInt9470;
	    i_1829_ -= anInt9472 * 1722112305;
	    i_1831_ -= 1722112305 * anInt9472;
	    i_1834_ -= 1722112305 * anInt9472;
	    class128.aBool1485
		= (i < 0 || i > class128.anInt1494 || i_1830_ < 0
		   || i_1830_ > class128.anInt1494 || i_1833_ < 0
		   || i_1833_ > class128.anInt1494);
	    int i_1841_ = i_1836_ >>> 24;
	    if (i_1839_ == 0 || 1 == i_1839_ && i_1841_ == 255) {
		class128.anInt1486 = 0;
		class128.aBool1483 = false;
		class128.method2243(bool, bool_1840_, false, (float) i_1829_,
				    (float) i_1831_, (float) i_1834_,
				    (float) i, (float) i_1830_,
				    (float) i_1833_, f, f_1832_, f_1835_,
				    i_1836_, i_1837_, i_1838_);
	    } else if (i_1839_ == 1) {
		class128.anInt1486 = 255 - i_1841_;
		class128.aBool1483 = false;
		class128.method2243(bool, bool_1840_, false, (float) i_1829_,
				    (float) i_1831_, (float) i_1834_,
				    (float) i, (float) i_1830_,
				    (float) i_1833_, f, f_1832_, f_1835_,
				    i_1836_, i_1837_, i_1838_);
	    } else if (2 == i_1839_) {
		class128.anInt1486 = 128;
		class128.aBool1483 = true;
		class128.method2243(bool, bool_1840_, false, (float) i_1829_,
				    (float) i_1831_, (float) i_1834_,
				    (float) i, (float) i_1830_,
				    (float) i_1833_, f, f_1832_, f_1835_,
				    i_1836_, i_1837_, i_1838_);
	    } else
		throw new IllegalArgumentException();
	    class128.aBool1482 = true;
	}
    }
    
    public void method3478(int i, int i_1842_, float f, int i_1843_,
			   int i_1844_, float f_1845_, int i_1846_,
			   int i_1847_, float f_1848_, int i_1849_,
			   int i_1850_, int i_1851_, int i_1852_) {
	boolean bool = anIntArray9466 != null;
	boolean bool_1853_ = null != aFloatArray9469;
	if (bool || bool_1853_) {
	    Class110 class110 = method15223(Thread.currentThread());
	    Class128 class128 = class110.aClass128_1338;
	    class128.aBool1482 = false;
	    i -= 1988019027 * anInt9470;
	    i_1843_ -= anInt9470 * 1988019027;
	    i_1846_ -= 1988019027 * anInt9470;
	    i_1842_ -= anInt9472 * 1722112305;
	    i_1844_ -= 1722112305 * anInt9472;
	    i_1847_ -= 1722112305 * anInt9472;
	    class128.aBool1485
		= (i < 0 || i > class128.anInt1494 || i_1843_ < 0
		   || i_1843_ > class128.anInt1494 || i_1846_ < 0
		   || i_1846_ > class128.anInt1494);
	    int i_1854_ = i_1849_ >>> 24;
	    if (i_1852_ == 0 || 1 == i_1852_ && i_1854_ == 255) {
		class128.anInt1486 = 0;
		class128.aBool1483 = false;
		class128.method2243(bool, bool_1853_, false, (float) i_1842_,
				    (float) i_1844_, (float) i_1847_,
				    (float) i, (float) i_1843_,
				    (float) i_1846_, f, f_1845_, f_1848_,
				    i_1849_, i_1850_, i_1851_);
	    } else if (i_1852_ == 1) {
		class128.anInt1486 = 255 - i_1854_;
		class128.aBool1483 = false;
		class128.method2243(bool, bool_1853_, false, (float) i_1842_,
				    (float) i_1844_, (float) i_1847_,
				    (float) i, (float) i_1843_,
				    (float) i_1846_, f, f_1845_, f_1848_,
				    i_1849_, i_1850_, i_1851_);
	    } else if (2 == i_1852_) {
		class128.anInt1486 = 128;
		class128.aBool1483 = true;
		class128.method2243(bool, bool_1853_, false, (float) i_1842_,
				    (float) i_1844_, (float) i_1847_,
				    (float) i, (float) i_1843_,
				    (float) i_1846_, f, f_1845_, f_1848_,
				    i_1849_, i_1850_, i_1851_);
	    } else
		throw new IllegalArgumentException();
	    class128.aBool1482 = true;
	}
    }
    
    public void method3349() {
	anInt9485 = 0;
	anInt9486 = 0;
	anInt9487 = -1509371205 * anInt9494;
	anInt9488 = anInt9476 * 16055143;
	method15173();
    }
    
    public void method3496(float f, float f_1855_, float f_1856_, float[] fs) {
	float f_1857_ = (aClass435_9483.aFloatArray4830[11] * f_1856_
			 + (aClass435_9483.aFloatArray4830[3] * f
			    + aClass435_9483.aFloatArray4830[15]
			    + f_1855_ * aClass435_9483.aFloatArray4830[7]));
	float f_1858_ = (aClass435_9483.aFloatArray4830[8] * f_1856_
			 + (aClass435_9483.aFloatArray4830[4] * f_1855_
			    + (aClass435_9483.aFloatArray4830[0] * f
			       + aClass435_9483.aFloatArray4830[12])));
	float f_1859_ = (aClass435_9483.aFloatArray4830[9] * f_1856_
			 + (aClass435_9483.aFloatArray4830[5] * f_1855_
			    + (aClass435_9483.aFloatArray4830[13]
			       + aClass435_9483.aFloatArray4830[1] * f)));
	float f_1860_ = (aClass435_9467.aFloatArray4830[10] * f_1856_
			 + (aClass435_9467.aFloatArray4830[2] * f
			    + aClass435_9467.aFloatArray4830[14]
			    + f_1855_ * aClass435_9467.aFloatArray4830[6]));
	fs[0] = aFloat9495 + aFloat9489 * f_1858_ / f_1857_;
	fs[1] = aFloat9492 + aFloat9491 * f_1859_ / f_1857_;
	fs[2] = f_1860_;
    }
    
    public void method3481(float f, float f_1861_, float f_1862_, float[] fs) {
	float f_1863_ = (aClass435_9483.aFloatArray4830[11] * f_1862_
			 + (aClass435_9483.aFloatArray4830[3] * f
			    + aClass435_9483.aFloatArray4830[15]
			    + f_1861_ * aClass435_9483.aFloatArray4830[7]));
	float f_1864_ = (aClass435_9483.aFloatArray4830[8] * f_1862_
			 + (aClass435_9483.aFloatArray4830[4] * f_1861_
			    + (aClass435_9483.aFloatArray4830[0] * f
			       + aClass435_9483.aFloatArray4830[12])));
	float f_1865_ = (aClass435_9483.aFloatArray4830[9] * f_1862_
			 + (aClass435_9483.aFloatArray4830[5] * f_1861_
			    + (aClass435_9483.aFloatArray4830[13]
			       + aClass435_9483.aFloatArray4830[1] * f)));
	float f_1866_ = (aClass435_9467.aFloatArray4830[10] * f_1862_
			 + (aClass435_9467.aFloatArray4830[2] * f
			    + aClass435_9467.aFloatArray4830[14]
			    + f_1861_ * aClass435_9467.aFloatArray4830[6]));
	fs[0] = aFloat9495 + aFloat9489 * f_1864_ / f_1863_;
	fs[1] = aFloat9492 + aFloat9491 * f_1865_ / f_1863_;
	fs[2] = f_1866_;
    }
    
    public void method3482(float f, float f_1867_, float f_1868_, float[] fs) {
	float f_1869_ = (aClass435_9483.aFloatArray4830[14]
			 + aClass435_9483.aFloatArray4830[2] * f
			 + aClass435_9483.aFloatArray4830[6] * f_1867_
			 + f_1868_ * aClass435_9483.aFloatArray4830[10]);
	float f_1870_ = (f_1867_ * aClass435_9483.aFloatArray4830[7]
			 + (aClass435_9483.aFloatArray4830[15]
			    + aClass435_9483.aFloatArray4830[3] * f)
			 + f_1868_ * aClass435_9483.aFloatArray4830[11]);
	if (f_1869_ < -f_1870_ || f_1869_ > f_1870_) {
	    float[] fs_1871_ = fs;
	    float[] fs_1872_ = fs;
	    fs[2] = Float.NaN;
	    fs_1872_[1] = Float.NaN;
	    fs_1871_[0] = Float.NaN;
	} else {
	    float f_1873_ = (f_1867_ * aClass435_9483.aFloatArray4830[4]
			     + (aClass435_9483.aFloatArray4830[12]
				+ f * aClass435_9483.aFloatArray4830[0])
			     + f_1868_ * aClass435_9483.aFloatArray4830[8]);
	    if (f_1873_ < -f_1870_ || f_1873_ > f_1870_) {
		float[] fs_1874_ = fs;
		float[] fs_1875_ = fs;
		fs[2] = Float.NaN;
		fs_1875_[1] = Float.NaN;
		fs_1874_[0] = Float.NaN;
	    } else {
		float f_1876_
		    = (f_1868_ * aClass435_9483.aFloatArray4830[9]
		       + (f * aClass435_9483.aFloatArray4830[1]
			  + aClass435_9483.aFloatArray4830[13]
			  + f_1867_ * aClass435_9483.aFloatArray4830[5]));
		if (f_1876_ < -f_1870_ || f_1876_ > f_1870_) {
		    float[] fs_1877_ = fs;
		    float[] fs_1878_ = fs;
		    fs[2] = Float.NaN;
		    fs_1878_[1] = Float.NaN;
		    fs_1877_[0] = Float.NaN;
		} else {
		    float f_1879_
			= (aClass435_9467.aFloatArray4830[14]
			   + f * aClass435_9467.aFloatArray4830[2]
			   + f_1867_ * aClass435_9467.aFloatArray4830[6]
			   + aClass435_9467.aFloatArray4830[10] * f_1868_);
		    fs[0] = aFloat9495 + aFloat9489 * f_1873_ / f_1870_;
		    fs[1] = aFloat9492 + f_1876_ * aFloat9491 / f_1870_;
		    fs[2] = f_1879_;
		}
	    }
	}
    }
    
    public Class168_Sub2 method3483() {
	return new Class168_Sub2_Sub1(this);
    }
    
    public Class168_Sub2 method3484() {
	return new Class168_Sub2_Sub1(this);
    }
    
    public Class168_Sub2 method3485() {
	return new Class168_Sub2_Sub1(this);
    }
    
    public boolean method3457() {
	return false;
    }
    
    public boolean method3268() {
	return true;
    }
    
    Interface21 method15225(int i, int i_1880_) {
	return new Class97(i, i_1880_);
    }
    
    public void method3420(Class185 class185) {
	method15229(null != anIntArray9466, null != aFloatArray9469, false,
		    class185);
    }
    
    boolean method15226() {
	return aBool9501;
    }
    
    public Interface21 method3487(int i, int i_1881_, Class165 class165,
				  Class178 class178, int i_1882_) {
	return method15183(i, i_1881_);
    }
    
    public Interface22 method3488(int i, int i_1883_, int i_1884_) {
	return new HashTable(i, i_1883_);
    }
    
    public Interface22 method3489(int i, int i_1885_, int i_1886_) {
	return new HashTable(i, i_1885_);
    }
    
    public void method3377(int i, int i_1887_, int i_1888_, int i_1889_,
			   int i_1890_, int i_1891_, Class152 class152,
			   int i_1892_, int i_1893_, int i_1894_, int i_1895_,
			   int i_1896_) {
	if (null != anIntArray9466) {
	    Class152_Sub1 class152_sub1 = (Class152_Sub1) class152;
	    int[] is = class152_sub1.anIntArray8998;
	    int[] is_1897_ = class152_sub1.anIntArray8997;
	    int i_1898_ = (anInt9472 * 1722112305 > i_1893_
			   ? 1722112305 * anInt9472 : i_1893_);
	    int i_1899_ = (1920901985 * anInt9473 < is.length + i_1893_
			   ? anInt9473 * 1920901985 : i_1893_ + is.length);
	    i_1896_ <<= 8;
	    i_1894_ <<= 8;
	    i_1895_ <<= 8;
	    int i_1900_ = i_1895_ + i_1894_;
	    i_1896_ %= i_1900_;
	    i_1888_ -= i;
	    i_1889_ -= i_1887_;
	    if (i_1888_ + i_1889_ < 0) {
		int i_1901_ = (int) (Math.sqrt((double) (i_1888_ * i_1888_
							 + i_1889_ * i_1889_))
				     * 256.0);
		int i_1902_ = i_1901_ % i_1900_;
		i_1896_ = i_1900_ + i_1894_ - i_1896_ - i_1902_;
		i_1896_ %= i_1900_;
		if (i_1896_ < 0)
		    i_1896_ += i_1900_;
		i += i_1888_;
		i_1888_ = -i_1888_;
		i_1887_ += i_1889_;
		i_1889_ = -i_1889_;
	    }
	    if (i_1888_ > i_1889_) {
		i_1887_ <<= 16;
		i_1887_ += 32768;
		i_1889_ <<= 16;
		int i_1903_ = (int) Math.floor(0.5 + ((double) i_1889_
						      / (double) i_1888_));
		i_1888_ += i;
		int i_1904_ = i_1890_ >>> 24;
		int i_1905_
		    = (int) Math.sqrt((double) (65536
						+ (i_1903_ >> 8) * (i_1903_
								    >> 8)));
		if (0 == i_1891_ || i_1891_ == 1 && i_1904_ == 255) {
		    while (i <= i_1888_) {
			int i_1906_ = i_1887_ >> 16;
			int i_1907_ = i_1906_ - i_1893_;
			if (i >= 1988019027 * anInt9470
			    && i < -466178451 * anInt9499 && i_1906_ >= i_1898_
			    && i_1906_ < i_1899_ && i_1896_ < i_1894_) {
			    int i_1908_ = is[i_1907_] + i_1892_;
			    if (i >= i_1908_
				&& i < i_1908_ + is_1897_[i_1907_])
				anIntArray9466[i_1906_ * (-476035351
							  * anInt9494) + i]
				    = i_1890_;
			}
			i_1887_ += i_1903_;
			i++;
			i_1896_ += i_1905_;
			i_1896_ %= i_1900_;
		    }
		} else if (1 == i_1891_) {
		    i_1890_
			= ((i_1904_ << 24)
			   + ((i_1904_ * (i_1890_ & 0xff00ff) >> 8 & 0xff00ff)
			      + ((i_1890_ & 0xff00) * i_1904_ >> 8 & 0xff00)));
		    int i_1909_ = 256 - i_1904_;
		    while (i <= i_1888_) {
			int i_1910_ = i_1887_ >> 16;
			int i_1911_ = i_1910_ - i_1893_;
			if (i >= 1988019027 * anInt9470
			    && i < anInt9499 * -466178451 && i_1910_ >= i_1898_
			    && i_1910_ < i_1899_ && i_1896_ < i_1894_) {
			    int i_1912_ = i_1892_ + is[i_1911_];
			    if (i >= i_1912_
				&& i < is_1897_[i_1911_] + i_1912_) {
				int i_1913_
				    = i + i_1910_ * (anInt9494 * -476035351);
				int i_1914_ = anIntArray9466[i_1913_];
				i_1914_ = (((i_1914_ & 0xff00ff) * i_1909_ >> 8
					    & 0xff00ff)
					   + (i_1909_ * (i_1914_ & 0xff00) >> 8
					      & 0xff00));
				anIntArray9466[i_1913_] = i_1890_ + i_1914_;
			    }
			}
			i_1887_ += i_1903_;
			i++;
			i_1896_ += i_1905_;
			i_1896_ %= i_1900_;
		    }
		} else if (i_1891_ == 2) {
		    while (i <= i_1888_) {
			int i_1915_ = i_1887_ >> 16;
			int i_1916_ = i_1915_ - i_1893_;
			if (i >= 1988019027 * anInt9470
			    && i < anInt9499 * -466178451 && i_1915_ >= i_1898_
			    && i_1915_ < i_1899_ && i_1896_ < i_1894_) {
			    int i_1917_ = i_1892_ + is[i_1916_];
			    if (i >= i_1917_
				&& i < i_1917_ + is_1897_[i_1916_]) {
				int i_1918_
				    = i + -476035351 * anInt9494 * i_1915_;
				int i_1919_ = anIntArray9466[i_1918_];
				int i_1920_ = i_1890_ + i_1919_;
				int i_1921_ = ((i_1890_ & 0xff00ff)
					       + (i_1919_ & 0xff00ff));
				i_1919_ = ((i_1920_ - i_1921_ & 0x10000)
					   + (i_1921_ & 0x1000100));
				anIntArray9466[i_1918_]
				    = i_1920_ - i_1919_ | i_1919_ - (i_1919_
								     >>> 8);
			    }
			}
			i_1887_ += i_1903_;
			i++;
			i_1896_ += i_1905_;
			i_1896_ %= i_1900_;
		    }
		} else
		    throw new IllegalArgumentException();
	    } else {
		i <<= 16;
		i += 32768;
		i_1888_ <<= 16;
		int i_1922_
		    = (int) Math.floor((double) i_1888_ / (double) i_1889_
				       + 0.5);
		int i_1923_
		    = (int) Math.sqrt((double) ((i_1922_ >> 8) * (i_1922_ >> 8)
						+ 65536));
		i_1889_ += i_1887_;
		int i_1924_ = i_1890_ >>> 24;
		if (0 == i_1891_ || i_1891_ == 1 && i_1924_ == 255) {
		    while (i_1887_ <= i_1889_) {
			int i_1925_ = i >> 16;
			int i_1926_ = i_1887_ - i_1893_;
			if (i_1887_ >= i_1898_ && i_1887_ < i_1899_
			    && i_1925_ >= 1988019027 * anInt9470
			    && i_1925_ < -466178451 * anInt9499
			    && i_1896_ < i_1894_
			    && i_1925_ >= is[i_1926_] + i_1892_
			    && (i_1925_
				< is[i_1926_] + i_1892_ + is_1897_[i_1926_]))
			    anIntArray9466[i_1925_ + (-476035351 * anInt9494
						      * i_1887_)]
				= i_1890_;
			i += i_1922_;
			i_1887_++;
			i_1896_ += i_1923_;
			i_1896_ %= i_1900_;
		    }
		} else if (i_1891_ == 1) {
		    i_1890_ = ((i_1924_ << 24)
			       + ((i_1924_ * (i_1890_ & 0xff00) >> 8 & 0xff00)
				  + ((i_1890_ & 0xff00ff) * i_1924_ >> 8
				     & 0xff00ff)));
		    int i_1927_ = 256 - i_1924_;
		    while (i_1887_ <= i_1889_) {
			int i_1928_ = i >> 16;
			int i_1929_ = i_1887_ - i_1893_;
			if (i_1887_ >= i_1898_ && i_1887_ < i_1899_
			    && i_1928_ >= 1988019027 * anInt9470
			    && i_1928_ < anInt9499 * -466178451
			    && i_1896_ < i_1894_
			    && i_1928_ >= is[i_1929_] + i_1892_
			    && (i_1928_
				< is[i_1929_] + i_1892_ + is_1897_[i_1929_])) {
			    int i_1930_
				= -476035351 * anInt9494 * i_1887_ + i_1928_;
			    int i_1931_ = anIntArray9466[i_1930_];
			    i_1931_ = ((i_1927_ * (i_1931_ & 0xff00ff) >> 8
					& 0xff00ff)
				       + ((i_1931_ & 0xff00) * i_1927_ >> 8
					  & 0xff00));
			    anIntArray9466[i_1928_ + (-476035351 * anInt9494
						      * i_1887_)]
				= i_1931_ + i_1890_;
			}
			i += i_1922_;
			i_1887_++;
			i_1896_ += i_1923_;
			i_1896_ %= i_1900_;
		    }
		} else if (2 == i_1891_) {
		    while (i_1887_ <= i_1889_) {
			int i_1932_ = i >> 16;
			int i_1933_ = i_1887_ - i_1893_;
			if (i_1887_ >= i_1898_ && i_1887_ < i_1899_
			    && i_1932_ >= 1988019027 * anInt9470
			    && i_1932_ < -466178451 * anInt9499
			    && i_1896_ < i_1894_
			    && i_1932_ >= is[i_1933_] + i_1892_
			    && (i_1932_
				< i_1892_ + is[i_1933_] + is_1897_[i_1933_])) {
			    int i_1934_
				= i_1887_ * (anInt9494 * -476035351) + i_1932_;
			    int i_1935_ = anIntArray9466[i_1934_];
			    int i_1936_ = i_1935_ + i_1890_;
			    int i_1937_
				= (i_1935_ & 0xff00ff) + (i_1890_ & 0xff00ff);
			    i_1935_
				= (i_1937_ & 0x1000100) + (i_1936_ - i_1937_
							   & 0x10000);
			    anIntArray9466[i_1934_]
				= i_1936_ - i_1935_ | i_1935_ - (i_1935_
								 >>> 8);
			}
			i += i_1922_;
			i_1887_++;
			i_1896_ += i_1923_;
			i_1896_ %= i_1900_;
		    }
		} else
		    throw new IllegalArgumentException();
	    }
	}
    }
    
    public Interface22 method3404(int i, int i_1938_, int i_1939_) {
	return new HashTable(i, i_1938_);
    }
    
    public void method3178() {
	aClass168_Sub2_9502 = null;
	aClass157_9477 = null;
    }
    
    public void method3537(int i, int i_1940_) {
	if ((i & 0x1) != 0)
	    method3151(0, 0, anInt9494 * -476035351, -1845137399 * anInt9476,
		       i_1940_, 0);
	if ((i & 0x2) != 0)
	    method15172();
    }
    
    public int method3333() {
	return -1;
    }
    
    void method3499(int i, int i_1941_, int i_1942_, int i_1943_,
		    int i_1944_) {
	if (anIntArray9466 != null
	    && (i >= anInt9470 * 1988019027 && i < anInt9499 * -466178451)) {
	    if (i_1941_ < anInt9472 * 1722112305) {
		i_1942_ -= 1722112305 * anInt9472 - i_1941_;
		i_1941_ = anInt9472 * 1722112305;
	    }
	    if (i_1942_ + i_1941_ > anInt9473 * 1920901985)
		i_1942_ = anInt9473 * 1920901985 - i_1941_;
	    int i_1945_ = i + i_1941_ * (anInt9494 * -476035351);
	    int i_1946_ = i_1943_ >>> 24;
	    if (0 == i_1944_ || i_1944_ == 1 && i_1946_ == 255) {
		for (int i_1947_ = 0; i_1947_ < i_1942_; i_1947_++)
		    anIntArray9466[i_1945_ + i_1947_ * (anInt9494
							* -476035351)]
			= i_1943_;
	    } else if (1 == i_1944_) {
		i_1943_ = (((i_1943_ & 0xff00ff) * i_1946_ >> 8 & 0xff00ff)
			   + ((i_1943_ & 0xff00) * i_1946_ >> 8 & 0xff00)
			   + (i_1946_ << 24));
		int i_1948_ = 256 - i_1946_;
		for (int i_1949_ = 0; i_1949_ < i_1942_; i_1949_++) {
		    int i_1950_ = -476035351 * anInt9494 * i_1949_ + i_1945_;
		    int i_1951_ = anIntArray9466[i_1950_];
		    i_1951_ = (((i_1951_ & 0xff00ff) * i_1948_ >> 8 & 0xff00ff)
			       + ((i_1951_ & 0xff00) * i_1948_ >> 8 & 0xff00));
		    anIntArray9466[i_1950_] = i_1943_ + i_1951_;
		}
	    } else if (i_1944_ == 2) {
		for (int i_1952_ = 0; i_1952_ < i_1942_; i_1952_++) {
		    int i_1953_ = i_1952_ * (anInt9494 * -476035351) + i_1945_;
		    int i_1954_ = anIntArray9466[i_1953_];
		    int i_1955_ = i_1943_ + i_1954_;
		    int i_1956_ = (i_1943_ & 0xff00ff) + (i_1954_ & 0xff00ff);
		    i_1954_ = (i_1956_ & 0x1000100) + (i_1955_ - i_1956_
						       & 0x10000);
		    anIntArray9466[i_1953_]
			= i_1955_ - i_1954_ | i_1954_ - (i_1954_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    public Class157 method3500(int[] is, int i, int i_1957_, int i_1958_,
			       int i_1959_, boolean bool) {
	boolean bool_1960_ = false;
	int i_1961_ = i;
    while_145_:
	for (int i_1962_ = 0; i_1962_ < i_1959_; i_1962_++) {
	    for (int i_1963_ = 0; i_1963_ < i_1958_; i_1963_++) {
		int i_1964_ = is[i_1961_++] >>> 24;
		if (i_1964_ != 0 && i_1964_ != 255) {
		    bool_1960_ = true;
		    break while_145_;
		}
	    }
	}
	if (bool_1960_)
	    return new Class157_Sub1_Sub3(this, is, i, i_1957_, i_1958_,
					  i_1959_, bool);
	return new Class157_Sub1_Sub2(this, is, i, i_1957_, i_1958_, i_1959_,
				      bool);
    }
    
    public Class157 method3501(int[] is, int i, int i_1965_, int i_1966_,
			       int i_1967_, boolean bool) {
	boolean bool_1968_ = false;
	int i_1969_ = i;
    while_146_:
	for (int i_1970_ = 0; i_1970_ < i_1967_; i_1970_++) {
	    for (int i_1971_ = 0; i_1971_ < i_1966_; i_1971_++) {
		int i_1972_ = is[i_1969_++] >>> 24;
		if (i_1972_ != 0 && i_1972_ != 255) {
		    bool_1968_ = true;
		    break while_146_;
		}
	    }
	}
	if (bool_1968_)
	    return new Class157_Sub1_Sub3(this, is, i, i_1965_, i_1966_,
					  i_1967_, bool);
	return new Class157_Sub1_Sub2(this, is, i, i_1965_, i_1966_, i_1967_,
				      bool);
    }
    
    void method15227(boolean bool, boolean bool_1973_, boolean bool_1974_,
		     Class531_Sub5_Sub1 class531_sub5_sub1, int i, int i_1975_,
		     float f, int i_1976_) {
	int i_1977_ = class531_sub5_sub1.anInt11735;
	int i_1978_ = i_1976_;
	i_1976_ <<= 1;
	if (i_1977_ == -1)
	    method15180(bool_1973_, i, i_1975_, f, i_1978_,
			class531_sub5_sub1.anInt11737, 1);
	else {
	    if (-197284279 * anInt9500 != i_1977_) {
		Class157 class157
		    = (Class157) aClass200_9490.method3785((long) i_1977_);
		if (class157 == null) {
		    TextureMetrics class166
			= aClass180_1944.method3116(i_1977_, -1431554601);
		    int[] is = method15165(i_1977_);
		    if (is != null) {
			int i_1979_ = class166.bitLoad * 2082667437;
			class157 = method3215(is, 0, i_1979_, i_1979_, i_1979_,
					      (byte) 52);
			aClass200_9490.method3788(class157, (long) i_1977_);
		    } else
			return;
		}
		anInt9500 = i_1977_ * -1648253959;
		aClass157_9493 = class157;
	    }
	    i_1976_++;
	    ((Class157_Sub1) aClass157_9493).method14537
		(bool, bool_1973_, bool_1974_, i - i_1978_, i_1975_ - i_1978_,
		 f, i_1976_, i_1976_, 0, class531_sub5_sub1.anInt11737, 1, 1,
		 false);
	}
    }
    
    void method3369(int i, int i_1980_, int i_1981_, int i_1982_,
		    int i_1983_) {
	if (anIntArray9466 != null && (i_1980_ >= anInt9472 * 1722112305
				       && i_1980_ < 1920901985 * anInt9473)) {
	    if (i < anInt9470 * 1988019027) {
		i_1981_ -= anInt9470 * 1988019027 - i;
		i = anInt9470 * 1988019027;
	    }
	    if (i_1981_ + i > -466178451 * anInt9499)
		i_1981_ = anInt9499 * -466178451 - i;
	    int i_1984_ = i + i_1980_ * (-476035351 * anInt9494);
	    int i_1985_ = i_1982_ >>> 24;
	    if (0 == i_1983_ || i_1983_ == 1 && i_1985_ == 255) {
		for (int i_1986_ = 0; i_1986_ < i_1981_; i_1986_++)
		    anIntArray9466[i_1984_ + i_1986_] = i_1982_;
	    } else if (1 == i_1983_) {
		i_1982_
		    = ((i_1985_ << 24)
		       + (((i_1982_ & 0xff00) * i_1985_ >> 8 & 0xff00)
			  + ((i_1982_ & 0xff00ff) * i_1985_ >> 8 & 0xff00ff)));
		int i_1987_ = 256 - i_1985_;
		for (int i_1988_ = 0; i_1988_ < i_1981_; i_1988_++) {
		    int i_1989_ = anIntArray9466[i_1984_ + i_1988_];
		    i_1989_
			= ((i_1987_ * (i_1989_ & 0xff00) >> 8 & 0xff00)
			   + (i_1987_ * (i_1989_ & 0xff00ff) >> 8 & 0xff00ff));
		    anIntArray9466[i_1984_ + i_1988_] = i_1989_ + i_1982_;
		}
	    } else if (i_1983_ == 2) {
		for (int i_1990_ = 0; i_1990_ < i_1981_; i_1990_++) {
		    int i_1991_ = anIntArray9466[i_1984_ + i_1990_];
		    int i_1992_ = i_1982_ + i_1991_;
		    int i_1993_ = (i_1991_ & 0xff00ff) + (i_1982_ & 0xff00ff);
		    i_1991_ = (i_1993_ & 0x1000100) + (i_1992_ - i_1993_
						       & 0x10000);
		    anIntArray9466[i_1990_ + i_1984_]
			= i_1992_ - i_1991_ | i_1991_ - (i_1991_ >>> 8);
		}
	    } else
		throw new IllegalArgumentException();
	}
    }
    
    Interface21 method15228(int i, int i_1994_) {
	return new Class97(i, i_1994_);
    }
    
    public Class157 method3504(int[] is, int i, int i_1995_, int i_1996_,
			       int i_1997_, boolean bool) {
	boolean bool_1998_ = false;
	int i_1999_ = i;
    while_147_:
	for (int i_2000_ = 0; i_2000_ < i_1997_; i_2000_++) {
	    for (int i_2001_ = 0; i_2001_ < i_1996_; i_2001_++) {
		int i_2002_ = is[i_1999_++] >>> 24;
		if (i_2002_ != 0 && i_2002_ != 255) {
		    bool_1998_ = true;
		    break while_147_;
		}
	    }
	}
	if (bool_1998_)
	    return new Class157_Sub1_Sub3(this, is, i, i_1995_, i_1996_,
					  i_1997_, bool);
	return new Class157_Sub1_Sub2(this, is, i, i_1995_, i_1996_, i_1997_,
				      bool);
    }
    
    public void method3506(int i, Class176 class176) {
	for (int i_2003_ = 0; i_2003_ < aClass110Array9496.length; i_2003_++) {
	    aClass110Array9496[i_2003_].anInt1331
		= 1528073863 * aClass110Array9496[i_2003_].anInt1330;
	    aClass110Array9496[i_2003_].anInt1362 = i * -1334076343;
	    aClass110Array9496[i_2003_].anInt1330
		= 38100277 * class176.anInt1877;
	    aClass110Array9496[i_2003_].anInt1361
		= 1852975569 * class176.anInt1879;
	    aClass110Array9496[i_2003_].aBool1332 = true;
	}
    }
    
    public void method3507(int i, int i_2004_, int i_2005_) {
	for (int i_2006_ = 0; i_2006_ < aClass110Array9496.length; i_2006_++) {
	    Class110 class110 = aClass110Array9496[i_2006_];
	    class110.anInt1330 = 1497980251 * (i & 0xffffff);
	    int i_2007_ = 296717011 * class110.anInt1330 >>> 16 & 0xff;
	    if (i_2007_ < 2)
		i_2007_ = 2;
	    int i_2008_ = class110.anInt1330 * 296717011 >> 8 & 0xff;
	    if (i_2008_ < 2)
		i_2008_ = 2;
	    int i_2009_ = class110.anInt1330 * 296717011 & 0xff;
	    if (i_2009_ < 2)
		i_2009_ = 2;
	    class110.anInt1330
		= 1497980251 * (i_2007_ << 16 | i_2008_ << 8 | i_2009_);
	    if (i_2004_ < 0)
		class110.aBool1369 = false;
	    else
		class110.aBool1369 = true;
	}
    }
    
    public void method3538(int i, int i_2010_, int i_2011_, int i_2012_) {
	/* empty */
    }
    
    public void method3509(int i, int i_2013_, int i_2014_, int i_2015_) {
	/* empty */
    }
    
    void method15229(boolean bool, boolean bool_2016_, boolean bool_2017_,
		     Class185 class185) {
	Class110 class110 = method15223(Thread.currentThread());
	for (Class531_Sub5_Sub1 class531_sub5_sub1
		 = ((Class531_Sub5_Sub1)
		    class185.aClass698_2081.method14217(34161));
	     null != class531_sub5_sub1;
	     class531_sub5_sub1
		 = ((Class531_Sub5_Sub1)
		    class185.aClass698_2081.method14221(-913253295))) {
	    int i = class531_sub5_sub1.anInt11731 >> 12;
	    int i_2018_ = class531_sub5_sub1.anInt11729 >> 12;
	    int i_2019_ = class531_sub5_sub1.anInt11730 >> 12;
	    float f
		= ((float) i_2019_ * aClass435_9483.aFloatArray4830[10]
		   + (aClass435_9483.aFloatArray4830[2] * (float) i
		      + aClass435_9483.aFloatArray4830[6] * (float) i_2018_)
		   + aClass435_9483.aFloatArray4830[14]);
	    float f_2020_
		= (aClass435_9483.aFloatArray4830[15]
		   + (aClass435_9483.aFloatArray4830[11] * (float) i_2019_
		      + ((float) i * aClass435_9483.aFloatArray4830[3]
			 + ((float) i_2018_
			    * aClass435_9483.aFloatArray4830[7]))));
	    if (!(f < -f_2020_)) {
		float f_2021_ = aFloat9498 + f * aFloat9480 / f_2020_;
		if (!(f > class110.aFloat1328)) {
		    float f_2022_
			= (aClass435_9483.aFloatArray4830[12]
			   + ((float) i * aClass435_9483.aFloatArray4830[0]
			      + ((float) i_2018_
				 * aClass435_9483.aFloatArray4830[4])
			      + (aClass435_9483.aFloatArray4830[8]
				 * (float) i_2019_)));
		    float f_2023_
			= ((float) i_2019_ * aClass435_9483.aFloatArray4830[9]
			   + ((aClass435_9483.aFloatArray4830[5]
			       * (float) i_2018_)
			      + aClass435_9483.aFloatArray4830[1] * (float) i)
			   + aClass435_9483.aFloatArray4830[13]);
		    if (!(f_2022_ < -f_2020_) && !(f_2022_ > f_2020_)
			&& !(f_2023_ < -f_2020_) && !(f_2023_ > f_2020_)) {
			float f_2024_
			    = (float) class531_sub5_sub1.anInt11734 / 4096.0F;
			float f_2025_
			    = (aClass435_9482.aFloatArray4830[0] * f_2024_
			       + f_2022_);
			float f_2026_
			    = (f_2024_ * aClass435_9482.aFloatArray4830[3]
			       + f_2020_);
			float f_2027_
			    = aFloat9495 + f_2022_ * aFloat9489 / f_2020_;
			float f_2028_
			    = f_2023_ * aFloat9491 / f_2020_ + aFloat9492;
			float f_2029_
			    = aFloat9495 + aFloat9489 * f_2025_ / f_2026_;
			method15197(bool, bool_2016_, bool_2017_,
				    class531_sub5_sub1, (int) f_2027_,
				    (int) f_2028_, f_2021_,
				    (int) (f_2029_ < f_2027_
					   ? f_2027_ - f_2029_
					   : f_2029_ - f_2027_));
		    }
		}
	    }
	}
    }
    
    public Interface22 method3511(int i, int i_2030_) {
	return new HashTable(i, i_2030_);
    }
    
    public Interface22 method3512(int i, int i_2031_) {
	return new HashTable(i, i_2031_);
    }
    
    public void method3551(int i, int i_2032_, int i_2033_, int i_2034_) {
	anInt9485 = 878748845 * i;
	anInt9486 = i_2032_ * -40344083;
	anInt9487 = i_2033_ * -888844797;
	anInt9488 = 1674120175 * i_2034_;
	method15173();
    }
}
