/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Class172 implements Interface24
{
    static int[] anIntArray1859;
    static double aDouble1860 = -1.0;
    static Class458 aClass458_1861;
    
    int[] method2740(Class593 class593, int i, double d) {
	byte[] is = method2741(class593, i, -2095421388);
	if (is == null)
	    return null;
	int[] is_0_;
	try {
	    byte i_1_ = (byte) (is[0] & 0xff);
	    if (class593 == Class593.aClass593_7830) {
		if (6 != i_1_)
		    return null;
		int[] is_2_ = null;
		int i_3_ = 1;
		for (int i_4_ = 0; i_4_ < 6; i_4_++) {
		    int i_5_
			= ((is[i_3_] & 0xff) << 24
			   | (is[i_3_ + 1] & 0xff) << 16
			   | (is[2 + i_3_] & 0xff) << 8 | is[3 + i_3_] & 0xff);
		    byte[] is_6_ = new byte[i_5_];
		    System.arraycopy(is, i_3_ + 4, is_6_, 0, i_5_);
		    int[] is_7_ = method2745(is_6_, false, -1205545153);
		    if (i_4_ == 0)
			is_2_ = new int[is_7_.length * 6];
		    System.arraycopy(is_7_, 0, is_2_, i_4_ * is_7_.length,
				     is_7_.length);
		    i_3_ += 4 + i_5_;
		}
		if (1.0 != d)
		    Class181.method3122(is_2_, d);
		return is_2_;
	    }
	    if (1 != i_1_)
		return null;
	    byte[] is_8_ = new byte[is.length - 5];
	    System.arraycopy(is, 5, is_8_, 0, is.length - 5);
	    int[] is_9_ = method2745(is_8_, false, 612760876);
	    if (is_9_ == null)
		return null;
	    if (1.0 != d)
		Class181.method3122(is_9_, d);
	    is_0_ = is_9_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is_0_;
    }
    
    abstract byte[] method2741(Class593 class593, int i, int i_10_);
    
    public abstract boolean method130(Class593 class593, int i,
				      Class594 class594, float f, int i_11_,
				      int i_12_, boolean bool, byte i_13_);
    
    int[] method2742(Class593 class593, int i, double d) {
	int[] is = method2743(class593, i, d);
	if (is == null)
	    return null;
	for (int i_14_ = 0; i_14_ < is.length; i_14_++) {
	    if ((is[i_14_] & 0xffffff) != 0)
		is[i_14_] = is[i_14_] | ~0xffffff;
	    else
		is[i_14_] = is[i_14_] & 0xffffff;
	}
	return is;
    }
    
    int[] method2743(Class593 class593, int i, double d) {
	byte[] is = method2741(class593, i, -2145924637);
	if (is == null)
	    return null;
	int[] is_15_;
	try {
	    byte i_16_ = (byte) (is[0] & 0xff);
	    if (class593 == Class593.aClass593_7830) {
		if (6 != i_16_)
		    return null;
		int[] is_17_ = null;
		int i_18_ = 1;
		for (int i_19_ = 0; i_19_ < 6; i_19_++) {
		    int i_20_ = ((is[i_18_] & 0xff) << 24
				 | (is[i_18_ + 1] & 0xff) << 16
				 | (is[2 + i_18_] & 0xff) << 8
				 | is[3 + i_18_] & 0xff);
		    byte[] is_21_ = new byte[i_20_];
		    System.arraycopy(is, i_18_ + 4, is_21_, 0, i_20_);
		    int[] is_22_ = method2745(is_21_, false, 520038307);
		    if (i_19_ == 0)
			is_17_ = new int[is_22_.length * 6];
		    System.arraycopy(is_22_, 0, is_17_, i_19_ * is_22_.length,
				     is_22_.length);
		    i_18_ += 4 + i_20_;
		}
		if (1.0 != d)
		    Class181.method3122(is_17_, d);
		return is_17_;
	    }
	    if (1 != i_16_)
		return null;
	    byte[] is_23_ = new byte[is.length - 5];
	    System.arraycopy(is, 5, is_23_, 0, is.length - 5);
	    int[] is_24_ = method2745(is_23_, false, 509979077);
	    if (is_24_ == null)
		return null;
	    if (1.0 != d)
		Class181.method3122(is_24_, d);
	    is_15_ = is_24_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is_15_;
    }
    
    float[] method2744(Class593 class593, int i, double d) {
	if (Class593.aClass593_7831 != class593)
	    return null;
	int[] is = method2743(class593, i, d);
	if (null == is)
	    return null;
	int[] is_25_ = null;
	byte[] is_26_ = method2741(Class593.aClass593_7829, i, -2117818858);
	if (null != is_26_) {
	    try {
		byte i_27_ = (byte) (is_26_[0] & 0xff);
		if (1 != i_27_)
		    return null;
		byte[] is_28_ = new byte[is_26_.length - 5];
		System.arraycopy(is_26_, 5, is_28_, 0, is_26_.length - 5);
		is_25_ = method2745(is_28_, false, 210172592);
		for (int i_29_ = 0; i_29_ < is_25_.length; i_29_++)
		    is_25_[i_29_] = is_25_[i_29_] & 0xff;
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (is_25_ == null)
	    is_25_ = new int[is.length];
	float[] fs = new float[4 * is.length];
	int i_30_ = 0;
	for (int i_31_ = 0; i_31_ < is.length; i_31_++) {
	    int i_32_ = is[i_31_];
	    int i_33_ = i_32_ >>> 24;
	    int i_34_ = (i_32_ & 0xff0000) >> 16;
	    int i_35_ = (i_32_ & 0xff00) >> 8;
	    int i_36_ = i_32_ & 0xff;
	    float f = (float) is_25_[i_31_] * 31.0F / 255.0F + 1.0F;
	    fs[i_30_++] = (float) i_34_ * f / 255.0F;
	    fs[i_30_++] = f * (float) i_35_ / 255.0F;
	    fs[i_30_++] = f * (float) i_36_ / 255.0F;
	    fs[i_30_++] = (float) i_33_ / 255.0F;
	}
	return fs;
    }
    
    int[] method2745(byte[] is, boolean bool, int i) throws IOException {
	BufferedImage bufferedimage
	    = ImageIO.read(new ByteArrayInputStream(is));
	if (null == bufferedimage)
	    return null;
	int[] is_37_ = Class652.method10775(bufferedimage, -1155485879);
	if (bool) {
	    for (int i_38_ = bufferedimage.getHeight() - 1; i_38_ >= 0;
		 i_38_--) {
		int i_39_ = i_38_ * bufferedimage.getWidth();
		for (int i_40_ = (i_38_ + 1) * bufferedimage.getWidth();
		     i_39_ < i_40_; i_39_++) {
		    i_40_--;
		    int i_41_ = is_37_[i_39_];
		    is_37_[i_39_] = is_37_[i_40_];
		    is_37_[i_40_] = i_41_;
		}
	    }
	}
	return is_37_;
    }
    
    public int[] method129(Class593 class593, int i, float f, int i_42_,
			   int i_43_, boolean bool, int i_44_) {
	return method2742(class593, i, (double) f);
    }
    
    public int[] method132(Class593 class593, int i, float f, int i_45_,
			   int i_46_, boolean bool, int i_47_) {
	return method2743(class593, i, (double) f);
    }
    
    public float[] method131(Class593 class593, int i, float f, int i_48_,
			     int i_49_, boolean bool, byte i_50_) {
	return method2744(class593, i, (double) f);
    }
    
    public int[] method136(Class593 class593, int i, float f, int i_51_,
			   int i_52_, boolean bool) {
	return method2742(class593, i, (double) f);
    }
    
    static {
	anIntArray1859 = new int[256];
    }
    
    public int[] method128(Class593 class593, int i, float f, int i_53_,
			   int i_54_, boolean bool) {
	return method2742(class593, i, (double) f);
    }
    
    abstract byte[] method2746(Class593 class593, int i);
    
    abstract byte[] method2747(Class593 class593, int i);
    
    Class172() {
	/* empty */
    }
    
    int[] method2748(Class593 class593, int i, double d) {
	int[] is = method2743(class593, i, d);
	if (is == null)
	    return null;
	for (int i_55_ = 0; i_55_ < is.length; i_55_++) {
	    if ((is[i_55_] & 0xffffff) != 0)
		is[i_55_] = is[i_55_] | ~0xffffff;
	    else
		is[i_55_] = is[i_55_] & 0xffffff;
	}
	return is;
    }
    
    public void method134() {
	/* empty */
    }
    
    int[] method2749(Class593 class593, int i, double d) {
	byte[] is = method2741(class593, i, -2065090233);
	if (is == null)
	    return null;
	int[] is_56_;
	try {
	    byte i_57_ = (byte) (is[0] & 0xff);
	    if (class593 == Class593.aClass593_7830) {
		if (6 != i_57_)
		    return null;
		int[] is_58_ = null;
		int i_59_ = 1;
		for (int i_60_ = 0; i_60_ < 6; i_60_++) {
		    int i_61_ = ((is[i_59_] & 0xff) << 24
				 | (is[i_59_ + 1] & 0xff) << 16
				 | (is[2 + i_59_] & 0xff) << 8
				 | is[3 + i_59_] & 0xff);
		    byte[] is_62_ = new byte[i_61_];
		    System.arraycopy(is, i_59_ + 4, is_62_, 0, i_61_);
		    int[] is_63_ = method2745(is_62_, false, 1013791821);
		    if (i_60_ == 0)
			is_58_ = new int[is_63_.length * 6];
		    System.arraycopy(is_63_, 0, is_58_, i_60_ * is_63_.length,
				     is_63_.length);
		    i_59_ += 4 + i_61_;
		}
		if (1.0 != d)
		    Class181.method3122(is_58_, d);
		return is_58_;
	    }
	    if (1 != i_57_)
		return null;
	    byte[] is_64_ = new byte[is.length - 5];
	    System.arraycopy(is, 5, is_64_, 0, is.length - 5);
	    int[] is_65_ = method2745(is_64_, false, 1233910331);
	    if (is_65_ == null)
		return null;
	    if (1.0 != d)
		Class181.method3122(is_65_, d);
	    is_56_ = is_65_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is_56_;
    }
    
    abstract byte[] method2750(Class593 class593, int i);
    
    int[] method2751(Class593 class593, int i, double d) {
	byte[] is = method2741(class593, i, -2046099488);
	if (is == null)
	    return null;
	int[] is_66_;
	try {
	    byte i_67_ = (byte) (is[0] & 0xff);
	    if (class593 == Class593.aClass593_7830) {
		if (6 != i_67_)
		    return null;
		int[] is_68_ = null;
		int i_69_ = 1;
		for (int i_70_ = 0; i_70_ < 6; i_70_++) {
		    int i_71_ = ((is[i_69_] & 0xff) << 24
				 | (is[i_69_ + 1] & 0xff) << 16
				 | (is[2 + i_69_] & 0xff) << 8
				 | is[3 + i_69_] & 0xff);
		    byte[] is_72_ = new byte[i_71_];
		    System.arraycopy(is, i_69_ + 4, is_72_, 0, i_71_);
		    int[] is_73_ = method2745(is_72_, false, 177113330);
		    if (i_70_ == 0)
			is_68_ = new int[is_73_.length * 6];
		    System.arraycopy(is_73_, 0, is_68_, i_70_ * is_73_.length,
				     is_73_.length);
		    i_69_ += 4 + i_71_;
		}
		if (1.0 != d)
		    Class181.method3122(is_68_, d);
		return is_68_;
	    }
	    if (1 != i_67_)
		return null;
	    byte[] is_74_ = new byte[is.length - 5];
	    System.arraycopy(is, 5, is_74_, 0, is.length - 5);
	    int[] is_75_ = method2745(is_74_, false, -906087901);
	    if (is_75_ == null)
		return null;
	    if (1.0 != d)
		Class181.method3122(is_75_, d);
	    is_66_ = is_75_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is_66_;
    }
    
    public int[] method135(Class593 class593, int i, float f, int i_76_,
			   int i_77_, boolean bool) {
	return method2742(class593, i, (double) f);
    }
    
    public void method133(byte i) {
	/* empty */
    }
    
    public abstract boolean method140(Class593 class593, int i,
				      Class594 class594, float f, int i_78_,
				      int i_79_, boolean bool);
    
    public int[] method138(Class593 class593, int i, float f, int i_80_,
			   int i_81_, boolean bool) {
	return method2743(class593, i, (double) f);
    }
    
    public float[] method139(Class593 class593, int i, float f, int i_82_,
			     int i_83_, boolean bool) {
	return method2744(class593, i, (double) f);
    }
    
    int[] method2752(byte[] is, boolean bool) throws IOException {
	BufferedImage bufferedimage
	    = ImageIO.read(new ByteArrayInputStream(is));
	if (null == bufferedimage)
	    return null;
	int[] is_84_ = Class652.method10775(bufferedimage, -1538328545);
	if (bool) {
	    for (int i = bufferedimage.getHeight() - 1; i >= 0; i--) {
		int i_85_ = i * bufferedimage.getWidth();
		for (int i_86_ = (i + 1) * bufferedimage.getWidth();
		     i_85_ < i_86_; i_85_++) {
		    i_86_--;
		    int i_87_ = is_84_[i_85_];
		    is_84_[i_85_] = is_84_[i_86_];
		    is_84_[i_86_] = i_87_;
		}
	    }
	}
	return is_84_;
    }
    
    public float[] method137(Class593 class593, int i, float f, int i_88_,
			     int i_89_, boolean bool) {
	return method2744(class593, i, (double) f);
    }
    
    int[] method2753(byte[] is, boolean bool) throws IOException {
	BufferedImage bufferedimage
	    = ImageIO.read(new ByteArrayInputStream(is));
	if (null == bufferedimage)
	    return null;
	int[] is_90_ = Class652.method10775(bufferedimage, -667505117);
	if (bool) {
	    for (int i = bufferedimage.getHeight() - 1; i >= 0; i--) {
		int i_91_ = i * bufferedimage.getWidth();
		for (int i_92_ = (i + 1) * bufferedimage.getWidth();
		     i_91_ < i_92_; i_91_++) {
		    i_92_--;
		    int i_93_ = is_90_[i_91_];
		    is_90_[i_91_] = is_90_[i_92_];
		    is_90_[i_92_] = i_93_;
		}
	    }
	}
	return is_90_;
    }
    
    int[] method2754(byte[] is, boolean bool) throws IOException {
	BufferedImage bufferedimage
	    = ImageIO.read(new ByteArrayInputStream(is));
	if (null == bufferedimage)
	    return null;
	int[] is_94_ = Class652.method10775(bufferedimage, -883608336);
	if (bool) {
	    for (int i = bufferedimage.getHeight() - 1; i >= 0; i--) {
		int i_95_ = i * bufferedimage.getWidth();
		for (int i_96_ = (i + 1) * bufferedimage.getWidth();
		     i_95_ < i_96_; i_95_++) {
		    i_96_--;
		    int i_97_ = is_94_[i_95_];
		    is_94_[i_95_] = is_94_[i_96_];
		    is_94_[i_96_] = i_97_;
		}
	    }
	}
	return is_94_;
    }
    
    public static int[] method2755(BufferedImage bufferedimage) {
	if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
	    int[] is = null;
	    is = bufferedimage.getRaster().getPixels(0, 0,
						     bufferedimage.getWidth(),
						     bufferedimage.getHeight(),
						     is);
	    int[] is_98_
		= (new int
		   [bufferedimage.getWidth() * bufferedimage.getHeight()]);
	    if (bufferedimage.getType() == 10) {
		for (int i = 0; i < is_98_.length; i++)
		    is_98_[i]
			= (is[i] << 8) + (is[i] << 16) + is[i] + -16777216;
	    } else {
		for (int i = 0; i < is_98_.length; i++) {
		    int i_99_ = 2 * i;
		    is_98_[i] = ((is[i_99_ + 1] << 24) + is[i_99_]
				 + ((is[i_99_] << 16) + (is[i_99_] << 8)));
		}
	    }
	    return is_98_;
	}
	return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(),
				    bufferedimage.getHeight(), null, 0,
				    bufferedimage.getWidth());
    }
    
    static final void method2756(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_100_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_101_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class525_Sub27.method16377(i_100_, i_101_, true, false,
					 -520139882);
    }
    
    static final void method2757(Class683 class683, byte i) {
	int i_102_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aClass229_11119.method4356(i_102_, 2116659852)
		  .method3967(-562685374);
    }
    
    public static long method2758(int i, int i_103_, int i_104_, int i_105_,
				  int i_106_, int i_107_, int i_108_) {
	Class86.aCalendar888.clear();
	Class86.aCalendar888.set(i_107_, i_106_, i_105_, i_104_, i_103_, i);
	return Class86.aCalendar888.getTime().getTime();
    }
    
    static final void method2759(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class579.method9586(class259, class245, class683, 1740374903);
    }
    
    static Class610 method2760(int i, int i_109_) {
	Class610[] class610s = Class481.method7830((byte) 38);
	for (int i_110_ = 0; i_110_ < class610s.length; i_110_++) {
	    Class610 class610 = class610s[i_110_];
	    if (i == -539420765 * class610.anInt8010)
		return class610;
	}
	return null;
    }
}
